/* Class523_Sub34_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub34_Sub2 extends Class523_Sub34 {
	Class11 aClass11_11835;
	static int[] anIntArray11836 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	int anInt11837;

	public void method18217(Class11 class11) {
		aClass11_11835 = class11;
	}

	public void method18218(Class11 class11, int i) {
		aClass11_11835 = class11;
	}

	public void method18219(int i, int i_0_) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + aClass11_11835.method641((byte) -113));
	}

	public int method18220(int i) {
		return ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -118)) & 0xff);
	}

	public Class523_Sub34_Sub2(int i) {
		super(i);
	}

	public int method18221(byte i) {
		int i_1_ = ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -40)) & 0xff);
		if (i_1_ < 128)
			return i_1_;
		return ((i_1_ - 128 << 8) + ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -98)) & 0xff));
	}

	public void method18222(byte[] is, int i, int i_2_, byte i_3_) {
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
			is[i_4_ + i] = (byte) ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]) - aClass11_11835.method641((byte) -28));
	}

	public void method18223(int i) {
		anInt11837 = 577280584 * anInt10661;
	}

	public int method18224(int i) {
		int i_5_ = -19450309 * anInt11837 >> 3;
		int i_6_ = 8 - (anInt11837 * -19450309 & 0x7);
		int i_7_ = 0;
		anInt11837 += -2124401933 * i;
		for (/**/; i > i_6_; i_6_ = 8) {
			i_7_ += ((aByteArray10658[i_5_++] & anIntArray11836[i_6_]) << i - i_6_);
			i -= i_6_;
		}
		if (i == i_6_)
			i_7_ += aByteArray10658[i_5_] & anIntArray11836[i_6_];
		else
			i_7_ += aByteArray10658[i_5_] >> i_6_ - i & anIntArray11836[i];
		return i_7_;
	}

	public boolean method18225(int i) {
		int i_8_ = ((aByteArray10658[anInt10661 * 2349011] - aClass11_11835.method642(-1789282346)) & 0xff);
		if (i_8_ < 128)
			return false;
		return true;
	}

	public int method18226(int i, int i_9_) {
		return 8 * i - anInt11837 * -19450309;
	}

	public void method18227(Class11 class11) {
		aClass11_11835 = class11;
	}

	public void method18228() {
		anInt10661 = (-19450309 * anInt11837 + 7) / 8 * 189765723;
	}

	public void method18229(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + aClass11_11835.method641((byte) -52));
	}

	public void method18230(int i) {
		aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] = (byte) (i + aClass11_11835.method641((byte) -72));
	}

	public int method18231() {
		return ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -72)) & 0xff);
	}

	public void method18232(int i) {
		anInt10661 = (-19450309 * anInt11837 + 7) / 8 * 189765723;
	}

	public int method18233() {
		return ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -69)) & 0xff);
	}

	public boolean method18234() {
		int i = ((aByteArray10658[anInt10661 * 2349011] - aClass11_11835.method642(-1136397354)) & 0xff);
		if (i < 128)
			return false;
		return true;
	}

	public boolean method18235() {
		int i = ((aByteArray10658[anInt10661 * 2349011] - aClass11_11835.method642(-1746879566)) & 0xff);
		if (i < 128)
			return false;
		return true;
	}

	public void method18236(byte[] is, int i, int i_10_) {
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
			is[i_11_ + i] = (byte) ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1]) - aClass11_11835.method641((byte) -59));
	}

	public int method18237() {
		int i = ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -44)) & 0xff);
		if (i < 128)
			return i;
		return ((i - 128 << 8) + ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -94)) & 0xff));
	}

	public int method18238(int i) {
		int i_12_ = -19450309 * anInt11837 >> 3;
		int i_13_ = 8 - (anInt11837 * -19450309 & 0x7);
		int i_14_ = 0;
		anInt11837 += -2124401933 * i;
		for (/**/; i > i_13_; i_13_ = 8) {
			i_14_ += ((aByteArray10658[i_12_++] & anIntArray11836[i_13_]) << i - i_13_);
			i -= i_13_;
		}
		if (i == i_13_)
			i_14_ += aByteArray10658[i_12_] & anIntArray11836[i_13_];
		else
			i_14_ += aByteArray10658[i_12_] >> i_13_ - i & anIntArray11836[i];
		return i_14_;
	}

	public void method18239() {
		anInt11837 = 577280584 * anInt10661;
	}

	public int method18240(int i) {
		int i_15_ = -19450309 * anInt11837 >> 3;
		int i_16_ = 8 - (anInt11837 * -19450309 & 0x7);
		int i_17_ = 0;
		anInt11837 += -2124401933 * i;
		for (/**/; i > i_16_; i_16_ = 8) {
			i_17_ += ((aByteArray10658[i_15_++] & anIntArray11836[i_16_]) << i - i_16_);
			i -= i_16_;
		}
		if (i == i_16_)
			i_17_ += aByteArray10658[i_15_] & anIntArray11836[i_16_];
		else
			i_17_ += aByteArray10658[i_15_] >> i_16_ - i & anIntArray11836[i];
		return i_17_;
	}

	public int method18241() {
		int i = ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -47)) & 0xff);
		if (i < 128)
			return i;
		return ((i - 128 << 8) + ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -69)) & 0xff));
	}

	public int readBits(int i, int i_18_) {
		int i_19_ = -19450309 * anInt11837 >> 3;
		int i_20_ = 8 - (anInt11837 * -19450309 & 0x7);
		int i_21_ = 0;
		anInt11837 += -2124401933 * i;
		for (/**/; i > i_20_; i_20_ = 8) {
			i_21_ += ((aByteArray10658[i_19_++] & anIntArray11836[i_20_]) << i - i_20_);
			i -= i_20_;
		}
		if (i == i_20_)
			i_21_ += aByteArray10658[i_19_] & anIntArray11836[i_20_];
		else
			i_21_ += aByteArray10658[i_19_] >> i_20_ - i & anIntArray11836[i];
		return i_21_;
	}

	public int method18243() {
		return ((aByteArray10658[(anInt10661 += 189765723) * 2349011 - 1] - aClass11_11835.method641((byte) -32)) & 0xff);
	}
}
