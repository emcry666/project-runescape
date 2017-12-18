/* Class691 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class691 implements Interface75 {
	static Class691 aClass691_8691;
	public static Class691 aClass691_8692;
	static Class691 aClass691_8693;
	public static Class691 aClass691_8694;
	public static Class691 aClass691_8695 = new Class691(-2);
	static Class691 aClass691_8696;
	static Class691 aClass691_8697;
	static Class691 aClass691_8698;
	int anInt8699;
	static Class691 aClass691_8700;
	static String aString8701;

	public static Class691[] method13959() {
		return (new Class691[] { aClass691_8697, aClass691_8691, aClass691_8692, aClass691_8693, aClass691_8698, aClass691_8700, aClass691_8696, aClass691_8694, aClass691_8695 });
	}

	public int method82() {
		return anInt8699 * -950526383;
	}

	static {
		aClass691_8692 = new Class691(-3);
		aClass691_8693 = new Class691(2);
		aClass691_8694 = new Class691(3);
		aClass691_8696 = new Class691(4);
		aClass691_8691 = new Class691(5);
		aClass691_8697 = new Class691(6);
		aClass691_8698 = new Class691(7);
		aClass691_8700 = new Class691(8);
	}

	public int method6() {
		return anInt8699 * -950526383;
	}

	public int method101() {
		return anInt8699 * -950526383;
	}

	public static Class691[] method13960() {
		return (new Class691[] { aClass691_8697, aClass691_8691, aClass691_8692, aClass691_8693, aClass691_8698, aClass691_8700, aClass691_8696, aClass691_8694, aClass691_8695 });
	}

	Class691(int i) {
		anInt8699 = -498210127 * i;
	}

	static void method13961(InterfaceComponentDefinitions class250, Class145 class145, int i, int i_0_, int i_1_, int i_2_, Class148 class148, double d, Class275 class275, Class273 class273, byte i_3_) {
		if (null != class148) {
			int i_4_;
			if (2097396553 * Class562.anInt7564 == 2)
				i_4_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1924231323) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
			else if (2097396553 * Class562.anInt7564 == 6)
				i_4_ = (int) client.aFloat11129 & 0x3fff;
			else
				i_4_ = ((int) client.aFloat11129 + 724985463 * client.anInt11094 & 0x3fff);
			int i_5_ = (Math.max(class250.anInt2581 * 365308179 / 2, -1759297857 * class250.anInt2543 / 2) + 10);
			int i_6_ = i_2_ * i_2_ + i_1_ * i_1_;
			if (i_6_ <= i_5_ * i_5_) {
				int i_7_ = Class433.anIntArray4880[i_4_];
				int i_8_ = Class433.anIntArray4881[i_4_];
				if (6 != 2097396553 * Class562.anInt7564) {
					i_7_ = 256 * i_7_ / (-1193506389 * client.anInt11068 + 256);
					i_8_ = i_8_ * 256 / (256 + client.anInt11068 * -1193506389);
				}
				int i_9_ = i_8_ * i_1_ + i_7_ * i_2_ >> 14;
				int i_10_ = i_2_ * i_8_ - i_1_ * i_7_ >> 14;
				double d_11_ = d / 100.0;
				switch (class275.anInt2902 * -399546231) {
				case 1:
					i = i_9_ + (365308179 * class250.anInt2581 / 2 + i);
					break;
				case 2:
					i = (i_9_ + (i + 365308179 * class250.anInt2581 / 2) - (int) ((double) class148.method38() * d_11_));
					break;
				case 0:
					i = (class250.anInt2581 * 365308179 / 2 + i + i_9_ - (int) ((double) (class148.method38() / 2) * d_11_));
					break;
				}
				switch (1995634209 * class273.anInt2887) {
				case 0:
					i_0_ = (i_0_ + class250.anInt2543 * -1759297857 / 2 - i_10_ - (int) ((double) (class148.method2429() / 2) * d_11_));
					break;
				case 2:
					i_0_ = i_0_ + class250.anInt2543 * -1759297857 / 2 - i_10_;
					break;
				case 1:
					i_0_ = (class250.anInt2543 * -1759297857 / 2 + i_0_ - i_10_ - (int) ((double) class148.method2429() * d_11_));
					break;
				}
				if (class145 != null) {
					if (1.0 == d_11_)
						class148.method2482(i, i_0_, class145, i, i_0_);
					else
						class148.method2438(i, i_0_, (int) ((double) class148.method38() * d_11_), (int) ((double) class148.method2429() * d_11_));
				} else {
					if (d_11_ == 1.0)
						class148.method2435(i, i_0_);
					class148.method2438(i, i_0_, (int) ((double) class148.method38() * d_11_), (int) ((double) class148.method2429() * d_11_));
				}
			}
		}
	}

	static void method13962(int i, int i_12_) {
		Class597.anInt7835 = i * -1099820943;
		Class534_Sub1.anInt10779 = -465264525;
		Class534_Sub1.anInt10779 = -465264525;
		JS5ArchiveReference.method1233((byte) -102);
	}

	static final void method13963(RSBitBuffer class523_sub34_sub2, int i) {
		class523_sub34_sub2.method18223(972595080);
		int i_13_ = client.anInt11154 * 1109726117;
		Player class647_sub1_sub3_sub1_sub2 = (Class241.player = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_13_] = (new Player(client.aClass505_11019.method8241((byte) -128))));
		class647_sub1_sub3_sub1_sub2.anInt11888 = i_13_ * -1926162379;
		int i_14_ = class523_sub34_sub2.readBits(30, 1516036840);
		byte i_15_ = (byte) (i_14_ >> 28);
		int i_16_ = i_14_ >> 14 & 0x3fff;
		int i_17_ = i_14_ & 0x3fff;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		class647_sub1_sub3_sub1_sub2.screenX[0] = i_16_ - class592.localX * 235453015;
		class647_sub1_sub3_sub1_sub2.screenY[0] = i_17_ - class592.localY * 1704054549;
		class647_sub1_sub3_sub1_sub2.method10574((float) ((class647_sub1_sub3_sub1_sub2.screenX[0] << 9) + (class647_sub1_sub3_sub1_sub2.method18338(2144100581) << 8)), (class647_sub1_sub3_sub1_sub2.method10601().aClass437_4862.aFloat4904), (float) ((class647_sub1_sub3_sub1_sub2.screenY[0] << 9) + (class647_sub1_sub3_sub1_sub2.method18338(2139766432) << 8)));
		Class222.anInt2334 = (class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = i_15_) * 779966195;
		if (client.aClass505_11019.method8243(389074819).method7282(class647_sub1_sub3_sub1_sub2.screenX[0], class647_sub1_sub3_sub1_sub2.screenY[0], -638715901))
			class647_sub1_sub3_sub1_sub2.aByte10818++;
		if (null != Class108.aClass523_Sub34Array1316[i_13_])
			class647_sub1_sub3_sub1_sub2.decodeAppearance((Class108.aClass523_Sub34Array1316[i_13_]), 1651349553);
		if (null != Class108.aClass523_Sub34Array1317[i_13_])
			class647_sub1_sub3_sub1_sub2.decodeHeadIcons((Class108.aClass523_Sub34Array1317[i_13_]), -654999937);
		Class108.anInt1318 = 0;
		Class108.anIntArray1319[((Class108.anInt1318 += 633815497) * 393652345 - 1)] = i_13_;
		Class108.aByteArray1324[i_13_] = (byte) 0;
		Class108.anInt1315 = 0;
		for (int i_18_ = 1; i_18_ < 2048; i_18_++) {
			if (i_18_ != i_13_) {
				int i_19_ = class523_sub34_sub2.readBits(18, -1908683675);
				int i_20_ = i_19_ >> 16 & 0x3;
				int i_21_ = i_19_ >> 8 & 0xff;
				int i_22_ = i_19_ & 0xff;
				Class40 class40 = Class108.aClass40Array1322[i_18_] = new Class40();
				class40.anInt556 = (i_22_ + ((i_20_ << 28) + (i_21_ << 14))) * 206368601;
				class40.anInt554 = 0;
				class40.anInt555 = -1332641739;
				class40.aClass210_553 = Class210.aClass210_2258;
				class40.aBool557 = false;
				Class108.anIntArray1321[(Class108.anInt1315 += -1210837665) * 1212778143 - 1] = i_18_;
				Class108.aByteArray1324[i_18_] = (byte) 0;
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		Class291 class291 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100);
		if (Class291.aClass291_3148 == class291) {
			Class328_Sub2 class328_sub2 = (Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1675702411);
			class328_sub2.method15596(-81376287);
		}
		Class294 class294 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 114);
		if (class294 == Class294.aClass294_3164) {
			Class688_Sub2 class688_sub2 = (Class688_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 12);
			class688_sub2.method17078((byte) 65);
		}
	}

	static final void method13964(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		int i_29_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		client.anInt11288 = 0;
		int i_30_;
		if (client.anInt11071 * -1616721887 == 4)
			i_30_ = Class191.aClass192Array2157.length;
		else
			i_30_ = i_29_ + client.anInt11050 * 920163749;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
			NPCDefinition class300 = null;
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1;
			if (4 == -1616721887 * client.anInt11071) {
				Class192 class192 = Class191.aClass192Array2157[i_31_];
				if (!class192.aBool2174)
					continue;
				class647_sub1_sub3_sub1 = class192.method3631(1073172791);
				if (-487274901 * client.anInt10981 != class647_sub1_sub3_sub1.anInt11889 * 1826923379)
					continue;
				if (class192.anInt2172 * -580266303 >= 0) {
					class300 = ((NPC) class647_sub1_sub3_sub1).aClass300_12175;
					if (null != class300.anIntArray3286) {
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 69);
						if (null == class300)
							continue;
					}
				}
			} else {
				if (i_31_ < i_29_)
					class647_sub1_sub3_sub1 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_31_]]);
				else {
					class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) (((Class523_Sub28) (client.aClass14_11047.getFromIndex((long) client.anIntArray11051[i_31_ - i_29_]))).anObject10554));
					class300 = ((NPC) class647_sub1_sub3_sub1).aClass300_12175;
					if (class300.anIntArray3286 != null) {
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 33);
						if (class300 == null)
							continue;
					}
				}
				if (-420874213 * class647_sub1_sub3_sub1.anInt11896 < 0 || ((1826923379 * class647_sub1_sub3_sub1.anInt11889 != -487274901 * client.anInt10981) && ((Class241.player.aByte10821) != class647_sub1_sub3_sub1.aByte10821)))
					continue;
			}
			Class588.method9743(class647_sub1_sub3_sub1, class647_sub1_sub3_sub1.method16740(446652014), false, (byte) -1);
			if (!(client.aFloatArray11297[0] < 0.0F)) {
				if (class647_sub1_sub3_sub1.method18381(-1548281746)) {
					Class533 class533 = class647_sub1_sub3_sub1.method18353((byte) 41);
					if (null != class533 && (client.anInt11288 * -1889651207 < client.anInt11291 * 700687667)) {
						String string = class533.method8789(-1369391278);
						if (Class665.aClass282_8527.method5111(-2083153005))
							string = Class665.aClass282_8527.method5104(string, -143107113);
						client.anIntArray11255[client.anInt11288 * -1889651207] = (Class655.aClass10_8421.method597(string, -1759656773) / 2);
						client.anIntArray11003[client.anInt11288 * -1889651207] = (int) client.aFloatArray11297[0];
						client.anIntArray11113[client.anInt11288 * -1889651207] = (int) client.aFloatArray11297[1];
						client.aClass533Array11043[(-1889651207 * client.anInt11288)] = class533;
						client.anInt11288 += 1668185161;
					}
				}
				int i_32_ = (int) (client.aFloatArray11297[1] + (float) i_23_);
				i_32_ -= -1669009881 * Class655.aClass10_8421.anInt76;
				boolean bool = false;
				if (!class647_sub1_sub3_sub1.aBool11892 && !class647_sub1_sub3_sub1.aClass701_11920.method14083(983590184)) {
					for (Class522_Sub6 class522_sub6 = (Class522_Sub6) class647_sub1_sub3_sub1.aClass701_11920.method14087(1706431677); class522_sub6 != null; class522_sub6 = (Class522_Sub6) class647_sub1_sub3_sub1.aClass701_11920.method14088(1563898752)) {
						Class522_Sub1 class522_sub1 = class522_sub6.method15868(client.cycles, 16711935);
						if (null != class522_sub1) {
							Class547 class547 = class522_sub6.aClass547_10344;
							Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_31_]]);
							Class148 class148;
							Class148 class148_33_;
							if (class647_sub1_sub3_sub1_sub2 != null && (Class210.aClass210_2258 != (class647_sub1_sub3_sub1_sub2.aClass210_12200))) {
								if (Class210.aClass210_2259 == (class647_sub1_sub3_sub1_sub2.aClass210_12200)) {
									class148 = class547.method9070((Class31.aClass178_303), (1972209567 * (class547.anInt7314)), 2064067983);
									class148_33_ = class547.method9070((Class31.aClass178_303), ((class547.anInt7313) * 111878601), 48932609);
								} else {
									class148 = class547.method9070((Class31.aClass178_303), ((class547.anInt7316) * -1097989737), 2138753068);
									class148_33_ = class547.method9070((Class31.aClass178_303), (-2093790107 * (class547.anInt7315)), 1676666145);
								}
							} else {
								class148 = class547.method9070((Class31.aClass178_303), (72053277 * (class547.anInt7304)), 1379002738);
								class148_33_ = class547.method9070((Class31.aClass178_303), (2013168073 * (class547.anInt7310)), 864472421);
							}
							if (null != class148 && class148_33_ != null) {
								int i_34_ = 255;
								int i_35_ = -1;
								int i_36_ = (client.cycles - (class522_sub1.anInt10291 * -1433551525));
								int i_37_ = (class148_33_.method2504() * (class522_sub1.anInt10288 * 1847674353) / 255);
								if (class522_sub1.anInt10290 * -1705286665 > i_36_) {
									int i_38_ = (class547.anInt7309 * 293418075 == 0 ? 0 : (i_36_ / (293418075 * class547.anInt7309) * (class547.anInt7309 * 293418075)));
									int i_39_ = (class148_33_.method2504() * (-1502830479 * class522_sub1.anInt10289) / 255);
									i_35_ = i_39_ + (i_38_ * (i_37_ - i_39_) / (-1705286665 * (class522_sub1.anInt10290)));
								} else {
									i_35_ = i_37_;
									int i_40_ = ((class522_sub1.anInt10290 * -1705286665) + class547.anInt7312 * 1609633869 - i_36_);
									if (393123529 * class547.anInt7308 >= 0)
										i_34_ = ((i_40_ << 8) / ((class547.anInt7312 * 1609633869) - (393123529 * class547.anInt7308)));
								}
								if (class522_sub1.anInt10288 * 1847674353 > 0 && i_35_ < 2)
									i_35_ = 2;
								int i_41_ = class148.method2428();
								int i_42_ = (int) (client.aFloatArray11297[0] + (float) i - (float) (class148.method2504() >> 1));
								i_32_ -= i_41_;
								if (i_34_ >= 0 && i_34_ < 255) {
									int i_43_ = i_34_ << 24;
									int i_44_ = i_43_ | 0xffffff;
									class148.method2436(i_42_, i_32_, 0, i_44_, 1);
									Class31.aClass178_303.method3266(i_42_, i_32_, i_35_ + i_42_, i_32_ + i_41_);
									class148_33_.method2436(i_42_, i_32_, 0, i_44_, 1);
								} else {
									class148.method2435(i_42_, i_32_);
									Class31.aClass178_303.method3266(i_42_, i_32_, i_42_ + i_35_, i_41_ + i_32_);
									class148_33_.method2435(i_42_, i_32_);
								}
								Class31.aClass178_303.method3378(i, i_23_, i_24_ + i, (i_23_ + i_25_));
								i_32_ -= 2;
								bool = true;
							}
						} else if (class522_sub6.method15869((short) 9765))
							class522_sub6.method8652((byte) -114);
					}
				}
				if (!bool)
					i_32_ -= (Class523_Sub11.aClass625_10427.anInt8140 * -322388323) + 2;
				if (!class647_sub1_sub3_sub1.aBool11892) {
					if (null == class300) {
						Player class647_sub1_sub3_sub1_sub2 = ((Player) class647_sub1_sub3_sub1);
						for (int i_45_ = 0; i_45_ < (class647_sub1_sub3_sub1_sub2.anIntArray12201).length; i_45_++) {
							if ((class647_sub1_sub3_sub1_sub2.anIntArray12201[i_45_]) >= 0) {
								Object object = null;
								int i_46_ = (class647_sub1_sub3_sub1_sub2.anIntArray12201[i_45_]);
								int i_47_ = (class647_sub1_sub3_sub1_sub2.anIntArray12191[i_45_]);
								long l = (long) (i_47_ << 8 | i_46_);
								Class148 class148 = ((Class148) client.aClass209_11042.method3767(l));
								if (null == class148) {
									Class175[] class175s = (Class166.method2672(Class523_Sub8.aClass472_10406, i_47_, 0));
									if (class175s == null)
										continue;
									class148 = (Class31.aClass178_303.method3104(class175s[i_46_], true));
									client.aClass209_11042.method3770(class148, l);
								}
								if (null != class148) {
									i_32_ -= class148.method2428();
									class148.method2435((int) (client.aFloatArray11297[0] + (float) i - 12.0F), i_32_);
									i_32_ -= 2;
								}
							}
						}
					} else {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class647_sub1_sub3_sub1);
						int[] is_48_ = (null != (class647_sub1_sub3_sub1_sub1.headIcon) ? (class647_sub1_sub3_sub1_sub1.headIcon.anIntArray3345) : (class647_sub1_sub3_sub1_sub1.aClass300_12175.anIntArray3282));
						short[] is_49_ = (null != (class647_sub1_sub3_sub1_sub1.headIcon) ? (class647_sub1_sub3_sub1_sub1.headIcon.aShortArray3344) : (class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3283));
						if (null != is_49_ && is_48_ != null) {
							int i_50_ = 0;
							for (/**/; i_50_ < is_49_.length; i_50_++) {
								if (is_49_[i_50_] >= 0 && is_48_[i_50_] >= 0) {
									Object object = null;
									long l = (long) (is_48_[i_50_] << 8 | is_49_[i_50_]);
									Class148 class148 = (Class148) client.aClass209_11042.method3767(l);
									if (class148 == null) {
										Class175[] class175s = (Class166.method2672(Class523_Sub8.aClass472_10406, is_48_[i_50_], 0));
										if (null == class175s)
											continue;
										class148 = (Class31.aClass178_303.method3104(class175s[is_49_[i_50_]], true));
										client.aClass209_11042.method3770(class148, l);
									}
									if (null != class148) {
										i_32_ -= class148.method2428();
										class148.method2435((int) ((float) i + (client.aFloatArray11297[0]) - (float) ((class148.method2504()) >> 1)), i_32_);
										i_32_ -= 2;
									}
								}
							}
						}
					}
				}
				if (class647_sub1_sub3_sub1 instanceof Player) {
					if (i_31_ >= 0) {
						int i_51_ = 0;
						Class111[] class111s = client.aClass111Array11017;
						for (int i_52_ = 0; i_52_ < class111s.length; i_52_++) {
							Class111 class111 = class111s[i_52_];
							if (class111 != null && class111.anInt1334 * 239678453 == 10 && (is[i_31_] == 920515165 * class111.anInt1336)) {
								Class148 class148 = (Class566.aClass148Array7606[309561833 * class111.anInt1344]);
								if (class148.method2428() > i_51_)
									i_51_ = class148.method2428();
								class148.method2435((int) (client.aFloatArray11297[0] + (float) i - 12.0F), i_32_ - class148.method2428());
							}
						}
						if (i_51_ > 0)
							i_32_ -= 2 + i_51_;
					}
				} else {
					int i_53_ = 0;
					Class111[] class111s = client.aClass111Array11017;
					for (int i_54_ = 0; i_54_ < class111s.length; i_54_++) {
						Class111 class111 = class111s[i_54_];
						if (null != class111 && class111.anInt1334 * 239678453 == 1 && (client.anIntArray11051[i_31_ - i_29_] == 920515165 * class111.anInt1336)) {
							Class148 class148 = (Class566.aClass148Array7606[309561833 * class111.anInt1344]);
							if (class148.method2428() > i_53_)
								i_53_ = class148.method2428();
							boolean bool_55_;
							if (0 == class111.anInt1343 * -1161226431)
								bool_55_ = true;
							else {
								int i_56_ = (Class286.method5150(1985100874) * 1000 / (-1161226431 * class111.anInt1343) / 2);
								bool_55_ = client.cycles % (i_56_ * 2) < i_56_;
							}
							if (bool_55_)
								class148.method2435((int) ((float) i + (client.aFloatArray11297[0]) - 12.0F), (i_32_ - class148.method2428()));
						}
					}
					if (i_53_ > 0)
						i_32_ -= i_53_ + 2;
				}
				int i_57_ = 0;
				for (/**/; (i_57_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133); i_57_++) {
					int i_58_ = class647_sub1_sub3_sub1.anIntArray11905[i_57_];
					int i_59_ = class647_sub1_sub3_sub1.anIntArray11903[i_57_];
					Class586 class586 = null;
					int i_60_ = 0;
					if (i_59_ >= 0) {
						if (i_58_ <= client.cycles)
							continue;
						class586 = (Class586) (Class295.aClass53_Sub2_3176.getDefinition((class647_sub1_sub3_sub1.anIntArray11903[i_57_]), (byte) -95));
						i_60_ = 1247513563 * class586.anInt7725;
						if (class586 != null && class586.anIntArray7738 != null) {
							class586 = class586.method9693((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), -2079438990);
							if (class586 == null) {
								class647_sub1_sub3_sub1.anIntArray11905[i_57_] = -1;
								continue;
							}
						}
					} else if (i_58_ < 0)
						continue;
					int i_61_ = class647_sub1_sub3_sub1.anIntArray11906[i_57_];
					Class586 class586_62_ = null;
					if (i_61_ >= 0) {
						class586_62_ = (Class586) Class295.aClass53_Sub2_3176.getDefinition(i_61_, (byte) 51);
						if (class586_62_ != null && class586_62_.anIntArray7738 != null)
							class586_62_ = class586_62_.method9693((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), -2040053232);
					}
					if (i_58_ - i_60_ <= client.cycles) {
						if (null == class586)
							class647_sub1_sub3_sub1.anIntArray11905[i_57_] = -1;
						else {
							int i_63_ = (class647_sub1_sub3_sub1.method16740(-2060393705) / 2);
							Class588.method9743(class647_sub1_sub3_sub1, i_63_, false, (byte) -1);
							if (client.aFloatArray11297[0] > -1.0F) {
								client.aFloatArray11297[0] += (float) (Class523_Sub11.aClass625_10427.anIntArray8158[i_57_]);
								client.aFloatArray11297[1] += (float) (Class523_Sub11.aClass625_10427.anIntArray8135[i_57_]);
								Object object = null;
								Object object_64_ = null;
								Object object_65_ = null;
								Object object_66_ = null;
								int i_67_ = 0;
								int i_68_ = 0;
								int i_69_ = 0;
								int i_70_ = 0;
								int i_71_ = 0;
								int i_72_ = 0;
								int i_73_ = 0;
								int i_74_ = 0;
								Class148 class148 = null;
								Class148 class148_75_ = null;
								Class148 class148_76_ = null;
								Class148 class148_77_ = null;
								int i_78_ = 0;
								int i_79_ = 0;
								int i_80_ = 0;
								int i_81_ = 0;
								int i_82_ = 0;
								int i_83_ = 0;
								int i_84_ = 0;
								int i_85_ = 0;
								Class148 class148_86_ = class586.method9697((Class31.aClass178_303), (byte) -86);
								if (null != class148_86_) {
									i_67_ = class148_86_.method2504();
									class148_86_.method2425(client.anIntArray11320);
									i_71_ = client.anIntArray11320[0];
								}
								Class148 class148_87_ = class586.method9698((Class31.aClass178_303), 432606552);
								if (null != class148_87_) {
									i_68_ = class148_87_.method2504();
									class148_87_.method2425(client.anIntArray11320);
									i_72_ = client.anIntArray11320[0];
								}
								Class148 class148_88_ = class586.method9699((Class31.aClass178_303), 230523327);
								if (class148_88_ != null) {
									i_69_ = class148_88_.method2504();
									class148_88_.method2425(client.anIntArray11320);
									i_73_ = client.anIntArray11320[0];
								}
								Class148 class148_89_ = class586.method9700((Class31.aClass178_303), -1490778508);
								if (class148_89_ != null) {
									i_70_ = class148_89_.method2504();
									class148_89_.method2425(client.anIntArray11320);
									i_74_ = client.anIntArray11320[0];
								}
								if (class586_62_ != null) {
									class148 = (class586_62_.method9697(Class31.aClass178_303, (byte) -62));
									if (class148 != null) {
										i_78_ = class148.method2504();
										class148.method2425(client.anIntArray11320);
										i_82_ = client.anIntArray11320[0];
									}
									class148_75_ = (class586_62_.method9698(Class31.aClass178_303, 1109520583));
									if (class148_75_ != null) {
										i_79_ = class148_75_.method2504();
										class148_75_.method2425(client.anIntArray11320);
										i_83_ = client.anIntArray11320[0];
									}
									class148_76_ = (class586_62_.method9699(Class31.aClass178_303, -1324240619));
									if (null != class148_76_) {
										i_80_ = class148_76_.method2504();
										class148_76_.method2425(client.anIntArray11320);
										i_84_ = client.anIntArray11320[0];
									}
									class148_77_ = (class586_62_.method9700(Class31.aClass178_303, -912827579));
									if (null != class148_77_) {
										i_81_ = class148_77_.method2504();
										class148_77_.method2425(client.anIntArray11320);
										i_85_ = client.anIntArray11320[0];
									}
								}
								Class164 class164 = Class34.aClass164_318;
								Class164 class164_90_ = Class34.aClass164_318;
								Class10 class10 = Class681.aClass10_8649;
								Class10 class10_91_ = Class681.aClass10_8649;
								int i_92_ = -545802331 * class586.anInt7723;
								if (i_92_ >= 0) {
									Class164 class164_93_ = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, i_92_, true, class586.aBool7722, -1987150707)));
									Class10 class10_94_ = (Class491.aClass423_5536.method6688(client.anInterface50_11044, i_92_, (byte) -100));
									if (class164_93_ != null && class10_94_ != null) {
										class164 = class164_93_;
										class10 = class10_94_;
									}
								}
								if (null != class586_62_) {
									i_92_ = -545802331 * class586_62_.anInt7723;
									if (i_92_ >= 0) {
										Class164 class164_95_ = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, i_92_, true, class586_62_.aBool7722, -1911553179)));
										Class10 class10_96_ = (Class491.aClass423_5536.method6688(client.anInterface50_11044, i_92_, (byte) -83));
										if (class164_95_ != null && null != class10_96_) {
											class164_90_ = class164_95_;
											class10_91_ = class10_96_;
										}
									}
								}
								Object object_97_ = null;
								String string = null;
								boolean bool_98_ = false;
								int i_99_ = 0;
								String string_100_ = (class586.method9696((class647_sub1_sub3_sub1.anIntArray11904[i_57_]), 1417968729));
								int i_101_ = class10.method597(string_100_, -1759656773);
								if (null != class586_62_) {
									string = (class586_62_.method9696((class647_sub1_sub3_sub1.anIntArray11907[i_57_]), 1417968729));
									i_99_ = class10_91_.method597(string, -1759656773);
								}
								int i_102_ = 0;
								int i_103_ = 0;
								if (i_68_ > 0)
									i_102_ = i_101_ / i_68_ + 1;
								if (null != class586_62_ && i_79_ > 0)
									i_103_ = i_99_ / i_79_ + 1;
								int i_104_ = 0;
								int i_105_ = i_104_;
								if (i_67_ > 0)
									i_104_ += i_67_;
								i_104_ += 2;
								int i_106_ = i_104_;
								if (i_69_ > 0)
									i_104_ += i_69_;
								int i_107_ = i_104_;
								int i_108_ = i_104_;
								if (i_68_ > 0) {
									int i_109_ = i_102_ * i_68_;
									i_104_ += i_109_;
									i_108_ += (i_109_ - i_101_) / 2;
								} else
									i_104_ += i_101_;
								int i_110_ = i_104_;
								if (i_70_ > 0)
									i_104_ += i_70_;
								int i_111_ = 0;
								int i_112_ = 0;
								int i_113_ = 0;
								int i_114_ = 0;
								int i_115_ = 0;
								if (null != class586_62_) {
									i_104_ += 2;
									i_111_ = i_104_;
									if (i_78_ > 0)
										i_104_ += i_78_;
									i_104_ += 2;
									i_112_ = i_104_;
									if (i_80_ > 0)
										i_104_ += i_80_;
									i_113_ = i_104_;
									i_115_ = i_104_;
									if (i_79_ > 0) {
										int i_116_ = i_103_ * i_79_;
										i_104_ += i_116_;
										i_115_ += (i_116_ - i_99_) / 2;
									} else
										i_104_ += i_99_;
									i_114_ = i_104_;
									if (i_81_ > 0)
										i_104_ += i_81_;
								}
								int i_117_ = ((class647_sub1_sub3_sub1.anIntArray11905[i_57_]) - client.cycles);
								int i_118_ = (class586.anInt7730 * 134367287 - (134367287 * class586.anInt7730 * i_117_ / (1247513563 * class586.anInt7725)));
								int i_119_ = (-(1779119099 * class586.anInt7715) + (i_117_ * (class586.anInt7715 * 1779119099) / (1247513563 * class586.anInt7725)));
								int i_120_ = (int) ((float) i + client.aFloatArray11297[0] - (float) (i_104_ >> 1) + (float) i_118_);
								int i_121_ = (int) ((float) i_23_ + client.aFloatArray11297[1] - 12.0F + (float) i_119_);
								int i_122_ = (1053717887 * class586.anInt7735 + (i_121_ + 15));
								int i_123_ = 0;
								if (class586_62_ != null)
									i_123_ = (1053717887 * class586_62_.anInt7735 + (i_121_ + 15));
								int i_124_ = 255;
								if (class586.anInt7732 * -1526413829 >= 0)
									i_124_ = ((i_117_ << 8) / (class586.anInt7725 * 1247513563 - (class586.anInt7732 * -1526413829)));
								if (i_124_ >= 0 && i_124_ < 255) {
									int i_125_ = i_124_ << 24;
									int i_126_ = i_125_ | 0xffffff;
									if (null != class148_86_)
										class148_86_.method2436((i_105_ + i_120_ - i_71_), i_121_, 0, i_126_, 1);
									if (class148_88_ != null)
										class148_88_.method2436((-501349907 * class586.anInt7734 + (i_120_ + i_106_ - i_73_)), (class586.anInt7737 * 1702711103 + i_121_), 0, i_126_, 1);
									if (null != class148_87_) {
										for (int i_127_ = 0; i_127_ < i_102_; i_127_++)
											class148_87_.method2436((i_127_ * i_68_ + (i_120_ + i_107_ - i_72_) + (-501349907 * class586.anInt7734)), i_121_ + (class586.anInt7737 * 1702711103), 0, i_126_, 1);
									}
									if (null != class148_89_)
										class148_89_.method2436((i_110_ + i_120_ - i_74_ + (class586.anInt7734 * -501349907)), i_121_ + (1702711103 * class586.anInt7737), 0, i_126_, 1);
									class164.method2635(string_100_, i_120_ + i_108_, i_122_, ((1828587353 * class586.anInt7719) | i_125_), 0, (byte) 90);
									if (class586_62_ != null) {
										if (null != class148)
											class148.method2436((i_111_ + i_120_ - i_82_), i_121_, 0, i_126_, 1);
										if (null != class148_76_)
											class148_76_.method2436(((-501349907 * class586_62_.anInt7734) + (i_112_ + i_120_ - i_84_)), (class586_62_.anInt7737 * 1702711103) + i_121_, 0, i_126_, 1);
										if (null != class148_75_) {
											for (int i_128_ = 0; i_128_ < i_103_; i_128_++)
												class148_75_.method2436(((class586_62_.anInt7734 * -501349907) + (i_120_ + i_113_ - i_83_ + i_79_ * i_128_)), (class586_62_.anInt7737 * 1702711103) + i_121_, 0, i_126_, 1);
										}
										if (class148_77_ != null)
											class148_77_.method2436((i_120_ + i_114_ - i_85_ + -501349907 * (class586_62_.anInt7734)), (i_121_ + (class586_62_.anInt7737 * 1702711103)), 0, i_126_, 1);
										class164_90_.method2635(string, i_115_ + i_120_, i_123_, ((1828587353 * class586_62_.anInt7719) | i_125_), 0, (byte) 1);
									}
								} else {
									if (null != class148_86_)
										class148_86_.method2435((i_105_ + i_120_ - i_71_), i_121_);
									if (class148_88_ != null)
										class148_88_.method2435((-501349907 * class586.anInt7734 + (i_106_ + i_120_ - i_73_)), i_121_ + (class586.anInt7737 * 1702711103));
									if (class148_87_ != null) {
										for (int i_129_ = 0; i_129_ < i_102_; i_129_++)
											class148_87_.method2435(((class586.anInt7734 * -501349907) + (i_68_ * i_129_ + (i_120_ + i_107_ - i_72_))), (i_121_ + (1702711103 * class586.anInt7737)));
									}
									if (null != class148_89_)
										class148_89_.method2435((i_120_ + i_110_ - i_74_ + (class586.anInt7734 * -501349907)), i_121_ + (1702711103 * class586.anInt7737));
									class164.method2635(string_100_, i_120_ + i_108_, i_122_, ((class586.anInt7719 * 1828587353) | ~0xffffff), 0, (byte) -51);
									if (class586_62_ != null) {
										if (null != class148)
											class148.method2435((i_111_ + i_120_ - i_82_), i_121_);
										if (null != class148_76_)
											class148_76_.method2435((i_112_ + i_120_ - i_84_ + -501349907 * (class586_62_.anInt7734)), (i_121_ + (class586_62_.anInt7737 * 1702711103)));
										if (class148_75_ != null) {
											for (int i_130_ = 0; i_130_ < i_103_; i_130_++)
												class148_75_.method2435((i_120_ + i_113_ - i_83_ + i_79_ * i_130_ + (-501349907 * (class586_62_.anInt7734))), ((1702711103 * (class586_62_.anInt7737)) + i_121_));
										}
										if (class148_77_ != null)
											class148_77_.method2435(((-501349907 * class586_62_.anInt7734) + (i_120_ + i_114_ - i_85_)), i_121_ + (1702711103 * (class586_62_.anInt7737)));
										class164_90_.method2635(string, i_115_ + i_120_, i_123_, (class586_62_.anInt7719 * 1828587353) | ~0xffffff, 0, (byte) -102);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i_131_ = 0; i_131_ < -1661345859 * client.anInt11279; i_131_++) {
			int i_132_ = client.anIntArray11088[i_131_];
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1;
			if (i_132_ < 2048)
				class647_sub1_sub3_sub1 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_132_];
			else
				class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) (((Class523_Sub28) client.aClass14_11047.getFromIndex((long) (i_132_ - 2048))).anObject10554));
			int i_133_ = client.anIntArray11127[i_131_];
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1_134_;
			if (i_133_ < 2048)
				class647_sub1_sub3_sub1_134_ = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_133_];
			else
				class647_sub1_sub3_sub1_134_ = ((Class647_Sub1_Sub3_Sub1) (((Class523_Sub28) client.aClass14_11047.getFromIndex((long) (i_133_ - 2048))).anObject10554));
			Class7.method562(class647_sub1_sub3_sub1, class647_sub1_sub3_sub1_134_, (class647_sub1_sub3_sub1.anInt11950 -= -110612427) * -1509055971, i, i_23_, i_24_, i_25_, i_26_, i_27_, (byte) 93);
		}
		int i_135_ = (-853549931 * Class655.aClass10_8421.anInt80 + -1669009881 * Class655.aClass10_8421.anInt76 + 2);
		for (int i_136_ = 0; i_136_ < -1889651207 * client.anInt11288; i_136_++) {
			int i_137_ = client.anIntArray11003[i_136_];
			int i_138_ = client.anIntArray11113[i_136_];
			int i_139_ = client.anIntArray11255[i_136_];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_140_ = 0; i_140_ < i_136_; i_140_++) {
					if (2 + i_138_ > client.anIntArray11113[i_140_] - i_135_ && i_138_ - i_135_ < client.anIntArray11113[i_140_] + 2 && i_137_ - i_139_ < (client.anIntArray11003[i_140_] + client.anIntArray11255[i_140_]) && i_139_ + i_137_ > (client.anIntArray11003[i_140_] - client.anIntArray11255[i_140_]) && client.anIntArray11113[i_140_] - i_135_ < i_138_) {
						i_138_ = client.anIntArray11113[i_140_] - i_135_;
						bool = true;
					}
				}
			}
			client.anIntArray11113[i_136_] = i_138_;
			String string = client.aClass533Array11043[i_136_].method8789(-1369391278);
			if (Class665.aClass282_8527.method5111(-1931977534))
				string = Class665.aClass282_8527.method5104(string, 365610681);
			if (client.anInt11159 * 1177221071 == 0) {
				int i_141_ = 16776960;
				int i_142_ = client.aClass533Array11043[i_136_].method8790(1176048571);
				if (i_142_ < 6)
					i_141_ = client.anIntArray11257[i_142_];
				if (i_142_ == 6)
					i_141_ = (client.anInt10981 * -487274901 % 20 < 10 ? 16711680 : 16776960);
				if (7 == i_142_)
					i_141_ = (-487274901 * client.anInt10981 % 20 < 10 ? 255 : 65535);
				if (i_142_ == 8)
					i_141_ = (-487274901 * client.anInt10981 % 20 < 10 ? 45056 : 8454016);
				if (i_142_ == 9) {
					int i_143_ = 150 - (client.aClass533Array11043[i_136_].method8793(-1859929406) * 150 / client.aClass533Array11043[i_136_].method8791(-1863852778));
					if (i_143_ < 50)
						i_141_ = i_143_ * 1280 + 16711680;
					else if (i_143_ < 100)
						i_141_ = 16776960 - (i_143_ - 50) * 327680;
					else if (i_143_ < 150)
						i_141_ = 65280 + 5 * (i_143_ - 100);
				}
				if (10 == i_142_) {
					int i_144_ = 150 - (client.aClass533Array11043[i_136_].method8793(-2122299024) * 150 / client.aClass533Array11043[i_136_].method8791(-1817841964));
					if (i_144_ < 50)
						i_141_ = 16711680 + 5 * i_144_;
					else if (i_144_ < 100)
						i_141_ = 16711935 - (i_144_ - 50) * 327680;
					else if (i_144_ < 150)
						i_141_ = (255 + 327680 * (i_144_ - 100) - (i_144_ - 100) * 5);
				}
				if (11 == i_142_) {
					int i_145_ = 150 - (client.aClass533Array11043[i_136_].method8793(-2103419524) * 150 / client.aClass533Array11043[i_136_].method8791(-2107302278));
					if (i_145_ < 50)
						i_141_ = 16777215 - 327685 * i_145_;
					else if (i_145_ < 100)
						i_141_ = 65280 + 327685 * (i_145_ - 50);
					else if (i_145_ < 150)
						i_141_ = 16777215 - 327680 * (i_145_ - 100);
				}
				int i_146_ = i_141_ | ~0xffffff;
				int i_147_ = client.aClass533Array11043[i_136_].method8788(854388357);
				if (0 == i_147_)
					Class34.aClass164_319.method2624(string, i_137_ + i, i_138_ + i_23_, i_146_, -16777216, 1848995321);
				if (1 == i_147_)
					Class34.aClass164_319.method2599(string, i + i_137_, i_23_ + i_138_, i_146_, -16777216, (client.anInt10981 * -487274901), (byte) -1);
				if (2 == i_147_)
					Class34.aClass164_319.method2600(string, i_137_ + i, i_23_ + i_138_, i_146_, -16777216, (-487274901 * client.anInt10981), -714248281);
				if (i_147_ == 3) {
					int i_148_ = 150 - (client.aClass533Array11043[i_136_].method8793(-2006670273) * 150 / client.aClass533Array11043[i_136_].method8791(-1956556445));
					Class34.aClass164_319.method2601(string, i_137_ + i, i_23_ + i_138_, i_146_, -16777216, (client.anInt10981 * -487274901), i_148_, 36654343);
				}
				if (i_147_ == 4) {
					int i_149_ = 150 - (client.aClass533Array11043[i_136_].method8793(-1915078282) * 150 / client.aClass533Array11043[i_136_].method8791(-1378381801));
					int i_150_ = i_149_ * (Class655.aClass10_8421.method597(string, -1759656773) + 100) / 150;
					Class31.aClass178_303.method3266(i + i_137_ - 50, i_23_, i_137_ + i + 50, i_23_ + i_25_);
					Class34.aClass164_319.method2635(string, i_137_ + i + 50 - i_150_, i_23_ + i_138_, i_146_, -16777216, (byte) 44);
					Class31.aClass178_303.method3378(i, i_23_, i + i_24_, i_25_ + i_23_);
				}
				if (i_147_ == 5) {
					int i_151_ = 150 - (client.aClass533Array11043[i_136_].method8793(-2109932977) * 150 / client.aClass533Array11043[i_136_].method8791(-1987399904));
					int i_152_ = 0;
					if (i_151_ < 25)
						i_152_ = i_151_ - 25;
					else if (i_151_ > 125)
						i_152_ = i_151_ - 125;
					int i_153_ = (-853549931 * Class655.aClass10_8421.anInt80 + Class655.aClass10_8421.anInt76 * -1669009881);
					Class31.aClass178_303.method3266(i, (i_138_ + i_23_ - i_153_ - 1), i + i_24_, 5 + (i_138_ + i_23_));
					Class34.aClass164_319.method2624(string, i + i_137_, i_152_ + (i_23_ + i_138_), i_146_, -16777216, -1811643183);
					Class31.aClass178_303.method3378(i, i_23_, i_24_ + i, i_23_ + i_25_);
				}
			} else
				Class34.aClass164_319.method2624(string, i + i_137_, i_138_ + i_23_, -256, -16777216, 525864911);
		}
	}

	public static boolean method13965(int i, byte i_154_) {
		return i == 0 || i == 14 || 8 == i || i == 6;
	}

	public static void method13966(int i) {
		int i_155_ = client.aClass505_11019.method8292((byte) 70);
		int i_156_ = client.aClass505_11019.method8235(2141795369);
		Class223.aBoolArrayArray2336 = new boolean[i_155_ >> 3][i_156_ >> 3];
	}
}
