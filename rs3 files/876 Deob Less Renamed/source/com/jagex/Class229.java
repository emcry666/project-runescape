/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class229 {
	long aLong2350;
	static final int anInt2351 = 1;
	static final int anInt2352 = 2;
	Class635[] aClass635Array2353;
	Class4 aClass4_2354;
	boolean aBool2355;
	String aString2356;
	int anInt2357;
	boolean aBool2358;
	int anInt2359;
	Class251 aClass251_2360;
	int anInt2361;
	Class4 aClass4_2362;
	public static Class472 aClass472_2363;

	public Class251 method4176() {
		return aClass251_2360;
	}

	public String method4177(int i) {
		return aString2356;
	}

	void method4178(int i, byte i_0_) {
		anInt2359 = i * -1203038567;
	}

	void method4179(boolean bool) {
		aBool2358 = bool;
	}

	public int method4180(int i) {
		return -395264747 * anInt2357;
	}

	void method4181(int i, byte i_1_) {
		anInt2357 = i * 1141353021;
	}

	public boolean method4182(short i) {
		return aBool2358;
	}

	void method4183(boolean bool, byte i) {
		aBool2358 = bool;
	}

	void method4184(boolean bool) {
		aBool2358 = bool;
	}

	void method4185(Class251 class251, int i) {
		aClass251_2360 = class251;
	}

	public int method4186(int i) {
		return anInt2361 * 423658763;
	}

	void method4187(int i, int i_2_) {
		anInt2361 = i * -1585701213;
	}

	void method4188(boolean bool) {
		aBool2358 = bool;
	}

	public boolean method4189(byte i) {
		return aBool2355;
	}

	public Class635 method4190(int i, byte i_3_) {
		return aClass635Array2353[i];
	}

	void method4191(Class229 class229_4_, int i) {
		for (int i_5_ = 0; i_5_ < aClass635Array2353.length; i_5_++) {
			aClass635Array2353[i_5_].method10421(class229_4_.aClass635Array2353[i_5_].method10410((byte) 2), (byte) 97);
			aClass635Array2353[i_5_].method10420(aClass635Array2353[i_5_].method10424(-2092042138), -852814735);
		}
		aClass4_2354.method20(-1626830115);
		Iterator iterator = class229_4_.aClass4_2354.iterator();
		while (iterator.hasNext()) {
			Class426 class426 = (Class426) iterator.next();
			aClass4_2354.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1716375172);
		}
		aBool2355 = class229_4_.aBool2355;
	}

	public String method4192() {
		return aString2356;
	}

	public Class4 method4193(int i) {
		return aClass4_2362;
	}

	void method4194(Class251 class251) {
		aClass251_2360 = class251;
	}

	void method4195(int i) {
		anInt2359 = i * -1203038567;
	}

	public int method4196() {
		return -395264747 * anInt2357;
	}

	void method4197(boolean bool) {
		aBool2358 = bool;
	}

	public int method4198(int i) {
		return anInt2359 * -758325847;
	}

	void method4199(int i) {
		anInt2357 = i * 1141353021;
	}

	Class229(Class523_Sub34 class523_sub34, boolean bool, boolean bool_6_, Interface27 interface27) {
		if (bool)
			aLong2350 = (class523_sub34.readLong((byte) -120) * -3676416375373160143L);
		else
			aLong2350 = 3676416375373160143L;
		if (bool_6_)
			aString2356 = class523_sub34.method16363((byte) -12);
		int i = class523_sub34.readUnsignedByte(1505519353);
		aBool2355 = (i & 0x1) != 0;
		aBool2358 = (i & 0x2) != 0;
		aClass635Array2353 = new Class635[interface27.method152(-1417577233).method9865(-304037582)];
		int i_7_ = class523_sub34.readUnsignedByte(-572373731);
		if (i_7_ > aClass635Array2353.length)
			throw new IllegalStateException("");
		for (int i_8_ = 0; i_8_ < aClass635Array2353.length; i_8_++) {
			Class635 class635 = (aClass635Array2353[i_8_] = new Class635(interface27.method152(-1417577233).method9866(i_8_, -1878647836), true));
			if (i_8_ < i_7_)
				class635.method10421(class523_sub34.readUnsignedInt((byte) -121), (byte) 78);
			else
				class635.method10421(0, (byte) -21);
			class635.method10420(class635.method10424(-1631202428), -1715846076);
		}
		int i_9_ = class523_sub34.readUnsignedShort(-1531249549);
		aClass4_2354 = new Class4(interface27.method154((byte) 110));
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			Class426 class426 = interface27.method154((byte) 53).refreshNIS(class523_sub34, -1355990957);
			aClass4_2354.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1837572952);
		}
		anInt2357 = class523_sub34.readUnsignedShort(-1882743663) * 1141353021;
		if (anInt2357 * -395264747 == 65535)
			anInt2357 = -1141353021;
		anInt2359 = class523_sub34.readUnsignedByte(1405755557) * -1203038567;
		aClass251_2360 = ((Class251) Class334.method5910(Class251.method4523((byte) 95), class523_sub34.readUnsignedByte(-1109885243), -979019870));
		anInt2361 = class523_sub34.readUnsignedByte(-2129730744) * -1585701213;
	}

	void method4200(boolean bool) {
		aBool2358 = bool;
	}

	public void method4201(Interface27 interface27) {
		if (aClass4_2362 == null)
			aClass4_2362 = new Class4(interface27.method154((byte) 89));
		else
			aClass4_2362.method20(-1098389590);
	}

	void method4202(boolean bool) {
		aBool2358 = bool;
	}

	public void method4203(Interface27 interface27) {
		if (aClass4_2362 == null)
			aClass4_2362 = new Class4(interface27.method154((byte) 71));
		else
			aClass4_2362.method20(-81160630);
	}

	void method4204(Class251 class251) {
		aClass251_2360 = class251;
	}

	public Class251 method4205() {
		return aClass251_2360;
	}

	public Class251 method4206() {
		return aClass251_2360;
	}

	public void method4207(Interface27 interface27, int i) {
		if (aClass4_2362 == null)
			aClass4_2362 = new Class4(interface27.method154((byte) 75));
		else
			aClass4_2362.method20(-1939885709);
	}

	public Class251 method4208() {
		return aClass251_2360;
	}

	void method4209(Class251 class251) {
		aClass251_2360 = class251;
	}

	void method4210(Class229 class229_11_) {
		for (int i = 0; i < aClass635Array2353.length; i++) {
			aClass635Array2353[i].method10421(class229_11_.aClass635Array2353[i].method10410((byte) 2), (byte) 63);
			aClass635Array2353[i].method10420(aClass635Array2353[i].method10424(-1661892485), -1876915154);
		}
		aClass4_2354.method20(1403334557);
		Iterator iterator = class229_11_.aClass4_2354.iterator();
		while (iterator.hasNext()) {
			Class426 class426 = (Class426) iterator.next();
			aClass4_2354.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1858375550);
		}
		aBool2355 = class229_11_.aBool2355;
	}

	void method4211(Class251 class251) {
		aClass251_2360 = class251;
	}

	public int method4212() {
		return -395264747 * anInt2357;
	}

	public int method4213() {
		return anInt2361 * 423658763;
	}

	void method4214(int i) {
		anInt2361 = i * -1585701213;
	}

	long method4215() {
		return -2686674369795745839L * aLong2350;
	}

	long method4216() {
		return -2686674369795745839L * aLong2350;
	}

	public boolean method4217() {
		return aBool2355;
	}

	public boolean method4218() {
		return aBool2355;
	}

	public boolean method4219() {
		return aBool2355;
	}

	public boolean method4220() {
		return aBool2355;
	}

	long method4221(int i) {
		return -2686674369795745839L * aLong2350;
	}

	public void method4222(Interface27 interface27) {
		if (aClass4_2362 == null)
			aClass4_2362 = new Class4(interface27.method154((byte) 56));
		else
			aClass4_2362.method20(-109308053);
	}

	public void method4223(Interface27 interface27) {
		if (aClass4_2362 == null)
			aClass4_2362 = new Class4(interface27.method154((byte) 48));
		else
			aClass4_2362.method20(-104651857);
	}

	void method4224(Class229 class229_12_) {
		for (int i = 0; i < aClass635Array2353.length; i++) {
			aClass635Array2353[i].method10421(class229_12_.aClass635Array2353[i].method10410((byte) 2), (byte) 103);
			aClass635Array2353[i].method10420(aClass635Array2353[i].method10424(-1745954302), -599305894);
		}
		aClass4_2354.method20(1998747946);
		Iterator iterator = class229_12_.aClass4_2354.iterator();
		while (iterator.hasNext()) {
			Class426 class426 = (Class426) iterator.next();
			aClass4_2354.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1600977309);
		}
		aBool2355 = class229_12_.aBool2355;
	}

	public Class251 method4225(int i) {
		return aClass251_2360;
	}

	void method4226(int i) {
		anInt2357 = i * 1141353021;
	}

	public Class4 method4227() {
		return aClass4_2362;
	}

	public static Class395 method4228(Class523_Sub34 class523_sub34, int i) {
		int i_13_ = class523_sub34.readUnsignedInt((byte) -77);
		return new Class395(i_13_);
	}
}
