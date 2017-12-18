/* Class168_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jagdx.Class358;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class168_Sub2_Sub1_Sub1 extends Class168_Sub2_Sub1 implements Interface51 {
	int anInt11958;
	long aLong11959;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_11960;
	long aLong11961;
	long aLong11962;
	int anInt11963;
	Canvas aCanvas11964;
	boolean aBool11965 = false;
	boolean aBool11966 = false;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11967;

	public int method15399(int i, int i_0_) {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	public void method363() {
		if (aLong11962 == 0L) {
			aD3DPRESENT_PARAMETERS11967 = new D3DPRESENT_PARAMETERS(aCanvas11964);
			aD3DPRESENT_PARAMETERS11967.Windowed = true;
			aD3DPRESENT_PARAMETERS11967.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11967.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11967.BackBufferWidth = anInt11963;
			aD3DPRESENT_PARAMETERS11967.BackBufferHeight = anInt11958;
			if (aBool11966) {
				aLong11962 = IDirect3DDevice.GetSwapChain((aClass178_Sub2_Sub1_11960.aLong11412), 0);
				aLong11959 = IDirect3DSwapChain.GetBackBuffer(aLong11962, 0, 0);
				aLong11961 = (IDirect3DDevice.GetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412));
			} else {
				if (!Class178_Sub2_Sub1.method17838(aClass178_Sub2_Sub1_11960.anInt11441, aClass178_Sub2_Sub1_11960.anInt11424, aClass178_Sub2_Sub1_11960.aLong11411, aClass178_Sub2_Sub1_11960.anInt9661, aClass178_Sub2_Sub1_11960.aD3DDISPLAYMODE11447, aD3DPRESENT_PARAMETERS11967))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11967.AutoDepthStencilFormat;
				aLong11962 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass178_Sub2_Sub1_11960.aLong11412, aD3DPRESENT_PARAMETERS11967));
				aLong11959 = IDirect3DSwapChain.GetBackBuffer(aLong11962, 0, 0);
				aLong11961 = (IDirect3DDevice.CreateDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, anInt11963, anInt11958, i, aD3DPRESENT_PARAMETERS11967.MultiSampleType, aD3DPRESENT_PARAMETERS11967.MultiSampleQuality, false));
			}
			aClass178_Sub2_Sub1_11960.method17816(this);
		}
		if (aBool11965)
			method359();
	}

	public int method2875() {
		return anInt11963;
	}

	public int method2874() {
		return anInt11958;
	}

	void method15403(int i, int i_1_) {
		method131();
		anInt11963 = i;
		anInt11958 = i_1_;
		if (aBool11966)
			aClass178_Sub2_Sub1_11960.method17814(anInt11963, anInt11958);
		method363();
		super.method15402(i, i_1_);
	}

	boolean method2873() {
		aBool11965 = false;
		return Class358.method6281(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, 0L));
	}

	public int method15400() {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	public int method15401(int i, int i_2_) {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	void method15402(int i, int i_3_) {
		method131();
		anInt11963 = i;
		anInt11958 = i_3_;
		if (aBool11966)
			aClass178_Sub2_Sub1_11960.method17814(anInt11963, anInt11958);
		method363();
		super.method15402(i, i_3_);
	}

	public void method131() {
		if (aLong11959 != 0L) {
			IUnknown.Release(aLong11959);
			aLong11959 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		aClass178_Sub2_Sub1_11960.method17817(this);
	}

	void method18419() {
		if (aLong11959 != 0L) {
			IUnknown.Release(aLong11959);
			aLong11959 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		aClass178_Sub2_Sub1_11960.method17817(this);
	}

	public boolean method359() {
		aBool11965 = true;
		if (aLong11962 == 0L) {
			if (aClass178_Sub2_Sub1_11960.aBool11416)
				return false;
			method363();
		}
		if (Class358.method6280(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_11960.aLong11412, 0, aLong11959)))
			return false;
		if (Class358.method6280(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, aLong11961)))
			return false;
		return super.method359();
	}

	public int method2877() {
		return anInt11963;
	}

	public int method2878() {
		return anInt11963;
	}

	Class168_Sub2_Sub1_Sub1(Class178_Sub2_Sub1 class178_sub2_sub1, Canvas canvas, int i, int i_4_, boolean bool) {
		super(class178_sub2_sub1);
		aCanvas11964 = canvas;
		aClass178_Sub2_Sub1_11960 = class178_sub2_sub1;
		anInt11963 = i;
		anInt11958 = i_4_;
		aBool11966 = bool;
		method363();
	}

	public boolean method360() {
		aBool11965 = true;
		if (aLong11962 == 0L) {
			if (aClass178_Sub2_Sub1_11960.aBool11416)
				return false;
			method363();
		}
		if (Class358.method6280(IDirect3DDevice.SetRenderTarget(aClass178_Sub2_Sub1_11960.aLong11412, 0, aLong11959)))
			return false;
		if (Class358.method6280(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, aLong11961)))
			return false;
		return super.method359();
	}

	public void method362() {
		if (aLong11962 == 0L) {
			aD3DPRESENT_PARAMETERS11967 = new D3DPRESENT_PARAMETERS(aCanvas11964);
			aD3DPRESENT_PARAMETERS11967.Windowed = true;
			aD3DPRESENT_PARAMETERS11967.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11967.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11967.BackBufferWidth = anInt11963;
			aD3DPRESENT_PARAMETERS11967.BackBufferHeight = anInt11958;
			if (aBool11966) {
				aLong11962 = IDirect3DDevice.GetSwapChain((aClass178_Sub2_Sub1_11960.aLong11412), 0);
				aLong11959 = IDirect3DSwapChain.GetBackBuffer(aLong11962, 0, 0);
				aLong11961 = (IDirect3DDevice.GetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412));
			} else {
				if (!Class178_Sub2_Sub1.method17838(aClass178_Sub2_Sub1_11960.anInt11441, aClass178_Sub2_Sub1_11960.anInt11424, aClass178_Sub2_Sub1_11960.aLong11411, aClass178_Sub2_Sub1_11960.anInt9661, aClass178_Sub2_Sub1_11960.aD3DDISPLAYMODE11447, aD3DPRESENT_PARAMETERS11967))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11967.AutoDepthStencilFormat;
				aLong11962 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass178_Sub2_Sub1_11960.aLong11412, aD3DPRESENT_PARAMETERS11967));
				aLong11959 = IDirect3DSwapChain.GetBackBuffer(aLong11962, 0, 0);
				aLong11961 = (IDirect3DDevice.CreateDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, anInt11963, anInt11958, i, aD3DPRESENT_PARAMETERS11967.MultiSampleType, aD3DPRESENT_PARAMETERS11967.MultiSampleQuality, false));
			}
			aClass178_Sub2_Sub1_11960.method17816(this);
		}
		if (aBool11965)
			method359();
	}

	boolean method2876() {
		aBool11965 = false;
		return Class358.method6281(IDirect3DDevice.SetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, 0L));
	}

	public int method2879() {
		return anInt11958;
	}

	void method15405(int i, int i_5_) {
		method131();
		anInt11963 = i;
		anInt11958 = i_5_;
		if (aBool11966)
			aClass178_Sub2_Sub1_11960.method17814(anInt11963, anInt11958);
		method363();
		super.method15402(i, i_5_);
	}

	public void method73() {
		if (aLong11959 != 0L) {
			IUnknown.Release(aLong11959);
			aLong11959 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		aClass178_Sub2_Sub1_11960.method17817(this);
	}

	public void method361() {
		if (aLong11959 != 0L) {
			IUnknown.Release(aLong11959);
			aLong11959 = 0L;
		}
		if (aLong11961 != 0L) {
			IUnknown.Release(aLong11961);
			aLong11961 = 0L;
		}
		if (aLong11962 != 0L) {
			IUnknown.Release(aLong11962);
			aLong11962 = 0L;
		}
		aClass178_Sub2_Sub1_11960.method17817(this);
	}

	public int method15406(int i, int i_6_) {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	public int method15407(int i, int i_7_) {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	public int method15408(int i, int i_8_) {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	public int method2880() {
		return anInt11963;
	}

	public void finalize() throws Throwable {
		method18419();
		super.finalize();
	}

	void method18420() throws Throwable {
		method18419();
		super.finalize();
	}

	public int method15404() {
		return IDirect3DSwapChain.Present(aLong11962, 0);
	}

	public void method358() {
		if (aLong11962 == 0L) {
			aD3DPRESENT_PARAMETERS11967 = new D3DPRESENT_PARAMETERS(aCanvas11964);
			aD3DPRESENT_PARAMETERS11967.Windowed = true;
			aD3DPRESENT_PARAMETERS11967.BackBufferCount = 1;
			aD3DPRESENT_PARAMETERS11967.PresentationInterval = -2147483648;
			aD3DPRESENT_PARAMETERS11967.BackBufferWidth = anInt11963;
			aD3DPRESENT_PARAMETERS11967.BackBufferHeight = anInt11958;
			if (aBool11966) {
				aLong11962 = IDirect3DDevice.GetSwapChain((aClass178_Sub2_Sub1_11960.aLong11412), 0);
				aLong11959 = IDirect3DSwapChain.GetBackBuffer(aLong11962, 0, 0);
				aLong11961 = (IDirect3DDevice.GetDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412));
			} else {
				if (!Class178_Sub2_Sub1.method17838(aClass178_Sub2_Sub1_11960.anInt11441, aClass178_Sub2_Sub1_11960.anInt11424, aClass178_Sub2_Sub1_11960.aLong11411, aClass178_Sub2_Sub1_11960.anInt9661, aClass178_Sub2_Sub1_11960.aD3DDISPLAYMODE11447, aD3DPRESENT_PARAMETERS11967))
					throw new RuntimeException();
				int i = aD3DPRESENT_PARAMETERS11967.AutoDepthStencilFormat;
				aLong11962 = (IDirect3DDevice.CreateAdditionalSwapChain(aClass178_Sub2_Sub1_11960.aLong11412, aD3DPRESENT_PARAMETERS11967));
				aLong11959 = IDirect3DSwapChain.GetBackBuffer(aLong11962, 0, 0);
				aLong11961 = (IDirect3DDevice.CreateDepthStencilSurface(aClass178_Sub2_Sub1_11960.aLong11412, anInt11963, anInt11958, i, aD3DPRESENT_PARAMETERS11967.MultiSampleType, aD3DPRESENT_PARAMETERS11967.MultiSampleQuality, false));
			}
			aClass178_Sub2_Sub1_11960.method17816(this);
		}
		if (aBool11965)
			method359();
	}
}
