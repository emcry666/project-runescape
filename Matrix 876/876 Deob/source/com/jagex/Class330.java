/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;

public class Class330 implements Interface33 {
	Class319 aClass319_3497;
	Class392 aClass392_3498;
	static Class175 aClass175_3499;
	public static int anInt3500;

	int method5819(Class164 class164, String string, int i, int i_0_, int i_1_, byte i_2_) {
		return class164.method2628(string, i_1_ + i, i_1_ + i_0_, (aClass392_3498.anInt4025 * 1722596233 - 2 * i_1_), (aClass392_3498.anInt4033 * -1978861583 - 2 * i_1_), 10539155 * aClass392_3498.anInt4031, aClass392_3498.anInt4030 * -261012607, 0, 0, 0, null, null, null, 0, 0, -1663152229);
	}

	public boolean method209(byte i) {
		return aClass319_3497.method5697(-1651948215);
	}

	public void method213(boolean bool, short i) {
		Class318 class318 = aClass319_3497.method5695(2028674111 * aClass392_3498.anInt4034, (byte) -36);
		if (null != class318) {
			int i_3_ = ((aClass392_3498.aClass380_4029.method6400(aClass392_3498.anInt4025 * 1722596233, client.anInt11036 * 1536768403, (short) 11482)) + aClass392_3498.anInt4027 * -1678398927);
			int i_4_ = ((aClass392_3498.aClass389_4026.method6473(aClass392_3498.anInt4033 * -1978861583, client.anInt11151 * -932988141, 2146227393)) + aClass392_3498.anInt4028 * 1099119449);
			if (aClass392_3498.aBool4035)
				Class31.aClass178_303.method3083(i_3_, i_4_, aClass392_3498.anInt4025 * 1722596233, aClass392_3498.anInt4033 * -1978861583, aClass392_3498.anInt4032 * 891680769, 0);
			i_4_ += method5819(Class34.aClass164_319, class318.aString3427, i_3_, i_4_, 5, (byte) 4) * 12;
			i_4_ += 8;
			if (aClass392_3498.aBool4035)
				Class31.aClass178_303.method3089(i_3_, i_4_, i_3_ + aClass392_3498.anInt4025 * 1722596233 - 1, i_4_, aClass392_3498.anInt4032 * 891680769, 0);
			i_4_ = ++i_4_ + method5819(Class34.aClass164_319, class318.aString3428, i_3_, i_4_, 5, (byte) 4) * 12;
			i_4_ += 5;
			i_4_ += method5819(Class34.aClass164_319, class318.aString3429, i_3_, i_4_, 5, (byte) 4) * 12;
		}
	}

	Class330(Class319 class319, Class392 class392) {
		aClass392_3498 = class392;
		aClass319_3497 = class319;
	}

	public void method210(int i) {
		/* empty */
	}

	public void method208(boolean bool) {
		Class318 class318 = aClass319_3497.method5695(2028674111 * aClass392_3498.anInt4034, (byte) -87);
		if (null != class318) {
			int i = ((aClass392_3498.aClass380_4029.method6400(aClass392_3498.anInt4025 * 1722596233, client.anInt11036 * 1536768403, (short) -17287)) + aClass392_3498.anInt4027 * -1678398927);
			int i_5_ = ((aClass392_3498.aClass389_4026.method6473(aClass392_3498.anInt4033 * -1978861583, client.anInt11151 * -932988141, 2146227393)) + aClass392_3498.anInt4028 * 1099119449);
			if (aClass392_3498.aBool4035)
				Class31.aClass178_303.method3083(i, i_5_, aClass392_3498.anInt4025 * 1722596233, aClass392_3498.anInt4033 * -1978861583, aClass392_3498.anInt4032 * 891680769, 0);
			i_5_ += method5819(Class34.aClass164_319, class318.aString3427, i, i_5_, 5, (byte) 4) * 12;
			i_5_ += 8;
			if (aClass392_3498.aBool4035)
				Class31.aClass178_303.method3089(i, i_5_, i + aClass392_3498.anInt4025 * 1722596233 - 1, i_5_, aClass392_3498.anInt4032 * 891680769, 0);
			i_5_ = ++i_5_ + method5819(Class34.aClass164_319, class318.aString3428, i, i_5_, 5, (byte) 4) * 12;
			i_5_ += 5;
			i_5_ += method5819(Class34.aClass164_319, class318.aString3429, i, i_5_, 5, (byte) 4) * 12;
		}
	}

	public boolean method211() {
		return aClass319_3497.method5697(-364406937);
	}

	public void method212() {
		/* empty */
	}

	public static Class551 method5820(Component component, short i) {
		return new Class551_Sub1(component);
	}

	public static void method5821(int i) {
		if (Class661.aClass289_8509 != null)
			Class661.aClass289_8509.method5183(-800911491);
		if (null != Class308.aThread3357) {
			for (;;) {
				try {
					Class308.aThread3357.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	static void method5822(int i) {
		if (Class70.method1479(-2118987875)) {
			if (Class95.aStringArray1165 == null)
				Class257.method4687(1312396196);
			Class95.aBool1164 = true;
			Class95.anInt1162 = 0;
			Class95.anIntArray1170 = new int[100];
			Class15.anIntArray184 = new int[100];
			Class338.anIntArray3574 = new int[100];
			Class318.anIntArray3430 = new int[100];
			for (int i_6_ = 0; i_6_ < 100; i_6_++) {
				Class95.anIntArray1170[i_6_] = ((int) (Math.random() * (double) (2141365743 * Class170.anInt1833)) << 4) + (int) (Math.random() * 15.0);
				Class15.anIntArray184[i_6_] = (int) (Math.random() * 350.0) << 4;
				Class338.anIntArray3574[i_6_] = (int) (Math.random() * 102.0) + 51;
				Class318.anIntArray3430[i_6_] = 8 + (int) (Math.random() * 48.0);
			}
			Class241.anIntArray2455 = new int[Class170.anInt1833 * 2141365743 >> 1];
		}
	}
}
