/* Class145_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class145_Sub2 extends Class145 {
	Interface37 anInterface37_9740;

	Class145_Sub2(Class178_Sub2 class178_sub2, int i, int i_0_, byte[] is) {
		anInterface37_9740 = class178_sub2.method15185(Class158.aClass158_1747, i, i_0_, false, is);
		anInterface37_9740.method239(false, false);
	}

	Class145_Sub2(Class178_Sub2 class178_sub2, int i, int i_1_, int[] is) {
		anInterface37_9740 = class178_sub2.method14991(i, i_1_, false, is);
		anInterface37_9740.method239(false, false);
	}

	static Class145_Sub2 method15344(Class178_Sub2 class178_sub2, int i, int i_2_, int[] is, int[] is_3_) {
		if (class178_sub2.method14990(Class158.aClass158_1747, Class170.aClass170_1822)) {
			byte[] is_4_ = new byte[i * i_2_];
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
				int i_6_ = i_5_ * i + is[i_5_];
				for (int i_7_ = 0; i_7_ < is_3_[i_5_]; i_7_++)
					is_4_[i_6_++] = (byte) -1;
			}
			return new Class145_Sub2(class178_sub2, i, i_2_, is_4_);
		}
		int[] is_8_ = new int[i * i_2_];
		for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
			int i_10_ = i_9_ * i + is[i_9_];
			for (int i_11_ = 0; i_11_ < is_3_[i_9_]; i_11_++)
				is_8_[i_10_++] = -16777216;
		}
		return new Class145_Sub2(class178_sub2, i, i_2_, is_8_);
	}

	static Class145_Sub2 method15345(Class178_Sub2 class178_sub2, int i, int i_12_, int[] is, int[] is_13_) {
		if (class178_sub2.method14990(Class158.aClass158_1747, Class170.aClass170_1822)) {
			byte[] is_14_ = new byte[i * i_12_];
			for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
				int i_16_ = i_15_ * i + is[i_15_];
				for (int i_17_ = 0; i_17_ < is_13_[i_15_]; i_17_++)
					is_14_[i_16_++] = (byte) -1;
			}
			return new Class145_Sub2(class178_sub2, i, i_12_, is_14_);
		}
		int[] is_18_ = new int[i * i_12_];
		for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
			int i_20_ = i_19_ * i + is[i_19_];
			for (int i_21_ = 0; i_21_ < is_13_[i_19_]; i_21_++)
				is_18_[i_20_++] = -16777216;
		}
		return new Class145_Sub2(class178_sub2, i, i_12_, is_18_);
	}
}
