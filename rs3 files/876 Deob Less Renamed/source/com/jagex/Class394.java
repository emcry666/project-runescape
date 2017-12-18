/* Class394 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import java.util.Iterator;
import java.util.List;

public class Class394 {
	public static Class394 aClass394_4044;
	public static Class394 aClass394_4045;
	public static Class394 aClass394_4046;
	public static Class394 aClass394_4047 = new Class394(1);
	public static Class394 aClass394_4048;
	public static Class394 aClass394_4049;
	public static Class394 aClass394_4050;
	public static Class394 aClass394_4051;
	public static Class394 aClass394_4052;
	public static Class394 aClass394_4053;
	public static Class394 aClass394_4054;
	public int anInt4055;
	public static Class53_Sub16 aClass53_Sub16_4056;

	public static Class394[] method6499() {
		return new Class394[] { aClass394_4047, aClass394_4045, aClass394_4046, aClass394_4051, aClass394_4044, aClass394_4049, aClass394_4050, aClass394_4048, aClass394_4052, aClass394_4053, aClass394_4054 };
	}

	Class394(int i) {
		anInt4055 = i * 443121651;
	}

	public static Class394[] method6500() {
		return new Class394[] { aClass394_4047, aClass394_4045, aClass394_4046, aClass394_4051, aClass394_4044, aClass394_4049, aClass394_4050, aClass394_4048, aClass394_4052, aClass394_4053, aClass394_4054 };
	}

	static {
		aClass394_4045 = new Class394(2);
		aClass394_4046 = new Class394(2);
		aClass394_4051 = new Class394(2);
		aClass394_4044 = new Class394(1);
		aClass394_4049 = new Class394(1);
		aClass394_4050 = new Class394(1);
		aClass394_4048 = new Class394(2);
		aClass394_4052 = new Class394(1);
		aClass394_4053 = new Class394(2);
		aClass394_4054 = new Class394(1);
	}

	public static Class394[] method6501() {
		return new Class394[] { aClass394_4047, aClass394_4045, aClass394_4046, aClass394_4051, aClass394_4044, aClass394_4049, aClass394_4050, aClass394_4048, aClass394_4052, aClass394_4053, aClass394_4054 };
	}

	static void method6502(Class178 class178, int i, int i_0_, int i_1_) {
		if (i >= 0 && i_0_ >= 0 && Class36.aClass441_350 != null) {
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			Class441 class441 = class178.method3112();
			Class413.method6649(class178, -230926054);
			class441.method7090(Class36.aClass435_352);
			class441.method7089(Class36.aClass441_350);
			class441.method7163();
			int i_2_ = i - -1196807433 * Class36.anInt346;
			int i_3_ = i_0_ - -1269933459 * Class36.anInt347;
			if (client.aClass505_11019.method8241((byte) -66) != null) {
				if (!client.aBool11000 || (Class570.anInt7658 * 382935923 & 0x40) != 0) {
					int i_4_ = -1;
					int i_5_ = -1;
					float f = (2.0F * (float) i_2_ / (float) (-1264269755 * Class36.anInt355) - 1.0F);
					float f_6_ = (2.0F * (float) i_3_ / (float) (-831151971 * Class36.anInt349) - 1.0F);
					class441.method7185(f, f_6_, -1.0F, Class36.aFloatArray356);
					float f_7_ = (Class36.aFloatArray356[0] / Class36.aFloatArray356[3]);
					float f_8_ = (Class36.aFloatArray356[1] / Class36.aFloatArray356[3]);
					float f_9_ = (Class36.aFloatArray356[2] / Class36.aFloatArray356[3]);
					class441.method7185(f, f_6_, 1.0F, Class36.aFloatArray356);
					float f_10_ = (Class36.aFloatArray356[0] / Class36.aFloatArray356[3]);
					float f_11_ = (Class36.aFloatArray356[1] / Class36.aFloatArray356[3]);
					float f_12_ = (Class36.aFloatArray356[2] / Class36.aFloatArray356[3]);
					float f_13_ = Class304.method5547(f_7_, f_8_, f_9_, f_10_, f_11_, f_12_, 4, -1687850656);
					if (f_13_ > 0.0F) {
						float f_14_ = f_10_ - f_7_;
						float f_15_ = f_12_ - f_9_;
						int i_16_ = (int) (f_14_ * f_13_ + f_7_);
						int i_17_ = (int) (f_9_ + f_15_ * f_13_);
						i_4_ = i_16_ + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2145711694) - 1 << 8) >> 9;
						i_5_ = i_17_ + (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method18338(2145070106) - 1 << 8) >> 9;
						int i_18_ = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821);
						if (i_18_ < 3 && ((client.aClass505_11019.method8243(1606808244).aByteArrayArrayArray4962[1][i_16_ >> 9][i_17_ >> 9]) & 0x2) != 0)
							i_18_++;
					}
					if (i_4_ != -1 && i_5_ != -1) {
						if (client.aBool11000 && (382935923 * Class570.anInt7658 & 0x40) != 0) {
							Class250 class250 = Class654.method10722((Class232.anInt2367 * 1383041209), (-1034378319 * client.anInt11105), (byte) 13);
							if (null != class250)
								Class463.method7523(client.aString11016, new StringBuilder().append(" ").append(Class31.aString299).append(" ").toString(), (Class684.anInt8664 * 2088669163), 59, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 0 | i_5_), true, (byte) 46);
							else
								Class399.method6533(-1116684449);
						} else {
							if (Class318.aBool3431)
								Class463.method7523((Class39.aClass39_510.method1124((Class53_Sub20.aClass668_10979), (byte) -10)), "", -1, 60, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 0 | i_5_), true, (byte) -81);
							Class463.method7523(Class17.aString191, "", (-1101666563 * client.anInt10997), 23, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 0 | i_5_), true, (byte) -63);
						}
					}
				}
				Class549 class549 = (client.aClass505_11019.method8241((byte) -60).aClass549_7555);
				int i_19_ = i;
				int i_20_ = i_0_;
				List list = class549.aList7326;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class559 class559 = (Class559) iterator.next();
					if ((client.aBool11305 || ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) == class559.aClass647_Sub1_7492.aByte10821)) && class559.method9235(class178, i_19_, i_20_, (byte) 1)) {
						boolean bool = false;
						boolean bool_21_ = false;
						int i_22_;
						int i_23_;
						if (class559.aClass647_Sub1_7492 instanceof Class647_Sub1_Sub3) {
							i_22_ = ((Class647_Sub1_Sub3) class559.aClass647_Sub1_7492).aShort11750;
							i_23_ = ((Class647_Sub1_Sub3) class559.aClass647_Sub1_7492).aShort11751;
						} else {
							Class437 class437 = (class559.aClass647_Sub1_7492.method10569().aClass437_4862);
							i_22_ = (int) class437.aFloat4903 >> 9;
							i_23_ = (int) class437.aFloat4905 >> 9;
						}
						if (class559.aClass647_Sub1_7492 instanceof Player) {
							Player class647_sub1_sub3_sub1_sub2 = ((Player) class559.aClass647_Sub1_7492);
							int i_24_ = class647_sub1_sub3_sub1_sub2.method18338(2143194987);
							Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
							if (((i_24_ & 0x1) == 0 && ((int) class437.aFloat4903 & 0x1ff) == 0 && ((int) class437.aFloat4905 & 0x1ff) == 0) || ((i_24_ & 0x1) == 1 && (((int) class437.aFloat4903 & 0x1ff) == 256) && 256 == ((int) class437.aFloat4905 & 0x1ff))) {
								int i_25_ = ((int) class437.aFloat4903 - (class647_sub1_sub3_sub1_sub2.method18338(2146679086) - 1 << 8));
								int i_26_ = ((int) class437.aFloat4905 - (class647_sub1_sub3_sub1_sub2.method18338(2140423545) - 1 << 8));
								for (int i_27_ = 0; i_27_ < client.anInt11050 * 920163749; i_27_++) {
									Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) client.anIntArray11051[i_27_])));
									if (null != class523_sub28) {
										Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
										if ((client.anInt11011 != (1673780867 * (class647_sub1_sub3_sub1_sub1.anInt11895))) && (class647_sub1_sub3_sub1_sub1.aBool11892)) {
											Class437 class437_28_ = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
											int i_29_ = ((int) (class437_28_.aFloat4903) - ((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) - 1 << 8));
											int i_30_ = ((int) (class437_28_.aFloat4905) - (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - 1 << 8));
											if (i_29_ >= i_25_ && ((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933 <= ((class647_sub1_sub3_sub1_sub2.method18338(2140154274)) - (i_29_ - i_25_ >> 9))) && i_30_ >= i_26_ && ((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933 <= ((class647_sub1_sub3_sub1_sub2.method18338(2146957810)) - (i_30_ - i_26_ >> 9)))) {
												Class232.method4255(class647_sub1_sub3_sub1_sub1, ((class559.aClass647_Sub1_7492.aByte10821) != (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821)), 1417711001);
												class647_sub1_sub3_sub1_sub1.anInt11895 = (client.anInt11011 * -95559637);
											}
										}
									}
								}
								int i_31_ = 393652345 * Class108.anInt1318;
								int[] is = Class108.anIntArray1319;
								for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
									Player class647_sub1_sub3_sub1_sub2_33_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_32_]]);
									if ((class647_sub1_sub3_sub1_sub2_33_ != null) && ((class647_sub1_sub3_sub1_sub2_33_.anInt11895) * 1673780867 != client.anInt11011) && (class647_sub1_sub3_sub1_sub2 != class647_sub1_sub3_sub1_sub2_33_) && (class647_sub1_sub3_sub1_sub2_33_.aBool11892)) {
										Class437 class437_34_ = (class647_sub1_sub3_sub1_sub2_33_.method10569().aClass437_4862);
										int i_35_ = ((int) class437_34_.aFloat4903 - ((class647_sub1_sub3_sub1_sub2_33_.method18338(2142689944) - 1) << 8));
										int i_36_ = ((int) class437_34_.aFloat4905 - ((class647_sub1_sub3_sub1_sub2_33_.method18338(2145990376) - 1) << 8));
										if (i_35_ >= i_25_ && (class647_sub1_sub3_sub1_sub2_33_.method18338(2140367619) <= (class647_sub1_sub3_sub1_sub2.method18338(2144390605) - (i_35_ - i_25_ >> 9))) && i_36_ >= i_26_ && (class647_sub1_sub3_sub1_sub2_33_.method18338(2145853079) <= (class647_sub1_sub3_sub1_sub2.method18338(2143120287) - (i_36_ - i_26_ >> 9)))) {
											Class40.method1133(class647_sub1_sub3_sub1_sub2_33_, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), (short) -26924);
											class647_sub1_sub3_sub1_sub2_33_.anInt11895 = (client.anInt11011 * -95559637);
										}
									}
								}
							}
							if ((class647_sub1_sub3_sub1_sub2.anInt11895 * 1673780867) == client.anInt11011)
								continue;
							Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != class559.aClass647_Sub1_7492.aByte10821), (short) 4355);
							class647_sub1_sub3_sub1_sub2.anInt11895 = client.anInt11011 * -95559637;
						}
						if (class559.aClass647_Sub1_7492 instanceof Class647_Sub1_Sub3_Sub1_Sub1) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class559.aClass647_Sub1_7492);
							if (class647_sub1_sub3_sub1_sub1.aClass300_12175 != null) {
								Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
								if ((0 == ((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) & 0x1) && (((int) class437.aFloat4903 & 0x1ff) == 0) && 0 == ((int) class437.aFloat4905 & 0x1ff)) || (((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) & 0x1) == 1 && 256 == ((int) class437.aFloat4903 & 0x1ff) && 256 == ((int) class437.aFloat4905 & 0x1ff))) {
									int i_37_ = ((int) class437.aFloat4903 - (((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) - 1) << 8));
									int i_38_ = ((int) class437.aFloat4905 - (((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) - 1) << 8));
									for (int i_39_ = 0; i_39_ < 920163749 * client.anInt11050; i_39_++) {
										Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) client.anIntArray11051[i_39_])));
										if (null != class523_sub28) {
											Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1_40_ = ((Class647_Sub1_Sub3_Sub1_Sub1) (class523_sub28.anObject10554));
											if ((client.anInt11011 != (1673780867 * (class647_sub1_sub3_sub1_sub1_40_.anInt11895))) && (class647_sub1_sub3_sub1_sub1_40_ != class647_sub1_sub3_sub1_sub1) && (class647_sub1_sub3_sub1_sub1_40_.aBool11892)) {
												Class437 class437_41_ = (class647_sub1_sub3_sub1_sub1_40_.method10569().aClass437_4862);
												int i_42_ = ((int) (class437_41_.aFloat4903) - ((1610497933 * (class647_sub1_sub3_sub1_sub1_40_.aClass300_12175.anInt3260)) - 1 << 8));
												int i_43_ = ((int) (class437_41_.aFloat4905) - ((1610497933 * (class647_sub1_sub3_sub1_sub1_40_.aClass300_12175.anInt3260)) - 1 << 8));
												if (i_42_ >= i_37_ && ((1610497933 * (class647_sub1_sub3_sub1_sub1_40_.aClass300_12175.anInt3260)) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_42_ - i_37_ >> 9))) && i_43_ >= i_38_ && ((1610497933 * (class647_sub1_sub3_sub1_sub1_40_.aClass300_12175.anInt3260)) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_43_ - i_38_ >> 9)))) {
													Class232.method4255(class647_sub1_sub3_sub1_sub1_40_, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), -1826663885);
													class647_sub1_sub3_sub1_sub1_40_.anInt11895 = (client.anInt11011 * -95559637);
												}
											}
										}
									}
									int i_44_ = Class108.anInt1318 * 393652345;
									int[] is = Class108.anIntArray1319;
									for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
										Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_45_]]);
										if ((null != class647_sub1_sub3_sub1_sub2) && ((class647_sub1_sub3_sub1_sub2.anInt11895) * 1673780867 != client.anInt11011) && (class647_sub1_sub3_sub1_sub2.aBool11892)) {
											Class437 class437_46_ = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
											int i_47_ = ((int) (class437_46_.aFloat4903) - ((class647_sub1_sub3_sub1_sub2.method18338(2141834651)) - 1 << 8));
											int i_48_ = ((int) (class437_46_.aFloat4905) - ((class647_sub1_sub3_sub1_sub2.method18338(2143997288)) - 1 << 8));
											if (i_47_ >= i_37_ && (class647_sub1_sub3_sub1_sub2.method18338(2146019828) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_47_ - i_37_ >> 9))) && i_48_ >= i_38_ && (class647_sub1_sub3_sub1_sub2.method18338(2145686173) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_48_ - i_38_ >> 9)))) {
												Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), (short) -10804);
												class647_sub1_sub3_sub1_sub2.anInt11895 = (-95559637 * client.anInt11011);
											}
										}
									}
								}
								if ((1673780867 * class647_sub1_sub3_sub1_sub1.anInt11895) == client.anInt11011)
									continue;
								Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), -2013697768);
								class647_sub1_sub3_sub1_sub1.anInt11895 = -95559637 * client.anInt11011;
							}
						}
						if (class559.aClass647_Sub1_7492 instanceof Class647_Sub1_Sub5_Sub1) {
							int i_49_ = 235453015 * class592.localX + i_22_;
							int i_50_ = i_23_ + class592.localY * 1704054549;
							Class523_Sub10 class523_sub10 = ((Class523_Sub10) (client.aClass14_11172.method741((long) ((class559.aClass647_Sub1_7492.aByte10821) << 28 | i_50_ << 14 | i_49_))));
							if (class523_sub10 != null) {
								int i_51_ = 0;
								Class523_Sub25 class523_sub25 = ((Class523_Sub25) class523_sub10.aClass708_10417.method14242(-1475832235));
								while (class523_sub25 != null) {
									ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((-188706487 * class523_sub25.anInt10544), (byte) 107)));
									int i_52_;
									if (class12.aBool161)
										i_52_ = class12.anInt169 * -2003823303;
									else if (class12.aBool121)
										i_52_ = -2083409775 * (Class61.aClass633_769.anInt8267);
									else
										i_52_ = -857721843 * (Class61.aClass633_769.anInt8268);
									if (client.aBool11000 && ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821))) {
										Class76 class76 = ((Class76) ((1180578917 * Class13.anInt173 != -1) ? (Class60.aClass53_Sub22_766.getDefinition((Class13.anInt173 * 1180578917), (byte) 5)) : null));
										if ((Class570.anInt7658 * 382935923 & 0x1) != 0 && (class76 == null || ((class12.method669((1180578917 * Class13.anInt173), (-1100663923 * class76.anInt850), -1904937566)) != (-1100663923 * class76.anInt850))))
											Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(i_52_, -1352473185)).append(class12.itemName).toString(), (Class684.anInt8664 * 2088669163), 17, -1, (long) ((class523_sub25.anInt10544) * -188706487), i_22_, i_23_, true, false, (long) i_51_, false, (byte) -38);
									}
									if ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821)) {
										String[] strings = class12.groundOptions;
										for (int i_53_ = strings.length - 1; i_53_ >= 0; i_53_--) {
											if (null != strings[i_53_]) {
												int i_54_ = 0;
												int i_55_ = (952073761 * client.anInt11179);
												if (i_53_ == 0)
													i_54_ = 18;
												if (1 == i_53_)
													i_54_ = 19;
												if (i_53_ == 2)
													i_54_ = 20;
												if (3 == i_53_)
													i_54_ = 21;
												if (i_53_ == 4)
													i_54_ = 22;
												if (i_53_ == 5)
													i_54_ = 1004;
												int i_56_ = (class12.method674(i_53_, (short) 16947));
												if (i_56_ != -1)
													i_55_ = i_56_;
												Class463.method7523(strings[i_53_], new StringBuilder().append(Class495.method8101(i_52_, -1754059598)).append(class12.itemName).toString(), i_55_, i_54_, -1, (long) ((class523_sub25.anInt10544) * -188706487), i_22_, i_23_, true, false, (long) i_51_, false, (byte) -113);
											}
										}
									}
									class523_sub25 = ((Class523_Sub25) class523_sub10.aClass708_10417.method14245(763238054));
									i_51_++;
								}
							}
						}
						if (class559.aClass647_Sub1_7492 instanceof Interface61) {
							Interface61 interface61 = (Interface61) class559.aClass647_Sub1_7492;
							Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1855915449).getDefinition(interface61.method401(-770473736), (byte) -16)));
							if (class602.anIntArray7912 != null)
								class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 1354276583);
							if (class602 != null) {
								if (client.aBool11000 && ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821))) {
									Class76 class76 = ((Class76) (Class13.anInt173 * 1180578917 != -1 ? (Class60.aClass53_Sub22_766.getDefinition(Class13.anInt173 * 1180578917, (byte) 15)) : null));
									if (0 != (Class570.anInt7658 * 382935923 & 0x4) && (null == class76 || ((class602.method9897((Class13.anInt173 * 1180578917), (-1100663923 * class76.anInt850), -40252485)) != (class76.anInt850 * -1100663923))))
										Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(65535, -946540204)).append(class602.aString7859).toString(), 2088669163 * Class684.anInt8664, 2, -1, (Class689.method13949(interface61, i_22_, i_23_, (short) -1967)), i_22_, i_23_, true, false, (long) interface61.hashCode(), false, (byte) 16);
								}
								if ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821)) {
									String[] strings = class602.aStringArray7869;
									if (null != strings) {
										for (int i_57_ = strings.length - 1; i_57_ >= 0; i_57_--) {
											if (strings[i_57_] != null) {
												int i_58_ = 0;
												int i_59_ = (client.anInt11179 * 952073761);
												if (i_57_ == 0)
													i_58_ = 3;
												if (1 == i_57_)
													i_58_ = 4;
												if (i_57_ == 2)
													i_58_ = 5;
												if (i_57_ == 3)
													i_58_ = 6;
												if (i_57_ == 4)
													i_58_ = 1001;
												if (5 == i_57_)
													i_58_ = 1002;
												int i_60_ = (class602.method9904(i_57_, (byte) 9));
												if (i_60_ != -1)
													i_59_ = i_60_;
												Class463.method7523(strings[i_57_], new StringBuilder().append(Class495.method8101(65535, 388195108)).append(class602.aString7859).toString(), i_59_, i_58_, -1, (Class689.method13949(interface61, i_22_, i_23_, (short) -4897)), i_22_, i_23_, true, false, (long) interface61.hashCode(), false, (byte) -58);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6503(int i, int i_61_, int i_62_, int i_63_, boolean bool, int i_64_) {
		if (Class710.aBool8840 && Class310.aFrame3385 != null && (3 != i_61_ || i_62_ != -574370371 * Class246.anInt2479 || i_63_ != Class321.anInt3441 * 970197133)) {
			Class320.method5710(Class110.aClass693_1332, Class310.aFrame3385, -1590929512);
			Class310.aFrame3385 = null;
		}
		if (Class710.aBool8840 && 3 == i_61_ && null == Class310.aFrame3385) {
			Class310.aFrame3385 = Class676_Sub1.method16779(Class110.aClass693_1332, i_62_, i_63_, 0, 0, 696034809);
			if (null != Class310.aFrame3385) {
				Class246.anInt2479 = -529017451 * i_62_;
				Class321.anInt3441 = i_63_ * 528546373;
				Class211.method3824(1698433057);
			}
		}
		if (i_61_ == 3 && (!Class710.aBool8840 || null == Class310.aFrame3385))
			method6503(i, Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(198580709), -1, -1, true, -1094760972);
		else {
			Container container = Class458.method7486(-2115373725);
			if (Class310.aFrame3385 != null) {
				client.anInt5668 = -642489561 * i_62_;
				Class391.anInt4023 = 1795368581 * i_63_;
			} else if (null != client.aFrame5672) {
				Insets insets = client.aFrame5672.getInsets();
				client.anInt5668 = (client.aFrame5672.getSize().width - (insets.left + insets.right)) * -642489561;
				Class391.anInt4023 = (client.aFrame5672.getSize().height - (insets.bottom + insets.top)) * 1795368581;
			} else {
				client.anInt5668 = container.getSize().width * -642489561;
				Class391.anInt4023 = container.getSize().height * 1795368581;
			}
			if (client.anInt5668 * -1308828521 <= 0)
				client.anInt5668 = -642489561;
			if (Class391.anInt4023 * 60613197 <= 0)
				Class391.anInt4023 = 1795368581;
			if (i_61_ != 1)
				Class431.method6787((byte) 7);
			else {
				Class170.anInt1833 = 1587800733 * client.anInt11036;
				client.anInt5660 = (client.anInt5668 * -1308828521 - client.anInt11036 * 1536768403) / 2 * -2061906129;
				Class254.anInt2742 = 492857679 * client.anInt11151;
				client.anInt5670 = 0;
			}
			if (Class674.aClass674_8613 != Class80.aClass674_865 && Class170.anInt1833 * 2141365743 < 1024 && Class254.anInt2742 * -495986435 >= 768) {
				/* empty */
			}
			if (!bool) {
				Class523_Sub18_Sub8.aCanvas11689.setSize((Class170.anInt1833 * 2141365743), (Class254.anInt2742 * -495986435));
				Class31.aClass178_303.method3045(Class523_Sub18_Sub8.aCanvas11689, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435, 2138710304);
				if (container == client.aFrame5672) {
					Insets insets = client.aFrame5672.getInsets();
					Class523_Sub18_Sub8.aCanvas11689.setLocation(client.anInt5660 * -1901078577 + insets.left, insets.top + client.anInt5670 * -1734289153);
				} else
					Class523_Sub18_Sub8.aCanvas11689.setLocation(-1901078577 * client.anInt5660, client.anInt5670 * -1734289153);
			} else
				Class389.method6479((short) -15167);
			if (i_61_ >= 2)
				client.aBool11147 = true;
			else
				client.aBool11147 = false;
			Class74.method1528(149074203);
			if (-1 != -1614846429 * client.anInt11186)
				Class284.method5142(true, (byte) 22);
			if (Class537.method8941(-1346292636).method1979(782493095) != null && (Class474.method7761(-2020118759 * client.anInt11136, (byte) 89) || Class691.method13965(-2020118759 * client.anInt11136, (byte) -3)))
				PacketsDecoder.method4264(Class537.method8941(-2020848907), -1776059881);
			for (int i_65_ = 0; i_65_ < 106; i_65_++)
				client.aBoolArray11246[i_65_] = true;
			client.aBool5673 = true;
		}
	}

	public static void method6504(int i, byte i_66_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17962((byte) 100);
	}
}
