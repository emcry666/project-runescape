/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class331 {
	static final int anInt3501 = 6;
	static final int anInt3502 = 2048;
	static final int anInt3503 = 2;
	static int[] anIntArray3504 = new int[512];
	static final int anInt3505 = 11;
	static Class10 aClass10_3506;

	static {
		int i = 9;
		for (int i_0_ = i - 1; i_0_ >= 0; i_0_--) {
			int i_1_ = 1 << i - i_0_ - 1;
			int i_2_ = 1 << i - i_0_;
			for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++)
				anIntArray3504[i_3_] = (i_0_ << 6) + (i_2_ - i_3_ << 6 >>> i - i_0_ - 1);
		}
	}

	static final boolean method5823(Class53_Sub18 class53_sub18, int i, int i_4_, byte i_5_) {
		Class602 class602 = (Class602) class53_sub18.getDefinition(i, (byte) 48);
		if (i_4_ == 11)
			i_4_ = 10;
		if (i_4_ >= 5 && i_4_ <= 8)
			i_4_ = 4;
		return class602.method9891(i_4_, (byte) -124);
	}

	public static int method5824(int i, int i_6_, int i_7_, int i_8_) {
		if (Class534_Sub1.anInt10795 * -1547856073 < 100)
			return -2;
		int i_9_ = -2;
		int i_10_ = 2147483647;
		int i_11_ = i_6_ - Class534_Sub1.anInt7168;
		int i_12_ = i_7_ - Class534_Sub1.anInt7159;
		for (Class523_Sub32 class523_sub32 = ((Class523_Sub32) Class534_Sub1.aClass708_7194.method14240(1701907164)); class523_sub32 != null; class523_sub32 = (Class523_Sub32) Class534_Sub1.aClass708_7194.method14244((byte) -37)) {
			if (class523_sub32.anInt10578 * -1039292053 == i) {
				int i_13_ = class523_sub32.anInt10580 * -1808941705;
				int i_14_ = -1727058043 * class523_sub32.anInt10581;
				int i_15_ = (i_13_ + Class534_Sub1.anInt7168 << 14 | Class534_Sub1.anInt7159 + i_14_);
				int i_16_ = ((i_12_ - i_14_) * (i_12_ - i_14_) + (i_11_ - i_13_) * (i_11_ - i_13_));
				if (i_9_ < 0 || i_16_ < i_10_) {
					i_9_ = i_15_;
					i_10_ = i_16_;
				}
			}
		}
		return i_9_;
	}

	public static void method5825(String string, boolean bool, boolean bool_17_, int i) {
		Class388.method6470(string, bool, "openjs", bool_17_, -494472837);
	}
}
