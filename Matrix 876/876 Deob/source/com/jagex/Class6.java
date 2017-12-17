/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class6 {
	public static boolean aBool38;
	public static RSSocket aClass1_39;
	public static RSSocket aClass1_40;
	public static boolean aBool41;
	public static RSSocket aClass1_42;
	public static boolean aBool43 = false;
	static int anInt44;
	static int anInt45;
	static Class640 aClass640_46;
	static Class611_Sub1[] aClass611_Sub1Array47 = new Class611_Sub1[0];
	public static Class397 aClass397_48;

	public static void method525(boolean bool, byte[] is) {
		if (Class251.aClass523_Sub34_2717 == null)
			Class251.aClass523_Sub34_2717 = new RSBuffer(20000);
		Class251.aClass523_Sub34_2717.readBytes(is, 0, is.length, (short) -30627);
		if (bool) {
			Class77.method1544(Class251.aClass523_Sub34_2717.buffer, (byte) -117);
			aClass611_Sub1Array47 = new Class611_Sub1[2004567773 * Class595.anInt7827];
			int i = 0;
			for (int i_0_ = Class687_Sub25.anInt10886 * -2074972287; i_0_ <= 615132109 * Class595.anInt7824; i_0_++) {
				Class611_Sub1 class611_sub1 = Class417.method6657(i_0_, 1842845670);
				if (null != class611_sub1)
					aClass611_Sub1Array47[i++] = class611_sub1;
			}
			aBool43 = false;
			Class228.aLong2349 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 1454622044886850051L;
			Class251.aClass523_Sub34_2717 = null;
		}
	}

	public static void method526() {
		if (-1 != aClass1_40.anInt10 * -1126141351)
			Class28.method873(aClass1_40.anInt10 * -1126141351, aClass1_40.aString9, -590643463 * aClass1_40.anInt11, 686690163 * aClass1_40.anInt12, -688789893);
	}

	public static void method527() {
		if (aBool41) {
			if (-106794481 * anInt45 < Class687_Sub25.anInt10886 * -2074972287)
				anInt45 = Class687_Sub25.anInt10886 * 750540143;
			while (anInt45 * -106794481 < Class595.anInt7824 * 615132109) {
				Class611_Sub1 class611_sub1 = Class417.method6657(anInt45 * -106794481, 1390844577);
				if (class611_sub1 == null || -1 != -1614476621 * class611_sub1.anInt10585)
					anInt45 += 1671707887;
				else {
					if (null == aClass640_46)
						aClass640_46 = (client.aClass648_11303.method10606(class611_sub1.aString10586, (short) -6010));
					int i = aClass640_46.anInt8314 * 167852121;
					if (i == -1)
						break;
					class611_sub1.anInt10585 = -889539461 * i;
					anInt45 += 1671707887;
					aClass640_46 = null;
				}
			}
		}
	}

	public static void method528(int i, boolean bool, int i_1_, boolean bool_2_) {
		Class328_Sub1.method15577(0, aClass611_Sub1Array47.length - 1, i, bool, i_1_, bool_2_, (short) -21619);
		anInt45 = 0;
		aClass640_46 = null;
	}

	public static void method529() {
		if (aBool41) {
			if (-106794481 * anInt45 < Class687_Sub25.anInt10886 * -2074972287)
				anInt45 = Class687_Sub25.anInt10886 * 750540143;
			while (anInt45 * -106794481 < Class595.anInt7824 * 615132109) {
				Class611_Sub1 class611_sub1 = Class417.method6657(anInt45 * -106794481, 1857307089);
				if (class611_sub1 == null || -1 != -1614476621 * class611_sub1.anInt10585)
					anInt45 += 1671707887;
				else {
					if (null == aClass640_46)
						aClass640_46 = (client.aClass648_11303.method10606(class611_sub1.aString10586, (short) 553));
					int i = aClass640_46.anInt8314 * 167852121;
					if (i == -1)
						break;
					class611_sub1.anInt10585 = -889539461 * i;
					anInt45 += 1671707887;
					aClass640_46 = null;
				}
			}
		}
	}

	public static void method530(String string, int i) {
		if (null == aClass1_42)
			aClass1_42 = new RSSocket();
		aClass1_42.aString9 = string;
		aClass1_42.anInt10 = 1274525161 * (1099 + i);
		aClass1_42.anInt11 = Class307.method5559(Class80.aClass674_865, Class670.aClass670_8583, aClass1_42.anInt10 * -1126141351, 1816985960) * 1509090121;
		aClass1_42.anInt12 = Class542.method9003(Class80.aClass674_865, Class670.aClass670_8583, aClass1_42.anInt10 * -1126141351, (byte) -77) * 19836347;
	}

	public static void method531(String string, int i) {
		if (null == aClass1_42)
			aClass1_42 = new RSSocket();
		aClass1_42.aString9 = string;
		aClass1_42.anInt10 = 1274525161 * (1099 + i);
		aClass1_42.anInt11 = Class307.method5559(Class80.aClass674_865, Class670.aClass670_8583, aClass1_42.anInt10 * -1126141351, -289279044) * 1509090121;
		aClass1_42.anInt12 = (Class542.method9003(Class80.aClass674_865, Class670.aClass670_8583, aClass1_42.anInt10 * -1126141351, (byte) 82) * 19836347);
	}

	public static void method532(String string, int i) {
		if (null == aClass1_42)
			aClass1_42 = new RSSocket();
		aClass1_42.aString9 = string;
		aClass1_42.anInt10 = 1274525161 * (1099 + i);
		aClass1_42.anInt11 = Class307.method5559(Class80.aClass674_865, Class670.aClass670_8583, aClass1_42.anInt10 * -1126141351, -1186846990) * 1509090121;
		aClass1_42.anInt12 = (Class542.method9003(Class80.aClass674_865, Class670.aClass670_8583, aClass1_42.anInt10 * -1126141351, (byte) 47) * 19836347);
	}

	static void method533(int i, int i_3_, int i_4_, boolean bool, int i_5_, boolean bool_6_) {
		if (i < i_3_) {
			int i_7_ = (i_3_ + i) / 2;
			int i_8_ = i;
			Class611_Sub1 class611_sub1 = aClass611_Sub1Array47[i_7_];
			aClass611_Sub1Array47[i_7_] = aClass611_Sub1Array47[i_3_];
			aClass611_Sub1Array47[i_3_] = class611_sub1;
			for (int i_9_ = i; i_9_ < i_3_; i_9_++) {
				if (Class396.method6516(aClass611_Sub1Array47[i_9_], class611_sub1, i_4_, bool, i_5_, bool_6_, 889761539) <= 0) {
					Class611_Sub1 class611_sub1_10_ = aClass611_Sub1Array47[i_9_];
					aClass611_Sub1Array47[i_9_] = aClass611_Sub1Array47[i_8_];
					aClass611_Sub1Array47[i_8_++] = class611_sub1_10_;
				}
			}
			aClass611_Sub1Array47[i_3_] = aClass611_Sub1Array47[i_8_];
			aClass611_Sub1Array47[i_8_] = class611_sub1;
			Class328_Sub1.method15577(i, i_8_ - 1, i_4_, bool, i_5_, bool_6_, (short) -3464);
			Class328_Sub1.method15577(1 + i_8_, i_3_, i_4_, bool, i_5_, bool_6_, (short) -16679);
		}
	}

	public static Class611_Sub1 method534() {
		if (anInt44 * -987191143 < aClass611_Sub1Array47.length)
			return (aClass611_Sub1Array47[(anInt44 += -1511052375) * -987191143 - 1]);
		return null;
	}

	public static void method535() {
		if (-1 != aClass1_40.anInt10 * -1126141351)
			Class28.method873(aClass1_40.anInt10 * -1126141351, aClass1_40.aString9, -590643463 * aClass1_40.anInt11, 686690163 * aClass1_40.anInt12, 990584748);
	}

	public static void method536(boolean bool, byte[] is) {
		if (Class251.aClass523_Sub34_2717 == null)
			Class251.aClass523_Sub34_2717 = new RSBuffer(20000);
		Class251.aClass523_Sub34_2717.readBytes(is, 0, is.length, (short) -30033);
		if (bool) {
			Class77.method1544(Class251.aClass523_Sub34_2717.buffer, (byte) -79);
			aClass611_Sub1Array47 = new Class611_Sub1[2004567773 * Class595.anInt7827];
			int i = 0;
			for (int i_11_ = Class687_Sub25.anInt10886 * -2074972287; i_11_ <= 615132109 * Class595.anInt7824; i_11_++) {
				Class611_Sub1 class611_sub1 = Class417.method6657(i_11_, 1499011456);
				if (null != class611_sub1)
					aClass611_Sub1Array47[i++] = class611_sub1;
			}
			aBool43 = false;
			Class228.aLong2349 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 1454622044886850051L;
			Class251.aClass523_Sub34_2717 = null;
		}
	}

	public static void method537() {
		if (aBool41) {
			if (-106794481 * anInt45 < Class687_Sub25.anInt10886 * -2074972287)
				anInt45 = Class687_Sub25.anInt10886 * 750540143;
			while (anInt45 * -106794481 < Class595.anInt7824 * 615132109) {
				Class611_Sub1 class611_sub1 = Class417.method6657(anInt45 * -106794481, 2099076935);
				if (class611_sub1 == null || -1 != -1614476621 * class611_sub1.anInt10585)
					anInt45 += 1671707887;
				else {
					if (null == aClass640_46)
						aClass640_46 = (client.aClass648_11303.method10606(class611_sub1.aString10586, (short) 1120));
					int i = aClass640_46.anInt8314 * 167852121;
					if (i == -1)
						break;
					class611_sub1.anInt10585 = -889539461 * i;
					anInt45 += 1671707887;
					aClass640_46 = null;
				}
			}
		}
	}

	public static void method538(boolean bool, byte[] is) {
		if (Class251.aClass523_Sub34_2717 == null)
			Class251.aClass523_Sub34_2717 = new RSBuffer(20000);
		Class251.aClass523_Sub34_2717.readBytes(is, 0, is.length, (short) -17284);
		if (bool) {
			Class77.method1544(Class251.aClass523_Sub34_2717.buffer, (byte) -77);
			aClass611_Sub1Array47 = new Class611_Sub1[2004567773 * Class595.anInt7827];
			int i = 0;
			for (int i_12_ = Class687_Sub25.anInt10886 * -2074972287; i_12_ <= 615132109 * Class595.anInt7824; i_12_++) {
				Class611_Sub1 class611_sub1 = Class417.method6657(i_12_, 1397171550);
				if (null != class611_sub1)
					aClass611_Sub1Array47[i++] = class611_sub1;
			}
			aBool43 = false;
			Class228.aLong2349 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 1454622044886850051L;
			Class251.aClass523_Sub34_2717 = null;
		}
	}

	public static void method539(boolean bool, byte[] is) {
		if (Class251.aClass523_Sub34_2717 == null)
			Class251.aClass523_Sub34_2717 = new RSBuffer(20000);
		Class251.aClass523_Sub34_2717.readBytes(is, 0, is.length, (short) -18727);
		if (bool) {
			Class77.method1544(Class251.aClass523_Sub34_2717.buffer, (byte) -60);
			aClass611_Sub1Array47 = new Class611_Sub1[2004567773 * Class595.anInt7827];
			int i = 0;
			for (int i_13_ = Class687_Sub25.anInt10886 * -2074972287; i_13_ <= 615132109 * Class595.anInt7824; i_13_++) {
				Class611_Sub1 class611_sub1 = Class417.method6657(i_13_, 1272559130);
				if (null != class611_sub1)
					aClass611_Sub1Array47[i++] = class611_sub1;
			}
			aBool43 = false;
			Class228.aLong2349 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 1454622044886850051L;
			Class251.aClass523_Sub34_2717 = null;
		}
	}

	Class6() throws Throwable {
		throw new Error();
	}

	public static Class611_Sub1 method540() {
		anInt44 = 0;
		return Class98_Sub1.method14355(-1045742050);
	}

	public static void method541() {
		if (-1 != aClass1_40.anInt10 * -1126141351)
			Class28.method873(aClass1_40.anInt10 * -1126141351, aClass1_40.aString9, -590643463 * aClass1_40.anInt11, 686690163 * aClass1_40.anInt12, 29279710);
	}

	public static void method542(int i, boolean bool, int i_14_, boolean bool_15_) {
		Class328_Sub1.method15577(0, aClass611_Sub1Array47.length - 1, i, bool, i_14_, bool_15_, (short) -23819);
		anInt45 = 0;
		aClass640_46 = null;
	}

	static {
		anInt44 = -195913615;
		anInt45 = 0;
		aClass640_46 = null;
		aBool41 = false;
	}

	public static Class611_Sub1 method543() {
		return Class417.method6657(Class155.aClass1_1735.anInt10 * -1126141351, 1621484772);
	}

	public static Class611_Sub1 method544() {
		if (anInt44 * -987191143 < aClass611_Sub1Array47.length)
			return (aClass611_Sub1Array47[(anInt44 += -1511052375) * -987191143 - 1]);
		return null;
	}

	static int method545(Class611_Sub1 class611_sub1, Class611_Sub1 class611_sub1_16_, int i, boolean bool, int i_17_, boolean bool_18_) {
		int i_19_ = Class389.method6477(class611_sub1, class611_sub1_16_, i, bool, -252622335);
		if (0 != i_19_) {
			if (bool)
				return -i_19_;
			return i_19_;
		}
		if (-1 == i_17_)
			return 0;
		int i_20_ = Class389.method6477(class611_sub1, class611_sub1_16_, i_17_, bool_18_, -652353509);
		if (bool_18_)
			return -i_20_;
		return i_20_;
	}

	public static Class611_Sub1 method546() {
		anInt44 = 0;
		return Class98_Sub1.method14355(-1045742050);
	}

	public static void method547(int i, boolean bool, int i_21_, boolean bool_22_) {
		Class328_Sub1.method15577(0, aClass611_Sub1Array47.length - 1, i, bool, i_21_, bool_22_, (short) -8877);
		anInt45 = 0;
		aClass640_46 = null;
	}

	public static Class611_Sub1 method548() {
		anInt44 = 0;
		return Class98_Sub1.method14355(-1045742050);
	}

	static void method549(int i, int i_23_, int i_24_, boolean bool, int i_25_, boolean bool_26_) {
		if (i < i_23_) {
			int i_27_ = (i_23_ + i) / 2;
			int i_28_ = i;
			Class611_Sub1 class611_sub1 = aClass611_Sub1Array47[i_27_];
			aClass611_Sub1Array47[i_27_] = aClass611_Sub1Array47[i_23_];
			aClass611_Sub1Array47[i_23_] = class611_sub1;
			for (int i_29_ = i; i_29_ < i_23_; i_29_++) {
				if (Class396.method6516(aClass611_Sub1Array47[i_29_], class611_sub1, i_24_, bool, i_25_, bool_26_, -1792442735) <= 0) {
					Class611_Sub1 class611_sub1_30_ = aClass611_Sub1Array47[i_29_];
					aClass611_Sub1Array47[i_29_] = aClass611_Sub1Array47[i_28_];
					aClass611_Sub1Array47[i_28_++] = class611_sub1_30_;
				}
			}
			aClass611_Sub1Array47[i_23_] = aClass611_Sub1Array47[i_28_];
			aClass611_Sub1Array47[i_28_] = class611_sub1;
			Class328_Sub1.method15577(i, i_28_ - 1, i_24_, bool, i_25_, bool_26_, (short) -28945);
			Class328_Sub1.method15577(1 + i_28_, i_23_, i_24_, bool, i_25_, bool_26_, (short) -14901);
		}
	}

	static int method550(Class611_Sub1 class611_sub1, Class611_Sub1 class611_sub1_31_, int i, boolean bool, int i_32_, boolean bool_33_) {
		int i_34_ = Class389.method6477(class611_sub1, class611_sub1_31_, i, bool, -2069582161);
		if (0 != i_34_) {
			if (bool)
				return -i_34_;
			return i_34_;
		}
		if (-1 == i_32_)
			return 0;
		int i_35_ = Class389.method6477(class611_sub1, class611_sub1_31_, i_32_, bool_33_, 1657013161);
		if (bool_33_)
			return -i_35_;
		return i_35_;
	}

	static int method551(Class611_Sub1 class611_sub1, Class611_Sub1 class611_sub1_36_, int i, boolean bool, int i_37_, boolean bool_38_) {
		int i_39_ = Class389.method6477(class611_sub1, class611_sub1_36_, i, bool, -887099674);
		if (0 != i_39_) {
			if (bool)
				return -i_39_;
			return i_39_;
		}
		if (-1 == i_37_)
			return 0;
		int i_40_ = Class389.method6477(class611_sub1, class611_sub1_36_, i_37_, bool_38_, 2059439972);
		if (bool_38_)
			return -i_40_;
		return i_40_;
	}

	public static Class611_Sub1 method552() {
		return Class417.method6657(Class155.aClass1_1735.anInt10 * -1126141351, 1511523707);
	}

	static int method553(Class611_Sub1 class611_sub1, Class611_Sub1 class611_sub1_41_, int i, boolean bool) {
		if (1 == i) {
			int i_42_ = -1102045477 * class611_sub1.anInt8012;
			int i_43_ = -1102045477 * class611_sub1_41_.anInt8012;
			if (!bool) {
				if (-1 == i_42_)
					i_42_ = 2001;
				if (i_43_ == -1)
					i_43_ = 2001;
			}
			return i_42_ - i_43_;
		}
		if (i == 2)
			return Class298_Sub1.method15554(class611_sub1.method16195(1675062048), class611_sub1_41_.method16195(1990429390), Class53_Sub20.aClass668_10979, (byte) -100);
		if (i == 3) {
			if (class611_sub1.aString10587.equals("-")) {
				if (class611_sub1_41_.aString10587.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class611_sub1_41_.aString10587.equals("-"))
				return bool ? 1 : -1;
			return Class298_Sub1.method15554(class611_sub1.aString10587, class611_sub1_41_.aString10587, Class53_Sub20.aClass668_10979, (byte) -6);
		}
		if (i == 4)
			return (class611_sub1.method10020((short) 229) ? class611_sub1_41_.method10020((short) 229) ? 0 : 1 : class611_sub1_41_.method10020((short) 229) ? -1 : 0);
		if (5 == i)
			return (class611_sub1.method10023(2111002259) ? class611_sub1_41_.method10023(1064623331) ? 0 : 1 : class611_sub1_41_.method10023(1573082274) ? -1 : 0);
		if (6 == i)
			return (class611_sub1.method10024((byte) 20) ? class611_sub1_41_.method10024((byte) -55) ? 0 : 1 : class611_sub1_41_.method10024((byte) -44) ? -1 : 0);
		if (7 == i)
			return (class611_sub1.method10022((byte) 45) ? class611_sub1_41_.method10022((byte) 50) ? 0 : 1 : class611_sub1_41_.method10022((byte) -7) ? -1 : 0);
		if (i == 8) {
			int i_44_ = -1614476621 * class611_sub1.anInt10585;
			int i_45_ = -1614476621 * class611_sub1_41_.anInt10585;
			if (bool) {
				if (1000 == i_44_)
					i_44_ = -1;
				if (1000 == i_45_)
					i_45_ = -1;
			} else {
				if (i_44_ == -1)
					i_44_ = 1000;
				if (-1 == i_45_)
					i_45_ = 1000;
			}
			return i_44_ - i_45_;
		}
		return (class611_sub1.anInt10588 * 1568680265 - 1568680265 * class611_sub1_41_.anInt10588);
	}

	static final int method554(int i, int i_46_) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	public static int method555(String string, byte i) {
		return string.length() + 1;
	}
}
