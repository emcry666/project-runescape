/* Class523_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub15 extends Class523 {
	public static final int anInt10455 = 2;
	public static final int anInt10456 = 3;
	public static final int anInt10457 = 5;
	int anInt10458;
	public static final int anInt10459 = 1;
	static final int anInt10460 = 6;
	public static final int anInt10461 = 7;
	public static final int anInt10462 = 8;
	public static final int anInt10463 = 9;
	public static final int anInt10464 = 10;
	boolean[] aBoolArray10465;
	int anInt10466;
	int[] anIntArray10467;
	int[][] anIntArrayArray10468;
	public static final int anInt10469 = 0;
	int[] anIntArray10470;
	static InterfaceComponentDefinitions[] aClass250Array10471;

	Class523_Sub15(int i, byte[] is) {
		anInt10458 = -1980139205 * i;
		RSBuffer class523_sub34 = new RSBuffer(is);
		anInt10466 = class523_sub34.readUnsignedShort(-977959105) * 1849095009;
		anIntArray10467 = new int[anInt10466 * -687411039];
		anIntArrayArray10468 = new int[anInt10466 * -687411039][];
		aBoolArray10465 = new boolean[anInt10466 * -687411039];
		anIntArray10470 = new int[-687411039 * anInt10466];
		for (int i_0_ = 0; i_0_ < anInt10466 * -687411039; i_0_++) {
			anIntArray10467[i_0_] = class523_sub34.readUnsignedByte(606057845);
			if (anIntArray10467[i_0_] == 6)
				anIntArray10467[i_0_] = 2;
		}
		for (int i_1_ = 0; i_1_ < anInt10466 * -687411039; i_1_++)
			aBoolArray10465[i_1_] = class523_sub34.readUnsignedByte(208474) == 1;
		for (int i_2_ = 0; i_2_ < anInt10466 * -687411039; i_2_++)
			anIntArray10470[i_2_] = class523_sub34.readUnsignedShort(-64637709);
		for (int i_3_ = 0; i_3_ < anInt10466 * -687411039; i_3_++)
			anIntArrayArray10468[i_3_] = new int[class523_sub34.readUnsignedSmart(368514876)];
		for (int i_4_ = 0; i_4_ < -687411039 * anInt10466; i_4_++) {
			for (int i_5_ = 0; i_5_ < anIntArrayArray10468[i_4_].length; i_5_++)
				anIntArrayArray10468[i_4_][i_5_] = class523_sub34.readUnsignedSmart(368514876);
		}
	}
}
