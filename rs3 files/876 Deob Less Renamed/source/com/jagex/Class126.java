/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public abstract class Class126 {
	static final int anInt1530 = 3553;
	boolean aBool1531 = false;
	static int[] anIntArray1532 = new int[1];
	static final int anInt1533 = 34067;
	static final int anInt1534 = 32879;
	static final int anInt1535 = 34037;
	Class178_Sub1 aClass178_Sub1_1536;
	int anInt1537;
	int anInt1538;
	Class170 aClass170_1539;
	static final int anInt1540 = 3552;
	boolean aBool1541;
	static final int anInt1542 = 5121;
	Class158 aClass158_1543;
	int anInt1544;

	void method2109() {
		if (anInt1537 != 0) {
			aClass178_Sub1_1536.method14693(anInt1537, method2117());
			anInt1537 = 0;
		}
	}

	void method2110(boolean bool) {
		if (aBool1531 != bool) {
			aBool1531 = bool;
			method2128();
		}
	}

	Class126(Class178_Sub1 class178_sub1, int i, Class158 class158, Class170 class170, int i_0_, boolean bool) {
		aClass178_Sub1_1536 = class178_sub1;
		anInt1538 = i;
		aClass158_1543 = class158;
		aClass170_1539 = class170;
		aBool1541 = bool;
		anInt1544 = i_0_;
		OpenGL.glGenTextures(1, anIntArray1532, 0);
		anInt1537 = anIntArray1532[0];
		method2116(0);
	}

	void method2111(int i) {
		aClass178_Sub1_1536.anInt9275 -= i;
		aClass178_Sub1_1536.anInt9275 += method2117();
	}

	void method2112(boolean bool) {
		if (aBool1541 != bool) {
			int i = method2117();
			aBool1541 = true;
			method2128();
			method2116(i);
		}
	}

	void method2113() {
		if (anInt1537 != 0) {
			aClass178_Sub1_1536.anInt9275 -= method2117();
			int[] is = new int[1];
			is[0] = anInt1537;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1537 = 0;
		}
	}

	void method2114(boolean bool) {
		if (aBool1531 != bool) {
			aBool1531 = bool;
			method2128();
		}
	}

	int method2115() {
		int i = (aClass158_1543.anInt1753 * -920065167 * (aClass170_1539.anInt1831 * 1602321003) * anInt1544);
		return aBool1541 ? i * 4 / 3 : i;
	}

	void method2116(int i) {
		aClass178_Sub1_1536.anInt9275 -= i;
		aClass178_Sub1_1536.anInt9275 += method2117();
	}

	int method2117() {
		int i = (aClass158_1543.anInt1753 * -920065167 * (aClass170_1539.anInt1831 * 1602321003) * anInt1544);
		return aBool1541 ? i * 4 / 3 : i;
	}

	void method2118() {
		aClass178_Sub1_1536.method14711(this);
		if (aBool1531) {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1538, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1538, 10240, 9728);
		}
	}

	static void method2119(int i, int i_1_, int i_2_, int i_3_, Class158 class158, byte[] is) {
		if (i_2_ > 0 && !Class318.method5691(i_2_, -1560351641))
			throw new IllegalArgumentException("");
		if (i_3_ > 0 && !Class318.method5691(i_3_, -2050510991))
			throw new IllegalArgumentException("");
		int i_4_ = class158.anInt1753 * -920065167;
		int i_5_ = 0;
		int i_6_ = i_2_ < i_3_ ? i_2_ : i_3_;
		int i_7_ = i_2_ >> 1;
		int i_8_ = i_3_ >> 1;
		byte[] is_9_ = is;
		byte[] is_10_ = new byte[i_7_ * i_8_ * i_4_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_5_, i_1_, i_2_, i_3_, 0, Class178_Sub1.method14698(class158), 5121, is_9_, 0);
			if (i_6_ <= 1)
				break;
			int i_11_ = i_2_ * i_4_;
			for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
				int i_13_ = i_12_;
				int i_14_ = i_12_;
				int i_15_ = i_14_ + i_11_;
				for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
					for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
						int i_18_ = is_9_[i_14_];
						i_14_ += i_4_;
						i_18_ += is_9_[i_14_];
						i_14_ += i_4_;
						i_18_ += is_9_[i_15_];
						i_15_ += i_4_;
						i_18_ += is_9_[i_15_];
						i_15_ += i_4_;
						is_10_[i_13_] = (byte) (i_18_ >> 2);
						i_13_ += i_4_;
					}
					i_14_ += i_11_;
					i_15_ += i_11_;
				}
			}
			byte[] is_19_ = is_10_;
			is_10_ = is_9_;
			is_9_ = is_19_;
			i_2_ = i_7_;
			i_3_ = i_8_;
			i_7_ >>= 1;
			i_8_ >>= 1;
			i_6_ >>= 1;
			i_5_++;
		}
	}

	boolean method2120() {
		if (aClass178_Sub1_1536.aBool9398) {
			int i = method2117();
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glGenerateMipmapEXT(anInt1538);
			aBool1541 = true;
			method2128();
			method2116(i);
			return true;
		}
		return false;
	}

	void method2121(boolean bool) {
		if (aBool1541 != bool) {
			int i = method2117();
			aBool1541 = true;
			method2128();
			method2116(i);
		}
	}

	static void method2122(int i, int i_20_, int i_21_, int i_22_, Class158 class158, float[] fs) {
		if (i_21_ > 0 && !Class318.method5691(i_21_, -943980072))
			throw new IllegalArgumentException("");
		if (i_22_ > 0 && !Class318.method5691(i_22_, -1623303202))
			throw new IllegalArgumentException("");
		int i_23_ = class158.anInt1753 * -920065167;
		int i_24_ = 0;
		int i_25_ = i_21_ < i_22_ ? i_21_ : i_22_;
		int i_26_ = i_21_ >> 1;
		int i_27_ = i_22_ >> 1;
		float[] fs_28_ = fs;
		float[] fs_29_ = new float[i_26_ * i_27_ * i_23_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_24_, i_20_, i_21_, i_22_, 0, Class178_Sub1.method14698(class158), 5126, fs_28_, 0);
			if (i_25_ <= 1)
				break;
			int i_30_ = i_21_ * i_23_;
			for (int i_31_ = 0; i_31_ < i_23_; i_31_++) {
				int i_32_ = i_31_;
				int i_33_ = i_31_;
				int i_34_ = i_33_ + i_30_;
				for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
					for (int i_36_ = 0; i_36_ < i_26_; i_36_++) {
						float f = fs_28_[i_33_];
						i_33_ += i_23_;
						f += fs_28_[i_33_];
						i_33_ += i_23_;
						f += fs_28_[i_34_];
						i_34_ += i_23_;
						f += fs_28_[i_34_];
						i_34_ += i_23_;
						fs_29_[i_32_] = f * 0.25F;
						i_32_ += i_23_;
					}
					i_33_ += i_30_;
					i_34_ += i_30_;
				}
			}
			float[] fs_37_ = fs_29_;
			fs_29_ = fs_28_;
			fs_28_ = fs_37_;
			i_21_ = i_26_;
			i_22_ = i_27_;
			i_26_ >>= 1;
			i_27_ >>= 1;
			i_25_ >>= 1;
			i_24_++;
		}
	}

	void method2123(boolean bool) {
		if (aBool1531 != bool) {
			aBool1531 = bool;
			method2128();
		}
	}

	void method2124() throws Throwable {
		method2109();
		super.finalize();
	}

	static void method2125(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int[] is) {
		if (i_39_ > 0 && !Class318.method5691(i_39_, -1914639406))
			throw new IllegalArgumentException("");
		if (i_40_ > 0 && !Class318.method5691(i_40_, -1816771606))
			throw new IllegalArgumentException("");
		if (i_41_ != 32993)
			throw new IllegalArgumentException("");
		int i_43_ = 0;
		int i_44_ = i_39_ < i_40_ ? i_39_ : i_40_;
		int i_45_ = i_39_ >> 1;
		int i_46_ = i_40_ >> 1;
		int[] is_47_ = is;
		int[] is_48_ = new int[i_45_ * i_46_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_43_, i_38_, i_39_, i_40_, 0, i_41_, i_42_, is_47_, 0);
			if (i_44_ <= 1)
				break;
			int i_49_ = 0;
			int i_50_ = 0;
			int i_51_ = i_50_ + i_39_;
			for (int i_52_ = 0; i_52_ < i_46_; i_52_++) {
				for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
					int i_54_ = is_47_[i_50_++];
					int i_55_ = is_47_[i_50_++];
					int i_56_ = is_47_[i_51_++];
					int i_57_ = is_47_[i_51_++];
					int i_58_ = i_54_ >> 24 & 0xff;
					int i_59_ = i_54_ >> 16 & 0xff;
					int i_60_ = i_54_ >> 8 & 0xff;
					int i_61_ = i_54_ & 0xff;
					i_58_ += i_55_ >> 24 & 0xff;
					i_59_ += i_55_ >> 16 & 0xff;
					i_60_ += i_55_ >> 8 & 0xff;
					i_61_ += i_55_ & 0xff;
					i_58_ += i_56_ >> 24 & 0xff;
					i_59_ += i_56_ >> 16 & 0xff;
					i_60_ += i_56_ >> 8 & 0xff;
					i_61_ += i_56_ & 0xff;
					i_58_ += i_57_ >> 24 & 0xff;
					i_59_ += i_57_ >> 16 & 0xff;
					i_60_ += i_57_ >> 8 & 0xff;
					i_61_ += i_57_ & 0xff;
					is_48_[i_49_++] = ((i_58_ & 0x3fc) << 22 | (i_59_ & 0x3fc) << 14 | (i_60_ & 0x3fc) << 6 | (i_61_ & 0x3fc) >> 2);
				}
				i_50_ += i_39_;
				i_51_ += i_39_;
			}
			int[] is_62_ = is_48_;
			is_48_ = is_47_;
			is_47_ = is_62_;
			i_39_ = i_45_;
			i_40_ = i_46_;
			i_45_ >>= 1;
			i_46_ >>= 1;
			i_44_ >>= 1;
			i_43_++;
		}
	}

	int method2126() {
		int i = (aClass158_1543.anInt1753 * -920065167 * (aClass170_1539.anInt1831 * 1602321003) * anInt1544);
		return aBool1541 ? i * 4 / 3 : i;
	}

	void method2127() {
		aClass178_Sub1_1536.method14711(this);
		if (aBool1531) {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1538, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1538, 10240, 9728);
		}
	}

	void method2128() {
		aClass178_Sub1_1536.method14711(this);
		if (aBool1531) {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1538, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1538, 10240, 9728);
		}
	}

	void method2129() {
		aClass178_Sub1_1536.method14711(this);
		if (aBool1531) {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1538, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1538, 10240, 9728);
		}
	}

	void method2130() {
		if (anInt1537 != 0) {
			aClass178_Sub1_1536.method14693(anInt1537, method2117());
			anInt1537 = 0;
		}
	}

	boolean method2131() {
		if (aClass178_Sub1_1536.aBool9398) {
			int i = method2117();
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glGenerateMipmapEXT(anInt1538);
			aBool1541 = true;
			method2128();
			method2116(i);
			return true;
		}
		return false;
	}

	void method2132(boolean bool) {
		if (aBool1541 != bool) {
			int i = method2117();
			aBool1541 = true;
			method2128();
			method2116(i);
		}
	}

	void method2133() {
		aClass178_Sub1_1536.method14711(this);
		if (aBool1531) {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1538, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1538, 10240, 9728);
		}
	}

	void method2134() {
		if (anInt1537 != 0) {
			aClass178_Sub1_1536.anInt9275 -= method2117();
			int[] is = new int[1];
			is[0] = anInt1537;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1537 = 0;
		}
	}

	void method2135() {
		if (anInt1537 != 0) {
			aClass178_Sub1_1536.anInt9275 -= method2117();
			int[] is = new int[1];
			is[0] = anInt1537;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1537 = 0;
		}
	}

	void method2136() {
		if (anInt1537 != 0) {
			aClass178_Sub1_1536.anInt9275 -= method2117();
			int[] is = new int[1];
			is[0] = anInt1537;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1537 = 0;
		}
	}

	static void method2137(int i, int i_63_, int i_64_, int i_65_, Class158 class158, float[] fs) {
		if (i_64_ > 0 && !Class318.method5691(i_64_, -1117254438))
			throw new IllegalArgumentException("");
		if (i_65_ > 0 && !Class318.method5691(i_65_, -1173883831))
			throw new IllegalArgumentException("");
		int i_66_ = class158.anInt1753 * -920065167;
		int i_67_ = 0;
		int i_68_ = i_64_ < i_65_ ? i_64_ : i_65_;
		int i_69_ = i_64_ >> 1;
		int i_70_ = i_65_ >> 1;
		float[] fs_71_ = fs;
		float[] fs_72_ = new float[i_69_ * i_70_ * i_66_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_67_, i_63_, i_64_, i_65_, 0, Class178_Sub1.method14698(class158), 5126, fs_71_, 0);
			if (i_68_ <= 1)
				break;
			int i_73_ = i_64_ * i_66_;
			for (int i_74_ = 0; i_74_ < i_66_; i_74_++) {
				int i_75_ = i_74_;
				int i_76_ = i_74_;
				int i_77_ = i_76_ + i_73_;
				for (int i_78_ = 0; i_78_ < i_70_; i_78_++) {
					for (int i_79_ = 0; i_79_ < i_69_; i_79_++) {
						float f = fs_71_[i_76_];
						i_76_ += i_66_;
						f += fs_71_[i_76_];
						i_76_ += i_66_;
						f += fs_71_[i_77_];
						i_77_ += i_66_;
						f += fs_71_[i_77_];
						i_77_ += i_66_;
						fs_72_[i_75_] = f * 0.25F;
						i_75_ += i_66_;
					}
					i_76_ += i_73_;
					i_77_ += i_73_;
				}
			}
			float[] fs_80_ = fs_72_;
			fs_72_ = fs_71_;
			fs_71_ = fs_80_;
			i_64_ = i_69_;
			i_65_ = i_70_;
			i_69_ >>= 1;
			i_70_ >>= 1;
			i_68_ >>= 1;
			i_67_++;
		}
	}

	void method2138() {
		aClass178_Sub1_1536.method14711(this);
		if (aBool1531) {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1538, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1538, 10241, aBool1541 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1538, 10240, 9728);
		}
	}

	void method2139(int i) {
		aClass178_Sub1_1536.anInt9275 -= i;
		aClass178_Sub1_1536.anInt9275 += method2117();
	}

	public void finalize() throws Throwable {
		method2109();
		super.finalize();
	}

	boolean method2140() {
		if (aClass178_Sub1_1536.aBool9398) {
			int i = method2117();
			aClass178_Sub1_1536.method14711(this);
			OpenGL.glGenerateMipmapEXT(anInt1538);
			aBool1541 = true;
			method2128();
			method2116(i);
			return true;
		}
		return false;
	}

	static void method2141(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int[] is) {
		if (i_82_ > 0 && !Class318.method5691(i_82_, -1361006547))
			throw new IllegalArgumentException("");
		if (i_83_ > 0 && !Class318.method5691(i_83_, -1147233190))
			throw new IllegalArgumentException("");
		if (i_84_ != 32993)
			throw new IllegalArgumentException("");
		int i_86_ = 0;
		int i_87_ = i_82_ < i_83_ ? i_82_ : i_83_;
		int i_88_ = i_82_ >> 1;
		int i_89_ = i_83_ >> 1;
		int[] is_90_ = is;
		int[] is_91_ = new int[i_88_ * i_89_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_86_, i_81_, i_82_, i_83_, 0, i_84_, i_85_, is_90_, 0);
			if (i_87_ <= 1)
				break;
			int i_92_ = 0;
			int i_93_ = 0;
			int i_94_ = i_93_ + i_82_;
			for (int i_95_ = 0; i_95_ < i_89_; i_95_++) {
				for (int i_96_ = 0; i_96_ < i_88_; i_96_++) {
					int i_97_ = is_90_[i_93_++];
					int i_98_ = is_90_[i_93_++];
					int i_99_ = is_90_[i_94_++];
					int i_100_ = is_90_[i_94_++];
					int i_101_ = i_97_ >> 24 & 0xff;
					int i_102_ = i_97_ >> 16 & 0xff;
					int i_103_ = i_97_ >> 8 & 0xff;
					int i_104_ = i_97_ & 0xff;
					i_101_ += i_98_ >> 24 & 0xff;
					i_102_ += i_98_ >> 16 & 0xff;
					i_103_ += i_98_ >> 8 & 0xff;
					i_104_ += i_98_ & 0xff;
					i_101_ += i_99_ >> 24 & 0xff;
					i_102_ += i_99_ >> 16 & 0xff;
					i_103_ += i_99_ >> 8 & 0xff;
					i_104_ += i_99_ & 0xff;
					i_101_ += i_100_ >> 24 & 0xff;
					i_102_ += i_100_ >> 16 & 0xff;
					i_103_ += i_100_ >> 8 & 0xff;
					i_104_ += i_100_ & 0xff;
					is_91_[i_92_++] = ((i_101_ & 0x3fc) << 22 | (i_102_ & 0x3fc) << 14 | (i_103_ & 0x3fc) << 6 | (i_104_ & 0x3fc) >> 2);
				}
				i_93_ += i_82_;
				i_94_ += i_82_;
			}
			int[] is_105_ = is_91_;
			is_91_ = is_90_;
			is_90_ = is_105_;
			i_82_ = i_88_;
			i_83_ = i_89_;
			i_88_ >>= 1;
			i_89_ >>= 1;
			i_87_ >>= 1;
			i_86_++;
		}
	}

	static void method2142(int i, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int[] is) {
		if (i_107_ > 0 && !Class318.method5691(i_107_, -834646647))
			throw new IllegalArgumentException("");
		if (i_108_ > 0 && !Class318.method5691(i_108_, -1436309632))
			throw new IllegalArgumentException("");
		if (i_109_ != 32993)
			throw new IllegalArgumentException("");
		int i_111_ = 0;
		int i_112_ = i_107_ < i_108_ ? i_107_ : i_108_;
		int i_113_ = i_107_ >> 1;
		int i_114_ = i_108_ >> 1;
		int[] is_115_ = is;
		int[] is_116_ = new int[i_113_ * i_114_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_111_, i_106_, i_107_, i_108_, 0, i_109_, i_110_, is_115_, 0);
			if (i_112_ <= 1)
				break;
			int i_117_ = 0;
			int i_118_ = 0;
			int i_119_ = i_118_ + i_107_;
			for (int i_120_ = 0; i_120_ < i_114_; i_120_++) {
				for (int i_121_ = 0; i_121_ < i_113_; i_121_++) {
					int i_122_ = is_115_[i_118_++];
					int i_123_ = is_115_[i_118_++];
					int i_124_ = is_115_[i_119_++];
					int i_125_ = is_115_[i_119_++];
					int i_126_ = i_122_ >> 24 & 0xff;
					int i_127_ = i_122_ >> 16 & 0xff;
					int i_128_ = i_122_ >> 8 & 0xff;
					int i_129_ = i_122_ & 0xff;
					i_126_ += i_123_ >> 24 & 0xff;
					i_127_ += i_123_ >> 16 & 0xff;
					i_128_ += i_123_ >> 8 & 0xff;
					i_129_ += i_123_ & 0xff;
					i_126_ += i_124_ >> 24 & 0xff;
					i_127_ += i_124_ >> 16 & 0xff;
					i_128_ += i_124_ >> 8 & 0xff;
					i_129_ += i_124_ & 0xff;
					i_126_ += i_125_ >> 24 & 0xff;
					i_127_ += i_125_ >> 16 & 0xff;
					i_128_ += i_125_ >> 8 & 0xff;
					i_129_ += i_125_ & 0xff;
					is_116_[i_117_++] = ((i_126_ & 0x3fc) << 22 | (i_127_ & 0x3fc) << 14 | (i_128_ & 0x3fc) << 6 | (i_129_ & 0x3fc) >> 2);
				}
				i_118_ += i_107_;
				i_119_ += i_107_;
			}
			int[] is_130_ = is_116_;
			is_116_ = is_115_;
			is_115_ = is_130_;
			i_107_ = i_113_;
			i_108_ = i_114_;
			i_113_ >>= 1;
			i_114_ >>= 1;
			i_112_ >>= 1;
			i_111_++;
		}
	}

	void method2143(boolean bool) {
		if (aBool1531 != bool) {
			aBool1531 = bool;
			method2128();
		}
	}
}
