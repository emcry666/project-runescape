/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class407 implements Interface52 {
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_4199;
	Class170 aClass170_4200;
	int anInt4201;
	int anInt4202;
	long aLong4203;

	public void method132() {
		if (aLong4203 != 0L) {
			IUnknown.Release(aLong4203);
			aLong4203 = 0L;
		}
		aClass178_Sub2_Sub1_4199.method14917(this);
	}

	public int method68() {
		return anInt4202;
	}

	public int method82() {
		return anInt4202;
	}

	public long method366() {
		return aLong4203;
	}

	public void method131() {
		if (aLong4203 != 0L) {
			IUnknown.Release(aLong4203);
			aLong4203 = 0L;
		}
		aClass178_Sub2_Sub1_4199.method14917(this);
	}

	public void method361() {
		if (aLong4203 != 0L) {
			aClass178_Sub2_Sub1_4199.method17839(aLong4203);
			aLong4203 = 0L;
		}
	}

	void method6616() {
		method361();
	}

	public void finalize() {
		method361();
	}

	public void method130() {
		if (aLong4203 != 0L) {
			IUnknown.Release(aLong4203);
			aLong4203 = 0L;
		}
		aClass178_Sub2_Sub1_4199.method14917(this);
	}

	public int method6() {
		return anInt4202;
	}

	public int method1() {
		return anInt4201;
	}

	public int method86() {
		return anInt4201;
	}

	public void method78() {
		if (aLong4203 != 0L) {
			IUnknown.Release(aLong4203);
			aLong4203 = 0L;
		}
		aClass178_Sub2_Sub1_4199.method14917(this);
	}

	Class407(Class178_Sub2_Sub1 class178_sub2_sub1, Class170 class170, int i, int i_0_, int i_1_) {
		aClass178_Sub2_Sub1_4199 = class178_sub2_sub1;
		anInt4201 = i;
		anInt4202 = i_0_;
		aClass170_4200 = class170;
		aLong4203 = (IDirect3DDevice.CreateDepthStencilSurface(aClass178_Sub2_Sub1_4199.aLong11412, i, i_0_, Class178_Sub2_Sub1.method17836(aClass170_4200), 0 + i_1_, 0, false));
		aClass178_Sub2_Sub1_4199.method15243(this);
	}

	public int method88() {
		return anInt4201;
	}

	public int method38() {
		return anInt4202;
	}

	public void method363() {
		if (aLong4203 != 0L) {
			aClass178_Sub2_Sub1_4199.method17839(aLong4203);
			aLong4203 = 0L;
		}
	}

	public long method364() {
		return aLong4203;
	}

	public long method365() {
		return aLong4203;
	}

	public long method367() {
		return aLong4203;
	}
}
