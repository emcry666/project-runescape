/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class288 implements Interface75 {
	static Class288 aClass288_3103;
	static Class288 aClass288_3104 = new Class288(0);
	static Class288 aClass288_3105;
	int anInt3106;

	static {
		aClass288_3103 = new Class288(1);
		aClass288_3105 = new Class288(2);
	}

	public int method82() {
		return anInt3106 * 1610637675;
	}

	public int method6() {
		return anInt3106 * 1610637675;
	}

	public int method101() {
		return anInt3106 * 1610637675;
	}

	Class288(int i) {
		anInt3106 = -1013529789 * i;
	}

	public static Class381 method5159(Class523_Sub34 class523_sub34, byte i) {
		String string = class523_sub34.readString(-1981948945);
		Class380 class380 = (Class228.method4175(544080445)[class523_sub34.readUnsignedByte(-2061662374)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(-578342959)]);
		int i_0_ = class523_sub34.readShort(764582530);
		int i_1_ = class523_sub34.readShort(-714028641);
		int i_2_ = class523_sub34.readUnsignedByte(-707634823);
		int i_3_ = class523_sub34.readUnsignedByte(1549019982);
		int i_4_ = class523_sub34.readUnsignedByte(47854156);
		int i_5_ = class523_sub34.readUnsignedShort(-1191202940);
		int i_6_ = class523_sub34.readUnsignedShort(-1082586102);
		int i_7_ = class523_sub34.readBigSmart((byte) -87);
		int i_8_ = class523_sub34.readUnsignedInt((byte) -43);
		int i_9_ = class523_sub34.readUnsignedInt((byte) -100);
		return new Class381(string, class380, class389, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
	}

	static void method5160(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class385.method6444(2139042838);
	}

	static final void method5161(Class669 class669, byte i) {
		class669.anInt8560 -= -587057089;
		Class172.method2897((String) (class669.anObjectArray8559[240723773 * class669.anInt8560]), (String) (class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]), (String) (class669.anObjectArray8559[class669.anInt8560 * 240723773 + 2]), class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)] == 1, true, (byte) 34);
	}

	static final void method5162(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_10_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_11_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class250 class250 = Class654.method10722(i_10_, i_11_, (byte) -10);
		Class399.method6533(-1406896068);
		Class523_Sub13 class523_sub13 = client.method17252(class250);
		Class225.method4157(class250, class523_sub13.method15964(-211375947), 330664637 * class523_sub13.anInt10454, (byte) -26);
	}

	static String method5163(int i, int i_12_) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static final void method5164(Class250[] class250s, int i, byte i_13_) {
		for (int i_14_ = 0; i_14_ < class250s.length; i_14_++) {
			Class250 class250 = class250s[i_14_];
			if (class250 != null) {
				if (0 == 36473529 * class250.anInt2534) {
					if (null != class250.aClass250Array2519)
						method5164(class250.aClass250Array2519, i, (byte) 0);
					Class523_Sub36 class523_sub36 = ((Class523_Sub36) (client.aClass14_11187.method741((long) (-1363815505 * class250.anInt2585))));
					if (null != class523_sub36)
						Class562.method9466((class523_sub36.anInt10666 * -1444773101), i, 900117018);
				}
				if (i == 0 && class250.anObjectArray2672 != null) {
					Class523_Sub38 class523_sub38 = new Class523_Sub38();
					class523_sub38.aClass250_10678 = class250;
					class523_sub38.anObjectArray10687 = class250.anObjectArray2672;
					Class482.method7916(class523_sub38, (byte) 3);
				}
				if (i == 1 && null != class250.anObjectArray2673) {
					if (234012635 * class250.anInt2709 >= 0) {
						Class250 class250_15_ = Class188.method3592((class250.anInt2585 * -1363815505), -801768548);
						if (null == class250_15_ || class250_15_.aClass250Array2535 == null || (234012635 * class250.anInt2709 >= class250_15_.aClass250Array2535.length) || class250 != (class250_15_.aClass250Array2535[class250.anInt2709 * 234012635]))
							continue;
					}
					Class523_Sub38 class523_sub38 = new Class523_Sub38();
					class523_sub38.aClass250_10678 = class250;
					class523_sub38.anObjectArray10687 = class250.anObjectArray2673;
					Class482.method7916(class523_sub38, (byte) 3);
				}
			}
		}
	}

	static final void method5165(Class669 class669, int i) {
		class669.anInt8560 -= 1235970069;
		class669.anInt8558 -= 2121349901;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		boolean bool = class669.anIntArray8557[class669.anInt8558 * 1357652815] == 1;
		boolean bool_16_ = (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815] == 1);
		boolean bool_17_ = 1 == (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4322, client.aClass116_11057.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(Class6.method555(string, (byte) -61) + 1, (byte) -90);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -32);
		int i_18_ = 0;
		if (bool)
			i_18_ |= 0x1;
		if (bool_16_)
			i_18_ |= 0x2;
		if (bool_17_)
			i_18_ |= 0x4;
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_18_, -455659840);
		client.aClass116_11057.method1974(class523_sub22, (byte) 61);
	}

	static final void method5166(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub8_10628, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1 ? 1 : 0, 1102474008);
		Class211.method3824(1318024334);
		Class165.method2655((byte) 7);
		Class526.method8725(-193352869);
		client.aBool11012 = false;
	}

	static final void method5167(Class669 class669, byte i) {
		class669.anInt8558 -= 2138772399;
	}
}
