/* Class646 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class646 {
	public static Class646 aClass646_8348;
	public static Class646 aClass646_8349 = new Class646(1);
	public static Class646 aClass646_8350;
	static Class646 aClass646_8351;
	public static Class646 aClass646_8352;
	static Class646 aClass646_8353;
	public static Class646 aClass646_8354;
	public static Class646 aClass646_8355;
	static Class646 aClass646_8356;
	static Class646 aClass646_8357;
	public static Class646 aClass646_8358;
	static Class646 aClass646_8359;
	static Class646 aClass646_8360;
	public static Class646 aClass646_8361 = new Class646(2);
	static Class646 aClass646_8362;
	public int anInt8363;

	static {
		aClass646_8350 = new Class646(4);
		aClass646_8358 = new Class646(8);
		aClass646_8352 = new Class646(16);
		aClass646_8355 = new Class646(32);
		aClass646_8354 = new Class646(64);
		aClass646_8348 = new Class646(128);
		aClass646_8356 = new Class646(256);
		aClass646_8357 = new Class646(512);
		aClass646_8353 = new Class646(1024);
		aClass646_8359 = new Class646(2048);
		aClass646_8360 = new Class646(4096);
		aClass646_8351 = new Class646(8192);
		aClass646_8362 = new Class646(16384);
	}

	Class646(int i) {
		anInt8363 = 1736791001 * i;
	}

	static final void method10564(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int[] is = Class594.method9807(string, class669, (byte) 0);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2656 = Class78.method1554(string, class669, -68449792);
		class250.anIntArray2657 = is;
		class250.aBool2635 = true;
	}

	static final void method10565(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method13890(i_0_, 2031468426);
	}

	public static long method10566(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		Class91.aCalendar894.clear();
		Class91.aCalendar894.set(i_5_, i_4_, i_3_, i_2_, i_1_, i);
		return Class91.aCalendar894.getTime().getTime();
	}
}
