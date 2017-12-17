/* Class145_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class145_Sub1 extends Class145 {
	int[] anIntArray9520;
	int[] anIntArray9521;
	public static RSBuffer aClass523_Sub34_9522;
	static int anInt9523;

	Class145_Sub1(int i, int i_0_, int[] is, int[] is_1_) {
		anIntArray9521 = is;
		anIntArray9520 = is_1_;
	}

	static final void method14915(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		class250.modelType = -548064309;
		class250.anInt2571 = 1971539935 * client.anInt11154;
		class250.anInt2584 = 0;
		if (234012635 * class250.anInt2709 == -1 && !class242.aBool2456)
			Class328_Sub3_Sub1.method17886(-1363815505 * class250.interfaceHash, 1648921847);
	}

	static final void method14916(Class669 class669, byte i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		boolean bool = true;
		if (i_2_ < 0)
			bool = (1 + i_2_) % 4 == 0;
		else if (i_2_ < 1582)
			bool = i_2_ % 4 == 0;
		else if (i_2_ % 4 != 0)
			bool = false;
		else if (i_2_ % 100 != 0)
			bool = true;
		else if (i_2_ % 400 != 0)
			bool = false;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = bool ? 1 : 0;
	}
}
