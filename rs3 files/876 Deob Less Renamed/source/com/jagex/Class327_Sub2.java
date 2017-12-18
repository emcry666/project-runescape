/* Class327_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class327_Sub2 extends Class327 {
	Class429 aClass429_10092;
	static final int anInt10093 = 0;
	static final int anInt10094 = 5;
	static final int anInt10095 = 6;
	static final int anInt10096 = 3;
	static final int anInt10097 = 4;
	static final int anInt10098 = 1;
	Class429 aClass429_10099;
	static final int anInt10100 = 7;
	static final int anInt10101 = 0;
	static final int anInt10102 = 1;
	static final int anInt10103 = 2;
	static final int anInt10104 = 3;
	Class270[] aClass270Array10105 = new Class270[3];
	Class265 aClass265_10106;
	int[] anIntArray10107;
	static final int anInt10108 = 2;
	int[][] anIntArrayArray10109 = new int[3][7];

	public void method5755() {
		aClass265_10106.method4852(aClass270Array10105[0]);
		aClass265_10106.method4750();
		anIntArray10107 = anIntArrayArray10109[aClass265_10106.method4796(-68182144)];
		method15634((byte) 47);
	}

	boolean method15633(int i) throws Exception_Sub3 {
		aClass265_10106 = aClass178_Sub2_3470.method15073("Sprite");
		Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_10106.method4783("WVPMatrix", 1155008991);
		Class523_Sub4_Sub1 class523_sub4_sub1_0_ = aClass265_10106.method4783("SpriteSampler", -739880708);
		Class523_Sub4_Sub1 class523_sub4_sub1_1_ = aClass265_10106.method4783("MaskSampler", 68608281);
		Class523_Sub4_Sub1 class523_sub4_sub1_2_ = aClass265_10106.method4783("MulColour", 120644782);
		Class523_Sub4_Sub1 class523_sub4_sub1_3_ = aClass265_10106.method4783("AddColour", 1371647722);
		Class523_Sub4_Sub1 class523_sub4_sub1_4_ = aClass265_10106.method4783("SpriteTexCoordMatrix", 98518964);
		Class523_Sub4_Sub1 class523_sub4_sub1_5_ = aClass265_10106.method4783("MaskTexCoordMatrix", 994546391);
		aClass270Array10105[0] = aClass265_10106.method4755("Normal", 760427037);
		aClass270Array10105[1] = aClass265_10106.method4755("Masked", 760427037);
		aClass270Array10105[2] = aClass265_10106.method4755("AlphaTex", 760427037);
		for (int i_6_ = 0; i_6_ < 3; i_6_++) {
			int i_7_ = aClass265_10106.method4758(aClass270Array10105[i_6_], -510449305);
			anIntArrayArray10109[i_6_][0] = class523_sub4_sub1.method18070(i_7_);
			anIntArrayArray10109[i_6_][1] = class523_sub4_sub1_0_.method18070(i_7_);
			anIntArrayArray10109[i_6_][2] = class523_sub4_sub1_1_.method18070(i_7_);
			anIntArrayArray10109[i_6_][5] = class523_sub4_sub1_2_.method18070(i_7_);
			anIntArrayArray10109[i_6_][6] = class523_sub4_sub1_3_.method18070(i_7_);
			anIntArrayArray10109[i_6_][3] = class523_sub4_sub1_4_.method18070(i_7_);
			anIntArrayArray10109[i_6_][4] = class523_sub4_sub1_5_.method18070(i_7_);
		}
		aClass265_10106.method4852(aClass270Array10105[0]);
		return true;
	}

	public void method5751(int i, int i_8_) {
		switch (i) {
		case 1:
			aClass429_10099.method6763(-1);
			aClass429_10092.method6763(0);
			break;
		case 4:
			aClass429_10099.method6763(-1);
			aClass429_10092.method6763(i_8_);
			aClass429_10092.method6765();
			break;
		case 2:
			aClass429_10099.method6763(i_8_);
			aClass429_10092.method6763(0);
			break;
		case 0:
			aClass429_10099.method6763(i_8_);
			aClass429_10092.method6763(0);
			break;
		case 3:
			aClass429_10099.method6763(0xffffff | i_8_ & ~0xffffff);
			aClass429_10092.method6763(i_8_ & 0xffffff);
			break;
		}
	}

	void method15634(byte i) {
		aClass265_10106.method4782(anIntArray10107[1], 0, anInterface37_3464, 1268142843);
		aClass178_Sub2_3470.method14970(aClass441_3466);
		aClass265_10106.method4847(anIntArray10107[0], aClass441_3466, -2024422089);
		aClass265_10106.method4877(anIntArray10107[3], aClass441_3467, (short) 2262);
		aClass265_10106.method4776(anIntArray10107[5], aClass429_10099.aFloat4847, aClass429_10099.aFloat4849, aClass429_10099.aFloat4848, aClass429_10099.aFloat4850, (byte) 50);
		aClass265_10106.method4776(anIntArray10107[6], aClass429_10092.aFloat4847, aClass429_10092.aFloat4849, aClass429_10092.aFloat4848, aClass429_10092.aFloat4850, (byte) -13);
		aClass178_Sub2_3470.method15033(0, anInterface36_3468);
		aClass178_Sub2_3470.method15032(aClass345_3471);
		aClass178_Sub2_3470.method15040(Class376.aClass376_3918, anInt3463, 2);
	}

	public void method5753() {
		aClass265_10106.method4852(aClass270Array10105[0]);
		aClass265_10106.method4750();
		anIntArray10107 = anIntArrayArray10109[aClass265_10106.method4796(1883572852)];
		method15634((byte) -18);
	}

	public void method5754() {
		aClass265_10106.method4852(aClass270Array10105[1]);
		aClass265_10106.method4750();
		anIntArray10107 = anIntArrayArray10109[aClass265_10106.method4796(440743145)];
		aClass265_10106.method4782(anIntArray10107[2], 1, anInterface37_3469, 1865147570);
		aClass265_10106.method4877(anIntArray10107[4], aClass441_3465, (short) -18301);
		method15634((byte) 15);
	}

	public void method5752(int i, int i_9_) {
		switch (i) {
		case 1:
			aClass429_10099.method6763(-1);
			aClass429_10092.method6763(0);
			break;
		case 4:
			aClass429_10099.method6763(-1);
			aClass429_10092.method6763(i_9_);
			aClass429_10092.method6765();
			break;
		case 2:
			aClass429_10099.method6763(i_9_);
			aClass429_10092.method6763(0);
			break;
		case 0:
			aClass429_10099.method6763(i_9_);
			aClass429_10092.method6763(0);
			break;
		case 3:
			aClass429_10099.method6763(0xffffff | i_9_ & ~0xffffff);
			aClass429_10092.method6763(i_9_ & 0xffffff);
			break;
		}
	}

	public void method5756(int i, int i_10_) {
		switch (i) {
		case 1:
			aClass429_10099.method6763(-1);
			aClass429_10092.method6763(0);
			break;
		case 4:
			aClass429_10099.method6763(-1);
			aClass429_10092.method6763(i_10_);
			aClass429_10092.method6765();
			break;
		case 2:
			aClass429_10099.method6763(i_10_);
			aClass429_10092.method6763(0);
			break;
		case 0:
			aClass429_10099.method6763(i_10_);
			aClass429_10092.method6763(0);
			break;
		case 3:
			aClass429_10099.method6763(0xffffff | i_10_ & ~0xffffff);
			aClass429_10092.method6763(i_10_ & 0xffffff);
			break;
		}
	}

	boolean method15635() throws Exception_Sub3 {
		aClass265_10106 = aClass178_Sub2_3470.method15073("Sprite");
		Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_10106.method4783("WVPMatrix", -894373731);
		Class523_Sub4_Sub1 class523_sub4_sub1_11_ = aClass265_10106.method4783("SpriteSampler", -1392996957);
		Class523_Sub4_Sub1 class523_sub4_sub1_12_ = aClass265_10106.method4783("MaskSampler", -1563671294);
		Class523_Sub4_Sub1 class523_sub4_sub1_13_ = aClass265_10106.method4783("MulColour", -265412556);
		Class523_Sub4_Sub1 class523_sub4_sub1_14_ = aClass265_10106.method4783("AddColour", -1646095220);
		Class523_Sub4_Sub1 class523_sub4_sub1_15_ = aClass265_10106.method4783("SpriteTexCoordMatrix", -1874922916);
		Class523_Sub4_Sub1 class523_sub4_sub1_16_ = aClass265_10106.method4783("MaskTexCoordMatrix", -200609335);
		aClass270Array10105[0] = aClass265_10106.method4755("Normal", 760427037);
		aClass270Array10105[1] = aClass265_10106.method4755("Masked", 760427037);
		aClass270Array10105[2] = aClass265_10106.method4755("AlphaTex", 760427037);
		for (int i = 0; i < 3; i++) {
			int i_17_ = aClass265_10106.method4758(aClass270Array10105[i], 1051117233);
			anIntArrayArray10109[i][0] = class523_sub4_sub1.method18070(i_17_);
			anIntArrayArray10109[i][1] = class523_sub4_sub1_11_.method18070(i_17_);
			anIntArrayArray10109[i][2] = class523_sub4_sub1_12_.method18070(i_17_);
			anIntArrayArray10109[i][5] = class523_sub4_sub1_13_.method18070(i_17_);
			anIntArrayArray10109[i][6] = class523_sub4_sub1_14_.method18070(i_17_);
			anIntArrayArray10109[i][3] = class523_sub4_sub1_15_.method18070(i_17_);
			anIntArrayArray10109[i][4] = class523_sub4_sub1_16_.method18070(i_17_);
		}
		aClass265_10106.method4852(aClass270Array10105[0]);
		return true;
	}

	public void method5757() {
		aClass265_10106.method4852(aClass270Array10105[1]);
		aClass265_10106.method4750();
		anIntArray10107 = anIntArrayArray10109[aClass265_10106.method4796(-957169795)];
		aClass265_10106.method4782(anIntArray10107[2], 1, anInterface37_3469, 1745006518);
		aClass265_10106.method4877(anIntArray10107[4], aClass441_3465, (short) -7074);
		method15634((byte) 19);
	}

	public Class327_Sub2(Class178_Sub2 class178_sub2) throws Exception_Sub3 {
		super(class178_sub2);
		aClass429_10099 = new Class429(1.0F, 1.0F, 1.0F, 1.0F);
		aClass429_10092 = new Class429(0.0F, 0.0F, 0.0F, 0.0F);
		method15633(2071453787);
	}

	public void method5758() {
		aClass265_10106.method4852(aClass270Array10105[1]);
		aClass265_10106.method4750();
		anIntArray10107 = anIntArrayArray10109[aClass265_10106.method4796(-56417987)];
		aClass265_10106.method4782(anIntArray10107[2], 1, anInterface37_3469, 388031249);
		aClass265_10106.method4877(anIntArray10107[4], aClass441_3465, (short) 10652);
		method15634((byte) 38);
	}

	void method15636() {
		aClass265_10106.method4782(anIntArray10107[1], 0, anInterface37_3464, 742353280);
		aClass178_Sub2_3470.method14970(aClass441_3466);
		aClass265_10106.method4847(anIntArray10107[0], aClass441_3466, -1449162539);
		aClass265_10106.method4877(anIntArray10107[3], aClass441_3467, (short) 22815);
		aClass265_10106.method4776(anIntArray10107[5], aClass429_10099.aFloat4847, aClass429_10099.aFloat4849, aClass429_10099.aFloat4848, aClass429_10099.aFloat4850, (byte) -51);
		aClass265_10106.method4776(anIntArray10107[6], aClass429_10092.aFloat4847, aClass429_10092.aFloat4849, aClass429_10092.aFloat4848, aClass429_10092.aFloat4850, (byte) -19);
		aClass178_Sub2_3470.method15033(0, anInterface36_3468);
		aClass178_Sub2_3470.method15032(aClass345_3471);
		aClass178_Sub2_3470.method15040(Class376.aClass376_3918, anInt3463, 2);
	}

	void method15637() {
		aClass265_10106.method4782(anIntArray10107[1], 0, anInterface37_3464, 1907521563);
		aClass178_Sub2_3470.method14970(aClass441_3466);
		aClass265_10106.method4847(anIntArray10107[0], aClass441_3466, -1490798980);
		aClass265_10106.method4877(anIntArray10107[3], aClass441_3467, (short) -12062);
		aClass265_10106.method4776(anIntArray10107[5], aClass429_10099.aFloat4847, aClass429_10099.aFloat4849, aClass429_10099.aFloat4848, aClass429_10099.aFloat4850, (byte) 4);
		aClass265_10106.method4776(anIntArray10107[6], aClass429_10092.aFloat4847, aClass429_10092.aFloat4849, aClass429_10092.aFloat4848, aClass429_10092.aFloat4850, (byte) -37);
		aClass178_Sub2_3470.method15033(0, anInterface36_3468);
		aClass178_Sub2_3470.method15032(aClass345_3471);
		aClass178_Sub2_3470.method15040(Class376.aClass376_3918, anInt3463, 2);
	}

	void method15638() {
		aClass265_10106.method4782(anIntArray10107[1], 0, anInterface37_3464, 1671646028);
		aClass178_Sub2_3470.method14970(aClass441_3466);
		aClass265_10106.method4847(anIntArray10107[0], aClass441_3466, -959780242);
		aClass265_10106.method4877(anIntArray10107[3], aClass441_3467, (short) 2400);
		aClass265_10106.method4776(anIntArray10107[5], aClass429_10099.aFloat4847, aClass429_10099.aFloat4849, aClass429_10099.aFloat4848, aClass429_10099.aFloat4850, (byte) -110);
		aClass265_10106.method4776(anIntArray10107[6], aClass429_10092.aFloat4847, aClass429_10092.aFloat4849, aClass429_10092.aFloat4848, aClass429_10092.aFloat4850, (byte) -67);
		aClass178_Sub2_3470.method15033(0, anInterface36_3468);
		aClass178_Sub2_3470.method15032(aClass345_3471);
		aClass178_Sub2_3470.method15040(Class376.aClass376_3918, anInt3463, 2);
	}

	static final void method15639(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub14_10598.method16863(461694335) ? 1 : 0;
	}

	static final void method15640(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -34844996;
		class250.anInt2592 = -713306927 * (class669.anIntArray8557[1357652815 * class669.anInt8558]);
		class250.anInt2593 = (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815] * 1954320025);
		class250.anInt2594 = (class669.anIntArray8557[1357652815 * class669.anInt8558 + 2] * -1353684269);
		class250.anInt2682 = (248882827 * class669.anIntArray8557[1357652815 * class669.anInt8558 + 3]);
		Class523_Sub14.method15991(class250, (byte) -93);
	}

	public static void method15641(Player class647_sub1_sub3_sub1_sub2, int i) {
		Class523_Sub3 class523_sub3 = ((Class523_Sub3) (Class523_Sub3.aClass14_10390.method741((long) (-1087669731 * class647_sub1_sub3_sub1_sub2.anInt11888))));
		if (class523_sub3 == null)
			Class451.method7292(class647_sub1_sub3_sub1_sub2.aByte10821, (class647_sub1_sub3_sub1_sub2.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub2.anIntArray11943[0]), 0, null, null, class647_sub1_sub3_sub1_sub2, 1439421852);
		else
			class523_sub3.method15904((short) 4096);
	}
}
