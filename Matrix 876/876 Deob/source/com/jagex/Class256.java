/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class256 implements Interface42 {
	int anInt2758;
	int anInt2759;
	int anInt2760;
	int anInt2761;
	boolean[] aBoolArray2762;
	boolean aBool2763;
	List aList2764 = new ArrayList();
	int anInt2765;
	int anInt2766;
	Class365 aClass365_2767;
	int anInt2768;
	int anInt2769;
	boolean aBool2770;
	boolean[] aBoolArray2771;
	int anInt2772;
	int anInt2773;
	Class249[] aClass249Array2774;
	Class255[] aClass255Array2775;
	Class235[] aClass235Array2776;
	Class247[] aClass247Array2777;
	boolean aBool2778;
	int anInt2779;
	Class243 aClass243_2780;
	int anInt2781;
	int anInt2782;
	boolean[] aBoolArray2783;
	Class243[] aClass243Array2784;
	Class243 aClass243_2785;
	Class243 aClass243_2786;
	Class243 aClass243_2787;
	Class243 aClass243_2788;
	Class393 aClass393_2789;
	Interface47 anInterface47_2790;
	int[] anIntArray2791;
	int[] anIntArray2792;
	Class243[] aClass243Array2793;
	List aList2794;
	RSBuffer aClass523_Sub34_2795;
	int anInt2796;
	int anInt2797;
	List aList2798;
	boolean aBool2799;
	static List aList2800 = new ArrayList();
	boolean aBool2801;
	Class243 aClass243_2802;
	int[] anIntArray2803;
	int anInt2804;
	int anInt2805;
	int anInt2806;
	int anInt2807;
	int anInt2808;
	int anInt2809;
	Class372 aClass372_2810 = Class372.aClass372_3897;
	int anInt2811;
	List aList2812;
	List aList2813;
	AtomicReference anAtomicReference2814;
	int anInt2815;
	int anInt2816;
	Class243[] aClass243Array2817;
	boolean aBool2818;
	int anInt2819;
	int anInt2820;
	static Class209 aClass209_2821 = new Class209(524288, 1024);
	byte[] aByteArray2822;
	int anInt2823;
	int anInt2824;
	float aFloat2825;
	boolean[] aBoolArray2826;
	boolean[] aBoolArray2827;

	boolean method4584(int i, Class393 class393, Class365 class365) {
		if (class393 == Class393.aClass393_4038)
			return true;
		if (class393 == Class393.aClass393_4040)
			return true;
		if (class393 == Class393.aClass393_4042)
			return true;
		if (class393 == Class393.aClass393_4039)
			return true;
		return false;
	}

	public void method286(boolean bool) {
		if (!bool)
			method292();
		else if (method282() == Class372.aClass372_3903) {
			method4622(true);
			method4585(Class372.aClass372_3898);
		}
	}

	public void method292() {
		if (method282() != Class372.aClass372_3899) {
			method4622(false);
			method4585(Class372.aClass372_3897);
		} else {
			method4622(false);
			method4585(Class372.aClass372_3901);
		}
	}

	public Class372 method282() {
		return aClass372_2810;
	}

	void method4585(Class372 class372) {
		aClass372_2810 = class372;
	}

	int method4586() {
		return anInt2819;
	}

	public void method63(RSBuffer class523_sub34) {
		if (method282() == Class372.aClass372_3902 || method282() == Class372.aClass372_3903) {
			if (class523_sub34 != null)
				class523_sub34.method16408(-1259855567);
		} else if (class523_sub34 == null) {
			boolean bool = aBool2818 && (anInt2765 > 0 && anInt2820 < anInt2765 || anInt2765 < 0);
			if (aList2798.isEmpty()) {
				if (!bool) {
					method4609();
					method4585(Class372.aClass372_3903);
				}
			} else if (!bool) {
				method4609();
				method4585(Class372.aClass372_3902);
			}
			if (bool)
				method4622(true);
		} else
			method4615(class523_sub34);
	}

	public void method130() {
		if (method282() == Class372.aClass372_3901 || method282() == Class372.aClass372_3897 || method282() == Class372.aClass372_3898) {
			method4585(Class372.aClass372_3899);
			method4610();
		}
	}

	public RSBuffer method289(int i) {
		RSBuffer class523_sub34 = method4621(i);
		return class523_sub34;
	}

	public int method182() {
		return method4623();
	}

	void method4587() {
		aByteArray2822 = null;
	}

	public int method310(int i) {
		return i * (method285().anInt4043 * 1552171027 / 8);
	}

	public Class365 method315() {
		return aClass365_2767;
	}

	public Class393 method285() {
		return aClass393_2789;
	}

	public synchronized boolean method291() {
		return aBool2801;
	}

	boolean method4588(RSBuffer class523_sub34) {
		if (class523_sub34.readUnsignedByte(-1288925695) != 79 || class523_sub34.readUnsignedByte(-530195916) != 103 || class523_sub34.readUnsignedByte(1156187092) != 103 || class523_sub34.readUnsignedByte(-1023494167) != 83)
			return false;
		return true;
	}

	boolean method4589(int i, Class393 class393, Class365 class365) {
		if (class393 == Class393.aClass393_4038)
			return true;
		if (class393 == Class393.aClass393_4040)
			return true;
		if (class393 == Class393.aClass393_4042)
			return true;
		if (class393 == Class393.aClass393_4039)
			return true;
		return false;
	}

	int method4590() {
		if (aBool2770)
			return anInt2766;
		throw new RuntimeException("");
	}

	public int method321() {
		if (aBool2770)
			return method4590() < anInt2768 ? anInt2768 : method4590();
		throw new RuntimeException("");
	}

	int method4591(int i) {
		int i_0_ = 0;
		int i_1_ = 0;
		int i_2_;
		for (/**/; i >= 8 - anInt2758; i -= i_2_) {
			i_2_ = 8 - anInt2758;
			int i_3_ = (1 << i_2_) - 1;
			i_0_ += (aByteArray2822[anInt2823] >> anInt2758 & i_3_) << i_1_;
			anInt2758 = 0;
			anInt2823++;
			i_1_ += i_2_;
		}
		if (i > 0) {
			i_2_ = (1 << i) - 1;
			i_0_ += (aByteArray2822[anInt2823] >> anInt2758 & i_2_) << i_1_;
			anInt2758 += i;
		}
		return i_0_;
	}

	synchronized void method4592(boolean bool) {
		aBool2801 = bool;
	}

	Class243[] method4593(int i, int i_4_) {
		Class243[] class243s = new Class243[i];
		for (int i_5_ = 0; i_5_ < class243s.length; i_5_++)
			class243s[i_5_] = method4594(i_4_);
		return class243s;
	}

	Class243 method4594(int i) {
		synchronized (aClass209_2821) {
			Object object = null;
			Class243 class243 = (Class243) aClass209_2821.method3777(809863981);
			Class243 class243_6_ = null;
			int i_7_ = i;
			for (/**/; class243 != null; class243 = (Class243) aClass209_2821.method3795((byte) 0)) {
				if (class243.aFloatArray2459.length > i && !class243.aBool2461 && (class243_6_ == null || class243.aFloatArray2459.length < i_7_)) {
					class243_6_ = class243;
					i_7_ = class243_6_.aFloatArray2459.length;
				}
				if (class243.aFloatArray2459.length == i && !class243.aBool2461)
					break;
			}
			if (class243 == null)
				class243 = class243_6_;
			if (class243 == null) {
				class243 = new Class243(this);
				int i_8_ = 0;
				boolean bool = false;
				while (!bool && i_8_ < 1000) {
					if (aClass209_2821.method3767((long) i_8_) != null)
						i_8_++;
					else
						bool = true;
				}
				class243.anInt2460 = i_8_;
				float[] fs = new float[i];
				class243.aFloatArray2459 = fs;
				class243.aBool2461 = true;
				class243.anInt2462 = i;
				if (aClass209_2821.method3780(30105747) >= i * 4) {
					/* empty */
				}
				aClass209_2821.method3764(class243, (long) class243.anInt2460, fs.length * 4, 841665549);
			} else {
				for (int i_9_ = 0; i_9_ < class243.aFloatArray2459.length; i_9_++)
					class243.aFloatArray2459[i_9_] = 0.0F;
				class243.anInt2462 = i;
			}
			class243.aBool2461 = true;
			Class243 class243_10_ = class243;
			return class243_10_;
		}
	}

	void method4595(Class243 class243) {
		if (class243 != null) {
			synchronized (aClass209_2821) {
				class243.aBool2461 = false;
			}
		}
	}

	void method4596(Class243[] class243s) {
		if (class243s != null) {
			for (int i = 0; i < class243s.length; i++)
				method4595(class243s[i]);
		}
	}

	boolean method4597() {
		return aBool2778;
	}

	void method4598() {
		if (method282() != Class372.aClass372_3902) {
			method4614();
			if (method282() == Class372.aClass372_3899)
				method4585(Class372.aClass372_3898);
		}
	}

	void method4599(RSBuffer class523_sub34) {
		aList2794.add(class523_sub34);
	}

	boolean method4600() {
		return aBool2778;
	}

	boolean method4601(RSBuffer class523_sub34) {
		if (class523_sub34.readUnsignedByte(-1471155144) != 79 || class523_sub34.readUnsignedByte(-60013734) != 103 || class523_sub34.readUnsignedByte(-655667557) != 103 || class523_sub34.readUnsignedByte(1282667761) != 83)
			return false;
		return true;
	}

	int method4602() {
		int i = aByteArray2822[anInt2823] >> anInt2758 & 0x1;
		anInt2758++;
		anInt2823 += anInt2758 >> 3;
		anInt2758 &= 0x7;
		return i;
	}

	float method4603(int i) {
		int i_11_ = i & 0x1fffff;
		int i_12_ = i & ~0x7fffffff;
		int i_13_ = (i & 0x7fe00000) >> 21;
		if (i_12_ != 0)
			i_11_ = -i_11_;
		return (float) ((double) i_11_ * Math.pow(2.0, (double) (i_13_ - 788)));
	}

	int method4604() {
		return anInt2823;
	}

	int method4605() {
		return anInt2758;
	}

	void method4606(byte[] is, int i) {
		aByteArray2822 = is;
		anInt2823 = i;
		anInt2758 = 0;
	}

	boolean method4607(byte[] is, int i, int i_14_, AtomicReference atomicreference) {
		if (is == null)
			throw new RuntimeException("");
		if (i + i_14_ > is.length)
			return false;
		method4606(is, i);
		int i_15_ = method4602();
		if (i_15_ != 0) {
			method4666(is, i);
			return false;
		}
		if (!method291())
			throw new RuntimeException();
		int i_16_ = method4608(method4612(anIntArray2803.length - 1));
		boolean bool = aBoolArray2771[i_16_];
		int i_17_ = bool ? anInt2773 : anInt2772;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		if (bool) {
			bool_18_ = method4602() != 0;
			bool_19_ = method4602() != 0;
		}
		int i_20_ = i_17_ >> 1;
		int i_21_;
		int i_22_;
		int i_23_;
		if (bool && !bool_18_) {
			i_21_ = (i_17_ >> 2) - (anInt2772 >> 2);
			i_22_ = (i_17_ >> 2) + (anInt2772 >> 2);
			i_23_ = anInt2772 >> 1;
		} else {
			i_21_ = 0;
			i_22_ = i_20_;
			i_23_ = i_17_ >> 1;
		}
		int i_24_;
		int i_25_;
		int i_26_;
		if (bool && !bool_19_) {
			i_24_ = i_17_ - (i_17_ >> 2) - (anInt2772 >> 2);
			i_25_ = i_17_ - (i_17_ >> 2) + (anInt2772 >> 2);
			i_26_ = anInt2772 >> 1;
		} else {
			i_24_ = i_20_;
			i_25_ = i_17_;
			i_26_ = i_17_ >> 1;
		}
		Class247 class247 = aClass247Array2777[anIntArray2803[i_16_]];
		if (aBoolArray2762 == null || aBoolArray2762.length != anInt2766) {
			aBoolArray2762 = new boolean[anInt2766];
			aBoolArray2826 = new boolean[anInt2766];
		}
		for (int i_27_ = 0; i_27_ < anInt2766; i_27_++) {
			int i_28_ = (class247.anIntArray2483 != null ? class247.anIntArray2483[i_27_] : 0);
			int i_29_ = i_28_;
			int i_30_ = class247.anIntArray2481[i_29_];
			aBoolArray2762[i_27_] = !aClass255Array2775[i_30_].method4583(i_27_);
			aBoolArray2826[i_27_] = aBoolArray2762[i_27_];
		}
		for (int i_31_ = 0; i_31_ < class247.anInt2482; i_31_++) {
			if (!aBoolArray2762[class247.anIntArray2488[i_31_]] || !aBoolArray2762[class247.anIntArray2485[i_31_]]) {
				aBoolArray2762[class247.anIntArray2488[i_31_]] = false;
				aBoolArray2762[class247.anIntArray2485[i_31_]] = false;
			}
		}
		if (aBoolArray2827 == null || aBoolArray2827.length != anInt2766)
			aBoolArray2827 = new boolean[anInt2766];
		for (int i_32_ = 0; i_32_ < class247.anInt2487; i_32_++) {
			int i_33_ = 0;
			for (int i_34_ = 0; i_34_ < anInt2766; i_34_++) {
				int i_35_ = (class247.anIntArray2483 != null ? class247.anIntArray2483[i_34_] : i_32_);
				if (i_35_ == i_32_)
					aBoolArray2827[i_33_++] = aBoolArray2762[i_34_];
			}
			Class235 class235 = aClass235Array2776[class247.anIntArray2486[i_32_]];
			Object object = null;
			Class243[] class243s;
			if (class235.anInt2382 == 2) {
				Class243[] class243s_36_ = method4593(1, anInt2766 * i_17_);
				for (int i_37_ = 0; i_37_ < i_17_; i_37_++) {
					for (int i_38_ = 0; i_38_ < anInt2766; i_38_++) {
						try {
							class243s_36_[0].aFloatArray2459[(i_37_ * anInt2766 + i_38_)] = (aClass243Array2784[i_38_].aFloatArray2459[i_37_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class243s_36_ = class235.method4282(class243s_36_, i_17_ >> 1, aBoolArray2827);
				class243s = aClass243Array2784;
				for (int i_39_ = 0; i_39_ < i_17_; i_39_++) {
					for (int i_40_ = 0; i_40_ < anInt2766; i_40_++) {
						try {
							class243s[i_40_].aFloatArray2459[i_39_] = (class243s_36_[0].aFloatArray2459[anInt2766 * i_39_ + i_40_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method4596(class243s_36_);
				Object object_41_ = null;
			} else
				class243s = class235.method4282(aClass243Array2784, i_17_ >> 1, aBoolArray2827);
			if (class247.anIntArray2483 != null) {
				i_33_ = 0;
				for (int i_42_ = 0; i_42_ < anInt2766; i_42_++) {
					int i_43_ = class247.anIntArray2483[i_42_];
					if (i_43_ == i_32_)
						aClass243Array2784[i_42_] = class243s[i_33_++];
				}
			} else {
				if (aClass243Array2784 != class243s)
					method4596(aClass243Array2784);
				aClass243Array2784 = class243s;
			}
		}
		for (int i_44_ = class247.anInt2482 - 1; i_44_ >= 0; i_44_--) {
			Class243 class243 = aClass243Array2784[class247.anIntArray2488[i_44_]];
			Class243 class243_45_ = aClass243Array2784[class247.anIntArray2485[i_44_]];
			for (int i_46_ = 0; i_46_ < class243.anInt2462; i_46_++) {
				float f = class243.aFloatArray2459[i_46_];
				float f_47_ = class243_45_.aFloatArray2459[i_46_];
				float f_48_ = f;
				float f_49_ = f_47_;
				if (f > 0.0F) {
					if (f_47_ > 0.0F) {
						f_48_ = f;
						f_49_ = f - f_47_;
					} else {
						f_49_ = f;
						f_48_ = f + f_47_;
					}
				} else if (f_47_ > 0.0F) {
					f_48_ = f;
					f_49_ = f + f_47_;
				} else {
					f_49_ = f;
					f_48_ = f - f_47_;
				}
				class243.aFloatArray2459[i_46_] = f_48_;
				class243_45_.aFloatArray2459[i_46_] = f_49_;
			}
		}
		for (int i_50_ = 0; i_50_ < aBoolArray2762.length; i_50_++)
			aBoolArray2762[i_50_] = aBoolArray2826[i_50_];
		for (int i_51_ = 0; i_51_ < anInt2766; i_51_++) {
			if (!aBoolArray2762[i_51_]) {
				int i_52_ = (class247.anIntArray2483 != null ? class247.anIntArray2483[i_51_] : 0);
				int i_53_ = i_52_;
				int i_54_ = class247.anIntArray2481[i_53_];
				aClass255Array2775[i_54_].method4560(i_51_);
				aClass255Array2775[i_54_].method4579(aClass243Array2784[i_51_], i_17_ >> 1, i_51_);
			}
		}
		for (int i_55_ = 0; i_55_ < anInt2766; i_55_++) {
			if (aBoolArray2762[i_55_]) {
				for (int i_56_ = i_17_ >> 1; i_56_ < i_17_; i_56_++)
					aClass243Array2784[i_55_].aFloatArray2459[i_56_] = 0.0F;
			} else {
				int i_57_ = i_17_ >> 1;
				int i_58_ = i_17_ >> 2;
				int i_59_ = i_17_ >> 3;
				Class243 class243 = aClass243Array2784[i_55_];
				for (int i_60_ = 0; i_60_ < i_57_; i_60_++)
					class243.aFloatArray2459[i_60_] *= 0.5F;
				for (int i_61_ = i_57_; i_61_ < i_17_; i_61_++)
					class243.aFloatArray2459[i_61_] = -class243.aFloatArray2459[i_17_ - i_61_ - 1];
				Class243 class243_62_ = bool ? aClass243_2788 : aClass243_2780;
				Class243 class243_63_ = bool ? aClass243_2785 : aClass243_2786;
				Class243 class243_64_ = bool ? aClass243_2802 : aClass243_2787;
				int[] is_65_ = bool ? anIntArray2792 : anIntArray2791;
				for (int i_66_ = 0; i_66_ < i_58_; i_66_++) {
					float f = (class243.aFloatArray2459[4 * i_66_] - class243.aFloatArray2459[i_17_ - 4 * i_66_ - 1]);
					float f_67_ = (class243.aFloatArray2459[4 * i_66_ + 2] - class243.aFloatArray2459[i_17_ - 4 * i_66_ - 3]);
					float f_68_ = class243_62_.aFloatArray2459[2 * i_66_];
					float f_69_ = class243_62_.aFloatArray2459[2 * i_66_ + 1];
					class243.aFloatArray2459[i_17_ - 4 * i_66_ - 1] = f * f_68_ - f_67_ * f_69_;
					class243.aFloatArray2459[i_17_ - 4 * i_66_ - 3] = f * f_69_ + f_67_ * f_68_;
				}
				for (int i_70_ = 0; i_70_ < i_59_; i_70_++) {
					float f = class243.aFloatArray2459[i_57_ + 3 + 4 * i_70_];
					float f_71_ = class243.aFloatArray2459[i_57_ + 1 + 4 * i_70_];
					float f_72_ = class243.aFloatArray2459[4 * i_70_ + 3];
					float f_73_ = class243.aFloatArray2459[4 * i_70_ + 1];
					class243.aFloatArray2459[i_57_ + 3 + 4 * i_70_] = f + f_72_;
					class243.aFloatArray2459[i_57_ + 1 + 4 * i_70_] = f_71_ + f_73_;
					float f_74_ = class243_62_.aFloatArray2459[i_57_ - 4 - 4 * i_70_];
					float f_75_ = class243_62_.aFloatArray2459[i_57_ - 3 - 4 * i_70_];
					class243.aFloatArray2459[4 * i_70_ + 3] = (f - f_72_) * f_74_ - (f_71_ - f_73_) * f_75_;
					class243.aFloatArray2459[4 * i_70_ + 1] = (f_71_ - f_73_) * f_74_ + (f - f_72_) * f_75_;
				}
				int i_76_ = Class181.method3537(i_17_ - 1, (byte) 0);
				for (int i_77_ = 0; i_77_ < i_76_ - 3; i_77_++) {
					int i_78_ = i_17_ >> i_77_ + 2;
					int i_79_ = 8 << i_77_;
					for (int i_80_ = 0; i_80_ < 2 << i_77_; i_80_++) {
						int i_81_ = i_17_ - i_78_ * 2 * i_80_;
						int i_82_ = i_17_ - i_78_ * (2 * i_80_ + 1);
						for (int i_83_ = 0; i_83_ < i_17_ >> i_77_ + 4; i_83_++) {
							int i_84_ = 4 * i_83_;
							float f = class243.aFloatArray2459[i_81_ - 1 - i_84_];
							float f_85_ = class243.aFloatArray2459[i_81_ - 3 - i_84_];
							float f_86_ = class243.aFloatArray2459[i_82_ - 1 - i_84_];
							float f_87_ = class243.aFloatArray2459[i_82_ - 3 - i_84_];
							class243.aFloatArray2459[i_81_ - 1 - i_84_] = f + f_86_;
							class243.aFloatArray2459[i_81_ - 3 - i_84_] = f_85_ + f_87_;
							float f_88_ = class243_62_.aFloatArray2459[i_83_ * i_79_];
							float f_89_ = (class243_62_.aFloatArray2459[i_83_ * i_79_ + 1]);
							class243.aFloatArray2459[i_82_ - 1 - i_84_] = ((f - f_86_) * f_88_ - (f_85_ - f_87_) * f_89_);
							class243.aFloatArray2459[i_82_ - 3 - i_84_] = ((f_85_ - f_87_) * f_88_ + (f - f_86_) * f_89_);
						}
					}
				}
				for (int i_90_ = 1; i_90_ < i_59_ - 1; i_90_++) {
					int i_91_ = is_65_[i_90_];
					if (i_90_ < i_91_) {
						int i_92_ = 8 * i_90_;
						int i_93_ = 8 * i_91_;
						float f = class243.aFloatArray2459[i_92_ + 1];
						class243.aFloatArray2459[i_92_ + 1] = class243.aFloatArray2459[i_93_ + 1];
						class243.aFloatArray2459[i_93_ + 1] = f;
						f = class243.aFloatArray2459[i_92_ + 3];
						class243.aFloatArray2459[i_92_ + 3] = class243.aFloatArray2459[i_93_ + 3];
						class243.aFloatArray2459[i_93_ + 3] = f;
						f = class243.aFloatArray2459[i_92_ + 5];
						class243.aFloatArray2459[i_92_ + 5] = class243.aFloatArray2459[i_93_ + 5];
						class243.aFloatArray2459[i_93_ + 5] = f;
						f = class243.aFloatArray2459[i_92_ + 7];
						class243.aFloatArray2459[i_92_ + 7] = class243.aFloatArray2459[i_93_ + 7];
						class243.aFloatArray2459[i_93_ + 7] = f;
					}
				}
				for (int i_94_ = 0; i_94_ < i_57_; i_94_++)
					class243.aFloatArray2459[i_94_] = class243.aFloatArray2459[2 * i_94_ + 1];
				for (int i_95_ = 0; i_95_ < i_59_; i_95_++) {
					class243.aFloatArray2459[i_17_ - 1 - 2 * i_95_] = class243.aFloatArray2459[4 * i_95_];
					class243.aFloatArray2459[i_17_ - 2 - 2 * i_95_] = class243.aFloatArray2459[4 * i_95_ + 1];
					class243.aFloatArray2459[i_17_ - i_58_ - 1 - 2 * i_95_] = class243.aFloatArray2459[4 * i_95_ + 2];
					class243.aFloatArray2459[i_17_ - i_58_ - 2 - 2 * i_95_] = class243.aFloatArray2459[4 * i_95_ + 3];
				}
				for (int i_96_ = 0; i_96_ < i_59_; i_96_++) {
					float f = class243_64_.aFloatArray2459[2 * i_96_];
					float f_97_ = class243_64_.aFloatArray2459[2 * i_96_ + 1];
					float f_98_ = class243.aFloatArray2459[i_57_ + 2 * i_96_];
					float f_99_ = class243.aFloatArray2459[i_57_ + 2 * i_96_ + 1];
					float f_100_ = class243.aFloatArray2459[i_17_ - 2 - 2 * i_96_];
					float f_101_ = class243.aFloatArray2459[i_17_ - 1 - 2 * i_96_];
					float f_102_ = f_97_ * (f_98_ - f_100_) + f * (f_99_ + f_101_);
					class243.aFloatArray2459[i_57_ + 2 * i_96_] = (f_98_ + f_100_ + f_102_) * 0.5F;
					class243.aFloatArray2459[i_17_ - 2 - 2 * i_96_] = (f_98_ + f_100_ - f_102_) * 0.5F;
					f_102_ = f_97_ * (f_99_ + f_101_) - f * (f_98_ - f_100_);
					class243.aFloatArray2459[i_57_ + 2 * i_96_ + 1] = (f_99_ - f_101_ + f_102_) * 0.5F;
					class243.aFloatArray2459[i_17_ - 1 - 2 * i_96_] = (-f_99_ + f_101_ + f_102_) * 0.5F;
				}
				for (int i_103_ = 0; i_103_ < i_58_; i_103_++) {
					class243.aFloatArray2459[i_103_] = ((class243.aFloatArray2459[2 * i_103_ + i_57_] * class243_63_.aFloatArray2459[2 * i_103_]) + (class243.aFloatArray2459[2 * i_103_ + 1 + i_57_] * class243_63_.aFloatArray2459[2 * i_103_ + 1]));
					class243.aFloatArray2459[i_57_ - 1 - i_103_] = ((class243.aFloatArray2459[2 * i_103_ + i_57_] * class243_63_.aFloatArray2459[2 * i_103_ + 1]) - (class243.aFloatArray2459[2 * i_103_ + 1 + i_57_] * class243_63_.aFloatArray2459[2 * i_103_]));
				}
				for (int i_104_ = 0; i_104_ < i_58_; i_104_++)
					class243.aFloatArray2459[i_17_ - i_58_ + i_104_] = -class243.aFloatArray2459[i_104_];
				for (int i_105_ = 0; i_105_ < i_58_; i_105_++)
					class243.aFloatArray2459[i_105_] = class243.aFloatArray2459[i_58_ + i_105_];
				for (int i_106_ = 0; i_106_ < i_58_; i_106_++)
					class243.aFloatArray2459[i_58_ + i_106_] = -class243.aFloatArray2459[i_58_ - i_106_ - 1];
				for (int i_107_ = 0; i_107_ < i_58_; i_107_++)
					class243.aFloatArray2459[i_57_ + i_107_] = class243.aFloatArray2459[i_17_ - i_107_ - 1];
				for (int i_108_ = i_21_; i_108_ < i_22_; i_108_++) {
					float f = (float) Math.sin(((double) (i_108_ - i_21_) + 0.5) / (double) i_23_ * 0.5 * 3.141592653589793);
					aClass243Array2784[i_55_].aFloatArray2459[i_108_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
				for (int i_109_ = i_24_; i_109_ < i_25_; i_109_++) {
					float f = (float) Math.sin((((double) (i_109_ - i_24_) + 0.5) / (double) i_26_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
					aClass243Array2784[i_55_].aFloatArray2459[i_109_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
			}
		}
		Class243[] class243s = null;
		if (anInt2806 > 0) {
			int i_110_ = anInt2806 + i_17_ >> 2;
			class243s = method4593(anInt2766, i_110_);
			for (int i_111_ = 0; i_111_ < anInt2766; i_111_++) {
				if (!aBoolArray2783[i_111_]) {
					for (int i_112_ = 0; i_112_ < anInt2782; i_112_++) {
						int i_113_ = (anInt2806 >> 1) + i_112_;
						class243s[i_111_].aFloatArray2459[i_112_] += (aClass243Array2793[i_111_].aFloatArray2459[i_113_]);
					}
				}
				if (!aBoolArray2762[i_111_]) {
					for (int i_114_ = i_21_; i_114_ < i_17_ >> 1; i_114_++) {
						int i_115_ = (class243s[i_111_].anInt2462 - (i_17_ >> 1) + i_114_);
						class243s[i_111_].aFloatArray2459[i_115_] += (aClass243Array2784[i_111_].aFloatArray2459[i_114_]);
					}
				}
			}
		}
		Class243[] class243s_116_ = aClass243Array2793;
		aClass243Array2793 = aClass243Array2784;
		aClass243Array2784 = class243s_116_;
		anInt2806 = i_17_;
		anInt2782 = i_25_ - (i_17_ >> 1);
		aBoolArray2783 = aBoolArray2762;
		atomicreference.set(class243s);
		return true;
	}

	int method4608(int i) {
		int i_117_ = 0;
		int i_118_ = 0;
		int i_119_;
		for (/**/; i >= 8 - anInt2758; i -= i_119_) {
			i_119_ = 8 - anInt2758;
			int i_120_ = (1 << i_119_) - 1;
			i_117_ += (aByteArray2822[anInt2823] >> anInt2758 & i_120_) << i_118_;
			anInt2758 = 0;
			anInt2823++;
			i_118_ += i_119_;
		}
		if (i > 0) {
			i_119_ = (1 << i) - 1;
			i_117_ += (aByteArray2822[anInt2823] >> anInt2758 & i_119_) << i_118_;
			anInt2758 += i;
		}
		return i_117_;
	}

	void method4609() {
		aByteArray2822 = null;
	}

	void method4610() {
		if (method282() != Class372.aClass372_3902) {
			method4614();
			if (method282() == Class372.aClass372_3899)
				method4585(Class372.aClass372_3898);
		}
	}

	int method4611() {
		if (method291())
			return anInt2811;
		throw new RuntimeException("");
	}

	int method4612(int i) {
		int i_121_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_121_++;
		return i_121_;
	}

	boolean method4613(byte[] is, int i, int i_122_, AtomicReference atomicreference) {
		if (is == null)
			throw new RuntimeException("");
		if (i + i_122_ > is.length)
			return false;
		method4606(is, i);
		int i_123_ = method4602();
		if (i_123_ != 0) {
			method4666(is, i);
			return false;
		}
		if (!method291())
			throw new RuntimeException();
		int i_124_ = method4608(method4612(anIntArray2803.length - 1));
		boolean bool = aBoolArray2771[i_124_];
		int i_125_ = bool ? anInt2773 : anInt2772;
		boolean bool_126_ = false;
		boolean bool_127_ = false;
		if (bool) {
			bool_126_ = method4602() != 0;
			bool_127_ = method4602() != 0;
		}
		int i_128_ = i_125_ >> 1;
		int i_129_;
		int i_130_;
		int i_131_;
		if (bool && !bool_126_) {
			i_129_ = (i_125_ >> 2) - (anInt2772 >> 2);
			i_130_ = (i_125_ >> 2) + (anInt2772 >> 2);
			i_131_ = anInt2772 >> 1;
		} else {
			i_129_ = 0;
			i_130_ = i_128_;
			i_131_ = i_125_ >> 1;
		}
		int i_132_;
		int i_133_;
		int i_134_;
		if (bool && !bool_127_) {
			i_132_ = i_125_ - (i_125_ >> 2) - (anInt2772 >> 2);
			i_133_ = i_125_ - (i_125_ >> 2) + (anInt2772 >> 2);
			i_134_ = anInt2772 >> 1;
		} else {
			i_132_ = i_128_;
			i_133_ = i_125_;
			i_134_ = i_125_ >> 1;
		}
		Class247 class247 = aClass247Array2777[anIntArray2803[i_124_]];
		if (aBoolArray2762 == null || aBoolArray2762.length != anInt2766) {
			aBoolArray2762 = new boolean[anInt2766];
			aBoolArray2826 = new boolean[anInt2766];
		}
		for (int i_135_ = 0; i_135_ < anInt2766; i_135_++) {
			int i_136_ = (class247.anIntArray2483 != null ? class247.anIntArray2483[i_135_] : 0);
			int i_137_ = i_136_;
			int i_138_ = class247.anIntArray2481[i_137_];
			aBoolArray2762[i_135_] = !aClass255Array2775[i_138_].method4583(i_135_);
			aBoolArray2826[i_135_] = aBoolArray2762[i_135_];
		}
		for (int i_139_ = 0; i_139_ < class247.anInt2482; i_139_++) {
			if (!aBoolArray2762[class247.anIntArray2488[i_139_]] || !aBoolArray2762[class247.anIntArray2485[i_139_]]) {
				aBoolArray2762[class247.anIntArray2488[i_139_]] = false;
				aBoolArray2762[class247.anIntArray2485[i_139_]] = false;
			}
		}
		if (aBoolArray2827 == null || aBoolArray2827.length != anInt2766)
			aBoolArray2827 = new boolean[anInt2766];
		for (int i_140_ = 0; i_140_ < class247.anInt2487; i_140_++) {
			int i_141_ = 0;
			for (int i_142_ = 0; i_142_ < anInt2766; i_142_++) {
				int i_143_ = (class247.anIntArray2483 != null ? class247.anIntArray2483[i_142_] : i_140_);
				if (i_143_ == i_140_)
					aBoolArray2827[i_141_++] = aBoolArray2762[i_142_];
			}
			Class235 class235 = aClass235Array2776[class247.anIntArray2486[i_140_]];
			Object object = null;
			Class243[] class243s;
			if (class235.anInt2382 == 2) {
				Class243[] class243s_144_ = method4593(1, anInt2766 * i_125_);
				for (int i_145_ = 0; i_145_ < i_125_; i_145_++) {
					for (int i_146_ = 0; i_146_ < anInt2766; i_146_++) {
						try {
							class243s_144_[0].aFloatArray2459[i_145_ * anInt2766 + i_146_] = (aClass243Array2784[i_146_].aFloatArray2459[i_145_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class243s_144_ = class235.method4282(class243s_144_, i_125_ >> 1, aBoolArray2827);
				class243s = aClass243Array2784;
				for (int i_147_ = 0; i_147_ < i_125_; i_147_++) {
					for (int i_148_ = 0; i_148_ < anInt2766; i_148_++) {
						try {
							class243s[i_148_].aFloatArray2459[i_147_] = (class243s_144_[0].aFloatArray2459[anInt2766 * i_147_ + i_148_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method4596(class243s_144_);
				Object object_149_ = null;
			} else
				class243s = class235.method4282(aClass243Array2784, i_125_ >> 1, aBoolArray2827);
			if (class247.anIntArray2483 != null) {
				i_141_ = 0;
				for (int i_150_ = 0; i_150_ < anInt2766; i_150_++) {
					int i_151_ = class247.anIntArray2483[i_150_];
					if (i_151_ == i_140_)
						aClass243Array2784[i_150_] = class243s[i_141_++];
				}
			} else {
				if (aClass243Array2784 != class243s)
					method4596(aClass243Array2784);
				aClass243Array2784 = class243s;
			}
		}
		for (int i_152_ = class247.anInt2482 - 1; i_152_ >= 0; i_152_--) {
			Class243 class243 = aClass243Array2784[class247.anIntArray2488[i_152_]];
			Class243 class243_153_ = aClass243Array2784[class247.anIntArray2485[i_152_]];
			for (int i_154_ = 0; i_154_ < class243.anInt2462; i_154_++) {
				float f = class243.aFloatArray2459[i_154_];
				float f_155_ = class243_153_.aFloatArray2459[i_154_];
				float f_156_ = f;
				float f_157_ = f_155_;
				if (f > 0.0F) {
					if (f_155_ > 0.0F) {
						f_156_ = f;
						f_157_ = f - f_155_;
					} else {
						f_157_ = f;
						f_156_ = f + f_155_;
					}
				} else if (f_155_ > 0.0F) {
					f_156_ = f;
					f_157_ = f + f_155_;
				} else {
					f_157_ = f;
					f_156_ = f - f_155_;
				}
				class243.aFloatArray2459[i_154_] = f_156_;
				class243_153_.aFloatArray2459[i_154_] = f_157_;
			}
		}
		for (int i_158_ = 0; i_158_ < aBoolArray2762.length; i_158_++)
			aBoolArray2762[i_158_] = aBoolArray2826[i_158_];
		for (int i_159_ = 0; i_159_ < anInt2766; i_159_++) {
			if (!aBoolArray2762[i_159_]) {
				int i_160_ = (class247.anIntArray2483 != null ? class247.anIntArray2483[i_159_] : 0);
				int i_161_ = i_160_;
				int i_162_ = class247.anIntArray2481[i_161_];
				aClass255Array2775[i_162_].method4560(i_159_);
				aClass255Array2775[i_162_].method4579((aClass243Array2784[i_159_]), i_125_ >> 1, i_159_);
			}
		}
		for (int i_163_ = 0; i_163_ < anInt2766; i_163_++) {
			if (aBoolArray2762[i_163_]) {
				for (int i_164_ = i_125_ >> 1; i_164_ < i_125_; i_164_++)
					aClass243Array2784[i_163_].aFloatArray2459[i_164_] = 0.0F;
			} else {
				int i_165_ = i_125_ >> 1;
				int i_166_ = i_125_ >> 2;
				int i_167_ = i_125_ >> 3;
				Class243 class243 = aClass243Array2784[i_163_];
				for (int i_168_ = 0; i_168_ < i_165_; i_168_++)
					class243.aFloatArray2459[i_168_] *= 0.5F;
				for (int i_169_ = i_165_; i_169_ < i_125_; i_169_++)
					class243.aFloatArray2459[i_169_] = -class243.aFloatArray2459[i_125_ - i_169_ - 1];
				Class243 class243_170_ = bool ? aClass243_2788 : aClass243_2780;
				Class243 class243_171_ = bool ? aClass243_2785 : aClass243_2786;
				Class243 class243_172_ = bool ? aClass243_2802 : aClass243_2787;
				int[] is_173_ = bool ? anIntArray2792 : anIntArray2791;
				for (int i_174_ = 0; i_174_ < i_166_; i_174_++) {
					float f = (class243.aFloatArray2459[4 * i_174_] - (class243.aFloatArray2459[i_125_ - 4 * i_174_ - 1]));
					float f_175_ = (class243.aFloatArray2459[4 * i_174_ + 2] - (class243.aFloatArray2459[i_125_ - 4 * i_174_ - 3]));
					float f_176_ = class243_170_.aFloatArray2459[2 * i_174_];
					float f_177_ = class243_170_.aFloatArray2459[2 * i_174_ + 1];
					class243.aFloatArray2459[i_125_ - 4 * i_174_ - 1] = f * f_176_ - f_175_ * f_177_;
					class243.aFloatArray2459[i_125_ - 4 * i_174_ - 3] = f * f_177_ + f_175_ * f_176_;
				}
				for (int i_178_ = 0; i_178_ < i_167_; i_178_++) {
					float f = class243.aFloatArray2459[i_165_ + 3 + 4 * i_178_];
					float f_179_ = class243.aFloatArray2459[i_165_ + 1 + 4 * i_178_];
					float f_180_ = class243.aFloatArray2459[4 * i_178_ + 3];
					float f_181_ = class243.aFloatArray2459[4 * i_178_ + 1];
					class243.aFloatArray2459[i_165_ + 3 + 4 * i_178_] = f + f_180_;
					class243.aFloatArray2459[i_165_ + 1 + 4 * i_178_] = f_179_ + f_181_;
					float f_182_ = (class243_170_.aFloatArray2459[i_165_ - 4 - 4 * i_178_]);
					float f_183_ = (class243_170_.aFloatArray2459[i_165_ - 3 - 4 * i_178_]);
					class243.aFloatArray2459[4 * i_178_ + 3] = (f - f_180_) * f_182_ - (f_179_ - f_181_) * f_183_;
					class243.aFloatArray2459[4 * i_178_ + 1] = (f_179_ - f_181_) * f_182_ + (f - f_180_) * f_183_;
				}
				int i_184_ = Class181.method3537(i_125_ - 1, (byte) 0);
				for (int i_185_ = 0; i_185_ < i_184_ - 3; i_185_++) {
					int i_186_ = i_125_ >> i_185_ + 2;
					int i_187_ = 8 << i_185_;
					for (int i_188_ = 0; i_188_ < 2 << i_185_; i_188_++) {
						int i_189_ = i_125_ - i_186_ * 2 * i_188_;
						int i_190_ = i_125_ - i_186_ * (2 * i_188_ + 1);
						for (int i_191_ = 0; i_191_ < i_125_ >> i_185_ + 4; i_191_++) {
							int i_192_ = 4 * i_191_;
							float f = (class243.aFloatArray2459[i_189_ - 1 - i_192_]);
							float f_193_ = (class243.aFloatArray2459[i_189_ - 3 - i_192_]);
							float f_194_ = (class243.aFloatArray2459[i_190_ - 1 - i_192_]);
							float f_195_ = (class243.aFloatArray2459[i_190_ - 3 - i_192_]);
							class243.aFloatArray2459[i_189_ - 1 - i_192_] = f + f_194_;
							class243.aFloatArray2459[i_189_ - 3 - i_192_] = f_193_ + f_195_;
							float f_196_ = (class243_170_.aFloatArray2459[i_191_ * i_187_]);
							float f_197_ = (class243_170_.aFloatArray2459[i_191_ * i_187_ + 1]);
							class243.aFloatArray2459[i_190_ - 1 - i_192_] = ((f - f_194_) * f_196_ - (f_193_ - f_195_) * f_197_);
							class243.aFloatArray2459[i_190_ - 3 - i_192_] = ((f_193_ - f_195_) * f_196_ + (f - f_194_) * f_197_);
						}
					}
				}
				for (int i_198_ = 1; i_198_ < i_167_ - 1; i_198_++) {
					int i_199_ = is_173_[i_198_];
					if (i_198_ < i_199_) {
						int i_200_ = 8 * i_198_;
						int i_201_ = 8 * i_199_;
						float f = class243.aFloatArray2459[i_200_ + 1];
						class243.aFloatArray2459[i_200_ + 1] = class243.aFloatArray2459[i_201_ + 1];
						class243.aFloatArray2459[i_201_ + 1] = f;
						f = class243.aFloatArray2459[i_200_ + 3];
						class243.aFloatArray2459[i_200_ + 3] = class243.aFloatArray2459[i_201_ + 3];
						class243.aFloatArray2459[i_201_ + 3] = f;
						f = class243.aFloatArray2459[i_200_ + 5];
						class243.aFloatArray2459[i_200_ + 5] = class243.aFloatArray2459[i_201_ + 5];
						class243.aFloatArray2459[i_201_ + 5] = f;
						f = class243.aFloatArray2459[i_200_ + 7];
						class243.aFloatArray2459[i_200_ + 7] = class243.aFloatArray2459[i_201_ + 7];
						class243.aFloatArray2459[i_201_ + 7] = f;
					}
				}
				for (int i_202_ = 0; i_202_ < i_165_; i_202_++)
					class243.aFloatArray2459[i_202_] = class243.aFloatArray2459[2 * i_202_ + 1];
				for (int i_203_ = 0; i_203_ < i_167_; i_203_++) {
					class243.aFloatArray2459[i_125_ - 1 - 2 * i_203_] = class243.aFloatArray2459[4 * i_203_];
					class243.aFloatArray2459[i_125_ - 2 - 2 * i_203_] = class243.aFloatArray2459[4 * i_203_ + 1];
					class243.aFloatArray2459[i_125_ - i_166_ - 1 - 2 * i_203_] = class243.aFloatArray2459[4 * i_203_ + 2];
					class243.aFloatArray2459[i_125_ - i_166_ - 2 - 2 * i_203_] = class243.aFloatArray2459[4 * i_203_ + 3];
				}
				for (int i_204_ = 0; i_204_ < i_167_; i_204_++) {
					float f = class243_172_.aFloatArray2459[2 * i_204_];
					float f_205_ = class243_172_.aFloatArray2459[2 * i_204_ + 1];
					float f_206_ = class243.aFloatArray2459[i_165_ + 2 * i_204_];
					float f_207_ = class243.aFloatArray2459[i_165_ + 2 * i_204_ + 1];
					float f_208_ = class243.aFloatArray2459[i_125_ - 2 - 2 * i_204_];
					float f_209_ = class243.aFloatArray2459[i_125_ - 1 - 2 * i_204_];
					float f_210_ = f_205_ * (f_206_ - f_208_) + f * (f_207_ + f_209_);
					class243.aFloatArray2459[i_165_ + 2 * i_204_] = (f_206_ + f_208_ + f_210_) * 0.5F;
					class243.aFloatArray2459[i_125_ - 2 - 2 * i_204_] = (f_206_ + f_208_ - f_210_) * 0.5F;
					f_210_ = f_205_ * (f_207_ + f_209_) - f * (f_206_ - f_208_);
					class243.aFloatArray2459[i_165_ + 2 * i_204_ + 1] = (f_207_ - f_209_ + f_210_) * 0.5F;
					class243.aFloatArray2459[i_125_ - 1 - 2 * i_204_] = (-f_207_ + f_209_ + f_210_) * 0.5F;
				}
				for (int i_211_ = 0; i_211_ < i_166_; i_211_++) {
					class243.aFloatArray2459[i_211_] = ((class243.aFloatArray2459[2 * i_211_ + i_165_] * class243_171_.aFloatArray2459[2 * i_211_]) + (class243.aFloatArray2459[2 * i_211_ + 1 + i_165_] * (class243_171_.aFloatArray2459[2 * i_211_ + 1])));
					class243.aFloatArray2459[i_165_ - 1 - i_211_] = ((class243.aFloatArray2459[2 * i_211_ + i_165_] * class243_171_.aFloatArray2459[2 * i_211_ + 1]) - (class243.aFloatArray2459[2 * i_211_ + 1 + i_165_] * class243_171_.aFloatArray2459[2 * i_211_]));
				}
				for (int i_212_ = 0; i_212_ < i_166_; i_212_++)
					class243.aFloatArray2459[i_125_ - i_166_ + i_212_] = -class243.aFloatArray2459[i_212_];
				for (int i_213_ = 0; i_213_ < i_166_; i_213_++)
					class243.aFloatArray2459[i_213_] = class243.aFloatArray2459[i_166_ + i_213_];
				for (int i_214_ = 0; i_214_ < i_166_; i_214_++)
					class243.aFloatArray2459[i_166_ + i_214_] = -class243.aFloatArray2459[i_166_ - i_214_ - 1];
				for (int i_215_ = 0; i_215_ < i_166_; i_215_++)
					class243.aFloatArray2459[i_165_ + i_215_] = class243.aFloatArray2459[i_125_ - i_215_ - 1];
				for (int i_216_ = i_129_; i_216_ < i_130_; i_216_++) {
					float f = (float) Math.sin(((double) (i_216_ - i_129_) + 0.5) / (double) i_131_ * 0.5 * 3.141592653589793);
					aClass243Array2784[i_163_].aFloatArray2459[i_216_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
				for (int i_217_ = i_132_; i_217_ < i_133_; i_217_++) {
					float f = (float) Math.sin((((double) (i_217_ - i_132_) + 0.5) / (double) i_134_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
					aClass243Array2784[i_163_].aFloatArray2459[i_217_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
			}
		}
		Class243[] class243s = null;
		if (anInt2806 > 0) {
			int i_218_ = anInt2806 + i_125_ >> 2;
			class243s = method4593(anInt2766, i_218_);
			for (int i_219_ = 0; i_219_ < anInt2766; i_219_++) {
				if (!aBoolArray2783[i_219_]) {
					for (int i_220_ = 0; i_220_ < anInt2782; i_220_++) {
						int i_221_ = (anInt2806 >> 1) + i_220_;
						class243s[i_219_].aFloatArray2459[i_220_] += (aClass243Array2793[i_219_].aFloatArray2459[i_221_]);
					}
				}
				if (!aBoolArray2762[i_219_]) {
					for (int i_222_ = i_129_; i_222_ < i_125_ >> 1; i_222_++) {
						int i_223_ = (class243s[i_219_].anInt2462 - (i_125_ >> 1) + i_222_);
						class243s[i_219_].aFloatArray2459[i_223_] += (aClass243Array2784[i_219_].aFloatArray2459[i_222_]);
					}
				}
			}
		}
		Class243[] class243s_224_ = aClass243Array2793;
		aClass243Array2793 = aClass243Array2784;
		aClass243Array2784 = class243s_224_;
		anInt2806 = i_125_;
		anInt2782 = i_133_ - (i_125_ >> 1);
		aBoolArray2783 = aBoolArray2762;
		atomicreference.set(class243s);
		return true;
	}

	void method4614() {
		if (method282() != Class372.aClass372_3901 && method282() != Class372.aClass372_3900 && (!aBool2801 || !((float) (anInt2819 / method4611()) > aFloat2825))) {
			if (!method4600()) {
				RSBuffer class523_sub34 = ((RSBuffer) (aList2764 != null && !aList2764.isEmpty() ? aList2764.get(0) : null));
				if (class523_sub34 == null) {
					if (!aBool2799) {
						method4585(Class372.aClass372_3900);
						anInterface47_2790.method347((byte) 0);
						aBool2799 = true;
					}
					return;
				}
				aBool2799 = false;
				aBool2778 = true;
				aList2764.remove(0);
				method4599(class523_sub34);
			}
			method4616();
		}
	}

	synchronized void method4615(RSBuffer class523_sub34) {
		aList2764.add(class523_sub34);
		method4585(Class372.aClass372_3898);
	}

	synchronized void method4616() {
		int i = (aClass523_Sub34_2795 != null ? aClass523_Sub34_2795.offset * 2349011 : 0);
		int i_225_ = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			i_225_ += class523_sub34.offset * 2349011;
		}
		if (aClass523_Sub34_2795 != null) {
			if ((aClass523_Sub34_2795.buffer.length - aClass523_Sub34_2795.offset * 2349011) < i_225_) {
				RSBuffer class523_sub34 = method4653(i_225_ + anInt2796);
				class523_sub34.readBytes((aClass523_Sub34_2795.buffer), (aClass523_Sub34_2795.offset * 2349011) - anInt2797, anInt2796, (short) -25338);
				aClass523_Sub34_2795.method16408(-1750259112);
				aClass523_Sub34_2795 = class523_sub34;
				i = anInt2797;
			}
		} else {
			aClass523_Sub34_2795 = method4653(i_225_);
			anInt2796 = 0;
			i = 0;
		}
		iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			aClass523_Sub34_2795.readBytes(class523_sub34.buffer, 0, (class523_sub34.offset * 2349011), (short) -11184);
			anInt2796 += class523_sub34.offset * 2349011;
			class523_sub34.method16408(-1318493237);
		}
		aClass523_Sub34_2795.offset = (i - anInt2797) * 189765723;
		anInt2797 = 0;
		aList2794.clear();
		while (aBool2778) {
			if (aClass523_Sub34_2795.offset * 2349011 >= aClass523_Sub34_2795.buffer.length) {
				aBool2778 = false;
				break;
			}
			if (aBool2801 && (float) (anInt2819 / method4611()) > aFloat2825)
				break;
			if (aClass523_Sub34_2795 == null || anInt2796 < 27) {
				if (aClass523_Sub34_2795 != null) {
					anInt2797 = anInt2796;
					aClass523_Sub34_2795.offset += anInt2796 * 189765723;
				}
				aBool2778 = false;
				break;
			}
			int i_226_ = aClass523_Sub34_2795.offset * 2349011;
			int i_227_ = 0;
			int i_228_ = 0;
			if (!method4601(aClass523_Sub34_2795))
				break;
			anInt2761++;
			if (anInt2808 < 0)
				anInt2807++;
			aList2812.clear();
			aList2813.clear();
			aClass523_Sub34_2795.readUnsignedByte(1448866088);
			int i_229_ = aClass523_Sub34_2795.readUnsignedByte(684047398);
			int i_230_ = (aClass523_Sub34_2795.readUnsignedByte(15239949) & 0xff | (aClass523_Sub34_2795.readUnsignedByte(1194675331) & 0xff) << 8 | ((aClass523_Sub34_2795.readUnsignedByte(-2104029921) & 0xff) << 16) | aClass523_Sub34_2795.readUnsignedByte(930658363) << 24);
			i_227_ = i_230_ - i_227_;
			aClass523_Sub34_2795.offset += -1258715728;
			int i_231_ = aClass523_Sub34_2795.readUnsignedByte(-539427033);
			int i_232_ = aClass523_Sub34_2795.offset * 2349011;
			int i_233_ = i_232_ + i_231_;
			if (i_233_ > i_226_ + anInt2796) {
				aClass523_Sub34_2795.offset = (i_226_ + anInt2796) * 189765723;
				anInt2797 = aClass523_Sub34_2795.offset * 2349011 - i_226_;
				aBool2778 = false;
			}
			int i_234_ = i_233_;
			int i_235_ = 0;
			if (aBool2778) {
				for (int i_236_ = 0; i_236_ < i_231_; i_236_++) {
					int i_237_ = (aClass523_Sub34_2795.buffer[i_232_++] & 0xff);
					i_233_ += i_237_;
					i_235_ += i_237_;
					if (i_233_ > i_226_ + anInt2796) {
						aClass523_Sub34_2795.offset = (i_226_ + anInt2796) * 189765723;
						anInt2797 = (aClass523_Sub34_2795.offset * 2349011 - i_226_);
						aBool2778 = false;
						break;
					}
					if (i_237_ < 255) {
						aList2812.add(Integer.valueOf(i_234_));
						aList2813.add(Integer.valueOf(i_235_));
						i_234_ = i_233_;
						i_235_ = 0;
					}
				}
			}
			if (aBool2778) {
				int i_238_ = i_233_;
				int i_239_ = -1;
				Iterator iterator_240_ = aList2812.iterator();
				Iterator iterator_241_ = aList2813.iterator();
				boolean bool = false;
				anInt2816 = 0;
				while (iterator_240_.hasNext()) {
					Integer integer = (Integer) iterator_240_.next();
					Integer integer_242_ = (Integer) iterator_241_.next();
					i_239_++;
					if (method291() && aBool2763 == true && anInt2761 < anInt2807 && i_239_ < anInt2808) {
						Class256 class256_243_ = this;
						class256_243_.anInt2759 = class256_243_.anInt2759 + (bool ? 0 : i_227_);
						bool = true;
					} else {
						anAtomicReference2814.set(null);
						boolean bool_244_ = method4613(aClass523_Sub34_2795.buffer, integer.intValue(), integer_242_.intValue(), anAtomicReference2814);
						Class243[] class243s = (Class243[]) anAtomicReference2814.get();
						if (bool_244_ && (aBool2763 != true || anInt2761 >= anInt2807 || i_239_ >= anInt2808)) {
							if (class243s != null) {
								int i_245_ = class243s[0].anInt2462;
								anInt2815 += i_245_;
								if (anInt2815 > i_230_ && i_229_ == 4) {
									anInt2816 = anInt2815 - i_230_ - anInt2816;
									i_245_ -= anInt2816;
									if (anInt2816 > class243s[0].anInt2462)
										anInt2816 = class243s[0].anInt2462;
									if (i_245_ < 0)
										i_245_ = 0;
								}
								int i_246_ = 0;
								int i_247_ = method290(i_245_) * class243s.length;
								if (aBool2763 == true && anInt2759 < anInt2769) {
									int i_248_ = i_247_;
									i_247_ -= method290(anInt2769 - anInt2759);
									if (i_247_ <= 0) {
										anInt2759 += method197(i_248_);
										method4596(class243s);
										Object object = null;
										continue;
									}
									i_246_ += anInt2769 - anInt2759;
								}
								if (anInt2759 + i_245_ > anInt2809 && (anInt2820 < anInt2765 || anInt2765 < 0) && aBool2818) {
									i_247_ -= method290(anInt2759 + i_245_ - anInt2809 - 1);
									if (i_247_ <= 0) {
										method4596(class243s);
										Object object = null;
										continue;
									}
								}
								int i_249_ = method321();
								if (method4590() < method321()) {
									int i_250_ = method321() - method4590();
									i_247_ += i_247_ / method4590() * i_250_;
								}
								RSBuffer class523_sub34 = method4653(i_247_);
								for (int i_251_ = i_246_; i_251_ < i_245_; i_251_++) {
									boolean bool_252_ = aBool2763;
									if (anInt2765 != 0) {
										if (anInt2759 == anInt2769) {
											if (anInt2779 < 0) {
												anInt2779 = anInt2805;
												anInt2808 = i_239_;
											}
											aBool2763 = false;
										}
										if (anInt2759 == anInt2809 && anInt2804 < 0)
											anInt2804 = anInt2805;
										if (anInt2759 > anInt2809 && (anInt2820 < anInt2765 || anInt2765 < 0) && aBool2818)
											bool_252_ = true;
									}
									if (bool_252_ && (anInt2759 < anInt2769 || anInt2759 > anInt2809)) {
										anInt2759++;
										if (++i_228_ > i_227_)
											throw new RuntimeException();
									} else {
										for (int i_253_ = 0; i_253_ < i_249_; i_253_++) {
											float f;
											if (i_253_ < class243s.length)
												f = (class243s[i_253_].aFloatArray2459[i_251_]);
											else
												f = (class243s[i_253_ % method4590()].aFloatArray2459[i_251_]);
											if (aClass393_2789 == Class393.aClass393_4038) {
												int i_254_ = method4617(f);
												if (aClass365_2767 == Class365.aClass365_3864)
													class523_sub34.method16262(i_254_, -1357241371);
												else
													class523_sub34.writeShort(i_254_, (byte) -120);
											} else if (aClass393_2789 == (Class393.aClass393_4042)) {
												int i_255_ = method4618(f);
												if (aClass365_2767 == Class365.aClass365_3864)
													class523_sub34.method16262(i_255_, -1361226866);
												else
													class523_sub34.writeShort(i_255_, (byte) -17);
											} else if (aClass393_2789 == (Class393.aClass393_4040)) {
												int i_256_ = method4619(f);
												class523_sub34.writeByte(i_256_, 1357018539);
											} else if (aClass393_2789 == (Class393.aClass393_4039)) {
												int i_257_ = method4627(f);
												class523_sub34.writeByte(i_257_, -961933862);
											}
										}
										anInt2759++;
										i_228_++;
									}
								}
								synchronized (aList2798) {
									anInt2819 += method197(class523_sub34.offset * 2349011) / method321();
									aList2798.add(class523_sub34);
								}
							}
						} else if (method291()) {
							anInt2806 = 0;
							if (aClass243Array2793 == null || (aClass243Array2793 != null && (aClass243Array2793.length != anInt2766 || (aClass243Array2793[0].anInt2462 != anInt2773)))) {
								if (aClass243Array2793 != null)
									method4596(aClass243Array2793);
								aClass243Array2793 = method4593(anInt2766, anInt2773);
							}
						}
						method4596(class243s);
						Object object = null;
					}
				}
				aClass523_Sub34_2795.offset = i_238_ * 189765723;
				anInt2796 -= i_238_ - i_226_;
			}
		}
	}

	int method4617(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	int method4618(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	int method4619(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	void method4620(RSBuffer class523_sub34) {
		aList2794.add(class523_sub34);
	}

	RSBuffer method4621(int i) {
		RSBuffer class523_sub34 = method4653(method290(i));
		int i_258_ = i;
		synchronized (aList2798) {
			while (!aList2798.isEmpty()) {
				RSBuffer class523_sub34_259_ = (RSBuffer) aList2798.remove(0);
				anInt2819 -= (method197(class523_sub34_259_.offset * 2349011) / method321());
				int i_260_ = method290(i_258_);
				int i_261_ = (class523_sub34_259_.offset * 2349011 < i_260_ ? class523_sub34_259_.offset * 2349011 : i_260_);
				class523_sub34.readBytes(class523_sub34_259_.buffer, 0, i_261_, (short) -25307);
				i_258_ -= method197(i_261_);
				int i_262_ = class523_sub34_259_.offset * 2349011 - i_261_;
				if (i_262_ != 0) {
					System.arraycopy(class523_sub34_259_.buffer, i_261_, class523_sub34_259_.buffer, 0, i_262_);
					class523_sub34_259_.offset = i_262_ * 189765723;
					anInt2819 += method197(i_262_) / method321();
					aList2798.add(0, class523_sub34_259_);
				} else
					class523_sub34_259_.method16408(-1324084147);
				if (i_258_ <= 0)
					break;
			}
			if (aList2798.isEmpty() && method282() == Class372.aClass372_3902)
				method4585(Class372.aClass372_3903);
		}
		return class523_sub34;
	}

	synchronized void method4622(boolean bool) {
		if (!bool) {
			anInt2772 = 0;
			anInt2773 = 0;
			aBoolArray2771 = null;
			anIntArray2803 = null;
			method4596(aClass243Array2817);
			aClass243Array2817 = null;
			method4596(aClass243Array2793);
			aClass243Array2793 = null;
			anInt2806 = 0;
			anInt2782 = 0;
			aBoolArray2783 = null;
			method4596(aClass243Array2784);
			aClass243Array2784 = null;
			method4595(aClass243_2780);
			method4595(aClass243_2786);
			method4595(aClass243_2787);
			method4595(aClass243_2788);
			method4595(aClass243_2785);
			method4595(aClass243_2802);
			aClass243_2780 = null;
			aClass243_2786 = null;
			aClass243_2787 = null;
			aClass243_2788 = null;
			aClass243_2785 = null;
			aClass243_2802 = null;
			anIntArray2791 = null;
			anIntArray2792 = null;
		}
		anInt2815 = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			class523_sub34.method16408(-1794587820);
		}
		aList2794.clear();
		aBool2778 = false;
		if (aClass523_Sub34_2795 != null) {
			synchronized (aClass523_Sub34_2795) {
				aClass523_Sub34_2795.method16408(-1376741342);
				aClass523_Sub34_2795 = null;
			}
		}
		anInt2796 = 0;
		anInt2797 = 0;
		if (!bool) {
			synchronized (aList2798) {
				Iterator iterator_263_ = aList2798.iterator();
				while (iterator_263_.hasNext()) {
					RSBuffer class523_sub34 = (RSBuffer) iterator_263_.next();
					class523_sub34.method16408(-1198156110);
				}
				aList2798.clear();
			}
			anInt2819 = 0;
		}
		synchronized (aList2764) {
			Iterator iterator_264_ = aList2764.iterator();
			while (iterator_264_.hasNext()) {
				RSBuffer class523_sub34 = (RSBuffer) iterator_264_.next();
				class523_sub34.method16408(-1193095570);
			}
			aList2764.clear();
		}
		aBool2799 = false;
		anInt2759 = 0;
		anInt2805 = -1;
		anInt2761 = -1;
		if (!bool) {
			method4592(false);
			aBool2770 = false;
			anInt2769 = -1;
			anInt2809 = -1;
			anInt2765 = 0;
			anInt2820 = 0;
			anInt2779 = -1;
			anInt2804 = -1;
			anInt2807 = -1;
			anInt2808 = -1;
			aBool2763 = false;
			aBool2818 = false;
		} else {
			anInt2820++;
			aBool2763 = true;
		}
	}

	int method4623() {
		return anInt2819;
	}

	public void method293(boolean bool, int i, int i_265_, int i_266_) {
		aBool2818 = bool;
		anInt2765 = i;
		anInt2769 = i_265_;
		anInt2809 = i_266_;
	}

	boolean method4624(byte[] is, int i, int i_267_) {
		if (is[i] != i_267_)
			return false;
		if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114 || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
			return false;
		return true;
	}

	public void method295(boolean bool) {
		if (!bool)
			method292();
		else if (method282() == Class372.aClass372_3903) {
			method4622(true);
			method4585(Class372.aClass372_3898);
		}
	}

	public void method296(boolean bool) {
		if (!bool)
			method292();
		else if (method282() == Class372.aClass372_3903) {
			method4622(true);
			method4585(Class372.aClass372_3898);
		}
	}

	public void method297() {
		if (method282() != Class372.aClass372_3899) {
			method4622(false);
			method4585(Class372.aClass372_3897);
		} else {
			method4622(false);
			method4585(Class372.aClass372_3901);
		}
	}

	public synchronized boolean method281() {
		return aBool2801;
	}

	public Class372 method327() {
		return aClass372_2810;
	}

	public Class372 method300() {
		return aClass372_2810;
	}

	public Class372 method301() {
		return aClass372_2810;
	}

	void method4625(Class372 class372) {
		aClass372_2810 = class372;
	}

	void method4626(Class372 class372) {
		aClass372_2810 = class372;
	}

	public void method322() {
		if (method282() == Class372.aClass372_3901 || method282() == Class372.aClass372_3897 || method282() == Class372.aClass372_3898) {
			method4585(Class372.aClass372_3899);
			method4610();
		}
	}

	public RSBuffer method303(int i) {
		RSBuffer class523_sub34 = method4621(i);
		return class523_sub34;
	}

	public Class365 method316() {
		return aClass365_2767;
	}

	public int method308() {
		return method4623();
	}

	public int method306(int i) {
		return i / (method285().anInt4043 * 1552171027 / 8);
	}

	public int method313(int i) {
		return i / (method285().anInt4043 * 1552171027 / 8);
	}

	public int method284(int i) {
		return i / (method285().anInt4043 * 1552171027 / 8);
	}

	public int method309(int i) {
		return i / (method285().anInt4043 * 1552171027 / 8);
	}

	int method4627(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255)
			return 255;
		if (i < 0)
			return 0;
		return i;
	}

	public int method307(int i) {
		return i * (method285().anInt4043 * 1552171027 / 8);
	}

	public synchronized boolean method305() {
		return aBool2801;
	}

	Class243[] method4628(int i, int i_268_) {
		Class243[] class243s = new Class243[i];
		for (int i_269_ = 0; i_269_ < class243s.length; i_269_++)
			class243s[i_269_] = method4594(i_268_);
		return class243s;
	}

	int method4629() {
		if (method291())
			return anInt2811;
		throw new RuntimeException("");
	}

	void method4630() {
		int i = method4608(8) + 1;
		Iterator iterator = aList2800.iterator();
		while (iterator.hasNext()) {
			Class258 class258 = (Class258) iterator.next();
			if (class258.anInt2831 == 0 && class258.anInt2832 == 0) {
				if (class258.aClass249Array2830.length == i && class258.anInt2829 == anInt2766 && class258.anInt2834 == anInt2811 && class258.anInt2833 == anInt2781) {
					aClass249Array2774 = class258.aClass249Array2830;
					for (int i_270_ = 0; i_270_ < aClass249Array2774.length; i_270_++)
						aClass249Array2774[i_270_].method4408(this);
					return;
				}
			}
		}
		aClass249Array2774 = new Class249[i];
		for (int i_271_ = 0; i_271_ < i; i_271_++) {
			if (aClass249Array2774[i_271_] == null)
				aClass249Array2774[i_271_] = new Class249();
			aClass249Array2774[i_271_].method4412(this);
		}
		Class258 class258 = new Class258(anInt2766, anInt2811, anInt2760, anInt2824, anInt2781, aClass249Array2774);
		aList2800.add(class258);
	}

	public Class393 method302() {
		return aClass393_2789;
	}

	public void method311(Interface47 interface47) {
		anInterface47_2790 = interface47;
	}

	void method4631() {
		if (method282() != Class372.aClass372_3902) {
			method4614();
			if (method282() == Class372.aClass372_3899)
				method4585(Class372.aClass372_3898);
		}
	}

	RSBuffer method4632(int i) {
		RSBuffer class523_sub34 = method4653(method290(i));
		int i_272_ = i;
		synchronized (aList2798) {
			while (!aList2798.isEmpty()) {
				RSBuffer class523_sub34_273_ = (RSBuffer) aList2798.remove(0);
				anInt2819 -= (method197(class523_sub34_273_.offset * 2349011) / method321());
				int i_274_ = method290(i_272_);
				int i_275_ = (class523_sub34_273_.offset * 2349011 < i_274_ ? class523_sub34_273_.offset * 2349011 : i_274_);
				class523_sub34.readBytes(class523_sub34_273_.buffer, 0, i_275_, (short) -25409);
				i_272_ -= method197(i_275_);
				int i_276_ = class523_sub34_273_.offset * 2349011 - i_275_;
				if (i_276_ != 0) {
					System.arraycopy(class523_sub34_273_.buffer, i_275_, class523_sub34_273_.buffer, 0, i_276_);
					class523_sub34_273_.offset = i_276_ * 189765723;
					anInt2819 += method197(i_276_) / method321();
					aList2798.add(0, class523_sub34_273_);
				} else
					class523_sub34_273_.method16408(-1955715554);
				if (i_272_ <= 0)
					break;
			}
			if (aList2798.isEmpty() && method282() == Class372.aClass372_3902)
				method4585(Class372.aClass372_3903);
		}
		return class523_sub34;
	}

	public void method299(int i, Class393 class393, Class365 class365, int i_277_) {
		anInt2768 = i_277_;
		if (method4589(i, class393, class365)) {
			aClass393_2789 = class393;
			aClass365_2767 = class365;
		} else
			throw new RuntimeException("");
	}

	public void method288(int i, Class393 class393, Class365 class365, int i_278_) {
		anInt2768 = i_278_;
		if (method4589(i, class393, class365)) {
			aClass393_2789 = class393;
			aClass365_2767 = class365;
		} else
			throw new RuntimeException("");
	}

	public void method294(boolean bool) {
		if (!bool)
			method292();
		else if (method282() == Class372.aClass372_3903) {
			method4622(true);
			method4585(Class372.aClass372_3898);
		}
	}

	boolean method4633(int i, Class393 class393, Class365 class365) {
		if (class393 == Class393.aClass393_4038)
			return true;
		if (class393 == Class393.aClass393_4040)
			return true;
		if (class393 == Class393.aClass393_4042)
			return true;
		if (class393 == Class393.aClass393_4039)
			return true;
		return false;
	}

	int method4634() {
		if (aBool2770)
			return anInt2766;
		throw new RuntimeException("");
	}

	float method4635(int i) {
		int i_279_ = i & 0x1fffff;
		int i_280_ = i & ~0x7fffffff;
		int i_281_ = (i & 0x7fe00000) >> 21;
		if (i_280_ != 0)
			i_279_ = -i_279_;
		return (float) ((double) i_279_ * Math.pow(2.0, (double) (i_281_ - 788)));
	}

	int method4636() {
		if (aBool2770)
			return anInt2766;
		throw new RuntimeException("");
	}

	void method4637(Class243 class243) {
		if (class243 != null) {
			synchronized (aClass209_2821) {
				class243.aBool2461 = false;
			}
		}
	}

	public int method325() {
		if (aBool2770)
			return method4590() < anInt2768 ? anInt2768 : method4590();
		throw new RuntimeException("");
	}

	public int method320() {
		if (aBool2770)
			return method4590() < anInt2768 ? anInt2768 : method4590();
		throw new RuntimeException("");
	}

	void method4638() {
		if (method282() != Class372.aClass372_3902) {
			method4614();
			if (method282() == Class372.aClass372_3899)
				method4585(Class372.aClass372_3898);
		}
	}

	public void method283(Interface47 interface47) {
		anInterface47_2790 = interface47;
	}

	public synchronized boolean method287() {
		return aBool2801;
	}

	synchronized void method4639(boolean bool) {
		aBool2801 = bool;
	}

	synchronized void method4640(boolean bool) {
		aBool2801 = bool;
	}

	boolean method4641(int i, Class393 class393, Class365 class365) {
		if (class393 == Class393.aClass393_4038)
			return true;
		if (class393 == Class393.aClass393_4040)
			return true;
		if (class393 == Class393.aClass393_4042)
			return true;
		if (class393 == Class393.aClass393_4039)
			return true;
		return false;
	}

	int method4642() {
		int i = aByteArray2822[anInt2823] >> anInt2758 & 0x1;
		anInt2758++;
		anInt2823 += anInt2758 >> 3;
		anInt2758 &= 0x7;
		return i;
	}

	Class243 method4643(int i) {
		synchronized (aClass209_2821) {
			Object object = null;
			Class243 class243 = (Class243) aClass209_2821.method3777(809863981);
			Class243 class243_282_ = null;
			int i_283_ = i;
			for (/**/; class243 != null; class243 = (Class243) aClass209_2821.method3795((byte) 0)) {
				if (class243.aFloatArray2459.length > i && !class243.aBool2461 && (class243_282_ == null || class243.aFloatArray2459.length < i_283_)) {
					class243_282_ = class243;
					i_283_ = class243_282_.aFloatArray2459.length;
				}
				if (class243.aFloatArray2459.length == i && !class243.aBool2461)
					break;
			}
			if (class243 == null)
				class243 = class243_282_;
			if (class243 == null) {
				class243 = new Class243(this);
				int i_284_ = 0;
				boolean bool = false;
				while (!bool && i_284_ < 1000) {
					if (aClass209_2821.method3767((long) i_284_) != null)
						i_284_++;
					else
						bool = true;
				}
				class243.anInt2460 = i_284_;
				float[] fs = new float[i];
				class243.aFloatArray2459 = fs;
				class243.aBool2461 = true;
				class243.anInt2462 = i;
				if (aClass209_2821.method3780(30105747) >= i * 4) {
					/* empty */
				}
				aClass209_2821.method3764(class243, (long) class243.anInt2460, fs.length * 4, 2094890382);
			} else {
				for (int i_285_ = 0; i_285_ < class243.aFloatArray2459.length; i_285_++)
					class243.aFloatArray2459[i_285_] = 0.0F;
				class243.anInt2462 = i;
			}
			class243.aBool2461 = true;
			Class243 class243_286_ = class243;
			return class243_286_;
		}
	}

	Class243 method4644(int i) {
		synchronized (aClass209_2821) {
			Object object = null;
			Class243 class243 = (Class243) aClass209_2821.method3777(809863981);
			Class243 class243_287_ = null;
			int i_288_ = i;
			for (/**/; class243 != null; class243 = (Class243) aClass209_2821.method3795((byte) 0)) {
				if (class243.aFloatArray2459.length > i && !class243.aBool2461 && (class243_287_ == null || class243.aFloatArray2459.length < i_288_)) {
					class243_287_ = class243;
					i_288_ = class243_287_.aFloatArray2459.length;
				}
				if (class243.aFloatArray2459.length == i && !class243.aBool2461)
					break;
			}
			if (class243 == null)
				class243 = class243_287_;
			if (class243 == null) {
				class243 = new Class243(this);
				int i_289_ = 0;
				boolean bool = false;
				while (!bool && i_289_ < 1000) {
					if (aClass209_2821.method3767((long) i_289_) != null)
						i_289_++;
					else
						bool = true;
				}
				class243.anInt2460 = i_289_;
				float[] fs = new float[i];
				class243.aFloatArray2459 = fs;
				class243.aBool2461 = true;
				class243.anInt2462 = i;
				if (aClass209_2821.method3780(30105747) >= i * 4) {
					/* empty */
				}
				aClass209_2821.method3764(class243, (long) class243.anInt2460, fs.length * 4, 64960878);
			} else {
				for (int i_290_ = 0; i_290_ < class243.aFloatArray2459.length; i_290_++)
					class243.aFloatArray2459[i_290_] = 0.0F;
				class243.anInt2462 = i;
			}
			class243.aBool2461 = true;
			Class243 class243_291_ = class243;
			return class243_291_;
		}
	}

	Class243 method4645(int i) {
		synchronized (aClass209_2821) {
			Object object = null;
			Class243 class243 = (Class243) aClass209_2821.method3777(809863981);
			Class243 class243_292_ = null;
			int i_293_ = i;
			for (/**/; class243 != null; class243 = (Class243) aClass209_2821.method3795((byte) 0)) {
				if (class243.aFloatArray2459.length > i && !class243.aBool2461 && (class243_292_ == null || class243.aFloatArray2459.length < i_293_)) {
					class243_292_ = class243;
					i_293_ = class243_292_.aFloatArray2459.length;
				}
				if (class243.aFloatArray2459.length == i && !class243.aBool2461)
					break;
			}
			if (class243 == null)
				class243 = class243_292_;
			if (class243 == null) {
				class243 = new Class243(this);
				int i_294_ = 0;
				boolean bool = false;
				while (!bool && i_294_ < 1000) {
					if (aClass209_2821.method3767((long) i_294_) != null)
						i_294_++;
					else
						bool = true;
				}
				class243.anInt2460 = i_294_;
				float[] fs = new float[i];
				class243.aFloatArray2459 = fs;
				class243.aBool2461 = true;
				class243.anInt2462 = i;
				if (aClass209_2821.method3780(30105747) >= i * 4) {
					/* empty */
				}
				aClass209_2821.method3764(class243, (long) class243.anInt2460, fs.length * 4, 917862492);
			} else {
				for (int i_295_ = 0; i_295_ < class243.aFloatArray2459.length; i_295_++)
					class243.aFloatArray2459[i_295_] = 0.0F;
				class243.anInt2462 = i;
			}
			class243.aBool2461 = true;
			Class243 class243_296_ = class243;
			return class243_296_;
		}
	}

	void method4646(byte[] is, int i) {
		aByteArray2822 = is;
		anInt2823 = i;
		anInt2758 = 0;
	}

	int method4647() {
		if (method291())
			return anInt2811;
		throw new RuntimeException("");
	}

	public void method298() {
		if (method282() != Class372.aClass372_3899) {
			method4622(false);
			method4585(Class372.aClass372_3897);
		} else {
			method4622(false);
			method4585(Class372.aClass372_3901);
		}
	}

	public int method197(int i) {
		return i / (method285().anInt4043 * 1552171027 / 8);
	}

	public Class365 method314() {
		return aClass365_2767;
	}

	void method4648(RSBuffer class523_sub34) {
		aList2794.add(class523_sub34);
	}

	int method4649(int i) {
		int i_297_ = 0;
		int i_298_ = 0;
		int i_299_;
		for (/**/; i >= 8 - anInt2758; i -= i_299_) {
			i_299_ = 8 - anInt2758;
			int i_300_ = (1 << i_299_) - 1;
			i_297_ += (aByteArray2822[anInt2823] >> anInt2758 & i_300_) << i_298_;
			anInt2758 = 0;
			anInt2823++;
			i_298_ += i_299_;
		}
		if (i > 0) {
			i_299_ = (1 << i) - 1;
			i_297_ += (aByteArray2822[anInt2823] >> anInt2758 & i_299_) << i_298_;
			anInt2758 += i;
		}
		return i_297_;
	}

	void method4650(RSBuffer class523_sub34) {
		aList2794.add(class523_sub34);
	}

	void method4651(RSBuffer class523_sub34) {
		aList2794.add(class523_sub34);
	}

	public int method312(int i) {
		return i * (method285().anInt4043 * 1552171027 / 8);
	}

	public void method317(int i, Class393 class393, Class365 class365, int i_301_) {
		anInt2768 = i_301_;
		if (method4589(i, class393, class365)) {
			aClass393_2789 = class393;
			aClass365_2767 = class365;
		} else
			throw new RuntimeException("");
	}

	boolean method4652(byte[] is, int i, int i_302_) {
		if (is[i] != i_302_)
			return false;
		if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114 || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
			return false;
		return true;
	}

	RSBuffer method4653(int i) {
		return new RSBuffer(i, true);
	}

	int method4654() {
		return anInt2823;
	}

	public Class256(float f) {
		aList2794 = new ArrayList();
		aClass523_Sub34_2795 = null;
		anInt2796 = 0;
		anInt2797 = 0;
		aList2798 = new ArrayList();
		aList2812 = new ArrayList();
		aList2813 = new ArrayList();
		anAtomicReference2814 = new AtomicReference(null);
		anInt2816 = 0;
		aBool2818 = false;
		anInt2819 = 0;
		aBoolArray2762 = null;
		aBoolArray2826 = null;
		aBoolArray2827 = null;
		aFloat2825 = f;
		aClass393_2789 = Class393.aClass393_4038;
		aClass365_2767 = Class365.aClass365_3864;
		method4622(false);
	}

	int method4655() {
		return anInt2758;
	}

	void method4656(byte[] is, int i) {
		aByteArray2822 = is;
		anInt2823 = i;
		anInt2758 = 0;
	}

	public int method304() {
		return method4623();
	}

	RSBuffer method4657(int i) {
		RSBuffer class523_sub34 = method4653(method290(i));
		int i_303_ = i;
		synchronized (aList2798) {
			while (!aList2798.isEmpty()) {
				RSBuffer class523_sub34_304_ = (RSBuffer) aList2798.remove(0);
				anInt2819 -= (method197(class523_sub34_304_.offset * 2349011) / method321());
				int i_305_ = method290(i_303_);
				int i_306_ = (class523_sub34_304_.offset * 2349011 < i_305_ ? class523_sub34_304_.offset * 2349011 : i_305_);
				class523_sub34.readBytes(class523_sub34_304_.buffer, 0, i_306_, (short) -19968);
				i_303_ -= method197(i_306_);
				int i_307_ = class523_sub34_304_.offset * 2349011 - i_306_;
				if (i_307_ != 0) {
					System.arraycopy(class523_sub34_304_.buffer, i_306_, class523_sub34_304_.buffer, 0, i_307_);
					class523_sub34_304_.offset = i_307_ * 189765723;
					anInt2819 += method197(i_307_) / method321();
					aList2798.add(0, class523_sub34_304_);
				} else
					class523_sub34_304_.method16408(-1551773379);
				if (i_303_ <= 0)
					break;
			}
			if (aList2798.isEmpty() && method282() == Class372.aClass372_3902)
				method4585(Class372.aClass372_3903);
		}
		return class523_sub34;
	}

	int method4658() {
		int i = aByteArray2822[anInt2823] >> anInt2758 & 0x1;
		anInt2758++;
		anInt2823 += anInt2758 >> 3;
		anInt2758 &= 0x7;
		return i;
	}

	public Class393 method323() {
		return aClass393_2789;
	}

	synchronized void method4659() {
		int i = (aClass523_Sub34_2795 != null ? aClass523_Sub34_2795.offset * 2349011 : 0);
		int i_308_ = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			i_308_ += class523_sub34.offset * 2349011;
		}
		if (aClass523_Sub34_2795 != null) {
			if ((aClass523_Sub34_2795.buffer.length - aClass523_Sub34_2795.offset * 2349011) < i_308_) {
				RSBuffer class523_sub34 = method4653(i_308_ + anInt2796);
				class523_sub34.readBytes((aClass523_Sub34_2795.buffer), (aClass523_Sub34_2795.offset * 2349011) - anInt2797, anInt2796, (short) -19005);
				aClass523_Sub34_2795.method16408(-1771095305);
				aClass523_Sub34_2795 = class523_sub34;
				i = anInt2797;
			}
		} else {
			aClass523_Sub34_2795 = method4653(i_308_);
			anInt2796 = 0;
			i = 0;
		}
		iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			aClass523_Sub34_2795.readBytes(class523_sub34.buffer, 0, (class523_sub34.offset * 2349011), (short) -15875);
			anInt2796 += class523_sub34.offset * 2349011;
			class523_sub34.method16408(-1154677527);
		}
		aClass523_Sub34_2795.offset = (i - anInt2797) * 189765723;
		anInt2797 = 0;
		aList2794.clear();
		while (aBool2778) {
			if (aClass523_Sub34_2795.offset * 2349011 >= aClass523_Sub34_2795.buffer.length) {
				aBool2778 = false;
				break;
			}
			if (aBool2801 && (float) (anInt2819 / method4611()) > aFloat2825)
				break;
			if (aClass523_Sub34_2795 == null || anInt2796 < 27) {
				if (aClass523_Sub34_2795 != null) {
					anInt2797 = anInt2796;
					aClass523_Sub34_2795.offset += anInt2796 * 189765723;
				}
				aBool2778 = false;
				break;
			}
			int i_309_ = aClass523_Sub34_2795.offset * 2349011;
			int i_310_ = 0;
			int i_311_ = 0;
			if (!method4601(aClass523_Sub34_2795))
				break;
			anInt2761++;
			if (anInt2808 < 0)
				anInt2807++;
			aList2812.clear();
			aList2813.clear();
			aClass523_Sub34_2795.readUnsignedByte(-1503461680);
			int i_312_ = aClass523_Sub34_2795.readUnsignedByte(490448590);
			int i_313_ = (aClass523_Sub34_2795.readUnsignedByte(1860487163) & 0xff | (aClass523_Sub34_2795.readUnsignedByte(-1741163616) & 0xff) << 8 | (aClass523_Sub34_2795.readUnsignedByte(-287359457) & 0xff) << 16 | aClass523_Sub34_2795.readUnsignedByte(821540770) << 24);
			i_310_ = i_313_ - i_310_;
			aClass523_Sub34_2795.offset += -1258715728;
			int i_314_ = aClass523_Sub34_2795.readUnsignedByte(790320268);
			int i_315_ = aClass523_Sub34_2795.offset * 2349011;
			int i_316_ = i_315_ + i_314_;
			if (i_316_ > i_309_ + anInt2796) {
				aClass523_Sub34_2795.offset = (i_309_ + anInt2796) * 189765723;
				anInt2797 = aClass523_Sub34_2795.offset * 2349011 - i_309_;
				aBool2778 = false;
			}
			int i_317_ = i_316_;
			int i_318_ = 0;
			if (aBool2778) {
				for (int i_319_ = 0; i_319_ < i_314_; i_319_++) {
					int i_320_ = (aClass523_Sub34_2795.buffer[i_315_++] & 0xff);
					i_316_ += i_320_;
					i_318_ += i_320_;
					if (i_316_ > i_309_ + anInt2796) {
						aClass523_Sub34_2795.offset = (i_309_ + anInt2796) * 189765723;
						anInt2797 = (aClass523_Sub34_2795.offset * 2349011 - i_309_);
						aBool2778 = false;
						break;
					}
					if (i_320_ < 255) {
						aList2812.add(Integer.valueOf(i_317_));
						aList2813.add(Integer.valueOf(i_318_));
						i_317_ = i_316_;
						i_318_ = 0;
					}
				}
			}
			if (aBool2778) {
				int i_321_ = i_316_;
				int i_322_ = -1;
				Iterator iterator_323_ = aList2812.iterator();
				Iterator iterator_324_ = aList2813.iterator();
				boolean bool = false;
				anInt2816 = 0;
				while (iterator_323_.hasNext()) {
					Integer integer = (Integer) iterator_323_.next();
					Integer integer_325_ = (Integer) iterator_324_.next();
					i_322_++;
					if (method291() && aBool2763 == true && anInt2761 < anInt2807 && i_322_ < anInt2808) {
						Class256 class256_326_ = this;
						class256_326_.anInt2759 = class256_326_.anInt2759 + (bool ? 0 : i_310_);
						bool = true;
					} else {
						anAtomicReference2814.set(null);
						boolean bool_327_ = method4613(aClass523_Sub34_2795.buffer, integer.intValue(), integer_325_.intValue(), anAtomicReference2814);
						Class243[] class243s = (Class243[]) anAtomicReference2814.get();
						if (bool_327_ && (aBool2763 != true || anInt2761 >= anInt2807 || i_322_ >= anInt2808)) {
							if (class243s != null) {
								int i_328_ = class243s[0].anInt2462;
								anInt2815 += i_328_;
								if (anInt2815 > i_313_ && i_312_ == 4) {
									anInt2816 = anInt2815 - i_313_ - anInt2816;
									i_328_ -= anInt2816;
									if (anInt2816 > class243s[0].anInt2462)
										anInt2816 = class243s[0].anInt2462;
									if (i_328_ < 0)
										i_328_ = 0;
								}
								int i_329_ = 0;
								int i_330_ = method290(i_328_) * class243s.length;
								if (aBool2763 == true && anInt2759 < anInt2769) {
									int i_331_ = i_330_;
									i_330_ -= method290(anInt2769 - anInt2759);
									if (i_330_ <= 0) {
										anInt2759 += method197(i_331_);
										method4596(class243s);
										Object object = null;
										continue;
									}
									i_329_ += anInt2769 - anInt2759;
								}
								if (anInt2759 + i_328_ > anInt2809 && (anInt2820 < anInt2765 || anInt2765 < 0) && aBool2818) {
									i_330_ -= method290(anInt2759 + i_328_ - anInt2809 - 1);
									if (i_330_ <= 0) {
										method4596(class243s);
										Object object = null;
										continue;
									}
								}
								int i_332_ = method321();
								if (method4590() < method321()) {
									int i_333_ = method321() - method4590();
									i_330_ += i_330_ / method4590() * i_333_;
								}
								RSBuffer class523_sub34 = method4653(i_330_);
								for (int i_334_ = i_329_; i_334_ < i_328_; i_334_++) {
									boolean bool_335_ = aBool2763;
									if (anInt2765 != 0) {
										if (anInt2759 == anInt2769) {
											if (anInt2779 < 0) {
												anInt2779 = anInt2805;
												anInt2808 = i_322_;
											}
											aBool2763 = false;
										}
										if (anInt2759 == anInt2809 && anInt2804 < 0)
											anInt2804 = anInt2805;
										if (anInt2759 > anInt2809 && (anInt2820 < anInt2765 || anInt2765 < 0) && aBool2818)
											bool_335_ = true;
									}
									if (bool_335_ && (anInt2759 < anInt2769 || anInt2759 > anInt2809)) {
										anInt2759++;
										if (++i_311_ > i_310_)
											throw new RuntimeException();
									} else {
										for (int i_336_ = 0; i_336_ < i_332_; i_336_++) {
											float f;
											if (i_336_ < class243s.length)
												f = (class243s[i_336_].aFloatArray2459[i_334_]);
											else
												f = (class243s[i_336_ % method4590()].aFloatArray2459[i_334_]);
											if (aClass393_2789 == Class393.aClass393_4038) {
												int i_337_ = method4617(f);
												if (aClass365_2767 == Class365.aClass365_3864)
													class523_sub34.method16262(i_337_, -1050574120);
												else
													class523_sub34.writeShort(i_337_, (byte) -127);
											} else if (aClass393_2789 == (Class393.aClass393_4042)) {
												int i_338_ = method4618(f);
												if (aClass365_2767 == Class365.aClass365_3864)
													class523_sub34.method16262(i_338_, -573187626);
												else
													class523_sub34.writeShort(i_338_, (byte) -17);
											} else if (aClass393_2789 == (Class393.aClass393_4040)) {
												int i_339_ = method4619(f);
												class523_sub34.writeByte(i_339_, -683950905);
											} else if (aClass393_2789 == (Class393.aClass393_4039)) {
												int i_340_ = method4627(f);
												class523_sub34.writeByte(i_340_, 1486091125);
											}
										}
										anInt2759++;
										i_311_++;
									}
								}
								synchronized (aList2798) {
									anInt2819 += method197(class523_sub34.offset * 2349011) / method321();
									aList2798.add(class523_sub34);
								}
							}
						} else if (method291()) {
							anInt2806 = 0;
							if (aClass243Array2793 == null || (aClass243Array2793 != null && (aClass243Array2793.length != anInt2766 || (aClass243Array2793[0].anInt2462 != anInt2773)))) {
								if (aClass243Array2793 != null)
									method4596(aClass243Array2793);
								aClass243Array2793 = method4593(anInt2766, anInt2773);
							}
						}
						method4596(class243s);
						Object object = null;
					}
				}
				aClass523_Sub34_2795.offset = i_321_ * 189765723;
				anInt2796 -= i_321_ - i_309_;
			}
		}
	}

	int method4660(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	int method4661(int i) {
		int i_341_ = 0;
		int i_342_ = 0;
		int i_343_;
		for (/**/; i >= 8 - anInt2758; i -= i_343_) {
			i_343_ = 8 - anInt2758;
			int i_344_ = (1 << i_343_) - 1;
			i_341_ += (aByteArray2822[anInt2823] >> anInt2758 & i_344_) << i_342_;
			anInt2758 = 0;
			anInt2823++;
			i_342_ += i_343_;
		}
		if (i > 0) {
			i_343_ = (1 << i) - 1;
			i_341_ += (aByteArray2822[anInt2823] >> anInt2758 & i_343_) << i_342_;
			anInt2758 += i;
		}
		return i_341_;
	}

	Class243[] method4662(int i, int i_345_) {
		Class243[] class243s = new Class243[i];
		for (int i_346_ = 0; i_346_ < class243s.length; i_346_++)
			class243s[i_346_] = method4594(i_345_);
		return class243s;
	}

	void method4663() {
		aByteArray2822 = null;
	}

	synchronized void method4664(boolean bool) {
		if (!bool) {
			anInt2772 = 0;
			anInt2773 = 0;
			aBoolArray2771 = null;
			anIntArray2803 = null;
			method4596(aClass243Array2817);
			aClass243Array2817 = null;
			method4596(aClass243Array2793);
			aClass243Array2793 = null;
			anInt2806 = 0;
			anInt2782 = 0;
			aBoolArray2783 = null;
			method4596(aClass243Array2784);
			aClass243Array2784 = null;
			method4595(aClass243_2780);
			method4595(aClass243_2786);
			method4595(aClass243_2787);
			method4595(aClass243_2788);
			method4595(aClass243_2785);
			method4595(aClass243_2802);
			aClass243_2780 = null;
			aClass243_2786 = null;
			aClass243_2787 = null;
			aClass243_2788 = null;
			aClass243_2785 = null;
			aClass243_2802 = null;
			anIntArray2791 = null;
			anIntArray2792 = null;
		}
		anInt2815 = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			class523_sub34.method16408(-1268277500);
		}
		aList2794.clear();
		aBool2778 = false;
		if (aClass523_Sub34_2795 != null) {
			synchronized (aClass523_Sub34_2795) {
				aClass523_Sub34_2795.method16408(-1487159194);
				aClass523_Sub34_2795 = null;
			}
		}
		anInt2796 = 0;
		anInt2797 = 0;
		if (!bool) {
			synchronized (aList2798) {
				Iterator iterator_347_ = aList2798.iterator();
				while (iterator_347_.hasNext()) {
					RSBuffer class523_sub34 = (RSBuffer) iterator_347_.next();
					class523_sub34.method16408(-1146107434);
				}
				aList2798.clear();
			}
			anInt2819 = 0;
		}
		synchronized (aList2764) {
			Iterator iterator_348_ = aList2764.iterator();
			while (iterator_348_.hasNext()) {
				RSBuffer class523_sub34 = (RSBuffer) iterator_348_.next();
				class523_sub34.method16408(-1170681687);
			}
			aList2764.clear();
		}
		aBool2799 = false;
		anInt2759 = 0;
		anInt2805 = -1;
		anInt2761 = -1;
		if (!bool) {
			method4592(false);
			aBool2770 = false;
			anInt2769 = -1;
			anInt2809 = -1;
			anInt2765 = 0;
			anInt2820 = 0;
			anInt2779 = -1;
			anInt2804 = -1;
			anInt2807 = -1;
			anInt2808 = -1;
			aBool2763 = false;
			aBool2818 = false;
		} else {
			anInt2820++;
			aBool2763 = true;
		}
	}

	void method4665() {
		int i = method4608(8) + 1;
		Iterator iterator = aList2800.iterator();
		while (iterator.hasNext()) {
			Class258 class258 = (Class258) iterator.next();
			if (class258.anInt2831 == 0 && class258.anInt2832 == 0) {
				if (class258.aClass249Array2830.length == i && class258.anInt2829 == anInt2766 && class258.anInt2834 == anInt2811 && class258.anInt2833 == anInt2781) {
					aClass249Array2774 = class258.aClass249Array2830;
					for (int i_349_ = 0; i_349_ < aClass249Array2774.length; i_349_++)
						aClass249Array2774[i_349_].method4408(this);
					return;
				}
			}
		}
		aClass249Array2774 = new Class249[i];
		for (int i_350_ = 0; i_350_ < i; i_350_++) {
			if (aClass249Array2774[i_350_] == null)
				aClass249Array2774[i_350_] = new Class249();
			aClass249Array2774[i_350_].method4412(this);
		}
		Class258 class258 = new Class258(anInt2766, anInt2811, anInt2760, anInt2824, anInt2781, aClass249Array2774);
		aList2800.add(class258);
	}

	void method4666(byte[] is, int i) {
		anInt2815 = 0;
		if (!method291()) {
			if (is == null)
				throw new RuntimeException("");
			int i_351_ = 0;
			if (method4624(is, i, 1))
				i_351_ = 1;
			else if (method4624(is, i, 3))
				i_351_ = 3;
			else if (method4624(is, i, 5))
				i_351_ = 5;
			else
				throw new RuntimeException(new StringBuilder().append("").append(i_351_).toString());
			if (i_351_ == 1) {
				method4606(is, i + 7);
				int i_352_ = method4608(32);
				anInt2766 = method4608(8);
				anInt2811 = method4608(32);
				anInt2760 = method4608(32);
				anInt2781 = method4608(32);
				anInt2824 = method4608(32);
				anInt2772 = 1 << method4608(4);
				anInt2773 = 1 << method4608(4);
				int i_353_ = 1 << method4608(1);
				if (i_352_ != 0 || i_353_ == 0)
					throw new RuntimeException("");
				aBool2770 = true;
				anInt2805++;
			} else if (i_351_ != 3 && i_351_ == 5) {
				if (!method4624(is, i, 5))
					throw new RuntimeException("");
				method4606(is, i + 7);
				if (aClass243Array2784 != null) {
					method4596(aClass243Array2784);
					aClass243Array2784 = null;
				}
				aClass243Array2784 = method4593(anInt2766, anInt2773);
				for (int i_354_ = 0; i_354_ < 2; i_354_++) {
					int i_355_ = i_354_ != 0 ? anInt2773 : anInt2772;
					int i_356_ = i_355_ >> 1;
					int i_357_ = i_355_ >> 2;
					int i_358_ = i_355_ >> 3;
					Class243 class243 = method4594(i_356_);
					for (int i_359_ = 0; i_359_ < i_357_; i_359_++) {
						class243.aFloatArray2459[2 * i_359_] = (float) Math.cos((double) (4 * i_359_) * 3.141592653589793 / (double) i_355_);
						class243.aFloatArray2459[2 * i_359_ + 1] = -(float) Math.sin((double) (4 * i_359_) * 3.141592653589793 / (double) i_355_);
					}
					Class243 class243_360_ = method4594(i_356_);
					for (int i_361_ = 0; i_361_ < i_357_; i_361_++) {
						class243_360_.aFloatArray2459[2 * i_361_] = (float) Math.cos((double) (2 * i_361_ + 1) * 3.141592653589793 / (double) (2 * i_355_));
						class243_360_.aFloatArray2459[2 * i_361_ + 1] = (float) Math.sin((double) (2 * i_361_ + 1) * 3.141592653589793 / (double) (2 * i_355_));
					}
					Class243 class243_362_ = method4594(i_357_);
					for (int i_363_ = 0; i_363_ < i_358_; i_363_++) {
						class243_362_.aFloatArray2459[2 * i_363_] = (float) Math.cos((double) (4 * i_363_ + 2) * 3.141592653589793 / (double) i_355_);
						class243_362_.aFloatArray2459[2 * i_363_ + 1] = -(float) Math.sin((double) (4 * i_363_ + 2) * 3.141592653589793 / (double) i_355_);
					}
					int[] is_364_ = new int[i_358_];
					int i_365_ = Class181.method3537(i_358_ - 1, (byte) 0);
					for (int i_366_ = 0; i_366_ < i_358_; i_366_++) {
						int[] is_367_ = is_364_;
						int i_368_ = i_366_;
						int i_369_ = i_366_;
						int i_370_ = i_365_;
						int i_371_ = 0;
						for (/**/; i_370_ > 0; i_370_--) {
							i_371_ = i_371_ << 1 | i_369_ & 0x1;
							i_369_ >>>= 1;
						}
						int i_372_ = i_371_;
						is_367_[i_368_] = i_372_;
					}
					if (i_354_ != 0) {
						aClass243_2788 = class243;
						aClass243_2785 = class243_360_;
						aClass243_2802 = class243_362_;
						anIntArray2792 = is_364_;
					} else {
						aClass243_2780 = class243;
						aClass243_2786 = class243_360_;
						aClass243_2787 = class243_362_;
						anIntArray2791 = is_364_;
					}
				}
				method4630();
				int i_373_ = method4608(6) + 1;
				for (int i_374_ = 0; i_374_ < i_373_; i_374_++)
					method4608(16);
				i_373_ = method4608(6) + 1;
				if (aClass255Array2775 == null || aClass255Array2775.length != i_373_)
					aClass255Array2775 = new Class255[i_373_];
				for (int i_375_ = 0; i_375_ < i_373_; i_375_++) {
					if (aClass255Array2775[i_375_] == null)
						aClass255Array2775[i_375_] = new Class255();
					aClass255Array2775[i_375_].method4552(this, anInt2766);
				}
				int i_376_ = method4608(6) + 1;
				if (aClass235Array2776 == null || aClass235Array2776.length != i_376_)
					aClass235Array2776 = new Class235[i_376_];
				for (int i_377_ = 0; i_377_ < i_376_; i_377_++) {
					if (aClass235Array2776[i_377_] == null)
						aClass235Array2776[i_377_] = new Class235();
					aClass235Array2776[i_377_].method4274(this);
				}
				int i_378_ = method4608(6) + 1;
				if (aClass247Array2777 == null || aClass247Array2777.length != i_378_)
					aClass247Array2777 = new Class247[i_378_];
				for (int i_379_ = 0; i_379_ < i_378_; i_379_++) {
					if (aClass247Array2777[i_379_] == null)
						aClass247Array2777[i_379_] = new Class247();
					aClass247Array2777[i_379_].method4391(this);
				}
				int i_380_ = method4608(6) + 1;
				aBoolArray2771 = new boolean[i_380_];
				anIntArray2803 = new int[i_380_];
				for (int i_381_ = 0; i_381_ < i_380_; i_381_++) {
					aBoolArray2771[i_381_] = method4602() != 0;
					method4608(16);
					method4608(16);
					anIntArray2803[i_381_] = method4608(8);
				}
				method4592(true);
			}
		}
	}

	void method4667() {
		if (method282() != Class372.aClass372_3901 && method282() != Class372.aClass372_3900 && (!aBool2801 || !((float) (anInt2819 / method4611()) > aFloat2825))) {
			if (!method4600()) {
				RSBuffer class523_sub34 = ((RSBuffer) (aList2764 != null && !aList2764.isEmpty() ? aList2764.get(0) : null));
				if (class523_sub34 == null) {
					if (!aBool2799) {
						method4585(Class372.aClass372_3900);
						anInterface47_2790.method347((byte) 0);
						aBool2799 = true;
					}
					return;
				}
				aBool2799 = false;
				aBool2778 = true;
				aList2764.remove(0);
				method4599(class523_sub34);
			}
			method4616();
		}
	}

	void method4668() {
		if (method282() != Class372.aClass372_3901 && method282() != Class372.aClass372_3900 && (!aBool2801 || !((float) (anInt2819 / method4611()) > aFloat2825))) {
			if (!method4600()) {
				RSBuffer class523_sub34 = ((RSBuffer) (aList2764 != null && !aList2764.isEmpty() ? aList2764.get(0) : null));
				if (class523_sub34 == null) {
					if (!aBool2799) {
						method4585(Class372.aClass372_3900);
						anInterface47_2790.method347((byte) 0);
						aBool2799 = true;
					}
					return;
				}
				aBool2799 = false;
				aBool2778 = true;
				aList2764.remove(0);
				method4599(class523_sub34);
			}
			method4616();
		}
	}

	int method4669(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	synchronized void method4670() {
		int i = (aClass523_Sub34_2795 != null ? aClass523_Sub34_2795.offset * 2349011 : 0);
		int i_382_ = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			i_382_ += class523_sub34.offset * 2349011;
		}
		if (aClass523_Sub34_2795 != null) {
			if ((aClass523_Sub34_2795.buffer.length - aClass523_Sub34_2795.offset * 2349011) < i_382_) {
				RSBuffer class523_sub34 = method4653(i_382_ + anInt2796);
				class523_sub34.readBytes((aClass523_Sub34_2795.buffer), (aClass523_Sub34_2795.offset * 2349011) - anInt2797, anInt2796, (short) -2184);
				aClass523_Sub34_2795.method16408(-1858643987);
				aClass523_Sub34_2795 = class523_sub34;
				i = anInt2797;
			}
		} else {
			aClass523_Sub34_2795 = method4653(i_382_);
			anInt2796 = 0;
			i = 0;
		}
		iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSBuffer class523_sub34 = (RSBuffer) iterator.next();
			aClass523_Sub34_2795.readBytes(class523_sub34.buffer, 0, (class523_sub34.offset * 2349011), (short) -28126);
			anInt2796 += class523_sub34.offset * 2349011;
			class523_sub34.method16408(-1751256253);
		}
		aClass523_Sub34_2795.offset = (i - anInt2797) * 189765723;
		anInt2797 = 0;
		aList2794.clear();
		while (aBool2778) {
			if (aClass523_Sub34_2795.offset * 2349011 >= aClass523_Sub34_2795.buffer.length) {
				aBool2778 = false;
				break;
			}
			if (aBool2801 && (float) (anInt2819 / method4611()) > aFloat2825)
				break;
			if (aClass523_Sub34_2795 == null || anInt2796 < 27) {
				if (aClass523_Sub34_2795 != null) {
					anInt2797 = anInt2796;
					aClass523_Sub34_2795.offset += anInt2796 * 189765723;
				}
				aBool2778 = false;
				break;
			}
			int i_383_ = aClass523_Sub34_2795.offset * 2349011;
			int i_384_ = 0;
			int i_385_ = 0;
			if (!method4601(aClass523_Sub34_2795))
				break;
			anInt2761++;
			if (anInt2808 < 0)
				anInt2807++;
			aList2812.clear();
			aList2813.clear();
			aClass523_Sub34_2795.readUnsignedByte(-726270997);
			int i_386_ = aClass523_Sub34_2795.readUnsignedByte(-1742164237);
			int i_387_ = (aClass523_Sub34_2795.readUnsignedByte(49267127) & 0xff | (aClass523_Sub34_2795.readUnsignedByte(892807728) & 0xff) << 8 | ((aClass523_Sub34_2795.readUnsignedByte(1173700537) & 0xff) << 16) | aClass523_Sub34_2795.readUnsignedByte(302916126) << 24);
			i_384_ = i_387_ - i_384_;
			aClass523_Sub34_2795.offset += -1258715728;
			int i_388_ = aClass523_Sub34_2795.readUnsignedByte(-737172380);
			int i_389_ = aClass523_Sub34_2795.offset * 2349011;
			int i_390_ = i_389_ + i_388_;
			if (i_390_ > i_383_ + anInt2796) {
				aClass523_Sub34_2795.offset = (i_383_ + anInt2796) * 189765723;
				anInt2797 = aClass523_Sub34_2795.offset * 2349011 - i_383_;
				aBool2778 = false;
			}
			int i_391_ = i_390_;
			int i_392_ = 0;
			if (aBool2778) {
				for (int i_393_ = 0; i_393_ < i_388_; i_393_++) {
					int i_394_ = (aClass523_Sub34_2795.buffer[i_389_++] & 0xff);
					i_390_ += i_394_;
					i_392_ += i_394_;
					if (i_390_ > i_383_ + anInt2796) {
						aClass523_Sub34_2795.offset = (i_383_ + anInt2796) * 189765723;
						anInt2797 = (aClass523_Sub34_2795.offset * 2349011 - i_383_);
						aBool2778 = false;
						break;
					}
					if (i_394_ < 255) {
						aList2812.add(Integer.valueOf(i_391_));
						aList2813.add(Integer.valueOf(i_392_));
						i_391_ = i_390_;
						i_392_ = 0;
					}
				}
			}
			if (aBool2778) {
				int i_395_ = i_390_;
				int i_396_ = -1;
				Iterator iterator_397_ = aList2812.iterator();
				Iterator iterator_398_ = aList2813.iterator();
				boolean bool = false;
				anInt2816 = 0;
				while (iterator_397_.hasNext()) {
					Integer integer = (Integer) iterator_397_.next();
					Integer integer_399_ = (Integer) iterator_398_.next();
					i_396_++;
					if (method291() && aBool2763 == true && anInt2761 < anInt2807 && i_396_ < anInt2808) {
						Class256 class256_400_ = this;
						class256_400_.anInt2759 = class256_400_.anInt2759 + (bool ? 0 : i_384_);
						bool = true;
					} else {
						anAtomicReference2814.set(null);
						boolean bool_401_ = method4613(aClass523_Sub34_2795.buffer, integer.intValue(), integer_399_.intValue(), anAtomicReference2814);
						Class243[] class243s = (Class243[]) anAtomicReference2814.get();
						if (bool_401_ && (aBool2763 != true || anInt2761 >= anInt2807 || i_396_ >= anInt2808)) {
							if (class243s != null) {
								int i_402_ = class243s[0].anInt2462;
								anInt2815 += i_402_;
								if (anInt2815 > i_387_ && i_386_ == 4) {
									anInt2816 = anInt2815 - i_387_ - anInt2816;
									i_402_ -= anInt2816;
									if (anInt2816 > class243s[0].anInt2462)
										anInt2816 = class243s[0].anInt2462;
									if (i_402_ < 0)
										i_402_ = 0;
								}
								int i_403_ = 0;
								int i_404_ = method290(i_402_) * class243s.length;
								if (aBool2763 == true && anInt2759 < anInt2769) {
									int i_405_ = i_404_;
									i_404_ -= method290(anInt2769 - anInt2759);
									if (i_404_ <= 0) {
										anInt2759 += method197(i_405_);
										method4596(class243s);
										Object object = null;
										continue;
									}
									i_403_ += anInt2769 - anInt2759;
								}
								if (anInt2759 + i_402_ > anInt2809 && (anInt2820 < anInt2765 || anInt2765 < 0) && aBool2818) {
									i_404_ -= method290(anInt2759 + i_402_ - anInt2809 - 1);
									if (i_404_ <= 0) {
										method4596(class243s);
										Object object = null;
										continue;
									}
								}
								int i_406_ = method321();
								if (method4590() < method321()) {
									int i_407_ = method321() - method4590();
									i_404_ += i_404_ / method4590() * i_407_;
								}
								RSBuffer class523_sub34 = method4653(i_404_);
								for (int i_408_ = i_403_; i_408_ < i_402_; i_408_++) {
									boolean bool_409_ = aBool2763;
									if (anInt2765 != 0) {
										if (anInt2759 == anInt2769) {
											if (anInt2779 < 0) {
												anInt2779 = anInt2805;
												anInt2808 = i_396_;
											}
											aBool2763 = false;
										}
										if (anInt2759 == anInt2809 && anInt2804 < 0)
											anInt2804 = anInt2805;
										if (anInt2759 > anInt2809 && (anInt2820 < anInt2765 || anInt2765 < 0) && aBool2818)
											bool_409_ = true;
									}
									if (bool_409_ && (anInt2759 < anInt2769 || anInt2759 > anInt2809)) {
										anInt2759++;
										if (++i_385_ > i_384_)
											throw new RuntimeException();
									} else {
										for (int i_410_ = 0; i_410_ < i_406_; i_410_++) {
											float f;
											if (i_410_ < class243s.length)
												f = (class243s[i_410_].aFloatArray2459[i_408_]);
											else
												f = (class243s[i_410_ % method4590()].aFloatArray2459[i_408_]);
											if (aClass393_2789 == Class393.aClass393_4038) {
												int i_411_ = method4617(f);
												if (aClass365_2767 == Class365.aClass365_3864)
													class523_sub34.method16262(i_411_, -1165660879);
												else
													class523_sub34.writeShort(i_411_, (byte) -39);
											} else if (aClass393_2789 == (Class393.aClass393_4042)) {
												int i_412_ = method4618(f);
												if (aClass365_2767 == Class365.aClass365_3864)
													class523_sub34.method16262(i_412_, -1115578736);
												else
													class523_sub34.writeShort(i_412_, (byte) -21);
											} else if (aClass393_2789 == (Class393.aClass393_4040)) {
												int i_413_ = method4619(f);
												class523_sub34.writeByte(i_413_, 34012683);
											} else if (aClass393_2789 == (Class393.aClass393_4039)) {
												int i_414_ = method4627(f);
												class523_sub34.writeByte(i_414_, 988244149);
											}
										}
										anInt2759++;
										i_385_++;
									}
								}
								synchronized (aList2798) {
									anInt2819 += method197(class523_sub34.offset * 2349011) / method321();
									aList2798.add(class523_sub34);
								}
							}
						} else if (method291()) {
							anInt2806 = 0;
							if (aClass243Array2793 == null || (aClass243Array2793 != null && (aClass243Array2793.length != anInt2766 || (aClass243Array2793[0].anInt2462 != anInt2773)))) {
								if (aClass243Array2793 != null)
									method4596(aClass243Array2793);
								aClass243Array2793 = method4593(anInt2766, anInt2773);
							}
						}
						method4596(class243s);
						Object object = null;
					}
				}
				aClass523_Sub34_2795.offset = i_395_ * 189765723;
				anInt2796 -= i_395_ - i_383_;
			}
		}
	}

	public int method319() {
		if (aBool2770)
			return method4590() < anInt2768 ? anInt2768 : method4590();
		throw new RuntimeException("");
	}

	int method4671(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	RSBuffer method4672(int i) {
		return new RSBuffer(i, true);
	}

	int method4673(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	int method4674(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	int method4675() {
		return anInt2823;
	}

	public int method290(int i) {
		return i * (method285().anInt4043 * 1552171027 / 8);
	}

	int method4676(int i) {
		int i_415_ = 0;
		int i_416_ = 0;
		int i_417_;
		for (/**/; i >= 8 - anInt2758; i -= i_417_) {
			i_417_ = 8 - anInt2758;
			int i_418_ = (1 << i_417_) - 1;
			i_415_ += (aByteArray2822[anInt2823] >> anInt2758 & i_418_) << i_416_;
			anInt2758 = 0;
			anInt2823++;
			i_416_ += i_417_;
		}
		if (i > 0) {
			i_417_ = (1 << i) - 1;
			i_415_ += (aByteArray2822[anInt2823] >> anInt2758 & i_417_) << i_416_;
			anInt2758 += i;
		}
		return i_415_;
	}

	RSBuffer method4677(int i) {
		return new RSBuffer(i, true);
	}

	RSBuffer method4678(int i) {
		return new RSBuffer(i, true);
	}

	RSBuffer method4679(int i) {
		return new RSBuffer(i, true);
	}

	int method4680() {
		if (aBool2770)
			return anInt2766;
		throw new RuntimeException("");
	}

	int method4681() {
		return anInt2819;
	}

	public void method324(boolean bool, int i, int i_419_, int i_420_) {
		aBool2818 = bool;
		anInt2765 = i;
		anInt2769 = i_419_;
		anInt2809 = i_420_;
	}

	void method4682(byte[] is, int i) {
		aByteArray2822 = is;
		anInt2823 = i;
		anInt2758 = 0;
	}

	public void method326(Interface47 interface47) {
		anInterface47_2790 = interface47;
	}

	public void method318(RSBuffer class523_sub34) {
		if (method282() == Class372.aClass372_3902 || method282() == Class372.aClass372_3903) {
			if (class523_sub34 != null)
				class523_sub34.method16408(-1492462253);
		} else if (class523_sub34 == null) {
			boolean bool = aBool2818 && (anInt2765 > 0 && anInt2820 < anInt2765 || anInt2765 < 0);
			if (aList2798.isEmpty()) {
				if (!bool) {
					method4609();
					method4585(Class372.aClass372_3903);
				}
			} else if (!bool) {
				method4609();
				method4585(Class372.aClass372_3902);
			}
			if (bool)
				method4622(true);
		} else
			method4615(class523_sub34);
	}

	public void method328(RSBuffer class523_sub34) {
		if (method282() == Class372.aClass372_3902 || method282() == Class372.aClass372_3903) {
			if (class523_sub34 != null)
				class523_sub34.method16408(-2122252352);
		} else if (class523_sub34 == null) {
			boolean bool = aBool2818 && (anInt2765 > 0 && anInt2820 < anInt2765 || anInt2765 < 0);
			if (aList2798.isEmpty()) {
				if (!bool) {
					method4609();
					method4585(Class372.aClass372_3903);
				}
			} else if (!bool) {
				method4609();
				method4585(Class372.aClass372_3902);
			}
			if (bool)
				method4622(true);
		} else
			method4615(class523_sub34);
	}
}
