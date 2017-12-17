/* Class670 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class670 {
	public static Class670 aClass670_8583;
	public static Class670 aClass670_8584 = new Class670();
	static Class670 aClass670_8585;

	static {
		aClass670_8583 = new Class670();
		aClass670_8585 = new Class670();
	}

	Class670() {
		/* empty */
	}

	static final void method13692(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (2 == client.anInt11235 * 326760831 && i_0_ < 1563815891 * client.anInt11287)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass60Array11182[i_0_].aBool761 ? 1 : 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method13693(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (2 == client.anInt11235 * 326760831 && i_1_ < 1563815891 * client.anInt11287) {
			Class60 class60 = client.aClass60Array11182[i_1_];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class60.aString763;
			if (null != class60.aString764)
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class60.aString764;
			else
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		}
	}

	static final void method13694(InterfaceComponentDefinitions class250, Class669 class669, int i) {
		if (client.method17252(class250).method15979(-599563334) && client.aClass250_11189 == null) {
			NetworkStream.method9225(class250.interfaceHash * -1363815505, 234012635 * class250.anInt2709, 1369556809);
			client.aClass250_11189 = Class654.method10722(class250.interfaceHash * -1363815505, 234012635 * class250.anInt2709, (byte) -6);
			Login.method15991(client.aClass250_11189, (byte) -89);
		}
	}
}
