/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;

public class Class315 {
	int anInt3413;
	static final int anInt3414 = 11;
	static final int anInt3415 = 2048;
	static final int anInt3416 = 5;
	InputStream anInputStream3417;
	int anInt3418;
	static final int anInt3419 = -16777216;

	public int method5664(short[] is, int i) throws IOException {
		int i_0_ = is[i];
		int i_1_ = (anInt3413 * -389273231 >>> 11) * i_0_;
		if ((anInt3418 * -523850375 ^ ~0x7fffffff) < (i_1_ ^ ~0x7fffffff)) {
			anInt3413 = 975796113 * i_1_;
			is[i] = (short) ((2048 - i_0_ >>> 5) + i_0_);
			if (0 == (anInt3413 * -389273231 & ~0xffffff)) {
				anInt3418 = (-523850375 * anInt3418 << 8 | anInputStream3417.read()) * 1618554057;
				anInt3413 = (anInt3413 * -389273231 << 8) * 975796113;
			}
			return 0;
		}
		anInt3413 -= i_1_ * 975796113;
		anInt3418 -= 1618554057 * i_1_;
		is[i] = (short) (i_0_ - (i_0_ >>> 5));
		if ((-389273231 * anInt3413 & ~0xffffff) == 0) {
			anInt3418 = (-523850375 * anInt3418 << 8 | anInputStream3417.read()) * 1618554057;
			anInt3413 = (-389273231 * anInt3413 << 8) * 975796113;
		}
		return 1;
	}

	public final void method5665(InputStream inputstream, int i) {
		anInputStream3417 = inputstream;
	}

	public final void method5666(int i) throws IOException {
		anInt3418 = 0;
		anInt3413 = -975796113;
		for (int i_2_ = 0; i_2_ < 5; i_2_++)
			anInt3418 = (anInt3418 * -523850375 << 8 | anInputStream3417.read()) * 1618554057;
	}

	public static void method5667(short[] is) {
		for (int i = 0; i < is.length; i++)
			is[i] = (short) 1024;
	}

	public final int method5668(int i, int i_3_) throws IOException {
		int i_4_ = 0;
		for (int i_5_ = i; 0 != i_5_; i_5_--) {
			anInt3413 = (anInt3413 * -389273231 >>> 1) * 975796113;
			int i_6_ = -523850375 * anInt3418 - anInt3413 * -389273231 >>> 31;
			anInt3418 -= (anInt3413 * -389273231 & i_6_ - 1) * 1618554057;
			i_4_ = i_4_ << 1 | 1 - i_6_;
			if ((anInt3413 * -389273231 & ~0xffffff) == 0) {
				anInt3418 = (anInt3418 * -523850375 << 8 | anInputStream3417.read()) * 1618554057;
				anInt3413 = 975796113 * (anInt3413 * -389273231 << 8);
			}
		}
		return i_4_;
	}

	public int method5669(short[] is, int i, byte i_7_) throws IOException {
		int i_8_ = is[i];
		int i_9_ = (anInt3413 * -389273231 >>> 11) * i_8_;
		if ((anInt3418 * -523850375 ^ ~0x7fffffff) < (i_9_ ^ ~0x7fffffff)) {
			anInt3413 = 975796113 * i_9_;
			is[i] = (short) ((2048 - i_8_ >>> 5) + i_8_);
			if (0 == (anInt3413 * -389273231 & ~0xffffff)) {
				anInt3418 = (-523850375 * anInt3418 << 8 | anInputStream3417.read()) * 1618554057;
				anInt3413 = (anInt3413 * -389273231 << 8) * 975796113;
			}
			return 0;
		}
		anInt3413 -= i_9_ * 975796113;
		anInt3418 -= 1618554057 * i_9_;
		is[i] = (short) (i_8_ - (i_8_ >>> 5));
		if ((-389273231 * anInt3413 & ~0xffffff) == 0) {
			anInt3418 = (-523850375 * anInt3418 << 8 | anInputStream3417.read()) * 1618554057;
			anInt3413 = (-389273231 * anInt3413 << 8) * 975796113;
		}
		return 1;
	}

	public final void method5670() throws IOException {
		anInt3418 = 0;
		anInt3413 = -975796113;
		for (int i = 0; i < 5; i++)
			anInt3418 = (anInt3418 * -523850375 << 8 | anInputStream3417.read()) * 1618554057;
	}

	public final void method5671() throws IOException {
		anInt3418 = 0;
		anInt3413 = -975796113;
		for (int i = 0; i < 5; i++)
			anInt3418 = (anInt3418 * -523850375 << 8 | anInputStream3417.read()) * 1618554057;
	}

	public final void method5672(int i) {
		anInputStream3417 = null;
	}

	public final void method5673() throws IOException {
		anInt3418 = 0;
		anInt3413 = -975796113;
		for (int i = 0; i < 5; i++)
			anInt3418 = (anInt3418 * -523850375 << 8 | anInputStream3417.read()) * 1618554057;
	}

	public static void method5674(short[] is) {
		for (int i = 0; i < is.length; i++)
			is[i] = (short) 1024;
	}

	public static void method5675(short[] is) {
		for (int i = 0; i < is.length; i++)
			is[i] = (short) 1024;
	}

	public int method5676(short[] is, int i) throws IOException {
		int i_10_ = is[i];
		int i_11_ = (anInt3413 * -389273231 >>> 11) * i_10_;
		if ((anInt3418 * -523850375 ^ ~0x7fffffff) < (i_11_ ^ ~0x7fffffff)) {
			anInt3413 = 975796113 * i_11_;
			is[i] = (short) ((2048 - i_10_ >>> 5) + i_10_);
			if (0 == (anInt3413 * -389273231 & ~0xffffff)) {
				anInt3418 = (-523850375 * anInt3418 << 8 | anInputStream3417.read()) * 1618554057;
				anInt3413 = (anInt3413 * -389273231 << 8) * 975796113;
			}
			return 0;
		}
		anInt3413 -= i_11_ * 975796113;
		anInt3418 -= 1618554057 * i_11_;
		is[i] = (short) (i_10_ - (i_10_ >>> 5));
		if ((-389273231 * anInt3413 & ~0xffffff) == 0) {
			anInt3418 = (-523850375 * anInt3418 << 8 | anInputStream3417.read()) * 1618554057;
			anInt3413 = (-389273231 * anInt3413 << 8) * 975796113;
		}
		return 1;
	}

	static boolean method5677(byte i) {
		return Class276.method5047(Class61.aClass633_769.aClass574_8265, (byte) -19);
	}

	static final void method5678(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		if (class669.anIntArray8557[1357652815 * class669.anInt8558] <= class669.anIntArray8557[1 + class669.anInt8558 * 1357652815])
			class669.anInt8579 += -1774429083 * (class669.anIntArray8577[1180759405 * class669.anInt8579]);
	}

	static void method5679(InterfaceComponentDefinitions class250, int i, int i_12_, int i_13_) {
		Class236 class236 = class250.method4440(Class31.aClass178_303, (byte) -100);
		if (class236 != null) {
			Class31.aClass178_303.method3378(i, i_12_, (class250.anInt2581 * 365308179 + i), (-1759297857 * class250.anInt2543 + i_12_));
			if (Class104.anInt1274 * 487176641 < 3) {
				int i_14_;
				if (Class562.anInt7564 * 2097396553 == 2)
					i_14_ = (int) -((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-2124975727) * 2607.5945876176133);
				else
					i_14_ = (int) -client.aFloat11129;
				i_14_ = i_14_ + 1449970926 * client.anInt11094 & 0x3fff;
				i_14_ <<= 2;
				Class168.aClass148_1800.method2447(((float) i + (float) (class250.anInt2581 * 365308179) / 2.0F), ((float) (-1759297857 * class250.anInt2543) / 2.0F + (float) i_12_), 4124, i_14_, class236.aClass145_2392, i, i_12_);
			} else
				Class31.aClass178_303.method3110(-16777216, class236.aClass145_2392, i, i_12_);
		}
	}

	static final void method5680(Class669 class669, byte i) {
		Class264.method4746((String) (class669.anObjectArray8559[((class669.anInt8560 -= 1235970069) * 240723773)]), false, false, -1981057280);
	}

	public static int method5681(int i) {
		return (Class569.aTwitchWebcamDeviceArray7648 == null ? 0 : Class569.aTwitchWebcamDeviceArray7648.length);
	}

	static final void method5682(Class669 class669, byte i) {
		int i_15_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_15_, -2111580706);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2544 * -1904547845;
	}
}
