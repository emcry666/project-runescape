package com.method.rscd.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

public class HttpWorker {

    private final String host;
    private final ExecutorService executor;
    private final BlockingQueue<FileRequest> completed;

    public HttpWorker(String host, ExecutorService executor, BlockingQueue<FileRequest> completed) {
        this.host = host;
        this.executor = executor;
        this.completed = completed;
    }

    public void request(FileRequest request, int crc, int version) {
        executor.submit(new HttpTask(request, crc, version));
    }

    private class HttpTask implements Runnable {

        FileRequest request;
        int crc;
        int version;

        HttpTask(FileRequest request, int crc, int version) {
            this.request = request;
            this.crc = crc;
            this.version = version;
        }

        public void run() {
            URL url;
            try {
                url = new URL("http", host, 80, "/ms?m=0&a=" + request.getIndex() + "&g=" + request.getFile() + "&c=" + crc + "&v=" + version);
            } catch (MalformedURLException ex) {
                return;
            }

            InputStream is = null;
            try {
                URLConnection connection = url.openConnection();
                connection.setConnectTimeout(10000);
                connection.setReadTimeout(10000);
                is = connection.getInputStream();
//                System.out.println("Requested " + request.getIndex() + "," + request.getFile());

                byte[] data = new byte[1024];
                byte[] buf = new byte[1024];
                int size = 0;
                int read = 0;

                while (read >= 0) {
                    read = is.read(buf);
                    if (read > 0) {
                        if (read + size > data.length) {
                            byte[] copy = data;
                            data = new byte[size * 2];
                            System.arraycopy(copy, 0, data, 0, size);
                        }

                        System.arraycopy(buf, 0, data, size, read);
                        size += read;
                    }
                }

                request.setSize(size + 2);
                request.getBuffer().put(data, 0, size);
                request.getBuffer().flip();
                completed.offer(request);
            } catch (IOException ex) {
                System.out.println("Error downloading " + request.getIndex() + "," + request.getFile() + ": " + ex.getMessage());
                return;
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException ignored) {

                    }
                }
            }
        }
    }

}
