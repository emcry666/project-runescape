/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class535 {
	Class535() throws Throwable {
		throw new Error();
	}

	public static void method8915(int[] is, int[] is_0_, int i, int i_1_, int i_2_) {
		if (i < i_1_) {
			int i_3_ = (i + i_1_) / 2;
			int i_4_ = i;
			int i_5_ = is[i_3_];
			is[i_3_] = is[i_1_];
			is[i_1_] = i_5_;
			int i_6_ = is_0_[i_3_];
			is_0_[i_3_] = is_0_[i_1_];
			is_0_[i_1_] = i_6_;
			int i_7_ = 2147483647 == i_5_ ? 0 : 1;
			for (int i_8_ = i; i_8_ < i_1_; i_8_++) {
				if (is[i_8_] < (i_8_ & i_7_) + i_5_) {
					int i_9_ = is[i_8_];
					is[i_8_] = is[i_4_];
					is[i_4_] = i_9_;
					int i_10_ = is_0_[i_8_];
					is_0_[i_8_] = is_0_[i_4_];
					is_0_[i_4_++] = i_10_;
				}
			}
			is[i_1_] = is[i_4_];
			is[i_4_] = i_5_;
			is_0_[i_1_] = is_0_[i_4_];
			is_0_[i_4_] = i_6_;
			method8915(is, is_0_, i, i_4_ - 1, 1752176472);
			method8915(is, is_0_, i_4_ + 1, i_1_, 569456149);
		}
	}

	static final void method8916(Class669 class669, int i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (null != client.friendsChatName && i_11_ < Class365.anInt3866 * 797304521)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class99.aClass115Array1232[i_11_].aString1407;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}

	static final void method8917(Class669 class669, byte i) {
		Class2.method516(759062892);
	}

	static final void method8918(Class669 class669, byte i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_12_ == -1)
			Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub19_10634, Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16906(-2101920759), 1628775820);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), i_12_, 87289792);
		Class242.method4373(-1573339693);
	}

	public static final void method8919(Class647_Sub1 class647_sub1, int i, boolean bool, short i_13_) {
		Class26.method848(class647_sub1, i, true, bool, -2048961662);
	}

	static boolean method8920(Class239 class239, int i) {
		if (null == class239)
			return false;
		if (class239.anIntArray2425 != null) {
			class239 = class239.method4319(Class534_Sub1.anInterface19_7142, Class534_Sub1.anInterface17_7141, 402178155);
			if (null == class239)
				return false;
		}
		if (!class239.aBool2412)
			return false;
		if (!class239.method4314(Class534_Sub1.anInterface19_7142, Class534_Sub1.anInterface17_7141, 788165095))
			return false;
		if (Class534_Sub1.aClass14_10774.method741((long) (-1942551915 * class239.anInt2403)) != null)
			return false;
		if (Class534_Sub1.aClass14_10793.method741((long) (1444609703 * class239.anInt2443)) != null)
			return false;
		if (null != class239.aString2441) {
			if (0 == class239.anInt2402 * 933897945 && Class534_Sub1.aBool10778)
				return false;
			if (1 == class239.anInt2402 * 933897945 && Class534_Sub1.aBool10771)
				return false;
			if (933897945 * class239.anInt2402 == 2 && Class534_Sub1.aBool10797)
				return false;
		}
		return true;
	}

	public static void method8921(int i, boolean bool, byte i_14_) {
		Class562.method9463(i, Class39.aClass39_474.method1124((Class53_Sub20.aClass668_10979), (byte) -96), bool, (byte) -102);
	}
}
