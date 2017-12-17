/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class358;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class405 implements Interface36 {
	boolean aBool4178;
	int anInt4179;
	int anInt4180;
	byte aByte4181;
	long aLong4182 = 0L;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_4183;

	public void method194() {
		IDirect3DVertexBuffer.Unlock(aLong4182);
	}

	public void method130() {
		if (aLong4182 != 0L) {
			IUnknown.Release(aLong4182);
			aLong4182 = 0L;
		}
		anInt4179 = 0;
		anInt4180 = 0;
		aClass178_Sub2_Sub1_4183.method14917(this);
	}

	Class405(Class178_Sub2_Sub1 class178_sub2_sub1, boolean bool) {
		aClass178_Sub2_Sub1_4183 = class178_sub2_sub1;
		aBool4178 = bool;
		aClass178_Sub2_Sub1_4183.method15243(this);
	}

	public void method78() {
		if (aLong4182 != 0L) {
			IUnknown.Release(aLong4182);
			aLong4182 = 0L;
		}
		anInt4179 = 0;
		anInt4180 = 0;
		aClass178_Sub2_Sub1_4183.method14917(this);
	}

	void method6603() {
		method6604();
	}

	public void method79() {
		IDirect3DVertexBuffer.Unlock(aLong4182);
	}

	public boolean method265(int i, int i_0_, long l) {
		return Class358.method6281(IDirect3DVertexBuffer.Upload(aLong4182, i, i_0_, (aBool4178 ? 8192 : 0), l));
	}

	public long method274(int i, int i_1_) {
		return IDirect3DVertexBuffer.Lock(aLong4182, i, i_1_, aBool4178 ? 8192 : 0);
	}

	void method6604() {
		if (aLong4182 != 0L) {
			aClass178_Sub2_Sub1_4183.method17839(aLong4182);
			aLong4182 = 0L;
			anInt4179 = 0;
			anInt4180 = 0;
		}
	}

	public void finalize() {
		method6604();
	}

	public void method132() {
		if (aLong4182 != 0L) {
			IUnknown.Release(aLong4182);
			aLong4182 = 0L;
		}
		anInt4179 = 0;
		anInt4180 = 0;
		aClass178_Sub2_Sub1_4183.method14917(this);
	}

	public boolean method267(int i, int i_2_, long l) {
		return Class358.method6281(IDirect3DVertexBuffer.Upload(aLong4182, i, i_2_, (aBool4178 ? 8192 : 0), l));
	}

	public int method38() {
		return anInt4180;
	}

	int method6605() {
		return aByte4181;
	}

	public boolean method214(int i, int i_3_) {
		anInt4180 = i;
		aByte4181 = (byte) i_3_;
		if (anInt4180 > anInt4179) {
			int i_4_ = 8;
			int i_5_;
			if (aBool4178) {
				i_5_ = 0;
				i_4_ |= 0x200;
			} else
				i_5_ = 1;
			if (aLong4182 != 0L)
				IUnknown.Release(aLong4182);
			aLong4182 = IDirect3DDevice.CreateVertexBuffer((aClass178_Sub2_Sub1_4183.aLong11412), anInt4180, i_4_, 0, i_5_);
			anInt4179 = anInt4180;
		}
		return aLong4182 != 0L;
	}

	public int method88() {
		return anInt4180;
	}

	public long method270(int i, int i_6_) {
		return IDirect3DVertexBuffer.Lock(aLong4182, i, i_6_, aBool4178 ? 8192 : 0);
	}

	public boolean method268(int i, int i_7_, long l) {
		return Class358.method6281(IDirect3DVertexBuffer.Upload(aLong4182, i, i_7_, (aBool4178 ? 8192 : 0), l));
	}

	public boolean method269(int i, int i_8_, long l) {
		return Class358.method6281(IDirect3DVertexBuffer.Upload(aLong4182, i, i_8_, (aBool4178 ? 8192 : 0), l));
	}

	public boolean method215(int i, int i_9_) {
		anInt4180 = i;
		aByte4181 = (byte) i_9_;
		if (anInt4180 > anInt4179) {
			int i_10_ = 8;
			int i_11_;
			if (aBool4178) {
				i_11_ = 0;
				i_10_ |= 0x200;
			} else
				i_11_ = 1;
			if (aLong4182 != 0L)
				IUnknown.Release(aLong4182);
			aLong4182 = IDirect3DDevice.CreateVertexBuffer((aClass178_Sub2_Sub1_4183.aLong11412), anInt4180, i_10_, 0, i_11_);
			anInt4179 = anInt4180;
		}
		return aLong4182 != 0L;
	}

	public long method271(int i, int i_12_) {
		return IDirect3DVertexBuffer.Lock(aLong4182, i, i_12_, aBool4178 ? 8192 : 0);
	}

	public void method272() {
		IDirect3DVertexBuffer.Unlock(aLong4182);
	}

	public void method273() {
		IDirect3DVertexBuffer.Unlock(aLong4182);
	}

	public void method266() {
		IDirect3DVertexBuffer.Unlock(aLong4182);
	}

	void method6606() {
		if (aLong4182 != 0L) {
			aClass178_Sub2_Sub1_4183.method17839(aLong4182);
			aLong4182 = 0L;
			anInt4179 = 0;
			anInt4180 = 0;
		}
	}

	int method6607() {
		return aByte4181;
	}

	int method6608() {
		return aByte4181;
	}

	public void method131() {
		if (aLong4182 != 0L) {
			IUnknown.Release(aLong4182);
			aLong4182 = 0L;
		}
		anInt4179 = 0;
		anInt4180 = 0;
		aClass178_Sub2_Sub1_4183.method14917(this);
	}
}
