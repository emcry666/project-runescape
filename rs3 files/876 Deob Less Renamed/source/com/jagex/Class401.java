/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public abstract class Class401 {
	int anInt4145;
	static final int anInt4146 = 4096;
	static final int anInt4147 = 12;
	short[] aShortArray4148;
	short[] aShortArray4149 = new short[512];
	int anInt4150 = 0;
	int anInt4151 = 4;
	int anInt4152 = 4;
	int anInt4153 = 4;
	public static int[] anIntArray4154 = new int[4096];
	static final int anInt4155 = 4095;

	abstract void method6546(int i, int i_0_);

	void method6547(int i, int i_1_, int i_2_) {
		int[] is = new int[i];
		int[] is_3_ = new int[i_1_];
		int[] is_4_ = new int[i_2_];
		for (int i_5_ = 0; i_5_ < i; i_5_++)
			is[i_5_] = (i_5_ << 12) / i;
		for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
			is_3_[i_6_] = (i_6_ << 12) / i_1_;
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++)
			is_4_[i_7_] = (i_7_ << 12) / i_2_;
		method6553();
		for (int i_8_ = 0; i_8_ < i_2_; i_8_++) {
			for (int i_9_ = 0; i_9_ < i_1_; i_9_++) {
				for (int i_10_ = 0; i_10_ < i; i_10_++) {
					for (int i_11_ = 0; i_11_ < anInt4145; i_11_++) {
						int i_12_ = aShortArray4148[i_11_] << 12;
						int i_13_ = anInt4151 * i_12_ >> 12;
						int i_14_ = anInt4152 * i_12_ >> 12;
						int i_15_ = anInt4153 * i_12_ >> 12;
						int i_16_ = is[i_10_] * i_12_ >> 12;
						int i_17_ = is_3_[i_9_] * i_12_ >> 12;
						int i_18_ = is_4_[i_8_] * i_12_ >> 12;
						i_16_ *= anInt4151;
						i_17_ *= anInt4152;
						i_18_ *= anInt4153;
						int i_19_ = i_16_ >> 12;
						int i_20_ = i_19_ + 1;
						i_19_ &= 0xff;
						int i_21_ = i_17_ >> 12;
						int i_22_ = i_21_ + 1;
						i_21_ &= 0xff;
						int i_23_ = i_18_ >> 12;
						int i_24_ = i_23_ + 1;
						i_23_ &= 0xff;
						if (i_20_ >= i_13_)
							i_20_ = 0;
						else
							i_20_ &= 0xff;
						if (i_22_ >= i_14_)
							i_22_ = 0;
						else
							i_22_ &= 0xff;
						if (i_24_ >= i_15_)
							i_24_ = 0;
						else
							i_24_ &= 0xff;
						i_16_ &= 0xfff;
						i_17_ &= 0xfff;
						i_18_ &= 0xfff;
						int i_25_ = anIntArray4154[i_16_];
						int i_26_ = anIntArray4154[i_17_];
						int i_27_ = anIntArray4154[i_18_];
						int i_28_ = i_16_ - 4096;
						int i_29_ = i_17_ - 4096;
						int i_30_ = i_18_ - 4096;
						int i_31_ = aShortArray4149[i_23_];
						int i_32_ = aShortArray4149[i_24_];
						int i_33_ = aShortArray4149[i_21_ + i_31_];
						int i_34_ = aShortArray4149[i_22_ + i_31_];
						int i_35_ = aShortArray4149[i_21_ + i_32_];
						int i_36_ = aShortArray4149[i_22_ + i_32_];
						int i_37_ = method6557(aShortArray4149[i_19_ + i_33_], i_16_, i_17_, i_18_);
						int i_38_ = method6557(aShortArray4149[i_20_ + i_33_], i_28_, i_17_, i_18_);
						int i_39_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
						i_37_ = method6557(aShortArray4149[i_19_ + i_34_], i_16_, i_29_, i_18_);
						i_38_ = method6557(aShortArray4149[i_20_ + i_34_], i_28_, i_29_, i_18_);
						int i_40_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
						int i_41_ = i_39_ + (i_26_ * (i_40_ - i_39_) >> 12);
						i_37_ = method6557(aShortArray4149[i_19_ + i_35_], i_16_, i_17_, i_30_);
						i_38_ = method6557(aShortArray4149[i_20_ + i_35_], i_28_, i_17_, i_30_);
						i_39_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
						i_37_ = method6557(aShortArray4149[i_19_ + i_36_], i_16_, i_29_, i_30_);
						i_38_ = method6557(aShortArray4149[i_20_ + i_36_], i_28_, i_29_, i_30_);
						i_40_ = i_37_ + (i_25_ * (i_38_ - i_37_) >> 12);
						int i_42_ = i_39_ + (i_26_ * (i_40_ - i_39_) >> 12);
						method6569(i_11_, i_41_ + (i_27_ * (i_42_ - i_41_) >> 12));
					}
					method6549();
				}
			}
		}
	}

	void method6548(int i, int i_43_, int i_44_) {
		int[] is = new int[i];
		int[] is_45_ = new int[i_43_];
		int[] is_46_ = new int[i_44_];
		for (int i_47_ = 0; i_47_ < i; i_47_++)
			is[i_47_] = (i_47_ << 12) / i;
		for (int i_48_ = 0; i_48_ < i_43_; i_48_++)
			is_45_[i_48_] = (i_48_ << 12) / i_43_;
		for (int i_49_ = 0; i_49_ < i_44_; i_49_++)
			is_46_[i_49_] = (i_49_ << 12) / i_44_;
		method6553();
		for (int i_50_ = 0; i_50_ < i_44_; i_50_++) {
			for (int i_51_ = 0; i_51_ < i_43_; i_51_++) {
				for (int i_52_ = 0; i_52_ < i; i_52_++) {
					for (int i_53_ = 0; i_53_ < anInt4145; i_53_++) {
						int i_54_ = aShortArray4148[i_53_] << 12;
						int i_55_ = anInt4151 * i_54_ >> 12;
						int i_56_ = anInt4152 * i_54_ >> 12;
						int i_57_ = anInt4153 * i_54_ >> 12;
						int i_58_ = is[i_52_] * i_54_ >> 12;
						int i_59_ = is_45_[i_51_] * i_54_ >> 12;
						int i_60_ = is_46_[i_50_] * i_54_ >> 12;
						i_58_ *= anInt4151;
						i_59_ *= anInt4152;
						i_60_ *= anInt4153;
						int i_61_ = i_58_ >> 12;
						int i_62_ = i_61_ + 1;
						i_61_ &= 0xff;
						int i_63_ = i_59_ >> 12;
						int i_64_ = i_63_ + 1;
						i_63_ &= 0xff;
						int i_65_ = i_60_ >> 12;
						int i_66_ = i_65_ + 1;
						i_65_ &= 0xff;
						if (i_62_ >= i_55_)
							i_62_ = 0;
						else
							i_62_ &= 0xff;
						if (i_64_ >= i_56_)
							i_64_ = 0;
						else
							i_64_ &= 0xff;
						if (i_66_ >= i_57_)
							i_66_ = 0;
						else
							i_66_ &= 0xff;
						i_58_ &= 0xfff;
						i_59_ &= 0xfff;
						i_60_ &= 0xfff;
						int i_67_ = anIntArray4154[i_58_];
						int i_68_ = anIntArray4154[i_59_];
						int i_69_ = anIntArray4154[i_60_];
						int i_70_ = i_58_ - 4096;
						int i_71_ = i_59_ - 4096;
						int i_72_ = i_60_ - 4096;
						int i_73_ = aShortArray4149[i_65_];
						int i_74_ = aShortArray4149[i_66_];
						int i_75_ = aShortArray4149[i_63_ + i_73_];
						int i_76_ = aShortArray4149[i_64_ + i_73_];
						int i_77_ = aShortArray4149[i_63_ + i_74_];
						int i_78_ = aShortArray4149[i_64_ + i_74_];
						int i_79_ = method6557(aShortArray4149[i_61_ + i_75_], i_58_, i_59_, i_60_);
						int i_80_ = method6557(aShortArray4149[i_62_ + i_75_], i_70_, i_59_, i_60_);
						int i_81_ = i_79_ + (i_67_ * (i_80_ - i_79_) >> 12);
						i_79_ = method6557(aShortArray4149[i_61_ + i_76_], i_58_, i_71_, i_60_);
						i_80_ = method6557(aShortArray4149[i_62_ + i_76_], i_70_, i_71_, i_60_);
						int i_82_ = i_79_ + (i_67_ * (i_80_ - i_79_) >> 12);
						int i_83_ = i_81_ + (i_68_ * (i_82_ - i_81_) >> 12);
						i_79_ = method6557(aShortArray4149[i_61_ + i_77_], i_58_, i_59_, i_72_);
						i_80_ = method6557(aShortArray4149[i_62_ + i_77_], i_70_, i_59_, i_72_);
						i_81_ = i_79_ + (i_67_ * (i_80_ - i_79_) >> 12);
						i_79_ = method6557(aShortArray4149[i_61_ + i_78_], i_58_, i_71_, i_72_);
						i_80_ = method6557(aShortArray4149[i_62_ + i_78_], i_70_, i_71_, i_72_);
						i_82_ = i_79_ + (i_67_ * (i_80_ - i_79_) >> 12);
						int i_84_ = i_81_ + (i_68_ * (i_82_ - i_81_) >> 12);
						method6569(i_53_, i_83_ + (i_69_ * (i_84_ - i_83_) >> 12));
					}
					method6549();
				}
			}
		}
	}

	abstract void method6549();

	void method6550() {
		aShortArray4148 = new short[anInt4145];
		for (int i = 0; i < anInt4145; i++)
			aShortArray4148[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	void method6551() {
		aShortArray4148 = new short[anInt4145];
		for (int i = 0; i < anInt4145; i++)
			aShortArray4148[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	static int method6552(int i, int i_85_, int i_86_, int i_87_) {
		int i_88_ = i & 0xf;
		int i_89_ = i_88_ < 8 ? i_85_ : i_86_;
		int i_90_ = i_88_ < 4 ? i_86_ : i_88_ == 12 || i_88_ == 14 ? i_85_ : i_87_;
		return (((i_88_ & 0x1) == 0 ? i_89_ : -i_89_) + ((i_88_ & 0x2) == 0 ? i_90_ : -i_90_));
	}

	abstract void method6553();

	static final int method6554(int i) {
		int i_91_ = i * (i * i >> 12) >> 12;
		int i_92_ = i * 6 - 61440;
		int i_93_ = 40960 + (i_92_ * i >> 12);
		return i_93_ * i_91_ >> 12;
	}

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray4154[i] = method6554(i);
	}

	void method6555(int i, int i_94_, int i_95_) {
		int[] is = new int[i];
		int[] is_96_ = new int[i_94_];
		int[] is_97_ = new int[i_95_];
		for (int i_98_ = 0; i_98_ < i; i_98_++)
			is[i_98_] = (i_98_ << 12) / i;
		for (int i_99_ = 0; i_99_ < i_94_; i_99_++)
			is_96_[i_99_] = (i_99_ << 12) / i_94_;
		for (int i_100_ = 0; i_100_ < i_95_; i_100_++)
			is_97_[i_100_] = (i_100_ << 12) / i_95_;
		method6553();
		for (int i_101_ = 0; i_101_ < i_95_; i_101_++) {
			for (int i_102_ = 0; i_102_ < i_94_; i_102_++) {
				for (int i_103_ = 0; i_103_ < i; i_103_++) {
					for (int i_104_ = 0; i_104_ < anInt4145; i_104_++) {
						int i_105_ = aShortArray4148[i_104_] << 12;
						int i_106_ = anInt4151 * i_105_ >> 12;
						int i_107_ = anInt4152 * i_105_ >> 12;
						int i_108_ = anInt4153 * i_105_ >> 12;
						int i_109_ = is[i_103_] * i_105_ >> 12;
						int i_110_ = is_96_[i_102_] * i_105_ >> 12;
						int i_111_ = is_97_[i_101_] * i_105_ >> 12;
						i_109_ *= anInt4151;
						i_110_ *= anInt4152;
						i_111_ *= anInt4153;
						int i_112_ = i_109_ >> 12;
						int i_113_ = i_112_ + 1;
						i_112_ &= 0xff;
						int i_114_ = i_110_ >> 12;
						int i_115_ = i_114_ + 1;
						i_114_ &= 0xff;
						int i_116_ = i_111_ >> 12;
						int i_117_ = i_116_ + 1;
						i_116_ &= 0xff;
						if (i_113_ >= i_106_)
							i_113_ = 0;
						else
							i_113_ &= 0xff;
						if (i_115_ >= i_107_)
							i_115_ = 0;
						else
							i_115_ &= 0xff;
						if (i_117_ >= i_108_)
							i_117_ = 0;
						else
							i_117_ &= 0xff;
						i_109_ &= 0xfff;
						i_110_ &= 0xfff;
						i_111_ &= 0xfff;
						int i_118_ = anIntArray4154[i_109_];
						int i_119_ = anIntArray4154[i_110_];
						int i_120_ = anIntArray4154[i_111_];
						int i_121_ = i_109_ - 4096;
						int i_122_ = i_110_ - 4096;
						int i_123_ = i_111_ - 4096;
						int i_124_ = aShortArray4149[i_116_];
						int i_125_ = aShortArray4149[i_117_];
						int i_126_ = aShortArray4149[i_114_ + i_124_];
						int i_127_ = aShortArray4149[i_115_ + i_124_];
						int i_128_ = aShortArray4149[i_114_ + i_125_];
						int i_129_ = aShortArray4149[i_115_ + i_125_];
						int i_130_ = method6557(aShortArray4149[i_112_ + i_126_], i_109_, i_110_, i_111_);
						int i_131_ = method6557(aShortArray4149[i_113_ + i_126_], i_121_, i_110_, i_111_);
						int i_132_ = i_130_ + (i_118_ * (i_131_ - i_130_) >> 12);
						i_130_ = method6557(aShortArray4149[i_112_ + i_127_], i_109_, i_122_, i_111_);
						i_131_ = method6557(aShortArray4149[i_113_ + i_127_], i_121_, i_122_, i_111_);
						int i_133_ = i_130_ + (i_118_ * (i_131_ - i_130_) >> 12);
						int i_134_ = i_132_ + (i_119_ * (i_133_ - i_132_) >> 12);
						i_130_ = method6557(aShortArray4149[i_112_ + i_128_], i_109_, i_110_, i_123_);
						i_131_ = method6557(aShortArray4149[i_113_ + i_128_], i_121_, i_110_, i_123_);
						i_132_ = i_130_ + (i_118_ * (i_131_ - i_130_) >> 12);
						i_130_ = method6557(aShortArray4149[i_112_ + i_129_], i_109_, i_122_, i_123_);
						i_131_ = method6557(aShortArray4149[i_113_ + i_129_], i_121_, i_122_, i_123_);
						i_133_ = i_130_ + (i_118_ * (i_131_ - i_130_) >> 12);
						int i_135_ = i_132_ + (i_119_ * (i_133_ - i_132_) >> 12);
						method6569(i_104_, i_134_ + (i_120_ * (i_135_ - i_134_) >> 12));
					}
					method6549();
				}
			}
		}
	}

	void method6556(int i, int i_136_, int i_137_) {
		int[] is = new int[i];
		int[] is_138_ = new int[i_136_];
		int[] is_139_ = new int[i_137_];
		for (int i_140_ = 0; i_140_ < i; i_140_++)
			is[i_140_] = (i_140_ << 12) / i;
		for (int i_141_ = 0; i_141_ < i_136_; i_141_++)
			is_138_[i_141_] = (i_141_ << 12) / i_136_;
		for (int i_142_ = 0; i_142_ < i_137_; i_142_++)
			is_139_[i_142_] = (i_142_ << 12) / i_137_;
		method6553();
		for (int i_143_ = 0; i_143_ < i_137_; i_143_++) {
			for (int i_144_ = 0; i_144_ < i_136_; i_144_++) {
				for (int i_145_ = 0; i_145_ < i; i_145_++) {
					for (int i_146_ = 0; i_146_ < anInt4145; i_146_++) {
						int i_147_ = aShortArray4148[i_146_] << 12;
						int i_148_ = anInt4151 * i_147_ >> 12;
						int i_149_ = anInt4152 * i_147_ >> 12;
						int i_150_ = anInt4153 * i_147_ >> 12;
						int i_151_ = is[i_145_] * i_147_ >> 12;
						int i_152_ = is_138_[i_144_] * i_147_ >> 12;
						int i_153_ = is_139_[i_143_] * i_147_ >> 12;
						i_151_ *= anInt4151;
						i_152_ *= anInt4152;
						i_153_ *= anInt4153;
						int i_154_ = i_151_ >> 12;
						int i_155_ = i_154_ + 1;
						i_154_ &= 0xff;
						int i_156_ = i_152_ >> 12;
						int i_157_ = i_156_ + 1;
						i_156_ &= 0xff;
						int i_158_ = i_153_ >> 12;
						int i_159_ = i_158_ + 1;
						i_158_ &= 0xff;
						if (i_155_ >= i_148_)
							i_155_ = 0;
						else
							i_155_ &= 0xff;
						if (i_157_ >= i_149_)
							i_157_ = 0;
						else
							i_157_ &= 0xff;
						if (i_159_ >= i_150_)
							i_159_ = 0;
						else
							i_159_ &= 0xff;
						i_151_ &= 0xfff;
						i_152_ &= 0xfff;
						i_153_ &= 0xfff;
						int i_160_ = anIntArray4154[i_151_];
						int i_161_ = anIntArray4154[i_152_];
						int i_162_ = anIntArray4154[i_153_];
						int i_163_ = i_151_ - 4096;
						int i_164_ = i_152_ - 4096;
						int i_165_ = i_153_ - 4096;
						int i_166_ = aShortArray4149[i_158_];
						int i_167_ = aShortArray4149[i_159_];
						int i_168_ = aShortArray4149[i_156_ + i_166_];
						int i_169_ = aShortArray4149[i_157_ + i_166_];
						int i_170_ = aShortArray4149[i_156_ + i_167_];
						int i_171_ = aShortArray4149[i_157_ + i_167_];
						int i_172_ = method6557(aShortArray4149[i_154_ + i_168_], i_151_, i_152_, i_153_);
						int i_173_ = method6557(aShortArray4149[i_155_ + i_168_], i_163_, i_152_, i_153_);
						int i_174_ = i_172_ + (i_160_ * (i_173_ - i_172_) >> 12);
						i_172_ = method6557(aShortArray4149[i_154_ + i_169_], i_151_, i_164_, i_153_);
						i_173_ = method6557(aShortArray4149[i_155_ + i_169_], i_163_, i_164_, i_153_);
						int i_175_ = i_172_ + (i_160_ * (i_173_ - i_172_) >> 12);
						int i_176_ = i_174_ + (i_161_ * (i_175_ - i_174_) >> 12);
						i_172_ = method6557(aShortArray4149[i_154_ + i_170_], i_151_, i_152_, i_165_);
						i_173_ = method6557(aShortArray4149[i_155_ + i_170_], i_163_, i_152_, i_165_);
						i_174_ = i_172_ + (i_160_ * (i_173_ - i_172_) >> 12);
						i_172_ = method6557(aShortArray4149[i_154_ + i_171_], i_151_, i_164_, i_165_);
						i_173_ = method6557(aShortArray4149[i_155_ + i_171_], i_163_, i_164_, i_165_);
						i_175_ = i_172_ + (i_160_ * (i_173_ - i_172_) >> 12);
						int i_177_ = i_174_ + (i_161_ * (i_175_ - i_174_) >> 12);
						method6569(i_146_, i_176_ + (i_162_ * (i_177_ - i_176_) >> 12));
					}
					method6549();
				}
			}
		}
	}

	static int method6557(int i, int i_178_, int i_179_, int i_180_) {
		int i_181_ = i & 0xf;
		int i_182_ = i_181_ < 8 ? i_178_ : i_179_;
		int i_183_ = (i_181_ < 4 ? i_179_ : i_181_ == 12 || i_181_ == 14 ? i_178_ : i_180_);
		return (((i_181_ & 0x1) == 0 ? i_182_ : -i_182_) + ((i_181_ & 0x2) == 0 ? i_183_ : -i_183_));
	}

	abstract void method6558();

	abstract void method6559();

	abstract void method6560();

	abstract void method6561();

	abstract void method6562();

	abstract void method6563(int i, int i_184_);

	abstract void method6564(int i, int i_185_);

	abstract void method6565(int i, int i_186_);

	void method6566() {
		Random random = new Random((long) anInt4150);
		for (int i = 0; i < 255; i++)
			aShortArray4149[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_187_ = 255 - i;
			int i_188_ = Class588.method9742(random, i_187_, -2071678919);
			short i_189_ = aShortArray4149[i_188_];
			aShortArray4149[i_188_] = aShortArray4149[i_187_];
			aShortArray4149[i_187_] = aShortArray4149[i_187_ + 256] = i_189_;
		}
	}

	void method6567() {
		aShortArray4148 = new short[anInt4145];
		for (int i = 0; i < anInt4145; i++)
			aShortArray4148[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	void method6568() {
		Random random = new Random((long) anInt4150);
		for (int i = 0; i < 255; i++)
			aShortArray4149[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_190_ = 255 - i;
			int i_191_ = Class588.method9742(random, i_190_, -1928495052);
			short i_192_ = aShortArray4149[i_191_];
			aShortArray4149[i_191_] = aShortArray4149[i_190_];
			aShortArray4149[i_190_] = aShortArray4149[i_190_ + 256] = i_192_;
		}
	}

	Class401(int i, int i_193_, int i_194_, int i_195_, int i_196_) {
		anInt4145 = 4;
		anInt4150 = i;
		anInt4151 = i_194_;
		anInt4152 = i_195_;
		anInt4153 = i_196_;
		anInt4145 = i_193_;
		method6551();
		method6566();
	}

	abstract void method6569(int i, int i_197_);

	void method6570() {
		Random random = new Random((long) anInt4150);
		for (int i = 0; i < 255; i++)
			aShortArray4149[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_198_ = 255 - i;
			int i_199_ = Class588.method9742(random, i_198_, -1972768355);
			short i_200_ = aShortArray4149[i_199_];
			aShortArray4149[i_199_] = aShortArray4149[i_198_];
			aShortArray4149[i_198_] = aShortArray4149[i_198_ + 256] = i_200_;
		}
	}

	static final int method6571(int i) {
		int i_201_ = i * (i * i >> 12) >> 12;
		int i_202_ = i * 6 - 61440;
		int i_203_ = 40960 + (i_202_ * i >> 12);
		return i_203_ * i_201_ >> 12;
	}

	static final int method6572(int i) {
		int i_204_ = i * (i * i >> 12) >> 12;
		int i_205_ = i * 6 - 61440;
		int i_206_ = 40960 + (i_205_ * i >> 12);
		return i_206_ * i_204_ >> 12;
	}
}
