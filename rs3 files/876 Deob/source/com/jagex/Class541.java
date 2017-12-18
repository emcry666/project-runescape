/* Class541 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class541 {
	Class320[] aClass320Array7222;
	Class320[] aClass320Array7223;
	Class518 this$0;

	Class541(Class518 class518) {
		this$0 = class518;
		aClass320Array7223 = new Class320[16];
		aClass320Array7222 = new Class320[16];
		new Class320(8);
		for (int i = 0; i < 16; i++) {
			aClass320Array7223[i] = new Class320(3);
			aClass320Array7222[i] = new Class320(3);
		}
	}

	static final void method8988(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class645.aClass24_8347.method839(i_0_, (byte) 96).method18249(-1118547251);
	}

	public static float method8989(Class440 class440, byte i) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = 1.5707963267948966 - Math.acos((double) class437.aFloat4904);
		class437.method6949();
		return (float) d;
	}

	static void method8990(int i, int i_1_) {
		int i_2_;
		if (0 == i)
			i_2_ = 0;
		else if (i == 1)
			i_2_ = 1;
		else if (2 == i)
			i_2_ = 2;
		else
			return;
		int i_3_;
		if ((double) Class534_Sub1.aFloat7155 == 2.0)
			i_3_ = 0;
		else if (3.0 == (double) Class534_Sub1.aFloat7155)
			i_3_ = 1;
		else if (4.0 == (double) Class534_Sub1.aFloat7155)
			i_3_ = 2;
		else if (6.0 == (double) Class534_Sub1.aFloat7155)
			i_3_ = 3;
		else if ((double) Class534_Sub1.aFloat7155 >= 8.0)
			i_3_ = 4;
		else
			return;
		Class162.aClass164_1771 = Class534_Sub1.aClass164ArrayArray10792[i_2_][i_3_];
		Class305.aClass10_3347 = Class534_Sub1.aClass10ArrayArray10785[i_2_][i_3_];
	}
}
