/* Class681 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class681 {
	static Class681 aClass681_8640;
	public static Class681 aClass681_8641;
	static Class681 aClass681_8642;
	static Class681 aClass681_8643;
	static Class681 aClass681_8644;
	public String aString8645;
	public static Class681 aClass681_8646 = new Class681("runescape", "RuneScape", 0, Class73.aClass73_801);
	public String aString8647;
	public int anInt8648;
	static Class10 aClass10_8649;

	static {
		aClass681_8641 = new Class681("stellardawn", "Stellar Dawn", 1, Class73.aClass73_811);
		aClass681_8642 = new Class681("game3", "Game 3", 2, Class73.aClass73_801);
		aClass681_8643 = new Class681("game4", "Game 4", 3, Class73.aClass73_803);
		aClass681_8644 = new Class681("game5", "Game 5", 4, Class73.aClass73_800);
		aClass681_8640 = new Class681("oldscape", "RuneScape 2007", 5, Class73.aClass73_801);
	}

	static Class681[] method13842() {
		return (new Class681[] { aClass681_8646, aClass681_8642, aClass681_8641, aClass681_8643, aClass681_8640, aClass681_8644 });
	}

	static Class681[] method13843() {
		return (new Class681[] { aClass681_8646, aClass681_8642, aClass681_8641, aClass681_8643, aClass681_8640, aClass681_8644 });
	}

	public static Class681 method13844(int i) {
		Class681[] class681s = Class411.method6638(-58169461);
		for (int i_0_ = 0; i_0_ < class681s.length; i_0_++) {
			Class681 class681 = class681s[i_0_];
			if (i == class681.anInt8648 * 1884825957)
				return class681;
		}
		return null;
	}

	Class681(String string, String string_1_, int i, Class73 class73) {
		aString8645 = string;
		aString8647 = string_1_;
		anInt8648 = i * -395911059;
	}

	public static Class681 method13845(int i) {
		Class681[] class681s = Class411.method6638(-1681172165);
		for (int i_2_ = 0; i_2_ < class681s.length; i_2_++) {
			Class681 class681 = class681s[i_2_];
			if (i == class681.anInt8648 * 1884825957)
				return class681;
		}
		return null;
	}

	static final void method13846(Class250 class250, Class242 class242, Class669 class669, int i) {
		class250.anInt2562 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 2143580911;
		Class523_Sub14.method15991(class250, (byte) -50);
	}

	static final void method13847(byte i, byte i_3_) {
		byte[][][] is = client.aClass505_11019.method8247(-236796143);
		if (null == is) {
			is = (new byte[4][client.aClass505_11019.method8292((byte) 71)][client.aClass505_11019.method8235(2128458648)]);
			client.aClass505_11019.method8248(is, 1115441305);
		}
		for (int i_4_ = 0; i_4_ < 4; i_4_++) {
			for (int i_5_ = 0; i_5_ < client.aClass505_11019.method8292((byte) 43); i_5_++) {
				for (int i_6_ = 0; i_6_ < client.aClass505_11019.method8235(2076675520); i_6_++)
					is[i_4_][i_5_][i_6_] = i;
			}
		}
	}
}
