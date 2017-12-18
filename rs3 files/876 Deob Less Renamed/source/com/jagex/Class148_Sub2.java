/* Class148_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class148_Sub2 extends Class148 {
	boolean aBool9140;
	Class178_Sub1 aClass178_Sub1_9141;
	Class126_Sub2_Sub1 aClass126_Sub2_Sub1_9142;
	int anInt9143 = 0;
	Class126_Sub2_Sub1 aClass126_Sub2_Sub1_9144;
	int anInt9145;
	int anInt9146;
	int anInt9147;
	int anInt9148;

	void method14533() {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14676(8448, 8448);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
		aClass178_Sub1_9141.method14678(0, 5890, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
	}

	Class148_Sub2(Class178_Sub1 class178_sub1, int i, int i_0_, int i_1_, int i_2_) {
		aBool9140 = false;
		anInt9146 = 0;
		anInt9145 = 0;
		anInt9147 = 0;
		anInt9148 = 0;
		aClass178_Sub1_9141 = class178_sub1;
		aClass126_Sub2_Sub1_9144 = Class126_Sub2_Sub1.method17772(class178_sub1, i, i_0_, i_1_, i_2_);
	}

	public void method2442(int[] is) {
		is[0] = anInt9145;
		is[1] = anInt9146;
		is[2] = anInt9148;
		is[3] = anInt9147;
	}

	public void method2426(int i, int i_3_, int i_4_, int i_5_) {
		anInt9145 = i;
		anInt9146 = i_3_;
		anInt9148 = i_4_;
		anInt9147 = i_5_;
		aBool9140 = (anInt9145 != 0 || anInt9146 != 0 || anInt9148 != 0 || anInt9147 != 0);
	}

	public Interface22 method2470() {
		return aClass126_Sub2_Sub1_9144.method14378(0);
	}

	public int method2504() {
		return aClass126_Sub2_Sub1_9144.anInt11354;
	}

	public int method38() {
		return aClass126_Sub2_Sub1_9144.anInt11354 + anInt9145 + anInt9148;
	}

	public int method2428() {
		return aClass126_Sub2_Sub1_9144.anInt11355;
	}

	public int method2429() {
		return aClass126_Sub2_Sub1_9144.anInt11355 + anInt9146 + anInt9147;
	}

	public Interface22 method2430() {
		return aClass126_Sub2_Sub1_9144.method14378(0);
	}

	public void method2433(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		method14534(i, i_6_, i_7_, i_8_, i_9_, i_10_, false);
	}

	void method14534(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool) {
		if (aClass178_Sub1_9141.aBool9318 && !bool) {
			int[] is = aClass178_Sub1_9141.method3293(i_14_, i_15_, i_12_, i_13_);
			if (is != null) {
				for (int i_16_ = 0; i_16_ < is.length; i_16_++)
					is[i_16_] |= ~0xffffff;
				method2431(i, i_11_, i_12_, i_13_, is, 0, i_12_);
			}
		} else
			aClass126_Sub2_Sub1_9144.method14365(i, i_11_, i_12_, i_13_, i_14_, i_15_);
	}

	public void method2434(int i, int i_17_, int i_18_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass126_Sub2_Sub1_9142 = Class126_Sub2_Sub1.method17772(aClass178_Sub1_9141, i, i_17_, (aClass126_Sub2_Sub1_9144.anInt11354), (aClass126_Sub2_Sub1_9144.anInt11355));
		anInt9143 = i_18_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method2464(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		int i_25_ = i + i_20_;
		int i_26_ = i_19_ + i_21_;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14687(i_24_);
		aClass178_Sub1_9141.method14785(i_22_);
		OpenGL.glColor4ub((byte) (i_23_ >> 16), (byte) (i_23_ >> 8), (byte) i_23_, (byte) (i_23_ >> 24));
		if (aClass126_Sub2_Sub1_9144.aBool11359 && !aBool9140 && i_21_ >= aClass126_Sub2_Sub1_9144.anInt11355 && i_20_ >= aClass126_Sub2_Sub1_9144.anInt11354) {
			float f = (aClass126_Sub2_Sub1_9144.aFloat11356 * (float) i_21_ / (float) aClass126_Sub2_Sub1_9144.anInt11355);
			float f_27_ = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) i_20_ / (float) aClass126_Sub2_Sub1_9144.anInt11354);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_19_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_26_);
			OpenGL.glTexCoord2f(f_27_, 0.0F);
			OpenGL.glVertex2i(i_25_, i_26_);
			OpenGL.glTexCoord2f(f_27_, f);
			OpenGL.glVertex2i(i_25_, i_19_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9145, (float) anInt9146, 0.0F);
			int i_28_ = method38();
			int i_29_ = method2429();
			int i_30_ = i_19_ + aClass126_Sub2_Sub1_9144.anInt11355;
			OpenGL.glBegin(7);
			int i_31_ = i_19_;
			for (/**/; i_30_ <= i_26_; i_30_ += i_29_) {
				int i_32_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
				int i_33_ = i;
				while (i_32_ <= i_25_) {
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_33_, i_31_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_33_, i_30_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
					OpenGL.glVertex2i(i_32_, i_30_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_32_, i_31_);
					i_32_ += i_28_;
					i_33_ += i_28_;
				}
				if (i_33_ < i_25_) {
					float f = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) (i_25_ - i_33_) / (float) aClass126_Sub2_Sub1_9144.anInt11354);
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_33_, i_31_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_33_, i_30_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_25_, i_30_);
					OpenGL.glTexCoord2f(f, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_25_, i_31_);
				}
				i_31_ += i_29_;
			}
			if (i_31_ < i_26_) {
				float f = (aClass126_Sub2_Sub1_9144.aFloat11356 * (float) (aClass126_Sub2_Sub1_9144.anInt11355 - (i_26_ - i_31_)) / (float) aClass126_Sub2_Sub1_9144.anInt11355);
				int i_34_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
				int i_35_ = i;
				while (i_34_ <= i_25_) {
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_35_, i_31_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_35_, i_26_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, f);
					OpenGL.glVertex2i(i_34_, i_26_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_34_, i_31_);
					i_34_ += i_28_;
					i_35_ += i_28_;
				}
				if (i_35_ < i_25_) {
					float f_36_ = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) (i_25_ - i_35_) / (float) aClass126_Sub2_Sub1_9144.anInt11354);
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_35_, i_31_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_35_, i_26_);
					OpenGL.glTexCoord2f(f_36_, f);
					OpenGL.glVertex2i(i_25_, i_26_);
					OpenGL.glTexCoord2f(f_36_, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_25_, i_31_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method2466(int i, int i_37_, Class145 class145, int i_38_, int i_39_) {
		Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
		Class126_Sub2_Sub1 class126_sub2_sub1 = class145_sub3.aClass126_Sub2_Sub1_9842;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		i += anInt9145;
		i_37_ += anInt9146;
		int i_40_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
		int i_41_ = i_37_ + aClass126_Sub2_Sub1_9144.anInt11355;
		float f = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_42_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		float f_43_ = (float) (i - i_38_) * f;
		float f_44_ = (float) (i_40_ - i_38_) * f;
		float f_45_ = class126_sub2_sub1.aFloat11356 - (float) (i_37_ - i_39_) * f_42_;
		float f_46_ = class126_sub2_sub1.aFloat11356 - (float) (i_41_ - i_39_) * f_42_;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_43_, f_45_);
		OpenGL.glVertex2i(i, i_37_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_43_, f_46_);
		OpenGL.glVertex2i(i, i_37_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_44_, f_46_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_37_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_44_, f_45_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_37_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	void method14535(int i) {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14676(aClass178_Sub1_9141.method14675(i), 7681);
		aClass178_Sub1_9141.method14677(1, 34167, 768);
		aClass178_Sub1_9141.method14678(0, 34168, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9142);
		aClass178_Sub1_9141.method14676(34479, 7681);
		aClass178_Sub1_9141.method14677(1, 34166, 768);
		if (anInt9143 == 0)
			aClass178_Sub1_9141.method14857(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9143 == 1)
			aClass178_Sub1_9141.method14857(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9143 == 2)
			aClass178_Sub1_9141.method14857(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9143 == 3)
			aClass178_Sub1_9141.method14857(128.5F, 128.5F, 128.5F, 0.0F);
	}

	public int method2477() {
		return aClass126_Sub2_Sub1_9144.anInt11354;
	}

	public void method2436(int i, int i_47_, int i_48_, int i_49_, int i_50_) {
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14687(i_50_);
		OpenGL.glColor4ub((byte) (i_49_ >> 16), (byte) (i_49_ >> 8), (byte) i_49_, (byte) (i_49_ >> 24));
		i += anInt9145;
		i_47_ += anInt9146;
		if (aClass126_Sub2_Sub1_9142 == null) {
			aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
			aClass178_Sub1_9141.method14785(i_48_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_47_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_47_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_47_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_47_);
			OpenGL.glEnd();
		} else {
			method14535(i_48_);
			aClass126_Sub2_Sub1_9142.method2110(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_47_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_47_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_47_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_47_);
			OpenGL.glEnd();
			method14533();
		}
	}

	public void method2482(int i, int i_51_, Class145 class145, int i_52_, int i_53_) {
		Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
		Class126_Sub2_Sub1 class126_sub2_sub1 = class145_sub3.aClass126_Sub2_Sub1_9842;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		i += anInt9145;
		i_51_ += anInt9146;
		int i_54_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
		int i_55_ = i_51_ + aClass126_Sub2_Sub1_9144.anInt11355;
		float f = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_56_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		float f_57_ = (float) (i - i_52_) * f;
		float f_58_ = (float) (i_54_ - i_52_) * f;
		float f_59_ = class126_sub2_sub1.aFloat11356 - (float) (i_51_ - i_53_) * f_56_;
		float f_60_ = class126_sub2_sub1.aFloat11356 - (float) (i_55_ - i_53_) * f_56_;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_57_, f_59_);
		OpenGL.glVertex2i(i, i_51_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_57_, f_60_);
		OpenGL.glVertex2i(i, i_51_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_58_, f_60_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_51_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_58_, f_59_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_51_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	void method2461(int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		aClass126_Sub2_Sub1_9144.method2110((i_67_ & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14687(i_66_);
		OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8), (byte) i_65_, (byte) (i_65_ >> 24));
		if (aBool9140) {
			float f = (float) i_62_ / (float) method38();
			float f_68_ = (float) i_63_ / (float) method2429();
			float f_69_ = (float) i + (float) anInt9145 * f;
			float f_70_ = (float) i_61_ + (float) anInt9146 * f_68_;
			float f_71_ = f_69_ + (float) aClass126_Sub2_Sub1_9144.anInt11354 * f;
			float f_72_ = f_70_ + (float) aClass126_Sub2_Sub1_9144.anInt11355 * f_68_;
			if (aClass126_Sub2_Sub1_9142 == null) {
				aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
				aClass178_Sub1_9141.method14785(i_64_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_69_, f_70_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_69_, f_72_);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
				OpenGL.glVertex2f(f_71_, f_72_);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_71_, f_70_);
				OpenGL.glEnd();
			} else {
				method14535(i_64_);
				aClass126_Sub2_Sub1_9142.method2110(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_69_, f_70_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_69_, f_72_);
				OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
				OpenGL.glVertex2f(f_71_, f_72_);
				OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_71_, f_70_);
				OpenGL.glEnd();
				method14533();
			}
		} else if (aClass126_Sub2_Sub1_9142 == null) {
			aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
			aClass178_Sub1_9141.method14785(i_64_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_61_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_61_ + i_63_);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + i_62_, i_61_ + i_63_);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + i_62_, i_61_);
			OpenGL.glEnd();
		} else {
			method14535(i_64_);
			aClass126_Sub2_Sub1_9142.method2110(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_61_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_61_ + i_63_);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + i_62_, i_61_ + i_63_);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + i_62_, i_61_);
			OpenGL.glEnd();
			method14533();
		}
	}

	public void method2425(int[] is) {
		is[0] = anInt9145;
		is[1] = anInt9146;
		is[2] = anInt9148;
		is[3] = anInt9147;
	}

	public void method2431(int i, int i_73_, int i_74_, int i_75_, int[] is, int i_76_, int i_77_) {
		aClass126_Sub2_Sub1_9144.method14360(i, i_73_, i_74_, i_75_, is, i_76_, i_77_, true);
	}

	void method2475(float f, float f_78_, float f_79_, float f_80_, float f_81_, float f_82_, int i, Class145 class145, int i_83_, int i_84_) {
		Class126_Sub2_Sub1 class126_sub2_sub1 = ((Class145_Sub3) class145).aClass126_Sub2_Sub1_9842;
		if (aBool9140) {
			float f_85_ = (float) method38();
			float f_86_ = (float) method2429();
			float f_87_ = (f_79_ - f) / f_85_;
			float f_88_ = (f_80_ - f_78_) / f_85_;
			float f_89_ = (f_81_ - f) / f_86_;
			float f_90_ = (f_82_ - f_78_) / f_86_;
			float f_91_ = f_89_ * (float) anInt9146;
			float f_92_ = f_90_ * (float) anInt9146;
			float f_93_ = f_87_ * (float) anInt9145;
			float f_94_ = f_88_ * (float) anInt9145;
			float f_95_ = -f_87_ * (float) anInt9148;
			float f_96_ = -f_88_ * (float) anInt9148;
			float f_97_ = -f_89_ * (float) anInt9147;
			float f_98_ = -f_90_ * (float) anInt9147;
			f = f + f_93_ + f_91_;
			f_78_ = f_78_ + f_94_ + f_92_;
			f_79_ = f_79_ + f_95_ + f_91_;
			f_80_ = f_80_ + f_96_ + f_92_;
			f_81_ = f_81_ + f_93_ + f_97_;
			f_82_ = f_82_ + f_94_ + f_98_;
		}
		float f_99_ = f_81_ + (f_79_ - f);
		float f_100_ = f_80_ + (f_82_ - f_78_);
		aClass126_Sub2_Sub1_9144.method2110((i & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		float f_101_ = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_102_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_101_ * (f - (float) i_83_), (class126_sub2_sub1.aFloat11356 - f_102_ * (f_78_ - (float) i_84_)));
		OpenGL.glVertex2f(f, f_78_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_101_ * (f_81_ - (float) i_83_), (class126_sub2_sub1.aFloat11356 - f_102_ * (f_82_ - (float) i_84_)));
		OpenGL.glVertex2f(f_81_, f_82_);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_101_ * (f_99_ - (float) i_83_), (class126_sub2_sub1.aFloat11356 - f_102_ * (f_100_ - (float) i_84_)));
		OpenGL.glVertex2f(f_99_, f_100_);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_101_ * (f_79_ - (float) i_83_), (class126_sub2_sub1.aFloat11356 - f_102_ * (f_80_ - (float) i_84_)));
		OpenGL.glVertex2f(f_79_, f_80_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	public void method2452(int i, int i_103_, int i_104_, int i_105_, int[] is, int i_106_, int i_107_) {
		aClass126_Sub2_Sub1_9144.method14360(i, i_103_, i_104_, i_105_, is, i_106_, i_107_, true);
	}

	public void method2506(int i, int i_108_, int i_109_, int i_110_, int[] is, int i_111_, int i_112_) {
		aClass126_Sub2_Sub1_9144.method14360(i, i_108_, i_109_, i_110_, is, i_111_, i_112_, true);
	}

	public void method2454(int i, int i_113_, int i_114_, int i_115_, int[] is, int i_116_, int i_117_) {
		aClass126_Sub2_Sub1_9144.method14360(i, i_113_, i_114_, i_115_, is, i_116_, i_117_, true);
	}

	public void method2437(int i, int i_118_, int i_119_, int i_120_, int[] is, int i_121_, int i_122_) {
		aClass126_Sub2_Sub1_9144.method14360(i, i_118_, i_119_, i_120_, is, i_121_, i_122_, true);
	}

	public void method2441(int i, int i_123_, int i_124_, int i_125_, int[] is, int[] is_126_, int i_127_, int i_128_) {
		aClass126_Sub2_Sub1_9144.method14366(i, i_123_, i_124_, i_125_, is, is_126_, i_127_);
	}

	public void method2457(int i, int i_129_, int i_130_, int i_131_) {
		anInt9145 = i;
		anInt9146 = i_129_;
		anInt9148 = i_130_;
		anInt9147 = i_131_;
		aBool9140 = (anInt9145 != 0 || anInt9146 != 0 || anInt9148 != 0 || anInt9147 != 0);
	}

	public void method2424(int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_) {
		int i_138_ = i + i_133_;
		int i_139_ = i_132_ + i_134_;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14687(i_137_);
		aClass178_Sub1_9141.method14785(i_135_);
		OpenGL.glColor4ub((byte) (i_136_ >> 16), (byte) (i_136_ >> 8), (byte) i_136_, (byte) (i_136_ >> 24));
		if (aClass126_Sub2_Sub1_9144.aBool11359 && !aBool9140 && i_134_ >= aClass126_Sub2_Sub1_9144.anInt11355 && i_133_ >= aClass126_Sub2_Sub1_9144.anInt11354) {
			float f = (aClass126_Sub2_Sub1_9144.aFloat11356 * (float) i_134_ / (float) aClass126_Sub2_Sub1_9144.anInt11355);
			float f_140_ = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) i_133_ / (float) aClass126_Sub2_Sub1_9144.anInt11354);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_132_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_139_);
			OpenGL.glTexCoord2f(f_140_, 0.0F);
			OpenGL.glVertex2i(i_138_, i_139_);
			OpenGL.glTexCoord2f(f_140_, f);
			OpenGL.glVertex2i(i_138_, i_132_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9145, (float) anInt9146, 0.0F);
			int i_141_ = method38();
			int i_142_ = method2429();
			int i_143_ = i_132_ + aClass126_Sub2_Sub1_9144.anInt11355;
			OpenGL.glBegin(7);
			int i_144_ = i_132_;
			for (/**/; i_143_ <= i_139_; i_143_ += i_142_) {
				int i_145_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
				int i_146_ = i;
				while (i_145_ <= i_138_) {
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_146_, i_144_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_146_, i_143_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
					OpenGL.glVertex2i(i_145_, i_143_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_145_, i_144_);
					i_145_ += i_141_;
					i_146_ += i_141_;
				}
				if (i_146_ < i_138_) {
					float f = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) (i_138_ - i_146_) / (float) aClass126_Sub2_Sub1_9144.anInt11354);
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_146_, i_144_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_146_, i_143_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_138_, i_143_);
					OpenGL.glTexCoord2f(f, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_138_, i_144_);
				}
				i_144_ += i_142_;
			}
			if (i_144_ < i_139_) {
				float f = (aClass126_Sub2_Sub1_9144.aFloat11356 * (float) (aClass126_Sub2_Sub1_9144.anInt11355 - (i_139_ - i_144_)) / (float) aClass126_Sub2_Sub1_9144.anInt11355);
				int i_147_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
				int i_148_ = i;
				while (i_147_ <= i_138_) {
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_148_, i_144_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_148_, i_139_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, f);
					OpenGL.glVertex2i(i_147_, i_139_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_147_, i_144_);
					i_147_ += i_141_;
					i_148_ += i_141_;
				}
				if (i_148_ < i_138_) {
					float f_149_ = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) (i_138_ - i_148_) / (float) aClass126_Sub2_Sub1_9144.anInt11354);
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_148_, i_144_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_148_, i_139_);
					OpenGL.glTexCoord2f(f_149_, f);
					OpenGL.glVertex2i(i_138_, i_139_);
					OpenGL.glTexCoord2f(f_149_, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_138_, i_144_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method2459(int i, int i_150_, int i_151_, int i_152_, int[] is, int[] is_153_, int i_154_, int i_155_) {
		aClass126_Sub2_Sub1_9144.method14366(i, i_150_, i_151_, i_152_, is, is_153_, i_154_);
	}

	public void method2432(int i, int i_156_, int i_157_, int i_158_, int[] is, int[] is_159_, int i_160_, int i_161_) {
		aClass126_Sub2_Sub1_9144.method14366(i, i_156_, i_157_, i_158_, is, is_159_, i_160_);
	}

	public int method39() {
		return aClass126_Sub2_Sub1_9144.anInt11354 + anInt9145 + anInt9148;
	}

	public Interface22 method2471() {
		return aClass126_Sub2_Sub1_9144.method14378(0);
	}

	public void method2463(int i, int i_162_, int i_163_, int i_164_, int i_165_) {
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14687(i_165_);
		OpenGL.glColor4ub((byte) (i_164_ >> 16), (byte) (i_164_ >> 8), (byte) i_164_, (byte) (i_164_ >> 24));
		i += anInt9145;
		i_162_ += anInt9146;
		if (aClass126_Sub2_Sub1_9142 == null) {
			aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
			aClass178_Sub1_9141.method14785(i_163_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_162_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_162_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_162_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_162_);
			OpenGL.glEnd();
		} else {
			method14535(i_163_);
			aClass126_Sub2_Sub1_9142.method2110(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_162_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_162_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_162_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_162_);
			OpenGL.glEnd();
			method14533();
		}
	}

	public void method2486(int i, int i_166_, int i_167_, int i_168_, int i_169_) {
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14687(i_169_);
		OpenGL.glColor4ub((byte) (i_168_ >> 16), (byte) (i_168_ >> 8), (byte) i_168_, (byte) (i_168_ >> 24));
		i += anInt9145;
		i_166_ += anInt9146;
		if (aClass126_Sub2_Sub1_9142 == null) {
			aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
			aClass178_Sub1_9141.method14785(i_167_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_166_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_166_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_166_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_166_);
			OpenGL.glEnd();
		} else {
			method14535(i_167_);
			aClass126_Sub2_Sub1_9142.method2110(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_166_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_166_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_166_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_166_);
			OpenGL.glEnd();
			method14533();
		}
	}

	public void method2493(int i, int i_170_, int i_171_, int i_172_, int i_173_) {
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14687(i_173_);
		OpenGL.glColor4ub((byte) (i_172_ >> 16), (byte) (i_172_ >> 8), (byte) i_172_, (byte) (i_172_ >> 24));
		i += anInt9145;
		i_170_ += anInt9146;
		if (aClass126_Sub2_Sub1_9142 == null) {
			aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
			aClass178_Sub1_9141.method14785(i_171_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_170_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_170_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_170_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_170_);
			OpenGL.glEnd();
		} else {
			method14535(i_171_);
			aClass126_Sub2_Sub1_9142.method2110(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_170_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_170_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_170_ + aClass126_Sub2_Sub1_9144.anInt11355);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_170_);
			OpenGL.glEnd();
			method14533();
		}
	}

	public void method2483(int i, int i_174_, int i_175_, int i_176_, int[] is, int i_177_, int i_178_) {
		aClass126_Sub2_Sub1_9144.method14360(i, i_174_, i_175_, i_176_, is, i_177_, i_178_, true);
	}

	void method2427(float f, float f_179_, float f_180_, float f_181_, float f_182_, float f_183_, int i, int i_184_, int i_185_, int i_186_) {
		if (aBool9140) {
			float f_187_ = (float) method38();
			float f_188_ = (float) method2429();
			float f_189_ = (f_180_ - f) / f_187_;
			float f_190_ = (f_181_ - f_179_) / f_187_;
			float f_191_ = (f_182_ - f) / f_188_;
			float f_192_ = (f_183_ - f_179_) / f_188_;
			float f_193_ = f_191_ * (float) anInt9146;
			float f_194_ = f_192_ * (float) anInt9146;
			float f_195_ = f_189_ * (float) anInt9145;
			float f_196_ = f_190_ * (float) anInt9145;
			float f_197_ = -f_189_ * (float) anInt9148;
			float f_198_ = -f_190_ * (float) anInt9148;
			float f_199_ = -f_191_ * (float) anInt9147;
			float f_200_ = -f_192_ * (float) anInt9147;
			f = f + f_195_ + f_193_;
			f_179_ = f_179_ + f_196_ + f_194_;
			f_180_ = f_180_ + f_197_ + f_193_;
			f_181_ = f_181_ + f_198_ + f_194_;
			f_182_ = f_182_ + f_195_ + f_199_;
			f_183_ = f_183_ + f_196_ + f_200_;
		}
		float f_201_ = f_182_ + (f_180_ - f);
		float f_202_ = f_181_ + (f_183_ - f_179_);
		aClass126_Sub2_Sub1_9144.method2110((i_186_ & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14687(i_185_);
		aClass178_Sub1_9141.method14785(i);
		OpenGL.glColor4ub((byte) (i_184_ >> 16), (byte) (i_184_ >> 8), (byte) i_184_, (byte) (i_184_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glVertex2f(f, f_179_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_182_, f_183_);
		OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glVertex2f(f_201_, f_202_);
		OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glVertex2f(f_180_, f_181_);
		OpenGL.glEnd();
	}

	public void method2488(int i, int i_203_, Class145 class145, int i_204_, int i_205_) {
		Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
		Class126_Sub2_Sub1 class126_sub2_sub1 = class145_sub3.aClass126_Sub2_Sub1_9842;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		i += anInt9145;
		i_203_ += anInt9146;
		int i_206_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
		int i_207_ = i_203_ + aClass126_Sub2_Sub1_9144.anInt11355;
		float f = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_208_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		float f_209_ = (float) (i - i_204_) * f;
		float f_210_ = (float) (i_206_ - i_204_) * f;
		float f_211_ = (class126_sub2_sub1.aFloat11356 - (float) (i_203_ - i_205_) * f_208_);
		float f_212_ = (class126_sub2_sub1.aFloat11356 - (float) (i_207_ - i_205_) * f_208_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_209_, f_211_);
		OpenGL.glVertex2i(i, i_203_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_209_, f_212_);
		OpenGL.glVertex2i(i, i_203_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_210_, f_212_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_203_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_210_, f_211_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_203_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	public int method2485() {
		return aClass126_Sub2_Sub1_9144.anInt11355;
	}

	public void method2456(int i, int i_213_, int i_214_, int i_215_, int[] is, int[] is_216_, int i_217_, int i_218_) {
		aClass126_Sub2_Sub1_9144.method14366(i, i_213_, i_214_, i_215_, is, is_216_, i_217_);
	}

	public void method2467(int i, int i_219_, Class145 class145, int i_220_, int i_221_) {
		Class145_Sub3 class145_sub3 = (Class145_Sub3) class145;
		Class126_Sub2_Sub1 class126_sub2_sub1 = class145_sub3.aClass126_Sub2_Sub1_9842;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		i += anInt9145;
		i_219_ += anInt9146;
		int i_222_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
		int i_223_ = i_219_ + aClass126_Sub2_Sub1_9144.anInt11355;
		float f = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_224_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		float f_225_ = (float) (i - i_220_) * f;
		float f_226_ = (float) (i_222_ - i_220_) * f;
		float f_227_ = (class126_sub2_sub1.aFloat11356 - (float) (i_219_ - i_221_) * f_224_);
		float f_228_ = (class126_sub2_sub1.aFloat11356 - (float) (i_223_ - i_221_) * f_224_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_225_, f_227_);
		OpenGL.glVertex2i(i, i_219_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_225_, f_228_);
		OpenGL.glVertex2i(i, i_219_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_226_, f_228_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_219_ + aClass126_Sub2_Sub1_9144.anInt11355);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_226_, f_227_);
		OpenGL.glVertex2i(i + aClass126_Sub2_Sub1_9144.anInt11354, i_219_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	public void method2462(int i, int i_229_, int i_230_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass126_Sub2_Sub1_9142 = Class126_Sub2_Sub1.method17772(aClass178_Sub1_9141, i, i_229_, (aClass126_Sub2_Sub1_9144.anInt11354), (aClass126_Sub2_Sub1_9144.anInt11355));
		anInt9143 = i_230_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method2449(float f, float f_231_, float f_232_, float f_233_, float f_234_, float f_235_, int i, int i_236_, int i_237_, int i_238_) {
		if (aBool9140) {
			float f_239_ = (float) method38();
			float f_240_ = (float) method2429();
			float f_241_ = (f_232_ - f) / f_239_;
			float f_242_ = (f_233_ - f_231_) / f_239_;
			float f_243_ = (f_234_ - f) / f_240_;
			float f_244_ = (f_235_ - f_231_) / f_240_;
			float f_245_ = f_243_ * (float) anInt9146;
			float f_246_ = f_244_ * (float) anInt9146;
			float f_247_ = f_241_ * (float) anInt9145;
			float f_248_ = f_242_ * (float) anInt9145;
			float f_249_ = -f_241_ * (float) anInt9148;
			float f_250_ = -f_242_ * (float) anInt9148;
			float f_251_ = -f_243_ * (float) anInt9147;
			float f_252_ = -f_244_ * (float) anInt9147;
			f = f + f_247_ + f_245_;
			f_231_ = f_231_ + f_248_ + f_246_;
			f_232_ = f_232_ + f_249_ + f_245_;
			f_233_ = f_233_ + f_250_ + f_246_;
			f_234_ = f_234_ + f_247_ + f_251_;
			f_235_ = f_235_ + f_248_ + f_252_;
		}
		float f_253_ = f_234_ + (f_232_ - f);
		float f_254_ = f_233_ + (f_235_ - f_231_);
		aClass126_Sub2_Sub1_9144.method2110((i_238_ & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14687(i_237_);
		aClass178_Sub1_9141.method14785(i);
		OpenGL.glColor4ub((byte) (i_236_ >> 16), (byte) (i_236_ >> 8), (byte) i_236_, (byte) (i_236_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glVertex2f(f, f_231_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_234_, f_235_);
		OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glVertex2f(f_253_, f_254_);
		OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glVertex2f(f_232_, f_233_);
		OpenGL.glEnd();
	}

	void method2453(int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_) {
		aClass126_Sub2_Sub1_9144.method2110((i_261_ & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14687(i_260_);
		OpenGL.glColor4ub((byte) (i_259_ >> 16), (byte) (i_259_ >> 8), (byte) i_259_, (byte) (i_259_ >> 24));
		if (aBool9140) {
			float f = (float) i_256_ / (float) method38();
			float f_262_ = (float) i_257_ / (float) method2429();
			float f_263_ = (float) i + (float) anInt9145 * f;
			float f_264_ = (float) i_255_ + (float) anInt9146 * f_262_;
			float f_265_ = f_263_ + (float) aClass126_Sub2_Sub1_9144.anInt11354 * f;
			float f_266_ = (f_264_ + (float) aClass126_Sub2_Sub1_9144.anInt11355 * f_262_);
			if (aClass126_Sub2_Sub1_9142 == null) {
				aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
				aClass178_Sub1_9141.method14785(i_258_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_263_, f_264_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_263_, f_266_);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
				OpenGL.glVertex2f(f_265_, f_266_);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_265_, f_264_);
				OpenGL.glEnd();
			} else {
				method14535(i_258_);
				aClass126_Sub2_Sub1_9142.method2110(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_263_, f_264_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_263_, f_266_);
				OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
				OpenGL.glVertex2f(f_265_, f_266_);
				OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
				OpenGL.glVertex2f(f_265_, f_264_);
				OpenGL.glEnd();
				method14533();
			}
		} else if (aClass126_Sub2_Sub1_9142 == null) {
			aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
			aClass178_Sub1_9141.method14785(i_258_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_255_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_255_ + i_257_);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + i_256_, i_255_ + i_257_);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + i_256_, i_255_);
			OpenGL.glEnd();
		} else {
			method14535(i_258_);
			aClass126_Sub2_Sub1_9142.method2110(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i, i_255_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_255_ + i_257_);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
			OpenGL.glVertex2i(i + i_256_, i_255_ + i_257_);
			OpenGL.glMultiTexCoord2f(33985, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
			OpenGL.glVertex2i(i + i_256_, i_255_);
			OpenGL.glEnd();
			method14533();
		}
	}

	public void method2458(int[] is) {
		is[0] = anInt9145;
		is[1] = anInt9146;
		is[2] = anInt9148;
		is[3] = anInt9147;
	}

	public void method2476(int[] is) {
		is[0] = anInt9145;
		is[1] = anInt9146;
		is[2] = anInt9148;
		is[3] = anInt9147;
	}

	Class148_Sub2(Class178_Sub1 class178_sub1, int i, int i_267_, int[] is, int i_268_, int i_269_) {
		aBool9140 = false;
		anInt9146 = 0;
		anInt9145 = 0;
		anInt9147 = 0;
		anInt9148 = 0;
		aClass178_Sub1_9141 = class178_sub1;
		aClass126_Sub2_Sub1_9144 = Class126_Sub2_Sub1.method17776(class178_sub1, i, i_267_, false, is, i_269_, i_268_);
	}

	public void method2481(int i, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_) {
		method14534(i, i_270_, i_271_, i_272_, i_273_, i_274_, false);
	}

	public int method2479() {
		return aClass126_Sub2_Sub1_9144.anInt11355;
	}

	Class148_Sub2(Class178_Sub1 class178_sub1, int i, int i_275_, boolean bool) {
		aBool9140 = false;
		anInt9146 = 0;
		anInt9145 = 0;
		anInt9147 = 0;
		anInt9148 = 0;
		aClass178_Sub1_9141 = class178_sub1;
		aClass126_Sub2_Sub1_9144 = Class126_Sub2_Sub1.method17774(class178_sub1, (bool ? Class158.aClass158_1743 : Class158.aClass158_1752), Class170.aClass170_1822, i, i_275_);
	}

	public void method2460(int i, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_) {
		method14534(i, i_276_, i_277_, i_278_, i_279_, i_280_, false);
	}

	public int method40() {
		return aClass126_Sub2_Sub1_9144.anInt11354 + anInt9145 + anInt9148;
	}

	public int method37() {
		return aClass126_Sub2_Sub1_9144.anInt11354 + anInt9145 + anInt9148;
	}

	public int method2474() {
		return aClass126_Sub2_Sub1_9144.anInt11355 + anInt9146 + anInt9147;
	}

	public int method2465() {
		return aClass126_Sub2_Sub1_9144.anInt11355 + anInt9146 + anInt9147;
	}

	public void method2484(int i, int i_281_, int i_282_, int i_283_, int i_284_, int i_285_, int i_286_) {
		int i_287_ = i + i_282_;
		int i_288_ = i_281_ + i_283_;
		aClass126_Sub2_Sub1_9144.method2110(false);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14687(i_286_);
		aClass178_Sub1_9141.method14785(i_284_);
		OpenGL.glColor4ub((byte) (i_285_ >> 16), (byte) (i_285_ >> 8), (byte) i_285_, (byte) (i_285_ >> 24));
		if (aClass126_Sub2_Sub1_9144.aBool11359 && !aBool9140 && i_283_ >= aClass126_Sub2_Sub1_9144.anInt11355 && i_282_ >= aClass126_Sub2_Sub1_9144.anInt11354) {
			float f = (aClass126_Sub2_Sub1_9144.aFloat11356 * (float) i_283_ / (float) aClass126_Sub2_Sub1_9144.anInt11355);
			float f_289_ = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) i_282_ / (float) aClass126_Sub2_Sub1_9144.anInt11354);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_281_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_288_);
			OpenGL.glTexCoord2f(f_289_, 0.0F);
			OpenGL.glVertex2i(i_287_, i_288_);
			OpenGL.glTexCoord2f(f_289_, f);
			OpenGL.glVertex2i(i_287_, i_281_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9145, (float) anInt9146, 0.0F);
			int i_290_ = method38();
			int i_291_ = method2429();
			int i_292_ = i_281_ + aClass126_Sub2_Sub1_9144.anInt11355;
			OpenGL.glBegin(7);
			int i_293_ = i_281_;
			for (/**/; i_292_ <= i_288_; i_292_ += i_291_) {
				int i_294_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
				int i_295_ = i;
				while (i_294_ <= i_287_) {
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_295_, i_293_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_295_, i_292_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
					OpenGL.glVertex2i(i_294_, i_292_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_294_, i_293_);
					i_294_ += i_290_;
					i_295_ += i_290_;
				}
				if (i_295_ < i_287_) {
					float f = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) (i_287_ - i_295_) / (float) aClass126_Sub2_Sub1_9144.anInt11354);
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_295_, i_293_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_295_, i_292_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_287_, i_292_);
					OpenGL.glTexCoord2f(f, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_287_, i_293_);
				}
				i_293_ += i_291_;
			}
			if (i_293_ < i_288_) {
				float f = (aClass126_Sub2_Sub1_9144.aFloat11356 * (float) (aClass126_Sub2_Sub1_9144.anInt11355 - (i_288_ - i_293_)) / (float) aClass126_Sub2_Sub1_9144.anInt11355);
				int i_296_ = i + aClass126_Sub2_Sub1_9144.anInt11354;
				int i_297_ = i;
				while (i_296_ <= i_287_) {
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_297_, i_293_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_297_, i_288_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, f);
					OpenGL.glVertex2i(i_296_, i_288_);
					OpenGL.glTexCoord2f(aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_296_, i_293_);
					i_296_ += i_290_;
					i_297_ += i_290_;
				}
				if (i_297_ < i_287_) {
					float f_298_ = (aClass126_Sub2_Sub1_9144.aFloat11357 * (float) (i_287_ - i_297_) / (float) aClass126_Sub2_Sub1_9144.anInt11354);
					OpenGL.glTexCoord2f(0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_297_, i_293_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_297_, i_288_);
					OpenGL.glTexCoord2f(f_298_, f);
					OpenGL.glVertex2i(i_287_, i_288_);
					OpenGL.glTexCoord2f(f_298_, aClass126_Sub2_Sub1_9144.aFloat11356);
					OpenGL.glVertex2i(i_287_, i_293_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method2472(int i, int i_299_, int i_300_, int i_301_) {
		anInt9145 = i;
		anInt9146 = i_299_;
		anInt9148 = i_300_;
		anInt9147 = i_301_;
		aBool9140 = (anInt9145 != 0 || anInt9146 != 0 || anInt9148 != 0 || anInt9147 != 0);
	}

	public int method2478() {
		return aClass126_Sub2_Sub1_9144.anInt11355;
	}

	void method2495(float f, float f_302_, float f_303_, float f_304_, float f_305_, float f_306_, int i, Class145 class145, int i_307_, int i_308_) {
		Class126_Sub2_Sub1 class126_sub2_sub1 = ((Class145_Sub3) class145).aClass126_Sub2_Sub1_9842;
		if (aBool9140) {
			float f_309_ = (float) method38();
			float f_310_ = (float) method2429();
			float f_311_ = (f_303_ - f) / f_309_;
			float f_312_ = (f_304_ - f_302_) / f_309_;
			float f_313_ = (f_305_ - f) / f_310_;
			float f_314_ = (f_306_ - f_302_) / f_310_;
			float f_315_ = f_313_ * (float) anInt9146;
			float f_316_ = f_314_ * (float) anInt9146;
			float f_317_ = f_311_ * (float) anInt9145;
			float f_318_ = f_312_ * (float) anInt9145;
			float f_319_ = -f_311_ * (float) anInt9148;
			float f_320_ = -f_312_ * (float) anInt9148;
			float f_321_ = -f_313_ * (float) anInt9147;
			float f_322_ = -f_314_ * (float) anInt9147;
			f = f + f_317_ + f_315_;
			f_302_ = f_302_ + f_318_ + f_316_;
			f_303_ = f_303_ + f_319_ + f_315_;
			f_304_ = f_304_ + f_320_ + f_316_;
			f_305_ = f_305_ + f_317_ + f_321_;
			f_306_ = f_306_ + f_318_ + f_322_;
		}
		float f_323_ = f_305_ + (f_303_ - f);
		float f_324_ = f_304_ + (f_306_ - f_302_);
		aClass126_Sub2_Sub1_9144.method2110((i & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		float f_325_ = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_326_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_325_ * (f - (float) i_307_), (class126_sub2_sub1.aFloat11356 - f_326_ * (f_302_ - (float) i_308_)));
		OpenGL.glVertex2f(f, f_302_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_325_ * (f_305_ - (float) i_307_), (class126_sub2_sub1.aFloat11356 - f_326_ * (f_306_ - (float) i_308_)));
		OpenGL.glVertex2f(f_305_, f_306_);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_325_ * (f_323_ - (float) i_307_), (class126_sub2_sub1.aFloat11356 - f_326_ * (f_324_ - (float) i_308_)));
		OpenGL.glVertex2f(f_323_, f_324_);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_325_ * (f_303_ - (float) i_307_), (class126_sub2_sub1.aFloat11356 - f_326_ * (f_304_ - (float) i_308_)));
		OpenGL.glVertex2f(f_303_, f_304_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	void method2487(float f, float f_327_, float f_328_, float f_329_, float f_330_, float f_331_, int i, Class145 class145, int i_332_, int i_333_) {
		Class126_Sub2_Sub1 class126_sub2_sub1 = ((Class145_Sub3) class145).aClass126_Sub2_Sub1_9842;
		if (aBool9140) {
			float f_334_ = (float) method38();
			float f_335_ = (float) method2429();
			float f_336_ = (f_328_ - f) / f_334_;
			float f_337_ = (f_329_ - f_327_) / f_334_;
			float f_338_ = (f_330_ - f) / f_335_;
			float f_339_ = (f_331_ - f_327_) / f_335_;
			float f_340_ = f_338_ * (float) anInt9146;
			float f_341_ = f_339_ * (float) anInt9146;
			float f_342_ = f_336_ * (float) anInt9145;
			float f_343_ = f_337_ * (float) anInt9145;
			float f_344_ = -f_336_ * (float) anInt9148;
			float f_345_ = -f_337_ * (float) anInt9148;
			float f_346_ = -f_338_ * (float) anInt9147;
			float f_347_ = -f_339_ * (float) anInt9147;
			f = f + f_342_ + f_340_;
			f_327_ = f_327_ + f_343_ + f_341_;
			f_328_ = f_328_ + f_344_ + f_340_;
			f_329_ = f_329_ + f_345_ + f_341_;
			f_330_ = f_330_ + f_342_ + f_346_;
			f_331_ = f_331_ + f_343_ + f_347_;
		}
		float f_348_ = f_330_ + (f_328_ - f);
		float f_349_ = f_329_ + (f_331_ - f_327_);
		aClass126_Sub2_Sub1_9144.method2110((i & 0x1) != 0);
		aClass178_Sub1_9141.method14738();
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14785(1);
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(class126_sub2_sub1);
		aClass178_Sub1_9141.method14676(7681, 8448);
		aClass178_Sub1_9141.method14677(0, 34168, 768);
		aClass178_Sub1_9141.method14687(1);
		float f_350_ = (class126_sub2_sub1.aFloat11357 / (float) class126_sub2_sub1.anInt11354);
		float f_351_ = (class126_sub2_sub1.aFloat11356 / (float) class126_sub2_sub1.anInt11355);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_350_ * (f - (float) i_332_), (class126_sub2_sub1.aFloat11356 - f_351_ * (f_327_ - (float) i_333_)));
		OpenGL.glVertex2f(f, f_327_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_350_ * (f_330_ - (float) i_332_), (class126_sub2_sub1.aFloat11356 - f_351_ * (f_331_ - (float) i_333_)));
		OpenGL.glVertex2f(f_330_, f_331_);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_350_ * (f_348_ - (float) i_332_), (class126_sub2_sub1.aFloat11356 - f_351_ * (f_349_ - (float) i_333_)));
		OpenGL.glVertex2f(f_348_, f_349_);
		OpenGL.glMultiTexCoord2f(33984, aClass126_Sub2_Sub1_9144.aFloat11357, aClass126_Sub2_Sub1_9144.aFloat11356);
		OpenGL.glMultiTexCoord2f(33985, f_350_ * (f_328_ - (float) i_332_), (class126_sub2_sub1.aFloat11356 - f_351_ * (f_329_ - (float) i_333_)));
		OpenGL.glVertex2f(f_328_, f_329_);
		OpenGL.glEnd();
		aClass178_Sub1_9141.method14677(0, 5890, 768);
		aClass178_Sub1_9141.method14785(0);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14673(0);
	}

	void method14536(int i) {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14676(aClass178_Sub1_9141.method14675(i), 7681);
		aClass178_Sub1_9141.method14677(1, 34167, 768);
		aClass178_Sub1_9141.method14678(0, 34168, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9142);
		aClass178_Sub1_9141.method14676(34479, 7681);
		aClass178_Sub1_9141.method14677(1, 34166, 768);
		if (anInt9143 == 0)
			aClass178_Sub1_9141.method14857(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9143 == 1)
			aClass178_Sub1_9141.method14857(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9143 == 2)
			aClass178_Sub1_9141.method14857(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9143 == 3)
			aClass178_Sub1_9141.method14857(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method14537(int i) {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9144);
		aClass178_Sub1_9141.method14676(aClass178_Sub1_9141.method14675(i), 7681);
		aClass178_Sub1_9141.method14677(1, 34167, 768);
		aClass178_Sub1_9141.method14678(0, 34168, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14711(aClass126_Sub2_Sub1_9142);
		aClass178_Sub1_9141.method14676(34479, 7681);
		aClass178_Sub1_9141.method14677(1, 34166, 768);
		if (anInt9143 == 0)
			aClass178_Sub1_9141.method14857(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9143 == 1)
			aClass178_Sub1_9141.method14857(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9143 == 2)
			aClass178_Sub1_9141.method14857(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9143 == 3)
			aClass178_Sub1_9141.method14857(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method14538() {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14676(8448, 8448);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
		aClass178_Sub1_9141.method14678(0, 5890, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
	}

	void method14539() {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14676(8448, 8448);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
		aClass178_Sub1_9141.method14678(0, 5890, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
	}

	void method14540() {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14676(8448, 8448);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
		aClass178_Sub1_9141.method14678(0, 5890, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
	}

	void method14541() {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14676(8448, 8448);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
		aClass178_Sub1_9141.method14678(0, 5890, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
	}

	void method14542() {
		aClass178_Sub1_9141.method14673(1);
		aClass178_Sub1_9141.method14711(null);
		aClass178_Sub1_9141.method14676(8448, 8448);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
		aClass178_Sub1_9141.method14678(0, 5890, 770);
		aClass178_Sub1_9141.method14673(0);
		aClass178_Sub1_9141.method14677(1, 34168, 768);
	}
}
