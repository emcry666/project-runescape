/* Class534_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class534_Sub1 extends Class534 {
	public static boolean aBool10771;
	public static boolean aBool10772;
	static boolean aBool10773;
	public static Class14 aClass14_10774;
	public static int anInt10775;
	public static int anInt10776;
	static boolean aBool10777;
	public static boolean aBool10778;
	static int anInt10779;
	static int anInt10780;
	static int anInt10781;
	static int anInt10782;
	static boolean aBool10783;
	static int anInt10784;
	static Class10[][] aClass10ArrayArray10785;
	static HashMap aHashMap10786;
	static HashMap aHashMap10787;
	static int anInt10788;
	static int anInt10789;
	static boolean aBool10790;
	static int anInt10791;
	static Class164[][] aClass164ArrayArray10792;
	public static Class14 aClass14_10793;
	static Class706 aClass706_10794;
	public static int anInt10795;
	static boolean aBool10796;
	public static boolean aBool10797;
	static int anInt10798;
	static boolean aBool10799;
	static int anInt10800 = 0;
	public static Class472 aClass472_10801;

	public static int method16590(int i, int i_0_, int i_1_) {
		if (anInt10795 * -1547856073 < 100)
			return -2;
		int i_2_ = -2;
		int i_3_ = 2147483647;
		int i_4_ = i_0_ - anInt7168;
		int i_5_ = i_1_ - anInt7159;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass708_7194.method14240(1484667180); class523_sub32 != null; class523_sub32 = (Class523_Sub32) aClass708_7194.method14244((byte) -108)) {
			if (class523_sub32.anInt10578 * -1039292053 == i) {
				int i_6_ = class523_sub32.anInt10580 * -1808941705;
				int i_7_ = -1727058043 * class523_sub32.anInt10581;
				int i_8_ = i_6_ + anInt7168 << 14 | anInt7159 + i_7_;
				int i_9_ = ((i_5_ - i_7_) * (i_5_ - i_7_) + (i_4_ - i_6_) * (i_4_ - i_6_));
				if (i_2_ < 0 || i_9_ < i_3_) {
					i_2_ = i_8_;
					i_3_ = i_9_;
				}
			}
		}
		return i_2_;
	}

	static void method16591(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239) {
		Class148 class148 = class239.method4316(class178, -2140121914);
		if (null != class148) {
			int i = class148.method2504();
			if (class148.method2428() > i)
				i = class148.method2428();
			int i_10_ = 10;
			int i_11_ = -800911491 * class523_sub32.anInt10583;
			int i_12_ = class523_sub32.anInt10584 * 1992498959;
			int i_13_ = 0;
			int i_14_ = 0;
			if (null != class239.aString2441) {
				i_14_ = Class305.aClass10_3347.method605(class239.aString2441, (2141365743 * Class170.anInt1833), 0, null, -2140851366);
				i_13_ = Class305.aClass10_3347.method602(class239.aString2441, (2141365743 * Class170.anInt1833), null, 1512636353);
			}
			int i_15_ = i / 2 + class523_sub32.anInt10583 * -800911491;
			int i_16_ = 1992498959 * class523_sub32.anInt10584;
			if (i_11_ < i + anInt7200) {
				i_11_ = anInt7200;
				i_15_ = 5 + (i_13_ / 2 + (anInt7200 + i / 2 + i_10_));
			} else if (i_11_ > anInt7202 - i) {
				i_11_ = anInt7202 - i;
				i_15_ = anInt7202 - i / 2 - i_10_ - i_13_ / 2 - 5;
			}
			if (i_12_ < i + anInt7201) {
				i_12_ = anInt7201;
				i_16_ = i / 2 + (anInt7201 + i_10_);
			} else if (i_12_ > anInt7203 - i) {
				i_12_ = anInt7203 - i;
				i_16_ = anInt7203 - i / 2 - i_10_ - i_14_;
			}
			int i_17_ = ((int) (Math.atan2((double) (i_11_ - (class523_sub32.anInt10583 * -800911491)), (double) (i_12_ - 1992498959 * (class523_sub32.anInt10584))) / 3.141592653589793 * 32767.0) & 0xffff);
			class148.method2444((float) i / 2.0F + (float) i_11_, (float) i_12_ + (float) i / 2.0F, 4096, i_17_);
			int i_18_ = -2;
			int i_19_ = -2;
			int i_20_ = -2;
			int i_21_ = -2;
			if (class239.aString2441 != null) {
				i_18_ = i_15_ - i_13_ / 2 - 5;
				i_19_ = i_16_;
				i_20_ = 10 + (i_18_ + i_13_);
				i_21_ = i_14_ + i_19_ + 3;
				if (0 != class239.anInt2428 * 1211490045)
					class178.method3354(i_18_, i_19_, i_20_ - i_18_, i_21_ - i_19_, 1211490045 * class239.anInt2428, (byte) 38);
				if (789268719 * class239.anInt2406 != 0)
					class178.method3077(i_18_, i_19_, i_20_ - i_18_, i_21_ - i_19_, 789268719 * class239.anInt2406, 1589852152);
				Class162.aClass164_1771.method2628(class239.aString2441, i_15_, i_16_, i_13_, i_14_, ~0xffffff | class239.anInt2404 * 488894273, aClass624_7158.anInt8121 * 248301987, 1, 0, 0, null, null, null, 0, 0, 1184569769);
			}
			if (class239.anInt2410 * 924656729 != -1 || null != class239.aString2441) {
				Class523_Sub16 class523_sub16 = new Class523_Sub16(class523_sub32);
				class523_sub16.anInt10478 = (i_11_ - i / 2) * 869645037;
				class523_sub16.anInt10476 = (i_11_ + i / 2) * 939278321;
				class523_sub16.anInt10474 = -1186220603 * (i_12_ - i);
				class523_sub16.anInt10475 = -1175464923 * i_12_;
				class523_sub16.anInt10477 = i_18_ * -226965029;
				class523_sub16.anInt10480 = i_20_ * 721391071;
				class523_sub16.anInt10473 = -72187705 * i_19_;
				class523_sub16.anInt10479 = i_21_ * 481175931;
				Class629.aClass708_8229.method14236(class523_sub16, -1058902035);
			}
		}
	}

	static final void method16592(Class178 class178, Class172 class172) {
		if (100 != anInt10795 * -1547856073 && null != aClass523_Sub27_Sub17_7144) {
			Class248.method4401(1516375036);
			Class248.method4401(1516375036);
			if (-1547856073 * anInt10795 < 10) {
				for (int i = 0; i < aClass164ArrayArray10792.length; i++) {
					for (int i_22_ = 0; i_22_ < aClass164ArrayArray10792[i].length; i_22_++) {
						Class523_Sub8.aClass472_10406.method7650(aClass624_7158.anIntArrayArray8123[i][i_22_], 1188996827);
						Class272.aClass472_2886.method7650(aClass624_7158.anIntArrayArray8123[i][i_22_], -1376732875);
					}
				}
				if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 1043427596)) {
					anInt10795 = (Class90.aClass472_891.method7671(aClass523_Sub27_Sub17_7144.aString11824, 1782903272)) / 10 * 1356975751;
					return;
				}
				anInt10795 = 684855622;
			}
			if (-1547856073 * anInt10795 == 10) {
				anInt7168 = (aClass523_Sub27_Sub17_7144.anInt11830 * -332434647 >> 6 << 6);
				anInt7159 = (aClass523_Sub27_Sub17_7144.anInt11832 * 1023249187 >> 6 << 6);
				anInt7160 = (aClass523_Sub27_Sub17_7144.anInt11828 * -267562095 >> 6 << 6) - anInt7168 + 64;
				anInt7138 = 64 + (((-1856765435 * aClass523_Sub27_Sub17_7144.anInt11833) >> 6 << 6) - anInt7159);
				int[] is = new int[3];
				int i = -1;
				int i_23_ = -1;
				Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				if (aClass523_Sub27_Sub17_7144.method18193(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821, (class592.localX * 235453015 + ((int) class437.aFloat4903 >> 9)), (((int) class437.aFloat4905 >> 9) + class592.localY * 1704054549), is, (short) -10513)) {
					i = is[1] - anInt7168;
					i_23_ = is[2] - anInt7159;
				}
				if (!aBool10783 && i >= 0 && i < anInt7160 && i_23_ >= 0 && i_23_ < anInt7138) {
					i += (int) (Math.random() * 10.0) - 5;
					i_23_ += (int) (Math.random() * 10.0) - 5;
					Class575.anInt7691 = i * 367905367;
					Class597.anInt7835 = -1099820943 * i_23_;
				} else if (anInt10781 * -2025252731 != -1 && -1974716849 * anInt10782 != -1) {
					aClass523_Sub27_Sub17_7144.method18189((anInt10781 * -2025252731), (-1974716849 * anInt10782), is, (byte) 10);
					if (null != is) {
						Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
						Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
					}
					anInt10782 = -349380783;
					anInt10781 = 1743314867;
					aBool10783 = false;
				} else {
					aClass523_Sub27_Sub17_7144.method18189((aClass523_Sub27_Sub17_7144.anInt11827 * -843169111 >> 14) & 0x3fff, (-843169111 * aClass523_Sub27_Sub17_7144.anInt11827 & 0x3fff), is, (byte) 10);
					Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
					Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
				}
				if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 25) {
					aFloat7154 = 2.0F;
					aFloat7155 = 2.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 37) {
					aFloat7154 = 3.0F;
					aFloat7155 = 3.0F;
				} else if (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219 == 50) {
					aFloat7154 = 4.0F;
					aFloat7155 = 4.0F;
				} else if (75 == (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829)) {
					aFloat7154 = 6.0F;
					aFloat7155 = 6.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 100) {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				} else if (200 == (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219)) {
					aFloat7154 = 16.0F;
					aFloat7155 = 16.0F;
				} else {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				}
				anInt7151 = (int) aFloat7155 >> 1;
				aByteArrayArrayArray7137 = Class306.method5555(anInt7151, (byte) 16);
				Archive.method1233((byte) -53);
				method8859();
				Class629.aClass708_8229 = new Class708();
				anInt7161 += (int) (Math.random() * 5.0) - 2;
				if (anInt7161 < -8)
					anInt7161 = -8;
				if (anInt7161 > 8)
					anInt7161 = 8;
				anInt7149 += (int) (Math.random() * 5.0) - 2;
				if (anInt7149 < -16)
					anInt7149 = -16;
				if (anInt7149 > 16)
					anInt7149 = 16;
				method8905(class172, anInt7161 >> 2 << 10, anInt7149 >> 1);
				aClass53_Sub1_7206.method17139(1024, 256, -608589527);
				aClass53_Sub14_7185.method17212(256, 256, -663470304);
				aClass53_Sub18_7190.method1292(4096, (byte) -9);
				Class539.aClass53_Sub3_7213.method1292(256, (byte) -98);
				anInt10795 = 1369711244;
			} else if (anInt10795 * -1547856073 == 20) {
				if (aBool7193) {
					if (method8818(class178, anInt7161, anInt7149, aBool7193))
						anInt10795 = -185833564;
				} else {
					Class469.method7613(true, -280116072);
					method8818(class178, anInt7161, anInt7149, aBool7193);
					anInt10795 = -185833564;
					Class469.method7613(true, 1652682669);
					Class268.method4898(765483496);
				}
			} else if (-1547856073 * anInt10795 == 60) {
				if (aClass472_7146.method7642((aClass523_Sub27_Sub17_7144.aString11824), (byte) 18)) {
					if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), -1977673409))
						return;
					aClass528_7156 = Class478.method7891(aClass472_7146, (aClass523_Sub27_Sub17_7144.aString11824), client.aBool11157, -31189568);
				} else
					aClass528_7156 = new Class528(0);
				method8822();
				anInt10795 = 499022058;
				Class469.method7613(true, -121366503);
				Class268.method4898(765483496);
			} else if (-1547856073 * anInt10795 >= 70) {
				for (int i = 0; i < 3; i++) {
					for (int i_24_ = 0; i_24_ < 5; i_24_++) {
						if (null == aClass164ArrayArray10792[i][i_24_] || aClass10ArrayArray10785[i][i_24_] == null) {
							aClass164ArrayArray10792[i][i_24_] = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_24_]), true, true, -2014068550)));
							aClass10ArrayArray10785[i][i_24_] = (Class491.aClass423_5536.method6688(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_24_]), (byte) -28));
							if (aClass164ArrayArray10792[i][i_24_] != null && aClass10ArrayArray10785[i][i_24_] != null)
								anInt10795 += -224040043;
							else
								return;
						}
					}
				}
				anInt10795 = -1741378372;
				System.gc();
			}
		}
	}

	static final void method16593(Class178 class178, Class172 class172) {
		if (100 != anInt10795 * -1547856073 && null != aClass523_Sub27_Sub17_7144) {
			Class248.method4401(1516375036);
			Class248.method4401(1516375036);
			if (-1547856073 * anInt10795 < 10) {
				for (int i = 0; i < aClass164ArrayArray10792.length; i++) {
					for (int i_25_ = 0; i_25_ < aClass164ArrayArray10792[i].length; i_25_++) {
						Class523_Sub8.aClass472_10406.method7650(aClass624_7158.anIntArrayArray8123[i][i_25_], -481968572);
						Class272.aClass472_2886.method7650(aClass624_7158.anIntArrayArray8123[i][i_25_], -1630139173);
					}
				}
				if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 1141955586)) {
					anInt10795 = (Class90.aClass472_891.method7671(aClass523_Sub27_Sub17_7144.aString11824, -474056688)) / 10 * 1356975751;
					return;
				}
				anInt10795 = 684855622;
			}
			if (-1547856073 * anInt10795 == 10) {
				anInt7168 = (aClass523_Sub27_Sub17_7144.anInt11830 * -332434647 >> 6 << 6);
				anInt7159 = (aClass523_Sub27_Sub17_7144.anInt11832 * 1023249187 >> 6 << 6);
				anInt7160 = (aClass523_Sub27_Sub17_7144.anInt11828 * -267562095 >> 6 << 6) - anInt7168 + 64;
				anInt7138 = 64 + (((-1856765435 * aClass523_Sub27_Sub17_7144.anInt11833) >> 6 << 6) - anInt7159);
				int[] is = new int[3];
				int i = -1;
				int i_26_ = -1;
				Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				if (aClass523_Sub27_Sub17_7144.method18193(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821, (class592.localX * 235453015 + ((int) class437.aFloat4903 >> 9)), (((int) class437.aFloat4905 >> 9) + class592.localY * 1704054549), is, (short) -22287)) {
					i = is[1] - anInt7168;
					i_26_ = is[2] - anInt7159;
				}
				if (!aBool10783 && i >= 0 && i < anInt7160 && i_26_ >= 0 && i_26_ < anInt7138) {
					i += (int) (Math.random() * 10.0) - 5;
					i_26_ += (int) (Math.random() * 10.0) - 5;
					Class575.anInt7691 = i * 367905367;
					Class597.anInt7835 = -1099820943 * i_26_;
				} else if (anInt10781 * -2025252731 != -1 && -1974716849 * anInt10782 != -1) {
					aClass523_Sub27_Sub17_7144.method18189((anInt10781 * -2025252731), (-1974716849 * anInt10782), is, (byte) 10);
					if (null != is) {
						Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
						Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
					}
					anInt10782 = -349380783;
					anInt10781 = 1743314867;
					aBool10783 = false;
				} else {
					aClass523_Sub27_Sub17_7144.method18189((aClass523_Sub27_Sub17_7144.anInt11827 * -843169111 >> 14) & 0x3fff, (-843169111 * aClass523_Sub27_Sub17_7144.anInt11827 & 0x3fff), is, (byte) 10);
					Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
					Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
				}
				if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 25) {
					aFloat7154 = 2.0F;
					aFloat7155 = 2.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 37) {
					aFloat7154 = 3.0F;
					aFloat7155 = 3.0F;
				} else if (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219 == 50) {
					aFloat7154 = 4.0F;
					aFloat7155 = 4.0F;
				} else if (75 == (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829)) {
					aFloat7154 = 6.0F;
					aFloat7155 = 6.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 100) {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				} else if (200 == (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219)) {
					aFloat7154 = 16.0F;
					aFloat7155 = 16.0F;
				} else {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				}
				anInt7151 = (int) aFloat7155 >> 1;
				aByteArrayArrayArray7137 = Class306.method5555(anInt7151, (byte) 9);
				Archive.method1233((byte) -16);
				method8859();
				Class629.aClass708_8229 = new Class708();
				anInt7161 += (int) (Math.random() * 5.0) - 2;
				if (anInt7161 < -8)
					anInt7161 = -8;
				if (anInt7161 > 8)
					anInt7161 = 8;
				anInt7149 += (int) (Math.random() * 5.0) - 2;
				if (anInt7149 < -16)
					anInt7149 = -16;
				if (anInt7149 > 16)
					anInt7149 = 16;
				method8905(class172, anInt7161 >> 2 << 10, anInt7149 >> 1);
				aClass53_Sub1_7206.method17139(1024, 256, 813428253);
				aClass53_Sub14_7185.method17212(256, 256, -507566703);
				aClass53_Sub18_7190.method1292(4096, (byte) -33);
				Class539.aClass53_Sub3_7213.method1292(256, (byte) 29);
				anInt10795 = 1369711244;
			} else if (anInt10795 * -1547856073 == 20) {
				if (aBool7193) {
					if (method8818(class178, anInt7161, anInt7149, aBool7193))
						anInt10795 = -185833564;
				} else {
					Class469.method7613(true, 959968110);
					method8818(class178, anInt7161, anInt7149, aBool7193);
					anInt10795 = -185833564;
					Class469.method7613(true, -1529241505);
					Class268.method4898(765483496);
				}
			} else if (-1547856073 * anInt10795 == 60) {
				if (aClass472_7146.method7642((aClass523_Sub27_Sub17_7144.aString11824), (byte) 124)) {
					if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 1987723084))
						return;
					aClass528_7156 = Class478.method7891(aClass472_7146, (aClass523_Sub27_Sub17_7144.aString11824), client.aBool11157, -1177196246);
				} else
					aClass528_7156 = new Class528(0);
				method8822();
				anInt10795 = 499022058;
				Class469.method7613(true, 1813455993);
				Class268.method4898(765483496);
			} else if (-1547856073 * anInt10795 >= 70) {
				for (int i = 0; i < 3; i++) {
					for (int i_27_ = 0; i_27_ < 5; i_27_++) {
						if (null == aClass164ArrayArray10792[i][i_27_] || aClass10ArrayArray10785[i][i_27_] == null) {
							aClass164ArrayArray10792[i][i_27_] = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_27_]), true, true, -2037993796)));
							aClass10ArrayArray10785[i][i_27_] = (Class491.aClass423_5536.method6688(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_27_]), (byte) -109));
							if (aClass164ArrayArray10792[i][i_27_] != null && aClass10ArrayArray10785[i][i_27_] != null)
								anInt10795 += -224040043;
							else
								return;
						}
					}
				}
				anInt10795 = -1741378372;
				System.gc();
			}
		}
	}

	static void method16594(boolean bool) {
		Class592 class592 = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18399((byte) 1);
		Class523_Sub27_Sub17 class523_sub27_sub17 = method8812(class592.localX * 235453015, class592.localY * 1704054549);
		if (null == class523_sub27_sub17)
			class523_sub27_sub17 = method8813(aClass624_7158.anInt8128 * 1217610883);
		if (Class523_Sub2.aClass523_Sub27_Sub17_10362 != class523_sub27_sub17 || bool) {
			Class523_Sub2.aClass523_Sub27_Sub17_10362 = class523_sub27_sub17;
			boolean bool_28_ = method8811(class523_sub27_sub17);
			if (bool_28_) {
				aBool7193 = true;
				Class42.method1147((short) -25637);
			}
		}
	}

	static final void method16595(Class178 class178, Class172 class172) {
		if (100 != anInt10795 * -1547856073 && null != aClass523_Sub27_Sub17_7144) {
			Class248.method4401(1516375036);
			Class248.method4401(1516375036);
			if (-1547856073 * anInt10795 < 10) {
				for (int i = 0; i < aClass164ArrayArray10792.length; i++) {
					for (int i_29_ = 0; i_29_ < aClass164ArrayArray10792[i].length; i_29_++) {
						Class523_Sub8.aClass472_10406.method7650(aClass624_7158.anIntArrayArray8123[i][i_29_], 433648289);
						Class272.aClass472_2886.method7650(aClass624_7158.anIntArrayArray8123[i][i_29_], -891937222);
					}
				}
				if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 1228235669)) {
					anInt10795 = (Class90.aClass472_891.method7671(aClass523_Sub27_Sub17_7144.aString11824, 960538939)) / 10 * 1356975751;
					return;
				}
				anInt10795 = 684855622;
			}
			if (-1547856073 * anInt10795 == 10) {
				anInt7168 = (aClass523_Sub27_Sub17_7144.anInt11830 * -332434647 >> 6 << 6);
				anInt7159 = (aClass523_Sub27_Sub17_7144.anInt11832 * 1023249187 >> 6 << 6);
				anInt7160 = (aClass523_Sub27_Sub17_7144.anInt11828 * -267562095 >> 6 << 6) - anInt7168 + 64;
				anInt7138 = 64 + (((-1856765435 * aClass523_Sub27_Sub17_7144.anInt11833) >> 6 << 6) - anInt7159);
				int[] is = new int[3];
				int i = -1;
				int i_30_ = -1;
				Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				if (aClass523_Sub27_Sub17_7144.method18193(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821, (class592.localX * 235453015 + ((int) class437.aFloat4903 >> 9)), (((int) class437.aFloat4905 >> 9) + class592.localY * 1704054549), is, (short) -5539)) {
					i = is[1] - anInt7168;
					i_30_ = is[2] - anInt7159;
				}
				if (!aBool10783 && i >= 0 && i < anInt7160 && i_30_ >= 0 && i_30_ < anInt7138) {
					i += (int) (Math.random() * 10.0) - 5;
					i_30_ += (int) (Math.random() * 10.0) - 5;
					Class575.anInt7691 = i * 367905367;
					Class597.anInt7835 = -1099820943 * i_30_;
				} else if (anInt10781 * -2025252731 != -1 && -1974716849 * anInt10782 != -1) {
					aClass523_Sub27_Sub17_7144.method18189((anInt10781 * -2025252731), (-1974716849 * anInt10782), is, (byte) 10);
					if (null != is) {
						Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
						Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
					}
					anInt10782 = -349380783;
					anInt10781 = 1743314867;
					aBool10783 = false;
				} else {
					aClass523_Sub27_Sub17_7144.method18189((aClass523_Sub27_Sub17_7144.anInt11827 * -843169111 >> 14) & 0x3fff, (-843169111 * aClass523_Sub27_Sub17_7144.anInt11827 & 0x3fff), is, (byte) 10);
					Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
					Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
				}
				if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 25) {
					aFloat7154 = 2.0F;
					aFloat7155 = 2.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 37) {
					aFloat7154 = 3.0F;
					aFloat7155 = 3.0F;
				} else if (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219 == 50) {
					aFloat7154 = 4.0F;
					aFloat7155 = 4.0F;
				} else if (75 == (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829)) {
					aFloat7154 = 6.0F;
					aFloat7155 = 6.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 100) {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				} else if (200 == (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219)) {
					aFloat7154 = 16.0F;
					aFloat7155 = 16.0F;
				} else {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				}
				anInt7151 = (int) aFloat7155 >> 1;
				aByteArrayArrayArray7137 = Class306.method5555(anInt7151, (byte) 44);
				Archive.method1233((byte) -28);
				method8859();
				Class629.aClass708_8229 = new Class708();
				anInt7161 += (int) (Math.random() * 5.0) - 2;
				if (anInt7161 < -8)
					anInt7161 = -8;
				if (anInt7161 > 8)
					anInt7161 = 8;
				anInt7149 += (int) (Math.random() * 5.0) - 2;
				if (anInt7149 < -16)
					anInt7149 = -16;
				if (anInt7149 > 16)
					anInt7149 = 16;
				method8905(class172, anInt7161 >> 2 << 10, anInt7149 >> 1);
				aClass53_Sub1_7206.method17139(1024, 256, -171780294);
				aClass53_Sub14_7185.method17212(256, 256, -788769076);
				aClass53_Sub18_7190.method1292(4096, (byte) -52);
				Class539.aClass53_Sub3_7213.method1292(256, (byte) -12);
				anInt10795 = 1369711244;
			} else if (anInt10795 * -1547856073 == 20) {
				if (aBool7193) {
					if (method8818(class178, anInt7161, anInt7149, aBool7193))
						anInt10795 = -185833564;
				} else {
					Class469.method7613(true, -1332067297);
					method8818(class178, anInt7161, anInt7149, aBool7193);
					anInt10795 = -185833564;
					Class469.method7613(true, 2021334102);
					Class268.method4898(765483496);
				}
			} else if (-1547856073 * anInt10795 == 60) {
				if (aClass472_7146.method7642((aClass523_Sub27_Sub17_7144.aString11824), (byte) 69)) {
					if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 226460360))
						return;
					aClass528_7156 = Class478.method7891(aClass472_7146, (aClass523_Sub27_Sub17_7144.aString11824), client.aBool11157, 950252631);
				} else
					aClass528_7156 = new Class528(0);
				method8822();
				anInt10795 = 499022058;
				Class469.method7613(true, -1872195414);
				Class268.method4898(765483496);
			} else if (-1547856073 * anInt10795 >= 70) {
				for (int i = 0; i < 3; i++) {
					for (int i_31_ = 0; i_31_ < 5; i_31_++) {
						if (null == aClass164ArrayArray10792[i][i_31_] || aClass10ArrayArray10785[i][i_31_] == null) {
							aClass164ArrayArray10792[i][i_31_] = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_31_]), true, true, -1858220970)));
							aClass10ArrayArray10785[i][i_31_] = (Class491.aClass423_5536.method6688(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_31_]), (byte) -18));
							if (aClass164ArrayArray10792[i][i_31_] != null && aClass10ArrayArray10785[i][i_31_] != null)
								anInt10795 += -224040043;
							else
								return;
						}
					}
				}
				anInt10795 = -1741378372;
				System.gc();
			}
		}
	}

	static void method16596() {
		if (Class575.anInt7691 * 158908775 < 0) {
			Class575.anInt7691 = 0;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (158908775 * Class575.anInt7691 > anInt7160) {
			Class575.anInt7691 = anInt7160 * 367905367;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 < 0) {
			Class597.anInt7835 = 0;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 > anInt7138) {
			Class597.anInt7835 = -1099820943 * anInt7138;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
	}

	static void method16597() {
		if (Class575.anInt7691 * 158908775 < 0) {
			Class575.anInt7691 = 0;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (158908775 * Class575.anInt7691 > anInt7160) {
			Class575.anInt7691 = anInt7160 * 367905367;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 < 0) {
			Class597.anInt7835 = 0;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 > anInt7138) {
			Class597.anInt7835 = -1099820943 * anInt7138;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
	}

	static void method16598() {
		if (Class575.anInt7691 * 158908775 < 0) {
			Class575.anInt7691 = 0;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (158908775 * Class575.anInt7691 > anInt7160) {
			Class575.anInt7691 = anInt7160 * 367905367;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 < 0) {
			Class597.anInt7835 = 0;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 > anInt7138) {
			Class597.anInt7835 = -1099820943 * anInt7138;
			anInt10780 = -1195183291;
			anInt10779 = -465264525;
		}
	}

	static void method16599() {
		Class629.aClass708_8229 = null;
		anInt10795 = 0;
		anInt7189 = 0;
		RSSocket.aClass250_15 = null;
		method8809();
		aClass708_7194.method14235((byte) 67);
		aClass528_7156 = null;
		aClass209_7136.method3773(-1845666155);
		aClass209_7183.method3773(-1856602412);
		Class523_Sub27_Sub1.aClass148_11328 = null;
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		if (null != aClass53_Sub1_7206) {
			aClass53_Sub1_7206.method1293(-1866820482);
			aClass53_Sub1_7206.method17139(128, 64, -1969272877);
		}
		if (aClass53_Sub14_7185 != null)
			aClass53_Sub14_7185.method17212(64, 64, -540768755);
		if (aClass53_Sub18_7190 != null)
			aClass53_Sub18_7190.method1292(256, (byte) -49);
		Class539.aClass53_Sub3_7213.method1292(64, (byte) -75);
	}

	public static void method16600(int i) {
		if (i < 1)
			anInt10788 = anInt10775 * -1881655893;
		else
			anInt10788 = -642832383 * i;
	}

	static void method16601() {
		Class42.method1147((short) -4897);
		aClass523_Sub27_Sub17_7144 = null;
		Class523_Sub2.aClass523_Sub27_Sub17_10362 = null;
		aClass14_10774.method733(-32006314);
		aClass14_10793.method733(-1667692910);
		for (int i = 0; i < 3; i++) {
			for (int i_32_ = 0; i_32_ < 5; i_32_++) {
				aClass164ArrayArray10792[i][i_32_] = null;
				aClass10ArrayArray10785[i][i_32_] = null;
			}
		}
	}

	public static void method16602(int i, int i_33_) {
		anInt10780 = (i - anInt7168) * 1195183291;
		anInt10779 = 465264525 * (i_33_ - anInt7159);
	}

	Class534_Sub1() throws Throwable {
		throw new Error();
	}

	static void method16603(Class178 class178, int i, int i_34_, int i_35_, int i_36_) {
		class178.method3378(i, i_34_, i_35_ + i, i_36_ + i_34_);
		if (-1547856073 * anInt10795 < 100) {
			int i_37_ = 20;
			int i_38_ = i_35_ / 2 + i;
			int i_39_ = i_36_ / 2 + i_34_ - 18 - i_37_;
			class178.method3193(i, i_34_, i_35_, i_36_, -16777216, 0);
			class178.method3083(i_38_ - 152, i_39_, 304, 34, client.aColorArray11128[1871015145 * client.anInt11188].getRGB(), 0);
			class178.method3193(i_38_ - 150, i_39_ + 2, -348600923 * anInt10795, 30, client.aColorArray11035[client.anInt11188 * 1871015145].getRGB(), 0);
			Class34.aClass164_319.method2624(Class39.aClass39_513.method1124(Class53_Sub20.aClass668_10979, (byte) -98), i_38_, i_37_ + i_39_, client.aColorArray11037[client.anInt11188 * 1871015145].getRGB(), -1, -781041260);
		} else {
			int i_40_ = (Class575.anInt7691 * 158908775 - (int) ((float) i_35_ / aFloat7154));
			int i_41_ = (-217599855 * Class597.anInt7835 + (int) ((float) i_36_ / aFloat7154));
			int i_42_ = (158908775 * Class575.anInt7691 + (int) ((float) i_35_ / aFloat7154));
			int i_43_ = (-217599855 * Class597.anInt7835 - (int) ((float) i_36_ / aFloat7154));
			Class333_Sub2.anInt10000 = (158908775 * Class575.anInt7691 - (int) ((float) i_35_ / aFloat7154)) * 5449309;
			Class322_Sub1.anInt10068 = -1544714241 * (Class597.anInt7835 * -217599855 - (int) ((float) i_36_ / aFloat7154));
			Class686.anInt8669 = 1270838601 * (int) ((float) (2 * i_35_) / aFloat7154);
			Class239.anInt2446 = 1827129815 * (int) ((float) (2 * i_36_) / aFloat7154);
			aClass209_7184 = aClass209_7136;
			method8823(i_40_ + anInt7168, i_41_ + anInt7159, i_42_ + anInt7168, anInt7159 + i_43_, i, i_34_, i_35_ + i, i_36_ + i_34_ + 1);
			method8824(class178, !aBool10773, !aBool10799, client.aBool11157, false);
			Class708 class708 = method8830(class178);
			Class688.method13934(class178, class708, 0, 0, (byte) 39);
			if (client.aBool11096) {
				int i_44_ = i + i_35_ - 5;
				int i_45_ = i_34_ + i_36_ - 8;
				Class10.aClass164_83.method2596(new StringBuilder().append("Fps: ").append(Class506.anInt5662 * -1307622225).append(" (").append(Class506.anInt5663 * 760293275).append(" ms)").toString(), i_44_, i_45_, 16776960, -1, 2064506703);
				i_45_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_46_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_47_ = 16776960;
				if (i_46_ > 65536)
					i_47_ = 16711680;
				Class10.aClass164_83.method2596(new StringBuilder().append("Mem:").append(i_46_).append("k").toString(), i_44_, i_45_, i_47_, -1, 975160424);
				i_45_ -= 15;
			}
			aClass209_7136.method3772(5, (byte) -35);
		}
	}

	static void method16604(int i, int i_48_, int i_49_, int i_50_) {
		float f = (float) anInt7138 / (float) anInt7160;
		int i_51_ = i_49_;
		int i_52_ = i_50_;
		if (f < 1.0F)
			i_52_ = (int) ((float) i_49_ * f);
		else
			i_51_ = (int) ((float) i_50_ / f);
		i -= (i_49_ - i_51_) / 2;
		i_48_ -= (i_50_ - i_52_) / 2;
		Class575.anInt7691 = anInt7160 * i / i_51_ * 367905367;
		Class597.anInt7835 = -1099820943 * (anInt7138 - anInt7138 * i_48_ / i_52_);
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -66);
	}

	static boolean method16605(Class239 class239) {
		if (null == class239)
			return false;
		if (class239.anIntArray2425 != null) {
			class239 = class239.method4319(anInterface19_7142, anInterface17_7141, 494697865);
			if (null == class239)
				return false;
		}
		if (!class239.aBool2412)
			return false;
		if (!class239.method4314(anInterface19_7142, anInterface17_7141, -5827128))
			return false;
		if (aClass14_10774.method741((long) (-1942551915 * class239.anInt2403)) != null)
			return false;
		if (aClass14_10793.method741((long) (1444609703 * class239.anInt2443)) != null)
			return false;
		if (null != class239.aString2441) {
			if (0 == class239.anInt2402 * 933897945 && aBool10778)
				return false;
			if (1 == class239.anInt2402 * 933897945 && aBool10771)
				return false;
			if (933897945 * class239.anInt2402 == 2 && aBool10797)
				return false;
		}
		return true;
	}

	public static Class523_Sub32 method16606() {
		if (null == aClass708_7194 || null == aClass706_10794)
			return null;
		aClass706_10794.method14153(aClass708_7194, -379243182);
		Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.method14146(898697847);
		if (null == class523_sub32)
			return null;
		Class239 class239 = (Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) 60);
		if (null == class239 || !class239.aBool2442 || !class239.method4314(anInterface19_7142, anInterface17_7141, -663528343))
			return Class523_Sub20.method16096(35051);
		return class523_sub32;
	}

	public static void method16607(int i, int i_53_) {
		Class575.anInt7691 = 367905367 * (i - anInt7168);
		Class597.anInt7835 = (i_53_ - anInt7159) * -1099820943;
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -109);
	}

	static void method16608(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239) {
		Class148 class148 = class239.method4316(class178, -2130621285);
		if (null != class148) {
			int i = class148.method2504();
			if (class148.method2428() > i)
				i = class148.method2428();
			int i_54_ = 10;
			int i_55_ = -800911491 * class523_sub32.anInt10583;
			int i_56_ = class523_sub32.anInt10584 * 1992498959;
			int i_57_ = 0;
			int i_58_ = 0;
			if (null != class239.aString2441) {
				i_58_ = Class305.aClass10_3347.method605(class239.aString2441, (2141365743 * Class170.anInt1833), 0, null, -267178367);
				i_57_ = Class305.aClass10_3347.method602(class239.aString2441, (2141365743 * Class170.anInt1833), null, 1654220968);
			}
			int i_59_ = i / 2 + class523_sub32.anInt10583 * -800911491;
			int i_60_ = 1992498959 * class523_sub32.anInt10584;
			if (i_55_ < i + anInt7200) {
				i_55_ = anInt7200;
				i_59_ = 5 + (i_57_ / 2 + (anInt7200 + i / 2 + i_54_));
			} else if (i_55_ > anInt7202 - i) {
				i_55_ = anInt7202 - i;
				i_59_ = anInt7202 - i / 2 - i_54_ - i_57_ / 2 - 5;
			}
			if (i_56_ < i + anInt7201) {
				i_56_ = anInt7201;
				i_60_ = i / 2 + (anInt7201 + i_54_);
			} else if (i_56_ > anInt7203 - i) {
				i_56_ = anInt7203 - i;
				i_60_ = anInt7203 - i / 2 - i_54_ - i_58_;
			}
			int i_61_ = ((int) (Math.atan2((double) (i_55_ - (class523_sub32.anInt10583 * -800911491)), (double) (i_56_ - 1992498959 * (class523_sub32.anInt10584))) / 3.141592653589793 * 32767.0) & 0xffff);
			class148.method2444((float) i / 2.0F + (float) i_55_, (float) i_56_ + (float) i / 2.0F, 4096, i_61_);
			int i_62_ = -2;
			int i_63_ = -2;
			int i_64_ = -2;
			int i_65_ = -2;
			if (class239.aString2441 != null) {
				i_62_ = i_59_ - i_57_ / 2 - 5;
				i_63_ = i_60_;
				i_64_ = 10 + (i_62_ + i_57_);
				i_65_ = i_58_ + i_63_ + 3;
				if (0 != class239.anInt2428 * 1211490045)
					class178.method3354(i_62_, i_63_, i_64_ - i_62_, i_65_ - i_63_, 1211490045 * class239.anInt2428, (byte) 124);
				if (789268719 * class239.anInt2406 != 0)
					class178.method3077(i_62_, i_63_, i_64_ - i_62_, i_65_ - i_63_, 789268719 * class239.anInt2406, 1874501185);
				Class162.aClass164_1771.method2628(class239.aString2441, i_59_, i_60_, i_57_, i_58_, ~0xffffff | class239.anInt2404 * 488894273, aClass624_7158.anInt8121 * 248301987, 1, 0, 0, null, null, null, 0, 0, 1085802001);
			}
			if (class239.anInt2410 * 924656729 != -1 || null != class239.aString2441) {
				Class523_Sub16 class523_sub16 = new Class523_Sub16(class523_sub32);
				class523_sub16.anInt10478 = (i_55_ - i / 2) * 869645037;
				class523_sub16.anInt10476 = (i_55_ + i / 2) * 939278321;
				class523_sub16.anInt10474 = -1186220603 * (i_56_ - i);
				class523_sub16.anInt10475 = -1175464923 * i_56_;
				class523_sub16.anInt10477 = i_62_ * -226965029;
				class523_sub16.anInt10480 = i_64_ * 721391071;
				class523_sub16.anInt10473 = -72187705 * i_63_;
				class523_sub16.anInt10479 = i_65_ * 481175931;
				Class629.aClass708_8229.method14236(class523_sub16, -432015428);
			}
		}
	}

	static void method16609(int i) {
		Class597.anInt7835 = i * -1099820943;
		anInt10779 = -465264525;
		anInt10779 = -465264525;
		Archive.method1233((byte) -14);
	}

	static void method16610(int i) {
		int i_66_;
		if (0 == i)
			i_66_ = 0;
		else if (i == 1)
			i_66_ = 1;
		else if (2 == i)
			i_66_ = 2;
		else
			return;
		int i_67_;
		if ((double) aFloat7155 == 2.0)
			i_67_ = 0;
		else if (3.0 == (double) aFloat7155)
			i_67_ = 1;
		else if (4.0 == (double) aFloat7155)
			i_67_ = 2;
		else if (6.0 == (double) aFloat7155)
			i_67_ = 3;
		else if ((double) aFloat7155 >= 8.0)
			i_67_ = 4;
		else
			return;
		Class162.aClass164_1771 = aClass164ArrayArray10792[i_66_][i_67_];
		Class305.aClass10_3347 = aClass10ArrayArray10785[i_66_][i_67_];
	}

	static void method16611(int i) {
		int i_68_;
		if (0 == i)
			i_68_ = 0;
		else if (i == 1)
			i_68_ = 1;
		else if (2 == i)
			i_68_ = 2;
		else
			return;
		int i_69_;
		if ((double) aFloat7155 == 2.0)
			i_69_ = 0;
		else if (3.0 == (double) aFloat7155)
			i_69_ = 1;
		else if (4.0 == (double) aFloat7155)
			i_69_ = 2;
		else if (6.0 == (double) aFloat7155)
			i_69_ = 3;
		else if ((double) aFloat7155 >= 8.0)
			i_69_ = 4;
		else
			return;
		Class162.aClass164_1771 = aClass164ArrayArray10792[i_68_][i_69_];
		Class305.aClass10_3347 = aClass10ArrayArray10785[i_68_][i_69_];
	}

	static void method16612(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, int i, int i_70_, int i_71_, int i_72_) {
		int i_73_ = i - 5;
		int i_74_ = 2 + i_70_;
		if (1211490045 * class239.anInt2428 != 0)
			class178.method3354(i_73_, i_74_, 10 + i_72_, 1 + (i_70_ + i_71_ - i_74_), 1211490045 * class239.anInt2428, (byte) 11);
		if (0 != class239.anInt2406 * 789268719)
			class178.method3077(i_73_, i_74_, i_72_ + 10, i_71_ + i_70_ - i_74_ + 1, 789268719 * class239.anInt2406, 1906023744);
		int i_75_ = class239.anInt2404 * 488894273;
		if (class523_sub32.aBool10582 && -1 != class239.anInt2405 * 809231103)
			i_75_ = class239.anInt2405 * 809231103;
		Class162.aClass164_1771.method2628(class239.aString2441, i, i_70_, i_72_, i_71_, ~0xffffff | i_75_, (aClass624_7158.anInt8121 * 248301987), 1, 0, 0, null, null, null, 0, 0, 1793761264);
	}

	static void method16613(Class178 class178, int i, int i_76_, int i_77_, int i_78_) {
		class178.method3378(i, i_76_, i_77_ + i, i_78_ + i_76_);
		if (-1547856073 * anInt10795 < 100) {
			int i_79_ = 20;
			int i_80_ = i_77_ / 2 + i;
			int i_81_ = i_78_ / 2 + i_76_ - 18 - i_79_;
			class178.method3193(i, i_76_, i_77_, i_78_, -16777216, 0);
			class178.method3083(i_80_ - 152, i_81_, 304, 34, client.aColorArray11128[1871015145 * client.anInt11188].getRGB(), 0);
			class178.method3193(i_80_ - 150, i_81_ + 2, -348600923 * anInt10795, 30, client.aColorArray11035[client.anInt11188 * 1871015145].getRGB(), 0);
			Class34.aClass164_319.method2624(Class39.aClass39_513.method1124(Class53_Sub20.aClass668_10979, (byte) -105), i_80_, i_79_ + i_81_, client.aColorArray11037[client.anInt11188 * 1871015145].getRGB(), -1, 1809370591);
		} else {
			int i_82_ = (Class575.anInt7691 * 158908775 - (int) ((float) i_77_ / aFloat7154));
			int i_83_ = (-217599855 * Class597.anInt7835 + (int) ((float) i_78_ / aFloat7154));
			int i_84_ = (158908775 * Class575.anInt7691 + (int) ((float) i_77_ / aFloat7154));
			int i_85_ = (-217599855 * Class597.anInt7835 - (int) ((float) i_78_ / aFloat7154));
			Class333_Sub2.anInt10000 = (158908775 * Class575.anInt7691 - (int) ((float) i_77_ / aFloat7154)) * 5449309;
			Class322_Sub1.anInt10068 = -1544714241 * (Class597.anInt7835 * -217599855 - (int) ((float) i_78_ / aFloat7154));
			Class686.anInt8669 = 1270838601 * (int) ((float) (2 * i_77_) / aFloat7154);
			Class239.anInt2446 = 1827129815 * (int) ((float) (2 * i_78_) / aFloat7154);
			aClass209_7184 = aClass209_7136;
			method8823(i_82_ + anInt7168, i_83_ + anInt7159, i_84_ + anInt7168, anInt7159 + i_85_, i, i_76_, i_77_ + i, i_78_ + i_76_ + 1);
			method8824(class178, !aBool10773, !aBool10799, client.aBool11157, false);
			Class708 class708 = method8830(class178);
			Class688.method13934(class178, class708, 0, 0, (byte) -56);
			if (client.aBool11096) {
				int i_86_ = i + i_77_ - 5;
				int i_87_ = i_76_ + i_78_ - 8;
				Class10.aClass164_83.method2596(new StringBuilder().append("Fps: ").append(Class506.anInt5662 * -1307622225).append(" (").append(Class506.anInt5663 * 760293275).append(" ms)").toString(), i_86_, i_87_, 16776960, -1, -1059726487);
				i_87_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_88_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_89_ = 16776960;
				if (i_88_ > 65536)
					i_89_ = 16711680;
				Class10.aClass164_83.method2596(new StringBuilder().append("Mem:").append(i_88_).append("k").toString(), i_86_, i_87_, i_89_, -1, -783709046);
				i_87_ -= 15;
			}
			aClass209_7136.method3772(5, (byte) -14);
		}
	}

	static void method16614(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, int i, int i_90_, int i_91_, int i_92_) {
		int i_93_ = i - 5;
		int i_94_ = 2 + i_90_;
		if (1211490045 * class239.anInt2428 != 0)
			class178.method3354(i_93_, i_94_, 10 + i_92_, 1 + (i_90_ + i_91_ - i_94_), 1211490045 * class239.anInt2428, (byte) 64);
		if (0 != class239.anInt2406 * 789268719)
			class178.method3077(i_93_, i_94_, i_92_ + 10, i_91_ + i_90_ - i_94_ + 1, 789268719 * class239.anInt2406, 1989575673);
		int i_95_ = class239.anInt2404 * 488894273;
		if (class523_sub32.aBool10582 && -1 != class239.anInt2405 * 809231103)
			i_95_ = class239.anInt2405 * 809231103;
		Class162.aClass164_1771.method2628(class239.aString2441, i, i_90_, i_92_, i_91_, ~0xffffff | i_95_, (aClass624_7158.anInt8121 * 248301987), 1, 0, 0, null, null, null, 0, 0, -759265514);
	}

	static final void method16615(int i, int i_96_) {
		if (aFloat7154 < aFloat7155) {
			aFloat7154 += (double) aFloat7154 / 30.0;
			if (aFloat7154 > aFloat7155)
				aFloat7154 = aFloat7155;
			Archive.method1233((byte) -17);
			anInt7151 = (int) aFloat7155 >> 1;
			aByteArrayArrayArray7137 = Class306.method5555(anInt7151, (byte) 51);
		} else if (aFloat7154 > aFloat7155) {
			aFloat7154 -= (double) aFloat7154 / 30.0;
			if (aFloat7154 < aFloat7155)
				aFloat7154 = aFloat7155;
			Archive.method1233((byte) -16);
			anInt7151 = (int) aFloat7155 >> 1;
			aByteArrayArrayArray7137 = Class306.method5555(anInt7151, (byte) 92);
		}
		if (anInt10780 * -135702413 != -1 && -1 != -216990907 * anInt10779) {
			int i_97_ = anInt10780 * -135702413 - Class575.anInt7691 * 158908775;
			if (0 != i_97_)
				i_97_ /= Math.min(1179843315 * anInt10791, Math.abs(i_97_));
			int i_98_ = anInt10779 * -216990907 - -217599855 * Class597.anInt7835;
			if (i_98_ != 0)
				i_98_ /= Math.min(anInt10791 * 1179843315, Math.abs(i_98_));
			Class575.anInt7691 = 367905367 * (i_97_ + 158908775 * Class575.anInt7691);
			Class597.anInt7835 = -1099820943 * (Class597.anInt7835 * -217599855 + i_98_);
			if (0 == i_97_ && 0 == i_98_) {
				anInt10780 = -1195183291;
				anInt10779 = -465264525;
			}
			Archive.method1233((byte) -32);
		}
		Iterator iterator = aHashMap10786.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt245 -= -779275383;
			if (2071802553 * class25.anInt245 == 0) {
				if (class25.anInt246 * 97491391 <= 1 && !aBool10790)
					iterator.remove();
				else {
					class25.anInt246 -= -1099082177;
					class25.anInt245 = anInt10789 * -2045175827;
				}
			}
		}
		iterator = aHashMap10787.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt245 -= -779275383;
			if (0 == 2071802553 * class25.anInt245) {
				if (97491391 * class25.anInt246 <= 1 && !aBool10790)
					iterator.remove();
				else {
					class25.anInt246 -= -1099082177;
					class25.anInt245 = -2045175827 * anInt10789;
				}
			}
		}
		if (aBool10796 && null != Class629.aClass708_8229) {
			for (Class523_Sub16 class523_sub16 = ((Class523_Sub16) Class629.aClass708_8229.method14240(1033261241)); null != class523_sub16; class523_sub16 = ((Class523_Sub16) Class629.aClass708_8229.method14244((byte) -9))) {
				Class239 class239 = ((Class239) aClass53_Sub1_7206.getDefinition((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053, (byte) -23));
				if (class523_sub16.method15994(i, i_96_, 1595985853)) {
					if (class239.aStringArray2418 != null) {
						if (null != class239.aStringArray2418[4])
							Class463.method7523(class239.aStringArray2418[4], class239.aString2415, -1, 1012, -1, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), (class239.anInt2443 * 1444609703), 0, true, false, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), false, (byte) 53);
						if (class239.aStringArray2418[3] != null)
							Class463.method7523(class239.aStringArray2418[3], class239.aString2415, -1, 1011, -1, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), (1444609703 * class239.anInt2443), 0, true, false, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), false, (byte) -23);
						if (class239.aStringArray2418[2] != null)
							Class463.method7523(class239.aStringArray2418[2], class239.aString2415, -1, 1010, -1, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), class239.anInt2443 * 1444609703, 0, true, false, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), false, (byte) -58);
						if (class239.aStringArray2418[1] != null)
							Class463.method7523(class239.aStringArray2418[1], class239.aString2415, -1, 1009, -1, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), class239.anInt2443 * 1444609703, 0, true, false, (long) ((class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053), false, (byte) -6);
						if (null != class239.aStringArray2418[0])
							Class463.method7523(class239.aStringArray2418[0], class239.aString2415, -1, 1008, -1, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), class239.anInt2443 * 1444609703, 0, true, false, (long) (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), false, (byte) -90);
					}
					if (!class523_sub16.aClass523_Sub32_10472.aBool10582) {
						class523_sub16.aClass523_Sub32_10472.aBool10582 = true;
						Class486.method7941(Class572.aClass572_7666, (class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053, 1444609703 * class239.anInt2443, -886052652);
					}
					if (class523_sub16.aClass523_Sub32_10472.aBool10582)
						Class486.method7941(Class572.aClass572_7677, (-1039292053 * (class523_sub16.aClass523_Sub32_10472.anInt10578)), class239.anInt2443 * 1444609703, -886052652);
				} else if (class523_sub16.aClass523_Sub32_10472.aBool10582) {
					class523_sub16.aClass523_Sub32_10472.aBool10582 = false;
					Class486.method7941(Class572.aClass572_7669, (class523_sub16.aClass523_Sub32_10472.anInt10578) * -1039292053, 1444609703 * class239.anInt2443, -886052652);
				}
			}
		}
	}

	public static void method16616() {
		InputStream_Sub1.method17232(true, (byte) -59);
	}

	public static void method16617(int i, int i_99_, int i_100_, boolean bool) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = aClass523_Sub27_Sub17_7144;
		method8898(i);
		aBool7193 = false;
		if (class523_sub27_sub17 != aClass523_Sub27_Sub17_7144)
			Class42.method1147((short) -12255);
		anInt10781 = i_99_ * -1743314867;
		anInt10782 = 349380783 * i_100_;
		aBool10783 = bool;
	}

	public static void method16618(int i, int i_101_, int i_102_, boolean bool) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = aClass523_Sub27_Sub17_7144;
		method8898(i);
		aBool7193 = false;
		if (class523_sub27_sub17 != aClass523_Sub27_Sub17_7144)
			Class42.method1147((short) -13478);
		anInt10781 = i_101_ * -1743314867;
		anInt10782 = 349380783 * i_102_;
		aBool10783 = bool;
	}

	static final void method16619(Class178 class178, Class172 class172) {
		if (100 != anInt10795 * -1547856073 && null != aClass523_Sub27_Sub17_7144) {
			Class248.method4401(1516375036);
			Class248.method4401(1516375036);
			if (-1547856073 * anInt10795 < 10) {
				for (int i = 0; i < aClass164ArrayArray10792.length; i++) {
					for (int i_103_ = 0; i_103_ < aClass164ArrayArray10792[i].length; i_103_++) {
						Class523_Sub8.aClass472_10406.method7650(aClass624_7158.anIntArrayArray8123[i][i_103_], 258076438);
						Class272.aClass472_2886.method7650(aClass624_7158.anIntArrayArray8123[i][i_103_], 662570917);
					}
				}
				if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 868072832)) {
					anInt10795 = (Class90.aClass472_891.method7671(aClass523_Sub27_Sub17_7144.aString11824, 1660550639)) / 10 * 1356975751;
					return;
				}
				anInt10795 = 684855622;
			}
			if (-1547856073 * anInt10795 == 10) {
				anInt7168 = (aClass523_Sub27_Sub17_7144.anInt11830 * -332434647 >> 6 << 6);
				anInt7159 = (aClass523_Sub27_Sub17_7144.anInt11832 * 1023249187 >> 6 << 6);
				anInt7160 = (aClass523_Sub27_Sub17_7144.anInt11828 * -267562095 >> 6 << 6) - anInt7168 + 64;
				anInt7138 = 64 + (((-1856765435 * aClass523_Sub27_Sub17_7144.anInt11833) >> 6 << 6) - anInt7159);
				int[] is = new int[3];
				int i = -1;
				int i_104_ = -1;
				Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				if (aClass523_Sub27_Sub17_7144.method18193(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821, (class592.localX * 235453015 + ((int) class437.aFloat4903 >> 9)), (((int) class437.aFloat4905 >> 9) + class592.localY * 1704054549), is, (short) 1435)) {
					i = is[1] - anInt7168;
					i_104_ = is[2] - anInt7159;
				}
				if (!aBool10783 && i >= 0 && i < anInt7160 && i_104_ >= 0 && i_104_ < anInt7138) {
					i += (int) (Math.random() * 10.0) - 5;
					i_104_ += (int) (Math.random() * 10.0) - 5;
					Class575.anInt7691 = i * 367905367;
					Class597.anInt7835 = -1099820943 * i_104_;
				} else if (anInt10781 * -2025252731 != -1 && -1974716849 * anInt10782 != -1) {
					aClass523_Sub27_Sub17_7144.method18189((anInt10781 * -2025252731), (-1974716849 * anInt10782), is, (byte) 10);
					if (null != is) {
						Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
						Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
					}
					anInt10782 = -349380783;
					anInt10781 = 1743314867;
					aBool10783 = false;
				} else {
					aClass523_Sub27_Sub17_7144.method18189((aClass523_Sub27_Sub17_7144.anInt11827 * -843169111 >> 14) & 0x3fff, (-843169111 * aClass523_Sub27_Sub17_7144.anInt11827 & 0x3fff), is, (byte) 10);
					Class575.anInt7691 = 367905367 * (is[1] - anInt7168);
					Class597.anInt7835 = (is[2] - anInt7159) * -1099820943;
				}
				if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 25) {
					aFloat7154 = 2.0F;
					aFloat7155 = 2.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 37) {
					aFloat7154 = 3.0F;
					aFloat7155 = 3.0F;
				} else if (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219 == 50) {
					aFloat7154 = 4.0F;
					aFloat7155 = 4.0F;
				} else if (75 == (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829)) {
					aFloat7154 = 6.0F;
					aFloat7155 = 6.0F;
				} else if (-826777219 * aClass523_Sub27_Sub17_7144.anInt11829 == 100) {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				} else if (200 == (aClass523_Sub27_Sub17_7144.anInt11829 * -826777219)) {
					aFloat7154 = 16.0F;
					aFloat7155 = 16.0F;
				} else {
					aFloat7154 = 8.0F;
					aFloat7155 = 8.0F;
				}
				anInt7151 = (int) aFloat7155 >> 1;
				aByteArrayArrayArray7137 = Class306.method5555(anInt7151, (byte) 68);
				Archive.method1233((byte) -79);
				method8859();
				Class629.aClass708_8229 = new Class708();
				anInt7161 += (int) (Math.random() * 5.0) - 2;
				if (anInt7161 < -8)
					anInt7161 = -8;
				if (anInt7161 > 8)
					anInt7161 = 8;
				anInt7149 += (int) (Math.random() * 5.0) - 2;
				if (anInt7149 < -16)
					anInt7149 = -16;
				if (anInt7149 > 16)
					anInt7149 = 16;
				method8905(class172, anInt7161 >> 2 << 10, anInt7149 >> 1);
				aClass53_Sub1_7206.method17139(1024, 256, 1980862658);
				aClass53_Sub14_7185.method17212(256, 256, -400347597);
				aClass53_Sub18_7190.method1292(4096, (byte) 25);
				Class539.aClass53_Sub3_7213.method1292(256, (byte) -26);
				anInt10795 = 1369711244;
			} else if (anInt10795 * -1547856073 == 20) {
				if (aBool7193) {
					if (method8818(class178, anInt7161, anInt7149, aBool7193))
						anInt10795 = -185833564;
				} else {
					Class469.method7613(true, 1452326958);
					method8818(class178, anInt7161, anInt7149, aBool7193);
					anInt10795 = -185833564;
					Class469.method7613(true, -795389212);
					Class268.method4898(765483496);
				}
			} else if (-1547856073 * anInt10795 == 60) {
				if (aClass472_7146.method7642((aClass523_Sub27_Sub17_7144.aString11824), (byte) 84)) {
					if (!aClass472_7146.method7716((aClass523_Sub27_Sub17_7144.aString11824), 719724820))
						return;
					aClass528_7156 = Class478.method7891(aClass472_7146, (aClass523_Sub27_Sub17_7144.aString11824), client.aBool11157, 275308860);
				} else
					aClass528_7156 = new Class528(0);
				method8822();
				anInt10795 = 499022058;
				Class469.method7613(true, 2008882206);
				Class268.method4898(765483496);
			} else if (-1547856073 * anInt10795 >= 70) {
				for (int i = 0; i < 3; i++) {
					for (int i_105_ = 0; i_105_ < 5; i_105_++) {
						if (null == aClass164ArrayArray10792[i][i_105_] || aClass10ArrayArray10785[i][i_105_] == null) {
							aClass164ArrayArray10792[i][i_105_] = ((Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_105_]), true, true, -1884990527)));
							aClass10ArrayArray10785[i][i_105_] = (Class491.aClass423_5536.method6688(client.anInterface50_11044, (aClass624_7158.anIntArrayArray8123[i][i_105_]), (byte) -4));
							if (aClass164ArrayArray10792[i][i_105_] != null && aClass10ArrayArray10785[i][i_105_] != null)
								anInt10795 += -224040043;
							else
								return;
						}
					}
				}
				anInt10795 = -1741378372;
				System.gc();
			}
		}
	}

	public static Class523_Sub27_Sub17 method16620() {
		return aClass523_Sub27_Sub17_7144;
	}

	static void method16621(boolean bool) {
		Class592 class592 = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18399((byte) 1);
		Class523_Sub27_Sub17 class523_sub27_sub17 = method8812(class592.localX * 235453015, class592.localY * 1704054549);
		if (null == class523_sub27_sub17)
			class523_sub27_sub17 = method8813(aClass624_7158.anInt8128 * 1217610883);
		if (Class523_Sub2.aClass523_Sub27_Sub17_10362 != class523_sub27_sub17 || bool) {
			Class523_Sub2.aClass523_Sub27_Sub17_10362 = class523_sub27_sub17;
			boolean bool_106_ = method8811(class523_sub27_sub17);
			if (bool_106_) {
				aBool7193 = true;
				Class42.method1147((short) -12234);
			}
		}
	}

	public static Class523_Sub32 method16622() {
		if (aClass708_7194 == null || aClass706_10794 == null)
			return null;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.next(); null != class523_sub32; class523_sub32 = (Class523_Sub32) aClass706_10794.next()) {
			Class239 class239 = ((Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) -118));
			if (null != class239 && class239.aBool2442 && class239.method4314(anInterface19_7142, anInterface17_7141, 1902540420))
				return class523_sub32;
		}
		return null;
	}

	static void method16623(boolean bool) {
		Class592 class592 = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18399((byte) 1);
		Class523_Sub27_Sub17 class523_sub27_sub17 = method8812(class592.localX * 235453015, class592.localY * 1704054549);
		if (null == class523_sub27_sub17)
			class523_sub27_sub17 = method8813(aClass624_7158.anInt8128 * 1217610883);
		if (Class523_Sub2.aClass523_Sub27_Sub17_10362 != class523_sub27_sub17 || bool) {
			Class523_Sub2.aClass523_Sub27_Sub17_10362 = class523_sub27_sub17;
			boolean bool_107_ = method8811(class523_sub27_sub17);
			if (bool_107_) {
				aBool7193 = true;
				Class42.method1147((short) -29327);
			}
		}
	}

	static void method16624(int i) {
		Class575.anInt7691 = i * 367905367;
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -70);
	}

	static void method16625(int i) {
		Class597.anInt7835 = i * -1099820943;
		anInt10779 = -465264525;
		anInt10779 = -465264525;
		Archive.method1233((byte) -64);
	}

	static boolean method16626(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, int i, int i_108_) {
		if (aBool7170 && !client.aBool11157 && !method8834(class523_sub32.anInt10580 * -1808941705, class523_sub32.anInt10581 * -1727058043))
			return false;
		if (null != class239.anIntArray2425) {
			class239 = class239.method4319(anInterface19_7142, anInterface17_7141, 1440655793);
			if (class239 == null)
				return false;
		}
		int i_109_ = 2147483647;
		int i_110_ = -2147483648;
		int i_111_ = 2147483647;
		int i_112_ = -2147483648;
		if (null != class239.anIntArray2445) {
			i_109_ = anInt7200 + ((class239.anInt2427 * 374901433 + class523_sub32.anInt10580 * -1808941705 - anInt7196) * (anInt7202 - anInt7200) / (anInt7198 - anInt7196));
			i_110_ = anInt7200 + ((anInt7202 - anInt7200) * (class523_sub32.anInt10580 * -1808941705 + -892198963 * class239.anInt2401 - anInt7196) / (anInt7198 - anInt7196));
			i_112_ = anInt7203 - ((973938647 * class239.anInt2421 + -1727058043 * class523_sub32.anInt10581 - anInt7167) * (anInt7203 - anInt7201) / (anInt7195 - anInt7167));
			i_111_ = anInt7203 - ((class239.anInt2430 * -1256537267 + class523_sub32.anInt10581 * -1727058043 - anInt7167) * (anInt7203 - anInt7201) / (anInt7195 - anInt7167));
		}
		Class148 class148 = null;
		int i_113_ = 0;
		int i_114_ = 0;
		int i_115_ = 0;
		int i_116_ = 0;
		if (924656729 * class239.anInt2410 != -1) {
			if (class523_sub32.aBool10582 && -1173943061 * class239.anInt2398 != -1)
				class148 = class239.method4315(class178, true, 1669802133);
			else
				class148 = class239.method4315(class178, false, 1292815046);
			if (class148 != null) {
				switch (class239.aClass275_2411.anInt2902 * -399546231) {
				case 2:
					i_113_ = (class523_sub32.anInt10583 * -800911491 - class148.method38());
					i_114_ = -800911491 * class523_sub32.anInt10583;
					break;
				case 0:
					i_113_ = (-800911491 * class523_sub32.anInt10583 - (class148.method38() + 1 >> 1));
					i_114_ = (class523_sub32.anInt10583 * -800911491 + (class148.method38() + 1 >> 1));
					break;
				case 1:
					i_113_ = class523_sub32.anInt10583 * -800911491;
					i_114_ = (-800911491 * class523_sub32.anInt10583 + class148.method38());
					break;
				}
				switch (1995634209 * class239.aClass273_2438.anInt2887) {
				case 0:
					i_115_ = (1992498959 * class523_sub32.anInt10584 - (class148.method2429() + 1 >> 1));
					i_116_ = (class523_sub32.anInt10584 * 1992498959 + (class148.method2429() + 1 >> 1));
					break;
				case 1:
					i_115_ = (class523_sub32.anInt10584 * 1992498959 - class148.method2429());
					i_116_ = 1992498959 * class523_sub32.anInt10584;
					break;
				case 2:
					i_115_ = class523_sub32.anInt10584 * 1992498959;
					i_116_ = (1992498959 * class523_sub32.anInt10584 + class148.method2429());
					break;
				}
				if (i_113_ < i_109_)
					i_109_ = i_113_;
				if (i_114_ > i_110_)
					i_110_ = i_114_;
				if (i_115_ < i_111_)
					i_111_ = i_115_;
				if (i_116_ > i_112_)
					i_112_ = i_116_;
			}
		}
		Class148 class148_117_ = null;
		if (class239.anInt2419 * 1669690785 != -1)
			class148_117_ = class239.method4320(class178, 647985542);
		int i_118_ = 0;
		int i_119_ = 0;
		int i_120_ = 0;
		int i_121_ = 0;
		int i_122_ = 0;
		int i_123_ = 0;
		int i_124_ = 0;
		int i_125_ = 0;
		if (null != class239.aString2441) {
			Class541.method8990(933897945 * class239.anInt2402, 664521299);
			if (null != Class162.aClass164_1771) {
				i_125_ = Class305.aClass10_3347.method605(class239.aString2441, (2141365743 * Class170.anInt1833), 0, null, -1303252918);
				i_120_ = Class305.aClass10_3347.method602(class239.aString2441, (2141365743 * Class170.anInt1833), null, 1877832423);
				i_118_ = (-800911491 * class523_sub32.anInt10583 - i_120_ / 2 + ((anInt7202 - anInt7200) * (-1857881741 * class239.anInt2435) / (anInt7198 - anInt7196)));
				i_119_ = (class523_sub32.anInt10584 * 1992498959 - ((anInt7203 - anInt7201) * (class239.anInt2436 * 77210663) / (anInt7195 - anInt7167)));
				if (null == class148)
					i_119_ -= i_125_ / 2;
				else
					i_119_ -= (class148.method2429() >> 1) + i_125_;
				i_121_ = i_118_ + i;
				if (i_121_ < i_109_)
					i_109_ = i_121_;
				i_122_ = i + (i_120_ + i_118_);
				if (i_122_ > i_110_)
					i_110_ = i_122_;
				i_123_ = i_108_ + i_119_;
				if (i_123_ < i_111_)
					i_111_ = i_123_;
				i_124_ = i_108_ + (i_125_ + i_119_);
				if (i_124_ > i_112_)
					i_112_ = i_124_;
			}
		}
		if (i_110_ < anInt7200 || i_109_ > anInt7202 || i_112_ < anInt7201 || i_111_ > anInt7203)
			return true;
		method8913(class178, class523_sub32, class239);
		if (class148 != null) {
			int i_126_ = 0;
			int i_127_ = 0;
			int i_128_ = 0;
			int i_129_ = 0;
			int i_130_ = 0;
			int i_131_ = 0;
			switch (-399546231 * class239.aClass275_2411.anInt2902) {
			case 2:
				i_126_ = class148.method2504();
				i_127_ = (class148.method2504() + 1) / 2;
				i_128_ = class148.method38();
				break;
			case 1:
				i_127_ = -(class148.method2504() + 1) / 2;
				break;
			case 0:
				i_126_ = class148.method2504() / 2;
				i_128_ = class148.method38() >> 1;
				break;
			}
			switch (class239.aClass273_2438.anInt2887 * 1995634209) {
			case 2:
				i_130_ = -(class148.method2504() + 1) / 2;
				break;
			case 1:
				i_129_ = class148.method2504();
				i_130_ = (class148.method2504() + 1) / 2;
				i_131_ = class148.method2429();
				break;
			case 0:
				i_129_ = class148.method2504() / 2;
				i_131_ = class148.method2429() >> 1;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10786.get(Integer.valueOf(-1039292053 * (class523_sub32.anInt10578))));
			if (class25 == null)
				class25 = ((Class25) aHashMap10787.get(Integer.valueOf(class239.anInt2443 * 1444609703)));
			if (class25 != null && 1669690785 * class239.anInt2419 == -1) {
				int i_132_;
				if (class25.anInt245 * 2071802553 > anInt10789 * 1552389189 / 2)
					i_132_ = ((722251963 * anInt10789 - 28673607 * class25.anInt245) / (1552389189 * anInt10789));
				else
					i_132_ = class25.anInt245 * 28673607 / (1552389189 * anInt10789);
				int i_133_ = i_132_ << 24 | 0xffff00;
				if (class178 instanceof Class178_Sub2) {
					class178.method3354((-800911491 * class523_sub32.anInt10583 - i_126_ - 7), (1992498959 * class523_sub32.anInt10584 - i_129_ - 7), class148.method2504() + 14, class148.method2504() + 14, i_133_, (byte) 116);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_126_ - 5), (class523_sub32.anInt10584 * 1992498959 - i_129_ - 5), class148.method2504() + 10, class148.method2504() + 10, i_133_, (byte) 108);
					class178.method3354((-800911491 * class523_sub32.anInt10583 - i_126_ - 3), (1992498959 * class523_sub32.anInt10584 - i_129_ - 3), class148.method2504() + 6, class148.method2504() + 6, i_133_, (byte) 63);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_126_ - 1), (1992498959 * class523_sub32.anInt10584 - i_129_ - 1), class148.method2504() + 2, class148.method2504() + 2, i_133_, (byte) 118);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_126_), (1992498959 * class523_sub32.anInt10584 - i_129_), class148.method2504(), class148.method2504(), i_133_, (byte) 8);
				} else {
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_127_), (class523_sub32.anInt10584 * 1992498959 - i_130_), class148.method2504() / 2 + 7, i_133_, -963682575);
					class178.method3079((-800911491 * class523_sub32.anInt10583 - i_127_), (0 != (class523_sub32.anInt10584 * 1992498959) - i_130_ - i_130_ ? 1 : 0), class148.method2504() / 2 + 5, i_133_, 236982987);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_127_), (class523_sub32.anInt10584 * 1992498959 - i_130_ - i_130_) != 0 ? 1 : 0, class148.method2504() / 2 + 3, i_133_, -969231178);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_127_), 0 != ((1992498959 * class523_sub32.anInt10584) - i_130_ - i_130_) ? 1 : 0, class148.method2504() / 2 + 1, i_133_, -1598770401);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_127_), (0 != (class523_sub32.anInt10584 * 1992498959) - i_130_ - i_130_ ? 1 : 0), class148.method2504() / 2, i_133_, -1513774288);
				}
			}
			class148.method2435((-800911491 * class523_sub32.anInt10583 - i_128_), (1992498959 * class523_sub32.anInt10584 - i_131_));
			int i_134_ = 0;
			int i_135_ = 0;
			if (null != class25 && null != class148_117_) {
				switch (-399546231 * class239.aClass275_2411.anInt2902) {
				case 1:
					i_134_ = class148_117_.method38();
					break;
				case 0:
					i_134_ = class148_117_.method38() >> 1;
					break;
				}
				switch (1995634209 * class239.aClass273_2438.anInt2887) {
				case 1:
					i_135_ = (class148_117_.method2429() + class148.method2429()) / 2;
					break;
				case 0:
					i_135_ = (class148_117_.method2429() / 2 + class148.method2429()) / 2;
					break;
				}
				int i_136_;
				if (2071802553 * class25.anInt245 > anInt10789 * 1552389189 / 2)
					i_136_ = ((anInt10789 * 722251963 - class25.anInt245 * 28673607) / (anInt10789 * 1552389189));
				else
					i_136_ = 28673607 * class25.anInt245 / (1552389189 * anInt10789);
				int i_137_ = i_136_ << 24 | 0xffff00;
				class148_117_.method2436(-800911491 * class523_sub32.anInt10583 - i_134_, 1992498959 * class523_sub32.anInt10584 - i_135_, 0, i_137_, 1);
			}
		}
		if (null != class239.aString2441 && null != Class162.aClass164_1771)
			Class291.method5232(class178, class523_sub32, class239, i_118_, i_119_, i_125_, i_120_, -1812326097);
		if (-1 != class239.anInt2410 * 924656729 || class239.aString2441 != null) {
			Class523_Sub16 class523_sub16 = new Class523_Sub16(class523_sub32);
			class523_sub16.anInt10478 = 869645037 * i_113_;
			class523_sub16.anInt10476 = i_114_ * 939278321;
			class523_sub16.anInt10474 = -1186220603 * i_115_;
			class523_sub16.anInt10475 = i_116_ * -1175464923;
			class523_sub16.anInt10477 = -226965029 * i_121_;
			class523_sub16.anInt10480 = i_122_ * 721391071;
			class523_sub16.anInt10473 = i_123_ * -72187705;
			class523_sub16.anInt10479 = i_124_ * 481175931;
			Class629.aClass708_8229.method14236(class523_sub16, -929165128);
		}
		return false;
	}

	public static void method16627(int i) {
		if (i == 25)
			aFloat7155 = 2.0F;
		else if (i == 37)
			aFloat7155 = 3.0F;
		else if (i == 50)
			aFloat7155 = 4.0F;
		else if (75 == i)
			aFloat7155 = 6.0F;
		else if (i == 100)
			aFloat7155 = 8.0F;
		else if (200 == i)
			aFloat7155 = 16.0F;
		anInt10779 = -465264525;
		anInt10779 = -465264525;
	}

	static void method16628(int i, int i_138_, int i_139_, int i_140_) {
		float f = (float) anInt7138 / (float) anInt7160;
		int i_141_ = i_139_;
		int i_142_ = i_140_;
		if (f < 1.0F)
			i_142_ = (int) ((float) i_139_ * f);
		else
			i_141_ = (int) ((float) i_140_ / f);
		i -= (i_139_ - i_141_) / 2;
		i_138_ -= (i_140_ - i_142_) / 2;
		Class575.anInt7691 = anInt7160 * i / i_141_ * 367905367;
		Class597.anInt7835 = -1099820943 * (anInt7138 - anInt7138 * i_138_ / i_142_);
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -45);
	}

	static void method16629(int i, int i_143_, int i_144_, int i_145_) {
		float f = (float) anInt7138 / (float) anInt7160;
		int i_146_ = i_144_;
		int i_147_ = i_145_;
		if (f < 1.0F)
			i_147_ = (int) ((float) i_144_ * f);
		else
			i_146_ = (int) ((float) i_145_ / f);
		i -= (i_144_ - i_146_) / 2;
		i_143_ -= (i_145_ - i_147_) / 2;
		Class575.anInt7691 = anInt7160 * i / i_146_ * 367905367;
		Class597.anInt7835 = -1099820943 * (anInt7138 - anInt7138 * i_143_ / i_147_);
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -88);
	}

	static void method16630(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, int i, int i_148_, int i_149_, int i_150_) {
		int i_151_ = i - 5;
		int i_152_ = 2 + i_148_;
		if (1211490045 * class239.anInt2428 != 0)
			class178.method3354(i_151_, i_152_, 10 + i_150_, 1 + (i_148_ + i_149_ - i_152_), 1211490045 * class239.anInt2428, (byte) 69);
		if (0 != class239.anInt2406 * 789268719)
			class178.method3077(i_151_, i_152_, i_150_ + 10, i_149_ + i_148_ - i_152_ + 1, 789268719 * class239.anInt2406, 1930697612);
		int i_153_ = class239.anInt2404 * 488894273;
		if (class523_sub32.aBool10582 && -1 != class239.anInt2405 * 809231103)
			i_153_ = class239.anInt2405 * 809231103;
		Class162.aClass164_1771.method2628(class239.aString2441, i, i_148_, i_150_, i_149_, ~0xffffff | i_153_, (aClass624_7158.anInt8121 * 248301987), 1, 0, 0, null, null, null, 0, 0, 123065844);
	}

	static void method16631(int i, int i_154_, int i_155_, int i_156_) {
		float f = (float) anInt7138 / (float) anInt7160;
		int i_157_ = i_155_;
		int i_158_ = i_156_;
		if (f < 1.0F)
			i_158_ = (int) ((float) i_155_ * f);
		else
			i_157_ = (int) ((float) i_156_ / f);
		i -= (i_155_ - i_157_) / 2;
		i_154_ -= (i_156_ - i_158_) / 2;
		Class575.anInt7691 = anInt7160 * i / i_157_ * 367905367;
		Class597.anInt7835 = -1099820943 * (anInt7138 - anInt7138 * i_154_ / i_158_);
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -56);
	}

	static void method16632(int i, int i_159_, int i_160_, int i_161_) {
		float f = (float) anInt7138 / (float) anInt7160;
		int i_162_ = i_160_;
		int i_163_ = i_161_;
		if (f < 1.0F)
			i_163_ = (int) ((float) i_160_ * f);
		else
			i_162_ = (int) ((float) i_161_ / f);
		i -= (i_160_ - i_162_) / 2;
		i_159_ -= (i_161_ - i_163_) / 2;
		Class575.anInt7691 = anInt7160 * i / i_162_ * 367905367;
		Class597.anInt7835 = -1099820943 * (anInt7138 - anInt7138 * i_159_ / i_163_);
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -52);
	}

	static void method16633(int i, int i_164_, int i_165_, int i_166_) {
		float f = (float) anInt7138 / (float) anInt7160;
		int i_167_ = i_165_;
		int i_168_ = i_166_;
		if (f < 1.0F)
			i_168_ = (int) ((float) i_165_ * f);
		else
			i_167_ = (int) ((float) i_166_ / f);
		i -= (i_165_ - i_167_) / 2;
		i_164_ -= (i_166_ - i_168_) / 2;
		Class575.anInt7691 = anInt7160 * i / i_167_ * 367905367;
		Class597.anInt7835 = -1099820943 * (anInt7138 - anInt7138 * i_164_ / i_168_);
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -124);
	}

	public static int method16634() {
		if ((double) aFloat7155 == 2.0)
			return 25;
		if (3.0 == (double) aFloat7155)
			return 37;
		if ((double) aFloat7155 == 4.0)
			return 50;
		if (6.0 == (double) aFloat7155)
			return 75;
		if ((double) aFloat7155 == 8.0)
			return 100;
		return 200;
	}

	public static Class523_Sub32 method16635() {
		if (null == aClass708_7194 || null == aClass706_10794)
			return null;
		aClass706_10794.method14153(aClass708_7194, -1879107774);
		Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.method14146(1563837528);
		if (null == class523_sub32)
			return null;
		Class239 class239 = (Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) -60);
		if (null == class239 || !class239.aBool2442 || !class239.method4314(anInterface19_7142, anInterface17_7141, 1313723576))
			return Class523_Sub20.method16096(35051);
		return class523_sub32;
	}

	public static void method16636(int i) {
		Class25 class25 = (Class25) aHashMap10786.get(Integer.valueOf(i));
		if (class25 == null)
			class25 = new Class25();
		class25.anInt246 = anInt10788 * 649231935;
		class25.anInt245 = -2045175827 * anInt10789;
		aHashMap10786.put(Integer.valueOf(i), class25);
	}

	public static void method16637(int i) {
		Class25 class25 = (Class25) aHashMap10787.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt246 = anInt10788 * 649231935;
		class25.anInt245 = -2045175827 * anInt10789;
		aHashMap10787.put(Integer.valueOf(i), class25);
	}

	static void method16638() {
		int i = -1;
		if (aClass523_Sub27_Sub17_7144 != null)
			i = aClass523_Sub27_Sub17_7144.anInt11831 * -536403473;
		Class42.method1147((short) -31334);
		for (int i_169_ = 0; i_169_ < 3; i_169_++) {
			for (int i_170_ = 0; i_170_ < 5; i_170_++) {
				aClass164ArrayArray10792[i_169_][i_170_] = null;
				aClass10ArrayArray10785[i_169_][i_170_] = null;
			}
		}
		aClass523_Sub27_Sub17_7144 = null;
		if (-1 != i)
			Class642.method10534(i, -1, -1, false, 1945902608);
	}

	public static int method16639() {
		if ((double) aFloat7155 == 2.0)
			return 25;
		if (3.0 == (double) aFloat7155)
			return 37;
		if ((double) aFloat7155 == 4.0)
			return 50;
		if (6.0 == (double) aFloat7155)
			return 75;
		if ((double) aFloat7155 == 8.0)
			return 100;
		return 200;
	}

	public static void method16640(int i) {
		if (i < 1)
			anInt10789 = 801008883 * anInt10776;
		else
			anInt10789 = i * -1199939955;
	}

	public static void method16641(boolean bool) {
		aBool10790 = bool;
	}

	public static void method16642() {
		aHashMap10786.clear();
		aHashMap10787.clear();
	}

	public static void method16643() {
		aHashMap10786.clear();
		aHashMap10787.clear();
	}

	static {
		anInt10798 = -1369485247;
		anInt10784 = 1323909922;
		anInt10791 = -2119339560;
		anInt10775 = 1882963721;
		anInt10776 = -1561525042;
		anInt10795 = 0;
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		aBool10796 = false;
		anInt10781 = 1743314867;
		anInt10782 = -349380783;
		aBool10783 = false;
		aClass164ArrayArray10792 = new Class164[3][5];
		aClass10ArrayArray10785 = new Class10[3][5];
		aHashMap10786 = new HashMap();
		aHashMap10787 = new HashMap();
		anInt10788 = anInt10775 * -1881655893;
		anInt10789 = 801008883 * anInt10776;
		aBool10790 = false;
		aBool10772 = false;
		aClass14_10774 = new Class14(8);
		aClass14_10793 = new Class14(8);
		aClass706_10794 = new Class706(new Class708());
		aBool10778 = false;
		aBool10771 = false;
		aBool10797 = false;
		aBool10773 = false;
		aBool10799 = false;
		aBool10777 = false;
	}

	public static int method16644(int i, int i_171_, int i_172_) {
		if (anInt10795 * -1547856073 < 100)
			return -2;
		int i_173_ = -2;
		int i_174_ = 2147483647;
		int i_175_ = i_171_ - anInt7168;
		int i_176_ = i_172_ - anInt7159;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass708_7194.method14240(1599055764); class523_sub32 != null; class523_sub32 = (Class523_Sub32) aClass708_7194.method14244((byte) -84)) {
			if (class523_sub32.anInt10578 * -1039292053 == i) {
				int i_177_ = class523_sub32.anInt10580 * -1808941705;
				int i_178_ = -1727058043 * class523_sub32.anInt10581;
				int i_179_ = i_177_ + anInt7168 << 14 | anInt7159 + i_178_;
				int i_180_ = ((i_176_ - i_178_) * (i_176_ - i_178_) + (i_175_ - i_177_) * (i_175_ - i_177_));
				if (i_173_ < 0 || i_180_ < i_174_) {
					i_173_ = i_179_;
					i_174_ = i_180_;
				}
			}
		}
		return i_173_;
	}

	static void method16645() {
		Class42.method1147((short) -19599);
		aClass523_Sub27_Sub17_7144 = null;
		Class523_Sub2.aClass523_Sub27_Sub17_10362 = null;
		aClass14_10774.method733(834526399);
		aClass14_10793.method733(-243368532);
		for (int i = 0; i < 3; i++) {
			for (int i_181_ = 0; i_181_ < 5; i_181_++) {
				aClass164ArrayArray10792[i][i_181_] = null;
				aClass10ArrayArray10785[i][i_181_] = null;
			}
		}
	}

	public static void method16646(int i, int i_182_) {
		Class575.anInt7691 = 367905367 * (i - anInt7168);
		Class597.anInt7835 = (i_182_ - anInt7159) * -1099820943;
		anInt10780 = -1195183291;
		anInt10779 = -465264525;
		Archive.method1233((byte) -117);
	}

	public static Class523_Sub32 method16647() {
		if (null == aClass708_7194 || null == aClass706_10794)
			return null;
		aClass706_10794.method14153(aClass708_7194, -585493474);
		Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.method14146(668868760);
		if (null == class523_sub32)
			return null;
		Class239 class239 = (Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) -3);
		if (null == class239 || !class239.aBool2442 || !class239.method4314(anInterface19_7142, anInterface17_7141, 830039667))
			return Class523_Sub20.method16096(35051);
		return class523_sub32;
	}

	public static Class523_Sub32 method16648() {
		if (aClass708_7194 == null || aClass706_10794 == null)
			return null;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.next(); null != class523_sub32; class523_sub32 = (Class523_Sub32) aClass706_10794.next()) {
			Class239 class239 = ((Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) -54));
			if (null != class239 && class239.aBool2442 && class239.method4314(anInterface19_7142, anInterface17_7141, -374711968))
				return class523_sub32;
		}
		return null;
	}

	public static void method16649(int i) {
		Class25 class25 = (Class25) aHashMap10787.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt246 = anInt10788 * 649231935;
		class25.anInt245 = -2045175827 * anInt10789;
		aHashMap10787.put(Integer.valueOf(i), class25);
	}

	public static Class523_Sub32 method16650() {
		if (aClass708_7194 == null || aClass706_10794 == null)
			return null;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.next(); null != class523_sub32; class523_sub32 = (Class523_Sub32) aClass706_10794.next()) {
			Class239 class239 = ((Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) -9));
			if (null != class239 && class239.aBool2442 && class239.method4314(anInterface19_7142, anInterface17_7141, 568225284))
				return class523_sub32;
		}
		return null;
	}

	public static Class523_Sub32 method16651() {
		if (aClass708_7194 == null || aClass706_10794 == null)
			return null;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.next(); null != class523_sub32; class523_sub32 = (Class523_Sub32) aClass706_10794.next()) {
			Class239 class239 = ((Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) 47));
			if (null != class239 && class239.aBool2442 && class239.method4314(anInterface19_7142, anInterface17_7141, -1021061675))
				return class523_sub32;
		}
		return null;
	}

	static void method16652(Class178 class178, Class708 class708, int i, int i_183_) {
		Class629.aClass708_8229.method14235((byte) -29);
		if (!aBool10772) {
			for (Class523_Sub32 class523_sub32 = (Class523_Sub32) class708.method14240(587642229); class523_sub32 != null; class523_sub32 = (Class523_Sub32) class708.method14244((byte) 79)) {
				Class239 class239 = (Class239) aClass53_Sub1_7206.getDefinition((-1039292053 * (class523_sub32.anInt10578)), (byte) -44);
				if (Class535.method8920(class239, 835619470)) {
					boolean bool = Class77.method1545(class178, class523_sub32, class239, i, i_183_, 335840401);
					if (bool)
						Class644.method10555(class178, class523_sub32, class239, (byte) 47);
				}
			}
		}
	}

	public static void method16653(int i, int i_184_) {
		anInt10780 = (i - anInt7168) * 1195183291;
		anInt10779 = 465264525 * (i_184_ - anInt7159);
	}

	static void method16654(int i, int i_185_, int i_186_) {
		if (i == 1008)
			Class486.method7941(Class572.aClass572_7683, i_185_, i_186_, -886052652);
		else if (i == 1009)
			Class486.method7941(Class572.aClass572_7676, i_185_, i_186_, -886052652);
		else if (1010 == i)
			Class486.method7941(Class572.aClass572_7663, i_185_, i_186_, -886052652);
		else if (1011 == i)
			Class486.method7941(Class572.aClass572_7664, i_185_, i_186_, -886052652);
		else if (i == 1012)
			Class486.method7941(Class572.aClass572_7665, i_185_, i_186_, -886052652);
	}

	public static Class523_Sub32 method16655() {
		if (aClass708_7194 == null || aClass706_10794 == null)
			return null;
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass706_10794.next(); null != class523_sub32; class523_sub32 = (Class523_Sub32) aClass706_10794.next()) {
			Class239 class239 = ((Class239) aClass53_Sub1_7206.getDefinition((class523_sub32.anInt10578 * -1039292053), (byte) 63));
			if (null != class239 && class239.aBool2442 && class239.method4314(anInterface19_7142, anInterface17_7141, -732518858))
				return class523_sub32;
		}
		return null;
	}

	static boolean method16656(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, int i, int i_187_) {
		if (aBool7170 && !client.aBool11157 && !method8834(class523_sub32.anInt10580 * -1808941705, class523_sub32.anInt10581 * -1727058043))
			return false;
		if (null != class239.anIntArray2425) {
			class239 = class239.method4319(anInterface19_7142, anInterface17_7141, 141722605);
			if (class239 == null)
				return false;
		}
		int i_188_ = 2147483647;
		int i_189_ = -2147483648;
		int i_190_ = 2147483647;
		int i_191_ = -2147483648;
		if (null != class239.anIntArray2445) {
			i_188_ = anInt7200 + ((class239.anInt2427 * 374901433 + class523_sub32.anInt10580 * -1808941705 - anInt7196) * (anInt7202 - anInt7200) / (anInt7198 - anInt7196));
			i_189_ = anInt7200 + ((anInt7202 - anInt7200) * (class523_sub32.anInt10580 * -1808941705 + -892198963 * class239.anInt2401 - anInt7196) / (anInt7198 - anInt7196));
			i_191_ = anInt7203 - ((973938647 * class239.anInt2421 + -1727058043 * class523_sub32.anInt10581 - anInt7167) * (anInt7203 - anInt7201) / (anInt7195 - anInt7167));
			i_190_ = anInt7203 - ((class239.anInt2430 * -1256537267 + class523_sub32.anInt10581 * -1727058043 - anInt7167) * (anInt7203 - anInt7201) / (anInt7195 - anInt7167));
		}
		Class148 class148 = null;
		int i_192_ = 0;
		int i_193_ = 0;
		int i_194_ = 0;
		int i_195_ = 0;
		if (924656729 * class239.anInt2410 != -1) {
			if (class523_sub32.aBool10582 && -1173943061 * class239.anInt2398 != -1)
				class148 = class239.method4315(class178, true, 2036623476);
			else
				class148 = class239.method4315(class178, false, 2043575887);
			if (class148 != null) {
				switch (class239.aClass275_2411.anInt2902 * -399546231) {
				case 2:
					i_192_ = (class523_sub32.anInt10583 * -800911491 - class148.method38());
					i_193_ = -800911491 * class523_sub32.anInt10583;
					break;
				case 0:
					i_192_ = (-800911491 * class523_sub32.anInt10583 - (class148.method38() + 1 >> 1));
					i_193_ = (class523_sub32.anInt10583 * -800911491 + (class148.method38() + 1 >> 1));
					break;
				case 1:
					i_192_ = class523_sub32.anInt10583 * -800911491;
					i_193_ = (-800911491 * class523_sub32.anInt10583 + class148.method38());
					break;
				}
				switch (1995634209 * class239.aClass273_2438.anInt2887) {
				case 0:
					i_194_ = (1992498959 * class523_sub32.anInt10584 - (class148.method2429() + 1 >> 1));
					i_195_ = (class523_sub32.anInt10584 * 1992498959 + (class148.method2429() + 1 >> 1));
					break;
				case 1:
					i_194_ = (class523_sub32.anInt10584 * 1992498959 - class148.method2429());
					i_195_ = 1992498959 * class523_sub32.anInt10584;
					break;
				case 2:
					i_194_ = class523_sub32.anInt10584 * 1992498959;
					i_195_ = (1992498959 * class523_sub32.anInt10584 + class148.method2429());
					break;
				}
				if (i_192_ < i_188_)
					i_188_ = i_192_;
				if (i_193_ > i_189_)
					i_189_ = i_193_;
				if (i_194_ < i_190_)
					i_190_ = i_194_;
				if (i_195_ > i_191_)
					i_191_ = i_195_;
			}
		}
		Class148 class148_196_ = null;
		if (class239.anInt2419 * 1669690785 != -1)
			class148_196_ = class239.method4320(class178, 1243939352);
		int i_197_ = 0;
		int i_198_ = 0;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		int i_202_ = 0;
		int i_203_ = 0;
		int i_204_ = 0;
		if (null != class239.aString2441) {
			Class541.method8990(933897945 * class239.anInt2402, 360739351);
			if (null != Class162.aClass164_1771) {
				i_204_ = Class305.aClass10_3347.method605(class239.aString2441, (2141365743 * Class170.anInt1833), 0, null, 311268838);
				i_199_ = Class305.aClass10_3347.method602(class239.aString2441, (2141365743 * Class170.anInt1833), null, 939052173);
				i_197_ = (-800911491 * class523_sub32.anInt10583 - i_199_ / 2 + ((anInt7202 - anInt7200) * (-1857881741 * class239.anInt2435) / (anInt7198 - anInt7196)));
				i_198_ = (class523_sub32.anInt10584 * 1992498959 - ((anInt7203 - anInt7201) * (class239.anInt2436 * 77210663) / (anInt7195 - anInt7167)));
				if (null == class148)
					i_198_ -= i_204_ / 2;
				else
					i_198_ -= (class148.method2429() >> 1) + i_204_;
				i_200_ = i_197_ + i;
				if (i_200_ < i_188_)
					i_188_ = i_200_;
				i_201_ = i + (i_199_ + i_197_);
				if (i_201_ > i_189_)
					i_189_ = i_201_;
				i_202_ = i_187_ + i_198_;
				if (i_202_ < i_190_)
					i_190_ = i_202_;
				i_203_ = i_187_ + (i_204_ + i_198_);
				if (i_203_ > i_191_)
					i_191_ = i_203_;
			}
		}
		if (i_189_ < anInt7200 || i_188_ > anInt7202 || i_191_ < anInt7201 || i_190_ > anInt7203)
			return true;
		method8913(class178, class523_sub32, class239);
		if (class148 != null) {
			int i_205_ = 0;
			int i_206_ = 0;
			int i_207_ = 0;
			int i_208_ = 0;
			int i_209_ = 0;
			int i_210_ = 0;
			switch (-399546231 * class239.aClass275_2411.anInt2902) {
			case 2:
				i_205_ = class148.method2504();
				i_206_ = (class148.method2504() + 1) / 2;
				i_207_ = class148.method38();
				break;
			case 1:
				i_206_ = -(class148.method2504() + 1) / 2;
				break;
			case 0:
				i_205_ = class148.method2504() / 2;
				i_207_ = class148.method38() >> 1;
				break;
			}
			switch (class239.aClass273_2438.anInt2887 * 1995634209) {
			case 2:
				i_209_ = -(class148.method2504() + 1) / 2;
				break;
			case 1:
				i_208_ = class148.method2504();
				i_209_ = (class148.method2504() + 1) / 2;
				i_210_ = class148.method2429();
				break;
			case 0:
				i_208_ = class148.method2504() / 2;
				i_210_ = class148.method2429() >> 1;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10786.get(Integer.valueOf(-1039292053 * (class523_sub32.anInt10578))));
			if (class25 == null)
				class25 = ((Class25) aHashMap10787.get(Integer.valueOf(class239.anInt2443 * 1444609703)));
			if (class25 != null && 1669690785 * class239.anInt2419 == -1) {
				int i_211_;
				if (class25.anInt245 * 2071802553 > anInt10789 * 1552389189 / 2)
					i_211_ = ((722251963 * anInt10789 - 28673607 * class25.anInt245) / (1552389189 * anInt10789));
				else
					i_211_ = class25.anInt245 * 28673607 / (1552389189 * anInt10789);
				int i_212_ = i_211_ << 24 | 0xffff00;
				if (class178 instanceof Class178_Sub2) {
					class178.method3354((-800911491 * class523_sub32.anInt10583 - i_205_ - 7), (1992498959 * class523_sub32.anInt10584 - i_208_ - 7), class148.method2504() + 14, class148.method2504() + 14, i_212_, (byte) 22);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_205_ - 5), (class523_sub32.anInt10584 * 1992498959 - i_208_ - 5), class148.method2504() + 10, class148.method2504() + 10, i_212_, (byte) 86);
					class178.method3354((-800911491 * class523_sub32.anInt10583 - i_205_ - 3), (1992498959 * class523_sub32.anInt10584 - i_208_ - 3), class148.method2504() + 6, class148.method2504() + 6, i_212_, (byte) 112);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_205_ - 1), (1992498959 * class523_sub32.anInt10584 - i_208_ - 1), class148.method2504() + 2, class148.method2504() + 2, i_212_, (byte) 86);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_205_), (1992498959 * class523_sub32.anInt10584 - i_208_), class148.method2504(), class148.method2504(), i_212_, (byte) 80);
				} else {
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_206_), (class523_sub32.anInt10584 * 1992498959 - i_209_), class148.method2504() / 2 + 7, i_212_, -1421792749);
					class178.method3079((-800911491 * class523_sub32.anInt10583 - i_206_), (0 != (class523_sub32.anInt10584 * 1992498959) - i_209_ - i_209_ ? 1 : 0), class148.method2504() / 2 + 5, i_212_, 1459107263);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_206_), (class523_sub32.anInt10584 * 1992498959 - i_209_ - i_209_) != 0 ? 1 : 0, class148.method2504() / 2 + 3, i_212_, 1871240555);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_206_), 0 != ((1992498959 * class523_sub32.anInt10584) - i_209_ - i_209_) ? 1 : 0, class148.method2504() / 2 + 1, i_212_, 1750345675);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_206_), (0 != (class523_sub32.anInt10584 * 1992498959) - i_209_ - i_209_ ? 1 : 0), class148.method2504() / 2, i_212_, 199897053);
				}
			}
			class148.method2435((-800911491 * class523_sub32.anInt10583 - i_207_), (1992498959 * class523_sub32.anInt10584 - i_210_));
			int i_213_ = 0;
			int i_214_ = 0;
			if (null != class25 && null != class148_196_) {
				switch (-399546231 * class239.aClass275_2411.anInt2902) {
				case 1:
					i_213_ = class148_196_.method38();
					break;
				case 0:
					i_213_ = class148_196_.method38() >> 1;
					break;
				}
				switch (1995634209 * class239.aClass273_2438.anInt2887) {
				case 1:
					i_214_ = (class148_196_.method2429() + class148.method2429()) / 2;
					break;
				case 0:
					i_214_ = (class148_196_.method2429() / 2 + class148.method2429()) / 2;
					break;
				}
				int i_215_;
				if (2071802553 * class25.anInt245 > anInt10789 * 1552389189 / 2)
					i_215_ = ((anInt10789 * 722251963 - class25.anInt245 * 28673607) / (anInt10789 * 1552389189));
				else
					i_215_ = 28673607 * class25.anInt245 / (1552389189 * anInt10789);
				int i_216_ = i_215_ << 24 | 0xffff00;
				class148_196_.method2436(-800911491 * class523_sub32.anInt10583 - i_213_, 1992498959 * class523_sub32.anInt10584 - i_214_, 0, i_216_, 1);
			}
		}
		if (null != class239.aString2441 && null != Class162.aClass164_1771)
			Class291.method5232(class178, class523_sub32, class239, i_197_, i_198_, i_204_, i_199_, -1807183365);
		if (-1 != class239.anInt2410 * 924656729 || class239.aString2441 != null) {
			Class523_Sub16 class523_sub16 = new Class523_Sub16(class523_sub32);
			class523_sub16.anInt10478 = 869645037 * i_192_;
			class523_sub16.anInt10476 = i_193_ * 939278321;
			class523_sub16.anInt10474 = -1186220603 * i_194_;
			class523_sub16.anInt10475 = i_195_ * -1175464923;
			class523_sub16.anInt10477 = -226965029 * i_200_;
			class523_sub16.anInt10480 = i_201_ * 721391071;
			class523_sub16.anInt10473 = i_202_ * -72187705;
			class523_sub16.anInt10479 = i_203_ * 481175931;
			Class629.aClass708_8229.method14236(class523_sub16, 345065348);
		}
		return false;
	}

	static void method16657(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, int i_229_, boolean bool, int i_230_, byte i_231_) {
		if (i_217_ != 0 && i_219_ != -1) {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = null;
			if (i_217_ < 0) {
				int i_232_ = -i_217_ - 1;
				if (1109726117 * client.anInt11154 == i_232_)
					class647_sub1_sub3_sub1 = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453;
				else
					class647_sub1_sub3_sub1 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_232_]);
			} else {
				int i_233_ = i_217_ - 1;
				Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_233_));
				if (class523_sub28 != null)
					class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554);
			}
			if (class647_sub1_sub3_sub1 != null) {
				Class588 class588 = class647_sub1_sub3_sub1.method18352(1223454792);
				if (null != class588.anIntArrayArray7776 && class588.anIntArrayArray7776[i_219_] != null)
					i_220_ -= class588.anIntArrayArray7776[i_219_][1];
				if (null != class588.anIntArrayArray7768 && class588.anIntArrayArray7768[i_219_] != null)
					i_220_ -= class588.anIntArrayArray7768[i_219_][1];
			}
		}
		Class647_Sub1_Sub3_Sub6 class647_sub1_sub3_sub6 = new Class647_Sub1_Sub3_Sub6(client.aClass505_11019.method8241((byte) -36), i, 1369556809 * Class601.anInt7851, 1369556809 * Class601.anInt7851, i_222_, i_223_, i_220_, client.anInt11011 + i_226_, i_227_ + client.anInt11011, i_228_, i_229_, i_217_, i_218_, i_221_, bool, i_219_, i_230_);
		class647_sub1_sub3_sub6.method18596(i_224_, i_225_, Class53_Sub17.method17220(i_224_, i_225_, Class601.anInt7851 * 1369556809, -1524937762) - i_221_, i_226_ + client.anInt11011, -1547264058);
		client.aClass708_11074.method14236(new Class523_Sub27_Sub5(class647_sub1_sub3_sub6), -1673311853);
	}
}
