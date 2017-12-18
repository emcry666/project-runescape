/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class465 implements Comparable {
	Object anObject5319;
	Object anObject5320;
	long aLong5321;
	long aLong5322;

	Class465(Object object, Object object_0_) {
		anObject5319 = object;
		anObject5320 = object_0_;
	}

	int method7546(Class465 class465_1_, int i) {
		if (3772335256541633919L * aLong5322 < 3772335256541633919L * class465_1_.aLong5322)
			return -1;
		if (aLong5322 * 3772335256541633919L > class465_1_.aLong5322 * 3772335256541633919L)
			return 1;
		return 0;
	}

	public boolean equals(Object object) {
		if (object instanceof Class465)
			return anObject5320.equals(((Class465) object).anObject5320);
		throw new IllegalArgumentException();
	}

	public int compareTo(Object object) {
		return method7546((Class465) object, -2032079883);
	}

	public int method7547(Object object) {
		return method7546((Class465) object, -1338571916);
	}

	public boolean method7548(Object object) {
		if (object instanceof Class465)
			return anObject5320.equals(((Class465) object).anObject5320);
		throw new IllegalArgumentException();
	}

	public int method7549() {
		return anObject5320.hashCode();
	}

	public int method7550(Object object) {
		return method7546((Class465) object, -250289774);
	}

	public int method7551(Object object) {
		return method7546((Class465) object, -790395248);
	}

	public int hashCode() {
		return anObject5320.hashCode();
	}

	static final void method7552(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.playerVarsProvider.method1937(i_2_, -906585411);
	}

	static final void method7553(Class669 class669, int i) {
		Class214.method3842(2089009755);
	}

	static final void method7554(Class669 class669, int i) {
		Class523_Sub32 class523_sub32 = Class523_Sub20.method16096(35051);
		if (null == class523_sub32) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1039292053 * class523_sub32.anInt10578;
			int i_3_ = (class523_sub32.anInt10579 * 2078544271 << 28 | (-1808941705 * class523_sub32.anInt10580 + Class534.anInt7168) << 14 | (Class534.anInt7159 + -1727058043 * class523_sub32.anInt10581));
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_3_;
		}
	}

	static final void method7555(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1222917157 * Class218.aClass523_Sub41_2319.anInt10758;
	}

	public static String method7556(CharSequence charsequence, int i) {
		String string = Class480.method7899(Class324.method5732(charsequence, (byte) 0));
		if (null == string)
			string = "";
		return string;
	}

	static final void method7557(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 0, -503519840);
		Class211.method3824(1683971819);
		client.aBool11012 = false;
	}

	static String method7558(String string, boolean bool, byte i) {
		String string_4_ = bool ? "https://" : "http://";
		if (Class80.aClass674_865 == Class674.aClass674_8618)
			string = new StringBuilder().append(string).append("-wtrc").toString();
		else if (Class80.aClass674_865 == Class674.aClass674_8615)
			string = new StringBuilder().append(string).append("-wtqa").toString();
		else if (Class674.aClass674_8616 == Class80.aClass674_865)
			string = new StringBuilder().append(string).append("-wtwip").toString();
		else if (Class80.aClass674_865 == Class674.aClass674_8623)
			string = new StringBuilder().append(string).append("-wti").toString();
		else if (Class80.aClass674_865 == Class674.aClass674_8622)
			string = new StringBuilder().append(string).append("-demo").toString();
		else if (Class674.aClass674_8617 == Class80.aClass674_865)
			string = "local";
		String string_5_ = "";
		if (null != client.aString10983)
			string_5_ = new StringBuilder().append("/p=").append(client.aString10983).toString();
		String string_6_ = new StringBuilder().append(client.aClass681_11284.aString8645).append(".com").toString();
		return new StringBuilder().append(string_4_).append(string).append(".").append(string_6_).append("/l=").append(1965832361 * Class53_Sub20.aClass668_10979.anInt8549).append("/a=").append(client.anInt10984 * 1778108951).append(string_5_).append("/").toString();
	}

	static final void method7559(Class669 class669, byte i) {
		int i_7_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method13890(i_7_, 2037354872);
	}
}
