/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class273 implements Interface75 {
	public int anInt2887;
	public static Class273 aClass273_2888;
	static Class273 aClass273_2889;
	public static Class273 aClass273_2890 = new Class273(2, 0);
	int anInt2891;

	static {
		aClass273_2888 = new Class273(0, 1);
		aClass273_2889 = new Class273(1, 2);
	}

	public int method82() {
		return anInt2891 * -647216543;
	}

	Class273(int i, int i_0_) {
		anInt2887 = -751432223 * i;
		anInt2891 = i_0_ * 729014689;
	}

	public int method6() {
		return anInt2891 * -647216543;
	}

	public int method101() {
		return anInt2891 * -647216543;
	}

	static Class273[] method5025() {
		return (new Class273[] { aClass273_2888, aClass273_2889, aClass273_2890 });
	}

	static final void method5026(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class40.method1137(class250, class669, (byte) 3);
	}

	public static String method5027(byte i) {
		return Class626.aFile8179.getAbsolutePath();
	}
}
