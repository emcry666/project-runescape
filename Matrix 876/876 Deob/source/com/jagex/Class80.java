/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class80 {
	public static Class674 aClass674_865;
	public static Class53_Sub17 aClass53_Sub17_866;

	public static String method1564(CharSequence charsequence) {
		int i = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i);
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			char c = charsequence.charAt(i_0_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || c == '_')
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_1_ = Class523_Sub33.method16255(c, -74173527);
				stringbuilder.append('%');
				int i_2_ = i_1_ >> 4 & 0xf;
				if (i_2_ >= 10)
					stringbuilder.append((char) (i_2_ + 55));
				else
					stringbuilder.append((char) (48 + i_2_));
				i_2_ = i_1_ & 0xf;
				if (i_2_ >= 10)
					stringbuilder.append((char) (55 + i_2_));
				else
					stringbuilder.append((char) (i_2_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	Class80() throws Throwable {
		throw new Error();
	}

	public static String method1565(CharSequence charsequence) {
		int i = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i);
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			char c = charsequence.charAt(i_3_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || c == '_')
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_4_ = Class523_Sub33.method16255(c, -74173527);
				stringbuilder.append('%');
				int i_5_ = i_4_ >> 4 & 0xf;
				if (i_5_ >= 10)
					stringbuilder.append((char) (i_5_ + 55));
				else
					stringbuilder.append((char) (48 + i_5_));
				i_5_ = i_4_ & 0xf;
				if (i_5_ >= 10)
					stringbuilder.append((char) (55 + i_5_));
				else
					stringbuilder.append((char) (i_5_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	static final void method1566(Class669 class669, byte i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		String string_6_ = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560 + 1]);
		Class63.method1431(string, string_6_, -272595405);
	}

	static void method1567(int i, int i_7_) {
		for (Class523 class523 = client.aClass14_11242.method735(-380907255); class523 != null; class523 = client.aClass14_11242.method749(1866317298)) {
			if ((long) i == (1055205983951172633L * class523.aLong7065 >> 48 & 0xffffL))
				class523.method8661(607052656);
		}
	}
}
