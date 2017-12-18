/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class65 implements Interface30 {
	public Interface31 method172(Class292 class292, int i) {
		if (Class292.aClass292_3158 == class292)
			return client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (Class292.aClass292_3156 == class292) {
			Class523_Sub28 class523_sub28 = (Class523_Sub28) client.aClass14_11047.getFromIndex((long) i);
			if (class523_sub28 != null)
				return (Interface31) class523_sub28.anObject10554;
		}
		return null;
	}

	public Interface31 method174(Class292 class292, int i, int i_0_) {
		if (Class292.aClass292_3158 == class292)
			return client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (Class292.aClass292_3156 == class292) {
			Class523_Sub28 class523_sub28 = (Class523_Sub28) client.aClass14_11047.getFromIndex((long) i);
			if (class523_sub28 != null)
				return (Interface31) class523_sub28.anObject10554;
		}
		return null;
	}

	public Interface31 method171(Class292 class292, int i) {
		if (Class292.aClass292_3158 == class292)
			return client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (Class292.aClass292_3156 == class292) {
			Class523_Sub28 class523_sub28 = (Class523_Sub28) client.aClass14_11047.getFromIndex((long) i);
			if (class523_sub28 != null)
				return (Interface31) class523_sub28.anObject10554;
		}
		return null;
	}

	public Interface31 method173(Class292 class292, int i) {
		if (Class292.aClass292_3158 == class292)
			return client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (Class292.aClass292_3156 == class292) {
			Class523_Sub28 class523_sub28 = (Class523_Sub28) client.aClass14_11047.getFromIndex((long) i);
			if (class523_sub28 != null)
				return (Interface31) class523_sub28.anObject10554;
		}
		return null;
	}

	Class65() {
		/* empty */
	}

	static final void method1433(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class523_Sub36 class523_sub36 = (Class523_Sub36) client.aClass14_11187.getFromIndex((long) i_1_);
		if (class523_sub36 != null && i_2_ == class523_sub36.anInt10666 * -1444773101)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static void method1434(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		TwitchWebcamDevice twitchwebcamdevice = Class570.method9609(string, 393142256);
		if (twitchwebcamdevice == null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevice.anInt1136 * -2015039365;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = twitchwebcamdevice.aString1134;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = twitchwebcamdevice.aString1135;
		}
	}

	static final void method1435(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_3_, -1050844955);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class238.method4311(class250, class242, class669, (byte) -16);
	}

	static final void method1436(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		class250.aBool2613 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Login.method15991(class250, (byte) 1);
		if (234012635 * class250.anInt2709 == -1 && !class242.aBool2456)
			Class372.method6348(-1363815505 * class250.interfaceHash, 591605129);
	}

	static final void method1437(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.playerVarsProvider.method487(i_4_, -1478265128);
	}
}
