/* Class523_Sub27_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class523_Sub27_Sub3 extends Class523_Sub27 implements Interface16 {
	Class170 aClass170_11335;
	int anInt11336;
	int anInt11337;
	int anInt11338;
	int anInt11339;
	Class158 aClass158_11340;
	Class178_Sub1 aClass178_Sub1_11341;
	static int[] anIntArray11342 = new int[1];

	public int method38() {
		return anInt11338;
	}

	Class523_Sub27_Sub3(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, int i_0_, int i_1_) {
		aClass178_Sub1_11341 = class178_sub1;
		anInt11337 = i;
		anInt11338 = i_0_;
		aClass158_11340 = class158;
		aClass170_11335 = class170;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11342, 0);
		anInt11336 = anIntArray11342[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt11336);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class178_Sub1.method14718(aClass158_11340, aClass170_11335), anInt11337, anInt11338);
		anInt11339 = (anInt11337 * anInt11338 * (aClass158_11340.anInt1753 * -920065167) * (aClass170_11335.anInt1831 * 1602321003));
	}

	public int method1() {
		return anInt11337;
	}

	public void method132() {
		if (anInt11336 != 0) {
			int[] is = new int[1];
			is[0] = anInt11336;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11336 = 0;
		}
	}

	public void method90(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11336);
	}

	public void method131() {
		if (anInt11336 != 0) {
			int[] is = new int[1];
			is[0] = anInt11336;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11336 = 0;
		}
	}

	void method17741() {
		if (anInt11336 != 0) {
			aClass178_Sub1_11341.method14695(anInt11336, anInt11339);
			anInt11336 = 0;
		}
	}

	public void finalize() throws Throwable {
		method17741();
		super.finalize();
	}

	void method17742() {
		if (anInt11336 != 0) {
			aClass178_Sub1_11341.method14695(anInt11336, anInt11339);
			anInt11336 = 0;
		}
	}

	public int method68() {
		return anInt11338;
	}

	void method17743() {
		if (anInt11336 != 0) {
			aClass178_Sub1_11341.method14695(anInt11336, anInt11339);
			anInt11336 = 0;
		}
	}

	public void method130() {
		if (anInt11336 != 0) {
			int[] is = new int[1];
			is[0] = anInt11336;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11336 = 0;
		}
	}

	void method17744() throws Throwable {
		method17741();
		super.finalize();
	}

	public void method78() {
		if (anInt11336 != 0) {
			int[] is = new int[1];
			is[0] = anInt11336;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt11336 = 0;
		}
	}

	public void method89(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11336);
	}

	public int method88() {
		return anInt11337;
	}

	void method17745() {
		if (anInt11336 != 0) {
			aClass178_Sub1_11341.method14695(anInt11336, anInt11339);
			anInt11336 = 0;
		}
	}

	public void method92(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11336);
	}

	public int method6() {
		return anInt11338;
	}

	public void method91(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt11336);
	}

	public int method86() {
		return anInt11337;
	}

	public int method82() {
		return anInt11338;
	}

	void method17746() {
		if (anInt11336 != 0) {
			aClass178_Sub1_11341.method14695(anInt11336, anInt11339);
			anInt11336 = 0;
		}
	}

	Class523_Sub27_Sub3(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, int i_2_) {
		aClass178_Sub1_11341 = class178_sub1;
		anInt11337 = i;
		anInt11338 = i_2_;
		aClass158_11340 = class158;
		aClass170_11335 = class170;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray11342, 0);
		anInt11336 = anIntArray11342[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt11336);
		OpenGL.glRenderbufferStorageEXT(36161, Class178_Sub1.method14718(aClass158_11340, aClass170_11335), anInt11337, anInt11338);
		anInt11339 = (anInt11337 * anInt11338 * (aClass158_11340.anInt1753 * -920065167) * (aClass170_11335.anInt1831 * 1602321003));
	}
}
