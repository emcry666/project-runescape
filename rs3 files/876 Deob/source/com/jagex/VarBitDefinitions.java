/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class VarBitDefinitions implements Interface14 {
	public int anInt3365;
	Class324 aClass324_3366;
	public Class159 aClass159_3367;
	int startBit;
	int endBit;
	String debugName;
	VarDomainType domainType;
	static int[] bitMask = new int[32];
	int baseVar = 1301241891;

	public int method5602(int i, int i_0_, byte i_1_) throws Exception_Sub2 {
		int i_2_ = bitMask[2059141473 * endBit - 1947878489 * startBit];
		if (i_0_ < 0 || i_0_ > i_2_)
			throw new Exception_Sub2((debugName != null ? debugName : Integer.toString(anInt3365 * -637362725)), i_0_, i_2_);
		i_2_ <<= startBit * 1947878489;
		return i & (i_2_ ^ 0xffffffff) | i_0_ << 1947878489 * startBit & i_2_;
	}

	public void readValues(RSBuffer buffer, int i) {
		readValues(buffer, false, 56083604);
	}

	public void method74(byte i) {
		/* empty */
	}

	void decode(RSBuffer buffer, int opcode, boolean bool, int i_3_) {
		Class314 class314 = ((Class314) Class334.method5910(Class687_Sub35.method17035(2144698661), opcode, 175893395));
		switch (-377232697 * class314.id) {
		default:
			break;
		case 8:
			startBit = buffer.readUnsignedByte(1646492947) * -1052195863;
			endBit = buffer.readUnsignedByte(-1357715642) * 1421632161;
			break;
		case 11: {
			int id = buffer.readUnsignedByte(-142952576);
			domainType = ((VarDomainType) Class334.method5910(VarDomainType.getVarDomainTypes((byte) 12), id, 1075857197));
			if (null == domainType)
				throw new IllegalStateException("");
			baseVar = buffer.readBigSmart((byte) -14) * -1301241891;
			if (aClass324_3366 != null) {
				Interface12 interface12 = ((Interface12) aClass324_3366.aMap3453.get(domainType));
				if (null != interface12)
					aClass159_3367 = ((Class159) interface12.getDefinition(1823191157 * baseVar, (byte) 41));
				else if (!bool)
					throw new IllegalStateException("");
			}
			break;
		}
		case 7:
			/* empty */
		}
	}

	public int method5604(int i, int i_5_) {
		int i_6_ = bitMask[endBit * 2059141473 - 1947878489 * startBit];
		return i >> 1947878489 * startBit & i_6_;
	}

	static {
		int i = 2;
		for (int index = 0; index < 32; index++) {
			bitMask[index] = i - 1;
			i += i;
		}
	}

	VarBitDefinitions(int i, Class324 class324) {
		anInt3365 = -1985866157 * i;
		aClass324_3366 = class324;
	}

	public void method78() {
		/* empty */
	}

	public int method5605(int i) {
		int i_8_ = bitMask[endBit * 2059141473 - 1947878489 * startBit];
		return i >> 1947878489 * startBit & i_8_;
	}

	public void method79() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method73() {
		/* empty */
	}

	void readValues(RSBuffer buffer, boolean bool, int i) {
		for (;;) {
			int opcode = buffer.readUnsignedByte(-347751435);
			if (opcode == 0)
				break;
			decode(buffer, opcode, bool, 1437882565);
		}
	}

	static final void method5615(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		Class254.aClass217_2743.sendMusic(class669.anIntArray8557[class669.anInt8558 * 1357652815], class669.anIntArray8557[2 + class669.anInt8558 * 1357652815], (byte) -44);
	}

	public static void method5616(Class523 class523, Class523 class523_19_, int i) {
		if (null != class523.aClass523_7064)
			class523.method8661(607052656);
		class523.aClass523_7064 = class523_19_.aClass523_7064;
		class523.aClass523_7063 = class523_19_;
		class523.aClass523_7064.aClass523_7063 = class523;
		class523.aClass523_7063.aClass523_7064 = class523;
	}

	static final void method5617(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, boolean bool, byte i) {
		int i_20_ = Class666.aClass666_8530.aByte8529;
		int i_21_ = 0;
		if (class647_sub1_sub3_sub1.anInt11954 * 219018885 > client.cycles)
			Class570.method9607(class647_sub1_sub3_sub1, 862022259);
		else if (1492835511 * class647_sub1_sub3_sub1.anInt11932 >= client.cycles)
			Class155.method2545(class647_sub1_sub3_sub1, (byte) -30);
		else {
			Class546.method9067(class647_sub1_sub3_sub1, bool, 611753292);
			i_20_ = -1865933629 * Class306.anInt3350;
			i_21_ = -1822709611 * Class352.anInt3659;
		}
		Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
		if ((int) class437.aFloat4903 < 512 || (int) class437.aFloat4905 < 512 || ((int) class437.aFloat4903 >= (client.aClass505_11019.method8292((byte) 32) - 1) * 512) || ((int) class437.aFloat4905 >= ((client.aClass505_11019.method8235(2104722735) - 1) * 512))) {
			class647_sub1_sub3_sub1.aClass707_11913.method14164(-1, (byte) 12);
			for (int i_22_ = 0; i_22_ < class647_sub1_sub3_sub1.aClass515Array11912.length; i_22_++) {
				class647_sub1_sub3_sub1.aClass515Array11912[i_22_].id = 873938117;
				class647_sub1_sub3_sub1.aClass515Array11912[i_22_].aClass707_7043.method14164(-1, (byte) 12);
			}
			class647_sub1_sub3_sub1.anIntArray11911 = null;
			class647_sub1_sub3_sub1.anInt11954 = 0;
			class647_sub1_sub3_sub1.anInt11932 = 0;
			i_20_ = Class666.aClass666_8530.aByte8529;
			i_21_ = 0;
			class647_sub1_sub3_sub1.method10574((float) (class647_sub1_sub3_sub1.screenX[0] * 512 + (class647_sub1_sub3_sub1.method18338(2143681971) * 256)), class437.aFloat4904, (float) (512 * class647_sub1_sub3_sub1.screenY[0] + (class647_sub1_sub3_sub1.method18338(2145777810) * 256)));
			class647_sub1_sub3_sub1.method18343(-568396772);
		}
		if ((Class241.player == class647_sub1_sub3_sub1) && ((int) class437.aFloat4903 < 6144 || (int) class437.aFloat4905 < 6144 || ((int) class437.aFloat4903 >= ((client.aClass505_11019.method8292((byte) 30) - 12) * 512)) || ((int) class437.aFloat4905 >= ((client.aClass505_11019.method8235(2139513173) - 12) * 512)))) {
			class647_sub1_sub3_sub1.aClass707_11913.method14164(-1, (byte) 12);
			for (int i_23_ = 0; i_23_ < class647_sub1_sub3_sub1.aClass515Array11912.length; i_23_++) {
				class647_sub1_sub3_sub1.aClass515Array11912[i_23_].id = 873938117;
				class647_sub1_sub3_sub1.aClass515Array11912[i_23_].aClass707_7043.method14164(-1, (byte) 12);
			}
			class647_sub1_sub3_sub1.anIntArray11911 = null;
			class647_sub1_sub3_sub1.anInt11954 = 0;
			class647_sub1_sub3_sub1.anInt11932 = 0;
			i_20_ = Class666.aClass666_8530.aByte8529;
			i_21_ = 0;
			class647_sub1_sub3_sub1.method10574((float) (class647_sub1_sub3_sub1.screenX[0] * 512 + (class647_sub1_sub3_sub1.method18338(2145154403) * 256)), class437.aFloat4904, (float) (class647_sub1_sub3_sub1.screenY[0] * 512 + (class647_sub1_sub3_sub1.method18338(2144892552) * 256)));
			class647_sub1_sub3_sub1.method18343(-1656418918);
		}
		int i_24_ = Class13.method731(class647_sub1_sub3_sub1, -1030538752);
		Class189.method3600(class647_sub1_sub3_sub1, -2136399949);
		Class666.method13665(class647_sub1_sub3_sub1, i_20_, i_21_, i_24_, (byte) -95);
		Class185.method3583(class647_sub1_sub3_sub1, i_20_, -2015468525);
		Class159_Sub1.method14333(class647_sub1_sub3_sub1, 505383896);
		Class440 class440 = Class440.method7063();
		class440.method7018(Class433.method6799(class647_sub1_sub3_sub1.aClass72_11938.method1494((byte) 4)), Class433.method6799(class647_sub1_sub3_sub1.aClass72_11886.method1494((byte) 113)), Class433.method6799(class647_sub1_sub3_sub1.aClass72_11939.method1494((byte) 73)));
		class647_sub1_sub3_sub1.method10598(class440);
		class440.method7011();
	}

	static void method5618(Class523_Sub3 class523_sub3, int i, int i_25_, int i_26_, int i_27_, int i_28_) {
		if (2086711745 * class523_sub3.anInt10388 != -1 || null != class523_sub3.anIntArray10393) {
			int i_29_ = class523_sub3.anInt10376 * -815661653;
			if (class523_sub3.anInt10363 * 1137448789 == 0 || Class449.aClass523_Sub33_4946.aClass687_Sub22_10650.method16930(635401321) == 0 || i != class523_sub3.anInt10369 * -398455767) {
				if (null != class523_sub3.aClass489_10389) {
					class523_sub3.aClass489_10389.method7960(100, (byte) 127);
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
			} else {
				if (class523_sub3.aClass489_10389 != null && ((class523_sub3.aClass489_10389.method8004((short) 3661) == Class488.aClass488_5493) || (class523_sub3.aClass489_10389.method8004((short) 21055) == Class488.aClass488_5495))) {
					Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
					class523_sub3.aClass489_10389 = null;
				}
				if (null == class523_sub3.aClass489_10389) {
					if (2086711745 * class523_sub3.anInt10388 >= 0) {
						int i_30_ = 256;
						int i_31_ = (int) ((0.5F * (float) ((class523_sub3.anInt10370 * -2040961951) - -838245371 * (class523_sub3.anInt10378))) + (float) (-838245371 * class523_sub3.anInt10378));
						int i_32_ = (int) (((float) ((class523_sub3.anInt10371 * 552943717) - (-2105988339 * class523_sub3.anInt10373)) * 0.5F) + (float) (class523_sub3.anInt10373 * -2105988339));
						class523_sub3.aClass437_10372.aFloat4903 = (float) i_31_;
						class523_sub3.aClass437_10372.aFloat4905 = (float) i_32_;
						class523_sub3.aClass489_10389 = (Class254.aClass217_2743.method3877(Class189.aClass189_2147, class523_sub3, class523_sub3.anInt10388 * 2086711745, -1, 0, Class198.aClass198_2202.method3672((byte) 40), Class186.aClass186_2130, (float) (1089756969 * class523_sub3.anInt10374), (float) (1137448789 * class523_sub3.anInt10363), class523_sub3.aClass437_10372, 0, i_30_, false, (short) -27193));
						if (null != class523_sub3.aClass489_10389) {
							float f = (float) i_29_ / 255.0F;
							class523_sub3.aClass489_10389.method7983(f, 150, -80868994);
							class523_sub3.aClass489_10389.method8032(1274786787);
						}
					}
				} else {
					int i_33_ = (int) (0.5F * (float) ((-2040961951 * class523_sub3.anInt10370) - -838245371 * (class523_sub3.anInt10378)) + (float) (-838245371 * class523_sub3.anInt10378));
					int i_34_ = (int) ((float) (class523_sub3.anInt10373 * -2105988339) + ((float) ((552943717 * class523_sub3.anInt10371) - (-2105988339 * class523_sub3.anInt10373)) * 0.5F));
					class523_sub3.aClass437_10372.aFloat4903 = (float) i_33_;
					class523_sub3.aClass437_10372.aFloat4905 = (float) i_34_;
				}
				if (null == class523_sub3.aClass489_10379) {
					if (null != class523_sub3.anIntArray10393 && ((class523_sub3.anInt10375 -= i_27_ * 844658403) * 993165003) <= 0) {
						int i_35_ = ((256 == class523_sub3.anInt10387 * -1836666987 && (-1438347965 * class523_sub3.anInt10386 == 256)) ? 256 : ((int) (Math.random() * (double) ((-1836666987 * (class523_sub3.anInt10387)) - (-1438347965 * (class523_sub3.anInt10386)))) + -1438347965 * class523_sub3.anInt10386));
						int i_36_ = (int) (Math.random() * (double) (class523_sub3.anIntArray10393).length);
						int i_37_ = (int) ((0.5F * (float) ((-2040961951 * class523_sub3.anInt10370) - (class523_sub3.anInt10378 * -838245371))) + (float) (class523_sub3.anInt10378 * -838245371));
						int i_38_ = (int) ((float) ((class523_sub3.anInt10371 * 552943717) - (class523_sub3.anInt10373 * -2105988339)) * 0.5F + (float) (class523_sub3.anInt10373 * -2105988339));
						class523_sub3.aClass437_10394.aFloat4903 = (float) i_37_;
						class523_sub3.aClass437_10394.aFloat4905 = (float) i_38_;
						class523_sub3.aClass489_10379 = (Class254.aClass217_2743.method3877(Class189.aClass189_2137, class523_sub3, class523_sub3.anIntArray10393[i_36_], 0, i_29_, Class198.aClass198_2201.method3672((byte) 102), Class186.aClass186_2130, (float) (class523_sub3.anInt10374 * 1089756969), (float) (1089756969 * class523_sub3.anInt10374 + (class523_sub3.anInt10363 * 1137448789)), class523_sub3.aClass437_10394, 0, i_35_, false, (short) -13605));
						if (class523_sub3.aClass489_10379 != null)
							class523_sub3.aClass489_10379.method8032(1919619314);
						class523_sub3.anInt10375 = ((class523_sub3.anInt10391 * 2120106959 + (int) (Math.random() * (double) (354055303 * (class523_sub3.anInt10392) - ((class523_sub3.anInt10391) * 2120106959)))) * 844658403);
					}
				} else {
					int i_39_ = (int) ((float) ((-2040961951 * class523_sub3.anInt10370) - -838245371 * (class523_sub3.anInt10378)) * 0.5F + (float) (class523_sub3.anInt10378 * -838245371));
					int i_40_ = (int) ((float) (class523_sub3.anInt10373 * -2105988339) + (float) ((552943717 * class523_sub3.anInt10371) - (class523_sub3.anInt10373 * -2105988339)) * 0.5F);
					class523_sub3.aClass437_10394.aFloat4903 = (float) i_39_;
					class523_sub3.aClass437_10394.aFloat4905 = (float) i_40_;
					if ((class523_sub3.aClass489_10379.method8004((short) 13388) == Class488.aClass488_5493) || (class523_sub3.aClass489_10379.method8004((short) 23442) == Class488.aClass488_5495)) {
						Class254.aClass217_2743.method3864((class523_sub3.aClass489_10379), (byte) 24);
						class523_sub3.aClass489_10379 = null;
					}
				}
			}
		}
	}

	static final void method5619(Class669 class669, int i) {
		int i_41_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_41_, (byte) -19)).anInt109) * 1702403069;
	}
}
