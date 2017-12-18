/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class419 {
	public static final int anInt4699 = 43;
	public static final int anInt4700 = 1;
	public static final int anInt4701 = 0;
	public static final int anInt4702 = 3;
	public static final int anInt4703 = 17;
	public static final int anInt4704 = 5;
	public static final int anInt4705 = 6;
	public static final int anInt4706 = 7;
	public static final int anInt4707 = 9;
	public static final int anInt4708 = 24;
	public static final int anInt4709 = 18;
	public static final int anInt4710 = 19;
	public static final int anInt4711 = 20;
	public static final int anInt4712 = 22;
	public static final int anInt4713 = 98;
	public static final int anInt4714 = 45;
	public static final int anInt4715 = 25;
	public static final int anInt4716 = 41;
	public static final int anInt4717 = 42;
	public static final int anInt4718 = 23;
	public static final int anInt4719 = 44;
	public static final int anInt4720 = 4;
	public static final int anInt4721 = 46;
	public static final int anInt4722 = 2;
	public static final int anInt4723 = 99;
	public static Class148 aClass148_4724;

	Class419() throws Throwable {
		throw new Error();
	}

	public static void method6667(Class572 class572, int i, int i_0_, Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int i_1_, int i_2_) {
		Class669 class669 = Class540.method8981(-1885845577);
		class669.aClass647_Sub1_Sub3_Sub1_8552 = class647_sub1_sub3_sub1;
		class669.anInt8576 = i_1_ * 1048128243;
		Class687_Sub28.method16969(class572, i, i_0_, class669, -1833813591);
		class669.aClass647_Sub1_Sub3_Sub1_8552 = null;
		class669.anInt8576 = -1048128243;
	}

	static final int method6668(int i, short i_3_) {
		int i_4_ = i & 0x3f;
		int i_5_ = i >> 6 & 0x3;
		if (18 == i_4_) {
			if (0 == i_5_)
				return 1;
			if (1 == i_5_)
				return 2;
			if (i_5_ == 2)
				return 4;
			if (3 == i_5_)
				return 8;
		} else if (i_4_ == 19 || i_4_ == 21) {
			if (i_5_ == 0)
				return 16;
			if (i_5_ == 1)
				return 32;
			if (i_5_ == 2)
				return 64;
			if (3 == i_5_)
				return 128;
		}
		return 0;
	}

	static final void method6669(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_6_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		boolean bool = (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1] == 1);
		if (i_6_ == 0)
			Class534_Sub1.aBool10778 = bool;
		else if (i_6_ == 1)
			Class534_Sub1.aBool10771 = bool;
		else if (2 == i_6_)
			Class534_Sub1.aBool10797 = bool;
		else
			throw new RuntimeException();
	}

	static final void method6670(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -34844996;
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_8_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_9_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 2];
		Class437 class437 = Class437.method6879((float) i_7_, (float) i_8_, (float) i_9_);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5323(class437, -88235635);
		class437.method6949();
	}
}
