/* Class523_Sub27_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub1 extends Class523_Sub27 implements Interface13, Interface6 {
	public int anInt11324 = 0;
	public int[] anIntArray11325;
	public int[] anIntArray11326;
	public int anInt11327 = 0;
	static Class148 aClass148_11328;
	static String aString11329;

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1504360056);
			if (0 == i)
				break;
			method17714(class523_sub34, i, 1704054549);
		}
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-703641933);
			if (0 == i_0_)
				break;
			method17714(class523_sub34, i_0_, 1704054549);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1894012275);
			if (0 == i)
				break;
			method17714(class523_sub34, i, 1704054549);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method52(int i, byte i_1_) {
		/* empty */
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(685403393);
			if (0 == i)
				break;
			method17714(class523_sub34, i, 1704054549);
		}
	}

	void method17714(Class523_Sub34 class523_sub34, int i, int i_2_) {
		if (2 == i)
			anInt11327 = class523_sub34.readUnsignedShort(-1829562011) * -1285397541;
		else if (i == 4) {
			anInt11324 = class523_sub34.readUnsignedByte(38008865) * -692544395;
			anIntArray11325 = new int[anInt11324 * 2003522525];
			anIntArray11326 = new int[anInt11324 * 2003522525];
			for (int i_3_ = 0; i_3_ < 2003522525 * anInt11324; i_3_++) {
				anIntArray11325[i_3_] = class523_sub34.readUnsignedShort(-1219008869);
				anIntArray11326[i_3_] = class523_sub34.readUnsignedShort(-1083416898);
			}
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(376835283);
			if (0 == i)
				break;
			method17714(class523_sub34, i, 1704054549);
		}
	}

	public void method79() {
		/* empty */
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-269802458);
			if (0 == i)
				break;
			method17714(class523_sub34, i, 1704054549);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(969598746);
			if (0 == i)
				break;
			method17714(class523_sub34, i, 1704054549);
		}
	}

	public void method73() {
		/* empty */
	}

	Class523_Sub27_Sub1() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method78() {
		/* empty */
	}

	public void method51(int i) {
		/* empty */
	}

	static void method17715(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, byte i) {
		if (class647_sub1_sub3_sub1 instanceof Class647_Sub1_Sub3_Sub1_Sub1) {
			Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = (Class647_Sub1_Sub3_Sub1_Sub1) class647_sub1_sub3_sub1;
			if (null != class647_sub1_sub3_sub1_sub1.aClass300_12175)
				Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != (class647_sub1_sub3_sub1_sub1.aByte10821)), -1461332283);
		} else if (class647_sub1_sub3_sub1 instanceof Player) {
			Player class647_sub1_sub3_sub1_sub2 = (Player) class647_sub1_sub3_sub1;
			Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != class647_sub1_sub3_sub1_sub2.aByte10821), (short) -14179);
		}
	}
}
