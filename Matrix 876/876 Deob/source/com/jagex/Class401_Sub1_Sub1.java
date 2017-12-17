/* Class401_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401_Sub1_Sub1 extends Class401_Sub1 {
	byte[] aByteArray11467;

	byte[] method17871(int i, int i_0_, int i_1_) {
		aByteArray11467 = new byte[i * i_0_ * i_1_ * 2];
		method6547(i, i_0_, i_1_);
		return aByteArray11467;
	}

	void method15720(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		aByteArray11467[i_3_++] = (byte) -1;
		aByteArray11467[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	byte[] method17872(int i, int i_5_, int i_6_) {
		aByteArray11467 = new byte[i * i_5_ * i_6_ * 2];
		method6547(i, i_5_, i_6_);
		return aByteArray11467;
	}

	byte[] method17873(int i, int i_7_, int i_8_) {
		aByteArray11467 = new byte[i * i_7_ * i_8_ * 2];
		method6547(i, i_7_, i_8_);
		return aByteArray11467;
	}

	Class401_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method15721(int i, byte i_9_) {
		int i_10_ = i * 2;
		int i_11_ = i_9_ & 0xff;
		aByteArray11467[i_10_++] = (byte) -1;
		aByteArray11467[i_10_] = (byte) (3 * i_11_ >> 5);
	}
}
