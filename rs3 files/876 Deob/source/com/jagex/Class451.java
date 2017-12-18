/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class451 {
	public static final int anInt4956 = 2;
	static final int anInt4957 = 2;
	static final int anInt4958 = 16;
	public static final int anInt4959 = 4;
	static final int anInt4960 = 2;
	public static final int anInt4961 = 8;
	public byte[][][] aByteArrayArrayArray4962;

	int method7279(int i, int i_0_, int i_1_) {
		if (0 != (aByteArrayArrayArray4962[i][i_0_][i_1_] & 0x8))
			return 0;
		if (i > 0 && 0 != (aByteArrayArrayArray4962[1][i_0_][i_1_] & 0x2))
			return i - 1;
		return i;
	}

	public void method7280(int i) {
		for (int i_2_ = 0; i_2_ < aByteArrayArrayArray4962.length; i_2_++) {
			for (int i_3_ = 0; i_3_ < aByteArrayArrayArray4962[0].length; i_3_++) {
				for (int i_4_ = 0; i_4_ < aByteArrayArrayArray4962[0][0].length; i_4_++)
					aByteArrayArrayArray4962[i_2_][i_3_][i_4_] = (byte) 0;
			}
		}
	}

	public boolean method7281(int i, int i_5_, byte i_6_) {
		if (i < 0 || i_5_ < 0 || i >= aByteArrayArrayArray4962[3].length || i_5_ >= aByteArrayArrayArray4962[3][i].length)
			return false;
		return 0 != (aByteArrayArrayArray4962[3][i][i_5_] & 0x2);
	}

	public boolean method7282(int i, int i_7_, int i_8_) {
		if (i < 0 || i_7_ < 0 || i >= aByteArrayArrayArray4962[1].length || i_7_ >= aByteArrayArrayArray4962[1][i].length)
			return false;
		if (0 != (aByteArrayArrayArray4962[1][i][i_7_] & 0x2))
			return true;
		return false;
	}

	public boolean method7283(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (0 != (aByteArrayArrayArray4962[0][i_10_][i_11_] & 0x2))
			return true;
		if ((aByteArrayArrayArray4962[i_9_][i_10_][i_11_] & 0x10) != 0)
			return false;
		if (method7284(i_9_, i_10_, i_11_, 443026707) == i)
			return true;
		return false;
	}

	int method7284(int i, int i_13_, int i_14_, int i_15_) {
		if (0 != (aByteArrayArrayArray4962[i][i_13_][i_14_] & 0x8))
			return 0;
		if (i > 0 && 0 != (aByteArrayArrayArray4962[1][i_13_][i_14_] & 0x2))
			return i - 1;
		return i;
	}

	public Class451(int i, int i_16_, int i_17_) {
		aByteArrayArrayArray4962 = new byte[i][i_16_][i_17_];
	}

	public void method7285() {
		for (int i = 0; i < aByteArrayArrayArray4962.length; i++) {
			for (int i_18_ = 0; i_18_ < aByteArrayArrayArray4962[0].length; i_18_++) {
				for (int i_19_ = 0; i_19_ < aByteArrayArrayArray4962[0][0].length; i_19_++)
					aByteArrayArrayArray4962[i][i_18_][i_19_] = (byte) 0;
			}
		}
	}

	public void method7286() {
		for (int i = 0; i < aByteArrayArrayArray4962.length; i++) {
			for (int i_20_ = 0; i_20_ < aByteArrayArrayArray4962[0].length; i_20_++) {
				for (int i_21_ = 0; i_21_ < aByteArrayArrayArray4962[0][0].length; i_21_++)
					aByteArrayArrayArray4962[i][i_20_][i_21_] = (byte) 0;
			}
		}
	}

	public boolean method7287(int i, int i_22_, int i_23_, int i_24_) {
		if (0 != (aByteArrayArrayArray4962[0][i_23_][i_24_] & 0x2))
			return true;
		if ((aByteArrayArrayArray4962[i_22_][i_23_][i_24_] & 0x10) != 0)
			return false;
		if (method7284(i_22_, i_23_, i_24_, 443026707) == i)
			return true;
		return false;
	}

	public boolean method7288(int i, int i_25_) {
		if (i < 0 || i_25_ < 0 || i >= aByteArrayArrayArray4962[3].length || i_25_ >= aByteArrayArrayArray4962[3][i].length)
			return false;
		return 0 != (aByteArrayArrayArray4962[3][i][i_25_] & 0x2);
	}

	public void method7289() {
		for (int i = 0; i < aByteArrayArrayArray4962.length; i++) {
			for (int i_26_ = 0; i_26_ < aByteArrayArrayArray4962[0].length; i_26_++) {
				for (int i_27_ = 0; i_27_ < aByteArrayArrayArray4962[0][0].length; i_27_++)
					aByteArrayArrayArray4962[i][i_26_][i_27_] = (byte) 0;
			}
		}
	}

	public void method7290() {
		for (int i = 0; i < aByteArrayArrayArray4962.length; i++) {
			for (int i_28_ = 0; i_28_ < aByteArrayArrayArray4962[0].length; i_28_++) {
				for (int i_29_ = 0; i_29_ < aByteArrayArrayArray4962[0][0].length; i_29_++)
					aByteArrayArrayArray4962[i][i_28_][i_29_] = (byte) 0;
			}
		}
	}

	static final void method7291(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class267.method4896(class250, class242, class669, -1967258475);
	}

	public static void method7292(int i, int i_30_, int i_31_, int i_32_, Class602 class602, NPC class647_sub1_sub3_sub1_sub1, Player class647_sub1_sub3_sub1_sub2, int i_33_) {
		Class523_Sub3 class523_sub3 = new Class523_Sub3();
		class523_sub3.anInt10369 = 1017270297 * i;
		class523_sub3.anInt10378 = -106182451 * (i_30_ << 9);
		class523_sub3.anInt10373 = (i_31_ << 9) * 439720901;
		if (class602 != null) {
			class523_sub3.aClass602_10377 = class602;
			int i_34_ = -1994552549 * class602.anInt7871;
			int i_35_ = class602.anInt7872 * -1564896481;
			if (i_32_ == 1 || 3 == i_32_) {
				i_34_ = -1564896481 * class602.anInt7872;
				i_35_ = class602.anInt7871 * -1994552549;
			}
			class523_sub3.anInt10370 = -1164689503 * (i_30_ + i_34_ << 9);
			class523_sub3.anInt10371 = (i_35_ + i_31_ << 9) * -979668627;
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
			Class523_Sub3.aClass708_10364.method14236(class523_sub3, -1640345427);
			Class254.aClass217_2743.method3870(class523_sub3.anInt10388 * 2086711745, 10379033);
			Class254.aClass217_2743.method3869(class523_sub3.anIntArray10393, -81514583);
		} else if (class647_sub1_sub3_sub1_sub1 != null) {
			class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380 = class647_sub1_sub3_sub1_sub1;
			NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
			if (null != class300.anIntArray3286) {
				class523_sub3.aBool10385 = true;
				class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 36);
			}
			if (class300 != null) {
				class523_sub3.anInt10370 = ((class300.anInt3260 * 1610497933 + i_30_ << 9) * -1164689503);
				class523_sub3.anInt10371 = -979668627 * (1610497933 * class300.anInt3260 + i_31_ << 9);
				class523_sub3.anInt10388 = Class297_Sub1.method15556(class647_sub1_sub3_sub1_sub1, (byte) 41) * 1504599617;
				class523_sub3.anInt10363 = -865653251 * (-586843549 * class300.anInt3271 << 9);
				class523_sub3.anInt10376 = -6876383 * class300.anInt3307;
				class523_sub3.anInt10387 = class300.anInt3300 * 305260037;
				class523_sub3.anInt10386 = 593450597 * class300.anInt3278;
				class523_sub3.anInt10374 = (class300.anInt3306 * -204797335 << 9) * 599043353;
				Class254.aClass217_2743.method3870(class300.anInt3301 * -1238207029, 786074282);
				Class254.aClass217_2743.method3870(class300.anInt3302 * 1501995389, 429636568);
				Class254.aClass217_2743.method3870(class300.anInt3261 * 76076617, 2079399772);
				Class254.aClass217_2743.method3870(710999717 * class300.anInt3304, 1108869067);
			}
			Class523_Sub3.aClass708_10365.method14236(class523_sub3, 918531138);
		} else if (null != class647_sub1_sub3_sub1_sub2) {
			class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368 = class647_sub1_sub3_sub1_sub2;
			class523_sub3.anInt10370 = (i_30_ + class647_sub1_sub3_sub1_sub2.method18338(2140731642) << 9) * -1164689503;
			class523_sub3.anInt10371 = (i_31_ + class647_sub1_sub3_sub1_sub2.method18338(2141047502) << 9) * -979668627;
			class523_sub3.anInt10388 = Class194_Sub3.method15489(class647_sub1_sub3_sub1_sub2, (byte) 21) * 1504599617;
			class523_sub3.anInt10363 = (-865653251 * (-2112595399 * class647_sub1_sub3_sub1_sub2.anInt12197 << 9));
			class523_sub3.anInt10376 = class647_sub1_sub3_sub1_sub2.anInt12198 * -1398348283;
			class523_sub3.anInt10387 = -1826374400;
			class523_sub3.anInt10386 = -1050187008;
			class523_sub3.anInt10374 = 0;
			Class523_Sub3.aClass14_10390.method738(class523_sub3, (long) (-1087669731 * class647_sub1_sub3_sub1_sub2.anInt11888));
			Class254.aClass217_2743.method3870((764561367 * (class647_sub1_sub3_sub1_sub2.anInt12184)), -209375192);
			Class254.aClass217_2743.method3870((-1155504023 * (class647_sub1_sub3_sub1_sub2.anInt12194)), 1406918266);
			Class254.aClass217_2743.method3870((-1258538771 * (class647_sub1_sub3_sub1_sub2.anInt12193)), 1043945037);
			Class254.aClass217_2743.method3870((class647_sub1_sub3_sub1_sub2.anInt12190) * -1487401711, 1768597420);
		}
	}
}
