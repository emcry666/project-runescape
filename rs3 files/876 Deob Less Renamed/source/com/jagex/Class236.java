/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;

public class Class236 {
	public int anInt2388;
	public int anInt2389;
	public int[] anIntArray2390;
	public int[] anIntArray2391;
	public Class145 aClass145_2392;
	int anInt2393;
	public static String aString2394;
	public static byte[][] aByteArrayArray2395;

	Class236(int i, int i_0_, int[] is, int[] is_1_, Class145 class145, int i_2_) {
		anInt2388 = -153900935 * i;
		anInt2389 = -665658565 * i_0_;
		anIntArray2390 = is;
		anIntArray2391 = is_1_;
		aClass145_2392 = class145;
		anInt2393 = 390036479 * i_2_;
	}

	public boolean method4283(int i, int i_3_, int i_4_) {
		if (i_3_ >= 0 && i_3_ < anIntArray2391.length) {
			int i_5_ = anIntArray2391[i_3_];
			if (i >= i_5_ && i <= anIntArray2390[i_3_] + i_5_)
				return true;
		}
		return false;
	}

	public boolean method4284(int i, int i_6_) {
		if (i_6_ >= 0 && i_6_ < anIntArray2391.length) {
			int i_7_ = anIntArray2391[i_6_];
			if (i >= i_7_ && i <= anIntArray2390[i_6_] + i_7_)
				return true;
		}
		return false;
	}

	static void method4285(int i, byte i_8_) {
		if (i != -1 && !Class391.aBoolArray4024[i]) {
			Class251.aClass472_2716.method7647(i, -1934220175);
			Class31.aClass242Array302[i] = null;
		}
	}

	static final void method4286(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_9_, -1335249576);
		Class242 class242 = Class31.aClass242Array302[i_9_ >> 16];
		Class696.method14011(class250, class242, class669, -1239923096);
	}

	static final void method4287(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_10_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_11_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_12_ = client.exchangeOfferSlots[i_11_][i_10_].method7910(19522667);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0 == i_12_ ? 1 : 0;
	}

	static final void method4288(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_13_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_14_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class464.method7541(i_13_, i_14_, (byte) 7) ? 1 : 0;
	}

	static void method4289(int i, int i_15_, int i_16_, Class523_Sub25 class523_sub25, int i_17_) {
		long l = (long) (i << 28 | i_16_ << 14 | i_15_);
		Class523_Sub10 class523_sub10 = (Class523_Sub10) client.aClass14_11172.method741(l);
		if (class523_sub10 == null) {
			class523_sub10 = new Class523_Sub10();
			client.aClass14_11172.method738(class523_sub10, l);
			class523_sub10.aClass708_10417.method14236(class523_sub25, -1549133916);
		} else {
			ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(((class523_sub25.anInt10544) * -188706487), (byte) -111));
			int i_18_ = class12.value * -22288111;
			if (-758774055 * class12.stackable == 1)
				i_18_ *= class523_sub25.anInt10543 * 321349699 + 1;
			for (Class523_Sub25 class523_sub25_19_ = ((Class523_Sub25) class523_sub10.aClass708_10417.method14240(628086538)); null != class523_sub25_19_; class523_sub25_19_ = (Class523_Sub25) class523_sub10.aClass708_10417.method14244((byte) -88)) {
				class12 = (ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(class523_sub25_19_.anInt10544 * -188706487, (byte) -58));
				int i_20_ = class12.value * -22288111;
				if (class12.stackable * -758774055 == 1)
					i_20_ *= 1 + class523_sub25_19_.anInt10543 * 321349699;
				if (i_18_ > i_20_) {
					Class309.method5616(class523_sub25, class523_sub25_19_, 1947124184);
					return;
				}
			}
			class523_sub10.aClass708_10417.method14236(class523_sub25, -173263143);
		}
	}

	public static Class178 method4290(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_21_, byte i_22_) {
		int i_23_ = 0;
		int i_24_ = 0;
		if (null != canvas) {
			Dimension dimension = canvas.getSize();
			i_23_ = dimension.width;
			i_24_ = dimension.height;
		}
		return Class178.method3451(i, canvas, class172, interface25, interface46, interface48, interface45, class472, i_21_, i_23_, i_24_, -992829005);
	}

	static final void method4291(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		if (null == class250.aString2639)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class250.aString2639;
	}

	static void method4292(Class523_Sub34_Sub2 class523_sub34_sub2, int i) {
		Archive[] class44s = Class88.getArchiveReferences(-2010119351);
		for (int i_25_ = 0; i_25_ < class44s.length; i_25_++) {
			Archive class44 = class44s[i_25_];
			if (class44 != Archive.aClass44_648) {
				Class472 class472 = (Class472) Class488.aMap5500.get(class44);
				if (class472 == null)
					class523_sub34_sub2.writeInt(0, -1900449437);
				else
					class523_sub34_sub2.writeInt(class472.method7719((short) 17774), -1437305028);
			}
		}
	}
}
