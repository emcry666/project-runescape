/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class403 implements Interface53, Interface52 {
	int anInt4170;
	Class404_Sub3_Sub1 aClass404_Sub3_Sub1_4171;
	long aLong4172;

	public int method6() {
		return aClass404_Sub3_Sub1_4171.method82();
	}

	public int method1() {
		return aClass404_Sub3_Sub1_4171.method1();
	}

	public int method82() {
		return aClass404_Sub3_Sub1_4171.method82();
	}

	void method6589() {
		method361();
	}

	public void method131() {
		if (aLong4172 != 0L) {
			IUnknown.Release(aLong4172);
			aLong4172 = 0L;
		}
		aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method14917(this);
	}

	public void method361() {
		if (aLong4172 != 0L) {
			aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method17839(aLong4172);
			aLong4172 = 0L;
		}
	}

	public void finalize() {
		method361();
	}

	public int method38() {
		return aClass404_Sub3_Sub1_4171.method82();
	}

	Class403(Class404_Sub3_Sub1 class404_sub3_sub1, int i) {
		anInt4170 = i;
		aClass404_Sub3_Sub1_4171 = class404_sub3_sub1;
		aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method15243(this);
	}

	public long method364() {
		if (aLong4172 == 0L)
			aLong4172 = IDirect3DTexture.GetSurfaceLevel((aClass404_Sub3_Sub1_4171.aLong4173), anInt4170);
		return aLong4172;
	}

	public void method130() {
		if (aLong4172 != 0L) {
			IUnknown.Release(aLong4172);
			aLong4172 = 0L;
		}
		aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method14917(this);
	}

	public void method132() {
		if (aLong4172 != 0L) {
			IUnknown.Release(aLong4172);
			aLong4172 = 0L;
		}
		aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method14917(this);
	}

	public long method366() {
		if (aLong4172 == 0L)
			aLong4172 = IDirect3DTexture.GetSurfaceLevel((aClass404_Sub3_Sub1_4171.aLong4173), anInt4170);
		return aLong4172;
	}

	public int method86() {
		return aClass404_Sub3_Sub1_4171.method1();
	}

	public int method68() {
		return aClass404_Sub3_Sub1_4171.method82();
	}

	public int method88() {
		return aClass404_Sub3_Sub1_4171.method1();
	}

	public void method363() {
		if (aLong4172 != 0L) {
			aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method17839(aLong4172);
			aLong4172 = 0L;
		}
	}

	public void method78() {
		if (aLong4172 != 0L) {
			IUnknown.Release(aLong4172);
			aLong4172 = 0L;
		}
		aClass404_Sub3_Sub1_4171.aClass178_Sub2_Sub1_4176.method14917(this);
	}

	public long method365() {
		if (aLong4172 == 0L)
			aLong4172 = IDirect3DTexture.GetSurfaceLevel((aClass404_Sub3_Sub1_4171.aLong4173), anInt4170);
		return aLong4172;
	}

	public long method367() {
		if (aLong4172 == 0L)
			aLong4172 = IDirect3DTexture.GetSurfaceLevel((aClass404_Sub3_Sub1_4171.aLong4173), anInt4170);
		return aLong4172;
	}
}
