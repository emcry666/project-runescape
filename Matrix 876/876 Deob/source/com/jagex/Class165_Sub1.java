/* Class165_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class165_Sub1 extends Class165 {
	Class126 aClass126_9226;
	Class178_Sub1 aClass178_Sub1_9227;

	Class126 method14607() {
		return aClass126_9226;
	}

	byte[] method14608(int[] is) {
		byte[] is_0_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
					int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
					is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
					is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
					is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
					is_0_[i_4_ + 3] = (byte) -1;
				}
			}
		}
		return is_0_;
	}

	byte[] method14609(int[] is) {
		byte[] is_5_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_6_ = 0; i_6_ < 16; i_6_++) {
				for (int i_7_ = 0; i_7_ < 16; i_7_++) {
					int i_8_ = is[256 * i_6_ + 16 * i_7_ + i];
					int i_9_ = (i_7_ * 256 + i_6_ * 16 + i) * 4;
					is_5_[i_9_ + 0] = (byte) (i_8_ >> 16 & 0xff);
					is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
					is_5_[i_9_ + 2] = (byte) (i_8_ & 0xff);
					is_5_[i_9_ + 3] = (byte) -1;
				}
			}
		}
		return is_5_;
	}

	Class126 method14610() {
		return aClass126_9226;
	}

	Class126 method14611() {
		return aClass126_9226;
	}

	byte[] method14612(int[] is) {
		byte[] is_10_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_11_ = 0; i_11_ < 16; i_11_++) {
				for (int i_12_ = 0; i_12_ < 16; i_12_++) {
					int i_13_ = is[256 * i_11_ + 16 * i_12_ + i];
					int i_14_ = (i_12_ * 256 + i_11_ * 16 + i) * 4;
					is_10_[i_14_ + 0] = (byte) (i_13_ >> 16 & 0xff);
					is_10_[i_14_ + 1] = (byte) (i_13_ >> 8 & 0xff);
					is_10_[i_14_ + 2] = (byte) (i_13_ & 0xff);
					is_10_[i_14_ + 3] = (byte) -1;
				}
			}
		}
		return is_10_;
	}

	Class165_Sub1(Class178_Sub1 class178_sub1, int[] is) {
		aClass178_Sub1_9227 = class178_sub1;
		if (aClass178_Sub1_9227.aBool9325) {
			byte[] is_15_ = method14609(is);
			aClass126_9226 = new Class126_Sub3(aClass178_Sub1_9227, Class158.aClass158_1743, Class170.aClass170_1822, 16, 16, 16, is_15_, Class158.aClass158_1743);
		} else
			aClass126_9226 = new Class126_Sub2(aClass178_Sub1_9227, 3553, 256, 16, false, is, 256, 0, false);
	}

	byte[] method14613(int[] is) {
		byte[] is_16_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_17_ = 0; i_17_ < 16; i_17_++) {
				for (int i_18_ = 0; i_18_ < 16; i_18_++) {
					int i_19_ = is[256 * i_17_ + 16 * i_18_ + i];
					int i_20_ = (i_18_ * 256 + i_17_ * 16 + i) * 4;
					is_16_[i_20_ + 0] = (byte) (i_19_ >> 16 & 0xff);
					is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
					is_16_[i_20_ + 2] = (byte) (i_19_ & 0xff);
					is_16_[i_20_ + 3] = (byte) -1;
				}
			}
		}
		return is_16_;
	}
}
