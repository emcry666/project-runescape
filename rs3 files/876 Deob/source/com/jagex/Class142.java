/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class142 {
	public int anInt1680;
	public int anInt1681;
	public int anInt1682;
	public int anInt1683;
	public int[][] anIntArrayArray1684;
	public static Class472 aClass472_1685;

	public abstract void method2319(int i, int i_0_, int i_1_);

	public abstract void method2320(int i, int i_2_, int i_3_);

	public final int method2321(int i, int i_4_, int i_5_) {
		return anIntArrayArray1684[i][i_4_];
	}

	public abstract void method2322(int i, int i_6_, int i_7_, boolean[][] bools, boolean bool, int i_8_);

	public abstract void method2323(int i, int i_9_, int[] is, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, Class163 class163, boolean bool);

	public abstract void method2324(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_20_, int i_21_, int i_22_, boolean bool);

	public abstract void method2325(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, boolean[][] bools);

	public final int method2326(int i, int i_29_, int i_30_) {
		int i_31_ = i >> -1193058675 * anInt1680;
		int i_32_ = i_29_ >> -1193058675 * anInt1680;
		if (i_31_ < 0 || i_32_ < 0 || i_31_ > anInt1683 * 692304099 - 1 || i_32_ > anInt1681 * 452998539 - 1)
			return 0;
		int i_33_ = i & 341909049 * anInt1682 - 1;
		int i_34_ = i_29_ & 341909049 * anInt1682 - 1;
		int i_35_ = ((anIntArrayArray1684[1 + i_31_][i_32_] * i_33_ + anIntArrayArray1684[i_31_][i_32_] * (341909049 * anInt1682 - i_33_)) >> -1193058675 * anInt1680);
		int i_36_ = ((anIntArrayArray1684[i_31_][1 + i_32_] * (341909049 * anInt1682 - i_33_) + anIntArrayArray1684[i_31_ + 1][1 + i_32_] * i_33_) >> -1193058675 * anInt1680);
		return (i_34_ * i_36_ + i_35_ * (anInt1682 * 341909049 - i_34_) >> anInt1680 * -1193058675);
	}

	public final int method2327(int i, int i_37_, int i_38_) {
		int i_39_ = i >> anInt1680 * -1193058675;
		int i_40_ = i_37_ >> anInt1680 * -1193058675;
		i_39_ = Math.min(anInt1683 * 692304099 - 1, Math.max(0, i_39_));
		i_40_ = Math.min(452998539 * anInt1681 - 1, Math.max(0, i_40_));
		int i_41_ = Math.min(692304099 * anInt1683 - 1, 1 + i_39_);
		int i_42_ = Math.min(452998539 * anInt1681 - 1, i_40_ + 1);
		int i_43_ = i & 341909049 * anInt1682 - 1;
		int i_44_ = i_37_ & anInt1682 * 341909049 - 1;
		int i_45_ = ((i_43_ * anIntArrayArray1684[i_41_][i_40_] + ((341909049 * anInt1682 - i_43_) * anIntArrayArray1684[i_39_][i_40_])) >> -1193058675 * anInt1680);
		int i_46_ = ((i_43_ * anIntArrayArray1684[i_41_][i_42_] + ((341909049 * anInt1682 - i_43_) * anIntArrayArray1684[i_39_][i_42_])) >> -1193058675 * anInt1680);
		return (i_44_ * i_46_ + i_45_ * (anInt1682 * 341909049 - i_44_) >> anInt1680 * -1193058675);
	}

	public abstract void method2328(int i, int i_47_, int[] is, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int[] is_52_, int[] is_53_, int[] is_54_, Class163 class163, boolean bool);

	public final int method2329(int i, int i_55_, int i_56_) {
		return (anIntArrayArray1684[Math.min(anInt1683 * 692304099 - 1, Math.max(0, i))][Math.min(anInt1681 * 452998539 - 1, Math.max(0, i_55_))]);
	}

	public abstract Class523_Sub27_Sub4 method2330(int i, int i_57_, Class523_Sub27_Sub4 class523_sub27_sub4);

	public abstract void method2331(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_58_, int i_59_, int i_60_, boolean bool);

	public abstract void method2332(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_61_, int i_62_, int i_63_, boolean bool);

	public abstract boolean method2333(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_64_, int i_65_, int i_66_, boolean bool);

	public abstract void method2334(Class523_Sub20 class523_sub20, int[] is);

	public final int method2335(int i, int i_67_) {
		int i_68_ = i >> anInt1680 * -1193058675;
		int i_69_ = i_67_ >> anInt1680 * -1193058675;
		i_68_ = Math.min(anInt1683 * 692304099 - 1, Math.max(0, i_68_));
		i_69_ = Math.min(452998539 * anInt1681 - 1, Math.max(0, i_69_));
		int i_70_ = Math.min(692304099 * anInt1683 - 1, 1 + i_68_);
		int i_71_ = Math.min(452998539 * anInt1681 - 1, i_69_ + 1);
		int i_72_ = i & 341909049 * anInt1682 - 1;
		int i_73_ = i_67_ & anInt1682 * 341909049 - 1;
		int i_74_ = ((i_72_ * anIntArrayArray1684[i_70_][i_69_] + ((341909049 * anInt1682 - i_72_) * anIntArrayArray1684[i_68_][i_69_])) >> -1193058675 * anInt1680);
		int i_75_ = ((i_72_ * anIntArrayArray1684[i_70_][i_71_] + ((341909049 * anInt1682 - i_72_) * anIntArrayArray1684[i_68_][i_71_])) >> -1193058675 * anInt1680);
		return (i_73_ * i_75_ + i_74_ * (anInt1682 * 341909049 - i_73_) >> anInt1680 * -1193058675);
	}

	public abstract void method2336(int i, int i_76_, int i_77_);

	public abstract void method2337(int i, int i_78_, int[] is, int[] is_79_, int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, int[] is_88_, Class163 class163, boolean bool);

	public abstract void method2338(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, boolean[][] bools);

	public abstract void method2339(int i, int i_95_, int[] is, int[] is_96_, int[] is_97_, int[] is_98_, int[] is_99_, int[] is_100_, int[] is_101_, int[] is_102_, Class163 class163, boolean bool);

	public abstract void method2340();

	public abstract boolean method2341(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_103_, int i_104_, int i_105_, boolean bool);

	public abstract void method2342(int i, int i_106_, int i_107_, boolean[][] bools, boolean bool, int i_108_);

	public abstract void method2343(int i, int i_109_, int i_110_, boolean[][] bools, boolean bool, int i_111_);

	public final int method2344(int i, int i_112_) {
		return (anIntArrayArray1684[Math.min(anInt1683 * 692304099 - 1, Math.max(0, i))][Math.min(anInt1681 * 452998539 - 1, Math.max(0, i_112_))]);
	}

	public abstract void method2345(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, boolean[][] bools);

	public abstract Class523_Sub27_Sub4 method2346(int i, int i_119_, Class523_Sub27_Sub4 class523_sub27_sub4);

	public abstract void method2347();

	public abstract Class523_Sub27_Sub4 method2348(int i, int i_120_, Class523_Sub27_Sub4 class523_sub27_sub4);

	public abstract Class523_Sub27_Sub4 method2349(int i, int i_121_, Class523_Sub27_Sub4 class523_sub27_sub4);

	public abstract Class523_Sub27_Sub4 method2350(int i, int i_122_, Class523_Sub27_Sub4 class523_sub27_sub4);

	public abstract void method2351(int i, int i_123_, int[] is, int[] is_124_, int[] is_125_, int[] is_126_, int[] is_127_, int[] is_128_, int[] is_129_, int[] is_130_, Class163 class163, boolean bool);

	public abstract boolean method2352(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_131_, int i_132_, int i_133_, boolean bool);

	Class142(int i, int i_134_, int i_135_, int[][] is) {
		anInt1683 = i * 1665354955;
		anInt1681 = i_134_ * -11810269;
		int i_136_ = 0;
		for (/**/; i_135_ > 1; i_135_ >>= 1)
			i_136_++;
		anInt1682 = -700092407 * (1 << i_136_);
		anInt1680 = -1278831547 * i_136_;
		anIntArrayArray1684 = is;
	}

	public abstract void method2353(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_137_, int i_138_, int i_139_, boolean bool);

	public abstract void method2354(Class523_Sub20 class523_sub20, int[] is);

	public final int method2355(int i, int i_140_) {
		int i_141_ = i >> -1193058675 * anInt1680;
		int i_142_ = i_140_ >> -1193058675 * anInt1680;
		if (i_141_ < 0 || i_142_ < 0 || i_141_ > anInt1683 * 692304099 - 1 || i_142_ > anInt1681 * 452998539 - 1)
			return 0;
		int i_143_ = i & 341909049 * anInt1682 - 1;
		int i_144_ = i_140_ & 341909049 * anInt1682 - 1;
		int i_145_ = ((anIntArrayArray1684[1 + i_141_][i_142_] * i_143_ + anIntArrayArray1684[i_141_][i_142_] * (341909049 * anInt1682 - i_143_)) >> -1193058675 * anInt1680);
		int i_146_ = (((anIntArrayArray1684[i_141_][1 + i_142_] * (341909049 * anInt1682 - i_143_)) + anIntArrayArray1684[i_141_ + 1][1 + i_142_] * i_143_) >> -1193058675 * anInt1680);
		return (i_144_ * i_146_ + i_145_ * (anInt1682 * 341909049 - i_144_) >> anInt1680 * -1193058675);
	}

	public final int method2356(int i, int i_147_) {
		int i_148_ = i >> -1193058675 * anInt1680;
		int i_149_ = i_147_ >> -1193058675 * anInt1680;
		if (i_148_ < 0 || i_149_ < 0 || i_148_ > anInt1683 * 692304099 - 1 || i_149_ > anInt1681 * 452998539 - 1)
			return 0;
		int i_150_ = i & 341909049 * anInt1682 - 1;
		int i_151_ = i_147_ & 341909049 * anInt1682 - 1;
		int i_152_ = ((anIntArrayArray1684[1 + i_148_][i_149_] * i_150_ + anIntArrayArray1684[i_148_][i_149_] * (341909049 * anInt1682 - i_150_)) >> -1193058675 * anInt1680);
		int i_153_ = (((anIntArrayArray1684[i_148_][1 + i_149_] * (341909049 * anInt1682 - i_150_)) + anIntArrayArray1684[i_148_ + 1][1 + i_149_] * i_150_) >> -1193058675 * anInt1680);
		return (i_151_ * i_153_ + i_152_ * (anInt1682 * 341909049 - i_151_) >> anInt1680 * -1193058675);
	}

	public abstract void method2357(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_154_, int i_155_, int i_156_, boolean bool);

	public final int method2358(int i, int i_157_) {
		return anIntArrayArray1684[i][i_157_];
	}

	public abstract void method2359();

	public final int method2360(int i, int i_158_) {
		return (anIntArrayArray1684[Math.min(anInt1683 * 692304099 - 1, Math.max(0, i))][Math.min(anInt1681 * 452998539 - 1, Math.max(0, i_158_))]);
	}

	static final void method2361(Class669 class669, byte i) {
		int i_159_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_159_, -1603551525);
		Class242 class242 = Class31.aClass242Array302[i_159_ >> 16];
		Class290.method5217(class250, class242, class669, 986058503);
	}
}
