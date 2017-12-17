/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class540 {
	int anInt7214;
	int anInt7215;
	int[] anIntArray7216;
	int[] anIntArray7217;
	public Class167 aClass167_7218;
	static int anInt7219 = 0;
	LinkedList aLinkedList7220;
	boolean aBool7221;

	Class167 method8959(Class178 class178, int i) {
		Class179 class179 = Class179.method3485(Class413.aClass472_4583, 1158407443 * anInt7215, 0);
		if (class179 == null)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		return class178.method3115(class179, 2048, anInt7219 * -995460415, 64, 768);
	}

	public boolean method8960(byte i) {
		return aBool7221;
	}

	public static void method8961(int i) {
		anInt7219 = i * -958065343;
	}

	public void method8962(Class560 class560, byte i) {
		if (null != class560 && aLinkedList7220 != null) {
			Iterator iterator = aLinkedList7220.iterator();
			while (iterator.hasNext()) {
				Class647_Sub1_Sub3_Sub5 class647_sub1_sub3_sub5 = (Class647_Sub1_Sub3_Sub5) iterator.next();
				class560.method9413(class647_sub1_sub3_sub5.aByte10821, class647_sub1_sub3_sub5.aShort11750, class647_sub1_sub3_sub5.aShort11751, new Class530(class647_sub1_sub3_sub5), 2138772399);
			}
		}
	}

	public Class540(Class178 class178, Class523_Sub34 class523_sub34, int i) {
		anInt7215 = 896249115 * i;
		anInt7214 = class523_sub34.method16487((byte) -22) * 2033266783;
		anIntArray7217 = new int[227355551 * anInt7214];
		anIntArray7216 = new int[anInt7214 * 227355551];
		int i_0_ = class523_sub34.readUnsignedShort(-633788190);
		int i_1_ = class523_sub34.readUnsignedShort(-1623255815);
		for (int i_2_ = 0; i_2_ < anInt7214 * 227355551; i_2_++) {
			anIntArray7217[i_2_] = i_0_ + class523_sub34.readByte((short) -26787);
			anIntArray7216[i_2_] = i_1_ + class523_sub34.readByte((short) -10375);
		}
		aClass167_7218 = method8959(class178, -398158377);
	}

	public void method8963(Class560 class560, byte i) {
		if (class560 != null && anInt7214 * 227355551 > 0) {
			method8972(class560, -439998655);
			Iterator iterator = aLinkedList7220.iterator();
			while (iterator.hasNext()) {
				Class647_Sub1_Sub3_Sub5 class647_sub1_sub3_sub5 = (Class647_Sub1_Sub3_Sub5) iterator.next();
				class560.method9268(class647_sub1_sub3_sub5, false, (byte) 56);
			}
			aBool7221 = true;
		}
	}

	void method8964(Class560 class560) {
		aLinkedList7220 = new LinkedList();
		Class451 class451 = client.aClass505_11019.method8243(-744398683);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		Class592 class592_3_ = new Class592(Class222.anInt2334 * -860310981, anIntArray7217[0], anIntArray7216[0]);
		for (int i = 1; i < 227355551 * anInt7214; i++) {
			Class592 class592_4_ = new Class592(Class222.anInt2334 * -860310981, anIntArray7217[i], anIntArray7216[i]);
			while ((class592_3_.localX * 235453015 != 235453015 * class592_4_.localX) || (1704054549 * class592_3_.localY != class592_4_.localY * 1704054549)) {
				if (235453015 * class592_3_.localX < 235453015 * class592_4_.localX)
					class592_3_.localX += -1761291929;
				else if (class592_3_.localX * 235453015 > 235453015 * class592_4_.localX)
					class592_3_.localX -= -1761291929;
				if (1704054549 * class592_3_.localY < class592_4_.localY * 1704054549)
					class592_3_.localY += 15009853;
				else if (1704054549 * class592_3_.localY > class592_4_.localY * 1704054549)
					class592_3_.localY -= 15009853;
				int i_5_ = -860310981 * Class222.anInt2334;
				int i_6_ = (235453015 * class592_3_.localX - 235453015 * class592.localX);
				int i_7_ = (class592_3_.localY * 1704054549 - 1704054549 * class592.localY);
				if (i_6_ >= 0 && i_6_ < class560.anInt7546 * -957102653 && i_7_ >= 0 && i_7_ < -34274863 * class560.anInt7507) {
					int i_8_ = (i_6_ << 9) + 256;
					int i_9_ = (i_7_ << 9) + 256;
					if (class451.method7282(i_6_, i_7_, -638715901))
						i_5_++;
					aLinkedList7220.add(new Class647_Sub1_Sub3_Sub5(class560, this, -860310981 * Class222.anInt2334, i_5_, i_8_, Class53_Sub17.method17220(i_8_, i_9_, (Class222.anInt2334 * -860310981), -32595052), i_9_));
				}
			}
			class592_3_ = class592_4_;
		}
	}

	public boolean method8965(Class178 class178, int i) {
		aClass167_7218 = method8959(class178, 1570694370);
		return null != aClass167_7218;
	}

	public boolean method8966() {
		return aBool7221;
	}

	Class167 method8967(Class178 class178) {
		Class179 class179 = Class179.method3485(Class413.aClass472_4583, 1158407443 * anInt7215, 0);
		if (class179 == null)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		return class178.method3115(class179, 2048, anInt7219 * -995460415, 64, 768);
	}

	Class167 method8968(Class178 class178) {
		Class179 class179 = Class179.method3485(Class413.aClass472_4583, 1158407443 * anInt7215, 0);
		if (class179 == null)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		return class178.method3115(class179, 2048, anInt7219 * -995460415, 64, 768);
	}

	public void method8969(Class560 class560) {
		if (class560 != null && anInt7214 * 227355551 > 0) {
			method8972(class560, -439998655);
			Iterator iterator = aLinkedList7220.iterator();
			while (iterator.hasNext()) {
				Class647_Sub1_Sub3_Sub5 class647_sub1_sub3_sub5 = (Class647_Sub1_Sub3_Sub5) iterator.next();
				class560.method9268(class647_sub1_sub3_sub5, false, (byte) 28);
			}
			aBool7221 = true;
		}
	}

	public void method8970(Class560 class560) {
		if (null != class560 && aLinkedList7220 != null) {
			Iterator iterator = aLinkedList7220.iterator();
			while (iterator.hasNext()) {
				Class647_Sub1_Sub3_Sub5 class647_sub1_sub3_sub5 = (Class647_Sub1_Sub3_Sub5) iterator.next();
				class560.method9413(class647_sub1_sub3_sub5.aByte10821, class647_sub1_sub3_sub5.aShort11750, class647_sub1_sub3_sub5.aShort11751, new Class530(class647_sub1_sub3_sub5), 2138772399);
			}
		}
	}

	void method8971(Class560 class560) {
		aLinkedList7220 = new LinkedList();
		Class451 class451 = client.aClass505_11019.method8243(-1916327444);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		Class592 class592_10_ = new Class592(Class222.anInt2334 * -860310981, anIntArray7217[0], anIntArray7216[0]);
		for (int i = 1; i < 227355551 * anInt7214; i++) {
			Class592 class592_11_ = new Class592(Class222.anInt2334 * -860310981, anIntArray7217[i], anIntArray7216[i]);
			while ((class592_10_.localX * 235453015 != 235453015 * class592_11_.localX) || (1704054549 * class592_10_.localY != class592_11_.localY * 1704054549)) {
				if (235453015 * class592_10_.localX < 235453015 * class592_11_.localX)
					class592_10_.localX += -1761291929;
				else if (class592_10_.localX * 235453015 > 235453015 * class592_11_.localX)
					class592_10_.localX -= -1761291929;
				if (1704054549 * class592_10_.localY < class592_11_.localY * 1704054549)
					class592_10_.localY += 15009853;
				else if (1704054549 * class592_10_.localY > class592_11_.localY * 1704054549)
					class592_10_.localY -= 15009853;
				int i_12_ = -860310981 * Class222.anInt2334;
				int i_13_ = (235453015 * class592_10_.localX - 235453015 * class592.localX);
				int i_14_ = (class592_10_.localY * 1704054549 - 1704054549 * class592.localY);
				if (i_13_ >= 0 && i_13_ < class560.anInt7546 * -957102653 && i_14_ >= 0 && i_14_ < -34274863 * class560.anInt7507) {
					int i_15_ = (i_13_ << 9) + 256;
					int i_16_ = (i_14_ << 9) + 256;
					if (class451.method7282(i_13_, i_14_, -638715901))
						i_12_++;
					aLinkedList7220.add(new Class647_Sub1_Sub3_Sub5(class560, this, -860310981 * Class222.anInt2334, i_12_, i_15_, Class53_Sub17.method17220(i_15_, i_16_, (Class222.anInt2334 * -860310981), -474061406), i_16_));
				}
			}
			class592_10_ = class592_11_;
		}
	}

	void method8972(Class560 class560, int i) {
		aLinkedList7220 = new LinkedList();
		Class451 class451 = client.aClass505_11019.method8243(-1027974697);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		Class592 class592_17_ = new Class592(Class222.anInt2334 * -860310981, anIntArray7217[0], anIntArray7216[0]);
		for (int i_18_ = 1; i_18_ < 227355551 * anInt7214; i_18_++) {
			Class592 class592_19_ = new Class592(Class222.anInt2334 * -860310981, anIntArray7217[i_18_], anIntArray7216[i_18_]);
			while ((class592_17_.localX * 235453015 != 235453015 * class592_19_.localX) || (1704054549 * class592_17_.localY != class592_19_.localY * 1704054549)) {
				if (235453015 * class592_17_.localX < 235453015 * class592_19_.localX)
					class592_17_.localX += -1761291929;
				else if (class592_17_.localX * 235453015 > 235453015 * class592_19_.localX)
					class592_17_.localX -= -1761291929;
				if (1704054549 * class592_17_.localY < class592_19_.localY * 1704054549)
					class592_17_.localY += 15009853;
				else if (1704054549 * class592_17_.localY > class592_19_.localY * 1704054549)
					class592_17_.localY -= 15009853;
				int i_20_ = -860310981 * Class222.anInt2334;
				int i_21_ = (235453015 * class592_17_.localX - 235453015 * class592.localX);
				int i_22_ = (class592_17_.localY * 1704054549 - 1704054549 * class592.localY);
				if (i_21_ >= 0 && i_21_ < class560.anInt7546 * -957102653 && i_22_ >= 0 && i_22_ < -34274863 * class560.anInt7507) {
					int i_23_ = (i_21_ << 9) + 256;
					int i_24_ = (i_22_ << 9) + 256;
					if (class451.method7282(i_21_, i_22_, -638715901))
						i_20_++;
					aLinkedList7220.add(new Class647_Sub1_Sub3_Sub5(class560, this, -860310981 * Class222.anInt2334, i_20_, i_23_, Class53_Sub17.method17220(i_23_, i_24_, (Class222.anInt2334 * -860310981), 636179718), i_24_));
				}
			}
			class592_17_ = class592_19_;
		}
	}

	public static void method8973(int i) {
		anInt7219 = i * -958065343;
	}

	public static void method8974(int i) {
		anInt7219 = i * -958065343;
	}

	public void method8975(Class560 class560) {
		if (class560 != null && anInt7214 * 227355551 > 0) {
			method8972(class560, -439998655);
			Iterator iterator = aLinkedList7220.iterator();
			while (iterator.hasNext()) {
				Class647_Sub1_Sub3_Sub5 class647_sub1_sub3_sub5 = (Class647_Sub1_Sub3_Sub5) iterator.next();
				class560.method9268(class647_sub1_sub3_sub5, false, (byte) 80);
			}
			aBool7221 = true;
		}
	}

	public boolean method8976() {
		return aBool7221;
	}

	public boolean method8977(Class178 class178) {
		aClass167_7218 = method8959(class178, -363028580);
		return null != aClass167_7218;
	}

	public boolean method8978(Class178 class178) {
		aClass167_7218 = method8959(class178, 1477910723);
		return null != aClass167_7218;
	}

	public void method8979(int i) {
		aBool7221 = false;
		aClass167_7218 = null;
	}

	public static void method8980(Interface48 interface48, Interface45 interface45, byte i) {
		Class617.anInt8052 = 0;
		Class617.anInt8043 = 0;
		Class617.aList8045 = new LinkedList();
		Class617.aClass522_Sub2_Sub1_Sub1Array8050 = new Class522_Sub2_Sub1_Sub1[1024];
		Class617.aClass621Array8044 = new Class621[1 + (Class173.anIntArray1840[-1334998773 * Class617.anInt8054])];
		Class617.anInt8041 = 0;
		Class617.anInt8046 = 0;
		Class425.anInterface45_4820 = interface45;
	}

	static final Class669 method8981(int i) {
		if (Class663.anInt8523 * 998935403 == Class663.anArrayList8522.size())
			Class663.anArrayList8522.add(new Class669());
		Class669 class669 = ((Class669) Class663.anArrayList8522.get(Class663.anInt8523 * 998935403));
		Class663.anInt8523 += -705410749;
		return class669;
	}

	static final void method8982(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.anIntArray8577[class669.anInt8579 * 1180759405];
	}

	static final void method8983(Class669 class669, short i) {
		int i_25_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_25_, -396538871);
		Class242 class242 = Class31.aClass242Array302[i_25_ >> 16];
		Class687_Sub35.method17036(class250, class242, class669, (byte) -12);
	}

	static final void method8984(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class97.method1770(string, 8178986);
	}

	static final void method8985(Class523_Sub34_Sub2 class523_sub34_sub2, byte i) {
		int i_26_ = 0;
		class523_sub34_sub2.method18223(659206453);
		for (int i_27_ = 0; i_27_ < Class108.anInt1318 * 393652345; i_27_++) {
			int i_28_ = Class108.anIntArray1319[i_27_];
			if ((Class108.aByteArray1324[i_28_] & 0x1) == 0) {
				if (i_26_ > 0) {
					i_26_--;
					Class108.aByteArray1324[i_28_] |= 0x2;
				} else {
					int i_29_ = class523_sub34_sub2.readBits(1, 983105601);
					if (i_29_ == 0) {
						i_26_ = Class495.method8096(class523_sub34_sub2, -319716368);
						Class108.aByteArray1324[i_28_] |= 0x2;
					} else
						Class428.method6757(class523_sub34_sub2, i_28_, (byte) -10);
				}
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		if (i_26_ != 0)
			throw new RuntimeException();
		class523_sub34_sub2.method18223(-1509959404);
		for (int i_30_ = 0; i_30_ < Class108.anInt1318 * 393652345; i_30_++) {
			int i_31_ = Class108.anIntArray1319[i_30_];
			if (0 != (Class108.aByteArray1324[i_31_] & 0x1)) {
				if (i_26_ > 0) {
					i_26_--;
					Class108.aByteArray1324[i_31_] |= 0x2;
				} else {
					int i_32_ = class523_sub34_sub2.readBits(1, 1540418206);
					if (i_32_ == 0) {
						i_26_ = Class495.method8096(class523_sub34_sub2, -994274024);
						Class108.aByteArray1324[i_31_] |= 0x2;
					} else
						Class428.method6757(class523_sub34_sub2, i_31_, (byte) 10);
				}
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		if (0 != i_26_)
			throw new RuntimeException();
		class523_sub34_sub2.method18223(-216415478);
		for (int i_33_ = 0; i_33_ < Class108.anInt1315 * 1212778143; i_33_++) {
			int i_34_ = Class108.anIntArray1321[i_33_];
			if ((Class108.aByteArray1324[i_34_] & 0x1) != 0) {
				if (i_26_ > 0) {
					i_26_--;
					Class108.aByteArray1324[i_34_] |= 0x2;
				} else {
					int i_35_ = class523_sub34_sub2.readBits(1, 810934805);
					if (0 == i_35_) {
						i_26_ = Class495.method8096(class523_sub34_sub2, -1933089500);
						Class108.aByteArray1324[i_34_] |= 0x2;
					} else if (Class188.method3593(class523_sub34_sub2, i_34_, -1129350300))
						Class108.aByteArray1324[i_34_] |= 0x2;
				}
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		if (i_26_ != 0)
			throw new RuntimeException();
		class523_sub34_sub2.method18223(-1811275909);
		for (int i_36_ = 0; i_36_ < 1212778143 * Class108.anInt1315; i_36_++) {
			int i_37_ = Class108.anIntArray1321[i_36_];
			if ((Class108.aByteArray1324[i_37_] & 0x1) == 0) {
				if (i_26_ > 0) {
					i_26_--;
					Class108.aByteArray1324[i_37_] |= 0x2;
				} else {
					int i_38_ = class523_sub34_sub2.readBits(1, 890123711);
					if (0 == i_38_) {
						i_26_ = Class495.method8096(class523_sub34_sub2, -1324933780);
						Class108.aByteArray1324[i_37_] |= 0x2;
					} else if (Class188.method3593(class523_sub34_sub2, i_37_, -1129350300))
						Class108.aByteArray1324[i_37_] |= 0x2;
				}
			}
		}
		class523_sub34_sub2.method18232(-1605752964);
		if (0 != i_26_)
			throw new RuntimeException();
		Class108.anInt1318 = 0;
		Class108.anInt1315 = 0;
		for (int i_39_ = 1; i_39_ < 2048; i_39_++) {
			Class108.aByteArray1324[i_39_] >>= 1;
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_39_];
			if (class647_sub1_sub3_sub1_sub2 != null)
				Class108.anIntArray1319[(Class108.anInt1318 += 633815497) * 393652345 - 1] = i_39_;
			else
				Class108.anIntArray1321[(Class108.anInt1315 += -1210837665) * 1212778143 - 1] = i_39_;
		}
	}

	static final void method8986(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_40_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_41_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		if (null != Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183)
			Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183.method10172(i_40_, i_41_, (byte) 41);
	}

	public static void method8987(boolean bool, int i) {
		Class534_Sub1.aBool10790 = bool;
	}
}
