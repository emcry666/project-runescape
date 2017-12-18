/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class209 {
	int anInt2251;
	int anInt2252;
	Class14 aClass14_2253;
	Class697 aClass697_2254 = new Class697();
	Interface24 anInterface24_2255;

	public void method3764(Object object, long l, int i, int i_0_) {
		if (i > 990939881 * anInt2251)
			throw new IllegalStateException();
		method3791(l);
		anInt2252 -= i * 521366871;
		while (anInt2252 * 159764071 < 0) {
			Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14015((byte) -99));
			if (class523_sub27_sub12 == null)
				throw new RuntimeException("");
			if (class523_sub27_sub12.method18132(740853861)) {
				/* empty */
			}
			method3769(class523_sub27_sub12, -1226089559);
			if (anInterface24_2255 != null)
				anInterface24_2255.method133(class523_sub27_sub12.method18131(-1824506746), -661216937);
		}
		Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, i);
		aClass14_2253.method738(class523_sub27_sub12_sub1, l);
		aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -66);
		class523_sub27_sub12_sub1.aLong10552 = 0L;
	}

	public int method3765(byte i) {
		int i_1_ = 0;
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (!class523_sub27_sub12.method18132(1872480835))
				i_1_++;
		}
		return i_1_;
	}

	public void method3766(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		method3769(class523_sub27_sub12, -1226089559);
	}

	public Object method3767(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		if (class523_sub27_sub12 == null)
			return null;
		Object object = class523_sub27_sub12.method18131(-1886946337);
		if (object == null) {
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
			anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			return null;
		}
		if (class523_sub27_sub12.method18132(-266822285)) {
			Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, (class523_sub27_sub12.anInt11744) * -512923633);
			aClass14_2253.method738(class523_sub27_sub12_sub1, (1055205983951172633L * class523_sub27_sub12.aLong7065));
			aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -107);
			class523_sub27_sub12_sub1.aLong10552 = 0L;
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
		} else {
			aClass697_2254.method14030(class523_sub27_sub12, (byte) -93);
			class523_sub27_sub12.aLong10552 = 0L;
		}
		return object;
	}

	public int method3768() {
		return anInt2251 * 990939881;
	}

	void method3769(Class523_Sub27_Sub12 class523_sub27_sub12, int i) {
		if (class523_sub27_sub12 != null) {
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
			anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
		}
	}

	public void method3770(Object object, long l) {
		method3764(object, l, 1, 1426326004);
	}

	public void method3771() {
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (class523_sub27_sub12.method18132(148042239)) {
				class523_sub27_sub12.method8661(607052656);
				class523_sub27_sub12.method16154(-261651695);
				anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			}
		}
	}

	public void method3772(int i, byte i_2_) {
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (class523_sub27_sub12.method18132(1453032365)) {
				if (class523_sub27_sub12.method18131(-1999532672) == null) {
					class523_sub27_sub12.method8661(607052656);
					class523_sub27_sub12.method16154(-261651695);
					anInt2252 += -1147551719 * class523_sub27_sub12.anInt11744;
				}
			} else if ((class523_sub27_sub12.aLong10552 += -9121445971199030645L) * -8659322449062458077L > (long) i) {
				Class523_Sub27_Sub12_Sub2 class523_sub27_sub12_sub2 = (new Class523_Sub27_Sub12_Sub2(class523_sub27_sub12.method18131(-2116161361), class523_sub27_sub12.anInt11744 * -512923633));
				aClass14_2253.method738(class523_sub27_sub12_sub2, (1055205983951172633L * class523_sub27_sub12.aLong7065));
				Class379.method6398(class523_sub27_sub12_sub2, class523_sub27_sub12, -716862029);
				class523_sub27_sub12.method8661(607052656);
				class523_sub27_sub12.method16154(-261651695);
			}
		}
	}

	public void method3773(int i) {
		aClass697_2254.method14014(628044884);
		aClass14_2253.method733(-1134709659);
		anInt2252 = -1542493649 * anInt2251;
	}

	public int method3774(short i) {
		return anInt2251 * 990939881;
	}

	public Class209(int i, int i_3_) {
		anInt2251 = 498527577 * i;
		anInt2252 = 521366871 * i;
		int i_4_;
		for (i_4_ = 1; i_4_ + i_4_ < i && i_4_ < i_3_; i_4_ += i_4_) {
			/* empty */
		}
		aClass14_2253 = new Class14(i_4_);
	}

	public void method3775(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		method3769(class523_sub27_sub12, -1226089559);
	}

	public void method3776(int i) {
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (class523_sub27_sub12.method18132(464261767)) {
				class523_sub27_sub12.method8661(607052656);
				class523_sub27_sub12.method16154(-261651695);
				anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			}
		}
	}

	public Object method3777(int i) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method735(-380907255);
		while (null != class523_sub27_sub12) {
			Object object = class523_sub27_sub12.method18131(-1943134972);
			if (null == object) {
				Class523_Sub27_Sub12 class523_sub27_sub12_5_ = class523_sub27_sub12;
				class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass14_2253.method749(-2015708673));
				class523_sub27_sub12_5_.method8661(607052656);
				class523_sub27_sub12_5_.method16154(-261651695);
				anInt2252 += -1147551719 * class523_sub27_sub12_5_.anInt11744;
			} else
				return object;
		}
		return null;
	}

	public Object method3778() {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method749(1776383311);
		while (null != class523_sub27_sub12) {
			Object object = class523_sub27_sub12.method18131(-1995255372);
			if (object == null) {
				Class523_Sub27_Sub12 class523_sub27_sub12_6_ = class523_sub27_sub12;
				class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass14_2253.method749(-687020846));
				class523_sub27_sub12_6_.method8661(607052656);
				class523_sub27_sub12_6_.method16154(-261651695);
				anInt2252 += -1147551719 * class523_sub27_sub12_6_.anInt11744;
			} else
				return object;
		}
		return null;
	}

	public void method3779(Interface24 interface24) {
		anInterface24_2255 = interface24;
	}

	public int method3780(int i) {
		return anInt2252 * 159764071;
	}

	public Object method3781(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		if (class523_sub27_sub12 == null)
			return null;
		Object object = class523_sub27_sub12.method18131(-1749448254);
		if (object == null) {
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
			anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			return null;
		}
		if (class523_sub27_sub12.method18132(1550137970)) {
			Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, (class523_sub27_sub12.anInt11744) * -512923633);
			aClass14_2253.method738(class523_sub27_sub12_sub1, (1055205983951172633L * class523_sub27_sub12.aLong7065));
			aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -23);
			class523_sub27_sub12_sub1.aLong10552 = 0L;
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
		} else {
			aClass697_2254.method14030(class523_sub27_sub12, (byte) -5);
			class523_sub27_sub12.aLong10552 = 0L;
		}
		return object;
	}

	public Object method3782(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		if (class523_sub27_sub12 == null)
			return null;
		Object object = class523_sub27_sub12.method18131(-1833594039);
		if (object == null) {
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
			anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			return null;
		}
		if (class523_sub27_sub12.method18132(-157141083)) {
			Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, (class523_sub27_sub12.anInt11744) * -512923633);
			aClass14_2253.method738(class523_sub27_sub12_sub1, (1055205983951172633L * class523_sub27_sub12.aLong7065));
			aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -72);
			class523_sub27_sub12_sub1.aLong10552 = 0L;
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
		} else {
			aClass697_2254.method14030(class523_sub27_sub12, (byte) -123);
			class523_sub27_sub12.aLong10552 = 0L;
		}
		return object;
	}

	public Object method3783() {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method749(1311853195);
		while (null != class523_sub27_sub12) {
			Object object = class523_sub27_sub12.method18131(-1872418012);
			if (object == null) {
				Class523_Sub27_Sub12 class523_sub27_sub12_7_ = class523_sub27_sub12;
				class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass14_2253.method749(-1737015927));
				class523_sub27_sub12_7_.method8661(607052656);
				class523_sub27_sub12_7_.method16154(-261651695);
				anInt2252 += -1147551719 * class523_sub27_sub12_7_.anInt11744;
			} else
				return object;
		}
		return null;
	}

	public void method3784(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		method3769(class523_sub27_sub12, -1226089559);
	}

	public void method3785(Interface24 interface24) {
		anInterface24_2255 = interface24;
	}

	public void method3786(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		method3769(class523_sub27_sub12, -1226089559);
	}

	public void method3787(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		method3769(class523_sub27_sub12, -1226089559);
	}

	void method3788(Class523_Sub27_Sub12 class523_sub27_sub12) {
		if (class523_sub27_sub12 != null) {
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
			anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
		}
	}

	void method3789(Class523_Sub27_Sub12 class523_sub27_sub12) {
		if (class523_sub27_sub12 != null) {
			class523_sub27_sub12.method8661(607052656);
			class523_sub27_sub12.method16154(-261651695);
			anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
		}
	}

	public void method3790(Object object, long l) {
		method3764(object, l, 1, 1525061502);
	}

	public void method3791(long l) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method741(l);
		method3769(class523_sub27_sub12, -1226089559);
	}

	public void method3792(Object object, long l, int i) {
		if (i > 990939881 * anInt2251)
			throw new IllegalStateException();
		method3791(l);
		anInt2252 -= i * 521366871;
		while (anInt2252 * 159764071 < 0) {
			Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14015((byte) -60));
			if (class523_sub27_sub12 == null)
				throw new RuntimeException("");
			if (class523_sub27_sub12.method18132(1206279788)) {
				/* empty */
			}
			method3769(class523_sub27_sub12, -1226089559);
			if (anInterface24_2255 != null)
				anInterface24_2255.method133(class523_sub27_sub12.method18131(-1977732497), -1635034972);
		}
		Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, i);
		aClass14_2253.method738(class523_sub27_sub12_sub1, l);
		aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -24);
		class523_sub27_sub12_sub1.aLong10552 = 0L;
	}

	public void method3793(Object object, long l, int i) {
		if (i > 990939881 * anInt2251)
			throw new IllegalStateException();
		method3791(l);
		anInt2252 -= i * 521366871;
		while (anInt2252 * 159764071 < 0) {
			Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14015((byte) -108));
			if (class523_sub27_sub12 == null)
				throw new RuntimeException("");
			if (class523_sub27_sub12.method18132(-132116549)) {
				/* empty */
			}
			method3769(class523_sub27_sub12, -1226089559);
			if (anInterface24_2255 != null)
				anInterface24_2255.method133(class523_sub27_sub12.method18131(-1863739355), -1395130139);
		}
		Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, i);
		aClass14_2253.method738(class523_sub27_sub12_sub1, l);
		aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -108);
		class523_sub27_sub12_sub1.aLong10552 = 0L;
	}

	public void method3794(Object object, long l, int i) {
		if (i > 990939881 * anInt2251)
			throw new IllegalStateException();
		method3791(l);
		anInt2252 -= i * 521366871;
		while (anInt2252 * 159764071 < 0) {
			Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14015((byte) -104));
			if (class523_sub27_sub12 == null)
				throw new RuntimeException("");
			if (class523_sub27_sub12.method18132(1331198747)) {
				/* empty */
			}
			method3769(class523_sub27_sub12, -1226089559);
			if (anInterface24_2255 != null)
				anInterface24_2255.method133(class523_sub27_sub12.method18131(-1863179010), -1869059670);
		}
		Class523_Sub27_Sub12_Sub1 class523_sub27_sub12_sub1 = new Class523_Sub27_Sub12_Sub1(object, i);
		aClass14_2253.method738(class523_sub27_sub12_sub1, l);
		aClass697_2254.method14030(class523_sub27_sub12_sub1, (byte) -92);
		class523_sub27_sub12_sub1.aLong10552 = 0L;
	}

	public Object method3795(byte i) {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method749(-1963820433);
		while (null != class523_sub27_sub12) {
			Object object = class523_sub27_sub12.method18131(-1838217836);
			if (object == null) {
				Class523_Sub27_Sub12 class523_sub27_sub12_8_ = class523_sub27_sub12;
				class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass14_2253.method749(-676140989));
				class523_sub27_sub12_8_.method8661(607052656);
				class523_sub27_sub12_8_.method16154(-261651695);
				anInt2252 += -1147551719 * class523_sub27_sub12_8_.anInt11744;
			} else
				return object;
		}
		return null;
	}

	public void method3796(int i) {
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (class523_sub27_sub12.method18132(283065544)) {
				if (class523_sub27_sub12.method18131(-1866207963) == null) {
					class523_sub27_sub12.method8661(607052656);
					class523_sub27_sub12.method16154(-261651695);
					anInt2252 += -1147551719 * class523_sub27_sub12.anInt11744;
				}
			} else if ((class523_sub27_sub12.aLong10552 += -9121445971199030645L) * -8659322449062458077L > (long) i) {
				Class523_Sub27_Sub12_Sub2 class523_sub27_sub12_sub2 = (new Class523_Sub27_Sub12_Sub2(class523_sub27_sub12.method18131(-2050357110), class523_sub27_sub12.anInt11744 * -512923633));
				aClass14_2253.method738(class523_sub27_sub12_sub2, (1055205983951172633L * class523_sub27_sub12.aLong7065));
				Class379.method6398(class523_sub27_sub12_sub2, class523_sub27_sub12, 1450369426);
				class523_sub27_sub12.method8661(607052656);
				class523_sub27_sub12.method16154(-261651695);
			}
		}
	}

	public int method3797() {
		return anInt2251 * 990939881;
	}

	public int method3798() {
		return anInt2252 * 159764071;
	}

	public void method3799() {
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (class523_sub27_sub12.method18132(215519928)) {
				class523_sub27_sub12.method8661(607052656);
				class523_sub27_sub12.method16154(-261651695);
				anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			}
		}
	}

	public void method3800() {
		for (Class523_Sub27_Sub12 class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14016(-1426448868)); class523_sub27_sub12 != null; class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass697_2254.method14018(768418218))) {
			if (class523_sub27_sub12.method18132(1582444708)) {
				class523_sub27_sub12.method8661(607052656);
				class523_sub27_sub12.method16154(-261651695);
				anInt2252 += class523_sub27_sub12.anInt11744 * -1147551719;
			}
		}
	}

	public int method3801() {
		return anInt2251 * 990939881;
	}

	public Object method3802() {
		Class523_Sub27_Sub12 class523_sub27_sub12 = (Class523_Sub27_Sub12) aClass14_2253.method735(-380907255);
		while (null != class523_sub27_sub12) {
			Object object = class523_sub27_sub12.method18131(-1893904729);
			if (null == object) {
				Class523_Sub27_Sub12 class523_sub27_sub12_9_ = class523_sub27_sub12;
				class523_sub27_sub12 = ((Class523_Sub27_Sub12) aClass14_2253.method749(-1034429284));
				class523_sub27_sub12_9_.method8661(607052656);
				class523_sub27_sub12_9_.method16154(-261651695);
				anInt2252 += -1147551719 * class523_sub27_sub12_9_.anInt11744;
			} else
				return object;
		}
		return null;
	}

	public void method3803(Interface24 interface24, int i) {
		anInterface24_2255 = interface24;
	}

	public Class209(int i) {
		this(i, i);
	}

	static final void method3804(Class669 class669, int i) {
		if (null != client.friendsChatOwner)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = client.friendsChatOwner;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}

	static final void method3805(Class669 class669, int i) {
		int i_10_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class611_Sub1 class611_sub1 = Class417.method6657(i_10_, 1421985588);
		if (class611_sub1 != null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt8010 * -427096717;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10587;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.method16192((byte) -75);
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.method16195(1629807411);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1102045477 * class611_sub1.anInt8012;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class611_sub1.anInt10585 * -1614476621;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class611_sub1.aString10586;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		}
	}

	public static Class690 method3806(int i, int i_11_) {
		Class690[] class690s = Class159_Sub2.method14359(-1839423643);
		for (int i_12_ = 0; i_12_ < class690s.length; i_12_++) {
			Class690 class690 = class690s[i_12_];
			if (i == -1773107777 * class690.anInt8690)
				return class690;
		}
		return null;
	}

	static final void method3807(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub37_10642.method17046(-1475501168);
	}

	static final void method3808(Class669 class669, byte i) {
		int i_13_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_13_, -705879203);
		Class242 class242 = Class31.aClass242Array302[i_13_ >> 16];
		Class463.method7520(class250, class242, class669, -33124562);
	}

	static int[] method3809(Class523_Sub27_Sub6 class523_sub27_sub6, int i) {
		int[] is = null;
		if (Class290.method5215(-2101009827 * class523_sub27_sub6.anInt11639, -908356852))
			is = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((int) (7768112170675051057L * class523_sub27_sub6.aLong11632), (byte) -17))).anIntArray164;
		else if (615428637 * class523_sub27_sub6.anInt11631 != -1)
			is = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(615428637 * class523_sub27_sub6.anInt11631, (byte) -29))).anIntArray164;
		else if (Class549.method9107((-2101009827 * class523_sub27_sub6.anInt11639), (byte) 1)) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L))));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
				if (null != class300.anIntArray3286)
					class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) -10);
				if (null != class300)
					is = class300.anIntArray3303;
			}
		} else if (Class523_Sub20.method16098((-2101009827 * (class523_sub27_sub6.anInt11639)), -1352842224)) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1649745466).getDefinition((int) ((class523_sub27_sub6.aLong11632 * 7768112170675051057L) >>> 32 & 0x7fffffffL), (byte) 47)));
			if (class602.anIntArray7912 != null)
				class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 68785523);
			if (class602 != null)
				is = class602.anIntArray7925;
		}
		return is;
	}

	static Class589 method3810(int i, byte i_14_) {
		Class589[] class589s = Class57.method1387((byte) 0);
		for (int i_15_ = 0; i_15_ < class589s.length; i_15_++) {
			Class589 class589 = class589s[i_15_];
			if (class589.anInt7795 * -1872231393 == i)
				return class589;
		}
		return null;
	}

	static final void method3811(Class669 class669, int i) {
		int i_16_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_16_, -1029042834);
		Class242 class242 = Class31.aClass242Array302[i_16_ >> 16];
		Class523.method8666(class250, class242, class669, -611745256);
	}
}
