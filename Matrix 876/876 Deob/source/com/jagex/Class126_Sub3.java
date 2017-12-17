/* Class126_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class126_Sub3 extends Class126 {
	int anInt8911;
	int anInt8912;
	int anInt8913;

	void method14399(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glCopyTexSubImage3D(anInt1538, 0, i, i_0_, i_1_, i_4_, i_5_, i_2_, i_3_);
		OpenGL.glFlush();
	}

	Class126_Sub3(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, int i_6_, int i_7_) {
		super(class178_sub1, 32879, class158, class170, i * i_6_ * i_7_, false);
		anInt8911 = i;
		anInt8912 = i_6_;
		anInt8913 = i_7_;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glTexImage3Dub(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8911, anInt8912, anInt8913, 0, Class178_Sub1.method14698(aClass158_1543), 5121, null, 0);
		method2110(true);
	}

	void method14400(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glCopyTexSubImage3D(anInt1538, 0, i, i_8_, i_9_, i_12_, i_13_, i_10_, i_11_);
		OpenGL.glFlush();
	}

	Class126_Sub3(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, int i_14_, int i_15_, byte[] is, Class158 class158_16_) {
		super(class178_sub1, 32879, class158, class170, i * i_14_ * i_15_, false);
		anInt8911 = i;
		anInt8912 = i_14_;
		anInt8913 = i_15_;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8911, anInt8912, anInt8913, 0, Class178_Sub1.method14698(class158_16_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2110(true);
	}

	void method14401(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glCopyTexSubImage3D(anInt1538, 0, i, i_17_, i_18_, i_21_, i_22_, i_19_, i_20_);
		OpenGL.glFlush();
	}
}
