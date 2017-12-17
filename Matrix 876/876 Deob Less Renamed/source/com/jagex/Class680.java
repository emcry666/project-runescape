/* Class680 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.Map;

public class Class680 {
	Class680() throws Throwable {
		throw new Error();
	}

	static int method13828(char c, Class668 class668) {
		int i = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i = 1 + (c << 4);
		}
		if (c == 241 && class668 == Class668.aClass668_8544)
			i = 1762;
		return i;
	}

	public static int method13829(CharSequence charsequence, CharSequence charsequence_0_, Class668 class668) {
		int i = charsequence.length();
		int i_1_ = charsequence_0_.length();
		int i_2_ = 0;
		int i_3_ = 0;
		char c = '\0';
		char c_4_ = '\0';
		while (i_2_ - c < i || i_3_ - c_4_ < i_1_) {
			if (i_2_ - c >= i)
				return -1;
			if (i_3_ - c_4_ >= i_1_)
				return 1;
			char c_5_;
			if (c != 0) {
				c_5_ = c;
				boolean bool = false;
			} else
				c_5_ = charsequence.charAt(i_2_++);
			char c_6_;
			if (0 != c_4_) {
				c_6_ = c_4_;
				boolean bool = false;
			} else
				c_6_ = charsequence_0_.charAt(i_3_++);
			c = Class687_Sub9.method16825(c_5_, 836590747);
			c_4_ = Class687_Sub9.method16825(c_6_, 836590747);
			c_5_ = Class380.method6404(c_5_, class668, -2143221965);
			c_6_ = Class380.method6404(c_6_, class668, -1990520828);
			if (c_5_ != c_6_ && (Character.toUpperCase(c_5_) != Character.toUpperCase(c_6_))) {
				c_5_ = Character.toLowerCase(c_5_);
				c_6_ = Character.toLowerCase(c_6_);
				if (c_5_ != c_6_)
					return (Class654.method10717(c_5_, class668, -1600048693) - Class654.method10717(c_6_, class668, -1712936606));
			}
		}
		int i_7_ = Math.min(i, i_1_);
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (class668 == Class668.aClass668_8550) {
				i_2_ = i - 1 - i_8_;
				i_3_ = i_1_ - 1 - i_8_;
			} else
				i_2_ = i_3_ = i_8_;
			char c_9_ = charsequence.charAt(i_2_);
			char c_10_ = charsequence_0_.charAt(i_3_);
			if (c_10_ != c_9_ && (Character.toUpperCase(c_9_) != Character.toUpperCase(c_10_))) {
				c_9_ = Character.toLowerCase(c_9_);
				c_10_ = Character.toLowerCase(c_10_);
				if (c_9_ != c_10_)
					return (Class654.method10717(c_9_, class668, -546425573) - Class654.method10717(c_10_, class668, -532659559));
			}
		}
		int i_11_ = i - i_1_;
		if (0 != i_11_)
			return i_11_;
		for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
			char c_13_ = charsequence.charAt(i_12_);
			char c_14_ = charsequence_0_.charAt(i_12_);
			if (c_13_ != c_14_)
				return (Class654.method10717(c_13_, class668, -892300920) - Class654.method10717(c_14_, class668, -2108280440));
		}
		return 0;
	}

	static char method13830(char c, Class668 class668) {
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

	static char method13831(char c, Class668 class668) {
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

	static char method13832(char c, Class668 class668) {
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

	static char method13833(char c, Class668 class668) {
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

	static char method13834(char c, Class668 class668) {
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

	static char method13835(char c, Class668 class668) {
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

	static int method13836(char c, Class668 class668) {
		int i = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i = 1 + (c << 4);
		}
		if (c == 241 && class668 == Class668.aClass668_8544)
			i = 1762;
		return i;
	}

	static int method13837(char c, Class668 class668) {
		int i = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i = 1 + (c << 4);
		}
		if (c == 241 && class668 == Class668.aClass668_8544)
			i = 1762;
		return i;
	}

	public static int method13838(CharSequence charsequence, CharSequence charsequence_15_, Class668 class668) {
		int i = charsequence.length();
		int i_16_ = charsequence_15_.length();
		int i_17_ = 0;
		int i_18_ = 0;
		char c = '\0';
		char c_19_ = '\0';
		while (i_17_ - c < i || i_18_ - c_19_ < i_16_) {
			if (i_17_ - c >= i)
				return -1;
			if (i_18_ - c_19_ >= i_16_)
				return 1;
			char c_20_;
			if (c != 0) {
				c_20_ = c;
				boolean bool = false;
			} else
				c_20_ = charsequence.charAt(i_17_++);
			char c_21_;
			if (0 != c_19_) {
				c_21_ = c_19_;
				boolean bool = false;
			} else
				c_21_ = charsequence_15_.charAt(i_18_++);
			c = Class687_Sub9.method16825(c_20_, 836590747);
			c_19_ = Class687_Sub9.method16825(c_21_, 836590747);
			c_20_ = Class380.method6404(c_20_, class668, -2042454200);
			c_21_ = Class380.method6404(c_21_, class668, -1926774720);
			if (c_20_ != c_21_ && (Character.toUpperCase(c_20_) != Character.toUpperCase(c_21_))) {
				c_20_ = Character.toLowerCase(c_20_);
				c_21_ = Character.toLowerCase(c_21_);
				if (c_20_ != c_21_)
					return (Class654.method10717(c_20_, class668, -1799235084) - Class654.method10717(c_21_, class668, -1449748994));
			}
		}
		int i_22_ = Math.min(i, i_16_);
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
			if (class668 == Class668.aClass668_8550) {
				i_17_ = i - 1 - i_23_;
				i_18_ = i_16_ - 1 - i_23_;
			} else
				i_17_ = i_18_ = i_23_;
			char c_24_ = charsequence.charAt(i_17_);
			char c_25_ = charsequence_15_.charAt(i_18_);
			if (c_25_ != c_24_ && (Character.toUpperCase(c_24_) != Character.toUpperCase(c_25_))) {
				c_24_ = Character.toLowerCase(c_24_);
				c_25_ = Character.toLowerCase(c_25_);
				if (c_24_ != c_25_)
					return (Class654.method10717(c_24_, class668, -1074791931) - Class654.method10717(c_25_, class668, -427659827));
			}
		}
		int i_26_ = i - i_16_;
		if (0 != i_26_)
			return i_26_;
		for (int i_27_ = 0; i_27_ < i_22_; i_27_++) {
			char c_28_ = charsequence.charAt(i_27_);
			char c_29_ = charsequence_15_.charAt(i_27_);
			if (c_28_ != c_29_)
				return (Class654.method10717(c_28_, class668, -624515879) - Class654.method10717(c_29_, class668, -1930914431));
		}
		return 0;
	}

	static int method13839(char c, Class668 class668) {
		int i = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i = 1 + (c << 4);
		}
		if (c == 241 && class668 == Class668.aClass668_8544)
			i = 1762;
		return i;
	}

	public static String method13840(long l, int i, boolean bool, Class668 class668) {
		char c = ',';
		char c_30_ = '.';
		if (class668 == Class668.aClass668_8548) {
			c = '.';
			c_30_ = ',';
		}
		if (class668 == Class668.aClass668_8550)
			c_30_ = '\u00a0';
		boolean bool_31_ = false;
		if (l < 0L) {
			bool_31_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_32_ = 0; i_32_ < i; i_32_++) {
				int i_33_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_33_ - (int) l * 10));
			}
			stringbuilder.append(c);
		}
		int i_34_ = 0;
		for (;;) {
			int i_35_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (48 + i_35_ - (int) l * 10));
			if (0L == l)
				break;
			if (bool) {
				i_34_++;
				if (0 == i_34_ % 3)
					stringbuilder.append(c_30_);
			}
		}
		if (bool_31_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	static final void method13841(int i, int i_36_, byte i_37_) {
		if (Class534_Sub1.aFloat7154 < Class534_Sub1.aFloat7155) {
			Class534_Sub1.aFloat7154 += (double) Class534_Sub1.aFloat7154 / 30.0;
			if (Class534_Sub1.aFloat7154 > Class534_Sub1.aFloat7155)
				Class534_Sub1.aFloat7154 = Class534_Sub1.aFloat7155;
			Archive.method1233((byte) -16);
			Class534_Sub1.anInt7151 = (int) Class534_Sub1.aFloat7155 >> 1;
			Class534_Sub1.aByteArrayArrayArray7137 = Class306.method5555(Class534_Sub1.anInt7151, (byte) 99);
		} else if (Class534_Sub1.aFloat7154 > Class534_Sub1.aFloat7155) {
			Class534_Sub1.aFloat7154 -= (double) Class534_Sub1.aFloat7154 / 30.0;
			if (Class534_Sub1.aFloat7154 < Class534_Sub1.aFloat7155)
				Class534_Sub1.aFloat7154 = Class534_Sub1.aFloat7155;
			Archive.method1233((byte) -9);
			Class534_Sub1.anInt7151 = (int) Class534_Sub1.aFloat7155 >> 1;
			Class534_Sub1.aByteArrayArrayArray7137 = Class306.method5555(Class534_Sub1.anInt7151, (byte) 57);
		}
		if (Class534_Sub1.anInt10780 * -135702413 != -1 && -1 != -216990907 * Class534_Sub1.anInt10779) {
			int i_38_ = (Class534_Sub1.anInt10780 * -135702413 - Class575.anInt7691 * 158908775);
			if (0 != i_38_)
				i_38_ /= Math.min(1179843315 * Class534_Sub1.anInt10791, Math.abs(i_38_));
			int i_39_ = (Class534_Sub1.anInt10779 * -216990907 - -217599855 * Class597.anInt7835);
			if (i_39_ != 0)
				i_39_ /= Math.min(Class534_Sub1.anInt10791 * 1179843315, Math.abs(i_39_));
			Class575.anInt7691 = 367905367 * (i_38_ + 158908775 * Class575.anInt7691);
			Class597.anInt7835 = -1099820943 * (Class597.anInt7835 * -217599855 + i_39_);
			if (0 == i_38_ && 0 == i_39_) {
				Class534_Sub1.anInt10780 = -1195183291;
				Class534_Sub1.anInt10779 = -465264525;
			}
			Archive.method1233((byte) -48);
		}
		Iterator iterator = Class534_Sub1.aHashMap10786.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt245 -= -779275383;
			if (2071802553 * class25.anInt245 == 0) {
				if (class25.anInt246 * 97491391 <= 1 && !Class534_Sub1.aBool10790)
					iterator.remove();
				else {
					class25.anInt246 -= -1099082177;
					class25.anInt245 = Class534_Sub1.anInt10789 * -2045175827;
				}
			}
		}
		iterator = Class534_Sub1.aHashMap10787.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt245 -= -779275383;
			if (0 == 2071802553 * class25.anInt245) {
				if (97491391 * class25.anInt246 <= 1 && !Class534_Sub1.aBool10790)
					iterator.remove();
				else {
					class25.anInt246 -= -1099082177;
					class25.anInt245 = -2045175827 * Class534_Sub1.anInt10789;
				}
			}
		}
		if (Class534_Sub1.aBool10796 && null != Class629.aClass708_8229) {
			for (Class523_Sub16 class523_sub16 = ((Class523_Sub16) Class629.aClass708_8229.method14240(1750660412)); null != class523_sub16; class523_sub16 = ((Class523_Sub16) Class629.aClass708_8229.method14244((byte) 85))) {
				Class239 class239 = ((Class239) (Class534_Sub1.aClass53_Sub1_7206.getDefinition((class523_sub16.aClass523_Sub32_10472.anInt10578 * -1039292053), (byte) -8)));
				if (class523_sub16.method15994(i, i_36_, 1988381287)) {
					if (class239.aStringArray2418 != null) {
						if (null != class239.aStringArray2418[4])
							Class463.method7523(class239.aStringArray2418[4], class239.aString2415, -1, 1012, -1, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), (class239.anInt2443 * 1444609703), 0, true, false, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), false, (byte) -27);
						if (class239.aStringArray2418[3] != null)
							Class463.method7523(class239.aStringArray2418[3], class239.aString2415, -1, 1011, -1, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), (1444609703 * class239.anInt2443), 0, true, false, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), false, (byte) -83);
						if (class239.aStringArray2418[2] != null)
							Class463.method7523(class239.aStringArray2418[2], class239.aString2415, -1, 1010, -1, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), class239.anInt2443 * 1444609703, 0, true, false, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), false, (byte) 50);
						if (class239.aStringArray2418[1] != null)
							Class463.method7523(class239.aStringArray2418[1], class239.aString2415, -1, 1009, -1, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), class239.anInt2443 * 1444609703, 0, true, false, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), false, (byte) -26);
						if (null != class239.aStringArray2418[0])
							Class463.method7523(class239.aStringArray2418[0], class239.aString2415, -1, 1008, -1, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), class239.anInt2443 * 1444609703, 0, true, false, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), false, (byte) 38);
					}
					if (!class523_sub16.aClass523_Sub32_10472.aBool10582) {
						class523_sub16.aClass523_Sub32_10472.aBool10582 = true;
						Class486.method7941(Class572.aClass572_7666, (class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053, 1444609703 * class239.anInt2443, -886052652);
					}
					if (class523_sub16.aClass523_Sub32_10472.aBool10582)
						Class486.method7941(Class572.aClass572_7677, (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), class239.anInt2443 * 1444609703, -886052652);
				} else if (class523_sub16.aClass523_Sub32_10472.aBool10582) {
					class523_sub16.aClass523_Sub32_10472.aBool10582 = false;
					Class486.method7941(Class572.aClass572_7669, (class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053, 1444609703 * class239.anInt2443, -886052652);
				}
			}
		}
	}
}
