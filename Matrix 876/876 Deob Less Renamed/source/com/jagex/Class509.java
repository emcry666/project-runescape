/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class509 {
	static String aString5722;
	public static String aString5723;
	public static String aString5724;
	public static String aString5725;
	public static byte aByte5726;

	Class509() throws Throwable {
		throw new Error();
	}

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5723 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5724 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString5722 = string.toLowerCase();
		aString5725 = String.format("%s (%s) [%s]", new Object[] { aString5723, aString5724, aString5722 });
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	static int method8507(int i, byte i_0_) {
		if (i == 16711935)
			return -1;
		return Class239.method4336(i, (short) 10314);
	}

	static void method8508(Class523_Sub29 class523_sub29, int i) {
		Class27.aClass298_Sub1_257 = new Class298_Sub1(client.aClass65_11267);
		Class27.aClass298_Sub1_257.method5311(Class293.aClass293_3160, 2004674635);
		try {
			Class328_Sub1 class328_sub1 = ((Class328_Sub1) Class27.aClass298_Sub1_257.method5313((Class291.aClass291_3151), false, (byte) -91));
			Class688_Sub3 class688_sub3 = ((Class688_Sub3) Class27.aClass298_Sub1_257.method5328((Class294.aClass294_3166), false, (short) 11604));
			class328_sub1.method15568(class523_sub29, (byte) 1);
			class688_sub3.method17099(new Class440(0.0F, 0.0F, 0.0F), (short) -11611);
			Class27.aClass298_Sub1_257.method5323(Class437.method6879(99999.0F, 99999.0F, 99999.0F), 646493906);
			Class27.aClass298_Sub1_257.method5319(Class437.method6879(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -1041617368);
			Class27.aClass298_Sub1_257.method5308(Class437.method6879(99999.0F, 99999.0F, 99999.0F), 431429204);
			Class27.aClass298_Sub1_257.method5318(Class437.method6879(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -647054103);
		} catch (Exception_Sub7 exception_sub7) {
			/* empty */
		}
		Class90.anInt889 = Class642.aClass561_8334.method9426((byte) -25) * 2131985029;
		Class27.anInt256 = Class642.aClass561_8334.method9432(-1202067286) * 1605317425;
		Class27.aBool258 = true;
	}

	static final void method8509(Class669 class669, int i) {
		class669.anInt8558 -= -52267494;
		Class523_Sub29 class523_sub29 = ((Class523_Sub29) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]));
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 108) != Class294.aClass294_3166)
			throw new RuntimeException();
		((Class688_Sub3) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 32)).method17105(class523_sub29.method16163((byte) 40), class669.anIntArray8557[class669.anInt8558 * 1357652815], class669.anIntArray8557[1 + class669.anInt8558 * 1357652815], class669.anIntArray8557[2 + class669.anInt8558 * 1357652815], class669.anIntArray8557[3 + 1357652815 * class669.anInt8558], class669.anIntArray8557[4 + class669.anInt8558 * 1357652815], class669.anIntArray8557[class669.anInt8558 * 1357652815 + 5], -442414304);
	}

	static final void method8510(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3972((short) 256).size();
	}

	public static final int method8511(Class53_Sub18 class53_sub18, byte[] is, int i, int i_1_, int i_2_, int i_3_, Class650 class650, Class650 class650_4_, byte i_5_) {
		int i_6_ = 0;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_7_ = -1;
		for (;;) {
			int i_8_ = class523_sub34.method16495(200000000);
			if (0 == i_8_)
				break;
			i_7_ += i_8_;
			int i_9_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_10_ = class523_sub34.readUnsignedSmart(368514876);
					if (0 == i_10_)
						break;
					class523_sub34.readUnsignedByte(1461931077);
				} else {
					int i_11_ = class523_sub34.readUnsignedSmart(368514876);
					if (0 == i_11_)
						break;
					i_9_ += i_11_ - 1;
					int i_12_ = i_9_ & 0x3f;
					int i_13_ = i_9_ >> 6 & 0x3f;
					int i_14_ = class523_sub34.readUnsignedByte(-1530579010) >> 2;
					int i_15_ = i_14_ & 0x3;
					i_14_ >>= 2;
					int i_16_ = i_13_ + i;
					int i_17_ = i_12_ + i_1_;
					Class602 class602 = (Class602) class53_sub18.getDefinition(i_7_, (byte) -53);
					int i_18_;
					int i_19_;
					if ((i_15_ & 0x1) == 0) {
						i_18_ = -1994552549 * class602.anInt7871;
						i_19_ = -1564896481 * class602.anInt7872;
					} else {
						i_18_ = -1564896481 * class602.anInt7872;
						i_19_ = -1994552549 * class602.anInt7871;
					}
					if (i_16_ < i_2_ && i_17_ < i_3_ && i_16_ + i_18_ >= 0 && i_17_ + i_19_ >= 0) {
						if ((1923531495 * Class607.aClass607_7985.anInt7982 != i_14_) || Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-1033738751) != 0 || -344567467 * class602.anInt7874 != 0 || 972673777 * class602.anInt7852 == 1 || class602.aBool7905) {
							if (!class602.method9892(class650_4_, -1392483120)) {
								class650.anInt8380 = i_7_ * -1938569789;
								i_6_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_6_;
	}
}
