/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class303 {
	static Class303 aClass303_3338 = new Class303(0, true);
	static Class303 aClass303_3339 = new Class303(1, true);
	static Class303 aClass303_3340 = new Class303(2, false);
	int anInt3341;
	boolean aBool3342;
	public static int anInt3343;

	public static Class303 method5534(int i) {
		if (-741545153 * aClass303_3338.anInt3341 == i)
			return aClass303_3338;
		if (aClass303_3339.anInt3341 * -741545153 == i)
			return aClass303_3339;
		if (i == aClass303_3340.anInt3341 * -741545153)
			return aClass303_3340;
		return null;
	}

	Class303(int i, boolean bool) {
		anInt3341 = i * -1959754561;
		aBool3342 = bool;
	}

	static final void method5535(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		class250.aBool2568 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Login.method15991(class250, (byte) -9);
	}

	static final void method5536(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 97896203 * class250.parentId;
	}

	static final void method5537(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class55.method1360(string, -1678762418);
	}

	static final void method5538(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2562 * -1689846769;
	}
}
