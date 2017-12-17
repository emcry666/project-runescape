/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;

public abstract class NetworkStream {
	public static Clipboard aClipboard7479;
	public static Class148 aClass148_7480;

	public abstract void method9198(byte[] is, int i, int i_0_) throws IOException;

	public abstract boolean method9199(int i, int i_1_) throws IOException;

	public abstract void method9200(byte[] is, int i, int i_2_) throws IOException;

	public abstract int read(byte[] is, int i, int i_3_, short i_4_) throws IOException;

	public abstract int readableBytes(int i) throws IOException;

	public abstract void closeConnection(int i);

	public abstract void drop(int i);

	public abstract boolean method9205(int i) throws IOException;

	public abstract boolean method9206(int i) throws IOException;

	public abstract boolean method9207(int i) throws IOException;

	public abstract void method9208();

	public abstract void method9209();

	public abstract int method9210() throws IOException;

	public abstract void method9211(byte[] is, int i, int i_5_) throws IOException;

	NetworkStream() {
		/* empty */
	}

	public abstract void method9212(byte[] is, int i, int i_6_) throws IOException;

	public abstract void method9213();

	public abstract void write(byte[] is, int i, int i_7_, byte i_8_) throws IOException;

	public abstract int method9215(byte[] is, int i, int i_9_) throws IOException;

	public abstract void method9216();

	public abstract void method9217();

	public abstract void method9218();

	public static NetworkStream method9219(Socket socket, int i) throws IOException {
		return new Class557_Sub1(socket, i);
	}

	public abstract int method9220() throws IOException;

	public abstract int method9221(byte[] is, int i, int i_10_) throws IOException;

	public abstract int method9222() throws IOException;

	static final void method9223(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class642.aClass561_8334.method9426((byte) 43);
	}

	public static int method9224(int i) {
		return Class523_Sub11.aClass625_10427.aBool8159 ? 2 : 1;
	}

	public static void method9225(int i, int i_11_, int i_12_) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.CONTINUE_DIALOGUE_PACKET, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i, -850453122);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_11_, -1262882661);
		client.aClass116_11058.method1974(class523_sub22, (byte) 70);
	}
}
