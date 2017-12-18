/* Class523_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub11 extends Class523 {
	public int anInt10418;
	public int anInt10419;
	public int anInt10420;
	public int anInt10421;
	public int anInt10422;
	public int anInt10423;
	public int anInt10424;
	public int anInt10425;
	public int anInt10426;
	public static Class625 aClass625_10427;

	Class523_Sub11(RSBuffer class523_sub34) {
		int i = class523_sub34.readUnsignedInt((byte) -117);
		anInt10426 = (i >>> 28) * -1559912709;
		anInt10419 = 1263619935 * (i >>> 14 & 0x3fff);
		anInt10420 = 1407483059 * (i & 0x3fff);
		anInt10418 = class523_sub34.readUnsignedByte(-36937128) * 1124354615;
		anInt10425 = class523_sub34.readUnsignedByte(10293408) * 1910494553;
		anInt10421 = class523_sub34.readUnsignedByte(1232025162) * 1463022613;
		anInt10424 = class523_sub34.readUnsignedByte(1782018432) * 1552144781;
		anInt10423 = class523_sub34.readUnsignedByte(1561259724) * -1962298035;
		anInt10422 = class523_sub34.readUnsignedByte(291179967) * 1760215603;
	}

	static void method15946(Class178 class178, Class145 class145, InterfaceComponentDefinitions class250, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class239 class239 = (Class239) Class287.aClass53_Sub1_3102.getDefinition(i_3_, (byte) 32);
		if (null != class239 && class239.anIntArray2425 != null && class239.method4314(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 607987316))
			class239 = class239.method4319(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, -800225901);
		if (class239 != null && class239.aBool2413 && class239.method4314(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 1826257955)) {
			if (null != class239.anIntArray2445) {
				int[] is = new int[class239.anIntArray2445.length];
				for (int i_5_ = 0; i_5_ < is.length / 2; i_5_++) {
					int i_6_;
					if (2097396553 * Class562.anInt7564 == 2)
						i_6_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1958252438) * 2607.5945876176133) + client.anInt11094 * 724985463) & 0x3fff;
					else if (2097396553 * Class562.anInt7564 == 6)
						i_6_ = (int) client.aFloat11129 & 0x3fff;
					else
						i_6_ = (client.anInt11094 * 724985463 + (int) client.aFloat11129) & 0x3fff;
					int i_7_ = Class433.anIntArray4880[i_6_];
					int i_8_ = Class433.anIntArray4881[i_6_];
					if (6 != Class562.anInt7564 * 2097396553) {
						i_7_ = i_7_ * 256 / (-1193506389 * client.anInt11068 + 256);
						i_8_ = 256 * i_8_ / (256 + client.anInt11068 * -1193506389);
					}
					is[2 * i_5_] = (365308179 * class250.anInt2581 / 2 + i + ((((class239.anIntArray2445[2 * i_5_] * 4 + i_1_) * i_8_) + i_7_ * (i_2_ + 4 * (class239.anIntArray2445[2 * i_5_ + 1]))) >> 14));
					is[1 + 2 * i_5_] = (class250.anInt2543 * -1759297857 / 2 + i_0_ - (((i_8_ * (4 * class239.anIntArray2445[1 + i_5_ * 2] + i_2_)) - (4 * class239.anIntArray2445[i_5_ * 2] + i_1_) * i_7_) >> 14));
				}
				Class236 class236 = class250.method4440(class178, (byte) -116);
				if (null != class236)
					Class182.method3544(class178, is, -868784361 * class239.anInt2431, class236.anIntArray2391, class236.anIntArray2390);
				if (class239.anInt2432 * -873662967 > 0) {
					for (int i_9_ = 0; i_9_ < is.length / 2 - 1; i_9_++) {
						int i_10_ = is[2 * i_9_];
						int i_11_ = is[i_9_ * 2 + 1];
						int i_12_ = is[2 * (1 + i_9_)];
						int i_13_ = is[1 + (i_9_ + 1) * 2];
						if (i_12_ < i_10_) {
							int i_14_ = i_10_;
							int i_15_ = i_11_;
							i_10_ = i_12_;
							i_11_ = i_13_;
							i_12_ = i_14_;
							i_13_ = i_15_;
						} else if (i_10_ == i_12_ && i_13_ < i_11_) {
							int i_16_ = i_11_;
							i_11_ = i_13_;
							i_13_ = i_16_;
						}
						if (null != class145)
							class178.method3092(i_10_, i_11_, i_12_, i_13_, (class239.anIntArray2439[class239.aByteArray2440[i_9_] & 0xff]), 1, class145, i, i_0_, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, 1803020905 * class239.anInt2434);
						else
							class178.method3107(i_10_, i_11_, i_12_, i_13_, (class239.anIntArray2439[class239.aByteArray2440[i_9_] & 0xff]), 1, class239.anInt2432 * -873662967, 788353041 * class239.anInt2433, 1803020905 * class239.anInt2434);
					}
					int i_17_ = is[is.length - 2];
					int i_18_ = is[is.length - 1];
					int i_19_ = is[0];
					int i_20_ = is[1];
					if (i_19_ < i_17_) {
						int i_21_ = i_17_;
						int i_22_ = i_18_;
						i_17_ = i_19_;
						i_18_ = i_20_;
						i_19_ = i_21_;
						i_20_ = i_22_;
					} else if (i_19_ == i_17_ && i_20_ < i_18_) {
						int i_23_ = i_18_;
						i_18_ = i_20_;
						i_20_ = i_23_;
					}
					if (null != class145)
						class178.method3092(i_17_, i_18_, i_19_, i_20_, (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, class145, i, i_0_, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
					else
						class178.method3107(i_17_, i_18_, i_19_, i_20_, (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, -873662967 * class239.anInt2432, class239.anInt2433 * 788353041, 1803020905 * class239.anInt2434);
				} else if (null != class145) {
					for (int i_24_ = 0; i_24_ < is.length / 2 - 1; i_24_++)
						class178.method3090(is[i_24_ * 2], is[i_24_ * 2 + 1], is[(1 + i_24_) * 2], is[2 * (i_24_ + 1) + 1], (class239.anIntArray2439[(class239.aByteArray2440[i_24_] & 0xff)]), 1, class145, i, i_0_);
					class178.method3090(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1, class145, i, i_0_);
				} else {
					for (int i_25_ = 0; i_25_ < is.length / 2 - 1; i_25_++)
						class178.method3089(is[i_25_ * 2], is[2 * i_25_ + 1], is[2 * (1 + i_25_)], is[1 + (1 + i_25_) * 2], (class239.anIntArray2439[(class239.aByteArray2440[i_25_] & 0xff)]), 1);
					class178.method3089(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[(class239.aByteArray2440[(class239.aByteArray2440.length - 1)]) & 0xff]), 1);
				}
			}
			Class148 class148 = null;
			if (class239.anInt2410 * 924656729 != -1) {
				class148 = class239.method4315(class178, false, 469128081);
				if (class148 != null) {
					int i_26_ = (618060865 * class239.anInt2416 > 0 ? 618060865 * class239.anInt2416 : 69519641 * aClass625_10427.anInt8141);
					Class691.method13961(class250, class145, i, i_0_, i_1_, i_2_, class148, (double) i_26_, class239.aClass275_2411, class239.aClass273_2438, (byte) 0);
				}
			}
			if (class239.aString2441 != null) {
				int i_27_ = 0;
				if (class148 != null)
					i_27_ = class148.method2428();
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
				Class687_Sub11.method16841(class250, class145, i, i_0_, i_1_, i_2_, i_27_, class239.aString2441, class164, class10, 488894273 * class239.anInt2404, 325219286);
			}
		}
	}
}
