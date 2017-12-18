/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class498 {
	public int anInt5564;
	public int anInt5565;
	public int anInt5566;
	public int anInt5567;

	Class498(int i, int i_0_, int i_1_, int i_2_) {
		anInt5565 = i * 2045515081;
		anInt5567 = -1231142113 * i_0_;
		anInt5566 = i_1_ * -934092833;
		anInt5564 = i_2_ * 363692005;
	}

	Class498() {
		anInt5565 = (32 + (int) (Math.random() * 4.0)) * 2045515081;
		anInt5567 = (3 + (int) (Math.random() * 2.0)) * -1231142113;
		anInt5566 = (16 + (int) (Math.random() * 3.0)) * -934092833;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1646046639) == 1)
			anInt5564 = (int) (Math.random() * 6.0) * 363692005;
		else
			anInt5564 = (int) (Math.random() * 12.0) * 363692005;
	}

	static final void method8106(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Character.toUpperCase((char) i_3_);
	}

	static final void method8107(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_4_ >= 1 && i_4_ <= 2) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub5_10632), i_4_, -99459575);
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub5_10633), i_4_, -53134268);
			Class211.method3824(1309162786);
		}
	}

	static final void method8108(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
