/* Class573 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class573 implements Interface66 {
	int anInt7685;

	Class573(int i) {
		anInt7685 = 493331767 * i;
	}

	public void method210(int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4239, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(-1135140729 * anInt7685, -1262882661);
		client.aClass116_11058.method1974(class523_sub22, (byte) 75);
	}

	public void method292() {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4239, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(-1135140729 * anInt7685, -1262882661);
		client.aClass116_11058.method1974(class523_sub22, (byte) 70);
	}

	static final void method9627(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method9628(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class669.aClass334_8571.aString3518;
	}

	static final void method9629(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		client.anInt11258 = 1082174507 * (class669.anIntArray8557[class669.anInt8558 * 1357652815]);
		Class392.aClass705_4037 = Class488.method7951((class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]), -1933849435);
		if (Class392.aClass705_4037 == null)
			Class392.aClass705_4037 = Class705.aClass705_8815;
		client.anInt11163 = (class669.anIntArray8557[2 + class669.anInt8558 * 1357652815] * 367155739);
		Class116 class116 = Class537.method8941(-1443859384);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.UPDATE_GAMEBAR_PACKET, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(client.anInt11258 * 274117251, -1696811370);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class392.aClass705_4037.anInt8817 * 1594679277, -980121658);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1630605293 * client.anInt11163, 1521324681);
		class116.method1974(class523_sub22, (byte) 63);
	}

	static final void method9630(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16678((byte) 29);
	}

	static final void method9631(Class669 class669, int i) {
		class669.anInt8558 -= 2086504905;
		int i_0_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_1_ = (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1] << 1);
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		int i_3_ = class669.anIntArray8557[3 + 1357652815 * class669.anInt8558];
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 4];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 5];
		int i_6_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 6];
		if (i_0_ >= 0 && i_0_ < 2 && null != client.anIntArrayArrayArray11115[i_0_] && i_1_ >= 0 && i_1_ < client.anIntArrayArrayArray11115[i_0_].length) {
			client.anIntArrayArrayArray11115[i_0_][i_1_] = new int[] { (i_2_ >> 14 & 0x3fff) << 9, i_3_ << 2, (i_2_ & 0x3fff) << 9, i_6_ };
			client.anIntArrayArrayArray11115[i_0_][i_1_ + 1] = new int[] { (i_4_ >> 14 & 0x3fff) << 9, i_5_ << 2, (i_4_ & 0x3fff) << 9 };
		}
	}
}
