/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEventResult;

public class Class565 {
	short aShort7585;
	public Class565 aClass565_7586;
	public Class647_Sub1_Sub4 aClass647_Sub1_Sub4_7587;
	short aShort7588;
	public Class647_Sub1_Sub1 aClass647_Sub1_Sub1_7589;
	public Class647_Sub1_Sub1 aClass647_Sub1_Sub1_7590;
	public Class647_Sub1_Sub2 aClass647_Sub1_Sub2_7591;
	Class647_Sub1_Sub5 aClass647_Sub1_Sub5_7592;
	public Class548 aClass548_7593;
	short aShort7594;
	public byte aByte7595;
	public Class647_Sub1_Sub4 aClass647_Sub1_Sub4_7596;
	short aShort7597;

	public Class565(int i) {
		aByte7595 = (byte) i;
	}

	static void method9483(int i, int i_0_, int i_1_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_0_);
		Class582 class582 = twitcheventresult.method6618();
		if (class582 != null)
			IOException_Sub1.method18560(class582.method82(), twitcheventresult, 1357652815);
	}

	static final void method9484(Class669 class669, int i) {
		Class668.method13676(class669.aClass647_Sub1_Sub5_Sub1_8568, class669, (byte) 0);
	}

	public static Class388 method9485(Class523_Sub34 class523_sub34, int i) {
		Class388 class388 = Class659.method10808(class523_sub34, -1880053474);
		int i_2_ = class523_sub34.method16286(1227188053);
		return new Class388_Sub1(class388.anInt4015 * -355828177, class388.aClass380_4012, class388.aClass389_4014, 440520797 * class388.anInt4011, class388.anInt4013 * -1880623915, i_2_);
	}

	static void method9486(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class591 class591, byte i_8_) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_9_ = ((Class523_Sub2) Class523_Sub2.aClass708_10360.method14240(877100674)); null != class523_sub2_9_; class523_sub2_9_ = (Class523_Sub2) Class523_Sub2.aClass708_10360.method14244((byte) 20)) {
			if (i == 1338368275 * class523_sub2_9_.anInt10354 && i_3_ == 1813697231 * class523_sub2_9_.anInt10348 && i_4_ == class523_sub2_9_.anInt10355 * 1818669861 && class523_sub2_9_.anInt10349 * 876815205 == i_5_) {
				class523_sub2 = class523_sub2_9_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = 703926555 * i;
			class523_sub2.anInt10349 = 437147245 * i_5_;
			class523_sub2.anInt10348 = i_3_ * -923077585;
			class523_sub2.anInt10355 = -631623507 * i_4_;
			Class523_Sub2.aClass708_10360.method14236(class523_sub2, -1234269497);
		}
		class523_sub2.anInt10353 = 601144019 * i_6_;
		class523_sub2.anInt10361 = i_7_ * -2098934699;
		class523_sub2.aClass591_10356 = class591;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}
}
