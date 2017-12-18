/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;

class Class155 implements Comparator {
	Class375_Sub2 this$0;
	public static RSSocket aClass1_1735;
	static int anInt1736;

	int method2538(Class477 class477, Class477 class477_0_) {
		float f = class477.method7870((byte) 1);
		float f_1_ = class477_0_.method7870((byte) 1);
		if (f_1_ > f)
			return 1;
		if (f_1_ < f)
			return -1;
		return 0;
	}

	int method2539(Class477 class477, Class477 class477_2_) {
		float f = class477.method7870((byte) 1);
		float f_3_ = class477_2_.method7870((byte) 1);
		if (f_3_ > f)
			return 1;
		if (f_3_ < f)
			return -1;
		return 0;
	}

	public int compare(Object object, Object object_4_) {
		return method2540((Class477) object, (Class477) object_4_, -1172106573);
	}

	int method2540(Class477 class477, Class477 class477_5_, int i) {
		float f = class477.method7870((byte) 1);
		float f_6_ = class477_5_.method7870((byte) 1);
		if (f_6_ > f)
			return 1;
		if (f_6_ < f)
			return -1;
		return 0;
	}

	Class155(Class375_Sub2 class375_sub2) {
		this$0 = class375_sub2;
	}

	int method2541(Class477 class477, Class477 class477_7_) {
		float f = class477.method7870((byte) 1);
		float f_8_ = class477_7_.method7870((byte) 1);
		if (f_8_ > f)
			return 1;
		if (f_8_ < f)
			return -1;
		return 0;
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int method2542(Object object, Object object_9_) {
		return method2540((Class477) object, (Class477) object_9_, -574165493);
	}

	public boolean method2543(Object object) {
		return super.equals(object);
	}

	public static void method2544(String string, String string_10_, int i, boolean bool, String string_11_, short i_12_) {
		if (-2020118759 * client.anInt11136 == 11) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4265, (client.aClass116_11057.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -122);
			int i_13_ = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -29);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_10_, (byte) -97);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i, 1905517778);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -1170896464);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_11_, (byte) -83);
			class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 1328360061;
			class523_sub22.aClass523_Sub34_Sub2_10525.method16263(Class54.anIntArray726, i_13_, (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661), (byte) 19);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i_13_, -2136374821);
			client.aClass116_11057.method1974(class523_sub22, (byte) 18);
			if (i < 13) {
				client.aBool11118 = true;
				Class16.method769(1361682038);
			}
			Class54.aClass704_728 = Class704.aClass704_8794;
		}
	}

	static final void method2545(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, byte i) {
		Class707 class707 = class647_sub1_sub3_sub1.aClass707_11913;
		if ((client.anInt11011 == 1492835511 * class647_sub1_sub3_sub1.anInt11932) || !class707.method14161(470524526) || class707.method14182(1, 887927210)) {
			int i_14_ = (1492835511 * class647_sub1_sub3_sub1.anInt11932 - 219018885 * class647_sub1_sub3_sub1.anInt11954);
			int i_15_ = (client.anInt11011 - 219018885 * class647_sub1_sub3_sub1.anInt11954);
			int i_16_ = (class647_sub1_sub3_sub1.anInt11915 * -870567424 + class647_sub1_sub3_sub1.method18338(2143453118) * 256);
			int i_17_ = (-285027840 * class647_sub1_sub3_sub1.anInt11917 + class647_sub1_sub3_sub1.method18338(2143907522) * 256);
			int i_18_ = (class647_sub1_sub3_sub1.anInt11908 * -1647336960 + class647_sub1_sub3_sub1.method18338(2143549084) * 256);
			int i_19_ = (class647_sub1_sub3_sub1.anInt11918 * 773206528 + class647_sub1_sub3_sub1.method18338(2142551032) * 256);
			int i_20_ = ((i_14_ - i_15_) * i_16_ + i_15_ * i_18_) / i_14_;
			int i_21_ = (i_17_ * (i_14_ - i_15_) + i_15_ * i_19_) / i_14_;
			int i_22_ = Class53_Sub17.method17220(i_20_, i_21_, (class647_sub1_sub3_sub1.anInt11940 * 275370787), 1726550254);
			int i_23_ = Class53_Sub17.method17220(i_18_, i_19_, (class647_sub1_sub3_sub1.anInt11893 * -926534601), 871777121);
			int i_24_ = ((i_14_ - i_15_) * i_22_ + i_23_ * i_15_) / i_14_;
			class647_sub1_sub3_sub1.method10574((float) i_20_, (float) i_24_, (float) i_21_);
		}
		class647_sub1_sub3_sub1.anInt11945 = 0;
		class647_sub1_sub3_sub1.method18332((class647_sub1_sub3_sub1.anInt11923 * -220629939), false, 1958307138);
	}

	public static int method2546(int i, int i_25_, int i_26_) {
		int i_27_ = i_25_ >>> 24;
		int i_28_ = 255 - i_27_;
		i_25_ = ((i_25_ & 0xff00ff) * i_27_ & ~0xff00ff | i_27_ * (i_25_ & 0xff00) & 0xff0000) >>> 8;
		return i_25_ + (((i & 0xff00ff) * i_28_ & ~0xff00ff | i_28_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	static final void method2547(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16677(-1847931259) ? 1 : 0;
	}
}
