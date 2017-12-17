/* Class597 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class597 {
	static Class597 aClass597_7832;
	static Class597 aClass597_7833 = new Class597(0);
	public static Class597 aClass597_7834;
	public static int anInt7835;

	static {
		aClass597_7832 = new Class597(1);
		aClass597_7834 = new Class597(2);
	}

	Class597(int i) {
		/* empty */
	}

	static final void method9842(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.anInt2544 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 249826099;
		Class523_Sub14.method15991(class250, (byte) -96);
		if (234012635 * class250.anInt2709 == -1 && !class242.aBool2456)
			BodyDefinitions.method10331(-1363815505 * class250.anInt2585, 825227355);
	}

	static final void method9843(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anInt8558 -= -87112490;
		byte[] is = null;
		byte[] is_0_ = null;
		int i_1_;
		for (i_1_ = 0; i_1_ < 10 && (class669.anIntArray8557[i_1_ + 1357652815 * class669.anInt8558]) >= 0; i_1_ += 2) {
			/* empty */
		}
		if (i_1_ > 0) {
			is = new byte[i_1_ / 2];
			is_0_ = new byte[i_1_ / 2];
			for (i_1_ -= 2; i_1_ >= 0; i_1_ -= 2) {
				is[i_1_ / 2] = (byte) (class669.anIntArray8557[i_1_ + 1357652815 * class669.anInt8558]);
				is_0_[i_1_ / 2] = (byte) (class669.anIntArray8557[i_1_ + 1357652815 * class669.anInt8558 + 1]);
			}
		}
		Class203.method3702(class250, is, is_0_, class669, (byte) 116);
	}

	static final void method9844(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2668 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method9845(Class669 class669, byte i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class450.method7277(i_2_, -1998936095);
	}

	static final void method9846(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_4_ = Class449.aClass523_Sub33_4946.aClass687_Sub22_10652.method16930(1849749073);
		if (i_3_ != i_4_) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub22_10652), i_3_, -391970097);
			Class211.method3824(1827889804);
			client.aBool11012 = false;
		}
	}

	static final void method9847(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		int i_12_ = i_10_ - 334;
		if (i_12_ < 0)
			i_12_ = 0;
		else if (i_12_ > 100)
			i_12_ = 100;
		int i_13_ = ((client.aShort11277 - client.aShort11276) * i_12_ / 100 + client.aShort11276);
		i_9_ = i_13_ * i_9_ >> 8;
		int i_14_ = 16384 - i_7_ & 0x3fff;
		int i_15_ = 16384 - i_8_ & 0x3fff;
		int i_16_ = 0;
		int i_17_ = 0;
		int i_18_ = i_9_;
		if (0 != i_14_) {
			i_17_ = -i_18_ * Class433.anIntArray4880[i_14_] >> 14;
			i_18_ = i_18_ * Class433.anIntArray4881[i_14_] >> 14;
		}
		if (0 != i_15_) {
			i_16_ = i_18_ * Class433.anIntArray4880[i_15_] >> 14;
			i_18_ = Class433.anIntArray4881[i_15_] * i_18_ >> 14;
		}
		Class77.anInt858 = (i - i_16_) * -568385483;
		Class285.anInt3085 = (i_5_ - i_17_) * 1059489463;
		Class497.anInt5563 = (i_6_ - i_18_) * -1449377339;
		Class678.anInt8639 = i_7_ * 1767382019;
		Class424.anInt4817 = i_8_ * -1709276499;
		Class248.anInt2491 = 0;
	}

	public static boolean method9848(int i, int i_19_) {
		return i == 0 || 1 == i || i == 2;
	}
}
