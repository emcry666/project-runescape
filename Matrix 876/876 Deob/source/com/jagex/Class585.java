/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class585 {
	Class585() throws Throwable {
		throw new Error();
	}

	public static void method9689(float f, Class437 class437, Class440 class440, Class437 class437_0_, Class437 class437_1_, Class437 class437_2_, Class437 class437_3_, float f_4_, float f_5_, float f_6_, float f_7_) {
		if (!class437_0_.method6880(class437)) {
			Class437 class437_8_ = Class437.method6879(0.0F, 0.0F, 0.0F);
			Class437 class437_9_ = Class437.method6884(Class437.method6932(class437_0_, class437));
			class437_9_.method6907(class440);
			Class437 class437_10_ = Class437.method6932(class437_9_, class437_8_);
			float f_11_ = class437_10_.method6958();
			if (f_4_ > 0.0F) {
				class437_2_ = Class437.method6884(class437_2_);
				class437_2_.method6902(f_11_ / f_4_ * f_5_);
			}
			if (Float.POSITIVE_INFINITY == class437_2_.aFloat4903 || Float.isNaN(class437.aFloat4903) || f_11_ > f_6_ || f_11_ < f_7_) {
				class437.method6886(class437_0_);
				class437_1_.method6887();
			} else {
				class440.method7021();
				Class437 class437_12_ = Class437.method6879(1.0F, 0.0F, 0.0F);
				Class437 class437_13_ = Class437.method6879(0.0F, 1.0F, 0.0F);
				Class437 class437_14_ = Class437.method6879(0.0F, 0.0F, 1.0F);
				class437_12_.method6907(class440);
				class437_13_.method6907(class440);
				class437_14_.method6907(class440);
				Class437 class437_15_ = Class437.method6879(Class437.method6899(class437_12_, class437_1_), Class437.method6899(class437_13_, class437_1_), Class437.method6899(class437_14_, class437_1_));
				Class437 class437_16_ = Class437.method6884(class437_15_);
				class437_16_.method6898();
				Class437 class437_17_ = Class437.method6904(Class437.method6877(class437_16_, class437_16_), Class437.method6906(class437_2_, 2.0F));
				Class437 class437_18_ = Class437.method6884(class437_10_);
				class437_18_.method6898();
				Class437 class437_19_ = Class437.method6884(class437_15_);
				if (class437_17_.aFloat4903 > class437_18_.aFloat4903) {
					if (class437_10_.aFloat4903 < 0.0F) {
						class437_19_.aFloat4903 += class437_2_.aFloat4903 * f;
						if (class437_19_.aFloat4903 > 0.0F)
							class437_19_.aFloat4903 = 0.0F;
					} else {
						class437_19_.aFloat4903 -= f * class437_2_.aFloat4903;
						if (class437_19_.aFloat4903 < 0.0F)
							class437_19_.aFloat4903 = 0.0F;
					}
				} else if (class437_16_.aFloat4903 < class437_3_.aFloat4903) {
					if (class437_10_.aFloat4903 < 0.0F) {
						class437_19_.aFloat4903 -= f * class437_2_.aFloat4903;
						if (class437_19_.aFloat4903 < -class437_3_.aFloat4903)
							class437_19_.aFloat4903 = -class437_3_.aFloat4903;
					} else {
						class437_19_.aFloat4903 += class437_2_.aFloat4903 * f;
						if (class437_19_.aFloat4903 > class437_3_.aFloat4903)
							class437_19_.aFloat4903 = class437_3_.aFloat4903;
					}
				}
				if (class437_17_.aFloat4904 > class437_18_.aFloat4904) {
					if (class437_10_.aFloat4904 < 0.0F) {
						class437_19_.aFloat4904 += class437_2_.aFloat4904 * f;
						if (class437_19_.aFloat4904 > 0.0F)
							class437_19_.aFloat4904 = 0.0F;
					} else {
						class437_19_.aFloat4904 -= f * class437_2_.aFloat4904;
						if (class437_19_.aFloat4904 < 0.0F)
							class437_19_.aFloat4904 = 0.0F;
					}
				} else if (class437_16_.aFloat4904 < class437_3_.aFloat4904) {
					if (class437_10_.aFloat4904 < 0.0F) {
						class437_19_.aFloat4904 -= class437_2_.aFloat4904 * f;
						if (class437_19_.aFloat4904 < -class437_3_.aFloat4904)
							class437_19_.aFloat4904 = -class437_3_.aFloat4904;
					} else {
						class437_19_.aFloat4904 += f * class437_2_.aFloat4904;
						if (class437_19_.aFloat4904 > class437_3_.aFloat4904)
							class437_19_.aFloat4904 = class437_3_.aFloat4904;
					}
				}
				if (class437_17_.aFloat4905 > class437_18_.aFloat4905) {
					if (class437_10_.aFloat4905 < 0.0F) {
						class437_19_.aFloat4905 += f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 > 0.0F)
							class437_19_.aFloat4905 = 0.0F;
					} else {
						class437_19_.aFloat4905 -= f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 < 0.0F)
							class437_19_.aFloat4905 = 0.0F;
					}
				} else if (class437_16_.aFloat4905 < class437_3_.aFloat4905) {
					if (class437_10_.aFloat4905 < 0.0F) {
						class437_19_.aFloat4905 -= f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 < -class437_3_.aFloat4905)
							class437_19_.aFloat4905 = -class437_3_.aFloat4905;
					} else {
						class437_19_.aFloat4905 += f * class437_2_.aFloat4905;
						if (class437_19_.aFloat4905 > class437_3_.aFloat4905)
							class437_19_.aFloat4905 = class437_3_.aFloat4905;
					}
				}
				Class437 class437_20_ = Class437.method6906(class437_12_, class437_19_.aFloat4903);
				class437_20_.method6891(class437_13_, class437_19_.aFloat4904);
				class437_20_.method6891(class437_14_, class437_19_.aFloat4905);
				class437_1_.method6910(class437_20_, 0.8F);
				class437.method6961(Class437.method6906(class437_1_, f));
				class437_16_.method6949();
				class437_19_.method6949();
				class437_18_.method6949();
			}
		}
	}

	public static void method9690(boolean bool, int i) {
		if (bool != Class569.aBool7638) {
			Class292.method5236(-248673973);
			Class569.aBool7638 = bool;
		}
	}

	static final void method9691(Class669 class669, byte i) {
		int i_21_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_21_, (byte) 20)).itemName);
	}

	public static void method9692(Class380 class380, Class389 class389, int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		Class114.aClass380_1402 = class380;
		Class391.aClass389_4021 = class389;
		Class197.anInt2192 = i * -562966095;
		Class114.anInt1401 = -111868129 * i_22_;
		Class114.anInt1400 = -1480711921 * i_23_;
		Class523_Sub24.anInt10541 = i_24_ * -1275307345;
		Class114.anInt1403 = i_25_ * -1132518757;
		Class194_Sub22.anInt9965 = -1602558197 * i_26_;
		Class614.anInt8024 = 133594511 * i_27_;
		Class61.aClass175_768 = null;
		Class114.aClass175_1404 = null;
		Class330.aClass175_3499 = null;
		Class213.anInt2267 = -1682775911 * i_28_;
		Class312_Sub3.anInt10069 = -1976302785 * i_29_;
		Class144.method2379(-1508824271);
		Class397.aBool4060 = true;
	}
}
