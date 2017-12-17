/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class72 {
	public int anInt797;
	int anInt798;
	static int anInt799;

	public void method1491() {
		anInt797 = (anInt797 * 1230650225 & 0x3fff) * -979556975;
	}

	public void method1492() {
		anInt797 = (anInt797 * 1230650225 & 0x3fff) * -979556975;
	}

	public void method1493(int i, int i_0_) {
		anInt797 = -979556975 * i;
		anInt798 = 0;
	}

	public int method1494(byte i) {
		return anInt797 * 1230650225 & 0x3fff;
	}

	public int method1495() {
		return anInt797 * 1230650225 & 0x3fff;
	}

	public void method1496(int i) {
		anInt797 = -979556975 * i;
		anInt798 = 0;
	}

	public void method1497(int i) {
		anInt797 = -979556975 * i;
		anInt798 = 0;
	}

	public void method1498(int i) {
		anInt797 = -979556975 * i;
		anInt798 = 0;
	}

	public int method1499() {
		return anInt797 * 1230650225 & 0x3fff;
	}

	public int method1500() {
		return anInt797 * 1230650225 & 0x3fff;
	}

	public int method1501() {
		return anInt797 * 1230650225 & 0x3fff;
	}

	public int method1502() {
		return anInt797 * 1230650225 & 0x3fff;
	}

	public void method1503() {
		anInt797 = (anInt797 * 1230650225 & 0x3fff) * -979556975;
	}

	public void method1504(int i) {
		anInt797 = (anInt797 * 1230650225 & 0x3fff) * -979556975;
	}

	public void method1505() {
		anInt797 = (anInt797 * 1230650225 & 0x3fff) * -979556975;
	}

	public boolean method1506(int i, int i_1_, int i_2_, int i_3_) {
		int i_4_ = 739583253 * anInt798;
		if (i == 1230650225 * anInt797 && 739583253 * anInt798 == 0)
			return false;
		boolean bool;
		if (0 == anInt798 * 739583253) {
			if (i > anInt797 * 1230650225 && i <= 1230650225 * anInt797 + i_1_ || (i < 1230650225 * anInt797 && i >= 1230650225 * anInt797 - i_1_)) {
				anInt797 = -979556975 * i;
				return false;
			}
			bool = true;
		} else if (739583253 * anInt798 > 0 && i > anInt797 * 1230650225) {
			int i_5_ = anInt798 * 739583253 * (739583253 * anInt798) / (2 * i_1_);
			int i_6_ = 1230650225 * anInt797 + i_5_;
			if (i_6_ >= i || i_6_ < 1230650225 * anInt797)
				bool = false;
			else
				bool = true;
		} else if (739583253 * anInt798 < 0 && i < 1230650225 * anInt797) {
			int i_7_ = anInt798 * 739583253 * (739583253 * anInt798) / (2 * i_1_);
			int i_8_ = anInt797 * 1230650225 - i_7_;
			if (i_8_ <= i || i_8_ > anInt797 * 1230650225)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > anInt797 * 1230650225) {
				anInt798 += -2063859139 * i_1_;
				if (i_2_ != 0 && anInt798 * 739583253 > i_2_)
					anInt798 = -2063859139 * i_2_;
			} else {
				anInt798 -= i_1_ * -2063859139;
				if (i_2_ != 0 && anInt798 * 739583253 < -i_2_)
					anInt798 = -2063859139 * -i_2_;
			}
			if (i_4_ != anInt798 * 739583253) {
				int i_9_ = (739583253 * anInt798 * (739583253 * anInt798) / (2 * i_1_));
				if (i > anInt797 * 1230650225) {
					if (1230650225 * anInt797 + i_9_ > i)
						anInt798 = -2063859139 * i_4_;
				} else if (i < 1230650225 * anInt797 && 1230650225 * anInt797 - i_9_ < i)
					anInt798 = -2063859139 * i_4_;
			}
		} else if (739583253 * anInt798 > 0) {
			anInt798 -= i_1_ * -2063859139;
			if (anInt798 * 739583253 < 0)
				anInt798 = 0;
		} else {
			anInt798 += i_1_ * -2063859139;
			if (739583253 * anInt798 > 0)
				anInt798 = 0;
		}
		anInt797 += -979556975 * (i_4_ + anInt798 * 739583253 >> 1);
		return bool;
	}

	static ItemsContainer method1507(int i, boolean bool, int i_10_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		return (ItemsContainer) ItemsContainer.containers.getFromIndex(l);
	}
}
