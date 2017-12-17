/* Class164_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class164_Sub1 extends Class164 {
	int[] anIntArray9039;
	byte[][] aByteArrayArray9040;
	int[] anIntArray9041;
	int[] anIntArray9042;
	Class178_Sub3 aClass178_Sub3_9043;
	int[] anIntArray9044;

	void method2626(char c, int i, int i_0_, int i_1_, boolean bool) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			i += anIntArray9039[c];
			i_0_ += anIntArray9042[c];
			int i_2_ = anIntArray9041[c];
			int i_3_ = anIntArray9044[c];
			int i_4_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
			int i_5_ = i + i_0_ * i_4_;
			int i_6_ = i_4_ - i_2_;
			int i_7_ = 0;
			int i_8_ = 0;
			if (i_0_ < -695823527 * aClass178_Sub3_9043.anInt9810) {
				int i_9_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_0_;
				i_3_ -= i_9_;
				i_0_ = aClass178_Sub3_9043.anInt9810 * -695823527;
				i_8_ += i_9_ * i_2_;
				i_5_ += i_4_ * i_9_;
			}
			if (i_3_ + i_0_ > aClass178_Sub3_9043.anInt9826 * 489020741)
				i_3_ -= i_0_ + i_3_ - 489020741 * aClass178_Sub3_9043.anInt9826;
			if (i < aClass178_Sub3_9043.anInt9815 * -1373518821) {
				int i_10_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
				i_2_ -= i_10_;
				i = aClass178_Sub3_9043.anInt9815 * -1373518821;
				i_8_ += i_10_;
				i_5_ += i_10_;
				i_7_ += i_10_;
				i_6_ += i_10_;
			}
			if (i_2_ + i > aClass178_Sub3_9043.anInt9809 * -272361347) {
				int i_11_ = i_2_ + i - -272361347 * aClass178_Sub3_9043.anInt9809;
				i_2_ -= i_11_;
				i_7_ += i_11_;
				i_6_ += i_11_;
			}
			if (i_2_ > 0 && i_3_ > 0)
				method14448(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		}
	}

	Class164_Sub1(Class178_Sub3 class178_sub3, Class10 class10, Class175_Sub1[] class175_sub1s, int[] is, int[] is_12_) {
		super(class178_sub3, class10);
		aClass178_Sub3_9043 = class178_sub3;
		aClass178_Sub3_9043 = class178_sub3;
		anIntArray9041 = is;
		anIntArray9044 = is_12_;
		aByteArrayArray9040 = new byte[class175_sub1s.length][];
		anIntArray9042 = new int[class175_sub1s.length];
		anIntArray9039 = new int[class175_sub1s.length];
		for (int i = 0; i < class175_sub1s.length; i++) {
			Class175_Sub1 class175_sub1 = class175_sub1s[i];
			int[] is_13_ = class175_sub1.method2959(false);
			byte[] is_14_ = aByteArrayArray9040[i] = new byte[is_13_.length];
			for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
				is_14_[i_15_] = (byte) (is_13_[i_15_] >> 24 & 0xff);
			anIntArray9042[i] = class175_sub1.method2948();
			anIntArray9039[i] = class175_sub1.method2946();
		}
	}

	void method2610(char c, int i, int i_16_, int i_17_, boolean bool, Class145 class145, int i_18_, int i_19_) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			if (class145 == null)
				method2616(c, i, i_16_, i_17_, bool);
			else {
				i += anIntArray9039[c];
				i_16_ += anIntArray9042[c];
				int i_20_ = anIntArray9041[c];
				int i_21_ = anIntArray9044[c];
				int i_22_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
				int i_23_ = i_22_ * i_16_ + i;
				int i_24_ = i_22_ - i_20_;
				int i_25_ = 0;
				int i_26_ = 0;
				if (i_16_ < aClass178_Sub3_9043.anInt9810 * -695823527) {
					int i_27_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_16_;
					i_21_ -= i_27_;
					i_16_ = aClass178_Sub3_9043.anInt9810 * -695823527;
					i_26_ += i_20_ * i_27_;
					i_23_ += i_27_ * i_22_;
				}
				if (i_21_ + i_16_ > 489020741 * aClass178_Sub3_9043.anInt9826)
					i_21_ -= (i_21_ + i_16_ - 489020741 * aClass178_Sub3_9043.anInt9826);
				if (i < -1373518821 * aClass178_Sub3_9043.anInt9815) {
					int i_28_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
					i_20_ -= i_28_;
					i = -1373518821 * aClass178_Sub3_9043.anInt9815;
					i_26_ += i_28_;
					i_23_ += i_28_;
					i_25_ += i_28_;
					i_24_ += i_28_;
				}
				if (i + i_20_ > -272361347 * aClass178_Sub3_9043.anInt9809) {
					int i_29_ = (i_20_ + i - -272361347 * aClass178_Sub3_9043.anInt9809);
					i_20_ -= i_29_;
					i_25_ += i_29_;
					i_24_ += i_29_;
				}
				if (i_20_ > 0 && i_21_ > 0)
					method14450(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_17_, i_26_, i_23_, i_20_, i_21_, i_24_, i_25_, i, i_16_, anIntArray9041[c], class145, i_18_, i_19_);
			}
		}
	}

	void method14448(byte[] is, int[] is_30_, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		for (int i_37_ = -i_34_; i_37_ < 0; i_37_++) {
			for (int i_38_ = -i_33_; i_38_ < 0; i_38_++) {
				int i_39_ = is[i_31_++] & 0xff;
				if (0 != i_39_) {
					int i_40_ = (((i_39_ * (i & 0xff00ff) & ~0xff00ff) + (i_39_ * (i & 0xff00) & 0xff0000)) >> 8);
					i_39_ = 256 - i_39_;
					int i_41_ = is_30_[i_32_];
					is_30_[i_32_++] = i_40_ + ((((i_41_ & 0xff00ff) * i_39_ & ~0xff00ff) + ((i_41_ & 0xff00) * i_39_ & 0xff0000)) >> 8);
				} else
					i_32_++;
			}
			i_32_ += i_35_;
			i_31_ += i_36_;
		}
	}

	void method14449(byte[] is, int[] is_42_, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		for (int i_49_ = -i_46_; i_49_ < 0; i_49_++) {
			for (int i_50_ = -i_45_; i_50_ < 0; i_50_++) {
				int i_51_ = is[i_43_++] & 0xff;
				if (0 != i_51_) {
					int i_52_ = (((i_51_ * (i & 0xff00ff) & ~0xff00ff) + (i_51_ * (i & 0xff00) & 0xff0000)) >> 8);
					i_51_ = 256 - i_51_;
					int i_53_ = is_42_[i_44_];
					is_42_[i_44_++] = i_52_ + ((((i_53_ & 0xff00ff) * i_51_ & ~0xff00ff) + ((i_53_ & 0xff00) * i_51_ & 0xff0000)) >> 8);
				} else
					i_44_++;
			}
			i_44_ += i_47_;
			i_43_ += i_48_;
		}
	}

	void method14450(byte[] is, int[] is_54_, int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, Class145 class145, int i_64_, int i_65_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_66_ = class145_sub1.anIntArray9521;
		int[] is_67_ = class145_sub1.anIntArray9520;
		int i_68_ = i_61_ - -1373518821 * aClass178_Sub3_9043.anInt9815;
		int i_69_ = i_62_;
		if (i_65_ > i_69_) {
			i_69_ = i_65_;
			i_56_ += (i_65_ - i_62_) * (aClass178_Sub3_9043.anInt9825 * 1013077751);
			i_55_ += i_63_ * (i_65_ - i_62_);
		}
		int i_70_ = (i_65_ + is_66_.length < i_62_ + i_58_ ? is_66_.length + i_65_ : i_62_ + i_58_);
		for (int i_71_ = i_69_; i_71_ < i_70_; i_71_++) {
			int i_72_ = is_66_[i_71_ - i_65_] + i_64_;
			int i_73_ = is_67_[i_71_ - i_65_];
			int i_74_ = i_57_;
			if (i_68_ > i_72_) {
				int i_75_ = i_68_ - i_72_;
				if (i_75_ >= i_73_) {
					i_55_ += i_60_ + i_57_;
					i_56_ += i_57_ + i_59_;
					continue;
				}
				i_73_ -= i_75_;
			} else {
				int i_76_ = i_72_ - i_68_;
				if (i_76_ >= i_57_) {
					i_55_ += i_60_ + i_57_;
					i_56_ += i_59_ + i_57_;
					continue;
				}
				i_55_ += i_76_;
				i_74_ -= i_76_;
				i_56_ += i_76_;
			}
			int i_77_ = 0;
			if (i_74_ < i_73_)
				i_73_ = i_74_;
			else
				i_77_ = i_74_ - i_73_;
			for (int i_78_ = -i_73_; i_78_ < 0; i_78_++) {
				int i_79_ = is[i_55_++] & 0xff;
				if (0 != i_79_) {
					int i_80_ = (((i_79_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_79_ & ~0xff00ff)) >> 8);
					i_79_ = 256 - i_79_;
					int i_81_ = is_54_[i_56_];
					is_54_[i_56_++] = i_80_ + ((((i_81_ & 0xff00ff) * i_79_ & ~0xff00ff) + (i_79_ * (i_81_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_56_++;
			}
			i_55_ += i_77_ + i_60_;
			i_56_ += i_59_ + i_77_;
		}
	}

	void method2622(char c, int i, int i_82_, int i_83_, boolean bool) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			i += anIntArray9039[c];
			i_82_ += anIntArray9042[c];
			int i_84_ = anIntArray9041[c];
			int i_85_ = anIntArray9044[c];
			int i_86_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
			int i_87_ = i + i_82_ * i_86_;
			int i_88_ = i_86_ - i_84_;
			int i_89_ = 0;
			int i_90_ = 0;
			if (i_82_ < -695823527 * aClass178_Sub3_9043.anInt9810) {
				int i_91_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_82_;
				i_85_ -= i_91_;
				i_82_ = aClass178_Sub3_9043.anInt9810 * -695823527;
				i_90_ += i_91_ * i_84_;
				i_87_ += i_86_ * i_91_;
			}
			if (i_85_ + i_82_ > aClass178_Sub3_9043.anInt9826 * 489020741)
				i_85_ -= (i_82_ + i_85_ - 489020741 * aClass178_Sub3_9043.anInt9826);
			if (i < aClass178_Sub3_9043.anInt9815 * -1373518821) {
				int i_92_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
				i_84_ -= i_92_;
				i = aClass178_Sub3_9043.anInt9815 * -1373518821;
				i_90_ += i_92_;
				i_87_ += i_92_;
				i_89_ += i_92_;
				i_88_ += i_92_;
			}
			if (i_84_ + i > aClass178_Sub3_9043.anInt9809 * -272361347) {
				int i_93_ = i_84_ + i - -272361347 * aClass178_Sub3_9043.anInt9809;
				i_84_ -= i_93_;
				i_89_ += i_93_;
				i_88_ += i_93_;
			}
			if (i_84_ > 0 && i_85_ > 0)
				method14448(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_83_, i_90_, i_87_, i_84_, i_85_, i_88_, i_89_);
		}
	}

	void method2612(char c, int i, int i_94_, int i_95_, boolean bool) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			i += anIntArray9039[c];
			i_94_ += anIntArray9042[c];
			int i_96_ = anIntArray9041[c];
			int i_97_ = anIntArray9044[c];
			int i_98_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
			int i_99_ = i + i_94_ * i_98_;
			int i_100_ = i_98_ - i_96_;
			int i_101_ = 0;
			int i_102_ = 0;
			if (i_94_ < -695823527 * aClass178_Sub3_9043.anInt9810) {
				int i_103_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_94_;
				i_97_ -= i_103_;
				i_94_ = aClass178_Sub3_9043.anInt9810 * -695823527;
				i_102_ += i_103_ * i_96_;
				i_99_ += i_98_ * i_103_;
			}
			if (i_97_ + i_94_ > aClass178_Sub3_9043.anInt9826 * 489020741)
				i_97_ -= (i_94_ + i_97_ - 489020741 * aClass178_Sub3_9043.anInt9826);
			if (i < aClass178_Sub3_9043.anInt9815 * -1373518821) {
				int i_104_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
				i_96_ -= i_104_;
				i = aClass178_Sub3_9043.anInt9815 * -1373518821;
				i_102_ += i_104_;
				i_99_ += i_104_;
				i_101_ += i_104_;
				i_100_ += i_104_;
			}
			if (i_96_ + i > aClass178_Sub3_9043.anInt9809 * -272361347) {
				int i_105_ = i_96_ + i - -272361347 * aClass178_Sub3_9043.anInt9809;
				i_96_ -= i_105_;
				i_101_ += i_105_;
				i_100_ += i_105_;
			}
			if (i_96_ > 0 && i_97_ > 0)
				method14448(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_95_, i_102_, i_99_, i_96_, i_97_, i_100_, i_101_);
		}
	}

	void method14451(byte[] is, int[] is_106_, int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, Class145 class145, int i_116_, int i_117_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_118_ = class145_sub1.anIntArray9521;
		int[] is_119_ = class145_sub1.anIntArray9520;
		int i_120_ = i_113_ - -1373518821 * aClass178_Sub3_9043.anInt9815;
		int i_121_ = i_114_;
		if (i_117_ > i_121_) {
			i_121_ = i_117_;
			i_108_ += (i_117_ - i_114_) * (aClass178_Sub3_9043.anInt9825 * 1013077751);
			i_107_ += i_115_ * (i_117_ - i_114_);
		}
		int i_122_ = (i_117_ + is_118_.length < i_114_ + i_110_ ? is_118_.length + i_117_ : i_114_ + i_110_);
		for (int i_123_ = i_121_; i_123_ < i_122_; i_123_++) {
			int i_124_ = is_118_[i_123_ - i_117_] + i_116_;
			int i_125_ = is_119_[i_123_ - i_117_];
			int i_126_ = i_109_;
			if (i_120_ > i_124_) {
				int i_127_ = i_120_ - i_124_;
				if (i_127_ >= i_125_) {
					i_107_ += i_112_ + i_109_;
					i_108_ += i_109_ + i_111_;
					continue;
				}
				i_125_ -= i_127_;
			} else {
				int i_128_ = i_124_ - i_120_;
				if (i_128_ >= i_109_) {
					i_107_ += i_112_ + i_109_;
					i_108_ += i_111_ + i_109_;
					continue;
				}
				i_107_ += i_128_;
				i_126_ -= i_128_;
				i_108_ += i_128_;
			}
			int i_129_ = 0;
			if (i_126_ < i_125_)
				i_125_ = i_126_;
			else
				i_129_ = i_126_ - i_125_;
			for (int i_130_ = -i_125_; i_130_ < 0; i_130_++) {
				int i_131_ = is[i_107_++] & 0xff;
				if (0 != i_131_) {
					int i_132_ = (((i_131_ * (i & 0xff00) & 0xff0000) + ((i & 0xff00ff) * i_131_ & ~0xff00ff)) >> 8);
					i_131_ = 256 - i_131_;
					int i_133_ = is_106_[i_108_];
					is_106_[i_108_++] = i_132_ + ((((i_133_ & 0xff00ff) * i_131_ & ~0xff00ff) + (i_131_ * (i_133_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_108_++;
			}
			i_107_ += i_129_ + i_112_;
			i_108_ += i_111_ + i_129_;
		}
	}

	Class164_Sub1(Class178_Sub3 class178_sub3, Class10 class10, Class175_Sub2[] class175_sub2s, int[] is, int[] is_134_) {
		super(class178_sub3, class10);
		aClass178_Sub3_9043 = class178_sub3;
		aClass178_Sub3_9043 = class178_sub3;
		anIntArray9041 = is;
		anIntArray9044 = is_134_;
		aByteArrayArray9040 = new byte[class175_sub2s.length][];
		anIntArray9042 = new int[class175_sub2s.length];
		anIntArray9039 = new int[class175_sub2s.length];
		for (int i = 0; i < class175_sub2s.length; i++) {
			Class175_Sub2 class175_sub2 = class175_sub2s[i];
			if (null != class175_sub2.aByteArray9858)
				aByteArrayArray9040[i] = class175_sub2.aByteArray9858;
			else {
				byte[] is_135_ = class175_sub2.aByteArray9857;
				byte[] is_136_ = aByteArrayArray9040[i] = new byte[is_135_.length];
				for (int i_137_ = 0; i_137_ < is_135_.length; i_137_++)
					is_136_[i_137_] = (byte) (0 == is_135_[i_137_] ? 0 : -1);
			}
			anIntArray9042[i] = class175_sub2.anInt9851;
			anIntArray9039[i] = class175_sub2.anInt9852;
		}
	}

	void method2615(char c, int i, int i_138_, int i_139_, boolean bool, Class145 class145, int i_140_, int i_141_) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			if (class145 == null)
				method2616(c, i, i_138_, i_139_, bool);
			else {
				i += anIntArray9039[c];
				i_138_ += anIntArray9042[c];
				int i_142_ = anIntArray9041[c];
				int i_143_ = anIntArray9044[c];
				int i_144_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
				int i_145_ = i_144_ * i_138_ + i;
				int i_146_ = i_144_ - i_142_;
				int i_147_ = 0;
				int i_148_ = 0;
				if (i_138_ < aClass178_Sub3_9043.anInt9810 * -695823527) {
					int i_149_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_138_;
					i_143_ -= i_149_;
					i_138_ = aClass178_Sub3_9043.anInt9810 * -695823527;
					i_148_ += i_142_ * i_149_;
					i_145_ += i_149_ * i_144_;
				}
				if (i_143_ + i_138_ > 489020741 * aClass178_Sub3_9043.anInt9826)
					i_143_ -= (i_143_ + i_138_ - 489020741 * aClass178_Sub3_9043.anInt9826);
				if (i < -1373518821 * aClass178_Sub3_9043.anInt9815) {
					int i_150_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
					i_142_ -= i_150_;
					i = -1373518821 * aClass178_Sub3_9043.anInt9815;
					i_148_ += i_150_;
					i_145_ += i_150_;
					i_147_ += i_150_;
					i_146_ += i_150_;
				}
				if (i + i_142_ > -272361347 * aClass178_Sub3_9043.anInt9809) {
					int i_151_ = (i_142_ + i - -272361347 * aClass178_Sub3_9043.anInt9809);
					i_142_ -= i_151_;
					i_147_ += i_151_;
					i_146_ += i_151_;
				}
				if (i_142_ > 0 && i_143_ > 0)
					method14450(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_139_, i_148_, i_145_, i_142_, i_143_, i_146_, i_147_, i, i_138_, anIntArray9041[c], class145, i_140_, i_141_);
			}
		}
	}

	void method2611(char c, int i, int i_152_, int i_153_, boolean bool) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			i += anIntArray9039[c];
			i_152_ += anIntArray9042[c];
			int i_154_ = anIntArray9041[c];
			int i_155_ = anIntArray9044[c];
			int i_156_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
			int i_157_ = i + i_152_ * i_156_;
			int i_158_ = i_156_ - i_154_;
			int i_159_ = 0;
			int i_160_ = 0;
			if (i_152_ < -695823527 * aClass178_Sub3_9043.anInt9810) {
				int i_161_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_152_;
				i_155_ -= i_161_;
				i_152_ = aClass178_Sub3_9043.anInt9810 * -695823527;
				i_160_ += i_161_ * i_154_;
				i_157_ += i_156_ * i_161_;
			}
			if (i_155_ + i_152_ > aClass178_Sub3_9043.anInt9826 * 489020741)
				i_155_ -= (i_152_ + i_155_ - 489020741 * aClass178_Sub3_9043.anInt9826);
			if (i < aClass178_Sub3_9043.anInt9815 * -1373518821) {
				int i_162_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
				i_154_ -= i_162_;
				i = aClass178_Sub3_9043.anInt9815 * -1373518821;
				i_160_ += i_162_;
				i_157_ += i_162_;
				i_159_ += i_162_;
				i_158_ += i_162_;
			}
			if (i_154_ + i > aClass178_Sub3_9043.anInt9809 * -272361347) {
				int i_163_ = i_154_ + i - -272361347 * aClass178_Sub3_9043.anInt9809;
				i_154_ -= i_163_;
				i_159_ += i_163_;
				i_158_ += i_163_;
			}
			if (i_154_ > 0 && i_155_ > 0)
				method14448(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_153_, i_160_, i_157_, i_154_, i_155_, i_158_, i_159_);
		}
	}

	void method2616(char c, int i, int i_164_, int i_165_, boolean bool) {
		if (null != aClass178_Sub3_9043.anIntArray9804) {
			i += anIntArray9039[c];
			i_164_ += anIntArray9042[c];
			int i_166_ = anIntArray9041[c];
			int i_167_ = anIntArray9044[c];
			int i_168_ = 1013077751 * aClass178_Sub3_9043.anInt9825;
			int i_169_ = i + i_164_ * i_168_;
			int i_170_ = i_168_ - i_166_;
			int i_171_ = 0;
			int i_172_ = 0;
			if (i_164_ < -695823527 * aClass178_Sub3_9043.anInt9810) {
				int i_173_ = -695823527 * aClass178_Sub3_9043.anInt9810 - i_164_;
				i_167_ -= i_173_;
				i_164_ = aClass178_Sub3_9043.anInt9810 * -695823527;
				i_172_ += i_173_ * i_166_;
				i_169_ += i_168_ * i_173_;
			}
			if (i_167_ + i_164_ > aClass178_Sub3_9043.anInt9826 * 489020741)
				i_167_ -= (i_164_ + i_167_ - 489020741 * aClass178_Sub3_9043.anInt9826);
			if (i < aClass178_Sub3_9043.anInt9815 * -1373518821) {
				int i_174_ = aClass178_Sub3_9043.anInt9815 * -1373518821 - i;
				i_166_ -= i_174_;
				i = aClass178_Sub3_9043.anInt9815 * -1373518821;
				i_172_ += i_174_;
				i_169_ += i_174_;
				i_171_ += i_174_;
				i_170_ += i_174_;
			}
			if (i_166_ + i > aClass178_Sub3_9043.anInt9809 * -272361347) {
				int i_175_ = i_166_ + i - -272361347 * aClass178_Sub3_9043.anInt9809;
				i_166_ -= i_175_;
				i_171_ += i_175_;
				i_170_ += i_175_;
			}
			if (i_166_ > 0 && i_167_ > 0)
				method14448(aByteArrayArray9040[c], aClass178_Sub3_9043.anIntArray9804, i_165_, i_172_, i_169_, i_166_, i_167_, i_170_, i_171_);
		}
	}

	public static void method14452(int i, String string, boolean bool, int i_176_) {
		if (Class653_Sub1.method16688((byte) 89)) {
			if (Class43.anInt572 * 426956199 != i)
				Class43.aLong573 = -9083684963104943157L;
			Class43.anInt572 = i * -1907326441;
			Class43.aString583 = string;
			Class43.aBool588 = bool;
			Class657.method10791(3, (byte) -57);
		}
	}

	public static void method14453(byte i) {
		Class250.aClass209_2521.method3773(-2071114168);
		Class250.aClass209_2524.method3773(-1850358613);
		Class250.aClass209_2600.method3773(-2024525541);
		Class250.aClass209_2601.method3773(-2067710979);
	}
}
