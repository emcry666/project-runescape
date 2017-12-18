/* Class164_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class164_Sub4 extends Class164 {
	Class126_Sub2_Sub1 aClass126_Sub2_Sub1_9859;
	Class178_Sub1 aClass178_Sub1_9860;
	Class128 aClass128_9861;
	boolean aBool9862;

	void method2616(char c, int i, int i_0_, int i_1_, boolean bool) {
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}

	void method2622(char c, int i, int i_2_, int i_3_, boolean bool) {
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_, (byte) (i_3_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_2_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}

	void method2610(char c, int i, int i_4_, int i_5_, boolean bool, Class145 class145, int i_6_, int i_7_) {
		Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
		Class126_Sub2_Sub1 class126_sub2_sub1 = class145_sub3.aClass126_Sub2_Sub1_9842;
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		aClass178_Sub1_9860.method14673(1);
		aClass178_Sub1_9860.method14711(class126_sub2_sub1);
		aClass178_Sub1_9860.method14676(7681, 8448);
		aClass178_Sub1_9860.method14677(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_8_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_6_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_8_, 0.0F, (float) -i_7_ * f_8_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_5_ >> 16), (byte) (i_5_ >> 8), (byte) i_5_, (byte) (i_5_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_4_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass178_Sub1_9860.method14677(0, 5890, 768);
		aClass178_Sub1_9860.method14676(8448, 8448);
		aClass178_Sub1_9860.method14711(null);
		aClass178_Sub1_9860.method14673(0);
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}

	Class164_Sub4(Class178_Sub1 class178_sub1, Class10 class10, Class175[] class175s, boolean bool) {
		super(class178_sub1, class10);
		aClass178_Sub1_9860 = class178_sub1;
		int i = 0;
		for (int i_9_ = 0; i_9_ < 256; i_9_++) {
			Class175 class175 = class175s[i_9_];
			if (class175.method2945() > i)
				i = class175.method2945();
			if (class175.method2944() > i)
				i = class175.method2944();
		}
		int i_10_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_10_ * i_10_];
			for (int i_11_ = 0; i_11_ < 256; i_11_++) {
				Class175 class175 = class175s[i_11_];
				int i_12_ = class175.method2945();
				int i_13_ = class175.method2944();
				int i_14_ = i_11_ % 16 * i;
				int i_15_ = i_11_ / 16 * i;
				int i_16_ = i_15_ * i_10_ + i_14_;
				int i_17_ = 0;
				if (class175.method2942()) {
					Class175_Sub2 class175_sub2 = (Class175_Sub2) class175s[i_11_];
					if (!class175_sub2.method2943()) {
						byte[] is_18_ = class175_sub2.aByteArray9857;
						for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
							for (int i_20_ = 0; i_20_ < i_13_; i_20_++)
								is[i_16_++] = (byte) (is_18_[i_17_++] == 0 ? 0 : -1);
							i_16_ += i_10_ - i_13_;
						}
					} else {
						byte[] is_21_ = class175_sub2.aByteArray9858;
						for (int i_22_ = 0; i_22_ < i_12_; i_22_++) {
							for (int i_23_ = 0; i_23_ < i_13_; i_23_++)
								is[i_16_++] = is_21_[i_17_++];
							i_16_ += i_10_ - i_13_;
						}
					}
				} else {
					Class175_Sub1 class175_sub1 = (Class175_Sub1) class175s[i_11_];
					int[] is_24_ = class175_sub1.method2959(false);
					if (!class175_sub1.method2943()) {
						for (int i_25_ = 0; i_25_ < i_12_; i_25_++) {
							for (int i_26_ = 0; i_26_ < i_13_; i_26_++) {
								int i_27_ = is_24_[i_17_++];
								byte i_28_ = (byte) (((i_27_ >> 16 & 0xff) * 3 + (i_27_ >> 8 & 0xff) * 4 + (i_27_ & 0xff)) >> 3);
								is[i_16_++] = i_28_;
							}
							i_16_ += i_10_ - i_13_;
						}
					} else {
						for (int i_29_ = 0; i_29_ < i_12_; i_29_++) {
							for (int i_30_ = 0; i_30_ < i_13_; i_30_++)
								is[i_16_++] = (byte) (is_24_[i_17_++] >> 24 & 0xff);
							i_16_ += i_10_ - i_13_;
						}
					}
				}
			}
			aClass126_Sub2_Sub1_9859 = Class126_Sub2_Sub1.method17771(class178_sub1, Class158.aClass158_1747, Class170.aClass170_1822, i_10_, i_10_, false, is, Class158.aClass158_1747);
			aBool9862 = true;
		} else {
			int[] is = new int[i_10_ * i_10_];
			for (int i_31_ = 0; i_31_ < 256; i_31_++) {
				Class175 class175 = class175s[i_31_];
				int i_32_ = class175.method2945();
				int i_33_ = class175.method2944();
				int i_34_ = i_31_ % 16 * i;
				int i_35_ = i_31_ / 16 * i;
				int i_36_ = i_35_ * i_10_ + i_34_;
				int i_37_ = 0;
				if (class175.method2942()) {
					Class175_Sub2 class175_sub2 = (Class175_Sub2) class175s[i_31_];
					int[] is_38_ = class175_sub2.anIntArray9850;
					byte[] is_39_ = class175_sub2.aByteArray9858;
					byte[] is_40_ = class175_sub2.aByteArray9857;
					if (is_39_ != null) {
						for (int i_41_ = 0; i_41_ < i_32_; i_41_++) {
							for (int i_42_ = 0; i_42_ < i_33_; i_42_++) {
								is[i_36_++] = (is_39_[i_37_] << 24 | is_38_[is_40_[i_37_] & 0xff]);
								i_37_++;
							}
							i_36_ += i_10_ - i_33_;
						}
					} else {
						for (int i_43_ = 0; i_43_ < i_32_; i_43_++) {
							for (int i_44_ = 0; i_44_ < i_33_; i_44_++) {
								int i_45_;
								if ((i_45_ = is_40_[i_37_++]) != 0)
									is[i_36_++] = ~0xffffff | is_38_[i_45_ & 0xff];
								else
									i_36_++;
							}
							i_36_ += i_10_ - i_33_;
						}
					}
				} else {
					Class175_Sub1 class175_sub1 = (Class175_Sub1) class175s[i_31_];
					int[] is_46_ = class175_sub1.method2959(false);
					if (!class175_sub1.method2943()) {
						for (int i_47_ = 0; i_47_ < i_32_; i_47_++) {
							for (int i_48_ = 0; i_48_ < i_33_; i_48_++) {
								int i_49_ = is_46_[i_37_] & 0xffffff;
								is[i_36_++] = (i_49_ == 0 ? 0 : 255) << 24 | i_49_;
								i_37_++;
							}
							i_36_ += i_10_ - i_33_;
						}
					} else {
						for (int i_50_ = 0; i_50_ < i_32_; i_50_++) {
							for (int i_51_ = 0; i_51_ < i_33_; i_51_++)
								is[i_36_++] = is_46_[i_37_++];
							i_36_ += i_10_ - i_33_;
						}
					}
				}
			}
			aClass126_Sub2_Sub1_9859 = Class126_Sub2_Sub1.method17776(class178_sub1, i_10_, i_10_, false, is, 0, 0);
			aBool9862 = false;
		}
		aClass126_Sub2_Sub1_9859.method2110(false);
		aClass128_9861 = new Class128(class178_sub1, 256);
		float f = (aClass126_Sub2_Sub1_9859.aFloat11357 / (float) aClass126_Sub2_Sub1_9859.anInt11354);
		float f_52_ = (aClass126_Sub2_Sub1_9859.aFloat11356 / (float) aClass126_Sub2_Sub1_9859.anInt11355);
		for (int i_53_ = 0; i_53_ < 256; i_53_++) {
			Class175 class175 = class175s[i_53_];
			int i_54_ = class175.method2945();
			int i_55_ = class175.method2944();
			int i_56_ = class175.method2948();
			int i_57_ = class175.method2946();
			float f_58_ = (float) (i_53_ % 16 * i);
			float f_59_ = (float) (i_53_ / 16 * i);
			float f_60_ = f_58_ * f;
			float f_61_ = f_59_ * f_52_;
			float f_62_ = (f_58_ + (float) i_55_) * f;
			float f_63_ = (f_59_ + (float) i_54_) * f_52_;
			aClass128_9861.method2256(i_53_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_60_, aClass126_Sub2_Sub1_9859.aFloat11356 - f_61_);
			OpenGL.glVertex2i(i_57_, i_56_);
			OpenGL.glTexCoord2f(f_60_, aClass126_Sub2_Sub1_9859.aFloat11356 - f_63_);
			OpenGL.glVertex2i(i_57_, i_56_ + i_54_);
			OpenGL.glTexCoord2f(f_62_, aClass126_Sub2_Sub1_9859.aFloat11356 - f_63_);
			OpenGL.glVertex2i(i_57_ + i_55_, i_56_ + i_54_);
			OpenGL.glTexCoord2f(f_62_, aClass126_Sub2_Sub1_9859.aFloat11356 - f_61_);
			OpenGL.glVertex2i(i_57_ + i_55_, i_56_);
			OpenGL.glEnd();
			aClass128_9861.method2247();
		}
	}

	void method2612(char c, int i, int i_64_, int i_65_, boolean bool) {
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8), (byte) i_65_, (byte) (i_65_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_64_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}

	void method2626(char c, int i, int i_66_, int i_67_, boolean bool) {
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		OpenGL.glColor4ub((byte) (i_67_ >> 16), (byte) (i_67_ >> 8), (byte) i_67_, (byte) (i_67_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_66_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}

	void method2611(char c, int i, int i_68_, int i_69_, boolean bool) {
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		OpenGL.glColor4ub((byte) (i_69_ >> 16), (byte) (i_69_ >> 8), (byte) i_69_, (byte) (i_69_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_68_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}

	void method2615(char c, int i, int i_70_, int i_71_, boolean bool, Class145 class145, int i_72_, int i_73_) {
		Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
		Class126_Sub2_Sub1 class126_sub2_sub1 = class145_sub3.aClass126_Sub2_Sub1_9842;
		aClass178_Sub1_9860.method14668();
		aClass178_Sub1_9860.method14711(aClass126_Sub2_Sub1_9859);
		if (aBool9862 || bool) {
			aClass178_Sub1_9860.method14676(7681, 8448);
			aClass178_Sub1_9860.method14677(0, 34168, 768);
		} else
			aClass178_Sub1_9860.method14676(7681, 7681);
		aClass178_Sub1_9860.method14673(1);
		aClass178_Sub1_9860.method14711(class126_sub2_sub1);
		aClass178_Sub1_9860.method14676(7681, 8448);
		aClass178_Sub1_9860.method14677(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_74_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_72_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_74_, 0.0F, (float) -i_73_ * f_74_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_71_ >> 16), (byte) (i_71_ >> 8), (byte) i_71_, (byte) (i_71_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_70_, 0.0F);
		aClass128_9861.method2248(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass178_Sub1_9860.method14677(0, 5890, 768);
		aClass178_Sub1_9860.method14676(8448, 8448);
		aClass178_Sub1_9860.method14711(null);
		aClass178_Sub1_9860.method14673(0);
		if (aBool9862 || bool)
			aClass178_Sub1_9860.method14677(0, 5890, 768);
	}
}
