/* Class168_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class358;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class168_Sub1_Sub1_Sub1 extends Class168_Sub1_Sub1 {
	boolean aBool12066;
	int anInt12067;
	int anInt12068;
	int anInt12069;
	static final int anInt12070 = 16;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_12071;
	Interface52 anInterface52_12072 = null;
	Interface53[] anInterface53Array12073 = new Interface53[4];

	void method18514() {
		if (anInterface52_12072 != null)
			anInterface52_12072.method361();
		for (int i = 0; i < anInterface53Array12073.length; i++) {
			if (anInterface53Array12073[i] != null)
				anInterface53Array12073[i].method361();
		}
	}

	public int method2875() {
		return anInt12068;
	}

	public int method2874() {
		return anInt12069;
	}

	public void method14423(Interface23 interface23) {
		Interface52 interface52 = (Interface52) interface23;
		if (interface23 != null) {
			if (anInt12067 != 0) {
				if (anInt12068 != interface52.method1() || anInt12069 != interface52.method82())
					throw new RuntimeException();
			} else {
				anInt12069 = interface52.method82();
				anInt12068 = interface52.method1();
				method17752();
			}
			anInt12067 |= 0x10;
			anInterface52_12072 = interface52;
			if (aBool12066)
				method18516(interface52.method366());
		} else {
			anInt12067 &= ~0x10;
			anInterface52_12072 = null;
			if (aBool12066)
				method18516(0L);
			if (anInt12067 == 0) {
				anInt12069 = 0;
				anInt12068 = 0;
			}
		}
	}

	public void method14422(int i, Interface22 interface22) {
		int i_0_ = 1 << i;
		Interface53 interface53 = (Interface53) interface22;
		if (interface22 != null) {
			if (anInt12067 != 0) {
				if (anInt12068 != interface53.method1() || anInt12069 != interface53.method82())
					throw new RuntimeException();
			} else {
				anInt12069 = interface53.method82();
				anInt12068 = interface53.method1();
				method17752();
			}
			anInt12067 |= i_0_;
			anInterface53Array12073[i] = interface53;
			if (aBool12066)
				method18515(i, interface53.method366());
		} else {
			anInt12067 &= i_0_ ^ 0xffffffff;
			anInterface53Array12073[i] = null;
			if (aBool12066)
				method18515(i, 0L);
			if (anInt12067 == 0) {
				anInt12069 = 0;
				anInt12068 = 0;
			}
		}
	}

	boolean method18515(int i, long l) {
		return Class358.method6281(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_12071.aLong11412, i, l));
	}

	boolean method18516(long l) {
		return Class358.method6281(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_12071.aLong11412, l));
	}

	boolean method360() {
		for (int i = 0; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12073[i];
			if (interface53 != null) {
				long l = interface53.method366();
				method18515(i, l);
			}
		}
		if (anInterface52_12072 != null)
			method18516(anInterface52_12072.method366());
		aBool12066 = true;
		return super.method359();
	}

	boolean method18517(long l) {
		return Class358.method6281(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_12071.aLong11412, l));
	}

	boolean method2873() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12073[i];
			if (interface53 != null)
				method18515(i, 0L);
		}
		if (anInterface52_12072 != null)
			method18516(0L);
		aBool12066 = false;
		return true;
	}

	public void method14433(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, boolean bool_6_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass178_Sub2_Sub1_12071.aLong11412), 0);
			IDirect3DDevice.StretchRect(aClass178_Sub2_Sub1_12071.aLong11412, anInterface53Array12073[0].method366(), i, i_1_, i_2_, i_3_, l, i_4_, i_5_, i_2_, i_3_, 0);
			IUnknown.Release(l);
		}
	}

	public boolean method14431() {
		return anInterface53Array12073[0] != null;
	}

	boolean method2876() {
		for (int i = 1; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12073[i];
			if (interface53 != null)
				method18515(i, 0L);
		}
		if (anInterface52_12072 != null)
			method18516(0L);
		aBool12066 = false;
		return true;
	}

	public void finalize() throws Throwable {
		method18514();
		super.finalize();
	}

	public int method2877() {
		return anInt12068;
	}

	public int method2878() {
		return anInt12068;
	}

	public int method2880() {
		return anInt12068;
	}

	public int method2879() {
		return anInt12069;
	}

	public void method14424(int i, Interface22 interface22) {
		int i_7_ = 1 << i;
		Interface53 interface53 = (Interface53) interface22;
		if (interface22 != null) {
			if (anInt12067 != 0) {
				if (anInt12068 != interface53.method1() || anInt12069 != interface53.method82())
					throw new RuntimeException();
			} else {
				anInt12069 = interface53.method82();
				anInt12068 = interface53.method1();
				method17752();
			}
			anInt12067 |= i_7_;
			anInterface53Array12073[i] = interface53;
			if (aBool12066)
				method18515(i, interface53.method366());
		} else {
			anInt12067 &= i_7_ ^ 0xffffffff;
			anInterface53Array12073[i] = null;
			if (aBool12066)
				method18515(i, 0L);
			if (anInt12067 == 0) {
				anInt12069 = 0;
				anInt12068 = 0;
			}
		}
	}

	boolean method18518(long l) {
		return Class358.method6281(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_12071.aLong11412, l));
	}

	public void method14429(Interface23 interface23) {
		Interface52 interface52 = (Interface52) interface23;
		if (interface23 != null) {
			if (anInt12067 != 0) {
				if (anInt12068 != interface52.method1() || anInt12069 != interface52.method82())
					throw new RuntimeException();
			} else {
				anInt12069 = interface52.method82();
				anInt12068 = interface52.method1();
				method17752();
			}
			anInt12067 |= 0x10;
			anInterface52_12072 = interface52;
			if (aBool12066)
				method18516(interface52.method366());
		} else {
			anInt12067 &= ~0x10;
			anInterface52_12072 = null;
			if (aBool12066)
				method18516(0L);
			if (anInt12067 == 0) {
				anInt12069 = 0;
				anInt12068 = 0;
			}
		}
	}

	public boolean method14430() {
		return anInterface53Array12073[0] != null;
	}

	public void method14434(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, boolean bool_13_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget((aClass178_Sub2_Sub1_12071.aLong11412), 0);
			IDirect3DDevice.StretchRect(aClass178_Sub2_Sub1_12071.aLong11412, anInterface53Array12073[0].method366(), i, i_8_, i_9_, i_10_, l, i_11_, i_12_, i_9_, i_10_, 0);
			IUnknown.Release(l);
		}
	}

	public boolean method14425() {
		return anInterface53Array12073[0] != null;
	}

	public boolean method14432() {
		return anInterface53Array12073[0] != null;
	}

	public boolean method14428() {
		return anInterface53Array12073[0] != null;
	}

	boolean method359() {
		for (int i = 0; i < 4; i++) {
			Interface53 interface53 = anInterface53Array12073[i];
			if (interface53 != null) {
				long l = interface53.method366();
				method18515(i, l);
			}
		}
		if (anInterface52_12072 != null)
			method18516(anInterface52_12072.method366());
		aBool12066 = true;
		return super.method359();
	}

	boolean method18519(int i, long l) {
		return Class358.method6281(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_12071.aLong11412, i, l));
	}

	Class168_Sub1_Sub1_Sub1(Class178_Sub2_Sub1 class178_sub2_sub1) {
		super((Class178_Sub2) class178_sub2_sub1);
		aClass178_Sub2_Sub1_12071 = class178_sub2_sub1;
	}

	public void method73() {
		if (anInterface52_12072 != null)
			anInterface52_12072.method131();
		for (int i = 0; i < anInterface53Array12073.length; i++) {
			if (anInterface53Array12073[i] != null)
				anInterface53Array12073[i].method131();
		}
	}

	public void method131() {
		if (anInterface52_12072 != null)
			anInterface52_12072.method131();
		for (int i = 0; i < anInterface53Array12073.length; i++) {
			if (anInterface53Array12073[i] != null)
				anInterface53Array12073[i].method131();
		}
	}

	void method18520() throws Throwable {
		method18514();
		super.finalize();
	}

	public boolean method14426() {
		return anInterface53Array12073[0] != null;
	}

	boolean method18521(int i, long l) {
		return Class358.method6281(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_12071.aLong11412, i, l));
	}

	boolean method18522(int i, long l) {
		return Class358.method6281(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_12071.aLong11412, i, l));
	}

	boolean method18523(int i, long l) {
		return Class358.method6281(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_12071.aLong11412, i, l));
	}

	boolean method18524(int i, long l) {
		return Class358.method6281(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_12071.aLong11412, i, l));
	}

	public void method361() {
		if (anInterface52_12072 != null)
			anInterface52_12072.method131();
		for (int i = 0; i < anInterface53Array12073.length; i++) {
			if (anInterface53Array12073[i] != null)
				anInterface53Array12073[i].method131();
		}
	}

	public void method14427(int i, Interface22 interface22) {
		int i_14_ = 1 << i;
		Interface53 interface53 = (Interface53) interface22;
		if (interface22 != null) {
			if (anInt12067 != 0) {
				if (anInt12068 != interface53.method1() || anInt12069 != interface53.method82())
					throw new RuntimeException();
			} else {
				anInt12069 = interface53.method82();
				anInt12068 = interface53.method1();
				method17752();
			}
			anInt12067 |= i_14_;
			anInterface53Array12073[i] = interface53;
			if (aBool12066)
				method18515(i, interface53.method366());
		} else {
			anInt12067 &= i_14_ ^ 0xffffffff;
			anInterface53Array12073[i] = null;
			if (aBool12066)
				method18515(i, 0L);
			if (anInt12067 == 0) {
				anInt12069 = 0;
				anInt12068 = 0;
			}
		}
	}
}
