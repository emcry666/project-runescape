/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class249 {
	int anInt2493;
	int[] anIntArray2494;
	int anInt2495;
	float[][] aFloatArrayArray2496;
	int[] anIntArray2497;
	int anInt2498 = 0;
	int[] anIntArray2499;
	int anInt2500 = 0;

	int method4406(Class256 class256) {
		int i;
		for (i = 0; anIntArray2497[i] >= 0; i = class256.method4602() != 0 ? anIntArray2497[i] : i + 1) {
			/* empty */
		}
		return anIntArray2497[i] ^ 0xffffffff;
	}

	static int method4407(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1; Class291.method5234(i_1_, i_0_, -1996480702) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}

	void method4408(Class256 class256) {
		class256.method4608(anInt2498 * 8 + anInt2500);
	}

	void method4409() {
		int[] is = new int[anInt2493];
		int[] is_2_ = new int[33];
		for (int i = 0; i < anInt2493; i++) {
			int i_3_ = anIntArray2494[i];
			if (i_3_ != 0) {
				int i_4_ = 1 << 32 - i_3_;
				int i_5_ = is_2_[i_3_];
				is[i] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0)
					i_6_ = is_2_[i_3_ - 1];
				else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						int i_8_ = is_2_[i_7_];
						if (i_8_ != i_5_)
							break;
						int i_9_ = 1 << 32 - i_7_;
						if ((i_8_ & i_9_) != 0) {
							is_2_[i_7_] = is_2_[i_7_ - 1];
							break;
						}
						is_2_[i_7_] = i_8_ | i_9_;
					}
				}
				is_2_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					int i_11_ = is_2_[i_10_];
					if (i_11_ == i_5_)
						is_2_[i_10_] = i_6_;
				}
			}
		}
		anIntArray2497 = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < anInt2493; i_12_++) {
			int i_13_ = anIntArray2494[i_12_];
			if (i_13_ != 0) {
				int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (anIntArray2497[i_15_] == 0)
							anIntArray2497[i_15_] = i;
						i_15_ = anIntArray2497[i_15_];
					} else
						i_15_++;
					if (i_15_ >= anIntArray2497.length) {
						int[] is_18_ = new int[anIntArray2497.length * 2];
						for (int i_19_ = 0; i_19_ < anIntArray2497.length; i_19_++)
							is_18_[i_19_] = anIntArray2497[i_19_];
						anIntArray2497 = is_18_;
					}
					i_17_ >>>= 1;
				}
				anIntArray2497[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i)
					i = i_15_ + 1;
			}
		}
	}

	Class249() {
		/* empty */
	}

	int method4410(Class256 class256) {
		int i;
		for (i = 0; anIntArray2497[i] >= 0; i = class256.method4602() != 0 ? anIntArray2497[i] : i + 1) {
			/* empty */
		}
		return anIntArray2497[i] ^ 0xffffffff;
	}

	float[] method4411(Class256 class256) {
		return aFloatArrayArray2496[method4410(class256)];
	}

	void method4412(Class256 class256) {
		int i = class256.method4605();
		int i_20_ = class256.method4604();
		class256.method4608(24);
		anInt2495 = class256.method4608(16);
		anInt2493 = class256.method4608(24);
		if (anIntArray2494 == null || anIntArray2494.length != anInt2493)
			anIntArray2494 = new int[anInt2493];
		boolean bool = class256.method4602() != 0;
		if (bool) {
			int i_21_ = 0;
			int i_22_ = class256.method4608(5) + 1;
			while (i_21_ < anInt2493) {
				int i_23_ = class256.method4608(Class181.method3537((anInt2493 - i_21_), (byte) 0));
				for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
					anIntArray2494[i_21_++] = i_22_;
				i_22_++;
			}
		} else {
			boolean bool_25_ = class256.method4602() != 0;
			for (int i_26_ = 0; i_26_ < anInt2493; i_26_++) {
				if (bool_25_ && class256.method4602() == 0)
					anIntArray2494[i_26_] = 0;
				else
					anIntArray2494[i_26_] = class256.method4608(5) + 1;
			}
		}
		method4409();
		int i_27_ = class256.method4608(4);
		if (i_27_ > 0) {
			float f = class256.method4603(class256.method4608(32));
			float f_28_ = class256.method4603(class256.method4608(32));
			int i_29_ = class256.method4608(4) + 1;
			boolean bool_30_ = class256.method4602() != 0;
			int i_31_;
			if (i_27_ == 1)
				i_31_ = method4407(anInt2493, anInt2495);
			else
				i_31_ = anInt2493 * anInt2495;
			anIntArray2499 = new int[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
				anIntArray2499[i_32_] = class256.method4608(i_29_);
			aFloatArrayArray2496 = new float[anInt2493][anInt2495];
			if (i_27_ == 1) {
				for (int i_33_ = 0; i_33_ < anInt2493; i_33_++) {
					float f_34_ = 0.0F;
					int i_35_ = 1;
					for (int i_36_ = 0; i_36_ < anInt2495; i_36_++) {
						int i_37_ = i_33_ / i_35_ % i_31_;
						float f_38_ = ((float) anIntArray2499[i_37_] * f_28_ + f + f_34_);
						aFloatArrayArray2496[i_33_][i_36_] = f_38_;
						if (bool_30_)
							f_34_ = f_38_;
						i_35_ *= i_31_;
					}
				}
			} else {
				for (int i_39_ = 0; i_39_ < anInt2493; i_39_++) {
					float f_40_ = 0.0F;
					int i_41_ = i_39_ * anInt2495;
					for (int i_42_ = 0; i_42_ < anInt2495; i_42_++) {
						float f_43_ = ((float) anIntArray2499[i_41_] * f_28_ + f + f_40_);
						aFloatArrayArray2496[i_39_][i_42_] = f_43_;
						if (bool_30_)
							f_40_ = f_43_;
						i_41_++;
					}
				}
			}
		}
		anInt2500 = class256.method4605() - i;
		anInt2498 = class256.method4604() - i_20_;
	}

	static int method4413(int i, int i_44_) {
		int i_45_;
		for (i_45_ = (int) Math.pow((double) i, 1.0 / (double) i_44_) + 1; Class291.method5234(i_45_, i_44_, -622292410) > i; i_45_--) {
			/* empty */
		}
		return i_45_;
	}

	static int method4414(int i, int i_46_) {
		int i_47_;
		for (i_47_ = (int) Math.pow((double) i, 1.0 / (double) i_46_) + 1; Class291.method5234(i_47_, i_46_, 654817853) > i; i_47_--) {
			/* empty */
		}
		return i_47_;
	}

	void method4415(Class256 class256) {
		int i = class256.method4605();
		int i_48_ = class256.method4604();
		class256.method4608(24);
		anInt2495 = class256.method4608(16);
		anInt2493 = class256.method4608(24);
		if (anIntArray2494 == null || anIntArray2494.length != anInt2493)
			anIntArray2494 = new int[anInt2493];
		boolean bool = class256.method4602() != 0;
		if (bool) {
			int i_49_ = 0;
			int i_50_ = class256.method4608(5) + 1;
			while (i_49_ < anInt2493) {
				int i_51_ = class256.method4608(Class181.method3537((anInt2493 - i_49_), (byte) 0));
				for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
					anIntArray2494[i_49_++] = i_50_;
				i_50_++;
			}
		} else {
			boolean bool_53_ = class256.method4602() != 0;
			for (int i_54_ = 0; i_54_ < anInt2493; i_54_++) {
				if (bool_53_ && class256.method4602() == 0)
					anIntArray2494[i_54_] = 0;
				else
					anIntArray2494[i_54_] = class256.method4608(5) + 1;
			}
		}
		method4409();
		int i_55_ = class256.method4608(4);
		if (i_55_ > 0) {
			float f = class256.method4603(class256.method4608(32));
			float f_56_ = class256.method4603(class256.method4608(32));
			int i_57_ = class256.method4608(4) + 1;
			boolean bool_58_ = class256.method4602() != 0;
			int i_59_;
			if (i_55_ == 1)
				i_59_ = method4407(anInt2493, anInt2495);
			else
				i_59_ = anInt2493 * anInt2495;
			anIntArray2499 = new int[i_59_];
			for (int i_60_ = 0; i_60_ < i_59_; i_60_++)
				anIntArray2499[i_60_] = class256.method4608(i_57_);
			aFloatArrayArray2496 = new float[anInt2493][anInt2495];
			if (i_55_ == 1) {
				for (int i_61_ = 0; i_61_ < anInt2493; i_61_++) {
					float f_62_ = 0.0F;
					int i_63_ = 1;
					for (int i_64_ = 0; i_64_ < anInt2495; i_64_++) {
						int i_65_ = i_61_ / i_63_ % i_59_;
						float f_66_ = ((float) anIntArray2499[i_65_] * f_56_ + f + f_62_);
						aFloatArrayArray2496[i_61_][i_64_] = f_66_;
						if (bool_58_)
							f_62_ = f_66_;
						i_63_ *= i_59_;
					}
				}
			} else {
				for (int i_67_ = 0; i_67_ < anInt2493; i_67_++) {
					float f_68_ = 0.0F;
					int i_69_ = i_67_ * anInt2495;
					for (int i_70_ = 0; i_70_ < anInt2495; i_70_++) {
						float f_71_ = ((float) anIntArray2499[i_69_] * f_56_ + f + f_68_);
						aFloatArrayArray2496[i_67_][i_70_] = f_71_;
						if (bool_58_)
							f_68_ = f_71_;
						i_69_++;
					}
				}
			}
		}
		anInt2500 = class256.method4605() - i;
		anInt2498 = class256.method4604() - i_48_;
	}

	void method4416(Class256 class256) {
		class256.method4608(anInt2498 * 8 + anInt2500);
	}

	void method4417() {
		int[] is = new int[anInt2493];
		int[] is_72_ = new int[33];
		for (int i = 0; i < anInt2493; i++) {
			int i_73_ = anIntArray2494[i];
			if (i_73_ != 0) {
				int i_74_ = 1 << 32 - i_73_;
				int i_75_ = is_72_[i_73_];
				is[i] = i_75_;
				int i_76_;
				if ((i_75_ & i_74_) != 0)
					i_76_ = is_72_[i_73_ - 1];
				else {
					i_76_ = i_75_ | i_74_;
					for (int i_77_ = i_73_ - 1; i_77_ >= 1; i_77_--) {
						int i_78_ = is_72_[i_77_];
						if (i_78_ != i_75_)
							break;
						int i_79_ = 1 << 32 - i_77_;
						if ((i_78_ & i_79_) != 0) {
							is_72_[i_77_] = is_72_[i_77_ - 1];
							break;
						}
						is_72_[i_77_] = i_78_ | i_79_;
					}
				}
				is_72_[i_73_] = i_76_;
				for (int i_80_ = i_73_ + 1; i_80_ <= 32; i_80_++) {
					int i_81_ = is_72_[i_80_];
					if (i_81_ == i_75_)
						is_72_[i_80_] = i_76_;
				}
			}
		}
		anIntArray2497 = new int[8];
		int i = 0;
		for (int i_82_ = 0; i_82_ < anInt2493; i_82_++) {
			int i_83_ = anIntArray2494[i_82_];
			if (i_83_ != 0) {
				int i_84_ = is[i_82_];
				int i_85_ = 0;
				for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
					int i_87_ = -2147483648 >>> i_86_;
					if ((i_84_ & i_87_) != 0) {
						if (anIntArray2497[i_85_] == 0)
							anIntArray2497[i_85_] = i;
						i_85_ = anIntArray2497[i_85_];
					} else
						i_85_++;
					if (i_85_ >= anIntArray2497.length) {
						int[] is_88_ = new int[anIntArray2497.length * 2];
						for (int i_89_ = 0; i_89_ < anIntArray2497.length; i_89_++)
							is_88_[i_89_] = anIntArray2497[i_89_];
						anIntArray2497 = is_88_;
					}
					i_87_ >>>= 1;
				}
				anIntArray2497[i_85_] = i_82_ ^ 0xffffffff;
				if (i_85_ >= i)
					i = i_85_ + 1;
			}
		}
	}

	void method4418() {
		int[] is = new int[anInt2493];
		int[] is_90_ = new int[33];
		for (int i = 0; i < anInt2493; i++) {
			int i_91_ = anIntArray2494[i];
			if (i_91_ != 0) {
				int i_92_ = 1 << 32 - i_91_;
				int i_93_ = is_90_[i_91_];
				is[i] = i_93_;
				int i_94_;
				if ((i_93_ & i_92_) != 0)
					i_94_ = is_90_[i_91_ - 1];
				else {
					i_94_ = i_93_ | i_92_;
					for (int i_95_ = i_91_ - 1; i_95_ >= 1; i_95_--) {
						int i_96_ = is_90_[i_95_];
						if (i_96_ != i_93_)
							break;
						int i_97_ = 1 << 32 - i_95_;
						if ((i_96_ & i_97_) != 0) {
							is_90_[i_95_] = is_90_[i_95_ - 1];
							break;
						}
						is_90_[i_95_] = i_96_ | i_97_;
					}
				}
				is_90_[i_91_] = i_94_;
				for (int i_98_ = i_91_ + 1; i_98_ <= 32; i_98_++) {
					int i_99_ = is_90_[i_98_];
					if (i_99_ == i_93_)
						is_90_[i_98_] = i_94_;
				}
			}
		}
		anIntArray2497 = new int[8];
		int i = 0;
		for (int i_100_ = 0; i_100_ < anInt2493; i_100_++) {
			int i_101_ = anIntArray2494[i_100_];
			if (i_101_ != 0) {
				int i_102_ = is[i_100_];
				int i_103_ = 0;
				for (int i_104_ = 0; i_104_ < i_101_; i_104_++) {
					int i_105_ = -2147483648 >>> i_104_;
					if ((i_102_ & i_105_) != 0) {
						if (anIntArray2497[i_103_] == 0)
							anIntArray2497[i_103_] = i;
						i_103_ = anIntArray2497[i_103_];
					} else
						i_103_++;
					if (i_103_ >= anIntArray2497.length) {
						int[] is_106_ = new int[anIntArray2497.length * 2];
						for (int i_107_ = 0; i_107_ < anIntArray2497.length; i_107_++)
							is_106_[i_107_] = anIntArray2497[i_107_];
						anIntArray2497 = is_106_;
					}
					i_105_ >>>= 1;
				}
				anIntArray2497[i_103_] = i_100_ ^ 0xffffffff;
				if (i_103_ >= i)
					i = i_103_ + 1;
			}
		}
	}

	void method4419() {
		int[] is = new int[anInt2493];
		int[] is_108_ = new int[33];
		for (int i = 0; i < anInt2493; i++) {
			int i_109_ = anIntArray2494[i];
			if (i_109_ != 0) {
				int i_110_ = 1 << 32 - i_109_;
				int i_111_ = is_108_[i_109_];
				is[i] = i_111_;
				int i_112_;
				if ((i_111_ & i_110_) != 0)
					i_112_ = is_108_[i_109_ - 1];
				else {
					i_112_ = i_111_ | i_110_;
					for (int i_113_ = i_109_ - 1; i_113_ >= 1; i_113_--) {
						int i_114_ = is_108_[i_113_];
						if (i_114_ != i_111_)
							break;
						int i_115_ = 1 << 32 - i_113_;
						if ((i_114_ & i_115_) != 0) {
							is_108_[i_113_] = is_108_[i_113_ - 1];
							break;
						}
						is_108_[i_113_] = i_114_ | i_115_;
					}
				}
				is_108_[i_109_] = i_112_;
				for (int i_116_ = i_109_ + 1; i_116_ <= 32; i_116_++) {
					int i_117_ = is_108_[i_116_];
					if (i_117_ == i_111_)
						is_108_[i_116_] = i_112_;
				}
			}
		}
		anIntArray2497 = new int[8];
		int i = 0;
		for (int i_118_ = 0; i_118_ < anInt2493; i_118_++) {
			int i_119_ = anIntArray2494[i_118_];
			if (i_119_ != 0) {
				int i_120_ = is[i_118_];
				int i_121_ = 0;
				for (int i_122_ = 0; i_122_ < i_119_; i_122_++) {
					int i_123_ = -2147483648 >>> i_122_;
					if ((i_120_ & i_123_) != 0) {
						if (anIntArray2497[i_121_] == 0)
							anIntArray2497[i_121_] = i;
						i_121_ = anIntArray2497[i_121_];
					} else
						i_121_++;
					if (i_121_ >= anIntArray2497.length) {
						int[] is_124_ = new int[anIntArray2497.length * 2];
						for (int i_125_ = 0; i_125_ < anIntArray2497.length; i_125_++)
							is_124_[i_125_] = anIntArray2497[i_125_];
						anIntArray2497 = is_124_;
					}
					i_123_ >>>= 1;
				}
				anIntArray2497[i_121_] = i_118_ ^ 0xffffffff;
				if (i_121_ >= i)
					i = i_121_ + 1;
			}
		}
	}

	int method4420(Class256 class256) {
		int i;
		for (i = 0; anIntArray2497[i] >= 0; i = class256.method4602() != 0 ? anIntArray2497[i] : i + 1) {
			/* empty */
		}
		return anIntArray2497[i] ^ 0xffffffff;
	}

	int method4421(Class256 class256) {
		int i;
		for (i = 0; anIntArray2497[i] >= 0; i = class256.method4602() != 0 ? anIntArray2497[i] : i + 1) {
			/* empty */
		}
		return anIntArray2497[i] ^ 0xffffffff;
	}

	int method4422(Class256 class256) {
		int i;
		for (i = 0; anIntArray2497[i] >= 0; i = class256.method4602() != 0 ? anIntArray2497[i] : i + 1) {
			/* empty */
		}
		return anIntArray2497[i] ^ 0xffffffff;
	}

	static int method4423(int i, int i_126_) {
		int i_127_;
		for (i_127_ = (int) Math.pow((double) i, 1.0 / (double) i_126_) + 1; Class291.method5234(i_127_, i_126_, 535700434) > i; i_127_--) {
			/* empty */
		}
		return i_127_;
	}

	float[] method4424(Class256 class256) {
		return aFloatArrayArray2496[method4410(class256)];
	}

	float[] method4425(Class256 class256) {
		return aFloatArrayArray2496[method4410(class256)];
	}

	float[] method4426(Class256 class256) {
		return aFloatArrayArray2496[method4410(class256)];
	}
}
