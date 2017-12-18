/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class558 {
	int anInt7481;
	Class375_Sub1 this$0;
	byte[] aByteArray7482;
	Class567 aClass567_7483;
	int anInt7484;
	int anInt7485;
	int anInt7486;
	float aFloat7487;
	int anInt7488;
	int anInt7489;
	byte[] aByteArray7490;

	Class558(Class375_Sub1 class375_sub1, Class567 class567, int i, float f, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		this$0 = class375_sub1;
		aClass567_7483 = class567;
		aByteArray7490 = new byte[i];
		aByteArray7482 = new byte[i_0_ / 8];
		anInt7485 = 1187466467 * aByteArray7490.length;
		aFloat7487 = f;
		anInt7488 = 1405651135 * i_0_;
		anInt7489 = i_1_ * 1800589505;
		anInt7484 = 0;
		anInt7486 = 0;
		anInt7481 = 0;
	}

	void method9226(byte[] is, int i, int i_3_, int i_4_) {
		int i_5_ = i;
		while (i_5_ < i_3_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_5_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_5_];
			i_5_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	void method9227(byte[] is, int i, int i_6_) {
		int i_7_ = i;
		while (i_7_ < i_6_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_7_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_7_];
			i_7_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	int method9228(int i) {
		return -354920245 * anInt7485;
	}

	void method9229(byte[] is, int i, int i_8_) {
		int i_9_ = i;
		while (i_9_ < i_8_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_9_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_9_];
			i_9_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	void method9230(byte[] is, int i, int i_10_) {
		int i_11_ = i;
		while (i_11_ < i_10_ + i) {
			aByteArray7490[1486194189 * anInt7484] = is[i_11_];
			aByteArray7490[1 + anInt7484 * 1486194189] = is[1 + i_11_];
			i_11_ += 2;
			anInt7484 += 1470263690;
			anInt7484 = -1412351803 * (1486194189 * anInt7484 % aByteArray7490.length);
			anInt7485 -= -1920034362;
		}
	}

	int method9231() {
		return -354920245 * anInt7485;
	}

	int method9232() {
		return -354920245 * anInt7485;
	}

	static final byte[] method9233(byte[] is, int i) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		Class462 class462 = new Class462(class523_sub34);
		Class450 class450 = class462.method7512(-1886756930);
		int i_12_ = class462.method7517((byte) -43);
		if (i_12_ < 0 || (1453975341 * Class472.anInt5372 != 0 && i_12_ > 1453975341 * Class472.anInt5372))
			throw new RuntimeException();
		if (Class450.aClass450_4952 == class450) {
			byte[] is_13_ = new byte[i_12_];
			class523_sub34.method16298(is_13_, 0, i_12_, (byte) 89);
			return is_13_;
		}
		int i_14_ = class462.method7513(1070261458);
		if (i_14_ < 0 || (0 != 1453975341 * Class472.anInt5372 && i_14_ > 1453975341 * Class472.anInt5372))
			throw new RuntimeException();
		byte[] is_15_;
		if (Class450.aClass450_4950 == class450) {
			is_15_ = new byte[i_14_];
			Class694.method13996(is_15_, i_14_, is, i_12_, 9);
		} else if (Class450.aClass450_4951 == class450) {
			is_15_ = new byte[i_14_];
			synchronized (Class472.aClass79_5366) {
				Class472.aClass79_5366.method1558(class523_sub34, is_15_, 2131530334);
			}
		} else if (class450 == Class450.aClass450_4954) {
			try {
				is_15_ = Class116.method2006(class523_sub34, i_14_, 769100217);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_15_;
	}

	static final void method9234(Class669 class669, int i) {
		Class611_Sub1 class611_sub1 = Class98_Sub1.method14355(-1045742050);
		if (null != class611_sub1) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt10588 * 1568680265;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -427096717 * class611_sub1.anInt8010;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10587;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.method16192((byte) -75);
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.method16195(2063275336);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt8012 * -1102045477;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1614476621 * class611_sub1.anInt10585;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10586;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		}
	}
}
