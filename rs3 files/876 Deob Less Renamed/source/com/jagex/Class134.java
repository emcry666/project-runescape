/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class134 {
	Class178_Sub1 aClass178_Sub1_1578;
	static int[] anIntArray1579 = new int[2];
	static final int anInt1580 = 35633;
	static final int anInt1581 = 35632;
	int anInt1582;

	public void finalize() throws Throwable {
		aClass178_Sub1_1578.method14696((long) anInt1582);
		super.finalize();
	}

	Class134(Class178_Sub1 class178_sub1, int i, int i_0_) {
		aClass178_Sub1_1578 = class178_sub1;
		anInt1582 = i;
	}

	void method2266() throws Throwable {
		aClass178_Sub1_1578.method14696((long) anInt1582);
		super.finalize();
	}

	static Class134 method2267(Class178_Sub1 class178_sub1, int i, String string) {
		int i_1_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_1_, string);
		OpenGL.glCompileShader(i_1_);
		OpenGL.glGetShaderiv(i_1_, 35713, anIntArray1579, 0);
		if (anIntArray1579[0] == 0) {
			boolean bool = false;
			if (anIntArray1579[0] == 0) {
				bool = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(i_1_, 35716, anIntArray1579, 1);
			if (anIntArray1579[1] > 1) {
				byte[] is = new byte[anIntArray1579[1]];
				OpenGL.glGetShaderInfoLog(i_1_, anIntArray1579[1], anIntArray1579, 0, is, 0);
				System.out.println(new String(is));
			}
			if (bool) {
				OpenGL.glDeleteShader(i_1_);
				return null;
			}
		}
		return new Class134(class178_sub1, i_1_, i);
	}
}
