/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class386 {
	public int anInt3999;
	public int anInt4000 = 388603345;
	public boolean aBool4001;
	static final int anInt4002 = 0;
	public int anInt4003;
	public int anInt4004 = -1835926976;
	public int anInt4005;
	public boolean aBool4006;
	public static Class472 aClass472_4007;

	void method6451(Class523_Sub34 class523_sub34, int i, int i_0_) {
		for (;;) {
			int i_1_ = class523_sub34.readUnsignedByte(-534591404);
			if (0 == i_1_)
				break;
			method6452(class523_sub34, i_1_, i, (byte) -51);
		}
	}

	void method6452(Class523_Sub34 class523_sub34, int i, int i_2_, byte i_3_) {
		if (1 == i) {
			anInt4000 = class523_sub34.readUnsignedShort(-581992620) * -388603345;
			if (anInt4000 * -1163385649 == 65535)
				anInt4000 = 388603345;
		} else if (i == 2) {
			anInt4004 = (class523_sub34.readUnsignedShort(-1388186134) + 1) * -431339543;
			anInt3999 = (class523_sub34.readUnsignedShort(-861776881) + 1) * 720009855;
		} else if (3 == i)
			class523_sub34.readByte((short) -17726);
		else if (4 == i)
			anInt4003 = class523_sub34.readUnsignedByte(2036027262) * 547597497;
		else if (5 == i)
			anInt4005 = class523_sub34.readUnsignedByte(-1807802115) * -104826273;
		else if (i == 6)
			aBool4001 = true;
		else if (i == 7)
			aBool4006 = true;
	}

	Class386() {
		anInt3999 = -1164009536;
		anInt4003 = 1095194994;
		anInt4005 = -104826273;
		aBool4001 = false;
		aBool4006 = false;
	}

	void method6453(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_4_ = class523_sub34.readUnsignedByte(1662581197);
			if (0 == i_4_)
				break;
			method6452(class523_sub34, i_4_, i, (byte) 17);
		}
	}

	void method6454(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_5_ = class523_sub34.readUnsignedByte(-2122252176);
			if (0 == i_5_)
				break;
			method6452(class523_sub34, i_5_, i, (byte) -42);
		}
	}

	void method6455(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_6_ = class523_sub34.readUnsignedByte(-1486044318);
			if (0 == i_6_)
				break;
			method6452(class523_sub34, i_6_, i, (byte) -56);
		}
	}

	static final int method6456(Class178 class178, Class651 class651, int i) {
		if (-1 != class651.anInt8386 * 99640975)
			return 99640975 * class651.anInt8386;
		if (-1 != class651.anInt8394 * 634101717) {
			Class177 class177 = class178.aClass172_1916.method2895(class651.anInt8394 * 634101717, -1928008625);
			if (!class177.aBool1876)
				return class177.aShort1907;
		}
		return -1082268879 * class651.anInt8383;
	}

	static final void method6457(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.anInt2605 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * -254363595;
		Class523_Sub14.method15991(class250, (byte) -76);
		if (class250.anInt2709 * 234012635 == -1 && !class242.aBool2456)
			Class508.method8506(class250.anInt2585 * -1363815505, 1451118309);
	}

	static final void method6458(Class669 class669, int i) {
		int i_7_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (-1 == i_7_)
			throw new RuntimeException();
		Class37 class37 = ((Class37) Class394.aClass53_Sub16_4056.getDefinition(i_7_, (byte) -19));
		if (Class464.aClass464_5165 != class37.aClass464_367)
			throw new RuntimeException();
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class37.method1092(string, (byte) -81) ? 1 : 0;
	}

	static final void method6459(Class669 class669, byte i) {
		if (-2020118759 * client.anInt11136 == 1) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4210, (client.aClass116_11057.aClass11_1413), 1370050649);
			client.aClass116_11057.method1974(class523_sub22, (byte) 121);
		}
	}

	static final void method6460(Class669 class669, int i) {
		/* empty */
	}

	static final void method6461(Class669 class669, byte i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_8_, -665794671);
		Class242 class242 = Class31.aClass242Array302[i_8_ >> 16];
		Class39.method1126(class250, class242, class669, -247551756);
	}
}
