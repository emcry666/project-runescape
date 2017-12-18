/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class208 implements Interface5 {
	Interface12 anInterface12_2249;
	Class209 aClass209_2250 = new Class209(100);

	Class523_Sub27_Sub11 method3750(int i) {
		Class523_Sub27_Sub11 class523_sub27_sub11;
		synchronized (aClass209_2250) {
			class523_sub27_sub11 = (Class523_Sub27_Sub11) aClass209_2250.method3767((long) i);
			if (null == class523_sub27_sub11) {
				class523_sub27_sub11 = new Class523_Sub27_Sub11(i);
				aClass209_2250.method3770(class523_sub27_sub11, (long) i);
			}
			if (!class523_sub27_sub11.method18128((byte) 1)) {
				Class523_Sub27_Sub11 class523_sub27_sub11_0_ = null;
				return class523_sub27_sub11_0_;
			}
		}
		return class523_sub27_sub11;
	}

	Class523_Sub27_Sub11 method3751(int i, int i_1_) {
		Class523_Sub27_Sub11 class523_sub27_sub11;
		synchronized (aClass209_2250) {
			class523_sub27_sub11 = (Class523_Sub27_Sub11) aClass209_2250.method3767((long) i);
			if (null == class523_sub27_sub11) {
				class523_sub27_sub11 = new Class523_Sub27_Sub11(i);
				aClass209_2250.method3770(class523_sub27_sub11, (long) i);
			}
			if (!class523_sub27_sub11.method18128((byte) 1)) {
				Class523_Sub27_Sub11 class523_sub27_sub11_2_ = null;
				return class523_sub27_sub11_2_;
			}
		}
		return class523_sub27_sub11;
	}

	void method3752(int i) {
		synchronized (aClass209_2250) {
			aClass209_2250.method3772(i, (byte) -20);
		}
	}

	void method3753(int i, int i_3_) {
		synchronized (aClass209_2250) {
			aClass209_2250.method3772(i, (byte) -4);
		}
	}

	void method3754(int i) {
		synchronized (aClass209_2250) {
			aClass209_2250.method3776(596401052);
		}
	}

	void method3755(short i) {
		synchronized (aClass209_2250) {
			aClass209_2250.method3773(-1846874546);
		}
	}

	void method3756() {
		synchronized (aClass209_2250) {
			aClass209_2250.method3773(-1978945926);
		}
	}

	Class208(Interface12 interface12, Class472 class472, Class472 class472_4_) {
		anInterface12_2249 = interface12;
		Class661.method10909(class472, class472_4_, 2, 764783666);
	}

	void method3757() {
		synchronized (aClass209_2250) {
			aClass209_2250.method3773(-2041503710);
		}
	}

	void method3758() {
		synchronized (aClass209_2250) {
			aClass209_2250.method3773(-1947371893);
		}
	}

	void method3759(int i) {
		synchronized (aClass209_2250) {
			aClass209_2250.method3772(i, (byte) -114);
		}
	}

	Class523_Sub27_Sub11 method3760(int i) {
		Class523_Sub27_Sub11 class523_sub27_sub11;
		synchronized (aClass209_2250) {
			class523_sub27_sub11 = (Class523_Sub27_Sub11) aClass209_2250.method3767((long) i);
			if (null == class523_sub27_sub11) {
				class523_sub27_sub11 = new Class523_Sub27_Sub11(i);
				aClass209_2250.method3770(class523_sub27_sub11, (long) i);
			}
			if (!class523_sub27_sub11.method18128((byte) 1)) {
				Class523_Sub27_Sub11 class523_sub27_sub11_5_ = null;
				return class523_sub27_sub11_5_;
			}
		}
		return class523_sub27_sub11;
	}

	void method3761() {
		synchronized (aClass209_2250) {
			aClass209_2250.method3776(1150959506);
		}
	}

	void method3762() {
		synchronized (aClass209_2250) {
			aClass209_2250.method3776(-1361424489);
		}
	}

	static final void method3763(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_6_, -975249646);
		Class242 class242 = Class31.aClass242Array302[i_6_ >> 16];
		Class639.method10524(class250, class242, class669, 555699272);
	}
}
