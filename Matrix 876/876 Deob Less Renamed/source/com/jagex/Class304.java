/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;

public class Class304 {
	public short[] aShortArray3344;
	public int[] anIntArray3345;

	public Class304(NPCDefinition class300) {
		anIntArray3345 = new int[8];
		aShortArray3344 = new short[8];
		int i = 0;
		if (class300.anIntArray3282 != null && null != class300.aShortArray3283) {
			i = class300.anIntArray3282.length;
			System.arraycopy(class300.anIntArray3282, 0, anIntArray3345, 0, i);
			System.arraycopy(class300.aShortArray3283, 0, aShortArray3344, 0, i);
		}
		for (int i_0_ = i; i_0_ < 8; i_0_++) {
			anIntArray3345[i_0_] = -1;
			aShortArray3344[i_0_] = (short) -1;
		}
	}

	public Class304(int[] is, short[] is_1_) {
		anIntArray3345 = is;
		aShortArray3344 = is_1_;
	}

	static final void method5539(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class269.method4920(class250, class242, class669, (byte) 1);
	}

	static final void method5540(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool11160 && !client.aBool11161 ? 1 : 0;
	}

	public static Class561 method5541(Component component, boolean bool, int i) {
		return new Class561_Sub1(component, bool);
	}

	static void method5542(boolean bool, int i) {
		if (bool) {
			if (client.anInt11186 * -1614846429 != -1)
				Class375_Sub2.method15718(client.anInt11186 * -1614846429, -2004055680);
			for (Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255)); class523_sub36 != null; class523_sub36 = (Class523_Sub36) client.aClass14_11187.method749(923215551)) {
				if (!class523_sub36.method8660(2073254563)) {
					class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255));
					if (null == class523_sub36)
						break;
				}
				Class579.method9657(class523_sub36, true, false, -1682835132);
			}
			client.anInt11186 = 1924171381;
			client.aClass14_11187 = new Class14(8);
			Class110.method1923((byte) 1);
			client.anInt11186 = -306731599 * Class523_Sub11.aClass625_10427.anInt8144;
			if (-1 != client.anInt11186 * -1614846429) {
				Class284.method5142(false, (byte) -44);
				Class676_Sub1.method16781(-1240802613);
				Class591.method9777(client.anInt11186 * -1614846429, null, 1727201484);
			}
		}
		Class43.aBool618 = true;
	}

	public static Class242 method5543(int i, byte i_2_) {
		return Class31.aClass242Array302[i >> 16];
	}

	public static void method5544(short[] is, byte i) {
		for (int i_3_ = 0; i_3_ < is.length; i_3_++)
			is[i_3_] = (short) 1024;
	}

	public static void method5545(Class64 class64, byte i) {
		Class95.method1767(new Class579(class64), 2086843232);
	}

	static int method5546(int i) {
		if (Class449.aClass523_Sub33_4946.aClass687_Sub23_10608.method16934(-605637750) == 0) {
			for (int i_4_ = 0; i_4_ < client.anInt11030 * -1614747943; i_4_++) {
				if ((client.anInterface64Array11031[i_4_].method425((byte) -2) == 's') || client.anInterface64Array11031[i_4_].method425((byte) -59) == 'S') {
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 1, -1036541731);
					client.aBool10992 = true;
					method5545(Class64.aClass64_777, (byte) -58);
					break;
				}
			}
		}
		if (Class308.aClass290_3356 == Class290.aClass290_3128) {
			if (null == Class90.aClass424_890)
				Class90.aClass424_890 = new Class424(Class572.aClass458_7684, Class46.aClass452_673, Class54.aClass456_733, RSA.RSA_UPDATE_EXPONENT, RSA.RSA_UPDATE_MODULUS);
			if (!Class90.aClass424_890.method6720(232737714))
				return 0;
			Class242.method4372(0, null, true, (byte) 0);
			Class308.aBool3363 = !Class628.method10316(-1024884904);
			Class399.aClass472_4066 = Class591.method9781((Class308.aBool3363 ? Archive.aClass44_650 : Archive.aClass44_648), false, 1, true, true, (short) -22057);
			Class112.aClass472_1352 = Class591.method9781(Archive.aClass44_649, false, 1, true, true, (short) 11349);
			Class272.aClass472_2886 = Class591.method9781(Archive.aClass44_647, false, 1, true, true, (short) -16295);
			Class112.aClass472_1350 = Class591.method9781(Archive.aClass44_639, true, 1, true, true, (short) 2468);
		}
		if (Class308.aClass290_3356 == Class290.aClass290_3122) {
			boolean bool = Class112.aClass472_1352.method7652((byte) 10);
			boolean bool_5_ = Class112.aClass472_1350.method7652((byte) 10);
			int i_6_ = GraphicsDefinitions.aClass467_Sub1Array8605[Archive.aClass44_649.method1223(-58107190)].method15732(-1816675795);
			i_6_ = i_6_ + GraphicsDefinitions.aClass467_Sub1Array8605[(Class308.aBool3363 ? Archive.aClass44_650.method1223(-1611621704) : Archive.aClass44_648.method1223(1687427760))].method15732(-601096091);
			i_6_ += GraphicsDefinitions.aClass467_Sub1Array8605[Archive.aClass44_647.method1223(-1047966305)].method15732(389898765);
			i_6_ = i_6_ + (bool_5_ ? 100 : Class112.aClass472_1350.method7654(894936055));
			i_6_ = i_6_ + (bool ? 100 : Class112.aClass472_1352.method7654(894936055));
			if (500 != i_6_)
				return i_6_ / 5;
			Class523_Sub11.aClass625_10427 = new Class625(Class112.aClass472_1350);
			Class689.method13952(Class523_Sub11.aClass625_10427, (byte) 24);
			int i_7_ = Class449.aClass523_Sub33_4946.aClass687_Sub26_10611.method16952((byte) -83);
			Class308.aClass82_3358 = new Class82(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class112.aClass472_1352);
			Class93[] class93s = Class308.aClass82_3358.method1572(i_7_, 1993857008);
			if (class93s.length == 0)
				class93s = Class308.aClass82_3358.method1572(0, 1993857008);
			Class321 class321 = new Class321(Class399.aClass472_4066, Class272.aClass472_2886);
			if (class93s.length > 0) {
				Class308.anInterface32Array3355 = new Interface32[class93s.length];
				for (int i_8_ = 0; i_8_ < Class308.anInterface32Array3355.length; i_8_++)
					Class308.anInterface32Array3355[i_8_] = new Class301((Class308.aClass82_3358.method1571(-792793271 * class93s[i_8_].anInt897, -32766681)), -1424047077 * class93s[i_8_].anInt898, class93s[i_8_].anInt899 * -582244819, class321);
			}
		}
		if (Class290.aClass290_3121 == Class308.aClass290_3356)
			Class491.aClass423_5536 = new Class423(Class31.aClass178_303, Class399.aClass472_4066, Class272.aClass472_2886, Class33.method922((byte) -56));
		if (Class308.aClass290_3356 == Class290.aClass290_3124) {
			int i_9_ = Class491.aClass423_5536.method6713((byte) -1);
			int i_10_ = Class491.aClass423_5536.method6690(-1261504137);
			if (i_9_ < i_10_)
				return i_9_ * 100 / i_10_;
		}
		if (Class308.aClass290_3356 == Class290.aClass290_3125) {
			if (null != Class308.anInterface32Array3355 && Class308.anInterface32Array3355.length > 0) {
				if (Class308.anInterface32Array3355[0].method192(-1202118128) < 100)
					return 0;
				if (Class308.anInterface32Array3355.length > 1 && Class308.aClass82_3358.method1573((byte) 58) && Class308.anInterface32Array3355[1].method192(-188720373) < 100)
					return 0;
			}
			Class491.aClass423_5536.method6685(client.anInterface50_11044, 1446559342);
			Class2.method513(Class31.aClass178_303, 2135688005);
			Class657.method10791(15, (byte) -14);
		}
		if (Class290.aClass290_3144 == Class308.aClass290_3356) {
			Class523_Sub8.aClass472_10406 = Class591.method9781(Archive.aClass44_627, false, 1, false, true, (short) -10946);
			Class297.aClass472_3193 = Class591.method9781(Archive.aClass44_630, false, 1, false, true, (short) -1549);
			Class487.aClass472_5488 = Class591.method9781(Archive.aClass44_653, false, 1, false, true, (short) 910);
			Class217.aClass472_2302 = Class591.method9781(Archive.aClass44_623, false, 1, true, true, (short) -420);
			Class700.aClass472_8779 = Class591.method9781(Archive.aClass44_661, false, 1, true, true, (short) 14691);
			Class55.aClass472_737 = Class591.method9781(Archive.aClass44_624, false, 1, true, true, (short) 2600);
			Class311_Sub1.aClass472_9998 = Class591.method9781(Archive.aClass44_625, true, 1, false, true, (short) 2991);
			Class413.aClass472_4583 = Class591.method9781(Archive.aClass44_626, false, 1, false, true, (short) 1307);
			Class216.aClass472_2271 = Class591.method9781(Archive.aClass44_656, true, 1, false, true, (short) -13224);
			Class142.aClass472_1685 = Class591.method9781(Archive.aClass44_621, true, 1, false, true, (short) 1414);
			Class502.aClass472_5590 = Class591.method9781(Archive.aClass44_628, false, 1, false, true, (short) -3392);
			Class515.aClass472_7045 = Class591.method9781(Archive.aClass44_655, false, 1, true, true, (short) 1452);
			Class328.aClass472_3473 = Class591.method9781(Archive.SOUND_EFFECTS_INDEX, true, 1, false, false, (short) -13746);
			Class616.aClass472_8039 = Class591.method9781(Archive.MUSIC_INDEX, true, 1, false, false, (short) 16317);
			Class195.aClass472_2191 = Class591.method9781(Archive.aClass44_632, false, 1, true, true, (short) -4887);
			Class555.aClass472_7477 = Class591.method9781(Archive.aClass44_633, false, 1, true, true, (short) -14258);
			Class598.aClass472_7841 = Class591.method9781(Archive.aClass44_634, false, 1, true, true, (short) 8255);
			Class386.aClass472_4007 = Class591.method9781(Archive.aClass44_645, false, 1, true, true, (short) 10494);
			Class23.aClass472_235 = Class591.method9781(Archive.aClass44_636, false, 1, true, true, (short) 7663);
			Class418.aClass472_4698 = Class591.method9781(Archive.aClass44_637, false, 1, true, true, (short) -4707);
			Class312_Sub2_Sub1.aClass472_11592 = Class591.method9781(Archive.aClass44_640, false, 1, true, true, (short) 4259);
			Class511.aClass472_5761 = Class591.method9781(Archive.aClass44_622, true, 1, false, false, (short) -22993);
			Class90.aClass472_891 = Class591.method9781(Archive.aClass44_638, true, 1, false, true, (short) 9406);
			Class321.aClass472_3439 = Class591.method9781(Archive.aClass44_641, false, 1, true, true, (short) 14548);
			Class229.aClass472_2363 = Class591.method9781(Archive.aClass44_644, false, 1, true, true, (short) 589);
			Class518.aClass472_7057 = Class591.method9781(Archive.aClass44_642, true, 1, true, true, (short) -1794);
			Class534_Sub1.aClass472_10801 = Class591.method9781(Archive.aClass44_643, false, 1, true, true, (short) 326);
			Class673.aClass472_8612 = Class591.method9781(Archive.aClass44_657, false, 1, true, true, (short) -8767);
			Class291.aClass472_3154 = Class591.method9781(Archive.aClass44_651, true, 1, false, true, (short) 6668);
			Class482.aClass472_5475 = Class591.method9781(Archive.aClass44_665, true, 1, false, true, (short) 31213);
			Class519.aClass472_7058 = Class591.method9781(Archive.aClass44_666, true, 1, true, true, (short) 14804);
		}
		if (Class290.aClass290_3135 == Class308.aClass290_3356) {
			int i_11_ = 0;
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < GraphicsDefinitions.aClass467_Sub1Array8605.length; i_13_++) {
				if (GraphicsDefinitions.aClass467_Sub1Array8605[i_13_] != null) {
					i_11_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_13_].method15732(1912267905);
					i_12_++;
				}
			}
			if (i_12_ > 0)
				i_11_ /= i_12_;
			if (100 != i_11_) {
				if (Class308.anInt3362 * 1936976497 < 0)
					Class308.anInt3362 = 681219729 * i_11_;
				return (100 * (i_11_ - 1936976497 * Class308.anInt3362) / (100 - 1936976497 * Class308.anInt3362));
			}
			Class687_Sub35.method17034(Class523_Sub11.aClass625_10427, (short) -12318);
			Class491.aClass423_5536 = new Class423(Class31.aClass178_303, Class523_Sub8.aClass472_10406, Class272.aClass472_2886, Class33.method922((byte) -117));
		}
		if (Class290.aClass290_3126 == Class308.aClass290_3356) {
			byte[] is = Class112.aClass472_1350.method7721((1325648699 * (Class620.aClass620_8071.anInt8073)), -387132909);
			if (null == is)
				return 0;
			Class254.aClass217_2743 = new Class217();
			Class254.aClass217_2743.method3857(50, 7340032, 180042560);
			Class225.method4154(is, 1245931060);
			Class657.method10791(12, (byte) -86);
		}
		if (Class290.aClass290_3129 == Class308.aClass290_3356 && null == Class194_Sub19.aClass532_9953) {
			Class194_Sub19.aClass532_9953 = new Class532(Class482.aClass472_5475);
			Class241.method4358(Class194_Sub19.aClass532_9953, (byte) -121);
		}
		if (Class290.aClass290_3130 == Class308.aClass290_3356) {
			int i_14_ = Class341.method5987(-758800601);
			if (i_14_ < 100)
				return i_14_;
			AnimationDefinitions.method3730((Class112.aClass472_1350.method7721((1325648699 * Class620.aClass620_8072.anInt8073), -387132909)), -800911491);
			Class150.aShortArrayArray1725 = Class523_Sub11.aClass625_10427.aShortArrayArray8149;
			Class207.aShortArrayArrayArray2248 = Class523_Sub11.aClass625_10427.aShortArrayArrayArray8150;
			Class546.aShortArrayArray7302 = Class523_Sub11.aClass625_10427.aShortArrayArray8134;
			Class21.aShortArrayArrayArray214 = Class523_Sub11.aClass625_10427.aShortArrayArrayArray8175;
			if (-2050915945 * Class523_Sub11.aClass625_10427.anInt8157 != -1 && (Class523_Sub11.aClass625_10427.anInt8132 * 527948529 != -1)) {
				client.anInt11036 = Class523_Sub11.aClass625_10427.anInt8157 * 1062390381;
				client.anInt11151 = Class523_Sub11.aClass625_10427.anInt8132 * -917508501;
			}
			Class655.aClass630_8423 = new BodyDefinitions(Class112.aClass472_1350);
			Class551.aClass600_7467 = new Class600(Class112.aClass472_1350);
			Class61.aClass633_769 = new Class633(Class112.aClass472_1350);
			Class200.aClass613_2205 = new Class613(Class112.aClass472_1350);
			Class534.aClass624_7158 = new Class624(Class112.aClass472_1350);
		}
		if (Class308.aClass290_3356 == Class290.aClass290_3132) {
			if (-1 != 2097573757 * Class523_Sub11.aClass625_10427.anInt8169 && !Class413.aClass472_4583.method7663(((Class523_Sub11.aClass625_10427.anInt8169) * 2097573757), 0, 1089230115))
				return 99;
			Class174_Sub1.aClass172_9785 = new Class172(Class518.aClass472_7057);
			Class333.anInterface25_3512 = new Class174_Sub1(Class216.aClass472_2271, Class142.aClass472_1685);
			Class60.aClass53_Sub22_766 = new Class53_Sub22(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class80.aClass53_Sub17_866 = new Class53_Sub17(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			BodyDefinitions.aClass53_Sub15_8238 = new Class53_Sub15(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class523_Sub8.aClass472_10406);
			Class546.aClass53_7303 = new Class53(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class656.aClass656_8426, 64, new Class68(com.jagex.Class17.class));
			Class647_Sub1_Sub1_Sub2.aClass53_12014 = new Class53(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class656.aClass656_8449, 16, new Class68(com.jagex.Class84.class));
			Class394.aClass53_Sub16_4056 = new Class53_Sub16(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class555.aClass472_7477);
			Class624.aClass53_Sub12_8131 = new Class53_Sub12(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class519.aClass53_Sub5_7059 = new Class53_Sub5(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class295.aClass53_Sub2_3176 = new Class53_Sub2(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class523_Sub8.aClass472_10406);
			Class253.aClass53_Sub4_2740 = new Class53_Sub4(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class523_Sub8.aClass472_10406);
			Class448.aClass53_Sub6_4945 = new Class53_Sub6(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class413.aClass472_4583);
			Class115.aClass53_Sub20_1412 = new Class53_Sub20(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			ItemDefinitions.aClass53_Sub21_172 = new Class53_Sub21(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class214.aClass53_Sub18_2268 = new Class53_Sub18(client.aClass681_11284, Class53_Sub20.aClass668_10979, true, Class195.aClass472_2191, Class413.aClass472_4583);
			client.aClass505_11019.method8250(Class214.aClass53_Sub18_2268, -1576263945);
			Class329_Sub2.aClass511_10050.method8537(new Class53_Sub18(client.aClass681_11284, Class53_Sub20.aClass668_10979, true, Class195.aClass472_2191, Class413.aClass472_4583), (byte) -11);
			Class287.aClass53_Sub1_3102 = new Class53_Sub1(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class523_Sub8.aClass472_10406);
			Class334.aClass53_Sub14_3544 = new Class53_Sub14(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class523_Sub8.aClass472_10406);
			Class174.aClass53_Sub7_1856 = new Class53_Sub7(client.aClass681_11284, Class53_Sub20.aClass668_10979, true, Class598.aClass472_7841, Class413.aClass472_4583);
			Class523_Sub37.aClass53_Sub8_10677 = new Class53_Sub8(client.aClass681_11284, Class53_Sub20.aClass668_10979, true, Class60.aClass53_Sub22_766, Class386.aClass472_4007, Class413.aClass472_4583);
			Class655.aClass58_Sub1_8422 = new Class58_Sub1(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, true);
			Class447.aClass53_Sub9_4937 = new Class53_Sub9(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class248.aClass53_Sub13_2492 = new Class53_Sub13(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class23.aClass472_235, Class297.aClass472_3193, Class487.aClass472_5488, Class447.aClass53_Sub9_4937);
			Class380.aClass53_Sub11_3937 = new Class53_Sub11(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class326_Sub2.aClass53_Sub10_10063 = new Class53_Sub10(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class412.aClass53_Sub19_4556 = new Class53_Sub19(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class418.aClass472_4698, Class413.aClass472_4583);
			Class469.aClass58_Sub2_5344 = new Class58_Sub2(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class312_Sub2_Sub1.aClass472_11592, true);
			Class114.aClass98_Sub1_Sub2_1405 = new Class98_Sub1_Sub2(client.aClass681_11284, Class470.aClass470_5351, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class669.aClass98_Sub1_Sub1_8582 = new Class98_Sub1_Sub1(client.aClass681_11284, Class470.aClass470_5354, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class265.aClass98_Sub1_Sub2_2858 = new Class98_Sub1_Sub2(client.aClass681_11284, Class470.aClass470_5346, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class663.aClass98_Sub1_Sub2_8525 = new Class98_Sub1_Sub2(client.aClass681_11284, Class470.aClass470_5348, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class159.aClass98_Sub1_Sub2_1759 = new Class98_Sub1_Sub2(client.aClass681_11284, Class470.aClass470_5352, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class531.aClass98_Sub1_Sub2_7125 = new Class98_Sub1_Sub2(client.aClass681_11284, Class470.aClass470_5345, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class602.aClass98_Sub1_Sub2_7933 = new Class98_Sub1_Sub2(client.aClass681_11284, Class470.aClass470_5350, Class53_Sub20.aClass668_10979, Class217.aClass472_2302);
			Class388_Sub1.aMap10261 = Class600.method9882((new Class98_Sub1[] { Class114.aClass98_Sub1_Sub2_1405, Class669.aClass98_Sub1_Sub1_8582, Class265.aClass98_Sub1_Sub2_2858, Class663.aClass98_Sub1_Sub2_8525, Class159.aClass98_Sub1_Sub2_1759, Class531.aClass98_Sub1_Sub2_7125, Class602.aClass98_Sub1_Sub2_7933 }), 2025734103);
			Class539.aClass53_Sub3_7213 = new Class53_Sub3(client.aClass681_11284, Class53_Sub20.aClass668_10979, Class217.aClass472_2302, Class388_Sub1.aMap10261);
			Class570.anInterface19_7657 = new Class305();
			Class381.method6410(Class55.aClass472_737, Class413.aClass472_4583, Class523_Sub8.aClass472_10406, Class272.aClass472_2886, -1761291929);
			Class590.aClass390_7803 = new Class390(Class673.aClass472_8612);
			Class6.aClass397_48 = new Class397(Class534_Sub1.aClass472_10801);
			Class295.aClass399_3177 = new Class399(Class534_Sub1.aClass472_10801);
			Class380.aClass473_3938 = new Class473(Class53_Sub20.aClass668_10979, Class321.aClass472_3439, Class229.aClass472_2363);
			Class645.aClass24_8347 = new Class24(Class53_Sub20.aClass668_10979, Class321.aClass472_3439, Class229.aClass472_2363, new Class396());
			Class98_Sub1_Sub2.playerVarsProvider = new Class112(Class669.aClass98_Sub1_Sub1_8582, Class539.aClass53_Sub3_7213, Class551.aClass600_7467.method9865(-430376018));
			Class165.method2655((byte) 91);
			Class207.method3748(Class248.aClass53_Sub13_2492, -1164316803);
			Class540.method8980(Class295.aClass399_3177, Class6.aClass397_48, (byte) 15);
			Class285.method5143(Class413.aClass472_4583, Class174_Sub1.aClass172_9785, Class333.anInterface25_3512, -1372333303);
			Class262 class262 = new Class262(Class502.aClass472_5590.method7667("huffman", "", -1414462757));
			Class529.method8770(class262, -360111831);
			Class506.aClass503_5666 = Class628.method10315(-1883763781);
			Class218.aClass523_Sub41_2319 = new Class523_Sub41(true);
		}
		if (Class290.aClass290_3143 == Class308.aClass290_3356) {
			int i_15_ = (Class39.method1129(Class523_Sub8.aClass472_10406, 995602139) + Class491.aClass423_5536.method6707(true, 1272922794));
			int i_16_ = (Class11.method650(-1010980893) + Class491.aClass423_5536.method6690(-87639804));
			if (i_15_ < i_16_)
				return 100 * i_15_ / i_16_;
		}
		if (Class290.aClass290_3131 == Class308.aClass290_3356)
			Class534.method8807(Class511.aClass472_5761, Class90.aClass472_891, Class624.aClass53_Sub12_8131, Class519.aClass53_Sub5_7059, client.aClass505_11019.method8244(1008198576), Class287.aClass53_Sub1_3102, Class334.aClass53_Sub14_3544, Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider);
		if (Class308.aClass290_3356 == Class290.aClass290_3134) {
			Class423.clientConfigsDomain = new Class149_Sub1(Class114.aClass98_Sub1_Sub2_1405);
			Class62.method1423((byte) 11);
			Class220.aClass57_2331 = Class36.method1081(1390668603);
			Class311_Sub1.aClass472_9998.method7649(false, true, 1433776417);
			Class523_Sub8.aClass472_10406.method7649(true, true, 1433776417);
			Class272.aClass472_2886.method7649(true, true, 1433776417);
			Class502.aClass472_5590.method7649(true, true, 1433776417);
			client.aBool11233 = true;
		}
		if (Class290.aClass290_3133 == Class308.aClass290_3356 && -1 != 1786741825 * Class523_Sub11.aClass625_10427.anInt8143) {
			if (!Class69.method1464(1786741825 * (Class523_Sub11.aClass625_10427.anInt8143), null, -531773554))
				return 0;
			boolean bool = true;
			for (int i_17_ = 0; (i_17_ < (Class31.aClass242Array302[Class523_Sub11.aClass625_10427.anInt8143 * 1786741825].aClass250Array2457).length); i_17_++) {
				Class250 class250 = (Class31.aClass242Array302[Class523_Sub11.aClass625_10427.anInt8143 * 1786741825].aClass250Array2457[i_17_]);
				if (5 == class250.anInt2534 * 36473529 && -1 != class250.anInt2561 * 345997065 && !Class523_Sub8.aClass472_10406.method7663(((class250.anInt2561) * 345997065), 0, 1089230115))
					bool = false;
			}
			if (!bool)
				return 0;
		}
		if (Class308.aClass290_3356 == Class290.aClass290_3136)
			Class700.method14080(true, (byte) 18);
		if (Class290.aClass290_3137 == Class308.aClass290_3356) {
			Class661.aClass289_8509.method5183(-800911491);
			try {
				Class308.aThread3357.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			Class661.aClass289_8509 = null;
			Class308.aThread3357 = null;
			Class399.aClass472_4066 = null;
			Class112.aClass472_1352 = null;
			Class308.aClass82_3358 = null;
			Class308.anInterface32Array3355 = null;
			Class488.aMap5500.remove(Archive.aClass44_649);
			Class488.aMap5500.remove(Archive.aClass44_648);
			Class488.aMap5500.remove(Archive.aClass44_650);
			Class158.method2554(1182235962);
			client.aBool10991 = Class449.aClass523_Sub33_4946.aClass687_Sub23_10608.method16934(-605637750) == 1;
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub23_10608), 1, 222744251);
			if (client.aBool10991)
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub1_10629, 0, -605260928);
			else if ((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.aBool10816) && (-1222917157 * Class218.aClass523_Sub41_2319.anInt10758 < 512) && (Class218.aClass523_Sub41_2319.anInt10758 * -1222917157 != 0))
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub1_10629, 0, 789502073);
			Class211.method3824(1209393736);
			if (client.aBool10991) {
				Class535.method8921(0, false, (byte) -34);
				if (!client.aBool10992)
					method5545(Class64.aClass64_783, (byte) -74);
			} else {
				Class535.method8921(Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16678((byte) 31), false, (byte) -42);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16678((byte) -54) == 0)
					method5545(Class64.aClass64_785, (byte) -94);
			}
			Class82.method1585(Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(-317922129), -1, -1, false, -1011984276);
			Class491.aClass423_5536.method6685(client.anInterface50_11044, 212447466);
			Class2.method513(Class31.aClass178_303, 2132389739);
			Class308.method5599(Class31.aClass178_303, Class523_Sub8.aClass472_10406, -212162263);
		}
		return Class57.method1384(16057912);
	}

	static float method5547(float f, float f_18_, float f_19_, float f_20_, float f_21_, float f_22_, int i, int i_23_) {
		float f_24_ = 0.0F;
		float f_25_ = f_20_ - f;
		float f_26_ = f_21_ - f_18_;
		float f_27_ = f_22_ - f_19_;
		float f_28_ = 0.0F;
		float f_29_ = 0.0F;
		float f_30_ = 0.0F;
		Class560 class560 = client.aClass505_11019.method8241((byte) -31);
		for (/**/; f_24_ < 1.1F; f_24_ += 0.1F) {
			float f_31_ = f + f_24_ * f_25_;
			float f_32_ = f_26_ * f_24_ + f_18_;
			float f_33_ = f_24_ * f_27_ + f_19_;
			int i_34_ = (int) f_31_ >> 9;
			int i_35_ = (int) f_33_ >> 9;
			if (i_34_ > 0 && i_35_ > 0 && i_34_ < client.aClass505_11019.method8292((byte) 53) && i_35_ < client.aClass505_11019.method8235(2125196228)) {
				int i_36_ = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821;
				if (i_36_ < 3 && ((client.aClass505_11019.method8243(-1130220189).aByteArrayArrayArray4962[1][i_34_][i_35_]) & 0x2) != 0)
					i_36_++;
				int i_37_ = class560.aClass142Array7547[i_36_].method2326((int) f_31_, (int) f_33_, 1769736143);
				if ((float) i_37_ < f_32_) {
					if (i >= 2)
						return (f_24_ - 0.1F + (method5547(f_28_, f_29_, f_30_, f_31_, f_32_, f_33_, i - 1, -1714953527) * 0.1F));
					return f_24_;
				}
			}
			f_28_ = f_31_;
			f_29_ = f_32_;
			f_30_ = f_33_;
		}
		return -1.0F;
	}
}
