/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class494 implements Interface22, Interface23, Interface55 {
	int anInt5551;
	Class158 aClass158_5552;
	int anInt5553;
	Class170 aClass170_5554;
	Class178_Sub2_Sub2 aClass178_Sub2_Sub2_5555;
	int anInt5556;

	public void method131() {
		if (anInt5556 != 0) {
			int[] is = new int[1];
			is[0] = anInt5556;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5556 = 0;
		}
	}

	Class494(Class178_Sub2_Sub2 class178_sub2_sub2, Class158 class158, Class170 class170, int i, int i_0_, int i_1_) {
		aClass158_5552 = class158;
		aClass170_5554 = class170;
		anInt5551 = i;
		anInt5553 = i_0_;
		aClass178_Sub2_Sub2_5555 = class178_sub2_sub2;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		anInt5556 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt5556);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class178_Sub2_Sub2.method17902(aClass158_5552, aClass170_5554), i, i_0_);
	}

	public int method1() {
		return anInt5551;
	}

	public int method82() {
		return anInt5553;
	}

	public int method86() {
		return anInt5551;
	}

	void method8091() throws Throwable {
		method8092();
		super.finalize();
	}

	void method8092() {
		if (anInt5556 != 0) {
			aClass178_Sub2_Sub2_5555.method17904(anInt5556, (anInt5551 * anInt5553 * (aClass170_5554.anInt1831 * 1602321003) * (aClass158_5552.anInt1753 * -920065167)));
			anInt5556 = 0;
		}
	}

	public void finalize() throws Throwable {
		method8092();
		super.finalize();
	}

	public int method68() {
		return anInt5553;
	}

	public int method6() {
		return anInt5553;
	}

	public int method88() {
		return anInt5551;
	}

	public void method130() {
		if (anInt5556 != 0) {
			int[] is = new int[1];
			is[0] = anInt5556;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5556 = 0;
		}
	}

	public void method132() {
		if (anInt5556 != 0) {
			int[] is = new int[1];
			is[0] = anInt5556;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5556 = 0;
		}
	}

	public void method78() {
		if (anInt5556 != 0) {
			int[] is = new int[1];
			is[0] = anInt5556;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			anInt5556 = 0;
		}
	}

	Class494(Class178_Sub2_Sub2 class178_sub2_sub2, Class158 class158, Class170 class170, int i, int i_2_) {
		aClass158_5552 = class158;
		aClass170_5554 = class170;
		anInt5551 = i;
		anInt5553 = i_2_;
		aClass178_Sub2_Sub2_5555 = class178_sub2_sub2;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		anInt5556 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, anInt5556);
		OpenGL.glRenderbufferStorageEXT(36161, Class178_Sub2_Sub2.method17902(aClass158_5552, aClass170_5554), i, i_2_);
	}

	public void method90(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5556);
	}

	public int method38() {
		return anInt5553;
	}

	public void method92(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, anInt5556);
	}

	void method8093() {
		if (anInt5556 != 0) {
			aClass178_Sub2_Sub2_5555.method17904(anInt5556, (anInt5551 * anInt5553 * (aClass170_5554.anInt1831 * 1602321003) * (aClass158_5552.anInt1753 * -920065167)));
			anInt5556 = 0;
		}
	}

	void method8094() {
		if (anInt5556 != 0) {
			aClass178_Sub2_Sub2_5555.method17904(anInt5556, (anInt5551 * anInt5553 * (aClass170_5554.anInt1831 * 1602321003) * (aClass158_5552.anInt1753 * -920065167)));
			anInt5556 = 0;
		}
	}

	void method8095() {
		if (anInt5556 != 0) {
			aClass178_Sub2_Sub2_5555.method17904(anInt5556, (anInt5551 * anInt5553 * (aClass170_5554.anInt1831 * 1602321003) * (aClass158_5552.anInt1753 * -920065167)));
			anInt5556 = 0;
		}
	}
}
