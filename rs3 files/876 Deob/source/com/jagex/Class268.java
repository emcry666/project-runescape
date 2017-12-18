/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Image;

public class Class268 {
	int anInt2865;
	int anInt2866;
	String aString2867;
	public static Image anImage2868;

	Class268(String string, int i, int i_0_) {
		aString2867 = string;
		anInt2866 = i * -1242096093;
		anInt2865 = -38666381 * i_0_;
	}

	public static boolean method4897(int i) {
		return Class308.aBool3359;
	}

	public static final void method4898(int i) {
		Class506.aClass503_5666.method8165(-737467416);
		for (int i_1_ = 0; i_1_ < 32; i_1_++)
			Class506.aLongArray5686[i_1_] = 0L;
		for (int i_2_ = 0; i_2_ < 32; i_2_++)
			Class506.aLongArray5677[i_2_] = 0L;
		Class506.anInt5690 = 0;
	}

	static void method4899(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class399.method6530(string, (byte) 76);
	}

	static final void method4900(Class669 class669, int i) {
		Class254.aClass217_2743.method3883((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), -21589965);
	}

	static final void method4901(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_3_ < 0)
			i_3_ = 0;
		client.anInt11110 = -411833159 * (-1272954495 * client.anInt11077 + i_3_);
	}

	public static void method4902(Class652 class652, byte i) {
		if (Class379.aClass379_3931 == class652.aClass379_8397)
			Class655.aClass375_8420 = new Class375_Sub1(class652);
		else if (Class379.aClass379_3930 == class652.aClass379_8397)
			Class655.aClass375_8420 = new Class375_Sub2(class652);
		else
			throw new RuntimeException();
	}

	static void method4903(int i, int i_4_) {
		if (21 == i)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class56.method1363(-1669430890);
			else if (16 == i)
				Class485.method7932(new StringBuilder().append("").append(Class506.anInt5662 * -1307622225).toString(), (byte) -50);
			else if (i == 3) {
				Class544 class544 = (client.aClass505_11019.method8241((byte) -74).aClass544_7541);
				class544.aBool7277 = !class544.aBool7277;
			} else if (24 == i)
				client.aBool11096 = true;
			else if (i == 23)
				client.aBool11096 = false;
			else if (19 == i)
				client.aClass701_11132.method14082((byte) -93);
			else if (i == 29) {
				Class550.method9123((byte) 41);
				for (int i_5_ = 0; i_5_ < 10; i_5_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_6_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_6_).toString(), (byte) -85);
			} else if (i == 27) {
				Class550.method9123((byte) -30);
				for (int i_7_ = 0; i_7_ < 10; i_7_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_8_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_8_).toString(), (byte) -75);
				Class468.method7608((short) -11007);
				Class550.method9123((byte) -28);
				for (int i_9_ = 0; i_9_ < 10; i_9_++)
					System.gc();
				i_8_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_8_).toString(), (byte) -83);
			} else if (5 == i)
				Class485.method7932((Class194_Sub19.aClass532_9953.method380(392320752) ? "Success" : "Failure"), (byte) -21);
			else if (i == 28)
				Class155.aClass1_1735.method497((byte) -88);
			else if (i == 22)
				Class572.aClass458_7684.close(952755890);
			else if (13 == i)
				Class572.aClass458_7684.finishGrabServer(2002437890);
			else if (i == 7)
				Class523_Sub18_Sub8.aCanvas11689.setLocation(50, 50);
			else if (i == 25)
				Class523_Sub18_Sub8.aCanvas11689.setLocation(Class506.anInt5660 * -1901078577, Class506.anInt5670 * -1734289153);
			else if (i == 17)
				Class87.method1615(1444609703);
			else if (i == 8) {
				client.aClass505_11019.aLong5656 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -7546729170109173589L;
				client.aClass505_11019.aBool5655 = true;
				Class87.method1615(1444609703);
			} else if (10 == i) {
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class485.method7932(new StringBuilder().append((int) class437.aFloat4903 >> 9).append(" ").append((int) class437.aFloat4905 >> 9).toString(), (byte) -91);
			} else if (11 == i) {
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class485.method7932(new StringBuilder().append("").append(client.aClass505_11019.method8241((byte) -27).aClass142Array7509[(Class241.player.aByte10821)].method2321((int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, 1641882332)).toString(), (byte) -100);
			} else if (1 == i) {
				Class485.method7932(new StringBuilder().append(InterfaceComponentDefinitions.aClass209_2521.method3780(30105747)).append(" ").append(InterfaceComponentDefinitions.aClass209_2521.method3774((short) 2487)).toString(), (byte) -109);
				Class485.method7932(new StringBuilder().append(InterfaceComponentDefinitions.aClass209_2524.method3780(30105747)).append(" ").append(InterfaceComponentDefinitions.aClass209_2524.method3774((short) 19898)).toString(), (byte) -29);
			} else if (4 == i)
				Class679.method13827(false, (byte) -24);
			else if (20 == i) {
				client.aBool11280 = !client.aBool11280;
				Class31.aClass178_303.method3157(client.aBool11280);
				Class170.method2889(-1009972049);
			} else if (14 == i) {
				client.anInt11228 = 0;
				client.aClass505_11019.method8294(-889374440);
			} else if (i == 15) {
				client.anInt11228 = -965789903;
				client.aClass505_11019.method8294(-889374440);
			} else if (i == 26) {
				client.anInt11228 = -1931579806;
				client.aClass505_11019.method8294(-889374440);
			}
		} catch (Exception exception) {
			Class485.method7932(Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -30), (byte) -39);
		}
	}

	public static Class695[] method4904(byte i) {
		if (Class97.aClass695Array1184 == null) {
			Class695[] class695s = Class261.method4722(Class110.aClass693_1332, 2064925813);
			Class695[] class695s_10_ = new Class695[class695s.length];
			int i_11_ = 0;
			int i_12_ = Class449.aClass523_Sub33_4946.aClass687_Sub42_10612.method17130(-1809880932);
			while_174_: for (int i_13_ = 0; i_13_ < class695s.length; i_13_++) {
				Class695 class695 = class695s[i_13_];
				if ((class695.anInt8752 * 1643077973 <= 0 || class695.anInt8752 * 1643077973 >= 24) && 1074115321 * class695.anInt8753 >= 800 && class695.anInt8754 * -88336395 >= 600 && (2 != i_12_ || (class695.anInt8753 * 1074115321 <= 800 && class695.anInt8754 * -88336395 <= 600)) && (i_12_ != 1 || (1074115321 * class695.anInt8753 <= 1024 && -88336395 * class695.anInt8754 <= 768))) {
					for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
						Class695 class695_15_ = class695s_10_[i_14_];
						if ((class695.anInt8753 * 1074115321 == 1074115321 * class695_15_.anInt8753) && (class695_15_.anInt8754 * -88336395 == -88336395 * class695.anInt8754)) {
							if (1643077973 * class695.anInt8752 > 1643077973 * class695_15_.anInt8752)
								class695s_10_[i_14_] = class695;
							continue while_174_;
						}
					}
					class695s_10_[i_11_] = class695;
					i_11_++;
				}
			}
			Class97.aClass695Array1184 = new Class695[i_11_];
			System.arraycopy(class695s_10_, 0, Class97.aClass695Array1184, 0, i_11_);
			int[] is = new int[Class97.aClass695Array1184.length];
			for (int i_16_ = 0; i_16_ < Class97.aClass695Array1184.length; i_16_++) {
				Class695 class695 = Class97.aClass695Array1184[i_16_];
				is[i_16_] = class695.anInt8754 * -88336395 * (1074115321 * class695.anInt8753);
			}
			Class622.method10165(is, Class97.aClass695Array1184, (byte) 51);
		}
		return Class97.aClass695Array1184;
	}

	public static void method4905(Class29 class29, String string, int i, Throwable throwable, int i_17_) {
		Class95.method1767(new Class581(class29, string, i, throwable), 1445865945);
	}

	static int method4906(Class472 class472, JS5ConfigStruct class656, int i) {
		if (null != class472) {
			if (class656.method10741(1412295737) > 1) {
				int i_18_ = class472.method7641(-2064944171) - 1;
				return (i_18_ * class656.method10741(315915354) + class472.method7702(i_18_, (byte) 103));
			}
			return class472.method7702(1688317219 * class656.anInt8501, (byte) -16);
		}
		return 0;
	}
}
