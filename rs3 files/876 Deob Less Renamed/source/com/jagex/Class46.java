/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class46 implements Interface13 {
	public int anInt667;
	public int anInt668;
	Class88 aClass88_669;
	public boolean aBool670 = false;
	int[] anIntArray671;
	public static Class10 aClass10_672;
	public static Class452 aClass452_673;

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1920213454);
			if (0 == i)
				break;
			method1239(class523_sub34, i, -394185441);
		}
	}

	public int[] method1238(Class178 class178, int i, boolean bool, short i_0_) {
		if (anIntArray671 != null)
			return anIntArray671;
		long l = (long) (-1232695553 * anInt667 | i << 16 | (bool ? 262144 : 0) | -1144788131 * class178.anInt1922 << 19);
		method1241(class178, i, bool, l);
		return anIntArray671;
	}

	void method1239(Class523_Sub34 class523_sub34, int i, int i_1_) {
		do {
			if (i == 1)
				anInt667 = class523_sub34.readBigSmart((byte) -76) * -1768394497;
			else if (2 == i)
				anInt668 = class523_sub34.read24BitInt(-1374516811) * -1694067081;
			else if (3 == i)
				aBool670 = true;
			else if (i == 4)
				anInt667 = 1768394497;
			else if (i == 5)
				break;
		} while (false);
	}

	public Class148 method1240(Class178 class178, int i, boolean bool, byte i_2_) {
		long l = (long) (-1232695553 * anInt667 | i << 16 | (bool ? 262144 : 0) | class178.anInt1922 * -1144788131 << 19);
		Class148 class148 = (Class148) aClass88_669.aClass209_885.method3767(l);
		if (null != class148)
			return class148;
		method1241(class178, i, bool, l);
		return (Class148) aClass88_669.aClass209_885.method3767(l);
	}

	public void method79() {
		/* empty */
	}

	void method1241(Class178 class178, int i, boolean bool, long l) {
		if (aClass88_669.aClass472_884.method7650(anInt667 * -1232695553, 141286778)) {
			Class175 class175 = Class166.method2658(aClass88_669.aClass472_884, anInt667 * -1232695553, 0);
			if (null != class175) {
				class175.method2950();
				if (bool)
					class175.method2998();
				for (int i_3_ = 0; i_3_ < i; i_3_++)
					class175.method2958();
				anIntArray671 = class175.method2959(false);
				if (0 != anInt668 * 1857430343) {
					int i_4_ = (1857430343 * anInt668 & 0xff0000) >> 16;
					int i_5_ = (anInt668 * 1857430343 & 0xff00) >> 8;
					int i_6_ = anInt668 * 1857430343 & 0xff;
					for (int i_7_ = 0; i_7_ < anIntArray671.length; i_7_++) {
						int i_8_ = anIntArray671[i_7_] >> 24 & 0xff;
						int i_9_ = 256 - i_8_;
						if (i_8_ != 0) {
							int i_10_ = ((anIntArray671[i_7_] & 0xff0000) * i_4_ * -16777216);
							int i_11_ = (16711680 * ((anIntArray671[i_7_] & 0xff00) * i_5_));
							int i_12_ = 65280 * ((anIntArray671[i_7_] & 0xff) * i_6_);
							int i_13_ = (i_10_ | i_11_ | i_12_) >>> 8;
							if (i_8_ == 255)
								anIntArray671[i_7_] = i_13_;
							else {
								int i_14_ = anIntArray671[i_7_];
								anIntArray671[i_7_] = (i_8_ << 24 | ((((i_14_ & 0xff00ff) * i_8_ + (i_13_ & 0xff00ff) * i_9_) & ~0xff00ff) + (((i_14_ & 0xff00) * i_8_ + i_9_ * (i_13_ & 0xff00)) & 0xff0000)) >> 8);
							}
						}
					}
				}
			}
			Class148 class148 = class178.method3104(class175, true);
			if (class148 != null)
				aClass88_669.aClass209_885.method3770(class148, l);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-776656093);
			if (0 == i)
				break;
			method1239(class523_sub34, i, -1347576012);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-289244668);
			if (0 == i)
				break;
			method1239(class523_sub34, i, -420289356);
		}
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1563366378);
			if (0 == i)
				break;
			method1239(class523_sub34, i, -1745957568);
		}
	}

	Class46(int i, Class88 class88) {
		aClass88_669 = class88;
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(251608318);
			if (0 == i)
				break;
			method1239(class523_sub34, i, -1724934262);
		}
	}

	public void method77() {
		/* empty */
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-598921462);
			if (0 == i)
				break;
			method1239(class523_sub34, i, -694115964);
		}
	}

	public void method78() {
		/* empty */
	}

	public boolean method1242(int i) {
		return aClass88_669.aClass472_884.method7650(-1232695553 * anInt667, -161910368);
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_15_ = class523_sub34.readUnsignedByte(-959066436);
			if (0 == i_15_)
				break;
			method1239(class523_sub34, i_15_, -404306052);
		}
	}

	public void method73() {
		/* empty */
	}

	void method1243(Class523_Sub34 class523_sub34, int i) {
		do {
			if (i == 1)
				anInt667 = class523_sub34.readBigSmart((byte) -118) * -1768394497;
			else if (2 == i)
				anInt668 = class523_sub34.read24BitInt(-392211425) * -1694067081;
			else if (3 == i)
				aBool670 = true;
			else if (i == 4)
				anInt667 = 1768394497;
			else if (i == 5)
				break;
		} while (false);
	}

	void method1244(Class523_Sub34 class523_sub34, int i) {
		do {
			if (i == 1)
				anInt667 = class523_sub34.readBigSmart((byte) -88) * -1768394497;
			else if (2 == i)
				anInt668 = class523_sub34.read24BitInt(804778299) * -1694067081;
			else if (3 == i)
				aBool670 = true;
			else if (i == 4)
				anInt667 = 1768394497;
			else if (i == 5)
				break;
		} while (false);
	}

	void method1245(Class523_Sub34 class523_sub34, int i) {
		do {
			if (i == 1)
				anInt667 = class523_sub34.readBigSmart((byte) -2) * -1768394497;
			else if (2 == i)
				anInt668 = class523_sub34.read24BitInt(1002021225) * -1694067081;
			else if (3 == i)
				aBool670 = true;
			else if (i == 4)
				anInt667 = 1768394497;
			else if (i == 5)
				break;
		} while (false);
	}

	public Class148 method1246(Class178 class178, int i, boolean bool) {
		long l = (long) (-1232695553 * anInt667 | i << 16 | (bool ? 262144 : 0) | class178.anInt1922 * -1144788131 << 19);
		Class148 class148 = (Class148) aClass88_669.aClass209_885.method3767(l);
		if (null != class148)
			return class148;
		method1241(class178, i, bool, l);
		return (Class148) aClass88_669.aClass209_885.method3767(l);
	}

	public Class148 method1247(Class178 class178, int i, boolean bool) {
		long l = (long) (-1232695553 * anInt667 | i << 16 | (bool ? 262144 : 0) | class178.anInt1922 * -1144788131 << 19);
		Class148 class148 = (Class148) aClass88_669.aClass209_885.method3767(l);
		if (null != class148)
			return class148;
		method1241(class178, i, bool, l);
		return (Class148) aClass88_669.aClass209_885.method3767(l);
	}

	public Class148 method1248(Class178 class178, int i, boolean bool) {
		long l = (long) (-1232695553 * anInt667 | i << 16 | (bool ? 262144 : 0) | class178.anInt1922 * -1144788131 << 19);
		Class148 class148 = (Class148) aClass88_669.aClass209_885.method3767(l);
		if (null != class148)
			return class148;
		method1241(class178, i, bool, l);
		return (Class148) aClass88_669.aClass209_885.method3767(l);
	}

	static void method1249(Class564 class564, int i, int i_16_, int i_17_, Class167 class167, int i_18_) {
		if (class167 != null)
			class564.method9478(i, i_16_, i_17_, class167.method2711(), class167.method2712(), class167.method2713(), class167.method2804(), class167.method2847(), class167.method2716(), class167.method2717());
	}

	static final int method1250(int i, int i_19_, int i_20_) {
		int i_21_ = (Class53_Sub19.method17231(45365 + i, i_19_ + 91923, 4, 1014439817) - 128 + (Class53_Sub19.method17231(i + 10294, i_19_ + 37821, 2, 1014439817) - 128 >> 1) + (Class53_Sub19.method17231(i, i_19_, 1, 1014439817) - 128 >> 2));
		i_21_ = (int) (0.3 * (double) i_21_) + 35;
		if (i_21_ < 10)
			i_21_ = 10;
		else if (i_21_ > 60)
			i_21_ = 60;
		return i_21_;
	}

	static final void method1251(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1 == 2097396553 * Class562.anInt7564 ? 1 : 0;
	}
}
