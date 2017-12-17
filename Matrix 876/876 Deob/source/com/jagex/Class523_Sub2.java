/* Class523_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class523_Sub2 extends Class523 {
	static long aLong10346;
	int anInt10347;
	public int anInt10348;
	int anInt10349;
	int anInt10350;
	public int anInt10351;
	int anInt10352;
	public int anInt10353;
	int anInt10354;
	public int anInt10355;
	Class591 aClass591_10356;
	boolean aBool10357 = true;
	boolean aBool10358 = false;
	public static Class708 aClass708_10359 = new Class708();
	public static Class708 aClass708_10360 = new Class708();
	int anInt10361;
	static Class523_Sub27_Sub17 aClass523_Sub27_Sub17_10362;

	public static void method15878(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_6_ = (Class523_Sub2) aClass708_10359.method14240(733675961); null != class523_sub2_6_; class523_sub2_6_ = (Class523_Sub2) aClass708_10359.method14244((byte) -112)) {
			if (class523_sub2_6_.anInt10354 * 1338368275 == i && 1813697231 * class523_sub2_6_.anInt10348 == i_0_ && i_1_ == class523_sub2_6_.anInt10355 * 1818669861 && i_2_ == 876815205 * class523_sub2_6_.anInt10349) {
				class523_sub2 = class523_sub2_6_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = i * 703926555;
			class523_sub2.anInt10349 = i_2_ * 437147245;
			class523_sub2.anInt10348 = -923077585 * i_0_;
			class523_sub2.anInt10355 = -631623507 * i_1_;
			if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass505_11019.method8292((byte) 40) && i_1_ < client.aClass505_11019.method8235(2126644807))
				Class283.method5134(class523_sub2, -1037470332);
			aClass708_10359.method14236(class523_sub2, -600292259);
		}
		class523_sub2.anInt10353 = i_3_ * 601144019;
		class523_sub2.anInt10361 = i_4_ * -2098934699;
		class523_sub2.anInt10351 = -1429047441 * i_5_;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	static {
		aLong10346 = 8328416790296561543L;
	}

	static void method15879(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, Class591 class591) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_12_ = (Class523_Sub2) aClass708_10360.method14240(1227573916); null != class523_sub2_12_; class523_sub2_12_ = (Class523_Sub2) aClass708_10360.method14244((byte) 53)) {
			if (i == 1338368275 * class523_sub2_12_.anInt10354 && i_7_ == 1813697231 * class523_sub2_12_.anInt10348 && i_8_ == class523_sub2_12_.anInt10355 * 1818669861 && class523_sub2_12_.anInt10349 * 876815205 == i_9_) {
				class523_sub2 = class523_sub2_12_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = 703926555 * i;
			class523_sub2.anInt10349 = 437147245 * i_9_;
			class523_sub2.anInt10348 = i_7_ * -923077585;
			class523_sub2.anInt10355 = -631623507 * i_8_;
			aClass708_10360.method14236(class523_sub2, -1361471923);
		}
		class523_sub2.anInt10353 = 601144019 * i_10_;
		class523_sub2.anInt10361 = i_11_ * -2098934699;
		class523_sub2.aClass591_10356 = class591;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	static final void method15880(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		if (i_14_ >= 1 && i_15_ >= 1 && i_14_ <= client.aClass505_11019.method8292((byte) 42) - 2 && i_15_ <= client.aClass505_11019.method8235(2089703677) - 2) {
			int i_21_ = i;
			if (i_21_ < 3 && client.aClass505_11019.method8243(1366595522).method7282(i_14_, i_15_, -638715901))
				i_21_++;
			if (client.aClass505_11019.method8241((byte) -30) != null) {
				client.aClass505_11019.method8249(-1092940711).method15801(Class31.aClass178_303, i, i_13_, i_14_, i_15_, (byte) 106);
				if (i_16_ >= 0) {
					int i_22_ = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-563556127);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, 1, 2127444500);
					client.aClass505_11019.method8249(-95699195).method15798(Class31.aClass178_303, i_21_, i, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, 340487894);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, i_22_, 71600543);
				}
				Class71.method1489((Class241.player.aByte10821), -914151512);
			}
		}
	}

	public static final void method15881() {
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10359.method14240(1072382182); class523_sub2 != null; class523_sub2 = (Class523_Sub2) aClass708_10359.method14244((byte) -36)) {
			if (!class523_sub2.aBool10358) {
				class523_sub2.aBool10357 = true;
				if (class523_sub2.anInt10348 * 1813697231 >= 0 && class523_sub2.anInt10355 * 1818669861 >= 0 && (1813697231 * class523_sub2.anInt10348 < client.aClass505_11019.method8292((byte) 36)) && (class523_sub2.anInt10355 * 1818669861 < client.aClass505_11019.method8235(2083252078)))
					Class283.method5134(class523_sub2, 848843123);
			} else
				class523_sub2.method8661(607052656);
		}
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10360.method14240(1514472316); null != class523_sub2; class523_sub2 = (Class523_Sub2) aClass708_10360.method14244((byte) -14)) {
			if (!class523_sub2.aBool10358)
				class523_sub2.aBool10357 = true;
			else
				class523_sub2.method8661(607052656);
		}
	}

	static void method15882(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, Class591 class591) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_28_ = (Class523_Sub2) aClass708_10360.method14240(959360182); null != class523_sub2_28_; class523_sub2_28_ = (Class523_Sub2) aClass708_10360.method14244((byte) 3)) {
			if (i == 1338368275 * class523_sub2_28_.anInt10354 && i_23_ == 1813697231 * class523_sub2_28_.anInt10348 && i_24_ == class523_sub2_28_.anInt10355 * 1818669861 && class523_sub2_28_.anInt10349 * 876815205 == i_25_) {
				class523_sub2 = class523_sub2_28_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = 703926555 * i;
			class523_sub2.anInt10349 = 437147245 * i_25_;
			class523_sub2.anInt10348 = i_23_ * -923077585;
			class523_sub2.anInt10355 = -631623507 * i_24_;
			aClass708_10360.method14236(class523_sub2, 171297410);
		}
		class523_sub2.anInt10353 = 601144019 * i_26_;
		class523_sub2.anInt10361 = i_27_ * -2098934699;
		class523_sub2.aClass591_10356 = class591;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	public static final void method15883() {
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10359.method14240(780377514); class523_sub2 != null; class523_sub2 = (Class523_Sub2) aClass708_10359.method14244((byte) 36)) {
			if (!class523_sub2.aBool10358) {
				class523_sub2.aBool10357 = true;
				if (class523_sub2.anInt10348 * 1813697231 >= 0 && class523_sub2.anInt10355 * 1818669861 >= 0 && (1813697231 * class523_sub2.anInt10348 < client.aClass505_11019.method8292((byte) 60)) && (class523_sub2.anInt10355 * 1818669861 < client.aClass505_11019.method8235(2099208107)))
					Class283.method5134(class523_sub2, 1007278085);
			} else
				class523_sub2.method8661(607052656);
		}
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10360.method14240(1951123529); null != class523_sub2; class523_sub2 = (Class523_Sub2) aClass708_10360.method14244((byte) -75)) {
			if (!class523_sub2.aBool10358)
				class523_sub2.aBool10357 = true;
			else
				class523_sub2.method8661(607052656);
		}
	}

	static void method15884(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, Class591 class591) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_34_ = (Class523_Sub2) aClass708_10360.method14240(1996282877); null != class523_sub2_34_; class523_sub2_34_ = (Class523_Sub2) aClass708_10360.method14244((byte) -26)) {
			if (i == 1338368275 * class523_sub2_34_.anInt10354 && i_29_ == 1813697231 * class523_sub2_34_.anInt10348 && i_30_ == class523_sub2_34_.anInt10355 * 1818669861 && class523_sub2_34_.anInt10349 * 876815205 == i_31_) {
				class523_sub2 = class523_sub2_34_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = 703926555 * i;
			class523_sub2.anInt10349 = 437147245 * i_31_;
			class523_sub2.anInt10348 = i_29_ * -923077585;
			class523_sub2.anInt10355 = -631623507 * i_30_;
			aClass708_10360.method14236(class523_sub2, 768193298);
		}
		class523_sub2.anInt10353 = 601144019 * i_32_;
		class523_sub2.anInt10361 = i_33_ * -2098934699;
		class523_sub2.aClass591_10356 = class591;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	static void method15885(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, Class591 class591) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_40_ = (Class523_Sub2) aClass708_10360.method14240(598160506); null != class523_sub2_40_; class523_sub2_40_ = (Class523_Sub2) aClass708_10360.method14244((byte) 49)) {
			if (i == 1338368275 * class523_sub2_40_.anInt10354 && i_35_ == 1813697231 * class523_sub2_40_.anInt10348 && i_36_ == class523_sub2_40_.anInt10355 * 1818669861 && class523_sub2_40_.anInt10349 * 876815205 == i_37_) {
				class523_sub2 = class523_sub2_40_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = 703926555 * i;
			class523_sub2.anInt10349 = 437147245 * i_37_;
			class523_sub2.anInt10348 = i_35_ * -923077585;
			class523_sub2.anInt10355 = -631623507 * i_36_;
			aClass708_10360.method14236(class523_sub2, -278619632);
		}
		class523_sub2.anInt10353 = 601144019 * i_38_;
		class523_sub2.anInt10361 = i_39_ * -2098934699;
		class523_sub2.aClass591_10356 = class591;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	public static void method15886(int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_47_ = (Class523_Sub2) aClass708_10359.method14240(2005951070); null != class523_sub2_47_; class523_sub2_47_ = (Class523_Sub2) aClass708_10359.method14244((byte) -65)) {
			if (class523_sub2_47_.anInt10354 * 1338368275 == i && 1813697231 * class523_sub2_47_.anInt10348 == i_41_ && i_42_ == class523_sub2_47_.anInt10355 * 1818669861 && i_43_ == 876815205 * class523_sub2_47_.anInt10349) {
				class523_sub2 = class523_sub2_47_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = i * 703926555;
			class523_sub2.anInt10349 = i_43_ * 437147245;
			class523_sub2.anInt10348 = -923077585 * i_41_;
			class523_sub2.anInt10355 = -631623507 * i_42_;
			if (i_41_ >= 0 && i_42_ >= 0 && i_41_ < client.aClass505_11019.method8292((byte) 115) && i_42_ < client.aClass505_11019.method8235(2120496377))
				Class283.method5134(class523_sub2, 2028957453);
			aClass708_10359.method14236(class523_sub2, 195264952);
		}
		class523_sub2.anInt10353 = i_44_ * 601144019;
		class523_sub2.anInt10361 = i_45_ * -2098934699;
		class523_sub2.anInt10351 = -1429047441 * i_46_;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	static final void method15887() {
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10359.method14240(1911104778); null != class523_sub2; class523_sub2 = (Class523_Sub2) aClass708_10359.method14244((byte) -111))
			Class547.method9093(class523_sub2, false, 1979806663);
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10360.method14240(1875210095); class523_sub2 != null; class523_sub2 = (Class523_Sub2) aClass708_10360.method14244((byte) 31))
			Class547.method9093(class523_sub2, true, 2051879144);
	}

	static void method15888(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, Class591 class591) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_53_ = (Class523_Sub2) aClass708_10360.method14240(2132080314); null != class523_sub2_53_; class523_sub2_53_ = (Class523_Sub2) aClass708_10360.method14244((byte) 7)) {
			if (i == 1338368275 * class523_sub2_53_.anInt10354 && i_48_ == 1813697231 * class523_sub2_53_.anInt10348 && i_49_ == class523_sub2_53_.anInt10355 * 1818669861 && class523_sub2_53_.anInt10349 * 876815205 == i_50_) {
				class523_sub2 = class523_sub2_53_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = 703926555 * i;
			class523_sub2.anInt10349 = 437147245 * i_50_;
			class523_sub2.anInt10348 = i_48_ * -923077585;
			class523_sub2.anInt10355 = -631623507 * i_49_;
			aClass708_10360.method14236(class523_sub2, -746680969);
		}
		class523_sub2.anInt10353 = 601144019 * i_51_;
		class523_sub2.anInt10361 = i_52_ * -2098934699;
		class523_sub2.aClass591_10356 = class591;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	public static final void method15889() {
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10359.method14240(1154203955); class523_sub2 != null; class523_sub2 = (Class523_Sub2) aClass708_10359.method14244((byte) -56)) {
			if (!class523_sub2.aBool10358) {
				class523_sub2.aBool10357 = true;
				if (class523_sub2.anInt10348 * 1813697231 >= 0 && class523_sub2.anInt10355 * 1818669861 >= 0 && (1813697231 * class523_sub2.anInt10348 < client.aClass505_11019.method8292((byte) 49)) && (class523_sub2.anInt10355 * 1818669861 < client.aClass505_11019.method8235(2109193395)))
					Class283.method5134(class523_sub2, -1176873251);
			} else
				class523_sub2.method8661(607052656);
		}
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10360.method14240(1765823576); null != class523_sub2; class523_sub2 = (Class523_Sub2) aClass708_10360.method14244((byte) -5)) {
			if (!class523_sub2.aBool10358)
				class523_sub2.aBool10357 = true;
			else
				class523_sub2.method8661(607052656);
		}
	}

	static final void method15890(Class523_Sub2 class523_sub2) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -53);
		if (class560 != null) {
			Interface61 interface61 = null;
			if (0 == 876815205 * class523_sub2.anInt10349)
				interface61 = (Interface61) (class560.method9280(1338368275 * class523_sub2.anInt10354, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, -869152992));
			if (876815205 * class523_sub2.anInt10349 == 1)
				interface61 = (Interface61) (class560.method9284(class523_sub2.anInt10354 * 1338368275, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, (byte) 50));
			if (2 == class523_sub2.anInt10349 * 876815205)
				interface61 = (Interface61) (class560.method9295(1338368275 * class523_sub2.anInt10354, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, client.anInterface63_11296, (byte) -116));
			if (3 == class523_sub2.anInt10349 * 876815205)
				interface61 = (Interface61) (class560.method9398(class523_sub2.anInt10354 * 1338368275, class523_sub2.anInt10348 * 1813697231, 1818669861 * class523_sub2.anInt10355, -1843747369));
			if (interface61 != null) {
				class523_sub2.anInt10350 = interface61.method401(-770473736) * 2028908239;
				class523_sub2.anInt10352 = interface61.method69(1037597404) * -1703632149;
				class523_sub2.anInt10347 = interface61.method390(1259048815) * 1299442669;
			} else {
				class523_sub2.anInt10350 = -2028908239;
				class523_sub2.anInt10352 = 0;
				class523_sub2.anInt10347 = 0;
			}
		}
	}

	Class523_Sub2() {
		/* empty */
	}

	static final void method15891() {
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10359.method14240(1288710478); null != class523_sub2; class523_sub2 = (Class523_Sub2) aClass708_10359.method14244((byte) 38))
			Class547.method9093(class523_sub2, false, 312138447);
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10360.method14240(1345653710); class523_sub2 != null; class523_sub2 = (Class523_Sub2) aClass708_10360.method14244((byte) -25))
			Class547.method9093(class523_sub2, true, -593775592);
	}

	static final void method15892() {
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10359.method14240(1930238781); null != class523_sub2; class523_sub2 = (Class523_Sub2) aClass708_10359.method14244((byte) -70))
			Class547.method9093(class523_sub2, false, -494843718);
		for (Class523_Sub2 class523_sub2 = (Class523_Sub2) aClass708_10360.method14240(1768964154); class523_sub2 != null; class523_sub2 = (Class523_Sub2) aClass708_10360.method14244((byte) 49))
			Class547.method9093(class523_sub2, true, -484979650);
	}

	static final void method15893(Class523_Sub2 class523_sub2) {
		Class560 class560 = client.aClass505_11019.method8241((byte) -57);
		if (class560 != null) {
			Interface61 interface61 = null;
			if (0 == 876815205 * class523_sub2.anInt10349)
				interface61 = (Interface61) (class560.method9280(1338368275 * class523_sub2.anInt10354, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, -1353374272));
			if (876815205 * class523_sub2.anInt10349 == 1)
				interface61 = (Interface61) (class560.method9284(class523_sub2.anInt10354 * 1338368275, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, (byte) 53));
			if (2 == class523_sub2.anInt10349 * 876815205)
				interface61 = (Interface61) (class560.method9295(1338368275 * class523_sub2.anInt10354, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, client.anInterface63_11296, (byte) -79));
			if (3 == class523_sub2.anInt10349 * 876815205)
				interface61 = (Interface61) (class560.method9398(class523_sub2.anInt10354 * 1338368275, class523_sub2.anInt10348 * 1813697231, 1818669861 * class523_sub2.anInt10355, -2017785540));
			if (interface61 != null) {
				class523_sub2.anInt10350 = interface61.method401(-770473736) * 2028908239;
				class523_sub2.anInt10352 = interface61.method69(1989311679) * -1703632149;
				class523_sub2.anInt10347 = interface61.method390(1259048815) * 1299442669;
			} else {
				class523_sub2.anInt10350 = -2028908239;
				class523_sub2.anInt10352 = 0;
				class523_sub2.anInt10347 = 0;
			}
		}
	}

	static final void method15894(Class523_Sub2 class523_sub2, boolean bool) {
		if (class523_sub2.aBool10358) {
			if (-2043832273 * class523_sub2.anInt10350 < 0 || Class331.method5823(client.aClass505_11019.method8244(1222500062), -2043832273 * class523_sub2.anInt10350, class523_sub2.anInt10352 * 2054682051, (byte) -91)) {
				if (!bool)
					Class461.method7509(class523_sub2.anInt10354 * 1338368275, class523_sub2.anInt10349 * 876815205, class523_sub2.anInt10348 * 1813697231, 1818669861 * class523_sub2.anInt10355, class523_sub2.anInt10350 * -2043832273, -1040635419 * class523_sub2.anInt10347, class523_sub2.anInt10352 * 2054682051, -1, 0, 611330696);
				else
					Class570.method9608(class523_sub2.anInt10354 * 1338368275, 876815205 * class523_sub2.anInt10349, 1813697231 * class523_sub2.anInt10348, 1818669861 * class523_sub2.anInt10355, null, -1596306520);
				class523_sub2.method8661(607052656);
			}
		} else if (class523_sub2.aBool10357 && class523_sub2.anInt10348 * 1813697231 >= 1 && 1818669861 * class523_sub2.anInt10355 >= 1 && (1813697231 * class523_sub2.anInt10348 <= client.aClass505_11019.method8292((byte) 31) - 2) && (1818669861 * class523_sub2.anInt10355 <= client.aClass505_11019.method8235(2059734411) - 2) && (class523_sub2.anInt10353 * 867937627 < 0 || Class331.method5823(client.aClass505_11019.method8244(1909983148), (867937627 * class523_sub2.anInt10353), (862572797 * class523_sub2.anInt10361), (byte) -59))) {
			if (!bool)
				Class461.method7509(1338368275 * class523_sub2.anInt10354, class523_sub2.anInt10349 * 876815205, class523_sub2.anInt10348 * 1813697231, class523_sub2.anInt10355 * 1818669861, class523_sub2.anInt10353 * 867937627, class523_sub2.anInt10351 * -1813461105, 862572797 * class523_sub2.anInt10361, -1, 0, 611330696);
			else
				Class570.method9608(1338368275 * class523_sub2.anInt10354, 876815205 * class523_sub2.anInt10349, class523_sub2.anInt10348 * 1813697231, 1818669861 * class523_sub2.anInt10355, class523_sub2.aClass591_10356, -776869355);
			class523_sub2.aBool10357 = false;
			if (!bool && (867937627 * class523_sub2.anInt10353 == class523_sub2.anInt10350 * -2043832273) && -2043832273 * class523_sub2.anInt10350 == -1)
				class523_sub2.method8661(607052656);
			else if (!bool && (867937627 * class523_sub2.anInt10353 == class523_sub2.anInt10350 * -2043832273) && (-1040635419 * class523_sub2.anInt10347 == -1813461105 * class523_sub2.anInt10351) && (2054682051 * class523_sub2.anInt10352 == 862572797 * class523_sub2.anInt10361))
				class523_sub2.method8661(607052656);
		}
	}

	public static void method15895(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_60_ = (Class523_Sub2) aClass708_10359.method14240(667126152); null != class523_sub2_60_; class523_sub2_60_ = (Class523_Sub2) aClass708_10359.method14244((byte) 32)) {
			if (class523_sub2_60_.anInt10354 * 1338368275 == i && 1813697231 * class523_sub2_60_.anInt10348 == i_54_ && i_55_ == class523_sub2_60_.anInt10355 * 1818669861 && i_56_ == 876815205 * class523_sub2_60_.anInt10349) {
				class523_sub2 = class523_sub2_60_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = i * 703926555;
			class523_sub2.anInt10349 = i_56_ * 437147245;
			class523_sub2.anInt10348 = -923077585 * i_54_;
			class523_sub2.anInt10355 = -631623507 * i_55_;
			if (i_54_ >= 0 && i_55_ >= 0 && i_54_ < client.aClass505_11019.method8292((byte) 110) && i_55_ < client.aClass505_11019.method8235(2079591281))
				Class283.method5134(class523_sub2, -1588067370);
			aClass708_10359.method14236(class523_sub2, 202013238);
		}
		class523_sub2.anInt10353 = i_57_ * 601144019;
		class523_sub2.anInt10361 = i_58_ * -2098934699;
		class523_sub2.anInt10351 = -1429047441 * i_59_;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	static final void method15896(int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_) {
		if (i_62_ >= 1 && i_63_ >= 1 && i_62_ <= client.aClass505_11019.method8292((byte) 74) - 2 && i_63_ <= client.aClass505_11019.method8235(2077153963) - 2) {
			int i_69_ = i;
			if (i_69_ < 3 && client.aClass505_11019.method8243(1415128467).method7282(i_62_, i_63_, -638715901))
				i_69_++;
			if (client.aClass505_11019.method8241((byte) -42) != null) {
				client.aClass505_11019.method8249(-721214599).method15801(Class31.aClass178_303, i, i_61_, i_62_, i_63_, (byte) 106);
				if (i_64_ >= 0) {
					int i_70_ = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-1438877984);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, 1, -33302822);
					client.aClass505_11019.method8249(230676116).method15798(Class31.aClass178_303, i_69_, i, i_62_, i_63_, i_64_, i_65_, i_66_, i_67_, i_68_, -3915819);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, i_70_, -1175793349);
				}
				Class71.method1489((Class241.player.aByte10821), 1288836352);
			}
		}
	}

	static final void method15897(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
		if (i_72_ >= 1 && i_73_ >= 1 && i_72_ <= client.aClass505_11019.method8292((byte) 85) - 2 && i_73_ <= client.aClass505_11019.method8235(2059080867) - 2) {
			int i_79_ = i;
			if (i_79_ < 3 && client.aClass505_11019.method8243(-2002058327).method7282(i_72_, i_73_, -638715901))
				i_79_++;
			if (client.aClass505_11019.method8241((byte) -37) != null) {
				client.aClass505_11019.method8249(18785011).method15801(Class31.aClass178_303, i, i_71_, i_72_, i_73_, (byte) 126);
				if (i_74_ >= 0) {
					int i_80_ = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-1875589002);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, 1, -854249831);
					client.aClass505_11019.method8249(1388089959).method15798(Class31.aClass178_303, i_79_, i, i_72_, i_73_, i_74_, i_75_, i_76_, i_77_, i_78_, 1547031492);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, i_80_, -968565831);
				}
				Class71.method1489((Class241.player.aByte10821), 1502268019);
			}
		}
	}

	static final void method15898(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		if (i_82_ >= 1 && i_83_ >= 1 && i_82_ <= client.aClass505_11019.method8292((byte) 7) - 2 && i_83_ <= client.aClass505_11019.method8235(2051205549) - 2) {
			int i_89_ = i;
			if (i_89_ < 3 && client.aClass505_11019.method8243(591658235).method7282(i_82_, i_83_, -638715901))
				i_89_++;
			if (client.aClass505_11019.method8241((byte) -52) != null) {
				client.aClass505_11019.method8249(-1378971928).method15801(Class31.aClass178_303, i, i_81_, i_82_, i_83_, (byte) 117);
				if (i_84_ >= 0) {
					int i_90_ = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-479554101);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, 1, 1035613068);
					client.aClass505_11019.method8249(1577846964).method15798(Class31.aClass178_303, i_89_, i, i_82_, i_83_, i_84_, i_85_, i_86_, i_87_, i_88_, 789261581);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub20_10616, i_90_, 1113530439);
				}
				Class71.method1489((Class241.player.aByte10821), 862571543);
			}
		}
	}

	static final void method15899(int i, int i_91_, int i_92_, int i_93_, Class591 class591) {
		if (i_92_ >= 1 && i_93_ >= 1 && i_92_ <= client.aClass505_11019.method8292((byte) 50) - 2 && i_93_ <= client.aClass505_11019.method8235(2054511605) - 2) {
			if (client.aClass505_11019.method8241((byte) -96) != null) {
				Interface61 interface61 = client.aClass505_11019.method8249(509222950).method15802(i, i_91_, i_92_, i_93_, 895537517);
				if (null != interface61) {
					if (interface61 instanceof Class647_Sub1_Sub3_Sub2)
						((Class647_Sub1_Sub3_Sub2) interface61).method18427(class591, -1240201112);
					else if (interface61 instanceof Class647_Sub1_Sub2_Sub1)
						((Class647_Sub1_Sub2_Sub1) interface61).method18433(class591, 1357652815);
					else if (interface61 instanceof Class647_Sub1_Sub4_Sub2)
						((Class647_Sub1_Sub4_Sub2) interface61).method18470(class591, (short) -20312);
					else if (interface61 instanceof Class647_Sub1_Sub1_Sub2)
						((Class647_Sub1_Sub1_Sub2) interface61).method18460(class591, 2064027717);
				}
			}
		}
	}

	static Class275[] method15900(byte i) {
		return (new Class275[] { Class275.aClass275_2900, Class275.aClass275_2899, Class275.aClass275_2903 });
	}
}
