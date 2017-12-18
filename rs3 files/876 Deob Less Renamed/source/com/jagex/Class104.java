/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class104 {
	static int anInt1259;
	static final double aDouble1260 = 100.0;
	static boolean aBool1261;
	static int[] anIntArray1262;
	static int[] anIntArray1263;
	static int anInt1264;
	static boolean aBool1265;
	static boolean aBool1266 = false;
	static int[] anIntArray1267;
	static Class708 aClass708_1268;
	public static int anInt1269;
	public static int anInt1270;
	static int[] anIntArray1271;
	static boolean aBool1272;
	static final int anInt1273 = 48;
	static int anInt1274;

	static void method1813(Class178 class178, Class145 class145, Class250 class250, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class239 class239 = (Class239) Class287.aClass53_Sub1_3102.getDefinition(i_3_, (byte) 27);
		if (null != class239 && class239.anIntArray2425 != null && class239.method4314(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, -897287973))
			class239 = class239.method4319(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, -1568573082);
		if (class239 != null && class239.aBool2413 && class239.method4314(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 405785422)) {
			if (null != class239.anIntArray2445) {
				int[] is = new int[class239.anIntArray2445.length];
				for (int i_4_ = 0; i_4_ < is.length / 2; i_4_++) {
					int i_5_;
					if (2097396553 * Class562.anInt7564 == 2)
						i_5_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-921610811) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else if (2097396553 * Class562.anInt7564 == 6)
						i_5_ = (int) client.aFloat11129 & 0x3fff;
					else
						i_5_ = (client.anInt11094 * 724985463 + (int) client.aFloat11129) & 0x3fff;
					int i_6_ = Class433.anIntArray4880[i_5_];
					int i_7_ = Class433.anIntArray4881[i_5_];
					if (6 != Class562.anInt7564 * 2097396553) {
						i_6_ = i_6_ * 256 / (-1193506389 * client.anInt11068 + 256);
						i_7_ = 256 * i_7_ / (256 + client.anInt11068 * -1193506389);
					}
					is[2 * i_4_] = (365308179 * class250.anInt2581 / 2 + i + ((((class239.anIntArray2445[2 * i_4_] * 4 + i_1_) * i_7_) + i_6_ * (i_2_ + 4 * (class239.anIntArray2445[2 * i_4_ + 1]))) >> 14));
					is[1 + 2 * i_4_] = (class250.anInt2543 * -1759297857 / 2 + i_0_ - (((i_7_ * (4 * class239.anIntArray2445[1 + i_4_ * 2] + i_2_)) - (4 * class239.anIntArray2445[i_4_ * 2] + i_1_) * i_6_) >> 14));
				}
				Class236 class236 = class250.method4440(class178, (byte) -54);
				if (null != class236)
					Class182.method3544(class178, is, -868784361 * class239.anInt2431, class236.anIntArray2391, class236.anIntArray2390);
				if (class239.anInt2432 * -873662967 > 0) {
					for (int i_8_ = 0; i_8_ < is.length / 2 - 1; i_8_++) {
						int i_9_ = is[2 * i_8_];
						int i_10_ = is[i_8_ * 2 + 1];
						int i_11_ = is[2 * (1 + i_8_)];
						int i_12_ = is[1 + (i_8_ + 1) * 2];
						if (i_11_ < i_9_) {
							int i_13_ = i_9_;
							int i_14_ = i_10_;
							i_9_ = i_11_;
							i_10_ = i_12_;
							i_11_ = i_13_;
							i_12_ = i_14_;
						} else if (i_9_ == i_11_ && i_12_ < i_10_) {
							int i_15_ = i_10_;
							i_10_ = i_12_;
							i_12_ = i_15_;
						}
						if (null != class145)
							class178.method3092(i_9_, i_10_, i_11_, i_12_, (class239.anIntArray2439[class239.aByteArray2440[i_8_] & 0xff]), 1, class145, i, i_0_, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, 1803020905 * class239.anInt2434);
						else
							class178.method3107(i_9_, i_10_, i_11_, i_12_, (class239.anIntArray2439[class239.aByteArray2440[i_8_] & 0xff]), 1, class239.anInt2432 * -873662967, 788353041 * class239.anInt2433, 1803020905 * class239.anInt2434);
					}
					int i_16_ = is[is.length - 2];
					int i_17_ = is[is.length - 1];
					int i_18_ = is[0];
					int i_19_ = is[1];
					if (i_18_ < i_16_) {
						int i_20_ = i_16_;
						int i_21_ = i_17_;
						i_16_ = i_18_;
						i_17_ = i_19_;
						i_18_ = i_20_;
						i_19_ = i_21_;
					} else if (i_18_ == i_16_ && i_19_ < i_17_) {
						int i_22_ = i_17_;
						i_17_ = i_19_;
						i_19_ = i_22_;
					}
					if (null != class145)
						class178.method3092(i_16_, i_17_, i_18_, i_19_, (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, class145, i, i_0_, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
					else
						class178.method3107(i_16_, i_17_, i_18_, i_19_, (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, -873662967 * class239.anInt2432, class239.anInt2433 * 788353041, 1803020905 * class239.anInt2434);
				} else if (null != class145) {
					for (int i_23_ = 0; i_23_ < is.length / 2 - 1; i_23_++)
						class178.method3090(is[i_23_ * 2], is[i_23_ * 2 + 1], is[(1 + i_23_) * 2], is[2 * (i_23_ + 1) + 1], (class239.anIntArray2439[(class239.aByteArray2440[i_23_] & 0xff)]), 1, class145, i, i_0_);
					class178.method3090(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, class145, i, i_0_);
				} else {
					for (int i_24_ = 0; i_24_ < is.length / 2 - 1; i_24_++)
						class178.method3089(is[i_24_ * 2], is[2 * i_24_ + 1], is[2 * (1 + i_24_)], is[1 + (1 + i_24_) * 2], (class239.anIntArray2439[(class239.aByteArray2440[i_24_] & 0xff)]), 1);
					class178.method3089(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1);
				}
			}
			Class148 class148 = null;
			if (class239.anInt2410 * 924656729 != -1) {
				class148 = class239.method4315(class178, false, 816807300);
				if (class148 != null) {
					int i_25_ = (618060865 * class239.anInt2416 > 0 ? 618060865 * class239.anInt2416 : 69519641 * (Class523_Sub11.aClass625_10427.anInt8141));
					Class691.method13961(class250, class145, i, i_0_, i_1_, i_2_, class148, (double) i_25_, class239.aClass275_2411, class239.aClass273_2438, (byte) -76);
				}
			}
			if (class239.aString2441 != null) {
				int i_26_ = 0;
				if (class148 != null)
					i_26_ = class148.method2428();
				Class164 class164 = Class34.aClass164_318;
				Class10 class10 = Class681.aClass10_8649;
				if (class239.anInt2402 * 933897945 == 1) {
					class164 = Class10.aClass164_83;
					class10 = Class46.aClass10_672;
				}
				if (class239.anInt2402 * 933897945 == 2) {
					class164 = Class34.aClass164_319;
					class10 = Class655.aClass10_8421;
				}
				Class687_Sub11.method16841(class250, class145, i, i_0_, i_1_, i_2_, i_26_, class239.aString2441, class164, class10, 488894273 * class239.anInt2404, -134344575);
			}
		}
	}

	static {
		aBool1261 = false;
		anIntArray1262 = new int[4];
		anInt1259 = 440028073;
		anInt1264 = 0;
		anIntArray1263 = new int[1002];
		anIntArray1271 = new int[1005];
		anIntArray1267 = new int[1005];
		aClass708_1268 = new Class708();
		anInt1269 = 250567387;
		anInt1270 = 1284332517;
		aBool1265 = true;
		aBool1272 = false;
		anInt1274 = 0;
	}

	static void method1814(int i, int i_27_, Class250 class250, Class145 class145, int i_28_, int i_29_) {
		int i_30_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_31_]];
			if (class647_sub1_sub3_sub1_sub2 != null && class647_sub1_sub3_sub1_sub2.method18668(-842882944) && !class647_sub1_sub3_sub1_sub2.visible.method10401(1825412362) && (class647_sub1_sub3_sub1_sub2 != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453) && (class647_sub1_sub3_sub1_sub2.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
				Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
				int i_32_ = (int) class437.aFloat4903 / 128 - i / 128;
				int i_33_ = (int) class437.aFloat4905 / 128 - i_27_ / 128;
				boolean bool = false;
				for (int i_34_ = 0; i_34_ < client.anInt11287 * 1563815891; i_34_++) {
					Class60 class60 = client.aClass60Array11182[i_34_];
					if (class647_sub1_sub3_sub1_sub2.username.equals(class60.aString763) && 0 != 2036106249 * class60.anInt757) {
						bool = true;
						break;
					}
				}
				boolean bool_35_ = false;
				for (int i_36_ = 0; i_36_ < 797304521 * Class365.anInt3866; i_36_++) {
					if (class647_sub1_sub3_sub1_sub2.username.equals(Class99.aClass115Array1232[i_36_].aString1407)) {
						bool_35_ = true;
						break;
					}
				}
				boolean bool_37_ = false;
				if (0 != -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192) && 0 != (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192) && (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192 == -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192)))
					bool_37_ = true;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106 * -1137516987) != -1 && ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) 21))).aBool3308)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[1], 381525486);
				else if (Class210.aClass210_2259 == class647_sub1_sub3_sub1_sub2.aClass210_12200)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[8], 1746956495);
				else if (class647_sub1_sub3_sub1_sub2.aClass210_12200 == Class210.aClass210_2260)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[6], 429826096);
				else if (bool_37_)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[4], 403609346);
				else if (class647_sub1_sub3_sub1_sub2.aBool12202)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[7], 557045956);
				else if (bool)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[3], -196657036);
				else if (bool_35_)
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[5], 31968854);
				else
					Class203.method3705(class250, class145, i_28_, i_29_, i_32_, i_33_, Class501.aClass148Array5584[2], 1108051900);
			}
		}
	}

	public static void method1815() {
		Class523_Sub18_Sub2.aClass148_11619 = null;
		anInt1259 = 440028073;
	}

	static void method1816(Class178 class178, int i, int i_38_, Class250 class250, Class145 class145, int i_39_, int i_40_) {
		for (int i_41_ = 0; i_41_ < client.anInt11050 * 920163749; i_41_++) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) client.anIntArray11051[i_41_]));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.method18627(1730410816) && (class647_sub1_sub3_sub1_sub1.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
					NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
					if (null != class300 && class300.anIntArray3286 != null)
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 45);
					if (null != class300 && class300.aBool3273 && class300.aBool3287) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_42_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_43_ = (int) class437.aFloat4905 / 128 - i_38_ / 128;
						if (-1 != class300.anInt3279 * -287613779)
							Class523_Sub11.method15946(class178, class145, class250, i_39_, i_40_, i_42_, i_43_, (-287613779 * class300.anInt3279), -1025234377);
						else
							Class203.method3705(class250, class145, i_39_, i_40_, i_42_, i_43_, Class501.aClass148Array5584[1], 1337783179);
					}
				}
			}
		}
	}

	static void method1817(Class178 class178, int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -95);
		Interface61 interface61 = (Interface61) class560.method9280(i, i_44_, i_45_, -1503564563);
		if (interface61 != null) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1871978695).getDefinition(interface61.method401(-770473736), (byte) -14)));
			int i_50_ = interface61.method390(1259048815) & 0x3;
			int i_51_ = interface61.method69(947929924);
			if (class602.anInt7890 * 573415481 != -1)
				NPCDefinition.method5515(class178, class602, i_50_, i_46_, i_47_, 309129006);
			else {
				int i_52_ = i_48_;
				if (class602.anInt7874 * -344567467 > 0)
					i_52_ = i_49_;
				if (Class607.aClass607_7974.anInt7982 * 1923531495 == i_51_ || (i_51_ == Class607.aClass607_7965.anInt7982 * 1923531495)) {
					if (i_50_ == 0)
						class178.method3387(i_46_, i_47_, 4, i_52_, 159828926);
					else if (i_50_ == 1)
						class178.method3080(i_46_, i_47_, 4, i_52_, -1120760597);
					else if (2 == i_50_)
						class178.method3387(i_46_ + 3, i_47_, 4, i_52_, 159828926);
					else if (3 == i_50_)
						class178.method3080(i_46_, i_47_ + 3, 4, i_52_, -1347598821);
				}
				if (i_51_ == Class607.aClass607_7966.anInt7982 * 1923531495) {
					if (0 == i_50_)
						class178.method3354(i_46_, i_47_, 1, 1, i_52_, (byte) 117);
					else if (i_50_ == 1)
						class178.method3354(3 + i_46_, i_47_, 1, 1, i_52_, (byte) 34);
					else if (2 == i_50_)
						class178.method3354(3 + i_46_, i_47_ + 3, 1, 1, i_52_, (byte) 35);
					else if (3 == i_50_)
						class178.method3354(i_46_, 3 + i_47_, 1, 1, i_52_, (byte) 75);
				}
				if (i_51_ == 1923531495 * Class607.aClass607_7965.anInt7982) {
					if (i_50_ == 0)
						class178.method3080(i_46_, i_47_, 4, i_52_, -488379287);
					else if (i_50_ == 1)
						class178.method3387(i_46_ + 3, i_47_, 4, i_52_, 159828926);
					else if (i_50_ == 2)
						class178.method3080(i_46_, i_47_ + 3, 4, i_52_, -582422508);
					else if (i_50_ == 3)
						class178.method3387(i_46_, i_47_, 4, i_52_, 159828926);
				}
			}
		}
		interface61 = (Interface61) class560.method9295(i, i_44_, i_45_, client.anInterface63_11296, (byte) -52);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(2096924515).getDefinition(interface61.method401(-770473736), (byte) 84)));
			int i_53_ = interface61.method390(1259048815) & 0x3;
			int i_54_ = interface61.method69(1468264583);
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_53_, i_46_, i_47_, 2018633934);
			else if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_54_) {
				int i_55_ = -1118482;
				if (-344567467 * class602.anInt7874 > 0)
					i_55_ = -1179648;
				if (0 == i_53_ || 2 == i_53_)
					class178.method3381(i_46_, 3 + i_47_, i_46_ + 3, i_47_, i_55_, 1542143079);
				else
					class178.method3381(i_46_, i_47_, i_46_ + 3, i_47_ + 3, i_55_, 1344759739);
			}
		}
		interface61 = (Interface61) class560.method9398(i, i_44_, i_45_, -1216997634);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1419196241).getDefinition(interface61.method401(-770473736), (byte) -2)));
			int i_56_ = interface61.method390(1259048815) & 0x3;
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_56_, i_46_, i_47_, 1603430199);
		}
	}

	static void method1818(Class178 class178, Class250 class250, int i, int i_57_) {
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			class178.method3206();
			Class236 class236 = null;
			Class145 class145 = null;
			if (class250.anInt2534 * 36473529 == 5) {
				class236 = class250.method4440(class178, (byte) -125);
				if (class236 == null)
					return;
				class145 = class236.aClass145_2392;
				if ((365308179 * class250.anInt2581 != 937050569 * class236.anInt2388) || (class250.anInt2543 * -1759297857 != class236.anInt2389 * 177817075))
					throw new IllegalStateException("");
			}
			class178.method3378(i, i_57_, 365308179 * class250.anInt2581 + i, -1759297857 * class250.anInt2543 + i_57_);
			if (2 != 487176641 * anInt1274 && 487176641 * anInt1274 != 5 && Class523_Sub18_Sub2.aClass148_11619 != null) {
				class178.method3069(anIntArray1262);
				class178.method3067();
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_58_;
				int i_59_;
				int i_60_;
				int i_61_;
				if (6 == Class562.anInt7564 * 2097396553) {
					i_58_ = client.anInt11283 * -1500086291;
					i_59_ = 670449253 * client.anInt11102;
					i_60_ = (int) -client.aFloat11129 & 0x3fff;
					i_61_ = 4096;
				} else {
					Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
					i_58_ = (int) class437.aFloat4903;
					i_59_ = (int) class437.aFloat4905;
					if (2097396553 * Class562.anInt7564 == 2)
						i_60_ = ((int) -((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-996657796) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else
						i_60_ = ((int) -client.aFloat11129 + 724985463 * client.anInt11094) & 0x3fff;
					i_61_ = 4096 - -1916233040 * client.anInt11068;
				}
				int i_62_ = i_58_ / 128 + 48;
				int i_63_ = (48 + client.aClass505_11019.method8235(2112707710) * 4 - i_59_ / 128);
				if (null != class145)
					Class523_Sub18_Sub2.aClass148_11619.method2448(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i), ((float) (class250.anInt2543 * -1759297857) / 2.0F + (float) i_57_), (float) i_62_, (float) i_63_, i_61_, i_60_ << 2, class145, i, i_57_);
				else
					Class523_Sub18_Sub2.aClass148_11619.method2455(((float) (365308179 * class250.anInt2581) / 2.0F + (float) i), ((float) i_57_ + (float) (class250.anInt2543 * -1759297857) / 2.0F), (float) i_62_, (float) i_63_, i_61_, i_60_ << 2, 1, -1, 1);
				Class528 class528 = client.aClass505_11019.method8342(-1966893912);
				for (Class523_Sub24 class523_sub24 = ((Class523_Sub24) aClass708_1268.method14240(1226240035)); class523_sub24 != null; class523_sub24 = ((Class523_Sub24) aClass708_1268.method14244((byte) -17))) {
					int i_64_ = -677457577 * class523_sub24.anInt10542;
					int i_65_ = ((class528.anIntArray7098[i_64_] >> 14 & 0x3fff) - class592.localX * 235453015);
					int i_66_ = ((class528.anIntArray7098[i_64_] & 0x3fff) - class592.localY * 1704054549);
					int i_67_ = 4 * i_65_ + 2 - i_58_ / 128;
					int i_68_ = 2 + i_66_ * 4 - i_59_ / 128;
					Class523_Sub11.method15946(class178, class145, class250, i, i_57_, i_67_, i_68_, class528.anIntArray7100[i_64_], -1312995101);
				}
				for (int i_69_ = 0; i_69_ < -752928307 * anInt1264; i_69_++) {
					int i_70_ = anIntArray1263[i_69_] * 4 + 2 - i_58_ / 128;
					int i_71_ = 2 + 4 * anIntArray1271[i_69_] - i_59_ / 128;
					Class602 class602 = ((Class602) client.aClass505_11019.method8244(2061826940).getDefinition(anIntArray1267[i_69_], (byte) -123));
					if (null != class602.anIntArray7912) {
						class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 336533517);
						if (class602 == null || -1296551513 * class602.anInt7906 == -1)
							continue;
					}
					Class523_Sub11.method15946(class178, class145, class250, i, i_57_, i_70_, i_71_, (class602.anInt7906 * -1296551513), -250443883);
				}
				for (Class523_Sub10 class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method735(-380907255)); null != class523_sub10; class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method749(-2120483881))) {
					int i_72_ = (int) ((1055205983951172633L * class523_sub10.aLong7065) >> 28 & 0x3L);
					if (1784706919 * anInt1259 == i_72_) {
						int i_73_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) & 0x3fffL) - class592.localX * 235453015);
						int i_74_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) >> 14 & 0x3fffL) - 1704054549 * class592.localY);
						int i_75_ = 2 + 4 * i_73_ - i_58_ / 128;
						int i_76_ = 2 + 4 * i_74_ - i_59_ / 128;
						Class203.method3705(class250, class145, i, i_57_, i_75_, i_76_, Class501.aClass148Array5584[0], 1582878850);
					}
				}
				Class613.method10055(class178, i_58_, i_59_, class250, class145, i, i_57_, 1797366062);
				Class504.method8226(i_58_, i_59_, class250, class145, i, i_57_, (byte) 65);
				Class689.method13953(i_58_, i_59_, class250, class236, i, i_57_, -1057433846);
				if (Class562.anInt7564 * 2097396553 != 6) {
					if (-1 != anInt1269 * -69669203) {
						int i_77_ = (2 + -278676812 * anInt1269 - i_58_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2147112804) - 1) * 2);
						int i_78_ = (1099585612 * anInt1270 + 2 - i_59_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2146416890) - 1) * 2);
						Class691.method13961(class250, class145, i - Class703.anInt8792 * -1753608587, i_57_ - Class635.anInt8280 * 2025839173, i_77_, i_78_, (Class523_Sub27_Sub14_Sub3.aClass148Array12157[aBool1265 ? 1 : 0]), 100.0, Class275.aClass275_2899, Class273.aClass273_2890, (byte) 48);
					}
					if (!Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.visible.method10401(1357257323))
						class178.method3354(class250.anInt2581 * 365308179 / 2 + i - 1, i_57_ + -1759297857 * class250.anInt2543 / 2 - 1, 3, 3, -1, (byte) 14);
				}
				class178.method3208(anIntArray1262[0], anIntArray1262[1], anIntArray1262[2], anIntArray1262[3]);
			} else if (null != class145)
				class178.method3110(-16777216, class145, i, i_57_);
		}
	}

	public static void method1819() {
		int i = client.aClass505_11019.method8292((byte) 120);
		int i_79_ = client.aClass505_11019.method8235(2139341412);
		Class223.aBoolArrayArray2336 = new boolean[i >> 3][i_79_ >> 3];
	}

	public static void method1820() {
		int i = client.aClass505_11019.method8292((byte) 13);
		int i_80_ = client.aClass505_11019.method8235(2053431662);
		Class223.aBoolArrayArray2336 = new boolean[i >> 3][i_80_ >> 3];
	}

	static void method1821(Class178 class178, int i, int i_81_, Class250 class250, Class145 class145, int i_82_, int i_83_) {
		for (int i_84_ = 0; i_84_ < client.anInt11050 * 920163749; i_84_++) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) client.anIntArray11051[i_84_]));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.method18627(1759417198) && (class647_sub1_sub3_sub1_sub1.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
					NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
					if (null != class300 && class300.anIntArray3286 != null)
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 26);
					if (null != class300 && class300.aBool3273 && class300.aBool3287) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_85_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_86_ = (int) class437.aFloat4905 / 128 - i_81_ / 128;
						if (-1 != class300.anInt3279 * -287613779)
							Class523_Sub11.method15946(class178, class145, class250, i_82_, i_83_, i_85_, i_86_, (-287613779 * class300.anInt3279), -844659435);
						else
							Class203.method3705(class250, class145, i_82_, i_83_, i_85_, i_86_, Class501.aClass148Array5584[1], -1559709453);
					}
				}
			}
		}
	}

	static void method1822(Class178 class178) {
		if ((anInt1259 * 1784706919 != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) && client.aClass505_11019.method8241((byte) -61) != null) {
			Class248.method4401(1516375036);
			if (Class60.method1403(class178, (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821), (byte) -50))
				anInt1259 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821 * -440028073);
		}
	}

	static void method1823(int i) {
		anInt1264 = 0;
		int i_87_ = client.aClass505_11019.method8292((byte) 47);
		int i_88_ = client.aClass505_11019.method8235(2141288529);
		Class451 class451 = client.aClass505_11019.method8243(-578173839);
		Class560 class560 = client.aClass505_11019.method8241((byte) -69);
		Class53_Sub18 class53_sub18 = client.aClass505_11019.method8244(1801212371);
		int i_89_ = i;
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			int i_90_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) >> 3);
			int i_91_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) >> 3);
			if (i_90_ >= 0 && i_90_ < Class223.aBoolArrayArray2336.length && i_91_ >= 0 && i_91_ < Class223.aBoolArrayArray2336[i_90_].length && Class223.aBoolArrayArray2336[i_90_][i_91_])
				i_89_ = 0;
		}
		for (int i_92_ = 0; i_92_ < i_87_; i_92_++) {
			for (int i_93_ = 0; i_93_ < i_88_; i_93_++) {
				for (int i_94_ = i_89_; i_94_ <= i + 1 && i_94_ <= 3; i_94_++) {
					if ((i_94_ < i || class451.method7283(i, i_94_, i_92_, i_93_, 2108698777)) && !(Class257.method4686((Interface61) class560.method9398(i_94_, i_92_, i_93_, -1726887903), class53_sub18, i_92_, i_93_, (byte) -33)) && !(Class257.method4686(((Interface61) class560.method9295(i_94_, i_92_, i_93_, client.anInterface63_11296, (byte) 1)), class53_sub18, i_92_, i_93_, (byte) -105)) && !(Class257.method4686((Interface61) class560.method9280(i_94_, i_92_, i_93_, -1152964215), class53_sub18, i_92_, i_93_, (byte) -99)) && !(Class257.method4686((Interface61) class560.method9284(i_94_, i_92_, i_93_, (byte) 21), class53_sub18, i_92_, i_93_, (byte) -112))) {
						/* empty */
					}
				}
			}
		}
	}

	static void method1824(int i) {
		anInt1264 = 0;
		int i_95_ = client.aClass505_11019.method8292((byte) 28);
		int i_96_ = client.aClass505_11019.method8235(2085414075);
		Class451 class451 = client.aClass505_11019.method8243(890233833);
		Class560 class560 = client.aClass505_11019.method8241((byte) -94);
		Class53_Sub18 class53_sub18 = client.aClass505_11019.method8244(1147260785);
		int i_97_ = i;
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			int i_98_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) >> 3);
			int i_99_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) >> 3);
			if (i_98_ >= 0 && i_98_ < Class223.aBoolArrayArray2336.length && i_99_ >= 0 && i_99_ < Class223.aBoolArrayArray2336[i_98_].length && Class223.aBoolArrayArray2336[i_98_][i_99_])
				i_97_ = 0;
		}
		for (int i_100_ = 0; i_100_ < i_95_; i_100_++) {
			for (int i_101_ = 0; i_101_ < i_96_; i_101_++) {
				for (int i_102_ = i_97_; i_102_ <= i + 1 && i_102_ <= 3; i_102_++) {
					if ((i_102_ < i || class451.method7283(i, i_102_, i_100_, i_101_, 1562194522)) && !(Class257.method4686((Interface61) class560.method9398(i_102_, i_100_, i_101_, -1903939580), class53_sub18, i_100_, i_101_, (byte) -74)) && !(Class257.method4686(((Interface61) class560.method9295(i_102_, i_100_, i_101_, client.anInterface63_11296, (byte) -17)), class53_sub18, i_100_, i_101_, (byte) -84)) && !(Class257.method4686((Interface61) class560.method9280(i_102_, i_100_, i_101_, -847070241), class53_sub18, i_100_, i_101_, (byte) -9)) && !(Class257.method4686((Interface61) class560.method9284(i_102_, i_100_, i_101_, (byte) 22), class53_sub18, i_100_, i_101_, (byte) -107))) {
						/* empty */
					}
				}
			}
		}
	}

	static boolean method1825(Interface61 interface61, Class53_Sub18 class53_sub18, int i, int i_103_) {
		if (interface61 == null)
			return false;
		Class602 class602 = ((Class602) class53_sub18.getDefinition(interface61.method401(-770473736), (byte) -25));
		if (class602.aBool7922 && !client.aBool11157)
			return false;
		int i_104_ = -1296551513 * class602.anInt7906;
		if (null != class602.anIntArray7912) {
			for (int i_105_ = 0; i_105_ < class602.anIntArray7912.length; i_105_++) {
				if (class602.anIntArray7912[i_105_] != -1) {
					Class602 class602_106_ = ((Class602) class53_sub18.getDefinition((class602.anIntArray7912[i_105_]), (byte) 16));
					if (class602_106_.anInt7906 * -1296551513 >= 0)
						i_104_ = class602_106_.anInt7906 * -1296551513;
				}
			}
		}
		if (i_104_ >= 0) {
			anIntArray1267[anInt1264 * -752928307] = class602.anInt7854 * -2005438859;
			anIntArray1263[anInt1264 * -752928307] = i;
			anIntArray1271[anInt1264 * -752928307] = i_103_;
			anInt1264 += -1439147259;
			return true;
		}
		return false;
	}

	static boolean method1826(Interface61 interface61, Class53_Sub18 class53_sub18, int i, int i_107_) {
		if (interface61 == null)
			return false;
		Class602 class602 = ((Class602) class53_sub18.getDefinition(interface61.method401(-770473736), (byte) 36));
		if (class602.aBool7922 && !client.aBool11157)
			return false;
		int i_108_ = -1296551513 * class602.anInt7906;
		if (null != class602.anIntArray7912) {
			for (int i_109_ = 0; i_109_ < class602.anIntArray7912.length; i_109_++) {
				if (class602.anIntArray7912[i_109_] != -1) {
					Class602 class602_110_ = ((Class602) class53_sub18.getDefinition((class602.anIntArray7912[i_109_]), (byte) -10));
					if (class602_110_.anInt7906 * -1296551513 >= 0)
						i_108_ = class602_110_.anInt7906 * -1296551513;
				}
			}
		}
		if (i_108_ >= 0) {
			anIntArray1267[anInt1264 * -752928307] = class602.anInt7854 * -2005438859;
			anIntArray1263[anInt1264 * -752928307] = i;
			anIntArray1271[anInt1264 * -752928307] = i_107_;
			anInt1264 += -1439147259;
			return true;
		}
		return false;
	}

	static boolean method1827(int i, int i_111_, int i_112_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -10);
		boolean bool = true;
		Interface61 interface61 = (Interface61) class560.method9280(i, i_111_, i_112_, 1362978739);
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 62);
		interface61 = (Interface61) class560.method9295(i, i_111_, i_112_, client.anInterface63_11296, (byte) -91);
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 95);
		interface61 = (Interface61) class560.method9398(i, i_111_, i_112_, -2046142735);
		if (interface61 != null)
			bool &= Class226.method4164(interface61, (byte) 10);
		return bool;
	}

	static boolean method1828(int i, int i_113_, int i_114_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -87);
		boolean bool = true;
		Interface61 interface61 = ((Interface61) class560.method9280(i, i_113_, i_114_, -2000563300));
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 118);
		interface61 = (Interface61) class560.method9295(i, i_113_, i_114_, client.anInterface63_11296, (byte) -124);
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 32);
		interface61 = (Interface61) class560.method9398(i, i_113_, i_114_, -1543390185);
		if (interface61 != null)
			bool &= Class226.method4164(interface61, (byte) 86);
		return bool;
	}

	static boolean method1829(int i, int i_115_, int i_116_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -75);
		boolean bool = true;
		Interface61 interface61 = ((Interface61) class560.method9280(i, i_115_, i_116_, -1989408364));
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 114);
		interface61 = (Interface61) class560.method9295(i, i_115_, i_116_, client.anInterface63_11296, (byte) -68);
		if (null != interface61)
			bool &= Class226.method4164(interface61, (byte) 120);
		interface61 = (Interface61) class560.method9398(i, i_115_, i_116_, -1801749681);
		if (interface61 != null)
			bool &= Class226.method4164(interface61, (byte) 33);
		return bool;
	}

	static boolean method1830(Interface61 interface61) {
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(841379250).getDefinition(interface61.method401(-770473736), (byte) -93));
		if (-1 == 573415481 * class602.anInt7890)
			return true;
		Class46 class46 = ((Class46) Class334.aClass53_Sub14_3544.getDefinition(573415481 * class602.anInt7890, (byte) -51));
		if (-1 == -1232695553 * class46.anInt667)
			return true;
		return class46.method1242(-1891570643);
	}

	static void method1831() {
		anInt1274 = 0;
		anInt1259 = 440028073;
		anInt1269 = 250567387;
		anInt1270 = 1284332517;
	}

	static void method1832(Class250 class250, Class236 class236, int i, int i_117_, int i_118_, int i_119_, int i_120_, long l) {
		int i_121_ = i_118_ * i_118_ + i_119_ * i_119_;
		if ((long) i_121_ <= l) {
			int i_122_;
			if (2 == Class562.anInt7564 * 2097396553)
				i_122_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-2058072847) * 2607.5945876176133) + 724985463 * client.anInt11094) & 0x3fff;
			else if (6 == 2097396553 * Class562.anInt7564)
				i_122_ = (int) client.aFloat11129 & 0x3fff;
			else
				i_122_ = (724985463 * client.anInt11094 + (int) client.aFloat11129 & 0x3fff);
			int i_123_ = Class433.anIntArray4880[i_122_];
			int i_124_ = Class433.anIntArray4881[i_122_];
			if (2097396553 * Class562.anInt7564 != 6) {
				i_123_ = i_123_ * 256 / (-1193506389 * client.anInt11068 + 256);
				i_124_ = i_124_ * 256 / (-1193506389 * client.anInt11068 + 256);
			}
			int i_125_ = i_119_ * i_123_ + i_118_ * i_124_ >> 14;
			int i_126_ = i_124_ * i_119_ - i_118_ * i_123_ >> 14;
			Class148 class148 = Class82.aClass148Array872[i_120_];
			int i_127_ = class148.method2504();
			int i_128_ = class148.method2428();
			int i_129_ = i_125_ + 365308179 * class250.anInt2581 / 2 - i_127_ / 2;
			int i_130_ = i_127_ + i_129_;
			int i_131_ = -i_126_ + -1759297857 * class250.anInt2543 / 2 - i_128_;
			int i_132_ = i_131_ + i_128_;
			boolean bool;
			if (class236 != null)
				bool = (!class236.method4283(i_129_, i_131_, -1936051615) || !class236.method4283(i_130_, i_131_, -1408929204) || !class236.method4283(i_129_, i_132_, -51589828) || !class236.method4283(i_130_, i_132_, 876024687));
			else {
				int i_133_ = i_128_;
				int i_134_ = i_127_ / 2;
				bool = (i_131_ <= -i_133_ || i_132_ >= class250.anInt2543 * -1759297857 || i_129_ <= -i_134_ || i_130_ >= class250.anInt2581 * 365308179 + i_134_);
			}
			if (bool) {
				double d = Math.atan2((double) i_125_, (double) i_126_);
				double d_135_ = Math.atan2((double) Math.abs(i_125_), (double) Math.abs(i_126_));
				double d_136_ = Math.atan2((double) (class250.anInt2581 * 365308179 / 2), (double) (class250.anInt2543 * -1759297857 / 2));
				boolean bool_137_ = false;
				double d_138_ = 0.0;
				int i_139_;
				if (d_135_ < d_136_) {
					d_138_ = 1.5707963267948966 - d;
					i_139_ = -1759297857 * class250.anInt2543 / 2;
				} else {
					d_138_ = d;
					i_139_ = class250.anInt2581 * 365308179 / 2;
				}
				int i_140_ = Math.abs((int) -((double) i_139_ * Math.sin(1.5707963267948966) / Math.sin(d_138_)));
				Class194_Sub3.aClass148Array9885[i_120_].method2423(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i + 0.0F), ((float) i_117_ + (float) (-1759297857 * class250.anInt2543) / 2.0F - 0.0F), (float) Class194_Sub3.aClass148Array9885[i_120_].method38() / 2.0F, (float) i_140_, 4096, (int) (-d / 6.283185307179586 * 65535.0));
			} else if (class236 != null)
				class148.method2482(i_129_ + i, i_131_ + i_117_, class236.aClass145_2392, i, i_117_);
			else
				class148.method2435(i + i_129_, i_117_ + i_131_);
		}
	}

	static void method1833(Class178 class178, int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -45);
		Interface61 interface61 = (Interface61) class560.method9280(i, i_141_, i_142_, 974185486);
		if (interface61 != null) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(910577763).getDefinition(interface61.method401(-770473736), (byte) 18)));
			int i_147_ = interface61.method390(1259048815) & 0x3;
			int i_148_ = interface61.method69(1090919530);
			if (class602.anInt7890 * 573415481 != -1)
				NPCDefinition.method5515(class178, class602, i_147_, i_143_, i_144_, 804989535);
			else {
				int i_149_ = i_145_;
				if (class602.anInt7874 * -344567467 > 0)
					i_149_ = i_146_;
				if (Class607.aClass607_7974.anInt7982 * 1923531495 == i_148_ || (i_148_ == Class607.aClass607_7965.anInt7982 * 1923531495)) {
					if (i_147_ == 0)
						class178.method3387(i_143_, i_144_, 4, i_149_, 159828926);
					else if (i_147_ == 1)
						class178.method3080(i_143_, i_144_, 4, i_149_, -162853680);
					else if (2 == i_147_)
						class178.method3387(i_143_ + 3, i_144_, 4, i_149_, 159828926);
					else if (3 == i_147_)
						class178.method3080(i_143_, i_144_ + 3, 4, i_149_, -192154415);
				}
				if (i_148_ == Class607.aClass607_7966.anInt7982 * 1923531495) {
					if (0 == i_147_)
						class178.method3354(i_143_, i_144_, 1, 1, i_149_, (byte) 116);
					else if (i_147_ == 1)
						class178.method3354(3 + i_143_, i_144_, 1, 1, i_149_, (byte) 76);
					else if (2 == i_147_)
						class178.method3354(3 + i_143_, i_144_ + 3, 1, 1, i_149_, (byte) 117);
					else if (3 == i_147_)
						class178.method3354(i_143_, 3 + i_144_, 1, 1, i_149_, (byte) 48);
				}
				if (i_148_ == 1923531495 * Class607.aClass607_7965.anInt7982) {
					if (i_147_ == 0)
						class178.method3080(i_143_, i_144_, 4, i_149_, -844951441);
					else if (i_147_ == 1)
						class178.method3387(i_143_ + 3, i_144_, 4, i_149_, 159828926);
					else if (i_147_ == 2)
						class178.method3080(i_143_, i_144_ + 3, 4, i_149_, -1112013108);
					else if (i_147_ == 3)
						class178.method3387(i_143_, i_144_, 4, i_149_, 159828926);
				}
			}
		}
		interface61 = (Interface61) class560.method9295(i, i_141_, i_142_, client.anInterface63_11296, (byte) -57);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1268366753).getDefinition(interface61.method401(-770473736), (byte) -59)));
			int i_150_ = interface61.method390(1259048815) & 0x3;
			int i_151_ = interface61.method69(697766325);
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_150_, i_143_, i_144_, -691315922);
			else if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_151_) {
				int i_152_ = -1118482;
				if (-344567467 * class602.anInt7874 > 0)
					i_152_ = -1179648;
				if (0 == i_150_ || 2 == i_150_)
					class178.method3381(i_143_, 3 + i_144_, i_143_ + 3, i_144_, i_152_, -692368401);
				else
					class178.method3381(i_143_, i_144_, i_143_ + 3, i_144_ + 3, i_152_, -1772084705);
			}
		}
		interface61 = (Interface61) class560.method9398(i, i_141_, i_142_, -1578365846);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(2051143234).getDefinition(interface61.method401(-770473736), (byte) 21)));
			int i_153_ = interface61.method390(1259048815) & 0x3;
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_153_, i_143_, i_144_, 79066674);
		}
	}

	Class104() throws Throwable {
		throw new Error();
	}

	static void method1834(Class178 class178, int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -91);
		Interface61 interface61 = (Interface61) class560.method9280(i, i_154_, i_155_, -46596109);
		if (interface61 != null) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1147740770).getDefinition(interface61.method401(-770473736), (byte) -85)));
			int i_160_ = interface61.method390(1259048815) & 0x3;
			int i_161_ = interface61.method69(1353747140);
			if (class602.anInt7890 * 573415481 != -1)
				NPCDefinition.method5515(class178, class602, i_160_, i_156_, i_157_, 954762027);
			else {
				int i_162_ = i_158_;
				if (class602.anInt7874 * -344567467 > 0)
					i_162_ = i_159_;
				if (Class607.aClass607_7974.anInt7982 * 1923531495 == i_161_ || (i_161_ == Class607.aClass607_7965.anInt7982 * 1923531495)) {
					if (i_160_ == 0)
						class178.method3387(i_156_, i_157_, 4, i_162_, 159828926);
					else if (i_160_ == 1)
						class178.method3080(i_156_, i_157_, 4, i_162_, -1831621305);
					else if (2 == i_160_)
						class178.method3387(i_156_ + 3, i_157_, 4, i_162_, 159828926);
					else if (3 == i_160_)
						class178.method3080(i_156_, i_157_ + 3, 4, i_162_, 438688126);
				}
				if (i_161_ == Class607.aClass607_7966.anInt7982 * 1923531495) {
					if (0 == i_160_)
						class178.method3354(i_156_, i_157_, 1, 1, i_162_, (byte) 87);
					else if (i_160_ == 1)
						class178.method3354(3 + i_156_, i_157_, 1, 1, i_162_, (byte) 105);
					else if (2 == i_160_)
						class178.method3354(3 + i_156_, i_157_ + 3, 1, 1, i_162_, (byte) 39);
					else if (3 == i_160_)
						class178.method3354(i_156_, 3 + i_157_, 1, 1, i_162_, (byte) 11);
				}
				if (i_161_ == 1923531495 * Class607.aClass607_7965.anInt7982) {
					if (i_160_ == 0)
						class178.method3080(i_156_, i_157_, 4, i_162_, -1216893376);
					else if (i_160_ == 1)
						class178.method3387(i_156_ + 3, i_157_, 4, i_162_, 159828926);
					else if (i_160_ == 2)
						class178.method3080(i_156_, i_157_ + 3, 4, i_162_, -509443370);
					else if (i_160_ == 3)
						class178.method3387(i_156_, i_157_, 4, i_162_, 159828926);
				}
			}
		}
		interface61 = (Interface61) class560.method9295(i, i_154_, i_155_, client.anInterface63_11296, (byte) -12);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(827557824).getDefinition(interface61.method401(-770473736), (byte) 16)));
			int i_163_ = interface61.method390(1259048815) & 0x3;
			int i_164_ = interface61.method69(174032888);
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_163_, i_156_, i_157_, -1124332846);
			else if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_164_) {
				int i_165_ = -1118482;
				if (-344567467 * class602.anInt7874 > 0)
					i_165_ = -1179648;
				if (0 == i_163_ || 2 == i_163_)
					class178.method3381(i_156_, 3 + i_157_, i_156_ + 3, i_157_, i_165_, 1947786406);
				else
					class178.method3381(i_156_, i_157_, i_156_ + 3, i_157_ + 3, i_165_, -516239994);
			}
		}
		interface61 = (Interface61) class560.method9398(i, i_154_, i_155_, -1379096384);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(892927089).getDefinition(interface61.method401(-770473736), (byte) 31)));
			int i_166_ = interface61.method390(1259048815) & 0x3;
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_166_, i_156_, i_157_, 1160433883);
		}
	}

	static void method1835(Class178 class178, Class250 class250, int i, int i_167_) {
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			class178.method3206();
			Class236 class236 = null;
			Class145 class145 = null;
			if (class250.anInt2534 * 36473529 == 5) {
				class236 = class250.method4440(class178, (byte) -53);
				if (class236 == null)
					return;
				class145 = class236.aClass145_2392;
				if ((365308179 * class250.anInt2581 != 937050569 * class236.anInt2388) || (class250.anInt2543 * -1759297857 != class236.anInt2389 * 177817075))
					throw new IllegalStateException("");
			}
			class178.method3378(i, i_167_, 365308179 * class250.anInt2581 + i, -1759297857 * class250.anInt2543 + i_167_);
			if (2 != 487176641 * anInt1274 && 487176641 * anInt1274 != 5 && Class523_Sub18_Sub2.aClass148_11619 != null) {
				class178.method3069(anIntArray1262);
				class178.method3067();
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_168_;
				int i_169_;
				int i_170_;
				int i_171_;
				if (6 == Class562.anInt7564 * 2097396553) {
					i_168_ = client.anInt11283 * -1500086291;
					i_169_ = 670449253 * client.anInt11102;
					i_170_ = (int) -client.aFloat11129 & 0x3fff;
					i_171_ = 4096;
				} else {
					Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
					i_168_ = (int) class437.aFloat4903;
					i_169_ = (int) class437.aFloat4905;
					if (2097396553 * Class562.anInt7564 == 2)
						i_170_ = ((int) -((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-2127743899) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else
						i_170_ = ((int) -client.aFloat11129 + 724985463 * client.anInt11094) & 0x3fff;
					i_171_ = 4096 - -1916233040 * client.anInt11068;
				}
				int i_172_ = i_168_ / 128 + 48;
				int i_173_ = (48 + client.aClass505_11019.method8235(2102245485) * 4 - i_169_ / 128);
				if (null != class145)
					Class523_Sub18_Sub2.aClass148_11619.method2448(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i), ((float) (class250.anInt2543 * -1759297857) / 2.0F + (float) i_167_), (float) i_172_, (float) i_173_, i_171_, i_170_ << 2, class145, i, i_167_);
				else
					Class523_Sub18_Sub2.aClass148_11619.method2455(((float) (365308179 * class250.anInt2581) / 2.0F + (float) i), ((float) i_167_ + (float) (class250.anInt2543 * -1759297857) / 2.0F), (float) i_172_, (float) i_173_, i_171_, i_170_ << 2, 1, -1, 1);
				Class528 class528 = client.aClass505_11019.method8342(-1864266332);
				for (Class523_Sub24 class523_sub24 = ((Class523_Sub24) aClass708_1268.method14240(1827647666)); class523_sub24 != null; class523_sub24 = ((Class523_Sub24) aClass708_1268.method14244((byte) 64))) {
					int i_174_ = -677457577 * class523_sub24.anInt10542;
					int i_175_ = ((class528.anIntArray7098[i_174_] >> 14 & 0x3fff) - class592.localX * 235453015);
					int i_176_ = ((class528.anIntArray7098[i_174_] & 0x3fff) - class592.localY * 1704054549);
					int i_177_ = 4 * i_175_ + 2 - i_168_ / 128;
					int i_178_ = 2 + i_176_ * 4 - i_169_ / 128;
					Class523_Sub11.method15946(class178, class145, class250, i, i_167_, i_177_, i_178_, class528.anIntArray7100[i_174_], -163659048);
				}
				for (int i_179_ = 0; i_179_ < -752928307 * anInt1264; i_179_++) {
					int i_180_ = anIntArray1263[i_179_] * 4 + 2 - i_168_ / 128;
					int i_181_ = 2 + 4 * anIntArray1271[i_179_] - i_169_ / 128;
					Class602 class602 = ((Class602) client.aClass505_11019.method8244(1394884781).getDefinition(anIntArray1267[i_179_], (byte) -21));
					if (null != class602.anIntArray7912) {
						class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 753749202);
						if (class602 == null || -1296551513 * class602.anInt7906 == -1)
							continue;
					}
					Class523_Sub11.method15946(class178, class145, class250, i, i_167_, i_180_, i_181_, (class602.anInt7906 * -1296551513), -475703139);
				}
				for (Class523_Sub10 class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method735(-380907255)); null != class523_sub10; class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method749(1642258898))) {
					int i_182_ = (int) ((1055205983951172633L * class523_sub10.aLong7065) >> 28 & 0x3L);
					if (1784706919 * anInt1259 == i_182_) {
						int i_183_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) & 0x3fffL) - class592.localX * 235453015);
						int i_184_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) >> 14 & 0x3fffL) - 1704054549 * class592.localY);
						int i_185_ = 2 + 4 * i_183_ - i_168_ / 128;
						int i_186_ = 2 + 4 * i_184_ - i_169_ / 128;
						Class203.method3705(class250, class145, i, i_167_, i_185_, i_186_, Class501.aClass148Array5584[0], 2112288907);
					}
				}
				Class613.method10055(class178, i_168_, i_169_, class250, class145, i, i_167_, -1033593753);
				Class504.method8226(i_168_, i_169_, class250, class145, i, i_167_, (byte) 64);
				Class689.method13953(i_168_, i_169_, class250, class236, i, i_167_, -1903621272);
				if (Class562.anInt7564 * 2097396553 != 6) {
					if (-1 != anInt1269 * -69669203) {
						int i_187_ = (2 + -278676812 * anInt1269 - i_168_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2144581044) - 1) * 2);
						int i_188_ = (1099585612 * anInt1270 + 2 - i_169_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2144318918) - 1) * 2);
						Class691.method13961(class250, class145, i - Class703.anInt8792 * -1753608587, i_167_ - Class635.anInt8280 * 2025839173, i_187_, i_188_, (Class523_Sub27_Sub14_Sub3.aClass148Array12157[aBool1265 ? 1 : 0]), 100.0, Class275.aClass275_2899, Class273.aClass273_2890, (byte) 59);
					}
					if (!Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.visible.method10401(1755972228))
						class178.method3354(class250.anInt2581 * 365308179 / 2 + i - 1, i_167_ + -1759297857 * class250.anInt2543 / 2 - 1, 3, 3, -1, (byte) 105);
				}
				class178.method3208(anIntArray1262[0], anIntArray1262[1], anIntArray1262[2], anIntArray1262[3]);
			} else if (null != class145)
				class178.method3110(-16777216, class145, i, i_167_);
		}
	}

	static void method1836(int i, int i_189_, Class250 class250, Class236 class236, int i_190_, int i_191_) {
		Class111[] class111s = client.aClass111Array11017;
		for (int i_192_ = 0; i_192_ < class111s.length; i_192_++) {
			Class111 class111 = class111s[i_192_];
			if (null != class111 && class111.anInt1334 * 239678453 != 0 && client.anInt11011 % 20 < 10) {
				if (239678453 * class111.anInt1334 == 1) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (class111.anInt1336 * 920515165))));
					if (class523_sub28 != null) {
						Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_193_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_194_ = (int) class437.aFloat4905 / 128 - i_189_ / 128;
						Class251.method4528(class250, class236, i_190_, i_191_, i_193_, i_194_, 309561833 * class111.anInt1344, 360000L);
					}
				}
				if (class111.anInt1334 * 239678453 == 2) {
					int i_195_ = 1757546743 * class111.anInt1338 / 128 - i / 128;
					int i_196_ = 1490265041 * class111.anInt1339 / 128 - i_189_ / 128;
					long l = (long) (class111.anInt1342 * -1510348621 << 7);
					l *= l;
					Class251.method4528(class250, class236, i_190_, i_191_, i_195_, i_196_, class111.anInt1344 * 309561833, l);
				}
				if (239678453 * class111.anInt1334 == 10 && class111.anInt1336 * 920515165 >= 0 && (920515165 * class111.anInt1336 < (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153).length)) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[class111.anInt1336 * 920515165]);
					if (class647_sub1_sub3_sub1_sub2 != null) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
						int i_197_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_198_ = (int) class437.aFloat4905 / 128 - i_189_ / 128;
						Class251.method4528(class250, class236, i_190_, i_191_, i_197_, i_198_, 309561833 * class111.anInt1344, 360000L);
					}
				}
			}
		}
	}

	static void method1837(Class178 class178, Class250 class250, int i, int i_199_) {
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			class178.method3206();
			Class236 class236 = null;
			Class145 class145 = null;
			if (class250.anInt2534 * 36473529 == 5) {
				class236 = class250.method4440(class178, (byte) -63);
				if (class236 == null)
					return;
				class145 = class236.aClass145_2392;
				if ((365308179 * class250.anInt2581 != 937050569 * class236.anInt2388) || (class250.anInt2543 * -1759297857 != class236.anInt2389 * 177817075))
					throw new IllegalStateException("");
			}
			class178.method3378(i, i_199_, 365308179 * class250.anInt2581 + i, -1759297857 * class250.anInt2543 + i_199_);
			if (2 != 487176641 * anInt1274 && 487176641 * anInt1274 != 5 && Class523_Sub18_Sub2.aClass148_11619 != null) {
				class178.method3069(anIntArray1262);
				class178.method3067();
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_200_;
				int i_201_;
				int i_202_;
				int i_203_;
				if (6 == Class562.anInt7564 * 2097396553) {
					i_200_ = client.anInt11283 * -1500086291;
					i_201_ = 670449253 * client.anInt11102;
					i_202_ = (int) -client.aFloat11129 & 0x3fff;
					i_203_ = 4096;
				} else {
					Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
					i_200_ = (int) class437.aFloat4903;
					i_201_ = (int) class437.aFloat4905;
					if (2097396553 * Class562.anInt7564 == 2)
						i_202_ = ((int) -((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-980288284) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else
						i_202_ = ((int) -client.aFloat11129 + 724985463 * client.anInt11094) & 0x3fff;
					i_203_ = 4096 - -1916233040 * client.anInt11068;
				}
				int i_204_ = i_200_ / 128 + 48;
				int i_205_ = (48 + client.aClass505_11019.method8235(2083334304) * 4 - i_201_ / 128);
				if (null != class145)
					Class523_Sub18_Sub2.aClass148_11619.method2448(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i), ((float) (class250.anInt2543 * -1759297857) / 2.0F + (float) i_199_), (float) i_204_, (float) i_205_, i_203_, i_202_ << 2, class145, i, i_199_);
				else
					Class523_Sub18_Sub2.aClass148_11619.method2455(((float) (365308179 * class250.anInt2581) / 2.0F + (float) i), ((float) i_199_ + (float) (class250.anInt2543 * -1759297857) / 2.0F), (float) i_204_, (float) i_205_, i_203_, i_202_ << 2, 1, -1, 1);
				Class528 class528 = client.aClass505_11019.method8342(-1863005401);
				for (Class523_Sub24 class523_sub24 = ((Class523_Sub24) aClass708_1268.method14240(1939801472)); class523_sub24 != null; class523_sub24 = ((Class523_Sub24) aClass708_1268.method14244((byte) -106))) {
					int i_206_ = -677457577 * class523_sub24.anInt10542;
					int i_207_ = ((class528.anIntArray7098[i_206_] >> 14 & 0x3fff) - class592.localX * 235453015);
					int i_208_ = ((class528.anIntArray7098[i_206_] & 0x3fff) - class592.localY * 1704054549);
					int i_209_ = 4 * i_207_ + 2 - i_200_ / 128;
					int i_210_ = 2 + i_208_ * 4 - i_201_ / 128;
					Class523_Sub11.method15946(class178, class145, class250, i, i_199_, i_209_, i_210_, class528.anIntArray7100[i_206_], -1377453962);
				}
				for (int i_211_ = 0; i_211_ < -752928307 * anInt1264; i_211_++) {
					int i_212_ = anIntArray1263[i_211_] * 4 + 2 - i_200_ / 128;
					int i_213_ = 2 + 4 * anIntArray1271[i_211_] - i_201_ / 128;
					Class602 class602 = ((Class602) client.aClass505_11019.method8244(1608205165).getDefinition(anIntArray1267[i_211_], (byte) 33));
					if (null != class602.anIntArray7912) {
						class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 787307041);
						if (class602 == null || -1296551513 * class602.anInt7906 == -1)
							continue;
					}
					Class523_Sub11.method15946(class178, class145, class250, i, i_199_, i_212_, i_213_, (class602.anInt7906 * -1296551513), -653858216);
				}
				for (Class523_Sub10 class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method735(-380907255)); null != class523_sub10; class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method749(2124800702))) {
					int i_214_ = (int) ((1055205983951172633L * class523_sub10.aLong7065) >> 28 & 0x3L);
					if (1784706919 * anInt1259 == i_214_) {
						int i_215_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) & 0x3fffL) - class592.localX * 235453015);
						int i_216_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) >> 14 & 0x3fffL) - 1704054549 * class592.localY);
						int i_217_ = 2 + 4 * i_215_ - i_200_ / 128;
						int i_218_ = 2 + 4 * i_216_ - i_201_ / 128;
						Class203.method3705(class250, class145, i, i_199_, i_217_, i_218_, Class501.aClass148Array5584[0], -137219021);
					}
				}
				Class613.method10055(class178, i_200_, i_201_, class250, class145, i, i_199_, -1955325378);
				Class504.method8226(i_200_, i_201_, class250, class145, i, i_199_, (byte) 84);
				Class689.method13953(i_200_, i_201_, class250, class236, i, i_199_, -433567668);
				if (Class562.anInt7564 * 2097396553 != 6) {
					if (-1 != anInt1269 * -69669203) {
						int i_219_ = (2 + -278676812 * anInt1269 - i_200_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2146789753) - 1) * 2);
						int i_220_ = (1099585612 * anInt1270 + 2 - i_201_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2144935780) - 1) * 2);
						Class691.method13961(class250, class145, i - Class703.anInt8792 * -1753608587, i_199_ - Class635.anInt8280 * 2025839173, i_219_, i_220_, (Class523_Sub27_Sub14_Sub3.aClass148Array12157[aBool1265 ? 1 : 0]), 100.0, Class275.aClass275_2899, Class273.aClass273_2890, (byte) -59);
					}
					if (!Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.visible.method10401(1127844177))
						class178.method3354(class250.anInt2581 * 365308179 / 2 + i - 1, i_199_ + -1759297857 * class250.anInt2543 / 2 - 1, 3, 3, -1, (byte) 102);
				}
				class178.method3208(anIntArray1262[0], anIntArray1262[1], anIntArray1262[2], anIntArray1262[3]);
			} else if (null != class145)
				class178.method3110(-16777216, class145, i, i_199_);
		}
	}

	static void method1838(Class178 class178, Class250 class250, int i, int i_221_) {
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			class178.method3206();
			Class236 class236 = null;
			Class145 class145 = null;
			if (class250.anInt2534 * 36473529 == 5) {
				class236 = class250.method4440(class178, (byte) -14);
				if (class236 == null)
					return;
				class145 = class236.aClass145_2392;
				if ((365308179 * class250.anInt2581 != 937050569 * class236.anInt2388) || (class250.anInt2543 * -1759297857 != class236.anInt2389 * 177817075))
					throw new IllegalStateException("");
			}
			class178.method3378(i, i_221_, 365308179 * class250.anInt2581 + i, -1759297857 * class250.anInt2543 + i_221_);
			if (2 != 487176641 * anInt1274 && 487176641 * anInt1274 != 5 && Class523_Sub18_Sub2.aClass148_11619 != null) {
				class178.method3069(anIntArray1262);
				class178.method3067();
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_222_;
				int i_223_;
				int i_224_;
				int i_225_;
				if (6 == Class562.anInt7564 * 2097396553) {
					i_222_ = client.anInt11283 * -1500086291;
					i_223_ = 670449253 * client.anInt11102;
					i_224_ = (int) -client.aFloat11129 & 0x3fff;
					i_225_ = 4096;
				} else {
					Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
					i_222_ = (int) class437.aFloat4903;
					i_223_ = (int) class437.aFloat4905;
					if (2097396553 * Class562.anInt7564 == 2)
						i_224_ = ((int) -((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1494187807) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else
						i_224_ = ((int) -client.aFloat11129 + 724985463 * client.anInt11094) & 0x3fff;
					i_225_ = 4096 - -1916233040 * client.anInt11068;
				}
				int i_226_ = i_222_ / 128 + 48;
				int i_227_ = (48 + client.aClass505_11019.method8235(2112165618) * 4 - i_223_ / 128);
				if (null != class145)
					Class523_Sub18_Sub2.aClass148_11619.method2448(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i), ((float) (class250.anInt2543 * -1759297857) / 2.0F + (float) i_221_), (float) i_226_, (float) i_227_, i_225_, i_224_ << 2, class145, i, i_221_);
				else
					Class523_Sub18_Sub2.aClass148_11619.method2455(((float) (365308179 * class250.anInt2581) / 2.0F + (float) i), ((float) i_221_ + (float) (class250.anInt2543 * -1759297857) / 2.0F), (float) i_226_, (float) i_227_, i_225_, i_224_ << 2, 1, -1, 1);
				Class528 class528 = client.aClass505_11019.method8342(-2139075488);
				for (Class523_Sub24 class523_sub24 = ((Class523_Sub24) aClass708_1268.method14240(2045344495)); class523_sub24 != null; class523_sub24 = ((Class523_Sub24) aClass708_1268.method14244((byte) 87))) {
					int i_228_ = -677457577 * class523_sub24.anInt10542;
					int i_229_ = ((class528.anIntArray7098[i_228_] >> 14 & 0x3fff) - class592.localX * 235453015);
					int i_230_ = ((class528.anIntArray7098[i_228_] & 0x3fff) - class592.localY * 1704054549);
					int i_231_ = 4 * i_229_ + 2 - i_222_ / 128;
					int i_232_ = 2 + i_230_ * 4 - i_223_ / 128;
					Class523_Sub11.method15946(class178, class145, class250, i, i_221_, i_231_, i_232_, class528.anIntArray7100[i_228_], -1693706656);
				}
				for (int i_233_ = 0; i_233_ < -752928307 * anInt1264; i_233_++) {
					int i_234_ = anIntArray1263[i_233_] * 4 + 2 - i_222_ / 128;
					int i_235_ = 2 + 4 * anIntArray1271[i_233_] - i_223_ / 128;
					Class602 class602 = ((Class602) client.aClass505_11019.method8244(1055164822).getDefinition(anIntArray1267[i_233_], (byte) 78));
					if (null != class602.anIntArray7912) {
						class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 988024954);
						if (class602 == null || -1296551513 * class602.anInt7906 == -1)
							continue;
					}
					Class523_Sub11.method15946(class178, class145, class250, i, i_221_, i_234_, i_235_, (class602.anInt7906 * -1296551513), -137367895);
				}
				for (Class523_Sub10 class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method735(-380907255)); null != class523_sub10; class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method749(824865487))) {
					int i_236_ = (int) ((1055205983951172633L * class523_sub10.aLong7065) >> 28 & 0x3L);
					if (1784706919 * anInt1259 == i_236_) {
						int i_237_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) & 0x3fffL) - class592.localX * 235453015);
						int i_238_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) >> 14 & 0x3fffL) - 1704054549 * class592.localY);
						int i_239_ = 2 + 4 * i_237_ - i_222_ / 128;
						int i_240_ = 2 + 4 * i_238_ - i_223_ / 128;
						Class203.method3705(class250, class145, i, i_221_, i_239_, i_240_, Class501.aClass148Array5584[0], 1595073984);
					}
				}
				Class613.method10055(class178, i_222_, i_223_, class250, class145, i, i_221_, -1017530600);
				Class504.method8226(i_222_, i_223_, class250, class145, i, i_221_, (byte) 114);
				Class689.method13953(i_222_, i_223_, class250, class236, i, i_221_, -763197952);
				if (Class562.anInt7564 * 2097396553 != 6) {
					if (-1 != anInt1269 * -69669203) {
						int i_241_ = (2 + -278676812 * anInt1269 - i_222_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2146223545) - 1) * 2);
						int i_242_ = (1099585612 * anInt1270 + 2 - i_223_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2141244042) - 1) * 2);
						Class691.method13961(class250, class145, i - Class703.anInt8792 * -1753608587, i_221_ - Class635.anInt8280 * 2025839173, i_241_, i_242_, (Class523_Sub27_Sub14_Sub3.aClass148Array12157[aBool1265 ? 1 : 0]), 100.0, Class275.aClass275_2899, Class273.aClass273_2890, (byte) 83);
					}
					if (!Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.visible.method10401(1847807566))
						class178.method3354(class250.anInt2581 * 365308179 / 2 + i - 1, i_221_ + -1759297857 * class250.anInt2543 / 2 - 1, 3, 3, -1, (byte) 119);
				}
				class178.method3208(anIntArray1262[0], anIntArray1262[1], anIntArray1262[2], anIntArray1262[3]);
			} else if (null != class145)
				class178.method3110(-16777216, class145, i, i_221_);
		}
	}

	static void method1839(Class178 class178, Class250 class250, int i, int i_243_) {
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			class178.method3206();
			Class236 class236 = null;
			Class145 class145 = null;
			if (class250.anInt2534 * 36473529 == 5) {
				class236 = class250.method4440(class178, (byte) -107);
				if (class236 == null)
					return;
				class145 = class236.aClass145_2392;
				if ((365308179 * class250.anInt2581 != 937050569 * class236.anInt2388) || (class250.anInt2543 * -1759297857 != class236.anInt2389 * 177817075))
					throw new IllegalStateException("");
			}
			class178.method3378(i, i_243_, 365308179 * class250.anInt2581 + i, -1759297857 * class250.anInt2543 + i_243_);
			if (2 != 487176641 * anInt1274 && 487176641 * anInt1274 != 5 && Class523_Sub18_Sub2.aClass148_11619 != null) {
				class178.method3069(anIntArray1262);
				class178.method3067();
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_244_;
				int i_245_;
				int i_246_;
				int i_247_;
				if (6 == Class562.anInt7564 * 2097396553) {
					i_244_ = client.anInt11283 * -1500086291;
					i_245_ = 670449253 * client.anInt11102;
					i_246_ = (int) -client.aFloat11129 & 0x3fff;
					i_247_ = 4096;
				} else {
					Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
					i_244_ = (int) class437.aFloat4903;
					i_245_ = (int) class437.aFloat4905;
					if (2097396553 * Class562.anInt7564 == 2)
						i_246_ = ((int) -((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1435078427) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else
						i_246_ = ((int) -client.aFloat11129 + 724985463 * client.anInt11094) & 0x3fff;
					i_247_ = 4096 - -1916233040 * client.anInt11068;
				}
				int i_248_ = i_244_ / 128 + 48;
				int i_249_ = (48 + client.aClass505_11019.method8235(2110047185) * 4 - i_245_ / 128);
				if (null != class145)
					Class523_Sub18_Sub2.aClass148_11619.method2448(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i), ((float) (class250.anInt2543 * -1759297857) / 2.0F + (float) i_243_), (float) i_248_, (float) i_249_, i_247_, i_246_ << 2, class145, i, i_243_);
				else
					Class523_Sub18_Sub2.aClass148_11619.method2455(((float) (365308179 * class250.anInt2581) / 2.0F + (float) i), ((float) i_243_ + (float) (class250.anInt2543 * -1759297857) / 2.0F), (float) i_248_, (float) i_249_, i_247_, i_246_ << 2, 1, -1, 1);
				Class528 class528 = client.aClass505_11019.method8342(-1875488895);
				for (Class523_Sub24 class523_sub24 = ((Class523_Sub24) aClass708_1268.method14240(672104372)); class523_sub24 != null; class523_sub24 = ((Class523_Sub24) aClass708_1268.method14244((byte) 39))) {
					int i_250_ = -677457577 * class523_sub24.anInt10542;
					int i_251_ = ((class528.anIntArray7098[i_250_] >> 14 & 0x3fff) - class592.localX * 235453015);
					int i_252_ = ((class528.anIntArray7098[i_250_] & 0x3fff) - class592.localY * 1704054549);
					int i_253_ = 4 * i_251_ + 2 - i_244_ / 128;
					int i_254_ = 2 + i_252_ * 4 - i_245_ / 128;
					Class523_Sub11.method15946(class178, class145, class250, i, i_243_, i_253_, i_254_, class528.anIntArray7100[i_250_], -1432951022);
				}
				for (int i_255_ = 0; i_255_ < -752928307 * anInt1264; i_255_++) {
					int i_256_ = anIntArray1263[i_255_] * 4 + 2 - i_244_ / 128;
					int i_257_ = 2 + 4 * anIntArray1271[i_255_] - i_245_ / 128;
					Class602 class602 = ((Class602) client.aClass505_11019.method8244(994104583).getDefinition(anIntArray1267[i_255_], (byte) -59));
					if (null != class602.anIntArray7912) {
						class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 939876034);
						if (class602 == null || -1296551513 * class602.anInt7906 == -1)
							continue;
					}
					Class523_Sub11.method15946(class178, class145, class250, i, i_243_, i_256_, i_257_, (class602.anInt7906 * -1296551513), -866706383);
				}
				for (Class523_Sub10 class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method735(-380907255)); null != class523_sub10; class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method749(955413956))) {
					int i_258_ = (int) ((1055205983951172633L * class523_sub10.aLong7065) >> 28 & 0x3L);
					if (1784706919 * anInt1259 == i_258_) {
						int i_259_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) & 0x3fffL) - class592.localX * 235453015);
						int i_260_ = ((int) ((class523_sub10.aLong7065 * 1055205983951172633L) >> 14 & 0x3fffL) - 1704054549 * class592.localY);
						int i_261_ = 2 + 4 * i_259_ - i_244_ / 128;
						int i_262_ = 2 + 4 * i_260_ - i_245_ / 128;
						Class203.method3705(class250, class145, i, i_243_, i_261_, i_262_, Class501.aClass148Array5584[0], 79043102);
					}
				}
				Class613.method10055(class178, i_244_, i_245_, class250, class145, i, i_243_, 1524645222);
				Class504.method8226(i_244_, i_245_, class250, class145, i, i_243_, (byte) 88);
				Class689.method13953(i_244_, i_245_, class250, class236, i, i_243_, -1306453540);
				if (Class562.anInt7564 * 2097396553 != 6) {
					if (-1 != anInt1269 * -69669203) {
						int i_263_ = (2 + -278676812 * anInt1269 - i_244_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2140723290) - 1) * 2);
						int i_264_ = (1099585612 * anInt1270 + 2 - i_245_ / 128 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2144814013) - 1) * 2);
						Class691.method13961(class250, class145, i - Class703.anInt8792 * -1753608587, i_243_ - Class635.anInt8280 * 2025839173, i_263_, i_264_, (Class523_Sub27_Sub14_Sub3.aClass148Array12157[aBool1265 ? 1 : 0]), 100.0, Class275.aClass275_2899, Class273.aClass273_2890, (byte) 31);
					}
					if (!Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.visible.method10401(2027511097))
						class178.method3354(class250.anInt2581 * 365308179 / 2 + i - 1, i_243_ + -1759297857 * class250.anInt2543 / 2 - 1, 3, 3, -1, (byte) 14);
				}
				class178.method3208(anIntArray1262[0], anIntArray1262[1], anIntArray1262[2], anIntArray1262[3]);
			} else if (null != class145)
				class178.method3110(-16777216, class145, i, i_243_);
		}
	}

	static boolean method1840(Interface61 interface61) {
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(1785269056).getDefinition(interface61.method401(-770473736), (byte) -32));
		if (-1 == 573415481 * class602.anInt7890)
			return true;
		Class46 class46 = ((Class46) Class334.aClass53_Sub14_3544.getDefinition(573415481 * class602.anInt7890, (byte) -19));
		if (-1 == -1232695553 * class46.anInt667)
			return true;
		return class46.method1242(-1891570643);
	}

	static void method1841(Class178 class178, int i, int i_265_, Class250 class250, Class145 class145, int i_266_, int i_267_) {
		for (int i_268_ = 0; i_268_ < client.anInt11050 * 920163749; i_268_++) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) client.anIntArray11051[i_268_]));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.method18627(1785890063) && (class647_sub1_sub3_sub1_sub1.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
					NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
					if (null != class300 && class300.anIntArray3286 != null)
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) -87);
					if (null != class300 && class300.aBool3273 && class300.aBool3287) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_269_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_270_ = (int) class437.aFloat4905 / 128 - i_265_ / 128;
						if (-1 != class300.anInt3279 * -287613779)
							Class523_Sub11.method15946(class178, class145, class250, i_266_, i_267_, i_269_, i_270_, (-287613779 * class300.anInt3279), -1078924161);
						else
							Class203.method3705(class250, class145, i_266_, i_267_, i_269_, i_270_, Class501.aClass148Array5584[1], 558561542);
					}
				}
			}
		}
	}

	static void method1842(Class250 class250, Class145 class145, int i, int i_271_, int i_272_, int i_273_, int i_274_, String string, Class164 class164, Class10 class10, int i_275_) {
		int i_276_;
		if (2 == Class562.anInt7564 * 2097396553)
			i_276_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1295661143) * 2607.5945876176133) + client.anInt11094 * 724985463 & 0x3fff);
		else if (6 == Class562.anInt7564 * 2097396553)
			i_276_ = (int) client.aFloat11129 & 0x3fff;
		else
			i_276_ = ((int) client.aFloat11129 + 724985463 * client.anInt11094 & 0x3fff);
		int i_277_ = (Math.max(365308179 * class250.anInt2581 / 2, -1759297857 * class250.anInt2543 / 2) + 10);
		int i_278_ = i_273_ * i_273_ + i_272_ * i_272_;
		if (i_278_ <= i_277_ * i_277_) {
			int i_279_ = Class433.anIntArray4880[i_276_];
			int i_280_ = Class433.anIntArray4881[i_276_];
			if (6 != 2097396553 * Class562.anInt7564) {
				i_279_ = i_279_ * 256 / (256 + -1193506389 * client.anInt11068);
				i_280_ = i_280_ * 256 / (256 + -1193506389 * client.anInt11068);
			}
			int i_281_ = i_273_ * i_279_ + i_272_ * i_280_ >> 14;
			int i_282_ = i_280_ * i_273_ - i_279_ * i_272_ >> 14;
			int i_283_ = class10.method602(string, 100, null, 1101597784);
			int i_284_ = class10.method605(string, 100, 0, null, 630942782);
			i_281_ -= i_283_ / 2;
			if (i_281_ >= -(class250.anInt2581 * 365308179) && i_281_ <= class250.anInt2581 * 365308179 && i_282_ >= -(-1759297857 * class250.anInt2543) && i_282_ <= -1759297857 * class250.anInt2543)
				class164.method2628(string, (class250.anInt2581 * 365308179 / 2 + (i_281_ + i)), (i_271_ + -1759297857 * class250.anInt2543 / 2 - i_282_ - i_274_ - i_284_), i_283_, 50, i_275_, 0, 1, 0, 0, null, null, class145, i, i_271_, -1189213667);
		}
	}

	static void method1843(Class178 class178, int i, int i_285_, Class250 class250, Class145 class145, int i_286_, int i_287_) {
		for (int i_288_ = 0; i_288_ < client.anInt11050 * 920163749; i_288_++) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) client.anIntArray11051[i_288_]));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.method18627(1775721524) && (class647_sub1_sub3_sub1_sub1.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
					NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
					if (null != class300 && class300.anIntArray3286 != null)
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) -36);
					if (null != class300 && class300.aBool3273 && class300.aBool3287) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_289_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_290_ = (int) class437.aFloat4905 / 128 - i_285_ / 128;
						if (-1 != class300.anInt3279 * -287613779)
							Class523_Sub11.method15946(class178, class145, class250, i_286_, i_287_, i_289_, i_290_, (-287613779 * class300.anInt3279), -1326015462);
						else
							Class203.method3705(class250, class145, i_286_, i_287_, i_289_, i_290_, Class501.aClass148Array5584[1], 1949074384);
					}
				}
			}
		}
	}

	static void method1844(Class178 class178, int i, int i_291_, Class250 class250, Class145 class145, int i_292_, int i_293_) {
		for (int i_294_ = 0; i_294_ < client.anInt11050 * 920163749; i_294_++) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) client.anIntArray11051[i_294_]));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.method18627(1249512577) && (class647_sub1_sub3_sub1_sub1.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
					NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
					if (null != class300 && class300.anIntArray3286 != null)
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 31);
					if (null != class300 && class300.aBool3273 && class300.aBool3287) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_295_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_296_ = (int) class437.aFloat4905 / 128 - i_291_ / 128;
						if (-1 != class300.anInt3279 * -287613779)
							Class523_Sub11.method15946(class178, class145, class250, i_292_, i_293_, i_295_, i_296_, (-287613779 * class300.anInt3279), -1587199900);
						else
							Class203.method3705(class250, class145, i_292_, i_293_, i_295_, i_296_, Class501.aClass148Array5584[1], 1070125869);
					}
				}
			}
		}
	}

	static void method1845(int i, int i_297_, Class250 class250, Class145 class145, int i_298_, int i_299_) {
		int i_300_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		for (int i_301_ = 0; i_301_ < i_300_; i_301_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_301_]];
			if (class647_sub1_sub3_sub1_sub2 != null && class647_sub1_sub3_sub1_sub2.method18668(-842882944) && !class647_sub1_sub3_sub1_sub2.visible.method10401(659534069) && (class647_sub1_sub3_sub1_sub2 != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453) && (class647_sub1_sub3_sub1_sub2.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
				Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
				int i_302_ = (int) class437.aFloat4903 / 128 - i / 128;
				int i_303_ = (int) class437.aFloat4905 / 128 - i_297_ / 128;
				boolean bool = false;
				for (int i_304_ = 0; i_304_ < client.anInt11287 * 1563815891; i_304_++) {
					Class60 class60 = client.aClass60Array11182[i_304_];
					if (class647_sub1_sub3_sub1_sub2.username.equals(class60.aString763) && 0 != 2036106249 * class60.anInt757) {
						bool = true;
						break;
					}
				}
				boolean bool_305_ = false;
				for (int i_306_ = 0; i_306_ < 797304521 * Class365.anInt3866; i_306_++) {
					if (class647_sub1_sub3_sub1_sub2.username.equals(Class99.aClass115Array1232[i_306_].aString1407)) {
						bool_305_ = true;
						break;
					}
				}
				boolean bool_307_ = false;
				if (0 != -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192) && 0 != (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192) && (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192 == -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192)))
					bool_307_ = true;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106 * -1137516987) != -1 && ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) -10))).aBool3308)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[1], -32064301);
				else if (Class210.aClass210_2259 == class647_sub1_sub3_sub1_sub2.aClass210_12200)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[8], 1931465151);
				else if (class647_sub1_sub3_sub1_sub2.aClass210_12200 == Class210.aClass210_2260)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[6], -1387281124);
				else if (bool_307_)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[4], -744294972);
				else if (class647_sub1_sub3_sub1_sub2.aBool12202)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[7], -1841145524);
				else if (bool)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[3], -1017071211);
				else if (bool_305_)
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[5], -1805319569);
				else
					Class203.method3705(class250, class145, i_298_, i_299_, i_302_, i_303_, Class501.aClass148Array5584[2], 348655809);
			}
		}
	}

	public static void method1846() {
		int i = client.aClass505_11019.method8292((byte) 6);
		int i_308_ = client.aClass505_11019.method8235(2065943868);
		Class223.aBoolArrayArray2336 = new boolean[i >> 3][i_308_ >> 3];
	}

	static void method1847(int i, int i_309_, Class250 class250, Class145 class145, int i_310_, int i_311_) {
		int i_312_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		for (int i_313_ = 0; i_313_ < i_312_; i_313_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_313_]];
			if (class647_sub1_sub3_sub1_sub2 != null && class647_sub1_sub3_sub1_sub2.method18668(-842882944) && !class647_sub1_sub3_sub1_sub2.visible.method10401(461443142) && (class647_sub1_sub3_sub1_sub2 != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453) && (class647_sub1_sub3_sub1_sub2.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
				Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
				int i_314_ = (int) class437.aFloat4903 / 128 - i / 128;
				int i_315_ = (int) class437.aFloat4905 / 128 - i_309_ / 128;
				boolean bool = false;
				for (int i_316_ = 0; i_316_ < client.anInt11287 * 1563815891; i_316_++) {
					Class60 class60 = client.aClass60Array11182[i_316_];
					if (class647_sub1_sub3_sub1_sub2.username.equals(class60.aString763) && 0 != 2036106249 * class60.anInt757) {
						bool = true;
						break;
					}
				}
				boolean bool_317_ = false;
				for (int i_318_ = 0; i_318_ < 797304521 * Class365.anInt3866; i_318_++) {
					if (class647_sub1_sub3_sub1_sub2.username.equals(Class99.aClass115Array1232[i_318_].aString1407)) {
						bool_317_ = true;
						break;
					}
				}
				boolean bool_319_ = false;
				if (0 != -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192) && 0 != (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192) && (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192 == -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192)))
					bool_319_ = true;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106 * -1137516987) != -1 && ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) -36))).aBool3308)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[1], 2027188445);
				else if (Class210.aClass210_2259 == class647_sub1_sub3_sub1_sub2.aClass210_12200)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[8], 1322034456);
				else if (class647_sub1_sub3_sub1_sub2.aClass210_12200 == Class210.aClass210_2260)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[6], -1600240551);
				else if (bool_319_)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[4], -311087624);
				else if (class647_sub1_sub3_sub1_sub2.aBool12202)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[7], 229251478);
				else if (bool)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[3], 2039182470);
				else if (bool_317_)
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[5], -245446787);
				else
					Class203.method3705(class250, class145, i_310_, i_311_, i_314_, i_315_, Class501.aClass148Array5584[2], -1476178525);
			}
		}
	}

	static void method1848(int i, int i_320_, Class250 class250, Class145 class145, int i_321_, int i_322_) {
		int i_323_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		for (int i_324_ = 0; i_324_ < i_323_; i_324_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_324_]];
			if (class647_sub1_sub3_sub1_sub2 != null && class647_sub1_sub3_sub1_sub2.method18668(-842882944) && !class647_sub1_sub3_sub1_sub2.visible.method10401(625920488) && (class647_sub1_sub3_sub1_sub2 != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453) && (class647_sub1_sub3_sub1_sub2.aByte10821 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821))) {
				Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
				int i_325_ = (int) class437.aFloat4903 / 128 - i / 128;
				int i_326_ = (int) class437.aFloat4905 / 128 - i_320_ / 128;
				boolean bool = false;
				for (int i_327_ = 0; i_327_ < client.anInt11287 * 1563815891; i_327_++) {
					Class60 class60 = client.aClass60Array11182[i_327_];
					if (class647_sub1_sub3_sub1_sub2.username.equals(class60.aString763) && 0 != 2036106249 * class60.anInt757) {
						bool = true;
						break;
					}
				}
				boolean bool_328_ = false;
				for (int i_329_ = 0; i_329_ < 797304521 * Class365.anInt3866; i_329_++) {
					if (class647_sub1_sub3_sub1_sub2.username.equals(Class99.aClass115Array1232[i_329_].aString1407)) {
						bool_328_ = true;
						break;
					}
				}
				boolean bool_330_ = false;
				if (0 != -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192) && 0 != (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192) && (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192 == -514698785 * (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt12192)))
					bool_330_ = true;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106 * -1137516987) != -1 && ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) 68))).aBool3308)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[1], -395787426);
				else if (Class210.aClass210_2259 == class647_sub1_sub3_sub1_sub2.aClass210_12200)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[8], 220577521);
				else if (class647_sub1_sub3_sub1_sub2.aClass210_12200 == Class210.aClass210_2260)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[6], -1661707999);
				else if (bool_330_)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[4], 1975874622);
				else if (class647_sub1_sub3_sub1_sub2.aBool12202)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[7], -1914632479);
				else if (bool)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[3], -88458864);
				else if (bool_328_)
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[5], -1829553756);
				else
					Class203.method3705(class250, class145, i_321_, i_322_, i_325_, i_326_, Class501.aClass148Array5584[2], 1428653786);
			}
		}
	}

	public static void method1849() {
		Class523_Sub18_Sub2.aClass148_11619 = null;
		anInt1259 = 440028073;
	}

	static void method1850(Class178 class178, Class145 class145, Class250 class250, int i, int i_331_, int i_332_, int i_333_, int i_334_) {
		Class239 class239 = ((Class239) Class287.aClass53_Sub1_3102.getDefinition(i_334_, (byte) 32));
		if (null != class239 && class239.anIntArray2425 != null && class239.method4314(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, -509848120))
			class239 = class239.method4319(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, -188047085);
		if (class239 != null && class239.aBool2413 && class239.method4314(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 1567591422)) {
			if (null != class239.anIntArray2445) {
				int[] is = new int[class239.anIntArray2445.length];
				for (int i_335_ = 0; i_335_ < is.length / 2; i_335_++) {
					int i_336_;
					if (2097396553 * Class562.anInt7564 == 2)
						i_336_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1493273075) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else if (2097396553 * Class562.anInt7564 == 6)
						i_336_ = (int) client.aFloat11129 & 0x3fff;
					else
						i_336_ = (client.anInt11094 * 724985463 + (int) client.aFloat11129) & 0x3fff;
					int i_337_ = Class433.anIntArray4880[i_336_];
					int i_338_ = Class433.anIntArray4881[i_336_];
					if (6 != Class562.anInt7564 * 2097396553) {
						i_337_ = i_337_ * 256 / (-1193506389 * client.anInt11068 + 256);
						i_338_ = (256 * i_338_ / (256 + client.anInt11068 * -1193506389));
					}
					is[2 * i_335_] = (365308179 * class250.anInt2581 / 2 + i + (((class239.anIntArray2445[2 * i_335_] * 4 + i_332_) * i_338_ + i_337_ * (i_333_ + 4 * (class239.anIntArray2445[2 * i_335_ + 1]))) >> 14));
					is[1 + 2 * i_335_] = (class250.anInt2543 * -1759297857 / 2 + i_331_ - (((i_338_ * (4 * class239.anIntArray2445[1 + i_335_ * 2] + i_333_)) - (4 * class239.anIntArray2445[i_335_ * 2] + i_332_) * i_337_) >> 14));
				}
				Class236 class236 = class250.method4440(class178, (byte) -62);
				if (null != class236)
					Class182.method3544(class178, is, -868784361 * class239.anInt2431, class236.anIntArray2391, class236.anIntArray2390);
				if (class239.anInt2432 * -873662967 > 0) {
					for (int i_339_ = 0; i_339_ < is.length / 2 - 1; i_339_++) {
						int i_340_ = is[2 * i_339_];
						int i_341_ = is[i_339_ * 2 + 1];
						int i_342_ = is[2 * (1 + i_339_)];
						int i_343_ = is[1 + (i_339_ + 1) * 2];
						if (i_342_ < i_340_) {
							int i_344_ = i_340_;
							int i_345_ = i_341_;
							i_340_ = i_342_;
							i_341_ = i_343_;
							i_342_ = i_344_;
							i_343_ = i_345_;
						} else if (i_340_ == i_342_ && i_343_ < i_341_) {
							int i_346_ = i_341_;
							i_341_ = i_343_;
							i_343_ = i_346_;
						}
						if (null != class145)
							class178.method3092(i_340_, i_341_, i_342_, i_343_, (class239.anIntArray2439[class239.aByteArray2440[i_339_] & 0xff]), 1, class145, i, i_331_, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, 1803020905 * class239.anInt2434);
						else
							class178.method3107(i_340_, i_341_, i_342_, i_343_, (class239.anIntArray2439[class239.aByteArray2440[i_339_] & 0xff]), 1, class239.anInt2432 * -873662967, 788353041 * class239.anInt2433, 1803020905 * class239.anInt2434);
					}
					int i_347_ = is[is.length - 2];
					int i_348_ = is[is.length - 1];
					int i_349_ = is[0];
					int i_350_ = is[1];
					if (i_349_ < i_347_) {
						int i_351_ = i_347_;
						int i_352_ = i_348_;
						i_347_ = i_349_;
						i_348_ = i_350_;
						i_349_ = i_351_;
						i_350_ = i_352_;
					} else if (i_349_ == i_347_ && i_350_ < i_348_) {
						int i_353_ = i_348_;
						i_348_ = i_350_;
						i_350_ = i_353_;
					}
					if (null != class145)
						class178.method3092(i_347_, i_348_, i_349_, i_350_, (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, class145, i, i_331_, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
					else
						class178.method3107(i_347_, i_348_, i_349_, i_350_, (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, -873662967 * class239.anInt2432, class239.anInt2433 * 788353041, 1803020905 * class239.anInt2434);
				} else if (null != class145) {
					for (int i_354_ = 0; i_354_ < is.length / 2 - 1; i_354_++)
						class178.method3090(is[i_354_ * 2], is[i_354_ * 2 + 1], is[(1 + i_354_) * 2], is[2 * (i_354_ + 1) + 1], (class239.anIntArray2439[(class239.aByteArray2440[i_354_] & 0xff)]), 1, class145, i, i_331_);
					class178.method3090(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, class145, i, i_331_);
				} else {
					for (int i_355_ = 0; i_355_ < is.length / 2 - 1; i_355_++)
						class178.method3089(is[i_355_ * 2], is[2 * i_355_ + 1], is[2 * (1 + i_355_)], is[1 + (1 + i_355_) * 2], (class239.anIntArray2439[(class239.aByteArray2440[i_355_] & 0xff)]), 1);
					class178.method3089(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1);
				}
			}
			Class148 class148 = null;
			if (class239.anInt2410 * 924656729 != -1) {
				class148 = class239.method4315(class178, false, 91125152);
				if (class148 != null) {
					int i_356_ = (618060865 * class239.anInt2416 > 0 ? 618060865 * class239.anInt2416 : 69519641 * (Class523_Sub11.aClass625_10427.anInt8141));
					Class691.method13961(class250, class145, i, i_331_, i_332_, i_333_, class148, (double) i_356_, class239.aClass275_2411, class239.aClass273_2438, (byte) -30);
				}
			}
			if (class239.aString2441 != null) {
				int i_357_ = 0;
				if (class148 != null)
					i_357_ = class148.method2428();
				Class164 class164 = Class34.aClass164_318;
				Class10 class10 = Class681.aClass10_8649;
				if (class239.anInt2402 * 933897945 == 1) {
					class164 = Class10.aClass164_83;
					class10 = Class46.aClass10_672;
				}
				if (class239.anInt2402 * 933897945 == 2) {
					class164 = Class34.aClass164_319;
					class10 = Class655.aClass10_8421;
				}
				Class687_Sub11.method16841(class250, class145, i, i_331_, i_332_, i_333_, i_357_, class239.aString2441, class164, class10, 488894273 * class239.anInt2404, -63240535);
			}
		}
	}

	static void method1851(Class250 class250, Class236 class236, int i, int i_358_, int i_359_, int i_360_, int i_361_, long l) {
		int i_362_ = i_359_ * i_359_ + i_360_ * i_360_;
		if ((long) i_362_ <= l) {
			int i_363_;
			if (2 == Class562.anInt7564 * 2097396553)
				i_363_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1588238790) * 2607.5945876176133) + 724985463 * client.anInt11094) & 0x3fff;
			else if (6 == 2097396553 * Class562.anInt7564)
				i_363_ = (int) client.aFloat11129 & 0x3fff;
			else
				i_363_ = (724985463 * client.anInt11094 + (int) client.aFloat11129 & 0x3fff);
			int i_364_ = Class433.anIntArray4880[i_363_];
			int i_365_ = Class433.anIntArray4881[i_363_];
			if (2097396553 * Class562.anInt7564 != 6) {
				i_364_ = i_364_ * 256 / (-1193506389 * client.anInt11068 + 256);
				i_365_ = i_365_ * 256 / (-1193506389 * client.anInt11068 + 256);
			}
			int i_366_ = i_360_ * i_364_ + i_359_ * i_365_ >> 14;
			int i_367_ = i_365_ * i_360_ - i_359_ * i_364_ >> 14;
			Class148 class148 = Class82.aClass148Array872[i_361_];
			int i_368_ = class148.method2504();
			int i_369_ = class148.method2428();
			int i_370_ = i_366_ + 365308179 * class250.anInt2581 / 2 - i_368_ / 2;
			int i_371_ = i_368_ + i_370_;
			int i_372_ = -i_367_ + -1759297857 * class250.anInt2543 / 2 - i_369_;
			int i_373_ = i_372_ + i_369_;
			boolean bool;
			if (class236 != null)
				bool = (!class236.method4283(i_370_, i_372_, 1697106550) || !class236.method4283(i_371_, i_372_, 527708061) || !class236.method4283(i_370_, i_373_, -1092023477) || !class236.method4283(i_371_, i_373_, -383752431));
			else {
				int i_374_ = i_369_;
				int i_375_ = i_368_ / 2;
				bool = (i_372_ <= -i_374_ || i_373_ >= class250.anInt2543 * -1759297857 || i_370_ <= -i_375_ || i_371_ >= class250.anInt2581 * 365308179 + i_375_);
			}
			if (bool) {
				double d = Math.atan2((double) i_366_, (double) i_367_);
				double d_376_ = Math.atan2((double) Math.abs(i_366_), (double) Math.abs(i_367_));
				double d_377_ = Math.atan2((double) (class250.anInt2581 * 365308179 / 2), (double) (class250.anInt2543 * -1759297857 / 2));
				boolean bool_378_ = false;
				double d_379_ = 0.0;
				int i_380_;
				if (d_376_ < d_377_) {
					d_379_ = 1.5707963267948966 - d;
					i_380_ = -1759297857 * class250.anInt2543 / 2;
				} else {
					d_379_ = d;
					i_380_ = class250.anInt2581 * 365308179 / 2;
				}
				int i_381_ = Math.abs((int) -((double) i_380_ * Math.sin(1.5707963267948966) / Math.sin(d_379_)));
				Class194_Sub3.aClass148Array9885[i_361_].method2423(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i + 0.0F), ((float) i_358_ + (float) (-1759297857 * class250.anInt2543) / 2.0F - 0.0F), (float) Class194_Sub3.aClass148Array9885[i_361_].method38() / 2.0F, (float) i_381_, 4096, (int) (-d / 6.283185307179586 * 65535.0));
			} else if (class236 != null)
				class148.method2482(i_370_ + i, i_372_ + i_358_, class236.aClass145_2392, i, i_358_);
			else
				class148.method2435(i + i_370_, i_358_ + i_372_);
		}
	}

	static void method1852(Class250 class250, Class236 class236, int i, int i_382_, int i_383_, int i_384_, int i_385_, long l) {
		int i_386_ = i_383_ * i_383_ + i_384_ * i_384_;
		if ((long) i_386_ <= l) {
			int i_387_;
			if (2 == Class562.anInt7564 * 2097396553)
				i_387_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1735526904) * 2607.5945876176133) + 724985463 * client.anInt11094) & 0x3fff;
			else if (6 == 2097396553 * Class562.anInt7564)
				i_387_ = (int) client.aFloat11129 & 0x3fff;
			else
				i_387_ = (724985463 * client.anInt11094 + (int) client.aFloat11129 & 0x3fff);
			int i_388_ = Class433.anIntArray4880[i_387_];
			int i_389_ = Class433.anIntArray4881[i_387_];
			if (2097396553 * Class562.anInt7564 != 6) {
				i_388_ = i_388_ * 256 / (-1193506389 * client.anInt11068 + 256);
				i_389_ = i_389_ * 256 / (-1193506389 * client.anInt11068 + 256);
			}
			int i_390_ = i_384_ * i_388_ + i_383_ * i_389_ >> 14;
			int i_391_ = i_389_ * i_384_ - i_383_ * i_388_ >> 14;
			Class148 class148 = Class82.aClass148Array872[i_385_];
			int i_392_ = class148.method2504();
			int i_393_ = class148.method2428();
			int i_394_ = i_390_ + 365308179 * class250.anInt2581 / 2 - i_392_ / 2;
			int i_395_ = i_392_ + i_394_;
			int i_396_ = -i_391_ + -1759297857 * class250.anInt2543 / 2 - i_393_;
			int i_397_ = i_396_ + i_393_;
			boolean bool;
			if (class236 != null)
				bool = (!class236.method4283(i_394_, i_396_, 1311531188) || !class236.method4283(i_395_, i_396_, 1182048075) || !class236.method4283(i_394_, i_397_, 921586214) || !class236.method4283(i_395_, i_397_, -392515432));
			else {
				int i_398_ = i_393_;
				int i_399_ = i_392_ / 2;
				bool = (i_396_ <= -i_398_ || i_397_ >= class250.anInt2543 * -1759297857 || i_394_ <= -i_399_ || i_395_ >= class250.anInt2581 * 365308179 + i_399_);
			}
			if (bool) {
				double d = Math.atan2((double) i_390_, (double) i_391_);
				double d_400_ = Math.atan2((double) Math.abs(i_390_), (double) Math.abs(i_391_));
				double d_401_ = Math.atan2((double) (class250.anInt2581 * 365308179 / 2), (double) (class250.anInt2543 * -1759297857 / 2));
				boolean bool_402_ = false;
				double d_403_ = 0.0;
				int i_404_;
				if (d_400_ < d_401_) {
					d_403_ = 1.5707963267948966 - d;
					i_404_ = -1759297857 * class250.anInt2543 / 2;
				} else {
					d_403_ = d;
					i_404_ = class250.anInt2581 * 365308179 / 2;
				}
				int i_405_ = Math.abs((int) -((double) i_404_ * Math.sin(1.5707963267948966) / Math.sin(d_403_)));
				Class194_Sub3.aClass148Array9885[i_385_].method2423(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i + 0.0F), ((float) i_382_ + (float) (-1759297857 * class250.anInt2543) / 2.0F - 0.0F), (float) Class194_Sub3.aClass148Array9885[i_385_].method38() / 2.0F, (float) i_405_, 4096, (int) (-d / 6.283185307179586 * 65535.0));
			} else if (class236 != null)
				class148.method2482(i_394_ + i, i_396_ + i_382_, class236.aClass145_2392, i, i_382_);
			else
				class148.method2435(i + i_394_, i_382_ + i_396_);
		}
	}

	public static void method1853() {
		anInt1259 = 440028073;
	}

	public static void method1854() {
		anInt1259 = 440028073;
	}

	static void method1855(Class250 class250, Class236 class236, int i, int i_406_, int i_407_, int i_408_, int i_409_, long l) {
		int i_410_ = i_407_ * i_407_ + i_408_ * i_408_;
		if ((long) i_410_ <= l) {
			int i_411_;
			if (2 == Class562.anInt7564 * 2097396553)
				i_411_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1553601365) * 2607.5945876176133) + 724985463 * client.anInt11094) & 0x3fff;
			else if (6 == 2097396553 * Class562.anInt7564)
				i_411_ = (int) client.aFloat11129 & 0x3fff;
			else
				i_411_ = (724985463 * client.anInt11094 + (int) client.aFloat11129 & 0x3fff);
			int i_412_ = Class433.anIntArray4880[i_411_];
			int i_413_ = Class433.anIntArray4881[i_411_];
			if (2097396553 * Class562.anInt7564 != 6) {
				i_412_ = i_412_ * 256 / (-1193506389 * client.anInt11068 + 256);
				i_413_ = i_413_ * 256 / (-1193506389 * client.anInt11068 + 256);
			}
			int i_414_ = i_408_ * i_412_ + i_407_ * i_413_ >> 14;
			int i_415_ = i_413_ * i_408_ - i_407_ * i_412_ >> 14;
			Class148 class148 = Class82.aClass148Array872[i_409_];
			int i_416_ = class148.method2504();
			int i_417_ = class148.method2428();
			int i_418_ = i_414_ + 365308179 * class250.anInt2581 / 2 - i_416_ / 2;
			int i_419_ = i_416_ + i_418_;
			int i_420_ = -i_415_ + -1759297857 * class250.anInt2543 / 2 - i_417_;
			int i_421_ = i_420_ + i_417_;
			boolean bool;
			if (class236 != null)
				bool = (!class236.method4283(i_418_, i_420_, -602562309) || !class236.method4283(i_419_, i_420_, -518887494) || !class236.method4283(i_418_, i_421_, -961797020) || !class236.method4283(i_419_, i_421_, -968526010));
			else {
				int i_422_ = i_417_;
				int i_423_ = i_416_ / 2;
				bool = (i_420_ <= -i_422_ || i_421_ >= class250.anInt2543 * -1759297857 || i_418_ <= -i_423_ || i_419_ >= class250.anInt2581 * 365308179 + i_423_);
			}
			if (bool) {
				double d = Math.atan2((double) i_414_, (double) i_415_);
				double d_424_ = Math.atan2((double) Math.abs(i_414_), (double) Math.abs(i_415_));
				double d_425_ = Math.atan2((double) (class250.anInt2581 * 365308179 / 2), (double) (class250.anInt2543 * -1759297857 / 2));
				boolean bool_426_ = false;
				double d_427_ = 0.0;
				int i_428_;
				if (d_424_ < d_425_) {
					d_427_ = 1.5707963267948966 - d;
					i_428_ = -1759297857 * class250.anInt2543 / 2;
				} else {
					d_427_ = d;
					i_428_ = class250.anInt2581 * 365308179 / 2;
				}
				int i_429_ = Math.abs((int) -((double) i_428_ * Math.sin(1.5707963267948966) / Math.sin(d_427_)));
				Class194_Sub3.aClass148Array9885[i_409_].method2423(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i + 0.0F), ((float) i_406_ + (float) (-1759297857 * class250.anInt2543) / 2.0F - 0.0F), (float) Class194_Sub3.aClass148Array9885[i_409_].method38() / 2.0F, (float) i_429_, 4096, (int) (-d / 6.283185307179586 * 65535.0));
			} else if (class236 != null)
				class148.method2482(i_418_ + i, i_420_ + i_406_, class236.aClass145_2392, i, i_406_);
			else
				class148.method2435(i + i_418_, i_406_ + i_420_);
		}
	}

	static void method1856(Class250 class250, Class145 class145, int i, int i_430_, int i_431_, int i_432_, int i_433_, String string, Class164 class164, Class10 class10, int i_434_) {
		int i_435_;
		if (2 == Class562.anInt7564 * 2097396553)
			i_435_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1171503664) * 2607.5945876176133) + client.anInt11094 * 724985463 & 0x3fff);
		else if (6 == Class562.anInt7564 * 2097396553)
			i_435_ = (int) client.aFloat11129 & 0x3fff;
		else
			i_435_ = ((int) client.aFloat11129 + 724985463 * client.anInt11094 & 0x3fff);
		int i_436_ = (Math.max(365308179 * class250.anInt2581 / 2, -1759297857 * class250.anInt2543 / 2) + 10);
		int i_437_ = i_432_ * i_432_ + i_431_ * i_431_;
		if (i_437_ <= i_436_ * i_436_) {
			int i_438_ = Class433.anIntArray4880[i_435_];
			int i_439_ = Class433.anIntArray4881[i_435_];
			if (6 != 2097396553 * Class562.anInt7564) {
				i_438_ = i_438_ * 256 / (256 + -1193506389 * client.anInt11068);
				i_439_ = i_439_ * 256 / (256 + -1193506389 * client.anInt11068);
			}
			int i_440_ = i_432_ * i_438_ + i_431_ * i_439_ >> 14;
			int i_441_ = i_439_ * i_432_ - i_438_ * i_431_ >> 14;
			int i_442_ = class10.method602(string, 100, null, 2119245525);
			int i_443_ = class10.method605(string, 100, 0, null, -2019048952);
			i_440_ -= i_442_ / 2;
			if (i_440_ >= -(class250.anInt2581 * 365308179) && i_440_ <= class250.anInt2581 * 365308179 && i_441_ >= -(-1759297857 * class250.anInt2543) && i_441_ <= -1759297857 * class250.anInt2543)
				class164.method2628(string, (class250.anInt2581 * 365308179 / 2 + (i_440_ + i)), (i_430_ + -1759297857 * class250.anInt2543 / 2 - i_441_ - i_433_ - i_443_), i_442_, 50, i_434_, 0, 1, 0, 0, null, null, class145, i, i_430_, -1575858150);
		}
	}

	static void method1857(Class178 class178, int i, int i_444_, int i_445_, int i_446_, int i_447_, int i_448_, int i_449_) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -67);
		Interface61 interface61 = (Interface61) class560.method9280(i, i_444_, i_445_, -816539562);
		if (interface61 != null) {
			Class602 class602 = ((Class602) client.aClass505_11019.method8244(1581067086).getDefinition(interface61.method401(-770473736), (byte) 2));
			int i_450_ = interface61.method390(1259048815) & 0x3;
			int i_451_ = interface61.method69(2118800529);
			if (class602.anInt7890 * 573415481 != -1)
				NPCDefinition.method5515(class178, class602, i_450_, i_446_, i_447_, 1082716150);
			else {
				int i_452_ = i_448_;
				if (class602.anInt7874 * -344567467 > 0)
					i_452_ = i_449_;
				if (Class607.aClass607_7974.anInt7982 * 1923531495 == i_451_ || (i_451_ == Class607.aClass607_7965.anInt7982 * 1923531495)) {
					if (i_450_ == 0)
						class178.method3387(i_446_, i_447_, 4, i_452_, 159828926);
					else if (i_450_ == 1)
						class178.method3080(i_446_, i_447_, 4, i_452_, -1837417930);
					else if (2 == i_450_)
						class178.method3387(i_446_ + 3, i_447_, 4, i_452_, 159828926);
					else if (3 == i_450_)
						class178.method3080(i_446_, i_447_ + 3, 4, i_452_, -568170053);
				}
				if (i_451_ == Class607.aClass607_7966.anInt7982 * 1923531495) {
					if (0 == i_450_)
						class178.method3354(i_446_, i_447_, 1, 1, i_452_, (byte) 109);
					else if (i_450_ == 1)
						class178.method3354(3 + i_446_, i_447_, 1, 1, i_452_, (byte) 67);
					else if (2 == i_450_)
						class178.method3354(3 + i_446_, i_447_ + 3, 1, 1, i_452_, (byte) 47);
					else if (3 == i_450_)
						class178.method3354(i_446_, 3 + i_447_, 1, 1, i_452_, (byte) 67);
				}
				if (i_451_ == 1923531495 * Class607.aClass607_7965.anInt7982) {
					if (i_450_ == 0)
						class178.method3080(i_446_, i_447_, 4, i_452_, -1112386110);
					else if (i_450_ == 1)
						class178.method3387(i_446_ + 3, i_447_, 4, i_452_, 159828926);
					else if (i_450_ == 2)
						class178.method3080(i_446_, i_447_ + 3, 4, i_452_, -502650156);
					else if (i_450_ == 3)
						class178.method3387(i_446_, i_447_, 4, i_452_, 159828926);
				}
			}
		}
		interface61 = (Interface61) class560.method9295(i, i_444_, i_445_, client.anInterface63_11296, (byte) -68);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1308625067).getDefinition(interface61.method401(-770473736), (byte) -29)));
			int i_453_ = interface61.method390(1259048815) & 0x3;
			int i_454_ = interface61.method69(1625448743);
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_453_, i_446_, i_447_, 860536581);
			else if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_454_) {
				int i_455_ = -1118482;
				if (-344567467 * class602.anInt7874 > 0)
					i_455_ = -1179648;
				if (0 == i_453_ || 2 == i_453_)
					class178.method3381(i_446_, 3 + i_447_, i_446_ + 3, i_447_, i_455_, 883239420);
				else
					class178.method3381(i_446_, i_447_, i_446_ + 3, i_447_ + 3, i_455_, -873849201);
			}
		}
		interface61 = (Interface61) class560.method9398(i, i_444_, i_445_, -1411680201);
		if (null != interface61) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1554270720).getDefinition(interface61.method401(-770473736), (byte) 25)));
			int i_456_ = interface61.method390(1259048815) & 0x3;
			if (-1 != class602.anInt7890 * 573415481)
				NPCDefinition.method5515(class178, class602, i_456_, i_446_, i_447_, 662578367);
		}
	}

	public static void method1858(int i, int i_457_, byte i_458_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_457_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 98);
	}
}
