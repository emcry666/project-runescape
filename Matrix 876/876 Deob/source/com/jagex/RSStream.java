/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class RSStream {
	public Class11 aClass11_1413;
	Class708 aClass708_1414 = new Class708();
	public int anInt1415 = 0;
	int anInt1416;
	IncomingPacket aClass409_1417;
	int anInt1418;
	int anInt1419;
	Class11 aClass11_1420;
	int anInt1421;
	boolean aBool1422;
	int anInt1423;
	public int anInt1424;
	IncomingPacket currentPacket;
	IncomingPacket aClass409_1426;
	int anInt1427;
	NetworkStream stream;
	RSBuffer lzmaBuffer = new RSBuffer(1700);
	IncomingPacket aClass409_1430;
	RSBitBuffer updateBuffer = new RSBitBuffer(40000);
	public boolean aBool1432;
	Class49 aClass49_1433;

	public final void method1973(int i) throws IOException {
		if (stream != null && anInt1415 * -1660026723 > 0) {
			lzmaBuffer.offset = 0;
			for (;;) {
				Class523_Sub22 class523_sub22 = (Class523_Sub22) aClass708_1414.method14240(1498359142);
				if (class523_sub22 == null || (class523_sub22.anInt10522 * -1078557365 > (lzmaBuffer.buffer.length - 2349011 * lzmaBuffer.offset)))
					break;
				lzmaBuffer.readBytes(class523_sub22.aClass523_Sub34_Sub2_10525.buffer, 0, -1078557365 * class523_sub22.anInt10522, (short) -31416);
				anInt1415 -= -1899743993 * class523_sub22.anInt10522;
				class523_sub22.method8661(607052656);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16408(-1760665422);
				class523_sub22.method16105(-6952234);
			}
			stream.write(lzmaBuffer.buffer, 0, (2349011 * lzmaBuffer.offset), (byte) 4);
			anInt1418 += lzmaBuffer.offset * -276541507;
			anInt1424 = 0;
		}
	}

	public final void method1974(Class523_Sub22 class523_sub22, byte i) {
		aClass708_1414.method14236(class523_sub22, -1784516168);
		class523_sub22.anInt10522 = class523_sub22.aClass523_Sub34_Sub2_10525.offset * 621005465;
		class523_sub22.aClass523_Sub34_Sub2_10525.offset = 0;
		anInt1415 += class523_sub22.anInt10522 * -1899743993;
	}

	void method1976(NetworkStream class557, String string, int i) {
		stream = class557;
		aClass49_1433.method1262(string, (byte) 2);
	}

	void method1978(byte i) {
		stream = null;
		aClass49_1433.method1262(null, (byte) -104);
	}

	public NetworkStream getCurrentStream(int i) {
		return stream;
	}

	void method1980(short i) {
		if (stream != null) {
			stream.closeConnection(1438564045);
			stream = null;
		}
		aClass49_1433.method1262(null, (byte) 23);
	}
	
	void method1991(int i) {
		if (0 == client.cycles % 50) {
			anInt1427 = 284501075 * anInt1418;
			anInt1418 = 0;
			anInt1416 = -2028162547 * anInt1419;
			anInt1419 = 0;
		}
	}

	final void method1998(int i) {
		aClass708_1414.method14235((byte) 81);
		anInt1415 = 0;
	}

	RSStream() {
		currentPacket = null;
		anInt1421 = 0;
		aBool1422 = true;
		anInt1423 = 0;
		anInt1424 = 0;
		aBool1432 = false;
		aClass49_1433 = new Class49();
		Thread thread = new Thread(aClass49_1433);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	static final void method2003(Class669 class669, int i) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		if (Class241.player.aClass623_12183 != null)
			Class241.player.aClass623_12183.method10173(bool, -2075028786);
	}

	static final void method2004(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		boolean bool = (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1] == 1);
		if (null != Class534_Sub1.aClass14_10774) {
			Class523 class523 = Class534_Sub1.aClass14_10774.getFromIndex((long) i_0_);
			if (null != class523 && !bool)
				class523.method8661(607052656);
			else if (class523 == null && bool) {
				class523 = new Class523();
				Class534_Sub1.aClass14_10774.method738(class523, (long) i_0_);
			}
		}
	}

	static int method2005(int i) {
		return (Class271.anInt2875 += 1300344851) * -706897381 - 1;
	}

	public static byte[] decompress(RSBuffer buffer, int compressedLength, int i_1_) throws IOException {
		ByteArrayInputStream input = new ByteArrayInputStream(buffer.buffer);
		input.skip((long) (buffer.offset * 2349011));
		return Class483.decompressLZMA(input, compressedLength, -830324465);
	}

	static final void method2007(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class642.method10534(i_2_, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, false, 1952570258);
	}
}
