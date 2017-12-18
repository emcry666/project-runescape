/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public abstract class Class492 implements Interface43 {
	static final int anInt5538 = 32879;
	static final int anInt5539 = 3553;
	static final int anInt5540 = 34067;
	Class178_Sub2_Sub2 aClass178_Sub2_Sub2_5541;
	int anInt5542;
	static final int anInt5543 = 0;
	int anInt5544;
	Class158 aClass158_5545;
	Class170 aClass170_5546;
	boolean aBool5547;
	Class342 aClass342_5548 = Class342.aClass342_3610;
	int anInt5549;
	static int[] anIntArray5550 = new int[1];

	public void method332() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = aClass178_Sub2_Sub2_5541.method15051();
		int i_0_ = aClass178_Sub2_Sub2_5541.anIntArray11513[i];
		if (i_0_ != anInt5544) {
			if (i_0_ != 0) {
				OpenGL.glBindTexture(i_0_, 0);
				OpenGL.glDisable(i_0_);
			}
			OpenGL.glEnable(anInt5544);
			aClass178_Sub2_Sub2_5541.anIntArray11513[i] = anInt5544;
		}
		OpenGL.glBindTexture(anInt5544, anInt5542);
	}

	public void method297() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = aClass178_Sub2_Sub2_5541.method15051();
		int i_1_ = aClass178_Sub2_Sub2_5541.anIntArray11513[i];
		if (i_1_ != anInt5544) {
			if (i_1_ != 0) {
				OpenGL.glBindTexture(i_1_, 0);
				OpenGL.glDisable(i_1_);
			}
			OpenGL.glEnable(anInt5544);
			aClass178_Sub2_Sub2_5541.anIntArray11513[i] = anInt5544;
		}
		OpenGL.glBindTexture(anInt5544, anInt5542);
	}

	public void method330(Class342 class342) {
		if (aClass342_5548 != class342) {
			aClass342_5548 = class342;
			method8060();
		}
	}

	void method8060() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass342_5548 == Class342.aClass342_3610) {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5544, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5544, 10240, 9728);
		}
	}

	boolean method249() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = method8064();
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glEnable(anInt5544);
		OpenGL.glGenerateMipmapEXT(anInt5544);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glDisable(anInt5544);
		aBool5547 = true;
		method8060();
		method8063(i);
		return true;
	}

	void method8061(int i, int i_2_, int i_3_, int[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_2_ > 0 && !Class318.method5691(i_2_, -1004591048))
			throw new IllegalArgumentException("");
		if (i_3_ > 0 && !Class318.method5691(i_3_, -2017418244))
			throw new IllegalArgumentException("");
		if (aClass158_5545 != Class158.aClass158_1743)
			throw new IllegalArgumentException("");
		int i_4_ = 0;
		int i_5_ = i_2_ < i_3_ ? i_2_ : i_3_;
		int i_6_ = i_2_ >> 1;
		int i_7_ = i_3_ >> 1;
		int[] is_8_ = is;
		int[] is_9_ = new int[i_6_ * i_7_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_4_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_2_, i_3_, 0, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = i_11_ + i_2_;
			for (int i_13_ = 0; i_13_ < i_7_; i_13_++) {
				for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
					int i_15_ = is_8_[i_11_++];
					int i_16_ = is_8_[i_11_++];
					int i_17_ = is_8_[i_12_++];
					int i_18_ = is_8_[i_12_++];
					int i_19_ = i_15_ >> 24 & 0xff;
					int i_20_ = i_15_ >> 16 & 0xff;
					int i_21_ = i_15_ >> 8 & 0xff;
					int i_22_ = i_15_ & 0xff;
					i_19_ += i_16_ >> 24 & 0xff;
					i_20_ += i_16_ >> 16 & 0xff;
					i_21_ += i_16_ >> 8 & 0xff;
					i_22_ += i_16_ & 0xff;
					i_19_ += i_17_ >> 24 & 0xff;
					i_20_ += i_17_ >> 16 & 0xff;
					i_21_ += i_17_ >> 8 & 0xff;
					i_22_ += i_17_ & 0xff;
					i_19_ += i_18_ >> 24 & 0xff;
					i_20_ += i_18_ >> 16 & 0xff;
					i_21_ += i_18_ >> 8 & 0xff;
					i_22_ += i_18_ & 0xff;
					is_9_[i_10_++] = ((i_19_ & 0x3fc) << 22 | (i_20_ & 0x3fc) << 14 | (i_21_ & 0x3fc) << 6 | (i_22_ & 0x3fc) >> 2);
				}
				i_11_ += i_2_;
				i_12_ += i_2_;
			}
			int[] is_23_ = is_9_;
			is_9_ = is_8_;
			is_8_ = is_23_;
			i_2_ = i_6_;
			i_3_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	public void method78() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.anInt9530 -= method8064();
			int[] is = new int[1];
			is[0] = anInt5542;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5542 = 0;
		}
	}

	void method8062(int i, int i_24_, int i_25_, float[] fs) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_24_ > 0 && !Class318.method5691(i_24_, -2011285431))
			throw new IllegalArgumentException("");
		if (i_25_ > 0 && !Class318.method5691(i_25_, -1312226549))
			throw new IllegalArgumentException("");
		int i_26_ = aClass158_5545.anInt1753 * -920065167;
		int i_27_ = 0;
		int i_28_ = i_24_ < i_25_ ? i_24_ : i_25_;
		int i_29_ = i_24_ >> 1;
		int i_30_ = i_25_ >> 1;
		float[] fs_31_ = fs;
		float[] fs_32_ = new float[i_29_ * i_30_ * i_26_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_27_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_24_, i_25_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5126, fs_31_, 0);
			if (i_28_ <= 1)
				break;
			int i_33_ = i_24_ * i_26_;
			for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
				int i_35_ = i_34_;
				int i_36_ = i_34_;
				int i_37_ = i_36_ + i_33_;
				for (int i_38_ = 0; i_38_ < i_30_; i_38_++) {
					for (int i_39_ = 0; i_39_ < i_29_; i_39_++) {
						float f = fs_31_[i_36_];
						i_36_ += i_26_;
						f += fs_31_[i_36_];
						i_36_ += i_26_;
						f += fs_31_[i_37_];
						i_37_ += i_26_;
						f += fs_31_[i_37_];
						i_37_ += i_26_;
						fs_32_[i_35_] = f * 0.25F;
						i_35_ += i_26_;
					}
					i_36_ += i_33_;
					i_37_ += i_33_;
				}
			}
			float[] fs_40_ = fs_32_;
			fs_32_ = fs_31_;
			fs_31_ = fs_40_;
			i_24_ = i_29_;
			i_25_ = i_30_;
			i_29_ >>= 1;
			i_30_ >>= 1;
			i_28_ >>= 1;
			i_27_++;
		}
	}

	void method8063(int i) {
		aClass178_Sub2_Sub2_5541.anInt9530 -= i;
		aClass178_Sub2_Sub2_5541.anInt9530 += method8064();
	}

	int method8064() {
		int i = (aClass158_5545.anInt1753 * -920065167 * (aClass170_5546.anInt1831 * 1602321003) * anInt5549);
		return aBool5547 ? i * 4 / 3 : i;
	}

	void method8065() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass342_5548 == Class342.aClass342_3610) {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5544, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5544, 10240, 9728);
		}
	}

	void method8066() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.method17897(anInt5542, method8064());
			anInt5542 = 0;
		}
	}

	public void method130() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.anInt9530 -= method8064();
			int[] is = new int[1];
			is[0] = anInt5542;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5542 = 0;
		}
	}

	boolean method264() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = method8064();
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glEnable(anInt5544);
		OpenGL.glGenerateMipmapEXT(anInt5544);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glDisable(anInt5544);
		aBool5547 = true;
		method8060();
		method8063(i);
		return true;
	}

	void method8067(int i) {
		aClass178_Sub2_Sub2_5541.anInt9530 -= i;
		aClass178_Sub2_Sub2_5541.anInt9530 += method8064();
	}

	Class492(Class178_Sub2_Sub2 class178_sub2_sub2, int i, Class158 class158, Class170 class170, int i_41_, boolean bool) {
		aClass178_Sub2_Sub2_5541 = class178_sub2_sub2;
		anInt5544 = i;
		aClass158_5545 = class158;
		aClass170_5546 = class170;
		aBool5547 = bool;
		anInt5549 = i_41_;
		OpenGL.glGenTextures(1, anIntArray5550, 0);
		anInt5542 = anIntArray5550[0];
		method8060();
		method8063(0);
	}

	void method8068() throws Throwable {
		method8066();
		super.finalize();
	}

	boolean method216() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = method8064();
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glEnable(anInt5544);
		OpenGL.glGenerateMipmapEXT(anInt5544);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glDisable(anInt5544);
		aBool5547 = true;
		method8060();
		method8063(i);
		return true;
	}

	void method8069() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.method17897(anInt5542, method8064());
			anInt5542 = 0;
		}
	}

	void method8070(int i, int i_42_, int i_43_, int[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_42_ > 0 && !Class318.method5691(i_42_, -802872945))
			throw new IllegalArgumentException("");
		if (i_43_ > 0 && !Class318.method5691(i_43_, -1354527582))
			throw new IllegalArgumentException("");
		if (aClass158_5545 != Class158.aClass158_1743)
			throw new IllegalArgumentException("");
		int i_44_ = 0;
		int i_45_ = i_42_ < i_43_ ? i_42_ : i_43_;
		int i_46_ = i_42_ >> 1;
		int i_47_ = i_43_ >> 1;
		int[] is_48_ = is;
		int[] is_49_ = new int[i_46_ * i_47_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_44_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_42_, i_43_, 0, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is_48_, 0);
			if (i_45_ <= 1)
				break;
			int i_50_ = 0;
			int i_51_ = 0;
			int i_52_ = i_51_ + i_42_;
			for (int i_53_ = 0; i_53_ < i_47_; i_53_++) {
				for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
					int i_55_ = is_48_[i_51_++];
					int i_56_ = is_48_[i_51_++];
					int i_57_ = is_48_[i_52_++];
					int i_58_ = is_48_[i_52_++];
					int i_59_ = i_55_ >> 24 & 0xff;
					int i_60_ = i_55_ >> 16 & 0xff;
					int i_61_ = i_55_ >> 8 & 0xff;
					int i_62_ = i_55_ & 0xff;
					i_59_ += i_56_ >> 24 & 0xff;
					i_60_ += i_56_ >> 16 & 0xff;
					i_61_ += i_56_ >> 8 & 0xff;
					i_62_ += i_56_ & 0xff;
					i_59_ += i_57_ >> 24 & 0xff;
					i_60_ += i_57_ >> 16 & 0xff;
					i_61_ += i_57_ >> 8 & 0xff;
					i_62_ += i_57_ & 0xff;
					i_59_ += i_58_ >> 24 & 0xff;
					i_60_ += i_58_ >> 16 & 0xff;
					i_61_ += i_58_ >> 8 & 0xff;
					i_62_ += i_58_ & 0xff;
					is_49_[i_50_++] = ((i_59_ & 0x3fc) << 22 | (i_60_ & 0x3fc) << 14 | (i_61_ & 0x3fc) << 6 | (i_62_ & 0x3fc) >> 2);
				}
				i_51_ += i_42_;
				i_52_ += i_42_;
			}
			int[] is_63_ = is_49_;
			is_49_ = is_48_;
			is_48_ = is_63_;
			i_42_ = i_46_;
			i_43_ = i_47_;
			i_46_ >>= 1;
			i_47_ >>= 1;
			i_45_ >>= 1;
			i_44_++;
		}
	}

	public void method333(Class342 class342) {
		if (aClass342_5548 != class342) {
			aClass342_5548 = class342;
			method8060();
		}
	}

	boolean method262() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = method8064();
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glEnable(anInt5544);
		OpenGL.glGenerateMipmapEXT(anInt5544);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glDisable(anInt5544);
		aBool5547 = true;
		method8060();
		method8063(i);
		return true;
	}

	public void method329(Class342 class342) {
		if (aClass342_5548 != class342) {
			aClass342_5548 = class342;
			method8060();
		}
	}

	boolean method260() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = method8064();
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glEnable(anInt5544);
		OpenGL.glGenerateMipmapEXT(anInt5544);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glDisable(anInt5544);
		aBool5547 = true;
		method8060();
		method8063(i);
		return true;
	}

	public void method334(Class342 class342) {
		if (aClass342_5548 != class342) {
			aClass342_5548 = class342;
			method8060();
		}
	}

	void method8071() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass342_5548 == Class342.aClass342_3610) {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5544, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5544, 10240, 9728);
		}
	}

	boolean method226() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = method8064();
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glEnable(anInt5544);
		OpenGL.glGenerateMipmapEXT(anInt5544);
		if (aClass178_Sub2_Sub2_5541.aBool11492)
			OpenGL.glDisable(anInt5544);
		aBool5547 = true;
		method8060();
		method8063(i);
		return true;
	}

	public void method335(Class342 class342) {
		if (aClass342_5548 != class342) {
			aClass342_5548 = class342;
			method8060();
		}
	}

	void method8072() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass342_5548 == Class342.aClass342_3610) {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5544, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5544, 10240, 9728);
		}
	}

	public void finalize() throws Throwable {
		method8066();
		super.finalize();
	}

	void method8073() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		aClass178_Sub2_Sub2_5541.method15001(this);
		if (aClass342_5548 == Class342.aClass342_3610) {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5544, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5544, 10241, aBool5547 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5544, 10240, 9728);
		}
	}

	void method8074(int i, int i_64_, int i_65_, int[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_64_ > 0 && !Class318.method5691(i_64_, -818814661))
			throw new IllegalArgumentException("");
		if (i_65_ > 0 && !Class318.method5691(i_65_, -1536696128))
			throw new IllegalArgumentException("");
		if (aClass158_5545 != Class158.aClass158_1743)
			throw new IllegalArgumentException("");
		int i_66_ = 0;
		int i_67_ = i_64_ < i_65_ ? i_64_ : i_65_;
		int i_68_ = i_64_ >> 1;
		int i_69_ = i_65_ >> 1;
		int[] is_70_ = is;
		int[] is_71_ = new int[i_68_ * i_69_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_66_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_64_, i_65_, 0, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is_70_, 0);
			if (i_67_ <= 1)
				break;
			int i_72_ = 0;
			int i_73_ = 0;
			int i_74_ = i_73_ + i_64_;
			for (int i_75_ = 0; i_75_ < i_69_; i_75_++) {
				for (int i_76_ = 0; i_76_ < i_68_; i_76_++) {
					int i_77_ = is_70_[i_73_++];
					int i_78_ = is_70_[i_73_++];
					int i_79_ = is_70_[i_74_++];
					int i_80_ = is_70_[i_74_++];
					int i_81_ = i_77_ >> 24 & 0xff;
					int i_82_ = i_77_ >> 16 & 0xff;
					int i_83_ = i_77_ >> 8 & 0xff;
					int i_84_ = i_77_ & 0xff;
					i_81_ += i_78_ >> 24 & 0xff;
					i_82_ += i_78_ >> 16 & 0xff;
					i_83_ += i_78_ >> 8 & 0xff;
					i_84_ += i_78_ & 0xff;
					i_81_ += i_79_ >> 24 & 0xff;
					i_82_ += i_79_ >> 16 & 0xff;
					i_83_ += i_79_ >> 8 & 0xff;
					i_84_ += i_79_ & 0xff;
					i_81_ += i_80_ >> 24 & 0xff;
					i_82_ += i_80_ >> 16 & 0xff;
					i_83_ += i_80_ >> 8 & 0xff;
					i_84_ += i_80_ & 0xff;
					is_71_[i_72_++] = ((i_81_ & 0x3fc) << 22 | (i_82_ & 0x3fc) << 14 | (i_83_ & 0x3fc) << 6 | (i_84_ & 0x3fc) >> 2);
				}
				i_73_ += i_64_;
				i_74_ += i_64_;
			}
			int[] is_85_ = is_71_;
			is_71_ = is_70_;
			is_70_ = is_85_;
			i_64_ = i_68_;
			i_65_ = i_69_;
			i_68_ >>= 1;
			i_69_ >>= 1;
			i_67_ >>= 1;
			i_66_++;
		}
	}

	void method8075(int i, int i_86_, int i_87_, int[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_86_ > 0 && !Class318.method5691(i_86_, -1610683862))
			throw new IllegalArgumentException("");
		if (i_87_ > 0 && !Class318.method5691(i_87_, -1362937857))
			throw new IllegalArgumentException("");
		if (aClass158_5545 != Class158.aClass158_1743)
			throw new IllegalArgumentException("");
		int i_88_ = 0;
		int i_89_ = i_86_ < i_87_ ? i_86_ : i_87_;
		int i_90_ = i_86_ >> 1;
		int i_91_ = i_87_ >> 1;
		int[] is_92_ = is;
		int[] is_93_ = new int[i_90_ * i_91_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_88_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_86_, i_87_, 0, 32993, aClass178_Sub2_Sub2_5541.anInt11529, is_92_, 0);
			if (i_89_ <= 1)
				break;
			int i_94_ = 0;
			int i_95_ = 0;
			int i_96_ = i_95_ + i_86_;
			for (int i_97_ = 0; i_97_ < i_91_; i_97_++) {
				for (int i_98_ = 0; i_98_ < i_90_; i_98_++) {
					int i_99_ = is_92_[i_95_++];
					int i_100_ = is_92_[i_95_++];
					int i_101_ = is_92_[i_96_++];
					int i_102_ = is_92_[i_96_++];
					int i_103_ = i_99_ >> 24 & 0xff;
					int i_104_ = i_99_ >> 16 & 0xff;
					int i_105_ = i_99_ >> 8 & 0xff;
					int i_106_ = i_99_ & 0xff;
					i_103_ += i_100_ >> 24 & 0xff;
					i_104_ += i_100_ >> 16 & 0xff;
					i_105_ += i_100_ >> 8 & 0xff;
					i_106_ += i_100_ & 0xff;
					i_103_ += i_101_ >> 24 & 0xff;
					i_104_ += i_101_ >> 16 & 0xff;
					i_105_ += i_101_ >> 8 & 0xff;
					i_106_ += i_101_ & 0xff;
					i_103_ += i_102_ >> 24 & 0xff;
					i_104_ += i_102_ >> 16 & 0xff;
					i_105_ += i_102_ >> 8 & 0xff;
					i_106_ += i_102_ & 0xff;
					is_93_[i_94_++] = ((i_103_ & 0x3fc) << 22 | (i_104_ & 0x3fc) << 14 | (i_105_ & 0x3fc) << 6 | (i_106_ & 0x3fc) >> 2);
				}
				i_95_ += i_86_;
				i_96_ += i_86_;
			}
			int[] is_107_ = is_93_;
			is_93_ = is_92_;
			is_92_ = is_107_;
			i_86_ = i_90_;
			i_87_ = i_91_;
			i_90_ >>= 1;
			i_91_ >>= 1;
			i_89_ >>= 1;
			i_88_++;
		}
	}

	public void method132() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.anInt9530 -= method8064();
			int[] is = new int[1];
			is[0] = anInt5542;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5542 = 0;
		}
	}

	void method8076(int i, int i_108_, int i_109_, byte[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_108_ > 0 && !Class318.method5691(i_108_, -2070193747))
			throw new IllegalArgumentException("");
		if (i_109_ > 0 && !Class318.method5691(i_109_, -940482700))
			throw new IllegalArgumentException("");
		int i_110_ = aClass158_5545.anInt1753 * -920065167;
		int i_111_ = 0;
		int i_112_ = i_108_ < i_109_ ? i_108_ : i_109_;
		int i_113_ = i_108_ >> 1;
		int i_114_ = i_109_ >> 1;
		byte[] is_115_ = is;
		byte[] is_116_ = new byte[i_113_ * i_114_ * i_110_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_111_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_108_, i_109_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5121, is_115_, 0);
			if (i_112_ <= 1)
				break;
			int i_117_ = i_108_ * i_110_;
			for (int i_118_ = 0; i_118_ < i_110_; i_118_++) {
				int i_119_ = i_118_;
				int i_120_ = i_118_;
				int i_121_ = i_120_ + i_117_;
				for (int i_122_ = 0; i_122_ < i_114_; i_122_++) {
					for (int i_123_ = 0; i_123_ < i_113_; i_123_++) {
						int i_124_ = is_115_[i_120_];
						i_120_ += i_110_;
						i_124_ += is_115_[i_120_];
						i_120_ += i_110_;
						i_124_ += is_115_[i_121_];
						i_121_ += i_110_;
						i_124_ += is_115_[i_121_];
						i_121_ += i_110_;
						is_116_[i_119_] = (byte) (i_124_ >> 2);
						i_119_ += i_110_;
					}
					i_120_ += i_117_;
					i_121_ += i_117_;
				}
			}
			byte[] is_125_ = is_116_;
			is_116_ = is_115_;
			is_115_ = is_125_;
			i_108_ = i_113_;
			i_109_ = i_114_;
			i_113_ >>= 1;
			i_114_ >>= 1;
			i_112_ >>= 1;
			i_111_++;
		}
	}

	void method8077(int i, int i_126_, int i_127_, byte[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_126_ > 0 && !Class318.method5691(i_126_, -1714344365))
			throw new IllegalArgumentException("");
		if (i_127_ > 0 && !Class318.method5691(i_127_, -992251815))
			throw new IllegalArgumentException("");
		int i_128_ = aClass158_5545.anInt1753 * -920065167;
		int i_129_ = 0;
		int i_130_ = i_126_ < i_127_ ? i_126_ : i_127_;
		int i_131_ = i_126_ >> 1;
		int i_132_ = i_127_ >> 1;
		byte[] is_133_ = is;
		byte[] is_134_ = new byte[i_131_ * i_132_ * i_128_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_129_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_126_, i_127_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5121, is_133_, 0);
			if (i_130_ <= 1)
				break;
			int i_135_ = i_126_ * i_128_;
			for (int i_136_ = 0; i_136_ < i_128_; i_136_++) {
				int i_137_ = i_136_;
				int i_138_ = i_136_;
				int i_139_ = i_138_ + i_135_;
				for (int i_140_ = 0; i_140_ < i_132_; i_140_++) {
					for (int i_141_ = 0; i_141_ < i_131_; i_141_++) {
						int i_142_ = is_133_[i_138_];
						i_138_ += i_128_;
						i_142_ += is_133_[i_138_];
						i_138_ += i_128_;
						i_142_ += is_133_[i_139_];
						i_139_ += i_128_;
						i_142_ += is_133_[i_139_];
						i_139_ += i_128_;
						is_134_[i_137_] = (byte) (i_142_ >> 2);
						i_137_ += i_128_;
					}
					i_138_ += i_135_;
					i_139_ += i_135_;
				}
			}
			byte[] is_143_ = is_134_;
			is_134_ = is_133_;
			is_133_ = is_143_;
			i_126_ = i_131_;
			i_127_ = i_132_;
			i_131_ >>= 1;
			i_132_ >>= 1;
			i_130_ >>= 1;
			i_129_++;
		}
	}

	void method8078(int i, int i_144_, int i_145_, byte[] is) {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		if (i_144_ > 0 && !Class318.method5691(i_144_, -908405219))
			throw new IllegalArgumentException("");
		if (i_145_ > 0 && !Class318.method5691(i_145_, -1693711796))
			throw new IllegalArgumentException("");
		int i_146_ = aClass158_5545.anInt1753 * -920065167;
		int i_147_ = 0;
		int i_148_ = i_144_ < i_145_ ? i_144_ : i_145_;
		int i_149_ = i_144_ >> 1;
		int i_150_ = i_145_ >> 1;
		byte[] is_151_ = is;
		byte[] is_152_ = new byte[i_149_ * i_150_ * i_146_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_147_, Class178_Sub2_Sub2.method17902(aClass158_5545, aClass170_5546), i_144_, i_145_, 0, Class178_Sub2_Sub2.method17901(aClass158_5545), 5121, is_151_, 0);
			if (i_148_ <= 1)
				break;
			int i_153_ = i_144_ * i_146_;
			for (int i_154_ = 0; i_154_ < i_146_; i_154_++) {
				int i_155_ = i_154_;
				int i_156_ = i_154_;
				int i_157_ = i_156_ + i_153_;
				for (int i_158_ = 0; i_158_ < i_150_; i_158_++) {
					for (int i_159_ = 0; i_159_ < i_149_; i_159_++) {
						int i_160_ = is_151_[i_156_];
						i_156_ += i_146_;
						i_160_ += is_151_[i_156_];
						i_156_ += i_146_;
						i_160_ += is_151_[i_157_];
						i_157_ += i_146_;
						i_160_ += is_151_[i_157_];
						i_157_ += i_146_;
						is_152_[i_155_] = (byte) (i_160_ >> 2);
						i_155_ += i_146_;
					}
					i_156_ += i_153_;
					i_157_ += i_153_;
				}
			}
			byte[] is_161_ = is_152_;
			is_152_ = is_151_;
			is_151_ = is_161_;
			i_144_ = i_149_;
			i_145_ = i_150_;
			i_149_ >>= 1;
			i_150_ >>= 1;
			i_148_ >>= 1;
			i_147_++;
		}
	}

	public void method131() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.anInt9530 -= method8064();
			int[] is = new int[1];
			is[0] = anInt5542;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5542 = 0;
		}
	}

	int method8079() {
		int i = (aClass158_5545.anInt1753 * -920065167 * (aClass170_5546.anInt1831 * 1602321003) * anInt5549);
		return aBool5547 ? i * 4 / 3 : i;
	}

	int method8080() {
		int i = (aClass158_5545.anInt1753 * -920065167 * (aClass170_5546.anInt1831 * 1602321003) * anInt5549);
		return aBool5547 ? i * 4 / 3 : i;
	}

	public void method331() {
		if (anInt5542 == 0)
			throw new IllegalStateException("");
		int i = aClass178_Sub2_Sub2_5541.method15051();
		int i_162_ = aClass178_Sub2_Sub2_5541.anIntArray11513[i];
		if (i_162_ != anInt5544) {
			if (i_162_ != 0) {
				OpenGL.glBindTexture(i_162_, 0);
				OpenGL.glDisable(i_162_);
			}
			OpenGL.glEnable(anInt5544);
			aClass178_Sub2_Sub2_5541.anIntArray11513[i] = anInt5544;
		}
		OpenGL.glBindTexture(anInt5544, anInt5542);
	}

	void method8081() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.method17897(anInt5542, method8064());
			anInt5542 = 0;
		}
	}

	void method8082() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.method17897(anInt5542, method8064());
			anInt5542 = 0;
		}
	}

	void method8083() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.method17897(anInt5542, method8064());
			anInt5542 = 0;
		}
	}

	void method8084() {
		if (anInt5542 != 0) {
			aClass178_Sub2_Sub2_5541.method17897(anInt5542, method8064());
			anInt5542 = 0;
		}
	}
}
