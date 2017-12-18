/* Class675 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class675 {
	int anInt8629;
	int anInt8630;
	Class592 aClass592_8631;
	public static Class523_Sub19 aClass523_Sub19_8632;

	int method13736(int i) {
		return client.anIntArray10985[anInt8630 * 1710003343];
	}

	int method13737() {
		return client.anIntArray10985[anInt8630 * 1710003343];
	}

	Interface61 method13738(short i) {
		int i_0_ = -608757111 * aClass592_8631.anInt7809;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_1_ = (235453015 * aClass592_8631.localX - 235453015 * class592.localX);
		int i_2_ = (aClass592_8631.localY * 1704054549 - class592.localY * 1704054549);
		if (i_1_ < 0 || i_2_ < 0 || i_1_ >= client.aClass505_11019.method8292((byte) 96) || i_2_ >= client.aClass505_11019.method8235(2133103286) || client.aClass505_11019.method8241((byte) -71) == null)
			return null;
		switch (method13736(-493959513)) {
		case 1:
			return (Interface61) client.aClass505_11019.method8241((byte) -106).method9284(i_0_, i_1_, i_2_, (byte) 84);
		case 3:
			return ((Interface61) client.aClass505_11019.method8241((byte) -97).method9398(i_0_, i_1_, i_2_, -1242886939));
		case 0:
			return (Interface61) client.aClass505_11019.method8241((byte) -64).method9280(i_0_, i_1_, i_2_, 49421879);
		case 2:
			return ((Interface61) (client.aClass505_11019.method8241((byte) -71).method9295(i_0_, i_1_, i_2_, client.anInterface63_11296, (byte) -24)));
		default:
			return null;
		}
	}

	Interface61 method13739() {
		int i = -608757111 * aClass592_8631.anInt7809;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_3_ = (235453015 * aClass592_8631.localX - 235453015 * class592.localX);
		int i_4_ = (aClass592_8631.localY * 1704054549 - class592.localY * 1704054549);
		if (i_3_ < 0 || i_4_ < 0 || i_3_ >= client.aClass505_11019.method8292((byte) 77) || i_4_ >= client.aClass505_11019.method8235(2087741461) || client.aClass505_11019.method8241((byte) -116) == null)
			return null;
		switch (method13736(-2123852038)) {
		case 1:
			return (Interface61) client.aClass505_11019.method8241((byte) -43).method9284(i, i_3_, i_4_, (byte) 10);
		case 3:
			return (Interface61) client.aClass505_11019.method8241((byte) -99).method9398(i, i_3_, i_4_, -1260760855);
		case 0:
			return (Interface61) client.aClass505_11019.method8241((byte) -38).method9280(i, i_3_, i_4_, 1181108244);
		case 2:
			return ((Interface61) (client.aClass505_11019.method8241((byte) -72).method9295(i, i_3_, i_4_, client.anInterface63_11296, (byte) -30)));
		default:
			return null;
		}
	}

	int method13740() {
		return client.anIntArray10985[anInt8630 * 1710003343];
	}

	public Class675(Class592 class592, int i, int i_5_, int i_6_) {
		aClass592_8631 = class592;
		anInt8630 = i * -528348561;
		anInt8629 = i_6_ * -1398768641;
	}

	int method13741() {
		return client.anIntArray10985[anInt8630 * 1710003343];
	}

	int method13742() {
		return client.anIntArray10985[anInt8630 * 1710003343];
	}

	public Interface61 method13743(byte i) {
		Interface61 interface61 = method13738((short) 26505);
		if (interface61 == null)
			return null;
		if (interface61.method401(-770473736) != 1464828927 * anInt8629)
			return null;
		return interface61;
	}

	public Interface61 method13744() {
		Interface61 interface61 = method13738((short) 8933);
		if (interface61 == null)
			return null;
		if (interface61.method401(-770473736) != 1464828927 * anInt8629)
			return null;
		return interface61;
	}

	public Interface61 method13745() {
		Interface61 interface61 = method13738((short) 23567);
		if (interface61 == null)
			return null;
		if (interface61.method401(-770473736) != 1464828927 * anInt8629)
			return null;
		return interface61;
	}

	int method13746() {
		return client.anIntArray10985[anInt8630 * 1710003343];
	}

	static final void method13747(Class669 class669, int i) {
		int i_7_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_7_, -568524997);
		Class242 class242 = Class31.aClass242Array302[i_7_ >> 16];
		Class307.method5557(class250, class242, class669, 1012068103);
	}

	static final void method13748(Class669 class669, byte i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_8_, -1243984277);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2562 * -1689846769;
	}

	static final void method13749(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_9_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_10_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		Class76 class76 = (Class76) Class60.aClass53_Sub22_766.getDefinition(i_10_, (byte) -54);
		if (class76.method1537((byte) -23))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((Class602) client.aClass505_11019.method8244(1242003869).getDefinition(i_9_, (byte) -63)).method9898(i_10_, class76.aString849, 189765723);
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((Class602) client.aClass505_11019.method8244(995666116).getDefinition(i_9_, (byte) 67)).method9897(i_10_, class76.anInt850 * -1100663923, -32412176));
	}

	static final void method13750(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aShort11274;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aShort11275;
	}

	static final void method13751(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class280.method5095(class250, class242, class669, (byte) 6);
	}

	static final void method13752(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16906(-2117945657);
	}

	public static int method13753(int i, int i_11_) {
		Class569.aTwitchWebcamFrameData7642 = null;
		Class569.aClass148_7626 = null;
		if (i < 0 || i >= Class569.aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StopWebcamDevice(-365031943 * Class569.aTwitchWebcamDeviceArray7648[i].anInt1137));
	}

	static final void method13754(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class477.method7889(class250, class242, class669, (byte) 0);
	}

	static void method13755(int i, byte i_12_) {
		Class72.anInt799 = i * 1239229695;
		Class523_Sub39_Sub1.aClass523_Sub39_Sub1Array11730 = new Class523_Sub39_Sub1[i];
		Class446.anInt4933 = 0;
	}
}
