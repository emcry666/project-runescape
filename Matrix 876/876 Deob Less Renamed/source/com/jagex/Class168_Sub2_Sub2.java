/* Class168_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public abstract class Class168_Sub2_Sub2 extends Class168_Sub2 {
	int anInt11362;
	Canvas aCanvas11363;
	int anInt11364;
	float[] aFloatArray11365;
	int[] anIntArray11366;
	boolean aBool11367;
	Class178_Sub3 aClass178_Sub3_11368;

	public int method2875() {
		return anInt11364 * 276730845;
	}

	void method17783(int i) {
		anIntArray11366 = new int[2032327007 * anInt11362 * (anInt11364 * 276730845)];
		aFloatArray11365 = new float[anInt11364 * 276730845 * (anInt11362 * 2032327007)];
		if (aBool11367)
			aClass178_Sub3_11368.method15419(276730845 * anInt11364, anInt11362 * 2032327007, anIntArray11366, aFloatArray11365);
	}

	final void method15402(int i, int i_0_) {
		if (i != anInt11364 * 276730845 || anInt11362 * 2032327007 != i_0_) {
			anInt11364 = i * -497066891;
			anInt11362 = 1275052703 * i_0_;
			method17783(-522238293);
		}
	}

	public int method2877() {
		return anInt11364 * 276730845;
	}

	public int method2874() {
		return anInt11362 * 2032327007;
	}

	final boolean method359() {
		aClass178_Sub3_11368.method15419(anInt11364 * 276730845, anInt11362 * 2032327007, anIntArray11366, aFloatArray11365);
		aBool11367 = true;
		return true;
	}

	final boolean method2873() {
		aBool11367 = false;
		return true;
	}

	final boolean method2876() {
		aBool11367 = false;
		return true;
	}

	public int method2880() {
		return anInt11364 * 276730845;
	}

	Class168_Sub2_Sub2(Class178_Sub3 class178_sub3, Canvas canvas, int i, int i_1_) {
		aCanvas11363 = canvas;
		aClass178_Sub3_11368 = class178_sub3;
		anInt11364 = -497066891 * i;
		anInt11362 = i_1_ * 1275052703;
	}

	final void method15403(int i, int i_2_) {
		if (i != anInt11364 * 276730845 || anInt11362 * 2032327007 != i_2_) {
			anInt11364 = i * -497066891;
			anInt11362 = 1275052703 * i_2_;
			method17783(483173199);
		}
	}

	final boolean method360() {
		aClass178_Sub3_11368.method15419(anInt11364 * 276730845, anInt11362 * 2032327007, anIntArray11366, aFloatArray11365);
		aBool11367 = true;
		return true;
	}

	public int method2879() {
		return anInt11362 * 2032327007;
	}

	static Class168_Sub2_Sub2 method17784(Class178_Sub3 class178_sub3, Canvas canvas, int i, int i_3_) {
		Class168_Sub2_Sub2_Sub1 class168_sub2_sub2_sub1 = new Class168_Sub2_Sub2_Sub1(class178_sub3, canvas, i, i_3_);
		return class168_sub2_sub2_sub1;
	}

	final void method15405(int i, int i_4_) {
		if (i != anInt11364 * 276730845 || anInt11362 * 2032327007 != i_4_) {
			anInt11364 = i * -497066891;
			anInt11362 = 1275052703 * i_4_;
			method17783(-791701078);
		}
	}

	public int method2878() {
		return anInt11364 * 276730845;
	}

	static final int method17785(int i, short i_5_) {
		i -= 2;
		if (i < 4)
			return i;
		return 3;
	}
}
