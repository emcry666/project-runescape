/* Class126_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class126_Sub4 extends Class126 {
	int anInt8956;

	void method14412(boolean bool) {
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glTexParameteri(anInt1538, 10242, bool ? 10497 : 33071);
	}

	void method14413(boolean bool) {
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glTexParameteri(anInt1538, 10242, bool ? 10497 : 33071);
	}

	Class126_Sub4(Class178_Sub1 class178_sub1, Class158 class158, Class170 class170, int i, byte[] is, Class158 class158_0_) {
		super(class178_sub1, 3552, class158, class170, i, false);
		anInt8956 = i;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8956, 0, Class178_Sub1.method14698(class158_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method2110(true);
	}
}
