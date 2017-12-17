/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class314 implements Interface75 {
	static Class314 aClass314_3396;
	static Class314 aClass314_3397;
	static Class314 aClass314_3398;
	static Class314 aClass314_3399;
	static Class314 aClass314_3400;
	static Class314 aClass314_3401;
	static Class314 aClass314_3402;
	static Class314 aClass314_3403;
	static Class314 aClass314_3404;
	static Class314 aClass314_3405;
	static Class314 aClass314_3406;
	static Class314 aClass314_3407;
	static Class314 aClass314_3408 = new Class314(11, 1);
	static Class314 aClass314_3409;
	static Class314 aClass314_3410;
	int id;
	int anInt3412;

	public int method101() {
		return anInt3412 * 1193419547;
	}

	public int method82() {
		return anInt3412 * 1193419547;
	}

	static {
		aClass314_3399 = new Class314(8, 2);
		aClass314_3400 = new Class314(0, 3);
		aClass314_3406 = new Class314(13, 4);
		aClass314_3396 = new Class314(9, 5);
		aClass314_3401 = new Class314(3, 6);
		aClass314_3402 = new Class314(2, 7);
		aClass314_3403 = new Class314(4, 8);
		aClass314_3404 = new Class314(10, 9);
		aClass314_3405 = new Class314(6, 10);
		aClass314_3410 = new Class314(1, 11);
		aClass314_3407 = new Class314(12, 12);
		aClass314_3397 = new Class314(7, 13);
		aClass314_3409 = new Class314(14, 14);
		aClass314_3398 = new Class314(5, 15);
	}

	public int method6() {
		return anInt3412 * 1193419547;
	}

	Class314(int i, int i_0_) {
		id = 1686912759 * i;
		anInt3412 = i_0_ * 1593278227;
	}

	static Class314[] method5658() {
		return (new Class314[] { aClass314_3400, aClass314_3397, aClass314_3404, aClass314_3396, aClass314_3403, aClass314_3401, aClass314_3408, aClass314_3402, aClass314_3398, aClass314_3407, aClass314_3399, aClass314_3409, aClass314_3405, aClass314_3406, aClass314_3410 });
	}

	static Class314[] method5659() {
		return (new Class314[] { aClass314_3400, aClass314_3397, aClass314_3404, aClass314_3396, aClass314_3403, aClass314_3401, aClass314_3408, aClass314_3402, aClass314_3398, aClass314_3407, aClass314_3399, aClass314_3409, aClass314_3405, aClass314_3406, aClass314_3410 });
	}

	static final void method5660(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4238, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_1_, (byte) -105);
		client.aClass116_11058.method1974(class523_sub22, (byte) 88);
	}

	static final void method5661(Class669 class669, byte i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_3_ = Class449.aClass523_Sub33_4946.aClass687_Sub22_10637.method16930(1961567818);
		if (i_3_ != i_2_) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub22_10637), i_2_, -205585801);
			Class211.method3824(1734890090);
			client.aBool11012 = false;
		}
	}

	static final void method5662(Class669 class669, int i) {
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 99) != Class294.aClass294_3166)
			throw new RuntimeException();
		((Class688_Sub3) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 64)).method17100((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), -788434092);
	}

	static final void method5663(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (client.aClass220_11301.method4107(i_4_, -1185590355).anInt2325 * 704063689);
	}
}
