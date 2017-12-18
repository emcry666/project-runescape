/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class391 implements Interface49 {
	static Class389 aClass389_4021;
	public int anInt4022;
	protected static int anInt4023;
	static boolean[] aBoolArray4024;

	Class391(int i) {
		anInt4022 = -2032892627 * i;
	}

	public Class394 method353(int i) {
		return Class394.aClass394_4052;
	}

	public Class394 method351() {
		return Class394.aClass394_4052;
	}

	public Class394 method352() {
		return Class394.aClass394_4052;
	}

	public Class394 method354() {
		return Class394.aClass394_4052;
	}

	static final void method6487(Class669 class669, int i) {
		class669.anInt8558 -= -34844996;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_2_ = class669.anIntArray8557[2 + 1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		IncomingPacket.method6629(((i_0_ >> 14 & 0x3fff) - class592.localX * 235453015), (i_0_ & 0x3fff) - class592.localY * 1704054549, i_1_ << 2, i_2_, i_3_, (byte) -91);
		client.aBool11111 = true;
	}

	static final void method6488(Class669 class669, byte i) throws Exception_Sub7 {
		class669.anInt8558 -= -34844996;
		int i_4_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_5_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_6_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		int i_7_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 3];
		Class437 class437 = Class437.method6879((float) i_4_, (float) i_5_, (float) i_6_);
		if (class437.aFloat4903 == -1.0F)
			class437.aFloat4903 = Float.POSITIVE_INFINITY;
		if (class437.aFloat4904 == -1.0F)
			class437.aFloat4904 = Float.POSITIVE_INFINITY;
		if (-1.0F == class437.aFloat4905)
			class437.aFloat4905 = Float.POSITIVE_INFINITY;
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5319(class437, -1041617368);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5316((float) i_7_ / 1000.0F, 365308179);
		class437.method6949();
	}
}
