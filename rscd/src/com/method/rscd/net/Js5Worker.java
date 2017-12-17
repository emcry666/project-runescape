package com.method.rscd.net;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Manages the requesting of files from the game server.
 */
public class Js5Worker implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            process();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public enum State {
        DISCONNECTED, ERROR, OUTDATED, CONNECTING, CONNECTED
    }

    private final BlockingQueue<FileRequest> requests;
    private final BlockingQueue<FileRequest> completed;

    private Map<Long, FileRequest> waiting;
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private State state;
    private String host;
    private int major;
    private int minor;
    private String key;
    private FileRequest current;
    private long lastUpdate;
    private ByteBuffer outputBuffer;
    private ByteBuffer inputBuffer;

    /**
     * Creates a new Js5Worker instance.
     */
    public Js5Worker(BlockingQueue<FileRequest> requests, BlockingQueue<FileRequest> completed) {
        this.requests = requests;
        this.completed = completed;
        waiting = new HashMap<>();
        state = State.DISCONNECTED;
        outputBuffer = ByteBuffer.allocate(6);
        inputBuffer = ByteBuffer.allocate(5);
    }

    /**
     * Connects to the specified host on port 43594 and initiates the update protocol handshake.
     *
     * @param host  The world to connect to
     * @param major The client's major version
     * @param minor The client's minor version
     */
    public void connect(String host, int major, int minor, String key) {
        this.host = host;
        this.major = major;
        this.minor = minor;
        this.key = key;

        try {
            socket = new Socket(host, 43594);
            input = socket.getInputStream();
            output = socket.getOutputStream();

            ByteBuffer buffer = ByteBuffer.allocate(11 + 32);
            buffer.put((byte) 15);       // handshake type
            buffer.put((byte) (9 + 32)); // size
            buffer.putInt(major);        // client's major version
            buffer.putInt(minor);        // client's minor version?
            buffer.put(key.getBytes());  // handshake key?
            buffer.put((byte) 0);        // nul-byte (c string)
            output.write(buffer.array());
            output.flush();

            state = State.CONNECTING;
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }

    /**
     * Gets the current state of the requester.
     *
     * @return The requester's current state.
     */
    public State getState() {
        return state;
    }

    /**
     * Handles the bulk of the processing for the requester. This method uses the current state of the requester
     * to choose the correct action.
     * <p>
     * When connected, this method will send up to 20 requests to the server at one time, reading and processing
     * them as they are sent back from the server.
     */
    public void process() {
        if (state == State.CONNECTING) {
            try {
                if (input.available() > 0) {
                    int response = input.read();
                    if (response == 0) {
                        state = State.CONNECTED;
                        System.out.println("Correct version: " + major);

                        ByteBuffer sizes = ByteBuffer.allocate(25 * 4);
                        int read, off = 0, len = sizes.capacity();
                        while (len > 0) {
                            read = input.read(sizes.array(), off, len);
                            if (read <= 0) {
                                throw new EOFException();
                            }
                            off += read;
                            len -= read;
                        }

                        int end = sizes.capacity() / 4;
                        System.out.print("Required loading element sizes: ");
                        for (int i = 0; i < end; i++) {
                            System.out.print(sizes.getInt() + (i < end - 1 ? "," : ""));
                        }

                        System.out.println();

                        sendConnectionInfo();
                        lastUpdate = System.currentTimeMillis();
                    } else if (response == 6) {
                        state = State.OUTDATED;
                        System.out.println("Invalid version " + major + " " + minor + ", trying again");
                    } else {
                        state = State.ERROR;
                    }
                }
            } catch (IOException ioex) {
                throw new RuntimeException(ioex);
            }
        } else if (state == State.OUTDATED) {
            reset();
            connect(host, ++major, minor, key);
        } else if (state == State.ERROR) {
            throw new RuntimeException("Unexpected server response");
        } else if (state == State.DISCONNECTED) {
            reset();
            connect(host, major, minor, key);
        } else {
            if (lastUpdate != 0 && System.currentTimeMillis() - lastUpdate > 30000) {
                System.out.println("Server timeout, dropping connection");
                state = State.DISCONNECTED;
                return;
            }
            try {
                while (!requests.isEmpty() && waiting.size() < 20) {
                    FileRequest request = requests.poll();
                    outputBuffer.put(request.getIndex() == 255 ? (byte) 1 : (byte) 0);
                    outputBuffer.put((byte) request.getIndex());
                    outputBuffer.putInt(request.getFile());
                    output.write(outputBuffer.array());
                    output.flush();
                    outputBuffer.clear();

                    //                    System.out.println("Requested " + request.getIndex() + "," + request.getFile());
                    waiting.put(request.hash(), request);
                }
                for (int i = 0; i < 100; i++) {
                    int available = input.available();
                    if (available < 0) {
                        throw new IOException();
                    }
                    if (available == 0) {
                        break;
                    }
                    lastUpdate = System.currentTimeMillis();
                    if (current == null) {
                        if (available >= 5) {
                            inputBuffer.clear();
                            input.read(inputBuffer.array());
                            int index = inputBuffer.get() & 0xff;
                            int file = inputBuffer.getInt() & 0x7fffffff;
                            long hash = ((long) index << 32) | file;

                            current = waiting.get(hash);
                            if (current == null) {
                                throw new IOException();
                            }

                            current.setPosition(5);
                            inputBuffer.clear();
                        }
                    } else if (current.getBuffer() == null) {
                        if (available >= 5) {
                            input.read(inputBuffer.array());
                            int compression = inputBuffer.get() & 0xff;
                            int fileSize = inputBuffer.getInt();

                            int size = fileSize + (compression == 0 ? 5 : 9) + (current.getIndex() != 255 ? 2 : 0);
                            current.setSize(size);
                            ByteBuffer buffer = current.getBuffer();
                            buffer.put((byte) compression);
                            buffer.putInt(fileSize);

                            current.setPosition(10);
                            inputBuffer.clear();
                        }
                    } else {
                        ByteBuffer buffer = current.getBuffer();
                        int totalSize = buffer.capacity() - (current.getIndex() != 255 ? 2 : 0);
                        int blockSize = 512 - current.getPosition();
                        int remaining = totalSize - buffer.position();
                        if (remaining < blockSize) {
                            blockSize = remaining;
                        }
                        if (available < blockSize) {
                            blockSize = available;
                        }
                        int read = input.read(buffer.array(), buffer.position(), blockSize);
                        buffer.position(buffer.position() + read);
                        current.setPosition(current.getPosition() + read);
                        if (buffer.position() == totalSize) {
                            waiting.remove(current.hash());
                            buffer.flip();
                            completed.add(current);
                            current = null;
                        } else if (current.getPosition() == 512) {
                            current.setPosition(0);
                            current = null;
                        }
                    }
                }
            } catch (IOException ioex) {
                state = State.DISCONNECTED;
            }
        }
    }

    /**
     * Sends the initial connection status and login packets to the server. By default, this downloader
     * indicates that it is logged out.
     */
    private void sendConnectionInfo() {
        try {
            outputBuffer.put((byte) 6);
            putMedInt(outputBuffer, 3);
            outputBuffer.putShort((short) 0);
            output.write(outputBuffer.array());
            output.flush();
            outputBuffer.clear();

            outputBuffer.put((byte) 3);
            putMedInt(outputBuffer, 0);
            outputBuffer.putShort((short) 0);
            output.write(outputBuffer.array());
            output.flush();
            outputBuffer.clear();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }

    /**
     * Resets the state of the requester. Files that have been sent and are waiting to be processed will
     * be requested again once the connection is reestablished.
     */
    private void reset() {
        waiting.values().forEach(requests::offer);
        waiting.clear();

        try {
            socket.close();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        socket = null;
        input = null;
        output = null;
        current = null;
        lastUpdate = 0;
    }

    /**
     * Helper method to put a three-byte value into a buffer.
     *
     * @param buffer The buffer
     * @param value  The value to be placed into the buffer
     */
    private void putMedInt(ByteBuffer buffer, int value) {
        buffer.put((byte) (value >> 16));
        buffer.put((byte) (value >> 8));
        buffer.put((byte) value);
    }
}
