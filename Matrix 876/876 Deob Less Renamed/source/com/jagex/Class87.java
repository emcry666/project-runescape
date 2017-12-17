/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class87 {
	static Random aRandom882;
	static Object anObject883 = new Object();

	public static int method1604(int i) {
		int i_0_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_0_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_0_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_0_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_0_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_0_++;
		}
		return i_0_ + i;
	}

	public static int method1605(int i) {
		int i_1_ = i >>> 1;
		i_1_ |= i_1_ >>> 1;
		i_1_ |= i_1_ >>> 2;
		i_1_ |= i_1_ >>> 4;
		i_1_ |= i_1_ >>> 8;
		i_1_ |= i_1_ >>> 16;
		return i & (i_1_ ^ 0xffffffff);
	}

	public static int method1606(int i, int i_2_) {
		int i_3_ = 1;
		for (/**/; i_2_ > 1; i_2_ >>= 1) {
			if (0 != (i_2_ & 0x1))
				i_3_ *= i;
			i *= i;
		}
		if (1 == i_2_)
			return i_3_ * i;
		return i_3_;
	}

	public static int method1607(int i, int i_4_) {
		int i_5_ = 1;
		for (/**/; i_4_ > 1; i_4_ >>= 1) {
			if (0 != (i_4_ & 0x1))
				i_5_ *= i;
			i *= i;
		}
		if (1 == i_4_)
			return i_5_ * i;
		return i_5_;
	}

	public static int method1608(int i, int i_6_) {
		int i_7_ = 1;
		for (/**/; i_6_ > 1; i_6_ >>= 1) {
			if (0 != (i_6_ & 0x1))
				i_7_ *= i;
			i *= i;
		}
		if (1 == i_6_)
			return i_7_ * i;
		return i_7_;
	}

	public static int method1609(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	Class87() throws Throwable {
		throw new Error();
	}

	static int method1610(int i, int i_8_) {
		int i_9_ = i >> 31 & i_8_ - 1;
		return i_9_ + ((i >>> 31) + i) % i_8_;
	}

	public static boolean method1611(int i) {
		return i == (i & -i);
	}

	public static int method1612(int i) {
		int i_10_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_10_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_10_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_10_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_10_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_10_++;
		}
		return i_10_ + i;
	}

	public static int method1613(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public static int method1614(Random random, int i) {
		if (null == random) {
			random = aRandom882;
			if (random == null) {
				synchronized (anObject883) {
					if (aRandom882 == null)
						aRandom882 = new Random();
					random = aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class318.method5691(i, -1658164513))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_11_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_12_;
		do
			i_12_ = random.nextInt();
		while (i_12_ >= i_11_);
		return Class542.method9002(i_12_, i, 440153011);
	}

	static void method1615(int i) {
		if (Class449.aClass523_Sub33_4946.aClass687_Sub29_10647.method16971((byte) -92) == 1)
			Class329_Sub2.aClass511_10050.method8556(new Class496(Class500.aClass500_5574, null), (short) -20367);
		else {
			client.aClass505_11019.method8294(-889374440);
			Class321.method5720((byte) -25);
		}
	}
}
