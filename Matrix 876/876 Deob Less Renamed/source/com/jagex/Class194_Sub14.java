/* Class194_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class194_Sub14 extends Class194 {
	int anInt9926;
	int anInt9927;
	int anInt9928;
	int anInt9929;
	int anInt9930;
	public static int anInt9931;

	public void method3656() {
		Class191.aClass192Array2157[anInt9926 * 222403815].method3628(-340318397 * anInt9927, anInt9928 * -1672798057, anInt9929 * -1684592773, anInt9930 * -147079407, -2105700049);
	}

	Class194_Sub14(Class523_Sub34 class523_sub34) {
		super(class523_sub34);
		anInt9926 = class523_sub34.readUnsignedShort(-286783886) * -1732266281;
		int i = class523_sub34.readUnsignedInt((byte) -24);
		anInt9927 = 687873387 * (i >>> 16);
		anInt9928 = (i & 0xffff) * -453353689;
		anInt9929 = class523_sub34.readUnsignedByte(-1585855558) * 205430707;
		anInt9930 = class523_sub34.method16487((byte) -85) * -369028623;
	}

	public void method3651() {
		Class191.aClass192Array2157[anInt9926 * 222403815].method3628(-340318397 * anInt9927, anInt9928 * -1672798057, anInt9929 * -1684592773, anInt9930 * -147079407, -990406219);
	}

	public void method3648(int i) {
		Class191.aClass192Array2157[anInt9926 * 222403815].method3628(-340318397 * anInt9927, anInt9928 * -1672798057, anInt9929 * -1684592773, anInt9930 * -147079407, -416825422);
	}

	public void method3657() {
		Class191.aClass192Array2157[anInt9926 * 222403815].method3628(-340318397 * anInt9927, anInt9928 * -1672798057, anInt9929 * -1684592773, anInt9930 * -147079407, -1388054737);
	}

	public static void method15513(Canvas canvas, byte i) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static String method15514(Class523_Sub27_Sub6 class523_sub27_sub6, int i) {
		if (Class36.aBool326 || null == class523_sub27_sub6)
			return "";
		return class523_sub27_sub6.aString11629;
	}

	public static void method15515(int i, int i_0_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(5, (long) i);
		class523_sub27_sub7.method17962((byte) 70);
	}

	public static Class691 method15516(byte i) {
		if (Class687_Sub6.aClass691_10838 == null)
			return Class691.aClass691_8695;
		return Class687_Sub6.aClass691_10838;
	}
}
