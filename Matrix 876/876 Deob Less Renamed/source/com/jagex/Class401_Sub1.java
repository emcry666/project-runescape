/* Class401_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401_Sub1 extends Class401 {
	int anInt10193;
	int anInt10194;
	int anInt10195;
	int anInt10196;
	int anInt10197;
	byte[] aByteArray10198;
	int anInt10199;
	int anInt10200;
	int anInt10201;

	void method6560() {
		anInt10193 = 0;
		anInt10194 = 0;
	}

	void method6553() {
		anInt10193 = 0;
		anInt10194 = 0;
	}

	void method6569(int i, int i_0_) {
		if (i != 0) {
			anInt10195 = anInt10196 * anInt10199 >> 12;
			if (anInt10195 < 0)
				anInt10195 = 0;
			else if (anInt10195 > 4096)
				anInt10195 = 4096;
			anInt10196 = anInt10200 - (i_0_ < 0 ? -i_0_ : i_0_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10196 = anInt10196 * anInt10195 >> 12;
			anInt10194 += anInt10196 * anInt10197 >> 12;
			anInt10197 = anInt10197 * anInt10201 >> 12;
		} else {
			anInt10196 = anInt10200 - (i_0_ < 0 ? -i_0_ : i_0_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10195 = 4096;
			anInt10194 = anInt10196;
		}
	}

	void method6549() {
		anInt10197 = anInt10201;
		anInt10194 >>= 4;
		if (anInt10194 < 0)
			anInt10194 = 0;
		else if (anInt10194 > 255)
			anInt10194 = 255;
		method15720(anInt10193++, (byte) anInt10194);
		anInt10194 = 0;
	}

	void method15720(int i, byte i_1_) {
		aByteArray10198[i] = i_1_;
	}

	void method15721(int i, byte i_2_) {
		aByteArray10198[i] = i_2_;
	}

	void method6561() {
		anInt10197 = anInt10201;
		anInt10194 >>= 4;
		if (anInt10194 < 0)
			anInt10194 = 0;
		else if (anInt10194 > 255)
			anInt10194 = 255;
		method15720(anInt10193++, (byte) anInt10194);
		anInt10194 = 0;
	}

	void method6558() {
		anInt10193 = 0;
		anInt10194 = 0;
	}

	void method6546(int i, int i_3_) {
		if (i != 0) {
			anInt10195 = anInt10196 * anInt10199 >> 12;
			if (anInt10195 < 0)
				anInt10195 = 0;
			else if (anInt10195 > 4096)
				anInt10195 = 4096;
			anInt10196 = anInt10200 - (i_3_ < 0 ? -i_3_ : i_3_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10196 = anInt10196 * anInt10195 >> 12;
			anInt10194 += anInt10196 * anInt10197 >> 12;
			anInt10197 = anInt10197 * anInt10201 >> 12;
		} else {
			anInt10196 = anInt10200 - (i_3_ < 0 ? -i_3_ : i_3_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10195 = 4096;
			anInt10194 = anInt10196;
		}
	}

	void method6565(int i, int i_4_) {
		if (i != 0) {
			anInt10195 = anInt10196 * anInt10199 >> 12;
			if (anInt10195 < 0)
				anInt10195 = 0;
			else if (anInt10195 > 4096)
				anInt10195 = 4096;
			anInt10196 = anInt10200 - (i_4_ < 0 ? -i_4_ : i_4_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10196 = anInt10196 * anInt10195 >> 12;
			anInt10194 += anInt10196 * anInt10197 >> 12;
			anInt10197 = anInt10197 * anInt10201 >> 12;
		} else {
			anInt10196 = anInt10200 - (i_4_ < 0 ? -i_4_ : i_4_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10195 = 4096;
			anInt10194 = anInt10196;
		}
	}

	void method6559() {
		anInt10193 = 0;
		anInt10194 = 0;
	}

	void method6564(int i, int i_5_) {
		if (i != 0) {
			anInt10195 = anInt10196 * anInt10199 >> 12;
			if (anInt10195 < 0)
				anInt10195 = 0;
			else if (anInt10195 > 4096)
				anInt10195 = 4096;
			anInt10196 = anInt10200 - (i_5_ < 0 ? -i_5_ : i_5_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10196 = anInt10196 * anInt10195 >> 12;
			anInt10194 += anInt10196 * anInt10197 >> 12;
			anInt10197 = anInt10197 * anInt10201 >> 12;
		} else {
			anInt10196 = anInt10200 - (i_5_ < 0 ? -i_5_ : i_5_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10195 = 4096;
			anInt10194 = anInt10196;
		}
	}

	void method6562() {
		anInt10197 = anInt10201;
		anInt10194 >>= 4;
		if (anInt10194 < 0)
			anInt10194 = 0;
		else if (anInt10194 > 255)
			anInt10194 = 255;
		method15720(anInt10193++, (byte) anInt10194);
		anInt10194 = 0;
	}

	Class401_Sub1(int i, int i_6_, int i_7_, int i_8_, int i_9_, float f, float f_10_, float f_11_) {
		super(i, i_6_, i_7_, i_8_, i_9_);
		anInt10199 = (int) (f_11_ * 4096.0F);
		anInt10200 = (int) (f_10_ * 4096.0F);
		anInt10197 = anInt10201 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	void method6563(int i, int i_12_) {
		if (i != 0) {
			anInt10195 = anInt10196 * anInt10199 >> 12;
			if (anInt10195 < 0)
				anInt10195 = 0;
			else if (anInt10195 > 4096)
				anInt10195 = 4096;
			anInt10196 = anInt10200 - (i_12_ < 0 ? -i_12_ : i_12_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10196 = anInt10196 * anInt10195 >> 12;
			anInt10194 += anInt10196 * anInt10197 >> 12;
			anInt10197 = anInt10197 * anInt10201 >> 12;
		} else {
			anInt10196 = anInt10200 - (i_12_ < 0 ? -i_12_ : i_12_);
			anInt10196 = anInt10196 * anInt10196 >> 12;
			anInt10195 = 4096;
			anInt10194 = anInt10196;
		}
	}
}
