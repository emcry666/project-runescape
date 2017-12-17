/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Class559 {
	static Stack aStack7491 = new Stack();
	public Class647_Sub1 aClass647_Sub1_7492;
	boolean aBool7493;
	Class549 aClass549_7494;

	Class559() {
		/* empty */
	}

	public boolean method9235(Class178 class178, int i, int i_0_, byte i_1_) {
		int i_2_ = aClass647_Sub1_7492.method16705(893282136);
		if (null != aClass647_Sub1_7492.aClass180Array10823) {
			for (int i_3_ = 0; i_3_ < aClass647_Sub1_7492.aClass180Array10823.length; i_3_++) {
				aClass647_Sub1_7492.aClass180Array10823[i_3_].anInt2001 <<= i_2_;
				if ((aClass647_Sub1_7492.aClass180Array10823[i_3_].method3529(aClass549_7494.anInt7325 * 1560065365 + i, i_0_ + -1064459547 * aClass549_7494.anInt7324)) && aClass647_Sub1_7492.method16698(class178, i, i_0_, (byte) 77)) {
					aClass647_Sub1_7492.aClass180Array10823[i_3_].anInt2001 >>= i_2_;
					return true;
				}
				aClass647_Sub1_7492.aClass180Array10823[i_3_].anInt2001 >>= i_2_;
			}
		}
		return false;
	}

	public static void method9236() {
		synchronized (aStack7491) {
			aStack7491 = new Stack();
		}
	}

	public static Class559 method9237(boolean bool) {
		synchronized (aStack7491) {
			Class559 class559;
			if (aStack7491.isEmpty())
				class559 = new Class559();
			else
				class559 = (Class559) aStack7491.pop();
			class559.aBool7493 = bool;
			Class559 class559_4_ = class559;
			return class559_4_;
		}
	}

	public static Class559 method9238(boolean bool) {
		synchronized (aStack7491) {
			Class559 class559;
			if (aStack7491.isEmpty())
				class559 = new Class559();
			else
				class559 = (Class559) aStack7491.pop();
			class559.aBool7493 = bool;
			Class559 class559_5_ = class559;
			return class559_5_;
		}
	}

	public static Class559 method9239(boolean bool) {
		synchronized (aStack7491) {
			Class559 class559;
			if (aStack7491.isEmpty())
				class559 = new Class559();
			else
				class559 = (Class559) aStack7491.pop();
			class559.aBool7493 = bool;
			Class559 class559_6_ = class559;
			return class559_6_;
		}
	}

	static void method9240(Class559 class559) {
		class559.aClass647_Sub1_7492 = null;
		synchronized (aStack7491) {
			if (aStack7491.size() < 200)
				aStack7491.push(class559);
		}
	}

	static void method9241(Class559 class559) {
		class559.aClass647_Sub1_7492 = null;
		synchronized (aStack7491) {
			if (aStack7491.size() < 200)
				aStack7491.push(class559);
		}
	}

	public boolean method9242(Class178 class178, int i, int i_7_) {
		int i_8_ = aClass647_Sub1_7492.method16705(893282136);
		if (null != aClass647_Sub1_7492.aClass180Array10823) {
			for (int i_9_ = 0; i_9_ < aClass647_Sub1_7492.aClass180Array10823.length; i_9_++) {
				aClass647_Sub1_7492.aClass180Array10823[i_9_].anInt2001 <<= i_8_;
				if ((aClass647_Sub1_7492.aClass180Array10823[i_9_].method3529(aClass549_7494.anInt7325 * 1560065365 + i, i_7_ + -1064459547 * aClass549_7494.anInt7324)) && aClass647_Sub1_7492.method16698(class178, i, i_7_, (byte) 64)) {
					aClass647_Sub1_7492.aClass180Array10823[i_9_].anInt2001 >>= i_8_;
					return true;
				}
				aClass647_Sub1_7492.aClass180Array10823[i_9_].anInt2001 >>= i_8_;
			}
		}
		return false;
	}

	public boolean method9243(Class178 class178, int i, int i_10_) {
		int i_11_ = aClass647_Sub1_7492.method16705(893282136);
		if (null != aClass647_Sub1_7492.aClass180Array10823) {
			for (int i_12_ = 0; i_12_ < aClass647_Sub1_7492.aClass180Array10823.length; i_12_++) {
				aClass647_Sub1_7492.aClass180Array10823[i_12_].anInt2001 <<= i_11_;
				if ((aClass647_Sub1_7492.aClass180Array10823[i_12_].method3529(aClass549_7494.anInt7325 * 1560065365 + i, i_10_ + -1064459547 * aClass549_7494.anInt7324)) && aClass647_Sub1_7492.method16698(class178, i, i_10_, (byte) 122)) {
					aClass647_Sub1_7492.aClass180Array10823[i_12_].anInt2001 >>= i_11_;
					return true;
				}
				aClass647_Sub1_7492.aClass180Array10823[i_12_].anInt2001 >>= i_11_;
			}
		}
		return false;
	}

	public static Class274 method9244(int i, byte i_13_) {
		if (i == Class274.aClass274_2894.anInt2896 * 933737585)
			return Class274.aClass274_2894;
		if (i == Class274.aClass274_2892.anInt2896 * 933737585)
			return Class274.aClass274_2892;
		if (Class274.aClass274_2898.anInt2896 * 933737585 == i)
			return Class274.aClass274_2898;
		if (i == Class274.aClass274_2895.anInt2896 * 933737585)
			return Class274.aClass274_2895;
		if (Class274.aClass274_2893.anInt2896 * 933737585 == i)
			return Class274.aClass274_2893;
		if (Class274.aClass274_2897.anInt2896 * 933737585 == i)
			return Class274.aClass274_2897;
		return null;
	}

	static final void method9245(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static void method9246(int[] is, LinkedList linkedlist, int i, int i_14_, float f, byte i_15_) {
		if (!linkedlist.isEmpty()) {
			for (int i_16_ = 0; i_16_ < linkedlist.size(); i_16_++) {
				Class575 class575 = (Class575) linkedlist.get(i_16_);
				int i_17_ = i + (int) ((float) (class575.anInt7687 * -1339871957) * f);
				int i_18_ = ((int) (f * (float) (class575.anInt7689 * -375858305)) + i_14_);
				int i_19_ = (int) (f * (float) (-1859048369 * class575.anInt7688));
				int i_20_ = (int) (f * (float) (1653204735 * class575.anInt7690));
				if (i_17_ < 1568728259 * Class57.anInt746 && i_18_ < Class322.anInt3445 * -24538641) {
					if (i_19_ + i_17_ > Class57.anInt746 * 1568728259)
						i_19_ = Class57.anInt746 * 1568728259 - i_17_;
					if (i_20_ + i_18_ > Class322.anInt3445 * -24538641)
						i_20_ = -24538641 * Class322.anInt3445 - i_18_;
					for (int i_21_ = i_18_; i_21_ < i_18_ + i_20_; i_21_++) {
						int i_22_ = i_21_ * (1568728259 * Class57.anInt746) + i_17_;
						Arrays.fill(is, i_22_, i_22_ + i_19_, -16777216);
					}
				}
			}
		}
	}
}
