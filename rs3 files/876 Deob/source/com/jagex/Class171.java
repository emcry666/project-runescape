/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class171 {
	public static final int anInt1835 = 8191;
	public Class686 aClass686_1836 = new Class686();

	static final void method2893(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3967(i_0_, (byte) 2).method4189((byte) 1) ? 1 : 0;
	}

	static final void method2894(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -34844996;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		int i_4_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 3];
		Class437 class437 = Class437.method6879((float) i_1_, (float) i_2_, (float) i_3_);
		if (class437.aFloat4903 == -1.0F)
			class437.aFloat4903 = Float.POSITIVE_INFINITY;
		if (-1.0F == class437.aFloat4904)
			class437.aFloat4904 = Float.POSITIVE_INFINITY;
		if (class437.aFloat4905 == -1.0F)
			class437.aFloat4905 = Float.POSITIVE_INFINITY;
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5318(class437, -647054103);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5315((float) i_4_ / 1000.0F, (byte) -37);
		class437.method6949();
	}
}
