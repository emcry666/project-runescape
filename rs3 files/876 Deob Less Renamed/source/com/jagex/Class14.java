/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public final class Class14 implements Iterable {
	long aLong174;
	Class523[] aClass523Array175;
	int anInt176 = 0;
	Class523 aClass523_177;
	Class523 aClass523_178;
	int anInt179;

	public void method733(int i) {
		for (int i_0_ = 0; i_0_ < -2088127127 * anInt179; i_0_++) {
			Class523 class523 = aClass523Array175[i_0_];
			for (;;) {
				Class523 class523_1_ = class523.aClass523_7063;
				if (class523 == class523_1_)
					break;
				class523_1_.method8661(607052656);
			}
		}
		aClass523_177 = null;
		aClass523_178 = null;
	}

	public int method734(int i) {
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < -2088127127 * anInt179; i_3_++) {
			Class523 class523 = aClass523Array175[i_3_];
			for (Class523 class523_4_ = class523.aClass523_7063; class523_4_ != class523; class523_4_ = class523_4_.aClass523_7063)
				i_2_++;
		}
		return i_2_;
	}

	public Class523 method735(int i) {
		anInt176 = 0;
		return method749(889697639);
	}

	public Iterator method736() {
		return new Class15(this);
	}

	public void method737(Class523 class523, long l) {
		if (class523.aClass523_7064 != null)
			class523.method8661(607052656);
		Class523 class523_5_ = (aClass523Array175[(int) (l & (long) (anInt179 * -2088127127 - 1))]);
		class523.aClass523_7064 = class523_5_.aClass523_7064;
		class523.aClass523_7063 = class523_5_;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
		class523.aLong7065 = l * 2947252533757437993L;
	}

	public void method738(Class523 class523, long l) {
		if (class523.aClass523_7064 != null)
			class523.method8661(607052656);
		Class523 class523_6_ = (aClass523Array175[(int) (l & (long) (anInt179 * -2088127127 - 1))]);
		class523.aClass523_7064 = class523_6_.aClass523_7064;
		class523.aClass523_7063 = class523_6_;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
		class523.aLong7065 = l * 2947252533757437993L;
	}

	public int method739(Class523[] class523s, byte i) {
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < -2088127127 * anInt179; i_8_++) {
			Class523 class523 = aClass523Array175[i_8_];
			for (Class523 class523_9_ = class523.aClass523_7063; class523_9_ != class523; class523_9_ = class523_9_.aClass523_7063)
				class523s[i_7_++] = class523_9_;
		}
		return i_7_;
	}

	public Class14(int i) {
		anInt179 = 1781672665 * i;
		aClass523Array175 = new Class523[i];
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Class523 class523 = aClass523Array175[i_10_] = new Class523();
			class523.aClass523_7063 = class523;
			class523.aClass523_7064 = class523;
		}
	}

	public Class523 method740(int i) {
		if (aClass523_177 == null)
			return null;
		for (Class523 class523 = aClass523Array175[(int) (aLong174 * -2111938628972853035L & (long) (anInt179 * -2088127127 - 1))]; class523 != aClass523_177; aClass523_177 = aClass523_177.aClass523_7063) {
			if (1055205983951172633L * aClass523_177.aLong7065 == -2111938628972853035L * aLong174) {
				Class523 class523_11_ = aClass523_177;
				aClass523_177 = aClass523_177.aClass523_7063;
				return class523_11_;
			}
		}
		aClass523_177 = null;
		return null;
	}

	public Iterator iterator() {
		return new Class15(this);
	}

	public Class523 method741(long l) {
		aLong174 = l * -3844119923491000195L;
		Class523 class523 = (aClass523Array175[(int) (l & (long) (-2088127127 * anInt179 - 1))]);
		for (aClass523_177 = class523.aClass523_7063; class523 != aClass523_177; aClass523_177 = aClass523_177.aClass523_7063) {
			if (l == 1055205983951172633L * aClass523_177.aLong7065) {
				Class523 class523_12_ = aClass523_177;
				aClass523_177 = aClass523_177.aClass523_7063;
				return class523_12_;
			}
		}
		aClass523_177 = null;
		return null;
	}

	public int method742(Class523[] class523s) {
		int i = 0;
		for (int i_13_ = 0; i_13_ < -2088127127 * anInt179; i_13_++) {
			Class523 class523 = aClass523Array175[i_13_];
			for (Class523 class523_14_ = class523.aClass523_7063; class523_14_ != class523; class523_14_ = class523_14_.aClass523_7063)
				class523s[i++] = class523_14_;
		}
		return i;
	}

	public int method743() {
		int i = 0;
		for (int i_15_ = 0; i_15_ < -2088127127 * anInt179; i_15_++) {
			Class523 class523 = aClass523Array175[i_15_];
			for (Class523 class523_16_ = class523.aClass523_7063; class523_16_ != class523; class523_16_ = class523_16_.aClass523_7063)
				i++;
		}
		return i;
	}

	public int method744() {
		int i = 0;
		for (int i_17_ = 0; i_17_ < -2088127127 * anInt179; i_17_++) {
			Class523 class523 = aClass523Array175[i_17_];
			for (Class523 class523_18_ = class523.aClass523_7063; class523_18_ != class523; class523_18_ = class523_18_.aClass523_7063)
				i++;
		}
		return i;
	}

	public Class523 method745() {
		anInt176 = 0;
		return method749(6270010);
	}

	public void method746() {
		for (int i = 0; i < -2088127127 * anInt179; i++) {
			Class523 class523 = aClass523Array175[i];
			for (;;) {
				Class523 class523_19_ = class523.aClass523_7063;
				if (class523 == class523_19_)
					break;
				class523_19_.method8661(607052656);
			}
		}
		aClass523_177 = null;
		aClass523_178 = null;
	}

	public void method747() {
		for (int i = 0; i < -2088127127 * anInt179; i++) {
			Class523 class523 = aClass523Array175[i];
			for (;;) {
				Class523 class523_20_ = class523.aClass523_7063;
				if (class523 == class523_20_)
					break;
				class523_20_.method8661(607052656);
			}
		}
		aClass523_177 = null;
		aClass523_178 = null;
	}

	public Class523 method748() {
		anInt176 = 0;
		return method749(415061144);
	}

	public Class523 method749(int i) {
		if (-1946354015 * anInt176 > 0 && (aClass523Array175[anInt176 * -1946354015 - 1] != aClass523_178)) {
			Class523 class523 = aClass523_178;
			aClass523_178 = class523.aClass523_7063;
			return class523;
		}
		while (anInt176 * -1946354015 < -2088127127 * anInt179) {
			Class523 class523 = (aClass523Array175[(anInt176 += -1947310751) * -1946354015 - 1].aClass523_7063);
			if (aClass523Array175[-1946354015 * anInt176 - 1] != class523) {
				aClass523_178 = class523.aClass523_7063;
				return class523;
			}
		}
		return null;
	}

	public Class523 method750() {
		anInt176 = 0;
		return method749(608633514);
	}

	public Class523 method751() {
		if (-1946354015 * anInt176 > 0 && (aClass523Array175[anInt176 * -1946354015 - 1] != aClass523_178)) {
			Class523 class523 = aClass523_178;
			aClass523_178 = class523.aClass523_7063;
			return class523;
		}
		while (anInt176 * -1946354015 < -2088127127 * anInt179) {
			Class523 class523 = (aClass523Array175[(anInt176 += -1947310751) * -1946354015 - 1].aClass523_7063);
			if (aClass523Array175[-1946354015 * anInt176 - 1] != class523) {
				aClass523_178 = class523.aClass523_7063;
				return class523;
			}
		}
		return null;
	}

	public Class523 method752() {
		if (-1946354015 * anInt176 > 0 && (aClass523Array175[anInt176 * -1946354015 - 1] != aClass523_178)) {
			Class523 class523 = aClass523_178;
			aClass523_178 = class523.aClass523_7063;
			return class523;
		}
		while (anInt176 * -1946354015 < -2088127127 * anInt179) {
			Class523 class523 = (aClass523Array175[(anInt176 += -1947310751) * -1946354015 - 1].aClass523_7063);
			if (aClass523Array175[-1946354015 * anInt176 - 1] != class523) {
				aClass523_178 = class523.aClass523_7063;
				return class523;
			}
		}
		return null;
	}

	static final void method753(Class669 class669, int i) {
		Class159 class159 = (Class159) (class669.aClass523_Sub27_Sub19_8580.anObjectArray11845[class669.anInt8579 * 1180759405]);
		Interface20 interface20 = ((Interface20) (class669.anIntArray8577[class669.anInt8579 * 1180759405] == 0 ? class669.aMap8573.get(class159.aClass470_1755) : class669.aMap8556.get(class159.aClass470_1755)));
		Class474 class474 = class159.aClass464_1756.method7527(2140127207);
		if (class474 == Class474.aClass474_5382) {
			if (class159.aClass470_1755 == Class470.aClass470_5351)
				Class525.method8712(class159, 1878722939);
			interface20.method112(class159, class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], (byte) 91);
		} else if (class474 == Class474.aClass474_5383)
			interface20.method114(class159, class669.aLongArray8561[((class669.anInt8562 -= -2045027743) * 2056702369)]);
		else if (class474 == Class474.aClass474_5384) {
			if (class159.aClass470_1755 == Class470.aClass470_5351)
				Class112.method1954(class159, 1521512938);
			interface20.method116(class159, (class669.anObjectArray8559[((class669.anInt8560 -= 1235970069) * 240723773)]), 888321821);
		} else
			throw new RuntimeException();
	}

	static final void method754(Class669 class669, int i) {
		Class523_Sub3.method15921(-1116415617 * Class534_Sub1.anInt10776, -120995556);
	}
}
