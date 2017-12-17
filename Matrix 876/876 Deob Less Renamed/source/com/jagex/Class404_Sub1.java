/* Class404_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class404_Sub1 extends Class404 implements Interface39 {
	int anInt10110;

	public void method78() {
		super.method131();
	}

	Class404_Sub1(Class178_Sub2_Sub1 class178_sub2_sub1, int i, boolean bool, int[][] is) {
		super(class178_sub2_sub1, Class158.aClass158_1743, Class170.aClass170_1822, bool && class178_sub2_sub1.aBool11433, i * i * 6);
		anInt10110 = i;
		if (aBool4175)
			aLong4173 = IDirect3DDevice.CreateCubeTexture((aClass178_Sub2_Sub1_4176.aLong11412), anInt10110, 0, 1024, 21, 1);
		else
			aLong4173 = IDirect3DDevice.CreateCubeTexture((aClass178_Sub2_Sub1_4176.aLong11412), anInt10110, 1, 0, 21, 1);
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		aClass178_Sub2_Sub1_4176.method15125(anInt10110 * anInt10110 * 4);
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(aLong4173, i_0_, 0, 0, 0, anInt10110, anInt10110, anInt10110 * 4, 0, aClass178_Sub2_Sub1_4176.aLong9540);
		}
	}

	public void method132() {
		super.method131();
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	public void method130() {
		super.method131();
	}

	public void method131() {
		super.method131();
	}

	public void method297() {
		aClass178_Sub2_Sub1_4176.method17825(this);
	}

	public void method331() {
		aClass178_Sub2_Sub1_4176.method17825(this);
	}

	public void method332() {
		aClass178_Sub2_Sub1_4176.method17825(this);
	}

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}
}
