/* Class523_Sub4_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class523_Sub4_Sub1_Sub1 extends Class523_Sub4_Sub1 {
	int[] anIntArray12063 = null;
	Class265_Sub2 aClass265_Sub2_12064;

	public final int method18070(int i) {
		return anIntArray12063[i];
	}

	final int method18508() {
		return anIntArray12063[aClass265_Sub2_12064.method4796(857140538)];
	}

	public boolean method18064(int i) {
		if (anIntArray12063 == null)
			anIntArray12063 = new int[aClass265_Sub2_12064.method4756((byte) -65)];
		Class270_Sub1 class270_sub1 = (Class270_Sub1) aClass265_Sub2_12064.method4749(i, (byte) -99);
		anIntArray12063[i] = OpenGL.glGetUniformLocation(class270_sub1.anInt9976, method18066(-1642590366));
		return anIntArray12063[i] != -1;
	}

	Class523_Sub4_Sub1_Sub1(Class265_Sub2 class265_sub2, Class272 class272) {
		super(class272);
		aClass265_Sub2_12064 = class265_sub2;
	}

	public final int method18080(int i) {
		return anIntArray12063[i];
	}

	public boolean method18081(int i) {
		if (anIntArray12063 == null)
			anIntArray12063 = new int[aClass265_Sub2_12064.method4756((byte) -110)];
		Class270_Sub1 class270_sub1 = (Class270_Sub1) aClass265_Sub2_12064.method4749(i, (byte) -45);
		anIntArray12063[i] = OpenGL.glGetUniformLocation(class270_sub1.anInt9976, method18066(-1642590366));
		return anIntArray12063[i] != -1;
	}
}
