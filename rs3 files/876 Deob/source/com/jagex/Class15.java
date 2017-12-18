/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class15 implements Iterator {
	Class523 aClass523_180;
	Class14 aClass14_181;
	int anInt182;
	Class523 aClass523_183 = null;
	static int[] anIntArray184;

	public boolean method755() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1])
			return true;
		while (anInt182 * -709788333 < -2088127127 * aClass14_181.anInt179) {
			if ((aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063) != aClass14_181.aClass523Array175[-709788333 * anInt182 - 1]) {
				aClass523_180 = (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1].aClass523_7063);
				return true;
			}
			aClass523_180 = aClass14_181.aClass523Array175[anInt182 * -709788333 - 1];
		}
		return false;
	}

	public Class523 method756() {
		method758(1538697950);
		return (Class523) next();
	}

	public Class523 method757(int i) {
		method758(1923891205);
		return (Class523) next();
	}

	public Object next() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1]) {
			Class523 class523 = aClass523_180;
			aClass523_180 = class523.aClass523_7063;
			aClass523_183 = class523;
			return class523;
		}
		while (-709788333 * anInt182 < aClass14_181.anInt179 * -2088127127) {
			Class523 class523 = (aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063);
			if (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1] != class523) {
				aClass523_180 = class523.aClass523_7063;
				aClass523_183 = class523;
				return class523;
			}
		}
		return null;
	}

	public boolean hasNext() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1])
			return true;
		while (anInt182 * -709788333 < -2088127127 * aClass14_181.anInt179) {
			if ((aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063) != aClass14_181.aClass523Array175[-709788333 * anInt182 - 1]) {
				aClass523_180 = (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1].aClass523_7063);
				return true;
			}
			aClass523_180 = aClass14_181.aClass523Array175[anInt182 * -709788333 - 1];
		}
		return false;
	}

	public void remove() {
		if (null == aClass523_183)
			throw new IllegalStateException();
		aClass523_183.method8661(607052656);
		aClass523_183 = null;
	}

	void method758(int i) {
		aClass523_180 = aClass14_181.aClass523Array175[0].aClass523_7063;
		anInt182 = -582234405;
		aClass523_183 = null;
	}

	public boolean method759() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1])
			return true;
		while (anInt182 * -709788333 < -2088127127 * aClass14_181.anInt179) {
			if ((aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063) != aClass14_181.aClass523Array175[-709788333 * anInt182 - 1]) {
				aClass523_180 = (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1].aClass523_7063);
				return true;
			}
			aClass523_180 = aClass14_181.aClass523Array175[anInt182 * -709788333 - 1];
		}
		return false;
	}

	public boolean method760() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1])
			return true;
		while (anInt182 * -709788333 < -2088127127 * aClass14_181.anInt179) {
			if ((aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063) != aClass14_181.aClass523Array175[-709788333 * anInt182 - 1]) {
				aClass523_180 = (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1].aClass523_7063);
				return true;
			}
			aClass523_180 = aClass14_181.aClass523Array175[anInt182 * -709788333 - 1];
		}
		return false;
	}

	public Class15(Class14 class14) {
		aClass14_181 = class14;
		method758(2016240329);
	}

	public Object method761() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1]) {
			Class523 class523 = aClass523_180;
			aClass523_180 = class523.aClass523_7063;
			aClass523_183 = class523;
			return class523;
		}
		while (-709788333 * anInt182 < aClass14_181.anInt179 * -2088127127) {
			Class523 class523 = (aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063);
			if (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1] != class523) {
				aClass523_180 = class523.aClass523_7063;
				aClass523_183 = class523;
				return class523;
			}
		}
		return null;
	}

	public void method762() {
		if (null == aClass523_183)
			throw new IllegalStateException();
		aClass523_183.method8661(607052656);
		aClass523_183 = null;
	}

	public void method763() {
		if (null == aClass523_183)
			throw new IllegalStateException();
		aClass523_183.method8661(607052656);
		aClass523_183 = null;
	}

	void method764() {
		aClass523_180 = aClass14_181.aClass523Array175[0].aClass523_7063;
		anInt182 = -582234405;
		aClass523_183 = null;
	}

	void method765() {
		aClass523_180 = aClass14_181.aClass523Array175[0].aClass523_7063;
		anInt182 = -582234405;
		aClass523_183 = null;
	}

	public Class523 method766() {
		method758(1783284486);
		return (Class523) next();
	}

	public boolean method767() {
		if (aClass523_180 != aClass14_181.aClass523Array175[anInt182 * -709788333 - 1])
			return true;
		while (anInt182 * -709788333 < -2088127127 * aClass14_181.anInt179) {
			if ((aClass14_181.aClass523Array175[(anInt182 += -582234405) * -709788333 - 1].aClass523_7063) != aClass14_181.aClass523Array175[-709788333 * anInt182 - 1]) {
				aClass523_180 = (aClass14_181.aClass523Array175[anInt182 * -709788333 - 1].aClass523_7063);
				return true;
			}
			aClass523_180 = aClass14_181.aClass523Array175[anInt182 * -709788333 - 1];
		}
		return false;
	}

	static final void method768(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (Class31.aClass242Array302[i_0_] == null)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else {
			String string = (Class31.aClass242Array302[i_0_].aClass250Array2457[0].aString2695);
			if (string == null)
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			else
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string.substring(0, string.indexOf(':'));
		}
	}
}
