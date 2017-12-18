/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class294 {
	public int anInt3163;
	public static Class294 aClass294_3164;
	public static Class294 aClass294_3165 = new Class294(0, false);
	public static Class294 aClass294_3166;
	static Class294 aClass294_3167;
	static Class294 aClass294_3168;
	static Class294 aClass294_3169;
	static Class294 aClass294_3170;
	boolean aBool3171;

	Class294(int i, boolean bool) {
		anInt3163 = i * 230479849;
		aBool3171 = bool;
	}

	public boolean method5253(byte i) {
		return aBool3171;
	}

	public boolean method5254() {
		return aBool3171;
	}

	public static Class294 method5255(int i) {
		if (686518361 * aClass294_3165.anInt3163 == i)
			return aClass294_3165;
		if (aClass294_3164.anInt3163 * 686518361 == i)
			return aClass294_3164;
		if (i == 686518361 * aClass294_3168.anInt3163)
			return aClass294_3168;
		if (aClass294_3166.anInt3163 * 686518361 == i)
			return aClass294_3166;
		if (i == 686518361 * aClass294_3167.anInt3163)
			return aClass294_3167;
		if (686518361 * aClass294_3169.anInt3163 == i)
			return aClass294_3169;
		if (686518361 * aClass294_3170.anInt3163 == i)
			return aClass294_3170;
		return null;
	}

	public boolean method5256() {
		return aBool3171;
	}

	public boolean method5257() {
		return aBool3171;
	}

	public boolean method5258() {
		return aBool3171;
	}

	public boolean method5259() {
		return aBool3171;
	}

	static {
		aClass294_3164 = new Class294(1, false);
		aClass294_3168 = new Class294(2, true);
		aClass294_3166 = new Class294(3, false);
		aClass294_3167 = new Class294(4, true);
		aClass294_3169 = new Class294(5, true);
		aClass294_3170 = new Class294(6, true);
	}

	static void method5260(int i) {
		if (null == Class638.anIntArray8306)
			Class638.anIntArray8306 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < 512; i_1_++) {
			float f = ((float) (i_1_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_2_ = (float) (i_1_ & 0x7) / 8.0F + 0.0625F;
			for (int i_3_ = 0; i_3_ < 128; i_3_++) {
				float f_4_ = (float) i_3_ / 128.0F;
				float f_5_ = 0.0F;
				float f_6_ = 0.0F;
				float f_7_ = 0.0F;
				float f_8_ = f / 60.0F;
				int i_9_ = (int) f_8_;
				int i_10_ = i_9_ % 6;
				float f_11_ = f_8_ - (float) i_9_;
				float f_12_ = f_4_ * (1.0F - f_2_);
				float f_13_ = (1.0F - f_2_ * f_11_) * f_4_;
				float f_14_ = f_4_ * (1.0F - f_2_ * (1.0F - f_11_));
				if (i_10_ == 0) {
					f_5_ = f_4_;
					f_6_ = f_14_;
					f_7_ = f_12_;
				} else if (1 == i_10_) {
					f_5_ = f_13_;
					f_6_ = f_4_;
					f_7_ = f_12_;
				} else if (i_10_ == 2) {
					f_5_ = f_12_;
					f_6_ = f_4_;
					f_7_ = f_14_;
				} else if (i_10_ == 3) {
					f_5_ = f_12_;
					f_6_ = f_13_;
					f_7_ = f_4_;
				} else if (4 == i_10_) {
					f_5_ = f_14_;
					f_6_ = f_12_;
					f_7_ = f_4_;
				} else if (5 == i_10_) {
					f_5_ = f_4_;
					f_6_ = f_12_;
					f_7_ = f_13_;
				}
				f_5_ = (float) Math.pow((double) f_5_, d);
				f_6_ = (float) Math.pow((double) f_6_, d);
				f_7_ = (float) Math.pow((double) f_7_, d);
				int i_15_ = (int) (256.0F * f_5_);
				int i_16_ = (int) (f_6_ * 256.0F);
				int i_17_ = (int) (256.0F * f_7_);
				int i_18_ = i_17_ + ((i_16_ << 8) + ((i_15_ << 16) + -16777216));
				Class638.anIntArray8306[i_0_++] = i_18_;
			}
		}
	}

	public static int method5261(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static final void method5262(Class669 class669, int i) {
		int i_19_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_19_, -1756510367);
		Class242 class242 = Class31.aClass242Array302[i_19_ >> 16];
		Class483.method7923(class250, class242, class669, (byte) -62);
	}
}
