/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class11 {
	int[] anIntArray84;
	int anInt85;
	static final int anInt86 = 1020;
	int anInt87;
	static final int anInt88 = 256;
	int[] anIntArray89 = new int[256];
	int anInt90;
	int anInt91;
	static final int anInt92 = 8;

	public final int method641(byte i) {
		if (RS3Applet.RSPS) {
			return 0;
		}
		if (anInt87 * 1376853923 == 0) {
			method646(1466317687);
			anInt87 = -1744041216;
		}
		return anIntArray84[(anInt87 -= -1047000053) * 1376853923];
	}

	public final int method642(int i) {
		if (RS3Applet.RSPS) {
			return 0;
		}
		if (0 == 1376853923 * anInt87) {
			method646(1126269135);
			anInt87 = -1744041216;
		}
		return anIntArray84[1376853923 * anInt87 - 1];
	}

	public Class11(int[] is) {
		anIntArray84 = new int[256];
		for (int i = 0; i < is.length; i++)
			anIntArray84[i] = is[i];
		method643(-2082628488);
	}

	final void method643(int i) {
		int i_0_ = -1640531527;
		int i_1_ = -1640531527;
		int i_2_ = -1640531527;
		int i_3_ = -1640531527;
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		for (int i_8_ = 0; i_8_ < 4; i_8_++) {
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
		}
		for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
			i_7_ += anIntArray84[i_9_];
			i_6_ += anIntArray84[1 + i_9_];
			i_5_ += anIntArray84[i_9_ + 2];
			i_4_ += anIntArray84[i_9_ + 3];
			i_3_ += anIntArray84[i_9_ + 4];
			i_2_ += anIntArray84[5 + i_9_];
			i_1_ += anIntArray84[i_9_ + 6];
			i_0_ += anIntArray84[i_9_ + 7];
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
			anIntArray89[i_9_] = i_7_;
			anIntArray89[1 + i_9_] = i_6_;
			anIntArray89[i_9_ + 2] = i_5_;
			anIntArray89[3 + i_9_] = i_4_;
			anIntArray89[i_9_ + 4] = i_3_;
			anIntArray89[5 + i_9_] = i_2_;
			anIntArray89[i_9_ + 6] = i_1_;
			anIntArray89[i_9_ + 7] = i_0_;
		}
		for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
			i_7_ += anIntArray89[i_10_];
			i_6_ += anIntArray89[1 + i_10_];
			i_5_ += anIntArray89[2 + i_10_];
			i_4_ += anIntArray89[3 + i_10_];
			i_3_ += anIntArray89[i_10_ + 4];
			i_2_ += anIntArray89[i_10_ + 5];
			i_1_ += anIntArray89[i_10_ + 6];
			i_0_ += anIntArray89[i_10_ + 7];
			i_7_ ^= i_6_ << 11;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 2;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_2_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ >>> 16;
			i_1_ += i_4_;
			i_3_ += i_2_;
			i_3_ ^= i_2_ << 10;
			i_0_ += i_3_;
			i_2_ += i_1_;
			i_2_ ^= i_1_ >>> 4;
			i_7_ += i_2_;
			i_1_ += i_0_;
			i_1_ ^= i_0_ << 8;
			i_6_ += i_1_;
			i_0_ += i_7_;
			i_0_ ^= i_7_ >>> 9;
			i_5_ += i_0_;
			i_7_ += i_6_;
			anIntArray89[i_10_] = i_7_;
			anIntArray89[1 + i_10_] = i_6_;
			anIntArray89[2 + i_10_] = i_5_;
			anIntArray89[3 + i_10_] = i_4_;
			anIntArray89[i_10_ + 4] = i_3_;
			anIntArray89[i_10_ + 5] = i_2_;
			anIntArray89[6 + i_10_] = i_1_;
			anIntArray89[i_10_ + 7] = i_0_;
		}
		method646(1362816683);
		anInt87 = -1744041216;
	}

	final void method644() {
		anInt91 += (anInt90 += -787461533) * 1860252151;
		for (int i = 0; i < 256; i++) {
			int i_11_ = anIntArray89[i];
			if (0 == (i & 0x2)) {
				if (0 == (i & 0x1))
					anInt85 = (anInt85 * 572007687 ^ 572007687 * anInt85 << 13) * 1027356855;
				else
					anInt85 = 1027356855 * (572007687 * anInt85 ^ anInt85 * 572007687 >>> 6);
			} else if ((i & 0x1) == 0)
				anInt85 = 1027356855 * (anInt85 * 572007687 ^ 572007687 * anInt85 << 2);
			else
				anInt85 = 1027356855 * (anInt85 * 572007687 ^ anInt85 * 572007687 >>> 16);
			anInt85 += 1027356855 * anIntArray89[i + 128 & 0xff];
			int i_12_;
			anIntArray89[i] = i_12_ = (anInt91 * 1069514829 + (anInt85 * 572007687 + anIntArray89[(i_11_ & 0x3fc) >> 2]));
			anIntArray84[i] = (anInt91 = -1074284411 * (anIntArray89[(i_12_ >> 8 & 0x3fc) >> 2] + i_11_)) * 1069514829;
		}
	}

	public final int method645() {
		if (0 == 1376853923 * anInt87) {
			method646(361781478);
			anInt87 = -1744041216;
		}
		return anIntArray84[1376853923 * anInt87 - 1];
	}

	final void method646(int i) {
		anInt91 += (anInt90 += -787461533) * 1860252151;
		for (int i_13_ = 0; i_13_ < 256; i_13_++) {
			int i_14_ = anIntArray89[i_13_];
			if (0 == (i_13_ & 0x2)) {
				if (0 == (i_13_ & 0x1))
					anInt85 = (anInt85 * 572007687 ^ 572007687 * anInt85 << 13) * 1027356855;
				else
					anInt85 = 1027356855 * (572007687 * anInt85 ^ anInt85 * 572007687 >>> 6);
			} else if ((i_13_ & 0x1) == 0)
				anInt85 = 1027356855 * (anInt85 * 572007687 ^ 572007687 * anInt85 << 2);
			else
				anInt85 = 1027356855 * (anInt85 * 572007687 ^ anInt85 * 572007687 >>> 16);
			anInt85 += 1027356855 * anIntArray89[i_13_ + 128 & 0xff];
			int i_15_;
			anIntArray89[i_13_] = i_15_ = (anInt91 * 1069514829 + (anInt85 * 572007687 + anIntArray89[(i_14_ & 0x3fc) >> 2]));
			anIntArray84[i_13_] = (anInt91 = -1074284411 * (anIntArray89[(i_15_ >> 8 & 0x3fc) >> 2] + i_14_)) * 1069514829;
		}
	}

	public final int method647() {
		if (anInt87 * 1376853923 == 0) {
			method646(1976453984);
			anInt87 = -1744041216;
		}
		return anIntArray84[(anInt87 -= -1047000053) * 1376853923];
	}

	final void method648() {
		int i = -1640531527;
		int i_16_ = -1640531527;
		int i_17_ = -1640531527;
		int i_18_ = -1640531527;
		int i_19_ = -1640531527;
		int i_20_ = -1640531527;
		int i_21_ = -1640531527;
		int i_22_ = -1640531527;
		for (int i_23_ = 0; i_23_ < 4; i_23_++) {
			i_22_ ^= i_21_ << 11;
			i_19_ += i_22_;
			i_21_ += i_20_;
			i_21_ ^= i_20_ >>> 2;
			i_18_ += i_21_;
			i_20_ += i_19_;
			i_20_ ^= i_19_ << 8;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 16;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 10;
			i += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 4;
			i_22_ += i_17_;
			i_16_ += i;
			i_16_ ^= i << 8;
			i_21_ += i_16_;
			i += i_22_;
			i ^= i_22_ >>> 9;
			i_20_ += i;
			i_22_ += i_21_;
		}
		for (int i_24_ = 0; i_24_ < 256; i_24_ += 8) {
			i_22_ += anIntArray84[i_24_];
			i_21_ += anIntArray84[1 + i_24_];
			i_20_ += anIntArray84[i_24_ + 2];
			i_19_ += anIntArray84[i_24_ + 3];
			i_18_ += anIntArray84[i_24_ + 4];
			i_17_ += anIntArray84[5 + i_24_];
			i_16_ += anIntArray84[i_24_ + 6];
			i += anIntArray84[i_24_ + 7];
			i_22_ ^= i_21_ << 11;
			i_19_ += i_22_;
			i_21_ += i_20_;
			i_21_ ^= i_20_ >>> 2;
			i_18_ += i_21_;
			i_20_ += i_19_;
			i_20_ ^= i_19_ << 8;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 16;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 10;
			i += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 4;
			i_22_ += i_17_;
			i_16_ += i;
			i_16_ ^= i << 8;
			i_21_ += i_16_;
			i += i_22_;
			i ^= i_22_ >>> 9;
			i_20_ += i;
			i_22_ += i_21_;
			anIntArray89[i_24_] = i_22_;
			anIntArray89[1 + i_24_] = i_21_;
			anIntArray89[i_24_ + 2] = i_20_;
			anIntArray89[3 + i_24_] = i_19_;
			anIntArray89[i_24_ + 4] = i_18_;
			anIntArray89[5 + i_24_] = i_17_;
			anIntArray89[i_24_ + 6] = i_16_;
			anIntArray89[i_24_ + 7] = i;
		}
		for (int i_25_ = 0; i_25_ < 256; i_25_ += 8) {
			i_22_ += anIntArray89[i_25_];
			i_21_ += anIntArray89[1 + i_25_];
			i_20_ += anIntArray89[2 + i_25_];
			i_19_ += anIntArray89[3 + i_25_];
			i_18_ += anIntArray89[i_25_ + 4];
			i_17_ += anIntArray89[i_25_ + 5];
			i_16_ += anIntArray89[i_25_ + 6];
			i += anIntArray89[i_25_ + 7];
			i_22_ ^= i_21_ << 11;
			i_19_ += i_22_;
			i_21_ += i_20_;
			i_21_ ^= i_20_ >>> 2;
			i_18_ += i_21_;
			i_20_ += i_19_;
			i_20_ ^= i_19_ << 8;
			i_17_ += i_20_;
			i_19_ += i_18_;
			i_19_ ^= i_18_ >>> 16;
			i_16_ += i_19_;
			i_18_ += i_17_;
			i_18_ ^= i_17_ << 10;
			i += i_18_;
			i_17_ += i_16_;
			i_17_ ^= i_16_ >>> 4;
			i_22_ += i_17_;
			i_16_ += i;
			i_16_ ^= i << 8;
			i_21_ += i_16_;
			i += i_22_;
			i ^= i_22_ >>> 9;
			i_20_ += i;
			i_22_ += i_21_;
			anIntArray89[i_25_] = i_22_;
			anIntArray89[1 + i_25_] = i_21_;
			anIntArray89[2 + i_25_] = i_20_;
			anIntArray89[3 + i_25_] = i_19_;
			anIntArray89[i_25_ + 4] = i_18_;
			anIntArray89[i_25_ + 5] = i_17_;
			anIntArray89[6 + i_25_] = i_16_;
			anIntArray89[i_25_ + 7] = i;
		}
		method646(1388699576);
		anInt87 = -1744041216;
	}

	final void method649() {
		int i = -1640531527;
		int i_26_ = -1640531527;
		int i_27_ = -1640531527;
		int i_28_ = -1640531527;
		int i_29_ = -1640531527;
		int i_30_ = -1640531527;
		int i_31_ = -1640531527;
		int i_32_ = -1640531527;
		for (int i_33_ = 0; i_33_ < 4; i_33_++) {
			i_32_ ^= i_31_ << 11;
			i_29_ += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 2;
			i_28_ += i_31_;
			i_30_ += i_29_;
			i_30_ ^= i_29_ << 8;
			i_27_ += i_30_;
			i_29_ += i_28_;
			i_29_ ^= i_28_ >>> 16;
			i_26_ += i_29_;
			i_28_ += i_27_;
			i_28_ ^= i_27_ << 10;
			i += i_28_;
			i_27_ += i_26_;
			i_27_ ^= i_26_ >>> 4;
			i_32_ += i_27_;
			i_26_ += i;
			i_26_ ^= i << 8;
			i_31_ += i_26_;
			i += i_32_;
			i ^= i_32_ >>> 9;
			i_30_ += i;
			i_32_ += i_31_;
		}
		for (int i_34_ = 0; i_34_ < 256; i_34_ += 8) {
			i_32_ += anIntArray84[i_34_];
			i_31_ += anIntArray84[1 + i_34_];
			i_30_ += anIntArray84[i_34_ + 2];
			i_29_ += anIntArray84[i_34_ + 3];
			i_28_ += anIntArray84[i_34_ + 4];
			i_27_ += anIntArray84[5 + i_34_];
			i_26_ += anIntArray84[i_34_ + 6];
			i += anIntArray84[i_34_ + 7];
			i_32_ ^= i_31_ << 11;
			i_29_ += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 2;
			i_28_ += i_31_;
			i_30_ += i_29_;
			i_30_ ^= i_29_ << 8;
			i_27_ += i_30_;
			i_29_ += i_28_;
			i_29_ ^= i_28_ >>> 16;
			i_26_ += i_29_;
			i_28_ += i_27_;
			i_28_ ^= i_27_ << 10;
			i += i_28_;
			i_27_ += i_26_;
			i_27_ ^= i_26_ >>> 4;
			i_32_ += i_27_;
			i_26_ += i;
			i_26_ ^= i << 8;
			i_31_ += i_26_;
			i += i_32_;
			i ^= i_32_ >>> 9;
			i_30_ += i;
			i_32_ += i_31_;
			anIntArray89[i_34_] = i_32_;
			anIntArray89[1 + i_34_] = i_31_;
			anIntArray89[i_34_ + 2] = i_30_;
			anIntArray89[3 + i_34_] = i_29_;
			anIntArray89[i_34_ + 4] = i_28_;
			anIntArray89[5 + i_34_] = i_27_;
			anIntArray89[i_34_ + 6] = i_26_;
			anIntArray89[i_34_ + 7] = i;
		}
		for (int i_35_ = 0; i_35_ < 256; i_35_ += 8) {
			i_32_ += anIntArray89[i_35_];
			i_31_ += anIntArray89[1 + i_35_];
			i_30_ += anIntArray89[2 + i_35_];
			i_29_ += anIntArray89[3 + i_35_];
			i_28_ += anIntArray89[i_35_ + 4];
			i_27_ += anIntArray89[i_35_ + 5];
			i_26_ += anIntArray89[i_35_ + 6];
			i += anIntArray89[i_35_ + 7];
			i_32_ ^= i_31_ << 11;
			i_29_ += i_32_;
			i_31_ += i_30_;
			i_31_ ^= i_30_ >>> 2;
			i_28_ += i_31_;
			i_30_ += i_29_;
			i_30_ ^= i_29_ << 8;
			i_27_ += i_30_;
			i_29_ += i_28_;
			i_29_ ^= i_28_ >>> 16;
			i_26_ += i_29_;
			i_28_ += i_27_;
			i_28_ ^= i_27_ << 10;
			i += i_28_;
			i_27_ += i_26_;
			i_27_ ^= i_26_ >>> 4;
			i_32_ += i_27_;
			i_26_ += i;
			i_26_ ^= i << 8;
			i_31_ += i_26_;
			i += i_32_;
			i ^= i_32_ >>> 9;
			i_30_ += i;
			i_32_ += i_31_;
			anIntArray89[i_35_] = i_32_;
			anIntArray89[1 + i_35_] = i_31_;
			anIntArray89[2 + i_35_] = i_30_;
			anIntArray89[3 + i_35_] = i_29_;
			anIntArray89[i_35_ + 4] = i_28_;
			anIntArray89[i_35_ + 5] = i_27_;
			anIntArray89[6 + i_35_] = i_26_;
			anIntArray89[i_35_ + 7] = i;
		}
		method646(615068277);
		anInt87 = -1744041216;
	}

	public static int method650(int i) {
		return 10;
	}

	static void method651(int i) {
		Class34.aClass164_318 = null;
		Class10.aClass164_83 = null;
		Class34.aClass164_319 = null;
		Class566.aClass148Array7606 = null;
		Class82.aClass148Array872 = null;
		Class523_Sub27_Sub14_Sub3.aClass148Array12157 = null;
		Class365.aClass148Array3867 = null;
		Class501.aClass148Array5584 = null;
		Class62.aClass148Array772 = null;
		Class168.aClass148_1800 = null;
		Class707_Sub2.aClass148_10972 = null;
		Class194_Sub3.aClass148Array9885 = null;
	}

	static void method652(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		boolean bool = class669.anIntArray8557[1357652815 * class669.anInt8558] != 0;
		boolean bool_36_ = 0 != (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		Class426.method6749(bool, bool_36_, (byte) -5);
	}
}
