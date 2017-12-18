/* Class672 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class672 {
	static long[] aLongArray8606;
	static char[] aCharArray8607 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	static long method13717(CharSequence charsequence) {
		long l = 0L;
		int i = charsequence.length();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			l *= 37L;
			char c = charsequence.charAt(i_0_);
			if (c >= 'A' && c <= 'Z')
				l += (long) (c + '\001' - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) ('\001' + c - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) ('\033' + c - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
			/* empty */
		}
		return l;
	}

	static {
		aLongArray8606 = new long[12];
		for (int i = 0; i < aLongArray8606.length; i++)
			aLongArray8606[i] = (long) Math.pow(37.0, (double) i);
	}

	static long method13718(CharSequence charsequence) {
		long l = 0L;
		int i = charsequence.length();
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			l *= 37L;
			char c = charsequence.charAt(i_1_);
			if (c >= 'A' && c <= 'Z')
				l += (long) (c + '\001' - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) ('\001' + c - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) ('\033' + c - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
			/* empty */
		}
		return l;
	}

	static String method13719(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_2_ = l; l_2_ != 0L; l_2_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_3_ = l;
			l /= 37L;
			char c = aCharArray8607[(int) (l_3_ - 37L * l)];
			if (c == '_') {
				int i_4_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_4_, Character.toUpperCase(stringbuilder.charAt(i_4_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	Class672() throws Throwable {
		throw new Error();
	}

	static String method13720(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_5_ = l; l_5_ != 0L; l_5_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_6_ = l;
			l /= 37L;
			char c = aCharArray8607[(int) (l_6_ - 37L * l)];
			if (c == '_') {
				int i_7_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_7_, Character.toUpperCase(stringbuilder.charAt(i_7_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static String method13721(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_8_ = l; l_8_ != 0L; l_8_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_9_ = l;
			l /= 37L;
			char c = aCharArray8607[(int) (l_9_ - 37L * l)];
			if (c == '_') {
				int i_10_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_10_, Character.toUpperCase(stringbuilder.charAt(i_10_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	public static String method13722(CharSequence charsequence) {
		String string = Class480.method7899(Class324.method5732(charsequence, (byte) 0));
		if (null == string)
			string = "";
		return string;
	}

	public static String method13723(CharSequence charsequence) {
		String string = Class480.method7899(Class324.method5732(charsequence, (byte) 0));
		if (null == string)
			string = "";
		return string;
	}

	static final void method13724(byte i) {
		for (int i_11_ = Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9754(true, (byte) -90); -1 != i_11_; i_11_ = Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9754(false, (byte) -91)) {
			Class488.method7953(i_11_, (byte) 46);
			client.anIntArray11217[(client.anInt11272 += -713333645) * -1478238021 - 1 & 0x3f] = i_11_;
		}
		for (Class523_Sub27_Sub7 class523_sub27_sub7 = Class174.method2939((byte) -98); class523_sub27_sub7 != null; class523_sub27_sub7 = Class174.method2939((byte) -125)) {
			int i_12_ = class523_sub27_sub7.method17964(-93013358);
			long l = class523_sub27_sub7.method17965((byte) 4);
			if (1 == i_12_) {
				Class159 class159 = ((Class159) Class114.aClass98_Sub1_Sub2_1405.getDefinition((int) l, (byte) -79));
				Class423.clientConfigsDomain.method112(class159, ((class523_sub27_sub7.anInt11653) * 1313066817), (byte) -75);
				client.anIntArray11223[((client.anInt11306 += -2062376547) * -1207702347) - 1 & 0x3f] = (int) l;
			} else if (2 == i_12_) {
				Class159 class159 = ((Class159) Class114.aClass98_Sub1_Sub2_1405.getDefinition((int) l, (byte) -60));
				Class423.clientConfigsDomain.method116(class159, (class523_sub27_sub7.aString11650), -1385113973);
				client.anIntArray11023[(client.anInt11295 += -1437829165) * 825227355 - 1 & 0x3f] = (int) l;
			} else if (i_12_ == 3) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1971768723);
				if (!class523_sub27_sub7.aString11650.equals(class250.aString2607)) {
					class250.aString2607 = class523_sub27_sub7.aString11650;
					Login.method15991(class250, (byte) -120);
				}
			} else if (23 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -779142031);
				if ((class523_sub27_sub7.anInt11653 * 1313066817 == 1) != class250.aBool2613) {
					class250.aBool2613 = 1 == class523_sub27_sub7.anInt11653 * 1313066817;
					Login.method15991(class250, (byte) -96);
				}
			} else if (4 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1838271413);
				int i_13_ = 1313066817 * class523_sub27_sub7.anInt11653;
				int i_14_ = -2058422725 * class523_sub27_sub7.anInt11649;
				int i_15_ = -628044223 * class523_sub27_sub7.anInt11665;
				if (i_13_ != class250.modelType * -428962391 || class250.anInt2571 * -2080195333 != i_14_ || i_15_ != -1918195571 * class250.anInt2584) {
					class250.modelType = i_13_ * -182688103;
					class250.anInt2571 = i_14_ * 903474739;
					class250.anInt2584 = -1367647675 * i_15_;
					class250.aClass302_2553 = null;
					Login.method15991(class250, (byte) -86);
				}
			} else if (i_12_ == 5) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1081840847);
				if (class250.anInt2548 * -339807053 != 1313066817 * class523_sub27_sub7.anInt11653) {
					if (-1 != 1313066817 * class523_sub27_sub7.anInt11653) {
						if (class250.aClass707_2693 == null)
							class250.aClass707_2693 = new Class707_Sub3();
						class250.aClass707_2693.method14164(class523_sub27_sub7.anInt11653 * 1313066817, (byte) 12);
					} else
						class250.aClass707_2693 = null;
					class250.anInt2548 = -1229853125 * class523_sub27_sub7.anInt11653;
					Login.method15991(class250, (byte) -127);
				}
			} else if (6 == i_12_) {
				int i_16_ = 1313066817 * class523_sub27_sub7.anInt11653;
				int i_17_ = i_16_ >> 10 & 0x1f;
				int i_18_ = i_16_ >> 5 & 0x1f;
				int i_19_ = i_16_ & 0x1f;
				int i_20_ = (i_19_ << 3) + ((i_18_ << 11) + (i_17_ << 19));
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1721941983);
				if (-293786715 * class250.anInt2556 != i_20_) {
					class250.anInt2556 = i_20_ * 338805805;
					Login.method15991(class250, (byte) -33);
				}
			} else if (7 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1169035150);
				boolean bool = class523_sub27_sub7.anInt11653 * 1313066817 == 1;
				if (class250.hidden != bool) {
					class250.hidden = bool;
					Login.method15991(class250, (byte) -73);
				}
			} else if (i_12_ == 8) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1153221746);
				if ((1313066817 * class523_sub27_sub7.anInt11653 != 175466669 * class250.anInt2563) || (-2058422725 * class523_sub27_sub7.anInt11649 != class250.anInt2577 * 1376491541) || (-628044223 * class523_sub27_sub7.anInt11665 != class250.anInt2544 * -1904547845)) {
					class250.anInt2563 = -451350683 * class523_sub27_sub7.anInt11653;
					class250.anInt2577 = -194307825 * class523_sub27_sub7.anInt11649;
					class250.anInt2544 = 60416499 * class523_sub27_sub7.anInt11665;
					if (-1 != class250.anInt2680 * -1878986101) {
						if (class250.anInt2583 * -15523801 > 0)
							class250.anInt2544 = 249826099 * (-815988896 * class250.anInt2544 / (class250.anInt2583 * -15523801));
						else if (class250.anInt2502 * -480866135 > 0)
							class250.anInt2544 = 249826099 * (class250.anInt2544 * -815988896 / (-480866135 * class250.anInt2502));
					}
					Login.method15991(class250, (byte) -124);
				}
			} else if (9 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -2020996534);
				if ((class523_sub27_sub7.anInt11653 * 1313066817 != class250.anInt2680 * -1878986101) || (class523_sub27_sub7.anInt11649 * -2058422725 != class250.anInt2681 * -1263698325)) {
					class250.anInt2680 = class523_sub27_sub7.anInt11653 * 1490287331;
					class250.anInt2681 = 816233329 * class523_sub27_sub7.anInt11649;
					Login.method15991(class250, (byte) -66);
				}
			} else if (i_12_ == 10) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -579484377);
				if ((1313066817 * class523_sub27_sub7.anInt11653 != 1419153773 * class250.anInt2523) || (-2058422725 * class523_sub27_sub7.anInt11649 != class250.anInt2501 * 2014714437) || (-628044223 * class523_sub27_sub7.anInt11665 != class250.anInt2578 * 533045263)) {
					class250.anInt2523 = class523_sub27_sub7.anInt11653 * -1314921307;
					class250.anInt2501 = class523_sub27_sub7.anInt11649 * -1742858625;
					class250.anInt2578 = class523_sub27_sub7.anInt11665 * 282942639;
					Login.method15991(class250, (byte) -2);
				}
			} else if (i_12_ == 11) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1327756525);
				class250.aByte2532 = (byte) 0;
				class250.anInt2540 = ((class250.anInt2574 = class523_sub27_sub7.anInt11653 * -1572060319) * 1444104899);
				class250.aByte2533 = (byte) 0;
				class250.anInt2541 = ((class250.anInt2507 = class523_sub27_sub7.anInt11649 * -622393831) * 266010423);
				Login.method15991(class250, (byte) -124);
			} else if (i_12_ == 12) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -604129951);
				int i_21_ = class523_sub27_sub7.anInt11653 * 1313066817;
				if (class250 != null && 0 == class250.type * 36473529) {
					if (i_21_ > (-222228463 * class250.anInt2618 - -1759297857 * class250.anInt2543))
						i_21_ = (-222228463 * class250.anInt2618 - -1759297857 * class250.anInt2543);
					if (i_21_ < 0)
						i_21_ = 0;
					if (i_21_ != -1013149031 * class250.anInt2539) {
						class250.anInt2539 = 144286121 * i_21_;
						Login.method15991(class250, (byte) -108);
					}
				}
			} else if (i_12_ == 13) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1181721474);
				class250.anInt2561 = class523_sub27_sub7.anInt11653 * 1984406649;
			} else if (i_12_ == 14) {
				Class104.aBool1265 = true;
				Class104.anInt1269 = class523_sub27_sub7.anInt11653 * 695327077;
				Class104.anInt1270 = -1940405191 * class523_sub27_sub7.anInt11649;
			} else if (15 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1197626255);
				class250.anInt2605 = class523_sub27_sub7.anInt11653 * 559325301;
			} else if (21 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1305176550);
				class250.aBool2606 = 1313066817 * class523_sub27_sub7.anInt11653 == 1;
			} else if (i_12_ == 22) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -1203457091);
				class250.aBool2569 = 1 == 1313066817 * class523_sub27_sub7.anInt11653;
			} else if (17 == i_12_) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -598338624);
				int i_22_ = (int) (l >> 32);
				class250.method4445(i_22_, (short) (1313066817 * class523_sub27_sub7.anInt11653), (short) (class523_sub27_sub7.anInt11649 * -2058422725), (byte) 9);
			} else if (i_12_ == 20) {
				InterfaceComponentDefinitions class250 = Class188.getDefinitions((int) l, -867204997);
				int i_23_ = (int) (l >> 32);
				class250.method4446(i_23_, (short) (1313066817 * class523_sub27_sub7.anInt11653), (short) (-2058422725 * class523_sub27_sub7.anInt11649), (byte) 46);
			}
		}
	}
}
