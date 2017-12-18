/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class280 implements Interface13 {
	int[] anIntArray3042;
	int[] anIntArray3043;
	public String aString3044;
	int[][] anIntArrayArray3045;
	int[][] anIntArrayArray3046;
	public int anInt3047 = 0;
	public int anInt3048 = 0;
	public boolean aBool3049 = false;
	public int anInt3050;
	int[] anIntArray3051;
	public int[] anIntArray3052;
	public int[][] anIntArrayArray3053;
	int[] anIntArray3054;
	public int[] anIntArray3055;
	Interface12 anInterface12_3056;
	int[] anIntArray3057;
	public String[] aStringArray3058;
	public int[] anIntArray3059;
	public String aString3060;
	public String[] aStringArray3061;
	public int anInt3062;
	Class14 aClass14_3063;
	public int anInt3064 = -1168295539;

	public void readValues(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-433378317);
			if (0 == i)
				break;
			method5084(class523_sub34, i, -738335713);
		}
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-1180128749);
			if (0 == i_0_)
				break;
			method5084(class523_sub34, i_0_, -1095354558);
		}
	}

	public boolean method5064(Interface17 interface17) {
		if (anIntArrayArray3045 != null) {
			for (int i = 0; i < anIntArrayArray3045.length; i++) {
				Class159 class159 = (((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArrayArray3045[i][0], 1983405376));
				if (interface17.method94(class159, -503518006) >= anIntArrayArray3045[i][2])
					return true;
			}
		}
		if (null != anIntArrayArray3046) {
			for (int i = 0; i < anIntArrayArray3046.length; i++) {
				VarBitDefinitions class309 = ((Interface19) interface17).method106(anIntArrayArray3046[i][0], -27109028);
				if (interface17.method93(class309, -1039470426) >= anIntArrayArray3046[i][2])
					return true;
			}
		}
		return false;
	}

	public void method78() {
		if (aString3060 == null)
			aString3060 = aString3044;
	}

	public int method5065(int i, int i_1_) {
		if (null == aClass14_3063)
			return i_1_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_3063.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_1_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public String method5066(int i, String string, int i_2_) {
		if (aClass14_3063 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_3063.getFromIndex((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	void method5067(RSBuffer class523_sub34, int i) {
		if (i == 1)
			aString3044 = class523_sub34.readVersionedString(2065274127);
		else if (2 == i)
			aString3060 = class523_sub34.readVersionedString(2013716074);
		else if (3 == i) {
			int i_3_ = class523_sub34.readUnsignedByte(-1665913714);
			anIntArrayArray3045 = new int[i_3_][3];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				anIntArrayArray3045[i_4_][0] = class523_sub34.readUnsignedShort(-1835315694);
				anIntArrayArray3045[i_4_][1] = class523_sub34.readUnsignedInt((byte) -34);
				anIntArrayArray3045[i_4_][2] = class523_sub34.readUnsignedInt((byte) -22);
			}
		} else if (i == 4) {
			int i_5_ = class523_sub34.readUnsignedByte(132485826);
			anIntArrayArray3046 = new int[i_5_][3];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				anIntArrayArray3046[i_6_][0] = class523_sub34.readUnsignedShort(-1777269652);
				anIntArrayArray3046[i_6_][1] = class523_sub34.readUnsignedInt((byte) -115);
				anIntArrayArray3046[i_6_][2] = class523_sub34.readUnsignedInt((byte) -22);
			}
		} else if (5 == i)
			class523_sub34.readUnsignedShort(-146651365);
		else if (i == 6)
			anInt3047 = class523_sub34.readUnsignedByte(-321656706) * 772169099;
		else if (7 == i)
			anInt3048 = class523_sub34.readUnsignedByte(-432186909) * -756400263;
		else if (8 == i)
			aBool3049 = true;
		else if (i == 9)
			anInt3050 = class523_sub34.readUnsignedByte(170123496) * 335655407;
		else if (i == 10) {
			int i_7_ = class523_sub34.readUnsignedByte(410093369);
			anIntArray3051 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				anIntArray3051[i_8_] = class523_sub34.readUnsignedInt((byte) -13);
		} else if (i == 12)
			class523_sub34.readUnsignedInt((byte) -118);
		else if (13 == i) {
			int i_9_ = class523_sub34.readUnsignedByte(546943835);
			anIntArray3052 = new int[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				anIntArray3052[i_10_] = class523_sub34.readUnsignedShort(-444963675);
		} else if (14 == i) {
			int i_11_ = class523_sub34.readUnsignedByte(653615945);
			anIntArrayArray3053 = new int[i_11_][2];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				anIntArrayArray3053[i_12_][0] = class523_sub34.readUnsignedByte(-1768860763);
				anIntArrayArray3053[i_12_][1] = class523_sub34.readUnsignedByte(-931924067);
			}
		} else if (15 == i)
			anInt3062 = class523_sub34.readUnsignedShort(-975852709) * 1643520837;
		else if (17 == i)
			anInt3064 = class523_sub34.readBigSmart((byte) -12) * 1168295539;
		else if (i == 18) {
			int i_13_ = class523_sub34.readUnsignedByte(-626060639);
			anIntArray3055 = new int[i_13_];
			anIntArray3043 = new int[i_13_];
			anIntArray3057 = new int[i_13_];
			aStringArray3058 = new String[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
				anIntArray3055[i_14_] = class523_sub34.readUnsignedInt((byte) -20);
				anIntArray3043[i_14_] = class523_sub34.readUnsignedInt((byte) -114);
				anIntArray3057[i_14_] = class523_sub34.readUnsignedInt((byte) -85);
				aStringArray3058[i_14_] = class523_sub34.readString(-158685711);
			}
		} else if (19 == i) {
			int i_15_ = class523_sub34.readUnsignedByte(-171378155);
			anIntArray3059 = new int[i_15_];
			anIntArray3054 = new int[i_15_];
			anIntArray3042 = new int[i_15_];
			aStringArray3061 = new String[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				anIntArray3059[i_16_] = class523_sub34.readUnsignedInt((byte) -41);
				anIntArray3054[i_16_] = class523_sub34.readUnsignedInt((byte) -39);
				anIntArray3042[i_16_] = class523_sub34.readUnsignedInt((byte) -51);
				aStringArray3061[i_16_] = class523_sub34.readString(-2111799738);
			}
		} else if (i == 249) {
			int i_17_ = class523_sub34.readUnsignedByte(-869711351);
			if (aClass14_3063 == null) {
				int i_18_ = Class628.method10313(i_17_, 1676847064);
				aClass14_3063 = new Class14(i_18_);
			}
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
				boolean bool = class523_sub34.readUnsignedByte(1050352949) == 1;
				int i_20_ = class523_sub34.read24BitInt(-206370853);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(-987161252));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -38));
				aClass14_3063.method738(class523, (long) i_20_);
			}
		}
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(904632640);
			if (0 == i)
				break;
			method5084(class523_sub34, i, -1253782924);
		}
	}

	public boolean method5068(Interface17 interface17, int i) {
		if (Class178_Sub3.method15481(interface17, anInterface12_3056, 526853565) < 1555822477 * anInt3062)
			return false;
		if (null != anIntArrayArray3053) {
			for (int i_21_ = 0; i_21_ < anIntArrayArray3053.length; i_21_++) {
				if (((Interface73) interface17).method487(anIntArrayArray3053[i_21_][0], -442433410) < anIntArrayArray3053[i_21_][1])
					return false;
			}
		}
		if (null != anIntArray3052) {
			for (int i_22_ = 0; i_22_ < anIntArray3052.length; i_22_++) {
				if (!((Class280) anInterface12_3056.getDefinition(anIntArray3052[i_22_], (byte) -47)).method5069(interface17, (short) 1724))
					return false;
			}
		}
		if (anIntArray3055 != null) {
			for (int i_23_ = 0; i_23_ < anIntArray3055.length; i_23_++) {
				Class159 class159 = ((Interface19) interface17).method110((VarDomainType.PLAYER_CONFIGS), (anIntArray3055[i_23_]), 1733849383);
				int i_24_ = interface17.method94(class159, -814154695);
				if (i_24_ < anIntArray3043[i_23_] || i_24_ > anIntArray3057[i_23_])
					return false;
			}
		}
		if (anIntArray3059 != null) {
			for (int i_25_ = 0; i_25_ < anIntArray3059.length; i_25_++) {
				VarBitDefinitions class309 = ((Interface19) interface17).method106(anIntArray3059[i_25_], 299937739);
				int i_26_ = interface17.method93(class309, 322681682);
				if (i_26_ < anIntArray3054[i_25_] || i_26_ > anIntArray3042[i_25_])
					return false;
			}
		}
		return true;
	}

	public boolean method5069(Interface17 interface17, short i) {
		if (anIntArrayArray3045 != null) {
			for (int i_27_ = 0; i_27_ < anIntArrayArray3045.length; i_27_++) {
				Class159 class159 = (((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArrayArray3045[i_27_][0], 1562388270));
				if (interface17.method94(class159, 1768733389) >= anIntArrayArray3045[i_27_][2])
					return true;
			}
		}
		if (null != anIntArrayArray3046) {
			for (int i_28_ = 0; i_28_ < anIntArrayArray3046.length; i_28_++) {
				VarBitDefinitions class309 = (((Interface19) interface17).method106(anIntArrayArray3046[i_28_][0], -656335372));
				if (interface17.method93(class309, -908152310) >= anIntArrayArray3046[i_28_][2])
					return true;
			}
		}
		return false;
	}

	public boolean method5070(Interface17 interface17, int i, byte i_29_) {
		if (anIntArrayArray3053 == null || i < 0 || i >= anIntArrayArray3053.length)
			return false;
		if (((Interface73) interface17).method487(anIntArrayArray3053[i][0], 1213727062) < anIntArrayArray3053[i][1])
			return false;
		return true;
	}

	public boolean method5071(Interface17 interface17, int i, byte i_30_) {
		if (anIntArray3052 == null || i < 0 || i >= anIntArray3052.length)
			return false;
		if (!((Class280) anInterface12_3056.getDefinition(anIntArray3052[i], (byte) -6)).method5069(interface17, (short) 14641))
			return false;
		return true;
	}

	public boolean method5072(Interface17 interface17, int i, int i_31_) {
		if (null == anIntArray3055 || i < 0 || i >= anIntArray3055.length)
			return false;
		Class159 class159 = ((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArray3055[i], 1964276846);
		int i_32_ = interface17.method94(class159, -1600385866);
		if (i_32_ < anIntArray3043[i] || i_32_ > anIntArray3057[i])
			return false;
		return true;
	}

	public boolean method5073(Interface17 interface17, int i, int i_33_) {
		if (anIntArray3059 == null || i < 0 || i >= anIntArray3059.length)
			return false;
		VarBitDefinitions class309 = ((Interface19) interface17).method106(anIntArray3059[i], 1798559298);
		int i_34_ = interface17.method93(class309, -1379209813);
		if (i_34_ < anIntArray3054[i] || i_34_ > anIntArray3042[i])
			return false;
		return true;
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(954443373);
			if (0 == i)
				break;
			method5084(class523_sub34, i, -889555760);
		}
	}

	public boolean method5074(Interface17 interface17, byte i) {
		if (anIntArrayArray3045 != null) {
			for (int i_35_ = 0; i_35_ < anIntArrayArray3045.length; i_35_++) {
				Class159 class159 = (((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArrayArray3045[i_35_][0], 1234728748));
				if (interface17.method94(class159, -983269209) >= anIntArrayArray3045[i_35_][1])
					return true;
			}
		}
		if (null != anIntArrayArray3046) {
			for (int i_36_ = 0; i_36_ < anIntArrayArray3046.length; i_36_++) {
				VarBitDefinitions class309 = (((Interface19) interface17).method106(anIntArrayArray3046[i_36_][0], -1024879241));
				if (interface17.method93(class309, -1885270658) >= anIntArrayArray3046[i_36_][1])
					return true;
			}
		}
		return false;
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1737901350);
			if (0 == i)
				break;
			method5084(class523_sub34, i, 70244447);
		}
	}

	public boolean method5075(Interface17 interface17) {
		if (anIntArrayArray3045 != null) {
			for (int i = 0; i < anIntArrayArray3045.length; i++) {
				Class159 class159 = (((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArrayArray3045[i][0], 1660450701));
				if (interface17.method94(class159, 363862091) >= anIntArrayArray3045[i][1])
					return true;
			}
		}
		if (null != anIntArrayArray3046) {
			for (int i = 0; i < anIntArrayArray3046.length; i++) {
				VarBitDefinitions class309 = ((Interface19) interface17).method106(anIntArrayArray3046[i][0], 402120833);
				if (interface17.method93(class309, -2001186045) >= anIntArrayArray3046[i][1])
					return true;
			}
		}
		return false;
	}

	public boolean method5076(Interface17 interface17) {
		if (anIntArrayArray3045 != null) {
			for (int i = 0; i < anIntArrayArray3045.length; i++) {
				Class159 class159 = (((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArrayArray3045[i][0], 1920626476));
				if (interface17.method94(class159, 1569944082) >= anIntArrayArray3045[i][1])
					return true;
			}
		}
		if (null != anIntArrayArray3046) {
			for (int i = 0; i < anIntArrayArray3046.length; i++) {
				VarBitDefinitions class309 = ((Interface19) interface17).method106(anIntArrayArray3046[i][0], -1111512921);
				if (interface17.method93(class309, -1328958110) >= anIntArrayArray3046[i][1])
					return true;
			}
		}
		return false;
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1195715580);
			if (0 == i)
				break;
			method5084(class523_sub34, i, -688026891);
		}
	}

	Class280(int i, Interface12 interface12) {
		anInterface12_3056 = interface12;
	}

	public void method79() {
		if (aString3060 == null)
			aString3060 = aString3044;
	}

	public void method77() {
		if (aString3060 == null)
			aString3060 = aString3044;
	}

	public void method73() {
		if (aString3060 == null)
			aString3060 = aString3044;
	}

	void method5077(RSBuffer class523_sub34, int i) {
		if (i == 1)
			aString3044 = class523_sub34.readVersionedString(1998675082);
		else if (2 == i)
			aString3060 = class523_sub34.readVersionedString(2089493981);
		else if (3 == i) {
			int i_37_ = class523_sub34.readUnsignedByte(-751418049);
			anIntArrayArray3045 = new int[i_37_][3];
			for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
				anIntArrayArray3045[i_38_][0] = class523_sub34.readUnsignedShort(-128673205);
				anIntArrayArray3045[i_38_][1] = class523_sub34.readUnsignedInt((byte) -126);
				anIntArrayArray3045[i_38_][2] = class523_sub34.readUnsignedInt((byte) -17);
			}
		} else if (i == 4) {
			int i_39_ = class523_sub34.readUnsignedByte(-1456925322);
			anIntArrayArray3046 = new int[i_39_][3];
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				anIntArrayArray3046[i_40_][0] = class523_sub34.readUnsignedShort(-1450328067);
				anIntArrayArray3046[i_40_][1] = class523_sub34.readUnsignedInt((byte) -89);
				anIntArrayArray3046[i_40_][2] = class523_sub34.readUnsignedInt((byte) -46);
			}
		} else if (5 == i)
			class523_sub34.readUnsignedShort(-1275299741);
		else if (i == 6)
			anInt3047 = class523_sub34.readUnsignedByte(-329720027) * 772169099;
		else if (7 == i)
			anInt3048 = class523_sub34.readUnsignedByte(-1113611370) * -756400263;
		else if (8 == i)
			aBool3049 = true;
		else if (i == 9)
			anInt3050 = class523_sub34.readUnsignedByte(-921596693) * 335655407;
		else if (i == 10) {
			int i_41_ = class523_sub34.readUnsignedByte(711193577);
			anIntArray3051 = new int[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
				anIntArray3051[i_42_] = class523_sub34.readUnsignedInt((byte) -32);
		} else if (i == 12)
			class523_sub34.readUnsignedInt((byte) -53);
		else if (13 == i) {
			int i_43_ = class523_sub34.readUnsignedByte(404274653);
			anIntArray3052 = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
				anIntArray3052[i_44_] = class523_sub34.readUnsignedShort(-1925008572);
		} else if (14 == i) {
			int i_45_ = class523_sub34.readUnsignedByte(-668818776);
			anIntArrayArray3053 = new int[i_45_][2];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
				anIntArrayArray3053[i_46_][0] = class523_sub34.readUnsignedByte(867350578);
				anIntArrayArray3053[i_46_][1] = class523_sub34.readUnsignedByte(-1087851201);
			}
		} else if (15 == i)
			anInt3062 = class523_sub34.readUnsignedShort(-1616665509) * 1643520837;
		else if (17 == i)
			anInt3064 = class523_sub34.readBigSmart((byte) -110) * 1168295539;
		else if (i == 18) {
			int i_47_ = class523_sub34.readUnsignedByte(-622134559);
			anIntArray3055 = new int[i_47_];
			anIntArray3043 = new int[i_47_];
			anIntArray3057 = new int[i_47_];
			aStringArray3058 = new String[i_47_];
			for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
				anIntArray3055[i_48_] = class523_sub34.readUnsignedInt((byte) -128);
				anIntArray3043[i_48_] = class523_sub34.readUnsignedInt((byte) -77);
				anIntArray3057[i_48_] = class523_sub34.readUnsignedInt((byte) -51);
				aStringArray3058[i_48_] = class523_sub34.readString(132733455);
			}
		} else if (19 == i) {
			int i_49_ = class523_sub34.readUnsignedByte(546363552);
			anIntArray3059 = new int[i_49_];
			anIntArray3054 = new int[i_49_];
			anIntArray3042 = new int[i_49_];
			aStringArray3061 = new String[i_49_];
			for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
				anIntArray3059[i_50_] = class523_sub34.readUnsignedInt((byte) -81);
				anIntArray3054[i_50_] = class523_sub34.readUnsignedInt((byte) -65);
				anIntArray3042[i_50_] = class523_sub34.readUnsignedInt((byte) -41);
				aStringArray3061[i_50_] = class523_sub34.readString(-1099148861);
			}
		} else if (i == 249) {
			int i_51_ = class523_sub34.readUnsignedByte(127003758);
			if (aClass14_3063 == null) {
				int i_52_ = Class628.method10313(i_51_, -9682048);
				aClass14_3063 = new Class14(i_52_);
			}
			for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
				boolean bool = class523_sub34.readUnsignedByte(35927188) == 1;
				int i_54_ = class523_sub34.read24BitInt(2078150816);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(252591753));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -108));
				aClass14_3063.method738(class523, (long) i_54_);
			}
		}
	}

	public int method5078(int i, int i_55_, byte i_56_) {
		if (null == aClass14_3063)
			return i_55_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_3063.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_55_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public boolean method5079(Interface17 interface17, int i) {
		if (null == anIntArray3055 || i < 0 || i >= anIntArray3055.length)
			return false;
		Class159 class159 = ((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArray3055[i], 1277724100);
		int i_57_ = interface17.method94(class159, -1766984145);
		if (i_57_ < anIntArray3043[i] || i_57_ > anIntArray3057[i])
			return false;
		return true;
	}

	public int method5080(int i, int i_58_) {
		if (null == aClass14_3063)
			return i_58_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_3063.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_58_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public boolean method5081(Interface17 interface17, int i) {
		if (Class178_Sub3.method15481(interface17, anInterface12_3056, 526853565) < anInt3062 * 1555822477)
			return false;
		return true;
	}

	public String method5082(int i, String string) {
		if (aClass14_3063 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_3063.getFromIndex((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public boolean method5083(Interface17 interface17) {
		if (anIntArrayArray3045 != null) {
			for (int i = 0; i < anIntArrayArray3045.length; i++) {
				Class159 class159 = (((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArrayArray3045[i][0], 1793523870));
				if (interface17.method94(class159, -1607886848) >= anIntArrayArray3045[i][1])
					return true;
			}
		}
		if (null != anIntArrayArray3046) {
			for (int i = 0; i < anIntArrayArray3046.length; i++) {
				VarBitDefinitions class309 = ((Interface19) interface17).method106(anIntArrayArray3046[i][0], 789139424);
				if (interface17.method93(class309, 58035626) >= anIntArrayArray3046[i][1])
					return true;
			}
		}
		return false;
	}

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1376361247);
			if (0 == i)
				break;
			method5084(class523_sub34, i, 1173956469);
		}
	}

	void method5084(RSBuffer class523_sub34, int i, int i_59_) {
		if (i == 1)
			aString3044 = class523_sub34.readVersionedString(2019105090);
		else if (2 == i)
			aString3060 = class523_sub34.readVersionedString(2017300396);
		else if (3 == i) {
			int i_60_ = class523_sub34.readUnsignedByte(-1786676881);
			anIntArrayArray3045 = new int[i_60_][3];
			for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
				anIntArrayArray3045[i_61_][0] = class523_sub34.readUnsignedShort(-1929233723);
				anIntArrayArray3045[i_61_][1] = class523_sub34.readUnsignedInt((byte) -74);
				anIntArrayArray3045[i_61_][2] = class523_sub34.readUnsignedInt((byte) -53);
			}
		} else if (i == 4) {
			int i_62_ = class523_sub34.readUnsignedByte(169996426);
			anIntArrayArray3046 = new int[i_62_][3];
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
				anIntArrayArray3046[i_63_][0] = class523_sub34.readUnsignedShort(-1990807289);
				anIntArrayArray3046[i_63_][1] = class523_sub34.readUnsignedInt((byte) -33);
				anIntArrayArray3046[i_63_][2] = class523_sub34.readUnsignedInt((byte) -119);
			}
		} else if (5 == i)
			class523_sub34.readUnsignedShort(-694217206);
		else if (i == 6)
			anInt3047 = class523_sub34.readUnsignedByte(-705731769) * 772169099;
		else if (7 == i)
			anInt3048 = class523_sub34.readUnsignedByte(-1489839003) * -756400263;
		else if (8 == i)
			aBool3049 = true;
		else if (i == 9)
			anInt3050 = class523_sub34.readUnsignedByte(-2015498933) * 335655407;
		else if (i == 10) {
			int i_64_ = class523_sub34.readUnsignedByte(1234309010);
			anIntArray3051 = new int[i_64_];
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++)
				anIntArray3051[i_65_] = class523_sub34.readUnsignedInt((byte) -119);
		} else if (i == 12)
			class523_sub34.readUnsignedInt((byte) -86);
		else if (13 == i) {
			int i_66_ = class523_sub34.readUnsignedByte(-634990246);
			anIntArray3052 = new int[i_66_];
			for (int i_67_ = 0; i_67_ < i_66_; i_67_++)
				anIntArray3052[i_67_] = class523_sub34.readUnsignedShort(-237850053);
		} else if (14 == i) {
			int i_68_ = class523_sub34.readUnsignedByte(127761046);
			anIntArrayArray3053 = new int[i_68_][2];
			for (int i_69_ = 0; i_69_ < i_68_; i_69_++) {
				anIntArrayArray3053[i_69_][0] = class523_sub34.readUnsignedByte(708105839);
				anIntArrayArray3053[i_69_][1] = class523_sub34.readUnsignedByte(177508568);
			}
		} else if (15 == i)
			anInt3062 = class523_sub34.readUnsignedShort(-1457992434) * 1643520837;
		else if (17 == i)
			anInt3064 = class523_sub34.readBigSmart((byte) -97) * 1168295539;
		else if (i == 18) {
			int i_70_ = class523_sub34.readUnsignedByte(2095998323);
			anIntArray3055 = new int[i_70_];
			anIntArray3043 = new int[i_70_];
			anIntArray3057 = new int[i_70_];
			aStringArray3058 = new String[i_70_];
			for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
				anIntArray3055[i_71_] = class523_sub34.readUnsignedInt((byte) -85);
				anIntArray3043[i_71_] = class523_sub34.readUnsignedInt((byte) -49);
				anIntArray3057[i_71_] = class523_sub34.readUnsignedInt((byte) -113);
				aStringArray3058[i_71_] = class523_sub34.readString(-45415842);
			}
		} else if (19 == i) {
			int i_72_ = class523_sub34.readUnsignedByte(1587507700);
			anIntArray3059 = new int[i_72_];
			anIntArray3054 = new int[i_72_];
			anIntArray3042 = new int[i_72_];
			aStringArray3061 = new String[i_72_];
			for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
				anIntArray3059[i_73_] = class523_sub34.readUnsignedInt((byte) -83);
				anIntArray3054[i_73_] = class523_sub34.readUnsignedInt((byte) -98);
				anIntArray3042[i_73_] = class523_sub34.readUnsignedInt((byte) -78);
				aStringArray3061[i_73_] = class523_sub34.readString(-1825711319);
			}
		} else if (i == 249) {
			int i_74_ = class523_sub34.readUnsignedByte(-683500788);
			if (aClass14_3063 == null) {
				int i_75_ = Class628.method10313(i_74_, 1766910977);
				aClass14_3063 = new Class14(i_75_);
			}
			for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
				boolean bool = class523_sub34.readUnsignedByte(-1252173809) == 1;
				int i_77_ = class523_sub34.read24BitInt(1065618406);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(-1905504971));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -117));
				aClass14_3063.method738(class523, (long) i_77_);
			}
		}
	}

	public int method5085(int i, int i_78_) {
		if (null == aClass14_3063)
			return i_78_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_3063.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_78_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public boolean method5086(Interface17 interface17) {
		if (Class178_Sub3.method15481(interface17, anInterface12_3056, 526853565) < anInt3062 * 1555822477)
			return false;
		return true;
	}

	public boolean method5087(Interface17 interface17) {
		if (Class178_Sub3.method15481(interface17, anInterface12_3056, 526853565) < anInt3062 * 1555822477)
			return false;
		return true;
	}

	public boolean method5088(Interface17 interface17, int i) {
		if (anIntArray3052 == null || i < 0 || i >= anIntArray3052.length)
			return false;
		if (!((Class280) anInterface12_3056.getDefinition(anIntArray3052[i], (byte) -21)).method5069(interface17, (short) 4231))
			return false;
		return true;
	}

	public boolean method5089(Interface17 interface17, int i) {
		if (anIntArray3052 == null || i < 0 || i >= anIntArray3052.length)
			return false;
		if (!((Class280) anInterface12_3056.getDefinition(anIntArray3052[i], (byte) 70)).method5069(interface17, (short) 27379))
			return false;
		return true;
	}

	public boolean method5090(Interface17 interface17, int i) {
		if (null == anIntArray3055 || i < 0 || i >= anIntArray3055.length)
			return false;
		Class159 class159 = ((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArray3055[i], 2096227033);
		int i_79_ = interface17.method94(class159, 1508846872);
		if (i_79_ < anIntArray3043[i] || i_79_ > anIntArray3057[i])
			return false;
		return true;
	}

	public void method74(byte i) {
		if (aString3060 == null)
			aString3060 = aString3044;
	}

	public boolean method5091(Interface17 interface17, int i) {
		if (null == anIntArray3055 || i < 0 || i >= anIntArray3055.length)
			return false;
		Class159 class159 = ((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArray3055[i], 2045838499);
		int i_80_ = interface17.method94(class159, -188088088);
		if (i_80_ < anIntArray3043[i] || i_80_ > anIntArray3057[i])
			return false;
		return true;
	}

	public boolean method5092(Interface17 interface17, int i) {
		if (null == anIntArray3055 || i < 0 || i >= anIntArray3055.length)
			return false;
		Class159 class159 = ((Interface19) interface17).method110(VarDomainType.PLAYER_CONFIGS, anIntArray3055[i], 1854090550);
		int i_81_ = interface17.method94(class159, 1305700425);
		if (i_81_ < anIntArray3043[i] || i_81_ > anIntArray3057[i])
			return false;
		return true;
	}

	static int method5093(Interface17 interface17, Interface12 interface12) {
		int i = 0;
		for (int i_82_ = 0; i_82_ < interface12.method69(-1268272738); i_82_++) {
			Class280 class280 = (Class280) interface12.getDefinition(i_82_, (byte) -10);
			if (class280.method5069(interface17, (short) 19357))
				i += class280.anInt3050 * -576086769;
		}
		return i;
	}

	static final void method5094(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class39.method1126(class250, class242, class669, 2117805094);
	}

	static final void method5095(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		class250.aString2634 = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
	}
}
