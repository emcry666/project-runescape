/* Class647_Sub1_Sub3_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Player extends Class647_Sub1_Sub3_Sub1 {
	public int anInt12178;
	public String username;
	public boolean aBool12180;
	String suffixTitle;
	public byte aByte12182 = 0;
	public Class623 aClass623_12183;
	public int anInt12184;
	String prefixTitle;
	public int anInt12186;
	public int anInt12187;
	public String displayName;
	public int anInt12189;
	public int anInt12190;
	public int[] anIntArray12191;
	public int anInt12192;
	public int anInt12193;
	public int anInt12194;
	public int anInt12195;
	public Class634 visible;
	public int anInt12197;
	public int anInt12198;
	int anInt12199;
	public Class210 aClass210_12200;
	public int[] anIntArray12201;
	public boolean aBool12202;

	public Class440 method179(int i) {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	public Player(Class560 class560, int i) {
		super(class560, i, Class669.aClass98_Sub1_Sub1_8582);
		anIntArray12201 = new int[8];
		anIntArray12191 = new int[8];
		anInt12186 = 0;
		anInt12187 = 0;
		anInt12178 = -1072311087;
		anInt12189 = 0;
		anInt12195 = 505899647;
		aBool12180 = false;
		anInt12192 = 0;
		anInt12184 = -1951308775;
		anInt12194 = 592205863;
		anInt12193 = -111600869;
		anInt12190 = 1599306767;
		anInt12197 = 0;
		anInt12198 = -579882599;
		aClass210_12200 = Class210.aClass210_2258;
		visible = Class634.aClass634_8273;
		aBool12202 = false;
		method18672(2089492517);
	}

	public void decodePlayerLook(Class523_Sub34 class523_sub34, byte i, byte i_0_) {
		aByte12182 = i;
		int i_1_ = -1;
		anInt12192 = 0;
		int[] is = new int[Class655.aClass630_8423.disabledSlots.length];
		Class2[] class2s = new Class2[Class655.aClass630_8423.disabledSlots.length];
		ItemDefinitions[] class12s = new ItemDefinitions[Class655.aClass630_8423.disabledSlots.length];
		for (int i_2_ = 0; i_2_ < Class655.aClass630_8423.disabledSlots.length; i_2_++) {
			if (Class655.aClass630_8423.disabledSlots[i_2_] != 1) {
				int i_3_ = class523_sub34.readUnsignedByte(1783027415);
				if (i_3_ == 0)
					is[i_2_] = 0;
				else {
					int i_4_ = class523_sub34.readUnsignedByte(-804486046);
					int i_5_ = (i_3_ << 8) + i_4_;
					if (0 == i_2_ && 65535 == i_5_) {
						i_1_ = class523_sub34.readBigSmart((byte) -20);
						anInt12192 = (class523_sub34.readUnsignedByte(1566707047) * 1821813279);
						break;
					}
					if (i_5_ >= 16384) {
						i_5_ -= 16384;
						is[i_2_] = i_5_ | 0x40000000;
						class12s[i_2_] = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_5_, (byte) 112);
						int i_6_ = class12s[i_2_].anInt160 * 675808507;
						if (0 != i_6_)
							anInt12192 = i_6_ * 1821813279;
					} else
						is[i_2_] = i_5_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_1_ == -1) {
			int i_7_ = class523_sub34.readUnsignedShort(-83638912);
			int i_8_ = 0;
			for (int i_9_ = 0; i_9_ < Class655.aClass630_8423.disabledSlots.length; i_9_++) {
				if (Class655.aClass630_8423.disabledSlots[i_9_] == 0) {
					if ((i_7_ & 1 << i_8_) != 0)
						class2s[i_9_] = Class470.method7630(class12s[i_9_], class523_sub34, 320675552);
					i_8_++;
				}
			}
		}
		int[] colors = new int[10];
		for (int i_11_ = 0; i_11_ < 10; i_11_++) {
			int i_12_ = class523_sub34.readUnsignedByte(-944929441);
			if (Class207.aShortArrayArrayArray2248.length < 1 || i_12_ < 0 || (i_12_ >= Class207.aShortArrayArrayArray2248[i_11_][0].length))
				i_12_ = 0;
			colors[i_11_] = i_12_;
		}
		int[] is_13_ = new int[10];
		for (int i_14_ = 0; i_14_ < 10; i_14_++) {
			int i_15_ = class523_sub34.readUnsignedByte(279347272);
			if (Class21.aShortArrayArrayArray214.length < 1 || i_15_ < 0 || i_15_ >= Class21.aShortArrayArrayArray214[i_14_][0].length)
				i_15_ = 0;
			is_13_[i_14_] = i_15_;
		}
		anInt12199 = class523_sub34.readUnsignedShort(-1877722797) * -633304531;
		if (null == aClass623_12183)
			aClass623_12183 = new Class623();
		int i_16_ = aClass623_12183.anInt8106 * -1137516987;
		int[] is_17_ = aClass623_12183.anIntArray8102;
		aClass623_12183.method10174(method18348(1322016613), is, class2s, colors, is_13_, 1 == aByte12182, i_1_, 800002381);
		if (i_1_ != i_16_) {
			Class437 class437 = Class437.method6884(method10569().aClass437_4862);
			class437.aFloat4903 = (float) ((anIntArray11885[0] << 9) + (method18338(2142951118) << 8));
			class437.aFloat4905 = (float) ((anIntArray11943[0] << 9) + (method18338(2146654150) << 8));
			method10573(class437);
			class437.method6949();
		}
		if (client.anInt11154 * 1109726117 == anInt11888 * -1087669731 && null != is_17_) {
			for (int i_18_ = 0; i_18_ < colors.length; i_18_++) {
				if (is_17_[i_18_] != colors[i_18_]) {
					Class523_Sub37.aClass53_Sub8_10677.method17185(1341668308);
					break;
				}
			}
		}
		if (null != aClass621_11948)
			aClass621_11948.method10131();
		if (aClass707_Sub1_11887.method14161(172582280) && aClass707_Sub1_11887.aBool10956) {
			Class588 class588 = method18352(1833176033);
			if (!class588.method9737(aClass707_Sub1_11887.method14163(-1826059217), 2037117366)) {
				aClass707_Sub1_11887.method14164(-1, (byte) 12);
				aClass707_Sub1_11887.aBool10956 = false;
			}
		}
	}

	public Class437 method180() {
		return Class437.method6878();
	}

	public void decodeHeadIcons(Class523_Sub34 class523_sub34, int i) {
		class523_sub34.anInt10661 = 0;
		int i_19_ = class523_sub34.readUnsignedByte(2132637150);
		for (int i_20_ = 0; i_20_ < anIntArray12201.length; i_20_++) {
			if ((i_19_ & 1 << i_20_) != 0) {
				int i_21_ = class523_sub34.readUnsignedByte(-975790890);
				int i_22_ = class523_sub34.readUnsignedShort(-2037850725);
				anIntArray12201[i_20_] = i_21_;
				anIntArray12191[i_20_] = i_22_;
			} else {
				anIntArray12201[i_20_] = -1;
				anIntArray12191[i_20_] = -1;
			}
		}
	}

	public void method18660(String string, int i, int i_23_, int i_24_) {
		method18416(string, i, i_23_, (Class286.method5150(1956709475) * (Class523_Sub11.aClass625_10427.anInt8177 * -498484561)), (byte) 120);
	}

	public final boolean method18661() {
		if (null == aClass623_12183)
			return false;
		return true;
	}

	Class559 method16744(Class178 class178, byte i) {
		if (null == aClass623_12183 || !method18663(class178, 2048, -2040146758))
			return null;
		Class435 class435 = class178.method3113();
		Class435 class435_25_ = method10585();
		Class432 class432 = method10569();
		int i_26_ = aClass72_11938.method1494((byte) 108);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_27_ = (anInt11890 * -1096736227 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_27_ / 10.0F) * -17780683;
		} else
			anInt11890 = -17780683 * (int) ((float) (anInt11890 * -1096736227) - (float) (-1096736227 * anInt11890) / 10.0F);
		class435.method6803(class435_25_);
		class435.method6819(0.0F, (float) (-20 - anInt11890 * -1096736227), 0.0F);
		Class559 class559 = null;
		aBool11919 = false;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1) {
			Class588 class588 = method18352(708142498);
			if (class588.aBool7770 && (-1 == aClass623_12183.anInt8106 * -1137516987 || (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(((aClass623_12183.anInt8106) * -1137516987), (byte) 34)).aBool3269))) {
				Class707 class707 = ((aClass707_11913.method14161(-1441778727) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
				Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-129427503) && (!aClass707_Sub1_11887.aBool10956 || class707 == null)) ? aClass707_Sub1_11887 : null);
				short i_28_ = Class523_Sub11.aClass625_10427.aShort8146;
				byte i_29_ = Class523_Sub11.aClass625_10427.aByte8145;
				if (-1 != -1137516987 * aClass623_12183.anInt8106) {
					i_28_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) -80))).aShort3296;
					i_29_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) 4))).aByte3247;
				}
				Object object = null;
				Class167 class167;
				if (i_28_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(2118227325) == 1)
					class167 = Class237.method4302(class178, i_26_, anInt11897 * 1360761263, anInt11898 * 887325889, 1882562377 * anInt11899, aClass167Array11928[0], i_28_, i_29_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -1725747101);
				else
					class167 = Class53_Sub14.method17215(class178, i_26_, anInt11897 * 1360761263, anInt11898 * 887325889, anInt11899 * 1882562377, 1, aClass167Array11928[0], 0, 0, 160, 240, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 250097826);
				if (null != class167) {
					if (null == aClass180Array10823 || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, 484421867);
					class559 = Class238.method4306(true, -860097130);
					aBool11919 = true;
					class178.method3287(false);
					class167.method2708(class435, (aClass180Array10823[aClass167Array11928.length]), 0);
					class178.method3287(true);
				}
			}
		}
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this) {
			for (int i_30_ = client.aClass111Array11017.length - 1; i_30_ >= 0; i_30_--) {
				Class111 class111 = client.aClass111Array11017[i_30_];
				if (class111 != null && -1 != 1089230115 * class111.anInt1341) {
					if (1 == 239678453 * class111.anInt1334) {
						Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (class111.anInt1336 * 920515165))));
						if (class523_sub28 != null) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
							Class437 class437 = (Class437.method6932((class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862), Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_31_ = (int) class437.aFloat4903;
							int i_32_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_31_, (long) i_32_, 1089230115 * class111.anInt1341, 92160000L);
						}
					}
					if (239678453 * class111.anInt1334 == 2) {
						Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
						long l = (long) (1757546743 * class111.anInt1338 - (int) class437.aFloat4903);
						long l_33_ = (long) (class111.anInt1339 * 1490265041 - (int) class437.aFloat4905);
						long l_34_ = (long) (-1510348621 * class111.anInt1342 << 9);
						l_34_ *= l_34_;
						method18662(class178, class435, aClass167Array11928[0], l, l_33_, 1089230115 * class111.anInt1341, l_34_);
					}
					if (10 == 239678453 * class111.anInt1334 && class111.anInt1336 * 920515165 >= 0 && (class111.anInt1336 * 920515165 < (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153).length)) {
						Player class647_sub1_sub3_sub1_sub2_35_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[920515165 * class111.anInt1336]);
						if (class647_sub1_sub3_sub1_sub2_35_ != null) {
							Class437 class437 = (Class437.method6932(class647_sub1_sub3_sub1_sub2_35_.method10569().aClass437_4862, Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_36_ = (int) class437.aFloat4903;
							int i_37_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_36_, (long) i_37_, class111.anInt1341 * 1089230115, 92160000L);
						}
					}
				}
			}
		}
		class435.method6803(class435_25_);
		class435.method6819(0.0F, (float) (-5 - -1096736227 * anInt11890), 0.0F);
		if (aClass180Array10823 == null || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, -1787594827);
		if (null == class559)
			class559 = Class238.method4306(true, -2101809678);
		method18394(class178, aClass167Array11928, class435, false, 33954099);
		for (int i_38_ = 0; i_38_ < aClass167Array11928.length; i_38_++) {
			if (null != aClass167Array11928[i_38_])
				aClass167Array11928[i_38_].method2708(class435, aClass180Array10823[i_38_], (this == Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 ? 1 : 0));
			else
				aClass180Array10823[i_38_].aBool2000 = false;
		}
		if (aClass621_11948 != null) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_39_ = 0; i_39_ < aClass167Array11928.length; i_39_++) {
			if (aClass167Array11928[i_39_] != null)
				aBool11919 |= aClass167Array11928[i_39_].method2730();
			aClass167Array11928[i_39_] = null;
		}
		anInt11889 = -1789738199 * client.anInt10981;
		return class559;
	}

	void method16706(Class178 class178, short i) {
		if (aClass623_12183 != null && (aBool11949 || method18663(class178, 0, -1697244105))) {
			Class435 class435 = class178.method3113();
			class435.method6804(method10569());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, -802322256);
			for (int i_40_ = 0; i_40_ < aClass167Array11928.length; i_40_++)
				aClass167Array11928[i_40_] = null;
		}
	}

	void method18662(Class178 class178, Class435 class435, Class167 class167, long l, long l_41_, int i, long l_42_) {
		long l_43_ = l_41_ * l_41_ + l * l;
		if (l_43_ >= 262144L && l_43_ <= l_42_) {
			int i_44_ = ((int) ((Math.atan2((double) l, (double) l_41_) * 2607.5945876176133) - (double) aClass72_11938.method1494((byte) 112)) & 0x3fff);
			Class167 class167_45_ = Class50.method1282(class178, i_44_, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, i, (byte) 1);
			if (null != class167_45_) {
				class178.method3287(false);
				class167_45_.method2708(class435, null, 0);
				class178.method3287(true);
			}
		}
	}

	boolean method18663(Class178 class178, int i, int i_46_) {
		int i_47_ = i;
		Class588 class588 = method18352(824856950);
		Class707 class707 = ((aClass707_11913.method14161(1199773779) && !aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
		Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(1911530985) && !aBool12180 && (!aClass707_Sub1_11887.aBool10956 || null == class707)) ? aClass707_Sub1_11887 : null);
		int i_48_ = -1464618725 * class588.anInt7778;
		int i_49_ = -1199122203 * class588.anInt7773;
		if (i_48_ != 0 || i_49_ != 0 || class588.anInt7791 * -941991763 != 0 || 0 != class588.anInt7788 * -1578959099)
			i |= 0x7;
		int i_50_ = aClass72_11938.method1494((byte) 121);
		boolean bool = (0 != aByte11929 && client.anInt11011 >= -1284164047 * anInt11924 && client.anInt11011 < 1874600493 * anInt11925);
		if (bool)
			i |= 0x80000;
		Class167 class167 = (aClass167Array11928[0] = (aClass623_12183.method10176(class178, i, Class80.aClass53_Sub17_866, Class448.aClass53_Sub6_4945, Class174.aClass53_Sub7_1856, Class523_Sub37.aClass53_Sub8_10677, Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, class707, class707_sub1, aClass707_Sub2_Sub1Array11933, anIntArray11934, i_50_, true, Class655.aClass630_8423, 1542885973)));
		int i_51_ = Class508.method8505((byte) 57);
		if (-518382423 * Class506.anInt5695 < 96 && i_51_ > 50)
			Class468.method7608((short) -28734);
		if (Class80.aClass674_865 != Class674.aClass674_8613 && i_51_ < 50) {
			int i_52_;
			for (i_52_ = 50 - i_51_; i_52_ > -1609578315 * client.anInt11010; client.anInt11010 += -1649875555)
				Class236.aByteArrayArray2395[client.anInt11010 * -1609578315] = new byte[102400];
			while (i_52_ < client.anInt11010 * -1609578315) {
				client.anInt11010 -= -1649875555;
				Class236.aByteArrayArray2395[client.anInt11010 * -1609578315] = null;
			}
		} else if (Class674.aClass674_8613 != Class80.aClass674_865) {
			Class236.aByteArrayArray2395 = new byte[50][];
			client.anInt11010 = 0;
		}
		if (class167 == null)
			return false;
		anInt11901 = class167.method2804() * -1976100247;
		anInt11921 = class167.method2718() * -270798901;
		class167.method2834();
		method18386(class167, 1045902199);
		if (i_48_ != 0 || 0 != i_49_) {
			method18346(i_50_, i_48_, i_49_, 585378281 * class588.anInt7774, 1872984397 * class588.anInt7767, -689254300);
			if (0 != anInt11897 * 1360761263)
				class167.method2845(anInt11897 * 1360761263);
			if (anInt11898 * 887325889 != 0)
				class167.method2688(887325889 * anInt11898);
			if (0 != anInt11899 * 1882562377)
				class167.method2689(0, 1882562377 * anInt11899, 0);
		} else
			method18346(i_50_, method18338(2144757492) << 9, method18338(2145292084) << 9, 0, 0, -405506722);
		if (bool)
			class167.method2839(aByte11926, aByte11927, aByte11936, aByte11929 & 0xff);
		if (!aBool12180)
			method18339(class178, class588, i_47_, i_48_, i_49_, i_50_, (byte) 69);
		return true;
	}

	public void method18664(String string, int i, int i_53_) {
		method18416(string, i, i_53_, (Class286.method5150(2124831562) * (Class523_Sub11.aClass625_10427.anInt8177 * -498484561)), (byte) 77);
	}

	public int method18384() {
		if (aClass623_12183 != null && -1137516987 * aClass623_12183.anInt8106 != -1)
			return (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition((-1137516987 * (aClass623_12183.anInt8106)), (byte) 60)).anInt3260 * 1610497933);
		return super.method18338(2141175744);
	}

	public final void method18665(int i, int i_54_, byte i_55_, byte i_56_) {
		if (aClass707_11913.method14161(-635697807) && (aClass707_11913.method14203(708387695).anInt2238 * 1830302607 == 1)) {
			anIntArray11911 = null;
			aClass707_11913.method14164(-1, (byte) 12);
		}
		for (int i_57_ = 0; i_57_ < aClass515Array11912.length; i_57_++) {
			if (985865715 * aClass515Array11912[i_57_].id != -1) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) (Class412.aClass53_Sub19_4556.getDefinition(985865715 * aClass515Array11912[i_57_].id, (byte) 85)));
				if (class671.aBool8602 && -1 != class671.anInt8590 * -61429051 && (((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(((class671.anInt8590) * -61429051), (byte) 24)).anInt2238) * 1830302607 == 1) {
					aClass515Array11912[i_57_].aClass707_7043.method14164(-1, (byte) 12);
					aClass515Array11912[i_57_].id = 873938117;
				}
			}
		}
		anInt12195 = 505899647;
		if (i < 0 || i >= client.aClass505_11019.method8292((byte) 73) || i_54_ < 0 || i_54_ >= client.aClass505_11019.method8235(2050218164))
			method18666(i, i_54_, (byte) 97);
		else if (anIntArray11885[0] < 0 || (anIntArray11885[0] >= client.aClass505_11019.method8292((byte) 93)) || anIntArray11943[0] < 0 || (anIntArray11943[0] >= client.aClass505_11019.method8235(2072233836)))
			method18666(i, i_54_, (byte) 41);
		else
			method18667(i, i_54_, i_55_, -54952997);
	}

	public void method18666(int i, int i_58_, byte i_59_) {
		anInt11941 = 0;
		anInt11946 = 0;
		anInt11945 = 0;
		anIntArray11885[0] = i;
		anIntArray11943[0] = i_58_;
		int i_60_ = method18338(2144598320);
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 = (float) (256 * i_60_ + anIntArray11885[0] * 512);
		class437.aFloat4905 = (float) (256 * i_60_ + 512 * anIntArray11943[0]);
		method10573(class437);
		class437.method6949();
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this)
			client.aClass505_11019.method8271((byte) 8).method10249(649259095);
		if (aClass621_11948 != null)
			aClass621_11948.method10131();
	}

	final void method18667(int i, int i_61_, byte i_62_, int i_63_) {
		if (703205765 * anInt11941 < anIntArray11885.length - 1)
			anInt11941 += -822788275;
		for (int i_64_ = anInt11941 * 703205765; i_64_ > 0; i_64_--) {
			anIntArray11885[i_64_] = anIntArray11885[i_64_ - 1];
			anIntArray11943[i_64_] = anIntArray11943[i_64_ - 1];
			aByteArray11944[i_64_] = aByteArray11944[i_64_ - 1];
		}
		anIntArray11885[0] = i;
		anIntArray11943[0] = i_61_;
		aByteArray11944[0] = i_62_;
	}

	public final boolean method18668(int i) {
		if (null == aClass623_12183)
			return false;
		return true;
	}

	public int method18338(int i) {
		if (aClass623_12183 != null && -1137516987 * aClass623_12183.anInt8106 != -1)
			return ((((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition((-1137516987 * (aClass623_12183.anInt8106)), (byte) 114)).anInt3260) * 1610497933);
		return super.method18338(2146081032);
	}

	public String method18669(boolean bool, byte i) {
		if (bool)
			return displayName;
		return username;
	}

	public int method18342(byte i) {
		return -1;
	}

	public Class437 method191() {
		return Class437.method6878();
	}

	final boolean method16699(int i) {
		return false;
	}

	void method16728(Class178 class178) {
		if (aClass623_12183 != null && (aBool11949 || method18663(class178, 0, -1290431813))) {
			Class435 class435 = class178.method3113();
			class435.method6804(method10569());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, -1810699490);
			for (int i = 0; i < aClass167Array11928.length; i++)
				aClass167Array11928[i] = null;
		}
	}

	final void method16704(byte i) {
		throw new IllegalStateException();
	}

	void method18670(Class178 class178, Class435 class435, Class167 class167, long l, long l_65_, int i, long l_66_) {
		long l_67_ = l_65_ * l_65_ + l * l;
		if (l_67_ >= 262144L && l_67_ <= l_66_) {
			int i_68_ = ((int) ((Math.atan2((double) l, (double) l_65_) * 2607.5945876176133) - (double) aClass72_11938.method1494((byte) 4)) & 0x3fff);
			Class167 class167_69_ = Class50.method1282(class178, i_68_, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, i, (byte) 1);
			if (null != class167_69_) {
				class178.method3287(false);
				class167_69_.method2708(class435, null, 0);
				class178.method3287(true);
			}
		}
	}

	public void method18671(Class523_Sub34 class523_sub34, byte i) {
		aByte12182 = i;
		int i_70_ = -1;
		anInt12192 = 0;
		int[] is = new int[Class655.aClass630_8423.disabledSlots.length];
		Class2[] class2s = new Class2[Class655.aClass630_8423.disabledSlots.length];
		ItemDefinitions[] class12s = new ItemDefinitions[Class655.aClass630_8423.disabledSlots.length];
		for (int i_71_ = 0; i_71_ < Class655.aClass630_8423.disabledSlots.length; i_71_++) {
			if (Class655.aClass630_8423.disabledSlots[i_71_] != 1) {
				int i_72_ = class523_sub34.readUnsignedByte(502544695);
				if (i_72_ == 0)
					is[i_71_] = 0;
				else {
					int i_73_ = class523_sub34.readUnsignedByte(526587746);
					int i_74_ = (i_72_ << 8) + i_73_;
					if (0 == i_71_ && 65535 == i_74_) {
						i_70_ = class523_sub34.readBigSmart((byte) -112);
						anInt12192 = (class523_sub34.readUnsignedByte(-1360760919) * 1821813279);
						break;
					}
					if (i_74_ >= 16384) {
						i_74_ -= 16384;
						is[i_71_] = i_74_ | 0x40000000;
						class12s[i_71_] = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_74_, (byte) 68);
						int i_75_ = class12s[i_71_].anInt160 * 675808507;
						if (0 != i_75_)
							anInt12192 = i_75_ * 1821813279;
					} else
						is[i_71_] = i_74_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_70_ == -1) {
			int i_76_ = class523_sub34.readUnsignedShort(-1887337380);
			int i_77_ = 0;
			for (int i_78_ = 0; i_78_ < Class655.aClass630_8423.disabledSlots.length; i_78_++) {
				if (Class655.aClass630_8423.disabledSlots[i_78_] == 0) {
					if ((i_76_ & 1 << i_77_) != 0)
						class2s[i_78_] = Class470.method7630(class12s[i_78_], class523_sub34, 579179792);
					i_77_++;
				}
			}
		}
		int[] is_79_ = new int[10];
		for (int i_80_ = 0; i_80_ < 10; i_80_++) {
			int i_81_ = class523_sub34.readUnsignedByte(-1421295465);
			if (Class207.aShortArrayArrayArray2248.length < 1 || i_81_ < 0 || (i_81_ >= Class207.aShortArrayArrayArray2248[i_80_][0].length))
				i_81_ = 0;
			is_79_[i_80_] = i_81_;
		}
		int[] is_82_ = new int[10];
		for (int i_83_ = 0; i_83_ < 10; i_83_++) {
			int i_84_ = class523_sub34.readUnsignedByte(-433586335);
			if (Class21.aShortArrayArrayArray214.length < 1 || i_84_ < 0 || i_84_ >= Class21.aShortArrayArrayArray214[i_83_][0].length)
				i_84_ = 0;
			is_82_[i_83_] = i_84_;
		}
		anInt12199 = class523_sub34.readUnsignedShort(-557984373) * -633304531;
		if (null == aClass623_12183)
			aClass623_12183 = new Class623();
		int i_85_ = aClass623_12183.anInt8106 * -1137516987;
		int[] is_86_ = aClass623_12183.anIntArray8102;
		aClass623_12183.method10174(method18348(1322016613), is, class2s, is_79_, is_82_, 1 == aByte12182, i_70_, 800002381);
		if (i_70_ != i_85_) {
			Class437 class437 = Class437.method6884(method10569().aClass437_4862);
			class437.aFloat4903 = (float) ((anIntArray11885[0] << 9) + (method18338(2145785453) << 8));
			class437.aFloat4905 = (float) ((anIntArray11943[0] << 9) + (method18338(2140213577) << 8));
			method10573(class437);
			class437.method6949();
		}
		if (client.anInt11154 * 1109726117 == anInt11888 * -1087669731 && null != is_86_) {
			for (int i_87_ = 0; i_87_ < is_79_.length; i_87_++) {
				if (is_86_[i_87_] != is_79_[i_87_]) {
					Class523_Sub37.aClass53_Sub8_10677.method17185(-8063700);
					break;
				}
			}
		}
		if (null != aClass621_11948)
			aClass621_11948.method10131();
		if (aClass707_Sub1_11887.method14161(1649317609) && aClass707_Sub1_11887.aBool10956) {
			Class588 class588 = method18352(-254909376);
			if (!class588.method9737(aClass707_Sub1_11887.method14163(-1782726781), 2037117366)) {
				aClass707_Sub1_11887.method14164(-1, (byte) 12);
				aClass707_Sub1_11887.aBool10956 = false;
			}
		}
	}

	public Class533 method18353(byte i) {
		if (aClass533_11900 != null) {
			if (null == aClass533_11900.aString7130)
				return null;
			if (274117251 * client.anInt11258 == 0 || client.anInt11258 * 274117251 == 3 || (client.anInt11258 * 274117251 == 1 && Class97.method1773(username, (byte) 0)))
				return aClass533_11900;
		}
		return null;
	}

	public Class292 method176(byte i) {
		return Class292.aClass292_3158;
	}

	public boolean method18395() {
		return Class523_Sub11.aClass625_10427.aBool8155;
	}

	public Class523_Sub29 method181(int i) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		return (Class449.method7268(aByte10821, ((int) method10569().aClass437_4862.aFloat4903 + 292859392 * class592.localX), -(int) method10569().aClass437_4862.aFloat4904, ((int) method10569().aClass437_4862.aFloat4905 + class592.localY * 597568000), 1239222631));
	}

	void method18672(int i) {
		for (int i_88_ = 0; i_88_ < anIntArray12201.length; i_88_++)
			anIntArray12201[i_88_] = -1;
		for (int i_89_ = 0; i_89_ < anIntArray12191.length; i_89_++)
			anIntArray12191[i_89_] = -1;
	}

	public Class437 method178(int i) {
		return Class437.method6878();
	}

	public int method18403(byte i) {
		return -(-1087669731 * anInt11888) - 1;
	}

	public Class292 method189() {
		return Class292.aClass292_3158;
	}

	public Class292 method187() {
		return Class292.aClass292_3158;
	}

	public final void decodeAppearance(Class523_Sub34 buffer, int i) {
		buffer.anInt10661 = 0;
		int flags = buffer.readUnsignedByte(-751479734);
		byte isFemale = (byte) (flags & 0x1);
		boolean bool = (flags & 0x4) != 0;
		int i_92_ = super.method18338(2145438217);
		method18344((flags >> 3 & 0x7) + 1, 1643809559);
		boolean isPrefixTitle = (flags & 0x40) != 0;
		boolean isSuffixTitle = (flags & 0x80) != 0;
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 += (float) (method18338(2143365907) - i_92_ << 8);
		class437.aFloat4905 += (float) (method18338(2142660626) - i_92_ << 8);
		method10573(class437);
		class437.method6949();
		if (isPrefixTitle)
			prefixTitle = buffer.readVersionedString(2057763940);
		else
			prefixTitle = null;
		if (isSuffixTitle)
			suffixTitle = buffer.readVersionedString(2066907096);
		else
			suffixTitle = null;
		visible = ((Class634) Class334.method5910(Class634.method10400(2032727799), buffer.readByte((short) -18446), -1929592331));
		if (Class674.aClass674_8613 == Class80.aClass674_865 && -1746920271 * client.rights >= 2)
			visible = Class634.aClass634_8273;
		decodePlayerLook(buffer, isFemale, (byte) 2);
		displayName = buffer.readString(591176666);
		username = displayName;
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this)
			RuntimeException_Sub4.aString12099 = displayName;
		anInt12186 = buffer.readUnsignedByte(-1664770863) * 2066018159;
		if (bool) {
			anInt12189 = buffer.readUnsignedShort(-517165574) * 772574889;
			if (65535 == -476056167 * anInt12189)
				anInt12189 = -772574889;
			anInt12187 = -380238217 * anInt12186;
			anInt12178 = -1072311087;
		} else {
			anInt12189 = 0;
			anInt12187 = buffer.readUnsignedByte(-34791870) * -1844320615;
			anInt12178 = buffer.readUnsignedByte(1609829979) * 1072311087;
			if (255 == 1202781135 * anInt12178)
				anInt12178 = -1072311087;
		}
		int i_95_ = anInt12197 * -2112595399;
		anInt12197 = buffer.readUnsignedByte(-1136741775) * -2086702071;
		if (0 != -2112595399 * anInt12197) {
			int i_96_ = 764561367 * anInt12184;
			int i_97_ = -1155504023 * anInt12194;
			int i_98_ = -1258538771 * anInt12193;
			int i_99_ = anInt12190 * -1487401711;
			int i_100_ = 2008258135 * anInt12198;
			anInt12184 = buffer.readUnsignedShort(-2088093146) * 1951308775;
			anInt12194 = buffer.readUnsignedShort(-1069882737) * -592205863;
			anInt12193 = buffer.readUnsignedShort(-942244359) * 111600869;
			anInt12190 = buffer.readUnsignedShort(-319601034) * -1599306767;
			anInt12198 = buffer.readUnsignedByte(100497814) * 1749398887;
			if (i_95_ != -2112595399 * anInt12197 || i_96_ != anInt12184 * 764561367 || -1155504023 * anInt12194 != i_97_ || anInt12193 * -1258538771 != i_98_ || -1487401711 * anInt12190 != i_99_ || i_100_ != 2008258135 * anInt12198)
				Class327_Sub2.method15641(this, -1779432579);
		} else
			Class522_Sub6.method15875(this, -339466324);
	}

	public int method182() {
		return -1087669731 * anInt11888;
	}

	public int method18413() {
		return -1;
	}

	public Class440 method184() {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	public Class440 method185() {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	public Class440 method186() {
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(aClass72_11938.anInt797 * 1230650225), 0.0F, 0.0F);
		return class440;
	}

	public Class564 method16721(Class178 class178) {
		return null;
	}

	boolean method16736(Class178 class178, int i, int i_101_) {
		if (aClass623_12183 == null || !method18663(class178, 131072, -1233479434))
			return false;
		Class435 class435 = method10585();
		boolean bool = false;
		for (int i_102_ = 0; i_102_ < aClass167Array11928.length; i_102_++) {
			if (null != aClass167Array11928[i_102_] && aClass167Array11928[i_102_].aBool1798 && aClass167Array11928[i_102_].method2709(i, i_101_, class435, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_103_ = 0; i_103_ < aClass167Array11928.length; i_103_++)
			aClass167Array11928[i_103_] = null;
		return bool;
	}

	Class559 method16725(Class178 class178) {
		if (null == aClass623_12183 || !method18663(class178, 2048, -1336138374))
			return null;
		Class435 class435 = class178.method3113();
		Class435 class435_104_ = method10585();
		Class432 class432 = method10569();
		int i = aClass72_11938.method1494((byte) 37);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_105_ = (anInt11890 * -1096736227 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_105_ / 10.0F) * -17780683;
		} else
			anInt11890 = -17780683 * (int) ((float) (anInt11890 * -1096736227) - (float) (-1096736227 * anInt11890) / 10.0F);
		class435.method6803(class435_104_);
		class435.method6819(0.0F, (float) (-20 - anInt11890 * -1096736227), 0.0F);
		Class559 class559 = null;
		aBool11919 = false;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1) {
			Class588 class588 = method18352(1050902184);
			if (class588.aBool7770 && (-1 == aClass623_12183.anInt8106 * -1137516987 || (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(((aClass623_12183.anInt8106) * -1137516987), (byte) -33)).aBool3269))) {
				Class707 class707 = ((aClass707_11913.method14161(1284723645) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
				Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-617107558) && (!aClass707_Sub1_11887.aBool10956 || class707 == null)) ? aClass707_Sub1_11887 : null);
				short i_106_ = Class523_Sub11.aClass625_10427.aShort8146;
				byte i_107_ = Class523_Sub11.aClass625_10427.aByte8145;
				if (-1 != -1137516987 * aClass623_12183.anInt8106) {
					i_106_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) -20))).aShort3296;
					i_107_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) 87))).aByte3247;
				}
				Object object = null;
				Class167 class167;
				if (i_106_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1607401767) == 1)
					class167 = Class237.method4302(class178, i, anInt11897 * 1360761263, anInt11898 * 887325889, 1882562377 * anInt11899, aClass167Array11928[0], i_106_, i_107_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -1036323832);
				else
					class167 = Class53_Sub14.method17215(class178, i, anInt11897 * 1360761263, anInt11898 * 887325889, anInt11899 * 1882562377, 1, aClass167Array11928[0], 0, 0, 160, 240, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 1517259363);
				if (null != class167) {
					if (null == aClass180Array10823 || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, 200386683);
					class559 = Class238.method4306(true, -101475085);
					aBool11919 = true;
					class178.method3287(false);
					class167.method2708(class435, (aClass180Array10823[aClass167Array11928.length]), 0);
					class178.method3287(true);
				}
			}
		}
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this) {
			for (int i_108_ = client.aClass111Array11017.length - 1; i_108_ >= 0; i_108_--) {
				Class111 class111 = client.aClass111Array11017[i_108_];
				if (class111 != null && -1 != 1089230115 * class111.anInt1341) {
					if (1 == 239678453 * class111.anInt1334) {
						Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (class111.anInt1336 * 920515165))));
						if (class523_sub28 != null) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
							Class437 class437 = (Class437.method6932((class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862), Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_109_ = (int) class437.aFloat4903;
							int i_110_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_109_, (long) i_110_, 1089230115 * class111.anInt1341, 92160000L);
						}
					}
					if (239678453 * class111.anInt1334 == 2) {
						Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
						long l = (long) (1757546743 * class111.anInt1338 - (int) class437.aFloat4903);
						long l_111_ = (long) (class111.anInt1339 * 1490265041 - (int) class437.aFloat4905);
						long l_112_ = (long) (-1510348621 * class111.anInt1342 << 9);
						l_112_ *= l_112_;
						method18662(class178, class435, aClass167Array11928[0], l, l_111_, 1089230115 * class111.anInt1341, l_112_);
					}
					if (10 == 239678453 * class111.anInt1334 && class111.anInt1336 * 920515165 >= 0 && (class111.anInt1336 * 920515165 < (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153).length)) {
						Player class647_sub1_sub3_sub1_sub2_113_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[920515165 * class111.anInt1336]);
						if (class647_sub1_sub3_sub1_sub2_113_ != null) {
							Class437 class437 = (Class437.method6932(class647_sub1_sub3_sub1_sub2_113_.method10569().aClass437_4862, Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_114_ = (int) class437.aFloat4903;
							int i_115_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_114_, (long) i_115_, class111.anInt1341 * 1089230115, 92160000L);
						}
					}
				}
			}
		}
		class435.method6803(class435_104_);
		class435.method6819(0.0F, (float) (-5 - -1096736227 * anInt11890), 0.0F);
		if (aClass180Array10823 == null || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, 716045428);
		if (null == class559)
			class559 = Class238.method4306(true, 1505744602);
		method18394(class178, aClass167Array11928, class435, false, 139306680);
		for (int i_116_ = 0; i_116_ < aClass167Array11928.length; i_116_++) {
			if (null != aClass167Array11928[i_116_])
				aClass167Array11928[i_116_].method2708(class435, aClass180Array10823[i_116_], (this == Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 ? 1 : 0));
			else
				aClass180Array10823[i_116_].aBool2000 = false;
		}
		if (aClass621_11948 != null) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_117_ = 0; i_117_ < aClass167Array11928.length; i_117_++) {
			if (aClass167Array11928[i_117_] != null)
				aBool11919 |= aClass167Array11928[i_117_].method2730();
			aClass167Array11928[i_117_] = null;
		}
		anInt11889 = -1789738199 * client.anInt10981;
		return class559;
	}

	public Player(Class560 class560) {
		super(class560, Class669.aClass98_Sub1_Sub1_8582);
		anIntArray12201 = new int[8];
		anIntArray12191 = new int[8];
		anInt12186 = 0;
		anInt12187 = 0;
		anInt12178 = -1072311087;
		anInt12189 = 0;
		anInt12195 = 505899647;
		aBool12180 = false;
		anInt12192 = 0;
		anInt12184 = -1951308775;
		anInt12194 = 592205863;
		anInt12193 = -111600869;
		anInt12190 = 1599306767;
		anInt12197 = 0;
		anInt12198 = -579882599;
		aClass210_12200 = Class210.aClass210_2258;
		visible = Class634.aClass634_8273;
		aBool12202 = false;
		method18672(1994853226);
	}

	void method16727(Class178 class178) {
		if (aClass623_12183 != null && (aBool11949 || method18663(class178, 0, -1560290513))) {
			Class435 class435 = class178.method3113();
			class435.method6804(method10569());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, 1094009452);
			for (int i = 0; i < aClass167Array11928.length; i++)
				aClass167Array11928[i] = null;
		}
	}

	final boolean method16731() {
		return false;
	}

	void method16756(Class178 class178) {
		if (aClass623_12183 != null && (aBool11949 || method18663(class178, 0, -1657600933))) {
			Class435 class435 = class178.method3113();
			class435.method6804(method10569());
			class435.method6819(0.0F, -5.0F, 0.0F);
			method18394(class178, aClass167Array11928, class435, aBool11949, -143093618);
			for (int i = 0; i < aClass167Array11928.length; i++)
				aClass167Array11928[i] = null;
		}
	}

	final boolean method16730() {
		return false;
	}

	Class559 method16726(Class178 class178) {
		if (null == aClass623_12183 || !method18663(class178, 2048, -1622915213))
			return null;
		Class435 class435 = class178.method3113();
		Class435 class435_118_ = method10585();
		Class432 class432 = method10569();
		int i = aClass72_11938.method1494((byte) 29);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_119_ = (anInt11890 * -1096736227 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_119_ / 10.0F) * -17780683;
		} else
			anInt11890 = -17780683 * (int) ((float) (anInt11890 * -1096736227) - (float) (-1096736227 * anInt11890) / 10.0F);
		class435.method6803(class435_118_);
		class435.method6819(0.0F, (float) (-20 - anInt11890 * -1096736227), 0.0F);
		Class559 class559 = null;
		aBool11919 = false;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1) {
			Class588 class588 = method18352(-599269091);
			if (class588.aBool7770 && (-1 == aClass623_12183.anInt8106 * -1137516987 || (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(((aClass623_12183.anInt8106) * -1137516987), (byte) 10)).aBool3269))) {
				Class707 class707 = ((aClass707_11913.method14161(197255484) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
				Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-1876552156) && (!aClass707_Sub1_11887.aBool10956 || class707 == null)) ? aClass707_Sub1_11887 : null);
				short i_120_ = Class523_Sub11.aClass625_10427.aShort8146;
				byte i_121_ = Class523_Sub11.aClass625_10427.aByte8145;
				if (-1 != -1137516987 * aClass623_12183.anInt8106) {
					i_120_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) -41))).aShort3296;
					i_121_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) -19))).aByte3247;
				}
				Object object = null;
				Class167 class167;
				if (i_120_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1990876605) == 1)
					class167 = Class237.method4302(class178, i, anInt11897 * 1360761263, anInt11898 * 887325889, 1882562377 * anInt11899, aClass167Array11928[0], i_120_, i_121_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -2096388269);
				else
					class167 = Class53_Sub14.method17215(class178, i, anInt11897 * 1360761263, anInt11898 * 887325889, anInt11899 * 1882562377, 1, aClass167Array11928[0], 0, 0, 160, 240, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 1709315604);
				if (null != class167) {
					if (null == aClass180Array10823 || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, -1044608509);
					class559 = Class238.method4306(true, -662469291);
					aBool11919 = true;
					class178.method3287(false);
					class167.method2708(class435, (aClass180Array10823[aClass167Array11928.length]), 0);
					class178.method3287(true);
				}
			}
		}
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this) {
			for (int i_122_ = client.aClass111Array11017.length - 1; i_122_ >= 0; i_122_--) {
				Class111 class111 = client.aClass111Array11017[i_122_];
				if (class111 != null && -1 != 1089230115 * class111.anInt1341) {
					if (1 == 239678453 * class111.anInt1334) {
						Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (class111.anInt1336 * 920515165))));
						if (class523_sub28 != null) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
							Class437 class437 = (Class437.method6932((class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862), Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_123_ = (int) class437.aFloat4903;
							int i_124_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_123_, (long) i_124_, 1089230115 * class111.anInt1341, 92160000L);
						}
					}
					if (239678453 * class111.anInt1334 == 2) {
						Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
						long l = (long) (1757546743 * class111.anInt1338 - (int) class437.aFloat4903);
						long l_125_ = (long) (class111.anInt1339 * 1490265041 - (int) class437.aFloat4905);
						long l_126_ = (long) (-1510348621 * class111.anInt1342 << 9);
						l_126_ *= l_126_;
						method18662(class178, class435, aClass167Array11928[0], l, l_125_, 1089230115 * class111.anInt1341, l_126_);
					}
					if (10 == 239678453 * class111.anInt1334 && class111.anInt1336 * 920515165 >= 0 && (class111.anInt1336 * 920515165 < (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153).length)) {
						Player class647_sub1_sub3_sub1_sub2_127_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[920515165 * class111.anInt1336]);
						if (class647_sub1_sub3_sub1_sub2_127_ != null) {
							Class437 class437 = (Class437.method6932(class647_sub1_sub3_sub1_sub2_127_.method10569().aClass437_4862, Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_128_ = (int) class437.aFloat4903;
							int i_129_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_128_, (long) i_129_, class111.anInt1341 * 1089230115, 92160000L);
						}
					}
				}
			}
		}
		class435.method6803(class435_118_);
		class435.method6819(0.0F, (float) (-5 - -1096736227 * anInt11890), 0.0F);
		if (aClass180Array10823 == null || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, -1811230532);
		if (null == class559)
			class559 = Class238.method4306(true, -1416328118);
		method18394(class178, aClass167Array11928, class435, false, -385121794);
		for (int i_130_ = 0; i_130_ < aClass167Array11928.length; i_130_++) {
			if (null != aClass167Array11928[i_130_])
				aClass167Array11928[i_130_].method2708(class435, aClass180Array10823[i_130_], (this == Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 ? 1 : 0));
			else
				aClass180Array10823[i_130_].aBool2000 = false;
		}
		if (aClass621_11948 != null) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_131_ = 0; i_131_ < aClass167Array11928.length; i_131_++) {
			if (aClass167Array11928[i_131_] != null)
				aBool11919 |= aClass167Array11928[i_131_].method2730();
			aClass167Array11928[i_131_] = null;
		}
		anInt11889 = -1789738199 * client.anInt10981;
		return class559;
	}

	final void method16732(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_132_, int i_133_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method16697() {
		throw new IllegalStateException();
	}

	final void method16734() {
		throw new IllegalStateException();
	}

	void method18674(Class178 class178, Class435 class435, Class167 class167, long l, long l_134_, int i, long l_135_) {
		long l_136_ = l_134_ * l_134_ + l * l;
		if (l_136_ >= 262144L && l_136_ <= l_135_) {
			int i_137_ = ((int) ((Math.atan2((double) l, (double) l_134_) * 2607.5945876176133) - (double) aClass72_11938.method1494((byte) 20)) & 0x3fff);
			Class167 class167_138_ = Class50.method1282(class178, i_137_, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, i, (byte) 1);
			if (null != class167_138_) {
				class178.method3287(false);
				class167_138_.method2708(class435, null, 0);
				class178.method3287(true);
			}
		}
	}

	public int method18328() {
		if (aClass623_12183 != null && -1137516987 * aClass623_12183.anInt8106 != -1)
			return (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition((-1137516987 * (aClass623_12183.anInt8106)), (byte) 11)).anInt3260 * 1610497933);
		return super.method18338(2145196272);
	}

	public int method18383() {
		if (aClass623_12183 != null && -1137516987 * aClass623_12183.anInt8106 != -1)
			return (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition((-1137516987 * (aClass623_12183.anInt8106)), (byte) -1)).anInt3260 * 1610497933);
		return super.method18338(2144473586);
	}

	public void method18675(Class523_Sub34 class523_sub34, byte i) {
		aByte12182 = i;
		int i_139_ = -1;
		anInt12192 = 0;
		int[] is = new int[Class655.aClass630_8423.disabledSlots.length];
		Class2[] class2s = new Class2[Class655.aClass630_8423.disabledSlots.length];
		ItemDefinitions[] class12s = new ItemDefinitions[Class655.aClass630_8423.disabledSlots.length];
		for (int i_140_ = 0; i_140_ < Class655.aClass630_8423.disabledSlots.length; i_140_++) {
			if (Class655.aClass630_8423.disabledSlots[i_140_] != 1) {
				int i_141_ = class523_sub34.readUnsignedByte(137937985);
				if (i_141_ == 0)
					is[i_140_] = 0;
				else {
					int i_142_ = class523_sub34.readUnsignedByte(1880040803);
					int i_143_ = (i_141_ << 8) + i_142_;
					if (0 == i_140_ && 65535 == i_143_) {
						i_139_ = class523_sub34.readBigSmart((byte) -114);
						anInt12192 = (class523_sub34.readUnsignedByte(117542344) * 1821813279);
						break;
					}
					if (i_143_ >= 16384) {
						i_143_ -= 16384;
						is[i_140_] = i_143_ | 0x40000000;
						class12s[i_140_] = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_143_, (byte) 21);
						int i_144_ = class12s[i_140_].anInt160 * 675808507;
						if (0 != i_144_)
							anInt12192 = i_144_ * 1821813279;
					} else
						is[i_140_] = i_143_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_139_ == -1) {
			int i_145_ = class523_sub34.readUnsignedShort(-1062817204);
			int i_146_ = 0;
			for (int i_147_ = 0; i_147_ < Class655.aClass630_8423.disabledSlots.length; i_147_++) {
				if (Class655.aClass630_8423.disabledSlots[i_147_] == 0) {
					if ((i_145_ & 1 << i_146_) != 0)
						class2s[i_147_] = Class470.method7630(class12s[i_147_], class523_sub34, 633562306);
					i_146_++;
				}
			}
		}
		int[] is_148_ = new int[10];
		for (int i_149_ = 0; i_149_ < 10; i_149_++) {
			int i_150_ = class523_sub34.readUnsignedByte(2085194189);
			if (Class207.aShortArrayArrayArray2248.length < 1 || i_150_ < 0 || (i_150_ >= Class207.aShortArrayArrayArray2248[i_149_][0].length))
				i_150_ = 0;
			is_148_[i_149_] = i_150_;
		}
		int[] is_151_ = new int[10];
		for (int i_152_ = 0; i_152_ < 10; i_152_++) {
			int i_153_ = class523_sub34.readUnsignedByte(1801060853);
			if (Class21.aShortArrayArrayArray214.length < 1 || i_153_ < 0 || (i_153_ >= Class21.aShortArrayArrayArray214[i_152_][0].length))
				i_153_ = 0;
			is_151_[i_152_] = i_153_;
		}
		anInt12199 = class523_sub34.readUnsignedShort(-90540664) * -633304531;
		if (null == aClass623_12183)
			aClass623_12183 = new Class623();
		int i_154_ = aClass623_12183.anInt8106 * -1137516987;
		int[] is_155_ = aClass623_12183.anIntArray8102;
		aClass623_12183.method10174(method18348(1322016613), is, class2s, is_148_, is_151_, 1 == aByte12182, i_139_, 800002381);
		if (i_139_ != i_154_) {
			Class437 class437 = Class437.method6884(method10569().aClass437_4862);
			class437.aFloat4903 = (float) ((anIntArray11885[0] << 9) + (method18338(2141295779) << 8));
			class437.aFloat4905 = (float) ((anIntArray11943[0] << 9) + (method18338(2143461479) << 8));
			method10573(class437);
			class437.method6949();
		}
		if (client.anInt11154 * 1109726117 == anInt11888 * -1087669731 && null != is_155_) {
			for (int i_156_ = 0; i_156_ < is_148_.length; i_156_++) {
				if (is_155_[i_156_] != is_148_[i_156_]) {
					Class523_Sub37.aClass53_Sub8_10677.method17185(890694265);
					break;
				}
			}
		}
		if (null != aClass621_11948)
			aClass621_11948.method10131();
		if (aClass707_Sub1_11887.method14161(-1396384848) && aClass707_Sub1_11887.aBool10956) {
			Class588 class588 = method18352(2037079121);
			if (!class588.method9737(aClass707_Sub1_11887.method14163(-1688715272), 2037117366)) {
				aClass707_Sub1_11887.method14164(-1, (byte) 12);
				aClass707_Sub1_11887.aBool10956 = false;
			}
		}
	}

	public int method18385() {
		if (aClass623_12183 != null && -1137516987 * aClass623_12183.anInt8106 != -1)
			return (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition((-1137516987 * (aClass623_12183.anInt8106)), (byte) 27)).anInt3260 * 1610497933);
		return super.method18338(2144446892);
	}

	public void method18676(int i, int i_157_) {
		anInt11941 = 0;
		anInt11946 = 0;
		anInt11945 = 0;
		anIntArray11885[0] = i;
		anIntArray11943[0] = i_157_;
		int i_158_ = method18338(2144590751);
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		class437.aFloat4903 = (float) (256 * i_158_ + anIntArray11885[0] * 512);
		class437.aFloat4905 = (float) (256 * i_158_ + 512 * anIntArray11943[0]);
		method10573(class437);
		class437.method6949();
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this)
			client.aClass505_11019.method8271((byte) 8).method10249(-1449749515);
		if (aClass621_11948 != null)
			aClass621_11948.method10131();
	}

	int method18392() {
		return 308172197 * anInt12199;
	}

	int method18345() {
		return 308172197 * anInt12199;
	}

	int method18393() {
		return 308172197 * anInt12199;
	}

	public int method18387() {
		return -1;
	}

	void method18677() {
		for (int i = 0; i < anIntArray12201.length; i++)
			anIntArray12201[i] = -1;
		for (int i = 0; i < anIntArray12191.length; i++)
			anIntArray12191[i] = -1;
	}

	public Class523_Sub29 method183() {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		return (Class449.method7268(aByte10821, ((int) method10569().aClass437_4862.aFloat4903 + 292859392 * class592.localX), -(int) method10569().aClass437_4862.aFloat4904, ((int) method10569().aClass437_4862.aFloat4905 + class592.localY * 597568000), 283993771));
	}

	public int method18397() {
		return -1;
	}

	public Class292 method177() {
		return Class292.aClass292_3158;
	}

	public int method18400() {
		return -(-1087669731 * anInt11888) - 1;
	}

	public int method18327() {
		return -(-1087669731 * anInt11888) - 1;
	}

	public boolean method18351() {
		return Class523_Sub11.aClass625_10427.aBool8155;
	}

	boolean method16713(Class178 class178, int i, int i_159_) {
		if (aClass623_12183 == null || !method18663(class178, 131072, -1065104858))
			return false;
		Class435 class435 = method10585();
		boolean bool = false;
		for (int i_160_ = 0; i_160_ < aClass167Array11928.length; i_160_++) {
			if (null != aClass167Array11928[i_160_] && aClass167Array11928[i_160_].aBool1798 && aClass167Array11928[i_160_].method2709(i, i_159_, class435, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_161_ = 0; i_161_ < aClass167Array11928.length; i_161_++)
			aClass167Array11928[i_161_] = null;
		return bool;
	}

	int method18391() {
		return 308172197 * anInt12199;
	}

	int method18348(int i) {
		return 308172197 * anInt12199;
	}

	public boolean method18381(int i) {
		return Class523_Sub11.aClass625_10427.aBool8155;
	}

	public void method18678(Class523_Sub34 class523_sub34) {
		class523_sub34.anInt10661 = 0;
		int i = class523_sub34.readUnsignedByte(1962563897);
		for (int i_162_ = 0; i_162_ < anIntArray12201.length; i_162_++) {
			if ((i & 1 << i_162_) != 0) {
				int i_163_ = class523_sub34.readUnsignedByte(-2113183518);
				int i_164_ = class523_sub34.readUnsignedShort(-1459431595);
				anIntArray12201[i_162_] = i_163_;
				anIntArray12191[i_162_] = i_164_;
			} else {
				anIntArray12201[i_162_] = -1;
				anIntArray12191[i_162_] = -1;
			}
		}
	}

	public void method18679(Class523_Sub34 class523_sub34) {
		class523_sub34.anInt10661 = 0;
		int i = class523_sub34.readUnsignedByte(1956355712);
		for (int i_165_ = 0; i_165_ < anIntArray12201.length; i_165_++) {
			if ((i & 1 << i_165_) != 0) {
				int i_166_ = class523_sub34.readUnsignedByte(1755302736);
				int i_167_ = class523_sub34.readUnsignedShort(-553276163);
				anIntArray12201[i_165_] = i_166_;
				anIntArray12191[i_165_] = i_167_;
			} else {
				anIntArray12201[i_165_] = -1;
				anIntArray12191[i_165_] = -1;
			}
		}
	}

	public void method18680(Class523_Sub34 class523_sub34) {
		class523_sub34.anInt10661 = 0;
		int i = class523_sub34.readUnsignedByte(1718815049);
		for (int i_168_ = 0; i_168_ < anIntArray12201.length; i_168_++) {
			if ((i & 1 << i_168_) != 0) {
				int i_169_ = class523_sub34.readUnsignedByte(-1786341713);
				int i_170_ = class523_sub34.readUnsignedShort(-94583611);
				anIntArray12201[i_168_] = i_169_;
				anIntArray12191[i_168_] = i_170_;
			} else {
				anIntArray12201[i_168_] = -1;
				anIntArray12191[i_168_] = -1;
			}
		}
	}

	void method18681() {
		for (int i = 0; i < anIntArray12201.length; i++)
			anIntArray12201[i] = -1;
		for (int i = 0; i < anIntArray12191.length; i++)
			anIntArray12191[i] = -1;
	}

	public String method18682(boolean bool, int i) {
		String string = "";
		if (prefixTitle != null)
			string = prefixTitle;
		if (bool)
			string = new StringBuilder().append(string).append(displayName).toString();
		else
			string = new StringBuilder().append(string).append(username).toString();
		if (null != suffixTitle)
			string = new StringBuilder().append(string).append(suffixTitle).toString();
		return string;
	}

	void method18683() {
		for (int i = 0; i < anIntArray12201.length; i++)
			anIntArray12201[i] = -1;
		for (int i = 0; i < anIntArray12191.length; i++)
			anIntArray12191[i] = -1;
	}

	void method18684() {
		for (int i = 0; i < anIntArray12201.length; i++)
			anIntArray12201[i] = -1;
		for (int i = 0; i < anIntArray12191.length; i++)
			anIntArray12191[i] = -1;
	}

	void method18685(Class178 class178, Class435 class435, Class167 class167, long l, long l_171_, int i, long l_172_) {
		long l_173_ = l_171_ * l_171_ + l * l;
		if (l_173_ >= 262144L && l_173_ <= l_172_) {
			int i_174_ = ((int) ((Math.atan2((double) l, (double) l_171_) * 2607.5945876176133) - (double) aClass72_11938.method1494((byte) 83)) & 0x3fff);
			Class167 class167_175_ = Class50.method1282(class178, i_174_, anInt11897 * 1360761263, 887325889 * anInt11898, anInt11899 * 1882562377, i, (byte) 1);
			if (null != class167_175_) {
				class178.method3287(false);
				class167_175_.method2708(class435, null, 0);
				class178.method3287(true);
			}
		}
	}

	final void method16735() {
		throw new IllegalStateException();
	}

	final void method16703(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_176_, int i_177_, boolean bool, int i_178_) {
		throw new IllegalStateException();
	}

	public String method18686(boolean bool) {
		String string = "";
		if (prefixTitle != null)
			string = prefixTitle;
		if (bool)
			string = new StringBuilder().append(string).append(displayName).toString();
		else
			string = new StringBuilder().append(string).append(username).toString();
		if (null != suffixTitle)
			string = new StringBuilder().append(string).append(suffixTitle).toString();
		return string;
	}

	public String method18687(boolean bool) {
		if (bool)
			return displayName;
		return username;
	}

	public String method18688(boolean bool) {
		if (bool)
			return displayName;
		return username;
	}

	boolean method16698(Class178 class178, int i, int i_179_, byte i_180_) {
		if (aClass623_12183 == null || !method18663(class178, 131072, -2094421268))
			return false;
		Class435 class435 = method10585();
		boolean bool = false;
		for (int i_181_ = 0; i_181_ < aClass167Array11928.length; i_181_++) {
			if (null != aClass167Array11928[i_181_] && aClass167Array11928[i_181_].aBool1798 && aClass167Array11928[i_181_].method2709(i, i_179_, class435, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_182_ = 0; i_182_ < aClass167Array11928.length; i_182_++)
			aClass167Array11928[i_182_] = null;
		return bool;
	}

	public String method18689(boolean bool) {
		if (bool)
			return displayName;
		return username;
	}

	public String method18690(boolean bool) {
		if (bool)
			return displayName;
		return username;
	}

	public Class564 method16707(Class178 class178, byte i) {
		return null;
	}

	final void method18691(int i, int i_183_, byte i_184_) {
		if (703205765 * anInt11941 < anIntArray11885.length - 1)
			anInt11941 += -822788275;
		for (int i_185_ = anInt11941 * 703205765; i_185_ > 0; i_185_--) {
			anIntArray11885[i_185_] = anIntArray11885[i_185_ - 1];
			anIntArray11943[i_185_] = anIntArray11943[i_185_ - 1];
			aByteArray11944[i_185_] = aByteArray11944[i_185_ - 1];
		}
		anIntArray11885[0] = i;
		anIntArray11943[0] = i_183_;
		aByteArray11944[0] = i_184_;
	}

	final void method18692(int i, int i_186_, byte i_187_) {
		if (703205765 * anInt11941 < anIntArray11885.length - 1)
			anInt11941 += -822788275;
		for (int i_188_ = anInt11941 * 703205765; i_188_ > 0; i_188_--) {
			anIntArray11885[i_188_] = anIntArray11885[i_188_ - 1];
			anIntArray11943[i_188_] = anIntArray11943[i_188_ - 1];
			aByteArray11944[i_188_] = aByteArray11944[i_188_ - 1];
		}
		anIntArray11885[0] = i;
		anIntArray11943[0] = i_186_;
		aByteArray11944[0] = i_187_;
	}

	public final boolean method18693() {
		if (null == aClass623_12183)
			return false;
		return true;
	}

	public final boolean method18694() {
		if (null == aClass623_12183)
			return false;
		return true;
	}

	Class559 method16724(Class178 class178) {
		if (null == aClass623_12183 || !method18663(class178, 2048, -1781078776))
			return null;
		Class435 class435 = class178.method3113();
		Class435 class435_189_ = method10585();
		Class432 class432 = method10569();
		int i = aClass72_11938.method1494((byte) 17);
		Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][(int) class432.aClass437_4862.aFloat4903 >> 9][(int) class432.aClass437_4862.aFloat4905 >> 9]);
		if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591) {
			int i_190_ = (anInt11890 * -1096736227 - class565.aClass647_Sub1_Sub2_7591.aShort11740);
			anInt11890 = (int) ((float) (-1096736227 * anInt11890) - (float) i_190_ / 10.0F) * -17780683;
		} else
			anInt11890 = -17780683 * (int) ((float) (anInt11890 * -1096736227) - (float) (-1096736227 * anInt11890) / 10.0F);
		class435.method6803(class435_189_);
		class435.method6819(0.0F, (float) (-20 - anInt11890 * -1096736227), 0.0F);
		Class559 class559 = null;
		aBool11919 = false;
		if (Class449.aClass523_Sub33_4946.aClass687_Sub7_10627.method16796(-375998870) == 1) {
			Class588 class588 = method18352(-369068563);
			if (class588.aBool7770 && (-1 == aClass623_12183.anInt8106 * -1137516987 || (((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(((aClass623_12183.anInt8106) * -1137516987), (byte) 84)).aBool3269))) {
				Class707 class707 = ((aClass707_11913.method14161(291043207) && aClass707_11913.method14170((short) 255)) ? aClass707_11913 : null);
				Class707_Sub1 class707_sub1 = ((aClass707_Sub1_11887.method14161(-1804055109) && (!aClass707_Sub1_11887.aBool10956 || class707 == null)) ? aClass707_Sub1_11887 : null);
				short i_191_ = Class523_Sub11.aClass625_10427.aShort8146;
				byte i_192_ = Class523_Sub11.aClass625_10427.aByte8145;
				if (-1 != -1137516987 * aClass623_12183.anInt8106) {
					i_191_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) 42))).aShort3296;
					i_192_ = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * aClass623_12183.anInt8106, (byte) -22))).aByte3247;
				}
				Object object = null;
				Class167 class167;
				if (i_191_ > -1 && Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1983143792) == 1)
					class167 = Class237.method4302(class178, i, anInt11897 * 1360761263, anInt11898 * 887325889, 1882562377 * anInt11899, aClass167Array11928[0], i_191_, i_192_, (class707_sub1 != null ? (Class707) class707_sub1 : class707), -940212288);
				else
					class167 = Class53_Sub14.method17215(class178, i, anInt11897 * 1360761263, anInt11898 * 887325889, anInt11899 * 1882562377, 1, aClass167Array11928[0], 0, 0, 160, 240, (null != class707_sub1 ? (Class707) class707_sub1 : class707), 907822881);
				if (null != class167) {
					if (null == aClass180Array10823 || (aClass180Array10823.length < 1 + aClass167Array11928.length))
						method16714(aClass167Array11928.length + 1, 1092543992);
					class559 = Class238.method4306(true, -1377044208);
					aBool11919 = true;
					class178.method3287(false);
					class167.method2708(class435, (aClass180Array10823[aClass167Array11928.length]), 0);
					class178.method3287(true);
				}
			}
		}
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 == this) {
			for (int i_193_ = client.aClass111Array11017.length - 1; i_193_ >= 0; i_193_--) {
				Class111 class111 = client.aClass111Array11017[i_193_];
				if (class111 != null && -1 != 1089230115 * class111.anInt1341) {
					if (1 == 239678453 * class111.anInt1334) {
						Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (class111.anInt1336 * 920515165))));
						if (class523_sub28 != null) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
							Class437 class437 = (Class437.method6932((class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862), Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_194_ = (int) class437.aFloat4903;
							int i_195_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_194_, (long) i_195_, 1089230115 * class111.anInt1341, 92160000L);
						}
					}
					if (239678453 * class111.anInt1334 == 2) {
						Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
						long l = (long) (1757546743 * class111.anInt1338 - (int) class437.aFloat4903);
						long l_196_ = (long) (class111.anInt1339 * 1490265041 - (int) class437.aFloat4905);
						long l_197_ = (long) (-1510348621 * class111.anInt1342 << 9);
						l_197_ *= l_197_;
						method18662(class178, class435, aClass167Array11928[0], l, l_196_, 1089230115 * class111.anInt1341, l_197_);
					}
					if (10 == 239678453 * class111.anInt1334 && class111.anInt1336 * 920515165 >= 0 && (class111.anInt1336 * 920515165 < (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153).length)) {
						Player class647_sub1_sub3_sub1_sub2_198_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[920515165 * class111.anInt1336]);
						if (class647_sub1_sub3_sub1_sub2_198_ != null) {
							Class437 class437 = (Class437.method6932(class647_sub1_sub3_sub1_sub2_198_.method10569().aClass437_4862, Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862));
							int i_199_ = (int) class437.aFloat4903;
							int i_200_ = (int) class437.aFloat4905;
							method18662(class178, class435, aClass167Array11928[0], (long) i_199_, (long) i_200_, class111.anInt1341 * 1089230115, 92160000L);
						}
					}
				}
			}
		}
		class435.method6803(class435_189_);
		class435.method6819(0.0F, (float) (-5 - -1096736227 * anInt11890), 0.0F);
		if (aClass180Array10823 == null || aClass180Array10823.length < aClass167Array11928.length)
			method16714(aClass167Array11928.length, -492829110);
		if (null == class559)
			class559 = Class238.method4306(true, 2110388296);
		method18394(class178, aClass167Array11928, class435, false, 1347136062);
		for (int i_201_ = 0; i_201_ < aClass167Array11928.length; i_201_++) {
			if (null != aClass167Array11928[i_201_])
				aClass167Array11928[i_201_].method2708(class435, aClass180Array10823[i_201_], (this == Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 ? 1 : 0));
			else
				aClass180Array10823[i_201_].aBool2000 = false;
		}
		if (aClass621_11948 != null) {
			Class171 class171 = aClass621_11948.method10135();
			class178.method3120(class171);
		}
		for (int i_202_ = 0; i_202_ < aClass167Array11928.length; i_202_++) {
			if (aClass167Array11928[i_202_] != null)
				aBool11919 |= aClass167Array11928[i_202_].method2730();
			aClass167Array11928[i_202_] = null;
		}
		anInt11889 = -1789738199 * client.anInt10981;
		return class559;
	}

	public Class533 method18336() {
		if (aClass533_11900 != null) {
			if (null == aClass533_11900.aString7130)
				return null;
			if (274117251 * client.anInt11258 == 0 || client.anInt11258 * 274117251 == 3 || (client.anInt11258 * 274117251 == 1 && Class97.method1773(username, (byte) 0)))
				return aClass533_11900;
		}
		return null;
	}

	public int method69(int i) {
		return -1087669731 * anInt11888;
	}

	public void method18695(String string, int i, int i_203_) {
		method18416(string, i, i_203_, (Class286.method5150(1952153263) * (Class523_Sub11.aClass625_10427.anInt8177 * -498484561)), (byte) 96);
	}

	public void method18696(Class523_Sub34 class523_sub34, byte i) {
		aByte12182 = i;
		int i_204_ = -1;
		anInt12192 = 0;
		int[] is = new int[Class655.aClass630_8423.disabledSlots.length];
		Class2[] class2s = new Class2[Class655.aClass630_8423.disabledSlots.length];
		ItemDefinitions[] class12s = new ItemDefinitions[Class655.aClass630_8423.disabledSlots.length];
		for (int i_205_ = 0; i_205_ < Class655.aClass630_8423.disabledSlots.length; i_205_++) {
			if (Class655.aClass630_8423.disabledSlots[i_205_] != 1) {
				int i_206_ = class523_sub34.readUnsignedByte(-1591042596);
				if (i_206_ == 0)
					is[i_205_] = 0;
				else {
					int i_207_ = class523_sub34.readUnsignedByte(526933793);
					int i_208_ = (i_206_ << 8) + i_207_;
					if (0 == i_205_ && 65535 == i_208_) {
						i_204_ = class523_sub34.readBigSmart((byte) -68);
						anInt12192 = (class523_sub34.readUnsignedByte(1632369667) * 1821813279);
						break;
					}
					if (i_208_ >= 16384) {
						i_208_ -= 16384;
						is[i_205_] = i_208_ | 0x40000000;
						class12s[i_205_] = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_208_, (byte) -10);
						int i_209_ = class12s[i_205_].anInt160 * 675808507;
						if (0 != i_209_)
							anInt12192 = i_209_ * 1821813279;
					} else
						is[i_205_] = i_208_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_204_ == -1) {
			int i_210_ = class523_sub34.readUnsignedShort(-892555464);
			int i_211_ = 0;
			for (int i_212_ = 0; i_212_ < Class655.aClass630_8423.disabledSlots.length; i_212_++) {
				if (Class655.aClass630_8423.disabledSlots[i_212_] == 0) {
					if ((i_210_ & 1 << i_211_) != 0)
						class2s[i_212_] = Class470.method7630(class12s[i_212_], class523_sub34, 1609751064);
					i_211_++;
				}
			}
		}
		int[] is_213_ = new int[10];
		for (int i_214_ = 0; i_214_ < 10; i_214_++) {
			int i_215_ = class523_sub34.readUnsignedByte(-2138157697);
			if (Class207.aShortArrayArrayArray2248.length < 1 || i_215_ < 0 || (i_215_ >= Class207.aShortArrayArrayArray2248[i_214_][0].length))
				i_215_ = 0;
			is_213_[i_214_] = i_215_;
		}
		int[] is_216_ = new int[10];
		for (int i_217_ = 0; i_217_ < 10; i_217_++) {
			int i_218_ = class523_sub34.readUnsignedByte(1821569083);
			if (Class21.aShortArrayArrayArray214.length < 1 || i_218_ < 0 || (i_218_ >= Class21.aShortArrayArrayArray214[i_217_][0].length))
				i_218_ = 0;
			is_216_[i_217_] = i_218_;
		}
		anInt12199 = class523_sub34.readUnsignedShort(-1755446414) * -633304531;
		if (null == aClass623_12183)
			aClass623_12183 = new Class623();
		int i_219_ = aClass623_12183.anInt8106 * -1137516987;
		int[] is_220_ = aClass623_12183.anIntArray8102;
		aClass623_12183.method10174(method18348(1322016613), is, class2s, is_213_, is_216_, 1 == aByte12182, i_204_, 800002381);
		if (i_204_ != i_219_) {
			Class437 class437 = Class437.method6884(method10569().aClass437_4862);
			class437.aFloat4903 = (float) ((anIntArray11885[0] << 9) + (method18338(2141910663) << 8));
			class437.aFloat4905 = (float) ((anIntArray11943[0] << 9) + (method18338(2146819921) << 8));
			method10573(class437);
			class437.method6949();
		}
		if (client.anInt11154 * 1109726117 == anInt11888 * -1087669731 && null != is_220_) {
			for (int i_221_ = 0; i_221_ < is_213_.length; i_221_++) {
				if (is_220_[i_221_] != is_213_[i_221_]) {
					Class523_Sub37.aClass53_Sub8_10677.method17185(2136232248);
					break;
				}
			}
		}
		if (null != aClass621_11948)
			aClass621_11948.method10131();
		if (aClass707_Sub1_11887.method14161(116248071) && aClass707_Sub1_11887.aBool10956) {
			Class588 class588 = method18352(626879022);
			if (!class588.method9737(aClass707_Sub1_11887.method14163(-1895347772), 2037117366)) {
				aClass707_Sub1_11887.method14164(-1, (byte) 12);
				aClass707_Sub1_11887.aBool10956 = false;
			}
		}
	}

	public Class437 method188() {
		return Class437.method6878();
	}

	public Class437 method175() {
		return Class437.method6878();
	}

	public Class437 method190() {
		return Class437.method6878();
	}

	public String method18697(boolean bool) {
		if (bool)
			return displayName;
		return username;
	}

	static final void method18698(Class412 class412, byte i) {
		Class523_Sub34_Sub2 buffer = client.aClass116_11058.aClass523_Sub34_Sub2_1431;
		if (Class412.PROJECTILE == class412) {
			int i_222_ = buffer.readUnsignedByte(1478323430);
			int i_223_ = (i_222_ >> 4 & 0xf) + -1074841802 * Class369.anInt3884;
			int i_224_ = (i_222_ & 0xf) + Class523_Sub30.anInt10571 * 1011498114;
			int i_225_ = buffer.readUnsignedByte(-633480689);
			boolean bool = 0 != (i_225_ & 0x1);
			boolean bool_226_ = 0 != (i_225_ & 0x2);
			int i_227_ = bool_226_ ? i_225_ >> 2 : -1;
			int i_228_ = i_223_ + buffer.readByte((short) -22303);
			int i_229_ = i_224_ + buffer.readByte((short) -4132);
			int i_230_ = buffer.readShort(1225178275);
			int i_231_ = buffer.readShort(1701429146);
			int i_232_ = buffer.readUnsignedShort(-416861996);
			int i_233_ = buffer.readUnsignedByte(420401045);
			if (bool_226_)
				i_233_ = (byte) i_233_;
			else
				i_233_ *= 4;
			int i_234_ = buffer.readUnsignedByte(1502938722) * 4;
			int i_235_ = buffer.readUnsignedShort(-494417045);
			int i_236_ = buffer.readUnsignedShort(-808086908);
			int i_237_ = buffer.readUnsignedByte(-1734586701);
			int i_238_ = buffer.readUnsignedShort(-1292340794);
			if (255 == i_237_)
				i_237_ = -1;
			int i_239_ = buffer.readShort(1527904013);
			if (client.aClass505_11019.method8276(1951851749) != Class500.aClass500_5569) {
				if (i_223_ >= 0 && i_224_ >= 0 && (i_223_ < client.aClass505_11019.method8292((byte) 11) * 2) && (i_224_ < client.aClass505_11019.method8292((byte) 106) * 2) && i_228_ >= 0 && i_229_ >= 0 && (i_228_ < client.aClass505_11019.method8235(2140603470) * 2) && (i_229_ < client.aClass505_11019.method8235(2048732133) * 2) && i_232_ != 65535) {
					i_223_ = 256 * i_223_;
					i_224_ *= 256;
					i_228_ = 256 * i_228_;
					i_229_ *= 256;
					i_233_ <<= 2;
					i_234_ <<= 2;
					i_238_ <<= 2;
					Class534_Sub1.method16657(i_232_, i_230_, i_231_, i_227_, i_233_, i_234_, i_223_, i_224_, i_228_, i_229_, i_235_, i_236_, i_237_, i_238_, bool, i_239_, (byte) 0);
				}
			}
		} else if (class412 == Class412.ADJUSTED_PROJECTILE) {
			int i_240_ = buffer.readUnsignedByte(-937421057);
			boolean bool = 0 != (i_240_ & 0x80);
			int i_241_ = (i_240_ >> 3 & 0x7) + 1610062747 * Class369.anInt3884;
			int i_242_ = (i_240_ & 0x7) + -1641734591 * Class523_Sub30.anInt10571;
			int i_243_ = i_241_ + buffer.readByte((short) -20307);
			int i_244_ = i_242_ + buffer.readByte((short) 392);
			int i_245_ = buffer.readShort(-504868206);
			int i_246_ = buffer.readUnsignedShort(-440191658);
			int i_247_ = buffer.readUnsignedByte(-929027677) * 4;
			int i_248_ = buffer.readUnsignedByte(-1006968233) * 4;
			int i_249_ = buffer.readUnsignedShort(-448036531);
			int i_250_ = buffer.readUnsignedShort(-1845983782);
			int i_251_ = buffer.readUnsignedByte(-1103900260);
			int i_252_ = buffer.readUnsignedShort(-1782534404);
			int i_253_ = buffer.readShort(1881537729);
			if (i_251_ == 255)
				i_251_ = -1;
			if (client.aClass505_11019.method8276(1923303041) != Class500.aClass500_5569) {
				if (i_241_ >= 0 && i_242_ >= 0 && i_241_ < client.aClass505_11019.method8292((byte) 5) && i_242_ < client.aClass505_11019.method8235(2078316877) && i_243_ >= 0 && i_244_ >= 0 && i_243_ < client.aClass505_11019.method8292((byte) 8) && i_244_ < client.aClass505_11019.method8235(2100822755) && 65535 != i_246_) {
					i_241_ = 256 + 512 * i_241_;
					i_242_ = i_242_ * 512 + 256;
					i_243_ = 256 + i_243_ * 512;
					i_244_ = 256 + i_244_ * 512;
					i_247_ <<= 2;
					i_248_ <<= 2;
					i_252_ <<= 2;
					Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = (new Class647_Sub1_Sub3_Sub6(client.aClass505_11019.method8241((byte) -12), i_246_, 1369556809 * Class601.anInt7851, Class601.anInt7851 * 1369556809, i_241_, i_242_, i_247_, i_249_ + client.anInt11011, client.anInt11011 + i_250_, i_251_, i_252_, 0, i_245_, i_248_, bool, -1, i_253_));
					class647_sub1_sub3_sub6.method18596(i_243_, i_244_, Class53_Sub17.method17220(i_243_, i_244_, (1369556809 * Class601.anInt7851), -1740037519) - i_248_, client.anInt11011 + i_249_, 1368884328);
					client.aClass708_11074.method14236(new Class523_Sub27_Sub5(class647_sub1_sub3_sub6), -714066866);
				}
			}
		} else if (Class412.aClass412_4546 == class412) {
			int i_254_ = buffer.readUnsignedByte(1275003195);
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_255_ = Class523_Sub30.anInt10571 * -1641734591 + (i_254_ & 0x7);
			int i_256_ = i_255_ + class592.localY * 1704054549;
			int i_257_ = (i_254_ >> 4 & 0x7) + 1610062747 * Class369.anInt3884;
			int i_258_ = class592.localX * 235453015 + i_257_;
			int i_259_ = buffer.readUnsignedShort(-346236607);
			int i_260_ = buffer.readUnsignedShort(-1411954884);
			int i_261_ = buffer.readUnsignedShort(-1777429720);
			if (null != client.aClass14_11172) {
				Class523_Sub10 class523_sub10 = ((Class523_Sub10) (client.aClass14_11172.method741((long) (1369556809 * Class601.anInt7851 << 28 | i_256_ << 14 | i_258_))));
				if (class523_sub10 != null) {
					for (Class523_Sub25 class523_sub25 = (Class523_Sub25) class523_sub10.aClass708_10417.method14240(740981220); class523_sub25 != null; class523_sub25 = (Class523_Sub25) class523_sub10.aClass708_10417.method14244((byte) -30)) {
						if (i_259_ == -188706487 * class523_sub25.anInt10544 && (i_260_ == 321349699 * class523_sub25.anInt10543)) {
							class523_sub25.method8661(607052656);
							class523_sub25.anInt10543 = -1513479061 * i_261_;
							Class236.method4289((1369556809 * Class601.anInt7851), i_258_, i_256_, class523_sub25, 2050797530);
							break;
						}
					}
					if (i_257_ >= 0 && i_255_ >= 0 && i_257_ < client.aClass505_11019.method8292((byte) 3) && (i_255_ < client.aClass505_11019.method8235(2061361931)))
						Class251.method4527(1369556809 * Class601.anInt7851, i_257_, i_255_, 2054599044);
				}
			}
		} else if (Class412.aClass412_4549 == class412) {
			int i_262_ = buffer.readUnsignedShortLE128(1421738123);
			int i_263_ = buffer.readUnsignedByte128(103086162);
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_264_ = Class523_Sub30.anInt10571 * -1641734591 + (i_263_ & 0x7);
			int i_265_ = i_264_ + class592.localY * 1704054549;
			int i_266_ = (i_263_ >> 4 & 0x7) + Class369.anInt3884 * 1610062747;
			int i_267_ = i_266_ + 235453015 * class592.localX;
			int i_268_ = buffer.readUnsignedShort(-1186746030);
			boolean bool = (i_266_ >= 0 && i_264_ >= 0 && i_266_ < client.aClass505_11019.method8292((byte) 13) && i_264_ < client.aClass505_11019.method8235(2068170846));
			if (bool || client.aClass505_11019.method8276(2015004578).method8117(-757050849)) {
				Class236.method4289(1369556809 * Class601.anInt7851, i_267_, i_265_, new Class523_Sub25(i_262_, i_268_), 1344259761);
				if (bool)
					Class251.method4527(Class601.anInt7851 * 1369556809, i_266_, i_264_, 1949885010);
			}
		} else if (class412 == Class412.aClass412_4555) {
			int i_269_ = buffer.readUnsignedIntV2((short) 22000);
			int i_270_ = buffer.readUnsigned128Byte(1401752186);
			int i_271_ = (i_270_ >> 4 & 0x7) + Class369.anInt3884 * 1610062747;
			int i_272_ = (i_270_ & 0x7) + -1641734591 * Class523_Sub30.anInt10571;
			int i_273_ = buffer.readUnsigned128Byte(1071702807);
			int i_274_ = buffer.readUnsignedByte(-323153413);
			int i_275_ = i_274_ >> 2;
			int i_276_ = i_274_ & 0x3;
			int i_277_ = client.anIntArray10985[i_275_];
			if (client.aClass505_11019.method8276(2024338367) != Class500.aClass500_5569)
				Class59.method1401(1369556809 * Class601.anInt7851, i_271_, i_272_, i_277_, i_275_, i_276_, i_269_, i_273_, (byte) 9);
		} else if (Class412.aClass412_4544 == class412) {
			int i_278_ = buffer.readUnsigned128Byte(1940253669);
			int i_279_ = buffer.readUnsignedByte128(506244273);
			int i_280_ = (i_279_ >> 4 & 0x7) + 1610062747 * Class369.anInt3884;
			int i_281_ = (i_279_ & 0x7) + -1641734591 * Class523_Sub30.anInt10571;
			int i_282_ = buffer.readUnsignedIntV2((short) 22643);
			int i_283_ = buffer.readUnsigned128Byte(1047446121);
			int i_284_ = i_283_ >> 2;
			int i_285_ = client.anIntArray10985[i_284_];
			if (1923531495 * Class607.aClass607_7984.anInt7982 == i_284_)
				i_284_ = 1923531495 * Class607.aClass607_7970.anInt7982;
			if ((i_278_ & 0x1) == 1)
				Class565.method9486(Class601.anInt7851 * 1369556809, i_280_, i_281_, i_285_, i_282_, i_284_, null, (byte) -47);
			else {
				int[] is = null;
				if (2 == (i_278_ & 0x2)) {
					int i_286_ = buffer.readUnsignedByte(-641960024);
					is = new int[i_286_];
					for (int i_287_ = 0; i_287_ < i_286_; i_287_++)
						is[i_287_] = buffer.readUnsignedInt((byte) -46);
				}
				short[] is_288_ = null;
				if ((i_278_ & 0x4) == 4) {
					int i_289_ = buffer.readUnsignedByte(293825936);
					is_288_ = new short[i_289_];
					for (int i_290_ = 0; i_290_ < i_289_; i_290_++)
						is_288_[i_290_] = (short) buffer.readUnsignedShort(-1193201341);
				}
				short[] is_291_ = null;
				if (8 == (i_278_ & 0x8)) {
					int i_292_ = buffer.readUnsignedByte(358750870);
					is_291_ = new short[i_292_];
					for (int i_293_ = 0; i_293_ < i_292_; i_293_++)
						is_291_[i_293_] = (short) buffer.readUnsignedShort(-1190747733);
				}
				Class565.method9486(Class601.anInt7851 * 1369556809, i_280_, i_281_, i_285_, i_282_, i_284_, new Class591((2448659741991538231L * Class523_Sub2.aLong10346), is, is_288_, is_291_), (byte) -87);
				Class523_Sub2.aLong10346 += 8328416790296561543L;
			}
		} else if (class412 == Class412.aClass412_4541) {
			int i_294_ = buffer.readUnsignedByte(2147221746);
			int i_295_ = Class369.anInt3884 * 1610062747 + (i_294_ >> 4 & 0x7);
			int i_296_ = Class523_Sub30.anInt10571 * -1641734591 + (i_294_ & 0x7);
			int i_297_ = buffer.readUnsignedShort(-1202101298);
			if (65535 == i_297_)
				i_297_ = -1;
			int i_298_ = buffer.readUnsignedByte(901022414);
			int i_299_ = i_298_ >> 4 & 0xf;
			int i_300_ = i_298_ & 0x7;
			int i_301_ = buffer.readUnsignedByte(1905211853);
			int i_302_ = buffer.readUnsignedByte(1867472050);
			int i_303_ = buffer.readUnsignedShort(-955601663);
			boolean bool = buffer.readUnsignedByte(1652601648) == 1;
			if (client.aClass505_11019.method8276(1969570132) != Class500.aClass500_5569) {
				if (i_295_ >= 0 && i_296_ >= 0 && i_295_ < client.aClass505_11019.method8292((byte) 56) && (i_296_ < client.aClass505_11019.method8235(2121157320))) {
					int i_304_ = i_299_ + 1;
					if ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) >= i_295_ - i_304_ && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) <= i_304_ + i_295_ && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) >= i_296_ - i_304_ && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) <= i_296_ + i_304_) {
						Class437 class437 = new Class437((float) (i_295_ << 9), 0.0F, (float) (i_296_ << 9));
						int i_305_ = 1369556809 * Class601.anInt7851;
						int i_306_ = (bool ? Class198.aClass198_2194.method3672((byte) 99) : Class198.aClass198_2195.method3672((byte) 74));
						Class254.aClass217_2743.method3854(Class189.aClass189_2144, i_297_, i_300_, i_302_, i_306_, Class186.aClass186_2130, 0.0F, (float) (i_299_ << 9), class437, i_305_, i_303_, i_301_, 273225523);
					}
				}
			}
		} else if (class412 == Class412.REMOVE_GROUND_ITEM) {
			int itemId = buffer.readUnsignedShort128((short) 3865);
			int hash = buffer.readUnsignedByte128(631390220);
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_309_ = (hash & 0x7) + Class523_Sub30.anInt10571 * -1641734591;
			int i_310_ = class592.localY * 1704054549 + i_309_;
			int i_311_ = (hash >> 4 & 0x7) + 1610062747 * Class369.anInt3884;
			int i_312_ = i_311_ + 235453015 * class592.localX;
			Class523_Sub10 class523_sub10 = ((Class523_Sub10) (client.aClass14_11172.method741((long) (1369556809 * Class601.anInt7851 << 28 | i_310_ << 14 | i_312_))));
			if (class523_sub10 != null) {
				for (Class523_Sub25 class523_sub25 = (Class523_Sub25) class523_sub10.aClass708_10417.method14240(599813448); null != class523_sub25; class523_sub25 = (Class523_Sub25) class523_sub10.aClass708_10417.method14244((byte) -86)) {
					if (itemId == class523_sub25.anInt10544 * -188706487) {
						class523_sub25.method8661(607052656);
						break;
					}
				}
				if (class523_sub10.aClass708_10417.method14237((byte) 104))
					class523_sub10.method8661(607052656);
				if (i_311_ >= 0 && i_309_ >= 0 && i_311_ < client.aClass505_11019.method8292((byte) 60) && i_309_ < client.aClass505_11019.method8235(2080211869))
					Class251.method4527(Class601.anInt7851 * 1369556809, i_311_, i_309_, 2109070063);
			}
		} else if (class412 == Class412.aClass412_4552) {
			int i_313_ = buffer.readUnsignedByte(-61217516);
			int i_314_ = Class369.anInt3884 * 1610062747 + (i_313_ >> 4 & 0x7);
			int i_315_ = (i_313_ & 0x7) + -1641734591 * Class523_Sub30.anInt10571;
			int i_316_ = buffer.readUnsignedShort(-156479299);
			if (65535 == i_316_)
				i_316_ = -1;
			int i_317_ = buffer.readUnsignedShort(-2144130781);
			int i_318_ = buffer.readUnsignedShort(-1973886727);
			int i_319_ = buffer.readUnsignedByte(1440122593);
			int i_320_ = buffer.readShort(-1674601953);
			if (client.aClass505_11019.method8276(1982920918) != Class500.aClass500_5569) {
				if (i_314_ >= 0 && i_315_ >= 0 && i_314_ < client.aClass505_11019.method8292((byte) 99) && (i_315_ < client.aClass505_11019.method8235(2118975889))) {
					if (i_316_ == -1) {
						Class523_Sub27_Sub9 class523_sub27_sub9 = ((Class523_Sub27_Sub9) client.aClass14_11174.method741((long) (i_314_ << 16 | i_315_)));
						if (class523_sub27_sub9 != null) {
							class523_sub27_sub9.aClass647_Sub1_Sub3_Sub4_11721.method18578(1369893029);
							class523_sub27_sub9.method8661(607052656);
						}
					} else {
						int i_321_ = i_314_ * 512 + 256;
						int i_322_ = i_315_ * 512 + 256;
						int i_323_ = 1369556809 * Class601.anInt7851;
						if (i_323_ < 3 && client.aClass505_11019.method8243(518789726).method7282(i_314_, i_315_, -638715901))
							i_323_++;
						Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = (new Class647_Sub1_Sub3_Sub4(client.aClass505_11019.method8241((byte) -81), i_316_, i_318_, Class601.anInt7851 * 1369556809, i_323_, i_321_, (Class53_Sub17.method17220(i_321_, i_322_, (Class601.anInt7851 * 1369556809), -1639913447) - i_317_), i_322_, i_314_, i_314_, i_315_, i_315_, i_319_, false, i_320_));
						client.aClass14_11174.method738(new Class523_Sub27_Sub9(class647_sub1_sub3_sub4), (long) (i_314_ << 16 | i_315_));
					}
				}
			}
		} else if (class412 == Class412.SEND_OBJECT) {
			int hash = buffer.readUnsigned128Byte(1143818252);
			int i_325_ = hash >> 2;
			int i_326_ = hash & 0x3;
			int i_327_ = client.anIntArray10985[i_325_];
			int i_328_ = buffer.readUnsignedByte128(833837610);
			int i_329_ = Class369.anInt3884 * 1610062747 + (i_328_ >> 4 & 0x7);
			int i_330_ = (i_328_ & 0x7) + -1641734591 * Class523_Sub30.anInt10571;
			int id = buffer.readUnsignedIntLE((short) -15017);
			if (client.aClass505_11019.method8276(1581096137).method8117(-757050849) || (i_329_ >= 0 && i_330_ >= 0 && i_329_ < client.aClass505_11019.method8292((byte) 18) && i_330_ < client.aClass505_11019.method8235(2146035691)))
				Class707.method14232(Class601.anInt7851 * 1369556809, i_329_, i_330_, i_327_, id, i_325_, i_326_, 1185570644);
		} else if (class412 == Class412.SEND_GROUND_ITEM) {
			int i_332_ = buffer.readUnsignedShort128((short) 7797);
			int amount = buffer.readUnsignedShortLE((byte) 38);
			int hash = buffer.readUnsignedByteC(-228798718);
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_335_ = (hash & 0x7) + Class523_Sub30.anInt10571 * -1641734591;
			int i_336_ = i_335_ + class592.localY * 1704054549;
			int i_337_ = (hash >> 4 & 0x7) + Class369.anInt3884 * 1610062747;
			int i_338_ = class592.localX * 235453015 + i_337_;
			int id = buffer.readUnsignedShortLE((byte) 91);
			if (i_332_ != 1109726117 * client.anInt11154) {
				boolean bool = (i_337_ >= 0 && i_335_ >= 0 && i_337_ < client.aClass505_11019.method8292((byte) 14) && (i_335_ < client.aClass505_11019.method8235(2090103213)));
				if (bool || client.aClass505_11019.method8276(1856282018).method8117(-757050849)) {
					Class236.method4289(1369556809 * Class601.anInt7851, i_338_, i_336_, new Class523_Sub25(id, amount), 1899695719);
					if (bool)
						Class251.method4527(1369556809 * Class601.anInt7851, i_337_, i_335_, 1860326660);
				}
			}
		} else if (class412 == Class412.REMOVE_OBJECT) {
			int i_340_ = buffer.readUnsignedByteC(-1954192410);
			int i_341_ = i_340_ >> 2;
			int i_342_ = i_340_ & 0x3;
			int i_343_ = client.anIntArray10985[i_341_];
			int i_344_ = buffer.readUnsignedByte(-1114348798);
			int i_345_ = Class369.anInt3884 * 1610062747 + (i_344_ >> 4 & 0x7);
			int i_346_ = (i_344_ & 0x7) + Class523_Sub30.anInt10571 * -1641734591;
			if (client.aClass505_11019.method8276(2034235664).method8117(-757050849) || (i_345_ >= 0 && i_346_ >= 0 && i_345_ < client.aClass505_11019.method8292((byte) 115) && i_346_ < client.aClass505_11019.method8235(2133256616)))
				Class707.method14232(Class601.anInt7851 * 1369556809, i_345_, i_346_, i_343_, -1, i_341_, i_342_, -369720291);
		} else if (class412 == Class412.aClass412_4554) {
			int i_347_ = buffer.readUnsignedByte(1487037355);
			int i_348_ = 1610062747 * Class369.anInt3884 + (i_347_ >> 4 & 0x7);
			int i_349_ = Class523_Sub30.anInt10571 * -1641734591 + (i_347_ & 0x7);
			int i_350_ = buffer.readUnsignedShort(-1066371667);
			if (i_350_ == 65535)
				i_350_ = -1;
			int i_351_ = buffer.readUnsignedByte(-1942917482);
			int i_352_ = i_351_ >> 4 & 0xf;
			int i_353_ = i_351_ & 0x7;
			int i_354_ = buffer.readUnsignedByte(1591982252);
			int i_355_ = buffer.readUnsignedByte(642438344);
			int i_356_ = buffer.readUnsignedShort(-1242851167);
			if (client.aClass505_11019.method8276(1590076956) != Class500.aClass500_5569) {
				if (i_348_ >= 0 && i_349_ >= 0 && i_348_ < client.aClass505_11019.method8292((byte) 44) && (i_349_ < client.aClass505_11019.method8235(2107455188))) {
					int i_357_ = i_352_ + 1;
					if ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) >= i_348_ - i_357_ && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) <= i_348_ + i_357_ && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) >= i_349_ - i_357_ && (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) <= i_357_ + i_349_) {
						Class437 class437 = new Class437((float) (i_348_ << 9), 0.0F, (float) (i_349_ << 9));
						int i_358_ = 1369556809 * Class601.anInt7851;
						Class254.aClass217_2743.method3854(Class189.aClass189_2144, i_350_, i_353_, i_355_, Class198.aClass198_2195.method3672((byte) 36), Class186.aClass186_2130, 0.0F, (float) (i_352_ << 9), class437, i_358_, i_356_, i_354_, 772189724);
					}
				}
			}
		} else if (class412 == Class412.aClass412_4553) {
			buffer.readUnsignedByte(2120172969);
			int i_359_ = buffer.readUnsignedByte(451864637);
			int i_360_ = (i_359_ >> 4 & 0x7) + Class369.anInt3884 * 1610062747;
			int i_361_ = -1641734591 * Class523_Sub30.anInt10571 + (i_359_ & 0x7);
			int i_362_ = buffer.readUnsignedShort(-648823268);
			int i_363_ = buffer.readUnsignedByte(-750952357);
			int i_364_ = buffer.read24BitInt(393407047);
			String string = buffer.readString(-1359272458);
			if (client.aClass505_11019.method8276(1843807469) != Class500.aClass500_5569)
				Class279.method5061(1369556809 * Class601.anInt7851, i_360_, i_361_, i_363_, i_362_, i_364_, string, (byte) 113);
		} else if (Class412.aClass412_4551 == class412) {
			int i_365_ = buffer.readUnsignedInt((byte) -70);
			int i_366_ = buffer.readUnsignedByte(-71299305);
			((Class602) client.aClass505_11019.method8244(1485840454).getDefinition(i_365_, (byte) 60)).method9891(i_366_, (byte) -51);
		} else {
			Class305.method5553(new StringBuilder().append("").append(class412).toString(), new RuntimeException(), (byte) 1);
			Class669.method13691(false, -1838550041);
		}
	}
}
