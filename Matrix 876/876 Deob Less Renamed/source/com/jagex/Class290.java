/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class290 {
	static Class290 aClass290_3121;
	static Class290 aClass290_3122;
	Class39 aClass39_3123;
	static Class290 aClass290_3124;
	static Class290 aClass290_3125;
	static Class290 aClass290_3126;
	boolean aBool3127;
	static Class290 aClass290_3128 = new Class290(0, Class39.aClass39_478, 2);
	static Class290 aClass290_3129;
	static Class290 aClass290_3130;
	static Class290 aClass290_3131;
	static Class290 aClass290_3132;
	static Class290 aClass290_3133;
	static Class290 aClass290_3134;
	static Class290 aClass290_3135;
	static Class290 aClass290_3136;
	static Class290 aClass290_3137;
	static Class290 aClass290_3138;
	public int anInt3139;
	Class39 aClass39_3140;
	int anInt3141;
	int anInt3142;
	static Class290 aClass290_3143;
	static Class290 aClass290_3144;
	boolean aBool3145;
	static int anInt3146;

	static Class290[] method5211(int i) {
		return (new Class290[] { aClass290_3128, aClass290_3122, aClass290_3121, aClass290_3124, aClass290_3125, aClass290_3144, aClass290_3135, aClass290_3126, aClass290_3129, aClass290_3130, aClass290_3132, aClass290_3143, aClass290_3131, aClass290_3134, aClass290_3133, aClass290_3136, aClass290_3137, aClass290_3138 });
	}

	Class290(int i, Class39 class39, int i_0_) {
		this(i, class39, class39, i_0_, i_0_, true, false);
	}

	Class290(int i, Class39 class39, Class39 class39_1_, int i_2_, int i_3_) {
		this(i, class39, class39_1_, i_2_, i_3_, true, false);
	}

	static Class290[] method5212() {
		return (new Class290[] { aClass290_3128, aClass290_3122, aClass290_3121, aClass290_3124, aClass290_3125, aClass290_3144, aClass290_3135, aClass290_3126, aClass290_3129, aClass290_3130, aClass290_3132, aClass290_3143, aClass290_3131, aClass290_3134, aClass290_3133, aClass290_3136, aClass290_3137, aClass290_3138 });
	}

	static {
		aClass290_3122 = new Class290(1, Class39.aClass39_478, Class39.aClass39_478, 2, 3);
		aClass290_3121 = new Class290(2, Class39.aClass39_478, 3);
		aClass290_3124 = new Class290(3, Class39.aClass39_478, Class39.aClass39_478, 3, 4);
		aClass290_3125 = new Class290(4, Class39.aClass39_478, 4);
		aClass290_3144 = new Class290(5, Class39.aClass39_478, Class39.aClass39_478, 4, 5);
		aClass290_3135 = new Class290(6, Class39.aClass39_478, Class39.aClass39_478, 5, 98, true, true);
		aClass290_3126 = new Class290(7, Class39.aClass39_478, 99);
		aClass290_3129 = new Class290(8, Class39.aClass39_478, 100);
		aClass290_3130 = new Class290(9, Class39.aClass39_479, Class39.aClass39_479, 0, 92, true, true);
		aClass290_3132 = new Class290(10, Class39.aClass39_479, Class39.aClass39_479, 92, 93);
		aClass290_3143 = new Class290(11, Class39.aClass39_479, Class39.aClass39_479, 94, 95);
		aClass290_3131 = new Class290(12, Class39.aClass39_479, Class39.aClass39_479, 96, 97);
		aClass290_3134 = new Class290(13, Class39.aClass39_479, 97);
		aClass290_3133 = new Class290(14, Class39.aClass39_479, 97);
		aClass290_3136 = new Class290(15, Class39.aClass39_479, 100);
		aClass290_3137 = new Class290(16, Class39.aClass39_479, 100);
		aClass290_3138 = new Class290(17, Class39.aClass39_479, 100);
	}

	Class290(int i, Class39 class39, Class39 class39_4_, int i_5_, int i_6_, boolean bool, boolean bool_7_) {
		anInt3139 = 1058226295 * i;
		aClass39_3140 = class39;
		aClass39_3123 = class39_4_;
		anInt3142 = i_5_ * 635668183;
		anInt3141 = 2025738313 * i_6_;
		aBool3127 = bool;
		aBool3145 = bool_7_;
	}

	static Class290[] method5213() {
		return (new Class290[] { aClass290_3128, aClass290_3122, aClass290_3121, aClass290_3124, aClass290_3125, aClass290_3144, aClass290_3135, aClass290_3126, aClass290_3129, aClass290_3130, aClass290_3132, aClass290_3143, aClass290_3131, aClass290_3134, aClass290_3133, aClass290_3136, aClass290_3137, aClass290_3138 });
	}

	public static int method5214(int i, int i_8_, int i_9_, byte i_10_) {
		i_9_ &= 0x3;
		if (0 == i_9_)
			return i_8_;
		if (i_9_ == 1)
			return 4095 - i;
		if (i_9_ == 2)
			return 4095 - i_8_;
		return i;
	}

	static boolean method5215(int i, int i_11_) {
		if (i == 18 || 19 == i || 20 == i || 21 == i || i == 22 || 1004 == i)
			return true;
		if (17 == i)
			return true;
		return false;
	}

	static void method5216(Class242 class242, int i, int i_12_, int i_13_, boolean bool, Class669 class669, int i_14_) {
		if (i_12_ == 0)
			throw new RuntimeException();
		Class250 class250 = class242.aClass250Array2457[i];
		if (null == class250.aClass250Array2535) {
			class250.aClass250Array2535 = new Class250[i_13_ + 1];
			class250.aClass250Array2519 = class250.aClass250Array2535;
		}
		if (class250.aClass250Array2535.length <= i_13_) {
			if (class250.aClass250Array2535 == class250.aClass250Array2519) {
				Class250[] class250s = new Class250[1 + i_13_];
				for (int i_15_ = 0; i_15_ < class250.aClass250Array2535.length; i_15_++)
					class250s[i_15_] = class250.aClass250Array2535[i_15_];
				class250.aClass250Array2535 = class250.aClass250Array2519 = class250s;
			} else {
				Class250[] class250s = new Class250[i_13_ + 1];
				Class250[] class250s_16_ = new Class250[1 + i_13_];
				for (int i_17_ = 0; i_17_ < class250.aClass250Array2535.length; i_17_++) {
					class250s[i_17_] = class250.aClass250Array2535[i_17_];
					class250s_16_[i_17_] = class250.aClass250Array2519[i_17_];
				}
				class250.aClass250Array2535 = class250s;
				class250.aClass250Array2519 = class250s_16_;
			}
		}
		if (i_13_ > 0 && class250.aClass250Array2535[i_13_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_13_ - 1).toString());
		Class250 class250_18_ = new Class250();
		class250_18_.anInt2534 = i_12_ * -223716471;
		class250_18_.anInt2546 = (class250_18_.anInt2585 = class250.anInt2585 * 1) * -1609778067;
		class250_18_.anInt2709 = -1287445421 * i_13_;
		class250.aClass250Array2535[i_13_] = class250_18_;
		if (class250.aClass250Array2519 != class250.aClass250Array2535)
			class250.aClass250Array2519[i_13_] = class250_18_;
		Class677 class677;
		if (bool)
			class677 = class669.aClass677_8566;
		else
			class677 = class669.aClass677_8574;
		class677.aClass242_8637 = class242;
		class677.aClass250_8638 = class250_18_;
		Class523_Sub14.method15991(class250, (byte) -65);
	}

	static final void method5217(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_19_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		short i_20_ = (short) (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]);
		short i_21_ = (short) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 2]);
		if (i_19_ >= 0 && i_19_ < 5) {
			class250.method4445(i_19_, i_20_, i_21_, (byte) 9);
			Class523_Sub14.method15991(class250, (byte) -116);
			if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
				Class635.method10439(class250.anInt2585 * -1363815505, i_19_, 1004351327);
		}
	}

	static final void method5218(Class669 class669, byte i) {
		Class250 class250 = Class188.method3592(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -633587300);
		if (class250.aClass250Array2535 == null)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else {
			int i_22_ = class250.aClass250Array2535.length;
			for (int i_23_ = 0; i_23_ < class250.aClass250Array2535.length; i_23_++) {
				if (class250.aClass250Array2535[i_23_] == null) {
					i_22_ = i_23_;
					break;
				}
			}
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_22_;
		}
	}

	static final void method5219(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class20.method817(string, 848999811);
	}

	static final void method5220(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_24_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (-1 == i_24_)
			throw new RuntimeException("");
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = new StringBuilder().append(string).append((char) i_24_).toString();
	}

	static final void method5221(Class669 class669, int i) {
		int i_25_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_25_, -1426613691);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.method17254(class250) ? 1 : 0;
	}
}
