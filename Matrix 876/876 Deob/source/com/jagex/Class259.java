/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class259 {
	byte[] aByteArray2835;
	int anInt2836;

	int method4688() {
		short i = 0;
		for (int i_0_ = 0; i_0_ < 2; i_0_++)
			i |= (aByteArray2835[(anInt2836 += 1862872891) * 1721487859 - 1] & 0xff) << 8 * i_0_;
		return i;
	}

	int method4689(int i) {
		short i_1_ = 0;
		for (int i_2_ = 0; i_2_ < 2; i_2_++)
			i_1_ |= (aByteArray2835[(anInt2836 += 1862872891) * 1721487859 - 1] & 0xff) << 8 * i_2_;
		return i_1_;
	}

	Class259(byte[] is) {
		aByteArray2835 = is;
		anInt2836 = 0;
	}

	int method4690() {
		short i = 0;
		for (int i_3_ = 0; i_3_ < 2; i_3_++)
			i |= (aByteArray2835[(anInt2836 += 1862872891) * 1721487859 - 1] & 0xff) << 8 * i_3_;
		return i;
	}

	String method4691() {
		int i = method4689(-493228511);
		if (i == -1)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray2835, anInt2836 * 1721487859, i);
		anInt2836 += 1862872891 * i;
		return string;
	}

	String method4692(int i) {
		int i_4_ = method4689(316677174);
		if (i_4_ == -1)
			return null;
		if (i_4_ > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray2835, anInt2836 * 1721487859, i_4_);
		anInt2836 += 1862872891 * i_4_;
		return string;
	}

	static final void method4693(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class597.method9842(class250, class242, class669, (byte) -8);
	}

	static final void method4694(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_5_, -2072857667);
		Class242 class242 = Class31.aClass242Array302[i_5_ >> 16];
		Class158.method2556(class250, class242, class669, (byte) 94);
	}

	static final void method4695(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_6_, -850312649);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 175466669 * class250.anInt2563;
	}

	static final void method4696(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_7_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_8_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		ClientScriptDefinitions class37 = (ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_7_, (byte) 22);
		if (class37.valueType == Class464.aClass464_5165) {
			/* empty */
		}
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class37.getStringValue(i_8_, 917186604);
	}

	static final void method4697(Class669 class669, int i) {
		NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class669.aClass647_Sub1_Sub3_Sub1_8552);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class647_sub1_sub3_sub1_sub1.customCombatLevel * 1167898669;
	}

	static final void method4698(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_9_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		Class437 class437 = Class437.method6879((float) i_9_, (float) i_9_, (float) i_9_);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5323(class437, 1204555659);
		class437.method6949();
	}

	static final void method4699(Class669 class669, int i) {
		Class668.method13676(class669.aClass647_Sub1_Sub3_Sub1_8552, class669, (byte) 0);
	}
}
