package com.method.rscd;

import com.method.rscd.cache.FileStore;
import com.method.rscd.cache.ReferenceTable;
import com.method.rscd.net.FileRequest;
import com.method.rscd.net.HttpWorker;
import com.method.rscd.net.Js5Worker;
import com.method.rscd.util.Crawler;
import com.method.rscd.util.Whirlpool;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.zip.CRC32;

/**
 * Coordinates downloading and saving of the cache from the server.
 */
public class CacheDownloader {

    private static final int JS5_WORKER_COUNT = Runtime.getRuntime().availableProcessors() * 2;
    private static final int HTTP_WORKER_COUNT = Runtime.getRuntime().availableProcessors();

    private static final int MAJOR_VERSION = 841;
    private static final int MINOR_VERSION = 1;
    private static final int WORLD = 2;
    private static final int LOBBY = 2;

    /**
     * Entry point for the application. This method creates a new CacheDownloader instance and runs it.
     *
     * @param args Arguments for the program
     */
    public static void main(String[] args) {
        File data = new File("./data/");
        if (!data.isDirectory() && !data.mkdir()) {
            throw new RuntimeException();
        }

        CacheDownloader downloader = new CacheDownloader();
        downloader.run();
    }

    private final BlockingQueue<FileRequest> requests = new LinkedBlockingQueue<>();
    private final BlockingQueue<FileRequest> completed = new LinkedBlockingQueue<>();

    private final ExecutorService netExecutor = Executors.newFixedThreadPool(JS5_WORKER_COUNT + HTTP_WORKER_COUNT);
    private final HttpWorker httpWorker = new HttpWorker("lobby" + LOBBY + ".runescape.com", netExecutor, completed);

    private ReferenceTable versionTable;
    private ReferenceTable[] tables;
    private ReferenceTable[] oldTables;

    private FileStore reference;
    private FileStore[] stores;

    private int totalRequestCount;

    /**
     * Initiates the connection to the server and downloads the cache.
     */
    public void run() {
        connect();
        downloadVersionTable();
        initCacheIndices(versionTable.getEntryCount());
        initOldTables();
        downloadNewTables();
        update();

        Thread saver = new Thread(() -> {
            CRC32 crc = new CRC32();
            int remaining = totalRequestCount, done = 0;
            while (!Thread.interrupted() && remaining-- > 0) {
                FileRequest request;
                try {
                    request = completed.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                int index = request.getIndex();
                ReferenceTable table = tables[index] != null ? tables[index] : oldTables[index];

                int file = request.getFile();
                ByteBuffer data = request.getBuffer();
                ReferenceTable.Entry entry = table.getEntry(file);

                crc.update(data.array(), 0, data.limit());
                if (entry.getCRC() != (int) crc.getValue()) {
                    throw new RuntimeException("CRC mismatch " + index + "," + file + "," + entry.getCRC() + " - " + (int) crc.getValue());
                }
                crc.reset();

                byte[] entryDigest = entry.getDigest();
                if (entryDigest != null) {
                    byte[] digest = Whirlpool.whirlpool(data.array(), 0, data.limit());
                    for (int j = 0; j < 64; j++) {
                        if (digest[j] != entryDigest[j]) {
                            throw new RuntimeException("Digest mismatch " + index + "," + file);
                        }
                    }
                }

                int version = entry.getVersion();
                data.position(data.limit()).limit(data.capacity());
                data.put((byte) (version >>> 8));
                data.put((byte) version);
                data.flip();

                stores[index].put(file, data, data.capacity());
//                System.out.println("Stored resource " + index + ", " + file + ": (" + done++ + " of " + totalRequestCount + ")");
            }
        });
        saver.start();

        netExecutor.shutdown();
        try {
            /* uh */
            netExecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            saver.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Connects to the server, retrying as needed if the version is incorrect.
     */
    private void connect() {
        String key = Crawler.extractParameter(Crawler.downloadPage("http://world" + WORLD + ".runescape.com/g=runescape/,j0"), 32);
        if (key == null) {
            System.err.println("Couldn't find valid handshake key.");
            System.exit(1);
        }

        for (int i = 0; i < JS5_WORKER_COUNT; i++) {
            Js5Worker worker = new Js5Worker(requests, completed);
            worker.connect("world" + WORLD + ".runescape.com", MAJOR_VERSION, MINOR_VERSION, key);

            while (worker.getState() != Js5Worker.State.CONNECTED) {
                worker.process();
            }

            netExecutor.submit(worker);
            System.out.println("Successful connection");
        }

    }

    /**
     * Downloads the version table from the server.
     */
    private void downloadVersionTable() {
        requests.offer(new FileRequest(255, 255));

        FileRequest mainRequest;
        try {
            mainRequest = completed.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        versionTable = new ReferenceTable(mainRequest.getBuffer());
    }

    /**
     * Reads the existing reference table data from the cache.
     */
    private void initOldTables() {
        oldTables = new ReferenceTable[reference.getFileCount()];
        for (int i = 0; i < oldTables.length; i++) {
            ByteBuffer data = reference.get(i);
            if (data != null) {
                oldTables[i] = new ReferenceTable(i, data, null);
            }
        }
    }

    /**
     * Finds reference tables that need updating.
     *
     * @return A list containing the reference tables that need updating.
     */
    private List<Integer> findTableChanges() {
        List<Integer> changes = new ArrayList<>();
        ReferenceTable.Entry[] entries = versionTable.getEntries();
        for (int i = 0; i < versionTable.getEntryCount(); i++) {
            ReferenceTable.Entry entry = entries[i];
            if (entry.getCRC() == 0 && entry.getVersion() == 0) {
                continue;
            }
            if (i >= oldTables.length) {
                changes.add(i);
            } else {
                ReferenceTable table = oldTables[i];
                if (table != null) {
                    int crc = table.getCRC(), version = table.getVersion();
                    if (crc != entry.getCRC() || version != entry.getVersion()) {
                        changes.add(i);
                    }
                } else {
                    changes.add(i);
                }
            }
        }

        return changes;
    }

    /**
     * Downloads the required reference tables.
     */
    private void downloadNewTables() {
        tables = new ReferenceTable[versionTable.getEntryCount()];

        List<Integer> changes = findTableChanges();
        for (int i : changes) {
            requests.offer(new FileRequest(255, i));
        }

        for (int i = 0; i < changes.size(); i++) {
            FileRequest request;
            try {
                request = completed.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int file = request.getFile();
            ByteBuffer data = request.getBuffer();
            tables[file] = new ReferenceTable(file, data, versionTable);

            data.position(0);
            reference.put(file, data, data.capacity());
        }
    }

    /**
     * Finds the files that need updating within a particular cache index.
     *
     * @param index The index of the cache to look through
     * @return A list containing the files that need to be updated.
     */
    private List<Integer> findFileChanges(int index) {
        System.out.println("Checking index " + index + " for changes");
        List<Integer> changes = new ArrayList<>();
        ReferenceTable.Entry tableEntry = versionTable.getEntries()[index];
        if (tableEntry.getCRC() == 0 && tableEntry.getVersion() == 0) {
            return null;
        }
        if (index >= stores.length && tables[index] != null) {
            ReferenceTable.Entry[] entries = tables[index].getEntries();
            for (int i = 0; i < tables[index].getEntryCount(); i++) {
                changes.add(entries[i].getIndex());
            }
        } else {
            CRC32 crc32 = new CRC32();
            ReferenceTable table = tables[index] != null || index >= oldTables.length ? tables[index] : oldTables[index];
            if (table == null) {
                return null;
            }

            ReferenceTable.Entry[] entries = table.getEntries();
            int entryCount = table.getEntryCount();
            for (int i = 0; i < entryCount; i++) {
                ReferenceTable.Entry entry = entries[i];
                int entryIndex = entry.getIndex();
                ByteBuffer buffer = stores[index].get(entryIndex);
                if (buffer == null) {
                    if (index != 14 || entryIndex != 0) {
                        changes.add(entryIndex);
                    }
                } else {
                    crc32.update(buffer.array(), 0, buffer.capacity() - 2);
                    int crc = (int) crc32.getValue();
                    crc32.reset();
                    if (crc != entry.getCRC()) {
                        changes.add(entryIndex);
                        continue;
                    }
                    buffer.position(buffer.capacity() - 2);
                    int version = buffer.getShort() & 0xffff;
                    if (version != (entry.getVersion() & 0xffff)) {
                        changes.add(entryIndex);
                    }
                }
            }
        }
        return changes;
    }

    /**
     * Downloads all of the files from each index in the cache.
     */
    private void update() {
        for (int i = 0; i < versionTable.getEntryCount(); i++) {
            List<Integer> changes = findFileChanges(i);
            if (changes == null || changes.size() == 0) {
                continue;
            }

            for (int file : changes) {
                FileRequest request = new FileRequest(i, file);
                if (i == 40) {
                    ReferenceTable table = tables[i] != null ? tables[i] : oldTables[i];
                    httpWorker.request(request, table.getEntry(file).getCRC(), table.getEntry(file).getVersion());
                } else {
                    requests.offer(request);
                }

                totalRequestCount++;
            }
        }
    }

    /**
     * Initializes the cache indices.
     *
     * @param count The number of indices
     */
    private void initCacheIndices(int count) {
        try {
            RandomAccessFile dataFile = new RandomAccessFile("./data/main_file_cache.dat2", "rw");
            RandomAccessFile referenceFile = new RandomAccessFile("./data/main_file_cache.idx255", "rw");
            reference = new FileStore(255, dataFile.getChannel(), referenceFile.getChannel(), 2000000);

            stores = new FileStore[count];
            for (int i = 0; i < count; i++) {
                RandomAccessFile indexFile = new RandomAccessFile("./data/main_file_cache.idx" + i, "rw");
                stores[i] = new FileStore(i, dataFile.getChannel(), indexFile.getChannel(), 10000000);
            }

        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }

}
