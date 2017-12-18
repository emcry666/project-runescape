/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class356 {
	Interface36 anInterface36_3711;
	Class348 aClass348_3712 = Class348.aClass348_3634;
	Class348 aClass348_3713;
	Class178_Sub2 aClass178_Sub2_3714;
	int anInt3715;
	float[] aFloatArray3716;
	Interface37[] anInterface37Array3717;
	int[] anIntArray3718;
	int anInt3719;
	int anInt3720 = 128;
	Class345 aClass345_3721;
	Interface40 anInterface40_3722;
	int[] anIntArray3723;

	void method6241() {
		if (anInt3715 != 0) {
			aClass178_Sub2_3714.method15064();
			aClass178_Sub2_3714.method15018(1);
			aClass178_Sub2_3714.method15213(anInterface40_3722);
			aClass178_Sub2_3714.method15033(0, anInterface36_3711);
			aClass178_Sub2_3714.method15032(aClass345_3721);
			Class311 class311 = aClass178_Sub2_3714.aClass311_9644;
			Unsafe unsafe = aClass178_Sub2_3714.anUnsafe9538;
			ByteBuffer bytebuffer = aClass178_Sub2_3714.aByteBuffer9539;
			bytebuffer.clear();
			aClass178_Sub2_3714.method15174().method7086(Class441.aClass441_4917);
			aClass178_Sub2_3714.method15011(Class377.aClass377_3923);
			int i = (anInt3715 + anInt3719 - 1) / anInt3719;
			int i_0_ = 0;
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				int i_3_ = Math.min(anInt3719, anInt3715 - i_0_);
				long l = anInterface36_3711.method274(0, i_3_ * 96);
				int i_4_ = i_2_ * anInt3719 + i_3_;
				for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
					for (int i_6_ = 0; i_6_ < 4; i_6_++) {
						unsafe.putFloat(l, aFloatArray3716[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_1_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3718[i_5_]);
						l += 4L;
					}
				}
				anInterface36_3711.method79();
				Interface37 interface37 = anInterface37Array3717[i_0_];
				int i_7_ = 1;
				int i_8_ = 0;
				for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
					if (interface37 == anInterface37Array3717[i_9_])
						i_7_++;
					else {
						class311.anInterface37_3387 = interface37;
						class311.method5637();
						aClass178_Sub2_3714.method15041(anInterface40_3722, (Class376.aClass376_3917), i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
						interface37 = anInterface37Array3717[i_9_];
						i_7_ = 1;
						i_8_ = i_9_ - i_0_;
					}
				}
				class311.anInterface37_3387 = interface37;
				class311.method5637();
				aClass178_Sub2_3714.method15041(anInterface40_3722, Class376.aClass376_3917, i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
				i_0_ += anInt3719;
			}
			anInt3715 = 0;
		}
	}

	void method6242() {
		anInterface36_3711.method131();
		anInterface40_3722.method131();
		anInterface36_3711 = null;
		anInterface40_3722 = null;
		aClass345_3721 = null;
		anInt3715 = 0;
	}

	void method6243() {
		if (anInt3715 != 0) {
			aClass178_Sub2_3714.method15064();
			aClass178_Sub2_3714.method15018(1);
			aClass178_Sub2_3714.method15213(anInterface40_3722);
			aClass178_Sub2_3714.method15033(0, anInterface36_3711);
			aClass178_Sub2_3714.method15032(aClass345_3721);
			Class311 class311 = aClass178_Sub2_3714.aClass311_9644;
			Unsafe unsafe = aClass178_Sub2_3714.anUnsafe9538;
			ByteBuffer bytebuffer = aClass178_Sub2_3714.aByteBuffer9539;
			bytebuffer.clear();
			aClass178_Sub2_3714.method15174().method7086(Class441.aClass441_4917);
			aClass178_Sub2_3714.method15011(Class377.aClass377_3923);
			int i = (anInt3715 + anInt3719 - 1) / anInt3719;
			int i_10_ = 0;
			int i_11_ = 0;
			for (int i_12_ = 0; i_12_ < i; i_12_++) {
				int i_13_ = Math.min(anInt3719, anInt3715 - i_10_);
				long l = anInterface36_3711.method274(0, i_13_ * 96);
				int i_14_ = i_12_ * anInt3719 + i_13_;
				for (int i_15_ = i_10_; i_15_ < i_14_; i_15_++) {
					for (int i_16_ = 0; i_16_ < 4; i_16_++) {
						unsafe.putFloat(l, aFloatArray3716[i_11_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_11_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_11_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_11_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3718[i_15_]);
						l += 4L;
					}
				}
				anInterface36_3711.method79();
				Interface37 interface37 = anInterface37Array3717[i_10_];
				int i_17_ = 1;
				int i_18_ = 0;
				for (int i_19_ = i_10_ + 1; i_19_ < i_14_; i_19_++) {
					if (interface37 == anInterface37Array3717[i_19_])
						i_17_++;
					else {
						class311.anInterface37_3387 = interface37;
						class311.method5637();
						aClass178_Sub2_3714.method15041(anInterface40_3722, (Class376.aClass376_3917), i_18_ * 4, i_17_ * 4, i_18_ * 6, i_17_ * 2);
						interface37 = anInterface37Array3717[i_19_];
						i_17_ = 1;
						i_18_ = i_19_ - i_10_;
					}
				}
				class311.anInterface37_3387 = interface37;
				class311.method5637();
				aClass178_Sub2_3714.method15041(anInterface40_3722, Class376.aClass376_3917, i_18_ * 4, i_17_ * 4, i_18_ * 6, i_17_ * 2);
				i_10_ += anInt3719;
			}
			anInt3715 = 0;
		}
	}

	void method6244(float f, float f_20_, float f_21_, float f_22_, float f_23_, float f_24_, float f_25_, float f_26_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_27_ = anIntArray3723[0];
			int i_28_ = anIntArray3723[1];
			int i_29_ = anIntArray3723[2];
			int i_30_ = anIntArray3723[3];
			if (!(f > (float) i_29_) && !(f_20_ > (float) i_30_) && !(f_21_ < (float) i_27_) && !(f_22_ < (float) i_28_)) {
				float f_31_ = f_21_ - f;
				float f_32_ = f_22_ - f_20_;
				float f_33_ = f_25_ - f_23_;
				float f_34_ = f_26_ - f_24_;
				if (f < (float) i_27_) {
					f_23_ += ((float) i_27_ - f) / f_31_ * f_33_;
					f = (float) i_27_;
				}
				if (f_20_ < (float) i_28_) {
					f_24_ += ((float) i_28_ - f_20_) / f_32_ * f_34_;
					f_20_ = (float) i_28_;
				}
				if (f_21_ > (float) i_29_) {
					f_25_ -= (f_21_ - (float) i_29_) / f_31_ * f_33_;
					f_21_ = (float) i_29_;
				}
				if (f_22_ > (float) i_30_) {
					f_26_ -= (f_22_ - (float) i_30_) / f_32_ * f_34_;
					f_22_ = (float) i_30_;
				}
				method6246();
				f = method6247(f);
				f_20_ = method6245(f_20_);
				f_21_ = method6247(f_21_);
				f_22_ = method6245(f_22_);
				aFloatArray3716[anInt3715 * 16 + 0] = f;
				aFloatArray3716[anInt3715 * 16 + 1] = f_20_;
				aFloatArray3716[anInt3715 * 16 + 2] = f_23_;
				aFloatArray3716[anInt3715 * 16 + 3] = f_24_;
				aFloatArray3716[anInt3715 * 16 + 4] = f_21_;
				aFloatArray3716[anInt3715 * 16 + 5] = f_20_;
				aFloatArray3716[anInt3715 * 16 + 6] = f_25_;
				aFloatArray3716[anInt3715 * 16 + 7] = f_24_;
				aFloatArray3716[anInt3715 * 16 + 8] = f;
				aFloatArray3716[anInt3715 * 16 + 9] = f_22_;
				aFloatArray3716[anInt3715 * 16 + 10] = f_23_;
				aFloatArray3716[anInt3715 * 16 + 11] = f_26_;
				aFloatArray3716[anInt3715 * 16 + 12] = f_21_;
				aFloatArray3716[anInt3715 * 16 + 13] = f_22_;
				aFloatArray3716[anInt3715 * 16 + 14] = f_25_;
				aFloatArray3716[anInt3715 * 16 + 15] = f_26_;
				anInterface37Array3717[anInt3715] = interface37;
				if (aClass178_Sub2_3714.anInt9670 == 1)
					anIntArray3718[anInt3715] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				else
					anIntArray3718[anInt3715] = i;
				anInt3715++;
				if (aClass348_3712 == Class348.aClass348_3635)
					method6243();
			}
		}
	}

	float method6245(float f) {
		int i = aClass178_Sub2_3714.method3039(1670930681).method2874();
		float f_35_ = (((1.0F - (f + aClass178_Sub2_3714.method15089()) / (float) i) * 2.0F) - 1.0F);
		return f_35_;
	}

	void method6246() {
		if (anInt3715 == anInt3720) {
			anInt3720 *= 2;
			float[] fs = new float[anInt3720 * 16];
			for (int i = 0; i < anInt3715 * 16; i++)
				fs[i] = aFloatArray3716[i];
			aFloatArray3716 = fs;
			Interface37[] interface37s = new Interface37[anInt3720];
			int[] is = new int[anInt3720];
			for (int i = 0; i < anInt3715; i++) {
				interface37s[i] = anInterface37Array3717[i];
				is[i] = anIntArray3718[i];
			}
			anInterface37Array3717 = interface37s;
			anIntArray3718 = is;
		}
	}

	float method6247(float f) {
		int i = aClass178_Sub2_3714.method3039(1843354947).method2875();
		float f_36_ = ((f + aClass178_Sub2_3714.method15089()) / (float) i * 2.0F - 1.0F);
		return f_36_;
	}

	void method6248(float f, float f_37_, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_44_ = anIntArray3723[0];
			int i_45_ = anIntArray3723[1];
			int i_46_ = anIntArray3723[2];
			int i_47_ = anIntArray3723[3];
			if (!(f > (float) i_46_) && !(f_37_ > (float) i_47_) && !(f_38_ < (float) i_44_) && !(f_39_ < (float) i_45_)) {
				float f_48_ = f_38_ - f;
				float f_49_ = f_39_ - f_37_;
				float f_50_ = f_42_ - f_40_;
				float f_51_ = f_43_ - f_41_;
				if (f < (float) i_44_) {
					f_40_ += ((float) i_44_ - f) / f_48_ * f_50_;
					f = (float) i_44_;
				}
				if (f_37_ < (float) i_45_) {
					f_41_ += ((float) i_45_ - f_37_) / f_49_ * f_51_;
					f_37_ = (float) i_45_;
				}
				if (f_38_ > (float) i_46_) {
					f_42_ -= (f_38_ - (float) i_46_) / f_48_ * f_50_;
					f_38_ = (float) i_46_;
				}
				if (f_39_ > (float) i_47_) {
					f_43_ -= (f_39_ - (float) i_47_) / f_49_ * f_51_;
					f_39_ = (float) i_47_;
				}
				method6246();
				f = method6247(f);
				f_37_ = method6245(f_37_);
				f_38_ = method6247(f_38_);
				f_39_ = method6245(f_39_);
				aFloatArray3716[anInt3715 * 16 + 0] = f;
				aFloatArray3716[anInt3715 * 16 + 1] = f_37_;
				aFloatArray3716[anInt3715 * 16 + 2] = f_40_;
				aFloatArray3716[anInt3715 * 16 + 3] = f_41_;
				aFloatArray3716[anInt3715 * 16 + 4] = f_38_;
				aFloatArray3716[anInt3715 * 16 + 5] = f_37_;
				aFloatArray3716[anInt3715 * 16 + 6] = f_42_;
				aFloatArray3716[anInt3715 * 16 + 7] = f_41_;
				aFloatArray3716[anInt3715 * 16 + 8] = f;
				aFloatArray3716[anInt3715 * 16 + 9] = f_39_;
				aFloatArray3716[anInt3715 * 16 + 10] = f_40_;
				aFloatArray3716[anInt3715 * 16 + 11] = f_43_;
				aFloatArray3716[anInt3715 * 16 + 12] = f_38_;
				aFloatArray3716[anInt3715 * 16 + 13] = f_39_;
				aFloatArray3716[anInt3715 * 16 + 14] = f_42_;
				aFloatArray3716[anInt3715 * 16 + 15] = f_43_;
				anInterface37Array3717[anInt3715] = interface37;
				if (aClass178_Sub2_3714.anInt9670 == 1)
					anIntArray3718[anInt3715] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				else
					anIntArray3718[anInt3715] = i;
				anInt3715++;
				if (aClass348_3712 == Class348.aClass348_3635)
					method6243();
			}
		}
	}

	void method6249() {
		aClass348_3713 = aClass348_3712;
		aClass348_3712 = Class348.aClass348_3636;
	}

	void method6250() {
		if (aClass348_3713 != null) {
			aClass348_3712 = aClass348_3713;
			aClass348_3713 = null;
		}
	}

	Class348 method6251() {
		return aClass348_3712;
	}

	Class348 method6252() {
		return aClass348_3712;
	}

	void method6253() {
		anInterface36_3711.method131();
		anInterface40_3722.method131();
		anInterface36_3711 = null;
		anInterface40_3722 = null;
		aClass345_3721 = null;
		anInt3715 = 0;
	}

	void method6254(float f, float f_52_, float f_53_, float f_54_, float f_55_, float f_56_, float f_57_, float f_58_, float f_59_, float f_60_, float f_61_, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_67_ = anIntArray3723[0];
			int i_68_ = anIntArray3723[1];
			int i_69_ = anIntArray3723[2];
			int i_70_ = anIntArray3723[3];
			int i_71_ = 0;
			int i_72_ = ((f < (float) i_67_ ? 1 : 0) + (f_53_ < (float) i_67_ ? 1 : 0) + (f_55_ < (float) i_67_ ? 1 : 0) + (f_57_ < (float) i_67_ ? 1 : 0));
			if (i_72_ != 4) {
				i_71_ |= i_72_;
				i_72_ = ((f > (float) i_69_ ? 1 : 0) + (f_53_ > (float) i_69_ ? 1 : 0) + (f_55_ > (float) i_69_ ? 1 : 0) + (f_57_ > (float) i_69_ ? 1 : 0));
				if (i_72_ != 4) {
					i_71_ |= i_72_;
					i_72_ = ((f_52_ < (float) i_68_ ? 1 : 0) + (f_54_ < (float) i_68_ ? 1 : 0) + (f_56_ < (float) i_68_ ? 1 : 0) + (f_58_ < (float) i_68_ ? 1 : 0));
					if (i_72_ != 4) {
						i_71_ |= i_72_;
						i_72_ = ((f_52_ > (float) i_70_ ? 1 : 0) + (f_54_ > (float) i_70_ ? 1 : 0) + (f_56_ > (float) i_70_ ? 1 : 0) + (f_58_ > (float) i_70_ ? 1 : 0));
						if (i_72_ != 4) {
							i_71_ |= i_72_;
							if (i_71_ != 0) {
								method6243();
								aClass178_Sub2_3714.method3074(true);
								aClass178_Sub2_3714.method3378(i_67_, i_68_, i_69_, i_70_);
							}
							method6246();
							f = method6247(f);
							f_52_ = method6245(f_52_);
							f_53_ = method6247(f_53_);
							f_54_ = method6245(f_54_);
							f_55_ = method6247(f_55_);
							f_56_ = method6245(f_56_);
							f_57_ = method6247(f_57_);
							f_58_ = method6245(f_58_);
							aFloatArray3716[anInt3715 * 16 + 0] = f;
							aFloatArray3716[anInt3715 * 16 + 1] = f_52_;
							aFloatArray3716[anInt3715 * 16 + 2] = f_59_;
							aFloatArray3716[anInt3715 * 16 + 3] = f_60_;
							aFloatArray3716[anInt3715 * 16 + 4] = f_53_;
							aFloatArray3716[anInt3715 * 16 + 5] = f_54_;
							aFloatArray3716[anInt3715 * 16 + 6] = f_61_;
							aFloatArray3716[anInt3715 * 16 + 7] = f_62_;
							aFloatArray3716[anInt3715 * 16 + 8] = f_55_;
							aFloatArray3716[anInt3715 * 16 + 9] = f_56_;
							aFloatArray3716[anInt3715 * 16 + 10] = f_63_;
							aFloatArray3716[anInt3715 * 16 + 11] = f_64_;
							aFloatArray3716[anInt3715 * 16 + 12] = f_57_;
							aFloatArray3716[anInt3715 * 16 + 13] = f_58_;
							aFloatArray3716[anInt3715 * 16 + 14] = f_65_;
							aFloatArray3716[anInt3715 * 16 + 15] = f_66_;
							anInterface37Array3717[anInt3715] = interface37;
							if (aClass178_Sub2_3714.anInt9670 == 1)
								anIntArray3718[anInt3715] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3718[anInt3715] = i;
							anInt3715++;
							if (aClass348_3712 == Class348.aClass348_3635 || i_71_ > 0)
								method6243();
							if (i_71_ != 0) {
								aClass178_Sub2_3714.method3074(false);
								aClass178_Sub2_3714.method3071();
								aClass178_Sub2_3714.method3378(i_67_, i_68_, i_69_, i_70_);
							}
						}
					}
				}
			}
		}
	}

	void method6255() {
		if (anInt3715 != 0) {
			aClass178_Sub2_3714.method15064();
			aClass178_Sub2_3714.method15018(1);
			aClass178_Sub2_3714.method15213(anInterface40_3722);
			aClass178_Sub2_3714.method15033(0, anInterface36_3711);
			aClass178_Sub2_3714.method15032(aClass345_3721);
			Class311 class311 = aClass178_Sub2_3714.aClass311_9644;
			Unsafe unsafe = aClass178_Sub2_3714.anUnsafe9538;
			ByteBuffer bytebuffer = aClass178_Sub2_3714.aByteBuffer9539;
			bytebuffer.clear();
			aClass178_Sub2_3714.method15174().method7086(Class441.aClass441_4917);
			aClass178_Sub2_3714.method15011(Class377.aClass377_3923);
			int i = (anInt3715 + anInt3719 - 1) / anInt3719;
			int i_73_ = 0;
			int i_74_ = 0;
			for (int i_75_ = 0; i_75_ < i; i_75_++) {
				int i_76_ = Math.min(anInt3719, anInt3715 - i_73_);
				long l = anInterface36_3711.method274(0, i_76_ * 96);
				int i_77_ = i_75_ * anInt3719 + i_76_;
				for (int i_78_ = i_73_; i_78_ < i_77_; i_78_++) {
					for (int i_79_ = 0; i_79_ < 4; i_79_++) {
						unsafe.putFloat(l, aFloatArray3716[i_74_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_74_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_74_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_74_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3718[i_78_]);
						l += 4L;
					}
				}
				anInterface36_3711.method79();
				Interface37 interface37 = anInterface37Array3717[i_73_];
				int i_80_ = 1;
				int i_81_ = 0;
				for (int i_82_ = i_73_ + 1; i_82_ < i_77_; i_82_++) {
					if (interface37 == anInterface37Array3717[i_82_])
						i_80_++;
					else {
						class311.anInterface37_3387 = interface37;
						class311.method5637();
						aClass178_Sub2_3714.method15041(anInterface40_3722, (Class376.aClass376_3917), i_81_ * 4, i_80_ * 4, i_81_ * 6, i_80_ * 2);
						interface37 = anInterface37Array3717[i_82_];
						i_80_ = 1;
						i_81_ = i_82_ - i_73_;
					}
				}
				class311.anInterface37_3387 = interface37;
				class311.method5637();
				aClass178_Sub2_3714.method15041(anInterface40_3722, Class376.aClass376_3917, i_81_ * 4, i_80_ * 4, i_81_ * 6, i_80_ * 2);
				i_73_ += anInt3719;
			}
			anInt3715 = 0;
		}
	}

	void method6256() {
		if (anInt3715 != 0) {
			aClass178_Sub2_3714.method15064();
			aClass178_Sub2_3714.method15018(1);
			aClass178_Sub2_3714.method15213(anInterface40_3722);
			aClass178_Sub2_3714.method15033(0, anInterface36_3711);
			aClass178_Sub2_3714.method15032(aClass345_3721);
			Class311 class311 = aClass178_Sub2_3714.aClass311_9644;
			Unsafe unsafe = aClass178_Sub2_3714.anUnsafe9538;
			ByteBuffer bytebuffer = aClass178_Sub2_3714.aByteBuffer9539;
			bytebuffer.clear();
			aClass178_Sub2_3714.method15174().method7086(Class441.aClass441_4917);
			aClass178_Sub2_3714.method15011(Class377.aClass377_3923);
			int i = (anInt3715 + anInt3719 - 1) / anInt3719;
			int i_83_ = 0;
			int i_84_ = 0;
			for (int i_85_ = 0; i_85_ < i; i_85_++) {
				int i_86_ = Math.min(anInt3719, anInt3715 - i_83_);
				long l = anInterface36_3711.method274(0, i_86_ * 96);
				int i_87_ = i_85_ * anInt3719 + i_86_;
				for (int i_88_ = i_83_; i_88_ < i_87_; i_88_++) {
					for (int i_89_ = 0; i_89_ < 4; i_89_++) {
						unsafe.putFloat(l, aFloatArray3716[i_84_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_84_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_84_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3716[i_84_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3718[i_88_]);
						l += 4L;
					}
				}
				anInterface36_3711.method79();
				Interface37 interface37 = anInterface37Array3717[i_83_];
				int i_90_ = 1;
				int i_91_ = 0;
				for (int i_92_ = i_83_ + 1; i_92_ < i_87_; i_92_++) {
					if (interface37 == anInterface37Array3717[i_92_])
						i_90_++;
					else {
						class311.anInterface37_3387 = interface37;
						class311.method5637();
						aClass178_Sub2_3714.method15041(anInterface40_3722, (Class376.aClass376_3917), i_91_ * 4, i_90_ * 4, i_91_ * 6, i_90_ * 2);
						interface37 = anInterface37Array3717[i_92_];
						i_90_ = 1;
						i_91_ = i_92_ - i_83_;
					}
				}
				class311.anInterface37_3387 = interface37;
				class311.method5637();
				aClass178_Sub2_3714.method15041(anInterface40_3722, Class376.aClass376_3917, i_91_ * 4, i_90_ * 4, i_91_ * 6, i_90_ * 2);
				i_83_ += anInt3719;
			}
			anInt3715 = 0;
		}
	}

	void method6257() {
		if (anInt3715 == anInt3720) {
			anInt3720 *= 2;
			float[] fs = new float[anInt3720 * 16];
			for (int i = 0; i < anInt3715 * 16; i++)
				fs[i] = aFloatArray3716[i];
			aFloatArray3716 = fs;
			Interface37[] interface37s = new Interface37[anInt3720];
			int[] is = new int[anInt3720];
			for (int i = 0; i < anInt3715; i++) {
				interface37s[i] = anInterface37Array3717[i];
				is[i] = anIntArray3718[i];
			}
			anInterface37Array3717 = interface37s;
			anIntArray3718 = is;
		}
	}

	void method6258(float f, float f_93_, float f_94_, float f_95_, float f_96_, float f_97_, float f_98_, float f_99_, float f_100_, float f_101_, float f_102_, float f_103_, float f_104_, float f_105_, float f_106_, float f_107_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_108_ = anIntArray3723[0];
			int i_109_ = anIntArray3723[1];
			int i_110_ = anIntArray3723[2];
			int i_111_ = anIntArray3723[3];
			int i_112_ = 0;
			int i_113_ = ((f < (float) i_108_ ? 1 : 0) + (f_94_ < (float) i_108_ ? 1 : 0) + (f_96_ < (float) i_108_ ? 1 : 0) + (f_98_ < (float) i_108_ ? 1 : 0));
			if (i_113_ != 4) {
				i_112_ |= i_113_;
				i_113_ = ((f > (float) i_110_ ? 1 : 0) + (f_94_ > (float) i_110_ ? 1 : 0) + (f_96_ > (float) i_110_ ? 1 : 0) + (f_98_ > (float) i_110_ ? 1 : 0));
				if (i_113_ != 4) {
					i_112_ |= i_113_;
					i_113_ = ((f_93_ < (float) i_109_ ? 1 : 0) + (f_95_ < (float) i_109_ ? 1 : 0) + (f_97_ < (float) i_109_ ? 1 : 0) + (f_99_ < (float) i_109_ ? 1 : 0));
					if (i_113_ != 4) {
						i_112_ |= i_113_;
						i_113_ = ((f_93_ > (float) i_111_ ? 1 : 0) + (f_95_ > (float) i_111_ ? 1 : 0) + (f_97_ > (float) i_111_ ? 1 : 0) + (f_99_ > (float) i_111_ ? 1 : 0));
						if (i_113_ != 4) {
							i_112_ |= i_113_;
							if (i_112_ != 0) {
								method6243();
								aClass178_Sub2_3714.method3074(true);
								aClass178_Sub2_3714.method3378(i_108_, i_109_, i_110_, i_111_);
							}
							method6246();
							f = method6247(f);
							f_93_ = method6245(f_93_);
							f_94_ = method6247(f_94_);
							f_95_ = method6245(f_95_);
							f_96_ = method6247(f_96_);
							f_97_ = method6245(f_97_);
							f_98_ = method6247(f_98_);
							f_99_ = method6245(f_99_);
							aFloatArray3716[anInt3715 * 16 + 0] = f;
							aFloatArray3716[anInt3715 * 16 + 1] = f_93_;
							aFloatArray3716[anInt3715 * 16 + 2] = f_100_;
							aFloatArray3716[anInt3715 * 16 + 3] = f_101_;
							aFloatArray3716[anInt3715 * 16 + 4] = f_94_;
							aFloatArray3716[anInt3715 * 16 + 5] = f_95_;
							aFloatArray3716[anInt3715 * 16 + 6] = f_102_;
							aFloatArray3716[anInt3715 * 16 + 7] = f_103_;
							aFloatArray3716[anInt3715 * 16 + 8] = f_96_;
							aFloatArray3716[anInt3715 * 16 + 9] = f_97_;
							aFloatArray3716[anInt3715 * 16 + 10] = f_104_;
							aFloatArray3716[anInt3715 * 16 + 11] = f_105_;
							aFloatArray3716[anInt3715 * 16 + 12] = f_98_;
							aFloatArray3716[anInt3715 * 16 + 13] = f_99_;
							aFloatArray3716[anInt3715 * 16 + 14] = f_106_;
							aFloatArray3716[anInt3715 * 16 + 15] = f_107_;
							anInterface37Array3717[anInt3715] = interface37;
							if (aClass178_Sub2_3714.anInt9670 == 1)
								anIntArray3718[anInt3715] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3718[anInt3715] = i;
							anInt3715++;
							if (aClass348_3712 == Class348.aClass348_3635 || i_112_ > 0)
								method6243();
							if (i_112_ != 0) {
								aClass178_Sub2_3714.method3074(false);
								aClass178_Sub2_3714.method3071();
								aClass178_Sub2_3714.method3378(i_108_, i_109_, i_110_, i_111_);
							}
						}
					}
				}
			}
		}
	}

	void method6259() {
		anInterface36_3711.method131();
		anInterface40_3722.method131();
		anInterface36_3711 = null;
		anInterface40_3722 = null;
		aClass345_3721 = null;
		anInt3715 = 0;
	}

	void method6260() {
		aClass348_3713 = aClass348_3712;
		aClass348_3712 = Class348.aClass348_3636;
	}

	void method6261(float f, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_, float f_119_, float f_120_, float f_121_, float f_122_, float f_123_, float f_124_, float f_125_, float f_126_, float f_127_, float f_128_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_129_ = anIntArray3723[0];
			int i_130_ = anIntArray3723[1];
			int i_131_ = anIntArray3723[2];
			int i_132_ = anIntArray3723[3];
			int i_133_ = 0;
			int i_134_ = ((f < (float) i_129_ ? 1 : 0) + (f_115_ < (float) i_129_ ? 1 : 0) + (f_117_ < (float) i_129_ ? 1 : 0) + (f_119_ < (float) i_129_ ? 1 : 0));
			if (i_134_ != 4) {
				i_133_ |= i_134_;
				i_134_ = ((f > (float) i_131_ ? 1 : 0) + (f_115_ > (float) i_131_ ? 1 : 0) + (f_117_ > (float) i_131_ ? 1 : 0) + (f_119_ > (float) i_131_ ? 1 : 0));
				if (i_134_ != 4) {
					i_133_ |= i_134_;
					i_134_ = ((f_114_ < (float) i_130_ ? 1 : 0) + (f_116_ < (float) i_130_ ? 1 : 0) + (f_118_ < (float) i_130_ ? 1 : 0) + (f_120_ < (float) i_130_ ? 1 : 0));
					if (i_134_ != 4) {
						i_133_ |= i_134_;
						i_134_ = ((f_114_ > (float) i_132_ ? 1 : 0) + (f_116_ > (float) i_132_ ? 1 : 0) + (f_118_ > (float) i_132_ ? 1 : 0) + (f_120_ > (float) i_132_ ? 1 : 0));
						if (i_134_ != 4) {
							i_133_ |= i_134_;
							if (i_133_ != 0) {
								method6243();
								aClass178_Sub2_3714.method3074(true);
								aClass178_Sub2_3714.method3378(i_129_, i_130_, i_131_, i_132_);
							}
							method6246();
							f = method6247(f);
							f_114_ = method6245(f_114_);
							f_115_ = method6247(f_115_);
							f_116_ = method6245(f_116_);
							f_117_ = method6247(f_117_);
							f_118_ = method6245(f_118_);
							f_119_ = method6247(f_119_);
							f_120_ = method6245(f_120_);
							aFloatArray3716[anInt3715 * 16 + 0] = f;
							aFloatArray3716[anInt3715 * 16 + 1] = f_114_;
							aFloatArray3716[anInt3715 * 16 + 2] = f_121_;
							aFloatArray3716[anInt3715 * 16 + 3] = f_122_;
							aFloatArray3716[anInt3715 * 16 + 4] = f_115_;
							aFloatArray3716[anInt3715 * 16 + 5] = f_116_;
							aFloatArray3716[anInt3715 * 16 + 6] = f_123_;
							aFloatArray3716[anInt3715 * 16 + 7] = f_124_;
							aFloatArray3716[anInt3715 * 16 + 8] = f_117_;
							aFloatArray3716[anInt3715 * 16 + 9] = f_118_;
							aFloatArray3716[anInt3715 * 16 + 10] = f_125_;
							aFloatArray3716[anInt3715 * 16 + 11] = f_126_;
							aFloatArray3716[anInt3715 * 16 + 12] = f_119_;
							aFloatArray3716[anInt3715 * 16 + 13] = f_120_;
							aFloatArray3716[anInt3715 * 16 + 14] = f_127_;
							aFloatArray3716[anInt3715 * 16 + 15] = f_128_;
							anInterface37Array3717[anInt3715] = interface37;
							if (aClass178_Sub2_3714.anInt9670 == 1)
								anIntArray3718[anInt3715] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3718[anInt3715] = i;
							anInt3715++;
							if (aClass348_3712 == Class348.aClass348_3635 || i_133_ > 0)
								method6243();
							if (i_133_ != 0) {
								aClass178_Sub2_3714.method3074(false);
								aClass178_Sub2_3714.method3071();
								aClass178_Sub2_3714.method3378(i_129_, i_130_, i_131_, i_132_);
							}
						}
					}
				}
			}
		}
	}

	float method6262(float f) {
		int i = aClass178_Sub2_3714.method3039(1581046223).method2875();
		float f_135_ = ((f + aClass178_Sub2_3714.method15089()) / (float) i * 2.0F - 1.0F);
		return f_135_;
	}

	void method6263() {
		if (anInt3715 == anInt3720) {
			anInt3720 *= 2;
			float[] fs = new float[anInt3720 * 16];
			for (int i = 0; i < anInt3715 * 16; i++)
				fs[i] = aFloatArray3716[i];
			aFloatArray3716 = fs;
			Interface37[] interface37s = new Interface37[anInt3720];
			int[] is = new int[anInt3720];
			for (int i = 0; i < anInt3715; i++) {
				interface37s[i] = anInterface37Array3717[i];
				is[i] = anIntArray3718[i];
			}
			anInterface37Array3717 = interface37s;
			anIntArray3718 = is;
		}
	}

	float method6264(float f) {
		int i = aClass178_Sub2_3714.method3039(1630283473).method2875();
		float f_136_ = ((f + aClass178_Sub2_3714.method15089()) / (float) i * 2.0F - 1.0F);
		return f_136_;
	}

	float method6265(float f) {
		int i = aClass178_Sub2_3714.method3039(1905033317).method2875();
		float f_137_ = ((f + aClass178_Sub2_3714.method15089()) / (float) i * 2.0F - 1.0F);
		return f_137_;
	}

	Class356(Class178_Sub2 class178_sub2, int i) {
		anInt3715 = 0;
		aFloatArray3716 = new float[anInt3720 * 16];
		anInterface37Array3717 = new Interface37[anInt3720];
		anIntArray3718 = new int[anInt3720];
		anIntArray3723 = new int[4];
		aClass178_Sub2_3714 = class178_sub2;
		anInterface36_3711 = aClass178_Sub2_3714.method15030(true);
		anInterface36_3711.method215(i * 96, 24);
		aClass345_3721 = (aClass178_Sub2_3714.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3613 }) }));
		anInterface40_3722 = aClass178_Sub2_3714.method15029(false);
		int i_138_ = i * 6;
		anInterface40_3722.method275(i_138_);
		int i_139_ = i_138_ * (anInterface40_3722.method276().anInt1831 * 1602321003);
		ByteBuffer bytebuffer = aClass178_Sub2_3714.aByteBuffer9539;
		aClass178_Sub2_3714.method15125(i_139_);
		bytebuffer.clear();
		for (int i_140_ = 0; i_140_ < i; i_140_++) {
			bytebuffer.putShort((short) (i_140_ * 4));
			bytebuffer.putShort((short) (i_140_ * 4 + 2));
			bytebuffer.putShort((short) (i_140_ * 4 + 1));
			bytebuffer.putShort((short) (i_140_ * 4 + 2));
			bytebuffer.putShort((short) (i_140_ * 4 + 3));
			bytebuffer.putShort((short) (i_140_ * 4 + 1));
		}
		anInterface40_3722.method265(0, i_138_ * ((anInterface40_3722.method276().anInt1831) * 1602321003), aClass178_Sub2_3714.aLong9540);
		anInt3719 = i;
		anInt3715 = 0;
	}

	float method6266(float f) {
		int i = aClass178_Sub2_3714.method3039(2071134857).method2875();
		float f_141_ = ((f + aClass178_Sub2_3714.method15089()) / (float) i * 2.0F - 1.0F);
		return f_141_;
	}

	float method6267(float f) {
		int i = aClass178_Sub2_3714.method3039(1591794641).method2874();
		float f_142_ = (((1.0F - (f + aClass178_Sub2_3714.method15089()) / (float) i) * 2.0F) - 1.0F);
		return f_142_;
	}

	float method6268(float f) {
		int i = aClass178_Sub2_3714.method3039(1793364486).method2874();
		float f_143_ = (((1.0F - (f + aClass178_Sub2_3714.method15089()) / (float) i) * 2.0F) - 1.0F);
		return f_143_;
	}

	void method6269(float f, float f_144_, float f_145_, float f_146_, float f_147_, float f_148_, float f_149_, float f_150_, float f_151_, float f_152_, float f_153_, float f_154_, float f_155_, float f_156_, float f_157_, float f_158_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_159_ = anIntArray3723[0];
			int i_160_ = anIntArray3723[1];
			int i_161_ = anIntArray3723[2];
			int i_162_ = anIntArray3723[3];
			int i_163_ = 0;
			int i_164_ = ((f < (float) i_159_ ? 1 : 0) + (f_145_ < (float) i_159_ ? 1 : 0) + (f_147_ < (float) i_159_ ? 1 : 0) + (f_149_ < (float) i_159_ ? 1 : 0));
			if (i_164_ != 4) {
				i_163_ |= i_164_;
				i_164_ = ((f > (float) i_161_ ? 1 : 0) + (f_145_ > (float) i_161_ ? 1 : 0) + (f_147_ > (float) i_161_ ? 1 : 0) + (f_149_ > (float) i_161_ ? 1 : 0));
				if (i_164_ != 4) {
					i_163_ |= i_164_;
					i_164_ = ((f_144_ < (float) i_160_ ? 1 : 0) + (f_146_ < (float) i_160_ ? 1 : 0) + (f_148_ < (float) i_160_ ? 1 : 0) + (f_150_ < (float) i_160_ ? 1 : 0));
					if (i_164_ != 4) {
						i_163_ |= i_164_;
						i_164_ = ((f_144_ > (float) i_162_ ? 1 : 0) + (f_146_ > (float) i_162_ ? 1 : 0) + (f_148_ > (float) i_162_ ? 1 : 0) + (f_150_ > (float) i_162_ ? 1 : 0));
						if (i_164_ != 4) {
							i_163_ |= i_164_;
							if (i_163_ != 0) {
								method6243();
								aClass178_Sub2_3714.method3074(true);
								aClass178_Sub2_3714.method3378(i_159_, i_160_, i_161_, i_162_);
							}
							method6246();
							f = method6247(f);
							f_144_ = method6245(f_144_);
							f_145_ = method6247(f_145_);
							f_146_ = method6245(f_146_);
							f_147_ = method6247(f_147_);
							f_148_ = method6245(f_148_);
							f_149_ = method6247(f_149_);
							f_150_ = method6245(f_150_);
							aFloatArray3716[anInt3715 * 16 + 0] = f;
							aFloatArray3716[anInt3715 * 16 + 1] = f_144_;
							aFloatArray3716[anInt3715 * 16 + 2] = f_151_;
							aFloatArray3716[anInt3715 * 16 + 3] = f_152_;
							aFloatArray3716[anInt3715 * 16 + 4] = f_145_;
							aFloatArray3716[anInt3715 * 16 + 5] = f_146_;
							aFloatArray3716[anInt3715 * 16 + 6] = f_153_;
							aFloatArray3716[anInt3715 * 16 + 7] = f_154_;
							aFloatArray3716[anInt3715 * 16 + 8] = f_147_;
							aFloatArray3716[anInt3715 * 16 + 9] = f_148_;
							aFloatArray3716[anInt3715 * 16 + 10] = f_155_;
							aFloatArray3716[anInt3715 * 16 + 11] = f_156_;
							aFloatArray3716[anInt3715 * 16 + 12] = f_149_;
							aFloatArray3716[anInt3715 * 16 + 13] = f_150_;
							aFloatArray3716[anInt3715 * 16 + 14] = f_157_;
							aFloatArray3716[anInt3715 * 16 + 15] = f_158_;
							anInterface37Array3717[anInt3715] = interface37;
							if (aClass178_Sub2_3714.anInt9670 == 1)
								anIntArray3718[anInt3715] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3718[anInt3715] = i;
							anInt3715++;
							if (aClass348_3712 == Class348.aClass348_3635 || i_163_ > 0)
								method6243();
							if (i_163_ != 0) {
								aClass178_Sub2_3714.method3074(false);
								aClass178_Sub2_3714.method3071();
								aClass178_Sub2_3714.method3378(i_159_, i_160_, i_161_, i_162_);
							}
						}
					}
				}
			}
		}
	}

	void method6270() {
		if (aClass348_3713 != null) {
			aClass348_3712 = aClass348_3713;
			aClass348_3713 = null;
		}
	}

	void method6271() {
		if (aClass348_3713 != null) {
			aClass348_3712 = aClass348_3713;
			aClass348_3713 = null;
		}
	}

	Class348 method6272() {
		return aClass348_3712;
	}

	void method6273(float f, float f_165_, float f_166_, float f_167_, float f_168_, float f_169_, float f_170_, float f_171_, float f_172_, float f_173_, float f_174_, float f_175_, float f_176_, float f_177_, float f_178_, float f_179_, Interface37 interface37, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass178_Sub2_3714.method3075(anIntArray3723);
			int i_180_ = anIntArray3723[0];
			int i_181_ = anIntArray3723[1];
			int i_182_ = anIntArray3723[2];
			int i_183_ = anIntArray3723[3];
			int i_184_ = 0;
			int i_185_ = ((f < (float) i_180_ ? 1 : 0) + (f_166_ < (float) i_180_ ? 1 : 0) + (f_168_ < (float) i_180_ ? 1 : 0) + (f_170_ < (float) i_180_ ? 1 : 0));
			if (i_185_ != 4) {
				i_184_ |= i_185_;
				i_185_ = ((f > (float) i_182_ ? 1 : 0) + (f_166_ > (float) i_182_ ? 1 : 0) + (f_168_ > (float) i_182_ ? 1 : 0) + (f_170_ > (float) i_182_ ? 1 : 0));
				if (i_185_ != 4) {
					i_184_ |= i_185_;
					i_185_ = ((f_165_ < (float) i_181_ ? 1 : 0) + (f_167_ < (float) i_181_ ? 1 : 0) + (f_169_ < (float) i_181_ ? 1 : 0) + (f_171_ < (float) i_181_ ? 1 : 0));
					if (i_185_ != 4) {
						i_184_ |= i_185_;
						i_185_ = ((f_165_ > (float) i_183_ ? 1 : 0) + (f_167_ > (float) i_183_ ? 1 : 0) + (f_169_ > (float) i_183_ ? 1 : 0) + (f_171_ > (float) i_183_ ? 1 : 0));
						if (i_185_ != 4) {
							i_184_ |= i_185_;
							if (i_184_ != 0) {
								method6243();
								aClass178_Sub2_3714.method3074(true);
								aClass178_Sub2_3714.method3378(i_180_, i_181_, i_182_, i_183_);
							}
							method6246();
							f = method6247(f);
							f_165_ = method6245(f_165_);
							f_166_ = method6247(f_166_);
							f_167_ = method6245(f_167_);
							f_168_ = method6247(f_168_);
							f_169_ = method6245(f_169_);
							f_170_ = method6247(f_170_);
							f_171_ = method6245(f_171_);
							aFloatArray3716[anInt3715 * 16 + 0] = f;
							aFloatArray3716[anInt3715 * 16 + 1] = f_165_;
							aFloatArray3716[anInt3715 * 16 + 2] = f_172_;
							aFloatArray3716[anInt3715 * 16 + 3] = f_173_;
							aFloatArray3716[anInt3715 * 16 + 4] = f_166_;
							aFloatArray3716[anInt3715 * 16 + 5] = f_167_;
							aFloatArray3716[anInt3715 * 16 + 6] = f_174_;
							aFloatArray3716[anInt3715 * 16 + 7] = f_175_;
							aFloatArray3716[anInt3715 * 16 + 8] = f_168_;
							aFloatArray3716[anInt3715 * 16 + 9] = f_169_;
							aFloatArray3716[anInt3715 * 16 + 10] = f_176_;
							aFloatArray3716[anInt3715 * 16 + 11] = f_177_;
							aFloatArray3716[anInt3715 * 16 + 12] = f_170_;
							aFloatArray3716[anInt3715 * 16 + 13] = f_171_;
							aFloatArray3716[anInt3715 * 16 + 14] = f_178_;
							aFloatArray3716[anInt3715 * 16 + 15] = f_179_;
							anInterface37Array3717[anInt3715] = interface37;
							if (aClass178_Sub2_3714.anInt9670 == 1)
								anIntArray3718[anInt3715] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3718[anInt3715] = i;
							anInt3715++;
							if (aClass348_3712 == Class348.aClass348_3635 || i_184_ > 0)
								method6243();
							if (i_184_ != 0) {
								aClass178_Sub2_3714.method3074(false);
								aClass178_Sub2_3714.method3071();
								aClass178_Sub2_3714.method3378(i_180_, i_181_, i_182_, i_183_);
							}
						}
					}
				}
			}
		}
	}
}
