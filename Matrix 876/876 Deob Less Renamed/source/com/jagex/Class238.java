/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class238 {
	static final String aString2397 = "#";

	Class238() throws Throwable {
		throw new Error();
	}

	public static final boolean method4303(String string, String string_0_, String string_1_, String string_2_) {
		if (string == null || null == string_1_)
			return false;
		if (string.startsWith("#") || string_1_.startsWith("#"))
			return string.equals(string_1_);
		return string_0_.equals(string_2_);
	}

	public static final boolean method4304(String string, String string_3_, String string_4_, String string_5_) {
		if (string == null || null == string_4_)
			return false;
		if (string.startsWith("#") || string_4_.startsWith("#"))
			return string.equals(string_4_);
		return string_3_.equals(string_5_);
	}

	public static final boolean method4305(String string, String string_6_, String string_7_, String string_8_) {
		if (string == null || null == string_7_)
			return false;
		if (string.startsWith("#") || string_7_.startsWith("#"))
			return string.equals(string_7_);
		return string_6_.equals(string_8_);
	}

	public static Class559 method4306(boolean bool, int i) {
		synchronized (Class559.aStack7491) {
			Class559 class559;
			if (Class559.aStack7491.isEmpty())
				class559 = new Class559();
			else
				class559 = (Class559) Class559.aStack7491.pop();
			class559.aBool7493 = bool;
			Class559 class559_9_ = class559;
			return class559_9_;
		}
	}

	public static void method4307(byte i) {
		if (null != Class655.aClass375_8420) {
			Class655.aClass375_8420.method6369(-2100880291);
			Class655.aClass375_8420 = null;
		}
	}

	static final void method4308(Class669 class669, byte i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1] = (class669.aClass523_Sub19_8569.method16045(-201906661)[class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1]]);
	}

	static final void method4309(Class669 class669, byte i) {
		Class611_Sub1 class611_sub1 = Class468.method7610(2122793028);
		if (class611_sub1 != null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1568680265 * class611_sub1.anInt10588;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -427096717 * class611_sub1.anInt8010;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10587;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.method16192((byte) 12);
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.method16195(1254733683);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1102045477 * class611_sub1.anInt8012;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt10585 * -1614476621;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10586;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		}
	}

	public static String method4310(byte[] is, byte i) {
		return Class651.method10636(is, 0, is.length, -1210151419);
	}

	static final void method4311(Class250 class250, Class242 class242, Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2637 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}
}
