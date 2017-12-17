/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class392 implements Interface49 {
	public int anInt4025;
	public Class389 aClass389_4026;
	public int anInt4027;
	public int anInt4028;
	public Class380 aClass380_4029;
	public int anInt4030;
	public int anInt4031;
	public int anInt4032;
	public int anInt4033;
	public int anInt4034;
	public boolean aBool4035;
	public static int anInt4036;
	public static Class705 aClass705_4037;

	public Class394 method352() {
		return Class394.aClass394_4044;
	}

	public Class394 method353(int i) {
		return Class394.aClass394_4044;
	}

	Class392(int i, Class380 class380, Class389 class389, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
		anInt4034 = -2077043777 * i;
		aClass380_4029 = class380;
		aClass389_4026 = class389;
		anInt4027 = -545296687 * i_0_;
		anInt4028 = i_1_ * -1884070679;
		anInt4025 = i_2_ * -1591203143;
		anInt4033 = i_3_ * -994240239;
		anInt4031 = 2004143515 * i_4_;
		anInt4030 = -1384448895 * i_5_;
		anInt4032 = i_6_ * 1796868097;
		aBool4035 = bool;
	}

	public Class394 method351() {
		return Class394.aClass394_4044;
	}

	public Class394 method354() {
		return Class394.aClass394_4044;
	}

	static final void method6489(Class669 class669, int i) throws Exception_Sub2 {
		Class309 class309 = (Class309) (class669.aClass523_Sub27_Sub19_8580.anObjectArray11845[class669.anInt8579 * 1180759405]);
		Interface20 interface20 = ((Interface20) (class669.anIntArray8577[class669.anInt8579 * 1180759405] == 0 ? class669.aMap8573.get(class309.aClass159_3367.aClass470_1755) : class669.aMap8556.get(class309.aClass159_3367.aClass470_1755)));
		try {
			interface20.method117(class309, class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -1928598365);
		} catch (Exception_Sub2 exception_sub2) {
			if (interface20 instanceof Class590)
				Class67.method1454(class669, Class514.aClass514_6655, exception_sub2, "VO", -1599122367);
			else
				throw exception_sub2;
		}
	}

	static final void method6490(Class669 class669, int i) {
		int i_7_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_7_, -1762919352);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -448482823 * class250.anInt2636;
	}

	public static final void method6491(int i) {
		if (!client.aBool11108) {
			client.aFloat11177 += (-24.0F - client.aFloat11177) / 2.0F;
			client.aBool11111 = true;
			client.aBool11108 = true;
		}
	}

	static final void method6492(Class669 class669, byte i) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class648.method10612((long) i_8_, 0, bool, Class53_Sub20.aClass668_10979, -1296112206);
	}
}
