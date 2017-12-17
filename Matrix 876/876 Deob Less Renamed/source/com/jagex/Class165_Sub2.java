/* Class165_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class165_Sub2 extends Class165 {
	Interface43 anInterface43_9781;
	Class178_Sub2 aClass178_Sub2_9782;

	public Interface43 method15392() {
		return anInterface43_9781;
	}

	public Interface43 method15393() {
		return anInterface43_9781;
	}

	byte[] method15394(int[] is) {
		byte[] is_0_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
					int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
					if (aClass178_Sub2_9782.anInt9670 == 0) {
						is_0_[i_4_ + 0] = (byte) (i_3_ & 0xff);
						is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
						is_0_[i_4_ + 2] = (byte) (i_3_ >> 16 & 0xff);
						is_0_[i_4_ + 3] = (byte) -1;
					} else {
						is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
						is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
						is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
						is_0_[i_4_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_0_;
	}

	byte[] method15395(int[] is) {
		byte[] is_5_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_6_ = 0; i_6_ < 16; i_6_++) {
				for (int i_7_ = 0; i_7_ < 16; i_7_++) {
					int i_8_ = is[256 * i_6_ + 16 * i_7_ + i];
					int i_9_ = (i_7_ * 256 + i_6_ * 16 + i) * 4;
					if (aClass178_Sub2_9782.anInt9670 == 0) {
						is_5_[i_9_ + 0] = (byte) (i_8_ & 0xff);
						is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
						is_5_[i_9_ + 2] = (byte) (i_8_ >> 16 & 0xff);
						is_5_[i_9_ + 3] = (byte) -1;
					} else {
						is_5_[i_9_ + 0] = (byte) (i_8_ >> 16 & 0xff);
						is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
						is_5_[i_9_ + 2] = (byte) (i_8_ & 0xff);
						is_5_[i_9_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_5_;
	}

	Class165_Sub2(Class178_Sub2 class178_sub2, int[] is) {
		aClass178_Sub2_9782 = class178_sub2;
		if (aClass178_Sub2_9782.aBool9687) {
			byte[] is_10_ = method15397(is);
			anInterface43_9781 = aClass178_Sub2_9782.method15087(Class158.aClass158_1743, 16, 16, 16, false, is_10_);
		} else
			anInterface43_9781 = aClass178_Sub2_9782.method14991(256, 16, false, is);
	}

	byte[] method15396(int[] is) {
		byte[] is_11_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_12_ = 0; i_12_ < 16; i_12_++) {
				for (int i_13_ = 0; i_13_ < 16; i_13_++) {
					int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
					int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
					if (aClass178_Sub2_9782.anInt9670 == 0) {
						is_11_[i_15_ + 0] = (byte) (i_14_ & 0xff);
						is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
						is_11_[i_15_ + 2] = (byte) (i_14_ >> 16 & 0xff);
						is_11_[i_15_ + 3] = (byte) -1;
					} else {
						is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
						is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
						is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
						is_11_[i_15_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_11_;
	}

	byte[] method15397(int[] is) {
		byte[] is_16_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_17_ = 0; i_17_ < 16; i_17_++) {
				for (int i_18_ = 0; i_18_ < 16; i_18_++) {
					int i_19_ = is[256 * i_17_ + 16 * i_18_ + i];
					int i_20_ = (i_18_ * 256 + i_17_ * 16 + i) * 4;
					if (aClass178_Sub2_9782.anInt9670 == 0) {
						is_16_[i_20_ + 0] = (byte) (i_19_ & 0xff);
						is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
						is_16_[i_20_ + 2] = (byte) (i_19_ >> 16 & 0xff);
						is_16_[i_20_ + 3] = (byte) -1;
					} else {
						is_16_[i_20_ + 0] = (byte) (i_19_ >> 16 & 0xff);
						is_16_[i_20_ + 1] = (byte) (i_19_ >> 8 & 0xff);
						is_16_[i_20_ + 2] = (byte) (i_19_ & 0xff);
						is_16_[i_20_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_16_;
	}

	byte[] method15398(int[] is) {
		byte[] is_21_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_22_ = 0; i_22_ < 16; i_22_++) {
				for (int i_23_ = 0; i_23_ < 16; i_23_++) {
					int i_24_ = is[256 * i_22_ + 16 * i_23_ + i];
					int i_25_ = (i_23_ * 256 + i_22_ * 16 + i) * 4;
					if (aClass178_Sub2_9782.anInt9670 == 0) {
						is_21_[i_25_ + 0] = (byte) (i_24_ & 0xff);
						is_21_[i_25_ + 1] = (byte) (i_24_ >> 8 & 0xff);
						is_21_[i_25_ + 2] = (byte) (i_24_ >> 16 & 0xff);
						is_21_[i_25_ + 3] = (byte) -1;
					} else {
						is_21_[i_25_ + 0] = (byte) (i_24_ >> 16 & 0xff);
						is_21_[i_25_ + 1] = (byte) (i_24_ >> 8 & 0xff);
						is_21_[i_25_ + 2] = (byte) (i_24_ & 0xff);
						is_21_[i_25_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_21_;
	}
}
