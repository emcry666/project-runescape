/* Class669 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class669 {
	Class647_Sub1_Sub3_Sub1 aClass647_Sub1_Sub3_Sub1_8552;
	Class514[] aClass514Array8553;
	long[] aLongArray8554;
	int[] anIntArray8555 = new int[5];
	Map aMap8556;
	int[] anIntArray8557;
	int anInt8558;
	Object[] anObjectArray8559;
	int anInt8560;
	long[] aLongArray8561;
	int anInt8562;
	int anInt8563;
	Class642[] aClass642Array8564;
	Object[] anObjectArray8565;
	Class677 aClass677_8566;
	Class387 aClass387_8567;
	Class647_Sub1_Sub5_Sub1 aClass647_Sub1_Sub5_Sub1_8568;
	Class523_Sub19 aClass523_Sub19_8569;
	boolean aBool8570;
	Class334 aClass334_8571;
	Interface61 anInterface61_8572;
	Map aMap8573;
	Class677 aClass677_8574;
	int anInt8575;
	int anInt8576;
	int[] anIntArray8577;
	int[][] anIntArrayArray8578 = new int[5][5000];
	int anInt8579;
	Class523_Sub27_Sub19 aClass523_Sub27_Sub19_8580;
	int[] anIntArray8581;
	public static Class98_Sub1_Sub1 aClass98_Sub1_Sub1_8582;

	Class669() {
		anIntArray8557 = new int[1000];
		anInt8558 = 0;
		anObjectArray8559 = new Object[1000];
		anInt8560 = 0;
		aLongArray8561 = new long[1000];
		anInt8562 = 0;
		anInt8563 = 0;
		aClass642Array8564 = new Class642[50];
		aClass677_8574 = new Class677();
		aClass677_8566 = new Class677();
		aMap8573 = new HashMap();
		aMap8556 = new HashMap();
		anInt8575 = 0;
		anInt8579 = 1774429083;
	}

	public static final void method13691(boolean bool, int i) {
		Class116[] class116s = client.aClass116Array11210;
		for (int i_0_ = 0; i_0_ < class116s.length; i_0_++) {
			Class116 class116 = class116s[i_0_];
			try {
				class116.method1973(1512049308);
			} catch (IOException ioexception) {
				/* empty */
			}
			class116.method1980((short) -27038);
		}
		Class428.method6758(-655442406);
		Class482.method7920(-32221904);
		Class679.method13827(false, (byte) 18);
		client.aClass505_11019.method8252(-1385589);
		client.aClass505_11019.method8274(1759211772);
		client.aClass505_11019.method8255(-1265745461);
		Class42.method1147((short) -24157);
		Class188.method3594(1440656524);
		Class112.method1953(true, -1228913046);
		Class299.method5482(306656553);
		Class317.method5688((byte) -27);
		client.anInt11154 = 435708883;
		if (bool)
			Class657.method10791(4, (byte) -31);
		else {
			Class657.method10791(16, (byte) -99);
			try {
				Class35.method952(Class305.anApplet3346, "loggedout", (byte) -23);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
}
