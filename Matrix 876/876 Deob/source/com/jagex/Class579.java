/* Class579 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class579 implements Interface66 {
	Class64 aClass64_7702;
	static Class53_Sub13 aClass53_Sub13_7703;

	public void method292() {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4217, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(aClass64_7702.method82(), -159492164);
		client.aClass116_11058.method1974(class523_sub22, (byte) 40);
	}

	public void method210(int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4217, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(aClass64_7702.method82(), -159492164);
		client.aClass116_11058.method1974(class523_sub22, (byte) 126);
	}

	Class579(Class64 class64) {
		aClass64_7702 = class64;
	}

	static final void method9656(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		JS5FileQueue class697 = Class534.method8810(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff);
		boolean bool = false;
		for (Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) class697.first(-1426448868); null != class523_sub27_sub17; class523_sub27_sub17 = (Class523_Sub27_Sub17) class697.next(768418218)) {
			if (i_1_ == class523_sub27_sub17.anInt11831 * -536403473) {
				bool = true;
				break;
			}
		}
		if (bool)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static final void method9657(Class523_Sub36 class523_sub36, boolean bool, boolean bool_2_, int i) {
		int i_3_ = -1444773101 * class523_sub36.anInt10666;
		int i_4_ = (int) (class523_sub36.aLong7065 * 1055205983951172633L);
		class523_sub36.method8661(607052656);
		if (bool)
			Class375_Sub2.method15718(i_3_, -1774348332);
		Class80.method1567(i_3_, -638189147);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_4_, -1104795297);
		if (null != class250)
			Login.method15991(class250, (byte) -104);
		Class455.method7410(i_3_, (byte) 0);
		if (!bool_2_ && -1 != client.anInt11186 * -1614846429)
			Class562.method9466(client.anInt11186 * -1614846429, 1, 276446739);
		Class15 class15 = new Class15(client.aClass14_11187);
		for (Class523_Sub36 class523_sub36_5_ = (Class523_Sub36) class15.method757(2138772399); null != class523_sub36_5_; class523_sub36_5_ = (Class523_Sub36) class15.next()) {
			if (!class523_sub36_5_.method8660(1032156147)) {
				class523_sub36_5_ = (Class523_Sub36) class15.method757(2138772399);
				if (null == class523_sub36_5_)
					break;
			}
			if (class523_sub36_5_.anInt10667 * -1502434839 == 3) {
				int i_6_ = (int) (class523_sub36_5_.aLong7065 * 1055205983951172633L);
				if (i_6_ >>> 16 == i_3_)
					method9657(class523_sub36_5_, true, bool_2_, 140500714);
			}
		}
	}
}
