/* Class642 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;

public class Class642 {
	int[] anIntArray8329;
	int anInt8330 = 442313353;
	Object[] anObjectArray8331;
	Class523_Sub27_Sub19 aClass523_Sub27_Sub19_8332;
	long[] aLongArray8333;
	public static Class561 aClass561_8334;

	Class642() {
		/* empty */
	}

	static final void method10532(Class669 class669, byte i) {
		class669.anObjectArray8565[(class669.anIntArray8577[class669.anInt8579 * 1180759405])] = (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
	}

	static final void method10533(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1122662053);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class577.method9649(class250, class242, class669, 65535);
	}

	public static void method10534(int i, int i_1_, int i_2_, boolean bool, int i_3_) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class534_Sub1.aClass523_Sub27_Sub17_7144;
		Class534_Sub1.method8898(i);
		Class534_Sub1.aBool7193 = false;
		if (class523_sub27_sub17 != Class534_Sub1.aClass523_Sub27_Sub17_7144)
			Class42.method1147((short) -4111);
		Class534_Sub1.anInt10781 = i_1_ * -1743314867;
		Class534_Sub1.anInt10782 = 349380783 * i_2_;
		Class534_Sub1.aBool10783 = bool;
	}

	static final void method10535(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 100;
	}

	public static final void method10536(InterfaceComponentDefinitions[] class250s, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, byte i_11_) {
		Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
		for (int i_12_ = 0; i_12_ < class250s.length; i_12_++) {
			InterfaceComponentDefinitions class250 = class250s[i_12_];
			if (null != class250 && (class250.parentId * 97896203 == i || (i == -1412584499 && client.aClass250_11197 == class250))) {
				int i_13_;
				if (-1 == i_10_) {
					client.aRectangleArray11248[2032911217 * client.anInt10994].setBounds(i_8_ + class250.anInt2540 * 1579360395, i_9_ + class250.anInt2541 * 1765340581, class250.anInt2581 * 365308179, class250.anInt2543 * -1759297857);
					i_13_ = (client.anInt10994 += -604332655) * 2032911217 - 1;
				} else
					i_13_ = i_10_;
				class250.anInt2622 = i_13_ * 1768977945;
				class250.anInt2706 = client.cycles * -333677645;
				if (!client.method17254(class250)) {
					if (0 != 1963816533 * class250.anInt2582)
						Class97.method1772(class250, (byte) -10);
					int i_14_ = i_8_ + 1579360395 * class250.anInt2540;
					int i_15_ = i_9_ + 1765340581 * class250.anInt2541;
					int i_16_ = 319619511 * class250.anInt2707;
					if (client.aBool11180 && ((client.method17252(class250).settings * 747608249) != 0 || class250.type * 36473529 == 0) && i_16_ > 127)
						i_16_ = 127;
					if (client.aClass250_11197 == class250) {
						if (-1412584499 != i && ((175219699 * class250.anInt2633 == -1769267387 * InterfaceComponentDefinitions.anInt2675) || (InterfaceComponentDefinitions.anInt2506 * 723497885 == 175219699 * class250.anInt2633) || (client.method17252(class250).method15967((byte) 40) && (1202875309 * InterfaceComponentDefinitions.anInt2558 != class250.anInt2633 * 175219699)))) {
							Class523_Sub15.aClass250Array10471 = class250s;
							Class58.anInt753 = 2014160343 * i_8_;
							JS5Client.anInt10326 = 2098380537 * i_9_;
							continue;
						}
						if (client.aBool11231 && client.aBool11213) {
							int i_17_ = aClass561_8334.method9426((byte) 81);
							int i_18_ = aClass561_8334.method9432(-1982226962);
							i_17_ -= -1761464565 * client.anInt11104;
							i_18_ -= 1635185731 * client.anInt11200;
							if (i_17_ < client.anInt11270 * 947059145)
								i_17_ = 947059145 * client.anInt11270;
							if (365308179 * class250.anInt2581 + i_17_ > (1076211565 * client.anInt11158 + client.anInt11270 * 947059145))
								i_17_ = (1076211565 * client.anInt11158 + client.anInt11270 * 947059145 - 365308179 * class250.anInt2581);
							if (i_18_ < client.anInt11204 * -1561193723)
								i_18_ = client.anInt11204 * -1561193723;
							if (-1759297857 * class250.anInt2543 + i_18_ > (client.anInt11204 * -1561193723 + 1984528093 * client.anInt11206))
								i_18_ = (-1561193723 * client.anInt11204 + client.anInt11206 * 1984528093 - class250.anInt2543 * -1759297857);
							if (client.method17252(class250).method15967((byte) 125))
								Class504.method8225(i_17_, i_18_, (class250.anInt2581 * 365308179), (-1759297857 * class250.anInt2543), (byte) -57);
							if (175219699 * class250.anInt2633 != 1202875309 * InterfaceComponentDefinitions.anInt2558) {
								i_14_ = i_17_;
								i_15_ = i_18_;
							}
						}
						if (InterfaceComponentDefinitions.anInt2506 * 723497885 == 175219699 * class250.anInt2633)
							i_16_ = 128;
					}
					int i_19_;
					int i_20_;
					int i_21_;
					int i_22_;
					if (2 == 36473529 * class250.type) {
						i_19_ = i_4_;
						i_20_ = i_5_;
						i_21_ = i_6_;
						i_22_ = i_7_;
					} else {
						int i_23_ = class250.anInt2581 * 365308179 + i_14_;
						int i_24_ = class250.anInt2543 * -1759297857 + i_15_;
						if (9 == class250.type * 36473529) {
							i_23_++;
							i_24_++;
						}
						i_19_ = i_14_ > i_4_ ? i_14_ : i_4_;
						i_20_ = i_15_ > i_5_ ? i_15_ : i_5_;
						i_21_ = i_23_ < i_6_ ? i_23_ : i_6_;
						i_22_ = i_24_ < i_7_ ? i_24_ : i_7_;
					}
					if (i_19_ < i_21_ && i_20_ < i_22_) {
						if (0 != 1963816533 * class250.anInt2582) {
							if ((1301979947 * InterfaceComponentDefinitions.anInt2538 == 1963816533 * class250.anInt2582) || (15445289 * InterfaceComponentDefinitions.anInt2630 == 1963816533 * class250.anInt2582)) {
								if (client.aBool10980) {
									Class31.aClass178_303.method3206();
									Class702.method14125(i_14_, i_15_, class250.anInt2581 * 365308179, class250.anInt2543 * -1759297857, (15445289 * InterfaceComponentDefinitions.anInt2630 == 1963816533 * class250.anInt2582), (short) 7401);
									Class609.method10014(i_13_, i_19_, i_20_, i_21_, i_22_, i_14_, i_15_, 1774930500);
									Class31.aClass178_303.method3067();
									Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
									client.aBoolArray11246[i_13_] = true;
								}
								continue;
							}
							if ((class250.anInt2582 * 1963816533 == 1365047505 * InterfaceComponentDefinitions.anInt2508) && client.anInt11071 * -1616721887 == 3) {
								if (5 != 36473529 * class250.type || (class250.method4440((Class31.aClass178_303), (byte) -64) != null)) {
									Class687_Sub7.method16802((Class31.aClass178_303), class250, i_14_, i_15_, -215635651);
									Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
								}
								continue;
							}
							if (class250.anInt2582 * 1963816533 == -833542861 * InterfaceComponentDefinitions.anInt2518) {
								Class240.method4344(Class31.aClass178_303, i_14_, i_15_, class250, (byte) 105);
								continue;
							}
							if (InterfaceComponentDefinitions.anInt2516 * -124642643 == class250.anInt2582 * 1963816533) {
								Class274.method5031(Class31.aClass178_303, i_14_, i_15_, class250, (class250.anInt2556 * -293786715 % 64), 1962256274);
								continue;
							}
							if (-1196308247 * InterfaceComponentDefinitions.anInt2509 == class250.anInt2582 * 1963816533) {
								if (class250.method4440(Class31.aClass178_303, (byte) -46) != null) {
									Class31.aClass178_303.method3206();
									Class315.method5679(class250, i_14_, i_15_, 726373758);
									Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
								}
								continue;
							}
							if (1963816533 * class250.anInt2582 == -562952145 * InterfaceComponentDefinitions.anInt2510) {
								Class523_Sub41.method16574(Class31.aClass178_303, i_14_, i_15_, 365308179 * class250.anInt2581, -1759297857 * class250.anInt2543, -1211164133);
								client.aBoolArray11246[i_13_] = true;
								Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
								continue;
							}
							if (1963816533 * class250.anInt2582 == InterfaceComponentDefinitions.anInt2511 * -259826345) {
								Class614.method10062(Class31.aClass178_303, i_14_, i_15_, (class250.anInt2581 * 365308179), (class250.anInt2543 * -1759297857), 745376788);
								client.aBoolArray11246[i_13_] = true;
								Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
								continue;
							}
							if (-2006194977 * InterfaceComponentDefinitions.anInt2658 == class250.anInt2582 * 1963816533) {
								if (client.aBool11096 || client.aBool11280) {
									JS5ReferenceTable.method7502(i_14_, i_15_, class250, (byte) 21);
									client.aBoolArray11246[i_13_] = true;
								}
								continue;
							}
							if (InterfaceComponentDefinitions.anInt2517 * 1211745551 == class250.anInt2582 * 1963816533) {
								Class148 class148 = Class77.method1543((byte) 1);
								if (class148 != null) {
									int i_25_ = i_6_ - i_4_;
									int i_26_ = i_7_ - i_5_;
									float f = (float) i_25_ / (float) i_26_;
									float f_27_ = ((float) class148.method2504() / (float) class148.method2428());
									int i_28_;
									int i_29_;
									if (f < f_27_) {
										i_28_ = i_25_;
										i_29_ = (int) ((float) i_25_ / f_27_);
									} else {
										i_28_ = (int) (f_27_ * (float) i_26_);
										i_29_ = i_26_;
									}
									int i_30_ = (i_25_ - i_28_) / 2 + i_4_;
									int i_31_ = (i_26_ - i_29_) / 2 + i_5_;
									class148.method2438(i_30_, i_31_, i_28_, i_29_);
								}
								continue;
							}
							if (InterfaceComponentDefinitions.anInt2528 * -1559569275 == class250.anInt2582 * 1963816533) {
								if (Class423.method6714(899016063) && Class220.method4130((byte) 0))
									Class197.method3670(i_4_, i_5_, i_6_, i_7_, 65280);
								continue;
							}
						}
						if (0 == class250.type * 36473529) {
							if (1963816533 * class250.anInt2582 == -1315133245 * InterfaceComponentDefinitions.anInt2514) {
								Class31.aClass178_303.method3206();
								client.aClass505_11019.method8271((byte) 8).method10244(client.aClass505_11019, -2145179676);
								Class31.aClass178_303.method3322(i_14_, i_15_, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742);
							}
							method10536(class250s, class250.interfaceHash * -1363815505, i_19_, i_20_, i_21_, i_22_, (i_14_ - class250.anInt2636 * -448482823), (i_15_ - -1013149031 * class250.anInt2539), i_13_, bool, (byte) -21);
							if (class250.aClass250Array2519 != null)
								method10536(class250.aClass250Array2519, -1363815505 * class250.interfaceHash, i_19_, i_20_, i_21_, i_22_, i_14_ - (class250.anInt2636 * -448482823), i_15_ - (class250.anInt2539 * -1013149031), i_13_, bool, (byte) -54);
							Class523_Sub36 class523_sub36 = ((Class523_Sub36) (client.aClass14_11187.getFromIndex((long) (class250.interfaceHash * -1363815505))));
							if (null != class523_sub36)
								Class702.method14126(-1444773101 * class523_sub36.anInt10666, i_19_, i_20_, i_21_, i_22_, i_14_ - class250.anInt2636 * -448482823, i_15_ - -1013149031 * class250.anInt2539, i_13_, -1512334032);
							if (InterfaceComponentDefinitions.anInt2514 * -1315133245 == class250.anInt2582 * 1963816533) {
								if (Class31.aClass178_303.method3138()) {
									Class31.aClass178_303.method3137(class250.anInt2581 * 365308179, -1759297857 * class250.anInt2543);
									if (9 == -2020118759 * client.anInt11136)
										Class626.method10232(i_14_, i_15_, 365308179 * class250.anInt2581, class250.anInt2543 * -1759297857, -936802419);
								}
								if (4 == -1616721887 * client.anInt11071) {
									int i_32_ = -1389514695 * client.anInt11298;
									int i_33_ = -2049173285 * client.anInt11080;
									int i_34_ = 176739729 * client.anInt11254;
									int i_35_ = client.anInt11082 * 396384227;
									if (client.cycles < 1730058607 * client.anInt11079) {
										float f = (1.0F * (float) (client.cycles - (-141996737 * (client.anInt11076))) / (float) ((client.anInt11079 * 1730058607) - (-141996737 * (client.anInt11076))));
										i_32_ = (int) (((1.0F - f) * (float) ((Class647_Sub1_Sub1_Sub1.anInt11978) * 1886565781)) + (f * (float) ((client.anInt11298) * -1389514695)));
										i_33_ = (int) (((1.0F - f) * (float) (-875539509 * (Class660.anInt8508))) + (f * (float) ((client.anInt11080) * -2049173285)));
										i_34_ = (int) (((float) (176739729 * (client.anInt11254)) * f) + ((1.0F - f) * (float) ((client.anInt11170) * 1916824945)));
										i_35_ = (int) (((float) (396384227 * (client.anInt11082)) * f) + ((float) (-1659468977 * (Class313.anInt3395)) * (1.0F - f)));
									}
									if (i_32_ > 0)
										Class31.aClass178_303.method3354(i_19_, i_20_, i_21_ - i_19_, i_22_ - i_20_, (i_32_ << 24 | i_33_ << 16 | i_34_ << 8 | i_35_), (byte) 54);
								}
							}
							Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
						}
						if (client.aBoolArray11247[i_13_] || 2023836395 * client.anInt11249 > 1) {
							if (36473529 * class250.type == 3) {
								if (0 == i_16_) {
									if (class250.aBool2557)
										Class31.aClass178_303.method3193(i_14_, i_15_, class250.anInt2581 * 365308179, class250.anInt2543 * -1759297857, ~0xffffff | (class250.anInt2556 * -293786715), 0);
									else
										Class31.aClass178_303.method3083(i_14_, i_15_, class250.anInt2581 * 365308179, class250.anInt2543 * -1759297857, (~0xffffff | (-293786715 * class250.anInt2556)), 0);
								} else if (class250.aBool2557)
									Class31.aClass178_303.method3193(i_14_, i_15_, 365308179 * class250.anInt2581, -1759297857 * class250.anInt2543, (255 - (i_16_ & 0xff) << 24 | (-293786715 * class250.anInt2556 & 0xffffff)), 1);
								else
									Class31.aClass178_303.method3083(i_14_, i_15_, 365308179 * class250.anInt2581, class250.anInt2543 * -1759297857, (255 - (i_16_ & 0xff) << 24 | (class250.anInt2556 * -293786715 & 0xffffff)), 1);
							} else if (4 == class250.type * 36473529) {
								int i_36_ = 255 - (i_16_ & 0xff);
								if (0 != i_36_) {
									Class164 class164 = (class250.method4493(Class491.aClass423_5536, client.anInterface50_11044, (short) 255));
									if (class164 == null) {
										if (InterfaceComponentDefinitions.aBool2525)
											Login.method15991(class250, (byte) -89);
									} else {
										int i_37_ = -293786715 * class250.anInt2556;
										String string = class250.aString2607;
										if (-1878986101 * class250.anInt2680 != -1) {
											ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((-1878986101 * class250.anInt2680), (byte) -59)));
											string = class12.itemName;
											if (string == null)
												string = "null";
											if ((1 == (class12.stackable * -758774055) || 1 != (class250.anInt2681 * -1263698325)) && (class250.anInt2681 * -1263698325) != -1)
												string = new StringBuilder().append(Class495.method8101(16748608, 1013519604)).append(string).append(Class31.aString301).append(" x").append(Class30.method899((class250.anInt2681 * -1263698325), (byte) -2)).toString();
										}
										if (class250 == client.aClass250_11189) {
											string = (Class39.aClass39_514.method1124((Class53_Sub20.aClass668_10979), (byte) -116));
											i_37_ = (-293786715 * class250.anInt2556);
										}
										if (client.aBool11196)
											Class31.aClass178_303.method3266(i_14_, i_15_, i_14_ + (class250.anInt2581 * 365308179), ((-1759297857 * class250.anInt2543) + i_15_));
										i_36_ <<= 24;
										if (class250.aBool2613)
											class164.method2603(string, i_14_, i_15_, (365308179 * class250.anInt2581), (-1759297857 * class250.anInt2543), i_36_ | i_37_, (class250.aBool2611 ? i_36_ : -1), (1588100583 * class250.anInt2536), (-899509811 * class250.anInt2512), client.aRandom11099, Class330.anInt3500, client.anIntArray11250, Class62.aClass148Array772, null, 53407833);
										else
											class164.method2598(string, i_14_, i_15_, (class250.anInt2581 * 365308179), (class250.anInt2543 * -1759297857), i_36_ | i_37_, (class250.aBool2611 ? i_36_ : -1), (1588100583 * class250.anInt2536), (-899509811 * class250.anInt2512), (class250.anInt2608 * 1021292849), (-364075043 * class250.anInt2612), Class62.aClass148Array772, null, null, 0, 0, -1021260136);
										if (client.aBool11196)
											Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
									}
								}
							} else if (class250.type * 36473529 == 5) {
								if (642394889 * class250.anInt2547 >= 0)
									class250.method4502(Class380.aClass53_Sub11_3937, Class326_Sub2.aClass53_Sub10_10063, 450703116).method8191(Class31.aClass178_303, 0, i_14_, i_15_, class250.anInt2581 * 365308179, -1759297857 * class250.anInt2543, class250.anInt2589 * 1108007031 << 3, class250.anInt2687 * 1748673691 << 3, 0, 0, 2126340577);
								else {
									Class148 class148;
									if (-1 != class250.anInt2680 * -1878986101) {
										Class623 class623 = (class250.aBool2655 ? (Class241.player.aClass623_12183) : null);
										class148 = (Class523_Sub37.aClass53_Sub8_10677.method17181(Class31.aClass178_303, (class250.anInt2680 * -1878986101), (class250.anInt2681 * -1263698325), (class250.anInt2564 * -1420827883), ~0xffffff | (class250.anInt2565 * -728754787), (1583576215 * class250.anInt2587), class623, -17978733));
									} else if (class250.anInt2691 * -623144603 != -1) {
										class148 = ((Class148) (client.aClass209_11299.method3767((long) (class250.anInt2691 * -623144603))));
										if (class148 == null && !(client.aMap11300.containsKey(Integer.valueOf(-623144603 * class250.anInt2691)))) {
											try {
												client.aMap11300.put((Integer.valueOf(-623144603 * class250.anInt2691)), (Class282.aClass55_3070.method1351((new URL(new StringBuilder().append(client.aString10995).append("/img/image_").append((class250.anInt2691) * -623144603).append(".png?a=").append(TimeUtils.getCurrentTimeMilliseconds(1516375036)).toString())), -998646991)));
											} catch (MalformedURLException malformedurlexception) {
												Class305.method5553(null, malformedurlexception, (byte) 1);
											}
										}
									} else
										class148 = (class250.method4431(Class31.aClass178_303, 47249323));
									if (null != class148) {
										int i_38_ = class148.method38();
										int i_39_ = class148.method2429();
										int i_40_ = 255 - (i_16_ & 0xff);
										if (i_40_ != 0) {
											int i_41_;
											if (-293786715 * class250.anInt2556 == -1)
												i_41_ = 16777215;
											else {
												i_41_ = ((-293786715 * class250.anInt2556) & 0xffffff);
												if (i_41_ == 0)
													i_41_ = 16777215;
											}
											i_41_ |= i_40_ << 24;
											boolean bool_42_ = i_41_ != -1;
											if (class250.aBool2632) {
												Class31.aClass178_303.method3266(i_14_, i_15_, i_14_ + (365308179 * (class250.anInt2581)), (class250.anInt2543 * -1759297857) + i_15_);
												if ((class250.anInt2562 * -1689846769) != 0) {
													int i_43_ = ((i_38_ - 1 + ((class250.anInt2581) * 365308179)) / i_38_);
													int i_44_ = ((i_39_ - 1 + (-1759297857 * (class250.anInt2543))) / i_39_);
													for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
														for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
															if (bool_42_)
																class148.method2445((((float) i_38_ / 2.0F) + (float) (i_14_ + i_38_ * i_45_)), (((float) i_39_ / 2.0F) + (float) (i_39_ * i_46_ + i_15_)), 4096, (-1689846769 * (class250.anInt2562)), 0, i_41_, 1);
															else
																class148.method2444((((float) i_38_ / 2.0F) + (float) (i_14_ + i_38_ * i_45_)), ((float) (i_15_ + i_46_ * i_39_) + ((float) i_39_ / 2.0F)), 4096, ((class250.anInt2562) * -1689846769));
														}
													}
												} else if (bool_42_)
													class148.method2464(i_14_, i_15_, (class250.anInt2581 * 365308179), (-1759297857 * (class250.anInt2543)), 0, i_41_, 1);
												else
													class148.method2440(i_14_, i_15_, (class250.anInt2581 * 365308179), (-1759297857 * (class250.anInt2543)));
												Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
											} else if (bool_42_) {
												if (0 != (-1689846769 * class250.anInt2562))
													class148.method2445(((float) i_14_ + ((float) ((class250.anInt2581) * 365308179) / 2.0F)), (((float) (-1759297857 * (class250.anInt2543)) / 2.0F) + (float) i_15_), (1653682176 * class250.anInt2581 / i_38_), (-1689846769 * (class250.anInt2562)), 0, i_41_, 1);
												else if (i_38_ != ((class250.anInt2581) * 365308179) || ((-1759297857 * (class250.anInt2543)) != i_39_))
													class148.method2439(i_14_, i_15_, (class250.anInt2581 * 365308179), (class250.anInt2543 * -1759297857), 0, i_41_, 1);
												else
													class148.method2436(i_14_, i_15_, 0, i_41_, 1);
											} else if (0 != (-1689846769 * (class250.anInt2562)))
												class148.method2446(((float) i_14_ + ((float) ((class250.anInt2581) * 365308179) / 2.0F)), ((float) i_15_ + ((float) (-1759297857 * (class250.anInt2543)) / 2.0F)), (float) i_38_ / 2.0F, (float) i_39_ / 2.0F, (1653682176 * class250.anInt2581 / i_38_), (class250.anInt2543 * 871100416 / i_39_), (class250.anInt2562 * -1689846769), 1, -1, 1);
											else if ((i_38_ != (class250.anInt2581 * 365308179)) || ((class250.anInt2543 * -1759297857) != i_39_))
												class148.method2438(i_14_, i_15_, (365308179 * class250.anInt2581), (class250.anInt2543 * -1759297857));
											else
												class148.method2435(i_14_, i_15_);
										}
									} else if (InterfaceComponentDefinitions.aBool2525)
										Login.method15991(class250, (byte) -17);
								}
							} else if (6 == class250.type * 36473529) {
								Class31.aClass178_303.method3206();
								Class167 class167 = null;
								int i_47_ = 2048;
								if (class250.anInt2682 * -594472669 != 0)
									i_47_ |= 0x80000;
								int i_48_ = 0;
								if (class250.anInt2680 * -1878986101 != -1) {
									ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(class250.anInt2680 * -1878986101, (byte) 24)));
									if (null != class12) {
										class12 = (class12.method661((class250.anInt2681 * -1263698325), (byte) 70));
										class167 = (class12.method660(Class31.aClass178_303, i_47_, 1, (class250.aBool2655 ? (Class241.player.aClass623_12183) : null), class250.aClass707_2693, 0, 0, 0, 0, (byte) 0));
										if (class167 != null)
											i_48_ = -class167.method2804() >> 1;
										else
											Login.method15991(class250, (byte) 0);
									}
								} else if (-428962391 * class250.modelType == 3) {
									int i_49_ = -2080195333 * class250.anInt2571;
									if (i_49_ >= 0 && i_49_ < 2048) {
										Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_49_]);
										if ((class647_sub1_sub3_sub1_sub2 != null) && (i_49_ == (client.anInt11154 * 1109726117) || ((Class618.method10118((class647_sub1_sub3_sub1_sub2.username), -97380228)) == (-1918195571 * (class250.anInt2584))))) {
											class167 = (class250.method4434(Class31.aClass178_303, i_47_, Class80.aClass53_Sub17_866, (Class448.aClass53_Sub6_4945), (Class174.aClass53_Sub7_1856), (Class523_Sub37.aClass53_Sub8_10677), (TimeUtils.aClass53_Sub13_2492), (Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), class250.aClass707_2693, (class647_sub1_sub3_sub1_sub2.aClass623_12183), 816252803));
											if (null == class167 && InterfaceComponentDefinitions.aBool2525)
												Login.method15991(class250, (byte) -19);
										}
									}
								} else if (5 == (-428962391 * class250.modelType)) {
									int i_50_ = class250.anInt2571 * -2080195333;
									Player class647_sub1_sub3_sub1_sub2 = null;
									boolean bool_51_ = false;
									if (i_50_ >= 0 && i_50_ < 2048) {
										class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_50_]);
										bool_51_ = ((null != class647_sub1_sub3_sub1_sub2) && ((client.anInt11154 * 1109726117) == i_50_ || ((Class618.method10118((class647_sub1_sub3_sub1_sub2.username), -97380228)) == (class250.anInt2584 * -1918195571))));
									} else if (i_50_ == -1) {
										bool_51_ = true;
										class647_sub1_sub3_sub1_sub2 = (Class241.player);
									} else {
										Player class647_sub1_sub3_sub1_sub2_52_ = ((Player) (client.aMap11155.get(Integer.valueOf(i_50_))));
										if ((null != class647_sub1_sub3_sub1_sub2_52_) && (i_50_ == (-1087669731 * (class647_sub1_sub3_sub1_sub2_52_.anInt11888)))) {
											bool_51_ = true;
											class647_sub1_sub3_sub1_sub2 = class647_sub1_sub3_sub1_sub2_52_;
										}
									}
									if (bool_51_ && null != class647_sub1_sub3_sub1_sub2 && (class647_sub1_sub3_sub1_sub2.aClass623_12183) != null)
										class167 = (class647_sub1_sub3_sub1_sub2.aClass623_12183.method10176(Class31.aClass178_303, i_47_, Class80.aClass53_Sub17_866, Class448.aClass53_Sub6_4945, Class174.aClass53_Sub7_1856, (Class523_Sub37.aClass53_Sub8_10677), (Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), class250.aClass707_2693, null, null, null, 0, true, Class655.aClass630_8423, 1542885973));
								} else if (8 == -428962391 * class250.modelType || (class250.modelType * -428962391 == 9)) {
									ItemsContainer class523_sub1 = Class72.method1507((-2080195333 * (class250.anInt2571)), false, -768489515);
									if (null != class523_sub1)
										class167 = (class523_sub1.method15827(Class31.aClass178_303, i_47_, class250.aClass707_2693, (-1918195571 * class250.anInt2584), (class250.modelType * -428962391) == 9, (class250.aBool2655 ? (Class241.player.aClass623_12183) : null), 1829289465));
								} else if (null == class250.aClass707_2693 || !class250.aClass707_2693.method14161(-1001128291)) {
									class167 = (class250.method4434(Class31.aClass178_303, i_47_, Class80.aClass53_Sub17_866, Class448.aClass53_Sub6_4945, Class174.aClass53_Sub7_1856, Class523_Sub37.aClass53_Sub8_10677, TimeUtils.aClass53_Sub13_2492, Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, null, (Class241.player.aClass623_12183), 816252803));
									if (null == class167 && InterfaceComponentDefinitions.aBool2525)
										Login.method15991(class250, (byte) -112);
								} else {
									class167 = (class250.method4434(Class31.aClass178_303, i_47_, Class80.aClass53_Sub17_866, Class448.aClass53_Sub6_4945, Class174.aClass53_Sub7_1856, Class523_Sub37.aClass53_Sub8_10677, TimeUtils.aClass53_Sub13_2492, Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, class250.aClass707_2693, (Class241.player.aClass623_12183), 816252803));
									if (null == class167 && InterfaceComponentDefinitions.aBool2525)
										Login.method15991(class250, (byte) -36);
								}
								if (class167 != null) {
									if (0 != class250.anInt2682 * -594472669)
										class167.method2839(class250.anInt2592 * -680260559, class250.anInt2593 * 894428585, class250.anInt2594 * -2112127653, class250.anInt2682 * -594472669);
									int i_53_;
									if (class250.anInt2583 * -15523801 > 0)
										i_53_ = ((class250.anInt2581 * 365308179 << 9) / (class250.anInt2583 * -15523801));
									else
										i_53_ = 512;
									int i_54_;
									if (-665803583 * class250.anInt2503 > 0)
										i_54_ = (((class250.anInt2543 * -1759297857) << 9) / (class250.anInt2503 * -665803583));
									else
										i_54_ = 512;
									int i_55_ = i_14_ + (class250.anInt2581 * 365308179 / 2);
									int i_56_ = (class250.anInt2543 * -1759297857 / 2 + i_15_);
									if (!class250.aBool2625) {
										i_55_ += (class250.anInt2579 * 42767303 * i_53_) >> 9;
										i_56_ += (class250.anInt2580 * 1440440037 * i_54_) >> 9;
									}
									client.aClass435_11005.method6806();
									Class31.aClass178_303.method3300(client.aClass435_11005);
									Class441 class441 = Class31.aClass178_303.method3112();
									int i_57_ = client.aClass505_11019.method8239((byte) -107);
									int i_58_ = client.aClass505_11019.method8240(1827045174);
									i_58_ += -1904547845 * class250.anInt2544;
									if (class250.aBool2555) {
										if (Class562.anInt7564 * 2097396553 == 2) {
											if (class250.aBool2625)
												class441.method7143((float) i_55_, (float) i_56_, (float) i_53_, (float) i_54_, Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5356(43489182), (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5357((byte) -60)), (float) ((Class170.anInt1833) * 2141365743), (float) ((Class254.anInt2742) * -495986435), (float) ((class250.anInt2544) * -1904547845));
											else
												class441.method7143((float) i_55_, (float) i_56_, (float) i_53_, (float) i_54_, (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5356(-211352001)), (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5357((byte) -57)), (float) ((Class170.anInt1833) * 2141365743), (float) (-495986435 * (Class254.anInt2742)), (float) (((class250.anInt2544) * -1904547845) << 2));
										} else if (class250.aBool2625)
											class441.method7143((float) i_55_, (float) i_56_, (float) i_53_, (float) i_54_, (float) i_57_, (float) i_58_, (float) (2141365743 * (Class170.anInt1833)), (float) (Class254.anInt2742 * -495986435), (float) (-1904547845 * (class250.anInt2544)));
										else
											class441.method7143((float) i_55_, (float) i_56_, (float) i_53_, (float) i_54_, (float) i_57_, (float) i_58_, (float) (2141365743 * (Class170.anInt1833)), (float) (Class254.anInt2742 * -495986435), (float) ((-1904547845 * (class250.anInt2544)) << 2));
									} else if (2 == (2097396553 * Class562.anInt7564))
										class441.method7136((float) i_55_, (float) i_56_, (float) i_53_, (float) i_54_, Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5356(-840649755), Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5357((byte) -122), (float) (2141365743 * Class170.anInt1833), (float) (-495986435 * Class254.anInt2742));
									else
										class441.method7136((float) i_55_, (float) i_56_, (float) i_53_, (float) i_54_, (float) i_57_, (float) i_58_, (float) (2141365743 * Class170.anInt1833), (float) (Class254.anInt2742 * -495986435));
									Class31.aClass178_303.method3124(class441);
									Class31.aClass178_303.method3076(2, 0);
									if (class250.aBool2586)
										Class31.aClass178_303.method3287(false);
									if (class250.aBool2625) {
										client.aClass435_11006.method6855(1.0F, 0.0F, 0.0F, (Class433.method6799(175466669 * class250.anInt2563)));
										client.aClass435_11006.method6814(0.0F, 1.0F, 0.0F, (Class433.method6799(1376491541 * class250.anInt2577)));
										client.aClass435_11006.method6814(0.0F, 0.0F, 1.0F, Class433.method6799((class250.anInt2578) * 533045263));
										client.aClass435_11006.method6819((float) (42767303 * class250.anInt2579), (float) (class250.anInt2580 * 1440440037), (float) (class250.anInt2522 * 552343533));
									} else {
										int i_59_ = ((((class250.anInt2544 * -1904547845) << 2) * (Class433.anIntArray4880[((175466669 * class250.anInt2563) << 3)])) >> 14);
										int i_60_ = (((Class433.anIntArray4881[(class250.anInt2563 * 175466669) << 3]) * ((-1904547845 * class250.anInt2544) << 2)) >> 14);
										client.aClass435_11006.method6855(0.0F, 0.0F, 1.0F, (Class433.method6799(-(533045263 * class250.anInt2578) << 3)));
										client.aClass435_11006.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(((class250.anInt2577) * 1376491541) << 3));
										client.aClass435_11006.method6819((float) ((1419153773 * class250.anInt2523) << 2), (float) (i_48_ + (((class250.anInt2501 * 2014714437) << 2) + i_59_)), (float) (((2014714437 * class250.anInt2501) << 2) + i_60_));
										client.aClass435_11006.method6814(1.0F, 0.0F, 0.0F, (Class433.method6799(175466669 * class250.anInt2563 << 3)));
									}
									class250.method4435(Class31.aClass178_303, class167, client.aClass435_11006, client.cycles, (byte) -28);
									Class31.aClass178_303.method3067();
									Class31.aClass178_303.method3074(true);
									Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
									if (client.aBool11196)
										Class31.aClass178_303.method3266(i_14_, i_15_, i_14_ + (365308179 * class250.anInt2581), i_15_ + (-1759297857 * class250.anInt2543));
									if (class250.aBool2692)
										client.aClass505_11019.method8271((byte) 8).method10252((float) (class250.anInt2602 * -1274984707) / 256.0F, ((float) (1518812479 * class250.anInt2617) / 256.0F), ((float) (-626338995 * class250.anInt2504) / 256.0F), class250.anInt2644 * 673500513, class250.anInt2597 * 1642560925, class250.anInt2598 * 1612349753, -1606820321 * class250.anInt2684, 1574244669 * class250.anInt2604, (byte) 51);
									else
										client.aClass505_11019.method8271((byte) 8).method10258(2131737507);
									class167.method2708(client.aClass435_11006, null, 1);
									if (!class250.aBool2555 && class250.aClass621_2595 != null)
										Class31.aClass178_303.method3120(class250.aClass621_2595.method10132());
									if (client.aBool11196)
										Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
									Class31.aClass178_303.method3074(false);
									Class31.aClass178_303.method3071();
									Class31.aClass178_303.method3378(i_4_, i_5_, i_6_, i_7_);
									if (class250.aBool2692)
										client.aClass505_11019.method8271((byte) 8).method10258(2137791820);
									if (class250.aBool2586)
										Class31.aClass178_303.method3287(true);
								}
							} else if (9 == 36473529 * class250.type) {
								int i_61_;
								int i_62_;
								int i_63_;
								int i_64_;
								if (class250.aBool2560) {
									i_61_ = i_14_;
									i_62_ = i_15_ + (-1759297857 * class250.anInt2543);
									i_63_ = (i_14_ + class250.anInt2581 * 365308179);
									i_64_ = i_15_;
								} else {
									i_61_ = i_14_;
									i_62_ = i_15_;
									i_63_ = (class250.anInt2581 * 365308179 + i_14_);
									i_64_ = (class250.anInt2543 * -1759297857 + i_15_);
								}
								if (class250.anInt2694 * -418910835 == 1)
									Class31.aClass178_303.method3089(i_61_, i_62_, i_63_, i_64_, (~0xffffff | -293786715 * class250.anInt2556), 0);
								else
									Class31.aClass178_303.method3277(i_61_, i_62_, i_63_, i_64_, (~0xffffff | -293786715 * class250.anInt2556), class250.anInt2694 * -418910835, 0);
							}
						}
					}
				}
			}
		}
	}
}
