/* Class117_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub6 extends Class117 {
	Class132 aClass132_8967;
	static final char aChar8968 = '\001';
	Class128 aClass128_8969;
	static final char aChar8970 = '\0';
	static float[] aFloatArray8971 = new float[4];

	void method2023(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method2026(boolean bool) {
		aClass128_8969.method2248('\0');
		if (aClass132_8967.aBool1569) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub3_1567);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2011(boolean bool) {
		/* empty */
	}

	void method2028() {
		aClass128_8969.method2248('\001');
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14673(0);
	}

	boolean method2009() {
		return true;
	}

	void method2013(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method2008(boolean bool) {
		/* empty */
	}

	boolean method2014() {
		return true;
	}

	boolean method2022() {
		return true;
	}

	boolean method2016() {
		return true;
	}

	void method2012() {
		aClass128_8969.method2248('\001');
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14673(0);
	}

	void method2018(boolean bool) {
		aClass128_8969.method2248('\0');
		if (aClass132_8967.aBool1569) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub3_1567);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2019(boolean bool) {
		aClass128_8969.method2248('\0');
		if (aClass132_8967.aBool1569) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub3_1567);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2015() {
		aClass128_8969.method2248('\001');
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14673(0);
	}

	Class117_Sub6(Class178_Sub1 class178_sub1, Class132 class132) {
		super(class178_sub1);
		aClass132_8967 = class132;
		aClass128_8969 = new Class128(class178_sub1, 2);
		aClass128_8969.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		if (aClass132_8967.aBool1569) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		aClass178_Sub1_1434.method14673(0);
		aClass128_8969.method2247();
		aClass128_8969.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		if (aClass132_8967.aBool1569)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass178_Sub1_1434.method14673(0);
		aClass128_8969.method2247();
	}

	void method2010(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass178_Sub1_1434.method14673(1);
		if (bool) {
			aFloatArray8971[0] = f_2_;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = 0.0F;
			aFloatArray8971[3] = 0.0F;
		} else {
			aFloatArray8971[0] = 0.0F;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = f_2_;
			aFloatArray8971[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8971, 0);
		aFloatArray8971[0] = 0.0F;
		aFloatArray8971[1] = f_2_;
		aFloatArray8971[2] = 0.0F;
		aFloatArray8971[3] = (float) aClass178_Sub1_1434.anInt9436 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8971, 0);
		if (!aClass132_8967.aBool1569) {
			int i_3_ = (int) (f_1_ * (float) aClass178_Sub1_1434.anInt9436 * 16.0F);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub2Array1563[i_3_ % 16]);
		} else {
			aFloatArray8971[0] = 0.0F;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = 0.0F;
			aFloatArray8971[3] = (float) aClass178_Sub1_1434.anInt9436 * f_1_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8971, 0);
		}
		aClass178_Sub1_1434.method14673(0);
	}

	void method2017(boolean bool) {
		aClass128_8969.method2248('\0');
		if (aClass132_8967.aBool1569) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub3_1567);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2020(boolean bool) {
		/* empty */
	}

	void method2025(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass178_Sub1_1434.method14673(1);
		if (bool) {
			aFloatArray8971[0] = f_6_;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = 0.0F;
			aFloatArray8971[3] = 0.0F;
		} else {
			aFloatArray8971[0] = 0.0F;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = f_6_;
			aFloatArray8971[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8971, 0);
		aFloatArray8971[0] = 0.0F;
		aFloatArray8971[1] = f_6_;
		aFloatArray8971[2] = 0.0F;
		aFloatArray8971[3] = (float) aClass178_Sub1_1434.anInt9436 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8971, 0);
		if (!aClass132_8967.aBool1569) {
			int i_7_ = (int) (f_5_ * (float) aClass178_Sub1_1434.anInt9436 * 16.0F);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub2Array1563[i_7_ % 16]);
		} else {
			aFloatArray8971[0] = 0.0F;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = 0.0F;
			aFloatArray8971[3] = (float) aClass178_Sub1_1434.anInt9436 * f_5_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8971, 0);
		}
		aClass178_Sub1_1434.method14673(0);
	}

	void method2021(int i, int i_8_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass178_Sub1_1434.method14673(1);
		if (bool) {
			aFloatArray8971[0] = f_10_;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = 0.0F;
			aFloatArray8971[3] = 0.0F;
		} else {
			aFloatArray8971[0] = 0.0F;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = f_10_;
			aFloatArray8971[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8971, 0);
		aFloatArray8971[0] = 0.0F;
		aFloatArray8971[1] = f_10_;
		aFloatArray8971[2] = 0.0F;
		aFloatArray8971[3] = (float) aClass178_Sub1_1434.anInt9436 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8971, 0);
		if (!aClass132_8967.aBool1569) {
			int i_11_ = (int) (f_9_ * (float) aClass178_Sub1_1434.anInt9436 * 16.0F);
			aClass178_Sub1_1434.method14711(aClass132_8967.aClass126_Sub2Array1563[i_11_ % 16]);
		} else {
			aFloatArray8971[0] = 0.0F;
			aFloatArray8971[1] = 0.0F;
			aFloatArray8971[2] = 0.0F;
			aFloatArray8971[3] = (float) aClass178_Sub1_1434.anInt9436 * f_9_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8971, 0);
		}
		aClass178_Sub1_1434.method14673(0);
	}

	void method2027(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method2024() {
		aClass128_8969.method2248('\001');
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14673(0);
	}
}
