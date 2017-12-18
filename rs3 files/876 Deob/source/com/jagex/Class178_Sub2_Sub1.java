/* Class178_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import jagdx.Class355;
import jagdx.Class358;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.RuntimeException_Sub5;

public class Class178_Sub2_Sub1 extends Class178_Sub2 {
	int anInt11409;
	long aLong11410;
	long aLong11411 = 0L;
	long aLong11412 = 0L;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11413;
	float[] aFloatArray11414;
	static int[] anIntArray11415;
	boolean aBool11416;
	long aLong11417;
	long aLong11418;
	long[] aLongArray11419;
	boolean aBool11420;
	boolean[] aBoolArray11421;
	boolean aBool11422;
	boolean[] aBoolArray11423;
	int anInt11424;
	Class342[] aClass342Array11425;
	long[] aLongArray11426;
	Class441 aClass441_11427;
	long aLong11428;
	long aLong11429;
	D3DCAPS aD3DCAPS11430;
	boolean aBool11431;
	int[] anIntArray11432;
	boolean aBool11433;
	boolean[] aBoolArray11434;
	boolean aBool11435;
	boolean aBool11436;
	boolean aBool11437;
	boolean aBool11438;
	boolean aBool11439;
	boolean aBool11440;
	int anInt11441;
	Class708 aClass708_11442 = new Class708();
	int anInt11443;
	int[] anIntArray11444;
	static final int anInt11445 = 3;
	boolean aBool11446;
	D3DDISPLAYMODE aD3DDISPLAYMODE11447;
	long[] aLongArray11448;
	Class270_Sub2 aClass270_Sub2_11449;
	int anInt11450;
	int anInt11451;
	static int[] anIntArray11452 = { 77, 80 };
	boolean[] aBoolArray11453;

	void method15153() {
		if (aClass168_1938 != null)
			IDirect3DDevice.SetViewport(aLong11412, anInt9619 + anInt9628, anInt9600 + anInt9649, anInt9597, anInt9598, aFloat9581, aFloat9605);
	}

	public boolean method15061(boolean bool) {
		if (bool)
			return aBool11438;
		return aBool11438 && aBool11439;
	}

	final void method15041(Interface40 interface40, Class376 class376, int i, int i_0_, int i_1_, int i_2_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11412, (((Class422) interface40).aLong4793), 4, 0, i, i_0_, i_1_, i_2_);
	}

	static Class178 method17812(Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, Integer integer) {
		Class178_Sub2_Sub1 class178_sub2_sub1 = null;
		Class178_Sub2_Sub1 class178_sub2_sub1_3_;
		try {
			int i = 0;
			int i_4_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_4_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method17838(i, i_4_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_5_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_5_ |= 0x10;
			long l_6_ = 0L;
			try {
				l_6_ = IDirect3D.CreateDeviceContext(l, i, i_4_, canvas, i_5_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_6_ = IDirect3D.CreateDeviceContext(l, i, i_4_, canvas, i_5_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class178_sub2_sub1 = new Class178_Sub2_Sub1(i, i_4_, l, l_6_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class172, interface25, interface46, interface48, interface45, class472, integer.intValue());
			if (!class178_sub2_sub1.aHashtable1924.containsKey(canvas)) {
				Class194_Sub14.method15513(canvas, (byte) -72);
				class178_sub2_sub1.method3042(canvas, new Class168_Sub2_Sub1_Sub1(class178_sub2_sub1, canvas, canvas.getWidth(), canvas.getHeight(), true), 1112129047);
			}
			class178_sub2_sub1.method3044(canvas, -1852775871);
			class178_sub2_sub1.method15293();
			class178_sub2_sub1_3_ = class178_sub2_sub1;
		} catch (RuntimeException runtimeexception) {
			if (class178_sub2_sub1 != null)
				class178_sub2_sub1.method3023();
			throw runtimeexception;
		}
		return class178_sub2_sub1_3_;
	}

	void method17813() {
		IDirect3DDevice.SetRenderState(aLong11412, 22, anInt9673);
	}

	void method14927() {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(1179103199); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) -9)) {
			Interface51 interface51 = (Interface51) class523_sub28.anObject10554;
			interface51.method363();
			if (interface51 == aClass168_1938)
				interface51.method359();
		}
		super.method14927();
	}

	final void method15127(int i, Class361 class361, boolean bool, boolean bool_7_) {
		if (aBool9647) {
			int i_8_ = 0;
			int i_9_;
			switch (i) {
			case 1:
				i_9_ = 3;
				break;
			case 2:
				i_9_ = 26;
				break;
			default:
				i_9_ = 2;
			}
			if (bool)
				i_8_ |= 0x20;
			if (bool_7_)
				i_8_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, i_9_, method17830(class361) | i_8_);
		}
	}

	boolean method17814(int i, int i_10_) {
		int i_11_ = IDirect3DDevice.TestCooperativeLevel(aLong11412);
		if (i_11_ == 0 || i_11_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11412, 0L);
			for (int i_12_ = 1; i_12_ < 4; i_12_++)
				IDirect3DDevice.SetRenderTarget(aLong11412, i_12_, 0L);
			for (int i_13_ = 0; i_13_ < 4; i_13_++)
				IDirect3DDevice.SetStreamSource(aLong11412, i_13_, 0L, 0, 0);
			for (int i_14_ = 0; i_14_ < 4; i_14_++)
				IDirect3DDevice.SetTexture(aLong11412, i_14_, 0L);
			IDirect3DDevice.SetIndices(aLong11412, 0L);
			method14933();
			aD3DPRESENT_PARAMETERS11413.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11413.BackBufferHeight = i_10_;
			aD3DPRESENT_PARAMETERS11413.BackBufferCount = 1;
			if (method17838(anInt11441, anInt11424, aLong11411, anInt9661, aD3DDISPLAYMODE11447, aD3DPRESENT_PARAMETERS11413)) {
				int i_15_ = IDirect3DDevice.Reset(aLong11412, aD3DPRESENT_PARAMETERS11413);
				if (Class358.method6281(i_15_)) {
					aBool11416 = false;
					method14927();
					method14931();
					return true;
				}
			}
		}
		return false;
	}

	public int method3407() {
		if (aLongArray11419[anInt11450] == 0L)
			return -1;
		return ((Class358.method6281(IDirect3DEventQuery.IsSignaled(aLongArray11419[anInt11450]))) ? anIntArray11432[anInt11450] : -1);
	}

	public Class150 method3401() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11411, anInt11441, 0, d3dadapter_identifier);
		return new Class150(d3dadapter_identifier.VendorID, method14920() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14920());
	}

	public final void method15034(Class376 class376, int i, int i_16_, int i_17_, int i_18_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11412, method17837(class376), 0, i, i_16_, i_17_, i_18_);
	}

	public void method3021() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method3023() {
		super.method3023();
		if (aLong11417 != 0L) {
			D3DLIGHT.Destroy(aLong11417);
			aLong11417 = 0L;
		}
		if (aLong11418 != 0L) {
			D3DLIGHT.Destroy(aLong11418);
			aLong11418 = 0L;
		}
		if (aLong11410 != 0L) {
			D3DLIGHT.Destroy(aLong11410);
			aLong11410 = 0L;
		}
		if (aLong11412 != 0L) {
			IDirect3DDevice.Destroy(aLong11412);
			aLong11412 = 0L;
		}
		if (aLong11411 != 0L) {
			IUnknown.Release(aLong11411);
			aLong11411 = 0L;
		}
	}

	public boolean method14919() {
		return (aD3DCAPS11430.VertexShaderVersion & 0xffff) >= 257;
	}

	public float method15089() {
		return -0.5F;
	}

	public Class168_Sub1 method3248() {
		return new Class168_Sub1_Sub1_Sub1(this);
	}

	Class168_Sub2 method3048(Canvas canvas, int i, int i_19_) {
		return new Class168_Sub2_Sub1_Sub1(this, canvas, i, i_19_, false);
	}

	void method15268() {
		/* empty */
	}

	public Interface23 method3051(int i, int i_20_) {
		return new Class407(this, Class170.aClass170_1827, i, i_20_, 0);
	}

	public Interface23 method3049(int i, int i_21_, int i_22_) {
		return new Class407(this, Class170.aClass170_1827, i, i_21_, i_22_);
	}

	Class523_Sub28 method17815(Interface51 interface51) {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(977776910); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) -44)) {
			if (class523_sub28.anObject10554 == interface51)
				return class523_sub28;
		}
		return null;
	}

	void method17816(Interface51 interface51) {
		if (method17815(interface51) == null)
			aClass708_11442.method14236(new Class523_Sub28(interface51), 451729818);
	}

	void method17817(Interface51 interface51) {
		Class523_Sub28 class523_sub28 = method17815(interface51);
		if (class523_sub28 != null)
			class523_sub28.method8661(607052656);
	}

	public Class150 method3368() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11411, anInt11441, 0, d3dadapter_identifier);
		return new Class150(d3dadapter_identifier.VendorID, method14920() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14920());
	}

	boolean method15065(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 3, method17835(class158, class170))));
	}

	public boolean method3309() {
		return true;
	}

	void method17818(int i, int i_23_) {
		method3066();
		method3161(i, i_23_, -696269543);
		aLong11428 = (IDirect3DDevice.CreateRenderTarget(aLong11412, i, i_23_, method17835(Class158.aClass158_1743, Class170.aClass170_1822), 0, 0, false));
		for (int i_24_ = 0; i_24_ < 3; i_24_++)
			aLongArray11448[i_24_] = (IDirect3DDevice.CreateOffscreenPlainSurface(aLong11412, i, i_23_, method17835(Class158.aClass158_1743, Class170.aClass170_1822), 2));
		method15125(i * i_23_ * 4);
	}

	void method15334() {
		if (aBool9647) {
			int i = (aBoolArray11423[anInt9626] ? method17829(aClass374Array9631[anInt9626]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 4, i);
		}
	}

	public boolean method3057() {
		return true;
	}

	public boolean method3058() {
		return false;
	}

	public void method3061(int i, int i_25_, int i_26_) {
		if (aLong11428 == 0L)
			method17818(i_25_, i_26_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11412, 0);
		if (!Class358.method6280(IDirect3DDevice.StretchRect(aLong11412, l, 0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), aLong11428, anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11412, aLong11428, aLongArray11448[anInt11451]);
		long l_27_ = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l_27_)))
			aLongArray11419[anInt11451] = l_27_;
		anIntArray11432[anInt11451] = i;
		if (++anInt11451 >= 3)
			anInt11451 = 0;
	}

	void method14984() {
		if (aBool9647) {
			D3DLIGHT.SetAmbient(aLong11417, aFloat9689 * aFloat9643, aFloat9614 * aFloat9643, aFloat9704 * aFloat9643, 0.0F);
			aBool11420 = false;
		}
	}

	public void method3060() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11419[i] != 0L) {
				IUnknown.Release(aLongArray11419[i]);
				aLongArray11419[i] = 0L;
			}
		}
		anInt11451 = 0;
		anInt11450 = 0;
	}

	public long method3324(int i, int i_28_) {
		return method17819(i, i_28_, null, null);
	}

	public void method3130(int i, int i_29_, int[] is, int[] is_30_) {
		method17819(i, i_29_, is, is_30_);
	}

	long method17819(int i, int i_31_, int[] is, int[] is_32_) {
		if (aLongArray11419[anInt11450] != 0L) {
			IUnknown.Release(aLongArray11419[anInt11450]);
			aLongArray11419[anInt11450] = 0L;
		}
		aByteBuffer9539.clear();
		IDirect3DSurface.Download(aLongArray11448[anInt11450], 0, 0, i, i_31_, i * 4, 0, aLong9540);
		if (++anInt11450 >= 3)
			anInt11450 = 0;
		if (is != null) {
			aByteBuffer9539.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9540;
	}

	public void method3063(long l) {
		/* empty */
	}

	synchronized void method17820(long l) {
		if (anInt11443 == anInt11409) {
			anInt11409 *= 2;
			long[] ls = new long[anInt11409];
			System.arraycopy(aLongArray11426, 0, ls, 0, anInt11443);
			aLongArray11426 = ls;
		}
		aLongArray11426[anInt11443] = l;
		anInt11443++;
	}

	public Class185 method3134(Class185 class185, Class185 class185_33_, float f, Class185 class185_34_) {
		return f < 0.5F ? class185 : class185_33_;
	}

	public void method3076(int i, int i_35_) {
		IDirect3DDevice.Clear(aLong11412, i, i_35_, 1.0F, 0);
	}

	void method15217() {
		if (aClass168_1938 != null)
			IDirect3DDevice.SetViewport(aLong11412, anInt9619 + anInt9628, anInt9600 + anInt9649, anInt9597, anInt9598, aFloat9581, aFloat9605);
	}

	void method15162() {
		IDirect3DDevice.SetScissorRect(aLong11412, anInt9619 + anInt9633, anInt9600 + anInt9587, anInt9590, anInt9588);
	}

	public void method15121(Class441 class441, Class441 class441_36_, Class441 class441_37_) {
		IDirect3DDevice.SetTransform(aLong11412, 256, class441.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 2, class441_36_.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 3, class441_37_.aFloatArray4916);
	}

	final void method17821(long l) {
		aLong11429 = l;
		IDirect3DDevice.SetVertexShader(aLong11412, l);
	}

	final void method17822(long l) {
		IDirect3DDevice.SetPixelShader(aLong11412, l);
	}

	public void method15092(Class441 class441, Class441 class441_38_, Class441 class441_39_) {
		IDirect3DDevice.SetTransform(aLong11412, 256, class441.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 2, class441_38_.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 3, class441_39_.aFloatArray4916);
	}

	void method15022() {
		switch (aClass363_9666.anInt3749) {
		case 2:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 2);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 2);
			break;
		}
		switch (anInt9653) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 1);
			break;
		}
	}

	void method14980() {
		IDirect3DDevice.method15723(aLong11412, 7, aBool9526 && aBool9606);
	}

	void method15304() {
		IDirect3DDevice.method15723(aLong11412, 14, aBool9604 && aBool9558);
	}

	void method14983() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 137, aBool9674 && !aBool9548);
	}

	public String method3184() {
		String string = "Caps: 4:";
		String string_40_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_40_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_40_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(method14919() ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(method15119() ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11431 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11422 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11446 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11435 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11436 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11437 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11438 ? 1 : 0).append(string_40_).toString();
		string = new StringBuilder().append(string).append(aBool11439 ? 1 : 0).toString();
		return string;
	}

	void method14985() {
		if (aBool9647) {
			float f = aBool9679 ? aFloat9617 : 0.0F;
			float f_41_ = aBool9679 ? -aFloat9618 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11417, f * aFloat9689, f * aFloat9614, f * aFloat9704, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11418, f_41_ * aFloat9689, f_41_ * aFloat9614, f_41_ * aFloat9704, 0.0F);
			aBool11420 = false;
		}
	}

	final void method15311(Interface40 interface40, Class376 class376, int i, int i_42_, int i_43_, int i_44_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11412, (((Class422) interface40).aLong4793), 4, 0, i, i_42_, i_43_, i_44_);
	}

	void method15276() {
		method14985();
		method14987();
	}

	public boolean method15120() {
		return (aD3DCAPS11430.VertexShaderVersion & 0xffff) >= 257;
	}

	void method3158(int i, int i_45_) throws Exception_Sub4 {
		if (aBool11416) {
			if (!method17814(aClass168_Sub2_1939.method2875(), aClass168_Sub2_1939.method2874()))
				return;
			((Class168_Sub2_Sub1_Sub1) aClass168_Sub2_1939).method363();
		} else
			IDirect3DDevice.EndScene(aLong11412);
		int i_46_ = aClass168_Sub2_1939.method15400();
		if (Class358.method6280(i_46_)) {
			aBool11416 = true;
			aClass168_Sub2_1939.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11412);
			if (anInterface25_1923 != null)
				anInterface25_1923.method20(1976434485);
		}
	}

	public Class168_Sub1 method3399() {
		return new Class168_Sub1_Sub1_Sub1(this);
	}

	void method14987() {
		if (aBool9647 && !aBool11420) {
			IDirect3DDevice.LightEnable(aLong11412, 0, false);
			IDirect3DDevice.LightEnable(aLong11412, 1, false);
			IDirect3DDevice.SetLight(aLong11412, 0, aLong11417);
			IDirect3DDevice.SetLight(aLong11412, 1, aLong11418);
			IDirect3DDevice.LightEnable(aLong11412, 0, true);
			IDirect3DDevice.LightEnable(aLong11412, 1, true);
			aBool11420 = true;
		}
	}

	boolean method17823(int i, int i_47_) {
		int i_48_ = IDirect3DDevice.TestCooperativeLevel(aLong11412);
		if (i_48_ == 0 || i_48_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11412, 0L);
			for (int i_49_ = 1; i_49_ < 4; i_49_++)
				IDirect3DDevice.SetRenderTarget(aLong11412, i_49_, 0L);
			for (int i_50_ = 0; i_50_ < 4; i_50_++)
				IDirect3DDevice.SetStreamSource(aLong11412, i_50_, 0L, 0, 0);
			for (int i_51_ = 0; i_51_ < 4; i_51_++)
				IDirect3DDevice.SetTexture(aLong11412, i_51_, 0L);
			IDirect3DDevice.SetIndices(aLong11412, 0L);
			method14933();
			aD3DPRESENT_PARAMETERS11413.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11413.BackBufferHeight = i_47_;
			aD3DPRESENT_PARAMETERS11413.BackBufferCount = 1;
			if (method17838(anInt11441, anInt11424, aLong11411, anInt9661, aD3DDISPLAYMODE11447, aD3DPRESENT_PARAMETERS11413)) {
				int i_52_ = IDirect3DDevice.Reset(aLong11412, aD3DPRESENT_PARAMETERS11413);
				if (Class358.method6281(i_52_)) {
					aBool11416 = false;
					method14927();
					method14931();
					return true;
				}
			}
		}
		return false;
	}

	Interface37 method14996(int i, int i_53_, boolean bool, int[] is, int i_54_, int i_55_) {
		return new Class404_Sub3(this, i, i_53_, bool, is, i_54_, i_55_);
	}

	Interface37 method14994(Class158 class158, int i, int i_56_, boolean bool, byte[] is, int i_57_, int i_58_) {
		return new Class404_Sub3(this, class158, i, i_56_, bool, is, i_57_, i_58_);
	}

	public void method3157(boolean bool) {
		/* empty */
	}

	static final int method17824(Class170 class170) {
		if (class170 == Class170.aClass170_1826)
			return 80;
		if (class170 == Class170.aClass170_1827)
			return 77;
		throw new IllegalArgumentException("");
	}

	Interface39 method14997(int i, boolean bool, int[][] is) {
		return new Class404_Sub1(this, i, bool, is);
	}

	Interface34 method15087(Class158 class158, int i, int i_59_, int i_60_, boolean bool, byte[] is) {
		return new Class404_Sub2(this, class158, i, i_59_, i_60_, bool, is);
	}

	final void method17825(Class404 class404) {
		IDirect3DDevice.SetTexture(aLong11412, anInt9626, class404.method6602());
		if (aBool9647 && !aBoolArray11423[anInt9626]) {
			aBoolArray11423[anInt9626] = true;
			method14955();
			method15016();
		}
	}

	final void method17826(Class404_Sub3 class404_sub3) {
		method17825(class404_sub3);
		if (aBoolArray11421[anInt9626] != class404_sub3.aBool10181) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 1, class404_sub3.aBool10181 ? 1 : 3);
			aBoolArray11421[anInt9626] = class404_sub3.aBool10181;
		}
		if (aBoolArray11453[anInt9626] != class404_sub3.aBool10180) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 2, class404_sub3.aBool10180 ? 1 : 3);
			aBoolArray11453[anInt9626] = class404_sub3.aBool10180;
		}
	}

	final void method17827(Class404_Sub2 class404_sub2) {
		method17825(class404_sub2);
		if (!aBoolArray11421[anInt9626]) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 1, 1);
			aBoolArray11421[anInt9626] = true;
		}
		if (!aBoolArray11453[anInt9626]) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 2, 1);
			aBoolArray11453[anInt9626] = true;
		}
	}

	public void method15072() {
		if (aBoolArray11423[anInt9626]) {
			aBoolArray11423[anInt9626] = false;
			IDirect3DDevice.SetTexture(aLong11412, anInt9626, 0L);
			method14955();
			method15016();
		}
	}

	void method15070() {
		if (aLong11429 == 0L && aClass377Array9665[anInt9626] != Class377.aClass377_3926) {
			if (aClass377Array9665[anInt9626] == Class377.aClass377_3923)
				IDirect3DDevice.SetTransform(aLong11412, 16 + anInt9626, aClass441Array9547[anInt9626].method7101(aFloatArray11414));
			else
				IDirect3DDevice.SetTransform(aLong11412, 16 + anInt9626, aClass441Array9547[anInt9626].method7134(aFloatArray11414));
			int i = method17828(aClass377Array9665[anInt9626]);
			if (i != anIntArray11444[anInt9626]) {
				IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 24, i);
				anIntArray11444[anInt9626] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 24, 0);
			anIntArray11444[anInt9626] = 0;
		}
	}

	void method15015() {
		/* empty */
	}

	void method15016() {
		if (aBool9647) {
			int i = (aBoolArray11423[anInt9626] ? method17829(aClass374Array9630[anInt9626]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 1, i);
		}
	}

	static final int method17828(Class377 class377) {
		switch (class377.anInt3927) {
		default:
			return 0;
		case 2:
			return 256;
		case 1:
			return 4;
		case 0:
			return 3;
		case 3:
			return 2;
		case 4:
			return 1;
		}
	}

	final void method15005(int i, Class361 class361, boolean bool, boolean bool_61_) {
		if (aBool9647) {
			int i_62_ = 0;
			int i_63_;
			switch (i) {
			case 1:
				i_63_ = 3;
				break;
			case 2:
				i_63_ = 26;
				break;
			default:
				i_63_ = 2;
			}
			if (bool)
				i_62_ |= 0x20;
			if (bool_61_)
				i_62_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, i_63_, (method17830(class361) | i_62_));
		}
	}

	void method15077() {
		if (aBool9647) {
			D3DLIGHT.SetDirection(aLong11417, -aFloatArray9608[0], -aFloatArray9608[1], -aFloatArray9608[2]);
			D3DLIGHT.SetDirection(aLong11418, -aFloatArray9582[0], -aFloatArray9582[1], -aFloatArray9582[2]);
			aBool11420 = false;
		}
	}

	void method15220() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 28, (aBool9573 && aBool9660 && anInt9663 >= 0));
	}

	static final int method17829(Class374 class374) {
		switch (class374.anInt3913) {
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException();
		case 0:
			return 26;
		case 4:
			return 7;
		case 1:
			return 10;
		case 3:
			return 2;
		}
	}

	static final int method17830(Class361 class361) {
		switch (class361.anInt3743) {
		case 1:
			return 3;
		case 2:
			return 0;
		case 3:
			return 1;
		case 0:
			return 2;
		default:
			throw new IllegalArgumentException();
		}
	}

	synchronized void method17831(long l) {
		if (anInt11443 == anInt11409) {
			anInt11409 *= 2;
			long[] ls = new long[anInt11409];
			System.arraycopy(aLongArray11426, 0, ls, 0, anInt11443);
			aLongArray11426 = ls;
		}
		aLongArray11426[anInt11443] = l;
		anInt11443++;
	}

	void method14945(int i) {
		IDirect3DDevice.SetRenderState(aLong11412, 168, i);
	}

	void method15021() {
		IDirect3DDevice.method15723(aLong11412, 15, aBool9563);
		IDirect3DDevice.SetRenderState(aLong11412, 24, aByte9672 & 0xff);
		if (aD3DPRESENT_PARAMETERS11413.MultiSampleType > 0) {
			if (!aBool9563 || aByte9672 == 0) {
				if (aBool11437 || aBool11435)
					IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
				else if (aBool11436)
					IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
			} else if (aBool11437)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('S', 'S', 'A', 'A'));
			else if (aBool11435)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('A', 'T', 'O', 'C'));
			else if (aBool11436)
				IDirect3DDevice.SetRenderState(aLong11412, 154, method15078('A', '2', 'M', '1'));
		}
	}

	Interface37 method15229(Class158 class158, int i, int i_64_, boolean bool, float[] fs, int i_65_, int i_66_) {
		return new Class404_Sub3(this, class158, i, i_64_, bool, fs, i_65_, i_66_);
	}

	void method15023() {
		IDirect3DDevice.method15723(aLong11412, 27, aBool9549);
	}

	void method17832() {
		IDirect3DDevice.SetRenderState(aLong11412, 22, anInt9673);
	}

	public void method15112(Class441 class441, Class441 class441_67_, Class441 class441_68_) {
		IDirect3DDevice.SetTransform(aLong11412, 256, class441.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 2, class441_67_.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 3, class441_68_.aFloatArray4916);
	}

	void method15027() {
		aFloat9681 = aFloat9702 - (float) anInt9664;
		aFloat9683 = aFloat9681 - (float) anInt9663;
		if (aFloat9683 < aFloat9585)
			aFloat9683 = aFloat9585;
		if (aBool9647) {
			IDirect3DDevice.method15722(aLong11412, 36, aFloat9683);
			IDirect3DDevice.method15722(aLong11412, 37, aFloat9681);
			IDirect3DDevice.SetRenderState(aLong11412, 34, anInt9662);
		}
	}

	public void method3101() {
		if (aLong11428 != 0L) {
			IUnknown.Release(aLong11428);
			aLong11428 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11419[i] != 0L) {
				IUnknown.Release(aLongArray11419[i]);
				aLongArray11419[i] = 0L;
			}
			if (aLongArray11448[i] != 0L) {
				IUnknown.Release(aLongArray11448[i]);
				aLongArray11448[i] = 0L;
			}
		}
		anInt11451 = 0;
		anInt11450 = 0;
	}

	final Interface40 method15029(boolean bool) {
		return new Class422(this, Class170.aClass170_1826, bool);
	}

	public boolean method3202() {
		return true;
	}

	Class345 method15031(Class378[] class378s) {
		return new Class345_Sub2(this, class378s);
	}

	public void method15032(Class345 class345) {
		Class345_Sub2 class345_sub2 = (Class345_Sub2) class345;
		IDirect3DDevice.SetVertexDeclaration(aLong11412, class345_sub2.aLong10149);
	}

	public void method15033(int i, Interface36 interface36) {
		Class405 class405 = (Class405) interface36;
		IDirect3DDevice.SetStreamSource(aLong11412, i, class405.aLong4182, 0, class405.method6608());
	}

	public Class150 method3369() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11411, anInt11441, 0, d3dadapter_identifier);
		return new Class150(d3dadapter_identifier.VendorID, method14920() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14920());
	}

	public final void method15040(Class376 class376, int i, int i_69_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawPrimitive(aLong11412, method17837(class376), i, i_69_);
	}

	public void method3054() {
		/* empty */
	}

	static boolean method17833(int i, int i_70_, long l, int i_71_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		boolean bool;
		try {
			if (Class358.method6280(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_147_: for (/**/; i_71_ >= 0; i_71_--) {
				if (i_71_ != 1) {
					i_74_ = 0 + i_71_;
					for (int i_75_ = 0; i_75_ < anIntArray11415.length; i_75_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_70_, d3ddisplaymode.Format, anIntArray11415[i_75_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_70_, (d3ddisplaymode.Format), 1, 1, (anIntArray11415[i_75_])) == 0 && (i_71_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_70_, anIntArray11415[i_75_], true, i_74_)) == 0)) {
							for (int i_76_ = 0; i_76_ < anIntArray11452.length; i_76_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_70_, d3ddisplaymode.Format, 2, 1, anIntArray11452[i_76_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_70_, d3ddisplaymode.Format, anIntArray11415[i_75_], anIntArray11452[i_76_])) == 0 && (i_71_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_70_, anIntArray11452[i_75_], true, i_74_)) == 0)) {
									i_73_ = anIntArray11415[i_75_];
									i_72_ = anIntArray11452[i_76_];
									break while_147_;
								}
							}
						}
					}
				}
			}
			if (i_71_ < 0 || i_73_ == 0 || i_72_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_73_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_72_;
			d3dpresent_parameters.MultiSampleType = i_74_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	byte[] method17834(String string) {
		return method14925("dx", string);
	}

	public Class265 method15073(String string) {
		byte[] is = method17834(string);
		if (is == null)
			return null;
		Class279 class279 = method14926(is);
		return new Class265_Sub1(this, class279);
	}

	public final synchronized void method3428(int i) {
		for (int i_77_ = 0; i_77_ < anInt11443; i_77_++)
			IUnknown.Release(aLongArray11426[i_77_]);
		anInt11443 = 0;
		super.method3428(i);
	}

	static final int method17835(Class158 class158, Class170 class170) {
		switch (class170.anInt1830 * 1699851493) {
		case 4:
			if (class158 == Class158.aClass158_1743)
				return 113;
			break;
		case 6:
			if (class158 == Class158.aClass158_1743)
				return 116;
			break;
		case 2:
			switch (class158.anInt1742 * 178485697) {
			case 2:
				return Class355.anInt3709 * 1963168145;
			case 6:
				return 28;
			case 8:
				return 21;
			case 5:
				return 50;
			case 0:
				return Class355.anInt3710 * 1216258775;
			case 7:
				return 51;
			default:
				break;
			case 4:
				return 22;
			case 9:
				return 77;
			}
			break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method17836(Class170 class170) {
		if (class170 == Class170.aClass170_1826)
			return 80;
		if (class170 == Class170.aClass170_1827)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method17837(Class376 class376) {
		switch (class376.anInt3920) {
		case 0:
			return 6;
		case 1:
			return 3;
		case 3:
			return 5;
		case 4:
			return 2;
		case 5:
			return 1;
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException("");
		}
	}

	void method15285() {
		IDirect3DDevice.method15723(aLong11412, 15, aBool9563);
		IDirect3DDevice.SetRenderState(aLong11412, 24, aByte9672 & 0xff);
		if (aD3DPRESENT_PARAMETERS11413.MultiSampleType > 0) {
			if (!aBool9563 || aByte9672 == 0) {
				if (aBool11437 || aBool11435)
					IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
				else if (aBool11436)
					IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
			} else if (aBool11437)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('S', 'S', 'A', 'A'));
			else if (aBool11435)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('A', 'T', 'O', 'C'));
			else if (aBool11436)
				IDirect3DDevice.SetRenderState(aLong11412, 154, method15078('A', '2', 'M', '1'));
		}
	}

	static boolean method17838(int i, int i_78_, long l, int i_79_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_80_ = 0;
		int i_81_ = 0;
		int i_82_ = 0;
		boolean bool;
		try {
			if (Class358.method6280(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_148_: for (/**/; i_79_ >= 0; i_79_--) {
				if (i_79_ != 1) {
					i_82_ = 0 + i_79_;
					for (int i_83_ = 0; i_83_ < anIntArray11415.length; i_83_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_78_, d3ddisplaymode.Format, anIntArray11415[i_83_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_78_, (d3ddisplaymode.Format), 1, 1, (anIntArray11415[i_83_])) == 0 && (i_79_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_78_, anIntArray11415[i_83_], true, i_82_)) == 0)) {
							for (int i_84_ = 0; i_84_ < anIntArray11452.length; i_84_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_78_, d3ddisplaymode.Format, 2, 1, anIntArray11452[i_84_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_78_, d3ddisplaymode.Format, anIntArray11415[i_83_], anIntArray11452[i_84_])) == 0 && (i_79_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_78_, anIntArray11452[i_83_], true, i_82_)) == 0)) {
									i_81_ = anIntArray11415[i_83_];
									i_80_ = anIntArray11452[i_84_];
									break while_148_;
								}
							}
						}
					}
				}
			}
			if (i_79_ < 0 || i_81_ == 0 || i_80_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_81_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_80_;
			d3dpresent_parameters.MultiSampleType = i_82_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	synchronized void method17839(long l) {
		if (anInt11443 == anInt11409) {
			anInt11409 *= 2;
			long[] ls = new long[anInt11409];
			System.arraycopy(aLongArray11426, 0, ls, 0, anInt11443);
			aLongArray11426 = ls;
		}
		aLongArray11426[anInt11443] = l;
		anInt11443++;
	}

	Interface39 method15232(int i, boolean bool, int[][] is) {
		return new Class404_Sub1(this, i, bool, is);
	}

	public String method3036() {
		String string = "Caps: 4:";
		String string_85_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_85_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_85_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(method14919() ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(method15119() ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11431 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11422 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11446 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11435 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11436 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11437 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11438 ? 1 : 0).append(string_85_).toString();
		string = new StringBuilder().append(string).append(aBool11439 ? 1 : 0).toString();
		return string;
	}

	static {
		anIntArray11415 = new int[] { 22, 23 };
	}

	void method14961() {
		IDirect3DDevice.method15723(aLong11412, 174, aBool9675);
	}

	void method3159(int i, int i_86_) throws Exception_Sub4 {
		if (aBool11416) {
			if (!method17814(aClass168_Sub2_1939.method2875(), aClass168_Sub2_1939.method2874()))
				return;
			((Class168_Sub2_Sub1_Sub1) aClass168_Sub2_1939).method363();
		} else
			IDirect3DDevice.EndScene(aLong11412);
		int i_87_ = aClass168_Sub2_1939.method15400();
		if (Class358.method6280(i_87_)) {
			aBool11416 = true;
			aClass168_Sub2_1939.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11412);
			if (anInterface25_1923 != null)
				anInterface25_1923.method20(1353550866);
		}
	}

	final void method15007(int i, Class361 class361, boolean bool) {
		if (aBool9647) {
			int i_88_ = 0;
			int i_89_;
			switch (i) {
			case 2:
				i_89_ = 27;
				break;
			default:
				i_89_ = 5;
				break;
			case 1:
				i_89_ = 6;
			}
			if (bool)
				i_88_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, i_89_, (method17830(class361) | i_88_));
		}
	}

	public void method3283() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method3073() {
		super.method3023();
		if (aLong11417 != 0L) {
			D3DLIGHT.Destroy(aLong11417);
			aLong11417 = 0L;
		}
		if (aLong11418 != 0L) {
			D3DLIGHT.Destroy(aLong11418);
			aLong11418 = 0L;
		}
		if (aLong11410 != 0L) {
			D3DLIGHT.Destroy(aLong11410);
			aLong11410 = 0L;
		}
		if (aLong11412 != 0L) {
			IDirect3DDevice.Destroy(aLong11412);
			aLong11412 = 0L;
		}
		if (aLong11411 != 0L) {
			IUnknown.Release(aLong11411);
			aLong11411 = 0L;
		}
	}

	public final synchronized void method3163(int i) {
		for (int i_90_ = 0; i_90_ < anInt11443; i_90_++)
			IUnknown.Release(aLongArray11426[i_90_]);
		anInt11443 = 0;
		super.method3428(i);
	}

	public final synchronized void method3164(int i) {
		for (int i_91_ = 0; i_91_ < anInt11443; i_91_++)
			IUnknown.Release(aLongArray11426[i_91_]);
		anInt11443 = 0;
		super.method3428(i);
	}

	public void method3066() {
		if (aLong11428 != 0L) {
			IUnknown.Release(aLong11428);
			aLong11428 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11419[i] != 0L) {
				IUnknown.Release(aLongArray11419[i]);
				aLongArray11419[i] = 0L;
			}
			if (aLongArray11448[i] != 0L) {
				IUnknown.Release(aLongArray11448[i]);
				aLongArray11448[i] = 0L;
			}
		}
		anInt11451 = 0;
		anInt11450 = 0;
	}

	public String method3182() {
		String string = "Caps: 4:";
		String string_92_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_92_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_92_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(method14919() ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(method15119() ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11431 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11422 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11446 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11435 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11436 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11437 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11438 ? 1 : 0).append(string_92_).toString();
		string = new StringBuilder().append(string).append(aBool11439 ? 1 : 0).toString();
		return string;
	}

	public String method3234() {
		String string = "Caps: 4:";
		String string_93_ = ":";
		string = new StringBuilder().append(string).append(anInt9661).append(string_93_).toString();
		string = new StringBuilder().append(string).append(anInt9680).append(string_93_).toString();
		string = new StringBuilder().append(string).append(anInt9524).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9685 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(method14919() ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(method15119() ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9687 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9686 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11431 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11422 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11433 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11446 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9682 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9566 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9609 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11435 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11436 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11437 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool9528 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11438 ? 1 : 0).append(string_93_).toString();
		string = new StringBuilder().append(string).append(aBool11439 ? 1 : 0).toString();
		return string;
	}

	public void method3218() {
		if (aLong11428 != 0L) {
			IUnknown.Release(aLong11428);
			aLong11428 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11419[i] != 0L) {
				IUnknown.Release(aLongArray11419[i]);
				aLongArray11419[i] = 0L;
			}
			if (aLongArray11448[i] != 0L) {
				IUnknown.Release(aLongArray11448[i]);
				aLongArray11448[i] = 0L;
			}
		}
		anInt11451 = 0;
		anInt11450 = 0;
	}

	public void method3251(boolean bool) {
		/* empty */
	}

	public void method3188(boolean bool) {
		/* empty */
	}

	public void method3189(boolean bool) {
		/* empty */
	}

	void method15052() {
		aFloat9681 = aFloat9702 - (float) anInt9664;
		aFloat9683 = aFloat9681 - (float) anInt9663;
		if (aFloat9683 < aFloat9585)
			aFloat9683 = aFloat9585;
		if (aBool9647) {
			IDirect3DDevice.method15722(aLong11412, 36, aFloat9683);
			IDirect3DDevice.method15722(aLong11412, 37, aFloat9681);
			IDirect3DDevice.SetRenderState(aLong11412, 34, anInt9662);
		}
	}

	byte[] method17840(String string) {
		return method14925("dx", string);
	}

	Class168_Sub2 method3243(Canvas canvas, int i, int i_94_) {
		return new Class168_Sub2_Sub1_Sub1(this, canvas, i, i_94_, false);
	}

	public void method3142() {
		/* empty */
	}

	public void method3194() {
		/* empty */
	}

	public void finalize() {
		super.finalize();
	}

	public boolean method3252() {
		return true;
	}

	void method15287() {
		IDirect3DDevice.method15723(aLong11412, 15, aBool9563);
		IDirect3DDevice.SetRenderState(aLong11412, 24, aByte9672 & 0xff);
		if (aD3DPRESENT_PARAMETERS11413.MultiSampleType > 0) {
			if (!aBool9563 || aByte9672 == 0) {
				if (aBool11437 || aBool11435)
					IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
				else if (aBool11436)
					IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
			} else if (aBool11437)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('S', 'S', 'A', 'A'));
			else if (aBool11435)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('A', 'T', 'O', 'C'));
			else if (aBool11436)
				IDirect3DDevice.SetRenderState(aLong11412, 154, method15078('A', '2', 'M', '1'));
		}
	}

	public boolean method3065() {
		if (aBool11416)
			return false;
		if (aLongArray11419[anInt11451] != 0L)
			return false;
		return true;
	}

	public boolean method3421() {
		return true;
	}

	public boolean method3205() {
		return true;
	}

	void method15213(Interface40 interface40) {
		IDirect3DDevice.SetIndices(aLong11412, ((Class422) interface40).aLong4793);
	}

	public boolean method3207() {
		return false;
	}

	void method15189() {
		IDirect3DDevice.method15723(aLong11412, 7, aBool9526 && aBool9606);
	}

	void method17841() {
		IDirect3DDevice.SetRenderState(aLong11412, 22, anInt9673);
	}

	void method15294() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 28, (aBool9573 && aBool9660 && anInt9663 >= 0));
	}

	static final int method17842(Class376 class376) {
		switch (class376.anInt3920) {
		case 0:
			return 6;
		case 1:
			return 3;
		case 3:
			return 5;
		case 4:
			return 2;
		case 5:
			return 1;
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException("");
		}
	}

	public void method3088(int i, int i_95_, int i_96_) {
		if (aLong11428 == 0L)
			method17818(i_95_, i_96_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11412, 0);
		if (!Class358.method6280(IDirect3DDevice.StretchRect(aLong11412, l, 0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), aLong11428, anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11412, aLong11428, aLongArray11448[anInt11451]);
		long l_97_ = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l_97_)))
			aLongArray11419[anInt11451] = l_97_;
		anIntArray11432[anInt11451] = i;
		if (++anInt11451 >= 3)
			anInt11451 = 0;
	}

	void method15325() {
		method3066();
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(781964252); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) 8)) {
			Interface51 interface51 = (Interface51) class523_sub28.anObject10554;
			interface51.method131();
		}
		super.method14933();
	}

	public void method3118() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11419[i] != 0L) {
				IUnknown.Release(aLongArray11419[i]);
				aLongArray11419[i] = 0L;
			}
		}
		anInt11451 = 0;
		anInt11450 = 0;
	}

	public void method3379(int i, int i_98_) {
		IDirect3DDevice.Clear(aLong11412, i, i_98_, 1.0F, 0);
	}

	void method15191() {
		switch (aClass363_9666.anInt3749) {
		case 2:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 5);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 9);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 2);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11412, 19, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 20, 2);
			break;
		}
		switch (anInt9653) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 1);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong11412, 207, 2);
			IDirect3DDevice.SetRenderState(aLong11412, 208, 1);
			break;
		}
	}

	public void method3217(int i, int i_99_, int[] is, int[] is_100_) {
		method17819(i, i_99_, is, is_100_);
	}

	final Interface36 method15030(boolean bool) {
		return new Class405(this, bool);
	}

	Interface37 method14995(Class158 class158, int i, int i_101_, boolean bool, float[] fs, int i_102_, int i_103_) {
		return new Class404_Sub3(this, class158, i, i_101_, bool, fs, i_102_, i_103_);
	}

	public Class185 method3319(Class185 class185, Class185 class185_104_, float f, Class185 class185_105_) {
		return f < 0.5F ? class185 : class185_104_;
	}

	public void method3216(long l) {
		/* empty */
	}

	public Interface23 method3365(int i, int i_106_, int i_107_) {
		return new Class407(this, Class170.aClass170_1827, i, i_106_, i_107_);
	}

	public Interface23 method3366(int i, int i_108_, int i_109_) {
		return new Class407(this, Class170.aClass170_1827, i, i_108_, i_109_);
	}

	void method3105() {
		super.finalize();
	}

	void method15206() {
		if (aBool9647) {
			D3DLIGHT.SetDirection(aLong11417, -aFloatArray9608[0], -aFloatArray9608[1], -aFloatArray9608[2]);
			D3DLIGHT.SetDirection(aLong11418, -aFloatArray9582[0], -aFloatArray9582[1], -aFloatArray9582[2]);
			aBool11420 = false;
		}
	}

	Interface39 method15233(int i, boolean bool, int[][] is) {
		return new Class404_Sub1(this, i, bool, is);
	}

	void method15036() {
		method14985();
		method14987();
	}

	public Class150 method3443() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11411, anInt11441, 0, d3dadapter_identifier);
		return new Class150(d3dadapter_identifier.VendorID, method14920() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14920());
	}

	void method15283(int i) {
		IDirect3DDevice.SetRenderState(aLong11412, 168, i);
	}

	public int[] method3020(int i, int i_110_, int i_111_, int i_112_) {
		method3206();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11412, 0);
		long l_113_ = IDirect3DDevice.CreateRenderTarget(aLong11412, i_111_, i_112_, 21, 0, 0, true);
		int i_114_ = IDirect3DDevice.StretchRect(aLong11412, l, i, i_110_, i_111_, i_112_, l_113_, 0, 0, i_111_, i_112_, 1);
		method15125(i_111_ * i_112_ * 4);
		if (Class358.method6281(i_114_)) {
			is = new int[i_111_ * i_112_];
			IDirect3DSurface.Download(l_113_, 0, 0, i_111_, i_112_, i_111_ * 4, 16, aLong9540);
			aByteBuffer9539.clear();
			aByteBuffer9539.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_113_);
		return is;
	}

	void method15208() {
		if (aBool9647 && !aBool11420) {
			IDirect3DDevice.LightEnable(aLong11412, 0, false);
			IDirect3DDevice.LightEnable(aLong11412, 1, false);
			IDirect3DDevice.SetLight(aLong11412, 0, aLong11417);
			IDirect3DDevice.SetLight(aLong11412, 1, aLong11418);
			IDirect3DDevice.LightEnable(aLong11412, 0, true);
			IDirect3DDevice.LightEnable(aLong11412, 1, true);
			aBool11420 = true;
		}
	}

	public void method3334(int i, int i_115_) {
		IDirect3DDevice.Clear(aLong11412, i, i_115_, 1.0F, 0);
	}

	public void method3472(int i, int i_116_) {
		IDirect3DDevice.Clear(aLong11412, i, i_116_, 1.0F, 0);
	}

	final void method15252(int i, Class361 class361, boolean bool) {
		if (aBool9647) {
			int i_117_ = 0;
			int i_118_;
			switch (i) {
			case 2:
				i_118_ = 27;
				break;
			default:
				i_118_ = 5;
				break;
			case 1:
				i_118_ = 6;
			}
			if (bool)
				i_117_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, i_118_, (method17830(class361) | i_117_));
		}
	}

	public Class168_Sub1 method3028() {
		return new Class168_Sub1_Sub1_Sub1(this);
	}

	public boolean method3371() {
		return true;
	}

	public Interface23 method3233(int i, int i_119_) {
		return new Class407(this, Class170.aClass170_1827, i, i_119_, 0);
	}

	public Interface23 method3402(int i, int i_120_) {
		return new Class407(this, Class170.aClass170_1827, i, i_120_, 0);
	}

	public Interface23 method3403(int i, int i_121_) {
		return new Class407(this, Class170.aClass170_1827, i, i_121_, 0);
	}

	public Interface22 method3440(int i, int i_122_, Class158 class158, Class170 class170, int i_123_) {
		return new Class416(this, class158, class170, i, i_122_, i_123_);
	}

	boolean method15219(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 3, method17835(class158, class170))));
	}

	public void method3176(boolean bool) {
		/* empty */
	}

	public boolean method15105() {
		return (aD3DCAPS11430.VertexShaderVersion & 0xffff) >= 257;
	}

	public boolean method15290() {
		return (aD3DCAPS11430.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method15107() {
		return (aD3DCAPS11430.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method15108() {
		return (aD3DCAPS11430.PixelShaderVersion & 0xffff) >= 257;
	}

	public boolean method15109(boolean bool) {
		if (bool)
			return aBool11438;
		return aBool11438 && aBool11439;
	}

	public Class265 method15084(String string) {
		byte[] is = method17834(string);
		if (is == null)
			return null;
		Class279 class279 = method14926(is);
		return new Class265_Sub1(this, class279);
	}

	public Class265 method15116(String string) {
		byte[] is = method17834(string);
		if (is == null)
			return null;
		Class279 class279 = method14926(is);
		return new Class265_Sub1(this, class279);
	}

	public void method15047(Class441 class441, Class441 class441_124_, Class441 class441_125_) {
		IDirect3DDevice.SetTransform(aLong11412, 256, class441.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 2, class441_124_.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 3, class441_125_.aFloatArray4916);
	}

	public Class150 method3370() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11411, anInt11441, 0, d3dadapter_identifier);
		return new Class150(d3dadapter_identifier.VendorID, method14920() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14920());
	}

	public void method15230(Class441 class441, Class441 class441_126_, Class441 class441_127_) {
		IDirect3DDevice.SetTransform(aLong11412, 256, class441.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 2, class441_126_.aFloatArray4916);
		IDirect3DDevice.SetTransform(aLong11412, 3, class441_127_.aFloatArray4916);
	}

	boolean method15057(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 4, method17835(class158, class170))));
	}

	public final synchronized void method3165(int i) {
		for (int i_128_ = 0; i_128_ < anInt11443; i_128_++)
			IUnknown.Release(aLongArray11426[i_128_]);
		anInt11443 = 0;
		super.method3428(i);
	}

	void method15199() {
		for (int i = 0; i < anInt9680; i++) {
			IDirect3DDevice.SetSamplerState(aLong11412, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 2, 1);
			aClass342Array11425[i] = Class342.aClass342_3610;
			boolean[] bools = aBoolArray11421;
			int i_129_ = i;
			aBoolArray11453[i] = true;
			bools[i_129_] = true;
			aBoolArray11434[i] = false;
			anIntArray11444[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11412, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11412, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11412, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11412, 24, 0);
		IDirect3DDevice.method15723(aLong11412, 206, aBool9528);
		IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
		method17832();
		IDirect3DDevice.SetRenderState(aLong11412, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 145, 1);
		IDirect3DDevice.method15722(aLong11412, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11412, 35, 3);
		IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
		D3DLIGHT.SetType(aLong11417, 3);
		D3DLIGHT.SetType(aLong11418, 3);
		D3DLIGHT.SetType(aLong11410, 1);
		aBool11420 = false;
		super.method14931();
	}

	void method14998() {
		for (int i = 0; i < anInt9680; i++) {
			IDirect3DDevice.SetSamplerState(aLong11412, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 2, 1);
			aClass342Array11425[i] = Class342.aClass342_3610;
			boolean[] bools = aBoolArray11421;
			int i_130_ = i;
			aBoolArray11453[i] = true;
			bools[i_130_] = true;
			aBoolArray11434[i] = false;
			anIntArray11444[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11412, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11412, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11412, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11412, 24, 0);
		IDirect3DDevice.method15723(aLong11412, 206, aBool9528);
		IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
		method17832();
		IDirect3DDevice.SetRenderState(aLong11412, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 145, 1);
		IDirect3DDevice.method15722(aLong11412, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11412, 35, 3);
		IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
		D3DLIGHT.SetType(aLong11417, 3);
		D3DLIGHT.SetType(aLong11418, 3);
		D3DLIGHT.SetType(aLong11410, 1);
		aBool11420 = false;
		super.method14931();
	}

	void method15076() {
		for (int i = 0; i < anInt9680; i++) {
			IDirect3DDevice.SetSamplerState(aLong11412, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 2, 1);
			aClass342Array11425[i] = Class342.aClass342_3610;
			boolean[] bools = aBoolArray11421;
			int i_131_ = i;
			aBoolArray11453[i] = true;
			bools[i_131_] = true;
			aBoolArray11434[i] = false;
			anIntArray11444[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11412, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11412, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11412, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11412, 24, 0);
		IDirect3DDevice.method15723(aLong11412, 206, aBool9528);
		IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
		method17832();
		IDirect3DDevice.SetRenderState(aLong11412, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 145, 1);
		IDirect3DDevice.method15722(aLong11412, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11412, 35, 3);
		IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
		D3DLIGHT.SetType(aLong11417, 3);
		D3DLIGHT.SetType(aLong11418, 3);
		D3DLIGHT.SetType(aLong11410, 1);
		aBool11420 = false;
		super.method14931();
	}

	final void method15200(int i, Class361 class361, boolean bool, boolean bool_132_) {
		if (aBool9647) {
			int i_133_ = 0;
			int i_134_;
			switch (i) {
			case 1:
				i_134_ = 3;
				break;
			case 2:
				i_134_ = 26;
				break;
			default:
				i_134_ = 2;
			}
			if (bool)
				i_133_ |= 0x20;
			if (bool_132_)
				i_133_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, i_134_, (method17830(class361) | i_133_));
		}
	}

	void method15154() {
		if (aClass168_1938 != null)
			IDirect3DDevice.SetViewport(aLong11412, anInt9619 + anInt9628, anInt9600 + anInt9649, anInt9597, anInt9598, aFloat9581, aFloat9605);
	}

	void method15133() {
		if (aClass168_1938 != null)
			IDirect3DDevice.SetViewport(aLong11412, anInt9619 + anInt9628, anInt9600 + anInt9649, anInt9597, anInt9598, aFloat9581, aFloat9605);
	}

	void method15155() {
		IDirect3DDevice.SetScissorRect(aLong11412, anInt9619 + anInt9633, anInt9600 + anInt9587, anInt9590, anInt9588);
	}

	public void method15086(Class441 class441) {
		class441.method7089(aClass441_11427);
	}

	public void method15173(Class441 class441) {
		class441.method7089(aClass441_11427);
	}

	public void method3466(int i, int i_135_, int i_136_) {
		if (aLong11428 == 0L)
			method17818(i_135_, i_136_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11412, 0);
		if (!Class358.method6280(IDirect3DDevice.StretchRect(aLong11412, l, 0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), aLong11428, anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11412, aLong11428, aLongArray11448[anInt11451]);
		long l_137_ = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l_137_)))
			aLongArray11419[anInt11451] = l_137_;
		anIntArray11432[anInt11451] = i;
		if (++anInt11451 >= 3)
			anInt11451 = 0;
	}

	void method15190() {
		IDirect3DDevice.method15723(aLong11412, 7, aBool9526 && aBool9606);
	}

	void method15088() {
		IDirect3DDevice.method15723(aLong11412, 7, aBool9526 && aBool9606);
	}

	void method14989() {
		int i;
		for (i = 0; i < anInt9602; i++) {
			Class523_Sub20 class523_sub20 = aClass523_Sub20Array9671[i];
			int i_138_ = i + 2;
			int i_139_ = class523_sub20.method16067(856453637);
			float f = class523_sub20.method16068((byte) 0) / 255.0F;
			D3DLIGHT.SetPosition(aLong11410, (float) class523_sub20.method16062(2131811589), (float) class523_sub20.method16091(403276291), (float) class523_sub20.method16065(1863161977));
			D3DLIGHT.SetDiffuse(aLong11410, (float) (i_139_ >> 16 & 0xff) * f, (float) (i_139_ >> 8 & 0xff) * f, (float) (i_139_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11410, 0.0F, 0.0F, 1.0F / (float) (class523_sub20.method16066(-1879460461) * class523_sub20.method16066(-1879460461)));
			D3DLIGHT.SetRange(aLong11410, (float) class523_sub20.method16066(-1879460461));
			IDirect3DDevice.SetLight(aLong11412, i_138_, aLong11410);
			IDirect3DDevice.LightEnable(aLong11412, i_138_, true);
		}
		for (/**/; i < anInt9620; i++)
			IDirect3DDevice.LightEnable(aLong11412, i + 2, false);
	}

	void method15309() {
		IDirect3DDevice.method15723(aLong11412, 14, aBool9604 && aBool9558);
	}

	void method15193() {
		IDirect3DDevice.method15723(aLong11412, 14, aBool9604 && aBool9558);
	}

	void method14933() {
		method3066();
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(800629207); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) 41)) {
			Interface51 interface51 = (Interface51) class523_sub28.anObject10554;
			interface51.method131();
		}
		super.method14933();
	}

	void method15198() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 137, aBool9674 && !aBool9548);
	}

	void method14953() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 137, aBool9674 && !aBool9548);
	}

	public boolean method3056() {
		if (aBool11416)
			return false;
		if (aLongArray11419[anInt11451] != 0L)
			return false;
		return true;
	}

	void method15211() {
		if (aBool9647) {
			D3DLIGHT.SetAmbient(aLong11417, aFloat9689 * aFloat9643, aFloat9614 * aFloat9643, aFloat9704 * aFloat9643, 0.0F);
			aBool11420 = false;
		}
	}

	public Interface22 method3441(int i, int i_140_, Class158 class158, Class170 class170, int i_141_) {
		return new Class416(this, class158, class170, i, i_140_, i_141_);
	}

	public void method3195() {
		/* empty */
	}

	void method15204() {
		if (aBool9647) {
			float f = aBool9679 ? aFloat9617 : 0.0F;
			float f_142_ = aBool9679 ? -aFloat9618 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11417, f * aFloat9689, f * aFloat9614, f * aFloat9704, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11418, f_142_ * aFloat9689, f_142_ * aFloat9614, f_142_ * aFloat9704, 0.0F);
			aBool11420 = false;
		}
	}

	void method15205() {
		if (aBool9647) {
			D3DLIGHT.SetDirection(aLong11417, -aFloatArray9608[0], -aFloatArray9608[1], -aFloatArray9608[2]);
			D3DLIGHT.SetDirection(aLong11418, -aFloatArray9582[0], -aFloatArray9582[1], -aFloatArray9582[2]);
			aBool11420 = false;
		}
	}

	void method15269() {
		if (aBool9647) {
			int i = (aBoolArray11423[anInt9626] ? method17829(aClass374Array9630[anInt9626]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 1, i);
		}
	}

	void method15207() {
		if (aBool9647) {
			D3DLIGHT.SetDirection(aLong11417, -aFloatArray9608[0], -aFloatArray9608[1], -aFloatArray9608[2]);
			D3DLIGHT.SetDirection(aLong11418, -aFloatArray9582[0], -aFloatArray9582[1], -aFloatArray9582[2]);
			aBool11420 = false;
		}
	}

	Class345 method15305(Class378[] class378s) {
		return new Class345_Sub2(this, class378s);
	}

	boolean method14990(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 3, method17835(class158, class170))));
	}

	public Interface22 method3050(int i, int i_143_, Class158 class158, Class170 class170, int i_144_) {
		return new Class416(this, class158, class170, i, i_143_, i_144_);
	}

	void method15210() {
		method14985();
		method14987();
	}

	void method15115() {
		method14985();
		method14987();
	}

	public int method3294() {
		if (aLongArray11419[anInt11450] == 0L)
			return -1;
		return ((Class358.method6281(IDirect3DEventQuery.IsSignaled(aLongArray11419[anInt11450]))) ? anIntArray11432[anInt11450] : -1);
	}

	void method15212() {
		method14985();
		method14987();
	}

	void method15079() {
		method14985();
		method14987();
	}

	void method15139() {
		int i;
		for (i = 0; i < anInt9602; i++) {
			Class523_Sub20 class523_sub20 = aClass523_Sub20Array9671[i];
			int i_145_ = i + 2;
			int i_146_ = class523_sub20.method16067(856453637);
			float f = class523_sub20.method16068((byte) 0) / 255.0F;
			D3DLIGHT.SetPosition(aLong11410, (float) class523_sub20.method16062(2131811589), (float) class523_sub20.method16091(351679388), (float) class523_sub20.method16065(1966510459));
			D3DLIGHT.SetDiffuse(aLong11410, (float) (i_146_ >> 16 & 0xff) * f, (float) (i_146_ >> 8 & 0xff) * f, (float) (i_146_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11410, 0.0F, 0.0F, 1.0F / (float) (class523_sub20.method16066(-1879460461) * class523_sub20.method16066(-1879460461)));
			D3DLIGHT.SetRange(aLong11410, (float) class523_sub20.method16066(-1879460461));
			IDirect3DDevice.SetLight(aLong11412, i_145_, aLong11410);
			IDirect3DDevice.LightEnable(aLong11412, i_145_, true);
		}
		for (/**/; i < anInt9620; i++)
			IDirect3DDevice.LightEnable(aLong11412, i + 2, false);
	}

	void method15216() {
		int i;
		for (i = 0; i < anInt9602; i++) {
			Class523_Sub20 class523_sub20 = aClass523_Sub20Array9671[i];
			int i_147_ = i + 2;
			int i_148_ = class523_sub20.method16067(856453637);
			float f = class523_sub20.method16068((byte) 0) / 255.0F;
			D3DLIGHT.SetPosition(aLong11410, (float) class523_sub20.method16062(2131811589), (float) class523_sub20.method16091(-123358155), (float) class523_sub20.method16065(1896346985));
			D3DLIGHT.SetDiffuse(aLong11410, (float) (i_148_ >> 16 & 0xff) * f, (float) (i_148_ >> 8 & 0xff) * f, (float) (i_148_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11410, 0.0F, 0.0F, 1.0F / (float) (class523_sub20.method16066(-1879460461) * class523_sub20.method16066(-1879460461)));
			D3DLIGHT.SetRange(aLong11410, (float) class523_sub20.method16066(-1879460461));
			IDirect3DDevice.SetLight(aLong11412, i_147_, aLong11410);
			IDirect3DDevice.LightEnable(aLong11412, i_147_, true);
		}
		for (/**/; i < anInt9620; i++)
			IDirect3DDevice.LightEnable(aLong11412, i + 2, false);
	}

	Interface37 method15083(Class158 class158, Class170 class170, int i, int i_149_) {
		return new Class404_Sub3(this, class158, class170, i, i_149_);
	}

	boolean method15218(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 3, method17835(class158, class170))));
	}

	public void method3211(int i, int i_150_, int i_151_) {
		if (aLong11428 == 0L)
			method17818(i_150_, i_151_);
		long l = IDirect3DDevice.GetRenderTarget(aLong11412, 0);
		if (!Class358.method6280(IDirect3DDevice.StretchRect(aLong11412, l, 0, 0, aClass168_1938.method2875(), aClass168_1938.method2874(), aLong11428, anInt1945 * 1970564341, anInt1937 * 1216763507, anInt1946 * -750425387, anInt1915 * -733304105, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong11412, aLong11428, aLongArray11448[anInt11451]);
		long l_152_ = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l_152_)))
			aLongArray11419[anInt11451] = l_152_;
		anIntArray11432[anInt11451] = i;
		if (++anInt11451 >= 3)
			anInt11451 = 0;
	}

	boolean method14930(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 3, method17835(class158, class170))));
	}

	boolean method15221(Class158 class158, Class170 class170) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class358.method6281(IDirect3D.GetAdapterDisplayMode(aLong11411, anInt11441, d3ddisplaymode)) && Class358.method6281(IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, d3ddisplaymode.Format, 0, 4, method17835(class158, class170))));
	}

	Interface37 method15183(Class158 class158, int i, int i_153_, boolean bool, byte[] is, int i_154_, int i_155_) {
		return new Class404_Sub3(this, class158, i, i_153_, bool, is, i_154_, i_155_);
	}

	Interface37 method14988(Class158 class158, int i, int i_156_, boolean bool, byte[] is, int i_157_, int i_158_) {
		return new Class404_Sub3(this, class158, i, i_156_, bool, is, i_157_, i_158_);
	}

	void method14931() {
		for (int i = 0; i < anInt9680; i++) {
			IDirect3DDevice.SetSamplerState(aLong11412, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 2, 1);
			aClass342Array11425[i] = Class342.aClass342_3610;
			boolean[] bools = aBoolArray11421;
			int i_159_ = i;
			aBoolArray11453[i] = true;
			bools[i_159_] = true;
			aBoolArray11434[i] = false;
			anIntArray11444[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11412, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11412, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11412, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11412, 24, 0);
		IDirect3DDevice.method15723(aLong11412, 206, aBool9528);
		IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
		method17832();
		IDirect3DDevice.SetRenderState(aLong11412, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 145, 1);
		IDirect3DDevice.method15722(aLong11412, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11412, 35, 3);
		IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
		D3DLIGHT.SetType(aLong11417, 3);
		D3DLIGHT.SetType(aLong11418, 3);
		D3DLIGHT.SetType(aLong11410, 1);
		aBool11420 = false;
		super.method14931();
	}

	final void method15097() {
		if (aBool9647)
			IDirect3DDevice.SetRenderState(aLong11412, 60, anInt9632);
	}

	Interface37 method15231(int i, int i_160_, boolean bool, int[] is, int i_161_, int i_162_) {
		return new Class404_Sub3(this, i, i_160_, bool, is, i_161_, i_162_);
	}

	Interface41 method15013(Class158 class158, Class170 class170, int i, int i_163_) {
		return new Class404_Sub3_Sub1(this, class158, class170, i, i_163_);
	}

	void method15124() {
		for (int i = 0; i < anInt9680; i++) {
			IDirect3DDevice.SetSamplerState(aLong11412, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong11412, i, 2, 1);
			aClass342Array11425[i] = Class342.aClass342_3610;
			boolean[] bools = aBoolArray11421;
			int i_164_ = i;
			aBoolArray11453[i] = true;
			bools[i_164_] = true;
			aBoolArray11434[i] = false;
			anIntArray11444[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong11412, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 9, 2);
		IDirect3DDevice.SetRenderState(aLong11412, 23, 4);
		IDirect3DDevice.SetRenderState(aLong11412, 25, 5);
		IDirect3DDevice.SetRenderState(aLong11412, 24, 0);
		IDirect3DDevice.method15723(aLong11412, 206, aBool9528);
		IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
		method17832();
		IDirect3DDevice.SetRenderState(aLong11412, 147, 1);
		IDirect3DDevice.SetRenderState(aLong11412, 145, 1);
		IDirect3DDevice.method15722(aLong11412, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong11412, 35, 3);
		IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
		D3DLIGHT.SetType(aLong11417, 3);
		D3DLIGHT.SetType(aLong11418, 3);
		D3DLIGHT.SetType(aLong11410, 1);
		aBool11420 = false;
		super.method14931();
	}

	Interface34 method15234(Class158 class158, int i, int i_165_, int i_166_, boolean bool, byte[] is) {
		return new Class404_Sub2(this, class158, i, i_165_, i_166_, bool, is);
	}

	Interface41 method15235(Class158 class158, Class170 class170, int i, int i_167_) {
		return new Class404_Sub3_Sub1(this, class158, class170, i, i_167_);
	}

	Interface37 method15014(int i, int i_168_, boolean bool, int[] is, int i_169_, int i_170_) {
		return new Class404_Sub3(this, i, i_168_, bool, is, i_169_, i_170_);
	}

	Interface41 method15237(Class158 class158, Class170 class170, int i, int i_171_) {
		return new Class404_Sub3_Sub1(this, class158, class170, i, i_171_);
	}

	public void method15055() {
		if (aBoolArray11423[anInt9626]) {
			aBoolArray11423[anInt9626] = false;
			IDirect3DDevice.SetTexture(aLong11412, anInt9626, 0L);
			method14955();
			method15016();
		}
	}

	void method15298(boolean bool) {
		IDirect3DDevice.method15723(aLong11412, 161, bool);
	}

	public void method3191(boolean bool) {
		/* empty */
	}

	void method15000(int i) {
		IDirect3DDevice.SetRenderState(aLong11412, 168, i);
	}

	public final void method15314(Class376 class376, int i, int i_172_, int i_173_, int i_174_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11412, method17837(class376), 0, i, i_172_, i_173_, i_174_);
	}

	final void method15265() {
		if (aBool9647)
			IDirect3DDevice.SetRenderState(aLong11412, 60, anInt9632);
	}

	void method14992() {
		if (aLong11429 == 0L && aClass377Array9665[anInt9626] != Class377.aClass377_3926) {
			if (aClass377Array9665[anInt9626] == Class377.aClass377_3923)
				IDirect3DDevice.SetTransform(aLong11412, 16 + anInt9626, aClass441Array9547[anInt9626].method7101(aFloatArray11414));
			else
				IDirect3DDevice.SetTransform(aLong11412, 16 + anInt9626, aClass441Array9547[anInt9626].method7134(aFloatArray11414));
			int i = method17828(aClass377Array9665[anInt9626]);
			if (i != anIntArray11444[anInt9626]) {
				IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 24, i);
				anIntArray11444[anInt9626] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 24, 0);
			anIntArray11444[anInt9626] = 0;
		}
	}

	void method15266() {
		if (aLong11429 == 0L && aClass377Array9665[anInt9626] != Class377.aClass377_3926) {
			if (aClass377Array9665[anInt9626] == Class377.aClass377_3923)
				IDirect3DDevice.SetTransform(aLong11412, 16 + anInt9626, aClass441Array9547[anInt9626].method7101(aFloatArray11414));
			else
				IDirect3DDevice.SetTransform(aLong11412, 16 + anInt9626, aClass441Array9547[anInt9626].method7134(aFloatArray11414));
			int i = method17828(aClass377Array9665[anInt9626]);
			if (i != anIntArray11444[anInt9626]) {
				IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 24, i);
				anIntArray11444[anInt9626] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 24, 0);
			anIntArray11444[anInt9626] = 0;
		}
	}

	void method14986() {
		/* empty */
	}

	public void method15126(int i, Interface36 interface36) {
		Class405 class405 = (Class405) interface36;
		IDirect3DDevice.SetStreamSource(aLong11412, i, class405.aLong4182, 0, class405.method6608());
	}

	public Class168_Sub1 method3022() {
		return new Class168_Sub1_Sub1_Sub1(this);
	}

	public int[] method3293(int i, int i_175_, int i_176_, int i_177_) {
		method3206();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong11412, 0);
		long l_178_ = IDirect3DDevice.CreateRenderTarget(aLong11412, i_176_, i_177_, 21, 0, 0, true);
		int i_179_ = IDirect3DDevice.StretchRect(aLong11412, l, i, i_175_, i_176_, i_177_, l_178_, 0, 0, i_176_, i_177_, 1);
		method15125(i_176_ * i_177_ * 4);
		if (Class358.method6281(i_179_)) {
			is = new int[i_176_ * i_177_];
			IDirect3DSurface.Download(l_178_, 0, 0, i_176_, i_177_, i_176_ * 4, 16, aLong9540);
			aByteBuffer9539.clear();
			aByteBuffer9539.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_178_);
		return is;
	}

	void method15114(int i) {
		IDirect3DDevice.SetRenderState(aLong11412, 168, i);
	}

	public Class185 method3305(Class185 class185, Class185 class185_180_, float f, Class185 class185_181_) {
		return f < 0.5F ? class185 : class185_180_;
	}

	void method15284(int i) {
		IDirect3DDevice.SetRenderState(aLong11412, 168, i);
	}

	public long method3215(int i, int i_182_) {
		return method17819(i, i_182_, null, null);
	}

	void method15286() {
		IDirect3DDevice.method15723(aLong11412, 15, aBool9563);
		IDirect3DDevice.SetRenderState(aLong11412, 24, aByte9672 & 0xff);
		if (aD3DPRESENT_PARAMETERS11413.MultiSampleType > 0) {
			if (!aBool9563 || aByte9672 == 0) {
				if (aBool11437 || aBool11435)
					IDirect3DDevice.SetRenderState(aLong11412, 181, 0);
				else if (aBool11436)
					IDirect3DDevice.method15722(aLong11412, 154, 1.0F);
			} else if (aBool11437)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('S', 'S', 'A', 'A'));
			else if (aBool11435)
				IDirect3DDevice.SetRenderState(aLong11412, 181, method15078('A', 'T', 'O', 'C'));
			else if (aBool11436)
				IDirect3DDevice.SetRenderState(aLong11412, 154, method15078('A', '2', 'M', '1'));
		}
	}

	Interface37 method15331(Class158 class158, Class170 class170, int i, int i_183_) {
		return new Class404_Sub3(this, class158, class170, i, i_183_);
	}

	public void method14970(Class441 class441) {
		class441.method7089(aClass441_11427);
	}

	void method15288() {
		IDirect3DDevice.method15723(aLong11412, 27, aBool9549);
	}

	void method15289() {
		IDirect3DDevice.method15723(aLong11412, 27, aBool9549);
	}

	void method15028(boolean bool) {
		IDirect3DDevice.method15723(aLong11412, 161, bool);
	}

	public Class150 method3372() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong11411, anInt11441, 0, d3dadapter_identifier);
		return new Class150(d3dadapter_identifier.VendorID, method14920() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method14920());
	}

	void method15062() {
		if (aBool9647) {
			D3DLIGHT.SetAmbient(aLong11417, aFloat9689 * aFloat9643, aFloat9614 * aFloat9643, aFloat9704 * aFloat9643, 0.0F);
			aBool11420 = false;
		}
	}

	void method15044(int i) {
		if (!aBool11440) {
			int i_184_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11412, 8, i_184_);
		}
	}

	void method15081() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 28, (aBool9573 && aBool9660 && anInt9663 >= 0));
	}

	void method15297(boolean bool) {
		IDirect3DDevice.method15723(aLong11412, 161, bool);
	}

	long method17843(int i, int i_185_, int[] is, int[] is_186_) {
		if (aLongArray11419[anInt11450] != 0L) {
			IUnknown.Release(aLongArray11419[anInt11450]);
			aLongArray11419[anInt11450] = 0L;
		}
		aByteBuffer9539.clear();
		IDirect3DSurface.Download(aLongArray11448[anInt11450], 0, 0, i, i_185_, i * 4, 0, aLong9540);
		if (++anInt11450 >= 3)
			anInt11450 = 0;
		if (is != null) {
			aByteBuffer9539.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9540;
	}

	void method15299(boolean bool) {
		IDirect3DDevice.method15723(aLong11412, 161, bool);
	}

	final Interface40 method15300(boolean bool) {
		return new Class422(this, Class170.aClass170_1826, bool);
	}

	final Interface40 method15301(boolean bool) {
		return new Class422(this, Class170.aClass170_1826, bool);
	}

	void method14947() {
		if (aBool9647) {
			D3DLIGHT.SetAmbient(aLong11417, aFloat9689 * aFloat9643, aFloat9614 * aFloat9643, aFloat9704 * aFloat9643, 0.0F);
			aBool11420 = false;
		}
	}

	Class345 method15303(Class378[] class378s) {
		return new Class345_Sub2(this, class378s);
	}

	Class345 method15194(Class378[] class378s) {
		return new Class345_Sub2(this, class378s);
	}

	public int method3059() {
		if (aLongArray11419[anInt11450] == 0L)
			return -1;
		return ((Class358.method6281(IDirect3DEventQuery.IsSignaled(aLongArray11419[anInt11450]))) ? anIntArray11432[anInt11450] : -1);
	}

	public void method14943(Class345 class345) {
		Class345_Sub2 class345_sub2 = (Class345_Sub2) class345;
		IDirect3DDevice.SetVertexDeclaration(aLong11412, class345_sub2.aLong10149);
	}

	void method15197() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 137, aBool9674 && !aBool9548);
	}

	void method15256(Interface40 interface40) {
		IDirect3DDevice.SetIndices(aLong11412, ((Class422) interface40).aLong4793);
	}

	void method14934(Interface40 interface40) {
		IDirect3DDevice.SetIndices(aLong11412, ((Class422) interface40).aLong4793);
	}

	void method15307(Interface40 interface40) {
		IDirect3DDevice.SetIndices(aLong11412, ((Class422) interface40).aLong4793);
	}

	public final void method15310(Class376 class376, int i, int i_187_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawPrimitive(aLong11412, method17837(class376), i, i_187_);
	}

	Interface41 method14999(Class158 class158, Class170 class170, int i, int i_188_) {
		return new Class404_Sub3_Sub1(this, class158, class170, i, i_188_);
	}

	final void method15312(Interface40 interface40, Class376 class376, int i, int i_189_, int i_190_, int i_191_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11412, (((Class422) interface40).aLong4793), 4, 0, i, i_189_, i_190_, i_191_);
	}

	final void method15329(Interface40 interface40, Class376 class376, int i, int i_192_, int i_193_, int i_194_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11412, (((Class422) interface40).aLong4793), 4, 0, i, i_192_, i_193_, i_194_);
	}

	void method15209() {
		if (aBool9647 && !aBool11420) {
			IDirect3DDevice.LightEnable(aLong11412, 0, false);
			IDirect3DDevice.LightEnable(aLong11412, 1, false);
			IDirect3DDevice.SetLight(aLong11412, 0, aLong11417);
			IDirect3DDevice.SetLight(aLong11412, 1, aLong11418);
			IDirect3DDevice.LightEnable(aLong11412, 0, true);
			IDirect3DDevice.LightEnable(aLong11412, 1, true);
			aBool11420 = true;
		}
	}

	public final void method15315(Class376 class376, int i, int i_195_, int i_196_, int i_197_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11412, method17837(class376), 0, i, i_195_, i_196_, i_197_);
	}

	public final void method15316(Class376 class376, int i, int i_198_, int i_199_, int i_200_) {
		if (aClass270_Sub2_11449 != null)
			aClass270_Sub2_11449.method15619();
		IDirect3DDevice.DrawIndexedPrimitive(aLong11412, method17837(class376), 0, i, i_198_, i_199_, i_200_);
	}

	void method15320(int i) {
		if (!aBool11440) {
			int i_201_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11412, 8, i_201_);
		}
	}

	void method15321(int i) {
		if (!aBool11440) {
			int i_202_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong11412, 8, i_202_);
		}
	}

	final Interface36 method15302(boolean bool) {
		return new Class405(this, bool);
	}

	void method15296() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 28, (aBool9573 && aBool9660 && anInt9663 >= 0));
	}

	void method15075() {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(1339097334); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) -112)) {
			Interface51 interface51 = (Interface51) class523_sub28.anObject10554;
			interface51.method363();
			if (interface51 == aClass168_1938)
				interface51.method359();
		}
		super.method14927();
	}

	void method15295() {
		if (aBool9647)
			IDirect3DDevice.method15723(aLong11412, 28, (aBool9573 && aBool9660 && anInt9663 >= 0));
	}

	final void method17844(long l) {
		aLong11429 = l;
		IDirect3DDevice.SetVertexShader(aLong11412, l);
	}

	boolean method17845(int i, int i_203_) {
		int i_204_ = IDirect3DDevice.TestCooperativeLevel(aLong11412);
		if (i_204_ == 0 || i_204_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong11412, 0L);
			for (int i_205_ = 1; i_205_ < 4; i_205_++)
				IDirect3DDevice.SetRenderTarget(aLong11412, i_205_, 0L);
			for (int i_206_ = 0; i_206_ < 4; i_206_++)
				IDirect3DDevice.SetStreamSource(aLong11412, i_206_, 0L, 0, 0);
			for (int i_207_ = 0; i_207_ < 4; i_207_++)
				IDirect3DDevice.SetTexture(aLong11412, i_207_, 0L);
			IDirect3DDevice.SetIndices(aLong11412, 0L);
			method14933();
			aD3DPRESENT_PARAMETERS11413.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11413.BackBufferHeight = i_203_;
			aD3DPRESENT_PARAMETERS11413.BackBufferCount = 1;
			if (method17838(anInt11441, anInt11424, aLong11411, anInt9661, aD3DDISPLAYMODE11447, aD3DPRESENT_PARAMETERS11413)) {
				int i_208_ = IDirect3DDevice.Reset(aLong11412, aD3DPRESENT_PARAMETERS11413);
				if (Class358.method6281(i_208_)) {
					aBool11416 = false;
					method14927();
					method14931();
					return true;
				}
			}
		}
		return false;
	}

	void method15323() {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(859773123); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) 72)) {
			Interface51 interface51 = (Interface51) class523_sub28.anObject10554;
			interface51.method363();
			if (interface51 == aClass168_1938)
				interface51.method359();
		}
		super.method14927();
	}

	public float method15326() {
		return -0.5F;
	}

	Class523_Sub28 method17846(Interface51 interface51) {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(1973089692); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) -19)) {
			if (class523_sub28.anObject10554 == interface51)
				return class523_sub28;
		}
		return null;
	}

	Class523_Sub28 method17847(Interface51 interface51) {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(1500079290); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) 38)) {
			if (class523_sub28.anObject10554 == interface51)
				return class523_sub28;
		}
		return null;
	}

	Class523_Sub28 method17848(Interface51 interface51) {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(2147256058); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) -8)) {
			if (class523_sub28.anObject10554 == interface51)
				return class523_sub28;
		}
		return null;
	}

	long method17849(int i, int i_209_, int[] is, int[] is_210_) {
		if (aLongArray11419[anInt11450] != 0L) {
			IUnknown.Release(aLongArray11419[anInt11450]);
			aLongArray11419[anInt11450] = 0L;
		}
		aByteBuffer9539.clear();
		IDirect3DSurface.Download(aLongArray11448[anInt11450], 0, 0, i, i_209_, i * 4, 0, aLong9540);
		if (++anInt11450 >= 3)
			anInt11450 = 0;
		if (is != null) {
			aByteBuffer9539.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9540;
	}

	long method17850(int i, int i_211_, int[] is, int[] is_212_) {
		if (aLongArray11419[anInt11450] != 0L) {
			IUnknown.Release(aLongArray11419[anInt11450]);
			aLongArray11419[anInt11450] = 0L;
		}
		aByteBuffer9539.clear();
		IDirect3DSurface.Download(aLongArray11448[anInt11450], 0, 0, i, i_211_, i * 4, 0, aLong9540);
		if (++anInt11450 >= 3)
			anInt11450 = 0;
		if (is != null) {
			aByteBuffer9539.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9540;
	}

	public void method3219() {
		long l = IDirect3DDevice.CreateEventQuery(aLong11412);
		if (Class358.method6281(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method15054() {
		IDirect3DDevice.method15723(aLong11412, 174, aBool9675);
	}

	void method15327() {
		IDirect3DDevice.method15723(aLong11412, 174, aBool9675);
	}

	void method15144() {
		IDirect3DDevice.method15723(aLong11412, 174, aBool9675);
	}

	void method15328() {
		IDirect3DDevice.method15723(aLong11412, 174, aBool9675);
	}

	void method14955() {
		if (aBool9647) {
			int i = (aBoolArray11423[anInt9626] ? method17829(aClass374Array9631[anInt9626]) : 1);
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, 4, i);
		}
	}

	final void method17851(long l) {
		IDirect3DDevice.SetPixelShader(aLong11412, l);
	}

	Interface37 method15201(Class158 class158, Class170 class170, int i, int i_213_) {
		return new Class404_Sub3(this, class158, class170, i, i_213_);
	}

	final void method17852(Class404_Sub3 class404_sub3) {
		method17825(class404_sub3);
		if (aBoolArray11421[anInt9626] != class404_sub3.aBool10181) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 1, class404_sub3.aBool10181 ? 1 : 3);
			aBoolArray11421[anInt9626] = class404_sub3.aBool10181;
		}
		if (aBoolArray11453[anInt9626] != class404_sub3.aBool10180) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 2, class404_sub3.aBool10180 ? 1 : 3);
			aBoolArray11453[anInt9626] = class404_sub3.aBool10180;
		}
	}

	void method15324() {
		for (Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass708_11442.method14240(584844195); class523_sub28 != null; class523_sub28 = (Class523_Sub28) aClass708_11442.method14244((byte) 55)) {
			Interface51 interface51 = (Interface51) class523_sub28.anObject10554;
			interface51.method363();
			if (interface51 == aClass168_1938)
				interface51.method359();
		}
		super.method14927();
	}

	Interface37 method15332(Class158 class158, Class170 class170, int i, int i_214_) {
		return new Class404_Sub3(this, class158, class170, i, i_214_);
	}

	Interface37 method15333(Class158 class158, Class170 class170, int i, int i_215_) {
		return new Class404_Sub3(this, class158, class170, i, i_215_);
	}

	final void method17853(Class404 class404) {
		IDirect3DDevice.SetTexture(aLong11412, anInt9626, class404.method6602());
		if (aBool9647 && !aBoolArray11423[anInt9626]) {
			aBoolArray11423[anInt9626] = true;
			method14955();
			method15016();
		}
	}

	public boolean method15119() {
		return (aD3DCAPS11430.PixelShaderVersion & 0xffff) >= 257;
	}

	final void method17854(Class404_Sub3 class404_sub3) {
		method17825(class404_sub3);
		if (aBoolArray11421[anInt9626] != class404_sub3.aBool10181) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 1, class404_sub3.aBool10181 ? 1 : 3);
			aBoolArray11421[anInt9626] = class404_sub3.aBool10181;
		}
		if (aBoolArray11453[anInt9626] != class404_sub3.aBool10180) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 2, class404_sub3.aBool10180 ? 1 : 3);
			aBoolArray11453[anInt9626] = class404_sub3.aBool10180;
		}
	}

	Class178_Sub2_Sub1(int i, int i_216_, long l, long l_217_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_218_) {
		super(class172, interface25, interface46, interface48, interface45, class472, i_218_, 0);
		aBool11416 = false;
		aLong11417 = 0L;
		aLong11418 = 0L;
		aLong11410 = 0L;
		aBool11420 = false;
		aFloatArray11414 = new float[16];
		anInt11409 = 128;
		anInt11443 = 0;
		aLongArray11426 = new long[anInt11409];
		aLong11428 = 0L;
		aLongArray11419 = new long[3];
		aLongArray11448 = new long[3];
		anIntArray11432 = new int[3];
		anInt11450 = 0;
		anInt11451 = 0;
		try {
			anInt11441 = i;
			anInt11424 = i_216_;
			aLong11411 = l;
			aLong11412 = l_217_;
			aD3DDISPLAYMODE11447 = d3ddisplaymode;
			aD3DPRESENT_PARAMETERS11413 = d3dpresent_parameters;
			aD3DCAPS11430 = d3dcaps;
			aLong11417 = D3DLIGHT.Create();
			aLong11418 = D3DLIGHT.Create();
			aLong11410 = D3DLIGHT.Create();
			anInt9680 = aD3DCAPS11430.MaxSimultaneousTextures;
			anInt9524 = (aD3DCAPS11430.MaxActiveLights > 0 ? aD3DCAPS11430.MaxActiveLights : 8);
			aBool11431 = (aD3DCAPS11430.TextureCaps & 0x2) == 0;
			aBool9686 = (aD3DCAPS11430.TextureCaps & 0x800) != 0;
			aBool9687 = (aD3DCAPS11430.TextureCaps & 0x2000) != 0;
			aBool11422 = (aD3DCAPS11430.TextureCaps & 0x8000) != 0;
			aBool11433 = (aD3DCAPS11430.TextureCaps & 0x10000) != 0;
			aBool11446 = (aD3DCAPS11430.TextureCaps & 0x4000) != 0;
			aBool9682 = aD3DCAPS11430.NumSimultaneousRTs > 0;
			aBool9688 = aBool9682;
			aBool9566 = aD3DCAPS11430.NumSimultaneousRTs > 0;
			aBool9685 = (anInt9661 > 0 || (IDirect3D.CheckDeviceMultiSampleType(aLong11411, anInt11441, anInt11424, aD3DPRESENT_PARAMETERS11413.BackBufferFormat, true, 2)) == 0);
			aBool9609 = (aD3DCAPS11430.NumSimultaneousRTs > 0 && anInt9661 > 0 || IDirect3D.CheckDeviceMultiSampleType(aLong11411, anInt11441, anInt11424, 113, true, 2) == 0);
			aBool11435 = (IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, (aD3DPRESENT_PARAMETERS11413.BackBufferFormat), 0, 1, method15078('A', 'T', 'O', 'C')) == 0);
			aBool11436 = (IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, (aD3DPRESENT_PARAMETERS11413.BackBufferFormat), 0, 1, method15078('A', '2', 'M', '1')) == 0);
			aBool11437 = (IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, (aD3DPRESENT_PARAMETERS11413.BackBufferFormat), 0, 1, method15078('S', 'S', 'A', 'A')) == 0);
			aBool9528 = (aD3DCAPS11430.PrimitiveMiscCaps & 0x20000) != 0;
			aBool11438 = IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, aD3DDISPLAYMODE11447.Format, 524288, 3, 113) == 0;
			aBool11439 = IDirect3D.CheckDeviceFormat(aLong11411, anInt11441, anInt11424, aD3DDISPLAYMODE11447.Format, 524288, 3, 116) == 0;
			aBoolArray11421 = new boolean[anInt9680];
			aBoolArray11453 = new boolean[anInt9680];
			aBoolArray11423 = new boolean[anInt9680];
			aClass342Array11425 = new Class342[anInt9680];
			aBoolArray11434 = new boolean[anInt9680];
			anIntArray11444 = new int[anInt9680];
			Class435 class435 = new Class435();
			class435.method6815(1.0F, -1.0F, 0.5F);
			class435.method6819(0.0F, 0.0F, 0.5F);
			aClass441_11427 = new Class441();
			aClass441_11427.method7090(class435);
			IDirect3DDevice.BeginScene(aLong11412);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3024(-750078093);
			throw new RuntimeException("");
		}
	}

	final void method17855(Class404_Sub2 class404_sub2) {
		method17825(class404_sub2);
		if (!aBoolArray11421[anInt9626]) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 1, 1);
			aBoolArray11421[anInt9626] = true;
		}
		if (!aBoolArray11453[anInt9626]) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 2, 1);
			aBoolArray11453[anInt9626] = true;
		}
	}

	void method15203() {
		if (aBool9647) {
			D3DLIGHT.SetAmbient(aLong11417, aFloat9689 * aFloat9643, aFloat9614 * aFloat9643, aFloat9704 * aFloat9643, 0.0F);
			aBool11420 = false;
		}
	}

	static final int method17856(Class374 class374) {
		switch (class374.anInt3913) {
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException();
		case 0:
			return 26;
		case 4:
			return 7;
		case 1:
			return 10;
		case 3:
			return 2;
		}
	}

	static final int method17857(Class374 class374) {
		switch (class374.anInt3913) {
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException();
		case 0:
			return 26;
		case 4:
			return 7;
		case 1:
			return 10;
		case 3:
			return 2;
		}
	}

	static final int method17858(Class361 class361) {
		switch (class361.anInt3743) {
		case 1:
			return 3;
		case 2:
			return 0;
		case 3:
			return 1;
		case 0:
			return 2;
		default:
			throw new IllegalArgumentException();
		}
	}

	static final int method17859(Class361 class361) {
		switch (class361.anInt3743) {
		case 1:
			return 3;
		case 2:
			return 0;
		case 3:
			return 1;
		case 0:
			return 2;
		default:
			throw new IllegalArgumentException();
		}
	}

	void method15192() {
		IDirect3DDevice.method15723(aLong11412, 14, aBool9604 && aBool9558);
	}

	void method17860() {
		IDirect3DDevice.SetRenderState(aLong11412, 22, anInt9673);
	}

	void method3221(int i, int i_219_) throws Exception_Sub4 {
		if (aBool11416) {
			if (!method17814(aClass168_Sub2_1939.method2875(), aClass168_Sub2_1939.method2874()))
				return;
			((Class168_Sub2_Sub1_Sub1) aClass168_Sub2_1939).method363();
		} else
			IDirect3DDevice.EndScene(aLong11412);
		int i_220_ = aClass168_Sub2_1939.method15400();
		if (Class358.method6280(i_220_)) {
			aBool11416 = true;
			aClass168_Sub2_1939.method131();
		} else {
			IDirect3DDevice.BeginScene(aLong11412);
			if (anInterface25_1923 != null)
				anInterface25_1923.method20(1992652275);
		}
	}

	static Class178 method17861(Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, Integer integer) {
		Class178_Sub2_Sub1 class178_sub2_sub1 = null;
		Class178_Sub2_Sub1 class178_sub2_sub1_221_;
		try {
			int i = 0;
			int i_222_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_222_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method17838(i, i_222_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_223_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_223_ |= 0x10;
			long l_224_ = 0L;
			try {
				l_224_ = IDirect3D.CreateDeviceContext(l, i, i_222_, canvas, i_223_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub5 runtimeexception_sub5) {
				l_224_ = IDirect3D.CreateDeviceContext(l, i, i_222_, canvas, i_223_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class178_sub2_sub1 = new Class178_Sub2_Sub1(i, i_222_, l, l_224_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, class172, interface25, interface46, interface48, interface45, class472, integer.intValue());
			if (!class178_sub2_sub1.aHashtable1924.containsKey(canvas)) {
				Class194_Sub14.method15513(canvas, (byte) 23);
				class178_sub2_sub1.method3042(canvas, new Class168_Sub2_Sub1_Sub1(class178_sub2_sub1, canvas, canvas.getWidth(), canvas.getHeight(), true), 1198395910);
			}
			class178_sub2_sub1.method3044(canvas, -1669507572);
			class178_sub2_sub1.method15293();
			class178_sub2_sub1_221_ = class178_sub2_sub1;
		} catch (RuntimeException runtimeexception) {
			if (class178_sub2_sub1 != null)
				class178_sub2_sub1.method3023();
			throw runtimeexception;
		}
		return class178_sub2_sub1_221_;
	}

	byte[] method17862(String string) {
		return method14925("dx", string);
	}

	public void method3185() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11419[i] != 0L) {
				IUnknown.Release(aLongArray11419[i]);
				aLongArray11419[i] = 0L;
			}
		}
		anInt11451 = 0;
		anInt11450 = 0;
	}

	void method15071() {
		if (aBool9647) {
			D3DLIGHT.SetDirection(aLong11417, -aFloatArray9608[0], -aFloatArray9608[1], -aFloatArray9608[2]);
			D3DLIGHT.SetDirection(aLong11418, -aFloatArray9582[0], -aFloatArray9582[1], -aFloatArray9582[2]);
			aBool11420 = false;
		}
	}

	static final int method17863(Class376 class376) {
		switch (class376.anInt3920) {
		case 0:
			return 6;
		case 1:
			return 3;
		case 3:
			return 5;
		case 4:
			return 2;
		case 5:
			return 1;
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException("");
		}
	}

	static final int method17864(Class376 class376) {
		switch (class376.anInt3920) {
		case 0:
			return 6;
		case 1:
			return 3;
		case 3:
			return 5;
		case 4:
			return 2;
		case 5:
			return 1;
		case 2:
			return 4;
		default:
			throw new IllegalArgumentException("");
		}
	}

	Interface37 method15330(Class158 class158, Class170 class170, int i, int i_225_) {
		return new Class404_Sub3(this, class158, class170, i, i_225_);
	}

	synchronized void method17865(long l) {
		if (anInt11443 == anInt11409) {
			anInt11409 *= 2;
			long[] ls = new long[anInt11409];
			System.arraycopy(aLongArray11426, 0, ls, 0, anInt11443);
			aLongArray11426 = ls;
		}
		aLongArray11426[anInt11443] = l;
		anInt11443++;
	}

	final void method15251(int i, Class361 class361, boolean bool) {
		if (aBool9647) {
			int i_226_ = 0;
			int i_227_;
			switch (i) {
			case 2:
				i_227_ = 27;
				break;
			default:
				i_227_ = 5;
				break;
			case 1:
				i_227_ = 6;
			}
			if (bool)
				i_226_ |= 0x10;
			IDirect3DDevice.SetTextureStageState(aLong11412, anInt9626, i_227_, (method17830(class361) | i_226_));
		}
	}

	final void method17866(Class404_Sub3 class404_sub3) {
		method17825(class404_sub3);
		if (aBoolArray11421[anInt9626] != class404_sub3.aBool10181) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 1, class404_sub3.aBool10181 ? 1 : 3);
			aBoolArray11421[anInt9626] = class404_sub3.aBool10181;
		}
		if (aBoolArray11453[anInt9626] != class404_sub3.aBool10180) {
			IDirect3DDevice.SetSamplerState(aLong11412, anInt9626, 2, class404_sub3.aBool10180 ? 1 : 3);
			aBoolArray11453[anInt9626] = class404_sub3.aBool10180;
		}
	}
}
