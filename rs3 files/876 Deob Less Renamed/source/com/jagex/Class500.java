/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class500 {
	public static Class500 aClass500_5568 = new Class500(false, false);
	public static Class500 aClass500_5569 = new Class500(true, false);
	static Class500 aClass500_5570;
	public static Class500 aClass500_5571;
	static Class500 aClass500_5572;
	static Class500 aClass500_5573;
	public static Class500 aClass500_5574;
	public static Class500 aClass500_5575 = new Class500(false, false);
	boolean aBool5576;
	boolean aBool5577;

	public boolean method8113() {
		return aBool5577;
	}

	boolean method8114(int i) {
		return aBool5576;
	}

	Class500(boolean bool, boolean bool_0_) {
		aBool5576 = bool;
		aBool5577 = bool_0_;
	}

	static {
		aClass500_5571 = new Class500(true, false);
		aClass500_5572 = new Class500(true, false);
		aClass500_5573 = new Class500(true, true);
		aClass500_5570 = new Class500(true, true);
		aClass500_5574 = new Class500(false, false);
	}

	boolean method8115() {
		return aBool5576;
	}

	public boolean method8116() {
		return aBool5577;
	}

	public boolean method8117(int i) {
		return aBool5577;
	}

	public static final int method8118(int i, int i_1_, int i_2_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_1_ < 2)
				i_1_ = 2;
			else if (i_1_ > 126)
				i_1_ = 126;
			return i_1_;
		}
		i_1_ = i_1_ * (i & 0x7f) >> 7;
		if (i_1_ < 2)
			i_1_ = 2;
		else if (i_1_ > 126)
			i_1_ = 126;
		return (i & 0xff80) + i_1_;
	}

	static final void method8119(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_3_, -866756550);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class386.method6457(class250, class242, class669, (byte) 74);
	}

	static final void method8120(Class669 class669, int i) {
		class669.anInt8560 -= -587057089;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		String string_4_ = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560 + 1]);
		String string_5_ = ((String) class669.anObjectArray8559[2 + 240723773 * class669.anInt8560]);
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1);
		Class214.method3836(string, string_4_, string_5_, bool, (byte) -96);
	}

	static final void method8121(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		long l = Class570.method9606(-689424929);
		if (l == 0L)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 5;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class173.method2903(l, string, (byte) -87);
	}

	public static void method8122(String string, int i) {
		Class95.aString1171 = string;
		Class95.anInt1173 = Class95.aString1171.length() * 331909503;
	}
}
