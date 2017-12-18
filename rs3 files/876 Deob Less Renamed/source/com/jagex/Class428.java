/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class428 implements Interface7 {
	Class472 aClass472_4845;
	String aString4846;

	public int method56(short i) {
		if (aClass472_4845.method7669(aString4846, (byte) 18))
			return 100;
		return 0;
	}

	Class428(Class472 class472, String string) {
		aClass472_4845 = class472;
		aString4846 = string;
	}

	public Class52 method53(int i) {
		return Class52.aClass52_716;
	}

	public int method55() {
		if (aClass472_4845.method7669(aString4846, (byte) 18))
			return 100;
		return 0;
	}

	public int method38() {
		if (aClass472_4845.method7669(aString4846, (byte) 18))
			return 100;
		return 0;
	}

	public Class52 method54() {
		return Class52.aClass52_716;
	}

	static void method6757(Class523_Sub34_Sub2 class523_sub34_sub2, int i, byte i_0_) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		boolean bool = class523_sub34_sub2.readBits(1, -1044981097) == 1;
		if (bool)
			Class108.anIntArray1312[(Class108.anInt1323 += -571886895) * -1962023375 - 1] = i;
		int i_1_ = class523_sub34_sub2.readBits(2, 1154336153);
		Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (i_1_ == 0) {
			if (!bool) {
				if (client.anInt11154 * 1109726117 == i)
					throw new RuntimeException();
				Class40 class40 = Class108.aClass40Array1322[i] = new Class40();
				Class666.method13653((byte) -78);
				class40.anInt556 = ((class647_sub1_sub3_sub1_sub2.aByte10821 << 28) + ((class647_sub1_sub3_sub1_sub2.anIntArray11885[0] + 235453015 * class592.localX) >> 6 << 14) + ((1704054549 * class592.localY + class647_sub1_sub3_sub1_sub2.anIntArray11943[0]) >> 6)) * 206368601;
				if (-1693078911 * class647_sub1_sub3_sub1_sub2.anInt12195 != -1)
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.anInt12195 * 318644571;
				else
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.aClass72_11938.method1494((byte) 50) * -1690253861;
				class40.anInt555 = 776661693 * class647_sub1_sub3_sub1_sub2.anInt11909;
				class40.aClass210_553 = class647_sub1_sub3_sub1_sub2.aClass210_12200;
				class40.aBool557 = class647_sub1_sub3_sub1_sub2.aBool12202;
				if (class647_sub1_sub3_sub1_sub2.anInt12197 * -2112595399 > 0)
					Class522_Sub6.method15875(class647_sub1_sub3_sub1_sub2, -1293091442);
				client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
				if (class523_sub34_sub2.readBits(1, -405456557) != 0)
					Class188.method3593(class523_sub34_sub2, i, -1129350300);
			}
		} else if (i_1_ == 1) {
			int i_2_ = class523_sub34_sub2.readBits(3, -27269349);
			int i_3_ = class523_sub34_sub2.readBits(1, 131246900);
			int i_4_ = class647_sub1_sub3_sub1_sub2.anIntArray11885[0];
			int i_5_ = class647_sub1_sub3_sub1_sub2.anIntArray11943[0];
			if (i_3_ == 1) {
				Class108.aByteArray1314[i] = Class666.aClass666_8532.aByte8529;
				int i_6_ = class523_sub34_sub2.readBits(2, -1725877576);
				switch (i_6_) {
				case 1:
					class647_sub1_sub3_sub1_sub2.method18665(i_4_ - 1, i_5_, (Class108.aByteArray1314[i]), (byte) -56);
					break;
				case 0:
					class647_sub1_sub3_sub1_sub2.method18665(i_4_, 1 + i_5_, (Class108.aByteArray1314[i]), (byte) -66);
					break;
				case 2:
					class647_sub1_sub3_sub1_sub2.method18665(1 + i_4_, i_5_, (Class108.aByteArray1314[i]), (byte) -89);
					break;
				case 3:
					class647_sub1_sub3_sub1_sub2.method18665(i_4_, i_5_ - 1, (Class108.aByteArray1314[i]), (byte) -33);
					break;
				}
			}
			if (i_2_ == 0) {
				i_4_--;
				i_5_--;
			} else if (i_2_ == 1)
				i_5_--;
			else if (i_2_ == 2) {
				i_4_++;
				i_5_--;
			} else if (i_2_ == 3)
				i_4_--;
			else if (i_2_ == 4)
				i_4_++;
			else if (5 == i_2_) {
				i_4_--;
				i_5_++;
			} else if (i_2_ == 6)
				i_5_++;
			else if (7 == i_2_) {
				i_4_++;
				i_5_++;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_4_, i_5_, (Class108.aByteArray1314[i]), (byte) -20);
		} else if (2 == i_1_) {
			int i_7_ = class523_sub34_sub2.readBits(4, 475612826);
			int i_8_ = class647_sub1_sub3_sub1_sub2.anIntArray11885[0];
			int i_9_ = class647_sub1_sub3_sub1_sub2.anIntArray11943[0];
			if (i_7_ == 0) {
				i_8_ -= 2;
				i_9_ -= 2;
			} else if (1 == i_7_) {
				i_8_--;
				i_9_ -= 2;
			} else if (i_7_ == 2)
				i_9_ -= 2;
			else if (3 == i_7_) {
				i_8_++;
				i_9_ -= 2;
			} else if (i_7_ == 4) {
				i_8_ += 2;
				i_9_ -= 2;
			} else if (5 == i_7_) {
				i_8_ -= 2;
				i_9_--;
			} else if (i_7_ == 6) {
				i_8_ += 2;
				i_9_--;
			} else if (7 == i_7_)
				i_8_ -= 2;
			else if (8 == i_7_)
				i_8_ += 2;
			else if (i_7_ == 9) {
				i_8_ -= 2;
				i_9_++;
			} else if (i_7_ == 10) {
				i_8_ += 2;
				i_9_++;
			} else if (11 == i_7_) {
				i_8_ -= 2;
				i_9_ += 2;
			} else if (i_7_ == 12) {
				i_8_--;
				i_9_ += 2;
			} else if (13 == i_7_)
				i_9_ += 2;
			else if (i_7_ == 14) {
				i_8_++;
				i_9_ += 2;
			} else if (15 == i_7_) {
				i_8_ += 2;
				i_9_ += 2;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_8_, i_9_, (Class108.aByteArray1314[i]), (byte) -16);
		} else {
			int i_10_ = class523_sub34_sub2.readBits(1, 1273140186);
			if (i_10_ == 0) {
				int i_11_ = class523_sub34_sub2.readBits(15, 992597520);
				int i_12_ = i_11_ >> 12 & 0x7;
				int i_13_ = (byte) (i_11_ >> 10) & 0x3;
				int i_14_ = i_11_ >> 5 & 0x1f;
				if (i_14_ > 15)
					i_14_ -= 32;
				int i_15_ = i_11_ & 0x1f;
				if (i_15_ > 15)
					i_15_ -= 32;
				int i_16_ = class647_sub1_sub3_sub1_sub2.anIntArray11885[0] + i_14_;
				int i_17_ = class647_sub1_sub3_sub1_sub2.anIntArray11943[0] + i_15_;
				if (i_12_ == Class666.aClass666_8535.anInt8534 * 1797154851)
					class647_sub1_sub3_sub1_sub2.method18666(i_16_, i_17_, (byte) 101);
				else {
					Class108.aByteArray1314[i] = (byte) (i_12_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_16_, i_17_, (Class108.aByteArray1314[i]), (byte) -124);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (class647_sub1_sub3_sub1_sub2.aByte10821 + i_13_ & 0x3);
				if (client.aClass505_11019.method8243(915132193).method7282(i_16_, i_17_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (client.anInt11154 * 1109726117 == i && (Class222.anInt2334 * -860310981 != class647_sub1_sub3_sub1_sub2.aByte10821))
					Class222.anInt2334 = class647_sub1_sub3_sub1_sub2.aByte10821 * 779966195;
			} else {
				int i_18_ = class523_sub34_sub2.readBits(3, -2119262619);
				int i_19_ = class523_sub34_sub2.readBits(30, -1776300510);
				int i_20_ = i_19_ >> 28 & 0x3;
				int i_21_ = i_19_ >> 14 & 0x3fff;
				int i_22_ = i_19_ & 0x3fff;
				int i_23_ = ((i_21_ + (235453015 * class592.localX + (class647_sub1_sub3_sub1_sub2.anIntArray11885[0])) & 0x3fff) - class592.localX * 235453015);
				int i_24_ = ((class592.localY * 1704054549 + class647_sub1_sub3_sub1_sub2.anIntArray11943[0] + i_22_) & 0x3fff) - 1704054549 * class592.localY;
				if (i_18_ == 1797154851 * Class666.aClass666_8535.anInt8534)
					class647_sub1_sub3_sub1_sub2.method18666(i_23_, i_24_, (byte) 60);
				else {
					Class108.aByteArray1314[i] = (byte) (i_18_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_23_, i_24_, (Class108.aByteArray1314[i]), (byte) -32);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (i_20_ + class647_sub1_sub3_sub1_sub2.aByte10821 & 0x3);
				if (client.aClass505_11019.method8243(195343163).method7282(i_23_, i_24_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (1109726117 * client.anInt11154 == i)
					Class222.anInt2334 = 779966195 * class647_sub1_sub3_sub1_sub2.aByte10821;
			}
		}
	}

	public static final void method6758(int i) {
		Class43.anInt601 = -953811567;
		Class43.anInt610 = 1308064294;
		Class43.anInt609 = 1392121894;
	}

	static final void method6759(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool11118 ? 1 : 0;
	}
}
