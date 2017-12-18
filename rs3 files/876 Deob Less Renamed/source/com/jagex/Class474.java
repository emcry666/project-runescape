/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class474 implements Interface75 {
	static Class474 aClass474_5381;
	public static Class474 aClass474_5382 = new Class474(0, 0, java.lang.Integer.class, new Class483());
	public static Class474 aClass474_5383 = new Class474(1, 1, java.lang.Long.class, new Class487());
	public static Class474 aClass474_5384 = new Class474(2, 2, java.lang.String.class, new Class485());
	static Class474 aClass474_5385;
	public int anInt5386;
	int anInt5387;
	public Class aClass5388;
	Interface11 anInterface11_5389;
	static int anInt5390;
	static Class250 aClass250_5391;
	static Class523_Sub27_Sub6 aClass523_Sub27_Sub6_5392;

	public static Interface11 method7742(Class var_class) {
		Class474 class474 = method7744(var_class, 199906709);
		if (class474 == null)
			throw new IllegalArgumentException();
		return class474.anInterface11_5389;
	}

	public static Class474[] method7743() {
		return new Class474[] { aClass474_5382, aClass474_5383, aClass474_5384, aClass474_5385, aClass474_5381 };
	}

	static Class474 method7744(Class var_class, int i) {
		Class474[] class474s = method7746(1132540194);
		for (int i_0_ = 0; i_0_ < class474s.length; i_0_++) {
			Class474 class474 = class474s[i_0_];
			if (class474.aClass5388 == var_class)
				return class474;
		}
		return null;
	}

	public static Interface11 method7745(Class var_class, int i) {
		Class474 class474 = method7744(var_class, -1837438247);
		if (class474 == null)
			throw new IllegalArgumentException();
		return class474.anInterface11_5389;
	}

	public int method101() {
		return 1705088833 * anInt5387;
	}

	public static Class474[] method7746(int i) {
		return new Class474[] { aClass474_5382, aClass474_5383, aClass474_5384, aClass474_5385, aClass474_5381 };
	}

	static {
		aClass474_5381 = new Class474(4, 3, com.jagex.Class523_Sub29.class, new Class482());
		aClass474_5385 = new Class474(3, 4, com.jagex.Class245.class, new Class480());
	}

	public int method6() {
		return 1705088833 * anInt5387;
	}

	public static Class474[] method7747() {
		return new Class474[] { aClass474_5382, aClass474_5383, aClass474_5384, aClass474_5385, aClass474_5381 };
	}

	public static Class474[] method7748() {
		return new Class474[] { aClass474_5382, aClass474_5383, aClass474_5384, aClass474_5385, aClass474_5381 };
	}

	public Object method7749(Class523_Sub34 class523_sub34, int i) {
		return anInterface11_5389.method65(class523_sub34, -721285210);
	}

	public int method82() {
		return 1705088833 * anInt5387;
	}

	Class474(int i, int i_1_, Class var_class, Interface11 interface11) {
		anInt5386 = 666085777 * i;
		anInt5387 = i_1_ * -1557727039;
		aClass5388 = var_class;
		anInterface11_5389 = interface11;
	}

	public static Interface11 method7750(Class var_class) {
		Class474 class474 = method7744(var_class, 395713311);
		if (class474 == null)
			throw new IllegalArgumentException();
		return class474.anInterface11_5389;
	}

	public static Class474[] method7751() {
		return new Class474[] { aClass474_5382, aClass474_5383, aClass474_5384, aClass474_5385, aClass474_5381 };
	}

	public static Interface11 method7752(Class var_class) {
		Class474 class474 = method7744(var_class, 1653210154);
		if (class474 == null)
			throw new IllegalArgumentException();
		return class474.anInterface11_5389;
	}

	public static Interface11 method7753(Class var_class) {
		Class474 class474 = method7744(var_class, 1701203380);
		if (class474 == null)
			throw new IllegalArgumentException();
		return class474.anInterface11_5389;
	}

	public Object method7754(Class523_Sub34 class523_sub34) {
		return anInterface11_5389.method65(class523_sub34, -721285210);
	}

	public Object method7755(Class523_Sub34 class523_sub34) {
		return anInterface11_5389.method65(class523_sub34, -721285210);
	}

	static final void method7756(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_2_, -639868326);
		Class242 class242 = Class31.aClass242Array302[i_2_ >> 16];
		Class511.method8563(class250, class242, class669, (byte) 36);
	}

	static final void method7757(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 462991943 * Class36.anInt330;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -914479837 * Class36.anInt336;
	}

	static final void method7758(Class669 class669, int i) {
		long l = (class669.aLongArray8561[(class669.anInt8562 -= -2045027743) * 2056702369]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
	}

	static final void method7759(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 134503241 * Class491.anInt5537;
	}

	static final void method7760(Class669 class669, byte i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (null != client.friendsChatName && i_3_ < Class365.anInt3866 * 797304521)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class99.aClass115Array1232[i_3_].aString1408;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}

	public static boolean method7761(int i, byte i_4_) {
		return i == 9 || i == 10 || i == 4;
	}

	static byte method7762(int i, int i_5_, byte i_6_) {
		if (1923531495 * Class607.aClass607_7971.anInt7982 != i)
			return (byte) 0;
		if ((i_5_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	static final void method7763(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub11_10621.method16837(-148479141);
	}

	public static void method7764(int i, int i_7_) {
		Class688_Sub4.anInt10964 = i * 858279035;
		Class523_Sub39_Sub2.aClass523_Sub39_Sub2Array11799 = new Class523_Sub39_Sub2[i];
		Class687_Sub33.anInt10909 = 0;
	}

	static final void method7765(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_8_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_9_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class252.method4539(i_8_, i_9_, false, -2003369433);
	}

	static final void method7766(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class159_Sub2.method14357(string, 241551684);
	}
}
