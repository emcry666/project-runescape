/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class478 {
	static Class478 aClass478_5446;
	public static Class478 aClass478_5447;
	static Class478 aClass478_5448;
	static Class478 aClass478_5449;
	static Class478 aClass478_5450;
	static Class478 aClass478_5451 = new Class478(0, false);
	static Class478 aClass478_5452;
	public boolean aBool5453;
	static Class478 aClass478_5454;
	int anInt5455;
	static Class478 aClass478_5456;

	static {
		aClass478_5447 = new Class478(1, false);
		aClass478_5448 = new Class478(2, false);
		aClass478_5449 = new Class478(3, false);
		aClass478_5450 = new Class478(4, false);
		aClass478_5446 = new Class478(5, true);
		aClass478_5452 = new Class478(6, true);
		aClass478_5456 = new Class478(7, true);
		aClass478_5454 = new Class478(8, true);
	}

	Class478(int i, boolean bool) {
		anInt5455 = -210168767 * i;
		aBool5453 = bool;
	}

	public static Class528 method7891(Class472 class472, String string, boolean bool, int i) {
		int i_0_ = class472.method7646(string, (byte) -115);
		if (i_0_ == -1)
			return new Class528(0);
		byte[] is = class472.method7688(i_0_, 1, -1382930227);
		if (null == is)
			return new Class528(0);
		RSBuffer class523_sub34 = new RSBuffer(is);
		int i_1_ = class523_sub34.readUnsignedShort(-1270610712);
		Class528 class528 = new Class528(i_1_);
		int i_2_ = 0;
		while (i_2_ < 1153952435 * class528.anInt7099) {
			int i_3_ = class523_sub34.readUnsignedInt((byte) -28);
			int i_4_ = class523_sub34.readUnsignedShort(-283012939);
			int i_5_ = class523_sub34.readUnsignedByte(1513283226);
			if (bool || 1 != i_5_) {
				class528.anIntArray7098[i_2_] = i_3_;
				class528.anIntArray7100[i_2_] = i_4_;
				i_2_++;
			} else
				class528.anInt7099 -= 118674555;
		}
		return class528;
	}

	static final void method7892(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_7_ = i_6_ >> 16;
		if (Class31.aClass242Array302[i_7_] == null)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else {
			String string = (Class31.aClass242Array302[i_7_].aClass250Array2457[i_6_].aString2695);
			if (null == string)
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			else
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
		}
	}

	static void method7893(Class559 class559, int i) {
		class559.aClass647_Sub1_7492 = null;
		synchronized (Class559.aStack7491) {
			if (Class559.aStack7491.size() < 200)
				Class559.aStack7491.push(class559);
		}
	}

	static final int method7894(byte i) {
		return 0;
	}

	static final void method7895(Class669 class669, byte i) {
		Class523_Sub29 class523_sub29 = ((Class523_Sub29) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]));
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 93) != Class294.aClass294_3165)
			throw new RuntimeException();
		Class688_Sub1 class688_sub1 = (Class688_Sub1) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 106);
		class688_sub1.method17006(class523_sub29, 1216150506);
		client.aBool11111 = true;
	}
}
