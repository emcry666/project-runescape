/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class Class463 {
	Class453[] aClass453Array5126;
	public static int anInt5127;

	Class463(RSBuffer class523_sub34, BigInteger biginteger, BigInteger biginteger_0_) {
		class523_sub34.offset = 948828615;
		int i = class523_sub34.readUnsignedByte(-5244777);
		class523_sub34.offset += -1998611344 * i;
		byte[] is = new byte[(class523_sub34.buffer.length - class523_sub34.offset * 2349011)];
		class523_sub34.readBytes(is, 0, is.length, (byte) -15);
		byte[] is_1_;
		if (biginteger == null || biginteger_0_ == null)
			is_1_ = is;
		else {
			BigInteger biginteger_2_ = new BigInteger(is);
			BigInteger biginteger_3_ = biginteger_2_.modPow(biginteger, biginteger_0_);
			is_1_ = biginteger_3_.toByteArray();
		}
		if (is_1_.length != 65 && 64 != is_1_.length)
			throw new RuntimeException();
//		byte[] is_4_ = Class202.method3698(class523_sub34.aByteArray10658, 5, (class523_sub34.anInt10661 * 2349011 - is.length - 5), -2058382686);
//		for (int i_5_ = 0; i_5_ < 64; i_5_++) {
//			if (is_4_[i_5_] != is_1_[1 + i_5_])
//				throw new RuntimeException();
//		}
		aClass453Array5126 = new Class453[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			class523_sub34.offset = -1998611344 * i_6_ + 1138594338;
			int i_7_ = class523_sub34.readUnsignedInt((byte) -19);
			int i_8_ = class523_sub34.readUnsignedInt((byte) -3);
			int i_9_ = class523_sub34.readUnsignedInt((byte) -58);
			int i_10_ = class523_sub34.readUnsignedInt((byte) -101);
			byte[] is_11_ = new byte[64];
			class523_sub34.readBytes(is_11_, 0, 64, (byte) -10);
			aClass453Array5126[i_6_] = new Class453(i_7_, i_9_, i_8_, i_10_, is_11_);
		}
	}

	static void method7519(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class464.method7545(1266075530) ? 1 : 0;
	}

	static final void method7520(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_12_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		short i_13_ = (short) (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]);
		short i_14_ = (short) (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2]);
		if (i_12_ >= 0 && i_12_ < 5) {
			class250.method4446(i_12_, i_13_, i_14_, (byte) -18);
			Login.method15991(class250, (byte) -100);
			if (-1 == class250.anInt2709 * 234012635 && !class242.aBool2456)
				Class104.method1858(-1363815505 * class250.interfaceHash, i_12_, (byte) -66);
		}
	}

	static final void method7521(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class241.player.method18399((byte) 1).method9786(2094060211);
	}

	static final void method7522(Class669 class669, byte i) throws Exception_Sub7 {
		class669.anInt8558 -= -34844996;
		float f = (float) class669.anIntArray8557[class669.anInt8558 * 1357652815];
		float f_15_ = (float) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		float f_16_ = (float) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 2]);
		float f_17_ = ((float) (class669.anIntArray8557[3 + 1357652815 * class669.anInt8558]) / 1000.0F);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5324(Class437.method6879(f, f_15_, f_16_), f_17_, 1357652815);
	}

	static void method7523(String string, String string_18_, int i, int i_19_, int i_20_, long l, int i_21_, int i_22_, boolean bool, boolean bool_23_, long l_24_, boolean bool_25_, byte i_26_) {
		if (!Class36.aBool326 && 462991943 * Class36.anInt330 < 512) {
			i = -1 != i ? i : client.anInt11178 * 971872405;
			Class523_Sub27_Sub6 class523_sub27_sub6 = new Class523_Sub27_Sub6(string, string_18_, i, i_19_, i_20_, l, i_21_, i_22_, bool, bool_23_, l_24_, bool_25_);
			Class232.method4258(class523_sub27_sub6, -1087002940);
		}
	}

	static void method7524(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class511.method8561(-1850608859);
	}
}
