/* Class401_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401_Sub1_Sub2 extends Class401_Sub1 {
	byte[] aByteArray11563;

	void method15721(int i, byte i_0_) {
		int i_1_ = i * 2;
		int i_2_ = i_0_ & 0xff;
		aByteArray11563[i_1_++] = (byte) (3 * i_2_ >> 5);
		aByteArray11563[i_1_] = (byte) (3 * i_2_ >> 5);
	}

	void method15720(int i, byte i_3_) {
		int i_4_ = i * 2;
		int i_5_ = i_3_ & 0xff;
		aByteArray11563[i_4_++] = (byte) (3 * i_5_ >> 5);
		aByteArray11563[i_4_] = (byte) (3 * i_5_ >> 5);
	}

	Class401_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	byte[] method17940(int i, int i_6_, int i_7_) {
		aByteArray11563 = new byte[i * i_6_ * i_7_ * 2];
		method6547(i, i_6_, i_7_);
		return aByteArray11563;
	}

	byte[] method17941(int i, int i_8_, int i_9_) {
		aByteArray11563 = new byte[i * i_8_ * i_9_ * 2];
		method6547(i, i_8_, i_9_);
		return aByteArray11563;
	}

	byte[] method17942(int i, int i_10_, int i_11_) {
		aByteArray11563 = new byte[i * i_10_ * i_11_ * 2];
		method6547(i, i_10_, i_11_);
		return aByteArray11563;
	}
}
