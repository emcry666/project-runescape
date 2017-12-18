/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class204 {
	int[] anIntArray2206;
	int[] anIntArray2207;
	int[] anIntArray2208;
	int[] anIntArray2209;
	int[] anIntArray2210;
	int[] anIntArray2211;
	int[] anIntArray2212;
	static int anInt2213;

	Class204(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedSmart(368514876);
		anIntArray2210 = new int[i];
		anIntArray2209 = new int[i];
		anIntArray2208 = new int[i];
		anIntArray2206 = new int[i];
		anIntArray2212 = new int[i];
		anIntArray2211 = new int[i];
		anIntArray2207 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			anIntArray2210[i_0_] = class523_sub34.readUnsignedShort(-485097650) - 5120;
			anIntArray2208[i_0_] = class523_sub34.readUnsignedShort(-1784218454) - 5120;
			anIntArray2209[i_0_] = class523_sub34.readShort(936601995);
			anIntArray2212[i_0_] = class523_sub34.readUnsignedShort(-1321933322) - 5120;
			anIntArray2207[i_0_] = class523_sub34.readUnsignedShort(-743989995) - 5120;
			anIntArray2211[i_0_] = class523_sub34.readShort(-409605462);
			anIntArray2206[i_0_] = class523_sub34.readShort(886301821);
		}
	}

	void method3706(int i, int i_1_) {
		int[][] is = new int[anIntArray2210.length << 1][4];
		for (int i_2_ = 0; i_2_ < anIntArray2210.length; i_2_++) {
			is[i_2_ * 2][0] = anIntArray2210[i_2_];
			is[i_2_ * 2][1] = anIntArray2209[i_2_];
			is[2 * i_2_][2] = anIntArray2208[i_2_];
			is[2 * i_2_][3] = anIntArray2206[i_2_];
			is[i_2_ * 2 + 1][0] = anIntArray2212[i_2_];
			is[i_2_ * 2 + 1][1] = anIntArray2211[i_2_];
			is[i_2_ * 2 + 1][2] = anIntArray2207[i_2_];
			is[2 * i_2_ + 1][3] = anIntArray2206[i_2_];
		}
		client.anIntArrayArrayArray11115[i] = is;
	}

	void method3707(int i) {
		int[][] is = new int[anIntArray2210.length << 1][4];
		for (int i_3_ = 0; i_3_ < anIntArray2210.length; i_3_++) {
			is[i_3_ * 2][0] = anIntArray2210[i_3_];
			is[i_3_ * 2][1] = anIntArray2209[i_3_];
			is[2 * i_3_][2] = anIntArray2208[i_3_];
			is[2 * i_3_][3] = anIntArray2206[i_3_];
			is[i_3_ * 2 + 1][0] = anIntArray2212[i_3_];
			is[i_3_ * 2 + 1][1] = anIntArray2211[i_3_];
			is[i_3_ * 2 + 1][2] = anIntArray2207[i_3_];
			is[2 * i_3_ + 1][3] = anIntArray2206[i_3_];
		}
		client.anIntArrayArrayArray11115[i] = is;
	}

	public static int method3708(int i, byte i_4_) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = ((Class523_Sub27_Sub15) Class271.aClass14_2876.getFromIndex((long) i));
		if (class523_sub27_sub15 == null)
			return -1;
		if (Class271.aClass697_2877.aClass523_Sub27_8763 == class523_sub27_sub15.aClass523_Sub27_10551)
			return -1;
		return (((Class523_Sub27_Sub15) class523_sub27_sub15.aClass523_Sub27_10551).anInt11762 * 1066462451);
	}

	public static void method3709(InterfaceComponentDefinitions[] class250s, int i) {
		for (int i_5_ = 0; i_5_ < class250s.length; i_5_++) {
			InterfaceComponentDefinitions class250 = class250s[i_5_];
			if (null != class250.anObjectArray2662) {
				Class523_Sub38 class523_sub38 = new Class523_Sub38();
				class523_sub38.aClass250_10678 = class250;
				class523_sub38.anObjectArray10687 = class250.anObjectArray2662;
				Class436.method6876(class523_sub38, 5000000, (short) -991);
			}
		}
	}

	static final void method3710(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class389.method6480(-1404771209);
	}

	static final void method3711(Class669 class669, int i) {
		Class254.method4550(1029316830);
	}

	static void method3712(RSStream class116, int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4227, class116.aClass11_1413, 1370050649);
		class116.method1974(class523_sub22, (byte) 83);
		client.aBool11302 = true;
	}

	public static boolean method3713(int i, byte i_6_) {
		for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(1882192742)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) -48))) {
			if (Class549.method9107((-2101009827 * class523_sub27_sub6.anInt11639), (byte) 1) && ((long) i == 7768112170675051057L * class523_sub27_sub6.aLong11632))
				return true;
		}
		return false;
	}
}
