/* Class645 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class645 {
	public static Class24 aClass24_8347;

	public static String method10556(byte[] is, int i, int i_0_) {
		char[] cs = new char[i_0_];
		int i_1_ = 0;
		int i_2_ = i;
		int i_3_ = i + i_0_;
		while (i_2_ < i_3_) {
			int i_4_ = is[i_2_++] & 0xff;
			int i_5_;
			if (i_4_ < 128) {
				if (0 == i_4_)
					i_5_ = 65533;
				else
					i_5_ = i_4_;
			} else if (i_4_ < 192)
				i_5_ = 65533;
			else if (i_4_ < 224) {
				if (i_2_ < i_3_ && 128 == (is[i_2_] & 0xc0)) {
					i_5_ = (i_4_ & 0x1f) << 6 | is[i_2_++] & 0x3f;
					if (i_5_ < 128)
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else if (i_4_ < 240) {
				if (i_2_ + 1 < i_3_ && 128 == (is[i_2_] & 0xc0) && (is[i_2_ + 1] & 0xc0) == 128) {
					i_5_ = ((i_4_ & 0xf) << 12 | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
					if (i_5_ < 2048)
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else if (i_4_ < 248) {
				if (i_2_ + 2 < i_3_ && 128 == (is[i_2_] & 0xc0) && 128 == (is[i_2_ + 1] & 0xc0) && (is[2 + i_2_] & 0xc0) == 128) {
					i_5_ = ((i_4_ & 0x7) << 18 | (is[i_2_++] & 0x3f) << 12 | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
					if (i_5_ < 65536 || i_5_ > 1114111)
						i_5_ = 65533;
					else
						i_5_ = 65533;
				} else
					i_5_ = 65533;
			} else
				i_5_ = 65533;
			cs[i_1_++] = (char) i_5_;
		}
		return new String(cs, 0, i_1_);
	}

	public static int method10557(byte[] is, int i, CharSequence charsequence) {
		int i_6_ = charsequence.length();
		int i_7_ = i;
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			int i_9_ = charsequence.charAt(i_8_);
			if (i_9_ <= 127)
				is[i_7_++] = (byte) i_9_;
			else if (i_9_ <= 2047) {
				is[i_7_++] = (byte) (0xc0 | i_9_ >> 6);
				is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
			} else {
				is[i_7_++] = (byte) (0xe0 | i_9_ >> 12);
				is[i_7_++] = (byte) (0x80 | i_9_ >> 6 & 0x3f);
				is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
			}
		}
		return i_7_ - i;
	}

	public static String method10558(byte[] is, int i, int i_10_) {
		char[] cs = new char[i_10_];
		int i_11_ = 0;
		int i_12_ = i;
		int i_13_ = i + i_10_;
		while (i_12_ < i_13_) {
			int i_14_ = is[i_12_++] & 0xff;
			int i_15_;
			if (i_14_ < 128) {
				if (0 == i_14_)
					i_15_ = 65533;
				else
					i_15_ = i_14_;
			} else if (i_14_ < 192)
				i_15_ = 65533;
			else if (i_14_ < 224) {
				if (i_12_ < i_13_ && 128 == (is[i_12_] & 0xc0)) {
					i_15_ = (i_14_ & 0x1f) << 6 | is[i_12_++] & 0x3f;
					if (i_15_ < 128)
						i_15_ = 65533;
				} else
					i_15_ = 65533;
			} else if (i_14_ < 240) {
				if (i_12_ + 1 < i_13_ && 128 == (is[i_12_] & 0xc0) && (is[i_12_ + 1] & 0xc0) == 128) {
					i_15_ = ((i_14_ & 0xf) << 12 | (is[i_12_++] & 0x3f) << 6 | is[i_12_++] & 0x3f);
					if (i_15_ < 2048)
						i_15_ = 65533;
				} else
					i_15_ = 65533;
			} else if (i_14_ < 248) {
				if (i_12_ + 2 < i_13_ && 128 == (is[i_12_] & 0xc0) && 128 == (is[i_12_ + 1] & 0xc0) && (is[2 + i_12_] & 0xc0) == 128) {
					i_15_ = ((i_14_ & 0x7) << 18 | (is[i_12_++] & 0x3f) << 12 | (is[i_12_++] & 0x3f) << 6 | is[i_12_++] & 0x3f);
					if (i_15_ < 65536 || i_15_ > 1114111)
						i_15_ = 65533;
					else
						i_15_ = 65533;
				} else
					i_15_ = 65533;
			} else
				i_15_ = 65533;
			cs[i_11_++] = (char) i_15_;
		}
		return new String(cs, 0, i_11_);
	}

	public static String method10559(byte[] is, int i, int i_16_) {
		char[] cs = new char[i_16_];
		int i_17_ = 0;
		int i_18_ = i;
		int i_19_ = i + i_16_;
		while (i_18_ < i_19_) {
			int i_20_ = is[i_18_++] & 0xff;
			int i_21_;
			if (i_20_ < 128) {
				if (0 == i_20_)
					i_21_ = 65533;
				else
					i_21_ = i_20_;
			} else if (i_20_ < 192)
				i_21_ = 65533;
			else if (i_20_ < 224) {
				if (i_18_ < i_19_ && 128 == (is[i_18_] & 0xc0)) {
					i_21_ = (i_20_ & 0x1f) << 6 | is[i_18_++] & 0x3f;
					if (i_21_ < 128)
						i_21_ = 65533;
				} else
					i_21_ = 65533;
			} else if (i_20_ < 240) {
				if (i_18_ + 1 < i_19_ && 128 == (is[i_18_] & 0xc0) && (is[i_18_ + 1] & 0xc0) == 128) {
					i_21_ = ((i_20_ & 0xf) << 12 | (is[i_18_++] & 0x3f) << 6 | is[i_18_++] & 0x3f);
					if (i_21_ < 2048)
						i_21_ = 65533;
				} else
					i_21_ = 65533;
			} else if (i_20_ < 248) {
				if (i_18_ + 2 < i_19_ && 128 == (is[i_18_] & 0xc0) && 128 == (is[i_18_ + 1] & 0xc0) && (is[2 + i_18_] & 0xc0) == 128) {
					i_21_ = ((i_20_ & 0x7) << 18 | (is[i_18_++] & 0x3f) << 12 | (is[i_18_++] & 0x3f) << 6 | is[i_18_++] & 0x3f);
					if (i_21_ < 65536 || i_21_ > 1114111)
						i_21_ = 65533;
					else
						i_21_ = 65533;
				} else
					i_21_ = 65533;
			} else
				i_21_ = 65533;
			cs[i_17_++] = (char) i_21_;
		}
		return new String(cs, 0, i_17_);
	}

	Class645() throws Throwable {
		throw new Error();
	}

	static final void method10560(Class669 class669, int i) {
		int i_22_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_22_, -393575440);
		Class242 class242 = Class31.aClass242Array302[i_22_ >> 16];
		Class49.method1277(class250, class242, class669, 2062329222);
	}

	public static void method10561(int i) {
		Class569.anInt7647 = 1915499191;
	}

	public static final int method10562(int i, int i_23_, int i_24_, int i_25_) {
		if (i_24_ > 243)
			i_23_ >>= 4;
		else if (i_24_ > 217)
			i_23_ >>= 3;
		else if (i_24_ > 192)
			i_23_ >>= 2;
		else if (i_24_ > 179)
			i_23_ >>= 1;
		return (i_23_ >> 5 << 7) + ((i & 0xff) >> 2 << 10) + (i_24_ >> 1);
	}

	static void method10563(int i, int i_26_) {
		if (Class43.anInt567 * 1566115167 == 142)
			Class43.anInt609 = i * 1451422701;
		else if (Class43.anInt567 * 1566115167 == 267)
			Class43.anInt610 = i * -654032147;
	}
}
