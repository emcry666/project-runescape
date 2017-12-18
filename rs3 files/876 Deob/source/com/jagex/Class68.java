/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class68 implements Interface5 {
	Class aClass792;

	public Interface13 method48(int i, Interface12 interface12, int i_0_) {
		Interface13 interface13;
		try {
			Interface13 interface13_1_ = (Interface13) aClass792.newInstance();
			((Interface6) interface13_1_).method52(i, (byte) -105);
			interface13 = interface13_1_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface13;
	}

	public Class method47() {
		return aClass792;
	}

	public Class68(Class var_class) {
		aClass792 = var_class;
	}

	public Interface13 method50(int i, Interface12 interface12) {
		Interface13 interface13;
		try {
			Interface13 interface13_2_ = (Interface13) aClass792.newInstance();
			((Interface6) interface13_2_).method52(i, (byte) -20);
			interface13 = interface13_2_;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return interface13;
	}

	public Class method49(int i) {
		return aClass792;
	}

	static final void method1461(Class669 class669, byte i) {
		Class556.method9196(class669, class669.aClass647_Sub1_Sub3_Sub1_8552, (short) 1146);
	}

	static Class523_Sub22 method1462(byte i) {
		if (0 == 229380129 * Class523_Sub22.anInt10527)
			return new Class523_Sub22();
		return (Class523_Sub22.aClass523_Sub22Array10526[(Class523_Sub22.anInt10527 -= -878218271) * 229380129]);
	}
}
