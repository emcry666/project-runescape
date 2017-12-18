/* Class685 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class685 {
	static Map aMap8665 = new HashMap();

	public static Interface75 method13869(Class var_class, int i) {
		synchronized (aMap8665) {
			Map map = (Map) aMap8665.get(var_class);
			if (map == null) {
				map = new HashMap();
				Interface75[] interface75s = (Interface75[]) var_class.getEnumConstants();
				for (int i_0_ = 0; i_0_ < interface75s.length; i_0_++) {
					Interface75 interface75 = interface75s[i_0_];
					map.put(Integer.valueOf(interface75.method82()), interface75);
				}
				aMap8665.put(var_class, map);
			}
			Interface75 interface75 = (Interface75) map.get(Integer.valueOf(i));
			return interface75;
		}
	}

	Class685() throws Throwable {
		throw new Error();
	}

	public static Interface75 method13870(Interface75[] interface75s, int i) {
		Interface75[] interface75s_1_ = interface75s;
		for (int i_2_ = 0; i_2_ < interface75s_1_.length; i_2_++) {
			Interface75 interface75 = interface75s_1_[i_2_];
			if (i == interface75.method82())
				return interface75;
		}
		return null;
	}

	public static Interface75 method13871(Interface75[] interface75s, int i) {
		Interface75[] interface75s_3_ = interface75s;
		for (int i_4_ = 0; i_4_ < interface75s_3_.length; i_4_++) {
			Interface75 interface75 = interface75s_3_[i_4_];
			if (i == interface75.method82())
				return interface75;
		}
		return null;
	}

	public static void method13872(Iterable iterable, Class523_Sub34 class523_sub34) {
		int i = Class567.method9518(iterable, -2067000481);
		class523_sub34.method16317(i, (short) -2002);
		if (0 != i) {
			for (int i_5_ = 0; i_5_ < i; i_5_++)
				class523_sub34.aByteArray10658[2349011 * class523_sub34.anInt10661 + i_5_] = (byte) 0;
			Iterator iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Interface75 interface75 = (Interface75) iterator.next();
				int i_6_ = interface75.method82();
				int i_7_ = i_6_ / 8;
				class523_sub34.aByteArray10658[class523_sub34.anInt10661 * 2349011 + i_7_] |= 1 << (i_6_ & 0x7);
			}
			class523_sub34.anInt10661 += i * 189765723;
		}
	}

	static int method13873(Iterable iterable) {
		int i = -1;
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Interface75 interface75 = (Interface75) iterator.next();
			if (interface75.method82() > i)
				i = interface75.method82();
		}
		return (8 + i) / 8;
	}

	static int method13874(Iterable iterable) {
		int i = -1;
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Interface75 interface75 = (Interface75) iterator.next();
			if (interface75.method82() > i)
				i = interface75.method82();
		}
		return (8 + i) / 8;
	}

	static final void method13875(Class250 class250, Class669 class669, byte i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_9_ = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) - 1);
		int i_10_ = i_9_;
		if (-428962391 * class250.anInt2570 != 6 && 2 != -428962391 * class250.anInt2570)
			throw new RuntimeException("");
		NPCDefinition class300 = ((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(-2080195333 * class250.anInt2571, (byte) -5));
		if (class250.aClass302_2553 == null)
			class250.aClass302_2553 = new Class302(class300, 6 == class250.anInt2570 * -428962391);
		class250.aClass302_2553.aLong3337 = Class547.method9086((byte) 13) * 1634705471692094829L;
		if (null != class300.aByteArray3291) {
			if (i_9_ < 0 || i_9_ >= class300.aByteArray3291.length)
				throw new RuntimeException("");
			i_10_ = class300.aByteArray3291[i_9_];
		}
		if (null == class300.aShortArray3317 || i_10_ < 0 || i_10_ >= class300.aShortArray3317.length)
			throw new RuntimeException("");
		class250.aClass302_2553.aShortArray3336[i_10_] = (short) i_8_;
		Class523_Sub14.method15991(class250, (byte) -91);
	}
}
