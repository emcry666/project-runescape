/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class Class220 {
	static final int anInt2328 = 5;
	List aList2329 = new ArrayList();
	static Font aFont2330;
	public static Class57 aClass57_2331;

	public Class219 method4104(int i) {
		return (Class219) aList2329.get(i);
	}

	public int method4105() {
		return aList2329.size();
	}

	public int method4106(int i) {
		return aList2329.size();
	}

	public Class219 method4107(int i, int i_0_) {
		return (Class219) aList2329.get(i);
	}

	public int method4108(Class219 class219) {
		return method4109(class219, -1, -1391155491);
	}

	public int method4109(Class219 class219, int i, int i_1_) {
		if (aList2329.size() == 5)
			throw new RuntimeException("");
		if (method4110(class219.anInt2325 * 704063689, 1229574029) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2329.size();
		aList2329.add(i, class219);
		return i;
	}

	public int method4110(int i, int i_2_) {
		for (int i_3_ = 0; i_3_ < aList2329.size(); i_3_++) {
			if (((Class219) aList2329.get(i_3_)).anInt2325 * 704063689 == i)
				return i_3_;
		}
		return -1;
	}

	public void method4111(int i) {
		aList2329.clear();
	}

	public int method4112(Class219 class219) {
		return method4109(class219, -1, -813976872);
	}

	public int method4113() {
		return aList2329.size();
	}

	public void method4114(int i) {
		aList2329.remove(i);
	}

	public int method4115(int i) {
		for (int i_4_ = 0; i_4_ < aList2329.size(); i_4_++) {
			if (((Class219) aList2329.get(i_4_)).anInt2325 * 704063689 == i)
				return i_4_;
		}
		return -1;
	}

	public int method4116(int i) {
		for (int i_5_ = 0; i_5_ < aList2329.size(); i_5_++) {
			if (((Class219) aList2329.get(i_5_)).anInt2325 * 704063689 == i)
				return i_5_;
		}
		return -1;
	}

	public Class219 method4117(int i) {
		return (Class219) aList2329.get(i);
	}

	public int method4118(Class219 class219, int i) {
		return method4109(class219, -1, -38088196);
	}

	public Class219 method4119(int i) {
		return (Class219) aList2329.get(i);
	}

	public int method4120() {
		return aList2329.size();
	}

	public void method4121(int i, int i_6_) {
		aList2329.remove(i);
	}

	public int method4122(Class219 class219, int i) {
		if (aList2329.size() == 5)
			throw new RuntimeException("");
		if (method4110(class219.anInt2325 * 704063689, -344837818) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2329.size();
		aList2329.add(i, class219);
		return i;
	}

	public int method4123(Class219 class219, int i) {
		if (aList2329.size() == 5)
			throw new RuntimeException("");
		if (method4110(class219.anInt2325 * 704063689, 300148605) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2329.size();
		aList2329.add(i, class219);
		return i;
	}

	public int method4124(Class219 class219, int i) {
		if (aList2329.size() == 5)
			throw new RuntimeException("");
		if (method4110(class219.anInt2325 * 704063689, -1578560314) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2329.size();
		aList2329.add(i, class219);
		return i;
	}

	public int method4125(Class219 class219, int i) {
		if (aList2329.size() == 5)
			throw new RuntimeException("");
		if (method4110(class219.anInt2325 * 704063689, -1364686018) != -1)
			throw new RuntimeException("");
		if (i == -1)
			i = aList2329.size();
		aList2329.add(i, class219);
		return i;
	}

	public void method4126(int i) {
		aList2329.remove(i);
	}

	public void method4127() {
		aList2329.clear();
	}

	public void method4128() {
		aList2329.clear();
	}

	static void method4129(short i) {
		Class43.aString583 = "";
		Class43.aString594 = "";
		Class43.aString603 = "";
		Class43.aBool588 = true;
	}

	public static boolean method4130(byte i) {
		return Class569.aBool7641;
	}

	static boolean method4131(int i) {
		client.anInt11060 += -814353587;
		client.aBool11061 = true;
		return true;
	}
}
