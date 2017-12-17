/* Class665 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class665 {
	public static Class282 aClass282_8527;
	static volatile IcmpService_Sub1 anIcmpService_Sub1_8528;

	public static int method13642(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
		class437.method6949();
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
	}

	public static int method13643(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = 1.5707963267948966 - Math.acos((double) class437.aFloat4904);
		class437.method6949();
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13644(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = 1.5707963267948966 - Math.acos((double) class437.aFloat4904);
		class437.method6949();
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13645(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = 1.5707963267948966 - Math.acos((double) class437.aFloat4904);
		class437.method6949();
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13646(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = 1.5707963267948966 - Math.acos((double) class437.aFloat4904);
		class437.method6949();
		if (d < 0.0)
			d = 3.141592653589793 + (d + 3.141592653589793);
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static int method13647(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
		class437.method6949();
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
	}

	public static int method13648(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
		class437.method6949();
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
	}

	Class665() throws Throwable {
		throw new Error();
	}

	public static int method13649(Class440 class440) {
		Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
		class437.method6907(class440);
		double d = Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
		class437.method6949();
		if (d < 0.0)
			d = d + 3.141592653589793 + 3.141592653589793;
		return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
	}

	static final void method13650(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		if (-1 == i_1_)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class380.aClass473_3938.method7739(i_0_, (byte) -96).method18091((char) i_1_, (byte) -3);
	}

	static final void method13651(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (null != Class289.aString3120 && Class289.aString3120.equalsIgnoreCase(string))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static int method13652(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class687_Sub39.anIntArray10926 = null;
		Class164_Sub5.anInt9892 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_2_ = new LinkedList();
		int i_3_ = bool ? 32768 : 0;
		int i_4_ = i_3_ + (bool ? Class645.aClass24_8347.anInt242 * 1687897897 : 1086203833 * Class645.aClass24_8347.anInt240);
		for (int i_5_ = i_3_; i_5_ < i_4_; i_5_++) {
			Class523_Sub27_Sub18 class523_sub27_sub18 = Class645.aClass24_8347.method839(i_5_, (byte) 96);
			if (class523_sub27_sub18.aBool11842 && class523_sub27_sub18.method18249(-1118547251).toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 50)
					return -1;
				linkedlist.add(Integer.valueOf(i_5_));
				linkedlist_2_.add(class523_sub27_sub18.method18249(-1118547251));
			}
		}
		Class687_Sub39.anIntArray10926 = new int[linkedlist.size()];
		int i_6_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class687_Sub39.anIntArray10926[i_6_++] = integer.intValue();
		}
		String[] strings = ((String[]) linkedlist_2_.toArray(new String[Class687_Sub39.anIntArray10926.length]));
		Class417.method6658(strings, Class687_Sub39.anIntArray10926, -1985472212);
		return linkedlist.size();
	}
}
