/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class266 {
	int anInt2859;
	static Class266 aClass266_2860;
	static Class266 aClass266_2861 = new Class266(0);
	static long aLong2862;

	Class266(int i) {
		anInt2859 = i * 1723651399;
	}

	static {
		aClass266_2860 = new Class266(1);
	}

	public static Class266 method4886(int i) {
		if (aClass266_2861.anInt2859 * -824294281 == i)
			return aClass266_2861;
		if (i == -824294281 * aClass266_2860.anInt2859)
			return aClass266_2860;
		return null;
	}

	public static Class266 method4887(int i) {
		if (aClass266_2861.anInt2859 * -824294281 == i)
			return aClass266_2861;
		if (i == -824294281 * aClass266_2860.anInt2859)
			return aClass266_2860;
		return null;
	}

	static final void method4888(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub18_10609.method16899(-2053069036);
	}

	static void method4889(Class522_Sub3 class522_sub3, byte i) {
		class522_sub3.aClass647_Sub1_Sub3_Sub1_10329 = null;
		if (-1674689159 * Class522_Sub3.anInt10328 < 20) {
			Class522_Sub3.aClass701_10331.method14084(class522_sub3, -1194021798);
			Class522_Sub3.anInt10328 += 1521358025;
		}
	}

	static Class4 method4890(Class523_Sub34 class523_sub34, Class98_Sub1 class98_sub1, int i) {
		Class4 class4 = new Class4(class98_sub1);
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-600136537);
			if (i_0_ == 255)
				break;
			Class474 class474 = (Class474) Class95.method1764(com.jagex.Class474.class, i_0_, 2138772399);
			for (;;) {
				int i_1_ = class523_sub34.readUnsignedByte(-1804287988);
				if (255 == i_1_)
					break;
				class523_sub34.anInt10661 -= 189765723;
				Class426 class426 = class98_sub1.method14344(class523_sub34, class474, (byte) 1);
				if (null != class426)
					class4.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1554044800);
			}
		}
		return class4;
	}
}
