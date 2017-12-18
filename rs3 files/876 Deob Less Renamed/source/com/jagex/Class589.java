/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class589 {
	static Class589 aClass589_7792;
	static Class589 aClass589_7793;
	static Class589 aClass589_7794 = new Class589(0);
	int anInt7795;

	Class589(int i) {
		anInt7795 = -448366625 * i;
	}

	static {
		aClass589_7793 = new Class589(1);
		aClass589_7792 = new Class589(2);
	}

	static Class589[] method9744() {
		return (new Class589[] { aClass589_7794, aClass589_7792, aClass589_7793 });
	}

	static Class589[] method9745() {
		return (new Class589[] { aClass589_7794, aClass589_7792, aClass589_7793 });
	}

	static Class589[] method9746() {
		return (new Class589[] { aClass589_7794, aClass589_7792, aClass589_7793 });
	}

	static Class589[] method9747() {
		return (new Class589[] { aClass589_7794, aClass589_7792, aClass589_7793 });
	}

	static Class589 method9748(int i) {
		Class589[] class589s = Class57.method1387((byte) 0);
		for (int i_0_ = 0; i_0_ < class589s.length; i_0_++) {
			Class589 class589 = class589s[i_0_];
			if (class589.anInt7795 * -1872231393 == i)
				return class589;
		}
		return null;
	}

	static Class589 method9749(int i) {
		Class589[] class589s = Class57.method1387((byte) 0);
		for (int i_1_ = 0; i_1_ < class589s.length; i_1_++) {
			Class589 class589 = class589s[i_1_];
			if (class589.anInt7795 * -1872231393 == i)
				return class589;
		}
		return null;
	}

	static final void method9750(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((Class523_Sub27_Sub1) Class115.aClass53_Sub20_1412.getDefinition(i_2_, (byte) 74)).anInt11327) * -380706733;
	}

	static final void method9751(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class116 class116 = Class537.method8941(-1798084219);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4237, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -1348691980);
		int i_3_ = class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011;
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -28);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1038659943 * class669.aClass387_8567.anInt4010, (byte) -51);
		class669.aClass387_8567.aClass523_Sub27_Sub18_4009.method18252(class523_sub22.aClass523_Sub34_Sub2_10525, class669.aClass387_8567.anIntArray4008, (byte) -39);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011 - i_3_), 1059138418);
		class116.method1974(class523_sub22, (byte) 44);
	}

	static final void method9752(int i, Class14 class14, int i_4_) {
		if (i != -1 && class14.method741((long) i) == null)
			class14.method738(new Class523(), (long) i);
	}

	static final void method9753(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool11000 ? 1 : 0;
	}
}
