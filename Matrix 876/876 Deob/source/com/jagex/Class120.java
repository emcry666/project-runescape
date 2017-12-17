/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class120 {
	int anInt1475;
	Class132 aClass132_1476;
	int anInt1477;
	Class178_Sub1 aClass178_Sub1_1478;
	int anInt1479 = 0;
	Class117[] aClass117Array1480;
	Class117_Sub8 aClass117_Sub8_1481;

	void method2067(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= aClass178_Sub1_1478.method14654();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (anInt1475 != i) {
			if (anInt1475 != 0)
				aClass117Array1480[anInt1475 & 0x7fffffff].method2028();
			if (i != 0) {
				aClass117Array1480[i & 0x7fffffff].method2026(bool);
				aClass117Array1480[i & 0x7fffffff].method2011(bool);
				aClass117Array1480[i & 0x7fffffff].method2010(i_0_, i_1_);
			}
			anInt1475 = i;
			anInt1479 = i_0_;
			anInt1477 = i_1_;
		} else if (anInt1475 != 0) {
			aClass117Array1480[anInt1475 & 0x7fffffff].method2011(bool);
			if (anInt1479 != i_0_ || anInt1477 != i_1_) {
				aClass117Array1480[anInt1475 & 0x7fffffff].method2010(i_0_, i_1_);
				anInt1479 = i_0_;
				anInt1477 = i_1_;
			}
		}
	}

	boolean method2068(int i) {
		return aClass117Array1480[i].method2009();
	}

	void method2069(int i, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		bool_5_ &= aClass178_Sub1_1478.method14654();
		if (!bool_5_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_4_ = i_3_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (anInt1475 != i) {
			if (anInt1475 != 0)
				aClass117Array1480[anInt1475 & 0x7fffffff].method2028();
			if (i != 0) {
				aClass117Array1480[i & 0x7fffffff].method2026(bool);
				aClass117Array1480[i & 0x7fffffff].method2011(bool);
				aClass117Array1480[i & 0x7fffffff].method2010(i_3_, i_4_);
			}
			anInt1475 = i;
			anInt1479 = i_3_;
			anInt1477 = i_4_;
		} else if (anInt1475 != 0) {
			aClass117Array1480[anInt1475 & 0x7fffffff].method2011(bool);
			if (anInt1479 != i_3_ || anInt1477 != i_4_) {
				aClass117Array1480[anInt1475 & 0x7fffffff].method2010(i_3_, i_4_);
				anInt1479 = i_3_;
				anInt1477 = i_4_;
			}
		}
	}

	boolean method2070(Class126 class126, int i) {
		if (anInt1475 == 0)
			return false;
		aClass117Array1480[anInt1475 & 0x7fffffff].method2013(class126, i);
		return true;
	}

	boolean method2071(int i) {
		return aClass117Array1480[i].method2009();
	}

	boolean method2072(int i) {
		return aClass117Array1480[i].method2009();
	}

	void method2073(int i, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
		bool_8_ &= aClass178_Sub1_1478.method14654();
		if (!bool_8_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_7_ = i_6_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (anInt1475 != i) {
			if (anInt1475 != 0)
				aClass117Array1480[anInt1475 & 0x7fffffff].method2028();
			if (i != 0) {
				aClass117Array1480[i & 0x7fffffff].method2026(bool);
				aClass117Array1480[i & 0x7fffffff].method2011(bool);
				aClass117Array1480[i & 0x7fffffff].method2010(i_6_, i_7_);
			}
			anInt1475 = i;
			anInt1479 = i_6_;
			anInt1477 = i_7_;
		} else if (anInt1475 != 0) {
			aClass117Array1480[anInt1475 & 0x7fffffff].method2011(bool);
			if (anInt1479 != i_6_ || anInt1477 != i_7_) {
				aClass117Array1480[anInt1475 & 0x7fffffff].method2010(i_6_, i_7_);
				anInt1479 = i_6_;
				anInt1477 = i_7_;
			}
		}
	}

	boolean method2074(Class126 class126, int i) {
		if (anInt1475 == 0)
			return false;
		aClass117Array1480[anInt1475 & 0x7fffffff].method2013(class126, i);
		return true;
	}

	boolean method2075(Class126 class126, int i) {
		if (anInt1475 == 0)
			return false;
		aClass117Array1480[anInt1475 & 0x7fffffff].method2013(class126, i);
		return true;
	}

	boolean method2076(Class126 class126, int i) {
		if (anInt1475 == 0)
			return false;
		aClass117Array1480[anInt1475 & 0x7fffffff].method2013(class126, i);
		return true;
	}

	Class120(Class178_Sub1 class178_sub1) {
		anInt1477 = 0;
		anInt1475 = 0;
		aClass178_Sub1_1478 = class178_sub1;
		aClass132_1476 = new Class132(class178_sub1);
		aClass117Array1480 = new Class117[16];
		aClass117Array1480[1] = new Class117_Sub1(class178_sub1);
		aClass117Array1480[2] = new Class117_Sub9(class178_sub1, aClass132_1476);
		aClass117Array1480[4] = new Class117_Sub3(class178_sub1, aClass132_1476);
		aClass117Array1480[5] = new Class117_Sub6(class178_sub1, aClass132_1476);
		aClass117Array1480[6] = new Class117_Sub7(class178_sub1);
		aClass117Array1480[7] = new Class117_Sub4(class178_sub1);
		aClass117Array1480[3] = aClass117_Sub8_1481 = new Class117_Sub8(class178_sub1);
		aClass117Array1480[8] = new Class117_Sub5(class178_sub1, aClass132_1476);
		aClass117Array1480[9] = new Class117_Sub2(class178_sub1, aClass132_1476);
		if (!aClass117Array1480[8].method2009())
			aClass117Array1480[8] = aClass117Array1480[4];
		if (!aClass117Array1480[9].method2009())
			aClass117Array1480[9] = aClass117Array1480[8];
	}

	boolean method2077(Class126 class126, int i) {
		if (anInt1475 == 0)
			return false;
		aClass117Array1480[anInt1475 & 0x7fffffff].method2013(class126, i);
		return true;
	}
}
