/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class449 {
	public static Class523_Sub33 aClass523_Sub33_4946;
	static int anInt4947;
	static Class472 aClass472_4948;

	public static int method7251(int i, int i_0_, int i_1_) {
		i_1_ &= 0x3;
		if (0 == i_1_)
			return i_0_;
		if (i_1_ == 1)
			return 4095 - i;
		if (i_1_ == 2)
			return 4095 - i_0_;
		return i;
	}

	public static int method7252(int i, int i_2_, int i_3_) {
		i_3_ &= 0x3;
		if (i_3_ == 0)
			return i_2_;
		if (i_3_ == 1)
			return 7 - i;
		if (i_3_ == 2)
			return 7 - i_2_;
		return i;
	}

	public static int method7253(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if ((i_8_ & 0x1) == 1) {
			int i_9_ = i_6_;
			i_6_ = i_7_;
			i_7_ = i_9_;
		}
		i_5_ &= 0x3;
		if (0 == i_5_)
			return i;
		if (1 == i_5_)
			return i_4_;
		if (i_5_ == 2)
			return 7 - i - (i_6_ - 1);
		return 7 - i_4_ - (i_7_ - 1);
	}

	public static int method7254(int i, int i_10_, int i_11_) {
		i_11_ &= 0x3;
		if (i_11_ == 0)
			return i_10_;
		if (i_11_ == 1)
			return 7 - i;
		if (i_11_ == 2)
			return 7 - i_10_;
		return i;
	}

	public static int method7255(int i, int i_12_, int i_13_) {
		i_13_ &= 0x3;
		if (i_13_ == 0)
			return i;
		if (i_13_ == 1)
			return i_12_;
		if (2 == i_13_)
			return 4095 - i;
		return 4095 - i_12_;
	}

	public static int method7256(int i, int i_14_, int i_15_) {
		i_15_ &= 0x3;
		if (0 == i_15_)
			return i_14_;
		if (i_15_ == 1)
			return 4095 - i;
		if (i_15_ == 2)
			return 4095 - i_14_;
		return i;
	}

	public static int method7257(int i, int i_16_, int i_17_) {
		i_17_ &= 0x3;
		if (0 == i_17_)
			return i_16_;
		if (i_17_ == 1)
			return 4095 - i;
		if (i_17_ == 2)
			return 4095 - i_16_;
		return i;
	}

	public static int method7258(int i, int i_18_, int i_19_) {
		i_19_ &= 0x3;
		if (0 == i_19_)
			return i_18_;
		if (i_19_ == 1)
			return 4095 - i;
		if (i_19_ == 2)
			return 4095 - i_18_;
		return i;
	}

	public static int method7259(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		if (1 == (i_24_ & 0x1)) {
			int i_25_ = i_22_;
			i_22_ = i_23_;
			i_23_ = i_25_;
		}
		i_21_ &= 0x3;
		if (0 == i_21_)
			return i_20_;
		if (i_21_ == 1)
			return 7 - i - (i_22_ - 1);
		if (2 == i_21_)
			return 7 - i_20_ - (i_23_ - 1);
		return i;
	}

	public static int method7260(int i, int i_26_, int i_27_) {
		i_27_ &= 0x3;
		if (0 == i_27_)
			return i_26_;
		if (i_27_ == 1)
			return 4095 - i;
		if (i_27_ == 2)
			return 4095 - i_26_;
		return i;
	}

	public static int method7261(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		if (1 == (i_32_ & 0x1)) {
			int i_33_ = i_30_;
			i_30_ = i_31_;
			i_31_ = i_33_;
		}
		i_29_ &= 0x3;
		if (0 == i_29_)
			return i_28_;
		if (i_29_ == 1)
			return 7 - i - (i_30_ - 1);
		if (2 == i_29_)
			return 7 - i_28_ - (i_31_ - 1);
		return i;
	}

	Class449() throws Throwable {
		throw new Error();
	}

	public static int method7262(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_) {
		if ((i_38_ & 0x1) == 1) {
			int i_39_ = i_36_;
			i_36_ = i_37_;
			i_37_ = i_39_;
		}
		i_35_ &= 0x3;
		if (0 == i_35_)
			return i;
		if (1 == i_35_)
			return i_34_;
		if (i_35_ == 2)
			return 7 - i - (i_36_ - 1);
		return 7 - i_34_ - (i_37_ - 1);
	}

	public static int method7263(int i, int i_40_, int i_41_) {
		i_41_ &= 0x3;
		if (i_41_ == 0)
			return i_40_;
		if (i_41_ == 1)
			return 7 - i;
		if (i_41_ == 2)
			return 7 - i_40_;
		return i;
	}

	public static int method7264(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (1 == (i_46_ & 0x1)) {
			int i_47_ = i_44_;
			i_44_ = i_45_;
			i_45_ = i_47_;
		}
		i_43_ &= 0x3;
		if (0 == i_43_)
			return i_42_;
		if (i_43_ == 1)
			return 7 - i - (i_44_ - 1);
		if (2 == i_43_)
			return 7 - i_42_ - (i_45_ - 1);
		return i;
	}

	static final void method7265(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = aClass523_Sub33_4946.aClass687_Sub14_10598.method16864((short) -17018) == 1 ? 1 : 0;
	}

	static final void method7266(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = ((Class647_Sub1) class669.anInterface61_8572).method16740(-1473538558);
	}

	static void method7267(int i, String string, byte i_48_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(2, (long) i);
		class523_sub27_sub7.method17963(1965470376);
		class523_sub27_sub7.aString11650 = string;
	}

	public static Class523_Sub29 method7268(int i, int i_49_, int i_50_, int i_51_, int i_52_) {
		synchronized (Class523_Sub29.aClass523_Sub29Array10558) {
			if (0 == Class523_Sub29.anInt10556 * -1791984535) {
				Class523_Sub29 class523_sub29 = new Class523_Sub29(i, i_49_, i_50_, i_51_);
				return class523_sub29;
			}
			Class523_Sub29.aClass523_Sub29Array10558[(Class523_Sub29.anInt10556 -= -1124281383) * -1791984535].method16160(i, i_49_, i_50_, i_51_, -1829540913);
			Class523_Sub29 class523_sub29 = (Class523_Sub29.aClass523_Sub29Array10558[Class523_Sub29.anInt10556 * -1791984535]);
			return class523_sub29;
		}
	}
}
