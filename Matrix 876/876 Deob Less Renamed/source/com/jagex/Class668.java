/* Class668 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Locale;

public class Class668 implements Interface75 {
	Locale aLocale8539;
	public static Class668 aClass668_8540;
	String aString8541;
	public static Class668 aClass668_8542;
	static Class668 aClass668_8543;
	public static Class668 aClass668_8544;
	public static Class668 aClass668_8545;
	String aString8546;
	public static final int anInt8547 = 7;
	public static Class668 aClass668_8548 = new Class668("EN", "en", "English", Class674.aClass674_8613, 0, "GB");
	public int anInt8549;
	public static Class668 aClass668_8550;
	static Class668[] aClass668Array8551;

	public static Class366 method13671(int i, int i_0_) {
		if (Class655.aClass375_8420 != null)
			return Class655.aClass375_8420.method6357((byte) 36).method6333(i, 91613337);
		return null;
	}

	String method13672() {
		return aString8541;
	}

	String method13673(byte i) {
		return aString8541;
	}

	public int method82() {
		return anInt8549 * 1965832361;
	}

	public static Class668[] method13674(int i) {
		return new Class668[] { aClass668_8544, aClass668_8540, aClass668_8542, aClass668_8550, aClass668_8543, aClass668_8545, aClass668_8548 };
	}

	public static Class668 method13675(int i, int i_1_) {
		if (i < 0 || i >= aClass668Array8551.length)
			return null;
		return aClass668Array8551[i];
	}

	public String toString() {
		return method13673((byte) 100).toLowerCase(Locale.ENGLISH);
	}

	static {
		aClass668_8540 = new Class668("DE", "de", "German", Class674.aClass674_8613, 1, "DE");
		aClass668_8550 = new Class668("FR", "fr", "French", Class674.aClass674_8613, 2, "FR");
		aClass668_8542 = new Class668("PT", "pt", "Portuguese", Class674.aClass674_8613, 3, "BR");
		aClass668_8543 = new Class668("NL", "nl", "Dutch", Class674.aClass674_8616, 4, "NL");
		aClass668_8544 = new Class668("ES", "es", "Spanish", Class674.aClass674_8616, 5, "ES");
		aClass668_8545 = new Class668("ES_MX", "es-mx", "Spanish (Latin American)", Class674.aClass674_8613, 6, "MX");
		Class668[] class668s = method13674(-1805878542);
		aClass668Array8551 = new Class668[class668s.length];
		Class668[] class668s_2_ = class668s;
		for (int i = 0; i < class668s_2_.length; i++) {
			Class668 class668 = class668s_2_[i];
			if (aClass668Array8551[class668.anInt8549 * 1965832361] != null)
				throw new IllegalStateException();
			aClass668Array8551[class668.anInt8549 * 1965832361] = class668;
		}
	}

	Class668(String string, String string_3_, String string_4_, Class674 class674, int i, String string_5_) {
		aString8546 = string;
		aString8541 = string_3_;
		anInt8549 = -92804199 * i;
		if (string_5_ != null)
			aLocale8539 = new Locale(string_3_.substring(0, 2), string_5_);
		else
			aLocale8539 = new Locale(string_3_.substring(0, 2));
	}

	static final void method13676(Class647_Sub1 class647_sub1, Class669 class669, byte i) {
		boolean bool = false;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		if (null != class647_sub1.aClass180Array10823) {
			for (int i_10_ = 0; i_10_ < class647_sub1.aClass180Array10823.length; i_10_++) {
				Class180 class180 = class647_sub1.aClass180Array10823[i_10_];
				if (class180.aBool2000) {
					int i_11_;
					int i_12_;
					if (class180.anInt1998 < class180.anInt1999) {
						i_11_ = class180.anInt1998 - class180.anInt2001;
						i_12_ = class180.anInt2001 + class180.anInt1999;
					} else {
						i_11_ = class180.anInt1999 - class180.anInt2001;
						i_12_ = class180.anInt2001 + class180.anInt1998;
					}
					int i_13_;
					int i_14_;
					if (class180.anInt2003 < class180.anInt2002) {
						i_13_ = class180.anInt2003 - class180.anInt2001;
						i_14_ = class180.anInt2002 + class180.anInt2001;
					} else {
						i_13_ = class180.anInt2002 - class180.anInt2001;
						i_14_ = class180.anInt2003 + class180.anInt2001;
					}
					if (!bool || i_11_ < i_6_)
						i_6_ = i_11_;
					if (!bool || i_13_ < i_7_)
						i_7_ = i_13_;
					if (!bool || i_12_ > i_8_)
						i_8_ = i_12_;
					if (!bool || i_14_ > i_9_)
						i_9_ = i_14_;
					bool = true;
				}
			}
		}
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = bool ? 1 : 0;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_6_;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_7_;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_8_;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_9_;
	}

	public int method6() {
		return anInt8549 * 1965832361;
	}

	public static Class668[] method13677() {
		return new Class668[] { aClass668_8544, aClass668_8540, aClass668_8542, aClass668_8550, aClass668_8543, aClass668_8545, aClass668_8548 };
	}

	public static Class668[] method13678() {
		return new Class668[] { aClass668_8544, aClass668_8540, aClass668_8542, aClass668_8550, aClass668_8543, aClass668_8545, aClass668_8548 };
	}

	public String method13679() {
		return method13673((byte) 54).toLowerCase(Locale.ENGLISH);
	}

	public Locale method13680(int i) {
		return aLocale8539;
	}

	String method13681() {
		return aString8541;
	}

	public Locale method13682() {
		return aLocale8539;
	}

	public static Class668 method13683(int i) {
		if (i < 0 || i >= aClass668Array8551.length)
			return null;
		return aClass668Array8551[i];
	}

	public static Class668 method13684(int i) {
		if (i < 0 || i >= aClass668Array8551.length)
			return null;
		return aClass668Array8551[i];
	}

	String method13685() {
		return aString8541;
	}

	static final void method13686(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class526.method8727(class250, class242, class669, -185833564);
	}

	static final void method13687(Class669 class669, int i) {
		throw new RuntimeException("");
	}

	static final void method13688(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}

	public int method101() {
		return anInt8549 * 1965832361;
	}

	static final void method13689(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class43.anInt609 * -1471454747;
	}

	static final void method13690(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.method17252(class250).method15964(-860655948);
	}
}
