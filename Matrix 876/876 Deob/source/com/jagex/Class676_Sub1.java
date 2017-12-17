/* Class676_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public class Class676_Sub1 extends Class676 {
	public Interface13 method50(int i, Interface12 interface12) {
		return new GraphicsDefinitions(i, this);
	}

	Class676_Sub1(Class472 class472) {
		super(class472);
	}

	public Class method49(int i) {
		return com.jagex.GraphicsDefinitions.class;
	}

	public Class method47() {
		return com.jagex.GraphicsDefinitions.class;
	}

	public Interface13 method48(int i, Interface12 interface12, int i_0_) {
		return new GraphicsDefinitions(i, this);
	}

	public static Frame method16779(Class693 class693, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i_2_ == 0) {
			Class695[] class695s = Class261.method4722(class693, 1933052462);
			if (class695s == null)
				return null;
			boolean bool = false;
			for (int i_5_ = 0; i_5_ < class695s.length; i_5_++) {
				if (class695s[i_5_].anInt8753 * 1074115321 == i && -88336395 * class695s[i_5_].anInt8754 == i_1_ && (i_3_ == 0 || i_3_ == class695s[i_5_].anInt8755 * -1474561333) && (!bool || 1643077973 * class695s[i_5_].anInt8752 > i_2_)) {
					i_2_ = 1643077973 * class695s[i_5_].anInt8752;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class693.method13976(frame, i, i_1_, i_2_, i_3_, -1425578617);
		return frame;
	}

	static void method16780(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, Class523_Sub27_Sub6 class523_sub27_sub6, Class164 class164, Class10 class10, int i_12_, int i_13_, int i_14_) {
		if (i > i_7_ && i < i_7_ + i_9_ && i_6_ > i_11_ - class10.anInt76 * -1669009881 - 1 && i_6_ < i_11_ + -853549931 * class10.anInt80 && class523_sub27_sub6.aBool11635)
			i_12_ = i_13_;
		int[] is = Class209.method3809(class523_sub27_sub6, 2037486288);
		String string = Class48.method1257(class523_sub27_sub6, 1007380612);
		if (null != is)
			string = new StringBuilder().append(string).append(Class163.method2593(is, 1761836153)).toString();
		class164.method2602(string, i_7_ + 3, i_11_, i_12_, 0, client.aRandom11099, Class330.anInt3500, Class62.aClass148Array772, null, -940910894);
		if (class523_sub27_sub6.aBool11636)
			Class707_Sub2.aClass148_10972.method2435(5 + i_7_ + class10.method626(string, Class62.aClass148Array772, -1942791872), i_11_ - class10.anInt76 * -1669009881);
	}

	static void method16781(int i) {
		for (int i_15_ = 0; i_15_ < 106; i_15_++)
			client.aBoolArray11246[i_15_] = true;
	}
}
