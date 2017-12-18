/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class162 {
	public static Class444 aClass444_1770;
	static Class164 aClass164_1771;

	Class162() throws Throwable {
		throw new Error();
	}

	public static String method2580(String string) {
		int i = string.length();
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			char c = string.charAt(i_1_);
			if ('<' == c || c == '>')
				i_0_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_0_);
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			char c = string.charAt(i_2_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2581(String string) {
		int i = string.length();
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			char c = string.charAt(i_4_);
			if ('<' == c || c == '>')
				i_3_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_3_);
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			char c = string.charAt(i_5_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2582(String string) {
		int i = string.length();
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			char c = string.charAt(i_7_);
			if ('<' == c || c == '>')
				i_6_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_6_);
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			char c = string.charAt(i_8_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2583(String string) {
		int i = string.length();
		int i_9_ = 0;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			char c = string.charAt(i_10_);
			if ('<' == c || c == '>')
				i_9_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_9_);
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			char c = string.charAt(i_11_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2584(String string) {
		int i = string.length();
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			char c = string.charAt(i_13_);
			if ('<' == c || c == '>')
				i_12_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_12_);
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			char c = string.charAt(i_14_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2585(String string) {
		int i = string.length();
		int i_15_ = 0;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			char c = string.charAt(i_16_);
			if ('<' == c || c == '>')
				i_15_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_15_);
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			char c = string.charAt(i_17_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	public static String method2586(String string) {
		int i = string.length();
		int i_18_ = 0;
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			char c = string.charAt(i_19_);
			if ('<' == c || c == '>')
				i_18_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i + i_18_);
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			char c = string.charAt(i_20_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	static final void method2587(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1419153773 * class250.anInt2523;
	}

	static final void method2588(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub6_10620, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), -238223175);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1809657704);
		client.aBool11012 = false;
	}

	static void method2589(Class178 class178, int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -64);
		Interface61 interface61 = (Interface61) class560.method9280(i, i_21_, i_22_, -400821900);
		if (interface61 != null) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(2120593558).getDefinition(interface61.method401(-770473736), (byte) -63)));
			int i_28_ = interface61.method390(1259048815) & 0x3;
			int i_29_ = interface61.method69(1994654734);
			if (class602.anInt7890 * 573415481 != -1)
				NPCDefinition.method5515(class178, class602, i_28_, i_23_, i_24_, -2037150594);
			else {
				int i_30_ = i_25_;
				if (class602.anInt7874 * -344567467 > 0)
					i_30_ = i_26_;
				if (Class607.aClass607_7974.anInt7982 * 1923531495 == i_29_ || (i_29_ == Class607.aClass607_7965.anInt7982 * 1923531495)) {
					if (i_28_ == 0)
						class178.method3387(i_23_, i_24_, 4, i_30_, 159828926);
					else if (i_28_ == 1)
						class178.method3080(i_23_, i_24_, 4, i_30_, 371625053);
					else if (2 == i_28_)
						class178.method3387(i_23_ + 3, i_24_, 4, i_30_, 159828926);
					else if (3 == i_28_)
						class178.method3080(i_23_, i_24_ + 3, 4, i_30_, -53150582);
				}
				if (i_29_ == Class607.aClass607_7966.anInt7982 * 1923531495) {
					if (0 == i_28_)
						class178.method3354(i_23_, i_24_, 1, 1, i_30_, (byte) 15);
					else if (i_28_ == 1)
						class178.method3354(3 + i_23_, i_24_, 1, 1, i_30_, (byte) 5);
					else if (2 == i_28_)
						class178.method3354(3 + i_23_, i_24_ + 3, 1, 1, i_30_, (byte) 64);
					else if (3 == i_28_)
						class178.method3354(i_23_, 3 + i_24_, 1, 1, i_30_, (byte) 62);
				}
				if (i_29_ == 1923531495 * Class607.aClass607_7965.anInt7982) {
					if (i_28_ == 0)
						class178.method3080(i_23_, i_24_, 4, i_30_, -1132037321);
					else if (i_28_ == 1)
						class178.method3387(i_23_ + 3, i_24_, 4, i_30_, 159828926);
					else if (i_28_ == 2)
						class178.method3080(i_23_, i_24_ + 3, 4, i_30_, 373942365);
					else if (i_28_ == 3)
						class178.method3387(i_23_, i_24_, 4, i_30_, 159828926);
				}
			}
		}
		interface61 = (Interface61) class560.method9295(i, i_21_, i_22_, client.anInterface63_11296, (byte) -70);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(2011490061).getDefinition(interface61.method401(-770473736), (byte) -88)));
			int i_31_ = interface61.method390(1259048815) & 0x3;
			int i_32_ = interface61.method69(-219572821);
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_31_, i_23_, i_24_, -898085457);
			else if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_32_) {
				int i_33_ = -1118482;
				if (-344567467 * class602.anInt7874 > 0)
					i_33_ = -1179648;
				if (0 == i_31_ || 2 == i_31_)
					class178.method3381(i_23_, 3 + i_24_, i_23_ + 3, i_24_, i_33_, 182345644);
				else
					class178.method3381(i_23_, i_24_, i_23_ + 3, i_24_ + 3, i_33_, 1992223401);
			}
		}
		interface61 = (Interface61) class560.method9398(i, i_21_, i_22_, -1355148009);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(848250035).getDefinition(interface61.method401(-770473736), (byte) -64)));
			int i_34_ = interface61.method390(1259048815) & 0x3;
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_34_, i_23_, i_24_, -96408828);
		}
	}
}
