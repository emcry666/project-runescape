/* Class145_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class145_Sub3 extends Class145 {
	Class126_Sub2_Sub1 aClass126_Sub2_Sub1_9842;

	static Class145_Sub3 method15484(Class178_Sub1 class178_sub1, int i, int i_0_, int[] is, int[] is_1_) {
		byte[] is_2_ = new byte[i * i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = i_3_ * i + is[i_3_];
			for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
				is_2_[i_4_++] = (byte) -1;
		}
		return new Class145_Sub3(class178_sub1, i, i_0_, is_2_);
	}

	static Class145_Sub3 method15485(Class178_Sub1 class178_sub1, int i, int i_6_, int[] is, int[] is_7_) {
		byte[] is_8_ = new byte[i * i_6_];
		for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			int i_10_ = i_9_ * i + is[i_9_];
			for (int i_11_ = 0; i_11_ < is_7_[i_9_]; i_11_++)
				is_8_[i_10_++] = (byte) -1;
		}
		return new Class145_Sub3(class178_sub1, i, i_6_, is_8_);
	}

	static Class145_Sub3 method15486(Class178_Sub1 class178_sub1, int i, int i_12_, int[] is, int[] is_13_) {
		byte[] is_14_ = new byte[i * i_12_];
		for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
			int i_16_ = i_15_ * i + is[i_15_];
			for (int i_17_ = 0; i_17_ < is_13_[i_15_]; i_17_++)
				is_14_[i_16_++] = (byte) -1;
		}
		return new Class145_Sub3(class178_sub1, i, i_12_, is_14_);
	}

	Class145_Sub3(Class178_Sub1 class178_sub1, int i, int i_18_, byte[] is) {
		aClass126_Sub2_Sub1_9842 = Class126_Sub2_Sub1.method17771(class178_sub1, Class158.aClass158_1747, Class170.aClass170_1822, i, i_18_, false, is, Class158.aClass158_1747);
		aClass126_Sub2_Sub1_9842.method14363(false, false);
	}

	static Class145_Sub3 method15487(Class178_Sub1 class178_sub1, int i, int i_19_, int[] is, int[] is_20_) {
		byte[] is_21_ = new byte[i * i_19_];
		for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
			int i_23_ = i_22_ * i + is[i_22_];
			for (int i_24_ = 0; i_24_ < is_20_[i_22_]; i_24_++)
				is_21_[i_23_++] = (byte) -1;
		}
		return new Class145_Sub3(class178_sub1, i, i_19_, is_21_);
	}
}
