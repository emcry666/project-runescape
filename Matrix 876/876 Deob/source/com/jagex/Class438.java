/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class438 {
	public static void method6985(Class437 class437, Class437 class437_0_, Class437 class437_1_, float f, Class437[] class437s) {
		Class437 class437_2_ = Class437.method6932(class437, class437_1_);
		float f_3_ = Class437.method6899(class437_2_, class437_2_) - f * f;
		float f_4_ = Class437.method6899(class437_0_, class437_2_);
		float f_5_ = f_4_ * f_4_ - f_3_;
		if (f_5_ < 0.0F) {
			Class437[] class437s_6_ = class437s;
			class437s[1] = null;
			class437s_6_[0] = null;
		} else if (f_5_ >= 9.765625E-4F) {
			float f_7_ = (float) Math.sqrt((double) f_5_);
			class437s[0] = Class437.method6878();
			class437s[0].method6886(class437);
			class437s[0].method6961(Class437.method6906(Class437.method6884(class437_0_), -f_4_ - f_7_));
			class437s[1] = Class437.method6878();
			class437s[1].method6886(class437);
			class437s[1].method6961(Class437.method6906(Class437.method6884(class437_0_), -f_4_ + f_7_));
		} else {
			class437s[0] = Class437.method6878();
			class437s[0].method6886(class437);
			class437s[0].method6961(Class437.method6906(Class437.method6884(class437_0_), -f_4_));
			class437s[1] = null;
		}
	}

	Class438() throws Throwable {
		throw new Error();
	}

	public static void method6986(Class437 class437, Class437 class437_8_, Class437 class437_9_, float f, Class437[] class437s) {
		Class437 class437_10_ = Class437.method6932(class437, class437_9_);
		float f_11_ = Class437.method6899(class437_10_, class437_10_) - f * f;
		float f_12_ = Class437.method6899(class437_8_, class437_10_);
		float f_13_ = f_12_ * f_12_ - f_11_;
		if (f_13_ < 0.0F) {
			Class437[] class437s_14_ = class437s;
			class437s[1] = null;
			class437s_14_[0] = null;
		} else if (f_13_ >= 9.765625E-4F) {
			float f_15_ = (float) Math.sqrt((double) f_13_);
			class437s[0] = Class437.method6878();
			class437s[0].method6886(class437);
			class437s[0].method6961(Class437.method6906(Class437.method6884(class437_8_), -f_12_ - f_15_));
			class437s[1] = Class437.method6878();
			class437s[1].method6886(class437);
			class437s[1].method6961(Class437.method6906(Class437.method6884(class437_8_), -f_12_ + f_15_));
		} else {
			class437s[0] = Class437.method6878();
			class437s[0].method6886(class437);
			class437s[0].method6961(Class437.method6906(Class437.method6884(class437_8_), -f_12_));
			class437s[1] = null;
		}
	}

	public static void method6987(Class437 class437, Class437 class437_16_, Class437 class437_17_, float f, Class437[] class437s) {
		Class437 class437_18_ = Class437.method6932(class437, class437_17_);
		float f_19_ = Class437.method6899(class437_18_, class437_18_) - f * f;
		float f_20_ = Class437.method6899(class437_16_, class437_18_);
		float f_21_ = f_20_ * f_20_ - f_19_;
		if (f_21_ < 0.0F) {
			Class437[] class437s_22_ = class437s;
			class437s[1] = null;
			class437s_22_[0] = null;
		} else if (f_21_ >= 9.765625E-4F) {
			float f_23_ = (float) Math.sqrt((double) f_21_);
			class437s[0] = Class437.method6878();
			class437s[0].method6886(class437);
			class437s[0].method6961(Class437.method6906(Class437.method6884(class437_16_), -f_20_ - f_23_));
			class437s[1] = Class437.method6878();
			class437s[1].method6886(class437);
			class437s[1].method6961(Class437.method6906(Class437.method6884(class437_16_), -f_20_ + f_23_));
		} else {
			class437s[0] = Class437.method6878();
			class437s[0].method6886(class437);
			class437s[0].method6961(Class437.method6906(Class437.method6884(class437_16_), -f_20_));
			class437s[1] = null;
		}
	}
}
