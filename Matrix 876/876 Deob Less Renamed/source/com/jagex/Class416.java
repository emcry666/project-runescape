/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class416 implements Interface53 {
	int anInt4586;
	Class170 aClass170_4587;
	Class158 aClass158_4588;
	int anInt4589;
	long aLong4590;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_4591;

	public long method364() {
		return aLong4590;
	}

	public int method1() {
		return anInt4589;
	}

	public int method82() {
		return anInt4586;
	}

	public long method366() {
		return aLong4590;
	}

	public void method131() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass178_Sub2_Sub1_4591.method14917(this);
	}

	public void method361() {
		if (aLong4590 != 0L) {
			aClass178_Sub2_Sub1_4591.method17839(aLong4590);
			aLong4590 = 0L;
		}
	}

	public void finalize() {
		method361();
	}

	public int method38() {
		return anInt4586;
	}

	public long method367() {
		return aLong4590;
	}

	public int method68() {
		return anInt4586;
	}

	public void method130() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass178_Sub2_Sub1_4591.method14917(this);
	}

	public void method132() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass178_Sub2_Sub1_4591.method14917(this);
	}

	void method6656() {
		method361();
	}

	public int method86() {
		return anInt4589;
	}

	public int method88() {
		return anInt4589;
	}

	public long method365() {
		return aLong4590;
	}

	public void method78() {
		if (aLong4590 != 0L) {
			IUnknown.Release(aLong4590);
			aLong4590 = 0L;
		}
		aClass178_Sub2_Sub1_4591.method14917(this);
	}

	public int method6() {
		return anInt4586;
	}

	Class416(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, Class170 class170, int i, int i_0_, int i_1_) {
		aClass178_Sub2_Sub1_4591 = class178_sub2_sub1;
		anInt4589 = i;
		anInt4586 = i_0_;
		aClass158_4588 = class158;
		aClass170_4587 = class170;
		aLong4590 = (IDirect3DDevice.CreateRenderTarget(aClass178_Sub2_Sub1_4591.aLong11412, i, i_0_, Class178_Sub2_Sub1.method17835(aClass158_4588, aClass170_4587), 0 + i_1_, 0, false));
		aClass178_Sub2_Sub1_4591.method15243(this);
	}

	public void method363() {
		if (aLong4590 != 0L) {
			aClass178_Sub2_Sub1_4591.method17839(aLong4590);
			aLong4590 = 0L;
		}
	}
}
