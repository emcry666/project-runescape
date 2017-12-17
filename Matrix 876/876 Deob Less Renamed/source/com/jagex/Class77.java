/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class77 implements Interface13, Interface6 {
	public int anInt854;
	public int anInt855;
	public int anInt856;
	public int anInt857 = 0;
	public static int anInt858;

	public void method73() {
		/* empty */
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(9390812);
			if (i_0_ == 0)
				break;
			method1541(class523_sub34, i_0_, -2101163174);
		}
	}

	void method1541(Class523_Sub34 class523_sub34, int i, int i_1_) {
		if (1 == i)
			anInt857 = class523_sub34.readUnsignedByte(1562807128) * 768043743;
		else if (i == 2)
			anInt856 = class523_sub34.readUnsignedShort(-616398104) * 1647235361;
		else if (3 == i)
			anInt854 = class523_sub34.readUnsignedShort(-639537998) * -305230303;
		else if (i == 4)
			anInt855 = class523_sub34.readShort(-238757544) * 1507979021;
	}

	public void method52(int i, byte i_2_) {
		/* empty */
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1801625883);
			if (i == 0)
				break;
			method1541(class523_sub34, i, -1644875721);
		}
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(29357153);
			if (i == 0)
				break;
			method1541(class523_sub34, i, 365588628);
		}
	}

	Class77() {
		anInt855 = 0;
		anInt854 = 1953564672;
		anInt856 = 1988691968;
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-971921041);
			if (i == 0)
				break;
			method1541(class523_sub34, i, 533218612);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-873830517);
			if (i == 0)
				break;
			method1541(class523_sub34, i, -289076966);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(968835273);
			if (i == 0)
				break;
			method1541(class523_sub34, i, 295478705);
		}
	}

	public void method78() {
		/* empty */
	}

	public void method79() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1422187381);
			if (i == 0)
				break;
			method1541(class523_sub34, i, -247842398);
		}
	}

	public void method51(int i) {
		/* empty */
	}

	void method1542(Class523_Sub34 class523_sub34, int i) {
		if (1 == i)
			anInt857 = class523_sub34.readUnsignedByte(-741344375) * 768043743;
		else if (i == 2)
			anInt856 = class523_sub34.readUnsignedShort(-1734841520) * 1647235361;
		else if (3 == i)
			anInt854 = class523_sub34.readUnsignedShort(-2095017896) * -305230303;
		else if (i == 4)
			anInt855 = class523_sub34.readShort(-869341978) * 1507979021;
	}

	public static Class148 method1543(byte i) {
		return Class569.aClass148_7626;
	}

	public static boolean method1544(byte[] is, byte i) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_3_ = class523_sub34.readUnsignedByte(-542686150);
		if (i_3_ != 2)
			return false;
		boolean bool = class523_sub34.readUnsignedByte(-551781899) == 1;
		if (bool)
			Class203.method3700(class523_sub34, (byte) -10);
		Class389.method6478(class523_sub34, (byte) 0);
		return true;
	}

	static boolean method1545(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, int i, int i_4_, int i_5_) {
		if (Class534_Sub1.aBool7170 && !client.aBool11157 && !Class534_Sub1.method8834((class523_sub32.anInt10580 * -1808941705), (class523_sub32.anInt10581 * -1727058043)))
			return false;
		if (null != class239.anIntArray2425) {
			class239 = class239.method4319(Class534_Sub1.anInterface19_7142, Class534_Sub1.anInterface17_7141, 1053087134);
			if (class239 == null)
				return false;
		}
		int i_6_ = 2147483647;
		int i_7_ = -2147483648;
		int i_8_ = 2147483647;
		int i_9_ = -2147483648;
		if (null != class239.anIntArray2445) {
			i_6_ = (Class534_Sub1.anInt7200 + ((class239.anInt2427 * 374901433 + class523_sub32.anInt10580 * -1808941705 - Class534_Sub1.anInt7196) * (Class534_Sub1.anInt7202 - Class534_Sub1.anInt7200) / (Class534_Sub1.anInt7198 - Class534_Sub1.anInt7196)));
			i_7_ = (Class534_Sub1.anInt7200 + ((Class534_Sub1.anInt7202 - Class534_Sub1.anInt7200) * (class523_sub32.anInt10580 * -1808941705 + -892198963 * class239.anInt2401 - Class534_Sub1.anInt7196) / (Class534_Sub1.anInt7198 - Class534_Sub1.anInt7196)));
			i_9_ = (Class534_Sub1.anInt7203 - ((973938647 * class239.anInt2421 + -1727058043 * class523_sub32.anInt10581 - Class534_Sub1.anInt7167) * (Class534_Sub1.anInt7203 - Class534_Sub1.anInt7201) / (Class534_Sub1.anInt7195 - Class534_Sub1.anInt7167)));
			i_8_ = (Class534_Sub1.anInt7203 - ((class239.anInt2430 * -1256537267 + class523_sub32.anInt10581 * -1727058043 - Class534_Sub1.anInt7167) * (Class534_Sub1.anInt7203 - Class534_Sub1.anInt7201) / (Class534_Sub1.anInt7195 - Class534_Sub1.anInt7167)));
		}
		Class148 class148 = null;
		int i_10_ = 0;
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = 0;
		if (924656729 * class239.anInt2410 != -1) {
			if (class523_sub32.aBool10582 && -1173943061 * class239.anInt2398 != -1)
				class148 = class239.method4315(class178, true, 1609880242);
			else
				class148 = class239.method4315(class178, false, 1586282083);
			if (class148 != null) {
				switch (class239.aClass275_2411.anInt2902 * -399546231) {
				case 2:
					i_10_ = (class523_sub32.anInt10583 * -800911491 - class148.method38());
					i_11_ = -800911491 * class523_sub32.anInt10583;
					break;
				case 0:
					i_10_ = (-800911491 * class523_sub32.anInt10583 - (class148.method38() + 1 >> 1));
					i_11_ = (class523_sub32.anInt10583 * -800911491 + (class148.method38() + 1 >> 1));
					break;
				case 1:
					i_10_ = class523_sub32.anInt10583 * -800911491;
					i_11_ = (-800911491 * class523_sub32.anInt10583 + class148.method38());
					break;
				}
				switch (1995634209 * class239.aClass273_2438.anInt2887) {
				case 0:
					i_12_ = (1992498959 * class523_sub32.anInt10584 - (class148.method2429() + 1 >> 1));
					i_13_ = (class523_sub32.anInt10584 * 1992498959 + (class148.method2429() + 1 >> 1));
					break;
				case 1:
					i_12_ = (class523_sub32.anInt10584 * 1992498959 - class148.method2429());
					i_13_ = 1992498959 * class523_sub32.anInt10584;
					break;
				case 2:
					i_12_ = class523_sub32.anInt10584 * 1992498959;
					i_13_ = (1992498959 * class523_sub32.anInt10584 + class148.method2429());
					break;
				}
				if (i_10_ < i_6_)
					i_6_ = i_10_;
				if (i_11_ > i_7_)
					i_7_ = i_11_;
				if (i_12_ < i_8_)
					i_8_ = i_12_;
				if (i_13_ > i_9_)
					i_9_ = i_13_;
			}
		}
		Class148 class148_14_ = null;
		if (class239.anInt2419 * 1669690785 != -1)
			class148_14_ = class239.method4320(class178, -1300656059);
		int i_15_ = 0;
		int i_16_ = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		if (null != class239.aString2441) {
			Class541.method8990(933897945 * class239.anInt2402, 262903113);
			if (null != Class162.aClass164_1771) {
				i_22_ = Class305.aClass10_3347.method605(class239.aString2441, (2141365743 * Class170.anInt1833), 0, null, -1305040475);
				i_17_ = Class305.aClass10_3347.method602(class239.aString2441, (2141365743 * Class170.anInt1833), null, 845816892);
				i_15_ = (-800911491 * class523_sub32.anInt10583 - i_17_ / 2 + ((Class534_Sub1.anInt7202 - Class534_Sub1.anInt7200) * (-1857881741 * class239.anInt2435) / (Class534_Sub1.anInt7198 - Class534_Sub1.anInt7196)));
				i_16_ = (class523_sub32.anInt10584 * 1992498959 - ((Class534_Sub1.anInt7203 - Class534_Sub1.anInt7201) * (class239.anInt2436 * 77210663) / (Class534_Sub1.anInt7195 - Class534_Sub1.anInt7167)));
				if (null == class148)
					i_16_ -= i_22_ / 2;
				else
					i_16_ -= (class148.method2429() >> 1) + i_22_;
				i_18_ = i_15_ + i;
				if (i_18_ < i_6_)
					i_6_ = i_18_;
				i_19_ = i + (i_17_ + i_15_);
				if (i_19_ > i_7_)
					i_7_ = i_19_;
				i_20_ = i_4_ + i_16_;
				if (i_20_ < i_8_)
					i_8_ = i_20_;
				i_21_ = i_4_ + (i_22_ + i_16_);
				if (i_21_ > i_9_)
					i_9_ = i_21_;
			}
		}
		if (i_7_ < Class534_Sub1.anInt7200 || i_6_ > Class534_Sub1.anInt7202 || i_9_ < Class534_Sub1.anInt7201 || i_8_ > Class534_Sub1.anInt7203)
			return true;
		Class534_Sub1.method8913(class178, class523_sub32, class239);
		if (class148 != null) {
			int i_23_ = 0;
			int i_24_ = 0;
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = 0;
			switch (-399546231 * class239.aClass275_2411.anInt2902) {
			case 2:
				i_23_ = class148.method2504();
				i_24_ = (class148.method2504() + 1) / 2;
				i_25_ = class148.method38();
				break;
			case 1:
				i_24_ = -(class148.method2504() + 1) / 2;
				break;
			case 0:
				i_23_ = class148.method2504() / 2;
				i_25_ = class148.method38() >> 1;
				break;
			}
			switch (class239.aClass273_2438.anInt2887 * 1995634209) {
			case 2:
				i_27_ = -(class148.method2504() + 1) / 2;
				break;
			case 1:
				i_26_ = class148.method2504();
				i_27_ = (class148.method2504() + 1) / 2;
				i_28_ = class148.method2429();
				break;
			case 0:
				i_26_ = class148.method2504() / 2;
				i_28_ = class148.method2429() >> 1;
				break;
			}
			Class25 class25 = (Class25) (Class534_Sub1.aHashMap10786.get(Integer.valueOf(-1039292053 * class523_sub32.anInt10578)));
			if (class25 == null)
				class25 = (Class25) (Class534_Sub1.aHashMap10787.get(Integer.valueOf(class239.anInt2443 * 1444609703)));
			if (class25 != null && 1669690785 * class239.anInt2419 == -1) {
				int i_29_;
				if (class25.anInt245 * 2071802553 > Class534_Sub1.anInt10789 * 1552389189 / 2)
					i_29_ = ((722251963 * Class534_Sub1.anInt10789 - 28673607 * class25.anInt245) / (1552389189 * Class534_Sub1.anInt10789));
				else
					i_29_ = (class25.anInt245 * 28673607 / (1552389189 * Class534_Sub1.anInt10789));
				int i_30_ = i_29_ << 24 | 0xffff00;
				if (class178 instanceof Class178_Sub2) {
					class178.method3354((-800911491 * class523_sub32.anInt10583 - i_23_ - 7), (1992498959 * class523_sub32.anInt10584 - i_26_ - 7), class148.method2504() + 14, class148.method2504() + 14, i_30_, (byte) 84);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_23_ - 5), (class523_sub32.anInt10584 * 1992498959 - i_26_ - 5), class148.method2504() + 10, class148.method2504() + 10, i_30_, (byte) 5);
					class178.method3354((-800911491 * class523_sub32.anInt10583 - i_23_ - 3), (1992498959 * class523_sub32.anInt10584 - i_26_ - 3), class148.method2504() + 6, class148.method2504() + 6, i_30_, (byte) 15);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_23_ - 1), (1992498959 * class523_sub32.anInt10584 - i_26_ - 1), class148.method2504() + 2, class148.method2504() + 2, i_30_, (byte) 10);
					class178.method3354((class523_sub32.anInt10583 * -800911491 - i_23_), (1992498959 * class523_sub32.anInt10584 - i_26_), class148.method2504(), class148.method2504(), i_30_, (byte) 122);
				} else {
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_24_), (class523_sub32.anInt10584 * 1992498959 - i_27_), class148.method2504() / 2 + 7, i_30_, -89169651);
					class178.method3079((-800911491 * class523_sub32.anInt10583 - i_24_), (0 != (class523_sub32.anInt10584 * 1992498959) - i_27_ - i_27_ ? 1 : 0), class148.method2504() / 2 + 5, i_30_, 1464581508);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_24_), (class523_sub32.anInt10584 * 1992498959 - i_27_ - i_27_) != 0 ? 1 : 0, class148.method2504() / 2 + 3, i_30_, -1144775489);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_24_), 0 != ((1992498959 * class523_sub32.anInt10584) - i_27_ - i_27_) ? 1 : 0, class148.method2504() / 2 + 1, i_30_, -963164808);
					class178.method3079((class523_sub32.anInt10583 * -800911491 - i_24_), (0 != (class523_sub32.anInt10584 * 1992498959) - i_27_ - i_27_ ? 1 : 0), class148.method2504() / 2, i_30_, 1125960146);
				}
			}
			class148.method2435(-800911491 * class523_sub32.anInt10583 - i_25_, (1992498959 * class523_sub32.anInt10584 - i_28_));
			int i_31_ = 0;
			int i_32_ = 0;
			if (null != class25 && null != class148_14_) {
				switch (-399546231 * class239.aClass275_2411.anInt2902) {
				case 1:
					i_31_ = class148_14_.method38();
					break;
				case 0:
					i_31_ = class148_14_.method38() >> 1;
					break;
				}
				switch (1995634209 * class239.aClass273_2438.anInt2887) {
				case 1:
					i_32_ = (class148_14_.method2429() + class148.method2429()) / 2;
					break;
				case 0:
					i_32_ = (class148_14_.method2429() / 2 + class148.method2429()) / 2;
					break;
				}
				int i_33_;
				if (2071802553 * class25.anInt245 > Class534_Sub1.anInt10789 * 1552389189 / 2)
					i_33_ = ((Class534_Sub1.anInt10789 * 722251963 - class25.anInt245 * 28673607) / (Class534_Sub1.anInt10789 * 1552389189));
				else
					i_33_ = (28673607 * class25.anInt245 / (1552389189 * Class534_Sub1.anInt10789));
				int i_34_ = i_33_ << 24 | 0xffff00;
				class148_14_.method2436((-800911491 * class523_sub32.anInt10583 - i_31_), (1992498959 * class523_sub32.anInt10584 - i_32_), 0, i_34_, 1);
			}
		}
		if (null != class239.aString2441 && null != Class162.aClass164_1771)
			Class291.method5232(class178, class523_sub32, class239, i_15_, i_16_, i_22_, i_17_, -1735215746);
		if (-1 != class239.anInt2410 * 924656729 || class239.aString2441 != null) {
			Class523_Sub16 class523_sub16 = new Class523_Sub16(class523_sub32);
			class523_sub16.anInt10478 = 869645037 * i_10_;
			class523_sub16.anInt10476 = i_11_ * 939278321;
			class523_sub16.anInt10474 = -1186220603 * i_12_;
			class523_sub16.anInt10475 = i_13_ * -1175464923;
			class523_sub16.anInt10477 = -226965029 * i_18_;
			class523_sub16.anInt10480 = i_19_ * 721391071;
			class523_sub16.anInt10473 = i_20_ * -72187705;
			class523_sub16.anInt10479 = i_21_ * 481175931;
			Class629.aClass708_8229.method14236(class523_sub16, -464147624);
		}
		return false;
	}

	public static final void method1546(String string, String string_35_, int i) {
		Class116 class116 = Class537.method8941(-1501394200);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4213, class116.aClass11_1413, 1370050649);
		if (string_35_.length() > 30)
			string_35_ = string_35_.substring(0, 30);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) 11) + Class6.method555(string_35_, (byte) 29), 1465462707);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 15);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_35_, (byte) 88);
		class116.method1974(class523_sub22, (byte) 87);
	}
}
