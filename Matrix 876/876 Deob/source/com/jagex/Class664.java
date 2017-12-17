/* Class664 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class664 {
	static char[] aCharArray8526 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };

	public static boolean method13625(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8526;
			for (int i = 0; i < cs.length; i++) {
				char c_0_ = cs[i];
				if (c_0_ == c)
					return true;
			}
		}
		return false;
	}

	public static byte method13626(char c) {
		byte i;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i = (byte) c;
		else if ('\u20ac' == c)
			i = (byte) -128;
		else if ('\u201a' == c)
			i = (byte) -126;
		else if (c == '\u0192')
			i = (byte) -125;
		else if (c == '\u201e')
			i = (byte) -124;
		else if ('\u2026' == c)
			i = (byte) -123;
		else if (c == '\u2020')
			i = (byte) -122;
		else if (c == '\u2021')
			i = (byte) -121;
		else if (c == '\u02c6')
			i = (byte) -120;
		else if (c == '\u2030')
			i = (byte) -119;
		else if ('\u0160' == c)
			i = (byte) -118;
		else if ('\u2039' == c)
			i = (byte) -117;
		else if (c == '\u0152')
			i = (byte) -116;
		else if (c == '\u017d')
			i = (byte) -114;
		else if (c == '\u2018')
			i = (byte) -111;
		else if (c == '\u2019')
			i = (byte) -110;
		else if (c == '\u201c')
			i = (byte) -109;
		else if (c == '\u201d')
			i = (byte) -108;
		else if ('\u2022' == c)
			i = (byte) -107;
		else if ('\u2013' == c)
			i = (byte) -106;
		else if (c == '\u2014')
			i = (byte) -105;
		else if ('\u02dc' == c)
			i = (byte) -104;
		else if (c == '\u2122')
			i = (byte) -103;
		else if ('\u0161' == c)
			i = (byte) -102;
		else if ('\u203a' == c)
			i = (byte) -101;
		else if ('\u0153' == c)
			i = (byte) -100;
		else if (c == '\u017e')
			i = (byte) -98;
		else if (c == '\u0178')
			i = (byte) -97;
		else
			i = (byte) 63;
		return i;
	}

	public static boolean method13627(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8526;
			for (int i = 0; i < cs.length; i++) {
				char c_1_ = cs[i];
				if (c_1_ == c)
					return true;
			}
		}
		return false;
	}

	Class664() throws Throwable {
		throw new Error();
	}

	public static byte[] method13628(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			char c = charsequence.charAt(i_2_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_2_] = (byte) c;
			else if (c == '\u20ac')
				is[i_2_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_2_] = (byte) -126;
			else if (c == '\u0192')
				is[i_2_] = (byte) -125;
			else if (c == '\u201e')
				is[i_2_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_2_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_2_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_2_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_2_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_2_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_2_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_2_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_2_] = (byte) -116;
			else if (c == '\u017d')
				is[i_2_] = (byte) -114;
			else if (c == '\u2018')
				is[i_2_] = (byte) -111;
			else if (c == '\u2019')
				is[i_2_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_2_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_2_] = (byte) -108;
			else if (c == '\u2022')
				is[i_2_] = (byte) -107;
			else if (c == '\u2013')
				is[i_2_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_2_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_2_] = (byte) -104;
			else if (c == '\u2122')
				is[i_2_] = (byte) -103;
			else if (c == '\u0161')
				is[i_2_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_2_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_2_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_2_] = (byte) -98;
			else if (c == '\u0178')
				is[i_2_] = (byte) -97;
			else
				is[i_2_] = (byte) 63;
		}
		return is;
	}

	public static int method13629(CharSequence charsequence, int i, int i_3_, byte[] is, int i_4_) {
		int i_5_ = i_3_ - i;
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			char c = charsequence.charAt(i + i_6_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_4_ + i_6_] = (byte) c;
			else if (c == '\u20ac')
				is[i_4_ + i_6_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_4_ + i_6_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_6_ + i_4_] = (byte) -125;
			else if (c == '\u201e')
				is[i_6_ + i_4_] = (byte) -124;
			else if (c == '\u2026')
				is[i_4_ + i_6_] = (byte) -123;
			else if (c == '\u2020')
				is[i_6_ + i_4_] = (byte) -122;
			else if (c == '\u2021')
				is[i_6_ + i_4_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_6_ + i_4_] = (byte) -120;
			else if (c == '\u2030')
				is[i_6_ + i_4_] = (byte) -119;
			else if (c == '\u0160')
				is[i_4_ + i_6_] = (byte) -118;
			else if (c == '\u2039')
				is[i_4_ + i_6_] = (byte) -117;
			else if (c == '\u0152')
				is[i_6_ + i_4_] = (byte) -116;
			else if (c == '\u017d')
				is[i_6_ + i_4_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_4_ + i_6_] = (byte) -111;
			else if (c == '\u2019')
				is[i_4_ + i_6_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_4_ + i_6_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_4_ + i_6_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_4_ + i_6_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_6_ + i_4_] = (byte) -106;
			else if (c == '\u2014')
				is[i_6_ + i_4_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_6_ + i_4_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_6_ + i_4_] = (byte) -103;
			else if (c == '\u0161')
				is[i_4_ + i_6_] = (byte) -102;
			else if (c == '\u203a')
				is[i_4_ + i_6_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_6_ + i_4_] = (byte) -100;
			else if (c == '\u017e')
				is[i_6_ + i_4_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_4_ + i_6_] = (byte) -97;
			else
				is[i_6_ + i_4_] = (byte) 63;
		}
		return i_5_;
	}

	public static boolean method13630(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8526;
			for (int i = 0; i < cs.length; i++) {
				char c_7_ = cs[i];
				if (c_7_ == c)
					return true;
			}
		}
		return false;
	}

	public static char method13631(byte i) {
		int i_8_ = i & 0xff;
		if (0 == i_8_)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_8_, 16)).toString());
		if (i_8_ >= 128 && i_8_ < 160) {
			int i_9_ = aCharArray8526[i_8_ - 128];
			if (0 == i_9_)
				i_9_ = 63;
			i_8_ = i_9_;
		}
		return (char) i_8_;
	}

	public static int method13632(CharSequence charsequence, int i, int i_10_, byte[] is, int i_11_) {
		int i_12_ = i_10_ - i;
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			char c = charsequence.charAt(i + i_13_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_11_ + i_13_] = (byte) c;
			else if (c == '\u20ac')
				is[i_11_ + i_13_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_11_ + i_13_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_13_ + i_11_] = (byte) -125;
			else if (c == '\u201e')
				is[i_13_ + i_11_] = (byte) -124;
			else if (c == '\u2026')
				is[i_11_ + i_13_] = (byte) -123;
			else if (c == '\u2020')
				is[i_13_ + i_11_] = (byte) -122;
			else if (c == '\u2021')
				is[i_13_ + i_11_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_13_ + i_11_] = (byte) -120;
			else if (c == '\u2030')
				is[i_13_ + i_11_] = (byte) -119;
			else if (c == '\u0160')
				is[i_11_ + i_13_] = (byte) -118;
			else if (c == '\u2039')
				is[i_11_ + i_13_] = (byte) -117;
			else if (c == '\u0152')
				is[i_13_ + i_11_] = (byte) -116;
			else if (c == '\u017d')
				is[i_13_ + i_11_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_11_ + i_13_] = (byte) -111;
			else if (c == '\u2019')
				is[i_11_ + i_13_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_11_ + i_13_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_11_ + i_13_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_11_ + i_13_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_13_ + i_11_] = (byte) -106;
			else if (c == '\u2014')
				is[i_13_ + i_11_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_13_ + i_11_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_13_ + i_11_] = (byte) -103;
			else if (c == '\u0161')
				is[i_11_ + i_13_] = (byte) -102;
			else if (c == '\u203a')
				is[i_11_ + i_13_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_13_ + i_11_] = (byte) -100;
			else if (c == '\u017e')
				is[i_13_ + i_11_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_11_ + i_13_] = (byte) -97;
			else
				is[i_13_ + i_11_] = (byte) 63;
		}
		return i_12_;
	}

	public static boolean method13633(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8526;
			for (int i = 0; i < cs.length; i++) {
				char c_14_ = cs[i];
				if (c_14_ == c)
					return true;
			}
		}
		return false;
	}

	public static byte method13634(char c) {
		byte i;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i = (byte) c;
		else if ('\u20ac' == c)
			i = (byte) -128;
		else if ('\u201a' == c)
			i = (byte) -126;
		else if (c == '\u0192')
			i = (byte) -125;
		else if (c == '\u201e')
			i = (byte) -124;
		else if ('\u2026' == c)
			i = (byte) -123;
		else if (c == '\u2020')
			i = (byte) -122;
		else if (c == '\u2021')
			i = (byte) -121;
		else if (c == '\u02c6')
			i = (byte) -120;
		else if (c == '\u2030')
			i = (byte) -119;
		else if ('\u0160' == c)
			i = (byte) -118;
		else if ('\u2039' == c)
			i = (byte) -117;
		else if (c == '\u0152')
			i = (byte) -116;
		else if (c == '\u017d')
			i = (byte) -114;
		else if (c == '\u2018')
			i = (byte) -111;
		else if (c == '\u2019')
			i = (byte) -110;
		else if (c == '\u201c')
			i = (byte) -109;
		else if (c == '\u201d')
			i = (byte) -108;
		else if ('\u2022' == c)
			i = (byte) -107;
		else if ('\u2013' == c)
			i = (byte) -106;
		else if (c == '\u2014')
			i = (byte) -105;
		else if ('\u02dc' == c)
			i = (byte) -104;
		else if (c == '\u2122')
			i = (byte) -103;
		else if ('\u0161' == c)
			i = (byte) -102;
		else if ('\u203a' == c)
			i = (byte) -101;
		else if ('\u0153' == c)
			i = (byte) -100;
		else if (c == '\u017e')
			i = (byte) -98;
		else if (c == '\u0178')
			i = (byte) -97;
		else
			i = (byte) 63;
		return i;
	}

	public static int method13635(CharSequence charsequence, int i, int i_15_, byte[] is, int i_16_) {
		int i_17_ = i_15_ - i;
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			char c = charsequence.charAt(i + i_18_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_16_ + i_18_] = (byte) c;
			else if (c == '\u20ac')
				is[i_16_ + i_18_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_16_ + i_18_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_18_ + i_16_] = (byte) -125;
			else if (c == '\u201e')
				is[i_18_ + i_16_] = (byte) -124;
			else if (c == '\u2026')
				is[i_16_ + i_18_] = (byte) -123;
			else if (c == '\u2020')
				is[i_18_ + i_16_] = (byte) -122;
			else if (c == '\u2021')
				is[i_18_ + i_16_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_18_ + i_16_] = (byte) -120;
			else if (c == '\u2030')
				is[i_18_ + i_16_] = (byte) -119;
			else if (c == '\u0160')
				is[i_16_ + i_18_] = (byte) -118;
			else if (c == '\u2039')
				is[i_16_ + i_18_] = (byte) -117;
			else if (c == '\u0152')
				is[i_18_ + i_16_] = (byte) -116;
			else if (c == '\u017d')
				is[i_18_ + i_16_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_16_ + i_18_] = (byte) -111;
			else if (c == '\u2019')
				is[i_16_ + i_18_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_16_ + i_18_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_16_ + i_18_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_16_ + i_18_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_18_ + i_16_] = (byte) -106;
			else if (c == '\u2014')
				is[i_18_ + i_16_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_18_ + i_16_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_18_ + i_16_] = (byte) -103;
			else if (c == '\u0161')
				is[i_16_ + i_18_] = (byte) -102;
			else if (c == '\u203a')
				is[i_16_ + i_18_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_18_ + i_16_] = (byte) -100;
			else if (c == '\u017e')
				is[i_18_ + i_16_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_16_ + i_18_] = (byte) -97;
			else
				is[i_18_ + i_16_] = (byte) 63;
		}
		return i_17_;
	}

	public static int method13636(CharSequence charsequence, int i, int i_19_, byte[] is, int i_20_) {
		int i_21_ = i_19_ - i;
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			char c = charsequence.charAt(i + i_22_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_20_ + i_22_] = (byte) c;
			else if (c == '\u20ac')
				is[i_20_ + i_22_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_20_ + i_22_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_22_ + i_20_] = (byte) -125;
			else if (c == '\u201e')
				is[i_22_ + i_20_] = (byte) -124;
			else if (c == '\u2026')
				is[i_20_ + i_22_] = (byte) -123;
			else if (c == '\u2020')
				is[i_22_ + i_20_] = (byte) -122;
			else if (c == '\u2021')
				is[i_22_ + i_20_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_22_ + i_20_] = (byte) -120;
			else if (c == '\u2030')
				is[i_22_ + i_20_] = (byte) -119;
			else if (c == '\u0160')
				is[i_20_ + i_22_] = (byte) -118;
			else if (c == '\u2039')
				is[i_20_ + i_22_] = (byte) -117;
			else if (c == '\u0152')
				is[i_22_ + i_20_] = (byte) -116;
			else if (c == '\u017d')
				is[i_22_ + i_20_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_20_ + i_22_] = (byte) -111;
			else if (c == '\u2019')
				is[i_20_ + i_22_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_20_ + i_22_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_20_ + i_22_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_20_ + i_22_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_22_ + i_20_] = (byte) -106;
			else if (c == '\u2014')
				is[i_22_ + i_20_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_22_ + i_20_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_22_ + i_20_] = (byte) -103;
			else if (c == '\u0161')
				is[i_20_ + i_22_] = (byte) -102;
			else if (c == '\u203a')
				is[i_20_ + i_22_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_22_ + i_20_] = (byte) -100;
			else if (c == '\u017e')
				is[i_22_ + i_20_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_20_ + i_22_] = (byte) -97;
			else
				is[i_22_ + i_20_] = (byte) 63;
		}
		return i_21_;
	}

	public static String method13637(byte[] is) {
		return Class651.method10636(is, 0, is.length, -1210151419);
	}

	public static String method13638(byte[] is, int i, int i_23_) {
		char[] cs = new char[i_23_];
		int i_24_ = 0;
		for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
			int i_26_ = is[i_25_ + i] & 0xff;
			if (i_26_ != 0) {
				if (i_26_ >= 128 && i_26_ < 160) {
					int i_27_ = aCharArray8526[i_26_ - 128];
					if (i_27_ == 0)
						i_27_ = 63;
					i_26_ = i_27_;
				}
				cs[i_24_++] = (char) i_26_;
			}
		}
		return new String(cs, 0, i_24_);
	}

	static boolean method13639(int i, int i_28_) {
		return i == 7 || i == 14 || i == 10 || 6 == i || 5 == i;
	}

	public static int method13640(int i, int i_29_, boolean bool, int i_30_) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1995613626);
		if (class523_sub1 == null)
			return 0;
		if (i_29_ == -1)
			return 0;
		int i_31_ = 0;
		for (int i_32_ = 0; i_32_ < class523_sub1.itemAmounts.length; i_32_++) {
			if (i_29_ == class523_sub1.itemIds[i_32_])
				i_31_ += class523_sub1.itemAmounts[i_32_];
		}
		return i_31_;
	}

	static final void method13641(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		if (class669.anIntArray8557[1357652815 * class669.anInt8558] > class669.anIntArray8557[1 + 1357652815 * class669.anInt8558])
			class669.anInt8579 += (class669.anIntArray8577[class669.anInt8579 * 1180759405] * -1774429083);
	}
}
