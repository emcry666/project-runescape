/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class26 {
	protected int anInt247;
	protected int anInt248;
	protected int anInt249;
	protected int anInt250;
	protected int anInt251;
	protected int anInt252;
	protected boolean aBool253;
	protected boolean aBool254;
	protected int anInt255;

	Class26(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_) {
		anInt255 = 580940595 * i;
		anInt248 = -684096155 * i_0_;
		anInt249 = 1593631443 * (i_1_ > 65535 ? 65535 : i_1_);
		anInt251 = 1874563899 * i_2_;
		anInt250 = 1281013981 * (i_3_ > 255 ? 255 : i_3_);
		anInt252 = i_4_ * -779305341;
		aBool253 = bool;
		aBool254 = bool_5_;
		anInt247 = i_6_ * 248363245;
	}

	static final void method848(Class647_Sub1 class647_sub1, int i, boolean bool, boolean bool_7_, int i_8_) {
		int i_9_;
		int i_10_;
		if (class647_sub1 instanceof Class647_Sub1_Sub3 && class647_sub1 instanceof Interface61) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = (Class647_Sub1_Sub3) class647_sub1;
			int i_11_ = (1 + (class647_sub1_sub3.aShort11749 - class647_sub1_sub3.aShort11750) << 9);
			int i_12_ = (1 + (class647_sub1_sub3.aShort11752 - class647_sub1_sub3.aShort11751) << 9);
			i_9_ = (class647_sub1_sub3.aShort11750 << 9) + i_11_ / 2;
			i_10_ = (class647_sub1_sub3.aShort11751 << 9) + i_12_ / 2;
		} else {
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			i_9_ = (int) class437.aFloat4903;
			i_10_ = (int) class437.aFloat4905;
		}
		Class28.method872(class647_sub1.aByte10821, i_9_, i_10_, 0, i, bool, bool_7_, (byte) -86);
	}

	static final void method849(Class669 class669, byte i) {
		client.aBool11118 = true;
		Class16.method769(421764847);
	}

	static final void method850(Class669 class669, int i) {
		int i_13_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_13_, (byte) -35));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class12.anInt154 * 1659386565;
	}

	static final void method851(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1652858555 * client.anInt10990;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1046646323 * client.anInt11192;
	}
}
