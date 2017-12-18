/* Class523_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub29 extends Class523 implements Interface9 {
	public int anInt10555;
	static int anInt10556;
	public int anInt10557;
	static Class523_Sub29[] aClass523_Sub29Array10558 = new Class523_Sub29[0];
	public int anInt10559;
	public int anInt10560;

	void method16158(RSBuffer class523_sub34, byte i) {
		class523_sub34.writeByte(anInt10557 * 249244125, -2078852514);
		class523_sub34.writeInt(-536626413 * anInt10560, -1571570866);
		class523_sub34.writeInt(400741225 * anInt10559, -1752042890);
		class523_sub34.writeInt(anInt10555 * 169299399, -1244045077);
	}

	public Class523_Sub29(int i, int i_0_, int i_1_, int i_2_) {
		anInt10557 = -887982475 * i;
		anInt10560 = 1954760475 * i_0_;
		anInt10559 = i_1_ * -630788903;
		anInt10555 = 2081448951 * i_2_;
	}

	public static Class523_Sub29 method16159(int i, boolean bool) {
		synchronized (aClass523_Sub29Array10558) {
			if (0 == anInt10556 * -1791984535) {
				Class523_Sub29 class523_sub29 = new Class523_Sub29(i, bool);
				return class523_sub29;
			}
			aClass523_Sub29Array10558[(anInt10556 -= -1124281383) * -1791984535].method16162(i, bool, -514533323);
			Class523_Sub29 class523_sub29 = aClass523_Sub29Array10558[-1791984535 * anInt10556];
			return class523_sub29;
		}
	}

	public Class523_Sub29(RSBuffer class523_sub34) {
		method59(class523_sub34, 999561266);
	}

	Class523_Sub29(int i, boolean bool) {
		if (-1 == i)
			anInt10557 = 887982475;
		else {
			anInt10557 = -887982475 * (i >> 28 & 0x3);
			anInt10560 = 1954760475 * ((i >> 14 & 0x3fff) << 9);
			anInt10559 = 0;
			anInt10555 = 2081448951 * ((i & 0x3fff) << 9);
			if (bool) {
				anInt10560 += -2092492032;
				anInt10555 += 274986752;
			}
		}
	}

	void method16160(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt10557 = i * -887982475;
		anInt10560 = i_3_ * 1954760475;
		anInt10559 = -630788903 * i_4_;
		anInt10555 = i_5_ * 2081448951;
	}

	void method16161(Class523_Sub29 class523_sub29_7_, int i) {
		anInt10557 = 1 * class523_sub29_7_.anInt10557;
		anInt10560 = class523_sub29_7_.anInt10560 * 1;
		anInt10559 = class523_sub29_7_.anInt10559 * 1;
		anInt10555 = class523_sub29_7_.anInt10555 * 1;
	}

	void method16162(int i, boolean bool, int i_8_) {
		if (i == -1)
			anInt10557 = 887982475;
		else {
			anInt10557 = (i >> 28 & 0x3) * -887982475;
			anInt10560 = 1954760475 * ((i >> 14 & 0x3fff) << 9);
			anInt10559 = 0;
			anInt10555 = ((i & 0x3fff) << 9) * 2081448951;
			if (bool) {
				anInt10560 += -2092492032;
				anInt10555 += 274986752;
			}
		}
	}

	public Class437 method16163(byte i) {
		return new Class437((float) (-536626413 * anInt10560), (float) (400741225 * anInt10559), (float) (anInt10555 * 169299399));
	}

	public int method61(byte i) {
		return Class424.method6733(-2087137338);
	}

	public void method58(RSBuffer class523_sub34) {
		anInt10557 = class523_sub34.readUnsignedByte(-2037622347) * -887982475;
		anInt10560 = class523_sub34.readUnsignedInt((byte) -60) * 1954760475;
		anInt10559 = class523_sub34.readUnsignedInt((byte) -88) * -630788903;
		anInt10555 = class523_sub34.readUnsignedInt((byte) -121) * 2081448951;
	}

	public String toString() {
		return new StringBuilder().append("Level: ").append(249244125 * anInt10557).append(" Coord: ").append(anInt10560 * -536626413).append(",").append(400741225 * anInt10559).append(",").append(169299399 * anInt10555).append(" Coord Split: ").append(-536626413 * anInt10560 >> 15).append(",").append(169299399 * anInt10555 >> 15).append(",").append(-536626413 * anInt10560 >> 9 & 0x3f).append(",").append(anInt10555 * 169299399 >> 9 & 0x3f).append(",").append(anInt10560 * -536626413 & 0x1ff).append(",").append(169299399 * anInt10555 & 0x1ff).toString();
	}

	public void method57(RSBuffer class523_sub34, int i) {
		method16158(class523_sub34, (byte) 7);
	}

	public void method59(RSBuffer class523_sub34, int i) {
		anInt10557 = class523_sub34.readUnsignedByte(-140875574) * -887982475;
		anInt10560 = class523_sub34.readUnsignedInt((byte) -98) * 1954760475;
		anInt10559 = class523_sub34.readUnsignedInt((byte) -107) * -630788903;
		anInt10555 = class523_sub34.readUnsignedInt((byte) -37) * 2081448951;
	}

	public static Class523_Sub29 method16164(Class523_Sub29 class523_sub29) {
		synchronized (aClass523_Sub29Array10558) {
			if (-1791984535 * anInt10556 == 0) {
				Class523_Sub29 class523_sub29_9_ = new Class523_Sub29(class523_sub29);
				return class523_sub29_9_;
			}
			aClass523_Sub29Array10558[(anInt10556 -= -1124281383) * -1791984535].method16161(class523_sub29, 1791937174);
			Class523_Sub29 class523_sub29_10_ = aClass523_Sub29Array10558[anInt10556 * -1791984535];
			return class523_sub29_10_;
		}
	}

	public String method16165() {
		return new StringBuilder().append("Level: ").append(249244125 * anInt10557).append(" Coord: ").append(anInt10560 * -536626413).append(",").append(400741225 * anInt10559).append(",").append(169299399 * anInt10555).append(" Coord Split: ").append(-536626413 * anInt10560 >> 15).append(",").append(169299399 * anInt10555 >> 15).append(",").append(-536626413 * anInt10560 >> 9 & 0x3f).append(",").append(anInt10555 * 169299399 >> 9 & 0x3f).append(",").append(anInt10560 * -536626413 & 0x1ff).append(",").append(169299399 * anInt10555 & 0x1ff).toString();
	}

	public Class437 method16166() {
		return new Class437((float) (-536626413 * anInt10560), (float) (400741225 * anInt10559), (float) (anInt10555 * 169299399));
	}

	public Class523_Sub29() {
		anInt10557 = 887982475;
	}

	public static Class523_Sub29 method16167(int i, boolean bool) {
		synchronized (aClass523_Sub29Array10558) {
			if (0 == anInt10556 * -1791984535) {
				Class523_Sub29 class523_sub29 = new Class523_Sub29(i, bool);
				return class523_sub29;
			}
			aClass523_Sub29Array10558[(anInt10556 -= -1124281383) * -1791984535].method16162(i, bool, -458349445);
			Class523_Sub29 class523_sub29 = aClass523_Sub29Array10558[-1791984535 * anInt10556];
			return class523_sub29;
		}
	}

	void method16168(int i, boolean bool) {
		if (i == -1)
			anInt10557 = 887982475;
		else {
			anInt10557 = (i >> 28 & 0x3) * -887982475;
			anInt10560 = 1954760475 * ((i >> 14 & 0x3fff) << 9);
			anInt10559 = 0;
			anInt10555 = ((i & 0x3fff) << 9) * 2081448951;
			if (bool) {
				anInt10560 += -2092492032;
				anInt10555 += 274986752;
			}
		}
	}

	void method16169(Class523_Sub29 class523_sub29_11_) {
		anInt10557 = 1 * class523_sub29_11_.anInt10557;
		anInt10560 = class523_sub29_11_.anInt10560 * 1;
		anInt10559 = class523_sub29_11_.anInt10559 * 1;
		anInt10555 = class523_sub29_11_.anInt10555 * 1;
	}

	void method16170(Class523_Sub29 class523_sub29_12_) {
		anInt10557 = 1 * class523_sub29_12_.anInt10557;
		anInt10560 = class523_sub29_12_.anInt10560 * 1;
		anInt10559 = class523_sub29_12_.anInt10559 * 1;
		anInt10555 = class523_sub29_12_.anInt10555 * 1;
	}

	void method16171(Class523_Sub29 class523_sub29_13_) {
		anInt10557 = 1 * class523_sub29_13_.anInt10557;
		anInt10560 = class523_sub29_13_.anInt10560 * 1;
		anInt10559 = class523_sub29_13_.anInt10559 * 1;
		anInt10555 = class523_sub29_13_.anInt10555 * 1;
	}

	void method16172(Class523_Sub29 class523_sub29_14_) {
		anInt10557 = 1 * class523_sub29_14_.anInt10557;
		anInt10560 = class523_sub29_14_.anInt10560 * 1;
		anInt10559 = class523_sub29_14_.anInt10559 * 1;
		anInt10555 = class523_sub29_14_.anInt10555 * 1;
	}

	void method16173(int i, boolean bool) {
		if (i == -1)
			anInt10557 = 887982475;
		else {
			anInt10557 = (i >> 28 & 0x3) * -887982475;
			anInt10560 = 1954760475 * ((i >> 14 & 0x3fff) << 9);
			anInt10559 = 0;
			anInt10555 = ((i & 0x3fff) << 9) * 2081448951;
			if (bool) {
				anInt10560 += -2092492032;
				anInt10555 += 274986752;
			}
		}
	}

	public void method60(RSBuffer class523_sub34) {
		method16158(class523_sub34, (byte) 7);
	}

	void method16174(int i, int i_15_, int i_16_, int i_17_) {
		anInt10557 = i * -887982475;
		anInt10560 = i_15_ * 1954760475;
		anInt10559 = -630788903 * i_16_;
		anInt10555 = i_17_ * 2081448951;
	}

	static int method16175() {
		return 13;
	}

	void method16176(RSBuffer class523_sub34) {
		class523_sub34.writeByte(anInt10557 * 249244125, -575307170);
		class523_sub34.writeInt(-536626413 * anInt10560, -1983423879);
		class523_sub34.writeInt(400741225 * anInt10559, -1210029106);
		class523_sub34.writeInt(anInt10555 * 169299399, -2045353819);
	}

	Class523_Sub29(Class523_Sub29 class523_sub29_18_) {
		anInt10557 = 1 * class523_sub29_18_.anInt10557;
		anInt10560 = 1 * class523_sub29_18_.anInt10560;
		anInt10559 = 1 * class523_sub29_18_.anInt10559;
		anInt10555 = 1 * class523_sub29_18_.anInt10555;
	}

	public void method63(RSBuffer class523_sub34) {
		method16158(class523_sub34, (byte) 7);
	}

	public void method62(RSBuffer class523_sub34) {
		anInt10557 = class523_sub34.readUnsignedByte(394866673) * -887982475;
		anInt10560 = class523_sub34.readUnsignedInt((byte) -89) * 1954760475;
		anInt10559 = class523_sub34.readUnsignedInt((byte) -65) * -630788903;
		anInt10555 = class523_sub34.readUnsignedInt((byte) -102) * 2081448951;
	}

	public int method38() {
		return Class424.method6733(-2028709001);
	}

	static boolean method16177(int i, int i_19_) {
		return (i >= Class607.aClass607_7968.anInt7982 * 1923531495 && i <= 1923531495 * Class607.aClass607_7972.anInt7982);
	}
}
