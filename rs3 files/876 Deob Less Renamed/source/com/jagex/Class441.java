/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public final class Class441 {
	public float[] aFloatArray4916;
	public static Class441 aClass441_4917 = new Class441();

	public float[] method7084(float[] fs) {
		System.arraycopy(aFloatArray4916, 0, fs, 0, 16);
		return fs;
	}

	public Class441(Class441 class441_0_) {
		aFloatArray4916 = new float[16];
		method7086(class441_0_);
	}

	public void method7085() {
		aFloatArray4916[0] = 1.0F;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 1.0F;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = 1.0F;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = 1.0F;
	}

	public void method7086(Class441 class441_1_) {
		System.arraycopy(class441_1_.aFloatArray4916, 0, aFloatArray4916, 0, 16);
	}

	public float method7087() {
		return ((aFloatArray4916[14] - aFloatArray4916[15]) / (aFloatArray4916[11] - aFloatArray4916[10]));
	}

	public void method7088(Class441 class441_2_, Class441 class441_3_) {
		float f = (class441_2_.aFloatArray4916[0] * class441_3_.aFloatArray4916[0] + (class441_2_.aFloatArray4916[1] * class441_3_.aFloatArray4916[4]) + (class441_2_.aFloatArray4916[2] * class441_3_.aFloatArray4916[8]) + (class441_2_.aFloatArray4916[3] * class441_3_.aFloatArray4916[12]));
		float f_4_ = (class441_2_.aFloatArray4916[0] * class441_3_.aFloatArray4916[1] + (class441_2_.aFloatArray4916[1] * class441_3_.aFloatArray4916[5]) + (class441_2_.aFloatArray4916[2] * class441_3_.aFloatArray4916[9]) + (class441_2_.aFloatArray4916[3] * class441_3_.aFloatArray4916[13]));
		float f_5_ = (class441_2_.aFloatArray4916[0] * class441_3_.aFloatArray4916[2] + (class441_2_.aFloatArray4916[1] * class441_3_.aFloatArray4916[6]) + (class441_2_.aFloatArray4916[2] * class441_3_.aFloatArray4916[10]) + (class441_2_.aFloatArray4916[3] * class441_3_.aFloatArray4916[14]));
		float f_6_ = (class441_2_.aFloatArray4916[0] * class441_3_.aFloatArray4916[3] + (class441_2_.aFloatArray4916[1] * class441_3_.aFloatArray4916[7]) + (class441_2_.aFloatArray4916[2] * class441_3_.aFloatArray4916[11]) + (class441_2_.aFloatArray4916[3] * class441_3_.aFloatArray4916[15]));
		float f_7_ = (class441_2_.aFloatArray4916[4] * class441_3_.aFloatArray4916[0] + (class441_2_.aFloatArray4916[5] * class441_3_.aFloatArray4916[4]) + (class441_2_.aFloatArray4916[6] * class441_3_.aFloatArray4916[8]) + (class441_2_.aFloatArray4916[7] * class441_3_.aFloatArray4916[12]));
		float f_8_ = (class441_2_.aFloatArray4916[4] * class441_3_.aFloatArray4916[1] + (class441_2_.aFloatArray4916[5] * class441_3_.aFloatArray4916[5]) + (class441_2_.aFloatArray4916[6] * class441_3_.aFloatArray4916[9]) + (class441_2_.aFloatArray4916[7] * class441_3_.aFloatArray4916[13]));
		float f_9_ = (class441_2_.aFloatArray4916[4] * class441_3_.aFloatArray4916[2] + (class441_2_.aFloatArray4916[5] * class441_3_.aFloatArray4916[6]) + (class441_2_.aFloatArray4916[6] * class441_3_.aFloatArray4916[10]) + (class441_2_.aFloatArray4916[7] * class441_3_.aFloatArray4916[14]));
		float f_10_ = (class441_2_.aFloatArray4916[4] * class441_3_.aFloatArray4916[3] + (class441_2_.aFloatArray4916[5] * class441_3_.aFloatArray4916[7]) + (class441_2_.aFloatArray4916[6] * class441_3_.aFloatArray4916[11]) + (class441_2_.aFloatArray4916[7] * class441_3_.aFloatArray4916[15]));
		float f_11_ = (class441_2_.aFloatArray4916[8] * class441_3_.aFloatArray4916[0] + (class441_2_.aFloatArray4916[9] * class441_3_.aFloatArray4916[4]) + (class441_2_.aFloatArray4916[10] * class441_3_.aFloatArray4916[8]) + (class441_2_.aFloatArray4916[11] * class441_3_.aFloatArray4916[12]));
		float f_12_ = (class441_2_.aFloatArray4916[8] * class441_3_.aFloatArray4916[1] + (class441_2_.aFloatArray4916[9] * class441_3_.aFloatArray4916[5]) + (class441_2_.aFloatArray4916[10] * class441_3_.aFloatArray4916[9]) + (class441_2_.aFloatArray4916[11] * class441_3_.aFloatArray4916[13]));
		float f_13_ = (class441_2_.aFloatArray4916[8] * class441_3_.aFloatArray4916[2] + (class441_2_.aFloatArray4916[9] * class441_3_.aFloatArray4916[6]) + (class441_2_.aFloatArray4916[10] * class441_3_.aFloatArray4916[10]) + (class441_2_.aFloatArray4916[11] * class441_3_.aFloatArray4916[14]));
		float f_14_ = (class441_2_.aFloatArray4916[8] * class441_3_.aFloatArray4916[3] + (class441_2_.aFloatArray4916[9] * class441_3_.aFloatArray4916[7]) + (class441_2_.aFloatArray4916[10] * class441_3_.aFloatArray4916[11]) + (class441_2_.aFloatArray4916[11] * class441_3_.aFloatArray4916[15]));
		float f_15_ = (class441_2_.aFloatArray4916[12] * class441_3_.aFloatArray4916[0] + (class441_2_.aFloatArray4916[13] * class441_3_.aFloatArray4916[4]) + (class441_2_.aFloatArray4916[14] * class441_3_.aFloatArray4916[8]) + (class441_2_.aFloatArray4916[15] * class441_3_.aFloatArray4916[12]));
		float f_16_ = (class441_2_.aFloatArray4916[12] * class441_3_.aFloatArray4916[1] + (class441_2_.aFloatArray4916[13] * class441_3_.aFloatArray4916[5]) + (class441_2_.aFloatArray4916[14] * class441_3_.aFloatArray4916[9]) + (class441_2_.aFloatArray4916[15] * class441_3_.aFloatArray4916[13]));
		float f_17_ = (class441_2_.aFloatArray4916[12] * class441_3_.aFloatArray4916[2] + (class441_2_.aFloatArray4916[13] * class441_3_.aFloatArray4916[6]) + (class441_2_.aFloatArray4916[14] * class441_3_.aFloatArray4916[10]) + (class441_2_.aFloatArray4916[15] * class441_3_.aFloatArray4916[14]));
		float f_18_ = (class441_2_.aFloatArray4916[12] * class441_3_.aFloatArray4916[3] + (class441_2_.aFloatArray4916[13] * class441_3_.aFloatArray4916[7]) + (class441_2_.aFloatArray4916[14] * class441_3_.aFloatArray4916[11]) + (class441_2_.aFloatArray4916[15] * class441_3_.aFloatArray4916[15]));
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_4_;
		aFloatArray4916[2] = f_5_;
		aFloatArray4916[3] = f_6_;
		aFloatArray4916[4] = f_7_;
		aFloatArray4916[5] = f_8_;
		aFloatArray4916[6] = f_9_;
		aFloatArray4916[7] = f_10_;
		aFloatArray4916[8] = f_11_;
		aFloatArray4916[9] = f_12_;
		aFloatArray4916[10] = f_13_;
		aFloatArray4916[11] = f_14_;
		aFloatArray4916[12] = f_15_;
		aFloatArray4916[13] = f_16_;
		aFloatArray4916[14] = f_17_;
		aFloatArray4916[15] = f_18_;
	}

	public void method7089(Class441 class441_19_) {
		float f = (aFloatArray4916[0] * class441_19_.aFloatArray4916[0] + aFloatArray4916[1] * class441_19_.aFloatArray4916[4] + aFloatArray4916[2] * class441_19_.aFloatArray4916[8] + aFloatArray4916[3] * class441_19_.aFloatArray4916[12]);
		float f_20_ = (aFloatArray4916[0] * class441_19_.aFloatArray4916[1] + aFloatArray4916[1] * class441_19_.aFloatArray4916[5] + aFloatArray4916[2] * class441_19_.aFloatArray4916[9] + aFloatArray4916[3] * class441_19_.aFloatArray4916[13]);
		float f_21_ = (aFloatArray4916[0] * class441_19_.aFloatArray4916[2] + aFloatArray4916[1] * class441_19_.aFloatArray4916[6] + aFloatArray4916[2] * class441_19_.aFloatArray4916[10] + aFloatArray4916[3] * class441_19_.aFloatArray4916[14]);
		float f_22_ = (aFloatArray4916[0] * class441_19_.aFloatArray4916[3] + aFloatArray4916[1] * class441_19_.aFloatArray4916[7] + aFloatArray4916[2] * class441_19_.aFloatArray4916[11] + aFloatArray4916[3] * class441_19_.aFloatArray4916[15]);
		float f_23_ = (aFloatArray4916[4] * class441_19_.aFloatArray4916[0] + aFloatArray4916[5] * class441_19_.aFloatArray4916[4] + aFloatArray4916[6] * class441_19_.aFloatArray4916[8] + aFloatArray4916[7] * class441_19_.aFloatArray4916[12]);
		float f_24_ = (aFloatArray4916[4] * class441_19_.aFloatArray4916[1] + aFloatArray4916[5] * class441_19_.aFloatArray4916[5] + aFloatArray4916[6] * class441_19_.aFloatArray4916[9] + aFloatArray4916[7] * class441_19_.aFloatArray4916[13]);
		float f_25_ = (aFloatArray4916[4] * class441_19_.aFloatArray4916[2] + aFloatArray4916[5] * class441_19_.aFloatArray4916[6] + aFloatArray4916[6] * class441_19_.aFloatArray4916[10] + aFloatArray4916[7] * class441_19_.aFloatArray4916[14]);
		float f_26_ = (aFloatArray4916[4] * class441_19_.aFloatArray4916[3] + aFloatArray4916[5] * class441_19_.aFloatArray4916[7] + aFloatArray4916[6] * class441_19_.aFloatArray4916[11] + aFloatArray4916[7] * class441_19_.aFloatArray4916[15]);
		float f_27_ = (aFloatArray4916[8] * class441_19_.aFloatArray4916[0] + aFloatArray4916[9] * class441_19_.aFloatArray4916[4] + aFloatArray4916[10] * class441_19_.aFloatArray4916[8] + aFloatArray4916[11] * class441_19_.aFloatArray4916[12]);
		float f_28_ = (aFloatArray4916[8] * class441_19_.aFloatArray4916[1] + aFloatArray4916[9] * class441_19_.aFloatArray4916[5] + aFloatArray4916[10] * class441_19_.aFloatArray4916[9] + aFloatArray4916[11] * class441_19_.aFloatArray4916[13]);
		float f_29_ = (aFloatArray4916[8] * class441_19_.aFloatArray4916[2] + aFloatArray4916[9] * class441_19_.aFloatArray4916[6] + aFloatArray4916[10] * class441_19_.aFloatArray4916[10] + aFloatArray4916[11] * class441_19_.aFloatArray4916[14]);
		float f_30_ = (aFloatArray4916[8] * class441_19_.aFloatArray4916[3] + aFloatArray4916[9] * class441_19_.aFloatArray4916[7] + aFloatArray4916[10] * class441_19_.aFloatArray4916[11] + aFloatArray4916[11] * class441_19_.aFloatArray4916[15]);
		float f_31_ = (aFloatArray4916[12] * class441_19_.aFloatArray4916[0] + aFloatArray4916[13] * class441_19_.aFloatArray4916[4] + aFloatArray4916[14] * class441_19_.aFloatArray4916[8] + aFloatArray4916[15] * class441_19_.aFloatArray4916[12]);
		float f_32_ = (aFloatArray4916[12] * class441_19_.aFloatArray4916[1] + aFloatArray4916[13] * class441_19_.aFloatArray4916[5] + aFloatArray4916[14] * class441_19_.aFloatArray4916[9] + aFloatArray4916[15] * class441_19_.aFloatArray4916[13]);
		float f_33_ = (aFloatArray4916[12] * class441_19_.aFloatArray4916[2] + aFloatArray4916[13] * class441_19_.aFloatArray4916[6] + aFloatArray4916[14] * class441_19_.aFloatArray4916[10] + aFloatArray4916[15] * class441_19_.aFloatArray4916[14]);
		float f_34_ = (aFloatArray4916[12] * class441_19_.aFloatArray4916[3] + aFloatArray4916[13] * class441_19_.aFloatArray4916[7] + aFloatArray4916[14] * class441_19_.aFloatArray4916[11] + aFloatArray4916[15] * class441_19_.aFloatArray4916[15]);
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_20_;
		aFloatArray4916[2] = f_21_;
		aFloatArray4916[3] = f_22_;
		aFloatArray4916[4] = f_23_;
		aFloatArray4916[5] = f_24_;
		aFloatArray4916[6] = f_25_;
		aFloatArray4916[7] = f_26_;
		aFloatArray4916[8] = f_27_;
		aFloatArray4916[9] = f_28_;
		aFloatArray4916[10] = f_29_;
		aFloatArray4916[11] = f_30_;
		aFloatArray4916[12] = f_31_;
		aFloatArray4916[13] = f_32_;
		aFloatArray4916[14] = f_33_;
		aFloatArray4916[15] = f_34_;
	}

	public void method7090(Class435 class435) {
		aFloatArray4916[0] = class435.aFloat4885;
		aFloatArray4916[1] = class435.aFloat4893;
		aFloatArray4916[2] = class435.aFloat4887;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = class435.aFloat4888;
		aFloatArray4916[5] = class435.aFloat4889;
		aFloatArray4916[6] = class435.aFloat4884;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = class435.aFloat4891;
		aFloatArray4916[9] = class435.aFloat4886;
		aFloatArray4916[10] = class435.aFloat4892;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = class435.aFloat4894;
		aFloatArray4916[13] = class435.aFloat4895;
		aFloatArray4916[14] = class435.aFloat4896;
		aFloatArray4916[15] = 1.0F;
	}

	float method7091() {
		return ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15]) - (aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15]) + (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13]) + (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13]) - (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15]) + (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15]) - (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12]) - (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15]) - (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15]) + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14]) + (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14]) - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12]));
	}

	public void method7092() {
		float f = aFloatArray4916[0];
		float f_35_ = aFloatArray4916[4];
		float f_36_ = aFloatArray4916[8];
		float f_37_ = aFloatArray4916[12];
		float f_38_ = aFloatArray4916[1];
		float f_39_ = aFloatArray4916[5];
		float f_40_ = aFloatArray4916[9];
		float f_41_ = aFloatArray4916[13];
		float f_42_ = aFloatArray4916[2];
		float f_43_ = aFloatArray4916[6];
		float f_44_ = aFloatArray4916[10];
		float f_45_ = aFloatArray4916[14];
		float f_46_ = aFloatArray4916[3];
		float f_47_ = aFloatArray4916[7];
		float f_48_ = aFloatArray4916[11];
		float f_49_ = aFloatArray4916[15];
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_35_;
		aFloatArray4916[2] = f_36_;
		aFloatArray4916[3] = f_37_;
		aFloatArray4916[4] = f_38_;
		aFloatArray4916[5] = f_39_;
		aFloatArray4916[6] = f_40_;
		aFloatArray4916[7] = f_41_;
		aFloatArray4916[8] = f_42_;
		aFloatArray4916[9] = f_43_;
		aFloatArray4916[10] = f_44_;
		aFloatArray4916[11] = f_45_;
		aFloatArray4916[12] = f_46_;
		aFloatArray4916[13] = f_47_;
		aFloatArray4916[14] = f_48_;
		aFloatArray4916[15] = f_49_;
	}

	public void method7093(float f, float f_50_, float f_51_, float f_52_) {
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = f_50_;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = f_51_;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = f_52_;
	}

	public boolean method7094() {
		return (aFloatArray4916[0] == 1.0F && aFloatArray4916[1] == 0.0F && aFloatArray4916[2] == 0.0F && aFloatArray4916[3] == 0.0F && aFloatArray4916[4] == 0.0F && aFloatArray4916[5] == 1.0F && aFloatArray4916[6] == 0.0F && aFloatArray4916[7] == 0.0F && aFloatArray4916[8] == 0.0F && aFloatArray4916[9] == 0.0F && aFloatArray4916[10] == 1.0F && aFloatArray4916[11] == 0.0F && aFloatArray4916[12] == 0.0F && aFloatArray4916[13] == 0.0F && aFloatArray4916[14] == 0.0F && aFloatArray4916[15] == 1.0F);
	}

	void method7095(float f, float f_53_, float f_54_, float f_55_, float f_56_, float f_57_) {
		aFloatArray4916[0] = 2.0F * f_56_ / (f_53_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_56_ / (f_55_ - f_54_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_53_ + f) / (f_53_ - f);
		aFloatArray4916[9] = (f_55_ + f_54_) / (f_55_ - f_54_);
		aFloatArray4916[10] = (f_57_ + f_56_) / (f_57_ - f_56_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_57_ * f_56_) / (f_57_ - f_56_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7096(float[] fs) {
		float f = fs[0];
		float f_58_ = fs[1];
		float f_59_ = fs[2];
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_58_ + aFloatArray4916[8] * f_59_ + aFloatArray4916[12]);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_58_ + aFloatArray4916[9] * f_59_ + aFloatArray4916[13]);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_58_ + aFloatArray4916[10] * f_59_ + aFloatArray4916[14]);
	}

	public void method7097(float[] fs) {
		float f = fs[0];
		float f_60_ = fs[1];
		float f_61_ = fs[2];
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_60_ + aFloatArray4916[8] * f_61_ + aFloatArray4916[12]);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_60_ + aFloatArray4916[9] * f_61_ + aFloatArray4916[13]);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_60_ + aFloatArray4916[10] * f_61_ + aFloatArray4916[14]);
	}

	public void method7098(float f, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_) {
		aFloatArray4916[0] = 2.0F / (f_62_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F / (f_64_ - f_63_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = 2.0F / (f_66_ - f_65_);
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = -(f_62_ + f) / (f_62_ - f);
		aFloatArray4916[13] = -(f_64_ + f_63_) / (f_64_ - f_63_);
		aFloatArray4916[14] = -(f_66_ + f_65_) / (f_66_ - f_65_);
		aFloatArray4916[15] = 1.0F;
	}

	void method7099(float f, float f_67_, float f_68_, float f_69_, float f_70_, float f_71_) {
		aFloatArray4916[0] = 2.0F * f_70_ / (f_67_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_70_ / (f_69_ - f_68_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_67_ + f) / (f_67_ - f);
		aFloatArray4916[9] = (f_69_ + f_68_) / (f_69_ - f_68_);
		aFloatArray4916[10] = (f_71_ + f_70_) / (f_71_ - f_70_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_71_ * f_70_) / (f_71_ - f_70_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7100(float f, float f_72_, float f_73_) {
		method7098(-10000.0F / f_73_, 10000.0F / f_73_, -10000.0F / f_73_, 10000.0F / f_73_, f, f_72_);
	}

	public float[] method7101(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4916[4];
		fs[5] = aFloatArray4916[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4916[12];
		fs[9] = aFloatArray4916[13];
		fs[10] = aFloatArray4916[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method7102(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[2];
		float f_74_ = aFloatArray4916[7] - aFloatArray4916[6];
		float f_75_ = aFloatArray4916[11] - aFloatArray4916[10];
		double d = Math.sqrt((double) (f * f + f_74_ * f_74_ + f_75_ * f_75_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_74_ / d);
		fs[2] = (float) ((double) f_75_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[14]) / d);
		return fs;
	}

	public int method7103() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4916);
		return i;
	}

	public float method7104() {
		return (-(aFloatArray4916[15] + aFloatArray4916[14]) / (aFloatArray4916[11] + aFloatArray4916[10]));
	}

	public float method7105() {
		return ((aFloatArray4916[14] - aFloatArray4916[15]) / (aFloatArray4916[11] - aFloatArray4916[10]));
	}

	public float[] method7106(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[0];
		float f_76_ = aFloatArray4916[7] + aFloatArray4916[4];
		float f_77_ = aFloatArray4916[11] + aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_76_ * f_76_ + f_77_ * f_77_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_76_ / d);
		fs[2] = (float) ((double) f_77_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[12]) / d);
		return fs;
	}

	public float[] method7107(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[0];
		float f_78_ = aFloatArray4916[7] - aFloatArray4916[4];
		float f_79_ = aFloatArray4916[11] - aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_78_ * f_78_ + f_79_ * f_79_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_78_ / d);
		fs[2] = (float) ((double) f_79_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[12]) / d);
		return fs;
	}

	public void method7108() {
		aFloatArray4916[0] = 1.0F;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 1.0F;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = 1.0F;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = 1.0F;
	}

	public float method7109() {
		return ((aFloatArray4916[14] - aFloatArray4916[15]) / (aFloatArray4916[11] - aFloatArray4916[10]));
	}

	float method7110() {
		return ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15]) - (aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15]) + (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13]) + (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13]) - (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15]) + (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15]) - (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12]) - (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15]) - (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15]) + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14]) + (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14]) - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12]));
	}

	public float[] method7111(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[2];
		float f_80_ = aFloatArray4916[7] - aFloatArray4916[6];
		float f_81_ = aFloatArray4916[11] - aFloatArray4916[10];
		double d = Math.sqrt((double) (f * f + f_80_ * f_80_ + f_81_ * f_81_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_80_ / d);
		fs[2] = (float) ((double) f_81_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[14]) / d);
		return fs;
	}

	void method7112(float f, float f_82_, float f_83_, float f_84_, float f_85_, float f_86_) {
		aFloatArray4916[0] = 2.0F * f_85_ / (f_82_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_85_ / (f_84_ - f_83_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_82_ + f) / (f_82_ - f);
		aFloatArray4916[9] = (f_84_ + f_83_) / (f_84_ - f_83_);
		aFloatArray4916[10] = (f_86_ + f_85_) / (f_86_ - f_85_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_86_ * f_85_) / (f_86_ - f_85_);
		aFloatArray4916[15] = 0.0F;
	}

	public boolean method7113() {
		return (aFloatArray4916[0] == 1.0F && aFloatArray4916[1] == 0.0F && aFloatArray4916[2] == 0.0F && aFloatArray4916[3] == 0.0F && aFloatArray4916[4] == 0.0F && aFloatArray4916[5] == 1.0F && aFloatArray4916[6] == 0.0F && aFloatArray4916[7] == 0.0F && aFloatArray4916[8] == 0.0F && aFloatArray4916[9] == 0.0F && aFloatArray4916[10] == 1.0F && aFloatArray4916[11] == 0.0F && aFloatArray4916[12] == 0.0F && aFloatArray4916[13] == 0.0F && aFloatArray4916[14] == 0.0F && aFloatArray4916[15] == 1.0F);
	}

	public float[] method7114(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[2];
		float f_87_ = aFloatArray4916[7] + aFloatArray4916[6];
		float f_88_ = aFloatArray4916[11] + aFloatArray4916[10];
		double d = Math.sqrt((double) (f * f + f_87_ * f_87_ + f_88_ * f_88_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_87_ / d);
		fs[2] = (float) ((double) f_88_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[14]) / d);
		return fs;
	}

	public void method7115(float f, float f_89_, float f_90_, float f_91_) {
		float f_92_ = (float) (Math.tan((double) (f_90_ / 2.0F)) * (double) f);
		float f_93_ = (float) (Math.tan((double) (f_91_ / 2.0F)) * (double) f);
		method7112(-f_92_, f_92_, -f_93_, f_93_, f, f_89_);
	}

	public float[] method7116(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		fs[8] = aFloatArray4916[2];
		fs[9] = aFloatArray4916[6];
		fs[10] = aFloatArray4916[10];
		fs[11] = aFloatArray4916[14];
		fs[12] = aFloatArray4916[3];
		fs[13] = aFloatArray4916[7];
		fs[14] = aFloatArray4916[11];
		fs[15] = aFloatArray4916[15];
		return fs;
	}

	public Class441() {
		aFloatArray4916 = new float[16];
		method7085();
	}

	void method7117(float f, float f_94_, float f_95_, float f_96_, float f_97_, float f_98_) {
		aFloatArray4916[0] = 2.0F * f_97_ / (f_94_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_97_ / (f_96_ - f_95_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_94_ + f) / (f_94_ - f);
		aFloatArray4916[9] = (f_96_ + f_95_) / (f_96_ - f_95_);
		aFloatArray4916[10] = (f_98_ + f_97_) / (f_98_ - f_97_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_98_ * f_97_) / (f_98_ - f_97_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7118(int i, int i_99_, int i_100_, float f, float f_101_, float f_102_) {
		if (i != 0) {
			float f_103_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_104_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloatArray4916[0] = f_103_ * (float) i_99_;
			aFloatArray4916[5] = f_103_ * (float) i_100_;
			aFloatArray4916[1] = f_104_ * (float) i_99_;
			aFloatArray4916[4] = -f_104_ * (float) i_100_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_105_ = aFloatArray4916;
			float[] fs_106_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_106_[8] = 0.0F;
			fs_105_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4916[0] = (float) i_99_;
			aFloatArray4916[5] = (float) i_100_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_107_ = aFloatArray4916;
			float[] fs_108_ = aFloatArray4916;
			float[] fs_109_ = aFloatArray4916;
			float[] fs_110_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_110_[8] = 0.0F;
			fs_109_[6] = 0.0F;
			fs_108_[4] = 0.0F;
			fs_107_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4916;
		float[] fs_111_ = aFloatArray4916;
		aFloatArray4916[11] = 0.0F;
		fs_111_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4916[15] = 1.0F;
		aFloatArray4916[12] = f;
		aFloatArray4916[13] = f_101_;
		aFloatArray4916[14] = f_102_;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_112_ = 0; i_112_ < 4; i_112_++) {
				if (i_112_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4916[i * 4 + i_112_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public int hashCode() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4916);
		return i;
	}

	public void method7119(float f, float f_113_, float f_114_, float f_115_) {
		float f_116_ = (float) (Math.tan((double) (f_114_ / 2.0F)) * (double) f);
		float f_117_ = (float) (Math.tan((double) (f_115_ / 2.0F)) * (double) f);
		method7112(-f_116_, f_116_, -f_117_, f_117_, f, f_113_);
	}

	public void method7120(float f, float f_118_, float f_119_, float[] fs) {
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_118_ + aFloatArray4916[8] * f_119_);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_118_ + aFloatArray4916[9] * f_119_);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_118_ + aFloatArray4916[10] * f_119_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4916[3] * f + aFloatArray4916[7] * f_118_ + aFloatArray4916[11] * f_119_);
	}

	public boolean method7121(Object object) {
		if (!(object instanceof Class441))
			return false;
		Class441 class441_120_ = (Class441) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4916[i] != class441_120_.aFloatArray4916[i])
				return false;
		}
		return true;
	}

	public void method7122(Class441 class441_121_) {
		System.arraycopy(class441_121_.aFloatArray4916, 0, aFloatArray4916, 0, 11);
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = 1.0F;
	}

	public float[] method7123(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[1];
		float f_122_ = aFloatArray4916[7] + aFloatArray4916[5];
		float f_123_ = aFloatArray4916[11] + aFloatArray4916[9];
		double d = Math.sqrt((double) (f * f + f_122_ * f_122_ + f_123_ * f_123_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_122_ / d);
		fs[2] = (float) ((double) f_123_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[13]) / d);
		return fs;
	}

	public void method7124() {
		float f = aFloatArray4916[0];
		float f_124_ = aFloatArray4916[4];
		float f_125_ = aFloatArray4916[8];
		float f_126_ = aFloatArray4916[12];
		float f_127_ = aFloatArray4916[1];
		float f_128_ = aFloatArray4916[5];
		float f_129_ = aFloatArray4916[9];
		float f_130_ = aFloatArray4916[13];
		float f_131_ = aFloatArray4916[2];
		float f_132_ = aFloatArray4916[6];
		float f_133_ = aFloatArray4916[10];
		float f_134_ = aFloatArray4916[14];
		float f_135_ = aFloatArray4916[3];
		float f_136_ = aFloatArray4916[7];
		float f_137_ = aFloatArray4916[11];
		float f_138_ = aFloatArray4916[15];
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_124_;
		aFloatArray4916[2] = f_125_;
		aFloatArray4916[3] = f_126_;
		aFloatArray4916[4] = f_127_;
		aFloatArray4916[5] = f_128_;
		aFloatArray4916[6] = f_129_;
		aFloatArray4916[7] = f_130_;
		aFloatArray4916[8] = f_131_;
		aFloatArray4916[9] = f_132_;
		aFloatArray4916[10] = f_133_;
		aFloatArray4916[11] = f_134_;
		aFloatArray4916[12] = f_135_;
		aFloatArray4916[13] = f_136_;
		aFloatArray4916[14] = f_137_;
		aFloatArray4916[15] = f_138_;
	}

	public void method7125(Class441 class441_139_) {
		System.arraycopy(class441_139_.aFloatArray4916, 0, aFloatArray4916, 0, 11);
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = 1.0F;
	}

	public void method7126(Class441 class441_140_) {
		System.arraycopy(class441_140_.aFloatArray4916, 0, aFloatArray4916, 0, 11);
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = 1.0F;
	}

	public void method7127(Class441 class441_141_) {
		System.arraycopy(class441_141_.aFloatArray4916, 0, aFloatArray4916, 0, 11);
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = 1.0F;
	}

	public void method7128(Class441 class441_142_, Class441 class441_143_) {
		float f = ((class441_142_.aFloatArray4916[0] * class441_143_.aFloatArray4916[0]) + (class441_142_.aFloatArray4916[1] * class441_143_.aFloatArray4916[4]) + (class441_142_.aFloatArray4916[2] * class441_143_.aFloatArray4916[8]) + (class441_142_.aFloatArray4916[3] * class441_143_.aFloatArray4916[12]));
		float f_144_ = ((class441_142_.aFloatArray4916[0] * class441_143_.aFloatArray4916[1]) + (class441_142_.aFloatArray4916[1] * class441_143_.aFloatArray4916[5]) + (class441_142_.aFloatArray4916[2] * class441_143_.aFloatArray4916[9]) + (class441_142_.aFloatArray4916[3] * class441_143_.aFloatArray4916[13]));
		float f_145_ = ((class441_142_.aFloatArray4916[0] * class441_143_.aFloatArray4916[2]) + (class441_142_.aFloatArray4916[1] * class441_143_.aFloatArray4916[6]) + (class441_142_.aFloatArray4916[2] * class441_143_.aFloatArray4916[10]) + (class441_142_.aFloatArray4916[3] * class441_143_.aFloatArray4916[14]));
		float f_146_ = ((class441_142_.aFloatArray4916[0] * class441_143_.aFloatArray4916[3]) + (class441_142_.aFloatArray4916[1] * class441_143_.aFloatArray4916[7]) + (class441_142_.aFloatArray4916[2] * class441_143_.aFloatArray4916[11]) + (class441_142_.aFloatArray4916[3] * class441_143_.aFloatArray4916[15]));
		float f_147_ = ((class441_142_.aFloatArray4916[4] * class441_143_.aFloatArray4916[0]) + (class441_142_.aFloatArray4916[5] * class441_143_.aFloatArray4916[4]) + (class441_142_.aFloatArray4916[6] * class441_143_.aFloatArray4916[8]) + (class441_142_.aFloatArray4916[7] * class441_143_.aFloatArray4916[12]));
		float f_148_ = ((class441_142_.aFloatArray4916[4] * class441_143_.aFloatArray4916[1]) + (class441_142_.aFloatArray4916[5] * class441_143_.aFloatArray4916[5]) + (class441_142_.aFloatArray4916[6] * class441_143_.aFloatArray4916[9]) + (class441_142_.aFloatArray4916[7] * class441_143_.aFloatArray4916[13]));
		float f_149_ = ((class441_142_.aFloatArray4916[4] * class441_143_.aFloatArray4916[2]) + (class441_142_.aFloatArray4916[5] * class441_143_.aFloatArray4916[6]) + (class441_142_.aFloatArray4916[6] * class441_143_.aFloatArray4916[10]) + (class441_142_.aFloatArray4916[7] * class441_143_.aFloatArray4916[14]));
		float f_150_ = ((class441_142_.aFloatArray4916[4] * class441_143_.aFloatArray4916[3]) + (class441_142_.aFloatArray4916[5] * class441_143_.aFloatArray4916[7]) + (class441_142_.aFloatArray4916[6] * class441_143_.aFloatArray4916[11]) + (class441_142_.aFloatArray4916[7] * class441_143_.aFloatArray4916[15]));
		float f_151_ = ((class441_142_.aFloatArray4916[8] * class441_143_.aFloatArray4916[0]) + (class441_142_.aFloatArray4916[9] * class441_143_.aFloatArray4916[4]) + (class441_142_.aFloatArray4916[10] * class441_143_.aFloatArray4916[8]) + (class441_142_.aFloatArray4916[11] * class441_143_.aFloatArray4916[12]));
		float f_152_ = ((class441_142_.aFloatArray4916[8] * class441_143_.aFloatArray4916[1]) + (class441_142_.aFloatArray4916[9] * class441_143_.aFloatArray4916[5]) + (class441_142_.aFloatArray4916[10] * class441_143_.aFloatArray4916[9]) + (class441_142_.aFloatArray4916[11] * class441_143_.aFloatArray4916[13]));
		float f_153_ = ((class441_142_.aFloatArray4916[8] * class441_143_.aFloatArray4916[2]) + (class441_142_.aFloatArray4916[9] * class441_143_.aFloatArray4916[6]) + (class441_142_.aFloatArray4916[10] * class441_143_.aFloatArray4916[10]) + (class441_142_.aFloatArray4916[11] * class441_143_.aFloatArray4916[14]));
		float f_154_ = ((class441_142_.aFloatArray4916[8] * class441_143_.aFloatArray4916[3]) + (class441_142_.aFloatArray4916[9] * class441_143_.aFloatArray4916[7]) + (class441_142_.aFloatArray4916[10] * class441_143_.aFloatArray4916[11]) + (class441_142_.aFloatArray4916[11] * class441_143_.aFloatArray4916[15]));
		float f_155_ = ((class441_142_.aFloatArray4916[12] * class441_143_.aFloatArray4916[0]) + (class441_142_.aFloatArray4916[13] * class441_143_.aFloatArray4916[4]) + (class441_142_.aFloatArray4916[14] * class441_143_.aFloatArray4916[8]) + (class441_142_.aFloatArray4916[15] * class441_143_.aFloatArray4916[12]));
		float f_156_ = ((class441_142_.aFloatArray4916[12] * class441_143_.aFloatArray4916[1]) + (class441_142_.aFloatArray4916[13] * class441_143_.aFloatArray4916[5]) + (class441_142_.aFloatArray4916[14] * class441_143_.aFloatArray4916[9]) + (class441_142_.aFloatArray4916[15] * class441_143_.aFloatArray4916[13]));
		float f_157_ = ((class441_142_.aFloatArray4916[12] * class441_143_.aFloatArray4916[2]) + (class441_142_.aFloatArray4916[13] * class441_143_.aFloatArray4916[6]) + (class441_142_.aFloatArray4916[14] * class441_143_.aFloatArray4916[10]) + (class441_142_.aFloatArray4916[15] * class441_143_.aFloatArray4916[14]));
		float f_158_ = ((class441_142_.aFloatArray4916[12] * class441_143_.aFloatArray4916[3]) + (class441_142_.aFloatArray4916[13] * class441_143_.aFloatArray4916[7]) + (class441_142_.aFloatArray4916[14] * class441_143_.aFloatArray4916[11]) + (class441_142_.aFloatArray4916[15] * class441_143_.aFloatArray4916[15]));
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_144_;
		aFloatArray4916[2] = f_145_;
		aFloatArray4916[3] = f_146_;
		aFloatArray4916[4] = f_147_;
		aFloatArray4916[5] = f_148_;
		aFloatArray4916[6] = f_149_;
		aFloatArray4916[7] = f_150_;
		aFloatArray4916[8] = f_151_;
		aFloatArray4916[9] = f_152_;
		aFloatArray4916[10] = f_153_;
		aFloatArray4916[11] = f_154_;
		aFloatArray4916[12] = f_155_;
		aFloatArray4916[13] = f_156_;
		aFloatArray4916[14] = f_157_;
		aFloatArray4916[15] = f_158_;
	}

	public void method7129(Class441 class441_159_, Class441 class441_160_) {
		float f = ((class441_159_.aFloatArray4916[0] * class441_160_.aFloatArray4916[0]) + (class441_159_.aFloatArray4916[1] * class441_160_.aFloatArray4916[4]) + (class441_159_.aFloatArray4916[2] * class441_160_.aFloatArray4916[8]) + (class441_159_.aFloatArray4916[3] * class441_160_.aFloatArray4916[12]));
		float f_161_ = ((class441_159_.aFloatArray4916[0] * class441_160_.aFloatArray4916[1]) + (class441_159_.aFloatArray4916[1] * class441_160_.aFloatArray4916[5]) + (class441_159_.aFloatArray4916[2] * class441_160_.aFloatArray4916[9]) + (class441_159_.aFloatArray4916[3] * class441_160_.aFloatArray4916[13]));
		float f_162_ = ((class441_159_.aFloatArray4916[0] * class441_160_.aFloatArray4916[2]) + (class441_159_.aFloatArray4916[1] * class441_160_.aFloatArray4916[6]) + (class441_159_.aFloatArray4916[2] * class441_160_.aFloatArray4916[10]) + (class441_159_.aFloatArray4916[3] * class441_160_.aFloatArray4916[14]));
		float f_163_ = ((class441_159_.aFloatArray4916[0] * class441_160_.aFloatArray4916[3]) + (class441_159_.aFloatArray4916[1] * class441_160_.aFloatArray4916[7]) + (class441_159_.aFloatArray4916[2] * class441_160_.aFloatArray4916[11]) + (class441_159_.aFloatArray4916[3] * class441_160_.aFloatArray4916[15]));
		float f_164_ = ((class441_159_.aFloatArray4916[4] * class441_160_.aFloatArray4916[0]) + (class441_159_.aFloatArray4916[5] * class441_160_.aFloatArray4916[4]) + (class441_159_.aFloatArray4916[6] * class441_160_.aFloatArray4916[8]) + (class441_159_.aFloatArray4916[7] * class441_160_.aFloatArray4916[12]));
		float f_165_ = ((class441_159_.aFloatArray4916[4] * class441_160_.aFloatArray4916[1]) + (class441_159_.aFloatArray4916[5] * class441_160_.aFloatArray4916[5]) + (class441_159_.aFloatArray4916[6] * class441_160_.aFloatArray4916[9]) + (class441_159_.aFloatArray4916[7] * class441_160_.aFloatArray4916[13]));
		float f_166_ = ((class441_159_.aFloatArray4916[4] * class441_160_.aFloatArray4916[2]) + (class441_159_.aFloatArray4916[5] * class441_160_.aFloatArray4916[6]) + (class441_159_.aFloatArray4916[6] * class441_160_.aFloatArray4916[10]) + (class441_159_.aFloatArray4916[7] * class441_160_.aFloatArray4916[14]));
		float f_167_ = ((class441_159_.aFloatArray4916[4] * class441_160_.aFloatArray4916[3]) + (class441_159_.aFloatArray4916[5] * class441_160_.aFloatArray4916[7]) + (class441_159_.aFloatArray4916[6] * class441_160_.aFloatArray4916[11]) + (class441_159_.aFloatArray4916[7] * class441_160_.aFloatArray4916[15]));
		float f_168_ = ((class441_159_.aFloatArray4916[8] * class441_160_.aFloatArray4916[0]) + (class441_159_.aFloatArray4916[9] * class441_160_.aFloatArray4916[4]) + (class441_159_.aFloatArray4916[10] * class441_160_.aFloatArray4916[8]) + (class441_159_.aFloatArray4916[11] * class441_160_.aFloatArray4916[12]));
		float f_169_ = ((class441_159_.aFloatArray4916[8] * class441_160_.aFloatArray4916[1]) + (class441_159_.aFloatArray4916[9] * class441_160_.aFloatArray4916[5]) + (class441_159_.aFloatArray4916[10] * class441_160_.aFloatArray4916[9]) + (class441_159_.aFloatArray4916[11] * class441_160_.aFloatArray4916[13]));
		float f_170_ = ((class441_159_.aFloatArray4916[8] * class441_160_.aFloatArray4916[2]) + (class441_159_.aFloatArray4916[9] * class441_160_.aFloatArray4916[6]) + (class441_159_.aFloatArray4916[10] * class441_160_.aFloatArray4916[10]) + (class441_159_.aFloatArray4916[11] * class441_160_.aFloatArray4916[14]));
		float f_171_ = ((class441_159_.aFloatArray4916[8] * class441_160_.aFloatArray4916[3]) + (class441_159_.aFloatArray4916[9] * class441_160_.aFloatArray4916[7]) + (class441_159_.aFloatArray4916[10] * class441_160_.aFloatArray4916[11]) + (class441_159_.aFloatArray4916[11] * class441_160_.aFloatArray4916[15]));
		float f_172_ = ((class441_159_.aFloatArray4916[12] * class441_160_.aFloatArray4916[0]) + (class441_159_.aFloatArray4916[13] * class441_160_.aFloatArray4916[4]) + (class441_159_.aFloatArray4916[14] * class441_160_.aFloatArray4916[8]) + (class441_159_.aFloatArray4916[15] * class441_160_.aFloatArray4916[12]));
		float f_173_ = ((class441_159_.aFloatArray4916[12] * class441_160_.aFloatArray4916[1]) + (class441_159_.aFloatArray4916[13] * class441_160_.aFloatArray4916[5]) + (class441_159_.aFloatArray4916[14] * class441_160_.aFloatArray4916[9]) + (class441_159_.aFloatArray4916[15] * class441_160_.aFloatArray4916[13]));
		float f_174_ = ((class441_159_.aFloatArray4916[12] * class441_160_.aFloatArray4916[2]) + (class441_159_.aFloatArray4916[13] * class441_160_.aFloatArray4916[6]) + (class441_159_.aFloatArray4916[14] * class441_160_.aFloatArray4916[10]) + (class441_159_.aFloatArray4916[15] * class441_160_.aFloatArray4916[14]));
		float f_175_ = ((class441_159_.aFloatArray4916[12] * class441_160_.aFloatArray4916[3]) + (class441_159_.aFloatArray4916[13] * class441_160_.aFloatArray4916[7]) + (class441_159_.aFloatArray4916[14] * class441_160_.aFloatArray4916[11]) + (class441_159_.aFloatArray4916[15] * class441_160_.aFloatArray4916[15]));
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_161_;
		aFloatArray4916[2] = f_162_;
		aFloatArray4916[3] = f_163_;
		aFloatArray4916[4] = f_164_;
		aFloatArray4916[5] = f_165_;
		aFloatArray4916[6] = f_166_;
		aFloatArray4916[7] = f_167_;
		aFloatArray4916[8] = f_168_;
		aFloatArray4916[9] = f_169_;
		aFloatArray4916[10] = f_170_;
		aFloatArray4916[11] = f_171_;
		aFloatArray4916[12] = f_172_;
		aFloatArray4916[13] = f_173_;
		aFloatArray4916[14] = f_174_;
		aFloatArray4916[15] = f_175_;
	}

	public float[] method7130(float[] fs) {
		System.arraycopy(aFloatArray4916, 0, fs, 0, 16);
		return fs;
	}

	public void method7131(Class441 class441_176_, Class441 class441_177_) {
		float f = ((class441_176_.aFloatArray4916[0] * class441_177_.aFloatArray4916[0]) + (class441_176_.aFloatArray4916[1] * class441_177_.aFloatArray4916[4]) + (class441_176_.aFloatArray4916[2] * class441_177_.aFloatArray4916[8]) + (class441_176_.aFloatArray4916[3] * class441_177_.aFloatArray4916[12]));
		float f_178_ = ((class441_176_.aFloatArray4916[0] * class441_177_.aFloatArray4916[1]) + (class441_176_.aFloatArray4916[1] * class441_177_.aFloatArray4916[5]) + (class441_176_.aFloatArray4916[2] * class441_177_.aFloatArray4916[9]) + (class441_176_.aFloatArray4916[3] * class441_177_.aFloatArray4916[13]));
		float f_179_ = ((class441_176_.aFloatArray4916[0] * class441_177_.aFloatArray4916[2]) + (class441_176_.aFloatArray4916[1] * class441_177_.aFloatArray4916[6]) + (class441_176_.aFloatArray4916[2] * class441_177_.aFloatArray4916[10]) + (class441_176_.aFloatArray4916[3] * class441_177_.aFloatArray4916[14]));
		float f_180_ = ((class441_176_.aFloatArray4916[0] * class441_177_.aFloatArray4916[3]) + (class441_176_.aFloatArray4916[1] * class441_177_.aFloatArray4916[7]) + (class441_176_.aFloatArray4916[2] * class441_177_.aFloatArray4916[11]) + (class441_176_.aFloatArray4916[3] * class441_177_.aFloatArray4916[15]));
		float f_181_ = ((class441_176_.aFloatArray4916[4] * class441_177_.aFloatArray4916[0]) + (class441_176_.aFloatArray4916[5] * class441_177_.aFloatArray4916[4]) + (class441_176_.aFloatArray4916[6] * class441_177_.aFloatArray4916[8]) + (class441_176_.aFloatArray4916[7] * class441_177_.aFloatArray4916[12]));
		float f_182_ = ((class441_176_.aFloatArray4916[4] * class441_177_.aFloatArray4916[1]) + (class441_176_.aFloatArray4916[5] * class441_177_.aFloatArray4916[5]) + (class441_176_.aFloatArray4916[6] * class441_177_.aFloatArray4916[9]) + (class441_176_.aFloatArray4916[7] * class441_177_.aFloatArray4916[13]));
		float f_183_ = ((class441_176_.aFloatArray4916[4] * class441_177_.aFloatArray4916[2]) + (class441_176_.aFloatArray4916[5] * class441_177_.aFloatArray4916[6]) + (class441_176_.aFloatArray4916[6] * class441_177_.aFloatArray4916[10]) + (class441_176_.aFloatArray4916[7] * class441_177_.aFloatArray4916[14]));
		float f_184_ = ((class441_176_.aFloatArray4916[4] * class441_177_.aFloatArray4916[3]) + (class441_176_.aFloatArray4916[5] * class441_177_.aFloatArray4916[7]) + (class441_176_.aFloatArray4916[6] * class441_177_.aFloatArray4916[11]) + (class441_176_.aFloatArray4916[7] * class441_177_.aFloatArray4916[15]));
		float f_185_ = ((class441_176_.aFloatArray4916[8] * class441_177_.aFloatArray4916[0]) + (class441_176_.aFloatArray4916[9] * class441_177_.aFloatArray4916[4]) + (class441_176_.aFloatArray4916[10] * class441_177_.aFloatArray4916[8]) + (class441_176_.aFloatArray4916[11] * class441_177_.aFloatArray4916[12]));
		float f_186_ = ((class441_176_.aFloatArray4916[8] * class441_177_.aFloatArray4916[1]) + (class441_176_.aFloatArray4916[9] * class441_177_.aFloatArray4916[5]) + (class441_176_.aFloatArray4916[10] * class441_177_.aFloatArray4916[9]) + (class441_176_.aFloatArray4916[11] * class441_177_.aFloatArray4916[13]));
		float f_187_ = ((class441_176_.aFloatArray4916[8] * class441_177_.aFloatArray4916[2]) + (class441_176_.aFloatArray4916[9] * class441_177_.aFloatArray4916[6]) + (class441_176_.aFloatArray4916[10] * class441_177_.aFloatArray4916[10]) + (class441_176_.aFloatArray4916[11] * class441_177_.aFloatArray4916[14]));
		float f_188_ = ((class441_176_.aFloatArray4916[8] * class441_177_.aFloatArray4916[3]) + (class441_176_.aFloatArray4916[9] * class441_177_.aFloatArray4916[7]) + (class441_176_.aFloatArray4916[10] * class441_177_.aFloatArray4916[11]) + (class441_176_.aFloatArray4916[11] * class441_177_.aFloatArray4916[15]));
		float f_189_ = ((class441_176_.aFloatArray4916[12] * class441_177_.aFloatArray4916[0]) + (class441_176_.aFloatArray4916[13] * class441_177_.aFloatArray4916[4]) + (class441_176_.aFloatArray4916[14] * class441_177_.aFloatArray4916[8]) + (class441_176_.aFloatArray4916[15] * class441_177_.aFloatArray4916[12]));
		float f_190_ = ((class441_176_.aFloatArray4916[12] * class441_177_.aFloatArray4916[1]) + (class441_176_.aFloatArray4916[13] * class441_177_.aFloatArray4916[5]) + (class441_176_.aFloatArray4916[14] * class441_177_.aFloatArray4916[9]) + (class441_176_.aFloatArray4916[15] * class441_177_.aFloatArray4916[13]));
		float f_191_ = ((class441_176_.aFloatArray4916[12] * class441_177_.aFloatArray4916[2]) + (class441_176_.aFloatArray4916[13] * class441_177_.aFloatArray4916[6]) + (class441_176_.aFloatArray4916[14] * class441_177_.aFloatArray4916[10]) + (class441_176_.aFloatArray4916[15] * class441_177_.aFloatArray4916[14]));
		float f_192_ = ((class441_176_.aFloatArray4916[12] * class441_177_.aFloatArray4916[3]) + (class441_176_.aFloatArray4916[13] * class441_177_.aFloatArray4916[7]) + (class441_176_.aFloatArray4916[14] * class441_177_.aFloatArray4916[11]) + (class441_176_.aFloatArray4916[15] * class441_177_.aFloatArray4916[15]));
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_178_;
		aFloatArray4916[2] = f_179_;
		aFloatArray4916[3] = f_180_;
		aFloatArray4916[4] = f_181_;
		aFloatArray4916[5] = f_182_;
		aFloatArray4916[6] = f_183_;
		aFloatArray4916[7] = f_184_;
		aFloatArray4916[8] = f_185_;
		aFloatArray4916[9] = f_186_;
		aFloatArray4916[10] = f_187_;
		aFloatArray4916[11] = f_188_;
		aFloatArray4916[12] = f_189_;
		aFloatArray4916[13] = f_190_;
		aFloatArray4916[14] = f_191_;
		aFloatArray4916[15] = f_192_;
	}

	public void method7132(Class441 class441_193_) {
		float f = (aFloatArray4916[0] * class441_193_.aFloatArray4916[0] + aFloatArray4916[1] * class441_193_.aFloatArray4916[4] + aFloatArray4916[2] * class441_193_.aFloatArray4916[8] + aFloatArray4916[3] * class441_193_.aFloatArray4916[12]);
		float f_194_ = (aFloatArray4916[0] * class441_193_.aFloatArray4916[1] + aFloatArray4916[1] * class441_193_.aFloatArray4916[5] + aFloatArray4916[2] * class441_193_.aFloatArray4916[9] + aFloatArray4916[3] * class441_193_.aFloatArray4916[13]);
		float f_195_ = (aFloatArray4916[0] * class441_193_.aFloatArray4916[2] + aFloatArray4916[1] * class441_193_.aFloatArray4916[6] + aFloatArray4916[2] * class441_193_.aFloatArray4916[10] + aFloatArray4916[3] * class441_193_.aFloatArray4916[14]);
		float f_196_ = (aFloatArray4916[0] * class441_193_.aFloatArray4916[3] + aFloatArray4916[1] * class441_193_.aFloatArray4916[7] + aFloatArray4916[2] * class441_193_.aFloatArray4916[11] + aFloatArray4916[3] * class441_193_.aFloatArray4916[15]);
		float f_197_ = (aFloatArray4916[4] * class441_193_.aFloatArray4916[0] + aFloatArray4916[5] * class441_193_.aFloatArray4916[4] + aFloatArray4916[6] * class441_193_.aFloatArray4916[8] + aFloatArray4916[7] * class441_193_.aFloatArray4916[12]);
		float f_198_ = (aFloatArray4916[4] * class441_193_.aFloatArray4916[1] + aFloatArray4916[5] * class441_193_.aFloatArray4916[5] + aFloatArray4916[6] * class441_193_.aFloatArray4916[9] + aFloatArray4916[7] * class441_193_.aFloatArray4916[13]);
		float f_199_ = (aFloatArray4916[4] * class441_193_.aFloatArray4916[2] + aFloatArray4916[5] * class441_193_.aFloatArray4916[6] + aFloatArray4916[6] * class441_193_.aFloatArray4916[10] + aFloatArray4916[7] * class441_193_.aFloatArray4916[14]);
		float f_200_ = (aFloatArray4916[4] * class441_193_.aFloatArray4916[3] + aFloatArray4916[5] * class441_193_.aFloatArray4916[7] + aFloatArray4916[6] * class441_193_.aFloatArray4916[11] + aFloatArray4916[7] * class441_193_.aFloatArray4916[15]);
		float f_201_ = (aFloatArray4916[8] * class441_193_.aFloatArray4916[0] + aFloatArray4916[9] * class441_193_.aFloatArray4916[4] + aFloatArray4916[10] * class441_193_.aFloatArray4916[8] + aFloatArray4916[11] * class441_193_.aFloatArray4916[12]);
		float f_202_ = (aFloatArray4916[8] * class441_193_.aFloatArray4916[1] + aFloatArray4916[9] * class441_193_.aFloatArray4916[5] + aFloatArray4916[10] * class441_193_.aFloatArray4916[9] + aFloatArray4916[11] * class441_193_.aFloatArray4916[13]);
		float f_203_ = (aFloatArray4916[8] * class441_193_.aFloatArray4916[2] + aFloatArray4916[9] * class441_193_.aFloatArray4916[6] + aFloatArray4916[10] * class441_193_.aFloatArray4916[10] + aFloatArray4916[11] * class441_193_.aFloatArray4916[14]);
		float f_204_ = (aFloatArray4916[8] * class441_193_.aFloatArray4916[3] + aFloatArray4916[9] * class441_193_.aFloatArray4916[7] + aFloatArray4916[10] * class441_193_.aFloatArray4916[11] + aFloatArray4916[11] * class441_193_.aFloatArray4916[15]);
		float f_205_ = (aFloatArray4916[12] * class441_193_.aFloatArray4916[0] + aFloatArray4916[13] * class441_193_.aFloatArray4916[4] + aFloatArray4916[14] * class441_193_.aFloatArray4916[8] + aFloatArray4916[15] * class441_193_.aFloatArray4916[12]);
		float f_206_ = (aFloatArray4916[12] * class441_193_.aFloatArray4916[1] + aFloatArray4916[13] * class441_193_.aFloatArray4916[5] + aFloatArray4916[14] * class441_193_.aFloatArray4916[9] + aFloatArray4916[15] * class441_193_.aFloatArray4916[13]);
		float f_207_ = (aFloatArray4916[12] * class441_193_.aFloatArray4916[2] + aFloatArray4916[13] * class441_193_.aFloatArray4916[6] + aFloatArray4916[14] * class441_193_.aFloatArray4916[10] + aFloatArray4916[15] * class441_193_.aFloatArray4916[14]);
		float f_208_ = (aFloatArray4916[12] * class441_193_.aFloatArray4916[3] + aFloatArray4916[13] * class441_193_.aFloatArray4916[7] + aFloatArray4916[14] * class441_193_.aFloatArray4916[11] + aFloatArray4916[15] * class441_193_.aFloatArray4916[15]);
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_194_;
		aFloatArray4916[2] = f_195_;
		aFloatArray4916[3] = f_196_;
		aFloatArray4916[4] = f_197_;
		aFloatArray4916[5] = f_198_;
		aFloatArray4916[6] = f_199_;
		aFloatArray4916[7] = f_200_;
		aFloatArray4916[8] = f_201_;
		aFloatArray4916[9] = f_202_;
		aFloatArray4916[10] = f_203_;
		aFloatArray4916[11] = f_204_;
		aFloatArray4916[12] = f_205_;
		aFloatArray4916[13] = f_206_;
		aFloatArray4916[14] = f_207_;
		aFloatArray4916[15] = f_208_;
	}

	public void method7133(Class435 class435) {
		aFloatArray4916[0] = class435.aFloat4885;
		aFloatArray4916[1] = class435.aFloat4893;
		aFloatArray4916[2] = class435.aFloat4887;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = class435.aFloat4888;
		aFloatArray4916[5] = class435.aFloat4889;
		aFloatArray4916[6] = class435.aFloat4884;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = class435.aFloat4891;
		aFloatArray4916[9] = class435.aFloat4886;
		aFloatArray4916[10] = class435.aFloat4892;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = class435.aFloat4894;
		aFloatArray4916[13] = class435.aFloat4895;
		aFloatArray4916[14] = class435.aFloat4896;
		aFloatArray4916[15] = 1.0F;
	}

	public float[] method7134(float[] fs) {
		System.arraycopy(aFloatArray4916, 0, fs, 0, 16);
		return fs;
	}

	public float[] method7135(float[] fs) {
		System.arraycopy(aFloatArray4916, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class441))
			return false;
		Class441 class441_209_ = (Class441) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4916[i] != class441_209_.aFloatArray4916[i])
				return false;
		}
		return true;
	}

	public void method7136(float f, float f_210_, float f_211_, float f_212_, float f_213_, float f_214_, float f_215_, float f_216_) {
		aFloatArray4916[0] = f_211_ * 2.0F / f_215_;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = f_212_ * 2.0F / f_216_;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 2.0F * f / f_215_ - 1.0F;
		aFloatArray4916[9] = 2.0F * f_210_ / f_216_ - 1.0F;
		aFloatArray4916[10] = (f_214_ + f_213_) / (f_214_ - f_213_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 2.0F * f_214_ * f_213_ / (f_213_ - f_214_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7137() {
		float f = 1.0F / method7091();
		float f_217_ = (aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15] - aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14] - aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15] + aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13] + aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14] - (aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13])) * f;
		float f_218_ = (-aFloatArray4916[1] * aFloatArray4916[10] * aFloatArray4916[15] + aFloatArray4916[1] * aFloatArray4916[11] * aFloatArray4916[14] + aFloatArray4916[2] * aFloatArray4916[9] * aFloatArray4916[15] - aFloatArray4916[2] * aFloatArray4916[11] * aFloatArray4916[13] - aFloatArray4916[3] * aFloatArray4916[9] * aFloatArray4916[14] + (aFloatArray4916[3] * aFloatArray4916[10] * aFloatArray4916[13])) * f;
		float f_219_ = ((aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[15] - aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[14] - aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[15] + aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[13] + aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[14] - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[13])) * f);
		float f_220_ = ((-aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] + aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] + aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] - aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] - aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] + aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9]) * f);
		float f_221_ = (-aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15] + aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14] + aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15] - aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12] - aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14] + (aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12])) * f;
		float f_222_ = (aFloatArray4916[0] * aFloatArray4916[10] * aFloatArray4916[15] - aFloatArray4916[0] * aFloatArray4916[11] * aFloatArray4916[14] - aFloatArray4916[2] * aFloatArray4916[8] * aFloatArray4916[15] + aFloatArray4916[2] * aFloatArray4916[11] * aFloatArray4916[12] + aFloatArray4916[3] * aFloatArray4916[8] * aFloatArray4916[14] - (aFloatArray4916[3] * aFloatArray4916[10] * aFloatArray4916[12])) * f;
		float f_223_ = ((-aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[15] + aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[14] + aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[15] - aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[12] - aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[14] + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[12])) * f);
		float f_224_ = ((aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] - aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] - aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] + aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] + aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] - aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8]) * f);
		float f_225_ = (aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15] - aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13] - aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15] + aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12] + aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13] - (aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_226_ = (-aFloatArray4916[0] * aFloatArray4916[9] * aFloatArray4916[15] + aFloatArray4916[0] * aFloatArray4916[11] * aFloatArray4916[13] + aFloatArray4916[1] * aFloatArray4916[8] * aFloatArray4916[15] - aFloatArray4916[1] * aFloatArray4916[11] * aFloatArray4916[12] - aFloatArray4916[3] * aFloatArray4916[8] * aFloatArray4916[13] + (aFloatArray4916[3] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_227_ = ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[15] - aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[13] - aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[15] + aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[12] + aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[13] - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[12])) * f);
		float f_228_ = ((-aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] + aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] + aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] - aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] - aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] + aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8]) * f);
		float f_229_ = (-aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14] + aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13] + aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14] - aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12] - aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13] + (aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_230_ = (aFloatArray4916[0] * aFloatArray4916[9] * aFloatArray4916[14] - aFloatArray4916[0] * aFloatArray4916[10] * aFloatArray4916[13] - aFloatArray4916[1] * aFloatArray4916[8] * aFloatArray4916[14] + aFloatArray4916[1] * aFloatArray4916[10] * aFloatArray4916[12] + aFloatArray4916[2] * aFloatArray4916[8] * aFloatArray4916[13] - (aFloatArray4916[2] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_231_ = ((-aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[14] + aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[13] + aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[14] - aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[12] - aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[13] + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[12])) * f);
		float f_232_ = ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] - aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] - aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] + aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] + aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] - aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8]) * f);
		aFloatArray4916[0] = f_217_;
		aFloatArray4916[1] = f_218_;
		aFloatArray4916[2] = f_219_;
		aFloatArray4916[3] = f_220_;
		aFloatArray4916[4] = f_221_;
		aFloatArray4916[5] = f_222_;
		aFloatArray4916[6] = f_223_;
		aFloatArray4916[7] = f_224_;
		aFloatArray4916[8] = f_225_;
		aFloatArray4916[9] = f_226_;
		aFloatArray4916[10] = f_227_;
		aFloatArray4916[11] = f_228_;
		aFloatArray4916[12] = f_229_;
		aFloatArray4916[13] = f_230_;
		aFloatArray4916[14] = f_231_;
		aFloatArray4916[15] = f_232_;
	}

	public void method7138() {
		float f = 1.0F / method7091();
		float f_233_ = (aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15] - aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14] - aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15] + aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13] + aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14] - (aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13])) * f;
		float f_234_ = (-aFloatArray4916[1] * aFloatArray4916[10] * aFloatArray4916[15] + aFloatArray4916[1] * aFloatArray4916[11] * aFloatArray4916[14] + aFloatArray4916[2] * aFloatArray4916[9] * aFloatArray4916[15] - aFloatArray4916[2] * aFloatArray4916[11] * aFloatArray4916[13] - aFloatArray4916[3] * aFloatArray4916[9] * aFloatArray4916[14] + (aFloatArray4916[3] * aFloatArray4916[10] * aFloatArray4916[13])) * f;
		float f_235_ = ((aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[15] - aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[14] - aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[15] + aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[13] + aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[14] - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[13])) * f);
		float f_236_ = ((-aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] + aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] + aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] - aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] - aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] + aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9]) * f);
		float f_237_ = (-aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15] + aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14] + aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15] - aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12] - aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14] + (aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12])) * f;
		float f_238_ = (aFloatArray4916[0] * aFloatArray4916[10] * aFloatArray4916[15] - aFloatArray4916[0] * aFloatArray4916[11] * aFloatArray4916[14] - aFloatArray4916[2] * aFloatArray4916[8] * aFloatArray4916[15] + aFloatArray4916[2] * aFloatArray4916[11] * aFloatArray4916[12] + aFloatArray4916[3] * aFloatArray4916[8] * aFloatArray4916[14] - (aFloatArray4916[3] * aFloatArray4916[10] * aFloatArray4916[12])) * f;
		float f_239_ = ((-aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[15] + aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[14] + aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[15] - aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[12] - aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[14] + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[12])) * f);
		float f_240_ = ((aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] - aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] - aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] + aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] + aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] - aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8]) * f);
		float f_241_ = (aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15] - aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13] - aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15] + aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12] + aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13] - (aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_242_ = (-aFloatArray4916[0] * aFloatArray4916[9] * aFloatArray4916[15] + aFloatArray4916[0] * aFloatArray4916[11] * aFloatArray4916[13] + aFloatArray4916[1] * aFloatArray4916[8] * aFloatArray4916[15] - aFloatArray4916[1] * aFloatArray4916[11] * aFloatArray4916[12] - aFloatArray4916[3] * aFloatArray4916[8] * aFloatArray4916[13] + (aFloatArray4916[3] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_243_ = ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[15] - aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[13] - aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[15] + aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[12] + aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[13] - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[12])) * f);
		float f_244_ = ((-aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] + aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] + aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] - aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] - aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] + aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8]) * f);
		float f_245_ = (-aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14] + aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13] + aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14] - aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12] - aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13] + (aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_246_ = (aFloatArray4916[0] * aFloatArray4916[9] * aFloatArray4916[14] - aFloatArray4916[0] * aFloatArray4916[10] * aFloatArray4916[13] - aFloatArray4916[1] * aFloatArray4916[8] * aFloatArray4916[14] + aFloatArray4916[1] * aFloatArray4916[10] * aFloatArray4916[12] + aFloatArray4916[2] * aFloatArray4916[8] * aFloatArray4916[13] - (aFloatArray4916[2] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_247_ = ((-aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[14] + aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[13] + aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[14] - aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[12] - aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[13] + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[12])) * f);
		float f_248_ = ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] - aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] - aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] + aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] + aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] - aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8]) * f);
		aFloatArray4916[0] = f_233_;
		aFloatArray4916[1] = f_234_;
		aFloatArray4916[2] = f_235_;
		aFloatArray4916[3] = f_236_;
		aFloatArray4916[4] = f_237_;
		aFloatArray4916[5] = f_238_;
		aFloatArray4916[6] = f_239_;
		aFloatArray4916[7] = f_240_;
		aFloatArray4916[8] = f_241_;
		aFloatArray4916[9] = f_242_;
		aFloatArray4916[10] = f_243_;
		aFloatArray4916[11] = f_244_;
		aFloatArray4916[12] = f_245_;
		aFloatArray4916[13] = f_246_;
		aFloatArray4916[14] = f_247_;
		aFloatArray4916[15] = f_248_;
	}

	public void method7139(float f, float f_249_, float f_250_, float f_251_) {
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = f_249_;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = f_250_;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 0.0F;
		aFloatArray4916[15] = f_251_;
	}

	public boolean method7140() {
		return (aFloatArray4916[0] == 1.0F && aFloatArray4916[1] == 0.0F && aFloatArray4916[2] == 0.0F && aFloatArray4916[3] == 0.0F && aFloatArray4916[4] == 0.0F && aFloatArray4916[5] == 1.0F && aFloatArray4916[6] == 0.0F && aFloatArray4916[7] == 0.0F && aFloatArray4916[8] == 0.0F && aFloatArray4916[9] == 0.0F && aFloatArray4916[10] == 1.0F && aFloatArray4916[11] == 0.0F && aFloatArray4916[12] == 0.0F && aFloatArray4916[13] == 0.0F && aFloatArray4916[14] == 0.0F && aFloatArray4916[15] == 1.0F);
	}

	public boolean method7141() {
		return (aFloatArray4916[0] == 1.0F && aFloatArray4916[1] == 0.0F && aFloatArray4916[2] == 0.0F && aFloatArray4916[3] == 0.0F && aFloatArray4916[4] == 0.0F && aFloatArray4916[5] == 1.0F && aFloatArray4916[6] == 0.0F && aFloatArray4916[7] == 0.0F && aFloatArray4916[8] == 0.0F && aFloatArray4916[9] == 0.0F && aFloatArray4916[10] == 1.0F && aFloatArray4916[11] == 0.0F && aFloatArray4916[12] == 0.0F && aFloatArray4916[13] == 0.0F && aFloatArray4916[14] == 0.0F && aFloatArray4916[15] == 1.0F);
	}

	public boolean method7142() {
		return (aFloatArray4916[0] == 1.0F && aFloatArray4916[1] == 0.0F && aFloatArray4916[2] == 0.0F && aFloatArray4916[3] == 0.0F && aFloatArray4916[4] == 0.0F && aFloatArray4916[5] == 1.0F && aFloatArray4916[6] == 0.0F && aFloatArray4916[7] == 0.0F && aFloatArray4916[8] == 0.0F && aFloatArray4916[9] == 0.0F && aFloatArray4916[10] == 1.0F && aFloatArray4916[11] == 0.0F && aFloatArray4916[12] == 0.0F && aFloatArray4916[13] == 0.0F && aFloatArray4916[14] == 0.0F && aFloatArray4916[15] == 1.0F);
	}

	public void method7143(float f, float f_252_, float f_253_, float f_254_, float f_255_, float f_256_, float f_257_, float f_258_, float f_259_) {
		method7098(-(f * f_259_) / f_253_, f_259_ * (f_257_ - f) / f_253_, -(f_252_ * f_259_) / f_254_, f_259_ * (f_258_ - f_252_) / f_254_, f_255_, f_256_);
	}

	public void method7144(float f, float f_260_, float f_261_, float[] fs) {
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_260_ + aFloatArray4916[8] * f_261_ + aFloatArray4916[12]);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_260_ + aFloatArray4916[9] * f_261_ + aFloatArray4916[13]);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_260_ + aFloatArray4916[10] * f_261_ + aFloatArray4916[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4916[3] * f + aFloatArray4916[7] * f_260_ + aFloatArray4916[11] * f_261_ + aFloatArray4916[15]);
	}

	public void method7145(float[] fs) {
		float f = fs[0];
		float f_262_ = fs[1];
		float f_263_ = fs[2];
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_262_ + aFloatArray4916[8] * f_263_ + aFloatArray4916[12]);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_262_ + aFloatArray4916[9] * f_263_ + aFloatArray4916[13]);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_262_ + aFloatArray4916[10] * f_263_ + aFloatArray4916[14]);
	}

	public float[] method7146(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[1];
		fs[2] = aFloatArray4916[2];
		fs[3] = aFloatArray4916[4];
		fs[4] = aFloatArray4916[5];
		fs[5] = aFloatArray4916[6];
		fs[6] = aFloatArray4916[8];
		fs[7] = aFloatArray4916[9];
		fs[8] = aFloatArray4916[10];
		return fs;
	}

	public void method7147(float f, float f_264_, float f_265_, float[] fs) {
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_264_ + aFloatArray4916[8] * f_265_);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_264_ + aFloatArray4916[9] * f_265_);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_264_ + aFloatArray4916[10] * f_265_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4916[3] * f + aFloatArray4916[7] * f_264_ + aFloatArray4916[11] * f_265_);
	}

	public void method7148(float f, float f_266_, float f_267_, float[] fs) {
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_266_ + aFloatArray4916[8] * f_267_);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_266_ + aFloatArray4916[9] * f_267_);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_266_ + aFloatArray4916[10] * f_267_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4916[3] * f + aFloatArray4916[7] * f_266_ + aFloatArray4916[11] * f_267_);
	}

	public void method7149(float f, float f_268_, float f_269_, float f_270_, float f_271_, float f_272_) {
		aFloatArray4916[0] = 2.0F / (f_268_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F / (f_270_ - f_269_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = 2.0F / (f_272_ - f_271_);
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = -(f_268_ + f) / (f_268_ - f);
		aFloatArray4916[13] = -(f_270_ + f_269_) / (f_270_ - f_269_);
		aFloatArray4916[14] = -(f_272_ + f_271_) / (f_272_ - f_271_);
		aFloatArray4916[15] = 1.0F;
	}

	public void method7150(float f, float f_273_, float f_274_, float f_275_, float f_276_, float f_277_) {
		aFloatArray4916[0] = 2.0F / (f_273_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F / (f_275_ - f_274_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = 2.0F / (f_277_ - f_276_);
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = -(f_273_ + f) / (f_273_ - f);
		aFloatArray4916[13] = -(f_275_ + f_274_) / (f_275_ - f_274_);
		aFloatArray4916[14] = -(f_277_ + f_276_) / (f_277_ - f_276_);
		aFloatArray4916[15] = 1.0F;
	}

	public void method7151(float f, float f_278_, float f_279_, float f_280_, float f_281_, float f_282_) {
		aFloatArray4916[0] = 2.0F / (f_278_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F / (f_280_ - f_279_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 0.0F;
		aFloatArray4916[9] = 0.0F;
		aFloatArray4916[10] = 2.0F / (f_282_ - f_281_);
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = -(f_278_ + f) / (f_278_ - f);
		aFloatArray4916[13] = -(f_280_ + f_279_) / (f_280_ - f_279_);
		aFloatArray4916[14] = -(f_282_ + f_281_) / (f_282_ - f_281_);
		aFloatArray4916[15] = 1.0F;
	}

	public void method7152(float f, float f_283_, float f_284_, float f_285_) {
		float f_286_ = (float) (Math.tan((double) (f_284_ / 2.0F)) * (double) f);
		float f_287_ = (float) (Math.tan((double) (f_285_ / 2.0F)) * (double) f);
		method7112(-f_286_, f_286_, -f_287_, f_287_, f, f_283_);
	}

	float method7153() {
		return ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15]) - (aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15]) + (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13]) + (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13]) - (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15]) + (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15]) - (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12]) - (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15]) - (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15]) + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14]) + (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14]) - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12]));
	}

	public void method7154(float f, float f_288_, float f_289_) {
		method7098(-10000.0F / f_289_, 10000.0F / f_289_, -10000.0F / f_289_, 10000.0F / f_289_, f, f_288_);
	}

	public void method7155(float f, float f_290_, float f_291_) {
		method7098(-10000.0F / f_291_, 10000.0F / f_291_, -10000.0F / f_291_, 10000.0F / f_291_, f, f_290_);
	}

	float method7156() {
		return ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15]) - (aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15]) + (aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13]) + (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14]) - (aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13]) - (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15]) + (aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15]) - (aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12]) - (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14]) + (aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15]) - (aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15]) + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12]) + (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13]) - (aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14]) + (aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14]) - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12]) - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13]) + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12]));
	}

	void method7157(float f, float f_292_, float f_293_, float f_294_, float f_295_, float f_296_) {
		aFloatArray4916[0] = 2.0F * f_295_ / (f_292_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_295_ / (f_294_ - f_293_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_292_ + f) / (f_292_ - f);
		aFloatArray4916[9] = (f_294_ + f_293_) / (f_294_ - f_293_);
		aFloatArray4916[10] = (f_296_ + f_295_) / (f_296_ - f_295_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_296_ * f_295_) / (f_296_ - f_295_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7158(Class435 class435) {
		aFloatArray4916[0] = class435.aFloat4885;
		aFloatArray4916[1] = class435.aFloat4893;
		aFloatArray4916[2] = class435.aFloat4887;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = class435.aFloat4888;
		aFloatArray4916[5] = class435.aFloat4889;
		aFloatArray4916[6] = class435.aFloat4884;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = class435.aFloat4891;
		aFloatArray4916[9] = class435.aFloat4886;
		aFloatArray4916[10] = class435.aFloat4892;
		aFloatArray4916[11] = 0.0F;
		aFloatArray4916[12] = class435.aFloat4894;
		aFloatArray4916[13] = class435.aFloat4895;
		aFloatArray4916[14] = class435.aFloat4896;
		aFloatArray4916[15] = 1.0F;
	}

	public float[] method7159(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		return fs;
	}

	void method7160(float f, float f_297_, float f_298_, float f_299_, float f_300_, float f_301_) {
		aFloatArray4916[0] = 2.0F * f_300_ / (f_297_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_300_ / (f_299_ - f_298_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_297_ + f) / (f_297_ - f);
		aFloatArray4916[9] = (f_299_ + f_298_) / (f_299_ - f_298_);
		aFloatArray4916[10] = (f_301_ + f_300_) / (f_301_ - f_300_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_301_ * f_300_) / (f_301_ - f_300_);
		aFloatArray4916[15] = 0.0F;
	}

	public float method7161() {
		return ((aFloatArray4916[14] - aFloatArray4916[15]) / (aFloatArray4916[11] - aFloatArray4916[10]));
	}

	public void method7162(float f, float f_302_, float f_303_) {
		method7098(-10000.0F / f_303_, 10000.0F / f_303_, -10000.0F / f_303_, 10000.0F / f_303_, f, f_302_);
	}

	public void method7163() {
		float f = 1.0F / method7091();
		float f_304_ = (aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[15] - aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[14] - aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[15] + aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[13] + aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[14] - (aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[13])) * f;
		float f_305_ = (-aFloatArray4916[1] * aFloatArray4916[10] * aFloatArray4916[15] + aFloatArray4916[1] * aFloatArray4916[11] * aFloatArray4916[14] + aFloatArray4916[2] * aFloatArray4916[9] * aFloatArray4916[15] - aFloatArray4916[2] * aFloatArray4916[11] * aFloatArray4916[13] - aFloatArray4916[3] * aFloatArray4916[9] * aFloatArray4916[14] + (aFloatArray4916[3] * aFloatArray4916[10] * aFloatArray4916[13])) * f;
		float f_306_ = ((aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[15] - aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[14] - aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[15] + aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[13] + aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[14] - (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[13])) * f);
		float f_307_ = ((-aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[11] + aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[10] + aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[11] - aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[9] - aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[10] + aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[9]) * f);
		float f_308_ = (-aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[15] + aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[14] + aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[15] - aFloatArray4916[6] * aFloatArray4916[11] * aFloatArray4916[12] - aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[14] + (aFloatArray4916[7] * aFloatArray4916[10] * aFloatArray4916[12])) * f;
		float f_309_ = (aFloatArray4916[0] * aFloatArray4916[10] * aFloatArray4916[15] - aFloatArray4916[0] * aFloatArray4916[11] * aFloatArray4916[14] - aFloatArray4916[2] * aFloatArray4916[8] * aFloatArray4916[15] + aFloatArray4916[2] * aFloatArray4916[11] * aFloatArray4916[12] + aFloatArray4916[3] * aFloatArray4916[8] * aFloatArray4916[14] - (aFloatArray4916[3] * aFloatArray4916[10] * aFloatArray4916[12])) * f;
		float f_310_ = ((-aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[15] + aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[14] + aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[15] - aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[12] - aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[14] + (aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[12])) * f);
		float f_311_ = ((aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[11] - aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[10] - aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[11] + aFloatArray4916[2] * aFloatArray4916[7] * aFloatArray4916[8] + aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[10] - aFloatArray4916[3] * aFloatArray4916[6] * aFloatArray4916[8]) * f);
		float f_312_ = (aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[15] - aFloatArray4916[4] * aFloatArray4916[11] * aFloatArray4916[13] - aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[15] + aFloatArray4916[5] * aFloatArray4916[11] * aFloatArray4916[12] + aFloatArray4916[7] * aFloatArray4916[8] * aFloatArray4916[13] - (aFloatArray4916[7] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_313_ = (-aFloatArray4916[0] * aFloatArray4916[9] * aFloatArray4916[15] + aFloatArray4916[0] * aFloatArray4916[11] * aFloatArray4916[13] + aFloatArray4916[1] * aFloatArray4916[8] * aFloatArray4916[15] - aFloatArray4916[1] * aFloatArray4916[11] * aFloatArray4916[12] - aFloatArray4916[3] * aFloatArray4916[8] * aFloatArray4916[13] + (aFloatArray4916[3] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_314_ = ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[15] - aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[13] - aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[15] + aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[12] + aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[13] - (aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[12])) * f);
		float f_315_ = ((-aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[11] + aFloatArray4916[0] * aFloatArray4916[7] * aFloatArray4916[9] + aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[11] - aFloatArray4916[1] * aFloatArray4916[7] * aFloatArray4916[8] - aFloatArray4916[3] * aFloatArray4916[4] * aFloatArray4916[9] + aFloatArray4916[3] * aFloatArray4916[5] * aFloatArray4916[8]) * f);
		float f_316_ = (-aFloatArray4916[4] * aFloatArray4916[9] * aFloatArray4916[14] + aFloatArray4916[4] * aFloatArray4916[10] * aFloatArray4916[13] + aFloatArray4916[5] * aFloatArray4916[8] * aFloatArray4916[14] - aFloatArray4916[5] * aFloatArray4916[10] * aFloatArray4916[12] - aFloatArray4916[6] * aFloatArray4916[8] * aFloatArray4916[13] + (aFloatArray4916[6] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_317_ = (aFloatArray4916[0] * aFloatArray4916[9] * aFloatArray4916[14] - aFloatArray4916[0] * aFloatArray4916[10] * aFloatArray4916[13] - aFloatArray4916[1] * aFloatArray4916[8] * aFloatArray4916[14] + aFloatArray4916[1] * aFloatArray4916[10] * aFloatArray4916[12] + aFloatArray4916[2] * aFloatArray4916[8] * aFloatArray4916[13] - (aFloatArray4916[2] * aFloatArray4916[9] * aFloatArray4916[12])) * f;
		float f_318_ = ((-aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[14] + aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[13] + aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[14] - aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[12] - aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[13] + (aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[12])) * f);
		float f_319_ = ((aFloatArray4916[0] * aFloatArray4916[5] * aFloatArray4916[10] - aFloatArray4916[0] * aFloatArray4916[6] * aFloatArray4916[9] - aFloatArray4916[1] * aFloatArray4916[4] * aFloatArray4916[10] + aFloatArray4916[1] * aFloatArray4916[6] * aFloatArray4916[8] + aFloatArray4916[2] * aFloatArray4916[4] * aFloatArray4916[9] - aFloatArray4916[2] * aFloatArray4916[5] * aFloatArray4916[8]) * f);
		aFloatArray4916[0] = f_304_;
		aFloatArray4916[1] = f_305_;
		aFloatArray4916[2] = f_306_;
		aFloatArray4916[3] = f_307_;
		aFloatArray4916[4] = f_308_;
		aFloatArray4916[5] = f_309_;
		aFloatArray4916[6] = f_310_;
		aFloatArray4916[7] = f_311_;
		aFloatArray4916[8] = f_312_;
		aFloatArray4916[9] = f_313_;
		aFloatArray4916[10] = f_314_;
		aFloatArray4916[11] = f_315_;
		aFloatArray4916[12] = f_316_;
		aFloatArray4916[13] = f_317_;
		aFloatArray4916[14] = f_318_;
		aFloatArray4916[15] = f_319_;
	}

	public void method7164(float f, float f_320_, float f_321_, float f_322_, float f_323_, float f_324_, float f_325_, float f_326_) {
		aFloatArray4916[0] = f_321_ * 2.0F / f_325_;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = f_322_ * 2.0F / f_326_;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 2.0F * f / f_325_ - 1.0F;
		aFloatArray4916[9] = 2.0F * f_320_ / f_326_ - 1.0F;
		aFloatArray4916[10] = (f_324_ + f_323_) / (f_324_ - f_323_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 2.0F * f_324_ * f_323_ / (f_323_ - f_324_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7165(float f, float f_327_, float f_328_, float f_329_, float f_330_, float f_331_, float f_332_, float f_333_, float f_334_) {
		method7098(-(f * f_334_) / f_328_, f_334_ * (f_332_ - f) / f_328_, -(f_327_ * f_334_) / f_329_, f_334_ * (f_333_ - f_327_) / f_329_, f_330_, f_331_);
	}

	public float method7166() {
		return (-(aFloatArray4916[15] + aFloatArray4916[14]) / (aFloatArray4916[11] + aFloatArray4916[10]));
	}

	public float method7167() {
		return (-(aFloatArray4916[15] + aFloatArray4916[14]) / (aFloatArray4916[11] + aFloatArray4916[10]));
	}

	void method7168(float f, float f_335_, float f_336_, float f_337_, float f_338_, float f_339_) {
		aFloatArray4916[0] = 2.0F * f_338_ / (f_335_ - f);
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = 2.0F * f_338_ / (f_337_ - f_336_);
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = (f_335_ + f) / (f_335_ - f);
		aFloatArray4916[9] = (f_337_ + f_336_) / (f_337_ - f_336_);
		aFloatArray4916[10] = (f_339_ + f_338_) / (f_339_ - f_338_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = -(2.0F * f_339_ * f_338_) / (f_339_ - f_338_);
		aFloatArray4916[15] = 0.0F;
	}

	public void method7169(float f, float f_340_, float f_341_, float f_342_, float f_343_, float f_344_, float f_345_, float f_346_) {
		aFloatArray4916[0] = f_341_ * 2.0F / f_345_;
		aFloatArray4916[1] = 0.0F;
		aFloatArray4916[2] = 0.0F;
		aFloatArray4916[3] = 0.0F;
		aFloatArray4916[4] = 0.0F;
		aFloatArray4916[5] = f_342_ * 2.0F / f_346_;
		aFloatArray4916[6] = 0.0F;
		aFloatArray4916[7] = 0.0F;
		aFloatArray4916[8] = 2.0F * f / f_345_ - 1.0F;
		aFloatArray4916[9] = 2.0F * f_340_ / f_346_ - 1.0F;
		aFloatArray4916[10] = (f_344_ + f_343_) / (f_344_ - f_343_);
		aFloatArray4916[11] = 1.0F;
		aFloatArray4916[12] = 0.0F;
		aFloatArray4916[13] = 0.0F;
		aFloatArray4916[14] = 2.0F * f_344_ * f_343_ / (f_343_ - f_344_);
		aFloatArray4916[15] = 0.0F;
	}

	public float method7170() {
		return ((aFloatArray4916[14] - aFloatArray4916[15]) / (aFloatArray4916[11] - aFloatArray4916[10]));
	}

	public void method7171(int i, int i_347_, int i_348_, float f, float f_349_, float f_350_) {
		if (i != 0) {
			float f_351_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_352_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloatArray4916[0] = f_351_ * (float) i_347_;
			aFloatArray4916[5] = f_351_ * (float) i_348_;
			aFloatArray4916[1] = f_352_ * (float) i_347_;
			aFloatArray4916[4] = -f_352_ * (float) i_348_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_353_ = aFloatArray4916;
			float[] fs_354_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_354_[8] = 0.0F;
			fs_353_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4916[0] = (float) i_347_;
			aFloatArray4916[5] = (float) i_348_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_355_ = aFloatArray4916;
			float[] fs_356_ = aFloatArray4916;
			float[] fs_357_ = aFloatArray4916;
			float[] fs_358_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_358_[8] = 0.0F;
			fs_357_[6] = 0.0F;
			fs_356_[4] = 0.0F;
			fs_355_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4916;
		float[] fs_359_ = aFloatArray4916;
		aFloatArray4916[11] = 0.0F;
		fs_359_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4916[15] = 1.0F;
		aFloatArray4916[12] = f;
		aFloatArray4916[13] = f_349_;
		aFloatArray4916[14] = f_350_;
	}

	public void method7172(Class441 class441_360_, Class441 class441_361_) {
		float f = ((class441_360_.aFloatArray4916[0] * class441_361_.aFloatArray4916[0]) + (class441_360_.aFloatArray4916[1] * class441_361_.aFloatArray4916[4]) + (class441_360_.aFloatArray4916[2] * class441_361_.aFloatArray4916[8]) + (class441_360_.aFloatArray4916[3] * class441_361_.aFloatArray4916[12]));
		float f_362_ = ((class441_360_.aFloatArray4916[0] * class441_361_.aFloatArray4916[1]) + (class441_360_.aFloatArray4916[1] * class441_361_.aFloatArray4916[5]) + (class441_360_.aFloatArray4916[2] * class441_361_.aFloatArray4916[9]) + (class441_360_.aFloatArray4916[3] * class441_361_.aFloatArray4916[13]));
		float f_363_ = ((class441_360_.aFloatArray4916[0] * class441_361_.aFloatArray4916[2]) + (class441_360_.aFloatArray4916[1] * class441_361_.aFloatArray4916[6]) + (class441_360_.aFloatArray4916[2] * class441_361_.aFloatArray4916[10]) + (class441_360_.aFloatArray4916[3] * class441_361_.aFloatArray4916[14]));
		float f_364_ = ((class441_360_.aFloatArray4916[0] * class441_361_.aFloatArray4916[3]) + (class441_360_.aFloatArray4916[1] * class441_361_.aFloatArray4916[7]) + (class441_360_.aFloatArray4916[2] * class441_361_.aFloatArray4916[11]) + (class441_360_.aFloatArray4916[3] * class441_361_.aFloatArray4916[15]));
		float f_365_ = ((class441_360_.aFloatArray4916[4] * class441_361_.aFloatArray4916[0]) + (class441_360_.aFloatArray4916[5] * class441_361_.aFloatArray4916[4]) + (class441_360_.aFloatArray4916[6] * class441_361_.aFloatArray4916[8]) + (class441_360_.aFloatArray4916[7] * class441_361_.aFloatArray4916[12]));
		float f_366_ = ((class441_360_.aFloatArray4916[4] * class441_361_.aFloatArray4916[1]) + (class441_360_.aFloatArray4916[5] * class441_361_.aFloatArray4916[5]) + (class441_360_.aFloatArray4916[6] * class441_361_.aFloatArray4916[9]) + (class441_360_.aFloatArray4916[7] * class441_361_.aFloatArray4916[13]));
		float f_367_ = ((class441_360_.aFloatArray4916[4] * class441_361_.aFloatArray4916[2]) + (class441_360_.aFloatArray4916[5] * class441_361_.aFloatArray4916[6]) + (class441_360_.aFloatArray4916[6] * class441_361_.aFloatArray4916[10]) + (class441_360_.aFloatArray4916[7] * class441_361_.aFloatArray4916[14]));
		float f_368_ = ((class441_360_.aFloatArray4916[4] * class441_361_.aFloatArray4916[3]) + (class441_360_.aFloatArray4916[5] * class441_361_.aFloatArray4916[7]) + (class441_360_.aFloatArray4916[6] * class441_361_.aFloatArray4916[11]) + (class441_360_.aFloatArray4916[7] * class441_361_.aFloatArray4916[15]));
		float f_369_ = ((class441_360_.aFloatArray4916[8] * class441_361_.aFloatArray4916[0]) + (class441_360_.aFloatArray4916[9] * class441_361_.aFloatArray4916[4]) + (class441_360_.aFloatArray4916[10] * class441_361_.aFloatArray4916[8]) + (class441_360_.aFloatArray4916[11] * class441_361_.aFloatArray4916[12]));
		float f_370_ = ((class441_360_.aFloatArray4916[8] * class441_361_.aFloatArray4916[1]) + (class441_360_.aFloatArray4916[9] * class441_361_.aFloatArray4916[5]) + (class441_360_.aFloatArray4916[10] * class441_361_.aFloatArray4916[9]) + (class441_360_.aFloatArray4916[11] * class441_361_.aFloatArray4916[13]));
		float f_371_ = ((class441_360_.aFloatArray4916[8] * class441_361_.aFloatArray4916[2]) + (class441_360_.aFloatArray4916[9] * class441_361_.aFloatArray4916[6]) + (class441_360_.aFloatArray4916[10] * class441_361_.aFloatArray4916[10]) + (class441_360_.aFloatArray4916[11] * class441_361_.aFloatArray4916[14]));
		float f_372_ = ((class441_360_.aFloatArray4916[8] * class441_361_.aFloatArray4916[3]) + (class441_360_.aFloatArray4916[9] * class441_361_.aFloatArray4916[7]) + (class441_360_.aFloatArray4916[10] * class441_361_.aFloatArray4916[11]) + (class441_360_.aFloatArray4916[11] * class441_361_.aFloatArray4916[15]));
		float f_373_ = ((class441_360_.aFloatArray4916[12] * class441_361_.aFloatArray4916[0]) + (class441_360_.aFloatArray4916[13] * class441_361_.aFloatArray4916[4]) + (class441_360_.aFloatArray4916[14] * class441_361_.aFloatArray4916[8]) + (class441_360_.aFloatArray4916[15] * class441_361_.aFloatArray4916[12]));
		float f_374_ = ((class441_360_.aFloatArray4916[12] * class441_361_.aFloatArray4916[1]) + (class441_360_.aFloatArray4916[13] * class441_361_.aFloatArray4916[5]) + (class441_360_.aFloatArray4916[14] * class441_361_.aFloatArray4916[9]) + (class441_360_.aFloatArray4916[15] * class441_361_.aFloatArray4916[13]));
		float f_375_ = ((class441_360_.aFloatArray4916[12] * class441_361_.aFloatArray4916[2]) + (class441_360_.aFloatArray4916[13] * class441_361_.aFloatArray4916[6]) + (class441_360_.aFloatArray4916[14] * class441_361_.aFloatArray4916[10]) + (class441_360_.aFloatArray4916[15] * class441_361_.aFloatArray4916[14]));
		float f_376_ = ((class441_360_.aFloatArray4916[12] * class441_361_.aFloatArray4916[3]) + (class441_360_.aFloatArray4916[13] * class441_361_.aFloatArray4916[7]) + (class441_360_.aFloatArray4916[14] * class441_361_.aFloatArray4916[11]) + (class441_360_.aFloatArray4916[15] * class441_361_.aFloatArray4916[15]));
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_362_;
		aFloatArray4916[2] = f_363_;
		aFloatArray4916[3] = f_364_;
		aFloatArray4916[4] = f_365_;
		aFloatArray4916[5] = f_366_;
		aFloatArray4916[6] = f_367_;
		aFloatArray4916[7] = f_368_;
		aFloatArray4916[8] = f_369_;
		aFloatArray4916[9] = f_370_;
		aFloatArray4916[10] = f_371_;
		aFloatArray4916[11] = f_372_;
		aFloatArray4916[12] = f_373_;
		aFloatArray4916[13] = f_374_;
		aFloatArray4916[14] = f_375_;
		aFloatArray4916[15] = f_376_;
	}

	public float[] method7173(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[0];
		float f_377_ = aFloatArray4916[7] + aFloatArray4916[4];
		float f_378_ = aFloatArray4916[11] + aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_377_ * f_377_ + f_378_ * f_378_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_377_ / d);
		fs[2] = (float) ((double) f_378_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[12]) / d);
		return fs;
	}

	public float method7174() {
		return (-(aFloatArray4916[15] + aFloatArray4916[14]) / (aFloatArray4916[11] + aFloatArray4916[10]));
	}

	public float[] method7175(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[0];
		float f_379_ = aFloatArray4916[7] - aFloatArray4916[4];
		float f_380_ = aFloatArray4916[11] - aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_379_ * f_379_ + f_380_ * f_380_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_379_ / d);
		fs[2] = (float) ((double) f_380_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[12]) / d);
		return fs;
	}

	public float[] method7176(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[0];
		float f_381_ = aFloatArray4916[7] - aFloatArray4916[4];
		float f_382_ = aFloatArray4916[11] - aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_381_ * f_381_ + f_382_ * f_382_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_381_ / d);
		fs[2] = (float) ((double) f_382_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[12]) / d);
		return fs;
	}

	public float[] method7177(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[0];
		float f_383_ = aFloatArray4916[7] - aFloatArray4916[4];
		float f_384_ = aFloatArray4916[11] - aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_383_ * f_383_ + f_384_ * f_384_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_383_ / d);
		fs[2] = (float) ((double) f_384_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[12]) / d);
		return fs;
	}

	public float[] method7178(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[1];
		float f_385_ = aFloatArray4916[7] + aFloatArray4916[5];
		float f_386_ = aFloatArray4916[11] + aFloatArray4916[9];
		double d = Math.sqrt((double) (f * f + f_385_ * f_385_ + f_386_ * f_386_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_385_ / d);
		fs[2] = (float) ((double) f_386_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[13]) / d);
		return fs;
	}

	public float[] method7179(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[1];
		float f_387_ = aFloatArray4916[7] - aFloatArray4916[5];
		float f_388_ = aFloatArray4916[11] - aFloatArray4916[9];
		double d = Math.sqrt((double) (f * f + f_387_ * f_387_ + f_388_ * f_388_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_387_ / d);
		fs[2] = (float) ((double) f_388_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[13]) / d);
		return fs;
	}

	public float[] method7180(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[1];
		float f_389_ = aFloatArray4916[7] - aFloatArray4916[5];
		float f_390_ = aFloatArray4916[11] - aFloatArray4916[9];
		double d = Math.sqrt((double) (f * f + f_389_ * f_389_ + f_390_ * f_390_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_389_ / d);
		fs[2] = (float) ((double) f_390_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[13]) / d);
		return fs;
	}

	public float[] method7181(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[2];
		float f_391_ = aFloatArray4916[7] + aFloatArray4916[6];
		float f_392_ = aFloatArray4916[11] + aFloatArray4916[10];
		double d = Math.sqrt((double) (f * f + f_391_ * f_391_ + f_392_ * f_392_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_391_ / d);
		fs[2] = (float) ((double) f_392_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[14]) / d);
		return fs;
	}

	public float[] method7182(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[2];
		float f_393_ = aFloatArray4916[7] - aFloatArray4916[6];
		float f_394_ = aFloatArray4916[11] - aFloatArray4916[10];
		double d = Math.sqrt((double) (f * f + f_393_ * f_393_ + f_394_ * f_394_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_393_ / d);
		fs[2] = (float) ((double) f_394_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[14]) / d);
		return fs;
	}

	public float[] method7183(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[2];
		float f_395_ = aFloatArray4916[7] - aFloatArray4916[6];
		float f_396_ = aFloatArray4916[11] - aFloatArray4916[10];
		double d = Math.sqrt((double) (f * f + f_395_ * f_395_ + f_396_ * f_396_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_395_ / d);
		fs[2] = (float) ((double) f_396_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[14]) / d);
		return fs;
	}

	public float[] method7184(float[] fs) {
		float f = aFloatArray4916[3] - aFloatArray4916[1];
		float f_397_ = aFloatArray4916[7] - aFloatArray4916[5];
		float f_398_ = aFloatArray4916[11] - aFloatArray4916[9];
		double d = Math.sqrt((double) (f * f + f_397_ * f_397_ + f_398_ * f_398_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_397_ / d);
		fs[2] = (float) ((double) f_398_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] - aFloatArray4916[13]) / d);
		return fs;
	}

	public void method7185(float f, float f_399_, float f_400_, float[] fs) {
		fs[0] = (aFloatArray4916[0] * f + aFloatArray4916[4] * f_399_ + aFloatArray4916[8] * f_400_ + aFloatArray4916[12]);
		fs[1] = (aFloatArray4916[1] * f + aFloatArray4916[5] * f_399_ + aFloatArray4916[9] * f_400_ + aFloatArray4916[13]);
		fs[2] = (aFloatArray4916[2] * f + aFloatArray4916[6] * f_399_ + aFloatArray4916[10] * f_400_ + aFloatArray4916[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4916[3] * f + aFloatArray4916[7] * f_399_ + aFloatArray4916[11] * f_400_ + aFloatArray4916[15]);
	}

	public void method7186() {
		float f = aFloatArray4916[0];
		float f_401_ = aFloatArray4916[4];
		float f_402_ = aFloatArray4916[8];
		float f_403_ = aFloatArray4916[12];
		float f_404_ = aFloatArray4916[1];
		float f_405_ = aFloatArray4916[5];
		float f_406_ = aFloatArray4916[9];
		float f_407_ = aFloatArray4916[13];
		float f_408_ = aFloatArray4916[2];
		float f_409_ = aFloatArray4916[6];
		float f_410_ = aFloatArray4916[10];
		float f_411_ = aFloatArray4916[14];
		float f_412_ = aFloatArray4916[3];
		float f_413_ = aFloatArray4916[7];
		float f_414_ = aFloatArray4916[11];
		float f_415_ = aFloatArray4916[15];
		aFloatArray4916[0] = f;
		aFloatArray4916[1] = f_401_;
		aFloatArray4916[2] = f_402_;
		aFloatArray4916[3] = f_403_;
		aFloatArray4916[4] = f_404_;
		aFloatArray4916[5] = f_405_;
		aFloatArray4916[6] = f_406_;
		aFloatArray4916[7] = f_407_;
		aFloatArray4916[8] = f_408_;
		aFloatArray4916[9] = f_409_;
		aFloatArray4916[10] = f_410_;
		aFloatArray4916[11] = f_411_;
		aFloatArray4916[12] = f_412_;
		aFloatArray4916[13] = f_413_;
		aFloatArray4916[14] = f_414_;
		aFloatArray4916[15] = f_415_;
	}

	public String method7187() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_416_ = 0; i_416_ < 4; i_416_++) {
				if (i_416_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4916[i * 4 + i_416_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public void method7188(int i, int i_417_, int i_418_, float f, float f_419_, float f_420_) {
		if (i != 0) {
			float f_421_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_422_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloatArray4916[0] = f_421_ * (float) i_417_;
			aFloatArray4916[5] = f_421_ * (float) i_418_;
			aFloatArray4916[1] = f_422_ * (float) i_417_;
			aFloatArray4916[4] = -f_422_ * (float) i_418_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_423_ = aFloatArray4916;
			float[] fs_424_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_424_[8] = 0.0F;
			fs_423_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4916[0] = (float) i_417_;
			aFloatArray4916[5] = (float) i_418_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_425_ = aFloatArray4916;
			float[] fs_426_ = aFloatArray4916;
			float[] fs_427_ = aFloatArray4916;
			float[] fs_428_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_428_[8] = 0.0F;
			fs_427_[6] = 0.0F;
			fs_426_[4] = 0.0F;
			fs_425_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4916;
		float[] fs_429_ = aFloatArray4916;
		aFloatArray4916[11] = 0.0F;
		fs_429_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4916[15] = 1.0F;
		aFloatArray4916[12] = f;
		aFloatArray4916[13] = f_419_;
		aFloatArray4916[14] = f_420_;
	}

	public float[] method7189(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		fs[8] = aFloatArray4916[2];
		fs[9] = aFloatArray4916[6];
		fs[10] = aFloatArray4916[10];
		fs[11] = aFloatArray4916[14];
		fs[12] = aFloatArray4916[3];
		fs[13] = aFloatArray4916[7];
		fs[14] = aFloatArray4916[11];
		fs[15] = aFloatArray4916[15];
		return fs;
	}

	public float[] method7190(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		fs[8] = aFloatArray4916[2];
		fs[9] = aFloatArray4916[6];
		fs[10] = aFloatArray4916[10];
		fs[11] = aFloatArray4916[14];
		fs[12] = aFloatArray4916[3];
		fs[13] = aFloatArray4916[7];
		fs[14] = aFloatArray4916[11];
		fs[15] = aFloatArray4916[15];
		return fs;
	}

	public float[] method7191(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		fs[8] = aFloatArray4916[2];
		fs[9] = aFloatArray4916[6];
		fs[10] = aFloatArray4916[10];
		fs[11] = aFloatArray4916[14];
		fs[12] = aFloatArray4916[3];
		fs[13] = aFloatArray4916[7];
		fs[14] = aFloatArray4916[11];
		fs[15] = aFloatArray4916[15];
		return fs;
	}

	public float[] method7192(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		fs[8] = aFloatArray4916[2];
		fs[9] = aFloatArray4916[6];
		fs[10] = aFloatArray4916[10];
		fs[11] = aFloatArray4916[14];
		fs[12] = aFloatArray4916[3];
		fs[13] = aFloatArray4916[7];
		fs[14] = aFloatArray4916[11];
		fs[15] = aFloatArray4916[15];
		return fs;
	}

	public float[] method7193(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[4];
		fs[2] = aFloatArray4916[8];
		fs[3] = aFloatArray4916[12];
		fs[4] = aFloatArray4916[1];
		fs[5] = aFloatArray4916[5];
		fs[6] = aFloatArray4916[9];
		fs[7] = aFloatArray4916[13];
		return fs;
	}

	public void method7194(int i, int i_430_, int i_431_, float f, float f_432_, float f_433_) {
		if (i != 0) {
			float f_434_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_435_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloatArray4916[0] = f_434_ * (float) i_430_;
			aFloatArray4916[5] = f_434_ * (float) i_431_;
			aFloatArray4916[1] = f_435_ * (float) i_430_;
			aFloatArray4916[4] = -f_435_ * (float) i_431_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_436_ = aFloatArray4916;
			float[] fs_437_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_437_[8] = 0.0F;
			fs_436_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4916[0] = (float) i_430_;
			aFloatArray4916[5] = (float) i_431_;
			aFloatArray4916[10] = 1.0F;
			float[] fs = aFloatArray4916;
			float[] fs_438_ = aFloatArray4916;
			float[] fs_439_ = aFloatArray4916;
			float[] fs_440_ = aFloatArray4916;
			float[] fs_441_ = aFloatArray4916;
			aFloatArray4916[9] = 0.0F;
			fs_441_[8] = 0.0F;
			fs_440_[6] = 0.0F;
			fs_439_[4] = 0.0F;
			fs_438_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4916;
		float[] fs_442_ = aFloatArray4916;
		aFloatArray4916[11] = 0.0F;
		fs_442_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4916[15] = 1.0F;
		aFloatArray4916[12] = f;
		aFloatArray4916[13] = f_432_;
		aFloatArray4916[14] = f_433_;
	}

	public float[] method7195(float[] fs) {
		float f = aFloatArray4916[3] + aFloatArray4916[0];
		float f_443_ = aFloatArray4916[7] + aFloatArray4916[4];
		float f_444_ = aFloatArray4916[11] + aFloatArray4916[8];
		double d = Math.sqrt((double) (f * f + f_443_ * f_443_ + f_444_ * f_444_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_443_ / d);
		fs[2] = (float) ((double) f_444_ / d);
		fs[3] = (float) ((double) (aFloatArray4916[15] + aFloatArray4916[12]) / d);
		return fs;
	}

	public float[] method7196(float[] fs) {
		fs[0] = aFloatArray4916[0];
		fs[1] = aFloatArray4916[1];
		fs[2] = aFloatArray4916[4];
		fs[3] = aFloatArray4916[5];
		fs[4] = aFloatArray4916[8];
		fs[5] = aFloatArray4916[9];
		fs[6] = aFloatArray4916[12];
		fs[7] = aFloatArray4916[13];
		return fs;
	}
}
