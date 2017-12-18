/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class466 {
	Comparator aComparator5323 = new Class454(this);
	Map aMap5324;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_5325;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_5326;
	long aLong5327;
	Class471 aClass471_5328;
	int anInt5329;

	boolean method7560() {
		return -705645201 * anInt5329 != -1;
	}

	void method7561() {
		if (-1L == aLong5327 * -5367221488761378889L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -5367221488761378889L * aLong5327;
		while (!anAbstractQueue_Sub1_5325.isEmpty()) {
			Class465 class465 = (Class465) anAbstractQueue_Sub1_5325.peek();
			if (7637676821688511515L * class465.aLong5321 < l) {
				aMap5324.remove(class465.anObject5320);
				anAbstractQueue_Sub1_5325.remove(class465);
				if (method7576(-1552906203))
					anAbstractQueue_Sub1_5326.remove(class465);
			} else
				break;
		}
	}

	boolean method7562() {
		return -705645201 * anInt5329 != -1;
	}

	public Object method7563(Object object, int i) {
		synchronized (this) {
			if (-1L != -5367221488761378889L * aLong5327)
				method7566((byte) -84);
			Class465 class465 = (Class465) aMap5324.get(object);
			if (null == class465) {
				Object object_0_ = null;
				return object_0_;
			}
			method7565(class465, false, (byte) 0);
			Object object_1_ = class465.anObject5319;
			return object_1_;
		}
	}

	public Object method7564(Object object, Object object_2_, byte i) {
		synchronized (this) {
			if (-5367221488761378889L * aLong5327 != -1L)
				method7566((byte) -14);
			Class465 class465 = (Class465) aMap5324.get(object);
			if (class465 != null) {
				Object object_3_ = class465.anObject5319;
				class465.anObject5319 = object_2_;
				method7565(class465, false, (byte) 0);
				Object object_4_ = object_3_;
				return object_4_;
			}
			if (method7576(1035153997) && aMap5324.size() == -705645201 * anInt5329) {
				Class465 class465_5_ = (Class465) anAbstractQueue_Sub1_5326.remove();
				aMap5324.remove(class465_5_.anObject5320);
				anAbstractQueue_Sub1_5325.remove(class465_5_);
			}
			Class465 class465_6_ = new Class465(object_2_, object);
			aMap5324.put(object, class465_6_);
			method7565(class465_6_, true, (byte) 0);
			Object object_7_ = null;
			return object_7_;
		}
	}

	void method7565(Class465 class465, boolean bool, byte i) {
		if (!bool) {
			anAbstractQueue_Sub1_5325.remove(class465);
			if (method7576(-68255475) && !anAbstractQueue_Sub1_5326.remove(class465))
				throw new IllegalStateException("");
		}
		class465.aLong5321 = System.currentTimeMillis() * -1935543650099818989L;
		if (method7576(1237534464)) {
			switch (-380833367 * aClass471_5328.anInt5358) {
			case 0:
				class465.aLong5322 = 3587338885905135461L * class465.aLong5321;
				break;
			case 1:
				class465.aLong5322 += 7366799581635486335L;
				break;
			}
			anAbstractQueue_Sub1_5326.add(class465);
		}
		anAbstractQueue_Sub1_5325.add(class465);
	}

	void method7566(byte i) {
		if (-1L == aLong5327 * -5367221488761378889L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -5367221488761378889L * aLong5327;
		while (!anAbstractQueue_Sub1_5325.isEmpty()) {
			Class465 class465 = (Class465) anAbstractQueue_Sub1_5325.peek();
			if (7637676821688511515L * class465.aLong5321 < l) {
				aMap5324.remove(class465.anObject5320);
				anAbstractQueue_Sub1_5325.remove(class465);
				if (method7576(-1400186895))
					anAbstractQueue_Sub1_5326.remove(class465);
			} else
				break;
		}
	}

	public Object method7567(Object object, Object object_8_) {
		synchronized (this) {
			if (-5367221488761378889L * aLong5327 != -1L)
				method7566((byte) -36);
			Class465 class465 = (Class465) aMap5324.get(object);
			if (class465 != null) {
				Object object_9_ = class465.anObject5319;
				class465.anObject5319 = object_8_;
				method7565(class465, false, (byte) 0);
				Object object_10_ = object_9_;
				return object_10_;
			}
			if (method7576(515780156) && aMap5324.size() == -705645201 * anInt5329) {
				Class465 class465_11_ = (Class465) anAbstractQueue_Sub1_5326.remove();
				aMap5324.remove(class465_11_.anObject5320);
				anAbstractQueue_Sub1_5325.remove(class465_11_);
			}
			Class465 class465_12_ = new Class465(object_8_, object);
			aMap5324.put(object, class465_12_);
			method7565(class465_12_, true, (byte) 0);
			Object object_13_ = null;
			return object_13_;
		}
	}

	boolean method7568() {
		return -705645201 * anInt5329 != -1;
	}

	void method7569() {
		if (-1L == aLong5327 * -5367221488761378889L)
			throw new IllegalStateException("");
		long l = System.currentTimeMillis() - -5367221488761378889L * aLong5327;
		while (!anAbstractQueue_Sub1_5325.isEmpty()) {
			Class465 class465 = (Class465) anAbstractQueue_Sub1_5325.peek();
			if (7637676821688511515L * class465.aLong5321 < l) {
				aMap5324.remove(class465.anObject5320);
				anAbstractQueue_Sub1_5325.remove(class465);
				if (method7576(-225486095))
					anAbstractQueue_Sub1_5326.remove(class465);
			} else
				break;
		}
	}

	boolean method7570() {
		return -705645201 * anInt5329 != -1;
	}

	boolean method7571() {
		return -705645201 * anInt5329 != -1;
	}

	Class466(long l, int i, Class471 class471) {
		aLong5327 = l * -4202429384805079545L;
		anInt5329 = -149796465 * i;
		aClass471_5328 = class471;
		if (-1 == anInt5329 * -705645201) {
			aMap5324 = new HashMap(64);
			anAbstractQueue_Sub1_5325 = new AbstractQueue_Sub1(64, aComparator5323);
			anAbstractQueue_Sub1_5326 = null;
		} else {
			if (aClass471_5328 == null)
				throw new IllegalArgumentException("");
			aMap5324 = new HashMap(anInt5329 * -705645201);
			anAbstractQueue_Sub1_5325 = new AbstractQueue_Sub1(anInt5329 * -705645201, aComparator5323);
			anAbstractQueue_Sub1_5326 = new AbstractQueue_Sub1(-705645201 * anInt5329);
		}
	}

	public Object method7572(Object object) {
		synchronized (this) {
			if (-1L != -5367221488761378889L * aLong5327)
				method7566((byte) -59);
			Class465 class465 = (Class465) aMap5324.get(object);
			if (null == class465) {
				Object object_14_ = null;
				return object_14_;
			}
			method7565(class465, false, (byte) 0);
			Object object_15_ = class465.anObject5319;
			return object_15_;
		}
	}

	public Object method7573(Object object, Object object_16_) {
		synchronized (this) {
			if (-5367221488761378889L * aLong5327 != -1L)
				method7566((byte) -34);
			Class465 class465 = (Class465) aMap5324.get(object);
			if (class465 != null) {
				Object object_17_ = class465.anObject5319;
				class465.anObject5319 = object_16_;
				method7565(class465, false, (byte) 0);
				Object object_18_ = object_17_;
				return object_18_;
			}
			if (method7576(-1024424029) && aMap5324.size() == -705645201 * anInt5329) {
				Class465 class465_19_ = (Class465) anAbstractQueue_Sub1_5326.remove();
				aMap5324.remove(class465_19_.anObject5320);
				anAbstractQueue_Sub1_5325.remove(class465_19_);
			}
			Class465 class465_20_ = new Class465(object_16_, object);
			aMap5324.put(object, class465_20_);
			method7565(class465_20_, true, (byte) 0);
			Object object_21_ = null;
			return object_21_;
		}
	}

	public Object method7574(Object object) {
		synchronized (this) {
			if (-1L != -5367221488761378889L * aLong5327)
				method7566((byte) -25);
			Class465 class465 = (Class465) aMap5324.get(object);
			if (null == class465) {
				Object object_22_ = null;
				return object_22_;
			}
			method7565(class465, false, (byte) 0);
			Object object_23_ = class465.anObject5319;
			return object_23_;
		}
	}

	void method7575(Class465 class465, boolean bool) {
		if (!bool) {
			anAbstractQueue_Sub1_5325.remove(class465);
			if (method7576(787032995) && !anAbstractQueue_Sub1_5326.remove(class465))
				throw new IllegalStateException("");
		}
		class465.aLong5321 = System.currentTimeMillis() * -1935543650099818989L;
		if (method7576(1046983492)) {
			switch (-380833367 * aClass471_5328.anInt5358) {
			case 0:
				class465.aLong5322 = 3587338885905135461L * class465.aLong5321;
				break;
			case 1:
				class465.aLong5322 += 7366799581635486335L;
				break;
			}
			anAbstractQueue_Sub1_5326.add(class465);
		}
		anAbstractQueue_Sub1_5325.add(class465);
	}

	boolean method7576(int i) {
		return -705645201 * anInt5329 != -1;
	}

	public Class466(int i, Class471 class471) {
		this(-1L, i, class471);
	}

	static final void method7577(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class457.method7443(class250, class242, false, 1, class669, -2126114145);
	}

	static final void method7578(Class669 class669, int i) {
		int i_24_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_24_, -1948053520);
		Class242 class242 = Class31.aClass242Array302[i_24_ >> 16];
		Class551.method9142(class250, class242, class669, 1423616553);
	}

	static final void method7579(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_25_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_26_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_27_ = class669.anIntArray8557[2 + 1357652815 * class669.anInt8558];
		Integer integer = (Integer) client.aClass220_11301.method4107(i_25_, -2108931678).method4059(i_26_, i_27_, 1433257538);
		if (null == integer)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = integer.intValue();
	}

	static final void method7580(Class669 class669, int i) {
		int i_28_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5389(i_28_, (byte) 44);
	}
}
