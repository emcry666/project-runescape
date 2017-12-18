/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;

public class Class513 {
	public static Class513 aClass513_5764 = new Class513();
	static Class513 aClass513_5765 = new Class513();
	static Class513 aClass513_5766 = new Class513();

	Class513() {
		/* empty */
	}

	static final void method8580(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class509.aByte5726;
	}

	public static Class266 method8581(int i, int i_0_) {
		if (Class266.aClass266_2861.anInt2859 * -824294281 == i)
			return Class266.aClass266_2861;
		if (i == -824294281 * Class266.aClass266_2860.anInt2859)
			return Class266.aClass266_2860;
		return null;
	}

	static void method8582(byte i) {
		Class481.aClass551_5473.method9129((byte) 0);
		Class642.aClass561_8334.method9455(521659510);
		Class472.aclient5375.method8386(-762380571);
		Class523_Sub18_Sub8.aCanvas11689.setBackground(Color.black);
		client.anInt11033 = 1911302387;
		Class481.aClass551_5473 = Class330.method5820(Class523_Sub18_Sub8.aCanvas11689, (short) -18210);
		Class642.aClass561_8334 = Class304.method5541(Class523_Sub18_Sub8.aCanvas11689, true, -721717655);
	}

	static final void method8583(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_1_, -510333259);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class711.method14327(class250, class242, class669, (byte) 28);
	}

	static final void method8584(Class669 class669, int i) {
		if (null != client.friendsChatName)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 797304521 * Class365.anInt3866;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
