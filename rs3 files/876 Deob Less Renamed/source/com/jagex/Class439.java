/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class439 {
	Class437[] aClass437Array4906 = new Class437[4];
	float aFloat4907;
	float[] aFloatArray4908;

	Class437 method6988(int i) {
		return aClass437Array4906[i];
	}

	void method6989() {
		aFloat4907 = -1.0F;
		aFloatArray4908 = null;
	}

	void method6990(int i, Class437 class437) {
		aClass437Array4906[i].method6886(class437);
		method6989();
	}

	Class439() {
		for (int i = 0; i < 4; i++)
			aClass437Array4906[i] = new Class437();
		method6989();
	}

	double[] method6991(float f) {
		double[] ds = new double[3];
		float f_0_ = f * f;
		float f_1_ = f_0_ * f;
		double d = (double) (3.0F * (aClass437Array4906[1].aFloat4903 - aClass437Array4906[0].aFloat4903));
		double d_2_ = ((double) (3.0F * (aClass437Array4906[2].aFloat4903 - aClass437Array4906[1].aFloat4903)) - d);
		double d_3_ = ((double) (aClass437Array4906[3].aFloat4903 - aClass437Array4906[0].aFloat4903) - d - d_2_);
		ds[0] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass437Array4906[0].aFloat4903);
		d = (double) (3.0F * (aClass437Array4906[1].aFloat4904 - aClass437Array4906[0].aFloat4904));
		d_2_ = (double) (3.0F * (aClass437Array4906[2].aFloat4904 - aClass437Array4906[1].aFloat4904)) - d;
		d_3_ = (double) (aClass437Array4906[3].aFloat4904 - aClass437Array4906[0].aFloat4904) - d - d_2_;
		ds[1] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass437Array4906[0].aFloat4904);
		d = (double) (3.0F * (aClass437Array4906[1].aFloat4905 - aClass437Array4906[0].aFloat4905));
		d_2_ = (double) (3.0F * (aClass437Array4906[2].aFloat4905 - aClass437Array4906[1].aFloat4905)) - d;
		d_3_ = (double) (aClass437Array4906[3].aFloat4905 - aClass437Array4906[0].aFloat4905) - d - d_2_;
		ds[2] = (d_3_ * (double) f_1_ + d_2_ * (double) f_0_ + d * (double) f + (double) aClass437Array4906[0].aFloat4905);
		return ds;
	}

	float method6992(float f) {
		if (aFloat4907 == -1.0F)
			method6994();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4907)
			return 1.0F;
		float f_4_ = 0.0F;
		float f_5_ = aFloatArray4908[0];
		for (int i = 1; i < aFloatArray4908.length; i++) {
			if (f < f_5_) {
				float f_6_ = (f - f_4_) / (f_5_ - f_4_);
				float f_7_ = (float) (i - 1) / (float) aFloatArray4908.length;
				float f_8_ = (float) i / (float) aFloatArray4908.length;
				return f_7_ + (f_8_ - f_7_) * f_6_;
			}
			f_4_ = f_5_;
			f_5_ += aFloatArray4908[i];
		}
		float f_9_ = (f - f_4_) / (f_5_ - f_4_);
		float f_10_ = ((float) (aFloatArray4908.length - 1) / (float) aFloatArray4908.length);
		return f_10_ + (1.0F - f_10_) * f_9_;
	}

	float method6993() {
		if (aFloat4907 == -1.0F)
			method6994();
		return aFloat4907;
	}

	void method6994() {
		int i = 20;
		double[] ds = method6991(0.0F);
		float f = 0.0F;
		Class437 class437 = Class437.method6878();
		for (int i_11_ = 1; i_11_ <= i; i_11_++) {
			double[] ds_12_ = method6991((float) i_11_ / (float) i);
			class437.aFloat4903 = (float) (ds_12_[0] - ds[0]);
			class437.aFloat4904 = (float) (ds_12_[1] - ds[1]);
			class437.aFloat4905 = (float) (ds_12_[2] - ds[2]);
			f += class437.method6958();
			ds = ds_12_;
		}
		int i_13_ = (int) (f / 20.0F);
		if (i_13_ < i)
			i_13_ = i;
		aFloatArray4908 = new float[i_13_];
		ds = method6991(0.0F);
		float f_14_ = 0.0F;
		for (int i_15_ = 1; i_15_ <= i_13_; i_15_++) {
			double[] ds_16_ = method6991((float) i_15_ / (float) i_13_);
			class437.aFloat4903 = (float) (ds_16_[0] - ds[0]);
			class437.aFloat4904 = (float) (ds_16_[1] - ds[1]);
			class437.aFloat4905 = (float) (ds_16_[2] - ds[2]);
			float f_17_ = class437.method6958();
			f_14_ += f_17_;
			aFloatArray4908[i_15_ - 1] = f_17_;
			ds = ds_16_;
		}
		aFloat4907 = f_14_;
	}

	float method6995(float f) {
		if (aFloat4907 == -1.0F)
			method6994();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4907)
			return 1.0F;
		float f_18_ = 0.0F;
		float f_19_ = aFloatArray4908[0];
		for (int i = 1; i < aFloatArray4908.length; i++) {
			if (f < f_19_) {
				float f_20_ = (f - f_18_) / (f_19_ - f_18_);
				float f_21_ = (float) (i - 1) / (float) aFloatArray4908.length;
				float f_22_ = (float) i / (float) aFloatArray4908.length;
				return f_21_ + (f_22_ - f_21_) * f_20_;
			}
			f_18_ = f_19_;
			f_19_ += aFloatArray4908[i];
		}
		float f_23_ = (f - f_18_) / (f_19_ - f_18_);
		float f_24_ = ((float) (aFloatArray4908.length - 1) / (float) aFloatArray4908.length);
		return f_24_ + (1.0F - f_24_) * f_23_;
	}

	void method6996() {
		aFloat4907 = -1.0F;
		aFloatArray4908 = null;
	}

	Class437 method6997(int i) {
		return aClass437Array4906[i];
	}

	Class437 method6998(int i) {
		return aClass437Array4906[i];
	}

	Class437 method6999(int i) {
		return aClass437Array4906[i];
	}

	double[] method7000(float f) {
		double[] ds = new double[3];
		float f_25_ = f * f;
		float f_26_ = f_25_ * f;
		double d = (double) (3.0F * (aClass437Array4906[1].aFloat4903 - aClass437Array4906[0].aFloat4903));
		double d_27_ = ((double) (3.0F * (aClass437Array4906[2].aFloat4903 - aClass437Array4906[1].aFloat4903)) - d);
		double d_28_ = ((double) (aClass437Array4906[3].aFloat4903 - aClass437Array4906[0].aFloat4903) - d - d_27_);
		ds[0] = (d_28_ * (double) f_26_ + d_27_ * (double) f_25_ + d * (double) f + (double) aClass437Array4906[0].aFloat4903);
		d = (double) (3.0F * (aClass437Array4906[1].aFloat4904 - aClass437Array4906[0].aFloat4904));
		d_27_ = (double) (3.0F * (aClass437Array4906[2].aFloat4904 - aClass437Array4906[1].aFloat4904)) - d;
		d_28_ = (double) (aClass437Array4906[3].aFloat4904 - aClass437Array4906[0].aFloat4904) - d - d_27_;
		ds[1] = (d_28_ * (double) f_26_ + d_27_ * (double) f_25_ + d * (double) f + (double) aClass437Array4906[0].aFloat4904);
		d = (double) (3.0F * (aClass437Array4906[1].aFloat4905 - aClass437Array4906[0].aFloat4905));
		d_27_ = (double) (3.0F * (aClass437Array4906[2].aFloat4905 - aClass437Array4906[1].aFloat4905)) - d;
		d_28_ = (double) (aClass437Array4906[3].aFloat4905 - aClass437Array4906[0].aFloat4905) - d - d_27_;
		ds[2] = (d_28_ * (double) f_26_ + d_27_ * (double) f_25_ + d * (double) f + (double) aClass437Array4906[0].aFloat4905);
		return ds;
	}

	double[] method7001(float f) {
		double[] ds = new double[3];
		float f_29_ = f * f;
		float f_30_ = f_29_ * f;
		double d = (double) (3.0F * (aClass437Array4906[1].aFloat4903 - aClass437Array4906[0].aFloat4903));
		double d_31_ = ((double) (3.0F * (aClass437Array4906[2].aFloat4903 - aClass437Array4906[1].aFloat4903)) - d);
		double d_32_ = ((double) (aClass437Array4906[3].aFloat4903 - aClass437Array4906[0].aFloat4903) - d - d_31_);
		ds[0] = (d_32_ * (double) f_30_ + d_31_ * (double) f_29_ + d * (double) f + (double) aClass437Array4906[0].aFloat4903);
		d = (double) (3.0F * (aClass437Array4906[1].aFloat4904 - aClass437Array4906[0].aFloat4904));
		d_31_ = (double) (3.0F * (aClass437Array4906[2].aFloat4904 - aClass437Array4906[1].aFloat4904)) - d;
		d_32_ = (double) (aClass437Array4906[3].aFloat4904 - aClass437Array4906[0].aFloat4904) - d - d_31_;
		ds[1] = (d_32_ * (double) f_30_ + d_31_ * (double) f_29_ + d * (double) f + (double) aClass437Array4906[0].aFloat4904);
		d = (double) (3.0F * (aClass437Array4906[1].aFloat4905 - aClass437Array4906[0].aFloat4905));
		d_31_ = (double) (3.0F * (aClass437Array4906[2].aFloat4905 - aClass437Array4906[1].aFloat4905)) - d;
		d_32_ = (double) (aClass437Array4906[3].aFloat4905 - aClass437Array4906[0].aFloat4905) - d - d_31_;
		ds[2] = (d_32_ * (double) f_30_ + d_31_ * (double) f_29_ + d * (double) f + (double) aClass437Array4906[0].aFloat4905);
		return ds;
	}

	float method7002() {
		if (aFloat4907 == -1.0F)
			method6994();
		return aFloat4907;
	}

	void method7003() {
		aFloat4907 = -1.0F;
		aFloatArray4908 = null;
	}

	float method7004() {
		if (aFloat4907 == -1.0F)
			method6994();
		return aFloat4907;
	}

	float method7005(float f) {
		if (aFloat4907 == -1.0F)
			method6994();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4907)
			return 1.0F;
		float f_33_ = 0.0F;
		float f_34_ = aFloatArray4908[0];
		for (int i = 1; i < aFloatArray4908.length; i++) {
			if (f < f_34_) {
				float f_35_ = (f - f_33_) / (f_34_ - f_33_);
				float f_36_ = (float) (i - 1) / (float) aFloatArray4908.length;
				float f_37_ = (float) i / (float) aFloatArray4908.length;
				return f_36_ + (f_37_ - f_36_) * f_35_;
			}
			f_33_ = f_34_;
			f_34_ += aFloatArray4908[i];
		}
		float f_38_ = (f - f_33_) / (f_34_ - f_33_);
		float f_39_ = ((float) (aFloatArray4908.length - 1) / (float) aFloatArray4908.length);
		return f_39_ + (1.0F - f_39_) * f_38_;
	}

	float method7006() {
		if (aFloat4907 == -1.0F)
			method6994();
		return aFloat4907;
	}

	float method7007(float f) {
		if (aFloat4907 == -1.0F)
			method6994();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= aFloat4907)
			return 1.0F;
		float f_40_ = 0.0F;
		float f_41_ = aFloatArray4908[0];
		for (int i = 1; i < aFloatArray4908.length; i++) {
			if (f < f_41_) {
				float f_42_ = (f - f_40_) / (f_41_ - f_40_);
				float f_43_ = (float) (i - 1) / (float) aFloatArray4908.length;
				float f_44_ = (float) i / (float) aFloatArray4908.length;
				return f_43_ + (f_44_ - f_43_) * f_42_;
			}
			f_40_ = f_41_;
			f_41_ += aFloatArray4908[i];
		}
		float f_45_ = (f - f_40_) / (f_41_ - f_40_);
		float f_46_ = ((float) (aFloatArray4908.length - 1) / (float) aFloatArray4908.length);
		return f_46_ + (1.0F - f_46_) * f_45_;
	}
}
