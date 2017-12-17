/* Class702 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class702 {
	boolean aBool8784;
	int anInt8785;
	boolean aBool8786;
	boolean aBool8787;
	int anInt8788;

	public boolean method14111(byte i) {
		return aBool8786;
	}

	public int method14112(int i) {
		return anInt8788 * -2134202569;
	}

	public int method14113() {
		return 1605171635 * anInt8785;
	}

	public int method14114() {
		return anInt8788 * -2134202569;
	}

	public boolean method14115(int i) {
		return aBool8784;
	}

	public boolean method14116(int i) {
		return aBool8787;
	}

	public boolean method14117() {
		return aBool8786;
	}

	public int method14118() {
		return anInt8788 * -2134202569;
	}

	public boolean method14119() {
		return aBool8784;
	}

	public boolean method14120() {
		return aBool8786;
	}

	public boolean method14121() {
		return aBool8786;
	}

	public int method14122(short i) {
		return 1605171635 * anInt8785;
	}

	public boolean method14123() {
		return aBool8787;
	}

	Class702(int i, int i_0_, boolean bool, boolean bool_1_, boolean bool_2_) {
		anInt8788 = 1890696839 * i;
		anInt8785 = 1461345659 * i_0_;
		aBool8786 = bool;
		aBool8784 = bool_1_;
		aBool8787 = bool_2_;
	}

	public boolean method14124() {
		return aBool8787;
	}

	static final void method14125(int i, int i_3_, int i_4_, int i_5_, boolean bool, short i_6_) {
		if (client.aClass505_11019.method8241((byte) -115) == null)
			Class31.aClass178_303.method3354(i, i_3_, i_4_, i_5_, -16777216, (byte) 126);
		else {
			Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
			boolean bool_7_ = false;
			if (client.anInt11071 * -1616721887 != 3) {
				if (!client.aBool11072)
					bool_7_ = true;
			} else {
				if ((int) class437.aFloat4903 < 0 || ((int) class437.aFloat4903 >= client.aClass505_11019.method8292((byte) 126) * 512) || (int) class437.aFloat4905 < 0 || ((int) class437.aFloat4905 >= (client.aClass505_11019.method8235(2123584761) * 512)))
					bool_7_ = true;
				if (Class562.anInt7564 * 2097396553 == 2 && !Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5335(-231586787))
					bool_7_ = true;
			}
			if (bool_7_)
				Class31.aClass178_303.method3354(i, i_3_, i_4_, i_5_, -16777216, (byte) 33);
			else {
				client.anInt10981 += 916502083;
				if (null != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 && ((int) class437.aFloat4903 - (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2142197017) - 1) * 256) >> 9 == Class104.anInt1269 * -69669203 && (((int) class437.aFloat4905 - (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2146734627) - 1) * 256) >> 9 == 274896403 * Class104.anInt1270)) {
					Class104.anInt1269 = 250567387;
					Class104.anInt1270 = 1284332517;
					Class84.method1597(-967202132);
				}
				Class105.method1884(520285093);
				if (!bool)
					Class196.method3668((byte) -44);
				Class504.method8224(1594818656);
				for (int i_8_ = 0; i_8_ < client.aClass540Array11018.length; i_8_++) {
					if (client.aClass540Array11018[i_8_] != null && !client.aClass540Array11018[i_8_].method8960((byte) -27) && client.aClass540Array11018[i_8_].method8965(Class31.aClass178_303, 1828648717))
						client.aClass540Array11018[i_8_].method8963(client.aClass505_11019.method8241((byte) -116), (byte) 14);
				}
				Class470.method7633(i, i_3_, i_4_, i_5_, true, 1775229050);
				i = -1518026941 * client.anInt11282;
				i_3_ = client.anInt11262 * -426061495;
				i_4_ = client.anInt11319 * 77213907;
				i_5_ = client.anInt11285 * -1076969043;
				Class250.method4519(i, i_3_, (byte) -59);
				if (Class562.anInt7564 * 2097396553 == 1) {
					int i_9_ = (int) client.aFloat11214;
					if (1020478063 * client.anInt11199 >> 8 > i_9_)
						i_9_ = client.anInt11199 * 1020478063 >> 8;
					if (client.aBoolArray11269[4] && client.anIntArray11271[4] + 128 > i_9_)
						i_9_ = client.anIntArray11271[4] + 128;
					int i_10_ = ((client.anInt11091 * -2135173819 + (int) client.aFloat11129) & 0x3fff);
					Class597.method9847(Class21.anInt215 * 1996014845, (Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, (-860310981 * Class222.anInt2334), -911875142) - client.anInt11110 * 1912232329), Class194_Sub8.anInt9906 * 1035887883, i_9_, i_10_, 600 + 3 * (i_9_ >> 3) << 2, i_5_, -256596868);
				} else if (6 == 2097396553 * Class562.anInt7564) {
					int i_11_ = (int) client.aFloat11214;
					if (1020478063 * client.anInt11199 >> 8 > i_11_)
						i_11_ = client.anInt11199 * 1020478063 >> 8;
					if (client.aBoolArray11269[4] && client.anIntArray11271[4] + 128 > i_11_)
						i_11_ = 128 + client.anIntArray11271[4];
					int i_12_ = (int) client.aFloat11129 & 0x3fff;
					Class597.method9847(Class21.anInt215 * 1996014845, ((Class53_Sub17.method17220(-1500086291 * client.anInt11283, 670449253 * client.anInt11102, -860310981 * Class222.anInt2334, 543028506)) - client.anInt11110 * 1912232329), Class194_Sub8.anInt9906 * 1035887883, i_11_, i_12_, 600 + 3 * (i_11_ >> 3) << 2, i_5_, -1014435888);
				} else if (Class562.anInt7564 * 2097396553 == 5)
					Class194_Sub15.method15518(i_5_, (byte) 0);
				int i_13_ = Class77.anInt858 * 760427037;
				int i_14_ = 805779207 * Class285.anInt3085;
				int i_15_ = -1221225203 * Class497.anInt5563;
				int i_16_ = 1555328683 * Class678.anInt8639;
				int i_17_ = 325333285 * Class424.anInt4817;
				for (int i_18_ = 0; i_18_ < 5; i_18_++) {
					if (client.aBoolArray11269[i_18_]) {
						int i_19_ = (int) ((Math.random() * (double) ((client.anIntArray10998[i_18_]) * 2 + 1)) - (double) client.anIntArray10998[i_18_] + (Math.sin((double) (client.anIntArray11273[i_18_]) * ((double) (client.anIntArray11203[i_18_]) / 100.0)) * (double) (client.anIntArray11271[i_18_])));
						if (i_18_ == 0)
							Class77.anInt858 += -568385483 * (i_19_ << 2);
						if (i_18_ == 1)
							Class285.anInt3085 += 1059489463 * (i_19_ << 2);
						if (2 == i_18_)
							Class497.anInt5563 += -1449377339 * (i_19_ << 2);
						if (i_18_ == 3)
							Class424.anInt4817 = (325333285 * Class424.anInt4817 + i_19_ & 0x3fff) * -1709276499;
						if (4 == i_18_) {
							Class678.anInt8639 += 1767382019 * i_19_;
							if (1555328683 * Class678.anInt8639 < 1024)
								Class678.anInt8639 = 1617955840;
							else if (Class678.anInt8639 * 1555328683 > 3072)
								Class678.anInt8639 = 558900224;
						}
					}
				}
				if (760427037 * Class77.anInt858 < 0)
					Class77.anInt858 = 0;
				if (760427037 * Class77.anInt858 > ((client.aClass505_11019.method8241((byte) -54).anInt7546 * -957102653) << 9) - 1)
					Class77.anInt858 = (((client.aClass505_11019.method8241((byte) -50).anInt7546) * -957102653 << 9) - 1) * -568385483;
				if (-1221225203 * Class497.anInt5563 < 0)
					Class497.anInt5563 = 0;
				if (Class497.anInt5563 * -1221225203 > ((client.aClass505_11019.method8241((byte) -101).anInt7507) * -34274863 << 9) - 1)
					Class497.anInt5563 = (((client.aClass505_11019.method8241((byte) -4).anInt7507) * -34274863 << 9) - 1) * -1449377339;
				if (Class449.aClass523_Sub33_4946.aClass687_Sub19_10634.method16906(-2142910201) == 2)
					Class426.method6748(-1626809640);
				else if (Class449.aClass523_Sub33_4946.aClass687_Sub19_10634.method16906(-2070639143) == 3)
					Class160.method2579(1907326441);
				Class31.aClass178_303.method3208(i, i_3_, i_4_, i_5_);
				Class31.aClass178_303.method3074(true);
				Class31.aClass178_303.method3378(i, i_3_, i + i_4_, i_3_ + i_5_);
				Class632 class632 = client.aClass505_11019.method8271((byte) 8).method10238((byte) 114);
				int i_20_ = class632.method10346(-1345201611);
				Class307 class307 = new Class307();
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				if (Class274.method5030(-691979946))
					Class27.aClass298_Sub1_257.method5355(class307, client.aClass435_11005, client.aClass441_11004, class592.localX * 235453015 << 9, 1704054549 * class592.localY << 9, -1313768227);
				else if (2 == Class562.anInt7564 * 2097396553)
					Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5355(class307, client.aClass435_11005, client.aClass441_11004, 235453015 * class592.localX << 9, class592.localY * 1704054549 << 9, -890767028);
				else {
					client.aClass435_11005.method6817((float) -(Class77.anInt858 * 760427037), (float) -(Class285.anInt3085 * 805779207), (float) -(Class497.anInt5563 * -1221225203));
					client.aClass435_11005.method6814(0.0F, -1.0F, 0.0F, Class433.method6799(-(325333285 * Class424.anInt4817) & 0x3fff));
					client.aClass435_11005.method6814(-1.0F, 0.0F, 0.0F, Class433.method6799(-(1555328683 * Class678.anInt8639) & 0x3fff));
					client.aClass435_11005.method6814(0.0F, 0.0F, -1.0F, Class433.method6799(-(Class248.anInt2491 * 2069375919) & 0x3fff));
					Class470.method7635(client.aClass441_11004, true, (float) (i_4_ / 2), (float) (i_5_ / 2), (float) (-1438988655 * client.anInt11286 << 1), (float) (client.anInt11286 * -1438988655 << 1), i_4_, i_5_, -1575505843);
				}
				Class31.aClass178_303.method3300(client.aClass435_11005);
				Class31.aClass178_303.method3124(client.aClass441_11004);
				if (class632.method10368(-1674001807) != null) {
					Class31.aClass178_303.method3126(1.0F);
					Class31.aClass178_303.method3460(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					if (2097396553 * Class562.anInt7564 == 2) {
						int i_21_ = (int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5347(-954226547) * 2607.5945876176133);
						int i_22_ = (int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-651154981) * 2607.5945876176133);
						class632.method10368(273943092).method8214(Class31.aClass178_303, 1926301335 * Class64.anInt790 << 3, i, i_3_, i_4_, i_5_, i_21_, i_22_, 0, i_20_, true, false, 2080451815);
					} else
						class632.method10368(1219256633).method8214(Class31.aClass178_303, 1926301335 * Class64.anInt790 << 3, i, i_3_, i_4_, i_5_, 1555328683 * Class678.anInt8639, Class424.anInt4817 * 325333285, 2069375919 * Class248.anInt2491, i_20_, true, false, 2093179052);
					Class31.aClass178_303.method3206();
				} else
					Class31.aClass178_303.method3076(3, i_20_);
				Class31.aClass178_303.method3074(false);
				Class291.method5227(client.aClass435_11005, client.aClass441_11004, i_4_, i_5_, (byte) -82);
				client.aClass505_11019.method8271((byte) 8).method10234(client.aClass505_11019, 1980276493);
				int i_23_ = Class449.aClass523_Sub33_4946.aClass687_Sub19_10634.method16906(-2059230276);
				byte i_24_;
				if (i_23_ == 2)
					i_24_ = (byte) (-487274901 * client.anInt10981);
				else if (3 == i_23_)
					i_24_ = (byte) (client.aBool11150 ? 1 : -1);
				else
					i_24_ = (byte) 1;
				if (Class274.method5030(463746539) || 2097396553 * Class562.anInt7564 == 2)
					client.aClass505_11019.method8241((byte) -21).method9273(client.anInt11011, 887340707 * class307.anInt3352, class307.anInt3353 * 1516838213, 1459940421 * class307.anInt3351, client.aClass505_11019.method8247(2003682856), client.anIntArray11141, client.anIntArray11261, client.anIntArray11119, client.anIntArray11144, client.anIntArray11145, 1 + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821), i_24_, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, Class449.aClass523_Sub33_4946.aClass687_Sub13_10613.method16853(-2046412852) == 0, true, 0, true);
				else
					client.aClass505_11019.method8241((byte) -53).method9273(client.anInt11011, 760427037 * Class77.anInt858, Class285.anInt3085 * 805779207, -1221225203 * Class497.anInt5563, client.aClass505_11019.method8247(-49514150), client.anIntArray11141, client.anIntArray11261, client.anIntArray11119, client.anIntArray11144, client.anIntArray11145, (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) + 1, i_24_, (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, Class449.aClass523_Sub33_4946.aClass687_Sub13_10613.method16853(2013608286) == 0, true, 0, true);
				client.anInt11025 += 2019129195;
				if (!Class31.aClass178_303.method3138() && 9 == -2020118759 * client.anInt11136)
					Class626.method10232(i, i_3_, i_4_, i_5_, -195677182);
				client.aClass505_11019.method8241((byte) -112).method9336(-335922883);
				Class77.anInt858 = -568385483 * i_13_;
				Class285.anInt3085 = 1059489463 * i_14_;
				Class497.anInt5563 = i_15_ * -1449377339;
				Class678.anInt8639 = 1767382019 * i_16_;
				Class424.anInt4817 = i_17_ * -1709276499;
				if (client.aBool11009 && Class572.aClass458_7684.method7453((byte) 127) == 0)
					client.aBool11009 = false;
				if (client.aBool11009) {
					Class31.aClass178_303.method3354(i, i_3_, i_4_, i_5_, -16777216, (byte) 122);
					Class397.method6524(Class39.aClass39_474.method1124((Class53_Sub20.aClass668_10979), (byte) -82), false, Class31.aClass178_303, Class10.aClass164_83, Class46.aClass10_672, -1918216452);
				}
				Class470.method7635(client.aClass441_11004, false, (float) (i + i_4_ / 2), (float) (i_5_ / 2 + i_3_), (float) (client.anInt11286 * -1438988655 << 1), (float) (-1438988655 * client.anInt11286 << 1), i_4_, i_5_, 1490326491);
				Class31.aClass178_303.method3124(client.aClass441_11004);
				Class160.method2573(client.aClass441_11004, 1292118931);
			}
		}
	}

	static final void method14126(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		if (!Class69.method1464(i, null, -751639460)) {
			if (i_31_ != -1)
				client.aBoolArray11246[i_31_] = true;
			else {
				for (int i_33_ = 0; i_33_ < 106; i_33_++)
					client.aBoolArray11246[i_33_] = true;
			}
		} else
			Class642.method10536(Class31.aClass242Array302[i].method4365((byte) -46), -1, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_31_ < 0, (byte) -95);
	}
}
