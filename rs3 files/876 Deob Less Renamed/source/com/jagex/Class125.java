/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class125 {
	Class178_Sub1 aClass178_Sub1_1526;
	static int[] anIntArray1527 = new int[1];
	int anInt1528;
	static final int anInt1529 = 34336;

	Class125(Class178_Sub1 class178_sub1, int i, int i_0_) {
		aClass178_Sub1_1526 = class178_sub1;
		anInt1528 = i_0_;
	}

	static Class125 method2107(Class178_Sub1 class178_sub1, int i, String string) {
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray1527, 0);
		if (anIntArray1527[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class125(class178_sub1, i, i_1_);
	}

	public void finalize() throws Throwable {
		aClass178_Sub1_1526.method14787(anInt1528);
		super.finalize();
	}

	void method2108() throws Throwable {
		aClass178_Sub1_1526.method14787(anInt1528);
		super.finalize();
	}
}
