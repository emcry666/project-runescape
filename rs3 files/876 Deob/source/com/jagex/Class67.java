/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class67 {
	public static int method1451() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class178 class178 = Class236.method4290(0, canvas, null, null, null, null, null, null, 0, (byte) -6);
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		for (int i = 0; i < 10000; i++)
			class178.method3330(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (TimeUtils.getCurrentTimeMilliseconds(1516375036) - l);
		class178.method3354(0, 0, 100, 100, -16777216, (byte) 25);
		class178.method3024(556162073);
		return i;
	}

	Class67() throws Throwable {
		throw new Error();
	}

	static void method1452() {
		/* empty */
	}

	public static int method1453() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class178 class178 = Class236.method4290(0, canvas, null, null, null, null, null, null, 0, (byte) -80);
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		for (int i = 0; i < 10000; i++)
			class178.method3330(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (TimeUtils.getCurrentTimeMilliseconds(1516375036) - l);
		class178.method3354(0, 0, 100, 100, -16777216, (byte) 6);
		class178.method3024(407178546);
		return i;
	}

	static void method1454(Class669 class669, Class514 class514, Exception exception, String string, int i) {
		StringBuilder stringbuilder = new StringBuilder(30);
		stringbuilder.append(new StringBuilder().append(string).append(" ").toString()).append(class669.aClass523_Sub27_Sub19_8580.aLong7065 * 1055205983951172633L).append(" ");
		for (int i_0_ = class669.anInt8563 * -2124697313 - 1; i_0_ >= 0; i_0_--)
			stringbuilder.append("").append(1055205983951172633L * (class669.aClass642Array8564[i_0_].aClass523_Sub27_Sub19_8332.aLong7065)).append(" ");
		stringbuilder.append("").append(Integer.valueOf(1309865643 * class514.anInt7038));
		Class305.method5553(stringbuilder.toString(), exception, (byte) 1);
	}

	static final void method1455(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_1_, -1041524380);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class464.method7542(class250, class242, class669, -1235356219);
	}

	static final void method1456(Class669 class669, int i) {
		if (0 == 326760831 * client.anInt11235)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.anInt11078 * 54287651;
	}

	public static int method1457(Class440 class440, byte i) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
		class437.method6949();
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
	}

	static final void method1458(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		String string_2_ = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4308, client.aClass116_11057.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((Class6.method555(string, (byte) -80) + Class6.method555(string_2_, (byte) -44)), (byte) -122);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 35);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_2_, (byte) -4);
		client.aClass116_11057.method1974(class523_sub22, (byte) 68);
	}

	static final void method1459(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_3_, -1482699588);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class318.method5693(class250, class242, class669, -605363056);
	}

	public static void method1460(int i, byte i_4_) {
		if (i == 25)
			Class534_Sub1.aFloat7155 = 2.0F;
		else if (i == 37)
			Class534_Sub1.aFloat7155 = 3.0F;
		else if (i == 50)
			Class534_Sub1.aFloat7155 = 4.0F;
		else if (75 == i)
			Class534_Sub1.aFloat7155 = 6.0F;
		else if (i == 100)
			Class534_Sub1.aFloat7155 = 8.0F;
		else if (200 == i)
			Class534_Sub1.aFloat7155 = 16.0F;
		Class534_Sub1.anInt10779 = -465264525;
		Class534_Sub1.anInt10779 = -465264525;
	}
}
