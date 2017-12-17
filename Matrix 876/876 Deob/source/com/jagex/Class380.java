/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class380 {
	static Class380 aClass380_3934;
	static Class380 aClass380_3935;
	static Class380 aClass380_3936 = new Class380();
	public static Class53_Sub11 aClass53_Sub11_3937;
	public static Class473 aClass473_3938;

	public static Class380[] method6399() {
		return (new Class380[] { aClass380_3936, aClass380_3934, aClass380_3935 });
	}

	public int method6400(int i, int i_0_, short i_1_) {
		int i_2_ = (2141365743 * Class170.anInt1833 > i_0_ ? Class170.anInt1833 * 2141365743 : i_0_);
		if (this == aClass380_3936)
			return 0;
		if (aClass380_3935 == this)
			return i_2_ - i;
		if (aClass380_3934 == this)
			return (i_2_ - i) / 2;
		return 0;
	}

	static {
		aClass380_3934 = new Class380();
		aClass380_3935 = new Class380();
	}

	public static Class380[] method6401() {
		return (new Class380[] { aClass380_3936, aClass380_3934, aClass380_3935 });
	}

	Class380() {
		/* empty */
	}

	static final void method6402(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}

	static final void method6403(Class669 class669, int i) {
		if (!Class366.method6324(1646256165))
			Class428.method6758(-2087624491);
	}

	static char method6404(char c, Class668 class668, int i) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if ('\u00c7' == c)
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if (c == '\u00d1' && class668 != Class668.aClass668_8544)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if (c == '\u00dd')
				return 'Y';
			if (c == '\u00df')
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if (c == '\u00e7')
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if ('\u00f1' == c && class668 != Class668.aClass668_8544)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if ('\u0152' == c)
			return 'O';
		if (c == '\u0153')
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	public static void method6405(boolean bool, int i) {
		/* empty */
	}
}
