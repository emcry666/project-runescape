package com.rs.engine;

public class ExaustManager {

	private byte[] bytes;

	public ExaustManager() {
		bytes = new byte[0];
	}

	public synchronized void allocate(byte[] b) {
		System.arraycopy(bytes, bytes.length, b, 0, b.length);
	}

	public synchronized void exaustExternalBytes(int start, int offset) {
		for (int i = start; i < offset; i++)
			bytes[i] = -1;
	}

	public synchronized void stack(int length) {
		byte[] newBuffer = new byte[(bytes.length + length)];
		System.arraycopy(bytes, 0, newBuffer, 0, bytes.length);
		bytes = newBuffer;
	}
}
