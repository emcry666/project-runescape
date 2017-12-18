/* Class175_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175_Sub1 extends Class175 {
	boolean aBool9132 = false;
	int anInt9133;
	int anInt9134;
	int anInt9135;
	int anInt9136;
	int anInt9137;
	int anInt9138;
	int[] anIntArray9139;

	public boolean method2962() {
		return aBool9132;
	}

	public boolean method2942() {
		return false;
	}

	public boolean method2943() {
		return aBool9132;
	}

	public int method2944() {
		return anInt9135;
	}

	public void method2965(int i, int i_0_, int i_1_) {
		for (int i_2_ = 1; i_2_ < anIntArray9139.length; i_2_++) {
			int i_3_ = anIntArray9139[i_2_] >> 16 & 0xff;
			i_3_ += i;
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ > 255)
				i_3_ = 255;
			int i_4_ = anIntArray9139[i_2_] >> 8 & 0xff;
			i_4_ += i_0_;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 255)
				i_4_ = 255;
			int i_5_ = anIntArray9139[i_2_] >> 0 & 0xff;
			i_5_ += i_1_;
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ > 255)
				i_5_ = 255;
			anIntArray9139[i_2_] = (anIntArray9139[i_2_] & ~0xffffff | i_3_ << 16 | i_4_ << 8 | i_5_);
		}
	}

	public int method2987() {
		return anInt9133;
	}

	public int method2968() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public int method2946() {
		return anInt9134;
	}

	public int method2984() {
		return anInt9138;
	}

	public int method2948() {
		return anInt9136;
	}

	public void method2973() {
		int[] is = anIntArray9139;
		for (int i = (anInt9133 >> 1) - 1; i >= 0; i--) {
			int i_6_ = i * anInt9135;
			int i_7_ = (anInt9133 - i - 1) * anInt9135;
			for (int i_8_ = -anInt9135; i_8_ < 0; i_8_++) {
				int i_9_ = is[i_6_];
				is[i_6_] = is[i_7_];
				is[i_7_] = i_9_;
				i_6_++;
				i_7_++;
			}
		}
		int i = anInt9136;
		anInt9136 = anInt9137;
		anInt9137 = i;
	}

	public void method2950() {
		anInt9137 = 0;
		anInt9136 = 0;
		anInt9138 = 0;
		anInt9134 = 0;
	}

	public void method2953(int i) {
		int i_10_ = method2951();
		int i_11_ = method2968();
		if (anInt9135 != i_10_ || anInt9133 != i_11_) {
			int i_12_ = i;
			if (i_12_ > anInt9134)
				i_12_ = anInt9134;
			int i_13_ = i;
			if (i_13_ + anInt9134 + anInt9135 > i_10_)
				i_13_ = i_10_ - anInt9134 - anInt9135;
			int i_14_ = i;
			if (i_14_ > anInt9136)
				i_14_ = anInt9136;
			int i_15_ = i;
			if (i_15_ + anInt9136 + anInt9133 > i_11_)
				i_15_ = i_11_ - anInt9136 - anInt9133;
			int i_16_ = anInt9135 + i_12_ + i_13_;
			int i_17_ = anInt9133 + i_14_ + i_15_;
			int[] is = new int[i_16_ * i_17_];
			aBool9132 = false;
			for (int i_18_ = 0; i_18_ < anInt9133; i_18_++) {
				int i_19_ = i_18_ * anInt9135;
				int i_20_ = (i_18_ + i_14_) * i_16_ + i_12_;
				for (int i_21_ = 0; i_21_ < anInt9135; i_21_++) {
					if ((anIntArray9139[i_19_] & ~0xffffff) != -16777216)
						aBool9132 = true;
					is[i_20_++] = anIntArray9139[i_19_++];
				}
			}
			anInt9134 -= i_12_;
			anInt9136 -= i_14_;
			anInt9138 -= i_13_;
			anInt9137 -= i_15_;
			anInt9135 = i_16_;
			anInt9133 = i_17_;
			anIntArray9139 = is;
		}
	}

	public void method2954(int i) {
		int i_22_ = 0;
		aBool9132 = false;
		int[] is = new int[anInt9135 * anInt9133];
		for (int i_23_ = 0; i_23_ < anInt9133; i_23_++) {
			for (int i_24_ = 0; i_24_ < anInt9135; i_24_++) {
				int i_25_ = anIntArray9139[i_22_];
				if ((i_25_ & ~0xffffff) == 0) {
					if (i_24_ > 0 && (anIntArray9139[i_22_ - 1] & ~0xffffff) != 0)
						i_25_ = i;
					else if (i_23_ > 0 && (anIntArray9139[i_22_ - anInt9135] & ~0xffffff) != 0)
						i_25_ = i;
					else if (i_24_ < anInt9135 - 1 && (anIntArray9139[i_22_ + 1] & ~0xffffff) != 0)
						i_25_ = i;
					else if (i_23_ < anInt9133 - 1 && (anIntArray9139[i_22_ + anInt9135] & ~0xffffff) != 0)
						i_25_ = i;
				}
				if ((i_25_ & ~0xffffff) != -16777216)
					aBool9132 = true;
				is[i_22_++] = i_25_;
			}
		}
		anIntArray9139 = is;
	}

	public void method2967(int i) {
		for (int i_26_ = anInt9133 - 1; i_26_ > 0; i_26_--) {
			int i_27_ = i_26_ * anInt9135;
			for (int i_28_ = anInt9135 - 1; i_28_ > 0; i_28_--) {
				if ((anIntArray9139[i_28_ + i_27_] & ~0xffffff) == 0 && (anIntArray9139[i_28_ + i_27_ - 1 - anInt9135] & ~0xffffff) != 0)
					anIntArray9139[i_28_ + i_27_] = i;
			}
		}
	}

	public void method2956() {
		int[] is = anIntArray9139;
		for (int i = anInt9133 - 1; i >= 0; i--) {
			int i_29_ = i * anInt9135;
			for (int i_30_ = (i + 1) * anInt9135; i_29_ < i_30_; i_29_++) {
				i_30_--;
				int i_31_ = is[i_29_];
				is[i_29_] = is[i_30_];
				is[i_30_] = i_31_;
			}
		}
		int i = anInt9134;
		anInt9134 = anInt9138;
		anInt9138 = i;
	}

	Class175_Sub1(int i, int i_32_, int[] is) {
		anInt9135 = i;
		anInt9133 = i_32_;
		anIntArray9139 = is;
		for (int i_33_ = 0; i_33_ < anIntArray9139.length; i_33_++) {
			if ((anIntArray9139[i_33_] & ~0xffffff) != -16777216) {
				aBool9132 = true;
				break;
			}
		}
	}

	public void method2958() {
		int[] is = new int[anInt9135 * anInt9133];
		int i = 0;
		for (int i_34_ = 0; i_34_ < anInt9135; i_34_++) {
			for (int i_35_ = anInt9133 - 1; i_35_ >= 0; i_35_--)
				is[i++] = anIntArray9139[i_34_ + i_35_ * anInt9135];
		}
		anIntArray9139 = is;
		int i_36_ = anInt9136;
		anInt9136 = anInt9134;
		anInt9134 = anInt9137;
		anInt9137 = anInt9138;
		anInt9138 = i_36_;
		i_36_ = anInt9133;
		anInt9133 = anInt9135;
		anInt9135 = i_36_;
	}

	public int method3005() {
		return anInt9135 + anInt9134 + anInt9138;
	}

	public int method2945() {
		return anInt9133;
	}

	public int method2961(int i, int i_37_) {
		return anIntArray9139[i + i_37_ * anInt9135];
	}

	public int method2955() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public boolean method2963() {
		return aBool9132;
	}

	public int method2964() {
		return anInt9135;
	}

	public int method2972() {
		return anInt9134;
	}

	public void method2981() {
		anInt9137 = 0;
		anInt9136 = 0;
		anInt9138 = 0;
		anInt9134 = 0;
	}

	public int method2957(int i, int i_38_) {
		return anIntArray9139[i + i_38_ * anInt9135];
	}

	public int method2947() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public int method2969() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public int method2970() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public int method2991() {
		return anInt9137;
	}

	public int method2971() {
		return anInt9134;
	}

	public void method2998() {
		int[] is = anIntArray9139;
		for (int i = (anInt9133 >> 1) - 1; i >= 0; i--) {
			int i_39_ = i * anInt9135;
			int i_40_ = (anInt9133 - i - 1) * anInt9135;
			for (int i_41_ = -anInt9135; i_41_ < 0; i_41_++) {
				int i_42_ = is[i_39_];
				is[i_39_] = is[i_40_];
				is[i_40_] = i_42_;
				i_39_++;
				i_40_++;
			}
		}
		int i = anInt9136;
		anInt9136 = anInt9137;
		anInt9137 = i;
	}

	public int method2986() {
		return anInt9134;
	}

	public int method2974() {
		return anInt9138;
	}

	public void method2988() {
		int[] is = anIntArray9139;
		for (int i = anInt9133 - 1; i >= 0; i--) {
			int i_43_ = i * anInt9135;
			for (int i_44_ = (i + 1) * anInt9135; i_43_ < i_44_; i_43_++) {
				i_44_--;
				int i_45_ = is[i_43_];
				is[i_43_] = is[i_44_];
				is[i_44_] = i_45_;
			}
		}
		int i = anInt9134;
		anInt9134 = anInt9138;
		anInt9138 = i;
	}

	public void method2941() {
		int[] is = anIntArray9139;
		for (int i = (anInt9133 >> 1) - 1; i >= 0; i--) {
			int i_46_ = i * anInt9135;
			int i_47_ = (anInt9133 - i - 1) * anInt9135;
			for (int i_48_ = -anInt9135; i_48_ < 0; i_48_++) {
				int i_49_ = is[i_46_];
				is[i_46_] = is[i_47_];
				is[i_47_] = i_49_;
				i_46_++;
				i_47_++;
			}
		}
		int i = anInt9136;
		anInt9136 = anInt9137;
		anInt9137 = i;
	}

	public int method2977() {
		return anInt9136;
	}

	public void method2997() {
		int[] is = anIntArray9139;
		for (int i = anInt9133 - 1; i >= 0; i--) {
			int i_50_ = i * anInt9135;
			for (int i_51_ = (i + 1) * anInt9135; i_50_ < i_51_; i_50_++) {
				i_51_--;
				int i_52_ = is[i_50_];
				is[i_50_] = is[i_51_];
				is[i_51_] = i_52_;
			}
		}
		int i = anInt9134;
		anInt9134 = anInt9138;
		anInt9138 = i;
	}

	public int method2979() {
		return anInt9137;
	}

	public int method2982() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public int[] method2959(boolean bool) {
		if (bool && (method2951() != anInt9135 || method2968() != anInt9133)) {
			int i = method2951();
			int[] is = new int[i * method2968()];
			for (int i_53_ = 0; i_53_ < anInt9133; i_53_++) {
				int i_54_ = i_53_ * anInt9135;
				int i_55_ = anInt9134 + (i_53_ + anInt9136) * i;
				for (int i_56_ = 0; i_56_ < anInt9135; i_56_++) {
					is[i_55_++] = anIntArray9139[i_54_];
					i_54_++;
				}
			}
			return is;
		}
		return anIntArray9139;
	}

	public void method2952(int i) {
		int i_57_ = method2951();
		int i_58_ = method2968();
		if (anInt9135 != i_57_ || anInt9133 != i_58_) {
			int i_59_ = i;
			if (i_59_ > anInt9134)
				i_59_ = anInt9134;
			int i_60_ = i;
			if (i_60_ + anInt9134 + anInt9135 > i_57_)
				i_60_ = i_57_ - anInt9134 - anInt9135;
			int i_61_ = i;
			if (i_61_ > anInt9136)
				i_61_ = anInt9136;
			int i_62_ = i;
			if (i_62_ + anInt9136 + anInt9133 > i_58_)
				i_62_ = i_58_ - anInt9136 - anInt9133;
			int i_63_ = anInt9135 + i_59_ + i_60_;
			int i_64_ = anInt9133 + i_61_ + i_62_;
			int[] is = new int[i_63_ * i_64_];
			aBool9132 = false;
			for (int i_65_ = 0; i_65_ < anInt9133; i_65_++) {
				int i_66_ = i_65_ * anInt9135;
				int i_67_ = (i_65_ + i_61_) * i_63_ + i_59_;
				for (int i_68_ = 0; i_68_ < anInt9135; i_68_++) {
					if ((anIntArray9139[i_66_] & ~0xffffff) != -16777216)
						aBool9132 = true;
					is[i_67_++] = anIntArray9139[i_66_++];
				}
			}
			anInt9134 -= i_59_;
			anInt9136 -= i_61_;
			anInt9138 -= i_60_;
			anInt9137 -= i_62_;
			anInt9135 = i_63_;
			anInt9133 = i_64_;
			anIntArray9139 = is;
		}
	}

	public void method2983(int i) {
		int i_69_ = 0;
		aBool9132 = false;
		int[] is = new int[anInt9135 * anInt9133];
		for (int i_70_ = 0; i_70_ < anInt9133; i_70_++) {
			for (int i_71_ = 0; i_71_ < anInt9135; i_71_++) {
				int i_72_ = anIntArray9139[i_69_];
				if ((i_72_ & ~0xffffff) == 0) {
					if (i_71_ > 0 && (anIntArray9139[i_69_ - 1] & ~0xffffff) != 0)
						i_72_ = i;
					else if (i_70_ > 0 && (anIntArray9139[i_69_ - anInt9135] & ~0xffffff) != 0)
						i_72_ = i;
					else if (i_71_ < anInt9135 - 1 && (anIntArray9139[i_69_ + 1] & ~0xffffff) != 0)
						i_72_ = i;
					else if (i_70_ < anInt9133 - 1 && (anIntArray9139[i_69_ + anInt9135] & ~0xffffff) != 0)
						i_72_ = i;
				}
				if ((i_72_ & ~0xffffff) != -16777216)
					aBool9132 = true;
				is[i_69_++] = i_72_;
			}
		}
		anIntArray9139 = is;
	}

	public void method2992(int i) {
		int i_73_ = 0;
		aBool9132 = false;
		int[] is = new int[anInt9135 * anInt9133];
		for (int i_74_ = 0; i_74_ < anInt9133; i_74_++) {
			for (int i_75_ = 0; i_75_ < anInt9135; i_75_++) {
				int i_76_ = anIntArray9139[i_73_];
				if ((i_76_ & ~0xffffff) == 0) {
					if (i_75_ > 0 && (anIntArray9139[i_73_ - 1] & ~0xffffff) != 0)
						i_76_ = i;
					else if (i_74_ > 0 && (anIntArray9139[i_73_ - anInt9135] & ~0xffffff) != 0)
						i_76_ = i;
					else if (i_75_ < anInt9135 - 1 && (anIntArray9139[i_73_ + 1] & ~0xffffff) != 0)
						i_76_ = i;
					else if (i_74_ < anInt9133 - 1 && (anIntArray9139[i_73_ + anInt9135] & ~0xffffff) != 0)
						i_76_ = i;
				}
				if ((i_76_ & ~0xffffff) != -16777216)
					aBool9132 = true;
				is[i_73_++] = i_76_;
			}
		}
		anIntArray9139 = is;
	}

	public void method2985(int i) {
		int i_77_ = 0;
		aBool9132 = false;
		int[] is = new int[anInt9135 * anInt9133];
		for (int i_78_ = 0; i_78_ < anInt9133; i_78_++) {
			for (int i_79_ = 0; i_79_ < anInt9135; i_79_++) {
				int i_80_ = anIntArray9139[i_77_];
				if ((i_80_ & ~0xffffff) == 0) {
					if (i_79_ > 0 && (anIntArray9139[i_77_ - 1] & ~0xffffff) != 0)
						i_80_ = i;
					else if (i_78_ > 0 && (anIntArray9139[i_77_ - anInt9135] & ~0xffffff) != 0)
						i_80_ = i;
					else if (i_79_ < anInt9135 - 1 && (anIntArray9139[i_77_ + 1] & ~0xffffff) != 0)
						i_80_ = i;
					else if (i_78_ < anInt9133 - 1 && (anIntArray9139[i_77_ + anInt9135] & ~0xffffff) != 0)
						i_80_ = i;
				}
				if ((i_80_ & ~0xffffff) != -16777216)
					aBool9132 = true;
				is[i_77_++] = i_80_;
			}
		}
		anIntArray9139 = is;
	}

	public int method2975() {
		return anInt9138;
	}

	public int method2951() {
		return anInt9135 + anInt9134 + anInt9138;
	}

	public int method2949() {
		return anInt9137;
	}

	public void method2989() {
		int[] is = anIntArray9139;
		for (int i = anInt9133 - 1; i >= 0; i--) {
			int i_81_ = i * anInt9135;
			for (int i_82_ = (i + 1) * anInt9135; i_81_ < i_82_; i_81_++) {
				i_82_--;
				int i_83_ = is[i_81_];
				is[i_81_] = is[i_82_];
				is[i_82_] = i_83_;
			}
		}
		int i = anInt9134;
		anInt9134 = anInt9138;
		anInt9138 = i;
	}

	public int method3003() {
		return anInt9133 + anInt9136 + anInt9137;
	}

	public int method2978() {
		return anInt9136;
	}

	public int method2976() {
		return anInt9138;
	}

	public void method2960() {
		int[] is = anIntArray9139;
		for (int i = (anInt9133 >> 1) - 1; i >= 0; i--) {
			int i_84_ = i * anInt9135;
			int i_85_ = (anInt9133 - i - 1) * anInt9135;
			for (int i_86_ = -anInt9135; i_86_ < 0; i_86_++) {
				int i_87_ = is[i_84_];
				is[i_84_] = is[i_85_];
				is[i_85_] = i_87_;
				i_84_++;
				i_85_++;
			}
		}
		int i = anInt9136;
		anInt9136 = anInt9137;
		anInt9137 = i;
	}

	public void method2994() {
		int[] is = anIntArray9139;
		for (int i = (anInt9133 >> 1) - 1; i >= 0; i--) {
			int i_88_ = i * anInt9135;
			int i_89_ = (anInt9133 - i - 1) * anInt9135;
			for (int i_90_ = -anInt9135; i_90_ < 0; i_90_++) {
				int i_91_ = is[i_88_];
				is[i_88_] = is[i_89_];
				is[i_89_] = i_91_;
				i_88_++;
				i_89_++;
			}
		}
		int i = anInt9136;
		anInt9136 = anInt9137;
		anInt9137 = i;
	}

	public void method2995() {
		int[] is = new int[anInt9135 * anInt9133];
		int i = 0;
		for (int i_92_ = 0; i_92_ < anInt9135; i_92_++) {
			for (int i_93_ = anInt9133 - 1; i_93_ >= 0; i_93_--)
				is[i++] = anIntArray9139[i_92_ + i_93_ * anInt9135];
		}
		anIntArray9139 = is;
		int i_94_ = anInt9136;
		anInt9136 = anInt9134;
		anInt9134 = anInt9137;
		anInt9137 = anInt9138;
		anInt9138 = i_94_;
		i_94_ = anInt9133;
		anInt9133 = anInt9135;
		anInt9135 = i_94_;
	}

	public int[] method2996(boolean bool) {
		if (bool && (method2951() != anInt9135 || method2968() != anInt9133)) {
			int i = method2951();
			int[] is = new int[i * method2968()];
			for (int i_95_ = 0; i_95_ < anInt9133; i_95_++) {
				int i_96_ = i_95_ * anInt9135;
				int i_97_ = anInt9134 + (i_95_ + anInt9136) * i;
				for (int i_98_ = 0; i_98_ < anInt9135; i_98_++) {
					is[i_97_++] = anIntArray9139[i_96_];
					i_96_++;
				}
			}
			return is;
		}
		return anIntArray9139;
	}

	public int[] method2993(boolean bool) {
		if (bool && (method2951() != anInt9135 || method2968() != anInt9133)) {
			int i = method2951();
			int[] is = new int[i * method2968()];
			for (int i_99_ = 0; i_99_ < anInt9133; i_99_++) {
				int i_100_ = i_99_ * anInt9135;
				int i_101_ = anInt9134 + (i_99_ + anInt9136) * i;
				for (int i_102_ = 0; i_102_ < anInt9135; i_102_++) {
					is[i_101_++] = anIntArray9139[i_100_];
					i_100_++;
				}
			}
			return is;
		}
		return anIntArray9139;
	}

	public void method3000(int i, int i_103_, int i_104_) {
		for (int i_105_ = 1; i_105_ < anIntArray9139.length; i_105_++) {
			int i_106_ = anIntArray9139[i_105_] >> 16 & 0xff;
			i_106_ += i;
			if (i_106_ < 0)
				i_106_ = 0;
			else if (i_106_ > 255)
				i_106_ = 255;
			int i_107_ = anIntArray9139[i_105_] >> 8 & 0xff;
			i_107_ += i_103_;
			if (i_107_ < 0)
				i_107_ = 0;
			else if (i_107_ > 255)
				i_107_ = 255;
			int i_108_ = anIntArray9139[i_105_] >> 0 & 0xff;
			i_108_ += i_104_;
			if (i_108_ < 0)
				i_108_ = 0;
			else if (i_108_ > 255)
				i_108_ = 255;
			anIntArray9139[i_105_] = (anIntArray9139[i_105_] & ~0xffffff | i_106_ << 16 | i_107_ << 8 | i_108_);
		}
	}

	public void method2999(int i, int i_109_, int i_110_) {
		for (int i_111_ = 1; i_111_ < anIntArray9139.length; i_111_++) {
			int i_112_ = anIntArray9139[i_111_] >> 16 & 0xff;
			i_112_ += i;
			if (i_112_ < 0)
				i_112_ = 0;
			else if (i_112_ > 255)
				i_112_ = 255;
			int i_113_ = anIntArray9139[i_111_] >> 8 & 0xff;
			i_113_ += i_109_;
			if (i_113_ < 0)
				i_113_ = 0;
			else if (i_113_ > 255)
				i_113_ = 255;
			int i_114_ = anIntArray9139[i_111_] >> 0 & 0xff;
			i_114_ += i_110_;
			if (i_114_ < 0)
				i_114_ = 0;
			else if (i_114_ > 255)
				i_114_ = 255;
			anIntArray9139[i_111_] = (anIntArray9139[i_111_] & ~0xffffff | i_112_ << 16 | i_113_ << 8 | i_114_);
		}
	}

	public void method3001() {
		int[] is = anIntArray9139;
		for (int i = (anInt9133 >> 1) - 1; i >= 0; i--) {
			int i_115_ = i * anInt9135;
			int i_116_ = (anInt9133 - i - 1) * anInt9135;
			for (int i_117_ = -anInt9135; i_117_ < 0; i_117_++) {
				int i_118_ = is[i_115_];
				is[i_115_] = is[i_116_];
				is[i_116_] = i_118_;
				i_115_++;
				i_116_++;
			}
		}
		int i = anInt9136;
		anInt9136 = anInt9137;
		anInt9137 = i;
	}

	public void method3004(int i) {
		for (int i_119_ = anInt9133 - 1; i_119_ > 0; i_119_--) {
			int i_120_ = i_119_ * anInt9135;
			for (int i_121_ = anInt9135 - 1; i_121_ > 0; i_121_--) {
				if ((anIntArray9139[i_121_ + i_120_] & ~0xffffff) == 0 && (anIntArray9139[i_121_ + i_120_ - 1 - anInt9135] & ~0xffffff) != 0)
					anIntArray9139[i_121_ + i_120_] = i;
			}
		}
	}

	public int method3002(int i, int i_122_) {
		return anIntArray9139[i + i_122_ * anInt9135];
	}

	public boolean method2966() {
		return false;
	}

	public int method2990() {
		return anInt9135 + anInt9134 + anInt9138;
	}

	public void method2980(int i, int i_123_, int i_124_) {
		for (int i_125_ = 1; i_125_ < anIntArray9139.length; i_125_++) {
			int i_126_ = anIntArray9139[i_125_] >> 16 & 0xff;
			i_126_ += i;
			if (i_126_ < 0)
				i_126_ = 0;
			else if (i_126_ > 255)
				i_126_ = 255;
			int i_127_ = anIntArray9139[i_125_] >> 8 & 0xff;
			i_127_ += i_123_;
			if (i_127_ < 0)
				i_127_ = 0;
			else if (i_127_ > 255)
				i_127_ = 255;
			int i_128_ = anIntArray9139[i_125_] >> 0 & 0xff;
			i_128_ += i_124_;
			if (i_128_ < 0)
				i_128_ = 0;
			else if (i_128_ > 255)
				i_128_ = 255;
			anIntArray9139[i_125_] = (anIntArray9139[i_125_] & ~0xffffff | i_126_ << 16 | i_127_ << 8 | i_128_);
		}
	}

	public int method3006() {
		return anInt9135 + anInt9134 + anInt9138;
	}
}
