/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class170 {
	public static Class170 aClass170_1822;
	static Class170 aClass170_1823;
	static Class170 aClass170_1824;
	public static Class170 aClass170_1825;
	public static Class170 aClass170_1826;
	public static Class170 aClass170_1827;
	static Class170 aClass170_1828 = new Class170(1, 1);
	public static Class170 aClass170_1829;
	public int anInt1830;
	public int anInt1831;
	public static Class170 aClass170_1832;
	public static int anInt1833;
	static int anInt1834;

	Class170(int i, int i_0_) {
		anInt1830 = -1617415955 * i;
		anInt1831 = -524262845 * i_0_;
	}

	static {
		aClass170_1823 = new Class170(0, 2);
		aClass170_1824 = new Class170(3, 4);
		aClass170_1822 = new Class170(2, 1);
		aClass170_1826 = new Class170(8, 2);
		aClass170_1827 = new Class170(7, 3);
		aClass170_1829 = new Class170(5, 4);
		aClass170_1832 = new Class170(4, 2);
		aClass170_1825 = new Class170(6, 4);
	}

	static final void method2885(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_2_, (byte) 111);
		if (class76.method1537((byte) -66))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(i_1_, (byte) 5)).method3725(i_2_, class76.aString849, (byte) -80);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(i_1_, (byte) -7)).method3715(i_2_, class76.anInt850 * -1100663923, (byte) -53));
	}

	static final void method2886(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		float f = Class433.method6799(class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		Class523_Sub27_Sub13 class523_sub27_sub13 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5333(i_3_, 254322906);
		if (null == class523_sub27_sub13)
			throw new RuntimeException("");
		if (!(class523_sub27_sub13 instanceof Class523_Sub27_Sub13_Sub1))
			throw new RuntimeException("");
		((Class523_Sub27_Sub13_Sub1) class523_sub27_sub13).method18509(f, (byte) 1);
	}

	static final void method2887(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3965(-383852254) == i_4_ ? 1 : 0;
	}

	static void method2888(File file, byte[] is, int i, int i_5_) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	static void method2889(int i) {
		/* empty */
	}

	static void method2890(Class250[] class250s, Class250 class250, boolean bool, int i) {
		int i_6_ = (0 != 907343347 * class250.anInt2554 ? class250.anInt2554 * 907343347 : 365308179 * class250.anInt2581);
		int i_7_ = (class250.anInt2618 * -222228463 != 0 ? class250.anInt2618 * -222228463 : class250.anInt2543 * -1759297857);
		Class214.method3841(class250s, class250.anInt2585 * -1363815505, i_6_, i_7_, bool, 143451369);
		if (class250.aClass250Array2519 != null)
			Class214.method3841(class250.aClass250Array2519, class250.anInt2585 * -1363815505, i_6_, i_7_, bool, 143451369);
		Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method741((long) (-1363815505 * class250.anInt2585)));
		if (class523_sub36 != null)
			Class291.method5231(class523_sub36.anInt10666 * -1444773101, i_6_, i_7_, bool, -806108800);
		if (client.aClass250_11114 == class250) {
			int i_8_ = Class108.anInt1318 * 393652345;
			int[] is = Class108.anIntArray1319;
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_9_]];
				if (class647_sub1_sub3_sub1_sub2 != null)
					class647_sub1_sub3_sub1_sub2.method18357(i_6_, i_7_, bool, (byte) 120);
			}
			for (int i_10_ = 0; i_10_ < 920163749 * client.anInt11050; i_10_++) {
				int i_11_ = client.anIntArray11051[i_10_];
				Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_11_));
				if (class523_sub28 != null)
					((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554).method18357(i_6_, i_7_, bool, (byte) 5);
			}
		}
	}

	static final void method2891(Class669 class669, int i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_12_, -736100855);
		Class242 class242 = Class31.aClass242Array302[i_12_ >> 16];
		Class602.method9936(class250, class242, class669, (short) 10445);
	}

	static final void method2892(Class250 class250, Class242 class242, Class669 class669, PacketsDecoder class233, byte i) {
		int i_13_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		switch (2117633145 * class233.anInt2374) {
		case 0:
			if (Class99.aClass115Array1232 != null && i_13_ < Class99.aClass115Array1232.length)
				class250.aString2515 = Class99.aClass115Array1232[i_13_].aString1409;
			break;
		case 4:
			class250.aString2515 = ((Class212) Class461.aClass218_5122.method3972((short) 256).get(i_13_)).method3825((byte) -79);
			break;
		case 2:
			class250.aString2515 = Class461.aClass218_5122.method3967(i_13_, (byte) 2).method4177(-2110204661);
			break;
		case 1:
			if (2 == client.anInt11235 * 326760831 && i_13_ < client.anInt11287 * 1563815891)
				class250.aString2515 = client.aClass60Array11182[i_13_].aString763;
			else
				return;
			break;
		case 3:
		case 5:
			class250.aString2515 = (class669.aClass523_Sub19_8569.aClass338Array10485[i_13_].aString3573);
			break;
		default:
			throw new IllegalStateException();
		}
		class250.aClass233_2683 = class233;
	}
}
