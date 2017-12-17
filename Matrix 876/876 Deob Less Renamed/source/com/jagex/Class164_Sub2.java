/* Class164_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class164_Sub2 extends Class164 {
	int[] anIntArray9774;
	byte[][] aByteArrayArray9775;
	Class178_Sub3 aClass178_Sub3_9776;
	int[] anIntArray9777;
	int[] anIntArray9778;
	int[] anIntArray9779;
	int[] anIntArray9780;

	void method15381(byte[] is, int[] is_0_, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, Class145 class145, int i_11_, int i_12_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_13_ = class145_sub1.anIntArray9521;
		int[] is_14_ = class145_sub1.anIntArray9520;
		int i_15_ = i_8_ - -1373518821 * aClass178_Sub3_9776.anInt9815;
		int i_16_ = i_9_;
		if (i_12_ > i_16_) {
			i_16_ = i_12_;
			i_3_ += aClass178_Sub3_9776.anInt9825 * 1013077751 * (i_12_ - i_9_);
			i_2_ += i_10_ * (i_12_ - i_9_);
		}
		int i_17_ = (i_12_ + is_13_.length < i_9_ + i_5_ ? i_12_ + is_13_.length : i_9_ + i_5_);
		boolean bool = false;
		for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
			int i_19_ = is_13_[i_18_ - i_12_] + i_11_;
			int i_20_ = is_14_[i_18_ - i_12_];
			int i_21_ = i_4_;
			if (i_15_ > i_19_) {
				int i_22_ = i_15_ - i_19_;
				if (i_22_ >= i_20_) {
					i_2_ += i_7_ + i_4_;
					i_3_ += i_4_ + i_6_;
					continue;
				}
				i_20_ -= i_22_;
			} else {
				int i_23_ = i_19_ - i_15_;
				if (i_23_ >= i_4_) {
					i_2_ += i_7_ + i_4_;
					i_3_ += i_4_ + i_6_;
					continue;
				}
				i_2_ += i_23_;
				i_21_ -= i_23_;
				i_3_ += i_23_;
			}
			int i_24_ = 0;
			if (i_21_ < i_20_)
				i_20_ = i_21_;
			else
				i_24_ = i_21_ - i_20_;
			for (int i_25_ = -i_20_; i_25_ < 0; i_25_++) {
				int i_26_;
				if ((i_26_ = is[i_2_++]) != 0)
					is_0_[i_3_++] = is_1_[i_26_ & 0xff];
				else
					i_3_++;
			}
			i_2_ += i_24_ + i_7_;
			i_3_ += i_6_ + i_24_;
		}
	}

	void method2616(char c, int i, int i_27_, int i_28_, boolean bool) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			i += anIntArray9780[c];
			i_27_ += anIntArray9779[c];
			int i_29_ = anIntArray9777[c];
			int i_30_ = anIntArray9774[c];
			int i_31_ = 1013077751 * aClass178_Sub3_9776.anInt9825;
			int i_32_ = i + i_31_ * i_27_;
			int i_33_ = i_31_ - i_29_;
			int i_34_ = 0;
			int i_35_ = 0;
			if (i_27_ < -695823527 * aClass178_Sub3_9776.anInt9810) {
				int i_36_ = -695823527 * aClass178_Sub3_9776.anInt9810 - i_27_;
				i_30_ -= i_36_;
				i_27_ = -695823527 * aClass178_Sub3_9776.anInt9810;
				i_35_ += i_29_ * i_36_;
				i_32_ += i_36_ * i_31_;
			}
			if (i_30_ + i_27_ > aClass178_Sub3_9776.anInt9826 * 489020741)
				i_30_ -= (i_30_ + i_27_ - 489020741 * aClass178_Sub3_9776.anInt9826);
			if (i < aClass178_Sub3_9776.anInt9815 * -1373518821) {
				int i_37_ = aClass178_Sub3_9776.anInt9815 * -1373518821 - i;
				i_29_ -= i_37_;
				i = -1373518821 * aClass178_Sub3_9776.anInt9815;
				i_35_ += i_37_;
				i_32_ += i_37_;
				i_34_ += i_37_;
				i_33_ += i_37_;
			}
			if (i_29_ + i > aClass178_Sub3_9776.anInt9809 * -272361347) {
				int i_38_ = i_29_ + i - aClass178_Sub3_9776.anInt9809 * -272361347;
				i_29_ -= i_38_;
				i_34_ += i_38_;
				i_33_ += i_38_;
			}
			if (i_29_ > 0 && i_30_ > 0) {
				if (bool)
					method15383(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_28_, i_35_, i_32_, i_29_, i_30_, i_33_, i_34_);
				else
					method15387(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_35_, i_32_, i_29_, i_30_, i_33_, i_34_);
			}
		}
	}

	void method15382(byte[] is, int[] is_39_, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, Class145 class145, int i_49_, int i_50_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_51_ = class145_sub1.anIntArray9521;
		int[] is_52_ = class145_sub1.anIntArray9520;
		int i_53_ = i_46_ - aClass178_Sub3_9776.anInt9815 * -1373518821;
		int i_54_ = i_47_;
		if (i_50_ > i_54_) {
			i_54_ = i_50_;
			i_41_ += aClass178_Sub3_9776.anInt9825 * 1013077751 * (i_50_ - i_47_);
			i_40_ += i_48_ * (i_50_ - i_47_);
		}
		int i_55_ = (i_50_ + is_51_.length < i_47_ + i_43_ ? i_50_ + is_51_.length : i_47_ + i_43_);
		for (int i_56_ = i_54_; i_56_ < i_55_; i_56_++) {
			int i_57_ = is_51_[i_56_ - i_50_] + i_49_;
			int i_58_ = is_52_[i_56_ - i_50_];
			int i_59_ = i_42_;
			if (i_53_ > i_57_) {
				int i_60_ = i_53_ - i_57_;
				if (i_60_ >= i_58_) {
					i_40_ += i_42_ + i_45_;
					i_41_ += i_44_ + i_42_;
					continue;
				}
				i_58_ -= i_60_;
			} else {
				int i_61_ = i_57_ - i_53_;
				if (i_61_ >= i_42_) {
					i_40_ += i_42_ + i_45_;
					i_41_ += i_42_ + i_44_;
					continue;
				}
				i_40_ += i_61_;
				i_59_ -= i_61_;
				i_41_ += i_61_;
			}
			int i_62_ = 0;
			if (i_59_ < i_58_)
				i_58_ = i_59_;
			else
				i_62_ = i_59_ - i_58_;
			for (int i_63_ = -i_58_; i_63_ < 0; i_63_++) {
				if (is[i_40_++] != 0)
					is_39_[i_41_++] = i;
				else
					i_41_++;
			}
			i_40_ += i_62_ + i_40_;
			i_41_ += i_62_ + i_44_;
		}
	}

	void method15383(byte[] is, int[] is_64_, int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		int i_71_ = -(i_67_ >> 2);
		i_67_ = -(i_67_ & 0x3);
		for (int i_72_ = -i_68_; i_72_ < 0; i_72_++) {
			for (int i_73_ = i_71_; i_73_ < 0; i_73_++) {
				if (is[i_65_++] != 0)
					is_64_[i_66_++] = i;
				else
					i_66_++;
				if (is[i_65_++] != 0)
					is_64_[i_66_++] = i;
				else
					i_66_++;
				if (is[i_65_++] != 0)
					is_64_[i_66_++] = i;
				else
					i_66_++;
				if (is[i_65_++] != 0)
					is_64_[i_66_++] = i;
				else
					i_66_++;
			}
			for (int i_74_ = i_67_; i_74_ < 0; i_74_++) {
				if (is[i_65_++] != 0)
					is_64_[i_66_++] = i;
				else
					i_66_++;
			}
			i_66_ += i_69_;
			i_65_ += i_70_;
		}
	}

	void method2610(char c, int i, int i_75_, int i_76_, boolean bool, Class145 class145, int i_77_, int i_78_) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			if (null == class145)
				method2616(c, i, i_75_, i_76_, bool);
			else {
				i += anIntArray9780[c];
				i_75_ += anIntArray9779[c];
				int i_79_ = anIntArray9777[c];
				int i_80_ = anIntArray9774[c];
				int i_81_ = aClass178_Sub3_9776.anInt9825 * 1013077751;
				int i_82_ = i + i_81_ * i_75_;
				int i_83_ = i_81_ - i_79_;
				int i_84_ = 0;
				int i_85_ = 0;
				if (i_75_ < aClass178_Sub3_9776.anInt9810 * -695823527) {
					int i_86_ = aClass178_Sub3_9776.anInt9810 * -695823527 - i_75_;
					i_80_ -= i_86_;
					i_75_ = aClass178_Sub3_9776.anInt9810 * -695823527;
					i_85_ += i_79_ * i_86_;
					i_82_ += i_86_ * i_81_;
				}
				if (i_75_ + i_80_ > 489020741 * aClass178_Sub3_9776.anInt9826)
					i_80_ -= (i_80_ + i_75_ - 489020741 * aClass178_Sub3_9776.anInt9826);
				if (i < -1373518821 * aClass178_Sub3_9776.anInt9815) {
					int i_87_ = -1373518821 * aClass178_Sub3_9776.anInt9815 - i;
					i_79_ -= i_87_;
					i = -1373518821 * aClass178_Sub3_9776.anInt9815;
					i_85_ += i_87_;
					i_82_ += i_87_;
					i_84_ += i_87_;
					i_83_ += i_87_;
				}
				if (i + i_79_ > aClass178_Sub3_9776.anInt9809 * -272361347) {
					int i_88_ = (i + i_79_ - -272361347 * aClass178_Sub3_9776.anInt9809);
					i_79_ -= i_88_;
					i_84_ += i_88_;
					i_83_ += i_88_;
				}
				if (i_79_ > 0 && i_80_ > 0) {
					if (bool)
						method15384(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_76_, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_, i, i_75_, anIntArray9777[c], class145, i_77_, i_78_);
					else
						method15385(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_76_, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_, i, i_75_, anIntArray9777[c], class145, i_77_, i_78_);
				}
			}
		}
	}

	void method2622(char c, int i, int i_89_, int i_90_, boolean bool) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			i += anIntArray9780[c];
			i_89_ += anIntArray9779[c];
			int i_91_ = anIntArray9777[c];
			int i_92_ = anIntArray9774[c];
			int i_93_ = 1013077751 * aClass178_Sub3_9776.anInt9825;
			int i_94_ = i + i_93_ * i_89_;
			int i_95_ = i_93_ - i_91_;
			int i_96_ = 0;
			int i_97_ = 0;
			if (i_89_ < -695823527 * aClass178_Sub3_9776.anInt9810) {
				int i_98_ = -695823527 * aClass178_Sub3_9776.anInt9810 - i_89_;
				i_92_ -= i_98_;
				i_89_ = -695823527 * aClass178_Sub3_9776.anInt9810;
				i_97_ += i_91_ * i_98_;
				i_94_ += i_98_ * i_93_;
			}
			if (i_92_ + i_89_ > aClass178_Sub3_9776.anInt9826 * 489020741)
				i_92_ -= (i_92_ + i_89_ - 489020741 * aClass178_Sub3_9776.anInt9826);
			if (i < aClass178_Sub3_9776.anInt9815 * -1373518821) {
				int i_99_ = aClass178_Sub3_9776.anInt9815 * -1373518821 - i;
				i_91_ -= i_99_;
				i = -1373518821 * aClass178_Sub3_9776.anInt9815;
				i_97_ += i_99_;
				i_94_ += i_99_;
				i_96_ += i_99_;
				i_95_ += i_99_;
			}
			if (i_91_ + i > aClass178_Sub3_9776.anInt9809 * -272361347) {
				int i_100_ = i_91_ + i - aClass178_Sub3_9776.anInt9809 * -272361347;
				i_91_ -= i_100_;
				i_96_ += i_100_;
				i_95_ += i_100_;
			}
			if (i_91_ > 0 && i_92_ > 0) {
				if (bool)
					method15383(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_90_, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_);
				else
					method15387(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_);
			}
		}
	}

	void method15384(byte[] is, int[] is_101_, int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, Class145 class145, int i_111_, int i_112_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_113_ = class145_sub1.anIntArray9521;
		int[] is_114_ = class145_sub1.anIntArray9520;
		int i_115_ = i_108_ - aClass178_Sub3_9776.anInt9815 * -1373518821;
		int i_116_ = i_109_;
		if (i_112_ > i_116_) {
			i_116_ = i_112_;
			i_103_ += aClass178_Sub3_9776.anInt9825 * 1013077751 * (i_112_ - i_109_);
			i_102_ += i_110_ * (i_112_ - i_109_);
		}
		int i_117_ = (i_112_ + is_113_.length < i_109_ + i_105_ ? i_112_ + is_113_.length : i_109_ + i_105_);
		for (int i_118_ = i_116_; i_118_ < i_117_; i_118_++) {
			int i_119_ = is_113_[i_118_ - i_112_] + i_111_;
			int i_120_ = is_114_[i_118_ - i_112_];
			int i_121_ = i_104_;
			if (i_115_ > i_119_) {
				int i_122_ = i_115_ - i_119_;
				if (i_122_ >= i_120_) {
					i_102_ += i_104_ + i_107_;
					i_103_ += i_106_ + i_104_;
					continue;
				}
				i_120_ -= i_122_;
			} else {
				int i_123_ = i_119_ - i_115_;
				if (i_123_ >= i_104_) {
					i_102_ += i_104_ + i_107_;
					i_103_ += i_104_ + i_106_;
					continue;
				}
				i_102_ += i_123_;
				i_121_ -= i_123_;
				i_103_ += i_123_;
			}
			int i_124_ = 0;
			if (i_121_ < i_120_)
				i_120_ = i_121_;
			else
				i_124_ = i_121_ - i_120_;
			for (int i_125_ = -i_120_; i_125_ < 0; i_125_++) {
				if (is[i_102_++] != 0)
					is_101_[i_103_++] = i;
				else
					i_103_++;
			}
			i_102_ += i_124_ + i_102_;
			i_103_ += i_124_ + i_106_;
		}
	}

	Class164_Sub2(Class178_Sub3 class178_sub3, Class10 class10, Class175_Sub2[] class175_sub2s, int[] is, int[] is_126_) {
		super(class178_sub3, class10);
		aClass178_Sub3_9776 = class178_sub3;
		aClass178_Sub3_9776 = class178_sub3;
		anIntArray9777 = is;
		anIntArray9774 = is_126_;
		aByteArrayArray9775 = new byte[class175_sub2s.length][];
		anIntArray9779 = new int[class175_sub2s.length];
		anIntArray9780 = new int[class175_sub2s.length];
		for (int i = 0; i < class175_sub2s.length; i++) {
			aByteArrayArray9775[i] = class175_sub2s[i].aByteArray9857;
			anIntArray9779[i] = class175_sub2s[i].anInt9851;
			anIntArray9780[i] = class175_sub2s[i].anInt9852;
		}
		anIntArray9778 = class175_sub2s[0].anIntArray9850;
	}

	void method15385(byte[] is, int[] is_127_, int[] is_128_, int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, Class145 class145, int i_138_, int i_139_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_140_ = class145_sub1.anIntArray9521;
		int[] is_141_ = class145_sub1.anIntArray9520;
		int i_142_ = i_135_ - -1373518821 * aClass178_Sub3_9776.anInt9815;
		int i_143_ = i_136_;
		if (i_139_ > i_143_) {
			i_143_ = i_139_;
			i_130_ += aClass178_Sub3_9776.anInt9825 * 1013077751 * (i_139_ - i_136_);
			i_129_ += i_137_ * (i_139_ - i_136_);
		}
		int i_144_ = (i_139_ + is_140_.length < i_136_ + i_132_ ? i_139_ + is_140_.length : i_136_ + i_132_);
		boolean bool = false;
		for (int i_145_ = i_143_; i_145_ < i_144_; i_145_++) {
			int i_146_ = is_140_[i_145_ - i_139_] + i_138_;
			int i_147_ = is_141_[i_145_ - i_139_];
			int i_148_ = i_131_;
			if (i_142_ > i_146_) {
				int i_149_ = i_142_ - i_146_;
				if (i_149_ >= i_147_) {
					i_129_ += i_134_ + i_131_;
					i_130_ += i_131_ + i_133_;
					continue;
				}
				i_147_ -= i_149_;
			} else {
				int i_150_ = i_146_ - i_142_;
				if (i_150_ >= i_131_) {
					i_129_ += i_134_ + i_131_;
					i_130_ += i_131_ + i_133_;
					continue;
				}
				i_129_ += i_150_;
				i_148_ -= i_150_;
				i_130_ += i_150_;
			}
			int i_151_ = 0;
			if (i_148_ < i_147_)
				i_147_ = i_148_;
			else
				i_151_ = i_148_ - i_147_;
			for (int i_152_ = -i_147_; i_152_ < 0; i_152_++) {
				int i_153_;
				if ((i_153_ = is[i_129_++]) != 0)
					is_127_[i_130_++] = is_128_[i_153_ & 0xff];
				else
					i_130_++;
			}
			i_129_ += i_151_ + i_134_;
			i_130_ += i_133_ + i_151_;
		}
	}

	void method2626(char c, int i, int i_154_, int i_155_, boolean bool) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			i += anIntArray9780[c];
			i_154_ += anIntArray9779[c];
			int i_156_ = anIntArray9777[c];
			int i_157_ = anIntArray9774[c];
			int i_158_ = 1013077751 * aClass178_Sub3_9776.anInt9825;
			int i_159_ = i + i_158_ * i_154_;
			int i_160_ = i_158_ - i_156_;
			int i_161_ = 0;
			int i_162_ = 0;
			if (i_154_ < -695823527 * aClass178_Sub3_9776.anInt9810) {
				int i_163_ = -695823527 * aClass178_Sub3_9776.anInt9810 - i_154_;
				i_157_ -= i_163_;
				i_154_ = -695823527 * aClass178_Sub3_9776.anInt9810;
				i_162_ += i_156_ * i_163_;
				i_159_ += i_163_ * i_158_;
			}
			if (i_157_ + i_154_ > aClass178_Sub3_9776.anInt9826 * 489020741)
				i_157_ -= (i_157_ + i_154_ - 489020741 * aClass178_Sub3_9776.anInt9826);
			if (i < aClass178_Sub3_9776.anInt9815 * -1373518821) {
				int i_164_ = aClass178_Sub3_9776.anInt9815 * -1373518821 - i;
				i_156_ -= i_164_;
				i = -1373518821 * aClass178_Sub3_9776.anInt9815;
				i_162_ += i_164_;
				i_159_ += i_164_;
				i_161_ += i_164_;
				i_160_ += i_164_;
			}
			if (i_156_ + i > aClass178_Sub3_9776.anInt9809 * -272361347) {
				int i_165_ = i_156_ + i - aClass178_Sub3_9776.anInt9809 * -272361347;
				i_156_ -= i_165_;
				i_161_ += i_165_;
				i_160_ += i_165_;
			}
			if (i_156_ > 0 && i_157_ > 0) {
				if (bool)
					method15383(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_155_, i_162_, i_159_, i_156_, i_157_, i_160_, i_161_);
				else
					method15387(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_162_, i_159_, i_156_, i_157_, i_160_, i_161_);
			}
		}
	}

	void method2611(char c, int i, int i_166_, int i_167_, boolean bool) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			i += anIntArray9780[c];
			i_166_ += anIntArray9779[c];
			int i_168_ = anIntArray9777[c];
			int i_169_ = anIntArray9774[c];
			int i_170_ = 1013077751 * aClass178_Sub3_9776.anInt9825;
			int i_171_ = i + i_170_ * i_166_;
			int i_172_ = i_170_ - i_168_;
			int i_173_ = 0;
			int i_174_ = 0;
			if (i_166_ < -695823527 * aClass178_Sub3_9776.anInt9810) {
				int i_175_ = -695823527 * aClass178_Sub3_9776.anInt9810 - i_166_;
				i_169_ -= i_175_;
				i_166_ = -695823527 * aClass178_Sub3_9776.anInt9810;
				i_174_ += i_168_ * i_175_;
				i_171_ += i_175_ * i_170_;
			}
			if (i_169_ + i_166_ > aClass178_Sub3_9776.anInt9826 * 489020741)
				i_169_ -= (i_169_ + i_166_ - 489020741 * aClass178_Sub3_9776.anInt9826);
			if (i < aClass178_Sub3_9776.anInt9815 * -1373518821) {
				int i_176_ = aClass178_Sub3_9776.anInt9815 * -1373518821 - i;
				i_168_ -= i_176_;
				i = -1373518821 * aClass178_Sub3_9776.anInt9815;
				i_174_ += i_176_;
				i_171_ += i_176_;
				i_173_ += i_176_;
				i_172_ += i_176_;
			}
			if (i_168_ + i > aClass178_Sub3_9776.anInt9809 * -272361347) {
				int i_177_ = i_168_ + i - aClass178_Sub3_9776.anInt9809 * -272361347;
				i_168_ -= i_177_;
				i_173_ += i_177_;
				i_172_ += i_177_;
			}
			if (i_168_ > 0 && i_169_ > 0) {
				if (bool)
					method15383(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_167_, i_174_, i_171_, i_168_, i_169_, i_172_, i_173_);
				else
					method15387(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_174_, i_171_, i_168_, i_169_, i_172_, i_173_);
			}
		}
	}

	void method2612(char c, int i, int i_178_, int i_179_, boolean bool) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			i += anIntArray9780[c];
			i_178_ += anIntArray9779[c];
			int i_180_ = anIntArray9777[c];
			int i_181_ = anIntArray9774[c];
			int i_182_ = 1013077751 * aClass178_Sub3_9776.anInt9825;
			int i_183_ = i + i_182_ * i_178_;
			int i_184_ = i_182_ - i_180_;
			int i_185_ = 0;
			int i_186_ = 0;
			if (i_178_ < -695823527 * aClass178_Sub3_9776.anInt9810) {
				int i_187_ = -695823527 * aClass178_Sub3_9776.anInt9810 - i_178_;
				i_181_ -= i_187_;
				i_178_ = -695823527 * aClass178_Sub3_9776.anInt9810;
				i_186_ += i_180_ * i_187_;
				i_183_ += i_187_ * i_182_;
			}
			if (i_181_ + i_178_ > aClass178_Sub3_9776.anInt9826 * 489020741)
				i_181_ -= (i_181_ + i_178_ - 489020741 * aClass178_Sub3_9776.anInt9826);
			if (i < aClass178_Sub3_9776.anInt9815 * -1373518821) {
				int i_188_ = aClass178_Sub3_9776.anInt9815 * -1373518821 - i;
				i_180_ -= i_188_;
				i = -1373518821 * aClass178_Sub3_9776.anInt9815;
				i_186_ += i_188_;
				i_183_ += i_188_;
				i_185_ += i_188_;
				i_184_ += i_188_;
			}
			if (i_180_ + i > aClass178_Sub3_9776.anInt9809 * -272361347) {
				int i_189_ = i_180_ + i - aClass178_Sub3_9776.anInt9809 * -272361347;
				i_180_ -= i_189_;
				i_185_ += i_189_;
				i_184_ += i_189_;
			}
			if (i_180_ > 0 && i_181_ > 0) {
				if (bool)
					method15383(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_179_, i_186_, i_183_, i_180_, i_181_, i_184_, i_185_);
				else
					method15387(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_186_, i_183_, i_180_, i_181_, i_184_, i_185_);
			}
		}
	}

	void method15386(byte[] is, int[] is_190_, int i, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_) {
		int i_197_ = -(i_193_ >> 2);
		i_193_ = -(i_193_ & 0x3);
		for (int i_198_ = -i_194_; i_198_ < 0; i_198_++) {
			for (int i_199_ = i_197_; i_199_ < 0; i_199_++) {
				if (is[i_191_++] != 0)
					is_190_[i_192_++] = i;
				else
					i_192_++;
				if (is[i_191_++] != 0)
					is_190_[i_192_++] = i;
				else
					i_192_++;
				if (is[i_191_++] != 0)
					is_190_[i_192_++] = i;
				else
					i_192_++;
				if (is[i_191_++] != 0)
					is_190_[i_192_++] = i;
				else
					i_192_++;
			}
			for (int i_200_ = i_193_; i_200_ < 0; i_200_++) {
				if (is[i_191_++] != 0)
					is_190_[i_192_++] = i;
				else
					i_192_++;
			}
			i_192_ += i_195_;
			i_191_ += i_196_;
		}
	}

	void method15387(byte[] is, int[] is_201_, int[] is_202_, int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_) {
		int i_208_ = -(i_204_ >> 2);
		i_204_ = -(i_204_ & 0x3);
		boolean bool = false;
		for (int i_209_ = -i_205_; i_209_ < 0; i_209_++) {
			for (int i_210_ = i_208_; i_210_ < 0; i_210_++) {
				int i_211_;
				if ((i_211_ = is[i++]) != 0)
					is_201_[i_203_++] = is_202_[i_211_ & 0xff];
				else
					i_203_++;
				if ((i_211_ = is[i++]) != 0)
					is_201_[i_203_++] = is_202_[i_211_ & 0xff];
				else
					i_203_++;
				if ((i_211_ = is[i++]) != 0)
					is_201_[i_203_++] = is_202_[i_211_ & 0xff];
				else
					i_203_++;
				if ((i_211_ = is[i++]) != 0)
					is_201_[i_203_++] = is_202_[i_211_ & 0xff];
				else
					i_203_++;
			}
			for (int i_212_ = i_204_; i_212_ < 0; i_212_++) {
				int i_213_;
				if ((i_213_ = is[i++]) != 0)
					is_201_[i_203_++] = is_202_[i_213_ & 0xff];
				else
					i_203_++;
			}
			i_203_ += i_206_;
			i += i_207_;
		}
	}

	void method2615(char c, int i, int i_214_, int i_215_, boolean bool, Class145 class145, int i_216_, int i_217_) {
		if (null != aClass178_Sub3_9776.anIntArray9804) {
			if (null == class145)
				method2616(c, i, i_214_, i_215_, bool);
			else {
				i += anIntArray9780[c];
				i_214_ += anIntArray9779[c];
				int i_218_ = anIntArray9777[c];
				int i_219_ = anIntArray9774[c];
				int i_220_ = aClass178_Sub3_9776.anInt9825 * 1013077751;
				int i_221_ = i + i_220_ * i_214_;
				int i_222_ = i_220_ - i_218_;
				int i_223_ = 0;
				int i_224_ = 0;
				if (i_214_ < aClass178_Sub3_9776.anInt9810 * -695823527) {
					int i_225_ = aClass178_Sub3_9776.anInt9810 * -695823527 - i_214_;
					i_219_ -= i_225_;
					i_214_ = aClass178_Sub3_9776.anInt9810 * -695823527;
					i_224_ += i_218_ * i_225_;
					i_221_ += i_225_ * i_220_;
				}
				if (i_214_ + i_219_ > 489020741 * aClass178_Sub3_9776.anInt9826)
					i_219_ -= (i_219_ + i_214_ - 489020741 * aClass178_Sub3_9776.anInt9826);
				if (i < -1373518821 * aClass178_Sub3_9776.anInt9815) {
					int i_226_ = -1373518821 * aClass178_Sub3_9776.anInt9815 - i;
					i_218_ -= i_226_;
					i = -1373518821 * aClass178_Sub3_9776.anInt9815;
					i_224_ += i_226_;
					i_221_ += i_226_;
					i_223_ += i_226_;
					i_222_ += i_226_;
				}
				if (i + i_218_ > aClass178_Sub3_9776.anInt9809 * -272361347) {
					int i_227_ = (i + i_218_ - -272361347 * aClass178_Sub3_9776.anInt9809);
					i_218_ -= i_227_;
					i_223_ += i_227_;
					i_222_ += i_227_;
				}
				if (i_218_ > 0 && i_219_ > 0) {
					if (bool)
						method15384(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, i_215_, i_224_, i_221_, i_218_, i_219_, i_222_, i_223_, i, i_214_, anIntArray9777[c], class145, i_216_, i_217_);
					else
						method15385(aByteArrayArray9775[c], aClass178_Sub3_9776.anIntArray9804, anIntArray9778, i_215_, i_224_, i_221_, i_218_, i_219_, i_222_, i_223_, i, i_214_, anIntArray9777[c], class145, i_216_, i_217_);
				}
			}
		}
	}

	void method15388(byte[] is, int[] is_228_, int i, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_, Class145 class145, int i_238_, int i_239_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_240_ = class145_sub1.anIntArray9521;
		int[] is_241_ = class145_sub1.anIntArray9520;
		int i_242_ = i_235_ - aClass178_Sub3_9776.anInt9815 * -1373518821;
		int i_243_ = i_236_;
		if (i_239_ > i_243_) {
			i_243_ = i_239_;
			i_230_ += aClass178_Sub3_9776.anInt9825 * 1013077751 * (i_239_ - i_236_);
			i_229_ += i_237_ * (i_239_ - i_236_);
		}
		int i_244_ = (i_239_ + is_240_.length < i_236_ + i_232_ ? i_239_ + is_240_.length : i_236_ + i_232_);
		for (int i_245_ = i_243_; i_245_ < i_244_; i_245_++) {
			int i_246_ = is_240_[i_245_ - i_239_] + i_238_;
			int i_247_ = is_241_[i_245_ - i_239_];
			int i_248_ = i_231_;
			if (i_242_ > i_246_) {
				int i_249_ = i_242_ - i_246_;
				if (i_249_ >= i_247_) {
					i_229_ += i_231_ + i_234_;
					i_230_ += i_233_ + i_231_;
					continue;
				}
				i_247_ -= i_249_;
			} else {
				int i_250_ = i_246_ - i_242_;
				if (i_250_ >= i_231_) {
					i_229_ += i_231_ + i_234_;
					i_230_ += i_231_ + i_233_;
					continue;
				}
				i_229_ += i_250_;
				i_248_ -= i_250_;
				i_230_ += i_250_;
			}
			int i_251_ = 0;
			if (i_248_ < i_247_)
				i_247_ = i_248_;
			else
				i_251_ = i_248_ - i_247_;
			for (int i_252_ = -i_247_; i_252_ < 0; i_252_++) {
				if (is[i_229_++] != 0)
					is_228_[i_230_++] = i;
				else
					i_230_++;
			}
			i_229_ += i_251_ + i_229_;
			i_230_ += i_251_ + i_233_;
		}
	}

	public static int method15389(int i, int i_253_) {
		return i & 0xff;
	}

	static void method15390(int i, int i_254_) {
		Class111.aClass209_1340.method3772(i, (byte) -102);
	}

	public static void method15391(boolean bool, int i) {
		/* empty */
	}
}
