/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class182 {
	static int anInt2098;
	static int anInt2099;
	static int anInt2100;
	static int[] anIntArray2101;
	static int anInt2102;
	static int anInt2103;
	static int anInt2104;
	static int anInt2105;

	static void method3542() {
		anInt2099 = 0;
	}

	public static void method3543(Class178 class178, int[] is, int i, int[] is_0_, int[] is_1_) {
		method3545(class178, is, 0, is.length, i, is_0_, is_1_);
	}

	public static void method3544(Class178 class178, int[] is, int i, int[] is_2_, int[] is_3_) {
		method3545(class178, is, 0, is.length, i, is_2_, is_3_);
	}

	static void method3545(Class178 class178, int[] is, int i, int i_4_, int i_5_, int[] is_6_, int[] is_7_) {
		int[] is_8_ = new int[4];
		class178.method3075(is_8_);
		if (is_6_ != null && is_8_[3] - is_8_[1] != is_6_.length)
			throw new IllegalStateException();
		method3542();
		method3560(is, i, i_4_);
		method3548(is_8_[1]);
		while (method3550(is_8_[3])) {
			int i_9_ = anInt2103;
			int i_10_ = anInt2102;
			int i_11_ = anInt2098;
			if (is_6_ != null) {
				int i_12_ = i_11_ - is_8_[1];
				if (i_9_ < is_6_[i_12_] + is_8_[0])
					i_9_ = is_6_[i_12_] + is_8_[0];
				if (i_10_ > is_6_[i_12_] + is_7_[i_12_] + is_8_[0])
					i_10_ = is_6_[i_12_] + is_7_[i_12_] + is_8_[0];
				if (i_10_ - i_9_ <= 0)
					continue;
			}
			class178.method3087(i_9_, i_11_, i_10_ - i_9_, i_5_, 1);
		}
	}

	static boolean method3546(int i) {
		int i_13_ = anInt2104;
		int i_14_ = anInt2105;
		int i_15_ = anInt2098;
		int i_16_;
		for (/**/; i_14_ >= i_13_; i_14_ = i_16_) {
			anInt2098 = ++i_15_;
			if (i_15_ >= i)
				return false;
			i_16_ = anInt2100;
			for (/**/; i_13_ < anInt2099; i_13_ += 4) {
				int i_17_ = anIntArray2101[i_13_ + 1];
				if (i_15_ < i_17_)
					break;
				int i_18_ = anIntArray2101[i_13_];
				int i_19_ = anIntArray2101[i_13_ + 2];
				int i_20_ = anIntArray2101[i_13_ + 3];
				int i_21_ = (i_19_ - i_18_ << 16) / (i_20_ - i_17_);
				int i_22_ = (i_18_ << 16) + 32768;
				anIntArray2101[i_13_] = i_22_;
				anIntArray2101[i_13_ + 2] = i_21_;
			}
			for (int i_23_ = i_16_; i_23_ < i_13_; i_23_ += 4) {
				int i_24_ = anIntArray2101[i_23_ + 3];
				if (i_15_ >= i_24_) {
					anIntArray2101[i_23_] = anIntArray2101[i_16_];
					anIntArray2101[i_23_ + 1] = anIntArray2101[i_16_ + 1];
					anIntArray2101[i_23_ + 2] = anIntArray2101[i_16_ + 2];
					anIntArray2101[i_23_ + 3] = anIntArray2101[i_16_ + 3];
					i_16_ += 4;
				}
			}
			if (i_16_ == anInt2099) {
				anInt2099 = 0;
				return false;
			}
			method3551(i_16_, i_13_);
			anInt2100 = i_16_;
			anInt2104 = i_13_;
		}
		anInt2103 = anIntArray2101[i_14_] >> 16;
		anInt2102 = anIntArray2101[i_14_ + 4] >> 16;
		anIntArray2101[i_14_] += anIntArray2101[i_14_ + 2];
		anIntArray2101[i_14_ + 4] += anIntArray2101[i_14_ + 6];
		i_14_ += 8;
		anInt2105 = i_14_;
		return true;
	}

	static void method3547(int i, int i_25_) {
		if (i_25_ > i + 4) {
			int i_26_ = i;
			int i_27_ = anIntArray2101[i_26_];
			int i_28_ = anIntArray2101[i_26_ + 1];
			int i_29_ = anIntArray2101[i_26_ + 2];
			int i_30_ = anIntArray2101[i_26_ + 3];
			for (int i_31_ = i + 4; i_31_ < i_25_; i_31_ += 4) {
				int i_32_ = anIntArray2101[i_31_ + 1];
				if (i_32_ < i_28_) {
					anIntArray2101[i_26_] = anIntArray2101[i_31_];
					anIntArray2101[i_26_ + 1] = i_32_;
					anIntArray2101[i_26_ + 2] = anIntArray2101[i_31_ + 2];
					anIntArray2101[i_26_ + 3] = anIntArray2101[i_31_ + 3];
					i_26_ += 4;
					anIntArray2101[i_31_] = anIntArray2101[i_26_];
					anIntArray2101[i_31_ + 1] = anIntArray2101[i_26_ + 1];
					anIntArray2101[i_31_ + 2] = anIntArray2101[i_26_ + 2];
					anIntArray2101[i_31_ + 3] = anIntArray2101[i_26_ + 3];
				}
			}
			anIntArray2101[i_26_] = i_27_;
			anIntArray2101[i_26_ + 1] = i_28_;
			anIntArray2101[i_26_ + 2] = i_29_;
			anIntArray2101[i_26_ + 3] = i_30_;
			method3547(i, i_26_);
			method3547(i_26_ + 4, i_25_);
		}
	}

	static void method3548(int i) {
		if (anInt2099 < 0) {
			anInt2105 = 0;
			anInt2104 = 0;
			anInt2100 = 0;
			anInt2098 = 2147483646;
		} else {
			method3547(0, anInt2099);
			int i_33_ = anIntArray2101[1];
			if (i_33_ < i)
				i_33_ = i;
			int i_34_ = 0;
			int i_35_;
			for (i_35_ = 0; i_35_ < anInt2099; i_35_ += 4) {
				int i_36_ = anIntArray2101[i_35_ + 1];
				if (i_33_ < i_36_)
					break;
				int i_37_ = anIntArray2101[i_35_];
				int i_38_ = anIntArray2101[i_35_ + 2];
				int i_39_ = anIntArray2101[i_35_ + 3];
				int i_40_ = (i_38_ - i_37_ << 16) / (i_39_ - i_36_);
				int i_41_ = (i_37_ << 16) + 32768;
				anIntArray2101[i_35_] = i_41_ + (i_33_ - i_36_) * i_40_;
				anIntArray2101[i_35_ + 2] = i_40_;
			}
			anInt2100 = i_34_;
			anInt2104 = i_35_;
			anInt2105 = i_35_;
			anInt2098 = i_33_ - 1;
		}
	}

	static void method3549() {
		anInt2099 = 0;
	}

	static boolean method3550(int i) {
		int i_42_ = anInt2104;
		int i_43_ = anInt2105;
		int i_44_ = anInt2098;
		int i_45_;
		for (/**/; i_43_ >= i_42_; i_43_ = i_45_) {
			anInt2098 = ++i_44_;
			if (i_44_ >= i)
				return false;
			i_45_ = anInt2100;
			for (/**/; i_42_ < anInt2099; i_42_ += 4) {
				int i_46_ = anIntArray2101[i_42_ + 1];
				if (i_44_ < i_46_)
					break;
				int i_47_ = anIntArray2101[i_42_];
				int i_48_ = anIntArray2101[i_42_ + 2];
				int i_49_ = anIntArray2101[i_42_ + 3];
				int i_50_ = (i_48_ - i_47_ << 16) / (i_49_ - i_46_);
				int i_51_ = (i_47_ << 16) + 32768;
				anIntArray2101[i_42_] = i_51_;
				anIntArray2101[i_42_ + 2] = i_50_;
			}
			for (int i_52_ = i_45_; i_52_ < i_42_; i_52_ += 4) {
				int i_53_ = anIntArray2101[i_52_ + 3];
				if (i_44_ >= i_53_) {
					anIntArray2101[i_52_] = anIntArray2101[i_45_];
					anIntArray2101[i_52_ + 1] = anIntArray2101[i_45_ + 1];
					anIntArray2101[i_52_ + 2] = anIntArray2101[i_45_ + 2];
					anIntArray2101[i_52_ + 3] = anIntArray2101[i_45_ + 3];
					i_45_ += 4;
				}
			}
			if (i_45_ == anInt2099) {
				anInt2099 = 0;
				return false;
			}
			method3551(i_45_, i_42_);
			anInt2100 = i_45_;
			anInt2104 = i_42_;
		}
		anInt2103 = anIntArray2101[i_43_] >> 16;
		anInt2102 = anIntArray2101[i_43_ + 4] >> 16;
		anIntArray2101[i_43_] += anIntArray2101[i_43_ + 2];
		anIntArray2101[i_43_ + 4] += anIntArray2101[i_43_ + 6];
		i_43_ += 8;
		anInt2105 = i_43_;
		return true;
	}

	static void method3551(int i, int i_54_) {
		for (/**/; i_54_ >= i + 8; i_54_ -= 4) {
			boolean bool = true;
			for (int i_55_ = i + 4; i_55_ < i_54_; i_55_ += 4) {
				int i_56_ = anIntArray2101[i_55_ - 4];
				int i_57_ = anIntArray2101[i_55_];
				if (i_56_ > i_57_) {
					bool = false;
					anIntArray2101[i_55_ - 4] = i_57_;
					anIntArray2101[i_55_] = i_56_;
					i_56_ = anIntArray2101[i_55_ - 2];
					anIntArray2101[i_55_ - 2] = anIntArray2101[i_55_ + 2];
					anIntArray2101[i_55_ + 2] = i_56_;
					i_56_ = anIntArray2101[i_55_ - 1];
					anIntArray2101[i_55_ - 1] = anIntArray2101[i_55_ + 3];
					anIntArray2101[i_55_ + 3] = i_56_;
				}
			}
			if (bool)
				break;
		}
	}

	public static void method3552(Class178 class178, int[] is, int i) {
		method3545(class178, is, 0, is.length, i, null, null);
	}

	Class182() throws Throwable {
		throw new Error();
	}

	public static void method3553(Class178 class178, int[] is, int i, int[] is_58_, int[] is_59_) {
		method3545(class178, is, 0, is.length, i, is_58_, is_59_);
	}

	static void method3554(Class178 class178, int[] is, int i, int i_60_, int i_61_, int[] is_62_, int[] is_63_) {
		int[] is_64_ = new int[4];
		class178.method3075(is_64_);
		if (is_62_ != null && is_64_[3] - is_64_[1] != is_62_.length)
			throw new IllegalStateException();
		method3542();
		method3560(is, i, i_60_);
		method3548(is_64_[1]);
		while (method3550(is_64_[3])) {
			int i_65_ = anInt2103;
			int i_66_ = anInt2102;
			int i_67_ = anInt2098;
			if (is_62_ != null) {
				int i_68_ = i_67_ - is_64_[1];
				if (i_65_ < is_62_[i_68_] + is_64_[0])
					i_65_ = is_62_[i_68_] + is_64_[0];
				if (i_66_ > is_62_[i_68_] + is_63_[i_68_] + is_64_[0])
					i_66_ = is_62_[i_68_] + is_63_[i_68_] + is_64_[0];
				if (i_66_ - i_65_ <= 0)
					continue;
			}
			class178.method3087(i_65_, i_67_, i_66_ - i_65_, i_61_, 1);
		}
	}

	static void method3555(Class178 class178, int[] is, int i, int i_69_, int i_70_, int[] is_71_, int[] is_72_) {
		int[] is_73_ = new int[4];
		class178.method3075(is_73_);
		if (is_71_ != null && is_73_[3] - is_73_[1] != is_71_.length)
			throw new IllegalStateException();
		method3542();
		method3560(is, i, i_69_);
		method3548(is_73_[1]);
		while (method3550(is_73_[3])) {
			int i_74_ = anInt2103;
			int i_75_ = anInt2102;
			int i_76_ = anInt2098;
			if (is_71_ != null) {
				int i_77_ = i_76_ - is_73_[1];
				if (i_74_ < is_71_[i_77_] + is_73_[0])
					i_74_ = is_71_[i_77_] + is_73_[0];
				if (i_75_ > is_71_[i_77_] + is_72_[i_77_] + is_73_[0])
					i_75_ = is_71_[i_77_] + is_72_[i_77_] + is_73_[0];
				if (i_75_ - i_74_ <= 0)
					continue;
			}
			class178.method3087(i_74_, i_76_, i_75_ - i_74_, i_70_, 1);
		}
	}

	static void method3556(Class178 class178, int[] is, int i, int i_78_, int i_79_, int[] is_80_, int[] is_81_) {
		int[] is_82_ = new int[4];
		class178.method3075(is_82_);
		if (is_80_ != null && is_82_[3] - is_82_[1] != is_80_.length)
			throw new IllegalStateException();
		method3542();
		method3560(is, i, i_78_);
		method3548(is_82_[1]);
		while (method3550(is_82_[3])) {
			int i_83_ = anInt2103;
			int i_84_ = anInt2102;
			int i_85_ = anInt2098;
			if (is_80_ != null) {
				int i_86_ = i_85_ - is_82_[1];
				if (i_83_ < is_80_[i_86_] + is_82_[0])
					i_83_ = is_80_[i_86_] + is_82_[0];
				if (i_84_ > is_80_[i_86_] + is_81_[i_86_] + is_82_[0])
					i_84_ = is_80_[i_86_] + is_81_[i_86_] + is_82_[0];
				if (i_84_ - i_83_ <= 0)
					continue;
			}
			class178.method3087(i_83_, i_85_, i_84_ - i_83_, i_79_, 1);
		}
	}

	public static void method3557(Class178 class178, int[] is, int i) {
		method3545(class178, is, 0, is.length, i, null, null);
	}

	static void method3558() {
		anInt2099 = 0;
	}

	static void method3559(int[] is, int i, int i_87_) {
		int i_88_ = anInt2099 + (i_87_ << 1);
		if (anIntArray2101 == null || anIntArray2101.length < i_88_) {
			int[] is_89_ = new int[i_88_];
			for (int i_90_ = 0; i_90_ < anInt2099; i_90_++)
				is_89_[i_90_] = anIntArray2101[i_90_];
			anIntArray2101 = is_89_;
		}
		i_87_ += i;
		int i_91_ = i_87_ - 2;
		for (int i_92_ = i; i_92_ < i_87_; i_92_ += 2) {
			int i_93_ = is[i_91_ + 1];
			int i_94_ = is[i_92_ + 1];
			if (i_93_ < i_94_) {
				anIntArray2101[anInt2099++] = is[i_91_];
				anIntArray2101[anInt2099++] = i_93_;
				anIntArray2101[anInt2099++] = is[i_92_];
				anIntArray2101[anInt2099++] = i_94_;
			} else if (i_94_ < i_93_) {
				anIntArray2101[anInt2099++] = is[i_92_];
				anIntArray2101[anInt2099++] = i_94_;
				anIntArray2101[anInt2099++] = is[i_91_];
				anIntArray2101[anInt2099++] = i_93_;
			}
			i_91_ = i_92_;
		}
	}

	static void method3560(int[] is, int i, int i_95_) {
		int i_96_ = anInt2099 + (i_95_ << 1);
		if (anIntArray2101 == null || anIntArray2101.length < i_96_) {
			int[] is_97_ = new int[i_96_];
			for (int i_98_ = 0; i_98_ < anInt2099; i_98_++)
				is_97_[i_98_] = anIntArray2101[i_98_];
			anIntArray2101 = is_97_;
		}
		i_95_ += i;
		int i_99_ = i_95_ - 2;
		for (int i_100_ = i; i_100_ < i_95_; i_100_ += 2) {
			int i_101_ = is[i_99_ + 1];
			int i_102_ = is[i_100_ + 1];
			if (i_101_ < i_102_) {
				anIntArray2101[anInt2099++] = is[i_99_];
				anIntArray2101[anInt2099++] = i_101_;
				anIntArray2101[anInt2099++] = is[i_100_];
				anIntArray2101[anInt2099++] = i_102_;
			} else if (i_102_ < i_101_) {
				anIntArray2101[anInt2099++] = is[i_100_];
				anIntArray2101[anInt2099++] = i_102_;
				anIntArray2101[anInt2099++] = is[i_99_];
				anIntArray2101[anInt2099++] = i_101_;
			}
			i_99_ = i_100_;
		}
	}

	static void method3561(int i) {
		if (anInt2099 < 0) {
			anInt2105 = 0;
			anInt2104 = 0;
			anInt2100 = 0;
			anInt2098 = 2147483646;
		} else {
			method3547(0, anInt2099);
			int i_103_ = anIntArray2101[1];
			if (i_103_ < i)
				i_103_ = i;
			int i_104_ = 0;
			int i_105_;
			for (i_105_ = 0; i_105_ < anInt2099; i_105_ += 4) {
				int i_106_ = anIntArray2101[i_105_ + 1];
				if (i_103_ < i_106_)
					break;
				int i_107_ = anIntArray2101[i_105_];
				int i_108_ = anIntArray2101[i_105_ + 2];
				int i_109_ = anIntArray2101[i_105_ + 3];
				int i_110_ = (i_108_ - i_107_ << 16) / (i_109_ - i_106_);
				int i_111_ = (i_107_ << 16) + 32768;
				anIntArray2101[i_105_] = i_111_ + (i_103_ - i_106_) * i_110_;
				anIntArray2101[i_105_ + 2] = i_110_;
			}
			anInt2100 = i_104_;
			anInt2104 = i_105_;
			anInt2105 = i_105_;
			anInt2098 = i_103_ - 1;
		}
	}

	static void method3562(int i) {
		if (anInt2099 < 0) {
			anInt2105 = 0;
			anInt2104 = 0;
			anInt2100 = 0;
			anInt2098 = 2147483646;
		} else {
			method3547(0, anInt2099);
			int i_112_ = anIntArray2101[1];
			if (i_112_ < i)
				i_112_ = i;
			int i_113_ = 0;
			int i_114_;
			for (i_114_ = 0; i_114_ < anInt2099; i_114_ += 4) {
				int i_115_ = anIntArray2101[i_114_ + 1];
				if (i_112_ < i_115_)
					break;
				int i_116_ = anIntArray2101[i_114_];
				int i_117_ = anIntArray2101[i_114_ + 2];
				int i_118_ = anIntArray2101[i_114_ + 3];
				int i_119_ = (i_117_ - i_116_ << 16) / (i_118_ - i_115_);
				int i_120_ = (i_116_ << 16) + 32768;
				anIntArray2101[i_114_] = i_120_ + (i_112_ - i_115_) * i_119_;
				anIntArray2101[i_114_ + 2] = i_119_;
			}
			anInt2100 = i_113_;
			anInt2104 = i_114_;
			anInt2105 = i_114_;
			anInt2098 = i_112_ - 1;
		}
	}

	static void method3563(int[] is, int i, int i_121_) {
		int i_122_ = anInt2099 + (i_121_ << 1);
		if (anIntArray2101 == null || anIntArray2101.length < i_122_) {
			int[] is_123_ = new int[i_122_];
			for (int i_124_ = 0; i_124_ < anInt2099; i_124_++)
				is_123_[i_124_] = anIntArray2101[i_124_];
			anIntArray2101 = is_123_;
		}
		i_121_ += i;
		int i_125_ = i_121_ - 2;
		for (int i_126_ = i; i_126_ < i_121_; i_126_ += 2) {
			int i_127_ = is[i_125_ + 1];
			int i_128_ = is[i_126_ + 1];
			if (i_127_ < i_128_) {
				anIntArray2101[anInt2099++] = is[i_125_];
				anIntArray2101[anInt2099++] = i_127_;
				anIntArray2101[anInt2099++] = is[i_126_];
				anIntArray2101[anInt2099++] = i_128_;
			} else if (i_128_ < i_127_) {
				anIntArray2101[anInt2099++] = is[i_126_];
				anIntArray2101[anInt2099++] = i_128_;
				anIntArray2101[anInt2099++] = is[i_125_];
				anIntArray2101[anInt2099++] = i_127_;
			}
			i_125_ = i_126_;
		}
	}

	static boolean method3564(int i) {
		int i_129_ = anInt2104;
		int i_130_ = anInt2105;
		int i_131_ = anInt2098;
		int i_132_;
		for (/**/; i_130_ >= i_129_; i_130_ = i_132_) {
			anInt2098 = ++i_131_;
			if (i_131_ >= i)
				return false;
			i_132_ = anInt2100;
			for (/**/; i_129_ < anInt2099; i_129_ += 4) {
				int i_133_ = anIntArray2101[i_129_ + 1];
				if (i_131_ < i_133_)
					break;
				int i_134_ = anIntArray2101[i_129_];
				int i_135_ = anIntArray2101[i_129_ + 2];
				int i_136_ = anIntArray2101[i_129_ + 3];
				int i_137_ = (i_135_ - i_134_ << 16) / (i_136_ - i_133_);
				int i_138_ = (i_134_ << 16) + 32768;
				anIntArray2101[i_129_] = i_138_;
				anIntArray2101[i_129_ + 2] = i_137_;
			}
			for (int i_139_ = i_132_; i_139_ < i_129_; i_139_ += 4) {
				int i_140_ = anIntArray2101[i_139_ + 3];
				if (i_131_ >= i_140_) {
					anIntArray2101[i_139_] = anIntArray2101[i_132_];
					anIntArray2101[i_139_ + 1] = anIntArray2101[i_132_ + 1];
					anIntArray2101[i_139_ + 2] = anIntArray2101[i_132_ + 2];
					anIntArray2101[i_139_ + 3] = anIntArray2101[i_132_ + 3];
					i_132_ += 4;
				}
			}
			if (i_132_ == anInt2099) {
				anInt2099 = 0;
				return false;
			}
			method3551(i_132_, i_129_);
			anInt2100 = i_132_;
			anInt2104 = i_129_;
		}
		anInt2103 = anIntArray2101[i_130_] >> 16;
		anInt2102 = anIntArray2101[i_130_ + 4] >> 16;
		anIntArray2101[i_130_] += anIntArray2101[i_130_ + 2];
		anIntArray2101[i_130_ + 4] += anIntArray2101[i_130_ + 6];
		i_130_ += 8;
		anInt2105 = i_130_;
		return true;
	}

	static void method3565(int i, int i_141_) {
		if (i_141_ > i + 4) {
			int i_142_ = i;
			int i_143_ = anIntArray2101[i_142_];
			int i_144_ = anIntArray2101[i_142_ + 1];
			int i_145_ = anIntArray2101[i_142_ + 2];
			int i_146_ = anIntArray2101[i_142_ + 3];
			for (int i_147_ = i + 4; i_147_ < i_141_; i_147_ += 4) {
				int i_148_ = anIntArray2101[i_147_ + 1];
				if (i_148_ < i_144_) {
					anIntArray2101[i_142_] = anIntArray2101[i_147_];
					anIntArray2101[i_142_ + 1] = i_148_;
					anIntArray2101[i_142_ + 2] = anIntArray2101[i_147_ + 2];
					anIntArray2101[i_142_ + 3] = anIntArray2101[i_147_ + 3];
					i_142_ += 4;
					anIntArray2101[i_147_] = anIntArray2101[i_142_];
					anIntArray2101[i_147_ + 1] = anIntArray2101[i_142_ + 1];
					anIntArray2101[i_147_ + 2] = anIntArray2101[i_142_ + 2];
					anIntArray2101[i_147_ + 3] = anIntArray2101[i_142_ + 3];
				}
			}
			anIntArray2101[i_142_] = i_143_;
			anIntArray2101[i_142_ + 1] = i_144_;
			anIntArray2101[i_142_ + 2] = i_145_;
			anIntArray2101[i_142_ + 3] = i_146_;
			method3547(i, i_142_);
			method3547(i_142_ + 4, i_141_);
		}
	}

	static void method3566(int i, int i_149_) {
		if (i_149_ > i + 4) {
			int i_150_ = i;
			int i_151_ = anIntArray2101[i_150_];
			int i_152_ = anIntArray2101[i_150_ + 1];
			int i_153_ = anIntArray2101[i_150_ + 2];
			int i_154_ = anIntArray2101[i_150_ + 3];
			for (int i_155_ = i + 4; i_155_ < i_149_; i_155_ += 4) {
				int i_156_ = anIntArray2101[i_155_ + 1];
				if (i_156_ < i_152_) {
					anIntArray2101[i_150_] = anIntArray2101[i_155_];
					anIntArray2101[i_150_ + 1] = i_156_;
					anIntArray2101[i_150_ + 2] = anIntArray2101[i_155_ + 2];
					anIntArray2101[i_150_ + 3] = anIntArray2101[i_155_ + 3];
					i_150_ += 4;
					anIntArray2101[i_155_] = anIntArray2101[i_150_];
					anIntArray2101[i_155_ + 1] = anIntArray2101[i_150_ + 1];
					anIntArray2101[i_155_ + 2] = anIntArray2101[i_150_ + 2];
					anIntArray2101[i_155_ + 3] = anIntArray2101[i_150_ + 3];
				}
			}
			anIntArray2101[i_150_] = i_151_;
			anIntArray2101[i_150_ + 1] = i_152_;
			anIntArray2101[i_150_ + 2] = i_153_;
			anIntArray2101[i_150_ + 3] = i_154_;
			method3547(i, i_150_);
			method3547(i_150_ + 4, i_149_);
		}
	}

	static void method3567(int i, int i_157_) {
		if (i_157_ > i + 4) {
			int i_158_ = i;
			int i_159_ = anIntArray2101[i_158_];
			int i_160_ = anIntArray2101[i_158_ + 1];
			int i_161_ = anIntArray2101[i_158_ + 2];
			int i_162_ = anIntArray2101[i_158_ + 3];
			for (int i_163_ = i + 4; i_163_ < i_157_; i_163_ += 4) {
				int i_164_ = anIntArray2101[i_163_ + 1];
				if (i_164_ < i_160_) {
					anIntArray2101[i_158_] = anIntArray2101[i_163_];
					anIntArray2101[i_158_ + 1] = i_164_;
					anIntArray2101[i_158_ + 2] = anIntArray2101[i_163_ + 2];
					anIntArray2101[i_158_ + 3] = anIntArray2101[i_163_ + 3];
					i_158_ += 4;
					anIntArray2101[i_163_] = anIntArray2101[i_158_];
					anIntArray2101[i_163_ + 1] = anIntArray2101[i_158_ + 1];
					anIntArray2101[i_163_ + 2] = anIntArray2101[i_158_ + 2];
					anIntArray2101[i_163_ + 3] = anIntArray2101[i_158_ + 3];
				}
			}
			anIntArray2101[i_158_] = i_159_;
			anIntArray2101[i_158_ + 1] = i_160_;
			anIntArray2101[i_158_ + 2] = i_161_;
			anIntArray2101[i_158_ + 3] = i_162_;
			method3547(i, i_158_);
			method3547(i_158_ + 4, i_157_);
		}
	}

	static void method3568(int i, int i_165_) {
		if (i_165_ > i + 4) {
			int i_166_ = i;
			int i_167_ = anIntArray2101[i_166_];
			int i_168_ = anIntArray2101[i_166_ + 1];
			int i_169_ = anIntArray2101[i_166_ + 2];
			int i_170_ = anIntArray2101[i_166_ + 3];
			for (int i_171_ = i + 4; i_171_ < i_165_; i_171_ += 4) {
				int i_172_ = anIntArray2101[i_171_ + 1];
				if (i_172_ < i_168_) {
					anIntArray2101[i_166_] = anIntArray2101[i_171_];
					anIntArray2101[i_166_ + 1] = i_172_;
					anIntArray2101[i_166_ + 2] = anIntArray2101[i_171_ + 2];
					anIntArray2101[i_166_ + 3] = anIntArray2101[i_171_ + 3];
					i_166_ += 4;
					anIntArray2101[i_171_] = anIntArray2101[i_166_];
					anIntArray2101[i_171_ + 1] = anIntArray2101[i_166_ + 1];
					anIntArray2101[i_171_ + 2] = anIntArray2101[i_166_ + 2];
					anIntArray2101[i_171_ + 3] = anIntArray2101[i_166_ + 3];
				}
			}
			anIntArray2101[i_166_] = i_167_;
			anIntArray2101[i_166_ + 1] = i_168_;
			anIntArray2101[i_166_ + 2] = i_169_;
			anIntArray2101[i_166_ + 3] = i_170_;
			method3547(i, i_166_);
			method3547(i_166_ + 4, i_165_);
		}
	}

	static void method3569(int i, int i_173_) {
		for (/**/; i_173_ >= i + 8; i_173_ -= 4) {
			boolean bool = true;
			for (int i_174_ = i + 4; i_174_ < i_173_; i_174_ += 4) {
				int i_175_ = anIntArray2101[i_174_ - 4];
				int i_176_ = anIntArray2101[i_174_];
				if (i_175_ > i_176_) {
					bool = false;
					anIntArray2101[i_174_ - 4] = i_176_;
					anIntArray2101[i_174_] = i_175_;
					i_175_ = anIntArray2101[i_174_ - 2];
					anIntArray2101[i_174_ - 2] = anIntArray2101[i_174_ + 2];
					anIntArray2101[i_174_ + 2] = i_175_;
					i_175_ = anIntArray2101[i_174_ - 1];
					anIntArray2101[i_174_ - 1] = anIntArray2101[i_174_ + 3];
					anIntArray2101[i_174_ + 3] = i_175_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method3570(int i, int i_177_) {
		for (/**/; i_177_ >= i + 8; i_177_ -= 4) {
			boolean bool = true;
			for (int i_178_ = i + 4; i_178_ < i_177_; i_178_ += 4) {
				int i_179_ = anIntArray2101[i_178_ - 4];
				int i_180_ = anIntArray2101[i_178_];
				if (i_179_ > i_180_) {
					bool = false;
					anIntArray2101[i_178_ - 4] = i_180_;
					anIntArray2101[i_178_] = i_179_;
					i_179_ = anIntArray2101[i_178_ - 2];
					anIntArray2101[i_178_ - 2] = anIntArray2101[i_178_ + 2];
					anIntArray2101[i_178_ + 2] = i_179_;
					i_179_ = anIntArray2101[i_178_ - 1];
					anIntArray2101[i_178_ - 1] = anIntArray2101[i_178_ + 3];
					anIntArray2101[i_178_ + 3] = i_179_;
				}
			}
			if (bool)
				break;
		}
	}

	static void method3571(int i, int i_181_) {
		for (/**/; i_181_ >= i + 8; i_181_ -= 4) {
			boolean bool = true;
			for (int i_182_ = i + 4; i_182_ < i_181_; i_182_ += 4) {
				int i_183_ = anIntArray2101[i_182_ - 4];
				int i_184_ = anIntArray2101[i_182_];
				if (i_183_ > i_184_) {
					bool = false;
					anIntArray2101[i_182_ - 4] = i_184_;
					anIntArray2101[i_182_] = i_183_;
					i_183_ = anIntArray2101[i_182_ - 2];
					anIntArray2101[i_182_ - 2] = anIntArray2101[i_182_ + 2];
					anIntArray2101[i_182_ + 2] = i_183_;
					i_183_ = anIntArray2101[i_182_ - 1];
					anIntArray2101[i_182_ - 1] = anIntArray2101[i_182_ + 3];
					anIntArray2101[i_182_ + 3] = i_183_;
				}
			}
			if (bool)
				break;
		}
	}
}
