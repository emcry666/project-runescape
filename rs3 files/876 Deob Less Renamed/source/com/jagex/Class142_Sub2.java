/* Class142_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class142_Sub2 extends Class142 {
	Class131 aClass131_9706;
	float[][] aFloatArrayArray9707;
	Class131 aClass131_9708;
	int anInt9709;
	int anInt9710;
	static final int anInt9711 = 1;
	int[][][] anIntArrayArrayArray9712;
	int anInt9713;
	int[][][] anIntArrayArrayArray9714;
	short[][] aShortArrayArray9715;
	Class523_Sub9[][][] aClass523_Sub9ArrayArrayArray9716;
	int[][][] anIntArrayArrayArray9717;
	int[][][] anIntArrayArrayArray9718;
	int[][][] anIntArrayArrayArray9719;
	Class147 aClass147_9720;
	int anInt9721;
	int[][][] anIntArrayArrayArray9722;
	byte[][] aByteArrayArray9723;
	Class523[] aClass523Array9724;
	Class708 aClass708_9725 = new Class708();
	int anInt9726;
	Interface15 anInterface15_9727;
	Class131 aClass131_9728;
	Class178_Sub1 aClass178_Sub1_9729;
	Class131 aClass131_9730;
	static final int anInt9731 = 74;
	int anInt9732;
	int anInt9733;
	byte[][] aByteArrayArray9734;
	float[][] aFloatArrayArray9735;
	int anInt9736;
	float[][] aFloatArrayArray9737;
	Class14 aClass14_9738;
	static float[] aFloatArray9739 = new float[16];

	public void method2340() {
		if (anInt9732 > 0) {
			byte[][] is = (new byte[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1]);
			for (int i = 1; i < anInt1683 * 692304099; i++) {
				for (int i_0_ = 1; i_0_ < anInt1681 * 452998539; i_0_++)
					is[i][i_0_] = (byte) ((aByteArrayArray9734[i - 1][i_0_] >> 2) + (aByteArrayArray9734[i + 1][i_0_] >> 3) + (aByteArrayArray9734[i][i_0_ - 1] >> 2) + (aByteArrayArray9734[i][i_0_ + 1] >> 3) + (aByteArrayArray9734[i][i_0_] >> 1));
			}
			aClass523Array9724 = new Class523[aClass14_9738.method734(1227491458)];
			aClass14_9738.method739(aClass523Array9724, (byte) -47);
			for (int i = 0; i < aClass523Array9724.length; i++)
				((Class523_Sub9) aClass523Array9724[i]).method15930(anInt9732);
			int i = 24;
			if (anIntArrayArrayArray9722 != null)
				i += 4;
			if ((anInt9726 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass178_Sub1_9729.aNativeHeap9289.method1905(anInt9732 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class523_Sub9[] class523_sub9s = new Class523_Sub9[anInt9732];
			int i_1_ = Class375.method6383(anInt9732 / 4, 189765723);
			if (i_1_ < 1)
				i_1_ = 1;
			Class14 class14 = new Class14(i_1_);
			Class523_Sub9[] class523_sub9s_2_ = new Class523_Sub9[anInt9733];
			for (int i_3_ = 0; i_3_ < anInt1683 * 692304099; i_3_++) {
				for (int i_4_ = 0; i_4_ < anInt1681 * 452998539; i_4_++) {
					if (anIntArrayArrayArray9717[i_3_][i_4_] != null) {
						Class523_Sub9[] class523_sub9s_5_ = aClass523_Sub9ArrayArrayArray9716[i_3_][i_4_];
						int[] is_6_ = anIntArrayArrayArray9719[i_3_][i_4_];
						int[] is_7_ = anIntArrayArrayArray9712[i_3_][i_4_];
						int[] is_8_ = anIntArrayArrayArray9718[i_3_][i_4_];
						int[] is_9_ = anIntArrayArrayArray9717[i_3_][i_4_];
						int[] is_10_ = (anIntArrayArrayArray9714 != null ? anIntArrayArrayArray9714[i_3_][i_4_] : null);
						int[] is_11_ = (anIntArrayArrayArray9722 != null ? anIntArrayArrayArray9722[i_3_][i_4_] : null);
						if (is_8_ == null)
							is_8_ = is_9_;
						float f = aFloatArrayArray9735[i_3_][i_4_];
						float f_12_ = aFloatArrayArray9707[i_3_][i_4_];
						float f_13_ = aFloatArrayArray9737[i_3_][i_4_];
						float f_14_ = aFloatArrayArray9735[i_3_][i_4_ + 1];
						float f_15_ = aFloatArrayArray9707[i_3_][i_4_ + 1];
						float f_16_ = aFloatArrayArray9737[i_3_][i_4_ + 1];
						float f_17_ = aFloatArrayArray9735[i_3_ + 1][i_4_ + 1];
						float f_18_ = aFloatArrayArray9707[i_3_ + 1][i_4_ + 1];
						float f_19_ = aFloatArrayArray9737[i_3_ + 1][i_4_ + 1];
						float f_20_ = aFloatArrayArray9735[i_3_ + 1][i_4_];
						float f_21_ = aFloatArrayArray9707[i_3_ + 1][i_4_];
						float f_22_ = aFloatArrayArray9737[i_3_ + 1][i_4_];
						int i_23_ = is[i_3_][i_4_] & 0xff;
						int i_24_ = is[i_3_][i_4_ + 1] & 0xff;
						int i_25_ = is[i_3_ + 1][i_4_ + 1] & 0xff;
						int i_26_ = is[i_3_ + 1][i_4_] & 0xff;
						int i_27_ = 0;
						while_1_: for (int i_28_ = 0; i_28_ < is_9_.length; i_28_++) {
							Class523_Sub9 class523_sub9 = class523_sub9s_5_[i_28_];
							for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
								if (class523_sub9s_2_[i_29_] == class523_sub9)
									continue while_1_;
							}
							class523_sub9s_2_[i_27_++] = class523_sub9;
						}
						short[] is_30_ = (aShortArrayArray9715[i_4_ * (anInt1683 * 692304099) + i_3_] = new short[is_9_.length]);
						for (int i_31_ = 0; i_31_ < is_9_.length; i_31_++) {
							int i_32_ = ((i_3_ << anInt1680 * -1193058675) + is_6_[i_31_]);
							int i_33_ = ((i_4_ << anInt1680 * -1193058675) + is_7_[i_31_]);
							int i_34_ = i_32_ >> anInt9709;
							int i_35_ = i_33_ >> anInt9709;
							int i_36_ = is_9_[i_31_];
							int i_37_ = is_8_[i_31_];
							int i_38_ = is_10_ != null ? is_10_[i_31_] : 0;
							long l = ((long) i_37_ << 48 | (long) i_36_ << 32 | (long) (i_34_ << 16) | (long) i_35_);
							int i_39_ = is_6_[i_31_];
							int i_40_ = is_7_[i_31_];
							int i_41_ = 74;
							int i_42_ = 0;
							float f_43_ = 1.0F;
							float f_44_;
							float f_45_;
							float f_46_;
							if (i_39_ == 0 && i_40_ == 0) {
								f_44_ = f;
								f_45_ = f_12_;
								f_46_ = f_13_;
								i_41_ -= i_23_;
							} else if (i_39_ == 0 && i_40_ == anInt1682 * 341909049) {
								f_44_ = f_14_;
								f_45_ = f_15_;
								f_46_ = f_16_;
								i_41_ -= i_24_;
							} else if (i_39_ == anInt1682 * 341909049 && i_40_ == anInt1682 * 341909049) {
								f_44_ = f_17_;
								f_45_ = f_18_;
								f_46_ = f_19_;
								i_41_ -= i_25_;
							} else if (i_39_ == anInt1682 * 341909049 && i_40_ == 0) {
								f_44_ = f_20_;
								f_45_ = f_21_;
								f_46_ = f_22_;
								i_41_ -= i_26_;
							} else {
								float f_47_ = ((float) i_39_ / (float) (anInt1682 * 341909049));
								float f_48_ = ((float) i_40_ / (float) (anInt1682 * 341909049));
								float f_49_ = f + (f_20_ - f) * f_47_;
								float f_50_ = f_12_ + (f_21_ - f_12_) * f_47_;
								float f_51_ = f_13_ + (f_22_ - f_13_) * f_47_;
								float f_52_ = f_14_ + (f_17_ - f_14_) * f_47_;
								float f_53_ = f_15_ + (f_18_ - f_15_) * f_47_;
								float f_54_ = f_16_ + (f_19_ - f_16_) * f_47_;
								f_44_ = f_49_ + (f_52_ - f_49_) * f_48_;
								f_45_ = f_50_ + (f_53_ - f_50_) * f_48_;
								f_46_ = f_51_ + (f_54_ - f_51_) * f_48_;
								int i_55_ = i_23_ + ((i_26_ - i_23_) * i_39_ >> anInt1680 * -1193058675);
								int i_56_ = i_24_ + ((i_25_ - i_24_) * i_39_ >> anInt1680 * -1193058675);
								i_41_ -= i_55_ + ((i_56_ - i_55_) * i_40_ >> anInt1680 * -1193058675);
							}
							if (i_36_ != -1) {
								int i_57_ = (i_36_ & 0x7f) * i_41_ >> 7;
								if (i_57_ < 2)
									i_57_ = 2;
								else if (i_57_ > 126)
									i_57_ = 126;
								i_42_ = (Class710.anIntArray8839[i_36_ & 0xff80 | i_57_]);
								if ((anInt9726 & 0x7) == 0) {
									f_43_ = ((aClass178_Sub1_9729.aFloatArray9277[0]) * f_44_ + (aClass178_Sub1_9729.aFloatArray9277[1]) * f_45_ + (aClass178_Sub1_9729.aFloatArray9277[2]) * f_46_);
									f_43_ = (aClass178_Sub1_9729.aFloat9359 + f_43_ * (f_43_ > 0.0F ? (aClass178_Sub1_9729.aFloat9343) : (aClass178_Sub1_9729.aFloat9250)));
								}
							}
							Class523 class523 = null;
							if ((i_32_ & anInt9710 - 1) == 0 && (i_33_ & anInt9710 - 1) == 0)
								class523 = class14.method741(l);
							int i_58_;
							if (class523 == null) {
								int i_59_;
								if (i_37_ != i_36_) {
									int i_60_ = (i_37_ & 0x7f) * i_41_ >> 7;
									if (i_60_ < 2)
										i_60_ = 2;
									else if (i_60_ > 126)
										i_60_ = 126;
									i_59_ = (Class710.anIntArray8839[i_37_ & 0xff80 | i_60_]);
									if ((anInt9726 & 0x7) == 0) {
										float f_61_ = ((aClass178_Sub1_9729.aFloatArray9277[0]) * f_44_ + (aClass178_Sub1_9729.aFloatArray9277[1]) * f_45_ + ((aClass178_Sub1_9729.aFloatArray9277[2]) * f_46_));
										f_61_ = (aClass178_Sub1_9729.aFloat9359 + (f_43_ * (f_43_ > 0.0F ? (aClass178_Sub1_9729.aFloat9343) : (aClass178_Sub1_9729.aFloat9250))));
										int i_62_ = i_59_ >> 16 & 0xff;
										int i_63_ = i_59_ >> 8 & 0xff;
										int i_64_ = i_59_ & 0xff;
										i_62_ *= f_61_;
										if (i_62_ < 0)
											i_62_ = 0;
										else if (i_62_ > 255)
											i_62_ = 255;
										i_63_ *= f_61_;
										if (i_63_ < 0)
											i_63_ = 0;
										else if (i_63_ > 255)
											i_63_ = 255;
										i_64_ *= f_61_;
										if (i_64_ < 0)
											i_64_ = 0;
										else if (i_64_ > 255)
											i_64_ = 255;
										i_59_ = i_62_ << 16 | i_63_ << 8 | i_64_;
									}
								} else
									i_59_ = i_42_;
								if (aClass178_Sub1_9729.aBool9393) {
									stream.method1701((float) i_32_);
									stream.method1701((float) (method2326(i_32_, i_33_, -1789249459) + i_38_));
									stream.method1701((float) i_33_);
									stream.method1700((byte) (i_59_ >> 16));
									stream.method1700((byte) (i_59_ >> 8));
									stream.method1700((byte) i_59_);
									stream.method1700(-1);
									stream.method1701((float) i_32_);
									stream.method1701((float) i_33_);
									if (anIntArrayArrayArray9722 != null)
										stream.method1701(is_11_ != null ? (float) ((is_11_[i_31_]) - 1) : 0.0F);
									if ((anInt9726 & 0x7) != 0) {
										stream.method1701(f_44_);
										stream.method1701(f_45_);
										stream.method1701(f_46_);
									}
								} else {
									stream.method1702((float) i_32_);
									stream.method1702((float) (method2326(i_32_, i_33_, 1880438476) + i_38_));
									stream.method1702((float) i_33_);
									stream.method1700((byte) (i_59_ >> 16));
									stream.method1700((byte) (i_59_ >> 8));
									stream.method1700((byte) i_59_);
									stream.method1700(-1);
									stream.method1702((float) i_32_);
									stream.method1702((float) i_33_);
									if (anIntArrayArrayArray9722 != null)
										stream.method1702(is_11_ != null ? (float) ((is_11_[i_31_]) - 1) : 0.0F);
									if ((anInt9726 & 0x7) != 0) {
										stream.method1702(f_44_);
										stream.method1702(f_45_);
										stream.method1702(f_46_);
									}
								}
								i_58_ = anInt9713++;
								is_30_[i_31_] = (short) i_58_;
								if (i_36_ != -1)
									class523_sub9s[i_58_] = class523_sub9s_5_[i_31_];
								class14.method738(new Class523_Sub6(is_30_[i_31_]), l);
							} else {
								is_30_[i_31_] = ((Class523_Sub6) class523).aShort10403;
								i_58_ = is_30_[i_31_] & 0xffff;
								if (i_36_ != -1 && ((class523_sub9s_5_[i_31_].aLong7065 * 1055205983951172633L) < (class523_sub9s[i_58_].aLong7065 * 1055205983951172633L)))
									class523_sub9s[i_58_] = class523_sub9s_5_[i_31_];
							}
							for (int i_65_ = 0; i_65_ < i_27_; i_65_++)
								class523_sub9s_2_[i_65_].method15929(i_58_, i_42_, i_41_, f_43_);
							anInt9721++;
						}
					}
				}
			}
			for (int i_66_ = 0; i_66_ < anInt9713; i_66_++) {
				Class523_Sub9 class523_sub9 = class523_sub9s[i_66_];
				if (class523_sub9 != null)
					class523_sub9.method15926(i_66_);
			}
			for (int i_67_ = 0; i_67_ < anInt1683 * 692304099; i_67_++) {
				for (int i_68_ = 0; i_68_ < anInt1681 * 452998539; i_68_++) {
					short[] is_69_ = (aShortArrayArray9715[i_68_ * (anInt1683 * 692304099) + i_67_]);
					if (is_69_ != null) {
						int i_70_ = 0;
						int i_71_ = 0;
						while (i_71_ < is_69_.length) {
							int i_72_ = is_69_[i_71_++] & 0xffff;
							int i_73_ = is_69_[i_71_++] & 0xffff;
							int i_74_ = is_69_[i_71_++] & 0xffff;
							Class523_Sub9 class523_sub9 = class523_sub9s[i_72_];
							Class523_Sub9 class523_sub9_75_ = class523_sub9s[i_73_];
							Class523_Sub9 class523_sub9_76_ = class523_sub9s[i_74_];
							Class523_Sub9 class523_sub9_77_ = null;
							if (class523_sub9 != null) {
								class523_sub9.method15931(i_67_, i_68_, i_70_);
								class523_sub9_77_ = class523_sub9;
							}
							if (class523_sub9_75_ != null) {
								class523_sub9_75_.method15931(i_67_, i_68_, i_70_);
								if (class523_sub9_77_ == null || ((class523_sub9_75_.aLong7065 * 1055205983951172633L) < (class523_sub9_77_.aLong7065 * 1055205983951172633L)))
									class523_sub9_77_ = class523_sub9_75_;
							}
							if (class523_sub9_76_ != null) {
								class523_sub9_76_.method15931(i_67_, i_68_, i_70_);
								if (class523_sub9_77_ == null || ((class523_sub9_76_.aLong7065 * 1055205983951172633L) < (class523_sub9_77_.aLong7065 * 1055205983951172633L)))
									class523_sub9_77_ = class523_sub9_76_;
							}
							if (class523_sub9_77_ != null) {
								if (class523_sub9 != null)
									class523_sub9_77_.method15926(i_72_);
								if (class523_sub9_75_ != null)
									class523_sub9_77_.method15926(i_73_);
								if (class523_sub9_76_ != null)
									class523_sub9_77_.method15926(i_74_);
								class523_sub9_77_.method15931(i_67_, i_68_, i_70_);
							}
							i_70_++;
						}
					}
				}
			}
			stream.method1703();
			anInterface15_9727 = aClass178_Sub1_9729.method14661(i, nativeheapbuffer, stream.method1698(), false);
			if (anInterface15_9727 instanceof Class135_Sub1)
				nativeheapbuffer.method1678();
			aClass131_9728 = new Class131(anInterface15_9727, 5126, 3, 0);
			aClass131_9706 = new Class131(anInterface15_9727, 5121, 4, 12);
			int i_78_;
			if (anIntArrayArrayArray9722 != null) {
				aClass131_9708 = new Class131(anInterface15_9727, 5126, 3, 16);
				i_78_ = 28;
			} else {
				aClass131_9708 = new Class131(anInterface15_9727, 5126, 2, 16);
				i_78_ = 24;
			}
			if ((anInt9726 & 0x7) != 0)
				aClass131_9730 = new Class131(anInterface15_9727, 5126, 3, i_78_);
			long[] ls = new long[aClass523Array9724.length];
			for (int i_79_ = 0; i_79_ < aClass523Array9724.length; i_79_++) {
				Class523_Sub9 class523_sub9 = (Class523_Sub9) aClass523Array9724[i_79_];
				ls[i_79_] = class523_sub9.aLong7065 * 1055205983951172633L;
				class523_sub9.method15927(anInt9713);
			}
			Class447.method7245(ls, aClass523Array9724, (byte) -92);
			if (aClass147_9720 != null)
				aClass147_9720.method2387();
		} else
			aClass147_9720 = null;
		if ((anInt9736 & 0x2) == 0) {
			anIntArrayArrayArray9712 = null;
			anIntArrayArrayArray9719 = null;
			anIntArrayArrayArray9717 = null;
		}
		anIntArrayArrayArray9722 = null;
		anIntArrayArrayArray9718 = null;
		anIntArrayArrayArray9714 = null;
		aClass523_Sub9ArrayArrayArray9716 = null;
		aByteArrayArray9734 = null;
		aClass14_9738 = null;
		aFloatArrayArray9737 = null;
		aFloatArrayArray9707 = null;
		aFloatArrayArray9735 = null;
	}

	public void method2320(int i, int i_80_, int i_81_) {
		i = Math.min(aByteArrayArray9734.length - 1, Math.max(0, i));
		i_80_ = Math.min(aByteArrayArray9734[i].length - 1, Math.max(0, i_80_));
		if ((aByteArrayArray9734[i][i_80_] & 0xff) < i_81_)
			aByteArrayArray9734[i][i_80_] = (byte) i_81_;
	}

	Class142_Sub2(Class178_Sub1 class178_sub1, int i, int i_82_, int i_83_, int i_84_, int[][] is, int[][] is_85_, int i_86_) {
		super(i_83_, i_84_, i_86_, is);
		aClass178_Sub1_9729 = class178_sub1;
		anInt9709 = anInt1680 * -1193058675 - 2;
		anInt9710 = 1 << anInt9709;
		anInt9736 = i;
		anInt9726 = i_82_;
		anIntArrayArrayArray9714 = new int[i_83_][i_84_][];
		aClass523_Sub9ArrayArrayArray9716 = new Class523_Sub9[i_83_][i_84_][];
		anIntArrayArrayArray9719 = new int[i_83_][i_84_][];
		anIntArrayArrayArray9712 = new int[i_83_][i_84_][];
		anIntArrayArrayArray9717 = new int[i_83_][i_84_][];
		anIntArrayArrayArray9718 = new int[i_83_][i_84_][];
		aShortArrayArray9715 = new short[i_83_ * i_84_][];
		aByteArrayArray9723 = new byte[i_83_][i_84_];
		aByteArrayArray9734 = new byte[i_83_ + 1][i_84_ + 1];
		aFloatArrayArray9735 = new float[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1];
		aFloatArrayArray9707 = new float[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1];
		aFloatArrayArray9737 = new float[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1];
		for (int i_87_ = 1; i_87_ < anInt1681 * 452998539; i_87_++) {
			for (int i_88_ = 1; i_88_ < anInt1683 * 692304099; i_88_++) {
				int i_89_ = is_85_[i_88_ + 1][i_87_] - is_85_[i_88_ - 1][i_87_];
				int i_90_ = is_85_[i_88_][i_87_ + 1] - is_85_[i_88_][i_87_ - 1];
				float f = (float) (1.0 / Math.sqrt((double) (i_89_ * i_89_ + 4 * i_86_ * i_86_ + i_90_ * i_90_)));
				aFloatArrayArray9735[i_88_][i_87_] = (float) i_89_ * f;
				aFloatArrayArray9707[i_88_][i_87_] = (float) (-i_86_ * 2) * f;
				aFloatArrayArray9737[i_88_][i_87_] = (float) i_90_ * f;
			}
		}
		aClass14_9738 = new Class14(128);
		if ((anInt9726 & 0x10) != 0)
			aClass147_9720 = new Class147(aClass178_Sub1_9729, this);
	}

	void method15335(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1, int i, int i_91_) {
		int[] is = anIntArrayArrayArray9719[i][i_91_];
		int[] is_92_ = anIntArrayArrayArray9712[i][i_91_];
		int i_93_ = is.length;
		if (aClass178_Sub1_9729.anIntArray9294.length < i_93_) {
			aClass178_Sub1_9729.anIntArray9294 = new int[i_93_];
			aClass178_Sub1_9729.anIntArray9431 = new int[i_93_];
		}
		int[] is_94_ = aClass178_Sub1_9729.anIntArray9294;
		int[] is_95_ = aClass178_Sub1_9729.anIntArray9431;
		for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
			is_94_[i_96_] = is[i_96_] >> aClass178_Sub1_9729.anInt9287;
			is_95_[i_96_] = is_92_[i_96_] >> aClass178_Sub1_9729.anInt9287;
		}
		int i_97_ = 0;
		while (i_97_ < i_93_) {
			int i_98_ = is_94_[i_97_];
			int i_99_ = is_95_[i_97_++];
			int i_100_ = is_94_[i_97_];
			int i_101_ = is_95_[i_97_++];
			int i_102_ = is_94_[i_97_];
			int i_103_ = is_95_[i_97_++];
			if (((i_98_ - i_100_) * (i_101_ - i_103_) - (i_101_ - i_99_) * (i_102_ - i_100_)) > 0)
				class523_sub27_sub4_sub1.method18503(i_99_, i_101_, i_103_, i_98_, i_100_, i_102_);
		}
	}

	public void method2347() {
		if (anInt9732 > 0) {
			byte[][] is = (new byte[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1]);
			for (int i = 1; i < anInt1683 * 692304099; i++) {
				for (int i_104_ = 1; i_104_ < anInt1681 * 452998539; i_104_++)
					is[i][i_104_] = (byte) ((aByteArrayArray9734[i - 1][i_104_] >> 2) + (aByteArrayArray9734[i + 1][i_104_] >> 3) + (aByteArrayArray9734[i][i_104_ - 1] >> 2) + (aByteArrayArray9734[i][i_104_ + 1] >> 3) + (aByteArrayArray9734[i][i_104_] >> 1));
			}
			aClass523Array9724 = new Class523[aClass14_9738.method734(-2056525)];
			aClass14_9738.method739(aClass523Array9724, (byte) -72);
			for (int i = 0; i < aClass523Array9724.length; i++)
				((Class523_Sub9) aClass523Array9724[i]).method15930(anInt9732);
			int i = 24;
			if (anIntArrayArrayArray9722 != null)
				i += 4;
			if ((anInt9726 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass178_Sub1_9729.aNativeHeap9289.method1905(anInt9732 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class523_Sub9[] class523_sub9s = new Class523_Sub9[anInt9732];
			int i_105_ = Class375.method6383(anInt9732 / 4, 189765723);
			if (i_105_ < 1)
				i_105_ = 1;
			Class14 class14 = new Class14(i_105_);
			Class523_Sub9[] class523_sub9s_106_ = new Class523_Sub9[anInt9733];
			for (int i_107_ = 0; i_107_ < anInt1683 * 692304099; i_107_++) {
				for (int i_108_ = 0; i_108_ < anInt1681 * 452998539; i_108_++) {
					if (anIntArrayArrayArray9717[i_107_][i_108_] != null) {
						Class523_Sub9[] class523_sub9s_109_ = (aClass523_Sub9ArrayArrayArray9716[i_107_][i_108_]);
						int[] is_110_ = anIntArrayArrayArray9719[i_107_][i_108_];
						int[] is_111_ = anIntArrayArrayArray9712[i_107_][i_108_];
						int[] is_112_ = anIntArrayArrayArray9718[i_107_][i_108_];
						int[] is_113_ = anIntArrayArrayArray9717[i_107_][i_108_];
						int[] is_114_ = (anIntArrayArrayArray9714 != null ? anIntArrayArrayArray9714[i_107_][i_108_] : null);
						int[] is_115_ = (anIntArrayArrayArray9722 != null ? anIntArrayArrayArray9722[i_107_][i_108_] : null);
						if (is_112_ == null)
							is_112_ = is_113_;
						float f = aFloatArrayArray9735[i_107_][i_108_];
						float f_116_ = aFloatArrayArray9707[i_107_][i_108_];
						float f_117_ = aFloatArrayArray9737[i_107_][i_108_];
						float f_118_ = aFloatArrayArray9735[i_107_][i_108_ + 1];
						float f_119_ = aFloatArrayArray9707[i_107_][i_108_ + 1];
						float f_120_ = aFloatArrayArray9737[i_107_][i_108_ + 1];
						float f_121_ = aFloatArrayArray9735[i_107_ + 1][i_108_ + 1];
						float f_122_ = aFloatArrayArray9707[i_107_ + 1][i_108_ + 1];
						float f_123_ = aFloatArrayArray9737[i_107_ + 1][i_108_ + 1];
						float f_124_ = aFloatArrayArray9735[i_107_ + 1][i_108_];
						float f_125_ = aFloatArrayArray9707[i_107_ + 1][i_108_];
						float f_126_ = aFloatArrayArray9737[i_107_ + 1][i_108_];
						int i_127_ = is[i_107_][i_108_] & 0xff;
						int i_128_ = is[i_107_][i_108_ + 1] & 0xff;
						int i_129_ = is[i_107_ + 1][i_108_ + 1] & 0xff;
						int i_130_ = is[i_107_ + 1][i_108_] & 0xff;
						int i_131_ = 0;
						while_3_: for (int i_132_ = 0; i_132_ < is_113_.length; i_132_++) {
							Class523_Sub9 class523_sub9 = class523_sub9s_109_[i_132_];
							for (int i_133_ = 0; i_133_ < i_131_; i_133_++) {
								if (class523_sub9s_106_[i_133_] == class523_sub9)
									continue while_3_;
							}
							class523_sub9s_106_[i_131_++] = class523_sub9;
						}
						short[] is_134_ = (aShortArrayArray9715[i_108_ * (anInt1683 * 692304099) + i_107_] = new short[is_113_.length]);
						for (int i_135_ = 0; i_135_ < is_113_.length; i_135_++) {
							int i_136_ = ((i_107_ << anInt1680 * -1193058675) + is_110_[i_135_]);
							int i_137_ = ((i_108_ << anInt1680 * -1193058675) + is_111_[i_135_]);
							int i_138_ = i_136_ >> anInt9709;
							int i_139_ = i_137_ >> anInt9709;
							int i_140_ = is_113_[i_135_];
							int i_141_ = is_112_[i_135_];
							int i_142_ = is_114_ != null ? is_114_[i_135_] : 0;
							long l = ((long) i_141_ << 48 | (long) i_140_ << 32 | (long) (i_138_ << 16) | (long) i_139_);
							int i_143_ = is_110_[i_135_];
							int i_144_ = is_111_[i_135_];
							int i_145_ = 74;
							int i_146_ = 0;
							float f_147_ = 1.0F;
							float f_148_;
							float f_149_;
							float f_150_;
							if (i_143_ == 0 && i_144_ == 0) {
								f_148_ = f;
								f_149_ = f_116_;
								f_150_ = f_117_;
								i_145_ -= i_127_;
							} else if (i_143_ == 0 && i_144_ == anInt1682 * 341909049) {
								f_148_ = f_118_;
								f_149_ = f_119_;
								f_150_ = f_120_;
								i_145_ -= i_128_;
							} else if (i_143_ == anInt1682 * 341909049 && i_144_ == anInt1682 * 341909049) {
								f_148_ = f_121_;
								f_149_ = f_122_;
								f_150_ = f_123_;
								i_145_ -= i_129_;
							} else if (i_143_ == anInt1682 * 341909049 && i_144_ == 0) {
								f_148_ = f_124_;
								f_149_ = f_125_;
								f_150_ = f_126_;
								i_145_ -= i_130_;
							} else {
								float f_151_ = ((float) i_143_ / (float) (anInt1682 * 341909049));
								float f_152_ = ((float) i_144_ / (float) (anInt1682 * 341909049));
								float f_153_ = f + (f_124_ - f) * f_151_;
								float f_154_ = f_116_ + (f_125_ - f_116_) * f_151_;
								float f_155_ = f_117_ + (f_126_ - f_117_) * f_151_;
								float f_156_ = f_118_ + (f_121_ - f_118_) * f_151_;
								float f_157_ = f_119_ + (f_122_ - f_119_) * f_151_;
								float f_158_ = f_120_ + (f_123_ - f_120_) * f_151_;
								f_148_ = f_153_ + (f_156_ - f_153_) * f_152_;
								f_149_ = f_154_ + (f_157_ - f_154_) * f_152_;
								f_150_ = f_155_ + (f_158_ - f_155_) * f_152_;
								int i_159_ = i_127_ + ((i_130_ - i_127_) * i_143_ >> anInt1680 * -1193058675);
								int i_160_ = i_128_ + ((i_129_ - i_128_) * i_143_ >> anInt1680 * -1193058675);
								i_145_ -= i_159_ + ((i_160_ - i_159_) * i_144_ >> anInt1680 * -1193058675);
							}
							if (i_140_ != -1) {
								int i_161_ = (i_140_ & 0x7f) * i_145_ >> 7;
								if (i_161_ < 2)
									i_161_ = 2;
								else if (i_161_ > 126)
									i_161_ = 126;
								i_146_ = (Class710.anIntArray8839[i_140_ & 0xff80 | i_161_]);
								if ((anInt9726 & 0x7) == 0) {
									f_147_ = ((aClass178_Sub1_9729.aFloatArray9277[0]) * f_148_ + (aClass178_Sub1_9729.aFloatArray9277[1]) * f_149_ + (aClass178_Sub1_9729.aFloatArray9277[2]) * f_150_);
									f_147_ = (aClass178_Sub1_9729.aFloat9359 + f_147_ * (f_147_ > 0.0F ? (aClass178_Sub1_9729.aFloat9343) : (aClass178_Sub1_9729.aFloat9250)));
								}
							}
							Class523 class523 = null;
							if ((i_136_ & anInt9710 - 1) == 0 && (i_137_ & anInt9710 - 1) == 0)
								class523 = class14.method741(l);
							int i_162_;
							if (class523 == null) {
								int i_163_;
								if (i_141_ != i_140_) {
									int i_164_ = (i_141_ & 0x7f) * i_145_ >> 7;
									if (i_164_ < 2)
										i_164_ = 2;
									else if (i_164_ > 126)
										i_164_ = 126;
									i_163_ = (Class710.anIntArray8839[i_141_ & 0xff80 | i_164_]);
									if ((anInt9726 & 0x7) == 0) {
										float f_165_ = ((aClass178_Sub1_9729.aFloatArray9277[0]) * f_148_ + (aClass178_Sub1_9729.aFloatArray9277[1]) * f_149_ + ((aClass178_Sub1_9729.aFloatArray9277[2]) * f_150_));
										f_165_ = (aClass178_Sub1_9729.aFloat9359 + (f_147_ * (f_147_ > 0.0F ? (aClass178_Sub1_9729.aFloat9343) : (aClass178_Sub1_9729.aFloat9250))));
										int i_166_ = i_163_ >> 16 & 0xff;
										int i_167_ = i_163_ >> 8 & 0xff;
										int i_168_ = i_163_ & 0xff;
										i_166_ *= f_165_;
										if (i_166_ < 0)
											i_166_ = 0;
										else if (i_166_ > 255)
											i_166_ = 255;
										i_167_ *= f_165_;
										if (i_167_ < 0)
											i_167_ = 0;
										else if (i_167_ > 255)
											i_167_ = 255;
										i_168_ *= f_165_;
										if (i_168_ < 0)
											i_168_ = 0;
										else if (i_168_ > 255)
											i_168_ = 255;
										i_163_ = (i_166_ << 16 | i_167_ << 8 | i_168_);
									}
								} else
									i_163_ = i_146_;
								if (aClass178_Sub1_9729.aBool9393) {
									stream.method1701((float) i_136_);
									stream.method1701((float) (method2326(i_136_, i_137_, 1336695776) + i_142_));
									stream.method1701((float) i_137_);
									stream.method1700((byte) (i_163_ >> 16));
									stream.method1700((byte) (i_163_ >> 8));
									stream.method1700((byte) i_163_);
									stream.method1700(-1);
									stream.method1701((float) i_136_);
									stream.method1701((float) i_137_);
									if (anIntArrayArrayArray9722 != null)
										stream.method1701(is_115_ != null ? (float) ((is_115_[i_135_]) - 1) : 0.0F);
									if ((anInt9726 & 0x7) != 0) {
										stream.method1701(f_148_);
										stream.method1701(f_149_);
										stream.method1701(f_150_);
									}
								} else {
									stream.method1702((float) i_136_);
									stream.method1702((float) (method2326(i_136_, i_137_, -602175832) + i_142_));
									stream.method1702((float) i_137_);
									stream.method1700((byte) (i_163_ >> 16));
									stream.method1700((byte) (i_163_ >> 8));
									stream.method1700((byte) i_163_);
									stream.method1700(-1);
									stream.method1702((float) i_136_);
									stream.method1702((float) i_137_);
									if (anIntArrayArrayArray9722 != null)
										stream.method1702(is_115_ != null ? (float) ((is_115_[i_135_]) - 1) : 0.0F);
									if ((anInt9726 & 0x7) != 0) {
										stream.method1702(f_148_);
										stream.method1702(f_149_);
										stream.method1702(f_150_);
									}
								}
								i_162_ = anInt9713++;
								is_134_[i_135_] = (short) i_162_;
								if (i_140_ != -1)
									class523_sub9s[i_162_] = class523_sub9s_109_[i_135_];
								class14.method738(new Class523_Sub6(is_134_[i_135_]), l);
							} else {
								is_134_[i_135_] = ((Class523_Sub6) class523).aShort10403;
								i_162_ = is_134_[i_135_] & 0xffff;
								if (i_140_ != -1 && ((class523_sub9s_109_[i_135_].aLong7065 * 1055205983951172633L) < (class523_sub9s[i_162_].aLong7065 * 1055205983951172633L)))
									class523_sub9s[i_162_] = class523_sub9s_109_[i_135_];
							}
							for (int i_169_ = 0; i_169_ < i_131_; i_169_++)
								class523_sub9s_106_[i_169_].method15929(i_162_, i_146_, i_145_, f_147_);
							anInt9721++;
						}
					}
				}
			}
			for (int i_170_ = 0; i_170_ < anInt9713; i_170_++) {
				Class523_Sub9 class523_sub9 = class523_sub9s[i_170_];
				if (class523_sub9 != null)
					class523_sub9.method15926(i_170_);
			}
			for (int i_171_ = 0; i_171_ < anInt1683 * 692304099; i_171_++) {
				for (int i_172_ = 0; i_172_ < anInt1681 * 452998539; i_172_++) {
					short[] is_173_ = (aShortArrayArray9715[i_172_ * (anInt1683 * 692304099) + i_171_]);
					if (is_173_ != null) {
						int i_174_ = 0;
						int i_175_ = 0;
						while (i_175_ < is_173_.length) {
							int i_176_ = is_173_[i_175_++] & 0xffff;
							int i_177_ = is_173_[i_175_++] & 0xffff;
							int i_178_ = is_173_[i_175_++] & 0xffff;
							Class523_Sub9 class523_sub9 = class523_sub9s[i_176_];
							Class523_Sub9 class523_sub9_179_ = class523_sub9s[i_177_];
							Class523_Sub9 class523_sub9_180_ = class523_sub9s[i_178_];
							Class523_Sub9 class523_sub9_181_ = null;
							if (class523_sub9 != null) {
								class523_sub9.method15931(i_171_, i_172_, i_174_);
								class523_sub9_181_ = class523_sub9;
							}
							if (class523_sub9_179_ != null) {
								class523_sub9_179_.method15931(i_171_, i_172_, i_174_);
								if (class523_sub9_181_ == null || ((class523_sub9_179_.aLong7065 * 1055205983951172633L) < (class523_sub9_181_.aLong7065 * 1055205983951172633L)))
									class523_sub9_181_ = class523_sub9_179_;
							}
							if (class523_sub9_180_ != null) {
								class523_sub9_180_.method15931(i_171_, i_172_, i_174_);
								if (class523_sub9_181_ == null || ((class523_sub9_180_.aLong7065 * 1055205983951172633L) < (class523_sub9_181_.aLong7065 * 1055205983951172633L)))
									class523_sub9_181_ = class523_sub9_180_;
							}
							if (class523_sub9_181_ != null) {
								if (class523_sub9 != null)
									class523_sub9_181_.method15926(i_176_);
								if (class523_sub9_179_ != null)
									class523_sub9_181_.method15926(i_177_);
								if (class523_sub9_180_ != null)
									class523_sub9_181_.method15926(i_178_);
								class523_sub9_181_.method15931(i_171_, i_172_, i_174_);
							}
							i_174_++;
						}
					}
				}
			}
			stream.method1703();
			anInterface15_9727 = aClass178_Sub1_9729.method14661(i, nativeheapbuffer, stream.method1698(), false);
			if (anInterface15_9727 instanceof Class135_Sub1)
				nativeheapbuffer.method1678();
			aClass131_9728 = new Class131(anInterface15_9727, 5126, 3, 0);
			aClass131_9706 = new Class131(anInterface15_9727, 5121, 4, 12);
			int i_182_;
			if (anIntArrayArrayArray9722 != null) {
				aClass131_9708 = new Class131(anInterface15_9727, 5126, 3, 16);
				i_182_ = 28;
			} else {
				aClass131_9708 = new Class131(anInterface15_9727, 5126, 2, 16);
				i_182_ = 24;
			}
			if ((anInt9726 & 0x7) != 0)
				aClass131_9730 = new Class131(anInterface15_9727, 5126, 3, i_182_);
			long[] ls = new long[aClass523Array9724.length];
			for (int i_183_ = 0; i_183_ < aClass523Array9724.length; i_183_++) {
				Class523_Sub9 class523_sub9 = (Class523_Sub9) aClass523Array9724[i_183_];
				ls[i_183_] = class523_sub9.aLong7065 * 1055205983951172633L;
				class523_sub9.method15927(anInt9713);
			}
			Class447.method7245(ls, aClass523Array9724, (byte) -78);
			if (aClass147_9720 != null)
				aClass147_9720.method2387();
		} else
			aClass147_9720 = null;
		if ((anInt9736 & 0x2) == 0) {
			anIntArrayArrayArray9712 = null;
			anIntArrayArrayArray9719 = null;
			anIntArrayArrayArray9717 = null;
		}
		anIntArrayArrayArray9722 = null;
		anIntArrayArrayArray9718 = null;
		anIntArrayArrayArray9714 = null;
		aClass523_Sub9ArrayArrayArray9716 = null;
		aByteArrayArray9734 = null;
		aClass14_9738 = null;
		aFloatArrayArray9737 = null;
		aFloatArrayArray9707 = null;
		aFloatArrayArray9735 = null;
	}

	public void method2322(int i, int i_184_, int i_185_, boolean[][] bools, boolean bool, int i_186_) {
		method15336(i, i_184_, i_185_, bools, bool, i_186_);
	}

	void method15336(int i, int i_187_, int i_188_, boolean[][] bools, boolean bool, int i_189_) {
		if (aClass523Array9724 != null) {
			int i_190_ = i_188_ + i_188_ + 1;
			i_190_ *= i_190_;
			if (aClass178_Sub1_9729.anIntArray9432.length < i_190_)
				aClass178_Sub1_9729.anIntArray9432 = new int[i_190_];
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			int i_191_ = i - i_188_;
			int i_192_ = i_191_;
			if (i_191_ < 0)
				i_191_ = 0;
			int i_193_ = i_187_ - i_188_;
			int i_194_ = i_193_;
			if (i_193_ < 0)
				i_193_ = 0;
			int i_195_ = i + i_188_;
			if (i_195_ > anInt1683 * 692304099 - 1)
				i_195_ = anInt1683 * 692304099 - 1;
			int i_196_ = i_187_ + i_188_;
			if (i_196_ > anInt1681 * 452998539 - 1)
				i_196_ = anInt1681 * 452998539 - 1;
			int i_197_ = 0;
			int[] is = aClass178_Sub1_9729.anIntArray9432;
			for (int i_198_ = i_191_; i_198_ <= i_195_; i_198_++) {
				boolean[] bools_199_ = bools[i_198_ - i_192_];
				for (int i_200_ = i_193_; i_200_ <= i_196_; i_200_++) {
					if (bools_199_[i_200_ - i_194_])
						is[i_197_++] = i_200_ * (anInt1683 * 692304099) + i_198_;
				}
			}
			aClass178_Sub1_9729.method14619();
			aClass178_Sub1_9729.method14682((anInt9726 & 0x7) != 0);
			for (int i_201_ = 0; i_201_ < aClass523Array9724.length - 0; i_201_++)
				((Class523_Sub9) aClass523Array9724[i_201_]).method15941(is, i_197_);
			if (!aClass708_9725.method14237((byte) 104)) {
				int i_202_ = aClass178_Sub1_9729.anInt9368;
				int i_203_ = aClass178_Sub1_9729.anInt9369;
				aClass178_Sub1_9729.method3349(0, i_203_, aClass178_Sub1_9729.anInt9261);
				aClass178_Sub1_9729.method14682(false);
				aClass178_Sub1_9729.method14620(false);
				aClass178_Sub1_9729.method14687(128);
				aClass178_Sub1_9729.method14670(-2);
				aClass178_Sub1_9729.method14711(aClass178_Sub1_9729.aClass126_Sub2_9387);
				aClass178_Sub1_9729.method14676(8448, 7681);
				aClass178_Sub1_9729.method14677(0, 34166, 770);
				aClass178_Sub1_9729.method14678(0, 34167, 770);
				for (Class523 class523 = aClass708_9725.method14240(1293810991); class523 != null; class523 = aClass708_9725.method14244((byte) -57)) {
					Class523_Sub21 class523_sub21 = (Class523_Sub21) class523;
					class523_sub21.method16102(i, i_187_, i_188_, bools);
				}
				aClass178_Sub1_9729.method14677(0, 5890, 768);
				aClass178_Sub1_9729.method14678(0, 5890, 770);
				aClass178_Sub1_9729.method14711(null);
				aClass178_Sub1_9729.method3349(i_202_, i_203_, aClass178_Sub1_9729.anInt9261);
			}
			if (aClass147_9720 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass178_Sub1_9729.method14664(aClass131_9728, null, null, aClass131_9708);
				aClass147_9720.method2388(i, i_187_, i_188_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method2325(int i, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, boolean[][] bools) {
		Class168 class168 = aClass178_Sub1_9729.method3039(1407641696);
		if (anInt9732 > 0 && class168 != null) {
			aClass178_Sub1_9729.method14641();
			aClass178_Sub1_9729.method14788(false);
			aClass178_Sub1_9729.method14682(false);
			aClass178_Sub1_9729.method14684(false);
			aClass178_Sub1_9729.method14620(false);
			aClass178_Sub1_9729.method14687(0);
			aClass178_Sub1_9729.method14670(-2);
			aClass178_Sub1_9729.method14711(null);
			aFloatArray9739[0] = (float) i_205_ / (128.0F * (float) (anInt1682 * 341909049) * (float) class168.method2875());
			aFloatArray9739[1] = 0.0F;
			aFloatArray9739[2] = 0.0F;
			aFloatArray9739[3] = 0.0F;
			aFloatArray9739[4] = 0.0F;
			aFloatArray9739[5] = (float) i_205_ / (128.0F * (float) (anInt1682 * 341909049) * (float) class168.method2874());
			aFloatArray9739[6] = 0.0F;
			aFloatArray9739[7] = 0.0F;
			aFloatArray9739[8] = 0.0F;
			aFloatArray9739[9] = 0.0F;
			aFloatArray9739[10] = 0.0F;
			aFloatArray9739[11] = 0.0F;
			aFloatArray9739[12] = -1.0F - ((float) (i_206_ * i_205_) / 128.0F - (float) (i * 2)) / (float) class168.method2875();
			aFloatArray9739[13] = 1.0F - (((float) (2 * i_204_) + (float) (i_209_ * i_205_) / 128.0F) / (float) class168.method2874());
			aFloatArray9739[14] = 0.0F;
			aFloatArray9739[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9739, 0);
			aFloatArray9739[0] = 1.0F;
			aFloatArray9739[1] = 0.0F;
			aFloatArray9739[2] = 0.0F;
			aFloatArray9739[3] = 0.0F;
			aFloatArray9739[4] = 0.0F;
			aFloatArray9739[5] = 0.0F;
			aFloatArray9739[6] = 1.0F;
			aFloatArray9739[7] = 0.0F;
			aFloatArray9739[8] = 0.0F;
			aFloatArray9739[9] = 1.0F;
			aFloatArray9739[10] = 0.0F;
			aFloatArray9739[11] = 0.0F;
			aFloatArray9739[12] = 0.0F;
			aFloatArray9739[13] = 0.0F;
			aFloatArray9739[14] = 0.0F;
			aFloatArray9739[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9739, 0);
			if ((anInt9726 & 0x7) != 0) {
				aClass178_Sub1_9729.method14682(true);
				aClass178_Sub1_9729.method14658();
			} else
				aClass178_Sub1_9729.method14682(false);
			aClass178_Sub1_9729.method14664(aClass131_9728, aClass131_9730, aClass131_9706, aClass131_9708);
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			else
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
			int i_210_ = 0;
			Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321;
			if (aClass178_Sub1_9729.aBool9393) {
				for (int i_211_ = i_207_; i_211_ < i_209_; i_211_++) {
					int i_212_ = i_211_ * (anInt1683 * 692304099) + i_206_;
					for (int i_213_ = i_206_; i_213_ < i_208_; i_213_++) {
						if (bools[i_213_ - i_206_][i_211_ - i_207_]) {
							short[] is = aShortArrayArray9715[i_212_];
							if (is != null) {
								for (int i_214_ = 0; i_214_ < is.length; i_214_++) {
									class523_sub34_sub1.writeShort((is[i_214_] & 0xffff), (byte) -8);
									i_210_++;
								}
							}
						}
						i_212_++;
					}
				}
			} else {
				for (int i_215_ = i_207_; i_215_ < i_209_; i_215_++) {
					int i_216_ = i_215_ * (anInt1683 * 692304099) + i_206_;
					for (int i_217_ = i_206_; i_217_ < i_208_; i_217_++) {
						if (bools[i_217_ - i_206_][i_215_ - i_207_]) {
							short[] is = aShortArrayArray9715[i_216_];
							if (is != null) {
								for (int i_218_ = 0; i_218_ < is.length; i_218_++) {
									class523_sub34_sub1.method16262(is[i_218_] & 0xffff, -2047535161);
									i_210_++;
								}
							}
						}
						i_216_++;
					}
				}
			}
			if (i_210_ > 0) {
				Class130_Sub1 class130_sub1 = new Class130_Sub1(aClass178_Sub1_9729, 5123, class523_sub34_sub1.aByteArray10658, (class523_sub34_sub1.anInt10661 * 2349011));
				aClass178_Sub1_9729.method14652(class130_sub1, 4, 0, i_210_);
			}
		}
	}

	public Class523_Sub27_Sub4 method2330(int i, int i_219_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9723[i][i_219_] & 0x1) == 0)
			return null;
		int i_220_ = anInt1682 * 341909049 >> aClass178_Sub1_9729.anInt9287;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_221_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_220_, i_220_)) {
			class523_sub27_sub4_sub1_221_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_221_.method18495();
		} else
			class523_sub27_sub4_sub1_221_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9729, i_220_, i_220_);
		class523_sub27_sub4_sub1_221_.method18505(0, 0, i_220_, i_220_);
		method15335(class523_sub27_sub4_sub1_221_, i, i_219_);
		return class523_sub27_sub4_sub1_221_;
	}

	public Class523_Sub27_Sub4 method2348(int i, int i_222_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9723[i][i_222_] & 0x1) == 0)
			return null;
		int i_223_ = anInt1682 * 341909049 >> aClass178_Sub1_9729.anInt9287;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_224_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_223_, i_223_)) {
			class523_sub27_sub4_sub1_224_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_224_.method18495();
		} else
			class523_sub27_sub4_sub1_224_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9729, i_223_, i_223_);
		class523_sub27_sub4_sub1_224_.method18505(0, 0, i_223_, i_223_);
		method15335(class523_sub27_sub4_sub1_224_, i, i_222_);
		return class523_sub27_sub4_sub1_224_;
	}

	public boolean method2333(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_225_, int i_226_, int i_227_, boolean bool) {
		if (aClass147_9720 == null || class523_sub27_sub4 == null)
			return false;
		int i_228_ = (i - (i_225_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
		int i_229_ = (i_226_ - (i_225_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
		return aClass147_9720.method2389(class523_sub27_sub4, i_228_, i_229_);
	}

	public void method2353(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_230_, int i_231_, int i_232_, boolean bool) {
		if (aClass147_9720 != null && class523_sub27_sub4 != null) {
			int i_233_ = (i - (i_230_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
			int i_234_ = (i_231_ - (i_230_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
			aClass147_9720.method2390(class523_sub27_sub4, i_233_, i_234_);
		}
	}

	public void method2332(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_235_, int i_236_, int i_237_, boolean bool) {
		if (aClass147_9720 != null && class523_sub27_sub4 != null) {
			int i_238_ = (i - (i_235_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
			int i_239_ = (i_236_ - (i_235_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
			aClass147_9720.method2390(class523_sub27_sub4, i_238_, i_239_);
		}
	}

	public void method2334(Class523_Sub20 class523_sub20, int[] is) {
		aClass708_9725.method14236(new Class523_Sub21(aClass178_Sub1_9729, this, class523_sub20, is), 29358479);
	}

	public void method2319(int i, int i_240_, int i_241_) {
		i = Math.min(aByteArrayArray9734.length - 1, Math.max(0, i));
		i_240_ = Math.min(aByteArrayArray9734[i].length - 1, Math.max(0, i_240_));
		if ((aByteArrayArray9734[i][i_240_] & 0xff) < i_241_)
			aByteArrayArray9734[i][i_240_] = (byte) i_241_;
	}

	public void method2336(int i, int i_242_, int i_243_) {
		i = Math.min(aByteArrayArray9734.length - 1, Math.max(0, i));
		i_242_ = Math.min(aByteArrayArray9734[i].length - 1, Math.max(0, i_242_));
		if ((aByteArrayArray9734[i][i_242_] & 0xff) < i_243_)
			aByteArrayArray9734[i][i_242_] = (byte) i_243_;
	}

	public void method2337(int i, int i_244_, int[] is, int[] is_245_, int[] is_246_, int[] is_247_, int[] is_248_, int[] is_249_, int[] is_250_, int[] is_251_, int[] is_252_, int[] is_253_, int[] is_254_, Class163 class163, boolean bool) {
		int i_255_ = is_251_.length;
		int[] is_256_ = new int[i_255_ * 3];
		int[] is_257_ = new int[i_255_ * 3];
		int[] is_258_ = new int[i_255_ * 3];
		int[] is_259_ = is_252_ != null ? new int[i_255_ * 3] : null;
		int[] is_260_ = new int[i_255_ * 3];
		int[] is_261_ = new int[i_255_ * 3];
		int[] is_262_ = is_245_ != null ? new int[i_255_ * 3] : null;
		int[] is_263_ = is_247_ != null ? new int[i_255_ * 3] : null;
		int i_264_ = 0;
		for (int i_265_ = 0; i_265_ < i_255_; i_265_++) {
			int i_266_ = is_248_[i_265_];
			int i_267_ = is_249_[i_265_];
			int i_268_ = is_250_[i_265_];
			is_256_[i_264_] = is[i_266_];
			is_257_[i_264_] = is_246_[i_266_];
			is_258_[i_264_] = is_251_[i_265_];
			is_260_[i_264_] = is_253_[i_265_];
			is_261_[i_264_] = is_254_[i_265_];
			if (is_252_ != null)
				is_259_[i_264_] = is_252_[i_265_];
			if (is_245_ != null)
				is_262_[i_264_] = is_245_[i_266_];
			if (is_247_ != null)
				is_263_[i_264_] = is_247_[i_266_];
			i_264_++;
			is_256_[i_264_] = is[i_267_];
			is_257_[i_264_] = is_246_[i_267_];
			is_258_[i_264_] = is_251_[i_265_];
			is_260_[i_264_] = is_253_[i_265_];
			is_261_[i_264_] = is_254_[i_265_];
			if (is_252_ != null)
				is_259_[i_264_] = is_252_[i_265_];
			if (is_245_ != null)
				is_262_[i_264_] = is_245_[i_267_];
			if (is_247_ != null)
				is_263_[i_264_] = is_247_[i_267_];
			i_264_++;
			is_256_[i_264_] = is[i_268_];
			is_257_[i_264_] = is_246_[i_268_];
			is_258_[i_264_] = is_251_[i_265_];
			is_260_[i_264_] = is_253_[i_265_];
			is_261_[i_264_] = is_254_[i_265_];
			if (is_252_ != null)
				is_259_[i_264_] = is_252_[i_265_];
			if (is_245_ != null)
				is_262_[i_264_] = is_245_[i_268_];
			if (is_247_ != null)
				is_263_[i_264_] = is_247_[i_268_];
			i_264_++;
		}
		method2351(i, i_244_, is_256_, is_262_, is_257_, is_263_, is_258_, is_259_, is_260_, is_261_, class163, bool);
	}

	public void method2328(int i, int i_269_, int[] is, int[] is_270_, int[] is_271_, int[] is_272_, int[] is_273_, int[] is_274_, int[] is_275_, int[] is_276_, Class163 class163, boolean bool) {
		Class172 class172 = aClass178_Sub1_9729.aClass172_1916;
		if (is_272_ != null && anIntArrayArrayArray9722 == null)
			anIntArrayArrayArray9722 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		if (is_270_ != null && anIntArrayArrayArray9714 == null)
			anIntArrayArrayArray9714 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		anIntArrayArrayArray9719[i][i_269_] = is;
		anIntArrayArrayArray9712[i][i_269_] = is_271_;
		anIntArrayArrayArray9717[i][i_269_] = is_273_;
		anIntArrayArrayArray9718[i][i_269_] = is_274_;
		if (anIntArrayArrayArray9722 != null)
			anIntArrayArrayArray9722[i][i_269_] = is_272_;
		if (anIntArrayArrayArray9714 != null)
			anIntArrayArrayArray9714[i][i_269_] = is_270_;
		Class523_Sub9[] class523_sub9s = (aClass523_Sub9ArrayArrayArray9716[i][i_269_] = new Class523_Sub9[is_273_.length]);
		for (int i_277_ = 0; i_277_ < is_273_.length; i_277_++) {
			int i_278_ = is_275_[i_277_];
			int i_279_ = is_276_[i_277_];
			if ((anInt9726 & 0x20) != 0 && i_278_ != -1 && class172.method2895(i_278_, 129341317).aBool1876) {
				i_279_ = 128;
				i_278_ = -1;
			}
			long l = ((long) (class163.anInt1774 * -1046224519) << 48 | (long) (class163.anInt1775 * -118212955) << 42 | (long) (class163.anInt1776 * -319632409) << 28 | (long) (i_279_ << 14) | (long) i_278_);
			Class523 class523;
			for (class523 = aClass14_9738.method741(l); class523 != null; class523 = aClass14_9738.method740(231172810)) {
				Class523_Sub9 class523_sub9 = (Class523_Sub9) class523;
				if (class523_sub9.anInt10409 == i_278_ && class523_sub9.aFloat10407 == (float) i_279_ && class523_sub9.aClass163_10414.method2591(class163, 835467598))
					break;
			}
			if (class523 == null) {
				class523_sub9s[i_277_] = new Class523_Sub9(this, i_278_, i_279_, class163);
				aClass14_9738.method738(class523_sub9s[i_277_], l);
			} else
				class523_sub9s[i_277_] = (Class523_Sub9) class523;
		}
		if (bool)
			aByteArrayArray9723[i][i_269_] |= 0x1;
		if (is_273_.length > anInt9733)
			anInt9733 = is_273_.length;
		anInt9732 += is_273_.length;
	}

	public void method2343(int i, int i_280_, int i_281_, boolean[][] bools, boolean bool, int i_282_) {
		method15336(i, i_280_, i_281_, bools, bool, i_282_);
	}

	public void method2354(Class523_Sub20 class523_sub20, int[] is) {
		aClass708_9725.method14236(new Class523_Sub21(aClass178_Sub1_9729, this, class523_sub20, is), -388558321);
	}

	public void method2331(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_283_, int i_284_, int i_285_, boolean bool) {
		if (aClass147_9720 != null && class523_sub27_sub4 != null) {
			int i_286_ = (i - (i_283_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
			int i_287_ = (i_284_ - (i_283_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
			aClass147_9720.method2400(class523_sub27_sub4, i_286_, i_287_);
		}
	}

	public void method2342(int i, int i_288_, int i_289_, boolean[][] bools, boolean bool, int i_290_) {
		method15336(i, i_288_, i_289_, bools, bool, i_290_);
	}

	void method15337(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1, int i, int i_291_) {
		int[] is = anIntArrayArrayArray9719[i][i_291_];
		int[] is_292_ = anIntArrayArrayArray9712[i][i_291_];
		int i_293_ = is.length;
		if (aClass178_Sub1_9729.anIntArray9294.length < i_293_) {
			aClass178_Sub1_9729.anIntArray9294 = new int[i_293_];
			aClass178_Sub1_9729.anIntArray9431 = new int[i_293_];
		}
		int[] is_294_ = aClass178_Sub1_9729.anIntArray9294;
		int[] is_295_ = aClass178_Sub1_9729.anIntArray9431;
		for (int i_296_ = 0; i_296_ < i_293_; i_296_++) {
			is_294_[i_296_] = is[i_296_] >> aClass178_Sub1_9729.anInt9287;
			is_295_[i_296_] = is_292_[i_296_] >> aClass178_Sub1_9729.anInt9287;
		}
		int i_297_ = 0;
		while (i_297_ < i_293_) {
			int i_298_ = is_294_[i_297_];
			int i_299_ = is_295_[i_297_++];
			int i_300_ = is_294_[i_297_];
			int i_301_ = is_295_[i_297_++];
			int i_302_ = is_294_[i_297_];
			int i_303_ = is_295_[i_297_++];
			if (((i_298_ - i_300_) * (i_301_ - i_303_) - (i_301_ - i_299_) * (i_302_ - i_300_)) > 0)
				class523_sub27_sub4_sub1.method18503(i_299_, i_301_, i_303_, i_298_, i_300_, i_302_);
		}
	}

	void method15338(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1, int i, int i_304_) {
		int[] is = anIntArrayArrayArray9719[i][i_304_];
		int[] is_305_ = anIntArrayArrayArray9712[i][i_304_];
		int i_306_ = is.length;
		if (aClass178_Sub1_9729.anIntArray9294.length < i_306_) {
			aClass178_Sub1_9729.anIntArray9294 = new int[i_306_];
			aClass178_Sub1_9729.anIntArray9431 = new int[i_306_];
		}
		int[] is_307_ = aClass178_Sub1_9729.anIntArray9294;
		int[] is_308_ = aClass178_Sub1_9729.anIntArray9431;
		for (int i_309_ = 0; i_309_ < i_306_; i_309_++) {
			is_307_[i_309_] = is[i_309_] >> aClass178_Sub1_9729.anInt9287;
			is_308_[i_309_] = is_305_[i_309_] >> aClass178_Sub1_9729.anInt9287;
		}
		int i_310_ = 0;
		while (i_310_ < i_306_) {
			int i_311_ = is_307_[i_310_];
			int i_312_ = is_308_[i_310_++];
			int i_313_ = is_307_[i_310_];
			int i_314_ = is_308_[i_310_++];
			int i_315_ = is_307_[i_310_];
			int i_316_ = is_308_[i_310_++];
			if (((i_311_ - i_313_) * (i_314_ - i_316_) - (i_314_ - i_312_) * (i_315_ - i_313_)) > 0)
				class523_sub27_sub4_sub1.method18503(i_312_, i_314_, i_316_, i_311_, i_313_, i_315_);
		}
	}

	public boolean method2352(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_317_, int i_318_, int i_319_, boolean bool) {
		if (aClass147_9720 == null || class523_sub27_sub4 == null)
			return false;
		int i_320_ = (i - (i_317_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
		int i_321_ = (i_318_ - (i_317_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
		return aClass147_9720.method2389(class523_sub27_sub4, i_320_, i_321_);
	}

	public Class523_Sub27_Sub4 method2346(int i, int i_322_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9723[i][i_322_] & 0x1) == 0)
			return null;
		int i_323_ = anInt1682 * 341909049 >> aClass178_Sub1_9729.anInt9287;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_324_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_323_, i_323_)) {
			class523_sub27_sub4_sub1_324_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_324_.method18495();
		} else
			class523_sub27_sub4_sub1_324_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9729, i_323_, i_323_);
		class523_sub27_sub4_sub1_324_.method18505(0, 0, i_323_, i_323_);
		method15335(class523_sub27_sub4_sub1_324_, i, i_322_);
		return class523_sub27_sub4_sub1_324_;
	}

	public Class523_Sub27_Sub4 method2350(int i, int i_325_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9723[i][i_325_] & 0x1) == 0)
			return null;
		int i_326_ = anInt1682 * 341909049 >> aClass178_Sub1_9729.anInt9287;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_327_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_326_, i_326_)) {
			class523_sub27_sub4_sub1_327_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_327_.method18495();
		} else
			class523_sub27_sub4_sub1_327_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9729, i_326_, i_326_);
		class523_sub27_sub4_sub1_327_.method18505(0, 0, i_326_, i_326_);
		method15335(class523_sub27_sub4_sub1_327_, i, i_325_);
		return class523_sub27_sub4_sub1_327_;
	}

	public void method2351(int i, int i_328_, int[] is, int[] is_329_, int[] is_330_, int[] is_331_, int[] is_332_, int[] is_333_, int[] is_334_, int[] is_335_, Class163 class163, boolean bool) {
		Class172 class172 = aClass178_Sub1_9729.aClass172_1916;
		if (is_331_ != null && anIntArrayArrayArray9722 == null)
			anIntArrayArrayArray9722 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		if (is_329_ != null && anIntArrayArrayArray9714 == null)
			anIntArrayArrayArray9714 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		anIntArrayArrayArray9719[i][i_328_] = is;
		anIntArrayArrayArray9712[i][i_328_] = is_330_;
		anIntArrayArrayArray9717[i][i_328_] = is_332_;
		anIntArrayArrayArray9718[i][i_328_] = is_333_;
		if (anIntArrayArrayArray9722 != null)
			anIntArrayArrayArray9722[i][i_328_] = is_331_;
		if (anIntArrayArrayArray9714 != null)
			anIntArrayArrayArray9714[i][i_328_] = is_329_;
		Class523_Sub9[] class523_sub9s = (aClass523_Sub9ArrayArrayArray9716[i][i_328_] = new Class523_Sub9[is_332_.length]);
		for (int i_336_ = 0; i_336_ < is_332_.length; i_336_++) {
			int i_337_ = is_334_[i_336_];
			int i_338_ = is_335_[i_336_];
			if ((anInt9726 & 0x20) != 0 && i_337_ != -1 && class172.method2895(i_337_, -1813790001).aBool1876) {
				i_338_ = 128;
				i_337_ = -1;
			}
			long l = ((long) (class163.anInt1774 * -1046224519) << 48 | (long) (class163.anInt1775 * -118212955) << 42 | (long) (class163.anInt1776 * -319632409) << 28 | (long) (i_338_ << 14) | (long) i_337_);
			Class523 class523;
			for (class523 = aClass14_9738.method741(l); class523 != null; class523 = aClass14_9738.method740(231172810)) {
				Class523_Sub9 class523_sub9 = (Class523_Sub9) class523;
				if (class523_sub9.anInt10409 == i_337_ && class523_sub9.aFloat10407 == (float) i_338_ && class523_sub9.aClass163_10414.method2591(class163, 1146488895))
					break;
			}
			if (class523 == null) {
				class523_sub9s[i_336_] = new Class523_Sub9(this, i_337_, i_338_, class163);
				aClass14_9738.method738(class523_sub9s[i_336_], l);
			} else
				class523_sub9s[i_336_] = (Class523_Sub9) class523;
		}
		if (bool)
			aByteArrayArray9723[i][i_328_] |= 0x1;
		if (is_332_.length > anInt9733)
			anInt9733 = is_332_.length;
		anInt9732 += is_332_.length;
	}

	public Class523_Sub27_Sub4 method2349(int i, int i_339_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9723[i][i_339_] & 0x1) == 0)
			return null;
		int i_340_ = anInt1682 * 341909049 >> aClass178_Sub1_9729.anInt9287;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_341_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_340_, i_340_)) {
			class523_sub27_sub4_sub1_341_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_341_.method18495();
		} else
			class523_sub27_sub4_sub1_341_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9729, i_340_, i_340_);
		class523_sub27_sub4_sub1_341_.method18505(0, 0, i_340_, i_340_);
		method15335(class523_sub27_sub4_sub1_341_, i, i_339_);
		return class523_sub27_sub4_sub1_341_;
	}

	public void method2324(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_342_, int i_343_, int i_344_, boolean bool) {
		if (aClass147_9720 != null && class523_sub27_sub4 != null) {
			int i_345_ = (i - (i_342_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
			int i_346_ = (i_343_ - (i_342_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
			aClass147_9720.method2400(class523_sub27_sub4, i_345_, i_346_);
		}
	}

	public void method2357(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_347_, int i_348_, int i_349_, boolean bool) {
		if (aClass147_9720 != null && class523_sub27_sub4 != null) {
			int i_350_ = (i - (i_347_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
			int i_351_ = (i_348_ - (i_347_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
			aClass147_9720.method2400(class523_sub27_sub4, i_350_, i_351_);
		}
	}

	public void method2323(int i, int i_352_, int[] is, int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, int[] is_358_, int[] is_359_, int[] is_360_, int[] is_361_, int[] is_362_, Class163 class163, boolean bool) {
		int i_363_ = is_359_.length;
		int[] is_364_ = new int[i_363_ * 3];
		int[] is_365_ = new int[i_363_ * 3];
		int[] is_366_ = new int[i_363_ * 3];
		int[] is_367_ = is_360_ != null ? new int[i_363_ * 3] : null;
		int[] is_368_ = new int[i_363_ * 3];
		int[] is_369_ = new int[i_363_ * 3];
		int[] is_370_ = is_353_ != null ? new int[i_363_ * 3] : null;
		int[] is_371_ = is_355_ != null ? new int[i_363_ * 3] : null;
		int i_372_ = 0;
		for (int i_373_ = 0; i_373_ < i_363_; i_373_++) {
			int i_374_ = is_356_[i_373_];
			int i_375_ = is_357_[i_373_];
			int i_376_ = is_358_[i_373_];
			is_364_[i_372_] = is[i_374_];
			is_365_[i_372_] = is_354_[i_374_];
			is_366_[i_372_] = is_359_[i_373_];
			is_368_[i_372_] = is_361_[i_373_];
			is_369_[i_372_] = is_362_[i_373_];
			if (is_360_ != null)
				is_367_[i_372_] = is_360_[i_373_];
			if (is_353_ != null)
				is_370_[i_372_] = is_353_[i_374_];
			if (is_355_ != null)
				is_371_[i_372_] = is_355_[i_374_];
			i_372_++;
			is_364_[i_372_] = is[i_375_];
			is_365_[i_372_] = is_354_[i_375_];
			is_366_[i_372_] = is_359_[i_373_];
			is_368_[i_372_] = is_361_[i_373_];
			is_369_[i_372_] = is_362_[i_373_];
			if (is_360_ != null)
				is_367_[i_372_] = is_360_[i_373_];
			if (is_353_ != null)
				is_370_[i_372_] = is_353_[i_375_];
			if (is_355_ != null)
				is_371_[i_372_] = is_355_[i_375_];
			i_372_++;
			is_364_[i_372_] = is[i_376_];
			is_365_[i_372_] = is_354_[i_376_];
			is_366_[i_372_] = is_359_[i_373_];
			is_368_[i_372_] = is_361_[i_373_];
			is_369_[i_372_] = is_362_[i_373_];
			if (is_360_ != null)
				is_367_[i_372_] = is_360_[i_373_];
			if (is_353_ != null)
				is_370_[i_372_] = is_353_[i_376_];
			if (is_355_ != null)
				is_371_[i_372_] = is_355_[i_376_];
			i_372_++;
		}
		method2351(i, i_352_, is_364_, is_370_, is_365_, is_371_, is_366_, is_367_, is_368_, is_369_, class163, bool);
	}

	public boolean method2341(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_377_, int i_378_, int i_379_, boolean bool) {
		if (aClass147_9720 == null || class523_sub27_sub4 == null)
			return false;
		int i_380_ = (i - (i_377_ * aClass178_Sub1_9729.anInt9372 >> 8) >> aClass178_Sub1_9729.anInt9287);
		int i_381_ = (i_378_ - (i_377_ * aClass178_Sub1_9729.anInt9366 >> 8) >> aClass178_Sub1_9729.anInt9287);
		return aClass147_9720.method2389(class523_sub27_sub4, i_380_, i_381_);
	}

	public void method2339(int i, int i_382_, int[] is, int[] is_383_, int[] is_384_, int[] is_385_, int[] is_386_, int[] is_387_, int[] is_388_, int[] is_389_, Class163 class163, boolean bool) {
		Class172 class172 = aClass178_Sub1_9729.aClass172_1916;
		if (is_385_ != null && anIntArrayArrayArray9722 == null)
			anIntArrayArrayArray9722 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		if (is_383_ != null && anIntArrayArrayArray9714 == null)
			anIntArrayArrayArray9714 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		anIntArrayArrayArray9719[i][i_382_] = is;
		anIntArrayArrayArray9712[i][i_382_] = is_384_;
		anIntArrayArrayArray9717[i][i_382_] = is_386_;
		anIntArrayArrayArray9718[i][i_382_] = is_387_;
		if (anIntArrayArrayArray9722 != null)
			anIntArrayArrayArray9722[i][i_382_] = is_385_;
		if (anIntArrayArrayArray9714 != null)
			anIntArrayArrayArray9714[i][i_382_] = is_383_;
		Class523_Sub9[] class523_sub9s = (aClass523_Sub9ArrayArrayArray9716[i][i_382_] = new Class523_Sub9[is_386_.length]);
		for (int i_390_ = 0; i_390_ < is_386_.length; i_390_++) {
			int i_391_ = is_388_[i_390_];
			int i_392_ = is_389_[i_390_];
			if ((anInt9726 & 0x20) != 0 && i_391_ != -1 && class172.method2895(i_391_, -29460417).aBool1876) {
				i_392_ = 128;
				i_391_ = -1;
			}
			long l = ((long) (class163.anInt1774 * -1046224519) << 48 | (long) (class163.anInt1775 * -118212955) << 42 | (long) (class163.anInt1776 * -319632409) << 28 | (long) (i_392_ << 14) | (long) i_391_);
			Class523 class523;
			for (class523 = aClass14_9738.method741(l); class523 != null; class523 = aClass14_9738.method740(231172810)) {
				Class523_Sub9 class523_sub9 = (Class523_Sub9) class523;
				if (class523_sub9.anInt10409 == i_391_ && class523_sub9.aFloat10407 == (float) i_392_ && class523_sub9.aClass163_10414.method2591(class163, -798160671))
					break;
			}
			if (class523 == null) {
				class523_sub9s[i_390_] = new Class523_Sub9(this, i_391_, i_392_, class163);
				aClass14_9738.method738(class523_sub9s[i_390_], l);
			} else
				class523_sub9s[i_390_] = (Class523_Sub9) class523;
		}
		if (bool)
			aByteArrayArray9723[i][i_382_] |= 0x1;
		if (is_386_.length > anInt9733)
			anInt9733 = is_386_.length;
		anInt9732 += is_386_.length;
	}

	public void method2345(int i, int i_393_, int i_394_, int i_395_, int i_396_, int i_397_, int i_398_, boolean[][] bools) {
		Class168 class168 = aClass178_Sub1_9729.method3039(1808008881);
		if (anInt9732 > 0 && class168 != null) {
			aClass178_Sub1_9729.method14641();
			aClass178_Sub1_9729.method14788(false);
			aClass178_Sub1_9729.method14682(false);
			aClass178_Sub1_9729.method14684(false);
			aClass178_Sub1_9729.method14620(false);
			aClass178_Sub1_9729.method14687(0);
			aClass178_Sub1_9729.method14670(-2);
			aClass178_Sub1_9729.method14711(null);
			aFloatArray9739[0] = (float) i_394_ / (128.0F * (float) (anInt1682 * 341909049) * (float) class168.method2875());
			aFloatArray9739[1] = 0.0F;
			aFloatArray9739[2] = 0.0F;
			aFloatArray9739[3] = 0.0F;
			aFloatArray9739[4] = 0.0F;
			aFloatArray9739[5] = (float) i_394_ / (128.0F * (float) (anInt1682 * 341909049) * (float) class168.method2874());
			aFloatArray9739[6] = 0.0F;
			aFloatArray9739[7] = 0.0F;
			aFloatArray9739[8] = 0.0F;
			aFloatArray9739[9] = 0.0F;
			aFloatArray9739[10] = 0.0F;
			aFloatArray9739[11] = 0.0F;
			aFloatArray9739[12] = -1.0F - ((float) (i_395_ * i_394_) / 128.0F - (float) (i * 2)) / (float) class168.method2875();
			aFloatArray9739[13] = 1.0F - (((float) (2 * i_393_) + (float) (i_398_ * i_394_) / 128.0F) / (float) class168.method2874());
			aFloatArray9739[14] = 0.0F;
			aFloatArray9739[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9739, 0);
			aFloatArray9739[0] = 1.0F;
			aFloatArray9739[1] = 0.0F;
			aFloatArray9739[2] = 0.0F;
			aFloatArray9739[3] = 0.0F;
			aFloatArray9739[4] = 0.0F;
			aFloatArray9739[5] = 0.0F;
			aFloatArray9739[6] = 1.0F;
			aFloatArray9739[7] = 0.0F;
			aFloatArray9739[8] = 0.0F;
			aFloatArray9739[9] = 1.0F;
			aFloatArray9739[10] = 0.0F;
			aFloatArray9739[11] = 0.0F;
			aFloatArray9739[12] = 0.0F;
			aFloatArray9739[13] = 0.0F;
			aFloatArray9739[14] = 0.0F;
			aFloatArray9739[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9739, 0);
			if ((anInt9726 & 0x7) != 0) {
				aClass178_Sub1_9729.method14682(true);
				aClass178_Sub1_9729.method14658();
			} else
				aClass178_Sub1_9729.method14682(false);
			aClass178_Sub1_9729.method14664(aClass131_9728, aClass131_9730, aClass131_9706, aClass131_9708);
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			else
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
			int i_399_ = 0;
			Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321;
			if (aClass178_Sub1_9729.aBool9393) {
				for (int i_400_ = i_396_; i_400_ < i_398_; i_400_++) {
					int i_401_ = i_400_ * (anInt1683 * 692304099) + i_395_;
					for (int i_402_ = i_395_; i_402_ < i_397_; i_402_++) {
						if (bools[i_402_ - i_395_][i_400_ - i_396_]) {
							short[] is = aShortArrayArray9715[i_401_];
							if (is != null) {
								for (int i_403_ = 0; i_403_ < is.length; i_403_++) {
									class523_sub34_sub1.writeShort((is[i_403_] & 0xffff), (byte) -3);
									i_399_++;
								}
							}
						}
						i_401_++;
					}
				}
			} else {
				for (int i_404_ = i_396_; i_404_ < i_398_; i_404_++) {
					int i_405_ = i_404_ * (anInt1683 * 692304099) + i_395_;
					for (int i_406_ = i_395_; i_406_ < i_397_; i_406_++) {
						if (bools[i_406_ - i_395_][i_404_ - i_396_]) {
							short[] is = aShortArrayArray9715[i_405_];
							if (is != null) {
								for (int i_407_ = 0; i_407_ < is.length; i_407_++) {
									class523_sub34_sub1.method16262(is[i_407_] & 0xffff, -793106166);
									i_399_++;
								}
							}
						}
						i_405_++;
					}
				}
			}
			if (i_399_ > 0) {
				Class130_Sub1 class130_sub1 = new Class130_Sub1(aClass178_Sub1_9729, 5123, class523_sub34_sub1.aByteArray10658, (class523_sub34_sub1.anInt10661 * 2349011));
				aClass178_Sub1_9729.method14652(class130_sub1, 4, 0, i_399_);
			}
		}
	}

	void method15339(int i, int i_408_, int i_409_, boolean[][] bools, boolean bool, int i_410_) {
		if (aClass523Array9724 != null) {
			int i_411_ = i_409_ + i_409_ + 1;
			i_411_ *= i_411_;
			if (aClass178_Sub1_9729.anIntArray9432.length < i_411_)
				aClass178_Sub1_9729.anIntArray9432 = new int[i_411_];
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			int i_412_ = i - i_409_;
			int i_413_ = i_412_;
			if (i_412_ < 0)
				i_412_ = 0;
			int i_414_ = i_408_ - i_409_;
			int i_415_ = i_414_;
			if (i_414_ < 0)
				i_414_ = 0;
			int i_416_ = i + i_409_;
			if (i_416_ > anInt1683 * 692304099 - 1)
				i_416_ = anInt1683 * 692304099 - 1;
			int i_417_ = i_408_ + i_409_;
			if (i_417_ > anInt1681 * 452998539 - 1)
				i_417_ = anInt1681 * 452998539 - 1;
			int i_418_ = 0;
			int[] is = aClass178_Sub1_9729.anIntArray9432;
			for (int i_419_ = i_412_; i_419_ <= i_416_; i_419_++) {
				boolean[] bools_420_ = bools[i_419_ - i_413_];
				for (int i_421_ = i_414_; i_421_ <= i_417_; i_421_++) {
					if (bools_420_[i_421_ - i_415_])
						is[i_418_++] = i_421_ * (anInt1683 * 692304099) + i_419_;
				}
			}
			aClass178_Sub1_9729.method14619();
			aClass178_Sub1_9729.method14682((anInt9726 & 0x7) != 0);
			for (int i_422_ = 0; i_422_ < aClass523Array9724.length - 0; i_422_++)
				((Class523_Sub9) aClass523Array9724[i_422_]).method15941(is, i_418_);
			if (!aClass708_9725.method14237((byte) 104)) {
				int i_423_ = aClass178_Sub1_9729.anInt9368;
				int i_424_ = aClass178_Sub1_9729.anInt9369;
				aClass178_Sub1_9729.method3349(0, i_424_, aClass178_Sub1_9729.anInt9261);
				aClass178_Sub1_9729.method14682(false);
				aClass178_Sub1_9729.method14620(false);
				aClass178_Sub1_9729.method14687(128);
				aClass178_Sub1_9729.method14670(-2);
				aClass178_Sub1_9729.method14711(aClass178_Sub1_9729.aClass126_Sub2_9387);
				aClass178_Sub1_9729.method14676(8448, 7681);
				aClass178_Sub1_9729.method14677(0, 34166, 770);
				aClass178_Sub1_9729.method14678(0, 34167, 770);
				for (Class523 class523 = aClass708_9725.method14240(1483952732); class523 != null; class523 = aClass708_9725.method14244((byte) -2)) {
					Class523_Sub21 class523_sub21 = (Class523_Sub21) class523;
					class523_sub21.method16102(i, i_408_, i_409_, bools);
				}
				aClass178_Sub1_9729.method14677(0, 5890, 768);
				aClass178_Sub1_9729.method14678(0, 5890, 770);
				aClass178_Sub1_9729.method14711(null);
				aClass178_Sub1_9729.method3349(i_423_, i_424_, aClass178_Sub1_9729.anInt9261);
			}
			if (aClass147_9720 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass178_Sub1_9729.method14664(aClass131_9728, null, null, aClass131_9708);
				aClass147_9720.method2388(i, i_408_, i_409_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	void method15340(int i, int i_425_, int i_426_, boolean[][] bools, boolean bool, int i_427_) {
		if (aClass523Array9724 != null) {
			int i_428_ = i_426_ + i_426_ + 1;
			i_428_ *= i_428_;
			if (aClass178_Sub1_9729.anIntArray9432.length < i_428_)
				aClass178_Sub1_9729.anIntArray9432 = new int[i_428_];
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			int i_429_ = i - i_426_;
			int i_430_ = i_429_;
			if (i_429_ < 0)
				i_429_ = 0;
			int i_431_ = i_425_ - i_426_;
			int i_432_ = i_431_;
			if (i_431_ < 0)
				i_431_ = 0;
			int i_433_ = i + i_426_;
			if (i_433_ > anInt1683 * 692304099 - 1)
				i_433_ = anInt1683 * 692304099 - 1;
			int i_434_ = i_425_ + i_426_;
			if (i_434_ > anInt1681 * 452998539 - 1)
				i_434_ = anInt1681 * 452998539 - 1;
			int i_435_ = 0;
			int[] is = aClass178_Sub1_9729.anIntArray9432;
			for (int i_436_ = i_429_; i_436_ <= i_433_; i_436_++) {
				boolean[] bools_437_ = bools[i_436_ - i_430_];
				for (int i_438_ = i_431_; i_438_ <= i_434_; i_438_++) {
					if (bools_437_[i_438_ - i_432_])
						is[i_435_++] = i_438_ * (anInt1683 * 692304099) + i_436_;
				}
			}
			aClass178_Sub1_9729.method14619();
			aClass178_Sub1_9729.method14682((anInt9726 & 0x7) != 0);
			for (int i_439_ = 0; i_439_ < aClass523Array9724.length - 0; i_439_++)
				((Class523_Sub9) aClass523Array9724[i_439_]).method15941(is, i_435_);
			if (!aClass708_9725.method14237((byte) 104)) {
				int i_440_ = aClass178_Sub1_9729.anInt9368;
				int i_441_ = aClass178_Sub1_9729.anInt9369;
				aClass178_Sub1_9729.method3349(0, i_441_, aClass178_Sub1_9729.anInt9261);
				aClass178_Sub1_9729.method14682(false);
				aClass178_Sub1_9729.method14620(false);
				aClass178_Sub1_9729.method14687(128);
				aClass178_Sub1_9729.method14670(-2);
				aClass178_Sub1_9729.method14711(aClass178_Sub1_9729.aClass126_Sub2_9387);
				aClass178_Sub1_9729.method14676(8448, 7681);
				aClass178_Sub1_9729.method14677(0, 34166, 770);
				aClass178_Sub1_9729.method14678(0, 34167, 770);
				for (Class523 class523 = aClass708_9725.method14240(805775530); class523 != null; class523 = aClass708_9725.method14244((byte) 51)) {
					Class523_Sub21 class523_sub21 = (Class523_Sub21) class523;
					class523_sub21.method16102(i, i_425_, i_426_, bools);
				}
				aClass178_Sub1_9729.method14677(0, 5890, 768);
				aClass178_Sub1_9729.method14678(0, 5890, 770);
				aClass178_Sub1_9729.method14711(null);
				aClass178_Sub1_9729.method3349(i_440_, i_441_, aClass178_Sub1_9729.anInt9261);
			}
			if (aClass147_9720 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass178_Sub1_9729.method14664(aClass131_9728, null, null, aClass131_9708);
				aClass147_9720.method2388(i, i_425_, i_426_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	void method15341(int i, int i_442_, int i_443_, boolean[][] bools, boolean bool, int i_444_) {
		if (aClass523Array9724 != null) {
			int i_445_ = i_443_ + i_443_ + 1;
			i_445_ *= i_445_;
			if (aClass178_Sub1_9729.anIntArray9432.length < i_445_)
				aClass178_Sub1_9729.anIntArray9432 = new int[i_445_];
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			int i_446_ = i - i_443_;
			int i_447_ = i_446_;
			if (i_446_ < 0)
				i_446_ = 0;
			int i_448_ = i_442_ - i_443_;
			int i_449_ = i_448_;
			if (i_448_ < 0)
				i_448_ = 0;
			int i_450_ = i + i_443_;
			if (i_450_ > anInt1683 * 692304099 - 1)
				i_450_ = anInt1683 * 692304099 - 1;
			int i_451_ = i_442_ + i_443_;
			if (i_451_ > anInt1681 * 452998539 - 1)
				i_451_ = anInt1681 * 452998539 - 1;
			int i_452_ = 0;
			int[] is = aClass178_Sub1_9729.anIntArray9432;
			for (int i_453_ = i_446_; i_453_ <= i_450_; i_453_++) {
				boolean[] bools_454_ = bools[i_453_ - i_447_];
				for (int i_455_ = i_448_; i_455_ <= i_451_; i_455_++) {
					if (bools_454_[i_455_ - i_449_])
						is[i_452_++] = i_455_ * (anInt1683 * 692304099) + i_453_;
				}
			}
			aClass178_Sub1_9729.method14619();
			aClass178_Sub1_9729.method14682((anInt9726 & 0x7) != 0);
			for (int i_456_ = 0; i_456_ < aClass523Array9724.length - 0; i_456_++)
				((Class523_Sub9) aClass523Array9724[i_456_]).method15941(is, i_452_);
			if (!aClass708_9725.method14237((byte) 104)) {
				int i_457_ = aClass178_Sub1_9729.anInt9368;
				int i_458_ = aClass178_Sub1_9729.anInt9369;
				aClass178_Sub1_9729.method3349(0, i_458_, aClass178_Sub1_9729.anInt9261);
				aClass178_Sub1_9729.method14682(false);
				aClass178_Sub1_9729.method14620(false);
				aClass178_Sub1_9729.method14687(128);
				aClass178_Sub1_9729.method14670(-2);
				aClass178_Sub1_9729.method14711(aClass178_Sub1_9729.aClass126_Sub2_9387);
				aClass178_Sub1_9729.method14676(8448, 7681);
				aClass178_Sub1_9729.method14677(0, 34166, 770);
				aClass178_Sub1_9729.method14678(0, 34167, 770);
				for (Class523 class523 = aClass708_9725.method14240(675646567); class523 != null; class523 = aClass708_9725.method14244((byte) -63)) {
					Class523_Sub21 class523_sub21 = (Class523_Sub21) class523;
					class523_sub21.method16102(i, i_442_, i_443_, bools);
				}
				aClass178_Sub1_9729.method14677(0, 5890, 768);
				aClass178_Sub1_9729.method14678(0, 5890, 770);
				aClass178_Sub1_9729.method14711(null);
				aClass178_Sub1_9729.method3349(i_457_, i_458_, aClass178_Sub1_9729.anInt9261);
			}
			if (aClass147_9720 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass178_Sub1_9729.method14664(aClass131_9728, null, null, aClass131_9708);
				aClass147_9720.method2388(i, i_442_, i_443_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	void method15342(int i, int i_459_, int i_460_, boolean[][] bools, boolean bool, int i_461_) {
		if (aClass523Array9724 != null) {
			int i_462_ = i_460_ + i_460_ + 1;
			i_462_ *= i_462_;
			if (aClass178_Sub1_9729.anIntArray9432.length < i_462_)
				aClass178_Sub1_9729.anIntArray9432 = new int[i_462_];
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			int i_463_ = i - i_460_;
			int i_464_ = i_463_;
			if (i_463_ < 0)
				i_463_ = 0;
			int i_465_ = i_459_ - i_460_;
			int i_466_ = i_465_;
			if (i_465_ < 0)
				i_465_ = 0;
			int i_467_ = i + i_460_;
			if (i_467_ > anInt1683 * 692304099 - 1)
				i_467_ = anInt1683 * 692304099 - 1;
			int i_468_ = i_459_ + i_460_;
			if (i_468_ > anInt1681 * 452998539 - 1)
				i_468_ = anInt1681 * 452998539 - 1;
			int i_469_ = 0;
			int[] is = aClass178_Sub1_9729.anIntArray9432;
			for (int i_470_ = i_463_; i_470_ <= i_467_; i_470_++) {
				boolean[] bools_471_ = bools[i_470_ - i_464_];
				for (int i_472_ = i_465_; i_472_ <= i_468_; i_472_++) {
					if (bools_471_[i_472_ - i_466_])
						is[i_469_++] = i_472_ * (anInt1683 * 692304099) + i_470_;
				}
			}
			aClass178_Sub1_9729.method14619();
			aClass178_Sub1_9729.method14682((anInt9726 & 0x7) != 0);
			for (int i_473_ = 0; i_473_ < aClass523Array9724.length - 0; i_473_++)
				((Class523_Sub9) aClass523Array9724[i_473_]).method15941(is, i_469_);
			if (!aClass708_9725.method14237((byte) 104)) {
				int i_474_ = aClass178_Sub1_9729.anInt9368;
				int i_475_ = aClass178_Sub1_9729.anInt9369;
				aClass178_Sub1_9729.method3349(0, i_475_, aClass178_Sub1_9729.anInt9261);
				aClass178_Sub1_9729.method14682(false);
				aClass178_Sub1_9729.method14620(false);
				aClass178_Sub1_9729.method14687(128);
				aClass178_Sub1_9729.method14670(-2);
				aClass178_Sub1_9729.method14711(aClass178_Sub1_9729.aClass126_Sub2_9387);
				aClass178_Sub1_9729.method14676(8448, 7681);
				aClass178_Sub1_9729.method14677(0, 34166, 770);
				aClass178_Sub1_9729.method14678(0, 34167, 770);
				for (Class523 class523 = aClass708_9725.method14240(1592969555); class523 != null; class523 = aClass708_9725.method14244((byte) 72)) {
					Class523_Sub21 class523_sub21 = (Class523_Sub21) class523;
					class523_sub21.method16102(i, i_459_, i_460_, bools);
				}
				aClass178_Sub1_9729.method14677(0, 5890, 768);
				aClass178_Sub1_9729.method14678(0, 5890, 770);
				aClass178_Sub1_9729.method14711(null);
				aClass178_Sub1_9729.method3349(i_474_, i_475_, aClass178_Sub1_9729.anInt9261);
			}
			if (aClass147_9720 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass178_Sub1_9729.method14664(aClass131_9728, null, null, aClass131_9708);
				aClass147_9720.method2388(i, i_459_, i_460_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public void method2338(int i, int i_476_, int i_477_, int i_478_, int i_479_, int i_480_, int i_481_, boolean[][] bools) {
		Class168 class168 = aClass178_Sub1_9729.method3039(1883507504);
		if (anInt9732 > 0 && class168 != null) {
			aClass178_Sub1_9729.method14641();
			aClass178_Sub1_9729.method14788(false);
			aClass178_Sub1_9729.method14682(false);
			aClass178_Sub1_9729.method14684(false);
			aClass178_Sub1_9729.method14620(false);
			aClass178_Sub1_9729.method14687(0);
			aClass178_Sub1_9729.method14670(-2);
			aClass178_Sub1_9729.method14711(null);
			aFloatArray9739[0] = (float) i_477_ / (128.0F * (float) (anInt1682 * 341909049) * (float) class168.method2875());
			aFloatArray9739[1] = 0.0F;
			aFloatArray9739[2] = 0.0F;
			aFloatArray9739[3] = 0.0F;
			aFloatArray9739[4] = 0.0F;
			aFloatArray9739[5] = (float) i_477_ / (128.0F * (float) (anInt1682 * 341909049) * (float) class168.method2874());
			aFloatArray9739[6] = 0.0F;
			aFloatArray9739[7] = 0.0F;
			aFloatArray9739[8] = 0.0F;
			aFloatArray9739[9] = 0.0F;
			aFloatArray9739[10] = 0.0F;
			aFloatArray9739[11] = 0.0F;
			aFloatArray9739[12] = -1.0F - ((float) (i_478_ * i_477_) / 128.0F - (float) (i * 2)) / (float) class168.method2875();
			aFloatArray9739[13] = 1.0F - (((float) (2 * i_476_) + (float) (i_481_ * i_477_) / 128.0F) / (float) class168.method2874());
			aFloatArray9739[14] = 0.0F;
			aFloatArray9739[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray9739, 0);
			aFloatArray9739[0] = 1.0F;
			aFloatArray9739[1] = 0.0F;
			aFloatArray9739[2] = 0.0F;
			aFloatArray9739[3] = 0.0F;
			aFloatArray9739[4] = 0.0F;
			aFloatArray9739[5] = 0.0F;
			aFloatArray9739[6] = 1.0F;
			aFloatArray9739[7] = 0.0F;
			aFloatArray9739[8] = 0.0F;
			aFloatArray9739[9] = 1.0F;
			aFloatArray9739[10] = 0.0F;
			aFloatArray9739[11] = 0.0F;
			aFloatArray9739[12] = 0.0F;
			aFloatArray9739[13] = 0.0F;
			aFloatArray9739[14] = 0.0F;
			aFloatArray9739[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray9739, 0);
			if ((anInt9726 & 0x7) != 0) {
				aClass178_Sub1_9729.method14682(true);
				aClass178_Sub1_9729.method14658();
			} else
				aClass178_Sub1_9729.method14682(false);
			aClass178_Sub1_9729.method14664(aClass131_9728, aClass131_9730, aClass131_9706, aClass131_9708);
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			else
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
			int i_482_ = 0;
			Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321;
			if (aClass178_Sub1_9729.aBool9393) {
				for (int i_483_ = i_479_; i_483_ < i_481_; i_483_++) {
					int i_484_ = i_483_ * (anInt1683 * 692304099) + i_478_;
					for (int i_485_ = i_478_; i_485_ < i_480_; i_485_++) {
						if (bools[i_485_ - i_478_][i_483_ - i_479_]) {
							short[] is = aShortArrayArray9715[i_484_];
							if (is != null) {
								for (int i_486_ = 0; i_486_ < is.length; i_486_++) {
									class523_sub34_sub1.writeShort(is[i_486_] & 0xffff, (byte) -64);
									i_482_++;
								}
							}
						}
						i_484_++;
					}
				}
			} else {
				for (int i_487_ = i_479_; i_487_ < i_481_; i_487_++) {
					int i_488_ = i_487_ * (anInt1683 * 692304099) + i_478_;
					for (int i_489_ = i_478_; i_489_ < i_480_; i_489_++) {
						if (bools[i_489_ - i_478_][i_487_ - i_479_]) {
							short[] is = aShortArrayArray9715[i_488_];
							if (is != null) {
								for (int i_490_ = 0; i_490_ < is.length; i_490_++) {
									class523_sub34_sub1.method16262(is[i_490_] & 0xffff, -1182528865);
									i_482_++;
								}
							}
						}
						i_488_++;
					}
				}
			}
			if (i_482_ > 0) {
				Class130_Sub1 class130_sub1 = new Class130_Sub1(aClass178_Sub1_9729, 5123, class523_sub34_sub1.aByteArray10658, (class523_sub34_sub1.anInt10661 * 2349011));
				aClass178_Sub1_9729.method14652(class130_sub1, 4, 0, i_482_);
			}
		}
	}

	public void method2359() {
		if (anInt9732 > 0) {
			byte[][] is = (new byte[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1]);
			for (int i = 1; i < anInt1683 * 692304099; i++) {
				for (int i_491_ = 1; i_491_ < anInt1681 * 452998539; i_491_++)
					is[i][i_491_] = (byte) ((aByteArrayArray9734[i - 1][i_491_] >> 2) + (aByteArrayArray9734[i + 1][i_491_] >> 3) + (aByteArrayArray9734[i][i_491_ - 1] >> 2) + (aByteArrayArray9734[i][i_491_ + 1] >> 3) + (aByteArrayArray9734[i][i_491_] >> 1));
			}
			aClass523Array9724 = new Class523[aClass14_9738.method734(130182245)];
			aClass14_9738.method739(aClass523Array9724, (byte) -23);
			for (int i = 0; i < aClass523Array9724.length; i++)
				((Class523_Sub9) aClass523Array9724[i]).method15930(anInt9732);
			int i = 24;
			if (anIntArrayArrayArray9722 != null)
				i += 4;
			if ((anInt9726 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = aClass178_Sub1_9729.aNativeHeap9289.method1905(anInt9732 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class523_Sub9[] class523_sub9s = new Class523_Sub9[anInt9732];
			int i_492_ = Class375.method6383(anInt9732 / 4, 189765723);
			if (i_492_ < 1)
				i_492_ = 1;
			Class14 class14 = new Class14(i_492_);
			Class523_Sub9[] class523_sub9s_493_ = new Class523_Sub9[anInt9733];
			for (int i_494_ = 0; i_494_ < anInt1683 * 692304099; i_494_++) {
				for (int i_495_ = 0; i_495_ < anInt1681 * 452998539; i_495_++) {
					if (anIntArrayArrayArray9717[i_494_][i_495_] != null) {
						Class523_Sub9[] class523_sub9s_496_ = (aClass523_Sub9ArrayArrayArray9716[i_494_][i_495_]);
						int[] is_497_ = anIntArrayArrayArray9719[i_494_][i_495_];
						int[] is_498_ = anIntArrayArrayArray9712[i_494_][i_495_];
						int[] is_499_ = anIntArrayArrayArray9718[i_494_][i_495_];
						int[] is_500_ = anIntArrayArrayArray9717[i_494_][i_495_];
						int[] is_501_ = (anIntArrayArrayArray9714 != null ? anIntArrayArrayArray9714[i_494_][i_495_] : null);
						int[] is_502_ = (anIntArrayArrayArray9722 != null ? anIntArrayArrayArray9722[i_494_][i_495_] : null);
						if (is_499_ == null)
							is_499_ = is_500_;
						float f = aFloatArrayArray9735[i_494_][i_495_];
						float f_503_ = aFloatArrayArray9707[i_494_][i_495_];
						float f_504_ = aFloatArrayArray9737[i_494_][i_495_];
						float f_505_ = aFloatArrayArray9735[i_494_][i_495_ + 1];
						float f_506_ = aFloatArrayArray9707[i_494_][i_495_ + 1];
						float f_507_ = aFloatArrayArray9737[i_494_][i_495_ + 1];
						float f_508_ = aFloatArrayArray9735[i_494_ + 1][i_495_ + 1];
						float f_509_ = aFloatArrayArray9707[i_494_ + 1][i_495_ + 1];
						float f_510_ = aFloatArrayArray9737[i_494_ + 1][i_495_ + 1];
						float f_511_ = aFloatArrayArray9735[i_494_ + 1][i_495_];
						float f_512_ = aFloatArrayArray9707[i_494_ + 1][i_495_];
						float f_513_ = aFloatArrayArray9737[i_494_ + 1][i_495_];
						int i_514_ = is[i_494_][i_495_] & 0xff;
						int i_515_ = is[i_494_][i_495_ + 1] & 0xff;
						int i_516_ = is[i_494_ + 1][i_495_ + 1] & 0xff;
						int i_517_ = is[i_494_ + 1][i_495_] & 0xff;
						int i_518_ = 0;
						while_5_: for (int i_519_ = 0; i_519_ < is_500_.length; i_519_++) {
							Class523_Sub9 class523_sub9 = class523_sub9s_496_[i_519_];
							for (int i_520_ = 0; i_520_ < i_518_; i_520_++) {
								if (class523_sub9s_493_[i_520_] == class523_sub9)
									continue while_5_;
							}
							class523_sub9s_493_[i_518_++] = class523_sub9;
						}
						short[] is_521_ = (aShortArrayArray9715[i_495_ * (anInt1683 * 692304099) + i_494_] = new short[is_500_.length]);
						for (int i_522_ = 0; i_522_ < is_500_.length; i_522_++) {
							int i_523_ = ((i_494_ << anInt1680 * -1193058675) + is_497_[i_522_]);
							int i_524_ = ((i_495_ << anInt1680 * -1193058675) + is_498_[i_522_]);
							int i_525_ = i_523_ >> anInt9709;
							int i_526_ = i_524_ >> anInt9709;
							int i_527_ = is_500_[i_522_];
							int i_528_ = is_499_[i_522_];
							int i_529_ = is_501_ != null ? is_501_[i_522_] : 0;
							long l = ((long) i_528_ << 48 | (long) i_527_ << 32 | (long) (i_525_ << 16) | (long) i_526_);
							int i_530_ = is_497_[i_522_];
							int i_531_ = is_498_[i_522_];
							int i_532_ = 74;
							int i_533_ = 0;
							float f_534_ = 1.0F;
							float f_535_;
							float f_536_;
							float f_537_;
							if (i_530_ == 0 && i_531_ == 0) {
								f_535_ = f;
								f_536_ = f_503_;
								f_537_ = f_504_;
								i_532_ -= i_514_;
							} else if (i_530_ == 0 && i_531_ == anInt1682 * 341909049) {
								f_535_ = f_505_;
								f_536_ = f_506_;
								f_537_ = f_507_;
								i_532_ -= i_515_;
							} else if (i_530_ == anInt1682 * 341909049 && i_531_ == anInt1682 * 341909049) {
								f_535_ = f_508_;
								f_536_ = f_509_;
								f_537_ = f_510_;
								i_532_ -= i_516_;
							} else if (i_530_ == anInt1682 * 341909049 && i_531_ == 0) {
								f_535_ = f_511_;
								f_536_ = f_512_;
								f_537_ = f_513_;
								i_532_ -= i_517_;
							} else {
								float f_538_ = ((float) i_530_ / (float) (anInt1682 * 341909049));
								float f_539_ = ((float) i_531_ / (float) (anInt1682 * 341909049));
								float f_540_ = f + (f_511_ - f) * f_538_;
								float f_541_ = f_503_ + (f_512_ - f_503_) * f_538_;
								float f_542_ = f_504_ + (f_513_ - f_504_) * f_538_;
								float f_543_ = f_505_ + (f_508_ - f_505_) * f_538_;
								float f_544_ = f_506_ + (f_509_ - f_506_) * f_538_;
								float f_545_ = f_507_ + (f_510_ - f_507_) * f_538_;
								f_535_ = f_540_ + (f_543_ - f_540_) * f_539_;
								f_536_ = f_541_ + (f_544_ - f_541_) * f_539_;
								f_537_ = f_542_ + (f_545_ - f_542_) * f_539_;
								int i_546_ = i_514_ + ((i_517_ - i_514_) * i_530_ >> anInt1680 * -1193058675);
								int i_547_ = i_515_ + ((i_516_ - i_515_) * i_530_ >> anInt1680 * -1193058675);
								i_532_ -= i_546_ + ((i_547_ - i_546_) * i_531_ >> anInt1680 * -1193058675);
							}
							if (i_527_ != -1) {
								int i_548_ = (i_527_ & 0x7f) * i_532_ >> 7;
								if (i_548_ < 2)
									i_548_ = 2;
								else if (i_548_ > 126)
									i_548_ = 126;
								i_533_ = (Class710.anIntArray8839[i_527_ & 0xff80 | i_548_]);
								if ((anInt9726 & 0x7) == 0) {
									f_534_ = ((aClass178_Sub1_9729.aFloatArray9277[0]) * f_535_ + (aClass178_Sub1_9729.aFloatArray9277[1]) * f_536_ + (aClass178_Sub1_9729.aFloatArray9277[2]) * f_537_);
									f_534_ = (aClass178_Sub1_9729.aFloat9359 + f_534_ * (f_534_ > 0.0F ? (aClass178_Sub1_9729.aFloat9343) : (aClass178_Sub1_9729.aFloat9250)));
								}
							}
							Class523 class523 = null;
							if ((i_523_ & anInt9710 - 1) == 0 && (i_524_ & anInt9710 - 1) == 0)
								class523 = class14.method741(l);
							int i_549_;
							if (class523 == null) {
								int i_550_;
								if (i_528_ != i_527_) {
									int i_551_ = (i_528_ & 0x7f) * i_532_ >> 7;
									if (i_551_ < 2)
										i_551_ = 2;
									else if (i_551_ > 126)
										i_551_ = 126;
									i_550_ = (Class710.anIntArray8839[i_528_ & 0xff80 | i_551_]);
									if ((anInt9726 & 0x7) == 0) {
										float f_552_ = ((aClass178_Sub1_9729.aFloatArray9277[0]) * f_535_ + (aClass178_Sub1_9729.aFloatArray9277[1]) * f_536_ + ((aClass178_Sub1_9729.aFloatArray9277[2]) * f_537_));
										f_552_ = (aClass178_Sub1_9729.aFloat9359 + (f_534_ * (f_534_ > 0.0F ? (aClass178_Sub1_9729.aFloat9343) : (aClass178_Sub1_9729.aFloat9250))));
										int i_553_ = i_550_ >> 16 & 0xff;
										int i_554_ = i_550_ >> 8 & 0xff;
										int i_555_ = i_550_ & 0xff;
										i_553_ *= f_552_;
										if (i_553_ < 0)
											i_553_ = 0;
										else if (i_553_ > 255)
											i_553_ = 255;
										i_554_ *= f_552_;
										if (i_554_ < 0)
											i_554_ = 0;
										else if (i_554_ > 255)
											i_554_ = 255;
										i_555_ *= f_552_;
										if (i_555_ < 0)
											i_555_ = 0;
										else if (i_555_ > 255)
											i_555_ = 255;
										i_550_ = (i_553_ << 16 | i_554_ << 8 | i_555_);
									}
								} else
									i_550_ = i_533_;
								if (aClass178_Sub1_9729.aBool9393) {
									stream.method1701((float) i_523_);
									stream.method1701((float) (method2326(i_523_, i_524_, -1767812066) + i_529_));
									stream.method1701((float) i_524_);
									stream.method1700((byte) (i_550_ >> 16));
									stream.method1700((byte) (i_550_ >> 8));
									stream.method1700((byte) i_550_);
									stream.method1700(-1);
									stream.method1701((float) i_523_);
									stream.method1701((float) i_524_);
									if (anIntArrayArrayArray9722 != null)
										stream.method1701(is_502_ != null ? (float) ((is_502_[i_522_]) - 1) : 0.0F);
									if ((anInt9726 & 0x7) != 0) {
										stream.method1701(f_535_);
										stream.method1701(f_536_);
										stream.method1701(f_537_);
									}
								} else {
									stream.method1702((float) i_523_);
									stream.method1702((float) (method2326(i_523_, i_524_, 2138973500) + i_529_));
									stream.method1702((float) i_524_);
									stream.method1700((byte) (i_550_ >> 16));
									stream.method1700((byte) (i_550_ >> 8));
									stream.method1700((byte) i_550_);
									stream.method1700(-1);
									stream.method1702((float) i_523_);
									stream.method1702((float) i_524_);
									if (anIntArrayArrayArray9722 != null)
										stream.method1702(is_502_ != null ? (float) ((is_502_[i_522_]) - 1) : 0.0F);
									if ((anInt9726 & 0x7) != 0) {
										stream.method1702(f_535_);
										stream.method1702(f_536_);
										stream.method1702(f_537_);
									}
								}
								i_549_ = anInt9713++;
								is_521_[i_522_] = (short) i_549_;
								if (i_527_ != -1)
									class523_sub9s[i_549_] = class523_sub9s_496_[i_522_];
								class14.method738(new Class523_Sub6(is_521_[i_522_]), l);
							} else {
								is_521_[i_522_] = ((Class523_Sub6) class523).aShort10403;
								i_549_ = is_521_[i_522_] & 0xffff;
								if (i_527_ != -1 && ((class523_sub9s_496_[i_522_].aLong7065 * 1055205983951172633L) < (class523_sub9s[i_549_].aLong7065 * 1055205983951172633L)))
									class523_sub9s[i_549_] = class523_sub9s_496_[i_522_];
							}
							for (int i_556_ = 0; i_556_ < i_518_; i_556_++)
								class523_sub9s_493_[i_556_].method15929(i_549_, i_533_, i_532_, f_534_);
							anInt9721++;
						}
					}
				}
			}
			for (int i_557_ = 0; i_557_ < anInt9713; i_557_++) {
				Class523_Sub9 class523_sub9 = class523_sub9s[i_557_];
				if (class523_sub9 != null)
					class523_sub9.method15926(i_557_);
			}
			for (int i_558_ = 0; i_558_ < anInt1683 * 692304099; i_558_++) {
				for (int i_559_ = 0; i_559_ < anInt1681 * 452998539; i_559_++) {
					short[] is_560_ = (aShortArrayArray9715[i_559_ * (anInt1683 * 692304099) + i_558_]);
					if (is_560_ != null) {
						int i_561_ = 0;
						int i_562_ = 0;
						while (i_562_ < is_560_.length) {
							int i_563_ = is_560_[i_562_++] & 0xffff;
							int i_564_ = is_560_[i_562_++] & 0xffff;
							int i_565_ = is_560_[i_562_++] & 0xffff;
							Class523_Sub9 class523_sub9 = class523_sub9s[i_563_];
							Class523_Sub9 class523_sub9_566_ = class523_sub9s[i_564_];
							Class523_Sub9 class523_sub9_567_ = class523_sub9s[i_565_];
							Class523_Sub9 class523_sub9_568_ = null;
							if (class523_sub9 != null) {
								class523_sub9.method15931(i_558_, i_559_, i_561_);
								class523_sub9_568_ = class523_sub9;
							}
							if (class523_sub9_566_ != null) {
								class523_sub9_566_.method15931(i_558_, i_559_, i_561_);
								if (class523_sub9_568_ == null || ((class523_sub9_566_.aLong7065 * 1055205983951172633L) < (class523_sub9_568_.aLong7065 * 1055205983951172633L)))
									class523_sub9_568_ = class523_sub9_566_;
							}
							if (class523_sub9_567_ != null) {
								class523_sub9_567_.method15931(i_558_, i_559_, i_561_);
								if (class523_sub9_568_ == null || ((class523_sub9_567_.aLong7065 * 1055205983951172633L) < (class523_sub9_568_.aLong7065 * 1055205983951172633L)))
									class523_sub9_568_ = class523_sub9_567_;
							}
							if (class523_sub9_568_ != null) {
								if (class523_sub9 != null)
									class523_sub9_568_.method15926(i_563_);
								if (class523_sub9_566_ != null)
									class523_sub9_568_.method15926(i_564_);
								if (class523_sub9_567_ != null)
									class523_sub9_568_.method15926(i_565_);
								class523_sub9_568_.method15931(i_558_, i_559_, i_561_);
							}
							i_561_++;
						}
					}
				}
			}
			stream.method1703();
			anInterface15_9727 = aClass178_Sub1_9729.method14661(i, nativeheapbuffer, stream.method1698(), false);
			if (anInterface15_9727 instanceof Class135_Sub1)
				nativeheapbuffer.method1678();
			aClass131_9728 = new Class131(anInterface15_9727, 5126, 3, 0);
			aClass131_9706 = new Class131(anInterface15_9727, 5121, 4, 12);
			int i_569_;
			if (anIntArrayArrayArray9722 != null) {
				aClass131_9708 = new Class131(anInterface15_9727, 5126, 3, 16);
				i_569_ = 28;
			} else {
				aClass131_9708 = new Class131(anInterface15_9727, 5126, 2, 16);
				i_569_ = 24;
			}
			if ((anInt9726 & 0x7) != 0)
				aClass131_9730 = new Class131(anInterface15_9727, 5126, 3, i_569_);
			long[] ls = new long[aClass523Array9724.length];
			for (int i_570_ = 0; i_570_ < aClass523Array9724.length; i_570_++) {
				Class523_Sub9 class523_sub9 = (Class523_Sub9) aClass523Array9724[i_570_];
				ls[i_570_] = class523_sub9.aLong7065 * 1055205983951172633L;
				class523_sub9.method15927(anInt9713);
			}
			Class447.method7245(ls, aClass523Array9724, (byte) -44);
			if (aClass147_9720 != null)
				aClass147_9720.method2387();
		} else
			aClass147_9720 = null;
		if ((anInt9736 & 0x2) == 0) {
			anIntArrayArrayArray9712 = null;
			anIntArrayArrayArray9719 = null;
			anIntArrayArrayArray9717 = null;
		}
		anIntArrayArrayArray9722 = null;
		anIntArrayArrayArray9718 = null;
		anIntArrayArrayArray9714 = null;
		aClass523_Sub9ArrayArrayArray9716 = null;
		aByteArrayArray9734 = null;
		aClass14_9738 = null;
		aFloatArrayArray9737 = null;
		aFloatArrayArray9707 = null;
		aFloatArrayArray9735 = null;
	}

	void method15343(int i, int i_571_, int i_572_, boolean[][] bools, boolean bool, int i_573_) {
		if (aClass523Array9724 != null) {
			int i_574_ = i_572_ + i_572_ + 1;
			i_574_ *= i_574_;
			if (aClass178_Sub1_9729.anIntArray9432.length < i_574_)
				aClass178_Sub1_9729.anIntArray9432 = new int[i_574_];
			if ((aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9721 * 2)
				aClass178_Sub1_9729.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1(anInt9721 * 2);
			int i_575_ = i - i_572_;
			int i_576_ = i_575_;
			if (i_575_ < 0)
				i_575_ = 0;
			int i_577_ = i_571_ - i_572_;
			int i_578_ = i_577_;
			if (i_577_ < 0)
				i_577_ = 0;
			int i_579_ = i + i_572_;
			if (i_579_ > anInt1683 * 692304099 - 1)
				i_579_ = anInt1683 * 692304099 - 1;
			int i_580_ = i_571_ + i_572_;
			if (i_580_ > anInt1681 * 452998539 - 1)
				i_580_ = anInt1681 * 452998539 - 1;
			int i_581_ = 0;
			int[] is = aClass178_Sub1_9729.anIntArray9432;
			for (int i_582_ = i_575_; i_582_ <= i_579_; i_582_++) {
				boolean[] bools_583_ = bools[i_582_ - i_576_];
				for (int i_584_ = i_577_; i_584_ <= i_580_; i_584_++) {
					if (bools_583_[i_584_ - i_578_])
						is[i_581_++] = i_584_ * (anInt1683 * 692304099) + i_582_;
				}
			}
			aClass178_Sub1_9729.method14619();
			aClass178_Sub1_9729.method14682((anInt9726 & 0x7) != 0);
			for (int i_585_ = 0; i_585_ < aClass523Array9724.length - 0; i_585_++)
				((Class523_Sub9) aClass523Array9724[i_585_]).method15941(is, i_581_);
			if (!aClass708_9725.method14237((byte) 104)) {
				int i_586_ = aClass178_Sub1_9729.anInt9368;
				int i_587_ = aClass178_Sub1_9729.anInt9369;
				aClass178_Sub1_9729.method3349(0, i_587_, aClass178_Sub1_9729.anInt9261);
				aClass178_Sub1_9729.method14682(false);
				aClass178_Sub1_9729.method14620(false);
				aClass178_Sub1_9729.method14687(128);
				aClass178_Sub1_9729.method14670(-2);
				aClass178_Sub1_9729.method14711(aClass178_Sub1_9729.aClass126_Sub2_9387);
				aClass178_Sub1_9729.method14676(8448, 7681);
				aClass178_Sub1_9729.method14677(0, 34166, 770);
				aClass178_Sub1_9729.method14678(0, 34167, 770);
				for (Class523 class523 = aClass708_9725.method14240(1527867193); class523 != null; class523 = aClass708_9725.method14244((byte) 92)) {
					Class523_Sub21 class523_sub21 = (Class523_Sub21) class523;
					class523_sub21.method16102(i, i_571_, i_572_, bools);
				}
				aClass178_Sub1_9729.method14677(0, 5890, 768);
				aClass178_Sub1_9729.method14678(0, 5890, 770);
				aClass178_Sub1_9729.method14711(null);
				aClass178_Sub1_9729.method3349(i_586_, i_587_, aClass178_Sub1_9729.anInt9261);
			}
			if (aClass147_9720 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aClass178_Sub1_9729.method14664(aClass131_9728, null, null, aClass131_9708);
				aClass147_9720.method2388(i, i_571_, i_572_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}
}
