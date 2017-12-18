/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class436 implements Interface7 {
	int anInt4897;
	Class472 aClass472_4898;
	static Class250 aClass250_4899;

	Class436(Class472 class472, int i) {
		aClass472_4898 = class472;
		anInt4897 = -1609365805 * i;
	}

	public int method56(short i) {
		if (aClass472_4898.method7651(450576731 * anInt4897, (byte) -19))
			return 100;
		return aClass472_4898.method7653(anInt4897 * 450576731, 1311806977);
	}

	public Class52 method53(int i) {
		return Class52.aClass52_717;
	}

	public Class52 method54() {
		return Class52.aClass52_717;
	}

	public int method38() {
		if (aClass472_4898.method7651(450576731 * anInt4897, (byte) 18))
			return 100;
		return aClass472_4898.method7653(anInt4897 * 450576731, 1143462677);
	}

	public int method55() {
		if (aClass472_4898.method7651(450576731 * anInt4897, (byte) 10))
			return 100;
		return aClass472_4898.method7653(anInt4897 * 450576731, -1505246549);
	}

	static final void method6870(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (client.friendsChatName != null && i_0_ < Class365.anInt3866 * 797304521)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 533287195 * Class99.aClass115Array1232[i_0_].anInt1406;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method6871(Class669 class669, int i) {
		int i_1_ = ((client.anIntArrayArrayArray11115[(class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815])]).length >> 1);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_1_;
	}

	static final void method6872(Class669 class669, byte i) {
		if ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 0)
			class669.anInt8579 += (class669.anIntArray8577[class669.anInt8579 * 1180759405] * -1774429083);
	}

	public static int method6873(int i, int i_2_) {
		return i >>> 8;
	}

	static void method6874(int i, int i_3_, int i_4_) {
		if (Class523_Sub11.aClass625_10427.aBool8147 || (1 != 462991943 * Class36.anInt330 && (!Class318.aBool3431 || 462991943 * Class36.anInt330 != 2 || !(Class36.aClass523_Sub27_Sub6_333.aString11629.equals(Class39.aClass39_510.method1124((Class53_Sub20.aClass668_10979), (byte) -73)))))) {
			Class10 class10 = client.method17697(1050577033);
			int i_5_ = class10.method597((Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -41)), -1759656773);
			int i_6_;
			if (!Class36.aBool327) {
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(2047711999)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) -2))) {
					int i_7_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
					if (i_7_ > i_5_)
						i_5_ = i_7_;
				}
				i_5_ += 8;
				i_6_ = Class36.anInt330 * 462991943 * (Class36.anInt323 * 1648921847) + 21;
				Class523_Sub19.anInt10492 = (((Class36.aBool353 ? 26 : 22) + Class36.anInt330 * 462991943 * (1648921847 * Class36.anInt323)) * 1395259895);
			} else {
				for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.method14016(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.method14018(768418218))) {
					int i_8_;
					if (1 == class523_sub27_sub8.anInt11719 * 1060081949)
						i_8_ = Class269.method4924(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class10, 1003475374);
					else
						i_8_ = Class323.method5727(class523_sub27_sub8, class10, -1871660695);
					if (i_8_ > i_5_)
						i_5_ = i_8_;
				}
				i_5_ += 8;
				i_6_ = (Class36.anInt336 * -914479837 * (1648921847 * Class36.anInt323) + 21);
				Class523_Sub19.anInt10492 = 1395259895 * ((Class36.aBool353 ? 26 : 22) + (Class36.anInt323 * 1648921847 * (-914479837 * Class36.anInt336)));
			}
			i_5_ += 10;
			int i_9_ = i - i_5_ / 2;
			if (i_9_ + i_5_ > Class170.anInt1833 * 2141365743)
				i_9_ = Class170.anInt1833 * 2141365743 - i_5_;
			if (i_9_ < 0)
				i_9_ = 0;
			int i_10_ = i_3_;
			if (i_10_ + i_6_ > -495986435 * Class254.anInt2742)
				i_10_ = -495986435 * Class254.anInt2742 - i_6_;
			if (i_10_ < 0)
				i_10_ = 0;
			Class22.anInt231 = 1963954761 * i_9_;
			Class194_Sub17.anInt9941 = i_10_ * 1068719991;
			Class474.anInt5390 = -2064511131 * i_5_;
			Class36.anInt351 = (int) (Math.random() * 24.0) * -972873125;
			Class36.aBool326 = true;
		}
	}

	public static String method6875(byte i) {
		return Class465.method7558("www", false, (byte) -118);
	}

	static void method6876(Class523_Sub38 class523_sub38, int i, short i_11_) {
		Object[] objects = class523_sub38.anObjectArray10687;
		int i_12_ = ((Integer) objects[0]).intValue();
		Class523_Sub27_Sub19 class523_sub27_sub19 = Class601.method9883(i_12_, 1193968837);
		if (null != class523_sub27_sub19) {
			Class669 class669 = Class540.method8981(1959838817);
			class669.anIntArray8581 = new int[class523_sub27_sub19.anInt11849 * 625565027];
			int i_13_ = 0;
			class669.anObjectArray8565 = new String[571919215 * class523_sub27_sub19.anInt11848];
			int i_14_ = 0;
			class669.aLongArray8554 = new long[class523_sub27_sub19.anInt11854 * 1067897013];
			int i_15_ = 0;
			for (int i_16_ = 1; i_16_ < objects.length; i_16_++) {
				if (objects[i_16_] instanceof Integer) {
					int i_17_ = ((Integer) objects[i_16_]).intValue();
					if (i_17_ == -2147483647)
						i_17_ = class523_sub38.anInt10681 * 306936833;
					if (-2147483646 == i_17_)
						i_17_ = class523_sub38.anInt10682 * -1122768429;
					if (-2147483645 == i_17_)
						i_17_ = (class523_sub38.aClass250_10678 != null ? (class523_sub38.aClass250_10678.anInt2585 * -1363815505) : -1);
					if (-2147483644 == i_17_)
						i_17_ = class523_sub38.anInt10683 * 1661511317;
					if (i_17_ == -2147483643)
						i_17_ = (null != class523_sub38.aClass250_10678 ? (234012635 * class523_sub38.aClass250_10678.anInt2709) : -1);
					if (-2147483642 == i_17_)
						i_17_ = (null != class523_sub38.aClass250_10684 ? (-1363815505 * class523_sub38.aClass250_10684.anInt2585) : -1);
					if (i_17_ == -2147483641)
						i_17_ = (class523_sub38.aClass250_10684 != null ? (class523_sub38.aClass250_10684.anInt2709 * 234012635) : -1);
					if (-2147483640 == i_17_)
						i_17_ = class523_sub38.anInt10685 * 662426401;
					if (i_17_ == -2147483639)
						i_17_ = 855494753 * class523_sub38.anInt10686;
					class669.anIntArray8581[i_13_++] = i_17_;
				} else if (objects[i_16_] instanceof String) {
					String string = (String) objects[i_16_];
					if (string.equals("event_opbase"))
						string = class523_sub38.aString10680;
					class669.anObjectArray8565[i_14_++] = string;
				} else if (objects[i_16_] instanceof Long) {
					long l = ((Long) objects[i_16_]).longValue();
					class669.aLongArray8554[i_15_++] = l;
				}
			}
			class669.anInt8575 = -597551149 * class523_sub38.anInt10688;
			Class576.method9645(class523_sub27_sub19, i, class669, (byte) 13);
			class669.anInt8575 = 0;
		}
	}
}
