/* Class521_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class521_Sub1 extends Class521 {
	static float[][] aFloatArrayArray10561 = { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
	int[] anIntArray10562 = new int[512];

	static final float method16178(int i, float f, float f_0_, float f_1_) {
		float[] fs = aFloatArrayArray10561[i];
		return fs[0] * f + fs[1] * f_0_ + fs[2] * f_1_;
	}

	static final float method16179(float f, float f_2_, float f_3_) {
		return f + (f_2_ - f) * f_3_;
	}

	static final float method16180(int i, float f, float f_4_, float f_5_) {
		float[] fs = aFloatArrayArray10561[i];
		return fs[0] * f + fs[1] * f_4_ + fs[2] * f_5_;
	}

	void method8650(int i, int i_6_, int i_7_, int i_8_, float f, float f_9_, float f_10_, float f_11_, float[] fs, int i_12_) {
		int i_13_ = (int) ((float) i_6_ * f - 1.0F);
		i_13_ &= 0xff;
		int i_14_ = (int) ((float) i_7_ * f_9_ - 1.0F);
		i_14_ &= 0xff;
		int i_15_ = (int) ((float) i_8_ * f_10_ - 1.0F);
		i_15_ &= 0xff;
		float f_16_ = (float) i * f_10_;
		int i_17_ = (int) f_16_;
		int i_18_ = i_17_ + 1;
		float f_19_ = f_16_ - (float) i_17_;
		float f_20_ = 1.0F - f_19_;
		float f_21_ = method16185(f_19_);
		i_17_ &= i_15_;
		i_18_ &= i_15_;
		int i_22_ = anIntArray10562[i_17_];
		int i_23_ = anIntArray10562[i_18_];
		for (int i_24_ = 0; i_24_ < i_7_; i_24_++) {
			float f_25_ = (float) i_24_ * f_9_;
			int i_26_ = (int) f_25_;
			int i_27_ = i_26_ + 1;
			float f_28_ = f_25_ - (float) i_26_;
			float f_29_ = 1.0F - f_28_;
			float f_30_ = method16185(f_28_);
			i_26_ &= i_14_;
			i_27_ &= i_14_;
			int i_31_ = anIntArray10562[i_26_ + i_22_];
			int i_32_ = anIntArray10562[i_27_ + i_22_];
			int i_33_ = anIntArray10562[i_26_ + i_23_];
			int i_34_ = anIntArray10562[i_27_ + i_23_];
			for (int i_35_ = 0; i_35_ < i_6_; i_35_++) {
				float f_36_ = (float) i_35_ * f;
				int i_37_ = (int) f_36_;
				int i_38_ = i_37_ + 1;
				float f_39_ = f_36_ - (float) i_37_;
				float f_40_ = 1.0F - f_39_;
				float f_41_ = method16185(f_39_);
				i_37_ &= i_13_;
				i_38_ &= i_13_;
				fs[i_12_++] = (f_11_ * (method16179((method16179(method16179(method16180((anIntArray10562[i_37_ + i_31_]) & 0x7, f_40_, f_29_, f_20_), method16180((anIntArray10562[i_38_ + i_31_]) & 0x7, f_39_, f_29_, f_20_), f_41_), method16179(method16180((anIntArray10562[i_37_ + i_32_]) & 0x7, f_40_, f_28_, f_20_), method16180((anIntArray10562[i_38_ + i_32_]) & 0x7, f_39_, f_28_, f_20_), f_41_), f_30_)), (method16179(method16179(method16180((anIntArray10562[i_37_ + i_33_]) & 0x7, f_40_, f_29_, f_19_), method16180((anIntArray10562[i_38_ + i_33_]) & 0x7, f_39_, f_29_, f_19_), f_41_), method16179(method16180((anIntArray10562[i_37_ + i_34_]) & 0x7, f_40_, f_28_, f_19_), method16180((anIntArray10562[i_38_ + i_34_]) & 0x7, f_39_, f_28_, f_19_), f_41_), f_30_)), f_21_)));
			}
		}
	}

	void method8649(int i, int i_42_, int i_43_, int i_44_, float f, float f_45_, float f_46_, float f_47_, float[] fs, int i_48_) {
		int i_49_ = (int) ((float) i_42_ * f - 1.0F);
		i_49_ &= 0xff;
		int i_50_ = (int) ((float) i_43_ * f_45_ - 1.0F);
		i_50_ &= 0xff;
		int i_51_ = (int) ((float) i_44_ * f_46_ - 1.0F);
		i_51_ &= 0xff;
		float f_52_ = (float) i * f_46_;
		int i_53_ = (int) f_52_;
		int i_54_ = i_53_ + 1;
		float f_55_ = f_52_ - (float) i_53_;
		float f_56_ = 1.0F - f_55_;
		float f_57_ = method16185(f_55_);
		i_53_ &= i_51_;
		i_54_ &= i_51_;
		int i_58_ = anIntArray10562[i_53_];
		int i_59_ = anIntArray10562[i_54_];
		for (int i_60_ = 0; i_60_ < i_43_; i_60_++) {
			float f_61_ = (float) i_60_ * f_45_;
			int i_62_ = (int) f_61_;
			int i_63_ = i_62_ + 1;
			float f_64_ = f_61_ - (float) i_62_;
			float f_65_ = 1.0F - f_64_;
			float f_66_ = method16185(f_64_);
			i_62_ &= i_50_;
			i_63_ &= i_50_;
			int i_67_ = anIntArray10562[i_62_ + i_58_];
			int i_68_ = anIntArray10562[i_63_ + i_58_];
			int i_69_ = anIntArray10562[i_62_ + i_59_];
			int i_70_ = anIntArray10562[i_63_ + i_59_];
			for (int i_71_ = 0; i_71_ < i_42_; i_71_++) {
				float f_72_ = (float) i_71_ * f;
				int i_73_ = (int) f_72_;
				int i_74_ = i_73_ + 1;
				float f_75_ = f_72_ - (float) i_73_;
				float f_76_ = 1.0F - f_75_;
				float f_77_ = method16185(f_75_);
				i_73_ &= i_49_;
				i_74_ &= i_49_;
				fs[i_48_++] = (f_47_ * (method16179((method16179(method16179(method16180((anIntArray10562[i_73_ + i_67_]) & 0x7, f_76_, f_65_, f_56_), method16180((anIntArray10562[i_74_ + i_67_]) & 0x7, f_75_, f_65_, f_56_), f_77_), method16179(method16180((anIntArray10562[i_73_ + i_68_]) & 0x7, f_76_, f_64_, f_56_), method16180((anIntArray10562[i_74_ + i_68_]) & 0x7, f_75_, f_64_, f_56_), f_77_), f_66_)), (method16179(method16179(method16180((anIntArray10562[i_73_ + i_69_]) & 0x7, f_76_, f_65_, f_55_), method16180((anIntArray10562[i_74_ + i_69_]) & 0x7, f_75_, f_65_, f_55_), f_77_), method16179(method16180((anIntArray10562[i_73_ + i_70_]) & 0x7, f_76_, f_64_, f_55_), method16180((anIntArray10562[i_74_ + i_70_]) & 0x7, f_75_, f_64_, f_55_), f_77_), f_66_)), f_57_)));
			}
		}
	}

	static final float method16181(float f, float f_78_, float f_79_) {
		return f + (f_78_ - f) * f_79_;
	}

	public Class521_Sub1(int i) {
		Random random = new Random((long) i);
		for (int i_80_ = 0; i_80_ < 256; i_80_++)
			anIntArray10562[i_80_] = anIntArray10562[i_80_ + 256] = i_80_;
		for (int i_81_ = 0; i_81_ < 256; i_81_++) {
			int i_82_ = random.nextInt() & 0xff;
			int i_83_ = anIntArray10562[i_82_];
			anIntArray10562[i_82_] = anIntArray10562[i_82_ + 256] = anIntArray10562[i_81_];
			anIntArray10562[i_81_] = anIntArray10562[i_81_ + 256] = i_83_;
		}
	}

	static final float method16182(float f, float f_84_, float f_85_) {
		return f + (f_84_ - f) * f_85_;
	}

	static final float method16183(float f, float f_86_, float f_87_) {
		return f + (f_86_ - f) * f_87_;
	}

	static final float method16184(float f, float f_88_, float f_89_) {
		return f + (f_88_ - f) * f_89_;
	}

	void method8648(int i, int i_90_, int i_91_, int i_92_, float f, float f_93_, float f_94_, float f_95_, float[] fs, int i_96_) {
		int i_97_ = (int) ((float) i_90_ * f - 1.0F);
		i_97_ &= 0xff;
		int i_98_ = (int) ((float) i_91_ * f_93_ - 1.0F);
		i_98_ &= 0xff;
		int i_99_ = (int) ((float) i_92_ * f_94_ - 1.0F);
		i_99_ &= 0xff;
		float f_100_ = (float) i * f_94_;
		int i_101_ = (int) f_100_;
		int i_102_ = i_101_ + 1;
		float f_103_ = f_100_ - (float) i_101_;
		float f_104_ = 1.0F - f_103_;
		float f_105_ = method16185(f_103_);
		i_101_ &= i_99_;
		i_102_ &= i_99_;
		int i_106_ = anIntArray10562[i_101_];
		int i_107_ = anIntArray10562[i_102_];
		for (int i_108_ = 0; i_108_ < i_91_; i_108_++) {
			float f_109_ = (float) i_108_ * f_93_;
			int i_110_ = (int) f_109_;
			int i_111_ = i_110_ + 1;
			float f_112_ = f_109_ - (float) i_110_;
			float f_113_ = 1.0F - f_112_;
			float f_114_ = method16185(f_112_);
			i_110_ &= i_98_;
			i_111_ &= i_98_;
			int i_115_ = anIntArray10562[i_110_ + i_106_];
			int i_116_ = anIntArray10562[i_111_ + i_106_];
			int i_117_ = anIntArray10562[i_110_ + i_107_];
			int i_118_ = anIntArray10562[i_111_ + i_107_];
			for (int i_119_ = 0; i_119_ < i_90_; i_119_++) {
				float f_120_ = (float) i_119_ * f;
				int i_121_ = (int) f_120_;
				int i_122_ = i_121_ + 1;
				float f_123_ = f_120_ - (float) i_121_;
				float f_124_ = 1.0F - f_123_;
				float f_125_ = method16185(f_123_);
				i_121_ &= i_97_;
				i_122_ &= i_97_;
				fs[i_96_++] = (f_95_ * (method16179((method16179(method16179(method16180((anIntArray10562[i_121_ + i_115_]) & 0x7, f_124_, f_113_, f_104_), method16180((anIntArray10562[i_122_ + i_115_]) & 0x7, f_123_, f_113_, f_104_), f_125_), method16179(method16180((anIntArray10562[i_121_ + i_116_]) & 0x7, f_124_, f_112_, f_104_), method16180((anIntArray10562[i_122_ + i_116_]) & 0x7, f_123_, f_112_, f_104_), f_125_), f_114_)), (method16179(method16179(method16180((anIntArray10562[i_121_ + i_117_]) & 0x7, f_124_, f_113_, f_103_), method16180((anIntArray10562[i_122_ + i_117_]) & 0x7, f_123_, f_113_, f_103_), f_125_), method16179(method16180((anIntArray10562[i_121_ + i_118_]) & 0x7, f_124_, f_112_, f_103_), method16180((anIntArray10562[i_122_ + i_118_]) & 0x7, f_123_, f_112_, f_103_), f_125_), f_114_)), f_105_)));
			}
		}
	}

	static final float method16185(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}
}
