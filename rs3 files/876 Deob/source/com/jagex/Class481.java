/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class481 {
	public int anInt5467;
	public int anInt5468;
	public int anInt5469;
	public int anInt5470;
	public int anInt5471;
	byte aByte5472;
	public static Class551 aClass551_5473;
	static Class195 aClass195_5474;

	public int method7902() {
		return 8 == (aByte5472 & 0x8) ? 1 : 0;
	}

	public Class481(RSBuffer class523_sub34, Class98_Sub1 class98_sub1) {
		aByte5472 = class523_sub34.readByte((short) -6311);
		anInt5468 = class523_sub34.readUnsignedShort(-700897356) * 169115313;
		anInt5467 = class523_sub34.readUnsignedInt((byte) -127) * -1259892785;
		anInt5470 = class523_sub34.readUnsignedInt((byte) -32) * -786281185;
		anInt5471 = class523_sub34.readUnsignedInt((byte) -23) * -741050301;
		anInt5469 = class523_sub34.readUnsignedInt((byte) -110) * -753945661;
		if (null != class98_sub1)
			Class266.method4890(class523_sub34, class98_sub1, -2062075149);
	}

	public Class481() {
		/* empty */
	}

	static Class4 method7903(RSBuffer class523_sub34, Class98_Sub1 class98_sub1) {
		Class4 class4 = new Class4(class98_sub1);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1085305512);
			if (i == 255)
				break;
			BaseVarType class474 = (BaseVarType) Class95.method1764(com.jagex.BaseVarType.class, i, 2138772399);
			for (;;) {
				int i_0_ = class523_sub34.readUnsignedByte(-118587515);
				if (255 == i_0_)
					break;
				class523_sub34.offset -= 189765723;
				Class426 class426 = class98_sub1.method14344(class523_sub34, class474, (byte) 1);
				if (null != class426)
					class4.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1828696471);
			}
		}
		return class4;
	}

	public int method7904() {
		return aByte5472 & 0x7;
	}

	static Class4 method7905(RSBuffer class523_sub34, Class98_Sub1 class98_sub1) {
		Class4 class4 = new Class4(class98_sub1);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(605821462);
			if (i == 255)
				break;
			BaseVarType class474 = (BaseVarType) Class95.method1764(com.jagex.BaseVarType.class, i, 2138772399);
			for (;;) {
				int i_1_ = class523_sub34.readUnsignedByte(-1887266481);
				if (255 == i_1_)
					break;
				class523_sub34.offset -= 189765723;
				Class426 class426 = class98_sub1.method14344(class523_sub34, class474, (byte) 1);
				if (null != class426)
					class4.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1926891188);
			}
		}
		return class4;
	}

	static Class4 method7906(RSBuffer class523_sub34, Class98_Sub1 class98_sub1) {
		Class4 class4 = new Class4(class98_sub1);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-876158546);
			if (i == 255)
				break;
			BaseVarType class474 = (BaseVarType) Class95.method1764(com.jagex.BaseVarType.class, i, 2138772399);
			for (;;) {
				int i_2_ = class523_sub34.readUnsignedByte(-629120673);
				if (255 == i_2_)
					break;
				class523_sub34.offset -= 189765723;
				Class426 class426 = class98_sub1.method14344(class523_sub34, class474, (byte) 1);
				if (null != class426)
					class4.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1829787609);
			}
		}
		return class4;
	}

	public int method7907() {
		return 8 == (aByte5472 & 0x8) ? 1 : 0;
	}

	public int method7908() {
		return aByte5472 & 0x7;
	}

	public int method7909(int i) {
		return 8 == (aByte5472 & 0x8) ? 1 : 0;
	}

	public int method7910(int i) {
		return aByte5472 & 0x7;
	}

	public int method7911() {
		return aByte5472 & 0x7;
	}

	public int method7912() {
		return 8 == (aByte5472 & 0x8) ? 1 : 0;
	}

	static final void method7913(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		Class523_Sub27_Sub15 class523_sub27_sub15 = Class199.method3688(i_3_, -419917630);
		if (null != class523_sub27_sub15) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 2084914799 * class523_sub27_sub15.anInt11763;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class217.method3955((2598443596916794745L * class523_sub27_sub15.aLong11760), 1965832361 * (Class53_Sub20.aClass668_10979.anInt8549), -1678676600);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -560691001 * class523_sub27_sub15.anInt11769;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class523_sub27_sub15.aString11761 != null ? class523_sub27_sub15.aString11761 : "");
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class523_sub27_sub15.aString11764 != null ? class523_sub27_sub15.aString11764 : "");
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (null != class523_sub27_sub15.aString11765 ? class523_sub27_sub15.aString11765 : "");
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class523_sub27_sub15.aString11766 != null ? class523_sub27_sub15.aString11766 : "");
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 164921411 * class523_sub27_sub15.anInt11767;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (null != class523_sub27_sub15.aString11768 ? class523_sub27_sub15.aString11768 : "");
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (null != class523_sub27_sub15.aClass421_11759 ? class523_sub27_sub15.aClass421_11759.method82() : -1);
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		}
	}

	static final void method7914(Class669 class669, byte i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub18_10609), i_4_, 2072574071);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1681991536);
		client.aBool11012 = false;
	}

	static final void method7915(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class711.method14325(Class524.method8684((class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]), 1050369988), Class53_Sub20.aClass668_10979.method82(), (short) 9507);
	}
}
