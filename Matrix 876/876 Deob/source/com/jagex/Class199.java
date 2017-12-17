/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class199 implements Interface24 {
	Class217 this$0;

	public void method133(Object object, int i) {
		method3680((Interface71) object, -1276648076);
	}

	void method3680(Interface71 interface71, int i) {
		Iterator iterator = this$0.method3862(2104033257).iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			if (class489.method7973(598407683) == interface71) {
				class489.method7957(1737567117);
				iterator.remove();
			}
		}
	}

	public void method135(Object object) {
		method3680((Interface71) object, -1395334134);
	}

	Class199(Class217 class217) {
		this$0 = class217;
	}

	public void method134(Object object) {
		method3680((Interface71) object, -1294201059);
	}

	void method3681(Interface71 interface71) {
		Iterator iterator = this$0.method3862(1300148059).iterator();
		while (iterator.hasNext()) {
			Class489 class489 = (Class489) iterator.next();
			if (class489.method7973(1647394979) == interface71) {
				class489.method7957(2053621041);
				iterator.remove();
			}
		}
	}

	static void method3682(Class523_Sub27_Sub8 class523_sub27_sub8, int i, int i_0_) {
		if (Class36.aBool326) {
			Class10 class10 = client.method17697(1149270477);
			int i_1_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.next(768418218)) {
				int i_2_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
				if (i_2_ > i_1_)
					i_1_ = i_2_;
			}
			i_1_ += 8;
			int i_3_ = ((1060081949 * class523_sub27_sub8.anInt11719 * (Class36.anInt323 * 1648921847)) + 21);
			Class705.anInt8818 = ((1060081949 * class523_sub27_sub8.anInt11719 * (Class36.anInt323 * 1648921847)) + (Class36.aBool353 ? 26 : 22)) * -1633516335;
			int i_4_ = (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390);
			if (i_4_ + i_1_ > 2141365743 * Class170.anInt1833)
				i_4_ = -1744502791 * Whirlpool.anInt231 - i_1_;
			if (i_4_ < 0)
				i_4_ = 0;
			int i_5_ = (Class36.aBool353 ? 1 + (20 + class10.anInt76 * -1669009881) : 31);
			int i_6_ = 1 + (i - i_5_ + -1669009881 * class10.anInt76);
			if (i_6_ + i_3_ > -495986435 * Class254.anInt2742)
				i_6_ = -495986435 * Class254.anInt2742 - i_3_;
			if (i_6_ < 0)
				i_6_ = 0;
			Class523_Sub7.anInt10405 = i_4_ * -299145305;
			Class301.anInt3330 = i_6_ * 848152715;
			Class426.anInt4824 = i_1_ * -1979354241;
			Class36.aClass523_Sub27_Sub8_328 = class523_sub27_sub8;
		}
	}

	static final void method3683(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -222228463 * class250.anInt2618;
	}

	static final void method3684(Class669 class669, byte i) {
		Class97.method1776(575906096);
	}

	static final void method3685(Class669 class669, int i) {
		class669.anInt8558 -= 2103927403;
	}

	static final boolean method3686(Class565[][][] class565s, int i, int i_7_, int i_8_, boolean bool, byte i_9_) {
		byte[][][] is = client.aClass505_11019.method8247(351237677);
		byte i_10_ = bool ? (byte) 1 : (byte) (-487274901 * client.anInt10981 & 0xff);
		if (i_10_ == is[-860310981 * Class222.anInt2334][i_7_][i_8_])
			return false;
		Class451 class451 = client.aClass505_11019.method8243(-240314525);
		if (0 == ((class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][i_7_][i_8_]) & 0x4))
			return false;
		int i_11_ = 0;
		int i_12_ = 0;
		client.anIntArray11084[i_11_] = i_7_;
		client.anIntArray11085[i_11_++] = i_8_;
		is[-860310981 * Class222.anInt2334][i_7_][i_8_] = i_10_;
		while (i_12_ != i_11_) {
			int i_13_ = client.anIntArray11084[i_12_] & 0xffff;
			int i_14_ = client.anIntArray11084[i_12_] >> 16 & 0xff;
			int i_15_ = client.anIntArray11084[i_12_] >> 24 & 0xff;
			int i_16_ = client.anIntArray11085[i_12_] & 0xffff;
			int i_17_ = client.anIntArray11085[i_12_] >> 16 & 0xff;
			i_12_ = 1 + i_12_ & 0xfff;
			boolean bool_18_ = false;
			if (((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_13_][i_16_]) & 0x4) == 0)
				bool_18_ = true;
			boolean bool_19_ = false;
			if (class565s != null) {
				int i_20_ = Class222.anInt2334 * -860310981 + 1;
				while_44_: for (/**/; i_20_ <= 3; i_20_++) {
					if (class565s[i_20_] != null && ((class451.aByteArrayArrayArray4962[i_20_][i_13_][i_16_]) & 0x8) == 0) {
						if (bool_18_ && null != class565s[i_20_][i_13_][i_16_]) {
							if (null != (class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7587)) {
								int i_21_ = Class419.method6668(i_14_, (short) -14440);
								if (((class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7587.aShort11814) == i_21_) || ((class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7596) != null && i_21_ == (class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7596.aShort11814)))
									continue;
								if (i_15_ != 0) {
									int i_22_ = Class419.method6668(i_15_, (short) 20332);
									if ((class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7587.aShort11814) == i_22_ || (null != (class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7596) && (i_22_ == (class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7596.aShort11814))))
										continue;
								}
								if (i_17_ != 0) {
									int i_23_ = Class419.method6668(i_17_, (short) 7650);
									if (i_23_ == (class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7587.aShort11814) || ((class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7596) != null && (class565s[i_20_][i_13_][i_16_].aClass647_Sub1_Sub4_7596.aShort11814) == i_23_))
										continue;
								}
							}
							Class565 class565 = class565s[i_20_][i_13_][i_16_];
							if (class565.aClass548_7593 != null) {
								for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
									Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
									if (class647_sub1_sub3 instanceof Interface61) {
										Interface61 interface61 = (Interface61) class647_sub1_sub3;
										int i_24_ = interface61.method69(1419389810);
										int i_25_ = interface61.method390(1259048815);
										if (21 == i_24_)
											i_24_ = 19;
										int i_26_ = i_24_ | i_25_ << 6;
										if (i_14_ == i_26_ || 0 != i_15_ && i_26_ == i_15_ || 0 != i_17_ && i_17_ == i_26_)
											continue while_44_;
									}
								}
							}
						}
						Class565 class565 = class565s[i_20_][i_13_][i_16_];
						if (null != class565 && class565.aClass548_7593 != null) {
							for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
								Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
								if ((class647_sub1_sub3.aShort11749 != class647_sub1_sub3.aShort11750) || (class647_sub1_sub3.aShort11751 != class647_sub1_sub3.aShort11752)) {
									short i_27_ = class647_sub1_sub3.aShort11750;
									short i_28_ = class647_sub1_sub3.aShort11749;
									short i_29_ = class647_sub1_sub3.aShort11751;
									short i_30_ = class647_sub1_sub3.aShort11752;
									int i_31_ = Math.max(0, Math.min(i_27_, (is[i_20_].length - 1)));
									int i_32_ = Math.max(0, Math.min(i_29_, (is[i_20_][0]).length - 1));
									int i_33_ = Math.max(0, Math.min(i_28_, (is[i_20_].length - 1)));
									int i_34_ = Math.max(0, Math.min(i_30_, (is[i_20_][0]).length - 1));
									for (/**/; i_31_ <= i_33_; i_31_++) {
										for (/**/; i_32_ <= i_34_; i_32_++)
											is[i_20_][i_31_][i_32_] = i_10_;
									}
								}
							}
						}
						is[i_20_][i_13_][i_16_] = i_10_;
						bool_19_ = true;
					}
				}
			}
			if (bool_19_) {
				int i_35_ = client.aClass505_11019.method8241((byte) -92).aClass142Array7509[1 + Class222.anInt2334 * -860310981].method2321(i_13_, i_16_, 1755013757);
				if (client.anIntArray11141[i] < i_35_)
					client.anIntArray11141[i] = i_35_;
				int i_36_ = i_13_ << 9;
				int i_37_ = i_16_ << 9;
				if (client.anIntArray11261[i] > i_36_)
					client.anIntArray11261[i] = i_36_;
				else if (client.anIntArray11119[i] < i_36_)
					client.anIntArray11119[i] = i_36_;
				if (client.anIntArray11145[i] > i_37_)
					client.anIntArray11145[i] = i_37_;
				else if (client.anIntArray11144[i] < i_37_)
					client.anIntArray11144[i] = i_37_;
			}
			if (!bool_18_) {
				if (i_13_ >= 1 && (is[Class222.anInt2334 * -860310981][i_13_ - 1][i_16_] != i_10_)) {
					client.anIntArray11084[i_11_] = i_13_ - 1 | 0x120000 | ~0x2cffffff;
					client.anIntArray11085[i_11_] = i_16_ | 0x130000;
					i_11_ = i_11_ + 1 & 0xfff;
					is[-860310981 * Class222.anInt2334][i_13_ - 1][i_16_] = i_10_;
				}
				if (++i_16_ < client.aClass505_11019.method8235(2106693153)) {
					if (i_13_ - 1 >= 0 && (is[Class222.anInt2334 * -860310981][i_13_ - 1][i_16_]) != i_10_ && 0 == ((class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][i_13_][i_16_]) & 0x4) && ((class451.aByteArrayArrayArray4962[-860310981 * Class222.anInt2334][i_13_ - 1][i_16_ - 1]) & 0x4) == 0) {
						client.anIntArray11084[i_11_] = i_13_ - 1 | 0x120000 | 0x52000000;
						client.anIntArray11085[i_11_] = i_16_ | 0x130000;
						i_11_ = 1 + i_11_ & 0xfff;
						is[-860310981 * Class222.anInt2334][i_13_ - 1][i_16_] = i_10_;
					}
					if (is[Class222.anInt2334 * -860310981][i_13_][i_16_] != i_10_) {
						client.anIntArray11084[i_11_] = i_13_ | 0x520000 | 0x13000000;
						client.anIntArray11085[i_11_] = i_16_ | 0x530000;
						i_11_ = i_11_ + 1 & 0xfff;
						is[Class222.anInt2334 * -860310981][i_13_][i_16_] = i_10_;
					}
					if ((i_13_ + 1 < client.aClass505_11019.method8292((byte) 10)) && (is[-860310981 * Class222.anInt2334][i_13_ + 1][i_16_]) != i_10_ && 0 == ((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_13_][i_16_]) & 0x4) && ((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_13_ + 1][i_16_ - 1]) & 0x4) == 0) {
						client.anIntArray11084[i_11_] = 1 + i_13_ | 0x520000 | ~0x6dffffff;
						client.anIntArray11085[i_11_] = i_16_ | 0x530000;
						i_11_ = i_11_ + 1 & 0xfff;
						is[Class222.anInt2334 * -860310981][1 + i_13_][i_16_] = i_10_;
					}
				}
				i_16_--;
				if (1 + i_13_ < client.aClass505_11019.method8292((byte) 86) && i_10_ != (is[Class222.anInt2334 * -860310981][i_13_ + 1][i_16_])) {
					client.anIntArray11084[i_11_] = 1 + i_13_ | 0x920000 | 0x53000000;
					client.anIntArray11085[i_11_] = i_16_ | 0x930000;
					i_11_ = i_11_ + 1 & 0xfff;
					is[Class222.anInt2334 * -860310981][i_13_ + 1][i_16_] = i_10_;
				}
				if (--i_16_ >= 0) {
					if (i_13_ - 1 >= 0 && (is[Class222.anInt2334 * -860310981][i_13_ - 1][i_16_]) != i_10_ && 0 == ((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_13_][i_16_]) & 0x4) && 0 == ((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_13_ - 1][i_16_ + 1]) & 0x4)) {
						client.anIntArray11084[i_11_] = i_13_ - 1 | 0xd20000 | 0x12000000;
						client.anIntArray11085[i_11_] = i_16_ | 0xd30000;
						i_11_ = 1 + i_11_ & 0xfff;
						is[-860310981 * Class222.anInt2334][i_13_ - 1][i_16_] = i_10_;
					}
					if (i_10_ != is[Class222.anInt2334 * -860310981][i_13_][i_16_]) {
						client.anIntArray11084[i_11_] = i_13_ | 0xd20000 | ~0x6cffffff;
						client.anIntArray11085[i_11_] = i_16_ | 0xd30000;
						i_11_ = i_11_ + 1 & 0xfff;
						is[Class222.anInt2334 * -860310981][i_13_][i_16_] = i_10_;
					}
					if ((i_13_ + 1 < client.aClass505_11019.method8292((byte) 101)) && (is[Class222.anInt2334 * -860310981][i_13_ + 1][i_16_]) != i_10_ && ((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][i_13_][i_16_]) & 0x4) == 0 && 0 == ((class451.aByteArrayArrayArray4962[Class222.anInt2334 * -860310981][1 + i_13_][1 + i_16_]) & 0x4)) {
						client.anIntArray11084[i_11_] = i_13_ + 1 | 0x920000 | ~0x2dffffff;
						client.anIntArray11085[i_11_] = i_16_ | 0x930000;
						i_11_ = i_11_ + 1 & 0xfff;
						is[Class222.anInt2334 * -860310981][i_13_ + 1][i_16_] = i_10_;
					}
				}
			}
		}
		if (-1000000 != client.anIntArray11141[i]) {
			client.anIntArray11141[i] += 40;
			client.anIntArray11261[i] -= 512;
			client.anIntArray11119[i] += 512;
			client.anIntArray11144[i] += 512;
			client.anIntArray11145[i] -= 512;
		}
		return true;
	}

	public static void method3687(int i) {
		Class569.aClass148_7626 = null;
	}

	public static Class523_Sub27_Sub15 method3688(int i, int i_38_) {
		return ((Class523_Sub27_Sub15) Class271.aClass14_2876.getFromIndex((long) i));
	}
}
