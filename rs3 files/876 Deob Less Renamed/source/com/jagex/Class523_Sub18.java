/* Class523_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class523_Sub18 extends Class523 {
	abstract void method16035(Class334 class334, int i);

	Class523_Sub18() {
		/* empty */
	}

	abstract void method16036(Class334 class334);

	abstract void method16037(Class523_Sub34 class523_sub34, byte i);

	abstract void method16038(Class523_Sub34 class523_sub34);

	abstract void method16039(Class523_Sub34 class523_sub34);

	abstract void method16040(Class523_Sub34 class523_sub34);

	abstract void method16041(Class334 class334);

	public static Class523_Sub22 method16042(OutgoingPacket class408, Class11 class11, int i) {
		Class523_Sub22 class523_sub22 = Class68.method1462((byte) -112);
		class523_sub22.aClass408_10524 = class408;
		class523_sub22.anInt10523 = class408.anInt4328 * -66856601;
		if (class523_sub22.anInt10523 * -764738435 == -1)
			class523_sub22.aClass523_Sub34_Sub2_10525 = new Class523_Sub34_Sub2(260);
		else if (-2 == class523_sub22.anInt10523 * -764738435)
			class523_sub22.aClass523_Sub34_Sub2_10525 = new Class523_Sub34_Sub2(10000);
		else if (class523_sub22.anInt10523 * -764738435 <= 18)
			class523_sub22.aClass523_Sub34_Sub2_10525 = new Class523_Sub34_Sub2(20);
		else if (class523_sub22.anInt10523 * -764738435 <= 98)
			class523_sub22.aClass523_Sub34_Sub2_10525 = new Class523_Sub34_Sub2(100);
		else
			class523_sub22.aClass523_Sub34_Sub2_10525 = new Class523_Sub34_Sub2(260);
		class523_sub22.aClass523_Sub34_Sub2_10525.method18218(class11, 2054548642);
		class523_sub22.aClass523_Sub34_Sub2_10525.method18219(820957581 * class523_sub22.aClass408_10524.anInt4327, 1786544784);
		class523_sub22.anInt10522 = 0;
		return class523_sub22;
	}
}
