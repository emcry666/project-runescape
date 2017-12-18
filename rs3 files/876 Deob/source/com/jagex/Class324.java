/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Map;

public abstract class Class324 implements Interface5 {
	Map aMap3453;
	static int anInt3454;

	Class324(Map map) {
		aMap3453 = map;
	}

	static final void method5730(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class250.aBool2566 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Login.method15991(class250, (byte) -65);
	}

	static final void method5731(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1758229080);
		Class174.method2931(class250, class669, (short) -5552);
	}

	static long method5732(CharSequence charsequence, byte i) {
		long l = 0L;
		int i_1_ = charsequence.length();
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			l *= 37L;
			char c = charsequence.charAt(i_2_);
			if (c >= 'A' && c <= 'Z')
				l += (long) (c + '\001' - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) ('\001' + c - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) ('\033' + c - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
			/* empty */
		}
		return l;
	}

	static void method5733(int i) {
		Class108.anInt1318 = 0;
		for (int i_3_ = 0; i_3_ < 2048; i_3_++) {
			Class108.aClass523_Sub34Array1316[i_3_] = null;
			Class108.aClass523_Sub34Array1317[i_3_] = null;
			Class108.aByteArray1314[i_3_] = Class666.aClass666_8531.aByte8529;
			Class108.aClass40Array1322[i_3_] = null;
		}
	}

	static final void method5734(Class669 class669, int i) {
		if (client.aBool11185)
			Class402.aClass402_4163.method6573((byte) -111);
	}
}
