/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class426 {
	public int anInt4821;
	public Object anObject4822;
	static String aString4823;
	static int anInt4824;

	public boolean method6744(Object object) {
		if (!(object instanceof Class426))
			return false;
		Class426 class426_0_ = (Class426) object;
		if (class426_0_.anObject4822 == null && null != anObject4822)
			return false;
		if (anObject4822 == null && null != class426_0_.anObject4822)
			return false;
		if (-408785679 * anInt4821 == -408785679 * class426_0_.anInt4821 && class426_0_.anObject4822.equals(anObject4822))
			return true;
		return false;
	}

	public Class426(int i, Object object) {
		anInt4821 = i * 1756562449;
		anObject4822 = object;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class426))
			return false;
		Class426 class426_1_ = (Class426) object;
		if (class426_1_.anObject4822 == null && null != anObject4822)
			return false;
		if (anObject4822 == null && null != class426_1_.anObject4822)
			return false;
		if (-408785679 * anInt4821 == -408785679 * class426_1_.anInt4821 && class426_1_.anObject4822.equals(anObject4822))
			return true;
		return false;
	}

	public Class426(int i) {
		anInt4821 = i * 1756562449;
	}

	static final void method6745(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method4032((short) 13175);
	}

	static final void method6746(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_3_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class380.aClass473_3938.method7739(i_2_, (byte) -126).aCharArray11723[i_3_]);
	}

	static final void method6747(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class651.method10637((byte) 120).method82();
	}

	static final void method6748(int i) {
		byte[][][] is = client.aClass505_11019.method8247(1239016451);
		byte i_4_ = (byte) (-487274901 * client.anInt10981 - 4 & 0xff);
		int i_5_ = (-487274901 * client.anInt10981 % client.aClass505_11019.method8292((byte) 74));
		for (int i_6_ = 0; i_6_ < 4; i_6_++) {
			for (int i_7_ = 0; i_7_ < client.aClass505_11019.method8235(2062856453); i_7_++)
				is[i_6_][i_5_][i_7_] = i_4_;
		}
		if (3 != -860310981 * Class222.anInt2334) {
			for (int i_8_ = 0; i_8_ < 2; i_8_++) {
				client.anIntArray11141[i_8_] = -1000000;
				client.anIntArray11261[i_8_] = 1000000;
				client.anIntArray11119[i_8_] = 0;
				client.anIntArray11145[i_8_] = 1000000;
				client.anIntArray11144[i_8_] = 0;
			}
			Class437 class437 = (Class241.player.method10569().aClass437_4862);
			Class451 class451 = client.aClass505_11019.method8243(-251604751);
			Class560 class560 = client.aClass505_11019.method8241((byte) -111);
			if (Class562.anInt7564 * 2097396553 == 1 || 2 == Class562.anInt7564 * 2097396553 || JS5FileQueue.anInt8764 * -1811762071 != -1) {
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_9_;
				int i_10_;
				if (Class562.anInt7564 * 2097396553 == 2) {
					Class437 class437_11_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 70).method13908(403955791);
					if (Float.isNaN(class437_11_.aFloat4903))
						return;
					i_9_ = ((int) class437_11_.aFloat4903 - (235453015 * class592.localX << 9));
					i_10_ = ((int) class437_11_.aFloat4905 - (1704054549 * class592.localY << 9));
					if (i_9_ < 0 || i_10_ < 0 || (i_9_ >> 9 >= (class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334]).length) || i_10_ >> 9 >= (class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_9_ >> 9]).length)
						return;
				} else if (Class562.anInt7564 * 2097396553 == 1) {
					i_9_ = (int) class437.aFloat4903;
					i_10_ = (int) class437.aFloat4905;
				} else {
					i_9_ = -1811762071 * JS5FileQueue.anInt8764;
					i_10_ = 2073053253 * Class59.anInt755;
				}
				if (0 != ((class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][i_9_ >> 9][i_10_ >> 9]) & 0x4))
					Class199.method3686(class560.aClass565ArrayArrayArray7508, 0, i_9_ >> 9, i_10_ >> 9, false, (byte) 15);
				else {
					int i_12_;
					int i_13_;
					if (2 == 2097396553 * Class562.anInt7564) {
						Class437 class437_14_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1542427529).method5767(-281579436);
						i_12_ = (((int) class437_14_.aFloat4903 >> 9) - class592.localX * 235453015);
						i_13_ = (((int) class437_14_.aFloat4905 >> 9) - class592.localY * 1704054549);
						if (i_12_ < 0 || i_13_ < 0 || (i_12_ >= (class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981]).length) || i_13_ >= (class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][i_12_]).length)
							return;
					} else {
						i_12_ = 760427037 * Class77.anInt858 >> 9;
						i_13_ = -1221225203 * Class497.anInt5563 >> 9;
					}
					int i_15_ = i_9_ >> 9;
					int i_16_ = i_10_ >> 9;
					if (class451.method7281(i_12_, i_13_, (byte) 117)) {
						int i_17_ = Class53_Sub17.method17220((Class77.anInt858 * 760427037), (-1221225203 * Class497.anInt5563), 3, 1699446025);
						if (805779207 * Class285.anInt3085 >= i_17_)
							Class199.method3686(class560.aClass565ArrayArrayArray7508, 1, i_12_, i_13_, false, (byte) 77);
					} else {
						while_171_: do {
							if (1555328683 * Class678.anInt8639 < 2560) {
								int i_18_;
								if (i_15_ > i_12_)
									i_18_ = i_15_ - i_12_;
								else
									i_18_ = i_12_ - i_15_;
								int i_19_;
								if (i_16_ > i_13_)
									i_19_ = i_16_ - i_13_;
								else
									i_19_ = i_13_ - i_16_;
								if (0 == i_18_ && i_19_ == 0 || i_18_ <= -client.aClass505_11019.method8292((byte) 126) || i_18_ >= client.aClass505_11019.method8292((byte) 30) || i_19_ <= -client.aClass505_11019.method8235(2139989696) || i_19_ >= client.aClass505_11019.method8235(2140445056)) {
									if (2 != 2097396553 * Class562.anInt7564)
										Class305.method5553(new StringBuilder().append(i_12_).append(Class31.aString300).append(i_13_).append(" ").append(i_15_).append(Class31.aString300).append(i_16_).append(" ").append(235453015 * class592.localX).append(Class31.aString300).append(1704054549 * class592.localY).toString(), new RuntimeException(), (byte) 1);
									break;
								}
								if (i_18_ > i_19_) {
									int i_20_ = i_19_ * 65536 / i_18_;
									int i_21_ = 32768;
									while_170_: do {
										for (;;) {
											if (i_15_ == i_12_)
												break while_170_;
											if (i_12_ < i_15_)
												i_12_++;
											else if (i_12_ > i_15_)
												i_12_--;
											if (0 != ((class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][i_12_][i_13_]) & 0x4)) {
												Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_, i_13_, false, (byte) 96);
												break while_170_;
											}
											if ((i_13_ + 1 < (class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][i_12_]).length) && ((class451.aByteArrayArrayArray4962[(-860310981 * Class222.anInt2334)][i_12_][1 + i_13_]) & 0x4) != 0) {
												Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_, i_13_ + 1, false, (byte) 105);
												break while_170_;
											}
											if (i_13_ > 0 && ((class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][i_12_][i_13_ - 1]) & 0x4) != 0) {
												Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_, i_13_ - 1, false, (byte) 46);
												break while_170_;
											}
											i_21_ += i_20_;
											if (i_21_ >= 65536) {
												i_21_ -= 65536;
												if (i_13_ < i_16_) {
													if ((++i_13_ + 1 < (class451.aByteArrayArrayArray4962[((Class222.anInt2334) * -860310981)][i_12_]).length) && (0 != ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_12_][1 + i_13_]) & 0x4))) {
														Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_, i_13_ + 1, false, (byte) 13);
														break while_170_;
													}
												} else if (i_13_ > i_16_ && --i_13_ > 0 && (0 != ((class451.aByteArrayArrayArray4962[((Class222.anInt2334) * -860310981)][i_12_][(i_13_ - 1)]) & 0x4)))
													break;
											}
										}
										Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_, i_13_ - 1, false, (byte) 115);
									} while (false);
								} else {
									int i_22_ = 65536 * i_18_ / i_19_;
									int i_23_ = 32768;
									for (;;) {
										if (i_16_ == i_13_)
											break while_171_;
										if (i_13_ < i_16_)
											i_13_++;
										else if (i_13_ > i_16_)
											i_13_--;
										if (0 != ((class451.aByteArrayArrayArray4962[(-860310981 * Class222.anInt2334)][i_12_][i_13_]) & 0x4)) {
											Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_, i_13_, false, (byte) 116);
											break while_171_;
										}
										if ((i_12_ + 1 < (class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))]).length) && ((class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][1 + i_12_][i_13_]) & 0x4) != 0) {
											Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_ + 1, i_13_, false, (byte) 4);
											break while_171_;
										}
										if (i_12_ > 0 && ((class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)][i_12_ - 1][i_13_]) & 0x4) != 0) {
											Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_ - 1, i_13_, false, (byte) 119);
											break while_171_;
										}
										i_23_ += i_22_;
										if (i_23_ >= 65536) {
											i_23_ -= 65536;
											if (i_12_ < i_15_) {
												if ((++i_12_ + 1 < (class451.aByteArrayArrayArray4962[(Class222.anInt2334 * -860310981)]).length) && ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_12_ + 1][i_13_]) & 0x4) != 0) {
													Class199.method3686((class560.aClass565ArrayArrayArray7508), 1, i_12_ + 1, i_13_, false, (byte) 108);
													break while_171_;
												}
											} else if (i_12_ > i_15_ && --i_12_ > 0 && ((class451.aByteArrayArrayArray4962[(-860310981 * (Class222.anInt2334))][i_12_ - 1][i_13_]) & 0x4) != 0)
												break;
										}
									}
									Class199.method3686(class560.aClass565ArrayArrayArray7508, 1, i_12_ - 1, i_13_, false, (byte) 123);
								}
							}
						} while (false);
					}
				}
			} else {
				int i_24_ = Class53_Sub17.method17220(Class77.anInt858 * 760427037, (Class497.anInt5563 * -1221225203), (-860310981 * Class222.anInt2334), -454388884);
				if (i_24_ - Class285.anInt3085 * 805779207 < 3200 && ((class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][760427037 * Class77.anInt858 >> 9][-1221225203 * Class497.anInt5563 >> 9]) & 0x4) != 0)
					Class199.method3686(class560.aClass565ArrayArrayArray7508, 1, 760427037 * Class77.anInt858 >> 9, -1221225203 * Class497.anInt5563 >> 9, false, (byte) 65);
			}
		}
	}

	public static void method6749(boolean bool, boolean bool_25_, byte i) {
		Class569.aBool7635 = bool;
		Class569.aBool7652 = bool_25_;
	}

	public static Class593[] method6750(int i) {
		return (new Class593[] { Class593.aClass593_7812, Class593.aClass593_7813, Class593.aClass593_7811 });
	}

	public static Class420[] method6751(int i) {
		return (new Class420[] { Class420.aClass420_4766, Class420.aClass420_4737, Class420.aClass420_4742, Class420.aClass420_4729, Class420.aClass420_4767, Class420.aClass420_4756, Class420.aClass420_4760, Class420.aClass420_4730, Class420.aClass420_4762, Class420.aClass420_4763, Class420.aClass420_4751, Class420.aClass420_4748, Class420.aClass420_4774, Class420.aClass420_4745, Class420.aClass420_4735, Class420.aClass420_4728, Class420.aClass420_4732, Class420.aClass420_4764, Class420.aClass420_4749, Class420.aClass420_4738, Class420.aClass420_4755, Class420.aClass420_4731, Class420.aClass420_4739, Class420.aClass420_4754, Class420.aClass420_4747, Class420.aClass420_4741, Class420.aClass420_4759, Class420.aClass420_4727, Class420.aClass420_4768, Class420.aClass420_4734, Class420.aClass420_4736, Class420.aClass420_4750, Class420.aClass420_4758, Class420.aClass420_4725, Class420.aClass420_4776, Class420.aClass420_4757, Class420.aClass420_4772, Class420.aClass420_4746, Class420.aClass420_4773, Class420.aClass420_4771, Class420.aClass420_4769, Class420.aClass420_4775, Class420.aClass420_4753, Class420.aClass420_4740, Class420.aClass420_4761, Class420.aClass420_4743, Class420.aClass420_4744, Class420.aClass420_4752, Class420.aClass420_4770, Class420.aClass420_4733, Class420.aClass420_4765, Class420.aClass420_4726 });
	}
}
