/* Class687_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687_Sub11 extends Class687 {
	static final int anInt10850 = 0;
	static final int anInt10851 = 2;

	public int method13895(int i) {
		if (2 == i)
			return 2;
		return 1;
	}

	public Class687_Sub11(Class523_Sub33 class523_sub33) {
		super(class523_sub33);
	}

	public void method16834(int i) {
		if (anInt8673 * 1700599327 < 0 || anInt8673 * 1700599327 > 2)
			anInt8673 = method13894(-161846392) * 1826678239;
	}

	int method13894(int i) {
		return 0;
	}

	public boolean method16835(int i) {
		return true;
	}

	public int method13893(int i) {
		if (2 == i)
			return 2;
		return 1;
	}

	void method13901(int i) {
		anInt8673 = i * 1826678239;
	}

	int method13899() {
		return 0;
	}

	public int method13890(int i, int i_0_) {
		if (2 == i)
			return 2;
		return 1;
	}

	public int method16836() {
		return 1700599327 * anInt8673;
	}

	void method13888(int i) {
		anInt8673 = i * 1826678239;
	}

	public int method16837(int i) {
		return 1700599327 * anInt8673;
	}

	void method13896(int i) {
		anInt8673 = i * 1826678239;
	}

	int method13897() {
		return 0;
	}

	int method13889() {
		return 0;
	}

	public Class687_Sub11(int i, Class523_Sub33 class523_sub33) {
		super(i, class523_sub33);
	}

	int method13900() {
		return 0;
	}

	public void method16838() {
		if (anInt8673 * 1700599327 < 0 || anInt8673 * 1700599327 > 2)
			anInt8673 = method13894(-600285169) * 1826678239;
	}

	public boolean method16839() {
		return true;
	}

	public int method16840() {
		return 1700599327 * anInt8673;
	}

	void method13892(int i, int i_1_) {
		anInt8673 = i * 1826678239;
	}

	static void method16841(InterfaceComponentDefinitions class250, Class145 class145, int i, int i_2_, int i_3_, int i_4_, int i_5_, String string, Class164 class164, Class10 class10, int i_6_, int i_7_) {
		int i_8_;
		if (2 == Class562.anInt7564 * 2097396553)
			i_8_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-675028366) * 2607.5945876176133) + client.anInt11094 * 724985463 & 0x3fff);
		else if (6 == Class562.anInt7564 * 2097396553)
			i_8_ = (int) client.aFloat11129 & 0x3fff;
		else
			i_8_ = ((int) client.aFloat11129 + 724985463 * client.anInt11094 & 0x3fff);
		int i_9_ = (Math.max(365308179 * class250.anInt2581 / 2, -1759297857 * class250.anInt2543 / 2) + 10);
		int i_10_ = i_4_ * i_4_ + i_3_ * i_3_;
		if (i_10_ <= i_9_ * i_9_) {
			int i_11_ = Class433.anIntArray4880[i_8_];
			int i_12_ = Class433.anIntArray4881[i_8_];
			if (6 != 2097396553 * Class562.anInt7564) {
				i_11_ = i_11_ * 256 / (256 + -1193506389 * client.anInt11068);
				i_12_ = i_12_ * 256 / (256 + -1193506389 * client.anInt11068);
			}
			int i_13_ = i_4_ * i_11_ + i_3_ * i_12_ >> 14;
			int i_14_ = i_12_ * i_4_ - i_11_ * i_3_ >> 14;
			int i_15_ = class10.method602(string, 100, null, 1912021372);
			int i_16_ = class10.method605(string, 100, 0, null, 319825328);
			i_13_ -= i_15_ / 2;
			if (i_13_ >= -(class250.anInt2581 * 365308179) && i_13_ <= class250.anInt2581 * 365308179 && i_14_ >= -(-1759297857 * class250.anInt2543) && i_14_ <= -1759297857 * class250.anInt2543)
				class164.method2628(string, class250.anInt2581 * 365308179 / 2 + (i_13_ + i), (i_2_ + -1759297857 * class250.anInt2543 / 2 - i_14_ - i_5_ - i_16_), i_15_, 50, i_6_, 0, 1, 0, 0, null, null, class145, i, i_2_, -17448556);
		}
	}
}
