/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.event.ActionEvent;

class Class214 implements Interface44 {
	Class217 this$0;
	public static Class53_Sub18 aClass53_Sub18_2268;

	public float method338(short i) {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(1039462978) / 255.0F);
	}

	public float method337() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(1004580794) / 255.0F);
	}

	Class214(Class217 class217) {
		this$0 = class217;
	}

	public float method336() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(465240637) / 255.0F);
	}

	public float method339() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(844038298) / 255.0F);
	}

	public static void method3836(String string, String string_0_, String string_1_, boolean bool, byte i) {
		if (string.length() <= 320 && Class653_Sub1.method16688((byte) 108)) {
			client.aClass116_11057.method1980((short) -231);
			Class387.method6467(496557064);
			Class43.aString603 = string;
			Class43.aString594 = string_0_;
			Class43.aString583 = string_1_;
			Class43.aBool588 = bool;
			Class657.method10791(1, (byte) -90);
		}
	}

	static void method3837(Object object, int i) {
		if (null != Class379.anEventQueue3932) {
			for (int i_2_ = 0; i_2_ < 50 && Class379.anEventQueue3932.peekEvent() != null; i_2_++)
				Class653.method10656(1L);
			try {
				if (null != object)
					Class379.anEventQueue3932.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static final void method3838(Class250 class250, Class242 class242, Class669 class669, int i) {
		class250.aBool2606 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Class523_Sub14.method15991(class250, (byte) -25);
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
			Class201.method3693(-1363815505 * class250.anInt2585, -1626792069);
	}

	static final void method3839(Class669 class669, byte i) {
		String string;
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.displayName != null))
			string = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18669(false, (byte) 0);
		else
			string = "";
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
	}

	public static void method3840(int i, String string, int i_3_) {
		Class515.method8593(i, 0, "", "", "", string, null, -967230499);
	}

	public static void method3841(Class250[] class250s, int i, int i_4_, int i_5_, boolean bool, int i_6_) {
		for (int i_7_ = 0; i_7_ < class250s.length; i_7_++) {
			Class250 class250 = class250s[i_7_];
			if (null != class250 && i == class250.anInt2546 * 97896203) {
				Class101.method1798(class250, i_4_, i_5_, bool, (short) -21326);
				Class33.method924(class250, i_4_, i_5_, (byte) -123);
				if (-448482823 * class250.anInt2636 > (907343347 * class250.anInt2554 - 365308179 * class250.anInt2581))
					class250.anInt2636 = (-900734389 * class250.anInt2554 - class250.anInt2581 * 436172395);
				if (-448482823 * class250.anInt2636 < 0)
					class250.anInt2636 = 0;
				if (class250.anInt2539 * -1013149031 > (-222228463 * class250.anInt2618 - class250.anInt2543 * -1759297857))
					class250.anInt2539 = (-826848199 * class250.anInt2618 - 1759611671 * class250.anInt2543);
				if (class250.anInt2539 * -1013149031 < 0)
					class250.anInt2539 = 0;
				if (class250.anInt2534 * 36473529 == 0)
					Class170.method2890(class250s, class250, bool, -1857095671);
			}
		}
	}

	public static void method3842(int i) {
		Class271.aMap2878.clear();
		Class271.aClass14_2876.method733(-1304386128);
		Class271.aClass697_2877.method14014(1173351342);
		Class271.anInt2875 = 0;
	}

	static final int method3843(int i, byte i_8_) {
		return i < 7 ? 7 : 10;
	}

	public static Class700 method3844(int i) {
		if (null == Class523_Sub27_Sub2.aClass700_11334)
			return Class700.aClass700_8778;
		return Class523_Sub27_Sub2.aClass700_11334;
	}
}
