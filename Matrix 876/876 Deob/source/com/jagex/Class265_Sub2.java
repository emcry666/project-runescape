/* Class265_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class265_Sub2 extends Class265 {
	Class270_Sub1 aClass270_Sub1_10064;
	Class178_Sub2_Sub2 aClass178_Sub2_Sub2_10065;
	int anInt10066;

	public void method4792() {
		/* empty */
	}

	Class270 method4754(Class178_Sub2 class178_sub2, Class264 class264) {
		return new Class270_Sub1((Class178_Sub2_Sub2) class178_sub2, this, class264);
	}

	public boolean method4852(Class270 class270) {
		if (aClass270_Sub1_10064 == class270)
			return true;
		if (!class270.method4927())
			return false;
		boolean bool = method4865();
		aClass270_Sub1_10064 = (Class270_Sub1) class270;
		anInt2857 = method4758(class270, 453174601) * -1636378953;
		if (anInt2857 * -267917561 == -1)
			throw new IllegalArgumentException();
		anInt10066 = aClass270_Sub1_10064.anInt9976;
		if (bool) {
			OpenGL.glUseProgram(anInt10066);
			aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 = aClass270_Sub1_10064;
		}
		return true;
	}

	Class523_Sub4_Sub1 method4763(Class272 class272) {
		return new Class523_Sub4_Sub1_Sub1(this, class272);
	}

	public void finalize() throws Throwable {
		method4834();
		super.finalize();
	}

	public boolean method4752(Class270 class270) {
		if (aClass270_Sub1_10064 == class270)
			return true;
		if (!class270.method4927())
			return false;
		boolean bool = method4865();
		aClass270_Sub1_10064 = (Class270_Sub1) class270;
		anInt2857 = method4758(class270, -198970821) * -1636378953;
		if (anInt2857 * -267917561 == -1)
			throw new IllegalArgumentException();
		anInt10066 = aClass270_Sub1_10064.anInt9976;
		if (bool) {
			OpenGL.glUseProgram(anInt10066);
			aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 = aClass270_Sub1_10064;
		}
		return true;
	}

	public boolean method4865() {
		return (aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 == aClass270_Sub1_10064);
	}

	void method4834() {
		for (int i = 0; i < method4756((byte) -108); i++)
			((Class270_Sub1) method4749(i, (byte) -45)).method131();
		super.method4834();
	}

	public void method4797() {
		/* empty */
	}

	public void method4750() {
		if (aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 != aClass270_Sub1_10064) {
			if (aClass270_Sub1_10064 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(anInt10066);
			aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 = aClass270_Sub1_10064;
		}
	}

	public void method4790() {
		if (aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 != aClass270_Sub1_10064) {
			if (aClass270_Sub1_10064 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(anInt10066);
			aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 = aClass270_Sub1_10064;
		}
	}

	public void method4774() {
		if (aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 != aClass270_Sub1_10064) {
			if (aClass270_Sub1_10064 == null)
				throw new RuntimeException_Sub1();
			OpenGL.glUseProgram(anInt10066);
			aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 = aClass270_Sub1_10064;
		}
	}

	Class265_Sub2(Class178_Sub2_Sub2 class178_sub2_sub2, Class279 class279) {
		super((Class178_Sub2) class178_sub2_sub2, class279);
		aClass178_Sub2_Sub2_10065 = class178_sub2_sub2;
	}

	public void method4809() {
		/* empty */
	}

	public boolean method4794() {
		return (aClass178_Sub2_Sub2_10065.aClass270_Sub1_11505 == aClass270_Sub1_10064);
	}

	Class270 method4800(Class178_Sub2 class178_sub2, Class264 class264) {
		return new Class270_Sub1((Class178_Sub2_Sub2) class178_sub2, this, class264);
	}

	void method15592() throws Throwable {
		method4834();
		super.finalize();
	}

	Class270 method4854(Class178_Sub2 class178_sub2, Class264 class264) {
		return new Class270_Sub1((Class178_Sub2_Sub2) class178_sub2, this, class264);
	}

	Class270 method4874(Class178_Sub2 class178_sub2, Class264 class264) {
		return new Class270_Sub1((Class178_Sub2_Sub2) class178_sub2, this, class264);
	}

	Class270 method4801(Class178_Sub2 class178_sub2, Class264 class264) {
		return new Class270_Sub1((Class178_Sub2_Sub2) class178_sub2, this, class264);
	}

	Class523_Sub4_Sub1 method4821(Class272 class272) {
		return new Class523_Sub4_Sub1_Sub1(this, class272);
	}

	void method4808() {
		for (int i = 0; i < method4756((byte) -8); i++)
			((Class270_Sub1) method4749(i, (byte) -86)).method131();
		super.method4834();
	}

	void method4819() {
		for (int i = 0; i < method4756((byte) -36); i++)
			((Class270_Sub1) method4749(i, (byte) -49)).method131();
		super.method4834();
	}
}
