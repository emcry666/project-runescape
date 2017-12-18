/* Class673 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class673 implements Interface75 {
	public static Class673 aClass673_8608 = new Class673(0, "");
	public static Class673 aClass673_8609 = new Class673(1, "");
	int anInt8610;
	public static Class523_Sub19 aClass523_Sub19_8611;
	public static Class472 aClass472_8612;

	public int method82() {
		return anInt8610 * 1111780331;
	}

	Class673(int i, String string) {
		anInt8610 = i * -693214013;
	}

	public int method6() {
		return anInt8610 * 1111780331;
	}

	public int method101() {
		return anInt8610 * 1111780331;
	}

	static void method13725(Class699 class699, short i) {
		Class194_Sub4.aClass699_9895 = class699;
	}

	public static int method13726(Class440 class440, byte i) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = 1.5707963267948966 - Math.acos((double) class437.aFloat4904);
		class437.method6949();
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	static final void method13727(Class669 class669, int i) {
		Class523_Sub27_Sub6 class523_sub27_sub6 = Class421.method6676(-1028569496);
		if (Class16.method770(class523_sub27_sub6, -42478970) == 4) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.getFromIndex(class523_sub27_sub6.method17956(2130012817))));
			if (null != class523_sub28) {
				class669.aClass647_Sub1_Sub3_Sub1_8552 = (Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554;
				class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
				return;
			}
		}
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
