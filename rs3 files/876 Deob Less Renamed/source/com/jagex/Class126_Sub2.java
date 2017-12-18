/* Class126_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class126_Sub2 extends Class126 {
	int anInt8892;
	int anInt8893;

	void method14360(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_, boolean bool) {
		if (i_4_ == 0)
			i_4_ = i_1_;
		if (bool) {
			int[] is_5_ = new int[i_1_ * i_2_];
			for (int i_6_ = 0; i_6_ < i_2_; i_6_++) {
				int i_7_ = i_6_ * i_1_;
				int i_8_ = (i_2_ - i_6_ - 1) * i_4_ + i_3_;
				for (int i_9_ = 0; i_9_ < i_1_; i_9_++)
					is_5_[i_7_++] = is[i_8_++];
			}
			is = is_5_;
		}
		aClass178_Sub1_1536.method14711(this);
		if (i_1_ != i_4_)
			OpenGL.glPixelStorei(3314, i_4_);
		OpenGL.glTexSubImage2Di(anInt1538, 0, i, anInt8893 - i_0_ - i_2_, i_1_, i_2_, 32993, aClass178_Sub1_1536.anInt9418, is, i_3_);
		if (i_1_ != i_4_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14361(int i, int i_10_, int i_11_, int i_12_, int[] is, int[] is_13_, int i_14_) {
		int[] is_15_ = is_13_ == null ? new int[anInt8892 * anInt8893] : is_13_;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glGetTexImagei(anInt1538, 0, 32993, 5121, is_15_, 0);
		for (int i_16_ = 0; i_16_ < i_12_; i_16_++)
			System.arraycopy(is_15_, (i_10_ + (i_12_ - 1) - i_16_) * anInt8892, is, i_14_ + i_16_ * i_11_, i_11_);
	}

	Class126_Sub2(Class178_Sub1 class178_sub1, int i, int i_17_, int i_18_, boolean bool, int[] is, int i_19_, int i_20_, boolean bool_21_) {
		super(class178_sub1, i, Class158.aClass158_1743, Class170.aClass170_1822, i_17_ * i_18_, bool);
		anInt8892 = i_17_;
		anInt8893 = i_18_;
		if (bool_21_) {
			int[] is_22_ = new int[is.length];
			for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
				int i_24_ = i_23_ * i_17_;
				int i_25_ = (i_18_ - i_23_ - 1) * i_17_;
				for (int i_26_ = 0; i_26_ < i_17_; i_26_++)
					is_22_[i_24_++] = is[i_25_++];
			}
			is = is_22_;
		}
		aClass178_Sub1_1536.method14711(this);
		if (anInt1538 == 34037 || !bool || i_19_ != 0 || i_20_ != 0) {
			OpenGL.glPixelStorei(3314, i_19_);
			OpenGL.glTexImage2Di(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8892, anInt8893, 0, 32993, aClass178_Sub1_1536.anInt9418, is, i_20_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method2112(false);
		} else {
			method2125(anInt1538, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8892, anInt8893, 32993, aClass178_Sub1_1536.anInt9418, is);
			method2112(true);
		}
		method2110(true);
	}

	Class126_Sub2(Class178_Sub1 class178_sub1, int i, Class158 class158, Class170 class170, int i_27_, int i_28_, boolean bool, byte[] is, Class158 class158_29_, boolean bool_30_) {
		super(class178_sub1, i, class158, class170, i_27_ * i_28_, bool);
		anInt8892 = i_27_;
		anInt8893 = i_28_;
		if (bool_30_) {
			byte[] is_31_ = new byte[is.length];
			for (int i_32_ = 0; i_32_ < i_28_; i_32_++) {
				int i_33_ = i_32_ * i_27_;
				int i_34_ = (i_28_ - i_32_ - 1) * i_27_;
				for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
					is_31_[i_33_++] = is[i_34_++];
			}
			is = is_31_;
		}
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && anInt1538 != 34037) {
			method2119(i, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i_27_, i_28_, class158_29_, is);
			method2112(true);
		} else {
			OpenGL.glTexImage2Dub(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8892, anInt8893, 0, Class178_Sub1.method14698(class158_29_), 5121, is, 0);
			method2112(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method2110(true);
	}

	Interface23 method14362(int i) {
		return new Class157(this, i);
	}

	void method14363(boolean bool, boolean bool_36_) {
		if (anInt1538 == 3553) {
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glTexParameteri(anInt1538, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1538, 10243, bool_36_ ? 10497 : 33071);
		}
	}

	void method14364(int i, int i_37_, int i_38_, int i_39_, byte[] is, Class158 class158, int i_40_, int i_41_, boolean bool) {
		if (i_41_ == 0)
			i_41_ = i_38_;
		if (bool) {
			int i_42_ = class158.anInt1753 * -920065167;
			int i_43_ = i_42_ * i_38_;
			int i_44_ = i_42_ * i_41_;
			byte[] is_45_ = new byte[i_43_ * i_39_];
			for (int i_46_ = 0; i_46_ < i_39_; i_46_++) {
				int i_47_ = i_46_ * i_43_;
				int i_48_ = (i_39_ - i_46_ - 1) * i_44_ + i_40_;
				for (int i_49_ = 0; i_49_ < i_43_; i_49_++)
					is_45_[i_47_++] = is[i_48_++];
			}
			is = is_45_;
		}
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_41_ != i_38_)
			OpenGL.glPixelStorei(3314, i_41_);
		OpenGL.glTexSubImage2Dub(anInt1538, 0, i, anInt8893 - i_37_ - i_39_, i_38_, i_39_, Class178_Sub1.method14698(class158), 5121, is, i_40_);
		if (i_41_ != i_38_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method14365(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		Class168 class168 = aClass178_Sub1_1536.method3039(2097272631);
		if (class168 != null) {
			int i_55_ = class168.method2874() - (i_54_ + i_52_);
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glCopyTexSubImage2D(anInt1538, 0, i, anInt8893 - (i_50_ + i_52_), i_53_, i_55_, i_51_, i_52_);
			OpenGL.glFlush();
		}
	}

	void method14366(int i, int i_56_, int i_57_, int i_58_, int[] is, int[] is_59_, int i_60_) {
		int[] is_61_ = is_59_ == null ? new int[anInt8892 * anInt8893] : is_59_;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glGetTexImagei(anInt1538, 0, 32993, 5121, is_61_, 0);
		for (int i_62_ = 0; i_62_ < i_58_; i_62_++)
			System.arraycopy(is_61_, (i_56_ + (i_58_ - 1) - i_62_) * anInt8892, is, i_60_ + i_62_ * i_57_, i_57_);
	}

	void method14367(int i, int i_63_, int i_64_, int i_65_, int[] is, int i_66_, int i_67_, boolean bool) {
		if (i_67_ == 0)
			i_67_ = i_64_;
		if (bool) {
			int[] is_68_ = new int[i_64_ * i_65_];
			for (int i_69_ = 0; i_69_ < i_65_; i_69_++) {
				int i_70_ = i_69_ * i_64_;
				int i_71_ = (i_65_ - i_69_ - 1) * i_67_ + i_66_;
				for (int i_72_ = 0; i_72_ < i_64_; i_72_++)
					is_68_[i_70_++] = is[i_71_++];
			}
			is = is_68_;
		}
		aClass178_Sub1_1536.method14711(this);
		if (i_64_ != i_67_)
			OpenGL.glPixelStorei(3314, i_67_);
		OpenGL.glTexSubImage2Di(anInt1538, 0, i, anInt8893 - i_63_ - i_65_, i_64_, i_65_, 32993, aClass178_Sub1_1536.anInt9418, is, i_66_);
		if (i_64_ != i_67_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14368(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		Class168 class168 = aClass178_Sub1_1536.method3039(1579760111);
		if (class168 != null) {
			int i_78_ = class168.method2874() - (i_77_ + i_75_);
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glCopyTexSubImage2D(anInt1538, 0, i, anInt8893 - (i_73_ + i_75_), i_76_, i_78_, i_74_, i_75_);
			OpenGL.glFlush();
		}
	}

	void method14369(int i, int i_79_, int i_80_, int i_81_, byte[] is, Class158 class158, int i_82_, int i_83_, boolean bool) {
		if (i_83_ == 0)
			i_83_ = i_80_;
		if (bool) {
			int i_84_ = class158.anInt1753 * -920065167;
			int i_85_ = i_84_ * i_80_;
			int i_86_ = i_84_ * i_83_;
			byte[] is_87_ = new byte[i_85_ * i_81_];
			for (int i_88_ = 0; i_88_ < i_81_; i_88_++) {
				int i_89_ = i_88_ * i_85_;
				int i_90_ = (i_81_ - i_88_ - 1) * i_86_ + i_82_;
				for (int i_91_ = 0; i_91_ < i_85_; i_91_++)
					is_87_[i_89_++] = is[i_90_++];
			}
			is = is_87_;
		}
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_83_ != i_80_)
			OpenGL.glPixelStorei(3314, i_83_);
		OpenGL.glTexSubImage2Dub(anInt1538, 0, i, anInt8893 - i_79_ - i_81_, i_80_, i_81_, Class178_Sub1.method14698(class158), 5121, is, i_82_);
		if (i_83_ != i_80_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method14370(int i, int i_92_, int i_93_, int i_94_, int[] is, int i_95_, int i_96_, boolean bool) {
		if (i_96_ == 0)
			i_96_ = i_93_;
		if (bool) {
			int[] is_97_ = new int[i_93_ * i_94_];
			for (int i_98_ = 0; i_98_ < i_94_; i_98_++) {
				int i_99_ = i_98_ * i_93_;
				int i_100_ = (i_94_ - i_98_ - 1) * i_96_ + i_95_;
				for (int i_101_ = 0; i_101_ < i_93_; i_101_++)
					is_97_[i_99_++] = is[i_100_++];
			}
			is = is_97_;
		}
		aClass178_Sub1_1536.method14711(this);
		if (i_93_ != i_96_)
			OpenGL.glPixelStorei(3314, i_96_);
		OpenGL.glTexSubImage2Di(anInt1538, 0, i, anInt8893 - i_92_ - i_94_, i_93_, i_94_, 32993, aClass178_Sub1_1536.anInt9418, is, i_95_);
		if (i_93_ != i_96_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14371(boolean bool, boolean bool_102_) {
		if (anInt1538 == 3553) {
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glTexParameteri(anInt1538, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1538, 10243, bool_102_ ? 10497 : 33071);
		}
	}

	Class126_Sub2(Class178_Sub1 class178_sub1, int i, Class158 class158, Class170 class170, int i_103_, int i_104_) {
		super(class178_sub1, i, class158, class170, i_103_ * i_104_, false);
		anInt8892 = i_103_;
		anInt8893 = i_104_;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glTexImage2Dub(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i_103_, i_104_, 0, Class178_Sub1.method14698(aClass158_1543), 5121, null, 0);
		method2110(true);
	}

	void method14372(int i, int i_105_, int i_106_, int i_107_, byte[] is, Class158 class158, int i_108_, int i_109_, boolean bool) {
		if (i_109_ == 0)
			i_109_ = i_106_;
		if (bool) {
			int i_110_ = class158.anInt1753 * -920065167;
			int i_111_ = i_110_ * i_106_;
			int i_112_ = i_110_ * i_109_;
			byte[] is_113_ = new byte[i_111_ * i_107_];
			for (int i_114_ = 0; i_114_ < i_107_; i_114_++) {
				int i_115_ = i_114_ * i_111_;
				int i_116_ = (i_107_ - i_114_ - 1) * i_112_ + i_108_;
				for (int i_117_ = 0; i_117_ < i_111_; i_117_++)
					is_113_[i_115_++] = is[i_116_++];
			}
			is = is_113_;
		}
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_109_ != i_106_)
			OpenGL.glPixelStorei(3314, i_109_);
		OpenGL.glTexSubImage2Dub(anInt1538, 0, i, anInt8893 - i_105_ - i_107_, i_106_, i_107_, Class178_Sub1.method14698(class158), 5121, is, i_108_);
		if (i_109_ != i_106_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method14373(int i, int i_118_, int i_119_, int i_120_, byte[] is, Class158 class158, int i_121_, int i_122_, boolean bool) {
		if (i_122_ == 0)
			i_122_ = i_119_;
		if (bool) {
			int i_123_ = class158.anInt1753 * -920065167;
			int i_124_ = i_123_ * i_119_;
			int i_125_ = i_123_ * i_122_;
			byte[] is_126_ = new byte[i_124_ * i_120_];
			for (int i_127_ = 0; i_127_ < i_120_; i_127_++) {
				int i_128_ = i_127_ * i_124_;
				int i_129_ = (i_120_ - i_127_ - 1) * i_125_ + i_121_;
				for (int i_130_ = 0; i_130_ < i_124_; i_130_++)
					is_126_[i_128_++] = is[i_129_++];
			}
			is = is_126_;
		}
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_122_ != i_119_)
			OpenGL.glPixelStorei(3314, i_122_);
		OpenGL.glTexSubImage2Dub(anInt1538, 0, i, anInt8893 - i_118_ - i_120_, i_119_, i_120_, Class178_Sub1.method14698(class158), 5121, is, i_121_);
		if (i_122_ != i_119_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class126_Sub2(Class178_Sub1 class178_sub1, int i, Class158 class158, Class170 class170, int i_131_, int i_132_, boolean bool, float[] fs, Class158 class158_133_) {
		super(class178_sub1, i, class158, class170, i_131_ * i_132_, bool);
		anInt8892 = i_131_;
		anInt8893 = i_132_;
		aClass178_Sub1_1536.method14711(this);
		if (bool && anInt1538 != 34037) {
			method2137(i, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), i_131_, i_132_, class158_133_, fs);
			method2112(true);
		} else {
			OpenGL.glTexImage2Df(anInt1538, 0, Class178_Sub1.method14718(aClass158_1543, aClass170_1539), anInt8892, anInt8893, 0, Class178_Sub1.method14698(class158_133_), 5126, fs, 0);
			method2112(false);
		}
		method2110(true);
	}

	void method14374(int i, int i_134_, int i_135_, int i_136_, int[] is, int i_137_, int i_138_, boolean bool) {
		if (i_138_ == 0)
			i_138_ = i_135_;
		if (bool) {
			int[] is_139_ = new int[i_135_ * i_136_];
			for (int i_140_ = 0; i_140_ < i_136_; i_140_++) {
				int i_141_ = i_140_ * i_135_;
				int i_142_ = (i_136_ - i_140_ - 1) * i_138_ + i_137_;
				for (int i_143_ = 0; i_143_ < i_135_; i_143_++)
					is_139_[i_141_++] = is[i_142_++];
			}
			is = is_139_;
		}
		aClass178_Sub1_1536.method14711(this);
		if (i_135_ != i_138_)
			OpenGL.glPixelStorei(3314, i_138_);
		OpenGL.glTexSubImage2Di(anInt1538, 0, i, anInt8893 - i_134_ - i_136_, i_135_, i_136_, 32993, aClass178_Sub1_1536.anInt9418, is, i_137_);
		if (i_135_ != i_138_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14375(boolean bool, boolean bool_144_) {
		if (anInt1538 == 3553) {
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glTexParameteri(anInt1538, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1538, 10243, bool_144_ ? 10497 : 33071);
		}
	}

	void method14376(int i, int i_145_, int i_146_, int i_147_, int[] is, int i_148_, int i_149_, boolean bool) {
		if (i_149_ == 0)
			i_149_ = i_146_;
		if (bool) {
			int[] is_150_ = new int[i_146_ * i_147_];
			for (int i_151_ = 0; i_151_ < i_147_; i_151_++) {
				int i_152_ = i_151_ * i_146_;
				int i_153_ = (i_147_ - i_151_ - 1) * i_149_ + i_148_;
				for (int i_154_ = 0; i_154_ < i_146_; i_154_++)
					is_150_[i_152_++] = is[i_153_++];
			}
			is = is_150_;
		}
		aClass178_Sub1_1536.method14711(this);
		if (i_146_ != i_149_)
			OpenGL.glPixelStorei(3314, i_149_);
		OpenGL.glTexSubImage2Di(anInt1538, 0, i, anInt8893 - i_145_ - i_147_, i_146_, i_147_, 32993, aClass178_Sub1_1536.anInt9418, is, i_148_);
		if (i_146_ != i_149_)
			OpenGL.glPixelStorei(3314, 0);
	}

	void method14377(int i, int i_155_, int i_156_, int i_157_, byte[] is, Class158 class158, int i_158_, int i_159_, boolean bool) {
		if (i_159_ == 0)
			i_159_ = i_156_;
		if (bool) {
			int i_160_ = class158.anInt1753 * -920065167;
			int i_161_ = i_160_ * i_156_;
			int i_162_ = i_160_ * i_159_;
			byte[] is_163_ = new byte[i_161_ * i_157_];
			for (int i_164_ = 0; i_164_ < i_157_; i_164_++) {
				int i_165_ = i_164_ * i_161_;
				int i_166_ = (i_157_ - i_164_ - 1) * i_162_ + i_158_;
				for (int i_167_ = 0; i_167_ < i_161_; i_167_++)
					is_163_[i_165_++] = is[i_166_++];
			}
			is = is_163_;
		}
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_159_ != i_156_)
			OpenGL.glPixelStorei(3314, i_159_);
		OpenGL.glTexSubImage2Dub(anInt1538, 0, i, anInt8893 - i_155_ - i_157_, i_156_, i_157_, Class178_Sub1.method14698(class158), 5121, is, i_158_);
		if (i_159_ != i_156_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Interface22 method14378(int i) {
		return new Class157(this, i);
	}

	void method14379(int i, int i_168_, int i_169_, int i_170_, int[] is, int[] is_171_, int i_172_) {
		int[] is_173_ = is_171_ == null ? new int[anInt8892 * anInt8893] : is_171_;
		aClass178_Sub1_1536.method14711(this);
		OpenGL.glGetTexImagei(anInt1538, 0, 32993, 5121, is_173_, 0);
		for (int i_174_ = 0; i_174_ < i_170_; i_174_++)
			System.arraycopy(is_173_, (i_168_ + (i_170_ - 1) - i_174_) * anInt8892, is, i_172_ + i_174_ * i_169_, i_169_);
	}

	Class126_Sub2(Class178_Sub1 class178_sub1, int i, int i_175_, int i_176_, int i_177_, int i_178_) {
		super(class178_sub1, i, Class158.aClass158_1752, Class170.aClass170_1822, i_177_ * i_178_, false);
		anInt8892 = i_177_;
		anInt8893 = i_178_;
		aClass178_Sub1_1536.method14711(this);
		Class168 class168 = aClass178_Sub1_1536.method3039(1866011092);
		if (class168 != null) {
			int i_179_ = class168.method2874() - (i_176_ + i_178_);
			int i_180_ = Class178_Sub1.method14718(aClass158_1543, aClass170_1539);
			OpenGL.glCopyTexImage2D(anInt1538, 0, i_180_, i_175_, i_179_, i_177_, i_178_, 0);
		}
		method2110(true);
	}

	Interface23 method14380(int i) {
		return new Class157(this, i);
	}

	Interface23 method14381(int i) {
		return new Class157(this, i);
	}

	Interface22 method14382(int i) {
		return new Class157(this, i);
	}
}
