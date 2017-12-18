/* Class98_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class98_Sub1_Sub1 extends Class98_Sub1 implements Interface12 {
	Class209 aClass209_11322 = new Class209(64);
	Class472 aClass472_11323;

	Class159_Sub2 method17699(int i) {
		byte[] is = aClass472_11323.method7688((aClass470_8890.getCurrentConfigStruct((byte) -88).anInt8501) * 1688317219, i, 92647414);
		Class159_Sub2 class159_sub2 = new Class159_Sub2(aClass470_8890, i);
		if (is != null)
			class159_sub2.readValues(new RSBuffer(is), 2059438270);
		return class159_sub2;
	}

	public Iterator method17700() {
		return new Class237(this);
	}

	Class159_Sub2 method17701(int i, byte i_0_) {
		byte[] is = aClass472_11323.method7688((aClass470_8890.getCurrentConfigStruct((byte) -2).anInt8501) * 1688317219, i, 396570359);
		Class159_Sub2 class159_sub2 = new Class159_Sub2(aClass470_8890, i);
		if (is != null)
			class159_sub2.readValues(new RSBuffer(is), 2132721228);
		return class159_sub2;
	}

	public Iterator iterator() {
		return new Class237(this);
	}

	public void method17702(int i, byte i_1_) {
		synchronized (aClass209_11322) {
			aClass209_11322.method3772(i, (byte) 1);
		}
	}

	public int method69(int i) {
		return super.method69(-1254517783);
	}

	public void method17703(int i) {
		synchronized (aClass209_11322) {
			aClass209_11322.method3773(-1963959351);
		}
	}

	public void method17704(int i) {
		synchronized (aClass209_11322) {
			aClass209_11322.method3772(i, (byte) -109);
		}
	}

	public Interface13 method70(int i) {
		Class159_Sub2 class159_sub2;
		synchronized (aClass209_11322) {
			class159_sub2 = (Class159_Sub2) aClass209_11322.method3767((long) i);
			if (null == class159_sub2) {
				class159_sub2 = method17701(i, (byte) -8);
				aClass209_11322.method3770(class159_sub2, (long) i);
			}
		}
		return class159_sub2;
	}

	public Interface13 method72(int i) {
		Class159_Sub2 class159_sub2;
		synchronized (aClass209_11322) {
			class159_sub2 = (Class159_Sub2) aClass209_11322.method3767((long) i);
			if (null == class159_sub2) {
				class159_sub2 = method17701(i, (byte) -39);
				aClass209_11322.method3770(class159_sub2, (long) i);
			}
		}
		return class159_sub2;
	}

	public int method68() {
		return super.method69(-1289831831);
	}

	public int method6() {
		return super.method69(-1436595921);
	}

	Class159_Sub2 method17705(int i) {
		byte[] is = aClass472_11323.method7688((aClass470_8890.getCurrentConfigStruct((byte) 42).anInt8501) * 1688317219, i, -2096147457);
		Class159_Sub2 class159_sub2 = new Class159_Sub2(aClass470_8890, i);
		if (is != null)
			class159_sub2.readValues(new RSBuffer(is), 2110329708);
		return class159_sub2;
	}

	Class159_Sub2 method17706(int i) {
		byte[] is = aClass472_11323.method7688((aClass470_8890.getCurrentConfigStruct((byte) 63).anInt8501) * 1688317219, i, -1340851877);
		Class159_Sub2 class159_sub2 = new Class159_Sub2(aClass470_8890, i);
		if (is != null)
			class159_sub2.readValues(new RSBuffer(is), 2132543202);
		return class159_sub2;
	}

	public Class98_Sub1_Sub1(Class681 class681, VarDomainType class470, Class668 class668, Class472 class472) {
		super(class681, class470, class668, (class472 != null ? class472.method7702((class470.getCurrentConfigStruct((byte) -65).anInt8501 * 1688317219), (byte) -49) : 0));
		aClass472_11323 = class472;
	}

	public void method17707() {
		synchronized (aClass209_11322) {
			aClass209_11322.method3773(-2024756144);
		}
	}

	public void method17708() {
		synchronized (aClass209_11322) {
			aClass209_11322.method3773(-2110704283);
		}
	}

	public void method17709() {
		synchronized (aClass209_11322) {
			aClass209_11322.method3773(-1958294423);
		}
	}

	public Interface13 getDefinition(int i, byte i_2_) {
		Class159_Sub2 class159_sub2;
		synchronized (aClass209_11322) {
			class159_sub2 = (Class159_Sub2) aClass209_11322.method3767((long) i);
			if (null == class159_sub2) {
				class159_sub2 = method17701(i, (byte) -96);
				aClass209_11322.method3770(class159_sub2, (long) i);
			}
		}
		return class159_sub2;
	}

	public void method17710(int i) {
		synchronized (aClass209_11322) {
			aClass209_11322.method3772(i, (byte) -50);
		}
	}

	public void method17711() {
		synchronized (aClass209_11322) {
			aClass209_11322.method3776(-955230894);
		}
	}

	public void method17712(short i) {
		synchronized (aClass209_11322) {
			aClass209_11322.method3776(-86332086);
		}
	}

	static final void method17713(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = new StringBuilder().append(Class659.method10807((long) (class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]) * 60000L, Class53_Sub20.aClass668_10979.method82(), true, (byte) -2)).append(" UTC").toString();
	}
}
