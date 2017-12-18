/* Class168_Sub2_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class168_Sub2_Sub1_Sub2 extends Class168_Sub2_Sub1 {
	OpenGL anOpenGL12057;
	long aLong12058;
	Canvas aCanvas12059;
	int anInt12060;
	int anInt12061;
	boolean aBool12062 = false;

	void method18507() {
		Dimension dimension = aCanvas12059.getSize();
		anInt12061 = dimension.height;
		anInt12060 = dimension.width;
	}

	Class168_Sub2_Sub1_Sub2(Class178_Sub2_Sub2 class178_sub2_sub2, Canvas canvas, long l) {
		super(class178_sub2_sub2);
		aCanvas12059 = canvas;
		anOpenGL12057 = class178_sub2_sub2.anOpenGL11517;
		aLong12058 = l;
		method18507();
	}

	public int method2880() {
		return anInt12060;
	}

	public int method2874() {
		return anInt12061;
	}

	public int method2875() {
		return anInt12060;
	}

	public int method2878() {
		return anInt12060;
	}

	public int method15400() {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		anOpenGL12057.swapBuffers(aLong12058);
		return 0;
	}

	public void method73() {
		if (aLong12058 != 0L) {
			anOpenGL12057.releaseSurface(aCanvas12059, aLong12058);
			aLong12058 = 0L;
		}
	}

	void method15402(int i, int i_0_) {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		anOpenGL12057.surfaceResized(aLong12058);
		method18507();
		super.method15402(i, i_0_);
	}

	boolean method2873() {
		return true;
	}

	public void method131() {
		if (aLong12058 != 0L) {
			anOpenGL12057.releaseSurface(aCanvas12059, aLong12058);
			aLong12058 = 0L;
		}
	}

	boolean method359() {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12062) {
			bool = anOpenGL12057.setSurface(aLong12058);
			aBool12062 = true;
		}
		return bool && super.method359();
	}

	boolean method2876() {
		return true;
	}

	void method15405(int i, int i_1_) {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		anOpenGL12057.surfaceResized(aLong12058);
		method18507();
		super.method15402(i, i_1_);
	}

	public int method2879() {
		return anInt12061;
	}

	boolean method360() {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!aBool12062) {
			bool = anOpenGL12057.setSurface(aLong12058);
			aBool12062 = true;
		}
		return bool && super.method359();
	}

	public int method2877() {
		return anInt12060;
	}

	public int method15401(int i, int i_2_) {
		return 0;
	}

	void method15403(int i, int i_3_) {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		anOpenGL12057.surfaceResized(aLong12058);
		method18507();
		super.method15402(i, i_3_);
	}

	public int method15404() {
		if (aLong12058 == 0L)
			throw new IllegalStateException("");
		anOpenGL12057.swapBuffers(aLong12058);
		return 0;
	}

	public int method15399(int i, int i_4_) {
		return 0;
	}

	public int method15406(int i, int i_5_) {
		return 0;
	}

	public int method15407(int i, int i_6_) {
		return 0;
	}

	Class168_Sub2_Sub1_Sub2(Class178_Sub2_Sub2 class178_sub2_sub2, Canvas canvas) {
		this(class178_sub2_sub2, canvas, class178_sub2_sub2.anOpenGL11517.prepareSurface(canvas));
	}

	public int method15408(int i, int i_7_) {
		return 0;
	}

	public void method361() {
		if (aLong12058 != 0L) {
			anOpenGL12057.releaseSurface(aCanvas12059, aLong12058);
			aLong12058 = 0L;
		}
	}
}
