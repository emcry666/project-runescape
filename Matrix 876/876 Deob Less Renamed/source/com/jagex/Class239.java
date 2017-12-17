/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class239 implements Interface13 {
	public int anInt2398;
	Interface12 anInterface12_2399;
	int anInt2400;
	public int anInt2401;
	public int anInt2402;
	public int anInt2403;
	public int anInt2404;
	public int anInt2405;
	public int anInt2406;
	public static final int anInt2407 = 0;
	public static final int anInt2408 = 1;
	public static final int anInt2409 = 2;
	public int anInt2410 = -760734697;
	public Class275 aClass275_2411;
	public boolean aBool2412;
	public boolean aBool2413;
	Class234 aClass234_2414;
	public String aString2415;
	public int anInt2416;
	int anInt2417;
	public String[] aStringArray2418;
	public int anInt2419;
	int anInt2420;
	public int anInt2421;
	int anInt2422;
	int anInt2423;
	int anInt2424;
	public int[] anIntArray2425;
	int anInt2426;
	public int anInt2427;
	public int anInt2428;
	int anInt2429;
	public int anInt2430;
	public int anInt2431;
	public int anInt2432;
	public int anInt2433;
	public int anInt2434;
	public int anInt2435;
	public int anInt2436;
	int anInt2437;
	public Class273 aClass273_2438;
	public int[] anIntArray2439;
	public byte[] aByteArray2440;
	public String aString2441;
	public boolean aBool2442;
	public int anInt2443;
	Class14 aClass14_2444;
	public int[] anIntArray2445;
	public static int anInt2446;

	public void method74(byte i) {
		if (null != anIntArray2445) {
			for (int i_0_ = 0; i_0_ < anIntArray2445.length; i_0_ += 2) {
				if (anIntArray2445[i_0_] < 374901433 * anInt2427)
					anInt2427 = anIntArray2445[i_0_] * 2092850057;
				else if (anIntArray2445[i_0_] > anInt2401 * -892198963)
					anInt2401 = 1077929221 * anIntArray2445[i_0_];
				if (anIntArray2445[i_0_ + 1] < 973938647 * anInt2421)
					anInt2421 = 2036679655 * anIntArray2445[i_0_ + 1];
				else if (anIntArray2445[i_0_ + 1] > -1256537267 * anInt2430)
					anInt2430 = -573297275 * anIntArray2445[1 + i_0_];
			}
		}
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_1_ = class523_sub34.readUnsignedByte(1474518001);
			if (0 == i_1_)
				break;
			method4323(class523_sub34, i_1_, 857979325);
		}
	}

	public int method4312(int i, int i_2_) {
		if (null == aClass14_2444)
			return i_2_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2444.method741((long) i);
		if (class523_sub24 == null)
			return i_2_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method4313(int i, int i_3_) {
		if (null == aClass14_2444)
			return i_3_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2444.method741((long) i);
		if (class523_sub24 == null)
			return i_3_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public boolean method4314(Interface19 interface19, Interface17 interface17, int i) {
		int i_4_ = -1;
		if (-1 != 659042581 * anInt2420) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2420 * 659042581, 1834627789);
			i_4_ = interface17.method94(class159, -1435919759);
		} else if (1165506823 * anInt2429 != -1) {
			Class309 class309 = interface19.method106(1165506823 * anInt2429, 1415401329);
			i_4_ = interface17.method93(class309, -1207453840);
		} else
			return true;
		if (null == anIntArray2425) {
			if (i_4_ < anInt2417 * -265350347 || i_4_ > 252216019 * anInt2426)
				return false;
		} else {
			if (i_4_ < 0 || i_4_ >= anIntArray2425.length - 1) {
				int i_5_ = anIntArray2425[anIntArray2425.length - 1];
				if (-1 != i_5_) {
					if (anInt2417 * -265350347 != -1 && -1 != 252216019 * anInt2426 && (i_4_ < -265350347 * anInt2417 || i_4_ > anInt2426 * 252216019))
						return false;
				} else
					return false;
			}
			if (anIntArray2425[i_4_] == -1)
				return false;
		}
		boolean bool = false;
		int i_6_;
		if (anInt2424 * 521630281 != -1) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2424 * 521630281, 2146236050);
			i_6_ = interface17.method94(class159, -1348990499);
		} else if (-1 != -184540069 * anInt2437) {
			Class309 class309 = interface19.method106(-184540069 * anInt2437, -835403996);
			i_6_ = interface17.method93(class309, -1595009981);
		} else
			return true;
		if (i_6_ < anInt2423 * -493580219 || i_6_ > 1487963565 * anInt2422)
			return false;
		return true;
	}

	public Class148 method4315(Class178 class178, boolean bool, int i) {
		int i_7_ = bool ? -1173943061 * anInt2398 : anInt2410 * 924656729;
		int i_8_ = i_7_ | -1144788131 * class178.anInt1922 << 29;
		Class148 class148 = (Class148) aClass234_2414.aClass209_2376.method3767((long) i_8_);
		if (class148 != null)
			return class148;
		if (!aClass234_2414.aClass472_2377.method7650(i_7_, -829030480))
			return null;
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, i_7_, 0);
		if (class175 != null) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) i_8_);
		}
		return class148;
	}

	public void method73() {
		if (null != anIntArray2445) {
			for (int i = 0; i < anIntArray2445.length; i += 2) {
				if (anIntArray2445[i] < 374901433 * anInt2427)
					anInt2427 = anIntArray2445[i] * 2092850057;
				else if (anIntArray2445[i] > anInt2401 * -892198963)
					anInt2401 = 1077929221 * anIntArray2445[i];
				if (anIntArray2445[i + 1] < 973938647 * anInt2421)
					anInt2421 = 2036679655 * anIntArray2445[i + 1];
				else if (anIntArray2445[i + 1] > -1256537267 * anInt2430)
					anInt2430 = -573297275 * anIntArray2445[1 + i];
			}
		}
	}

	public Class148 method4316(Class178 class178, int i) {
		Class148 class148 = (Class148) (aClass234_2414.aClass209_2376.method3767((long) (-1327533773 * anInt2400 | 0x20000 | class178.anInt1922 * -1144788131 << 29)));
		if (null != class148)
			return class148;
		aClass234_2414.aClass472_2377.method7650(-1327533773 * anInt2400, 1244306421);
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, -1327533773 * anInt2400, 0);
		if (null != class175) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) (-1327533773 * anInt2400 | 0x20000 | -1144788131 * class178.anInt1922 << 29));
		}
		return class148;
	}

	public int method4317(int i, int i_9_, int i_10_) {
		if (null == aClass14_2444)
			return i_9_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2444.method741((long) i);
		if (class523_sub24 == null)
			return i_9_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method4318(int i, int i_11_) {
		if (null == aClass14_2444)
			return i_11_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2444.method741((long) i);
		if (class523_sub24 == null)
			return i_11_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public final Class239 method4319(Interface19 interface19, Interface17 interface17, int i) {
		int i_12_ = -1;
		if (-1 != anInt2429 * 1165506823) {
			Class309 class309 = interface19.method106(1165506823 * anInt2429, -89862587);
			if (null != class309)
				i_12_ = interface17.method93(class309, -1775669924);
		} else if (-1 != anInt2420 * 659042581) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, 659042581 * anInt2420, 1914135238);
			if (null != class159)
				i_12_ = interface17.method94(class159, -2049560451);
		}
		if (i_12_ < 0 || i_12_ >= anIntArray2425.length - 1) {
			int i_13_ = anIntArray2425[anIntArray2425.length - 1];
			if (-1 != i_13_)
				return ((Class239) anInterface12_2399.getDefinition(i_13_, (byte) -16));
			return null;
		}
		if (anIntArray2425[i_12_] == -1)
			return null;
		return ((Class239) anInterface12_2399.getDefinition(anIntArray2425[i_12_], (byte) 54));
	}

	public Class148 method4320(Class178 class178, int i) {
		int i_14_ = 1669690785 * anInt2419 | class178.anInt1922 * -1144788131 << 29;
		Class148 class148 = ((Class148) aClass234_2414.aClass209_2376.method3767((long) i_14_));
		if (class148 != null)
			return class148;
		if (!aClass234_2414.aClass472_2377.method7650(anInt2419 * 1669690785, 558050423))
			return null;
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, 1669690785 * anInt2419, 0);
		if (class175 != null) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) i_14_);
		}
		return class148;
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1969567194);
			if (0 == i)
				break;
			method4323(class523_sub34, i, 1390479905);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(204408737);
			if (0 == i)
				break;
			method4323(class523_sub34, i, -612965505);
		}
	}

	public String method4321(int i, String string, byte i_15_) {
		if (null == aClass14_2444)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_2444.method741((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(747972183);
			if (0 == i)
				break;
			method4323(class523_sub34, i, 2062330303);
		}
	}

	public Class148 method4322(Class178 class178, boolean bool) {
		int i = bool ? -1173943061 * anInt2398 : anInt2410 * 924656729;
		int i_16_ = i | -1144788131 * class178.anInt1922 << 29;
		Class148 class148 = ((Class148) aClass234_2414.aClass209_2376.method3767((long) i_16_));
		if (class148 != null)
			return class148;
		if (!aClass234_2414.aClass472_2377.method7650(i, 978193287))
			return null;
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, i, 0);
		if (class175 != null) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) i_16_);
		}
		return class148;
	}

	public void method78() {
		if (null != anIntArray2445) {
			for (int i = 0; i < anIntArray2445.length; i += 2) {
				if (anIntArray2445[i] < 374901433 * anInt2427)
					anInt2427 = anIntArray2445[i] * 2092850057;
				else if (anIntArray2445[i] > anInt2401 * -892198963)
					anInt2401 = 1077929221 * anIntArray2445[i];
				if (anIntArray2445[i + 1] < 973938647 * anInt2421)
					anInt2421 = 2036679655 * anIntArray2445[i + 1];
				else if (anIntArray2445[i + 1] > -1256537267 * anInt2430)
					anInt2430 = -573297275 * anIntArray2445[1 + i];
			}
		}
	}

	public void method79() {
		if (null != anIntArray2445) {
			for (int i = 0; i < anIntArray2445.length; i += 2) {
				if (anIntArray2445[i] < 374901433 * anInt2427)
					anInt2427 = anIntArray2445[i] * 2092850057;
				else if (anIntArray2445[i] > anInt2401 * -892198963)
					anInt2401 = 1077929221 * anIntArray2445[i];
				if (anIntArray2445[i + 1] < 973938647 * anInt2421)
					anInt2421 = 2036679655 * anIntArray2445[i + 1];
				else if (anIntArray2445[i + 1] > -1256537267 * anInt2430)
					anInt2430 = -573297275 * anIntArray2445[1 + i];
			}
		}
	}

	void method4323(Class523_Sub34 class523_sub34, int i, int i_17_) {
		if (i == 1)
			anInt2410 = class523_sub34.readBigSmart((byte) -113) * 760734697;
		else if (i == 2)
			anInt2398 = class523_sub34.readBigSmart((byte) -36) * 3488707;
		else if (3 == i)
			aString2441 = class523_sub34.readString(-852252941);
		else if (i == 4)
			anInt2404 = class523_sub34.read24BitInt(954053685) * 1516282049;
		else if (i == 5)
			anInt2405 = class523_sub34.read24BitInt(-859168424) * -1451549441;
		else if (6 == i)
			anInt2402 = class523_sub34.readUnsignedByte(1523686063) * 1421212009;
		else if (7 == i) {
			int i_18_ = class523_sub34.readUnsignedByte(881965892);
			if (0 == (i_18_ & 0x1))
				aBool2412 = false;
			if ((i_18_ & 0x2) == 2)
				aBool2413 = true;
		} else if (i == 8)
			class523_sub34.readUnsignedByte(-477241645);
		else if (9 == i) {
			anInt2429 = class523_sub34.readUnsignedShort(-1023401877) * 1096017079;
			if (65535 == anInt2429 * 1165506823)
				anInt2429 = -1096017079;
			anInt2420 = class523_sub34.readUnsignedShort(-271989601) * -1721592259;
			if (65535 == anInt2420 * 659042581)
				anInt2420 = 1721592259;
			anInt2417 = class523_sub34.readUnsignedInt((byte) -45) * -1279334627;
			anInt2426 = class523_sub34.readUnsignedInt((byte) -30) * 973808987;
		} else if (i >= 10 && i <= 14)
			aStringArray2418[i - 10] = class523_sub34.readString(-448489728);
		else if (i == 15) {
			int i_19_ = class523_sub34.readUnsignedByte(-1067076534);
			anIntArray2445 = new int[i_19_ * 2];
			for (int i_20_ = 0; i_20_ < 2 * i_19_; i_20_++)
				anIntArray2445[i_20_] = class523_sub34.readShort(-1577419156);
			anInt2431 = class523_sub34.readUnsignedInt((byte) -18) * -799391577;
			int i_21_ = class523_sub34.readUnsignedByte(-1243084465);
			anIntArray2439 = new int[i_21_];
			for (int i_22_ = 0; i_22_ < anIntArray2439.length; i_22_++)
				anIntArray2439[i_22_] = class523_sub34.readUnsignedInt((byte) -14);
			aByteArray2440 = new byte[i_19_];
			for (int i_23_ = 0; i_23_ < i_19_; i_23_++)
				aByteArray2440[i_23_] = class523_sub34.readByte((short) -3647);
		} else if (i == 16)
			aBool2442 = false;
		else if (17 == i)
			aString2415 = class523_sub34.readString(-77706709);
		else if (18 == i)
			anInt2400 = class523_sub34.readBigSmart((byte) -95) * -583405061;
		else if (i == 19)
			anInt2443 = class523_sub34.readUnsignedShort(-303911880) * -946943721;
		else if (i == 20) {
			anInt2437 = class523_sub34.readUnsignedShort(-1837155015) * -200250413;
			if (-184540069 * anInt2437 == 65535)
				anInt2437 = 200250413;
			anInt2424 = class523_sub34.readUnsignedShort(-1204780926) * -259842055;
			if (65535 == 521630281 * anInt2424)
				anInt2424 = 259842055;
			anInt2423 = class523_sub34.readUnsignedInt((byte) -48) * 765198989;
			anInt2422 = class523_sub34.readUnsignedInt((byte) -47) * -1210505691;
		} else if (21 == i)
			anInt2406 = class523_sub34.readUnsignedInt((byte) -99) * 1915807247;
		else if (i == 22)
			anInt2428 = class523_sub34.readUnsignedInt((byte) -78) * -1932415403;
		else if (23 == i) {
			anInt2432 = class523_sub34.readUnsignedByte(-1731692478) * -807307207;
			anInt2433 = class523_sub34.readUnsignedByte(-736113809) * -156393231;
			anInt2434 = class523_sub34.readUnsignedByte(1269086874) * 1313621465;
		} else if (i == 24) {
			anInt2435 = class523_sub34.readShort(643231808) * 1998508987;
			anInt2436 = class523_sub34.readShort(-153299362) * -878638185;
		} else if (25 == i)
			anInt2419 = class523_sub34.readBigSmart((byte) -41) * -593777055;
		else if (i == 26 || i == 27) {
			anInt2429 = class523_sub34.readUnsignedShort(-48332597) * 1096017079;
			if (1165506823 * anInt2429 == 65535)
				anInt2429 = -1096017079;
			anInt2420 = class523_sub34.readUnsignedShort(-1395022424) * -1721592259;
			if (65535 == 659042581 * anInt2420)
				anInt2420 = 1721592259;
			int i_24_ = -1;
			if (i == 27) {
				i_24_ = class523_sub34.readUnsignedShort(-1563762430);
				if (65535 == i_24_)
					i_24_ = -1;
			}
			int i_25_ = class523_sub34.readUnsignedByte(1770585334);
			anIntArray2425 = new int[2 + i_25_];
			for (int i_26_ = 0; i_26_ <= i_25_; i_26_++) {
				anIntArray2425[i_26_] = class523_sub34.readUnsignedShort(-1726160645);
				if (65535 == anIntArray2425[i_26_])
					anIntArray2425[i_26_] = -1;
			}
			anIntArray2425[1 + i_25_] = i_24_;
		} else if (i == 28)
			anInt2416 = class523_sub34.readUnsignedByte(-1182169413) * 2137207745;
		else if (29 == i)
			aClass275_2411 = ((Class275) Class334.method5910(Class523_Sub2.method15900((byte) 96), class523_sub34.readUnsignedByte(-718311831), 1155594622));
		else if (30 == i)
			aClass273_2438 = ((Class273) Class334.method5910(Class43.method1217((byte) -32), class523_sub34.readUnsignedByte(-149773604), -660475379));
		else if (249 == i) {
			int i_27_ = class523_sub34.readUnsignedByte(2139328610);
			if (null == aClass14_2444) {
				int i_28_ = Class628.method10313(i_27_, 1118390705);
				aClass14_2444 = new Class14(i_28_);
			}
			for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
				boolean bool = class523_sub34.readUnsignedByte(-1388163119) == 1;
				int i_30_ = class523_sub34.read24BitInt(691663864);
				Class523 class523;
				if (bool)
					class523 = new Class523_Sub28(class523_sub34.readString(548951632));
				else
					class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -45));
				aClass14_2444.method738(class523, (long) i_30_);
			}
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-338276745);
			if (0 == i)
				break;
			method4323(class523_sub34, i, 990196088);
		}
	}

	public boolean method4324(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != 659042581 * anInt2420) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2420 * 659042581, 1280170719);
			i = interface17.method94(class159, 721295868);
		} else if (1165506823 * anInt2429 != -1) {
			Class309 class309 = interface19.method106(1165506823 * anInt2429, 1112004899);
			i = interface17.method93(class309, -818934188);
		} else
			return true;
		if (null == anIntArray2425) {
			if (i < anInt2417 * -265350347 || i > 252216019 * anInt2426)
				return false;
		} else {
			if (i < 0 || i >= anIntArray2425.length - 1) {
				int i_31_ = anIntArray2425[anIntArray2425.length - 1];
				if (-1 != i_31_) {
					if (anInt2417 * -265350347 != -1 && -1 != 252216019 * anInt2426 && (i < -265350347 * anInt2417 || i > anInt2426 * 252216019))
						return false;
				} else
					return false;
			}
			if (anIntArray2425[i] == -1)
				return false;
		}
		boolean bool = false;
		int i_32_;
		if (anInt2424 * 521630281 != -1) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2424 * 521630281, 2070436245);
			i_32_ = interface17.method94(class159, -835123287);
		} else if (-1 != -184540069 * anInt2437) {
			Class309 class309 = interface19.method106(-184540069 * anInt2437, 563830732);
			i_32_ = interface17.method93(class309, -1828827144);
		} else
			return true;
		if (i_32_ < anInt2423 * -493580219 || i_32_ > 1487963565 * anInt2422)
			return false;
		return true;
	}

	public boolean method4325(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != 659042581 * anInt2420) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2420 * 659042581, 1942580180);
			i = interface17.method94(class159, -1508144716);
		} else if (1165506823 * anInt2429 != -1) {
			Class309 class309 = interface19.method106(1165506823 * anInt2429, -1198738528);
			i = interface17.method93(class309, 56994818);
		} else
			return true;
		if (null == anIntArray2425) {
			if (i < anInt2417 * -265350347 || i > 252216019 * anInt2426)
				return false;
		} else {
			if (i < 0 || i >= anIntArray2425.length - 1) {
				int i_33_ = anIntArray2425[anIntArray2425.length - 1];
				if (-1 != i_33_) {
					if (anInt2417 * -265350347 != -1 && -1 != 252216019 * anInt2426 && (i < -265350347 * anInt2417 || i > anInt2426 * 252216019))
						return false;
				} else
					return false;
			}
			if (anIntArray2425[i] == -1)
				return false;
		}
		boolean bool = false;
		int i_34_;
		if (anInt2424 * 521630281 != -1) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2424 * 521630281, 1787581094);
			i_34_ = interface17.method94(class159, 370701435);
		} else if (-1 != -184540069 * anInt2437) {
			Class309 class309 = interface19.method106(-184540069 * anInt2437, 85659289);
			i_34_ = interface17.method93(class309, -72647823);
		} else
			return true;
		if (i_34_ < anInt2423 * -493580219 || i_34_ > 1487963565 * anInt2422)
			return false;
		return true;
	}

	public boolean method4326(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != 659042581 * anInt2420) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2420 * 659042581, 2087892895);
			i = interface17.method94(class159, 346831727);
		} else if (1165506823 * anInt2429 != -1) {
			Class309 class309 = interface19.method106(1165506823 * anInt2429, 134050062);
			i = interface17.method93(class309, 484791526);
		} else
			return true;
		if (null == anIntArray2425) {
			if (i < anInt2417 * -265350347 || i > 252216019 * anInt2426)
				return false;
		} else {
			if (i < 0 || i >= anIntArray2425.length - 1) {
				int i_35_ = anIntArray2425[anIntArray2425.length - 1];
				if (-1 != i_35_) {
					if (anInt2417 * -265350347 != -1 && -1 != 252216019 * anInt2426 && (i < -265350347 * anInt2417 || i > anInt2426 * 252216019))
						return false;
				} else
					return false;
			}
			if (anIntArray2425[i] == -1)
				return false;
		}
		boolean bool = false;
		int i_36_;
		if (anInt2424 * 521630281 != -1) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, anInt2424 * 521630281, 1423396153);
			i_36_ = interface17.method94(class159, -1096653757);
		} else if (-1 != -184540069 * anInt2437) {
			Class309 class309 = interface19.method106(-184540069 * anInt2437, -70177088);
			i_36_ = interface17.method93(class309, -1121102860);
		} else
			return true;
		if (i_36_ < anInt2423 * -493580219 || i_36_ > 1487963565 * anInt2422)
			return false;
		return true;
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(245907427);
			if (0 == i)
				break;
			method4323(class523_sub34, i, -1602447500);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2105173200);
			if (0 == i)
				break;
			method4323(class523_sub34, i, 258960647);
		}
	}

	public Class148 method4327(Class178 class178) {
		Class148 class148 = (Class148) (aClass234_2414.aClass209_2376.method3767((long) (-1327533773 * anInt2400 | 0x20000 | class178.anInt1922 * -1144788131 << 29)));
		if (null != class148)
			return class148;
		aClass234_2414.aClass472_2377.method7650(-1327533773 * anInt2400, -472872382);
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, -1327533773 * anInt2400, 0);
		if (null != class175) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) (-1327533773 * anInt2400 | 0x20000 | -1144788131 * class178.anInt1922 << 29));
		}
		return class148;
	}

	public Class148 method4328(Class178 class178) {
		Class148 class148 = (Class148) (aClass234_2414.aClass209_2376.method3767((long) (-1327533773 * anInt2400 | 0x20000 | class178.anInt1922 * -1144788131 << 29)));
		if (null != class148)
			return class148;
		aClass234_2414.aClass472_2377.method7650(-1327533773 * anInt2400, 773906885);
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, -1327533773 * anInt2400, 0);
		if (null != class175) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) (-1327533773 * anInt2400 | 0x20000 | -1144788131 * class178.anInt1922 << 29));
		}
		return class148;
	}

	public Class148 method4329(Class178 class178) {
		Class148 class148 = (Class148) (aClass234_2414.aClass209_2376.method3767((long) (-1327533773 * anInt2400 | 0x20000 | class178.anInt1922 * -1144788131 << 29)));
		if (null != class148)
			return class148;
		aClass234_2414.aClass472_2377.method7650(-1327533773 * anInt2400, 832898128);
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, -1327533773 * anInt2400, 0);
		if (null != class175) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) (-1327533773 * anInt2400 | 0x20000 | -1144788131 * class178.anInt1922 << 29));
		}
		return class148;
	}

	public Class148 method4330(Class178 class178) {
		Class148 class148 = (Class148) (aClass234_2414.aClass209_2376.method3767((long) (-1327533773 * anInt2400 | 0x20000 | class178.anInt1922 * -1144788131 << 29)));
		if (null != class148)
			return class148;
		aClass234_2414.aClass472_2377.method7650(-1327533773 * anInt2400, -1104190481);
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, -1327533773 * anInt2400, 0);
		if (null != class175) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) (-1327533773 * anInt2400 | 0x20000 | -1144788131 * class178.anInt1922 << 29));
		}
		return class148;
	}

	public String method4331(int i, String string) {
		if (null == aClass14_2444)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_2444.method741((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public Class148 method4332(Class178 class178) {
		int i = 1669690785 * anInt2419 | class178.anInt1922 * -1144788131 << 29;
		Class148 class148 = (Class148) aClass234_2414.aClass209_2376.method3767((long) i);
		if (class148 != null)
			return class148;
		if (!aClass234_2414.aClass472_2377.method7650(anInt2419 * 1669690785, -329430663))
			return null;
		Class175 class175 = Class166.method2658(aClass234_2414.aClass472_2377, 1669690785 * anInt2419, 0);
		if (class175 != null) {
			class148 = class178.method3104(class175, true);
			aClass234_2414.aClass209_2376.method3770(class148, (long) i);
		}
		return class148;
	}

	public int method4333(int i, int i_37_) {
		if (null == aClass14_2444)
			return i_37_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_2444.method741((long) i);
		if (class523_sub24 == null)
			return i_37_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public final Class239 method4334(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != anInt2429 * 1165506823) {
			Class309 class309 = interface19.method106(1165506823 * anInt2429, 351820124);
			if (null != class309)
				i = interface17.method93(class309, -479771800);
		} else if (-1 != anInt2420 * 659042581) {
			Class159 class159 = interface19.method110(Class470.aClass470_5354, 659042581 * anInt2420, 1603939167);
			if (null != class159)
				i = interface17.method94(class159, 1484887556);
		}
		if (i < 0 || i >= anIntArray2425.length - 1) {
			int i_38_ = anIntArray2425[anIntArray2425.length - 1];
			if (-1 != i_38_)
				return ((Class239) anInterface12_2399.getDefinition(i_38_, (byte) -61));
			return null;
		}
		if (anIntArray2425[i] == -1)
			return null;
		return ((Class239) anInterface12_2399.getDefinition(anIntArray2425[i], (byte) -20));
	}

	Class239(int i, Interface12 interface12, Class234 class234) {
		anInt2398 = -3488707;
		anInt2405 = 1451549441;
		anInt2402 = 0;
		aBool2412 = true;
		aBool2413 = false;
		aStringArray2418 = new String[5];
		anInt2400 = 583405061;
		anInt2417 = 1279334627;
		anInt2426 = -973808987;
		anInt2429 = -1096017079;
		anInt2420 = 1721592259;
		anInt2437 = 200250413;
		anInt2424 = 259842055;
		anIntArray2425 = null;
		anInt2427 = 54633591;
		anInt2421 = 110803993;
		anInt2401 = -2147483648;
		anInt2430 = -2147483648;
		anInt2432 = 807307207;
		anInt2433 = 156393231;
		anInt2434 = -1313621465;
		aClass275_2411 = Class275.aClass275_2900;
		aClass273_2438 = Class273.aClass273_2888;
		anInt2416 = -2137207745;
		aBool2442 = true;
		anInt2443 = 946943721;
		anInt2419 = 593777055;
		anInt2403 = 292075709 * i;
		anInterface12_2399 = interface12;
		aClass234_2414 = class234;
	}

	public void method77() {
		if (null != anIntArray2445) {
			for (int i = 0; i < anIntArray2445.length; i += 2) {
				if (anIntArray2445[i] < 374901433 * anInt2427)
					anInt2427 = anIntArray2445[i] * 2092850057;
				else if (anIntArray2445[i] > anInt2401 * -892198963)
					anInt2401 = 1077929221 * anIntArray2445[i];
				if (anIntArray2445[i + 1] < 973938647 * anInt2421)
					anInt2421 = 2036679655 * anIntArray2445[i + 1];
				else if (anIntArray2445[i + 1] > -1256537267 * anInt2430)
					anInt2430 = -573297275 * anIntArray2445[1 + i];
			}
		}
	}

	static Class287[] method4335(byte i) {
		return (new Class287[] { Class287.aClass287_3097, Class287.aClass287_3098, Class287.aClass287_3099 });
	}

	public static int method4336(int i, short i_39_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_40_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_41_ = (double) (i & 0xff) / 256.0;
		double d_42_ = d;
		if (d_40_ < d_42_)
			d_42_ = d_40_;
		if (d_41_ < d_42_)
			d_42_ = d_41_;
		double d_43_ = d;
		if (d_40_ > d_43_)
			d_43_ = d_40_;
		if (d_41_ > d_43_)
			d_43_ = d_41_;
		double d_44_ = 0.0;
		double d_45_ = 0.0;
		double d_46_ = (d_42_ + d_43_) / 2.0;
		if (d_42_ != d_43_) {
			if (d_46_ < 0.5)
				d_45_ = (d_43_ - d_42_) / (d_42_ + d_43_);
			if (d_46_ >= 0.5)
				d_45_ = (d_43_ - d_42_) / (2.0 - d_43_ - d_42_);
			if (d_43_ == d)
				d_44_ = (d_40_ - d_41_) / (d_43_ - d_42_);
			else if (d_43_ == d_40_)
				d_44_ = (d_41_ - d) / (d_43_ - d_42_) + 2.0;
			else if (d_41_ == d_43_)
				d_44_ = (d - d_40_) / (d_43_ - d_42_) + 4.0;
		}
		d_44_ /= 6.0;
		int i_47_ = (int) (256.0 * d_44_);
		int i_48_ = (int) (256.0 * d_45_);
		int i_49_ = (int) (256.0 * d_46_);
		if (i_48_ < 0)
			i_48_ = 0;
		else if (i_48_ > 255)
			i_48_ = 255;
		if (i_49_ < 0)
			i_49_ = 0;
		else if (i_49_ > 255)
			i_49_ = 255;
		if (i_49_ > 243)
			i_48_ >>= 4;
		else if (i_49_ > 217)
			i_48_ >>= 3;
		else if (i_49_ > 192)
			i_48_ >>= 2;
		else if (i_49_ > 179)
			i_48_ >>= 1;
		return ((i_47_ & 0xff) >> 2 << 10) + (i_48_ >> 5 << 7) + (i_49_ >> 1);
	}

	static final void method4337(Class669 class669, int i) {
		int i_50_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_50_, -1913954059);
		Class242 class242 = Class31.aClass242Array302[i_50_ >> 16];
		Class254.method4545(class250, class242, class669, 1874600493);
	}

	static final void method4338(Class669 class669, int i) {
		Class212.method3830(1552913012);
	}

	static final void method4339(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class509.aString5723.startsWith("mac") ? 1 : 0;
	}

	static void method4340(byte i) {
		Class569.aTwitchWebcamDeviceArray7648 = Class323.aTwitchTV3452.GetWebcamDevices();
	}
}
