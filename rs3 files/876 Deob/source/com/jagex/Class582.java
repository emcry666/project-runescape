/* Class582 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class582 implements Interface75, Interface67 {
	int anInt7708;
	public static Class582 aClass582_7709;
	public static Class582 aClass582_7710;
	static Class582 aClass582_7711;
	public static Class582 aClass582_7712 = new Class582(0, "", new Class464[] { Class464.aClass464_5247, Class464.aClass464_5165 });
	Class464[] aClass464Array7713;

	static {
		aClass582_7709 = new Class582(1, "", new Class464[] { Class464.aClass464_5247, Class464.aClass464_5247 });
		aClass582_7710 = new Class582(2, "", new Class464[] { Class464.aClass464_5165, Class464.aClass464_5165 });
		aClass582_7711 = new Class582(3, "", new Class464[] { Class464.aClass464_5247, Class464.aClass464_5247, Class464.aClass464_5165 });
	}

	Class582(int i, String string, Class464[] class464s) {
		anInt7708 = 1358385787 * i;
		aClass464Array7713 = class464s;
		Class464[] class464s_0_ = aClass464Array7713;
		for (int i_1_ = 0; i_1_ < class464s_0_.length; i_1_++) {
			Class464 class464 = class464s_0_[i_1_];
			switch (class464.aClass474_5169.anInt5386 * -1710999695) {
			case 0:
				break;
			default:
				break;
			case 1:
				break;
			case 2:
				/* empty */
			}
		}
	}

	public int method101() {
		return 1120779443 * anInt7708;
	}

	public int method6() {
		return 1120779443 * anInt7708;
	}

	public int method82() {
		return 1120779443 * anInt7708;
	}

	static final void method9665(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (1 == -428962391 * class250.modelType ? class250.anInt2571 * -2080195333 : -1);
	}

	static final void method9666(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.cycles;
	}

	static final void method9667(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_2_, -1813843477);
		if (class250.aString2639 == null)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class250.aString2639;
	}
}
