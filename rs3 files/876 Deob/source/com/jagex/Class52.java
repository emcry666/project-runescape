/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class52 {
	public static Class52 aClass52_715;
	public static Class52 aClass52_716;
	public static Class52 aClass52_717;
	public static Class52 aClass52_718 = new Class52();

	static final void method1286(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		String string_0_ = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773 + 1]);
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		if (null == string_0_)
			string_0_ = "";
		if (string_0_.length() > 80)
			string_0_ = string_0_.substring(0, 80);
		RSStream class116 = Class537.method8941(-1312357527);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4207, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((Class6.method555(string, (byte) -37) + 2 + Class6.method555(string_0_, (byte) -61)), -256883923);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -32);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_1_ - 1, 419949601);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_2_, 787700210);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_0_, (byte) -52);
		class116.method1974(class523_sub22, (byte) 18);
	}

	static {
		aClass52_716 = new Class52();
		aClass52_717 = new Class52();
		aClass52_715 = new Class52();
	}

	Class52() {
		/* empty */
	}

	static final void method1287(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		if (i_3_ >= 0 && i_3_ < 2)
			client.anIntArrayArrayArray11115[i_3_] = new int[i_4_ << 1][4];
	}

	static final void method1288(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) == null ? -1 : (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100).anInt3152) * 1793358919);
	}

	static final void method1289(Class669 class669, int i) {
		if (Class661.anIntArray8510 == null || (Class463.anInt5127 * 647279137 >= Class661.anIntArray8510.length))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = ((Class661.anIntArray8510[(Class463.anInt5127 += -2104274463) * 647279137 - 1]) & 0xffff);
	}
}
