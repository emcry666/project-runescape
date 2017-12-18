/* Class117_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub4 extends Class117 {
	static final char aChar8957 = '\001';
	static final char aChar8958 = '\0';
	Class128 aClass128_8959;
	boolean aBool8960 = false;

	void method2027(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	boolean method2009() {
		return true;
	}

	void method2026(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aClass128_8959 != null && class126_sub1 != null && bool) {
			aClass128_8959.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.method7135(aClass178_Sub1_1434.aFloatArray9334)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			aBool8960 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2011(boolean bool) {
		aClass178_Sub1_1434.method14676(8448, 7681);
	}

	Class117_Sub4(Class178_Sub1 class178_sub1) {
		super(class178_sub1);
		if (class178_sub1.aBool9407) {
			aClass128_8959 = new Class128(class178_sub1, 2);
			aClass128_8959.method2256(0);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14676(34165, 7681);
			aClass178_Sub1_1434.method14677(2, 34168, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			aClass178_Sub1_1434.method14673(0);
			aClass128_8959.method2247();
			aClass128_8959.method2256(1);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(2, 34166, 770);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			aClass128_8959.method2247();
		}
	}

	void method2019(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aClass128_8959 != null && class126_sub1 != null && bool) {
			aClass128_8959.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.method7135(aClass178_Sub1_1434.aFloatArray9334)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			aBool8960 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2013(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	boolean method2014() {
		return true;
	}

	boolean method2022() {
		return true;
	}

	void method2015() {
		if (aBool8960) {
			aClass128_8959.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aBool8960 = false;
	}

	void method2017(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aClass128_8959 != null && class126_sub1 != null && bool) {
			aClass128_8959.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.method7135(aClass178_Sub1_1434.aFloatArray9334)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			aBool8960 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2018(boolean bool) {
		Class126_Sub1 class126_sub1 = aClass178_Sub1_1434.method14646();
		if (aClass128_8959 != null && class126_sub1 != null && bool) {
			aClass128_8959.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(class126_sub1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.method7135(aClass178_Sub1_1434.aFloatArray9334)), 0);
			OpenGL.glScalef(1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			aBool8960 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2010(int i, int i_0_) {
		/* empty */
	}

	void method2020(boolean bool) {
		aClass178_Sub1_1434.method14676(8448, 7681);
	}

	void method2008(boolean bool) {
		aClass178_Sub1_1434.method14676(8448, 7681);
	}

	void method2023(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method2012() {
		if (aBool8960) {
			aClass128_8959.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aBool8960 = false;
	}

	void method2024() {
		if (aBool8960) {
			aClass128_8959.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aBool8960 = false;
	}

	boolean method2016() {
		return true;
	}

	void method2021(int i, int i_1_) {
		/* empty */
	}

	void method2028() {
		if (aBool8960) {
			aClass128_8959.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aBool8960 = false;
	}

	void method2025(int i, int i_2_) {
		/* empty */
	}
}
