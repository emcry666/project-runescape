/* Class401_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401_Sub2_Sub1 extends Class401_Sub2 {
	byte[] aByteArray11408;

	void method15777(int i, byte i_0_) {
		int i_1_ = i * 2;
		i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
		aByteArray11408[i_1_++] = i_0_;
		aByteArray11408[i_1_] = i_0_;
	}

	byte[] method17811(int i, int i_2_, int i_3_) {
		aByteArray11408 = new byte[i * i_2_ * i_3_ * 2];
		method6547(i, i_2_, i_3_);
		return aByteArray11408;
	}

	void method15779(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		aByteArray11408[i_5_++] = i_4_;
		aByteArray11408[i_5_] = i_4_;
	}

	void method15778(int i, byte i_6_) {
		int i_7_ = i * 2;
		i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
		aByteArray11408[i_7_++] = i_6_;
		aByteArray11408[i_7_] = i_6_;
	}

	Class401_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
