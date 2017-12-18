/* Class126_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class126_Sub1 extends Class126 {
	static final int anInt8883 = 34072;
	static final int anInt8884 = 34074;
	static final int anInt8885 = 34071;
	static final int anInt8886 = 34070;
	static final int anInt8887 = 34073;
	int anInt8888;
	static final int anInt8889 = 34069;

	Interface22 method14338(int i, int i_0_) {
		return new Class123(this, i, i_0_);
	}

	Class126_Sub1(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, boolean bool, byte[][] is, Class158 class158_1_) {
		super(class178_sub1, 34067, class158, class170, i * i * 6, bool);
		anInt8888 = i;
		aClass178_Sub1_1536.method14711(this);
		for (int i_2_ = 0; i_2_ < 6; i_2_++)
			OpenGL.glTexImage2Dub(34069 + i_2_, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i, i, 0, Class178_Sub1.method14698(class158_1_), 5121, is[i_2_], 0);
		method2110(true);
	}

	Class126_Sub1(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i) {
		super(class178_sub1, 34067, class158, class170, i * i * 6, false);
		anInt8888 = i;
		aClass178_Sub1_1536.method14711(this);
		for (int i_3_ = 0; i_3_ < 6; i_3_++)
			OpenGL.glTexImage2Dub(34069 + i_3_, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i, i, 0, Class178_Sub1.method14698(aClass158_1543), 5121, null, 0);
		method2110(true);
	}

	Interface22 method14339(int i, int i_4_) {
		return new Class123(this, i, i_4_);
	}

	Interface22 method14340(int i, int i_5_) {
		return new Class123(this, i, i_5_);
	}

	Class126_Sub1(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, boolean bool, int[][] is) {
		super(class178_sub1, 34067, class158, class170, i * i * 6, bool);
		anInt8888 = i;
		aClass178_Sub1_1536.method14711(this);
		if (bool) {
			for (int i_6_ = 0; i_6_ < 6; i_6_++)
				method2125(34069 + i_6_, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i, i, 32993, aClass178_Sub1_1536.anInt9418, is[i_6_]);
		} else {
			for (int i_7_ = 0; i_7_ < 6; i_7_++)
				OpenGL.glTexImage2Di(34069 + i_7_, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i, i, 0, 32993, aClass178_Sub1_1536.anInt9418, is[i_7_], 0);
		}
		method2110(true);
	}
}
