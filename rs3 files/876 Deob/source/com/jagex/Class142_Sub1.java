/* Class142_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class142_Sub1 extends Class142 {
	int[][][] anIntArrayArrayArray8997;
	static final int anInt8998 = 74;
	Class178_Sub2 aClass178_Sub2_8999;
	int anInt9000;
	int[] anIntArray9001;
	int anInt9002;
	int anInt9003;
	Class523[] aClass523Array9004;
	int anInt9005;
	short[][] aShortArrayArray9006;
	float aFloat9007 = 3.4028235E38F;
	float aFloat9008 = -3.4028235E38F;
	Class523_Sub23[][][] aClass523_Sub23ArrayArrayArray9009;
	int[][][] anIntArrayArrayArray9010;
	int[][][] anIntArrayArrayArray9011;
	int[][][] anIntArrayArrayArray9012;
	Interface36 anInterface36_9013;
	int anInt9014;
	Class708 aClass708_9015 = new Class708();
	int anInt9016;
	Class351 aClass351_9017;
	byte[][] aByteArrayArray9018;
	Class523[] aClass523Array9019;
	Class14 aClass14_9020;
	Interface36 anInterface36_9021;
	Class345 aClass345_9022;
	int anInt9023;
	int anInt9024;
	int anInt9025;
	float[][] aFloatArrayArray9026;
	float[][] aFloatArrayArray9027;
	float[][] aFloatArrayArray9028;
	byte[][] aByteArrayArray9029;
	int anInt9030;
	int[][][] anIntArrayArrayArray9031;
	ByteBuffer aByteBuffer9032;
	ByteBuffer aByteBuffer9033;
	int anInt9034;
	int[] anIntArray9035 = new int[1];
	int[] anIntArray9036 = new int[1];
	int[][][] anIntArrayArrayArray9037;
	static final int anInt9038 = 1;

	void method14437(int i, int i_0_, byte[][] is, Class523_Sub23[] class523_sub23s, Class14 class14, Class523_Sub23[] class523_sub23s_1_) {
		if (anIntArrayArrayArray9010[i][i_0_] != null) {
			Class523_Sub23[] class523_sub23s_2_ = aClass523_Sub23ArrayArrayArray9009[i][i_0_];
			int[] is_3_ = anIntArrayArrayArray9012[i][i_0_];
			int[] is_4_ = anIntArrayArrayArray9011[i][i_0_];
			int[] is_5_ = anIntArrayArrayArray8997[i][i_0_];
			int[] is_6_ = anIntArrayArrayArray9010[i][i_0_];
			int[] is_7_ = (anIntArrayArrayArray9031 != null ? anIntArrayArrayArray9031[i][i_0_] : null);
			int[] is_8_ = (anIntArrayArrayArray9037 != null ? anIntArrayArrayArray9037[i][i_0_] : null);
			if (is_5_ == null)
				is_5_ = is_6_;
			float f = aFloatArrayArray9026[i][i_0_];
			float f_9_ = aFloatArrayArray9027[i][i_0_];
			float f_10_ = aFloatArrayArray9028[i][i_0_];
			float f_11_ = aFloatArrayArray9026[i][i_0_ + 1];
			float f_12_ = aFloatArrayArray9027[i][i_0_ + 1];
			float f_13_ = aFloatArrayArray9028[i][i_0_ + 1];
			float f_14_ = aFloatArrayArray9026[i + 1][i_0_ + 1];
			float f_15_ = aFloatArrayArray9027[i + 1][i_0_ + 1];
			float f_16_ = aFloatArrayArray9028[i + 1][i_0_ + 1];
			float f_17_ = aFloatArrayArray9026[i + 1][i_0_];
			float f_18_ = aFloatArrayArray9027[i + 1][i_0_];
			float f_19_ = aFloatArrayArray9028[i + 1][i_0_];
			int i_20_ = is[i][i_0_] & 0xff;
			int i_21_ = is[i][i_0_ + 1] & 0xff;
			int i_22_ = is[i + 1][i_0_ + 1] & 0xff;
			int i_23_ = is[i + 1][i_0_] & 0xff;
			int i_24_ = 0;
			while_7_: for (int i_25_ = 0; i_25_ < is_6_.length; i_25_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s_2_[i_25_];
				for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
					if (class523_sub23s[i_26_] == class523_sub23)
						continue while_7_;
				}
				class523_sub23s[i_24_++] = class523_sub23;
			}
			short[] is_27_ = (aShortArrayArray9006[i_0_ * (anInt1683 * 692304099) + i] = new short[is_6_.length]);
			for (int i_28_ = 0; i_28_ < is_6_.length; i_28_++) {
				int i_29_ = (i << anInt1680 * -1193058675) + is_3_[i_28_];
				int i_30_ = (i_0_ << anInt1680 * -1193058675) + is_4_[i_28_];
				int i_31_ = i_29_ >> anInt9000;
				int i_32_ = i_30_ >> anInt9000;
				int i_33_ = is_6_[i_28_];
				int i_34_ = is_5_[i_28_];
				int i_35_ = is_7_ != null ? is_7_[i_28_] : 0;
				long l = ((long) i_34_ << 48 | (long) i_33_ << 32 | (long) (i_31_ << 16) | (long) i_32_);
				int i_36_ = is_3_[i_28_];
				int i_37_ = is_4_[i_28_];
				int i_38_ = 74;
				int i_39_ = 0;
				float f_40_ = 1.0F;
				float f_41_;
				float f_42_;
				float f_43_;
				if (i_36_ == 0 && i_37_ == 0) {
					f_41_ = f;
					f_42_ = f_9_;
					f_43_ = f_10_;
					i_38_ -= i_20_;
				} else if (i_36_ == 0 && i_37_ == anInt1682 * 341909049) {
					f_41_ = f_11_;
					f_42_ = f_12_;
					f_43_ = f_13_;
					i_38_ -= i_21_;
				} else if (i_36_ == anInt1682 * 341909049 && i_37_ == anInt1682 * 341909049) {
					f_41_ = f_14_;
					f_42_ = f_15_;
					f_43_ = f_16_;
					i_38_ -= i_22_;
				} else if (i_36_ == anInt1682 * 341909049 && i_37_ == 0) {
					f_41_ = f_17_;
					f_42_ = f_18_;
					f_43_ = f_19_;
					i_38_ -= i_23_;
				} else {
					float f_44_ = (float) i_36_ / (float) (anInt1682 * 341909049);
					float f_45_ = (float) i_37_ / (float) (anInt1682 * 341909049);
					float f_46_ = f + (f_17_ - f) * f_44_;
					float f_47_ = f_9_ + (f_18_ - f_9_) * f_44_;
					float f_48_ = f_10_ + (f_19_ - f_10_) * f_44_;
					float f_49_ = f_11_ + (f_14_ - f_11_) * f_44_;
					float f_50_ = f_12_ + (f_15_ - f_12_) * f_44_;
					float f_51_ = f_13_ + (f_16_ - f_13_) * f_44_;
					f_41_ = f_46_ + (f_49_ - f_46_) * f_45_;
					f_42_ = f_47_ + (f_50_ - f_47_) * f_45_;
					f_43_ = f_48_ + (f_51_ - f_48_) * f_45_;
					int i_52_ = i_20_ + ((i_23_ - i_20_) * i_36_ >> anInt1680 * -1193058675);
					int i_53_ = i_21_ + ((i_22_ - i_21_) * i_36_ >> anInt1680 * -1193058675);
					i_38_ -= i_52_ + ((i_53_ - i_52_) * i_37_ >> anInt1680 * -1193058675);
				}
				if (i_33_ != -1) {
					int i_54_ = (i_33_ & 0x7f) * i_38_ >> 7;
					if (i_54_ < 2)
						i_54_ = 2;
					else if (i_54_ > 126)
						i_54_ = 126;
					i_39_ = Class638.anIntArray8307[i_33_ & 0xff80 | i_54_];
					if ((anInt9003 & 0x7) == 0) {
						f_40_ = (aClass178_Sub2_8999.aFloatArray9608[0] * f_41_ + aClass178_Sub2_8999.aFloatArray9608[1] * f_42_ + (aClass178_Sub2_8999.aFloatArray9608[2] * f_43_));
						f_40_ = (aClass178_Sub2_8999.aFloat9643 + f_40_ * (f_40_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618));
					}
				}
				Class523 class523 = null;
				if ((i_29_ & anInt9030 - 1) == 0 && (i_30_ & anInt9030 - 1) == 0)
					class523 = class14.getFromIndex(l);
				int i_55_;
				if (class523 == null) {
					int i_56_;
					if (i_34_ != i_33_) {
						int i_57_ = (i_34_ & 0x7f) * i_38_ >> 7;
						if (i_57_ < 2)
							i_57_ = 2;
						else if (i_57_ > 126)
							i_57_ = 126;
						i_56_ = Class638.anIntArray8307[i_34_ & 0xff80 | i_57_];
						if ((anInt9003 & 0x7) == 0) {
							float f_58_ = ((aClass178_Sub2_8999.aFloatArray9608[0] * f_41_) + (aClass178_Sub2_8999.aFloatArray9608[1] * f_42_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_43_));
							f_58_ = (aClass178_Sub2_8999.aFloat9643 + (f_40_ * (f_40_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618)));
							int i_59_ = i_56_ >> 16 & 0xff;
							int i_60_ = i_56_ >> 8 & 0xff;
							int i_61_ = i_56_ & 0xff;
							i_59_ *= f_58_;
							if (i_59_ < 0)
								i_59_ = 0;
							else if (i_59_ > 255)
								i_59_ = 255;
							i_60_ *= f_58_;
							if (i_60_ < 0)
								i_60_ = 0;
							else if (i_60_ > 255)
								i_60_ = 255;
							i_61_ *= f_58_;
							if (i_61_ < 0)
								i_61_ = 0;
							else if (i_61_ > 255)
								i_61_ = 255;
							i_56_ = i_59_ << 16 | i_60_ << 8 | i_61_;
						}
					} else
						i_56_ = i_39_;
					aByteBuffer9033.putFloat((float) i_29_);
					aByteBuffer9033.putFloat((float) (method2326(i_29_, i_30_, 2022266064) + i_35_));
					aByteBuffer9033.putFloat((float) i_30_);
					aByteBuffer9033.putFloat((float) i_29_);
					aByteBuffer9033.putFloat((float) i_30_);
					if (anIntArrayArrayArray9037 != null)
						aByteBuffer9033.putFloat(is_8_ != null ? (float) (is_8_[i_28_] - 1) : 0.0F);
					if ((anInt9003 & 0x7) != 0) {
						aByteBuffer9033.putFloat(f_41_);
						aByteBuffer9033.putFloat(f_42_);
						aByteBuffer9033.putFloat(f_43_);
					}
					if (aClass178_Sub2_8999.anInt9670 == 0) {
						int i_62_ = i_56_ & ~0xff00ff;
						i_62_ |= (i_56_ & 0xff0000) >> 16;
						i_62_ |= (i_56_ & 0xff) << 16;
						i_56_ = i_62_;
					}
					aByteBuffer9032.putInt(~0xffffff | i_56_);
					i_55_ = anInt9016++;
					is_27_[i_28_] = (short) i_55_;
					if (i_33_ != -1)
						class523_sub23s_1_[i_55_] = class523_sub23s_2_[i_28_];
					class14.method738(new Class523_Sub6(is_27_[i_28_]), l);
				} else {
					is_27_[i_28_] = ((Class523_Sub6) class523).aShort10403;
					i_55_ = is_27_[i_28_] & 0xffff;
					if (i_33_ != -1 && ((class523_sub23s_2_[i_28_].aLong7065 * 1055205983951172633L) < (class523_sub23s_1_[i_55_].aLong7065 * 1055205983951172633L)))
						class523_sub23s_1_[i_55_] = class523_sub23s_2_[i_28_];
				}
				for (int i_63_ = 0; i_63_ < i_24_; i_63_++)
					class523_sub23s[i_63_].method16120(i_55_, i_39_, i_38_, f_40_);
				anInt9005++;
			}
		}
	}

	public void method2320(int i, int i_64_, int i_65_) {
		i = Math.min(aByteArrayArray9029.length - 1, Math.max(0, i));
		i_64_ = Math.min(aByteArrayArray9029[i].length - 1, Math.max(0, i_64_));
		if ((aByteArrayArray9029[i][i_64_] & 0xff) < i_65_)
			aByteArrayArray9029[i][i_64_] = (byte) i_65_;
	}

	public void method2351(int i, int i_66_, int[] is, int[] is_67_, int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_, int[] is_72_, int[] is_73_, Class163 class163, boolean bool) {
		Class172 class172 = aClass178_Sub2_8999.aClass172_1916;
		if (is_69_ != null && anIntArrayArrayArray9037 == null)
			anIntArrayArrayArray9037 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		if (is_67_ != null && anIntArrayArrayArray9031 == null)
			anIntArrayArrayArray9031 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		anIntArrayArrayArray9012[i][i_66_] = is;
		anIntArrayArrayArray9011[i][i_66_] = is_68_;
		anIntArrayArrayArray9010[i][i_66_] = is_70_;
		anIntArrayArrayArray8997[i][i_66_] = is_71_;
		if (anIntArrayArrayArray9037 != null)
			anIntArrayArrayArray9037[i][i_66_] = is_69_;
		if (anIntArrayArrayArray9031 != null)
			anIntArrayArrayArray9031[i][i_66_] = is_67_;
		Class523_Sub23[] class523_sub23s = (aClass523_Sub23ArrayArrayArray9009[i][i_66_] = new Class523_Sub23[is_70_.length]);
		for (int i_74_ = 0; i_74_ < is_70_.length; i_74_++) {
			int i_75_ = is_72_[i_74_];
			int i_76_ = is_73_[i_74_];
			if ((anInt9003 & 0x20) != 0 && i_75_ != -1 && class172.method2895(i_75_, -1183909306).aBool1876) {
				i_76_ = 128;
				i_75_ = -1;
			}
			long l = ((long) (class163.anInt1774 * -1046224519) << 48 | (long) (class163.anInt1775 * -118212955) << 42 | (long) (class163.anInt1776 * -319632409) << 28 | (long) (i_76_ << 14) | (long) i_75_);
			Class523 class523;
			for (class523 = aClass14_9020.getFromIndex(l); class523 != null; class523 = aClass14_9020.method740(231172810)) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) class523;
				if (class523_sub23.anInt10530 == i_75_ && class523_sub23.aFloat10540 == (float) i_76_ && class523_sub23.aClass163_10532.method2591(class163, 1289729801))
					break;
			}
			if (class523 == null) {
				class523_sub23s[i_74_] = new Class523_Sub23(this, i_75_, i_76_, class163);
				aClass14_9020.method738(class523_sub23s[i_74_], l);
			} else
				class523_sub23s[i_74_] = (Class523_Sub23) class523;
		}
		if (bool)
			aByteArrayArray9018[i][i_66_] |= 0x1;
		if (is_70_.length > anInt9024)
			anInt9024 = is_70_.length;
		anInt9023 += is_70_.length;
	}

	public void method2319(int i, int i_77_, int i_78_) {
		i = Math.min(aByteArrayArray9029.length - 1, Math.max(0, i));
		i_77_ = Math.min(aByteArrayArray9029[i].length - 1, Math.max(0, i_77_));
		if ((aByteArrayArray9029[i][i_77_] & 0xff) < i_78_)
			aByteArrayArray9029[i][i_77_] = (byte) i_78_;
	}

	public void method2347() {
		if (anInt9023 <= 0) {
			aClass351_9017 = null;
			method14438();
		} else {
			byte[][] is = (new byte[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1]);
			for (int i = 1; i < anInt1683 * 692304099; i++) {
				for (int i_79_ = 1; i_79_ < anInt1681 * 452998539; i_79_++)
					is[i][i_79_] = (byte) ((aByteArrayArray9029[i - 1][i_79_] >> 2) + (aByteArrayArray9029[i + 1][i_79_] >> 3) + (aByteArrayArray9029[i][i_79_ - 1] >> 2) + (aByteArrayArray9029[i][i_79_ + 1] >> 3) + (aByteArrayArray9029[i][i_79_] >> 1));
			}
			aClass523Array9004 = new Class523[aClass14_9020.method734(374781914)];
			aClass14_9020.method739(aClass523Array9004, (byte) -39);
			for (int i = 0; i < aClass523Array9004.length; i++)
				((Class523_Sub23) aClass523Array9004[i]).method16135(anInt9023);
			anInt9034 = 20;
			if (anIntArrayArrayArray9037 != null)
				anInt9034 += 4;
			if ((anInt9003 & 0x7) != 0)
				anInt9034 += 12;
			aByteBuffer9032 = aClass178_Sub2_8999.method14922(anInt9023 * 4);
			aByteBuffer9033 = aClass178_Sub2_8999.method14922(anInt9023 * anInt9034);
			Class523_Sub23[] class523_sub23s = new Class523_Sub23[anInt9023];
			int i = Class375.method6383(anInt9023 / 4, 189765723);
			if (i < 1)
				i = 1;
			Class14 class14 = new Class14(i);
			Class523_Sub23[] class523_sub23s_80_ = new Class523_Sub23[anInt9024];
			for (int i_81_ = 0; i_81_ < anInt1683 * 692304099; i_81_++) {
				for (int i_82_ = 0; i_82_ < anInt1681 * 452998539; i_82_++)
					method14437(i_81_, i_82_, is, class523_sub23s_80_, class14, class523_sub23s);
			}
			for (int i_83_ = 0; i_83_ < anInt9016; i_83_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s[i_83_];
				if (class523_sub23 != null)
					class523_sub23.method16118(i_83_);
			}
			for (int i_84_ = 0; i_84_ < anInt1683 * 692304099; i_84_++) {
				for (int i_85_ = 0; i_85_ < anInt1681 * 452998539; i_85_++) {
					short[] is_86_ = (aShortArrayArray9006[i_85_ * (anInt1683 * 692304099) + i_84_]);
					if (is_86_ != null) {
						int i_87_ = 0;
						int i_88_ = 0;
						while (i_88_ < is_86_.length) {
							int i_89_ = is_86_[i_88_++] & 0xffff;
							int i_90_ = is_86_[i_88_++] & 0xffff;
							int i_91_ = is_86_[i_88_++] & 0xffff;
							Class523_Sub23 class523_sub23 = class523_sub23s[i_89_];
							Class523_Sub23 class523_sub23_92_ = class523_sub23s[i_90_];
							Class523_Sub23 class523_sub23_93_ = class523_sub23s[i_91_];
							Class523_Sub23 class523_sub23_94_ = null;
							if (class523_sub23 != null) {
								class523_sub23.method16139(i_84_, i_85_, i_87_);
								class523_sub23_94_ = class523_sub23;
							}
							if (class523_sub23_92_ != null) {
								class523_sub23_92_.method16139(i_84_, i_85_, i_87_);
								if (class523_sub23_94_ == null || ((class523_sub23_92_.aLong7065 * 1055205983951172633L) < (class523_sub23_94_.aLong7065 * 1055205983951172633L)))
									class523_sub23_94_ = class523_sub23_92_;
							}
							if (class523_sub23_93_ != null) {
								class523_sub23_93_.method16139(i_84_, i_85_, i_87_);
								if (class523_sub23_94_ == null || ((class523_sub23_93_.aLong7065 * 1055205983951172633L) < (class523_sub23_94_.aLong7065 * 1055205983951172633L)))
									class523_sub23_94_ = class523_sub23_93_;
							}
							if (class523_sub23_94_ != null) {
								if (class523_sub23 != null)
									class523_sub23_94_.method16118(i_89_);
								if (class523_sub23_92_ != null)
									class523_sub23_94_.method16118(i_90_);
								if (class523_sub23_93_ != null)
									class523_sub23_94_.method16118(i_91_);
								class523_sub23_94_.method16139(i_84_, i_85_, i_87_);
							}
							i_87_++;
						}
					}
				}
			}
			anInt9014 = 0;
			for (int i_95_ = 0; i_95_ < aClass523Array9004.length; i_95_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i_95_];
				if (class523_sub23.anInt10534 > 0)
					aClass523Array9004[anInt9014++] = class523_sub23;
			}
			aClass523Array9019 = new Class523[anInt9014];
			long[] ls = new long[anInt9014];
			for (int i_96_ = 0; i_96_ < anInt9014; i_96_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i_96_];
				ls[i_96_] = class523_sub23.aLong7065 * 1055205983951172633L;
				aClass523Array9019[i_96_] = class523_sub23;
			}
			Class447.method7245(ls, aClass523Array9019, (byte) -50);
			method14442();
		}
	}

	public Class523_Sub27_Sub4 method2346(int i, int i_97_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9018[i][i_97_] & 0x1) == 0)
			return null;
		int i_98_ = anInt1682 * 341909049 >> aClass178_Sub2_8999.anInt9623;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_99_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_98_, i_98_)) {
			class523_sub27_sub4_sub2_99_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_99_.method18545();
		} else
			class523_sub27_sub4_sub2_99_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_8999, i_98_, i_98_);
		class523_sub27_sub4_sub2_99_.method18544(0, 0, i_98_, i_98_);
		method14439(class523_sub27_sub4_sub2_99_, i, i_97_);
		return class523_sub27_sub4_sub2_99_;
	}

	void method14438() {
		if ((anInt9002 & 0x2) == 0) {
			anIntArrayArrayArray9011 = null;
			anIntArrayArrayArray9012 = null;
			anIntArrayArrayArray9010 = null;
		}
		anIntArrayArrayArray9037 = null;
		anIntArrayArrayArray8997 = null;
		anIntArrayArrayArray9031 = null;
		aClass523_Sub23ArrayArrayArray9009 = null;
		aByteArrayArray9029 = null;
		aClass14_9020 = null;
		aClass523Array9004 = null;
		aFloatArrayArray9028 = null;
		aFloatArrayArray9027 = null;
		aFloatArrayArray9026 = null;
	}

	public void method2325(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, boolean[][] bools) {
		if (anInt9023 > 0) {
			Interface40 interface40 = aClass178_Sub2_8999.method14951(anInt9005);
			int i_106_ = 0;
			int i_107_ = 32767;
			int i_108_ = -32768;
			ByteBuffer bytebuffer = aClass178_Sub2_8999.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_109_ = i_103_; i_109_ < i_105_; i_109_++) {
				int i_110_ = i_109_ * (anInt1683 * 692304099) + i_102_;
				for (int i_111_ = i_102_; i_111_ < i_104_; i_111_++) {
					if (bools[i_111_ - i_102_][i_109_ - i_103_]) {
						short[] is = aShortArrayArray9006[i_110_];
						if (is != null) {
							for (int i_112_ = 0; i_112_ < is.length; i_112_++) {
								int i_113_ = is[i_112_] & 0xffff;
								if (i_113_ > i_108_)
									i_108_ = i_113_;
								if (i_113_ < i_107_)
									i_107_ = i_113_;
								bytebuffer.putShort((short) i_113_);
								i_106_++;
							}
						}
					}
					i_110_++;
				}
			}
			interface40.method265(0, bytebuffer.position(), aClass178_Sub2_8999.aLong9540);
			if (i_106_ > 0) {
				aClass178_Sub2_8999.method15043();
				Class329 class329 = aClass178_Sub2_8999.aClass329_9642;
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15033(1, anInterface36_9021);
				aClass178_Sub2_8999.method15032(aClass345_9022);
				aClass178_Sub2_8999.method15213(interface40);
				aClass178_Sub2_8999.method3300(Class435.aClass435_4890);
				float f = (float) aClass178_Sub2_8999.method3039(1654054304).method2875();
				float f_114_ = (float) aClass178_Sub2_8999.method3039(1360500523).method2874();
				Class435 class435 = new Class435();
				Class435 class435_115_ = new Class435();
				class435.method6830(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class435_115_.method6815(((float) i_101_ / (256.0F * (float) (anInt1682 * 341909049))), ((float) -i_101_ / (256.0F * (float) (anInt1682 * 341909049))), 1.0F / (aFloat9008 - aFloat9007));
				class435_115_.method6819((float) i - (float) (i_102_ * i_101_) / 256.0F, (float) i_100_ + (float) (i_105_ * i_101_) / 256.0F, -aFloat9007 / (aFloat9008 - aFloat9007));
				class435_115_.method6816(2.0F / f, 2.0F / f_114_, 1.0F);
				class435_115_.method6819(-1.0F, -1.0F, 0.0F);
				aClass178_Sub2_8999.aClass435_9559.method6821(class435, class435_115_);
				aClass178_Sub2_8999.aClass441_9560.method7090(aClass178_Sub2_8999.aClass435_9559);
				aClass178_Sub2_8999.method3124(aClass178_Sub2_8999.aClass441_9560);
				class329.method5790(Class441.aClass441_4917);
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
				class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
				class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
				class329.aClass441_3480.method7085();
				class329.anInt3493 = i_107_;
				class329.anInt3494 = i_108_ - i_107_ + 1;
				class329.anInt3481 = 0;
				class329.anInt3496 = i_106_ / 3;
				if (aClass178_Sub2_8999.aBool9604) {
					aClass178_Sub2_8999.method3287(false);
					class329.method5793(false);
					aClass178_Sub2_8999.method3287(true);
				} else
					class329.method5793(false);
			}
		}
	}

	public void method2322(int i, int i_116_, int i_117_, boolean[][] bools, boolean bool, int i_118_) {
		if (aClass523Array9019 != null) {
			int i_119_ = i_117_ + i_117_ + 1;
			i_119_ *= i_119_;
			if (anIntArray9001.length < i_119_)
				anIntArray9001 = new int[i_119_];
			int i_120_ = i - i_117_;
			int i_121_ = i_120_;
			if (i_120_ < 0)
				i_120_ = 0;
			int i_122_ = i_116_ - i_117_;
			int i_123_ = i_122_;
			if (i_122_ < 0)
				i_122_ = 0;
			int i_124_ = i + i_117_;
			if (i_124_ > anInt1683 * 692304099 - 1)
				i_124_ = anInt1683 * 692304099 - 1;
			int i_125_ = i_116_ + i_117_;
			if (i_125_ > anInt1681 * 452998539 - 1)
				i_125_ = anInt1681 * 452998539 - 1;
			anInt9025 = 0;
			for (int i_126_ = i_120_; i_126_ <= i_124_; i_126_++) {
				boolean[] bools_127_ = bools[i_126_ - i_121_];
				for (int i_128_ = i_122_; i_128_ <= i_125_; i_128_++) {
					if (bools_127_[i_128_ - i_123_])
						anIntArray9001[anInt9025++] = i_128_ * (anInt1683 * 692304099) + i_126_;
				}
			}
			ByteBuffer bytebuffer = aClass178_Sub2_8999.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_129_ = 0; i_129_ < aClass523Array9019.length; i_129_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_129_];
				class523_sub23.method16122(anIntArray9001, anInt9025);
			}
			int i_130_ = bytebuffer.position();
			Class329 class329 = aClass178_Sub2_8999.aClass329_9642;
			aClass178_Sub2_8999.method15043();
			if (aClass178_Sub2_8999.anInt9663 > 0) {
				class329.aClass437_3484.method6972(((float) (aClass178_Sub2_8999.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_8999.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_8999.anInt9662 >> 0 & 0xff) / 255.0F));
				class329.aClass429_3486.method6773(0.0F, 0.0F, 1.0F, -(aClass178_Sub2_8999.aFloat9683));
				class329.aClass429_3486.method6762(aClass178_Sub2_8999.aClass441_9555);
				class329.aClass429_3486.method6766(1.0F / (aClass178_Sub2_8999.aFloat9681 - aClass178_Sub2_8999.aFloat9683));
			} else {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
			}
			if (i_130_ != 0) {
				Interface40 interface40 = aClass178_Sub2_8999.method14951(i_130_ / 2);
				interface40.method265(0, i_130_, aClass178_Sub2_8999.aLong9540);
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15213(interface40);
				class329.method5790(Class441.aClass441_4917);
				if ((anInt9003 & 0x7) == 0) {
					int i_131_ = 0;
					for (int i_132_ = 0; i_132_ < aClass523Array9019.length; i_132_++) {
						Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_132_];
						if (class523_sub23.anInt10535 != 0) {
							if (aClass178_Sub2_8999.aBool9656) {
								aClass178_Sub2_8999.method3150(0, class523_sub23.aClass163_10532);
								class329.aClass429_3490.method6773(0.0F, 1.0F, 0.0F, ((float) aClass178_Sub2_8999.anInt9601 + ((float) ((class523_sub23.aClass163_10532.anInt1774) * -1046224519) / 255.0F * (float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955))));
								class329.aClass429_3490.method6766(1.0F / (float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955));
								class329.aClass437_3479.method6972((float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 16 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 8 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 0 & 0xff) / 255.0F);
							} else {
								class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
								class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
							}
							boolean bool_133_ = false;
							if (class523_sub23.anInt10530 != -1) {
								Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -688039922));
								class329.anInterface37_3478 = aClass178_Sub2_8999.aClass349_9586.method6095(class177);
								bool_133_ = !Class164_Sub5.method15499((class177.aByte1905), (byte) 89);
							} else
								class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
							aClass178_Sub2_8999.method15033(1, class523_sub23.anInterface36_10533);
							aClass178_Sub2_8999.method15032(aClass345_9022);
							class329.aClass441_3480.method7093(1.0F / class523_sub23.aFloat10540, 1.0F / class523_sub23.aFloat10540, 1.0F, 1.0F);
							class329.anInt3493 = class523_sub23.anInt10531;
							class329.anInt3494 = (class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1);
							class329.anInt3481 = i_131_;
							class329.anInt3496 = class523_sub23.anInt10535 / 3;
							class329.method5793(bool_133_);
							i_131_ += class523_sub23.anInt10535;
						}
					}
				} else {
					class329.aClass437_3492.method6972(aClass178_Sub2_8999.aFloatArray9608[0], aClass178_Sub2_8999.aFloatArray9608[1], aClass178_Sub2_8999.aFloatArray9608[2]);
					class329.aClass437_3488.method6972((aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9689), (aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9614), (aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9704));
					class329.aClass437_3489.method6972((-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9689), (-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9614), (-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9704));
					class329.aClass437_3491.method6972((aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9689), (aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9614), (aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9704));
					int i_134_ = 0;
					for (int i_135_ = 0; i_135_ < aClass523Array9019.length; i_135_++) {
						Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_135_];
						if (class523_sub23.anInt10535 > 0) {
							if (aClass178_Sub2_8999.aBool9656) {
								aClass178_Sub2_8999.method3150(0, class523_sub23.aClass163_10532);
								float f = 0.15F;
								class329.aClass429_3490.method6773(0.0F, 1.0F / ((float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955) * f), 0.0F, 256.0F / ((float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955) * f));
								class329.aClass437_3479.method6972((float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 16 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 8 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 0 & 0xff) / 255.0F);
							} else {
								class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
								class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
							}
							byte i_136_ = 11;
							if (class523_sub23.anInt10530 != -1) {
								Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -1001025697));
								i_136_ = class177.aByte1905;
								class329.anInterface37_3478 = aClass178_Sub2_8999.aClass349_9586.method6095(class177);
								class329.method5792(class177.aByte1906);
							} else
								class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
							aClass178_Sub2_8999.method15033(1, class523_sub23.anInterface36_10533);
							aClass178_Sub2_8999.method15032(aClass345_9022);
							class329.aClass441_3480.method7093(1.0F / class523_sub23.aFloat10540, 1.0F / class523_sub23.aFloat10540, 1.0F, 1.0F);
							class329.anInt3493 = class523_sub23.anInt10531;
							class329.anInt3494 = (class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1);
							class329.anInt3481 = i_134_;
							class329.anInt3496 = class523_sub23.anInt10535 / 3;
							switch (i_136_) {
							default:
								if (aClass178_Sub2_8999.aBool9656)
									class329.method5797();
								else
									class329.method5817(0);
								break;
							case 6:
								class329.method5793(!Class164_Sub5.method15499(i_136_, (byte) 89));
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass178_Sub2_8999.aBool9647 && (anInt9003 & 0x8) != 0 && aClass178_Sub2_8999.aClass340_Sub1_Sub2_9616.method17931(-325542460)) {
									Class340_Sub1_Sub2 class340_sub1_sub2 = (aClass178_Sub2_8999.aClass340_Sub1_Sub2_9616);
									if (i_136_ == 2)
										class340_sub1_sub2 = (aClass178_Sub2_8999.aClass340_Sub1_Sub2_9646);
									class340_sub1_sub2.aClass441_11536.method7086(aClass178_Sub2_8999.aClass441_9575);
									class340_sub1_sub2.aClass441_11538.method7093(1.0F / (class523_sub23.aFloat10540 * (float) ((class523_sub23.aClass163_10532.anInt1778) * 93234767)), 1.0F / (class523_sub23.aFloat10540 * (float) ((class523_sub23.aClass163_10532.anInt1778) * 93234767)), 1.0F, 1.0F);
									class340_sub1_sub2.aClass437_11534.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
									Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -755543129));
									class340_sub1_sub2.anInt11562 = class177.aByte1906 * 1514951979;
									class340_sub1_sub2.anInt11556 = (class523_sub23.anInt10531 * 1973407019);
									class340_sub1_sub2.anInt11557 = ((class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1) * -321727019);
									class340_sub1_sub2.anInt11558 = i_134_ * -1346520479;
									class340_sub1_sub2.anInt11540 = (class523_sub23.anInt10535 / 3 * 323204085);
									class340_sub1_sub2.aClass429_11549.method6777(class329.aClass429_3490);
									class340_sub1_sub2.aClass437_11551.method6886(class329.aClass437_3479);
									class340_sub1_sub2.aClass429_11535.method6777(class329.aClass429_3486);
									class340_sub1_sub2.aClass437_11555.method6886(class329.aClass437_3484);
									class340_sub1_sub2.method17932(-437126053);
								} else
									class329.method5817(0);
								break;
							case 1:
								class329.aClass437_3487.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
								if (aClass178_Sub2_8999.aBool9656)
									class329.method5798();
								else
									class329.method5795(0);
								break;
							case 7:
								class329.aClass437_3487.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
								class329.aClass441_3474.method7085();
								class329.anInterface39_3495 = aClass178_Sub2_8999.method14954();
								class329.method5807(0);
							}
							i_134_ += class523_sub23.anInt10535;
						}
					}
				}
			}
			if (!aClass708_9015.method14237((byte) 104)) {
				aClass178_Sub2_8999.method15018(128);
				aClass178_Sub2_8999.method15249(false);
				Class437 class437 = new Class437(class329.aClass437_3484);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass708_9015.iterator();
				while (iterator.hasNext()) {
					Class523_Sub12 class523_sub12 = (Class523_Sub12) iterator.next();
					class523_sub12.method15949(class329, i, i_116_, i_117_, bools, bool);
				}
				class329.aClass437_3484.method6886(class437);
			}
			if (aClass351_9017 != null) {
				aClass178_Sub2_8999.method15018(1);
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15033(1, anInterface36_9021);
				aClass178_Sub2_8999.method15032(aClass345_9022);
				Class441 class441 = aClass178_Sub2_8999.aClass441_9560;
				class441.method7085();
				class441.aFloatArray4916[13] = -1.0F;
				class329.method5790(class441);
				aClass351_9017.method6158(class329, i, i_116_, i_117_, bools, bool);
			}
		}
	}

	Class142_Sub1(Class178_Sub2 class178_sub2, int i, int i_137_, int i_138_, int i_139_, int[][] is, int[][] is_140_, int i_141_) {
		super(i_138_, i_139_, i_141_, is);
		anIntArray9001 = new int[1];
		aClass178_Sub2_8999 = class178_sub2;
		anInt9000 = anInt1680 * -1193058675 - 2;
		anInt9030 = 1 << anInt9000;
		anInt9002 = i;
		anInt9003 = i_137_;
		anIntArrayArrayArray9031 = new int[i_138_][i_139_][];
		aClass523_Sub23ArrayArrayArray9009 = new Class523_Sub23[i_138_][i_139_][];
		anIntArrayArrayArray9012 = new int[i_138_][i_139_][];
		anIntArrayArrayArray9011 = new int[i_138_][i_139_][];
		anIntArrayArrayArray9010 = new int[i_138_][i_139_][];
		anIntArrayArrayArray8997 = new int[i_138_][i_139_][];
		aShortArrayArray9006 = new short[i_138_ * i_139_][];
		aByteArrayArray9018 = new byte[i_138_][i_139_];
		aByteArrayArray9029 = new byte[i_138_ + 1][i_139_ + 1];
		aFloatArrayArray9026 = new float[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1];
		aFloatArrayArray9027 = new float[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1];
		aFloatArrayArray9028 = new float[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1];
		for (int i_142_ = 0; i_142_ <= anInt1681 * 452998539; i_142_++) {
			for (int i_143_ = 0; i_143_ <= anInt1683 * 692304099; i_143_++) {
				int i_144_ = anIntArrayArray1684[i_143_][i_142_];
				if ((float) i_144_ < aFloat9007)
					aFloat9007 = (float) i_144_;
				if ((float) i_144_ > aFloat9008)
					aFloat9008 = (float) i_144_;
				if (i_143_ > 0 && i_142_ > 0 && i_143_ < anInt1683 * 692304099 && i_142_ < anInt1681 * 452998539) {
					int i_145_ = (is_140_[i_143_ + 1][i_142_] - is_140_[i_143_ - 1][i_142_]);
					int i_146_ = (is_140_[i_143_][i_142_ + 1] - is_140_[i_143_][i_142_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_145_ * i_145_ + 4 * i_141_ * i_141_ + i_146_ * i_146_)));
					aFloatArrayArray9026[i_143_][i_142_] = (float) i_145_ * f;
					aFloatArrayArray9027[i_143_][i_142_] = (float) (-i_141_ * 2) * f;
					aFloatArrayArray9028[i_143_][i_142_] = (float) i_146_ * f;
				}
			}
		}
		aFloat9007--;
		aFloat9008++;
		aClass14_9020 = new Class14(128);
		if ((anInt9003 & 0x10) != 0)
			aClass351_9017 = new Class351(aClass178_Sub2_8999, this);
	}

	void method14439(Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2, int i, int i_147_) {
		int[] is = anIntArrayArrayArray9012[i][i_147_];
		int[] is_148_ = anIntArrayArrayArray9011[i][i_147_];
		int i_149_ = is.length;
		if (anIntArray9035.length < i_149_) {
			anIntArray9035 = new int[i_149_];
			anIntArray9036 = new int[i_149_];
		}
		for (int i_150_ = 0; i_150_ < i_149_; i_150_++) {
			anIntArray9035[i_150_] = is[i_150_] >> aClass178_Sub2_8999.anInt9623;
			anIntArray9036[i_150_] = is_148_[i_150_] >> aClass178_Sub2_8999.anInt9623;
		}
		int i_151_ = 0;
		while (i_151_ < i_149_) {
			int i_152_ = anIntArray9035[i_151_];
			int i_153_ = anIntArray9036[i_151_++];
			int i_154_ = anIntArray9035[i_151_];
			int i_155_ = anIntArray9036[i_151_++];
			int i_156_ = anIntArray9035[i_151_];
			int i_157_ = anIntArray9036[i_151_++];
			if (((i_152_ - i_154_) * (i_155_ - i_157_) - (i_155_ - i_153_) * (i_156_ - i_154_)) > 0)
				class523_sub27_sub4_sub2.method18546(i_153_, i_155_, i_157_, i_152_, i_154_, i_156_);
		}
	}

	public void method2328(int i, int i_158_, int[] is, int[] is_159_, int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_, int[] is_164_, int[] is_165_, Class163 class163, boolean bool) {
		Class172 class172 = aClass178_Sub2_8999.aClass172_1916;
		if (is_161_ != null && anIntArrayArrayArray9037 == null)
			anIntArrayArrayArray9037 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		if (is_159_ != null && anIntArrayArrayArray9031 == null)
			anIntArrayArrayArray9031 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		anIntArrayArrayArray9012[i][i_158_] = is;
		anIntArrayArrayArray9011[i][i_158_] = is_160_;
		anIntArrayArrayArray9010[i][i_158_] = is_162_;
		anIntArrayArrayArray8997[i][i_158_] = is_163_;
		if (anIntArrayArrayArray9037 != null)
			anIntArrayArrayArray9037[i][i_158_] = is_161_;
		if (anIntArrayArrayArray9031 != null)
			anIntArrayArrayArray9031[i][i_158_] = is_159_;
		Class523_Sub23[] class523_sub23s = (aClass523_Sub23ArrayArrayArray9009[i][i_158_] = new Class523_Sub23[is_162_.length]);
		for (int i_166_ = 0; i_166_ < is_162_.length; i_166_++) {
			int i_167_ = is_164_[i_166_];
			int i_168_ = is_165_[i_166_];
			if ((anInt9003 & 0x20) != 0 && i_167_ != -1 && class172.method2895(i_167_, 27047392).aBool1876) {
				i_168_ = 128;
				i_167_ = -1;
			}
			long l = ((long) (class163.anInt1774 * -1046224519) << 48 | (long) (class163.anInt1775 * -118212955) << 42 | (long) (class163.anInt1776 * -319632409) << 28 | (long) (i_168_ << 14) | (long) i_167_);
			Class523 class523;
			for (class523 = aClass14_9020.getFromIndex(l); class523 != null; class523 = aClass14_9020.method740(231172810)) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) class523;
				if (class523_sub23.anInt10530 == i_167_ && class523_sub23.aFloat10540 == (float) i_168_ && class523_sub23.aClass163_10532.method2591(class163, -1329531860))
					break;
			}
			if (class523 == null) {
				class523_sub23s[i_166_] = new Class523_Sub23(this, i_167_, i_168_, class163);
				aClass14_9020.method738(class523_sub23s[i_166_], l);
			} else
				class523_sub23s[i_166_] = (Class523_Sub23) class523;
		}
		if (bool)
			aByteArrayArray9018[i][i_158_] |= 0x1;
		if (is_162_.length > anInt9024)
			anInt9024 = is_162_.length;
		anInt9023 += is_162_.length;
	}

	public boolean method2333(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_169_, int i_170_, int i_171_, boolean bool) {
		if (aClass351_9017 == null || class523_sub27_sub4 == null)
			return false;
		int i_172_ = (i - (i_169_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
		int i_173_ = (i_170_ - (i_169_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
		return aClass351_9017.method6157(class523_sub27_sub4, i_172_, i_173_);
	}

	public void method2331(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_174_, int i_175_, int i_176_, boolean bool) {
		if (aClass351_9017 != null && class523_sub27_sub4 != null) {
			int i_177_ = (i - (i_174_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
			int i_178_ = (i_175_ - (i_174_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
			aClass351_9017.method6159(class523_sub27_sub4, i_177_, i_178_);
		}
	}

	public void method2332(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_179_, int i_180_, int i_181_, boolean bool) {
		if (aClass351_9017 != null && class523_sub27_sub4 != null) {
			int i_182_ = (i - (i_179_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
			int i_183_ = (i_180_ - (i_179_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
			aClass351_9017.method6165(class523_sub27_sub4, i_182_, i_183_);
		}
	}

	public void method2323(int i, int i_184_, int[] is, int[] is_185_, int[] is_186_, int[] is_187_, int[] is_188_, int[] is_189_, int[] is_190_, int[] is_191_, int[] is_192_, int[] is_193_, int[] is_194_, Class163 class163, boolean bool) {
		int i_195_ = is_191_.length;
		int[] is_196_ = new int[i_195_ * 3];
		int[] is_197_ = new int[i_195_ * 3];
		int[] is_198_ = new int[i_195_ * 3];
		int[] is_199_ = new int[i_195_ * 3];
		int[] is_200_ = new int[i_195_ * 3];
		int[] is_201_ = new int[i_195_ * 3];
		int[] is_202_ = is_185_ != null ? new int[i_195_ * 3] : null;
		int[] is_203_ = is_187_ != null ? new int[i_195_ * 3] : null;
		int i_204_ = 0;
		for (int i_205_ = 0; i_205_ < i_195_; i_205_++) {
			int i_206_ = is_188_[i_205_];
			int i_207_ = is_189_[i_205_];
			int i_208_ = is_190_[i_205_];
			is_196_[i_204_] = is[i_206_];
			is_197_[i_204_] = is_186_[i_206_];
			is_198_[i_204_] = is_191_[i_205_];
			is_200_[i_204_] = is_193_[i_205_];
			is_201_[i_204_] = is_194_[i_205_];
			is_199_[i_204_] = is_192_ != null ? is_192_[i_205_] : is_191_[i_205_];
			if (is_185_ != null)
				is_202_[i_204_] = is_185_[i_206_];
			if (is_187_ != null)
				is_203_[i_204_] = is_187_[i_206_];
			i_204_++;
			is_196_[i_204_] = is[i_207_];
			is_197_[i_204_] = is_186_[i_207_];
			is_198_[i_204_] = is_191_[i_205_];
			is_200_[i_204_] = is_193_[i_205_];
			is_201_[i_204_] = is_194_[i_205_];
			is_199_[i_204_] = is_192_ != null ? is_192_[i_205_] : is_191_[i_205_];
			if (is_185_ != null)
				is_202_[i_204_] = is_185_[i_207_];
			if (is_187_ != null)
				is_203_[i_204_] = is_187_[i_207_];
			i_204_++;
			is_196_[i_204_] = is[i_208_];
			is_197_[i_204_] = is_186_[i_208_];
			is_198_[i_204_] = is_191_[i_205_];
			is_200_[i_204_] = is_193_[i_205_];
			is_201_[i_204_] = is_194_[i_205_];
			is_199_[i_204_] = is_192_ != null ? is_192_[i_205_] : is_191_[i_205_];
			if (is_185_ != null)
				is_202_[i_204_] = is_185_[i_208_];
			if (is_187_ != null)
				is_203_[i_204_] = is_187_[i_208_];
			i_204_++;
		}
		method2351(i, i_184_, is_196_, is_202_, is_197_, is_203_, is_198_, is_199_, is_200_, is_201_, class163, bool);
	}

	public void method2340() {
		if (anInt9023 <= 0) {
			aClass351_9017 = null;
			method14438();
		} else {
			byte[][] is = (new byte[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1]);
			for (int i = 1; i < anInt1683 * 692304099; i++) {
				for (int i_209_ = 1; i_209_ < anInt1681 * 452998539; i_209_++)
					is[i][i_209_] = (byte) ((aByteArrayArray9029[i - 1][i_209_] >> 2) + (aByteArrayArray9029[i + 1][i_209_] >> 3) + (aByteArrayArray9029[i][i_209_ - 1] >> 2) + (aByteArrayArray9029[i][i_209_ + 1] >> 3) + (aByteArrayArray9029[i][i_209_] >> 1));
			}
			aClass523Array9004 = new Class523[aClass14_9020.method734(1612902925)];
			aClass14_9020.method739(aClass523Array9004, (byte) -34);
			for (int i = 0; i < aClass523Array9004.length; i++)
				((Class523_Sub23) aClass523Array9004[i]).method16135(anInt9023);
			anInt9034 = 20;
			if (anIntArrayArrayArray9037 != null)
				anInt9034 += 4;
			if ((anInt9003 & 0x7) != 0)
				anInt9034 += 12;
			aByteBuffer9032 = aClass178_Sub2_8999.method14922(anInt9023 * 4);
			aByteBuffer9033 = aClass178_Sub2_8999.method14922(anInt9023 * anInt9034);
			Class523_Sub23[] class523_sub23s = new Class523_Sub23[anInt9023];
			int i = Class375.method6383(anInt9023 / 4, 189765723);
			if (i < 1)
				i = 1;
			Class14 class14 = new Class14(i);
			Class523_Sub23[] class523_sub23s_210_ = new Class523_Sub23[anInt9024];
			for (int i_211_ = 0; i_211_ < anInt1683 * 692304099; i_211_++) {
				for (int i_212_ = 0; i_212_ < anInt1681 * 452998539; i_212_++)
					method14437(i_211_, i_212_, is, class523_sub23s_210_, class14, class523_sub23s);
			}
			for (int i_213_ = 0; i_213_ < anInt9016; i_213_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s[i_213_];
				if (class523_sub23 != null)
					class523_sub23.method16118(i_213_);
			}
			for (int i_214_ = 0; i_214_ < anInt1683 * 692304099; i_214_++) {
				for (int i_215_ = 0; i_215_ < anInt1681 * 452998539; i_215_++) {
					short[] is_216_ = (aShortArrayArray9006[i_215_ * (anInt1683 * 692304099) + i_214_]);
					if (is_216_ != null) {
						int i_217_ = 0;
						int i_218_ = 0;
						while (i_218_ < is_216_.length) {
							int i_219_ = is_216_[i_218_++] & 0xffff;
							int i_220_ = is_216_[i_218_++] & 0xffff;
							int i_221_ = is_216_[i_218_++] & 0xffff;
							Class523_Sub23 class523_sub23 = class523_sub23s[i_219_];
							Class523_Sub23 class523_sub23_222_ = class523_sub23s[i_220_];
							Class523_Sub23 class523_sub23_223_ = class523_sub23s[i_221_];
							Class523_Sub23 class523_sub23_224_ = null;
							if (class523_sub23 != null) {
								class523_sub23.method16139(i_214_, i_215_, i_217_);
								class523_sub23_224_ = class523_sub23;
							}
							if (class523_sub23_222_ != null) {
								class523_sub23_222_.method16139(i_214_, i_215_, i_217_);
								if (class523_sub23_224_ == null || ((class523_sub23_222_.aLong7065 * 1055205983951172633L) < (class523_sub23_224_.aLong7065 * 1055205983951172633L)))
									class523_sub23_224_ = class523_sub23_222_;
							}
							if (class523_sub23_223_ != null) {
								class523_sub23_223_.method16139(i_214_, i_215_, i_217_);
								if (class523_sub23_224_ == null || ((class523_sub23_223_.aLong7065 * 1055205983951172633L) < (class523_sub23_224_.aLong7065 * 1055205983951172633L)))
									class523_sub23_224_ = class523_sub23_223_;
							}
							if (class523_sub23_224_ != null) {
								if (class523_sub23 != null)
									class523_sub23_224_.method16118(i_219_);
								if (class523_sub23_222_ != null)
									class523_sub23_224_.method16118(i_220_);
								if (class523_sub23_223_ != null)
									class523_sub23_224_.method16118(i_221_);
								class523_sub23_224_.method16139(i_214_, i_215_, i_217_);
							}
							i_217_++;
						}
					}
				}
			}
			anInt9014 = 0;
			for (int i_225_ = 0; i_225_ < aClass523Array9004.length; i_225_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i_225_];
				if (class523_sub23.anInt10534 > 0)
					aClass523Array9004[anInt9014++] = class523_sub23;
			}
			aClass523Array9019 = new Class523[anInt9014];
			long[] ls = new long[anInt9014];
			for (int i_226_ = 0; i_226_ < anInt9014; i_226_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i_226_];
				ls[i_226_] = class523_sub23.aLong7065 * 1055205983951172633L;
				aClass523Array9019[i_226_] = class523_sub23;
			}
			Class447.method7245(ls, aClass523Array9019, (byte) -4);
			method14442();
		}
	}

	public void method2337(int i, int i_227_, int[] is, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[] is_232_, int[] is_233_, int[] is_234_, int[] is_235_, int[] is_236_, int[] is_237_, Class163 class163, boolean bool) {
		int i_238_ = is_234_.length;
		int[] is_239_ = new int[i_238_ * 3];
		int[] is_240_ = new int[i_238_ * 3];
		int[] is_241_ = new int[i_238_ * 3];
		int[] is_242_ = new int[i_238_ * 3];
		int[] is_243_ = new int[i_238_ * 3];
		int[] is_244_ = new int[i_238_ * 3];
		int[] is_245_ = is_228_ != null ? new int[i_238_ * 3] : null;
		int[] is_246_ = is_230_ != null ? new int[i_238_ * 3] : null;
		int i_247_ = 0;
		for (int i_248_ = 0; i_248_ < i_238_; i_248_++) {
			int i_249_ = is_231_[i_248_];
			int i_250_ = is_232_[i_248_];
			int i_251_ = is_233_[i_248_];
			is_239_[i_247_] = is[i_249_];
			is_240_[i_247_] = is_229_[i_249_];
			is_241_[i_247_] = is_234_[i_248_];
			is_243_[i_247_] = is_236_[i_248_];
			is_244_[i_247_] = is_237_[i_248_];
			is_242_[i_247_] = is_235_ != null ? is_235_[i_248_] : is_234_[i_248_];
			if (is_228_ != null)
				is_245_[i_247_] = is_228_[i_249_];
			if (is_230_ != null)
				is_246_[i_247_] = is_230_[i_249_];
			i_247_++;
			is_239_[i_247_] = is[i_250_];
			is_240_[i_247_] = is_229_[i_250_];
			is_241_[i_247_] = is_234_[i_248_];
			is_243_[i_247_] = is_236_[i_248_];
			is_244_[i_247_] = is_237_[i_248_];
			is_242_[i_247_] = is_235_ != null ? is_235_[i_248_] : is_234_[i_248_];
			if (is_228_ != null)
				is_245_[i_247_] = is_228_[i_250_];
			if (is_230_ != null)
				is_246_[i_247_] = is_230_[i_250_];
			i_247_++;
			is_239_[i_247_] = is[i_251_];
			is_240_[i_247_] = is_229_[i_251_];
			is_241_[i_247_] = is_234_[i_248_];
			is_243_[i_247_] = is_236_[i_248_];
			is_244_[i_247_] = is_237_[i_248_];
			is_242_[i_247_] = is_235_ != null ? is_235_[i_248_] : is_234_[i_248_];
			if (is_228_ != null)
				is_245_[i_247_] = is_228_[i_251_];
			if (is_230_ != null)
				is_246_[i_247_] = is_230_[i_251_];
			i_247_++;
		}
		method2351(i, i_227_, is_239_, is_245_, is_240_, is_246_, is_241_, is_242_, is_243_, is_244_, class163, bool);
	}

	void method14440() {
		anInterface36_9021 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9021.method215(anInt9016 * 4, 4);
		anInterface36_9021.method265(0, anInt9016 * 4, aClass178_Sub2_8999.method15037(aByteBuffer9032));
		anInterface36_9013 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9013.method215(anInt9016 * anInt9034, anInt9034);
		anInterface36_9013.method265(0, anInt9016 * anInt9034, aClass178_Sub2_8999.method15037(aByteBuffer9033));
		aByteBuffer9032.clear();
		aByteBuffer9032 = null;
		aByteBuffer9033.clear();
		aByteBuffer9033 = null;
		if ((anInt9003 & 0x7) != 0) {
			if (anIntArrayArrayArray9037 != null)
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
			else
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
		} else if (anIntArrayArrayArray9037 != null)
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627 }), new Class378(Class344.aClass344_3613) }));
		else
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615 }), new Class378(Class344.aClass344_3613) }));
		for (int i = 0; i < anInt9014; i++) {
			Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i];
			class523_sub23.method16121(anInt9016);
		}
		if (aClass351_9017 != null)
			aClass351_9017.method6163();
		method14438();
	}

	void method14441() {
		anInterface36_9021 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9021.method215(anInt9016 * 4, 4);
		anInterface36_9021.method265(0, anInt9016 * 4, aClass178_Sub2_8999.method15037(aByteBuffer9032));
		anInterface36_9013 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9013.method215(anInt9016 * anInt9034, anInt9034);
		anInterface36_9013.method265(0, anInt9016 * anInt9034, aClass178_Sub2_8999.method15037(aByteBuffer9033));
		aByteBuffer9032.clear();
		aByteBuffer9032 = null;
		aByteBuffer9033.clear();
		aByteBuffer9033 = null;
		if ((anInt9003 & 0x7) != 0) {
			if (anIntArrayArrayArray9037 != null)
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
			else
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
		} else if (anIntArrayArrayArray9037 != null)
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627 }), new Class378(Class344.aClass344_3613) }));
		else
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615 }), new Class378(Class344.aClass344_3613) }));
		for (int i = 0; i < anInt9014; i++) {
			Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i];
			class523_sub23.method16121(anInt9016);
		}
		if (aClass351_9017 != null)
			aClass351_9017.method6163();
		method14438();
	}

	public void method2339(int i, int i_252_, int[] is, int[] is_253_, int[] is_254_, int[] is_255_, int[] is_256_, int[] is_257_, int[] is_258_, int[] is_259_, Class163 class163, boolean bool) {
		Class172 class172 = aClass178_Sub2_8999.aClass172_1916;
		if (is_255_ != null && anIntArrayArrayArray9037 == null)
			anIntArrayArrayArray9037 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		if (is_253_ != null && anIntArrayArrayArray9031 == null)
			anIntArrayArrayArray9031 = new int[anInt1683 * 692304099][anInt1681 * 452998539][];
		anIntArrayArrayArray9012[i][i_252_] = is;
		anIntArrayArrayArray9011[i][i_252_] = is_254_;
		anIntArrayArrayArray9010[i][i_252_] = is_256_;
		anIntArrayArrayArray8997[i][i_252_] = is_257_;
		if (anIntArrayArrayArray9037 != null)
			anIntArrayArrayArray9037[i][i_252_] = is_255_;
		if (anIntArrayArrayArray9031 != null)
			anIntArrayArrayArray9031[i][i_252_] = is_253_;
		Class523_Sub23[] class523_sub23s = (aClass523_Sub23ArrayArrayArray9009[i][i_252_] = new Class523_Sub23[is_256_.length]);
		for (int i_260_ = 0; i_260_ < is_256_.length; i_260_++) {
			int i_261_ = is_258_[i_260_];
			int i_262_ = is_259_[i_260_];
			if ((anInt9003 & 0x20) != 0 && i_261_ != -1 && class172.method2895(i_261_, -1911369935).aBool1876) {
				i_262_ = 128;
				i_261_ = -1;
			}
			long l = ((long) (class163.anInt1774 * -1046224519) << 48 | (long) (class163.anInt1775 * -118212955) << 42 | (long) (class163.anInt1776 * -319632409) << 28 | (long) (i_262_ << 14) | (long) i_261_);
			Class523 class523;
			for (class523 = aClass14_9020.getFromIndex(l); class523 != null; class523 = aClass14_9020.method740(231172810)) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) class523;
				if (class523_sub23.anInt10530 == i_261_ && class523_sub23.aFloat10540 == (float) i_262_ && class523_sub23.aClass163_10532.method2591(class163, 223994681))
					break;
			}
			if (class523 == null) {
				class523_sub23s[i_260_] = new Class523_Sub23(this, i_261_, i_262_, class163);
				aClass14_9020.method738(class523_sub23s[i_260_], l);
			} else
				class523_sub23s[i_260_] = (Class523_Sub23) class523;
		}
		if (bool)
			aByteArrayArray9018[i][i_252_] |= 0x1;
		if (is_256_.length > anInt9024)
			anInt9024 = is_256_.length;
		anInt9023 += is_256_.length;
	}

	public void method2336(int i, int i_263_, int i_264_) {
		i = Math.min(aByteArrayArray9029.length - 1, Math.max(0, i));
		i_263_ = Math.min(aByteArrayArray9029[i].length - 1, Math.max(0, i_263_));
		if ((aByteArrayArray9029[i][i_263_] & 0xff) < i_264_)
			aByteArrayArray9029[i][i_263_] = (byte) i_264_;
	}

	public void method2359() {
		if (anInt9023 <= 0) {
			aClass351_9017 = null;
			method14438();
		} else {
			byte[][] is = (new byte[anInt1683 * 692304099 + 1][anInt1681 * 452998539 + 1]);
			for (int i = 1; i < anInt1683 * 692304099; i++) {
				for (int i_265_ = 1; i_265_ < anInt1681 * 452998539; i_265_++)
					is[i][i_265_] = (byte) ((aByteArrayArray9029[i - 1][i_265_] >> 2) + (aByteArrayArray9029[i + 1][i_265_] >> 3) + (aByteArrayArray9029[i][i_265_ - 1] >> 2) + (aByteArrayArray9029[i][i_265_ + 1] >> 3) + (aByteArrayArray9029[i][i_265_] >> 1));
			}
			aClass523Array9004 = new Class523[aClass14_9020.method734(1877268459)];
			aClass14_9020.method739(aClass523Array9004, (byte) -1);
			for (int i = 0; i < aClass523Array9004.length; i++)
				((Class523_Sub23) aClass523Array9004[i]).method16135(anInt9023);
			anInt9034 = 20;
			if (anIntArrayArrayArray9037 != null)
				anInt9034 += 4;
			if ((anInt9003 & 0x7) != 0)
				anInt9034 += 12;
			aByteBuffer9032 = aClass178_Sub2_8999.method14922(anInt9023 * 4);
			aByteBuffer9033 = aClass178_Sub2_8999.method14922(anInt9023 * anInt9034);
			Class523_Sub23[] class523_sub23s = new Class523_Sub23[anInt9023];
			int i = Class375.method6383(anInt9023 / 4, 189765723);
			if (i < 1)
				i = 1;
			Class14 class14 = new Class14(i);
			Class523_Sub23[] class523_sub23s_266_ = new Class523_Sub23[anInt9024];
			for (int i_267_ = 0; i_267_ < anInt1683 * 692304099; i_267_++) {
				for (int i_268_ = 0; i_268_ < anInt1681 * 452998539; i_268_++)
					method14437(i_267_, i_268_, is, class523_sub23s_266_, class14, class523_sub23s);
			}
			for (int i_269_ = 0; i_269_ < anInt9016; i_269_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s[i_269_];
				if (class523_sub23 != null)
					class523_sub23.method16118(i_269_);
			}
			for (int i_270_ = 0; i_270_ < anInt1683 * 692304099; i_270_++) {
				for (int i_271_ = 0; i_271_ < anInt1681 * 452998539; i_271_++) {
					short[] is_272_ = (aShortArrayArray9006[i_271_ * (anInt1683 * 692304099) + i_270_]);
					if (is_272_ != null) {
						int i_273_ = 0;
						int i_274_ = 0;
						while (i_274_ < is_272_.length) {
							int i_275_ = is_272_[i_274_++] & 0xffff;
							int i_276_ = is_272_[i_274_++] & 0xffff;
							int i_277_ = is_272_[i_274_++] & 0xffff;
							Class523_Sub23 class523_sub23 = class523_sub23s[i_275_];
							Class523_Sub23 class523_sub23_278_ = class523_sub23s[i_276_];
							Class523_Sub23 class523_sub23_279_ = class523_sub23s[i_277_];
							Class523_Sub23 class523_sub23_280_ = null;
							if (class523_sub23 != null) {
								class523_sub23.method16139(i_270_, i_271_, i_273_);
								class523_sub23_280_ = class523_sub23;
							}
							if (class523_sub23_278_ != null) {
								class523_sub23_278_.method16139(i_270_, i_271_, i_273_);
								if (class523_sub23_280_ == null || ((class523_sub23_278_.aLong7065 * 1055205983951172633L) < (class523_sub23_280_.aLong7065 * 1055205983951172633L)))
									class523_sub23_280_ = class523_sub23_278_;
							}
							if (class523_sub23_279_ != null) {
								class523_sub23_279_.method16139(i_270_, i_271_, i_273_);
								if (class523_sub23_280_ == null || ((class523_sub23_279_.aLong7065 * 1055205983951172633L) < (class523_sub23_280_.aLong7065 * 1055205983951172633L)))
									class523_sub23_280_ = class523_sub23_279_;
							}
							if (class523_sub23_280_ != null) {
								if (class523_sub23 != null)
									class523_sub23_280_.method16118(i_275_);
								if (class523_sub23_278_ != null)
									class523_sub23_280_.method16118(i_276_);
								if (class523_sub23_279_ != null)
									class523_sub23_280_.method16118(i_277_);
								class523_sub23_280_.method16139(i_270_, i_271_, i_273_);
							}
							i_273_++;
						}
					}
				}
			}
			anInt9014 = 0;
			for (int i_281_ = 0; i_281_ < aClass523Array9004.length; i_281_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i_281_];
				if (class523_sub23.anInt10534 > 0)
					aClass523Array9004[anInt9014++] = class523_sub23;
			}
			aClass523Array9019 = new Class523[anInt9014];
			long[] ls = new long[anInt9014];
			for (int i_282_ = 0; i_282_ < anInt9014; i_282_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i_282_];
				ls[i_282_] = class523_sub23.aLong7065 * 1055205983951172633L;
				aClass523Array9019[i_282_] = class523_sub23;
			}
			Class447.method7245(ls, aClass523Array9019, (byte) -20);
			method14442();
		}
	}

	public void method2342(int i, int i_283_, int i_284_, boolean[][] bools, boolean bool, int i_285_) {
		if (aClass523Array9019 != null) {
			int i_286_ = i_284_ + i_284_ + 1;
			i_286_ *= i_286_;
			if (anIntArray9001.length < i_286_)
				anIntArray9001 = new int[i_286_];
			int i_287_ = i - i_284_;
			int i_288_ = i_287_;
			if (i_287_ < 0)
				i_287_ = 0;
			int i_289_ = i_283_ - i_284_;
			int i_290_ = i_289_;
			if (i_289_ < 0)
				i_289_ = 0;
			int i_291_ = i + i_284_;
			if (i_291_ > anInt1683 * 692304099 - 1)
				i_291_ = anInt1683 * 692304099 - 1;
			int i_292_ = i_283_ + i_284_;
			if (i_292_ > anInt1681 * 452998539 - 1)
				i_292_ = anInt1681 * 452998539 - 1;
			anInt9025 = 0;
			for (int i_293_ = i_287_; i_293_ <= i_291_; i_293_++) {
				boolean[] bools_294_ = bools[i_293_ - i_288_];
				for (int i_295_ = i_289_; i_295_ <= i_292_; i_295_++) {
					if (bools_294_[i_295_ - i_290_])
						anIntArray9001[anInt9025++] = i_295_ * (anInt1683 * 692304099) + i_293_;
				}
			}
			ByteBuffer bytebuffer = aClass178_Sub2_8999.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_296_ = 0; i_296_ < aClass523Array9019.length; i_296_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_296_];
				class523_sub23.method16122(anIntArray9001, anInt9025);
			}
			int i_297_ = bytebuffer.position();
			Class329 class329 = aClass178_Sub2_8999.aClass329_9642;
			aClass178_Sub2_8999.method15043();
			if (aClass178_Sub2_8999.anInt9663 > 0) {
				class329.aClass437_3484.method6972(((float) (aClass178_Sub2_8999.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_8999.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_8999.anInt9662 >> 0 & 0xff) / 255.0F));
				class329.aClass429_3486.method6773(0.0F, 0.0F, 1.0F, -(aClass178_Sub2_8999.aFloat9683));
				class329.aClass429_3486.method6762(aClass178_Sub2_8999.aClass441_9555);
				class329.aClass429_3486.method6766(1.0F / (aClass178_Sub2_8999.aFloat9681 - aClass178_Sub2_8999.aFloat9683));
			} else {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
			}
			if (i_297_ != 0) {
				Interface40 interface40 = aClass178_Sub2_8999.method14951(i_297_ / 2);
				interface40.method265(0, i_297_, aClass178_Sub2_8999.aLong9540);
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15213(interface40);
				class329.method5790(Class441.aClass441_4917);
				if ((anInt9003 & 0x7) == 0) {
					int i_298_ = 0;
					for (int i_299_ = 0; i_299_ < aClass523Array9019.length; i_299_++) {
						Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_299_];
						if (class523_sub23.anInt10535 != 0) {
							if (aClass178_Sub2_8999.aBool9656) {
								aClass178_Sub2_8999.method3150(0, class523_sub23.aClass163_10532);
								class329.aClass429_3490.method6773(0.0F, 1.0F, 0.0F, ((float) aClass178_Sub2_8999.anInt9601 + ((float) ((class523_sub23.aClass163_10532.anInt1774) * -1046224519) / 255.0F * (float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955))));
								class329.aClass429_3490.method6766(1.0F / (float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955));
								class329.aClass437_3479.method6972((float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 16 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 8 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 0 & 0xff) / 255.0F);
							} else {
								class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
								class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
							}
							boolean bool_300_ = false;
							if (class523_sub23.anInt10530 != -1) {
								Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -1152222563));
								class329.anInterface37_3478 = aClass178_Sub2_8999.aClass349_9586.method6095(class177);
								bool_300_ = !Class164_Sub5.method15499((class177.aByte1905), (byte) 89);
							} else
								class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
							aClass178_Sub2_8999.method15033(1, class523_sub23.anInterface36_10533);
							aClass178_Sub2_8999.method15032(aClass345_9022);
							class329.aClass441_3480.method7093(1.0F / class523_sub23.aFloat10540, 1.0F / class523_sub23.aFloat10540, 1.0F, 1.0F);
							class329.anInt3493 = class523_sub23.anInt10531;
							class329.anInt3494 = (class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1);
							class329.anInt3481 = i_298_;
							class329.anInt3496 = class523_sub23.anInt10535 / 3;
							class329.method5793(bool_300_);
							i_298_ += class523_sub23.anInt10535;
						}
					}
				} else {
					class329.aClass437_3492.method6972(aClass178_Sub2_8999.aFloatArray9608[0], aClass178_Sub2_8999.aFloatArray9608[1], aClass178_Sub2_8999.aFloatArray9608[2]);
					class329.aClass437_3488.method6972((aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9689), (aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9614), (aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9704));
					class329.aClass437_3489.method6972((-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9689), (-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9614), (-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9704));
					class329.aClass437_3491.method6972((aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9689), (aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9614), (aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9704));
					int i_301_ = 0;
					for (int i_302_ = 0; i_302_ < aClass523Array9019.length; i_302_++) {
						Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_302_];
						if (class523_sub23.anInt10535 > 0) {
							if (aClass178_Sub2_8999.aBool9656) {
								aClass178_Sub2_8999.method3150(0, class523_sub23.aClass163_10532);
								float f = 0.15F;
								class329.aClass429_3490.method6773(0.0F, 1.0F / ((float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955) * f), 0.0F, 256.0F / ((float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955) * f));
								class329.aClass437_3479.method6972((float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 16 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 8 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 0 & 0xff) / 255.0F);
							} else {
								class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
								class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
							}
							byte i_303_ = 11;
							if (class523_sub23.anInt10530 != -1) {
								Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -1291229143));
								i_303_ = class177.aByte1905;
								class329.anInterface37_3478 = aClass178_Sub2_8999.aClass349_9586.method6095(class177);
								class329.method5792(class177.aByte1906);
							} else
								class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
							aClass178_Sub2_8999.method15033(1, class523_sub23.anInterface36_10533);
							aClass178_Sub2_8999.method15032(aClass345_9022);
							class329.aClass441_3480.method7093(1.0F / class523_sub23.aFloat10540, 1.0F / class523_sub23.aFloat10540, 1.0F, 1.0F);
							class329.anInt3493 = class523_sub23.anInt10531;
							class329.anInt3494 = (class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1);
							class329.anInt3481 = i_301_;
							class329.anInt3496 = class523_sub23.anInt10535 / 3;
							switch (i_303_) {
							default:
								if (aClass178_Sub2_8999.aBool9656)
									class329.method5797();
								else
									class329.method5817(0);
								break;
							case 6:
								class329.method5793(!Class164_Sub5.method15499(i_303_, (byte) 89));
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass178_Sub2_8999.aBool9647 && (anInt9003 & 0x8) != 0 && aClass178_Sub2_8999.aClass340_Sub1_Sub2_9616.method17931(-279733523)) {
									Class340_Sub1_Sub2 class340_sub1_sub2 = (aClass178_Sub2_8999.aClass340_Sub1_Sub2_9616);
									if (i_303_ == 2)
										class340_sub1_sub2 = (aClass178_Sub2_8999.aClass340_Sub1_Sub2_9646);
									class340_sub1_sub2.aClass441_11536.method7086(aClass178_Sub2_8999.aClass441_9575);
									class340_sub1_sub2.aClass441_11538.method7093(1.0F / (class523_sub23.aFloat10540 * (float) ((class523_sub23.aClass163_10532.anInt1778) * 93234767)), 1.0F / (class523_sub23.aFloat10540 * (float) ((class523_sub23.aClass163_10532.anInt1778) * 93234767)), 1.0F, 1.0F);
									class340_sub1_sub2.aClass437_11534.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
									Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -1376621677));
									class340_sub1_sub2.anInt11562 = class177.aByte1906 * 1514951979;
									class340_sub1_sub2.anInt11556 = (class523_sub23.anInt10531 * 1973407019);
									class340_sub1_sub2.anInt11557 = ((class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1) * -321727019);
									class340_sub1_sub2.anInt11558 = i_301_ * -1346520479;
									class340_sub1_sub2.anInt11540 = (class523_sub23.anInt10535 / 3 * 323204085);
									class340_sub1_sub2.aClass429_11549.method6777(class329.aClass429_3490);
									class340_sub1_sub2.aClass437_11551.method6886(class329.aClass437_3479);
									class340_sub1_sub2.aClass429_11535.method6777(class329.aClass429_3486);
									class340_sub1_sub2.aClass437_11555.method6886(class329.aClass437_3484);
									class340_sub1_sub2.method17932(-437126053);
								} else
									class329.method5817(0);
								break;
							case 1:
								class329.aClass437_3487.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
								if (aClass178_Sub2_8999.aBool9656)
									class329.method5798();
								else
									class329.method5795(0);
								break;
							case 7:
								class329.aClass437_3487.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
								class329.aClass441_3474.method7085();
								class329.anInterface39_3495 = aClass178_Sub2_8999.method14954();
								class329.method5807(0);
							}
							i_301_ += class523_sub23.anInt10535;
						}
					}
				}
			}
			if (!aClass708_9015.method14237((byte) 104)) {
				aClass178_Sub2_8999.method15018(128);
				aClass178_Sub2_8999.method15249(false);
				Class437 class437 = new Class437(class329.aClass437_3484);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass708_9015.iterator();
				while (iterator.hasNext()) {
					Class523_Sub12 class523_sub12 = (Class523_Sub12) iterator.next();
					class523_sub12.method15949(class329, i, i_283_, i_284_, bools, bool);
				}
				class329.aClass437_3484.method6886(class437);
			}
			if (aClass351_9017 != null) {
				aClass178_Sub2_8999.method15018(1);
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15033(1, anInterface36_9021);
				aClass178_Sub2_8999.method15032(aClass345_9022);
				Class441 class441 = aClass178_Sub2_8999.aClass441_9560;
				class441.method7085();
				class441.aFloatArray4916[13] = -1.0F;
				class329.method5790(class441);
				aClass351_9017.method6158(class329, i, i_283_, i_284_, bools, bool);
			}
		}
	}

	public void method2343(int i, int i_304_, int i_305_, boolean[][] bools, boolean bool, int i_306_) {
		if (aClass523Array9019 != null) {
			int i_307_ = i_305_ + i_305_ + 1;
			i_307_ *= i_307_;
			if (anIntArray9001.length < i_307_)
				anIntArray9001 = new int[i_307_];
			int i_308_ = i - i_305_;
			int i_309_ = i_308_;
			if (i_308_ < 0)
				i_308_ = 0;
			int i_310_ = i_304_ - i_305_;
			int i_311_ = i_310_;
			if (i_310_ < 0)
				i_310_ = 0;
			int i_312_ = i + i_305_;
			if (i_312_ > anInt1683 * 692304099 - 1)
				i_312_ = anInt1683 * 692304099 - 1;
			int i_313_ = i_304_ + i_305_;
			if (i_313_ > anInt1681 * 452998539 - 1)
				i_313_ = anInt1681 * 452998539 - 1;
			anInt9025 = 0;
			for (int i_314_ = i_308_; i_314_ <= i_312_; i_314_++) {
				boolean[] bools_315_ = bools[i_314_ - i_309_];
				for (int i_316_ = i_310_; i_316_ <= i_313_; i_316_++) {
					if (bools_315_[i_316_ - i_311_])
						anIntArray9001[anInt9025++] = i_316_ * (anInt1683 * 692304099) + i_314_;
				}
			}
			ByteBuffer bytebuffer = aClass178_Sub2_8999.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_317_ = 0; i_317_ < aClass523Array9019.length; i_317_++) {
				Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_317_];
				class523_sub23.method16122(anIntArray9001, anInt9025);
			}
			int i_318_ = bytebuffer.position();
			Class329 class329 = aClass178_Sub2_8999.aClass329_9642;
			aClass178_Sub2_8999.method15043();
			if (aClass178_Sub2_8999.anInt9663 > 0) {
				class329.aClass437_3484.method6972(((float) (aClass178_Sub2_8999.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_8999.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_8999.anInt9662 >> 0 & 0xff) / 255.0F));
				class329.aClass429_3486.method6773(0.0F, 0.0F, 1.0F, -(aClass178_Sub2_8999.aFloat9683));
				class329.aClass429_3486.method6762(aClass178_Sub2_8999.aClass441_9555);
				class329.aClass429_3486.method6766(1.0F / (aClass178_Sub2_8999.aFloat9681 - aClass178_Sub2_8999.aFloat9683));
			} else {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
			}
			if (i_318_ != 0) {
				Interface40 interface40 = aClass178_Sub2_8999.method14951(i_318_ / 2);
				interface40.method265(0, i_318_, aClass178_Sub2_8999.aLong9540);
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15213(interface40);
				class329.method5790(Class441.aClass441_4917);
				if ((anInt9003 & 0x7) == 0) {
					int i_319_ = 0;
					for (int i_320_ = 0; i_320_ < aClass523Array9019.length; i_320_++) {
						Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_320_];
						if (class523_sub23.anInt10535 != 0) {
							if (aClass178_Sub2_8999.aBool9656) {
								aClass178_Sub2_8999.method3150(0, class523_sub23.aClass163_10532);
								class329.aClass429_3490.method6773(0.0F, 1.0F, 0.0F, ((float) aClass178_Sub2_8999.anInt9601 + ((float) ((class523_sub23.aClass163_10532.anInt1774) * -1046224519) / 255.0F * (float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955))));
								class329.aClass429_3490.method6766(1.0F / (float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955));
								class329.aClass437_3479.method6972((float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 16 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 8 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 0 & 0xff) / 255.0F);
							} else {
								class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
								class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
							}
							boolean bool_321_ = false;
							if (class523_sub23.anInt10530 != -1) {
								Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -1187188590));
								class329.anInterface37_3478 = aClass178_Sub2_8999.aClass349_9586.method6095(class177);
								bool_321_ = !Class164_Sub5.method15499((class177.aByte1905), (byte) 89);
							} else
								class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
							aClass178_Sub2_8999.method15033(1, class523_sub23.anInterface36_10533);
							aClass178_Sub2_8999.method15032(aClass345_9022);
							class329.aClass441_3480.method7093(1.0F / class523_sub23.aFloat10540, 1.0F / class523_sub23.aFloat10540, 1.0F, 1.0F);
							class329.anInt3493 = class523_sub23.anInt10531;
							class329.anInt3494 = (class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1);
							class329.anInt3481 = i_319_;
							class329.anInt3496 = class523_sub23.anInt10535 / 3;
							class329.method5793(bool_321_);
							i_319_ += class523_sub23.anInt10535;
						}
					}
				} else {
					class329.aClass437_3492.method6972(aClass178_Sub2_8999.aFloatArray9608[0], aClass178_Sub2_8999.aFloatArray9608[1], aClass178_Sub2_8999.aFloatArray9608[2]);
					class329.aClass437_3488.method6972((aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9689), (aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9614), (aClass178_Sub2_8999.aFloat9617 * aClass178_Sub2_8999.aFloat9704));
					class329.aClass437_3489.method6972((-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9689), (-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9614), (-aClass178_Sub2_8999.aFloat9618 * aClass178_Sub2_8999.aFloat9704));
					class329.aClass437_3491.method6972((aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9689), (aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9614), (aClass178_Sub2_8999.aFloat9643 * aClass178_Sub2_8999.aFloat9704));
					int i_322_ = 0;
					for (int i_323_ = 0; i_323_ < aClass523Array9019.length; i_323_++) {
						Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9019[i_323_];
						if (class523_sub23.anInt10535 > 0) {
							if (aClass178_Sub2_8999.aBool9656) {
								aClass178_Sub2_8999.method3150(0, class523_sub23.aClass163_10532);
								float f = 0.15F;
								class329.aClass429_3490.method6773(0.0F, 1.0F / ((float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955) * f), 0.0F, 256.0F / ((float) ((class523_sub23.aClass163_10532.anInt1775) * -118212955) * f));
								class329.aClass437_3479.method6972((float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 16 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 8 & 0xff) / 255.0F, (float) ((class523_sub23.aClass163_10532.anInt1776) * -319632409 >> 0 & 0xff) / 255.0F);
							} else {
								class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
								class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
							}
							byte i_324_ = 11;
							if (class523_sub23.anInt10530 != -1) {
								Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -701031345));
								i_324_ = class177.aByte1905;
								class329.anInterface37_3478 = aClass178_Sub2_8999.aClass349_9586.method6095(class177);
								class329.method5792(class177.aByte1906);
							} else
								class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
							aClass178_Sub2_8999.method15033(1, class523_sub23.anInterface36_10533);
							aClass178_Sub2_8999.method15032(aClass345_9022);
							class329.aClass441_3480.method7093(1.0F / class523_sub23.aFloat10540, 1.0F / class523_sub23.aFloat10540, 1.0F, 1.0F);
							class329.anInt3493 = class523_sub23.anInt10531;
							class329.anInt3494 = (class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1);
							class329.anInt3481 = i_322_;
							class329.anInt3496 = class523_sub23.anInt10535 / 3;
							switch (i_324_) {
							default:
								if (aClass178_Sub2_8999.aBool9656)
									class329.method5797();
								else
									class329.method5817(0);
								break;
							case 6:
								class329.method5793(!Class164_Sub5.method15499(i_324_, (byte) 89));
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass178_Sub2_8999.aBool9647 && (anInt9003 & 0x8) != 0 && aClass178_Sub2_8999.aClass340_Sub1_Sub2_9616.method17931(-363048521)) {
									Class340_Sub1_Sub2 class340_sub1_sub2 = (aClass178_Sub2_8999.aClass340_Sub1_Sub2_9616);
									if (i_324_ == 2)
										class340_sub1_sub2 = (aClass178_Sub2_8999.aClass340_Sub1_Sub2_9646);
									class340_sub1_sub2.aClass441_11536.method7086(aClass178_Sub2_8999.aClass441_9575);
									class340_sub1_sub2.aClass441_11538.method7093(1.0F / (class523_sub23.aFloat10540 * (float) ((class523_sub23.aClass163_10532.anInt1778) * 93234767)), 1.0F / (class523_sub23.aFloat10540 * (float) ((class523_sub23.aClass163_10532.anInt1778) * 93234767)), 1.0F, 1.0F);
									class340_sub1_sub2.aClass437_11534.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
									Class177 class177 = (aClass178_Sub2_8999.aClass172_1916.method2895(class523_sub23.anInt10530, -1810257546));
									class340_sub1_sub2.anInt11562 = class177.aByte1906 * 1514951979;
									class340_sub1_sub2.anInt11556 = (class523_sub23.anInt10531 * 1973407019);
									class340_sub1_sub2.anInt11557 = ((class523_sub23.anInt10538 - class523_sub23.anInt10531 + 1) * -321727019);
									class340_sub1_sub2.anInt11558 = i_322_ * -1346520479;
									class340_sub1_sub2.anInt11540 = (class523_sub23.anInt10535 / 3 * 323204085);
									class340_sub1_sub2.aClass429_11549.method6777(class329.aClass429_3490);
									class340_sub1_sub2.aClass437_11551.method6886(class329.aClass437_3479);
									class340_sub1_sub2.aClass429_11535.method6777(class329.aClass429_3486);
									class340_sub1_sub2.aClass437_11555.method6886(class329.aClass437_3484);
									class340_sub1_sub2.method17932(-437126053);
								} else
									class329.method5817(0);
								break;
							case 1:
								class329.aClass437_3487.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
								if (aClass178_Sub2_8999.aBool9656)
									class329.method5798();
								else
									class329.method5795(0);
								break;
							case 7:
								class329.aClass437_3487.method6972((aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_8999.aClass441_9650.aFloatArray4916[14]));
								class329.aClass441_3474.method7085();
								class329.anInterface39_3495 = aClass178_Sub2_8999.method14954();
								class329.method5807(0);
							}
							i_322_ += class523_sub23.anInt10535;
						}
					}
				}
			}
			if (!aClass708_9015.method14237((byte) 104)) {
				aClass178_Sub2_8999.method15018(128);
				aClass178_Sub2_8999.method15249(false);
				Class437 class437 = new Class437(class329.aClass437_3484);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass708_9015.iterator();
				while (iterator.hasNext()) {
					Class523_Sub12 class523_sub12 = (Class523_Sub12) iterator.next();
					class523_sub12.method15949(class329, i, i_304_, i_305_, bools, bool);
				}
				class329.aClass437_3484.method6886(class437);
			}
			if (aClass351_9017 != null) {
				aClass178_Sub2_8999.method15018(1);
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15033(1, anInterface36_9021);
				aClass178_Sub2_8999.method15032(aClass345_9022);
				Class441 class441 = aClass178_Sub2_8999.aClass441_9560;
				class441.method7085();
				class441.aFloatArray4916[13] = -1.0F;
				class329.method5790(class441);
				aClass351_9017.method6158(class329, i, i_304_, i_305_, bools, bool);
			}
		}
	}

	void method14442() {
		anInterface36_9021 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9021.method215(anInt9016 * 4, 4);
		anInterface36_9021.method265(0, anInt9016 * 4, aClass178_Sub2_8999.method15037(aByteBuffer9032));
		anInterface36_9013 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9013.method215(anInt9016 * anInt9034, anInt9034);
		anInterface36_9013.method265(0, anInt9016 * anInt9034, aClass178_Sub2_8999.method15037(aByteBuffer9033));
		aByteBuffer9032.clear();
		aByteBuffer9032 = null;
		aByteBuffer9033.clear();
		aByteBuffer9033 = null;
		if ((anInt9003 & 0x7) != 0) {
			if (anIntArrayArrayArray9037 != null)
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
			else
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
		} else if (anIntArrayArrayArray9037 != null)
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627 }), new Class378(Class344.aClass344_3613) }));
		else
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615 }), new Class378(Class344.aClass344_3613) }));
		for (int i = 0; i < anInt9014; i++) {
			Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i];
			class523_sub23.method16121(anInt9016);
		}
		if (aClass351_9017 != null)
			aClass351_9017.method6163();
		method14438();
	}

	public void method2345(int i, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_, int i_330_, boolean[][] bools) {
		if (anInt9023 > 0) {
			Interface40 interface40 = aClass178_Sub2_8999.method14951(anInt9005);
			int i_331_ = 0;
			int i_332_ = 32767;
			int i_333_ = -32768;
			ByteBuffer bytebuffer = aClass178_Sub2_8999.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_334_ = i_328_; i_334_ < i_330_; i_334_++) {
				int i_335_ = i_334_ * (anInt1683 * 692304099) + i_327_;
				for (int i_336_ = i_327_; i_336_ < i_329_; i_336_++) {
					if (bools[i_336_ - i_327_][i_334_ - i_328_]) {
						short[] is = aShortArrayArray9006[i_335_];
						if (is != null) {
							for (int i_337_ = 0; i_337_ < is.length; i_337_++) {
								int i_338_ = is[i_337_] & 0xffff;
								if (i_338_ > i_333_)
									i_333_ = i_338_;
								if (i_338_ < i_332_)
									i_332_ = i_338_;
								bytebuffer.putShort((short) i_338_);
								i_331_++;
							}
						}
					}
					i_335_++;
				}
			}
			interface40.method265(0, bytebuffer.position(), aClass178_Sub2_8999.aLong9540);
			if (i_331_ > 0) {
				aClass178_Sub2_8999.method15043();
				Class329 class329 = aClass178_Sub2_8999.aClass329_9642;
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15033(1, anInterface36_9021);
				aClass178_Sub2_8999.method15032(aClass345_9022);
				aClass178_Sub2_8999.method15213(interface40);
				aClass178_Sub2_8999.method3300(Class435.aClass435_4890);
				float f = (float) aClass178_Sub2_8999.method3039(1746586215).method2875();
				float f_339_ = (float) aClass178_Sub2_8999.method3039(1471371158).method2874();
				Class435 class435 = new Class435();
				Class435 class435_340_ = new Class435();
				class435.method6830(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class435_340_.method6815(((float) i_326_ / (256.0F * (float) (anInt1682 * 341909049))), ((float) -i_326_ / (256.0F * (float) (anInt1682 * 341909049))), 1.0F / (aFloat9008 - aFloat9007));
				class435_340_.method6819((float) i - (float) (i_327_ * i_326_) / 256.0F, (float) i_325_ + (float) (i_330_ * i_326_) / 256.0F, -aFloat9007 / (aFloat9008 - aFloat9007));
				class435_340_.method6816(2.0F / f, 2.0F / f_339_, 1.0F);
				class435_340_.method6819(-1.0F, -1.0F, 0.0F);
				aClass178_Sub2_8999.aClass435_9559.method6821(class435, class435_340_);
				aClass178_Sub2_8999.aClass441_9560.method7090(aClass178_Sub2_8999.aClass435_9559);
				aClass178_Sub2_8999.method3124(aClass178_Sub2_8999.aClass441_9560);
				class329.method5790(Class441.aClass441_4917);
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
				class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
				class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
				class329.aClass441_3480.method7085();
				class329.anInt3493 = i_332_;
				class329.anInt3494 = i_333_ - i_332_ + 1;
				class329.anInt3481 = 0;
				class329.anInt3496 = i_331_ / 3;
				if (aClass178_Sub2_8999.aBool9604) {
					aClass178_Sub2_8999.method3287(false);
					class329.method5793(false);
					aClass178_Sub2_8999.method3287(true);
				} else
					class329.method5793(false);
			}
		}
	}

	void method14443(int i, int i_341_, byte[][] is, Class523_Sub23[] class523_sub23s, Class14 class14, Class523_Sub23[] class523_sub23s_342_) {
		if (anIntArrayArrayArray9010[i][i_341_] != null) {
			Class523_Sub23[] class523_sub23s_343_ = aClass523_Sub23ArrayArrayArray9009[i][i_341_];
			int[] is_344_ = anIntArrayArrayArray9012[i][i_341_];
			int[] is_345_ = anIntArrayArrayArray9011[i][i_341_];
			int[] is_346_ = anIntArrayArrayArray8997[i][i_341_];
			int[] is_347_ = anIntArrayArrayArray9010[i][i_341_];
			int[] is_348_ = (anIntArrayArrayArray9031 != null ? anIntArrayArrayArray9031[i][i_341_] : null);
			int[] is_349_ = (anIntArrayArrayArray9037 != null ? anIntArrayArrayArray9037[i][i_341_] : null);
			if (is_346_ == null)
				is_346_ = is_347_;
			float f = aFloatArrayArray9026[i][i_341_];
			float f_350_ = aFloatArrayArray9027[i][i_341_];
			float f_351_ = aFloatArrayArray9028[i][i_341_];
			float f_352_ = aFloatArrayArray9026[i][i_341_ + 1];
			float f_353_ = aFloatArrayArray9027[i][i_341_ + 1];
			float f_354_ = aFloatArrayArray9028[i][i_341_ + 1];
			float f_355_ = aFloatArrayArray9026[i + 1][i_341_ + 1];
			float f_356_ = aFloatArrayArray9027[i + 1][i_341_ + 1];
			float f_357_ = aFloatArrayArray9028[i + 1][i_341_ + 1];
			float f_358_ = aFloatArrayArray9026[i + 1][i_341_];
			float f_359_ = aFloatArrayArray9027[i + 1][i_341_];
			float f_360_ = aFloatArrayArray9028[i + 1][i_341_];
			int i_361_ = is[i][i_341_] & 0xff;
			int i_362_ = is[i][i_341_ + 1] & 0xff;
			int i_363_ = is[i + 1][i_341_ + 1] & 0xff;
			int i_364_ = is[i + 1][i_341_] & 0xff;
			int i_365_ = 0;
			while_9_: for (int i_366_ = 0; i_366_ < is_347_.length; i_366_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s_343_[i_366_];
				for (int i_367_ = 0; i_367_ < i_365_; i_367_++) {
					if (class523_sub23s[i_367_] == class523_sub23)
						continue while_9_;
				}
				class523_sub23s[i_365_++] = class523_sub23;
			}
			short[] is_368_ = (aShortArrayArray9006[i_341_ * (anInt1683 * 692304099) + i] = new short[is_347_.length]);
			for (int i_369_ = 0; i_369_ < is_347_.length; i_369_++) {
				int i_370_ = (i << anInt1680 * -1193058675) + is_344_[i_369_];
				int i_371_ = (i_341_ << anInt1680 * -1193058675) + is_345_[i_369_];
				int i_372_ = i_370_ >> anInt9000;
				int i_373_ = i_371_ >> anInt9000;
				int i_374_ = is_347_[i_369_];
				int i_375_ = is_346_[i_369_];
				int i_376_ = is_348_ != null ? is_348_[i_369_] : 0;
				long l = ((long) i_375_ << 48 | (long) i_374_ << 32 | (long) (i_372_ << 16) | (long) i_373_);
				int i_377_ = is_344_[i_369_];
				int i_378_ = is_345_[i_369_];
				int i_379_ = 74;
				int i_380_ = 0;
				float f_381_ = 1.0F;
				float f_382_;
				float f_383_;
				float f_384_;
				if (i_377_ == 0 && i_378_ == 0) {
					f_382_ = f;
					f_383_ = f_350_;
					f_384_ = f_351_;
					i_379_ -= i_361_;
				} else if (i_377_ == 0 && i_378_ == anInt1682 * 341909049) {
					f_382_ = f_352_;
					f_383_ = f_353_;
					f_384_ = f_354_;
					i_379_ -= i_362_;
				} else if (i_377_ == anInt1682 * 341909049 && i_378_ == anInt1682 * 341909049) {
					f_382_ = f_355_;
					f_383_ = f_356_;
					f_384_ = f_357_;
					i_379_ -= i_363_;
				} else if (i_377_ == anInt1682 * 341909049 && i_378_ == 0) {
					f_382_ = f_358_;
					f_383_ = f_359_;
					f_384_ = f_360_;
					i_379_ -= i_364_;
				} else {
					float f_385_ = (float) i_377_ / (float) (anInt1682 * 341909049);
					float f_386_ = (float) i_378_ / (float) (anInt1682 * 341909049);
					float f_387_ = f + (f_358_ - f) * f_385_;
					float f_388_ = f_350_ + (f_359_ - f_350_) * f_385_;
					float f_389_ = f_351_ + (f_360_ - f_351_) * f_385_;
					float f_390_ = f_352_ + (f_355_ - f_352_) * f_385_;
					float f_391_ = f_353_ + (f_356_ - f_353_) * f_385_;
					float f_392_ = f_354_ + (f_357_ - f_354_) * f_385_;
					f_382_ = f_387_ + (f_390_ - f_387_) * f_386_;
					f_383_ = f_388_ + (f_391_ - f_388_) * f_386_;
					f_384_ = f_389_ + (f_392_ - f_389_) * f_386_;
					int i_393_ = i_361_ + ((i_364_ - i_361_) * i_377_ >> anInt1680 * -1193058675);
					int i_394_ = i_362_ + ((i_363_ - i_362_) * i_377_ >> anInt1680 * -1193058675);
					i_379_ -= i_393_ + ((i_394_ - i_393_) * i_378_ >> anInt1680 * -1193058675);
				}
				if (i_374_ != -1) {
					int i_395_ = (i_374_ & 0x7f) * i_379_ >> 7;
					if (i_395_ < 2)
						i_395_ = 2;
					else if (i_395_ > 126)
						i_395_ = 126;
					i_380_ = Class638.anIntArray8307[i_374_ & 0xff80 | i_395_];
					if ((anInt9003 & 0x7) == 0) {
						f_381_ = (aClass178_Sub2_8999.aFloatArray9608[0] * f_382_ + (aClass178_Sub2_8999.aFloatArray9608[1] * f_383_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_384_));
						f_381_ = (aClass178_Sub2_8999.aFloat9643 + f_381_ * (f_381_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618));
					}
				}
				Class523 class523 = null;
				if ((i_370_ & anInt9030 - 1) == 0 && (i_371_ & anInt9030 - 1) == 0)
					class523 = class14.getFromIndex(l);
				int i_396_;
				if (class523 == null) {
					int i_397_;
					if (i_375_ != i_374_) {
						int i_398_ = (i_375_ & 0x7f) * i_379_ >> 7;
						if (i_398_ < 2)
							i_398_ = 2;
						else if (i_398_ > 126)
							i_398_ = 126;
						i_397_ = (Class638.anIntArray8307[i_375_ & 0xff80 | i_398_]);
						if ((anInt9003 & 0x7) == 0) {
							float f_399_ = ((aClass178_Sub2_8999.aFloatArray9608[0] * f_382_) + (aClass178_Sub2_8999.aFloatArray9608[1] * f_383_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_384_));
							f_399_ = (aClass178_Sub2_8999.aFloat9643 + (f_381_ * (f_381_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618)));
							int i_400_ = i_397_ >> 16 & 0xff;
							int i_401_ = i_397_ >> 8 & 0xff;
							int i_402_ = i_397_ & 0xff;
							i_400_ *= f_399_;
							if (i_400_ < 0)
								i_400_ = 0;
							else if (i_400_ > 255)
								i_400_ = 255;
							i_401_ *= f_399_;
							if (i_401_ < 0)
								i_401_ = 0;
							else if (i_401_ > 255)
								i_401_ = 255;
							i_402_ *= f_399_;
							if (i_402_ < 0)
								i_402_ = 0;
							else if (i_402_ > 255)
								i_402_ = 255;
							i_397_ = i_400_ << 16 | i_401_ << 8 | i_402_;
						}
					} else
						i_397_ = i_380_;
					aByteBuffer9033.putFloat((float) i_370_);
					aByteBuffer9033.putFloat((float) (method2326(i_370_, i_371_, -1573506017) + i_376_));
					aByteBuffer9033.putFloat((float) i_371_);
					aByteBuffer9033.putFloat((float) i_370_);
					aByteBuffer9033.putFloat((float) i_371_);
					if (anIntArrayArrayArray9037 != null)
						aByteBuffer9033.putFloat(is_349_ != null ? (float) (is_349_[i_369_] - 1) : 0.0F);
					if ((anInt9003 & 0x7) != 0) {
						aByteBuffer9033.putFloat(f_382_);
						aByteBuffer9033.putFloat(f_383_);
						aByteBuffer9033.putFloat(f_384_);
					}
					if (aClass178_Sub2_8999.anInt9670 == 0) {
						int i_403_ = i_397_ & ~0xff00ff;
						i_403_ |= (i_397_ & 0xff0000) >> 16;
						i_403_ |= (i_397_ & 0xff) << 16;
						i_397_ = i_403_;
					}
					aByteBuffer9032.putInt(~0xffffff | i_397_);
					i_396_ = anInt9016++;
					is_368_[i_369_] = (short) i_396_;
					if (i_374_ != -1)
						class523_sub23s_342_[i_396_] = class523_sub23s_343_[i_369_];
					class14.method738(new Class523_Sub6(is_368_[i_369_]), l);
				} else {
					is_368_[i_369_] = ((Class523_Sub6) class523).aShort10403;
					i_396_ = is_368_[i_369_] & 0xffff;
					if (i_374_ != -1 && ((class523_sub23s_343_[i_369_].aLong7065 * 1055205983951172633L) < (class523_sub23s_342_[i_396_].aLong7065 * 1055205983951172633L)))
						class523_sub23s_342_[i_396_] = class523_sub23s_343_[i_369_];
				}
				for (int i_404_ = 0; i_404_ < i_365_; i_404_++)
					class523_sub23s[i_404_].method16120(i_396_, i_380_, i_379_, f_381_);
				anInt9005++;
			}
		}
	}

	public boolean method2341(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_405_, int i_406_, int i_407_, boolean bool) {
		if (aClass351_9017 == null || class523_sub27_sub4 == null)
			return false;
		int i_408_ = (i - (i_405_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
		int i_409_ = (i_406_ - (i_405_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
		return aClass351_9017.method6157(class523_sub27_sub4, i_408_, i_409_);
	}

	public Class523_Sub27_Sub4 method2348(int i, int i_410_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9018[i][i_410_] & 0x1) == 0)
			return null;
		int i_411_ = anInt1682 * 341909049 >> aClass178_Sub2_8999.anInt9623;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_412_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_411_, i_411_)) {
			class523_sub27_sub4_sub2_412_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_412_.method18545();
		} else
			class523_sub27_sub4_sub2_412_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_8999, i_411_, i_411_);
		class523_sub27_sub4_sub2_412_.method18544(0, 0, i_411_, i_411_);
		method14439(class523_sub27_sub4_sub2_412_, i, i_410_);
		return class523_sub27_sub4_sub2_412_;
	}

	public Class523_Sub27_Sub4 method2349(int i, int i_413_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9018[i][i_413_] & 0x1) == 0)
			return null;
		int i_414_ = anInt1682 * 341909049 >> aClass178_Sub2_8999.anInt9623;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_415_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_414_, i_414_)) {
			class523_sub27_sub4_sub2_415_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_415_.method18545();
		} else
			class523_sub27_sub4_sub2_415_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_8999, i_414_, i_414_);
		class523_sub27_sub4_sub2_415_.method18544(0, 0, i_414_, i_414_);
		method14439(class523_sub27_sub4_sub2_415_, i, i_413_);
		return class523_sub27_sub4_sub2_415_;
	}

	public void method2334(Class523_Sub20 class523_sub20, int[] is) {
		aClass708_9015.method14236(new Class523_Sub12(aClass178_Sub2_8999, this, class523_sub20, is), -488279589);
	}

	public void method2357(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_416_, int i_417_, int i_418_, boolean bool) {
		if (aClass351_9017 != null && class523_sub27_sub4 != null) {
			int i_419_ = (i - (i_416_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
			int i_420_ = (i_417_ - (i_416_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
			aClass351_9017.method6159(class523_sub27_sub4, i_419_, i_420_);
		}
	}

	public boolean method2352(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_421_, int i_422_, int i_423_, boolean bool) {
		if (aClass351_9017 == null || class523_sub27_sub4 == null)
			return false;
		int i_424_ = (i - (i_421_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
		int i_425_ = (i_422_ - (i_421_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
		return aClass351_9017.method6157(class523_sub27_sub4, i_424_, i_425_);
	}

	public Class523_Sub27_Sub4 method2330(int i, int i_426_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9018[i][i_426_] & 0x1) == 0)
			return null;
		int i_427_ = anInt1682 * 341909049 >> aClass178_Sub2_8999.anInt9623;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_428_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_427_, i_427_)) {
			class523_sub27_sub4_sub2_428_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_428_.method18545();
		} else
			class523_sub27_sub4_sub2_428_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_8999, i_427_, i_427_);
		class523_sub27_sub4_sub2_428_.method18544(0, 0, i_427_, i_427_);
		method14439(class523_sub27_sub4_sub2_428_, i, i_426_);
		return class523_sub27_sub4_sub2_428_;
	}

	public void method2353(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_429_, int i_430_, int i_431_, boolean bool) {
		if (aClass351_9017 != null && class523_sub27_sub4 != null) {
			int i_432_ = (i - (i_429_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
			int i_433_ = (i_430_ - (i_429_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
			aClass351_9017.method6165(class523_sub27_sub4, i_432_, i_433_);
		}
	}

	public Class523_Sub27_Sub4 method2350(int i, int i_434_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		if ((aByteArrayArray9018[i][i_434_] & 0x1) == 0)
			return null;
		int i_435_ = anInt1682 * 341909049 >> aClass178_Sub2_8999.anInt9623;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_436_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_435_, i_435_)) {
			class523_sub27_sub4_sub2_436_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_436_.method18545();
		} else
			class523_sub27_sub4_sub2_436_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_8999, i_435_, i_435_);
		class523_sub27_sub4_sub2_436_.method18544(0, 0, i_435_, i_435_);
		method14439(class523_sub27_sub4_sub2_436_, i, i_434_);
		return class523_sub27_sub4_sub2_436_;
	}

	void method14444() {
		anInterface36_9021 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9021.method215(anInt9016 * 4, 4);
		anInterface36_9021.method265(0, anInt9016 * 4, aClass178_Sub2_8999.method15037(aByteBuffer9032));
		anInterface36_9013 = aClass178_Sub2_8999.method15030(false);
		anInterface36_9013.method215(anInt9016 * anInt9034, anInt9034);
		anInterface36_9013.method265(0, anInt9016 * anInt9034, aClass178_Sub2_8999.method15037(aByteBuffer9033));
		aByteBuffer9032.clear();
		aByteBuffer9032 = null;
		aByteBuffer9033.clear();
		aByteBuffer9033 = null;
		if ((anInt9003 & 0x7) != 0) {
			if (anIntArrayArrayArray9037 != null)
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
			else
				aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3612 }), new Class378(Class344.aClass344_3613) }));
		} else if (anIntArrayArrayArray9037 != null)
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615, Class344.aClass344_3627 }), new Class378(Class344.aClass344_3613) }));
		else
			aClass345_9022 = (aClass178_Sub2_8999.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3615 }), new Class378(Class344.aClass344_3613) }));
		for (int i = 0; i < anInt9014; i++) {
			Class523_Sub23 class523_sub23 = (Class523_Sub23) aClass523Array9004[i];
			class523_sub23.method16121(anInt9016);
		}
		if (aClass351_9017 != null)
			aClass351_9017.method6163();
		method14438();
	}

	void method14445(Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2, int i, int i_437_) {
		int[] is = anIntArrayArrayArray9012[i][i_437_];
		int[] is_438_ = anIntArrayArrayArray9011[i][i_437_];
		int i_439_ = is.length;
		if (anIntArray9035.length < i_439_) {
			anIntArray9035 = new int[i_439_];
			anIntArray9036 = new int[i_439_];
		}
		for (int i_440_ = 0; i_440_ < i_439_; i_440_++) {
			anIntArray9035[i_440_] = is[i_440_] >> aClass178_Sub2_8999.anInt9623;
			anIntArray9036[i_440_] = is_438_[i_440_] >> aClass178_Sub2_8999.anInt9623;
		}
		int i_441_ = 0;
		while (i_441_ < i_439_) {
			int i_442_ = anIntArray9035[i_441_];
			int i_443_ = anIntArray9036[i_441_++];
			int i_444_ = anIntArray9035[i_441_];
			int i_445_ = anIntArray9036[i_441_++];
			int i_446_ = anIntArray9035[i_441_];
			int i_447_ = anIntArray9036[i_441_++];
			if (((i_442_ - i_444_) * (i_445_ - i_447_) - (i_445_ - i_443_) * (i_446_ - i_444_)) > 0)
				class523_sub27_sub4_sub2.method18546(i_443_, i_445_, i_447_, i_442_, i_444_, i_446_);
		}
	}

	public void method2338(int i, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_, boolean[][] bools) {
		if (anInt9023 > 0) {
			Interface40 interface40 = aClass178_Sub2_8999.method14951(anInt9005);
			int i_454_ = 0;
			int i_455_ = 32767;
			int i_456_ = -32768;
			ByteBuffer bytebuffer = aClass178_Sub2_8999.aByteBuffer9539;
			bytebuffer.clear();
			for (int i_457_ = i_451_; i_457_ < i_453_; i_457_++) {
				int i_458_ = i_457_ * (anInt1683 * 692304099) + i_450_;
				for (int i_459_ = i_450_; i_459_ < i_452_; i_459_++) {
					if (bools[i_459_ - i_450_][i_457_ - i_451_]) {
						short[] is = aShortArrayArray9006[i_458_];
						if (is != null) {
							for (int i_460_ = 0; i_460_ < is.length; i_460_++) {
								int i_461_ = is[i_460_] & 0xffff;
								if (i_461_ > i_456_)
									i_456_ = i_461_;
								if (i_461_ < i_455_)
									i_455_ = i_461_;
								bytebuffer.putShort((short) i_461_);
								i_454_++;
							}
						}
					}
					i_458_++;
				}
			}
			interface40.method265(0, bytebuffer.position(), aClass178_Sub2_8999.aLong9540);
			if (i_454_ > 0) {
				aClass178_Sub2_8999.method15043();
				Class329 class329 = aClass178_Sub2_8999.aClass329_9642;
				aClass178_Sub2_8999.method15033(0, anInterface36_9013);
				aClass178_Sub2_8999.method15033(1, anInterface36_9021);
				aClass178_Sub2_8999.method15032(aClass345_9022);
				aClass178_Sub2_8999.method15213(interface40);
				aClass178_Sub2_8999.method3300(Class435.aClass435_4890);
				float f = (float) aClass178_Sub2_8999.method3039(1664662394).method2875();
				float f_462_ = (float) aClass178_Sub2_8999.method3039(1642398035).method2874();
				Class435 class435 = new Class435();
				Class435 class435_463_ = new Class435();
				class435.method6830(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class435_463_.method6815(((float) i_449_ / (256.0F * (float) (anInt1682 * 341909049))), ((float) -i_449_ / (256.0F * (float) (anInt1682 * 341909049))), 1.0F / (aFloat9008 - aFloat9007));
				class435_463_.method6819((float) i - (float) (i_450_ * i_449_) / 256.0F, (float) i_448_ + (float) (i_453_ * i_449_) / 256.0F, -aFloat9007 / (aFloat9008 - aFloat9007));
				class435_463_.method6816(2.0F / f, 2.0F / f_462_, 1.0F);
				class435_463_.method6819(-1.0F, -1.0F, 0.0F);
				aClass178_Sub2_8999.aClass435_9559.method6821(class435, class435_463_);
				aClass178_Sub2_8999.aClass441_9560.method7090(aClass178_Sub2_8999.aClass435_9559);
				aClass178_Sub2_8999.method3124(aClass178_Sub2_8999.aClass441_9560);
				class329.method5790(Class441.aClass441_4917);
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
				class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
				class329.anInterface37_3478 = aClass178_Sub2_8999.anInterface37_9669;
				class329.aClass441_3480.method7085();
				class329.anInt3493 = i_455_;
				class329.anInt3494 = i_456_ - i_455_ + 1;
				class329.anInt3481 = 0;
				class329.anInt3496 = i_454_ / 3;
				if (aClass178_Sub2_8999.aBool9604) {
					aClass178_Sub2_8999.method3287(false);
					class329.method5793(false);
					aClass178_Sub2_8999.method3287(true);
				} else
					class329.method5793(false);
			}
		}
	}

	public void method2354(Class523_Sub20 class523_sub20, int[] is) {
		aClass708_9015.method14236(new Class523_Sub12(aClass178_Sub2_8999, this, class523_sub20, is), -209757295);
	}

	void method14446(int i, int i_464_, byte[][] is, Class523_Sub23[] class523_sub23s, Class14 class14, Class523_Sub23[] class523_sub23s_465_) {
		if (anIntArrayArrayArray9010[i][i_464_] != null) {
			Class523_Sub23[] class523_sub23s_466_ = aClass523_Sub23ArrayArrayArray9009[i][i_464_];
			int[] is_467_ = anIntArrayArrayArray9012[i][i_464_];
			int[] is_468_ = anIntArrayArrayArray9011[i][i_464_];
			int[] is_469_ = anIntArrayArrayArray8997[i][i_464_];
			int[] is_470_ = anIntArrayArrayArray9010[i][i_464_];
			int[] is_471_ = (anIntArrayArrayArray9031 != null ? anIntArrayArrayArray9031[i][i_464_] : null);
			int[] is_472_ = (anIntArrayArrayArray9037 != null ? anIntArrayArrayArray9037[i][i_464_] : null);
			if (is_469_ == null)
				is_469_ = is_470_;
			float f = aFloatArrayArray9026[i][i_464_];
			float f_473_ = aFloatArrayArray9027[i][i_464_];
			float f_474_ = aFloatArrayArray9028[i][i_464_];
			float f_475_ = aFloatArrayArray9026[i][i_464_ + 1];
			float f_476_ = aFloatArrayArray9027[i][i_464_ + 1];
			float f_477_ = aFloatArrayArray9028[i][i_464_ + 1];
			float f_478_ = aFloatArrayArray9026[i + 1][i_464_ + 1];
			float f_479_ = aFloatArrayArray9027[i + 1][i_464_ + 1];
			float f_480_ = aFloatArrayArray9028[i + 1][i_464_ + 1];
			float f_481_ = aFloatArrayArray9026[i + 1][i_464_];
			float f_482_ = aFloatArrayArray9027[i + 1][i_464_];
			float f_483_ = aFloatArrayArray9028[i + 1][i_464_];
			int i_484_ = is[i][i_464_] & 0xff;
			int i_485_ = is[i][i_464_ + 1] & 0xff;
			int i_486_ = is[i + 1][i_464_ + 1] & 0xff;
			int i_487_ = is[i + 1][i_464_] & 0xff;
			int i_488_ = 0;
			while_11_: for (int i_489_ = 0; i_489_ < is_470_.length; i_489_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s_466_[i_489_];
				for (int i_490_ = 0; i_490_ < i_488_; i_490_++) {
					if (class523_sub23s[i_490_] == class523_sub23)
						continue while_11_;
				}
				class523_sub23s[i_488_++] = class523_sub23;
			}
			short[] is_491_ = (aShortArrayArray9006[i_464_ * (anInt1683 * 692304099) + i] = new short[is_470_.length]);
			for (int i_492_ = 0; i_492_ < is_470_.length; i_492_++) {
				int i_493_ = (i << anInt1680 * -1193058675) + is_467_[i_492_];
				int i_494_ = (i_464_ << anInt1680 * -1193058675) + is_468_[i_492_];
				int i_495_ = i_493_ >> anInt9000;
				int i_496_ = i_494_ >> anInt9000;
				int i_497_ = is_470_[i_492_];
				int i_498_ = is_469_[i_492_];
				int i_499_ = is_471_ != null ? is_471_[i_492_] : 0;
				long l = ((long) i_498_ << 48 | (long) i_497_ << 32 | (long) (i_495_ << 16) | (long) i_496_);
				int i_500_ = is_467_[i_492_];
				int i_501_ = is_468_[i_492_];
				int i_502_ = 74;
				int i_503_ = 0;
				float f_504_ = 1.0F;
				float f_505_;
				float f_506_;
				float f_507_;
				if (i_500_ == 0 && i_501_ == 0) {
					f_505_ = f;
					f_506_ = f_473_;
					f_507_ = f_474_;
					i_502_ -= i_484_;
				} else if (i_500_ == 0 && i_501_ == anInt1682 * 341909049) {
					f_505_ = f_475_;
					f_506_ = f_476_;
					f_507_ = f_477_;
					i_502_ -= i_485_;
				} else if (i_500_ == anInt1682 * 341909049 && i_501_ == anInt1682 * 341909049) {
					f_505_ = f_478_;
					f_506_ = f_479_;
					f_507_ = f_480_;
					i_502_ -= i_486_;
				} else if (i_500_ == anInt1682 * 341909049 && i_501_ == 0) {
					f_505_ = f_481_;
					f_506_ = f_482_;
					f_507_ = f_483_;
					i_502_ -= i_487_;
				} else {
					float f_508_ = (float) i_500_ / (float) (anInt1682 * 341909049);
					float f_509_ = (float) i_501_ / (float) (anInt1682 * 341909049);
					float f_510_ = f + (f_481_ - f) * f_508_;
					float f_511_ = f_473_ + (f_482_ - f_473_) * f_508_;
					float f_512_ = f_474_ + (f_483_ - f_474_) * f_508_;
					float f_513_ = f_475_ + (f_478_ - f_475_) * f_508_;
					float f_514_ = f_476_ + (f_479_ - f_476_) * f_508_;
					float f_515_ = f_477_ + (f_480_ - f_477_) * f_508_;
					f_505_ = f_510_ + (f_513_ - f_510_) * f_509_;
					f_506_ = f_511_ + (f_514_ - f_511_) * f_509_;
					f_507_ = f_512_ + (f_515_ - f_512_) * f_509_;
					int i_516_ = i_484_ + ((i_487_ - i_484_) * i_500_ >> anInt1680 * -1193058675);
					int i_517_ = i_485_ + ((i_486_ - i_485_) * i_500_ >> anInt1680 * -1193058675);
					i_502_ -= i_516_ + ((i_517_ - i_516_) * i_501_ >> anInt1680 * -1193058675);
				}
				if (i_497_ != -1) {
					int i_518_ = (i_497_ & 0x7f) * i_502_ >> 7;
					if (i_518_ < 2)
						i_518_ = 2;
					else if (i_518_ > 126)
						i_518_ = 126;
					i_503_ = Class638.anIntArray8307[i_497_ & 0xff80 | i_518_];
					if ((anInt9003 & 0x7) == 0) {
						f_504_ = (aClass178_Sub2_8999.aFloatArray9608[0] * f_505_ + (aClass178_Sub2_8999.aFloatArray9608[1] * f_506_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_507_));
						f_504_ = (aClass178_Sub2_8999.aFloat9643 + f_504_ * (f_504_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618));
					}
				}
				Class523 class523 = null;
				if ((i_493_ & anInt9030 - 1) == 0 && (i_494_ & anInt9030 - 1) == 0)
					class523 = class14.getFromIndex(l);
				int i_519_;
				if (class523 == null) {
					int i_520_;
					if (i_498_ != i_497_) {
						int i_521_ = (i_498_ & 0x7f) * i_502_ >> 7;
						if (i_521_ < 2)
							i_521_ = 2;
						else if (i_521_ > 126)
							i_521_ = 126;
						i_520_ = (Class638.anIntArray8307[i_498_ & 0xff80 | i_521_]);
						if ((anInt9003 & 0x7) == 0) {
							float f_522_ = ((aClass178_Sub2_8999.aFloatArray9608[0] * f_505_) + (aClass178_Sub2_8999.aFloatArray9608[1] * f_506_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_507_));
							f_522_ = (aClass178_Sub2_8999.aFloat9643 + (f_504_ * (f_504_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618)));
							int i_523_ = i_520_ >> 16 & 0xff;
							int i_524_ = i_520_ >> 8 & 0xff;
							int i_525_ = i_520_ & 0xff;
							i_523_ *= f_522_;
							if (i_523_ < 0)
								i_523_ = 0;
							else if (i_523_ > 255)
								i_523_ = 255;
							i_524_ *= f_522_;
							if (i_524_ < 0)
								i_524_ = 0;
							else if (i_524_ > 255)
								i_524_ = 255;
							i_525_ *= f_522_;
							if (i_525_ < 0)
								i_525_ = 0;
							else if (i_525_ > 255)
								i_525_ = 255;
							i_520_ = i_523_ << 16 | i_524_ << 8 | i_525_;
						}
					} else
						i_520_ = i_503_;
					aByteBuffer9033.putFloat((float) i_493_);
					aByteBuffer9033.putFloat((float) (method2326(i_493_, i_494_, 812744152) + i_499_));
					aByteBuffer9033.putFloat((float) i_494_);
					aByteBuffer9033.putFloat((float) i_493_);
					aByteBuffer9033.putFloat((float) i_494_);
					if (anIntArrayArrayArray9037 != null)
						aByteBuffer9033.putFloat(is_472_ != null ? (float) (is_472_[i_492_] - 1) : 0.0F);
					if ((anInt9003 & 0x7) != 0) {
						aByteBuffer9033.putFloat(f_505_);
						aByteBuffer9033.putFloat(f_506_);
						aByteBuffer9033.putFloat(f_507_);
					}
					if (aClass178_Sub2_8999.anInt9670 == 0) {
						int i_526_ = i_520_ & ~0xff00ff;
						i_526_ |= (i_520_ & 0xff0000) >> 16;
						i_526_ |= (i_520_ & 0xff) << 16;
						i_520_ = i_526_;
					}
					aByteBuffer9032.putInt(~0xffffff | i_520_);
					i_519_ = anInt9016++;
					is_491_[i_492_] = (short) i_519_;
					if (i_497_ != -1)
						class523_sub23s_465_[i_519_] = class523_sub23s_466_[i_492_];
					class14.method738(new Class523_Sub6(is_491_[i_492_]), l);
				} else {
					is_491_[i_492_] = ((Class523_Sub6) class523).aShort10403;
					i_519_ = is_491_[i_492_] & 0xffff;
					if (i_497_ != -1 && ((class523_sub23s_466_[i_492_].aLong7065 * 1055205983951172633L) < (class523_sub23s_465_[i_519_].aLong7065 * 1055205983951172633L)))
						class523_sub23s_465_[i_519_] = class523_sub23s_466_[i_492_];
				}
				for (int i_527_ = 0; i_527_ < i_488_; i_527_++)
					class523_sub23s[i_527_].method16120(i_519_, i_503_, i_502_, f_504_);
				anInt9005++;
			}
		}
	}

	void method14447(int i, int i_528_, byte[][] is, Class523_Sub23[] class523_sub23s, Class14 class14, Class523_Sub23[] class523_sub23s_529_) {
		if (anIntArrayArrayArray9010[i][i_528_] != null) {
			Class523_Sub23[] class523_sub23s_530_ = aClass523_Sub23ArrayArrayArray9009[i][i_528_];
			int[] is_531_ = anIntArrayArrayArray9012[i][i_528_];
			int[] is_532_ = anIntArrayArrayArray9011[i][i_528_];
			int[] is_533_ = anIntArrayArrayArray8997[i][i_528_];
			int[] is_534_ = anIntArrayArrayArray9010[i][i_528_];
			int[] is_535_ = (anIntArrayArrayArray9031 != null ? anIntArrayArrayArray9031[i][i_528_] : null);
			int[] is_536_ = (anIntArrayArrayArray9037 != null ? anIntArrayArrayArray9037[i][i_528_] : null);
			if (is_533_ == null)
				is_533_ = is_534_;
			float f = aFloatArrayArray9026[i][i_528_];
			float f_537_ = aFloatArrayArray9027[i][i_528_];
			float f_538_ = aFloatArrayArray9028[i][i_528_];
			float f_539_ = aFloatArrayArray9026[i][i_528_ + 1];
			float f_540_ = aFloatArrayArray9027[i][i_528_ + 1];
			float f_541_ = aFloatArrayArray9028[i][i_528_ + 1];
			float f_542_ = aFloatArrayArray9026[i + 1][i_528_ + 1];
			float f_543_ = aFloatArrayArray9027[i + 1][i_528_ + 1];
			float f_544_ = aFloatArrayArray9028[i + 1][i_528_ + 1];
			float f_545_ = aFloatArrayArray9026[i + 1][i_528_];
			float f_546_ = aFloatArrayArray9027[i + 1][i_528_];
			float f_547_ = aFloatArrayArray9028[i + 1][i_528_];
			int i_548_ = is[i][i_528_] & 0xff;
			int i_549_ = is[i][i_528_ + 1] & 0xff;
			int i_550_ = is[i + 1][i_528_ + 1] & 0xff;
			int i_551_ = is[i + 1][i_528_] & 0xff;
			int i_552_ = 0;
			while_13_: for (int i_553_ = 0; i_553_ < is_534_.length; i_553_++) {
				Class523_Sub23 class523_sub23 = class523_sub23s_530_[i_553_];
				for (int i_554_ = 0; i_554_ < i_552_; i_554_++) {
					if (class523_sub23s[i_554_] == class523_sub23)
						continue while_13_;
				}
				class523_sub23s[i_552_++] = class523_sub23;
			}
			short[] is_555_ = (aShortArrayArray9006[i_528_ * (anInt1683 * 692304099) + i] = new short[is_534_.length]);
			for (int i_556_ = 0; i_556_ < is_534_.length; i_556_++) {
				int i_557_ = (i << anInt1680 * -1193058675) + is_531_[i_556_];
				int i_558_ = (i_528_ << anInt1680 * -1193058675) + is_532_[i_556_];
				int i_559_ = i_557_ >> anInt9000;
				int i_560_ = i_558_ >> anInt9000;
				int i_561_ = is_534_[i_556_];
				int i_562_ = is_533_[i_556_];
				int i_563_ = is_535_ != null ? is_535_[i_556_] : 0;
				long l = ((long) i_562_ << 48 | (long) i_561_ << 32 | (long) (i_559_ << 16) | (long) i_560_);
				int i_564_ = is_531_[i_556_];
				int i_565_ = is_532_[i_556_];
				int i_566_ = 74;
				int i_567_ = 0;
				float f_568_ = 1.0F;
				float f_569_;
				float f_570_;
				float f_571_;
				if (i_564_ == 0 && i_565_ == 0) {
					f_569_ = f;
					f_570_ = f_537_;
					f_571_ = f_538_;
					i_566_ -= i_548_;
				} else if (i_564_ == 0 && i_565_ == anInt1682 * 341909049) {
					f_569_ = f_539_;
					f_570_ = f_540_;
					f_571_ = f_541_;
					i_566_ -= i_549_;
				} else if (i_564_ == anInt1682 * 341909049 && i_565_ == anInt1682 * 341909049) {
					f_569_ = f_542_;
					f_570_ = f_543_;
					f_571_ = f_544_;
					i_566_ -= i_550_;
				} else if (i_564_ == anInt1682 * 341909049 && i_565_ == 0) {
					f_569_ = f_545_;
					f_570_ = f_546_;
					f_571_ = f_547_;
					i_566_ -= i_551_;
				} else {
					float f_572_ = (float) i_564_ / (float) (anInt1682 * 341909049);
					float f_573_ = (float) i_565_ / (float) (anInt1682 * 341909049);
					float f_574_ = f + (f_545_ - f) * f_572_;
					float f_575_ = f_537_ + (f_546_ - f_537_) * f_572_;
					float f_576_ = f_538_ + (f_547_ - f_538_) * f_572_;
					float f_577_ = f_539_ + (f_542_ - f_539_) * f_572_;
					float f_578_ = f_540_ + (f_543_ - f_540_) * f_572_;
					float f_579_ = f_541_ + (f_544_ - f_541_) * f_572_;
					f_569_ = f_574_ + (f_577_ - f_574_) * f_573_;
					f_570_ = f_575_ + (f_578_ - f_575_) * f_573_;
					f_571_ = f_576_ + (f_579_ - f_576_) * f_573_;
					int i_580_ = i_548_ + ((i_551_ - i_548_) * i_564_ >> anInt1680 * -1193058675);
					int i_581_ = i_549_ + ((i_550_ - i_549_) * i_564_ >> anInt1680 * -1193058675);
					i_566_ -= i_580_ + ((i_581_ - i_580_) * i_565_ >> anInt1680 * -1193058675);
				}
				if (i_561_ != -1) {
					int i_582_ = (i_561_ & 0x7f) * i_566_ >> 7;
					if (i_582_ < 2)
						i_582_ = 2;
					else if (i_582_ > 126)
						i_582_ = 126;
					i_567_ = Class638.anIntArray8307[i_561_ & 0xff80 | i_582_];
					if ((anInt9003 & 0x7) == 0) {
						f_568_ = (aClass178_Sub2_8999.aFloatArray9608[0] * f_569_ + (aClass178_Sub2_8999.aFloatArray9608[1] * f_570_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_571_));
						f_568_ = (aClass178_Sub2_8999.aFloat9643 + f_568_ * (f_568_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618));
					}
				}
				Class523 class523 = null;
				if ((i_557_ & anInt9030 - 1) == 0 && (i_558_ & anInt9030 - 1) == 0)
					class523 = class14.getFromIndex(l);
				int i_583_;
				if (class523 == null) {
					int i_584_;
					if (i_562_ != i_561_) {
						int i_585_ = (i_562_ & 0x7f) * i_566_ >> 7;
						if (i_585_ < 2)
							i_585_ = 2;
						else if (i_585_ > 126)
							i_585_ = 126;
						i_584_ = (Class638.anIntArray8307[i_562_ & 0xff80 | i_585_]);
						if ((anInt9003 & 0x7) == 0) {
							float f_586_ = ((aClass178_Sub2_8999.aFloatArray9608[0] * f_569_) + (aClass178_Sub2_8999.aFloatArray9608[1] * f_570_) + (aClass178_Sub2_8999.aFloatArray9608[2] * f_571_));
							f_586_ = (aClass178_Sub2_8999.aFloat9643 + (f_568_ * (f_568_ > 0.0F ? aClass178_Sub2_8999.aFloat9617 : aClass178_Sub2_8999.aFloat9618)));
							int i_587_ = i_584_ >> 16 & 0xff;
							int i_588_ = i_584_ >> 8 & 0xff;
							int i_589_ = i_584_ & 0xff;
							i_587_ *= f_586_;
							if (i_587_ < 0)
								i_587_ = 0;
							else if (i_587_ > 255)
								i_587_ = 255;
							i_588_ *= f_586_;
							if (i_588_ < 0)
								i_588_ = 0;
							else if (i_588_ > 255)
								i_588_ = 255;
							i_589_ *= f_586_;
							if (i_589_ < 0)
								i_589_ = 0;
							else if (i_589_ > 255)
								i_589_ = 255;
							i_584_ = i_587_ << 16 | i_588_ << 8 | i_589_;
						}
					} else
						i_584_ = i_567_;
					aByteBuffer9033.putFloat((float) i_557_);
					aByteBuffer9033.putFloat((float) (method2326(i_557_, i_558_, -23562381) + i_563_));
					aByteBuffer9033.putFloat((float) i_558_);
					aByteBuffer9033.putFloat((float) i_557_);
					aByteBuffer9033.putFloat((float) i_558_);
					if (anIntArrayArrayArray9037 != null)
						aByteBuffer9033.putFloat(is_536_ != null ? (float) (is_536_[i_556_] - 1) : 0.0F);
					if ((anInt9003 & 0x7) != 0) {
						aByteBuffer9033.putFloat(f_569_);
						aByteBuffer9033.putFloat(f_570_);
						aByteBuffer9033.putFloat(f_571_);
					}
					if (aClass178_Sub2_8999.anInt9670 == 0) {
						int i_590_ = i_584_ & ~0xff00ff;
						i_590_ |= (i_584_ & 0xff0000) >> 16;
						i_590_ |= (i_584_ & 0xff) << 16;
						i_584_ = i_590_;
					}
					aByteBuffer9032.putInt(~0xffffff | i_584_);
					i_583_ = anInt9016++;
					is_555_[i_556_] = (short) i_583_;
					if (i_561_ != -1)
						class523_sub23s_529_[i_583_] = class523_sub23s_530_[i_556_];
					class14.method738(new Class523_Sub6(is_555_[i_556_]), l);
				} else {
					is_555_[i_556_] = ((Class523_Sub6) class523).aShort10403;
					i_583_ = is_555_[i_556_] & 0xffff;
					if (i_561_ != -1 && ((class523_sub23s_530_[i_556_].aLong7065 * 1055205983951172633L) < (class523_sub23s_529_[i_583_].aLong7065 * 1055205983951172633L)))
						class523_sub23s_529_[i_583_] = class523_sub23s_530_[i_556_];
				}
				for (int i_591_ = 0; i_591_ < i_552_; i_591_++)
					class523_sub23s[i_591_].method16120(i_583_, i_567_, i_566_, f_568_);
				anInt9005++;
			}
		}
	}

	public void method2324(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_592_, int i_593_, int i_594_, boolean bool) {
		if (aClass351_9017 != null && class523_sub27_sub4 != null) {
			int i_595_ = (i - (i_592_ * aClass178_Sub2_8999.anInt9624 >> 8) >> aClass178_Sub2_8999.anInt9623);
			int i_596_ = (i_593_ - (i_592_ * aClass178_Sub2_8999.anInt9625 >> 8) >> aClass178_Sub2_8999.anInt9623);
			aClass351_9017.method6159(class523_sub27_sub4, i_595_, i_596_);
		}
	}
}
