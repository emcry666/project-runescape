/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IUnknown;

public abstract class Class404 implements Interface35 {
	long aLong4173 = 0L;
	Class158 aClass158_4174;
	boolean aBool4175;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_4176;
	Class170 aClass170_4177;

	Class404(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, Class170 class170, boolean bool, int i) {
		aClass178_Sub2_Sub1_4176 = class178_sub2_sub1;
		aClass158_4174 = class158;
		aClass170_4177 = class170;
		aBool4175 = bool;
		aClass178_Sub2_Sub1_4176.method15243(this);
	}

	long method6590() {
		return aLong4173;
	}

	public void method330(Class342 class342) {
		/* empty */
	}

	public void method131() {
		if (aLong4173 != 0L) {
			IUnknown.Release(aLong4173);
			aLong4173 = 0L;
		}
		aClass178_Sub2_Sub1_4176.method14917(this);
	}

	void method6591() {
		if (aLong4173 != 0L) {
			aClass178_Sub2_Sub1_4176.method17839(aLong4173);
			aLong4173 = 0L;
		}
	}

	public void finalize() {
		method6591();
	}

	public void method130() {
		if (aLong4173 != 0L) {
			IUnknown.Release(aLong4173);
			aLong4173 = 0L;
		}
		aClass178_Sub2_Sub1_4176.method14917(this);
	}

	void method6592() {
		if (aLong4173 != 0L) {
			aClass178_Sub2_Sub1_4176.method17839(aLong4173);
			aLong4173 = 0L;
		}
	}

	public void method78() {
		if (aLong4173 != 0L) {
			IUnknown.Release(aLong4173);
			aLong4173 = 0L;
		}
		aClass178_Sub2_Sub1_4176.method14917(this);
	}

	void method6593() {
		method6591();
	}

	public void method335(Class342 class342) {
		/* empty */
	}

	public void method333(Class342 class342) {
		/* empty */
	}

	public void method334(Class342 class342) {
		/* empty */
	}

	public void method329(Class342 class342) {
		/* empty */
	}

	long method6594() {
		return aLong4173;
	}

	long method6595() {
		return aLong4173;
	}

	public void method132() {
		if (aLong4173 != 0L) {
			IUnknown.Release(aLong4173);
			aLong4173 = 0L;
		}
		aClass178_Sub2_Sub1_4176.method14917(this);
	}

	long method6596() {
		return aLong4173;
	}

	long method6597() {
		return aLong4173;
	}

	void method6598() {
		if (aLong4173 != 0L) {
			aClass178_Sub2_Sub1_4176.method17839(aLong4173);
			aLong4173 = 0L;
		}
	}

	void method6599() {
		if (aLong4173 != 0L) {
			aClass178_Sub2_Sub1_4176.method17839(aLong4173);
			aLong4173 = 0L;
		}
	}

	void method6600() {
		if (aLong4173 != 0L) {
			aClass178_Sub2_Sub1_4176.method17839(aLong4173);
			aLong4173 = 0L;
		}
	}

	void method6601() {
		if (aLong4173 != 0L) {
			aClass178_Sub2_Sub1_4176.method17839(aLong4173);
			aLong4173 = 0L;
		}
	}

	long method6602() {
		return aLong4173;
	}
}
