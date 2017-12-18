/* Class676 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class676 implements Interface5 {
	Class472 aClass472_8633;
	Class209 aClass209_8634 = new Class209(60);
	int anInt8635;
	static String aString8636;

	Class676(Class472 class472) {
		aClass472_8633 = class472;
	}

	void method13756(int i, int i_0_) {
		anInt8635 = -722418369 * i;
		synchronized (aClass209_8634) {
			aClass209_8634.method3773(-1939365800);
		}
	}

	void method13757(int i) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3773(-1847278134);
		}
	}

	void method13758(int i, int i_1_) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3772(i, (byte) -69);
		}
	}

	void method13759(short i) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3776(1568513862);
		}
	}

	void method13760(int i) {
		anInt8635 = -722418369 * i;
		synchronized (aClass209_8634) {
			aClass209_8634.method3773(-2085881190);
		}
	}

	void method13761(int i) {
		anInt8635 = -722418369 * i;
		synchronized (aClass209_8634) {
			aClass209_8634.method3773(-2021101802);
		}
	}

	void method13762(int i) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3772(i, (byte) -126);
		}
	}

	void method13763(int i) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3772(i, (byte) -77);
		}
	}

	void method13764(int i) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3772(i, (byte) -92);
		}
	}

	void method13765(int i) {
		synchronized (aClass209_8634) {
			aClass209_8634.method3772(i, (byte) -114);
		}
	}

	void method13766() {
		synchronized (aClass209_8634) {
			aClass209_8634.method3776(200337179);
		}
	}

	void method13767() {
		synchronized (aClass209_8634) {
			aClass209_8634.method3776(-1408944248);
		}
	}

	public static char method13768(byte i, byte i_2_) {
		int i_3_ = i & 0xff;
		if (0 == i_3_)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_3_, 16)).toString());
		if (i_3_ >= 128 && i_3_ < 160) {
			int i_4_ = Class664.aCharArray8526[i_3_ - 128];
			if (0 == i_4_)
				i_4_ = 63;
			i_3_ = i_4_;
		}
		return (char) i_3_;
	}
}
