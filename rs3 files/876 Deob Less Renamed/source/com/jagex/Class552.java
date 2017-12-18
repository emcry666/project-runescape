/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class552 {
	Class209 aClass209_7468 = new Class209(20);
	Class472 aClass472_7469;

	void method9144(int i) {
		synchronized (aClass209_7468) {
			aClass209_7468.method3772(i, (byte) -82);
		}
	}

	void method9145() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3776(-794206683);
		}
	}

	void method9146(int i, byte i_0_) {
		synchronized (aClass209_7468) {
			aClass209_7468.method3772(i, (byte) -79);
		}
	}

	void method9147(byte i) {
		synchronized (aClass209_7468) {
			aClass209_7468.method3776(-188973455);
		}
	}

	void method9148(int i) {
		synchronized (aClass209_7468) {
			aClass209_7468.method3772(i, (byte) -108);
		}
	}

	void method9149() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3773(-2095562751);
		}
	}

	void method9150() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3773(-1984894333);
		}
	}

	void method9151() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3776(-772621068);
		}
	}

	void method9152(byte i) {
		synchronized (aClass209_7468) {
			aClass209_7468.method3773(-1837235827);
		}
	}

	void method9153(int i) {
		synchronized (aClass209_7468) {
			aClass209_7468.method3772(i, (byte) -47);
		}
	}

	Class552(Class472 class472) {
		aClass472_7469 = class472;
	}

	void method9154() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3776(-127893723);
		}
	}

	void method9155() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3776(4981014);
		}
	}

	void method9156() {
		synchronized (aClass209_7468) {
			aClass209_7468.method3773(-1903424685);
		}
	}

	static final void method9157(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub12_10618.method16848((byte) 97) == 1 ? 1 : 0;
	}

	static Class523_Sub27_Sub7 createGameTask(int i, long l) {
		Class523_Sub27_Sub7.aBool11677 = false;
		Class523_Sub27_Sub7 class523_sub27_sub7 = (Class523_Sub27_Sub7) Class523_Sub27_Sub7.aClass14_11647.method741((long) i << 56 | l);
		if (class523_sub27_sub7 == null) {
			class523_sub27_sub7 = new Class523_Sub27_Sub7(i, l);
			Class523_Sub27_Sub7.aClass14_11647.method738(class523_sub27_sub7, 1055205983951172633L * class523_sub27_sub7.aLong7065);
			Class523_Sub27_Sub7.aBool11677 = true;
		}
		return class523_sub27_sub7;
	}
}
