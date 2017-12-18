/* Class117_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub3 extends Class117 {
	Class128 aClass128_8950;
	static float[] aFloatArray8951 = { 0.0F, 0.0F, 0.0F, 0.0F };
	Class132 aClass132_8952;
	static final char aChar8953 = '\0';
	Class126_Sub4 aClass126_Sub4_8954;
	static final char aChar8955 = '\001';

	boolean method2016() {
		return true;
	}

	boolean method2009() {
		return true;
	}

	void method2026(boolean bool) {
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			float f = -0.5F / (float) aClass178_Sub1_1434.anInt9369;
			aClass178_Sub1_1434.method14673(1);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = f;
			aFloatArray8951[3] = aClass178_Sub1_1434.aFloat9371 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8951, 0);
			OpenGL.glPopMatrix();
			aClass178_Sub1_1434.method14735(0.5F, (float) aClass178_Sub1_1434.anInt9369);
			aClass178_Sub1_1434.method14711(aClass126_Sub4_8954);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass128_8950.method2248('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2011(boolean bool) {
		aClass178_Sub1_1434.method14676(260, 8448);
	}

	void method2028() {
		aClass128_8950.method2248('\001');
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14735(1.0F, 0.0F);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass178_Sub1_1434.method14676(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2013(Class126 class126, int i) {
		/* empty */
	}

	void method2015() {
		aClass128_8950.method2248('\001');
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14735(1.0F, 0.0F);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass178_Sub1_1434.method14676(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2019(boolean bool) {
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			float f = -0.5F / (float) aClass178_Sub1_1434.anInt9369;
			aClass178_Sub1_1434.method14673(1);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = f;
			aFloatArray8951[3] = aClass178_Sub1_1434.aFloat9371 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8951, 0);
			OpenGL.glPopMatrix();
			aClass178_Sub1_1434.method14735(0.5F, (float) aClass178_Sub1_1434.anInt9369);
			aClass178_Sub1_1434.method14711(aClass126_Sub4_8954);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass128_8950.method2248('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	boolean method2014() {
		return true;
	}

	boolean method2022() {
		return true;
	}

	void method2023(Class126 class126, int i) {
		/* empty */
	}

	Class117_Sub3(Class178_Sub1 class178_sub1, Class132 class132) {
		super(class178_sub1);
		aClass132_8952 = class132;
		method14411();
		aClass126_Sub4_8954 = new Class126_Sub4(aClass178_Sub1_1434, Class158.aClass158_1747, Class170.aClass170_1822, 2, new byte[] { 0, -1 }, Class158.aClass158_1747);
		aClass126_Sub4_8954.method14413(false);
	}

	void method2018(boolean bool) {
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			float f = -0.5F / (float) aClass178_Sub1_1434.anInt9369;
			aClass178_Sub1_1434.method14673(1);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = f;
			aFloatArray8951[3] = aClass178_Sub1_1434.aFloat9371 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8951, 0);
			OpenGL.glPopMatrix();
			aClass178_Sub1_1434.method14735(0.5F, (float) aClass178_Sub1_1434.anInt9369);
			aClass178_Sub1_1434.method14711(aClass126_Sub4_8954);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass128_8950.method2248('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2027(Class126 class126, int i) {
		/* empty */
	}

	void method2020(boolean bool) {
		aClass178_Sub1_1434.method14676(260, 8448);
	}

	void method14411() {
		aClass128_8950 = new Class128(aClass178_Sub1_1434, 2);
		aClass128_8950.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14676(7681, 260);
		aClass178_Sub1_1434.method14677(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass178_Sub1_1434.method14673(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass132_8952.aBool1569) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass128_8950.method2247();
		aClass128_8950.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aClass178_Sub1_1434.method14677(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass178_Sub1_1434.method14673(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass132_8952.aBool1569) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass128_8950.method2247();
	}

	void method2017(boolean bool) {
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			float f = -0.5F / (float) aClass178_Sub1_1434.anInt9369;
			aClass178_Sub1_1434.method14673(1);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = f;
			aFloatArray8951[3] = aClass178_Sub1_1434.aFloat9371 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8951, 0);
			OpenGL.glPopMatrix();
			aClass178_Sub1_1434.method14735(0.5F, (float) aClass178_Sub1_1434.anInt9369);
			aClass178_Sub1_1434.method14711(aClass126_Sub4_8954);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass128_8950.method2248('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2012() {
		aClass128_8950.method2248('\001');
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14735(1.0F, 0.0F);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass178_Sub1_1434.method14676(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2024() {
		aClass128_8950.method2248('\001');
		if (aClass178_Sub1_1434.anInt9369 > 0) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14735(1.0F, 0.0F);
			aClass178_Sub1_1434.method14673(0);
		}
		aClass178_Sub1_1434.method14676(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2025(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (aClass132_8952.aBool1569) {
				aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub3_1559);
				aFloatArray8951[0] = 0.0F;
				aFloatArray8951[1] = 0.0F;
				aFloatArray8951[2] = 0.0F;
				aFloatArray8951[3] = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray8951, 0);
			} else {
				int i_1_ = aClass178_Sub1_1434.anInt9436 % 4000 * 16 / 4000;
				aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub2Array1564[i_1_]);
			}
		} else if (aClass132_8952.aBool1569) {
			aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub3_1559);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = 0.0F;
			aFloatArray8951[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8951, 0);
		} else
			aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub2Array1564[0]);
	}

	void method2021(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (aClass132_8952.aBool1569) {
				aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub3_1559);
				aFloatArray8951[0] = 0.0F;
				aFloatArray8951[1] = 0.0F;
				aFloatArray8951[2] = 0.0F;
				aFloatArray8951[3] = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray8951, 0);
			} else {
				int i_3_ = aClass178_Sub1_1434.anInt9436 % 4000 * 16 / 4000;
				aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub2Array1564[i_3_]);
			}
		} else if (aClass132_8952.aBool1569) {
			aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub3_1559);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = 0.0F;
			aFloatArray8951[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8951, 0);
		} else
			aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub2Array1564[0]);
	}

	void method2008(boolean bool) {
		aClass178_Sub1_1434.method14676(260, 8448);
	}

	void method2010(int i, int i_4_) {
		if ((i & 0x1) == 1) {
			if (aClass132_8952.aBool1569) {
				aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub3_1559);
				aFloatArray8951[0] = 0.0F;
				aFloatArray8951[1] = 0.0F;
				aFloatArray8951[2] = 0.0F;
				aFloatArray8951[3] = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray8951, 0);
			} else {
				int i_5_ = aClass178_Sub1_1434.anInt9436 % 4000 * 16 / 4000;
				aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub2Array1564[i_5_]);
			}
		} else if (aClass132_8952.aBool1569) {
			aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub3_1559);
			aFloatArray8951[0] = 0.0F;
			aFloatArray8951[1] = 0.0F;
			aFloatArray8951[2] = 0.0F;
			aFloatArray8951[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8951, 0);
		} else
			aClass178_Sub1_1434.method14711(aClass132_8952.aClass126_Sub2Array1564[0]);
	}
}
