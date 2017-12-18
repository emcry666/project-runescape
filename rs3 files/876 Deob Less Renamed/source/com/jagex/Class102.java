/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class102 implements Interface22 {
	int anInt1245;
	int anInt1246;
	int[] anIntArray1247;

	public int method1() {
		return anInt1245 * -2019014011;
	}

	public void method78() {
		/* empty */
	}

	public int method82() {
		return anInt1246 * 735864853;
	}

	Class102(int i, int i_0_, int[] is) {
		anInt1245 = i * 183377485;
		anInt1246 = -1642059971 * i_0_;
		anIntArray1247 = is;
	}

	public void method131() {
		/* empty */
	}

	public int method38() {
		return anInt1246 * 735864853;
	}

	public int method68() {
		return anInt1246 * 735864853;
	}

	public int method88() {
		return anInt1245 * -2019014011;
	}

	public void method130() {
		/* empty */
	}

	public void method132() {
		/* empty */
	}

	public int method6() {
		return anInt1246 * 735864853;
	}

	public int method86() {
		return anInt1245 * -2019014011;
	}

	Class102(int i, int i_1_) {
		this(i, i_1_, new int[i_1_ * i]);
	}

	static final int method1799(int i, int i_2_, int i_3_, int i_4_) {
		if (i_2_ == i)
			return i;
		int i_5_ = 128 - i_3_;
		int i_6_ = (i & 0x7f) * i_5_ + i_3_ * (i_2_ & 0x7f) >> 7;
		int i_7_ = (i & 0x380) * i_5_ + i_3_ * (i_2_ & 0x380) >> 7;
		int i_8_ = (i_2_ & 0xfc00) * i_3_ + (i & 0xfc00) * i_5_ >> 7;
		return i_8_ & 0xfc00 | i_7_ & 0x380 | i_6_ & 0x7f;
	}

	static final void method1800(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class669.anObjectArray8565[class669.anIntArray8577[1180759405 * class669.anInt8579]]);
	}

	static final void method1801(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		Class254.aClass217_2743.sendMusic((class669.anIntArray8557[1357652815 * class669.anInt8558]), 255, (byte) -86);
	}

	static final void method1802(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_9_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_10_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class254.aClass217_2743.method3866(i_9_, i_10_, (byte) 50);
	}

	static void method1803(byte i) {
		Class116 class116 = Class537.method8941(-2035390252);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4299, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(client.anInt11060 * 1369210245, -1334119064);
		class116.method1974(class523_sub22, (byte) 84);
	}
}
