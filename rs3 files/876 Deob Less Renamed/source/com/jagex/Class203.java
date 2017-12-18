/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class203 implements Interface44 {
	Class217 this$0;

	public float method338(short i) {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10631.method16930(2126529954) / 255.0F);
	}

	public float method337() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10631.method16930(1828166537) / 255.0F);
	}

	public float method339() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10631.method16930(1817859204) / 255.0F);
	}

	public float method336() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10631.method16930(1999368815) / 255.0F);
	}

	Class203(Class217 class217) {
		this$0 = class217;
	}

	static void method3700(Class523_Sub34 class523_sub34, byte i) {
		int i_0_ = class523_sub34.readUnsignedSmart(368514876);
		Class595.aClass604Array7826 = new Class604[i_0_];
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			Class595.aClass604Array7826[i_1_] = new Class604();
			Class595.aClass604Array7826[i_1_].anInt7944 = class523_sub34.readUnsignedSmart(368514876) * -1193896107;
			Class595.aClass604Array7826[i_1_].aString7945 = class523_sub34.readVersionedString(2046316326);
		}
		Class687_Sub25.anInt10886 = class523_sub34.readUnsignedSmart(368514876) * -698494847;
		Class595.anInt7824 = class523_sub34.readUnsignedSmart(368514876) * -518080251;
		Class595.anInt7827 = class523_sub34.readUnsignedSmart(368514876) * 1533854069;
		Class595.aClass611_Sub1Array7823 = (new Class611_Sub1[1 + (Class595.anInt7824 * 615132109 - -2074972287 * Class687_Sub25.anInt10886)]);
		for (int i_2_ = 0; i_2_ < 2004567773 * Class595.anInt7827; i_2_++) {
			int i_3_ = class523_sub34.readUnsignedSmart(368514876);
			Class611_Sub1 class611_sub1 = Class595.aClass611_Sub1Array7823[i_3_] = new Class611_Sub1();
			class611_sub1.anInt8009 = class523_sub34.readUnsignedByte(498222332) * -1099577727;
			class611_sub1.anInt8010 = class523_sub34.readUnsignedInt((byte) -124) * -951605317;
			class611_sub1.anInt10589 = class523_sub34.readUnsignedSmart(368514876) * 1621165017;
			if (0 != class611_sub1.anInt10589 * 1907969129)
				class611_sub1.aString10590 = class523_sub34.readVersionedString(2087561251);
			class611_sub1.anInt10588 = -2018436871 * (i_3_ + -2074972287 * Class687_Sub25.anInt10886);
			class611_sub1.aString10587 = class523_sub34.readVersionedString(2029038948);
			class611_sub1.aString10586 = class523_sub34.readVersionedString(2045561718);
		}
		Class595.anInt7820 = class523_sub34.readUnsignedInt((byte) -27) * -1966253121;
		Class595.aBool7822 = true;
	}

	static final int method3701(int i, int i_4_) {
		return i < 7 ? 8 : 11;
	}

	static final void method3702(Class250 class250, byte[] is, byte[] is_5_, Class669 class669, byte i) {
		int i_6_ = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) - 1);
		if (i_6_ < 0 || i_6_ > 9)
			throw new RuntimeException();
		Class600.method9880(class250, i_6_, is, is_5_, class669, 1225032526);
	}

	static final void method3703(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_8_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class664.method13640(i_7_, i_8_, false, 558071459);
	}

	static final void method3704(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.playerVarsProvider.method1943(i_9_, (byte) 2);
	}

	static void method3705(Class250 class250, Class145 class145, int i, int i_10_, int i_11_, int i_12_, Class148 class148, int i_13_) {
		Class691.method13961(class250, class145, i, i_10_, i_11_, i_12_, class148, 100.0, Class275.aClass275_2900, Class273.aClass273_2888, (byte) -61);
	}
}
