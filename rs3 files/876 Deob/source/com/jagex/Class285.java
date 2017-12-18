/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class285 implements Interface75 {
	int anInt3080;
	static Class285 aClass285_3081;
	static Class285 aClass285_3082 = new Class285(0);
	static Class285 aClass285_3083;
	static Class285 aClass285_3084;
	static int anInt3085;

	static {
		aClass285_3081 = new Class285(1);
		aClass285_3084 = new Class285(2);
		aClass285_3083 = new Class285(3);
	}

	Class285(int i) {
		anInt3080 = i * 1453519457;
	}

	public int method82() {
		return -1732169311 * anInt3080;
	}

	public int method6() {
		return -1732169311 * anInt3080;
	}

	public int method101() {
		return -1732169311 * anInt3080;
	}

	public static void method5143(Class472 class472, Class172 class172, Interface25 interface25, int i) {
		Class533.aClass472_7131 = class472;
		Class83.aClass172_873 = class172;
		Class289.anInterface25_3118 = interface25;
	}

	static void method5144(Class669 class669, int i) {
		class669.anIntArray8557[1357652815 * class669.anInt8558 - 2] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815) - 2]), (byte) -65)).anIntArrayArray3053[class669.anIntArray8557[1357652815 * class669.anInt8558 - 1]][0]);
		class669.anInt8558 -= 2138772399;
	}

	static final void method5145(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_2_ = i_1_ >> 14 & 0x3fff;
		int i_3_ = i_1_ & 0x3fff;
		int i_4_ = Class331.method5824(i_0_, i_2_, i_3_, -736663796);
		if (i_4_ < 0)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_4_;
	}

	static final void method5146(Class669 class669, short i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_5_ > 255 || i_5_ < 0)
			i_5_ = 0;
		if (i_5_ != Class449.aClass523_Sub33_4946.aClass687_Sub26_10611.method16952((byte) -20)) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub26_10611), i_5_, 1896077667);
			Class211.method3824(1840185280);
			client.aBool11012 = false;
		}
	}

	static final void method5147(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_6_, -1245169555);
		Class242 class242 = Class31.aClass242Array302[i_6_ >> 16];
		Class457.method7443(class250, class242, true, 1, class669, -1247603257);
	}
}
