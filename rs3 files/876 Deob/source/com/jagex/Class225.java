/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class225 implements Interface28 {
	int anInt2341;
	boolean aBool2342;
	Class224 this$0;

	public void method162(Class218 class218) {
		class218.method3977(-692069855 * anInt2341, aBool2342, 1338445369);
		class218.method3967(anInt2341 * -692069855, (byte) 2).method4221(934113824);
	}

	public void method163(Class218 class218, int i) {
		class218.method3977(-692069855 * anInt2341, aBool2342, 77685976);
		class218.method3967(anInt2341 * -692069855, (byte) 2).method4221(-1804990677);
	}

	Class225(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		anInt2341 = class523_sub34.readUnsignedShort(-613205208) * 1295133153;
		aBool2342 = class523_sub34.readUnsignedByte(475108217) == 1;
	}

	public void method161(Class218 class218) {
		class218.method3977(-692069855 * anInt2341, aBool2342, -8872198);
		class218.method3967(anInt2341 * -692069855, (byte) 2).method4221(-1534072619);
	}

	public void method164(Class218 class218) {
		class218.method3977(-692069855 * anInt2341, aBool2342, -959808546);
		class218.method3967(anInt2341 * -692069855, (byte) 2).method4221(-1718332497);
	}

	public void method165(Class218 class218) {
		class218.method3977(-692069855 * anInt2341, aBool2342, -1464597453);
		class218.method3967(anInt2341 * -692069855, (byte) 2).method4221(-577325030);
	}

	static void method4154(byte[] is, int i) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-1909955647);
			if (i_0_ == 0)
				break;
			if (i_0_ == 1) {
				int i_1_ = class523_sub34.readUnsignedShort(-131140489);
				Class254.aClass217_2743.method3937(i_1_, -1579849748);
			}
		}
	}

	static final void method4155(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class645.aClass24_8347.method839(i_2_, (byte) 68).method18250((short) -9580);
	}

	static final void method4156(Class669 class669, int i) {
		if (class669.anInt8563 * -2124697313 != 0) {
			Class642 class642 = (class669.aClass642Array8564[(class669.anInt8563 -= -912618785) * -2124697313]);
			class669.aClass523_Sub27_Sub19_8580 = class642.aClass523_Sub27_Sub19_8332;
			class669.aClass514Array8553 = class669.aClass523_Sub27_Sub19_8580.aClass514Array11846;
			class669.anIntArray8577 = class669.aClass523_Sub27_Sub19_8580.anIntArray11847;
			class669.anInt8579 = class642.anInt8330 * -848165885;
			class669.anIntArray8581 = class642.anIntArray8329;
			class669.anObjectArray8565 = class642.anObjectArray8331;
			class669.aLongArray8554 = class642.aLongArray8333;
		}
	}

	public static void method4157(InterfaceComponentDefinitions class250, int i, int i_3_, byte i_4_) {
		if (null != class250) {
			if (class250.anObjectArray2646 != null) {
				Class523_Sub38 class523_sub38 = new Class523_Sub38();
				class523_sub38.aClass250_10678 = class250;
				class523_sub38.anObjectArray10687 = class250.anObjectArray2646;
				Class482.method7916(class523_sub38, (byte) 3);
			}
			client.aBool11000 = true;
			Class232.anInt2367 = class250.interfaceHash * 880360359;
			client.anInt11105 = class250.anInt2709 * -913228981;
			Class570.anInt7658 = -797066821 * i;
			Class13.anInt173 = 2084527469 * i_3_;
			client.anInt11095 = class250.anInt2680 * 1020894253;
			Class684.anInt8664 = class250.anInt2552 * 1062537423;
			client.anInt11178 = -1820448997 * class250.anInt2549;
			Login.method15991(class250, (byte) -52);
		}
	}

	public static int method4158(byte[] is, int i, CharSequence charsequence, byte i_5_) {
		int i_6_ = charsequence.length();
		int i_7_ = i;
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			int i_9_ = charsequence.charAt(i_8_);
			if (i_9_ <= 127)
				is[i_7_++] = (byte) i_9_;
			else if (i_9_ <= 2047) {
				is[i_7_++] = (byte) (0xc0 | i_9_ >> 6);
				is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
			} else {
				is[i_7_++] = (byte) (0xe0 | i_9_ >> 12);
				is[i_7_++] = (byte) (0x80 | i_9_ >> 6 & 0x3f);
				is[i_7_++] = (byte) (0x80 | i_9_ & 0x3f);
			}
		}
		return i_7_ - i;
	}
}
