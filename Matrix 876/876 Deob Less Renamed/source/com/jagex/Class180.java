/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class180 {
	public int anInt1998;
	public int anInt1999;
	public boolean aBool2000 = false;
	public int anInt2001;
	public int anInt2002;
	public int anInt2003;

	public boolean method3528(int i, int i_0_) {
		if (!aBool2000)
			return false;
		int i_1_ = anInt1998 - anInt1999;
		int i_2_ = anInt2003 - anInt2002;
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = i * i_1_ + i_0_ * i_2_ - (anInt1999 * i_1_ + anInt2002 * i_2_);
		if (i_4_ <= 0) {
			int i_5_ = anInt1999 - i;
			int i_6_ = anInt2002 - i_0_;
			return i_5_ * i_5_ + i_6_ * i_6_ < anInt2001 * anInt2001;
		}
		if (i_4_ > i_3_) {
			int i_7_ = anInt1998 - i;
			int i_8_ = anInt2003 - i_0_;
			return i_7_ * i_7_ + i_8_ * i_8_ < anInt2001 * anInt2001;
		}
		int i_9_ = 10;
		if (i_4_ != (i_4_ & 0x1fffff))
			i_9_ = 5;
		i_4_ = (i_4_ << i_9_) / i_3_;
		int i_10_ = anInt1999 + (i_1_ * i_4_ >> i_9_) - i;
		int i_11_ = anInt2002 + (i_2_ * i_4_ >> i_9_) - i_0_;
		return i_10_ * i_10_ + i_11_ * i_11_ < anInt2001 * anInt2001;
	}

	public boolean method3529(int i, int i_12_) {
		if (!aBool2000)
			return false;
		int i_13_ = anInt1998 - anInt1999;
		int i_14_ = anInt2003 - anInt2002;
		int i_15_ = i_13_ * i_13_ + i_14_ * i_14_;
		int i_16_ = (i * i_13_ + i_12_ * i_14_ - (anInt1999 * i_13_ + anInt2002 * i_14_));
		if (i_16_ <= 0) {
			int i_17_ = anInt1999 - i;
			int i_18_ = anInt2002 - i_12_;
			return i_17_ * i_17_ + i_18_ * i_18_ < anInt2001 * anInt2001;
		}
		if (i_16_ > i_15_) {
			int i_19_ = anInt1998 - i;
			int i_20_ = anInt2003 - i_12_;
			return i_19_ * i_19_ + i_20_ * i_20_ < anInt2001 * anInt2001;
		}
		int i_21_ = 10;
		if (i_16_ != (i_16_ & 0x1fffff))
			i_21_ = 5;
		i_16_ = (i_16_ << i_21_) / i_15_;
		int i_22_ = anInt1999 + (i_13_ * i_16_ >> i_21_) - i;
		int i_23_ = anInt2002 + (i_14_ * i_16_ >> i_21_) - i_12_;
		return i_22_ * i_22_ + i_23_ * i_23_ < anInt2001 * anInt2001;
	}

	public void method3530(Class430 class430, Class441 class441, Class441 class441_24_, float f, float f_25_, float f_26_, float f_27_) {
		boolean bool = false;
		aBool2000 = true;
		int i = (int) (class430.aFloat4855 + class430.aFloat4854) >> 1;
		int i_28_ = (int) (class430.aFloat4853 + class430.aFloat4856) >> 1;
		int i_29_ = i;
		int i_30_ = (int) class430.aFloat4859;
		int i_31_ = i_28_;
		float f_32_ = (class441_24_.aFloatArray4916[0] * (float) i_29_ + class441_24_.aFloatArray4916[4] * (float) i_30_ + class441_24_.aFloatArray4916[8] * (float) i_31_ + class441_24_.aFloatArray4916[12]);
		float f_33_ = (class441_24_.aFloatArray4916[1] * (float) i_29_ + class441_24_.aFloatArray4916[5] * (float) i_30_ + class441_24_.aFloatArray4916[9] * (float) i_31_ + class441_24_.aFloatArray4916[13]);
		float f_34_ = (class441_24_.aFloatArray4916[2] * (float) i_29_ + class441_24_.aFloatArray4916[6] * (float) i_30_ + class441_24_.aFloatArray4916[10] * (float) i_31_ + class441_24_.aFloatArray4916[14]);
		float f_35_ = (class441_24_.aFloatArray4916[3] * (float) i_29_ + class441_24_.aFloatArray4916[7] * (float) i_30_ + class441_24_.aFloatArray4916[11] * (float) i_31_ + class441_24_.aFloatArray4916[15]);
		if (f_34_ >= -f_35_) {
			anInt1999 = (int) (f + f_26_ * f_32_ / f_35_);
			anInt2002 = (int) (f_25_ + f_27_ * f_33_ / f_35_);
		} else
			bool = true;
		i_29_ = i;
		i_30_ = (int) class430.aFloat4851;
		i_31_ = i_28_;
		float f_36_ = (class441_24_.aFloatArray4916[0] * (float) i_29_ + class441_24_.aFloatArray4916[4] * (float) i_30_ + class441_24_.aFloatArray4916[8] * (float) i_31_ + class441_24_.aFloatArray4916[12]);
		float f_37_ = (class441_24_.aFloatArray4916[1] * (float) i_29_ + class441_24_.aFloatArray4916[5] * (float) i_30_ + class441_24_.aFloatArray4916[9] * (float) i_31_ + class441_24_.aFloatArray4916[13]);
		float f_38_ = (class441_24_.aFloatArray4916[2] * (float) i_29_ + class441_24_.aFloatArray4916[6] * (float) i_30_ + class441_24_.aFloatArray4916[10] * (float) i_31_ + class441_24_.aFloatArray4916[14]);
		float f_39_ = (class441_24_.aFloatArray4916[3] * (float) i_29_ + class441_24_.aFloatArray4916[7] * (float) i_30_ + class441_24_.aFloatArray4916[11] * (float) i_31_ + class441_24_.aFloatArray4916[15]);
		if (f_38_ >= -f_39_) {
			anInt1998 = (int) (f + f_26_ * f_36_ / f_39_);
			anInt2003 = (int) (f_25_ + f_27_ * f_37_ / f_39_);
		} else
			bool = true;
		if (bool) {
			if (f_34_ < -f_35_ && f_38_ < -f_39_)
				aBool2000 = false;
			else if (f_34_ < -f_35_) {
				float f_40_ = (f_34_ + f_35_) / (f_38_ + f_39_) - 1.0F;
				float f_41_ = f_32_ + f_40_ * (f_36_ - f_32_);
				float f_42_ = f_33_ + f_40_ * (f_37_ - f_33_);
				float f_43_ = f_35_ + f_40_ * (f_39_ - f_35_);
				anInt1999 = (int) (f + f_26_ * f_41_ / f_43_);
				anInt2002 = (int) (f_25_ + f_27_ * f_42_ / f_43_);
			} else if (f_38_ < -f_39_) {
				float f_44_ = (f_38_ + f_39_) / (f_34_ + f_35_) - 1.0F;
				float f_45_ = f_36_ + f_44_ * (f_32_ - f_36_);
				float f_46_ = f_37_ + f_44_ * (f_33_ - f_37_);
				float f_47_ = f_39_ + f_44_ * (f_35_ - f_39_);
				anInt1998 = (int) (f + f_26_ * f_45_ / f_47_);
				anInt2003 = (int) (f_25_ + f_27_ * f_46_ / f_47_);
			}
		}
		if (aBool2000) {
			float f_48_ = ((float) Math.sqrt(Math.pow((double) (class430.aFloat4854 - class430.aFloat4855), 2.0) + Math.pow((double) (class430.aFloat4856 - (class430.aFloat4853)), 2.0)) / 2.0F);
			if (f_34_ / f_35_ > f_38_ / f_39_) {
				float f_49_ = (f_32_ + class441.aFloatArray4916[0] * f_48_ + class441.aFloatArray4916[12]);
				float f_50_ = (f_35_ + class441.aFloatArray4916[3] * f_48_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1999 + f_26_ * f_49_ / f_50_);
			} else {
				float f_51_ = (f_36_ + class441.aFloatArray4916[0] * f_48_ + class441.aFloatArray4916[12]);
				float f_52_ = (f_39_ + class441.aFloatArray4916[3] * f_48_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1998 + f_26_ * f_51_ / f_52_);
			}
			aBool2000 = true;
		}
	}

	public void method3531(Class430 class430, Class441 class441, Class441 class441_53_, float f, float f_54_, float f_55_, float f_56_) {
		boolean bool = false;
		aBool2000 = true;
		int i = (int) (class430.aFloat4855 + class430.aFloat4854) >> 1;
		int i_57_ = (int) (class430.aFloat4853 + class430.aFloat4856) >> 1;
		int i_58_ = i;
		int i_59_ = (int) class430.aFloat4859;
		int i_60_ = i_57_;
		float f_61_ = (class441_53_.aFloatArray4916[0] * (float) i_58_ + class441_53_.aFloatArray4916[4] * (float) i_59_ + class441_53_.aFloatArray4916[8] * (float) i_60_ + class441_53_.aFloatArray4916[12]);
		float f_62_ = (class441_53_.aFloatArray4916[1] * (float) i_58_ + class441_53_.aFloatArray4916[5] * (float) i_59_ + class441_53_.aFloatArray4916[9] * (float) i_60_ + class441_53_.aFloatArray4916[13]);
		float f_63_ = (class441_53_.aFloatArray4916[2] * (float) i_58_ + class441_53_.aFloatArray4916[6] * (float) i_59_ + class441_53_.aFloatArray4916[10] * (float) i_60_ + class441_53_.aFloatArray4916[14]);
		float f_64_ = (class441_53_.aFloatArray4916[3] * (float) i_58_ + class441_53_.aFloatArray4916[7] * (float) i_59_ + class441_53_.aFloatArray4916[11] * (float) i_60_ + class441_53_.aFloatArray4916[15]);
		if (f_63_ >= -f_64_) {
			anInt1999 = (int) (f + f_55_ * f_61_ / f_64_);
			anInt2002 = (int) (f_54_ + f_56_ * f_62_ / f_64_);
		} else
			bool = true;
		i_58_ = i;
		i_59_ = (int) class430.aFloat4851;
		i_60_ = i_57_;
		float f_65_ = (class441_53_.aFloatArray4916[0] * (float) i_58_ + class441_53_.aFloatArray4916[4] * (float) i_59_ + class441_53_.aFloatArray4916[8] * (float) i_60_ + class441_53_.aFloatArray4916[12]);
		float f_66_ = (class441_53_.aFloatArray4916[1] * (float) i_58_ + class441_53_.aFloatArray4916[5] * (float) i_59_ + class441_53_.aFloatArray4916[9] * (float) i_60_ + class441_53_.aFloatArray4916[13]);
		float f_67_ = (class441_53_.aFloatArray4916[2] * (float) i_58_ + class441_53_.aFloatArray4916[6] * (float) i_59_ + class441_53_.aFloatArray4916[10] * (float) i_60_ + class441_53_.aFloatArray4916[14]);
		float f_68_ = (class441_53_.aFloatArray4916[3] * (float) i_58_ + class441_53_.aFloatArray4916[7] * (float) i_59_ + class441_53_.aFloatArray4916[11] * (float) i_60_ + class441_53_.aFloatArray4916[15]);
		if (f_67_ >= -f_68_) {
			anInt1998 = (int) (f + f_55_ * f_65_ / f_68_);
			anInt2003 = (int) (f_54_ + f_56_ * f_66_ / f_68_);
		} else
			bool = true;
		if (bool) {
			if (f_63_ < -f_64_ && f_67_ < -f_68_)
				aBool2000 = false;
			else if (f_63_ < -f_64_) {
				float f_69_ = (f_63_ + f_64_) / (f_67_ + f_68_) - 1.0F;
				float f_70_ = f_61_ + f_69_ * (f_65_ - f_61_);
				float f_71_ = f_62_ + f_69_ * (f_66_ - f_62_);
				float f_72_ = f_64_ + f_69_ * (f_68_ - f_64_);
				anInt1999 = (int) (f + f_55_ * f_70_ / f_72_);
				anInt2002 = (int) (f_54_ + f_56_ * f_71_ / f_72_);
			} else if (f_67_ < -f_68_) {
				float f_73_ = (f_67_ + f_68_) / (f_63_ + f_64_) - 1.0F;
				float f_74_ = f_65_ + f_73_ * (f_61_ - f_65_);
				float f_75_ = f_66_ + f_73_ * (f_62_ - f_66_);
				float f_76_ = f_68_ + f_73_ * (f_64_ - f_68_);
				anInt1998 = (int) (f + f_55_ * f_74_ / f_76_);
				anInt2003 = (int) (f_54_ + f_56_ * f_75_ / f_76_);
			}
		}
		if (aBool2000) {
			float f_77_ = ((float) Math.sqrt(Math.pow((double) (class430.aFloat4854 - class430.aFloat4855), 2.0) + Math.pow((double) (class430.aFloat4856 - (class430.aFloat4853)), 2.0)) / 2.0F);
			if (f_63_ / f_64_ > f_67_ / f_68_) {
				float f_78_ = (f_61_ + class441.aFloatArray4916[0] * f_77_ + class441.aFloatArray4916[12]);
				float f_79_ = (f_64_ + class441.aFloatArray4916[3] * f_77_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1999 + f_55_ * f_78_ / f_79_);
			} else {
				float f_80_ = (f_65_ + class441.aFloatArray4916[0] * f_77_ + class441.aFloatArray4916[12]);
				float f_81_ = (f_68_ + class441.aFloatArray4916[3] * f_77_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1998 + f_55_ * f_80_ / f_81_);
			}
			aBool2000 = true;
		}
	}

	public void method3532(Class430 class430, Class441 class441, Class441 class441_82_, float f, float f_83_, float f_84_, float f_85_) {
		boolean bool = false;
		aBool2000 = true;
		int i = (int) (class430.aFloat4855 + class430.aFloat4854) >> 1;
		int i_86_ = (int) (class430.aFloat4853 + class430.aFloat4856) >> 1;
		int i_87_ = i;
		int i_88_ = (int) class430.aFloat4859;
		int i_89_ = i_86_;
		float f_90_ = (class441_82_.aFloatArray4916[0] * (float) i_87_ + class441_82_.aFloatArray4916[4] * (float) i_88_ + class441_82_.aFloatArray4916[8] * (float) i_89_ + class441_82_.aFloatArray4916[12]);
		float f_91_ = (class441_82_.aFloatArray4916[1] * (float) i_87_ + class441_82_.aFloatArray4916[5] * (float) i_88_ + class441_82_.aFloatArray4916[9] * (float) i_89_ + class441_82_.aFloatArray4916[13]);
		float f_92_ = (class441_82_.aFloatArray4916[2] * (float) i_87_ + class441_82_.aFloatArray4916[6] * (float) i_88_ + class441_82_.aFloatArray4916[10] * (float) i_89_ + class441_82_.aFloatArray4916[14]);
		float f_93_ = (class441_82_.aFloatArray4916[3] * (float) i_87_ + class441_82_.aFloatArray4916[7] * (float) i_88_ + class441_82_.aFloatArray4916[11] * (float) i_89_ + class441_82_.aFloatArray4916[15]);
		if (f_92_ >= -f_93_) {
			anInt1999 = (int) (f + f_84_ * f_90_ / f_93_);
			anInt2002 = (int) (f_83_ + f_85_ * f_91_ / f_93_);
		} else
			bool = true;
		i_87_ = i;
		i_88_ = (int) class430.aFloat4851;
		i_89_ = i_86_;
		float f_94_ = (class441_82_.aFloatArray4916[0] * (float) i_87_ + class441_82_.aFloatArray4916[4] * (float) i_88_ + class441_82_.aFloatArray4916[8] * (float) i_89_ + class441_82_.aFloatArray4916[12]);
		float f_95_ = (class441_82_.aFloatArray4916[1] * (float) i_87_ + class441_82_.aFloatArray4916[5] * (float) i_88_ + class441_82_.aFloatArray4916[9] * (float) i_89_ + class441_82_.aFloatArray4916[13]);
		float f_96_ = (class441_82_.aFloatArray4916[2] * (float) i_87_ + class441_82_.aFloatArray4916[6] * (float) i_88_ + class441_82_.aFloatArray4916[10] * (float) i_89_ + class441_82_.aFloatArray4916[14]);
		float f_97_ = (class441_82_.aFloatArray4916[3] * (float) i_87_ + class441_82_.aFloatArray4916[7] * (float) i_88_ + class441_82_.aFloatArray4916[11] * (float) i_89_ + class441_82_.aFloatArray4916[15]);
		if (f_96_ >= -f_97_) {
			anInt1998 = (int) (f + f_84_ * f_94_ / f_97_);
			anInt2003 = (int) (f_83_ + f_85_ * f_95_ / f_97_);
		} else
			bool = true;
		if (bool) {
			if (f_92_ < -f_93_ && f_96_ < -f_97_)
				aBool2000 = false;
			else if (f_92_ < -f_93_) {
				float f_98_ = (f_92_ + f_93_) / (f_96_ + f_97_) - 1.0F;
				float f_99_ = f_90_ + f_98_ * (f_94_ - f_90_);
				float f_100_ = f_91_ + f_98_ * (f_95_ - f_91_);
				float f_101_ = f_93_ + f_98_ * (f_97_ - f_93_);
				anInt1999 = (int) (f + f_84_ * f_99_ / f_101_);
				anInt2002 = (int) (f_83_ + f_85_ * f_100_ / f_101_);
			} else if (f_96_ < -f_97_) {
				float f_102_ = (f_96_ + f_97_) / (f_92_ + f_93_) - 1.0F;
				float f_103_ = f_94_ + f_102_ * (f_90_ - f_94_);
				float f_104_ = f_95_ + f_102_ * (f_91_ - f_95_);
				float f_105_ = f_97_ + f_102_ * (f_93_ - f_97_);
				anInt1998 = (int) (f + f_84_ * f_103_ / f_105_);
				anInt2003 = (int) (f_83_ + f_85_ * f_104_ / f_105_);
			}
		}
		if (aBool2000) {
			float f_106_ = ((float) Math.sqrt(Math.pow((double) (class430.aFloat4854 - class430.aFloat4855), 2.0) + Math.pow((double) (class430.aFloat4856 - (class430.aFloat4853)), 2.0)) / 2.0F);
			if (f_92_ / f_93_ > f_96_ / f_97_) {
				float f_107_ = (f_90_ + class441.aFloatArray4916[0] * f_106_ + class441.aFloatArray4916[12]);
				float f_108_ = (f_93_ + class441.aFloatArray4916[3] * f_106_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1999 + f_84_ * f_107_ / f_108_);
			} else {
				float f_109_ = (f_94_ + class441.aFloatArray4916[0] * f_106_ + class441.aFloatArray4916[12]);
				float f_110_ = (f_97_ + class441.aFloatArray4916[3] * f_106_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1998 + f_84_ * f_109_ / f_110_);
			}
			aBool2000 = true;
		}
	}

	public void method3533(Class430 class430, Class441 class441, Class441 class441_111_, float f, float f_112_, float f_113_, float f_114_) {
		boolean bool = false;
		aBool2000 = true;
		int i = (int) (class430.aFloat4855 + class430.aFloat4854) >> 1;
		int i_115_ = (int) (class430.aFloat4853 + class430.aFloat4856) >> 1;
		int i_116_ = i;
		int i_117_ = (int) class430.aFloat4859;
		int i_118_ = i_115_;
		float f_119_ = (class441_111_.aFloatArray4916[0] * (float) i_116_ + class441_111_.aFloatArray4916[4] * (float) i_117_ + class441_111_.aFloatArray4916[8] * (float) i_118_ + class441_111_.aFloatArray4916[12]);
		float f_120_ = (class441_111_.aFloatArray4916[1] * (float) i_116_ + class441_111_.aFloatArray4916[5] * (float) i_117_ + class441_111_.aFloatArray4916[9] * (float) i_118_ + class441_111_.aFloatArray4916[13]);
		float f_121_ = (class441_111_.aFloatArray4916[2] * (float) i_116_ + class441_111_.aFloatArray4916[6] * (float) i_117_ + class441_111_.aFloatArray4916[10] * (float) i_118_ + class441_111_.aFloatArray4916[14]);
		float f_122_ = (class441_111_.aFloatArray4916[3] * (float) i_116_ + class441_111_.aFloatArray4916[7] * (float) i_117_ + class441_111_.aFloatArray4916[11] * (float) i_118_ + class441_111_.aFloatArray4916[15]);
		if (f_121_ >= -f_122_) {
			anInt1999 = (int) (f + f_113_ * f_119_ / f_122_);
			anInt2002 = (int) (f_112_ + f_114_ * f_120_ / f_122_);
		} else
			bool = true;
		i_116_ = i;
		i_117_ = (int) class430.aFloat4851;
		i_118_ = i_115_;
		float f_123_ = (class441_111_.aFloatArray4916[0] * (float) i_116_ + class441_111_.aFloatArray4916[4] * (float) i_117_ + class441_111_.aFloatArray4916[8] * (float) i_118_ + class441_111_.aFloatArray4916[12]);
		float f_124_ = (class441_111_.aFloatArray4916[1] * (float) i_116_ + class441_111_.aFloatArray4916[5] * (float) i_117_ + class441_111_.aFloatArray4916[9] * (float) i_118_ + class441_111_.aFloatArray4916[13]);
		float f_125_ = (class441_111_.aFloatArray4916[2] * (float) i_116_ + class441_111_.aFloatArray4916[6] * (float) i_117_ + class441_111_.aFloatArray4916[10] * (float) i_118_ + class441_111_.aFloatArray4916[14]);
		float f_126_ = (class441_111_.aFloatArray4916[3] * (float) i_116_ + class441_111_.aFloatArray4916[7] * (float) i_117_ + class441_111_.aFloatArray4916[11] * (float) i_118_ + class441_111_.aFloatArray4916[15]);
		if (f_125_ >= -f_126_) {
			anInt1998 = (int) (f + f_113_ * f_123_ / f_126_);
			anInt2003 = (int) (f_112_ + f_114_ * f_124_ / f_126_);
		} else
			bool = true;
		if (bool) {
			if (f_121_ < -f_122_ && f_125_ < -f_126_)
				aBool2000 = false;
			else if (f_121_ < -f_122_) {
				float f_127_ = (f_121_ + f_122_) / (f_125_ + f_126_) - 1.0F;
				float f_128_ = f_119_ + f_127_ * (f_123_ - f_119_);
				float f_129_ = f_120_ + f_127_ * (f_124_ - f_120_);
				float f_130_ = f_122_ + f_127_ * (f_126_ - f_122_);
				anInt1999 = (int) (f + f_113_ * f_128_ / f_130_);
				anInt2002 = (int) (f_112_ + f_114_ * f_129_ / f_130_);
			} else if (f_125_ < -f_126_) {
				float f_131_ = (f_125_ + f_126_) / (f_121_ + f_122_) - 1.0F;
				float f_132_ = f_123_ + f_131_ * (f_119_ - f_123_);
				float f_133_ = f_124_ + f_131_ * (f_120_ - f_124_);
				float f_134_ = f_126_ + f_131_ * (f_122_ - f_126_);
				anInt1998 = (int) (f + f_113_ * f_132_ / f_134_);
				anInt2003 = (int) (f_112_ + f_114_ * f_133_ / f_134_);
			}
		}
		if (aBool2000) {
			float f_135_ = ((float) Math.sqrt(Math.pow((double) (class430.aFloat4854 - class430.aFloat4855), 2.0) + Math.pow((double) (class430.aFloat4856 - (class430.aFloat4853)), 2.0)) / 2.0F);
			if (f_121_ / f_122_ > f_125_ / f_126_) {
				float f_136_ = (f_119_ + class441.aFloatArray4916[0] * f_135_ + class441.aFloatArray4916[12]);
				float f_137_ = (f_122_ + class441.aFloatArray4916[3] * f_135_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1999 + f_113_ * f_136_ / f_137_);
			} else {
				float f_138_ = (f_123_ + class441.aFloatArray4916[0] * f_135_ + class441.aFloatArray4916[12]);
				float f_139_ = (f_126_ + class441.aFloatArray4916[3] * f_135_ + class441.aFloatArray4916[15]);
				anInt2001 = (int) (f - (float) anInt1998 + f_113_ * f_138_ / f_139_);
			}
			aBool2000 = true;
		}
	}
}
