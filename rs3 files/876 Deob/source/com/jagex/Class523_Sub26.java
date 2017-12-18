/* Class523_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub26 extends Class523 {
	boolean aBool10545;
	int anInt10546;
	int[] anIntArray10547;
	int anInt10548;
	int anInt10549;
	static int[] anIntArray10550;

	void method16143(int i, int i_0_) {
		if (i != 0 || i_0_ != 0) {
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_1_ = anIntArray10547.length;
			int i_2_ = i;
			int i_3_ = anInt10546 - 1;
			int i_4_ = anInt10546 * i_0_;
			int i_5_ = i_1_ - 1;
			for (int i_6_ = 0; i_6_ < i_1_; i_6_ += anInt10546) {
				int i_7_ = i_6_ + i_4_ & i_5_;
				for (int i_8_ = 0; i_8_ < anInt10546; i_8_++) {
					int i_9_ = i_6_ + i_8_;
					int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
					anIntArray10550[i_9_] = anIntArray10547[i_10_];
				}
			}
			int[] is = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is;
		}
	}

	int[] method16144() {
		return anIntArray10547;
	}

	int[] method16145() {
		return anIntArray10547;
	}

	int[] method16146() {
		return anIntArray10547;
	}

	int[] method16147() {
		return anIntArray10547;
	}

	void method16148(int i, int i_11_) {
		if (i != 0 || i_11_ != 0) {
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_12_ = anIntArray10547.length;
			int i_13_ = i;
			int i_14_ = anInt10546 - 1;
			int i_15_ = anInt10546 * i_11_;
			int i_16_ = i_12_ - 1;
			for (int i_17_ = 0; i_17_ < i_12_; i_17_ += anInt10546) {
				int i_18_ = i_17_ + i_15_ & i_16_;
				for (int i_19_ = 0; i_19_ < anInt10546; i_19_++) {
					int i_20_ = i_17_ + i_19_;
					int i_21_ = i_18_ + (i_19_ + i_13_ & i_14_);
					anIntArray10550[i_20_] = anIntArray10547[i_21_];
				}
			}
			int[] is = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is;
		}
	}

	void method16149(int i, int i_22_) {
		if (i != 0 || i_22_ != 0) {
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_23_ = anIntArray10547.length;
			int i_24_ = i;
			int i_25_ = anInt10546 - 1;
			int i_26_ = anInt10546 * i_22_;
			int i_27_ = i_23_ - 1;
			for (int i_28_ = 0; i_28_ < i_23_; i_28_ += anInt10546) {
				int i_29_ = i_28_ + i_26_ & i_27_;
				for (int i_30_ = 0; i_30_ < anInt10546; i_30_++) {
					int i_31_ = i_28_ + i_30_;
					int i_32_ = i_29_ + (i_30_ + i_24_ & i_25_);
					anIntArray10550[i_31_] = anIntArray10547[i_32_];
				}
			}
			int[] is = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is;
		}
	}

	void method16150(int i, int i_33_) {
		if (i != 0 || i_33_ != 0) {
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_34_ = anIntArray10547.length;
			int i_35_ = i;
			int i_36_ = anInt10546 - 1;
			int i_37_ = anInt10546 * i_33_;
			int i_38_ = i_34_ - 1;
			for (int i_39_ = 0; i_39_ < i_34_; i_39_ += anInt10546) {
				int i_40_ = i_39_ + i_37_ & i_38_;
				for (int i_41_ = 0; i_41_ < anInt10546; i_41_++) {
					int i_42_ = i_39_ + i_41_;
					int i_43_ = i_40_ + (i_41_ + i_35_ & i_36_);
					anIntArray10550[i_42_] = anIntArray10547[i_43_];
				}
			}
			int[] is = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is;
		}
	}

	void method16151(int i, int i_44_) {
		if (i != 0 || i_44_ != 0) {
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_45_ = anIntArray10547.length;
			int i_46_ = i;
			int i_47_ = anInt10546 - 1;
			int i_48_ = anInt10546 * i_44_;
			int i_49_ = i_45_ - 1;
			for (int i_50_ = 0; i_50_ < i_45_; i_50_ += anInt10546) {
				int i_51_ = i_50_ + i_48_ & i_49_;
				for (int i_52_ = 0; i_52_ < anInt10546; i_52_++) {
					int i_53_ = i_50_ + i_52_;
					int i_54_ = i_51_ + (i_52_ + i_46_ & i_47_);
					anIntArray10550[i_53_] = anIntArray10547[i_54_];
				}
			}
			int[] is = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is;
		}
	}

	void method16152(int i, int i_55_) {
		if (i != 0 || i_55_ != 0) {
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_56_ = anIntArray10547.length;
			int i_57_ = i;
			int i_58_ = anInt10546 - 1;
			int i_59_ = anInt10546 * i_55_;
			int i_60_ = i_56_ - 1;
			for (int i_61_ = 0; i_61_ < i_56_; i_61_ += anInt10546) {
				int i_62_ = i_61_ + i_59_ & i_60_;
				for (int i_63_ = 0; i_63_ < anInt10546; i_63_++) {
					int i_64_ = i_61_ + i_63_;
					int i_65_ = i_62_ + (i_63_ + i_57_ & i_58_);
					anIntArray10550[i_64_] = anIntArray10547[i_65_];
				}
			}
			int[] is = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is;
		}
	}

	Class523_Sub26(int i, int i_66_, int[] is, boolean bool) {
		anInt10549 = i;
		anInt10546 = i_66_;
		anIntArray10547 = is;
		if (bool) {
			int[] is_67_ = new int[anInt10546];
			int[] is_68_ = new int[anInt10546];
			int[] is_69_ = new int[anInt10546];
			int[] is_70_ = new int[anInt10546];
			if (anIntArray10550 == null || anIntArray10550.length != anIntArray10547.length)
				anIntArray10550 = new int[anIntArray10547.length];
			int i_71_ = anInt10546;
			int i_72_ = anInt10546;
			int i_73_ = i_71_ - 1;
			int i_74_ = i_72_ - 1;
			int i_75_ = i_71_ * i_72_;
			int i_77_;
			int i_76_ = i_77_ = 1 * i_71_;
			for (int i_78_ = 2; i_78_ >= 0; i_78_--) {
				for (int i_79_ = i_73_; i_79_ >= 0; i_79_--) {
					int i_80_ = anIntArray10547[--i_77_];
					is_67_[i_79_] += i_80_ >> 24 & 0xff;
					is_68_[i_79_] += i_80_ >> 16 & 0xff;
					is_69_[i_79_] += i_80_ >> 8 & 0xff;
					is_70_[i_79_] += i_80_ & 0xff;
				}
				if (i_77_ == 0)
					i_77_ = i_75_;
			}
			int i_81_ = i_75_;
			for (int i_82_ = i_74_; i_82_ >= 0; i_82_--) {
				int i_83_ = 1;
				int i_84_ = 1;
				int i_85_ = 0;
				int i_86_ = 0;
				int i_87_ = 0;
				int i_88_ = 0;
				for (int i_89_ = 2; i_89_ >= 0; i_89_--) {
					i_84_--;
					i_88_ += is_67_[i_84_];
					i_87_ += is_68_[i_84_];
					i_85_ += is_69_[i_84_];
					i_86_ += is_70_[i_84_];
					if (i_84_ == 0)
						i_84_ = i_71_;
				}
				for (int i_90_ = i_73_; i_90_ >= 0; i_90_--) {
					i_84_--;
					i_83_--;
					int i_91_ = i_88_ / 9;
					int i_92_ = i_87_ / 9;
					int i_93_ = i_85_ / 9;
					int i_94_ = i_86_ / 9;
					anIntArray10550[--i_81_] = i_91_ << 24 | i_92_ << 16 | i_93_ << 8 | i_94_;
					i_88_ += is_67_[i_84_] - is_67_[i_83_];
					i_87_ += is_68_[i_84_] - is_68_[i_83_];
					i_86_ += is_70_[i_84_] - is_70_[i_83_];
					i_85_ += is_69_[i_84_] - is_69_[i_83_];
					if (i_84_ == 0)
						i_84_ = i_71_;
					if (i_83_ == 0)
						i_83_ = i_71_;
				}
				for (int i_95_ = i_73_; i_95_ >= 0; i_95_--) {
					int i_96_ = anIntArray10547[--i_77_];
					int i_97_ = anIntArray10547[--i_76_];
					is_67_[i_95_] += (i_96_ >> 24 & 0xff) - (i_97_ >> 24 & 0xff);
					is_68_[i_95_] += (i_96_ >> 16 & 0xff) - (i_97_ >> 16 & 0xff);
					is_69_[i_95_] += (i_96_ >> 8 & 0xff) - (i_97_ >> 8 & 0xff);
					is_70_[i_95_] += (i_96_ & 0xff) - (i_97_ & 0xff);
				}
				if (i_77_ == 0)
					i_77_ = i_75_;
				if (i_76_ == 0)
					i_76_ = i_75_;
			}
			int[] is_98_ = anIntArray10547;
			anIntArray10547 = anIntArray10550;
			anIntArray10550 = is_98_;
		}
	}
}
