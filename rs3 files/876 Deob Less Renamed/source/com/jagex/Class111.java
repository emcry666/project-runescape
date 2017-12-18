/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class111 {
	public int anInt1334;
	int anInt1335;
	public int anInt1336;
	int anInt1337;
	public int anInt1338;
	public int anInt1339;
	static Class209 aClass209_1340 = new Class209(4);
	public int anInt1341 = -904299147;
	public int anInt1342;
	int anInt1343;
	int anInt1344;
	static int anInt1345;

	static void method1928(int i) {
		anInt1345 = i * 1177210477;
		aClass209_1340.method3773(-1947118852);
	}

	public static Class167 method1929(Class178 class178, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		long l = (long) i_3_;
		Class167 class167 = (Class167) aClass209_1340.method3767(l);
		int i_4_ = 2055;
		if (class167 == null) {
			Class179 class179 = Class179.method3485(Class413.aClass472_4583, i_3_, 0);
			if (class179 == null)
				return null;
			if (class179.anInt1952 < 13)
				class179.method3494(2);
			class167 = class178.method3115(class179, i_4_, -150377627 * anInt1345, 64, 768);
			aClass209_1340.method3770(class167, l);
		}
		class167 = class167.method2681((byte) 6, i_4_, true);
		if (i != 0)
			class167.method2685(i);
		if (0 != i_0_)
			class167.method2845(i_0_);
		if (i_1_ != 0)
			class167.method2688(i_1_);
		if (0 != i_2_)
			class167.method2689(0, i_2_, 0);
		return class167;
	}

	static void method1930(int i) {
		anInt1345 = i * 1177210477;
		aClass209_1340.method3773(-1967879000);
	}

	static void method1931() {
		aClass209_1340.method3773(-2076141012);
	}

	Class111() {
		/* empty */
	}

	static void method1932() {
		aClass209_1340.method3773(-2045449210);
	}

	static void method1933(int i) {
		aClass209_1340.method3772(i, (byte) -3);
	}

	static void method1934() {
		aClass209_1340.method3776(-585258028);
	}

	static final void method1935(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.aByte3537;
	}
}
