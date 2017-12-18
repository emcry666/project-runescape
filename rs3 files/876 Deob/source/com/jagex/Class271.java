/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class271 {
	static int anInt2875;
	static Class14 aClass14_2876;
	static JS5FileQueue aClass697_2877;
	static Map aMap2878 = new HashMap();

	public static Class523_Sub27_Sub15 method4988(int i) {
		return (Class523_Sub27_Sub15) aClass14_2876.getFromIndex((long) i);
	}

	static {
		aClass14_2876 = new Class14(1024);
		aClass697_2877 = new JS5FileQueue();
		anInt2875 = 0;
	}

	static int method4989() {
		return (anInt2875 += 1300344851) * -706897381 - 1;
	}

	static int method4990() {
		return (anInt2875 += 1300344851) * -706897381 - 1;
	}

	static int method4991() {
		return (anInt2875 += 1300344851) * -706897381 - 1;
	}

	Class271() throws Throwable {
		throw new Error();
	}

	public static int method4992() {
		return anInt2875 * -706897381 - 1;
	}

	public static int method4993(int i) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = (Class523_Sub27_Sub15) aClass14_2876.getFromIndex((long) i);
		if (class523_sub27_sub15 == null)
			return -1;
		if (class523_sub27_sub15.aClass523_Sub27_10553 == aClass697_2877.aClass523_Sub27_8763)
			return -1;
		return (((Class523_Sub27_Sub15) class523_sub27_sub15.aClass523_Sub27_10553).anInt11762 * 1066462451);
	}

	public static void method4994(String string) {
		Class515.method8593(0, 0, "", "", "", string, null, -121089120);
	}

	public static void method4995(int i, String string) {
		Class515.method8593(i, 0, "", "", "", string, null, -780617243);
	}

	public static void method4996(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_, Class421 class421) {
		Class644.method10552(i, i_0_, string, string_1_, string_2_, string_3_, null, -1, class421, (byte) 124);
	}

	public static void method4997(int i, int i_4_, String string, String string_5_, String string_6_, String string_7_, Class421 class421) {
		Class644.method10552(i, i_4_, string, string_5_, string_6_, string_7_, null, -1, class421, (byte) 66);
	}

	public static void method4998(int i, int i_8_, String string, String string_9_, String string_10_, String string_11_, Class421 class421) {
		Class644.method10552(i, i_8_, string, string_9_, string_10_, string_11_, null, -1, class421, (byte) 21);
	}

	public static Class523_Sub27_Sub15 method4999(int i) {
		return (Class523_Sub27_Sub15) aClass14_2876.getFromIndex((long) i);
	}

	public static void method5000(int i, int i_12_, String string, String string_13_, String string_14_, String string_15_, Class421 class421) {
		Class644.method10552(i, i_12_, string, string_13_, string_14_, string_15_, null, -1, class421, (byte) 49);
	}

	public static int method5001() {
		return anInt2875 * -706897381 - 1;
	}

	public static void method5002(String string) {
		Class515.method8593(0, 0, "", "", "", string, null, -1553056729);
	}

	public static void method5003(int i, int i_16_, String string, String string_17_, String string_18_, String string_19_, Class421 class421) {
		Class644.method10552(i, i_16_, string, string_17_, string_18_, string_19_, null, -1, class421, (byte) 32);
	}

	public static Class523_Sub27_Sub15 method5004(int i, int i_20_) {
		Class261 class261 = (Class261) aMap2878.get(Integer.valueOf(i));
		return class261.method4721(i_20_, -1579645012);
	}

	public static void method5005(int i, int i_21_, String string, String string_22_, String string_23_, String string_24_, String string_25_, int i_26_, Class421 class421) {
		Class261 class261 = (Class261) aMap2878.get(Integer.valueOf(i));
		if (null == class261) {
			class261 = new Class261();
			aMap2878.put(Integer.valueOf(i), class261);
		}
		Class523_Sub27_Sub15 class523_sub27_sub15 = class261.method4713(i, i_21_, string, string_22_, string_23_, string_24_, string_25_, i_26_, class421, 638464258);
		aClass14_2876.method738(class523_sub27_sub15, (long) (1066462451 * class523_sub27_sub15.anInt11762));
		aClass697_2877.removeFromQueue(class523_sub27_sub15, (byte) -57);
		client.anInt11229 = client.anInt11251 * -208551861;
	}

	public static void method5006(int i, int i_27_, String string, String string_28_, String string_29_, String string_30_, String string_31_, int i_32_, Class421 class421) {
		Class261 class261 = (Class261) aMap2878.get(Integer.valueOf(i));
		if (null == class261) {
			class261 = new Class261();
			aMap2878.put(Integer.valueOf(i), class261);
		}
		Class523_Sub27_Sub15 class523_sub27_sub15 = class261.method4713(i, i_27_, string, string_28_, string_29_, string_30_, string_31_, i_32_, class421, 2003773022);
		aClass14_2876.method738(class523_sub27_sub15, (long) (1066462451 * class523_sub27_sub15.anInt11762));
		aClass697_2877.removeFromQueue(class523_sub27_sub15, (byte) -65);
		client.anInt11229 = client.anInt11251 * -208551861;
	}

	public static int method5007(int i) {
		Class261 class261 = (Class261) aMap2878.get(Integer.valueOf(i));
		if (class261 == null)
			return 0;
		return class261.method4714(891189503);
	}

	public static void method5008() {
		aMap2878.clear();
		aClass14_2876.method733(609900146);
		aClass697_2877.removeFromQueue(72215380);
		anInt2875 = 0;
	}

	public static void method5009() {
		aMap2878.clear();
		aClass14_2876.method733(1785569148);
		aClass697_2877.removeFromQueue(1687563989);
		anInt2875 = 0;
	}

	public static void method5010(int i, int i_33_, String string, String string_34_, String string_35_, String string_36_, String string_37_, int i_38_, Class421 class421) {
		Class261 class261 = (Class261) aMap2878.get(Integer.valueOf(i));
		if (null == class261) {
			class261 = new Class261();
			aMap2878.put(Integer.valueOf(i), class261);
		}
		Class523_Sub27_Sub15 class523_sub27_sub15 = class261.method4713(i, i_33_, string, string_34_, string_35_, string_36_, string_37_, i_38_, class421, 1342048478);
		aClass14_2876.method738(class523_sub27_sub15, (long) (1066462451 * class523_sub27_sub15.anInt11762));
		aClass697_2877.removeFromQueue(class523_sub27_sub15, (byte) -5);
		client.anInt11229 = client.anInt11251 * -208551861;
	}

	public static int method5011(int i) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = (Class523_Sub27_Sub15) aClass14_2876.getFromIndex((long) i);
		if (class523_sub27_sub15 == null)
			return -1;
		if (aClass697_2877.aClass523_Sub27_8763 == class523_sub27_sub15.aClass523_Sub27_10551)
			return -1;
		return (((Class523_Sub27_Sub15) class523_sub27_sub15.aClass523_Sub27_10551).anInt11762 * 1066462451);
	}

	public static int method5012(int i) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = (Class523_Sub27_Sub15) aClass14_2876.getFromIndex((long) i);
		if (class523_sub27_sub15 == null)
			return -1;
		if (aClass697_2877.aClass523_Sub27_8763 == class523_sub27_sub15.aClass523_Sub27_10551)
			return -1;
		return (((Class523_Sub27_Sub15) class523_sub27_sub15.aClass523_Sub27_10551).anInt11762 * 1066462451);
	}

	public static void method5013(int i, byte i_39_) {
		Class95.method1767(new Class573(i), 1009741010);
	}

	static final void method5014(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(1520912650);
	}

	static final void method5015(Class669 class669, byte i) {
		int i_40_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method13890(i_40_, 1998673036);
	}

	static final void method5016(Class669 class669, int i) {
		Class523_Sub27_Sub6 class523_sub27_sub6 = Class421.method6676(-1699349874);
		if (Class16.method770(class523_sub27_sub6, -42478970) == 7) {
			int i_41_ = (int) class523_sub27_sub6.method17955(937050569);
			if (i_41_ >= 0 && i_41_ <= 393652345 * Class108.anInt1318) {
				Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_41_];
				if (class647_sub1_sub3_sub1_sub2 != null) {
					class669.aClass647_Sub1_Sub3_Sub1_8552 = class647_sub1_sub3_sub1_sub2;
					class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
					return;
				}
			}
		}
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static void method5017(int i, byte i_42_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(22, (long) i);
		class523_sub27_sub7.method17962((byte) 103);
	}
}
