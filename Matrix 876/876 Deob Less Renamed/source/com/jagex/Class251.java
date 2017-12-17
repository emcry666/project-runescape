/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class251 implements Interface75 {
	static Class251 aClass251_2710 = new Class251(0, 0);
	static Class251 aClass251_2711 = new Class251(2, 1);
	static Class251 aClass251_2712 = new Class251(3, 2);
	int anInt2713;
	int anInt2714;
	static Class251 aClass251_2715 = new Class251(1, 3);
	static Class472 aClass472_2716;
	static Class523_Sub34 aClass523_Sub34_2717;

	static Class251[] method4522() {
		return new Class251[] { aClass251_2710, aClass251_2715, aClass251_2711, aClass251_2712 };
	}

	Class251(int i, int i_0_) {
		anInt2713 = 865135057 * i;
		anInt2714 = i_0_ * -1104824313;
	}

	public int method82() {
		return 1083192759 * anInt2714;
	}

	public int method6() {
		return 1083192759 * anInt2714;
	}

	static Class251[] method4523(byte i) {
		return new Class251[] { aClass251_2710, aClass251_2715, aClass251_2711, aClass251_2712 };
	}

	public int method101() {
		return 1083192759 * anInt2714;
	}

	static final void method4524(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class464.method7543(class250, class242, class669, (byte) -1);
	}

	static final void method4525(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class206.method3737(class250, class242, class669, (byte) 0);
	}

	static final void method4526(int i, byte i_1_) {
		client.anIntArray11141 = new int[i];
		client.anIntArray11261 = new int[i];
		client.anIntArray11119 = new int[i];
		client.anIntArray11144 = new int[i];
		client.anIntArray11145 = new int[i];
	}

	public static void method4527(int i, int i_2_, int i_3_, int i_4_) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_5_ = class592.localX * 235453015 + i_2_;
		int i_6_ = class592.localY * 1704054549 + i_3_;
		if (client.aClass505_11019.method8241((byte) -92) != null && (client.aClass505_11019.method8276(1856797184) != Class500.aClass500_5569) && i_2_ >= 0 && i_3_ >= 0 && i_2_ < client.aClass505_11019.method8292((byte) 88) && i_3_ < client.aClass505_11019.method8235(2077201672)) {
			long l = (long) (i << 28 | i_6_ << 14 | i_5_);
			Class523_Sub10 class523_sub10 = (Class523_Sub10) client.aClass14_11172.method741(l);
			if (class523_sub10 == null)
				client.aClass505_11019.method8241((byte) -30).method9327(i, i_2_, i_3_, 545257766);
			else {
				Class523_Sub25 class523_sub25 = ((Class523_Sub25) class523_sub10.aClass708_10417.method14240(2045181431));
				if (class523_sub25 == null)
					client.aClass505_11019.method8241((byte) -102).method9327(i, i_2_, i_3_, 1340148711);
				else {
					int i_7_ = -1;
					int i_8_ = -1;
					int i_9_ = -1;
					Class435 class435 = null;
					Class435 class435_10_ = null;
					Class435 class435_11_ = null;
					Class647_Sub1_Sub5_Sub1 class647_sub1_sub5_sub1 = ((Class647_Sub1_Sub5_Sub1) client.aClass505_11019.method8241((byte) -81).method9327(i, i_2_, i_3_, -1123649370));
					if (class647_sub1_sub5_sub1 == null)
						class647_sub1_sub5_sub1 = (new Class647_Sub1_Sub5_Sub1(client.aClass505_11019.method8241((byte) -86), i_2_ << 9, client.aClass505_11019.method8241((byte) -67).aClass142Array7509[i].method2321(i_2_, i_3_, 1785974500), i_3_ << 9, i, i));
					else {
						i_7_ = 742080807 * class647_sub1_sub5_sub1.anInt12117;
						i_8_ = -794103481 * class647_sub1_sub5_sub1.anInt12119;
						i_9_ = class647_sub1_sub5_sub1.anInt12121 * 1382885407;
						class435 = class647_sub1_sub5_sub1.aClass435_12116;
						class435_10_ = class647_sub1_sub5_sub1.aClass435_12124;
						class435_11_ = class647_sub1_sub5_sub1.aClass435_12123;
						Class647_Sub1_Sub5_Sub1 class647_sub1_sub5_sub1_12_ = class647_sub1_sub5_sub1;
						class647_sub1_sub5_sub1.anInt12121 = -1947751391;
						class647_sub1_sub5_sub1_12_.anInt12119 = -1205037175;
						class647_sub1_sub5_sub1.aClass560_10822 = client.aClass505_11019.method8241((byte) -94);
					}
					class647_sub1_sub5_sub1.anInt12117 = -304988145 * class523_sub25.anInt10544;
					class647_sub1_sub5_sub1.anInt12132 = 618917619 * class523_sub25.anInt10543;
					while_172_: do {
						Class523_Sub25 class523_sub25_13_;
						do {
							class523_sub25_13_ = ((Class523_Sub25) class523_sub10.aClass708_10417.method14244((byte) -92));
							if (class523_sub25_13_ == null)
								break while_172_;
						} while (class647_sub1_sub5_sub1.anInt12117 * 742080807 == (-188706487 * class523_sub25_13_.anInt10544));
						class647_sub1_sub5_sub1.anInt12119 = class523_sub25_13_.anInt10544 * -21745425;
						class647_sub1_sub5_sub1.anInt12120 = class523_sub25_13_.anInt10543 * -1866536315;
						for (;;) {
							Class523_Sub25 class523_sub25_14_ = ((Class523_Sub25) class523_sub10.aClass708_10417.method14244((byte) -41));
							if (class523_sub25_14_ == null)
								break;
							if ((-188706487 * class523_sub25_14_.anInt10544 != (class647_sub1_sub5_sub1.anInt12117 * 742080807)) && ((class647_sub1_sub5_sub1.anInt12119 * -794103481) != (class523_sub25_14_.anInt10544 * -188706487))) {
								class647_sub1_sub5_sub1.anInt12121 = (class523_sub25_14_.anInt10544 * 1437677975);
								class647_sub1_sub5_sub1.anInt12122 = (-1285670559 * class523_sub25_14_.anInt10543);
							}
						}
					} while (false);
					int i_15_ = Class53_Sub17.method17220((i_2_ << 9) + 256, 256 + (i_3_ << 9), i, -565060770);
					class647_sub1_sub5_sub1.method10574((float) (i_2_ << 9), (float) i_15_, (float) (i_3_ << 9));
					if (742080807 * class647_sub1_sub5_sub1.anInt12117 != i_7_) {
						if (class647_sub1_sub5_sub1.anInt12117 * 742080807 == i_8_)
							class647_sub1_sub5_sub1.aClass435_12116 = class435_10_;
						else if (class647_sub1_sub5_sub1.anInt12117 * 742080807 == i_9_)
							class647_sub1_sub5_sub1.aClass435_12116 = class435_11_;
						else if (((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((class647_sub1_sub5_sub1.anInt12117 * 742080807), (byte) 6))).aBool170)
							class647_sub1_sub5_sub1.aClass435_12116 = Class523_Sub27_Sub2.method17740(-708153653);
						else
							class647_sub1_sub5_sub1.aClass435_12116 = null;
					}
					if (-1 == class647_sub1_sub5_sub1.anInt12119 * -794103481)
						class647_sub1_sub5_sub1.aClass435_12124 = null;
					else if (class647_sub1_sub5_sub1.anInt12119 * -794103481 != i_8_) {
						if (i_7_ == -794103481 * class647_sub1_sub5_sub1.anInt12119)
							class647_sub1_sub5_sub1.aClass435_12124 = class435;
						else if ((class647_sub1_sub5_sub1.anInt12119 * -794103481) == i_9_)
							class647_sub1_sub5_sub1.aClass435_12124 = class435_11_;
						else if (((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((class647_sub1_sub5_sub1.anInt12119 * -794103481), (byte) -23))).aBool170)
							class647_sub1_sub5_sub1.aClass435_12124 = Class523_Sub27_Sub2.method17740(-708153653);
						else
							class647_sub1_sub5_sub1.aClass435_12124 = null;
					}
					if (1382885407 * class647_sub1_sub5_sub1.anInt12121 == -1)
						class647_sub1_sub5_sub1.aClass435_12123 = null;
					else if (i_9_ != (class647_sub1_sub5_sub1.anInt12121 * 1382885407)) {
						if (1382885407 * class647_sub1_sub5_sub1.anInt12121 == i_7_)
							class647_sub1_sub5_sub1.aClass435_12123 = class435;
						else if ((class647_sub1_sub5_sub1.anInt12121 * 1382885407) == i_8_)
							class647_sub1_sub5_sub1.aClass435_12123 = class435_10_;
						else if (((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((1382885407 * class647_sub1_sub5_sub1.anInt12121), (byte) -44))).aBool170)
							class647_sub1_sub5_sub1.aClass435_12123 = Class523_Sub27_Sub2.method17740(-708153653);
						else
							class647_sub1_sub5_sub1.aClass435_12123 = null;
					}
					class647_sub1_sub5_sub1.anInt12126 = 0;
					class647_sub1_sub5_sub1.aByte10821 = (byte) i;
					class647_sub1_sub5_sub1.aByte10818 = (byte) i;
					if (client.aClass505_11019.method8243(-436259953).method7282(i_2_, i_3_, -638715901))
						class647_sub1_sub5_sub1.aByte10818++;
					client.aClass505_11019.method8241((byte) -109).method9265(i, i_2_, i_3_, i_15_, class647_sub1_sub5_sub1, 1847015872);
				}
			}
		}
	}

	static void method4528(Class250 class250, Class236 class236, int i, int i_16_, int i_17_, int i_18_, int i_19_, long l) {
		int i_20_ = i_17_ * i_17_ + i_18_ * i_18_;
		if ((long) i_20_ <= l) {
			int i_21_;
			if (2 == Class562.anInt7564 * 2097396553)
				i_21_ = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1460219915) * 2607.5945876176133) + 724985463 * client.anInt11094) & 0x3fff;
			else if (6 == 2097396553 * Class562.anInt7564)
				i_21_ = (int) client.aFloat11129 & 0x3fff;
			else
				i_21_ = (724985463 * client.anInt11094 + (int) client.aFloat11129 & 0x3fff);
			int i_22_ = Class433.anIntArray4880[i_21_];
			int i_23_ = Class433.anIntArray4881[i_21_];
			if (2097396553 * Class562.anInt7564 != 6) {
				i_22_ = i_22_ * 256 / (-1193506389 * client.anInt11068 + 256);
				i_23_ = i_23_ * 256 / (-1193506389 * client.anInt11068 + 256);
			}
			int i_24_ = i_18_ * i_22_ + i_17_ * i_23_ >> 14;
			int i_25_ = i_23_ * i_18_ - i_17_ * i_22_ >> 14;
			Class148 class148 = Class82.aClass148Array872[i_19_];
			int i_26_ = class148.method2504();
			int i_27_ = class148.method2428();
			int i_28_ = i_24_ + 365308179 * class250.anInt2581 / 2 - i_26_ / 2;
			int i_29_ = i_26_ + i_28_;
			int i_30_ = -i_25_ + -1759297857 * class250.anInt2543 / 2 - i_27_;
			int i_31_ = i_30_ + i_27_;
			boolean bool;
			if (class236 != null)
				bool = (!class236.method4283(i_28_, i_30_, -1337957386) || !class236.method4283(i_29_, i_30_, 442169132) || !class236.method4283(i_28_, i_31_, 949928331) || !class236.method4283(i_29_, i_31_, -196524839));
			else {
				int i_32_ = i_27_;
				int i_33_ = i_26_ / 2;
				bool = (i_30_ <= -i_32_ || i_31_ >= class250.anInt2543 * -1759297857 || i_28_ <= -i_33_ || i_29_ >= class250.anInt2581 * 365308179 + i_33_);
			}
			if (bool) {
				double d = Math.atan2((double) i_24_, (double) i_25_);
				double d_34_ = Math.atan2((double) Math.abs(i_24_), (double) Math.abs(i_25_));
				double d_35_ = Math.atan2((double) (class250.anInt2581 * 365308179 / 2), (double) (class250.anInt2543 * -1759297857 / 2));
				boolean bool_36_ = false;
				double d_37_ = 0.0;
				int i_38_;
				if (d_34_ < d_35_) {
					d_37_ = 1.5707963267948966 - d;
					i_38_ = -1759297857 * class250.anInt2543 / 2;
				} else {
					d_37_ = d;
					i_38_ = class250.anInt2581 * 365308179 / 2;
				}
				int i_39_ = Math.abs((int) -((double) i_38_ * Math.sin(1.5707963267948966) / Math.sin(d_37_)));
				Class194_Sub3.aClass148Array9885[i_19_].method2423(((float) (class250.anInt2581 * 365308179) / 2.0F + (float) i + 0.0F), ((float) i_16_ + (float) (-1759297857 * class250.anInt2543) / 2.0F - 0.0F), (float) Class194_Sub3.aClass148Array9885[i_19_].method38() / 2.0F, (float) i_39_, 4096, (int) (-d / 6.283185307179586 * 65535.0));
			} else if (class236 != null)
				class148.method2482(i_28_ + i, i_30_ + i_16_, class236.aClass145_2392, i, i_16_);
			else
				class148.method2435(i + i_28_, i_16_ + i_30_);
		}
	}

	static final void method4529(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class39.method1126(class250, class242, class669, 613777618);
	}
}
