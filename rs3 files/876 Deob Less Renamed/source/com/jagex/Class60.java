/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class60 {
	public int anInt756;
	public int anInt757;
	public int anInt758;
	public String aString759;
	public int anInt760;
	public boolean aBool761;
	public boolean aBool762;
	public String aString763;
	public String aString764;
	public String aString765;
	public static Class53_Sub22 aClass53_Sub22_766;

	Class60() {
		/* empty */
	}

	public static Class292 method1402(int i, int i_0_) {
		if (Class292.aClass292_3158.anInt3157 * -1343720835 == i)
			return Class292.aClass292_3158;
		if (-1343720835 * Class292.aClass292_3156.anInt3157 == i)
			return Class292.aClass292_3156;
		return null;
	}

	static boolean method1403(Class178 class178, int i, byte i_1_) {
		class178.method3206();
		Class248.method4401(1516375036);
		if (!class178.method3394(-725762603))
			return false;
		int i_2_ = client.aClass505_11019.method8292((byte) 28);
		int i_3_ = client.aClass505_11019.method8235(2051902035);
		Class451 class451 = client.aClass505_11019.method8243(1904464769);
		Class560 class560 = client.aClass505_11019.method8241((byte) -87);
		int i_4_ = i;
		if (null != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453) {
			int i_5_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) >> 3);
			int i_6_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) >> 3);
			if (i_5_ >= 0 && i_5_ < Class223.aBoolArrayArray2336.length && i_6_ >= 0 && i_6_ < Class223.aBoolArrayArray2336[i_5_].length && Class223.aBoolArrayArray2336[i_5_][i_6_])
				i_4_ = 0;
		}
		int i_7_ = i_2_ / 2;
		int i_8_ = 0;
		int i_9_ = 0;
		boolean bool = true;
		for (int i_10_ = i_8_; i_10_ < i_2_ + i_8_; i_10_++) {
			for (int i_11_ = i_9_; i_11_ < i_9_ + i_3_; i_11_++) {
				for (int i_12_ = i_4_; i_12_ <= 3; i_12_++) {
					if (i_12_ < i || class451.method7283(i, i_12_, i_10_, i_11_, 1855112396)) {
						int i_13_ = i_12_;
						if (class451.method7282(i_10_, i_11_, -638715901))
							i_13_--;
						if (i_13_ >= 0)
							bool &= Class173.method2908(i_13_, i_10_, i_11_, 1056159383);
					}
				}
			}
		}
		if (!bool)
			return false;
		int i_14_ = 48 + i_2_ * 4 + 48;
		int[] is = new int[i_14_ * i_14_];
		for (int i_15_ = 0; i_15_ < is.length; i_15_++)
			is[i_15_] = 0;
		Class168_Sub1 class168_sub1 = null;
		int i_16_ = 0;
		int i_17_ = 0;
		if (Class104.aBool1261) {
			Class523_Sub18_Sub2.aClass148_11619 = class178.method3136(i_14_, i_14_, false, true);
			class168_sub1 = class178.method3248();
			class168_sub1.method14424(0, Class523_Sub18_Sub2.aClass148_11619.method2430());
			Interface23 interface23 = class178.method3051(i_14_, i_14_);
			class168_sub1.method14423(interface23);
			class178.method3353(class168_sub1, -1575599641);
			i_7_ = i_2_;
			i_16_ = 48;
			i_17_ = 48;
			class178.method3076(1, 0);
		} else
			Class523_Sub18_Sub2.aClass148_11619 = class178.method3103(is, 0, i_14_, i_14_, i_14_, -2146188915);
		client.aClass505_11019.method8271((byte) 8).method10258(2142352931);
		int i_18_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
		int i_19_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
		int i_20_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
		boolean[][] bools = new boolean[1 + i_7_ + 2][1 + i_7_ + 2];
		class178.method3069(Class104.anIntArray1262);
		class178.method3067();
		for (int i_21_ = i_8_; i_21_ < i_8_ + i_2_; i_21_ += i_7_) {
			for (int i_22_ = i_9_; i_22_ < i_9_ + i_3_; i_22_ += i_7_) {
				int i_23_ = i_16_;
				int i_24_ = i_17_;
				int i_25_ = i_21_;
				if (i_25_ > 0) {
					i_25_--;
					i_23_ += 4;
				}
				int i_26_ = i_22_;
				if (i_26_ > 0)
					i_26_--;
				int i_27_ = i_7_ + i_21_;
				if (i_27_ < i_2_)
					i_27_++;
				int i_28_ = i_7_ + i_22_;
				if (i_28_ < i_3_) {
					i_28_++;
					i_24_ += 4;
				}
				if (Class104.aBool1266)
					class178.method3071();
				else
					class178.method3378(0, 0, i_23_ + 4 * i_7_, 4 * i_7_ + i_24_);
				class178.method3076(3, -16777216);
				int i_29_ = i_7_;
				if (i_29_ > i_2_ - 1)
					i_29_ = i_2_ - 1;
				for (int i_30_ = i_4_; i_30_ <= 3; i_30_++) {
					for (int i_31_ = 0; i_31_ <= i_29_; i_31_++) {
						for (int i_32_ = 0; i_32_ <= i_29_; i_32_++)
							bools[i_31_][i_32_] = (i_30_ < i || class451.method7283(i, i_30_, i_31_ + i_25_, i_32_ + i_26_, 2102867116));
					}
					class560.aClass142Array7547[i_30_].method2325(i_16_, i_17_, 1024, i_25_, i_26_, i_27_, i_28_, bools);
					for (int i_33_ = -4; i_33_ < i_7_; i_33_++) {
						for (int i_34_ = -4; i_34_ < i_7_; i_34_++) {
							int i_35_ = i_21_ + i_33_;
							int i_36_ = i_22_ + i_34_;
							if (i_35_ >= i_8_ && i_36_ >= i_9_ && (i_30_ < i || class451.method7283(i, i_30_, i_35_, i_36_, 1600786190))) {
								int i_37_ = i_30_;
								if (class451.method7282(i_35_, i_36_, -638715901))
									i_37_--;
								if (i_37_ >= 0)
									Class162.method2589(class178, i_37_, i_35_, i_36_, i_23_ + i_33_ * 4, (4 * (i_7_ - i_34_) + i_24_ - 4), i_18_, i_19_, -1755474363);
							}
						}
					}
				}
				class178.method3193(i_23_, i_24_, i_7_ * 4, 4 * i_7_, i_20_, 2);
				class178.method3206();
				if (!Class104.aBool1261) {
					Class523_Sub18_Sub2.aClass148_11619.method2433(48 + (i_21_ - i_8_) * 4, 48 + 4 * i_3_ - (i_22_ - i_9_) * 4 - 4 * i_7_, i_7_ * 4, 4 * i_7_, i_23_, i_24_);
					if (Class104.aBool1266) {
						Class523_Sub18_Sub2.aClass148_11619.method2435(256, 0);
						try {
							class178.method3019(-1960032714);
							Class653.method10656(2000L);
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
			}
		}
		if (Class104.aBool1261) {
			class178.method3047(class168_sub1, (short) -9955);
			if (Class104.aBool1266) {
				Class523_Sub18_Sub2.aClass148_11619.method2435(256, 0);
				try {
					class178.method3019(-1718830566);
					Class653.method10656(2000L);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class178.method3071();
		class178.method3208(Class104.anIntArray1262[0], Class104.anIntArray1262[1], Class104.anIntArray1262[2], Class104.anIntArray1262[3]);
		class178.method3076(1, 1);
		Class676_Sub1.method16781(-1240802613);
		Class104.anInt1264 = 0;
		Class104.aClass708_1268.method14235((byte) -30);
		if (!Class104.aBool1272) {
			Class71.method1489(i, 1992015491);
			Class528 class528 = client.aClass505_11019.method8342(-1979043202);
			if (null != class528) {
				Class287.aClass53_Sub1_3102.method17139(1024, 64, -1217004262);
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				for (int i_38_ = 0; i_38_ < class528.anInt7099 * 1153952435; i_38_++) {
					int i_39_ = class528.anIntArray7098[i_38_];
					if (i_39_ >> 28 == (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821)) {
						int i_40_ = ((i_39_ >> 14 & 0x3fff) - class592.localX * 235453015);
						int i_41_ = ((i_39_ & 0x3fff) - class592.localY * 1704054549);
						if (i_40_ >= 0 && i_40_ < i_2_ && i_41_ >= 0 && i_41_ < i_3_)
							Class104.aClass708_1268.method14236(new Class523_Sub24(i_38_), -1862148916);
						else {
							Class239 class239 = ((Class239) (Class287.aClass53_Sub1_3102.getDefinition(class528.anIntArray7100[i_38_], (byte) 66)));
							if (null != class239.anIntArray2445 && -892198963 * class239.anInt2401 + i_40_ >= 0 && (374901433 * class239.anInt2427 + i_40_ < i_2_) && (-1256537267 * class239.anInt2430 + i_41_ >= 0) && (i_41_ + class239.anInt2421 * 973938647 < i_3_))
								Class104.aClass708_1268.method14236(new Class523_Sub24(i_38_), -1915410912);
						}
					}
				}
				Class287.aClass53_Sub1_3102.method17139(128, 64, -1070194570);
			}
		}
		return true;
	}

	public static boolean method1404(int i, byte i_42_) {
		return (i >= Class607.aClass607_7979.anInt7982 * 1923531495 && i <= 1923531495 * Class607.aClass607_7963.anInt7982);
	}

	static void method1405(Class669 class669, int i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815) - 1]), (byte) 39)).anInt3050 * -576086769);
	}

	static final void method1406(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class583.method9670(class250, class242, class669, -551574246);
	}

	static final void method1407(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub13_10613.method16853(-1088389651) == 1 ? 1 : 0;
	}

	public static byte[] method1408(byte[] is, int i) {
		if (null == is)
			return null;
		byte[] is_43_ = new byte[is.length];
		System.arraycopy(is, 0, is_43_, 0, is.length);
		return is_43_;
	}

	public static final int method1409(String string, byte i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_44_ = 0; i_44_ < client.anInt11078 * 54287651; i_44_++) {
			if (string.equalsIgnoreCase(client.aClass51Array11294[i_44_].aString714))
				return i_44_;
		}
		return -1;
	}

	static void method1410(int i, boolean bool, int i_45_) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -847270571);
		if (class523_sub1 != null) {
			for (int i_46_ = 0; i_46_ < class523_sub1.itemIds.length; i_46_++) {
				class523_sub1.itemIds[i_46_] = -1;
				class523_sub1.itemAmounts[i_46_] = 0;
			}
			class523_sub1.aClass4Array10322 = null;
		}
	}

	static final void method1411(Class669 class669, byte i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (class669.aClass523_Sub27_Sub19_8580.anObjectArray11845[1180759405 * class669.anInt8579]);
	}
}
