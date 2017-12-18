/* Class401_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401_Sub2 extends Class401 {
	int[] anIntArray10281 = new int[anInt4145];
	byte[] aByteArray10282;
	int anInt10283;
	int anInt10284;

	void method6560() {
		anInt10284 = 0;
		anInt10283 = 0;
	}

	void method15777(int i, byte i_0_) {
		aByteArray10282[anInt10284++] = (byte) (127 + ((i_0_ & 0xff) >> 1));
	}

	void method6569(int i, int i_1_) {
		anInt10283 += i_1_ * anIntArray10281[i] >> 12;
	}

	void method6549() {
		anInt10283 = Math.abs(anInt10283);
		if (anInt10283 >= 4096)
			anInt10283 = 4095;
		method15779(anInt10284++, (byte) (anInt10283 >> 4));
		anInt10283 = 0;
	}

	void method6558() {
		anInt10284 = 0;
		anInt10283 = 0;
	}

	void method15778(int i, byte i_2_) {
		aByteArray10282[anInt10284++] = (byte) (127 + ((i_2_ & 0xff) >> 1));
	}

	void method6562() {
		anInt10283 = Math.abs(anInt10283);
		if (anInt10283 >= 4096)
			anInt10283 = 4095;
		method15779(anInt10284++, (byte) (anInt10283 >> 4));
		anInt10283 = 0;
	}

	void method6563(int i, int i_3_) {
		anInt10283 += i_3_ * anIntArray10281[i] >> 12;
	}

	void method6559() {
		anInt10284 = 0;
		anInt10283 = 0;
	}

	void method15779(int i, byte i_4_) {
		aByteArray10282[anInt10284++] = (byte) (127 + ((i_4_ & 0xff) >> 1));
	}

	void method6561() {
		anInt10283 = Math.abs(anInt10283);
		if (anInt10283 >= 4096)
			anInt10283 = 4095;
		method15779(anInt10284++, (byte) (anInt10283 >> 4));
		anInt10283 = 0;
	}

	void method6553() {
		anInt10284 = 0;
		anInt10283 = 0;
	}

	void method6546(int i, int i_5_) {
		anInt10283 += i_5_ * anIntArray10281[i] >> 12;
	}

	void method6564(int i, int i_6_) {
		anInt10283 += i_6_ * anIntArray10281[i] >> 12;
	}

	void method6565(int i, int i_7_) {
		anInt10283 += i_7_ * anIntArray10281[i] >> 12;
	}

	Class401_Sub2(int i, int i_8_, int i_9_, int i_10_, int i_11_, float f) {
		super(i, i_8_, i_9_, i_10_, i_11_);
		for (int i_12_ = 0; i_12_ < anInt4145; i_12_++)
			anIntArray10281[i_12_] = (short) (int) (Math.pow((double) f, (double) i_12_) * 4096.0);
	}
}
