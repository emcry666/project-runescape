/* Class404_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class404_Sub3 extends Class404 implements Interface37 {
	int anInt10177;
	int anInt10178;
	float aFloat10179;
	boolean aBool10180;
	boolean aBool10181;
	float aFloat10182;

	public void method240(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_4_ == 0)
			i_4_ = i_1_;
		aClass178_Sub2_Sub1_4176.method15125(i_4_ * i_2_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_3_, i_4_ * i_2_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_0_, i_1_, i_2_, i_4_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	Class404_Sub3(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, Class170 class170, int i, int i_5_, int i_6_, int i_7_) {
		super(class178_sub2_sub1, class158, class170, false, i * i_5_);
		if (!aClass178_Sub2_Sub1_4176.aBool11431) {
			anInt10177 = Class628.method10313(i, 743943132);
			anInt10178 = Class628.method10313(i_5_, -1683042280);
			aFloat10179 = (float) i / (float) anInt10177;
			aFloat10182 = (float) i_5_ / (float) anInt10178;
		} else {
			anInt10177 = i;
			anInt10178 = i_5_;
			aFloat10179 = 1.0F;
			aFloat10182 = 1.0F;
		}
		aLong4173 = (IDirect3DDevice.CreateTexture(aClass178_Sub2_Sub1_4176.aLong11412, anInt10177, anInt10178, 0, i_6_, Class178_Sub2_Sub1.method17835(aClass158_4174, aClass170_4177), i_7_));
	}

	public void method239(boolean bool, boolean bool_8_) {
		aBool10181 = bool;
		aBool10180 = bool_8_;
	}

	Class404_Sub3(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, int i, int i_9_, boolean bool, byte[] is, int i_10_, int i_11_) {
		super(class178_sub2_sub1, class158, Class170.aClass170_1822, bool && class178_sub2_sub1.aBool11446, i * i_9_);
		if (!aClass178_Sub2_Sub1_4176.aBool11431) {
			anInt10177 = Class628.method10313(i, 824933581);
			anInt10178 = Class628.method10313(i_9_, -899744674);
			aFloat10179 = (float) i / (float) anInt10177;
			aFloat10182 = (float) i_9_ / (float) anInt10178;
			if (i != anInt10177 || i_9_ != anInt10178) {
				is = aClass178_Sub2_Sub1_4176.method3156(i, i_9_, anInt10177, anInt10178, is, i_10_, i_11_, (class158.anInt1753 * -920065167), (byte) 10);
				i_10_ = 0;
				i_11_ = anInt10177;
			}
		} else {
			anInt10177 = i;
			anInt10178 = i_9_;
			aFloat10179 = 1.0F;
			aFloat10182 = 1.0F;
		}
		if (bool)
			aLong4173 = (IDirect3DDevice.CreateTexture(aClass178_Sub2_Sub1_4176.aLong11412, anInt10177, anInt10178, 0, 1024, Class178_Sub2_Sub1.method17835(aClass158_4174, Class170.aClass170_1822), 1));
		else
			aLong4173 = (IDirect3DDevice.CreateTexture(aClass178_Sub2_Sub1_4176.aLong11412, anInt10177, anInt10178, 1, 0, Class178_Sub2_Sub1.method17835(aClass158_4174, Class170.aClass170_1822), 1));
		if (i_11_ == 0)
			i_11_ = anInt10177;
		aClass178_Sub2_Sub1_4176.method15125(i_11_ * anInt10178 * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		if (aClass158_4174 == Class158.aClass158_1744) {
			bytebuffer.put(is, i_10_, anInt10178 * anInt10177 / 2);
			IDirect3DTexture.Upload(aLong4173, 0, 0, 0, anInt10177, anInt10178 / 4, anInt10177 / 4 * 8, 0, aClass178_Sub2_Sub1_4176.aLong9540);
		} else if (aClass158_4174 == Class158.aClass158_1751) {
			bytebuffer.put(is, i_10_, anInt10178 * anInt10177);
			IDirect3DTexture.Upload(aLong4173, 0, 0, 0, anInt10177, anInt10178 / 4, anInt10177 / 4 * 16, 0, aClass178_Sub2_Sub1_4176.aLong9540);
		} else {
			bytebuffer.put(is, i_10_, i_11_ * anInt10178);
			IDirect3DTexture.Upload(aLong4173, 0, 0, 0, anInt10177, anInt10178, i_11_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
		}
	}

	public boolean method260() {
		return false;
	}

	public int method1() {
		return anInt10177;
	}

	Class404_Sub3(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, Class170 class170, int i, int i_12_) {
		this(class178_sub2_sub1, class158, class170, i, i_12_, 0, 1);
	}

	public boolean method226() {
		return false;
	}

	public float method218(float f) {
		return f / (float) anInt10178;
	}

	public void method233(int i, int i_13_, int i_14_, int i_15_, int[] is, int i_16_, int i_17_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_17_ == 0)
			i_17_ = i_14_;
		aClass178_Sub2_Sub1_4176.method15125(i_17_ * i_15_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_16_, i_17_ * i_15_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_13_, i_14_, i_15_, i_17_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public float method256() {
		return aFloat10182;
	}

	public boolean method217() {
		return true;
	}

	long method6602() {
		return aLong4173;
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	long method6596() {
		return aLong4173;
	}

	public void method221(int i, int i_18_, int i_19_, int i_20_, int[] is, int i_21_, int i_22_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_22_ == 0)
			i_22_ = i_19_;
		aClass178_Sub2_Sub1_4176.method15125(i_22_ * i_20_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_21_, i_22_ * i_20_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_18_, i_19_, i_20_, i_22_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public float method227() {
		return aFloat10182;
	}

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	public void method235(int i, int i_23_, int i_24_, int i_25_, int[] is, int[] is_26_, int i_27_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		method235(i, i_23_, i_24_, i_25_, is, null, i_27_);
	}

	public void method225(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		int[] is = aClass178_Sub2_Sub1_4176.method3293(i_31_, i_32_, i_29_, i_30_);
		if (is != null) {
			for (int i_33_ = 0; i_33_ < is.length; i_33_++)
				is[i_33_] |= ~0xffffff;
			method221(i, i_28_, i_29_, i_30_, is, 0, i_29_);
		}
	}

	public void method297() {
		aClass178_Sub2_Sub1_4176.method17826(this);
	}

	public boolean method249() {
		return false;
	}

	public void method131() {
		super.method131();
	}

	public void method130() {
		super.method131();
	}

	public void method132() {
		super.method131();
	}

	public void method78() {
		super.method131();
	}

	public int method252() {
		return anInt10177;
	}

	public int method237() {
		return anInt10177;
	}

	public float method231(float f) {
		return f / (float) anInt10177;
	}

	public float method232(float f) {
		return f / (float) anInt10178;
	}

	public float method220() {
		return aFloat10179;
	}

	public boolean method234() {
		return true;
	}

	public boolean method254() {
		return true;
	}

	Class404_Sub3(Class178_Sub2_Sub1 class178_sub2_sub1, int i, int i_34_, boolean bool, int[] is, int i_35_, int i_36_) {
		super(class178_sub2_sub1, Class158.aClass158_1743, Class170.aClass170_1822, bool && class178_sub2_sub1.aBool11446, i * i_34_);
		if (!aClass178_Sub2_Sub1_4176.aBool11431) {
			anInt10177 = Class628.method10313(i, 631136794);
			anInt10178 = Class628.method10313(i_34_, -1626254246);
			aFloat10179 = (float) i / (float) anInt10177;
			aFloat10182 = (float) i_34_ / (float) anInt10178;
			if (i != anInt10177 || i_34_ != anInt10178) {
				is = aClass178_Sub2_Sub1_4176.method3154(i, i_34_, anInt10177, anInt10178, is, i_35_, i_36_, 972625667);
				i_35_ = 0;
				i_36_ = anInt10177;
			}
		} else {
			anInt10177 = i;
			anInt10178 = i_34_;
			aFloat10179 = 1.0F;
			aFloat10182 = 1.0F;
		}
		if (bool)
			aLong4173 = IDirect3DDevice.CreateTexture((aClass178_Sub2_Sub1_4176.aLong11412), anInt10177, anInt10178, 0, 1024, 21, 1);
		else
			aLong4173 = IDirect3DDevice.CreateTexture((aClass178_Sub2_Sub1_4176.aLong11412), anInt10177, anInt10178, 1, 0, 21, 1);
		if (i_36_ == 0)
			i_36_ = anInt10177;
		aClass178_Sub2_Sub1_4176.method15125(i_36_ * anInt10178 * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_35_, i_36_ * anInt10178);
		IDirect3DTexture.Upload(aLong4173, 0, 0, 0, anInt10177, anInt10178, i_36_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method246(boolean bool, boolean bool_37_) {
		aBool10181 = bool;
		aBool10180 = bool_37_;
	}

	Class404_Sub3(Class178_Sub2_Sub1 class178_sub2_sub1, Class158 class158, int i, int i_38_, boolean bool, float[] fs, int i_39_, int i_40_) {
		super(class178_sub2_sub1, class158, Class170.aClass170_1822, bool && class178_sub2_sub1.aBool11446, i * i_38_);
		if (!aClass178_Sub2_Sub1_4176.aBool11431) {
			anInt10177 = Class628.method10313(i, -1557256743);
			anInt10178 = Class628.method10313(i_38_, 858315286);
			aFloat10179 = (float) i / (float) anInt10177;
			aFloat10182 = (float) i_38_ / (float) anInt10178;
			if (i != anInt10177 || i_38_ != anInt10178) {
				fs = aClass178_Sub2_Sub1_4176.method3155(i, i_38_, anInt10177, anInt10178, fs, i_39_, i_40_, (class158.anInt1753 * -920065167), -2143242354);
				i_39_ = 0;
				i_40_ = anInt10177;
			}
		} else {
			anInt10177 = i;
			anInt10178 = i_38_;
			aFloat10179 = 1.0F;
			aFloat10182 = 1.0F;
		}
		if (bool)
			aLong4173 = (IDirect3DDevice.CreateTexture(aClass178_Sub2_Sub1_4176.aLong11412, anInt10177, anInt10178, 0, 1024, Class178_Sub2_Sub1.method17835(aClass158_4174, Class170.aClass170_1825), 1));
		else
			aLong4173 = (IDirect3DDevice.CreateTexture(aClass178_Sub2_Sub1_4176.aLong11412, anInt10177, anInt10178, 1, 0, Class178_Sub2_Sub1.method17835(aClass158_4174, Class170.aClass170_1825), 1));
		if (i_40_ == 0)
			i_40_ = anInt10177;
		aClass178_Sub2_Sub1_4176.method15125(i_40_ * anInt10178 * (aClass158_4174.anInt1753 * -920065167) * 4);
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_39_, (i_40_ * anInt10178 * (aClass158_4174.anInt1753 * -920065167)));
		IDirect3DTexture.Upload(aLong4173, 0, 0, 0, anInt10177, anInt10178, i_40_ * (aClass158_4174.anInt1753 * -920065167) * 4, 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method230(int i, int i_41_, int i_42_, int i_43_, int[] is, int i_44_, int i_45_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_45_ == 0)
			i_45_ = i_42_;
		aClass178_Sub2_Sub1_4176.method15125(i_45_ * i_43_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_44_, i_45_ * i_43_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_41_, i_42_, i_43_, i_45_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method243(int i, int i_46_, int i_47_, int i_48_, byte[] is, Class158 class158, int i_49_, int i_50_) {
		if (aClass158_4174 != class158 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_50_ == 0)
			i_50_ = i_47_;
		aClass178_Sub2_Sub1_4176.method15125(i_50_ * i_48_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.put(is, i_49_, i_50_ * i_48_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_46_, i_47_, i_48_, i_50_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	public void method242(int i, int i_51_, int i_52_, int i_53_, byte[] is, Class158 class158, int i_54_, int i_55_) {
		if (aClass158_4174 != class158 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_55_ == 0)
			i_55_ = i_52_;
		aClass178_Sub2_Sub1_4176.method15125(i_55_ * i_53_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.put(is, i_54_, i_55_ * i_53_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_51_, i_52_, i_53_, i_55_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method241(int i, int i_56_, int i_57_, int i_58_, byte[] is, Class158 class158, int i_59_, int i_60_) {
		if (aClass158_4174 != class158 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_60_ == 0)
			i_60_ = i_57_;
		aClass178_Sub2_Sub1_4176.method15125(i_60_ * i_58_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.put(is, i_59_, i_60_ * i_58_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_56_, i_57_, i_58_, i_60_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method244(int i, int i_61_, int i_62_, int i_63_, byte[] is, Class158 class158, int i_64_, int i_65_) {
		if (aClass158_4174 != class158 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_65_ == 0)
			i_65_ = i_62_;
		aClass178_Sub2_Sub1_4176.method15125(i_65_ * i_63_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.put(is, i_64_, i_65_ * i_63_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_61_, i_62_, i_63_, i_65_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method245(int i, int i_66_, int i_67_, int i_68_, int[] is, int i_69_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		aClass178_Sub2_Sub1_4176.method15125(i_67_ * i_68_ * 4);
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4173, 0, i, i_66_, i_67_, i_68_, i_67_ * 4, 0, aClass178_Sub2_Sub1_4176.aLong9540);
		bytebuffer.asIntBuffer().get(is, i_69_, i_67_ * i_68_);
	}

	public void method259(int i, int i_70_, int i_71_, int i_72_, int[] is, int[] is_73_, int i_74_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		method235(i, i_70_, i_71_, i_72_, is, null, i_74_);
	}

	public void method247(int i, int i_75_, int i_76_, int i_77_, int[] is, int[] is_78_, int i_79_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		method235(i, i_75_, i_76_, i_77_, is, null, i_79_);
	}

	public void method248(int i, int i_80_, int i_81_, int i_82_, int[] is, int[] is_83_, int i_84_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		method235(i, i_80_, i_81_, i_82_, is, null, i_84_);
	}

	public void method236(boolean bool, boolean bool_85_) {
		aBool10181 = bool;
		aBool10180 = bool_85_;
	}

	public void method250(int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		int[] is = aClass178_Sub2_Sub1_4176.method3293(i_89_, i_90_, i_87_, i_88_);
		if (is != null) {
			for (int i_91_ = 0; i_91_ < is.length; i_91_++)
				is[i_91_] |= ~0xffffff;
			method221(i, i_86_, i_87_, i_88_, is, 0, i_87_);
		}
	}

	public void method224(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_) {
		int[] is = aClass178_Sub2_Sub1_4176.method3293(i_95_, i_96_, i_93_, i_94_);
		if (is != null) {
			for (int i_97_ = 0; i_97_ < is.length; i_97_++)
				is[i_97_] |= ~0xffffff;
			method221(i, i_92_, i_93_, i_94_, is, 0, i_93_);
		}
	}

	public void method257(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_) {
		int[] is = aClass178_Sub2_Sub1_4176.method3293(i_101_, i_102_, i_99_, i_100_);
		if (is != null) {
			for (int i_103_ = 0; i_103_ < is.length; i_103_++)
				is[i_103_] |= ~0xffffff;
			method221(i, i_98_, i_99_, i_100_, is, 0, i_99_);
		}
	}

	public void method253(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_) {
		int[] is = aClass178_Sub2_Sub1_4176.method3293(i_107_, i_108_, i_105_, i_106_);
		if (is != null) {
			for (int i_109_ = 0; i_109_ < is.length; i_109_++)
				is[i_109_] |= ~0xffffff;
			method221(i, i_104_, i_105_, i_106_, is, 0, i_105_);
		}
	}

	public float method229() {
		return aFloat10182;
	}

	public float method255() {
		return aFloat10182;
	}

	long method6597() {
		return aLong4173;
	}

	public void method331() {
		aClass178_Sub2_Sub1_4176.method17826(this);
	}

	public void method332() {
		aClass178_Sub2_Sub1_4176.method17826(this);
	}

	public void method222(int i, int i_110_, int i_111_, int i_112_, byte[] is, Class158 class158, int i_113_, int i_114_) {
		if (aClass158_4174 != class158 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		if (i_114_ == 0)
			i_114_ = i_111_;
		aClass178_Sub2_Sub1_4176.method15125(i_114_ * i_112_ * (aClass158_4174.anInt1753 * -920065167));
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		bytebuffer.put(is, i_113_, i_114_ * i_112_);
		IDirect3DTexture.Upload(aLong4173, 0, i, i_110_, i_111_, i_112_, i_114_ * (aClass158_4174.anInt1753 * -920065167), 0, aClass178_Sub2_Sub1_4176.aLong9540);
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	public float method261(float f) {
		return f / (float) anInt10177;
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}

	public void method263(int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_) {
		int[] is = aClass178_Sub2_Sub1_4176.method3293(i_118_, i_119_, i_116_, i_117_);
		if (is != null) {
			for (int i_120_ = 0; i_120_ < is.length; i_120_++)
				is[i_120_] |= ~0xffffff;
			method221(i, i_115_, i_116_, i_117_, is, 0, i_116_);
		}
	}

	long method6595() {
		return aLong4173;
	}

	public float method238() {
		return aFloat10179;
	}

	public void method223(int i, int i_121_, int i_122_, int i_123_, int[] is, int i_124_) {
		if (aClass158_4174 != Class158.aClass158_1743 || aClass170_4177 != Class170.aClass170_1822)
			throw new RuntimeException();
		aClass178_Sub2_Sub1_4176.method15125(i_122_ * i_123_ * 4);
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_4176.aByteBuffer9539;
		bytebuffer.clear();
		IDirect3DTexture.Download(aLong4173, 0, i, i_121_, i_122_, i_123_, i_122_ * 4, 0, aClass178_Sub2_Sub1_4176.aLong9540);
		bytebuffer.asIntBuffer().get(is, i_124_, i_122_ * i_123_);
	}

	public int method82() {
		return anInt10178;
	}

	public int method251() {
		return anInt10178;
	}

	public float method219() {
		return aFloat10179;
	}

	public float method258() {
		return aFloat10179;
	}

	public float method228(float f) {
		return f / (float) anInt10178;
	}

	long method6594() {
		return aLong4173;
	}

	public boolean method216() {
		return false;
	}

	public boolean method262() {
		return false;
	}

	long method6590() {
		return aLong4173;
	}

	public boolean method264() {
		return false;
	}
}
