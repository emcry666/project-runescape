/* Class194_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub17 extends Class194 {
	int anInt9940;
	static int anInt9941;

	public void method3651() {
		Class191.aClass192Array2157[-611486857 * anInt9940].method3629(-715781018);
	}

	public void method3648(int i) {
		Class191.aClass192Array2157[-611486857 * anInt9940].method3629(-870756027);
	}

	public void method3656() {
		Class191.aClass192Array2157[-611486857 * anInt9940].method3629(-1424544567);
	}

	Class194_Sub17(RSBuffer class523_sub34) {
		super(class523_sub34);
		anInt9940 = class523_sub34.readUnsignedShort(-62436983) * 832394823;
	}

	public void method3657() {
		Class191.aClass192Array2157[-611486857 * anInt9940].method3629(-1964254082);
	}

	static final void method15521(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_1_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_0_, (byte) -116));
		if (i_1_ >= 1 && i_1_ <= 5 && null != class12.inventoryOptions[i_1_ - 1])
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class12.inventoryOptions[i_1_ - 1];
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}
}
