/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class580 {
	public static void method9658(float f, Class437 class437, Class437 class437_0_, Class437 class437_1_, Class437 class437_2_, Class437 class437_3_, float f_4_, float f_5_, float f_6_, float f_7_) {
		if (!class437_0_.method6880(class437)) {
			Class437 class437_8_ = Class437.method6932(class437_0_, class437);
			float f_9_ = class437_8_.method6958();
			if (f_4_ > 0.0F) {
				class437_2_ = Class437.method6884(class437_2_);
				class437_2_.method6902(f_5_ * (f_9_ / f_4_));
			}
			if (class437_2_.aFloat4903 == Float.POSITIVE_INFINITY || Float.isNaN(class437.aFloat4903) || f_9_ > f_6_) {
				class437.method6886(class437_0_);
				class437_1_.method6887();
			} else {
				Class437 class437_10_ = Class437.method6884(class437_1_);
				class437_10_.method6898();
				Class437 class437_11_ = Class437.method6904(class437_10_, class437_2_);
				Class437 class437_12_ = Class437.method6877(class437_10_, class437_11_);
				class437_12_.method6902(0.5F);
				Class437 class437_13_ = Class437.method6884(class437_1_);
				Class437 class437_14_ = Class437.method6884(class437_8_);
				class437_14_.method6898();
				if (class437_12_.aFloat4903 > class437_14_.aFloat4903) {
					if (class437_8_.aFloat4903 < 0.0F) {
						class437_13_.aFloat4903 += class437_2_.aFloat4903 * f;
						if (class437_13_.aFloat4903 > 0.0F)
							class437_13_.aFloat4903 = 0.0F;
					} else {
						class437_13_.aFloat4903 -= class437_2_.aFloat4903 * f;
						if (class437_13_.aFloat4903 < 0.0F)
							class437_13_.aFloat4903 = 0.0F;
					}
				} else if (class437_10_.aFloat4903 < class437_3_.aFloat4903) {
					if (class437_8_.aFloat4903 < 0.0F) {
						class437_13_.aFloat4903 -= class437_2_.aFloat4903 * f;
						if (class437_13_.aFloat4903 < -class437_3_.aFloat4903)
							class437_13_.aFloat4903 = -class437_3_.aFloat4903;
					} else {
						class437_13_.aFloat4903 += class437_2_.aFloat4903 * f;
						if (class437_13_.aFloat4903 > class437_3_.aFloat4903)
							class437_13_.aFloat4903 = class437_3_.aFloat4903;
					}
				}
				if (class437_12_.aFloat4904 > class437_14_.aFloat4904) {
					if (class437_8_.aFloat4904 < 0.0F) {
						class437_13_.aFloat4904 += f * class437_2_.aFloat4904;
						if (class437_13_.aFloat4904 > 0.0F)
							class437_13_.aFloat4904 = 0.0F;
					} else {
						class437_13_.aFloat4904 -= class437_2_.aFloat4904 * f;
						if (class437_13_.aFloat4904 < 0.0F)
							class437_13_.aFloat4904 = 0.0F;
					}
				} else if (class437_10_.aFloat4904 < class437_3_.aFloat4904) {
					if (class437_8_.aFloat4904 < 0.0F) {
						class437_13_.aFloat4904 -= class437_2_.aFloat4904 * f;
						if (class437_13_.aFloat4904 < -class437_3_.aFloat4904)
							class437_13_.aFloat4904 = -class437_3_.aFloat4904;
					} else {
						class437_13_.aFloat4904 += class437_2_.aFloat4904 * f;
						if (class437_13_.aFloat4904 > class437_3_.aFloat4904)
							class437_13_.aFloat4904 = class437_3_.aFloat4904;
					}
				}
				if (class437_12_.aFloat4905 > class437_14_.aFloat4905) {
					if (class437_8_.aFloat4905 < 0.0F) {
						class437_13_.aFloat4905 += f * class437_2_.aFloat4905;
						if (class437_13_.aFloat4905 > 0.0F)
							class437_13_.aFloat4905 = 0.0F;
					} else {
						class437_13_.aFloat4905 -= f * class437_2_.aFloat4905;
						if (class437_13_.aFloat4905 < 0.0F)
							class437_13_.aFloat4905 = 0.0F;
					}
				} else if (class437_10_.aFloat4905 < class437_3_.aFloat4905) {
					if (class437_8_.aFloat4905 < 0.0F) {
						class437_13_.aFloat4905 -= class437_2_.aFloat4905 * f;
						if (class437_13_.aFloat4905 < -class437_3_.aFloat4905)
							class437_13_.aFloat4905 = -class437_3_.aFloat4905;
					} else {
						class437_13_.aFloat4905 += class437_2_.aFloat4905 * f;
						if (class437_13_.aFloat4905 > class437_3_.aFloat4905)
							class437_13_.aFloat4905 = class437_3_.aFloat4905;
					}
				}
				class437_1_.method6910(class437_13_, 0.8F);
				if (f_9_ < f_7_ && class437_1_.method6958() < f_7_) {
					class437.method6886(class437_0_);
					class437_1_.method6887();
				} else
					class437.method6961(Class437.method6906(class437_1_, f));
				class437_10_.method6949();
				class437_13_.method6949();
				class437_14_.method6949();
			}
		}
	}

	public static void method9659(float f, Class437 class437, Class437 class437_15_, Class437 class437_16_, Class437 class437_17_, Class437 class437_18_, float f_19_, float f_20_, float f_21_, float f_22_) {
		if (!class437_15_.method6880(class437)) {
			Class437 class437_23_ = Class437.method6932(class437_15_, class437);
			float f_24_ = class437_23_.method6958();
			if (f_19_ > 0.0F) {
				class437_17_ = Class437.method6884(class437_17_);
				class437_17_.method6902(f_20_ * (f_24_ / f_19_));
			}
			if (class437_17_.aFloat4903 == Float.POSITIVE_INFINITY || Float.isNaN(class437.aFloat4903) || f_24_ > f_21_) {
				class437.method6886(class437_15_);
				class437_16_.method6887();
			} else {
				Class437 class437_25_ = Class437.method6884(class437_16_);
				class437_25_.method6898();
				Class437 class437_26_ = Class437.method6904(class437_25_, class437_17_);
				Class437 class437_27_ = Class437.method6877(class437_25_, class437_26_);
				class437_27_.method6902(0.5F);
				Class437 class437_28_ = Class437.method6884(class437_16_);
				Class437 class437_29_ = Class437.method6884(class437_23_);
				class437_29_.method6898();
				if (class437_27_.aFloat4903 > class437_29_.aFloat4903) {
					if (class437_23_.aFloat4903 < 0.0F) {
						class437_28_.aFloat4903 += class437_17_.aFloat4903 * f;
						if (class437_28_.aFloat4903 > 0.0F)
							class437_28_.aFloat4903 = 0.0F;
					} else {
						class437_28_.aFloat4903 -= class437_17_.aFloat4903 * f;
						if (class437_28_.aFloat4903 < 0.0F)
							class437_28_.aFloat4903 = 0.0F;
					}
				} else if (class437_25_.aFloat4903 < class437_18_.aFloat4903) {
					if (class437_23_.aFloat4903 < 0.0F) {
						class437_28_.aFloat4903 -= class437_17_.aFloat4903 * f;
						if (class437_28_.aFloat4903 < -class437_18_.aFloat4903)
							class437_28_.aFloat4903 = -class437_18_.aFloat4903;
					} else {
						class437_28_.aFloat4903 += class437_17_.aFloat4903 * f;
						if (class437_28_.aFloat4903 > class437_18_.aFloat4903)
							class437_28_.aFloat4903 = class437_18_.aFloat4903;
					}
				}
				if (class437_27_.aFloat4904 > class437_29_.aFloat4904) {
					if (class437_23_.aFloat4904 < 0.0F) {
						class437_28_.aFloat4904 += f * class437_17_.aFloat4904;
						if (class437_28_.aFloat4904 > 0.0F)
							class437_28_.aFloat4904 = 0.0F;
					} else {
						class437_28_.aFloat4904 -= class437_17_.aFloat4904 * f;
						if (class437_28_.aFloat4904 < 0.0F)
							class437_28_.aFloat4904 = 0.0F;
					}
				} else if (class437_25_.aFloat4904 < class437_18_.aFloat4904) {
					if (class437_23_.aFloat4904 < 0.0F) {
						class437_28_.aFloat4904 -= class437_17_.aFloat4904 * f;
						if (class437_28_.aFloat4904 < -class437_18_.aFloat4904)
							class437_28_.aFloat4904 = -class437_18_.aFloat4904;
					} else {
						class437_28_.aFloat4904 += class437_17_.aFloat4904 * f;
						if (class437_28_.aFloat4904 > class437_18_.aFloat4904)
							class437_28_.aFloat4904 = class437_18_.aFloat4904;
					}
				}
				if (class437_27_.aFloat4905 > class437_29_.aFloat4905) {
					if (class437_23_.aFloat4905 < 0.0F) {
						class437_28_.aFloat4905 += f * class437_17_.aFloat4905;
						if (class437_28_.aFloat4905 > 0.0F)
							class437_28_.aFloat4905 = 0.0F;
					} else {
						class437_28_.aFloat4905 -= f * class437_17_.aFloat4905;
						if (class437_28_.aFloat4905 < 0.0F)
							class437_28_.aFloat4905 = 0.0F;
					}
				} else if (class437_25_.aFloat4905 < class437_18_.aFloat4905) {
					if (class437_23_.aFloat4905 < 0.0F) {
						class437_28_.aFloat4905 -= class437_17_.aFloat4905 * f;
						if (class437_28_.aFloat4905 < -class437_18_.aFloat4905)
							class437_28_.aFloat4905 = -class437_18_.aFloat4905;
					} else {
						class437_28_.aFloat4905 += class437_17_.aFloat4905 * f;
						if (class437_28_.aFloat4905 > class437_18_.aFloat4905)
							class437_28_.aFloat4905 = class437_18_.aFloat4905;
					}
				}
				class437_16_.method6910(class437_28_, 0.8F);
				if (f_24_ < f_22_ && class437_16_.method6958() < f_22_) {
					class437.method6886(class437_15_);
					class437_16_.method6887();
				} else
					class437.method6961(Class437.method6906(class437_16_, f));
				class437_25_.method6949();
				class437_28_.method6949();
				class437_29_.method6949();
			}
		}
	}

	Class580() throws Throwable {
		throw new Error();
	}

	static final void method9660(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class386.method6457(class250, class242, class669, (byte) 47);
	}
}
