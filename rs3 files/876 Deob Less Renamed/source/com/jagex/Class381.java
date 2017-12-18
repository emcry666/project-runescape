/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class381 implements Interface49 {
	public int anInt3939;
	public Class380 aClass380_3940;
	public int anInt3941;
	public String aString3942;
	public int anInt3943;
	public int anInt3944;
	public int anInt3945;
	public int anInt3946;
	public int anInt3947;
	public int anInt3948;
	public int anInt3949;
	public Class389 aClass389_3950;
	public int anInt3951;
	public static int anInt3952;

	Class381(String string, Class380 class380, Class389 class389, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		aString3942 = string;
		aClass380_3940 = class380;
		aClass389_3950 = class389;
		anInt3939 = 1055127685 * i;
		anInt3943 = i_0_ * -1947373851;
		anInt3941 = i_1_ * 860297061;
		anInt3945 = -1819864147 * i_2_;
		anInt3946 = -146951491 * i_3_;
		anInt3947 = i_4_ * -1651072879;
		anInt3948 = i_5_ * -290565773;
		anInt3949 = -1803036407 * i_6_;
		anInt3944 = i_7_ * -1167819401;
		anInt3951 = 1055592819 * i_8_;
	}

	public Class394 method353(int i) {
		return Class394.aClass394_4048;
	}

	public Class394 method351() {
		return Class394.aClass394_4048;
	}

	public Class394 method352() {
		return Class394.aClass394_4048;
	}

	public Class394 method354() {
		return Class394.aClass394_4048;
	}

	public static Class381 method6406(Class523_Sub34 class523_sub34) {
		String string = class523_sub34.readString(-1047958748);
		Class380 class380 = (Class228.method4175(443901507)[class523_sub34.readUnsignedByte(-1813130065)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(-2144396185)]);
		int i = class523_sub34.readShort(-1132679838);
		int i_9_ = class523_sub34.readShort(704203990);
		int i_10_ = class523_sub34.readUnsignedByte(438980070);
		int i_11_ = class523_sub34.readUnsignedByte(-33122986);
		int i_12_ = class523_sub34.readUnsignedByte(-341872279);
		int i_13_ = class523_sub34.readUnsignedShort(-1797071127);
		int i_14_ = class523_sub34.readUnsignedShort(-1624880333);
		int i_15_ = class523_sub34.readBigSmart((byte) -95);
		int i_16_ = class523_sub34.readUnsignedInt((byte) -108);
		int i_17_ = class523_sub34.readUnsignedInt((byte) -44);
		return new Class381(string, class380, class389, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_);
	}

	static void method6407(Class523_Sub27_Sub6 class523_sub27_sub6, int i, int i_18_, boolean bool, byte i_19_) {
		if (null != class523_sub27_sub6 && Class36.aClass708_342.aClass523_8838 != class523_sub27_sub6) {
			int i_20_ = class523_sub27_sub6.anInt11634 * -1947252983;
			int i_21_ = -967967353 * class523_sub27_sub6.anInt11640;
			int i_22_ = -2101009827 * class523_sub27_sub6.anInt11639;
			int i_23_ = (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L);
			long l = 7768112170675051057L * class523_sub27_sub6.aLong11632;
			if (i_22_ >= 2000)
				i_22_ -= 2000;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			if (25 == i_22_) {
				Class250 class250 = Class654.method10722(i_21_, i_20_, (byte) 41);
				if (null != class250) {
					Class399.method6533(-1749951846);
					Class523_Sub13 class523_sub13 = client.method17252(class250);
					Class225.method4157(class250, class523_sub13.method15964(-2031202173), 330664637 * class523_sub13.anInt10454, (byte) -14);
					client.aString11016 = Class188.method3596(class250, -1067190173);
					if (null == client.aString11016)
						client.aString11016 = "Null";
					client.aString11225 = new StringBuilder().append(class250.aString2639).append(Class495.method8101(16777215, 596351056)).toString();
				}
			} else {
				if (16 == i_22_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_18_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4214, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -997075321);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 27);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anInt11888) * -1087669731, (byte) -88);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-325213033 * client.anInt11095, (byte) -29);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 40) ? 1 : 0, -1106985477);
					client.aClass116_11058.method1974(class523_sub22, (byte) 16);
				}
				if (i_22_ == 1008 || i_22_ == 1009 || i_22_ == 1010 || 1011 == i_22_ || 1012 == i_22_)
					Class198.method3676(i_22_, i_23_, i_20_, (byte) -60);
				if (i_22_ == 2) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_18_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.INTERFACE_ON_OBJECT_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -645748145);
					class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 109) ? 1 : 0, -159492164);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt((int) (l >>> 32) & 0x7fffffff, -1303363647);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(class592.localX * 235453015 + i_20_, (byte) 75);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1034378319 * client.anInt11105, (byte) -113);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_21_ + 1704054549 * class592.localY, (byte) -103);
					client.aClass116_11058.method1974(class523_sub22, (byte) 88);
					Class581.method9664(i_20_, i_21_, 1064209988);
				}
				OutgoingPacket class408 = null;
				if (9 == i_22_)
					class408 = OutgoingPacket.NPC_CLICK_1_PACKET;
				else if (i_22_ == 10)
					class408 = OutgoingPacket.ATTACK_NPC_PACKET;
				else if (i_22_ == 11)
					class408 = OutgoingPacket.NPC_CLICK_2_PACKET;
				else if (12 == i_22_)
					class408 = OutgoingPacket.NPC_CLICK_3_PACKET;
				else if (i_22_ == 13)
					class408 = OutgoingPacket.aClass408_4292;
				else if (i_22_ == 1003)
					class408 = OutgoingPacket.NPC_EXAMINE_PACKET;
				if (class408 != null) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_23_));
					if (class523_sub28 != null) {
						Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_18_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 111) ? 1 : 0, (byte) 72);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_23_, (byte) 78);
						client.aClass116_11058.method1974(class523_sub22, (byte) 61);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub1.anIntArray11943[0]), 1413447144);
					}
				}
				if (i_22_ == 59) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_18_ * 1014439817;
					client.anInt11135 = -457701609;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4251, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(-325213033 * client.anInt11095, 1600210466);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(-1034378319 * client.anInt11105, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(235453015 * class592.localX + i_20_, 1921486032);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1383041209 * Class232.anInt2367, -1606994829);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_21_, -1262882661);
					client.aClass116_11058.method1974(class523_sub22, (byte) 74);
					Class581.method9664(i_20_, i_21_, 2143798144);
				}
				OutgoingPacket class408_24_ = null;
				if (18 == i_22_)
					class408_24_ = OutgoingPacket.aClass408_4228;
				else if (i_22_ == 19)
					class408_24_ = OutgoingPacket.aClass408_4274;
				else if (i_22_ == 20)
					class408_24_ = OutgoingPacket.TAKE_GROUND_ITEM_PACKET;
				else if (21 == i_22_)
					class408_24_ = OutgoingPacket.aClass408_4298;
				else if (22 == i_22_)
					class408_24_ = OutgoingPacket.aClass408_4232;
				else if (i_22_ == 1004)
					class408_24_ = OutgoingPacket.GROUND_ITEM_OPTION_2_PACKET;
				if (null != class408_24_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_18_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_24_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_23_, -1192552698);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_20_ + class592.localX * 235453015, (byte) -23);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((bool ? 2 : 0) | (Class315.method5677((byte) 101) ? 1 : 0), -314031734);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(1704054549 * class592.localY + i_21_, (byte) -75);
					client.aClass116_11058.method1974(class523_sub22, (byte) 101);
					Class581.method9664(i_20_, i_21_, 756005328);
				}
				if (60 == i_22_) {
					if (client.rights * -1746920271 > 0 && Class470_Sub5.method15902(-727172490))
						RSSocket.method506((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821), (i_20_ + 235453015 * class592.localX), (1704054549 * class592.localY + i_21_), -1755464689);
					else {
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = 1014439817 * i_18_;
						client.anInt11135 = -457701609;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4267), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_21_ + 1704054549 * class592.localY, 306701385);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_20_ + class592.localX * 235453015, -1262882661);
						client.aClass116_11058.method1974(class523_sub22, (byte) 80);
					}
				}
				if (17 == i_22_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = 1014439817 * i_18_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4268, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_23_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(235453015 * class592.localX + i_20_, (byte) -114);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 53) ? 1 : 0, (byte) 105);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11105 * -1034378319, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(client.anInt11095 * -325213033, (byte) 89);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(class592.localY * 1704054549 + i_21_, -729571315);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, 1762988896);
					client.aClass116_11058.method1974(class523_sub22, (byte) 86);
					Class581.method9664(i_20_, i_21_, 813393723);
				}
				if (15 == i_22_) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_23_]);
					if (class647_sub1_sub3_sub1_sub2 != null) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = i_18_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4214), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -813672943);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 29);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_23_, (byte) -16);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11095 * -325213033, (byte) -26);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 80) ? 1 : 0, -2026855611);
						client.aClass116_11058.method1974(class523_sub22, (byte) 82);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub2.anIntArray11943[0]), -570624772);
					}
				}
				if (58 == i_22_) {
					Class250 class250 = Class654.method10722(i_21_, i_20_, (byte) 100);
					if (null != class250)
						Class446.method7240(class250, (byte) -22);
				}
				if (i_22_ == 23) {
					if (-1746920271 * client.rights > 0 && Class470_Sub5.method15902(-1967370907))
						RSSocket.method506((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aByte10821), (i_20_ + 235453015 * class592.localX), (i_21_ + 1704054549 * class592.localY), -1570602955);
					else {
						Class523_Sub22 class523_sub22 = Class446.method7239(i_20_, i_21_, i_23_, 247922727);
						if (i_23_ == 1) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, -567376849);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, 2867011);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) client.aFloat11129, (byte) -15);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(57, 1780785570);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(724985463 * client.anInt11094, 1126297681);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1193506389 * client.anInt11068, -949067506);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(89, 1278063859);
							Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4903, (byte) -97);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4905, (byte) -76);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(63, 215012467);
						} else {
							client.anInt11117 = i * -685128629;
							client.anInt11122 = 1014439817 * i_18_;
							client.anInt11135 = -457701609;
							client.anInt11134 = 0;
						}
						client.aClass116_11058.method1974(class523_sub22, (byte) 91);
						Class581.method9664(i_20_, i_21_, -642948461);
					}
				}
				OutgoingPacket class408_25_ = null;
				if (44 == i_22_)
					class408_25_ = OutgoingPacket.aClass408_4304;
				else if (i_22_ == 45)
					class408_25_ = OutgoingPacket.aClass408_4206;
				else if (i_22_ == 46)
					class408_25_ = OutgoingPacket.aClass408_4273;
				else if (47 == i_22_)
					class408_25_ = OutgoingPacket.aClass408_4221;
				else if (48 == i_22_)
					class408_25_ = OutgoingPacket.aClass408_4303;
				else if (49 == i_22_)
					class408_25_ = OutgoingPacket.aClass408_4271;
				else if (i_22_ == 50)
					class408_25_ = OutgoingPacket.aClass408_4234;
				else if (51 == i_22_)
					class408_25_ = OutgoingPacket.aClass408_4258;
				else if (52 == i_22_)
					class408_25_ = OutgoingPacket.aClass408_4230;
				else if (i_22_ == 53)
					class408_25_ = OutgoingPacket.aClass408_4305;
				if (null != class408_25_) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_23_]);
					if (null != class647_sub1_sub3_sub1_sub2) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_18_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_25_, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 92) ? 1 : 0, -159492164);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_23_, (byte) 10);
						client.aClass116_11058.method1974(class523_sub22, (byte) 88);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub2.anIntArray11943[0]), 1743132779);
					}
				}
				if (i_22_ == 30 && null == client.aClass250_11189) {
					Class557.method9225(i_21_, i_20_, 1369556809);
					client.aClass250_11189 = Class654.method10722(i_21_, i_20_, (byte) 14);
					if (client.aClass250_11189 != null)
						Class523_Sub14.method15991(client.aClass250_11189, (byte) -105);
				}
				if (i_22_ == 8) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_23_));
					if (class523_sub28 != null) {
						Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = i_18_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4236), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, 283653552);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 96) ? 1 : 0, 1002268008);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_23_, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 1);
						client.aClass116_11058.method1974(class523_sub22, (byte) 74);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.anIntArray11885[0]), (class647_sub1_sub3_sub1_sub1.anIntArray11943[0]), -993025943);
					}
				}
				if (i_22_ == 57 || i_22_ == 1007)
					Class553.method9164(i_23_, i_21_, i_20_, class523_sub27_sub6.aString11637, 1385901700);
				OutgoingPacket class408_26_ = null;
				if (i_22_ == 3)
					class408_26_ = OutgoingPacket.OBJECT_CLICK_1_PACKET;
				else if (i_22_ == 4)
					class408_26_ = OutgoingPacket.aClass408_4243;
				else if (5 == i_22_)
					class408_26_ = OutgoingPacket.aClass408_4244;
				else if (6 == i_22_)
					class408_26_ = OutgoingPacket.aClass408_4245;
				else if (1001 == i_22_)
					class408_26_ = OutgoingPacket.aClass408_4222;
				else if (i_22_ == 1002)
					class408_26_ = OutgoingPacket.OBJECT_EXAMINE_PACKET;
				if (null != class408_26_) {
					client.anInt11117 = i * -685128629;
					client.anInt11122 = 1014439817 * i_18_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_26_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 95) ? 1 : 0, 928421042);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_21_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2((int) (l >>> 32) & 0x7fffffff, -1123351047);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_20_ + class592.localX * 235453015, -53412426);
					client.aClass116_11058.method1974(class523_sub22, (byte) 65);
					Class581.method9664(i_20_, i_21_, -1228870884);
				}
				if (client.aBool11000)
					Class399.method6533(825075246);
				if (null != Class436.aClass250_4899 && client.anInt11173 * -1412331351 == 0)
					Class523_Sub14.method15991(Class436.aClass250_4899, (byte) -53);
			}
		}
	}

	public static int method6408(int i, int i_27_, int i_28_, int i_29_) {
		int i_30_ = 255 - i_28_;
		i_27_ = ((i_27_ & 0xff00ff) * i_28_ & ~0xff00ff | i_28_ * (i_27_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_30_ & ~0xff00ff | i_30_ * (i & 0xff00) & 0xff0000) >>> 8) + i_27_);
	}

	static final void method6409(Class669 class669, byte i) {
		int i_31_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_31_, -1533581011);
		Class242 class242 = Class31.aClass242Array302[i_31_ >> 16];
		Class7.method563(class250, class242, class669, 1585440071);
	}

	public static void method6410(Class472 class472, Class472 class472_32_, Class472 class472_33_, Class472 class472_34_, int i) {
		Class251.aClass472_2716 = class472;
		Class8.aClass472_65 = class472_32_;
		Class397.aClass472_4061 = class472_33_;
		Class31.aClass242Array302 = new Class242[Class251.aClass472_2716.method7641(-2113672023)];
		Class391.aBoolArray4024 = new boolean[Class251.aClass472_2716.method7641(-2139885700)];
	}

	static void method6411(int i, byte i_35_) {
		if (Class449.aClass523_Sub33_4946.aClass687_Sub32_10644.method16999(1074115321) == 0)
			i = -1;
		if (-1455894587 * client.anInt11033 != i) {
			if (-1 != i) {
				Class639 class639 = ((Class639) BodyDefinitions.aClass53_Sub15_8238.getDefinition(i, (byte) -24));
				Class175 class175 = class639.method10518((byte) 25);
				if (null != class175) {
					Class384_Sub3.aClass507_10287.setcustomcursor(Class523_Sub18_Sub8.aCanvas11689, class175.method2959(true), class175.method2951(), class175.method2968(), new Point(-300741903 * class639.anInt8311, 684154197 * class639.anInt8313));
					client.anInt11033 = i * -1911302387;
				} else
					i = -1;
			}
			if (i == -1 && -1 != client.anInt11033 * -1455894587) {
				Class384_Sub3.aClass507_10287.setcustomcursor(Class523_Sub18_Sub8.aCanvas11689, null, -1, -1, new Point());
				client.anInt11033 = 1911302387;
			}
		}
	}
}
