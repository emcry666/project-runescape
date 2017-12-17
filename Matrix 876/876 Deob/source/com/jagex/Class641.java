/* Class641 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class641 {
	public static final int anInt8316 = 2816;
	public static final int anInt8317 = 16777215;
	public static final int anInt8318 = 13156520;
	static final int anInt8319 = 5000;
	public static final float aFloat8320 = 1.2F;
	public static final float aFloat8321 = 0.69921875F;
	public static final int anInt8322 = -60;
	public static final int anInt8323 = -50;
	public static final int anInt8324 = 0;
	public static final int anInt8325 = 2816;
	public static final float aFloat8326 = 1.1523438F;
	public static final int anInt8327 = -50;
	public static final int anInt8328 = 2816;

	static {
		new Class437(0.6F, 0.6F, 0.6F);
		new Class437(0.3F, 0.3F, 0.3F);
		new Class437(0.3F, 0.3F, 0.5F);
	}

	Class641() throws Throwable {
		throw new Error();
	}

	static final void method10530(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1759361998);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class291.method5235(class250, class242, class669, -853549931);
	}

	static final void method10531(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int[] is = Class594.method9807(string, class669, (byte) 0);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2652 = Class78.method1554(string, class669, -68449792);
		class250.anIntArray2653 = is;
		class250.aBool2635 = true;
	}
}
