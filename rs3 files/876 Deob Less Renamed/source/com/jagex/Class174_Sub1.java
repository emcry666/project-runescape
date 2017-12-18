/* Class174_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class174_Sub1 extends Class174 {
	Class472 aClass472_9783;
	Class472 aClass472_9784;
	public static Class172 aClass172_9785;

	byte[] method2924(Class601 class601, int i, int i_0_) {
		if ((Class601.aClass601_7849 == class601 || Class601.aClass601_7850 == class601) && aClass472_9783.method7657(i, (byte) 113))
			return aClass472_9783.method7721(i, -387132909);
		if (class601 == Class601.aClass601_7848 && aClass472_9784.method7657(i, (byte) 55))
			return aClass472_9784.method7721(i, -387132909);
		return null;
	}

	public boolean method136(Class601 class601, int i, Class608 class608, float f, int i_1_, int i_2_, boolean bool, short i_3_) {
		boolean bool_4_ = true;
		if (Class601.aClass601_7850 == class601) {
			if (aClass472_9784.method7657(i, (byte) 73))
				bool_4_ = aClass472_9784.method7650(i, 677442468);
			return bool_4_ & aClass472_9783.method7650(i, -330985064);
		}
		if (class601 == Class601.aClass601_7849)
			return aClass472_9783.method7650(i, 1352296410);
		if (class601 == Class601.aClass601_7848)
			return aClass472_9784.method7650(i, 424842649);
		return false;
	}

	public boolean method139(Class601 class601, int i, Class608 class608, float f, int i_5_, int i_6_, boolean bool) {
		boolean bool_7_ = true;
		if (Class601.aClass601_7850 == class601) {
			if (aClass472_9784.method7657(i, (byte) 59))
				bool_7_ = aClass472_9784.method7650(i, 1568146545);
			return bool_7_ & aClass472_9783.method7650(i, 734009535);
		}
		if (class601 == Class601.aClass601_7849)
			return aClass472_9783.method7650(i, -1447600373);
		if (class601 == Class601.aClass601_7848)
			return aClass472_9784.method7650(i, 222617590);
		return false;
	}

	public Class174_Sub1(Class472 class472, Class472 class472_8_) {
		aClass472_9783 = class472;
		aClass472_9784 = class472_8_;
	}

	byte[] method2920(Class601 class601, int i) {
		if ((Class601.aClass601_7849 == class601 || Class601.aClass601_7850 == class601) && aClass472_9783.method7657(i, (byte) 93))
			return aClass472_9783.method7721(i, -387132909);
		if (class601 == Class601.aClass601_7848 && aClass472_9784.method7657(i, (byte) 46))
			return aClass472_9784.method7721(i, -387132909);
		return null;
	}
}
