/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jaggl.OpenGL;

public class Class476 {
	public static Class178 method7767(Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i) {
		Class178_Sub2_Sub2 class178_sub2_sub2;
		try {
			Class178_Sub2.method15270();
			Class523_Sub24.method16142(2119974113).method383("jaggl", 2106472487);
			Class194_Sub14.method15513(canvas, (byte) -84);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class178_Sub2_Sub2 class178_sub2_sub2_0_ = new Class178_Sub2_Sub2(opengl, canvas, l, class172, interface25, interface46, interface48, interface45, class472, i);
			class178_sub2_sub2_0_.method15293();
			class178_sub2_sub2 = class178_sub2_sub2_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class178_sub2_sub2;
	}

	Class476() throws Throwable {
		throw new Error();
	}

	public static Class178 method7768(Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i) {
		Class178_Sub2_Sub2 class178_sub2_sub2;
		try {
			Class178_Sub2.method15270();
			Class523_Sub24.method16142(1485549280).method383("jaggl", 2106472487);
			Class194_Sub14.method15513(canvas, (byte) -4);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class178_Sub2_Sub2 class178_sub2_sub2_1_ = new Class178_Sub2_Sub2(opengl, canvas, l, class172, interface25, interface46, interface48, interface45, class472, i);
			class178_sub2_sub2_1_.method15293();
			class178_sub2_sub2 = class178_sub2_sub2_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class178_sub2_sub2;
	}

	public static Class178 method7769(Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i) {
		Class178_Sub2_Sub2 class178_sub2_sub2;
		try {
			Class178_Sub2.method15270();
			Class523_Sub24.method16142(1549621487).method383("jaggl", 2106472487);
			Class194_Sub14.method15513(canvas, (byte) 59);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class178_Sub2_Sub2 class178_sub2_sub2_2_ = new Class178_Sub2_Sub2(opengl, canvas, l, class172, interface25, interface46, interface48, interface45, class472, i);
			class178_sub2_sub2_2_.method15293();
			class178_sub2_sub2 = class178_sub2_sub2_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class178_sub2_sub2;
	}
}
