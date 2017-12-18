/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class284 {
	static Class284 aClass284_3072;
	static Class284 aClass284_3073;
	static Class284 aClass284_3074;
	public int anInt3075;
	public static Class284 aClass284_3076 = new Class284(0, 104);
	static Class284 aClass284_3077;
	static Class284 aClass284_3078;
	public int anInt3079;

	Class284(int i, int i_0_) {
		anInt3075 = 1700999197 * i;
		anInt3079 = i_0_ * -1473043915;
	}

	static {
		aClass284_3073 = new Class284(1, 120);
		aClass284_3074 = new Class284(2, 136);
		aClass284_3072 = new Class284(3, 168);
		aClass284_3077 = new Class284(4, 72);
		aClass284_3078 = new Class284(5, 256);
	}

	static Class284[] method5138() {
		return (new Class284[] { aClass284_3077, aClass284_3072, aClass284_3074, aClass284_3078, aClass284_3073, aClass284_3076 });
	}

	public static Class284 method5139(int i) {
		Class284[] class284s = Class319.method5706(-64974631);
		for (int i_1_ = 0; i_1_ < class284s.length; i_1_++) {
			Class284 class284 = class284s[i_1_];
			if (1532564021 * class284.anInt3075 == i)
				return class284;
		}
		return null;
	}

	public static Class284 method5140(int i) {
		Class284[] class284s = Class319.method5706(-1215272456);
		for (int i_2_ = 0; i_2_ < class284s.length; i_2_++) {
			Class284 class284 = class284s[i_2_];
			if (1532564021 * class284.anInt3075 == i)
				return class284;
		}
		return null;
	}

	static final void method5141(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class553.method9164(4, i_3_, i_4_, "", 466275862);
	}

	static final void method5142(boolean bool, byte i) {
		Class291.method5231(-1614846429 * client.anInt11186, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, bool, 859643161);
	}
}
