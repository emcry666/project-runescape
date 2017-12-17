/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

class Class216 implements Interface44 {
	Class217 this$0;
	public static Class472 aClass472_2271;

	public float method339() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10651.method16930(1529347143) / 255.0F);
	}

	public float method338(short i) {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10651.method16930(1782296830) / 255.0F);
	}

	public float method337() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10651.method16930(1674463738) / 255.0F);
	}

	Class216(Class217 class217) {
		this$0 = class217;
	}

	public float method336() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10651.method16930(1941407749) / 255.0F);
	}

	static final void method3847(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_1_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4107(i_0_, -2066395635).method4051(i_1_, 1358925136) ? 1 : 0;
	}

	static final void method3848(Class669 class669, byte i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub32_10644, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0 ? 1 : 0, -803865516);
		Class211.method3824(1692685321);
	}

	static final void method3849(Class669 class669, byte i) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class502.method8158((byte) 65);
		if (null != class523_sub27_sub17) {
			boolean bool = (class523_sub27_sub17.method18214(158908775 * Class575.anInt7691 + Class534.anInt7168, -217599855 * Class597.anInt7835 + Class534.anInt7159, Class663.anIntArray8517, -1422170026));
			if (bool) {
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class663.anIntArray8517[1];
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class663.anIntArray8517[2];
			} else {
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			}
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		}
	}

	static final int method3850(Class73 class73, int i) {
		if (class73 == null)
			return 12;
		switch (class73.anInt809 * 1652964889) {
		case 1:
			return 20;
		default:
			return 12;
		}
	}

	public static int method3851(byte i) {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class178 class178 = Class236.method4290(0, canvas, null, null, null, null, null, null, 0, (byte) -87);
		long l = Class248.method4401(1516375036);
		for (int i_2_ = 0; i_2_ < 10000; i_2_++)
			class178.method3330(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i_3_ = (int) (Class248.method4401(1516375036) - l);
		class178.method3354(0, 0, 100, 100, -16777216, (byte) 54);
		class178.method3024(844296746);
		return i_3_;
	}
}
