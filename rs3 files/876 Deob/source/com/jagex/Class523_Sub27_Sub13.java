/* Class523_Sub27_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class523_Sub27_Sub13 extends Class523_Sub27 {
	public int anInt11745;

	public abstract void method18135(float f);

	public abstract void method18136(RSBuffer class523_sub34);

	public abstract void method18137(Class307 class307, Class435 class435, Class441 class441);

	public abstract void method18138(RSBuffer class523_sub34, int i);

	public abstract void method18139(float f);

	public abstract void method18140(Class307 class307, Class435 class435, Class441 class441);

	public abstract void method18141(float f, byte i);

	public abstract void method18142(Class307 class307, Class435 class435, Class441 class441, short i);

	Class523_Sub27_Sub13(int i) {
		anInt11745 = i * 808536269;
	}

	public abstract void method18143(RSBuffer class523_sub34);

	public abstract void method18144(RSBuffer class523_sub34);

	public static Class523_Sub27_Sub13 method18145(int i, Class266 class266, RSBuffer class523_sub34) {
		if (Class266.aClass266_2861 == class266)
			return new Class523_Sub27_Sub13_Sub2(i, class523_sub34);
		if (class266 == Class266.aClass266_2860)
			return new Class523_Sub27_Sub13_Sub1(i, class523_sub34);
		return null;
	}

	public static Class523_Sub27_Sub13 method18146(int i, Class266 class266, RSBuffer class523_sub34) {
		if (Class266.aClass266_2861 == class266)
			return new Class523_Sub27_Sub13_Sub2(i, class523_sub34);
		if (class266 == Class266.aClass266_2860)
			return new Class523_Sub27_Sub13_Sub1(i, class523_sub34);
		return null;
	}
}
