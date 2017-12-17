/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class187 implements Interface13, Interface6 {
	public boolean[] aBoolArray2132;

	void method3588(Class523_Sub34 class523_sub34, int i, int i_0_) {
		if (2 == i) {
			aBoolArray2132 = new boolean[400];
			int i_1_ = class523_sub34.readUnsignedSmart(368514876);
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
				aBoolArray2132[class523_sub34.readUnsignedSmart(368514876)] = true;
		} else if (3 == i) {
			class523_sub34.readUnsignedByte(-112544601);
			int i_3_ = class523_sub34.readUnsignedSmart(368514876);
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				class523_sub34.readUnsignedSmart(368514876);
				class523_sub34.readUnsignedByte(-1627464401);
			}
		}
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_5_ = class523_sub34.readUnsignedByte(541770275);
			if (i_5_ == 0)
				break;
			method3588(class523_sub34, i_5_, 1908225815);
		}
	}

	public void method79() {
		/* empty */
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method52(int i, byte i_6_) {
		/* empty */
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(207604345);
			if (i == 0)
				break;
			method3588(class523_sub34, i, 1635489572);
		}
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2092677437);
			if (i == 0)
				break;
			method3588(class523_sub34, i, -801928877);
		}
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1667124313);
			if (i == 0)
				break;
			method3588(class523_sub34, i, -1909334362);
		}
	}

	public void method77() {
		/* empty */
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1387639357);
			if (i == 0)
				break;
			method3588(class523_sub34, i, 183298623);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2067506594);
			if (i == 0)
				break;
			method3588(class523_sub34, i, -813980611);
		}
	}

	public void method78() {
		/* empty */
	}

	Class187() {
		/* empty */
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1599069810);
			if (i == 0)
				break;
			method3588(class523_sub34, i, 165549012);
		}
	}

	public void method73() {
		/* empty */
	}

	void method3589(Class523_Sub34 class523_sub34, int i) {
		if (2 == i) {
			aBoolArray2132 = new boolean[400];
			int i_7_ = class523_sub34.readUnsignedSmart(368514876);
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				aBoolArray2132[class523_sub34.readUnsignedSmart(368514876)] = true;
		} else if (3 == i) {
			class523_sub34.readUnsignedByte(1725160432);
			int i_9_ = class523_sub34.readUnsignedSmart(368514876);
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				class523_sub34.readUnsignedSmart(368514876);
				class523_sub34.readUnsignedByte(750324968);
			}
		}
	}

	public void method51(int i) {
		/* empty */
	}

	static final void method3590(Class669 class669, byte i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (Class31.aClass242Array302[i_11_] == null)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class31.aClass242Array302[i_11_].aClass250Array2457.length;
	}

	static final void method3591(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_12_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_13_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class437 class437 = Class437.method6879((float) i_12_, (float) i_12_, (float) i_12_);
		if (-1.0F == class437.aFloat4903)
			class437.aFloat4903 = Float.POSITIVE_INFINITY;
		if (class437.aFloat4904 == -1.0F)
			class437.aFloat4904 = Float.POSITIVE_INFINITY;
		if (-1.0F == class437.aFloat4905)
			class437.aFloat4905 = Float.POSITIVE_INFINITY;
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5318(class437, -647054103);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5315((float) i_13_ / 1000.0F, (byte) -17);
		class437.method6949();
	}
}
