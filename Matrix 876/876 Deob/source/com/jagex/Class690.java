/* Class690 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class690 {
	public String aString8684;
	public static Class690 aClass690_8685 = new Class690("LIVE", 0);
	public static Class690 aClass690_8686;
	public static Class690 aClass690_8687;
	static Class690 aClass690_8688;
	public static Class690 aClass690_8689 = new Class690("BUILDLIVE", 3);
	public int anInt8690;

	Class690(String string, int i) {
		aString8684 = string;
		anInt8690 = i * 1420978751;
	}

	static {
		aClass690_8686 = new Class690("RC", 1);
		aClass690_8687 = new Class690("WIP", 2);
		aClass690_8688 = new Class690("INTBETA", 4);
	}

	static Class690[] method13955() {
		return new Class690[] { aClass690_8687, aClass690_8689, aClass690_8685, aClass690_8686, aClass690_8688 };
	}

	static Class690[] method13956() {
		return new Class690[] { aClass690_8687, aClass690_8689, aClass690_8685, aClass690_8686, aClass690_8688 };
	}

	public static Class690 method13957(int i) {
		Class690[] class690s = Class159_Sub2.method14359(-2126433376);
		for (int i_0_ = 0; i_0_ < class690s.length; i_0_++) {
			Class690 class690 = class690s[i_0_];
			if (i == -1773107777 * class690.anInt8690)
				return class690;
		}
		return null;
	}

	static boolean method13958(int i, byte i_1_) {
		return 16 == i || i == 0 || 8 == i || 9 == i;
	}
}
