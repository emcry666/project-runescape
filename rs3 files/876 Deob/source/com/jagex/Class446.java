/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class446 {
	public static final int anInt4928 = 3;
	public static final int anInt4929 = 0;
	public static final int anInt4930 = 2;
	public static final int anInt4931 = 4;
	public static final int anInt4932 = 1;
	static int anInt4933;

	Class446() throws Throwable {
		throw new Error();
	}

	static final void method7238(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		RSStream class116 = Class537.method8941(-1113089474);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4275, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -1648180020);
		int i_1_ = class523_sub22.aClass523_Sub34_Sub2_10525.offset * 2349011;
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_0_, 1625581315);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(class669.aClass387_8567.anInt4010 * -1038659943, (byte) -46);
		class669.aClass387_8567.aClass523_Sub27_Sub18_4009.method18252(class523_sub22.aClass523_Sub34_Sub2_10525, class669.aClass387_8567.anIntArray4008, (byte) -116);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.offset * 2349011 - i_1_), 759584760);
		class116.method1974(class523_sub22, (byte) 68);
	}

	static Class523_Sub22 method7239(int i, int i_2_, int i_3_, int i_4_) {
		Class523_Sub22 class523_sub22 = null;
		if (i_3_ == 0)
			class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.WALK_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
		if (1 == i_3_)
			class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.MINIMAP_WALK_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i + class592.localX * 235453015, (byte) -43);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_2_ + 1704054549 * class592.localY, (byte) 72);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 28) ? 1 : 0, -159492164);
		Class104.anInt1269 = -250567387 * i;
		Class104.anInt1270 = -1284332517 * i_2_;
		Class104.aBool1265 = false;
		Class84.method1597(1520857083);
		return class523_sub22;
	}

	static void method7240(InterfaceComponentDefinitions class250, byte i) {
		if (client.aBool11000) {
			if (class250.anObjectArray2616 != null) {
				InterfaceComponentDefinitions class250_5_ = Class654.method10722(1383041209 * Class232.anInt2367, -1034378319 * client.anInt11105, (byte) -5);
				if (class250_5_ != null) {
					Class523_Sub38 class523_sub38 = new Class523_Sub38();
					class523_sub38.aClass250_10678 = class250;
					class523_sub38.aClass250_10684 = class250_5_;
					class523_sub38.anObjectArray10687 = class250.anObjectArray2616;
					Class482.method7916(class523_sub38, (byte) 3);
				}
			}
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4306, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntLE(-1363815505 * class250.interfaceHash, 4508841);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(class250.anInt2680 * -1878986101, (byte) -15);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(client.anInt11105 * -1034378319, -149515713);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(234012635 * class250.anInt2709, -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1383041209 * Class232.anInt2367, -903384683);
			client.aClass116_11058.method1974(class523_sub22, (byte) 110);
		}
	}

	static final void method7241(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub22_10651, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), -442138641);
		Class211.method3824(1342680773);
		client.aBool11012 = false;
	}
}
