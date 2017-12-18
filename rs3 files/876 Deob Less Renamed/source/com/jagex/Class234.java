/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class234 implements Interface5 {
	Class209 aClass209_2376;
	Class472 aClass472_2377;

	Class234(Class472 class472, int i) {
		aClass472_2377 = class472;
		aClass209_2376 = new Class209(i);
	}

	static void method4267(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.method17731((byte) -9);
	}

	static final void method4268(Class669 class669, int i) {
		Class159 class159 = (Class159) (class669.aClass523_Sub27_Sub19_8580.anObjectArray11845[class669.anInt8579 * 1180759405]);
		Interface20 interface20 = ((Interface20) (0 == class669.anIntArray8577[1180759405 * class669.anInt8579] ? class669.aMap8573.get(class159.aClass470_1755) : class669.aMap8556.get(class159.aClass470_1755)));
		Class474 class474 = class159.aClass464_1756.method7527(2140613375);
		if (Class474.aClass474_5382 == class474)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = interface20.method94(class159, 1829046679);
		else if (Class474.aClass474_5383 == class474)
			class669.aLongArray8561[(class669.anInt8562 += -2045027743) * 2056702369 - 1] = interface20.method111(class159, (byte) -40);
		else if (Class474.aClass474_5384 == class474) {
			try {
				String string = (String) interface20.method119(class159, 1019971441);
				if (string == null)
					string = "null";
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		} else
			throw new RuntimeException();
	}

	static final void method4269(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1141294272);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class312_Sub2_Sub1.method17946(class250, class242, class669, 539356728);
	}

	static final void method4270(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_1_, -1157710090);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class194_Sub6.method15502(class250, class242, class669, (byte) -5);
	}

	public static int method4271(int i, int i_2_, float f, int i_3_) {
		return Class381.method6408(i, i_2_, (int) f, -990993308);
	}

	static final void method4272(Class669 class669, int i) {
		class669.aLongArray8554[(class669.anIntArray8577[1180759405 * class669.anInt8579])] = (class669.aLongArray8561[(class669.anInt8562 -= -2045027743) * 2056702369]);
	}
}
