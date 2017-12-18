/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class526 {
	Class537 this$1;
	short[] aShortArray7090;

	byte method8713(Class315 class315, int i) throws IOException {
		int i_0_ = 1;
		do
			i_0_ = i_0_ << 1 | class315.method5669(aShortArray7090, i_0_, (byte) -116);
		while (i_0_ < 256);
		return (byte) i_0_;
	}

	void method8714(int i) {
		Class304.method5544(aShortArray7090, (byte) -92);
	}

	byte method8715(Class315 class315) throws IOException {
		int i = 1;
		do
			i = i << 1 | class315.method5669(aShortArray7090, i, (byte) 124);
		while (i < 256);
		return (byte) i;
	}

	Class526(Class537 class537) {
		this$1 = class537;
		aShortArray7090 = new short[768];
	}

	byte method8716(Class315 class315, byte i, int i_1_) throws IOException {
		int i_2_ = 1;
		do {
			int i_3_ = i >> 7 & 0x1;
			i <<= 1;
			int i_4_ = class315.method5669(aShortArray7090, (i_3_ + 1 << 8) + i_2_, (byte) -124);
			i_2_ = i_2_ << 1 | i_4_;
			if (i_3_ != i_4_) {
				for (/**/; i_2_ < 256; i_2_ = i_2_ << 1 | class315.method5669(aShortArray7090, i_2_, (byte) -36)) {
					/* empty */
				}
				break;
			}
		} while (i_2_ < 256);
		return (byte) i_2_;
	}

	void method8717() {
		Class304.method5544(aShortArray7090, (byte) -10);
	}

	byte method8718(Class315 class315) throws IOException {
		int i = 1;
		do
			i = i << 1 | class315.method5669(aShortArray7090, i, (byte) -12);
		while (i < 256);
		return (byte) i;
	}

	byte method8719(Class315 class315) throws IOException {
		int i = 1;
		do
			i = i << 1 | class315.method5669(aShortArray7090, i, (byte) -71);
		while (i < 256);
		return (byte) i;
	}

	void method8720() {
		Class304.method5544(aShortArray7090, (byte) 54);
	}

	byte method8721(Class315 class315, byte i) throws IOException {
		int i_5_ = 1;
		do {
			int i_6_ = i >> 7 & 0x1;
			i <<= 1;
			int i_7_ = class315.method5669(aShortArray7090, (i_6_ + 1 << 8) + i_5_, (byte) -6);
			i_5_ = i_5_ << 1 | i_7_;
			if (i_6_ != i_7_) {
				for (/**/; i_5_ < 256; i_5_ = i_5_ << 1 | class315.method5669(aShortArray7090, i_5_, (byte) 57)) {
					/* empty */
				}
				break;
			}
		} while (i_5_ < 256);
		return (byte) i_5_;
	}

	byte method8722(Class315 class315, byte i) throws IOException {
		int i_8_ = 1;
		do {
			int i_9_ = i >> 7 & 0x1;
			i <<= 1;
			int i_10_ = class315.method5669(aShortArray7090, (i_9_ + 1 << 8) + i_8_, (byte) -3);
			i_8_ = i_8_ << 1 | i_10_;
			if (i_9_ != i_10_) {
				for (/**/; i_8_ < 256; i_8_ = i_8_ << 1 | class315.method5669(aShortArray7090, i_8_, (byte) -88)) {
					/* empty */
				}
				break;
			}
		} while (i_8_ < 256);
		return (byte) i_8_;
	}

	byte method8723(Class315 class315, byte i) throws IOException {
		int i_11_ = 1;
		do {
			int i_12_ = i >> 7 & 0x1;
			i <<= 1;
			int i_13_ = class315.method5669(aShortArray7090, (i_12_ + 1 << 8) + i_11_, (byte) -51);
			i_11_ = i_11_ << 1 | i_13_;
			if (i_12_ != i_13_) {
				for (/**/; i_11_ < 256; i_11_ = i_11_ << 1 | class315.method5669(aShortArray7090, i_11_, (byte) 22)) {
					/* empty */
				}
				break;
			}
		} while (i_11_ < 256);
		return (byte) i_11_;
	}

	byte method8724(Class315 class315, byte i) throws IOException {
		int i_14_ = 1;
		do {
			int i_15_ = i >> 7 & 0x1;
			i <<= 1;
			int i_16_ = class315.method5669(aShortArray7090, (i_15_ + 1 << 8) + i_14_, (byte) -94);
			i_14_ = i_14_ << 1 | i_16_;
			if (i_15_ != i_16_) {
				for (/**/; i_14_ < 256; i_14_ = i_14_ << 1 | class315.method5669(aShortArray7090, i_14_, (byte) 59)) {
					/* empty */
				}
				break;
			}
		} while (i_14_ < 256);
		return (byte) i_14_;
	}

	public static void method8725(int i) {
		synchronized (Class38.aClass209_374) {
			Class38.aClass209_374.method3773(-1840509167);
		}
	}

	public static int method8726(CharSequence charsequence, byte i) {
		int i_17_ = charsequence.length();
		int i_18_ = 0;
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
			char c = charsequence.charAt(i_19_);
			if (c <= '\u007f')
				i_18_++;
			else if (c <= '\u07ff')
				i_18_ += 2;
			else
				i_18_ += 3;
		}
		return i_18_;
	}

	static final void method8727(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2674 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static final void method8728(Class669 class669, short i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_20_ = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560 + 1]);
		if (Class241.player.aClass623_12183 != null && (Class241.player.aClass623_12183.aBool8104))
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string_20_;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
	}

	static final void method8729(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -218297867 * Class375_Sub1.anInt10163;
	}
}
