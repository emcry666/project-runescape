/* Class662 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class662 {
	static Class662 aClass662_8511;
	static Class662 aClass662_8512 = new Class662();
	public static Class662 aClass662_8513 = new Class662();

	Class662() {
		/* empty */
	}

	static {
		aClass662_8511 = new Class662();
	}

	static final void method10911(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_2_ = client.exchangeOfferSlots[i_1_][i_0_].method7910(-334432657);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_2_ == 2 ? 1 : 0;
	}

	public static boolean method10912(byte i) {
		return Class517.anInterface59_7052 != null;
	}

	static void method10913(int i) {
		int i_3_ = -1;
		if (Class534_Sub1.aClass523_Sub27_Sub17_7144 != null)
			i_3_ = (Class534_Sub1.aClass523_Sub27_Sub17_7144.anInt11831 * -536403473);
		Class42.method1147((short) -22448);
		for (int i_4_ = 0; i_4_ < 3; i_4_++) {
			for (int i_5_ = 0; i_5_ < 5; i_5_++) {
				Class534_Sub1.aClass164ArrayArray10792[i_4_][i_5_] = null;
				Class534_Sub1.aClass10ArrayArray10785[i_4_][i_5_] = null;
			}
		}
		Class534_Sub1.aClass523_Sub27_Sub17_7144 = null;
		if (-1 != i_3_)
			Class642.method10534(i_3_, -1, -1, false, 1518343614);
	}
}
