/* Class523_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.BitSet;

public class Class523_Sub19 extends Class523 {
	long aLong10483;
	public String aString10484;
	public Class338[] aClass338Array10485;
	public int anInt10486;
	int[] anIntArray10487;
	public byte aByte10488;
	boolean aBool10489 = true;
	public byte aByte10490;
	boolean aBool10491;
	static int anInt10492;

	void method16043(int i, int i_0_) {
		anInt10486 -= -1416651461;
		if (anInt10486 * 1969304563 == 0)
			aClass338Array10485 = null;
		else
			System.arraycopy(aClass338Array10485, 1 + i, aClass338Array10485, i, anInt10486 * 1969304563 - i);
		anIntArray10487 = null;
	}

	void method16044(Class338 class338) {
		if (aClass338Array10485 == null || anInt10486 * 1969304563 >= aClass338Array10485.length)
			method16057(5 + 1969304563 * anInt10486, 1810443326);
		aClass338Array10485[(anInt10486 += -1416651461) * 1969304563 - 1] = class338;
		anIntArray10487 = null;
	}

	public int[] method16045(int i) {
		if (anIntArray10487 == null) {
			String[] strings = new String[anInt10486 * 1969304563];
			anIntArray10487 = new int[anInt10486 * 1969304563];
			for (int i_1_ = 0; i_1_ < anInt10486 * 1969304563; i_1_++) {
				strings[i_1_] = aClass338Array10485[i_1_].aString3573;
				anIntArray10487[i_1_] = i_1_;
			}
			Class417.method6658(strings, anIntArray10487, -2118996344);
		}
		return anIntArray10487;
	}

	void method16046(Class338 class338, byte i) {
		if (aClass338Array10485 == null || anInt10486 * 1969304563 >= aClass338Array10485.length)
			method16057(5 + 1969304563 * anInt10486, 2002796006);
		aClass338Array10485[(anInt10486 += -1416651461) * 1969304563 - 1] = class338;
		anIntArray10487 = null;
	}

	void method16047(Class338 class338) {
		if (aClass338Array10485 == null || anInt10486 * 1969304563 >= aClass338Array10485.length)
			method16057(5 + 1969304563 * anInt10486, 799200982);
		aClass338Array10485[(anInt10486 += -1416651461) * 1969304563 - 1] = class338;
		anIntArray10487 = null;
	}

	void method16048(int i) {
		if (aClass338Array10485 != null)
			System.arraycopy(aClass338Array10485, 0, aClass338Array10485 = new Class338[i], 0, anInt10486 * 1969304563);
		else
			aClass338Array10485 = new Class338[i];
	}

	void method16049(RSBuffer class523_sub34, byte i) {
		int i_2_ = class523_sub34.readUnsignedByte(380534546);
		if (0 != (i_2_ & 0x1))
			aBool10491 = true;
		if ((i_2_ & 0x2) != 0)
			aBool10489 = true;
		int i_3_ = 2;
		if ((i_2_ & 0x4) != 0)
			i_3_ = class523_sub34.readUnsignedByte(-755254441);
		aLong7065 = class523_sub34.readLong((byte) -72) * 2947252533757437993L;
		aLong10483 = class523_sub34.readLong((byte) -53) * 542502792796425317L;
		aString10484 = class523_sub34.readString(-285337629);
		class523_sub34.readUnsignedByte(1377474136);
		aByte10488 = class523_sub34.readByte((short) -30011);
		aByte10490 = class523_sub34.readByte((short) -18765);
		anInt10486 = class523_sub34.readUnsignedShort(-1734781906) * -1416651461;
		if (anInt10486 * 1969304563 > 0) {
			aClass338Array10485 = new Class338[anInt10486 * 1969304563];
			for (int i_4_ = 0; i_4_ < 1969304563 * anInt10486; i_4_++) {
				Class338 class338 = new Class338();
				if (aBool10491)
					class523_sub34.readLong((byte) -111);
				if (aBool10489)
					class338.aString3573 = class523_sub34.readString(-917594198);
				class338.aByte3571 = class523_sub34.readByte((short) -29978);
				class338.anInt3572 = class523_sub34.readUnsignedShort(-1098992165) * -1061785907;
				if (i_3_ >= 3)
					class523_sub34.readUnsignedByte(-1962696618);
				aClass338Array10485[i_4_] = class338;
			}
		}
	}

	static {
		new BitSet(65536);
	}

	public Class523_Sub19(RSBuffer class523_sub34) {
		anInt10486 = 0;
		aString10484 = null;
		method16049(class523_sub34, (byte) 23);
	}

	void method16050(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedByte(1176976173);
		if (0 != (i & 0x1))
			aBool10491 = true;
		if ((i & 0x2) != 0)
			aBool10489 = true;
		int i_5_ = 2;
		if ((i & 0x4) != 0)
			i_5_ = class523_sub34.readUnsignedByte(950601376);
		aLong7065 = class523_sub34.readLong((byte) -47) * 2947252533757437993L;
		aLong10483 = class523_sub34.readLong((byte) -81) * 542502792796425317L;
		aString10484 = class523_sub34.readString(-1326289645);
		class523_sub34.readUnsignedByte(1948896196);
		aByte10488 = class523_sub34.readByte((short) -26133);
		aByte10490 = class523_sub34.readByte((short) -306);
		anInt10486 = class523_sub34.readUnsignedShort(-961012234) * -1416651461;
		if (anInt10486 * 1969304563 > 0) {
			aClass338Array10485 = new Class338[anInt10486 * 1969304563];
			for (int i_6_ = 0; i_6_ < 1969304563 * anInt10486; i_6_++) {
				Class338 class338 = new Class338();
				if (aBool10491)
					class523_sub34.readLong((byte) -65);
				if (aBool10489)
					class338.aString3573 = class523_sub34.readString(37543596);
				class338.aByte3571 = class523_sub34.readByte((short) 372);
				class338.anInt3572 = class523_sub34.readUnsignedShort(-1167973563) * -1061785907;
				if (i_5_ >= 3)
					class523_sub34.readUnsignedByte(1501273293);
				aClass338Array10485[i_6_] = class338;
			}
		}
	}

	void method16051(Class338 class338) {
		if (aClass338Array10485 == null || anInt10486 * 1969304563 >= aClass338Array10485.length)
			method16057(5 + 1969304563 * anInt10486, 1599981876);
		aClass338Array10485[(anInt10486 += -1416651461) * 1969304563 - 1] = class338;
		anIntArray10487 = null;
	}

	public int method16052(String string, int i) {
		for (int i_7_ = 0; i_7_ < anInt10486 * 1969304563; i_7_++) {
			if (aClass338Array10485[i_7_].aString3573.equalsIgnoreCase(string))
				return i_7_;
		}
		return -1;
	}

	void method16053(int i) {
		anInt10486 -= -1416651461;
		if (anInt10486 * 1969304563 == 0)
			aClass338Array10485 = null;
		else
			System.arraycopy(aClass338Array10485, 1 + i, aClass338Array10485, i, anInt10486 * 1969304563 - i);
		anIntArray10487 = null;
	}

	public int method16054(String string) {
		for (int i = 0; i < anInt10486 * 1969304563; i++) {
			if (aClass338Array10485[i].aString3573.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	public int method16055(String string) {
		for (int i = 0; i < anInt10486 * 1969304563; i++) {
			if (aClass338Array10485[i].aString3573.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	public int method16056(String string) {
		for (int i = 0; i < anInt10486 * 1969304563; i++) {
			if (aClass338Array10485[i].aString3573.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	void method16057(int i, int i_8_) {
		if (aClass338Array10485 != null)
			System.arraycopy(aClass338Array10485, 0, aClass338Array10485 = new Class338[i], 0, anInt10486 * 1969304563);
		else
			aClass338Array10485 = new Class338[i];
	}

	void method16058(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedByte(317764424);
		if (0 != (i & 0x1))
			aBool10491 = true;
		if ((i & 0x2) != 0)
			aBool10489 = true;
		int i_9_ = 2;
		if ((i & 0x4) != 0)
			i_9_ = class523_sub34.readUnsignedByte(-1273826323);
		aLong7065 = class523_sub34.readLong((byte) -54) * 2947252533757437993L;
		aLong10483 = class523_sub34.readLong((byte) -26) * 542502792796425317L;
		aString10484 = class523_sub34.readString(-1761030314);
		class523_sub34.readUnsignedByte(1866408999);
		aByte10488 = class523_sub34.readByte((short) -27840);
		aByte10490 = class523_sub34.readByte((short) -18736);
		anInt10486 = class523_sub34.readUnsignedShort(-1007962715) * -1416651461;
		if (anInt10486 * 1969304563 > 0) {
			aClass338Array10485 = new Class338[anInt10486 * 1969304563];
			for (int i_10_ = 0; i_10_ < 1969304563 * anInt10486; i_10_++) {
				Class338 class338 = new Class338();
				if (aBool10491)
					class523_sub34.readLong((byte) -73);
				if (aBool10489)
					class338.aString3573 = class523_sub34.readString(-2038075883);
				class338.aByte3571 = class523_sub34.readByte((short) -2156);
				class338.anInt3572 = class523_sub34.readUnsignedShort(-1209950925) * -1061785907;
				if (i_9_ >= 3)
					class523_sub34.readUnsignedByte(-569046431);
				aClass338Array10485[i_10_] = class338;
			}
		}
	}

	void method16059(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedByte(1944594274);
		if (0 != (i & 0x1))
			aBool10491 = true;
		if ((i & 0x2) != 0)
			aBool10489 = true;
		int i_11_ = 2;
		if ((i & 0x4) != 0)
			i_11_ = class523_sub34.readUnsignedByte(468235171);
		aLong7065 = class523_sub34.readLong((byte) -126) * 2947252533757437993L;
		aLong10483 = class523_sub34.readLong((byte) -18) * 542502792796425317L;
		aString10484 = class523_sub34.readString(601947793);
		class523_sub34.readUnsignedByte(-1878437659);
		aByte10488 = class523_sub34.readByte((short) -2046);
		aByte10490 = class523_sub34.readByte((short) -20312);
		anInt10486 = class523_sub34.readUnsignedShort(-1621661958) * -1416651461;
		if (anInt10486 * 1969304563 > 0) {
			aClass338Array10485 = new Class338[anInt10486 * 1969304563];
			for (int i_12_ = 0; i_12_ < 1969304563 * anInt10486; i_12_++) {
				Class338 class338 = new Class338();
				if (aBool10491)
					class523_sub34.readLong((byte) 0);
				if (aBool10489)
					class338.aString3573 = class523_sub34.readString(-1574186371);
				class338.aByte3571 = class523_sub34.readByte((short) -25438);
				class338.anInt3572 = class523_sub34.readUnsignedShort(-118356819) * -1061785907;
				if (i_11_ >= 3)
					class523_sub34.readUnsignedByte(-137056997);
				aClass338Array10485[i_12_] = class338;
			}
		}
	}

	static final String[] method16060(String[] strings, int i) {
		String[] strings_13_ = new String[5];
		for (int i_14_ = 0; i_14_ < 5; i_14_++) {
			strings_13_[i_14_] = new StringBuilder().append(i_14_).append(" ").toString();
			if (strings != null && strings[i_14_] != null)
				strings_13_[i_14_] = new StringBuilder().append(strings_13_[i_14_]).append(strings[i_14_]).toString();
		}
		return strings_13_;
	}

	public static String decodeHuffman(RSBuffer class523_sub34, int i) {
		return Class566.method9503(class523_sub34, 32767, -1952168317);
	}
}
