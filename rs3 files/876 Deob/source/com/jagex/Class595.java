/* Class595 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class595 {
	static final int anInt7819 = 1;
	public static int anInt7820;
	static final int anInt7821 = -1;
	static boolean aBool7822 = false;
	static Class611_Sub1[] aClass611_Sub1Array7823;
	public static int anInt7824;
	static final int anInt7825 = 2;
	static Class604[] aClass604Array7826;
	public static int anInt7827;

	public static Class611_Sub1 method9808(int i) {
		if (!aBool7822 || i < Class687_Sub25.anInt10886 * -2074972287 || i > anInt7824 * 615132109)
			return null;
		return (aClass611_Sub1Array7823[i - -2074972287 * Class687_Sub25.anInt10886]);
	}

	public static Class611_Sub1 method9809(int i) {
		if (!aBool7822 || i < Class687_Sub25.anInt10886 * -2074972287 || i > anInt7824 * 615132109)
			return null;
		return (aClass611_Sub1Array7823[i - -2074972287 * Class687_Sub25.anInt10886]);
	}

	Class595() throws Throwable {
		throw new Error();
	}

	static void method9810(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedSmart(368514876);
		aClass604Array7826 = new Class604[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			aClass604Array7826[i_0_] = new Class604();
			aClass604Array7826[i_0_].anInt7944 = class523_sub34.readUnsignedSmart(368514876) * -1193896107;
			aClass604Array7826[i_0_].aString7945 = class523_sub34.readVersionedString(2137000206);
		}
		Class687_Sub25.anInt10886 = class523_sub34.readUnsignedSmart(368514876) * -698494847;
		anInt7824 = class523_sub34.readUnsignedSmart(368514876) * -518080251;
		anInt7827 = class523_sub34.readUnsignedSmart(368514876) * 1533854069;
		aClass611_Sub1Array7823 = (new Class611_Sub1[1 + (anInt7824 * 615132109 - -2074972287 * Class687_Sub25.anInt10886)]);
		for (int i_1_ = 0; i_1_ < 2004567773 * anInt7827; i_1_++) {
			int i_2_ = class523_sub34.readUnsignedSmart(368514876);
			Class611_Sub1 class611_sub1 = aClass611_Sub1Array7823[i_2_] = new Class611_Sub1();
			class611_sub1.anInt8009 = class523_sub34.readUnsignedByte(662417875) * -1099577727;
			class611_sub1.anInt8010 = class523_sub34.readUnsignedInt((byte) -106) * -951605317;
			class611_sub1.anInt10589 = class523_sub34.readUnsignedSmart(368514876) * 1621165017;
			if (0 != class611_sub1.anInt10589 * 1907969129)
				class611_sub1.aString10590 = class523_sub34.readVersionedString(2073748457);
			class611_sub1.anInt10588 = -2018436871 * (i_2_ + -2074972287 * Class687_Sub25.anInt10886);
			class611_sub1.aString10587 = class523_sub34.readVersionedString(2139621755);
			class611_sub1.aString10586 = class523_sub34.readVersionedString(2011132767);
		}
		anInt7820 = class523_sub34.readUnsignedInt((byte) -57) * -1966253121;
		aBool7822 = true;
	}

	static void method9811(RSBuffer class523_sub34) {
		for (int i = 0; i < anInt7827 * 2004567773; i++) {
			int i_3_ = class523_sub34.readUnsignedSmart(368514876);
			int i_4_ = class523_sub34.readUnsignedShort(-867495633);
			if (65535 == i_4_)
				i_4_ = -1;
			if (null != aClass611_Sub1Array7823[i_3_])
				aClass611_Sub1Array7823[i_3_].anInt8012 = i_4_ * 1866771795;
		}
	}

	static void method9812(RSBuffer class523_sub34) {
		for (int i = 0; i < anInt7827 * 2004567773; i++) {
			int i_5_ = class523_sub34.readUnsignedSmart(368514876);
			int i_6_ = class523_sub34.readUnsignedShort(-871644047);
			if (65535 == i_6_)
				i_6_ = -1;
			if (null != aClass611_Sub1Array7823[i_5_])
				aClass611_Sub1Array7823[i_5_].anInt8012 = i_6_ * 1866771795;
		}
	}

	static void method9813(RSBuffer class523_sub34) {
		for (int i = 0; i < anInt7827 * 2004567773; i++) {
			int i_7_ = class523_sub34.readUnsignedSmart(368514876);
			int i_8_ = class523_sub34.readUnsignedShort(-760035604);
			if (65535 == i_8_)
				i_8_ = -1;
			if (null != aClass611_Sub1Array7823[i_7_])
				aClass611_Sub1Array7823[i_7_].anInt8012 = i_8_ * 1866771795;
		}
	}

	static final void method9814(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2642 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method9815(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_9_, -2132699359);
		Class242 class242 = Class31.aClass242Array302[i_9_ >> 16];
		Class581.method9661(class250, class242, class669, 1200748852);
	}

	static final void method9816(Class669 class669, int i) throws Exception_Sub7 {
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5316(((float) (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) / 1000.0F), 365308179);
	}

	static final void method9817(Class669 class669, short i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4310, client.aClass116_11058.aClass11_1413, 1370050649);
		client.aClass116_11058.method1974(class523_sub22, (byte) 63);
	}

	static final void method9818(Class669 class669, int i) {
		int i_10_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub40_10615.method13890(i_10_, 1880929717);
	}

	static final void method9819(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
