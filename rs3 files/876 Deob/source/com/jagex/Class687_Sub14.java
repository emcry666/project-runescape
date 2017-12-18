/* Class687_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687_Sub14 extends Class687 {
	public static final int anInt10856 = 0;
	public static final int anInt10857 = 1;
	public static Class148 aClass148_10858;

	public Class687_Sub14(int i, Class523_Sub33 class523_sub33) {
		super(i, class523_sub33);
	}

	int method13900() {
		return 1;
	}

	public void method16861(int i) {
		if (0 != 1700599327 * anInt8673 && aClass523_Sub33_8670.aClass687_Sub40_10615.method17072(-2009579247) != 1)
			anInt8673 = 0;
		if (anInt8673 * 1700599327 != 0 && aClass523_Sub33_8670.aClass687_Sub11_10621.method16837(-148479141) == 2)
			anInt8673 = 0;
		if (1700599327 * anInt8673 < 0 || 1700599327 * anInt8673 > 1)
			anInt8673 = method13894(-1804032961) * 1826678239;
	}

	public int method16862() {
		return 1700599327 * anInt8673;
	}

	public boolean method16863(int i) {
		return true;
	}

	int method13894(int i) {
		return 1;
	}

	int method13897() {
		return 1;
	}

	public int method16864(short i) {
		return 1700599327 * anInt8673;
	}

	void method13896(int i) {
		anInt8673 = 1826678239 * i;
	}

	public int method13890(int i, int i_0_) {
		if (0 != i && aClass523_Sub33_8670.aClass687_Sub11_10621.method16837(-148479141) == 2)
			return 3;
		if (i == 0 || aClass523_Sub33_8670.aClass687_Sub40_10615.method17072(-1814580174) == 1)
			return 1;
		return 2;
	}

	void method13888(int i) {
		anInt8673 = 1826678239 * i;
	}

	void method13901(int i) {
		anInt8673 = 1826678239 * i;
	}

	void method13892(int i, int i_1_) {
		anInt8673 = 1826678239 * i;
	}

	public int method16865() {
		return 1700599327 * anInt8673;
	}

	int method13889() {
		return 1;
	}

	int method13899() {
		return 1;
	}

	public boolean method16866() {
		return true;
	}

	public int method13893(int i) {
		if (0 != i && aClass523_Sub33_8670.aClass687_Sub11_10621.method16837(-148479141) == 2)
			return 3;
		if (i == 0 || aClass523_Sub33_8670.aClass687_Sub40_10615.method17072(-1708327941) == 1)
			return 1;
		return 2;
	}

	public int method16867() {
		return 1700599327 * anInt8673;
	}

	public int method13895(int i) {
		if (0 != i && aClass523_Sub33_8670.aClass687_Sub11_10621.method16837(-148479141) == 2)
			return 3;
		if (i == 0 || aClass523_Sub33_8670.aClass687_Sub40_10615.method17072(-2072948060) == 1)
			return 1;
		return 2;
	}

	public Class687_Sub14(Class523_Sub33 class523_sub33) {
		super(class523_sub33);
	}

	public int method16868() {
		return 1700599327 * anInt8673;
	}

	static final void method16869(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = new StringBuilder().append(string).append(i_2_).toString();
	}

	static final void method16870(Class669 class669, byte i) {
		Class522_Sub1.method15784(443930366);
		Class36.aBool353 = false;
	}

	static final void decodeMasks(RSBitBuffer buffer, byte i) {
		for (int index = 0; index < Class108.anInt1323 * -1962023375; index++) {
			buffer.readUnsignedShort(-1435075399);
			int playerIndex = Class108.anIntArray1312[index];
			Player player = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[playerIndex];
			int mask = buffer.readUnsignedByte(-695879624);
			if ((mask & 0x80) != 0)
				mask += buffer.readUnsignedByte(1707916664) << 8;
			if ((mask & 0x800) != 0)
				mask += buffer.readUnsignedByte(2115406455) << 16;
			Class232.decodeMask(buffer, playerIndex, player, mask, (byte) 112);
		}
	}
}
