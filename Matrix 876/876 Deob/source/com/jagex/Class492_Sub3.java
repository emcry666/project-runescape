/* Class492_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class492_Sub3 extends Class492 implements Interface34 {
	int anInt10238;
	int anInt10239;
	int anInt10240;

	public void method78() {
		super.method131();
	}

	public void method297() {
		super.method297();
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	public void method131() {
		super.method131();
	}

	public void method331() {
		super.method297();
	}

	public void method132() {
		super.method131();
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}

	Class492_Sub3(Class178_Sub2_Sub2 class178_sub2_sub2, Class158 class158, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class178_sub2_sub2, 32879, class158, Class170.aClass170_1822, i * i_0_ * i_1_, bool);
		anInt10239 = i;
		anInt10238 = i_0_;
		anInt10240 = i_1_;
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt5544, 0, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), anInt10239, anInt10238, anInt10240, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method249();
	}

	public void method332() {
		super.method297();
	}

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	public void method130() {
		super.method131();
	}
}
