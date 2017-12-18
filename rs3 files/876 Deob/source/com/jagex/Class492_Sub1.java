/* Class492_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class492_Sub1 extends Class492 implements Interface41 {
	int anInt10202;
	int anInt10203;
	float aFloat10204;
	float aFloat10205;

	public void method335(Class342 class342) {
		super.method330(class342);
	}

	Class492_Sub1(Class178_Sub2_Sub2 class178_sub2_sub2, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(class178_sub2_sub2, 3553, Class158.aClass158_1743, Class170.aClass170_1822, i * i_0_, bool);
		if (!aClass178_Sub2_Sub2_5541.aBool11512) {
			anInt10203 = Class628.method10313(i, -1943101595);
			anInt10202 = Class628.method10313(i_0_, -811438295);
			aFloat10204 = (float) i / (float) anInt10203;
			aFloat10205 = (float) i_0_ / (float) anInt10202;
			if (i != anInt10203 || i_0_ != anInt10202) {
				is = aClass178_Sub2_Sub2_5541.method3154(i, i_0_, anInt10203, anInt10202, is, i_1_, i_2_, -430340409);
				i_1_ = 0;
				i_2_ = anInt10203;
			}
		} else {
			anInt10203 = i;
			anInt10202 = i_0_;
			aFloat10204 = 1.0F;
			aFloat10205 = 1.0F;
		}
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (!bool || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(anInt5544, 0, 6408, anInt10203, anInt10202, 0, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is, i_1_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method8061(anInt5544, i, i_0_, is);
	}

	Class492_Sub1(Class178_Sub2_Sub2 class178_sub2_sub2, Class158 class158, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(class178_sub2_sub2, 3553, class158, Class170.aClass170_1822, i * i_3_, bool);
		if (!aClass178_Sub2_Sub2_5541.aBool11512) {
			anInt10203 = Class628.method10313(i, 753952313);
			anInt10202 = Class628.method10313(i_3_, 1381857348);
			aFloat10204 = (float) i / (float) anInt10203;
			aFloat10205 = (float) i_3_ / (float) anInt10202;
			if (i != anInt10203 || i_3_ != anInt10202) {
				is = aClass178_Sub2_Sub2_5541.method3156(i, i_3_, anInt10203, anInt10202, is, i_4_, i_5_, (class158.anInt1753 * -920065167), (byte) 10);
				i_4_ = 0;
				i_5_ = anInt10203;
			}
		} else {
			anInt10203 = i;
			anInt10202 = i_3_;
			aFloat10204 = 1.0F;
			aFloat10205 = 1.0F;
		}
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_5_ != 0 || i_4_ != 0) {
			OpenGL.glPixelStorei(3314, i_5_);
			if (aClass158_5545 == Class158.aClass158_1744)
				OpenGL.glCompressedTexImage2Dub(anInt5544, 0, 33777, i, i_3_, 0, i * i_3_ / 2, is, i_4_);
			else if (aClass158_5545 == Class158.aClass158_1751)
				OpenGL.glCompressedTexImage2Dub(anInt5544, 0, 33779, i, i_3_, 0, i * i_3_, is, i_4_);
			else
				OpenGL.glTexImage2Dub(anInt5544, 0, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i, i_3_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5121, is, i_4_);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method8076(anInt5544, i, i_3_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class492_Sub1(Class178_Sub2_Sub2 class178_sub2_sub2, Class158 class158, int i, int i_6_, boolean bool, float[] fs, int i_7_, int i_8_) {
		super(class178_sub2_sub2, 3553, class158, Class170.aClass170_1825, i * i_6_, bool);
		if (!aClass178_Sub2_Sub2_5541.aBool11512) {
			anInt10203 = Class628.method10313(i, -804235731);
			anInt10202 = Class628.method10313(i_6_, -216005192);
			aFloat10204 = (float) i / (float) anInt10203;
			aFloat10205 = (float) i_6_ / (float) anInt10202;
			if (i != anInt10203 || i_6_ != anInt10202) {
				fs = aClass178_Sub2_Sub2_5541.method3155(i, i_6_, anInt10203, anInt10202, fs, i_7_, i_8_, (class158.anInt1753 * -920065167), -1397072945);
				i_7_ = 0;
				i_8_ = anInt10203;
			}
		} else {
			anInt10203 = i;
			anInt10202 = i_6_;
			aFloat10204 = 1.0F;
			aFloat10205 = 1.0F;
		}
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (!bool || i_8_ != 0 || i_7_ != 0) {
			OpenGL.glPixelStorei(3314, i_8_);
			OpenGL.glTexImage2Df(anInt5544, 0, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i, i_6_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5126, fs, i_7_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method8062(anInt5544, i, i_6_, fs);
	}

	public float method229() {
		return aFloat10205;
	}

	public int method82() {
		return anInt10202;
	}

	public boolean method226() {
		return super.method249();
	}

	Class492_Sub1(Class178_Sub2_Sub2 class178_sub2_sub2, Class158 class158, Class170 class170, int i, int i_9_) {
		super(class178_sub2_sub2, 3553, class158, class170, i * i_9_, false);
		if (!aClass178_Sub2_Sub2_5541.aBool11512) {
			anInt10203 = Class628.method10313(i, -1100982326);
			anInt10202 = Class628.method10313(i_9_, 1165373133);
			aFloat10204 = (float) i / (float) anInt10203;
			aFloat10205 = (float) i_9_ / (float) anInt10202;
		} else {
			anInt10203 = i;
			anInt10202 = i_9_;
			aFloat10204 = 1.0F;
			aFloat10205 = 1.0F;
		}
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glTexImage2Dub(anInt5544, 0, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i, i_9_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), Class178_Sub2_Sub2.method17900(aClass170_5546), null, 0);
	}

	public float method220() {
		return aFloat10204;
	}

	public float method227() {
		return aFloat10205;
	}

	public boolean method217() {
		return true;
	}

	public void method239(boolean bool, boolean bool_10_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glTexParameteri(anInt5544, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5544, 10243, bool_10_ ? 10497 : 33071);
	}

	public void method221(int i, int i_11_, int i_12_, int i_13_, int[] is, int i_14_, int i_15_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3314, i_15_);
		OpenGL.glTexSubImage2Di(anInt5544, 0, i, i_11_, i_12_, i_13_, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is, i_14_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method222(int i, int i_16_, int i_17_, int i_18_, byte[] is, Class158 class158, int i_19_, int i_20_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_20_);
		OpenGL.glTexSubImage2Dub(anInt5544, 0, i, i_16_, i_17_, i_18_, Class178_Sub2_Sub2.method17901(class158), 5121, is, i_19_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method223(int i, int i_21_, int i_22_, int i_23_, int[] is, int i_24_) {
		method235(i, i_21_, i_22_, i_23_, is, null, i_24_);
	}

	public void method235(int i, int i_25_, int i_26_, int i_27_, int[] is, int[] is_28_, int i_29_) {
		int[] is_30_ = is_28_ == null ? new int[anInt10203 * anInt10202] : is_28_;
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glGetTexImagei(anInt5544, 0, 32993, 5121, is_30_, 0);
		for (int i_31_ = 0; i_31_ < i_27_; i_31_++)
			System.arraycopy(is_30_, i_31_ * anInt10203, is, i_29_ + i_31_ * i_26_, i_26_);
	}

	public void method225(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		Class168 class168 = aClass178_Sub2_Sub2_5541.method3039(1536367205);
		if (class168 != null) {
			int i_37_ = class168.method2874() - (i_36_ + i_34_);
			int i_38_ = Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546);
			OpenGL.glCopyTexImage2D(anInt5544, 0, i_38_, i_35_, i_37_, i_33_, i_34_, 0);
		}
	}

	public float method218(float f) {
		return f / (float) anInt10202;
	}

	public boolean method249() {
		return super.method249();
	}

	public void method78() {
		super.method131();
	}

	public void method330(Class342 class342) {
		super.method330(class342);
	}

	public void method131() {
		super.method131();
	}

	public void method241(int i, int i_39_, int i_40_, int i_41_, byte[] is, Class158 class158, int i_42_, int i_43_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_43_);
		OpenGL.glTexSubImage2Dub(anInt5544, 0, i, i_39_, i_40_, i_41_, Class178_Sub2_Sub2.method17901(class158), 5121, is, i_42_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public float method258() {
		return aFloat10204;
	}

	public void method130() {
		super.method131();
	}

	public int method252() {
		return anInt10203;
	}

	public int method237() {
		return anInt10203;
	}

	public float method231(float f) {
		return f / (float) anInt10203;
	}

	public void method334(Class342 class342) {
		super.method330(class342);
	}

	public float method228(float f) {
		return f / (float) anInt10202;
	}

	public boolean method234() {
		return true;
	}

	public boolean method254() {
		return true;
	}

	public void method236(boolean bool, boolean bool_44_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glTexParameteri(anInt5544, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5544, 10243, bool_44_ ? 10497 : 33071);
	}

	public void method246(boolean bool, boolean bool_45_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glTexParameteri(anInt5544, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(anInt5544, 10243, bool_45_ ? 10497 : 33071);
	}

	public void method233(int i, int i_46_, int i_47_, int i_48_, int[] is, int i_49_, int i_50_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3314, i_50_);
		OpenGL.glTexSubImage2Di(anInt5544, 0, i, i_46_, i_47_, i_48_, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is, i_49_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method230(int i, int i_51_, int i_52_, int i_53_, int[] is, int i_54_, int i_55_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3314, i_55_);
		OpenGL.glTexSubImage2Di(anInt5544, 0, i, i_51_, i_52_, i_53_, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is, i_54_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method240(int i, int i_56_, int i_57_, int i_58_, int[] is, int i_59_, int i_60_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3314, i_60_);
		OpenGL.glTexSubImage2Di(anInt5544, 0, i, i_56_, i_57_, i_58_, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is, i_59_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method256() {
		return aFloat10205;
	}

	public void method242(int i, int i_61_, int i_62_, int i_63_, byte[] is, Class158 class158, int i_64_, int i_65_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_65_);
		OpenGL.glTexSubImage2Dub(anInt5544, 0, i, i_61_, i_62_, i_63_, Class178_Sub2_Sub2.method17901(class158), 5121, is, i_64_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method251() {
		return anInt10202;
	}

	public Interface22 method279(int i) {
		return new Class475(this, i);
	}

	public void method245(int i, int i_66_, int i_67_, int i_68_, int[] is, int i_69_) {
		method235(i, i_66_, i_67_, i_68_, is, null, i_69_);
	}

	public void method259(int i, int i_70_, int i_71_, int i_72_, int[] is, int[] is_73_, int i_74_) {
		int[] is_75_ = is_73_ == null ? new int[anInt10203 * anInt10202] : is_73_;
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glGetTexImagei(anInt5544, 0, 32993, 5121, is_75_, 0);
		for (int i_76_ = 0; i_76_ < i_72_; i_76_++)
			System.arraycopy(is_75_, i_76_ * anInt10203, is, i_74_ + i_76_ * i_71_, i_71_);
	}

	public void method247(int i, int i_77_, int i_78_, int i_79_, int[] is, int[] is_80_, int i_81_) {
		int[] is_82_ = is_80_ == null ? new int[anInt10203 * anInt10202] : is_80_;
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glGetTexImagei(anInt5544, 0, 32993, 5121, is_82_, 0);
		for (int i_83_ = 0; i_83_ < i_79_; i_83_++)
			System.arraycopy(is_82_, i_83_ * anInt10203, is, i_81_ + i_83_ * i_78_, i_78_);
	}

	public void method248(int i, int i_84_, int i_85_, int i_86_, int[] is, int[] is_87_, int i_88_) {
		int[] is_89_ = is_87_ == null ? new int[anInt10203 * anInt10202] : is_87_;
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glGetTexImagei(anInt5544, 0, 32993, 5121, is_89_, 0);
		for (int i_90_ = 0; i_90_ < i_86_; i_90_++)
			System.arraycopy(is_89_, i_90_ * anInt10203, is, i_88_ + i_90_ * i_85_, i_85_);
	}

	public void method257(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		Class168 class168 = aClass178_Sub2_Sub2_5541.method3039(1810470120);
		if (class168 != null) {
			int i_96_ = class168.method2874() - (i_95_ + i_93_);
			int i_97_ = Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546);
			OpenGL.glCopyTexImage2D(anInt5544, 0, i_97_, i_94_, i_96_, i_92_, i_93_, 0);
		}
	}

	public void method250(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		Class168 class168 = aClass178_Sub2_Sub2_5541.method3039(2130381315);
		if (class168 != null) {
			int i_103_ = class168.method2874() - (i_102_ + i_100_);
			int i_104_ = Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546);
			OpenGL.glCopyTexImage2D(anInt5544, 0, i_104_, i_101_, i_103_, i_99_, i_100_, 0);
		}
	}

	public void method224(int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		Class168 class168 = aClass178_Sub2_Sub2_5541.method3039(1767728136);
		if (class168 != null) {
			int i_110_ = class168.method2874() - (i_109_ + i_107_);
			int i_111_ = Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546);
			OpenGL.glCopyTexImage2D(anInt5544, 0, i_111_, i_108_, i_110_, i_106_, i_107_, 0);
		}
	}

	public void method263(int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		Class168 class168 = aClass178_Sub2_Sub2_5541.method3039(1653182848);
		if (class168 != null) {
			int i_117_ = class168.method2874() - (i_116_ + i_114_);
			int i_118_ = Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546);
			OpenGL.glCopyTexImage2D(anInt5544, 0, i_118_, i_115_, i_117_, i_113_, i_114_, 0);
		}
	}

	public void method132() {
		super.method131();
	}

	public float method261(float f) {
		return f / (float) anInt10203;
	}

	public float method255() {
		return aFloat10205;
	}

	public void method297() {
		super.method297();
	}

	public void method331() {
		super.method297();
	}

	public void method332() {
		super.method297();
	}

	public boolean method216() {
		return super.method249();
	}

	public float method219() {
		return aFloat10204;
	}

	public void method244(int i, int i_119_, int i_120_, int i_121_, byte[] is, Class158 class158, int i_122_, int i_123_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_123_);
		OpenGL.glTexSubImage2Dub(anInt5544, 0, i, i_119_, i_120_, i_121_, Class178_Sub2_Sub2.method17901(class158), 5121, is, i_122_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method329(Class342 class342) {
		super.method330(class342);
	}

	public Interface22 method280(int i) {
		return new Class475(this, i);
	}

	public boolean method262() {
		return super.method249();
	}

	public int method1() {
		return anInt10203;
	}

	public void method243(int i, int i_124_, int i_125_, int i_126_, byte[] is, Class158 class158, int i_127_, int i_128_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_128_);
		OpenGL.glTexSubImage2Dub(anInt5544, 0, i, i_124_, i_125_, i_126_, Class178_Sub2_Sub2.method17901(class158), 5121, is, i_127_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public float method238() {
		return aFloat10204;
	}

	public boolean method260() {
		return super.method249();
	}

	public void method333(Class342 class342) {
		super.method330(class342);
	}

	public float method232(float f) {
		return f / (float) anInt10202;
	}

	public void method253(int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		aClass178_Sub2_Sub2_5541.method15001(this);
		Class168 class168 = aClass178_Sub2_Sub2_5541.method3039(1983974733);
		if (class168 != null) {
			int i_134_ = class168.method2874() - (i_133_ + i_131_);
			int i_135_ = Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546);
			OpenGL.glCopyTexImage2D(anInt5544, 0, i_135_, i_132_, i_134_, i_130_, i_131_, 0);
		}
	}

	public boolean method264() {
		return super.method249();
	}
}
