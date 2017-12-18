/* Class117_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub1 extends Class117 {
	static final char aChar8870 = '\001';
	static final int anInt8871 = 5;
	static final int anInt8872 = 128;
	static final int anInt8873 = 128;
	static final float aFloat8874 = 26.0F;
	static final int anInt8875 = 24;
	static final float aFloat8876 = 0.0F;
	static final float aFloat8877 = -12.0F;
	boolean aBool8878;
	Class128 aClass128_8879;
	static final char aChar8880 = '\0';
	boolean aBool8881 = false;
	Class126_Sub1[] aClass126_Sub1Array8882;

	void method2019(boolean bool) {
		if (aClass128_8879 != null && bool) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14673(0);
			}
			aClass128_8879.method2248('\0');
			aBool8881 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2013(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method14335() {
		aClass128_8879 = new Class128(aClass178_Sub1_1434, 2);
		aClass128_8879.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (!aBool8878) {
			aClass178_Sub1_1434.method14676(7681, 8448);
			aClass178_Sub1_1434.method14677(0, 34168, 768);
			aClass178_Sub1_1434.method14673(2);
			aClass178_Sub1_1434.method14676(260, 7681);
			aClass178_Sub1_1434.method14677(0, 34168, 768);
			aClass178_Sub1_1434.method14677(1, 34168, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
		} else {
			aClass178_Sub1_1434.method14676(260, 7681);
			aClass178_Sub1_1434.method14677(0, 5890, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
		}
		aClass178_Sub1_1434.method14673(0);
		aClass128_8879.method2247();
		aClass128_8879.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!aBool8878) {
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14673(2);
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14677(1, 34168, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		} else {
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		}
		aClass178_Sub1_1434.method14673(0);
		aClass128_8879.method2247();
	}

	void method2026(boolean bool) {
		if (aClass128_8879 != null && bool) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14673(0);
			}
			aClass128_8879.method2248('\0');
			aBool8881 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2011(boolean bool) {
		aClass178_Sub1_1434.method14676(8448, 7681);
	}

	void method2020(boolean bool) {
		aClass178_Sub1_1434.method14676(8448, 7681);
	}

	void method2010(int i, int i_0_) {
		if (aBool8881) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass126_Sub1Array8882[i - 1]);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	boolean method2016() {
		return true;
	}

	void method2008(boolean bool) {
		aClass178_Sub1_1434.method14676(8448, 7681);
	}

	boolean method2022() {
		return true;
	}

	Class117_Sub1(Class178_Sub1 class178_sub1) {
		super(class178_sub1);
		if (class178_sub1.aBool9407) {
			byte[][] is = new byte[6][16384];
			byte[][] is_1_ = new byte[6][16384];
			byte[][] is_2_ = new byte[6][16384];
			int i = 0;
			Class437 class437 = new Class437(0.0F, -1.0F, 0.0F);
			for (int i_3_ = 0; i_3_ < 128; i_3_++) {
				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					float f = 2.0F * (float) i_4_ / 128.0F - 1.0F;
					float f_5_ = 2.0F * (float) i_3_ / 128.0F - 1.0F;
					float f_6_ = (float) (1.0 / Math.sqrt((double) (f * f + 1.0F + f_5_ * f_5_)));
					f *= f_6_;
					f_5_ *= f_6_;
					for (int i_7_ = 0; i_7_ < 6; i_7_++) {
						Class437 class437_8_;
						if (i_7_ == 0)
							class437_8_ = new Class437(-f_6_, -f, f_5_);
						else if (i_7_ == 1)
							class437_8_ = new Class437(f_6_, f, f_5_);
						else if (i_7_ == 2)
							class437_8_ = new Class437(-f, f_5_, -f_6_);
						else if (i_7_ == 3)
							class437_8_ = new Class437(-f, -f_5_, f_6_);
						else if (i_7_ == 4)
							class437_8_ = new Class437(f, f_6_, -f_5_);
						else
							class437_8_ = new Class437(f, -f_6_, f_5_);
						float f_9_ = class437_8_.method6895(class437);
						f_9_ = Math.max(0.0F, Math.min(1.0F, f_9_));
						int i_10_;
						int i_11_;
						int i_12_;
						if (f_9_ > 0.0F) {
							i_12_ = Math.min(255, (int) (Math.pow((double) f_9_, 128.0) * 400.0));
							i_11_ = Math.min(255, (int) (Math.pow((double) f_9_, 24.0) * 400.0));
							i_10_ = Math.min(255, (int) (Math.pow((double) f_9_, 5.0) * 400.0));
						} else {
							i_10_ = 0;
							i_11_ = 0;
							i_12_ = 0;
						}
						is_1_[i_7_][i] = (byte) i_12_;
						is_2_[i_7_][i] = (byte) i_11_;
						is[i_7_][i] = (byte) i_10_;
					}
					i++;
				}
			}
			aClass126_Sub1Array8882 = new Class126_Sub1[3];
			aClass126_Sub1Array8882[0] = new Class126_Sub1(aClass178_Sub1_1434, Class158.aClass158_1747, Class170.aClass170_1822, 128, false, is_1_, Class158.aClass158_1747);
			aClass126_Sub1Array8882[1] = new Class126_Sub1(aClass178_Sub1_1434, Class158.aClass158_1747, Class170.aClass170_1822, 128, false, is_2_, Class158.aClass158_1747);
			aClass126_Sub1Array8882[2] = new Class126_Sub1(aClass178_Sub1_1434, Class158.aClass158_1747, Class170.aClass170_1822, 128, false, is, Class158.aClass158_1747);
			method14335();
		}
	}

	void method2017(boolean bool) {
		if (aClass128_8879 != null && bool) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14673(0);
			}
			aClass128_8879.method2248('\0');
			aBool8881 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2018(boolean bool) {
		if (aClass128_8879 != null && bool) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14673(0);
			}
			aClass128_8879.method2248('\0');
			aBool8881 = true;
		} else
			aClass178_Sub1_1434.method14678(0, 34168, 770);
	}

	void method2023(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	boolean method2009() {
		return true;
	}

	void method2028() {
		if (aBool8881) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(null);
			}
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass128_8879.method2248('\001');
			aBool8881 = false;
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
	}

	void method2015() {
		if (aBool8881) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(null);
			}
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass128_8879.method2248('\001');
			aBool8881 = false;
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
	}

	void method2012() {
		if (aBool8881) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(null);
			}
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass128_8879.method2248('\001');
			aBool8881 = false;
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
	}

	void method2024() {
		if (aBool8881) {
			if (!aBool8878) {
				aClass178_Sub1_1434.method14673(2);
				aClass178_Sub1_1434.method14711(null);
			}
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			aClass128_8879.method2248('\001');
			aBool8881 = false;
		} else
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14676(8448, 8448);
	}

	void method2025(int i, int i_13_) {
		if (aBool8881) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass126_Sub1Array8882[i - 1]);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2021(int i, int i_14_) {
		if (aBool8881) {
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(aClass126_Sub1Array8882[i - 1]);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2027(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	boolean method2014() {
		return true;
	}

	void method14336() {
		aClass128_8879 = new Class128(aClass178_Sub1_1434, 2);
		aClass128_8879.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (!aBool8878) {
			aClass178_Sub1_1434.method14676(7681, 8448);
			aClass178_Sub1_1434.method14677(0, 34168, 768);
			aClass178_Sub1_1434.method14673(2);
			aClass178_Sub1_1434.method14676(260, 7681);
			aClass178_Sub1_1434.method14677(0, 34168, 768);
			aClass178_Sub1_1434.method14677(1, 34168, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
		} else {
			aClass178_Sub1_1434.method14676(260, 7681);
			aClass178_Sub1_1434.method14677(0, 5890, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
		}
		aClass178_Sub1_1434.method14673(0);
		aClass128_8879.method2247();
		aClass128_8879.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!aBool8878) {
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14673(2);
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14677(1, 34168, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		} else {
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		}
		aClass178_Sub1_1434.method14673(0);
		aClass128_8879.method2247();
	}

	void method14337() {
		aClass128_8879 = new Class128(aClass178_Sub1_1434, 2);
		aClass128_8879.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (!aBool8878) {
			aClass178_Sub1_1434.method14676(7681, 8448);
			aClass178_Sub1_1434.method14677(0, 34168, 768);
			aClass178_Sub1_1434.method14673(2);
			aClass178_Sub1_1434.method14676(260, 7681);
			aClass178_Sub1_1434.method14677(0, 34168, 768);
			aClass178_Sub1_1434.method14677(1, 34168, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
		} else {
			aClass178_Sub1_1434.method14676(260, 7681);
			aClass178_Sub1_1434.method14677(0, 5890, 770);
			aClass178_Sub1_1434.method14678(0, 34167, 770);
		}
		aClass178_Sub1_1434.method14673(0);
		aClass128_8879.method2247();
		aClass128_8879.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!aBool8878) {
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14673(2);
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14677(1, 34168, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		} else {
			aClass178_Sub1_1434.method14676(8448, 8448);
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
		}
		aClass178_Sub1_1434.method14673(0);
		aClass128_8879.method2247();
	}
}
