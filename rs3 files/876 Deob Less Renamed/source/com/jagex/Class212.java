/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class212 {
	String aString2265;
	static byte[][][] aByteArrayArrayArray2266;

	public String method3825(byte i) {
		return aString2265;
	}

	Class212(Class523_Sub34 class523_sub34, boolean bool, boolean bool_0_) {
		if (bool)
			class523_sub34.readLong((byte) -66);
		if (bool_0_)
			aString2265 = class523_sub34.method16363((byte) -25);
		else
			aString2265 = null;
	}

	public String method3826() {
		return aString2265;
	}

	public static Class461[] method3827(int i) {
		return (new Class461[] { Class461.aClass461_5117, Class461.aClass461_5118, Class461.aClass461_5119 });
	}

	static final void method3828(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2640 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method3829(Class250 class250, Class242 class242, Class669 class669, short i) {
		class250.anInt2556 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 338805805;
		Class523_Sub14.method15991(class250, (byte) -89);
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
			Class689.method13954(class250.anInt2585 * -1363815505, 2066075863);
	}

	public static void method3830(int i) {
		if (-1 != Class6.aClass1_40.anInt10 * -1126141351)
			Class28.method873(Class6.aClass1_40.anInt10 * -1126141351, Class6.aClass1_40.aString9, -590643463 * Class6.aClass1_40.anInt11, 686690163 * Class6.aClass1_40.anInt12, -1226000599);
	}

	static final void method3831(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}

	static int method3832(CharSequence charsequence, char c, int i) {
		int i_1_ = 0;
		int i_2_ = charsequence.length();
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			if (charsequence.charAt(i_3_) == c)
				i_1_++;
		}
		return i_1_;
	}

	static void method3833(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(8, (long) i);
		class523_sub27_sub7.method17963(1373902039);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_4_;
		class523_sub27_sub7.anInt11649 = -254643469 * i_5_;
		class523_sub27_sub7.anInt11665 = i_6_ * -1024048703;
	}
}
