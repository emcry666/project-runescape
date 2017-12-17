/* Class404_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.Class358;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class404_Sub3_Sub1 extends Class404_Sub3 implements Interface41 {
	public float method256() {
		return super.method227();
	}

	public Interface22 method279(int i) {
		return new Class403(this, i);
	}

	public void method223(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4173, 0);
		long l_4_ = IDirect3DDevice.CreateRenderTarget((aClass178_Sub2_Sub1_4176.aLong11412), i_1_, i_2_, 21, 0, 0, true);
		aClass178_Sub2_Sub1_4176.method15125(i_2_ * i_1_ * 4);
		if (Class358.method6281(IDirect3DDevice.StretchRect(aClass178_Sub2_Sub1_4176.aLong11412, l, i, i_0_, i_1_, i_2_, l_4_, 0, 0, i_1_, i_2_, 1))) {
			IDirect3DSurface.Download(l_4_, 0, 0, i_1_, i_2_, i_1_ * 4, 16, aClass178_Sub2_Sub1_4176.aLong9540);
			aClass178_Sub2_Sub1_4176.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_4176.aByteBuffer9539.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_4_);
	}

	public int method251() {
		return super.method82();
	}

	public float method255() {
		return super.method227();
	}

	public int method82() {
		return super.method82();
	}

	public float method261(float f) {
		return super.method261(f);
	}

	public float method218(float f) {
		return super.method218(f);
	}

	public boolean method217() {
		return super.method217();
	}

	public void method239(boolean bool, boolean bool_5_) {
		super.method239(bool, bool_5_);
	}

	public float method220() {
		return super.method220();
	}

	public void method222(int i, int i_6_, int i_7_, int i_8_, byte[] is, Class158 class158, int i_9_, int i_10_) {
		super.method222(i, i_6_, i_7_, i_8_, is, class158, i_9_, i_10_);
	}

	public void method235(int i, int i_11_, int i_12_, int i_13_, int[] is, int[] is_14_, int i_15_) {
		super.method235(i, i_11_, i_12_, i_13_, is, is_14_, i_15_);
	}

	public void method225(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		super.method225(i, i_16_, i_17_, i_18_, i_19_, i_20_);
	}

	public boolean method249() {
		return super.method249();
	}

	public void method233(int i, int i_21_, int i_22_, int i_23_, int[] is, int i_24_, int i_25_) {
		super.method221(i, i_21_, i_22_, i_23_, is, i_24_, i_25_);
	}

	Class404_Sub3_Sub1(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, Class170 class170, int i, int i_26_) {
		super(class178_sub2_sub1, class158, class170, i, i_26_, 1025, 0);
	}

	public void method297() {
		super.method297();
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	public float method227() {
		return super.method227();
	}

	public void method132() {
		super.method131();
	}

	public void method78() {
		super.method131();
	}

	public void method331() {
		super.method297();
	}

	public int method237() {
		return super.method1();
	}

	public float method231(float f) {
		return super.method261(f);
	}

	public float method219() {
		return super.method220();
	}

	public void method259(int i, int i_27_, int i_28_, int i_29_, int[] is, int[] is_30_, int i_31_) {
		super.method235(i, i_27_, i_28_, i_29_, is, is_30_, i_31_);
	}

	public boolean method234() {
		return super.method217();
	}

	public boolean method254() {
		return super.method217();
	}

	public void method236(boolean bool, boolean bool_32_) {
		super.method239(bool, bool_32_);
	}

	public void method240(int i, int i_33_, int i_34_, int i_35_, int[] is, int i_36_, int i_37_) {
		super.method221(i, i_33_, i_34_, i_35_, is, i_36_, i_37_);
	}

	public void method131() {
		super.method131();
	}

	public void method230(int i, int i_38_, int i_39_, int i_40_, int[] is, int i_41_, int i_42_) {
		super.method221(i, i_38_, i_39_, i_40_, is, i_41_, i_42_);
	}

	public int method1() {
		return super.method1();
	}

	public void method130() {
		super.method131();
	}

	public void method242(int i, int i_43_, int i_44_, int i_45_, byte[] is, Class158 class158, int i_46_, int i_47_) {
		super.method222(i, i_43_, i_44_, i_45_, is, class158, i_46_, i_47_);
	}

	public void method243(int i, int i_48_, int i_49_, int i_50_, byte[] is, Class158 class158, int i_51_, int i_52_) {
		super.method222(i, i_48_, i_49_, i_50_, is, class158, i_51_, i_52_);
	}

	public void method246(boolean bool, boolean bool_53_) {
		super.method239(bool, bool_53_);
	}

	public void method245(int i, int i_54_, int i_55_, int i_56_, int[] is, int i_57_) {
		long l = IDirect3DTexture.GetSurfaceLevel(aLong4173, 0);
		long l_58_ = IDirect3DDevice.CreateRenderTarget((aClass178_Sub2_Sub1_4176.aLong11412), i_55_, i_56_, 21, 0, 0, true);
		aClass178_Sub2_Sub1_4176.method15125(i_56_ * i_55_ * 4);
		if (Class358.method6281(IDirect3DDevice.StretchRect(aClass178_Sub2_Sub1_4176.aLong11412, l, i, i_54_, i_55_, i_56_, l_58_, 0, 0, i_55_, i_56_, 1))) {
			IDirect3DSurface.Download(l_58_, 0, 0, i_55_, i_56_, i_55_ * 4, 16, aClass178_Sub2_Sub1_4176.aLong9540);
			aClass178_Sub2_Sub1_4176.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_4176.aByteBuffer9539.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_58_);
	}

	public void method244(int i, int i_59_, int i_60_, int i_61_, byte[] is, Class158 class158, int i_62_, int i_63_) {
		super.method222(i, i_59_, i_60_, i_61_, is, class158, i_62_, i_63_);
	}

	public void method247(int i, int i_64_, int i_65_, int i_66_, int[] is, int[] is_67_, int i_68_) {
		super.method235(i, i_64_, i_65_, i_66_, is, is_67_, i_68_);
	}

	public void method248(int i, int i_69_, int i_70_, int i_71_, int[] is, int[] is_72_, int i_73_) {
		super.method235(i, i_69_, i_70_, i_71_, is, is_72_, i_73_);
	}

	public void method257(int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
		super.method225(i, i_74_, i_75_, i_76_, i_77_, i_78_);
	}

	public void method250(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
		super.method225(i, i_79_, i_80_, i_81_, i_82_, i_83_);
	}

	public void method224(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		super.method225(i, i_84_, i_85_, i_86_, i_87_, i_88_);
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	public void method263(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_) {
		super.method225(i, i_89_, i_90_, i_91_, i_92_, i_93_);
	}

	public float method229() {
		return super.method227();
	}

	public float method232(float f) {
		return super.method218(f);
	}

	public void method241(int i, int i_94_, int i_95_, int i_96_, byte[] is, Class158 class158, int i_97_, int i_98_) {
		super.method222(i, i_94_, i_95_, i_96_, is, class158, i_97_, i_98_);
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}

	public void method332() {
		super.method297();
	}

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	public void method253(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		super.method225(i, i_99_, i_100_, i_101_, i_102_, i_103_);
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	public int method252() {
		return super.method1();
	}

	public Interface22 method280(int i) {
		return new Class403(this, i);
	}

	public float method238() {
		return super.method220();
	}

	public void method221(int i, int i_104_, int i_105_, int i_106_, int[] is, int i_107_, int i_108_) {
		super.method221(i, i_104_, i_105_, i_106_, is, i_107_, i_108_);
	}

	public float method258() {
		return super.method220();
	}

	public float method228(float f) {
		return super.method218(f);
	}

	public boolean method260() {
		return super.method249();
	}

	public boolean method216() {
		return super.method249();
	}

	public boolean method262() {
		return super.method249();
	}

	public boolean method226() {
		return super.method249();
	}

	public boolean method264() {
		return super.method249();
	}
}
