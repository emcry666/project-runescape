/* Class687_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687_Sub28 extends Class687 {
	static final int anInt10890 = 1;
	static final int anInt10891 = 0;

	int method13893(int i) {
		return 3;
	}

	public Class687_Sub28(int i, Class523_Sub33 class523_sub33) {
		super(i, class523_sub33);
	}

	public void method16964(int i) {
		if (1700599327 * anInt8673 < 0 || anInt8673 * 1700599327 > 1)
			anInt8673 = method13894(7914505) * 1826678239;
	}

	int method13894(int i) {
		return 1;
	}

	public int method16965(int i) {
		return 1700599327 * anInt8673;
	}

	void method13892(int i, int i_0_) {
		anInt8673 = 1826678239 * i;
	}

	public void method16966() {
		if (1700599327 * anInt8673 < 0 || anInt8673 * 1700599327 > 1)
			anInt8673 = method13894(657937918) * 1826678239;
	}

	void method13888(int i) {
		anInt8673 = 1826678239 * i;
	}

	int method13895(int i) {
		return 3;
	}

	int method13899() {
		return 1;
	}

	void method13901(int i) {
		anInt8673 = 1826678239 * i;
	}

	void method13896(int i) {
		anInt8673 = 1826678239 * i;
	}

	int method13897() {
		return 1;
	}

	int method13889() {
		return 1;
	}

	public void method16967() {
		if (1700599327 * anInt8673 < 0 || anInt8673 * 1700599327 > 1)
			anInt8673 = method13894(-988472014) * 1826678239;
	}

	int method13900() {
		return 1;
	}

	int method13890(int i, int i_1_) {
		return 3;
	}

	public Class687_Sub28(Class523_Sub33 class523_sub33) {
		super(class523_sub33);
	}

	public static Interface71 method16968(Class472 class472, int i, Interface69 interface69, boolean bool, Class209 class209, int i_2_) {
		if (null != Class655.aClass375_8420) {
			if (bool)
				return new Class598(class472, i, Class655.aClass375_8420, interface69);
			return new Class605(class472, i, Class655.aClass375_8420, interface69, class209);
		}
		return null;
	}

	static void method16969(Class572 class572, int i, int i_3_, Class669 class669, int i_4_) {
		Class523_Sub27_Sub19 class523_sub27_sub19 = Class606.method9967(class572, i, i_3_, 262840701);
		if (null == class523_sub27_sub19)
			Class264.method4747(-1226670303);
		else {
			class669.anIntArray8581 = new int[625565027 * class523_sub27_sub19.anInt11849];
			class669.anObjectArray8565 = new Object[571919215 * class523_sub27_sub19.anInt11848];
			if (class523_sub27_sub19.aClass572_11850 == Class572.aClass572_7666 || (Class572.aClass572_7677 == class523_sub27_sub19.aClass572_11850) || (class523_sub27_sub19.aClass572_11850 == Class572.aClass572_7669)) {
				class669.anIntArray8581[0] = i;
				class669.anIntArray8581[1] = Class642.aClass561_8334.method9426((byte) -15);
				class669.anIntArray8581[2] = Class642.aClass561_8334.method9432(-1578576216);
			} else if ((Class572.aClass572_7683 == class523_sub27_sub19.aClass572_11850) || (Class572.aClass572_7676 == class523_sub27_sub19.aClass572_11850) || (class523_sub27_sub19.aClass572_11850 == Class572.aClass572_7663) || (Class572.aClass572_7664 == class523_sub27_sub19.aClass572_11850) || (class523_sub27_sub19.aClass572_11850 == Class572.aClass572_7665))
				class669.anIntArray8581[0] = i;
			else if (class523_sub27_sub19.aClass572_11850 == Class572.aClass572_7678)
				class669.anIntArray8581[0] = -1976369605 * class669.anInt8576;
			Class576.method9645(class523_sub27_sub19, 500000, class669, (byte) 13);
		}
	}
}
