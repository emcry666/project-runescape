/* Class652 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

public class Class652 {
	Class379 aClass379_8397;
	public HashMap aHashMap8398;

	void method10639() {
		aHashMap8398 = new HashMap();
		aHashMap8398.put(Class478.aClass478_5447, Integer.valueOf(50));
	}

	void method10640(int i) {
		aHashMap8398 = new HashMap();
		aHashMap8398.put(Class478.aClass478_5447, Integer.valueOf(50));
	}

	public Class652(Class379 class379) {
		method10640(2080159777);
		aClass379_8397 = class379;
	}

	static final void method10641(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4106(-45551410);
	}

	public static Class681 method10642(int i, byte i_0_) {
		Class681[] class681s = Class411.method6638(-692216583);
		for (int i_1_ = 0; i_1_ < class681s.length; i_1_++) {
			Class681 class681 = class681s[i_1_];
			if (i == class681.anInt8648 * 1884825957)
				return class681;
		}
		return null;
	}

	static final void method10643(Class669 class669, byte i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_2_, -1301688774);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class250.aString2607;
	}

	public static final void method10644(int i) {
		if (!client.aBool11107) {
			client.aFloat11106 += (-12.0F - client.aFloat11106) / 2.0F;
			client.aBool11111 = true;
			client.aBool11107 = true;
		}
	}

	public static boolean method10645(int i) {
		Class523_Sub30 class523_sub30 = (Class523_Sub30) Class66.aClass708_791.method14240(857765476);
		if (null == class523_sub30)
			return false;
		return true;
	}
}
