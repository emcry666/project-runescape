/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class491 {
	public static final int anInt5530 = 3;
	public static final int anInt5531 = 0;
	public static final int anInt5532 = 2;
	public static final int anInt5533 = 1;
	public static final int anInt5534 = 8;
	public static final int anInt5535 = 5;
	public static Class423 aClass423_5536;
	public static int anInt5537;

	Class491() throws Throwable {
		throw new Error();
	}

	static final void method8056(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_0_, (byte) 19);
		if (class76.method1537((byte) -60))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class250.method4438(i_0_, class76.aString849, 391604916);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.method4441(i_0_, class76.anInt850 * -1100663923, -1239899971);
	}

	static final void method8057(Class669 class669, byte i) {
		String string = null;
		if (Class454.aClass63_4979 != null)
			string = Class454.aClass63_4979.method1426((byte) 1);
		if (null == string)
			string = "";
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
	}

	static final void method8058(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), -913380235);
		Class211.method3824(1643027475);
		client.aBool11012 = false;
	}

	static final void method8059(Class669 class669, int i) {
		class669.anInt8558 -= 2103927403;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		int i_4_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 3];
		int i_5_ = class669.anIntArray8557[4 + 1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (i_2_ - i_1_) * (i_5_ - i_3_) / (i_4_ - i_3_) + i_1_;
	}
}
