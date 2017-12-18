/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

import com.jagex.twitchtv.TwitchTV;

public class Class469 {
	public static Class469 aClass469_5334 = new Class469(0);
	public static Class469 aClass469_5335 = new Class469(1);
	static Class469 aClass469_5336;
	public static Class469 aClass469_5337;
	public static Class469 aClass469_5338;
	static Class469 aClass469_5339;
	static Class469 aClass469_5340;
	public int anInt5341;
	static Class469 aClass469_5342;
	public static Class469 aClass469_5343 = new Class469(2);
	public static Class58_Sub2 aClass58_Sub2_5344;

	static {
		aClass469_5337 = new Class469(3);
		aClass469_5338 = new Class469(4);
		aClass469_5336 = new Class469(5);
		aClass469_5340 = new Class469(6);
		aClass469_5339 = new Class469(7);
		aClass469_5342 = new Class469(8);
	}

	Class469(int i) {
		anInt5341 = i * -835739679;
	}

	static int method7612(byte i) {
		try {
			for (int i_0_ = 0; i_0_ < Class569.aStringArray7634.length; i_0_++) {
				if (Class569.aStringArray7634[i_0_] != null && Class569.aBoolArray7633[i_0_])
					Class523_Sub24.method16142(1891108650).method383(Class569.aStringArray7634[i_0_], 2106472487);
			}
		} catch (Exception_Sub6 exception_sub6) {
			return 3;
		}
		Class323.aTwitchTV3452 = new TwitchTV();
		int i_1_ = Class323.aTwitchTV3452.InitialiseTTV(Class273.method5027((byte) -48));
		if (i_1_ == 0)
			Class569.aBool7643 = true;
		else
			Class305.method5553(new StringBuilder().append(10).append(Class31.aString300).append(i_1_).toString(), new RuntimeException(), (byte) 1);
		return 2;
	}

	public static void method7613(boolean bool, int i) {
		Class254.aClass217_2743.method3939(402411020);
		if (BaseVarType.method7761(-2020118759 * client.anInt11136, (byte) 63)) {
			RSStream[] class116s = client.aClass116Array11210;
			for (int i_2_ = 0; i_2_ < class116s.length; i_2_++) {
				RSStream class116 = class116s[i_2_];
				class116.anInt1424 += -575771961;
				if (class116.anInt1424 * -1555613961 < 50 && !bool)
					return;
				class116.anInt1424 = 0;
				if (!class116.aBool1432 && class116.getCurrentStream(782493095) != null) {
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4323, class116.aClass11_1413, 1370050649);
					class116.method1974(class523_sub22, (byte) 72);
					try {
						class116.method1973(1512049308);
					} catch (IOException ioexception) {
						class116.aBool1432 = true;
					}
				}
			}
			Class254.aClass217_2743.method3939(-1286690900);
		}
	}

	static final void method7614(Class669 class669, byte i) {
		int i_3_ = class669.anIntArray8577[1180759405 * class669.anInt8579] >> 16;
		int i_4_ = (class669.anIntArray8577[1180759405 * class669.anInt8579] & 0xffff);
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_5_ < 0 || i_5_ > 5000)
			throw new RuntimeException();
		class669.anIntArray8555[i_3_] = i_5_;
		int i_6_ = -1;
		if (i_4_ == Class464.aClass464_5247.method82())
			i_6_ = 0;
		for (int i_7_ = 0; i_7_ < i_5_; i_7_++)
			class669.anIntArrayArray8578[i_3_][i_7_] = i_6_;
	}

	static void method7615(Class178 class178, byte i) {
		if (Class36.aBool326)
			Class587.method9715(class178, 643999902);
		else
			Class31.method906(class178, (byte) -70);
	}
}
