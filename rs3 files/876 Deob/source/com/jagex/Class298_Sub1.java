/* Class298_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class298_Sub1 extends Class298 {
	int anInt10001 = 0;

	public void method15547(RSBuffer class523_sub34, int i) {
		int i_0_ = class523_sub34.offset * 2349011;
		int i_1_ = class523_sub34.readUnsignedByte(-296668847);
		method5311(Class522.method8659(i_1_ & 0x1, (byte) 6), 2050042571);
		if (0 != (i_1_ & 0x8)) {
			Class294 class294 = Class701.method14107(class523_sub34.readUnsignedByte(1757053969), (short) -6204);
			if (class294 != aClass294_3226) {
				try {
					method5328(class294, true, (short) 18145);
				} catch (Exception_Sub7 exception_sub7) {
					exception_sub7.printStackTrace();
				}
			}
		}
		if ((i_1_ & 0x10) != 0) {
			Class291 class291 = Class270.method4987(class523_sub34.readUnsignedByte(-331989432), 1651566051);
			if (class291 != aClass291_3199) {
				try {
					method5313(class291, true, (byte) -122);
				} catch (Exception_Sub7 exception_sub7) {
					exception_sub7.printStackTrace();
				}
			}
		}
		if (1 == (i_1_ >> 7 & 0x1)) {
			int i_2_ = class523_sub34.readUnsignedShort(-1463574572);
			if (1 == (i_2_ >> Class299.aClass299_3238.anInt3231 * 1919834765 & 0x1))
				aClass437_3205.method6941(class523_sub34);
			if (1 == (i_2_ >> 1919834765 * Class299.aClass299_3239.anInt3231 & 0x1))
				aClass437_3221.method6941(class523_sub34);
			if ((i_2_ >> 1919834765 * Class299.aClass299_3234.anInt3231 & 0x1) == 1)
				aClass437_3203.method6941(class523_sub34);
			if (1 == (i_2_ >> Class299.aClass299_3245.anInt3231 * 1919834765 & 0x1))
				aClass437_3209.method6941(class523_sub34);
			if (1 == (i_2_ >> 1919834765 * Class299.aClass299_3235.anInt3231 & 0x1)) {
				aFloat3220 = class523_sub34.method16293(-1439492244);
				aFloat3198 = class523_sub34.method16293(-1220837262);
			}
			if (1 == (i_2_ >> 1919834765 * Class299.aClass299_3236.anInt3231 & 0x1)) {
				aFloat3224 = class523_sub34.method16293(-1381559825);
				aFloat3225 = class523_sub34.method16293(-761941060);
			}
			if (1 == (i_2_ >> Class299.aClass299_3237.anInt3231 * 1919834765 & 0x1))
				aClass295_3217 = Class189.method3597(class523_sub34.readUnsignedByte(1917470071), -1981069544);
			if (1 == (i_2_ >> 1919834765 * Class299.aClass299_3233.anInt3231 & 0x1)) {
				anInt3196 = class523_sub34.read24BitInt(-590391216) * -567684075;
				class523_sub34.readUnsignedByte(-360219688);
			}
			if (1 == (i_2_ >> 1919834765 * Class299.aClass299_3246.anInt3231 & 0x1)) {
				int i_3_ = class523_sub34.readUnsignedByte(392019354);
				aBool3210 = (i_3_ & 0x1) == 1;
				aBool3227 = 2 == (i_3_ & 0x2);
			}
			if (1 == (i_2_ >> 1919834765 * Class299.aClass299_3240.anInt3231 & 0x1)) {
				int i_4_ = class523_sub34.readUnsignedByte(404943374);
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					int i_6_ = class523_sub34.readUnsignedByte(122999779);
					int i_7_ = class523_sub34.readUnsignedByte(-409560929);
					if (i_6_ == 0)
						method5389(i_7_, (byte) 45);
					else {
						Class266 class266 = Class513.method8581(class523_sub34.readUnsignedByte(1979001957), -691168059);
						boolean bool = true;
						Iterator iterator = aClass14_3230.iterator();
						while (iterator.hasNext()) {
							Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
							if (i_7_ == (class523_sub27_sub13.anInt11745 * 1056957445)) {
								class523_sub27_sub13.method18138(class523_sub34, -912105141);
								bool = false;
								break;
							}
						}
						if (bool)
							method5366(Class688_Sub5.method17203(i_7_, class266, class523_sub34, 2141365743), (byte) 2);
					}
				}
			}
			if ((i_2_ >> Class299.aClass299_3241.anInt3231 * 1919834765 & 0x1) == 1) {
				anInt3228 = class523_sub34.readUnsignedShort(-87128554) * -436452313;
				aFloat3229 = class523_sub34.method16293(-1699320547);
			}
			if ((i_2_ >> Class299.aClass299_3242.anInt3231 * 1919834765 & 0x1) == 1)
				aClass303_3202 = Class194_Sub9.method15505(class523_sub34.readUnsignedByte(2003405876), (byte) 0);
			if ((i_2_ >> Class299.aClass299_3243.anInt3231 * 1919834765 & 0x1) == 1) {
				aClass437_3208.method6941(class523_sub34);
				aClass437_3216.method6941(class523_sub34);
				aFloat3218 = class523_sub34.method16293(-539443869);
				aFloat3219 = class523_sub34.method16293(-1244006114);
			}
			if ((i_2_ >> Class299.aClass299_3244.anInt3231 * 1919834765 & 0x1) == 1)
				class523_sub34.method16293(-734754311);
			if ((i_2_ >> Class299.aClass299_3232.anInt3231 * 1919834765 & 0x1) == 1)
				aFloat3204 = class523_sub34.method16293(-1058293245);
		}
		if (null != aClass688_3201 && 1 == (i_1_ >> 5 & 0x1))
			aClass688_3201.method13910(class523_sub34, -206875518);
		if (aClass328_3200 != null && 1 == (i_1_ >> 6 & 0x1))
			aClass328_3200.method5760(class523_sub34, -406957251);
		if (class523_sub34.offset * 2349011 - i_0_ != i)
			throw new RuntimeException(new StringBuilder().append(class523_sub34.offset * 2349011 - i_0_).append(",").append(i).toString());
	}

	public int method15548(int i) {
		anInt10001 += -1148292201;
		if (anInt10001 * -99402713 == 126)
			anInt10001 = 0;
		return anInt10001 * -99402713;
	}

	public void method15549(RSBuffer class523_sub34, int i, byte i_8_) {
		int i_9_ = class523_sub34.offset * 2349011;
		int i_10_ = class523_sub34.readUnsignedByte(-1327908024);
		method5311(Class522.method8659(i_10_ & 0x1, (byte) 34), 1953129391);
		if (0 != (i_10_ & 0x8)) {
			Class294 class294 = Class701.method14107(class523_sub34.readUnsignedByte(100490503), (short) -14161);
			if (class294 != aClass294_3226) {
				try {
					method5328(class294, true, (short) 21792);
				} catch (Exception_Sub7 exception_sub7) {
					exception_sub7.printStackTrace();
				}
			}
		}
		if ((i_10_ & 0x10) != 0) {
			Class291 class291 = Class270.method4987(class523_sub34.readUnsignedByte(-1690150355), 327274141);
			if (class291 != aClass291_3199) {
				try {
					method5313(class291, true, (byte) -2);
				} catch (Exception_Sub7 exception_sub7) {
					exception_sub7.printStackTrace();
				}
			}
		}
		if (1 == (i_10_ >> 7 & 0x1)) {
			int i_11_ = class523_sub34.readUnsignedShort(-1642929095);
			if (1 == (i_11_ >> Class299.aClass299_3238.anInt3231 * 1919834765 & 0x1))
				aClass437_3205.method6941(class523_sub34);
			if (1 == (i_11_ >> 1919834765 * Class299.aClass299_3239.anInt3231 & 0x1))
				aClass437_3221.method6941(class523_sub34);
			if ((i_11_ >> 1919834765 * Class299.aClass299_3234.anInt3231 & 0x1) == 1)
				aClass437_3203.method6941(class523_sub34);
			if (1 == (i_11_ >> Class299.aClass299_3245.anInt3231 * 1919834765 & 0x1))
				aClass437_3209.method6941(class523_sub34);
			if (1 == (i_11_ >> 1919834765 * Class299.aClass299_3235.anInt3231 & 0x1)) {
				aFloat3220 = class523_sub34.method16293(-1763366537);
				aFloat3198 = class523_sub34.method16293(-742619444);
			}
			if (1 == (i_11_ >> 1919834765 * Class299.aClass299_3236.anInt3231 & 0x1)) {
				aFloat3224 = class523_sub34.method16293(-1371839749);
				aFloat3225 = class523_sub34.method16293(-876795871);
			}
			if (1 == (i_11_ >> Class299.aClass299_3237.anInt3231 * 1919834765 & 0x1))
				aClass295_3217 = Class189.method3597(class523_sub34.readUnsignedByte(1959434008), -1981069544);
			if (1 == (i_11_ >> 1919834765 * Class299.aClass299_3233.anInt3231 & 0x1)) {
				anInt3196 = class523_sub34.read24BitInt(-714392231) * -567684075;
				class523_sub34.readUnsignedByte(1538467627);
			}
			if (1 == (i_11_ >> 1919834765 * Class299.aClass299_3246.anInt3231 & 0x1)) {
				int i_12_ = class523_sub34.readUnsignedByte(1574146475);
				aBool3210 = (i_12_ & 0x1) == 1;
				aBool3227 = 2 == (i_12_ & 0x2);
			}
			if (1 == (i_11_ >> 1919834765 * Class299.aClass299_3240.anInt3231 & 0x1)) {
				int i_13_ = class523_sub34.readUnsignedByte(1511118554);
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					int i_15_ = class523_sub34.readUnsignedByte(683364952);
					int i_16_ = class523_sub34.readUnsignedByte(33664262);
					if (i_15_ == 0)
						method5389(i_16_, (byte) 71);
					else {
						Class266 class266 = Class513.method8581(class523_sub34.readUnsignedByte(626830709), -1747529638);
						boolean bool = true;
						Iterator iterator = aClass14_3230.iterator();
						while (iterator.hasNext()) {
							Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
							if (i_16_ == (class523_sub27_sub13.anInt11745 * 1056957445)) {
								class523_sub27_sub13.method18138(class523_sub34, 107227110);
								bool = false;
								break;
							}
						}
						if (bool)
							method5366(Class688_Sub5.method17203(i_16_, class266, class523_sub34, 2141365743), (byte) 2);
					}
				}
			}
			if ((i_11_ >> Class299.aClass299_3241.anInt3231 * 1919834765 & 0x1) == 1) {
				anInt3228 = class523_sub34.readUnsignedShort(-745622129) * -436452313;
				aFloat3229 = class523_sub34.method16293(-1605685755);
			}
			if ((i_11_ >> Class299.aClass299_3242.anInt3231 * 1919834765 & 0x1) == 1)
				aClass303_3202 = Class194_Sub9.method15505(class523_sub34.readUnsignedByte(-1761797371), (byte) 0);
			if ((i_11_ >> Class299.aClass299_3243.anInt3231 * 1919834765 & 0x1) == 1) {
				aClass437_3208.method6941(class523_sub34);
				aClass437_3216.method6941(class523_sub34);
				aFloat3218 = class523_sub34.method16293(-365955108);
				aFloat3219 = class523_sub34.method16293(-404478751);
			}
			if ((i_11_ >> Class299.aClass299_3244.anInt3231 * 1919834765 & 0x1) == 1)
				class523_sub34.method16293(-1279341748);
			if ((i_11_ >> Class299.aClass299_3232.anInt3231 * 1919834765 & 0x1) == 1)
				aFloat3204 = class523_sub34.method16293(-1374149813);
		}
		if (null != aClass688_3201 && 1 == (i_10_ >> 5 & 0x1))
			aClass688_3201.method13910(class523_sub34, -1017938297);
		if (aClass328_3200 != null && 1 == (i_10_ >> 6 & 0x1))
			aClass328_3200.method5760(class523_sub34, -406957251);
		if (class523_sub34.offset * 2349011 - i_9_ != i)
			throw new RuntimeException(new StringBuilder().append(class523_sub34.offset * 2349011 - i_9_).append(",").append(i).toString());
	}

	public int method15550() {
		anInt10001 += -1148292201;
		if (anInt10001 * -99402713 == 126)
			anInt10001 = 0;
		return anInt10001 * -99402713;
	}

	public int method15551() {
		anInt10001 += -1148292201;
		if (anInt10001 * -99402713 == 126)
			anInt10001 = 0;
		return anInt10001 * -99402713;
	}

	public void method15552(RSBuffer class523_sub34, int i) {
		int i_17_ = class523_sub34.offset * 2349011;
		int i_18_ = class523_sub34.readUnsignedByte(679171301);
		method5311(Class522.method8659(i_18_ & 0x1, (byte) 62), 1972964634);
		if (0 != (i_18_ & 0x8)) {
			Class294 class294 = Class701.method14107(class523_sub34.readUnsignedByte(831058683), (short) -11131);
			if (class294 != aClass294_3226) {
				try {
					method5328(class294, true, (short) 25049);
				} catch (Exception_Sub7 exception_sub7) {
					exception_sub7.printStackTrace();
				}
			}
		}
		if ((i_18_ & 0x10) != 0) {
			Class291 class291 = Class270.method4987(class523_sub34.readUnsignedByte(-473627674), -1275404649);
			if (class291 != aClass291_3199) {
				try {
					method5313(class291, true, (byte) -29);
				} catch (Exception_Sub7 exception_sub7) {
					exception_sub7.printStackTrace();
				}
			}
		}
		if (1 == (i_18_ >> 7 & 0x1)) {
			int i_19_ = class523_sub34.readUnsignedShort(-522774770);
			if (1 == (i_19_ >> Class299.aClass299_3238.anInt3231 * 1919834765 & 0x1))
				aClass437_3205.method6941(class523_sub34);
			if (1 == (i_19_ >> 1919834765 * Class299.aClass299_3239.anInt3231 & 0x1))
				aClass437_3221.method6941(class523_sub34);
			if ((i_19_ >> 1919834765 * Class299.aClass299_3234.anInt3231 & 0x1) == 1)
				aClass437_3203.method6941(class523_sub34);
			if (1 == (i_19_ >> Class299.aClass299_3245.anInt3231 * 1919834765 & 0x1))
				aClass437_3209.method6941(class523_sub34);
			if (1 == (i_19_ >> 1919834765 * Class299.aClass299_3235.anInt3231 & 0x1)) {
				aFloat3220 = class523_sub34.method16293(-801104844);
				aFloat3198 = class523_sub34.method16293(-1012832611);
			}
			if (1 == (i_19_ >> 1919834765 * Class299.aClass299_3236.anInt3231 & 0x1)) {
				aFloat3224 = class523_sub34.method16293(-925489492);
				aFloat3225 = class523_sub34.method16293(-858202766);
			}
			if (1 == (i_19_ >> Class299.aClass299_3237.anInt3231 * 1919834765 & 0x1))
				aClass295_3217 = Class189.method3597(class523_sub34.readUnsignedByte(-1855619018), -1981069544);
			if (1 == (i_19_ >> 1919834765 * Class299.aClass299_3233.anInt3231 & 0x1)) {
				anInt3196 = class523_sub34.read24BitInt(555916135) * -567684075;
				class523_sub34.readUnsignedByte(1692899304);
			}
			if (1 == (i_19_ >> 1919834765 * Class299.aClass299_3246.anInt3231 & 0x1)) {
				int i_20_ = class523_sub34.readUnsignedByte(-1466510218);
				aBool3210 = (i_20_ & 0x1) == 1;
				aBool3227 = 2 == (i_20_ & 0x2);
			}
			if (1 == (i_19_ >> 1919834765 * Class299.aClass299_3240.anInt3231 & 0x1)) {
				int i_21_ = class523_sub34.readUnsignedByte(-1392646573);
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					int i_23_ = class523_sub34.readUnsignedByte(1700960834);
					int i_24_ = class523_sub34.readUnsignedByte(-1847451809);
					if (i_23_ == 0)
						method5389(i_24_, (byte) 127);
					else {
						Class266 class266 = (Class513.method8581(class523_sub34.readUnsignedByte(-1560888266), -566517612));
						boolean bool = true;
						Iterator iterator = aClass14_3230.iterator();
						while (iterator.hasNext()) {
							Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
							if (i_24_ == (class523_sub27_sub13.anInt11745 * 1056957445)) {
								class523_sub27_sub13.method18138(class523_sub34, 812164301);
								bool = false;
								break;
							}
						}
						if (bool)
							method5366(Class688_Sub5.method17203(i_24_, class266, class523_sub34, 2141365743), (byte) 2);
					}
				}
			}
			if ((i_19_ >> Class299.aClass299_3241.anInt3231 * 1919834765 & 0x1) == 1) {
				anInt3228 = class523_sub34.readUnsignedShort(-859709351) * -436452313;
				aFloat3229 = class523_sub34.method16293(-717898945);
			}
			if ((i_19_ >> Class299.aClass299_3242.anInt3231 * 1919834765 & 0x1) == 1)
				aClass303_3202 = Class194_Sub9.method15505(class523_sub34.readUnsignedByte(-216953379), (byte) 0);
			if ((i_19_ >> Class299.aClass299_3243.anInt3231 * 1919834765 & 0x1) == 1) {
				aClass437_3208.method6941(class523_sub34);
				aClass437_3216.method6941(class523_sub34);
				aFloat3218 = class523_sub34.method16293(-953084647);
				aFloat3219 = class523_sub34.method16293(-793028791);
			}
			if ((i_19_ >> Class299.aClass299_3244.anInt3231 * 1919834765 & 0x1) == 1)
				class523_sub34.method16293(-1601009781);
			if ((i_19_ >> Class299.aClass299_3232.anInt3231 * 1919834765 & 0x1) == 1)
				aFloat3204 = class523_sub34.method16293(-877967901);
		}
		if (null != aClass688_3201 && 1 == (i_18_ >> 5 & 0x1))
			aClass688_3201.method13910(class523_sub34, -2127220260);
		if (aClass328_3200 != null && 1 == (i_18_ >> 6 & 0x1))
			aClass328_3200.method5760(class523_sub34, -406957251);
		if (class523_sub34.offset * 2349011 - i_17_ != i)
			throw new RuntimeException(new StringBuilder().append(class523_sub34.offset * 2349011 - i_17_).append(",").append(i).toString());
	}

	public int method15553() {
		anInt10001 += -1148292201;
		if (anInt10001 * -99402713 == 126)
			anInt10001 = 0;
		return anInt10001 * -99402713;
	}

	public Class298_Sub1(Interface30 interface30) {
		super(Class306.aClass306_3349, interface30);
	}

	public static int method15554(CharSequence charsequence, CharSequence charsequence_25_, Class668 class668, byte i) {
		int i_26_ = charsequence.length();
		int i_27_ = charsequence_25_.length();
		int i_28_ = 0;
		int i_29_ = 0;
		char c = '\0';
		char c_30_ = '\0';
		while (i_28_ - c < i_26_ || i_29_ - c_30_ < i_27_) {
			if (i_28_ - c >= i_26_)
				return -1;
			if (i_29_ - c_30_ >= i_27_)
				return 1;
			char c_31_;
			if (c != 0) {
				c_31_ = c;
				boolean bool = false;
			} else
				c_31_ = charsequence.charAt(i_28_++);
			char c_32_;
			if (0 != c_30_) {
				c_32_ = c_30_;
				boolean bool = false;
			} else
				c_32_ = charsequence_25_.charAt(i_29_++);
			c = Class687_Sub9.method16825(c_31_, 836590747);
			c_30_ = Class687_Sub9.method16825(c_32_, 836590747);
			c_31_ = Class380.method6404(c_31_, class668, -1859472580);
			c_32_ = Class380.method6404(c_32_, class668, -1900123254);
			if (c_31_ != c_32_ && (Character.toUpperCase(c_31_) != Character.toUpperCase(c_32_))) {
				c_31_ = Character.toLowerCase(c_31_);
				c_32_ = Character.toLowerCase(c_32_);
				if (c_31_ != c_32_)
					return (Class654.method10717(c_31_, class668, -546831334) - Class654.method10717(c_32_, class668, -558524262));
			}
		}
		int i_33_ = Math.min(i_26_, i_27_);
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
			if (class668 == Class668.aClass668_8550) {
				i_28_ = i_26_ - 1 - i_34_;
				i_29_ = i_27_ - 1 - i_34_;
			} else
				i_28_ = i_29_ = i_34_;
			char c_35_ = charsequence.charAt(i_28_);
			char c_36_ = charsequence_25_.charAt(i_29_);
			if (c_36_ != c_35_ && (Character.toUpperCase(c_35_) != Character.toUpperCase(c_36_))) {
				c_35_ = Character.toLowerCase(c_35_);
				c_36_ = Character.toLowerCase(c_36_);
				if (c_35_ != c_36_)
					return (Class654.method10717(c_35_, class668, -218656703) - Class654.method10717(c_36_, class668, -2025193087));
			}
		}
		int i_37_ = i_26_ - i_27_;
		if (0 != i_37_)
			return i_37_;
		for (int i_38_ = 0; i_38_ < i_33_; i_38_++) {
			char c_39_ = charsequence.charAt(i_38_);
			char c_40_ = charsequence_25_.charAt(i_38_);
			if (c_39_ != c_40_)
				return (Class654.method10717(c_39_, class668, -648327918) - Class654.method10717(c_40_, class668, -1800324214));
		}
		return 0;
	}

	static void method15555(int i, int i_41_, int i_42_, byte i_43_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(9, (long) i);
		class523_sub27_sub7.method17963(867105325);
		class523_sub27_sub7.anInt11653 = i_41_ * -1217347391;
		class523_sub27_sub7.anInt11649 = -254643469 * i_42_;
	}
}
