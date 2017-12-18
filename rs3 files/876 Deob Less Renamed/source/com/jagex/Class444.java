/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class444 {
	Class439[] aClass439Array4925 = new Class439[1];
	float[] aFloatArray4926 = new float[2];

	void method7209(Class437 class437, Class437 class437_0_, float f) {
		Class439[] class439s = new Class439[aClass439Array4925.length + 1];
		System.arraycopy(aClass439Array4925, 0, class439s, 0, aClass439Array4925.length);
		Class439 class439 = new Class439();
		Class439 class439_1_ = aClass439Array4925[aClass439Array4925.length - 1];
		class439.method6990(0, class439_1_.method6999(3));
		Class437 class437_2_ = Class437.method6932(class439_1_.method6999(3), class439_1_.method6999(2));
		class439.method6990(1, Class437.method6892(class439_1_.method6999(3), class437_2_));
		class439.method6990(3, class437);
		class439.method6990(2, class437_0_);
		class439s[class439s.length - 1] = class439;
		aClass439Array4925 = class439s;
		float[] fs = new float[aFloatArray4926.length + 1];
		System.arraycopy(aFloatArray4926, 0, fs, 0, aFloatArray4926.length);
		fs[fs.length - 1] = f;
		aFloatArray4926 = fs;
	}

	public int method7210() {
		return aClass439Array4925.length;
	}

	public float method7211() {
		float f = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++)
			f += aClass439Array4925[i].method6993();
		return f;
	}

	public double[] method7212(float f) {
		float f_3_ = 0.0F;
		float f_4_ = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++) {
			f_4_ += aClass439Array4925[i].method6993();
			if (f < f_4_) {
				float f_5_ = aClass439Array4925[i].method6995(f - f_3_);
				return aClass439Array4925[i].method6991(f_5_);
			}
			f_3_ = f_4_;
		}
		return aClass439Array4925[aClass439Array4925.length - 1].method6991(1.0F);
	}

	public float method7213(float f) {
		return method7216(method7226(f));
	}

	public double[] method7214(float f) {
		int i = (int) f;
		if (i < aClass439Array4925.length)
			return aClass439Array4925[i].method6991(f - (float) i);
		return aClass439Array4925[aClass439Array4925.length - 1].method6991(1.0F);
	}

	public float method7215(float f) {
		return method7216(method7226(f));
	}

	public float method7216(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4926.length) {
			float f_6_ = aFloatArray4926[i];
			float f_7_ = aFloatArray4926[i + 1];
			float f_8_ = f - (float) i;
			return (1.0F - f_8_) * f_6_ + f_8_ * f_7_;
		}
		return aFloatArray4926[aFloatArray4926.length - 1];
	}

	public Class444(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedSmart(368514876);
		aClass439Array4925[0] = new Class439();
		aClass439Array4925[0].method6990(0, Class437.method6881(class523_sub34));
		aClass439Array4925[0].method6990(1, Class437.method6881(class523_sub34));
		aFloatArray4926[0] = class523_sub34.method16293(-591449335);
		Class437 class437 = Class437.method6881(class523_sub34);
		Class437 class437_9_ = Class437.method6881(class523_sub34);
		Class437 class437_10_ = Class437.method6932(class437, class437_9_);
		class437_9_.method6949();
		class437_9_ = class437_10_;
		class437_9_.method6961(class437);
		aClass439Array4925[0].method6990(3, class437);
		aClass439Array4925[0].method6990(2, class437_9_);
		aFloatArray4926[1] = class523_sub34.method16293(-1873008712);
		for (int i_11_ = 2; i_11_ < i; i_11_++) {
			Class437 class437_12_ = Class437.method6881(class523_sub34);
			Class437 class437_13_ = Class437.method6881(class523_sub34);
			Class437 class437_14_ = Class437.method6932(class437_12_, class437_13_);
			class437_13_.method6949();
			class437_13_ = class437_14_;
			class437_13_.method6961(class437_12_);
			method7218(class437_12_, class437_13_, class523_sub34.method16293(-782333627));
		}
	}

	public float method7217(float f) {
		float f_15_ = 0.0F;
		float f_16_ = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++) {
			f_16_ += aClass439Array4925[i].method6993();
			if (f < f_16_)
				return aClass439Array4925[i].method6995(f - f_15_) + (float) i;
			f_15_ = f_16_;
		}
		return (float) aClass439Array4925.length;
	}

	void method7218(Class437 class437, Class437 class437_17_, float f) {
		Class439[] class439s = new Class439[aClass439Array4925.length + 1];
		System.arraycopy(aClass439Array4925, 0, class439s, 0, aClass439Array4925.length);
		Class439 class439 = new Class439();
		Class439 class439_18_ = aClass439Array4925[aClass439Array4925.length - 1];
		class439.method6990(0, class439_18_.method6999(3));
		Class437 class437_19_ = Class437.method6932(class439_18_.method6999(3), class439_18_.method6999(2));
		class439.method6990(1, Class437.method6892(class439_18_.method6999(3), class437_19_));
		class439.method6990(3, class437);
		class439.method6990(2, class437_17_);
		class439s[class439s.length - 1] = class439;
		aClass439Array4925 = class439s;
		float[] fs = new float[aFloatArray4926.length + 1];
		System.arraycopy(aFloatArray4926, 0, fs, 0, aFloatArray4926.length);
		fs[fs.length - 1] = f;
		aFloatArray4926 = fs;
	}

	public float method7219(float f) {
		float f_20_ = 0.0F;
		float f_21_ = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++) {
			f_21_ += aClass439Array4925[i].method6993();
			if (f < f_21_)
				return aClass439Array4925[i].method6995(f - f_20_) + (float) i;
			f_20_ = f_21_;
		}
		return (float) aClass439Array4925.length;
	}

	public int method7220() {
		return aClass439Array4925.length;
	}

	public float method7221() {
		float f = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++)
			f += aClass439Array4925[i].method6993();
		return f;
	}

	public float method7222() {
		float f = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++)
			f += aClass439Array4925[i].method6993();
		return f;
	}

	public float method7223(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4926.length) {
			float f_22_ = aFloatArray4926[i];
			float f_23_ = aFloatArray4926[i + 1];
			float f_24_ = f - (float) i;
			return (1.0F - f_24_) * f_22_ + f_24_ * f_23_;
		}
		return aFloatArray4926[aFloatArray4926.length - 1];
	}

	public float method7224() {
		float f = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++)
			f += aClass439Array4925[i].method6993();
		return f;
	}

	public float method7225(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4926.length) {
			float f_25_ = aFloatArray4926[i];
			float f_26_ = aFloatArray4926[i + 1];
			float f_27_ = f - (float) i;
			return (1.0F - f_27_) * f_25_ + f_27_ * f_26_;
		}
		return aFloatArray4926[aFloatArray4926.length - 1];
	}

	public float method7226(float f) {
		float f_28_ = 0.0F;
		float f_29_ = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++) {
			f_29_ += aClass439Array4925[i].method6993();
			if (f < f_29_)
				return aClass439Array4925[i].method6995(f - f_28_) + (float) i;
			f_28_ = f_29_;
		}
		return (float) aClass439Array4925.length;
	}

	public float method7227(float f) {
		float f_30_ = 0.0F;
		float f_31_ = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++) {
			f_31_ += aClass439Array4925[i].method6993();
			if (f < f_31_)
				return aClass439Array4925[i].method6995(f - f_30_) + (float) i;
			f_30_ = f_31_;
		}
		return (float) aClass439Array4925.length;
	}

	public double[] method7228(float f) {
		int i = (int) f;
		if (i < aClass439Array4925.length)
			return aClass439Array4925[i].method6991(f - (float) i);
		return aClass439Array4925[aClass439Array4925.length - 1].method6991(1.0F);
	}

	public double[] method7229(float f) {
		int i = (int) f;
		if (i < aClass439Array4925.length)
			return aClass439Array4925[i].method6991(f - (float) i);
		return aClass439Array4925[aClass439Array4925.length - 1].method6991(1.0F);
	}

	public double[] method7230(float f) {
		int i = (int) f;
		if (i < aClass439Array4925.length)
			return aClass439Array4925[i].method6991(f - (float) i);
		return aClass439Array4925[aClass439Array4925.length - 1].method6991(1.0F);
	}

	public float method7231() {
		float f = 0.0F;
		for (int i = 0; i < aClass439Array4925.length; i++)
			f += aClass439Array4925[i].method6993();
		return f;
	}

	public float method7232(float f) {
		return method7216(method7226(f));
	}

	public int method7233() {
		return aClass439Array4925.length;
	}

	public float method7234(float f) {
		return method7216(method7226(f));
	}

	public float method7235(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4926.length) {
			float f_32_ = aFloatArray4926[i];
			float f_33_ = aFloatArray4926[i + 1];
			float f_34_ = f - (float) i;
			return (1.0F - f_34_) * f_32_ + f_34_ * f_33_;
		}
		return aFloatArray4926[aFloatArray4926.length - 1];
	}

	public float method7236(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4926.length) {
			float f_35_ = aFloatArray4926[i];
			float f_36_ = aFloatArray4926[i + 1];
			float f_37_ = f - (float) i;
			return (1.0F - f_37_) * f_35_ + f_37_ * f_36_;
		}
		return aFloatArray4926[aFloatArray4926.length - 1];
	}

	void method7237(Class437 class437, Class437 class437_38_, float f) {
		Class439[] class439s = new Class439[aClass439Array4925.length + 1];
		System.arraycopy(aClass439Array4925, 0, class439s, 0, aClass439Array4925.length);
		Class439 class439 = new Class439();
		Class439 class439_39_ = aClass439Array4925[aClass439Array4925.length - 1];
		class439.method6990(0, class439_39_.method6999(3));
		Class437 class437_40_ = Class437.method6932(class439_39_.method6999(3), class439_39_.method6999(2));
		class439.method6990(1, Class437.method6892(class439_39_.method6999(3), class437_40_));
		class439.method6990(3, class437);
		class439.method6990(2, class437_38_);
		class439s[class439s.length - 1] = class439;
		aClass439Array4925 = class439s;
		float[] fs = new float[aFloatArray4926.length + 1];
		System.arraycopy(aFloatArray4926, 0, fs, 0, aFloatArray4926.length);
		fs[fs.length - 1] = f;
		aFloatArray4926 = fs;
	}
}
