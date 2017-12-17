/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class283 {
	int[] anIntArray3071;

	public int method5127(int i, int i_0_) {
		int i_1_ = (anIntArray3071.length >> 1) - 1;
		int i_2_ = i & i_1_;
		for (;;) {
			int i_3_ = anIntArray3071[i_2_ + i_2_ + 1];
			if (-1 == i_3_)
				return -1;
			if (i == anIntArray3071[i_2_ + i_2_])
				return i_3_;
			i_2_ = i_2_ + 1 & i_1_;
		}
	}

	public Class283(int[] is) {
		int i;
		for (i = 1; i <= (is.length >> 1) + is.length; i <<= 1) {
			/* empty */
		}
		anIntArray3071 = new int[i + i];
		for (int i_4_ = 0; i_4_ < i + i; i_4_++)
			anIntArray3071[i_4_] = -1;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_;
			for (i_6_ = is[i_5_] & i - 1; -1 != anIntArray3071[1 + (i_6_ + i_6_)]; i_6_ = 1 + i_6_ & i - 1) {
				/* empty */
			}
			anIntArray3071[i_6_ + i_6_] = is[i_5_];
			anIntArray3071[i_6_ + i_6_ + 1] = i_5_;
		}
	}

	public int method5128(int i) {
		int i_7_ = (anIntArray3071.length >> 1) - 1;
		int i_8_ = i & i_7_;
		for (;;) {
			int i_9_ = anIntArray3071[i_8_ + i_8_ + 1];
			if (-1 == i_9_)
				return -1;
			if (i == anIntArray3071[i_8_ + i_8_])
				return i_9_;
			i_8_ = i_8_ + 1 & i_7_;
		}
	}

	static final void method5129(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4315, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 1, 313727859);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 104);
		client.aClass116_11058.method1974(class523_sub22, (byte) 44);
	}

	static final void method5130(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class665.method13652(string, bool, -2122527502);
	}

	static final void method5131(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
	}

	static final void method5132(Class669 class669, int i) {
		if (client.aString11002 != null)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = client.aString11002;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}

	static final void method5133(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method5134(Class523_Sub2 class523_sub2, int i) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -22);
		if (class560 != null) {
			Interface61 interface61 = null;
			if (0 == 876815205 * class523_sub2.anInt10349)
				interface61 = (Interface61) (class560.method9280(1338368275 * class523_sub2.anInt10354, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, 1338846871));
			if (876815205 * class523_sub2.anInt10349 == 1)
				interface61 = (Interface61) (class560.method9284(class523_sub2.anInt10354 * 1338368275, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, (byte) 105));
			if (2 == class523_sub2.anInt10349 * 876815205)
				interface61 = (Interface61) (class560.method9295(1338368275 * class523_sub2.anInt10354, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, client.anInterface63_11296, (byte) -58));
			if (3 == class523_sub2.anInt10349 * 876815205)
				interface61 = (Interface61) (class560.method9398(class523_sub2.anInt10354 * 1338368275, class523_sub2.anInt10348 * 1813697231, 1818669861 * class523_sub2.anInt10355, -1529107215));
			if (interface61 != null) {
				class523_sub2.anInt10350 = interface61.method401(-770473736) * 2028908239;
				class523_sub2.anInt10352 = interface61.method69(-212443985) * -1703632149;
				class523_sub2.anInt10347 = interface61.method390(1259048815) * 1299442669;
			} else {
				class523_sub2.anInt10350 = -2028908239;
				class523_sub2.anInt10352 = 0;
				class523_sub2.anInt10347 = 0;
			}
		}
	}

	static final void method5135(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class231.method4251(class250, class669, (byte) -48);
	}

	public static int method5136(int i, int i_10_, int i_11_, byte i_12_) {
		i_11_ &= 0x3;
		if (0 == i_11_)
			return i;
		if (i_11_ == 1)
			return i_10_;
		if (2 == i_11_)
			return 7 - i;
		return 7 - i_10_;
	}

	static boolean method5137(byte i) {
		return Class276.method5047(Class61.aClass633_769.aClass574_8264, (byte) -80);
	}
}
