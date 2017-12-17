/* Class596 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class596 {
	int anInt7828;
	Class14 aClass14_7829;
	int anInt7830;
	Class697 aClass697_7831 = new Class697();

	public final void method9820(int i) {
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14016(-1426448868)); class523_sub27_sub16 != null; class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14018(768418218))) {
			if (class523_sub27_sub16.method18182()) {
				if (class523_sub27_sub16.method18185() == null) {
					class523_sub27_sub16.method8661(607052656);
					class523_sub27_sub16.method16154(-261651695);
					anInt7828 += class523_sub27_sub16.anInt11806;
				}
			} else if ((class523_sub27_sub16.aLong10552 += -9121445971199030645L) * -8659322449062458077L > (long) i) {
				Class523_Sub27_Sub16_Sub2 class523_sub27_sub16_sub2 = (new Class523_Sub27_Sub16_Sub2(class523_sub27_sub16.anInterface70_11805, class523_sub27_sub16.method18185(), class523_sub27_sub16.anInt11806));
				aClass14_7829.method738(class523_sub27_sub16_sub2, (class523_sub27_sub16.aLong7065 * 1055205983951172633L));
				Class379.method6398(class523_sub27_sub16_sub2, class523_sub27_sub16, 454210292);
				class523_sub27_sub16.method8661(607052656);
				class523_sub27_sub16.method16154(-261651695);
			}
		}
	}

	public final Object method9821(Interface70 interface70) {
		long l = interface70.method448();
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method741(l); class523_sub27_sub16 != null; class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method740(231172810)) {
			if (class523_sub27_sub16.anInterface70_11805.method442(interface70)) {
				Object object = class523_sub27_sub16.method18185();
				if (object == null) {
					class523_sub27_sub16.method8661(607052656);
					class523_sub27_sub16.method16154(-261651695);
					anInt7828 += class523_sub27_sub16.anInt11806;
				} else {
					if (class523_sub27_sub16.method18182()) {
						Class523_Sub27_Sub16_Sub1 class523_sub27_sub16_sub1 = (new Class523_Sub27_Sub16_Sub1(interface70, object, class523_sub27_sub16.anInt11806));
						aClass14_7829.method738(class523_sub27_sub16_sub1, (class523_sub27_sub16.aLong7065 * 1055205983951172633L));
						aClass697_7831.method14030(class523_sub27_sub16_sub1, (byte) -77);
						class523_sub27_sub16_sub1.aLong10552 = 0L;
						class523_sub27_sub16.method8661(607052656);
						class523_sub27_sub16.method16154(-261651695);
					} else {
						aClass697_7831.method14030(class523_sub27_sub16, (byte) -10);
						class523_sub27_sub16.aLong10552 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	final void method9822(Interface70 interface70) {
		long l = interface70.method448();
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method741(l); class523_sub27_sub16 != null; class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method740(231172810)) {
			if (class523_sub27_sub16.anInterface70_11805.method442(interface70)) {
				method9837(class523_sub27_sub16);
				break;
			}
		}
	}

	public final void method9823(int i) {
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14016(-1426448868)); class523_sub27_sub16 != null; class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14018(768418218))) {
			if (class523_sub27_sub16.method18182()) {
				if (class523_sub27_sub16.method18185() == null) {
					class523_sub27_sub16.method8661(607052656);
					class523_sub27_sub16.method16154(-261651695);
					anInt7828 += class523_sub27_sub16.anInt11806;
				}
			} else if ((class523_sub27_sub16.aLong10552 += -9121445971199030645L) * -8659322449062458077L > (long) i) {
				Class523_Sub27_Sub16_Sub2 class523_sub27_sub16_sub2 = (new Class523_Sub27_Sub16_Sub2(class523_sub27_sub16.anInterface70_11805, class523_sub27_sub16.method18185(), class523_sub27_sub16.anInt11806));
				aClass14_7829.method738(class523_sub27_sub16_sub2, (class523_sub27_sub16.aLong7065 * 1055205983951172633L));
				Class379.method6398(class523_sub27_sub16_sub2, class523_sub27_sub16, 648678469);
				class523_sub27_sub16.method8661(607052656);
				class523_sub27_sub16.method16154(-261651695);
			}
		}
	}

	final void method9824(Class523_Sub27_Sub16 class523_sub27_sub16) {
		if (class523_sub27_sub16 != null) {
			class523_sub27_sub16.method8661(607052656);
			class523_sub27_sub16.method16154(-261651695);
			anInt7828 += class523_sub27_sub16.anInt11806;
		}
	}

	final void method9825(Object object, Interface70 interface70, int i) {
		if (i > anInt7830)
			throw new IllegalStateException();
		method9822(interface70);
		anInt7828 -= i;
		while (anInt7828 < 0) {
			Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14015((byte) -66));
			method9837(class523_sub27_sub16);
		}
		Class523_Sub27_Sub16_Sub1 class523_sub27_sub16_sub1 = new Class523_Sub27_Sub16_Sub1(interface70, object, i);
		aClass14_7829.method738(class523_sub27_sub16_sub1, interface70.method448());
		aClass697_7831.method14030(class523_sub27_sub16_sub1, (byte) -42);
		class523_sub27_sub16_sub1.aLong10552 = 0L;
	}

	final void method9826(Object object, Interface70 interface70, int i) {
		if (i > anInt7830)
			throw new IllegalStateException();
		method9822(interface70);
		anInt7828 -= i;
		while (anInt7828 < 0) {
			Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14015((byte) -87));
			method9837(class523_sub27_sub16);
		}
		Class523_Sub27_Sub16_Sub1 class523_sub27_sub16_sub1 = new Class523_Sub27_Sub16_Sub1(interface70, object, i);
		aClass14_7829.method738(class523_sub27_sub16_sub1, interface70.method448());
		aClass697_7831.method14030(class523_sub27_sub16_sub1, (byte) -127);
		class523_sub27_sub16_sub1.aLong10552 = 0L;
	}

	public Class596(int i) {
		anInt7830 = i;
		anInt7828 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		aClass14_7829 = new Class14(i_0_);
	}

	public final void method9827() {
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14016(-1426448868)); class523_sub27_sub16 != null; class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14018(768418218))) {
			if (class523_sub27_sub16.method18182()) {
				class523_sub27_sub16.method8661(607052656);
				class523_sub27_sub16.method16154(-261651695);
				anInt7828 += class523_sub27_sub16.anInt11806;
			}
		}
	}

	public final Object method9828(Interface70 interface70) {
		long l = interface70.method448();
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method741(l); class523_sub27_sub16 != null; class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method740(231172810)) {
			if (class523_sub27_sub16.anInterface70_11805.method442(interface70)) {
				Object object = class523_sub27_sub16.method18185();
				if (object == null) {
					class523_sub27_sub16.method8661(607052656);
					class523_sub27_sub16.method16154(-261651695);
					anInt7828 += class523_sub27_sub16.anInt11806;
				} else {
					if (class523_sub27_sub16.method18182()) {
						Class523_Sub27_Sub16_Sub1 class523_sub27_sub16_sub1 = (new Class523_Sub27_Sub16_Sub1(interface70, object, class523_sub27_sub16.anInt11806));
						aClass14_7829.method738(class523_sub27_sub16_sub1, (class523_sub27_sub16.aLong7065 * 1055205983951172633L));
						aClass697_7831.method14030(class523_sub27_sub16_sub1, (byte) -52);
						class523_sub27_sub16_sub1.aLong10552 = 0L;
						class523_sub27_sub16.method8661(607052656);
						class523_sub27_sub16.method16154(-261651695);
					} else {
						aClass697_7831.method14030(class523_sub27_sub16, (byte) -21);
						class523_sub27_sub16.aLong10552 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public final void method9829() {
		aClass697_7831.method14014(1695091284);
		aClass14_7829.method733(-1314251791);
		anInt7828 = anInt7830;
	}

	final void method9830(Interface70 interface70) {
		long l = interface70.method448();
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method741(l); class523_sub27_sub16 != null; class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method740(231172810)) {
			if (class523_sub27_sub16.anInterface70_11805.method442(interface70)) {
				method9837(class523_sub27_sub16);
				break;
			}
		}
	}

	final void method9831(Object object, Interface70 interface70, int i) {
		if (i > anInt7830)
			throw new IllegalStateException();
		method9822(interface70);
		anInt7828 -= i;
		while (anInt7828 < 0) {
			Class523_Sub27_Sub16 class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass697_7831.method14015((byte) -6);
			method9837(class523_sub27_sub16);
		}
		Class523_Sub27_Sub16_Sub1 class523_sub27_sub16_sub1 = new Class523_Sub27_Sub16_Sub1(interface70, object, i);
		aClass14_7829.method738(class523_sub27_sub16_sub1, interface70.method448());
		aClass697_7831.method14030(class523_sub27_sub16_sub1, (byte) -15);
		class523_sub27_sub16_sub1.aLong10552 = 0L;
	}

	public final void method9832(Object object, Interface70 interface70) {
		method9825(object, interface70, 1);
	}

	public final void method9833(Object object, Interface70 interface70) {
		method9825(object, interface70, 1);
	}

	public final void method9834(Object object, Interface70 interface70) {
		method9825(object, interface70, 1);
	}

	final void method9835(Interface70 interface70) {
		long l = interface70.method448();
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method741(l); class523_sub27_sub16 != null; class523_sub27_sub16 = (Class523_Sub27_Sub16) aClass14_7829.method740(231172810)) {
			if (class523_sub27_sub16.anInterface70_11805.method442(interface70)) {
				method9837(class523_sub27_sub16);
				break;
			}
		}
	}

	final void method9836(Object object, Interface70 interface70, int i) {
		if (i > anInt7830)
			throw new IllegalStateException();
		method9822(interface70);
		anInt7828 -= i;
		while (anInt7828 < 0) {
			Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14015((byte) -95));
			method9837(class523_sub27_sub16);
		}
		Class523_Sub27_Sub16_Sub1 class523_sub27_sub16_sub1 = new Class523_Sub27_Sub16_Sub1(interface70, object, i);
		aClass14_7829.method738(class523_sub27_sub16_sub1, interface70.method448());
		aClass697_7831.method14030(class523_sub27_sub16_sub1, (byte) -57);
		class523_sub27_sub16_sub1.aLong10552 = 0L;
	}

	final void method9837(Class523_Sub27_Sub16 class523_sub27_sub16) {
		if (class523_sub27_sub16 != null) {
			class523_sub27_sub16.method8661(607052656);
			class523_sub27_sub16.method16154(-261651695);
			anInt7828 += class523_sub27_sub16.anInt11806;
		}
	}

	public final void method9838(int i) {
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14016(-1426448868)); class523_sub27_sub16 != null; class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14018(768418218))) {
			if (class523_sub27_sub16.method18182()) {
				if (class523_sub27_sub16.method18185() == null) {
					class523_sub27_sub16.method8661(607052656);
					class523_sub27_sub16.method16154(-261651695);
					anInt7828 += class523_sub27_sub16.anInt11806;
				}
			} else if ((class523_sub27_sub16.aLong10552 += -9121445971199030645L) * -8659322449062458077L > (long) i) {
				Class523_Sub27_Sub16_Sub2 class523_sub27_sub16_sub2 = (new Class523_Sub27_Sub16_Sub2(class523_sub27_sub16.anInterface70_11805, class523_sub27_sub16.method18185(), class523_sub27_sub16.anInt11806));
				aClass14_7829.method738(class523_sub27_sub16_sub2, (class523_sub27_sub16.aLong7065 * 1055205983951172633L));
				Class379.method6398(class523_sub27_sub16_sub2, class523_sub27_sub16, 368896999);
				class523_sub27_sub16.method8661(607052656);
				class523_sub27_sub16.method16154(-261651695);
			}
		}
	}

	public final void method9839() {
		aClass697_7831.method14014(1225728152);
		aClass14_7829.method733(153234156);
		anInt7828 = anInt7830;
	}

	public final void method9840() {
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14016(-1426448868)); class523_sub27_sub16 != null; class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14018(768418218))) {
			if (class523_sub27_sub16.method18182()) {
				class523_sub27_sub16.method8661(607052656);
				class523_sub27_sub16.method16154(-261651695);
				anInt7828 += class523_sub27_sub16.anInt11806;
			}
		}
	}

	public final void method9841() {
		for (Class523_Sub27_Sub16 class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14016(-1426448868)); class523_sub27_sub16 != null; class523_sub27_sub16 = ((Class523_Sub27_Sub16) aClass697_7831.method14018(768418218))) {
			if (class523_sub27_sub16.method18182()) {
				class523_sub27_sub16.method8661(607052656);
				class523_sub27_sub16.method16154(-261651695);
				anInt7828 += class523_sub27_sub16.anInt11806;
			}
		}
	}
}
