/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class105 {
	public static boolean aBool1275;
	static final int anInt1276 = 100000;
	static final int anInt1277 = 50000;
	static final int anInt1278 = 10000;
	static final int anInt1279 = 104;
	static final int anInt1280 = 501;
	static final int anInt1281 = 1000;
	static final long aLong1282 = 64425238954L;
	static final long aLong1283 = 60129613779L;
	public static boolean aBool1284 = false;
	static final float aFloat1285 = 1.3F;
	static boolean aBool1286;

	public static int method1859() {
		Class47_Sub1 class47_sub1 = Class210.method3819(-1850325235);
		Class468.method7605(class47_sub1, (byte) -125);
		return class47_sub1.method1252(203942797);
	}

	static void method1860(Class47_Sub1 class47_sub1) {
		class47_sub1.method16579(0, -447644526);
		int i;
		if (-518382423 * Class506.anInt5695 >= 96) {
			int i_0_ = Class216.method3851((byte) 4);
			if (i_0_ <= 104) {
				Class415.method6655(-602155973);
				i = 4;
			} else if (i_0_ <= 501) {
				VarDomainType.method7628(189765723);
				i = 3;
			} else if (i_0_ <= 1000) {
				Class227.method4168((byte) 126);
				i = 2;
			} else {
				Class464.method7544(true, -496963114);
				i = 1;
			}
			class47_sub1.method16581(0, i_0_, -493812305);
		} else {
			Class464.method7544(true, -496963114);
			i = 1;
			class47_sub1.method16586(64, -1117800801);
		}
		if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -8) != 0) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, 1854122990);
			Class535.method8921(0, false, (byte) -55);
		} else
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), true, 1552400785);
		Class211.method3824(2101592832);
		class47_sub1.method16578(i, 1171856874);
	}

	static Class523_Sub33 method1861() {
		Class19 class19 = null;
		Class523_Sub33 class523_sub33 = new Class523_Sub33(client.aClass681_11284, 0);
		try {
			class19 = Class53_Sub2.method17146("", client.aClass681_11284.aString8645, false, 1878448554);
			byte[] is = new byte[(int) class19.method795(-930273930)];
			int i;
			for (int i_1_ = 0; i_1_ < is.length; i_1_ += i) {
				i = class19.method784(is, i_1_, is.length - i_1_, (byte) 16);
				if (-1 == i)
					throw new IOException();
			}
			class523_sub33 = new Class523_Sub33(new RSBuffer(is), client.aClass681_11284, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class19)
				class19.method786(2025745331);
		} catch (Exception exception) {
			/* empty */
		}
		return class523_sub33;
	}

	static Class523_Sub33 method1862() {
		Class19 class19 = null;
		Class523_Sub33 class523_sub33 = new Class523_Sub33(client.aClass681_11284, 0);
		try {
			class19 = Class53_Sub2.method17146("", client.aClass681_11284.aString8645, false, 1648809553);
			byte[] is = new byte[(int) class19.method795(-546182746)];
			int i;
			for (int i_2_ = 0; i_2_ < is.length; i_2_ += i) {
				i = class19.method784(is, i_2_, is.length - i_2_, (byte) 16);
				if (-1 == i)
					throw new IOException();
			}
			class523_sub33 = new Class523_Sub33(new RSBuffer(is), client.aClass681_11284, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class19)
				class19.method786(1394650751);
		} catch (Exception exception) {
			/* empty */
		}
		return class523_sub33;
	}

	public static void method1863() {
		Class19 class19 = null;
		try {
			class19 = Class53_Sub2.method17146("", client.aClass681_11284.aString8645, true, 1859449583);
			RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 1977);
			class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class19 != null)
				class19.method786(1911068364);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static int method1864() {
		Class47_Sub1 class47_sub1 = Class210.method3819(-692803029);
		Class468.method7605(class47_sub1, (byte) -96);
		return class47_sub1.method1252(203942797);
	}

	static {
		aBool1275 = false;
		aBool1286 = false;
	}

	static Class47_Sub1 method1865() {
		Class47_Sub1 class47_sub1 = new Class47_Sub1();
		boolean bool = false;
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		if (Class611.aString8013.startsWith("win")) {
			bool_3_ = true;
			bool = true;
			bool_4_ = true;
		} else {
			bool = true;
			bool_4_ = true;
		}
		if (aBool1284) {
			class47_sub1.method16586(16, 221191360);
			bool = false;
		}
		if (aBool1275) {
			class47_sub1.method16586(32, 357547797);
			bool_3_ = false;
		}
		if (aBool1286) {
			class47_sub1.method16586(16384, -1925276008);
			bool_4_ = false;
		}
		if (!bool && !bool_3_) {
			Class334.method5909(class47_sub1, (short) -28619);
			return class47_sub1;
		}
		int i = -1;
		int i_5_ = -1;
		int i_6_ = -1;
		if (bool_3_) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 3, 768817227);
				Class211.method3824(950918627);
				i_5_ = Class678.method13821(3, 1000, -1878389720);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 42) == 3) {
					class47_sub1.method16586(4, -1770231762);
					Class150 class150 = Class31.aClass178_303.method3401();
					long l = (7027606198026803059L * class150.aLong1724 & 0xffffffffffffL);
					switch (class150.anInt1720 * -129955305) {
					case 4098: {
						boolean bool_7_ = l >= 60129613779L;
						bool &= bool_7_;
						if (!bool_7_)
							class47_sub1.method16586(512, 928881796);
						break;
					}
					case 4318: {
						boolean bool_8_ = l >= 64425238954L;
						bool &= bool_8_;
						if (!bool_8_)
							class47_sub1.method16586(256, 1376555264);
						break;
					}
					}
				}
			} catch (Exception exception) {
				class47_sub1.method16586(4096, -1424683581);
			}
		}
		if (bool_4_) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 5, 36565025);
				Class211.method3824(1321087544);
				i_6_ = Class678.method13821(5, 1000, -2008477527);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -10) == 5)
					class47_sub1.method16586(8192, -1492901673);
			} catch (Exception exception) {
				class47_sub1.method16586(32768, 1826999232);
			}
		}
		if (bool) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 4, 223223592);
				Class211.method3824(1436155039);
				i = Class678.method13821(1, 1000, -1568290828);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 86) == 1)
					class47_sub1.method16586(2, 29918579);
			} catch (Exception exception) {
				class47_sub1.method16586(2048, -42899480);
			}
		}
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub23_10608), 0, 1178500454);
		if (-1 == i && -1 == i_5_) {
			Class334.method5909(class47_sub1, (short) -16602);
			return class47_sub1;
		}
		class47_sub1.method16581(3, i_5_, -1882628826);
		class47_sub1.method16581(1, i, 388875809);
		class47_sub1.method16581(5, i_6_, 1216045439);
		i_5_ *= 1.3F;
		if (i_5_ > 100000 && i > 100000 || i_5_ > i)
			Class411.method6636(class47_sub1, 3, i == -1 ? i_5_ : i, 310725429);
		else
			Class411.method6636(class47_sub1, 1, i_5_ == -1 ? i : i_5_, 310725429);
		return class47_sub1;
	}

	static Class47_Sub1 method1866() {
		Class47_Sub1 class47_sub1 = new Class47_Sub1();
		boolean bool = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		if (Class611.aString8013.startsWith("win")) {
			bool_9_ = true;
			bool = true;
			bool_10_ = true;
		} else {
			bool = true;
			bool_10_ = true;
		}
		if (aBool1284) {
			class47_sub1.method16586(16, 1648002396);
			bool = false;
		}
		if (aBool1275) {
			class47_sub1.method16586(32, -95908242);
			bool_9_ = false;
		}
		if (aBool1286) {
			class47_sub1.method16586(16384, 775481131);
			bool_10_ = false;
		}
		if (!bool && !bool_9_) {
			Class334.method5909(class47_sub1, (short) -21795);
			return class47_sub1;
		}
		int i = -1;
		int i_11_ = -1;
		int i_12_ = -1;
		if (bool_9_) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 3, -447878278);
				Class211.method3824(1649635997);
				i_11_ = Class678.method13821(3, 1000, -1645839559);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 77) == 3) {
					class47_sub1.method16586(4, -1911896535);
					Class150 class150 = Class31.aClass178_303.method3401();
					long l = (7027606198026803059L * class150.aLong1724 & 0xffffffffffffL);
					switch (class150.anInt1720 * -129955305) {
					case 4098: {
						boolean bool_13_ = l >= 60129613779L;
						bool &= bool_13_;
						if (!bool_13_)
							class47_sub1.method16586(512, -1708900894);
						break;
					}
					case 4318: {
						boolean bool_14_ = l >= 64425238954L;
						bool &= bool_14_;
						if (!bool_14_)
							class47_sub1.method16586(256, 1383095641);
						break;
					}
					}
				}
			} catch (Exception exception) {
				class47_sub1.method16586(4096, -802084298);
			}
		}
		if (bool_10_) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 5, 811137829);
				Class211.method3824(1191732223);
				i_12_ = Class678.method13821(5, 1000, -1483881411);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 10) == 5)
					class47_sub1.method16586(8192, 1704219515);
			} catch (Exception exception) {
				class47_sub1.method16586(32768, 2094751970);
			}
		}
		if (bool) {
			try {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub23_10608, 4, 2087650923);
				Class211.method3824(1075343549);
				i = Class678.method13821(1, 1000, -1747814150);
				if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 74) == 1)
					class47_sub1.method16586(2, 560009243);
			} catch (Exception exception) {
				class47_sub1.method16586(2048, 396412403);
			}
		}
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub23_10608), 0, 564758898);
		if (-1 == i && -1 == i_11_) {
			Class334.method5909(class47_sub1, (short) -9275);
			return class47_sub1;
		}
		class47_sub1.method16581(3, i_11_, -540403017);
		class47_sub1.method16581(1, i, 646048600);
		class47_sub1.method16581(5, i_12_, -1086089968);
		i_11_ *= 1.3F;
		if (i_11_ > 100000 && i > 100000 || i_11_ > i)
			Class411.method6636(class47_sub1, 3, i == -1 ? i_11_ : i, 310725429);
		else
			Class411.method6636(class47_sub1, 1, i_11_ == -1 ? i : i_11_, 310725429);
		return class47_sub1;
	}

	Class105() throws Throwable {
		throw new Error();
	}

	public static void method1867() {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 2, 1977250035);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 2, -222420636);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 1, 1246230857);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 1, 1263396290);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 1, -158980994);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 1, -109926023);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 1, 87135268);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 1, 1180723415);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 1, -317112562);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 1, 2016953999);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 0, 874008623);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 1, 1119059756);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, -1032215634);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, 1601898105);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 1, 943690155);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, 1532564021 * Class284.aClass284_3076.anInt3075, 584821894);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, 1630935027);
		if (null != Class31.aClass178_303 && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 1, 1614512196);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 1, 1249119104);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 1, -175509735);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 3, -422898819);
		Class165.method2655((byte) 55);
		client.aClass505_11019.method8271((byte) 8).method10249(-761411640);
		client.aBool11133 = true;
	}

	static void method1868(Class47_Sub1 class47_sub1, int i, int i_15_) {
		class47_sub1.method16579(i, 1107111335);
		int i_16_;
		if (i_15_ > 100000) {
			Class415.method6655(-602155973);
			i_16_ = 4;
		} else if (i_15_ > 50000) {
			VarDomainType.method7628(189765723);
			i_16_ = 3;
		} else if (i_15_ > 10000) {
			Class227.method4168((byte) 125);
			i_16_ = 2;
		} else {
			Class464.method7544(true, -496963114);
			i_16_ = 1;
		}
		if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 1) != i) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), i, 1650422413);
			Class535.method8921(i, false, (byte) -53);
		} else
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), true, 1386938986);
		Class211.method3824(1030608130);
		class47_sub1.method16578(i_16_, 872598450);
	}

	public static void method1869() {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 2, -1188721507);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 2, -710119366);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 1, -1336066999);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 1, -545714712);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 1, -1200276955);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 1, 1988310447);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 1, 1271132458);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 1, 1884685112);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 1, 497134103);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 1, 1620789664);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 0, 622945392);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 1, -1172126319);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, -208469686);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, 1714096912);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 1, 856152115);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, 1532564021 * Class284.aClass284_3076.anInt3075, 1613220220);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, -582447623);
		if (null != Class31.aClass178_303 && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 1, 1054279860);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 1, 528782217);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 1, -1157874061);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 3, -881486389);
		Class165.method2655((byte) 112);
		client.aClass505_11019.method8271((byte) 8).method10249(-1151438905);
		client.aBool11133 = true;
	}

	static void method1870(Class47_Sub1 class47_sub1) {
		class47_sub1.method16579(0, 1978241616);
		int i;
		if (-518382423 * Class506.anInt5695 >= 96) {
			int i_17_ = Class216.method3851((byte) 25);
			if (i_17_ <= 104) {
				Class415.method6655(-602155973);
				i = 4;
			} else if (i_17_ <= 501) {
				VarDomainType.method7628(189765723);
				i = 3;
			} else if (i_17_ <= 1000) {
				Class227.method4168((byte) 122);
				i = 2;
			} else {
				Class464.method7544(true, -496963114);
				i = 1;
			}
			class47_sub1.method16581(0, i_17_, -399073584);
		} else {
			Class464.method7544(true, -496963114);
			i = 1;
			class47_sub1.method16586(64, 139521313);
		}
		if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 34) != 0) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, 1728708017);
			Class535.method8921(0, false, (byte) -31);
		} else
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), true, 1782502559);
		Class211.method3824(1213256345);
		class47_sub1.method16578(i, 1355539435);
	}

	public static void method1871() {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 2, -527337506);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 2, 1597195196);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 1, -532729948);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 1, -857167448);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 1, -1087200244);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 1, 1958799054);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 1, -863471519);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 1, 72782514);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 2, -638467387);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 1, -28720371);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 2, 1691941529);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 1, 208704240);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, 1512696232);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, -466000835);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 2, -1349978127);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, Class284.aClass284_3076.anInt3075 * 1532564021, 664502334);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, 1681683435);
		if (null != Class31.aClass178_303 && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 1, -524922475);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 1, -1007885696);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 0, 953841187);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 4, 1777714195);
		Class165.method2655((byte) 50);
		client.aClass505_11019.method8271((byte) 8).method10249(-481591582);
		client.aBool11133 = true;
	}

	public static void method1872() {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 2, 889523523);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 2, 1138694093);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 1, 208954624);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 1, -577786233);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 1, -538353098);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 1, 114074887);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 1, 853483903);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 1, -661991443);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 2, 503760620);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 1, 1563899148);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 2, -853192922);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 1, -928165627);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, -89623782);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, 2084864536);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 2, -1086824057);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, Class284.aClass284_3076.anInt3075 * 1532564021, -125874877);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, 400366436);
		if (null != Class31.aClass178_303 && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 1, -916642510);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 1, 312634119);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 0, 1363858607);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 4, 665253364);
		Class165.method2655((byte) 51);
		client.aClass505_11019.method8271((byte) 8).method10249(-1266666252);
		client.aBool11133 = true;
	}

	public static void method1873() {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 1, 1182097314);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 1, 1664514785);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 1, -530974484);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 1, 1729666351);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 0, 803027719);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 0, 50868421);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 0, 1638361898);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 0, -891506152);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 0, 2021122475);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 0, -1137435320);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 0, 911139933);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 0, -281157175);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, 2944502);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, 509884730);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 0, 1640931530);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, Class284.aClass284_3076.anInt3075 * 1532564021, 1025327697);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, -936196708);
		if (null != Class31.aClass178_303 && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 0, 1704695593);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 0, 8639396);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 2, 399287612);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 2, 1945147309);
		Class165.method2655((byte) 33);
		client.aClass505_11019.method8271((byte) 8).method10249(-8542097);
		client.aBool11133 = true;
	}

	public static void method1874() {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 1, 1099110782);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 1, -313731711);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 1, 1817713131);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 1, 342634836);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 0, 1438463123);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 0, 1930746248);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 0, 1763610777);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 0, -10931869);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 0, 1806410737);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 0, 187802559);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 0, -369753416);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 0, 535066398);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, 2052227808);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, -1371948863);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 0, -490707790);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, Class284.aClass284_3076.anInt3075 * 1532564021, -556967568);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, -119668547);
		if (null != Class31.aClass178_303 && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 0, -340578270);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 0, 1542389790);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 2, 40008663);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 2, -740153511);
		Class165.method2655((byte) 121);
		client.aClass505_11019.method8271((byte) 8).method10249(1712963292);
		client.aBool11133 = true;
	}

	public static void method1875(boolean bool) {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 1, -208096184);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 1, -1221248675);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 0, 755728433);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 0, 1259199589);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 0, 452248988);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 0, -291910405);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 0, 751888211);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 0, 1775668455);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 0, 194461039);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 0, -713196401);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 0, 544066538);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 0, -1170810334);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, -80069205);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, -835797468);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 0, 2042125037);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, Class284.aClass284_3076.anInt3075 * 1532564021, -356479502);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, 1343948081);
		if (Class31.aClass178_303 != null && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 0, 566367520);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 0, 951679552);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 2, 559412781);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 1, 1193036647);
		Class165.method2655((byte) 112);
		client.aClass505_11019.method8271((byte) 8).method10249(1051561542);
		client.aBool11133 = true;
	}

	public static void method1876(boolean bool) {
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), 1, 1851304972);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), 1, 208324075);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub20_10616), 0, 85435632);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub14_10598), 0, 2013453291);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub40_10615), 0, 988706208);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub37_10642), 0, 1104400877);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub13_10613), 0, 1272500237);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub7_10627), 0, 1060263006);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub10_10619), 0, 180875601);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub8_10628), 0, -946441012);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub12_10618), 0, -1343688760);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub4_10625), 0, -138017309);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10605), 0, 311569282);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub39_10606), 0, 1656135621);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub9_10622), 0, 467898716);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub16_10624, Class284.aClass284_3076.anInt3075 * 1532564021, -623790314);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub30_10610), 0, -853409204);
		if (Class31.aClass178_303 != null && Class31.aClass178_303.method3030() && Class31.aClass178_303.method3146())
			Class31.aClass178_303.method3145();
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub41_10626), 0, 1400207233);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub21_10604), 0, 887751386);
		Class562.method9462((byte) 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub42_10612), 2, 1465256292);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 1, -1219316563);
		Class165.method2655((byte) 9);
		client.aClass505_11019.method8271((byte) 8).method10249(15530501);
		client.aBool11133 = true;
	}

	static void method1877() {
		if (Class506.anInt5696 * -664699347 > 1)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 4, 1473961824);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 2, 455515245);
	}

	static void method1878() {
		if (Class506.anInt5696 * -664699347 > 1)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 4, 1340920071);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 2, -1183772491);
	}

	static void method1879() {
		if (Class506.anInt5696 * -664699347 > 1)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 4, 1526546931);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 2, -815221583);
	}

	static void method1880() {
		if (Class506.anInt5696 * -664699347 > 1)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 4, 215811257);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 2, 777125174);
	}

	static void method1881() {
		if (Class506.anInt5696 * -664699347 > 1)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 4, 1608378046);
		else
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub24_10614), 2, 936099177);
	}

	static final void method1882(Class669 class669, short i) {
		int i_18_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_18_, -1075035904);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.method17252(class250).method15964(-462282811);
	}

	static final void method1883(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_19_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_20_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		class669.aClass387_8567.anIntArray4008[i_19_] = i_20_;
	}

	static final void method1884(int i) {
		for (Class522_Sub3 class522_sub3 = ((Class522_Sub3) client.aClass701_11252.method14092(1391253415)); class522_sub3 != null; class522_sub3 = ((Class522_Sub3) client.aClass701_11252.method14092(2039911584)))
			Class266.method4889(class522_sub3, (byte) 6);
		int i_21_ = 0;
		int i_22_ = 3;
		if (4 == -1616721887 * client.anInt11071) {
			for (int i_23_ = i_21_; i_23_ <= i_22_; i_23_++)
				client.method17583(i_23_);
			client.method17250();
		} else {
			client.method17245();
			for (int i_24_ = i_21_; i_24_ <= i_22_; i_24_++) {
				client.method17542();
				client.method17247(i_24_);
				client.method17583(i_24_);
			}
			client.method17249();
			client.method17250();
		}
	}
}
