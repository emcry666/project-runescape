/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class82 {
	Class472 aClass472_868;
	Class90[] aClass90Array869;
	static final int anInt870 = 0;
	int anInt871;
	static Class148[] aClass148Array872;

	public boolean method1569() {
		return -1 != -1029672619 * anInt871;
	}

	public Class92 method1570(int i) {
		byte[] is = aClass472_868.method7688(i, 0, 651496319);
		Class92 class92 = new Class92();
		class92.method1662(new Class523_Sub34(is), (byte) 80);
		return class92;
	}

	public Class92 method1571(int i, int i_0_) {
		byte[] is = aClass472_868.method7688(i, 0, 1953480919);
		Class92 class92 = new Class92();
		class92.method1662(new Class523_Sub34(is), (byte) -10);
		return class92;
	}

	public Class93[] method1572(int i, int i_1_) {
		if (i < 0 || i >= aClass90Array869.length)
			return method1577(0, 0, (byte) 80).aClass93Array888;
		Class90 class90 = aClass90Array869[i];
		if (!class90.aBool887 || class90.aClass93Array888.length <= 1)
			return class90.aClass93Array888;
		int i_2_ = -1029672619 * anInt871 == -1 ? 0 : 1;
		Random random = new Random();
		Class93[] class93s = new Class93[class90.aClass93Array888.length];
		System.arraycopy(class90.aClass93Array888, 0, class93s, 0, class93s.length);
		for (int i_3_ = i_2_; i_3_ < class93s.length; i_3_++) {
			int i_4_ = (Class588.method9742(random, class93s.length - i_2_, -660862599) + i_2_);
			Class93 class93 = class90.aClass93Array888[i_3_];
			class93s[i_3_] = class93s[i_4_];
			class93s[i_4_] = class93;
		}
		return class93s;
	}

	public boolean method1573(byte i) {
		return -1 != -1029672619 * anInt871;
	}

	Class90 method1574(int i, int i_5_) {
		if (anInt871 * -1029672619 == -1)
			return new Class90(false, new Class93[0]);
		Class93 class93 = new Class93(anInt871 * -1029672619, i, i_5_);
		return new Class90(false, new Class93[] { class93 });
	}

	Class90 method1575(int i, int i_6_) {
		if (anInt871 * -1029672619 == -1)
			return new Class90(false, new Class93[0]);
		Class93 class93 = new Class93(anInt871 * -1029672619, i, i_6_);
		return new Class90(false, new Class93[] { class93 });
	}

	Class90 method1576(int i, int i_7_) {
		if (anInt871 * -1029672619 == -1)
			return new Class90(false, new Class93[0]);
		Class93 class93 = new Class93(anInt871 * -1029672619, i, i_7_);
		return new Class90(false, new Class93[] { class93 });
	}

	Class90 method1577(int i, int i_8_, byte i_9_) {
		if (anInt871 * -1029672619 == -1)
			return new Class90(false, new Class93[0]);
		Class93 class93 = new Class93(anInt871 * -1029672619, i, i_8_);
		return new Class90(false, new Class93[] { class93 });
	}

	public Class92 method1578(int i) {
		byte[] is = aClass472_868.method7688(i, 0, 826146763);
		Class92 class92 = new Class92();
		class92.method1662(new Class523_Sub34(is), (byte) 51);
		return class92;
	}

	public Class93[] method1579(int i) {
		if (i < 0 || i >= aClass90Array869.length)
			return method1577(0, 0, (byte) 66).aClass93Array888;
		Class90 class90 = aClass90Array869[i];
		if (!class90.aBool887 || class90.aClass93Array888.length <= 1)
			return class90.aClass93Array888;
		int i_10_ = -1029672619 * anInt871 == -1 ? 0 : 1;
		Random random = new Random();
		Class93[] class93s = new Class93[class90.aClass93Array888.length];
		System.arraycopy(class90.aClass93Array888, 0, class93s, 0, class93s.length);
		for (int i_11_ = i_10_; i_11_ < class93s.length; i_11_++) {
			int i_12_ = (Class588.method9742(random, class93s.length - i_10_, -1541061492) + i_10_);
			Class93 class93 = class90.aClass93Array888[i_11_];
			class93s[i_11_] = class93s[i_12_];
			class93s[i_12_] = class93;
		}
		return class93s;
	}

	public Class93[] method1580(int i) {
		if (i < 0 || i >= aClass90Array869.length)
			return method1577(0, 0, (byte) 92).aClass93Array888;
		Class90 class90 = aClass90Array869[i];
		if (!class90.aBool887 || class90.aClass93Array888.length <= 1)
			return class90.aClass93Array888;
		int i_13_ = -1029672619 * anInt871 == -1 ? 0 : 1;
		Random random = new Random();
		Class93[] class93s = new Class93[class90.aClass93Array888.length];
		System.arraycopy(class90.aClass93Array888, 0, class93s, 0, class93s.length);
		for (int i_14_ = i_13_; i_14_ < class93s.length; i_14_++) {
			int i_15_ = (Class588.method9742(random, class93s.length - i_13_, -1244176843) + i_13_);
			Class93 class93 = class90.aClass93Array888[i_14_];
			class93s[i_14_] = class93s[i_15_];
			class93s[i_15_] = class93;
		}
		return class93s;
	}

	public Class93[] method1581(int i) {
		if (i < 0 || i >= aClass90Array869.length)
			return method1577(0, 0, (byte) 28).aClass93Array888;
		Class90 class90 = aClass90Array869[i];
		if (!class90.aBool887 || class90.aClass93Array888.length <= 1)
			return class90.aClass93Array888;
		int i_16_ = -1029672619 * anInt871 == -1 ? 0 : 1;
		Random random = new Random();
		Class93[] class93s = new Class93[class90.aClass93Array888.length];
		System.arraycopy(class90.aClass93Array888, 0, class93s, 0, class93s.length);
		for (int i_17_ = i_16_; i_17_ < class93s.length; i_17_++) {
			int i_18_ = (Class588.method9742(random, class93s.length - i_16_, -1174863706) + i_16_);
			Class93 class93 = class90.aClass93Array888[i_17_];
			class93s[i_17_] = class93s[i_18_];
			class93s[i_18_] = class93;
		}
		return class93s;
	}

	public Class82(Class681 class681, Class668 class668, Class472 class472) {
		aClass472_868 = class472;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(aClass472_868.method7688(0, 0, -71889030));
		int i = ((class523_sub34.aByteArray10658 == null || class523_sub34.aByteArray10658.length < 1) ? -1 : class523_sub34.readUnsignedByte(-1594323637));
		if (i < 4) {
			aClass90Array869 = new Class90[0];
			anInt871 = -497812477;
		} else {
			int i_19_ = class523_sub34.readUnsignedByte(88839884);
			Class394[] class394s = Class76.method1540(31171910);
			boolean bool = true;
			if (class394s.length != i_19_)
				bool = false;
			else {
				for (int i_20_ = 0; i_20_ < class394s.length; i_20_++) {
					int i_21_ = class523_sub34.readUnsignedByte(715945292);
					if (92680507 * class394s[i_20_].anInt4055 != i_21_) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_22_ = class523_sub34.readUnsignedByte(154951924);
				int i_23_ = class523_sub34.readUnsignedByte(-1379415797);
				int i_24_;
				int i_25_;
				if (i > 2) {
					anInt871 = class523_sub34.readShort(1318729433) * 497812477;
					i_24_ = class523_sub34.read24BitInt(998398076);
					i_25_ = class523_sub34.readUnsignedShort(-111283871);
				} else {
					anInt871 = -497812477;
					i_24_ = 0;
					i_25_ = 0;
				}
				aClass90Array869 = new Class90[i_23_ + 1];
				for (int i_26_ = 0; i_26_ < i_22_; i_26_++) {
					int i_27_ = class523_sub34.readUnsignedByte(282700007);
					boolean bool_28_ = class523_sub34.readUnsignedByte(1227582003) == 1;
					int i_29_ = class523_sub34.readUnsignedShort(-72682628);
					Class93[] class93s;
					if (-1 == anInt871 * -1029672619) {
						class93s = new Class93[i_29_];
						for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
							int i_31_ = class523_sub34.readUnsignedShort(-1289945765);
							int i_32_ = class523_sub34.read24BitInt(-526776714);
							int i_33_ = class523_sub34.readUnsignedShort(-842328893);
							class93s[i_30_] = new Class93(i_31_, i_32_, i_33_);
						}
						aClass90Array869[i_27_] = new Class90(bool_28_, class93s);
					} else {
						class93s = new Class93[i_29_ + 1];
						class93s[0] = new Class93(anInt871 * -1029672619, i_24_, i_25_);
						for (int i_34_ = 0; i_34_ < i_29_; i_34_++) {
							int i_35_ = class523_sub34.readUnsignedShort(-655357369);
							int i_36_ = class523_sub34.read24BitInt(-1821838466);
							int i_37_ = class523_sub34.readUnsignedShort(-1437342032);
							class93s[1 + i_34_] = new Class93(i_35_, i_36_, i_37_);
						}
					}
					aClass90Array869[i_27_] = new Class90(bool_28_, class93s);
				}
				for (int i_38_ = 0; i_38_ < i_23_ + 1; i_38_++) {
					if (aClass90Array869[i_38_] == null)
						aClass90Array869[i_38_] = method1577(i_24_, i_25_, (byte) 42);
				}
			} else {
				aClass90Array869 = new Class90[0];
				anInt871 = -497812477;
			}
		}
	}

	public Class93[] method1582(int i) {
		if (i < 0 || i >= aClass90Array869.length)
			return method1577(0, 0, (byte) 113).aClass93Array888;
		Class90 class90 = aClass90Array869[i];
		if (!class90.aBool887 || class90.aClass93Array888.length <= 1)
			return class90.aClass93Array888;
		int i_39_ = -1029672619 * anInt871 == -1 ? 0 : 1;
		Random random = new Random();
		Class93[] class93s = new Class93[class90.aClass93Array888.length];
		System.arraycopy(class90.aClass93Array888, 0, class93s, 0, class93s.length);
		for (int i_40_ = i_39_; i_40_ < class93s.length; i_40_++) {
			int i_41_ = (Class588.method9742(random, class93s.length - i_39_, -2135753636) + i_39_);
			Class93 class93 = class90.aClass93Array888[i_40_];
			class93s[i_40_] = class93s[i_41_];
			class93s[i_41_] = class93;
		}
		return class93s;
	}

	static final void method1583(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method1584(Class669 class669, int i) {
		throw new RuntimeException("");
	}

	public static void method1585(int i, int i_42_, int i_43_, boolean bool, int i_44_) {
		client.aLong11146 = 0L;
		int i_45_ = Class316.method5685(441697870);
		if (3 == i || i_45_ == 3)
			bool = true;
		if (!Class31.aClass178_303.method3244())
			bool = true;
		Class394.method6503(i_45_, i, i_42_, i_43_, bool, -768125107);
	}

	public static Class607[] method1586(int i) {
		return (new Class607[] { Class607.aClass607_7966, Class607.aClass607_7980, Class607.aClass607_7967, Class607.aClass607_7974, Class607.aClass607_7965, Class607.aClass607_7975, Class607.aClass607_7970, Class607.aClass607_7978, Class607.aClass607_7983, Class607.aClass607_7986, Class607.aClass607_7968, Class607.aClass607_7972, Class607.aClass607_7973, Class607.aClass607_7964, Class607.aClass607_7984, Class607.aClass607_7979, Class607.aClass607_7976, Class607.aClass607_7969, Class607.aClass607_7971, Class607.aClass607_7985, Class607.aClass607_7981, Class607.aClass607_7977, Class607.aClass607_7963 });
	}
}
