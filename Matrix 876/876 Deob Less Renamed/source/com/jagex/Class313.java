/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class313 implements Interface5 {
	Class472 aClass472_3394;
	public static int anInt3395;

	public Class method49(int i) {
		return com.jagex.Class310.class;
	}

	Class313(Class472 class472) {
		aClass472_3394 = class472;
	}

	public Interface13 method50(int i, Interface12 interface12) {
		return new Class310(i, aClass472_3394);
	}

	public Interface13 method48(int i, Interface12 interface12, int i_0_) {
		return new Class310(i, aClass472_3394);
	}

	public Class method47() {
		return com.jagex.Class310.class;
	}

	static final void method5655(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static final void method5656(int i, int i_1_) {
		for (int i_2_ = 0; i_2_ < 5; i_2_++)
			client.aBoolArray11269[i_2_] = false;
		client.anInt11116 = -1299417575;
		client.anInt11103 = 1528759557;
		Class168.anInt1801 = 0;
		Class277.anInt3030 = 0;
		Class59.anInt755 = 1325954419;
		Class697.anInt8764 = -763239385;
		Class562.anInt7564 = i * 1258432249;
		if (2 != 2097396553 * Class562.anInt7564)
			Class168.aLong1799 = 0L;
	}

	static void method5657(int i, int i_3_, int[] is, int[] is_4_, float[] fs, float[] fs_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = i * i_7_ + i_6_;
		int i_14_ = i_3_ * i_9_ + i_8_;
		int i_15_ = i - i_10_;
		int i_16_ = i_3_ - i_10_;
		if (is == null) {
			for (int i_17_ = 0; i_17_ < i_11_; i_17_++) {
				int i_18_ = i_10_ + i_13_;
				while (i_13_ < i_18_)
					fs_5_[i_14_++] = fs[i_13_++];
				i_13_ += i_15_;
				i_14_ += i_16_;
			}
		} else if (fs == null) {
			for (int i_19_ = 0; i_19_ < i_11_; i_19_++) {
				int i_20_ = i_10_ + i_13_;
				while (i_13_ < i_20_)
					is_4_[i_14_++] = is[i_13_++];
				i_13_ += i_15_;
				i_14_ += i_16_;
			}
		} else {
			for (int i_21_ = 0; i_21_ < i_11_; i_21_++) {
				int i_22_ = i_13_ + i_10_;
				while (i_13_ < i_22_) {
					is_4_[i_14_] = is[i_13_];
					fs_5_[i_14_++] = fs[i_13_++];
				}
				i_13_ += i_15_;
				i_14_ += i_16_;
			}
		}
	}
}
