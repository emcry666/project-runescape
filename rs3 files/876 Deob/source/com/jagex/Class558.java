/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class558 {
	int anInt7481;
	Class375_Sub1 this$0;
	byte[] aByteArray7482;
	Class567 aClass567_7483;
	int anInt7484;
	int anInt7485;
	int anInt7486;
	float aFloat7487;
	int anInt7488;
	int anInt7489;
	byte[] aByteArray7490;

	Class558(Class375_Sub1 class375_sub1, Class567 class567, int i, float f, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		this$0 = class375_sub1;
		aClass567_7483 = class567;
		aByteArray7490 = new byte[i];
		aByteArray7482 = new byte[i_0_ / 8];
		anInt7485 = 1187466467 * aByteArray7490.length;
		aFloat7487 = f;
		anInt7488 = 1405651135 * i_0_;
		anInt7489 = i_1_ * 1800589505;
		anInt7484 = 0;
		anInt7486 = 0;
		anInt7481 = 0;
	}

	void method9226(byte[] is, int i, int i_3_, int i_4_) {
		int i_5_ = i;
		while (i_5_ < i_3_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_5_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_5_];
			i_5_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	void method9227(byte[] is, int i, int i_6_) {
		int i_7_ = i;
		while (i_7_ < i_6_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_7_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_7_];
			i_7_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	int method9228(int i) {
		return -354920245 * anInt7485;
	}

	void method9229(byte[] is, int i, int i_8_) {
		int i_9_ = i;
		while (i_9_ < i_8_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_9_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_9_];
			i_9_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	void method9230(byte[] is, int i, int i_10_) {
		int i_11_ = i;
		while (i_11_ < i_10_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_11_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_11_];
			i_11_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	int method9231() {
		return -354920245 * anInt7485;
	}

	int method9232() {
		return -354920245 * anInt7485;
	}

	static final byte[] decompress(byte[] is, int i) {
		RSBuffer buffer = new RSBuffer(is);
		CompressionArchive archive = new CompressionArchive(buffer);
		Compression type = archive.getCompressionType(-1886756930);
		int uncompressedLength = archive.getLength((byte) -43);
		if (uncompressedLength < 0 || (1453975341 * Class472.MAX_LENGTH != 0 && uncompressedLength > 1453975341 * Class472.MAX_LENGTH)) {
			throw new RuntimeException();
		}
		if (Compression.UNCOMPRESSED == type) {
			byte[] data = new byte[uncompressedLength];
			buffer.readBytes(data, 0, uncompressedLength, (byte) 89);
			return data;
		}
		int compressedLength = archive.getCompressedLength(1070261458);
		if (compressedLength < 0 || (0 != 1453975341 * Class472.MAX_LENGTH && compressedLength > 1453975341 * Class472.MAX_LENGTH)) {
			throw new RuntimeException();
		}
		byte[] data;
		if (Compression.BZIP2 == type) {
			data = new byte[compressedLength];
			BZIP2.decompress(data, compressedLength, is, uncompressedLength, 9);
		} else if (Compression.GZIP == type) {
			data = new byte[compressedLength];
			synchronized (Class472.aClass79_5366) {
				Class472.aClass79_5366.decompress(buffer, data, 2131530334);
			}
		} else if (type == Compression.LZMA) {
			try {
				data = RSStream.decompress(buffer, compressedLength, 769100217);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return data;
	}

	static final void method9234(Class669 class669, int i) {
		Class611_Sub1 class611_sub1 = Class98_Sub1.method14355(-1045742050);
		if (null != class611_sub1) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt10588 * 1568680265;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -427096717 * class611_sub1.anInt8010;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10587;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.method16192((byte) -75);
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.method16195(2063275336);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt8012 * -1102045477;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1614476621 * class611_sub1.anInt10585;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10586;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		}
	}
}
