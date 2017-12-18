/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class108 {
	static int[] anIntArray1312;
	static final int anInt1313 = 1;
	static byte[] aByteArray1314;
	static int anInt1315;
	static RSBuffer[] aClass523_Sub34Array1316;
	static RSBuffer[] aClass523_Sub34Array1317;
	public static int anInt1318;
	static int[] anIntArray1319;
	static final int anInt1320 = 2;
	static int[] anIntArray1321;
	static Class40[] aClass40Array1322;
	static int anInt1323;
	static byte[] aByteArray1324;
	static boolean $assertionsDisabled = !com.jagex.Class108.class.desiredAssertionStatus();

	static int method1885(RSBitBuffer class523_sub34_sub2) {
		int i = class523_sub34_sub2.readBits(2, -490604595);
		int i_0_;
		if (0 == i)
			i_0_ = 0;
		else if (i == 1)
			i_0_ = class523_sub34_sub2.readBits(5, 1242021822);
		else if (2 == i)
			i_0_ = class523_sub34_sub2.readBits(8, -190303940);
		else
			i_0_ = class523_sub34_sub2.readBits(11, 2055660740);
		return i_0_;
	}

	static final void method1886(RSBitBuffer class523_sub34_sub2, int i) {
		anInt1323 = 0;
		Class540.decodeUpdate(class523_sub34_sub2, (byte) 16);
		Class687_Sub14.decodeMasks(class523_sub34_sub2, (byte) 9);
		if (class523_sub34_sub2.offset * 2349011 != i)
			throw new RuntimeException(new StringBuilder().append(2349011 * class523_sub34_sub2.offset).append(" ").append(i).toString());
	}

	static {
		aByteArray1324 = new byte[2048];
		aByteArray1314 = new byte[2048];
		aClass523_Sub34Array1316 = new RSBuffer[2048];
		aClass523_Sub34Array1317 = new RSBuffer[2048];
		anInt1318 = 0;
		anIntArray1319 = new int[2048];
		anInt1315 = 0;
		anIntArray1321 = new int[2048];
		aClass40Array1322 = new Class40[2048];
		anInt1323 = 0;
		anIntArray1312 = new int[2048];
	}

	static final void method1887(RSBitBuffer class523_sub34_sub2) {
		class523_sub34_sub2.method18223(-1283165651);
		int i = client.anInt11154 * 1109726117;
		Player class647_sub1_sub3_sub1_sub2 = (Class241.player = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = (new Player(client.aClass505_11019.method8241((byte) -79))));
		class647_sub1_sub3_sub1_sub2.anInt11888 = i * -1926162379;
		int i_1_ = class523_sub34_sub2.readBits(30, 1447806660);
		byte i_2_ = (byte) (i_1_ >> 28);
		int i_3_ = i_1_ >> 14 & 0x3fff;
		int i_4_ = i_1_ & 0x3fff;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		class647_sub1_sub3_sub1_sub2.screenX[0] = i_3_ - class592.localX * 235453015;
		class647_sub1_sub3_sub1_sub2.screenY[0] = i_4_ - class592.localY * 1704054549;
		class647_sub1_sub3_sub1_sub2.method10574((float) ((class647_sub1_sub3_sub1_sub2.screenX[0] << 9) + (class647_sub1_sub3_sub1_sub2.method18338(2141714388) << 8)), (class647_sub1_sub3_sub1_sub2.method10601().aClass437_4862.aFloat4904), (float) ((class647_sub1_sub3_sub1_sub2.screenY[0] << 9) + (class647_sub1_sub3_sub1_sub2.method18338(2142334026) << 8)));
		Class222.anInt2334 = (class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = i_2_) * 779966195;
		if (client.aClass505_11019.method8243(-316394238).method7282(class647_sub1_sub3_sub1_sub2.screenX[0], class647_sub1_sub3_sub1_sub2.screenY[0], -638715901))
			class647_sub1_sub3_sub1_sub2.aByte10818++;
		if (null != aClass523_Sub34Array1316[i])
			class647_sub1_sub3_sub1_sub2.decodeAppearance(aClass523_Sub34Array1316[i], 772795992);
		if (null != aClass523_Sub34Array1317[i])
			class647_sub1_sub3_sub1_sub2.decodeHeadIcons(aClass523_Sub34Array1317[i], -654999937);
		anInt1318 = 0;
		anIntArray1319[(anInt1318 += 633815497) * 393652345 - 1] = i;
		aByteArray1324[i] = (byte) 0;
		anInt1315 = 0;
		for (int i_5_ = 1; i_5_ < 2048; i_5_++) {
			if (i_5_ != i) {
				int i_6_ = class523_sub34_sub2.readBits(18, -664278346);
				int i_7_ = i_6_ >> 16 & 0x3;
				int i_8_ = i_6_ >> 8 & 0xff;
				int i_9_ = i_6_ & 0xff;
				Class40 class40 = aClass40Array1322[i_5_] = new Class40();
				class40.anInt556 = (i_9_ + ((i_7_ << 28) + (i_8_ << 14))) * 206368601;
				class40.anInt554 = 0;
				class40.anInt555 = -1332641739;
				class40.aClass210_553 = Class210.aClass210_2258;
				class40.aBool557 = false;
				anIntArray1321[(anInt1315 += -1210837665) * 1212778143 - 1] = i_5_;
				aByteArray1324[i_5_] = (byte) 0;
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		Class291 class291 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100);
		if (Class291.aClass291_3148 == class291) {
			Class328_Sub2 class328_sub2 = (Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1327818124);
			class328_sub2.method15596(-763691161);
		}
		Class294 class294 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 87);
		if (class294 == Class294.aClass294_3164) {
			Class688_Sub2 class688_sub2 = (Class688_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 101);
			class688_sub2.method17078((byte) 124);
		}
	}

	Class108() throws Throwable {
		throw new Error();
	}

	static boolean method1888(RSBitBuffer class523_sub34_sub2, int i) {
		int i_10_ = class523_sub34_sub2.readBits(2, 2031365339);
		if (0 == i_10_) {
			if (class523_sub34_sub2.readBits(1, 1400565709) != 0)
				Class188.method3593(class523_sub34_sub2, i, -1129350300);
			int i_11_ = class523_sub34_sub2.readBits(6, -174634188);
			int i_12_ = class523_sub34_sub2.readBits(6, 1729611468);
			boolean bool = class523_sub34_sub2.readBits(1, -760474149) == 1;
			if (bool)
				anIntArray1312[(anInt1323 += -571886895) * -1962023375 - 1] = i;
			if (null != client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i])
				throw new RuntimeException();
			Class40 class40 = aClass40Array1322[i];
			Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = (new Player(client.aClass505_11019.method8241((byte) -40))));
			class647_sub1_sub3_sub1_sub2.anInt11888 = i * -1926162379;
			if (aClass523_Sub34Array1316[i] != null)
				class647_sub1_sub3_sub1_sub2.decodeAppearance(aClass523_Sub34Array1316[i], 1933019502);
			if (null != aClass523_Sub34Array1317[i])
				class647_sub1_sub3_sub1_sub2.decodeHeadIcons(aClass523_Sub34Array1317[i], -654999937);
			class647_sub1_sub3_sub1_sub2.method18332(class40.anInt554 * 1780461139, true, 1958307138);
			class647_sub1_sub3_sub1_sub2.faceEntityId = class40.anInt555 * 352379029;
			int i_13_ = 1223583977 * class40.anInt556;
			int i_14_ = i_13_ >> 28;
			int i_15_ = i_13_ >> 14 & 0xff;
			int i_16_ = i_13_ & 0xff;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_17_ = i_11_ + (i_15_ << 6) - class592.localX * 235453015;
			int i_18_ = i_12_ + (i_16_ << 6) - 1704054549 * class592.localY;
			class647_sub1_sub3_sub1_sub2.aClass210_12200 = class40.aClass210_553;
			class647_sub1_sub3_sub1_sub2.isInAClan = class40.aBool557;
			class647_sub1_sub3_sub1_sub2.aByteArray11944[0] = aByteArray1314[i];
			class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) i_14_;
			if (client.aClass505_11019.method8243(-726516339).method7282(i_17_, i_18_, -638715901))
				class647_sub1_sub3_sub1_sub2.aByte10818++;
			class647_sub1_sub3_sub1_sub2.method18666(i_17_, i_18_, (byte) 49);
			aClass40Array1322[i] = null;
			return true;
		}
		if (1 == i_10_) {
			int i_19_ = class523_sub34_sub2.readBits(2, 1826635296);
			int i_20_ = 1223583977 * aClass40Array1322[i].anInt556;
			aClass40Array1322[i].anInt556 = 206368601 * ((i_20_ & 0xfffffff) + ((i_19_ + (i_20_ >> 28) & 0x3) << 28));
			return false;
		}
		if (2 == i_10_) {
			int i_21_ = class523_sub34_sub2.readBits(5, -1774924846);
			int i_22_ = i_21_ >> 3 & 0x3;
			int i_23_ = i_21_ & 0x7;
			int i_24_ = 1223583977 * aClass40Array1322[i].anInt556;
			if (!$assertionsDisabled && (aByteArray1314[i] < 0 || aByteArray1314[i] > 3))
				throw new AssertionError();
			int i_25_ = i_22_ + (i_24_ >> 28) & 0x3;
			int i_26_ = i_24_ >> 14 & 0xff;
			int i_27_ = i_24_ & 0xff;
			if (i_23_ == 0) {
				i_26_--;
				i_27_--;
			}
			if (1 == i_23_)
				i_27_--;
			if (i_23_ == 2) {
				i_26_++;
				i_27_--;
			}
			if (3 == i_23_)
				i_26_--;
			if (4 == i_23_)
				i_26_++;
			if (5 == i_23_) {
				i_26_--;
				i_27_++;
			}
			if (6 == i_23_)
				i_27_++;
			if (7 == i_23_) {
				i_26_++;
				i_27_++;
			}
			Class334.method5910(Class666.method13653((byte) 15), aByteArray1314[i], -1475651136);
			aClass40Array1322[i].anInt556 = 206368601 * (i_27_ + ((i_26_ << 14) + (i_25_ << 28)));
			return false;
		}
		int i_28_ = class523_sub34_sub2.readBits(20, -1555813676);
		int i_29_ = i_28_ >> 18 & 0x3;
		int i_30_ = i_28_ >> 16 & 0x3;
		int i_31_ = i_28_ >> 8 & 0xff;
		int i_32_ = i_28_ & 0xff;
		int i_33_ = aClass40Array1322[i].anInt556 * 1223583977;
		aByteArray1314[i] = (byte) (i_29_ - 1);
		if (!$assertionsDisabled && (aByteArray1314[i] < 0 || aByteArray1314[i] > 3))
			throw new AssertionError();
		int i_34_ = (i_33_ >> 28) + i_30_ & 0x3;
		int i_35_ = (i_33_ >> 14) + i_31_ & 0xff;
		int i_36_ = i_33_ + i_32_ & 0xff;
		Class334.method5910(Class666.method13653((byte) -55), i_29_ - 1, 753212151);
		aClass40Array1322[i].anInt556 = ((i_34_ << 28) + (i_35_ << 14) + i_36_) * 206368601;
		return false;
	}

	static final void method1889(RSBitBuffer class523_sub34_sub2) {
		class523_sub34_sub2.method18223(130283740);
		int i = client.anInt11154 * 1109726117;
		Player class647_sub1_sub3_sub1_sub2 = (Class241.player = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = (new Player(client.aClass505_11019.method8241((byte) -51))));
		class647_sub1_sub3_sub1_sub2.anInt11888 = i * -1926162379;
		int i_37_ = class523_sub34_sub2.readBits(30, -89362600);
		byte i_38_ = (byte) (i_37_ >> 28);
		int i_39_ = i_37_ >> 14 & 0x3fff;
		int i_40_ = i_37_ & 0x3fff;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		class647_sub1_sub3_sub1_sub2.screenX[0] = i_39_ - class592.localX * 235453015;
		class647_sub1_sub3_sub1_sub2.screenY[0] = i_40_ - class592.localY * 1704054549;
		class647_sub1_sub3_sub1_sub2.method10574((float) ((class647_sub1_sub3_sub1_sub2.screenX[0] << 9) + (class647_sub1_sub3_sub1_sub2.method18338(2147017881) << 8)), (class647_sub1_sub3_sub1_sub2.method10601().aClass437_4862.aFloat4904), (float) ((class647_sub1_sub3_sub1_sub2.screenY[0] << 9) + (class647_sub1_sub3_sub1_sub2.method18338(2145987386) << 8)));
		Class222.anInt2334 = (class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = i_38_) * 779966195;
		if (client.aClass505_11019.method8243(-1926064550).method7282(class647_sub1_sub3_sub1_sub2.screenX[0], class647_sub1_sub3_sub1_sub2.screenY[0], -638715901))
			class647_sub1_sub3_sub1_sub2.aByte10818++;
		if (null != aClass523_Sub34Array1316[i])
			class647_sub1_sub3_sub1_sub2.decodeAppearance(aClass523_Sub34Array1316[i], 523444557);
		if (null != aClass523_Sub34Array1317[i])
			class647_sub1_sub3_sub1_sub2.decodeHeadIcons(aClass523_Sub34Array1317[i], -654999937);
		anInt1318 = 0;
		anIntArray1319[(anInt1318 += 633815497) * 393652345 - 1] = i;
		aByteArray1324[i] = (byte) 0;
		anInt1315 = 0;
		for (int i_41_ = 1; i_41_ < 2048; i_41_++) {
			if (i_41_ != i) {
				int i_42_ = class523_sub34_sub2.readBits(18, 1598117883);
				int i_43_ = i_42_ >> 16 & 0x3;
				int i_44_ = i_42_ >> 8 & 0xff;
				int i_45_ = i_42_ & 0xff;
				Class40 class40 = aClass40Array1322[i_41_] = new Class40();
				class40.anInt556 = (i_45_ + ((i_43_ << 28) + (i_44_ << 14))) * 206368601;
				class40.anInt554 = 0;
				class40.anInt555 = -1332641739;
				class40.aClass210_553 = Class210.aClass210_2258;
				class40.aBool557 = false;
				anIntArray1321[(anInt1315 += -1210837665) * 1212778143 - 1] = i_41_;
				aByteArray1324[i_41_] = (byte) 0;
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		Class291 class291 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100);
		if (Class291.aClass291_3148 == class291) {
			Class328_Sub2 class328_sub2 = (Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1544858311);
			class328_sub2.method15596(-224000127);
		}
		Class294 class294 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 94);
		if (class294 == Class294.aClass294_3164) {
			Class688_Sub2 class688_sub2 = (Class688_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 14);
			class688_sub2.method17078((byte) 107);
		}
	}

	static int method1890(RSBitBuffer class523_sub34_sub2) {
		int i = class523_sub34_sub2.readBits(2, 290521888);
		int i_46_;
		if (0 == i)
			i_46_ = 0;
		else if (i == 1)
			i_46_ = class523_sub34_sub2.readBits(5, 1744895685);
		else if (2 == i)
			i_46_ = class523_sub34_sub2.readBits(8, -1873605093);
		else
			i_46_ = class523_sub34_sub2.readBits(11, -217951776);
		return i_46_;
	}

	static final void method1891(RSBitBuffer class523_sub34_sub2, int i) {
		anInt1323 = 0;
		Class540.decodeUpdate(class523_sub34_sub2, (byte) 24);
		Class687_Sub14.decodeMasks(class523_sub34_sub2, (byte) -14);
		if (class523_sub34_sub2.offset * 2349011 != i)
			throw new RuntimeException(new StringBuilder().append(2349011 * class523_sub34_sub2.offset).append(" ").append(i).toString());
	}

	static void method1892(RSBitBuffer class523_sub34_sub2, int i) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		boolean bool = class523_sub34_sub2.readBits(1, -1908002664) == 1;
		if (bool)
			anIntArray1312[(anInt1323 += -571886895) * -1962023375 - 1] = i;
		int i_47_ = class523_sub34_sub2.readBits(2, 572020680);
		Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (i_47_ == 0) {
			if (!bool) {
				if (client.anInt11154 * 1109726117 == i)
					throw new RuntimeException();
				Class40 class40 = aClass40Array1322[i] = new Class40();
				Class666.method13653((byte) -51);
				class40.anInt556 = ((class647_sub1_sub3_sub1_sub2.aByte10821 << 28) + ((class647_sub1_sub3_sub1_sub2.screenX[0] + 235453015 * class592.localX) >> 6 << 14) + ((1704054549 * class592.localY + class647_sub1_sub3_sub1_sub2.screenY[0]) >> 6)) * 206368601;
				if (-1693078911 * class647_sub1_sub3_sub1_sub2.direction != -1)
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.direction * 318644571;
				else
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.aClass72_11938.method1494((byte) 125) * -1690253861;
				class40.anInt555 = 776661693 * class647_sub1_sub3_sub1_sub2.faceEntityId;
				class40.aClass210_553 = class647_sub1_sub3_sub1_sub2.aClass210_12200;
				class40.aBool557 = class647_sub1_sub3_sub1_sub2.isInAClan;
				if (class647_sub1_sub3_sub1_sub2.anInt12197 * -2112595399 > 0)
					Class522_Sub6.method15875(class647_sub1_sub3_sub1_sub2, -633508516);
				client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
				if (class523_sub34_sub2.readBits(1, 1941813899) != 0)
					Class188.method3593(class523_sub34_sub2, i, -1129350300);
			}
		} else if (i_47_ == 1) {
			int i_48_ = class523_sub34_sub2.readBits(3, 590069106);
			int i_49_ = class523_sub34_sub2.readBits(1, 1304365577);
			int i_50_ = class647_sub1_sub3_sub1_sub2.screenX[0];
			int i_51_ = class647_sub1_sub3_sub1_sub2.screenY[0];
			if (i_49_ == 1) {
				aByteArray1314[i] = Class666.aClass666_8532.aByte8529;
				int i_52_ = class523_sub34_sub2.readBits(2, 703559090);
				switch (i_52_) {
				case 1:
					class647_sub1_sub3_sub1_sub2.method18665(i_50_ - 1, i_51_, aByteArray1314[i], (byte) -15);
					break;
				case 0:
					class647_sub1_sub3_sub1_sub2.method18665(i_50_, 1 + i_51_, aByteArray1314[i], (byte) -32);
					break;
				case 2:
					class647_sub1_sub3_sub1_sub2.method18665(1 + i_50_, i_51_, aByteArray1314[i], (byte) -106);
					break;
				case 3:
					class647_sub1_sub3_sub1_sub2.method18665(i_50_, i_51_ - 1, aByteArray1314[i], (byte) -53);
					break;
				}
			}
			if (i_48_ == 0) {
				i_50_--;
				i_51_--;
			} else if (i_48_ == 1)
				i_51_--;
			else if (i_48_ == 2) {
				i_50_++;
				i_51_--;
			} else if (i_48_ == 3)
				i_50_--;
			else if (i_48_ == 4)
				i_50_++;
			else if (5 == i_48_) {
				i_50_--;
				i_51_++;
			} else if (i_48_ == 6)
				i_51_++;
			else if (7 == i_48_) {
				i_50_++;
				i_51_++;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_50_, i_51_, aByteArray1314[i], (byte) -55);
		} else if (2 == i_47_) {
			int i_53_ = class523_sub34_sub2.readBits(4, -456262717);
			int i_54_ = class647_sub1_sub3_sub1_sub2.screenX[0];
			int i_55_ = class647_sub1_sub3_sub1_sub2.screenY[0];
			if (i_53_ == 0) {
				i_54_ -= 2;
				i_55_ -= 2;
			} else if (1 == i_53_) {
				i_54_--;
				i_55_ -= 2;
			} else if (i_53_ == 2)
				i_55_ -= 2;
			else if (3 == i_53_) {
				i_54_++;
				i_55_ -= 2;
			} else if (i_53_ == 4) {
				i_54_ += 2;
				i_55_ -= 2;
			} else if (5 == i_53_) {
				i_54_ -= 2;
				i_55_--;
			} else if (i_53_ == 6) {
				i_54_ += 2;
				i_55_--;
			} else if (7 == i_53_)
				i_54_ -= 2;
			else if (8 == i_53_)
				i_54_ += 2;
			else if (i_53_ == 9) {
				i_54_ -= 2;
				i_55_++;
			} else if (i_53_ == 10) {
				i_54_ += 2;
				i_55_++;
			} else if (11 == i_53_) {
				i_54_ -= 2;
				i_55_ += 2;
			} else if (i_53_ == 12) {
				i_54_--;
				i_55_ += 2;
			} else if (13 == i_53_)
				i_55_ += 2;
			else if (i_53_ == 14) {
				i_54_++;
				i_55_ += 2;
			} else if (15 == i_53_) {
				i_54_ += 2;
				i_55_ += 2;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_54_, i_55_, aByteArray1314[i], (byte) -105);
		} else {
			int i_56_ = class523_sub34_sub2.readBits(1, -1348080338);
			if (i_56_ == 0) {
				int i_57_ = class523_sub34_sub2.readBits(15, -2019191641);
				int i_58_ = i_57_ >> 12 & 0x7;
				int i_59_ = (byte) (i_57_ >> 10) & 0x3;
				int i_60_ = i_57_ >> 5 & 0x1f;
				if (i_60_ > 15)
					i_60_ -= 32;
				int i_61_ = i_57_ & 0x1f;
				if (i_61_ > 15)
					i_61_ -= 32;
				int i_62_ = class647_sub1_sub3_sub1_sub2.screenX[0] + i_60_;
				int i_63_ = class647_sub1_sub3_sub1_sub2.screenY[0] + i_61_;
				if (i_58_ == Class666.aClass666_8535.anInt8534 * 1797154851)
					class647_sub1_sub3_sub1_sub2.method18666(i_62_, i_63_, (byte) 22);
				else {
					aByteArray1314[i] = (byte) (i_58_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_62_, i_63_, aByteArray1314[i], (byte) -85);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (class647_sub1_sub3_sub1_sub2.aByte10821 + i_59_ & 0x3);
				if (client.aClass505_11019.method8243(1669063858).method7282(i_62_, i_63_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (client.anInt11154 * 1109726117 == i && (Class222.anInt2334 * -860310981 != class647_sub1_sub3_sub1_sub2.aByte10821))
					Class222.anInt2334 = class647_sub1_sub3_sub1_sub2.aByte10821 * 779966195;
			} else {
				int i_64_ = class523_sub34_sub2.readBits(3, 1554215824);
				int i_65_ = class523_sub34_sub2.readBits(30, 739584175);
				int i_66_ = i_65_ >> 28 & 0x3;
				int i_67_ = i_65_ >> 14 & 0x3fff;
				int i_68_ = i_65_ & 0x3fff;
				int i_69_ = ((i_67_ + (235453015 * class592.localX + (class647_sub1_sub3_sub1_sub2.screenX[0])) & 0x3fff) - class592.localX * 235453015);
				int i_70_ = ((class592.localY * 1704054549 + class647_sub1_sub3_sub1_sub2.screenY[0] + i_68_) & 0x3fff) - 1704054549 * class592.localY;
				if (i_64_ == 1797154851 * Class666.aClass666_8535.anInt8534)
					class647_sub1_sub3_sub1_sub2.method18666(i_69_, i_70_, (byte) 61);
				else {
					aByteArray1314[i] = (byte) (i_64_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_69_, i_70_, aByteArray1314[i], (byte) -23);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (i_66_ + class647_sub1_sub3_sub1_sub2.aByte10821 & 0x3);
				if (client.aClass505_11019.method8243(1871822878).method7282(i_69_, i_70_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (1109726117 * client.anInt11154 == i)
					Class222.anInt2334 = 779966195 * class647_sub1_sub3_sub1_sub2.aByte10821;
			}
		}
	}

	static void method1893(RSBitBuffer class523_sub34_sub2, int i) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		boolean bool = class523_sub34_sub2.readBits(1, -192461096) == 1;
		if (bool)
			anIntArray1312[(anInt1323 += -571886895) * -1962023375 - 1] = i;
		int i_71_ = class523_sub34_sub2.readBits(2, 181870259);
		Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (i_71_ == 0) {
			if (!bool) {
				if (client.anInt11154 * 1109726117 == i)
					throw new RuntimeException();
				Class40 class40 = aClass40Array1322[i] = new Class40();
				Class666.method13653((byte) -22);
				class40.anInt556 = ((class647_sub1_sub3_sub1_sub2.aByte10821 << 28) + ((class647_sub1_sub3_sub1_sub2.screenX[0] + 235453015 * class592.localX) >> 6 << 14) + ((1704054549 * class592.localY + class647_sub1_sub3_sub1_sub2.screenY[0]) >> 6)) * 206368601;
				if (-1693078911 * class647_sub1_sub3_sub1_sub2.direction != -1)
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.direction * 318644571;
				else
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.aClass72_11938.method1494((byte) 34) * -1690253861;
				class40.anInt555 = 776661693 * class647_sub1_sub3_sub1_sub2.faceEntityId;
				class40.aClass210_553 = class647_sub1_sub3_sub1_sub2.aClass210_12200;
				class40.aBool557 = class647_sub1_sub3_sub1_sub2.isInAClan;
				if (class647_sub1_sub3_sub1_sub2.anInt12197 * -2112595399 > 0)
					Class522_Sub6.method15875(class647_sub1_sub3_sub1_sub2, 748510369);
				client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
				if (class523_sub34_sub2.readBits(1, 1391985578) != 0)
					Class188.method3593(class523_sub34_sub2, i, -1129350300);
			}
		} else if (i_71_ == 1) {
			int i_72_ = class523_sub34_sub2.readBits(3, 54403384);
			int i_73_ = class523_sub34_sub2.readBits(1, -1617638753);
			int i_74_ = class647_sub1_sub3_sub1_sub2.screenX[0];
			int i_75_ = class647_sub1_sub3_sub1_sub2.screenY[0];
			if (i_73_ == 1) {
				aByteArray1314[i] = Class666.aClass666_8532.aByte8529;
				int i_76_ = class523_sub34_sub2.readBits(2, -1835889601);
				switch (i_76_) {
				case 1:
					class647_sub1_sub3_sub1_sub2.method18665(i_74_ - 1, i_75_, aByteArray1314[i], (byte) -106);
					break;
				case 0:
					class647_sub1_sub3_sub1_sub2.method18665(i_74_, 1 + i_75_, aByteArray1314[i], (byte) -114);
					break;
				case 2:
					class647_sub1_sub3_sub1_sub2.method18665(1 + i_74_, i_75_, aByteArray1314[i], (byte) -118);
					break;
				case 3:
					class647_sub1_sub3_sub1_sub2.method18665(i_74_, i_75_ - 1, aByteArray1314[i], (byte) -10);
					break;
				}
			}
			if (i_72_ == 0) {
				i_74_--;
				i_75_--;
			} else if (i_72_ == 1)
				i_75_--;
			else if (i_72_ == 2) {
				i_74_++;
				i_75_--;
			} else if (i_72_ == 3)
				i_74_--;
			else if (i_72_ == 4)
				i_74_++;
			else if (5 == i_72_) {
				i_74_--;
				i_75_++;
			} else if (i_72_ == 6)
				i_75_++;
			else if (7 == i_72_) {
				i_74_++;
				i_75_++;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_74_, i_75_, aByteArray1314[i], (byte) -65);
		} else if (2 == i_71_) {
			int i_77_ = class523_sub34_sub2.readBits(4, -678335850);
			int i_78_ = class647_sub1_sub3_sub1_sub2.screenX[0];
			int i_79_ = class647_sub1_sub3_sub1_sub2.screenY[0];
			if (i_77_ == 0) {
				i_78_ -= 2;
				i_79_ -= 2;
			} else if (1 == i_77_) {
				i_78_--;
				i_79_ -= 2;
			} else if (i_77_ == 2)
				i_79_ -= 2;
			else if (3 == i_77_) {
				i_78_++;
				i_79_ -= 2;
			} else if (i_77_ == 4) {
				i_78_ += 2;
				i_79_ -= 2;
			} else if (5 == i_77_) {
				i_78_ -= 2;
				i_79_--;
			} else if (i_77_ == 6) {
				i_78_ += 2;
				i_79_--;
			} else if (7 == i_77_)
				i_78_ -= 2;
			else if (8 == i_77_)
				i_78_ += 2;
			else if (i_77_ == 9) {
				i_78_ -= 2;
				i_79_++;
			} else if (i_77_ == 10) {
				i_78_ += 2;
				i_79_++;
			} else if (11 == i_77_) {
				i_78_ -= 2;
				i_79_ += 2;
			} else if (i_77_ == 12) {
				i_78_--;
				i_79_ += 2;
			} else if (13 == i_77_)
				i_79_ += 2;
			else if (i_77_ == 14) {
				i_78_++;
				i_79_ += 2;
			} else if (15 == i_77_) {
				i_78_ += 2;
				i_79_ += 2;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_78_, i_79_, aByteArray1314[i], (byte) -2);
		} else {
			int i_80_ = class523_sub34_sub2.readBits(1, 2093410329);
			if (i_80_ == 0) {
				int i_81_ = class523_sub34_sub2.readBits(15, 1518919681);
				int i_82_ = i_81_ >> 12 & 0x7;
				int i_83_ = (byte) (i_81_ >> 10) & 0x3;
				int i_84_ = i_81_ >> 5 & 0x1f;
				if (i_84_ > 15)
					i_84_ -= 32;
				int i_85_ = i_81_ & 0x1f;
				if (i_85_ > 15)
					i_85_ -= 32;
				int i_86_ = class647_sub1_sub3_sub1_sub2.screenX[0] + i_84_;
				int i_87_ = class647_sub1_sub3_sub1_sub2.screenY[0] + i_85_;
				if (i_82_ == Class666.aClass666_8535.anInt8534 * 1797154851)
					class647_sub1_sub3_sub1_sub2.method18666(i_86_, i_87_, (byte) 61);
				else {
					aByteArray1314[i] = (byte) (i_82_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_86_, i_87_, aByteArray1314[i], (byte) -77);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (class647_sub1_sub3_sub1_sub2.aByte10821 + i_83_ & 0x3);
				if (client.aClass505_11019.method8243(1815456259).method7282(i_86_, i_87_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (client.anInt11154 * 1109726117 == i && (Class222.anInt2334 * -860310981 != class647_sub1_sub3_sub1_sub2.aByte10821))
					Class222.anInt2334 = class647_sub1_sub3_sub1_sub2.aByte10821 * 779966195;
			} else {
				int i_88_ = class523_sub34_sub2.readBits(3, -976797393);
				int i_89_ = class523_sub34_sub2.readBits(30, 1937144122);
				int i_90_ = i_89_ >> 28 & 0x3;
				int i_91_ = i_89_ >> 14 & 0x3fff;
				int i_92_ = i_89_ & 0x3fff;
				int i_93_ = ((i_91_ + (235453015 * class592.localX + (class647_sub1_sub3_sub1_sub2.screenX[0])) & 0x3fff) - class592.localX * 235453015);
				int i_94_ = ((class592.localY * 1704054549 + class647_sub1_sub3_sub1_sub2.screenY[0] + i_92_) & 0x3fff) - 1704054549 * class592.localY;
				if (i_88_ == 1797154851 * Class666.aClass666_8535.anInt8534)
					class647_sub1_sub3_sub1_sub2.method18666(i_93_, i_94_, (byte) 67);
				else {
					aByteArray1314[i] = (byte) (i_88_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_93_, i_94_, aByteArray1314[i], (byte) -97);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (i_90_ + class647_sub1_sub3_sub1_sub2.aByte10821 & 0x3);
				if (client.aClass505_11019.method8243(489793515).method7282(i_93_, i_94_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (1109726117 * client.anInt11154 == i)
					Class222.anInt2334 = 779966195 * class647_sub1_sub3_sub1_sub2.aByte10821;
			}
		}
	}

	static final void method1894(RSBitBuffer class523_sub34_sub2) {
		for (int i = 0; i < anInt1323 * -1962023375; i++) {
			class523_sub34_sub2.readUnsignedShort(-1486295313);
			int i_95_ = anIntArray1312[i];
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_95_];
			int i_96_ = class523_sub34_sub2.readUnsignedByte(1507008216);
			if ((i_96_ & 0x80) != 0)
				i_96_ += class523_sub34_sub2.readUnsignedByte(-1749848886) << 8;
			if ((i_96_ & 0x800) != 0)
				i_96_ += class523_sub34_sub2.readUnsignedByte(-691976898) << 16;
			Class232.decodeMask(class523_sub34_sub2, i_95_, class647_sub1_sub3_sub1_sub2, i_96_, (byte) 12);
		}
	}

	static boolean method1895(RSBitBuffer class523_sub34_sub2, int i) {
		int i_97_ = class523_sub34_sub2.readBits(2, -952087997);
		if (0 == i_97_) {
			if (class523_sub34_sub2.readBits(1, 1997407338) != 0)
				Class188.method3593(class523_sub34_sub2, i, -1129350300);
			int i_98_ = class523_sub34_sub2.readBits(6, -1438473638);
			int i_99_ = class523_sub34_sub2.readBits(6, 1517451048);
			boolean bool = class523_sub34_sub2.readBits(1, 808401933) == 1;
			if (bool)
				anIntArray1312[(anInt1323 += -571886895) * -1962023375 - 1] = i;
			if (null != client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i])
				throw new RuntimeException();
			Class40 class40 = aClass40Array1322[i];
			Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = (new Player(client.aClass505_11019.method8241((byte) -122))));
			class647_sub1_sub3_sub1_sub2.anInt11888 = i * -1926162379;
			if (aClass523_Sub34Array1316[i] != null)
				class647_sub1_sub3_sub1_sub2.decodeAppearance(aClass523_Sub34Array1316[i], 1907183218);
			if (null != aClass523_Sub34Array1317[i])
				class647_sub1_sub3_sub1_sub2.decodeHeadIcons(aClass523_Sub34Array1317[i], -654999937);
			class647_sub1_sub3_sub1_sub2.method18332(class40.anInt554 * 1780461139, true, 1958307138);
			class647_sub1_sub3_sub1_sub2.faceEntityId = class40.anInt555 * 352379029;
			int i_100_ = 1223583977 * class40.anInt556;
			int i_101_ = i_100_ >> 28;
			int i_102_ = i_100_ >> 14 & 0xff;
			int i_103_ = i_100_ & 0xff;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_104_ = i_98_ + (i_102_ << 6) - class592.localX * 235453015;
			int i_105_ = i_99_ + (i_103_ << 6) - 1704054549 * class592.localY;
			class647_sub1_sub3_sub1_sub2.aClass210_12200 = class40.aClass210_553;
			class647_sub1_sub3_sub1_sub2.isInAClan = class40.aBool557;
			class647_sub1_sub3_sub1_sub2.aByteArray11944[0] = aByteArray1314[i];
			class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) i_101_;
			if (client.aClass505_11019.method8243(633685372).method7282(i_104_, i_105_, -638715901))
				class647_sub1_sub3_sub1_sub2.aByte10818++;
			class647_sub1_sub3_sub1_sub2.method18666(i_104_, i_105_, (byte) 91);
			aClass40Array1322[i] = null;
			return true;
		}
		if (1 == i_97_) {
			int i_106_ = class523_sub34_sub2.readBits(2, 707054442);
			int i_107_ = 1223583977 * aClass40Array1322[i].anInt556;
			aClass40Array1322[i].anInt556 = 206368601 * ((i_107_ & 0xfffffff) + ((i_106_ + (i_107_ >> 28) & 0x3) << 28));
			return false;
		}
		if (2 == i_97_) {
			int i_108_ = class523_sub34_sub2.readBits(5, 903894512);
			int i_109_ = i_108_ >> 3 & 0x3;
			int i_110_ = i_108_ & 0x7;
			int i_111_ = 1223583977 * aClass40Array1322[i].anInt556;
			if (!$assertionsDisabled && (aByteArray1314[i] < 0 || aByteArray1314[i] > 3))
				throw new AssertionError();
			int i_112_ = i_109_ + (i_111_ >> 28) & 0x3;
			int i_113_ = i_111_ >> 14 & 0xff;
			int i_114_ = i_111_ & 0xff;
			if (i_110_ == 0) {
				i_113_--;
				i_114_--;
			}
			if (1 == i_110_)
				i_114_--;
			if (i_110_ == 2) {
				i_113_++;
				i_114_--;
			}
			if (3 == i_110_)
				i_113_--;
			if (4 == i_110_)
				i_113_++;
			if (5 == i_110_) {
				i_113_--;
				i_114_++;
			}
			if (6 == i_110_)
				i_114_++;
			if (7 == i_110_) {
				i_113_++;
				i_114_++;
			}
			Class334.method5910(Class666.method13653((byte) 43), aByteArray1314[i], -1043052698);
			aClass40Array1322[i].anInt556 = 206368601 * (i_114_ + ((i_113_ << 14) + (i_112_ << 28)));
			return false;
		}
		int i_115_ = class523_sub34_sub2.readBits(20, 1741189614);
		int i_116_ = i_115_ >> 18 & 0x3;
		int i_117_ = i_115_ >> 16 & 0x3;
		int i_118_ = i_115_ >> 8 & 0xff;
		int i_119_ = i_115_ & 0xff;
		int i_120_ = aClass40Array1322[i].anInt556 * 1223583977;
		aByteArray1314[i] = (byte) (i_116_ - 1);
		if (!$assertionsDisabled && (aByteArray1314[i] < 0 || aByteArray1314[i] > 3))
			throw new AssertionError();
		int i_121_ = (i_120_ >> 28) + i_117_ & 0x3;
		int i_122_ = (i_120_ >> 14) + i_118_ & 0xff;
		int i_123_ = i_120_ + i_119_ & 0xff;
		Class334.method5910(Class666.method13653((byte) -35), i_116_ - 1, 416296407);
		aClass40Array1322[i].anInt556 = ((i_121_ << 28) + (i_122_ << 14) + i_123_) * 206368601;
		return false;
	}

	static void method1896(RSBitBuffer class523_sub34_sub2, int i) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		boolean bool = class523_sub34_sub2.readBits(1, 512579511) == 1;
		if (bool)
			anIntArray1312[(anInt1323 += -571886895) * -1962023375 - 1] = i;
		int i_124_ = class523_sub34_sub2.readBits(2, -1533446630);
		Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i];
		if (i_124_ == 0) {
			if (!bool) {
				if (client.anInt11154 * 1109726117 == i)
					throw new RuntimeException();
				Class40 class40 = aClass40Array1322[i] = new Class40();
				Class666.method13653((byte) -27);
				class40.anInt556 = ((class647_sub1_sub3_sub1_sub2.aByte10821 << 28) + ((class647_sub1_sub3_sub1_sub2.screenX[0] + 235453015 * class592.localX) >> 6 << 14) + ((1704054549 * class592.localY + class647_sub1_sub3_sub1_sub2.screenY[0]) >> 6)) * 206368601;
				if (-1693078911 * class647_sub1_sub3_sub1_sub2.direction != -1)
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.direction * 318644571;
				else
					class40.anInt554 = class647_sub1_sub3_sub1_sub2.aClass72_11938.method1494((byte) 75) * -1690253861;
				class40.anInt555 = 776661693 * class647_sub1_sub3_sub1_sub2.faceEntityId;
				class40.aClass210_553 = class647_sub1_sub3_sub1_sub2.aClass210_12200;
				class40.aBool557 = class647_sub1_sub3_sub1_sub2.isInAClan;
				if (class647_sub1_sub3_sub1_sub2.anInt12197 * -2112595399 > 0)
					Class522_Sub6.method15875(class647_sub1_sub3_sub1_sub2, -1767586126);
				client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
				if (class523_sub34_sub2.readBits(1, -1166371919) != 0)
					Class188.method3593(class523_sub34_sub2, i, -1129350300);
			}
		} else if (i_124_ == 1) {
			int i_125_ = class523_sub34_sub2.readBits(3, 727550269);
			int i_126_ = class523_sub34_sub2.readBits(1, 665694793);
			int i_127_ = class647_sub1_sub3_sub1_sub2.screenX[0];
			int i_128_ = class647_sub1_sub3_sub1_sub2.screenY[0];
			if (i_126_ == 1) {
				aByteArray1314[i] = Class666.aClass666_8532.aByte8529;
				int i_129_ = class523_sub34_sub2.readBits(2, 890482073);
				switch (i_129_) {
				case 1:
					class647_sub1_sub3_sub1_sub2.method18665(i_127_ - 1, i_128_, aByteArray1314[i], (byte) -111);
					break;
				case 0:
					class647_sub1_sub3_sub1_sub2.method18665(i_127_, 1 + i_128_, aByteArray1314[i], (byte) -10);
					break;
				case 2:
					class647_sub1_sub3_sub1_sub2.method18665(1 + i_127_, i_128_, aByteArray1314[i], (byte) -88);
					break;
				case 3:
					class647_sub1_sub3_sub1_sub2.method18665(i_127_, i_128_ - 1, aByteArray1314[i], (byte) -38);
					break;
				}
			}
			if (i_125_ == 0) {
				i_127_--;
				i_128_--;
			} else if (i_125_ == 1)
				i_128_--;
			else if (i_125_ == 2) {
				i_127_++;
				i_128_--;
			} else if (i_125_ == 3)
				i_127_--;
			else if (i_125_ == 4)
				i_127_++;
			else if (5 == i_125_) {
				i_127_--;
				i_128_++;
			} else if (i_125_ == 6)
				i_128_++;
			else if (7 == i_125_) {
				i_127_++;
				i_128_++;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_127_, i_128_, aByteArray1314[i], (byte) -79);
		} else if (2 == i_124_) {
			int i_130_ = class523_sub34_sub2.readBits(4, 2024211353);
			int i_131_ = class647_sub1_sub3_sub1_sub2.screenX[0];
			int i_132_ = class647_sub1_sub3_sub1_sub2.screenY[0];
			if (i_130_ == 0) {
				i_131_ -= 2;
				i_132_ -= 2;
			} else if (1 == i_130_) {
				i_131_--;
				i_132_ -= 2;
			} else if (i_130_ == 2)
				i_132_ -= 2;
			else if (3 == i_130_) {
				i_131_++;
				i_132_ -= 2;
			} else if (i_130_ == 4) {
				i_131_ += 2;
				i_132_ -= 2;
			} else if (5 == i_130_) {
				i_131_ -= 2;
				i_132_--;
			} else if (i_130_ == 6) {
				i_131_ += 2;
				i_132_--;
			} else if (7 == i_130_)
				i_131_ -= 2;
			else if (8 == i_130_)
				i_131_ += 2;
			else if (i_130_ == 9) {
				i_131_ -= 2;
				i_132_++;
			} else if (i_130_ == 10) {
				i_131_ += 2;
				i_132_++;
			} else if (11 == i_130_) {
				i_131_ -= 2;
				i_132_ += 2;
			} else if (i_130_ == 12) {
				i_131_--;
				i_132_ += 2;
			} else if (13 == i_130_)
				i_132_ += 2;
			else if (i_130_ == 14) {
				i_131_++;
				i_132_ += 2;
			} else if (15 == i_130_) {
				i_131_ += 2;
				i_132_ += 2;
			}
			class647_sub1_sub3_sub1_sub2.method18665(i_131_, i_132_, aByteArray1314[i], (byte) -51);
		} else {
			int i_133_ = class523_sub34_sub2.readBits(1, -931420705);
			if (i_133_ == 0) {
				int i_134_ = class523_sub34_sub2.readBits(15, -1881784356);
				int i_135_ = i_134_ >> 12 & 0x7;
				int i_136_ = (byte) (i_134_ >> 10) & 0x3;
				int i_137_ = i_134_ >> 5 & 0x1f;
				if (i_137_ > 15)
					i_137_ -= 32;
				int i_138_ = i_134_ & 0x1f;
				if (i_138_ > 15)
					i_138_ -= 32;
				int i_139_ = class647_sub1_sub3_sub1_sub2.screenX[0] + i_137_;
				int i_140_ = class647_sub1_sub3_sub1_sub2.screenY[0] + i_138_;
				if (i_135_ == Class666.aClass666_8535.anInt8534 * 1797154851)
					class647_sub1_sub3_sub1_sub2.method18666(i_139_, i_140_, (byte) 86);
				else {
					aByteArray1314[i] = (byte) (i_135_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_139_, i_140_, aByteArray1314[i], (byte) -113);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (class647_sub1_sub3_sub1_sub2.aByte10821 + i_136_ & 0x3);
				if (client.aClass505_11019.method8243(-613603862).method7282(i_139_, i_140_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (client.anInt11154 * 1109726117 == i && (Class222.anInt2334 * -860310981 != class647_sub1_sub3_sub1_sub2.aByte10821))
					Class222.anInt2334 = class647_sub1_sub3_sub1_sub2.aByte10821 * 779966195;
			} else {
				int i_141_ = class523_sub34_sub2.readBits(3, -1585947157);
				int i_142_ = class523_sub34_sub2.readBits(30, 261276869);
				int i_143_ = i_142_ >> 28 & 0x3;
				int i_144_ = i_142_ >> 14 & 0x3fff;
				int i_145_ = i_142_ & 0x3fff;
				int i_146_ = ((i_144_ + (235453015 * class592.localX + (class647_sub1_sub3_sub1_sub2.screenX[0])) & 0x3fff) - class592.localX * 235453015);
				int i_147_ = (((class592.localY * 1704054549 + class647_sub1_sub3_sub1_sub2.screenY[0] + i_145_) & 0x3fff) - 1704054549 * class592.localY);
				if (i_141_ == 1797154851 * Class666.aClass666_8535.anInt8534)
					class647_sub1_sub3_sub1_sub2.method18666(i_146_, i_147_, (byte) 54);
				else {
					aByteArray1314[i] = (byte) (i_141_ - 1);
					class647_sub1_sub3_sub1_sub2.method18665(i_146_, i_147_, aByteArray1314[i], (byte) -10);
				}
				class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) (i_143_ + class647_sub1_sub3_sub1_sub2.aByte10821 & 0x3);
				if (client.aClass505_11019.method8243(774490329).method7282(i_146_, i_147_, -638715901))
					class647_sub1_sub3_sub1_sub2.aByte10818++;
				if (1109726117 * client.anInt11154 == i)
					Class222.anInt2334 = 779966195 * class647_sub1_sub3_sub1_sub2.aByte10821;
			}
		}
	}

	static boolean method1897(RSBitBuffer class523_sub34_sub2, int i) {
		int i_148_ = class523_sub34_sub2.readBits(2, -903564798);
		if (0 == i_148_) {
			if (class523_sub34_sub2.readBits(1, -1941109459) != 0)
				Class188.method3593(class523_sub34_sub2, i, -1129350300);
			int i_149_ = class523_sub34_sub2.readBits(6, 1267285893);
			int i_150_ = class523_sub34_sub2.readBits(6, 239538078);
			boolean bool = class523_sub34_sub2.readBits(1, 411144639) == 1;
			if (bool)
				anIntArray1312[(anInt1323 += -571886895) * -1962023375 - 1] = i;
			if (null != client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i])
				throw new RuntimeException();
			Class40 class40 = aClass40Array1322[i];
			Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = (new Player(client.aClass505_11019.method8241((byte) -128))));
			class647_sub1_sub3_sub1_sub2.anInt11888 = i * -1926162379;
			if (aClass523_Sub34Array1316[i] != null)
				class647_sub1_sub3_sub1_sub2.decodeAppearance(aClass523_Sub34Array1316[i], 2062071131);
			if (null != aClass523_Sub34Array1317[i])
				class647_sub1_sub3_sub1_sub2.decodeHeadIcons(aClass523_Sub34Array1317[i], -654999937);
			class647_sub1_sub3_sub1_sub2.method18332(class40.anInt554 * 1780461139, true, 1958307138);
			class647_sub1_sub3_sub1_sub2.faceEntityId = class40.anInt555 * 352379029;
			int i_151_ = 1223583977 * class40.anInt556;
			int i_152_ = i_151_ >> 28;
			int i_153_ = i_151_ >> 14 & 0xff;
			int i_154_ = i_151_ & 0xff;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_155_ = i_149_ + (i_153_ << 6) - class592.localX * 235453015;
			int i_156_ = i_150_ + (i_154_ << 6) - 1704054549 * class592.localY;
			class647_sub1_sub3_sub1_sub2.aClass210_12200 = class40.aClass210_553;
			class647_sub1_sub3_sub1_sub2.isInAClan = class40.aBool557;
			class647_sub1_sub3_sub1_sub2.aByteArray11944[0] = aByteArray1314[i];
			class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) i_152_;
			if (client.aClass505_11019.method8243(1015537711).method7282(i_155_, i_156_, -638715901))
				class647_sub1_sub3_sub1_sub2.aByte10818++;
			class647_sub1_sub3_sub1_sub2.method18666(i_155_, i_156_, (byte) 108);
			aClass40Array1322[i] = null;
			return true;
		}
		if (1 == i_148_) {
			int i_157_ = class523_sub34_sub2.readBits(2, 86828817);
			int i_158_ = 1223583977 * aClass40Array1322[i].anInt556;
			aClass40Array1322[i].anInt556 = 206368601 * ((i_158_ & 0xfffffff) + ((i_157_ + (i_158_ >> 28) & 0x3) << 28));
			return false;
		}
		if (2 == i_148_) {
			int i_159_ = class523_sub34_sub2.readBits(5, 1643049948);
			int i_160_ = i_159_ >> 3 & 0x3;
			int i_161_ = i_159_ & 0x7;
			int i_162_ = 1223583977 * aClass40Array1322[i].anInt556;
			if (!$assertionsDisabled && (aByteArray1314[i] < 0 || aByteArray1314[i] > 3))
				throw new AssertionError();
			int i_163_ = i_160_ + (i_162_ >> 28) & 0x3;
			int i_164_ = i_162_ >> 14 & 0xff;
			int i_165_ = i_162_ & 0xff;
			if (i_161_ == 0) {
				i_164_--;
				i_165_--;
			}
			if (1 == i_161_)
				i_165_--;
			if (i_161_ == 2) {
				i_164_++;
				i_165_--;
			}
			if (3 == i_161_)
				i_164_--;
			if (4 == i_161_)
				i_164_++;
			if (5 == i_161_) {
				i_164_--;
				i_165_++;
			}
			if (6 == i_161_)
				i_165_++;
			if (7 == i_161_) {
				i_164_++;
				i_165_++;
			}
			Class334.method5910(Class666.method13653((byte) -18), aByteArray1314[i], 1564593487);
			aClass40Array1322[i].anInt556 = 206368601 * (i_165_ + ((i_164_ << 14) + (i_163_ << 28)));
			return false;
		}
		int i_166_ = class523_sub34_sub2.readBits(20, 2005134588);
		int i_167_ = i_166_ >> 18 & 0x3;
		int i_168_ = i_166_ >> 16 & 0x3;
		int i_169_ = i_166_ >> 8 & 0xff;
		int i_170_ = i_166_ & 0xff;
		int i_171_ = aClass40Array1322[i].anInt556 * 1223583977;
		aByteArray1314[i] = (byte) (i_167_ - 1);
		if (!$assertionsDisabled && (aByteArray1314[i] < 0 || aByteArray1314[i] > 3))
			throw new AssertionError();
		int i_172_ = (i_171_ >> 28) + i_168_ & 0x3;
		int i_173_ = (i_171_ >> 14) + i_169_ & 0xff;
		int i_174_ = i_171_ + i_170_ & 0xff;
		Class334.method5910(Class666.method13653((byte) -28), i_167_ - 1, -1981043697);
		aClass40Array1322[i].anInt556 = ((i_172_ << 28) + (i_173_ << 14) + i_174_) * 206368601;
		return false;
	}

	static final void method1898(RSBitBuffer class523_sub34_sub2, int i, Player class647_sub1_sub3_sub1_sub2, int i_175_) {
		if (0 != (i_175_ & 0x20)) {
			int i_176_ = class523_sub34_sub2.readUnsignedShort(-315542859);
			if (65535 == i_176_)
				i_176_ = -1;
			class647_sub1_sub3_sub1_sub2.faceEntityId = -1843265241 * i_176_;
		}
		if (0 != (i_175_ & 0x400)) {
			class647_sub1_sub3_sub1_sub2.aClass210_12200 = ((Class210) Class334.method5910(Class210.method3815(-440714576), class523_sub34_sub2.readUnsignedByte(-1984158304), 374808728));
			if (class647_sub1_sub3_sub1_sub2.aClass210_12200 == null)
				class647_sub1_sub3_sub1_sub2.aClass210_12200 = Class210.aClass210_2258;
		}
		if (0 != (i_175_ & 0x4000)) {
			String string = class523_sub34_sub2.readString(491290621);
			if (Class241.player == class647_sub1_sub3_sub1_sub2)
				Class515.method8593(2, 0, class647_sub1_sub3_sub1_sub2.method18682(true, 1045243697), class647_sub1_sub3_sub1_sub2.method18669(false, (byte) 0), class647_sub1_sub3_sub1_sub2.displayName, string, null, -1481723591);
			class647_sub1_sub3_sub1_sub2.setNextOverHeadMessage(string, 0, 0, -1647269047);
		}
		if (0 != (i_175_ & 0x4)) {
			int i_177_ = class523_sub34_sub2.readUnsignedShortLE((byte) 115);
			int i_178_ = class523_sub34_sub2.readUnsignedIntV1(-1908553945);
			if (i_177_ == 65535)
				i_177_ = -1;
			int i_179_ = class523_sub34_sub2.readUnsignedByte128(-159211498);
			int i_180_ = i_179_ & 0x7;
			int i_181_ = i_179_ >> 3 & 0xf;
			if (15 == i_181_)
				i_181_ = -1;
			boolean bool = 1 == (i_179_ >> 7 & 0x1);
			class647_sub1_sub3_sub1_sub2.setGraphics(i_177_, i_178_, i_180_, i_181_, bool, 0, 1062604240);
		}
		if (0 != (i_175_ & 0x2000)) {
			int i_182_ = class523_sub34_sub2.readUnsignedByte(1900778649);
			byte[] is = new byte[i_182_];
			RSBuffer class523_sub34 = new RSBuffer(is);
			class523_sub34_sub2.readBytesReversed(is, 0, i_182_, 1960921039);
			aClass523_Sub34Array1317[i] = class523_sub34;
			class647_sub1_sub3_sub1_sub2.decodeHeadIcons(class523_sub34, -654999937);
		}
		if (0 != (i_175_ & 0x100000)) {
			class647_sub1_sub3_sub1_sub2.aByte11926 = class523_sub34_sub2.readByte((short) -31102);
			class647_sub1_sub3_sub1_sub2.aByte11927 = class523_sub34_sub2.read128Byte(1542854725);
			class647_sub1_sub3_sub1_sub2.aByte11936 = class523_sub34_sub2.readByte128(-449707013);
			class647_sub1_sub3_sub1_sub2.aByte11929 = (byte) class523_sub34_sub2.readUnsignedByte128(-1068842920);
			class647_sub1_sub3_sub1_sub2.colorDelay = ((client.cycles + class523_sub34_sub2.readUnsignedShortLE128(1984498356)) * -1819254063);
			class647_sub1_sub3_sub1_sub2.colorDuration = (client.cycles + class523_sub34_sub2.readUnsignedShortLE128(1645283349)) * -637108827;
		}
		if ((i_175_ & 0x800000) != 0)
			class647_sub1_sub3_sub1_sub2.isInAClan = class523_sub34_sub2.readUnsignedByte128(893795683) == 1;
		if ((i_175_ & 0x2) != 0) {
			class647_sub1_sub3_sub1_sub2.anInt11915 = class523_sub34_sub2.read128Byte(1542854725) * -25072087;
			class647_sub1_sub3_sub1_sub2.anInt11917 = class523_sub34_sub2.readByte128(731742326) * 245440217;
			class647_sub1_sub3_sub1_sub2.anInt11908 = class523_sub34_sub2.readByte((short) -7804) * 1206178097;
			class647_sub1_sub3_sub1_sub2.anInt11918 = class523_sub34_sub2.readByteC(-1270473922) * -360111831;
			class647_sub1_sub3_sub1_sub2.anInt11940 = class523_sub34_sub2.readByteC(-1270473922) * -2133855093;
			class647_sub1_sub3_sub1_sub2.anInt11893 = class523_sub34_sub2.readByteC(-1270473922) * -901004921;
			class647_sub1_sub3_sub1_sub2.anInt11954 = (class523_sub34_sub2.readUnsignedShort128((short) 27189) + client.cycles) * -1242459571;
			class647_sub1_sub3_sub1_sub2.anInt11932 = (class523_sub34_sub2.readUnsignedShort(-1538616817) + client.cycles) * 1395835143;
			class647_sub1_sub3_sub1_sub2.anInt11923 = class523_sub34_sub2.readUnsignedShortLE((byte) 40) * 272295045;
			class647_sub1_sub3_sub1_sub2.stepsCount = -822788275;
			class647_sub1_sub3_sub1_sub2.anInt11946 = 0;
			class647_sub1_sub3_sub1_sub2.anInt11915 += class647_sub1_sub3_sub1_sub2.screenX[0] * -25072087;
			class647_sub1_sub3_sub1_sub2.anInt11917 += class647_sub1_sub3_sub1_sub2.screenY[0] * 245440217;
			class647_sub1_sub3_sub1_sub2.anInt11908 += (1206178097 * class647_sub1_sub3_sub1_sub2.screenX[0]);
			class647_sub1_sub3_sub1_sub2.anInt11918 += (-360111831 * class647_sub1_sub3_sub1_sub2.screenY[0]);
			class647_sub1_sub3_sub1_sub2.anInt11940 += -2133855093 * class647_sub1_sub3_sub1_sub2.aByte10821;
			class647_sub1_sub3_sub1_sub2.anInt11893 += -901004921 * class647_sub1_sub3_sub1_sub2.aByte10821;
		}
		if ((i_175_ & 0x10000) != 0) {
			int i_183_ = class523_sub34_sub2.readUnsignedShortLE((byte) 17);
			int i_184_ = class523_sub34_sub2.readUnsignedIntV2((short) 28489);
			if (i_183_ == 65535)
				i_183_ = -1;
			int i_185_ = class523_sub34_sub2.readUnsignedByte128(1069580107);
			int i_186_ = i_185_ & 0x7;
			int i_187_ = i_185_ >> 3 & 0xf;
			if (15 == i_187_)
				i_187_ = -1;
			boolean bool = (i_185_ >> 7 & 0x1) == 1;
			class647_sub1_sub3_sub1_sub2.setGraphics(i_183_, i_184_, i_186_, i_187_, bool, 4, -902640263);
		}
		if (0 != (i_175_ & 0x40)) {
			class647_sub1_sub3_sub1_sub2.direction = class523_sub34_sub2.readUnsignedShort128((short) 17723) * -505899647;
			if (0 == class647_sub1_sub3_sub1_sub2.stepsCount * 703205765) {
				class647_sub1_sub3_sub1_sub2.method18331(-1693078911 * class647_sub1_sub3_sub1_sub2.direction, 854365040);
				class647_sub1_sub3_sub1_sub2.direction = 505899647;
			}
		}
		if ((i_175_ & 0x40000) != 0) {
			class647_sub1_sub3_sub1_sub2.anInterface2_11952.method20(1496399126);
			class523_sub34_sub2.offset += 379531446;
			int i_188_ = ((class523_sub34_sub2.buffer[((class523_sub34_sub2.offset += 189765723) * 2349011 - 1)]) & 0xff);
			for (int i_189_ = 0; i_189_ < i_188_; i_189_++) {
				int i_190_ = class523_sub34_sub2.readUnsignedByte128(73215196);
				BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(1001767918), i_190_, 1374783069));
				Class426 class426 = (Class669.aClass98_Sub1_Sub1_8582.method14344(class523_sub34_sub2, class474, (byte) 1));
				class647_sub1_sub3_sub1_sub2.anInterface2_11952.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1966781959);
			}
		}
		if ((i_175_ & 0x1) != 0) {
			int i_191_ = class523_sub34_sub2.readUnsignedByte(341646963);
			if (i_191_ > 0) {
				for (int i_192_ = 0; i_192_ < i_191_; i_192_++) {
					int i_193_ = -1;
					int i_194_ = -1;
					int i_195_ = -1;
					int i_196_ = class523_sub34_sub2.readUnsignedSmart(368514876);
					if (32767 == i_196_) {
						i_196_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						i_194_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						i_193_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						i_195_ = class523_sub34_sub2.readUnsignedSmart(368514876);
					} else if (i_196_ != 32766)
						i_194_ = class523_sub34_sub2.readUnsignedSmart(368514876);
					else {
						i_196_ = -1;
						i_194_ = class523_sub34_sub2.readUnsignedByte128(542336657);
					}
					int i_197_ = class523_sub34_sub2.readUnsignedSmart(368514876);
					class647_sub1_sub3_sub1_sub2.method18340(i_196_, i_194_, i_193_, i_195_, client.cycles, i_197_, -1866633553);
				}
			}
			int i_198_ = class523_sub34_sub2.readUnsignedByte(-339939082);
			if (i_198_ > 0) {
				for (int i_199_ = 0; i_199_ < i_198_; i_199_++) {
					int i_200_ = class523_sub34_sub2.readUnsignedSmart(368514876);
					int i_201_ = class523_sub34_sub2.readUnsignedSmart(368514876);
					if (i_201_ != 32767) {
						int i_202_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						int i_203_ = class523_sub34_sub2.readUnsigned128Byte(1981600683);
						int i_204_ = (i_201_ > 0 ? class523_sub34_sub2.readUnsignedByteC(626819586) : i_203_);
						class647_sub1_sub3_sub1_sub2.method18349(i_200_, client.cycles, i_201_, i_202_, i_203_, i_204_, 1656180910);
					} else
						class647_sub1_sub3_sub1_sub2.method18341(i_200_, 2053585388);
				}
			}
		}
		if ((i_175_ & 0x8000) != 0) {
			int i_205_ = class523_sub34_sub2.readUnsignedShort128((short) 28087);
			int i_206_ = class523_sub34_sub2.readUnsignedIntV2((short) 24848);
			if (i_205_ == 65535)
				i_205_ = -1;
			int i_207_ = class523_sub34_sub2.readUnsigned128Byte(1172889451);
			int i_208_ = i_207_ & 0x7;
			int i_209_ = i_207_ >> 3 & 0xf;
			if (15 == i_209_)
				i_209_ = -1;
			boolean bool = (i_207_ >> 7 & 0x1) == 1;
			class647_sub1_sub3_sub1_sub2.setGraphics(i_205_, i_206_, i_208_, i_209_, bool, 2, 1103590648);
		}
		if (0 != (i_175_ & 0x200000)) {
			int i_210_ = class523_sub34_sub2.readUnsignedShort(-543653512);
			int i_211_ = class523_sub34_sub2.readUnsignedIntV2((short) 26047);
			if (65535 == i_210_)
				i_210_ = -1;
			int i_212_ = class523_sub34_sub2.readUnsignedByte(-1233885734);
			int i_213_ = i_212_ & 0x7;
			int i_214_ = i_212_ >> 3 & 0xf;
			if (i_214_ == 15)
				i_214_ = -1;
			boolean bool = 1 == (i_212_ >> 7 & 0x1);
			class647_sub1_sub3_sub1_sub2.setGraphics(i_210_, i_211_, i_213_, i_214_, bool, 3, -1745424147);
		}
		if ((i_175_ & 0x8) != 0) {
			int i_215_ = class523_sub34_sub2.readUnsignedByteC(-1837172141);
			byte[] is = new byte[i_215_];
			RSBuffer class523_sub34 = new RSBuffer(is);
			class523_sub34_sub2.readBytesReversed(is, 0, i_215_, 2044667741);
			aClass523_Sub34Array1316[i] = class523_sub34;
			class647_sub1_sub3_sub1_sub2.decodeAppearance(class523_sub34, 1258240487);
		}
		if (0 != (i_175_ & 0x20000)) {
			class523_sub34_sub2.offset += 379531446;
			int i_216_ = ((class523_sub34_sub2.buffer[((class523_sub34_sub2.offset += 189765723) * 2349011 - 1)]) & 0xff);
			for (int i_217_ = 0; i_217_ < i_216_; i_217_++) {
				int i_218_ = class523_sub34_sub2.readUnsignedByteC(1930629498);
				BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(696055113), i_218_, -1996128088));
				Class426 class426 = (Class669.aClass98_Sub1_Sub1_8582.method14344(class523_sub34_sub2, class474, (byte) 1));
				class647_sub1_sub3_sub1_sub2.anInterface2_11952.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1297258589);
			}
		}
		if ((i_175_ & 0x400000) != 0) {
			String string = class523_sub34_sub2.readString(294269344);
			int i_219_ = class523_sub34_sub2.readUnsignedByte(-903270424);
			if (0 != (i_219_ & 0x1))
				Class515.method8593(2, i_219_, class647_sub1_sub3_sub1_sub2.method18682(true, 10561498), class647_sub1_sub3_sub1_sub2.method18669(false, (byte) 0), class647_sub1_sub3_sub1_sub2.displayName, string, null, -563870455);
			class647_sub1_sub3_sub1_sub2.setNextOverHeadMessage(string, 0, 0, -1173402313);
		}
		if ((i_175_ & 0x80000) != 0) {
			int i_220_ = class523_sub34_sub2.readUnsigned128Byte(1061849961);
			int[] is = new int[i_220_];
			int[] is_221_ = new int[i_220_];
			for (int i_222_ = 0; i_222_ < i_220_; i_222_++) {
				int i_223_ = class523_sub34_sub2.readUnsignedShort128((short) 16697);
				if ((i_223_ & 0xc000) == 49152) {
					int i_224_ = class523_sub34_sub2.readUnsignedShortLE((byte) 15);
					is[i_222_] = i_223_ << 16 | i_224_;
				} else
					is[i_222_] = i_223_;
				is_221_[i_222_] = class523_sub34_sub2.readUnsignedShortLE128(1462096852);
			}
			class647_sub1_sub3_sub1_sub2.method18334(is, is_221_, -1974501704);
		}
		if ((i_175_ & 0x1000) != 0) {
			int i_225_ = class523_sub34_sub2.readUnsignedShortLE128(1441171662);
			int i_226_ = class523_sub34_sub2.readUnsignedIntLE((short) -5813);
			if (65535 == i_225_)
				i_225_ = -1;
			int i_227_ = class523_sub34_sub2.readUnsignedByteC(302888377);
			int i_228_ = i_227_ & 0x7;
			int i_229_ = i_227_ >> 3 & 0xf;
			if (i_229_ == 15)
				i_229_ = -1;
			boolean bool = 1 == (i_227_ >> 7 & 0x1);
			class647_sub1_sub3_sub1_sub2.setGraphics(i_225_, i_226_, i_228_, i_229_, bool, 1, -606713966);
		}
		if ((i_175_ & 0x200) != 0) {
			int i_230_ = class523_sub34_sub2.readUnsigned128Byte(1860283842);
			int[] is = new int[i_230_];
			int[] is_231_ = new int[i_230_];
			int[] is_232_ = new int[i_230_];
			for (int i_233_ = 0; i_233_ < i_230_; i_233_++) {
				is[i_233_] = class523_sub34_sub2.readBigSmart((byte) -27);
				is_231_[i_233_] = class523_sub34_sub2.readUnsigned128Byte(1368441007);
				is_232_[i_233_] = class523_sub34_sub2.readUnsignedShortLE128(1974030728);
			}
			Class523.method8667(class647_sub1_sub3_sub1_sub2, is, is_231_, is_232_, (byte) 12);
		}
		if ((i_175_ & 0x10) != 0) {
			int[] is = new int[4];
			for (int i_234_ = 0; i_234_ < 4; i_234_++)
				is[i_234_] = class523_sub34_sub2.readBigSmart((byte) -24);
			int i_235_ = class523_sub34_sub2.readUnsigned128Byte(1812093187);
			Class643.setAnimation(class647_sub1_sub3_sub1_sub2, is, i_235_, false, -1596338463);
		}
	}

	static void method1899() {
		anInt1318 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass523_Sub34Array1316[i] = null;
			aClass523_Sub34Array1317[i] = null;
			aByteArray1314[i] = Class666.aClass666_8531.aByte8529;
			aClass40Array1322[i] = null;
		}
	}

	public static final boolean method1900(String string, String string_236_, String string_237_, String string_238_, int i) {
		if (string == null || null == string_237_)
			return false;
		if (string.startsWith("#") || string_237_.startsWith("#"))
			return string.equals(string_237_);
		return string_236_.equals(string_238_);
	}

	static void method1901(int i, short i_239_) {
		Class38.anInt375 = i * -851840831;
		synchronized (Class38.aClass209_374) {
			Class38.aClass209_374.method3773(-1900712600);
		}
	}

	static final void method1902(Class669 class669, byte i) {
		class669.anInt8558 -= 2138772399;
	}

	static String method1903(String string, int i) {
		String string_240_ = null;
		int i_241_ = string.indexOf("--> ");
		if (i_241_ >= 0) {
			string_240_ = string.substring(0, 4 + i_241_);
			string = string.substring(i_241_ + 4);
		}
		int i_242_ = -1;
		if (string.startsWith("directlogin "))
			i_242_ = string.indexOf(" ", "directlogin ".length());
		if (i_242_ >= 0) {
			int i_243_ = string.length();
			string = new StringBuilder().append(string.substring(0, i_242_)).append(" ").toString();
			for (int i_244_ = 1 + i_242_; i_244_ < i_243_; i_244_++)
				string = new StringBuilder().append(string).append("*").toString();
		}
		if (string_240_ != null)
			return new StringBuilder().append(string_240_).append(string).toString();
		return string;
	}
}
