/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class306 {
	static Class306 aClass306_3348 = new Class306(0);
	static Class306 aClass306_3349 = new Class306(1);
	static int anInt3350;

	Class306(int i) {
		/* empty */
	}

	static final void method5554(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (2 == 326760831 * client.anInt11235 && i_0_ < 1563815891 * client.anInt11287)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass60Array11182[i_0_].anInt756 * -1122915611;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static byte[][][] method5555(int i, byte i_1_) {
		byte[][][] is = new byte[8][4][];
		int i_2_ = i;
		int i_3_ = i;
		byte[] is_4_ = new byte[i_3_ * i_2_];
		int i_5_ = 0;
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
			for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
				if (i_7_ <= i_6_)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[0][0] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_8_ = i_3_ - 1; i_8_ >= 0; i_8_--) {
			for (int i_9_ = 0; i_9_ < i_3_; i_9_++) {
				if (i_9_ <= i_8_)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[0][1] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
			for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
				if (i_11_ >= i_10_)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[0][2] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_12_ = i_3_ - 1; i_12_ >= 0; i_12_--) {
			for (int i_13_ = 0; i_13_ < i_2_; i_13_++) {
				if (i_13_ >= i_12_)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[0][3] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_14_ = i_3_ - 1; i_14_ >= 0; i_14_--) {
			for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
				if (i_15_ <= i_14_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[1][0] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_16_ = 0; i_16_ < i_3_; i_16_++) {
			for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
				if (i_5_ < 0 || i_5_ >= is_4_.length)
					i_5_++;
				else {
					if (i_17_ >= i_16_ << 1)
						is_4_[i_5_] = (byte) -1;
					i_5_++;
				}
			}
		}
		is[1][1] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_18_ = 0; i_18_ < i_3_; i_18_++) {
			for (int i_19_ = i_2_ - 1; i_19_ >= 0; i_19_--) {
				if (i_19_ <= i_18_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[1][2] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_20_ = i_3_ - 1; i_20_ >= 0; i_20_--) {
			for (int i_21_ = i_2_ - 1; i_21_ >= 0; i_21_--) {
				if (i_21_ >= i_20_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[1][3] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_22_ = i_3_ - 1; i_22_ >= 0; i_22_--) {
			for (int i_23_ = i_2_ - 1; i_23_ >= 0; i_23_--) {
				if (i_23_ <= i_22_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[2][0] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_24_ = i_3_ - 1; i_24_ >= 0; i_24_--) {
			for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
				if (i_25_ >= i_24_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[2][1] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_26_ = 0; i_26_ < i_3_; i_26_++) {
			for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
				if (i_27_ <= i_26_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[2][2] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_28_ = 0; i_28_ < i_3_; i_28_++) {
			for (int i_29_ = i_2_ - 1; i_29_ >= 0; i_29_--) {
				if (i_29_ >= i_28_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[2][3] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_30_ = i_3_ - 1; i_30_ >= 0; i_30_--) {
			for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
				if (i_31_ >= i_30_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[3][0] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_32_ = 0; i_32_ < i_3_; i_32_++) {
			for (int i_33_ = 0; i_33_ < i_2_; i_33_++) {
				if (i_33_ <= i_32_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[3][1] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_34_ = 0; i_34_ < i_3_; i_34_++) {
			for (int i_35_ = i_2_ - 1; i_35_ >= 0; i_35_--) {
				if (i_35_ >= i_34_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[3][2] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_36_ = i_3_ - 1; i_36_ >= 0; i_36_--) {
			for (int i_37_ = i_2_ - 1; i_37_ >= 0; i_37_--) {
				if (i_37_ <= i_36_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[3][3] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_38_ = i_3_ - 1; i_38_ >= 0; i_38_--) {
			for (int i_39_ = i_2_ - 1; i_39_ >= 0; i_39_--) {
				if (i_39_ >= i_38_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[4][0] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_40_ = i_3_ - 1; i_40_ >= 0; i_40_--) {
			for (int i_41_ = 0; i_41_ < i_2_; i_41_++) {
				if (i_41_ <= i_40_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[4][1] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_42_ = 0; i_42_ < i_3_; i_42_++) {
			for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
				if (i_43_ >= i_42_ >> 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[4][2] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_44_ = 0; i_44_ < i_3_; i_44_++) {
			for (int i_45_ = i_2_ - 1; i_45_ >= 0; i_45_--) {
				if (i_45_ <= i_44_ << 1)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[4][3] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_46_ = 0; i_46_ < i_3_; i_46_++) {
			for (int i_47_ = 0; i_47_ < i_2_; i_47_++) {
				if (i_47_ <= i_2_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[5][0] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_48_ = 0; i_48_ < i_3_; i_48_++) {
			for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
				if (i_48_ <= i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[5][1] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_50_ = 0; i_50_ < i_3_; i_50_++) {
			for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
				if (i_51_ >= i_2_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[5][2] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_52_ = 0; i_52_ < i_3_; i_52_++) {
			for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
				if (i_52_ >= i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[5][3] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_54_ = 0; i_54_ < i_3_; i_54_++) {
			for (int i_55_ = 0; i_55_ < i_2_; i_55_++) {
				if (i_55_ <= i_54_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[6][0] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_56_ = i_3_ - 1; i_56_ >= 0; i_56_--) {
			for (int i_57_ = 0; i_57_ < i_2_; i_57_++) {
				if (i_57_ <= i_56_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[6][1] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_58_ = i_3_ - 1; i_58_ >= 0; i_58_--) {
			for (int i_59_ = i_2_ - 1; i_59_ >= 0; i_59_--) {
				if (i_59_ <= i_58_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[6][2] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_60_ = 0; i_60_ < i_3_; i_60_++) {
			for (int i_61_ = i_2_ - 1; i_61_ >= 0; i_61_--) {
				if (i_61_ <= i_60_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[6][3] = is_4_;
		is_4_ = new byte[i_2_ * i_3_];
		i_5_ = 0;
		for (int i_62_ = 0; i_62_ < i_3_; i_62_++) {
			for (int i_63_ = 0; i_63_ < i_2_; i_63_++) {
				if (i_63_ >= i_62_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[7][0] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_64_ = i_3_ - 1; i_64_ >= 0; i_64_--) {
			for (int i_65_ = 0; i_65_ < i_2_; i_65_++) {
				if (i_65_ >= i_64_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[7][1] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_66_ = i_3_ - 1; i_66_ >= 0; i_66_--) {
			for (int i_67_ = i_2_ - 1; i_67_ >= 0; i_67_--) {
				if (i_67_ >= i_66_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[7][2] = is_4_;
		is_4_ = new byte[i_3_ * i_2_];
		i_5_ = 0;
		for (int i_68_ = 0; i_68_ < i_3_; i_68_++) {
			for (int i_69_ = i_2_ - 1; i_69_ >= 0; i_69_--) {
				if (i_69_ >= i_68_ - i_3_ / 2)
					is_4_[i_5_] = (byte) -1;
				i_5_++;
			}
		}
		is[7][3] = is_4_;
		return is;
	}
}
