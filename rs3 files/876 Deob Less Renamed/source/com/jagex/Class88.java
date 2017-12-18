/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class88 implements Interface5 {
	Class472 aClass472_884;
	Class209 aClass209_885;

	void method1616(int i, byte i_0_) {
		aClass209_885 = new Class209(i);
	}

	void method1617(int i) {
		synchronized (aClass209_885) {
			aClass209_885.method3773(-1977636029);
		}
	}

	void method1618(int i) {
		aClass209_885 = new Class209(i);
	}

	void method1619(int i, int i_1_) {
		synchronized (aClass209_885) {
			aClass209_885.method3772(i, (byte) -45);
		}
	}

	void method1620(int i) {
		synchronized (aClass209_885) {
			aClass209_885.method3776(-4690944);
		}
	}

	Class88(Class472 class472, int i) {
		aClass472_884 = class472;
		aClass209_885 = new Class209(i);
	}

	void method1621(int i) {
		aClass209_885 = new Class209(i);
	}

	void method1622(int i) {
		synchronized (aClass209_885) {
			aClass209_885.method3772(i, (byte) -87);
		}
	}

	void method1623() {
		synchronized (aClass209_885) {
			aClass209_885.method3776(1215365757);
		}
	}

	void method1624() {
		synchronized (aClass209_885) {
			aClass209_885.method3776(958672783);
		}
	}

	public static Archive[] getArchiveReferences(int i) {
		return new Archive[] { Archive.aClass44_630, Archive.aClass44_653, Archive.aClass44_623, Archive.aClass44_624, Archive.aClass44_625, Archive.aClass44_626, Archive.aClass44_627, Archive.aClass44_628, Archive.aClass44_655, Archive.aClass44_647, Archive.SOUND_EFFECTS_INDEX, Archive.aClass44_632, Archive.aClass44_633, Archive.aClass44_634, Archive.aClass44_645, Archive.aClass44_636, Archive.aClass44_637, Archive.aClass44_640, Archive.aClass44_622, Archive.aClass44_641, Archive.aClass44_644, Archive.aClass44_642, Archive.aClass44_643, Archive.aClass44_639, Archive.aClass44_657, Archive.aClass44_665, Archive.aClass44_666, Archive.aClass44_648, Archive.aClass44_649, Archive.aClass44_650, Archive.aClass44_651, Archive.MUSIC_INDEX, Archive.aClass44_638, Archive.aClass44_654, Archive.aClass44_656, Archive.aClass44_621, Archive.aClass44_646, Archive.aClass44_658, Archive.aClass44_659, Archive.aClass44_660, Archive.aClass44_661, Archive.aClass44_635, Archive.aClass44_663 };
	}

	public static final boolean method1626(char c, int i) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && c != '<' || c >= '[' && c <= '_' || c >= '{');
	}
}
