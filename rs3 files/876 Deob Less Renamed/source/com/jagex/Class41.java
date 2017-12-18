/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class41 {
	public static int anInt558;
	static int anInt559;
	public static int[] anIntArray560;
	public static int[] anIntArray561;
	static final int anInt562 = 12;
	static Class466 aClass466_563 = new Class466(16, Class471.aClass471_5360);

	public static byte[] method1138(int i) {
		byte[] is = (byte[]) aClass466_563.method7563(Integer.valueOf(i), -1698268088);
		if (is == null) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_0_ = 0; i_0_ < 255; i_0_++)
				is[i_0_] = (byte) i_0_;
			for (int i_1_ = 0; i_1_ < 255; i_1_++) {
				int i_2_ = 255 - i_1_;
				int i_3_ = Class588.method9742(random, i_2_, -1524556335);
				byte i_4_ = is[i_3_];
				is[i_3_] = is[i_2_];
				is[i_2_] = is[511 - i_1_] = i_4_;
			}
			aClass466_563.method7564(Integer.valueOf(i), is, (byte) -96);
		}
		return is;
	}

	public static void method1139(int i, int i_5_, short i_6_) {
		if (i != anInt558 * 1287694253) {
			anIntArray560 = new int[i];
			for (int i_7_ = 0; i_7_ < i; i_7_++)
				anIntArray560[i_7_] = (i_7_ << 12) / i;
			anInt558 = 370103333 * i;
		}
		if (anInt559 * -1845107787 != i_5_) {
			if (i_5_ != anInt558 * 1287694253) {
				anIntArray561 = new int[i_5_];
				for (int i_8_ = 0; i_8_ < i_5_; i_8_++)
					anIntArray561[i_8_] = (i_8_ << 12) / i_5_;
			} else
				anIntArray561 = anIntArray560;
			anInt559 = 1115828893 * i_5_;
		}
	}

	public static byte[] method1140(int i, byte i_9_) {
		byte[] is = (byte[]) aClass466_563.method7563(Integer.valueOf(i), -1698268088);
		if (is == null) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_10_ = 0; i_10_ < 255; i_10_++)
				is[i_10_] = (byte) i_10_;
			for (int i_11_ = 0; i_11_ < 255; i_11_++) {
				int i_12_ = 255 - i_11_;
				int i_13_ = Class588.method9742(random, i_12_, -2023072644);
				byte i_14_ = is[i_13_];
				is[i_13_] = is[i_12_];
				is[i_12_] = is[511 - i_11_] = i_14_;
			}
			aClass466_563.method7564(Integer.valueOf(i), is, (byte) -94);
		}
		return is;
	}

	public static void method1141(int i, int i_15_) {
		if (i != anInt558 * 1287694253) {
			anIntArray560 = new int[i];
			for (int i_16_ = 0; i_16_ < i; i_16_++)
				anIntArray560[i_16_] = (i_16_ << 12) / i;
			anInt558 = 370103333 * i;
		}
		if (anInt559 * -1845107787 != i_15_) {
			if (i_15_ != anInt558 * 1287694253) {
				anIntArray561 = new int[i_15_];
				for (int i_17_ = 0; i_17_ < i_15_; i_17_++)
					anIntArray561[i_17_] = (i_17_ << 12) / i_15_;
			} else
				anIntArray561 = anIntArray560;
			anInt559 = 1115828893 * i_15_;
		}
	}

	Class41() throws Throwable {
		throw new Error();
	}

	public static byte[] method1142(int i) {
		byte[] is = (byte[]) aClass466_563.method7563(Integer.valueOf(i), -1698268088);
		if (is == null) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_18_ = 0; i_18_ < 255; i_18_++)
				is[i_18_] = (byte) i_18_;
			for (int i_19_ = 0; i_19_ < 255; i_19_++) {
				int i_20_ = 255 - i_19_;
				int i_21_ = Class588.method9742(random, i_20_, -1793216698);
				byte i_22_ = is[i_21_];
				is[i_21_] = is[i_20_];
				is[i_20_] = is[511 - i_19_] = i_22_;
			}
			aClass466_563.method7564(Integer.valueOf(i), is, (byte) -24);
		}
		return is;
	}

	public static void method1143(float[] fs, int[] is, int i, int i_23_, byte i_24_) {
		if (i < i_23_) {
			int i_25_ = (i_23_ + i) / 2;
			int i_26_ = i;
			float f = fs[i_25_];
			fs[i_25_] = fs[i_23_];
			fs[i_23_] = f;
			int i_27_ = is[i_25_];
			is[i_25_] = is[i_23_];
			is[i_23_] = i_27_;
			for (int i_28_ = i; i_28_ < i_23_; i_28_++) {
				if (fs[i_28_] > f) {
					float f_29_ = fs[i_28_];
					fs[i_28_] = fs[i_26_];
					fs[i_26_] = f_29_;
					int i_30_ = is[i_28_];
					is[i_28_] = is[i_26_];
					is[i_26_++] = i_30_;
				}
			}
			fs[i_23_] = fs[i_26_];
			fs[i_26_] = f;
			is[i_23_] = is[i_26_];
			is[i_26_] = i_27_;
			method1143(fs, is, i, i_26_ - 1, (byte) 78);
			method1143(fs, is, 1 + i_26_, i_23_, (byte) -12);
		}
	}

	static final void method1144(Class250 class250, Class669 class669, int i) {
		int i_31_ = 10;
		int i_32_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class29.method876(class250, i_31_, i_32_, class669, -2052400039);
	}

	static final void method1145(Class669 class669, int i) {
		int i_33_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (-1 != i_33_) {
			int i_34_ = i_33_ >> 14 & 0x3fff;
			int i_35_ = i_33_ & 0x3fff;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			i_34_ -= 235453015 * class592.localX;
			if (i_34_ < 0)
				i_34_ = 0;
			else if (i_34_ >= client.aClass505_11019.method8292((byte) 15))
				i_34_ = client.aClass505_11019.method8292((byte) 107);
			i_35_ -= 1704054549 * class592.localY;
			if (i_35_ < 0)
				i_35_ = 0;
			else if (i_35_ >= client.aClass505_11019.method8235(2132990146))
				i_35_ = client.aClass505_11019.method8235(2072468035);
			Class697.anInt8764 = 763239385 * ((i_34_ << 9) + 256);
			Class59.anInt755 = ((i_35_ << 9) + 256) * -1325954419;
		} else {
			Class697.anInt8764 = -763239385;
			Class59.anInt755 = 1325954419;
		}
	}
}
