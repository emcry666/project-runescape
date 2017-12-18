/* Class523_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub16 extends Class523 {
	Class523_Sub32 aClass523_Sub32_10472;
	int anInt10473;
	int anInt10474;
	int anInt10475;
	int anInt10476;
	int anInt10477;
	int anInt10478 = 1277838611;
	int anInt10479;
	int anInt10480;

	Class523_Sub16(Class523_Sub32 class523_sub32) {
		anInt10476 = -2147483648;
		anInt10474 = -961263045;
		anInt10475 = -2147483648;
		anInt10477 = -1920518619;
		anInt10480 = -2147483648;
		anInt10473 = -2075295943;
		anInt10479 = -2147483648;
		aClass523_Sub32_10472 = class523_sub32;
	}

	boolean method15994(int i, int i_0_, int i_1_) {
		if (i >= anInt10478 * -1219251483 && i <= anInt10476 * -1530081007 && i_0_ >= anInt10474 * 1187643661 && i_0_ <= 275523501 * anInt10475)
			return true;
		if (i >= anInt10477 * -182711725 && i <= -689410529 * anInt10480 && i_0_ >= anInt10473 * -657702665 && i_0_ <= anInt10479 * -175288909)
			return true;
		return false;
	}

	boolean method15995(int i, int i_2_) {
		if (i >= anInt10478 * -1219251483 && i <= anInt10476 * -1530081007 && i_2_ >= anInt10474 * 1187643661 && i_2_ <= 275523501 * anInt10475)
			return true;
		if (i >= anInt10477 * -182711725 && i <= -689410529 * anInt10480 && i_2_ >= anInt10473 * -657702665 && i_2_ <= anInt10479 * -175288909)
			return true;
		return false;
	}

	boolean method15996(int i, int i_3_) {
		if (i >= anInt10478 * -1219251483 && i <= anInt10476 * -1530081007 && i_3_ >= anInt10474 * 1187643661 && i_3_ <= 275523501 * anInt10475)
			return true;
		if (i >= anInt10477 * -182711725 && i <= -689410529 * anInt10480 && i_3_ >= anInt10473 * -657702665 && i_3_ <= anInt10479 * -175288909)
			return true;
		return false;
	}

	static final void method15997(Class669 class669, int i) {
		if (Class673.aClass523_Sub19_8611 != null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
			class669.aClass523_Sub19_8569 = Class673.aClass523_Sub19_8611;
		} else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static void method15998(String[] strings, int[] is, int i, int i_4_, short i_5_) {
		if (i < i_4_) {
			int i_6_ = (i_4_ + i) / 2;
			int i_7_ = i;
			String string = strings[i_6_];
			strings[i_6_] = strings[i_4_];
			strings[i_4_] = string;
			int i_8_ = is[i_6_];
			is[i_6_] = is[i_4_];
			is[i_4_] = i_8_;
			for (int i_9_ = i; i_9_ < i_4_; i_9_++) {
				if (string == null || (strings[i_9_] != null && strings[i_9_].compareTo(string) < (i_9_ & 0x1))) {
					String string_10_ = strings[i_9_];
					strings[i_9_] = strings[i_7_];
					strings[i_7_] = string_10_;
					int i_11_ = is[i_9_];
					is[i_9_] = is[i_7_];
					is[i_7_++] = i_11_;
				}
			}
			strings[i_4_] = strings[i_7_];
			strings[i_7_] = string;
			is[i_4_] = is[i_7_];
			is[i_7_] = i_8_;
			method15998(strings, is, i, i_7_ - 1, (short) 2177);
			method15998(strings, is, i_7_ + 1, i_4_, (short) 7904);
		}
	}
}
