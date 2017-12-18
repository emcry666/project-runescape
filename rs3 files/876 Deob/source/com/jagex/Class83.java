/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class83 {
	static Class172 aClass172_873;

	Class83() throws Throwable {
		throw new Error();
	}

	public static int method1587(int i) {
		return i >>> 8;
	}

	public static int method1588(int i) {
		return i >>> 8;
	}

	public static int method1589(int i) {
		return i >>> 8;
	}

	public static int method1590(int i) {
		return i & 0xff;
	}

	public static int method1591(int i) {
		return i & 0xff;
	}

	static final void method1592(Class669 class669, boolean bool, boolean bool_0_, int i) {
		int i_1_ = class669.anIntArray8577[class669.anInt8579 * 1180759405];
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_2_ < 0 || i_2_ >= class669.anIntArray8555[i_1_])
			throw new RuntimeException();
		if (!bool)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.anIntArrayArray8578[i_1_][i_2_];
		else if (bool_0_) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.anIntArrayArray8578[i_1_][i_2_];
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_2_;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_2_;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.anIntArrayArray8578[i_1_][i_2_];
		}
	}
}
