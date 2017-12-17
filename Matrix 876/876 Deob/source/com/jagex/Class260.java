/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class260 {
	static Class262 aClass262_2837;
	static String aString2838;

	public static void method4700(Class262 class262) {
		aClass262_2837 = class262;
	}

	public static int method4701(RSBuffer class523_sub34, String string) {
		int i = class523_sub34.offset * 2349011;
		byte[] is = OutgoingPacket.method6623(string, 1768850870);
		class523_sub34.method16317(is.length, (short) -2002);
		class523_sub34.offset += aClass262_2837.method4724(is, 0, is.length, class523_sub34.buffer, 2349011 * class523_sub34.offset, (byte) -80) * 189765723;
		return 2349011 * class523_sub34.offset - i;
	}

	public static int method4702(RSBuffer class523_sub34, String string) {
		int i = class523_sub34.offset * 2349011;
		byte[] is = OutgoingPacket.method6623(string, -1975220533);
		class523_sub34.method16317(is.length, (short) -2002);
		class523_sub34.offset += aClass262_2837.method4724(is, 0, is.length, class523_sub34.buffer, 2349011 * class523_sub34.offset, (byte) -99) * 189765723;
		return 2349011 * class523_sub34.offset - i;
	}

	Class260() throws Throwable {
		throw new Error();
	}

	public static int method4703(RSBuffer class523_sub34, String string) {
		int i = class523_sub34.offset * 2349011;
		byte[] is = OutgoingPacket.method6623(string, -1198075734);
		class523_sub34.method16317(is.length, (short) -2002);
		class523_sub34.offset += aClass262_2837.method4724(is, 0, is.length, class523_sub34.buffer, 2349011 * class523_sub34.offset, (byte) -2) * 189765723;
		return 2349011 * class523_sub34.offset - i;
	}

	public static int method4704(RSBuffer class523_sub34, String string) {
		int i = class523_sub34.offset * 2349011;
		byte[] is = OutgoingPacket.method6623(string, -86826433);
		class523_sub34.method16317(is.length, (short) -2002);
		class523_sub34.offset += aClass262_2837.method4724(is, 0, is.length, class523_sub34.buffer, 2349011 * class523_sub34.offset, (byte) 30) * 189765723;
		return 2349011 * class523_sub34.offset - i;
	}

	public static String method4705(RSBuffer class523_sub34) {
		return Class566.method9503(class523_sub34, 32767, -2054036149);
	}

	public static int method4706(int i) {
		if (!Class423.method6714(1232493260))
			return 0;
		return Class569.anInt7640 * 1314363521;
	}

	static final void method4707(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1013149031 * class250.anInt2539;
	}

	static final void method4708(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1799152915);
		Class40.method1137(class250, class669, (byte) 3);
	}

	static final void method4709(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.aByte3522;
	}

	static final void method4710(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class449.aClass523_Sub33_4946.aClass687_Sub30_10610.method16978(-1867884246) && Class31.aClass178_303.method3030()) ? 1 : 0;
	}

	static final void method4711(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class254.method4545(class250, class242, class669, 1874600493);
	}
}
