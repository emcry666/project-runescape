/* Class523_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub3 extends Class523 {
	int anInt10363;
	static Class708 aClass708_10364 = new Class708();
	static Class708 aClass708_10365 = new Class708();
	static final int anInt10366 = 0;
	static final int anInt10367 = 512;
	Player aClass647_Sub1_Sub3_Sub1_Sub2_10368;
	int anInt10369;
	int anInt10370;
	int anInt10371;
	Class437 aClass437_10372 = new Class437(0.0F, 0.0F, 0.0F);
	int anInt10373;
	int anInt10374;
	int anInt10375;
	int anInt10376;
	Class602 aClass602_10377;
	int anInt10378;
	Class489 aClass489_10379;
	Class647_Sub1_Sub3_Sub1_Sub1 aClass647_Sub1_Sub3_Sub1_Sub1_10380;
	static final int anInt10381 = 1;
	static final int anInt10382 = 2;
	static final int anInt10383 = 3;
	int anInt10384;
	boolean aBool10385;
	int anInt10386;
	int anInt10387;
	int anInt10388;
	Class489 aClass489_10389;
	static Class14 aClass14_10390 = new Class14(16);
	int anInt10391;
	int anInt10392;
	int[] anIntArray10393;
	Class437 aClass437_10394 = new Class437(0.0F, 0.0F, 0.0F);

	public static void method15903(int i, int i_0_, int i_1_, int i_2_, Class602 class602, Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1, Player class647_sub1_sub3_sub1_sub2) {
		Class523_Sub3 class523_sub3 = new Class523_Sub3();
		class523_sub3.anInt10369 = 1017270297 * i;
		class523_sub3.anInt10378 = -106182451 * (i_0_ << 9);
		class523_sub3.anInt10373 = (i_1_ << 9) * 439720901;
		if (class602 != null) {
			class523_sub3.aClass602_10377 = class602;
			int i_3_ = -1994552549 * class602.anInt7871;
			int i_4_ = class602.anInt7872 * -1564896481;
			if (i_2_ == 1 || 3 == i_2_) {
				i_3_ = -1564896481 * class602.anInt7872;
				i_4_ = class602.anInt7871 * -1994552549;
			}
			class523_sub3.anInt10370 = -1164689503 * (i_0_ + i_3_ << 9);
			class523_sub3.anInt10371 = (i_4_ + i_1_ << 9) * -979668627;
			class523_sub3.anInt10388 = -1024101195 * class602.anInt7899;
			class523_sub3.anInt10363 = (class602.anInt7913 * -1302148341 << 9) * -865653251;
			class523_sub3.anInt10376 = class602.anInt7889 * 1567575381;
			class523_sub3.anInt10391 = 1033103503 * class602.anInt7896;
			class523_sub3.anInt10392 = class602.anInt7917 * -342599695;
			class523_sub3.anIntArray10393 = class602.anIntArray7918;
			class523_sub3.anInt10387 = class602.anInt7927 * 1527856859;
			class523_sub3.anInt10386 = class602.anInt7926 * 1857235447;
			class523_sub3.anInt10374 = 599043353 * (class602.anInt7858 * -201611137 << 9);
			if (class602.anIntArray7912 != null) {
				class523_sub3.aBool10385 = true;
				class523_sub3.method15904((short) 4096);
			}
			if (null != class523_sub3.anIntArray10393)
				class523_sub3.anInt10375 = (class523_sub3.anInt10391 * 2120106959 + (int) (Math.random() * (double) ((354055303 * class523_sub3.anInt10392) - (class523_sub3.anInt10391 * 2120106959)))) * 844658403;
			aClass708_10364.method14236(class523_sub3, 871702121);
			Class254.aClass217_2743.method3870(class523_sub3.anInt10388 * 2086711745, 1677358287);
			Class254.aClass217_2743.method3869(class523_sub3.anIntArray10393, 19252022);
		} else if (class647_sub1_sub3_sub1_sub1 != null) {
			class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380 = class647_sub1_sub3_sub1_sub1;
			NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
			if (null != class300.anIntArray3286) {
				class523_sub3.aBool10385 = true;
				class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -4);
			}
			if (class300 != null) {
				class523_sub3.anInt10370 = ((class300.anInt3260 * 1610497933 + i_0_ << 9) * -1164689503);
				class523_sub3.anInt10371 = -979668627 * (1610497933 * class300.anInt3260 + i_1_ << 9);
				class523_sub3.anInt10388 = Class297_Sub1.method15556(class647_sub1_sub3_sub1_sub1, (byte) 18) * 1504599617;
				class523_sub3.anInt10363 = -865653251 * (-586843549 * class300.anInt3271 << 9);
				class523_sub3.anInt10376 = -6876383 * class300.anInt3307;
				class523_sub3.anInt10387 = class300.anInt3300 * 305260037;
				class523_sub3.anInt10386 = 593450597 * class300.anInt3278;
				class523_sub3.anInt10374 = (class300.anInt3306 * -204797335 << 9) * 599043353;
				Class254.aClass217_2743.method3870(class300.anInt3301 * -1238207029, 1115714876);
				Class254.aClass217_2743.method3870(class300.anInt3302 * 1501995389, 517444746);
				Class254.aClass217_2743.method3870(class300.anInt3261 * 76076617, 499545003);
				Class254.aClass217_2743.method3870(710999717 * class300.anInt3304, -99181598);
			}
			aClass708_10365.method14236(class523_sub3, -1494338527);
		} else if (null != class647_sub1_sub3_sub1_sub2) {
			class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368 = class647_sub1_sub3_sub1_sub2;
			class523_sub3.anInt10370 = (i_0_ + class647_sub1_sub3_sub1_sub2.method18338(2146132030) << 9) * -1164689503;
			class523_sub3.anInt10371 = (i_1_ + class647_sub1_sub3_sub1_sub2.method18338(2143230237) << 9) * -979668627;
			class523_sub3.anInt10388 = Class194_Sub3.method15489(class647_sub1_sub3_sub1_sub2, (byte) 45) * 1504599617;
			class523_sub3.anInt10363 = (-865653251 * (-2112595399 * class647_sub1_sub3_sub1_sub2.anInt12197 << 9));
			class523_sub3.anInt10376 = class647_sub1_sub3_sub1_sub2.anInt12198 * -1398348283;
			class523_sub3.anInt10387 = -1826374400;
			class523_sub3.anInt10386 = -1050187008;
			class523_sub3.anInt10374 = 0;
			aClass14_10390.method738(class523_sub3, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)));
			Class254.aClass217_2743.method3870((764561367 * (class647_sub1_sub3_sub1_sub2.anInt12184)), 1797999031);
			Class254.aClass217_2743.method3870((-1155504023 * (class647_sub1_sub3_sub1_sub2.anInt12194)), 1835471978);
			Class254.aClass217_2743.method3870((-1258538771 * (class647_sub1_sub3_sub1_sub2.anInt12193)), 729390615);
			Class254.aClass217_2743.method3870((class647_sub1_sub3_sub1_sub2.anInt12190) * -1487401711, 264698687);
		}
	}

	void method15904(short i) {
		int i_5_ = 2086711745 * anInt10388;
		if (aClass602_10377 != null) {
			Class602 class602 = (aClass602_10377.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == client.anInt11071 * -1616721887 ? (Interface17) Class191.anInterface17_2169 : Class98_Sub1_Sub2.playerVarsProvider), 1600627197));
			if (class602 != null) {
				anInt10388 = class602.anInt7899 * -1024101195;
				anInt10363 = -865653251 * (-1302148341 * class602.anInt7913 << 9);
				anInt10376 = 1567575381 * class602.anInt7889;
				anInt10391 = class602.anInt7896 * 1033103503;
				anInt10392 = -342599695 * class602.anInt7917;
				anIntArray10393 = class602.anIntArray7918;
				anInt10387 = 1527856859 * class602.anInt7927;
				anInt10386 = class602.anInt7926 * 1857235447;
			} else {
				anInt10388 = -1504599617;
				anInt10363 = 0;
				anInt10376 = 0;
				anInt10391 = 0;
				anInt10392 = 0;
				anIntArray10393 = null;
				anInt10387 = -1826374400;
				anInt10386 = -1050187008;
				anInt10374 = 0;
			}
		} else if (aClass647_Sub1_Sub3_Sub1_Sub1_10380 != null) {
			int i_6_ = (Class297_Sub1.method15556(aClass647_Sub1_Sub3_Sub1_Sub1_10380, (byte) 68));
			if (i_5_ != i_6_) {
				anInt10388 = 1504599617 * i_6_;
				NPCDefinition class300 = aClass647_Sub1_Sub3_Sub1_Sub1_10380.aClass300_12175;
				if (class300.anIntArray3286 != null)
					class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) -42);
				if (null != class300) {
					anInt10363 = -865653251 * (-586843549 * class300.anInt3271 << 9);
					anInt10374 = (class300.anInt3306 * -204797335 << 9) * 599043353;
					anInt10376 = class300.anInt3307 * -6876383;
					anInt10387 = 305260037 * class300.anInt3300;
					anInt10386 = class300.anInt3278 * 593450597;
				} else {
					anInt10374 = 0;
					anInt10363 = 0;
					anInt10376 = 0;
					anInt10387 = -1826374400;
					anInt10386 = -1050187008;
				}
			}
		} else if (aClass647_Sub1_Sub3_Sub1_Sub2_10368 != null) {
			anInt10388 = ((Class194_Sub3.method15489(aClass647_Sub1_Sub3_Sub1_Sub2_10368, (byte) -66)) * 1504599617);
			anInt10363 = (-865653251 * ((-2112595399 * aClass647_Sub1_Sub3_Sub1_Sub2_10368.anInt12197) << 9));
			anInt10374 = 0;
			anInt10376 = -1398348283 * aClass647_Sub1_Sub3_Sub1_Sub2_10368.anInt12198;
			anInt10387 = -1826374400;
			anInt10386 = -1050187008;
		}
		if (i_5_ != 2086711745 * anInt10388 && aClass489_10389 != null && aClass489_10389 != null) {
			aClass489_10389.method7960(100, (byte) 112);
			Class254.aClass217_2743.method3864(aClass489_10389, (byte) 24);
			aClass489_10389 = null;
		}
	}

	public static void method15905(Player class647_sub1_sub3_sub1_sub2) {
		Class523_Sub3 class523_sub3 = ((Class523_Sub3) aClass14_10390.method741((long) ((class647_sub1_sub3_sub1_sub2.anInt11888) * -1087669731)));
		if (class523_sub3 != null) {
			if (null != class523_sub3.aClass489_10389) {
				class523_sub3.aClass489_10389.method7960(100, (byte) 93);
				Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
				class523_sub3.aClass489_10389 = null;
			}
			class523_sub3.method8661(607052656);
		}
	}

	public static void method15906(int i, int i_7_, int i_8_, int i_9_, Class602 class602, Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1, Player class647_sub1_sub3_sub1_sub2) {
		Class523_Sub3 class523_sub3 = new Class523_Sub3();
		class523_sub3.anInt10369 = 1017270297 * i;
		class523_sub3.anInt10378 = -106182451 * (i_7_ << 9);
		class523_sub3.anInt10373 = (i_8_ << 9) * 439720901;
		if (class602 != null) {
			class523_sub3.aClass602_10377 = class602;
			int i_10_ = -1994552549 * class602.anInt7871;
			int i_11_ = class602.anInt7872 * -1564896481;
			if (i_9_ == 1 || 3 == i_9_) {
				i_10_ = -1564896481 * class602.anInt7872;
				i_11_ = class602.anInt7871 * -1994552549;
			}
			class523_sub3.anInt10370 = -1164689503 * (i_7_ + i_10_ << 9);
			class523_sub3.anInt10371 = (i_11_ + i_8_ << 9) * -979668627;
			class523_sub3.anInt10388 = -1024101195 * class602.anInt7899;
			class523_sub3.anInt10363 = (class602.anInt7913 * -1302148341 << 9) * -865653251;
			class523_sub3.anInt10376 = class602.anInt7889 * 1567575381;
			class523_sub3.anInt10391 = 1033103503 * class602.anInt7896;
			class523_sub3.anInt10392 = class602.anInt7917 * -342599695;
			class523_sub3.anIntArray10393 = class602.anIntArray7918;
			class523_sub3.anInt10387 = class602.anInt7927 * 1527856859;
			class523_sub3.anInt10386 = class602.anInt7926 * 1857235447;
			class523_sub3.anInt10374 = 599043353 * (class602.anInt7858 * -201611137 << 9);
			if (class602.anIntArray7912 != null) {
				class523_sub3.aBool10385 = true;
				class523_sub3.method15904((short) 4096);
			}
			if (null != class523_sub3.anIntArray10393)
				class523_sub3.anInt10375 = (class523_sub3.anInt10391 * 2120106959 + (int) (Math.random() * (double) ((354055303 * class523_sub3.anInt10392) - (class523_sub3.anInt10391 * 2120106959)))) * 844658403;
			aClass708_10364.method14236(class523_sub3, -549844621);
			Class254.aClass217_2743.method3870(class523_sub3.anInt10388 * 2086711745, -217626498);
			Class254.aClass217_2743.method3869(class523_sub3.anIntArray10393, 178096136);
		} else if (class647_sub1_sub3_sub1_sub1 != null) {
			class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380 = class647_sub1_sub3_sub1_sub1;
			NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
			if (null != class300.anIntArray3286) {
				class523_sub3.aBool10385 = true;
				class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 16);
			}
			if (class300 != null) {
				class523_sub3.anInt10370 = ((class300.anInt3260 * 1610497933 + i_7_ << 9) * -1164689503);
				class523_sub3.anInt10371 = -979668627 * (1610497933 * class300.anInt3260 + i_8_ << 9);
				class523_sub3.anInt10388 = Class297_Sub1.method15556(class647_sub1_sub3_sub1_sub1, (byte) 49) * 1504599617;
				class523_sub3.anInt10363 = -865653251 * (-586843549 * class300.anInt3271 << 9);
				class523_sub3.anInt10376 = -6876383 * class300.anInt3307;
				class523_sub3.anInt10387 = class300.anInt3300 * 305260037;
				class523_sub3.anInt10386 = 593450597 * class300.anInt3278;
				class523_sub3.anInt10374 = (class300.anInt3306 * -204797335 << 9) * 599043353;
				Class254.aClass217_2743.method3870(class300.anInt3301 * -1238207029, 139125365);
				Class254.aClass217_2743.method3870(class300.anInt3302 * 1501995389, 836601160);
				Class254.aClass217_2743.method3870(class300.anInt3261 * 76076617, 13241455);
				Class254.aClass217_2743.method3870(710999717 * class300.anInt3304, 96829520);
			}
			aClass708_10365.method14236(class523_sub3, -1151110874);
		} else if (null != class647_sub1_sub3_sub1_sub2) {
			class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368 = class647_sub1_sub3_sub1_sub2;
			class523_sub3.anInt10370 = (i_7_ + class647_sub1_sub3_sub1_sub2.method18338(2140786589) << 9) * -1164689503;
			class523_sub3.anInt10371 = (i_8_ + class647_sub1_sub3_sub1_sub2.method18338(2139984058) << 9) * -979668627;
			class523_sub3.anInt10388 = Class194_Sub3.method15489(class647_sub1_sub3_sub1_sub2, (byte) -26) * 1504599617;
			class523_sub3.anInt10363 = (-865653251 * (-2112595399 * class647_sub1_sub3_sub1_sub2.anInt12197 << 9));
			class523_sub3.anInt10376 = class647_sub1_sub3_sub1_sub2.anInt12198 * -1398348283;
			class523_sub3.anInt10387 = -1826374400;
			class523_sub3.anInt10386 = -1050187008;
			class523_sub3.anInt10374 = 0;
			aClass14_10390.method738(class523_sub3, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)));
			Class254.aClass217_2743.method3870((764561367 * (class647_sub1_sub3_sub1_sub2.anInt12184)), 571362784);
			Class254.aClass217_2743.method3870((-1155504023 * (class647_sub1_sub3_sub1_sub2.anInt12194)), 1890596367);
			Class254.aClass217_2743.method3870((-1258538771 * (class647_sub1_sub3_sub1_sub2.anInt12193)), 503020138);
			Class254.aClass217_2743.method3870((class647_sub1_sub3_sub1_sub2.anInt12190) * -1487401711, 1441398164);
		}
	}

	static int method15907(Player class647_sub1_sub3_sub1_sub2) {
		int i = -1258538771 * class647_sub1_sub3_sub1_sub2.anInt12193;
		Class588 class588 = class647_sub1_sub3_sub1_sub2.method18352(-264397850);
		int i_12_ = class647_sub1_sub3_sub1_sub2.aClass707_Sub1_11887.method14163(-2108370043);
		if (-1 == i_12_ || class647_sub1_sub3_sub1_sub2.aClass707_Sub1_11887.aBool10956)
			i = class647_sub1_sub3_sub1_sub2.anInt12184 * 764561367;
		else if (684302799 * class588.anInt7772 == i_12_ || i_12_ == class588.anInt7759 * 1369343077 || class588.anInt7761 * 1751585825 == i_12_ || class588.anInt7760 * -893536895 == i_12_)
			i = -1487401711 * class647_sub1_sub3_sub1_sub2.anInt12190;
		else if (class588.anInt7762 * 87001555 == i_12_ || i_12_ == class588.anInt7763 * 1855181421 || -613234717 * class588.anInt7765 == i_12_ || i_12_ == 791380503 * class588.anInt7764)
			i = -1155504023 * class647_sub1_sub3_sub1_sub2.anInt12194;
		return i;
	}

	void method15908() {
		int i = 2086711745 * anInt10388;
		if (aClass602_10377 != null) {
			Class602 class602 = (aClass602_10377.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == client.anInt11071 * -1616721887 ? (Interface17) Class191.anInterface17_2169 : Class98_Sub1_Sub2.playerVarsProvider), 2106787294));
			if (class602 != null) {
				anInt10388 = class602.anInt7899 * -1024101195;
				anInt10363 = -865653251 * (-1302148341 * class602.anInt7913 << 9);
				anInt10376 = 1567575381 * class602.anInt7889;
				anInt10391 = class602.anInt7896 * 1033103503;
				anInt10392 = -342599695 * class602.anInt7917;
				anIntArray10393 = class602.anIntArray7918;
				anInt10387 = 1527856859 * class602.anInt7927;
				anInt10386 = class602.anInt7926 * 1857235447;
			} else {
				anInt10388 = -1504599617;
				anInt10363 = 0;
				anInt10376 = 0;
				anInt10391 = 0;
				anInt10392 = 0;
				anIntArray10393 = null;
				anInt10387 = -1826374400;
				anInt10386 = -1050187008;
				anInt10374 = 0;
			}
		} else if (aClass647_Sub1_Sub3_Sub1_Sub1_10380 != null) {
			int i_13_ = (Class297_Sub1.method15556(aClass647_Sub1_Sub3_Sub1_Sub1_10380, (byte) -30));
			if (i != i_13_) {
				anInt10388 = 1504599617 * i_13_;
				NPCDefinition class300 = aClass647_Sub1_Sub3_Sub1_Sub1_10380.aClass300_12175;
				if (class300.anIntArray3286 != null)
					class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 60);
				if (null != class300) {
					anInt10363 = -865653251 * (-586843549 * class300.anInt3271 << 9);
					anInt10374 = (class300.anInt3306 * -204797335 << 9) * 599043353;
					anInt10376 = class300.anInt3307 * -6876383;
					anInt10387 = 305260037 * class300.anInt3300;
					anInt10386 = class300.anInt3278 * 593450597;
				} else {
					anInt10374 = 0;
					anInt10363 = 0;
					anInt10376 = 0;
					anInt10387 = -1826374400;
					anInt10386 = -1050187008;
				}
			}
		} else if (aClass647_Sub1_Sub3_Sub1_Sub2_10368 != null) {
			anInt10388 = ((Class194_Sub3.method15489(aClass647_Sub1_Sub3_Sub1_Sub2_10368, (byte) 85)) * 1504599617);
			anInt10363 = (-865653251 * ((-2112595399 * aClass647_Sub1_Sub3_Sub1_Sub2_10368.anInt12197) << 9));
			anInt10374 = 0;
			anInt10376 = -1398348283 * aClass647_Sub1_Sub3_Sub1_Sub2_10368.anInt12198;
			anInt10387 = -1826374400;
			anInt10386 = -1050187008;
		}
		if (i != 2086711745 * anInt10388 && aClass489_10389 != null && aClass489_10389 != null) {
			aClass489_10389.method7960(100, (byte) 59);
			Class254.aClass217_2743.method3864(aClass489_10389, (byte) 24);
			aClass489_10389 = null;
		}
	}

	public static void method15909() {
		for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10364.method14240(625068797); class523_sub3 != null; class523_sub3 = (Class523_Sub3) aClass708_10364.method14244((byte) -73)) {
			if (class523_sub3.aBool10385)
				class523_sub3.method15904((short) 4096);
		}
		for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10365.method14240(578741874); class523_sub3 != null; class523_sub3 = (Class523_Sub3) aClass708_10365.method14244((byte) 84)) {
			if (class523_sub3.aBool10385)
				class523_sub3.method15904((short) 4096);
		}
	}

	public static void method15910(int i, int i_14_, int i_15_, Class602 class602) {
		for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10364.method14240(1946524795); class523_sub3 != null; class523_sub3 = (Class523_Sub3) aClass708_10364.method14244((byte) -34)) {
			if (i == -398455767 * class523_sub3.anInt10369 && i_14_ << 9 == -838245371 * class523_sub3.anInt10378 && class523_sub3.anInt10373 * -2105988339 == i_15_ << 9 && (class602.anInt7854 * -2005438859 == (class523_sub3.aClass602_10377.anInt7854 * -2005438859))) {
				if (class523_sub3.aClass489_10389 != null) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 111);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				class523_sub3.method8661(607052656);
				break;
			}
		}
	}

	public static void method15911(int i, int i_16_, int i_17_, Class602 class602) {
		for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10364.method14240(1564765474); class523_sub3 != null; class523_sub3 = (Class523_Sub3) aClass708_10364.method14244((byte) -100)) {
			if (i == -398455767 * class523_sub3.anInt10369 && i_16_ << 9 == -838245371 * class523_sub3.anInt10378 && class523_sub3.anInt10373 * -2105988339 == i_17_ << 9 && (class602.anInt7854 * -2005438859 == (class523_sub3.aClass602_10377.anInt7854 * -2005438859))) {
				if (class523_sub3.aClass489_10389 != null) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 118);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				class523_sub3.method8661(607052656);
				break;
			}
		}
	}

	public static void method15912(int i, int i_18_, int i_19_, Class602 class602) {
		for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10364.method14240(1447776918); class523_sub3 != null; class523_sub3 = (Class523_Sub3) aClass708_10364.method14244((byte) -104)) {
			if (i == -398455767 * class523_sub3.anInt10369 && i_18_ << 9 == -838245371 * class523_sub3.anInt10378 && class523_sub3.anInt10373 * -2105988339 == i_19_ << 9 && (class602.anInt7854 * -2005438859 == (class523_sub3.aClass602_10377.anInt7854 * -2005438859))) {
				if (class523_sub3.aClass489_10389 != null) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 76);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				class523_sub3.method8661(607052656);
				break;
			}
		}
	}

	static void method15913(Class523_Sub3 class523_sub3, int i, int i_20_, int i_21_, int i_22_) {
		if (2086711745 * class523_sub3.anInt10388 != -1 || null != class523_sub3.anIntArray10393) {
			int i_23_ = class523_sub3.anInt10376 * -815661653;
			if (class523_sub3.anInt10363 * 1137448789 == 0 || Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(1105692942) == 0 || i != class523_sub3.anInt10369 * -398455767) {
				if (null != class523_sub3.aClass489_10389) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 23);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
			} else {
				if (class523_sub3.aClass489_10389 != null && ((class523_sub3.aClass489_10389.method8004((short) 20333) == Class488.aClass488_5493) || (class523_sub3.aClass489_10389.method8004((short) 31924) == Class488.aClass488_5495))) {
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				if (null == class523_sub3.aClass489_10389) {
					if (2086711745 * class523_sub3.anInt10388 >= 0) {
						int i_24_ = 256;
						int i_25_ = (int) ((0.5F * (float) ((class523_sub3.anInt10370 * -2040961951) - -838245371 * (class523_sub3.anInt10378))) + (float) (-838245371 * class523_sub3.anInt10378));
						int i_26_ = (int) (((float) ((class523_sub3.anInt10371 * 552943717) - (-2105988339 * class523_sub3.anInt10373)) * 0.5F) + (float) (class523_sub3.anInt10373 * -2105988339));
						class523_sub3.aClass437_10372.aFloat4903 = (float) i_25_;
						class523_sub3.aClass437_10372.aFloat4905 = (float) i_26_;
						class523_sub3.aClass489_10389 = (Class254.aClass217_2743.method3877(Class189.aClass189_2147, class523_sub3, class523_sub3.anInt10388 * 2086711745, -1, 0, Class198.aClass198_2202.method3672((byte) 28), Class186.aClass186_2130, (float) (1089756969 * class523_sub3.anInt10374), (float) (1137448789 * class523_sub3.anInt10363), class523_sub3.aClass437_10372, 0, i_24_, false, (short) -1949));
						if (null != class523_sub3.aClass489_10389) {
							float f = (float) i_23_ / 255.0F;
							class523_sub3.aClass489_10389.method7983(f, 150, 909620676);
							class523_sub3.aClass489_10389.method8032(583211377);
						}
					}
				} else {
					int i_27_ = (int) (0.5F * (float) ((-2040961951 * class523_sub3.anInt10370) - -838245371 * (class523_sub3.anInt10378)) + (float) (-838245371 * class523_sub3.anInt10378));
					int i_28_ = (int) ((float) (class523_sub3.anInt10373 * -2105988339) + ((float) ((552943717 * class523_sub3.anInt10371) - (-2105988339 * class523_sub3.anInt10373)) * 0.5F));
					class523_sub3.aClass437_10372.aFloat4903 = (float) i_27_;
					class523_sub3.aClass437_10372.aFloat4905 = (float) i_28_;
				}
				if (null == class523_sub3.aClass489_10379) {
					if (null != class523_sub3.anIntArray10393 && ((class523_sub3.anInt10375 -= i_22_ * 844658403) * 993165003) <= 0) {
						int i_29_ = ((256 == class523_sub3.anInt10387 * -1836666987 && (-1438347965 * class523_sub3.anInt10386 == 256)) ? 256 : ((int) (Math.random() * (double) ((-1836666987 * (class523_sub3.anInt10387)) - (-1438347965 * (class523_sub3.anInt10386)))) + -1438347965 * class523_sub3.anInt10386));
						int i_30_ = (int) (Math.random() * (double) (class523_sub3.anIntArray10393).length);
						int i_31_ = (int) ((0.5F * (float) ((-2040961951 * class523_sub3.anInt10370) - (class523_sub3.anInt10378 * -838245371))) + (float) (class523_sub3.anInt10378 * -838245371));
						int i_32_ = (int) ((float) ((class523_sub3.anInt10371 * 552943717) - (class523_sub3.anInt10373 * -2105988339)) * 0.5F + (float) (class523_sub3.anInt10373 * -2105988339));
						class523_sub3.aClass437_10394.aFloat4903 = (float) i_31_;
						class523_sub3.aClass437_10394.aFloat4905 = (float) i_32_;
						class523_sub3.aClass489_10379 = (Class254.aClass217_2743.method3877(Class189.aClass189_2137, class523_sub3, class523_sub3.anIntArray10393[i_30_], 0, i_23_, Class198.aClass198_2201.method3672((byte) 113), Class186.aClass186_2130, (float) (class523_sub3.anInt10374 * 1089756969), (float) (1089756969 * class523_sub3.anInt10374 + (class523_sub3.anInt10363 * 1137448789)), class523_sub3.aClass437_10394, 0, i_29_, false, (short) -21462));
						if (class523_sub3.aClass489_10379 != null)
							class523_sub3.aClass489_10379.method8032(1238706248);
						class523_sub3.anInt10375 = ((class523_sub3.anInt10391 * 2120106959 + (int) (Math.random() * (double) (354055303 * (class523_sub3.anInt10392) - ((class523_sub3.anInt10391) * 2120106959)))) * 844658403);
					}
				} else {
					int i_33_ = (int) ((float) ((-2040961951 * class523_sub3.anInt10370) - -838245371 * (class523_sub3.anInt10378)) * 0.5F + (float) (class523_sub3.anInt10378 * -838245371));
					int i_34_ = (int) ((float) (class523_sub3.anInt10373 * -2105988339) + (float) ((552943717 * class523_sub3.anInt10371) - (class523_sub3.anInt10373 * -2105988339)) * 0.5F);
					class523_sub3.aClass437_10394.aFloat4903 = (float) i_33_;
					class523_sub3.aClass437_10394.aFloat4905 = (float) i_34_;
					if ((class523_sub3.aClass489_10379.method8004((short) 12836) == Class488.aClass488_5493) || (class523_sub3.aClass489_10379.method8004((short) 10636) == Class488.aClass488_5495)) {
						Class254.aClass217_2743.method3864((class523_sub3.aClass489_10379), (byte) 24);
						class523_sub3.aClass489_10379 = null;
					}
				}
			}
		}
	}

	public static void method15914(Player class647_sub1_sub3_sub1_sub2) {
		Class523_Sub3 class523_sub3 = ((Class523_Sub3) aClass14_10390.method741((long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888))));
		if (class523_sub3 == null)
			Class451.method7292(class647_sub1_sub3_sub1_sub2.aByte10821, (class647_sub1_sub3_sub1_sub2.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub2.anIntArray11943[0]), 0, null, null, class647_sub1_sub3_sub1_sub2, 1813832099);
		else
			class523_sub3.method15904((short) 4096);
	}

	public static void method15915(Player class647_sub1_sub3_sub1_sub2) {
		Class523_Sub3 class523_sub3 = ((Class523_Sub3) aClass14_10390.method741((long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888))));
		if (class523_sub3 == null)
			Class451.method7292(class647_sub1_sub3_sub1_sub2.aByte10821, (class647_sub1_sub3_sub1_sub2.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub2.anIntArray11943[0]), 0, null, null, class647_sub1_sub3_sub1_sub2, 1501980190);
		else
			class523_sub3.method15904((short) 4096);
	}

	public static void method15916(Player class647_sub1_sub3_sub1_sub2) {
		Class523_Sub3 class523_sub3 = ((Class523_Sub3) aClass14_10390.method741((long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888))));
		if (class523_sub3 == null)
			Class451.method7292(class647_sub1_sub3_sub1_sub2.aByte10821, (class647_sub1_sub3_sub1_sub2.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub2.anIntArray11943[0]), 0, null, null, class647_sub1_sub3_sub1_sub2, 1707352059);
		else
			class523_sub3.method15904((short) 4096);
	}

	static int method15917(Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1) {
		NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
		if (class300.anIntArray3286 != null) {
			class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -8);
			if (class300 == null)
				return -1;
		}
		int i = 76076617 * class300.anInt3261;
		Class588 class588 = class647_sub1_sub3_sub1_sub1.method18352(1727653259);
		int i_35_ = class647_sub1_sub3_sub1_sub1.aClass707_Sub1_11887.method14163(-2104810284);
		if (-1 == i_35_ || class647_sub1_sub3_sub1_sub1.aClass707_Sub1_11887.aBool10956)
			i = -1238207029 * class300.anInt3301;
		else if (i_35_ == 684302799 * class588.anInt7772 || class588.anInt7759 * 1369343077 == i_35_ || i_35_ == 1751585825 * class588.anInt7761 || i_35_ == class588.anInt7760 * -893536895)
			i = class300.anInt3304 * 710999717;
		else if (i_35_ == 87001555 * class588.anInt7762 || i_35_ == 1855181421 * class588.anInt7763 || -613234717 * class588.anInt7765 == i_35_ || class588.anInt7764 * 791380503 == i_35_)
			i = class300.anInt3302 * 1501995389;
		return i;
	}

	static int method15918(Player class647_sub1_sub3_sub1_sub2) {
		int i = -1258538771 * class647_sub1_sub3_sub1_sub2.anInt12193;
		Class588 class588 = class647_sub1_sub3_sub1_sub2.method18352(574255094);
		int i_36_ = class647_sub1_sub3_sub1_sub2.aClass707_Sub1_11887.method14163(-1740530484);
		if (-1 == i_36_ || class647_sub1_sub3_sub1_sub2.aClass707_Sub1_11887.aBool10956)
			i = class647_sub1_sub3_sub1_sub2.anInt12184 * 764561367;
		else if (684302799 * class588.anInt7772 == i_36_ || i_36_ == class588.anInt7759 * 1369343077 || class588.anInt7761 * 1751585825 == i_36_ || class588.anInt7760 * -893536895 == i_36_)
			i = -1487401711 * class647_sub1_sub3_sub1_sub2.anInt12190;
		else if (class588.anInt7762 * 87001555 == i_36_ || i_36_ == class588.anInt7763 * 1855181421 || -613234717 * class588.anInt7765 == i_36_ || i_36_ == 791380503 * class588.anInt7764)
			i = -1155504023 * class647_sub1_sub3_sub1_sub2.anInt12194;
		return i;
	}

	public static void method15919(boolean bool) {
		for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10364.method14240(1353229937); class523_sub3 != null; class523_sub3 = (Class523_Sub3) aClass708_10364.method14244((byte) 58)) {
			if (null != class523_sub3.aClass489_10389) {
				class523_sub3.aClass489_10389.method7960(150, (byte) 90);
				Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
				class523_sub3.aClass489_10389 = null;
			}
			if (null != class523_sub3.aClass489_10379) {
				class523_sub3.aClass489_10379.method7960(150, (byte) 46);
				Class254.aClass217_2743.method3864(class523_sub3.aClass489_10379, (byte) 24);
				class523_sub3.aClass489_10379 = null;
			}
			class523_sub3.method8661(607052656);
		}
		if (bool) {
			for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass708_10365.method14240(2048564803); null != class523_sub3; class523_sub3 = ((Class523_Sub3) aClass708_10365.method14244((byte) 80))) {
				if (class523_sub3.aClass489_10389 != null) {
					class523_sub3.aClass489_10389.method7960(150, (byte) 126);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				class523_sub3.method8661(607052656);
			}
			for (Class523_Sub3 class523_sub3 = (Class523_Sub3) aClass14_10390.method735(-380907255); null != class523_sub3; class523_sub3 = (Class523_Sub3) aClass14_10390.method749(1648305902)) {
				if (null != class523_sub3.aClass489_10389) {
					class523_sub3.aClass489_10389.method7960(150, (byte) 100);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				class523_sub3.method8661(607052656);
			}
		}
	}

	Class523_Sub3() {
		anInt10384 = 0;
	}

	static void method15920(Class523_Sub3 class523_sub3, int i, int i_37_, int i_38_, int i_39_) {
		if (2086711745 * class523_sub3.anInt10388 != -1 || null != class523_sub3.anIntArray10393) {
			int i_40_ = class523_sub3.anInt10376 * -815661653;
			if (class523_sub3.anInt10363 * 1137448789 == 0 || Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(1906066734) == 0 || i != class523_sub3.anInt10369 * -398455767) {
				if (null != class523_sub3.aClass489_10389) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 57);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
			} else {
				if (class523_sub3.aClass489_10389 != null && ((class523_sub3.aClass489_10389.method8004((short) 25108) == Class488.aClass488_5493) || (class523_sub3.aClass489_10389.method8004((short) 1817) == Class488.aClass488_5495))) {
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				if (null == class523_sub3.aClass489_10389) {
					if (2086711745 * class523_sub3.anInt10388 >= 0) {
						int i_41_ = 256;
						int i_42_ = (int) ((0.5F * (float) ((class523_sub3.anInt10370 * -2040961951) - -838245371 * (class523_sub3.anInt10378))) + (float) (-838245371 * class523_sub3.anInt10378));
						int i_43_ = (int) (((float) ((class523_sub3.anInt10371 * 552943717) - (-2105988339 * class523_sub3.anInt10373)) * 0.5F) + (float) (class523_sub3.anInt10373 * -2105988339));
						class523_sub3.aClass437_10372.aFloat4903 = (float) i_42_;
						class523_sub3.aClass437_10372.aFloat4905 = (float) i_43_;
						class523_sub3.aClass489_10389 = (Class254.aClass217_2743.method3877(Class189.aClass189_2147, class523_sub3, class523_sub3.anInt10388 * 2086711745, -1, 0, Class198.aClass198_2202.method3672((byte) 59), Class186.aClass186_2130, (float) (1089756969 * class523_sub3.anInt10374), (float) (1137448789 * class523_sub3.anInt10363), class523_sub3.aClass437_10372, 0, i_41_, false, (short) -27957));
						if (null != class523_sub3.aClass489_10389) {
							float f = (float) i_40_ / 255.0F;
							class523_sub3.aClass489_10389.method7983(f, 150, 846993194);
							class523_sub3.aClass489_10389.method8032(502049120);
						}
					}
				} else {
					int i_44_ = (int) (0.5F * (float) ((-2040961951 * class523_sub3.anInt10370) - -838245371 * (class523_sub3.anInt10378)) + (float) (-838245371 * class523_sub3.anInt10378));
					int i_45_ = (int) ((float) (class523_sub3.anInt10373 * -2105988339) + ((float) ((552943717 * class523_sub3.anInt10371) - (-2105988339 * class523_sub3.anInt10373)) * 0.5F));
					class523_sub3.aClass437_10372.aFloat4903 = (float) i_44_;
					class523_sub3.aClass437_10372.aFloat4905 = (float) i_45_;
				}
				if (null == class523_sub3.aClass489_10379) {
					if (null != class523_sub3.anIntArray10393 && ((class523_sub3.anInt10375 -= i_39_ * 844658403) * 993165003) <= 0) {
						int i_46_ = ((256 == class523_sub3.anInt10387 * -1836666987 && (-1438347965 * class523_sub3.anInt10386 == 256)) ? 256 : ((int) (Math.random() * (double) ((-1836666987 * (class523_sub3.anInt10387)) - (-1438347965 * (class523_sub3.anInt10386)))) + -1438347965 * class523_sub3.anInt10386));
						int i_47_ = (int) (Math.random() * (double) (class523_sub3.anIntArray10393).length);
						int i_48_ = (int) ((0.5F * (float) ((-2040961951 * class523_sub3.anInt10370) - (class523_sub3.anInt10378 * -838245371))) + (float) (class523_sub3.anInt10378 * -838245371));
						int i_49_ = (int) ((float) ((class523_sub3.anInt10371 * 552943717) - (class523_sub3.anInt10373 * -2105988339)) * 0.5F + (float) (class523_sub3.anInt10373 * -2105988339));
						class523_sub3.aClass437_10394.aFloat4903 = (float) i_48_;
						class523_sub3.aClass437_10394.aFloat4905 = (float) i_49_;
						class523_sub3.aClass489_10379 = (Class254.aClass217_2743.method3877(Class189.aClass189_2137, class523_sub3, class523_sub3.anIntArray10393[i_47_], 0, i_40_, Class198.aClass198_2201.method3672((byte) 113), Class186.aClass186_2130, (float) (class523_sub3.anInt10374 * 1089756969), (float) (1089756969 * class523_sub3.anInt10374 + (class523_sub3.anInt10363 * 1137448789)), class523_sub3.aClass437_10394, 0, i_46_, false, (short) -23499));
						if (class523_sub3.aClass489_10379 != null)
							class523_sub3.aClass489_10379.method8032(1286305884);
						class523_sub3.anInt10375 = ((class523_sub3.anInt10391 * 2120106959 + (int) (Math.random() * (double) (354055303 * (class523_sub3.anInt10392) - ((class523_sub3.anInt10391) * 2120106959)))) * 844658403);
					}
				} else {
					int i_50_ = (int) ((float) ((-2040961951 * class523_sub3.anInt10370) - -838245371 * (class523_sub3.anInt10378)) * 0.5F + (float) (class523_sub3.anInt10378 * -838245371));
					int i_51_ = (int) ((float) (class523_sub3.anInt10373 * -2105988339) + (float) ((552943717 * class523_sub3.anInt10371) - (class523_sub3.anInt10373 * -2105988339)) * 0.5F);
					class523_sub3.aClass437_10394.aFloat4903 = (float) i_50_;
					class523_sub3.aClass437_10394.aFloat4905 = (float) i_51_;
					if ((class523_sub3.aClass489_10379.method8004((short) 11121) == Class488.aClass488_5493) || (class523_sub3.aClass489_10379.method8004((short) 31625) == Class488.aClass488_5495)) {
						Class254.aClass217_2743.method3864((class523_sub3.aClass489_10379), (byte) 24);
						class523_sub3.aClass489_10379 = null;
					}
				}
			}
		}
	}

	public static void method15921(int i, int i_52_) {
		if (i < 1)
			Class534_Sub1.anInt10789 = 801008883 * Class534_Sub1.anInt10776;
		else
			Class534_Sub1.anInt10789 = i * -1199939955;
	}

	static final void method15922(Class669 class669, int i) {
		int i_53_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_53_, -1600502862);
		Class520.method8643(class250, class669, 2014846163);
	}
}
