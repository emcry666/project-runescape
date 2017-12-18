/* Class548 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class548 {
	static int anInt7317 = 0;
	public Class647_Sub1_Sub3 aClass647_Sub1_Sub3_7318;
	public Class548 aClass548_7319;
	static Class548 aClass548_7320;
	static int anInt7321;
	public static int anInt7322;

	void method9095(int i) {
		if (anInt7317 * 985306851 < 500) {
			aClass647_Sub1_Sub3_7318 = null;
			aClass548_7319 = aClass548_7320;
			aClass548_7320 = this;
			anInt7317 += -381591861;
		}
	}

	Class548() {
		/* empty */
	}

	static Class548 method9096(Class647_Sub1_Sub3 class647_sub1_sub3) {
		Class548 class548;
		if (aClass548_7320 == null)
			class548 = new Class548();
		else {
			class548 = aClass548_7320;
			aClass548_7320 = aClass548_7320.aClass548_7319;
			class548.aClass548_7319 = null;
			anInt7317 -= -381591861;
		}
		class548.aClass647_Sub1_Sub3_7318 = class647_sub1_sub3;
		return class548;
	}

	void method9097() {
		if (anInt7317 * 985306851 < 500) {
			aClass647_Sub1_Sub3_7318 = null;
			aClass548_7319 = aClass548_7320;
			aClass548_7320 = this;
			anInt7317 += -381591861;
		}
	}

	static byte method9098(int i, int i_0_, byte i_1_) {
		if (Class607.aClass607_7971.anInt7982 * 1923531495 != i)
			return (byte) 0;
		if ((i_0_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	static final void method9099(Class669 class669, short i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_2_, -715397807);
		Class242 class242 = Class31.aClass242Array302[i_2_ >> 16];
		Class324.method5730(class250, class242, class669, -2065697269);
	}
}
