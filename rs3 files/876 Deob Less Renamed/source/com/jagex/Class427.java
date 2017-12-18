/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.image.BufferedImage;

public class Class427 {
	public static final int anInt4825 = 4;
	public static final int anInt4826 = 15;
	public static final int anInt4827 = 9;
	public static final int anInt4828 = 0;
	public static final int anInt4829 = 7;
	public static final int anInt4830 = 16;
	public static final int anInt4831 = 3;
	public static final int anInt4832 = 1;
	public static final int anInt4833 = 14;
	public static final int anInt4834 = 8;
	public static final int anInt4835 = 6;
	public static final int anInt4836 = 12;
	public static final int anInt4837 = 10;
	public static final int anInt4838 = 18;
	public static final int anInt4839 = 17;
	public static final int anInt4840 = 19;
	public static final int anInt4841 = 2;
	public static final int anInt4842 = 13;
	public static final int anInt4843 = 11;
	public static final int anInt4844 = 5;

	Class427() throws Throwable {
		throw new Error();
	}

	public static String method6752(int i, boolean bool, int i_0_) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class49.method1279(i, 10, bool, -1624277711);
	}

	static final void method6753(Class669 class669, boolean bool, short i) {
		int i_1_ = class669.anIntArray8577[class669.anInt8579 * 1180759405];
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		if (i_2_ < 0 || i_2_ >= class669.anIntArray8555[i_1_])
			throw new RuntimeException();
		class669.anIntArrayArray8578[i_1_][i_2_] = i_3_;
		if (bool)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_3_;
	}

	static final void method6754(Class669 class669, byte i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub42_10612, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), 851960647);
		Class211.method3824(2119179991);
		client.aBool11133 = true;
	}

	static final void method6755(Class669 class669, int i) {
		class669.anInt8562 -= 204911810;
		if (class669.aLongArray8561[2056702369 * class669.anInt8562] <= class669.aLongArray8561[1 + 2056702369 * class669.anInt8562])
			class669.anInt8579 += (class669.anIntArray8577[class669.anInt8579 * 1180759405] * -1774429083);
	}

	public static int[] method6756(BufferedImage bufferedimage, int i) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_4_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i_5_ = 0; i_5_ < is_4_.length; i_5_++)
					is_4_[i_5_] = -16777216 + (is[i_5_] + ((is[i_5_] << 16) + (is[i_5_] << 8)));
			} else {
				for (int i_6_ = 0; i_6_ < is_4_.length; i_6_++) {
					int i_7_ = 2 * i_6_;
					is_4_[i_6_] = ((is[1 + i_7_] << 24) + is[i_7_] + ((is[i_7_] << 8) + (is[i_7_] << 16)));
				}
			}
			return is_4_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}
}
