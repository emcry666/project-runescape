/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class210 implements Interface75 {
	public static Class210 aClass210_2258 = new Class210(0, 0);
	public static Class210 aClass210_2259 = new Class210(1, 1);
	public static Class210 aClass210_2260 = new Class210(2, 2);
	int anInt2261;
	int anInt2262;

	public int method101() {
		return 1417239747 * anInt2262;
	}

	public static Class210[] method3812() {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	public int method82() {
		return 1417239747 * anInt2262;
	}

	public int method6() {
		return 1417239747 * anInt2262;
	}

	public static Class210[] method3813() {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	public static Class210[] method3814() {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	public static Class210[] method3815(int i) {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	public static Class210[] method3816() {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	public static Class210[] method3817() {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	public static Class210[] method3818() {
		return (new Class210[] { aClass210_2258, aClass210_2259, aClass210_2260 });
	}

	Class210(int i, int i_0_) {
		anInt2261 = 1383110945 * i;
		anInt2262 = 245314539 * i_0_;
	}

	static Class47_Sub1 method3819(int i) {
		Class47_Sub1 class47_sub1 = new Class47_Sub1();
		boolean bool = false;
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		if (Class611.aString8013.startsWith("win")) {
			bool_1_ = true;
			bool = true;
			bool_2_ = true;
		} else {
			bool = true;
			bool_2_ = true;
		}
		if (Class105.aBool1284) {
			class47_sub1.method16586(16, -1694238555);
			bool = false;
		}
		if (Class105.aBool1275) {
			class47_sub1.method16586(32, -957106505);
			bool_1_ = false;
		}
		if (Class105.aBool1286) {
			class47_sub1.method16586(16384, 1734684882);
			bool_2_ = false;
		}
		if (!bool && !bool_1_) {
			Class334.method5909(class47_sub1, (short) -24445);
			return class47_sub1;
		}
		int i_3_ = -1;
		int i_4_ = -1;
		int i_5_ = -1;
		if (bool_1_) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 3, -718190933);
				Class211.method3824(1334098493);
				i_4_ = Class678.method13821(3, 1000, -1794748136);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 58) == 3) {
					class47_sub1.method16586(4, -261871477);
					Class150 class150 = Class31.aClass178_303.method3401();
					long l = (7027606198026803059L * class150.aLong1724 & 0xffffffffffffL);
					switch (class150.anInt1720 * -129955305) {
					case 4098: {
						boolean bool_6_ = l >= 60129613779L;
						bool &= bool_6_;
						if (!bool_6_)
							class47_sub1.method16586(512, 362252227);
						break;
					}
					case 4318: {
						boolean bool_7_ = l >= 64425238954L;
						bool &= bool_7_;
						if (!bool_7_)
							class47_sub1.method16586(256, -2075473306);
						break;
					}
					}
				}
			} catch (Exception exception) {
				class47_sub1.method16586(4096, -1071924805);
			}
		}
		if (bool_2_) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 5, 1795472690);
				Class211.method3824(1708487243);
				i_5_ = Class678.method13821(5, 1000, -1836807882);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -23) == 5)
					class47_sub1.method16586(8192, 1203594599);
			} catch (Exception exception) {
				class47_sub1.method16586(32768, -765824184);
			}
		}
		if (bool) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 4, 302093241);
				Class211.method3824(1627418746);
				i_3_ = Class678.method13821(1, 1000, -1714041986);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 117) == 1)
					class47_sub1.method16586(2, 2134266945);
			} catch (Exception exception) {
				class47_sub1.method16586(2048, 1099688215);
			}
		}
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub23_10608), 0, 458190979);
		if (-1 == i_3_ && -1 == i_4_) {
			Class334.method5909(class47_sub1, (short) -10825);
			return class47_sub1;
		}
		class47_sub1.method16581(3, i_4_, -1072276466);
		class47_sub1.method16581(1, i_3_, -682145253);
		class47_sub1.method16581(5, i_5_, 1473075466);
		i_4_ *= 1.3F;
		if (i_4_ > 100000 && i_3_ > 100000 || i_4_ > i_3_)
			Class411.method6636(class47_sub1, 3, i_3_ == -1 ? i_4_ : i_3_, 310725429);
		else
			Class411.method6636(class47_sub1, 1, i_4_ == -1 ? i_3_ : i_4_, 310725429);
		return class47_sub1;
	}

	public static final void method3820(int i) {
		Class268.anImage2868 = null;
		Class220.aFont2330 = null;
	}

	static final void method3821(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_8_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_9_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		if (i_8_ == 0)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else if (0 == i_9_)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 2147483647;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) Math.pow((double) i_8_, 1.0 / (double) i_9_);
	}
}
