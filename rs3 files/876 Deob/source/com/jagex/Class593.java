/* Class593 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class593 implements Interface75 {
	public static Class593 aClass593_7811;
	public static Class593 aClass593_7812;
	public static Class593 aClass593_7813 = new Class593(0);
	int anInt7814;

	public int method6() {
		return anInt7814 * 413363637;
	}

	public int method82() {
		return anInt7814 * 413363637;
	}

	static {
		aClass593_7812 = new Class593(1);
		aClass593_7811 = new Class593(2);
	}

	public static Class593[] method9799() {
		return (new Class593[] { aClass593_7812, aClass593_7813, aClass593_7811 });
	}

	public int method101() {
		return anInt7814 * 413363637;
	}

	public static Class593[] method9800() {
		return (new Class593[] { aClass593_7812, aClass593_7813, aClass593_7811 });
	}

	Class593(int i) {
		anInt7814 = 998365341 * i;
	}

	static final void method9801(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class250.aBool2611 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Login.method15991(class250, (byte) -67);
	}

	static final void method9802(Class669 class669, int i) {
		Class611_Sub1 class611_sub1 = Class688.method13928(138886356);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = null == class611_sub1 ? 0 : -427096717 * class611_sub1.anInt8010;
	}

	static final boolean method9803(char c, byte i) {
		if (Character.isISOControl(c))
			return false;
		if (Class615.method10068(c, 530847186))
			return true;
		char[] cs = Class78.aCharArray861;
		for (int i_0_ = 0; i_0_ < cs.length; i_0_++) {
			char c_1_ = cs[i_0_];
			if (c == c_1_)
				return true;
		}
		cs = Class78.aCharArray859;
		for (int i_2_ = 0; i_2_ < cs.length; i_2_++) {
			char c_3_ = cs[i_2_];
			if (c == c_3_)
				return true;
		}
		return false;
	}
}
