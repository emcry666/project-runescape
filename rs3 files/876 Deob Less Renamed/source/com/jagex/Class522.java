/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class522 {
	public Class522 aClass522_7061;
	public Class522 aClass522_7062;

	public void method8651() {
		if (null != aClass522_7061) {
			aClass522_7061.aClass522_7062 = aClass522_7062;
			aClass522_7062.aClass522_7061 = aClass522_7061;
			aClass522_7062 = null;
			aClass522_7061 = null;
		}
	}

	public void method8652(byte i) {
		if (null != aClass522_7061) {
			aClass522_7061.aClass522_7062 = aClass522_7062;
			aClass522_7062.aClass522_7061 = aClass522_7061;
			aClass522_7062 = null;
			aClass522_7061 = null;
		}
	}

	public void method8653() {
		if (null != aClass522_7061) {
			aClass522_7061.aClass522_7062 = aClass522_7062;
			aClass522_7062.aClass522_7061 = aClass522_7061;
			aClass522_7062 = null;
			aClass522_7061 = null;
		}
	}

	public void method8654() {
		if (null != aClass522_7061) {
			aClass522_7061.aClass522_7062 = aClass522_7062;
			aClass522_7062.aClass522_7061 = aClass522_7061;
			aClass522_7062 = null;
			aClass522_7061 = null;
		}
	}

	static final void method8655(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -852586751);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class149.method2513(class250, class242, class669, (byte) -61);
	}

	static final void method8656(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (140399851 * client.exchangeOfferSlots[i_2_][i_1_].anInt5469);
	}

	static final void method8657(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1912232329 * client.anInt11110 - -1272954495 * client.anInt11077;
	}

	public static final void method8658(String string, int i, int i_3_) {
		Class116 class116 = Class537.method8941(-1019385847);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4307, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1 + Class6.method555(string, (byte) -39), 1784574972);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 35);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16314(i, (byte) 14);
		class116.method1974(class523_sub22, (byte) 121);
	}

	static Class293 method8659(int i, byte i_4_) {
		if (i == Class293.aClass293_3161.anInt3162 * -1378176729)
			return Class293.aClass293_3161;
		if (Class293.aClass293_3160.anInt3162 * -1378176729 == i)
			return Class293.aClass293_3160;
		return null;
	}
}
