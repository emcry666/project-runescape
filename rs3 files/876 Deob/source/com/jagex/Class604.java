/* Class604 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class604 {
	int anInt7944;
	String aString7945;

	Class604() {
		/* empty */
	}

	static final void method9943(Class669 class669, int i) {
		Class523_Sub29 class523_sub29 = ((Class523_Sub29) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub29.anInt10560 * -536626413;
	}

	static Class647_Sub1_Sub3_Sub1 method9944(int i, int i_0_, int i_1_, int i_2_) {
		Class565 class565 = (client.aClass505_11019.method8241((byte) -99).aClass565ArrayArrayArray7508[i][i_0_][i_1_]);
		if (class565 == null)
			return null;
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = null;
		int i_3_ = -1;
		for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
			if (class647_sub1_sub3 instanceof Class647_Sub1_Sub3_Sub1) {
				Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1_4_ = (Class647_Sub1_Sub3_Sub1) class647_sub1_sub3;
				int i_5_ = ((class647_sub1_sub3_sub1_4_.method18338(2143621840) - 1) * 256 + 252);
				Class437 class437 = class647_sub1_sub3_sub1_4_.method10569().aClass437_4862;
				int i_6_ = (int) class437.aFloat4903 - i_5_ >> 9;
				int i_7_ = (int) class437.aFloat4905 - i_5_ >> 9;
				int i_8_ = i_5_ + (int) class437.aFloat4903 >> 9;
				int i_9_ = (int) class437.aFloat4905 + i_5_ >> 9;
				if (i_6_ <= i_0_ && i_7_ <= i_1_ && i_8_ >= i_0_ && i_9_ >= i_1_) {
					int i_10_ = (i_9_ + 1 - i_1_) * (i_8_ + 1 - i_0_);
					if (i_10_ > i_3_) {
						class647_sub1_sub3_sub1 = class647_sub1_sub3_sub1_4_;
						i_3_ = i_10_;
					}
				}
			}
		}
		return class647_sub1_sub3_sub1;
	}

	static final void method9945(Class669 class669, int i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3967(i_11_, (byte) 2).method4198(-606857992);
	}

	static final void method9946(Class669 class669, int i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class669.aClass523_Sub19_8569.aClass338Array10485[i_12_].aString3573);
	}
}
