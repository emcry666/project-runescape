/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class16 {
	public static final int anInt185 = 2;
	public static final int anInt186 = 3;
	public static final int anInt187 = 1;
	public static final int anInt188 = 4;

	Class16() throws Throwable {
		throw new Error();
	}

	public static void method769(int i) {
		if (Class53.method1308((byte) 82) != Class513.aClass513_5764) {
			try {
				String string = Class305.anApplet3346.getParameter(Class420.aClass420_4750.aString4777);
				int i_0_ = ((int) (Class248.method4401(1516375036) / 86400000L) - 11745);
				String string_1_ = new StringBuilder().append("usrdob=").append(i_0_).append("; version=1; path=/; domain=").append(string).toString();
				Class35.method951(Class305.anApplet3346, new StringBuilder().append("document.cookie=\"").append(string_1_).append("\"").toString(), (byte) 49);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	public static int method770(Class523_Sub27_Sub6 class523_sub27_sub6, int i) {
		if (Class36.aBool326)
			return 6;
		if (null == class523_sub27_sub6)
			return 0;
		int i_2_ = -2101009827 * class523_sub27_sub6.anInt11639;
		if (Class263.method4741(i_2_, 2037124381))
			return 1;
		if (Class290.method5215(i_2_, 57772006))
			return 2;
		if (Class523_Sub20.method16098(i_2_, -497856130))
			return 3;
		if (Class549.method9107(i_2_, (byte) 1))
			return 4;
		if (Class603.method9942(i_2_, (byte) 1))
			return 7;
		if (16 == i_2_)
			return 8;
		return 5;
	}

	static final void method771(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1759297857 * class250.anInt2543;
	}
}
