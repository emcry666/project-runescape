/* Class168_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class168_Sub2_Sub3 extends Class168_Sub2 {
	OpenGL anOpenGL11385;
	Class178_Sub1 aClass178_Sub1_11386;
	long aLong11387;
	Canvas aCanvas11388;
	int anInt11389;
	int anInt11390;
	boolean aBool11391 = false;
	boolean aBool11392 = false;

	public int method15408(int i, int i_0_) {
		return 0;
	}

	Class168_Sub2_Sub3(Class178_Sub1 class178_sub1, Canvas canvas, long l) {
		aClass178_Sub1_11386 = class178_sub1;
		aCanvas11388 = canvas;
		anOpenGL11385 = class178_sub1.anOpenGL9272;
		aLong11387 = l;
		method17800();
	}

	public int method2875() {
		return anInt11389;
	}

	boolean method2876() {
		return true;
	}

	void method15402(int i, int i_1_) {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.surfaceResized(aLong11387);
		method17800();
		if (this == aClass178_Sub1_11386.method3039(2017180449))
			aClass178_Sub1_11386.method14624();
	}

	public int method2879() {
		return anInt11390;
	}

	public int method15400() {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.swapBuffers(aLong11387);
		return 0;
	}

	public int method15401(int i, int i_2_) {
		return 0;
	}

	public int method2877() {
		return anInt11389;
	}

	void method17799() {
		Dimension dimension = aCanvas11388.getSize();
		anInt11390 = dimension.height;
		anInt11389 = dimension.width;
	}

	public void method131() {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.releaseSurface(aCanvas11388, aLong11387);
		aBool11391 = true;
		aBool11392 = false;
	}

	public int method15404() {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.swapBuffers(aLong11387);
		return 0;
	}

	public int method2878() {
		return anInt11389;
	}

	public int method2880() {
		return anInt11389;
	}

	void method17800() {
		Dimension dimension = aCanvas11388.getSize();
		anInt11390 = dimension.height;
		anInt11389 = dimension.width;
	}

	boolean method360() {
		if (aBool11391)
			throw new IllegalStateException();
		if (!aBool11392) {
			anOpenGL11385.setSurface(aLong11387);
			aBool11392 = true;
		}
		aClass178_Sub1_11386.method14655();
		return true;
	}

	boolean method2873() {
		return true;
	}

	void method15405(int i, int i_3_) {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.surfaceResized(aLong11387);
		method17800();
		if (this == aClass178_Sub1_11386.method3039(1371062277))
			aClass178_Sub1_11386.method14624();
	}

	boolean method359() {
		if (aBool11391)
			throw new IllegalStateException();
		if (!aBool11392) {
			anOpenGL11385.setSurface(aLong11387);
			aBool11392 = true;
		}
		aClass178_Sub1_11386.method14655();
		return true;
	}

	public int method15407(int i, int i_4_) {
		return 0;
	}

	public int method15399(int i, int i_5_) {
		return 0;
	}

	public int method15406(int i, int i_6_) {
		return 0;
	}

	Class168_Sub2_Sub3(Class178_Sub1 class178_sub1, Canvas canvas) {
		this(class178_sub1, canvas, class178_sub1.anOpenGL9272.prepareSurface(canvas));
	}

	void method17801() {
		Dimension dimension = aCanvas11388.getSize();
		anInt11390 = dimension.height;
		anInt11389 = dimension.width;
	}

	public void method73() {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.releaseSurface(aCanvas11388, aLong11387);
		aBool11391 = true;
		aBool11392 = false;
	}

	public void method361() {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.releaseSurface(aCanvas11388, aLong11387);
		aBool11391 = true;
		aBool11392 = false;
	}

	void method15403(int i, int i_7_) {
		if (aBool11391)
			throw new IllegalStateException();
		anOpenGL11385.surfaceResized(aLong11387);
		method17800();
		if (this == aClass178_Sub1_11386.method3039(1782257205))
			aClass178_Sub1_11386.method14624();
	}

	public int method2874() {
		return anInt11390;
	}
}
