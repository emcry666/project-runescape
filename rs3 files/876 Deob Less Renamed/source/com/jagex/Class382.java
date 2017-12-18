/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class382 implements Interface49 {
	public static final int anInt3953 = 2;
	public static final int anInt3954 = 1;
	public int anInt3955;
	public Class380 aClass380_3956;
	public Class389 aClass389_3957;
	public int anInt3958;
	public int anInt3959;
	public int anInt3960;
	public static final int anInt3961 = 0;
	public int anInt3962;
	static int anInt3963;

	public static Class382 method6412(Class523_Sub34 class523_sub34) {
		Class380 class380 = (Class228.method4175(-1853704647)[class523_sub34.readUnsignedByte(1701928766)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(726339330)]);
		int i = class523_sub34.readShort(-209415335);
		int i_0_ = class523_sub34.readShort(1224583881);
		int i_1_ = class523_sub34.readBigSmart((byte) -29);
		int i_2_ = class523_sub34.readUnsignedInt((byte) -4);
		int i_3_ = class523_sub34.readUnsignedByte(2005965550);
		return new Class382(class380, class389, i, i_0_, i_1_, i_2_, i_3_);
	}

	public Class394 method353(int i) {
		return Class394.aClass394_4054;
	}

	public Class394 method351() {
		return Class394.aClass394_4054;
	}

	public Class394 method352() {
		return Class394.aClass394_4054;
	}

	public Class394 method354() {
		return Class394.aClass394_4054;
	}

	Class382(Class380 class380, Class389 class389, int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		aClass380_3956 = class380;
		aClass389_3957 = class389;
		anInt3958 = 1055993451 * i;
		anInt3959 = 231113185 * i_4_;
		anInt3962 = 1077580653 * i_5_;
		anInt3955 = i_6_ * 16070483;
		anInt3960 = -2081707377 * i_7_;
	}

	static final void method6413(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_8_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_9_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_8_ > i_9_ ? i_8_ : i_9_;
	}

	static final void method6414(Class669 class669, int i) {
		Class533 class533 = class669.aClass647_Sub1_Sub3_Sub1_8552.method18353((byte) 65);
		if (null == class533)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class533.method8789(-1369391278);
	}

	static final void method6415(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_10_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_11_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		Class642.method10534(i_10_, i_11_ >> 14 & 0x3fff, i_11_ & 0x3fff, true, 1875868957);
	}
}
