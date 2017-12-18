/* Class404_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class404_Sub2 extends Class404 implements Interface34 {
	int anInt10151;
	int anInt10152;
	int anInt10153;

	public void method131() {
		super.method131();
	}

	long method6602() {
		return aLong4173;
	}

	public void method297() {
		aClass178_Sub2_Sub1_4176.method17827(this);
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	public void method78() {
		super.method131();
	}

	public void method130() {
		super.method131();
	}

	long method6594() {
		return aLong4173;
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	long method6595() {
		return aLong4173;
	}

	public void method332() {
		aClass178_Sub2_Sub1_4176.method17827(this);
	}

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	public void method132() {
		super.method131();
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}

	public void method331() {
		aClass178_Sub2_Sub1_4176.method17827(this);
	}

	Class404_Sub2(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class178_sub2_sub1, class158, Class170.aClass170_1822, false, i * i_0_ * i_1_);
		anInt10151 = i;
		anInt10152 = i_0_;
		anInt10153 = i_1_;
		aLong4173 = (IDirect3DDevice.CreateVolumeTexture(aClass178_Sub2_Sub1_4176.aLong11412, i, i_0_, i_1_, 1, 0, Class178_Sub2_Sub1.method17835(class158, aClass170_4177), 1));
		aClass178_Sub2_Sub1_4176.method15125(anInt10151 * anInt10152 * (class158.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(aLong4173, 0, 0, 0, 0, anInt10151, anInt10152, anInt10153, anInt10151 * (class158.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	long method6590() {
		return aLong4173;
	}

	long method6596() {
		return aLong4173;
	}

	long method6597() {
		return aLong4173;
	}
}
