/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class223 implements Interface28 {
	Class224 this$0;
	int anInt2335;
	static boolean[][] aBoolArrayArray2336;

	public void method163(Class218 class218, int i) {
		Class212 class212 = ((Class212) class218.method3972((short) 256).get(anInt2335 * 568387525));
		class218.method3973(anInt2335 * 568387525, 533506585);
		class212.method3825((byte) -35);
	}

	public void method162(Class218 class218) {
		Class212 class212 = ((Class212) class218.method3972((short) 256).get(anInt2335 * 568387525));
		class218.method3973(anInt2335 * 568387525, 1618149151);
		class212.method3825((byte) -28);
	}

	Class223(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		anInt2335 = class523_sub34.readUnsignedShort(-489132379) * -1840513267;
	}

	public void method161(Class218 class218) {
		Class212 class212 = ((Class212) class218.method3972((short) 256).get(anInt2335 * 568387525));
		class218.method3973(anInt2335 * 568387525, -1146909463);
		class212.method3825((byte) -43);
	}

	public void method164(Class218 class218) {
		Class212 class212 = ((Class212) class218.method3972((short) 256).get(anInt2335 * 568387525));
		class218.method3973(anInt2335 * 568387525, -1854813807);
		class212.method3825((byte) -72);
	}

	public void method165(Class218 class218) {
		Class212 class212 = ((Class212) class218.method3972((short) 256).get(anInt2335 * 568387525));
		class218.method3973(anInt2335 * 568387525, 1292951905);
		class212.method3825((byte) -101);
	}

	static final void method4143(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2672 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method4144(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class93.method1667(class250, class242, class669, 295293794);
	}

	static final void method4145(Class669 class669, int i) {
		class669.anInt8558 -= -52267494;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		int i_3_ = class669.anIntArray8557[3 + class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 4];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 5];
		Class489 class489 = Class254.aClass217_2743.method3877(Class189.aClass189_2144, Class254.aClass217_2743, i_0_, i_1_, i_3_, Class198.aClass198_2195.method3672((byte) 32), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, i_4_, false, (short) -32597);
		if (class489 != null)
			Class254.aClass217_2743.method3860(class489, i_5_, i_2_, 708769084);
	}

	static final void method4146(Class669 class669, short i) {
		Class328_Sub3_Sub3.method17945((byte) 2);
	}

	public static void method4147(String string, String string_6_, String string_7_, boolean bool, byte i) {
		if (string.length() <= 320 && Class653_Sub1.method16688((byte) 9)) {
			Class387.method6467(1445702637);
			Class43.aString603 = string;
			Class43.aString594 = string_6_;
			Class43.aString583 = string_7_;
			Class43.aBool588 = bool;
			Class657.method10791(3, (byte) -42);
		}
	}
}
