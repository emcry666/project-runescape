/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class2 {
	static final int anInt16 = 8;
	static final int anInt17 = 1;
	static final int anInt18 = 2;
	static final int anInt19 = 4;
	public int[] anIntArray20;
	public int[] anIntArray21 = new int[3];
	public int[] anIntArray22 = new int[3];
	public int[] anIntArray23 = new int[2];
	static final int anInt24 = 2;
	public short[] aShortArray25;
	public short[] aShortArray26;

	public static Class2 method508(ItemDefinitions class12, RSBuffer class523_sub34) {
		return Class625.method10220(class12, class523_sub34, 2, 490555274);
	}

	public static Class2 method509(ItemDefinitions class12, RSBuffer class523_sub34) {
		return Class625.method10220(class12, class523_sub34, 2, 850962607);
	}

	static Class2 method510(ItemDefinitions class12, RSBuffer class523_sub34, int i) {
		Class2 class2 = new Class2(class12);
		int i_0_ = class523_sub34.readUnsignedByte(354351118);
		boolean bool = (i_0_ & 0x1) != 0;
		boolean bool_1_ = 0 != (i_0_ & 0x2);
		boolean bool_2_ = (i_0_ & 0x4) != 0;
		boolean bool_3_ = 0 != (i_0_ & 0x8);
		if (bool) {
			if (i <= 1) {
				class2.anIntArray21[0] = class523_sub34.readUnsignedShort(-1492144845);
				class2.anIntArray22[0] = class523_sub34.readUnsignedShort(-2058416210);
			} else {
				class2.anIntArray21[0] = class523_sub34.readBigSmart((byte) -78);
				class2.anIntArray22[0] = class523_sub34.readBigSmart((byte) -53);
			}
			if (-1 != class12.anInt130 * -551995617 || -1 != class12.anInt132 * 565816295) {
				if (i <= 1) {
					class2.anIntArray21[1] = class523_sub34.readUnsignedShort(-877495793);
					class2.anIntArray22[1] = class523_sub34.readUnsignedShort(-1057545280);
				} else {
					class2.anIntArray21[1] = class523_sub34.readBigSmart((byte) -100);
					class2.anIntArray22[1] = class523_sub34.readBigSmart((byte) -101);
				}
			}
			if (-1 != 1732973397 * class12.anInt133 || class12.anInt134 * -2015837427 != -1) {
				if (i <= 1) {
					class2.anIntArray21[2] = class523_sub34.readUnsignedShort(-2123292789);
					class2.anIntArray22[2] = class523_sub34.readUnsignedShort(-1858383307);
				} else {
					class2.anIntArray21[2] = class523_sub34.readBigSmart((byte) -36);
					class2.anIntArray22[2] = class523_sub34.readBigSmart((byte) -61);
				}
			}
		}
		if (bool_1_) {
			if (i <= 1) {
				class2.anIntArray23[0] = class523_sub34.readUnsignedShort(-2095826871);
				class2.anIntArray20[0] = class523_sub34.readUnsignedShort(-426367596);
			} else {
				class2.anIntArray23[0] = class523_sub34.readBigSmart((byte) -88);
				class2.anIntArray20[0] = class523_sub34.readBigSmart((byte) -86);
			}
			if (-1 != 1731276927 * class12.anInt100 || -1 != -1123046437 * class12.anInt144) {
				if (i <= 1) {
					class2.anIntArray23[1] = class523_sub34.readUnsignedShort(-565283757);
					class2.anIntArray20[1] = class523_sub34.readUnsignedShort(-66863660);
				} else {
					class2.anIntArray23[1] = class523_sub34.readBigSmart((byte) -8);
					class2.anIntArray20[1] = class523_sub34.readBigSmart((byte) -75);
				}
			}
		}
		if (bool_2_) {
			int i_4_ = class523_sub34.readUnsignedShort(-19758543);
			int[] is = new int[4];
			is[0] = i_4_ & 0xf;
			is[1] = i_4_ >> 4 & 0xf;
			is[2] = i_4_ >> 8 & 0xf;
			is[3] = i_4_ >> 12 & 0xf;
			for (int i_5_ = 0; i_5_ < 4; i_5_++) {
				if (is[i_5_] != 15)
					class2.aShortArray25[is[i_5_]] = (short) class523_sub34.readUnsignedShort(-335305167);
			}
		}
		if (bool_3_) {
			int i_6_ = class523_sub34.readUnsignedByte(799859044);
			int[] is = new int[2];
			is[0] = i_6_ & 0xf;
			is[1] = i_6_ >> 4 & 0xf;
			for (int i_7_ = 0; i_7_ < 2; i_7_++) {
				if (is[i_7_] != 15)
					class2.aShortArray26[is[i_7_]] = (short) class523_sub34.readUnsignedShort(-711778570);
			}
		}
		return class2;
	}

	Class2(ItemDefinitions class12) {
		anIntArray20 = new int[2];
		anIntArray21[0] = class12.anInt125 * -1000812189;
		anIntArray21[1] = class12.anInt130 * -551995617;
		anIntArray21[2] = class12.anInt133 * 1732973397;
		anIntArray22[0] = -432386905 * class12.anInt131;
		anIntArray22[1] = class12.anInt132 * 565816295;
		anIntArray22[2] = -2015837427 * class12.anInt134;
		anIntArray23[0] = -1781791225 * class12.anInt141;
		anIntArray23[1] = 1731276927 * class12.anInt100;
		anIntArray20[0] = -478576253 * class12.anInt143;
		anIntArray20[1] = -1123046437 * class12.anInt144;
		if (class12.modifiedModelColors != null) {
			aShortArray25 = new short[class12.modifiedModelColors.length];
			System.arraycopy(class12.modifiedModelColors, 0, aShortArray25, 0, aShortArray25.length);
		}
		if (class12.modifiedTextureColors != null) {
			aShortArray26 = new short[class12.modifiedTextureColors.length];
			System.arraycopy(class12.modifiedTextureColors, 0, aShortArray26, 0, aShortArray26.length);
		}
	}

	static Class2 method511(ItemDefinitions class12, RSBuffer class523_sub34, int i) {
		Class2 class2 = new Class2(class12);
		int i_8_ = class523_sub34.readUnsignedByte(586055891);
		boolean bool = (i_8_ & 0x1) != 0;
		boolean bool_9_ = 0 != (i_8_ & 0x2);
		boolean bool_10_ = (i_8_ & 0x4) != 0;
		boolean bool_11_ = 0 != (i_8_ & 0x8);
		if (bool) {
			if (i <= 1) {
				class2.anIntArray21[0] = class523_sub34.readUnsignedShort(-1162540767);
				class2.anIntArray22[0] = class523_sub34.readUnsignedShort(-816297091);
			} else {
				class2.anIntArray21[0] = class523_sub34.readBigSmart((byte) -91);
				class2.anIntArray22[0] = class523_sub34.readBigSmart((byte) -26);
			}
			if (-1 != class12.anInt130 * -551995617 || -1 != class12.anInt132 * 565816295) {
				if (i <= 1) {
					class2.anIntArray21[1] = class523_sub34.readUnsignedShort(-1664641923);
					class2.anIntArray22[1] = class523_sub34.readUnsignedShort(-639907325);
				} else {
					class2.anIntArray21[1] = class523_sub34.readBigSmart((byte) -111);
					class2.anIntArray22[1] = class523_sub34.readBigSmart((byte) -12);
				}
			}
			if (-1 != 1732973397 * class12.anInt133 || class12.anInt134 * -2015837427 != -1) {
				if (i <= 1) {
					class2.anIntArray21[2] = class523_sub34.readUnsignedShort(-774217239);
					class2.anIntArray22[2] = class523_sub34.readUnsignedShort(-685551343);
				} else {
					class2.anIntArray21[2] = class523_sub34.readBigSmart((byte) -26);
					class2.anIntArray22[2] = class523_sub34.readBigSmart((byte) -105);
				}
			}
		}
		if (bool_9_) {
			if (i <= 1) {
				class2.anIntArray23[0] = class523_sub34.readUnsignedShort(-1729272839);
				class2.anIntArray20[0] = class523_sub34.readUnsignedShort(-1762064521);
			} else {
				class2.anIntArray23[0] = class523_sub34.readBigSmart((byte) -1);
				class2.anIntArray20[0] = class523_sub34.readBigSmart((byte) -53);
			}
			if (-1 != 1731276927 * class12.anInt100 || -1 != -1123046437 * class12.anInt144) {
				if (i <= 1) {
					class2.anIntArray23[1] = class523_sub34.readUnsignedShort(-698854790);
					class2.anIntArray20[1] = class523_sub34.readUnsignedShort(-1207725289);
				} else {
					class2.anIntArray23[1] = class523_sub34.readBigSmart((byte) -53);
					class2.anIntArray20[1] = class523_sub34.readBigSmart((byte) -88);
				}
			}
		}
		if (bool_10_) {
			int i_12_ = class523_sub34.readUnsignedShort(-331351050);
			int[] is = new int[4];
			is[0] = i_12_ & 0xf;
			is[1] = i_12_ >> 4 & 0xf;
			is[2] = i_12_ >> 8 & 0xf;
			is[3] = i_12_ >> 12 & 0xf;
			for (int i_13_ = 0; i_13_ < 4; i_13_++) {
				if (is[i_13_] != 15)
					class2.aShortArray25[is[i_13_]] = (short) class523_sub34.readUnsignedShort(-1623359616);
			}
		}
		if (bool_11_) {
			int i_14_ = class523_sub34.readUnsignedByte(-235655499);
			int[] is = new int[2];
			is[0] = i_14_ & 0xf;
			is[1] = i_14_ >> 4 & 0xf;
			for (int i_15_ = 0; i_15_ < 2; i_15_++) {
				if (is[i_15_] != 15)
					class2.aShortArray26[is[i_15_]] = (short) class523_sub34.readUnsignedShort(-176277599);
			}
		}
		return class2;
	}

	public static Class2 method512(ItemDefinitions class12, RSBuffer class523_sub34) {
		return Class625.method10220(class12, class523_sub34, 2, 930536781);
	}

	public static void method513(Class178 class178, int i) {
		Class34.aClass164_318 = ((Class164) Class491.aClass423_5536.method6689(client.anInterface50_11044, (Class34.anInt315 * -1386279717), true, true, -2088493518));
		Class681.aClass10_8649 = Class491.aClass423_5536.method6688(client.anInterface50_11044, (Class34.anInt315 * -1386279717), (byte) -84);
		Class10.aClass164_83 = ((Class164) Class491.aClass423_5536.method6689(client.anInterface50_11044, (Class34.anInt314 * -672958487), true, true, -1934173632));
		Class46.aClass10_672 = Class491.aClass423_5536.method6688(client.anInterface50_11044, -672958487 * Class34.anInt314, (byte) -60);
		Class34.aClass164_319 = ((Class164) Class491.aClass423_5536.method6689(client.anInterface50_11044, (Class61.anInt767 * -2091202475), true, true, -2091426616));
		Class655.aClass10_8421 = Class491.aClass423_5536.method6688(client.anInterface50_11044, (Class61.anInt767 * -2091202475), (byte) -74);
	}

	static Class384 method514(RSBuffer class523_sub34, int i) {
		Class380 class380 = (Class228.method4175(-1486945039)[class523_sub34.readUnsignedByte(850621615)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(1749998594)]);
		int i_16_ = class523_sub34.readShort(439960125);
		int i_17_ = class523_sub34.readShort(102166401);
		int i_18_ = class523_sub34.readUnsignedShort(-1353733037);
		int i_19_ = class523_sub34.readUnsignedShort(-122435798);
		int i_20_ = class523_sub34.readShort(804566737);
		int i_21_ = class523_sub34.readBigSmart((byte) -20);
		int i_22_ = class523_sub34.readUnsignedInt((byte) -109);
		return new Class384(class380, class389, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_);
	}

	static final void method515(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub4_10625, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1 ? 2 : 0, -693803705);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1794812829);
		client.aBool11012 = false;
	}

	public static final void method516(int i) {
		if (!client.aBool11108) {
			client.aFloat11177 += (24.0F - client.aFloat11177) / 2.0F;
			client.aBool11111 = true;
			client.aBool11108 = true;
		}
	}

	static final void method517(Class669 class669, int i) {
		int i_23_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		RSStream class116 = Class537.method8941(-1545959011);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4287, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_23_, -1301689602);
		class116.method1974(class523_sub22, (byte) 103);
	}
}
