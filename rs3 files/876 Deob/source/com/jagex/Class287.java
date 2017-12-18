/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class287 {
	static Class287 aClass287_3097 = new Class287(0, 4);
	static Class287 aClass287_3098;
	static Class287 aClass287_3099 = new Class287(1, 5);
	int anInt3100;
	public int anInt3101;
	public static Class53_Sub1 aClass53_Sub1_3102;

	static Class287[] method5154() {
		return (new Class287[] { aClass287_3097, aClass287_3098, aClass287_3099 });
	}

	static {
		aClass287_3098 = new Class287(2, 6);
	}

	static Class287[] method5155() {
		return (new Class287[] { aClass287_3097, aClass287_3098, aClass287_3099 });
	}

	Class287(int i, int i_0_) {
		anInt3100 = -702123025 * i;
		anInt3101 = 2007809001 * i_0_;
	}

	static final void method5156(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 133610621 * client.anInt11190;
	}

	static final void method5157(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub26_10611.method16952((byte) -47);
	}

	static boolean method5158(CharSequence charsequence, int i, boolean bool, int i_1_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		int i_4_ = 0;
		int i_5_ = charsequence.length();
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			int i_7_ = charsequence.charAt(i_6_);
			if (i_6_ == 0) {
				if (45 == i_7_) {
					bool_2_ = true;
					continue;
				}
				if (i_7_ == 43 && bool)
					continue;
			}
			if (i_7_ >= 48 && i_7_ <= 57)
				i_7_ -= 48;
			else if (i_7_ >= 65 && i_7_ <= 90)
				i_7_ -= 55;
			else if (i_7_ >= 97 && i_7_ <= 122)
				i_7_ -= 87;
			else
				return false;
			if (i_7_ >= i)
				return false;
			if (bool_2_)
				i_7_ = -i_7_;
			int i_8_ = i_4_ * i + i_7_;
			if (i_8_ / i != i_4_)
				return false;
			i_4_ = i_8_;
			bool_3_ = true;
		}
		return bool_3_;
	}
}
