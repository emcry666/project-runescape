/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class365 {
	public static Class365 aClass365_3864 = new Class365();
	public static Class365 aClass365_3865 = new Class365();
	public static int anInt3866;
	static Class148[] aClass148Array3867;

	Class365() {
		/* empty */
	}

	static final void method6295(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		if (class669.anIntArray8557[class669.anInt8558 * 1357652815] >= class669.anIntArray8557[1 + class669.anInt8558 * 1357652815])
			class669.anInt8579 += -1774429083 * (class669.anIntArray8577[1180759405 * class669.anInt8579]);
	}

	static final void method6296(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class174.method2931(class250, class669, (short) -7640);
	}

	public static Class468[] method6297(int i) {
		return (new Class468[] { Class468.aClass468_5333, Class468.aClass468_5331, Class468.aClass468_5332 });
	}

	static Class method6298(String string, byte i) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	static final void method6299(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2561 * 345997065;
	}
}
