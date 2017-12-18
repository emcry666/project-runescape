/* Class164_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class164_Sub5 extends Class164 {
	Class178_Sub3 aClass178_Sub3_9886;
	int[] anIntArray9887;
	int[] anIntArray9888;
	byte[][] aByteArrayArray9889;
	int[] anIntArray9890;
	int[] anIntArray9891;
	public static int anInt9892;

	void method15491(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i >>> 24;
		int i_8_ = 255 - i_7_;
		for (int i_9_ = -i_4_; i_9_ < 0; i_9_++) {
			for (int i_10_ = -i_3_; i_10_ < 0; i_10_++) {
				if (is[i_1_++] != 0) {
					int i_11_ = ((((i & 0xff00) * i_7_ & 0xff0000) + ((i & 0xff00ff) * i_7_ & ~0xff00ff)) >> 8);
					int i_12_ = is_0_[i_2_];
					is_0_[i_2_++] = i_11_ + ((((i_12_ & 0xff00ff) * i_8_ & ~0xff00ff) + (i_8_ * (i_12_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	void method2626(char c, int i, int i_13_, int i_14_, boolean bool) {
		if (aClass178_Sub3_9886.anIntArray9804 != null) {
			i += anIntArray9887[c];
			i_13_ += anIntArray9890[c];
			int i_15_ = anIntArray9888[c];
			int i_16_ = anIntArray9891[c];
			int i_17_ = 1013077751 * aClass178_Sub3_9886.anInt9825;
			int i_18_ = i_13_ * i_17_ + i;
			int i_19_ = i_17_ - i_15_;
			int i_20_ = 0;
			int i_21_ = 0;
			if (i_13_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
				int i_22_ = -695823527 * aClass178_Sub3_9886.anInt9810 - i_13_;
				i_16_ -= i_22_;
				i_13_ = -695823527 * aClass178_Sub3_9886.anInt9810;
				i_21_ += i_15_ * i_22_;
				i_18_ += i_17_ * i_22_;
			}
			if (i_13_ + i_16_ > aClass178_Sub3_9886.anInt9826 * 489020741)
				i_16_ -= (i_16_ + i_13_ - 489020741 * aClass178_Sub3_9886.anInt9826);
			if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
				int i_23_ = -1373518821 * aClass178_Sub3_9886.anInt9815 - i;
				i_15_ -= i_23_;
				i = -1373518821 * aClass178_Sub3_9886.anInt9815;
				i_21_ += i_23_;
				i_18_ += i_23_;
				i_20_ += i_23_;
				i_19_ += i_23_;
			}
			if (i + i_15_ > -272361347 * aClass178_Sub3_9886.anInt9809) {
				int i_24_ = i_15_ + i - -272361347 * aClass178_Sub3_9886.anInt9809;
				i_15_ -= i_24_;
				i_20_ += i_24_;
				i_19_ += i_24_;
			}
			if (i_15_ > 0 && i_16_ > 0) {
				if ((i_14_ & ~0xffffff) == -16777216)
					method15492(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_14_, i_21_, i_18_, i_15_, i_16_, i_19_, i_20_);
				else if ((i_14_ & ~0xffffff) != 0)
					method15491(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_14_, i_21_, i_18_, i_15_, i_16_, i_19_, i_20_);
			}
		}
	}

	void method2616(char c, int i, int i_25_, int i_26_, boolean bool) {
		if (aClass178_Sub3_9886.anIntArray9804 != null) {
			i += anIntArray9887[c];
			i_25_ += anIntArray9890[c];
			int i_27_ = anIntArray9888[c];
			int i_28_ = anIntArray9891[c];
			int i_29_ = 1013077751 * aClass178_Sub3_9886.anInt9825;
			int i_30_ = i_25_ * i_29_ + i;
			int i_31_ = i_29_ - i_27_;
			int i_32_ = 0;
			int i_33_ = 0;
			if (i_25_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
				int i_34_ = -695823527 * aClass178_Sub3_9886.anInt9810 - i_25_;
				i_28_ -= i_34_;
				i_25_ = -695823527 * aClass178_Sub3_9886.anInt9810;
				i_33_ += i_27_ * i_34_;
				i_30_ += i_29_ * i_34_;
			}
			if (i_25_ + i_28_ > aClass178_Sub3_9886.anInt9826 * 489020741)
				i_28_ -= (i_28_ + i_25_ - 489020741 * aClass178_Sub3_9886.anInt9826);
			if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
				int i_35_ = -1373518821 * aClass178_Sub3_9886.anInt9815 - i;
				i_27_ -= i_35_;
				i = -1373518821 * aClass178_Sub3_9886.anInt9815;
				i_33_ += i_35_;
				i_30_ += i_35_;
				i_32_ += i_35_;
				i_31_ += i_35_;
			}
			if (i + i_27_ > -272361347 * aClass178_Sub3_9886.anInt9809) {
				int i_36_ = i_27_ + i - -272361347 * aClass178_Sub3_9886.anInt9809;
				i_27_ -= i_36_;
				i_32_ += i_36_;
				i_31_ += i_36_;
			}
			if (i_27_ > 0 && i_28_ > 0) {
				if ((i_26_ & ~0xffffff) == -16777216)
					method15492(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_26_, i_33_, i_30_, i_27_, i_28_, i_31_, i_32_);
				else if ((i_26_ & ~0xffffff) != 0)
					method15491(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_26_, i_33_, i_30_, i_27_, i_28_, i_31_, i_32_);
			}
		}
	}

	void method15492(byte[] is, int[] is_37_, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		int i_44_ = -(i_40_ >> 2);
		i_40_ = -(i_40_ & 0x3);
		for (int i_45_ = -i_41_; i_45_ < 0; i_45_++) {
			for (int i_46_ = i_44_; i_46_ < 0; i_46_++) {
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
			}
			for (int i_47_ = i_40_; i_47_ < 0; i_47_++) {
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
			}
			i_39_ += i_42_;
			i_38_ += i_43_;
		}
	}

	Class164_Sub5(Class178_Sub3 class178_sub3, Class10 class10, Class175_Sub1[] class175_sub1s, int[] is, int[] is_48_) {
		super(class178_sub3, class10);
		aClass178_Sub3_9886 = class178_sub3;
		anIntArray9888 = is;
		anIntArray9891 = is_48_;
		aByteArrayArray9889 = new byte[class175_sub1s.length][];
		anIntArray9890 = new int[class175_sub1s.length];
		anIntArray9887 = new int[class175_sub1s.length];
		for (int i = 0; i < class175_sub1s.length; i++) {
			int[] is_49_ = class175_sub1s[i].method2959(false);
			byte[] is_50_ = aByteArrayArray9889[i] = new byte[is_49_.length];
			for (int i_51_ = 0; i_51_ < is_49_.length; i_51_++) {
				int i_52_ = is_49_[i_51_];
				byte i_53_ = (byte) ((i_52_ & 0xff) + (4 * (i_52_ >> 8 & 0xff) + (i_52_ >> 16 & 0xff) * 3) >> 3);
				is_50_[i_51_] = i_53_;
			}
			anIntArray9890[i] = class175_sub1s[i].method2948();
			anIntArray9887[i] = class175_sub1s[i].method2946();
		}
	}

	void method2610(char c, int i, int i_54_, int i_55_, boolean bool, Class145 class145, int i_56_, int i_57_) {
		if (null != aClass178_Sub3_9886.anIntArray9804) {
			if (null == class145)
				method2616(c, i, i_54_, i_55_, bool);
			else {
				i += anIntArray9887[c];
				i_54_ += anIntArray9890[c];
				int i_58_ = anIntArray9888[c];
				int i_59_ = anIntArray9891[c];
				int i_60_ = aClass178_Sub3_9886.anInt9825 * 1013077751;
				int i_61_ = i + i_54_ * i_60_;
				int i_62_ = i_60_ - i_58_;
				int i_63_ = 0;
				int i_64_ = 0;
				if (i_54_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
					int i_65_ = aClass178_Sub3_9886.anInt9810 * -695823527 - i_54_;
					i_59_ -= i_65_;
					i_54_ = aClass178_Sub3_9886.anInt9810 * -695823527;
					i_64_ += i_58_ * i_65_;
					i_61_ += i_65_ * i_60_;
				}
				if (i_59_ + i_54_ > aClass178_Sub3_9886.anInt9826 * 489020741)
					i_59_ -= (i_59_ + i_54_ - aClass178_Sub3_9886.anInt9826 * 489020741);
				if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
					int i_66_ = aClass178_Sub3_9886.anInt9815 * -1373518821 - i;
					i_58_ -= i_66_;
					i = aClass178_Sub3_9886.anInt9815 * -1373518821;
					i_64_ += i_66_;
					i_61_ += i_66_;
					i_63_ += i_66_;
					i_62_ += i_66_;
				}
				if (i_58_ + i > aClass178_Sub3_9886.anInt9809 * -272361347) {
					int i_67_ = (i_58_ + i - -272361347 * aClass178_Sub3_9886.anInt9809);
					i_58_ -= i_67_;
					i_63_ += i_67_;
					i_62_ += i_67_;
				}
				if (i_58_ > 0 && i_59_ > 0) {
					if ((i_55_ & ~0xffffff) == -16777216)
						method15493(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_55_, i_64_, i_61_, i_58_, i_59_, i_62_, i_63_, i, i_54_, anIntArray9888[c], class145, i_56_, i_57_);
					else
						method15494(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_55_, i_64_, i_61_, i_58_, i_59_, i_62_, i_63_, i, i_54_, anIntArray9888[c], class145, i_56_, i_57_);
				}
			}
		}
	}

	void method15493(byte[] is, int[] is_68_, int i, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, Class145 class145, int i_78_, int i_79_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_80_ = class145_sub1.anIntArray9521;
		int[] is_81_ = class145_sub1.anIntArray9520;
		int i_82_ = i_76_;
		if (i_79_ > i_82_) {
			i_82_ = i_79_;
			i_70_ += (i_79_ - i_76_) * (aClass178_Sub3_9886.anInt9825 * 1013077751);
			i_69_ += i_77_ * (i_79_ - i_76_);
		}
		int i_83_ = (is_80_.length + i_79_ < i_76_ + i_72_ ? is_80_.length + i_79_ : i_76_ + i_72_);
		for (int i_84_ = i_82_; i_84_ < i_83_; i_84_++) {
			int i_85_ = is_80_[i_84_ - i_79_] + i_78_;
			int i_86_ = is_81_[i_84_ - i_79_];
			int i_87_ = i_71_;
			if (i_75_ > i_85_) {
				int i_88_ = i_75_ - i_85_;
				if (i_88_ >= i_86_) {
					i_69_ += i_71_ + i_74_;
					i_70_ += i_71_ + i_73_;
					continue;
				}
				i_86_ -= i_88_;
			} else {
				int i_89_ = i_85_ - i_75_;
				if (i_89_ >= i_71_) {
					i_69_ += i_74_ + i_71_;
					i_70_ += i_71_ + i_73_;
					continue;
				}
				i_69_ += i_89_;
				i_87_ -= i_89_;
				i_70_ += i_89_;
			}
			int i_90_ = 0;
			if (i_87_ < i_86_)
				i_86_ = i_87_;
			else
				i_90_ = i_87_ - i_86_;
			for (int i_91_ = 0; i_91_ < i_86_; i_91_++) {
				if (is[i_69_++] != 0)
					is_68_[i_70_++] = i;
				else
					i_70_++;
			}
			i_69_ += i_74_ + i_90_;
			i_70_ += i_73_ + i_90_;
		}
	}

	void method15494(byte[] is, int[] is_92_, int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, Class145 class145, int i_102_, int i_103_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_104_ = class145_sub1.anIntArray9521;
		int[] is_105_ = class145_sub1.anIntArray9520;
		int i_106_ = i_99_ - aClass178_Sub3_9886.anInt9815 * -1373518821;
		int i_107_ = i_100_;
		if (i_103_ > i_107_) {
			i_107_ = i_103_;
			i_94_ += 1013077751 * aClass178_Sub3_9886.anInt9825 * (i_103_ - i_100_);
			i_93_ += (i_103_ - i_100_) * i_101_;
		}
		int i_108_ = (i_103_ + is_104_.length < i_100_ + i_96_ ? is_104_.length + i_103_ : i_100_ + i_96_);
		int i_109_ = i >>> 24;
		int i_110_ = 255 - i_109_;
		for (int i_111_ = i_107_; i_111_ < i_108_; i_111_++) {
			int i_112_ = i_102_ + is_104_[i_111_ - i_103_];
			int i_113_ = is_105_[i_111_ - i_103_];
			int i_114_ = i_95_;
			if (i_106_ > i_112_) {
				int i_115_ = i_106_ - i_112_;
				if (i_115_ >= i_113_) {
					i_93_ += i_98_ + i_95_;
					i_94_ += i_97_ + i_95_;
					continue;
				}
				i_113_ -= i_115_;
			} else {
				int i_116_ = i_112_ - i_106_;
				if (i_116_ >= i_95_) {
					i_93_ += i_95_ + i_98_;
					i_94_ += i_97_ + i_95_;
					continue;
				}
				i_93_ += i_116_;
				i_114_ -= i_116_;
				i_94_ += i_116_;
			}
			int i_117_ = 0;
			if (i_114_ < i_113_)
				i_113_ = i_114_;
			else
				i_117_ = i_114_ - i_113_;
			for (int i_118_ = -i_113_; i_118_ < 0; i_118_++) {
				if (is[i_93_++] != 0) {
					int i_119_ = ((((i & 0xff00) * i_109_ & 0xff0000) + (i_109_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_120_ = is_92_[i_94_];
					is_92_[i_94_++] = i_119_ + (((i_110_ * (i_120_ & 0xff00ff) & ~0xff00ff) + (i_110_ * (i_120_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_94_++;
			}
			i_93_ += i_117_ + i_98_;
			i_94_ += i_117_ + i_97_;
		}
	}

	Class164_Sub5(Class178_Sub3 class178_sub3, Class10 class10, Class175_Sub2[] class175_sub2s, int[] is, int[] is_121_) {
		super(class178_sub3, class10);
		aClass178_Sub3_9886 = class178_sub3;
		anIntArray9888 = is;
		anIntArray9891 = is_121_;
		aByteArrayArray9889 = new byte[class175_sub2s.length][];
		anIntArray9890 = new int[class175_sub2s.length];
		anIntArray9887 = new int[class175_sub2s.length];
		for (int i = 0; i < class175_sub2s.length; i++) {
			aByteArrayArray9889[i] = class175_sub2s[i].aByteArray9857;
			anIntArray9890[i] = class175_sub2s[i].anInt9851;
			anIntArray9887[i] = class175_sub2s[i].anInt9852;
		}
	}

	void method2612(char c, int i, int i_122_, int i_123_, boolean bool) {
		if (aClass178_Sub3_9886.anIntArray9804 != null) {
			i += anIntArray9887[c];
			i_122_ += anIntArray9890[c];
			int i_124_ = anIntArray9888[c];
			int i_125_ = anIntArray9891[c];
			int i_126_ = 1013077751 * aClass178_Sub3_9886.anInt9825;
			int i_127_ = i_122_ * i_126_ + i;
			int i_128_ = i_126_ - i_124_;
			int i_129_ = 0;
			int i_130_ = 0;
			if (i_122_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
				int i_131_ = -695823527 * aClass178_Sub3_9886.anInt9810 - i_122_;
				i_125_ -= i_131_;
				i_122_ = -695823527 * aClass178_Sub3_9886.anInt9810;
				i_130_ += i_124_ * i_131_;
				i_127_ += i_126_ * i_131_;
			}
			if (i_122_ + i_125_ > aClass178_Sub3_9886.anInt9826 * 489020741)
				i_125_ -= (i_125_ + i_122_ - 489020741 * aClass178_Sub3_9886.anInt9826);
			if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
				int i_132_ = -1373518821 * aClass178_Sub3_9886.anInt9815 - i;
				i_124_ -= i_132_;
				i = -1373518821 * aClass178_Sub3_9886.anInt9815;
				i_130_ += i_132_;
				i_127_ += i_132_;
				i_129_ += i_132_;
				i_128_ += i_132_;
			}
			if (i + i_124_ > -272361347 * aClass178_Sub3_9886.anInt9809) {
				int i_133_ = i_124_ + i - -272361347 * aClass178_Sub3_9886.anInt9809;
				i_124_ -= i_133_;
				i_129_ += i_133_;
				i_128_ += i_133_;
			}
			if (i_124_ > 0 && i_125_ > 0) {
				if ((i_123_ & ~0xffffff) == -16777216)
					method15492(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_123_, i_130_, i_127_, i_124_, i_125_, i_128_, i_129_);
				else if ((i_123_ & ~0xffffff) != 0)
					method15491(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_123_, i_130_, i_127_, i_124_, i_125_, i_128_, i_129_);
			}
		}
	}

	void method2611(char c, int i, int i_134_, int i_135_, boolean bool) {
		if (aClass178_Sub3_9886.anIntArray9804 != null) {
			i += anIntArray9887[c];
			i_134_ += anIntArray9890[c];
			int i_136_ = anIntArray9888[c];
			int i_137_ = anIntArray9891[c];
			int i_138_ = 1013077751 * aClass178_Sub3_9886.anInt9825;
			int i_139_ = i_134_ * i_138_ + i;
			int i_140_ = i_138_ - i_136_;
			int i_141_ = 0;
			int i_142_ = 0;
			if (i_134_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
				int i_143_ = -695823527 * aClass178_Sub3_9886.anInt9810 - i_134_;
				i_137_ -= i_143_;
				i_134_ = -695823527 * aClass178_Sub3_9886.anInt9810;
				i_142_ += i_136_ * i_143_;
				i_139_ += i_138_ * i_143_;
			}
			if (i_134_ + i_137_ > aClass178_Sub3_9886.anInt9826 * 489020741)
				i_137_ -= (i_137_ + i_134_ - 489020741 * aClass178_Sub3_9886.anInt9826);
			if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
				int i_144_ = -1373518821 * aClass178_Sub3_9886.anInt9815 - i;
				i_136_ -= i_144_;
				i = -1373518821 * aClass178_Sub3_9886.anInt9815;
				i_142_ += i_144_;
				i_139_ += i_144_;
				i_141_ += i_144_;
				i_140_ += i_144_;
			}
			if (i + i_136_ > -272361347 * aClass178_Sub3_9886.anInt9809) {
				int i_145_ = i_136_ + i - -272361347 * aClass178_Sub3_9886.anInt9809;
				i_136_ -= i_145_;
				i_141_ += i_145_;
				i_140_ += i_145_;
			}
			if (i_136_ > 0 && i_137_ > 0) {
				if ((i_135_ & ~0xffffff) == -16777216)
					method15492(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_135_, i_142_, i_139_, i_136_, i_137_, i_140_, i_141_);
				else if ((i_135_ & ~0xffffff) != 0)
					method15491(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_135_, i_142_, i_139_, i_136_, i_137_, i_140_, i_141_);
			}
		}
	}

	void method2622(char c, int i, int i_146_, int i_147_, boolean bool) {
		if (aClass178_Sub3_9886.anIntArray9804 != null) {
			i += anIntArray9887[c];
			i_146_ += anIntArray9890[c];
			int i_148_ = anIntArray9888[c];
			int i_149_ = anIntArray9891[c];
			int i_150_ = 1013077751 * aClass178_Sub3_9886.anInt9825;
			int i_151_ = i_146_ * i_150_ + i;
			int i_152_ = i_150_ - i_148_;
			int i_153_ = 0;
			int i_154_ = 0;
			if (i_146_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
				int i_155_ = -695823527 * aClass178_Sub3_9886.anInt9810 - i_146_;
				i_149_ -= i_155_;
				i_146_ = -695823527 * aClass178_Sub3_9886.anInt9810;
				i_154_ += i_148_ * i_155_;
				i_151_ += i_150_ * i_155_;
			}
			if (i_146_ + i_149_ > aClass178_Sub3_9886.anInt9826 * 489020741)
				i_149_ -= (i_149_ + i_146_ - 489020741 * aClass178_Sub3_9886.anInt9826);
			if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
				int i_156_ = -1373518821 * aClass178_Sub3_9886.anInt9815 - i;
				i_148_ -= i_156_;
				i = -1373518821 * aClass178_Sub3_9886.anInt9815;
				i_154_ += i_156_;
				i_151_ += i_156_;
				i_153_ += i_156_;
				i_152_ += i_156_;
			}
			if (i + i_148_ > -272361347 * aClass178_Sub3_9886.anInt9809) {
				int i_157_ = i_148_ + i - -272361347 * aClass178_Sub3_9886.anInt9809;
				i_148_ -= i_157_;
				i_153_ += i_157_;
				i_152_ += i_157_;
			}
			if (i_148_ > 0 && i_149_ > 0) {
				if ((i_147_ & ~0xffffff) == -16777216)
					method15492(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_147_, i_154_, i_151_, i_148_, i_149_, i_152_, i_153_);
				else if ((i_147_ & ~0xffffff) != 0)
					method15491(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_147_, i_154_, i_151_, i_148_, i_149_, i_152_, i_153_);
			}
		}
	}

	void method2615(char c, int i, int i_158_, int i_159_, boolean bool, Class145 class145, int i_160_, int i_161_) {
		if (null != aClass178_Sub3_9886.anIntArray9804) {
			if (null == class145)
				method2616(c, i, i_158_, i_159_, bool);
			else {
				i += anIntArray9887[c];
				i_158_ += anIntArray9890[c];
				int i_162_ = anIntArray9888[c];
				int i_163_ = anIntArray9891[c];
				int i_164_ = aClass178_Sub3_9886.anInt9825 * 1013077751;
				int i_165_ = i + i_158_ * i_164_;
				int i_166_ = i_164_ - i_162_;
				int i_167_ = 0;
				int i_168_ = 0;
				if (i_158_ < -695823527 * aClass178_Sub3_9886.anInt9810) {
					int i_169_ = aClass178_Sub3_9886.anInt9810 * -695823527 - i_158_;
					i_163_ -= i_169_;
					i_158_ = aClass178_Sub3_9886.anInt9810 * -695823527;
					i_168_ += i_162_ * i_169_;
					i_165_ += i_169_ * i_164_;
				}
				if (i_163_ + i_158_ > aClass178_Sub3_9886.anInt9826 * 489020741)
					i_163_ -= (i_163_ + i_158_ - aClass178_Sub3_9886.anInt9826 * 489020741);
				if (i < -1373518821 * aClass178_Sub3_9886.anInt9815) {
					int i_170_ = aClass178_Sub3_9886.anInt9815 * -1373518821 - i;
					i_162_ -= i_170_;
					i = aClass178_Sub3_9886.anInt9815 * -1373518821;
					i_168_ += i_170_;
					i_165_ += i_170_;
					i_167_ += i_170_;
					i_166_ += i_170_;
				}
				if (i_162_ + i > aClass178_Sub3_9886.anInt9809 * -272361347) {
					int i_171_ = (i_162_ + i - -272361347 * aClass178_Sub3_9886.anInt9809);
					i_162_ -= i_171_;
					i_167_ += i_171_;
					i_166_ += i_171_;
				}
				if (i_162_ > 0 && i_163_ > 0) {
					if ((i_159_ & ~0xffffff) == -16777216)
						method15493(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_159_, i_168_, i_165_, i_162_, i_163_, i_166_, i_167_, i, i_158_, anIntArray9888[c], class145, i_160_, i_161_);
					else
						method15494(aByteArrayArray9889[c], aClass178_Sub3_9886.anIntArray9804, i_159_, i_168_, i_165_, i_162_, i_163_, i_166_, i_167_, i, i_158_, anIntArray9888[c], class145, i_160_, i_161_);
				}
			}
		}
	}

	void method15495(byte[] is, int[] is_172_, int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_) {
		int i_179_ = i >>> 24;
		int i_180_ = 255 - i_179_;
		for (int i_181_ = -i_176_; i_181_ < 0; i_181_++) {
			for (int i_182_ = -i_175_; i_182_ < 0; i_182_++) {
				if (is[i_173_++] != 0) {
					int i_183_ = ((((i & 0xff00) * i_179_ & 0xff0000) + ((i & 0xff00ff) * i_179_ & ~0xff00ff)) >> 8);
					int i_184_ = is_172_[i_174_];
					is_172_[i_174_++] = i_183_ + ((((i_184_ & 0xff00ff) * i_180_ & ~0xff00ff) + (i_180_ * (i_184_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_174_++;
			}
			i_174_ += i_177_;
			i_173_ += i_178_;
		}
	}

	void method15496(byte[] is, int[] is_185_, int i, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, Class145 class145, int i_195_, int i_196_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_197_ = class145_sub1.anIntArray9521;
		int[] is_198_ = class145_sub1.anIntArray9520;
		int i_199_ = i_193_;
		if (i_196_ > i_199_) {
			i_199_ = i_196_;
			i_187_ += (i_196_ - i_193_) * (aClass178_Sub3_9886.anInt9825 * 1013077751);
			i_186_ += i_194_ * (i_196_ - i_193_);
		}
		int i_200_ = (is_197_.length + i_196_ < i_193_ + i_189_ ? is_197_.length + i_196_ : i_193_ + i_189_);
		for (int i_201_ = i_199_; i_201_ < i_200_; i_201_++) {
			int i_202_ = is_197_[i_201_ - i_196_] + i_195_;
			int i_203_ = is_198_[i_201_ - i_196_];
			int i_204_ = i_188_;
			if (i_192_ > i_202_) {
				int i_205_ = i_192_ - i_202_;
				if (i_205_ >= i_203_) {
					i_186_ += i_188_ + i_191_;
					i_187_ += i_188_ + i_190_;
					continue;
				}
				i_203_ -= i_205_;
			} else {
				int i_206_ = i_202_ - i_192_;
				if (i_206_ >= i_188_) {
					i_186_ += i_191_ + i_188_;
					i_187_ += i_188_ + i_190_;
					continue;
				}
				i_186_ += i_206_;
				i_204_ -= i_206_;
				i_187_ += i_206_;
			}
			int i_207_ = 0;
			if (i_204_ < i_203_)
				i_203_ = i_204_;
			else
				i_207_ = i_204_ - i_203_;
			for (int i_208_ = 0; i_208_ < i_203_; i_208_++) {
				if (is[i_186_++] != 0)
					is_185_[i_187_++] = i;
				else
					i_187_++;
			}
			i_186_ += i_191_ + i_207_;
			i_187_ += i_190_ + i_207_;
		}
	}

	void method15497(byte[] is, int[] is_209_, int i, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, Class145 class145, int i_219_, int i_220_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_221_ = class145_sub1.anIntArray9521;
		int[] is_222_ = class145_sub1.anIntArray9520;
		int i_223_ = i_217_;
		if (i_220_ > i_223_) {
			i_223_ = i_220_;
			i_211_ += (i_220_ - i_217_) * (aClass178_Sub3_9886.anInt9825 * 1013077751);
			i_210_ += i_218_ * (i_220_ - i_217_);
		}
		int i_224_ = (is_221_.length + i_220_ < i_217_ + i_213_ ? is_221_.length + i_220_ : i_217_ + i_213_);
		for (int i_225_ = i_223_; i_225_ < i_224_; i_225_++) {
			int i_226_ = is_221_[i_225_ - i_220_] + i_219_;
			int i_227_ = is_222_[i_225_ - i_220_];
			int i_228_ = i_212_;
			if (i_216_ > i_226_) {
				int i_229_ = i_216_ - i_226_;
				if (i_229_ >= i_227_) {
					i_210_ += i_212_ + i_215_;
					i_211_ += i_212_ + i_214_;
					continue;
				}
				i_227_ -= i_229_;
			} else {
				int i_230_ = i_226_ - i_216_;
				if (i_230_ >= i_212_) {
					i_210_ += i_215_ + i_212_;
					i_211_ += i_212_ + i_214_;
					continue;
				}
				i_210_ += i_230_;
				i_228_ -= i_230_;
				i_211_ += i_230_;
			}
			int i_231_ = 0;
			if (i_228_ < i_227_)
				i_227_ = i_228_;
			else
				i_231_ = i_228_ - i_227_;
			for (int i_232_ = 0; i_232_ < i_227_; i_232_++) {
				if (is[i_210_++] != 0)
					is_209_[i_211_++] = i;
				else
					i_211_++;
			}
			i_210_ += i_215_ + i_231_;
			i_211_ += i_214_ + i_231_;
		}
	}

	void method15498(byte[] is, int[] is_233_, int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_, int i_242_, Class145 class145, int i_243_, int i_244_) {
		Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
		int[] is_245_ = class145_sub1.anIntArray9521;
		int[] is_246_ = class145_sub1.anIntArray9520;
		int i_247_ = i_240_ - aClass178_Sub3_9886.anInt9815 * -1373518821;
		int i_248_ = i_241_;
		if (i_244_ > i_248_) {
			i_248_ = i_244_;
			i_235_ += 1013077751 * aClass178_Sub3_9886.anInt9825 * (i_244_ - i_241_);
			i_234_ += (i_244_ - i_241_) * i_242_;
		}
		int i_249_ = (i_244_ + is_245_.length < i_241_ + i_237_ ? is_245_.length + i_244_ : i_241_ + i_237_);
		int i_250_ = i >>> 24;
		int i_251_ = 255 - i_250_;
		for (int i_252_ = i_248_; i_252_ < i_249_; i_252_++) {
			int i_253_ = i_243_ + is_245_[i_252_ - i_244_];
			int i_254_ = is_246_[i_252_ - i_244_];
			int i_255_ = i_236_;
			if (i_247_ > i_253_) {
				int i_256_ = i_247_ - i_253_;
				if (i_256_ >= i_254_) {
					i_234_ += i_239_ + i_236_;
					i_235_ += i_238_ + i_236_;
					continue;
				}
				i_254_ -= i_256_;
			} else {
				int i_257_ = i_253_ - i_247_;
				if (i_257_ >= i_236_) {
					i_234_ += i_236_ + i_239_;
					i_235_ += i_238_ + i_236_;
					continue;
				}
				i_234_ += i_257_;
				i_255_ -= i_257_;
				i_235_ += i_257_;
			}
			int i_258_ = 0;
			if (i_255_ < i_254_)
				i_254_ = i_255_;
			else
				i_258_ = i_255_ - i_254_;
			for (int i_259_ = -i_254_; i_259_ < 0; i_259_++) {
				if (is[i_234_++] != 0) {
					int i_260_ = ((((i & 0xff00) * i_250_ & 0xff0000) + (i_250_ * (i & 0xff00ff) & ~0xff00ff)) >> 8);
					int i_261_ = is_233_[i_235_];
					is_233_[i_235_++] = i_260_ + (((i_251_ * (i_261_ & 0xff00ff) & ~0xff00ff) + (i_251_ * (i_261_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_235_++;
			}
			i_234_ += i_258_ + i_239_;
			i_235_ += i_258_ + i_238_;
		}
	}

	public static boolean method15499(int i, byte i_262_) {
		return 1 != i && 7 != i;
	}
}
