/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class332 {
	short[] aShortArray3507;
	int anInt3508;

	public static int method5826(short[] is, int i, Class315 class315, int i_0_) throws IOException {
		int i_1_ = 1;
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = class315.method5669(is, i_1_ + i, (byte) 22);
			i_1_ <<= 1;
			i_1_ += i_4_;
			i_2_ |= i_4_ << i_3_;
		}
		return i_2_;
	}

	public Class332(int i) {
		anInt3508 = 744568061 * i;
		aShortArray3507 = new short[1 << i];
	}

	public int method5827(Class315 class315, int i) throws IOException {
		int i_5_ = 1;
		for (int i_6_ = anInt3508 * 332367957; i_6_ != 0; i_6_--)
			i_5_ = (i_5_ << 1) + class315.method5669(aShortArray3507, i_5_, (byte) 27);
		return i_5_ - (1 << 332367957 * anInt3508);
	}

	public int method5828(Class315 class315, int i) throws IOException {
		int i_7_ = 1;
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < anInt3508 * 332367957; i_9_++) {
			int i_10_ = class315.method5669(aShortArray3507, i_7_, (byte) 95);
			i_7_ <<= 1;
			i_7_ += i_10_;
			i_8_ |= i_10_ << i_9_;
		}
		return i_8_;
	}

	public void method5829(int i) {
		Class304.method5544(aShortArray3507, (byte) 39);
	}

	public int method5830(Class315 class315) throws IOException {
		int i = 1;
		for (int i_11_ = anInt3508 * 332367957; i_11_ != 0; i_11_--)
			i = (i << 1) + class315.method5669(aShortArray3507, i, (byte) 47);
		return i - (1 << 332367957 * anInt3508);
	}

	public int method5831(Class315 class315) throws IOException {
		int i = 1;
		for (int i_12_ = anInt3508 * 332367957; i_12_ != 0; i_12_--)
			i = (i << 1) + class315.method5669(aShortArray3507, i, (byte) -51);
		return i - (1 << 332367957 * anInt3508);
	}

	public int method5832(Class315 class315) throws IOException {
		int i = 1;
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < anInt3508 * 332367957; i_14_++) {
			int i_15_ = class315.method5669(aShortArray3507, i, (byte) -6);
			i <<= 1;
			i += i_15_;
			i_13_ |= i_15_ << i_14_;
		}
		return i_13_;
	}

	public int method5833(Class315 class315) throws IOException {
		int i = 1;
		for (int i_16_ = anInt3508 * 332367957; i_16_ != 0; i_16_--)
			i = (i << 1) + class315.method5669(aShortArray3507, i, (byte) 34);
		return i - (1 << 332367957 * anInt3508);
	}

	public int method5834(Class315 class315) throws IOException {
		int i = 1;
		int i_17_ = 0;
		for (int i_18_ = 0; i_18_ < anInt3508 * 332367957; i_18_++) {
			int i_19_ = class315.method5669(aShortArray3507, i, (byte) 31);
			i <<= 1;
			i += i_19_;
			i_17_ |= i_19_ << i_18_;
		}
		return i_17_;
	}

	public static int method5835(short[] is, int i, Class315 class315, int i_20_) throws IOException {
		int i_21_ = 1;
		int i_22_ = 0;
		for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
			int i_24_ = class315.method5669(is, i_21_ + i, (byte) -44);
			i_21_ <<= 1;
			i_21_ += i_24_;
			i_22_ |= i_24_ << i_23_;
		}
		return i_22_;
	}

	static final void method5836(Class669 class669, byte i) {
		int i_25_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_25_, -998093129);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 365308179 * class250.anInt2581;
	}

	static final void method5837(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_26_ = ((String) class669.anObjectArray8559[1 + 240723773 * class669.anInt8560]);
		Class77.method1546(string, string_26_, -262350906);
	}

	static final void method5838(Class669 class669, byte i) {
		int i_27_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class638.anIntArray8306[i_27_ & 0xffff];
	}

	static final void method5839(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_28_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_29_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class523_Sub27_Sub10 class523_sub27_sub10 = Class380.aClass473_3938.method7739(i_28_, (byte) -16);
		int i_30_ = class523_sub27_sub10.anIntArray11727[i_29_];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_30_;
	}

	static final void method5840(Class669 class669, byte i) {
		Class642.method10534(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -1, -1, false, 1577529973);
	}

	static final void method5841(Class669 class669, int i) {
		int i_31_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_32_ = Class322.method5722(i_31_, 1576372952);
		if (i_32_ < 0)
			throw new RuntimeException();
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_32_;
	}

	static final void method5842(Class669 class669, int i) throws Exception_Sub7 {
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5315(((float) (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) / 1000.0F), (byte) -47);
	}

	static final void method5843(int i) {
		for (int i_33_ = 0; i_33_ < 920163749 * client.anInt11050; i_33_++) {
			int i_34_ = client.anIntArray11051[i_33_];
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_34_));
			if (class523_sub28 != null) {
				NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
				VarBitDefinitions.method5617(class647_sub1_sub3_sub1_sub1, false, (byte) -53);
			}
		}
	}
}
