/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class167 {
	protected boolean aBool1796 = false;
	static final float aFloat1797 = 3.1415927F;
	public boolean aBool1798 = true;

	static int method2674(float f, float f_0_, float f_1_) {
		float f_2_ = f < 0.0F ? -f : f;
		float f_3_ = f_0_ < 0.0F ? -f_0_ : f_0_;
		float f_4_ = f_1_ < 0.0F ? -f_1_ : f_1_;
		if (f_3_ > f_2_ && f_3_ > f_4_) {
			if (f_0_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_4_ > f_2_ && f_4_ > f_3_) {
			if (f_1_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	static void method2675(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, float[] fs, int i_10_, float f, float[] fs_11_) {
		i -= i_7_;
		i_5_ -= i_8_;
		i_6_ -= i_9_;
		float f_12_ = (float) i * fs[0] + (float) i_5_ * fs[1] + (float) i_6_ * fs[2];
		float f_13_ = (float) i * fs[3] + (float) i_5_ * fs[4] + (float) i_6_ * fs[5];
		float f_14_ = (float) i * fs[6] + (float) i_5_ * fs[7] + (float) i_6_ * fs[8];
		float f_15_ = (float) Math.sqrt((double) (f_12_ * f_12_ + f_13_ * f_13_ + f_14_ * f_14_));
		float f_16_ = ((float) Math.atan2((double) f_12_, (double) f_14_) / 6.2831855F + 0.5F);
		float f_17_ = ((float) Math.asin((double) (f_13_ / f_15_)) / 3.1415927F + 0.5F + f);
		if (i_10_ == 1) {
			float f_18_ = f_16_;
			f_16_ = -f_17_;
			f_17_ = f_18_;
		} else if (i_10_ == 2) {
			f_16_ = -f_16_;
			f_17_ = -f_17_;
		} else if (i_10_ == 3) {
			float f_19_ = f_16_;
			f_16_ = f_17_;
			f_17_ = -f_19_;
		}
		fs_11_[0] = f_16_;
		fs_11_[1] = f_17_;
	}

	public abstract int method2676();

	static int method2677(float f, float f_20_, float f_21_) {
		float f_22_ = f < 0.0F ? -f : f;
		float f_23_ = f_20_ < 0.0F ? -f_20_ : f_20_;
		float f_24_ = f_21_ < 0.0F ? -f_21_ : f_21_;
		if (f_23_ > f_22_ && f_23_ > f_24_) {
			if (f_20_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_24_ > f_22_ && f_24_ > f_23_) {
			if (f_21_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	public abstract void method2678(Class167 class167_25_, int i, int i_26_, int i_27_, boolean bool);

	Class183 method2679(Class179 class179, int[] is, int i) {
		int[] is_28_ = null;
		int[] is_29_ = null;
		int[] is_30_ = null;
		float[][] fs = null;
		if (class179.aShortArray1989 != null) {
			int i_31_ = class179.anInt1982;
			int[] is_32_ = new int[i_31_];
			int[] is_33_ = new int[i_31_];
			int[] is_34_ = new int[i_31_];
			int[] is_35_ = new int[i_31_];
			int[] is_36_ = new int[i_31_];
			int[] is_37_ = new int[i_31_];
			for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
				is_32_[i_38_] = 2147483647;
				is_33_[i_38_] = -2147483647;
				is_34_[i_38_] = 2147483647;
				is_35_[i_38_] = -2147483647;
				is_36_[i_38_] = 2147483647;
				is_37_[i_38_] = -2147483647;
			}
			for (int i_39_ = 0; i_39_ < i; i_39_++) {
				int i_40_ = is[i_39_];
				short i_41_ = class179.aShortArray1989[i_40_];
				if (i_41_ > -1 && i_41_ < 32766) {
					for (int i_42_ = 0; i_42_ < 3; i_42_++) {
						short i_43_;
						if (i_42_ == 0)
							i_43_ = class179.aShortArray1949[i_40_];
						else if (i_42_ == 1)
							i_43_ = class179.aShortArray1966[i_40_];
						else
							i_43_ = class179.aShortArray1967[i_40_];
						int i_44_ = class179.anIntArray1981[i_43_];
						int i_45_ = class179.anIntArray1973[i_43_];
						int i_46_ = class179.anIntArray1957[i_43_];
						if (i_44_ < is_32_[i_41_])
							is_32_[i_41_] = i_44_;
						if (i_44_ > is_33_[i_41_])
							is_33_[i_41_] = i_44_;
						if (i_45_ < is_34_[i_41_])
							is_34_[i_41_] = i_45_;
						if (i_45_ > is_35_[i_41_])
							is_35_[i_41_] = i_45_;
						if (i_46_ < is_36_[i_41_])
							is_36_[i_41_] = i_46_;
						if (i_46_ > is_37_[i_41_])
							is_37_[i_41_] = i_46_;
					}
				}
			}
			is_28_ = new int[i_31_];
			is_29_ = new int[i_31_];
			is_30_ = new int[i_31_];
			fs = new float[i_31_][];
			for (int i_47_ = 0; i_47_ < i_31_; i_47_++) {
				byte i_48_ = class179.aByteArray1983[i_47_];
				if (i_48_ > 0) {
					is_28_[i_47_] = (is_32_[i_47_] + is_33_[i_47_]) / 2;
					is_29_[i_47_] = (is_34_[i_47_] + is_35_[i_47_]) / 2;
					is_30_[i_47_] = (is_36_[i_47_] + is_37_[i_47_]) / 2;
					float f;
					float f_49_;
					float f_50_;
					if (i_48_ == 1) {
						int i_51_ = class179.anIntArray1987[i_47_];
						if (i_51_ == 0) {
							f = 1.0F;
							f_50_ = 1.0F;
						} else if (i_51_ > 0) {
							f = 1.0F;
							f_50_ = (float) i_51_ / 1024.0F;
						} else {
							f_50_ = 1.0F;
							f = (float) -i_51_ / 1024.0F;
						}
						f_49_ = 64.0F / (float) class179.anIntArray1988[i_47_];
					} else if (i_48_ == 2) {
						f = 64.0F / (float) class179.anIntArray1987[i_47_];
						f_49_ = 64.0F / (float) class179.anIntArray1988[i_47_];
						f_50_ = 64.0F / (float) class179.anIntArray1955[i_47_];
					} else {
						f = (float) class179.anIntArray1987[i_47_] / 1024.0F;
						f_49_ = (float) class179.anIntArray1988[i_47_] / 1024.0F;
						f_50_ = (float) class179.anIntArray1955[i_47_] / 1024.0F;
					}
					fs[i_47_] = method2780(class179.aShortArray1977[i_47_], class179.aShortArray1985[i_47_], class179.aShortArray1986[i_47_], class179.aByteArray1954[i_47_] & 0xff, f, f_49_, f_50_);
				}
			}
		}
		return new Class183(this, is_28_, is_29_, is_30_, fs);
	}

	public abstract void method2680();

	public abstract Class167 method2681(byte i, int i_52_, boolean bool);

	public abstract void method2682(int i);

	public abstract int method2683();

	public abstract void method2684();

	public abstract void method2685(int i);

	public abstract Class143[] method2686();

	public abstract void method2687();

	public abstract void method2688(int i);

	public abstract void method2689(int i, int i_53_, int i_54_);

	public abstract void method2690();

	public abstract void method2691(int i, int i_55_, int i_56_);

	public abstract void method2692(int i, int i_57_, Class142 class142, Class142 class142_58_, int i_59_, int i_60_, int i_61_);

	void method2693(Class142 class142, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		boolean bool = false;
		boolean bool_68_ = false;
		boolean bool_69_ = false;
		int i_70_ = -i_64_ / 2;
		int i_71_ = -i_65_ / 2;
		int i_72_ = class142.method2327(i + i_70_, i_63_ + i_71_, -538552485);
		int i_73_ = i_64_ / 2;
		int i_74_ = -i_65_ / 2;
		int i_75_ = class142.method2327(i + i_73_, i_63_ + i_74_, -1257685816);
		int i_76_ = -i_64_ / 2;
		int i_77_ = i_65_ / 2;
		int i_78_ = class142.method2327(i + i_76_, i_63_ + i_77_, -1695940665);
		int i_79_ = i_64_ / 2;
		int i_80_ = i_65_ / 2;
		int i_81_ = class142.method2327(i + i_79_, i_63_ + i_80_, -130295932);
		int i_82_ = i_72_ < i_75_ ? i_72_ : i_75_;
		int i_83_ = i_78_ < i_81_ ? i_78_ : i_81_;
		int i_84_ = i_75_ < i_81_ ? i_75_ : i_81_;
		int i_85_ = i_72_ < i_78_ ? i_72_ : i_78_;
		if (i_65_ != 0) {
			int i_86_ = ((int) (Math.atan2((double) (i_82_ - i_83_), (double) i_65_) * 2607.5945876176133) & 0x3fff);
			if (i_86_ != 0) {
				if (i_66_ != 0) {
					if (i_86_ > 8192) {
						int i_87_ = 16384 - i_66_;
						if (i_86_ < i_87_)
							i_86_ = i_87_;
					} else if (i_86_ > i_66_)
						i_86_ = i_66_;
				}
				method2845(i_86_);
			}
		}
		if (i_64_ != 0) {
			int i_88_ = ((int) (Math.atan2((double) (i_85_ - i_84_), (double) i_64_) * 2607.5945876176133) & 0x3fff);
			if (i_88_ != 0) {
				if (i_67_ != 0) {
					if (i_88_ > 8192) {
						int i_89_ = 16384 - i_67_;
						if (i_88_ < i_89_)
							i_88_ = i_89_;
					} else if (i_88_ > i_67_)
						i_88_ = i_67_;
				}
				method2688(i_88_);
			}
		}
		int i_90_ = i_72_ + i_81_;
		if (i_75_ + i_78_ < i_90_)
			i_90_ = i_75_ + i_78_;
		i_90_ = (i_90_ >> 1) - i_62_;
		if (i_90_ != 0)
			method2689(0, i_90_, 0);
	}

	abstract void method2694();

	abstract void method2695(int i, int[] is, int i_91_, int i_92_, int i_93_, int i_94_, boolean bool);

	static float[] method2696(int i, int i_95_, int i_96_, int i_97_, float f, float f_98_, float f_99_) {
		float[] fs = new float[9];
		float[] fs_100_ = new float[9];
		float f_101_ = (float) Math.cos((double) ((float) i_97_ * 0.024543693F));
		float f_102_ = (float) Math.sin((double) ((float) i_97_ * 0.024543693F));
		float f_103_ = 1.0F - f_101_;
		fs[0] = f_101_;
		fs[1] = 0.0F;
		fs[2] = f_102_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_102_;
		fs[7] = 0.0F;
		fs[8] = f_101_;
		float[] fs_104_ = new float[9];
		float f_105_ = 1.0F;
		float f_106_ = 0.0F;
		f_101_ = (float) i_95_ / 32767.0F;
		f_102_ = -(float) Math.sqrt((double) (1.0F - f_101_ * f_101_));
		f_103_ = 1.0F - f_101_;
		float f_107_ = (float) Math.sqrt((double) (i * i + i_96_ * i_96_));
		if (f_107_ == 0.0F && f_101_ == 0.0F)
			fs_100_ = fs;
		else {
			if (f_107_ != 0.0F) {
				f_105_ = (float) -i_96_ / f_107_;
				f_106_ = (float) i / f_107_;
			}
			fs_104_[0] = f_101_ + f_105_ * f_105_ * f_103_;
			fs_104_[1] = f_106_ * f_102_;
			fs_104_[2] = f_106_ * f_105_ * f_103_;
			fs_104_[3] = -f_106_ * f_102_;
			fs_104_[4] = f_101_;
			fs_104_[5] = f_105_ * f_102_;
			fs_104_[6] = f_105_ * f_106_ * f_103_;
			fs_104_[7] = -f_105_ * f_102_;
			fs_104_[8] = f_101_ + f_106_ * f_106_ * f_103_;
			fs_100_[0] = fs[0] * fs_104_[0] + fs[1] * fs_104_[3] + fs[2] * fs_104_[6];
			fs_100_[1] = fs[0] * fs_104_[1] + fs[1] * fs_104_[4] + fs[2] * fs_104_[7];
			fs_100_[2] = fs[0] * fs_104_[2] + fs[1] * fs_104_[5] + fs[2] * fs_104_[8];
			fs_100_[3] = fs[3] * fs_104_[0] + fs[4] * fs_104_[3] + fs[5] * fs_104_[6];
			fs_100_[4] = fs[3] * fs_104_[1] + fs[4] * fs_104_[4] + fs[5] * fs_104_[7];
			fs_100_[5] = fs[3] * fs_104_[2] + fs[4] * fs_104_[5] + fs[5] * fs_104_[8];
			fs_100_[6] = fs[6] * fs_104_[0] + fs[7] * fs_104_[3] + fs[8] * fs_104_[6];
			fs_100_[7] = fs[6] * fs_104_[1] + fs[7] * fs_104_[4] + fs[8] * fs_104_[7];
			fs_100_[8] = fs[6] * fs_104_[2] + fs[7] * fs_104_[5] + fs[8] * fs_104_[8];
		}
		fs_100_[0] *= f;
		fs_100_[1] *= f;
		fs_100_[2] *= f;
		fs_100_[3] *= f_98_;
		fs_100_[4] *= f_98_;
		fs_100_[5] *= f_98_;
		fs_100_[6] *= f_99_;
		fs_100_[7] *= f_99_;
		fs_100_[8] *= f_99_;
		return fs_100_;
	}

	public final void method2697(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, boolean bool, int[] is) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_114_ = null;
				if (class523_sub27_sub11_108_ != null) {
					class169_114_ = (class523_sub27_sub11_108_.aClass169Array11743[i_109_]);
					if (class169_114_.aClass523_Sub15_1808 != class523_sub15)
						class169_114_ = null;
				}
				method2700(class523_sub15, class169, class169_114_, i_110_, i_111_, i_112_, null, false, bool, i_113_, is);
				method2819();
				method2703();
			}
		}
	}

	static void method2698(int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, float[] fs, int i_121_, float f, float f_122_, float f_123_, float[] fs_124_) {
		i -= i_117_;
		i_115_ -= i_118_;
		i_116_ -= i_119_;
		float f_125_ = ((float) i * fs[0] + (float) i_115_ * fs[1] + (float) i_116_ * fs[2]);
		float f_126_ = ((float) i * fs[3] + (float) i_115_ * fs[4] + (float) i_116_ * fs[5]);
		float f_127_ = ((float) i * fs[6] + (float) i_115_ * fs[7] + (float) i_116_ * fs[8]);
		float f_128_;
		float f_129_;
		if (i_120_ == 0) {
			f_128_ = f_125_ + f + 0.5F;
			f_129_ = -f_127_ + f_123_ + 0.5F;
		} else if (i_120_ == 1) {
			f_128_ = f_125_ + f + 0.5F;
			f_129_ = f_127_ + f_123_ + 0.5F;
		} else if (i_120_ == 2) {
			f_128_ = -f_125_ + f + 0.5F;
			f_129_ = -f_126_ + f_122_ + 0.5F;
		} else if (i_120_ == 3) {
			f_128_ = f_125_ + f + 0.5F;
			f_129_ = -f_126_ + f_122_ + 0.5F;
		} else if (i_120_ == 4) {
			f_128_ = f_127_ + f_123_ + 0.5F;
			f_129_ = -f_126_ + f_122_ + 0.5F;
		} else {
			f_128_ = -f_127_ + f_123_ + 0.5F;
			f_129_ = -f_126_ + f_122_ + 0.5F;
		}
		if (i_121_ == 1) {
			float f_130_ = f_128_;
			f_128_ = -f_129_;
			f_129_ = f_130_;
		} else if (i_121_ == 2) {
			f_128_ = -f_128_;
			f_129_ = -f_129_;
		} else if (i_121_ == 3) {
			float f_131_ = f_128_;
			f_128_ = f_129_;
			f_129_ = -f_131_;
		}
		fs_124_[0] = f_128_;
		fs_124_[1] = f_129_;
	}

	public final void method2699(Class523_Sub27_Sub11 class523_sub27_sub11, int i) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				for (int i_132_ = 0; i_132_ < class169.anInt1815; i_132_++) {
					short i_133_ = class169.aShortArray1809[i_132_];
					if (class523_sub15.aBoolArray10465[i_133_]) {
						if (class169.aShortArray1814[i_132_] != -1)
							method2705(0, 0, 0, 0);
						method2705(class523_sub15.anIntArray10467[i_133_], class169.aShortArray1819[i_132_], class169.aShortArray1802[i_132_], class169.aShortArray1812[i_132_]);
					}
				}
				method2819();
				method2703();
			}
		}
	}

	void method2700(Class523_Sub15 class523_sub15, Class169 class169, Class169 class169_134_, int i, int i_135_, int i_136_, boolean[] bools, boolean bool, boolean bool_137_, int i_138_, int[] is) {
		if (class169_134_ == null || i == 0) {
			for (int i_139_ = 0; i_139_ < class169.anInt1815; i_139_++) {
				short i_140_ = class169.aShortArray1809[i_139_];
				if (bools == null || bools[i_140_] == bool || class523_sub15.anIntArray10467[i_140_] == 0) {
					short i_141_ = class169.aShortArray1814[i_139_];
					if (i_141_ != -1)
						method2701(0, class523_sub15.anIntArrayArray10468[i_141_], 0, 0, 0, i_136_, bool_137_, (i_138_ & class523_sub15.anIntArray10470[i_141_]), is);
					method2701(class523_sub15.anIntArray10467[i_140_], class523_sub15.anIntArrayArray10468[i_140_], class169.aShortArray1819[i_139_], class169.aShortArray1802[i_139_], class169.aShortArray1812[i_139_], i_136_, bool_137_, i_138_ & class523_sub15.anIntArray10470[i_140_], is);
				}
			}
		} else {
			int i_142_ = 0;
			int i_143_ = 0;
			for (int i_144_ = 0; i_144_ < class523_sub15.anInt10466 * -687411039; i_144_++) {
				boolean bool_145_ = false;
				if (i_142_ < class169.anInt1815 && class169.aShortArray1809[i_142_] == i_144_)
					bool_145_ = true;
				boolean bool_146_ = false;
				if (i_143_ < class169_134_.anInt1815 && class169_134_.aShortArray1809[i_143_] == i_144_)
					bool_146_ = true;
				if (bool_145_ || bool_146_) {
					if (bools != null && bools[i_144_] != bool && class523_sub15.anIntArray10467[i_144_] != 0) {
						if (bool_145_)
							i_142_++;
						if (bool_146_)
							i_143_++;
					} else {
						int i_147_ = 0;
						int i_148_ = class523_sub15.anIntArray10467[i_144_];
						if (i_148_ == 3 || i_148_ == 10)
							i_147_ = 128;
						int i_149_;
						int i_150_;
						int i_151_;
						short i_152_;
						byte i_153_;
						if (bool_145_) {
							i_149_ = class169.aShortArray1819[i_142_];
							i_150_ = class169.aShortArray1802[i_142_];
							i_151_ = class169.aShortArray1812[i_142_];
							i_152_ = class169.aShortArray1814[i_142_];
							i_153_ = class169.aByteArray1821[i_142_];
							i_142_++;
						} else {
							i_149_ = i_147_;
							i_150_ = i_147_;
							i_151_ = i_147_;
							i_152_ = (short) -1;
							i_153_ = (byte) 0;
						}
						int i_154_;
						int i_155_;
						int i_156_;
						short i_157_;
						byte i_158_;
						if (bool_146_) {
							i_154_ = class169_134_.aShortArray1819[i_143_];
							i_155_ = class169_134_.aShortArray1802[i_143_];
							i_156_ = class169_134_.aShortArray1812[i_143_];
							i_157_ = class169_134_.aShortArray1814[i_143_];
							i_158_ = class169_134_.aByteArray1821[i_143_];
							i_143_++;
						} else {
							i_154_ = i_147_;
							i_155_ = i_147_;
							i_156_ = i_147_;
							i_157_ = (short) -1;
							i_158_ = (byte) 0;
						}
						int i_159_;
						int i_160_;
						int i_161_;
						if ((i_153_ & 0x2) != 0 || (i_158_ & 0x1) != 0) {
							i_159_ = i_149_;
							i_160_ = i_150_;
							i_161_ = i_151_;
						} else if (i_148_ == 2) {
							int i_162_ = i_154_ - i_149_ & 0x3fff;
							int i_163_ = i_155_ - i_150_ & 0x3fff;
							int i_164_ = i_156_ - i_151_ & 0x3fff;
							if (i_162_ >= 8192)
								i_162_ -= 16384;
							if (i_163_ >= 8192)
								i_163_ -= 16384;
							if (i_164_ >= 8192)
								i_164_ -= 16384;
							i_159_ = i_149_ + i_162_ * i / i_135_ & 0x3fff;
							i_160_ = i_150_ + i_163_ * i / i_135_ & 0x3fff;
							i_161_ = i_151_ + i_164_ * i / i_135_ & 0x3fff;
						} else if (i_148_ == 9) {
							int i_165_ = i_154_ - i_149_ & 0x3fff;
							if (i_165_ >= 8192)
								i_165_ -= 16384;
							i_159_ = i_149_ + i_165_ * i / i_135_ & 0x3fff;
							i_161_ = 0;
							i_160_ = 0;
						} else if (i_148_ == 7) {
							int i_166_ = i_154_ - i_149_ & 0x3f;
							if (i_166_ >= 32)
								i_166_ -= 64;
							i_159_ = i_149_ + i_166_ * i / i_135_ & 0x3f;
							i_160_ = i_150_ + (i_155_ - i_150_) * i / i_135_;
							i_161_ = i_151_ + (i_156_ - i_151_) * i / i_135_;
						} else {
							i_159_ = i_149_ + (i_154_ - i_149_) * i / i_135_;
							i_160_ = i_150_ + (i_155_ - i_150_) * i / i_135_;
							i_161_ = i_151_ + (i_156_ - i_151_) * i / i_135_;
						}
						if (i_152_ != -1)
							method2701(0, (class523_sub15.anIntArrayArray10468[i_152_]), 0, 0, 0, i_136_, bool_137_, i_138_ & (class523_sub15.anIntArray10470[i_152_]), is);
						else if (i_157_ != -1)
							method2701(0, (class523_sub15.anIntArrayArray10468[i_157_]), 0, 0, 0, i_136_, bool_137_, i_138_ & (class523_sub15.anIntArray10470[i_157_]), is);
						method2701(i_148_, class523_sub15.anIntArrayArray10468[i_144_], i_159_, i_160_, i_161_, i_136_, bool_137_, (i_138_ & class523_sub15.anIntArray10470[i_144_]), is);
					}
				}
			}
		}
	}

	void method2701(int i, int[] is, int i_167_, int i_168_, int i_169_, int i_170_, boolean bool, int i_171_, int[] is_172_) {
		if (i_170_ == 1) {
			if (i == 0 || i == 1) {
				int i_173_ = -i_167_;
				i_167_ = i_169_;
				i_169_ = i_173_;
			} else if (i == 3) {
				int i_174_ = i_167_;
				i_167_ = i_169_;
				i_169_ = i_174_;
			} else if (i == 2) {
				int i_175_ = i_167_;
				i_167_ = -i_169_ & 0x3fff;
				i_169_ = i_175_ & 0x3fff;
			}
		} else if (i_170_ == 2) {
			if (i == 0 || i == 1) {
				i_167_ = -i_167_;
				i_169_ = -i_169_;
			} else if (i == 2) {
				i_167_ = -i_167_ & 0x3fff;
				i_169_ = -i_169_ & 0x3fff;
			}
		} else if (i_170_ == 3) {
			if (i == 0 || i == 1) {
				int i_176_ = i_167_;
				i_167_ = -i_169_;
				i_169_ = i_176_;
			} else if (i == 3) {
				int i_177_ = i_167_;
				i_167_ = i_169_;
				i_169_ = i_177_;
			} else if (i == 2) {
				int i_178_ = i_167_;
				i_167_ = i_169_ & 0x3fff;
				i_169_ = -i_178_ & 0x3fff;
			}
		}
		if (i_171_ != 65535)
			method2720(i, is, i_167_, i_168_, i_169_, bool, i_171_, is_172_);
		else
			method2856(i, is, i_167_, i_168_, i_169_, i_170_, bool);
	}

	abstract boolean method2702();

	abstract void method2703();

	abstract void method2704();

	abstract void method2705(int i, int i_179_, int i_180_, int i_181_);

	void method2706(Class523_Sub15 class523_sub15, Class169 class169, Class169 class169_182_, int i, int i_183_, int i_184_, boolean[] bools, boolean bool, boolean bool_185_, int i_186_, int[] is) {
		if (class169_182_ == null || i == 0) {
			for (int i_187_ = 0; i_187_ < class169.anInt1815; i_187_++) {
				short i_188_ = class169.aShortArray1809[i_187_];
				if (bools == null || bools[i_188_] == bool || class523_sub15.anIntArray10467[i_188_] == 0) {
					short i_189_ = class169.aShortArray1814[i_187_];
					if (i_189_ != -1)
						method2701(0, class523_sub15.anIntArrayArray10468[i_189_], 0, 0, 0, i_184_, bool_185_, (i_186_ & class523_sub15.anIntArray10470[i_189_]), is);
					method2701(class523_sub15.anIntArray10467[i_188_], class523_sub15.anIntArrayArray10468[i_188_], class169.aShortArray1819[i_187_], class169.aShortArray1802[i_187_], class169.aShortArray1812[i_187_], i_184_, bool_185_, i_186_ & class523_sub15.anIntArray10470[i_188_], is);
				}
			}
		} else {
			int i_190_ = 0;
			int i_191_ = 0;
			for (int i_192_ = 0; i_192_ < class523_sub15.anInt10466 * -687411039; i_192_++) {
				boolean bool_193_ = false;
				if (i_190_ < class169.anInt1815 && class169.aShortArray1809[i_190_] == i_192_)
					bool_193_ = true;
				boolean bool_194_ = false;
				if (i_191_ < class169_182_.anInt1815 && class169_182_.aShortArray1809[i_191_] == i_192_)
					bool_194_ = true;
				if (bool_193_ || bool_194_) {
					if (bools != null && bools[i_192_] != bool && class523_sub15.anIntArray10467[i_192_] != 0) {
						if (bool_193_)
							i_190_++;
						if (bool_194_)
							i_191_++;
					} else {
						int i_195_ = 0;
						int i_196_ = class523_sub15.anIntArray10467[i_192_];
						if (i_196_ == 3 || i_196_ == 10)
							i_195_ = 128;
						int i_197_;
						int i_198_;
						int i_199_;
						short i_200_;
						byte i_201_;
						if (bool_193_) {
							i_197_ = class169.aShortArray1819[i_190_];
							i_198_ = class169.aShortArray1802[i_190_];
							i_199_ = class169.aShortArray1812[i_190_];
							i_200_ = class169.aShortArray1814[i_190_];
							i_201_ = class169.aByteArray1821[i_190_];
							i_190_++;
						} else {
							i_197_ = i_195_;
							i_198_ = i_195_;
							i_199_ = i_195_;
							i_200_ = (short) -1;
							i_201_ = (byte) 0;
						}
						int i_202_;
						int i_203_;
						int i_204_;
						short i_205_;
						byte i_206_;
						if (bool_194_) {
							i_202_ = class169_182_.aShortArray1819[i_191_];
							i_203_ = class169_182_.aShortArray1802[i_191_];
							i_204_ = class169_182_.aShortArray1812[i_191_];
							i_205_ = class169_182_.aShortArray1814[i_191_];
							i_206_ = class169_182_.aByteArray1821[i_191_];
							i_191_++;
						} else {
							i_202_ = i_195_;
							i_203_ = i_195_;
							i_204_ = i_195_;
							i_205_ = (short) -1;
							i_206_ = (byte) 0;
						}
						int i_207_;
						int i_208_;
						int i_209_;
						if ((i_201_ & 0x2) != 0 || (i_206_ & 0x1) != 0) {
							i_207_ = i_197_;
							i_208_ = i_198_;
							i_209_ = i_199_;
						} else if (i_196_ == 2) {
							int i_210_ = i_202_ - i_197_ & 0x3fff;
							int i_211_ = i_203_ - i_198_ & 0x3fff;
							int i_212_ = i_204_ - i_199_ & 0x3fff;
							if (i_210_ >= 8192)
								i_210_ -= 16384;
							if (i_211_ >= 8192)
								i_211_ -= 16384;
							if (i_212_ >= 8192)
								i_212_ -= 16384;
							i_207_ = i_197_ + i_210_ * i / i_183_ & 0x3fff;
							i_208_ = i_198_ + i_211_ * i / i_183_ & 0x3fff;
							i_209_ = i_199_ + i_212_ * i / i_183_ & 0x3fff;
						} else if (i_196_ == 9) {
							int i_213_ = i_202_ - i_197_ & 0x3fff;
							if (i_213_ >= 8192)
								i_213_ -= 16384;
							i_207_ = i_197_ + i_213_ * i / i_183_ & 0x3fff;
							i_209_ = 0;
							i_208_ = 0;
						} else if (i_196_ == 7) {
							int i_214_ = i_202_ - i_197_ & 0x3f;
							if (i_214_ >= 32)
								i_214_ -= 64;
							i_207_ = i_197_ + i_214_ * i / i_183_ & 0x3f;
							i_208_ = i_198_ + (i_203_ - i_198_) * i / i_183_;
							i_209_ = i_199_ + (i_204_ - i_199_) * i / i_183_;
						} else {
							i_207_ = i_197_ + (i_202_ - i_197_) * i / i_183_;
							i_208_ = i_198_ + (i_203_ - i_198_) * i / i_183_;
							i_209_ = i_199_ + (i_204_ - i_199_) * i / i_183_;
						}
						if (i_200_ != -1)
							method2701(0, (class523_sub15.anIntArrayArray10468[i_200_]), 0, 0, 0, i_184_, bool_185_, i_186_ & (class523_sub15.anIntArray10470[i_200_]), is);
						else if (i_205_ != -1)
							method2701(0, (class523_sub15.anIntArrayArray10468[i_205_]), 0, 0, 0, i_184_, bool_185_, i_186_ & (class523_sub15.anIntArray10470[i_205_]), is);
						method2701(i_196_, class523_sub15.anIntArrayArray10468[i_192_], i_207_, i_208_, i_209_, i_184_, bool_185_, (i_186_ & class523_sub15.anIntArray10470[i_192_]), is);
					}
				}
			}
		}
	}

	public abstract void method2707(Class435 class435, int i, boolean bool);

	public abstract void method2708(Class435 class435, Class180 class180, int i);

	public abstract boolean method2709(int i, int i_215_, Class435 class435, boolean bool, int i_216_);

	public abstract Class523_Sub27_Sub4 method2710(Class523_Sub27_Sub4 class523_sub27_sub4);

	public abstract int method2711();

	Class167() {
		/* empty */
	}

	public abstract int method2712();

	public abstract int method2713();

	public abstract Class143[] method2714();

	public abstract void method2715(byte i, byte[] is);

	public abstract int method2716();

	public abstract int method2717();

	public abstract int method2718();

	public abstract void method2719();

	abstract void method2720(int i, int[] is, int i_217_, int i_218_, int i_219_, boolean bool, int i_220_, int[] is_221_);

	public abstract void method2721(int i);

	public abstract int method2722();

	public abstract int method2723();

	public abstract void method2724(int i);

	public abstract void method2725(short i, short i_222_);

	public abstract int method2726();

	public abstract boolean method2727();

	public abstract Class143[] method2728();

	abstract void method2729();

	public abstract boolean method2730();

	public abstract boolean method2731();

	public abstract void method2732(Class435 class435);

	public abstract Class184[] method2733();

	public abstract Class143[] method2734();

	public abstract void method2735(Class167 class167_223_, int i, int i_224_, int i_225_, boolean bool);

	public abstract int method2736();

	public abstract void method2737(Class167 class167_226_, int i, int i_227_, int i_228_, boolean bool);

	public abstract void method2738(Class167 class167_229_, int i, int i_230_, int i_231_, boolean bool);

	public abstract void method2739(Class167 class167_232_, int i, int i_233_, int i_234_, boolean bool);

	public abstract void method2740();

	public abstract int method2741();

	public abstract int method2742();

	public abstract int method2743();

	public abstract void method2744(int i);

	public abstract void method2745(int i);

	static void method2746(int i, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, float[] fs, int i_240_, float f, float[] fs_241_) {
		i -= i_237_;
		i_235_ -= i_238_;
		i_236_ -= i_239_;
		float f_242_ = ((float) i * fs[0] + (float) i_235_ * fs[1] + (float) i_236_ * fs[2]);
		float f_243_ = ((float) i * fs[3] + (float) i_235_ * fs[4] + (float) i_236_ * fs[5]);
		float f_244_ = ((float) i * fs[6] + (float) i_235_ * fs[7] + (float) i_236_ * fs[8]);
		float f_245_ = (float) Math.sqrt((double) (f_242_ * f_242_ + f_243_ * f_243_ + f_244_ * f_244_));
		float f_246_ = (((float) Math.atan2((double) f_242_, (double) f_244_) / 6.2831855F) + 0.5F);
		float f_247_ = ((float) Math.asin((double) (f_243_ / f_245_)) / 3.1415927F + 0.5F + f);
		if (i_240_ == 1) {
			float f_248_ = f_246_;
			f_246_ = -f_247_;
			f_247_ = f_248_;
		} else if (i_240_ == 2) {
			f_246_ = -f_246_;
			f_247_ = -f_247_;
		} else if (i_240_ == 3) {
			float f_249_ = f_246_;
			f_246_ = f_247_;
			f_247_ = -f_249_;
		}
		fs_241_[0] = f_246_;
		fs_241_[1] = f_247_;
	}

	public final void method2747(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_250_, int i_251_, int i_252_, int i_253_, int i_254_, boolean bool) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_255_ = null;
				if (class523_sub27_sub11_250_ != null) {
					class169_255_ = (class523_sub27_sub11_250_.aClass169Array11743[i_251_]);
					if (class169_255_.aClass523_Sub15_1808 != class523_sub15)
						class169_255_ = null;
				}
				method2700(class523_sub15, class169, class169_255_, i_252_, i_253_, i_254_, null, false, bool, 65535, null);
				method2819();
				method2703();
			}
		}
	}

	public abstract void method2748(int i);

	public abstract void method2749(int i);

	public abstract void method2750(int i);

	public abstract void method2751(int i);

	public abstract int method2752();

	public abstract void method2753(int i);

	public abstract void method2754(int i);

	public abstract void method2755(int i);

	public abstract void method2756();

	abstract void method2757();

	public abstract void method2758();

	public abstract Class167 method2759(byte i, int i_256_, boolean bool);

	public abstract void method2760(int i, int i_257_, int i_258_);

	public abstract void method2761(int i);

	public abstract void method2762(int i, int i_259_, Class142 class142, Class142 class142_260_, int i_261_, int i_262_, int i_263_);

	public abstract void method2763(int i, int i_264_, Class142 class142, Class142 class142_265_, int i_266_, int i_267_, int i_268_);

	public abstract void method2764(int i, int i_269_, Class142 class142, Class142 class142_270_, int i_271_, int i_272_, int i_273_);

	abstract void method2765();

	public abstract int method2766();

	abstract void method2767();

	abstract boolean method2768();

	public abstract void method2769(int i);

	abstract boolean method2770();

	public abstract void method2771(int i, int i_274_, int i_275_);

	abstract void method2772();

	public abstract int method2773();

	abstract void method2774();

	public abstract void method2775(int i, int i_276_, int i_277_);

	public abstract void method2776(Class435 class435, int i, boolean bool);

	abstract void method2777(int i, int[] is, int i_278_, int i_279_, int i_280_, int i_281_, boolean bool);

	abstract void method2778(int i, int[] is, int i_282_, int i_283_, int i_284_, boolean bool, int i_285_, int[] is_286_);

	abstract void method2779(int i, int[] is, int i_287_, int i_288_, int i_289_, boolean bool, int i_290_, int[] is_291_);

	static float[] method2780(int i, int i_292_, int i_293_, int i_294_, float f, float f_295_, float f_296_) {
		float[] fs = new float[9];
		float[] fs_297_ = new float[9];
		float f_298_ = (float) Math.cos((double) ((float) i_294_ * 0.024543693F));
		float f_299_ = (float) Math.sin((double) ((float) i_294_ * 0.024543693F));
		float f_300_ = 1.0F - f_298_;
		fs[0] = f_298_;
		fs[1] = 0.0F;
		fs[2] = f_299_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_299_;
		fs[7] = 0.0F;
		fs[8] = f_298_;
		float[] fs_301_ = new float[9];
		float f_302_ = 1.0F;
		float f_303_ = 0.0F;
		f_298_ = (float) i_292_ / 32767.0F;
		f_299_ = -(float) Math.sqrt((double) (1.0F - f_298_ * f_298_));
		f_300_ = 1.0F - f_298_;
		float f_304_ = (float) Math.sqrt((double) (i * i + i_293_ * i_293_));
		if (f_304_ == 0.0F && f_298_ == 0.0F)
			fs_297_ = fs;
		else {
			if (f_304_ != 0.0F) {
				f_302_ = (float) -i_293_ / f_304_;
				f_303_ = (float) i / f_304_;
			}
			fs_301_[0] = f_298_ + f_302_ * f_302_ * f_300_;
			fs_301_[1] = f_303_ * f_299_;
			fs_301_[2] = f_303_ * f_302_ * f_300_;
			fs_301_[3] = -f_303_ * f_299_;
			fs_301_[4] = f_298_;
			fs_301_[5] = f_302_ * f_299_;
			fs_301_[6] = f_302_ * f_303_ * f_300_;
			fs_301_[7] = -f_302_ * f_299_;
			fs_301_[8] = f_298_ + f_303_ * f_303_ * f_300_;
			fs_297_[0] = fs[0] * fs_301_[0] + fs[1] * fs_301_[3] + fs[2] * fs_301_[6];
			fs_297_[1] = fs[0] * fs_301_[1] + fs[1] * fs_301_[4] + fs[2] * fs_301_[7];
			fs_297_[2] = fs[0] * fs_301_[2] + fs[1] * fs_301_[5] + fs[2] * fs_301_[8];
			fs_297_[3] = fs[3] * fs_301_[0] + fs[4] * fs_301_[3] + fs[5] * fs_301_[6];
			fs_297_[4] = fs[3] * fs_301_[1] + fs[4] * fs_301_[4] + fs[5] * fs_301_[7];
			fs_297_[5] = fs[3] * fs_301_[2] + fs[4] * fs_301_[5] + fs[5] * fs_301_[8];
			fs_297_[6] = fs[6] * fs_301_[0] + fs[7] * fs_301_[3] + fs[8] * fs_301_[6];
			fs_297_[7] = fs[6] * fs_301_[1] + fs[7] * fs_301_[4] + fs[8] * fs_301_[7];
			fs_297_[8] = fs[6] * fs_301_[2] + fs[7] * fs_301_[5] + fs[8] * fs_301_[8];
		}
		fs_297_[0] *= f;
		fs_297_[1] *= f;
		fs_297_[2] *= f;
		fs_297_[3] *= f_295_;
		fs_297_[4] *= f_295_;
		fs_297_[5] *= f_295_;
		fs_297_[6] *= f_296_;
		fs_297_[7] *= f_296_;
		fs_297_[8] *= f_296_;
		return fs_297_;
	}

	public abstract void method2781(short i, short i_305_);

	public abstract void method2782(Class435 class435, int i, boolean bool);

	public abstract void method2783(Class435 class435, Class180 class180, int i);

	public abstract void method2784(Class435 class435, Class180 class180, int i);

	static float[] method2785(int i, int i_306_, int i_307_, int i_308_, float f, float f_309_, float f_310_) {
		float[] fs = new float[9];
		float[] fs_311_ = new float[9];
		float f_312_ = (float) Math.cos((double) ((float) i_308_ * 0.024543693F));
		float f_313_ = (float) Math.sin((double) ((float) i_308_ * 0.024543693F));
		float f_314_ = 1.0F - f_312_;
		fs[0] = f_312_;
		fs[1] = 0.0F;
		fs[2] = f_313_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_313_;
		fs[7] = 0.0F;
		fs[8] = f_312_;
		float[] fs_315_ = new float[9];
		float f_316_ = 1.0F;
		float f_317_ = 0.0F;
		f_312_ = (float) i_306_ / 32767.0F;
		f_313_ = -(float) Math.sqrt((double) (1.0F - f_312_ * f_312_));
		f_314_ = 1.0F - f_312_;
		float f_318_ = (float) Math.sqrt((double) (i * i + i_307_ * i_307_));
		if (f_318_ == 0.0F && f_312_ == 0.0F)
			fs_311_ = fs;
		else {
			if (f_318_ != 0.0F) {
				f_316_ = (float) -i_307_ / f_318_;
				f_317_ = (float) i / f_318_;
			}
			fs_315_[0] = f_312_ + f_316_ * f_316_ * f_314_;
			fs_315_[1] = f_317_ * f_313_;
			fs_315_[2] = f_317_ * f_316_ * f_314_;
			fs_315_[3] = -f_317_ * f_313_;
			fs_315_[4] = f_312_;
			fs_315_[5] = f_316_ * f_313_;
			fs_315_[6] = f_316_ * f_317_ * f_314_;
			fs_315_[7] = -f_316_ * f_313_;
			fs_315_[8] = f_312_ + f_317_ * f_317_ * f_314_;
			fs_311_[0] = fs[0] * fs_315_[0] + fs[1] * fs_315_[3] + fs[2] * fs_315_[6];
			fs_311_[1] = fs[0] * fs_315_[1] + fs[1] * fs_315_[4] + fs[2] * fs_315_[7];
			fs_311_[2] = fs[0] * fs_315_[2] + fs[1] * fs_315_[5] + fs[2] * fs_315_[8];
			fs_311_[3] = fs[3] * fs_315_[0] + fs[4] * fs_315_[3] + fs[5] * fs_315_[6];
			fs_311_[4] = fs[3] * fs_315_[1] + fs[4] * fs_315_[4] + fs[5] * fs_315_[7];
			fs_311_[5] = fs[3] * fs_315_[2] + fs[4] * fs_315_[5] + fs[5] * fs_315_[8];
			fs_311_[6] = fs[6] * fs_315_[0] + fs[7] * fs_315_[3] + fs[8] * fs_315_[6];
			fs_311_[7] = fs[6] * fs_315_[1] + fs[7] * fs_315_[4] + fs[8] * fs_315_[7];
			fs_311_[8] = fs[6] * fs_315_[2] + fs[7] * fs_315_[5] + fs[8] * fs_315_[8];
		}
		fs_311_[0] *= f;
		fs_311_[1] *= f;
		fs_311_[2] *= f;
		fs_311_[3] *= f_309_;
		fs_311_[4] *= f_309_;
		fs_311_[5] *= f_309_;
		fs_311_[6] *= f_310_;
		fs_311_[7] *= f_310_;
		fs_311_[8] *= f_310_;
		return fs_311_;
	}

	public abstract void method2786(Class435 class435);

	public abstract int method2787();

	public abstract Class523_Sub27_Sub4 method2788(Class523_Sub27_Sub4 class523_sub27_sub4);

	static int method2789(float f, float f_319_, float f_320_) {
		float f_321_ = f < 0.0F ? -f : f;
		float f_322_ = f_319_ < 0.0F ? -f_319_ : f_319_;
		float f_323_ = f_320_ < 0.0F ? -f_320_ : f_320_;
		if (f_322_ > f_321_ && f_322_ > f_323_) {
			if (f_319_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_323_ > f_321_ && f_323_ > f_322_) {
			if (f_320_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	public abstract void method2790();

	public final void method2791(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_324_, int i_325_, int i_326_, int i_327_, int i_328_, boolean bool) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_329_ = null;
				if (class523_sub27_sub11_324_ != null) {
					class169_329_ = (class523_sub27_sub11_324_.aClass169Array11743[i_325_]);
					if (class169_329_.aClass523_Sub15_1808 != class523_sub15)
						class169_329_ = null;
				}
				method2700(class523_sub15, class169, class169_329_, i_326_, i_327_, i_328_, null, false, bool, 65535, null);
				method2819();
				method2703();
			}
		}
	}

	public abstract int method2792();

	public abstract int method2793();

	public abstract void method2794(int i, int i_330_, int i_331_, int i_332_);

	abstract void method2795(int i, int i_333_, int i_334_, int i_335_);

	public abstract int method2796();

	public abstract int method2797();

	public abstract byte[] method2798();

	public abstract int method2799();

	public abstract int method2800();

	public abstract int method2801();

	public abstract boolean method2802(int i, int i_336_, Class435 class435, boolean bool, int i_337_);

	public abstract int method2803();

	public abstract int method2804();

	public abstract void method2805(Class167 class167_338_, int i, int i_339_, int i_340_, boolean bool);

	public abstract int method2806();

	public abstract int method2807();

	abstract void method2808();

	public abstract void method2809(int i);

	public abstract void method2810(int i);

	public abstract int method2811();

	public abstract int method2812();

	public abstract int method2813();

	public abstract int method2814();

	public abstract void method2815(short i, short i_341_);

	abstract boolean method2816();

	public abstract void method2817(short i, short i_342_);

	public abstract void method2818(short i, short i_343_);

	abstract void method2819();

	public abstract byte[] method2820();

	public abstract void method2821(int i, int i_344_, int i_345_, int i_346_);

	public abstract void method2822(int i, int i_347_, int i_348_, int i_349_);

	public abstract Class184[] method2823();

	public abstract void method2824();

	public abstract Class143[] method2825();

	public abstract void method2826(short i, short i_350_);

	public abstract void method2827(int i);

	public abstract boolean method2828();

	public abstract boolean method2829();

	public abstract boolean method2830();

	public abstract boolean method2831();

	public abstract void method2832(int i, int i_351_, int i_352_);

	public abstract void method2833(int i, int i_353_, int i_354_);

	public abstract int method2834();

	abstract void method2835();

	public abstract void method2836();

	public final void method2837(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_355_, int i_356_, int i_357_, int i_358_, Class523_Sub27_Sub11 class523_sub27_sub11_359_, int i_360_, Class523_Sub27_Sub11 class523_sub27_sub11_361_, int i_362_, int i_363_, int i_364_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_360_ == -1)
				method2747(class523_sub27_sub11, i, class523_sub27_sub11_355_, i_356_, i_357_, i_358_, 0, bool);
			else {
				method2694();
				if (!method2702())
					method2703();
				else {
					Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
					Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
					Class169 class169_365_ = null;
					if (class523_sub27_sub11_355_ != null) {
						class169_365_ = (class523_sub27_sub11_355_.aClass169Array11743[i_356_]);
						if (class169_365_.aClass523_Sub15_1808 != class523_sub15)
							class169_365_ = null;
					}
					method2700(class523_sub15, class169, class169_365_, i_357_, i_358_, 0, bools, false, bool, 65535, null);
					Class169 class169_366_ = (class523_sub27_sub11_359_.aClass169Array11743[i_360_]);
					Class169 class169_367_ = null;
					if (class523_sub27_sub11_361_ != null) {
						class169_367_ = (class523_sub27_sub11_361_.aClass169Array11743[i_362_]);
						if (class169_367_.aClass523_Sub15_1808 != class523_sub15)
							class169_367_ = null;
					}
					method2856(0, new int[0], 0, 0, 0, 0, bool);
					method2700(class169_366_.aClass523_Sub15_1808, class169_366_, class169_367_, i_363_, i_364_, 0, bools, true, bool, 65535, null);
					method2819();
					method2703();
				}
			}
		}
	}

	abstract void method2838();

	public abstract void method2839(int i, int i_368_, int i_369_, int i_370_);

	abstract void method2840();

	static void method2841(int i, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, float[] fs, float f, int i_376_, float f_377_, float[] fs_378_) {
		i -= i_373_;
		i_371_ -= i_374_;
		i_372_ -= i_375_;
		float f_379_ = ((float) i * fs[0] + (float) i_371_ * fs[1] + (float) i_372_ * fs[2]);
		float f_380_ = ((float) i * fs[3] + (float) i_371_ * fs[4] + (float) i_372_ * fs[5]);
		float f_381_ = ((float) i * fs[6] + (float) i_371_ * fs[7] + (float) i_372_ * fs[8]);
		float f_382_ = (((float) Math.atan2((double) f_379_, (double) f_381_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_382_ *= f;
		float f_383_ = f_380_ + 0.5F + f_377_;
		if (i_376_ == 1) {
			float f_384_ = f_382_;
			f_382_ = -f_383_;
			f_383_ = f_384_;
		} else if (i_376_ == 2) {
			f_382_ = -f_382_;
			f_383_ = -f_383_;
		} else if (i_376_ == 3) {
			float f_385_ = f_382_;
			f_382_ = f_383_;
			f_383_ = -f_385_;
		}
		fs_378_[0] = f_382_;
		fs_378_[1] = f_383_;
	}

	abstract void method2842();

	public abstract void method2843(int i, int i_386_, int i_387_, int i_388_);

	static void method2844(int i, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_, float[] fs, float f, int i_394_, float f_395_, float[] fs_396_) {
		i -= i_391_;
		i_389_ -= i_392_;
		i_390_ -= i_393_;
		float f_397_ = ((float) i * fs[0] + (float) i_389_ * fs[1] + (float) i_390_ * fs[2]);
		float f_398_ = ((float) i * fs[3] + (float) i_389_ * fs[4] + (float) i_390_ * fs[5]);
		float f_399_ = ((float) i * fs[6] + (float) i_389_ * fs[7] + (float) i_390_ * fs[8]);
		float f_400_ = (((float) Math.atan2((double) f_397_, (double) f_399_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_400_ *= f;
		float f_401_ = f_398_ + 0.5F + f_395_;
		if (i_394_ == 1) {
			float f_402_ = f_400_;
			f_400_ = -f_401_;
			f_401_ = f_402_;
		} else if (i_394_ == 2) {
			f_400_ = -f_400_;
			f_401_ = -f_401_;
		} else if (i_394_ == 3) {
			float f_403_ = f_400_;
			f_400_ = f_401_;
			f_401_ = -f_403_;
		}
		fs_396_[0] = f_400_;
		fs_396_[1] = f_401_;
	}

	public abstract void method2845(int i);

	static int method2846(float f, float f_404_, float f_405_) {
		float f_406_ = f < 0.0F ? -f : f;
		float f_407_ = f_404_ < 0.0F ? -f_404_ : f_404_;
		float f_408_ = f_405_ < 0.0F ? -f_405_ : f_405_;
		if (f_407_ > f_406_ && f_407_ > f_408_) {
			if (f_404_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_408_ > f_406_ && f_408_ > f_407_) {
			if (f_405_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	public abstract int method2847();

	Class183 method2848(Class179 class179, int[] is, int i) {
		int[] is_409_ = null;
		int[] is_410_ = null;
		int[] is_411_ = null;
		float[][] fs = null;
		if (class179.aShortArray1989 != null) {
			int i_412_ = class179.anInt1982;
			int[] is_413_ = new int[i_412_];
			int[] is_414_ = new int[i_412_];
			int[] is_415_ = new int[i_412_];
			int[] is_416_ = new int[i_412_];
			int[] is_417_ = new int[i_412_];
			int[] is_418_ = new int[i_412_];
			for (int i_419_ = 0; i_419_ < i_412_; i_419_++) {
				is_413_[i_419_] = 2147483647;
				is_414_[i_419_] = -2147483647;
				is_415_[i_419_] = 2147483647;
				is_416_[i_419_] = -2147483647;
				is_417_[i_419_] = 2147483647;
				is_418_[i_419_] = -2147483647;
			}
			for (int i_420_ = 0; i_420_ < i; i_420_++) {
				int i_421_ = is[i_420_];
				short i_422_ = class179.aShortArray1989[i_421_];
				if (i_422_ > -1 && i_422_ < 32766) {
					for (int i_423_ = 0; i_423_ < 3; i_423_++) {
						short i_424_;
						if (i_423_ == 0)
							i_424_ = class179.aShortArray1949[i_421_];
						else if (i_423_ == 1)
							i_424_ = class179.aShortArray1966[i_421_];
						else
							i_424_ = class179.aShortArray1967[i_421_];
						int i_425_ = class179.anIntArray1981[i_424_];
						int i_426_ = class179.anIntArray1973[i_424_];
						int i_427_ = class179.anIntArray1957[i_424_];
						if (i_425_ < is_413_[i_422_])
							is_413_[i_422_] = i_425_;
						if (i_425_ > is_414_[i_422_])
							is_414_[i_422_] = i_425_;
						if (i_426_ < is_415_[i_422_])
							is_415_[i_422_] = i_426_;
						if (i_426_ > is_416_[i_422_])
							is_416_[i_422_] = i_426_;
						if (i_427_ < is_417_[i_422_])
							is_417_[i_422_] = i_427_;
						if (i_427_ > is_418_[i_422_])
							is_418_[i_422_] = i_427_;
					}
				}
			}
			is_409_ = new int[i_412_];
			is_410_ = new int[i_412_];
			is_411_ = new int[i_412_];
			fs = new float[i_412_][];
			for (int i_428_ = 0; i_428_ < i_412_; i_428_++) {
				byte i_429_ = class179.aByteArray1983[i_428_];
				if (i_429_ > 0) {
					is_409_[i_428_] = (is_413_[i_428_] + is_414_[i_428_]) / 2;
					is_410_[i_428_] = (is_415_[i_428_] + is_416_[i_428_]) / 2;
					is_411_[i_428_] = (is_417_[i_428_] + is_418_[i_428_]) / 2;
					float f;
					float f_430_;
					float f_431_;
					if (i_429_ == 1) {
						int i_432_ = class179.anIntArray1987[i_428_];
						if (i_432_ == 0) {
							f = 1.0F;
							f_431_ = 1.0F;
						} else if (i_432_ > 0) {
							f = 1.0F;
							f_431_ = (float) i_432_ / 1024.0F;
						} else {
							f_431_ = 1.0F;
							f = (float) -i_432_ / 1024.0F;
						}
						f_430_ = 64.0F / (float) class179.anIntArray1988[i_428_];
					} else if (i_429_ == 2) {
						f = 64.0F / (float) class179.anIntArray1987[i_428_];
						f_430_ = 64.0F / (float) class179.anIntArray1988[i_428_];
						f_431_ = 64.0F / (float) class179.anIntArray1955[i_428_];
					} else {
						f = (float) class179.anIntArray1987[i_428_] / 1024.0F;
						f_430_ = ((float) class179.anIntArray1988[i_428_] / 1024.0F);
						f_431_ = ((float) class179.anIntArray1955[i_428_] / 1024.0F);
					}
					fs[i_428_] = method2780(class179.aShortArray1977[i_428_], class179.aShortArray1985[i_428_], class179.aShortArray1986[i_428_], class179.aByteArray1954[i_428_] & 0xff, f, f_430_, f_431_);
				}
			}
		}
		return new Class183(this, is_409_, is_410_, is_411_, fs);
	}

	Class183 method2849(Class179 class179, int[] is, int i) {
		int[] is_433_ = null;
		int[] is_434_ = null;
		int[] is_435_ = null;
		float[][] fs = null;
		if (class179.aShortArray1989 != null) {
			int i_436_ = class179.anInt1982;
			int[] is_437_ = new int[i_436_];
			int[] is_438_ = new int[i_436_];
			int[] is_439_ = new int[i_436_];
			int[] is_440_ = new int[i_436_];
			int[] is_441_ = new int[i_436_];
			int[] is_442_ = new int[i_436_];
			for (int i_443_ = 0; i_443_ < i_436_; i_443_++) {
				is_437_[i_443_] = 2147483647;
				is_438_[i_443_] = -2147483647;
				is_439_[i_443_] = 2147483647;
				is_440_[i_443_] = -2147483647;
				is_441_[i_443_] = 2147483647;
				is_442_[i_443_] = -2147483647;
			}
			for (int i_444_ = 0; i_444_ < i; i_444_++) {
				int i_445_ = is[i_444_];
				short i_446_ = class179.aShortArray1989[i_445_];
				if (i_446_ > -1 && i_446_ < 32766) {
					for (int i_447_ = 0; i_447_ < 3; i_447_++) {
						short i_448_;
						if (i_447_ == 0)
							i_448_ = class179.aShortArray1949[i_445_];
						else if (i_447_ == 1)
							i_448_ = class179.aShortArray1966[i_445_];
						else
							i_448_ = class179.aShortArray1967[i_445_];
						int i_449_ = class179.anIntArray1981[i_448_];
						int i_450_ = class179.anIntArray1973[i_448_];
						int i_451_ = class179.anIntArray1957[i_448_];
						if (i_449_ < is_437_[i_446_])
							is_437_[i_446_] = i_449_;
						if (i_449_ > is_438_[i_446_])
							is_438_[i_446_] = i_449_;
						if (i_450_ < is_439_[i_446_])
							is_439_[i_446_] = i_450_;
						if (i_450_ > is_440_[i_446_])
							is_440_[i_446_] = i_450_;
						if (i_451_ < is_441_[i_446_])
							is_441_[i_446_] = i_451_;
						if (i_451_ > is_442_[i_446_])
							is_442_[i_446_] = i_451_;
					}
				}
			}
			is_433_ = new int[i_436_];
			is_434_ = new int[i_436_];
			is_435_ = new int[i_436_];
			fs = new float[i_436_][];
			for (int i_452_ = 0; i_452_ < i_436_; i_452_++) {
				byte i_453_ = class179.aByteArray1983[i_452_];
				if (i_453_ > 0) {
					is_433_[i_452_] = (is_437_[i_452_] + is_438_[i_452_]) / 2;
					is_434_[i_452_] = (is_439_[i_452_] + is_440_[i_452_]) / 2;
					is_435_[i_452_] = (is_441_[i_452_] + is_442_[i_452_]) / 2;
					float f;
					float f_454_;
					float f_455_;
					if (i_453_ == 1) {
						int i_456_ = class179.anIntArray1987[i_452_];
						if (i_456_ == 0) {
							f = 1.0F;
							f_455_ = 1.0F;
						} else if (i_456_ > 0) {
							f = 1.0F;
							f_455_ = (float) i_456_ / 1024.0F;
						} else {
							f_455_ = 1.0F;
							f = (float) -i_456_ / 1024.0F;
						}
						f_454_ = 64.0F / (float) class179.anIntArray1988[i_452_];
					} else if (i_453_ == 2) {
						f = 64.0F / (float) class179.anIntArray1987[i_452_];
						f_454_ = 64.0F / (float) class179.anIntArray1988[i_452_];
						f_455_ = 64.0F / (float) class179.anIntArray1955[i_452_];
					} else {
						f = (float) class179.anIntArray1987[i_452_] / 1024.0F;
						f_454_ = ((float) class179.anIntArray1988[i_452_] / 1024.0F);
						f_455_ = ((float) class179.anIntArray1955[i_452_] / 1024.0F);
					}
					fs[i_452_] = method2780(class179.aShortArray1977[i_452_], class179.aShortArray1985[i_452_], class179.aShortArray1986[i_452_], class179.aByteArray1954[i_452_] & 0xff, f, f_454_, f_455_);
				}
			}
		}
		return new Class183(this, is_433_, is_434_, is_435_, fs);
	}

	static float[] method2850(int i, int i_457_, int i_458_, int i_459_, float f, float f_460_, float f_461_) {
		float[] fs = new float[9];
		float[] fs_462_ = new float[9];
		float f_463_ = (float) Math.cos((double) ((float) i_459_ * 0.024543693F));
		float f_464_ = (float) Math.sin((double) ((float) i_459_ * 0.024543693F));
		float f_465_ = 1.0F - f_463_;
		fs[0] = f_463_;
		fs[1] = 0.0F;
		fs[2] = f_464_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_464_;
		fs[7] = 0.0F;
		fs[8] = f_463_;
		float[] fs_466_ = new float[9];
		float f_467_ = 1.0F;
		float f_468_ = 0.0F;
		f_463_ = (float) i_457_ / 32767.0F;
		f_464_ = -(float) Math.sqrt((double) (1.0F - f_463_ * f_463_));
		f_465_ = 1.0F - f_463_;
		float f_469_ = (float) Math.sqrt((double) (i * i + i_458_ * i_458_));
		if (f_469_ == 0.0F && f_463_ == 0.0F)
			fs_462_ = fs;
		else {
			if (f_469_ != 0.0F) {
				f_467_ = (float) -i_458_ / f_469_;
				f_468_ = (float) i / f_469_;
			}
			fs_466_[0] = f_463_ + f_467_ * f_467_ * f_465_;
			fs_466_[1] = f_468_ * f_464_;
			fs_466_[2] = f_468_ * f_467_ * f_465_;
			fs_466_[3] = -f_468_ * f_464_;
			fs_466_[4] = f_463_;
			fs_466_[5] = f_467_ * f_464_;
			fs_466_[6] = f_467_ * f_468_ * f_465_;
			fs_466_[7] = -f_467_ * f_464_;
			fs_466_[8] = f_463_ + f_468_ * f_468_ * f_465_;
			fs_462_[0] = fs[0] * fs_466_[0] + fs[1] * fs_466_[3] + fs[2] * fs_466_[6];
			fs_462_[1] = fs[0] * fs_466_[1] + fs[1] * fs_466_[4] + fs[2] * fs_466_[7];
			fs_462_[2] = fs[0] * fs_466_[2] + fs[1] * fs_466_[5] + fs[2] * fs_466_[8];
			fs_462_[3] = fs[3] * fs_466_[0] + fs[4] * fs_466_[3] + fs[5] * fs_466_[6];
			fs_462_[4] = fs[3] * fs_466_[1] + fs[4] * fs_466_[4] + fs[5] * fs_466_[7];
			fs_462_[5] = fs[3] * fs_466_[2] + fs[4] * fs_466_[5] + fs[5] * fs_466_[8];
			fs_462_[6] = fs[6] * fs_466_[0] + fs[7] * fs_466_[3] + fs[8] * fs_466_[6];
			fs_462_[7] = fs[6] * fs_466_[1] + fs[7] * fs_466_[4] + fs[8] * fs_466_[7];
			fs_462_[8] = fs[6] * fs_466_[2] + fs[7] * fs_466_[5] + fs[8] * fs_466_[8];
		}
		fs_462_[0] *= f;
		fs_462_[1] *= f;
		fs_462_[2] *= f;
		fs_462_[3] *= f_460_;
		fs_462_[4] *= f_460_;
		fs_462_[5] *= f_460_;
		fs_462_[6] *= f_461_;
		fs_462_[7] *= f_461_;
		fs_462_[8] *= f_461_;
		return fs_462_;
	}

	abstract void method2851();

	public abstract void method2852(Class435 class435);

	void method2853(Class142 class142, int i, int i_470_, int i_471_, int i_472_, int i_473_, int i_474_, int i_475_) {
		boolean bool = false;
		boolean bool_476_ = false;
		boolean bool_477_ = false;
		int i_478_ = -i_472_ / 2;
		int i_479_ = -i_473_ / 2;
		int i_480_ = class142.method2327(i + i_478_, i_471_ + i_479_, 439407286);
		int i_481_ = i_472_ / 2;
		int i_482_ = -i_473_ / 2;
		int i_483_ = class142.method2327(i + i_481_, i_471_ + i_482_, -1552226056);
		int i_484_ = -i_472_ / 2;
		int i_485_ = i_473_ / 2;
		int i_486_ = class142.method2327(i + i_484_, i_471_ + i_485_, 135881579);
		int i_487_ = i_472_ / 2;
		int i_488_ = i_473_ / 2;
		int i_489_ = class142.method2327(i + i_487_, i_471_ + i_488_, 333405913);
		int i_490_ = i_480_ < i_483_ ? i_480_ : i_483_;
		int i_491_ = i_486_ < i_489_ ? i_486_ : i_489_;
		int i_492_ = i_483_ < i_489_ ? i_483_ : i_489_;
		int i_493_ = i_480_ < i_486_ ? i_480_ : i_486_;
		if (i_473_ != 0) {
			int i_494_ = ((int) (Math.atan2((double) (i_490_ - i_491_), (double) i_473_) * 2607.5945876176133) & 0x3fff);
			if (i_494_ != 0) {
				if (i_474_ != 0) {
					if (i_494_ > 8192) {
						int i_495_ = 16384 - i_474_;
						if (i_494_ < i_495_)
							i_494_ = i_495_;
					} else if (i_494_ > i_474_)
						i_494_ = i_474_;
				}
				method2845(i_494_);
			}
		}
		if (i_472_ != 0) {
			int i_496_ = ((int) (Math.atan2((double) (i_493_ - i_492_), (double) i_472_) * 2607.5945876176133) & 0x3fff);
			if (i_496_ != 0) {
				if (i_475_ != 0) {
					if (i_496_ > 8192) {
						int i_497_ = 16384 - i_475_;
						if (i_496_ < i_497_)
							i_496_ = i_497_;
					} else if (i_496_ > i_475_)
						i_496_ = i_475_;
				}
				method2688(i_496_);
			}
		}
		int i_498_ = i_480_ + i_489_;
		if (i_483_ + i_486_ < i_498_)
			i_498_ = i_483_ + i_486_;
		i_498_ = (i_498_ >> 1) - i_470_;
		if (i_498_ != 0)
			method2689(0, i_498_, 0);
	}

	void method2854(Class142 class142, int i, int i_499_, int i_500_, int i_501_, int i_502_, int i_503_, int i_504_) {
		boolean bool = false;
		boolean bool_505_ = false;
		boolean bool_506_ = false;
		int i_507_ = -i_501_ / 2;
		int i_508_ = -i_502_ / 2;
		int i_509_ = class142.method2327(i + i_507_, i_500_ + i_508_, 761546338);
		int i_510_ = i_501_ / 2;
		int i_511_ = -i_502_ / 2;
		int i_512_ = class142.method2327(i + i_510_, i_500_ + i_511_, 1268845282);
		int i_513_ = -i_501_ / 2;
		int i_514_ = i_502_ / 2;
		int i_515_ = class142.method2327(i + i_513_, i_500_ + i_514_, 1195755559);
		int i_516_ = i_501_ / 2;
		int i_517_ = i_502_ / 2;
		int i_518_ = class142.method2327(i + i_516_, i_500_ + i_517_, 1048493601);
		int i_519_ = i_509_ < i_512_ ? i_509_ : i_512_;
		int i_520_ = i_515_ < i_518_ ? i_515_ : i_518_;
		int i_521_ = i_512_ < i_518_ ? i_512_ : i_518_;
		int i_522_ = i_509_ < i_515_ ? i_509_ : i_515_;
		if (i_502_ != 0) {
			int i_523_ = ((int) (Math.atan2((double) (i_519_ - i_520_), (double) i_502_) * 2607.5945876176133) & 0x3fff);
			if (i_523_ != 0) {
				if (i_503_ != 0) {
					if (i_523_ > 8192) {
						int i_524_ = 16384 - i_503_;
						if (i_523_ < i_524_)
							i_523_ = i_524_;
					} else if (i_523_ > i_503_)
						i_523_ = i_503_;
				}
				method2845(i_523_);
			}
		}
		if (i_501_ != 0) {
			int i_525_ = ((int) (Math.atan2((double) (i_522_ - i_521_), (double) i_501_) * 2607.5945876176133) & 0x3fff);
			if (i_525_ != 0) {
				if (i_504_ != 0) {
					if (i_525_ > 8192) {
						int i_526_ = 16384 - i_504_;
						if (i_525_ < i_526_)
							i_525_ = i_526_;
					} else if (i_525_ > i_504_)
						i_525_ = i_504_;
				}
				method2688(i_525_);
			}
		}
		int i_527_ = i_509_ + i_518_;
		if (i_512_ + i_515_ < i_527_)
			i_527_ = i_512_ + i_515_;
		i_527_ = (i_527_ >> 1) - i_499_;
		if (i_527_ != 0)
			method2689(0, i_527_, 0);
	}

	void method2855(Class142 class142, int i, int i_528_, int i_529_, int i_530_, int i_531_, int i_532_, int i_533_) {
		boolean bool = false;
		boolean bool_534_ = false;
		boolean bool_535_ = false;
		int i_536_ = -i_530_ / 2;
		int i_537_ = -i_531_ / 2;
		int i_538_ = class142.method2327(i + i_536_, i_529_ + i_537_, -315997920);
		int i_539_ = i_530_ / 2;
		int i_540_ = -i_531_ / 2;
		int i_541_ = class142.method2327(i + i_539_, i_529_ + i_540_, 1753925962);
		int i_542_ = -i_530_ / 2;
		int i_543_ = i_531_ / 2;
		int i_544_ = class142.method2327(i + i_542_, i_529_ + i_543_, -979773852);
		int i_545_ = i_530_ / 2;
		int i_546_ = i_531_ / 2;
		int i_547_ = class142.method2327(i + i_545_, i_529_ + i_546_, -216190455);
		int i_548_ = i_538_ < i_541_ ? i_538_ : i_541_;
		int i_549_ = i_544_ < i_547_ ? i_544_ : i_547_;
		int i_550_ = i_541_ < i_547_ ? i_541_ : i_547_;
		int i_551_ = i_538_ < i_544_ ? i_538_ : i_544_;
		if (i_531_ != 0) {
			int i_552_ = ((int) (Math.atan2((double) (i_548_ - i_549_), (double) i_531_) * 2607.5945876176133) & 0x3fff);
			if (i_552_ != 0) {
				if (i_532_ != 0) {
					if (i_552_ > 8192) {
						int i_553_ = 16384 - i_532_;
						if (i_552_ < i_553_)
							i_552_ = i_553_;
					} else if (i_552_ > i_532_)
						i_552_ = i_532_;
				}
				method2845(i_552_);
			}
		}
		if (i_530_ != 0) {
			int i_554_ = ((int) (Math.atan2((double) (i_551_ - i_550_), (double) i_530_) * 2607.5945876176133) & 0x3fff);
			if (i_554_ != 0) {
				if (i_533_ != 0) {
					if (i_554_ > 8192) {
						int i_555_ = 16384 - i_533_;
						if (i_554_ < i_555_)
							i_554_ = i_555_;
					} else if (i_554_ > i_533_)
						i_554_ = i_533_;
				}
				method2688(i_554_);
			}
		}
		int i_556_ = i_538_ + i_547_;
		if (i_541_ + i_544_ < i_556_)
			i_556_ = i_541_ + i_544_;
		i_556_ = (i_556_ >> 1) - i_528_;
		if (i_556_ != 0)
			method2689(0, i_556_, 0);
	}

	abstract void method2856(int i, int[] is, int i_557_, int i_558_, int i_559_, int i_560_, boolean bool);

	public final void method2857(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_561_, int i_562_, int i_563_, int i_564_, int i_565_, boolean bool) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_566_ = null;
				if (class523_sub27_sub11_561_ != null) {
					class169_566_ = (class523_sub27_sub11_561_.aClass169Array11743[i_562_]);
					if (class169_566_.aClass523_Sub15_1808 != class523_sub15)
						class169_566_ = null;
				}
				method2700(class523_sub15, class169, class169_566_, i_563_, i_564_, i_565_, null, false, bool, 65535, null);
				method2819();
				method2703();
			}
		}
	}

	public final void method2858(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_567_, int i_568_, int i_569_, int i_570_, int i_571_, boolean bool) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_572_ = null;
				if (class523_sub27_sub11_567_ != null) {
					class169_572_ = (class523_sub27_sub11_567_.aClass169Array11743[i_568_]);
					if (class169_572_.aClass523_Sub15_1808 != class523_sub15)
						class169_572_ = null;
				}
				method2700(class523_sub15, class169, class169_572_, i_569_, i_570_, i_571_, null, false, bool, 65535, null);
				method2819();
				method2703();
			}
		}
	}

	public final void method2859(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_573_, int i_574_, int i_575_, int i_576_, int i_577_, int i_578_, boolean bool, int[] is) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_579_ = null;
				if (class523_sub27_sub11_573_ != null) {
					class169_579_ = (class523_sub27_sub11_573_.aClass169Array11743[i_574_]);
					if (class169_579_.aClass523_Sub15_1808 != class523_sub15)
						class169_579_ = null;
				}
				method2700(class523_sub15, class169, class169_579_, i_575_, i_576_, i_577_, null, false, bool, i_578_, is);
				method2819();
				method2703();
			}
		}
	}

	public final void method2860(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_580_, int i_581_, int i_582_, int i_583_, int i_584_, int i_585_, boolean bool, int[] is) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_586_ = null;
				if (class523_sub27_sub11_580_ != null) {
					class169_586_ = (class523_sub27_sub11_580_.aClass169Array11743[i_581_]);
					if (class169_586_.aClass523_Sub15_1808 != class523_sub15)
						class169_586_ = null;
				}
				method2700(class523_sub15, class169, class169_586_, i_582_, i_583_, i_584_, null, false, bool, i_585_, is);
				method2819();
				method2703();
			}
		}
	}

	public final void method2861(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_587_, int i_588_, int i_589_, int i_590_, int i_591_, int i_592_, boolean bool, int[] is) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				Class169 class169_593_ = null;
				if (class523_sub27_sub11_587_ != null) {
					class169_593_ = (class523_sub27_sub11_587_.aClass169Array11743[i_588_]);
					if (class169_593_.aClass523_Sub15_1808 != class523_sub15)
						class169_593_ = null;
				}
				method2700(class523_sub15, class169, class169_593_, i_589_, i_590_, i_591_, null, false, bool, i_592_, is);
				method2819();
				method2703();
			}
		}
	}

	public final void method2862(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_594_, int i_595_, int i_596_, int i_597_, Class523_Sub27_Sub11 class523_sub27_sub11_598_, int i_599_, Class523_Sub27_Sub11 class523_sub27_sub11_600_, int i_601_, int i_602_, int i_603_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_599_ == -1)
				method2747(class523_sub27_sub11, i, class523_sub27_sub11_594_, i_595_, i_596_, i_597_, 0, bool);
			else {
				method2694();
				if (!method2702())
					method2703();
				else {
					Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
					Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
					Class169 class169_604_ = null;
					if (class523_sub27_sub11_594_ != null) {
						class169_604_ = (class523_sub27_sub11_594_.aClass169Array11743[i_595_]);
						if (class169_604_.aClass523_Sub15_1808 != class523_sub15)
							class169_604_ = null;
					}
					method2700(class523_sub15, class169, class169_604_, i_596_, i_597_, 0, bools, false, bool, 65535, null);
					Class169 class169_605_ = (class523_sub27_sub11_598_.aClass169Array11743[i_599_]);
					Class169 class169_606_ = null;
					if (class523_sub27_sub11_600_ != null) {
						class169_606_ = (class523_sub27_sub11_600_.aClass169Array11743[i_601_]);
						if (class169_606_.aClass523_Sub15_1808 != class523_sub15)
							class169_606_ = null;
					}
					method2856(0, new int[0], 0, 0, 0, 0, bool);
					method2700(class169_605_.aClass523_Sub15_1808, class169_605_, class169_606_, i_602_, i_603_, 0, bools, true, bool, 65535, null);
					method2819();
					method2703();
				}
			}
		}
	}

	public final void method2863(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_607_, int i_608_, int i_609_, int i_610_, Class523_Sub27_Sub11 class523_sub27_sub11_611_, int i_612_, Class523_Sub27_Sub11 class523_sub27_sub11_613_, int i_614_, int i_615_, int i_616_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_612_ == -1)
				method2747(class523_sub27_sub11, i, class523_sub27_sub11_607_, i_608_, i_609_, i_610_, 0, bool);
			else {
				method2694();
				if (!method2702())
					method2703();
				else {
					Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
					Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
					Class169 class169_617_ = null;
					if (class523_sub27_sub11_607_ != null) {
						class169_617_ = (class523_sub27_sub11_607_.aClass169Array11743[i_608_]);
						if (class169_617_.aClass523_Sub15_1808 != class523_sub15)
							class169_617_ = null;
					}
					method2700(class523_sub15, class169, class169_617_, i_609_, i_610_, 0, bools, false, bool, 65535, null);
					Class169 class169_618_ = (class523_sub27_sub11_611_.aClass169Array11743[i_612_]);
					Class169 class169_619_ = null;
					if (class523_sub27_sub11_613_ != null) {
						class169_619_ = (class523_sub27_sub11_613_.aClass169Array11743[i_614_]);
						if (class169_619_.aClass523_Sub15_1808 != class523_sub15)
							class169_619_ = null;
					}
					method2856(0, new int[0], 0, 0, 0, 0, bool);
					method2700(class169_618_.aClass523_Sub15_1808, class169_618_, class169_619_, i_615_, i_616_, 0, bools, true, bool, 65535, null);
					method2819();
					method2703();
				}
			}
		}
	}

	public final void method2864(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_620_, int i_621_, int i_622_, int i_623_, Class523_Sub27_Sub11 class523_sub27_sub11_624_, int i_625_, Class523_Sub27_Sub11 class523_sub27_sub11_626_, int i_627_, int i_628_, int i_629_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_625_ == -1)
				method2747(class523_sub27_sub11, i, class523_sub27_sub11_620_, i_621_, i_622_, i_623_, 0, bool);
			else {
				method2694();
				if (!method2702())
					method2703();
				else {
					Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
					Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
					Class169 class169_630_ = null;
					if (class523_sub27_sub11_620_ != null) {
						class169_630_ = (class523_sub27_sub11_620_.aClass169Array11743[i_621_]);
						if (class169_630_.aClass523_Sub15_1808 != class523_sub15)
							class169_630_ = null;
					}
					method2700(class523_sub15, class169, class169_630_, i_622_, i_623_, 0, bools, false, bool, 65535, null);
					Class169 class169_631_ = (class523_sub27_sub11_624_.aClass169Array11743[i_625_]);
					Class169 class169_632_ = null;
					if (class523_sub27_sub11_626_ != null) {
						class169_632_ = (class523_sub27_sub11_626_.aClass169Array11743[i_627_]);
						if (class169_632_.aClass523_Sub15_1808 != class523_sub15)
							class169_632_ = null;
					}
					method2856(0, new int[0], 0, 0, 0, 0, bool);
					method2700(class169_631_.aClass523_Sub15_1808, class169_631_, class169_632_, i_628_, i_629_, 0, bools, true, bool, 65535, null);
					method2819();
					method2703();
				}
			}
		}
	}

	public final void method2865(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_633_, int i_634_, int i_635_, int i_636_, Class523_Sub27_Sub11 class523_sub27_sub11_637_, int i_638_, Class523_Sub27_Sub11 class523_sub27_sub11_639_, int i_640_, int i_641_, int i_642_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_638_ == -1)
				method2747(class523_sub27_sub11, i, class523_sub27_sub11_633_, i_634_, i_635_, i_636_, 0, bool);
			else {
				method2694();
				if (!method2702())
					method2703();
				else {
					Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
					Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
					Class169 class169_643_ = null;
					if (class523_sub27_sub11_633_ != null) {
						class169_643_ = (class523_sub27_sub11_633_.aClass169Array11743[i_634_]);
						if (class169_643_.aClass523_Sub15_1808 != class523_sub15)
							class169_643_ = null;
					}
					method2700(class523_sub15, class169, class169_643_, i_635_, i_636_, 0, bools, false, bool, 65535, null);
					Class169 class169_644_ = (class523_sub27_sub11_637_.aClass169Array11743[i_638_]);
					Class169 class169_645_ = null;
					if (class523_sub27_sub11_639_ != null) {
						class169_645_ = (class523_sub27_sub11_639_.aClass169Array11743[i_640_]);
						if (class169_645_.aClass523_Sub15_1808 != class523_sub15)
							class169_645_ = null;
					}
					method2856(0, new int[0], 0, 0, 0, 0, bool);
					method2700(class169_644_.aClass523_Sub15_1808, class169_644_, class169_645_, i_641_, i_642_, 0, bools, true, bool, 65535, null);
					method2819();
					method2703();
				}
			}
		}
	}

	public final void method2866(Class523_Sub27_Sub11 class523_sub27_sub11, int i, Class523_Sub27_Sub11 class523_sub27_sub11_646_, int i_647_, int i_648_, int i_649_, Class523_Sub27_Sub11 class523_sub27_sub11_650_, int i_651_, Class523_Sub27_Sub11 class523_sub27_sub11_652_, int i_653_, int i_654_, int i_655_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_651_ == -1)
				method2747(class523_sub27_sub11, i, class523_sub27_sub11_646_, i_647_, i_648_, i_649_, 0, bool);
			else {
				method2694();
				if (!method2702())
					method2703();
				else {
					Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
					Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
					Class169 class169_656_ = null;
					if (class523_sub27_sub11_646_ != null) {
						class169_656_ = (class523_sub27_sub11_646_.aClass169Array11743[i_647_]);
						if (class169_656_.aClass523_Sub15_1808 != class523_sub15)
							class169_656_ = null;
					}
					method2700(class523_sub15, class169, class169_656_, i_648_, i_649_, 0, bools, false, bool, 65535, null);
					Class169 class169_657_ = (class523_sub27_sub11_650_.aClass169Array11743[i_651_]);
					Class169 class169_658_ = null;
					if (class523_sub27_sub11_652_ != null) {
						class169_658_ = (class523_sub27_sub11_652_.aClass169Array11743[i_653_]);
						if (class169_658_.aClass523_Sub15_1808 != class523_sub15)
							class169_658_ = null;
					}
					method2856(0, new int[0], 0, 0, 0, 0, bool);
					method2700(class169_657_.aClass523_Sub15_1808, class169_657_, class169_658_, i_654_, i_655_, 0, bools, true, bool, 65535, null);
					method2819();
					method2703();
				}
			}
		}
	}

	public abstract void method2867(byte i, byte[] is);

	public final void method2868(Class523_Sub27_Sub11 class523_sub27_sub11, int i) {
		if (i != -1) {
			method2694();
			if (!method2702())
				method2703();
			else {
				Class169 class169 = class523_sub27_sub11.aClass169Array11743[i];
				Class523_Sub15 class523_sub15 = class169.aClass523_Sub15_1808;
				for (int i_659_ = 0; i_659_ < class169.anInt1815; i_659_++) {
					short i_660_ = class169.aShortArray1809[i_659_];
					if (class523_sub15.aBoolArray10465[i_660_]) {
						if (class169.aShortArray1814[i_659_] != -1)
							method2705(0, 0, 0, 0);
						method2705(class523_sub15.anIntArray10467[i_660_], class169.aShortArray1819[i_659_], class169.aShortArray1802[i_659_], class169.aShortArray1812[i_659_]);
					}
				}
				method2819();
				method2703();
			}
		}
	}

	void method2869(int i, int[] is, int i_661_, int i_662_, int i_663_, int i_664_, boolean bool, int i_665_, int[] is_666_) {
		if (i_664_ == 1) {
			if (i == 0 || i == 1) {
				int i_667_ = -i_661_;
				i_661_ = i_663_;
				i_663_ = i_667_;
			} else if (i == 3) {
				int i_668_ = i_661_;
				i_661_ = i_663_;
				i_663_ = i_668_;
			} else if (i == 2) {
				int i_669_ = i_661_;
				i_661_ = -i_663_ & 0x3fff;
				i_663_ = i_669_ & 0x3fff;
			}
		} else if (i_664_ == 2) {
			if (i == 0 || i == 1) {
				i_661_ = -i_661_;
				i_663_ = -i_663_;
			} else if (i == 2) {
				i_661_ = -i_661_ & 0x3fff;
				i_663_ = -i_663_ & 0x3fff;
			}
		} else if (i_664_ == 3) {
			if (i == 0 || i == 1) {
				int i_670_ = i_661_;
				i_661_ = -i_663_;
				i_663_ = i_670_;
			} else if (i == 3) {
				int i_671_ = i_661_;
				i_661_ = i_663_;
				i_663_ = i_671_;
			} else if (i == 2) {
				int i_672_ = i_661_;
				i_661_ = i_663_ & 0x3fff;
				i_663_ = -i_672_ & 0x3fff;
			}
		}
		if (i_665_ != 65535)
			method2720(i, is, i_661_, i_662_, i_663_, bool, i_665_, is_666_);
		else
			method2856(i, is, i_661_, i_662_, i_663_, i_664_, bool);
	}

	void method2870(int i, int[] is, int i_673_, int i_674_, int i_675_, int i_676_, boolean bool, int i_677_, int[] is_678_) {
		if (i_676_ == 1) {
			if (i == 0 || i == 1) {
				int i_679_ = -i_673_;
				i_673_ = i_675_;
				i_675_ = i_679_;
			} else if (i == 3) {
				int i_680_ = i_673_;
				i_673_ = i_675_;
				i_675_ = i_680_;
			} else if (i == 2) {
				int i_681_ = i_673_;
				i_673_ = -i_675_ & 0x3fff;
				i_675_ = i_681_ & 0x3fff;
			}
		} else if (i_676_ == 2) {
			if (i == 0 || i == 1) {
				i_673_ = -i_673_;
				i_675_ = -i_675_;
			} else if (i == 2) {
				i_673_ = -i_673_ & 0x3fff;
				i_675_ = -i_675_ & 0x3fff;
			}
		} else if (i_676_ == 3) {
			if (i == 0 || i == 1) {
				int i_682_ = i_673_;
				i_673_ = -i_675_;
				i_675_ = i_682_;
			} else if (i == 3) {
				int i_683_ = i_673_;
				i_673_ = i_675_;
				i_675_ = i_683_;
			} else if (i == 2) {
				int i_684_ = i_673_;
				i_673_ = i_675_ & 0x3fff;
				i_675_ = -i_684_ & 0x3fff;
			}
		}
		if (i_677_ != 65535)
			method2720(i, is, i_673_, i_674_, i_675_, bool, i_677_, is_678_);
		else
			method2856(i, is, i_673_, i_674_, i_675_, i_676_, bool);
	}

	public abstract int method2871();

	public abstract void method2872(int i);
}
