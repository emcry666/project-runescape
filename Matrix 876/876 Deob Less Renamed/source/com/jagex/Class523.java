/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523 {
	public Class523 aClass523_7063;
	public Class523 aClass523_7064;
	public long aLong7065;

	public boolean method8660(int i) {
		if (null == aClass523_7064)
			return false;
		return true;
	}

	public void method8661(int i) {
		if (aClass523_7064 != null) {
			aClass523_7064.aClass523_7063 = aClass523_7063;
			aClass523_7063.aClass523_7064 = aClass523_7064;
			aClass523_7063 = null;
			aClass523_7064 = null;
		}
	}

	public boolean method8662() {
		if (null == aClass523_7064)
			return false;
		return true;
	}

	public void method8663() {
		if (aClass523_7064 != null) {
			aClass523_7064.aClass523_7063 = aClass523_7063;
			aClass523_7063.aClass523_7064 = aClass523_7064;
			aClass523_7063 = null;
			aClass523_7064 = null;
		}
	}

	public void method8664() {
		if (aClass523_7064 != null) {
			aClass523_7064.aClass523_7063 = aClass523_7063;
			aClass523_7063.aClass523_7064 = aClass523_7064;
			aClass523_7063 = null;
			aClass523_7064 = null;
		}
	}

	static final void method8665(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -685583323);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class457.method7443(class250, class242, true, 0, class669, -1968462546);
	}

	static final void method8666(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2665 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	public static void method8667(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int[] is, int[] is_1_, int[] is_2_, byte i) {
		for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
			int i_4_ = is[i_3_];
			int i_5_ = is_2_[i_3_];
			int i_6_ = is_1_[i_3_];
			for (int i_7_ = 0; i_5_ != 0 && i_7_ < (class647_sub1_sub3_sub1.aClass707_Sub2_Sub1Array11933).length; i_5_ >>>= 1) {
				if ((i_5_ & 0x1) != 0) {
					if (i_4_ == -1)
						class647_sub1_sub3_sub1.aClass707_Sub2_Sub1Array11933[i_7_] = null;
					else {
						AnimationDefinitions class205 = (AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(i_4_, (byte) -49);
						int i_8_ = 1566662983 * class205.anInt2220;
						Class707_Sub2_Sub1 class707_sub2_sub1 = (class647_sub1_sub3_sub1.aClass707_Sub2_Sub1Array11933[i_7_]);
						if (class707_sub2_sub1 != null && class707_sub2_sub1.method14161(-471473147)) {
							if (i_4_ == class707_sub2_sub1.method14163(-2021498443)) {
								if (0 == i_8_) {
									class647_sub1_sub3_sub1.aClass707_Sub2_Sub1Array11933[i_7_] = null;
									class707_sub2_sub1 = null;
								} else if (1 == i_8_) {
									class707_sub2_sub1.method14217(-1323628072);
									class707_sub2_sub1.anInt11876 = -54553365 * i_6_;
								} else if (2 == i_8_)
									class707_sub2_sub1.method14178(2032475245);
							} else if (class205.priority * 1835115947 >= ((class707_sub2_sub1.method14203(708387695).priority) * 1835115947)) {
								class647_sub1_sub3_sub1.aClass707_Sub2_Sub1Array11933[i_7_] = null;
								class707_sub2_sub1 = null;
							}
						}
						if (class707_sub2_sub1 == null || !class707_sub2_sub1.method14161(1774804502)) {
							class707_sub2_sub1 = class647_sub1_sub3_sub1.aClass707_Sub2_Sub1Array11933[i_7_] = (new Class707_Sub2_Sub1(class647_sub1_sub3_sub1));
							class707_sub2_sub1.method14164(i_4_, (byte) 12);
							class707_sub2_sub1.anInt11876 = i_6_ * -54553365;
						}
					}
				}
				i_7_++;
			}
		}
	}
}
