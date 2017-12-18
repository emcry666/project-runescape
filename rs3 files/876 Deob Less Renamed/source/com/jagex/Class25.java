/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class25 {
	int anInt245;
	int anInt246;

	Class25() {
		/* empty */
	}

	public static Class389[] method843(int i) {
		return (new Class389[] { Class389.aClass389_4018, Class389.aClass389_4016, Class389.aClass389_4017 });
	}

	static final void method844(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1044091278);
		Class448.method7249(class250, class669, (byte) 50);
	}

	static final void method845(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		long l = (long) class669.anIntArray8557[1357652815 * class669.anInt8558];
		long l_1_ = (long) (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (l_1_ * l / 100L + l);
	}

	static final void method846(Class669 class669, byte i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class669.aClass334_8571.aStringArray3524[i_2_];
	}

	static void method847(Class669 class669, int i) {
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558 - 3];
		int i_4_ = class669.anIntArray8557[1357652815 * class669.anInt8558 - 2];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 - 1];
		class669.anInt8558 -= 2121349901;
		if (i_3_ > class669.anIntArray8555[i_4_])
			throw new RuntimeException();
		if (i_3_ > class669.anIntArray8555[i_5_])
			throw new RuntimeException();
		if (i_4_ == i_5_)
			throw new RuntimeException();
		Class535.method8915(class669.anIntArrayArray8578[i_4_], class669.anIntArrayArray8578[i_5_], 0, i_3_ - 1, -1675642210);
	}
}
