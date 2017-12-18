/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class339 {
	int anInt3575;
	static final int anInt3576 = 128;
	static final int anInt3577 = 7;
	Class351 aClass351_3578;
	int anInt3579;
	Interface40 anInterface40_3580;
	boolean aBool3581 = true;
	int anInt3582 = -1;
	int anInt3583;
	Class178_Sub2 aClass178_Sub2_3584;
	Interface37 anInterface37_3585;
	int anInt3586;
	int[] anIntArray3587;
	int anInt3588;
	byte[] aByteArray3589;

	void method5945() {
		if (aBool3581) {
			aBool3581 = false;
			byte[] is = aClass351_3578.aByteArray3647;
			int i = 0;
			int i_0_ = aClass351_3578.anInt3642;
			int i_1_ = anInt3579 + anInt3588 * aClass351_3578.anInt3642;
			for (int i_2_ = -128; i_2_ < 0; i_2_++) {
				i = (i << 8) - i;
				for (int i_3_ = -128; i_3_ < 0; i_3_++) {
					if (is[i_1_++] != 0)
						i++;
				}
				i_1_ += i_0_ - 128;
			}
			if (anInterface37_3585 != null && anInt3582 == i)
				aBool3581 = false;
			else {
				anInt3582 = i;
				int i_4_ = 0;
				i_1_ = anInt3579 + anInt3588 * i_0_;
				if (aClass178_Sub2_3584.method14990(Class158.aClass158_1747, Class170.aClass170_1822)) {
					if (aByteArray3589 == null)
						aByteArray3589 = new byte[16384];
					byte[] is_5_ = aByteArray3589;
					for (int i_6_ = -128; i_6_ < 0; i_6_++) {
						for (int i_7_ = -128; i_7_ < 0; i_7_++) {
							if (is[i_1_] != 0)
								is_5_[i_4_++] = (byte) 68;
							else {
								int i_8_ = 0;
								if (is[i_1_ - 1] != 0)
									i_8_++;
								if (is[i_1_ + 1] != 0)
									i_8_++;
								if (is[i_1_ - i_0_] != 0)
									i_8_++;
								if (is[i_1_ + i_0_] != 0)
									i_8_++;
								is_5_[i_4_++] = (byte) (17 * i_8_);
							}
							i_1_++;
						}
						i_1_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = (aClass178_Sub2_3584.method15185(Class158.aClass158_1747, 128, 128, false, aByteArray3589));
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method222(0, 0, 128, 128, aByteArray3589, Class158.aClass158_1747, 0, 128);
				} else {
					if (anIntArray3587 == null)
						anIntArray3587 = new int[16384];
					int[] is_9_ = anIntArray3587;
					for (int i_10_ = -128; i_10_ < 0; i_10_++) {
						for (int i_11_ = -128; i_11_ < 0; i_11_++) {
							if (is[i_1_] != 0)
								is_9_[i_4_++] = 1140850688;
							else {
								int i_12_ = 0;
								if (is[i_1_ - 1] != 0)
									i_12_++;
								if (is[i_1_ + 1] != 0)
									i_12_++;
								if (is[i_1_ - i_0_] != 0)
									i_12_++;
								if (is[i_1_ + i_0_] != 0)
									i_12_++;
								is_9_[i_4_++] = 17 * i_12_ << 24;
							}
							i_1_++;
						}
						i_1_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = aClass178_Sub2_3584.method14991(128, 128, false, anIntArray3587);
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method221(0, 0, 128, 128, anIntArray3587, 0, 128);
				}
			}
		}
	}

	void method5946(Class329 class329) {
		method5947(class329, anInterface40_3580, 0, anInt3583);
	}

	void method5947(Class329 class329, Interface40 interface40, int i, int i_13_) {
		if (i_13_ > 0) {
			method5952();
			aClass178_Sub2_3584.method15213(interface40);
			class329.anInterface37_3478 = anInterface37_3585;
			class329.anInt3493 = anInt3586;
			class329.anInt3494 = anInt3575 - anInt3586 + 1;
			class329.anInt3481 = i;
			class329.anInt3496 = i_13_;
			class329.method5793(false);
		}
	}

	void method5948(Class329 class329) {
		method5947(class329, anInterface40_3580, 0, anInt3583);
	}

	void method5949(Class329 class329, Interface40 interface40, int i, int i_14_) {
		if (i_14_ > 0) {
			method5952();
			aClass178_Sub2_3584.method15213(interface40);
			class329.anInterface37_3478 = anInterface37_3585;
			class329.anInt3493 = anInt3586;
			class329.anInt3494 = anInt3575 - anInt3586 + 1;
			class329.anInt3481 = i;
			class329.anInt3496 = i_14_;
			class329.method5793(false);
		}
	}

	Class339(Class178_Sub2 class178_sub2, Class351 class351, Class142_Sub1 class142_sub1, int i, int i_15_, int i_16_, int i_17_, int i_18_) {
		aClass178_Sub2_3584 = class178_sub2;
		aClass351_3578 = class351;
		anInt3579 = i_17_;
		anInt3588 = i_18_;
		int i_19_ = 1 << i_16_;
		int i_20_ = 0;
		int i_21_ = i << i_16_;
		int i_22_ = i_15_ << i_16_;
		for (int i_23_ = 0; i_23_ < i_19_; i_23_++) {
			int i_24_ = ((i_22_ + i_23_) * (class142_sub1.anInt1683 * 692304099) + i_21_);
			for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
				short[] is = class142_sub1.aShortArrayArray9006[i_24_++];
				if (is != null)
					i_20_ += is.length;
			}
		}
		if (i_20_ > 0) {
			anInt3575 = -2147483648;
			anInt3586 = 2147483647;
			anInterface40_3580 = aClass178_Sub2_3584.method15029(false);
			anInterface40_3580.method275(i_20_);
			ByteBuffer bytebuffer = aClass178_Sub2_3584.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
				int i_27_ = ((i_22_ + i_26_) * (class142_sub1.anInt1683 * 692304099) + i_21_);
				for (int i_28_ = 0; i_28_ < i_19_; i_28_++) {
					short[] is = class142_sub1.aShortArrayArray9006[i_27_++];
					if (is != null) {
						for (int i_29_ = 0; i_29_ < is.length; i_29_++) {
							int i_30_ = is[i_29_] & 0xffff;
							if (i_30_ < anInt3586)
								anInt3586 = i_30_;
							if (i_30_ > anInt3575)
								anInt3575 = i_30_;
							bytebuffer.putShort((short) i_30_);
						}
					}
				}
			}
			anInterface40_3580.method265(0, bytebuffer.position(), aClass178_Sub2_3584.aLong9540);
			anInt3583 = i_20_ / 3;
		} else {
			anInt3583 = 0;
			anInterface37_3585 = null;
		}
	}

	void method5950(Class329 class329, Interface40 interface40, int i, int i_31_) {
		if (i_31_ > 0) {
			method5952();
			aClass178_Sub2_3584.method15213(interface40);
			class329.anInterface37_3478 = anInterface37_3585;
			class329.anInt3493 = anInt3586;
			class329.anInt3494 = anInt3575 - anInt3586 + 1;
			class329.anInt3481 = i;
			class329.anInt3496 = i_31_;
			class329.method5793(false);
		}
	}

	void method5951() {
		if (aBool3581) {
			aBool3581 = false;
			byte[] is = aClass351_3578.aByteArray3647;
			int i = 0;
			int i_32_ = aClass351_3578.anInt3642;
			int i_33_ = anInt3579 + anInt3588 * aClass351_3578.anInt3642;
			for (int i_34_ = -128; i_34_ < 0; i_34_++) {
				i = (i << 8) - i;
				for (int i_35_ = -128; i_35_ < 0; i_35_++) {
					if (is[i_33_++] != 0)
						i++;
				}
				i_33_ += i_32_ - 128;
			}
			if (anInterface37_3585 != null && anInt3582 == i)
				aBool3581 = false;
			else {
				anInt3582 = i;
				int i_36_ = 0;
				i_33_ = anInt3579 + anInt3588 * i_32_;
				if (aClass178_Sub2_3584.method14990(Class158.aClass158_1747, Class170.aClass170_1822)) {
					if (aByteArray3589 == null)
						aByteArray3589 = new byte[16384];
					byte[] is_37_ = aByteArray3589;
					for (int i_38_ = -128; i_38_ < 0; i_38_++) {
						for (int i_39_ = -128; i_39_ < 0; i_39_++) {
							if (is[i_33_] != 0)
								is_37_[i_36_++] = (byte) 68;
							else {
								int i_40_ = 0;
								if (is[i_33_ - 1] != 0)
									i_40_++;
								if (is[i_33_ + 1] != 0)
									i_40_++;
								if (is[i_33_ - i_32_] != 0)
									i_40_++;
								if (is[i_33_ + i_32_] != 0)
									i_40_++;
								is_37_[i_36_++] = (byte) (17 * i_40_);
							}
							i_33_++;
						}
						i_33_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = (aClass178_Sub2_3584.method15185(Class158.aClass158_1747, 128, 128, false, aByteArray3589));
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method222(0, 0, 128, 128, aByteArray3589, Class158.aClass158_1747, 0, 128);
				} else {
					if (anIntArray3587 == null)
						anIntArray3587 = new int[16384];
					int[] is_41_ = anIntArray3587;
					for (int i_42_ = -128; i_42_ < 0; i_42_++) {
						for (int i_43_ = -128; i_43_ < 0; i_43_++) {
							if (is[i_33_] != 0)
								is_41_[i_36_++] = 1140850688;
							else {
								int i_44_ = 0;
								if (is[i_33_ - 1] != 0)
									i_44_++;
								if (is[i_33_ + 1] != 0)
									i_44_++;
								if (is[i_33_ - i_32_] != 0)
									i_44_++;
								if (is[i_33_ + i_32_] != 0)
									i_44_++;
								is_41_[i_36_++] = 17 * i_44_ << 24;
							}
							i_33_++;
						}
						i_33_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = aClass178_Sub2_3584.method14991(128, 128, false, anIntArray3587);
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method221(0, 0, 128, 128, anIntArray3587, 0, 128);
				}
			}
		}
	}

	void method5952() {
		if (aBool3581) {
			aBool3581 = false;
			byte[] is = aClass351_3578.aByteArray3647;
			int i = 0;
			int i_45_ = aClass351_3578.anInt3642;
			int i_46_ = anInt3579 + anInt3588 * aClass351_3578.anInt3642;
			for (int i_47_ = -128; i_47_ < 0; i_47_++) {
				i = (i << 8) - i;
				for (int i_48_ = -128; i_48_ < 0; i_48_++) {
					if (is[i_46_++] != 0)
						i++;
				}
				i_46_ += i_45_ - 128;
			}
			if (anInterface37_3585 != null && anInt3582 == i)
				aBool3581 = false;
			else {
				anInt3582 = i;
				int i_49_ = 0;
				i_46_ = anInt3579 + anInt3588 * i_45_;
				if (aClass178_Sub2_3584.method14990(Class158.aClass158_1747, Class170.aClass170_1822)) {
					if (aByteArray3589 == null)
						aByteArray3589 = new byte[16384];
					byte[] is_50_ = aByteArray3589;
					for (int i_51_ = -128; i_51_ < 0; i_51_++) {
						for (int i_52_ = -128; i_52_ < 0; i_52_++) {
							if (is[i_46_] != 0)
								is_50_[i_49_++] = (byte) 68;
							else {
								int i_53_ = 0;
								if (is[i_46_ - 1] != 0)
									i_53_++;
								if (is[i_46_ + 1] != 0)
									i_53_++;
								if (is[i_46_ - i_45_] != 0)
									i_53_++;
								if (is[i_46_ + i_45_] != 0)
									i_53_++;
								is_50_[i_49_++] = (byte) (17 * i_53_);
							}
							i_46_++;
						}
						i_46_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = (aClass178_Sub2_3584.method15185(Class158.aClass158_1747, 128, 128, false, aByteArray3589));
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method222(0, 0, 128, 128, aByteArray3589, Class158.aClass158_1747, 0, 128);
				} else {
					if (anIntArray3587 == null)
						anIntArray3587 = new int[16384];
					int[] is_54_ = anIntArray3587;
					for (int i_55_ = -128; i_55_ < 0; i_55_++) {
						for (int i_56_ = -128; i_56_ < 0; i_56_++) {
							if (is[i_46_] != 0)
								is_54_[i_49_++] = 1140850688;
							else {
								int i_57_ = 0;
								if (is[i_46_ - 1] != 0)
									i_57_++;
								if (is[i_46_ + 1] != 0)
									i_57_++;
								if (is[i_46_ - i_45_] != 0)
									i_57_++;
								if (is[i_46_ + i_45_] != 0)
									i_57_++;
								is_54_[i_49_++] = 17 * i_57_ << 24;
							}
							i_46_++;
						}
						i_46_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = aClass178_Sub2_3584.method14991(128, 128, false, anIntArray3587);
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method221(0, 0, 128, 128, anIntArray3587, 0, 128);
				}
			}
		}
	}

	void method5953() {
		if (aBool3581) {
			aBool3581 = false;
			byte[] is = aClass351_3578.aByteArray3647;
			int i = 0;
			int i_58_ = aClass351_3578.anInt3642;
			int i_59_ = anInt3579 + anInt3588 * aClass351_3578.anInt3642;
			for (int i_60_ = -128; i_60_ < 0; i_60_++) {
				i = (i << 8) - i;
				for (int i_61_ = -128; i_61_ < 0; i_61_++) {
					if (is[i_59_++] != 0)
						i++;
				}
				i_59_ += i_58_ - 128;
			}
			if (anInterface37_3585 != null && anInt3582 == i)
				aBool3581 = false;
			else {
				anInt3582 = i;
				int i_62_ = 0;
				i_59_ = anInt3579 + anInt3588 * i_58_;
				if (aClass178_Sub2_3584.method14990(Class158.aClass158_1747, Class170.aClass170_1822)) {
					if (aByteArray3589 == null)
						aByteArray3589 = new byte[16384];
					byte[] is_63_ = aByteArray3589;
					for (int i_64_ = -128; i_64_ < 0; i_64_++) {
						for (int i_65_ = -128; i_65_ < 0; i_65_++) {
							if (is[i_59_] != 0)
								is_63_[i_62_++] = (byte) 68;
							else {
								int i_66_ = 0;
								if (is[i_59_ - 1] != 0)
									i_66_++;
								if (is[i_59_ + 1] != 0)
									i_66_++;
								if (is[i_59_ - i_58_] != 0)
									i_66_++;
								if (is[i_59_ + i_58_] != 0)
									i_66_++;
								is_63_[i_62_++] = (byte) (17 * i_66_);
							}
							i_59_++;
						}
						i_59_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = (aClass178_Sub2_3584.method15185(Class158.aClass158_1747, 128, 128, false, aByteArray3589));
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method222(0, 0, 128, 128, aByteArray3589, Class158.aClass158_1747, 0, 128);
				} else {
					if (anIntArray3587 == null)
						anIntArray3587 = new int[16384];
					int[] is_67_ = anIntArray3587;
					for (int i_68_ = -128; i_68_ < 0; i_68_++) {
						for (int i_69_ = -128; i_69_ < 0; i_69_++) {
							if (is[i_59_] != 0)
								is_67_[i_62_++] = 1140850688;
							else {
								int i_70_ = 0;
								if (is[i_59_ - 1] != 0)
									i_70_++;
								if (is[i_59_ + 1] != 0)
									i_70_++;
								if (is[i_59_ - i_58_] != 0)
									i_70_++;
								if (is[i_59_ + i_58_] != 0)
									i_70_++;
								is_67_[i_62_++] = 17 * i_70_ << 24;
							}
							i_59_++;
						}
						i_59_ += aClass351_3578.anInt3642 - 128;
					}
					if (anInterface37_3585 == null) {
						anInterface37_3585 = aClass178_Sub2_3584.method14991(128, 128, false, anIntArray3587);
						anInterface37_3585.method239(false, false);
					} else
						anInterface37_3585.method221(0, 0, 128, 128, anIntArray3587, 0, 128);
				}
			}
		}
	}
}
