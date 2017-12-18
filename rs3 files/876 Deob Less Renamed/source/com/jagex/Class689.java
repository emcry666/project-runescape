/* Class689 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class689 {
	static int anInt8676;
	static int[] anIntArray8677;
	static int anInt8678;
	static byte[][] aByteArrayArray8679;
	static byte[][] aByteArrayArray8680;
	static int anInt8681 = 0;
	static int[] anIntArray8682;
	static byte[][] aByteArrayArray8683;

	public static void method13935(int[] is, int[] is_0_) {
		if (null == is || null == is_0_) {
			anIntArray8682 = null;
			anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			anIntArray8682 = is;
			anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8682.length; i++)
				Class212.aByteArrayArrayArray2266[i] = new byte[is_0_[i]][];
		}
	}

	public static synchronized byte[] method13936(int i, boolean bool, int i_1_) {
		if ((100 == i || i < 100 && bool) && anInt8681 * 1621955103 > 0) {
			byte[] is = aByteArrayArray8679[(anInt8681 -= -631117345) * 1621955103];
			aByteArrayArray8679[anInt8681 * 1621955103] = null;
			return is;
		}
		if ((5000 == i || i < 5000 && bool) && anInt8676 * 726610875 > 0) {
			byte[] is = aByteArrayArray8680[(anInt8676 -= 569612659) * 726610875];
			aByteArrayArray8680[726610875 * anInt8676] = null;
			return is;
		}
		if ((30000 == i || i < 30000 && bool) && -178112219 * anInt8678 > 0) {
			byte[] is = aByteArrayArray8683[(anInt8678 -= 1978219181) * -178112219];
			aByteArrayArray8683[anInt8678 * -178112219] = null;
			return is;
		}
		if (null != Class212.aByteArrayArrayArray2266) {
			for (int i_2_ = 0; i_2_ < anIntArray8682.length; i_2_++) {
				if ((i == anIntArray8682[i_2_] || i < anIntArray8682[i_2_] && bool) && anIntArray8677[i_2_] > 0) {
					byte[] is = (Class212.aByteArrayArrayArray2266[i_2_][--anIntArray8677[i_2_]]);
					Class212.aByteArrayArrayArray2266[i_2_][(anIntArray8677[i_2_])] = null;
					return is;
				}
			}
		}
		if (bool && null != anIntArray8682) {
			for (int i_3_ = 0; i_3_ < anIntArray8682.length; i_3_++) {
				if (i <= anIntArray8682[i_3_] && (anIntArray8677[i_3_] < Class212.aByteArrayArrayArray2266[i_3_].length))
					return new byte[anIntArray8682[i_3_]];
			}
		}
		return new byte[i];
	}

	public static synchronized byte[] method13937(int i, int i_4_) {
		return method13936(i, false, 1841110717);
	}

	public static synchronized void method13938(byte[] is, byte i) {
		if (is.length == 100 && 1621955103 * anInt8681 < 1000)
			aByteArrayArray8679[(anInt8681 += -631117345) * 1621955103 - 1] = is;
		else if (5000 == is.length && 726610875 * anInt8676 < 250)
			aByteArrayArray8680[(anInt8676 += 569612659) * 726610875 - 1] = is;
		else if (30000 == is.length && -178112219 * anInt8678 < 50)
			aByteArrayArray8683[(anInt8678 += 1978219181) * -178112219 - 1] = is;
		else if (Class212.aByteArrayArrayArray2266 != null) {
			for (int i_5_ = 0; i_5_ < anIntArray8682.length; i_5_++) {
				if (is.length == anIntArray8682[i_5_] && (anIntArray8677[i_5_] < Class212.aByteArrayArrayArray2266[i_5_].length)) {
					Class212.aByteArrayArrayArray2266[i_5_][anIntArray8677[i_5_]++] = is;
					break;
				}
			}
		}
	}

	static {
		anInt8676 = 0;
		anInt8678 = 0;
		aByteArrayArray8679 = new byte[1000][];
		aByteArrayArray8680 = new byte[250][];
		aByteArrayArray8683 = new byte[50][];
	}

	public static void method13939(int[] is, int[] is_6_) {
		if (null == is || null == is_6_) {
			anIntArray8682 = null;
			anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			anIntArray8682 = is;
			anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8682.length; i++)
				Class212.aByteArrayArrayArray2266[i] = new byte[is_6_[i]][];
		}
	}

	public static void method13940(int[] is, int[] is_7_) {
		if (null == is || null == is_7_) {
			anIntArray8682 = null;
			anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			anIntArray8682 = is;
			anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8682.length; i++)
				Class212.aByteArrayArrayArray2266[i] = new byte[is_7_[i]][];
		}
	}

	public static void method13941(int[] is, int[] is_8_) {
		if (null == is || null == is_8_) {
			anIntArray8682 = null;
			anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			anIntArray8682 = is;
			anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8682.length; i++)
				Class212.aByteArrayArrayArray2266[i] = new byte[is_8_[i]][];
		}
	}

	Class689() throws Throwable {
		throw new Error();
	}

	public static void method13942(int[] is, int[] is_9_) {
		if (null == is || null == is_9_) {
			anIntArray8682 = null;
			anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			anIntArray8682 = is;
			anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8682.length; i++)
				Class212.aByteArrayArrayArray2266[i] = new byte[is_9_[i]][];
		}
	}

	public static synchronized byte[] method13943(int i) {
		return method13936(i, false, 1888444130);
	}

	public static synchronized void method13944(byte[] is) {
		if (is.length == 100 && 1621955103 * anInt8681 < 1000)
			aByteArrayArray8679[(anInt8681 += -631117345) * 1621955103 - 1] = is;
		else if (5000 == is.length && 726610875 * anInt8676 < 250)
			aByteArrayArray8680[(anInt8676 += 569612659) * 726610875 - 1] = is;
		else if (30000 == is.length && -178112219 * anInt8678 < 50)
			aByteArrayArray8683[(anInt8678 += 1978219181) * -178112219 - 1] = is;
		else if (Class212.aByteArrayArrayArray2266 != null) {
			for (int i = 0; i < anIntArray8682.length; i++) {
				if (is.length == anIntArray8682[i] && (anIntArray8677[i] < Class212.aByteArrayArrayArray2266[i].length)) {
					Class212.aByteArrayArrayArray2266[i][anIntArray8677[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized byte[] method13945(int i) {
		return method13936(i, false, 1838700759);
	}

	public static synchronized byte[] method13946(int i) {
		return method13936(i, false, 1821103121);
	}

	public static synchronized void method13947(byte[] is) {
		if (is.length == 100 && 1621955103 * anInt8681 < 1000)
			aByteArrayArray8679[(anInt8681 += -631117345) * 1621955103 - 1] = is;
		else if (5000 == is.length && 726610875 * anInt8676 < 250)
			aByteArrayArray8680[(anInt8676 += 569612659) * 726610875 - 1] = is;
		else if (30000 == is.length && -178112219 * anInt8678 < 50)
			aByteArrayArray8683[(anInt8678 += 1978219181) * -178112219 - 1] = is;
		else if (Class212.aByteArrayArrayArray2266 != null) {
			for (int i = 0; i < anIntArray8682.length; i++) {
				if (is.length == anIntArray8682[i] && (anIntArray8677[i] < Class212.aByteArrayArrayArray2266[i].length)) {
					Class212.aByteArrayArrayArray2266[i][anIntArray8677[i]++] = is;
					break;
				}
			}
		}
	}

	public static void method13948(int[] is, int[] is_10_) {
		if (null == is || null == is_10_) {
			anIntArray8682 = null;
			anIntArray8677 = null;
			Class212.aByteArrayArrayArray2266 = null;
		} else {
			anIntArray8682 = is;
			anIntArray8677 = new int[is.length];
			Class212.aByteArrayArrayArray2266 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8682.length; i++)
				Class212.aByteArrayArrayArray2266[i] = new byte[is_10_[i]][];
		}
	}

	static long method13949(Interface61 interface61, int i, int i_11_, short i_12_) {
		long l = 4194304L;
		long l_13_ = -9223372036854775808L;
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(1786116277).getDefinition(interface61.method401(-770473736), (byte) 85));
		long l_14_ = (long) (i | i_11_ << 7 | interface61.method69(1807608029) << 14 | interface61.method390(1259048815) << 20 | 0x40000000);
		if (0 == class602.anInt7874 * -344567467)
			l_14_ |= l_13_;
		if (591624555 * class602.anInt7862 == 1)
			l_14_ |= l;
		l_14_ |= (long) interface61.method401(-770473736) << 32;
		return l_14_;
	}

	static void method13950(int i) {
		Class104.anInt1274 = 0;
		Class104.anInt1259 = 440028073;
		Class104.anInt1269 = 250567387;
		Class104.anInt1270 = 1284332517;
	}

	static final void method13951(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, byte i_20_) {
		Class111[] class111s = client.aClass111Array11017;
		for (int i_21_ = 0; i_21_ < class111s.length; i_21_++) {
			Class111 class111 = class111s[i_21_];
			if (null != class111 && 2 == 239678453 * class111.anInt1334) {
				Class28.method872(class111.anInt1335 * 1261553909, 1757546743 * class111.anInt1338, class111.anInt1339 * 1490265041, 0, class111.anInt1337 * -1681625766, false, false, (byte) -67);
				if (client.aFloatArray11297[0] > -1.0F && client.anInt11011 % 20 < 10) {
					Class148 class148 = (Class566.aClass148Array7606[309561833 * class111.anInt1344]);
					int i_22_ = (int) ((float) i + client.aFloatArray11297[0] - 12.0F);
					int i_23_ = (int) (client.aFloatArray11297[1] + (float) i_15_ - 28.0F);
					class148.method2435(i_22_, i_23_);
				}
			}
		}
	}

	public static void method13952(Class625 class625, byte i) {
		Class34.anInt315 = class625.anInt8163 * 1372222981;
		Class34.anInt314 = class625.anInt8137 * 960585239;
		Class61.anInt767 = class625.anInt8165 * 833545191;
	}

	static void method13953(int i, int i_24_, Class250 class250, Class236 class236, int i_25_, int i_26_, int i_27_) {
		Class111[] class111s = client.aClass111Array11017;
		for (int i_28_ = 0; i_28_ < class111s.length; i_28_++) {
			Class111 class111 = class111s[i_28_];
			if (null != class111 && class111.anInt1334 * 239678453 != 0 && client.anInt11011 % 20 < 10) {
				if (239678453 * class111.anInt1334 == 1) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.method741((long) (class111.anInt1336 * 920515165))));
					if (class523_sub28 != null) {
						Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_29_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_30_ = (int) class437.aFloat4905 / 128 - i_24_ / 128;
						Class251.method4528(class250, class236, i_25_, i_26_, i_29_, i_30_, 309561833 * class111.anInt1344, 360000L);
					}
				}
				if (class111.anInt1334 * 239678453 == 2) {
					int i_31_ = 1757546743 * class111.anInt1338 / 128 - i / 128;
					int i_32_ = 1490265041 * class111.anInt1339 / 128 - i_24_ / 128;
					long l = (long) (class111.anInt1342 * -1510348621 << 7);
					l *= l;
					Class251.method4528(class250, class236, i_25_, i_26_, i_31_, i_32_, class111.anInt1344 * 309561833, l);
				}
				if (239678453 * class111.anInt1334 == 10 && class111.anInt1336 * 920515165 >= 0 && (920515165 * class111.anInt1336 < (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153).length)) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[class111.anInt1336 * 920515165]);
					if (class647_sub1_sub3_sub1_sub2 != null) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
						int i_33_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_34_ = (int) class437.aFloat4905 / 128 - i_24_ / 128;
						Class251.method4528(class250, class236, i_25_, i_26_, i_33_, i_34_, 309561833 * class111.anInt1344, 360000L);
					}
				}
			}
		}
	}

	public static void method13954(int i, int i_35_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(6, (long) i);
		class523_sub27_sub7.method17962((byte) 65);
	}
}
