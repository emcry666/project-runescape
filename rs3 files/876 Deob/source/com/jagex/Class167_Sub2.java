/* Class167_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class167_Sub2 extends Class167 {
	short aShort9149;
	Class357 aClass357_9150;
	int anInt9151;
	int anInt9152;
	Class178_Sub2 aClass178_Sub2_9153;
	int anInt9154;
	int anInt9155;
	int anInt9156 = 0;
	int anInt9157 = 0;
	int[] anIntArray9158;
	int[] anIntArray9159;
	int[] anIntArray9160;
	short[] aShortArray9161;
	short[] aShortArray9162;
	int anInt9163 = 0;
	short[] aShortArray9164;
	int anInt9165;
	short[] aShortArray9166;
	short[] aShortArray9167;
	short[] aShortArray9168;
	byte[] aByteArray9169;
	short[] aShortArray9170;
	float[] aFloatArray9171;
	Class367 aClass367_9172;
	boolean aBool9173;
	int anInt9174;
	short[] aShortArray9175;
	byte[] aByteArray9176;
	int[] anIntArray9177;
	short[] aShortArray9178;
	short[] aShortArray9179;
	int[] anIntArray9180;
	int[][] anIntArrayArray9181;
	boolean aBool9182;
	Class336 aClass336_9183;
	boolean aBool9184;
	int anInt9185;
	Class357 aClass357_9186;
	Class357 aClass357_9187;
	boolean aBool9188;
	short[] aShortArray9189;
	int[][] anIntArrayArray9190;
	boolean aBool9191;
	int anInt9192;
	int anInt9193;
	float[] aFloatArray9194;
	int anInt9195;
	int anInt9196;
	int anInt9197;
	static final int anInt9198 = 7;
	int[] anIntArray9199;
	int anInt9200;
	boolean aBool9201;
	int anInt9202;
	int[] anIntArray9203;
	int[] anIntArray9204;
	int[] anIntArray9205;
	short aShort9206;
	short[] aShortArray9207;
	Class184[] aClass184Array9208;
	Class143[] aClass143Array9209;
	int anInt9210;
	Class371[] aClass371Array9211;
	Class337[] aClass337Array9212;
	int[][] anIntArrayArray9213;
	long[] aLongArray9214;
	boolean aBool9215;
	static final int anInt9216 = 4;
	short[] aShortArray9217;
	int[] anIntArray9218;
	int[] anIntArray9219;
	int[] anIntArray9220;
	int anInt9221;
	int anInt9222;
	float[] aFloatArray9223;
	Class357 aClass357_9224;
	static Class343 aClass343_9225;

	public void method2818(short i, short i_0_) {
		Class172 class172 = aClass178_Sub2_9153.aClass172_1916;
		for (int i_1_ = 0; i_1_ < anInt9155; i_1_++) {
			if (aShortArray9189[i_1_] == i)
				aShortArray9189[i_1_] = i_0_;
		}
		byte i_2_ = 0;
		byte i_3_ = 0;
		if (i != -1) {
			Class177 class177 = class172.method2895(i & 0xffff, -70233493);
			i_2_ = class177.aByte1912;
			i_3_ = class177.aByte1883;
		}
		byte i_4_ = 0;
		byte i_5_ = 0;
		if (i_0_ != -1) {
			Class177 class177 = class172.method2895(i_0_ & 0xffff, -1288200500);
			i_4_ = class177.aByte1912;
			i_5_ = class177.aByte1883;
			if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
				aBool9191 = true;
		}
		if (i_2_ != i_4_ | i_3_ != i_5_) {
			if (aClass371Array9211 != null) {
				for (int i_6_ = 0; i_6_ < anInt9210; i_6_++) {
					Class371 class371 = aClass371Array9211[i_6_];
					Class337 class337 = aClass337Array9212[i_6_];
					class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
				}
			}
			method14547();
		}
	}

	public boolean method2730() {
		return aBool9184;
	}

	short method14543(Class179 class179, int i, int i_7_, long l, int i_8_, int i_9_, int i_10_, int i_11_, float f, float f_12_) {
		int i_13_ = anIntArray9199[i];
		int i_14_ = anIntArray9199[i + 1];
		int i_15_ = 0;
		for (int i_16_ = i_13_; i_16_ < i_14_; i_16_++) {
			if (aShortArray9207[i_16_] == 0) {
				i_15_ = i_16_;
				break;
			}
			int i_17_ = (aShortArray9207[i_16_] & 0xffff) - 1;
			if (aLongArray9214[i_16_] == l)
				return (short) i_17_;
		}
		aShortArray9207[i_15_] = (short) (anInt9163 + 1);
		aLongArray9214[i_15_] = l;
		aShortArray9178[anInt9163] = (short) i_7_;
		aShortArray9166[anInt9163] = (short) i;
		aShortArray9164[anInt9163] = (short) i_8_;
		aShortArray9167[anInt9163] = (short) i_9_;
		aShortArray9168[anInt9163] = (short) i_10_;
		aByteArray9169[anInt9163] = (byte) i_11_;
		aFloatArray9194[anInt9163] = f;
		aFloatArray9171[anInt9163] = f_12_;
		return (short) anInt9163++;
	}

	void method2767() {
		/* empty */
	}

	public void method2761(int i) {
		int i_18_ = Class433.anIntArray4880[i];
		int i_19_ = Class433.anIntArray4881[i];
		for (int i_20_ = 0; i_20_ < anInt9157; i_20_++) {
			int i_21_ = ((anIntArray9160[i_20_] * i_18_ + anIntArray9158[i_20_] * i_19_) >> 14);
			anIntArray9160[i_20_] = (anIntArray9160[i_20_] * i_19_ - anIntArray9158[i_20_] * i_18_) >> 14;
			anIntArray9158[i_20_] = i_21_;
		}
		method14577();
		aBool9215 = false;
	}

	Class167 method14544(Class167_Sub2 class167_sub2_22_, Class167_Sub2 class167_sub2_23_, int i, boolean bool, boolean bool_24_) {
		class167_sub2_22_.anInt9152 = i;
		class167_sub2_22_.anInt9185 = anInt9185;
		class167_sub2_22_.aShort9149 = aShort9149;
		class167_sub2_22_.aShort9206 = aShort9206;
		class167_sub2_22_.anInt9156 = anInt9156;
		class167_sub2_22_.anInt9157 = anInt9157;
		class167_sub2_22_.anInt9163 = anInt9163;
		class167_sub2_22_.anInt9155 = anInt9155;
		class167_sub2_22_.anInt9174 = anInt9174;
		class167_sub2_22_.anInt9210 = anInt9210;
		if ((i & 0x100) != 0)
			class167_sub2_22_.aBool9184 = true;
		else
			class167_sub2_22_.aBool9184 = aBool9184;
		class167_sub2_22_.aBool9191 = aBool9191;
		boolean bool_25_ = Class347.method6013(i, anInt9185);
		boolean bool_26_ = Class347.method6085(i, anInt9185);
		boolean bool_27_ = Class347.method5996(i, anInt9185);
		boolean bool_28_ = bool_25_ | bool_26_ | bool_27_;
		if (bool_28_) {
			if (bool_25_) {
				if (class167_sub2_23_.anIntArray9158 == null || class167_sub2_23_.anIntArray9158.length < anInt9156)
					class167_sub2_22_.anIntArray9158 = class167_sub2_23_.anIntArray9158 = new int[anInt9156];
				else
					class167_sub2_22_.anIntArray9158 = class167_sub2_23_.anIntArray9158;
			} else
				class167_sub2_22_.anIntArray9158 = anIntArray9158;
			if (bool_26_) {
				if (class167_sub2_23_.anIntArray9159 == null || class167_sub2_23_.anIntArray9159.length < anInt9156)
					class167_sub2_22_.anIntArray9159 = class167_sub2_23_.anIntArray9159 = new int[anInt9156];
				else
					class167_sub2_22_.anIntArray9159 = class167_sub2_23_.anIntArray9159;
			} else
				class167_sub2_22_.anIntArray9159 = anIntArray9159;
			if (bool_27_) {
				if (class167_sub2_23_.anIntArray9160 == null || class167_sub2_23_.anIntArray9160.length < anInt9156)
					class167_sub2_22_.anIntArray9160 = class167_sub2_23_.anIntArray9160 = new int[anInt9156];
				else
					class167_sub2_22_.anIntArray9160 = class167_sub2_23_.anIntArray9160;
			} else
				class167_sub2_22_.anIntArray9160 = anIntArray9160;
			for (int i_29_ = 0; i_29_ < anInt9156; i_29_++) {
				if (bool_25_)
					class167_sub2_22_.anIntArray9158[i_29_] = anIntArray9158[i_29_];
				if (bool_26_)
					class167_sub2_22_.anIntArray9159[i_29_] = anIntArray9159[i_29_];
				if (bool_27_)
					class167_sub2_22_.anIntArray9160[i_29_] = anIntArray9160[i_29_];
			}
		} else {
			class167_sub2_22_.anIntArray9158 = anIntArray9158;
			class167_sub2_22_.anIntArray9159 = anIntArray9159;
			class167_sub2_22_.anIntArray9160 = anIntArray9160;
		}
		if (Class347.method6011(i, anInt9185)) {
			class167_sub2_22_.aClass357_9186 = class167_sub2_23_.aClass357_9186;
			class167_sub2_22_.aClass357_9186.anInterface36_3726 = aClass357_9186.anInterface36_3726;
			class167_sub2_22_.aClass357_9186.aBool3725 = aClass357_9186.aBool3725;
			class167_sub2_22_.aClass357_9186.aBool3724 = true;
		} else if (Class347.method6006(i, anInt9185))
			class167_sub2_22_.aClass357_9186 = aClass357_9186;
		else
			class167_sub2_22_.aClass357_9186 = null;
		if (Class347.method5999(i, anInt9185)) {
			if (class167_sub2_23_.aShortArray9175 == null || class167_sub2_23_.aShortArray9175.length < anInt9155)
				class167_sub2_22_.aShortArray9175 = class167_sub2_23_.aShortArray9175 = new short[anInt9155];
			else
				class167_sub2_22_.aShortArray9175 = class167_sub2_23_.aShortArray9175;
			for (int i_30_ = 0; i_30_ < anInt9155; i_30_++)
				class167_sub2_22_.aShortArray9175[i_30_] = aShortArray9175[i_30_];
		} else
			class167_sub2_22_.aShortArray9175 = aShortArray9175;
		if (Class347.method5994(i, anInt9185)) {
			if (class167_sub2_23_.aByteArray9176 == null || class167_sub2_23_.aByteArray9176.length < anInt9155)
				class167_sub2_22_.aByteArray9176 = class167_sub2_23_.aByteArray9176 = new byte[anInt9155];
			else
				class167_sub2_22_.aByteArray9176 = class167_sub2_23_.aByteArray9176;
			for (int i_31_ = 0; i_31_ < anInt9155; i_31_++)
				class167_sub2_22_.aByteArray9176[i_31_] = aByteArray9176[i_31_];
		} else
			class167_sub2_22_.aByteArray9176 = aByteArray9176;
		if (Class347.method6092(i, anInt9185)) {
			class167_sub2_22_.aClass357_9150 = class167_sub2_23_.aClass357_9150;
			class167_sub2_22_.aClass357_9150.anInterface36_3726 = aClass357_9150.anInterface36_3726;
			class167_sub2_22_.aClass357_9150.aBool3725 = aClass357_9150.aBool3725;
			class167_sub2_22_.aClass357_9150.aBool3724 = true;
		} else if (Class347.method6008(i, anInt9185))
			class167_sub2_22_.aClass357_9150 = aClass357_9150;
		else
			class167_sub2_22_.aClass357_9150 = null;
		if (Class347.method5998(i, anInt9185)) {
			if (class167_sub2_23_.aShortArray9164 == null || class167_sub2_23_.aShortArray9164.length < anInt9163) {
				int i_32_ = anInt9163;
				class167_sub2_22_.aShortArray9164 = class167_sub2_23_.aShortArray9164 = new short[i_32_];
				class167_sub2_22_.aShortArray9167 = class167_sub2_23_.aShortArray9167 = new short[i_32_];
				class167_sub2_22_.aShortArray9168 = class167_sub2_23_.aShortArray9168 = new short[i_32_];
			} else {
				class167_sub2_22_.aShortArray9164 = class167_sub2_23_.aShortArray9164;
				class167_sub2_22_.aShortArray9167 = class167_sub2_23_.aShortArray9167;
				class167_sub2_22_.aShortArray9168 = class167_sub2_23_.aShortArray9168;
			}
			if (aClass367_9172 != null) {
				if (class167_sub2_23_.aClass367_9172 == null)
					class167_sub2_23_.aClass367_9172 = new Class367();
				Class367 class367 = (class167_sub2_22_.aClass367_9172 = class167_sub2_23_.aClass367_9172);
				if (class367.aShortArray3879 == null || class367.aShortArray3879.length < anInt9163) {
					int i_33_ = anInt9163;
					class367.aShortArray3879 = new short[i_33_];
					class367.aShortArray3877 = new short[i_33_];
					class367.aShortArray3876 = new short[i_33_];
					class367.aByteArray3878 = new byte[i_33_];
				}
				for (int i_34_ = 0; i_34_ < anInt9163; i_34_++) {
					class167_sub2_22_.aShortArray9164[i_34_] = aShortArray9164[i_34_];
					class167_sub2_22_.aShortArray9167[i_34_] = aShortArray9167[i_34_];
					class167_sub2_22_.aShortArray9168[i_34_] = aShortArray9168[i_34_];
					class367.aShortArray3879[i_34_] = aClass367_9172.aShortArray3879[i_34_];
					class367.aShortArray3877[i_34_] = aClass367_9172.aShortArray3877[i_34_];
					class367.aShortArray3876[i_34_] = aClass367_9172.aShortArray3876[i_34_];
					class367.aByteArray3878[i_34_] = aClass367_9172.aByteArray3878[i_34_];
				}
			} else {
				class167_sub2_22_.aClass367_9172 = null;
				for (int i_35_ = 0; i_35_ < anInt9163; i_35_++) {
					class167_sub2_22_.aShortArray9164[i_35_] = aShortArray9164[i_35_];
					class167_sub2_22_.aShortArray9167[i_35_] = aShortArray9167[i_35_];
					class167_sub2_22_.aShortArray9168[i_35_] = aShortArray9168[i_35_];
				}
			}
			class167_sub2_22_.aByteArray9169 = aByteArray9169;
		} else {
			class167_sub2_22_.aClass367_9172 = aClass367_9172;
			class167_sub2_22_.aShortArray9164 = aShortArray9164;
			class167_sub2_22_.aShortArray9167 = aShortArray9167;
			class167_sub2_22_.aShortArray9168 = aShortArray9168;
			class167_sub2_22_.aByteArray9169 = aByteArray9169;
		}
		if (Class347.method6012(i, anInt9185)) {
			class167_sub2_22_.aClass357_9224 = class167_sub2_23_.aClass357_9224;
			class167_sub2_22_.aClass357_9224.anInterface36_3726 = aClass357_9224.anInterface36_3726;
			class167_sub2_22_.aClass357_9224.aBool3725 = aClass357_9224.aBool3725;
			class167_sub2_22_.aClass357_9224.aBool3724 = true;
		} else if (Class347.method6007(i, anInt9185))
			class167_sub2_22_.aClass357_9224 = aClass357_9224;
		else
			class167_sub2_22_.aClass357_9224 = null;
		if (Class347.method6047(i, anInt9185)) {
			if (class167_sub2_23_.aFloatArray9194 == null || class167_sub2_23_.aFloatArray9194.length < anInt9155) {
				int i_36_ = anInt9163;
				class167_sub2_22_.aFloatArray9194 = class167_sub2_23_.aFloatArray9194 = new float[i_36_];
				class167_sub2_22_.aFloatArray9171 = class167_sub2_23_.aFloatArray9171 = new float[i_36_];
			} else {
				class167_sub2_22_.aFloatArray9194 = class167_sub2_23_.aFloatArray9194;
				class167_sub2_22_.aFloatArray9171 = class167_sub2_23_.aFloatArray9171;
			}
			for (int i_37_ = 0; i_37_ < anInt9163; i_37_++) {
				class167_sub2_22_.aFloatArray9194[i_37_] = aFloatArray9194[i_37_];
				class167_sub2_22_.aFloatArray9171[i_37_] = aFloatArray9171[i_37_];
			}
		} else {
			class167_sub2_22_.aFloatArray9194 = aFloatArray9194;
			class167_sub2_22_.aFloatArray9171 = aFloatArray9171;
		}
		if (Class347.method6014(i, anInt9185)) {
			class167_sub2_22_.aClass357_9187 = class167_sub2_23_.aClass357_9187;
			class167_sub2_22_.aClass357_9187.anInterface36_3726 = aClass357_9187.anInterface36_3726;
			class167_sub2_22_.aClass357_9187.aBool3725 = aClass357_9187.aBool3725;
			class167_sub2_22_.aClass357_9187.aBool3724 = true;
		} else if (Class347.method6009(i, anInt9185))
			class167_sub2_22_.aClass357_9187 = aClass357_9187;
		else
			class167_sub2_22_.aClass357_9187 = null;
		if (Class347.method6081(i, anInt9185)) {
			if (class167_sub2_23_.aShortArray9161 == null || class167_sub2_23_.aShortArray9161.length < anInt9155) {
				int i_38_ = anInt9155;
				class167_sub2_22_.aShortArray9161 = class167_sub2_23_.aShortArray9161 = new short[i_38_];
				class167_sub2_22_.aShortArray9217 = class167_sub2_23_.aShortArray9217 = new short[i_38_];
				class167_sub2_22_.aShortArray9179 = class167_sub2_23_.aShortArray9179 = new short[i_38_];
			} else {
				class167_sub2_22_.aShortArray9161 = class167_sub2_23_.aShortArray9161;
				class167_sub2_22_.aShortArray9217 = class167_sub2_23_.aShortArray9217;
				class167_sub2_22_.aShortArray9179 = class167_sub2_23_.aShortArray9179;
			}
			for (int i_39_ = 0; i_39_ < anInt9155; i_39_++) {
				class167_sub2_22_.aShortArray9161[i_39_] = aShortArray9161[i_39_];
				class167_sub2_22_.aShortArray9217[i_39_] = aShortArray9217[i_39_];
				class167_sub2_22_.aShortArray9179[i_39_] = aShortArray9179[i_39_];
			}
		} else {
			class167_sub2_22_.aShortArray9161 = aShortArray9161;
			class167_sub2_22_.aShortArray9217 = aShortArray9217;
			class167_sub2_22_.aShortArray9179 = aShortArray9179;
		}
		if (Class347.method6015(i, anInt9185)) {
			class167_sub2_22_.aClass336_9183 = class167_sub2_23_.aClass336_9183;
			class167_sub2_22_.aClass336_9183.anInterface40_3561 = aClass336_9183.anInterface40_3561;
			class167_sub2_22_.aClass336_9183.aBool3564 = aClass336_9183.aBool3564;
			class167_sub2_22_.aClass336_9183.aBool3563 = true;
		} else if (Class347.method6010(i, anInt9185))
			class167_sub2_22_.aClass336_9183 = aClass336_9183;
		else
			class167_sub2_22_.aClass336_9183 = null;
		if (Class347.method6003(i, anInt9185)) {
			if (class167_sub2_23_.aShortArray9189 == null || class167_sub2_23_.aShortArray9189.length < anInt9155) {
				int i_40_ = anInt9155;
				class167_sub2_22_.aShortArray9189 = class167_sub2_23_.aShortArray9189 = new short[i_40_];
			} else
				class167_sub2_22_.aShortArray9189 = class167_sub2_23_.aShortArray9189;
			for (int i_41_ = 0; i_41_ < anInt9155; i_41_++)
				class167_sub2_22_.aShortArray9189[i_41_] = aShortArray9189[i_41_];
		} else
			class167_sub2_22_.aShortArray9189 = aShortArray9189;
		if (Class347.method6004(i, anInt9185)) {
			if (class167_sub2_23_.aClass337Array9212 == null || class167_sub2_23_.aClass337Array9212.length < anInt9210) {
				int i_42_ = anInt9210;
				class167_sub2_22_.aClass337Array9212 = class167_sub2_23_.aClass337Array9212 = new Class337[i_42_];
				for (int i_43_ = 0; i_43_ < anInt9210; i_43_++)
					class167_sub2_22_.aClass337Array9212[i_43_] = aClass337Array9212[i_43_].method5937();
			} else {
				class167_sub2_22_.aClass337Array9212 = class167_sub2_23_.aClass337Array9212;
				for (int i_44_ = 0; i_44_ < anInt9210; i_44_++)
					class167_sub2_22_.aClass337Array9212[i_44_].method5936(aClass337Array9212[i_44_]);
			}
		} else
			class167_sub2_22_.aClass337Array9212 = aClass337Array9212;
		class167_sub2_22_.aClass371Array9211 = aClass371Array9211;
		if (aBool9215) {
			class167_sub2_22_.anInt9192 = anInt9192;
			class167_sub2_22_.anInt9193 = anInt9193;
			class167_sub2_22_.anInt9197 = anInt9197;
			class167_sub2_22_.anInt9165 = anInt9165;
			class167_sub2_22_.anInt9195 = anInt9195;
			class167_sub2_22_.anInt9196 = anInt9196;
			class167_sub2_22_.anInt9154 = anInt9154;
			class167_sub2_22_.anInt9200 = anInt9200;
			class167_sub2_22_.aBool9215 = true;
		} else
			class167_sub2_22_.aBool9215 = false;
		if (aBool9201) {
			class167_sub2_22_.anInt9202 = anInt9202;
			class167_sub2_22_.aBool9201 = true;
		} else
			class167_sub2_22_.aBool9201 = false;
		class167_sub2_22_.anIntArrayArray9190 = anIntArrayArray9190;
		class167_sub2_22_.anIntArrayArray9181 = anIntArrayArray9181;
		class167_sub2_22_.anIntArrayArray9213 = anIntArrayArray9213;
		class167_sub2_22_.aShortArray9207 = aShortArray9207;
		class167_sub2_22_.anIntArray9199 = anIntArray9199;
		class167_sub2_22_.aShortArray9166 = aShortArray9166;
		class167_sub2_22_.aShortArray9178 = aShortArray9178;
		class167_sub2_22_.aShortArray9162 = aShortArray9162;
		class167_sub2_22_.aShortArray9170 = aShortArray9170;
		class167_sub2_22_.anIntArray9203 = anIntArray9203;
		class167_sub2_22_.anIntArray9205 = anIntArray9205;
		class167_sub2_22_.anIntArray9204 = anIntArray9204;
		class167_sub2_22_.aClass184Array9208 = aClass184Array9208;
		class167_sub2_22_.aClass143Array9209 = aClass143Array9209;
		return class167_sub2_22_;
	}

	public int method2683() {
		return anInt9152;
	}

	public void method2769(int i) {
		if (aClass357_9186 != null)
			aClass357_9186.aBool3724 = Class347.method6011(i, anInt9185);
		if (aClass357_9187 != null)
			aClass357_9187.aBool3724 = Class347.method6014(i, anInt9185);
		if (aClass357_9150 != null)
			aClass357_9150.aBool3724 = Class347.method6092(i, anInt9185);
		if (aClass357_9224 != null)
			aClass357_9224.aBool3724 = Class347.method6012(i, anInt9185);
		anInt9152 = i;
		if (aClass367_9172 != null && (anInt9152 & 0x10000) == 0) {
			aShortArray9164 = aClass367_9172.aShortArray3879;
			aShortArray9167 = aClass367_9172.aShortArray3877;
			aShortArray9168 = aClass367_9172.aShortArray3876;
			aByteArray9169 = aClass367_9172.aByteArray3878;
			aClass367_9172 = null;
		}
		aBool9182 = true;
		method14600();
	}

	short method14545(Class179 class179, int i, int i_45_, long l, int i_46_, int i_47_, int i_48_, int i_49_, float f, float f_50_) {
		int i_51_ = anIntArray9199[i];
		int i_52_ = anIntArray9199[i + 1];
		int i_53_ = 0;
		for (int i_54_ = i_51_; i_54_ < i_52_; i_54_++) {
			if (aShortArray9207[i_54_] == 0) {
				i_53_ = i_54_;
				break;
			}
			int i_55_ = (aShortArray9207[i_54_] & 0xffff) - 1;
			if (aLongArray9214[i_54_] == l)
				return (short) i_55_;
		}
		aShortArray9207[i_53_] = (short) (anInt9163 + 1);
		aLongArray9214[i_53_] = l;
		aShortArray9178[anInt9163] = (short) i_45_;
		aShortArray9166[anInt9163] = (short) i;
		aShortArray9164[anInt9163] = (short) i_46_;
		aShortArray9167[anInt9163] = (short) i_47_;
		aShortArray9168[anInt9163] = (short) i_48_;
		aByteArray9169[anInt9163] = (byte) i_49_;
		aFloatArray9194[anInt9163] = f;
		aFloatArray9171[anInt9163] = f_50_;
		return (short) anInt9163++;
	}

	public Class167 method2681(byte i, int i_56_, boolean bool) {
		boolean bool_57_ = false;
		Class167_Sub2 class167_sub2_58_;
		Class167_Sub2 class167_sub2_59_;
		if (i > 0 && i <= 8) {
			class167_sub2_59_ = aClass178_Sub2_9153.aClass167_Sub2Array9595[i - 1];
			class167_sub2_58_ = aClass178_Sub2_9153.aClass167_Sub2Array9700[i - 1];
			bool_57_ = true;
		} else
			class167_sub2_58_ = class167_sub2_59_ = new Class167_Sub2(aClass178_Sub2_9153, 0, 0, true, false);
		return method14544(class167_sub2_58_, class167_sub2_59_, i_56_, bool_57_, bool);
	}

	public int method2716() {
		if (!aBool9215)
			method14569();
		return anInt9154;
	}

	int method14546(int i, short i_60_, int i_61_) {
		int i_62_ = aClass178_Sub2_9153.anIntArray9537[method14563(i, i_61_)];
		if (i_60_ != -1) {
			Class177 class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_60_ & 0xffff, -1679652188);
			int i_63_ = class177.aByte1912 & 0xff;
			if (i_63_ != 0) {
				int i_64_ = 131586 * i_61_;
				if (i_61_ < 0)
					i_64_ = 0;
				else if (i_61_ > 127)
					i_64_ = 16777215;
				else
					i_64_ = 131586 * i_61_;
				if (i_63_ == 256)
					i_62_ = i_64_;
				else {
					int i_65_ = i_63_;
					int i_66_ = 256 - i_63_;
					i_62_ = ((((i_64_ & 0xff00ff) * i_65_ + (i_62_ & 0xff00ff) * i_66_) & ~0xff00ff) + (((i_64_ & 0xff00) * i_65_ + (i_62_ & 0xff00) * i_66_) & 0xff0000)) >> 8;
				}
			}
			int i_67_ = class177.aByte1883 & 0xff;
			if (i_67_ != 0) {
				i_67_ += 256;
				int i_68_ = ((i_62_ & 0xff0000) >> 16) * i_67_;
				if (i_68_ > 65535)
					i_68_ = 65535;
				int i_69_ = ((i_62_ & 0xff00) >> 8) * i_67_;
				if (i_69_ > 65535)
					i_69_ = 65535;
				int i_70_ = (i_62_ & 0xff) * i_67_;
				if (i_70_ > 65535)
					i_70_ = 65535;
				i_62_ = (i_68_ << 8 & 0xff0000) + (i_69_ & 0xff00) + (i_70_ >> 8);
			}
		}
		return i_62_ & 0xffffff;
	}

	public int method2814() {
		if (!aBool9215)
			method14569();
		return anInt9195;
	}

	void method14547() {
		if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method14548() {
		if ((anInt9185 & 0x37) != 0) {
			if (aClass357_9224 != null)
				aClass357_9224.aBool3725 = false;
		} else if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method2795(int i, int i_71_, int i_72_, int i_73_) {
		if (i == 0) {
			int i_74_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_75_ = 0; i_75_ < anInt9157; i_75_++) {
				anInt9221 += anIntArray9158[i_75_];
				anInt9222 += anIntArray9159[i_75_];
				anInt9151 += anIntArray9160[i_75_];
				i_74_++;
			}
			if (i_74_ > 0) {
				anInt9221 = anInt9221 / i_74_ + i_71_;
				anInt9222 = anInt9222 / i_74_ + i_72_;
				anInt9151 = anInt9151 / i_74_ + i_73_;
			} else {
				anInt9221 = i_71_;
				anInt9222 = i_72_;
				anInt9151 = i_73_;
			}
		} else if (i == 1) {
			for (int i_76_ = 0; i_76_ < anInt9157; i_76_++) {
				anIntArray9158[i_76_] += i_71_;
				anIntArray9159[i_76_] += i_72_;
				anIntArray9160[i_76_] += i_73_;
			}
		} else if (i == 2) {
			for (int i_77_ = 0; i_77_ < anInt9157; i_77_++) {
				anIntArray9158[i_77_] -= anInt9221;
				anIntArray9159[i_77_] -= anInt9222;
				anIntArray9160[i_77_] -= anInt9151;
				if (i_73_ != 0) {
					int i_78_ = Class433.anIntArray4880[i_73_];
					int i_79_ = Class433.anIntArray4881[i_73_];
					int i_80_ = ((anIntArray9159[i_77_] * i_78_ + anIntArray9158[i_77_] * i_79_ + 16383) >> 14);
					anIntArray9159[i_77_] = (anIntArray9159[i_77_] * i_79_ - anIntArray9158[i_77_] * i_78_ + 16383) >> 14;
					anIntArray9158[i_77_] = i_80_;
				}
				if (i_71_ != 0) {
					int i_81_ = Class433.anIntArray4880[i_71_];
					int i_82_ = Class433.anIntArray4881[i_71_];
					int i_83_ = ((anIntArray9159[i_77_] * i_82_ - anIntArray9160[i_77_] * i_81_ + 16383) >> 14);
					anIntArray9160[i_77_] = (anIntArray9159[i_77_] * i_81_ + anIntArray9160[i_77_] * i_82_ + 16383) >> 14;
					anIntArray9159[i_77_] = i_83_;
				}
				if (i_72_ != 0) {
					int i_84_ = Class433.anIntArray4880[i_72_];
					int i_85_ = Class433.anIntArray4881[i_72_];
					int i_86_ = ((anIntArray9160[i_77_] * i_84_ + anIntArray9158[i_77_] * i_85_ + 16383) >> 14);
					anIntArray9160[i_77_] = (anIntArray9160[i_77_] * i_85_ - anIntArray9158[i_77_] * i_84_ + 16383) >> 14;
					anIntArray9158[i_77_] = i_86_;
				}
				anIntArray9158[i_77_] += anInt9221;
				anIntArray9159[i_77_] += anInt9222;
				anIntArray9160[i_77_] += anInt9151;
			}
		} else if (i == 3) {
			for (int i_87_ = 0; i_87_ < anInt9157; i_87_++) {
				anIntArray9158[i_87_] -= anInt9221;
				anIntArray9159[i_87_] -= anInt9222;
				anIntArray9160[i_87_] -= anInt9151;
				anIntArray9158[i_87_] = anIntArray9158[i_87_] * i_71_ / 128;
				anIntArray9159[i_87_] = anIntArray9159[i_87_] * i_72_ / 128;
				anIntArray9160[i_87_] = anIntArray9160[i_87_] * i_73_ / 128;
				anIntArray9158[i_87_] += anInt9221;
				anIntArray9159[i_87_] += anInt9222;
				anIntArray9160[i_87_] += anInt9151;
			}
		} else if (i == 5) {
			for (int i_88_ = 0; i_88_ < anInt9155; i_88_++) {
				int i_89_ = (aByteArray9176[i_88_] & 0xff) + i_71_ * 8;
				if (i_89_ < 0)
					i_89_ = 0;
				else if (i_89_ > 255)
					i_89_ = 255;
				aByteArray9176[i_88_] = (byte) i_89_;
			}
			if (aClass371Array9211 != null) {
				for (int i_90_ = 0; i_90_ < anInt9210; i_90_++) {
					Class371 class371 = aClass371Array9211[i_90_];
					Class337 class337 = aClass337Array9212[i_90_];
					class337.anInt3565 = (class337.anInt3565 & 0xffffff | (255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24));
				}
			}
			method14547();
		} else if (i == 7) {
			for (int i_91_ = 0; i_91_ < anInt9155; i_91_++) {
				int i_92_ = aShortArray9175[i_91_] & 0xffff;
				int i_93_ = i_92_ >> 10 & 0x3f;
				int i_94_ = i_92_ >> 7 & 0x7;
				int i_95_ = i_92_ & 0x7f;
				i_93_ = i_93_ + i_71_ & 0x3f;
				i_94_ += i_72_ / 4;
				if (i_94_ < 0)
					i_94_ = 0;
				else if (i_94_ > 7)
					i_94_ = 7;
				i_95_ += i_73_;
				if (i_95_ < 0)
					i_95_ = 0;
				else if (i_95_ > 127)
					i_95_ = 127;
				aShortArray9175[i_91_] = (short) (i_93_ << 10 | i_94_ << 7 | i_95_);
			}
			if (aClass371Array9211 != null) {
				for (int i_96_ = 0; i_96_ < anInt9210; i_96_++) {
					Class371 class371 = aClass371Array9211[i_96_];
					Class337 class337 = aClass337Array9212[i_96_];
					class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
				}
			}
			method14547();
		} else if (i == 8) {
			for (int i_97_ = 0; i_97_ < anInt9210; i_97_++) {
				Class337 class337 = aClass337Array9212[i_97_];
				class337.anInt3568 += i_71_;
				class337.anInt3569 += i_72_;
			}
		} else if (i == 10) {
			for (int i_98_ = 0; i_98_ < anInt9210; i_98_++) {
				Class337 class337 = aClass337Array9212[i_98_];
				class337.anInt3566 = class337.anInt3566 * i_71_ >> 7;
				class337.anInt3567 = class337.anInt3567 * i_72_ >> 7;
			}
		} else if (i == 9) {
			for (int i_99_ = 0; i_99_ < anInt9210; i_99_++) {
				Class337 class337 = aClass337Array9212[i_99_];
				class337.anInt3570 = class337.anInt3570 + i_71_ & 0x3fff;
			}
		}
	}

	public Class184[] method2823() {
		return aClass184Array9208;
	}

	public void method2755(int i) {
		int i_100_ = Class433.anIntArray4880[i];
		int i_101_ = Class433.anIntArray4881[i];
		for (int i_102_ = 0; i_102_ < anInt9157; i_102_++) {
			int i_103_ = ((anIntArray9160[i_102_] * i_100_ + anIntArray9158[i_102_] * i_101_) >> 14);
			anIntArray9160[i_102_] = (anIntArray9160[i_102_] * i_101_ - anIntArray9158[i_102_] * i_100_) >> 14;
			anIntArray9158[i_102_] = i_103_;
		}
		for (int i_104_ = 0; i_104_ < anInt9163; i_104_++) {
			int i_105_ = ((aShortArray9168[i_104_] * i_100_ + aShortArray9164[i_104_] * i_101_) >> 14);
			aShortArray9168[i_104_] = (short) ((aShortArray9168[i_104_] * i_101_ - aShortArray9164[i_104_] * i_100_) >> 14);
			aShortArray9164[i_104_] = (short) i_105_;
		}
		method14577();
		method14548();
		aBool9215 = false;
	}

	public void method2845(int i) {
		int i_106_ = Class433.anIntArray4880[i];
		int i_107_ = Class433.anIntArray4881[i];
		for (int i_108_ = 0; i_108_ < anInt9157; i_108_++) {
			int i_109_ = ((anIntArray9159[i_108_] * i_107_ - anIntArray9160[i_108_] * i_106_) >> 14);
			anIntArray9160[i_108_] = (anIntArray9159[i_108_] * i_106_ + anIntArray9160[i_108_] * i_107_) >> 14;
			anIntArray9159[i_108_] = i_109_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2688(int i) {
		int i_110_ = Class433.anIntArray4880[i];
		int i_111_ = Class433.anIntArray4881[i];
		for (int i_112_ = 0; i_112_ < anInt9157; i_112_++) {
			int i_113_ = ((anIntArray9159[i_112_] * i_110_ + anIntArray9158[i_112_] * i_111_) >> 14);
			anIntArray9159[i_112_] = (anIntArray9159[i_112_] * i_111_ - anIntArray9158[i_112_] * i_110_) >> 14;
			anIntArray9158[i_112_] = i_113_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2689(int i, int i_114_, int i_115_) {
		for (int i_116_ = 0; i_116_ < anInt9157; i_116_++) {
			if (i != 0)
				anIntArray9158[i_116_] += i;
			if (i_114_ != 0)
				anIntArray9159[i_116_] += i_114_;
			if (i_115_ != 0)
				anIntArray9160[i_116_] += i_115_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2690() {
		for (int i = 0; i < anInt9157; i++)
			anIntArray9160[i] = -anIntArray9160[i];
		for (int i = 0; i < anInt9163; i++)
			aShortArray9168[i] = (short) -aShortArray9168[i];
		for (int i = 0; i < anInt9155; i++) {
			short i_117_ = aShortArray9161[i];
			aShortArray9161[i] = aShortArray9179[i];
			aShortArray9179[i] = i_117_;
		}
		method14577();
		method14548();
		method14550();
		aBool9215 = false;
	}

	public void method2691(int i, int i_118_, int i_119_) {
		for (int i_120_ = 0; i_120_ < anInt9157; i_120_++) {
			if (i != 128)
				anIntArray9158[i_120_] = anIntArray9158[i_120_] * i >> 7;
			if (i_118_ != 128)
				anIntArray9159[i_120_] = anIntArray9159[i_120_] * i_118_ >> 7;
			if (i_119_ != 128)
				anIntArray9160[i_120_] = anIntArray9160[i_120_] * i_119_ >> 7;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2692(int i, int i_121_, Class142 class142, Class142 class142_122_, int i_123_, int i_124_, int i_125_) {
		if (!aBool9215)
			method14569();
		int i_126_ = i_123_ + anInt9197;
		int i_127_ = i_123_ + anInt9165;
		int i_128_ = i_125_ + anInt9154;
		int i_129_ = i_125_ + anInt9200;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_126_ >= 0 && ((i_127_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_128_ >= 0 && ((i_129_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_122_ == null || (i_126_ < 0 || ((i_127_ + class142_122_.anInt1682 * 341909049 >> class142_122_.anInt1680 * -1193058675) >= class142_122_.anInt1683 * 692304099) || i_128_ < 0 || ((i_129_ + class142_122_.anInt1682 * 341909049 >> class142_122_.anInt1680 * -1193058675) >= class142_122_.anInt1681 * 452998539)))
					return;
			} else {
				i_126_ >>= class142.anInt1680 * -1193058675;
				i_127_ = (i_127_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_128_ >>= class142.anInt1680 * -1193058675;
				i_129_ = (i_129_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_126_, i_128_, 1938705441) == i_124_ && (class142.method2321(i_127_, i_128_, 1874622685) == i_124_) && (class142.method2321(i_126_, i_129_, 1603911783) == i_124_) && (class142.method2321(i_127_, i_129_, 1953183779) == i_124_))
					return;
			}
			if (i == 1) {
				for (int i_130_ = 0; i_130_ < anInt9157; i_130_++)
					anIntArray9159[i_130_] = (anIntArray9159[i_130_] + class142.method2327((anIntArray9158[i_130_] + i_123_), (anIntArray9160[i_130_] + i_125_), 1947154686) - i_124_);
			} else if (i == 2) {
				int i_131_ = anInt9195;
				if (i_131_ == 0)
					return;
				for (int i_132_ = 0; i_132_ < anInt9157; i_132_++) {
					int i_133_ = (anIntArray9159[i_132_] << 16) / i_131_;
					if (i_133_ < i_121_)
						anIntArray9159[i_132_] = (anIntArray9159[i_132_] + (class142.method2327((anIntArray9158[i_132_] + i_123_), (anIntArray9160[i_132_] + i_125_), 55279870) - i_124_) * (i_121_ - i_133_) / i_121_);
				}
			} else if (i == 3) {
				int i_134_ = (i_121_ & 0xff) * 16;
				int i_135_ = (i_121_ >> 8 & 0xff) * 16;
				int i_136_ = (i_121_ >> 16 & 0xff) << 6;
				int i_137_ = (i_121_ >> 24 & 0xff) << 6;
				if (i_123_ - (i_134_ >> 1) < 0 || (i_123_ + (i_134_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_125_ - (i_135_ >> 1) < 0 || (i_125_ + (i_135_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_123_, i_124_, i_125_, i_134_, i_135_, i_136_, i_137_);
			} else if (i == 4) {
				int i_138_ = anInt9196 - anInt9195;
				for (int i_139_ = 0; i_139_ < anInt9157; i_139_++)
					anIntArray9159[i_139_] = (anIntArray9159[i_139_] + (class142_122_.method2327((anIntArray9158[i_139_] + i_123_), (anIntArray9160[i_139_] + i_125_), 1198840091) - i_124_) + i_138_);
			} else if (i == 5) {
				int i_140_ = anInt9196 - anInt9195;
				for (int i_141_ = 0; i_141_ < anInt9157; i_141_++) {
					int i_142_ = anIntArray9158[i_141_] + i_123_;
					int i_143_ = anIntArray9160[i_141_] + i_125_;
					int i_144_ = class142.method2327(i_142_, i_143_, 1246979633);
					int i_145_ = class142_122_.method2327(i_142_, i_143_, 487560897);
					int i_146_ = i_144_ - i_145_ - i_121_;
					anIntArray9159[i_141_] = ((anIntArray9159[i_141_] << 8) / i_140_ * i_146_ >> 8) - (i_124_ - i_144_);
				}
			}
			method14577();
			aBool9215 = false;
		}
	}

	void method14549() {
		if (aClass336_9183 != null)
			aClass336_9183.aBool3564 = false;
	}

	public void method2719() {
		if (!aBool9201) {
			if (!aBool9215)
				method14569();
			anInt9202 = anInt9195;
			aBool9201 = true;
		}
	}

	void method14550() {
		if (aClass336_9183 != null)
			aClass336_9183.aBool3564 = false;
	}

	public int method2834() {
		if (!aBool9215)
			method14569();
		return anInt9192;
	}

	public int method2712() {
		if (!aBool9215)
			method14569();
		return anInt9197;
	}

	public int method2713() {
		if (!aBool9215)
			method14569();
		return anInt9165;
	}

	public void method2836() {
		for (int i = 0; i < anInt9157; i++)
			anIntArray9160[i] = -anIntArray9160[i];
		for (int i = 0; i < anInt9163; i++)
			aShortArray9168[i] = (short) -aShortArray9168[i];
		for (int i = 0; i < anInt9155; i++) {
			short i_147_ = aShortArray9161[i];
			aShortArray9161[i] = aShortArray9179[i];
			aShortArray9179[i] = i_147_;
		}
		method14577();
		method14548();
		method14550();
		aBool9215 = false;
	}

	public int method2793() {
		if (!aBool9215)
			method14569();
		return anInt9193;
	}

	static float[] method14551(float[] fs, int i) {
		float[] fs_148_ = new float[i];
		System.arraycopy(fs, 0, fs_148_, 0, i);
		return fs_148_;
	}

	public int method2717() {
		if (!aBool9215)
			method14569();
		return anInt9200;
	}

	public int method2718() {
		if (!aBool9201)
			method2719();
		return anInt9202;
	}

	public void method2753(int i) {
		int i_149_ = Class433.anIntArray4880[i];
		int i_150_ = Class433.anIntArray4881[i];
		for (int i_151_ = 0; i_151_ < anInt9157; i_151_++) {
			int i_152_ = ((anIntArray9159[i_151_] * i_150_ - anIntArray9160[i_151_] * i_149_) >> 14);
			anIntArray9160[i_151_] = (anIntArray9159[i_151_] * i_149_ + anIntArray9160[i_151_] * i_150_) >> 14;
			anIntArray9159[i_151_] = i_152_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2827(int i) {
		aShort9149 = (short) i;
		method14547();
	}

	public int method2792() {
		if (!aBool9215)
			method14569();
		return anInt9193;
	}

	public boolean method2731() {
		return aBool9191;
	}

	public int method2723() {
		return aShort9206;
	}

	public byte[] method2820() {
		return aByteArray9176;
	}

	Class167_Sub2(Class178_Sub2 class178_sub2, Class179 class179, int i, int i_153_, int i_154_, int i_155_) {
		this(class178_sub2, i, i_155_, true, false);
		Class172 class172 = class178_sub2.aClass172_1916;
		Interface46 interface46 = class178_sub2.anInterface46_1925;
		int[] is = new int[class179.anInt1964];
		anIntArray9199 = new int[class179.anInt1991 + 1];
		for (int i_156_ = 0; i_156_ < class179.anInt1964; i_156_++) {
			if (class179.aByteArray1971 == null || class179.aByteArray1971[i_156_] != 2) {
				if (class179.aShortArray1959 != null && class179.aShortArray1959[i_156_] != -1) {
					Class177 class177 = class172.method2895((class179.aShortArray1959[i_156_] & 0xffff), -1911177006);
					if (((anInt9185 & 0x40) == 0 || !class177.aBool1876) && class177.aBool1909)
						continue;
				}
				is[anInt9155++] = i_156_;
				anIntArray9199[class179.aShortArray1949[i_156_]]++;
				anIntArray9199[class179.aShortArray1966[i_156_]]++;
				anIntArray9199[class179.aShortArray1967[i_156_]]++;
			}
		}
		anInt9174 = anInt9155;
		long[] ls = new long[anInt9155];
		boolean bool = (anInt9152 & 0x100) != 0;
		for (int i_157_ = 0; i_157_ < anInt9155; i_157_++) {
			int i_158_ = is[i_157_];
			Class177 class177 = null;
			int i_159_ = 0;
			int i_160_ = 0;
			int i_161_ = 0;
			int i_162_ = 0;
			if (class179.aClass176Array1997 != null) {
				boolean bool_163_ = false;
				for (int i_164_ = 0; i_164_ < class179.aClass176Array1997.length; i_164_++) {
					Class176 class176 = class179.aClass176Array1997[i_164_];
					if (i_158_ == class176.anInt1858 * -421198465) {
						Class386 class386 = interface46.method344((class176.anInt1861 * 837482349), (byte) -108);
						if (class386.aBool4006)
							bool_163_ = true;
						if (class386.anInt4000 * -1163385649 != -1) {
							Class177 class177_165_ = class172.method2895((class386.anInt4000 * -1163385649), -1654271002);
							if (class177_165_.aClass593_1884 == Class593.aClass593_7811)
								aBool9184 = true;
						}
					}
				}
				if (bool_163_) {
					ls[i_157_] = 9223372036854775807L;
					anInt9174--;
					continue;
				}
			}
			if (class179.aClass184Array1995 != null) {
				boolean bool_166_ = false;
				for (int i_167_ = 0; i_167_ < class179.aClass184Array1995.length; i_167_++) {
					Class184 class184 = class179.aClass184Array1995[i_167_];
					if (i_158_ == class184.anInt2123 * 914118525) {
						Class400 class400 = (aClass178_Sub2_9153.anInterface48_1926.method348(class184.anInt2112 * -1864996007, 2003145818));
						if (class400.aBool4119)
							bool_166_ = true;
					}
				}
				if (bool_166_) {
					ls[i_157_] = 9223372036854775807L;
					anInt9174--;
					continue;
				}
			}
			int i_168_ = -1;
			if (class179.aShortArray1959 != null) {
				i_168_ = class179.aShortArray1959[i_158_];
				if (i_168_ != -1) {
					class177 = class172.method2895(i_168_ & 0xffff, -873261246);
					if ((anInt9185 & 0x40) == 0 || !class177.aBool1876) {
						i_161_ = class177.aByte1905;
						i_162_ = class177.aByte1906;
					} else {
						i_168_ = -1;
						class177 = null;
					}
				}
			}
			boolean bool_169_ = ((class179.aByteArray1975 != null && class179.aByteArray1975[i_158_] != 0) || (class177 != null && class177.aClass593_1884 != Class593.aClass593_7813));
			if ((bool || bool_169_) && class179.aByteArray1972 != null)
				i_159_ += class179.aByteArray1972[i_158_] << 17;
			if (bool_169_)
				i_159_ += 65536;
			i_159_ += (i_161_ & 0xff) << 8;
			i_159_ += i_162_ & 0xff;
			i_160_ += (i_168_ & 0xffff) << 16;
			i_160_ += i_157_ & 0xffff;
			ls[i_157_] = ((long) i_159_ << 32) + (long) i_160_;
			aBool9184 |= bool_169_;
			Class167_Sub2 class167_sub2_170_ = this;
			class167_sub2_170_.aBool9191 = (class167_sub2_170_.aBool9191 | (class177 != null && (class177.aByte1885 != 0 || class177.aByte1886 != 0)));
		}
		Class528.method8734(ls, is, -1893893884);
		anInt9156 = class179.anInt1953;
		anInt9157 = class179.anInt1991;
		anIntArray9158 = class179.anIntArray1981;
		anIntArray9159 = class179.anIntArray1973;
		anIntArray9160 = class179.anIntArray1957;
		aShortArray9162 = class179.aShortArray1965;
		Class373[] class373s = new Class373[anInt9157];
		aClass184Array9208 = class179.aClass184Array1995;
		aClass143Array9209 = class179.aClass143Array1996;
		if (class179.aClass176Array1997 != null) {
			anInt9210 = class179.aClass176Array1997.length;
			aClass371Array9211 = new Class371[anInt9210];
			aClass337Array9212 = new Class337[anInt9210];
			for (int i_171_ = 0; i_171_ < anInt9210; i_171_++) {
				Class176 class176 = class179.aClass176Array1997[i_171_];
				Class386 class386 = interface46.method344(class176.anInt1861 * 837482349, (byte) -101);
				int i_172_ = -1;
				for (int i_173_ = 0; i_173_ < anInt9155; i_173_++) {
					if (is[i_173_] == class176.anInt1858 * -421198465) {
						i_172_ = i_173_;
						break;
					}
				}
				if (i_172_ == -1)
					throw new RuntimeException();
				int i_174_ = ((Class710.anIntArray8839[(class179.aShortArray1974[class176.anInt1858 * -421198465]) & 0xffff]) & 0xffffff);
				i_174_ = i_174_ | 255 - (class179.aByteArray1975 != null ? (class179.aByteArray1975[class176.anInt1858 * -421198465]) : 0) << 24;
				aClass371Array9211[i_171_] = new Class371(i_172_, (class179.aShortArray1949[class176.anInt1858 * -421198465]), (class179.aShortArray1966[class176.anInt1858 * -421198465]), (class179.aShortArray1967[class176.anInt1858 * -421198465]), class386.anInt4004 * 2141519961, class386.anInt3999 * 1591166335, class386.anInt4000 * -1163385649, class386.anInt4005 * 1353343391, class386.anInt4003 * -56714871, class386.aBool4006, class386.aBool4001, class176.anInt1860 * 1648924969);
				aClass337Array9212[i_171_] = new Class337(i_174_);
			}
		}
		int i_175_ = anInt9155 * 3;
		aShortArray9166 = new short[i_175_];
		aShortArray9178 = new short[i_175_];
		aShortArray9164 = new short[i_175_];
		aShortArray9167 = new short[i_175_];
		aShortArray9168 = new short[i_175_];
		aByteArray9169 = new byte[i_175_];
		aFloatArray9194 = new float[i_175_];
		aFloatArray9171 = new float[i_175_];
		aShortArray9175 = new short[anInt9155];
		aByteArray9176 = new byte[anInt9155];
		aShortArray9161 = new short[anInt9155];
		aShortArray9217 = new short[anInt9155];
		aShortArray9179 = new short[anInt9155];
		aShortArray9189 = new short[anInt9155];
		if (class179.aShortArray1979 != null)
			aShortArray9170 = new short[anInt9155];
		aShort9149 = (short) i_153_;
		aShort9206 = (short) i_154_;
		aShortArray9207 = new short[i_175_];
		aLongArray9214 = new long[i_175_];
		int i_176_ = 0;
		for (int i_177_ = 0; i_177_ < class179.anInt1991; i_177_++) {
			int i_178_ = anIntArray9199[i_177_];
			anIntArray9199[i_177_] = i_176_;
			i_176_ += i_178_;
			class373s[i_177_] = new Class373();
		}
		anIntArray9199[class179.anInt1991] = i_176_;
		Class183 class183 = method2679(class179, is, anInt9155);
		Class370[] class370s = new Class370[class179.anInt1964];
		for (int i_179_ = 0; i_179_ < class179.anInt1964; i_179_++) {
			short i_180_ = class179.aShortArray1949[i_179_];
			short i_181_ = class179.aShortArray1966[i_179_];
			short i_182_ = class179.aShortArray1967[i_179_];
			int i_183_ = anIntArray9158[i_181_] - anIntArray9158[i_180_];
			int i_184_ = anIntArray9159[i_181_] - anIntArray9159[i_180_];
			int i_185_ = anIntArray9160[i_181_] - anIntArray9160[i_180_];
			int i_186_ = anIntArray9158[i_182_] - anIntArray9158[i_180_];
			int i_187_ = anIntArray9159[i_182_] - anIntArray9159[i_180_];
			int i_188_ = anIntArray9160[i_182_] - anIntArray9160[i_180_];
			int i_189_ = i_184_ * i_188_ - i_187_ * i_185_;
			int i_190_ = i_185_ * i_186_ - i_188_ * i_183_;
			int i_191_;
			for (i_191_ = i_183_ * i_187_ - i_186_ * i_184_; (i_189_ > 8192 || i_190_ > 8192 || i_191_ > 8192 || i_189_ < -8192 || i_190_ < -8192 || i_191_ < -8192); i_191_ >>= 1) {
				i_189_ >>= 1;
				i_190_ >>= 1;
			}
			int i_192_ = (int) Math.sqrt((double) (i_189_ * i_189_ + i_190_ * i_190_ + i_191_ * i_191_));
			if (i_192_ <= 0)
				i_192_ = 1;
			i_189_ = i_189_ * 256 / i_192_;
			i_190_ = i_190_ * 256 / i_192_;
			i_191_ = i_191_ * 256 / i_192_;
			byte i_193_ = (class179.aByteArray1971 == null ? (byte) 0 : class179.aByteArray1971[i_179_]);
			if (i_193_ == 0) {
				Class373 class373 = class373s[i_180_];
				class373.anInt3906 += i_189_;
				class373.anInt3904 += i_190_;
				class373.anInt3907 += i_191_;
				class373.anInt3905++;
				class373 = class373s[i_181_];
				class373.anInt3906 += i_189_;
				class373.anInt3904 += i_190_;
				class373.anInt3907 += i_191_;
				class373.anInt3905++;
				class373 = class373s[i_182_];
				class373.anInt3906 += i_189_;
				class373.anInt3904 += i_190_;
				class373.anInt3907 += i_191_;
				class373.anInt3905++;
			} else if (i_193_ == 1) {
				Class370 class370 = class370s[i_179_] = new Class370();
				class370.anInt3885 = i_189_;
				class370.anInt3886 = i_190_;
				class370.anInt3887 = i_191_;
			}
		}
		for (int i_194_ = 0; i_194_ < anInt9155; i_194_++) {
			int i_195_ = is[i_194_];
			int i_196_ = class179.aShortArray1974[i_195_] & 0xffff;
			int i_197_ = (class179.aByteArray1975 != null ? class179.aByteArray1975[i_195_] & 0xff : 0);
			short i_198_ = (class179.aShortArray1959 == null ? (short) -1 : class179.aShortArray1959[i_195_]);
			if (i_198_ != -1 && (anInt9185 & 0x40) != 0 && class172.method2895(i_198_, -809591449).aBool1876)
				i_198_ = (short) -1;
			float f = 0.0F;
			float f_199_ = 0.0F;
			float f_200_ = 0.0F;
			float f_201_ = 0.0F;
			float f_202_ = 0.0F;
			float f_203_ = 0.0F;
			long l;
			long l_204_;
			long l_205_;
			if (i_198_ != -1) {
				int i_206_ = (class179.aShortArray1989 != null ? class179.aShortArray1989[i_195_] : -1);
				if (i_206_ == 32766) {
					int i_207_ = class179.aByteArray1968[i_195_] & 0xff;
					int i_208_ = class179.aByteArray1969[i_195_] & 0xff;
					int i_209_ = class179.aByteArray1990[i_195_] & 0xff;
					i_207_ += (class179.anIntArray1958[class179.aShortArray1949[i_195_]]);
					l_205_ = (long) i_207_;
					i_208_ += (class179.anIntArray1958[class179.aShortArray1966[i_195_]]);
					l_204_ = (long) i_207_;
					i_209_ += (class179.anIntArray1958[class179.aShortArray1967[i_195_]]);
					l = (long) i_207_;
					f = class179.aFloatArray1962[i_207_];
					f_199_ = class179.aFloatArray1963[i_207_];
					f_200_ = class179.aFloatArray1962[i_208_];
					f_201_ = class179.aFloatArray1963[i_208_];
					f_202_ = class179.aFloatArray1962[i_209_];
					f_203_ = class179.aFloatArray1963[i_209_];
				} else if (i_206_ == -1) {
					f = 0.0F;
					f_199_ = 1.0F;
					l_205_ = 65535L;
					f_200_ = 1.0F;
					f_201_ = 1.0F;
					l_204_ = 131071L;
					f_202_ = 0.0F;
					f_203_ = 0.0F;
					l = 196607L;
				} else {
					i_206_ &= 0xffff;
					int i_210_ = 0;
					int i_211_ = 0;
					int i_212_ = 0;
					byte i_213_ = class179.aByteArray1983[i_206_];
					if (i_213_ == 0) {
						short i_214_ = class179.aShortArray1949[i_195_];
						short i_215_ = class179.aShortArray1966[i_195_];
						short i_216_ = class179.aShortArray1967[i_195_];
						short i_217_ = class179.aShortArray1977[i_206_];
						short i_218_ = class179.aShortArray1985[i_206_];
						short i_219_ = class179.aShortArray1986[i_206_];
						float f_220_ = (float) class179.anIntArray1981[i_217_];
						float f_221_ = (float) class179.anIntArray1973[i_217_];
						float f_222_ = (float) class179.anIntArray1957[i_217_];
						float f_223_ = (float) class179.anIntArray1981[i_218_] - f_220_;
						float f_224_ = (float) class179.anIntArray1973[i_218_] - f_221_;
						float f_225_ = (float) class179.anIntArray1957[i_218_] - f_222_;
						float f_226_ = (float) class179.anIntArray1981[i_219_] - f_220_;
						float f_227_ = (float) class179.anIntArray1973[i_219_] - f_221_;
						float f_228_ = (float) class179.anIntArray1957[i_219_] - f_222_;
						float f_229_ = (float) class179.anIntArray1981[i_214_] - f_220_;
						float f_230_ = (float) class179.anIntArray1973[i_214_] - f_221_;
						float f_231_ = (float) class179.anIntArray1957[i_214_] - f_222_;
						float f_232_ = (float) class179.anIntArray1981[i_215_] - f_220_;
						float f_233_ = (float) class179.anIntArray1973[i_215_] - f_221_;
						float f_234_ = (float) class179.anIntArray1957[i_215_] - f_222_;
						float f_235_ = (float) class179.anIntArray1981[i_216_] - f_220_;
						float f_236_ = (float) class179.anIntArray1973[i_216_] - f_221_;
						float f_237_ = (float) class179.anIntArray1957[i_216_] - f_222_;
						float f_238_ = f_224_ * f_228_ - f_225_ * f_227_;
						float f_239_ = f_225_ * f_226_ - f_223_ * f_228_;
						float f_240_ = f_223_ * f_227_ - f_224_ * f_226_;
						float f_241_ = f_227_ * f_240_ - f_228_ * f_239_;
						float f_242_ = f_228_ * f_238_ - f_226_ * f_240_;
						float f_243_ = f_226_ * f_239_ - f_227_ * f_238_;
						float f_244_ = 1.0F / (f_241_ * f_223_ + f_242_ * f_224_ + f_243_ * f_225_);
						f = (f_241_ * f_229_ + f_242_ * f_230_ + f_243_ * f_231_) * f_244_;
						f_200_ = (f_241_ * f_232_ + f_242_ * f_233_ + f_243_ * f_234_) * f_244_;
						f_202_ = (f_241_ * f_235_ + f_242_ * f_236_ + f_243_ * f_237_) * f_244_;
						f_241_ = f_224_ * f_240_ - f_225_ * f_239_;
						f_242_ = f_225_ * f_238_ - f_223_ * f_240_;
						f_243_ = f_223_ * f_239_ - f_224_ * f_238_;
						f_244_ = 1.0F / (f_241_ * f_226_ + f_242_ * f_227_ + f_243_ * f_228_);
						f_199_ = (f_241_ * f_229_ + f_242_ * f_230_ + f_243_ * f_231_) * f_244_;
						f_201_ = (f_241_ * f_232_ + f_242_ * f_233_ + f_243_ * f_234_) * f_244_;
						f_203_ = (f_241_ * f_235_ + f_242_ * f_236_ + f_243_ * f_237_) * f_244_;
					} else {
						short i_245_ = class179.aShortArray1949[i_195_];
						short i_246_ = class179.aShortArray1966[i_195_];
						short i_247_ = class179.aShortArray1967[i_195_];
						int i_248_ = class183.anIntArray2106[i_206_];
						int i_249_ = class183.anIntArray2107[i_206_];
						int i_250_ = class183.anIntArray2108[i_206_];
						float[] fs = class183.aFloatArrayArray2109[i_206_];
						byte i_251_ = class179.aByteArray1994[i_206_];
						float f_252_ = (float) class179.anIntArray1960[i_206_] / 256.0F;
						if (i_213_ == 1) {
							float f_253_ = ((float) class179.anIntArray1955[i_206_] / 1024.0F);
							method2841(class179.anIntArray1981[i_245_], class179.anIntArray1973[i_245_], class179.anIntArray1957[i_245_], i_248_, i_249_, i_250_, fs, f_253_, i_251_, f_252_, aFloatArray9223);
							f = aFloatArray9223[0];
							f_199_ = aFloatArray9223[1];
							method2841(class179.anIntArray1981[i_246_], class179.anIntArray1973[i_246_], class179.anIntArray1957[i_246_], i_248_, i_249_, i_250_, fs, f_253_, i_251_, f_252_, aFloatArray9223);
							f_200_ = aFloatArray9223[0];
							f_201_ = aFloatArray9223[1];
							method2841(class179.anIntArray1981[i_247_], class179.anIntArray1973[i_247_], class179.anIntArray1957[i_247_], i_248_, i_249_, i_250_, fs, f_253_, i_251_, f_252_, aFloatArray9223);
							f_202_ = aFloatArray9223[0];
							f_203_ = aFloatArray9223[1];
							float f_254_ = f_253_ / 2.0F;
							if ((i_251_ & 0x1) == 0) {
								if (f_200_ - f > f_254_) {
									f_200_ -= f_253_;
									i_211_ = 1;
								} else if (f - f_200_ > f_254_) {
									f_200_ += f_253_;
									i_211_ = 2;
								}
								if (f_202_ - f > f_254_) {
									f_202_ -= f_253_;
									i_212_ = 1;
								} else if (f - f_202_ > f_254_) {
									f_202_ += f_253_;
									i_212_ = 2;
								}
							} else {
								if (f_201_ - f_199_ > f_254_) {
									f_201_ -= f_253_;
									i_211_ = 1;
								} else if (f_199_ - f_201_ > f_254_) {
									f_201_ += f_253_;
									i_211_ = 2;
								}
								if (f_203_ - f_199_ > f_254_) {
									f_203_ -= f_253_;
									i_212_ = 1;
								} else if (f_199_ - f_203_ > f_254_) {
									f_203_ += f_253_;
									i_212_ = 2;
								}
							}
						} else if (i_213_ == 2) {
							float f_255_ = ((float) class179.anIntArray1970[i_206_] / 256.0F);
							float f_256_ = ((float) class179.anIntArray1992[i_206_] / 256.0F);
							int i_257_ = (class179.anIntArray1981[i_246_] - class179.anIntArray1981[i_245_]);
							int i_258_ = (class179.anIntArray1973[i_246_] - class179.anIntArray1973[i_245_]);
							int i_259_ = (class179.anIntArray1957[i_246_] - class179.anIntArray1957[i_245_]);
							int i_260_ = (class179.anIntArray1981[i_247_] - class179.anIntArray1981[i_245_]);
							int i_261_ = (class179.anIntArray1973[i_247_] - class179.anIntArray1973[i_245_]);
							int i_262_ = (class179.anIntArray1957[i_247_] - class179.anIntArray1957[i_245_]);
							int i_263_ = i_258_ * i_262_ - i_261_ * i_259_;
							int i_264_ = i_259_ * i_260_ - i_262_ * i_257_;
							int i_265_ = i_257_ * i_261_ - i_260_ * i_258_;
							float f_266_ = (64.0F / (float) class179.anIntArray1987[i_206_]);
							float f_267_ = (64.0F / (float) class179.anIntArray1988[i_206_]);
							float f_268_ = (64.0F / (float) class179.anIntArray1955[i_206_]);
							float f_269_ = (((float) i_263_ * fs[0] + (float) i_264_ * fs[1] + (float) i_265_ * fs[2]) / f_266_);
							float f_270_ = (((float) i_263_ * fs[3] + (float) i_264_ * fs[4] + (float) i_265_ * fs[5]) / f_267_);
							float f_271_ = (((float) i_263_ * fs[6] + (float) i_264_ * fs[7] + (float) i_265_ * fs[8]) / f_268_);
							i_210_ = method2674(f_269_, f_270_, f_271_);
							method2698(class179.anIntArray1981[i_245_], class179.anIntArray1973[i_245_], class179.anIntArray1957[i_245_], i_248_, i_249_, i_250_, i_210_, fs, i_251_, f_252_, f_255_, f_256_, aFloatArray9223);
							f = aFloatArray9223[0];
							f_199_ = aFloatArray9223[1];
							method2698(class179.anIntArray1981[i_246_], class179.anIntArray1973[i_246_], class179.anIntArray1957[i_246_], i_248_, i_249_, i_250_, i_210_, fs, i_251_, f_252_, f_255_, f_256_, aFloatArray9223);
							f_200_ = aFloatArray9223[0];
							f_201_ = aFloatArray9223[1];
							method2698(class179.anIntArray1981[i_247_], class179.anIntArray1973[i_247_], class179.anIntArray1957[i_247_], i_248_, i_249_, i_250_, i_210_, fs, i_251_, f_252_, f_255_, f_256_, aFloatArray9223);
							f_202_ = aFloatArray9223[0];
							f_203_ = aFloatArray9223[1];
						} else if (i_213_ == 3) {
							method2675(class179.anIntArray1981[i_245_], class179.anIntArray1973[i_245_], class179.anIntArray1957[i_245_], i_248_, i_249_, i_250_, fs, i_251_, f_252_, aFloatArray9223);
							f = aFloatArray9223[0];
							f_199_ = aFloatArray9223[1];
							method2675(class179.anIntArray1981[i_246_], class179.anIntArray1973[i_246_], class179.anIntArray1957[i_246_], i_248_, i_249_, i_250_, fs, i_251_, f_252_, aFloatArray9223);
							f_200_ = aFloatArray9223[0];
							f_201_ = aFloatArray9223[1];
							method2675(class179.anIntArray1981[i_247_], class179.anIntArray1973[i_247_], class179.anIntArray1957[i_247_], i_248_, i_249_, i_250_, fs, i_251_, f_252_, aFloatArray9223);
							f_202_ = aFloatArray9223[0];
							f_203_ = aFloatArray9223[1];
							if ((i_251_ & 0x1) == 0) {
								if (f_200_ - f > 0.5F) {
									f_200_--;
									i_211_ = 1;
								} else if (f - f_200_ > 0.5F) {
									f_200_++;
									i_211_ = 2;
								}
								if (f_202_ - f > 0.5F) {
									f_202_--;
									i_212_ = 1;
								} else if (f - f_202_ > 0.5F) {
									f_202_++;
									i_212_ = 2;
								}
							} else {
								if (f_201_ - f_199_ > 0.5F) {
									f_201_--;
									i_211_ = 1;
								} else if (f_199_ - f_201_ > 0.5F) {
									f_201_++;
									i_211_ = 2;
								}
								if (f_203_ - f_199_ > 0.5F) {
									f_203_--;
									i_212_ = 1;
								} else if (f_199_ - f_203_ > 0.5F) {
									f_203_++;
									i_212_ = 2;
								}
							}
						}
					}
					l_205_ = (long) (i_210_ << 16 | i_206_);
					l_204_ = (long) (i_211_ << 19) | l_205_;
					l = (long) (i_212_ << 19) | l_205_;
				}
			} else {
				l = 0L;
				l_204_ = 0L;
				l_205_ = 0L;
			}
			byte i_272_ = (class179.aByteArray1971 != null ? class179.aByteArray1971[i_195_] : (byte) 0);
			if (i_272_ == 0) {
				long l_273_ = (long) ((i_196_ << 8) + i_197_);
				short i_274_ = class179.aShortArray1949[i_195_];
				short i_275_ = class179.aShortArray1966[i_195_];
				short i_276_ = class179.aShortArray1967[i_195_];
				Class373 class373 = class373s[i_274_];
				aShortArray9161[i_194_] = method14543(class179, i_274_, i_194_, l_273_ | l_205_ << 24, class373.anInt3906, class373.anInt3904, class373.anInt3907, class373.anInt3905, f, f_199_);
				class373 = class373s[i_275_];
				aShortArray9217[i_194_] = method14543(class179, i_275_, i_194_, l_273_ | l_204_ << 24, class373.anInt3906, class373.anInt3904, class373.anInt3907, class373.anInt3905, f_200_, f_201_);
				class373 = class373s[i_276_];
				aShortArray9179[i_194_] = method14543(class179, i_276_, i_194_, l_273_ | l << 24, class373.anInt3906, class373.anInt3904, class373.anInt3907, class373.anInt3905, f_202_, f_203_);
			} else if (i_272_ == 1) {
				Class370 class370 = class370s[i_195_];
				long l_277_ = (((long) (class370.anInt3885 & ~0x7fffffff) << 9) + ((long) (class370.anInt3886 + 256) << 32) + ((long) (class370.anInt3887 + 256) << 24) + (long) (i_196_ << 8) + (long) i_197_);
				aShortArray9161[i_194_] = method14543(class179, class179.aShortArray1949[i_195_], i_194_, l_277_ | l_205_ << 41, class370.anInt3885, class370.anInt3886, class370.anInt3887, 0, f, f_199_);
				aShortArray9217[i_194_] = method14543(class179, class179.aShortArray1966[i_195_], i_194_, l_277_ | l_205_ << 41, class370.anInt3885, class370.anInt3886, class370.anInt3887, 0, f_200_, f_201_);
				aShortArray9179[i_194_] = method14543(class179, class179.aShortArray1967[i_195_], i_194_, l_277_ | l_205_ << 41, class370.anInt3885, class370.anInt3886, class370.anInt3887, 0, f_202_, f_203_);
			}
			if (class179.aByteArray1975 != null)
				aByteArray9176[i_194_] = class179.aByteArray1975[i_195_];
			if (class179.aShortArray1979 != null)
				aShortArray9170[i_194_] = class179.aShortArray1979[i_195_];
			aShortArray9175[i_194_] = class179.aShortArray1974[i_195_];
			aShortArray9189[i_194_] = i_198_;
		}
		if (anInt9174 > 0) {
			int i_278_ = 1;
			short i_279_ = aShortArray9189[0];
			for (int i_280_ = 0; i_280_ < anInt9174; i_280_++) {
				short i_281_ = aShortArray9189[i_280_];
				if (i_281_ != i_279_) {
					i_278_++;
					i_279_ = i_281_;
				}
			}
			anIntArray9204 = new int[i_278_];
			anIntArray9205 = new int[i_278_];
			anIntArray9203 = new int[i_278_ + 1];
			anIntArray9203[0] = 0;
			int i_282_ = anInt9163;
			int i_283_ = 0;
			i_278_ = 0;
			i_279_ = aShortArray9189[0];
			for (int i_284_ = 0; i_284_ < anInt9174; i_284_++) {
				short i_285_ = aShortArray9189[i_284_];
				if (i_285_ != i_279_) {
					anIntArray9204[i_278_] = i_282_;
					anIntArray9205[i_278_] = i_283_ - i_282_ + 1;
					anIntArray9203[++i_278_] = i_284_;
					i_282_ = anInt9163;
					i_283_ = 0;
					i_279_ = i_285_;
				}
				int i_286_ = aShortArray9161[i_284_] & 0xffff;
				if (i_286_ < i_282_)
					i_282_ = i_286_;
				if (i_286_ > i_283_)
					i_283_ = i_286_;
				i_286_ = aShortArray9217[i_284_] & 0xffff;
				if (i_286_ < i_282_)
					i_282_ = i_286_;
				if (i_286_ > i_283_)
					i_283_ = i_286_;
				i_286_ = aShortArray9179[i_284_] & 0xffff;
				if (i_286_ < i_282_)
					i_282_ = i_286_;
				if (i_286_ > i_283_)
					i_283_ = i_286_;
			}
			anIntArray9204[i_278_] = i_282_;
			anIntArray9205[i_278_] = i_283_ - i_282_ + 1;
			anIntArray9203[++i_278_] = anInt9174;
		}
		aLongArray9214 = null;
		aShortArray9166 = method14552(aShortArray9166, anInt9163);
		aShortArray9178 = method14552(aShortArray9178, anInt9163);
		aShortArray9164 = method14552(aShortArray9164, anInt9163);
		aShortArray9167 = method14552(aShortArray9167, anInt9163);
		aShortArray9168 = method14552(aShortArray9168, anInt9163);
		aByteArray9169 = method14554(aByteArray9169, anInt9163);
		aFloatArray9194 = method14551(aFloatArray9194, anInt9163);
		aFloatArray9171 = method14551(aFloatArray9171, anInt9163);
		if (class179.anIntArray1956 != null && Class347.method6024(i, anInt9185))
			anIntArrayArray9190 = class179.method3510(false);
		if (class179.aClass176Array1997 != null && Class347.method6065(i, anInt9185))
			anIntArrayArray9213 = class179.method3489();
		if (class179.anIntArray1993 != null && Class347.method6023(i, anInt9185)) {
			int i_287_ = 0;
			int[] is_288_ = new int[256];
			for (int i_289_ = 0; i_289_ < anInt9155; i_289_++) {
				int i_290_ = class179.anIntArray1993[is[i_289_]];
				if (i_290_ >= 0) {
					is_288_[i_290_]++;
					if (i_290_ > i_287_)
						i_287_ = i_290_;
				}
			}
			anIntArrayArray9181 = new int[i_287_ + 1][];
			for (int i_291_ = 0; i_291_ <= i_287_; i_291_++) {
				anIntArrayArray9181[i_291_] = new int[is_288_[i_291_]];
				is_288_[i_291_] = 0;
			}
			for (int i_292_ = 0; i_292_ < anInt9155; i_292_++) {
				int i_293_ = class179.anIntArray1993[is[i_292_]];
				if (i_293_ >= 0)
					anIntArrayArray9181[i_293_][is_288_[i_293_]++] = i_292_;
			}
		}
	}

	static short[] method14552(short[] is, int i) {
		short[] is_294_ = new short[i];
		System.arraycopy(is, 0, is_294_, 0, i);
		return is_294_;
	}

	public void method2826(short i, short i_295_) {
		Class172 class172 = aClass178_Sub2_9153.aClass172_1916;
		for (int i_296_ = 0; i_296_ < anInt9155; i_296_++) {
			if (aShortArray9189[i_296_] == i)
				aShortArray9189[i_296_] = i_295_;
		}
		byte i_297_ = 0;
		byte i_298_ = 0;
		if (i != -1) {
			Class177 class177 = class172.method2895(i & 0xffff, 565395398);
			i_297_ = class177.aByte1912;
			i_298_ = class177.aByte1883;
		}
		byte i_299_ = 0;
		byte i_300_ = 0;
		if (i_295_ != -1) {
			Class177 class177 = class172.method2895(i_295_ & 0xffff, -1055695310);
			i_299_ = class177.aByte1912;
			i_300_ = class177.aByte1883;
			if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
				aBool9191 = true;
		}
		if (i_297_ != i_299_ | i_298_ != i_300_) {
			if (aClass371Array9211 != null) {
				for (int i_301_ = 0; i_301_ < anInt9210; i_301_++) {
					Class371 class371 = aClass371Array9211[i_301_];
					Class337 class337 = aClass337Array9212[i_301_];
					class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
				}
			}
			method14547();
		}
	}

	public void method2839(int i, int i_302_, int i_303_, int i_304_) {
		for (int i_305_ = 0; i_305_ < anInt9155; i_305_++) {
			int i_306_ = aShortArray9175[i_305_] & 0xffff;
			int i_307_ = i_306_ >> 10 & 0x3f;
			int i_308_ = i_306_ >> 7 & 0x7;
			int i_309_ = i_306_ & 0x7f;
			if (i != -1)
				i_307_ += (i - i_307_) * i_304_ >> 7;
			if (i_302_ != -1)
				i_308_ += (i_302_ - i_308_) * i_304_ >> 7;
			if (i_303_ != -1)
				i_309_ += (i_303_ - i_309_) * i_304_ >> 7;
			aShortArray9175[i_305_] = (short) (i_307_ << 10 | i_308_ << 7 | i_309_);
		}
		if (aClass371Array9211 != null) {
			for (int i_310_ = 0; i_310_ < anInt9210; i_310_++) {
				Class371 class371 = aClass371Array9211[i_310_];
				Class337 class337 = aClass337Array9212[i_310_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public int method2806() {
		if (!aBool9215)
			method14569();
		return anInt9154;
	}

	static float[] method14553(float[] fs, int i) {
		float[] fs_311_ = new float[i];
		System.arraycopy(fs, 0, fs_311_, 0, i);
		return fs_311_;
	}

	public void method2872(int i) {
		aShort9149 = (short) i;
		method14547();
	}

	public int method2847() {
		if (!aBool9215)
			method14569();
		return anInt9196;
	}

	void method2703() {
		/* empty */
	}

	public void method2744(int i) {
		if (aClass357_9186 != null)
			aClass357_9186.aBool3724 = Class347.method6011(i, anInt9185);
		if (aClass357_9187 != null)
			aClass357_9187.aBool3724 = Class347.method6014(i, anInt9185);
		if (aClass357_9150 != null)
			aClass357_9150.aBool3724 = Class347.method6092(i, anInt9185);
		if (aClass357_9224 != null)
			aClass357_9224.aBool3724 = Class347.method6012(i, anInt9185);
		anInt9152 = i;
		if (aClass367_9172 != null && (anInt9152 & 0x10000) == 0) {
			aShortArray9164 = aClass367_9172.aShortArray3879;
			aShortArray9167 = aClass367_9172.aShortArray3877;
			aShortArray9168 = aClass367_9172.aShortArray3876;
			aByteArray9169 = aClass367_9172.aByteArray3878;
			aClass367_9172 = null;
		}
		aBool9182 = true;
		method14600();
	}

	static byte[] method14554(byte[] is, int i) {
		byte[] is_312_ = new byte[i];
		System.arraycopy(is, 0, is_312_, 0, i);
		return is_312_;
	}

	public int method2799() {
		if (!aBool9215)
			method14569();
		return anInt9165;
	}

	public int method2711() {
		if (!aBool9215)
			method14569();
		return anInt9193;
	}

	void method2819() {
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] = anIntArray9158[i] + 7 >> 4;
			anIntArray9159[i] = anIntArray9159[i] + 7 >> 4;
			anIntArray9160[i] = anIntArray9160[i] + 7 >> 4;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2707(Class435 class435, int i, boolean bool) {
		if (aShortArray9162 != null) {
			Class435 class435_313_ = class435;
			if (bool) {
				class435_313_ = aClass178_Sub2_9153.aClass435_9559;
				class435_313_.method6824(class435);
			}
			float[] fs = new float[3];
			for (int i_314_ = 0; i_314_ < anInt9157; i_314_++) {
				if ((i & aShortArray9162[i_314_]) != 0) {
					class435_313_.method6858((float) anIntArray9158[i_314_], (float) anIntArray9159[i_314_], (float) anIntArray9160[i_314_], fs);
					anIntArray9158[i_314_] = (int) fs[0];
					anIntArray9159[i_314_] = (int) fs[1];
					anIntArray9160[i_314_] = (int) fs[2];
				}
			}
		}
	}

	public Class143[] method2734() {
		return aClass143Array9209;
	}

	public Class184[] method2733() {
		return aClass184Array9208;
	}

	public void method2732(Class435 class435) {
		Class441 class441 = aClass178_Sub2_9153.aClass441_9560;
		class441.method7090(class435);
		if (aClass184Array9208 != null) {
			for (int i = 0; i < aClass184Array9208.length; i++) {
				Class184 class184 = aClass184Array9208[i];
				Class184 class184_315_ = class184;
				if (class184.aClass184_2111 != null)
					class184_315_ = class184.aClass184_2111;
				class184_315_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9158[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9159[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_315_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_315_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_315_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_315_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_315_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_315_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_315_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_315_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9209 != null) {
			for (int i = 0; i < aClass143Array9209.length; i++) {
				Class143 class143 = aClass143Array9209[i];
				Class143 class143_316_ = class143;
				if (class143.aClass143_1687 != null)
					class143_316_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_316_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_316_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9158[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9159[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_316_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	public Class143[] method2714() {
		return aClass143Array9209;
	}

	boolean method14555(int i, int i_317_, int i_318_, int i_319_, Class435 class435, boolean bool, int i_320_) {
		Class441 class441 = aClass178_Sub2_9153.aClass441_9560;
		class441.method7090(class435);
		class441.method7089(aClass178_Sub2_9153.aClass441_9574);
		boolean bool_321_ = false;
		float f = 3.4028235E38F;
		float f_322_ = -3.4028235E38F;
		float f_323_ = 3.4028235E38F;
		float f_324_ = -3.4028235E38F;
		if (!aBool9215)
			method14569();
		int i_325_ = anInt9165 - anInt9197 >> 1;
		int i_326_ = anInt9196 - anInt9195 >> 1;
		int i_327_ = anInt9200 - anInt9154 >> 1;
		int i_328_ = anInt9197 + i_325_;
		int i_329_ = anInt9195 + i_326_;
		int i_330_ = anInt9154 + i_327_;
		int i_331_ = i_328_ - (i_325_ << i_320_);
		int i_332_ = i_329_ - (i_326_ << i_320_);
		int i_333_ = i_330_ - (i_327_ << i_320_);
		int i_334_ = i_328_ + (i_325_ << i_320_);
		int i_335_ = i_329_ + (i_326_ << i_320_);
		int i_336_ = i_330_ + (i_327_ << i_320_);
		anIntArray9218[0] = i_331_;
		anIntArray9180[0] = i_332_;
		anIntArray9220[0] = i_333_;
		anIntArray9218[1] = i_334_;
		anIntArray9180[1] = i_332_;
		anIntArray9220[1] = i_333_;
		anIntArray9218[2] = i_331_;
		anIntArray9180[2] = i_335_;
		anIntArray9220[2] = i_333_;
		anIntArray9218[3] = i_334_;
		anIntArray9180[3] = i_335_;
		anIntArray9220[3] = i_333_;
		anIntArray9218[4] = i_331_;
		anIntArray9180[4] = i_332_;
		anIntArray9220[4] = i_336_;
		anIntArray9218[5] = i_334_;
		anIntArray9180[5] = i_332_;
		anIntArray9220[5] = i_336_;
		anIntArray9218[6] = i_331_;
		anIntArray9180[6] = i_335_;
		anIntArray9220[6] = i_336_;
		anIntArray9218[7] = i_334_;
		anIntArray9180[7] = i_335_;
		anIntArray9220[7] = i_336_;
		for (int i_337_ = 0; i_337_ < 8; i_337_++) {
			float f_338_ = (float) anIntArray9218[i_337_];
			float f_339_ = (float) anIntArray9180[i_337_];
			float f_340_ = (float) anIntArray9220[i_337_];
			float f_341_ = (class441.aFloatArray4916[2] * f_338_ + class441.aFloatArray4916[6] * f_339_ + class441.aFloatArray4916[10] * f_340_ + class441.aFloatArray4916[14]);
			float f_342_ = (class441.aFloatArray4916[3] * f_338_ + class441.aFloatArray4916[7] * f_339_ + class441.aFloatArray4916[11] * f_340_ + class441.aFloatArray4916[15]);
			if (f_341_ >= -f_342_) {
				float f_343_ = (class441.aFloatArray4916[0] * f_338_ + class441.aFloatArray4916[4] * f_339_ + class441.aFloatArray4916[8] * f_340_ + class441.aFloatArray4916[12]);
				float f_344_ = (class441.aFloatArray4916[1] * f_338_ + class441.aFloatArray4916[5] * f_339_ + class441.aFloatArray4916[9] * f_340_ + class441.aFloatArray4916[13]);
				float f_345_ = (aClass178_Sub2_9153.aFloat9603 + aClass178_Sub2_9153.aFloat9578 * f_343_ / f_342_);
				float f_346_ = (aClass178_Sub2_9153.aFloat9579 + aClass178_Sub2_9153.aFloat9580 * f_344_ / f_342_);
				if (f_345_ < f)
					f = f_345_;
				if (f_345_ > f_322_)
					f_322_ = f_345_;
				if (f_346_ < f_323_)
					f_323_ = f_346_;
				if (f_346_ > f_324_)
					f_324_ = f_346_;
				bool_321_ = true;
			}
		}
		int i_347_ = i + i_318_;
		int i_348_ = i_317_ + i_319_;
		if (bool_321_ && (float) i_347_ > f && (float) i < f_322_ && (float) i_348_ > f_323_ && (float) i_317_ < f_324_) {
			if (bool)
				return true;
			if (anIntArray9219.length < anInt9163) {
				anIntArray9219 = new int[anInt9163];
				anIntArray9177 = new int[anInt9163];
			}
			for (int i_349_ = 0; i_349_ < anInt9157; i_349_++) {
				float f_350_ = (float) anIntArray9158[i_349_];
				float f_351_ = (float) anIntArray9159[i_349_];
				float f_352_ = (float) anIntArray9160[i_349_];
				float f_353_ = (class441.aFloatArray4916[2] * f_350_ + class441.aFloatArray4916[6] * f_351_ + class441.aFloatArray4916[10] * f_352_ + class441.aFloatArray4916[14]);
				float f_354_ = (class441.aFloatArray4916[3] * f_350_ + class441.aFloatArray4916[7] * f_351_ + class441.aFloatArray4916[11] * f_352_ + class441.aFloatArray4916[15]);
				if (f_353_ >= -f_354_) {
					float f_355_ = (class441.aFloatArray4916[0] * f_350_ + class441.aFloatArray4916[4] * f_351_ + class441.aFloatArray4916[8] * f_352_ + class441.aFloatArray4916[12]);
					float f_356_ = (class441.aFloatArray4916[1] * f_350_ + class441.aFloatArray4916[5] * f_351_ + class441.aFloatArray4916[9] * f_352_ + class441.aFloatArray4916[13]);
					int i_357_ = anIntArray9199[i_349_];
					int i_358_ = anIntArray9199[i_349_ + 1];
					for (int i_359_ = i_357_; i_359_ < i_358_ && aShortArray9207[i_359_] != 0; i_359_++) {
						int i_360_ = (aShortArray9207[i_359_] & 0xffff) - 1;
						anIntArray9219[i_360_] = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_355_ / f_354_));
						anIntArray9177[i_360_] = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_356_ / f_354_));
					}
				} else {
					int i_361_ = anIntArray9199[i_349_];
					int i_362_ = anIntArray9199[i_349_ + 1];
					for (int i_363_ = i_361_; i_363_ < i_362_ && aShortArray9207[i_363_] != 0; i_363_++) {
						int i_364_ = (aShortArray9207[i_363_] & 0xffff) - 1;
						anIntArray9219[i_364_] = -999999;
					}
				}
			}
			for (int i_365_ = 0; i_365_ < anInt9155; i_365_++) {
				if (anIntArray9219[aShortArray9161[i_365_] & 0xffff] != -999999 && (anIntArray9219[aShortArray9217[i_365_] & 0xffff] != -999999) && (anIntArray9219[aShortArray9179[i_365_] & 0xffff] != -999999) && (method14556(i, i_317_, i_347_, i_348_, anIntArray9177[aShortArray9161[i_365_] & 0xffff], anIntArray9177[aShortArray9217[i_365_] & 0xffff], anIntArray9177[aShortArray9179[i_365_] & 0xffff], anIntArray9219[aShortArray9161[i_365_] & 0xffff], anIntArray9219[aShortArray9217[i_365_] & 0xffff], anIntArray9219[aShortArray9179[i_365_] & 0xffff])))
					return true;
			}
		}
		return false;
	}

	boolean method14556(int i, int i_366_, int i_367_, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_, int i_374_) {
		if (i_368_ < i_369_ && i_368_ < i_370_ && i_368_ < i_371_)
			return false;
		if (i_366_ > i_369_ && i_366_ > i_370_ && i_366_ > i_371_)
			return false;
		if (i_367_ < i_372_ && i_367_ < i_373_ && i_367_ < i_374_)
			return false;
		if (i > i_372_ && i > i_373_ && i > i_374_)
			return false;
		return true;
	}

	public Class523_Sub27_Sub4 method2710(Class523_Sub27_Sub4 class523_sub27_sub4) {
		if (anInt9163 == 0)
			return null;
		if (!aBool9215)
			method14569();
		int i;
		int i_375_;
		if (aClass178_Sub2_9153.anInt9624 > 0) {
			i = (anInt9197 - (anInt9196 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623);
			i_375_ = anInt9165 - (anInt9195 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623;
		} else {
			i = (anInt9197 - (anInt9195 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623);
			i_375_ = anInt9165 - (anInt9196 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623;
		}
		int i_376_;
		int i_377_;
		if (aClass178_Sub2_9153.anInt9625 > 0) {
			i_376_ = anInt9154 - (anInt9196 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
			i_377_ = anInt9200 - (anInt9195 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
		} else {
			i_376_ = anInt9154 - (anInt9195 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
			i_377_ = anInt9200 - (anInt9196 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
		}
		int i_378_ = i_375_ - i + 1;
		int i_379_ = i_377_ - i_376_ + 1;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_380_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_378_, i_379_)) {
			class523_sub27_sub4_sub2_380_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_380_.method18545();
		} else
			class523_sub27_sub4_sub2_380_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_9153, i_378_, i_379_);
		class523_sub27_sub4_sub2_380_.method18544(i, i_376_, i_375_, i_377_);
		method14557(class523_sub27_sub4_sub2_380_);
		return class523_sub27_sub4_sub2_380_;
	}

	void method14557(Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2) {
		if (anIntArray9219.length < anInt9163) {
			anIntArray9219 = new int[anInt9163];
			anIntArray9177 = new int[anInt9163];
		}
		for (int i = 0; i < anInt9157; i++) {
			int i_381_ = (((anIntArray9158[i] - (anIntArray9159[i] * aClass178_Sub2_9153.anInt9624 >> 8)) >> aClass178_Sub2_9153.anInt9623) - class523_sub27_sub4_sub2.anInt12089);
			int i_382_ = (((anIntArray9160[i] - (anIntArray9159[i] * aClass178_Sub2_9153.anInt9625 >> 8)) >> aClass178_Sub2_9153.anInt9623) - class523_sub27_sub4_sub2.anInt12090);
			int i_383_ = anIntArray9199[i];
			int i_384_ = anIntArray9199[i + 1];
			for (int i_385_ = i_383_; i_385_ < i_384_ && aShortArray9207[i_385_] != 0; i_385_++) {
				int i_386_ = (aShortArray9207[i_385_] & 0xffff) - 1;
				anIntArray9219[i_386_] = i_381_;
				anIntArray9177[i_386_] = i_382_;
			}
		}
		for (int i = 0; i < anInt9174; i++) {
			if (aByteArray9176 == null || aByteArray9176[i] <= 128) {
				int i_387_ = aShortArray9161[i] & 0xffff;
				int i_388_ = aShortArray9217[i] & 0xffff;
				int i_389_ = aShortArray9179[i] & 0xffff;
				int i_390_ = anIntArray9219[i_387_];
				int i_391_ = anIntArray9219[i_388_];
				int i_392_ = anIntArray9219[i_389_];
				int i_393_ = anIntArray9177[i_387_];
				int i_394_ = anIntArray9177[i_388_];
				int i_395_ = anIntArray9177[i_389_];
				if (((i_390_ - i_391_) * (i_394_ - i_395_) - (i_394_ - i_393_) * (i_392_ - i_391_)) > 0)
					class523_sub27_sub4_sub2.method18546(i_393_, i_394_, i_395_, i_390_, i_391_, i_392_);
			}
		}
	}

	public void method2708(Class435 class435, Class180 class180, int i) {
		if (aClass343_9225 != null)
			aClass343_9225.method5990();
		if (class180 != null)
			class180.aBool2000 = false;
		if (anInt9163 != 0) {
			Class441 class441 = aClass178_Sub2_9153.aClass441_9570;
			Class441 class441_396_ = aClass178_Sub2_9153.aClass441_9560;
			Class441 class441_397_ = aClass178_Sub2_9153.aClass441_9561;
			class441_396_.method7090(class435);
			class441_397_.method7086(class441_396_);
			class441_397_.method7089(aClass178_Sub2_9153.aClass441_9574);
			if (!aBool9215)
				method14569();
			float[] fs = aClass178_Sub2_9153.aFloatArray9610;
			class441_396_.method7185(0.0F, (float) anInt9195, 0.0F, fs);
			float f = fs[0];
			float f_398_ = fs[1];
			float f_399_ = fs[2];
			class441_396_.method7185(0.0F, (float) anInt9196, 0.0F, fs);
			float f_400_ = fs[0];
			float f_401_ = fs[1];
			float f_402_ = fs[2];
			for (int i_403_ = 0; i_403_ < 6; i_403_++) {
				float[] fs_404_ = aClass178_Sub2_9153.aFloatArrayArray9576[i_403_];
				float f_405_ = (fs_404_[0] * f + fs_404_[1] * f_398_ + fs_404_[2] * f_399_ + fs_404_[3] + (float) anInt9193);
				float f_406_ = (fs_404_[0] * f_400_ + fs_404_[1] * f_401_ + fs_404_[2] * f_402_ + fs_404_[3] + (float) anInt9193);
				if (f_405_ < 0.0F && f_406_ < 0.0F)
					return;
			}
			if (class180 != null) {
				boolean bool = false;
				boolean bool_407_ = true;
				int i_408_ = anInt9197 + anInt9165 >> 1;
				int i_409_ = anInt9154 + anInt9200 >> 1;
				int i_410_ = i_408_;
				int i_411_ = anInt9195;
				int i_412_ = i_409_;
				float f_413_ = (class441_397_.aFloatArray4916[0] * (float) i_410_ + class441_397_.aFloatArray4916[4] * (float) i_411_ + class441_397_.aFloatArray4916[8] * (float) i_412_ + class441_397_.aFloatArray4916[12]);
				float f_414_ = (class441_397_.aFloatArray4916[1] * (float) i_410_ + class441_397_.aFloatArray4916[5] * (float) i_411_ + class441_397_.aFloatArray4916[9] * (float) i_412_ + class441_397_.aFloatArray4916[13]);
				float f_415_ = (class441_397_.aFloatArray4916[2] * (float) i_410_ + class441_397_.aFloatArray4916[6] * (float) i_411_ + class441_397_.aFloatArray4916[10] * (float) i_412_ + class441_397_.aFloatArray4916[14]);
				float f_416_ = (class441_397_.aFloatArray4916[3] * (float) i_410_ + class441_397_.aFloatArray4916[7] * (float) i_411_ + class441_397_.aFloatArray4916[11] * (float) i_412_ + class441_397_.aFloatArray4916[15]);
				if (f_415_ >= -f_416_) {
					class180.anInt1999 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_413_ / f_416_));
					class180.anInt2002 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_414_ / f_416_));
				} else
					bool = true;
				i_410_ = i_408_;
				i_411_ = anInt9196;
				i_412_ = i_409_;
				float f_417_ = (class441_397_.aFloatArray4916[0] * (float) i_410_ + class441_397_.aFloatArray4916[4] * (float) i_411_ + class441_397_.aFloatArray4916[8] * (float) i_412_ + class441_397_.aFloatArray4916[12]);
				float f_418_ = (class441_397_.aFloatArray4916[1] * (float) i_410_ + class441_397_.aFloatArray4916[5] * (float) i_411_ + class441_397_.aFloatArray4916[9] * (float) i_412_ + class441_397_.aFloatArray4916[13]);
				float f_419_ = (class441_397_.aFloatArray4916[2] * (float) i_410_ + class441_397_.aFloatArray4916[6] * (float) i_411_ + class441_397_.aFloatArray4916[10] * (float) i_412_ + class441_397_.aFloatArray4916[14]);
				float f_420_ = (class441_397_.aFloatArray4916[3] * (float) i_410_ + class441_397_.aFloatArray4916[7] * (float) i_411_ + class441_397_.aFloatArray4916[11] * (float) i_412_ + class441_397_.aFloatArray4916[15]);
				if (f_419_ >= -f_420_) {
					class180.anInt1998 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_417_ / f_420_));
					class180.anInt2003 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_418_ / f_420_));
				} else
					bool = true;
				if (bool) {
					if (f_415_ < -f_416_ && f_419_ < -f_420_)
						bool_407_ = false;
					else if (f_415_ < -f_416_) {
						float f_421_ = (f_415_ + f_416_) / (f_419_ + f_420_) - 1.0F;
						float f_422_ = f_413_ + f_421_ * (f_417_ - f_413_);
						float f_423_ = f_414_ + f_421_ * (f_418_ - f_414_);
						float f_424_ = f_416_ + f_421_ * (f_420_ - f_416_);
						class180.anInt1999 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_422_ / f_424_));
						class180.anInt2002 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_423_ / f_424_));
					} else if (f_419_ < -f_420_) {
						float f_425_ = (f_419_ + f_420_) / (f_415_ + f_416_) - 1.0F;
						float f_426_ = f_417_ + f_425_ * (f_413_ - f_417_);
						float f_427_ = f_418_ + f_425_ * (f_414_ - f_418_);
						float f_428_ = f_420_ + f_425_ * (f_416_ - f_420_);
						class180.anInt1998 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_426_ / f_428_));
						class180.anInt2003 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_427_ / f_428_));
					}
				}
				if (bool_407_) {
					if (f_415_ / f_416_ > f_419_ / f_420_) {
						float f_429_ = (f_413_ + (class441.aFloatArray4916[0] * (float) anInt9193) + class441.aFloatArray4916[12]);
						float f_430_ = (f_416_ + (class441.aFloatArray4916[3] * (float) anInt9193) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub2_9153.aFloat9603 - (float) class180.anInt1999 + (aClass178_Sub2_9153.aFloat9578 * f_429_ / f_430_));
					} else {
						float f_431_ = (f_417_ + (class441.aFloatArray4916[0] * (float) anInt9193) + class441.aFloatArray4916[12]);
						float f_432_ = (f_420_ + (class441.aFloatArray4916[3] * (float) anInt9193) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub2_9153.aFloat9603 - (float) class180.anInt1998 + (aClass178_Sub2_9153.aFloat9578 * f_431_ / f_432_));
					}
					class180.aBool2000 = true;
				}
			}
			aClass178_Sub2_9153.method15044(i);
			method14558(class435);
			aClass178_Sub2_9153.method15044(0);
			class441_396_.method7090(class435);
			class441_396_.method7089(aClass178_Sub2_9153.aClass441_9629);
			method14559(class441_396_);
		}
	}

	void method14558(Class435 class435) {
		if (anInt9174 != 0 && (method14561() && method14560())) {
			if (aClass343_9225 == null) {
				/* empty */
			}
			aClass178_Sub2_9153.method15043();
			aClass178_Sub2_9153.method14941();
			Class329 class329 = aClass178_Sub2_9153.aClass329_9642;
			aClass178_Sub2_9153.method15033(0, aClass357_9186.anInterface36_3726);
			aClass178_Sub2_9153.method15033(1, aClass357_9150.anInterface36_3726);
			aClass178_Sub2_9153.method15033(2, aClass357_9187.anInterface36_3726);
			aClass178_Sub2_9153.method15213(aClass336_9183.anInterface40_3561);
			aClass178_Sub2_9153.aClass441_9560.method7090(class435);
			class329.method5790(aClass178_Sub2_9153.aClass441_9560);
			class329.aClass441_3480.method7085();
			if (aClass178_Sub2_9153.aBool9656) {
				Class163 class163 = aClass178_Sub2_9153.method15017();
				class329.aClass429_3490.method6773(0.0F, 1.0F, 0.0F, (float) -aClass178_Sub2_9153.anInt9601);
				class329.aClass429_3490.method6766(3.0F / (float) ((class163.anInt1775) * -118212955));
				class329.aClass437_3479.method6972(((float) (class163.anInt1776 * -319632409 >> 16 & 0xff) / 255.0F), ((float) (class163.anInt1776 * -319632409 >> 8 & 0xff) / 255.0F), ((float) (class163.anInt1776 * -319632409 >> 0 & 0xff) / 255.0F));
			} else {
				class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
			}
			if (aClass178_Sub2_9153.anInt9663 > 0) {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 1.0F, -(aClass178_Sub2_9153.aFloat9683));
				class329.aClass437_3484.method6972(((float) (aClass178_Sub2_9153.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 0 & 0xff) / 255.0F));
				aClass178_Sub2_9153.aClass441_9560.method7090(class435);
				aClass178_Sub2_9153.aClass441_9560.method7124();
				class329.aClass429_3490.method6762(aClass178_Sub2_9153.aClass441_9560);
				aClass178_Sub2_9153.aClass441_9560.method7090(class435);
				aClass178_Sub2_9153.aClass441_9560.method7089(aClass178_Sub2_9153.aClass441_9629);
				aClass178_Sub2_9153.aClass441_9560.method7124();
				class329.aClass429_3486.method6762(aClass178_Sub2_9153.aClass441_9560);
				class329.aClass429_3486.method6766(1.0F / (aClass178_Sub2_9153.aFloat9681 - aClass178_Sub2_9153.aFloat9683));
			} else {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9185 & 0x37) == 0) {
				aClass178_Sub2_9153.method15032(aClass178_Sub2_9153.aClass345_9695);
				if (aClass178_Sub2_9153.aBool9647)
					aClass178_Sub2_9153.method14982(false);
				for (int i = 0; i < anIntArray9204.length; i++) {
					int i_433_ = anIntArray9203[i];
					int i_434_ = anIntArray9203[i + 1];
					int i_435_ = aShortArray9189[i_433_];
					boolean bool = false;
					byte i_436_ = 0;
					if (i_435_ != -1) {
						Class177 class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_435_ & 0xffff, -2058488523);
						class329.anInterface37_3478 = aClass178_Sub2_9153.aClass349_9586.method6095(class177);
						bool = !Class164_Sub5.method15499(class177.aByte1905, (byte) 89);
						class329.aClass441_3480.aFloatArray4916[12] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1885 / 64.0F % 1.0F);
						class329.aClass441_3480.aFloatArray4916[13] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1886 / 64.0F % 1.0F);
						if (class177.aClass593_1884 == Class593.aClass593_7812)
							i_436_ = class177.aByte1889;
					} else {
						class329.anInterface37_3478 = aClass178_Sub2_9153.anInterface37_9669;
						float[] fs = class329.aClass441_3480.aFloatArray4916;
						class329.aClass441_3480.aFloatArray4916[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass178_Sub2_9153.method15020(i_436_);
					class329.anInt3493 = anIntArray9204[i];
					class329.anInt3494 = anIntArray9205[i];
					class329.anInt3481 = i_433_ * 3;
					class329.anInt3496 = i_434_ - i_433_;
					class329.method5793(bool);
				}
			} else {
				aClass178_Sub2_9153.method15033(3, aClass357_9224.anInterface36_3726);
				aClass178_Sub2_9153.method15032(aClass178_Sub2_9153.aClass345_9568);
				Class435 class435_437_ = aClass178_Sub2_9153.aClass435_9559;
				class435_437_.method6803(class435);
				class435_437_.method6857();
				int i = 0;
				if (aClass178_Sub2_9153.aBool9647)
					aClass178_Sub2_9153.method14982(true);
				else {
					class329.aClass437_3492.method6972(aClass178_Sub2_9153.aFloatArray9608[0], aClass178_Sub2_9153.aFloatArray9608[1], aClass178_Sub2_9153.aFloatArray9608[2]);
					class329.aClass437_3492.method6909(class435_437_);
					class329.aClass437_3488.method6972((aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9689), (aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9614), (aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9704));
					class329.aClass437_3489.method6972((-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9689), (-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9614), (-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9704));
					class329.aClass437_3491.method6972((aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9689), (aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9614), (aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9704));
					if (aClass178_Sub2_9153.anInt9620 > 0) {
						i = aClass178_Sub2_9153.anInt9620;
						Class437 class437 = aClass178_Sub2_9153.aClass437_9562;
						for (int i_438_ = 0; i_438_ < i; i_438_++) {
							Class523_Sub20 class523_sub20 = (aClass178_Sub2_9153.aClass523_Sub20Array9671[i_438_]);
							int i_439_ = class523_sub20.method16067(856453637);
							class437.method6886(class523_sub20.aClass437_10497);
							class437.method6908(class435_437_);
							class329.aFloatArray3477[i_438_ * 4 + 0] = class437.aFloat4903;
							class329.aFloatArray3477[i_438_ * 4 + 1] = class437.aFloat4904;
							class329.aFloatArray3477[i_438_ * 4 + 2] = class437.aFloat4905;
							class329.aFloatArray3477[i_438_ * 4 + 3] = 1.0F / (float) (class523_sub20.method16066(-1879460461) * (class523_sub20.method16066(-1879460461)));
							float f = (class523_sub20.method16068((byte) 0) / 255.0F);
							class329.aFloatArray3476[i_438_ * 4 + 0] = (float) (i_439_ >> 16 & 0xff) * f;
							class329.aFloatArray3476[i_438_ * 4 + 1] = (float) (i_439_ >> 8 & 0xff) * f;
							class329.aFloatArray3476[i_438_ * 4 + 2] = (float) (i_439_ & 0xff) * f;
							class329.aFloatArray3476[i_438_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_440_ = 0; i_440_ < anIntArray9204.length; i_440_++) {
					int i_441_ = anIntArray9203[i_440_];
					int i_442_ = anIntArray9203[i_440_ + 1];
					int i_443_ = aShortArray9189[i_441_];
					byte i_444_ = 11;
					Class177 class177 = null;
					byte i_445_ = 0;
					if (i_443_ != -1) {
						class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_443_ & 0xffff, 194237139);
						class329.anInterface37_3478 = aClass178_Sub2_9153.aClass349_9586.method6095(class177);
						i_444_ = class177.aByte1905;
						class329.method5792(class177.aByte1906);
						class329.aClass441_3480.aFloatArray4916[12] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1885 / 64.0F % 1.0F);
						class329.aClass441_3480.aFloatArray4916[13] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1886 / 64.0F % 1.0F);
						if (class177.aClass593_1884 == Class593.aClass593_7812)
							i_445_ = class177.aByte1889;
					} else {
						class329.anInterface37_3478 = aClass178_Sub2_9153.anInterface37_9669;
						float[] fs = class329.aClass441_3480.aFloatArray4916;
						class329.aClass441_3480.aFloatArray4916[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass178_Sub2_9153.method15020(i_445_);
					class329.anInt3493 = anIntArray9204[i_440_];
					class329.anInt3494 = anIntArray9205[i_440_];
					class329.anInt3481 = i_441_ * 3;
					class329.anInt3496 = i_442_ - i_441_;
					switch (i_444_) {
					case 5:
						if (!aClass178_Sub2_9153.aBool9647) {
							Class340_Sub1_Sub1 class340_sub1_sub1 = aClass178_Sub2_9153.aClass340_Sub1_Sub1_9696;
							class340_sub1_sub1.method17880(class177.aByte1906, (class177.anInt1865 * -2058069491), (byte) -35);
							class340_sub1_sub1.aClass441_11478.method7090(class435);
							class340_sub1_sub1.aClass441_11476.method7090(class435);
							class340_sub1_sub1.aClass441_11476.method7089(aClass178_Sub2_9153.aClass441_9575);
							class340_sub1_sub1.anInt11484 = anIntArray9204[i_440_] * -1879255159;
							class340_sub1_sub1.anInt11470 = anIntArray9205[i_440_] * -525411447;
							class340_sub1_sub1.anInt11486 = i_441_ * 708813935;
							class340_sub1_sub1.anInt11487 = (i_442_ - i_441_) * -664263781;
							class340_sub1_sub1.method17879(-1458211156);
						} else
							class329.method5817(i);
						break;
					case 1:
						class329.aClass437_3487.method6972((aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[14]));
						class329.aClass437_3487.method6908(class435_437_);
						class329.method5795(i);
						break;
					case 6:
						class329.method5793(!Class164_Sub5.method15499(i_444_, (byte) 89));
						break;
					case 7:
						class329.aClass437_3487.method6972((aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[14]));
						class329.aClass437_3487.method6908(class435_437_);
						class329.aClass441_3474.method7090(class435);
						class329.anInterface39_3495 = aClass178_Sub2_9153.method14954();
						class329.method5807(i);
						break;
					default:
						class329.method5817(i);
					}
				}
			}
			method14600();
		}
	}

	void method14559(Class441 class441) {
		if (aClass371Array9211 != null) {
			aClass178_Sub2_9153.method3287(!aBool9184);
			Class435 class435 = aClass178_Sub2_9153.aClass435_9559;
			Class326 class326 = aClass178_Sub2_9153.aClass326_9645;
			boolean bool = aClass178_Sub2_9153.anInt9663 > 0;
			if (bool)
				class326.aClass437_3461.method6972(((float) (aClass178_Sub2_9153.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 0 & 0xff) / 255.0F));
			else
				class326.aClass437_3461.method6972(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9210; i++) {
				Class371 class371 = aClass371Array9211[i];
				Class337 class337 = aClass337Array9212[i];
				if (!class371.aBool3895 || !aClass178_Sub2_9153.method3146()) {
					float f = ((float) (anIntArray9158[class371.anInt3890] + anIntArray9158[class371.anInt3889] + anIntArray9158[class371.anInt3888]) * 0.3333333F);
					float f_446_ = ((float) (anIntArray9159[class371.anInt3890] + anIntArray9159[class371.anInt3889] + anIntArray9159[class371.anInt3888]) * 0.3333333F);
					float f_447_ = ((float) (anIntArray9160[class371.anInt3890] + anIntArray9160[class371.anInt3889] + anIntArray9160[class371.anInt3888]) * 0.3333333F);
					float f_448_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_446_ + class441.aFloatArray4916[8] * f_447_ + class441.aFloatArray4916[12]);
					float f_449_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_446_ + class441.aFloatArray4916[9] * f_447_ + class441.aFloatArray4916[13]);
					float f_450_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_446_ + class441.aFloatArray4916[10] * f_447_ + class441.aFloatArray4916[14]);
					float f_451_ = ((float) (1.0 / Math.sqrt((double) (f_448_ * f_448_ + f_449_ * f_449_ + f_450_ * f_450_))) * (float) class371.anInt3896);
					class435.method6856(class337.anInt3570, class337.anInt3566 * class371.aShort3892 >> 7, class337.anInt3567 * class371.aShort3893 >> 7, f_448_ + (float) class337.anInt3568 - f_448_ * f_451_, f_449_ + (float) class337.anInt3569 - f_449_ * f_451_, f_450_ - f_450_ * f_451_);
					class435.method6820(aClass178_Sub2_9153.aClass435_9552);
					aClass178_Sub2_9153.aClass441_9561.method7090(class435);
					class326.method5742(aClass178_Sub2_9153.aClass441_9561);
					class326.aClass441_3457.method7085();
					class326.anInt3458 = class337.anInt3565;
					if (bool)
						class326.aFloat3462 = 1.0F - ((aClass178_Sub2_9153.aFloat9681 - f_450_) / (aClass178_Sub2_9153.aFloat9681 - aClass178_Sub2_9153.aFloat9683));
					class326.anInterface37_3460 = null;
					if (class371.aShort3894 != -1)
						class326.anInterface37_3460 = (aClass178_Sub2_9153.aClass349_9586.method6095(aClass178_Sub2_9153.aClass172_1916.method2895(class371.aShort3894 & 0xffff, -1924902832)));
					class326.method5741(bool);
				}
			}
			aClass178_Sub2_9153.method3287(true);
		}
	}

	boolean method14560() {
		if (aClass336_9183.aBool3564)
			return true;
		if (aClass336_9183.anInterface40_3562 == null)
			aClass336_9183.anInterface40_3562 = aClass178_Sub2_9153.method15029(false);
		Interface40 interface40 = aClass336_9183.anInterface40_3562;
		interface40.method275(anInt9174 * 6);
		Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
		if (unsafe != null) {
			int i = anInt9174 * 6;
			long l = interface40.method274(0, i);
			if (l == 0L)
				return false;
			for (int i_452_ = 0; i_452_ < anInt9174; i_452_++) {
				unsafe.putShort(l, aShortArray9161[i_452_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9217[i_452_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9179[i_452_]);
				l += 2L;
			}
			interface40.method79();
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
		bytebuffer.clear();
		for (int i = 0; i < anInt9174; i++) {
			bytebuffer.putShort(aShortArray9161[i]);
			bytebuffer.putShort(aShortArray9217[i]);
			bytebuffer.putShort(aShortArray9179[i]);
		}
		if (interface40.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540)) {
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		return false;
	}

	boolean method14561() {
		boolean bool = !aClass357_9150.aBool3725;
		boolean bool_453_ = (anInt9185 & 0x37) != 0 && !aClass357_9224.aBool3725;
		boolean bool_454_ = !aClass357_9186.aBool3725;
		boolean bool_455_ = !aClass357_9187.aBool3725;
		if (!bool_454_ && !bool && !bool_453_ && !bool_455_)
			return true;
		boolean bool_456_ = true;
		if (bool_454_ && aShortArray9166 != null) {
			if (aClass357_9186.anInterface36_3727 == null)
				aClass357_9186.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9186.anInterface36_3727;
			interface36.method215(anInt9163 * 12, 12);
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 12;
				long l = interface36.method274(0, i);
				for (int i_457_ = 0; i_457_ < anInt9163; i_457_++) {
					short i_458_ = aShortArray9166[i_457_];
					unsafe.putFloat(l, (float) anIntArray9158[i_458_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9159[i_458_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9160[i_458_]);
					l += 4L;
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				for (int i = 0; i < anInt9163; i++) {
					bytebuffer.putFloat((float) anIntArray9158[aShortArray9166[i]]);
					bytebuffer.putFloat((float) anIntArray9159[aShortArray9166[i]]);
					bytebuffer.putFloat((float) anIntArray9160[aShortArray9166[i]]);
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9186.anInterface36_3726 = interface36;
			aClass357_9186.aBool3725 = true;
		}
		if (bool) {
			if (aClass357_9150.anInterface36_3727 == null)
				aClass357_9150.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9150.anInterface36_3727;
			interface36.method215(anInt9163 * 4, 4);
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 4;
				long l = interface36.method274(0, i);
				if ((anInt9185 & 0x37) == 0) {
					short[] is;
					short[] is_459_;
					short[] is_460_;
					byte[] is_461_;
					if (aClass367_9172 != null) {
						is = aClass367_9172.aShortArray3879;
						is_459_ = aClass367_9172.aShortArray3877;
						is_460_ = aClass367_9172.aShortArray3876;
						is_461_ = aClass367_9172.aByteArray3878;
					} else {
						is = aShortArray9164;
						is_459_ = aShortArray9167;
						is_460_ = aShortArray9168;
						is_461_ = aByteArray9169;
					}
					float f = (aClass178_Sub2_9153.aFloat9617 * 768.0F / (float) aShort9206);
					float f_462_ = (aClass178_Sub2_9153.aFloat9618 * 768.0F / (float) aShort9206);
					for (int i_463_ = 0; i_463_ < anInt9163; i_463_++) {
						short i_464_ = aShortArray9178[i_463_];
						int i_465_ = method14546(aShortArray9175[i_464_] & 0xffff, aShortArray9189[i_464_], aShort9149);
						float f_466_ = ((float) (i_465_ >> 16 & 0xff) * aClass178_Sub2_9153.aFloat9689);
						float f_467_ = ((float) (i_465_ >> 8 & 0xff) * aClass178_Sub2_9153.aFloat9614);
						float f_468_ = ((float) (i_465_ & 0xff) * aClass178_Sub2_9153.aFloat9704);
						byte i_469_ = is_461_[i_463_];
						float f_470_;
						if (i_469_ == 0)
							f_470_ = (((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i_463_]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_459_[i_463_]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_460_[i_463_])) * 0.0026041667F);
						else
							f_470_ = (((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i_463_]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_459_[i_463_]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_460_[i_463_])) / ((float) i_469_ * 256.0F));
						float f_471_ = (aClass178_Sub2_9153.aFloat9643 + f_470_ * (f_470_ < 0.0F ? f_462_ : f));
						int i_472_ = (int) (f_466_ * f_471_);
						if (i_472_ < 0)
							i_472_ = 0;
						else if (i_472_ > 255)
							i_472_ = 255;
						int i_473_ = (int) (f_467_ * f_471_);
						if (i_473_ < 0)
							i_473_ = 0;
						else if (i_473_ > 255)
							i_473_ = 255;
						int i_474_ = (int) (f_468_ * f_471_);
						if (i_474_ < 0)
							i_474_ = 0;
						else if (i_474_ > 255)
							i_474_ = 255;
						unsafe.putInt(l, (255 - aByteArray9176[i_464_] << 24 | i_472_ << 16 | i_473_ << 8 | i_474_));
						l += 4L;
					}
				} else {
					for (int i_475_ = 0; i_475_ < anInt9163; i_475_++) {
						short i_476_ = aShortArray9178[i_475_];
						int i_477_ = (255 - aByteArray9176[i_476_] << 24 | method14546(aShortArray9175[i_476_] & 0xffff, aShortArray9189[i_476_], aShort9149));
						unsafe.putInt(l, i_477_);
						l += 4L;
					}
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				if ((anInt9185 & 0x37) == 0) {
					short[] is;
					short[] is_478_;
					short[] is_479_;
					byte[] is_480_;
					if (aClass367_9172 != null) {
						is = aClass367_9172.aShortArray3879;
						is_478_ = aClass367_9172.aShortArray3877;
						is_479_ = aClass367_9172.aShortArray3876;
						is_480_ = aClass367_9172.aByteArray3878;
					} else {
						is = aShortArray9164;
						is_478_ = aShortArray9167;
						is_479_ = aShortArray9168;
						is_480_ = aByteArray9169;
					}
					float f = (aClass178_Sub2_9153.aFloat9617 * 768.0F / (float) aShort9206);
					float f_481_ = (aClass178_Sub2_9153.aFloat9618 * 768.0F / (float) aShort9206);
					for (int i = 0; i < anInt9163; i++) {
						short i_482_ = aShortArray9178[i];
						int i_483_ = method14546(aShortArray9175[i_482_] & 0xffff, aShortArray9189[i_482_], aShort9149);
						float f_484_ = ((float) (i_483_ >> 16 & 0xff) * aClass178_Sub2_9153.aFloat9689);
						float f_485_ = ((float) (i_483_ >> 8 & 0xff) * aClass178_Sub2_9153.aFloat9614);
						float f_486_ = ((float) (i_483_ & 0xff) * aClass178_Sub2_9153.aFloat9704);
						byte i_487_ = is_480_[i];
						float f_488_;
						if (i_487_ == 0)
							f_488_ = ((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_478_[i]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_479_[i])) * 0.0026041667F;
						else
							f_488_ = (((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_478_[i]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_479_[i])) / ((float) i_487_ * 256.0F));
						float f_489_ = (aClass178_Sub2_9153.aFloat9643 + f_488_ * (f_488_ < 0.0F ? f_481_ : f));
						int i_490_ = (int) (f_484_ * f_489_);
						if (i_490_ < 0)
							i_490_ = 0;
						else if (i_490_ > 255)
							i_490_ = 255;
						int i_491_ = (int) (f_485_ * f_489_);
						if (i_491_ < 0)
							i_491_ = 0;
						else if (i_491_ > 255)
							i_491_ = 255;
						int i_492_ = (int) (f_486_ * f_489_);
						if (i_492_ < 0)
							i_492_ = 0;
						else if (i_492_ > 255)
							i_492_ = 255;
						bytebuffer.putInt(255 - aByteArray9176[i_482_] << 24 | i_490_ << 16 | i_491_ << 8 | i_492_);
					}
				} else {
					for (int i = 0; i < anInt9163; i++) {
						short i_493_ = aShortArray9178[i];
						int i_494_ = (255 - aByteArray9176[i_493_] << 24 | method14546(aShortArray9175[i_493_] & 0xffff, aShortArray9189[i_493_], aShort9149));
						bytebuffer.putInt(i_494_);
					}
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9150.anInterface36_3726 = interface36;
			aClass357_9150.aBool3725 = true;
		}
		if (bool_453_) {
			if (aClass357_9224.anInterface36_3727 == null)
				aClass357_9224.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9224.anInterface36_3727;
			interface36.method215(anInt9163 * 12, 12);
			short[] is;
			short[] is_495_;
			short[] is_496_;
			byte[] is_497_;
			if (aClass367_9172 != null) {
				is = aClass367_9172.aShortArray3879;
				is_495_ = aClass367_9172.aShortArray3877;
				is_496_ = aClass367_9172.aShortArray3876;
				is_497_ = aClass367_9172.aByteArray3878;
			} else {
				is = aShortArray9164;
				is_495_ = aShortArray9167;
				is_496_ = aShortArray9168;
				is_497_ = aByteArray9169;
			}
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 12;
				long l = interface36.method274(0, i);
				for (int i_498_ = 0; i_498_ < anInt9163; i_498_++) {
					Class437 class437 = new Class437((float) is[i_498_], (float) is_495_[i_498_], (float) is_496_[i_498_]);
					if (class437.method6958() != 0.0F) {
						if (is_497_[i_498_] > 1)
							class437.method6905((float) is_497_[i_498_]);
						class437.method6890();
					}
					unsafe.putFloat(l, class437.aFloat4903);
					l += 4L;
					unsafe.putFloat(l, class437.aFloat4904);
					l += 4L;
					unsafe.putFloat(l, class437.aFloat4905);
					l += 4L;
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				for (int i = 0; i < anInt9163; i++) {
					Class437 class437 = new Class437((float) is[i], (float) is_495_[i], (float) is_496_[i]);
					if (class437.method6958() != 0.0F) {
						if (is_497_[i] > 1)
							class437.method6905((float) is_497_[i]);
						class437.method6890();
					}
					bytebuffer.putFloat(class437.aFloat4903);
					bytebuffer.putFloat(class437.aFloat4904);
					bytebuffer.putFloat(class437.aFloat4905);
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9224.anInterface36_3726 = interface36;
			aClass357_9224.aBool3725 = true;
		}
		if (bool_455_) {
			if (aClass357_9187.anInterface36_3727 == null)
				aClass357_9187.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9187.anInterface36_3727;
			interface36.method215(anInt9163 * 8, 8);
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 8;
				long l = interface36.method274(0, i);
				for (int i_499_ = 0; i_499_ < anInt9163; i_499_++) {
					unsafe.putFloat(l, aFloatArray9194[i_499_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9171[i_499_]);
					l += 4L;
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				for (int i = 0; i < anInt9163; i++) {
					bytebuffer.putFloat(aFloatArray9194[i]);
					bytebuffer.putFloat(aFloatArray9171[i]);
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9187.anInterface36_3726 = interface36;
			aClass357_9187.aBool3725 = true;
		}
		return bool_456_;
	}

	void method14562() {
		if (aClass357_9186 != null)
			aClass357_9186.method6275();
		if (aClass357_9187 != null)
			aClass357_9187.method6275();
		if (aClass357_9150 != null)
			aClass357_9150.method6275();
		if (aClass357_9224 != null)
			aClass357_9224.method6275();
		if (aClass336_9183 != null)
			aClass336_9183.method5931();
	}

	int method14563(int i, int i_500_) {
		i_500_ = i_500_ * (i & 0x7f) >> 7;
		if (i_500_ < 2)
			i_500_ = 2;
		else if (i_500_ > 126)
			i_500_ = 126;
		return (i & 0xff80) + i_500_;
	}

	public boolean method2831() {
		return aBool9191;
	}

	public void method2678(Class167 class167, int i, int i_501_, int i_502_, boolean bool) {
		Class167_Sub2 class167_sub2_503_ = (Class167_Sub2) class167;
		if (anInt9155 != 0 && class167_sub2_503_.anInt9155 != 0) {
			int i_504_ = class167_sub2_503_.anInt9157;
			int[] is = class167_sub2_503_.anIntArray9158;
			int[] is_505_ = class167_sub2_503_.anIntArray9159;
			int[] is_506_ = class167_sub2_503_.anIntArray9160;
			short[] is_507_ = class167_sub2_503_.aShortArray9164;
			short[] is_508_ = class167_sub2_503_.aShortArray9167;
			short[] is_509_ = class167_sub2_503_.aShortArray9168;
			byte[] is_510_ = class167_sub2_503_.aByteArray9169;
			short[] is_511_;
			short[] is_512_;
			short[] is_513_;
			byte[] is_514_;
			if (aClass367_9172 != null) {
				is_511_ = aClass367_9172.aShortArray3879;
				is_512_ = aClass367_9172.aShortArray3877;
				is_513_ = aClass367_9172.aShortArray3876;
				is_514_ = aClass367_9172.aByteArray3878;
			} else {
				is_511_ = null;
				is_512_ = null;
				is_513_ = null;
				is_514_ = null;
			}
			short[] is_515_;
			short[] is_516_;
			short[] is_517_;
			byte[] is_518_;
			if (class167_sub2_503_.aClass367_9172 != null) {
				is_515_ = class167_sub2_503_.aClass367_9172.aShortArray3879;
				is_516_ = class167_sub2_503_.aClass367_9172.aShortArray3877;
				is_517_ = class167_sub2_503_.aClass367_9172.aShortArray3876;
				is_518_ = class167_sub2_503_.aClass367_9172.aByteArray3878;
			} else {
				is_515_ = null;
				is_516_ = null;
				is_517_ = null;
				is_518_ = null;
			}
			int[] is_519_ = class167_sub2_503_.anIntArray9199;
			short[] is_520_ = class167_sub2_503_.aShortArray9207;
			if (!class167_sub2_503_.aBool9215)
				class167_sub2_503_.method14569();
			int i_521_ = class167_sub2_503_.anInt9195;
			int i_522_ = class167_sub2_503_.anInt9196;
			int i_523_ = class167_sub2_503_.anInt9197;
			int i_524_ = class167_sub2_503_.anInt9165;
			int i_525_ = class167_sub2_503_.anInt9154;
			int i_526_ = class167_sub2_503_.anInt9200;
			for (int i_527_ = 0; i_527_ < anInt9157; i_527_++) {
				int i_528_ = anIntArray9159[i_527_] - i_501_;
				if (i_528_ >= i_521_ && i_528_ <= i_522_) {
					int i_529_ = anIntArray9158[i_527_] - i;
					if (i_529_ >= i_523_ && i_529_ <= i_524_) {
						int i_530_ = anIntArray9160[i_527_] - i_502_;
						if (i_530_ >= i_525_ && i_530_ <= i_526_) {
							int i_531_ = -1;
							int i_532_ = anIntArray9199[i_527_];
							int i_533_ = anIntArray9199[i_527_ + 1];
							for (int i_534_ = i_532_; (i_534_ < i_533_ && aShortArray9207[i_534_] != 0); i_534_++) {
								i_531_ = (aShortArray9207[i_534_] & 0xffff) - 1;
								if (aByteArray9169[i_531_] != 0)
									break;
							}
							if (i_531_ != -1) {
								for (int i_535_ = 0; i_535_ < i_504_; i_535_++) {
									if (i_529_ == is[i_535_] && i_530_ == is_506_[i_535_] && i_528_ == is_505_[i_535_]) {
										int i_536_ = -1;
										i_532_ = is_519_[i_535_];
										i_533_ = is_519_[i_535_ + 1];
										for (int i_537_ = i_532_; (i_537_ < i_533_ && is_520_[i_537_] != 0); i_537_++) {
											i_536_ = is_520_[i_537_] - 1 & 0xffff;
											if (is_510_[i_536_] != 0)
												break;
										}
										if (i_536_ != -1) {
											if (is_511_ == null) {
												aClass367_9172 = new Class367();
												is_511_ = aClass367_9172.aShortArray3879 = (Class246.method4386(aShortArray9164, 476563616));
												is_512_ = aClass367_9172.aShortArray3877 = (Class246.method4386(aShortArray9167, -940118172));
												is_513_ = aClass367_9172.aShortArray3876 = (Class246.method4386(aShortArray9168, 353863667));
												is_514_ = aClass367_9172.aByteArray3878 = (Class60.method1408(aByteArray9169, -526646258));
											}
											if (is_515_ == null) {
												Class367 class367 = (class167_sub2_503_.aClass367_9172 = new Class367());
												is_515_ = class367.aShortArray3879 = (Class246.method4386(is_507_, -287888975));
												is_516_ = class367.aShortArray3877 = (Class246.method4386(is_508_, -168695018));
												is_517_ = class367.aShortArray3876 = (Class246.method4386(is_509_, -83124520));
												is_518_ = class367.aByteArray3878 = (Class60.method1408(is_510_, -1589991906));
											}
											short i_538_ = aShortArray9164[i_531_];
											short i_539_ = aShortArray9167[i_531_];
											short i_540_ = aShortArray9168[i_531_];
											byte i_541_ = aByteArray9169[i_531_];
											i_532_ = is_519_[i_535_];
											i_533_ = is_519_[i_535_ + 1];
											for (int i_542_ = i_532_; i_542_ < i_533_; i_542_++) {
												int i_543_ = is_520_[i_542_] - 1;
												if (i_543_ == -1)
													break;
												if (is_518_[i_543_] != 0) {
													is_515_[i_543_] += i_538_;
													is_516_[i_543_] += i_539_;
													is_517_[i_543_] += i_540_;
													is_518_[i_543_] += i_541_;
												}
											}
											i_538_ = is_507_[i_536_];
											i_539_ = is_508_[i_536_];
											i_540_ = is_509_[i_536_];
											i_541_ = is_510_[i_536_];
											i_532_ = anIntArray9199[i_527_];
											i_533_ = anIntArray9199[i_527_ + 1];
											for (int i_544_ = i_532_; (i_544_ < i_533_ && (aShortArray9207[i_544_] != 0)); i_544_++) {
												int i_545_ = ((aShortArray9207[i_544_] & 0xffff) - 1);
												if (is_514_[i_545_] != 0) {
													is_511_[i_545_] += i_538_;
													is_512_[i_545_] += i_539_;
													is_513_[i_545_] += i_540_;
													is_514_[i_545_] += i_541_;
												}
											}
											class167_sub2_503_.method14548();
											method14548();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2737(Class167 class167, int i, int i_546_, int i_547_, boolean bool) {
		Class167_Sub2 class167_sub2_548_ = (Class167_Sub2) class167;
		if (anInt9155 != 0 && class167_sub2_548_.anInt9155 != 0) {
			int i_549_ = class167_sub2_548_.anInt9157;
			int[] is = class167_sub2_548_.anIntArray9158;
			int[] is_550_ = class167_sub2_548_.anIntArray9159;
			int[] is_551_ = class167_sub2_548_.anIntArray9160;
			short[] is_552_ = class167_sub2_548_.aShortArray9164;
			short[] is_553_ = class167_sub2_548_.aShortArray9167;
			short[] is_554_ = class167_sub2_548_.aShortArray9168;
			byte[] is_555_ = class167_sub2_548_.aByteArray9169;
			short[] is_556_;
			short[] is_557_;
			short[] is_558_;
			byte[] is_559_;
			if (aClass367_9172 != null) {
				is_556_ = aClass367_9172.aShortArray3879;
				is_557_ = aClass367_9172.aShortArray3877;
				is_558_ = aClass367_9172.aShortArray3876;
				is_559_ = aClass367_9172.aByteArray3878;
			} else {
				is_556_ = null;
				is_557_ = null;
				is_558_ = null;
				is_559_ = null;
			}
			short[] is_560_;
			short[] is_561_;
			short[] is_562_;
			byte[] is_563_;
			if (class167_sub2_548_.aClass367_9172 != null) {
				is_560_ = class167_sub2_548_.aClass367_9172.aShortArray3879;
				is_561_ = class167_sub2_548_.aClass367_9172.aShortArray3877;
				is_562_ = class167_sub2_548_.aClass367_9172.aShortArray3876;
				is_563_ = class167_sub2_548_.aClass367_9172.aByteArray3878;
			} else {
				is_560_ = null;
				is_561_ = null;
				is_562_ = null;
				is_563_ = null;
			}
			int[] is_564_ = class167_sub2_548_.anIntArray9199;
			short[] is_565_ = class167_sub2_548_.aShortArray9207;
			if (!class167_sub2_548_.aBool9215)
				class167_sub2_548_.method14569();
			int i_566_ = class167_sub2_548_.anInt9195;
			int i_567_ = class167_sub2_548_.anInt9196;
			int i_568_ = class167_sub2_548_.anInt9197;
			int i_569_ = class167_sub2_548_.anInt9165;
			int i_570_ = class167_sub2_548_.anInt9154;
			int i_571_ = class167_sub2_548_.anInt9200;
			for (int i_572_ = 0; i_572_ < anInt9157; i_572_++) {
				int i_573_ = anIntArray9159[i_572_] - i_546_;
				if (i_573_ >= i_566_ && i_573_ <= i_567_) {
					int i_574_ = anIntArray9158[i_572_] - i;
					if (i_574_ >= i_568_ && i_574_ <= i_569_) {
						int i_575_ = anIntArray9160[i_572_] - i_547_;
						if (i_575_ >= i_570_ && i_575_ <= i_571_) {
							int i_576_ = -1;
							int i_577_ = anIntArray9199[i_572_];
							int i_578_ = anIntArray9199[i_572_ + 1];
							for (int i_579_ = i_577_; (i_579_ < i_578_ && aShortArray9207[i_579_] != 0); i_579_++) {
								i_576_ = (aShortArray9207[i_579_] & 0xffff) - 1;
								if (aByteArray9169[i_576_] != 0)
									break;
							}
							if (i_576_ != -1) {
								for (int i_580_ = 0; i_580_ < i_549_; i_580_++) {
									if (i_574_ == is[i_580_] && i_575_ == is_551_[i_580_] && i_573_ == is_550_[i_580_]) {
										int i_581_ = -1;
										i_577_ = is_564_[i_580_];
										i_578_ = is_564_[i_580_ + 1];
										for (int i_582_ = i_577_; (i_582_ < i_578_ && is_565_[i_582_] != 0); i_582_++) {
											i_581_ = is_565_[i_582_] - 1 & 0xffff;
											if (is_555_[i_581_] != 0)
												break;
										}
										if (i_581_ != -1) {
											if (is_556_ == null) {
												aClass367_9172 = new Class367();
												is_556_ = aClass367_9172.aShortArray3879 = (Class246.method4386(aShortArray9164, -1287463480));
												is_557_ = aClass367_9172.aShortArray3877 = (Class246.method4386(aShortArray9167, -1164494300));
												is_558_ = aClass367_9172.aShortArray3876 = (Class246.method4386(aShortArray9168, -1178726564));
												is_559_ = aClass367_9172.aByteArray3878 = (Class60.method1408(aByteArray9169, -1137675004));
											}
											if (is_560_ == null) {
												Class367 class367 = (class167_sub2_548_.aClass367_9172 = new Class367());
												is_560_ = class367.aShortArray3879 = (Class246.method4386(is_552_, 235384460));
												is_561_ = class367.aShortArray3877 = (Class246.method4386(is_553_, -454981344));
												is_562_ = class367.aShortArray3876 = (Class246.method4386(is_554_, -965322824));
												is_563_ = class367.aByteArray3878 = (Class60.method1408(is_555_, -861380762));
											}
											short i_583_ = aShortArray9164[i_576_];
											short i_584_ = aShortArray9167[i_576_];
											short i_585_ = aShortArray9168[i_576_];
											byte i_586_ = aByteArray9169[i_576_];
											i_577_ = is_564_[i_580_];
											i_578_ = is_564_[i_580_ + 1];
											for (int i_587_ = i_577_; i_587_ < i_578_; i_587_++) {
												int i_588_ = is_565_[i_587_] - 1;
												if (i_588_ == -1)
													break;
												if (is_563_[i_588_] != 0) {
													is_560_[i_588_] += i_583_;
													is_561_[i_588_] += i_584_;
													is_562_[i_588_] += i_585_;
													is_563_[i_588_] += i_586_;
												}
											}
											i_583_ = is_552_[i_581_];
											i_584_ = is_553_[i_581_];
											i_585_ = is_554_[i_581_];
											i_586_ = is_555_[i_581_];
											i_577_ = anIntArray9199[i_572_];
											i_578_ = anIntArray9199[i_572_ + 1];
											for (int i_589_ = i_577_; (i_589_ < i_578_ && (aShortArray9207[i_589_] != 0)); i_589_++) {
												int i_590_ = ((aShortArray9207[i_589_] & 0xffff) - 1);
												if (is_559_[i_590_] != 0) {
													is_556_[i_590_] += i_583_;
													is_557_[i_590_] += i_584_;
													is_558_[i_590_] += i_585_;
													is_559_[i_590_] += i_586_;
												}
											}
											class167_sub2_548_.method14548();
											method14548();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2738(Class167 class167, int i, int i_591_, int i_592_, boolean bool) {
		Class167_Sub2 class167_sub2_593_ = (Class167_Sub2) class167;
		if (anInt9155 != 0 && class167_sub2_593_.anInt9155 != 0) {
			int i_594_ = class167_sub2_593_.anInt9157;
			int[] is = class167_sub2_593_.anIntArray9158;
			int[] is_595_ = class167_sub2_593_.anIntArray9159;
			int[] is_596_ = class167_sub2_593_.anIntArray9160;
			short[] is_597_ = class167_sub2_593_.aShortArray9164;
			short[] is_598_ = class167_sub2_593_.aShortArray9167;
			short[] is_599_ = class167_sub2_593_.aShortArray9168;
			byte[] is_600_ = class167_sub2_593_.aByteArray9169;
			short[] is_601_;
			short[] is_602_;
			short[] is_603_;
			byte[] is_604_;
			if (aClass367_9172 != null) {
				is_601_ = aClass367_9172.aShortArray3879;
				is_602_ = aClass367_9172.aShortArray3877;
				is_603_ = aClass367_9172.aShortArray3876;
				is_604_ = aClass367_9172.aByteArray3878;
			} else {
				is_601_ = null;
				is_602_ = null;
				is_603_ = null;
				is_604_ = null;
			}
			short[] is_605_;
			short[] is_606_;
			short[] is_607_;
			byte[] is_608_;
			if (class167_sub2_593_.aClass367_9172 != null) {
				is_605_ = class167_sub2_593_.aClass367_9172.aShortArray3879;
				is_606_ = class167_sub2_593_.aClass367_9172.aShortArray3877;
				is_607_ = class167_sub2_593_.aClass367_9172.aShortArray3876;
				is_608_ = class167_sub2_593_.aClass367_9172.aByteArray3878;
			} else {
				is_605_ = null;
				is_606_ = null;
				is_607_ = null;
				is_608_ = null;
			}
			int[] is_609_ = class167_sub2_593_.anIntArray9199;
			short[] is_610_ = class167_sub2_593_.aShortArray9207;
			if (!class167_sub2_593_.aBool9215)
				class167_sub2_593_.method14569();
			int i_611_ = class167_sub2_593_.anInt9195;
			int i_612_ = class167_sub2_593_.anInt9196;
			int i_613_ = class167_sub2_593_.anInt9197;
			int i_614_ = class167_sub2_593_.anInt9165;
			int i_615_ = class167_sub2_593_.anInt9154;
			int i_616_ = class167_sub2_593_.anInt9200;
			for (int i_617_ = 0; i_617_ < anInt9157; i_617_++) {
				int i_618_ = anIntArray9159[i_617_] - i_591_;
				if (i_618_ >= i_611_ && i_618_ <= i_612_) {
					int i_619_ = anIntArray9158[i_617_] - i;
					if (i_619_ >= i_613_ && i_619_ <= i_614_) {
						int i_620_ = anIntArray9160[i_617_] - i_592_;
						if (i_620_ >= i_615_ && i_620_ <= i_616_) {
							int i_621_ = -1;
							int i_622_ = anIntArray9199[i_617_];
							int i_623_ = anIntArray9199[i_617_ + 1];
							for (int i_624_ = i_622_; (i_624_ < i_623_ && aShortArray9207[i_624_] != 0); i_624_++) {
								i_621_ = (aShortArray9207[i_624_] & 0xffff) - 1;
								if (aByteArray9169[i_621_] != 0)
									break;
							}
							if (i_621_ != -1) {
								for (int i_625_ = 0; i_625_ < i_594_; i_625_++) {
									if (i_619_ == is[i_625_] && i_620_ == is_596_[i_625_] && i_618_ == is_595_[i_625_]) {
										int i_626_ = -1;
										i_622_ = is_609_[i_625_];
										i_623_ = is_609_[i_625_ + 1];
										for (int i_627_ = i_622_; (i_627_ < i_623_ && is_610_[i_627_] != 0); i_627_++) {
											i_626_ = is_610_[i_627_] - 1 & 0xffff;
											if (is_600_[i_626_] != 0)
												break;
										}
										if (i_626_ != -1) {
											if (is_601_ == null) {
												aClass367_9172 = new Class367();
												is_601_ = aClass367_9172.aShortArray3879 = (Class246.method4386(aShortArray9164, -1248476476));
												is_602_ = aClass367_9172.aShortArray3877 = (Class246.method4386(aShortArray9167, -932937203));
												is_603_ = aClass367_9172.aShortArray3876 = (Class246.method4386(aShortArray9168, -1213348769));
												is_604_ = aClass367_9172.aByteArray3878 = (Class60.method1408(aByteArray9169, -702278026));
											}
											if (is_605_ == null) {
												Class367 class367 = (class167_sub2_593_.aClass367_9172 = new Class367());
												is_605_ = class367.aShortArray3879 = (Class246.method4386(is_597_, -752986013));
												is_606_ = class367.aShortArray3877 = (Class246.method4386(is_598_, -733700158));
												is_607_ = class367.aShortArray3876 = (Class246.method4386(is_599_, -1860841210));
												is_608_ = class367.aByteArray3878 = (Class60.method1408(is_600_, -1308430228));
											}
											short i_628_ = aShortArray9164[i_621_];
											short i_629_ = aShortArray9167[i_621_];
											short i_630_ = aShortArray9168[i_621_];
											byte i_631_ = aByteArray9169[i_621_];
											i_622_ = is_609_[i_625_];
											i_623_ = is_609_[i_625_ + 1];
											for (int i_632_ = i_622_; i_632_ < i_623_; i_632_++) {
												int i_633_ = is_610_[i_632_] - 1;
												if (i_633_ == -1)
													break;
												if (is_608_[i_633_] != 0) {
													is_605_[i_633_] += i_628_;
													is_606_[i_633_] += i_629_;
													is_607_[i_633_] += i_630_;
													is_608_[i_633_] += i_631_;
												}
											}
											i_628_ = is_597_[i_626_];
											i_629_ = is_598_[i_626_];
											i_630_ = is_599_[i_626_];
											i_631_ = is_600_[i_626_];
											i_622_ = anIntArray9199[i_617_];
											i_623_ = anIntArray9199[i_617_ + 1];
											for (int i_634_ = i_622_; (i_634_ < i_623_ && (aShortArray9207[i_634_] != 0)); i_634_++) {
												int i_635_ = ((aShortArray9207[i_634_] & 0xffff) - 1);
												if (is_604_[i_635_] != 0) {
													is_601_[i_635_] += i_628_;
													is_602_[i_635_] += i_629_;
													is_603_[i_635_] += i_630_;
													is_604_[i_635_] += i_631_;
												}
											}
											class167_sub2_593_.method14548();
											method14548();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2739(Class167 class167, int i, int i_636_, int i_637_, boolean bool) {
		Class167_Sub2 class167_sub2_638_ = (Class167_Sub2) class167;
		if (anInt9155 != 0 && class167_sub2_638_.anInt9155 != 0) {
			int i_639_ = class167_sub2_638_.anInt9157;
			int[] is = class167_sub2_638_.anIntArray9158;
			int[] is_640_ = class167_sub2_638_.anIntArray9159;
			int[] is_641_ = class167_sub2_638_.anIntArray9160;
			short[] is_642_ = class167_sub2_638_.aShortArray9164;
			short[] is_643_ = class167_sub2_638_.aShortArray9167;
			short[] is_644_ = class167_sub2_638_.aShortArray9168;
			byte[] is_645_ = class167_sub2_638_.aByteArray9169;
			short[] is_646_;
			short[] is_647_;
			short[] is_648_;
			byte[] is_649_;
			if (aClass367_9172 != null) {
				is_646_ = aClass367_9172.aShortArray3879;
				is_647_ = aClass367_9172.aShortArray3877;
				is_648_ = aClass367_9172.aShortArray3876;
				is_649_ = aClass367_9172.aByteArray3878;
			} else {
				is_646_ = null;
				is_647_ = null;
				is_648_ = null;
				is_649_ = null;
			}
			short[] is_650_;
			short[] is_651_;
			short[] is_652_;
			byte[] is_653_;
			if (class167_sub2_638_.aClass367_9172 != null) {
				is_650_ = class167_sub2_638_.aClass367_9172.aShortArray3879;
				is_651_ = class167_sub2_638_.aClass367_9172.aShortArray3877;
				is_652_ = class167_sub2_638_.aClass367_9172.aShortArray3876;
				is_653_ = class167_sub2_638_.aClass367_9172.aByteArray3878;
			} else {
				is_650_ = null;
				is_651_ = null;
				is_652_ = null;
				is_653_ = null;
			}
			int[] is_654_ = class167_sub2_638_.anIntArray9199;
			short[] is_655_ = class167_sub2_638_.aShortArray9207;
			if (!class167_sub2_638_.aBool9215)
				class167_sub2_638_.method14569();
			int i_656_ = class167_sub2_638_.anInt9195;
			int i_657_ = class167_sub2_638_.anInt9196;
			int i_658_ = class167_sub2_638_.anInt9197;
			int i_659_ = class167_sub2_638_.anInt9165;
			int i_660_ = class167_sub2_638_.anInt9154;
			int i_661_ = class167_sub2_638_.anInt9200;
			for (int i_662_ = 0; i_662_ < anInt9157; i_662_++) {
				int i_663_ = anIntArray9159[i_662_] - i_636_;
				if (i_663_ >= i_656_ && i_663_ <= i_657_) {
					int i_664_ = anIntArray9158[i_662_] - i;
					if (i_664_ >= i_658_ && i_664_ <= i_659_) {
						int i_665_ = anIntArray9160[i_662_] - i_637_;
						if (i_665_ >= i_660_ && i_665_ <= i_661_) {
							int i_666_ = -1;
							int i_667_ = anIntArray9199[i_662_];
							int i_668_ = anIntArray9199[i_662_ + 1];
							for (int i_669_ = i_667_; (i_669_ < i_668_ && aShortArray9207[i_669_] != 0); i_669_++) {
								i_666_ = (aShortArray9207[i_669_] & 0xffff) - 1;
								if (aByteArray9169[i_666_] != 0)
									break;
							}
							if (i_666_ != -1) {
								for (int i_670_ = 0; i_670_ < i_639_; i_670_++) {
									if (i_664_ == is[i_670_] && i_665_ == is_641_[i_670_] && i_663_ == is_640_[i_670_]) {
										int i_671_ = -1;
										i_667_ = is_654_[i_670_];
										i_668_ = is_654_[i_670_ + 1];
										for (int i_672_ = i_667_; (i_672_ < i_668_ && is_655_[i_672_] != 0); i_672_++) {
											i_671_ = is_655_[i_672_] - 1 & 0xffff;
											if (is_645_[i_671_] != 0)
												break;
										}
										if (i_671_ != -1) {
											if (is_646_ == null) {
												aClass367_9172 = new Class367();
												is_646_ = aClass367_9172.aShortArray3879 = (Class246.method4386(aShortArray9164, -264783438));
												is_647_ = aClass367_9172.aShortArray3877 = (Class246.method4386(aShortArray9167, -2079477872));
												is_648_ = aClass367_9172.aShortArray3876 = (Class246.method4386(aShortArray9168, -1187297098));
												is_649_ = aClass367_9172.aByteArray3878 = (Class60.method1408(aByteArray9169, -745319978));
											}
											if (is_650_ == null) {
												Class367 class367 = (class167_sub2_638_.aClass367_9172 = new Class367());
												is_650_ = class367.aShortArray3879 = (Class246.method4386(is_642_, -1122155459));
												is_651_ = class367.aShortArray3877 = (Class246.method4386(is_643_, -1372957364));
												is_652_ = class367.aShortArray3876 = (Class246.method4386(is_644_, -777951252));
												is_653_ = class367.aByteArray3878 = (Class60.method1408(is_645_, -1983581083));
											}
											short i_673_ = aShortArray9164[i_666_];
											short i_674_ = aShortArray9167[i_666_];
											short i_675_ = aShortArray9168[i_666_];
											byte i_676_ = aByteArray9169[i_666_];
											i_667_ = is_654_[i_670_];
											i_668_ = is_654_[i_670_ + 1];
											for (int i_677_ = i_667_; i_677_ < i_668_; i_677_++) {
												int i_678_ = is_655_[i_677_] - 1;
												if (i_678_ == -1)
													break;
												if (is_653_[i_678_] != 0) {
													is_650_[i_678_] += i_673_;
													is_651_[i_678_] += i_674_;
													is_652_[i_678_] += i_675_;
													is_653_[i_678_] += i_676_;
												}
											}
											i_673_ = is_642_[i_671_];
											i_674_ = is_643_[i_671_];
											i_675_ = is_644_[i_671_];
											i_676_ = is_645_[i_671_];
											i_667_ = anIntArray9199[i_662_];
											i_668_ = anIntArray9199[i_662_ + 1];
											for (int i_679_ = i_667_; (i_679_ < i_668_ && (aShortArray9207[i_679_] != 0)); i_679_++) {
												int i_680_ = ((aShortArray9207[i_679_] & 0xffff) - 1);
												if (is_649_[i_680_] != 0) {
													is_646_[i_680_] += i_673_;
													is_647_[i_680_] += i_674_;
													is_648_[i_680_] += i_675_;
													is_649_[i_680_] += i_676_;
												}
											}
											class167_sub2_638_.method14548();
											method14548();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2715(byte i, byte[] is) {
		if (is == null) {
			for (int i_681_ = 0; i_681_ < anInt9155; i_681_++)
				aByteArray9176[i_681_] = i;
		} else {
			for (int i_682_ = 0; i_682_ < anInt9155; i_682_++) {
				int i_683_ = 255 - ((255 - (is[i_682_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9176[i_682_] = (byte) i_683_;
			}
		}
		method14547();
	}

	public void method2817(short i, short i_684_) {
		Class172 class172 = aClass178_Sub2_9153.aClass172_1916;
		for (int i_685_ = 0; i_685_ < anInt9155; i_685_++) {
			if (aShortArray9189[i_685_] == i)
				aShortArray9189[i_685_] = i_684_;
		}
		byte i_686_ = 0;
		byte i_687_ = 0;
		if (i != -1) {
			Class177 class177 = class172.method2895(i & 0xffff, -1964427122);
			i_686_ = class177.aByte1912;
			i_687_ = class177.aByte1883;
		}
		byte i_688_ = 0;
		byte i_689_ = 0;
		if (i_684_ != -1) {
			Class177 class177 = class172.method2895(i_684_ & 0xffff, 595557668);
			i_688_ = class177.aByte1912;
			i_689_ = class177.aByte1883;
			if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
				aBool9191 = true;
		}
		if (i_686_ != i_688_ | i_687_ != i_689_) {
			if (aClass371Array9211 != null) {
				for (int i_690_ = 0; i_690_ < anInt9210; i_690_++) {
					Class371 class371 = aClass371Array9211[i_690_];
					Class337 class337 = aClass337Array9212[i_690_];
					class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
				}
			}
			method14547();
		}
	}

	public int method2742() {
		return anInt9152;
	}

	public int method2743() {
		return anInt9152;
	}

	static short[] method14564(short[] is, int i) {
		short[] is_691_ = new short[i];
		System.arraycopy(is, 0, is_691_, 0, i);
		return is_691_;
	}

	public void method2745(int i) {
		if (aClass357_9186 != null)
			aClass357_9186.aBool3724 = Class347.method6011(i, anInt9185);
		if (aClass357_9187 != null)
			aClass357_9187.aBool3724 = Class347.method6014(i, anInt9185);
		if (aClass357_9150 != null)
			aClass357_9150.aBool3724 = Class347.method6092(i, anInt9185);
		if (aClass357_9224 != null)
			aClass357_9224.aBool3724 = Class347.method6012(i, anInt9185);
		anInt9152 = i;
		if (aClass367_9172 != null && (anInt9152 & 0x10000) == 0) {
			aShortArray9164 = aClass367_9172.aShortArray3879;
			aShortArray9167 = aClass367_9172.aShortArray3877;
			aShortArray9168 = aClass367_9172.aShortArray3876;
			aByteArray9169 = aClass367_9172.aByteArray3878;
			aClass367_9172 = null;
		}
		aBool9182 = true;
		method14600();
	}

	void method14565() {
		if (aClass357_9186 != null)
			aClass357_9186.method6275();
		if (aClass357_9187 != null)
			aClass357_9187.method6275();
		if (aClass357_9150 != null)
			aClass357_9150.method6275();
		if (aClass357_9224 != null)
			aClass357_9224.method6275();
		if (aClass336_9183 != null)
			aClass336_9183.method5931();
	}

	void method14566() {
		if (aClass336_9183 != null)
			aClass336_9183.aBool3564 = false;
	}

	public void method2748(int i) {
		int i_692_ = Class433.anIntArray4880[i];
		int i_693_ = Class433.anIntArray4881[i];
		for (int i_694_ = 0; i_694_ < anInt9157; i_694_++) {
			int i_695_ = ((anIntArray9160[i_694_] * i_692_ + anIntArray9158[i_694_] * i_693_) >> 14);
			anIntArray9160[i_694_] = (anIntArray9160[i_694_] * i_693_ - anIntArray9158[i_694_] * i_692_) >> 14;
			anIntArray9158[i_694_] = i_695_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2749(int i) {
		int i_696_ = Class433.anIntArray4880[i];
		int i_697_ = Class433.anIntArray4881[i];
		for (int i_698_ = 0; i_698_ < anInt9157; i_698_++) {
			int i_699_ = ((anIntArray9160[i_698_] * i_696_ + anIntArray9158[i_698_] * i_697_) >> 14);
			anIntArray9160[i_698_] = (anIntArray9160[i_698_] * i_697_ - anIntArray9158[i_698_] * i_696_) >> 14;
			anIntArray9158[i_698_] = i_699_;
		}
		for (int i_700_ = 0; i_700_ < anInt9163; i_700_++) {
			int i_701_ = ((aShortArray9168[i_700_] * i_696_ + aShortArray9164[i_700_] * i_697_) >> 14);
			aShortArray9168[i_700_] = (short) ((aShortArray9168[i_700_] * i_697_ - aShortArray9164[i_700_] * i_696_) >> 14);
			aShortArray9164[i_700_] = (short) i_701_;
		}
		method14577();
		method14548();
		aBool9215 = false;
	}

	public void method2763(int i, int i_702_, Class142 class142, Class142 class142_703_, int i_704_, int i_705_, int i_706_) {
		if (!aBool9215)
			method14569();
		int i_707_ = i_704_ + anInt9197;
		int i_708_ = i_704_ + anInt9165;
		int i_709_ = i_706_ + anInt9154;
		int i_710_ = i_706_ + anInt9200;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_707_ >= 0 && ((i_708_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_709_ >= 0 && ((i_710_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_703_ == null || (i_707_ < 0 || ((i_708_ + class142_703_.anInt1682 * 341909049 >> class142_703_.anInt1680 * -1193058675) >= class142_703_.anInt1683 * 692304099) || i_709_ < 0 || ((i_710_ + class142_703_.anInt1682 * 341909049 >> class142_703_.anInt1680 * -1193058675) >= class142_703_.anInt1681 * 452998539)))
					return;
			} else {
				i_707_ >>= class142.anInt1680 * -1193058675;
				i_708_ = (i_708_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_709_ >>= class142.anInt1680 * -1193058675;
				i_710_ = (i_710_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_707_, i_709_, 1794876631) == i_705_ && (class142.method2321(i_708_, i_709_, 1975575333) == i_705_) && (class142.method2321(i_707_, i_710_, 2028909640) == i_705_) && (class142.method2321(i_708_, i_710_, 1948283423) == i_705_))
					return;
			}
			if (i == 1) {
				for (int i_711_ = 0; i_711_ < anInt9157; i_711_++)
					anIntArray9159[i_711_] = (anIntArray9159[i_711_] + class142.method2327((anIntArray9158[i_711_] + i_704_), (anIntArray9160[i_711_] + i_706_), 611720332) - i_705_);
			} else if (i == 2) {
				int i_712_ = anInt9195;
				if (i_712_ == 0)
					return;
				for (int i_713_ = 0; i_713_ < anInt9157; i_713_++) {
					int i_714_ = (anIntArray9159[i_713_] << 16) / i_712_;
					if (i_714_ < i_702_)
						anIntArray9159[i_713_] = (anIntArray9159[i_713_] + (class142.method2327((anIntArray9158[i_713_] + i_704_), (anIntArray9160[i_713_] + i_706_), 591618762) - i_705_) * (i_702_ - i_714_) / i_702_);
				}
			} else if (i == 3) {
				int i_715_ = (i_702_ & 0xff) * 16;
				int i_716_ = (i_702_ >> 8 & 0xff) * 16;
				int i_717_ = (i_702_ >> 16 & 0xff) << 6;
				int i_718_ = (i_702_ >> 24 & 0xff) << 6;
				if (i_704_ - (i_715_ >> 1) < 0 || (i_704_ + (i_715_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_706_ - (i_716_ >> 1) < 0 || (i_706_ + (i_716_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_704_, i_705_, i_706_, i_715_, i_716_, i_717_, i_718_);
			} else if (i == 4) {
				int i_719_ = anInt9196 - anInt9195;
				for (int i_720_ = 0; i_720_ < anInt9157; i_720_++)
					anIntArray9159[i_720_] = (anIntArray9159[i_720_] + (class142_703_.method2327((anIntArray9158[i_720_] + i_704_), (anIntArray9160[i_720_] + i_706_), 964288652) - i_705_) + i_719_);
			} else if (i == 5) {
				int i_721_ = anInt9196 - anInt9195;
				for (int i_722_ = 0; i_722_ < anInt9157; i_722_++) {
					int i_723_ = anIntArray9158[i_722_] + i_704_;
					int i_724_ = anIntArray9160[i_722_] + i_706_;
					int i_725_ = class142.method2327(i_723_, i_724_, 416891901);
					int i_726_ = class142_703_.method2327(i_723_, i_724_, 678059805);
					int i_727_ = i_725_ - i_726_ - i_702_;
					anIntArray9159[i_722_] = ((anIntArray9159[i_722_] << 8) / i_721_ * i_727_ >> 8) - (i_705_ - i_725_);
				}
			}
			method14577();
			aBool9215 = false;
		}
	}

	public void method2751(int i) {
		int i_728_ = Class433.anIntArray4880[i];
		int i_729_ = Class433.anIntArray4881[i];
		for (int i_730_ = 0; i_730_ < anInt9157; i_730_++) {
			int i_731_ = ((anIntArray9159[i_730_] * i_729_ - anIntArray9160[i_730_] * i_728_) >> 14);
			anIntArray9160[i_730_] = (anIntArray9159[i_730_] * i_728_ + anIntArray9160[i_730_] * i_729_) >> 14;
			anIntArray9159[i_730_] = i_731_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2724(int i) {
		int i_732_ = Class433.anIntArray4880[i];
		int i_733_ = Class433.anIntArray4881[i];
		for (int i_734_ = 0; i_734_ < anInt9157; i_734_++) {
			int i_735_ = ((anIntArray9159[i_734_] * i_733_ - anIntArray9160[i_734_] * i_732_) >> 14);
			anIntArray9160[i_734_] = (anIntArray9159[i_734_] * i_732_ + anIntArray9160[i_734_] * i_733_) >> 14;
			anIntArray9159[i_734_] = i_735_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2824() {
		if (anInt9163 > 0 && anInt9174 > 0) {
			method14561();
			method14560();
			method14600();
		}
	}

	public void method2754(int i) {
		int i_736_ = Class433.anIntArray4880[i];
		int i_737_ = Class433.anIntArray4881[i];
		for (int i_738_ = 0; i_738_ < anInt9157; i_738_++) {
			int i_739_ = ((anIntArray9159[i_738_] * i_737_ - anIntArray9160[i_738_] * i_736_) >> 14);
			anIntArray9160[i_738_] = (anIntArray9159[i_738_] * i_736_ + anIntArray9160[i_738_] * i_737_) >> 14;
			anIntArray9159[i_738_] = i_739_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2682(int i) {
		int i_740_ = Class433.anIntArray4880[i];
		int i_741_ = Class433.anIntArray4881[i];
		for (int i_742_ = 0; i_742_ < anInt9157; i_742_++) {
			int i_743_ = ((anIntArray9159[i_742_] * i_740_ + anIntArray9158[i_742_] * i_741_) >> 14);
			anIntArray9159[i_742_] = (anIntArray9159[i_742_] * i_741_ - anIntArray9158[i_742_] * i_740_) >> 14;
			anIntArray9158[i_742_] = i_743_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2756() {
		for (int i = 0; i < anInt9157; i++)
			anIntArray9160[i] = -anIntArray9160[i];
		for (int i = 0; i < anInt9163; i++)
			aShortArray9168[i] = (short) -aShortArray9168[i];
		for (int i = 0; i < anInt9155; i++) {
			short i_744_ = aShortArray9161[i];
			aShortArray9161[i] = aShortArray9179[i];
			aShortArray9179[i] = i_744_;
		}
		method14577();
		method14548();
		method14550();
		aBool9215 = false;
	}

	public void method2740() {
		for (int i = 0; i < anInt9157; i++)
			anIntArray9160[i] = -anIntArray9160[i];
		for (int i = 0; i < anInt9163; i++)
			aShortArray9168[i] = (short) -aShortArray9168[i];
		for (int i = 0; i < anInt9155; i++) {
			short i_745_ = aShortArray9161[i];
			aShortArray9161[i] = aShortArray9179[i];
			aShortArray9179[i] = i_745_;
		}
		method14577();
		method14548();
		method14550();
		aBool9215 = false;
	}

	public void method2758() {
		for (int i = 0; i < anInt9157; i++)
			anIntArray9160[i] = -anIntArray9160[i];
		for (int i = 0; i < anInt9163; i++)
			aShortArray9168[i] = (short) -aShortArray9168[i];
		for (int i = 0; i < anInt9155; i++) {
			short i_746_ = aShortArray9161[i];
			aShortArray9161[i] = aShortArray9179[i];
			aShortArray9179[i] = i_746_;
		}
		method14577();
		method14548();
		method14550();
		aBool9215 = false;
	}

	void method14567(Class441 class441) {
		if (aClass371Array9211 != null) {
			aClass178_Sub2_9153.method3287(!aBool9184);
			Class435 class435 = aClass178_Sub2_9153.aClass435_9559;
			Class326 class326 = aClass178_Sub2_9153.aClass326_9645;
			boolean bool = aClass178_Sub2_9153.anInt9663 > 0;
			if (bool)
				class326.aClass437_3461.method6972(((float) (aClass178_Sub2_9153.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 0 & 0xff) / 255.0F));
			else
				class326.aClass437_3461.method6972(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9210; i++) {
				Class371 class371 = aClass371Array9211[i];
				Class337 class337 = aClass337Array9212[i];
				if (!class371.aBool3895 || !aClass178_Sub2_9153.method3146()) {
					float f = ((float) (anIntArray9158[class371.anInt3890] + anIntArray9158[class371.anInt3889] + anIntArray9158[class371.anInt3888]) * 0.3333333F);
					float f_747_ = ((float) (anIntArray9159[class371.anInt3890] + anIntArray9159[class371.anInt3889] + anIntArray9159[class371.anInt3888]) * 0.3333333F);
					float f_748_ = ((float) (anIntArray9160[class371.anInt3890] + anIntArray9160[class371.anInt3889] + anIntArray9160[class371.anInt3888]) * 0.3333333F);
					float f_749_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_747_ + class441.aFloatArray4916[8] * f_748_ + class441.aFloatArray4916[12]);
					float f_750_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_747_ + class441.aFloatArray4916[9] * f_748_ + class441.aFloatArray4916[13]);
					float f_751_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_747_ + class441.aFloatArray4916[10] * f_748_ + class441.aFloatArray4916[14]);
					float f_752_ = ((float) (1.0 / Math.sqrt((double) (f_749_ * f_749_ + f_750_ * f_750_ + f_751_ * f_751_))) * (float) class371.anInt3896);
					class435.method6856(class337.anInt3570, class337.anInt3566 * class371.aShort3892 >> 7, class337.anInt3567 * class371.aShort3893 >> 7, f_749_ + (float) class337.anInt3568 - f_749_ * f_752_, f_750_ + (float) class337.anInt3569 - f_750_ * f_752_, f_751_ - f_751_ * f_752_);
					class435.method6820(aClass178_Sub2_9153.aClass435_9552);
					aClass178_Sub2_9153.aClass441_9561.method7090(class435);
					class326.method5742(aClass178_Sub2_9153.aClass441_9561);
					class326.aClass441_3457.method7085();
					class326.anInt3458 = class337.anInt3565;
					if (bool)
						class326.aFloat3462 = 1.0F - ((aClass178_Sub2_9153.aFloat9681 - f_751_) / (aClass178_Sub2_9153.aFloat9681 - aClass178_Sub2_9153.aFloat9683));
					class326.anInterface37_3460 = null;
					if (class371.aShort3894 != -1)
						class326.anInterface37_3460 = (aClass178_Sub2_9153.aClass349_9586.method6095(aClass178_Sub2_9153.aClass172_1916.method2895(class371.aShort3894 & 0xffff, -1581113061)));
					class326.method5741(bool);
				}
			}
			aClass178_Sub2_9153.method3287(true);
		}
	}

	public void method2760(int i, int i_753_, int i_754_) {
		for (int i_755_ = 0; i_755_ < anInt9157; i_755_++) {
			if (i != 128)
				anIntArray9158[i_755_] = anIntArray9158[i_755_] * i >> 7;
			if (i_753_ != 128)
				anIntArray9159[i_755_] = anIntArray9159[i_755_] * i_753_ >> 7;
			if (i_754_ != 128)
				anIntArray9160[i_755_] = anIntArray9160[i_755_] * i_754_ >> 7;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2832(int i, int i_756_, int i_757_) {
		for (int i_758_ = 0; i_758_ < anInt9157; i_758_++) {
			if (i != 128)
				anIntArray9158[i_758_] = anIntArray9158[i_758_] * i >> 7;
			if (i_756_ != 128)
				anIntArray9159[i_758_] = anIntArray9159[i_758_] * i_756_ >> 7;
			if (i_757_ != 128)
				anIntArray9160[i_758_] = anIntArray9160[i_758_] * i_757_ >> 7;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2762(int i, int i_759_, Class142 class142, Class142 class142_760_, int i_761_, int i_762_, int i_763_) {
		if (!aBool9215)
			method14569();
		int i_764_ = i_761_ + anInt9197;
		int i_765_ = i_761_ + anInt9165;
		int i_766_ = i_763_ + anInt9154;
		int i_767_ = i_763_ + anInt9200;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_764_ >= 0 && ((i_765_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_766_ >= 0 && ((i_767_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_760_ == null || (i_764_ < 0 || ((i_765_ + class142_760_.anInt1682 * 341909049 >> class142_760_.anInt1680 * -1193058675) >= class142_760_.anInt1683 * 692304099) || i_766_ < 0 || ((i_767_ + class142_760_.anInt1682 * 341909049 >> class142_760_.anInt1680 * -1193058675) >= class142_760_.anInt1681 * 452998539)))
					return;
			} else {
				i_764_ >>= class142.anInt1680 * -1193058675;
				i_765_ = (i_765_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_766_ >>= class142.anInt1680 * -1193058675;
				i_767_ = (i_767_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_764_, i_766_, 1859413175) == i_762_ && (class142.method2321(i_765_, i_766_, 1760477476) == i_762_) && (class142.method2321(i_764_, i_767_, 1884623541) == i_762_) && (class142.method2321(i_765_, i_767_, 1870890159) == i_762_))
					return;
			}
			if (i == 1) {
				for (int i_768_ = 0; i_768_ < anInt9157; i_768_++)
					anIntArray9159[i_768_] = (anIntArray9159[i_768_] + class142.method2327((anIntArray9158[i_768_] + i_761_), (anIntArray9160[i_768_] + i_763_), -2097245480) - i_762_);
			} else if (i == 2) {
				int i_769_ = anInt9195;
				if (i_769_ == 0)
					return;
				for (int i_770_ = 0; i_770_ < anInt9157; i_770_++) {
					int i_771_ = (anIntArray9159[i_770_] << 16) / i_769_;
					if (i_771_ < i_759_)
						anIntArray9159[i_770_] = (anIntArray9159[i_770_] + (class142.method2327((anIntArray9158[i_770_] + i_761_), (anIntArray9160[i_770_] + i_763_), -1685385783) - i_762_) * (i_759_ - i_771_) / i_759_);
				}
			} else if (i == 3) {
				int i_772_ = (i_759_ & 0xff) * 16;
				int i_773_ = (i_759_ >> 8 & 0xff) * 16;
				int i_774_ = (i_759_ >> 16 & 0xff) << 6;
				int i_775_ = (i_759_ >> 24 & 0xff) << 6;
				if (i_761_ - (i_772_ >> 1) < 0 || (i_761_ + (i_772_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_763_ - (i_773_ >> 1) < 0 || (i_763_ + (i_773_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_761_, i_762_, i_763_, i_772_, i_773_, i_774_, i_775_);
			} else if (i == 4) {
				int i_776_ = anInt9196 - anInt9195;
				for (int i_777_ = 0; i_777_ < anInt9157; i_777_++)
					anIntArray9159[i_777_] = (anIntArray9159[i_777_] + (class142_760_.method2327((anIntArray9158[i_777_] + i_761_), (anIntArray9160[i_777_] + i_763_), 169115603) - i_762_) + i_776_);
			} else if (i == 5) {
				int i_778_ = anInt9196 - anInt9195;
				for (int i_779_ = 0; i_779_ < anInt9157; i_779_++) {
					int i_780_ = anIntArray9158[i_779_] + i_761_;
					int i_781_ = anIntArray9160[i_779_] + i_763_;
					int i_782_ = class142.method2327(i_780_, i_781_, -210859286);
					int i_783_ = class142_760_.method2327(i_780_, i_781_, 323015333);
					int i_784_ = i_782_ - i_783_ - i_759_;
					anIntArray9159[i_779_] = ((anIntArray9159[i_779_] << 8) / i_778_ * i_784_ >> 8) - (i_762_ - i_782_);
				}
			}
			method14577();
			aBool9215 = false;
		}
	}

	public void method2750(int i) {
		int i_785_ = Class433.anIntArray4880[i];
		int i_786_ = Class433.anIntArray4881[i];
		for (int i_787_ = 0; i_787_ < anInt9157; i_787_++) {
			int i_788_ = ((anIntArray9160[i_787_] * i_785_ + anIntArray9158[i_787_] * i_786_) >> 14);
			anIntArray9160[i_787_] = (anIntArray9160[i_787_] * i_786_ - anIntArray9158[i_787_] * i_785_) >> 14;
			anIntArray9158[i_787_] = i_788_;
		}
		for (int i_789_ = 0; i_789_ < anInt9163; i_789_++) {
			int i_790_ = ((aShortArray9168[i_789_] * i_785_ + aShortArray9164[i_789_] * i_786_) >> 14);
			aShortArray9168[i_789_] = (short) ((aShortArray9168[i_789_] * i_786_ - aShortArray9164[i_789_] * i_785_) >> 14);
			aShortArray9164[i_789_] = (short) i_790_;
		}
		method14577();
		method14548();
		aBool9215 = false;
	}

	public void method2764(int i, int i_791_, Class142 class142, Class142 class142_792_, int i_793_, int i_794_, int i_795_) {
		if (!aBool9215)
			method14569();
		int i_796_ = i_793_ + anInt9197;
		int i_797_ = i_793_ + anInt9165;
		int i_798_ = i_795_ + anInt9154;
		int i_799_ = i_795_ + anInt9200;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_796_ >= 0 && ((i_797_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_798_ >= 0 && ((i_799_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_792_ == null || (i_796_ < 0 || ((i_797_ + class142_792_.anInt1682 * 341909049 >> class142_792_.anInt1680 * -1193058675) >= class142_792_.anInt1683 * 692304099) || i_798_ < 0 || ((i_799_ + class142_792_.anInt1682 * 341909049 >> class142_792_.anInt1680 * -1193058675) >= class142_792_.anInt1681 * 452998539)))
					return;
			} else {
				i_796_ >>= class142.anInt1680 * -1193058675;
				i_797_ = (i_797_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_798_ >>= class142.anInt1680 * -1193058675;
				i_799_ = (i_799_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_796_, i_798_, 1544205306) == i_794_ && (class142.method2321(i_797_, i_798_, 1667051242) == i_794_) && (class142.method2321(i_796_, i_799_, 2043037020) == i_794_) && (class142.method2321(i_797_, i_799_, 1699091269) == i_794_))
					return;
			}
			if (i == 1) {
				for (int i_800_ = 0; i_800_ < anInt9157; i_800_++)
					anIntArray9159[i_800_] = (anIntArray9159[i_800_] + class142.method2327((anIntArray9158[i_800_] + i_793_), (anIntArray9160[i_800_] + i_795_), 885663124) - i_794_);
			} else if (i == 2) {
				int i_801_ = anInt9195;
				if (i_801_ == 0)
					return;
				for (int i_802_ = 0; i_802_ < anInt9157; i_802_++) {
					int i_803_ = (anIntArray9159[i_802_] << 16) / i_801_;
					if (i_803_ < i_791_)
						anIntArray9159[i_802_] = (anIntArray9159[i_802_] + (class142.method2327((anIntArray9158[i_802_] + i_793_), (anIntArray9160[i_802_] + i_795_), -1551514998) - i_794_) * (i_791_ - i_803_) / i_791_);
				}
			} else if (i == 3) {
				int i_804_ = (i_791_ & 0xff) * 16;
				int i_805_ = (i_791_ >> 8 & 0xff) * 16;
				int i_806_ = (i_791_ >> 16 & 0xff) << 6;
				int i_807_ = (i_791_ >> 24 & 0xff) << 6;
				if (i_793_ - (i_804_ >> 1) < 0 || (i_793_ + (i_804_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_795_ - (i_805_ >> 1) < 0 || (i_795_ + (i_805_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_793_, i_794_, i_795_, i_804_, i_805_, i_806_, i_807_);
			} else if (i == 4) {
				int i_808_ = anInt9196 - anInt9195;
				for (int i_809_ = 0; i_809_ < anInt9157; i_809_++)
					anIntArray9159[i_809_] = (anIntArray9159[i_809_] + (class142_792_.method2327((anIntArray9158[i_809_] + i_793_), (anIntArray9160[i_809_] + i_795_), 720000709) - i_794_) + i_808_);
			} else if (i == 5) {
				int i_810_ = anInt9196 - anInt9195;
				for (int i_811_ = 0; i_811_ < anInt9157; i_811_++) {
					int i_812_ = anIntArray9158[i_811_] + i_793_;
					int i_813_ = anIntArray9160[i_811_] + i_795_;
					int i_814_ = class142.method2327(i_812_, i_813_, 89570314);
					int i_815_ = class142_792_.method2327(i_812_, i_813_, -258555905);
					int i_816_ = i_814_ - i_815_ - i_791_;
					anIntArray9159[i_811_] = ((anIntArray9159[i_811_] << 8) / i_810_ * i_816_ >> 8) - (i_794_ - i_814_);
				}
			}
			method14577();
			aBool9215 = false;
		}
	}

	void method2765() {
		/* empty */
	}

	public boolean method2709(int i, int i_817_, Class435 class435, boolean bool, int i_818_) {
		return method14555(i, i_817_, 0, 0, class435, bool, i_818_);
	}

	void method14568() {
		if (aBool9182) {
			aBool9182 = false;
			if (aClass184Array9208 == null && aClass143Array9209 == null && aClass371Array9211 == null && !Class347.method6048(anInt9152, anInt9185)) {
				boolean bool = false;
				boolean bool_819_ = false;
				boolean bool_820_ = false;
				if (anIntArray9158 != null && !Class347.method6001(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool = true;
					} else
						aBool9182 = true;
				}
				if (anIntArray9159 != null && !Class347.method5993(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool_819_ = true;
					} else
						aBool9182 = true;
				}
				if (anIntArray9160 != null && !Class347.method5997(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool_820_ = true;
					} else
						aBool9182 = true;
				}
				if (bool)
					anIntArray9158 = null;
				if (bool_819_)
					anIntArray9159 = null;
				if (bool_820_)
					anIntArray9160 = null;
			}
			if (aShortArray9207 != null && anIntArray9158 == null && anIntArray9159 == null && anIntArray9160 == null) {
				aShortArray9207 = null;
				anIntArray9199 = null;
			}
			while_31_: do {
				if (aByteArray9169 != null && !Class347.method6030(anInt9152, anInt9185)) {
					do {
						if ((anInt9185 & 0x37) != 0) {
							if (aClass357_9224 != null && !aClass357_9224.method6274())
								break;
						} else if (aClass357_9150 != null && !aClass357_9150.method6274())
							break;
						aShortArray9168 = null;
						aShortArray9167 = null;
						aShortArray9164 = null;
						aByteArray9169 = null;
						break while_31_;
					} while (false);
					aBool9182 = true;
				}
			} while (false);
			if (aShortArray9175 != null && !Class347.method6019(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9175 = null;
				else
					aBool9182 = true;
			}
			if (aByteArray9176 != null && !Class347.method6076(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aByteArray9176 = null;
				else
					aBool9182 = true;
			}
			if (aFloatArray9194 != null && !Class347.method6022(anInt9152, anInt9185)) {
				if (aClass357_9187 == null || aClass357_9187.method6274()) {
					aFloatArray9171 = null;
					aFloatArray9194 = null;
				} else
					aBool9182 = true;
			}
			if (aShortArray9189 != null && !Class347.method6027(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9189 = null;
				else
					aBool9182 = true;
			}
			if (aShortArray9161 != null && !Class347.method6026(anInt9152, anInt9185)) {
				if ((aClass336_9183 == null || aClass336_9183.method5933()) && (aClass357_9150 == null || aClass357_9150.method6274())) {
					aShortArray9179 = null;
					aShortArray9217 = null;
					aShortArray9161 = null;
				} else
					aBool9182 = true;
			}
			if (aShortArray9166 != null) {
				if (aClass357_9186 == null || aClass357_9186.method6274())
					aShortArray9166 = null;
				else
					aBool9182 = true;
			}
			if (aShortArray9178 != null) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9178 = null;
				else
					aBool9182 = true;
			}
			if (anIntArrayArray9181 != null && !Class347.method6023(anInt9152, anInt9185)) {
				anIntArrayArray9181 = null;
				aShortArray9170 = null;
			}
			if (anIntArrayArray9190 != null && !Class347.method6024(anInt9152, anInt9185)) {
				anIntArrayArray9190 = null;
				aShortArray9162 = null;
			}
			if (anIntArrayArray9213 != null && !Class347.method6065(anInt9152, anInt9185))
				anIntArrayArray9213 = null;
			if (anIntArray9203 != null && (anInt9152 & 0x800) == 0 && (anInt9152 & 0x40000) == 0) {
				anIntArray9203 = null;
				anIntArray9205 = null;
				anIntArray9204 = null;
			}
		}
	}

	boolean method2768() {
		if (anIntArrayArray9190 == null)
			return false;
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] <<= 4;
			anIntArray9159[i] <<= 4;
			anIntArray9160[i] <<= 4;
		}
		anInt9221 = 0;
		anInt9222 = 0;
		anInt9151 = 0;
		return true;
	}

	public byte[] method2798() {
		return aByteArray9176;
	}

	boolean method2770() {
		if (anIntArrayArray9190 == null)
			return false;
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] <<= 4;
			anIntArray9159[i] <<= 4;
			anIntArray9160[i] <<= 4;
		}
		anInt9221 = 0;
		anInt9222 = 0;
		anInt9151 = 0;
		return true;
	}

	void method14569() {
		int i = 32767;
		int i_821_ = 32767;
		int i_822_ = 32767;
		int i_823_ = -32768;
		int i_824_ = -32768;
		int i_825_ = -32768;
		int i_826_ = 0;
		int i_827_ = 0;
		for (int i_828_ = 0; i_828_ < anInt9157; i_828_++) {
			int i_829_ = anIntArray9158[i_828_];
			int i_830_ = anIntArray9159[i_828_];
			int i_831_ = anIntArray9160[i_828_];
			if (i_829_ < i)
				i = i_829_;
			if (i_829_ > i_823_)
				i_823_ = i_829_;
			if (i_830_ < i_821_)
				i_821_ = i_830_;
			if (i_830_ > i_824_)
				i_824_ = i_830_;
			if (i_831_ < i_822_)
				i_822_ = i_831_;
			if (i_831_ > i_825_)
				i_825_ = i_831_;
			int i_832_ = i_829_ * i_829_ + i_831_ * i_831_;
			if (i_832_ > i_826_)
				i_826_ = i_832_;
			i_832_ = i_829_ * i_829_ + i_831_ * i_831_ + i_830_ * i_830_;
			if (i_832_ > i_827_)
				i_827_ = i_832_;
		}
		anInt9197 = i;
		anInt9165 = i_823_;
		anInt9195 = i_821_;
		anInt9196 = i_824_;
		anInt9154 = i_822_;
		anInt9200 = i_825_;
		anInt9193 = (int) (Math.sqrt((double) i_826_) + 0.99);
		anInt9192 = (int) (Math.sqrt((double) i_827_) + 0.99);
		aBool9215 = true;
	}

	void method2772() {
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] = anIntArray9158[i] + 7 >> 4;
			anIntArray9159[i] = anIntArray9159[i] + 7 >> 4;
			anIntArray9160[i] = anIntArray9160[i] + 7 >> 4;
		}
		method14577();
		aBool9215 = false;
	}

	void method14570() {
		if ((anInt9185 & 0x37) != 0) {
			if (aClass357_9224 != null)
				aClass357_9224.aBool3725 = false;
		} else if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method14571(Class435 class435) {
		if (anInt9174 != 0 && (method14561() && method14560())) {
			if (aClass343_9225 == null) {
				/* empty */
			}
			aClass178_Sub2_9153.method15043();
			aClass178_Sub2_9153.method14941();
			Class329 class329 = aClass178_Sub2_9153.aClass329_9642;
			aClass178_Sub2_9153.method15033(0, aClass357_9186.anInterface36_3726);
			aClass178_Sub2_9153.method15033(1, aClass357_9150.anInterface36_3726);
			aClass178_Sub2_9153.method15033(2, aClass357_9187.anInterface36_3726);
			aClass178_Sub2_9153.method15213(aClass336_9183.anInterface40_3561);
			aClass178_Sub2_9153.aClass441_9560.method7090(class435);
			class329.method5790(aClass178_Sub2_9153.aClass441_9560);
			class329.aClass441_3480.method7085();
			if (aClass178_Sub2_9153.aBool9656) {
				Class163 class163 = aClass178_Sub2_9153.method15017();
				class329.aClass429_3490.method6773(0.0F, 1.0F, 0.0F, (float) -aClass178_Sub2_9153.anInt9601);
				class329.aClass429_3490.method6766(3.0F / (float) ((class163.anInt1775) * -118212955));
				class329.aClass437_3479.method6972(((float) (class163.anInt1776 * -319632409 >> 16 & 0xff) / 255.0F), ((float) (class163.anInt1776 * -319632409 >> 8 & 0xff) / 255.0F), ((float) (class163.anInt1776 * -319632409 >> 0 & 0xff) / 255.0F));
			} else {
				class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
			}
			if (aClass178_Sub2_9153.anInt9663 > 0) {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 1.0F, -(aClass178_Sub2_9153.aFloat9683));
				class329.aClass437_3484.method6972(((float) (aClass178_Sub2_9153.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 0 & 0xff) / 255.0F));
				aClass178_Sub2_9153.aClass441_9560.method7090(class435);
				aClass178_Sub2_9153.aClass441_9560.method7124();
				class329.aClass429_3490.method6762(aClass178_Sub2_9153.aClass441_9560);
				aClass178_Sub2_9153.aClass441_9560.method7090(class435);
				aClass178_Sub2_9153.aClass441_9560.method7089(aClass178_Sub2_9153.aClass441_9629);
				aClass178_Sub2_9153.aClass441_9560.method7124();
				class329.aClass429_3486.method6762(aClass178_Sub2_9153.aClass441_9560);
				class329.aClass429_3486.method6766(1.0F / (aClass178_Sub2_9153.aFloat9681 - aClass178_Sub2_9153.aFloat9683));
			} else {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9185 & 0x37) == 0) {
				aClass178_Sub2_9153.method15032(aClass178_Sub2_9153.aClass345_9695);
				if (aClass178_Sub2_9153.aBool9647)
					aClass178_Sub2_9153.method14982(false);
				for (int i = 0; i < anIntArray9204.length; i++) {
					int i_833_ = anIntArray9203[i];
					int i_834_ = anIntArray9203[i + 1];
					int i_835_ = aShortArray9189[i_833_];
					boolean bool = false;
					byte i_836_ = 0;
					if (i_835_ != -1) {
						Class177 class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_835_ & 0xffff, -652436312);
						class329.anInterface37_3478 = aClass178_Sub2_9153.aClass349_9586.method6095(class177);
						bool = !Class164_Sub5.method15499(class177.aByte1905, (byte) 89);
						class329.aClass441_3480.aFloatArray4916[12] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1885 / 64.0F % 1.0F);
						class329.aClass441_3480.aFloatArray4916[13] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1886 / 64.0F % 1.0F);
						if (class177.aClass593_1884 == Class593.aClass593_7812)
							i_836_ = class177.aByte1889;
					} else {
						class329.anInterface37_3478 = aClass178_Sub2_9153.anInterface37_9669;
						float[] fs = class329.aClass441_3480.aFloatArray4916;
						class329.aClass441_3480.aFloatArray4916[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass178_Sub2_9153.method15020(i_836_);
					class329.anInt3493 = anIntArray9204[i];
					class329.anInt3494 = anIntArray9205[i];
					class329.anInt3481 = i_833_ * 3;
					class329.anInt3496 = i_834_ - i_833_;
					class329.method5793(bool);
				}
			} else {
				aClass178_Sub2_9153.method15033(3, aClass357_9224.anInterface36_3726);
				aClass178_Sub2_9153.method15032(aClass178_Sub2_9153.aClass345_9568);
				Class435 class435_837_ = aClass178_Sub2_9153.aClass435_9559;
				class435_837_.method6803(class435);
				class435_837_.method6857();
				int i = 0;
				if (aClass178_Sub2_9153.aBool9647)
					aClass178_Sub2_9153.method14982(true);
				else {
					class329.aClass437_3492.method6972(aClass178_Sub2_9153.aFloatArray9608[0], aClass178_Sub2_9153.aFloatArray9608[1], aClass178_Sub2_9153.aFloatArray9608[2]);
					class329.aClass437_3492.method6909(class435_837_);
					class329.aClass437_3488.method6972((aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9689), (aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9614), (aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9704));
					class329.aClass437_3489.method6972((-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9689), (-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9614), (-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9704));
					class329.aClass437_3491.method6972((aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9689), (aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9614), (aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9704));
					if (aClass178_Sub2_9153.anInt9620 > 0) {
						i = aClass178_Sub2_9153.anInt9620;
						Class437 class437 = aClass178_Sub2_9153.aClass437_9562;
						for (int i_838_ = 0; i_838_ < i; i_838_++) {
							Class523_Sub20 class523_sub20 = (aClass178_Sub2_9153.aClass523_Sub20Array9671[i_838_]);
							int i_839_ = class523_sub20.method16067(856453637);
							class437.method6886(class523_sub20.aClass437_10497);
							class437.method6908(class435_837_);
							class329.aFloatArray3477[i_838_ * 4 + 0] = class437.aFloat4903;
							class329.aFloatArray3477[i_838_ * 4 + 1] = class437.aFloat4904;
							class329.aFloatArray3477[i_838_ * 4 + 2] = class437.aFloat4905;
							class329.aFloatArray3477[i_838_ * 4 + 3] = 1.0F / (float) (class523_sub20.method16066(-1879460461) * (class523_sub20.method16066(-1879460461)));
							float f = (class523_sub20.method16068((byte) 0) / 255.0F);
							class329.aFloatArray3476[i_838_ * 4 + 0] = (float) (i_839_ >> 16 & 0xff) * f;
							class329.aFloatArray3476[i_838_ * 4 + 1] = (float) (i_839_ >> 8 & 0xff) * f;
							class329.aFloatArray3476[i_838_ * 4 + 2] = (float) (i_839_ & 0xff) * f;
							class329.aFloatArray3476[i_838_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_840_ = 0; i_840_ < anIntArray9204.length; i_840_++) {
					int i_841_ = anIntArray9203[i_840_];
					int i_842_ = anIntArray9203[i_840_ + 1];
					int i_843_ = aShortArray9189[i_841_];
					byte i_844_ = 11;
					Class177 class177 = null;
					byte i_845_ = 0;
					if (i_843_ != -1) {
						class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_843_ & 0xffff, -451480283);
						class329.anInterface37_3478 = aClass178_Sub2_9153.aClass349_9586.method6095(class177);
						i_844_ = class177.aByte1905;
						class329.method5792(class177.aByte1906);
						class329.aClass441_3480.aFloatArray4916[12] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1885 / 64.0F % 1.0F);
						class329.aClass441_3480.aFloatArray4916[13] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1886 / 64.0F % 1.0F);
						if (class177.aClass593_1884 == Class593.aClass593_7812)
							i_845_ = class177.aByte1889;
					} else {
						class329.anInterface37_3478 = aClass178_Sub2_9153.anInterface37_9669;
						float[] fs = class329.aClass441_3480.aFloatArray4916;
						class329.aClass441_3480.aFloatArray4916[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass178_Sub2_9153.method15020(i_845_);
					class329.anInt3493 = anIntArray9204[i_840_];
					class329.anInt3494 = anIntArray9205[i_840_];
					class329.anInt3481 = i_841_ * 3;
					class329.anInt3496 = i_842_ - i_841_;
					switch (i_844_) {
					case 5:
						if (!aClass178_Sub2_9153.aBool9647) {
							Class340_Sub1_Sub1 class340_sub1_sub1 = aClass178_Sub2_9153.aClass340_Sub1_Sub1_9696;
							class340_sub1_sub1.method17880(class177.aByte1906, (class177.anInt1865 * -2058069491), (byte) -118);
							class340_sub1_sub1.aClass441_11478.method7090(class435);
							class340_sub1_sub1.aClass441_11476.method7090(class435);
							class340_sub1_sub1.aClass441_11476.method7089(aClass178_Sub2_9153.aClass441_9575);
							class340_sub1_sub1.anInt11484 = anIntArray9204[i_840_] * -1879255159;
							class340_sub1_sub1.anInt11470 = anIntArray9205[i_840_] * -525411447;
							class340_sub1_sub1.anInt11486 = i_841_ * 708813935;
							class340_sub1_sub1.anInt11487 = (i_842_ - i_841_) * -664263781;
							class340_sub1_sub1.method17879(-334328970);
						} else
							class329.method5817(i);
						break;
					case 1:
						class329.aClass437_3487.method6972((aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[14]));
						class329.aClass437_3487.method6908(class435_837_);
						class329.method5795(i);
						break;
					case 6:
						class329.method5793(!Class164_Sub5.method15499(i_844_, (byte) 89));
						break;
					case 7:
						class329.aClass437_3487.method6972((aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[14]));
						class329.aClass437_3487.method6908(class435_837_);
						class329.aClass441_3474.method7090(class435);
						class329.anInterface39_3495 = aClass178_Sub2_9153.method14954();
						class329.method5807(i);
						break;
					default:
						class329.method5817(i);
					}
				}
			}
			method14600();
		}
	}

	void method2729() {
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] = anIntArray9158[i] + 7 >> 4;
			anIntArray9159[i] = anIntArray9159[i] + 7 >> 4;
			anIntArray9160[i] = anIntArray9160[i] + 7 >> 4;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2721(int i) {
		aShort9206 = (short) i;
		method14577();
		method14548();
	}

	void method2777(int i, int[] is, int i_846_, int i_847_, int i_848_, int i_849_, boolean bool) {
		int i_850_ = is.length;
		if (i == 0) {
			i_846_ <<= 4;
			i_847_ <<= 4;
			i_848_ <<= 4;
			int i_851_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_852_ = 0; i_852_ < i_850_; i_852_++) {
				int i_853_ = is[i_852_];
				if (i_853_ < anIntArrayArray9190.length) {
					int[] is_854_ = anIntArrayArray9190[i_853_];
					for (int i_855_ = 0; i_855_ < is_854_.length; i_855_++) {
						int i_856_ = is_854_[i_855_];
						anInt9221 += anIntArray9158[i_856_];
						anInt9222 += anIntArray9159[i_856_];
						anInt9151 += anIntArray9160[i_856_];
						i_851_++;
					}
				}
			}
			if (i_851_ > 0) {
				anInt9221 = anInt9221 / i_851_ + i_846_;
				anInt9222 = anInt9222 / i_851_ + i_847_;
				anInt9151 = anInt9151 / i_851_ + i_848_;
			} else {
				anInt9221 = i_846_;
				anInt9222 = i_847_;
				anInt9151 = i_848_;
			}
		} else if (i == 1) {
			i_846_ <<= 4;
			i_847_ <<= 4;
			i_848_ <<= 4;
			for (int i_857_ = 0; i_857_ < i_850_; i_857_++) {
				int i_858_ = is[i_857_];
				if (i_858_ < anIntArrayArray9190.length) {
					int[] is_859_ = anIntArrayArray9190[i_858_];
					for (int i_860_ = 0; i_860_ < is_859_.length; i_860_++) {
						int i_861_ = is_859_[i_860_];
						anIntArray9158[i_861_] += i_846_;
						anIntArray9159[i_861_] += i_847_;
						anIntArray9160[i_861_] += i_848_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_862_ = 0; i_862_ < i_850_; i_862_++) {
				int i_863_ = is[i_862_];
				if (i_863_ < anIntArrayArray9190.length) {
					int[] is_864_ = anIntArrayArray9190[i_863_];
					if ((i_849_ & 0x1) == 0) {
						for (int i_865_ = 0; i_865_ < is_864_.length; i_865_++) {
							int i_866_ = is_864_[i_865_];
							anIntArray9158[i_866_] -= anInt9221;
							anIntArray9159[i_866_] -= anInt9222;
							anIntArray9160[i_866_] -= anInt9151;
							if (i_848_ != 0) {
								int i_867_ = Class433.anIntArray4880[i_848_];
								int i_868_ = Class433.anIntArray4881[i_848_];
								int i_869_ = (anIntArray9159[i_866_] * i_867_ + anIntArray9158[i_866_] * i_868_ + 16383) >> 14;
								anIntArray9159[i_866_] = (anIntArray9159[i_866_] * i_868_ - anIntArray9158[i_866_] * i_867_ + 16383) >> 14;
								anIntArray9158[i_866_] = i_869_;
							}
							if (i_846_ != 0) {
								int i_870_ = Class433.anIntArray4880[i_846_];
								int i_871_ = Class433.anIntArray4881[i_846_];
								int i_872_ = (anIntArray9159[i_866_] * i_871_ - anIntArray9160[i_866_] * i_870_ + 16383) >> 14;
								anIntArray9160[i_866_] = (anIntArray9159[i_866_] * i_870_ + anIntArray9160[i_866_] * i_871_ + 16383) >> 14;
								anIntArray9159[i_866_] = i_872_;
							}
							if (i_847_ != 0) {
								int i_873_ = Class433.anIntArray4880[i_847_];
								int i_874_ = Class433.anIntArray4881[i_847_];
								int i_875_ = (anIntArray9160[i_866_] * i_873_ + anIntArray9158[i_866_] * i_874_ + 16383) >> 14;
								anIntArray9160[i_866_] = (anIntArray9160[i_866_] * i_874_ - anIntArray9158[i_866_] * i_873_ + 16383) >> 14;
								anIntArray9158[i_866_] = i_875_;
							}
							anIntArray9158[i_866_] += anInt9221;
							anIntArray9159[i_866_] += anInt9222;
							anIntArray9160[i_866_] += anInt9151;
						}
					} else {
						for (int i_876_ = 0; i_876_ < is_864_.length; i_876_++) {
							int i_877_ = is_864_[i_876_];
							anIntArray9158[i_877_] -= anInt9221;
							anIntArray9159[i_877_] -= anInt9222;
							anIntArray9160[i_877_] -= anInt9151;
							if (i_846_ != 0) {
								int i_878_ = Class433.anIntArray4880[i_846_];
								int i_879_ = Class433.anIntArray4881[i_846_];
								int i_880_ = (anIntArray9159[i_877_] * i_879_ - anIntArray9160[i_877_] * i_878_ + 16383) >> 14;
								anIntArray9160[i_877_] = (anIntArray9159[i_877_] * i_878_ + anIntArray9160[i_877_] * i_879_ + 16383) >> 14;
								anIntArray9159[i_877_] = i_880_;
							}
							if (i_848_ != 0) {
								int i_881_ = Class433.anIntArray4880[i_848_];
								int i_882_ = Class433.anIntArray4881[i_848_];
								int i_883_ = (anIntArray9159[i_877_] * i_881_ + anIntArray9158[i_877_] * i_882_ + 16383) >> 14;
								anIntArray9159[i_877_] = (anIntArray9159[i_877_] * i_882_ - anIntArray9158[i_877_] * i_881_ + 16383) >> 14;
								anIntArray9158[i_877_] = i_883_;
							}
							if (i_847_ != 0) {
								int i_884_ = Class433.anIntArray4880[i_847_];
								int i_885_ = Class433.anIntArray4881[i_847_];
								int i_886_ = (anIntArray9160[i_877_] * i_884_ + anIntArray9158[i_877_] * i_885_ + 16383) >> 14;
								anIntArray9160[i_877_] = (anIntArray9160[i_877_] * i_885_ - anIntArray9158[i_877_] * i_884_ + 16383) >> 14;
								anIntArray9158[i_877_] = i_886_;
							}
							anIntArray9158[i_877_] += anInt9221;
							anIntArray9159[i_877_] += anInt9222;
							anIntArray9160[i_877_] += anInt9151;
						}
					}
				}
			}
			if (bool) {
				for (int i_887_ = 0; i_887_ < i_850_; i_887_++) {
					int i_888_ = is[i_887_];
					if (i_888_ < anIntArrayArray9190.length) {
						int[] is_889_ = anIntArrayArray9190[i_888_];
						for (int i_890_ = 0; i_890_ < is_889_.length; i_890_++) {
							int i_891_ = is_889_[i_890_];
							int i_892_ = anIntArray9199[i_891_];
							int i_893_ = anIntArray9199[i_891_ + 1];
							for (int i_894_ = i_892_; (i_894_ < i_893_ && aShortArray9207[i_894_] != 0); i_894_++) {
								int i_895_ = (aShortArray9207[i_894_] & 0xffff) - 1;
								if (i_848_ != 0) {
									int i_896_ = Class433.anIntArray4880[i_848_];
									int i_897_ = Class433.anIntArray4881[i_848_];
									int i_898_ = ((aShortArray9167[i_895_] * i_896_ + aShortArray9164[i_895_] * i_897_ + 16383) >> 14);
									aShortArray9167[i_895_] = (short) (((aShortArray9167[i_895_] * i_897_) - (aShortArray9164[i_895_] * i_896_) + 16383) >> 14);
									aShortArray9164[i_895_] = (short) i_898_;
								}
								if (i_846_ != 0) {
									int i_899_ = Class433.anIntArray4880[i_846_];
									int i_900_ = Class433.anIntArray4881[i_846_];
									int i_901_ = ((aShortArray9167[i_895_] * i_900_ - aShortArray9168[i_895_] * i_899_ + 16383) >> 14);
									aShortArray9168[i_895_] = (short) (((aShortArray9167[i_895_] * i_899_) + (aShortArray9168[i_895_] * i_900_) + 16383) >> 14);
									aShortArray9167[i_895_] = (short) i_901_;
								}
								if (i_847_ != 0) {
									int i_902_ = Class433.anIntArray4880[i_847_];
									int i_903_ = Class433.anIntArray4881[i_847_];
									int i_904_ = ((aShortArray9168[i_895_] * i_902_ + aShortArray9164[i_895_] * i_903_ + 16383) >> 14);
									aShortArray9168[i_895_] = (short) (((aShortArray9168[i_895_] * i_903_) - (aShortArray9164[i_895_] * i_902_) + 16383) >> 14);
									aShortArray9164[i_895_] = (short) i_904_;
								}
							}
						}
					}
				}
				method14548();
			}
		} else if (i == 3) {
			for (int i_905_ = 0; i_905_ < i_850_; i_905_++) {
				int i_906_ = is[i_905_];
				if (i_906_ < anIntArrayArray9190.length) {
					int[] is_907_ = anIntArrayArray9190[i_906_];
					for (int i_908_ = 0; i_908_ < is_907_.length; i_908_++) {
						int i_909_ = is_907_[i_908_];
						anIntArray9158[i_909_] -= anInt9221;
						anIntArray9159[i_909_] -= anInt9222;
						anIntArray9160[i_909_] -= anInt9151;
						anIntArray9158[i_909_] = anIntArray9158[i_909_] * i_846_ >> 7;
						anIntArray9159[i_909_] = anIntArray9159[i_909_] * i_847_ >> 7;
						anIntArray9160[i_909_] = anIntArray9160[i_909_] * i_848_ >> 7;
						anIntArray9158[i_909_] += anInt9221;
						anIntArray9159[i_909_] += anInt9222;
						anIntArray9160[i_909_] += anInt9151;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9181 != null) {
				boolean bool_910_ = false;
				for (int i_911_ = 0; i_911_ < i_850_; i_911_++) {
					int i_912_ = is[i_911_];
					if (i_912_ < anIntArrayArray9181.length) {
						int[] is_913_ = anIntArrayArray9181[i_912_];
						for (int i_914_ = 0; i_914_ < is_913_.length; i_914_++) {
							int i_915_ = is_913_[i_914_];
							int i_916_ = (aByteArray9176[i_915_] & 0xff) + i_846_ * 8;
							if (i_916_ < 0)
								i_916_ = 0;
							else if (i_916_ > 255)
								i_916_ = 255;
							aByteArray9176[i_915_] = (byte) i_916_;
						}
						bool_910_ = bool_910_ | is_913_.length > 0;
					}
				}
				if (bool_910_) {
					if (aClass371Array9211 != null) {
						for (int i_917_ = 0; i_917_ < anInt9210; i_917_++) {
							Class371 class371 = aClass371Array9211[i_917_];
							Class337 class337 = aClass337Array9212[i_917_];
							class337.anInt3565 = (class337.anInt3565 & 0xffffff | 255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24);
						}
					}
					method14547();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9181 != null) {
				boolean bool_918_ = false;
				for (int i_919_ = 0; i_919_ < i_850_; i_919_++) {
					int i_920_ = is[i_919_];
					if (i_920_ < anIntArrayArray9181.length) {
						int[] is_921_ = anIntArrayArray9181[i_920_];
						for (int i_922_ = 0; i_922_ < is_921_.length; i_922_++) {
							int i_923_ = is_921_[i_922_];
							int i_924_ = aShortArray9175[i_923_] & 0xffff;
							int i_925_ = i_924_ >> 10 & 0x3f;
							int i_926_ = i_924_ >> 7 & 0x7;
							int i_927_ = i_924_ & 0x7f;
							i_925_ = i_925_ + i_846_ & 0x3f;
							i_926_ += i_847_ / 4;
							if (i_926_ < 0)
								i_926_ = 0;
							else if (i_926_ > 7)
								i_926_ = 7;
							i_927_ += i_848_;
							if (i_927_ < 0)
								i_927_ = 0;
							else if (i_927_ > 127)
								i_927_ = 127;
							aShortArray9175[i_923_] = (short) (i_925_ << 10 | i_926_ << 7 | i_927_);
						}
						bool_918_ = bool_918_ | is_921_.length > 0;
					}
				}
				if (bool_918_) {
					if (aClass371Array9211 != null) {
						for (int i_928_ = 0; i_928_ < anInt9210; i_928_++) {
							Class371 class371 = aClass371Array9211[i_928_];
							Class337 class337 = aClass337Array9212[i_928_];
							class337.anInt3565 = (class337.anInt3565 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9175[class371.anInt3891] & 0xffff)]) & 0xffffff);
						}
					}
					method14547();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9213 != null) {
				for (int i_929_ = 0; i_929_ < i_850_; i_929_++) {
					int i_930_ = is[i_929_];
					if (i_930_ < anIntArrayArray9213.length) {
						int[] is_931_ = anIntArrayArray9213[i_930_];
						for (int i_932_ = 0; i_932_ < is_931_.length; i_932_++) {
							Class337 class337 = aClass337Array9212[is_931_[i_932_]];
							class337.anInt3568 += i_846_;
							class337.anInt3569 += i_847_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9213 != null) {
				for (int i_933_ = 0; i_933_ < i_850_; i_933_++) {
					int i_934_ = is[i_933_];
					if (i_934_ < anIntArrayArray9213.length) {
						int[] is_935_ = anIntArrayArray9213[i_934_];
						for (int i_936_ = 0; i_936_ < is_935_.length; i_936_++) {
							Class337 class337 = aClass337Array9212[is_935_[i_936_]];
							class337.anInt3566 = class337.anInt3566 * i_846_ >> 7;
							class337.anInt3567 = class337.anInt3567 * i_847_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9213 != null) {
				for (int i_937_ = 0; i_937_ < i_850_; i_937_++) {
					int i_938_ = is[i_937_];
					if (i_938_ < anIntArrayArray9213.length) {
						int[] is_939_ = anIntArrayArray9213[i_938_];
						for (int i_940_ = 0; i_940_ < is_939_.length; i_940_++) {
							Class337 class337 = aClass337Array9212[is_939_[i_940_]];
							class337.anInt3570 = class337.anInt3570 + i_846_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2778(int i, int[] is, int i_941_, int i_942_, int i_943_, boolean bool, int i_944_, int[] is_945_) {
		int i_946_ = is.length;
		if (i == 0) {
			i_941_ <<= 4;
			i_942_ <<= 4;
			i_943_ <<= 4;
			int i_947_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_948_ = 0; i_948_ < i_946_; i_948_++) {
				int i_949_ = is[i_948_];
				if (i_949_ < anIntArrayArray9190.length) {
					int[] is_950_ = anIntArrayArray9190[i_949_];
					for (int i_951_ = 0; i_951_ < is_950_.length; i_951_++) {
						int i_952_ = is_950_[i_951_];
						if (aShortArray9162 == null || (i_944_ & aShortArray9162[i_952_]) != 0) {
							anInt9221 += anIntArray9158[i_952_];
							anInt9222 += anIntArray9159[i_952_];
							anInt9151 += anIntArray9160[i_952_];
							i_947_++;
						}
					}
				}
			}
			if (i_947_ > 0) {
				anInt9221 = anInt9221 / i_947_ + i_941_;
				anInt9222 = anInt9222 / i_947_ + i_942_;
				anInt9151 = anInt9151 / i_947_ + i_943_;
				aBool9173 = true;
			} else {
				anInt9221 = i_941_;
				anInt9222 = i_942_;
				anInt9151 = i_943_;
			}
		} else if (i == 1) {
			if (is_945_ != null) {
				int i_953_ = ((is_945_[0] * i_941_ + is_945_[1] * i_942_ + is_945_[2] * i_943_ + 8192) >> 14);
				int i_954_ = ((is_945_[3] * i_941_ + is_945_[4] * i_942_ + is_945_[5] * i_943_ + 8192) >> 14);
				int i_955_ = ((is_945_[6] * i_941_ + is_945_[7] * i_942_ + is_945_[8] * i_943_ + 8192) >> 14);
				i_941_ = i_953_;
				i_942_ = i_954_;
				i_943_ = i_955_;
			}
			i_941_ <<= 4;
			i_942_ <<= 4;
			i_943_ <<= 4;
			for (int i_956_ = 0; i_956_ < i_946_; i_956_++) {
				int i_957_ = is[i_956_];
				if (i_957_ < anIntArrayArray9190.length) {
					int[] is_958_ = anIntArrayArray9190[i_957_];
					for (int i_959_ = 0; i_959_ < is_958_.length; i_959_++) {
						int i_960_ = is_958_[i_959_];
						if (aShortArray9162 == null || (i_944_ & aShortArray9162[i_960_]) != 0) {
							anIntArray9158[i_960_] += i_941_;
							anIntArray9159[i_960_] += i_942_;
							anIntArray9160[i_960_] += i_943_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_945_ != null) {
				int i_961_ = is_945_[9] << 4;
				int i_962_ = is_945_[10] << 4;
				int i_963_ = is_945_[11] << 4;
				int i_964_ = is_945_[12] << 4;
				int i_965_ = is_945_[13] << 4;
				int i_966_ = is_945_[14] << 4;
				if (aBool9173) {
					int i_967_ = ((is_945_[0] * anInt9221 + is_945_[3] * anInt9222 + is_945_[6] * anInt9151 + 8192) >> 14);
					int i_968_ = ((is_945_[1] * anInt9221 + is_945_[4] * anInt9222 + is_945_[7] * anInt9151 + 8192) >> 14);
					int i_969_ = ((is_945_[2] * anInt9221 + is_945_[5] * anInt9222 + is_945_[8] * anInt9151 + 8192) >> 14);
					i_967_ += i_964_;
					i_968_ += i_965_;
					i_969_ += i_966_;
					anInt9221 = i_967_;
					anInt9222 = i_968_;
					anInt9151 = i_969_;
					aBool9173 = false;
				}
				int[] is_970_ = new int[9];
				int i_971_ = Class433.anIntArray4881[i_941_];
				int i_972_ = Class433.anIntArray4880[i_941_];
				int i_973_ = Class433.anIntArray4881[i_942_];
				int i_974_ = Class433.anIntArray4880[i_942_];
				int i_975_ = Class433.anIntArray4881[i_943_];
				int i_976_ = Class433.anIntArray4880[i_943_];
				int i_977_ = i_972_ * i_975_ + 8192 >> 14;
				int i_978_ = i_972_ * i_976_ + 8192 >> 14;
				is_970_[0] = i_973_ * i_975_ + i_974_ * i_978_ + 8192 >> 14;
				is_970_[1] = -i_973_ * i_976_ + i_974_ * i_977_ + 8192 >> 14;
				is_970_[2] = i_974_ * i_971_ + 8192 >> 14;
				is_970_[3] = i_971_ * i_976_ + 8192 >> 14;
				is_970_[4] = i_971_ * i_975_ + 8192 >> 14;
				is_970_[5] = -i_972_;
				is_970_[6] = -i_974_ * i_975_ + i_973_ * i_978_ + 8192 >> 14;
				is_970_[7] = i_974_ * i_976_ + i_973_ * i_977_ + 8192 >> 14;
				is_970_[8] = i_973_ * i_971_ + 8192 >> 14;
				int i_979_ = (is_970_[0] * -anInt9221 + is_970_[1] * -anInt9222 + is_970_[2] * -anInt9151 + 8192) >> 14;
				int i_980_ = (is_970_[3] * -anInt9221 + is_970_[4] * -anInt9222 + is_970_[5] * -anInt9151 + 8192) >> 14;
				int i_981_ = (is_970_[6] * -anInt9221 + is_970_[7] * -anInt9222 + is_970_[8] * -anInt9151 + 8192) >> 14;
				int i_982_ = i_979_ + anInt9221;
				int i_983_ = i_980_ + anInt9222;
				int i_984_ = i_981_ + anInt9151;
				int[] is_985_ = new int[9];
				for (int i_986_ = 0; i_986_ < 3; i_986_++) {
					for (int i_987_ = 0; i_987_ < 3; i_987_++) {
						int i_988_ = 0;
						for (int i_989_ = 0; i_989_ < 3; i_989_++)
							i_988_ += (is_970_[i_986_ * 3 + i_989_] * is_945_[i_987_ * 3 + i_989_]);
						is_985_[i_986_ * 3 + i_987_] = i_988_ + 8192 >> 14;
					}
				}
				int i_990_ = ((is_970_[0] * i_964_ + is_970_[1] * i_965_ + is_970_[2] * i_966_ + 8192) >> 14);
				int i_991_ = ((is_970_[3] * i_964_ + is_970_[4] * i_965_ + is_970_[5] * i_966_ + 8192) >> 14);
				int i_992_ = ((is_970_[6] * i_964_ + is_970_[7] * i_965_ + is_970_[8] * i_966_ + 8192) >> 14);
				i_990_ += i_982_;
				i_991_ += i_983_;
				i_992_ += i_984_;
				int[] is_993_ = new int[9];
				for (int i_994_ = 0; i_994_ < 3; i_994_++) {
					for (int i_995_ = 0; i_995_ < 3; i_995_++) {
						int i_996_ = 0;
						for (int i_997_ = 0; i_997_ < 3; i_997_++)
							i_996_ += (is_945_[i_994_ * 3 + i_997_] * is_985_[i_995_ + i_997_ * 3]);
						is_993_[i_994_ * 3 + i_995_] = i_996_ + 8192 >> 14;
					}
				}
				int i_998_ = ((is_945_[0] * i_990_ + is_945_[1] * i_991_ + is_945_[2] * i_992_ + 8192) >> 14);
				int i_999_ = ((is_945_[3] * i_990_ + is_945_[4] * i_991_ + is_945_[5] * i_992_ + 8192) >> 14);
				int i_1000_ = ((is_945_[6] * i_990_ + is_945_[7] * i_991_ + is_945_[8] * i_992_ + 8192) >> 14);
				i_998_ += i_961_;
				i_999_ += i_962_;
				i_1000_ += i_963_;
				for (int i_1001_ = 0; i_1001_ < i_946_; i_1001_++) {
					int i_1002_ = is[i_1001_];
					if (i_1002_ < anIntArrayArray9190.length) {
						int[] is_1003_ = anIntArrayArray9190[i_1002_];
						for (int i_1004_ = 0; i_1004_ < is_1003_.length; i_1004_++) {
							int i_1005_ = is_1003_[i_1004_];
							if (aShortArray9162 == null || (i_944_ & aShortArray9162[i_1005_]) != 0) {
								int i_1006_ = ((is_993_[0] * anIntArray9158[i_1005_] + is_993_[1] * anIntArray9159[i_1005_] + is_993_[2] * anIntArray9160[i_1005_] + 8192) >> 14);
								int i_1007_ = ((is_993_[3] * anIntArray9158[i_1005_] + is_993_[4] * anIntArray9159[i_1005_] + is_993_[5] * anIntArray9160[i_1005_] + 8192) >> 14);
								int i_1008_ = ((is_993_[6] * anIntArray9158[i_1005_] + is_993_[7] * anIntArray9159[i_1005_] + is_993_[8] * anIntArray9160[i_1005_] + 8192) >> 14);
								i_1006_ += i_998_;
								i_1007_ += i_999_;
								i_1008_ += i_1000_;
								anIntArray9158[i_1005_] = i_1006_;
								anIntArray9159[i_1005_] = i_1007_;
								anIntArray9160[i_1005_] = i_1008_;
							}
						}
					}
				}
			} else {
				for (int i_1009_ = 0; i_1009_ < i_946_; i_1009_++) {
					int i_1010_ = is[i_1009_];
					if (i_1010_ < anIntArrayArray9190.length) {
						int[] is_1011_ = anIntArrayArray9190[i_1010_];
						for (int i_1012_ = 0; i_1012_ < is_1011_.length; i_1012_++) {
							int i_1013_ = is_1011_[i_1012_];
							if (aShortArray9162 == null || (i_944_ & aShortArray9162[i_1013_]) != 0) {
								anIntArray9158[i_1013_] -= anInt9221;
								anIntArray9159[i_1013_] -= anInt9222;
								anIntArray9160[i_1013_] -= anInt9151;
								if (i_943_ != 0) {
									int i_1014_ = Class433.anIntArray4880[i_943_];
									int i_1015_ = Class433.anIntArray4881[i_943_];
									int i_1016_ = ((anIntArray9159[i_1013_] * i_1014_ + anIntArray9158[i_1013_] * i_1015_ + 16383) >> 14);
									anIntArray9159[i_1013_] = (anIntArray9159[i_1013_] * i_1015_ - anIntArray9158[i_1013_] * i_1014_ + 16383) >> 14;
									anIntArray9158[i_1013_] = i_1016_;
								}
								if (i_941_ != 0) {
									int i_1017_ = Class433.anIntArray4880[i_941_];
									int i_1018_ = Class433.anIntArray4881[i_941_];
									int i_1019_ = ((anIntArray9159[i_1013_] * i_1018_ - anIntArray9160[i_1013_] * i_1017_ + 16383) >> 14);
									anIntArray9160[i_1013_] = (anIntArray9159[i_1013_] * i_1017_ + anIntArray9160[i_1013_] * i_1018_ + 16383) >> 14;
									anIntArray9159[i_1013_] = i_1019_;
								}
								if (i_942_ != 0) {
									int i_1020_ = Class433.anIntArray4880[i_942_];
									int i_1021_ = Class433.anIntArray4881[i_942_];
									int i_1022_ = ((anIntArray9160[i_1013_] * i_1020_ + anIntArray9158[i_1013_] * i_1021_ + 16383) >> 14);
									anIntArray9160[i_1013_] = (anIntArray9160[i_1013_] * i_1021_ - anIntArray9158[i_1013_] * i_1020_ + 16383) >> 14;
									anIntArray9158[i_1013_] = i_1022_;
								}
								anIntArray9158[i_1013_] += anInt9221;
								anIntArray9159[i_1013_] += anInt9222;
								anIntArray9160[i_1013_] += anInt9151;
							}
						}
					}
				}
				if (bool) {
					for (int i_1023_ = 0; i_1023_ < i_946_; i_1023_++) {
						int i_1024_ = is[i_1023_];
						if (i_1024_ < anIntArrayArray9190.length) {
							int[] is_1025_ = anIntArrayArray9190[i_1024_];
							for (int i_1026_ = 0; i_1026_ < is_1025_.length; i_1026_++) {
								int i_1027_ = is_1025_[i_1026_];
								if (aShortArray9162 == null || ((i_944_ & aShortArray9162[i_1027_]) != 0)) {
									int i_1028_ = anIntArray9199[i_1027_];
									int i_1029_ = anIntArray9199[i_1027_ + 1];
									for (int i_1030_ = i_1028_; (i_1030_ < i_1029_ && aShortArray9207[i_1030_] != 0); i_1030_++) {
										int i_1031_ = (aShortArray9207[i_1030_] & 0xffff) - 1;
										if (i_943_ != 0) {
											int i_1032_ = (Class433.anIntArray4880[i_943_]);
											int i_1033_ = (Class433.anIntArray4881[i_943_]);
											int i_1034_ = (((aShortArray9167[i_1031_] * i_1032_) + (aShortArray9164[i_1031_] * i_1033_) + 16383) >> 14);
											aShortArray9167[i_1031_] = (short) ((((aShortArray9167[i_1031_]) * i_1033_) - ((aShortArray9164[i_1031_]) * i_1032_) + 16383) >> 14);
											aShortArray9164[i_1031_] = (short) i_1034_;
										}
										if (i_941_ != 0) {
											int i_1035_ = (Class433.anIntArray4880[i_941_]);
											int i_1036_ = (Class433.anIntArray4881[i_941_]);
											int i_1037_ = (((aShortArray9167[i_1031_] * i_1036_) - (aShortArray9168[i_1031_] * i_1035_) + 16383) >> 14);
											aShortArray9168[i_1031_] = (short) ((((aShortArray9167[i_1031_]) * i_1035_) + ((aShortArray9168[i_1031_]) * i_1036_) + 16383) >> 14);
											aShortArray9167[i_1031_] = (short) i_1037_;
										}
										if (i_942_ != 0) {
											int i_1038_ = (Class433.anIntArray4880[i_942_]);
											int i_1039_ = (Class433.anIntArray4881[i_942_]);
											int i_1040_ = (((aShortArray9168[i_1031_] * i_1038_) + (aShortArray9164[i_1031_] * i_1039_) + 16383) >> 14);
											aShortArray9168[i_1031_] = (short) ((((aShortArray9168[i_1031_]) * i_1039_) - ((aShortArray9164[i_1031_]) * i_1038_) + 16383) >> 14);
											aShortArray9164[i_1031_] = (short) i_1040_;
										}
									}
								}
							}
						}
					}
					method14548();
				}
			}
		} else if (i == 3) {
			if (is_945_ != null) {
				int i_1041_ = is_945_[9] << 4;
				int i_1042_ = is_945_[10] << 4;
				int i_1043_ = is_945_[11] << 4;
				int i_1044_ = is_945_[12] << 4;
				int i_1045_ = is_945_[13] << 4;
				int i_1046_ = is_945_[14] << 4;
				if (aBool9173) {
					int i_1047_ = ((is_945_[0] * anInt9221 + is_945_[3] * anInt9222 + is_945_[6] * anInt9151 + 8192) >> 14);
					int i_1048_ = ((is_945_[1] * anInt9221 + is_945_[4] * anInt9222 + is_945_[7] * anInt9151 + 8192) >> 14);
					int i_1049_ = ((is_945_[2] * anInt9221 + is_945_[5] * anInt9222 + is_945_[8] * anInt9151 + 8192) >> 14);
					i_1047_ += i_1044_;
					i_1048_ += i_1045_;
					i_1049_ += i_1046_;
					anInt9221 = i_1047_;
					anInt9222 = i_1048_;
					anInt9151 = i_1049_;
					aBool9173 = false;
				}
				int i_1050_ = i_941_ << 15 >> 7;
				int i_1051_ = i_942_ << 15 >> 7;
				int i_1052_ = i_943_ << 15 >> 7;
				int i_1053_ = i_1050_ * -anInt9221 + 8192 >> 14;
				int i_1054_ = i_1051_ * -anInt9222 + 8192 >> 14;
				int i_1055_ = i_1052_ * -anInt9151 + 8192 >> 14;
				int i_1056_ = i_1053_ + anInt9221;
				int i_1057_ = i_1054_ + anInt9222;
				int i_1058_ = i_1055_ + anInt9151;
				int[] is_1059_ = new int[9];
				is_1059_[0] = i_1050_ * is_945_[0] + 8192 >> 14;
				is_1059_[1] = i_1050_ * is_945_[3] + 8192 >> 14;
				is_1059_[2] = i_1050_ * is_945_[6] + 8192 >> 14;
				is_1059_[3] = i_1051_ * is_945_[1] + 8192 >> 14;
				is_1059_[4] = i_1051_ * is_945_[4] + 8192 >> 14;
				is_1059_[5] = i_1051_ * is_945_[7] + 8192 >> 14;
				is_1059_[6] = i_1052_ * is_945_[2] + 8192 >> 14;
				is_1059_[7] = i_1052_ * is_945_[5] + 8192 >> 14;
				is_1059_[8] = i_1052_ * is_945_[8] + 8192 >> 14;
				int i_1060_ = i_1050_ * i_1044_ + 8192 >> 14;
				int i_1061_ = i_1051_ * i_1045_ + 8192 >> 14;
				int i_1062_ = i_1052_ * i_1046_ + 8192 >> 14;
				i_1060_ += i_1056_;
				i_1061_ += i_1057_;
				i_1062_ += i_1058_;
				int[] is_1063_ = new int[9];
				for (int i_1064_ = 0; i_1064_ < 3; i_1064_++) {
					for (int i_1065_ = 0; i_1065_ < 3; i_1065_++) {
						int i_1066_ = 0;
						for (int i_1067_ = 0; i_1067_ < 3; i_1067_++)
							i_1066_ += (is_945_[i_1064_ * 3 + i_1067_] * is_1059_[i_1065_ + i_1067_ * 3]);
						is_1063_[i_1064_ * 3 + i_1065_] = i_1066_ + 8192 >> 14;
					}
				}
				int i_1068_ = ((is_945_[0] * i_1060_ + is_945_[1] * i_1061_ + is_945_[2] * i_1062_ + 8192) >> 14);
				int i_1069_ = ((is_945_[3] * i_1060_ + is_945_[4] * i_1061_ + is_945_[5] * i_1062_ + 8192) >> 14);
				int i_1070_ = ((is_945_[6] * i_1060_ + is_945_[7] * i_1061_ + is_945_[8] * i_1062_ + 8192) >> 14);
				i_1068_ += i_1041_;
				i_1069_ += i_1042_;
				i_1070_ += i_1043_;
				for (int i_1071_ = 0; i_1071_ < i_946_; i_1071_++) {
					int i_1072_ = is[i_1071_];
					if (i_1072_ < anIntArrayArray9190.length) {
						int[] is_1073_ = anIntArrayArray9190[i_1072_];
						for (int i_1074_ = 0; i_1074_ < is_1073_.length; i_1074_++) {
							int i_1075_ = is_1073_[i_1074_];
							if (aShortArray9162 == null || (i_944_ & aShortArray9162[i_1075_]) != 0) {
								int i_1076_ = ((is_1063_[0] * anIntArray9158[i_1075_] + is_1063_[1] * anIntArray9159[i_1075_] + is_1063_[2] * anIntArray9160[i_1075_] + 8192) >> 14);
								int i_1077_ = ((is_1063_[3] * anIntArray9158[i_1075_] + is_1063_[4] * anIntArray9159[i_1075_] + is_1063_[5] * anIntArray9160[i_1075_] + 8192) >> 14);
								int i_1078_ = ((is_1063_[6] * anIntArray9158[i_1075_] + is_1063_[7] * anIntArray9159[i_1075_] + is_1063_[8] * anIntArray9160[i_1075_] + 8192) >> 14);
								i_1076_ += i_1068_;
								i_1077_ += i_1069_;
								i_1078_ += i_1070_;
								anIntArray9158[i_1075_] = i_1076_;
								anIntArray9159[i_1075_] = i_1077_;
								anIntArray9160[i_1075_] = i_1078_;
							}
						}
					}
				}
			} else {
				for (int i_1079_ = 0; i_1079_ < i_946_; i_1079_++) {
					int i_1080_ = is[i_1079_];
					if (i_1080_ < anIntArrayArray9190.length) {
						int[] is_1081_ = anIntArrayArray9190[i_1080_];
						for (int i_1082_ = 0; i_1082_ < is_1081_.length; i_1082_++) {
							int i_1083_ = is_1081_[i_1082_];
							if (aShortArray9162 == null || (i_944_ & aShortArray9162[i_1083_]) != 0) {
								anIntArray9158[i_1083_] -= anInt9221;
								anIntArray9159[i_1083_] -= anInt9222;
								anIntArray9160[i_1083_] -= anInt9151;
								anIntArray9158[i_1083_] = anIntArray9158[i_1083_] * i_941_ >> 7;
								anIntArray9159[i_1083_] = anIntArray9159[i_1083_] * i_942_ >> 7;
								anIntArray9160[i_1083_] = anIntArray9160[i_1083_] * i_943_ >> 7;
								anIntArray9158[i_1083_] += anInt9221;
								anIntArray9159[i_1083_] += anInt9222;
								anIntArray9160[i_1083_] += anInt9151;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1084_ = false;
				for (int i_1085_ = 0; i_1085_ < i_946_; i_1085_++) {
					int i_1086_ = is[i_1085_];
					if (i_1086_ < anIntArrayArray9181.length) {
						int[] is_1087_ = anIntArrayArray9181[i_1086_];
						for (int i_1088_ = 0; i_1088_ < is_1087_.length; i_1088_++) {
							int i_1089_ = is_1087_[i_1088_];
							if (aShortArray9170 == null || (i_944_ & aShortArray9170[i_1089_]) != 0) {
								int i_1090_ = ((aByteArray9176[i_1089_] & 0xff) + i_941_ * 8);
								if (i_1090_ < 0)
									i_1090_ = 0;
								else if (i_1090_ > 255)
									i_1090_ = 255;
								aByteArray9176[i_1089_] = (byte) i_1090_;
							}
						}
						bool_1084_ = bool_1084_ | is_1087_.length > 0;
					}
				}
				if (bool_1084_) {
					if (aClass371Array9211 != null) {
						for (int i_1091_ = 0; i_1091_ < anInt9210; i_1091_++) {
							Class371 class371 = aClass371Array9211[i_1091_];
							Class337 class337 = aClass337Array9212[i_1091_];
							class337.anInt3565 = (class337.anInt3565 & 0xffffff | 255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24);
						}
					}
					method14547();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1092_ = false;
				for (int i_1093_ = 0; i_1093_ < i_946_; i_1093_++) {
					int i_1094_ = is[i_1093_];
					if (i_1094_ < anIntArrayArray9181.length) {
						int[] is_1095_ = anIntArrayArray9181[i_1094_];
						for (int i_1096_ = 0; i_1096_ < is_1095_.length; i_1096_++) {
							int i_1097_ = is_1095_[i_1096_];
							if (aShortArray9170 == null || (i_944_ & aShortArray9170[i_1097_]) != 0) {
								int i_1098_ = aShortArray9175[i_1097_] & 0xffff;
								int i_1099_ = i_1098_ >> 10 & 0x3f;
								int i_1100_ = i_1098_ >> 7 & 0x7;
								int i_1101_ = i_1098_ & 0x7f;
								i_1099_ = i_1099_ + i_941_ & 0x3f;
								i_1100_ += i_942_ / 4;
								if (i_1100_ < 0)
									i_1100_ = 0;
								else if (i_1100_ > 7)
									i_1100_ = 7;
								i_1101_ += i_943_;
								if (i_1101_ < 0)
									i_1101_ = 0;
								else if (i_1101_ > 127)
									i_1101_ = 127;
								aShortArray9175[i_1097_] = (short) (i_1099_ << 10 | i_1100_ << 7 | i_1101_);
							}
						}
						bool_1092_ = bool_1092_ | is_1095_.length > 0;
					}
				}
				if (bool_1092_) {
					if (aClass371Array9211 != null) {
						for (int i_1102_ = 0; i_1102_ < anInt9210; i_1102_++) {
							Class371 class371 = aClass371Array9211[i_1102_];
							Class337 class337 = aClass337Array9212[i_1102_];
							class337.anInt3565 = (class337.anInt3565 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9175[class371.anInt3891] & 0xffff)]) & 0xffffff);
						}
					}
					method14547();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9213 != null) {
				for (int i_1103_ = 0; i_1103_ < i_946_; i_1103_++) {
					int i_1104_ = is[i_1103_];
					if (i_1104_ < anIntArrayArray9213.length) {
						int[] is_1105_ = anIntArrayArray9213[i_1104_];
						for (int i_1106_ = 0; i_1106_ < is_1105_.length; i_1106_++) {
							Class337 class337 = aClass337Array9212[is_1105_[i_1106_]];
							class337.anInt3568 += i_941_;
							class337.anInt3569 += i_942_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9213 != null) {
				for (int i_1107_ = 0; i_1107_ < i_946_; i_1107_++) {
					int i_1108_ = is[i_1107_];
					if (i_1108_ < anIntArrayArray9213.length) {
						int[] is_1109_ = anIntArrayArray9213[i_1108_];
						for (int i_1110_ = 0; i_1110_ < is_1109_.length; i_1110_++) {
							Class337 class337 = aClass337Array9212[is_1109_[i_1110_]];
							class337.anInt3566 = class337.anInt3566 * i_941_ >> 7;
							class337.anInt3567 = class337.anInt3567 * i_942_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9213 != null) {
				for (int i_1111_ = 0; i_1111_ < i_946_; i_1111_++) {
					int i_1112_ = is[i_1111_];
					if (i_1112_ < anIntArrayArray9213.length) {
						int[] is_1113_ = anIntArrayArray9213[i_1112_];
						for (int i_1114_ = 0; i_1114_ < is_1113_.length; i_1114_++) {
							Class337 class337 = aClass337Array9212[is_1113_[i_1114_]];
							class337.anInt3570 = class337.anInt3570 + i_941_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2779(int i, int[] is, int i_1115_, int i_1116_, int i_1117_, boolean bool, int i_1118_, int[] is_1119_) {
		int i_1120_ = is.length;
		if (i == 0) {
			i_1115_ <<= 4;
			i_1116_ <<= 4;
			i_1117_ <<= 4;
			int i_1121_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_1122_ = 0; i_1122_ < i_1120_; i_1122_++) {
				int i_1123_ = is[i_1122_];
				if (i_1123_ < anIntArrayArray9190.length) {
					int[] is_1124_ = anIntArrayArray9190[i_1123_];
					for (int i_1125_ = 0; i_1125_ < is_1124_.length; i_1125_++) {
						int i_1126_ = is_1124_[i_1125_];
						if (aShortArray9162 == null || (i_1118_ & aShortArray9162[i_1126_]) != 0) {
							anInt9221 += anIntArray9158[i_1126_];
							anInt9222 += anIntArray9159[i_1126_];
							anInt9151 += anIntArray9160[i_1126_];
							i_1121_++;
						}
					}
				}
			}
			if (i_1121_ > 0) {
				anInt9221 = anInt9221 / i_1121_ + i_1115_;
				anInt9222 = anInt9222 / i_1121_ + i_1116_;
				anInt9151 = anInt9151 / i_1121_ + i_1117_;
				aBool9173 = true;
			} else {
				anInt9221 = i_1115_;
				anInt9222 = i_1116_;
				anInt9151 = i_1117_;
			}
		} else if (i == 1) {
			if (is_1119_ != null) {
				int i_1127_ = ((is_1119_[0] * i_1115_ + is_1119_[1] * i_1116_ + is_1119_[2] * i_1117_ + 8192) >> 14);
				int i_1128_ = ((is_1119_[3] * i_1115_ + is_1119_[4] * i_1116_ + is_1119_[5] * i_1117_ + 8192) >> 14);
				int i_1129_ = ((is_1119_[6] * i_1115_ + is_1119_[7] * i_1116_ + is_1119_[8] * i_1117_ + 8192) >> 14);
				i_1115_ = i_1127_;
				i_1116_ = i_1128_;
				i_1117_ = i_1129_;
			}
			i_1115_ <<= 4;
			i_1116_ <<= 4;
			i_1117_ <<= 4;
			for (int i_1130_ = 0; i_1130_ < i_1120_; i_1130_++) {
				int i_1131_ = is[i_1130_];
				if (i_1131_ < anIntArrayArray9190.length) {
					int[] is_1132_ = anIntArrayArray9190[i_1131_];
					for (int i_1133_ = 0; i_1133_ < is_1132_.length; i_1133_++) {
						int i_1134_ = is_1132_[i_1133_];
						if (aShortArray9162 == null || (i_1118_ & aShortArray9162[i_1134_]) != 0) {
							anIntArray9158[i_1134_] += i_1115_;
							anIntArray9159[i_1134_] += i_1116_;
							anIntArray9160[i_1134_] += i_1117_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1119_ != null) {
				int i_1135_ = is_1119_[9] << 4;
				int i_1136_ = is_1119_[10] << 4;
				int i_1137_ = is_1119_[11] << 4;
				int i_1138_ = is_1119_[12] << 4;
				int i_1139_ = is_1119_[13] << 4;
				int i_1140_ = is_1119_[14] << 4;
				if (aBool9173) {
					int i_1141_ = ((is_1119_[0] * anInt9221 + is_1119_[3] * anInt9222 + is_1119_[6] * anInt9151 + 8192) >> 14);
					int i_1142_ = ((is_1119_[1] * anInt9221 + is_1119_[4] * anInt9222 + is_1119_[7] * anInt9151 + 8192) >> 14);
					int i_1143_ = ((is_1119_[2] * anInt9221 + is_1119_[5] * anInt9222 + is_1119_[8] * anInt9151 + 8192) >> 14);
					i_1141_ += i_1138_;
					i_1142_ += i_1139_;
					i_1143_ += i_1140_;
					anInt9221 = i_1141_;
					anInt9222 = i_1142_;
					anInt9151 = i_1143_;
					aBool9173 = false;
				}
				int[] is_1144_ = new int[9];
				int i_1145_ = Class433.anIntArray4881[i_1115_];
				int i_1146_ = Class433.anIntArray4880[i_1115_];
				int i_1147_ = Class433.anIntArray4881[i_1116_];
				int i_1148_ = Class433.anIntArray4880[i_1116_];
				int i_1149_ = Class433.anIntArray4881[i_1117_];
				int i_1150_ = Class433.anIntArray4880[i_1117_];
				int i_1151_ = i_1146_ * i_1149_ + 8192 >> 14;
				int i_1152_ = i_1146_ * i_1150_ + 8192 >> 14;
				is_1144_[0] = i_1147_ * i_1149_ + i_1148_ * i_1152_ + 8192 >> 14;
				is_1144_[1] = -i_1147_ * i_1150_ + i_1148_ * i_1151_ + 8192 >> 14;
				is_1144_[2] = i_1148_ * i_1145_ + 8192 >> 14;
				is_1144_[3] = i_1145_ * i_1150_ + 8192 >> 14;
				is_1144_[4] = i_1145_ * i_1149_ + 8192 >> 14;
				is_1144_[5] = -i_1146_;
				is_1144_[6] = -i_1148_ * i_1149_ + i_1147_ * i_1152_ + 8192 >> 14;
				is_1144_[7] = i_1148_ * i_1150_ + i_1147_ * i_1151_ + 8192 >> 14;
				is_1144_[8] = i_1147_ * i_1145_ + 8192 >> 14;
				int i_1153_ = ((is_1144_[0] * -anInt9221 + is_1144_[1] * -anInt9222 + is_1144_[2] * -anInt9151 + 8192) >> 14);
				int i_1154_ = ((is_1144_[3] * -anInt9221 + is_1144_[4] * -anInt9222 + is_1144_[5] * -anInt9151 + 8192) >> 14);
				int i_1155_ = ((is_1144_[6] * -anInt9221 + is_1144_[7] * -anInt9222 + is_1144_[8] * -anInt9151 + 8192) >> 14);
				int i_1156_ = i_1153_ + anInt9221;
				int i_1157_ = i_1154_ + anInt9222;
				int i_1158_ = i_1155_ + anInt9151;
				int[] is_1159_ = new int[9];
				for (int i_1160_ = 0; i_1160_ < 3; i_1160_++) {
					for (int i_1161_ = 0; i_1161_ < 3; i_1161_++) {
						int i_1162_ = 0;
						for (int i_1163_ = 0; i_1163_ < 3; i_1163_++)
							i_1162_ += (is_1144_[i_1160_ * 3 + i_1163_] * is_1119_[i_1161_ * 3 + i_1163_]);
						is_1159_[i_1160_ * 3 + i_1161_] = i_1162_ + 8192 >> 14;
					}
				}
				int i_1164_ = ((is_1144_[0] * i_1138_ + is_1144_[1] * i_1139_ + is_1144_[2] * i_1140_ + 8192) >> 14);
				int i_1165_ = ((is_1144_[3] * i_1138_ + is_1144_[4] * i_1139_ + is_1144_[5] * i_1140_ + 8192) >> 14);
				int i_1166_ = ((is_1144_[6] * i_1138_ + is_1144_[7] * i_1139_ + is_1144_[8] * i_1140_ + 8192) >> 14);
				i_1164_ += i_1156_;
				i_1165_ += i_1157_;
				i_1166_ += i_1158_;
				int[] is_1167_ = new int[9];
				for (int i_1168_ = 0; i_1168_ < 3; i_1168_++) {
					for (int i_1169_ = 0; i_1169_ < 3; i_1169_++) {
						int i_1170_ = 0;
						for (int i_1171_ = 0; i_1171_ < 3; i_1171_++)
							i_1170_ += (is_1119_[i_1168_ * 3 + i_1171_] * is_1159_[i_1169_ + i_1171_ * 3]);
						is_1167_[i_1168_ * 3 + i_1169_] = i_1170_ + 8192 >> 14;
					}
				}
				int i_1172_ = ((is_1119_[0] * i_1164_ + is_1119_[1] * i_1165_ + is_1119_[2] * i_1166_ + 8192) >> 14);
				int i_1173_ = ((is_1119_[3] * i_1164_ + is_1119_[4] * i_1165_ + is_1119_[5] * i_1166_ + 8192) >> 14);
				int i_1174_ = ((is_1119_[6] * i_1164_ + is_1119_[7] * i_1165_ + is_1119_[8] * i_1166_ + 8192) >> 14);
				i_1172_ += i_1135_;
				i_1173_ += i_1136_;
				i_1174_ += i_1137_;
				for (int i_1175_ = 0; i_1175_ < i_1120_; i_1175_++) {
					int i_1176_ = is[i_1175_];
					if (i_1176_ < anIntArrayArray9190.length) {
						int[] is_1177_ = anIntArrayArray9190[i_1176_];
						for (int i_1178_ = 0; i_1178_ < is_1177_.length; i_1178_++) {
							int i_1179_ = is_1177_[i_1178_];
							if (aShortArray9162 == null || (i_1118_ & aShortArray9162[i_1179_]) != 0) {
								int i_1180_ = ((is_1167_[0] * anIntArray9158[i_1179_] + is_1167_[1] * anIntArray9159[i_1179_] + is_1167_[2] * anIntArray9160[i_1179_] + 8192) >> 14);
								int i_1181_ = ((is_1167_[3] * anIntArray9158[i_1179_] + is_1167_[4] * anIntArray9159[i_1179_] + is_1167_[5] * anIntArray9160[i_1179_] + 8192) >> 14);
								int i_1182_ = ((is_1167_[6] * anIntArray9158[i_1179_] + is_1167_[7] * anIntArray9159[i_1179_] + is_1167_[8] * anIntArray9160[i_1179_] + 8192) >> 14);
								i_1180_ += i_1172_;
								i_1181_ += i_1173_;
								i_1182_ += i_1174_;
								anIntArray9158[i_1179_] = i_1180_;
								anIntArray9159[i_1179_] = i_1181_;
								anIntArray9160[i_1179_] = i_1182_;
							}
						}
					}
				}
			} else {
				for (int i_1183_ = 0; i_1183_ < i_1120_; i_1183_++) {
					int i_1184_ = is[i_1183_];
					if (i_1184_ < anIntArrayArray9190.length) {
						int[] is_1185_ = anIntArrayArray9190[i_1184_];
						for (int i_1186_ = 0; i_1186_ < is_1185_.length; i_1186_++) {
							int i_1187_ = is_1185_[i_1186_];
							if (aShortArray9162 == null || (i_1118_ & aShortArray9162[i_1187_]) != 0) {
								anIntArray9158[i_1187_] -= anInt9221;
								anIntArray9159[i_1187_] -= anInt9222;
								anIntArray9160[i_1187_] -= anInt9151;
								if (i_1117_ != 0) {
									int i_1188_ = Class433.anIntArray4880[i_1117_];
									int i_1189_ = Class433.anIntArray4881[i_1117_];
									int i_1190_ = ((anIntArray9159[i_1187_] * i_1188_ + anIntArray9158[i_1187_] * i_1189_ + 16383) >> 14);
									anIntArray9159[i_1187_] = (anIntArray9159[i_1187_] * i_1189_ - anIntArray9158[i_1187_] * i_1188_ + 16383) >> 14;
									anIntArray9158[i_1187_] = i_1190_;
								}
								if (i_1115_ != 0) {
									int i_1191_ = Class433.anIntArray4880[i_1115_];
									int i_1192_ = Class433.anIntArray4881[i_1115_];
									int i_1193_ = ((anIntArray9159[i_1187_] * i_1192_ - anIntArray9160[i_1187_] * i_1191_ + 16383) >> 14);
									anIntArray9160[i_1187_] = (anIntArray9159[i_1187_] * i_1191_ + anIntArray9160[i_1187_] * i_1192_ + 16383) >> 14;
									anIntArray9159[i_1187_] = i_1193_;
								}
								if (i_1116_ != 0) {
									int i_1194_ = Class433.anIntArray4880[i_1116_];
									int i_1195_ = Class433.anIntArray4881[i_1116_];
									int i_1196_ = ((anIntArray9160[i_1187_] * i_1194_ + anIntArray9158[i_1187_] * i_1195_ + 16383) >> 14);
									anIntArray9160[i_1187_] = (anIntArray9160[i_1187_] * i_1195_ - anIntArray9158[i_1187_] * i_1194_ + 16383) >> 14;
									anIntArray9158[i_1187_] = i_1196_;
								}
								anIntArray9158[i_1187_] += anInt9221;
								anIntArray9159[i_1187_] += anInt9222;
								anIntArray9160[i_1187_] += anInt9151;
							}
						}
					}
				}
				if (bool) {
					for (int i_1197_ = 0; i_1197_ < i_1120_; i_1197_++) {
						int i_1198_ = is[i_1197_];
						if (i_1198_ < anIntArrayArray9190.length) {
							int[] is_1199_ = anIntArrayArray9190[i_1198_];
							for (int i_1200_ = 0; i_1200_ < is_1199_.length; i_1200_++) {
								int i_1201_ = is_1199_[i_1200_];
								if (aShortArray9162 == null || ((i_1118_ & aShortArray9162[i_1201_]) != 0)) {
									int i_1202_ = anIntArray9199[i_1201_];
									int i_1203_ = anIntArray9199[i_1201_ + 1];
									for (int i_1204_ = i_1202_; (i_1204_ < i_1203_ && aShortArray9207[i_1204_] != 0); i_1204_++) {
										int i_1205_ = (aShortArray9207[i_1204_] & 0xffff) - 1;
										if (i_1117_ != 0) {
											int i_1206_ = (Class433.anIntArray4880[i_1117_]);
											int i_1207_ = (Class433.anIntArray4881[i_1117_]);
											int i_1208_ = (((aShortArray9167[i_1205_] * i_1206_) + (aShortArray9164[i_1205_] * i_1207_) + 16383) >> 14);
											aShortArray9167[i_1205_] = (short) ((((aShortArray9167[i_1205_]) * i_1207_) - ((aShortArray9164[i_1205_]) * i_1206_) + 16383) >> 14);
											aShortArray9164[i_1205_] = (short) i_1208_;
										}
										if (i_1115_ != 0) {
											int i_1209_ = (Class433.anIntArray4880[i_1115_]);
											int i_1210_ = (Class433.anIntArray4881[i_1115_]);
											int i_1211_ = (((aShortArray9167[i_1205_] * i_1210_) - (aShortArray9168[i_1205_] * i_1209_) + 16383) >> 14);
											aShortArray9168[i_1205_] = (short) ((((aShortArray9167[i_1205_]) * i_1209_) + ((aShortArray9168[i_1205_]) * i_1210_) + 16383) >> 14);
											aShortArray9167[i_1205_] = (short) i_1211_;
										}
										if (i_1116_ != 0) {
											int i_1212_ = (Class433.anIntArray4880[i_1116_]);
											int i_1213_ = (Class433.anIntArray4881[i_1116_]);
											int i_1214_ = (((aShortArray9168[i_1205_] * i_1212_) + (aShortArray9164[i_1205_] * i_1213_) + 16383) >> 14);
											aShortArray9168[i_1205_] = (short) ((((aShortArray9168[i_1205_]) * i_1213_) - ((aShortArray9164[i_1205_]) * i_1212_) + 16383) >> 14);
											aShortArray9164[i_1205_] = (short) i_1214_;
										}
									}
								}
							}
						}
					}
					method14548();
				}
			}
		} else if (i == 3) {
			if (is_1119_ != null) {
				int i_1215_ = is_1119_[9] << 4;
				int i_1216_ = is_1119_[10] << 4;
				int i_1217_ = is_1119_[11] << 4;
				int i_1218_ = is_1119_[12] << 4;
				int i_1219_ = is_1119_[13] << 4;
				int i_1220_ = is_1119_[14] << 4;
				if (aBool9173) {
					int i_1221_ = ((is_1119_[0] * anInt9221 + is_1119_[3] * anInt9222 + is_1119_[6] * anInt9151 + 8192) >> 14);
					int i_1222_ = ((is_1119_[1] * anInt9221 + is_1119_[4] * anInt9222 + is_1119_[7] * anInt9151 + 8192) >> 14);
					int i_1223_ = ((is_1119_[2] * anInt9221 + is_1119_[5] * anInt9222 + is_1119_[8] * anInt9151 + 8192) >> 14);
					i_1221_ += i_1218_;
					i_1222_ += i_1219_;
					i_1223_ += i_1220_;
					anInt9221 = i_1221_;
					anInt9222 = i_1222_;
					anInt9151 = i_1223_;
					aBool9173 = false;
				}
				int i_1224_ = i_1115_ << 15 >> 7;
				int i_1225_ = i_1116_ << 15 >> 7;
				int i_1226_ = i_1117_ << 15 >> 7;
				int i_1227_ = i_1224_ * -anInt9221 + 8192 >> 14;
				int i_1228_ = i_1225_ * -anInt9222 + 8192 >> 14;
				int i_1229_ = i_1226_ * -anInt9151 + 8192 >> 14;
				int i_1230_ = i_1227_ + anInt9221;
				int i_1231_ = i_1228_ + anInt9222;
				int i_1232_ = i_1229_ + anInt9151;
				int[] is_1233_ = new int[9];
				is_1233_[0] = i_1224_ * is_1119_[0] + 8192 >> 14;
				is_1233_[1] = i_1224_ * is_1119_[3] + 8192 >> 14;
				is_1233_[2] = i_1224_ * is_1119_[6] + 8192 >> 14;
				is_1233_[3] = i_1225_ * is_1119_[1] + 8192 >> 14;
				is_1233_[4] = i_1225_ * is_1119_[4] + 8192 >> 14;
				is_1233_[5] = i_1225_ * is_1119_[7] + 8192 >> 14;
				is_1233_[6] = i_1226_ * is_1119_[2] + 8192 >> 14;
				is_1233_[7] = i_1226_ * is_1119_[5] + 8192 >> 14;
				is_1233_[8] = i_1226_ * is_1119_[8] + 8192 >> 14;
				int i_1234_ = i_1224_ * i_1218_ + 8192 >> 14;
				int i_1235_ = i_1225_ * i_1219_ + 8192 >> 14;
				int i_1236_ = i_1226_ * i_1220_ + 8192 >> 14;
				i_1234_ += i_1230_;
				i_1235_ += i_1231_;
				i_1236_ += i_1232_;
				int[] is_1237_ = new int[9];
				for (int i_1238_ = 0; i_1238_ < 3; i_1238_++) {
					for (int i_1239_ = 0; i_1239_ < 3; i_1239_++) {
						int i_1240_ = 0;
						for (int i_1241_ = 0; i_1241_ < 3; i_1241_++)
							i_1240_ += (is_1119_[i_1238_ * 3 + i_1241_] * is_1233_[i_1239_ + i_1241_ * 3]);
						is_1237_[i_1238_ * 3 + i_1239_] = i_1240_ + 8192 >> 14;
					}
				}
				int i_1242_ = ((is_1119_[0] * i_1234_ + is_1119_[1] * i_1235_ + is_1119_[2] * i_1236_ + 8192) >> 14);
				int i_1243_ = ((is_1119_[3] * i_1234_ + is_1119_[4] * i_1235_ + is_1119_[5] * i_1236_ + 8192) >> 14);
				int i_1244_ = ((is_1119_[6] * i_1234_ + is_1119_[7] * i_1235_ + is_1119_[8] * i_1236_ + 8192) >> 14);
				i_1242_ += i_1215_;
				i_1243_ += i_1216_;
				i_1244_ += i_1217_;
				for (int i_1245_ = 0; i_1245_ < i_1120_; i_1245_++) {
					int i_1246_ = is[i_1245_];
					if (i_1246_ < anIntArrayArray9190.length) {
						int[] is_1247_ = anIntArrayArray9190[i_1246_];
						for (int i_1248_ = 0; i_1248_ < is_1247_.length; i_1248_++) {
							int i_1249_ = is_1247_[i_1248_];
							if (aShortArray9162 == null || (i_1118_ & aShortArray9162[i_1249_]) != 0) {
								int i_1250_ = ((is_1237_[0] * anIntArray9158[i_1249_] + is_1237_[1] * anIntArray9159[i_1249_] + is_1237_[2] * anIntArray9160[i_1249_] + 8192) >> 14);
								int i_1251_ = ((is_1237_[3] * anIntArray9158[i_1249_] + is_1237_[4] * anIntArray9159[i_1249_] + is_1237_[5] * anIntArray9160[i_1249_] + 8192) >> 14);
								int i_1252_ = ((is_1237_[6] * anIntArray9158[i_1249_] + is_1237_[7] * anIntArray9159[i_1249_] + is_1237_[8] * anIntArray9160[i_1249_] + 8192) >> 14);
								i_1250_ += i_1242_;
								i_1251_ += i_1243_;
								i_1252_ += i_1244_;
								anIntArray9158[i_1249_] = i_1250_;
								anIntArray9159[i_1249_] = i_1251_;
								anIntArray9160[i_1249_] = i_1252_;
							}
						}
					}
				}
			} else {
				for (int i_1253_ = 0; i_1253_ < i_1120_; i_1253_++) {
					int i_1254_ = is[i_1253_];
					if (i_1254_ < anIntArrayArray9190.length) {
						int[] is_1255_ = anIntArrayArray9190[i_1254_];
						for (int i_1256_ = 0; i_1256_ < is_1255_.length; i_1256_++) {
							int i_1257_ = is_1255_[i_1256_];
							if (aShortArray9162 == null || (i_1118_ & aShortArray9162[i_1257_]) != 0) {
								anIntArray9158[i_1257_] -= anInt9221;
								anIntArray9159[i_1257_] -= anInt9222;
								anIntArray9160[i_1257_] -= anInt9151;
								anIntArray9158[i_1257_] = anIntArray9158[i_1257_] * i_1115_ >> 7;
								anIntArray9159[i_1257_] = anIntArray9159[i_1257_] * i_1116_ >> 7;
								anIntArray9160[i_1257_] = anIntArray9160[i_1257_] * i_1117_ >> 7;
								anIntArray9158[i_1257_] += anInt9221;
								anIntArray9159[i_1257_] += anInt9222;
								anIntArray9160[i_1257_] += anInt9151;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1258_ = false;
				for (int i_1259_ = 0; i_1259_ < i_1120_; i_1259_++) {
					int i_1260_ = is[i_1259_];
					if (i_1260_ < anIntArrayArray9181.length) {
						int[] is_1261_ = anIntArrayArray9181[i_1260_];
						for (int i_1262_ = 0; i_1262_ < is_1261_.length; i_1262_++) {
							int i_1263_ = is_1261_[i_1262_];
							if (aShortArray9170 == null || (i_1118_ & aShortArray9170[i_1263_]) != 0) {
								int i_1264_ = ((aByteArray9176[i_1263_] & 0xff) + i_1115_ * 8);
								if (i_1264_ < 0)
									i_1264_ = 0;
								else if (i_1264_ > 255)
									i_1264_ = 255;
								aByteArray9176[i_1263_] = (byte) i_1264_;
							}
						}
						bool_1258_ = bool_1258_ | is_1261_.length > 0;
					}
				}
				if (bool_1258_) {
					if (aClass371Array9211 != null) {
						for (int i_1265_ = 0; i_1265_ < anInt9210; i_1265_++) {
							Class371 class371 = aClass371Array9211[i_1265_];
							Class337 class337 = aClass337Array9212[i_1265_];
							class337.anInt3565 = (class337.anInt3565 & 0xffffff | 255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24);
						}
					}
					method14547();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1266_ = false;
				for (int i_1267_ = 0; i_1267_ < i_1120_; i_1267_++) {
					int i_1268_ = is[i_1267_];
					if (i_1268_ < anIntArrayArray9181.length) {
						int[] is_1269_ = anIntArrayArray9181[i_1268_];
						for (int i_1270_ = 0; i_1270_ < is_1269_.length; i_1270_++) {
							int i_1271_ = is_1269_[i_1270_];
							if (aShortArray9170 == null || (i_1118_ & aShortArray9170[i_1271_]) != 0) {
								int i_1272_ = aShortArray9175[i_1271_] & 0xffff;
								int i_1273_ = i_1272_ >> 10 & 0x3f;
								int i_1274_ = i_1272_ >> 7 & 0x7;
								int i_1275_ = i_1272_ & 0x7f;
								i_1273_ = i_1273_ + i_1115_ & 0x3f;
								i_1274_ += i_1116_ / 4;
								if (i_1274_ < 0)
									i_1274_ = 0;
								else if (i_1274_ > 7)
									i_1274_ = 7;
								i_1275_ += i_1117_;
								if (i_1275_ < 0)
									i_1275_ = 0;
								else if (i_1275_ > 127)
									i_1275_ = 127;
								aShortArray9175[i_1271_] = (short) (i_1273_ << 10 | i_1274_ << 7 | i_1275_);
							}
						}
						bool_1266_ = bool_1266_ | is_1269_.length > 0;
					}
				}
				if (bool_1266_) {
					if (aClass371Array9211 != null) {
						for (int i_1276_ = 0; i_1276_ < anInt9210; i_1276_++) {
							Class371 class371 = aClass371Array9211[i_1276_];
							Class337 class337 = aClass337Array9212[i_1276_];
							class337.anInt3565 = (class337.anInt3565 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9175[class371.anInt3891] & 0xffff)]) & 0xffffff);
						}
					}
					method14547();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9213 != null) {
				for (int i_1277_ = 0; i_1277_ < i_1120_; i_1277_++) {
					int i_1278_ = is[i_1277_];
					if (i_1278_ < anIntArrayArray9213.length) {
						int[] is_1279_ = anIntArrayArray9213[i_1278_];
						for (int i_1280_ = 0; i_1280_ < is_1279_.length; i_1280_++) {
							Class337 class337 = aClass337Array9212[is_1279_[i_1280_]];
							class337.anInt3568 += i_1115_;
							class337.anInt3569 += i_1116_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9213 != null) {
				for (int i_1281_ = 0; i_1281_ < i_1120_; i_1281_++) {
					int i_1282_ = is[i_1281_];
					if (i_1282_ < anIntArrayArray9213.length) {
						int[] is_1283_ = anIntArrayArray9213[i_1282_];
						for (int i_1284_ = 0; i_1284_ < is_1283_.length; i_1284_++) {
							Class337 class337 = aClass337Array9212[is_1283_[i_1284_]];
							class337.anInt3566 = class337.anInt3566 * i_1115_ >> 7;
							class337.anInt3567 = class337.anInt3567 * i_1116_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9213 != null) {
				for (int i_1285_ = 0; i_1285_ < i_1120_; i_1285_++) {
					int i_1286_ = is[i_1285_];
					if (i_1286_ < anIntArrayArray9213.length) {
						int[] is_1287_ = anIntArrayArray9213[i_1286_];
						for (int i_1288_ = 0; i_1288_ < is_1287_.length; i_1288_++) {
							Class337 class337 = aClass337Array9212[is_1287_[i_1288_]];
							class337.anInt3570 = class337.anInt3570 + i_1115_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method14572() {
		int i = 32767;
		int i_1289_ = 32767;
		int i_1290_ = 32767;
		int i_1291_ = -32768;
		int i_1292_ = -32768;
		int i_1293_ = -32768;
		int i_1294_ = 0;
		int i_1295_ = 0;
		for (int i_1296_ = 0; i_1296_ < anInt9157; i_1296_++) {
			int i_1297_ = anIntArray9158[i_1296_];
			int i_1298_ = anIntArray9159[i_1296_];
			int i_1299_ = anIntArray9160[i_1296_];
			if (i_1297_ < i)
				i = i_1297_;
			if (i_1297_ > i_1291_)
				i_1291_ = i_1297_;
			if (i_1298_ < i_1289_)
				i_1289_ = i_1298_;
			if (i_1298_ > i_1292_)
				i_1292_ = i_1298_;
			if (i_1299_ < i_1290_)
				i_1290_ = i_1299_;
			if (i_1299_ > i_1293_)
				i_1293_ = i_1299_;
			int i_1300_ = i_1297_ * i_1297_ + i_1299_ * i_1299_;
			if (i_1300_ > i_1294_)
				i_1294_ = i_1300_;
			i_1300_ = i_1297_ * i_1297_ + i_1299_ * i_1299_ + i_1298_ * i_1298_;
			if (i_1300_ > i_1295_)
				i_1295_ = i_1300_;
		}
		anInt9197 = i;
		anInt9165 = i_1291_;
		anInt9195 = i_1289_;
		anInt9196 = i_1292_;
		anInt9154 = i_1290_;
		anInt9200 = i_1293_;
		anInt9193 = (int) (Math.sqrt((double) i_1294_) + 0.99);
		anInt9192 = (int) (Math.sqrt((double) i_1295_) + 0.99);
		aBool9215 = true;
	}

	public void method2776(Class435 class435, int i, boolean bool) {
		if (aShortArray9162 != null) {
			Class435 class435_1301_ = class435;
			if (bool) {
				class435_1301_ = aClass178_Sub2_9153.aClass435_9559;
				class435_1301_.method6824(class435);
			}
			float[] fs = new float[3];
			for (int i_1302_ = 0; i_1302_ < anInt9157; i_1302_++) {
				if ((i & aShortArray9162[i_1302_]) != 0) {
					class435_1301_.method6858((float) anIntArray9158[i_1302_], (float) anIntArray9159[i_1302_], (float) anIntArray9160[i_1302_], fs);
					anIntArray9158[i_1302_] = (int) fs[0];
					anIntArray9159[i_1302_] = (int) fs[1];
					anIntArray9160[i_1302_] = (int) fs[2];
				}
			}
		}
	}

	public void method2782(Class435 class435, int i, boolean bool) {
		if (aShortArray9162 != null) {
			Class435 class435_1303_ = class435;
			if (bool) {
				class435_1303_ = aClass178_Sub2_9153.aClass435_9559;
				class435_1303_.method6824(class435);
			}
			float[] fs = new float[3];
			for (int i_1304_ = 0; i_1304_ < anInt9157; i_1304_++) {
				if ((i & aShortArray9162[i_1304_]) != 0) {
					class435_1303_.method6858((float) anIntArray9158[i_1304_], (float) anIntArray9159[i_1304_], (float) anIntArray9160[i_1304_], fs);
					anIntArray9158[i_1304_] = (int) fs[0];
					anIntArray9159[i_1304_] = (int) fs[1];
					anIntArray9160[i_1304_] = (int) fs[2];
				}
			}
		}
	}

	public void method2783(Class435 class435, Class180 class180, int i) {
		if (aClass343_9225 != null)
			aClass343_9225.method5990();
		if (class180 != null)
			class180.aBool2000 = false;
		if (anInt9163 != 0) {
			Class441 class441 = aClass178_Sub2_9153.aClass441_9570;
			Class441 class441_1305_ = aClass178_Sub2_9153.aClass441_9560;
			Class441 class441_1306_ = aClass178_Sub2_9153.aClass441_9561;
			class441_1305_.method7090(class435);
			class441_1306_.method7086(class441_1305_);
			class441_1306_.method7089(aClass178_Sub2_9153.aClass441_9574);
			if (!aBool9215)
				method14569();
			float[] fs = aClass178_Sub2_9153.aFloatArray9610;
			class441_1305_.method7185(0.0F, (float) anInt9195, 0.0F, fs);
			float f = fs[0];
			float f_1307_ = fs[1];
			float f_1308_ = fs[2];
			class441_1305_.method7185(0.0F, (float) anInt9196, 0.0F, fs);
			float f_1309_ = fs[0];
			float f_1310_ = fs[1];
			float f_1311_ = fs[2];
			for (int i_1312_ = 0; i_1312_ < 6; i_1312_++) {
				float[] fs_1313_ = aClass178_Sub2_9153.aFloatArrayArray9576[i_1312_];
				float f_1314_ = (fs_1313_[0] * f + fs_1313_[1] * f_1307_ + fs_1313_[2] * f_1308_ + fs_1313_[3] + (float) anInt9193);
				float f_1315_ = (fs_1313_[0] * f_1309_ + fs_1313_[1] * f_1310_ + fs_1313_[2] * f_1311_ + fs_1313_[3] + (float) anInt9193);
				if (f_1314_ < 0.0F && f_1315_ < 0.0F)
					return;
			}
			if (class180 != null) {
				boolean bool = false;
				boolean bool_1316_ = true;
				int i_1317_ = anInt9197 + anInt9165 >> 1;
				int i_1318_ = anInt9154 + anInt9200 >> 1;
				int i_1319_ = i_1317_;
				int i_1320_ = anInt9195;
				int i_1321_ = i_1318_;
				float f_1322_ = (class441_1306_.aFloatArray4916[0] * (float) i_1319_ + class441_1306_.aFloatArray4916[4] * (float) i_1320_ + class441_1306_.aFloatArray4916[8] * (float) i_1321_ + class441_1306_.aFloatArray4916[12]);
				float f_1323_ = (class441_1306_.aFloatArray4916[1] * (float) i_1319_ + class441_1306_.aFloatArray4916[5] * (float) i_1320_ + class441_1306_.aFloatArray4916[9] * (float) i_1321_ + class441_1306_.aFloatArray4916[13]);
				float f_1324_ = (class441_1306_.aFloatArray4916[2] * (float) i_1319_ + class441_1306_.aFloatArray4916[6] * (float) i_1320_ + class441_1306_.aFloatArray4916[10] * (float) i_1321_ + class441_1306_.aFloatArray4916[14]);
				float f_1325_ = (class441_1306_.aFloatArray4916[3] * (float) i_1319_ + class441_1306_.aFloatArray4916[7] * (float) i_1320_ + class441_1306_.aFloatArray4916[11] * (float) i_1321_ + class441_1306_.aFloatArray4916[15]);
				if (f_1324_ >= -f_1325_) {
					class180.anInt1999 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1322_ / f_1325_));
					class180.anInt2002 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1323_ / f_1325_));
				} else
					bool = true;
				i_1319_ = i_1317_;
				i_1320_ = anInt9196;
				i_1321_ = i_1318_;
				float f_1326_ = (class441_1306_.aFloatArray4916[0] * (float) i_1319_ + class441_1306_.aFloatArray4916[4] * (float) i_1320_ + class441_1306_.aFloatArray4916[8] * (float) i_1321_ + class441_1306_.aFloatArray4916[12]);
				float f_1327_ = (class441_1306_.aFloatArray4916[1] * (float) i_1319_ + class441_1306_.aFloatArray4916[5] * (float) i_1320_ + class441_1306_.aFloatArray4916[9] * (float) i_1321_ + class441_1306_.aFloatArray4916[13]);
				float f_1328_ = (class441_1306_.aFloatArray4916[2] * (float) i_1319_ + class441_1306_.aFloatArray4916[6] * (float) i_1320_ + class441_1306_.aFloatArray4916[10] * (float) i_1321_ + class441_1306_.aFloatArray4916[14]);
				float f_1329_ = (class441_1306_.aFloatArray4916[3] * (float) i_1319_ + class441_1306_.aFloatArray4916[7] * (float) i_1320_ + class441_1306_.aFloatArray4916[11] * (float) i_1321_ + class441_1306_.aFloatArray4916[15]);
				if (f_1328_ >= -f_1329_) {
					class180.anInt1998 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1326_ / f_1329_));
					class180.anInt2003 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1327_ / f_1329_));
				} else
					bool = true;
				if (bool) {
					if (f_1324_ < -f_1325_ && f_1328_ < -f_1329_)
						bool_1316_ = false;
					else if (f_1324_ < -f_1325_) {
						float f_1330_ = (f_1324_ + f_1325_) / (f_1328_ + f_1329_) - 1.0F;
						float f_1331_ = f_1322_ + f_1330_ * (f_1326_ - f_1322_);
						float f_1332_ = f_1323_ + f_1330_ * (f_1327_ - f_1323_);
						float f_1333_ = f_1325_ + f_1330_ * (f_1329_ - f_1325_);
						class180.anInt1999 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1331_ / f_1333_));
						class180.anInt2002 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1332_ / f_1333_));
					} else if (f_1328_ < -f_1329_) {
						float f_1334_ = (f_1328_ + f_1329_) / (f_1324_ + f_1325_) - 1.0F;
						float f_1335_ = f_1326_ + f_1334_ * (f_1322_ - f_1326_);
						float f_1336_ = f_1327_ + f_1334_ * (f_1323_ - f_1327_);
						float f_1337_ = f_1329_ + f_1334_ * (f_1325_ - f_1329_);
						class180.anInt1998 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1335_ / f_1337_));
						class180.anInt2003 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1336_ / f_1337_));
					}
				}
				if (bool_1316_) {
					if (f_1324_ / f_1325_ > f_1328_ / f_1329_) {
						float f_1338_ = (f_1322_ + (class441.aFloatArray4916[0] * (float) anInt9193) + class441.aFloatArray4916[12]);
						float f_1339_ = (f_1325_ + (class441.aFloatArray4916[3] * (float) anInt9193) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub2_9153.aFloat9603 - (float) class180.anInt1999 + (aClass178_Sub2_9153.aFloat9578 * f_1338_ / f_1339_));
					} else {
						float f_1340_ = (f_1326_ + (class441.aFloatArray4916[0] * (float) anInt9193) + class441.aFloatArray4916[12]);
						float f_1341_ = (f_1329_ + (class441.aFloatArray4916[3] * (float) anInt9193) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub2_9153.aFloat9603 - (float) class180.anInt1998 + (aClass178_Sub2_9153.aFloat9578 * f_1340_ / f_1341_));
					}
					class180.aBool2000 = true;
				}
			}
			aClass178_Sub2_9153.method15044(i);
			method14558(class435);
			aClass178_Sub2_9153.method15044(0);
			class441_1305_.method7090(class435);
			class441_1305_.method7089(aClass178_Sub2_9153.aClass441_9629);
			method14559(class441_1305_);
		}
	}

	public void method2784(Class435 class435, Class180 class180, int i) {
		if (aClass343_9225 != null)
			aClass343_9225.method5990();
		if (class180 != null)
			class180.aBool2000 = false;
		if (anInt9163 != 0) {
			Class441 class441 = aClass178_Sub2_9153.aClass441_9570;
			Class441 class441_1342_ = aClass178_Sub2_9153.aClass441_9560;
			Class441 class441_1343_ = aClass178_Sub2_9153.aClass441_9561;
			class441_1342_.method7090(class435);
			class441_1343_.method7086(class441_1342_);
			class441_1343_.method7089(aClass178_Sub2_9153.aClass441_9574);
			if (!aBool9215)
				method14569();
			float[] fs = aClass178_Sub2_9153.aFloatArray9610;
			class441_1342_.method7185(0.0F, (float) anInt9195, 0.0F, fs);
			float f = fs[0];
			float f_1344_ = fs[1];
			float f_1345_ = fs[2];
			class441_1342_.method7185(0.0F, (float) anInt9196, 0.0F, fs);
			float f_1346_ = fs[0];
			float f_1347_ = fs[1];
			float f_1348_ = fs[2];
			for (int i_1349_ = 0; i_1349_ < 6; i_1349_++) {
				float[] fs_1350_ = aClass178_Sub2_9153.aFloatArrayArray9576[i_1349_];
				float f_1351_ = (fs_1350_[0] * f + fs_1350_[1] * f_1344_ + fs_1350_[2] * f_1345_ + fs_1350_[3] + (float) anInt9193);
				float f_1352_ = (fs_1350_[0] * f_1346_ + fs_1350_[1] * f_1347_ + fs_1350_[2] * f_1348_ + fs_1350_[3] + (float) anInt9193);
				if (f_1351_ < 0.0F && f_1352_ < 0.0F)
					return;
			}
			if (class180 != null) {
				boolean bool = false;
				boolean bool_1353_ = true;
				int i_1354_ = anInt9197 + anInt9165 >> 1;
				int i_1355_ = anInt9154 + anInt9200 >> 1;
				int i_1356_ = i_1354_;
				int i_1357_ = anInt9195;
				int i_1358_ = i_1355_;
				float f_1359_ = (class441_1343_.aFloatArray4916[0] * (float) i_1356_ + class441_1343_.aFloatArray4916[4] * (float) i_1357_ + class441_1343_.aFloatArray4916[8] * (float) i_1358_ + class441_1343_.aFloatArray4916[12]);
				float f_1360_ = (class441_1343_.aFloatArray4916[1] * (float) i_1356_ + class441_1343_.aFloatArray4916[5] * (float) i_1357_ + class441_1343_.aFloatArray4916[9] * (float) i_1358_ + class441_1343_.aFloatArray4916[13]);
				float f_1361_ = (class441_1343_.aFloatArray4916[2] * (float) i_1356_ + class441_1343_.aFloatArray4916[6] * (float) i_1357_ + class441_1343_.aFloatArray4916[10] * (float) i_1358_ + class441_1343_.aFloatArray4916[14]);
				float f_1362_ = (class441_1343_.aFloatArray4916[3] * (float) i_1356_ + class441_1343_.aFloatArray4916[7] * (float) i_1357_ + class441_1343_.aFloatArray4916[11] * (float) i_1358_ + class441_1343_.aFloatArray4916[15]);
				if (f_1361_ >= -f_1362_) {
					class180.anInt1999 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1359_ / f_1362_));
					class180.anInt2002 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1360_ / f_1362_));
				} else
					bool = true;
				i_1356_ = i_1354_;
				i_1357_ = anInt9196;
				i_1358_ = i_1355_;
				float f_1363_ = (class441_1343_.aFloatArray4916[0] * (float) i_1356_ + class441_1343_.aFloatArray4916[4] * (float) i_1357_ + class441_1343_.aFloatArray4916[8] * (float) i_1358_ + class441_1343_.aFloatArray4916[12]);
				float f_1364_ = (class441_1343_.aFloatArray4916[1] * (float) i_1356_ + class441_1343_.aFloatArray4916[5] * (float) i_1357_ + class441_1343_.aFloatArray4916[9] * (float) i_1358_ + class441_1343_.aFloatArray4916[13]);
				float f_1365_ = (class441_1343_.aFloatArray4916[2] * (float) i_1356_ + class441_1343_.aFloatArray4916[6] * (float) i_1357_ + class441_1343_.aFloatArray4916[10] * (float) i_1358_ + class441_1343_.aFloatArray4916[14]);
				float f_1366_ = (class441_1343_.aFloatArray4916[3] * (float) i_1356_ + class441_1343_.aFloatArray4916[7] * (float) i_1357_ + class441_1343_.aFloatArray4916[11] * (float) i_1358_ + class441_1343_.aFloatArray4916[15]);
				if (f_1365_ >= -f_1366_) {
					class180.anInt1998 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1363_ / f_1366_));
					class180.anInt2003 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1364_ / f_1366_));
				} else
					bool = true;
				if (bool) {
					if (f_1361_ < -f_1362_ && f_1365_ < -f_1366_)
						bool_1353_ = false;
					else if (f_1361_ < -f_1362_) {
						float f_1367_ = (f_1361_ + f_1362_) / (f_1365_ + f_1366_) - 1.0F;
						float f_1368_ = f_1359_ + f_1367_ * (f_1363_ - f_1359_);
						float f_1369_ = f_1360_ + f_1367_ * (f_1364_ - f_1360_);
						float f_1370_ = f_1362_ + f_1367_ * (f_1366_ - f_1362_);
						class180.anInt1999 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1368_ / f_1370_));
						class180.anInt2002 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1369_ / f_1370_));
					} else if (f_1365_ < -f_1366_) {
						float f_1371_ = (f_1365_ + f_1366_) / (f_1361_ + f_1362_) - 1.0F;
						float f_1372_ = f_1363_ + f_1371_ * (f_1359_ - f_1363_);
						float f_1373_ = f_1364_ + f_1371_ * (f_1360_ - f_1364_);
						float f_1374_ = f_1366_ + f_1371_ * (f_1362_ - f_1366_);
						class180.anInt1998 = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1372_ / f_1374_));
						class180.anInt2003 = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1373_ / f_1374_));
					}
				}
				if (bool_1353_) {
					if (f_1361_ / f_1362_ > f_1365_ / f_1366_) {
						float f_1375_ = (f_1359_ + (class441.aFloatArray4916[0] * (float) anInt9193) + class441.aFloatArray4916[12]);
						float f_1376_ = (f_1362_ + (class441.aFloatArray4916[3] * (float) anInt9193) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub2_9153.aFloat9603 - (float) class180.anInt1999 + (aClass178_Sub2_9153.aFloat9578 * f_1375_ / f_1376_));
					} else {
						float f_1377_ = (f_1363_ + (class441.aFloatArray4916[0] * (float) anInt9193) + class441.aFloatArray4916[12]);
						float f_1378_ = (f_1366_ + (class441.aFloatArray4916[3] * (float) anInt9193) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub2_9153.aFloat9603 - (float) class180.anInt1998 + (aClass178_Sub2_9153.aFloat9578 * f_1377_ / f_1378_));
					}
					class180.aBool2000 = true;
				}
			}
			aClass178_Sub2_9153.method15044(i);
			method14558(class435);
			aClass178_Sub2_9153.method15044(0);
			class441_1342_.method7090(class435);
			class441_1342_.method7089(aClass178_Sub2_9153.aClass441_9629);
			method14559(class441_1342_);
		}
	}

	public boolean method2802(int i, int i_1379_, Class435 class435, boolean bool, int i_1380_) {
		return method14555(i, i_1379_, 0, 0, class435, bool, i_1380_);
	}

	public int method2741() {
		if (!aBool9215)
			method14569();
		return anInt9197;
	}

	public void method2852(Class435 class435) {
		Class441 class441 = aClass178_Sub2_9153.aClass441_9560;
		class441.method7090(class435);
		if (aClass184Array9208 != null) {
			for (int i = 0; i < aClass184Array9208.length; i++) {
				Class184 class184 = aClass184Array9208[i];
				Class184 class184_1381_ = class184;
				if (class184.aClass184_2111 != null)
					class184_1381_ = class184.aClass184_2111;
				class184_1381_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9158[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9159[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_1381_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_1381_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_1381_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_1381_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_1381_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_1381_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_1381_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_1381_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9209 != null) {
			for (int i = 0; i < aClass143Array9209.length; i++) {
				Class143 class143 = aClass143Array9209[i];
				Class143 class143_1382_ = class143;
				if (class143.aClass143_1687 != null)
					class143_1382_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_1382_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_1382_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9158[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9159[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_1382_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	short method14573(Class179 class179, int i, int i_1383_, long l, int i_1384_, int i_1385_, int i_1386_, int i_1387_, float f, float f_1388_) {
		int i_1389_ = anIntArray9199[i];
		int i_1390_ = anIntArray9199[i + 1];
		int i_1391_ = 0;
		for (int i_1392_ = i_1389_; i_1392_ < i_1390_; i_1392_++) {
			if (aShortArray9207[i_1392_] == 0) {
				i_1391_ = i_1392_;
				break;
			}
			int i_1393_ = (aShortArray9207[i_1392_] & 0xffff) - 1;
			if (aLongArray9214[i_1392_] == l)
				return (short) i_1393_;
		}
		aShortArray9207[i_1391_] = (short) (anInt9163 + 1);
		aLongArray9214[i_1391_] = l;
		aShortArray9178[anInt9163] = (short) i_1383_;
		aShortArray9166[anInt9163] = (short) i;
		aShortArray9164[anInt9163] = (short) i_1384_;
		aShortArray9167[anInt9163] = (short) i_1385_;
		aShortArray9168[anInt9163] = (short) i_1386_;
		aByteArray9169[anInt9163] = (byte) i_1387_;
		aFloatArray9194[anInt9163] = f;
		aFloatArray9171[anInt9163] = f_1388_;
		return (short) anInt9163++;
	}

	public void method2687() {
		if (!aBool9201) {
			if (!aBool9215)
				method14569();
			anInt9202 = anInt9195;
			aBool9201 = true;
		}
	}

	void method14574() {
		if ((anInt9185 & 0x37) != 0) {
			if (aClass357_9224 != null)
				aClass357_9224.aBool3725 = false;
		} else if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method2694() {
		/* empty */
	}

	void method2704() {
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] = anIntArray9158[i] + 7 >> 4;
			anIntArray9159[i] = anIntArray9159[i] + 7 >> 4;
			anIntArray9160[i] = anIntArray9160[i] + 7 >> 4;
		}
		method14577();
		aBool9215 = false;
	}

	void method2695(int i, int[] is, int i_1394_, int i_1395_, int i_1396_, int i_1397_, boolean bool) {
		int i_1398_ = is.length;
		if (i == 0) {
			i_1394_ <<= 4;
			i_1395_ <<= 4;
			i_1396_ <<= 4;
			int i_1399_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_1400_ = 0; i_1400_ < i_1398_; i_1400_++) {
				int i_1401_ = is[i_1400_];
				if (i_1401_ < anIntArrayArray9190.length) {
					int[] is_1402_ = anIntArrayArray9190[i_1401_];
					for (int i_1403_ = 0; i_1403_ < is_1402_.length; i_1403_++) {
						int i_1404_ = is_1402_[i_1403_];
						anInt9221 += anIntArray9158[i_1404_];
						anInt9222 += anIntArray9159[i_1404_];
						anInt9151 += anIntArray9160[i_1404_];
						i_1399_++;
					}
				}
			}
			if (i_1399_ > 0) {
				anInt9221 = anInt9221 / i_1399_ + i_1394_;
				anInt9222 = anInt9222 / i_1399_ + i_1395_;
				anInt9151 = anInt9151 / i_1399_ + i_1396_;
			} else {
				anInt9221 = i_1394_;
				anInt9222 = i_1395_;
				anInt9151 = i_1396_;
			}
		} else if (i == 1) {
			i_1394_ <<= 4;
			i_1395_ <<= 4;
			i_1396_ <<= 4;
			for (int i_1405_ = 0; i_1405_ < i_1398_; i_1405_++) {
				int i_1406_ = is[i_1405_];
				if (i_1406_ < anIntArrayArray9190.length) {
					int[] is_1407_ = anIntArrayArray9190[i_1406_];
					for (int i_1408_ = 0; i_1408_ < is_1407_.length; i_1408_++) {
						int i_1409_ = is_1407_[i_1408_];
						anIntArray9158[i_1409_] += i_1394_;
						anIntArray9159[i_1409_] += i_1395_;
						anIntArray9160[i_1409_] += i_1396_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1410_ = 0; i_1410_ < i_1398_; i_1410_++) {
				int i_1411_ = is[i_1410_];
				if (i_1411_ < anIntArrayArray9190.length) {
					int[] is_1412_ = anIntArrayArray9190[i_1411_];
					if ((i_1397_ & 0x1) == 0) {
						for (int i_1413_ = 0; i_1413_ < is_1412_.length; i_1413_++) {
							int i_1414_ = is_1412_[i_1413_];
							anIntArray9158[i_1414_] -= anInt9221;
							anIntArray9159[i_1414_] -= anInt9222;
							anIntArray9160[i_1414_] -= anInt9151;
							if (i_1396_ != 0) {
								int i_1415_ = Class433.anIntArray4880[i_1396_];
								int i_1416_ = Class433.anIntArray4881[i_1396_];
								int i_1417_ = ((anIntArray9159[i_1414_] * i_1415_ + anIntArray9158[i_1414_] * i_1416_ + 16383) >> 14);
								anIntArray9159[i_1414_] = (anIntArray9159[i_1414_] * i_1416_ - anIntArray9158[i_1414_] * i_1415_ + 16383) >> 14;
								anIntArray9158[i_1414_] = i_1417_;
							}
							if (i_1394_ != 0) {
								int i_1418_ = Class433.anIntArray4880[i_1394_];
								int i_1419_ = Class433.anIntArray4881[i_1394_];
								int i_1420_ = ((anIntArray9159[i_1414_] * i_1419_ - anIntArray9160[i_1414_] * i_1418_ + 16383) >> 14);
								anIntArray9160[i_1414_] = (anIntArray9159[i_1414_] * i_1418_ + anIntArray9160[i_1414_] * i_1419_ + 16383) >> 14;
								anIntArray9159[i_1414_] = i_1420_;
							}
							if (i_1395_ != 0) {
								int i_1421_ = Class433.anIntArray4880[i_1395_];
								int i_1422_ = Class433.anIntArray4881[i_1395_];
								int i_1423_ = ((anIntArray9160[i_1414_] * i_1421_ + anIntArray9158[i_1414_] * i_1422_ + 16383) >> 14);
								anIntArray9160[i_1414_] = (anIntArray9160[i_1414_] * i_1422_ - anIntArray9158[i_1414_] * i_1421_ + 16383) >> 14;
								anIntArray9158[i_1414_] = i_1423_;
							}
							anIntArray9158[i_1414_] += anInt9221;
							anIntArray9159[i_1414_] += anInt9222;
							anIntArray9160[i_1414_] += anInt9151;
						}
					} else {
						for (int i_1424_ = 0; i_1424_ < is_1412_.length; i_1424_++) {
							int i_1425_ = is_1412_[i_1424_];
							anIntArray9158[i_1425_] -= anInt9221;
							anIntArray9159[i_1425_] -= anInt9222;
							anIntArray9160[i_1425_] -= anInt9151;
							if (i_1394_ != 0) {
								int i_1426_ = Class433.anIntArray4880[i_1394_];
								int i_1427_ = Class433.anIntArray4881[i_1394_];
								int i_1428_ = ((anIntArray9159[i_1425_] * i_1427_ - anIntArray9160[i_1425_] * i_1426_ + 16383) >> 14);
								anIntArray9160[i_1425_] = (anIntArray9159[i_1425_] * i_1426_ + anIntArray9160[i_1425_] * i_1427_ + 16383) >> 14;
								anIntArray9159[i_1425_] = i_1428_;
							}
							if (i_1396_ != 0) {
								int i_1429_ = Class433.anIntArray4880[i_1396_];
								int i_1430_ = Class433.anIntArray4881[i_1396_];
								int i_1431_ = ((anIntArray9159[i_1425_] * i_1429_ + anIntArray9158[i_1425_] * i_1430_ + 16383) >> 14);
								anIntArray9159[i_1425_] = (anIntArray9159[i_1425_] * i_1430_ - anIntArray9158[i_1425_] * i_1429_ + 16383) >> 14;
								anIntArray9158[i_1425_] = i_1431_;
							}
							if (i_1395_ != 0) {
								int i_1432_ = Class433.anIntArray4880[i_1395_];
								int i_1433_ = Class433.anIntArray4881[i_1395_];
								int i_1434_ = ((anIntArray9160[i_1425_] * i_1432_ + anIntArray9158[i_1425_] * i_1433_ + 16383) >> 14);
								anIntArray9160[i_1425_] = (anIntArray9160[i_1425_] * i_1433_ - anIntArray9158[i_1425_] * i_1432_ + 16383) >> 14;
								anIntArray9158[i_1425_] = i_1434_;
							}
							anIntArray9158[i_1425_] += anInt9221;
							anIntArray9159[i_1425_] += anInt9222;
							anIntArray9160[i_1425_] += anInt9151;
						}
					}
				}
			}
			if (bool) {
				for (int i_1435_ = 0; i_1435_ < i_1398_; i_1435_++) {
					int i_1436_ = is[i_1435_];
					if (i_1436_ < anIntArrayArray9190.length) {
						int[] is_1437_ = anIntArrayArray9190[i_1436_];
						for (int i_1438_ = 0; i_1438_ < is_1437_.length; i_1438_++) {
							int i_1439_ = is_1437_[i_1438_];
							int i_1440_ = anIntArray9199[i_1439_];
							int i_1441_ = anIntArray9199[i_1439_ + 1];
							for (int i_1442_ = i_1440_; (i_1442_ < i_1441_ && aShortArray9207[i_1442_] != 0); i_1442_++) {
								int i_1443_ = (aShortArray9207[i_1442_] & 0xffff) - 1;
								if (i_1396_ != 0) {
									int i_1444_ = Class433.anIntArray4880[i_1396_];
									int i_1445_ = Class433.anIntArray4881[i_1396_];
									int i_1446_ = (aShortArray9167[i_1443_] * i_1444_ + aShortArray9164[i_1443_] * i_1445_ + 16383) >> 14;
									aShortArray9167[i_1443_] = (short) (((aShortArray9167[i_1443_] * i_1445_) - (aShortArray9164[i_1443_] * i_1444_) + 16383) >> 14);
									aShortArray9164[i_1443_] = (short) i_1446_;
								}
								if (i_1394_ != 0) {
									int i_1447_ = Class433.anIntArray4880[i_1394_];
									int i_1448_ = Class433.anIntArray4881[i_1394_];
									int i_1449_ = (aShortArray9167[i_1443_] * i_1448_ - aShortArray9168[i_1443_] * i_1447_ + 16383) >> 14;
									aShortArray9168[i_1443_] = (short) (((aShortArray9167[i_1443_] * i_1447_) + (aShortArray9168[i_1443_] * i_1448_) + 16383) >> 14);
									aShortArray9167[i_1443_] = (short) i_1449_;
								}
								if (i_1395_ != 0) {
									int i_1450_ = Class433.anIntArray4880[i_1395_];
									int i_1451_ = Class433.anIntArray4881[i_1395_];
									int i_1452_ = (aShortArray9168[i_1443_] * i_1450_ + aShortArray9164[i_1443_] * i_1451_ + 16383) >> 14;
									aShortArray9168[i_1443_] = (short) (((aShortArray9168[i_1443_] * i_1451_) - (aShortArray9164[i_1443_] * i_1450_) + 16383) >> 14);
									aShortArray9164[i_1443_] = (short) i_1452_;
								}
							}
						}
					}
				}
				method14548();
			}
		} else if (i == 3) {
			for (int i_1453_ = 0; i_1453_ < i_1398_; i_1453_++) {
				int i_1454_ = is[i_1453_];
				if (i_1454_ < anIntArrayArray9190.length) {
					int[] is_1455_ = anIntArrayArray9190[i_1454_];
					for (int i_1456_ = 0; i_1456_ < is_1455_.length; i_1456_++) {
						int i_1457_ = is_1455_[i_1456_];
						anIntArray9158[i_1457_] -= anInt9221;
						anIntArray9159[i_1457_] -= anInt9222;
						anIntArray9160[i_1457_] -= anInt9151;
						anIntArray9158[i_1457_] = anIntArray9158[i_1457_] * i_1394_ >> 7;
						anIntArray9159[i_1457_] = anIntArray9159[i_1457_] * i_1395_ >> 7;
						anIntArray9160[i_1457_] = anIntArray9160[i_1457_] * i_1396_ >> 7;
						anIntArray9158[i_1457_] += anInt9221;
						anIntArray9159[i_1457_] += anInt9222;
						anIntArray9160[i_1457_] += anInt9151;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1458_ = false;
				for (int i_1459_ = 0; i_1459_ < i_1398_; i_1459_++) {
					int i_1460_ = is[i_1459_];
					if (i_1460_ < anIntArrayArray9181.length) {
						int[] is_1461_ = anIntArrayArray9181[i_1460_];
						for (int i_1462_ = 0; i_1462_ < is_1461_.length; i_1462_++) {
							int i_1463_ = is_1461_[i_1462_];
							int i_1464_ = ((aByteArray9176[i_1463_] & 0xff) + i_1394_ * 8);
							if (i_1464_ < 0)
								i_1464_ = 0;
							else if (i_1464_ > 255)
								i_1464_ = 255;
							aByteArray9176[i_1463_] = (byte) i_1464_;
						}
						bool_1458_ = bool_1458_ | is_1461_.length > 0;
					}
				}
				if (bool_1458_) {
					if (aClass371Array9211 != null) {
						for (int i_1465_ = 0; i_1465_ < anInt9210; i_1465_++) {
							Class371 class371 = aClass371Array9211[i_1465_];
							Class337 class337 = aClass337Array9212[i_1465_];
							class337.anInt3565 = (class337.anInt3565 & 0xffffff | 255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24);
						}
					}
					method14547();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1466_ = false;
				for (int i_1467_ = 0; i_1467_ < i_1398_; i_1467_++) {
					int i_1468_ = is[i_1467_];
					if (i_1468_ < anIntArrayArray9181.length) {
						int[] is_1469_ = anIntArrayArray9181[i_1468_];
						for (int i_1470_ = 0; i_1470_ < is_1469_.length; i_1470_++) {
							int i_1471_ = is_1469_[i_1470_];
							int i_1472_ = aShortArray9175[i_1471_] & 0xffff;
							int i_1473_ = i_1472_ >> 10 & 0x3f;
							int i_1474_ = i_1472_ >> 7 & 0x7;
							int i_1475_ = i_1472_ & 0x7f;
							i_1473_ = i_1473_ + i_1394_ & 0x3f;
							i_1474_ += i_1395_ / 4;
							if (i_1474_ < 0)
								i_1474_ = 0;
							else if (i_1474_ > 7)
								i_1474_ = 7;
							i_1475_ += i_1396_;
							if (i_1475_ < 0)
								i_1475_ = 0;
							else if (i_1475_ > 127)
								i_1475_ = 127;
							aShortArray9175[i_1471_] = (short) (i_1473_ << 10 | i_1474_ << 7 | i_1475_);
						}
						bool_1466_ = bool_1466_ | is_1469_.length > 0;
					}
				}
				if (bool_1466_) {
					if (aClass371Array9211 != null) {
						for (int i_1476_ = 0; i_1476_ < anInt9210; i_1476_++) {
							Class371 class371 = aClass371Array9211[i_1476_];
							Class337 class337 = aClass337Array9212[i_1476_];
							class337.anInt3565 = (class337.anInt3565 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9175[class371.anInt3891] & 0xffff)]) & 0xffffff);
						}
					}
					method14547();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9213 != null) {
				for (int i_1477_ = 0; i_1477_ < i_1398_; i_1477_++) {
					int i_1478_ = is[i_1477_];
					if (i_1478_ < anIntArrayArray9213.length) {
						int[] is_1479_ = anIntArrayArray9213[i_1478_];
						for (int i_1480_ = 0; i_1480_ < is_1479_.length; i_1480_++) {
							Class337 class337 = aClass337Array9212[is_1479_[i_1480_]];
							class337.anInt3568 += i_1394_;
							class337.anInt3569 += i_1395_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9213 != null) {
				for (int i_1481_ = 0; i_1481_ < i_1398_; i_1481_++) {
					int i_1482_ = is[i_1481_];
					if (i_1482_ < anIntArrayArray9213.length) {
						int[] is_1483_ = anIntArrayArray9213[i_1482_];
						for (int i_1484_ = 0; i_1484_ < is_1483_.length; i_1484_++) {
							Class337 class337 = aClass337Array9212[is_1483_[i_1484_]];
							class337.anInt3566 = class337.anInt3566 * i_1394_ >> 7;
							class337.anInt3567 = class337.anInt3567 * i_1395_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9213 != null) {
				for (int i_1485_ = 0; i_1485_ < i_1398_; i_1485_++) {
					int i_1486_ = is[i_1485_];
					if (i_1486_ < anIntArrayArray9213.length) {
						int[] is_1487_ = anIntArrayArray9213[i_1486_];
						for (int i_1488_ = 0; i_1488_ < is_1487_.length; i_1488_++) {
							Class337 class337 = aClass337Array9212[is_1487_[i_1488_]];
							class337.anInt3570 = class337.anInt3570 + i_1394_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public Class143[] method2728() {
		return aClass143Array9209;
	}

	public int method2752() {
		if (!aBool9215)
			method14569();
		return anInt9193;
	}

	public int method2796() {
		if (!aBool9215)
			method14569();
		return anInt9192;
	}

	boolean method2702() {
		if (anIntArrayArray9190 == null)
			return false;
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] <<= 4;
			anIntArray9159[i] <<= 4;
			anIntArray9160[i] <<= 4;
		}
		anInt9221 = 0;
		anInt9222 = 0;
		anInt9151 = 0;
		return true;
	}

	public int method2803() {
		if (!aBool9215)
			method14569();
		return anInt9196;
	}

	public void method2833(int i, int i_1489_, int i_1490_) {
		for (int i_1491_ = 0; i_1491_ < anInt9157; i_1491_++) {
			if (i != 0)
				anIntArray9158[i_1491_] += i;
			if (i_1489_ != 0)
				anIntArray9159[i_1491_] += i_1489_;
			if (i_1490_ != 0)
				anIntArray9160[i_1491_] += i_1490_;
		}
		method14577();
		aBool9215 = false;
	}

	public int method2800() {
		if (!aBool9215)
			method14569();
		return anInt9165;
	}

	public int method2801() {
		if (!aBool9215)
			method14569();
		return anInt9165;
	}

	public int method2766() {
		if (!aBool9215)
			method14569();
		return anInt9165;
	}

	boolean method14575() {
		if (aClass336_9183.aBool3564)
			return true;
		if (aClass336_9183.anInterface40_3562 == null)
			aClass336_9183.anInterface40_3562 = aClass178_Sub2_9153.method15029(false);
		Interface40 interface40 = aClass336_9183.anInterface40_3562;
		interface40.method275(anInt9174 * 6);
		Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
		if (unsafe != null) {
			int i = anInt9174 * 6;
			long l = interface40.method274(0, i);
			if (l == 0L)
				return false;
			for (int i_1492_ = 0; i_1492_ < anInt9174; i_1492_++) {
				unsafe.putShort(l, aShortArray9161[i_1492_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9217[i_1492_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9179[i_1492_]);
				l += 2L;
			}
			interface40.method79();
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
		bytebuffer.clear();
		for (int i = 0; i < anInt9174; i++) {
			bytebuffer.putShort(aShortArray9161[i]);
			bytebuffer.putShort(aShortArray9217[i]);
			bytebuffer.putShort(aShortArray9179[i]);
		}
		if (interface40.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540)) {
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		return false;
	}

	public int method2811() {
		if (!aBool9215)
			method14569();
		return anInt9196;
	}

	public int method2736() {
		if (!aBool9215)
			method14569();
		return anInt9196;
	}

	public void method2685(int i) {
		int i_1493_ = Class433.anIntArray4880[i];
		int i_1494_ = Class433.anIntArray4881[i];
		for (int i_1495_ = 0; i_1495_ < anInt9157; i_1495_++) {
			int i_1496_ = ((anIntArray9160[i_1495_] * i_1493_ + anIntArray9158[i_1495_] * i_1494_) >> 14);
			anIntArray9160[i_1495_] = (anIntArray9160[i_1495_] * i_1494_ - anIntArray9158[i_1495_] * i_1493_) >> 14;
			anIntArray9158[i_1495_] = i_1496_;
		}
		method14577();
		aBool9215 = false;
	}

	public int method2807() {
		if (!aBool9215)
			method14569();
		return anInt9154;
	}

	public int method2787() {
		if (!aBool9215)
			method14569();
		return anInt9200;
	}

	public void method2809(int i) {
		aShort9206 = (short) i;
		method14577();
		method14548();
	}

	public void method2810(int i) {
		aShort9206 = (short) i;
		method14577();
		method14548();
	}

	public int method2726() {
		return aShort9149;
	}

	public int method2812() {
		return aShort9149;
	}

	public int method2813() {
		return aShort9206;
	}

	public void method2781(short i, short i_1497_) {
		for (int i_1498_ = 0; i_1498_ < anInt9155; i_1498_++) {
			if (aShortArray9175[i_1498_] == i)
				aShortArray9175[i_1498_] = i_1497_;
		}
		if (aClass371Array9211 != null) {
			for (int i_1499_ = 0; i_1499_ < anInt9210; i_1499_++) {
				Class371 class371 = aClass371Array9211[i_1499_];
				Class337 class337 = aClass337Array9212[i_1499_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public void method2815(short i, short i_1500_) {
		for (int i_1501_ = 0; i_1501_ < anInt9155; i_1501_++) {
			if (aShortArray9175[i_1501_] == i)
				aShortArray9175[i_1501_] = i_1500_;
		}
		if (aClass371Array9211 != null) {
			for (int i_1502_ = 0; i_1502_ < anInt9210; i_1502_++) {
				Class371 class371 = aClass371Array9211[i_1502_];
				Class337 class337 = aClass337Array9212[i_1502_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public void method2867(byte i, byte[] is) {
		if (is == null) {
			for (int i_1503_ = 0; i_1503_ < anInt9155; i_1503_++)
				aByteArray9176[i_1503_] = i;
		} else {
			for (int i_1504_ = 0; i_1504_ < anInt9155; i_1504_++) {
				int i_1505_ = 255 - ((255 - (is[i_1504_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9176[i_1504_] = (byte) i_1505_;
			}
		}
		method14547();
	}

	short method14576(Class179 class179, int i, int i_1506_, long l, int i_1507_, int i_1508_, int i_1509_, int i_1510_, float f, float f_1511_) {
		int i_1512_ = anIntArray9199[i];
		int i_1513_ = anIntArray9199[i + 1];
		int i_1514_ = 0;
		for (int i_1515_ = i_1512_; i_1515_ < i_1513_; i_1515_++) {
			if (aShortArray9207[i_1515_] == 0) {
				i_1514_ = i_1515_;
				break;
			}
			int i_1516_ = (aShortArray9207[i_1515_] & 0xffff) - 1;
			if (aLongArray9214[i_1515_] == l)
				return (short) i_1516_;
		}
		aShortArray9207[i_1514_] = (short) (anInt9163 + 1);
		aLongArray9214[i_1514_] = l;
		aShortArray9178[anInt9163] = (short) i_1506_;
		aShortArray9166[anInt9163] = (short) i;
		aShortArray9164[anInt9163] = (short) i_1507_;
		aShortArray9167[anInt9163] = (short) i_1508_;
		aShortArray9168[anInt9163] = (short) i_1509_;
		aByteArray9169[anInt9163] = (byte) i_1510_;
		aFloatArray9194[anInt9163] = f;
		aFloatArray9171[anInt9163] = f_1511_;
		return (short) anInt9163++;
	}

	public int method2797() {
		if (!aBool9215)
			method14569();
		return anInt9197;
	}

	public void method2794(int i, int i_1517_, int i_1518_, int i_1519_) {
		for (int i_1520_ = 0; i_1520_ < anInt9155; i_1520_++) {
			int i_1521_ = aShortArray9175[i_1520_] & 0xffff;
			int i_1522_ = i_1521_ >> 10 & 0x3f;
			int i_1523_ = i_1521_ >> 7 & 0x7;
			int i_1524_ = i_1521_ & 0x7f;
			if (i != -1)
				i_1522_ += (i - i_1522_) * i_1519_ >> 7;
			if (i_1517_ != -1)
				i_1523_ += (i_1517_ - i_1523_) * i_1519_ >> 7;
			if (i_1518_ != -1)
				i_1524_ += (i_1518_ - i_1524_) * i_1519_ >> 7;
			aShortArray9175[i_1520_] = (short) (i_1522_ << 10 | i_1523_ << 7 | i_1524_);
		}
		if (aClass371Array9211 != null) {
			for (int i_1525_ = 0; i_1525_ < anInt9210; i_1525_++) {
				Class371 class371 = aClass371Array9211[i_1525_];
				Class337 class337 = aClass337Array9212[i_1525_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public void method2843(int i, int i_1526_, int i_1527_, int i_1528_) {
		for (int i_1529_ = 0; i_1529_ < anInt9155; i_1529_++) {
			int i_1530_ = aShortArray9175[i_1529_] & 0xffff;
			int i_1531_ = i_1530_ >> 10 & 0x3f;
			int i_1532_ = i_1530_ >> 7 & 0x7;
			int i_1533_ = i_1530_ & 0x7f;
			if (i != -1)
				i_1531_ += (i - i_1531_) * i_1528_ >> 7;
			if (i_1526_ != -1)
				i_1532_ += (i_1526_ - i_1532_) * i_1528_ >> 7;
			if (i_1527_ != -1)
				i_1533_ += (i_1527_ - i_1533_) * i_1528_ >> 7;
			aShortArray9175[i_1529_] = (short) (i_1531_ << 10 | i_1532_ << 7 | i_1533_);
		}
		if (aClass371Array9211 != null) {
			for (int i_1534_ = 0; i_1534_ < anInt9210; i_1534_++) {
				Class371 class371 = aClass371Array9211[i_1534_];
				Class337 class337 = aClass337Array9212[i_1534_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public void method2821(int i, int i_1535_, int i_1536_, int i_1537_) {
		for (int i_1538_ = 0; i_1538_ < anInt9155; i_1538_++) {
			int i_1539_ = aShortArray9175[i_1538_] & 0xffff;
			int i_1540_ = i_1539_ >> 10 & 0x3f;
			int i_1541_ = i_1539_ >> 7 & 0x7;
			int i_1542_ = i_1539_ & 0x7f;
			if (i != -1)
				i_1540_ += (i - i_1540_) * i_1537_ >> 7;
			if (i_1535_ != -1)
				i_1541_ += (i_1535_ - i_1541_) * i_1537_ >> 7;
			if (i_1536_ != -1)
				i_1542_ += (i_1536_ - i_1542_) * i_1537_ >> 7;
			aShortArray9175[i_1538_] = (short) (i_1540_ << 10 | i_1541_ << 7 | i_1542_);
		}
		if (aClass371Array9211 != null) {
			for (int i_1543_ = 0; i_1543_ < anInt9210; i_1543_++) {
				Class371 class371 = aClass371Array9211[i_1543_];
				Class337 class337 = aClass337Array9212[i_1543_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public void method2822(int i, int i_1544_, int i_1545_, int i_1546_) {
		for (int i_1547_ = 0; i_1547_ < anInt9155; i_1547_++) {
			int i_1548_ = aShortArray9175[i_1547_] & 0xffff;
			int i_1549_ = i_1548_ >> 10 & 0x3f;
			int i_1550_ = i_1548_ >> 7 & 0x7;
			int i_1551_ = i_1548_ & 0x7f;
			if (i != -1)
				i_1549_ += (i - i_1549_) * i_1546_ >> 7;
			if (i_1544_ != -1)
				i_1550_ += (i_1544_ - i_1550_) * i_1546_ >> 7;
			if (i_1545_ != -1)
				i_1551_ += (i_1545_ - i_1551_) * i_1546_ >> 7;
			aShortArray9175[i_1547_] = (short) (i_1549_ << 10 | i_1550_ << 7 | i_1551_);
		}
		if (aClass371Array9211 != null) {
			for (int i_1552_ = 0; i_1552_ < anInt9210; i_1552_++) {
				Class371 class371 = aClass371Array9211[i_1552_];
				Class337 class337 = aClass337Array9212[i_1552_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	public Class523_Sub27_Sub4 method2788(Class523_Sub27_Sub4 class523_sub27_sub4) {
		if (anInt9163 == 0)
			return null;
		if (!aBool9215)
			method14569();
		int i;
		int i_1553_;
		if (aClass178_Sub2_9153.anInt9624 > 0) {
			i = (anInt9197 - (anInt9196 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623);
			i_1553_ = anInt9165 - (anInt9195 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623;
		} else {
			i = (anInt9197 - (anInt9195 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623);
			i_1553_ = anInt9165 - (anInt9196 * aClass178_Sub2_9153.anInt9624 >> 8) >> aClass178_Sub2_9153.anInt9623;
		}
		int i_1554_;
		int i_1555_;
		if (aClass178_Sub2_9153.anInt9625 > 0) {
			i_1554_ = anInt9154 - (anInt9196 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
			i_1555_ = anInt9200 - (anInt9195 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
		} else {
			i_1554_ = anInt9154 - (anInt9195 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
			i_1555_ = anInt9200 - (anInt9196 * aClass178_Sub2_9153.anInt9625 >> 8) >> aClass178_Sub2_9153.anInt9623;
		}
		int i_1556_ = i_1553_ - i + 1;
		int i_1557_ = i_1555_ - i_1554_ + 1;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2_1558_;
		if (class523_sub27_sub4_sub2 != null && class523_sub27_sub4_sub2.method18551(i_1556_, i_1557_)) {
			class523_sub27_sub4_sub2_1558_ = class523_sub27_sub4_sub2;
			class523_sub27_sub4_sub2_1558_.method18545();
		} else
			class523_sub27_sub4_sub2_1558_ = new Class523_Sub27_Sub4_Sub2(aClass178_Sub2_9153, i_1556_, i_1557_);
		class523_sub27_sub4_sub2_1558_.method18544(i, i_1554_, i_1553_, i_1555_);
		method14557(class523_sub27_sub4_sub2_1558_);
		return class523_sub27_sub4_sub2_1558_;
	}

	public int method2773() {
		if (!aBool9215)
			method14569();
		return anInt9193;
	}

	public Class143[] method2825() {
		return aClass143Array9209;
	}

	Class167_Sub2(Class178_Sub2 class178_sub2, int i, int i_1559_, boolean bool, boolean bool_1560_) {
		anInt9155 = 0;
		anInt9174 = 0;
		aBool9188 = false;
		aBool9182 = true;
		aBool9184 = false;
		aBool9191 = false;
		aBool9215 = false;
		aBool9201 = false;
		aFloatArray9223 = new float[2];
		anIntArray9219 = new int[1];
		anIntArray9177 = new int[1];
		anIntArray9218 = new int[8];
		anIntArray9180 = new int[8];
		anIntArray9220 = new int[8];
		aClass178_Sub2_9153 = class178_sub2;
		anInt9152 = i;
		anInt9185 = i_1559_;
		aBool9188 = bool_1560_;
		if (bool || Class347.method6006(anInt9152, anInt9185))
			aClass357_9186 = new Class357(Class347.method6011(anInt9152, anInt9185));
		if (bool || Class347.method6009(anInt9152, anInt9185))
			aClass357_9187 = new Class357(Class347.method6014(anInt9152, anInt9185));
		if (bool || Class347.method6008(anInt9152, anInt9185))
			aClass357_9150 = new Class357(Class347.method6092(anInt9152, anInt9185));
		if (bool || Class347.method6007(anInt9152, anInt9185))
			aClass357_9224 = new Class357(Class347.method6012(anInt9152, anInt9185));
		if (bool || Class347.method6010(anInt9152, anInt9185))
			aClass336_9183 = new Class336(Class347.method6015(anInt9152, anInt9185));
		if (bool && bool_1560_) {
			aClass357_9186.anInterface36_3727 = aClass357_9186.anInterface36_3726 = aClass178_Sub2_9153.method15030(aBool9188);
			aClass357_9187.anInterface36_3727 = aClass357_9187.anInterface36_3726 = aClass178_Sub2_9153.method15030(aBool9188);
			aClass357_9150.anInterface36_3727 = aClass357_9150.anInterface36_3726 = aClass178_Sub2_9153.method15030(aBool9188);
			aClass357_9224.anInterface36_3727 = aClass357_9224.anInterface36_3726 = aClass178_Sub2_9153.method15030(aBool9188);
		}
	}

	void method14577() {
		if (aClass357_9186 != null)
			aClass357_9186.aBool3725 = false;
	}

	public boolean method2828() {
		if (aShortArray9189 == null)
			return true;
		for (int i = 0; i < aShortArray9189.length; i++) {
			if (aShortArray9189[i] != -1 && !(aClass178_Sub2_9153.aClass349_9586.method6097(aClass178_Sub2_9153.aClass172_1916.method2895(aShortArray9189[i], 600954143), -1)))
				return false;
		}
		return true;
	}

	public boolean method2829() {
		return aBool9184;
	}

	public boolean method2830() {
		return aBool9184;
	}

	void method2705(int i, int i_1561_, int i_1562_, int i_1563_) {
		if (i == 0) {
			int i_1564_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_1565_ = 0; i_1565_ < anInt9157; i_1565_++) {
				anInt9221 += anIntArray9158[i_1565_];
				anInt9222 += anIntArray9159[i_1565_];
				anInt9151 += anIntArray9160[i_1565_];
				i_1564_++;
			}
			if (i_1564_ > 0) {
				anInt9221 = anInt9221 / i_1564_ + i_1561_;
				anInt9222 = anInt9222 / i_1564_ + i_1562_;
				anInt9151 = anInt9151 / i_1564_ + i_1563_;
			} else {
				anInt9221 = i_1561_;
				anInt9222 = i_1562_;
				anInt9151 = i_1563_;
			}
		} else if (i == 1) {
			for (int i_1566_ = 0; i_1566_ < anInt9157; i_1566_++) {
				anIntArray9158[i_1566_] += i_1561_;
				anIntArray9159[i_1566_] += i_1562_;
				anIntArray9160[i_1566_] += i_1563_;
			}
		} else if (i == 2) {
			for (int i_1567_ = 0; i_1567_ < anInt9157; i_1567_++) {
				anIntArray9158[i_1567_] -= anInt9221;
				anIntArray9159[i_1567_] -= anInt9222;
				anIntArray9160[i_1567_] -= anInt9151;
				if (i_1563_ != 0) {
					int i_1568_ = Class433.anIntArray4880[i_1563_];
					int i_1569_ = Class433.anIntArray4881[i_1563_];
					int i_1570_ = ((anIntArray9159[i_1567_] * i_1568_ + anIntArray9158[i_1567_] * i_1569_ + 16383) >> 14);
					anIntArray9159[i_1567_] = (anIntArray9159[i_1567_] * i_1569_ - anIntArray9158[i_1567_] * i_1568_ + 16383) >> 14;
					anIntArray9158[i_1567_] = i_1570_;
				}
				if (i_1561_ != 0) {
					int i_1571_ = Class433.anIntArray4880[i_1561_];
					int i_1572_ = Class433.anIntArray4881[i_1561_];
					int i_1573_ = ((anIntArray9159[i_1567_] * i_1572_ - anIntArray9160[i_1567_] * i_1571_ + 16383) >> 14);
					anIntArray9160[i_1567_] = (anIntArray9159[i_1567_] * i_1571_ + anIntArray9160[i_1567_] * i_1572_ + 16383) >> 14;
					anIntArray9159[i_1567_] = i_1573_;
				}
				if (i_1562_ != 0) {
					int i_1574_ = Class433.anIntArray4880[i_1562_];
					int i_1575_ = Class433.anIntArray4881[i_1562_];
					int i_1576_ = ((anIntArray9160[i_1567_] * i_1574_ + anIntArray9158[i_1567_] * i_1575_ + 16383) >> 14);
					anIntArray9160[i_1567_] = (anIntArray9160[i_1567_] * i_1575_ - anIntArray9158[i_1567_] * i_1574_ + 16383) >> 14;
					anIntArray9158[i_1567_] = i_1576_;
				}
				anIntArray9158[i_1567_] += anInt9221;
				anIntArray9159[i_1567_] += anInt9222;
				anIntArray9160[i_1567_] += anInt9151;
			}
		} else if (i == 3) {
			for (int i_1577_ = 0; i_1577_ < anInt9157; i_1577_++) {
				anIntArray9158[i_1577_] -= anInt9221;
				anIntArray9159[i_1577_] -= anInt9222;
				anIntArray9160[i_1577_] -= anInt9151;
				anIntArray9158[i_1577_] = anIntArray9158[i_1577_] * i_1561_ / 128;
				anIntArray9159[i_1577_] = anIntArray9159[i_1577_] * i_1562_ / 128;
				anIntArray9160[i_1577_] = anIntArray9160[i_1577_] * i_1563_ / 128;
				anIntArray9158[i_1577_] += anInt9221;
				anIntArray9159[i_1577_] += anInt9222;
				anIntArray9160[i_1577_] += anInt9151;
			}
		} else if (i == 5) {
			for (int i_1578_ = 0; i_1578_ < anInt9155; i_1578_++) {
				int i_1579_ = (aByteArray9176[i_1578_] & 0xff) + i_1561_ * 8;
				if (i_1579_ < 0)
					i_1579_ = 0;
				else if (i_1579_ > 255)
					i_1579_ = 255;
				aByteArray9176[i_1578_] = (byte) i_1579_;
			}
			if (aClass371Array9211 != null) {
				for (int i_1580_ = 0; i_1580_ < anInt9210; i_1580_++) {
					Class371 class371 = aClass371Array9211[i_1580_];
					Class337 class337 = aClass337Array9212[i_1580_];
					class337.anInt3565 = (class337.anInt3565 & 0xffffff | (255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24));
				}
			}
			method14547();
		} else if (i == 7) {
			for (int i_1581_ = 0; i_1581_ < anInt9155; i_1581_++) {
				int i_1582_ = aShortArray9175[i_1581_] & 0xffff;
				int i_1583_ = i_1582_ >> 10 & 0x3f;
				int i_1584_ = i_1582_ >> 7 & 0x7;
				int i_1585_ = i_1582_ & 0x7f;
				i_1583_ = i_1583_ + i_1561_ & 0x3f;
				i_1584_ += i_1562_ / 4;
				if (i_1584_ < 0)
					i_1584_ = 0;
				else if (i_1584_ > 7)
					i_1584_ = 7;
				i_1585_ += i_1563_;
				if (i_1585_ < 0)
					i_1585_ = 0;
				else if (i_1585_ > 127)
					i_1585_ = 127;
				aShortArray9175[i_1581_] = (short) (i_1583_ << 10 | i_1584_ << 7 | i_1585_);
			}
			if (aClass371Array9211 != null) {
				for (int i_1586_ = 0; i_1586_ < anInt9210; i_1586_++) {
					Class371 class371 = aClass371Array9211[i_1586_];
					Class337 class337 = aClass337Array9212[i_1586_];
					class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
				}
			}
			method14547();
		} else if (i == 8) {
			for (int i_1587_ = 0; i_1587_ < anInt9210; i_1587_++) {
				Class337 class337 = aClass337Array9212[i_1587_];
				class337.anInt3568 += i_1561_;
				class337.anInt3569 += i_1562_;
			}
		} else if (i == 10) {
			for (int i_1588_ = 0; i_1588_ < anInt9210; i_1588_++) {
				Class337 class337 = aClass337Array9212[i_1588_];
				class337.anInt3566 = class337.anInt3566 * i_1561_ >> 7;
				class337.anInt3567 = class337.anInt3567 * i_1562_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1589_ = 0; i_1589_ < anInt9210; i_1589_++) {
				Class337 class337 = aClass337Array9212[i_1589_];
				class337.anInt3570 = class337.anInt3570 + i_1561_ & 0x3fff;
			}
		}
	}

	void method2720(int i, int[] is, int i_1590_, int i_1591_, int i_1592_, boolean bool, int i_1593_, int[] is_1594_) {
		int i_1595_ = is.length;
		if (i == 0) {
			i_1590_ <<= 4;
			i_1591_ <<= 4;
			i_1592_ <<= 4;
			int i_1596_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_1597_ = 0; i_1597_ < i_1595_; i_1597_++) {
				int i_1598_ = is[i_1597_];
				if (i_1598_ < anIntArrayArray9190.length) {
					int[] is_1599_ = anIntArrayArray9190[i_1598_];
					for (int i_1600_ = 0; i_1600_ < is_1599_.length; i_1600_++) {
						int i_1601_ = is_1599_[i_1600_];
						if (aShortArray9162 == null || (i_1593_ & aShortArray9162[i_1601_]) != 0) {
							anInt9221 += anIntArray9158[i_1601_];
							anInt9222 += anIntArray9159[i_1601_];
							anInt9151 += anIntArray9160[i_1601_];
							i_1596_++;
						}
					}
				}
			}
			if (i_1596_ > 0) {
				anInt9221 = anInt9221 / i_1596_ + i_1590_;
				anInt9222 = anInt9222 / i_1596_ + i_1591_;
				anInt9151 = anInt9151 / i_1596_ + i_1592_;
				aBool9173 = true;
			} else {
				anInt9221 = i_1590_;
				anInt9222 = i_1591_;
				anInt9151 = i_1592_;
			}
		} else if (i == 1) {
			if (is_1594_ != null) {
				int i_1602_ = ((is_1594_[0] * i_1590_ + is_1594_[1] * i_1591_ + is_1594_[2] * i_1592_ + 8192) >> 14);
				int i_1603_ = ((is_1594_[3] * i_1590_ + is_1594_[4] * i_1591_ + is_1594_[5] * i_1592_ + 8192) >> 14);
				int i_1604_ = ((is_1594_[6] * i_1590_ + is_1594_[7] * i_1591_ + is_1594_[8] * i_1592_ + 8192) >> 14);
				i_1590_ = i_1602_;
				i_1591_ = i_1603_;
				i_1592_ = i_1604_;
			}
			i_1590_ <<= 4;
			i_1591_ <<= 4;
			i_1592_ <<= 4;
			for (int i_1605_ = 0; i_1605_ < i_1595_; i_1605_++) {
				int i_1606_ = is[i_1605_];
				if (i_1606_ < anIntArrayArray9190.length) {
					int[] is_1607_ = anIntArrayArray9190[i_1606_];
					for (int i_1608_ = 0; i_1608_ < is_1607_.length; i_1608_++) {
						int i_1609_ = is_1607_[i_1608_];
						if (aShortArray9162 == null || (i_1593_ & aShortArray9162[i_1609_]) != 0) {
							anIntArray9158[i_1609_] += i_1590_;
							anIntArray9159[i_1609_] += i_1591_;
							anIntArray9160[i_1609_] += i_1592_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1594_ != null) {
				int i_1610_ = is_1594_[9] << 4;
				int i_1611_ = is_1594_[10] << 4;
				int i_1612_ = is_1594_[11] << 4;
				int i_1613_ = is_1594_[12] << 4;
				int i_1614_ = is_1594_[13] << 4;
				int i_1615_ = is_1594_[14] << 4;
				if (aBool9173) {
					int i_1616_ = ((is_1594_[0] * anInt9221 + is_1594_[3] * anInt9222 + is_1594_[6] * anInt9151 + 8192) >> 14);
					int i_1617_ = ((is_1594_[1] * anInt9221 + is_1594_[4] * anInt9222 + is_1594_[7] * anInt9151 + 8192) >> 14);
					int i_1618_ = ((is_1594_[2] * anInt9221 + is_1594_[5] * anInt9222 + is_1594_[8] * anInt9151 + 8192) >> 14);
					i_1616_ += i_1613_;
					i_1617_ += i_1614_;
					i_1618_ += i_1615_;
					anInt9221 = i_1616_;
					anInt9222 = i_1617_;
					anInt9151 = i_1618_;
					aBool9173 = false;
				}
				int[] is_1619_ = new int[9];
				int i_1620_ = Class433.anIntArray4881[i_1590_];
				int i_1621_ = Class433.anIntArray4880[i_1590_];
				int i_1622_ = Class433.anIntArray4881[i_1591_];
				int i_1623_ = Class433.anIntArray4880[i_1591_];
				int i_1624_ = Class433.anIntArray4881[i_1592_];
				int i_1625_ = Class433.anIntArray4880[i_1592_];
				int i_1626_ = i_1621_ * i_1624_ + 8192 >> 14;
				int i_1627_ = i_1621_ * i_1625_ + 8192 >> 14;
				is_1619_[0] = i_1622_ * i_1624_ + i_1623_ * i_1627_ + 8192 >> 14;
				is_1619_[1] = -i_1622_ * i_1625_ + i_1623_ * i_1626_ + 8192 >> 14;
				is_1619_[2] = i_1623_ * i_1620_ + 8192 >> 14;
				is_1619_[3] = i_1620_ * i_1625_ + 8192 >> 14;
				is_1619_[4] = i_1620_ * i_1624_ + 8192 >> 14;
				is_1619_[5] = -i_1621_;
				is_1619_[6] = -i_1623_ * i_1624_ + i_1622_ * i_1627_ + 8192 >> 14;
				is_1619_[7] = i_1623_ * i_1625_ + i_1622_ * i_1626_ + 8192 >> 14;
				is_1619_[8] = i_1622_ * i_1620_ + 8192 >> 14;
				int i_1628_ = ((is_1619_[0] * -anInt9221 + is_1619_[1] * -anInt9222 + is_1619_[2] * -anInt9151 + 8192) >> 14);
				int i_1629_ = ((is_1619_[3] * -anInt9221 + is_1619_[4] * -anInt9222 + is_1619_[5] * -anInt9151 + 8192) >> 14);
				int i_1630_ = ((is_1619_[6] * -anInt9221 + is_1619_[7] * -anInt9222 + is_1619_[8] * -anInt9151 + 8192) >> 14);
				int i_1631_ = i_1628_ + anInt9221;
				int i_1632_ = i_1629_ + anInt9222;
				int i_1633_ = i_1630_ + anInt9151;
				int[] is_1634_ = new int[9];
				for (int i_1635_ = 0; i_1635_ < 3; i_1635_++) {
					for (int i_1636_ = 0; i_1636_ < 3; i_1636_++) {
						int i_1637_ = 0;
						for (int i_1638_ = 0; i_1638_ < 3; i_1638_++)
							i_1637_ += (is_1619_[i_1635_ * 3 + i_1638_] * is_1594_[i_1636_ * 3 + i_1638_]);
						is_1634_[i_1635_ * 3 + i_1636_] = i_1637_ + 8192 >> 14;
					}
				}
				int i_1639_ = ((is_1619_[0] * i_1613_ + is_1619_[1] * i_1614_ + is_1619_[2] * i_1615_ + 8192) >> 14);
				int i_1640_ = ((is_1619_[3] * i_1613_ + is_1619_[4] * i_1614_ + is_1619_[5] * i_1615_ + 8192) >> 14);
				int i_1641_ = ((is_1619_[6] * i_1613_ + is_1619_[7] * i_1614_ + is_1619_[8] * i_1615_ + 8192) >> 14);
				i_1639_ += i_1631_;
				i_1640_ += i_1632_;
				i_1641_ += i_1633_;
				int[] is_1642_ = new int[9];
				for (int i_1643_ = 0; i_1643_ < 3; i_1643_++) {
					for (int i_1644_ = 0; i_1644_ < 3; i_1644_++) {
						int i_1645_ = 0;
						for (int i_1646_ = 0; i_1646_ < 3; i_1646_++)
							i_1645_ += (is_1594_[i_1643_ * 3 + i_1646_] * is_1634_[i_1644_ + i_1646_ * 3]);
						is_1642_[i_1643_ * 3 + i_1644_] = i_1645_ + 8192 >> 14;
					}
				}
				int i_1647_ = ((is_1594_[0] * i_1639_ + is_1594_[1] * i_1640_ + is_1594_[2] * i_1641_ + 8192) >> 14);
				int i_1648_ = ((is_1594_[3] * i_1639_ + is_1594_[4] * i_1640_ + is_1594_[5] * i_1641_ + 8192) >> 14);
				int i_1649_ = ((is_1594_[6] * i_1639_ + is_1594_[7] * i_1640_ + is_1594_[8] * i_1641_ + 8192) >> 14);
				i_1647_ += i_1610_;
				i_1648_ += i_1611_;
				i_1649_ += i_1612_;
				for (int i_1650_ = 0; i_1650_ < i_1595_; i_1650_++) {
					int i_1651_ = is[i_1650_];
					if (i_1651_ < anIntArrayArray9190.length) {
						int[] is_1652_ = anIntArrayArray9190[i_1651_];
						for (int i_1653_ = 0; i_1653_ < is_1652_.length; i_1653_++) {
							int i_1654_ = is_1652_[i_1653_];
							if (aShortArray9162 == null || (i_1593_ & aShortArray9162[i_1654_]) != 0) {
								int i_1655_ = ((is_1642_[0] * anIntArray9158[i_1654_] + is_1642_[1] * anIntArray9159[i_1654_] + is_1642_[2] * anIntArray9160[i_1654_] + 8192) >> 14);
								int i_1656_ = ((is_1642_[3] * anIntArray9158[i_1654_] + is_1642_[4] * anIntArray9159[i_1654_] + is_1642_[5] * anIntArray9160[i_1654_] + 8192) >> 14);
								int i_1657_ = ((is_1642_[6] * anIntArray9158[i_1654_] + is_1642_[7] * anIntArray9159[i_1654_] + is_1642_[8] * anIntArray9160[i_1654_] + 8192) >> 14);
								i_1655_ += i_1647_;
								i_1656_ += i_1648_;
								i_1657_ += i_1649_;
								anIntArray9158[i_1654_] = i_1655_;
								anIntArray9159[i_1654_] = i_1656_;
								anIntArray9160[i_1654_] = i_1657_;
							}
						}
					}
				}
			} else {
				for (int i_1658_ = 0; i_1658_ < i_1595_; i_1658_++) {
					int i_1659_ = is[i_1658_];
					if (i_1659_ < anIntArrayArray9190.length) {
						int[] is_1660_ = anIntArrayArray9190[i_1659_];
						for (int i_1661_ = 0; i_1661_ < is_1660_.length; i_1661_++) {
							int i_1662_ = is_1660_[i_1661_];
							if (aShortArray9162 == null || (i_1593_ & aShortArray9162[i_1662_]) != 0) {
								anIntArray9158[i_1662_] -= anInt9221;
								anIntArray9159[i_1662_] -= anInt9222;
								anIntArray9160[i_1662_] -= anInt9151;
								if (i_1592_ != 0) {
									int i_1663_ = Class433.anIntArray4880[i_1592_];
									int i_1664_ = Class433.anIntArray4881[i_1592_];
									int i_1665_ = ((anIntArray9159[i_1662_] * i_1663_ + anIntArray9158[i_1662_] * i_1664_ + 16383) >> 14);
									anIntArray9159[i_1662_] = (anIntArray9159[i_1662_] * i_1664_ - anIntArray9158[i_1662_] * i_1663_ + 16383) >> 14;
									anIntArray9158[i_1662_] = i_1665_;
								}
								if (i_1590_ != 0) {
									int i_1666_ = Class433.anIntArray4880[i_1590_];
									int i_1667_ = Class433.anIntArray4881[i_1590_];
									int i_1668_ = ((anIntArray9159[i_1662_] * i_1667_ - anIntArray9160[i_1662_] * i_1666_ + 16383) >> 14);
									anIntArray9160[i_1662_] = (anIntArray9159[i_1662_] * i_1666_ + anIntArray9160[i_1662_] * i_1667_ + 16383) >> 14;
									anIntArray9159[i_1662_] = i_1668_;
								}
								if (i_1591_ != 0) {
									int i_1669_ = Class433.anIntArray4880[i_1591_];
									int i_1670_ = Class433.anIntArray4881[i_1591_];
									int i_1671_ = ((anIntArray9160[i_1662_] * i_1669_ + anIntArray9158[i_1662_] * i_1670_ + 16383) >> 14);
									anIntArray9160[i_1662_] = (anIntArray9160[i_1662_] * i_1670_ - anIntArray9158[i_1662_] * i_1669_ + 16383) >> 14;
									anIntArray9158[i_1662_] = i_1671_;
								}
								anIntArray9158[i_1662_] += anInt9221;
								anIntArray9159[i_1662_] += anInt9222;
								anIntArray9160[i_1662_] += anInt9151;
							}
						}
					}
				}
				if (bool) {
					for (int i_1672_ = 0; i_1672_ < i_1595_; i_1672_++) {
						int i_1673_ = is[i_1672_];
						if (i_1673_ < anIntArrayArray9190.length) {
							int[] is_1674_ = anIntArrayArray9190[i_1673_];
							for (int i_1675_ = 0; i_1675_ < is_1674_.length; i_1675_++) {
								int i_1676_ = is_1674_[i_1675_];
								if (aShortArray9162 == null || ((i_1593_ & aShortArray9162[i_1676_]) != 0)) {
									int i_1677_ = anIntArray9199[i_1676_];
									int i_1678_ = anIntArray9199[i_1676_ + 1];
									for (int i_1679_ = i_1677_; (i_1679_ < i_1678_ && aShortArray9207[i_1679_] != 0); i_1679_++) {
										int i_1680_ = (aShortArray9207[i_1679_] & 0xffff) - 1;
										if (i_1592_ != 0) {
											int i_1681_ = (Class433.anIntArray4880[i_1592_]);
											int i_1682_ = (Class433.anIntArray4881[i_1592_]);
											int i_1683_ = (((aShortArray9167[i_1680_] * i_1681_) + (aShortArray9164[i_1680_] * i_1682_) + 16383) >> 14);
											aShortArray9167[i_1680_] = (short) ((((aShortArray9167[i_1680_]) * i_1682_) - ((aShortArray9164[i_1680_]) * i_1681_) + 16383) >> 14);
											aShortArray9164[i_1680_] = (short) i_1683_;
										}
										if (i_1590_ != 0) {
											int i_1684_ = (Class433.anIntArray4880[i_1590_]);
											int i_1685_ = (Class433.anIntArray4881[i_1590_]);
											int i_1686_ = (((aShortArray9167[i_1680_] * i_1685_) - (aShortArray9168[i_1680_] * i_1684_) + 16383) >> 14);
											aShortArray9168[i_1680_] = (short) ((((aShortArray9167[i_1680_]) * i_1684_) + ((aShortArray9168[i_1680_]) * i_1685_) + 16383) >> 14);
											aShortArray9167[i_1680_] = (short) i_1686_;
										}
										if (i_1591_ != 0) {
											int i_1687_ = (Class433.anIntArray4880[i_1591_]);
											int i_1688_ = (Class433.anIntArray4881[i_1591_]);
											int i_1689_ = (((aShortArray9168[i_1680_] * i_1687_) + (aShortArray9164[i_1680_] * i_1688_) + 16383) >> 14);
											aShortArray9168[i_1680_] = (short) ((((aShortArray9168[i_1680_]) * i_1688_) - ((aShortArray9164[i_1680_]) * i_1687_) + 16383) >> 14);
											aShortArray9164[i_1680_] = (short) i_1689_;
										}
									}
								}
							}
						}
					}
					method14548();
				}
			}
		} else if (i == 3) {
			if (is_1594_ != null) {
				int i_1690_ = is_1594_[9] << 4;
				int i_1691_ = is_1594_[10] << 4;
				int i_1692_ = is_1594_[11] << 4;
				int i_1693_ = is_1594_[12] << 4;
				int i_1694_ = is_1594_[13] << 4;
				int i_1695_ = is_1594_[14] << 4;
				if (aBool9173) {
					int i_1696_ = ((is_1594_[0] * anInt9221 + is_1594_[3] * anInt9222 + is_1594_[6] * anInt9151 + 8192) >> 14);
					int i_1697_ = ((is_1594_[1] * anInt9221 + is_1594_[4] * anInt9222 + is_1594_[7] * anInt9151 + 8192) >> 14);
					int i_1698_ = ((is_1594_[2] * anInt9221 + is_1594_[5] * anInt9222 + is_1594_[8] * anInt9151 + 8192) >> 14);
					i_1696_ += i_1693_;
					i_1697_ += i_1694_;
					i_1698_ += i_1695_;
					anInt9221 = i_1696_;
					anInt9222 = i_1697_;
					anInt9151 = i_1698_;
					aBool9173 = false;
				}
				int i_1699_ = i_1590_ << 15 >> 7;
				int i_1700_ = i_1591_ << 15 >> 7;
				int i_1701_ = i_1592_ << 15 >> 7;
				int i_1702_ = i_1699_ * -anInt9221 + 8192 >> 14;
				int i_1703_ = i_1700_ * -anInt9222 + 8192 >> 14;
				int i_1704_ = i_1701_ * -anInt9151 + 8192 >> 14;
				int i_1705_ = i_1702_ + anInt9221;
				int i_1706_ = i_1703_ + anInt9222;
				int i_1707_ = i_1704_ + anInt9151;
				int[] is_1708_ = new int[9];
				is_1708_[0] = i_1699_ * is_1594_[0] + 8192 >> 14;
				is_1708_[1] = i_1699_ * is_1594_[3] + 8192 >> 14;
				is_1708_[2] = i_1699_ * is_1594_[6] + 8192 >> 14;
				is_1708_[3] = i_1700_ * is_1594_[1] + 8192 >> 14;
				is_1708_[4] = i_1700_ * is_1594_[4] + 8192 >> 14;
				is_1708_[5] = i_1700_ * is_1594_[7] + 8192 >> 14;
				is_1708_[6] = i_1701_ * is_1594_[2] + 8192 >> 14;
				is_1708_[7] = i_1701_ * is_1594_[5] + 8192 >> 14;
				is_1708_[8] = i_1701_ * is_1594_[8] + 8192 >> 14;
				int i_1709_ = i_1699_ * i_1693_ + 8192 >> 14;
				int i_1710_ = i_1700_ * i_1694_ + 8192 >> 14;
				int i_1711_ = i_1701_ * i_1695_ + 8192 >> 14;
				i_1709_ += i_1705_;
				i_1710_ += i_1706_;
				i_1711_ += i_1707_;
				int[] is_1712_ = new int[9];
				for (int i_1713_ = 0; i_1713_ < 3; i_1713_++) {
					for (int i_1714_ = 0; i_1714_ < 3; i_1714_++) {
						int i_1715_ = 0;
						for (int i_1716_ = 0; i_1716_ < 3; i_1716_++)
							i_1715_ += (is_1594_[i_1713_ * 3 + i_1716_] * is_1708_[i_1714_ + i_1716_ * 3]);
						is_1712_[i_1713_ * 3 + i_1714_] = i_1715_ + 8192 >> 14;
					}
				}
				int i_1717_ = ((is_1594_[0] * i_1709_ + is_1594_[1] * i_1710_ + is_1594_[2] * i_1711_ + 8192) >> 14);
				int i_1718_ = ((is_1594_[3] * i_1709_ + is_1594_[4] * i_1710_ + is_1594_[5] * i_1711_ + 8192) >> 14);
				int i_1719_ = ((is_1594_[6] * i_1709_ + is_1594_[7] * i_1710_ + is_1594_[8] * i_1711_ + 8192) >> 14);
				i_1717_ += i_1690_;
				i_1718_ += i_1691_;
				i_1719_ += i_1692_;
				for (int i_1720_ = 0; i_1720_ < i_1595_; i_1720_++) {
					int i_1721_ = is[i_1720_];
					if (i_1721_ < anIntArrayArray9190.length) {
						int[] is_1722_ = anIntArrayArray9190[i_1721_];
						for (int i_1723_ = 0; i_1723_ < is_1722_.length; i_1723_++) {
							int i_1724_ = is_1722_[i_1723_];
							if (aShortArray9162 == null || (i_1593_ & aShortArray9162[i_1724_]) != 0) {
								int i_1725_ = ((is_1712_[0] * anIntArray9158[i_1724_] + is_1712_[1] * anIntArray9159[i_1724_] + is_1712_[2] * anIntArray9160[i_1724_] + 8192) >> 14);
								int i_1726_ = ((is_1712_[3] * anIntArray9158[i_1724_] + is_1712_[4] * anIntArray9159[i_1724_] + is_1712_[5] * anIntArray9160[i_1724_] + 8192) >> 14);
								int i_1727_ = ((is_1712_[6] * anIntArray9158[i_1724_] + is_1712_[7] * anIntArray9159[i_1724_] + is_1712_[8] * anIntArray9160[i_1724_] + 8192) >> 14);
								i_1725_ += i_1717_;
								i_1726_ += i_1718_;
								i_1727_ += i_1719_;
								anIntArray9158[i_1724_] = i_1725_;
								anIntArray9159[i_1724_] = i_1726_;
								anIntArray9160[i_1724_] = i_1727_;
							}
						}
					}
				}
			} else {
				for (int i_1728_ = 0; i_1728_ < i_1595_; i_1728_++) {
					int i_1729_ = is[i_1728_];
					if (i_1729_ < anIntArrayArray9190.length) {
						int[] is_1730_ = anIntArrayArray9190[i_1729_];
						for (int i_1731_ = 0; i_1731_ < is_1730_.length; i_1731_++) {
							int i_1732_ = is_1730_[i_1731_];
							if (aShortArray9162 == null || (i_1593_ & aShortArray9162[i_1732_]) != 0) {
								anIntArray9158[i_1732_] -= anInt9221;
								anIntArray9159[i_1732_] -= anInt9222;
								anIntArray9160[i_1732_] -= anInt9151;
								anIntArray9158[i_1732_] = anIntArray9158[i_1732_] * i_1590_ >> 7;
								anIntArray9159[i_1732_] = anIntArray9159[i_1732_] * i_1591_ >> 7;
								anIntArray9160[i_1732_] = anIntArray9160[i_1732_] * i_1592_ >> 7;
								anIntArray9158[i_1732_] += anInt9221;
								anIntArray9159[i_1732_] += anInt9222;
								anIntArray9160[i_1732_] += anInt9151;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1733_ = false;
				for (int i_1734_ = 0; i_1734_ < i_1595_; i_1734_++) {
					int i_1735_ = is[i_1734_];
					if (i_1735_ < anIntArrayArray9181.length) {
						int[] is_1736_ = anIntArrayArray9181[i_1735_];
						for (int i_1737_ = 0; i_1737_ < is_1736_.length; i_1737_++) {
							int i_1738_ = is_1736_[i_1737_];
							if (aShortArray9170 == null || (i_1593_ & aShortArray9170[i_1738_]) != 0) {
								int i_1739_ = ((aByteArray9176[i_1738_] & 0xff) + i_1590_ * 8);
								if (i_1739_ < 0)
									i_1739_ = 0;
								else if (i_1739_ > 255)
									i_1739_ = 255;
								aByteArray9176[i_1738_] = (byte) i_1739_;
							}
						}
						bool_1733_ = bool_1733_ | is_1736_.length > 0;
					}
				}
				if (bool_1733_) {
					if (aClass371Array9211 != null) {
						for (int i_1740_ = 0; i_1740_ < anInt9210; i_1740_++) {
							Class371 class371 = aClass371Array9211[i_1740_];
							Class337 class337 = aClass337Array9212[i_1740_];
							class337.anInt3565 = (class337.anInt3565 & 0xffffff | 255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24);
						}
					}
					method14547();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1741_ = false;
				for (int i_1742_ = 0; i_1742_ < i_1595_; i_1742_++) {
					int i_1743_ = is[i_1742_];
					if (i_1743_ < anIntArrayArray9181.length) {
						int[] is_1744_ = anIntArrayArray9181[i_1743_];
						for (int i_1745_ = 0; i_1745_ < is_1744_.length; i_1745_++) {
							int i_1746_ = is_1744_[i_1745_];
							if (aShortArray9170 == null || (i_1593_ & aShortArray9170[i_1746_]) != 0) {
								int i_1747_ = aShortArray9175[i_1746_] & 0xffff;
								int i_1748_ = i_1747_ >> 10 & 0x3f;
								int i_1749_ = i_1747_ >> 7 & 0x7;
								int i_1750_ = i_1747_ & 0x7f;
								i_1748_ = i_1748_ + i_1590_ & 0x3f;
								i_1749_ += i_1591_ / 4;
								if (i_1749_ < 0)
									i_1749_ = 0;
								else if (i_1749_ > 7)
									i_1749_ = 7;
								i_1750_ += i_1592_;
								if (i_1750_ < 0)
									i_1750_ = 0;
								else if (i_1750_ > 127)
									i_1750_ = 127;
								aShortArray9175[i_1746_] = (short) (i_1748_ << 10 | i_1749_ << 7 | i_1750_);
							}
						}
						bool_1741_ = bool_1741_ | is_1744_.length > 0;
					}
				}
				if (bool_1741_) {
					if (aClass371Array9211 != null) {
						for (int i_1751_ = 0; i_1751_ < anInt9210; i_1751_++) {
							Class371 class371 = aClass371Array9211[i_1751_];
							Class337 class337 = aClass337Array9212[i_1751_];
							class337.anInt3565 = (class337.anInt3565 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9175[class371.anInt3891] & 0xffff)]) & 0xffffff);
						}
					}
					method14547();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9213 != null) {
				for (int i_1752_ = 0; i_1752_ < i_1595_; i_1752_++) {
					int i_1753_ = is[i_1752_];
					if (i_1753_ < anIntArrayArray9213.length) {
						int[] is_1754_ = anIntArrayArray9213[i_1753_];
						for (int i_1755_ = 0; i_1755_ < is_1754_.length; i_1755_++) {
							Class337 class337 = aClass337Array9212[is_1754_[i_1755_]];
							class337.anInt3568 += i_1590_;
							class337.anInt3569 += i_1591_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9213 != null) {
				for (int i_1756_ = 0; i_1756_ < i_1595_; i_1756_++) {
					int i_1757_ = is[i_1756_];
					if (i_1757_ < anIntArrayArray9213.length) {
						int[] is_1758_ = anIntArrayArray9213[i_1757_];
						for (int i_1759_ = 0; i_1759_ < is_1758_.length; i_1759_++) {
							Class337 class337 = aClass337Array9212[is_1758_[i_1759_]];
							class337.anInt3566 = class337.anInt3566 * i_1590_ >> 7;
							class337.anInt3567 = class337.anInt3567 * i_1591_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9213 != null) {
				for (int i_1760_ = 0; i_1760_ < i_1595_; i_1760_++) {
					int i_1761_ = is[i_1760_];
					if (i_1761_ < anIntArrayArray9213.length) {
						int[] is_1762_ = anIntArrayArray9213[i_1761_];
						for (int i_1763_ = 0; i_1763_ < is_1762_.length; i_1763_++) {
							Class337 class337 = aClass337Array9212[is_1762_[i_1763_]];
							class337.anInt3570 = class337.anInt3570 + i_1590_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2771(int i, int i_1764_, int i_1765_) {
		for (int i_1766_ = 0; i_1766_ < anInt9157; i_1766_++) {
			if (i != 0)
				anIntArray9158[i_1766_] += i;
			if (i_1764_ != 0)
				anIntArray9159[i_1766_] += i_1764_;
			if (i_1765_ != 0)
				anIntArray9160[i_1766_] += i_1765_;
		}
		method14577();
		aBool9215 = false;
	}

	public void method2775(int i, int i_1767_, int i_1768_) {
		for (int i_1769_ = 0; i_1769_ < anInt9157; i_1769_++) {
			if (i != 0)
				anIntArray9158[i_1769_] += i;
			if (i_1767_ != 0)
				anIntArray9159[i_1769_] += i_1767_;
			if (i_1768_ != 0)
				anIntArray9160[i_1769_] += i_1768_;
		}
		method14577();
		aBool9215 = false;
	}

	public int method2676() {
		if (!aBool9215)
			method14569();
		return anInt9195;
	}

	void method14578() {
		if (aBool9182) {
			aBool9182 = false;
			if (aClass184Array9208 == null && aClass143Array9209 == null && aClass371Array9211 == null && !Class347.method6048(anInt9152, anInt9185)) {
				boolean bool = false;
				boolean bool_1770_ = false;
				boolean bool_1771_ = false;
				if (anIntArray9158 != null && !Class347.method6001(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool = true;
					} else
						aBool9182 = true;
				}
				if (anIntArray9159 != null && !Class347.method5993(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool_1770_ = true;
					} else
						aBool9182 = true;
				}
				if (anIntArray9160 != null && !Class347.method5997(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool_1771_ = true;
					} else
						aBool9182 = true;
				}
				if (bool)
					anIntArray9158 = null;
				if (bool_1770_)
					anIntArray9159 = null;
				if (bool_1771_)
					anIntArray9160 = null;
			}
			if (aShortArray9207 != null && anIntArray9158 == null && anIntArray9159 == null && anIntArray9160 == null) {
				aShortArray9207 = null;
				anIntArray9199 = null;
			}
			while_32_: do {
				if (aByteArray9169 != null && !Class347.method6030(anInt9152, anInt9185)) {
					do {
						if ((anInt9185 & 0x37) != 0) {
							if (aClass357_9224 != null && !aClass357_9224.method6274())
								break;
						} else if (aClass357_9150 != null && !aClass357_9150.method6274())
							break;
						aShortArray9168 = null;
						aShortArray9167 = null;
						aShortArray9164 = null;
						aByteArray9169 = null;
						break while_32_;
					} while (false);
					aBool9182 = true;
				}
			} while (false);
			if (aShortArray9175 != null && !Class347.method6019(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9175 = null;
				else
					aBool9182 = true;
			}
			if (aByteArray9176 != null && !Class347.method6076(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aByteArray9176 = null;
				else
					aBool9182 = true;
			}
			if (aFloatArray9194 != null && !Class347.method6022(anInt9152, anInt9185)) {
				if (aClass357_9187 == null || aClass357_9187.method6274()) {
					aFloatArray9171 = null;
					aFloatArray9194 = null;
				} else
					aBool9182 = true;
			}
			if (aShortArray9189 != null && !Class347.method6027(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9189 = null;
				else
					aBool9182 = true;
			}
			if (aShortArray9161 != null && !Class347.method6026(anInt9152, anInt9185)) {
				if ((aClass336_9183 == null || aClass336_9183.method5933()) && (aClass357_9150 == null || aClass357_9150.method6274())) {
					aShortArray9179 = null;
					aShortArray9217 = null;
					aShortArray9161 = null;
				} else
					aBool9182 = true;
			}
			if (aShortArray9166 != null) {
				if (aClass357_9186 == null || aClass357_9186.method6274())
					aShortArray9166 = null;
				else
					aBool9182 = true;
			}
			if (aShortArray9178 != null) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9178 = null;
				else
					aBool9182 = true;
			}
			if (anIntArrayArray9181 != null && !Class347.method6023(anInt9152, anInt9185)) {
				anIntArrayArray9181 = null;
				aShortArray9170 = null;
			}
			if (anIntArrayArray9190 != null && !Class347.method6024(anInt9152, anInt9185)) {
				anIntArrayArray9190 = null;
				aShortArray9162 = null;
			}
			if (anIntArrayArray9213 != null && !Class347.method6065(anInt9152, anInt9185))
				anIntArrayArray9213 = null;
			if (anIntArray9203 != null && (anInt9152 & 0x800) == 0 && (anInt9152 & 0x40000) == 0) {
				anIntArray9203 = null;
				anIntArray9205 = null;
				anIntArray9204 = null;
			}
		}
	}

	void method2856(int i, int[] is, int i_1772_, int i_1773_, int i_1774_, int i_1775_, boolean bool) {
		int i_1776_ = is.length;
		if (i == 0) {
			i_1772_ <<= 4;
			i_1773_ <<= 4;
			i_1774_ <<= 4;
			int i_1777_ = 0;
			anInt9221 = 0;
			anInt9222 = 0;
			anInt9151 = 0;
			for (int i_1778_ = 0; i_1778_ < i_1776_; i_1778_++) {
				int i_1779_ = is[i_1778_];
				if (i_1779_ < anIntArrayArray9190.length) {
					int[] is_1780_ = anIntArrayArray9190[i_1779_];
					for (int i_1781_ = 0; i_1781_ < is_1780_.length; i_1781_++) {
						int i_1782_ = is_1780_[i_1781_];
						anInt9221 += anIntArray9158[i_1782_];
						anInt9222 += anIntArray9159[i_1782_];
						anInt9151 += anIntArray9160[i_1782_];
						i_1777_++;
					}
				}
			}
			if (i_1777_ > 0) {
				anInt9221 = anInt9221 / i_1777_ + i_1772_;
				anInt9222 = anInt9222 / i_1777_ + i_1773_;
				anInt9151 = anInt9151 / i_1777_ + i_1774_;
			} else {
				anInt9221 = i_1772_;
				anInt9222 = i_1773_;
				anInt9151 = i_1774_;
			}
		} else if (i == 1) {
			i_1772_ <<= 4;
			i_1773_ <<= 4;
			i_1774_ <<= 4;
			for (int i_1783_ = 0; i_1783_ < i_1776_; i_1783_++) {
				int i_1784_ = is[i_1783_];
				if (i_1784_ < anIntArrayArray9190.length) {
					int[] is_1785_ = anIntArrayArray9190[i_1784_];
					for (int i_1786_ = 0; i_1786_ < is_1785_.length; i_1786_++) {
						int i_1787_ = is_1785_[i_1786_];
						anIntArray9158[i_1787_] += i_1772_;
						anIntArray9159[i_1787_] += i_1773_;
						anIntArray9160[i_1787_] += i_1774_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1788_ = 0; i_1788_ < i_1776_; i_1788_++) {
				int i_1789_ = is[i_1788_];
				if (i_1789_ < anIntArrayArray9190.length) {
					int[] is_1790_ = anIntArrayArray9190[i_1789_];
					if ((i_1775_ & 0x1) == 0) {
						for (int i_1791_ = 0; i_1791_ < is_1790_.length; i_1791_++) {
							int i_1792_ = is_1790_[i_1791_];
							anIntArray9158[i_1792_] -= anInt9221;
							anIntArray9159[i_1792_] -= anInt9222;
							anIntArray9160[i_1792_] -= anInt9151;
							if (i_1774_ != 0) {
								int i_1793_ = Class433.anIntArray4880[i_1774_];
								int i_1794_ = Class433.anIntArray4881[i_1774_];
								int i_1795_ = ((anIntArray9159[i_1792_] * i_1793_ + anIntArray9158[i_1792_] * i_1794_ + 16383) >> 14);
								anIntArray9159[i_1792_] = (anIntArray9159[i_1792_] * i_1794_ - anIntArray9158[i_1792_] * i_1793_ + 16383) >> 14;
								anIntArray9158[i_1792_] = i_1795_;
							}
							if (i_1772_ != 0) {
								int i_1796_ = Class433.anIntArray4880[i_1772_];
								int i_1797_ = Class433.anIntArray4881[i_1772_];
								int i_1798_ = ((anIntArray9159[i_1792_] * i_1797_ - anIntArray9160[i_1792_] * i_1796_ + 16383) >> 14);
								anIntArray9160[i_1792_] = (anIntArray9159[i_1792_] * i_1796_ + anIntArray9160[i_1792_] * i_1797_ + 16383) >> 14;
								anIntArray9159[i_1792_] = i_1798_;
							}
							if (i_1773_ != 0) {
								int i_1799_ = Class433.anIntArray4880[i_1773_];
								int i_1800_ = Class433.anIntArray4881[i_1773_];
								int i_1801_ = ((anIntArray9160[i_1792_] * i_1799_ + anIntArray9158[i_1792_] * i_1800_ + 16383) >> 14);
								anIntArray9160[i_1792_] = (anIntArray9160[i_1792_] * i_1800_ - anIntArray9158[i_1792_] * i_1799_ + 16383) >> 14;
								anIntArray9158[i_1792_] = i_1801_;
							}
							anIntArray9158[i_1792_] += anInt9221;
							anIntArray9159[i_1792_] += anInt9222;
							anIntArray9160[i_1792_] += anInt9151;
						}
					} else {
						for (int i_1802_ = 0; i_1802_ < is_1790_.length; i_1802_++) {
							int i_1803_ = is_1790_[i_1802_];
							anIntArray9158[i_1803_] -= anInt9221;
							anIntArray9159[i_1803_] -= anInt9222;
							anIntArray9160[i_1803_] -= anInt9151;
							if (i_1772_ != 0) {
								int i_1804_ = Class433.anIntArray4880[i_1772_];
								int i_1805_ = Class433.anIntArray4881[i_1772_];
								int i_1806_ = ((anIntArray9159[i_1803_] * i_1805_ - anIntArray9160[i_1803_] * i_1804_ + 16383) >> 14);
								anIntArray9160[i_1803_] = (anIntArray9159[i_1803_] * i_1804_ + anIntArray9160[i_1803_] * i_1805_ + 16383) >> 14;
								anIntArray9159[i_1803_] = i_1806_;
							}
							if (i_1774_ != 0) {
								int i_1807_ = Class433.anIntArray4880[i_1774_];
								int i_1808_ = Class433.anIntArray4881[i_1774_];
								int i_1809_ = ((anIntArray9159[i_1803_] * i_1807_ + anIntArray9158[i_1803_] * i_1808_ + 16383) >> 14);
								anIntArray9159[i_1803_] = (anIntArray9159[i_1803_] * i_1808_ - anIntArray9158[i_1803_] * i_1807_ + 16383) >> 14;
								anIntArray9158[i_1803_] = i_1809_;
							}
							if (i_1773_ != 0) {
								int i_1810_ = Class433.anIntArray4880[i_1773_];
								int i_1811_ = Class433.anIntArray4881[i_1773_];
								int i_1812_ = ((anIntArray9160[i_1803_] * i_1810_ + anIntArray9158[i_1803_] * i_1811_ + 16383) >> 14);
								anIntArray9160[i_1803_] = (anIntArray9160[i_1803_] * i_1811_ - anIntArray9158[i_1803_] * i_1810_ + 16383) >> 14;
								anIntArray9158[i_1803_] = i_1812_;
							}
							anIntArray9158[i_1803_] += anInt9221;
							anIntArray9159[i_1803_] += anInt9222;
							anIntArray9160[i_1803_] += anInt9151;
						}
					}
				}
			}
			if (bool) {
				for (int i_1813_ = 0; i_1813_ < i_1776_; i_1813_++) {
					int i_1814_ = is[i_1813_];
					if (i_1814_ < anIntArrayArray9190.length) {
						int[] is_1815_ = anIntArrayArray9190[i_1814_];
						for (int i_1816_ = 0; i_1816_ < is_1815_.length; i_1816_++) {
							int i_1817_ = is_1815_[i_1816_];
							int i_1818_ = anIntArray9199[i_1817_];
							int i_1819_ = anIntArray9199[i_1817_ + 1];
							for (int i_1820_ = i_1818_; (i_1820_ < i_1819_ && aShortArray9207[i_1820_] != 0); i_1820_++) {
								int i_1821_ = (aShortArray9207[i_1820_] & 0xffff) - 1;
								if (i_1774_ != 0) {
									int i_1822_ = Class433.anIntArray4880[i_1774_];
									int i_1823_ = Class433.anIntArray4881[i_1774_];
									int i_1824_ = (aShortArray9167[i_1821_] * i_1822_ + aShortArray9164[i_1821_] * i_1823_ + 16383) >> 14;
									aShortArray9167[i_1821_] = (short) (((aShortArray9167[i_1821_] * i_1823_) - (aShortArray9164[i_1821_] * i_1822_) + 16383) >> 14);
									aShortArray9164[i_1821_] = (short) i_1824_;
								}
								if (i_1772_ != 0) {
									int i_1825_ = Class433.anIntArray4880[i_1772_];
									int i_1826_ = Class433.anIntArray4881[i_1772_];
									int i_1827_ = (aShortArray9167[i_1821_] * i_1826_ - aShortArray9168[i_1821_] * i_1825_ + 16383) >> 14;
									aShortArray9168[i_1821_] = (short) (((aShortArray9167[i_1821_] * i_1825_) + (aShortArray9168[i_1821_] * i_1826_) + 16383) >> 14);
									aShortArray9167[i_1821_] = (short) i_1827_;
								}
								if (i_1773_ != 0) {
									int i_1828_ = Class433.anIntArray4880[i_1773_];
									int i_1829_ = Class433.anIntArray4881[i_1773_];
									int i_1830_ = (aShortArray9168[i_1821_] * i_1828_ + aShortArray9164[i_1821_] * i_1829_ + 16383) >> 14;
									aShortArray9168[i_1821_] = (short) (((aShortArray9168[i_1821_] * i_1829_) - (aShortArray9164[i_1821_] * i_1828_) + 16383) >> 14);
									aShortArray9164[i_1821_] = (short) i_1830_;
								}
							}
						}
					}
				}
				method14548();
			}
		} else if (i == 3) {
			for (int i_1831_ = 0; i_1831_ < i_1776_; i_1831_++) {
				int i_1832_ = is[i_1831_];
				if (i_1832_ < anIntArrayArray9190.length) {
					int[] is_1833_ = anIntArrayArray9190[i_1832_];
					for (int i_1834_ = 0; i_1834_ < is_1833_.length; i_1834_++) {
						int i_1835_ = is_1833_[i_1834_];
						anIntArray9158[i_1835_] -= anInt9221;
						anIntArray9159[i_1835_] -= anInt9222;
						anIntArray9160[i_1835_] -= anInt9151;
						anIntArray9158[i_1835_] = anIntArray9158[i_1835_] * i_1772_ >> 7;
						anIntArray9159[i_1835_] = anIntArray9159[i_1835_] * i_1773_ >> 7;
						anIntArray9160[i_1835_] = anIntArray9160[i_1835_] * i_1774_ >> 7;
						anIntArray9158[i_1835_] += anInt9221;
						anIntArray9159[i_1835_] += anInt9222;
						anIntArray9160[i_1835_] += anInt9151;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1836_ = false;
				for (int i_1837_ = 0; i_1837_ < i_1776_; i_1837_++) {
					int i_1838_ = is[i_1837_];
					if (i_1838_ < anIntArrayArray9181.length) {
						int[] is_1839_ = anIntArrayArray9181[i_1838_];
						for (int i_1840_ = 0; i_1840_ < is_1839_.length; i_1840_++) {
							int i_1841_ = is_1839_[i_1840_];
							int i_1842_ = ((aByteArray9176[i_1841_] & 0xff) + i_1772_ * 8);
							if (i_1842_ < 0)
								i_1842_ = 0;
							else if (i_1842_ > 255)
								i_1842_ = 255;
							aByteArray9176[i_1841_] = (byte) i_1842_;
						}
						bool_1836_ = bool_1836_ | is_1839_.length > 0;
					}
				}
				if (bool_1836_) {
					if (aClass371Array9211 != null) {
						for (int i_1843_ = 0; i_1843_ < anInt9210; i_1843_++) {
							Class371 class371 = aClass371Array9211[i_1843_];
							Class337 class337 = aClass337Array9212[i_1843_];
							class337.anInt3565 = (class337.anInt3565 & 0xffffff | 255 - (aByteArray9176[class371.anInt3891] & 0xff) << 24);
						}
					}
					method14547();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9181 != null) {
				boolean bool_1844_ = false;
				for (int i_1845_ = 0; i_1845_ < i_1776_; i_1845_++) {
					int i_1846_ = is[i_1845_];
					if (i_1846_ < anIntArrayArray9181.length) {
						int[] is_1847_ = anIntArrayArray9181[i_1846_];
						for (int i_1848_ = 0; i_1848_ < is_1847_.length; i_1848_++) {
							int i_1849_ = is_1847_[i_1848_];
							int i_1850_ = aShortArray9175[i_1849_] & 0xffff;
							int i_1851_ = i_1850_ >> 10 & 0x3f;
							int i_1852_ = i_1850_ >> 7 & 0x7;
							int i_1853_ = i_1850_ & 0x7f;
							i_1851_ = i_1851_ + i_1772_ & 0x3f;
							i_1852_ += i_1773_ / 4;
							if (i_1852_ < 0)
								i_1852_ = 0;
							else if (i_1852_ > 7)
								i_1852_ = 7;
							i_1853_ += i_1774_;
							if (i_1853_ < 0)
								i_1853_ = 0;
							else if (i_1853_ > 127)
								i_1853_ = 127;
							aShortArray9175[i_1849_] = (short) (i_1851_ << 10 | i_1852_ << 7 | i_1853_);
						}
						bool_1844_ = bool_1844_ | is_1847_.length > 0;
					}
				}
				if (bool_1844_) {
					if (aClass371Array9211 != null) {
						for (int i_1854_ = 0; i_1854_ < anInt9210; i_1854_++) {
							Class371 class371 = aClass371Array9211[i_1854_];
							Class337 class337 = aClass337Array9212[i_1854_];
							class337.anInt3565 = (class337.anInt3565 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9175[class371.anInt3891] & 0xffff)]) & 0xffffff);
						}
					}
					method14547();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9213 != null) {
				for (int i_1855_ = 0; i_1855_ < i_1776_; i_1855_++) {
					int i_1856_ = is[i_1855_];
					if (i_1856_ < anIntArrayArray9213.length) {
						int[] is_1857_ = anIntArrayArray9213[i_1856_];
						for (int i_1858_ = 0; i_1858_ < is_1857_.length; i_1858_++) {
							Class337 class337 = aClass337Array9212[is_1857_[i_1858_]];
							class337.anInt3568 += i_1772_;
							class337.anInt3569 += i_1773_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9213 != null) {
				for (int i_1859_ = 0; i_1859_ < i_1776_; i_1859_++) {
					int i_1860_ = is[i_1859_];
					if (i_1860_ < anIntArrayArray9213.length) {
						int[] is_1861_ = anIntArrayArray9213[i_1860_];
						for (int i_1862_ = 0; i_1862_ < is_1861_.length; i_1862_++) {
							Class337 class337 = aClass337Array9212[is_1861_[i_1862_]];
							class337.anInt3566 = class337.anInt3566 * i_1772_ >> 7;
							class337.anInt3567 = class337.anInt3567 * i_1773_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9213 != null) {
				for (int i_1863_ = 0; i_1863_ < i_1776_; i_1863_++) {
					int i_1864_ = is[i_1863_];
					if (i_1864_ < anIntArrayArray9213.length) {
						int[] is_1865_ = anIntArrayArray9213[i_1864_];
						for (int i_1866_ = 0; i_1866_ < is_1865_.length; i_1866_++) {
							Class337 class337 = aClass337Array9212[is_1865_[i_1866_]];
							class337.anInt3570 = class337.anInt3570 + i_1772_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2838() {
		/* empty */
	}

	void method2808() {
		/* empty */
	}

	void method2851() {
		/* empty */
	}

	void method2757() {
		/* empty */
	}

	void method2842() {
		/* empty */
	}

	public int method2871() {
		if (!aBool9201)
			method2719();
		return anInt9202;
	}

	void method2774() {
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] = anIntArray9158[i] + 7 >> 4;
			anIntArray9159[i] = anIntArray9159[i] + 7 >> 4;
			anIntArray9160[i] = anIntArray9160[i] + 7 >> 4;
		}
		method14577();
		aBool9215 = false;
	}

	void method14579() {
		if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	short method14580(Class179 class179, int i, int i_1867_, long l, int i_1868_, int i_1869_, int i_1870_, int i_1871_, float f, float f_1872_) {
		int i_1873_ = anIntArray9199[i];
		int i_1874_ = anIntArray9199[i + 1];
		int i_1875_ = 0;
		for (int i_1876_ = i_1873_; i_1876_ < i_1874_; i_1876_++) {
			if (aShortArray9207[i_1876_] == 0) {
				i_1875_ = i_1876_;
				break;
			}
			int i_1877_ = (aShortArray9207[i_1876_] & 0xffff) - 1;
			if (aLongArray9214[i_1876_] == l)
				return (short) i_1877_;
		}
		aShortArray9207[i_1875_] = (short) (anInt9163 + 1);
		aLongArray9214[i_1875_] = l;
		aShortArray9178[anInt9163] = (short) i_1867_;
		aShortArray9166[anInt9163] = (short) i;
		aShortArray9164[anInt9163] = (short) i_1868_;
		aShortArray9167[anInt9163] = (short) i_1869_;
		aShortArray9168[anInt9163] = (short) i_1870_;
		aByteArray9169[anInt9163] = (byte) i_1871_;
		aFloatArray9194[anInt9163] = f;
		aFloatArray9171[anInt9163] = f_1872_;
		return (short) anInt9163++;
	}

	boolean method14581(int i, int i_1878_, int i_1879_, int i_1880_, Class435 class435, boolean bool, int i_1881_) {
		Class441 class441 = aClass178_Sub2_9153.aClass441_9560;
		class441.method7090(class435);
		class441.method7089(aClass178_Sub2_9153.aClass441_9574);
		boolean bool_1882_ = false;
		float f = 3.4028235E38F;
		float f_1883_ = -3.4028235E38F;
		float f_1884_ = 3.4028235E38F;
		float f_1885_ = -3.4028235E38F;
		if (!aBool9215)
			method14569();
		int i_1886_ = anInt9165 - anInt9197 >> 1;
		int i_1887_ = anInt9196 - anInt9195 >> 1;
		int i_1888_ = anInt9200 - anInt9154 >> 1;
		int i_1889_ = anInt9197 + i_1886_;
		int i_1890_ = anInt9195 + i_1887_;
		int i_1891_ = anInt9154 + i_1888_;
		int i_1892_ = i_1889_ - (i_1886_ << i_1881_);
		int i_1893_ = i_1890_ - (i_1887_ << i_1881_);
		int i_1894_ = i_1891_ - (i_1888_ << i_1881_);
		int i_1895_ = i_1889_ + (i_1886_ << i_1881_);
		int i_1896_ = i_1890_ + (i_1887_ << i_1881_);
		int i_1897_ = i_1891_ + (i_1888_ << i_1881_);
		anIntArray9218[0] = i_1892_;
		anIntArray9180[0] = i_1893_;
		anIntArray9220[0] = i_1894_;
		anIntArray9218[1] = i_1895_;
		anIntArray9180[1] = i_1893_;
		anIntArray9220[1] = i_1894_;
		anIntArray9218[2] = i_1892_;
		anIntArray9180[2] = i_1896_;
		anIntArray9220[2] = i_1894_;
		anIntArray9218[3] = i_1895_;
		anIntArray9180[3] = i_1896_;
		anIntArray9220[3] = i_1894_;
		anIntArray9218[4] = i_1892_;
		anIntArray9180[4] = i_1893_;
		anIntArray9220[4] = i_1897_;
		anIntArray9218[5] = i_1895_;
		anIntArray9180[5] = i_1893_;
		anIntArray9220[5] = i_1897_;
		anIntArray9218[6] = i_1892_;
		anIntArray9180[6] = i_1896_;
		anIntArray9220[6] = i_1897_;
		anIntArray9218[7] = i_1895_;
		anIntArray9180[7] = i_1896_;
		anIntArray9220[7] = i_1897_;
		for (int i_1898_ = 0; i_1898_ < 8; i_1898_++) {
			float f_1899_ = (float) anIntArray9218[i_1898_];
			float f_1900_ = (float) anIntArray9180[i_1898_];
			float f_1901_ = (float) anIntArray9220[i_1898_];
			float f_1902_ = (class441.aFloatArray4916[2] * f_1899_ + class441.aFloatArray4916[6] * f_1900_ + class441.aFloatArray4916[10] * f_1901_ + class441.aFloatArray4916[14]);
			float f_1903_ = (class441.aFloatArray4916[3] * f_1899_ + class441.aFloatArray4916[7] * f_1900_ + class441.aFloatArray4916[11] * f_1901_ + class441.aFloatArray4916[15]);
			if (f_1902_ >= -f_1903_) {
				float f_1904_ = (class441.aFloatArray4916[0] * f_1899_ + class441.aFloatArray4916[4] * f_1900_ + class441.aFloatArray4916[8] * f_1901_ + class441.aFloatArray4916[12]);
				float f_1905_ = (class441.aFloatArray4916[1] * f_1899_ + class441.aFloatArray4916[5] * f_1900_ + class441.aFloatArray4916[9] * f_1901_ + class441.aFloatArray4916[13]);
				float f_1906_ = (aClass178_Sub2_9153.aFloat9603 + aClass178_Sub2_9153.aFloat9578 * f_1904_ / f_1903_);
				float f_1907_ = (aClass178_Sub2_9153.aFloat9579 + aClass178_Sub2_9153.aFloat9580 * f_1905_ / f_1903_);
				if (f_1906_ < f)
					f = f_1906_;
				if (f_1906_ > f_1883_)
					f_1883_ = f_1906_;
				if (f_1907_ < f_1884_)
					f_1884_ = f_1907_;
				if (f_1907_ > f_1885_)
					f_1885_ = f_1907_;
				bool_1882_ = true;
			}
		}
		int i_1908_ = i + i_1879_;
		int i_1909_ = i_1878_ + i_1880_;
		if (bool_1882_ && (float) i_1908_ > f && (float) i < f_1883_ && (float) i_1909_ > f_1884_ && (float) i_1878_ < f_1885_) {
			if (bool)
				return true;
			if (anIntArray9219.length < anInt9163) {
				anIntArray9219 = new int[anInt9163];
				anIntArray9177 = new int[anInt9163];
			}
			for (int i_1910_ = 0; i_1910_ < anInt9157; i_1910_++) {
				float f_1911_ = (float) anIntArray9158[i_1910_];
				float f_1912_ = (float) anIntArray9159[i_1910_];
				float f_1913_ = (float) anIntArray9160[i_1910_];
				float f_1914_ = (class441.aFloatArray4916[2] * f_1911_ + class441.aFloatArray4916[6] * f_1912_ + class441.aFloatArray4916[10] * f_1913_ + class441.aFloatArray4916[14]);
				float f_1915_ = (class441.aFloatArray4916[3] * f_1911_ + class441.aFloatArray4916[7] * f_1912_ + class441.aFloatArray4916[11] * f_1913_ + class441.aFloatArray4916[15]);
				if (f_1914_ >= -f_1915_) {
					float f_1916_ = (class441.aFloatArray4916[0] * f_1911_ + class441.aFloatArray4916[4] * f_1912_ + class441.aFloatArray4916[8] * f_1913_ + class441.aFloatArray4916[12]);
					float f_1917_ = (class441.aFloatArray4916[1] * f_1911_ + class441.aFloatArray4916[5] * f_1912_ + class441.aFloatArray4916[9] * f_1913_ + class441.aFloatArray4916[13]);
					int i_1918_ = anIntArray9199[i_1910_];
					int i_1919_ = anIntArray9199[i_1910_ + 1];
					for (int i_1920_ = i_1918_; i_1920_ < i_1919_ && aShortArray9207[i_1920_] != 0; i_1920_++) {
						int i_1921_ = (aShortArray9207[i_1920_] & 0xffff) - 1;
						anIntArray9219[i_1921_] = (int) (aClass178_Sub2_9153.aFloat9603 + (aClass178_Sub2_9153.aFloat9578 * f_1916_ / f_1915_));
						anIntArray9177[i_1921_] = (int) (aClass178_Sub2_9153.aFloat9579 + (aClass178_Sub2_9153.aFloat9580 * f_1917_ / f_1915_));
					}
				} else {
					int i_1922_ = anIntArray9199[i_1910_];
					int i_1923_ = anIntArray9199[i_1910_ + 1];
					for (int i_1924_ = i_1922_; i_1924_ < i_1923_ && aShortArray9207[i_1924_] != 0; i_1924_++) {
						int i_1925_ = (aShortArray9207[i_1924_] & 0xffff) - 1;
						anIntArray9219[i_1925_] = -999999;
					}
				}
			}
			for (int i_1926_ = 0; i_1926_ < anInt9155; i_1926_++) {
				if ((anIntArray9219[aShortArray9161[i_1926_] & 0xffff] != -999999) && (anIntArray9219[aShortArray9217[i_1926_] & 0xffff] != -999999) && (anIntArray9219[aShortArray9179[i_1926_] & 0xffff] != -999999) && (method14556(i, i_1878_, i_1908_, i_1909_, anIntArray9177[aShortArray9161[i_1926_] & 0xffff], anIntArray9177[aShortArray9217[i_1926_] & 0xffff], anIntArray9177[aShortArray9179[i_1926_] & 0xffff], anIntArray9219[aShortArray9161[i_1926_] & 0xffff], anIntArray9219[aShortArray9217[i_1926_] & 0xffff], anIntArray9219[aShortArray9179[i_1926_] & 0xffff])))
					return true;
			}
		}
		return false;
	}

	public Class167 method2759(byte i, int i_1927_, boolean bool) {
		boolean bool_1928_ = false;
		Class167_Sub2 class167_sub2_1929_;
		Class167_Sub2 class167_sub2_1930_;
		if (i > 0 && i <= 8) {
			class167_sub2_1930_ = aClass178_Sub2_9153.aClass167_Sub2Array9595[i - 1];
			class167_sub2_1929_ = aClass178_Sub2_9153.aClass167_Sub2Array9700[i - 1];
			bool_1928_ = true;
		} else
			class167_sub2_1929_ = class167_sub2_1930_ = new Class167_Sub2(aClass178_Sub2_9153, 0, 0, true, false);
		return method14544(class167_sub2_1929_, class167_sub2_1930_, i_1927_, bool_1928_, bool);
	}

	short method14582(Class179 class179, int i, int i_1931_, long l, int i_1932_, int i_1933_, int i_1934_, int i_1935_, float f, float f_1936_) {
		int i_1937_ = anIntArray9199[i];
		int i_1938_ = anIntArray9199[i + 1];
		int i_1939_ = 0;
		for (int i_1940_ = i_1937_; i_1940_ < i_1938_; i_1940_++) {
			if (aShortArray9207[i_1940_] == 0) {
				i_1939_ = i_1940_;
				break;
			}
			int i_1941_ = (aShortArray9207[i_1940_] & 0xffff) - 1;
			if (aLongArray9214[i_1940_] == l)
				return (short) i_1941_;
		}
		aShortArray9207[i_1939_] = (short) (anInt9163 + 1);
		aLongArray9214[i_1939_] = l;
		aShortArray9178[anInt9163] = (short) i_1931_;
		aShortArray9166[anInt9163] = (short) i;
		aShortArray9164[anInt9163] = (short) i_1932_;
		aShortArray9167[anInt9163] = (short) i_1933_;
		aShortArray9168[anInt9163] = (short) i_1934_;
		aByteArray9169[anInt9163] = (byte) i_1935_;
		aFloatArray9194[anInt9163] = f;
		aFloatArray9171[anInt9163] = f_1936_;
		return (short) anInt9163++;
	}

	static byte[] method14583(byte[] is, int i) {
		byte[] is_1942_ = new byte[i];
		System.arraycopy(is, 0, is_1942_, 0, i);
		return is_1942_;
	}

	public void method2684() {
		if (anInt9163 > 0 && anInt9174 > 0) {
			method14561();
			method14560();
			method14600();
		}
	}

	public int method2804() {
		if (!aBool9215)
			method14569();
		return anInt9195;
	}

	static float[] method14584(float[] fs, int i) {
		float[] fs_1943_ = new float[i];
		System.arraycopy(fs, 0, fs_1943_, 0, i);
		return fs_1943_;
	}

	Class167 method14585(Class167_Sub2 class167_sub2_1944_, Class167_Sub2 class167_sub2_1945_, int i, boolean bool, boolean bool_1946_) {
		class167_sub2_1944_.anInt9152 = i;
		class167_sub2_1944_.anInt9185 = anInt9185;
		class167_sub2_1944_.aShort9149 = aShort9149;
		class167_sub2_1944_.aShort9206 = aShort9206;
		class167_sub2_1944_.anInt9156 = anInt9156;
		class167_sub2_1944_.anInt9157 = anInt9157;
		class167_sub2_1944_.anInt9163 = anInt9163;
		class167_sub2_1944_.anInt9155 = anInt9155;
		class167_sub2_1944_.anInt9174 = anInt9174;
		class167_sub2_1944_.anInt9210 = anInt9210;
		if ((i & 0x100) != 0)
			class167_sub2_1944_.aBool9184 = true;
		else
			class167_sub2_1944_.aBool9184 = aBool9184;
		class167_sub2_1944_.aBool9191 = aBool9191;
		boolean bool_1947_ = Class347.method6013(i, anInt9185);
		boolean bool_1948_ = Class347.method6085(i, anInt9185);
		boolean bool_1949_ = Class347.method5996(i, anInt9185);
		boolean bool_1950_ = bool_1947_ | bool_1948_ | bool_1949_;
		if (bool_1950_) {
			if (bool_1947_) {
				if (class167_sub2_1945_.anIntArray9158 == null || class167_sub2_1945_.anIntArray9158.length < anInt9156)
					class167_sub2_1944_.anIntArray9158 = class167_sub2_1945_.anIntArray9158 = new int[anInt9156];
				else
					class167_sub2_1944_.anIntArray9158 = class167_sub2_1945_.anIntArray9158;
			} else
				class167_sub2_1944_.anIntArray9158 = anIntArray9158;
			if (bool_1948_) {
				if (class167_sub2_1945_.anIntArray9159 == null || class167_sub2_1945_.anIntArray9159.length < anInt9156)
					class167_sub2_1944_.anIntArray9159 = class167_sub2_1945_.anIntArray9159 = new int[anInt9156];
				else
					class167_sub2_1944_.anIntArray9159 = class167_sub2_1945_.anIntArray9159;
			} else
				class167_sub2_1944_.anIntArray9159 = anIntArray9159;
			if (bool_1949_) {
				if (class167_sub2_1945_.anIntArray9160 == null || class167_sub2_1945_.anIntArray9160.length < anInt9156)
					class167_sub2_1944_.anIntArray9160 = class167_sub2_1945_.anIntArray9160 = new int[anInt9156];
				else
					class167_sub2_1944_.anIntArray9160 = class167_sub2_1945_.anIntArray9160;
			} else
				class167_sub2_1944_.anIntArray9160 = anIntArray9160;
			for (int i_1951_ = 0; i_1951_ < anInt9156; i_1951_++) {
				if (bool_1947_)
					class167_sub2_1944_.anIntArray9158[i_1951_] = anIntArray9158[i_1951_];
				if (bool_1948_)
					class167_sub2_1944_.anIntArray9159[i_1951_] = anIntArray9159[i_1951_];
				if (bool_1949_)
					class167_sub2_1944_.anIntArray9160[i_1951_] = anIntArray9160[i_1951_];
			}
		} else {
			class167_sub2_1944_.anIntArray9158 = anIntArray9158;
			class167_sub2_1944_.anIntArray9159 = anIntArray9159;
			class167_sub2_1944_.anIntArray9160 = anIntArray9160;
		}
		if (Class347.method6011(i, anInt9185)) {
			class167_sub2_1944_.aClass357_9186 = class167_sub2_1945_.aClass357_9186;
			class167_sub2_1944_.aClass357_9186.anInterface36_3726 = aClass357_9186.anInterface36_3726;
			class167_sub2_1944_.aClass357_9186.aBool3725 = aClass357_9186.aBool3725;
			class167_sub2_1944_.aClass357_9186.aBool3724 = true;
		} else if (Class347.method6006(i, anInt9185))
			class167_sub2_1944_.aClass357_9186 = aClass357_9186;
		else
			class167_sub2_1944_.aClass357_9186 = null;
		if (Class347.method5999(i, anInt9185)) {
			if (class167_sub2_1945_.aShortArray9175 == null || class167_sub2_1945_.aShortArray9175.length < anInt9155)
				class167_sub2_1944_.aShortArray9175 = class167_sub2_1945_.aShortArray9175 = new short[anInt9155];
			else
				class167_sub2_1944_.aShortArray9175 = class167_sub2_1945_.aShortArray9175;
			for (int i_1952_ = 0; i_1952_ < anInt9155; i_1952_++)
				class167_sub2_1944_.aShortArray9175[i_1952_] = aShortArray9175[i_1952_];
		} else
			class167_sub2_1944_.aShortArray9175 = aShortArray9175;
		if (Class347.method5994(i, anInt9185)) {
			if (class167_sub2_1945_.aByteArray9176 == null || class167_sub2_1945_.aByteArray9176.length < anInt9155)
				class167_sub2_1944_.aByteArray9176 = class167_sub2_1945_.aByteArray9176 = new byte[anInt9155];
			else
				class167_sub2_1944_.aByteArray9176 = class167_sub2_1945_.aByteArray9176;
			for (int i_1953_ = 0; i_1953_ < anInt9155; i_1953_++)
				class167_sub2_1944_.aByteArray9176[i_1953_] = aByteArray9176[i_1953_];
		} else
			class167_sub2_1944_.aByteArray9176 = aByteArray9176;
		if (Class347.method6092(i, anInt9185)) {
			class167_sub2_1944_.aClass357_9150 = class167_sub2_1945_.aClass357_9150;
			class167_sub2_1944_.aClass357_9150.anInterface36_3726 = aClass357_9150.anInterface36_3726;
			class167_sub2_1944_.aClass357_9150.aBool3725 = aClass357_9150.aBool3725;
			class167_sub2_1944_.aClass357_9150.aBool3724 = true;
		} else if (Class347.method6008(i, anInt9185))
			class167_sub2_1944_.aClass357_9150 = aClass357_9150;
		else
			class167_sub2_1944_.aClass357_9150 = null;
		if (Class347.method5998(i, anInt9185)) {
			if (class167_sub2_1945_.aShortArray9164 == null || class167_sub2_1945_.aShortArray9164.length < anInt9163) {
				int i_1954_ = anInt9163;
				class167_sub2_1944_.aShortArray9164 = class167_sub2_1945_.aShortArray9164 = new short[i_1954_];
				class167_sub2_1944_.aShortArray9167 = class167_sub2_1945_.aShortArray9167 = new short[i_1954_];
				class167_sub2_1944_.aShortArray9168 = class167_sub2_1945_.aShortArray9168 = new short[i_1954_];
			} else {
				class167_sub2_1944_.aShortArray9164 = class167_sub2_1945_.aShortArray9164;
				class167_sub2_1944_.aShortArray9167 = class167_sub2_1945_.aShortArray9167;
				class167_sub2_1944_.aShortArray9168 = class167_sub2_1945_.aShortArray9168;
			}
			if (aClass367_9172 != null) {
				if (class167_sub2_1945_.aClass367_9172 == null)
					class167_sub2_1945_.aClass367_9172 = new Class367();
				Class367 class367 = (class167_sub2_1944_.aClass367_9172 = class167_sub2_1945_.aClass367_9172);
				if (class367.aShortArray3879 == null || class367.aShortArray3879.length < anInt9163) {
					int i_1955_ = anInt9163;
					class367.aShortArray3879 = new short[i_1955_];
					class367.aShortArray3877 = new short[i_1955_];
					class367.aShortArray3876 = new short[i_1955_];
					class367.aByteArray3878 = new byte[i_1955_];
				}
				for (int i_1956_ = 0; i_1956_ < anInt9163; i_1956_++) {
					class167_sub2_1944_.aShortArray9164[i_1956_] = aShortArray9164[i_1956_];
					class167_sub2_1944_.aShortArray9167[i_1956_] = aShortArray9167[i_1956_];
					class167_sub2_1944_.aShortArray9168[i_1956_] = aShortArray9168[i_1956_];
					class367.aShortArray3879[i_1956_] = aClass367_9172.aShortArray3879[i_1956_];
					class367.aShortArray3877[i_1956_] = aClass367_9172.aShortArray3877[i_1956_];
					class367.aShortArray3876[i_1956_] = aClass367_9172.aShortArray3876[i_1956_];
					class367.aByteArray3878[i_1956_] = aClass367_9172.aByteArray3878[i_1956_];
				}
			} else {
				class167_sub2_1944_.aClass367_9172 = null;
				for (int i_1957_ = 0; i_1957_ < anInt9163; i_1957_++) {
					class167_sub2_1944_.aShortArray9164[i_1957_] = aShortArray9164[i_1957_];
					class167_sub2_1944_.aShortArray9167[i_1957_] = aShortArray9167[i_1957_];
					class167_sub2_1944_.aShortArray9168[i_1957_] = aShortArray9168[i_1957_];
				}
			}
			class167_sub2_1944_.aByteArray9169 = aByteArray9169;
		} else {
			class167_sub2_1944_.aClass367_9172 = aClass367_9172;
			class167_sub2_1944_.aShortArray9164 = aShortArray9164;
			class167_sub2_1944_.aShortArray9167 = aShortArray9167;
			class167_sub2_1944_.aShortArray9168 = aShortArray9168;
			class167_sub2_1944_.aByteArray9169 = aByteArray9169;
		}
		if (Class347.method6012(i, anInt9185)) {
			class167_sub2_1944_.aClass357_9224 = class167_sub2_1945_.aClass357_9224;
			class167_sub2_1944_.aClass357_9224.anInterface36_3726 = aClass357_9224.anInterface36_3726;
			class167_sub2_1944_.aClass357_9224.aBool3725 = aClass357_9224.aBool3725;
			class167_sub2_1944_.aClass357_9224.aBool3724 = true;
		} else if (Class347.method6007(i, anInt9185))
			class167_sub2_1944_.aClass357_9224 = aClass357_9224;
		else
			class167_sub2_1944_.aClass357_9224 = null;
		if (Class347.method6047(i, anInt9185)) {
			if (class167_sub2_1945_.aFloatArray9194 == null || class167_sub2_1945_.aFloatArray9194.length < anInt9155) {
				int i_1958_ = anInt9163;
				class167_sub2_1944_.aFloatArray9194 = class167_sub2_1945_.aFloatArray9194 = new float[i_1958_];
				class167_sub2_1944_.aFloatArray9171 = class167_sub2_1945_.aFloatArray9171 = new float[i_1958_];
			} else {
				class167_sub2_1944_.aFloatArray9194 = class167_sub2_1945_.aFloatArray9194;
				class167_sub2_1944_.aFloatArray9171 = class167_sub2_1945_.aFloatArray9171;
			}
			for (int i_1959_ = 0; i_1959_ < anInt9163; i_1959_++) {
				class167_sub2_1944_.aFloatArray9194[i_1959_] = aFloatArray9194[i_1959_];
				class167_sub2_1944_.aFloatArray9171[i_1959_] = aFloatArray9171[i_1959_];
			}
		} else {
			class167_sub2_1944_.aFloatArray9194 = aFloatArray9194;
			class167_sub2_1944_.aFloatArray9171 = aFloatArray9171;
		}
		if (Class347.method6014(i, anInt9185)) {
			class167_sub2_1944_.aClass357_9187 = class167_sub2_1945_.aClass357_9187;
			class167_sub2_1944_.aClass357_9187.anInterface36_3726 = aClass357_9187.anInterface36_3726;
			class167_sub2_1944_.aClass357_9187.aBool3725 = aClass357_9187.aBool3725;
			class167_sub2_1944_.aClass357_9187.aBool3724 = true;
		} else if (Class347.method6009(i, anInt9185))
			class167_sub2_1944_.aClass357_9187 = aClass357_9187;
		else
			class167_sub2_1944_.aClass357_9187 = null;
		if (Class347.method6081(i, anInt9185)) {
			if (class167_sub2_1945_.aShortArray9161 == null || class167_sub2_1945_.aShortArray9161.length < anInt9155) {
				int i_1960_ = anInt9155;
				class167_sub2_1944_.aShortArray9161 = class167_sub2_1945_.aShortArray9161 = new short[i_1960_];
				class167_sub2_1944_.aShortArray9217 = class167_sub2_1945_.aShortArray9217 = new short[i_1960_];
				class167_sub2_1944_.aShortArray9179 = class167_sub2_1945_.aShortArray9179 = new short[i_1960_];
			} else {
				class167_sub2_1944_.aShortArray9161 = class167_sub2_1945_.aShortArray9161;
				class167_sub2_1944_.aShortArray9217 = class167_sub2_1945_.aShortArray9217;
				class167_sub2_1944_.aShortArray9179 = class167_sub2_1945_.aShortArray9179;
			}
			for (int i_1961_ = 0; i_1961_ < anInt9155; i_1961_++) {
				class167_sub2_1944_.aShortArray9161[i_1961_] = aShortArray9161[i_1961_];
				class167_sub2_1944_.aShortArray9217[i_1961_] = aShortArray9217[i_1961_];
				class167_sub2_1944_.aShortArray9179[i_1961_] = aShortArray9179[i_1961_];
			}
		} else {
			class167_sub2_1944_.aShortArray9161 = aShortArray9161;
			class167_sub2_1944_.aShortArray9217 = aShortArray9217;
			class167_sub2_1944_.aShortArray9179 = aShortArray9179;
		}
		if (Class347.method6015(i, anInt9185)) {
			class167_sub2_1944_.aClass336_9183 = class167_sub2_1945_.aClass336_9183;
			class167_sub2_1944_.aClass336_9183.anInterface40_3561 = aClass336_9183.anInterface40_3561;
			class167_sub2_1944_.aClass336_9183.aBool3564 = aClass336_9183.aBool3564;
			class167_sub2_1944_.aClass336_9183.aBool3563 = true;
		} else if (Class347.method6010(i, anInt9185))
			class167_sub2_1944_.aClass336_9183 = aClass336_9183;
		else
			class167_sub2_1944_.aClass336_9183 = null;
		if (Class347.method6003(i, anInt9185)) {
			if (class167_sub2_1945_.aShortArray9189 == null || class167_sub2_1945_.aShortArray9189.length < anInt9155) {
				int i_1962_ = anInt9155;
				class167_sub2_1944_.aShortArray9189 = class167_sub2_1945_.aShortArray9189 = new short[i_1962_];
			} else
				class167_sub2_1944_.aShortArray9189 = class167_sub2_1945_.aShortArray9189;
			for (int i_1963_ = 0; i_1963_ < anInt9155; i_1963_++)
				class167_sub2_1944_.aShortArray9189[i_1963_] = aShortArray9189[i_1963_];
		} else
			class167_sub2_1944_.aShortArray9189 = aShortArray9189;
		if (Class347.method6004(i, anInt9185)) {
			if (class167_sub2_1945_.aClass337Array9212 == null || class167_sub2_1945_.aClass337Array9212.length < anInt9210) {
				int i_1964_ = anInt9210;
				class167_sub2_1944_.aClass337Array9212 = class167_sub2_1945_.aClass337Array9212 = new Class337[i_1964_];
				for (int i_1965_ = 0; i_1965_ < anInt9210; i_1965_++)
					class167_sub2_1944_.aClass337Array9212[i_1965_] = aClass337Array9212[i_1965_].method5937();
			} else {
				class167_sub2_1944_.aClass337Array9212 = class167_sub2_1945_.aClass337Array9212;
				for (int i_1966_ = 0; i_1966_ < anInt9210; i_1966_++)
					class167_sub2_1944_.aClass337Array9212[i_1966_].method5936(aClass337Array9212[i_1966_]);
			}
		} else
			class167_sub2_1944_.aClass337Array9212 = aClass337Array9212;
		class167_sub2_1944_.aClass371Array9211 = aClass371Array9211;
		if (aBool9215) {
			class167_sub2_1944_.anInt9192 = anInt9192;
			class167_sub2_1944_.anInt9193 = anInt9193;
			class167_sub2_1944_.anInt9197 = anInt9197;
			class167_sub2_1944_.anInt9165 = anInt9165;
			class167_sub2_1944_.anInt9195 = anInt9195;
			class167_sub2_1944_.anInt9196 = anInt9196;
			class167_sub2_1944_.anInt9154 = anInt9154;
			class167_sub2_1944_.anInt9200 = anInt9200;
			class167_sub2_1944_.aBool9215 = true;
		} else
			class167_sub2_1944_.aBool9215 = false;
		if (aBool9201) {
			class167_sub2_1944_.anInt9202 = anInt9202;
			class167_sub2_1944_.aBool9201 = true;
		} else
			class167_sub2_1944_.aBool9201 = false;
		class167_sub2_1944_.anIntArrayArray9190 = anIntArrayArray9190;
		class167_sub2_1944_.anIntArrayArray9181 = anIntArrayArray9181;
		class167_sub2_1944_.anIntArrayArray9213 = anIntArrayArray9213;
		class167_sub2_1944_.aShortArray9207 = aShortArray9207;
		class167_sub2_1944_.anIntArray9199 = anIntArray9199;
		class167_sub2_1944_.aShortArray9166 = aShortArray9166;
		class167_sub2_1944_.aShortArray9178 = aShortArray9178;
		class167_sub2_1944_.aShortArray9162 = aShortArray9162;
		class167_sub2_1944_.aShortArray9170 = aShortArray9170;
		class167_sub2_1944_.anIntArray9203 = anIntArray9203;
		class167_sub2_1944_.anIntArray9205 = anIntArray9205;
		class167_sub2_1944_.anIntArray9204 = anIntArray9204;
		class167_sub2_1944_.aClass184Array9208 = aClass184Array9208;
		class167_sub2_1944_.aClass143Array9209 = aClass143Array9209;
		return class167_sub2_1944_;
	}

	Class167 method14586(Class167_Sub2 class167_sub2_1967_, Class167_Sub2 class167_sub2_1968_, int i, boolean bool, boolean bool_1969_) {
		class167_sub2_1967_.anInt9152 = i;
		class167_sub2_1967_.anInt9185 = anInt9185;
		class167_sub2_1967_.aShort9149 = aShort9149;
		class167_sub2_1967_.aShort9206 = aShort9206;
		class167_sub2_1967_.anInt9156 = anInt9156;
		class167_sub2_1967_.anInt9157 = anInt9157;
		class167_sub2_1967_.anInt9163 = anInt9163;
		class167_sub2_1967_.anInt9155 = anInt9155;
		class167_sub2_1967_.anInt9174 = anInt9174;
		class167_sub2_1967_.anInt9210 = anInt9210;
		if ((i & 0x100) != 0)
			class167_sub2_1967_.aBool9184 = true;
		else
			class167_sub2_1967_.aBool9184 = aBool9184;
		class167_sub2_1967_.aBool9191 = aBool9191;
		boolean bool_1970_ = Class347.method6013(i, anInt9185);
		boolean bool_1971_ = Class347.method6085(i, anInt9185);
		boolean bool_1972_ = Class347.method5996(i, anInt9185);
		boolean bool_1973_ = bool_1970_ | bool_1971_ | bool_1972_;
		if (bool_1973_) {
			if (bool_1970_) {
				if (class167_sub2_1968_.anIntArray9158 == null || class167_sub2_1968_.anIntArray9158.length < anInt9156)
					class167_sub2_1967_.anIntArray9158 = class167_sub2_1968_.anIntArray9158 = new int[anInt9156];
				else
					class167_sub2_1967_.anIntArray9158 = class167_sub2_1968_.anIntArray9158;
			} else
				class167_sub2_1967_.anIntArray9158 = anIntArray9158;
			if (bool_1971_) {
				if (class167_sub2_1968_.anIntArray9159 == null || class167_sub2_1968_.anIntArray9159.length < anInt9156)
					class167_sub2_1967_.anIntArray9159 = class167_sub2_1968_.anIntArray9159 = new int[anInt9156];
				else
					class167_sub2_1967_.anIntArray9159 = class167_sub2_1968_.anIntArray9159;
			} else
				class167_sub2_1967_.anIntArray9159 = anIntArray9159;
			if (bool_1972_) {
				if (class167_sub2_1968_.anIntArray9160 == null || class167_sub2_1968_.anIntArray9160.length < anInt9156)
					class167_sub2_1967_.anIntArray9160 = class167_sub2_1968_.anIntArray9160 = new int[anInt9156];
				else
					class167_sub2_1967_.anIntArray9160 = class167_sub2_1968_.anIntArray9160;
			} else
				class167_sub2_1967_.anIntArray9160 = anIntArray9160;
			for (int i_1974_ = 0; i_1974_ < anInt9156; i_1974_++) {
				if (bool_1970_)
					class167_sub2_1967_.anIntArray9158[i_1974_] = anIntArray9158[i_1974_];
				if (bool_1971_)
					class167_sub2_1967_.anIntArray9159[i_1974_] = anIntArray9159[i_1974_];
				if (bool_1972_)
					class167_sub2_1967_.anIntArray9160[i_1974_] = anIntArray9160[i_1974_];
			}
		} else {
			class167_sub2_1967_.anIntArray9158 = anIntArray9158;
			class167_sub2_1967_.anIntArray9159 = anIntArray9159;
			class167_sub2_1967_.anIntArray9160 = anIntArray9160;
		}
		if (Class347.method6011(i, anInt9185)) {
			class167_sub2_1967_.aClass357_9186 = class167_sub2_1968_.aClass357_9186;
			class167_sub2_1967_.aClass357_9186.anInterface36_3726 = aClass357_9186.anInterface36_3726;
			class167_sub2_1967_.aClass357_9186.aBool3725 = aClass357_9186.aBool3725;
			class167_sub2_1967_.aClass357_9186.aBool3724 = true;
		} else if (Class347.method6006(i, anInt9185))
			class167_sub2_1967_.aClass357_9186 = aClass357_9186;
		else
			class167_sub2_1967_.aClass357_9186 = null;
		if (Class347.method5999(i, anInt9185)) {
			if (class167_sub2_1968_.aShortArray9175 == null || class167_sub2_1968_.aShortArray9175.length < anInt9155)
				class167_sub2_1967_.aShortArray9175 = class167_sub2_1968_.aShortArray9175 = new short[anInt9155];
			else
				class167_sub2_1967_.aShortArray9175 = class167_sub2_1968_.aShortArray9175;
			for (int i_1975_ = 0; i_1975_ < anInt9155; i_1975_++)
				class167_sub2_1967_.aShortArray9175[i_1975_] = aShortArray9175[i_1975_];
		} else
			class167_sub2_1967_.aShortArray9175 = aShortArray9175;
		if (Class347.method5994(i, anInt9185)) {
			if (class167_sub2_1968_.aByteArray9176 == null || class167_sub2_1968_.aByteArray9176.length < anInt9155)
				class167_sub2_1967_.aByteArray9176 = class167_sub2_1968_.aByteArray9176 = new byte[anInt9155];
			else
				class167_sub2_1967_.aByteArray9176 = class167_sub2_1968_.aByteArray9176;
			for (int i_1976_ = 0; i_1976_ < anInt9155; i_1976_++)
				class167_sub2_1967_.aByteArray9176[i_1976_] = aByteArray9176[i_1976_];
		} else
			class167_sub2_1967_.aByteArray9176 = aByteArray9176;
		if (Class347.method6092(i, anInt9185)) {
			class167_sub2_1967_.aClass357_9150 = class167_sub2_1968_.aClass357_9150;
			class167_sub2_1967_.aClass357_9150.anInterface36_3726 = aClass357_9150.anInterface36_3726;
			class167_sub2_1967_.aClass357_9150.aBool3725 = aClass357_9150.aBool3725;
			class167_sub2_1967_.aClass357_9150.aBool3724 = true;
		} else if (Class347.method6008(i, anInt9185))
			class167_sub2_1967_.aClass357_9150 = aClass357_9150;
		else
			class167_sub2_1967_.aClass357_9150 = null;
		if (Class347.method5998(i, anInt9185)) {
			if (class167_sub2_1968_.aShortArray9164 == null || class167_sub2_1968_.aShortArray9164.length < anInt9163) {
				int i_1977_ = anInt9163;
				class167_sub2_1967_.aShortArray9164 = class167_sub2_1968_.aShortArray9164 = new short[i_1977_];
				class167_sub2_1967_.aShortArray9167 = class167_sub2_1968_.aShortArray9167 = new short[i_1977_];
				class167_sub2_1967_.aShortArray9168 = class167_sub2_1968_.aShortArray9168 = new short[i_1977_];
			} else {
				class167_sub2_1967_.aShortArray9164 = class167_sub2_1968_.aShortArray9164;
				class167_sub2_1967_.aShortArray9167 = class167_sub2_1968_.aShortArray9167;
				class167_sub2_1967_.aShortArray9168 = class167_sub2_1968_.aShortArray9168;
			}
			if (aClass367_9172 != null) {
				if (class167_sub2_1968_.aClass367_9172 == null)
					class167_sub2_1968_.aClass367_9172 = new Class367();
				Class367 class367 = (class167_sub2_1967_.aClass367_9172 = class167_sub2_1968_.aClass367_9172);
				if (class367.aShortArray3879 == null || class367.aShortArray3879.length < anInt9163) {
					int i_1978_ = anInt9163;
					class367.aShortArray3879 = new short[i_1978_];
					class367.aShortArray3877 = new short[i_1978_];
					class367.aShortArray3876 = new short[i_1978_];
					class367.aByteArray3878 = new byte[i_1978_];
				}
				for (int i_1979_ = 0; i_1979_ < anInt9163; i_1979_++) {
					class167_sub2_1967_.aShortArray9164[i_1979_] = aShortArray9164[i_1979_];
					class167_sub2_1967_.aShortArray9167[i_1979_] = aShortArray9167[i_1979_];
					class167_sub2_1967_.aShortArray9168[i_1979_] = aShortArray9168[i_1979_];
					class367.aShortArray3879[i_1979_] = aClass367_9172.aShortArray3879[i_1979_];
					class367.aShortArray3877[i_1979_] = aClass367_9172.aShortArray3877[i_1979_];
					class367.aShortArray3876[i_1979_] = aClass367_9172.aShortArray3876[i_1979_];
					class367.aByteArray3878[i_1979_] = aClass367_9172.aByteArray3878[i_1979_];
				}
			} else {
				class167_sub2_1967_.aClass367_9172 = null;
				for (int i_1980_ = 0; i_1980_ < anInt9163; i_1980_++) {
					class167_sub2_1967_.aShortArray9164[i_1980_] = aShortArray9164[i_1980_];
					class167_sub2_1967_.aShortArray9167[i_1980_] = aShortArray9167[i_1980_];
					class167_sub2_1967_.aShortArray9168[i_1980_] = aShortArray9168[i_1980_];
				}
			}
			class167_sub2_1967_.aByteArray9169 = aByteArray9169;
		} else {
			class167_sub2_1967_.aClass367_9172 = aClass367_9172;
			class167_sub2_1967_.aShortArray9164 = aShortArray9164;
			class167_sub2_1967_.aShortArray9167 = aShortArray9167;
			class167_sub2_1967_.aShortArray9168 = aShortArray9168;
			class167_sub2_1967_.aByteArray9169 = aByteArray9169;
		}
		if (Class347.method6012(i, anInt9185)) {
			class167_sub2_1967_.aClass357_9224 = class167_sub2_1968_.aClass357_9224;
			class167_sub2_1967_.aClass357_9224.anInterface36_3726 = aClass357_9224.anInterface36_3726;
			class167_sub2_1967_.aClass357_9224.aBool3725 = aClass357_9224.aBool3725;
			class167_sub2_1967_.aClass357_9224.aBool3724 = true;
		} else if (Class347.method6007(i, anInt9185))
			class167_sub2_1967_.aClass357_9224 = aClass357_9224;
		else
			class167_sub2_1967_.aClass357_9224 = null;
		if (Class347.method6047(i, anInt9185)) {
			if (class167_sub2_1968_.aFloatArray9194 == null || class167_sub2_1968_.aFloatArray9194.length < anInt9155) {
				int i_1981_ = anInt9163;
				class167_sub2_1967_.aFloatArray9194 = class167_sub2_1968_.aFloatArray9194 = new float[i_1981_];
				class167_sub2_1967_.aFloatArray9171 = class167_sub2_1968_.aFloatArray9171 = new float[i_1981_];
			} else {
				class167_sub2_1967_.aFloatArray9194 = class167_sub2_1968_.aFloatArray9194;
				class167_sub2_1967_.aFloatArray9171 = class167_sub2_1968_.aFloatArray9171;
			}
			for (int i_1982_ = 0; i_1982_ < anInt9163; i_1982_++) {
				class167_sub2_1967_.aFloatArray9194[i_1982_] = aFloatArray9194[i_1982_];
				class167_sub2_1967_.aFloatArray9171[i_1982_] = aFloatArray9171[i_1982_];
			}
		} else {
			class167_sub2_1967_.aFloatArray9194 = aFloatArray9194;
			class167_sub2_1967_.aFloatArray9171 = aFloatArray9171;
		}
		if (Class347.method6014(i, anInt9185)) {
			class167_sub2_1967_.aClass357_9187 = class167_sub2_1968_.aClass357_9187;
			class167_sub2_1967_.aClass357_9187.anInterface36_3726 = aClass357_9187.anInterface36_3726;
			class167_sub2_1967_.aClass357_9187.aBool3725 = aClass357_9187.aBool3725;
			class167_sub2_1967_.aClass357_9187.aBool3724 = true;
		} else if (Class347.method6009(i, anInt9185))
			class167_sub2_1967_.aClass357_9187 = aClass357_9187;
		else
			class167_sub2_1967_.aClass357_9187 = null;
		if (Class347.method6081(i, anInt9185)) {
			if (class167_sub2_1968_.aShortArray9161 == null || class167_sub2_1968_.aShortArray9161.length < anInt9155) {
				int i_1983_ = anInt9155;
				class167_sub2_1967_.aShortArray9161 = class167_sub2_1968_.aShortArray9161 = new short[i_1983_];
				class167_sub2_1967_.aShortArray9217 = class167_sub2_1968_.aShortArray9217 = new short[i_1983_];
				class167_sub2_1967_.aShortArray9179 = class167_sub2_1968_.aShortArray9179 = new short[i_1983_];
			} else {
				class167_sub2_1967_.aShortArray9161 = class167_sub2_1968_.aShortArray9161;
				class167_sub2_1967_.aShortArray9217 = class167_sub2_1968_.aShortArray9217;
				class167_sub2_1967_.aShortArray9179 = class167_sub2_1968_.aShortArray9179;
			}
			for (int i_1984_ = 0; i_1984_ < anInt9155; i_1984_++) {
				class167_sub2_1967_.aShortArray9161[i_1984_] = aShortArray9161[i_1984_];
				class167_sub2_1967_.aShortArray9217[i_1984_] = aShortArray9217[i_1984_];
				class167_sub2_1967_.aShortArray9179[i_1984_] = aShortArray9179[i_1984_];
			}
		} else {
			class167_sub2_1967_.aShortArray9161 = aShortArray9161;
			class167_sub2_1967_.aShortArray9217 = aShortArray9217;
			class167_sub2_1967_.aShortArray9179 = aShortArray9179;
		}
		if (Class347.method6015(i, anInt9185)) {
			class167_sub2_1967_.aClass336_9183 = class167_sub2_1968_.aClass336_9183;
			class167_sub2_1967_.aClass336_9183.anInterface40_3561 = aClass336_9183.anInterface40_3561;
			class167_sub2_1967_.aClass336_9183.aBool3564 = aClass336_9183.aBool3564;
			class167_sub2_1967_.aClass336_9183.aBool3563 = true;
		} else if (Class347.method6010(i, anInt9185))
			class167_sub2_1967_.aClass336_9183 = aClass336_9183;
		else
			class167_sub2_1967_.aClass336_9183 = null;
		if (Class347.method6003(i, anInt9185)) {
			if (class167_sub2_1968_.aShortArray9189 == null || class167_sub2_1968_.aShortArray9189.length < anInt9155) {
				int i_1985_ = anInt9155;
				class167_sub2_1967_.aShortArray9189 = class167_sub2_1968_.aShortArray9189 = new short[i_1985_];
			} else
				class167_sub2_1967_.aShortArray9189 = class167_sub2_1968_.aShortArray9189;
			for (int i_1986_ = 0; i_1986_ < anInt9155; i_1986_++)
				class167_sub2_1967_.aShortArray9189[i_1986_] = aShortArray9189[i_1986_];
		} else
			class167_sub2_1967_.aShortArray9189 = aShortArray9189;
		if (Class347.method6004(i, anInt9185)) {
			if (class167_sub2_1968_.aClass337Array9212 == null || class167_sub2_1968_.aClass337Array9212.length < anInt9210) {
				int i_1987_ = anInt9210;
				class167_sub2_1967_.aClass337Array9212 = class167_sub2_1968_.aClass337Array9212 = new Class337[i_1987_];
				for (int i_1988_ = 0; i_1988_ < anInt9210; i_1988_++)
					class167_sub2_1967_.aClass337Array9212[i_1988_] = aClass337Array9212[i_1988_].method5937();
			} else {
				class167_sub2_1967_.aClass337Array9212 = class167_sub2_1968_.aClass337Array9212;
				for (int i_1989_ = 0; i_1989_ < anInt9210; i_1989_++)
					class167_sub2_1967_.aClass337Array9212[i_1989_].method5936(aClass337Array9212[i_1989_]);
			}
		} else
			class167_sub2_1967_.aClass337Array9212 = aClass337Array9212;
		class167_sub2_1967_.aClass371Array9211 = aClass371Array9211;
		if (aBool9215) {
			class167_sub2_1967_.anInt9192 = anInt9192;
			class167_sub2_1967_.anInt9193 = anInt9193;
			class167_sub2_1967_.anInt9197 = anInt9197;
			class167_sub2_1967_.anInt9165 = anInt9165;
			class167_sub2_1967_.anInt9195 = anInt9195;
			class167_sub2_1967_.anInt9196 = anInt9196;
			class167_sub2_1967_.anInt9154 = anInt9154;
			class167_sub2_1967_.anInt9200 = anInt9200;
			class167_sub2_1967_.aBool9215 = true;
		} else
			class167_sub2_1967_.aBool9215 = false;
		if (aBool9201) {
			class167_sub2_1967_.anInt9202 = anInt9202;
			class167_sub2_1967_.aBool9201 = true;
		} else
			class167_sub2_1967_.aBool9201 = false;
		class167_sub2_1967_.anIntArrayArray9190 = anIntArrayArray9190;
		class167_sub2_1967_.anIntArrayArray9181 = anIntArrayArray9181;
		class167_sub2_1967_.anIntArrayArray9213 = anIntArrayArray9213;
		class167_sub2_1967_.aShortArray9207 = aShortArray9207;
		class167_sub2_1967_.anIntArray9199 = anIntArray9199;
		class167_sub2_1967_.aShortArray9166 = aShortArray9166;
		class167_sub2_1967_.aShortArray9178 = aShortArray9178;
		class167_sub2_1967_.aShortArray9162 = aShortArray9162;
		class167_sub2_1967_.aShortArray9170 = aShortArray9170;
		class167_sub2_1967_.anIntArray9203 = anIntArray9203;
		class167_sub2_1967_.anIntArray9205 = anIntArray9205;
		class167_sub2_1967_.anIntArray9204 = anIntArray9204;
		class167_sub2_1967_.aClass184Array9208 = aClass184Array9208;
		class167_sub2_1967_.aClass143Array9209 = aClass143Array9209;
		return class167_sub2_1967_;
	}

	boolean method2816() {
		if (anIntArrayArray9190 == null)
			return false;
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] <<= 4;
			anIntArray9159[i] <<= 4;
			anIntArray9160[i] <<= 4;
		}
		anInt9221 = 0;
		anInt9222 = 0;
		anInt9151 = 0;
		return true;
	}

	public void method2680() {
		if (!aBool9201) {
			if (!aBool9215)
				method14569();
			anInt9202 = anInt9195;
			aBool9201 = true;
		}
	}

	void method14587() {
		if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method14588() {
		if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method14589() {
		if (aClass357_9186 != null)
			aClass357_9186.method6275();
		if (aClass357_9187 != null)
			aClass357_9187.method6275();
		if (aClass357_9150 != null)
			aClass357_9150.method6275();
		if (aClass357_9224 != null)
			aClass357_9224.method6275();
		if (aClass336_9183 != null)
			aClass336_9183.method5931();
	}

	public void method2790() {
		if (!aBool9201) {
			if (!aBool9215)
				method14569();
			anInt9202 = anInt9195;
			aBool9201 = true;
		}
	}

	void method14590() {
		if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	public int method2722() {
		return aShort9149;
	}

	public void method2805(Class167 class167, int i, int i_1990_, int i_1991_, boolean bool) {
		Class167_Sub2 class167_sub2_1992_ = (Class167_Sub2) class167;
		if (anInt9155 != 0 && class167_sub2_1992_.anInt9155 != 0) {
			int i_1993_ = class167_sub2_1992_.anInt9157;
			int[] is = class167_sub2_1992_.anIntArray9158;
			int[] is_1994_ = class167_sub2_1992_.anIntArray9159;
			int[] is_1995_ = class167_sub2_1992_.anIntArray9160;
			short[] is_1996_ = class167_sub2_1992_.aShortArray9164;
			short[] is_1997_ = class167_sub2_1992_.aShortArray9167;
			short[] is_1998_ = class167_sub2_1992_.aShortArray9168;
			byte[] is_1999_ = class167_sub2_1992_.aByteArray9169;
			short[] is_2000_;
			short[] is_2001_;
			short[] is_2002_;
			byte[] is_2003_;
			if (aClass367_9172 != null) {
				is_2000_ = aClass367_9172.aShortArray3879;
				is_2001_ = aClass367_9172.aShortArray3877;
				is_2002_ = aClass367_9172.aShortArray3876;
				is_2003_ = aClass367_9172.aByteArray3878;
			} else {
				is_2000_ = null;
				is_2001_ = null;
				is_2002_ = null;
				is_2003_ = null;
			}
			short[] is_2004_;
			short[] is_2005_;
			short[] is_2006_;
			byte[] is_2007_;
			if (class167_sub2_1992_.aClass367_9172 != null) {
				is_2004_ = class167_sub2_1992_.aClass367_9172.aShortArray3879;
				is_2005_ = class167_sub2_1992_.aClass367_9172.aShortArray3877;
				is_2006_ = class167_sub2_1992_.aClass367_9172.aShortArray3876;
				is_2007_ = class167_sub2_1992_.aClass367_9172.aByteArray3878;
			} else {
				is_2004_ = null;
				is_2005_ = null;
				is_2006_ = null;
				is_2007_ = null;
			}
			int[] is_2008_ = class167_sub2_1992_.anIntArray9199;
			short[] is_2009_ = class167_sub2_1992_.aShortArray9207;
			if (!class167_sub2_1992_.aBool9215)
				class167_sub2_1992_.method14569();
			int i_2010_ = class167_sub2_1992_.anInt9195;
			int i_2011_ = class167_sub2_1992_.anInt9196;
			int i_2012_ = class167_sub2_1992_.anInt9197;
			int i_2013_ = class167_sub2_1992_.anInt9165;
			int i_2014_ = class167_sub2_1992_.anInt9154;
			int i_2015_ = class167_sub2_1992_.anInt9200;
			for (int i_2016_ = 0; i_2016_ < anInt9157; i_2016_++) {
				int i_2017_ = anIntArray9159[i_2016_] - i_1990_;
				if (i_2017_ >= i_2010_ && i_2017_ <= i_2011_) {
					int i_2018_ = anIntArray9158[i_2016_] - i;
					if (i_2018_ >= i_2012_ && i_2018_ <= i_2013_) {
						int i_2019_ = anIntArray9160[i_2016_] - i_1991_;
						if (i_2019_ >= i_2014_ && i_2019_ <= i_2015_) {
							int i_2020_ = -1;
							int i_2021_ = anIntArray9199[i_2016_];
							int i_2022_ = anIntArray9199[i_2016_ + 1];
							for (int i_2023_ = i_2021_; (i_2023_ < i_2022_ && aShortArray9207[i_2023_] != 0); i_2023_++) {
								i_2020_ = (aShortArray9207[i_2023_] & 0xffff) - 1;
								if (aByteArray9169[i_2020_] != 0)
									break;
							}
							if (i_2020_ != -1) {
								for (int i_2024_ = 0; i_2024_ < i_1993_; i_2024_++) {
									if (i_2018_ == is[i_2024_] && i_2019_ == is_1995_[i_2024_] && i_2017_ == is_1994_[i_2024_]) {
										int i_2025_ = -1;
										i_2021_ = is_2008_[i_2024_];
										i_2022_ = is_2008_[i_2024_ + 1];
										for (int i_2026_ = i_2021_; (i_2026_ < i_2022_ && is_2009_[i_2026_] != 0); i_2026_++) {
											i_2025_ = (is_2009_[i_2026_] - 1 & 0xffff);
											if (is_1999_[i_2025_] != 0)
												break;
										}
										if (i_2025_ != -1) {
											if (is_2000_ == null) {
												aClass367_9172 = new Class367();
												is_2000_ = aClass367_9172.aShortArray3879 = (Class246.method4386(aShortArray9164, -704738975));
												is_2001_ = aClass367_9172.aShortArray3877 = (Class246.method4386(aShortArray9167, -2050574431));
												is_2002_ = aClass367_9172.aShortArray3876 = (Class246.method4386(aShortArray9168, -1083256639));
												is_2003_ = aClass367_9172.aByteArray3878 = (Class60.method1408(aByteArray9169, -1031150368));
											}
											if (is_2004_ == null) {
												Class367 class367 = (class167_sub2_1992_.aClass367_9172 = new Class367());
												is_2004_ = class367.aShortArray3879 = (Class246.method4386(is_1996_, -285432624));
												is_2005_ = class367.aShortArray3877 = (Class246.method4386(is_1997_, -1770466396));
												is_2006_ = class367.aShortArray3876 = (Class246.method4386(is_1998_, 392741342));
												is_2007_ = class367.aByteArray3878 = (Class60.method1408(is_1999_, -1157429194));
											}
											short i_2027_ = aShortArray9164[i_2020_];
											short i_2028_ = aShortArray9167[i_2020_];
											short i_2029_ = aShortArray9168[i_2020_];
											byte i_2030_ = aByteArray9169[i_2020_];
											i_2021_ = is_2008_[i_2024_];
											i_2022_ = is_2008_[i_2024_ + 1];
											for (int i_2031_ = i_2021_; i_2031_ < i_2022_; i_2031_++) {
												int i_2032_ = is_2009_[i_2031_] - 1;
												if (i_2032_ == -1)
													break;
												if (is_2007_[i_2032_] != 0) {
													is_2004_[i_2032_] += i_2027_;
													is_2005_[i_2032_] += i_2028_;
													is_2006_[i_2032_] += i_2029_;
													is_2007_[i_2032_] += i_2030_;
												}
											}
											i_2027_ = is_1996_[i_2025_];
											i_2028_ = is_1997_[i_2025_];
											i_2029_ = is_1998_[i_2025_];
											i_2030_ = is_1999_[i_2025_];
											i_2021_ = anIntArray9199[i_2016_];
											i_2022_ = anIntArray9199[i_2016_ + 1];
											for (int i_2033_ = i_2021_; (i_2033_ < i_2022_ && (aShortArray9207[i_2033_] != 0)); i_2033_++) {
												int i_2034_ = (aShortArray9207[i_2033_] & 0xffff) - 1;
												if (is_2003_[i_2034_] != 0) {
													is_2000_[i_2034_] += i_2027_;
													is_2001_[i_2034_] += i_2028_;
													is_2002_[i_2034_] += i_2029_;
													is_2003_[i_2034_] += i_2030_;
												}
											}
											class167_sub2_1992_.method14548();
											method14548();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	void method14591() {
		if ((anInt9185 & 0x37) != 0) {
			if (aClass357_9224 != null)
				aClass357_9224.aBool3725 = false;
		} else if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	void method14592() {
		if (aClass336_9183 != null)
			aClass336_9183.aBool3564 = false;
	}

	void method14593() {
		if (aClass336_9183 != null)
			aClass336_9183.aBool3564 = false;
	}

	public void method2735(Class167 class167, int i, int i_2035_, int i_2036_, boolean bool) {
		Class167_Sub2 class167_sub2_2037_ = (Class167_Sub2) class167;
		if (anInt9155 != 0 && class167_sub2_2037_.anInt9155 != 0) {
			int i_2038_ = class167_sub2_2037_.anInt9157;
			int[] is = class167_sub2_2037_.anIntArray9158;
			int[] is_2039_ = class167_sub2_2037_.anIntArray9159;
			int[] is_2040_ = class167_sub2_2037_.anIntArray9160;
			short[] is_2041_ = class167_sub2_2037_.aShortArray9164;
			short[] is_2042_ = class167_sub2_2037_.aShortArray9167;
			short[] is_2043_ = class167_sub2_2037_.aShortArray9168;
			byte[] is_2044_ = class167_sub2_2037_.aByteArray9169;
			short[] is_2045_;
			short[] is_2046_;
			short[] is_2047_;
			byte[] is_2048_;
			if (aClass367_9172 != null) {
				is_2045_ = aClass367_9172.aShortArray3879;
				is_2046_ = aClass367_9172.aShortArray3877;
				is_2047_ = aClass367_9172.aShortArray3876;
				is_2048_ = aClass367_9172.aByteArray3878;
			} else {
				is_2045_ = null;
				is_2046_ = null;
				is_2047_ = null;
				is_2048_ = null;
			}
			short[] is_2049_;
			short[] is_2050_;
			short[] is_2051_;
			byte[] is_2052_;
			if (class167_sub2_2037_.aClass367_9172 != null) {
				is_2049_ = class167_sub2_2037_.aClass367_9172.aShortArray3879;
				is_2050_ = class167_sub2_2037_.aClass367_9172.aShortArray3877;
				is_2051_ = class167_sub2_2037_.aClass367_9172.aShortArray3876;
				is_2052_ = class167_sub2_2037_.aClass367_9172.aByteArray3878;
			} else {
				is_2049_ = null;
				is_2050_ = null;
				is_2051_ = null;
				is_2052_ = null;
			}
			int[] is_2053_ = class167_sub2_2037_.anIntArray9199;
			short[] is_2054_ = class167_sub2_2037_.aShortArray9207;
			if (!class167_sub2_2037_.aBool9215)
				class167_sub2_2037_.method14569();
			int i_2055_ = class167_sub2_2037_.anInt9195;
			int i_2056_ = class167_sub2_2037_.anInt9196;
			int i_2057_ = class167_sub2_2037_.anInt9197;
			int i_2058_ = class167_sub2_2037_.anInt9165;
			int i_2059_ = class167_sub2_2037_.anInt9154;
			int i_2060_ = class167_sub2_2037_.anInt9200;
			for (int i_2061_ = 0; i_2061_ < anInt9157; i_2061_++) {
				int i_2062_ = anIntArray9159[i_2061_] - i_2035_;
				if (i_2062_ >= i_2055_ && i_2062_ <= i_2056_) {
					int i_2063_ = anIntArray9158[i_2061_] - i;
					if (i_2063_ >= i_2057_ && i_2063_ <= i_2058_) {
						int i_2064_ = anIntArray9160[i_2061_] - i_2036_;
						if (i_2064_ >= i_2059_ && i_2064_ <= i_2060_) {
							int i_2065_ = -1;
							int i_2066_ = anIntArray9199[i_2061_];
							int i_2067_ = anIntArray9199[i_2061_ + 1];
							for (int i_2068_ = i_2066_; (i_2068_ < i_2067_ && aShortArray9207[i_2068_] != 0); i_2068_++) {
								i_2065_ = (aShortArray9207[i_2068_] & 0xffff) - 1;
								if (aByteArray9169[i_2065_] != 0)
									break;
							}
							if (i_2065_ != -1) {
								for (int i_2069_ = 0; i_2069_ < i_2038_; i_2069_++) {
									if (i_2063_ == is[i_2069_] && i_2064_ == is_2040_[i_2069_] && i_2062_ == is_2039_[i_2069_]) {
										int i_2070_ = -1;
										i_2066_ = is_2053_[i_2069_];
										i_2067_ = is_2053_[i_2069_ + 1];
										for (int i_2071_ = i_2066_; (i_2071_ < i_2067_ && is_2054_[i_2071_] != 0); i_2071_++) {
											i_2070_ = (is_2054_[i_2071_] - 1 & 0xffff);
											if (is_2044_[i_2070_] != 0)
												break;
										}
										if (i_2070_ != -1) {
											if (is_2045_ == null) {
												aClass367_9172 = new Class367();
												is_2045_ = aClass367_9172.aShortArray3879 = (Class246.method4386(aShortArray9164, -2009961894));
												is_2046_ = aClass367_9172.aShortArray3877 = (Class246.method4386(aShortArray9167, 10425006));
												is_2047_ = aClass367_9172.aShortArray3876 = (Class246.method4386(aShortArray9168, -525854451));
												is_2048_ = aClass367_9172.aByteArray3878 = (Class60.method1408(aByteArray9169, -638601101));
											}
											if (is_2049_ == null) {
												Class367 class367 = (class167_sub2_2037_.aClass367_9172 = new Class367());
												is_2049_ = class367.aShortArray3879 = (Class246.method4386(is_2041_, 374611724));
												is_2050_ = class367.aShortArray3877 = (Class246.method4386(is_2042_, -1869919032));
												is_2051_ = class367.aShortArray3876 = (Class246.method4386(is_2043_, -55701628));
												is_2052_ = class367.aByteArray3878 = (Class60.method1408(is_2044_, -1300135124));
											}
											short i_2072_ = aShortArray9164[i_2065_];
											short i_2073_ = aShortArray9167[i_2065_];
											short i_2074_ = aShortArray9168[i_2065_];
											byte i_2075_ = aByteArray9169[i_2065_];
											i_2066_ = is_2053_[i_2069_];
											i_2067_ = is_2053_[i_2069_ + 1];
											for (int i_2076_ = i_2066_; i_2076_ < i_2067_; i_2076_++) {
												int i_2077_ = is_2054_[i_2076_] - 1;
												if (i_2077_ == -1)
													break;
												if (is_2052_[i_2077_] != 0) {
													is_2049_[i_2077_] += i_2072_;
													is_2050_[i_2077_] += i_2073_;
													is_2051_[i_2077_] += i_2074_;
													is_2052_[i_2077_] += i_2075_;
												}
											}
											i_2072_ = is_2041_[i_2070_];
											i_2073_ = is_2042_[i_2070_];
											i_2074_ = is_2043_[i_2070_];
											i_2075_ = is_2044_[i_2070_];
											i_2066_ = anIntArray9199[i_2061_];
											i_2067_ = anIntArray9199[i_2061_ + 1];
											for (int i_2078_ = i_2066_; (i_2078_ < i_2067_ && (aShortArray9207[i_2078_] != 0)); i_2078_++) {
												int i_2079_ = (aShortArray9207[i_2078_] & 0xffff) - 1;
												if (is_2048_[i_2079_] != 0) {
													is_2045_[i_2079_] += i_2072_;
													is_2046_[i_2079_] += i_2073_;
													is_2047_[i_2079_] += i_2074_;
													is_2048_[i_2079_] += i_2075_;
												}
											}
											class167_sub2_2037_.method14548();
											method14548();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2786(Class435 class435) {
		Class441 class441 = aClass178_Sub2_9153.aClass441_9560;
		class441.method7090(class435);
		if (aClass184Array9208 != null) {
			for (int i = 0; i < aClass184Array9208.length; i++) {
				Class184 class184 = aClass184Array9208[i];
				Class184 class184_2080_ = class184;
				if (class184.aClass184_2111 != null)
					class184_2080_ = class184.aClass184_2111;
				class184_2080_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9158[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9159[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_2080_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_2080_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_2080_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_2080_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_2080_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_2080_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_2080_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9158[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9159[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_2080_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9209 != null) {
			for (int i = 0; i < aClass143Array9209.length; i++) {
				Class143 class143 = aClass143Array9209[i];
				Class143 class143_2081_ = class143;
				if (class143.aClass143_1687 != null)
					class143_2081_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_2081_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9158[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9159[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_2081_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9158[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9159[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_2081_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9158[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9159[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9160[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	void method14594() {
		if (aClass336_9183 != null)
			aClass336_9183.aBool3564 = false;
	}

	public boolean method2727() {
		if (aShortArray9189 == null)
			return true;
		for (int i = 0; i < aShortArray9189.length; i++) {
			if (aShortArray9189[i] != -1 && !(aClass178_Sub2_9153.aClass349_9586.method6097(aClass178_Sub2_9153.aClass172_1916.method2895(aShortArray9189[i], -1581054780), -1)))
				return false;
		}
		return true;
	}

	void method2840() {
		/* empty */
	}

	void method14595(Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2) {
		if (anIntArray9219.length < anInt9163) {
			anIntArray9219 = new int[anInt9163];
			anIntArray9177 = new int[anInt9163];
		}
		for (int i = 0; i < anInt9157; i++) {
			int i_2082_ = (((anIntArray9158[i] - (anIntArray9159[i] * aClass178_Sub2_9153.anInt9624 >> 8)) >> aClass178_Sub2_9153.anInt9623) - class523_sub27_sub4_sub2.anInt12089);
			int i_2083_ = (((anIntArray9160[i] - (anIntArray9159[i] * aClass178_Sub2_9153.anInt9625 >> 8)) >> aClass178_Sub2_9153.anInt9623) - class523_sub27_sub4_sub2.anInt12090);
			int i_2084_ = anIntArray9199[i];
			int i_2085_ = anIntArray9199[i + 1];
			for (int i_2086_ = i_2084_; i_2086_ < i_2085_ && aShortArray9207[i_2086_] != 0; i_2086_++) {
				int i_2087_ = (aShortArray9207[i_2086_] & 0xffff) - 1;
				anIntArray9219[i_2087_] = i_2082_;
				anIntArray9177[i_2087_] = i_2083_;
			}
		}
		for (int i = 0; i < anInt9174; i++) {
			if (aByteArray9176 == null || aByteArray9176[i] <= 128) {
				int i_2088_ = aShortArray9161[i] & 0xffff;
				int i_2089_ = aShortArray9217[i] & 0xffff;
				int i_2090_ = aShortArray9179[i] & 0xffff;
				int i_2091_ = anIntArray9219[i_2088_];
				int i_2092_ = anIntArray9219[i_2089_];
				int i_2093_ = anIntArray9219[i_2090_];
				int i_2094_ = anIntArray9177[i_2088_];
				int i_2095_ = anIntArray9177[i_2089_];
				int i_2096_ = anIntArray9177[i_2090_];
				if (((i_2091_ - i_2092_) * (i_2095_ - i_2096_) - (i_2095_ - i_2094_) * (i_2093_ - i_2092_)) > 0)
					class523_sub27_sub4_sub2.method18546(i_2094_, i_2095_, i_2096_, i_2091_, i_2092_, i_2093_);
			}
		}
	}

	void method14596(Class435 class435) {
		if (anInt9174 != 0 && (method14561() && method14560())) {
			if (aClass343_9225 == null) {
				/* empty */
			}
			aClass178_Sub2_9153.method15043();
			aClass178_Sub2_9153.method14941();
			Class329 class329 = aClass178_Sub2_9153.aClass329_9642;
			aClass178_Sub2_9153.method15033(0, aClass357_9186.anInterface36_3726);
			aClass178_Sub2_9153.method15033(1, aClass357_9150.anInterface36_3726);
			aClass178_Sub2_9153.method15033(2, aClass357_9187.anInterface36_3726);
			aClass178_Sub2_9153.method15213(aClass336_9183.anInterface40_3561);
			aClass178_Sub2_9153.aClass441_9560.method7090(class435);
			class329.method5790(aClass178_Sub2_9153.aClass441_9560);
			class329.aClass441_3480.method7085();
			if (aClass178_Sub2_9153.aBool9656) {
				Class163 class163 = aClass178_Sub2_9153.method15017();
				class329.aClass429_3490.method6773(0.0F, 1.0F, 0.0F, (float) -aClass178_Sub2_9153.anInt9601);
				class329.aClass429_3490.method6766(3.0F / (float) ((class163.anInt1775) * -118212955));
				class329.aClass437_3479.method6972(((float) (class163.anInt1776 * -319632409 >> 16 & 0xff) / 255.0F), ((float) (class163.anInt1776 * -319632409 >> 8 & 0xff) / 255.0F), ((float) (class163.anInt1776 * -319632409 >> 0 & 0xff) / 255.0F));
			} else {
				class329.aClass429_3490.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3479.method6972(0.0F, 0.0F, 0.0F);
			}
			if (aClass178_Sub2_9153.anInt9663 > 0) {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 1.0F, -(aClass178_Sub2_9153.aFloat9683));
				class329.aClass437_3484.method6972(((float) (aClass178_Sub2_9153.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 0 & 0xff) / 255.0F));
				aClass178_Sub2_9153.aClass441_9560.method7090(class435);
				aClass178_Sub2_9153.aClass441_9560.method7124();
				class329.aClass429_3490.method6762(aClass178_Sub2_9153.aClass441_9560);
				aClass178_Sub2_9153.aClass441_9560.method7090(class435);
				aClass178_Sub2_9153.aClass441_9560.method7089(aClass178_Sub2_9153.aClass441_9629);
				aClass178_Sub2_9153.aClass441_9560.method7124();
				class329.aClass429_3486.method6762(aClass178_Sub2_9153.aClass441_9560);
				class329.aClass429_3486.method6766(1.0F / (aClass178_Sub2_9153.aFloat9681 - aClass178_Sub2_9153.aFloat9683));
			} else {
				class329.aClass429_3486.method6773(0.0F, 0.0F, 0.0F, 0.0F);
				class329.aClass437_3484.method6972(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9185 & 0x37) == 0) {
				aClass178_Sub2_9153.method15032(aClass178_Sub2_9153.aClass345_9695);
				if (aClass178_Sub2_9153.aBool9647)
					aClass178_Sub2_9153.method14982(false);
				for (int i = 0; i < anIntArray9204.length; i++) {
					int i_2097_ = anIntArray9203[i];
					int i_2098_ = anIntArray9203[i + 1];
					int i_2099_ = aShortArray9189[i_2097_];
					boolean bool = false;
					byte i_2100_ = 0;
					if (i_2099_ != -1) {
						Class177 class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_2099_ & 0xffff, -60363431);
						class329.anInterface37_3478 = aClass178_Sub2_9153.aClass349_9586.method6095(class177);
						bool = !Class164_Sub5.method15499(class177.aByte1905, (byte) 89);
						class329.aClass441_3480.aFloatArray4916[12] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1885 / 64.0F % 1.0F);
						class329.aClass441_3480.aFloatArray4916[13] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1886 / 64.0F % 1.0F);
						if (class177.aClass593_1884 == Class593.aClass593_7812)
							i_2100_ = class177.aByte1889;
					} else {
						class329.anInterface37_3478 = aClass178_Sub2_9153.anInterface37_9669;
						float[] fs = class329.aClass441_3480.aFloatArray4916;
						class329.aClass441_3480.aFloatArray4916[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass178_Sub2_9153.method15020(i_2100_);
					class329.anInt3493 = anIntArray9204[i];
					class329.anInt3494 = anIntArray9205[i];
					class329.anInt3481 = i_2097_ * 3;
					class329.anInt3496 = i_2098_ - i_2097_;
					class329.method5793(bool);
				}
			} else {
				aClass178_Sub2_9153.method15033(3, aClass357_9224.anInterface36_3726);
				aClass178_Sub2_9153.method15032(aClass178_Sub2_9153.aClass345_9568);
				Class435 class435_2101_ = aClass178_Sub2_9153.aClass435_9559;
				class435_2101_.method6803(class435);
				class435_2101_.method6857();
				int i = 0;
				if (aClass178_Sub2_9153.aBool9647)
					aClass178_Sub2_9153.method14982(true);
				else {
					class329.aClass437_3492.method6972(aClass178_Sub2_9153.aFloatArray9608[0], aClass178_Sub2_9153.aFloatArray9608[1], aClass178_Sub2_9153.aFloatArray9608[2]);
					class329.aClass437_3492.method6909(class435_2101_);
					class329.aClass437_3488.method6972((aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9689), (aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9614), (aClass178_Sub2_9153.aFloat9617 * aClass178_Sub2_9153.aFloat9704));
					class329.aClass437_3489.method6972((-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9689), (-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9614), (-aClass178_Sub2_9153.aFloat9618 * aClass178_Sub2_9153.aFloat9704));
					class329.aClass437_3491.method6972((aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9689), (aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9614), (aClass178_Sub2_9153.aFloat9643 * aClass178_Sub2_9153.aFloat9704));
					if (aClass178_Sub2_9153.anInt9620 > 0) {
						i = aClass178_Sub2_9153.anInt9620;
						Class437 class437 = aClass178_Sub2_9153.aClass437_9562;
						for (int i_2102_ = 0; i_2102_ < i; i_2102_++) {
							Class523_Sub20 class523_sub20 = (aClass178_Sub2_9153.aClass523_Sub20Array9671[i_2102_]);
							int i_2103_ = class523_sub20.method16067(856453637);
							class437.method6886(class523_sub20.aClass437_10497);
							class437.method6908(class435_2101_);
							class329.aFloatArray3477[i_2102_ * 4 + 0] = class437.aFloat4903;
							class329.aFloatArray3477[i_2102_ * 4 + 1] = class437.aFloat4904;
							class329.aFloatArray3477[i_2102_ * 4 + 2] = class437.aFloat4905;
							class329.aFloatArray3477[i_2102_ * 4 + 3] = 1.0F / (float) (class523_sub20.method16066(-1879460461) * (class523_sub20.method16066(-1879460461)));
							float f = (class523_sub20.method16068((byte) 0) / 255.0F);
							class329.aFloatArray3476[i_2102_ * 4 + 0] = (float) (i_2103_ >> 16 & 0xff) * f;
							class329.aFloatArray3476[i_2102_ * 4 + 1] = (float) (i_2103_ >> 8 & 0xff) * f;
							class329.aFloatArray3476[i_2102_ * 4 + 2] = (float) (i_2103_ & 0xff) * f;
							class329.aFloatArray3476[i_2102_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_2104_ = 0; i_2104_ < anIntArray9204.length; i_2104_++) {
					int i_2105_ = anIntArray9203[i_2104_];
					int i_2106_ = anIntArray9203[i_2104_ + 1];
					int i_2107_ = aShortArray9189[i_2105_];
					byte i_2108_ = 11;
					Class177 class177 = null;
					byte i_2109_ = 0;
					if (i_2107_ != -1) {
						class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_2107_ & 0xffff, -141533859);
						class329.anInterface37_3478 = aClass178_Sub2_9153.aClass349_9586.method6095(class177);
						i_2108_ = class177.aByte1905;
						class329.method5792(class177.aByte1906);
						class329.aClass441_3480.aFloatArray4916[12] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1885 / 64.0F % 1.0F);
						class329.aClass441_3480.aFloatArray4916[13] = ((float) (aClass178_Sub2_9153.anInt9556 % 128000) / 1000.0F * (float) class177.aByte1886 / 64.0F % 1.0F);
						if (class177.aClass593_1884 == Class593.aClass593_7812)
							i_2109_ = class177.aByte1889;
					} else {
						class329.anInterface37_3478 = aClass178_Sub2_9153.anInterface37_9669;
						float[] fs = class329.aClass441_3480.aFloatArray4916;
						class329.aClass441_3480.aFloatArray4916[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass178_Sub2_9153.method15020(i_2109_);
					class329.anInt3493 = anIntArray9204[i_2104_];
					class329.anInt3494 = anIntArray9205[i_2104_];
					class329.anInt3481 = i_2105_ * 3;
					class329.anInt3496 = i_2106_ - i_2105_;
					switch (i_2108_) {
					case 5:
						if (!aClass178_Sub2_9153.aBool9647) {
							Class340_Sub1_Sub1 class340_sub1_sub1 = aClass178_Sub2_9153.aClass340_Sub1_Sub1_9696;
							class340_sub1_sub1.method17880(class177.aByte1906, (class177.anInt1865 * -2058069491), (byte) 73);
							class340_sub1_sub1.aClass441_11478.method7090(class435);
							class340_sub1_sub1.aClass441_11476.method7090(class435);
							class340_sub1_sub1.aClass441_11476.method7089(aClass178_Sub2_9153.aClass441_9575);
							class340_sub1_sub1.anInt11484 = anIntArray9204[i_2104_] * -1879255159;
							class340_sub1_sub1.anInt11470 = anIntArray9205[i_2104_] * -525411447;
							class340_sub1_sub1.anInt11486 = i_2105_ * 708813935;
							class340_sub1_sub1.anInt11487 = (i_2106_ - i_2105_) * -664263781;
							class340_sub1_sub1.method17879(-796199852);
						} else
							class329.method5817(i);
						break;
					case 1:
						class329.aClass437_3487.method6972((aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[14]));
						class329.aClass437_3487.method6908(class435_2101_);
						class329.method5795(i);
						break;
					case 6:
						class329.method5793(!Class164_Sub5.method15499(i_2108_, (byte) 89));
						break;
					case 7:
						class329.aClass437_3487.method6972((aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[12]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[13]), (aClass178_Sub2_9153.aClass441_9650.aFloatArray4916[14]));
						class329.aClass437_3487.method6908(class435_2101_);
						class329.aClass441_3474.method7090(class435);
						class329.anInterface39_3495 = aClass178_Sub2_9153.method14954();
						class329.method5807(i);
						break;
					default:
						class329.method5817(i);
					}
				}
			}
			method14600();
		}
	}

	void method2835() {
		for (int i = 0; i < anInt9156; i++) {
			anIntArray9158[i] = anIntArray9158[i] + 7 >> 4;
			anIntArray9159[i] = anIntArray9159[i] + 7 >> 4;
			anIntArray9160[i] = anIntArray9160[i] + 7 >> 4;
		}
		method14577();
		aBool9215 = false;
	}

	void method14597(Class441 class441) {
		if (aClass371Array9211 != null) {
			aClass178_Sub2_9153.method3287(!aBool9184);
			Class435 class435 = aClass178_Sub2_9153.aClass435_9559;
			Class326 class326 = aClass178_Sub2_9153.aClass326_9645;
			boolean bool = aClass178_Sub2_9153.anInt9663 > 0;
			if (bool)
				class326.aClass437_3461.method6972(((float) (aClass178_Sub2_9153.anInt9662 >> 16 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 8 & 0xff) / 255.0F), ((float) (aClass178_Sub2_9153.anInt9662 >> 0 & 0xff) / 255.0F));
			else
				class326.aClass437_3461.method6972(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9210; i++) {
				Class371 class371 = aClass371Array9211[i];
				Class337 class337 = aClass337Array9212[i];
				if (!class371.aBool3895 || !aClass178_Sub2_9153.method3146()) {
					float f = ((float) (anIntArray9158[class371.anInt3890] + anIntArray9158[class371.anInt3889] + anIntArray9158[class371.anInt3888]) * 0.3333333F);
					float f_2110_ = ((float) (anIntArray9159[class371.anInt3890] + anIntArray9159[class371.anInt3889] + anIntArray9159[class371.anInt3888]) * 0.3333333F);
					float f_2111_ = ((float) (anIntArray9160[class371.anInt3890] + anIntArray9160[class371.anInt3889] + anIntArray9160[class371.anInt3888]) * 0.3333333F);
					float f_2112_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_2110_ + class441.aFloatArray4916[8] * f_2111_ + class441.aFloatArray4916[12]);
					float f_2113_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_2110_ + class441.aFloatArray4916[9] * f_2111_ + class441.aFloatArray4916[13]);
					float f_2114_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_2110_ + class441.aFloatArray4916[10] * f_2111_ + class441.aFloatArray4916[14]);
					float f_2115_ = ((float) (1.0 / Math.sqrt((double) (f_2112_ * f_2112_ + f_2113_ * f_2113_ + (f_2114_ * f_2114_)))) * (float) class371.anInt3896);
					class435.method6856(class337.anInt3570, class337.anInt3566 * class371.aShort3892 >> 7, class337.anInt3567 * class371.aShort3893 >> 7, (f_2112_ + (float) class337.anInt3568 - f_2112_ * f_2115_), (f_2113_ + (float) class337.anInt3569 - f_2113_ * f_2115_), f_2114_ - f_2114_ * f_2115_);
					class435.method6820(aClass178_Sub2_9153.aClass435_9552);
					aClass178_Sub2_9153.aClass441_9561.method7090(class435);
					class326.method5742(aClass178_Sub2_9153.aClass441_9561);
					class326.aClass441_3457.method7085();
					class326.anInt3458 = class337.anInt3565;
					if (bool)
						class326.aFloat3462 = 1.0F - ((aClass178_Sub2_9153.aFloat9681 - f_2114_) / (aClass178_Sub2_9153.aFloat9681 - aClass178_Sub2_9153.aFloat9683));
					class326.anInterface37_3460 = null;
					if (class371.aShort3894 != -1)
						class326.anInterface37_3460 = (aClass178_Sub2_9153.aClass349_9586.method6095(aClass178_Sub2_9153.aClass172_1916.method2895(class371.aShort3894 & 0xffff, -1339335307)));
					class326.method5741(bool);
				}
			}
			aClass178_Sub2_9153.method3287(true);
		}
	}

	void method14598() {
		if (aClass357_9186 != null)
			aClass357_9186.method6275();
		if (aClass357_9187 != null)
			aClass357_9187.method6275();
		if (aClass357_9150 != null)
			aClass357_9150.method6275();
		if (aClass357_9224 != null)
			aClass357_9224.method6275();
		if (aClass336_9183 != null)
			aClass336_9183.method5931();
	}

	boolean method14599() {
		if (aClass336_9183.aBool3564)
			return true;
		if (aClass336_9183.anInterface40_3562 == null)
			aClass336_9183.anInterface40_3562 = aClass178_Sub2_9153.method15029(false);
		Interface40 interface40 = aClass336_9183.anInterface40_3562;
		interface40.method275(anInt9174 * 6);
		Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
		if (unsafe != null) {
			int i = anInt9174 * 6;
			long l = interface40.method274(0, i);
			if (l == 0L)
				return false;
			for (int i_2116_ = 0; i_2116_ < anInt9174; i_2116_++) {
				unsafe.putShort(l, aShortArray9161[i_2116_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9217[i_2116_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9179[i_2116_]);
				l += 2L;
			}
			interface40.method79();
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
		bytebuffer.clear();
		for (int i = 0; i < anInt9174; i++) {
			bytebuffer.putShort(aShortArray9161[i]);
			bytebuffer.putShort(aShortArray9217[i]);
			bytebuffer.putShort(aShortArray9179[i]);
		}
		if (interface40.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540)) {
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		return false;
	}

	void method14600() {
		if (aBool9182) {
			aBool9182 = false;
			if (aClass184Array9208 == null && aClass143Array9209 == null && aClass371Array9211 == null && !Class347.method6048(anInt9152, anInt9185)) {
				boolean bool = false;
				boolean bool_2117_ = false;
				boolean bool_2118_ = false;
				if (anIntArray9158 != null && !Class347.method6001(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool = true;
					} else
						aBool9182 = true;
				}
				if (anIntArray9159 != null && !Class347.method5993(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool_2117_ = true;
					} else
						aBool9182 = true;
				}
				if (anIntArray9160 != null && !Class347.method5997(anInt9152, anInt9185)) {
					if (aClass357_9186 == null || aClass357_9186.method6274()) {
						if (!aBool9215)
							method14569();
						bool_2118_ = true;
					} else
						aBool9182 = true;
				}
				if (bool)
					anIntArray9158 = null;
				if (bool_2117_)
					anIntArray9159 = null;
				if (bool_2118_)
					anIntArray9160 = null;
			}
			if (aShortArray9207 != null && anIntArray9158 == null && anIntArray9159 == null && anIntArray9160 == null) {
				aShortArray9207 = null;
				anIntArray9199 = null;
			}
			while_33_: do {
				if (aByteArray9169 != null && !Class347.method6030(anInt9152, anInt9185)) {
					do {
						if ((anInt9185 & 0x37) != 0) {
							if (aClass357_9224 != null && !aClass357_9224.method6274())
								break;
						} else if (aClass357_9150 != null && !aClass357_9150.method6274())
							break;
						aShortArray9168 = null;
						aShortArray9167 = null;
						aShortArray9164 = null;
						aByteArray9169 = null;
						break while_33_;
					} while (false);
					aBool9182 = true;
				}
			} while (false);
			if (aShortArray9175 != null && !Class347.method6019(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9175 = null;
				else
					aBool9182 = true;
			}
			if (aByteArray9176 != null && !Class347.method6076(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aByteArray9176 = null;
				else
					aBool9182 = true;
			}
			if (aFloatArray9194 != null && !Class347.method6022(anInt9152, anInt9185)) {
				if (aClass357_9187 == null || aClass357_9187.method6274()) {
					aFloatArray9171 = null;
					aFloatArray9194 = null;
				} else
					aBool9182 = true;
			}
			if (aShortArray9189 != null && !Class347.method6027(anInt9152, anInt9185)) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9189 = null;
				else
					aBool9182 = true;
			}
			if (aShortArray9161 != null && !Class347.method6026(anInt9152, anInt9185)) {
				if ((aClass336_9183 == null || aClass336_9183.method5933()) && (aClass357_9150 == null || aClass357_9150.method6274())) {
					aShortArray9179 = null;
					aShortArray9217 = null;
					aShortArray9161 = null;
				} else
					aBool9182 = true;
			}
			if (aShortArray9166 != null) {
				if (aClass357_9186 == null || aClass357_9186.method6274())
					aShortArray9166 = null;
				else
					aBool9182 = true;
			}
			if (aShortArray9178 != null) {
				if (aClass357_9150 == null || aClass357_9150.method6274())
					aShortArray9178 = null;
				else
					aBool9182 = true;
			}
			if (anIntArrayArray9181 != null && !Class347.method6023(anInt9152, anInt9185)) {
				anIntArrayArray9181 = null;
				aShortArray9170 = null;
			}
			if (anIntArrayArray9190 != null && !Class347.method6024(anInt9152, anInt9185)) {
				anIntArrayArray9190 = null;
				aShortArray9162 = null;
			}
			if (anIntArrayArray9213 != null && !Class347.method6065(anInt9152, anInt9185))
				anIntArrayArray9213 = null;
			if (anIntArray9203 != null && (anInt9152 & 0x800) == 0 && (anInt9152 & 0x40000) == 0) {
				anIntArray9203 = null;
				anIntArray9205 = null;
				anIntArray9204 = null;
			}
		}
	}

	boolean method14601() {
		if (aClass336_9183.aBool3564)
			return true;
		if (aClass336_9183.anInterface40_3562 == null)
			aClass336_9183.anInterface40_3562 = aClass178_Sub2_9153.method15029(false);
		Interface40 interface40 = aClass336_9183.anInterface40_3562;
		interface40.method275(anInt9174 * 6);
		Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
		if (unsafe != null) {
			int i = anInt9174 * 6;
			long l = interface40.method274(0, i);
			if (l == 0L)
				return false;
			for (int i_2119_ = 0; i_2119_ < anInt9174; i_2119_++) {
				unsafe.putShort(l, aShortArray9161[i_2119_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9217[i_2119_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9179[i_2119_]);
				l += 2L;
			}
			interface40.method79();
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
		bytebuffer.clear();
		for (int i = 0; i < anInt9174; i++) {
			bytebuffer.putShort(aShortArray9161[i]);
			bytebuffer.putShort(aShortArray9217[i]);
			bytebuffer.putShort(aShortArray9179[i]);
		}
		if (interface40.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540)) {
			aClass336_9183.anInterface40_3561 = interface40;
			aClass336_9183.aBool3564 = true;
			aBool9182 = true;
			return true;
		}
		return false;
	}

	boolean method14602() {
		boolean bool = !aClass357_9150.aBool3725;
		boolean bool_2120_ = (anInt9185 & 0x37) != 0 && !aClass357_9224.aBool3725;
		boolean bool_2121_ = !aClass357_9186.aBool3725;
		boolean bool_2122_ = !aClass357_9187.aBool3725;
		if (!bool_2121_ && !bool && !bool_2120_ && !bool_2122_)
			return true;
		boolean bool_2123_ = true;
		if (bool_2121_ && aShortArray9166 != null) {
			if (aClass357_9186.anInterface36_3727 == null)
				aClass357_9186.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9186.anInterface36_3727;
			interface36.method215(anInt9163 * 12, 12);
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 12;
				long l = interface36.method274(0, i);
				for (int i_2124_ = 0; i_2124_ < anInt9163; i_2124_++) {
					short i_2125_ = aShortArray9166[i_2124_];
					unsafe.putFloat(l, (float) anIntArray9158[i_2125_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9159[i_2125_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9160[i_2125_]);
					l += 4L;
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				for (int i = 0; i < anInt9163; i++) {
					bytebuffer.putFloat((float) anIntArray9158[aShortArray9166[i]]);
					bytebuffer.putFloat((float) anIntArray9159[aShortArray9166[i]]);
					bytebuffer.putFloat((float) anIntArray9160[aShortArray9166[i]]);
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9186.anInterface36_3726 = interface36;
			aClass357_9186.aBool3725 = true;
		}
		if (bool) {
			if (aClass357_9150.anInterface36_3727 == null)
				aClass357_9150.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9150.anInterface36_3727;
			interface36.method215(anInt9163 * 4, 4);
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 4;
				long l = interface36.method274(0, i);
				if ((anInt9185 & 0x37) == 0) {
					short[] is;
					short[] is_2126_;
					short[] is_2127_;
					byte[] is_2128_;
					if (aClass367_9172 != null) {
						is = aClass367_9172.aShortArray3879;
						is_2126_ = aClass367_9172.aShortArray3877;
						is_2127_ = aClass367_9172.aShortArray3876;
						is_2128_ = aClass367_9172.aByteArray3878;
					} else {
						is = aShortArray9164;
						is_2126_ = aShortArray9167;
						is_2127_ = aShortArray9168;
						is_2128_ = aByteArray9169;
					}
					float f = (aClass178_Sub2_9153.aFloat9617 * 768.0F / (float) aShort9206);
					float f_2129_ = (aClass178_Sub2_9153.aFloat9618 * 768.0F / (float) aShort9206);
					for (int i_2130_ = 0; i_2130_ < anInt9163; i_2130_++) {
						short i_2131_ = aShortArray9178[i_2130_];
						int i_2132_ = method14546(aShortArray9175[i_2131_] & 0xffff, aShortArray9189[i_2131_], aShort9149);
						float f_2133_ = ((float) (i_2132_ >> 16 & 0xff) * aClass178_Sub2_9153.aFloat9689);
						float f_2134_ = ((float) (i_2132_ >> 8 & 0xff) * aClass178_Sub2_9153.aFloat9614);
						float f_2135_ = ((float) (i_2132_ & 0xff) * aClass178_Sub2_9153.aFloat9704);
						byte i_2136_ = is_2128_[i_2130_];
						float f_2137_;
						if (i_2136_ == 0)
							f_2137_ = (((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i_2130_]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_2126_[i_2130_]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_2127_[i_2130_])) * 0.0026041667F);
						else
							f_2137_ = (((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i_2130_]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_2126_[i_2130_]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_2127_[i_2130_])) / ((float) i_2136_ * 256.0F));
						float f_2138_ = (aClass178_Sub2_9153.aFloat9643 + f_2137_ * (f_2137_ < 0.0F ? f_2129_ : f));
						int i_2139_ = (int) (f_2133_ * f_2138_);
						if (i_2139_ < 0)
							i_2139_ = 0;
						else if (i_2139_ > 255)
							i_2139_ = 255;
						int i_2140_ = (int) (f_2134_ * f_2138_);
						if (i_2140_ < 0)
							i_2140_ = 0;
						else if (i_2140_ > 255)
							i_2140_ = 255;
						int i_2141_ = (int) (f_2135_ * f_2138_);
						if (i_2141_ < 0)
							i_2141_ = 0;
						else if (i_2141_ > 255)
							i_2141_ = 255;
						unsafe.putInt(l, (255 - aByteArray9176[i_2131_] << 24 | i_2139_ << 16 | i_2140_ << 8 | i_2141_));
						l += 4L;
					}
				} else {
					for (int i_2142_ = 0; i_2142_ < anInt9163; i_2142_++) {
						short i_2143_ = aShortArray9178[i_2142_];
						int i_2144_ = (255 - aByteArray9176[i_2143_] << 24 | method14546(aShortArray9175[i_2143_] & 0xffff, aShortArray9189[i_2143_], aShort9149));
						unsafe.putInt(l, i_2144_);
						l += 4L;
					}
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				if ((anInt9185 & 0x37) == 0) {
					short[] is;
					short[] is_2145_;
					short[] is_2146_;
					byte[] is_2147_;
					if (aClass367_9172 != null) {
						is = aClass367_9172.aShortArray3879;
						is_2145_ = aClass367_9172.aShortArray3877;
						is_2146_ = aClass367_9172.aShortArray3876;
						is_2147_ = aClass367_9172.aByteArray3878;
					} else {
						is = aShortArray9164;
						is_2145_ = aShortArray9167;
						is_2146_ = aShortArray9168;
						is_2147_ = aByteArray9169;
					}
					float f = (aClass178_Sub2_9153.aFloat9617 * 768.0F / (float) aShort9206);
					float f_2148_ = (aClass178_Sub2_9153.aFloat9618 * 768.0F / (float) aShort9206);
					for (int i = 0; i < anInt9163; i++) {
						short i_2149_ = aShortArray9178[i];
						int i_2150_ = method14546(aShortArray9175[i_2149_] & 0xffff, aShortArray9189[i_2149_], aShort9149);
						float f_2151_ = ((float) (i_2150_ >> 16 & 0xff) * aClass178_Sub2_9153.aFloat9689);
						float f_2152_ = ((float) (i_2150_ >> 8 & 0xff) * aClass178_Sub2_9153.aFloat9614);
						float f_2153_ = ((float) (i_2150_ & 0xff) * aClass178_Sub2_9153.aFloat9704);
						byte i_2154_ = is_2147_[i];
						float f_2155_;
						if (i_2154_ == 0)
							f_2155_ = ((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_2145_[i]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_2146_[i])) * 0.0026041667F;
						else
							f_2155_ = (((aClass178_Sub2_9153.aFloatArray9608[0] * (float) is[i]) + (aClass178_Sub2_9153.aFloatArray9608[1] * (float) is_2145_[i]) + (aClass178_Sub2_9153.aFloatArray9608[2] * (float) is_2146_[i])) / ((float) i_2154_ * 256.0F));
						float f_2156_ = (aClass178_Sub2_9153.aFloat9643 + f_2155_ * (f_2155_ < 0.0F ? f_2148_ : f));
						int i_2157_ = (int) (f_2151_ * f_2156_);
						if (i_2157_ < 0)
							i_2157_ = 0;
						else if (i_2157_ > 255)
							i_2157_ = 255;
						int i_2158_ = (int) (f_2152_ * f_2156_);
						if (i_2158_ < 0)
							i_2158_ = 0;
						else if (i_2158_ > 255)
							i_2158_ = 255;
						int i_2159_ = (int) (f_2153_ * f_2156_);
						if (i_2159_ < 0)
							i_2159_ = 0;
						else if (i_2159_ > 255)
							i_2159_ = 255;
						bytebuffer.putInt(255 - aByteArray9176[i_2149_] << 24 | i_2157_ << 16 | i_2158_ << 8 | i_2159_);
					}
				} else {
					for (int i = 0; i < anInt9163; i++) {
						short i_2160_ = aShortArray9178[i];
						int i_2161_ = (255 - aByteArray9176[i_2160_] << 24 | method14546(aShortArray9175[i_2160_] & 0xffff, aShortArray9189[i_2160_], aShort9149));
						bytebuffer.putInt(i_2161_);
					}
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9150.anInterface36_3726 = interface36;
			aClass357_9150.aBool3725 = true;
		}
		if (bool_2120_) {
			if (aClass357_9224.anInterface36_3727 == null)
				aClass357_9224.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9224.anInterface36_3727;
			interface36.method215(anInt9163 * 12, 12);
			short[] is;
			short[] is_2162_;
			short[] is_2163_;
			byte[] is_2164_;
			if (aClass367_9172 != null) {
				is = aClass367_9172.aShortArray3879;
				is_2162_ = aClass367_9172.aShortArray3877;
				is_2163_ = aClass367_9172.aShortArray3876;
				is_2164_ = aClass367_9172.aByteArray3878;
			} else {
				is = aShortArray9164;
				is_2162_ = aShortArray9167;
				is_2163_ = aShortArray9168;
				is_2164_ = aByteArray9169;
			}
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 12;
				long l = interface36.method274(0, i);
				for (int i_2165_ = 0; i_2165_ < anInt9163; i_2165_++) {
					Class437 class437 = new Class437((float) is[i_2165_], (float) is_2162_[i_2165_], (float) is_2163_[i_2165_]);
					if (class437.method6958() != 0.0F) {
						if (is_2164_[i_2165_] > 1)
							class437.method6905((float) is_2164_[i_2165_]);
						class437.method6890();
					}
					unsafe.putFloat(l, class437.aFloat4903);
					l += 4L;
					unsafe.putFloat(l, class437.aFloat4904);
					l += 4L;
					unsafe.putFloat(l, class437.aFloat4905);
					l += 4L;
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				for (int i = 0; i < anInt9163; i++) {
					Class437 class437 = new Class437((float) is[i], (float) is_2162_[i], (float) is_2163_[i]);
					if (class437.method6958() != 0.0F) {
						if (is_2164_[i] > 1)
							class437.method6905((float) is_2164_[i]);
						class437.method6890();
					}
					bytebuffer.putFloat(class437.aFloat4903);
					bytebuffer.putFloat(class437.aFloat4904);
					bytebuffer.putFloat(class437.aFloat4905);
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9224.anInterface36_3726 = interface36;
			aClass357_9224.aBool3725 = true;
		}
		if (bool_2122_) {
			if (aClass357_9187.anInterface36_3727 == null)
				aClass357_9187.anInterface36_3727 = aClass178_Sub2_9153.method15030(aBool9188);
			Interface36 interface36 = aClass357_9187.anInterface36_3727;
			interface36.method215(anInt9163 * 8, 8);
			Unsafe unsafe = aClass178_Sub2_9153.anUnsafe9538;
			if (unsafe != null) {
				int i = anInt9163 * 8;
				long l = interface36.method274(0, i);
				for (int i_2166_ = 0; i_2166_ < anInt9163; i_2166_++) {
					unsafe.putFloat(l, aFloatArray9194[i_2166_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9171[i_2166_]);
					l += 4L;
				}
				interface36.method79();
			} else {
				ByteBuffer bytebuffer = aClass178_Sub2_9153.aByteBuffer9539;
				bytebuffer.clear();
				for (int i = 0; i < anInt9163; i++) {
					bytebuffer.putFloat(aFloatArray9194[i]);
					bytebuffer.putFloat(aFloatArray9171[i]);
				}
				interface36.method265(0, bytebuffer.position(), aClass178_Sub2_9153.aLong9540);
			}
			aClass357_9187.anInterface36_3726 = interface36;
			aClass357_9187.aBool3725 = true;
		}
		return bool_2123_;
	}

	public void method2725(short i, short i_2167_) {
		for (int i_2168_ = 0; i_2168_ < anInt9155; i_2168_++) {
			if (aShortArray9175[i_2168_] == i)
				aShortArray9175[i_2168_] = i_2167_;
		}
		if (aClass371Array9211 != null) {
			for (int i_2169_ = 0; i_2169_ < anInt9210; i_2169_++) {
				Class371 class371 = aClass371Array9211[i_2169_];
				Class337 class337 = aClass337Array9212[i_2169_];
				class337.anInt3565 = (class337.anInt3565 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9175[class371.anInt3891] & 0xffff]) & 0xffffff));
			}
		}
		method14547();
	}

	void method14603() {
		if (aClass357_9186 != null)
			aClass357_9186.method6275();
		if (aClass357_9187 != null)
			aClass357_9187.method6275();
		if (aClass357_9150 != null)
			aClass357_9150.method6275();
		if (aClass357_9224 != null)
			aClass357_9224.method6275();
		if (aClass336_9183 != null)
			aClass336_9183.method5931();
	}

	void method14604() {
		if (aClass357_9186 != null)
			aClass357_9186.method6275();
		if (aClass357_9187 != null)
			aClass357_9187.method6275();
		if (aClass357_9150 != null)
			aClass357_9150.method6275();
		if (aClass357_9224 != null)
			aClass357_9224.method6275();
		if (aClass336_9183 != null)
			aClass336_9183.method5931();
	}

	public Class143[] method2686() {
		return aClass143Array9209;
	}

	void method14605() {
		if (aClass357_9150 != null)
			aClass357_9150.aBool3725 = false;
	}

	int method14606(int i, short i_2170_, int i_2171_) {
		int i_2172_ = aClass178_Sub2_9153.anIntArray9537[method14563(i, i_2171_)];
		if (i_2170_ != -1) {
			Class177 class177 = aClass178_Sub2_9153.aClass172_1916.method2895(i_2170_ & 0xffff, -623897310);
			int i_2173_ = class177.aByte1912 & 0xff;
			if (i_2173_ != 0) {
				int i_2174_ = 131586 * i_2171_;
				if (i_2171_ < 0)
					i_2174_ = 0;
				else if (i_2171_ > 127)
					i_2174_ = 16777215;
				else
					i_2174_ = 131586 * i_2171_;
				if (i_2173_ == 256)
					i_2172_ = i_2174_;
				else {
					int i_2175_ = i_2173_;
					int i_2176_ = 256 - i_2173_;
					i_2172_ = ((((i_2174_ & 0xff00ff) * i_2175_ + (i_2172_ & 0xff00ff) * i_2176_) & ~0xff00ff) + (((i_2174_ & 0xff00) * i_2175_ + (i_2172_ & 0xff00) * i_2176_) & 0xff0000)) >> 8;
				}
			}
			int i_2177_ = class177.aByte1883 & 0xff;
			if (i_2177_ != 0) {
				i_2177_ += 256;
				int i_2178_ = ((i_2172_ & 0xff0000) >> 16) * i_2177_;
				if (i_2178_ > 65535)
					i_2178_ = 65535;
				int i_2179_ = ((i_2172_ & 0xff00) >> 8) * i_2177_;
				if (i_2179_ > 65535)
					i_2179_ = 65535;
				int i_2180_ = (i_2172_ & 0xff) * i_2177_;
				if (i_2180_ > 65535)
					i_2180_ = 65535;
				i_2172_ = (i_2178_ << 8 & 0xff0000) + (i_2179_ & 0xff00) + (i_2180_ >> 8);
			}
		}
		return i_2172_ & 0xffffff;
	}
}
