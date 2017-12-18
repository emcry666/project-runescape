/* Class422 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class358;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class422 implements Interface40 {
	int anInt4791;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_4792;
	long aLong4793 = 0L;
	boolean aBool4794;
	Class170 aClass170_4795;
	int anInt4796;

	public long method274(int i, int i_0_) {
		return IDirect3DIndexBuffer.Lock(aLong4793, i, i_0_, aBool4794 ? 8192 : 0);
	}

	Class422(Class178_Sub2_Sub1 class178_sub2_sub1, Class170 class170, boolean bool) {
		aClass178_Sub2_Sub1_4792 = class178_sub2_sub1;
		aClass170_4795 = class170;
		aBool4794 = bool;
		aClass178_Sub2_Sub1_4792.method15243(this);
	}

	public Class170 method276() {
		return aClass170_4795;
	}

	public void method275(int i) {
		anInt4796 = aClass170_4795.anInt1831 * 1602321003 * i;
		if (anInt4796 > anInt4791) {
			if (aLong4793 != 0L)
				IUnknown.Release(aLong4793);
			int i_1_ = 8;
			int i_2_;
			if (aBool4794) {
				i_2_ = 0;
				i_1_ |= 0x200;
			} else
				i_2_ = 1;
			aLong4793 = (IDirect3DDevice.CreateIndexBuffer(aClass178_Sub2_Sub1_4792.aLong11412, anInt4796, i_1_, aClass170_4795 == Class170.aClass170_1826 ? 101 : 102, i_2_));
			anInt4791 = anInt4796;
		}
	}

	public void method273() {
		IDirect3DIndexBuffer.Unlock(aLong4793);
	}

	public void method131() {
		if (aLong4793 != 0L) {
			IUnknown.Release(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
		aClass178_Sub2_Sub1_4792.method14917(this);
	}

	public boolean method265(int i, int i_3_, long l) {
		return Class358.method6281(IDirect3DIndexBuffer.Upload(aLong4793, i, i_3_, (aBool4794 ? 8192 : 0), l));
	}

	public void finalize() {
		method6679();
	}

	public int method88() {
		return anInt4796;
	}

	public void method266() {
		IDirect3DIndexBuffer.Unlock(aLong4793);
	}

	public void method272() {
		IDirect3DIndexBuffer.Unlock(aLong4793);
	}

	public void method132() {
		if (aLong4793 != 0L) {
			IUnknown.Release(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
		aClass178_Sub2_Sub1_4792.method14917(this);
	}

	public void method78() {
		if (aLong4793 != 0L) {
			IUnknown.Release(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
		aClass178_Sub2_Sub1_4792.method14917(this);
	}

	void method6678() {
		method6679();
	}

	public int method38() {
		return anInt4796;
	}

	public boolean method267(int i, int i_4_, long l) {
		return Class358.method6281(IDirect3DIndexBuffer.Upload(aLong4793, i, i_4_, (aBool4794 ? 8192 : 0), l));
	}

	public boolean method268(int i, int i_5_, long l) {
		return Class358.method6281(IDirect3DIndexBuffer.Upload(aLong4793, i, i_5_, (aBool4794 ? 8192 : 0), l));
	}

	public boolean method269(int i, int i_6_, long l) {
		return Class358.method6281(IDirect3DIndexBuffer.Upload(aLong4793, i, i_6_, (aBool4794 ? 8192 : 0), l));
	}

	public long method270(int i, int i_7_) {
		return IDirect3DIndexBuffer.Lock(aLong4793, i, i_7_, aBool4794 ? 8192 : 0);
	}

	public long method271(int i, int i_8_) {
		return IDirect3DIndexBuffer.Lock(aLong4793, i, i_8_, aBool4794 ? 8192 : 0);
	}

	public void method79() {
		IDirect3DIndexBuffer.Unlock(aLong4793);
	}

	public void method130() {
		if (aLong4793 != 0L) {
			IUnknown.Release(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
		aClass178_Sub2_Sub1_4792.method14917(this);
	}

	void method6679() {
		if (aLong4793 != 0L) {
			aClass178_Sub2_Sub1_4792.method17839(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
	}

	public void method194() {
		IDirect3DIndexBuffer.Unlock(aLong4793);
	}

	public Class170 method278() {
		return aClass170_4795;
	}

	public void method277(int i) {
		anInt4796 = aClass170_4795.anInt1831 * 1602321003 * i;
		if (anInt4796 > anInt4791) {
			if (aLong4793 != 0L)
				IUnknown.Release(aLong4793);
			int i_9_ = 8;
			int i_10_;
			if (aBool4794) {
				i_10_ = 0;
				i_9_ |= 0x200;
			} else
				i_10_ = 1;
			aLong4793 = (IDirect3DDevice.CreateIndexBuffer(aClass178_Sub2_Sub1_4792.aLong11412, anInt4796, i_9_, aClass170_4795 == Class170.aClass170_1826 ? 101 : 102, i_10_));
			anInt4791 = anInt4796;
		}
	}

	void method6680() {
		if (aLong4793 != 0L) {
			aClass178_Sub2_Sub1_4792.method17839(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
	}

	void method6681() {
		if (aLong4793 != 0L) {
			aClass178_Sub2_Sub1_4792.method17839(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
	}

	void method6682() {
		if (aLong4793 != 0L) {
			aClass178_Sub2_Sub1_4792.method17839(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
	}

	void method6683() {
		if (aLong4793 != 0L) {
			aClass178_Sub2_Sub1_4792.method17839(aLong4793);
			aLong4793 = 0L;
		}
		anInt4791 = 0;
		anInt4796 = 0;
	}
}
