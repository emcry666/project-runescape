/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class160 implements Runnable {
	Class375_Sub2 this$0;

	public void method2571() {
		try {
			while (!this$0.aBool10187) {
				HashMap hashmap = this$0.method15717((byte) 0);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7849(-1325038853);
					}
				}
				Class653.method10656(50L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
		}
	}

	public void run() {
		try {
			while (!this$0.aBool10187) {
				HashMap hashmap = this$0.method15717((byte) 0);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7849(1938392821);
					}
				}
				Class653.method10656(50L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
		}
	}

	Class160(Class375_Sub2 class375_sub2) {
		this$0 = class375_sub2;
	}

	public void method2572() {
		try {
			while (!this$0.aBool10187) {
				HashMap hashmap = this$0.method15717((byte) 0);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7849(374791717);
					}
				}
				Class653.method10656(50L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
		}
	}

	static void method2573(Class441 class441, int i) {
		Class36.aClass441_337.method7086(class441);
	}

	static void method2574(Class669 class669, int i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[((1357652815 * class669.anInt8558) - 1)]), (byte) -41)).aBool3049 ? 1 : 0);
	}

	static final void method2575(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int[] is = Class594.method9807(string, class669, (byte) 0);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2648 = Class78.method1554(string, class669, -68449792);
		class250.anIntArray2649 = is;
		class250.aBool2635 = true;
	}

	static final void method2576(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.aByteArray3527[i_0_];
	}

	static final void method2577(Class669 class669, short i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		float f = ((float) (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]) / 1000.0F);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5330(i_1_, f, -1033120401);
	}

	static final void method2578(long l) {
		int i = -1500086291 * client.anInt11283;
		int i_2_ = client.anInt11102 * 670449253;
		if (i != Class21.anInt215 * 1996014845) {
			int i_3_ = i - 1996014845 * Class21.anInt215;
			int i_4_ = (int) ((long) i_3_ * l / 320L);
			if (i_3_ > 0) {
				if (i_4_ == 0)
					i_4_ = 1;
				else if (i_4_ > i_3_)
					i_4_ = i_3_;
			} else if (i_4_ == 0)
				i_4_ = -1;
			else if (i_4_ < i_3_)
				i_4_ = i_3_;
			Class21.anInt215 += i_4_ * -464488363;
		}
		if (i_2_ != 1035887883 * Class194_Sub8.anInt9906) {
			int i_5_ = i_2_ - 1035887883 * Class194_Sub8.anInt9906;
			int i_6_ = (int) ((long) i_5_ * l / 320L);
			if (i_5_ > 0) {
				if (0 == i_6_)
					i_6_ = 1;
				else if (i_6_ > i_5_)
					i_6_ = i_5_;
			} else if (i_6_ == 0)
				i_6_ = -1;
			else if (i_6_ < i_5_)
				i_6_ = i_5_;
			Class194_Sub8.anInt9906 += i_6_ * 1879522979;
		}
		client.aFloat11129 += 8.0F * ((float) l * client.aFloat11177 / 40.0F);
		client.aFloat11214 += 8.0F * ((float) l * client.aFloat11106 / 40.0F);
		Class452.method7315((byte) -5);
	}

	static final void method2579(int i) {
		client.aBool11150 = false;
		if (3 != Class222.anInt2334 * -860310981) {
			Class437 class437 = (Class241.player.method10569().aClass437_4862);
			Class451 class451 = client.aClass505_11019.method8243(1303591881);
			if (Class562.anInt7564 * 2097396553 == 1 || 2 == 2097396553 * Class562.anInt7564 || JS5FileQueue.anInt8764 * -1811762071 != -1) {
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_7_;
				int i_8_;
				if (2097396553 * Class562.anInt7564 == 2) {
					Class437 class437_9_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 72).method13908(1424855415);
					if (Float.isNaN(class437_9_.aFloat4903))
						return;
					i_7_ = ((int) class437_9_.aFloat4903 - (class592.localX * 235453015 << 9));
					i_8_ = ((int) class437_9_.aFloat4905 - (class592.localY * 1704054549 << 9));
					if (i_7_ < 0 || i_8_ < 0 || (i_7_ >> 9 >= (class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334]).length) || i_8_ >> 9 >= (class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_7_ >> 9]).length)
						return;
				} else if (1 == Class562.anInt7564 * 2097396553) {
					i_7_ = (int) class437.aFloat4903;
					i_8_ = (int) class437.aFloat4905;
				} else {
					i_7_ = JS5FileQueue.anInt8764 * -1811762071;
					i_8_ = Class59.anInt755 * 2073053253;
				}
				if (((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_7_ >> 9][i_8_ >> 9]) & 0x4) != 0)
					client.aBool11150 = true;
				else {
					int i_10_;
					int i_11_;
					if (2 == 2097396553 * Class562.anInt7564) {
						Class437 class437_12_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1640452456).method5767(1441424883);
						i_10_ = (((int) class437_12_.aFloat4903 >> 9) - class592.localX * 235453015);
						i_11_ = (((int) class437_12_.aFloat4905 >> 9) - 1704054549 * class592.localY);
						if (i_10_ < 0 || i_11_ < 0 || (i_10_ >= (class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981]).length) || i_11_ >= (class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_10_]).length)
							return;
					} else {
						i_10_ = 760427037 * Class77.anInt858 >> 9;
						i_11_ = Class497.anInt5563 * -1221225203 >> 9;
					}
					int i_13_ = i_7_ >> 9;
					int i_14_ = i_8_ >> 9;
					if (class451.method7281(i_10_, i_11_, (byte) 22)) {
						int i_15_ = Class53_Sub17.method17220((760427037 * Class77.anInt858), (Class497.anInt5563 * -1221225203), 3, -2116503495);
						if (Class285.anInt3085 * 805779207 >= i_15_)
							client.aBool11150 = true;
					} else {
						while_54_: do {
							if (1555328683 * Class678.anInt8639 < 2560) {
								int i_16_;
								if (i_13_ > i_10_)
									i_16_ = i_13_ - i_10_;
								else
									i_16_ = i_10_ - i_13_;
								int i_17_;
								if (i_14_ > i_11_)
									i_17_ = i_14_ - i_11_;
								else
									i_17_ = i_11_ - i_14_;
								if (i_16_ == 0 && 0 == i_17_ || i_16_ <= -client.aClass505_11019.method8292((byte) 114) || i_16_ >= client.aClass505_11019.method8292((byte) 79) || i_17_ <= -client.aClass505_11019.method8235(2142340886) || i_17_ >= client.aClass505_11019.method8235(2110637693)) {
									if (2 != 2097396553 * Class562.anInt7564)
										Class305.method5553(new StringBuilder().append(i_10_).append(Class31.aString300).append(i_11_).append(" ").append(i_13_).append(Class31.aString300).append(i_14_).append(" ").append(class592.localX * 235453015).append(Class31.aString300).append(class592.localY * 1704054549).toString(), new RuntimeException(), (byte) 1);
									break;
								}
								if (i_16_ > i_17_) {
									int i_18_ = i_17_ * 65536 / i_16_;
									int i_19_ = 32768;
									while_53_: do {
										for (;;) {
											if (i_13_ == i_10_)
												break while_53_;
											if (i_10_ < i_13_)
												i_10_++;
											else if (i_10_ > i_13_)
												i_10_--;
											if (((class451.aByteArrayArrayArray4962[(-860310981 * Class222.anInt2334)][i_10_][i_11_]) & 0x4) != 0) {
												client.aBool11150 = true;
												return;
											}
											if ((1 + i_11_ < (class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][i_10_]).length) && (0 != ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_10_][1 + i_11_]) & 0x4))) {
												client.aBool11150 = true;
												return;
											}
											if (i_11_ > 0 && (0 != ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_10_][i_11_ - 1]) & 0x4))) {
												client.aBool11150 = true;
												return;
											}
											i_19_ += i_18_;
											if (i_19_ >= 65536) {
												i_19_ -= 65536;
												if (i_11_ < i_14_) {
													i_11_++;
													if ((1 + i_11_ < (class451.aByteArrayArrayArray4962[((Class222.anInt2334) * -860310981)][i_10_]).length) && ((class451.aByteArrayArrayArray4962[((Class222.anInt2334) * -860310981)][i_10_][1 + i_11_]) & 0x4) != 0) {
														client.aBool11150 = true;
														return;
													}
												} else if (i_11_ > i_14_ && --i_11_ > 0 && ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_10_][i_11_ - 1]) & 0x4) != 0)
													break;
											}
										}
										client.aBool11150 = true;
										return;
									} while (false);
								} else {
									int i_20_ = 65536 * i_16_ / i_17_;
									int i_21_ = 32768;
									for (;;) {
										if (i_14_ == i_11_)
											break while_54_;
										if (i_11_ < i_14_)
											i_11_++;
										else if (i_11_ > i_14_)
											i_11_--;
										if (((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_10_][i_11_]) & 0x4) != 0) {
											client.aBool11150 = true;
											return;
										}
										if ((1 + i_10_ < (class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)]).length) && ((class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][1 + i_10_][i_11_]) & 0x4) != 0) {
											client.aBool11150 = true;
											return;
										}
										if (i_10_ > 0 && ((class451.aByteArrayArrayArray4962[(-860310981 * Class222.anInt2334)][i_10_ - 1][i_11_]) & 0x4) != 0) {
											client.aBool11150 = true;
											return;
										}
										i_21_ += i_20_;
										if (i_21_ >= 65536) {
											i_21_ -= 65536;
											if (i_10_ < i_13_) {
												if ((++i_10_ + 1 < (class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)]).length) && (0 != ((class451.aByteArrayArrayArray4962[((Class222.anInt2334) * -860310981)][i_10_ + 1][i_11_]) & 0x4))) {
													client.aBool11150 = true;
													return;
												}
											} else if (i_10_ > i_13_ && --i_10_ > 0 && ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_10_ - 1][i_11_]) & 0x4) != 0)
												break;
										}
									}
									client.aBool11150 = true;
									break;
								}
							}
						} while (false);
					}
				}
			} else {
				int i_22_ = Class53_Sub17.method17220(760427037 * Class77.anInt858, (Class497.anInt5563 * -1221225203), (-860310981 * Class222.anInt2334), 1254864545);
				if (i_22_ - Class285.anInt3085 * 805779207 < 3200 && 0 != ((class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][760427037 * Class77.anInt858 >> 9][-1221225203 * Class497.anInt5563 >> 9]) & 0x4))
					client.aBool11150 = true;
			}
		}
	}
}
