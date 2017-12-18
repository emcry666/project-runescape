/* Class401_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401_Sub2_Sub2 extends Class401_Sub2 {
	byte[] aByteArray11615;

	byte[] method17951(int i, int i_0_, int i_1_) {
		aByteArray11615 = new byte[i * i_0_ * i_1_ * 2];
		method6547(i, i_0_, i_1_);
		return aByteArray11615;
	}

	Class401_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	void method15779(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		aByteArray11615[i_3_++] = i_2_;
		aByteArray11615[i_3_] = i_2_;
	}

	byte[] method17952(int i, int i_4_, int i_5_) {
		aByteArray11615 = new byte[i * i_4_ * i_5_ * 2];
		method6547(i, i_4_, i_5_);
		return aByteArray11615;
	}

	byte[] method17953(int i, int i_6_, int i_7_) {
		aByteArray11615 = new byte[i * i_6_ * i_7_ * 2];
		method6547(i, i_6_, i_7_);
		return aByteArray11615;
	}

	void method15778(int i, byte i_8_) {
		int i_9_ = i * 2;
		i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
		aByteArray11615[i_9_++] = i_8_;
		aByteArray11615[i_9_] = i_8_;
	}

	void method15777(int i, byte i_10_) {
		int i_11_ = i * 2;
		i_10_ = (byte) (127 + ((i_10_ & 0xff) >> 1));
		aByteArray11615[i_11_++] = i_10_;
		aByteArray11615[i_11_] = i_10_;
	}
}
