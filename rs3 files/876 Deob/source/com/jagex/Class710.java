/* Class710 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public final class Class710 {
	public static int[] anIntArray8839;
	public static boolean aBool8840 = true;

	public static Frame method14319(Class693 class693, int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ == 0) {
			Class695[] class695s = Class261.method4722(class693, 1467145643);
			if (class695s == null)
				return null;
			boolean bool = false;
			for (int i_3_ = 0; i_3_ < class695s.length; i_3_++) {
				if (class695s[i_3_].anInt8753 * 1074115321 == i && -88336395 * class695s[i_3_].anInt8754 == i_0_ && (i_2_ == 0 || i_2_ == class695s[i_3_].anInt8755 * -1474561333) && (!bool || 1643077973 * class695s[i_3_].anInt8752 > i_1_)) {
					i_1_ = 1643077973 * class695s[i_3_].anInt8752;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class693.method13976(frame, i, i_0_, i_1_, i_2_, -1425578617);
		return frame;
	}

	public static Frame method14320(Class693 class693, int i, int i_4_, int i_5_, int i_6_) {
		if (i_5_ == 0) {
			Class695[] class695s = Class261.method4722(class693, 1309923712);
			if (class695s == null)
				return null;
			boolean bool = false;
			for (int i_7_ = 0; i_7_ < class695s.length; i_7_++) {
				if (class695s[i_7_].anInt8753 * 1074115321 == i && -88336395 * class695s[i_7_].anInt8754 == i_4_ && (i_6_ == 0 || i_6_ == class695s[i_7_].anInt8755 * -1474561333) && (!bool || 1643077973 * class695s[i_7_].anInt8752 > i_5_)) {
					i_5_ = 1643077973 * class695s[i_7_].anInt8752;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class693.method13976(frame, i, i_4_, i_5_, i_6_, -1425578617);
		return frame;
	}

	public static Frame method14321(Class693 class693, int i, int i_8_, int i_9_, int i_10_) {
		if (i_9_ == 0) {
			Class695[] class695s = Class261.method4722(class693, 1835864767);
			if (class695s == null)
				return null;
			boolean bool = false;
			for (int i_11_ = 0; i_11_ < class695s.length; i_11_++) {
				if (class695s[i_11_].anInt8753 * 1074115321 == i && -88336395 * class695s[i_11_].anInt8754 == i_8_ && (i_10_ == 0 || i_10_ == class695s[i_11_].anInt8755 * -1474561333) && (!bool || 1643077973 * class695s[i_11_].anInt8752 > i_9_)) {
					i_9_ = 1643077973 * class695s[i_11_].anInt8752;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class693.method13976(frame, i, i_8_, i_9_, i_10_, -1425578617);
		return frame;
	}

	Class710() throws Throwable {
		throw new Error();
	}

	public static void method14322(Class693 class693, Frame frame) {
		class693.method13970(-1198904502);
		frame.setVisible(false);
		frame.dispose();
	}

	static final void method14323(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool10986 ? 1 : 0;
	}
}
