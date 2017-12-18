/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class116 {
	public Class11 aClass11_1413;
	Class708 aClass708_1414 = new Class708();
	public int anInt1415 = 0;
	int anInt1416;
	IncomingPacket aClass409_1417;
	int anInt1418;
	int anInt1419;
	Class11 aClass11_1420;
	int anInt1421;
	boolean aBool1422;
	int anInt1423;
	public int anInt1424;
	IncomingPacket currentPacket;
	IncomingPacket aClass409_1426;
	int anInt1427;
	Class557 aClass557_1428;
	Class523_Sub34 aClass523_Sub34_1429 = new Class523_Sub34(1700);
	IncomingPacket aClass409_1430;
	Class523_Sub34_Sub2 aClass523_Sub34_Sub2_1431 = new Class523_Sub34_Sub2(40000);
	public boolean aBool1432;
	Class49 aClass49_1433;

	public Class557 method1971() {
		return aClass557_1428;
	}

	void method1972(Class557 class557, String string) {
		aClass557_1428 = class557;
		aClass49_1433.method1262(string, (byte) 14);
	}

	public final void method1973(int i) throws IOException {
		if (aClass557_1428 != null && anInt1415 * -1660026723 > 0) {
			aClass523_Sub34_1429.anInt10661 = 0;
			for (;;) {
				Class523_Sub22 class523_sub22 = (Class523_Sub22) aClass708_1414.method14240(1498359142);
				if (class523_sub22 == null || (class523_sub22.anInt10522 * -1078557365 > (aClass523_Sub34_1429.aByteArray10658.length - 2349011 * aClass523_Sub34_1429.anInt10661)))
					break;
				aClass523_Sub34_1429.readBytes(class523_sub22.aClass523_Sub34_Sub2_10525.aByteArray10658, 0, -1078557365 * class523_sub22.anInt10522, (short) -31416);
				anInt1415 -= -1899743993 * class523_sub22.anInt10522;
				class523_sub22.method8661(607052656);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16408(-1760665422);
				class523_sub22.method16105(-6952234);
			}
			aClass557_1428.method9214(aClass523_Sub34_1429.aByteArray10658, 0, (2349011 * aClass523_Sub34_1429.anInt10661), (byte) 4);
			anInt1418 += aClass523_Sub34_1429.anInt10661 * -276541507;
			anInt1424 = 0;
		}
	}

	public final void method1974(Class523_Sub22 class523_sub22, byte i) {
		aClass708_1414.method14236(class523_sub22, -1784516168);
		class523_sub22.anInt10522 = class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 621005465;
		class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 = 0;
		anInt1415 += class523_sub22.anInt10522 * -1899743993;
	}

	final void method1975() {
		aClass708_1414.method14235((byte) -93);
		anInt1415 = 0;
	}

	void method1976(Class557 class557, String string, int i) {
		aClass557_1428 = class557;
		aClass49_1433.method1262(string, (byte) 2);
	}

	public final void method1977(Class523_Sub22 class523_sub22) {
		aClass708_1414.method14236(class523_sub22, 693143651);
		class523_sub22.anInt10522 = class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 621005465;
		class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 = 0;
		anInt1415 += class523_sub22.anInt10522 * -1899743993;
	}

	void method1978(byte i) {
		aClass557_1428 = null;
		aClass49_1433.method1262(null, (byte) -104);
	}

	public Class557 method1979(int i) {
		return aClass557_1428;
	}

	void method1980(short i) {
		if (aClass557_1428 != null) {
			aClass557_1428.method9203(1438564045);
			aClass557_1428 = null;
		}
		aClass49_1433.method1262(null, (byte) 23);
	}

	final void method1981() {
		aClass708_1414.method14235((byte) -68);
		anInt1415 = 0;
	}

	final void method1982() {
		aClass708_1414.method14235((byte) -25);
		anInt1415 = 0;
	}

	void method1983() {
		if (aClass557_1428 != null) {
			aClass557_1428.method9203(1327416859);
			aClass557_1428 = null;
		}
		aClass49_1433.method1262(null, (byte) -33);
	}

	public final void method1984() throws IOException {
		if (aClass557_1428 != null && anInt1415 * -1660026723 > 0) {
			aClass523_Sub34_1429.anInt10661 = 0;
			for (;;) {
				Class523_Sub22 class523_sub22 = (Class523_Sub22) aClass708_1414.method14240(814775114);
				if (class523_sub22 == null || (class523_sub22.anInt10522 * -1078557365 > (aClass523_Sub34_1429.aByteArray10658.length - 2349011 * aClass523_Sub34_1429.anInt10661)))
					break;
				aClass523_Sub34_1429.readBytes(class523_sub22.aClass523_Sub34_Sub2_10525.aByteArray10658, 0, -1078557365 * class523_sub22.anInt10522, (short) -18176);
				anInt1415 -= -1899743993 * class523_sub22.anInt10522;
				class523_sub22.method8661(607052656);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16408(-1255728657);
				class523_sub22.method16105(843411436);
			}
			aClass557_1428.method9214(aClass523_Sub34_1429.aByteArray10658, 0, (2349011 * aClass523_Sub34_1429.anInt10661), (byte) -6);
			anInt1418 += aClass523_Sub34_1429.anInt10661 * -276541507;
			anInt1424 = 0;
		}
	}

	void method1985() {
		aClass557_1428 = null;
		aClass49_1433.method1262(null, (byte) 21);
	}

	void method1986() {
		if (0 == client.anInt11011 % 50) {
			anInt1427 = 284501075 * anInt1418;
			anInt1418 = 0;
			anInt1416 = -2028162547 * anInt1419;
			anInt1419 = 0;
		}
	}

	void method1987() {
		if (0 == client.anInt11011 % 50) {
			anInt1427 = 284501075 * anInt1418;
			anInt1418 = 0;
			anInt1416 = -2028162547 * anInt1419;
			anInt1419 = 0;
		}
	}

	void method1988() {
		if (0 == client.anInt11011 % 50) {
			anInt1427 = 284501075 * anInt1418;
			anInt1418 = 0;
			anInt1416 = -2028162547 * anInt1419;
			anInt1419 = 0;
		}
	}

	void method1989() {
		if (aClass557_1428 != null) {
			aClass557_1428.method9203(1597438731);
			aClass557_1428 = null;
		}
		aClass49_1433.method1262(null, (byte) -115);
	}

	final void method1990() {
		aClass708_1414.method14235((byte) 76);
		anInt1415 = 0;
	}

	void method1991(int i) {
		if (0 == client.anInt11011 % 50) {
			anInt1427 = 284501075 * anInt1418;
			anInt1418 = 0;
			anInt1416 = -2028162547 * anInt1419;
			anInt1419 = 0;
		}
	}

	void method1992(Class557 class557, String string) {
		aClass557_1428 = class557;
		aClass49_1433.method1262(string, (byte) 11);
	}

	void method1993(Class557 class557, String string) {
		aClass557_1428 = class557;
		aClass49_1433.method1262(string, (byte) -99);
	}

	void method1994() {
		if (aClass557_1428 != null) {
			aClass557_1428.method9203(1250101569);
			aClass557_1428 = null;
		}
		aClass49_1433.method1262(null, (byte) -92);
	}

	void method1995() {
		if (aClass557_1428 != null) {
			aClass557_1428.method9203(1887153058);
			aClass557_1428 = null;
		}
		aClass49_1433.method1262(null, (byte) 18);
	}

	void method1996() {
		if (aClass557_1428 != null) {
			aClass557_1428.method9203(2103205110);
			aClass557_1428 = null;
		}
		aClass49_1433.method1262(null, (byte) -116);
	}

	void method1997() {
		aClass557_1428 = null;
		aClass49_1433.method1262(null, (byte) -82);
	}

	final void method1998(int i) {
		aClass708_1414.method14235((byte) 81);
		anInt1415 = 0;
	}

	Class116() {
		currentPacket = null;
		anInt1421 = 0;
		aBool1422 = true;
		anInt1423 = 0;
		anInt1424 = 0;
		aBool1432 = false;
		aClass49_1433 = new Class49();
		Thread thread = new Thread(aClass49_1433);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	public Class557 method1999() {
		return aClass557_1428;
	}

	public Class557 method2000() {
		return aClass557_1428;
	}

	public Class557 method2001() {
		return aClass557_1428;
	}

	public Class557 method2002() {
		return aClass557_1428;
	}

	static final void method2003(Class669 class669, int i) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183 != null)
			Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183.method10173(bool, -2075028786);
	}

	static final void method2004(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		boolean bool = (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1] == 1);
		if (null != Class534_Sub1.aClass14_10774) {
			Class523 class523 = Class534_Sub1.aClass14_10774.method741((long) i_0_);
			if (null != class523 && !bool)
				class523.method8661(607052656);
			else if (class523 == null && bool) {
				class523 = new Class523();
				Class534_Sub1.aClass14_10774.method738(class523, (long) i_0_);
			}
		}
	}

	static int method2005(int i) {
		return (Class271.anInt2875 += 1300344851) * -706897381 - 1;
	}

	public static byte[] method2006(Class523_Sub34 class523_sub34, int i, int i_1_) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class523_sub34.aByteArray10658);
		bytearrayinputstream.skip((long) (class523_sub34.anInt10661 * 2349011));
		return Class483.method7924(bytearrayinputstream, i, -830324465);
	}

	static final void method2007(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class642.method10534(i_2_, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, false, 1952570258);
	}
}
