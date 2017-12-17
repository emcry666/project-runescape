/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Class58 implements Interface12 {
	protected int anInt747;
	Class656 aClass656_748;
	Class472 aClass472_749;
	Interface13[] anInterface13Array750;
	Interface13 anInterface13_751;
	Interface5 anInterface5_752;
	static int anInt753;

	Class58(Class681 class681, Class668 class668, Class656 class656, Class472 class472, Interface5 interface5, boolean bool) {
		anInterface5_752 = interface5;
		aClass656_748 = class656;
		aClass472_749 = class472;
		anInt747 = Class268.method4906(aClass472_749, aClass656_748, -1552184190) * -760668931;
		anInterface13Array750 = ((Interface13[]) Array.newInstance(anInterface5_752.method49(-1334988241), anInt747 * 1294786645));
		if (bool) {
			for (int i = 0; i < 1294786645 * anInt747; i++)
				method1390(i, -68010787);
		}
	}

	public Iterator method1389() {
		return new Class59(this);
	}

	void method1390(int i, int i_0_) {
		if (anInterface13Array750[i] == null) {
			try {
				anInterface13Array750[i] = anInterface5_752.method48(i, this, 1651384220);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class198.method3674(aClass472_749, aClass656_748, i, -732596365);
			if (is != null)
				anInterface13Array750[i].method80(new Class523_Sub34(is), 2105016660);
			anInterface13Array750[i].method74((byte) -39);
		}
	}

	public int method69(int i) {
		return anInterface13Array750.length;
	}

	public Iterator iterator() {
		return new Class59(this);
	}

	public Interface13 getDefinition(int i, byte i_1_) {
		if (i < 0) {
			if (null == anInterface13_751)
				anInterface13_751 = anInterface5_752.method48(-1, this, -1605513073);
			return anInterface13_751;
		}
		if (anInterface13Array750[i] == null)
			method1390(i, 1999883930);
		return anInterface13Array750[i];
	}

	public Interface13 method72(int i) {
		if (i < 0) {
			if (null == anInterface13_751)
				anInterface13_751 = anInterface5_752.method48(-1, this, -1609443690);
			return anInterface13_751;
		}
		if (anInterface13Array750[i] == null)
			method1390(i, 339516786);
		return anInterface13Array750[i];
	}

	public int method68() {
		return anInterface13Array750.length;
	}

	public int method6() {
		return anInterface13Array750.length;
	}

	public Interface13 method70(int i) {
		if (i < 0) {
			if (null == anInterface13_751)
				anInterface13_751 = anInterface5_752.method48(-1, this, -359260845);
			return anInterface13_751;
		}
		if (anInterface13Array750[i] == null)
			method1390(i, 1070444202);
		return anInterface13Array750[i];
	}

	void method1391(int i) {
		if (anInterface13Array750[i] == null) {
			try {
				anInterface13Array750[i] = anInterface5_752.method48(i, this, 1594109948);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class198.method3674(aClass472_749, aClass656_748, i, -2056114648);
			if (is != null)
				anInterface13Array750[i].method80(new Class523_Sub34(is), 2110029751);
			anInterface13Array750[i].method74((byte) 23);
		}
	}

	void method1392(int i) {
		if (anInterface13Array750[i] == null) {
			try {
				anInterface13Array750[i] = anInterface5_752.method48(i, this, -244743536);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = Class198.method3674(aClass472_749, aClass656_748, i, -1268976116);
			if (is != null)
				anInterface13Array750[i].method80(new Class523_Sub34(is), 2130538717);
			anInterface13Array750[i].method74((byte) 51);
		}
	}

	public static void method1393(Class572 class572, int i, int i_2_, Class667 class667, Class647_Sub1_Sub5_Sub1 class647_sub1_sub5_sub1, int i_3_) {
		Class669 class669 = Class540.method8981(-1630383876);
		class669.aClass647_Sub1_Sub5_Sub1_8568 = class647_sub1_sub5_sub1;
		Class687_Sub28.method16969(class572, i, i_2_, class669, -2120533268);
		class669.aClass647_Sub1_Sub5_Sub1_8568 = null;
	}
}
