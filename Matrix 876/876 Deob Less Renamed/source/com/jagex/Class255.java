/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class255 {
	boolean[] aBoolArray2744;
	int[][] anIntArrayArray2745;
	int anInt2746;
	int[] anIntArray2747;
	int[] anIntArray2748;
	int[] anIntArray2749;
	int[][] anIntArrayArray2750;
	int[][] anIntArrayArray2751;
	static int[] anIntArray2752 = { 256, 128, 86, 64 };
	boolean[][] aBoolArrayArray2753;
	int[] anIntArray2754;
	Class256 aClass256_2755;
	int[] anIntArray2756;
	static float[] aFloatArray2757 = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

	static int method4551(int[] is, int i) {
		int i_0_ = is[i];
		int i_1_ = -1;
		int i_2_ = 2147483647;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = is[i_3_];
			if (i_4_ > i_0_ && i_4_ < i_2_) {
				i_1_ = i_3_;
				i_2_ = i_4_;
			}
		}
		return i_1_;
	}

	void method4552(Class256 class256, int i) {
		aClass256_2755 = class256;
		int i_5_ = aClass256_2755.method4608(16);
		if (i_5_ != 1)
			throw new RuntimeException();
		if (aBoolArray2744 == null || aBoolArray2744.length != i)
			aBoolArray2744 = new boolean[i];
		else {
			for (int i_6_ = 0; i_6_ < aBoolArray2744.length; i_6_++)
				aBoolArray2744[i_6_] = false;
		}
		int i_7_ = aClass256_2755.method4608(5);
		int i_8_ = 0;
		if (anIntArray2754 == null || anIntArray2754.length != i_7_)
			anIntArray2754 = new int[i_7_];
		else
			method4557(anIntArray2754);
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
			int i_10_ = aClass256_2755.method4608(4);
			anIntArray2754[i_9_] = i_10_;
			if (i_10_ >= i_8_)
				i_8_ = i_10_ + 1;
		}
		if (anIntArray2747 == null || anIntArray2747.length != i_8_)
			anIntArray2747 = new int[i_8_];
		else
			method4557(anIntArray2747);
		if (anIntArray2756 == null || anIntArray2756.length != i_8_)
			anIntArray2756 = new int[i_8_];
		else
			method4557(anIntArray2756);
		if (anIntArray2749 == null || anIntArray2749.length != i_8_)
			anIntArray2749 = new int[i_8_];
		else
			method4557(anIntArray2749);
		if (anIntArrayArray2745 == null || anIntArrayArray2745.length != i_8_)
			anIntArrayArray2745 = new int[i_8_][];
		for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
			anIntArray2747[i_11_] = aClass256_2755.method4608(3) + 1;
			int i_12_ = anIntArray2756[i_11_] = aClass256_2755.method4608(2);
			if (i_12_ != 0)
				anIntArray2749[i_11_] = aClass256_2755.method4608(8);
			i_12_ = 1 << i_12_;
			int[] is = new int[i_12_];
			anIntArrayArray2745[i_11_] = is;
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				is[i_13_] = aClass256_2755.method4608(8) - 1;
		}
		anInt2746 = aClass256_2755.method4608(2) + 1;
		int i_14_ = aClass256_2755.method4608(4);
		int i_15_ = 2;
		for (int i_16_ = 0; i_16_ < i_7_; i_16_++)
			i_15_ += anIntArray2747[anIntArray2754[i_16_]];
		if (anIntArray2748 == null || anIntArray2748.length != i_15_)
			anIntArray2748 = new int[i_15_];
		else
			method4557(anIntArray2748);
		anIntArray2748[0] = 0;
		anIntArray2748[1] = 1 << i_14_;
		i_15_ = 2;
		for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
			int i_18_ = anIntArray2754[i_17_];
			for (int i_19_ = 0; i_19_ < anIntArray2747[i_18_]; i_19_++)
				anIntArray2748[i_15_++] = aClass256_2755.method4608(i_14_);
		}
		if (anIntArrayArray2751 == null || anIntArrayArray2751.length < i_15_) {
			anIntArrayArray2751 = new int[i][i_15_];
			anIntArrayArray2750 = new int[i][i_15_];
			aBoolArrayArray2753 = new boolean[i][i_15_];
		}
	}

	void method4553(Class243 class243, int i, int i_20_) {
		if (aBoolArray2744[i_20_]) {
			int i_21_ = anIntArray2748.length;
			method4580(0, i_21_ - 1, i_20_);
			int i_22_ = 0;
			int i_23_ = anIntArrayArray2750[i_20_][0] * anInt2746;
			for (int i_24_ = 1; i_24_ < i_21_; i_24_++) {
				if (anIntArrayArray2750[i_20_][i_24_] >= 0) {
					int i_25_ = anIntArrayArray2751[i_20_][i_24_];
					int i_26_ = anIntArrayArray2750[i_20_][i_24_] * anInt2746;
					method4568(i_22_, i_23_, i_25_, i_26_, class243, i);
					if (i_25_ < i) {
						/* empty */
					}
					i_22_ = i_25_;
					i_23_ = i_26_;
				}
			}
			float f = aFloatArray2757[i_23_];
			for (int i_27_ = i_22_; i_27_ < i; i_27_++)
				class243.aFloatArray2459[i_27_] *= f;
		}
	}

	static int method4554(int[] is, int i) {
		int i_28_ = is[i];
		int i_29_ = -1;
		int i_30_ = 2147483647;
		for (int i_31_ = 0; i_31_ < i; i_31_++) {
			int i_32_ = is[i_31_];
			if (i_32_ > i_28_ && i_32_ < i_30_) {
				i_29_ = i_31_;
				i_30_ = i_32_;
			}
		}
		return i_29_;
	}

	int method4555(int i, int i_33_, int i_34_, int i_35_, int i_36_) {
		int i_37_ = i_35_ - i_33_;
		int i_38_ = i_34_ - i;
		int i_39_ = i_37_ < 0 ? -i_37_ : i_37_;
		int i_40_ = i_39_ * (i_36_ - i);
		int i_41_ = i_40_ / i_38_;
		return i_37_ < 0 ? i_33_ - i_41_ : i_33_ + i_41_;
	}

	void method4556(Class243 class243, int i, int i_42_) {
		if (aBoolArray2744[i_42_]) {
			int i_43_ = anIntArray2748.length;
			method4580(0, i_43_ - 1, i_42_);
			int i_44_ = 0;
			int i_45_ = anIntArrayArray2750[i_42_][0] * anInt2746;
			for (int i_46_ = 1; i_46_ < i_43_; i_46_++) {
				if (anIntArrayArray2750[i_42_][i_46_] >= 0) {
					int i_47_ = anIntArrayArray2751[i_42_][i_46_];
					int i_48_ = anIntArrayArray2750[i_42_][i_46_] * anInt2746;
					method4568(i_44_, i_45_, i_47_, i_48_, class243, i);
					if (i_47_ < i) {
						/* empty */
					}
					i_44_ = i_47_;
					i_45_ = i_48_;
				}
			}
			float f = aFloatArray2757[i_45_];
			for (int i_49_ = i_44_; i_49_ < i; i_49_++)
				class243.aFloatArray2459[i_49_] *= f;
		}
	}

	void method4557(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4558(Class243 class243, int i, int i_50_) {
		if (aBoolArray2744[i_50_]) {
			int i_51_ = anIntArray2748.length;
			method4580(0, i_51_ - 1, i_50_);
			int i_52_ = 0;
			int i_53_ = anIntArrayArray2750[i_50_][0] * anInt2746;
			for (int i_54_ = 1; i_54_ < i_51_; i_54_++) {
				if (anIntArrayArray2750[i_50_][i_54_] >= 0) {
					int i_55_ = anIntArrayArray2751[i_50_][i_54_];
					int i_56_ = anIntArrayArray2750[i_50_][i_54_] * anInt2746;
					method4568(i_52_, i_53_, i_55_, i_56_, class243, i);
					if (i_55_ < i) {
						/* empty */
					}
					i_52_ = i_55_;
					i_53_ = i_56_;
				}
			}
			float f = aFloatArray2757[i_53_];
			for (int i_57_ = i_52_; i_57_ < i; i_57_++)
				class243.aFloatArray2459[i_57_] *= f;
		}
	}

	void method4559(int i, int i_58_, int i_59_, int i_60_, Class243 class243, int i_61_) {
		int i_62_ = i_60_ - i_58_;
		int i_63_ = i_59_ - i;
		int i_64_ = i_62_ < 0 ? -i_62_ : i_62_;
		int i_65_ = i_62_ / i_63_;
		int i_66_ = i_58_;
		int i_67_ = 0;
		int i_68_ = i_62_ < 0 ? i_65_ - 1 : i_65_ + 1;
		i_64_ = i_64_ - (i_65_ < 0 ? -i_65_ : i_65_) * i_63_;
		class243.aFloatArray2459[i] *= aFloatArray2757[i_66_];
		if (i_59_ > i_61_)
			i_59_ = i_61_;
		for (int i_69_ = i + 1; i_69_ < i_59_; i_69_++) {
			i_67_ += i_64_;
			if (i_67_ >= i_63_) {
				i_67_ -= i_63_;
				i_66_ += i_68_;
			} else
				i_66_ += i_65_;
			class243.aFloatArray2459[i_69_] *= aFloatArray2757[i_66_];
		}
	}

	void method4560(int i) {
		if (aBoolArray2744[i]) {
			int i_70_ = anIntArray2748.length;
			int i_71_ = anIntArray2752[anInt2746 - 1];
			boolean[] bools = aBoolArrayArray2753[i];
			aBoolArrayArray2753[i][1] = true;
			bools[0] = true;
			for (int i_72_ = 2; i_72_ < i_70_; i_72_++) {
				int i_73_ = method4574(anIntArray2748, i_72_);
				int i_74_ = method4554(anIntArray2748, i_72_);
				int i_75_ = method4555(anIntArray2748[i_73_], anIntArrayArray2750[i][i_73_], anIntArray2748[i_74_], anIntArrayArray2750[i][i_74_], anIntArray2748[i_72_]);
				int i_76_ = anIntArrayArray2750[i][i_72_];
				int i_77_ = i_71_ - i_75_;
				int i_78_ = i_75_;
				int i_79_ = (i_77_ < i_78_ ? i_77_ : i_78_) << 1;
				if (i_76_ != 0) {
					boolean[] bools_80_ = aBoolArrayArray2753[i];
					int i_81_ = i_73_;
					aBoolArrayArray2753[i][i_74_] = true;
					bools_80_[i_81_] = true;
					aBoolArrayArray2753[i][i_72_] = true;
					if (i_76_ >= i_79_)
						anIntArrayArray2750[i][i_72_] = (i_77_ > i_78_ ? i_76_ - i_78_ + i_75_ : i_75_ - i_76_ + i_77_ - 1);
					else
						anIntArrayArray2750[i][i_72_] = ((i_76_ & 0x1) != 0 ? i_75_ - (i_76_ + 1 >> 1) : i_75_ + (i_76_ >> 1));
				} else {
					aBoolArrayArray2753[i][i_72_] = false;
					anIntArrayArray2750[i][i_72_] = i_75_;
				}
			}
			for (int i_82_ = 0; i_82_ < i_70_; i_82_++) {
				if (!aBoolArrayArray2753[i][i_82_])
					anIntArrayArray2750[i][i_82_] = -1;
			}
		}
	}

	void method4561(int i, int i_83_, int i_84_) {
		if (i < i_83_) {
			int i_85_ = i;
			int i_86_ = anIntArrayArray2751[i_84_][i_85_];
			int i_87_ = anIntArrayArray2750[i_84_][i_85_];
			boolean bool = aBoolArrayArray2753[i_84_][i_85_];
			for (int i_88_ = i + 1; i_88_ <= i_83_; i_88_++) {
				int i_89_ = anIntArrayArray2751[i_84_][i_88_];
				if (i_89_ < i_86_) {
					anIntArrayArray2751[i_84_][i_85_] = i_89_;
					anIntArrayArray2750[i_84_][i_85_] = anIntArrayArray2750[i_84_][i_88_];
					aBoolArrayArray2753[i_84_][i_85_] = aBoolArrayArray2753[i_84_][i_88_];
					i_85_++;
					anIntArrayArray2751[i_84_][i_88_] = anIntArrayArray2751[i_84_][i_85_];
					anIntArrayArray2750[i_84_][i_88_] = anIntArrayArray2750[i_84_][i_85_];
					aBoolArrayArray2753[i_84_][i_88_] = aBoolArrayArray2753[i_84_][i_85_];
				}
			}
			anIntArrayArray2751[i_84_][i_85_] = i_86_;
			anIntArrayArray2750[i_84_][i_85_] = i_87_;
			aBoolArrayArray2753[i_84_][i_85_] = bool;
			method4580(i, i_85_ - 1, i_84_);
			method4580(i_85_ + 1, i_83_, i_84_);
		}
	}

	boolean method4562(int i) {
		boolean bool = aClass256_2755.method4602() != 0;
		aBoolArray2744[i] = bool;
		if (!bool)
			return false;
		int i_90_ = anIntArray2748.length;
		for (int i_91_ = 0; i_91_ < i_90_; i_91_++)
			anIntArrayArray2751[i][i_91_] = anIntArray2748[i_91_];
		int i_92_ = anIntArray2752[anInt2746 - 1];
		int i_93_ = Class181.method3537(i_92_ - 1, (byte) 0);
		anIntArrayArray2750[i][0] = aClass256_2755.method4608(i_93_);
		anIntArrayArray2750[i][1] = aClass256_2755.method4608(i_93_);
		int i_94_ = 2;
		for (int i_95_ = 0; i_95_ < anIntArray2754.length; i_95_++) {
			int i_96_ = anIntArray2754[i_95_];
			int i_97_ = anIntArray2747[i_96_];
			int i_98_ = anIntArray2756[i_96_];
			int i_99_ = (1 << i_98_) - 1;
			int i_100_ = 0;
			if (i_98_ > 0)
				i_100_ = aClass256_2755.aClass249Array2774[anIntArray2749[i_96_]].method4410(aClass256_2755);
			for (int i_101_ = 0; i_101_ < i_97_; i_101_++) {
				int i_102_ = anIntArrayArray2745[i_96_][i_100_ & i_99_];
				i_100_ >>>= i_98_;
				anIntArrayArray2750[i][i_94_] = i_102_ >= 0 ? aClass256_2755.aClass249Array2774[i_102_].method4410(aClass256_2755) : 0;
				i_94_++;
			}
		}
		return true;
	}

	static int method4563(int[] is, int i) {
		int i_103_ = is[i];
		int i_104_ = -1;
		int i_105_ = 2147483647;
		for (int i_106_ = 0; i_106_ < i; i_106_++) {
			int i_107_ = is[i_106_];
			if (i_107_ > i_103_ && i_107_ < i_105_) {
				i_104_ = i_106_;
				i_105_ = i_107_;
			}
		}
		return i_104_;
	}

	static int method4564(int[] is, int i) {
		int i_108_ = is[i];
		int i_109_ = -1;
		int i_110_ = -2147483648;
		for (int i_111_ = 0; i_111_ < i; i_111_++) {
			int i_112_ = is[i_111_];
			if (i_112_ < i_108_ && i_112_ > i_110_) {
				i_109_ = i_111_;
				i_110_ = i_112_;
			}
		}
		return i_109_;
	}

	void method4565(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	int method4566(int i, int i_113_, int i_114_, int i_115_, int i_116_) {
		int i_117_ = i_115_ - i_113_;
		int i_118_ = i_114_ - i;
		int i_119_ = i_117_ < 0 ? -i_117_ : i_117_;
		int i_120_ = i_119_ * (i_116_ - i);
		int i_121_ = i_120_ / i_118_;
		return i_117_ < 0 ? i_113_ - i_121_ : i_113_ + i_121_;
	}

	int method4567(int i, int i_122_, int i_123_, int i_124_, int i_125_) {
		int i_126_ = i_124_ - i_122_;
		int i_127_ = i_123_ - i;
		int i_128_ = i_126_ < 0 ? -i_126_ : i_126_;
		int i_129_ = i_128_ * (i_125_ - i);
		int i_130_ = i_129_ / i_127_;
		return i_126_ < 0 ? i_122_ - i_130_ : i_122_ + i_130_;
	}

	void method4568(int i, int i_131_, int i_132_, int i_133_, Class243 class243, int i_134_) {
		int i_135_ = i_133_ - i_131_;
		int i_136_ = i_132_ - i;
		int i_137_ = i_135_ < 0 ? -i_135_ : i_135_;
		int i_138_ = i_135_ / i_136_;
		int i_139_ = i_131_;
		int i_140_ = 0;
		int i_141_ = i_135_ < 0 ? i_138_ - 1 : i_138_ + 1;
		i_137_ = i_137_ - (i_138_ < 0 ? -i_138_ : i_138_) * i_136_;
		class243.aFloatArray2459[i] *= aFloatArray2757[i_139_];
		if (i_132_ > i_134_)
			i_132_ = i_134_;
		for (int i_142_ = i + 1; i_142_ < i_132_; i_142_++) {
			i_140_ += i_137_;
			if (i_140_ >= i_136_) {
				i_140_ -= i_136_;
				i_139_ += i_141_;
			} else
				i_139_ += i_138_;
			class243.aFloatArray2459[i_142_] *= aFloatArray2757[i_139_];
		}
	}

	void method4569(int i, int i_143_, int i_144_, int i_145_, Class243 class243, int i_146_) {
		int i_147_ = i_145_ - i_143_;
		int i_148_ = i_144_ - i;
		int i_149_ = i_147_ < 0 ? -i_147_ : i_147_;
		int i_150_ = i_147_ / i_148_;
		int i_151_ = i_143_;
		int i_152_ = 0;
		int i_153_ = i_147_ < 0 ? i_150_ - 1 : i_150_ + 1;
		i_149_ = i_149_ - (i_150_ < 0 ? -i_150_ : i_150_) * i_148_;
		class243.aFloatArray2459[i] *= aFloatArray2757[i_151_];
		if (i_144_ > i_146_)
			i_144_ = i_146_;
		for (int i_154_ = i + 1; i_154_ < i_144_; i_154_++) {
			i_152_ += i_149_;
			if (i_152_ >= i_148_) {
				i_152_ -= i_148_;
				i_151_ += i_153_;
			} else
				i_151_ += i_150_;
			class243.aFloatArray2459[i_154_] *= aFloatArray2757[i_151_];
		}
	}

	void method4570(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4571(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class255() {
		/* empty */
	}

	void method4572(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4573(Class243 class243, int i, int i_155_) {
		if (aBoolArray2744[i_155_]) {
			int i_156_ = anIntArray2748.length;
			method4580(0, i_156_ - 1, i_155_);
			int i_157_ = 0;
			int i_158_ = anIntArrayArray2750[i_155_][0] * anInt2746;
			for (int i_159_ = 1; i_159_ < i_156_; i_159_++) {
				if (anIntArrayArray2750[i_155_][i_159_] >= 0) {
					int i_160_ = anIntArrayArray2751[i_155_][i_159_];
					int i_161_ = anIntArrayArray2750[i_155_][i_159_] * anInt2746;
					method4568(i_157_, i_158_, i_160_, i_161_, class243, i);
					if (i_160_ < i) {
						/* empty */
					}
					i_157_ = i_160_;
					i_158_ = i_161_;
				}
			}
			float f = aFloatArray2757[i_158_];
			for (int i_162_ = i_157_; i_162_ < i; i_162_++)
				class243.aFloatArray2459[i_162_] *= f;
		}
	}

	static int method4574(int[] is, int i) {
		int i_163_ = is[i];
		int i_164_ = -1;
		int i_165_ = -2147483648;
		for (int i_166_ = 0; i_166_ < i; i_166_++) {
			int i_167_ = is[i_166_];
			if (i_167_ < i_163_ && i_167_ > i_165_) {
				i_164_ = i_166_;
				i_165_ = i_167_;
			}
		}
		return i_164_;
	}

	void method4575(int i) {
		if (aBoolArray2744[i]) {
			int i_168_ = anIntArray2748.length;
			int i_169_ = anIntArray2752[anInt2746 - 1];
			boolean[] bools = aBoolArrayArray2753[i];
			aBoolArrayArray2753[i][1] = true;
			bools[0] = true;
			for (int i_170_ = 2; i_170_ < i_168_; i_170_++) {
				int i_171_ = method4574(anIntArray2748, i_170_);
				int i_172_ = method4554(anIntArray2748, i_170_);
				int i_173_ = method4555(anIntArray2748[i_171_], anIntArrayArray2750[i][i_171_], anIntArray2748[i_172_], anIntArrayArray2750[i][i_172_], anIntArray2748[i_170_]);
				int i_174_ = anIntArrayArray2750[i][i_170_];
				int i_175_ = i_169_ - i_173_;
				int i_176_ = i_173_;
				int i_177_ = (i_175_ < i_176_ ? i_175_ : i_176_) << 1;
				if (i_174_ != 0) {
					boolean[] bools_178_ = aBoolArrayArray2753[i];
					int i_179_ = i_171_;
					aBoolArrayArray2753[i][i_172_] = true;
					bools_178_[i_179_] = true;
					aBoolArrayArray2753[i][i_170_] = true;
					if (i_174_ >= i_177_)
						anIntArrayArray2750[i][i_170_] = (i_175_ > i_176_ ? i_174_ - i_176_ + i_173_ : i_173_ - i_174_ + i_175_ - 1);
					else
						anIntArrayArray2750[i][i_170_] = ((i_174_ & 0x1) != 0 ? i_173_ - (i_174_ + 1 >> 1) : i_173_ + (i_174_ >> 1));
				} else {
					aBoolArrayArray2753[i][i_170_] = false;
					anIntArrayArray2750[i][i_170_] = i_173_;
				}
			}
			for (int i_180_ = 0; i_180_ < i_168_; i_180_++) {
				if (!aBoolArrayArray2753[i][i_180_])
					anIntArrayArray2750[i][i_180_] = -1;
			}
		}
	}

	void method4576(int i) {
		if (aBoolArray2744[i]) {
			int i_181_ = anIntArray2748.length;
			int i_182_ = anIntArray2752[anInt2746 - 1];
			boolean[] bools = aBoolArrayArray2753[i];
			aBoolArrayArray2753[i][1] = true;
			bools[0] = true;
			for (int i_183_ = 2; i_183_ < i_181_; i_183_++) {
				int i_184_ = method4574(anIntArray2748, i_183_);
				int i_185_ = method4554(anIntArray2748, i_183_);
				int i_186_ = method4555(anIntArray2748[i_184_], anIntArrayArray2750[i][i_184_], anIntArray2748[i_185_], anIntArrayArray2750[i][i_185_], anIntArray2748[i_183_]);
				int i_187_ = anIntArrayArray2750[i][i_183_];
				int i_188_ = i_182_ - i_186_;
				int i_189_ = i_186_;
				int i_190_ = (i_188_ < i_189_ ? i_188_ : i_189_) << 1;
				if (i_187_ != 0) {
					boolean[] bools_191_ = aBoolArrayArray2753[i];
					int i_192_ = i_184_;
					aBoolArrayArray2753[i][i_185_] = true;
					bools_191_[i_192_] = true;
					aBoolArrayArray2753[i][i_183_] = true;
					if (i_187_ >= i_190_)
						anIntArrayArray2750[i][i_183_] = (i_188_ > i_189_ ? i_187_ - i_189_ + i_186_ : i_186_ - i_187_ + i_188_ - 1);
					else
						anIntArrayArray2750[i][i_183_] = ((i_187_ & 0x1) != 0 ? i_186_ - (i_187_ + 1 >> 1) : i_186_ + (i_187_ >> 1));
				} else {
					aBoolArrayArray2753[i][i_183_] = false;
					anIntArrayArray2750[i][i_183_] = i_186_;
				}
			}
			for (int i_193_ = 0; i_193_ < i_181_; i_193_++) {
				if (!aBoolArrayArray2753[i][i_193_])
					anIntArrayArray2750[i][i_193_] = -1;
			}
		}
	}

	void method4577(int i) {
		if (aBoolArray2744[i]) {
			int i_194_ = anIntArray2748.length;
			int i_195_ = anIntArray2752[anInt2746 - 1];
			boolean[] bools = aBoolArrayArray2753[i];
			aBoolArrayArray2753[i][1] = true;
			bools[0] = true;
			for (int i_196_ = 2; i_196_ < i_194_; i_196_++) {
				int i_197_ = method4574(anIntArray2748, i_196_);
				int i_198_ = method4554(anIntArray2748, i_196_);
				int i_199_ = method4555(anIntArray2748[i_197_], anIntArrayArray2750[i][i_197_], anIntArray2748[i_198_], anIntArrayArray2750[i][i_198_], anIntArray2748[i_196_]);
				int i_200_ = anIntArrayArray2750[i][i_196_];
				int i_201_ = i_195_ - i_199_;
				int i_202_ = i_199_;
				int i_203_ = (i_201_ < i_202_ ? i_201_ : i_202_) << 1;
				if (i_200_ != 0) {
					boolean[] bools_204_ = aBoolArrayArray2753[i];
					int i_205_ = i_197_;
					aBoolArrayArray2753[i][i_198_] = true;
					bools_204_[i_205_] = true;
					aBoolArrayArray2753[i][i_196_] = true;
					if (i_200_ >= i_203_)
						anIntArrayArray2750[i][i_196_] = (i_201_ > i_202_ ? i_200_ - i_202_ + i_199_ : i_199_ - i_200_ + i_201_ - 1);
					else
						anIntArrayArray2750[i][i_196_] = ((i_200_ & 0x1) != 0 ? i_199_ - (i_200_ + 1 >> 1) : i_199_ + (i_200_ >> 1));
				} else {
					aBoolArrayArray2753[i][i_196_] = false;
					anIntArrayArray2750[i][i_196_] = i_199_;
				}
			}
			for (int i_206_ = 0; i_206_ < i_194_; i_206_++) {
				if (!aBoolArrayArray2753[i][i_206_])
					anIntArrayArray2750[i][i_206_] = -1;
			}
		}
	}

	void method4578(Class243 class243, int i, int i_207_) {
		if (aBoolArray2744[i_207_]) {
			int i_208_ = anIntArray2748.length;
			method4580(0, i_208_ - 1, i_207_);
			int i_209_ = 0;
			int i_210_ = anIntArrayArray2750[i_207_][0] * anInt2746;
			for (int i_211_ = 1; i_211_ < i_208_; i_211_++) {
				if (anIntArrayArray2750[i_207_][i_211_] >= 0) {
					int i_212_ = anIntArrayArray2751[i_207_][i_211_];
					int i_213_ = anIntArrayArray2750[i_207_][i_211_] * anInt2746;
					method4568(i_209_, i_210_, i_212_, i_213_, class243, i);
					if (i_212_ < i) {
						/* empty */
					}
					i_209_ = i_212_;
					i_210_ = i_213_;
				}
			}
			float f = aFloatArray2757[i_210_];
			for (int i_214_ = i_209_; i_214_ < i; i_214_++)
				class243.aFloatArray2459[i_214_] *= f;
		}
	}

	void method4579(Class243 class243, int i, int i_215_) {
		if (aBoolArray2744[i_215_]) {
			int i_216_ = anIntArray2748.length;
			method4580(0, i_216_ - 1, i_215_);
			int i_217_ = 0;
			int i_218_ = anIntArrayArray2750[i_215_][0] * anInt2746;
			for (int i_219_ = 1; i_219_ < i_216_; i_219_++) {
				if (anIntArrayArray2750[i_215_][i_219_] >= 0) {
					int i_220_ = anIntArrayArray2751[i_215_][i_219_];
					int i_221_ = anIntArrayArray2750[i_215_][i_219_] * anInt2746;
					method4568(i_217_, i_218_, i_220_, i_221_, class243, i);
					if (i_220_ < i) {
						/* empty */
					}
					i_217_ = i_220_;
					i_218_ = i_221_;
				}
			}
			float f = aFloatArray2757[i_218_];
			for (int i_222_ = i_217_; i_222_ < i; i_222_++)
				class243.aFloatArray2459[i_222_] *= f;
		}
	}

	void method4580(int i, int i_223_, int i_224_) {
		if (i < i_223_) {
			int i_225_ = i;
			int i_226_ = anIntArrayArray2751[i_224_][i_225_];
			int i_227_ = anIntArrayArray2750[i_224_][i_225_];
			boolean bool = aBoolArrayArray2753[i_224_][i_225_];
			for (int i_228_ = i + 1; i_228_ <= i_223_; i_228_++) {
				int i_229_ = anIntArrayArray2751[i_224_][i_228_];
				if (i_229_ < i_226_) {
					anIntArrayArray2751[i_224_][i_225_] = i_229_;
					anIntArrayArray2750[i_224_][i_225_] = anIntArrayArray2750[i_224_][i_228_];
					aBoolArrayArray2753[i_224_][i_225_] = aBoolArrayArray2753[i_224_][i_228_];
					i_225_++;
					anIntArrayArray2751[i_224_][i_228_] = anIntArrayArray2751[i_224_][i_225_];
					anIntArrayArray2750[i_224_][i_228_] = anIntArrayArray2750[i_224_][i_225_];
					aBoolArrayArray2753[i_224_][i_228_] = aBoolArrayArray2753[i_224_][i_225_];
				}
			}
			anIntArrayArray2751[i_224_][i_225_] = i_226_;
			anIntArrayArray2750[i_224_][i_225_] = i_227_;
			aBoolArrayArray2753[i_224_][i_225_] = bool;
			method4580(i, i_225_ - 1, i_224_);
			method4580(i_225_ + 1, i_223_, i_224_);
		}
	}

	int method4581(int i, int i_230_, int i_231_, int i_232_, int i_233_) {
		int i_234_ = i_232_ - i_230_;
		int i_235_ = i_231_ - i;
		int i_236_ = i_234_ < 0 ? -i_234_ : i_234_;
		int i_237_ = i_236_ * (i_233_ - i);
		int i_238_ = i_237_ / i_235_;
		return i_234_ < 0 ? i_230_ - i_238_ : i_230_ + i_238_;
	}

	void method4582(Class243 class243, int i, int i_239_) {
		if (aBoolArray2744[i_239_]) {
			int i_240_ = anIntArray2748.length;
			method4580(0, i_240_ - 1, i_239_);
			int i_241_ = 0;
			int i_242_ = anIntArrayArray2750[i_239_][0] * anInt2746;
			for (int i_243_ = 1; i_243_ < i_240_; i_243_++) {
				if (anIntArrayArray2750[i_239_][i_243_] >= 0) {
					int i_244_ = anIntArrayArray2751[i_239_][i_243_];
					int i_245_ = anIntArrayArray2750[i_239_][i_243_] * anInt2746;
					method4568(i_241_, i_242_, i_244_, i_245_, class243, i);
					if (i_244_ < i) {
						/* empty */
					}
					i_241_ = i_244_;
					i_242_ = i_245_;
				}
			}
			float f = aFloatArray2757[i_242_];
			for (int i_246_ = i_241_; i_246_ < i; i_246_++)
				class243.aFloatArray2459[i_246_] *= f;
		}
	}

	boolean method4583(int i) {
		boolean bool = aClass256_2755.method4602() != 0;
		aBoolArray2744[i] = bool;
		if (!bool)
			return false;
		int i_247_ = anIntArray2748.length;
		for (int i_248_ = 0; i_248_ < i_247_; i_248_++)
			anIntArrayArray2751[i][i_248_] = anIntArray2748[i_248_];
		int i_249_ = anIntArray2752[anInt2746 - 1];
		int i_250_ = Class181.method3537(i_249_ - 1, (byte) 0);
		anIntArrayArray2750[i][0] = aClass256_2755.method4608(i_250_);
		anIntArrayArray2750[i][1] = aClass256_2755.method4608(i_250_);
		int i_251_ = 2;
		for (int i_252_ = 0; i_252_ < anIntArray2754.length; i_252_++) {
			int i_253_ = anIntArray2754[i_252_];
			int i_254_ = anIntArray2747[i_253_];
			int i_255_ = anIntArray2756[i_253_];
			int i_256_ = (1 << i_255_) - 1;
			int i_257_ = 0;
			if (i_255_ > 0)
				i_257_ = aClass256_2755.aClass249Array2774[anIntArray2749[i_253_]].method4410(aClass256_2755);
			for (int i_258_ = 0; i_258_ < i_254_; i_258_++) {
				int i_259_ = anIntArrayArray2745[i_253_][i_257_ & i_256_];
				i_257_ >>>= i_255_;
				anIntArrayArray2750[i][i_251_] = i_259_ >= 0 ? aClass256_2755.aClass249Array2774[i_259_].method4410(aClass256_2755) : 0;
				i_251_++;
			}
		}
		return true;
	}
}
