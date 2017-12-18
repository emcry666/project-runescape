/* Class412 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class412 {
	public static Class412 aClass412_4541;
	public static Class412 SEND_GROUND_ITEM;
	public static Class412 PROJECTILE = new Class412(21);
	public static Class412 aClass412_4544;
	public static Class412 aClass412_4555;
	public static Class412 aClass412_4546;
	public static Class412 REMOVE_GROUND_ITEM;
	public static Class412 ADJUSTED_PROJECTILE;
	public static Class412 aClass412_4549;
	public static Class412 REMOVE_OBJECT;
	public static Class412 aClass412_4551;
	public static Class412 aClass412_4552;
	public static Class412 aClass412_4553;
	public static Class412 aClass412_4554;
	public static Class412 SEND_OBJECT;
	public static Class53_Sub19 aClass53_Sub19_4556;

	public static Class412[] method6640() {
		return (new Class412[] { PROJECTILE, SEND_GROUND_ITEM, aClass412_4544, aClass412_4552, aClass412_4541, aClass412_4546, REMOVE_GROUND_ITEM, aClass412_4554, aClass412_4549, REMOVE_OBJECT, aClass412_4551, aClass412_4555, aClass412_4553, ADJUSTED_PROJECTILE, SEND_OBJECT });
	}

	static {
		SEND_GROUND_ITEM = new Class412(7);
		aClass412_4544 = new Class412(-1);
		aClass412_4552 = new Class412(10);
		aClass412_4541 = new Class412(9);
		aClass412_4546 = new Class412(7);
		REMOVE_GROUND_ITEM = new Class412(3);
		aClass412_4554 = new Class412(8);
		aClass412_4549 = new Class412(5);
		REMOVE_OBJECT = new Class412(2);
		aClass412_4551 = new Class412(5);
		aClass412_4555 = new Class412(7);
		aClass412_4553 = new Class412(-1);
		ADJUSTED_PROJECTILE = new Class412(18);
		SEND_OBJECT = new Class412(6);
	}

	public static Class412[] method6641() {
		return (new Class412[] { PROJECTILE, SEND_GROUND_ITEM, aClass412_4544, aClass412_4552, aClass412_4541, aClass412_4546, REMOVE_GROUND_ITEM, aClass412_4554, aClass412_4549, REMOVE_OBJECT, aClass412_4551, aClass412_4555, aClass412_4553, ADJUSTED_PROJECTILE, SEND_OBJECT });
	}

	Class412(int i) {
		/* empty */
	}

	static final void method6642(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4107(i_0_, -1038582336).method4039(1039990848);
	}

	public static void method6643(int[] is, int[] is_1_, byte i) {
		if (null == is || null == is_1_) {
			Class689.anIntArray8682 = null;
			Class689.anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			Class689.anIntArray8682 = is;
			Class689.anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i_2_ = 0; i_2_ < Class689.anIntArray8682.length; i_2_++)
				Class212.aByteArrayArrayArray2266[i_2_] = new byte[is_1_[i_2_]][];
		}
	}

	public static int method6644(byte i) {
		Class47_Sub1 class47_sub1 = Class210.method3819(-191088010);
		Class468.method7605(class47_sub1, (byte) -70);
		return class47_sub1.method1252(203942797);
	}

	static final void method6645(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
	}

	public static int method6646(int i, int i_3_, int i_4_, int i_5_) {
		i_4_ &= 0x3;
		if (i_4_ == 0)
			return i_3_;
		if (i_4_ == 1)
			return 7 - i;
		if (i_4_ == 2)
			return 7 - i_3_;
		return i;
	}
}
