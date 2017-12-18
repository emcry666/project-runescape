/* Class164_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class164_Sub3 extends Class164 {
	int[] anIntArray9843;
	Class148[] aClass148Array9844;
	Class148[] aClass148Array9845;
	int[] anIntArray9846;
	int[] anIntArray9847;
	Class178_Sub3 aClass178_Sub3_9848;
	int[] anIntArray9849;

	void method2626(char c, int i, int i_0_, int i_1_, boolean bool) {
		if (aClass178_Sub3_9848.anIntArray9804 != null) {
			i += anIntArray9843[c];
			i_0_ += anIntArray9849[c];
			if (bool)
				aClass148Array9845[c].method2436(i, i_0_, 1, i_1_, 1);
			else
				aClass148Array9844[c].method2436(i, i_0_, 1, i_1_, 1);
		}
	}

	void method2622(char c, int i, int i_2_, int i_3_, boolean bool) {
		if (aClass178_Sub3_9848.anIntArray9804 != null) {
			i += anIntArray9843[c];
			i_2_ += anIntArray9849[c];
			if (bool)
				aClass148Array9845[c].method2436(i, i_2_, 1, i_3_, 1);
			else
				aClass148Array9844[c].method2436(i, i_2_, 1, i_3_, 1);
		}
	}

	void method2610(char c, int i, int i_4_, int i_5_, boolean bool, Class145 class145, int i_6_, int i_7_) {
		/* empty */
	}

	Class164_Sub3(Class178_Sub3 class178_sub3, Class10 class10, Class175_Sub1[] class175_sub1s, int[] is, int[] is_8_) {
		super(class178_sub3, class10);
		aClass178_Sub3_9848 = class178_sub3;
		aClass178_Sub3_9848 = class178_sub3;
		anIntArray9846 = is;
		anIntArray9847 = is_8_;
		aClass148Array9844 = new Class148[class175_sub1s.length];
		aClass148Array9845 = new Class148[class175_sub1s.length];
		anIntArray9849 = new int[class175_sub1s.length];
		anIntArray9843 = new int[class175_sub1s.length];
		for (int i = 0; i < class175_sub1s.length; i++) {
			aClass148Array9844[i] = aClass178_Sub3_9848.method3104(class175_sub1s[i], false);
			int[] is_9_ = (int[]) class175_sub1s[i].method2959(false).clone();
			for (int i_10_ = 0; i_10_ < is_9_.length; i_10_++) {
				int i_11_ = is_9_[i_10_];
				int i_12_ = (byte) (((i_11_ >> 8 & 0xff) * 4 + 3 * (i_11_ >> 16 & 0xff) + (i_11_ & 0xff)) >> 3);
				is_9_[i_10_] = (is_9_[i_10_] & ~0xffffff | i_12_ << 16 | i_12_ << 8 | i_12_);
			}
			aClass148Array9845[i] = aClass178_Sub3_9848.method3102(is_9_, 0, anIntArray9846[i], anIntArray9846[i], anIntArray9847[i], false);
			anIntArray9849[i] = class175_sub1s[i].method2948();
			anIntArray9843[i] = class175_sub1s[i].method2946();
		}
	}

	void method2616(char c, int i, int i_13_, int i_14_, boolean bool) {
		if (aClass178_Sub3_9848.anIntArray9804 != null) {
			i += anIntArray9843[c];
			i_13_ += anIntArray9849[c];
			if (bool)
				aClass148Array9845[c].method2436(i, i_13_, 1, i_14_, 1);
			else
				aClass148Array9844[c].method2436(i, i_13_, 1, i_14_, 1);
		}
	}

	void method2611(char c, int i, int i_15_, int i_16_, boolean bool) {
		if (aClass178_Sub3_9848.anIntArray9804 != null) {
			i += anIntArray9843[c];
			i_15_ += anIntArray9849[c];
			if (bool)
				aClass148Array9845[c].method2436(i, i_15_, 1, i_16_, 1);
			else
				aClass148Array9844[c].method2436(i, i_15_, 1, i_16_, 1);
		}
	}

	void method2612(char c, int i, int i_17_, int i_18_, boolean bool) {
		if (aClass178_Sub3_9848.anIntArray9804 != null) {
			i += anIntArray9843[c];
			i_17_ += anIntArray9849[c];
			if (bool)
				aClass148Array9845[c].method2436(i, i_17_, 1, i_18_, 1);
			else
				aClass148Array9844[c].method2436(i, i_17_, 1, i_18_, 1);
		}
	}

	void method2615(char c, int i, int i_19_, int i_20_, boolean bool, Class145 class145, int i_21_, int i_22_) {
		/* empty */
	}
}
