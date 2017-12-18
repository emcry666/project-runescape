/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class261 {
	int anInt2839;
	static final int anInt2840 = 100;
	Class523_Sub27_Sub15[] aClass523_Sub27_Sub15Array2841 = new Class523_Sub27_Sub15[100];

	int method4712() {
		return 529124183 * anInt2839;
	}

	Class523_Sub27_Sub15 method4713(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_, String string_4_, int i_5_, Class421 class421, int i_6_) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = aClass523_Sub27_Sub15Array2841[99];
		for (int i_7_ = 529124183 * anInt2839; i_7_ > 0; i_7_--) {
			if (100 != i_7_)
				aClass523_Sub27_Sub15Array2841[i_7_] = aClass523_Sub27_Sub15Array2841[i_7_ - 1];
		}
		if (class523_sub27_sub15 == null)
			class523_sub27_sub15 = new Class523_Sub27_Sub15(i, i_0_, string, string_1_, string_2_, string_4_, i_5_, string_3_, class421);
		else {
			class523_sub27_sub15.method8661(607052656);
			class523_sub27_sub15.method16154(-261651695);
			class523_sub27_sub15.method18163(i, i_0_, string, string_1_, string_2_, string_4_, i_5_, string_3_, class421, 1200702680);
		}
		aClass523_Sub27_Sub15Array2841[0] = class523_sub27_sub15;
		if (529124183 * anInt2839 < 100)
			anInt2839 += 27021415;
		return class523_sub27_sub15;
	}

	Class261() {
		/* empty */
	}

	int method4714(int i) {
		return 529124183 * anInt2839;
	}

	Class523_Sub27_Sub15 method4715(int i, int i_8_, String string, String string_9_, String string_10_, String string_11_, String string_12_, int i_13_, Class421 class421) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = aClass523_Sub27_Sub15Array2841[99];
		for (int i_14_ = 529124183 * anInt2839; i_14_ > 0; i_14_--) {
			if (100 != i_14_)
				aClass523_Sub27_Sub15Array2841[i_14_] = aClass523_Sub27_Sub15Array2841[i_14_ - 1];
		}
		if (class523_sub27_sub15 == null)
			class523_sub27_sub15 = new Class523_Sub27_Sub15(i, i_8_, string, string_9_, string_10_, string_12_, i_13_, string_11_, class421);
		else {
			class523_sub27_sub15.method8661(607052656);
			class523_sub27_sub15.method16154(-261651695);
			class523_sub27_sub15.method18163(i, i_8_, string, string_9_, string_10_, string_12_, i_13_, string_11_, class421, -434399386);
		}
		aClass523_Sub27_Sub15Array2841[0] = class523_sub27_sub15;
		if (529124183 * anInt2839 < 100)
			anInt2839 += 27021415;
		return class523_sub27_sub15;
	}

	Class523_Sub27_Sub15 method4716(int i, int i_15_, String string, String string_16_, String string_17_, String string_18_, String string_19_, int i_20_, Class421 class421) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = aClass523_Sub27_Sub15Array2841[99];
		for (int i_21_ = 529124183 * anInt2839; i_21_ > 0; i_21_--) {
			if (100 != i_21_)
				aClass523_Sub27_Sub15Array2841[i_21_] = aClass523_Sub27_Sub15Array2841[i_21_ - 1];
		}
		if (class523_sub27_sub15 == null)
			class523_sub27_sub15 = new Class523_Sub27_Sub15(i, i_15_, string, string_16_, string_17_, string_19_, i_20_, string_18_, class421);
		else {
			class523_sub27_sub15.method8661(607052656);
			class523_sub27_sub15.method16154(-261651695);
			class523_sub27_sub15.method18163(i, i_15_, string, string_16_, string_17_, string_19_, i_20_, string_18_, class421, 1332798460);
		}
		aClass523_Sub27_Sub15Array2841[0] = class523_sub27_sub15;
		if (529124183 * anInt2839 < 100)
			anInt2839 += 27021415;
		return class523_sub27_sub15;
	}

	Class523_Sub27_Sub15 method4717(int i) {
		if (i < 0 || i >= anInt2839 * 529124183)
			return null;
		return aClass523_Sub27_Sub15Array2841[i];
	}

	Class523_Sub27_Sub15 method4718(int i) {
		if (i < 0 || i >= anInt2839 * 529124183)
			return null;
		return aClass523_Sub27_Sub15Array2841[i];
	}

	int method4719() {
		return 529124183 * anInt2839;
	}

	int method4720() {
		return 529124183 * anInt2839;
	}

	Class523_Sub27_Sub15 method4721(int i, int i_22_) {
		if (i < 0 || i >= anInt2839 * 529124183)
			return null;
		return aClass523_Sub27_Sub15Array2841[i];
	}

	public static Class695[] method4722(Class693 class693, int i) {
		int[] is = class693.method13969((byte) -69);
		Class695[] class695s = new Class695[is.length >> 2];
		for (int i_23_ = 0; i_23_ < class695s.length; i_23_++) {
			Class695 class695 = new Class695();
			class695s[i_23_] = class695;
			class695.anInt8753 = -1082757303 * is[i_23_ << 2];
			class695.anInt8754 = 1032494173 * is[(i_23_ << 2) + 1];
			class695.anInt8752 = is[(i_23_ << 2) + 2] * -278555651;
			class695.anInt8755 = is[3 + (i_23_ << 2)] * -1205331229;
		}
		return class695s;
	}

	static final void method4723(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class328.method5787(class250, class242, class669, -361765999);
	}
}
