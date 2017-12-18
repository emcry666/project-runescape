/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class328 {
	Class298 aClass298_3472;
	public static Class472 aClass472_3473;

	public abstract Class437 method5759();

	public abstract void method5760(Class523_Sub34 class523_sub34, int i);

	public abstract boolean method5761(int i);

	Class328(Class298 class298) {
		aClass298_3472 = class298;
	}

	public abstract double[] method5762(int i);

	public abstract Class523_Sub29 method5763(byte i);

	public abstract float method5764(int i);

	public abstract void method5765(Class307 class307, int i, int i_0_, int i_1_);

	public abstract Class523_Sub29 method5766();

	public abstract Class437 method5767(int i);

	public abstract void method5768(Class523_Sub34 class523_sub34);

	public abstract double[] method5769();

	public abstract void method5770(Class307 class307, int i, int i_2_);

	public abstract Class437 method5771();

	public abstract void method5772(float f, int[][][] is, Class451 class451, int i, int i_3_);

	public abstract void method5773(float f, int[][][] is, Class451 class451, int i, int i_4_, int i_5_);

	public abstract double[] method5774();

	public abstract void method5775(float f, int[][][] is, Class451 class451, int i, int i_6_);

	public abstract double[] method5776();

	public abstract void method5777(Class307 class307, int i, int i_7_);

	public abstract void method5778(Class523_Sub34 class523_sub34);

	public abstract double[] method5779();

	public abstract Class437 method5780();

	public abstract void method5781(Class523_Sub34 class523_sub34);

	public abstract boolean method5782();

	public abstract float method5783();

	public abstract float method5784();

	public abstract float method5785();

	static int method5786(int i, int i_8_, int i_9_) {
		if (i_8_ == 9)
			i = 1 + i & 0x3;
		if (i_8_ == 10)
			i = 3 + i & 0x3;
		if (i_8_ == 11)
			i = i + 3 & 0x3;
		return i;
	}

	static final void method5787(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -52267494;
		class250.anInt2523 = (class669.anIntArray8557[1357652815 * class669.anInt8558] * -801693595);
		class250.anInt2501 = (1321330829 * class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]);
		class250.anInt2563 = (1518877477 * class669.anIntArray8557[2 + class669.anInt8558 * 1357652815]);
		class250.anInt2577 = (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3] * 1361016637);
		class250.anInt2578 = (class669.anIntArray8557[4 + class669.anInt8558 * 1357652815] * -1718268177);
		class250.anInt2544 = (class669.anIntArray8557[5 + class669.anInt8558 * 1357652815] * 249826099);
		Class523_Sub14.method15991(class250, (byte) -24);
		if (234012635 * class250.anInt2709 == -1 && !class242.aBool2456) {
			BodyDefinitions.method10331(class250.anInt2585 * -1363815505, 825227355);
			Class98.method1780(class250.anInt2585 * -1363815505, (byte) -110);
		}
	}

	static final void method5788(Class669 class669, byte i) {
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 87) != Class294.aClass294_3166)
			throw new RuntimeException();
		((Class688_Sub3) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 75)).method17103((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), 702525864);
	}

	static final void method5789(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), 243578608);
		Class535.method8921(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -77), false, (byte) -76);
		Class211.method3824(1563070418);
	}
}
