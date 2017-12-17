/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class136 {
	Class178_Sub1 aClass178_Sub1_1592;
	int anInt1593;
	static int[] anIntArray1594 = new int[2];

	Class136(Class178_Sub1 class178_sub1, int i, Class134[] class134s) {
		aClass178_Sub1_1592 = class178_sub1;
		anInt1593 = i;
	}

	public void finalize() throws Throwable {
		aClass178_Sub1_1592.method14696((long) anInt1593);
		super.finalize();
	}

	void method2274() throws Throwable {
		aClass178_Sub1_1592.method14696((long) anInt1593);
		super.finalize();
	}

	static Class136 method2275(Class178_Sub1 class178_sub1, Class134[] class134s) {
		for (int i = 0; i < class134s.length; i++) {
			if (class134s[i] == null || class134s[i].anInt1582 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class134s.length; i_0_++)
			OpenGL.glAttachShader(i, class134s[i_0_].anInt1582);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1594, 0);
		if (anIntArray1594[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1594, 1);
			if (anIntArray1594[1] > 1) {
				byte[] is = new byte[anIntArray1594[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1594[1], anIntArray1594, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1594[0] == 0) {
				for (int i_1_ = 0; i_1_ < class134s.length; i_1_++)
					OpenGL.glDetachShader(i, class134s[i_1_].anInt1582);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class136(class178_sub1, i, class134s);
	}

	static Class136 method2276(Class178_Sub1 class178_sub1, Class134[] class134s) {
		for (int i = 0; i < class134s.length; i++) {
			if (class134s[i] == null || class134s[i].anInt1582 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_2_ = 0; i_2_ < class134s.length; i_2_++)
			OpenGL.glAttachShader(i, class134s[i_2_].anInt1582);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1594, 0);
		if (anIntArray1594[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1594, 1);
			if (anIntArray1594[1] > 1) {
				byte[] is = new byte[anIntArray1594[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1594[1], anIntArray1594, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1594[0] == 0) {
				for (int i_3_ = 0; i_3_ < class134s.length; i_3_++)
					OpenGL.glDetachShader(i, class134s[i_3_].anInt1582);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class136(class178_sub1, i, class134s);
	}

	static Class136 method2277(Class178_Sub1 class178_sub1, Class134[] class134s) {
		for (int i = 0; i < class134s.length; i++) {
			if (class134s[i] == null || class134s[i].anInt1582 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_4_ = 0; i_4_ < class134s.length; i_4_++)
			OpenGL.glAttachShader(i, class134s[i_4_].anInt1582);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1594, 0);
		if (anIntArray1594[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1594, 1);
			if (anIntArray1594[1] > 1) {
				byte[] is = new byte[anIntArray1594[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1594[1], anIntArray1594, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1594[0] == 0) {
				for (int i_5_ = 0; i_5_ < class134s.length; i_5_++)
					OpenGL.glDetachShader(i, class134s[i_5_].anInt1582);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class136(class178_sub1, i, class134s);
	}

	static Class136 method2278(Class178_Sub1 class178_sub1, Class134[] class134s) {
		for (int i = 0; i < class134s.length; i++) {
			if (class134s[i] == null || class134s[i].anInt1582 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_6_ = 0; i_6_ < class134s.length; i_6_++)
			OpenGL.glAttachShader(i, class134s[i_6_].anInt1582);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1594, 0);
		if (anIntArray1594[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1594, 1);
			if (anIntArray1594[1] > 1) {
				byte[] is = new byte[anIntArray1594[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1594[1], anIntArray1594, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1594[0] == 0) {
				for (int i_7_ = 0; i_7_ < class134s.length; i_7_++)
					OpenGL.glDetachShader(i, class134s[i_7_].anInt1582);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class136(class178_sub1, i, class134s);
	}

	static Class136 method2279(Class178_Sub1 class178_sub1, Class134[] class134s) {
		for (int i = 0; i < class134s.length; i++) {
			if (class134s[i] == null || class134s[i].anInt1582 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_8_ = 0; i_8_ < class134s.length; i_8_++)
			OpenGL.glAttachShader(i, class134s[i_8_].anInt1582);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray1594, 0);
		if (anIntArray1594[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray1594, 1);
			if (anIntArray1594[1] > 1) {
				byte[] is = new byte[anIntArray1594[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray1594[1], anIntArray1594, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1594[0] == 0) {
				for (int i_9_ = 0; i_9_ < class134s.length; i_9_++)
					OpenGL.glDetachShader(i, class134s[i_9_].anInt1582);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class136(class178_sub1, i, class134s);
	}
}
