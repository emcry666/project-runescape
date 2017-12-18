/* Class328_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class328_Sub3_Sub1 extends Class328_Sub3 {
	void method15683(RSBuffer class523_sub34, int i) {
		/* empty */
	}

	public Class328_Sub3_Sub1(Class298 class298) {
		super(class298);
	}

	void method15682(int i) {
		/* empty */
	}

	void method15686(RSBuffer class523_sub34, int i, int i_0_) {
		/* empty */
	}

	void method15689(RSBuffer class523_sub34, int i) {
		/* empty */
	}

	float method15688(float f, float f_1_, float f_2_) {
		float f_3_ = f - aFloat10145;
		if (aClass298_3472.method5352((byte) -1).aFloat4903 == Float.POSITIVE_INFINITY)
			f_1_ = aClass298_3472.method5325(-1076673776).method6958();
		else {
			float f_4_ = f_1_ / aClass298_3472.method5352((byte) -1).method6958();
			float f_5_ = f_1_ / 2.0F * f_4_;
			if (f_5_ > f_3_) {
				f_1_ -= (aClass298_3472.method5352((byte) -1).method6958() * f_2_);
				if (f_1_ < 0.0F)
					f_1_ = 0.0F;
			} else if (f_1_ < aClass298_3472.method5325(-1567118686).method6958()) {
				f_1_ += (aClass298_3472.method5352((byte) -1).method6958() * f_2_);
				if (f_1_ > aClass298_3472.method5325(-1081415373).method6958())
					f_1_ = aClass298_3472.method5325(-49803004).method6958();
			}
		}
		return f_1_;
	}

	void method15687() {
		/* empty */
	}

	float method15680(float f, float f_6_, float f_7_, short i) {
		float f_8_ = f - aFloat10145;
		if (aClass298_3472.method5352((byte) -1).aFloat4903 == Float.POSITIVE_INFINITY)
			f_6_ = aClass298_3472.method5325(439962162).method6958();
		else {
			float f_9_ = f_6_ / aClass298_3472.method5352((byte) -1).method6958();
			float f_10_ = f_6_ / 2.0F * f_9_;
			if (f_10_ > f_8_) {
				f_6_ -= (aClass298_3472.method5352((byte) -1).method6958() * f_7_);
				if (f_6_ < 0.0F)
					f_6_ = 0.0F;
			} else if (f_6_ < aClass298_3472.method5325(-763377156).method6958()) {
				f_6_ += (aClass298_3472.method5352((byte) -1).method6958() * f_7_);
				if (f_6_ > aClass298_3472.method5325(-824326693).method6958())
					f_6_ = aClass298_3472.method5325(-58378710).method6958();
			}
		}
		return f_6_;
	}

	public static void method17886(int i, int i_11_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(4, (long) i);
		class523_sub27_sub7.method17962((byte) 13);
	}
}
