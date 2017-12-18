/* Class647_Sub1_Sub3_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub3_Sub1_Sub1 extends Class647_Sub1_Sub3_Sub1 {
	int anInt12160;
	public int anInt12161 = -1973145421;
	public int anInt12162 = 1181559979;
	int anInt12163;
	public static int anInt12164 = -233645755;
	public static int anInt12165 = -763541499;
	public int anInt12166 = -507824959;
	public Class304 aClass304_12167;
	int anInt12168;
	public String aString12169;
	int[] anIntArray12170;
	public int anInt12171;
	int anInt12172;
	int[] anIntArray12173;
	public Class302 aClass302_12174;
	public NPCDefinition aClass300_12175;
	public int anInt12176;
	boolean aBool12177;

	public int method18619(int i) {
		return anIntArray12170[i];
	}

	public Class647_Sub1_Sub3_Sub1_Sub1(Class560 class560, int i) {
		super(class560, i, Class265.aClass98_Sub1_Sub2_2858);
		anIntArray12170 = new int[6];
		anIntArray12173 = new int[6];
		method18655((byte) -84);
	}

	public void method18620(int i) {
		anInt11931 = -1787837503;
		anInt11951 = client.anInt11011 * -834874663;
	}

	boolean method18621(Class178 class178, int i) {
		int i_0_ = i;
		Class588 class588 = method18352(1709888204);
		Class707 class707 = ((aClass707_11913.method14161(1727816344) && !aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
		Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(1204990040) && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
		int i_1_ = class588.anInt7778 * -1464618725;
		int i_2_ = class588.anInt7773 * -1199122203;
		if (0 != i_1_ || 0 != i_2_ || 0 != class588.anInt7791 * -941991763 || -1578959099 * class588.anInt7788 != 0)
			i |= 0x7;
		boolean bool = (aByte11929 != 0 && client.anInt11011 >= -1284164047 * anInt11924 && client.anInt11011 < anInt11925 * 1874600493);
		if (bool)
			i |= 0x80000;
		boolean bool_3_ = false;
		if (0 != anInt11931 * 1766454463) {
			NPCDefinition class300 = (null != aClass300_12175.anIntArray3286 ? aClass300_12175.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 37) : aClass300_12175);
			if (class300 == null || client.anInt11011 >= (-2066969239 * anInt11951 + class300.anInt3320 * 1034868193))
				anInt11931 = 0;
			else {
				anInt11931 = ((255 - ((client.anInt11011 - anInt11951 * -2066969239) * 255 / (1034868193 * class300.anInt3320))) * 1980463935);
				bool_3_ = true;
			}
		}
		if (bool_3_)
			i |= 0x100;
		int i_4_ = aClass72_11938.method1494((byte) 103);
		Class167 class167 = (aClass167Array11928[0] = aClass300_12175.method5506(class178, i, Class80.aClass53_Sub17_866, Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, class707, class707_sub1, aClass707_Sub2_Sub1Array11933, anIntArray11934, i_4_, aClass302_12174, method18348(1322016613), false, (short) -22830));
		if (class167 == null)
			return false;
		anInt11901 = class167.method2804() * -1976100247;
		anInt11921 = class167.method2718() * -270798901;
		class167.method2834();
		method18386(class167, 134246001);
		if (0 != i_1_ || i_2_ != 0) {
			method18346(i_4_, i_1_, i_2_, 585378281 * class588.anInt7774, class588.anInt7767 * 1872984397, 344281195);
			if (1360761263 * anInt11897 != 0)
				aClass167Array11928[0].method2845(anInt11897 * 1360761263);
			if (anInt11898 * 887325889 != 0)
				aClass167Array11928[0].method2688(887325889 * anInt11898);
			if (0 != 1882562377 * anInt11899)
				aClass167Array11928[0].method2689(0, 1882562377 * anInt11899, 0);
		} else
			method18346(i_4_, method18338(2143756858) << 9, method18338(2146747752) << 9, 0, 0, 1053584473);
		if (bool)
			class167.method2839(aByte11926, aByte11927, aByte11936, aByte11929 & 0xff);
		if (bool_3_)
			class167.method2715((byte) (1766454463 * anInt11931), null);
		method18339(class178, class588, i_0_, i_1_, i_2_, i_4_, (byte) 58);
		return true;
	}

	public void method18622(NPCDefinition class300, int i) {
		method18623(class300, true, true, true, (byte) -48);
	}

	public void method18623(NPCDefinition class300, boolean bool, boolean bool_5_, boolean bool_6_, byte i) {
		if (class300 != aClass300_12175 && Class36.aBool326 && Class204.method3713(-1087669731 * anInt11888, (byte) 26))
			Class524.method8685(-522212835);
		aClass300_12175 = class300;
		if (aClass300_12175 != null) {
			if (bool)
				aString12169 = aClass300_12175.aString3314;
			if (bool_5_)
				anInt12171 = 1584612661 * aClass300_12175.anInt3295;
			if (bool_6_)
				aClass304_12167 = null;
		}
		if (null != aClass621_11948)
			aClass621_11948.method10131();
	}

	public Class564 method16707(Class178 class178, byte i) {
		return null;
	}

	Class559 method16744(Class178 class178, byte i) {
		if (null == aClass300_12175 || !method18624(class178, 526336, -1938267298))
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class435 class435_7_ = class178.method3113();
		int i_8_ = aClass72_11938.method1494((byte) 127);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_9_ = (-1096736227 * anInt11890 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_9_ / 10.0F) * -17780683;
		} else
			anInt11890 = ((int) ((float) (-1096736227 * anInt11890) - (float) (anInt11890 * -1096736227) / 10.0F) * -17780683);
		class435_7_.method6803(class435);
		class435_7_.method6819(0.0F, (float) (-20 - -1096736227 * anInt11890), 0.0F);
		Class588 class588 = method18352(905062517);
		NPCDefinition class300 = (aClass300_12175.anIntArray3286 != null ? aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 80) : aClass300_12175);
		boolean bool = class300.aClass430_3315 != null;
		aBool11919 = false;
		Class559 class559 = null;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1 && class300.aBool3269 && class588.aBool7770) {
			Class707 class707 = ((aClass707_11913.method14161(2066644169) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
			Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-1050992188) && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
			short i_10_ = Class523_Sub11.aClass625_10427.aShort8146;
			byte i_11_ = Class523_Sub11.aClass625_10427.aByte8145;
			if (aClass300_12175.aShort3296 > -1) {
				i_10_ = aClass300_12175.aShort3296;
				i_11_ = aClass300_12175.aByte3247;
			}
			Class167 class167;
			if (i_10_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1597493969) == 1)
				class167 = Class237.method4302(class178, i_8_, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, aClass167Array11928[0], i_10_, i_11_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -1788131486);
			else
				class167 = (Class53_Sub14.method17215(class178, i_8_, anInt11897 * 1360761263, 887325889 * anInt11898, 1882562377 * anInt11899, 1610497933 * aClass300_12175.anInt3260, aClass167Array11928[0], aClass300_12175.aShort3292 & 0xffff, aClass300_12175.aShort3293 & 0xffff, aClass300_12175.aByte3294 & 0xff, aClass300_12175.aByte3265 & 0xff, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 817575872));
			if (class167 != null) {
				class559 = Class238.method4306(method18629(-1571010153), -1618009319);
				aBool11919 = true;
				class178.method3287(false);
				if (bool)
					class167.method2708(class435_7_, null, 0);
				else {
					if (aClass180Array10823 == null || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, 783589387);
					class167.method2708(class435_7_, (aClass180Array10823[aClass167Array11928.length]), 0);
				}
				class178.method3287(true);
			}
		}
		if (bool) {
			if (aClass180Array10823 == null || aClass180Array10823.length > 1)
				method16714(1, -1733229411);
			class178.method3055(class435_7_, aClass180Array10823[0], class300.aClass430_3315);
		} else if (null == aClass180Array10823 || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, -1556759233);
		if (class559 == null)
			class559 = Class238.method4306(method18629(-184958998), 831025305);
		method18394(class178, aClass167Array11928, class435_7_, false, 614541374);
		for (int i_12_ = 0; i_12_ < aClass167Array11928.length; i_12_++) {
			if (aClass167Array11928[i_12_] != null) {
				if (aClass300_12175.aBool3319)
					aClass167Array11928[i_12_].method2839(1387127191 * anInt12168, anInt12163 * -1143414365, anInt12160 * -510089785, 1504904549 * anInt12172);
				if (bool)
					aClass167Array11928[i_12_].method2708(class435_7_, null, 0);
				else
					aClass167Array11928[i_12_].method2708(class435_7_, (aClass180Array10823[i_12_]), 0);
			} else if (!bool)
				aClass180Array10823[i_12_].aBool2000 = false;
		}
		if (null != aClass621_11948) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_13_ = 0; i_13_ < aClass167Array11928.length; i_13_++) {
			if (aClass167Array11928[i_13_] != null)
				aBool11919 |= aClass167Array11928[i_13_].method2730();
			aClass167Array11928[i_13_] = null;
		}
		anInt11889 = client.anInt10981 * -1789738199;
		return class559;
	}

	boolean method18624(Class178 class178, int i, int i_14_) {
		int i_15_ = i;
		Class588 class588 = method18352(1625505101);
		Class707 class707 = ((aClass707_11913.method14161(2078027710) && !aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
		Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-621063346) && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
		int i_16_ = class588.anInt7778 * -1464618725;
		int i_17_ = class588.anInt7773 * -1199122203;
		if (0 != i_16_ || 0 != i_17_ || 0 != class588.anInt7791 * -941991763 || -1578959099 * class588.anInt7788 != 0)
			i |= 0x7;
		boolean bool = (aByte11929 != 0 && client.anInt11011 >= -1284164047 * anInt11924 && client.anInt11011 < anInt11925 * 1874600493);
		if (bool)
			i |= 0x80000;
		boolean bool_18_ = false;
		if (0 != anInt11931 * 1766454463) {
			NPCDefinition class300 = (null != aClass300_12175.anIntArray3286 ? aClass300_12175.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 7) : aClass300_12175);
			if (class300 == null || client.anInt11011 >= (-2066969239 * anInt11951 + class300.anInt3320 * 1034868193))
				anInt11931 = 0;
			else {
				anInt11931 = ((255 - ((client.anInt11011 - anInt11951 * -2066969239) * 255 / (1034868193 * class300.anInt3320))) * 1980463935);
				bool_18_ = true;
			}
		}
		if (bool_18_)
			i |= 0x100;
		int i_19_ = aClass72_11938.method1494((byte) 57);
		Class167 class167 = (aClass167Array11928[0] = aClass300_12175.method5506(class178, i, Class80.aClass53_Sub17_866, Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, class707, class707_sub1, aClass707_Sub2_Sub1Array11933, anIntArray11934, i_19_, aClass302_12174, method18348(1322016613), false, (short) -28527));
		if (class167 == null)
			return false;
		anInt11901 = class167.method2804() * -1976100247;
		anInt11921 = class167.method2718() * -270798901;
		class167.method2834();
		method18386(class167, 1323881349);
		if (0 != i_16_ || i_17_ != 0) {
			method18346(i_19_, i_16_, i_17_, 585378281 * class588.anInt7774, class588.anInt7767 * 1872984397, 1643562736);
			if (1360761263 * anInt11897 != 0)
				aClass167Array11928[0].method2845(anInt11897 * 1360761263);
			if (anInt11898 * 887325889 != 0)
				aClass167Array11928[0].method2688(887325889 * anInt11898);
			if (0 != 1882562377 * anInt11899)
				aClass167Array11928[0].method2689(0, 1882562377 * anInt11899, 0);
		} else
			method18346(i_19_, method18338(2147000863) << 9, method18338(2140749369) << 9, 0, 0, 1000224625);
		if (bool)
			class167.method2839(aByte11926, aByte11927, aByte11936, aByte11929 & 0xff);
		if (bool_18_)
			class167.method2715((byte) (1766454463 * anInt11931), null);
		method18339(class178, class588, i_15_, i_16_, i_17_, i_19_, (byte) 120);
		return true;
	}

	void method16706(Class178 class178, short i) {
		if (null != aClass300_12175 && (aBool11949 || method18624(class178, 0, -1938267298))) {
			Class435 class435 = class178.method3113();
			class435.method6803(method10585());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, -562416384);
			for (int i_20_ = 0; i_20_ < aClass167Array11928.length; i_20_++)
				aClass167Array11928[i_20_] = null;
		}
	}

	public int method18625(int i, byte i_21_) {
		return anIntArray12173[i];
	}

	public void method18626(int i, int i_22_, int i_23_, boolean bool, int i_24_, int i_25_) {
		aByte10821 = aByte10818 = (byte) i;
		if (client.aClass505_11019.method8243(1066803462).method7282(i_22_, i_23_, -638715901))
			aByte10818++;
		if (aClass707_11913.method14161(283974468) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_26_ = 0; i_26_ < aClass515Array11912.length; i_26_++) {
			if (aClass515Array11912[i_26_].id * 985865715 != -1) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_26_].id, (byte) 29)));
				if (class671.aBool8602 && class671.anInt8590 * -61429051 != -1 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) 16)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_26_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_26_].id = 873938117;
				}
			}
		}
		if (!bool) {
			int i_27_ = i_22_ - anIntArray11885[0];
			int i_28_ = i_23_ - anIntArray11943[0];
			if (i_27_ >= -8 && i_27_ <= 8 && i_28_ >= -8 && i_28_ <= 8) {
				if (anInt11941 * 703205765 < anIntArray11885.length - 1)
					anInt11941 += -822788275;
				for (int i_29_ = 703205765 * anInt11941; i_29_ > 0; i_29_--) {
					anIntArray11885[i_29_] = anIntArray11885[i_29_ - 1];
					anIntArray11943[i_29_] = anIntArray11943[i_29_ - 1];
					aByteArray11944[i_29_] = aByteArray11944[i_29_ - 1];
				}
				anIntArray11885[0] = i_22_;
				anIntArray11943[0] = i_23_;
				aByteArray11944[0] = Class666.aClass666_8531.aByte8529;
				return;
			}
		}
		anInt11941 = 0;
		anInt11946 = 0;
		anInt11945 = 0;
		anIntArray11885[0] = i_22_;
		anIntArray11943[0] = i_23_;
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 = (float) ((i_24_ << 8) + (anIntArray11885[0] << 9));
		class437.aFloat4905 = (float) ((i_24_ << 8) + (anIntArray11943[0] << 9));
		method10573(class437);
		class437.method6949();
		if (aClass621_11948 != null)
			aClass621_11948.method10131();
	}

	public final boolean method18627(int i) {
		if (aClass300_12175 == null)
			return false;
		return true;
	}

	int method18348(int i) {
		if (-1 != anInt12166 * -511138625)
			return -511138625 * anInt12166;
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -58);
			if (class300 != null && -764434723 * class300.anInt3258 != -1)
				return class300.anInt3258 * -764434723;
		}
		return -764434723 * aClass300_12175.anInt3258;
	}

	public boolean method16717() {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 103) == null)
			return false;
		return true;
	}

	public final boolean method18628() {
		if (aClass300_12175 == null)
			return false;
		return true;
	}

	boolean method18629(int i) {
		return aBool12177 || aClass300_12175.aBool3287;
	}

	Class559 method16725(Class178 class178) {
		if (null == aClass300_12175 || !method18624(class178, 526336, -1938267298))
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class435 class435_30_ = class178.method3113();
		int i = aClass72_11938.method1494((byte) 9);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_31_ = (-1096736227 * anInt11890 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_31_ / 10.0F) * -17780683;
		} else
			anInt11890 = ((int) ((float) (-1096736227 * anInt11890) - (float) (anInt11890 * -1096736227) / 10.0F) * -17780683);
		class435_30_.method6803(class435);
		class435_30_.method6819(0.0F, (float) (-20 - -1096736227 * anInt11890), 0.0F);
		Class588 class588 = method18352(1714991308);
		NPCDefinition class300 = (aClass300_12175.anIntArray3286 != null ? aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 45) : aClass300_12175);
		boolean bool = class300.aClass430_3315 != null;
		aBool11919 = false;
		Class559 class559 = null;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1 && class300.aBool3269 && class588.aBool7770) {
			Class707 class707 = ((aClass707_11913.method14161(-1618981952) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
			Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-316364591) && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
			short i_32_ = Class523_Sub11.aClass625_10427.aShort8146;
			byte i_33_ = Class523_Sub11.aClass625_10427.aByte8145;
			if (aClass300_12175.aShort3296 > -1) {
				i_32_ = aClass300_12175.aShort3296;
				i_33_ = aClass300_12175.aByte3247;
			}
			Class167 class167;
			if (i_32_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1796488595) == 1)
				class167 = Class237.method4302(class178, i, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, aClass167Array11928[0], i_32_, i_33_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -782667227);
			else
				class167 = (Class53_Sub14.method17215(class178, i, anInt11897 * 1360761263, 887325889 * anInt11898, 1882562377 * anInt11899, 1610497933 * aClass300_12175.anInt3260, aClass167Array11928[0], aClass300_12175.aShort3292 & 0xffff, aClass300_12175.aShort3293 & 0xffff, aClass300_12175.aByte3294 & 0xff, aClass300_12175.aByte3265 & 0xff, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 546097629));
			if (class167 != null) {
				class559 = Class238.method4306(method18629(-1178909153), -390100619);
				aBool11919 = true;
				class178.method3287(false);
				if (bool)
					class167.method2708(class435_30_, null, 0);
				else {
					if (aClass180Array10823 == null || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, 2080543946);
					class167.method2708(class435_30_, (aClass180Array10823[aClass167Array11928.length]), 0);
				}
				class178.method3287(true);
			}
		}
		if (bool) {
			if (aClass180Array10823 == null || aClass180Array10823.length > 1)
				method16714(1, -783564420);
			class178.method3055(class435_30_, aClass180Array10823[0], class300.aClass430_3315);
		} else if (null == aClass180Array10823 || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, -1746644906);
		if (class559 == null)
			class559 = Class238.method4306(method18629(1907935693), -425024892);
		method18394(class178, aClass167Array11928, class435_30_, false, 1497068505);
		for (int i_34_ = 0; i_34_ < aClass167Array11928.length; i_34_++) {
			if (aClass167Array11928[i_34_] != null) {
				if (aClass300_12175.aBool3319)
					aClass167Array11928[i_34_].method2839(1387127191 * anInt12168, anInt12163 * -1143414365, anInt12160 * -510089785, 1504904549 * anInt12172);
				if (bool)
					aClass167Array11928[i_34_].method2708(class435_30_, null, 0);
				else
					aClass167Array11928[i_34_].method2708(class435_30_, (aClass180Array10823[i_34_]), 0);
			} else if (!bool)
				aClass180Array10823[i_34_].aBool2000 = false;
		}
		if (null != aClass621_11948) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_35_ = 0; i_35_ < aClass167Array11928.length; i_35_++) {
			if (aClass167Array11928[i_35_] != null)
				aBool11919 |= aClass167Array11928[i_35_].method2730();
			aClass167Array11928[i_35_] = null;
		}
		anInt11889 = client.anInt10981 * -1789738199;
		return class559;
	}

	boolean method16698(Class178 class178, int i, int i_36_, byte i_37_) {
		if (null == aClass300_12175)
			return false;
		if (aClass300_12175.aClass430_3315 != null)
			return class178.method3095(i, i_36_, method10585(), aClass300_12175.aClass430_3315, 1825698631);
		if (!method18624(class178, 131072, -1938267298))
			return false;
		Class435 class435 = method10585();
		boolean bool = false;
		for (int i_38_ = 0; i_38_ < aClass167Array11928.length; i_38_++) {
			if (null != aClass167Array11928[i_38_] && aClass167Array11928[i_38_].aBool1798) {
				boolean bool_39_;
				while_143_: do {
					do {
						if (aClass300_12175.anInt3318 * -1645241963 <= 0) {
							if (aClass300_12175.anInt3274 * 1972847801 == -1) {
								if (1 != aClass300_12175.anInt3260 * 1610497933)
									break;
							} else if (aClass300_12175.anInt3274 * 1972847801 != 1)
								break;
						}
						bool_39_ = true;
						break while_143_;
					} while (false);
					bool_39_ = false;
				} while (false);
				boolean bool_40_ = bool_39_;
				boolean bool_41_ = aClass167Array11928[i_38_].method2709(i, i_36_, class435, bool_40_, ((aClass300_12175.anInt3318) * -1645241963));
				if (bool_41_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_42_ = 0; i_42_ < aClass167Array11928.length; i_42_++)
			aClass167Array11928[i_42_] = null;
		return bool;
	}

	public void method18630(int i, int i_43_, int i_44_, boolean bool, int i_45_) {
		aByte10821 = aByte10818 = (byte) i;
		if (client.aClass505_11019.method8243(97946459).method7282(i_43_, i_44_, -638715901))
			aByte10818++;
		if (aClass707_11913.method14161(1233843902) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_46_ = 0; i_46_ < aClass515Array11912.length; i_46_++) {
			if (aClass515Array11912[i_46_].id * 985865715 != -1) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_46_].id, (byte) -7)));
				if (class671.aBool8602 && class671.anInt8590 * -61429051 != -1 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) -21)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_46_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_46_].id = 873938117;
				}
			}
		}
		if (!bool) {
			int i_47_ = i_43_ - anIntArray11885[0];
			int i_48_ = i_44_ - anIntArray11943[0];
			if (i_47_ >= -8 && i_47_ <= 8 && i_48_ >= -8 && i_48_ <= 8) {
				if (anInt11941 * 703205765 < anIntArray11885.length - 1)
					anInt11941 += -822788275;
				for (int i_49_ = 703205765 * anInt11941; i_49_ > 0; i_49_--) {
					anIntArray11885[i_49_] = anIntArray11885[i_49_ - 1];
					anIntArray11943[i_49_] = anIntArray11943[i_49_ - 1];
					aByteArray11944[i_49_] = aByteArray11944[i_49_ - 1];
				}
				anIntArray11885[0] = i_43_;
				anIntArray11943[0] = i_44_;
				aByteArray11944[0] = Class666.aClass666_8531.aByte8529;
				return;
			}
		}
		anInt11941 = 0;
		anInt11946 = 0;
		anInt11945 = 0;
		anIntArray11885[0] = i_43_;
		anIntArray11943[0] = i_44_;
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 = (float) ((i_45_ << 8) + (anIntArray11885[0] << 9));
		class437.aFloat4905 = (float) ((i_45_ << 8) + (anIntArray11943[0] << 9));
		method10573(class437);
		class437.method6949();
		if (aClass621_11948 != null)
			aClass621_11948.method10131();
	}

	public int method18631(int i) {
		return anIntArray12173[i];
	}

	final void method16704(byte i) {
		throw new IllegalStateException();
	}

	public int method18632(int i, byte i_50_) {
		return anIntArray12170[i];
	}

	public int method18633(int i) {
		return anIntArray12173[i];
	}

	public void method18634(int i, int i_51_, int i_52_, int i_53_) {
		anIntArray12170[i] = i_51_;
		anIntArray12173[i] = i_52_;
	}

	boolean method18635() {
		return aBool12177 || aClass300_12175.aBool3287;
	}

	public Class533 method18353(byte i) {
		if (aClass533_11900 != null && aClass533_11900.aString7130 == null)
			return null;
		return aClass533_11900;
	}

	public void method18636(String string, int i, int i_54_, int i_55_) {
		int i_56_ = (Class286.method5150(2056217218) * (Class523_Sub11.aClass625_10427.anInt8154 * -1982198581));
		method18416(string, i, i_54_, i_56_, (byte) 92);
	}

	public int method18403(byte i) {
		return -1087669731 * anInt11888 + 1;
	}

	public Class292 method176(byte i) {
		return Class292.aClass292_3156;
	}

	public int method18637(int i) {
		return anIntArray12173[i];
	}

	public Class523_Sub29 method181(int i) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		return (Class449.method7268(aByte10821, ((int) method10569().aClass437_4862.aFloat4903 + 292859392 * class592.localX), -(int) method10569().aClass437_4862.aFloat4904, ((int) method10569().aClass437_4862.aFloat4905 + 597568000 * class592.localY), 1825211535));
	}

	public Class440 method179(int i) {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	final void method16703(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_57_, int i_58_, boolean bool, int i_59_) {
		throw new IllegalStateException();
	}

	public boolean method16710(int i) {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 4) == null)
			return false;
		return true;
	}

	public Class437 method191() {
		return Class437.method6878();
	}

	public Class292 method189() {
		return Class292.aClass292_3156;
	}

	public Class292 method187() {
		return Class292.aClass292_3156;
	}

	public Class292 method177() {
		return Class292.aClass292_3156;
	}

	boolean method16736(Class178 class178, int i, int i_60_) {
		if (null == aClass300_12175)
			return false;
		if (aClass300_12175.aClass430_3315 != null)
			return class178.method3095(i, i_60_, method10585(), aClass300_12175.aClass430_3315, 1944335657);
		if (!method18624(class178, 131072, -1938267298))
			return false;
		Class435 class435 = method10585();
		boolean bool = false;
		for (int i_61_ = 0; i_61_ < aClass167Array11928.length; i_61_++) {
			if (null != aClass167Array11928[i_61_] && aClass167Array11928[i_61_].aBool1798) {
				boolean bool_62_;
				while_144_: do {
					do {
						if (aClass300_12175.anInt3318 * -1645241963 <= 0) {
							if (aClass300_12175.anInt3274 * 1972847801 == -1) {
								if (1 != aClass300_12175.anInt3260 * 1610497933)
									break;
							} else if (aClass300_12175.anInt3274 * 1972847801 != 1)
								break;
						}
						bool_62_ = true;
						break while_144_;
					} while (false);
					bool_62_ = false;
				} while (false);
				boolean bool_63_ = bool_62_;
				boolean bool_64_ = aClass167Array11928[i_61_].method2709(i, i_60_, class435, bool_63_, ((aClass300_12175.anInt3318) * -1645241963));
				if (bool_64_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_65_ = 0; i_65_ < aClass167Array11928.length; i_65_++)
			aClass167Array11928[i_65_] = null;
		return bool;
	}

	public Class523_Sub29 method183() {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		return (Class449.method7268(aByte10821, ((int) method10569().aClass437_4862.aFloat4903 + 292859392 * class592.localX), -(int) method10569().aClass437_4862.aFloat4904, ((int) method10569().aClass437_4862.aFloat4905 + 597568000 * class592.localY), -648403327));
	}

	final boolean method16731() {
		return false;
	}

	public Class440 method186() {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	public Class564 method16721(Class178 class178) {
		return null;
	}

	public int method16740(int i) {
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -27);
			if (class300 != null && class300.anInt3309 * 1004727181 != -1)
				return class300.anInt3309 * 1004727181;
		}
		return (1004727181 * aClass300_12175.anInt3309 != -1 ? aClass300_12175.anInt3309 * 1004727181 : super.method16740(-476014448));
	}

	public int method16723() {
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -33);
			if (class300 != null && class300.anInt3309 * 1004727181 != -1)
				return class300.anInt3309 * 1004727181;
		}
		return (1004727181 * aClass300_12175.anInt3309 != -1 ? aClass300_12175.anInt3309 * 1004727181 : super.method16740(-2080887974));
	}

	final boolean method16699(int i) {
		return false;
	}

	void method16756(Class178 class178) {
		if (null != aClass300_12175 && (aBool11949 || method18624(class178, 0, -1938267298))) {
			Class435 class435 = class178.method3113();
			class435.method6803(method10585());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, -1365037209);
			for (int i = 0; i < aClass167Array11928.length; i++)
				aClass167Array11928[i] = null;
		}
	}

	final void method16734() {
		throw new IllegalStateException();
	}

	void method16727(Class178 class178) {
		if (null != aClass300_12175 && (aBool11949 || method18624(class178, 0, -1938267298))) {
			Class435 class435 = class178.method3113();
			class435.method6803(method10585());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, -1591450769);
			for (int i = 0; i < aClass167Array11928.length; i++)
				aClass167Array11928[i] = null;
		}
	}

	void method16728(Class178 class178) {
		if (null != aClass300_12175 && (aBool11949 || method18624(class178, 0, -1938267298))) {
			Class435 class435 = class178.method3113();
			class435.method6803(method10585());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, 760439381);
			for (int i = 0; i < aClass167Array11928.length; i++)
				aClass167Array11928[i] = null;
		}
	}

	Class559 method16726(Class178 class178) {
		if (null == aClass300_12175 || !method18624(class178, 526336, -1938267298))
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class435 class435_66_ = class178.method3113();
		int i = aClass72_11938.method1494((byte) 53);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_67_ = (-1096736227 * anInt11890 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_67_ / 10.0F) * -17780683;
		} else
			anInt11890 = ((int) ((float) (-1096736227 * anInt11890) - (float) (anInt11890 * -1096736227) / 10.0F) * -17780683);
		class435_66_.method6803(class435);
		class435_66_.method6819(0.0F, (float) (-20 - -1096736227 * anInt11890), 0.0F);
		Class588 class588 = method18352(-136335882);
		NPCDefinition class300 = (aClass300_12175.anIntArray3286 != null ? aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 59) : aClass300_12175);
		boolean bool = class300.aClass430_3315 != null;
		aBool11919 = false;
		Class559 class559 = null;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1 && class300.aBool3269 && class588.aBool7770) {
			Class707 class707 = ((aClass707_11913.method14161(269341338) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
			Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-1589565829) && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
			short i_68_ = Class523_Sub11.aClass625_10427.aShort8146;
			byte i_69_ = Class523_Sub11.aClass625_10427.aByte8145;
			if (aClass300_12175.aShort3296 > -1) {
				i_68_ = aClass300_12175.aShort3296;
				i_69_ = aClass300_12175.aByte3247;
			}
			Class167 class167;
			if (i_68_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1658143146) == 1)
				class167 = Class237.method4302(class178, i, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, aClass167Array11928[0], i_68_, i_69_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -1451613275);
			else
				class167 = (Class53_Sub14.method17215(class178, i, anInt11897 * 1360761263, 887325889 * anInt11898, 1882562377 * anInt11899, 1610497933 * aClass300_12175.anInt3260, aClass167Array11928[0], aClass300_12175.aShort3292 & 0xffff, aClass300_12175.aShort3293 & 0xffff, aClass300_12175.aByte3294 & 0xff, aClass300_12175.aByte3265 & 0xff, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 195949605));
			if (class167 != null) {
				class559 = Class238.method4306(method18629(-204927418), 2045913045);
				aBool11919 = true;
				class178.method3287(false);
				if (bool)
					class167.method2708(class435_66_, null, 0);
				else {
					if (aClass180Array10823 == null || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, -533627543);
					class167.method2708(class435_66_, (aClass180Array10823[aClass167Array11928.length]), 0);
				}
				class178.method3287(true);
			}
		}
		if (bool) {
			if (aClass180Array10823 == null || aClass180Array10823.length > 1)
				method16714(1, 1168390933);
			class178.method3055(class435_66_, aClass180Array10823[0], class300.aClass430_3315);
		} else if (null == aClass180Array10823 || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, 532183710);
		if (class559 == null)
			class559 = Class238.method4306(method18629(-1329457504), 1413180223);
		method18394(class178, aClass167Array11928, class435_66_, false, -1316208319);
		for (int i_70_ = 0; i_70_ < aClass167Array11928.length; i_70_++) {
			if (aClass167Array11928[i_70_] != null) {
				if (aClass300_12175.aBool3319)
					aClass167Array11928[i_70_].method2839(1387127191 * anInt12168, anInt12163 * -1143414365, anInt12160 * -510089785, 1504904549 * anInt12172);
				if (bool)
					aClass167Array11928[i_70_].method2708(class435_66_, null, 0);
				else
					aClass167Array11928[i_70_].method2708(class435_66_, (aClass180Array10823[i_70_]), 0);
			} else if (!bool)
				aClass180Array10823[i_70_].aBool2000 = false;
		}
		if (null != aClass621_11948) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_71_ = 0; i_71_ < aClass167Array11928.length; i_71_++) {
			if (aClass167Array11928[i_71_] != null)
				aBool11919 |= aClass167Array11928[i_71_].method2730();
			aClass167Array11928[i_71_] = null;
		}
		anInt11889 = client.anInt10981 * -1789738199;
		return class559;
	}

	final boolean method16730() {
		return false;
	}

	public int method18342(byte i) {
		if (null != aClass300_12175.anIntArray3286) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 8);
			if (null != class300 && -1 != class300.anInt3284 * 1320231043)
				return class300.anInt3284 * 1320231043;
		}
		return aClass300_12175.anInt3284 * 1320231043;
	}

	final void method16732(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_72_, int i_73_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method16697() {
		throw new IllegalStateException();
	}

	public Class437 method178(int i) {
		return Class437.method6878();
	}

	int method16750() {
		if (aClass300_12175 == null)
			return 0;
		return -1645241963 * aClass300_12175.anInt3318;
	}

	int method18391() {
		if (-1 != anInt12166 * -511138625)
			return -511138625 * anInt12166;
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 52);
			if (class300 != null && -764434723 * class300.anInt3258 != -1)
				return class300.anInt3258 * -764434723;
		}
		return -764434723 * aClass300_12175.anInt3258;
	}

	int method18392() {
		if (-1 != anInt12166 * -511138625)
			return -511138625 * anInt12166;
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 30);
			if (class300 != null && -764434723 * class300.anInt3258 != -1)
				return class300.anInt3258 * -764434723;
		}
		return -764434723 * aClass300_12175.anInt3258;
	}

	final void method16735() {
		throw new IllegalStateException();
	}

	int method18393() {
		if (-1 != anInt12166 * -511138625)
			return -511138625 * anInt12166;
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -18);
			if (class300 != null && -764434723 * class300.anInt3258 != -1)
				return class300.anInt3258 * -764434723;
		}
		return -764434723 * aClass300_12175.anInt3258;
	}

	public int method69(int i) {
		return anInt11888 * -1087669731;
	}

	public final boolean method18638() {
		if (aClass300_12175 == null)
			return false;
		return true;
	}

	public int method18397() {
		if (null != aClass300_12175.anIntArray3286) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 60);
			if (null != class300 && -1 != class300.anInt3284 * 1320231043)
				return class300.anInt3284 * 1320231043;
		}
		return aClass300_12175.anInt3284 * 1320231043;
	}

	public int method182() {
		return anInt11888 * -1087669731;
	}

	public boolean method18395() {
		return Class523_Sub11.aClass625_10427.aBool8153;
	}

	public int method18400() {
		return -1087669731 * anInt11888 + 1;
	}

	public int method18327() {
		return -1087669731 * anInt11888 + 1;
	}

	boolean method18639() {
		return aBool12177 || aClass300_12175.aBool3287;
	}

	boolean method16713(Class178 class178, int i, int i_74_) {
		if (null == aClass300_12175)
			return false;
		if (aClass300_12175.aClass430_3315 != null)
			return class178.method3095(i, i_74_, method10585(), aClass300_12175.aClass430_3315, -469225411);
		if (!method18624(class178, 131072, -1938267298))
			return false;
		Class435 class435 = method10585();
		boolean bool = false;
		for (int i_75_ = 0; i_75_ < aClass167Array11928.length; i_75_++) {
			if (null != aClass167Array11928[i_75_] && aClass167Array11928[i_75_].aBool1798) {
				boolean bool_76_;
				while_145_: do {
					do {
						if (aClass300_12175.anInt3318 * -1645241963 <= 0) {
							if (aClass300_12175.anInt3274 * 1972847801 == -1) {
								if (1 != aClass300_12175.anInt3260 * 1610497933)
									break;
							} else if (aClass300_12175.anInt3274 * 1972847801 != 1)
								break;
						}
						bool_76_ = true;
						break while_145_;
					} while (false);
					bool_76_ = false;
				} while (false);
				boolean bool_77_ = bool_76_;
				boolean bool_78_ = aClass167Array11928[i_75_].method2709(i, i_74_, class435, bool_77_, ((aClass300_12175.anInt3318) * -1645241963));
				if (bool_78_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_79_ = 0; i_79_ < aClass167Array11928.length; i_79_++)
			aClass167Array11928[i_79_] = null;
		return bool;
	}

	int method16738() {
		if (aClass300_12175 == null)
			return 0;
		return -1645241963 * aClass300_12175.anInt3318;
	}

	public Class647_Sub1_Sub3_Sub1_Sub1(Class560 class560) {
		super(class560, Class265.aClass98_Sub1_Sub2_2858);
		anIntArray12170 = new int[6];
		anIntArray12173 = new int[6];
		method18655((byte) -45);
	}

	public Class533 method18336() {
		if (aClass533_11900 != null && aClass533_11900.aString7130 == null)
			return null;
		return aClass533_11900;
	}

	public Class440 method185() {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	public Class437 method188() {
		return Class437.method6878();
	}

	public Class437 method175() {
		return Class437.method6878();
	}

	public int method18413() {
		if (null != aClass300_12175.anIntArray3286) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 40);
			if (null != class300 && -1 != class300.anInt3284 * 1320231043)
				return class300.anInt3284 * 1320231043;
		}
		return aClass300_12175.anInt3284 * 1320231043;
	}

	public Class440 method184() {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	void method18640() {
		anInt12168 = (32 + (int) (Math.random() * 4.0)) * -754799065;
		anInt12163 = (3 + (int) (Math.random() * 2.0)) * 2078890507;
		anInt12160 = (16 + (int) (Math.random() * 3.0)) * -358380553;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1726260525) == 1)
			anInt12172 = (int) (Math.random() * 6.0) * -571825043;
		else
			anInt12172 = (int) (Math.random() * 12.0) * -571825043;
	}

	void method18641() {
		anInt12168 = (32 + (int) (Math.random() * 4.0)) * -754799065;
		anInt12163 = (3 + (int) (Math.random() * 2.0)) * 2078890507;
		anInt12160 = (16 + (int) (Math.random() * 3.0)) * -358380553;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1762063894) == 1)
			anInt12172 = (int) (Math.random() * 6.0) * -571825043;
		else
			anInt12172 = (int) (Math.random() * 12.0) * -571825043;
	}

	public void method18642(NPCDefinition class300) {
		method18623(class300, true, true, true, (byte) -115);
	}

	public void method18643(NPCDefinition class300, boolean bool, boolean bool_80_, boolean bool_81_) {
		if (class300 != aClass300_12175 && Class36.aBool326 && Class204.method3713(-1087669731 * anInt11888, (byte) 44))
			Class524.method8685(-522212835);
		aClass300_12175 = class300;
		if (aClass300_12175 != null) {
			if (bool)
				aString12169 = aClass300_12175.aString3314;
			if (bool_80_)
				anInt12171 = 1584612661 * aClass300_12175.anInt3295;
			if (bool_81_)
				aClass304_12167 = null;
		}
		if (null != aClass621_11948)
			aClass621_11948.method10131();
	}

	int method18345() {
		if (-1 != anInt12166 * -511138625)
			return -511138625 * anInt12166;
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -30);
			if (class300 != null && -764434723 * class300.anInt3258 != -1)
				return class300.anInt3258 * -764434723;
		}
		return -764434723 * aClass300_12175.anInt3258;
	}

	public final void method18644(Class682 class682, int i) {
		int i_82_ = anIntArray11885[0];
		int i_83_ = anIntArray11943[0];
		switch (616149425 * class682.anInt8658) {
		case 2:
			i_82_++;
			break;
		case 3:
			i_83_++;
			break;
		case 5:
			i_83_--;
			break;
		case 4:
			i_82_++;
			i_83_++;
			break;
		case 1:
			i_82_--;
			i_83_++;
			break;
		case 6:
			i_82_++;
			i_83_--;
			break;
		case 0:
			i_82_--;
			i_83_--;
			break;
		case 7:
			i_82_--;
			break;
		}
		if (aClass707_11913.method14161(-1666265483) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_84_ = 0; i_84_ < aClass515Array11912.length; i_84_++) {
			if (-1 != 985865715 * aClass515Array11912[i_84_].id) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_84_].id, (byte) 66)));
				if (class671.aBool8602 && -61429051 * class671.anInt8590 != -1 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) 27)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_84_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_84_].id = 873938117;
				}
			}
		}
		if (703205765 * anInt11941 < anIntArray11885.length - 1)
			anInt11941 += -822788275;
		for (int i_85_ = anInt11941 * 703205765; i_85_ > 0; i_85_--) {
			anIntArray11885[i_85_] = anIntArray11885[i_85_ - 1];
			anIntArray11943[i_85_] = anIntArray11943[i_85_ - 1];
			aByteArray11944[i_85_] = aByteArray11944[i_85_ - 1];
		}
		anIntArray11885[0] = i_82_;
		anIntArray11943[0] = i_83_;
		aByteArray11944[0] = (byte) i;
	}

	public void method18645(int i, int i_86_, int i_87_, boolean bool, int i_88_) {
		aByte10821 = aByte10818 = (byte) i;
		if (client.aClass505_11019.method8243(-1024732344).method7282(i_86_, i_87_, -638715901))
			aByte10818++;
		if (aClass707_11913.method14161(1669843126) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_89_ = 0; i_89_ < aClass515Array11912.length; i_89_++) {
			if (aClass515Array11912[i_89_].id * 985865715 != -1) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_89_].id, (byte) 1)));
				if (class671.aBool8602 && class671.anInt8590 * -61429051 != -1 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) -92)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_89_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_89_].id = 873938117;
				}
			}
		}
		if (!bool) {
			int i_90_ = i_86_ - anIntArray11885[0];
			int i_91_ = i_87_ - anIntArray11943[0];
			if (i_90_ >= -8 && i_90_ <= 8 && i_91_ >= -8 && i_91_ <= 8) {
				if (anInt11941 * 703205765 < anIntArray11885.length - 1)
					anInt11941 += -822788275;
				for (int i_92_ = 703205765 * anInt11941; i_92_ > 0; i_92_--) {
					anIntArray11885[i_92_] = anIntArray11885[i_92_ - 1];
					anIntArray11943[i_92_] = anIntArray11943[i_92_ - 1];
					aByteArray11944[i_92_] = aByteArray11944[i_92_ - 1];
				}
				anIntArray11885[0] = i_86_;
				anIntArray11943[0] = i_87_;
				aByteArray11944[0] = Class666.aClass666_8531.aByte8529;
				return;
			}
		}
		anInt11941 = 0;
		anInt11946 = 0;
		anInt11945 = 0;
		anIntArray11885[0] = i_86_;
		anIntArray11943[0] = i_87_;
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 = (float) ((i_88_ << 8) + (anIntArray11885[0] << 9));
		class437.aFloat4905 = (float) ((i_88_ << 8) + (anIntArray11943[0] << 9));
		method10573(class437);
		class437.method6949();
		if (aClass621_11948 != null)
			aClass621_11948.method10131();
	}

	public boolean method18381(int i) {
		return Class523_Sub11.aClass625_10427.aBool8153;
	}

	public void method18646(int i, int i_93_, int i_94_, boolean bool, int i_95_) {
		aByte10821 = aByte10818 = (byte) i;
		if (client.aClass505_11019.method8243(-1177267019).method7282(i_93_, i_94_, -638715901))
			aByte10818++;
		if (aClass707_11913.method14161(1756133145) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_96_ = 0; i_96_ < aClass515Array11912.length; i_96_++) {
			if (aClass515Array11912[i_96_].id * 985865715 != -1) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_96_].id, (byte) 13)));
				if (class671.aBool8602 && class671.anInt8590 * -61429051 != -1 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) 25)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_96_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_96_].id = 873938117;
				}
			}
		}
		if (!bool) {
			int i_97_ = i_93_ - anIntArray11885[0];
			int i_98_ = i_94_ - anIntArray11943[0];
			if (i_97_ >= -8 && i_97_ <= 8 && i_98_ >= -8 && i_98_ <= 8) {
				if (anInt11941 * 703205765 < anIntArray11885.length - 1)
					anInt11941 += -822788275;
				for (int i_99_ = 703205765 * anInt11941; i_99_ > 0; i_99_--) {
					anIntArray11885[i_99_] = anIntArray11885[i_99_ - 1];
					anIntArray11943[i_99_] = anIntArray11943[i_99_ - 1];
					aByteArray11944[i_99_] = aByteArray11944[i_99_ - 1];
				}
				anIntArray11885[0] = i_93_;
				anIntArray11943[0] = i_94_;
				aByteArray11944[0] = Class666.aClass666_8531.aByte8529;
				return;
			}
		}
		anInt11941 = 0;
		anInt11946 = 0;
		anInt11945 = 0;
		anIntArray11885[0] = i_93_;
		anIntArray11943[0] = i_94_;
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 = (float) ((i_95_ << 8) + (anIntArray11885[0] << 9));
		class437.aFloat4905 = (float) ((i_95_ << 8) + (anIntArray11943[0] << 9));
		method10573(class437);
		class437.method6949();
		if (aClass621_11948 != null)
			aClass621_11948.method10131();
	}

	public final boolean method18647() {
		if (aClass300_12175 == null)
			return false;
		return true;
	}

	Class559 method16724(Class178 class178) {
		if (null == aClass300_12175 || !method18624(class178, 526336, -1938267298))
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class435 class435_100_ = class178.method3113();
		int i = aClass72_11938.method1494((byte) 87);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_101_ = (-1096736227 * anInt11890 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_101_ / 10.0F) * -17780683;
		} else
			anInt11890 = ((int) ((float) (-1096736227 * anInt11890) - (float) (anInt11890 * -1096736227) / 10.0F) * -17780683);
		class435_100_.method6803(class435);
		class435_100_.method6819(0.0F, (float) (-20 - -1096736227 * anInt11890), 0.0F);
		Class588 class588 = method18352(-52945986);
		NPCDefinition class300 = (aClass300_12175.anIntArray3286 != null ? aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 8) : aClass300_12175);
		boolean bool = class300.aClass430_3315 != null;
		aBool11919 = false;
		Class559 class559 = null;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1 && class300.aBool3269 && class588.aBool7770) {
			Class707 class707 = ((aClass707_11913.method14161(1892689999) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
			Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-1544102712) && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
			short i_102_ = Class523_Sub11.aClass625_10427.aShort8146;
			byte i_103_ = Class523_Sub11.aClass625_10427.aByte8145;
			if (aClass300_12175.aShort3296 > -1) {
				i_102_ = aClass300_12175.aShort3296;
				i_103_ = aClass300_12175.aByte3247;
			}
			Class167 class167;
			if (i_102_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1849264630) == 1)
				class167 = Class237.method4302(class178, i, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, aClass167Array11928[0], i_102_, i_103_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -504705796);
			else
				class167 = (Class53_Sub14.method17215(class178, i, anInt11897 * 1360761263, 887325889 * anInt11898, 1882562377 * anInt11899, 1610497933 * aClass300_12175.anInt3260, aClass167Array11928[0], aClass300_12175.aShort3292 & 0xffff, aClass300_12175.aShort3293 & 0xffff, aClass300_12175.aByte3294 & 0xff, aClass300_12175.aByte3265 & 0xff, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 1444560330));
			if (class167 != null) {
				class559 = Class238.method4306(method18629(-2005594741), -1189573553);
				aBool11919 = true;
				class178.method3287(false);
				if (bool)
					class167.method2708(class435_100_, null, 0);
				else {
					if (aClass180Array10823 == null || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, -1581070772);
					class167.method2708(class435_100_, (aClass180Array10823[aClass167Array11928.length]), 0);
				}
				class178.method3287(true);
			}
		}
		if (bool) {
			if (aClass180Array10823 == null || aClass180Array10823.length > 1)
				method16714(1, -1098846254);
			class178.method3055(class435_100_, aClass180Array10823[0], class300.aClass430_3315);
		} else if (null == aClass180Array10823 || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, 1050337163);
		if (class559 == null)
			class559 = Class238.method4306(method18629(-280785592), 1748044275);
		method18394(class178, aClass167Array11928, class435_100_, false, -648521080);
		for (int i_104_ = 0; i_104_ < aClass167Array11928.length; i_104_++) {
			if (aClass167Array11928[i_104_] != null) {
				if (aClass300_12175.aBool3319)
					aClass167Array11928[i_104_].method2839(1387127191 * anInt12168, anInt12163 * -1143414365, anInt12160 * -510089785, 1504904549 * anInt12172);
				if (bool)
					aClass167Array11928[i_104_].method2708(class435_100_, null, 0);
				else
					aClass167Array11928[i_104_].method2708(class435_100_, (aClass180Array10823[i_104_]), 0);
			} else if (!bool)
				aClass180Array10823[i_104_].aBool2000 = false;
		}
		if (null != aClass621_11948) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_105_ = 0; i_105_ < aClass167Array11928.length; i_105_++) {
			if (aClass167Array11928[i_105_] != null)
				aBool11919 |= aClass167Array11928[i_105_].method2730();
			aClass167Array11928[i_105_] = null;
		}
		anInt11889 = client.anInt10981 * -1789738199;
		return class559;
	}

	public int method18648(int i) {
		return anIntArray12170[i];
	}

	public int method18387() {
		if (null != aClass300_12175.anIntArray3286) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 59);
			if (null != class300 && -1 != class300.anInt3284 * 1320231043)
				return class300.anInt3284 * 1320231043;
		}
		return aClass300_12175.anInt3284 * 1320231043;
	}

	boolean method18649() {
		return aBool12177 || aClass300_12175.aBool3287;
	}

	public int method18650(int i) {
		return anIntArray12170[i];
	}

	boolean method18651() {
		return aBool12177 || aClass300_12175.aBool3287;
	}

	public Class437 method180() {
		return Class437.method6878();
	}

	public boolean method18351() {
		return Class523_Sub11.aClass625_10427.aBool8153;
	}

	public Class437 method190() {
		return Class437.method6878();
	}

	public final void method18652(Class682 class682, int i, int i_106_) {
		int i_107_ = anIntArray11885[0];
		int i_108_ = anIntArray11943[0];
		switch (616149425 * class682.anInt8658) {
		case 2:
			i_107_++;
			break;
		case 3:
			i_108_++;
			break;
		case 5:
			i_108_--;
			break;
		case 4:
			i_107_++;
			i_108_++;
			break;
		case 1:
			i_107_--;
			i_108_++;
			break;
		case 6:
			i_107_++;
			i_108_--;
			break;
		case 0:
			i_107_--;
			i_108_--;
			break;
		case 7:
			i_107_--;
			break;
		}
		if (aClass707_11913.method14161(1147324852) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_109_ = 0; i_109_ < aClass515Array11912.length; i_109_++) {
			if (-1 != 985865715 * aClass515Array11912[i_109_].id) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_109_].id, (byte) 43)));
				if (class671.aBool8602 && -61429051 * class671.anInt8590 != -1 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) 13)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_109_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_109_].id = 873938117;
				}
			}
		}
		if (703205765 * anInt11941 < anIntArray11885.length - 1)
			anInt11941 += -822788275;
		for (int i_110_ = anInt11941 * 703205765; i_110_ > 0; i_110_--) {
			anIntArray11885[i_110_] = anIntArray11885[i_110_ - 1];
			anIntArray11943[i_110_] = anIntArray11943[i_110_ - 1];
			aByteArray11944[i_110_] = aByteArray11944[i_110_ - 1];
		}
		anIntArray11885[0] = i_107_;
		anIntArray11943[0] = i_108_;
		aByteArray11944[0] = (byte) i;
	}

	public int method18653(int i) {
		return anIntArray12173[i];
	}

	public int method18654(int i) {
		return anIntArray12173[i];
	}

	void method18655(byte i) {
		anInt12168 = (32 + (int) (Math.random() * 4.0)) * -754799065;
		anInt12163 = (3 + (int) (Math.random() * 2.0)) * 2078890507;
		anInt12160 = (16 + (int) (Math.random() * 3.0)) * -358380553;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1552356406) == 1)
			anInt12172 = (int) (Math.random() * 6.0) * -571825043;
		else
			anInt12172 = (int) (Math.random() * 12.0) * -571825043;
	}

	public int method18656(int i) {
		return anIntArray12173[i];
	}

	public int method16722() {
		if (aClass300_12175.anIntArray3286 != null) {
			NPCDefinition class300 = aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -23);
			if (class300 != null && class300.anInt3309 * 1004727181 != -1)
				return class300.anInt3309 * 1004727181;
		}
		return (1004727181 * aClass300_12175.anInt3309 != -1 ? aClass300_12175.anInt3309 * 1004727181 : super.method16740(-82232576));
	}

	public void method18657(String string, int i, int i_111_) {
		int i_112_ = (Class286.method5150(2052785009) * (Class523_Sub11.aClass625_10427.anInt8154 * -1982198581));
		method18416(string, i, i_111_, i_112_, (byte) 115);
	}

	public boolean method16748() {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 16) == null)
			return false;
		return true;
	}

	public boolean method16737() {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -67) == null)
			return false;
		return true;
	}

	public boolean method16742() {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -27) == null)
			return false;
		return true;
	}

	public boolean method16729() {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -56) == null)
			return false;
		return true;
	}

	int method16705(int i) {
		if (aClass300_12175 == null)
			return 0;
		return -1645241963 * aClass300_12175.anInt3318;
	}

	public boolean method16745() {
		if (aClass300_12175.anIntArray3286 != null && aClass300_12175.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 36) == null)
			return false;
		return true;
	}
}
