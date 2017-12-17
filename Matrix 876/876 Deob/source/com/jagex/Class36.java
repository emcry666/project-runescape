/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

public class Class36 {
	static final int anInt320 = 1;
	static final int anInt321 = 512;
	static InterfaceComponentDefinitions aClass250_322;
	static int anInt323 = 530533488;
	static final int anInt324 = 31;
	static final int anInt325 = 31;
	public static boolean aBool326 = false;
	static boolean aBool327 = false;
	static Class523_Sub27_Sub8 aClass523_Sub27_Sub8_328 = null;
	static Class523_Sub27_Sub6 aClass523_Sub27_Sub6_329;
	public static int anInt330;
	static final int anInt331 = 2;
	static int anInt332 = 0;
	static Class523_Sub27_Sub6 aClass523_Sub27_Sub6_333;
	static Class523_Sub27_Sub6 aClass523_Sub27_Sub6_334;
	static Class209 aClass209_335;
	public static int anInt336;
	static Class441 aClass441_337;
	static Class14 aClass14_338;
	static JS5FileQueue aClass697_339;
	static Class708 aClass708_340;
	static Class708 aClass708_341;
	static Class708 aClass708_342;
	static final int anInt343 = 8;
	static int anInt344;
	static int anInt345;
	static int anInt346;
	static int anInt347;
	static final int anInt348 = 3;
	static int anInt349;
	static Class441 aClass441_350;
	static int anInt351;
	static Class435 aClass435_352;
	public static boolean aBool353;
	public static int anInt354;
	static int anInt355;
	static float[] aFloatArray356;
	static final int anInt357 = 0;
	static final int anInt358 = 1;
	static final int anInt359 = 2;
	static final int anInt360 = 409;
	public static final int anInt361 = 4;
	static final int anInt362 = 5;
	static final int anInt363 = 6;
	public static final int anInt364 = 7;
	static final int anInt365 = 0;

	static void method957(int i, int i_0_) {
		if (1 == 1459601073 * anInt332)
			Class381.method6407(BaseVarType.aClass523_Sub27_Sub6_5392, i, i_0_, false, (byte) 0);
		else if (anInt332 * 1459601073 == 2)
			Class436.method6874(i, i_0_, -95384526);
		anInt332 = 0;
		BaseVarType.aClass523_Sub27_Sub6_5392 = null;
	}

	static {
		anInt330 = 0;
		anInt336 = 0;
		aClass708_342 = new Class708();
		aClass14_338 = new Class14(16);
		aClass697_339 = new JS5FileQueue();
		aClass708_340 = new Class708();
		aClass708_341 = new Class708();
		aClass209_335 = new Class209(30);
		aClass250_322 = null;
		anInt344 = 1639381475;
		anInt345 = 924580533;
		anInt346 = -805025479;
		anInt347 = 2101624987;
		anInt355 = 0;
		anInt349 = 0;
		aClass441_350 = null;
		aClass441_337 = new Class441();
		aClass435_352 = new Class435();
		aBool353 = false;
		anInt351 = 0;
		anInt354 = 875055733;
		aFloatArray356 = new float[4];
	}

	static boolean method958() {
		return Class276.method5047(Class61.aClass633_769.aClass574_8265, (byte) 58);
	}

	static boolean method959() {
		return Class276.method5047(Class61.aClass633_769.aClass574_8264, (byte) 16);
	}

	static boolean method960() {
		return Class276.method5047(Class61.aClass633_769.aClass574_8260, (byte) -90);
	}

	static boolean method961() {
		return Class276.method5047(Class61.aClass633_769.aClass574_8260, (byte) -5);
	}

	static void method962(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1) {
		if (class647_sub1_sub3_sub1 instanceof NPC) {
			NPC class647_sub1_sub3_sub1_sub1 = (NPC) class647_sub1_sub3_sub1;
			if (null != class647_sub1_sub3_sub1_sub1.aClass300_12175)
				Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.player.aByte10821) != (class647_sub1_sub3_sub1_sub1.aByte10821)), -296509098);
		} else if (class647_sub1_sub3_sub1 instanceof Player) {
			Player class647_sub1_sub3_sub1_sub2 = (Player) class647_sub1_sub3_sub1;
			Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.player.aByte10821) != class647_sub1_sub3_sub1_sub2.aByte10821), (short) 9518);
		}
	}

	static boolean method963(Class574 class574) {
		return Class293.method5251(class574, null, 1040012219);
	}

	static void method964(Class523_Sub27_Sub6 class523_sub27_sub6, int i, int i_1_, boolean bool) {
		if (null != class523_sub27_sub6 && aClass708_342.aClass523_8838 != class523_sub27_sub6) {
			int i_2_ = class523_sub27_sub6.anInt11634 * -1947252983;
			int i_3_ = -967967353 * class523_sub27_sub6.anInt11640;
			int i_4_ = -2101009827 * class523_sub27_sub6.anInt11639;
			int i_5_ = (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L);
			long l = 7768112170675051057L * class523_sub27_sub6.aLong11632;
			if (i_4_ >= 2000)
				i_4_ -= 2000;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			if (25 == i_4_) {
				InterfaceComponentDefinitions class250 = Class654.method10722(i_3_, i_2_, (byte) -21);
				if (null != class250) {
					Class399.method6533(1328867055);
					InterfaceComponentSettings class523_sub13 = client.method17252(class250);
					Class225.method4157(class250, class523_sub13.method15964(-94478199), 330664637 * class523_sub13.anInt10454, (byte) -25);
					client.aString11016 = Class188.method3596(class250, -1986318191);
					if (null == client.aString11016)
						client.aString11016 = "Null";
					client.aString11225 = new StringBuilder().append(class250.aString2639).append(Class495.method8101(16777215, -1855527589)).toString();
				}
			} else {
				if (16 == i_4_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_1_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4214, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -1221647006);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 59);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((Class241.player.anInt11888) * -1087669731, (byte) -43);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-325213033 * client.anInt11095, (byte) -109);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 61) ? 1 : 0, -1631589287);
					client.aClass116_11058.method1974(class523_sub22, (byte) 16);
				}
				if (i_4_ == 1008 || i_4_ == 1009 || i_4_ == 1010 || 1011 == i_4_ || 1012 == i_4_)
					Class198.method3676(i_4_, i_5_, i_2_, (byte) -95);
				if (i_4_ == 2) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_1_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.INTERFACE_ON_OBJECT_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -1640219837);
					class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 0) ? 1 : 0, -159492164);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt((int) (l >>> 32) & 0x7fffffff, -1310276870);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(class592.localX * 235453015 + i_2_, (byte) 60);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1034378319 * client.anInt11105, (byte) -38);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_3_ + 1704054549 * class592.localY, (byte) -85);
					client.aClass116_11058.method1974(class523_sub22, (byte) 96);
					Class581.method9664(i_2_, i_3_, 1406709786);
				}
				OutgoingPacket class408 = null;
				if (9 == i_4_)
					class408 = OutgoingPacket.NPC_CLICK_1_PACKET;
				else if (i_4_ == 10)
					class408 = OutgoingPacket.ATTACK_NPC_PACKET;
				else if (i_4_ == 11)
					class408 = OutgoingPacket.NPC_CLICK_2_PACKET;
				else if (12 == i_4_)
					class408 = OutgoingPacket.NPC_CLICK_3_PACKET;
				else if (i_4_ == 13)
					class408 = OutgoingPacket.aClass408_4292;
				else if (i_4_ == 1003)
					class408 = OutgoingPacket.NPC_EXAMINE_PACKET;
				if (class408 != null) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_5_));
					if (class523_sub28 != null) {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_1_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 76) ? 1 : 0, (byte) 95);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_5_, (byte) 109);
						client.aClass116_11058.method1974(class523_sub22, (byte) 106);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), -1267341242);
					}
				}
				if (i_4_ == 59) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_1_ * 1014439817;
					client.anInt11135 = -457701609;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4251, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(-325213033 * client.anInt11095, -465015798);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(-1034378319 * client.anInt11105, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(235453015 * class592.localX + i_2_, -856469388);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1383041209 * Class232.anInt2367, -1479747820);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_3_, -1262882661);
					client.aClass116_11058.method1974(class523_sub22, (byte) 87);
					Class581.method9664(i_2_, i_3_, -1394632343);
				}
				OutgoingPacket class408_6_ = null;
				if (18 == i_4_)
					class408_6_ = OutgoingPacket.aClass408_4228;
				else if (i_4_ == 19)
					class408_6_ = OutgoingPacket.aClass408_4274;
				else if (i_4_ == 20)
					class408_6_ = OutgoingPacket.TAKE_GROUND_ITEM_PACKET;
				else if (21 == i_4_)
					class408_6_ = OutgoingPacket.aClass408_4298;
				else if (22 == i_4_)
					class408_6_ = OutgoingPacket.aClass408_4232;
				else if (i_4_ == 1004)
					class408_6_ = OutgoingPacket.GROUND_ITEM_OPTION_2_PACKET;
				if (null != class408_6_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_1_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_6_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_5_, -124543054);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_2_ + class592.localX * 235453015, (byte) -71);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((bool ? 2 : 0) | (Class315.method5677((byte) 54) ? 1 : 0), -512467545);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(1704054549 * class592.localY + i_3_, (byte) -10);
					client.aClass116_11058.method1974(class523_sub22, (byte) 27);
					Class581.method9664(i_2_, i_3_, -1236915516);
				}
				if (60 == i_4_) {
					if (client.rights * -1746920271 > 0 && WorldVarDomainType.method15902(-1015069885))
						RSSocket.method506((Class241.player.aByte10821), i_2_ + 235453015 * class592.localX, (1704054549 * class592.localY + i_3_), -1688163768);
					else {
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = 1014439817 * i_1_;
						client.anInt11135 = -457701609;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4267), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_3_ + 1704054549 * class592.localY, 756397094);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_2_ + class592.localX * 235453015, -1262882661);
						client.aClass116_11058.method1974(class523_sub22, (byte) 75);
					}
				}
				if (17 == i_4_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = 1014439817 * i_1_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4268, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_5_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(235453015 * class592.localX + i_2_, (byte) -60);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 107) ? 1 : 0, (byte) 63);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11105 * -1034378319, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(client.anInt11095 * -325213033, (byte) 65);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(class592.localY * 1704054549 + i_3_, -1202896781);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, 810027850);
					client.aClass116_11058.method1974(class523_sub22, (byte) 105);
					Class581.method9664(i_2_, i_3_, 1806550341);
				}
				if (15 == i_4_) {
					Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_5_];
					if (class647_sub1_sub3_sub1_sub2 != null) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = i_1_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4214), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -959559814);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 92);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_5_, (byte) -42);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11095 * -325213033, (byte) -100);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 34) ? 1 : 0, -750020871);
						client.aClass116_11058.method1974(class523_sub22, (byte) 24);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), 1564413966);
					}
				}
				if (58 == i_4_) {
					InterfaceComponentDefinitions class250 = Class654.method10722(i_3_, i_2_, (byte) 31);
					if (null != class250)
						Class446.method7240(class250, (byte) -43);
				}
				if (i_4_ == 23) {
					if (-1746920271 * client.rights > 0 && WorldVarDomainType.method15902(2114274759))
						RSSocket.method506((Class241.player.aByte10821), i_2_ + 235453015 * class592.localX, (i_3_ + 1704054549 * class592.localY), -1633649352);
					else {
						Class523_Sub22 class523_sub22 = Class446.method7239(i_2_, i_3_, i_5_, 1769334138);
						if (i_5_ == 1) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, 1976741531);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, -638819777);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) client.aFloat11129, (byte) -90);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(57, -1275250302);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(724985463 * client.anInt11094, -1907440009);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1193506389 * client.anInt11068, 414866891);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(89, 1926252857);
							Class437 class437 = (Class241.player.method10569().aClass437_4862);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4903, (byte) -61);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4905, (byte) -7);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(63, -1185691689);
						} else {
							client.anInt11117 = i * -685128629;
							client.anInt11122 = 1014439817 * i_1_;
							client.anInt11135 = -457701609;
							client.anInt11134 = 0;
						}
						client.aClass116_11058.method1974(class523_sub22, (byte) 46);
						Class581.method9664(i_2_, i_3_, 1079849166);
					}
				}
				OutgoingPacket class408_7_ = null;
				if (44 == i_4_)
					class408_7_ = OutgoingPacket.aClass408_4304;
				else if (i_4_ == 45)
					class408_7_ = OutgoingPacket.aClass408_4206;
				else if (i_4_ == 46)
					class408_7_ = OutgoingPacket.aClass408_4273;
				else if (47 == i_4_)
					class408_7_ = OutgoingPacket.aClass408_4221;
				else if (48 == i_4_)
					class408_7_ = OutgoingPacket.aClass408_4303;
				else if (49 == i_4_)
					class408_7_ = OutgoingPacket.aClass408_4271;
				else if (i_4_ == 50)
					class408_7_ = OutgoingPacket.aClass408_4234;
				else if (51 == i_4_)
					class408_7_ = OutgoingPacket.aClass408_4258;
				else if (52 == i_4_)
					class408_7_ = OutgoingPacket.aClass408_4230;
				else if (i_4_ == 53)
					class408_7_ = OutgoingPacket.aClass408_4305;
				if (null != class408_7_) {
					Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_5_];
					if (null != class647_sub1_sub3_sub1_sub2) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_1_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_7_, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 103) ? 1 : 0, -159492164);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_5_, (byte) 47);
						client.aClass116_11058.method1974(class523_sub22, (byte) 121);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), 513479711);
					}
				}
				if (i_4_ == 30 && null == client.aClass250_11189) {
					NetworkStream.method9225(i_3_, i_2_, 1369556809);
					client.aClass250_11189 = Class654.method10722(i_3_, i_2_, (byte) -82);
					if (client.aClass250_11189 != null)
						Login.method15991(client.aClass250_11189, (byte) -29);
				}
				if (i_4_ == 8) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_5_));
					if (class523_sub28 != null) {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = i_1_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4236), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, -194405524);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 101) ? 1 : 0, 118122740);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_5_, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 19);
						client.aClass116_11058.method1974(class523_sub22, (byte) 33);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), -325197083);
					}
				}
				if (i_4_ == 57 || i_4_ == 1007)
					Class553.method9164(i_5_, i_3_, i_2_, class523_sub27_sub6.aString11637, 1631012740);
				OutgoingPacket class408_8_ = null;
				if (i_4_ == 3)
					class408_8_ = OutgoingPacket.OBJECT_CLICK_1_PACKET;
				else if (i_4_ == 4)
					class408_8_ = OutgoingPacket.aClass408_4243;
				else if (5 == i_4_)
					class408_8_ = OutgoingPacket.aClass408_4244;
				else if (6 == i_4_)
					class408_8_ = OutgoingPacket.aClass408_4245;
				else if (1001 == i_4_)
					class408_8_ = OutgoingPacket.aClass408_4222;
				else if (i_4_ == 1002)
					class408_8_ = OutgoingPacket.OBJECT_EXAMINE_PACKET;
				if (null != class408_8_) {
					client.anInt11117 = i * -685128629;
					client.anInt11122 = 1014439817 * i_1_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_8_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 4) ? 1 : 0, -976965879);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_3_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2((int) (l >>> 32) & 0x7fffffff, -564222053);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_2_ + class592.localX * 235453015, -4084546);
					client.aClass116_11058.method1974(class523_sub22, (byte) 49);
					Class581.method9664(i_2_, i_3_, 493826888);
				}
				if (client.aBool11000)
					Class399.method6533(1517722918);
				if (null != Class436.aClass250_4899 && client.anInt11173 * -1412331351 == 0)
					Login.method15991(Class436.aClass250_4899, (byte) 2);
			}
		}
	}

	static boolean method965(Interface68 interface68, Class523_Sub39 class523_sub39) {
		return (interface68 != null && interface68.method435(class523_sub39, client.anInterface64Array11194, client.anInt11184 * -751939039, Class481.aClass551_5473, (byte) -102));
	}

	static void method966() {
		aClass523_Sub27_Sub6_329 = (new Class523_Sub27_Sub6(Class39.aClass39_380.method1124(Class53_Sub20.aClass668_10979, (byte) -39), "", 971872405 * client.anInt11178, 1006, -1, 0L, 0, 0, true, false, 0L, true));
	}

	static void method967() {
		aClass523_Sub27_Sub6_329 = (new Class523_Sub27_Sub6(Class39.aClass39_380.method1124(Class53_Sub20.aClass668_10979, (byte) -90), "", 971872405 * client.anInt11178, 1006, -1, 0L, 0, 0, true, false, 0L, true));
	}

	public static void method968() {
		Class253.method4544(2019991621);
	}

	static void method969() {
		if (-2131499789 * client.anInt11070 < 0) {
			Class10 class10 = client.method17697(1700982873);
			if (!aBool326)
				aBool327 = ((-2045228509 * anInt354 != -1 && anInt330 * 462991943 >= -2045228509 * anInt354) || ((462991943 * anInt330 * (1648921847 * anInt323) + (aBool353 ? 26 : 22)) > -495986435 * Class254.anInt2742));
			aClass708_340.method14235((byte) 14);
			aClass708_341.method14235((byte) -31);
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(610230198)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) 3))) {
				int i = -2101009827 * class523_sub27_sub6.anInt11639;
				if (i < 1000) {
					class523_sub27_sub6.method8661(607052656);
					if (59 == i || i == 2 || i == 8 || 17 == i || i == 15 || 16 == i || 58 == i)
						aClass708_341.method14236(class523_sub27_sub6, -916148269);
					else
						aClass708_340.method14236(class523_sub27_sub6, -1852280294);
				}
			}
			aClass708_340.method14239(aClass708_342, 1871561141);
			aClass708_341.method14239(aClass708_342, 1871561141);
			if (anInt330 * 462991943 > 1) {
				if (Class283.method5137((byte) 0) && anInt330 * 462991943 > 2)
					Class660.aClass523_Sub27_Sub6_8507 = (Class523_Sub27_Sub6) (aClass708_342.aClass523_8838.aClass523_7064.aClass523_7064);
				else
					Class660.aClass523_Sub27_Sub6_8507 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				aClass523_Sub27_Sub6_333 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				if (462991943 * anInt330 > 2)
					aClass523_Sub27_Sub6_334 = ((Class523_Sub27_Sub6) aClass523_Sub27_Sub6_333.aClass523_7064);
				else
					aClass523_Sub27_Sub6_334 = null;
			} else {
				Class660.aClass523_Sub27_Sub6_8507 = null;
				aClass523_Sub27_Sub6_333 = null;
				aClass523_Sub27_Sub6_334 = null;
			}
			Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(1212185071));
			int i;
			int i_9_;
			if (null != class523_sub39) {
				i = class523_sub39.method16519(1149393435);
				i_9_ = class523_sub39.method16520((byte) 127);
			} else {
				i = Class642.aClass561_8334.method9426((byte) 34);
				i_9_ = Class642.aClass561_8334.method9432(-1256149529);
			}
			if (aBool326) {
				if (Class293.method5251((Class61.aClass633_769.anInterface68_8266), class523_sub39, -746147796)) {
					if (null != aClass523_Sub27_Sub8_328 && i >= Class523_Sub7.anInt10405 * 1464782871 && i <= (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879) && i_9_ >= Class301.anInt3330 * 534142755 && i_9_ <= (534142755 * Class301.anInt3330 + Class705.anInt8818 * 1850758193)) {
						int i_10_ = -1;
						for (int i_11_ = 0; i_11_ < (aClass523_Sub27_Sub8_328.anInt11719 * 1060081949); i_11_++) {
							if (aBool353) {
								int i_12_ = (1648921847 * anInt323 * i_11_ + (class10.anInt76 * -1669009881 + (534142755 * Class301.anInt3330 + 20) + 1));
								if (i_9_ > (i_12_ - class10.anInt76 * -1669009881 - 1) && i_9_ < (i_12_ + class10.anInt80 * -853549931))
									i_10_ = i_11_;
							} else {
								int i_13_ = (i_11_ * (anInt323 * 1648921847) + (31 + Class301.anInt3330 * 534142755));
								if (i_9_ > i_13_ - 13 && i_9_ < 3 + i_13_)
									i_10_ = i_11_;
							}
						}
						if (-1 != i_10_) {
							int i_14_ = 0;
							Class703 class703 = new Class703(aClass523_Sub27_Sub8_328.aClass697_11718);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(-2124312640)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
								if (i_14_ == i_10_) {
									Class381.method6407(class523_sub27_sub6, i, i_9_, true, (byte) 0);
									break;
								}
								i_14_++;
							}
						}
						Class524.method8685(-522212835);
					} else if (i >= -1744502791 * Whirlpool.anInt231 && i <= (BaseVarType.anInt5390 * -345535891 + Whirlpool.anInt231 * -1744502791) && i_9_ >= 14756423 * Class194_Sub17.anInt9941 && (i_9_ <= (2080544711 * Class523_Sub19.anInt10492 + (Class194_Sub17.anInt9941 * 14756423)))) {
						if (!aBool327) {
							int i_15_ = -1;
							for (int i_16_ = 0; i_16_ < anInt330 * 462991943; i_16_++) {
								if (aBool353) {
									int i_17_ = (((462991943 * anInt330 - 1 - i_16_) * (anInt323 * 1648921847)) + ((Class194_Sub17.anInt9941 * 14756423) + 20 + class10.anInt76 * -1669009881 + 1));
									if (i_9_ > (i_17_ - class10.anInt76 * -1669009881 - 1) && i_9_ < (-853549931 * class10.anInt80 + i_17_))
										i_15_ = i_16_;
								} else {
									int i_18_ = (31 + (14756423 * Class194_Sub17.anInt9941) + (1648921847 * anInt323 * (anInt330 * 462991943 - 1 - i_16_)));
									if (i_9_ > i_18_ - 13 && i_9_ < i_18_ + 3)
										i_15_ = i_16_;
								}
							}
							if (-1 != i_15_) {
								int i_19_ = 0;
								Class706 class706 = new Class706(aClass708_342);
								for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(1355460878)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.next())) {
									if (i_19_ == i_15_) {
										Class381.method6407(class523_sub27_sub6, i, i_9_, true, (byte) 0);
										break;
									}
									i_19_++;
								}
							}
							Class524.method8685(-522212835);
						} else {
							int i_20_ = -1;
							for (int i_21_ = 0; i_21_ < -914479837 * anInt336; i_21_++) {
								if (aBool353) {
									int i_22_ = (anInt323 * 1648921847 * i_21_ + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423)) + 1));
									if (i_9_ > (i_22_ - -1669009881 * class10.anInt76 - 1) && i_9_ < (-853549931 * class10.anInt80 + i_22_)) {
										i_20_ = i_21_;
										break;
									}
								} else {
									int i_23_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_21_);
									if (i_9_ > i_23_ - 13 && i_9_ < i_23_ + 3) {
										i_20_ = i_21_;
										break;
									}
								}
							}
							if (i_20_ != -1) {
								int i_24_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(738171469)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_24_ == i_20_) {
										Class381.method6407(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), i, i_9_, true, (byte) 0);
										Class524.method8685(-522212835);
										break;
									}
									i_24_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != aClass523_Sub27_Sub8_328) {
						if (i < Class523_Sub7.anInt10405 * 1464782871 - 10 || i > (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879 + 10) || i_9_ < 534142755 * Class301.anInt3330 - 10 || i_9_ > 10 + (Class705.anInt8818 * 1850758193 + 534142755 * Class301.anInt3330))
							Class529.method8769(1089827);
						else
							bool = true;
					}
					if (!bool) {
						if (i < Whirlpool.anInt231 * -1744502791 - 10 || i > (BaseVarType.anInt5390 * -345535891 + -1744502791 * Whirlpool.anInt231 + 10) || i_9_ < 14756423 * Class194_Sub17.anInt9941 - 10 || i_9_ > (2080544711 * Class523_Sub19.anInt10492 + Class194_Sub17.anInt9941 * 14756423 + 10))
							Class524.method8685(-522212835);
						else if (aBool327) {
							int i_25_ = -1;
							int i_26_ = -1;
							for (int i_27_ = 0; i_27_ < -914479837 * anInt336; i_27_++) {
								if (aBool353) {
									int i_28_ = (1 + (class10.anInt76 * -1669009881 + ((14756423 * Class194_Sub17.anInt9941) + 20)) + 1648921847 * anInt323 * i_27_);
									if (i_9_ > (i_28_ - class10.anInt76 * -1669009881 - 1) && i_9_ < (class10.anInt80 * -853549931 + i_28_)) {
										i_25_ = i_27_;
										i_26_ = i_28_ - (class10.anInt76 * -1669009881) - 1;
										break;
									}
								} else {
									int i_29_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_27_);
									if (i_9_ > i_29_ - 13 && i_9_ < i_29_ + 3) {
										i_25_ = i_27_;
										i_26_ = i_29_ - 13;
										break;
									}
								}
							}
							if (i_25_ != -1) {
								int i_30_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(1386370972)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_30_ == i_25_) {
										if ((1060081949 * class523_sub27_sub8.anInt11719) > 1)
											Class199.method3682(class523_sub27_sub8, i_26_, 399367680);
										break;
									}
									i_30_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class293.method5251((Class61.aClass633_769.anInterface68_8269), class523_sub39, 961469102);
				boolean bool_31_ = Class293.method5251((Class61.aClass633_769.anInterface68_8261), class523_sub39, 1440590366);
				boolean bool_32_ = Class293.method5251((Class61.aClass633_769.anInterface68_8262), class523_sub39, -240965699);
				if ((bool || bool_31_) && ((1 == client.anInt11176 * 247606787 && anInt330 * 462991943 > 2) || Class150.method2520((byte) 26)))
					bool_32_ = true;
				if (bool_32_ && anInt330 * 462991943 > 0) {
					if (client.aClass250_11197 == null && 0 == client.anInt11211 * 569005185)
						Class436.method6874(i, i_9_, 428146220);
					else
						anInt332 = -10775390;
				} else if (bool_31_) {
					if (null != aClass523_Sub27_Sub6_334)
						Class381.method6407(aClass523_Sub27_Sub6_334, i, i_9_, false, (byte) 0);
				} else if (bool) {
					if (null != Class660.aClass523_Sub27_Sub6_8507) {
						boolean bool_33_ = (client.aClass250_11197 != null || client.anInt11211 * 569005185 > 0);
						if (bool_33_) {
							anInt332 = 2142095953;
							BaseVarType.aClass523_Sub27_Sub6_5392 = Class660.aClass523_Sub27_Sub6_8507;
						} else
							Class381.method6407((Class660.aClass523_Sub27_Sub6_8507), i, i_9_, false, (byte) 0);
					} else if (client.aBool11000)
						Class399.method6533(598006326);
				}
				if (null == client.aClass250_11197 && 569005185 * client.anInt11211 == 0) {
					anInt332 = 0;
					BaseVarType.aClass523_Sub27_Sub6_5392 = null;
				}
			}
		}
	}

	static void method970(Class441 class441) {
		aClass441_337.method7086(class441);
	}

	static int method971(Class523_Sub27_Sub8 class523_sub27_sub8, Class10 class10) {
		String string = BodyDefinitions.method10330(class523_sub27_sub8, (short) -28088);
		return class10.method626(string, Class62.aClass148Array772, -1942791872);
	}

	static void method972(int i, int i_34_) {
		if (1 == 1459601073 * anInt332)
			Class381.method6407(BaseVarType.aClass523_Sub27_Sub6_5392, i, i_34_, false, (byte) 0);
		else if (anInt332 * 1459601073 == 2)
			Class436.method6874(i, i_34_, -1393973220);
		anInt332 = 0;
		BaseVarType.aClass523_Sub27_Sub6_5392 = null;
	}

	static void method973(Class523_Sub27_Sub8 class523_sub27_sub8, int i) {
		if (aBool326) {
			Class10 class10 = client.method17697(2064070459);
			int i_35_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.next(768418218)) {
				int i_36_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
				if (i_36_ > i_35_)
					i_35_ = i_36_;
			}
			i_35_ += 8;
			int i_37_ = (1060081949 * class523_sub27_sub8.anInt11719 * (anInt323 * 1648921847) + 21);
			Class705.anInt8818 = (1060081949 * class523_sub27_sub8.anInt11719 * (anInt323 * 1648921847) + (aBool353 ? 26 : 22)) * -1633516335;
			int i_38_ = (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390);
			if (i_38_ + i_35_ > 2141365743 * Class170.anInt1833)
				i_38_ = -1744502791 * Whirlpool.anInt231 - i_35_;
			if (i_38_ < 0)
				i_38_ = 0;
			int i_39_ = aBool353 ? 1 + (20 + class10.anInt76 * -1669009881) : 31;
			int i_40_ = 1 + (i - i_39_ + -1669009881 * class10.anInt76);
			if (i_40_ + i_37_ > -495986435 * Class254.anInt2742)
				i_40_ = -495986435 * Class254.anInt2742 - i_37_;
			if (i_40_ < 0)
				i_40_ = 0;
			Class523_Sub7.anInt10405 = i_38_ * -299145305;
			Class301.anInt3330 = i_40_ * 848152715;
			Class426.anInt4824 = i_35_ * -1979354241;
			aClass523_Sub27_Sub8_328 = class523_sub27_sub8;
		}
	}

	static boolean method974() {
		if (aClass523_Sub27_Sub6_333 == null)
			return false;
		if (-2101009827 * aClass523_Sub27_Sub6_333.anInt11639 >= 2000)
			aClass523_Sub27_Sub6_333.anInt11639 -= 2026588688;
		if (1007 == -2101009827 * aClass523_Sub27_Sub6_333.anInt11639)
			return true;
		return false;
	}

	static boolean method975() {
		if (aClass523_Sub27_Sub6_333 == null)
			return false;
		if (-2101009827 * aClass523_Sub27_Sub6_333.anInt11639 >= 2000)
			aClass523_Sub27_Sub6_333.anInt11639 -= 2026588688;
		if (1007 == -2101009827 * aClass523_Sub27_Sub6_333.anInt11639)
			return true;
		return false;
	}

	static void method976(int i, int i_41_) {
		if (Class523_Sub11.aClass625_10427.aBool8147 || (1 != 462991943 * anInt330 && (!Class318.aBool3431 || 462991943 * anInt330 != 2 || !(aClass523_Sub27_Sub6_333.aString11629.equals(Class39.aClass39_510.method1124((Class53_Sub20.aClass668_10979), (byte) -71)))))) {
			Class10 class10 = client.method17697(1087209549);
			int i_42_ = class10.method597((Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -98)), -1759656773);
			int i_43_;
			if (!aBool327) {
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(799809612)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -101))) {
					int i_44_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
					if (i_44_ > i_42_)
						i_42_ = i_44_;
				}
				i_42_ += 8;
				i_43_ = anInt330 * 462991943 * (anInt323 * 1648921847) + 21;
				Class523_Sub19.anInt10492 = (((aBool353 ? 26 : 22) + anInt330 * 462991943 * (1648921847 * anInt323)) * 1395259895);
			} else {
				for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
					int i_45_;
					if (1 == class523_sub27_sub8.anInt11719 * 1060081949)
						i_45_ = Class269.method4924(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class10, 1003475374);
					else
						i_45_ = Class323.method5727(class523_sub27_sub8, class10, -462034196);
					if (i_45_ > i_42_)
						i_42_ = i_45_;
				}
				i_42_ += 8;
				i_43_ = anInt336 * -914479837 * (1648921847 * anInt323) + 21;
				Class523_Sub19.anInt10492 = 1395259895 * ((aBool353 ? 26 : 22) + anInt323 * 1648921847 * (-914479837 * anInt336));
			}
			i_42_ += 10;
			int i_46_ = i - i_42_ / 2;
			if (i_46_ + i_42_ > Class170.anInt1833 * 2141365743)
				i_46_ = Class170.anInt1833 * 2141365743 - i_42_;
			if (i_46_ < 0)
				i_46_ = 0;
			int i_47_ = i_41_;
			if (i_47_ + i_43_ > -495986435 * Class254.anInt2742)
				i_47_ = -495986435 * Class254.anInt2742 - i_43_;
			if (i_47_ < 0)
				i_47_ = 0;
			Whirlpool.anInt231 = 1963954761 * i_46_;
			Class194_Sub17.anInt9941 = i_47_ * 1068719991;
			BaseVarType.anInt5390 = -2064511131 * i_42_;
			anInt351 = (int) (Math.random() * 24.0) * -972873125;
			aBool326 = true;
		}
	}

	static Class523_Sub22 method977(int i, int i_48_, int i_49_) {
		Class523_Sub22 class523_sub22 = null;
		if (i_49_ == 0)
			class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.WALK_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
		if (1 == i_49_)
			class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.MINIMAP_WALK_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i + class592.localX * 235453015, (byte) -64);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_48_ + 1704054549 * class592.localY, (byte) 113);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 124) ? 1 : 0, -159492164);
		Class104.anInt1269 = -250567387 * i;
		Class104.anInt1270 = -1284332517 * i_48_;
		Class104.aBool1265 = false;
		Class84.method1597(1401020482);
		return class523_sub22;
	}

	public static void method978() {
		Class687_Sub14.aClass148_10858 = null;
		Class78.aClass148_863 = null;
		Class418.aClass148_4696 = null;
		Class375_Sub2.aClass148_10192 = null;
		NetworkStream.aClass148_7480 = null;
		Class699.aClass148_8772 = null;
		Class257.aClass148_2828 = null;
		Class419.aClass148_4724 = null;
		Class659.aClass164_8505 = null;
		Class331.aClass10_3506 = null;
	}

	static void method979(Class523_Sub27_Sub8 class523_sub27_sub8, int i) {
		if (aBool326) {
			Class10 class10 = client.method17697(1768332581);
			int i_50_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.next(768418218)) {
				int i_51_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
				if (i_51_ > i_50_)
					i_50_ = i_51_;
			}
			i_50_ += 8;
			int i_52_ = (1060081949 * class523_sub27_sub8.anInt11719 * (anInt323 * 1648921847) + 21);
			Class705.anInt8818 = (1060081949 * class523_sub27_sub8.anInt11719 * (anInt323 * 1648921847) + (aBool353 ? 26 : 22)) * -1633516335;
			int i_53_ = (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390);
			if (i_53_ + i_50_ > 2141365743 * Class170.anInt1833)
				i_53_ = -1744502791 * Whirlpool.anInt231 - i_50_;
			if (i_53_ < 0)
				i_53_ = 0;
			int i_54_ = aBool353 ? 1 + (20 + class10.anInt76 * -1669009881) : 31;
			int i_55_ = 1 + (i - i_54_ + -1669009881 * class10.anInt76);
			if (i_55_ + i_52_ > -495986435 * Class254.anInt2742)
				i_55_ = -495986435 * Class254.anInt2742 - i_52_;
			if (i_55_ < 0)
				i_55_ = 0;
			Class523_Sub7.anInt10405 = i_53_ * -299145305;
			Class301.anInt3330 = i_55_ * 848152715;
			Class426.anInt4824 = i_50_ * -1979354241;
			aClass523_Sub27_Sub8_328 = class523_sub27_sub8;
		}
	}

	static void method980(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (null != class523_sub27_sub6) {
			aClass708_342.method14236(class523_sub27_sub6, -30259250);
			anInt330 += -308717705;
			Object object = null;
			Class523_Sub27_Sub8 class523_sub27_sub8;
			if (!class523_sub27_sub6.aBool11638 && !"".equals(class523_sub27_sub6.aString11637)) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				for (class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass14_338.getFromIndex(l); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (null == class523_sub27_sub8) {
					class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass209_335.method3767(l);
					if (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637))
						class523_sub27_sub8 = null;
					if (class523_sub27_sub8 == null)
						class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
					aClass14_338.method738(class523_sub27_sub8, l);
					anInt336 += -599051637;
				}
			} else {
				class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
				anInt336 += -599051637;
			}
			if (class523_sub27_sub8.method18084(class523_sub27_sub6, (byte) 1))
				Class308.method5598(class523_sub27_sub8, -1343567956);
		}
	}

	public static void method981() {
		Class253.method4544(2019991621);
	}

	static void method982(Class435 class435, Class441 class441, int i, int i_56_) {
		if (null == aClass441_350)
			aClass441_350 = new Class441(class441);
		else
			aClass441_350.method7086(class441);
		aClass435_352.method6803(class435);
		anInt355 = i * 149314701;
		anInt349 = 1878910389 * i_56_;
	}

	static void method983() {
		if (null != aClass523_Sub27_Sub8_328) {
			aClass523_Sub27_Sub8_328 = null;
			Class504.method8225(1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330, Class426.anInt4824 * 805194879, Class705.anInt8818 * 1850758193, (byte) -89);
		}
	}

	static void method984() {
		if (null != aClass523_Sub27_Sub8_328) {
			aClass523_Sub27_Sub8_328 = null;
			Class504.method8225(1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330, Class426.anInt4824 * 805194879, Class705.anInt8818 * 1850758193, (byte) -99);
		}
	}

	static long method985(Interface61 interface61, int i, int i_57_) {
		long l = 4194304L;
		long l_58_ = -9223372036854775808L;
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(1569145950).getDefinition(interface61.method401(-770473736), (byte) -87));
		long l_59_ = (long) (i | i_57_ << 7 | interface61.method69(798095973) << 14 | interface61.method390(1259048815) << 20 | 0x40000000);
		if (0 == class602.anInt7874 * -344567467)
			l_59_ |= l_58_;
		if (591624555 * class602.anInt7862 == 1)
			l_59_ |= l;
		l_59_ |= (long) interface61.method401(-770473736) << 32;
		return l_59_;
	}

	static void method986() {
		if (null != aClass523_Sub27_Sub8_328) {
			aClass523_Sub27_Sub8_328 = null;
			Class504.method8225(1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330, Class426.anInt4824 * 805194879, Class705.anInt8818 * 1850758193, (byte) -102);
		}
	}

	static int[] method987(Class523_Sub27_Sub6 class523_sub27_sub6) {
		int[] is = null;
		if (Class290.method5215(-2101009827 * class523_sub27_sub6.anInt11639, 762074413))
			is = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((int) (7768112170675051057L * class523_sub27_sub6.aLong11632), (byte) 38))).anIntArray164;
		else if (615428637 * class523_sub27_sub6.anInt11631 != -1)
			is = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(615428637 * class523_sub27_sub6.anInt11631, (byte) -17))).anIntArray164;
		else if (Class549.method9107((-2101009827 * class523_sub27_sub6.anInt11639), (byte) 1)) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.getFromIndex((long) (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L))));
			if (null != class523_sub28) {
				NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
				NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
				if (null != class300.anIntArray3286)
					class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 27);
				if (null != class300)
					is = class300.anIntArray3303;
			}
		} else if (Class523_Sub20.method16098((-2101009827 * (class523_sub27_sub6.anInt11639)), -1246650341)) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1840905366).getDefinition((int) ((class523_sub27_sub6.aLong11632 * 7768112170675051057L) >>> 32 & 0x7fffffffL), (byte) -12)));
			if (class602.anIntArray7912 != null)
				class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 572478540);
			if (class602 != null)
				is = class602.anIntArray7925;
		}
		return is;
	}

	static void method988(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (null != class523_sub27_sub6) {
			aClass708_342.method14236(class523_sub27_sub6, -802682447);
			anInt330 += -308717705;
			Object object = null;
			Class523_Sub27_Sub8 class523_sub27_sub8;
			if (!class523_sub27_sub6.aBool11638 && !"".equals(class523_sub27_sub6.aString11637)) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				for (class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass14_338.getFromIndex(l); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (null == class523_sub27_sub8) {
					class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass209_335.method3767(l);
					if (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637))
						class523_sub27_sub8 = null;
					if (class523_sub27_sub8 == null)
						class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
					aClass14_338.method738(class523_sub27_sub8, l);
					anInt336 += -599051637;
				}
			} else {
				class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
				anInt336 += -599051637;
			}
			if (class523_sub27_sub8.method18084(class523_sub27_sub6, (byte) 1))
				Class308.method5598(class523_sub27_sub8, -1851619245);
		}
	}

	static void method989(Class178 class178) {
		int i = -1744502791 * Whirlpool.anInt231;
		int i_60_ = Class194_Sub17.anInt9941 * 14756423;
		int i_61_ = -345535891 * BaseVarType.anInt5390;
		int i_62_ = Class523_Sub19.anInt10492 * 2080544711 - 3;
		int i_63_ = 20;
		if (null == Class659.aClass164_8505 || null == Class331.aClass10_3506) {
			Class659.aClass164_8505 = (Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, 1212810739 * Class687_Sub2.anInt10826, true, true, -1976843944));
			Class331.aClass10_3506 = Class491.aClass423_5536.method6688((client.anInterface50_11044), (Class687_Sub2.anInt10826 * 1212810739), (byte) -61);
			if (null != Class659.aClass164_8505 && Class331.aClass10_3506 != null) {
				Class524.method8685(-522212835);
				int i_64_ = i_61_ / 2 + i;
				if (i_61_ + i_64_ > Class170.anInt1833 * 2141365743)
					i_64_ = 2141365743 * Class170.anInt1833 - i_61_;
				if (i_64_ < 0)
					i_64_ = 0;
				Class436.method6874(i_64_, 14756423 * Class194_Sub17.anInt9941, 937398960);
				return;
			}
		}
		Class164 class164;
		if (null == Class659.aClass164_8505 || null == Class331.aClass10_3506)
			class164 = Class34.aClass164_319;
		else
			class164 = Class659.aClass164_8505;
		Class10 class10 = client.method17697(1972744964);
		Class683.method13865(class178, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_63_, class164, class10, Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -67), 501662066);
		int i_65_ = 255 - 148318499 * Class392.anInt4036 - 597769683 * anInt351;
		if (i_65_ < 0)
			i_65_ = 0;
		int i_66_ = Class642.aClass561_8334.method9426((byte) -94);
		int i_67_ = Class642.aClass561_8334.method9432(-2027672459);
		if (!aBool327) {
			int i_68_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(643477000)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -18))) {
				int i_69_ = (anInt323 * 1648921847 * (462991943 * anInt330 - 1 - i_68_) + (1 + (i_63_ + i_60_ + class10.anInt76 * -1669009881)));
				if (i_66_ > Whirlpool.anInt231 * -1744502791 && i_66_ < (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390) && i_67_ > i_69_ - class10.anInt76 * -1669009881 - 1 && i_67_ < -853549931 * class10.anInt80 + i_69_ && class523_sub27_sub6.aBool11635)
					class178.method3193(-1744502791 * Whirlpool.anInt231, i_69_ - -1669009881 * class10.anInt76, BaseVarType.anInt5390 * -345535891, anInt323 * 1648921847, (i_65_ << 24 | -627853313 * Class17.anInt192), 1);
				i_68_++;
			}
		} else {
			int i_70_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
				int i_71_ = (i_70_ * (1648921847 * anInt323) + (1 + (i_63_ + i_60_ + class10.anInt76 * -1669009881)));
				if (i_66_ > Whirlpool.anInt231 * -1744502791 && i_66_ < (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390) && i_67_ > i_71_ - -1669009881 * class10.anInt76 - 1 && i_67_ < i_71_ + class10.anInt80 * -853549931 && (1060081949 * class523_sub27_sub8.anInt11719 > 1 || (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).aBool11635)))
					class178.method3193(Whirlpool.anInt231 * -1744502791, i_71_ - -1669009881 * class10.anInt76, -345535891 * BaseVarType.anInt5390, 1648921847 * anInt323, (i_65_ << 24 | -627853313 * Class17.anInt192), 1);
				i_70_++;
			}
			if (aClass523_Sub27_Sub8_328 != null) {
				Class683.method13865(class178, Class523_Sub7.anInt10405 * 1464782871, 534142755 * Class301.anInt3330, 805194879 * Class426.anInt4824, 1850758193 * Class705.anInt8818, i_63_, class164, class10, aClass523_Sub27_Sub8_328.aString11720, -405291507);
				i_70_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218)) {
					int i_72_ = (i_70_ * (1648921847 * anInt323) + (534142755 * Class301.anInt3330 + i_63_ + -1669009881 * class10.anInt76 + 1));
					if (i_66_ > Class523_Sub7.anInt10405 * 1464782871 && i_66_ < (Class426.anInt4824 * 805194879 + 1464782871 * Class523_Sub7.anInt10405) && i_67_ > i_72_ - -1669009881 * class10.anInt76 - 1 && i_67_ < i_72_ + class10.anInt80 * -853549931 && class523_sub27_sub6.aBool11635)
						class178.method3193(Class523_Sub7.anInt10405 * 1464782871, i_72_ - class10.anInt76 * -1669009881, 805194879 * Class426.anInt4824, 1648921847 * anInt323, i_65_ << 24 | Class17.anInt192 * -627853313, 1);
					i_70_++;
				}
				Class297.method5303(class178, Class523_Sub7.anInt10405 * 1464782871, 534142755 * Class301.anInt3330, 805194879 * Class426.anInt4824, Class705.anInt8818 * 1850758193, i_63_, (short) 18788);
			}
		}
		Class297.method5303(class178, -1744502791 * Whirlpool.anInt231, 14756423 * Class194_Sub17.anInt9941, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i_63_, (short) -12505);
		if (!aBool327) {
			int i_73_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(702313632)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -95))) {
				int i_74_ = (-1669009881 * class10.anInt76 + (i_60_ + i_63_) + 1 + (anInt330 * 462991943 - 1 - i_73_) * (anInt323 * 1648921847));
				Class676_Sub1.method16780(i_66_, i_67_, i, i_60_, i_61_, i_62_, i_74_, class523_sub27_sub6, class164, class10, 1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff, Class328_Sub3_Sub3.anInt11591 * -391136693 | ~0xffffff, 162873804);
				i_73_++;
			}
		} else {
			int i_75_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
				int i_76_ = (14756423 * Class194_Sub17.anInt9941 + i_63_ + -1669009881 * class10.anInt76 + 1 + i_75_ * (anInt323 * 1648921847));
				if (1 == 1060081949 * class523_sub27_sub8.anInt11719)
					Class676_Sub1.method16780(i_66_, i_67_, Whirlpool.anInt231 * -1744502791, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_76_, ((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class164, class10, (1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), 162873804);
				else
					Class660.method10861(i_66_, i_67_, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i_76_, class523_sub27_sub8, class164, class10, (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), -1579629926);
				i_75_++;
			}
			if (null != aClass523_Sub27_Sub8_328) {
				i_75_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218)) {
					int i_77_ = (1 + (class10.anInt76 * -1669009881 + (i_63_ + Class301.anInt3330 * 534142755)) + 1648921847 * anInt323 * i_75_);
					Class676_Sub1.method16780(i_66_, i_67_, 1464782871 * Class523_Sub7.anInt10405, Class301.anInt3330 * 534142755, 805194879 * Class426.anInt4824, Class705.anInt8818 * 1850758193, i_77_, class523_sub27_sub6, class164, class10, (1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), 162873804);
					i_75_++;
				}
			}
		}
	}

	static boolean method990(int i) {
		return (44 == i || 45 == i || 46 == i || 47 == i || 48 == i || 49 == i || i == 50 || 51 == i || i == 52 || 53 == i || i == 15);
	}

	static boolean method991(Interface68 interface68, Class523_Sub39 class523_sub39) {
		return (interface68 != null && interface68.method435(class523_sub39, client.anInterface64Array11194, client.anInt11184 * -751939039, Class481.aClass551_5473, (byte) -44));
	}

	static void method992() {
		if (-2131499789 * client.anInt11070 < 0) {
			Class10 class10 = client.method17697(1776654339);
			if (!aBool326)
				aBool327 = ((-2045228509 * anInt354 != -1 && anInt330 * 462991943 >= -2045228509 * anInt354) || ((462991943 * anInt330 * (1648921847 * anInt323) + (aBool353 ? 26 : 22)) > -495986435 * Class254.anInt2742));
			aClass708_340.method14235((byte) -47);
			aClass708_341.method14235((byte) 27);
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(750220541)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -2))) {
				int i = -2101009827 * class523_sub27_sub6.anInt11639;
				if (i < 1000) {
					class523_sub27_sub6.method8661(607052656);
					if (59 == i || i == 2 || i == 8 || 17 == i || i == 15 || 16 == i || 58 == i)
						aClass708_341.method14236(class523_sub27_sub6, 985810271);
					else
						aClass708_340.method14236(class523_sub27_sub6, -768018170);
				}
			}
			aClass708_340.method14239(aClass708_342, 1871561141);
			aClass708_341.method14239(aClass708_342, 1871561141);
			if (anInt330 * 462991943 > 1) {
				if (Class283.method5137((byte) 0) && anInt330 * 462991943 > 2)
					Class660.aClass523_Sub27_Sub6_8507 = (Class523_Sub27_Sub6) (aClass708_342.aClass523_8838.aClass523_7064.aClass523_7064);
				else
					Class660.aClass523_Sub27_Sub6_8507 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				aClass523_Sub27_Sub6_333 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				if (462991943 * anInt330 > 2)
					aClass523_Sub27_Sub6_334 = ((Class523_Sub27_Sub6) aClass523_Sub27_Sub6_333.aClass523_7064);
				else
					aClass523_Sub27_Sub6_334 = null;
			} else {
				Class660.aClass523_Sub27_Sub6_8507 = null;
				aClass523_Sub27_Sub6_333 = null;
				aClass523_Sub27_Sub6_334 = null;
			}
			Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(713261067));
			int i;
			int i_78_;
			if (null != class523_sub39) {
				i = class523_sub39.method16519(-1979785261);
				i_78_ = class523_sub39.method16520((byte) 127);
			} else {
				i = Class642.aClass561_8334.method9426((byte) -11);
				i_78_ = Class642.aClass561_8334.method9432(-2066435689);
			}
			if (aBool326) {
				if (Class293.method5251((Class61.aClass633_769.anInterface68_8266), class523_sub39, 450102971)) {
					if (null != aClass523_Sub27_Sub8_328 && i >= Class523_Sub7.anInt10405 * 1464782871 && i <= (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879) && i_78_ >= Class301.anInt3330 * 534142755 && i_78_ <= (534142755 * Class301.anInt3330 + Class705.anInt8818 * 1850758193)) {
						int i_79_ = -1;
						for (int i_80_ = 0; i_80_ < (aClass523_Sub27_Sub8_328.anInt11719 * 1060081949); i_80_++) {
							if (aBool353) {
								int i_81_ = (1648921847 * anInt323 * i_80_ + (class10.anInt76 * -1669009881 + (534142755 * Class301.anInt3330 + 20) + 1));
								if (i_78_ > (i_81_ - class10.anInt76 * -1669009881 - 1) && i_78_ < i_81_ + (class10.anInt80 * -853549931))
									i_79_ = i_80_;
							} else {
								int i_82_ = (i_80_ * (anInt323 * 1648921847) + (31 + Class301.anInt3330 * 534142755));
								if (i_78_ > i_82_ - 13 && i_78_ < 3 + i_82_)
									i_79_ = i_80_;
							}
						}
						if (-1 != i_79_) {
							int i_83_ = 0;
							Class703 class703 = new Class703(aClass523_Sub27_Sub8_328.aClass697_11718);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(1826105397)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
								if (i_83_ == i_79_) {
									Class381.method6407(class523_sub27_sub6, i, i_78_, true, (byte) 0);
									break;
								}
								i_83_++;
							}
						}
						Class524.method8685(-522212835);
					} else if (i >= -1744502791 * Whirlpool.anInt231 && i <= (BaseVarType.anInt5390 * -345535891 + Whirlpool.anInt231 * -1744502791) && i_78_ >= 14756423 * Class194_Sub17.anInt9941 && (i_78_ <= (2080544711 * Class523_Sub19.anInt10492 + (Class194_Sub17.anInt9941 * 14756423)))) {
						if (!aBool327) {
							int i_84_ = -1;
							for (int i_85_ = 0; i_85_ < anInt330 * 462991943; i_85_++) {
								if (aBool353) {
									int i_86_ = (((462991943 * anInt330 - 1 - i_85_) * (anInt323 * 1648921847)) + ((Class194_Sub17.anInt9941 * 14756423) + 20 + class10.anInt76 * -1669009881 + 1));
									if (i_78_ > i_86_ - (class10.anInt76 * -1669009881) - 1 && i_78_ < (-853549931 * class10.anInt80) + i_86_)
										i_84_ = i_85_;
								} else {
									int i_87_ = (31 + (14756423 * Class194_Sub17.anInt9941) + (1648921847 * anInt323 * (anInt330 * 462991943 - 1 - i_85_)));
									if (i_78_ > i_87_ - 13 && i_78_ < i_87_ + 3)
										i_84_ = i_85_;
								}
							}
							if (-1 != i_84_) {
								int i_88_ = 0;
								Class706 class706 = new Class706(aClass708_342);
								for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(1989899361)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.next())) {
									if (i_88_ == i_84_) {
										Class381.method6407(class523_sub27_sub6, i, i_78_, true, (byte) 0);
										break;
									}
									i_88_++;
								}
							}
							Class524.method8685(-522212835);
						} else {
							int i_89_ = -1;
							for (int i_90_ = 0; i_90_ < -914479837 * anInt336; i_90_++) {
								if (aBool353) {
									int i_91_ = (anInt323 * 1648921847 * i_90_ + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423)) + 1));
									if (i_78_ > i_91_ - (-1669009881 * class10.anInt76) - 1 && (i_78_ < (-853549931 * class10.anInt80 + i_91_))) {
										i_89_ = i_90_;
										break;
									}
								} else {
									int i_92_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_90_);
									if (i_78_ > i_92_ - 13 && i_78_ < i_92_ + 3) {
										i_89_ = i_90_;
										break;
									}
								}
							}
							if (i_89_ != -1) {
								int i_93_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(1864550100)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_93_ == i_89_) {
										Class381.method6407(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), i, i_78_, true, (byte) 0);
										Class524.method8685(-522212835);
										break;
									}
									i_93_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != aClass523_Sub27_Sub8_328) {
						if (i < Class523_Sub7.anInt10405 * 1464782871 - 10 || i > (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879 + 10) || i_78_ < 534142755 * Class301.anInt3330 - 10 || i_78_ > 10 + (Class705.anInt8818 * 1850758193 + 534142755 * Class301.anInt3330))
							Class529.method8769(-1729266638);
						else
							bool = true;
					}
					if (!bool) {
						if (i < Whirlpool.anInt231 * -1744502791 - 10 || i > (BaseVarType.anInt5390 * -345535891 + -1744502791 * Whirlpool.anInt231 + 10) || i_78_ < 14756423 * Class194_Sub17.anInt9941 - 10 || i_78_ > (2080544711 * Class523_Sub19.anInt10492 + Class194_Sub17.anInt9941 * 14756423 + 10))
							Class524.method8685(-522212835);
						else if (aBool327) {
							int i_94_ = -1;
							int i_95_ = -1;
							for (int i_96_ = 0; i_96_ < -914479837 * anInt336; i_96_++) {
								if (aBool353) {
									int i_97_ = (1 + (class10.anInt76 * -1669009881 + ((14756423 * Class194_Sub17.anInt9941) + 20)) + 1648921847 * anInt323 * i_96_);
									if (i_78_ > i_97_ - (class10.anInt76 * -1669009881) - 1 && i_78_ < (class10.anInt80 * -853549931) + i_97_) {
										i_94_ = i_96_;
										i_95_ = i_97_ - (class10.anInt76 * -1669009881) - 1;
										break;
									}
								} else {
									int i_98_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_96_);
									if (i_78_ > i_98_ - 13 && i_78_ < i_98_ + 3) {
										i_94_ = i_96_;
										i_95_ = i_98_ - 13;
										break;
									}
								}
							}
							if (i_94_ != -1) {
								int i_99_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(-1911039601)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_99_ == i_94_) {
										if ((1060081949 * class523_sub27_sub8.anInt11719) > 1)
											Class199.method3682(class523_sub27_sub8, i_95_, 399367680);
										break;
									}
									i_99_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class293.method5251((Class61.aClass633_769.anInterface68_8269), class523_sub39, 280349842);
				boolean bool_100_ = Class293.method5251((Class61.aClass633_769.anInterface68_8261), class523_sub39, 1825502243);
				boolean bool_101_ = Class293.method5251((Class61.aClass633_769.anInterface68_8262), class523_sub39, -198966147);
				if ((bool || bool_100_) && ((1 == client.anInt11176 * 247606787 && anInt330 * 462991943 > 2) || Class150.method2520((byte) 108)))
					bool_101_ = true;
				if (bool_101_ && anInt330 * 462991943 > 0) {
					if (client.aClass250_11197 == null && 0 == client.anInt11211 * 569005185)
						Class436.method6874(i, i_78_, 127623183);
					else
						anInt332 = -10775390;
				} else if (bool_100_) {
					if (null != aClass523_Sub27_Sub6_334)
						Class381.method6407(aClass523_Sub27_Sub6_334, i, i_78_, false, (byte) 0);
				} else if (bool) {
					if (null != Class660.aClass523_Sub27_Sub6_8507) {
						boolean bool_102_ = (client.aClass250_11197 != null || client.anInt11211 * 569005185 > 0);
						if (bool_102_) {
							anInt332 = 2142095953;
							BaseVarType.aClass523_Sub27_Sub6_5392 = Class660.aClass523_Sub27_Sub6_8507;
						} else
							Class381.method6407((Class660.aClass523_Sub27_Sub6_8507), i, i_78_, false, (byte) 0);
					} else if (client.aBool11000)
						Class399.method6533(694948426);
				}
				if (null == client.aClass250_11197 && 569005185 * client.anInt11211 == 0) {
					anInt332 = 0;
					BaseVarType.aClass523_Sub27_Sub6_5392 = null;
				}
			}
		}
	}

	static void method993(InterfaceComponentDefinitions class250, int i, int i_103_) {
		if (client.aBool11000) {
			Class76 class76 = ((Class76) (-1 != 1180578917 * Class13.anInt173 ? Class60.aClass53_Sub22_766.getDefinition(1180578917 * Class13.anInt173, (byte) 66) : null));
			if (client.method17252(class250).method15970(888711072) && 0 != (Class570.anInt7658 * 382935923 & 0x20) && (null == class76 || (class250.method4441(Class13.anInt173 * 1180578917, class76.anInt850 * -1100663923, 484295638) != -1100663923 * class76.anInt850)))
				Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(class250.aString2639).toString(), Class684.anInt8664 * 2088669163, 58, -1878986101 * class250.anInt2680, 0L, 234012635 * class250.anInt2709, -1363815505 * class250.interfaceHash, true, false, (long) (234012635 * class250.anInt2709 << 0 | (-1363815505 * class250.interfaceHash)), false, (byte) -125);
		}
		for (int i_104_ = 9; i_104_ >= 5; i_104_--) {
			String string = Class512.method8576(class250, i_104_, (byte) 4);
			if (null != string)
				Class463.method7523(string, class250.aString2639, VarDomainType.method7634(class250, i_104_, -621879404), 1007, class250.anInt2680 * -1878986101, (long) (i_104_ + 1), 234012635 * class250.anInt2709, -1363815505 * class250.interfaceHash, true, false, (long) (class250.anInt2709 * 234012635 << 0 | (class250.interfaceHash * -1363815505)), false, (byte) 59);
		}
		String string = Class188.method3596(class250, 418833819);
		if (null != string)
			Class463.method7523(string, class250.aString2639, class250.anInt2629 * -1223189369, 25, class250.anInt2680 * -1878986101, 0L, class250.anInt2709 * 234012635, class250.interfaceHash * -1363815505, true, false, (long) (class250.anInt2709 * 234012635 << 0 | class250.interfaceHash * -1363815505), false, (byte) 28);
		for (int i_105_ = 4; i_105_ >= 0; i_105_--) {
			String string_106_ = Class512.method8576(class250, i_105_, (byte) 4);
			if (null != string_106_)
				Class463.method7523(string_106_, class250.aString2639, VarDomainType.method7634(class250, i_105_, 851420320), 57, class250.anInt2680 * -1878986101, (long) (i_105_ + 1), class250.anInt2709 * 234012635, -1363815505 * class250.interfaceHash, true, false, (long) (234012635 * class250.anInt2709 << 0 | (-1363815505 * class250.interfaceHash)), false, (byte) 37);
		}
		if (client.method17252(class250).method15979(1231556914)) {
			if (null != class250.aString2641)
				Class463.method7523(class250.aString2641, "", -1, 30, -1878986101 * class250.anInt2680, 0L, 234012635 * class250.anInt2709, class250.interfaceHash * -1363815505, true, false, (long) (234012635 * class250.anInt2709 << 0 | (-1363815505 * class250.interfaceHash)), false, (byte) -16);
			else
				Class463.method7523(Class39.aClass39_393.method1124((Class53_Sub20.aClass668_10979), (byte) -50), "", -1, 30, class250.anInt2680 * -1878986101, 0L, 234012635 * class250.anInt2709, -1363815505 * class250.interfaceHash, true, false, (long) (class250.anInt2709 * 234012635 << 0 | class250.interfaceHash * -1363815505), false, (byte) -110);
		}
	}

	static int[] method994(Class523_Sub27_Sub6 class523_sub27_sub6) {
		int[] is = null;
		if (Class290.method5215(-2101009827 * class523_sub27_sub6.anInt11639, 2145488203))
			is = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((int) (7768112170675051057L * class523_sub27_sub6.aLong11632), (byte) -5))).anIntArray164;
		else if (615428637 * class523_sub27_sub6.anInt11631 != -1)
			is = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(615428637 * class523_sub27_sub6.anInt11631, (byte) 22))).anIntArray164;
		else if (Class549.method9107((-2101009827 * class523_sub27_sub6.anInt11639), (byte) 1)) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.getFromIndex((long) (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L))));
			if (null != class523_sub28) {
				NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
				NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
				if (null != class300.anIntArray3286)
					class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 19);
				if (null != class300)
					is = class300.anIntArray3303;
			}
		} else if (Class523_Sub20.method16098((-2101009827 * (class523_sub27_sub6.anInt11639)), -1714634364)) {
			Class602 class602 = ((Class602) (client.aClass505_11019.method8244(926163587).getDefinition((int) ((class523_sub27_sub6.aLong11632 * 7768112170675051057L) >>> 32 & 0x7fffffffL), (byte) 19)));
			if (class602.anIntArray7912 != null)
				class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, 336842419);
			if (class602 != null)
				is = class602.anIntArray7925;
		}
		return is;
	}

	static void method995(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1) {
		if (class647_sub1_sub3_sub1 instanceof NPC) {
			NPC class647_sub1_sub3_sub1_sub1 = (NPC) class647_sub1_sub3_sub1;
			if (null != class647_sub1_sub3_sub1_sub1.aClass300_12175)
				Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.player.aByte10821) != (class647_sub1_sub3_sub1_sub1.aByte10821)), 717398932);
		} else if (class647_sub1_sub3_sub1 instanceof Player) {
			Player class647_sub1_sub3_sub1_sub2 = (Player) class647_sub1_sub3_sub1;
			Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.player.aByte10821) != class647_sub1_sub3_sub1_sub2.aByte10821), (short) 11124);
		}
	}

	static void method996(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1) {
		if (class647_sub1_sub3_sub1 instanceof NPC) {
			NPC class647_sub1_sub3_sub1_sub1 = (NPC) class647_sub1_sub3_sub1;
			if (null != class647_sub1_sub3_sub1_sub1.aClass300_12175)
				Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.player.aByte10821) != (class647_sub1_sub3_sub1_sub1.aByte10821)), 1037125138);
		} else if (class647_sub1_sub3_sub1 instanceof Player) {
			Player class647_sub1_sub3_sub1_sub2 = (Player) class647_sub1_sub3_sub1;
			Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.player.aByte10821) != class647_sub1_sub3_sub1_sub2.aByte10821), (short) -4548);
		}
	}

	static void method997(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (null != class523_sub27_sub6) {
			aClass708_342.method14236(class523_sub27_sub6, -1922692274);
			anInt330 += -308717705;
			Object object = null;
			Class523_Sub27_Sub8 class523_sub27_sub8;
			if (!class523_sub27_sub6.aBool11638 && !"".equals(class523_sub27_sub6.aString11637)) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				for (class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass14_338.getFromIndex(l); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (null == class523_sub27_sub8) {
					class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass209_335.method3767(l);
					if (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637))
						class523_sub27_sub8 = null;
					if (class523_sub27_sub8 == null)
						class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
					aClass14_338.method738(class523_sub27_sub8, l);
					anInt336 += -599051637;
				}
			} else {
				class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
				anInt336 += -599051637;
			}
			if (class523_sub27_sub8.method18084(class523_sub27_sub6, (byte) 1))
				Class308.method5598(class523_sub27_sub8, -401971572);
		}
	}

	static String method998(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (null == class523_sub27_sub6.aString11633 || class523_sub27_sub6.aString11633.length() == 0) {
			if (class523_sub27_sub6.aString11637 != null && class523_sub27_sub6.aString11637.length() > 0)
				return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -47)).append(class523_sub27_sub6.aString11637).toString();
			return class523_sub27_sub6.aString11629;
		}
		if (class523_sub27_sub6.aString11637 != null && class523_sub27_sub6.aString11637.length() > 0)
			return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -42)).append(class523_sub27_sub6.aString11637).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -21)).append(class523_sub27_sub6.aString11633).toString();
		return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124(Class53_Sub20.aClass668_10979, (byte) -23)).append(class523_sub27_sub6.aString11633).toString();
	}

	static void method999(Class178 class178) {
		if (null != aClass441_350) {
			class178.method3124(aClass441_350);
			class178.method3300(aClass435_352);
			class178.method3378(anInt346 * -1196807433, -1269933459 * anInt347, (anInt346 * -1196807433 + -1264269755 * anInt355), (anInt347 * -1269933459 + -831151971 * anInt349));
			class178.method3208(-1196807433 * anInt346, anInt347 * -1269933459, -1264269755 * anInt355, anInt349 * -831151971);
		}
	}

	static void method1000(Class178 class178) {
		if (null != aClass441_350) {
			class178.method3124(aClass441_350);
			class178.method3300(aClass435_352);
			class178.method3378(anInt346 * -1196807433, -1269933459 * anInt347, (anInt346 * -1196807433 + -1264269755 * anInt355), (anInt347 * -1269933459 + -831151971 * anInt349));
			class178.method3208(-1196807433 * anInt346, anInt347 * -1269933459, -1264269755 * anInt355, anInt349 * -831151971);
		}
	}

	static void method1001(Class523_Sub27_Sub8 class523_sub27_sub8) {
		boolean bool = false;
		class523_sub27_sub8.method16154(-261651695);
		for (Class523_Sub27_Sub8 class523_sub27_sub8_107_ = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8_107_ != null; class523_sub27_sub8_107_ = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
			if (Class605.method9962(class523_sub27_sub8.method18083(-718052061), class523_sub27_sub8_107_.method18083(573905722), -1801586972)) {
				Class379.method6398(class523_sub27_sub8, class523_sub27_sub8_107_, -474952314);
				bool = true;
				break;
			}
		}
		if (!bool)
			aClass697_339.removeFromQueue(class523_sub27_sub8, (byte) -51);
	}

	static long method1002(Interface61 interface61, int i, int i_108_) {
		long l = 4194304L;
		long l_109_ = -9223372036854775808L;
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(1083969954).getDefinition(interface61.method401(-770473736), (byte) 28));
		long l_110_ = (long) (i | i_108_ << 7 | interface61.method69(-109736411) << 14 | interface61.method390(1259048815) << 20 | 0x40000000);
		if (0 == class602.anInt7874 * -344567467)
			l_110_ |= l_109_;
		if (591624555 * class602.anInt7862 == 1)
			l_110_ |= l;
		l_110_ |= (long) interface61.method401(-770473736) << 32;
		return l_110_;
	}

	static long method1003(Interface61 interface61, int i, int i_111_) {
		long l = 4194304L;
		long l_112_ = -9223372036854775808L;
		Class602 class602 = ((Class602) client.aClass505_11019.method8244(1281581432).getDefinition(interface61.method401(-770473736), (byte) -54));
		long l_113_ = (long) (i | i_111_ << 7 | interface61.method69(1513068664) << 14 | interface61.method390(1259048815) << 20 | 0x40000000);
		if (0 == class602.anInt7874 * -344567467)
			l_113_ |= l_112_;
		if (591624555 * class602.anInt7862 == 1)
			l_113_ |= l;
		l_113_ |= (long) interface61.method401(-770473736) << 32;
		return l_113_;
	}

	static void method1004(Class523_Sub27_Sub8 class523_sub27_sub8) {
		boolean bool = false;
		class523_sub27_sub8.method16154(-261651695);
		for (Class523_Sub27_Sub8 class523_sub27_sub8_114_ = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8_114_ != null; class523_sub27_sub8_114_ = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
			if (Class605.method9962(class523_sub27_sub8.method18083(-1214555717), class523_sub27_sub8_114_.method18083(-26880922), -1801586972)) {
				Class379.method6398(class523_sub27_sub8, class523_sub27_sub8_114_, -1794788007);
				bool = true;
				break;
			}
		}
		if (!bool)
			aClass697_339.removeFromQueue(class523_sub27_sub8, (byte) -81);
	}

	static void method1005(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (!aBool326) {
			class523_sub27_sub6.method8661(607052656);
			anInt330 -= -308717705;
			if (!class523_sub27_sub6.aBool11638) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				Class523_Sub27_Sub8 class523_sub27_sub8;
				for (class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass14_338.getFromIndex(l); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (class523_sub27_sub8 != null && class523_sub27_sub8.method18085(class523_sub27_sub6, -1564215867))
					Class308.method5598(class523_sub27_sub8, -494611952);
			} else {
				for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
					if (class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)) {
						boolean bool = false;
						for (Class523_Sub27_Sub6 class523_sub27_sub6_115_ = ((Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.first(-1426448868)); class523_sub27_sub6_115_ != null; class523_sub27_sub6_115_ = ((Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.next(768418218))) {
							if (class523_sub27_sub6_115_ == class523_sub27_sub6) {
								if (class523_sub27_sub8.method18085(class523_sub27_sub6, -1564215867))
									Class308.method5598(class523_sub27_sub8, -934203575);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static void method1006(int i) {
		for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass708_342.method14240(1141981956); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -8))) {
			if (Class263.method4741((-2101009827 * class523_sub27_sub6.anInt11639), 2037124381) && i == class523_sub27_sub6.anInt11640 * -967967353 >> 16)
				Class232.method4256(class523_sub27_sub6, (byte) 99);
		}
	}

	Class36() throws Throwable {
		throw new Error();
	}

	static void method1007(Class178 class178, int i, int i_116_, int i_117_, int i_118_, int i_119_) {
		if ((Class699.aClass148_8772 == null || Class375_Sub2.aClass148_10192 == null || null == Class257.aClass148_2828) && Class523_Sub8.aClass472_10406.method7650(((Class194_Sub13.anInt9919) * -18041369), 1534713776) && Class523_Sub8.aClass472_10406.method7650(((Class523_Sub18_Sub11.anInt11704) * -1663848907), 744685900) && Class523_Sub8.aClass472_10406.method7650(Class308.anInt3364 * -1743511611, -761462678)) {
			Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, (-1663848907 * Class523_Sub18_Sub11.anInt11704), 0);
			Class375_Sub2.aClass148_10192 = class178.method3104(class175, true);
			class175.method2956();
			NetworkStream.aClass148_7480 = class178.method3104(class175, true);
			Class699.aClass148_8772 = class178.method3104(Class166.method2658((Class523_Sub8.aClass472_10406), ((Class194_Sub13.anInt9919) * -18041369), 0), true);
			Class175 class175_120_ = Class166.method2658(Class523_Sub8.aClass472_10406, Class308.anInt3364 * -1743511611, 0);
			Class257.aClass148_2828 = class178.method3104(class175_120_, true);
			class175_120_.method2956();
			Class419.aClass148_4724 = class178.method3104(class175_120_, true);
		}
		if (null != Class699.aClass148_8772 && Class375_Sub2.aClass148_10192 != null && Class257.aClass148_2828 != null) {
			int i_121_ = ((i_117_ - Class257.aClass148_2828.method2504() * 2) / Class699.aClass148_8772.method2504());
			for (int i_122_ = 0; i_122_ < i_121_; i_122_++)
				Class699.aClass148_8772.method2435((i + Class257.aClass148_2828.method2504() + i_122_ * Class699.aClass148_8772.method2504()), i_118_ + i_116_ - Class699.aClass148_8772.method2428());
			int i_123_ = ((i_118_ - i_119_ - Class257.aClass148_2828.method2428()) / Class375_Sub2.aClass148_10192.method2428());
			for (int i_124_ = 0; i_124_ < i_123_; i_124_++) {
				Class375_Sub2.aClass148_10192.method2435(i, (i_116_ + i_119_ + i_124_ * Class375_Sub2.aClass148_10192.method2428()));
				NetworkStream.aClass148_7480.method2435(i_117_ + i - NetworkStream.aClass148_7480.method2504(), (i_116_ + i_119_ + i_124_ * Class375_Sub2.aClass148_10192.method2428()));
			}
			Class257.aClass148_2828.method2435(i, (i_118_ + i_116_ - Class257.aClass148_2828.method2428()));
			Class419.aClass148_4724.method2435(i + i_117_ - Class257.aClass148_2828.method2504(), i_116_ + i_118_ - Class257.aClass148_2828.method2428());
		}
	}

	static boolean method1008() {
		return 462991943 * anInt330 > 0;
	}

	static boolean method1009() {
		return 462991943 * anInt330 > 0;
	}

	static void method1010(int i) {
		for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass708_342.method14240(1629822178); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) 59))) {
			if (Class263.method4741((-2101009827 * class523_sub27_sub6.anInt11639), 2037124381) && i == class523_sub27_sub6.anInt11640 * -967967353 >> 16)
				Class232.method4256(class523_sub27_sub6, (byte) 105);
		}
	}

	static void method1011() {
		for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
			if (1060081949 * class523_sub27_sub8.anInt11719 > 1) {
				class523_sub27_sub8.anInt11719 = 0;
				aClass209_335.method3770(class523_sub27_sub8, (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).aLong11628 * 5220346430341563535L));
				class523_sub27_sub8.aClass697_11718.removeFromQueue(716799384);
			}
		}
		anInt336 = 0;
		anInt330 = 0;
		aClass708_342.method14235((byte) -12);
		aClass14_338.method733(133893253);
		aClass697_339.removeFromQueue(1341664532);
		Class232.method4258(aClass523_Sub27_Sub6_329, -1983393364);
	}

	static int method1012() {
		if (null == client.aClass250_11197) {
			if (!aBool326) {
				if (Class61.aClass633_769.aBool8263) {
					if (null != aClass523_Sub27_Sub6_334)
						return 149462549 * aClass523_Sub27_Sub6_334.anInt11630;
				} else if (Class660.aClass523_Sub27_Sub6_8507 != null)
					return (149462549 * Class660.aClass523_Sub27_Sub6_8507.anInt11630);
			} else {
				Class10 class10 = client.method17697(1805414206);
				int i = Class642.aClass561_8334.method9426((byte) 91);
				int i_125_ = Class642.aClass561_8334.method9432(-1100701367);
				if (!aBool327) {
					if (i > Whirlpool.anInt231 * -1744502791 && i < (-1744502791 * Whirlpool.anInt231 + BaseVarType.anInt5390 * -345535891)) {
						int i_126_ = -1;
						for (int i_127_ = 0; i_127_ < anInt330 * 462991943; i_127_++) {
							if (aBool353) {
								int i_128_ = (1 + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423))) + (1648921847 * anInt323 * (anInt330 * 462991943 - 1 - i_127_)));
								if (i_125_ > (i_128_ - -1669009881 * class10.anInt76 - 1) && i_125_ < i_128_ + (class10.anInt80 * -853549931))
									i_126_ = i_127_;
							} else {
								int i_129_ = (31 + 14756423 * Class194_Sub17.anInt9941 + ((anInt330 * 462991943 - 1 - i_127_) * (1648921847 * anInt323)));
								if (i_125_ > (i_129_ - class10.anInt76 * -1669009881 - 1) && i_125_ < (-853549931 * class10.anInt80 + i_129_))
									i_126_ = i_127_;
							}
						}
						if (i_126_ != -1) {
							int i_130_ = 0;
							Class706 class706 = new Class706(aClass708_342);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(1994344811)); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) class706.next()) {
								if (i_130_++ == i_126_)
									return (149462549 * class523_sub27_sub6.anInt11630);
							}
						}
					}
				} else if (i > -1744502791 * Whirlpool.anInt231 && i < (BaseVarType.anInt5390 * -345535891 + Whirlpool.anInt231 * -1744502791)) {
					int i_131_ = -1;
					for (int i_132_ = 0; i_132_ < -914479837 * anInt336; i_132_++) {
						if (aBool353) {
							int i_133_ = (anInt323 * 1648921847 * i_132_ + (1 + (-1669009881 * class10.anInt76 + (20 + 14756423 * (Class194_Sub17.anInt9941)))));
							if ((i_125_ > i_133_ - -1669009881 * class10.anInt76 - 1) && (i_125_ < class10.anInt80 * -853549931 + i_133_))
								i_131_ = i_132_;
						} else {
							int i_134_ = (1648921847 * anInt323 * i_132_ + (31 + Class194_Sub17.anInt9941 * 14756423));
							if ((i_125_ > i_134_ - class10.anInt76 * -1669009881 - 1) && (i_125_ < class10.anInt80 * -853549931 + i_134_))
								i_131_ = i_132_;
						}
					}
					if (i_131_ != -1) {
						int i_135_ = 0;
						Class703 class703 = new Class703(aClass697_339);
						for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(78771419)); class523_sub27_sub8 != null; class523_sub27_sub8 = (Class523_Sub27_Sub8) class703.next()) {
							if (i_135_++ == i_131_)
								return (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).anInt11630 * 149462549);
						}
					}
				} else if (aClass523_Sub27_Sub8_328 != null && i > 1464782871 * Class523_Sub7.anInt10405 && i < (Class523_Sub7.anInt10405 * 1464782871 + 805194879 * Class426.anInt4824)) {
					int i_136_ = -1;
					for (int i_137_ = 0; (i_137_ < 1060081949 * aClass523_Sub27_Sub8_328.anInt11719); i_137_++) {
						if (aBool353) {
							int i_138_ = (class10.anInt76 * -1669009881 + (20 + 534142755 * Class301.anInt3330) + 1 + i_137_ * (anInt323 * 1648921847));
							if ((i_125_ > i_138_ - class10.anInt76 * -1669009881 - 1) && (i_125_ < i_138_ + -853549931 * class10.anInt80))
								i_136_ = i_137_;
						} else {
							int i_139_ = (1648921847 * anInt323 * i_137_ + (534142755 * Class301.anInt3330 + 31));
							if ((i_125_ > i_139_ - -1669009881 * class10.anInt76 - 1) && (i_125_ < i_139_ + -853549931 * class10.anInt80))
								i_136_ = i_137_;
						}
					}
					if (-1 != i_136_) {
						int i_140_ = 0;
						Class703 class703 = new Class703(aClass523_Sub27_Sub8_328.aClass697_11718);
						for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(-871041208)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
							if (i_140_++ == i_136_)
								return (149462549 * class523_sub27_sub6.anInt11630);
						}
					}
				}
			}
		}
		return -1;
	}

	static void method1013() {
		if (-2131499789 * client.anInt11070 < 0) {
			Class10 class10 = client.method17697(1496480783);
			if (!aBool326)
				aBool327 = ((-2045228509 * anInt354 != -1 && anInt330 * 462991943 >= -2045228509 * anInt354) || ((462991943 * anInt330 * (1648921847 * anInt323) + (aBool353 ? 26 : 22)) > -495986435 * Class254.anInt2742));
			aClass708_340.method14235((byte) -13);
			aClass708_341.method14235((byte) 10);
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1029879176)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -74))) {
				int i = -2101009827 * class523_sub27_sub6.anInt11639;
				if (i < 1000) {
					class523_sub27_sub6.method8661(607052656);
					if (59 == i || i == 2 || i == 8 || 17 == i || i == 15 || 16 == i || 58 == i)
						aClass708_341.method14236(class523_sub27_sub6, -337229346);
					else
						aClass708_340.method14236(class523_sub27_sub6, 138482984);
				}
			}
			aClass708_340.method14239(aClass708_342, 1871561141);
			aClass708_341.method14239(aClass708_342, 1871561141);
			if (anInt330 * 462991943 > 1) {
				if (Class283.method5137((byte) 0) && anInt330 * 462991943 > 2)
					Class660.aClass523_Sub27_Sub6_8507 = (Class523_Sub27_Sub6) (aClass708_342.aClass523_8838.aClass523_7064.aClass523_7064);
				else
					Class660.aClass523_Sub27_Sub6_8507 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				aClass523_Sub27_Sub6_333 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				if (462991943 * anInt330 > 2)
					aClass523_Sub27_Sub6_334 = ((Class523_Sub27_Sub6) aClass523_Sub27_Sub6_333.aClass523_7064);
				else
					aClass523_Sub27_Sub6_334 = null;
			} else {
				Class660.aClass523_Sub27_Sub6_8507 = null;
				aClass523_Sub27_Sub6_333 = null;
				aClass523_Sub27_Sub6_334 = null;
			}
			Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(1400493718));
			int i;
			int i_141_;
			if (null != class523_sub39) {
				i = class523_sub39.method16519(-401256728);
				i_141_ = class523_sub39.method16520((byte) 127);
			} else {
				i = Class642.aClass561_8334.method9426((byte) 0);
				i_141_ = Class642.aClass561_8334.method9432(-1354508402);
			}
			if (aBool326) {
				if (Class293.method5251((Class61.aClass633_769.anInterface68_8266), class523_sub39, -491512190)) {
					if (null != aClass523_Sub27_Sub8_328 && i >= Class523_Sub7.anInt10405 * 1464782871 && i <= (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879) && i_141_ >= Class301.anInt3330 * 534142755 && i_141_ <= (534142755 * Class301.anInt3330 + Class705.anInt8818 * 1850758193)) {
						int i_142_ = -1;
						for (int i_143_ = 0; i_143_ < (aClass523_Sub27_Sub8_328.anInt11719 * 1060081949); i_143_++) {
							if (aBool353) {
								int i_144_ = (1648921847 * anInt323 * i_143_ + (class10.anInt76 * -1669009881 + (534142755 * Class301.anInt3330 + 20) + 1));
								if (i_141_ > (i_144_ - class10.anInt76 * -1669009881 - 1) && i_141_ < i_144_ + (class10.anInt80 * -853549931))
									i_142_ = i_143_;
							} else {
								int i_145_ = (i_143_ * (anInt323 * 1648921847) + (31 + Class301.anInt3330 * 534142755));
								if (i_141_ > i_145_ - 13 && i_141_ < 3 + i_145_)
									i_142_ = i_143_;
							}
						}
						if (-1 != i_142_) {
							int i_146_ = 0;
							Class703 class703 = new Class703(aClass523_Sub27_Sub8_328.aClass697_11718);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(1972899950)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
								if (i_146_ == i_142_) {
									Class381.method6407(class523_sub27_sub6, i, i_141_, true, (byte) 0);
									break;
								}
								i_146_++;
							}
						}
						Class524.method8685(-522212835);
					} else if (i >= -1744502791 * Whirlpool.anInt231 && i <= (BaseVarType.anInt5390 * -345535891 + Whirlpool.anInt231 * -1744502791) && i_141_ >= 14756423 * Class194_Sub17.anInt9941 && (i_141_ <= (2080544711 * Class523_Sub19.anInt10492 + (Class194_Sub17.anInt9941 * 14756423)))) {
						if (!aBool327) {
							int i_147_ = -1;
							for (int i_148_ = 0; i_148_ < anInt330 * 462991943; i_148_++) {
								if (aBool353) {
									int i_149_ = (((462991943 * anInt330 - 1 - i_148_) * (anInt323 * 1648921847)) + ((Class194_Sub17.anInt9941 * 14756423) + 20 + class10.anInt76 * -1669009881 + 1));
									if (i_141_ > i_149_ - (class10.anInt76 * -1669009881) - 1 && (i_141_ < (-853549931 * class10.anInt80 + i_149_)))
										i_147_ = i_148_;
								} else {
									int i_150_ = (31 + 14756423 * (Class194_Sub17.anInt9941) + (1648921847 * anInt323 * (anInt330 * 462991943 - 1 - i_148_)));
									if (i_141_ > i_150_ - 13 && i_141_ < i_150_ + 3)
										i_147_ = i_148_;
								}
							}
							if (-1 != i_147_) {
								int i_151_ = 0;
								Class706 class706 = new Class706(aClass708_342);
								for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(1113269194)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.next())) {
									if (i_151_ == i_147_) {
										Class381.method6407(class523_sub27_sub6, i, i_141_, true, (byte) 0);
										break;
									}
									i_151_++;
								}
							}
							Class524.method8685(-522212835);
						} else {
							int i_152_ = -1;
							for (int i_153_ = 0; i_153_ < -914479837 * anInt336; i_153_++) {
								if (aBool353) {
									int i_154_ = (anInt323 * 1648921847 * i_153_ + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423)) + 1));
									if ((i_141_ > (i_154_ - -1669009881 * class10.anInt76 - 1)) && (i_141_ < (-853549931 * class10.anInt80 + i_154_))) {
										i_152_ = i_153_;
										break;
									}
								} else {
									int i_155_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_153_);
									if (i_141_ > i_155_ - 13 && i_141_ < i_155_ + 3) {
										i_152_ = i_153_;
										break;
									}
								}
							}
							if (i_152_ != -1) {
								int i_156_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(-1706241881)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_156_ == i_152_) {
										Class381.method6407(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), i, i_141_, true, (byte) 0);
										Class524.method8685(-522212835);
										break;
									}
									i_156_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != aClass523_Sub27_Sub8_328) {
						if (i < Class523_Sub7.anInt10405 * 1464782871 - 10 || i > (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879 + 10) || i_141_ < 534142755 * Class301.anInt3330 - 10 || (i_141_ > 10 + (Class705.anInt8818 * 1850758193 + 534142755 * Class301.anInt3330)))
							Class529.method8769(-1404582110);
						else
							bool = true;
					}
					if (!bool) {
						if (i < Whirlpool.anInt231 * -1744502791 - 10 || i > (BaseVarType.anInt5390 * -345535891 + -1744502791 * Whirlpool.anInt231 + 10) || (i_141_ < 14756423 * Class194_Sub17.anInt9941 - 10) || i_141_ > (2080544711 * Class523_Sub19.anInt10492 + Class194_Sub17.anInt9941 * 14756423 + 10))
							Class524.method8685(-522212835);
						else if (aBool327) {
							int i_157_ = -1;
							int i_158_ = -1;
							for (int i_159_ = 0; i_159_ < -914479837 * anInt336; i_159_++) {
								if (aBool353) {
									int i_160_ = (1 + (class10.anInt76 * -1669009881 + ((14756423 * Class194_Sub17.anInt9941) + 20)) + 1648921847 * anInt323 * i_159_);
									if (i_141_ > i_160_ - (class10.anInt76 * -1669009881) - 1 && i_141_ < (class10.anInt80 * -853549931) + i_160_) {
										i_157_ = i_159_;
										i_158_ = i_160_ - (class10.anInt76 * -1669009881) - 1;
										break;
									}
								} else {
									int i_161_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_159_);
									if (i_141_ > i_161_ - 13 && i_141_ < i_161_ + 3) {
										i_157_ = i_159_;
										i_158_ = i_161_ - 13;
										break;
									}
								}
							}
							if (i_157_ != -1) {
								int i_162_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(-619491211)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_162_ == i_157_) {
										if ((1060081949 * class523_sub27_sub8.anInt11719) > 1)
											Class199.method3682(class523_sub27_sub8, i_158_, 399367680);
										break;
									}
									i_162_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class293.method5251((Class61.aClass633_769.anInterface68_8269), class523_sub39, 662425064);
				boolean bool_163_ = Class293.method5251((Class61.aClass633_769.anInterface68_8261), class523_sub39, -87953429);
				boolean bool_164_ = Class293.method5251((Class61.aClass633_769.anInterface68_8262), class523_sub39, 1890589824);
				if ((bool || bool_163_) && ((1 == client.anInt11176 * 247606787 && anInt330 * 462991943 > 2) || Class150.method2520((byte) 78)))
					bool_164_ = true;
				if (bool_164_ && anInt330 * 462991943 > 0) {
					if (client.aClass250_11197 == null && 0 == client.anInt11211 * 569005185)
						Class436.method6874(i, i_141_, 1842010720);
					else
						anInt332 = -10775390;
				} else if (bool_163_) {
					if (null != aClass523_Sub27_Sub6_334)
						Class381.method6407(aClass523_Sub27_Sub6_334, i, i_141_, false, (byte) 0);
				} else if (bool) {
					if (null != Class660.aClass523_Sub27_Sub6_8507) {
						boolean bool_165_ = (client.aClass250_11197 != null || client.anInt11211 * 569005185 > 0);
						if (bool_165_) {
							anInt332 = 2142095953;
							BaseVarType.aClass523_Sub27_Sub6_5392 = Class660.aClass523_Sub27_Sub6_8507;
						} else
							Class381.method6407((Class660.aClass523_Sub27_Sub6_8507), i, i_141_, false, (byte) 0);
					} else if (client.aBool11000)
						Class399.method6533(1443169521);
				}
				if (null == client.aClass250_11197 && 569005185 * client.anInt11211 == 0) {
					anInt332 = 0;
					BaseVarType.aClass523_Sub27_Sub6_5392 = null;
				}
			}
		}
	}

	static void method1014(NPC class647_sub1_sub3_sub1_sub1, boolean bool) {
		if (anInt330 * 462991943 < 409) {
			NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
			String string = class647_sub1_sub3_sub1_sub1.customName;
			if (class300.anIntArray3286 != null) {
				class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 32);
				if (class300 == null)
					return;
				string = class300.name;
			}
			if (class300.aBool3287) {
				if (0 != 1167898669 * class647_sub1_sub3_sub1_sub1.customCombatLevel) {
					String string_166_ = (client.aClass681_11284 == Class681.aClass681_8641 ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -50)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -127)));
					string = new StringBuilder().append(string).append(Class443.method7204((class647_sub1_sub3_sub1_sub1.customCombatLevel * 1167898669), (Class241.player.anInt12186) * 1773490063, (byte) -6)).append(Class31.aString297).append(string_166_).append(1167898669 * class647_sub1_sub3_sub1_sub1.customCombatLevel).append(Class31.aString295).toString();
				}
				if (client.aBool11000 && !bool) {
					Class76 class76 = ((Class76) (-1 != 1180578917 * Class13.anInt173 ? (Class60.aClass53_Sub22_766.getDefinition(Class13.anInt173 * 1180578917, (byte) -16)) : null));
					if (0 != (Class570.anInt7658 * 382935923 & 0x2) && (null == class76 || (class300.method5488((Class13.anInt173 * 1180578917), (class76.anInt850 * -1100663923), -1383825977) != -1100663923 * class76.anInt850)))
						Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16776960, -1473659766)).append(string).toString(), Class684.anInt8664 * 2088669163, 8, -1, (long) (class647_sub1_sub3_sub1_sub1.anInt11888 * -1087669731), 0, 0, true, false, (long) (class647_sub1_sub3_sub1_sub1.anInt11888 * -1087669731), false, (byte) 63);
				}
				if (!bool) {
					String[] strings = class300.aStringArray3270;
					if (client.aBool11193)
						strings = Class523_Sub19.method16060(strings, 690860773);
					if (strings != null) {
						for (int i = strings.length - 1; i >= 0; i--) {
							if (null != strings[i] && ((class647_sub1_sub3_sub1_sub1.anInt12176 * 1150737897) & 1 << i) == 0 && (0 == class300.aByte3250 || (!(strings[i].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -90))) && !(strings[i].equalsIgnoreCase(Class39.aClass39_505.method1124(Class53_Sub20.aClass668_10979, (byte) -1)))))) {
								int i_167_ = 0;
								int i_168_ = 952073761 * client.anInt11179;
								if (i == 0)
									i_167_ = 9;
								if (i == 1)
									i_167_ = 10;
								if (2 == i)
									i_167_ = 11;
								if (i == 3)
									i_167_ = 12;
								if (i == 4)
									i_167_ = 13;
								if (5 == i)
									i_167_ = 1003;
								int i_169_ = class300.method5485(i, 1788627183);
								if (-1 != i_169_)
									i_168_ = i_169_;
								Class463.method7523(strings[i], new StringBuilder().append(Class495.method8101(16776960, 1702945222)).append(string).toString(), ((strings[i].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -116))) ? -1085767413 * class300.anInt3272 : i_168_), i_167_, -1, (long) ((class647_sub1_sub3_sub1_sub1.anInt11888) * -1087669731), 0, 0, true, false, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub1.anInt11888)), false, (byte) -64);
							}
						}
						if (class300.aByte3250 == 1) {
							for (int i = 0; i < strings.length; i++) {
								if (null != strings[i] && 0 == ((1150737897 * (class647_sub1_sub3_sub1_sub1.anInt12176)) & 1 << i) && ((strings[i].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -110))) || (strings[i].equalsIgnoreCase(Class39.aClass39_505.method1124(Class53_Sub20.aClass668_10979, (byte) -99))))) {
									short i_170_ = 0;
									if ((1167898669 * (class647_sub1_sub3_sub1_sub1.customCombatLevel)) > (Class241.player.anInt12186) * 1773490063)
										i_170_ = (short) 2000;
									short i_171_ = 0;
									int i_172_ = client.anInt11179 * 952073761;
									if (0 == i)
										i_171_ = (short) 9;
									if (i == 1)
										i_171_ = (short) 10;
									if (i == 2)
										i_171_ = (short) 11;
									if (3 == i)
										i_171_ = (short) 12;
									if (i == 4)
										i_171_ = (short) 13;
									if (i == 5)
										i_171_ = (short) 1003;
									if (0 != i_171_)
										i_171_ += i_170_;
									int i_173_ = class300.method5485(i, 2037556375);
									if (-1 != i_173_)
										i_172_ = i_173_;
									Class463.method7523(strings[i], new StringBuilder().append(Class495.method8101(16776960, -422027713)).append(string).toString(), ((strings[i].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -80))) ? class300.anInt3272 * -1085767413 : i_172_), i_171_, -1, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub1.anInt11888)), 0, 0, true, false, (long) ((class647_sub1_sub3_sub1_sub1.anInt11888) * -1087669731), false, (byte) 49);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method1015(int i, int i_174_) {
		anInt346 = 805025479 * i;
		anInt347 = i_174_ * -2101624987;
	}

	static void method1016(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1) {
		if (class647_sub1_sub3_sub1 instanceof NPC) {
			NPC class647_sub1_sub3_sub1_sub1 = (NPC) class647_sub1_sub3_sub1;
			if (null != class647_sub1_sub3_sub1_sub1.aClass300_12175)
				Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.player.aByte10821) != (class647_sub1_sub3_sub1_sub1.aByte10821)), -2007768369);
		} else if (class647_sub1_sub3_sub1 instanceof Player) {
			Player class647_sub1_sub3_sub1_sub2 = (Player) class647_sub1_sub3_sub1;
			Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.player.aByte10821) != class647_sub1_sub3_sub1_sub2.aByte10821), (short) -8283);
		}
	}

	static void method1017(InterfaceComponentDefinitions class250, int i, int i_175_) {
		aClass250_322 = class250;
		anInt344 = i * -1639381475;
		anInt345 = i_175_ * -924580533;
	}

	static void method1018(InterfaceComponentDefinitions class250, int i, int i_176_) {
		aClass250_322 = class250;
		anInt344 = i * -1639381475;
		anInt345 = i_176_ * -924580533;
	}

	static String method1019(int i, int i_177_) {
		int i_178_ = i_177_ - i;
		if (i_178_ < -9)
			return Class495.method8101(16711680, 61451563);
		if (i_178_ < -6)
			return Class495.method8101(16723968, -461733812);
		if (i_178_ < -3)
			return Class495.method8101(16740352, -1105631576);
		if (i_178_ < 0)
			return Class495.method8101(16756736, -826105944);
		if (i_178_ > 9)
			return Class495.method8101(65280, -1203763757);
		if (i_178_ > 6)
			return Class495.method8101(4259584, -1183502331);
		if (i_178_ > 3)
			return Class495.method8101(8453888, 1511349103);
		if (i_178_ > 0)
			return Class495.method8101(12648192, -1529588229);
		return Class495.method8101(16776960, 361658804);
	}

	static String method1020(Class523_Sub27_Sub8 class523_sub27_sub8) {
		return new StringBuilder().append(class523_sub27_sub8.aString11720).append(Class495.method8101(16777215, -197098435)).append(" >").toString();
	}

	public static boolean method1021(int i, int i_179_) {
		if (!aBool326)
			return false;
		int i_180_ = i >> 16;
		int i_181_ = i & 0xffff;
		if (null == Class31.aClass242Array302[i_180_] || (Class31.aClass242Array302[i_180_].aClass250Array2457[i_181_] == null))
			return false;
		InterfaceComponentDefinitions class250 = Class31.aClass242Array302[i_180_].aClass250Array2457[i_181_];
		if (-1 != i_179_ || 0 != class250.type * 36473529) {
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1822689902)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) 30))) {
				if (i_179_ == -1947252983 * class523_sub27_sub6.anInt11634 && (class250.interfaceHash * -1363815505 == class523_sub27_sub6.anInt11640 * -967967353) && (class523_sub27_sub6.anInt11639 * -2101009827 == 58 || 1007 == class523_sub27_sub6.anInt11639 * -2101009827 || 25 == class523_sub27_sub6.anInt11639 * -2101009827 || class523_sub27_sub6.anInt11639 * -2101009827 == 57 || class523_sub27_sub6.anInt11639 * -2101009827 == 30))
					return true;
			}
		} else {
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1591624978)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -70))) {
				if (-2101009827 * class523_sub27_sub6.anInt11639 == 58 || 1007 == class523_sub27_sub6.anInt11639 * -2101009827 || 25 == -2101009827 * class523_sub27_sub6.anInt11639 || 57 == class523_sub27_sub6.anInt11639 * -2101009827 || -2101009827 * class523_sub27_sub6.anInt11639 == 30) {
					for (InterfaceComponentDefinitions class250_182_ = Class188.getDefinitions((-967967353 * (class523_sub27_sub6.anInt11640)), -1622848660); class250_182_ != null; class250_182_ = Class617.method10090((Class31.aClass242Array302[(class250_182_.interfaceHash * -1363815505) >> 16]), class250_182_, 2025695974)) {
						if (class250.interfaceHash * -1363815505 == -1363815505 * class250_182_.interfaceHash)
							return true;
					}
				}
			}
		}
		return false;
	}

	public static Class523_Sub27_Sub6 method1022() {
		return Class660.aClass523_Sub27_Sub6_8507;
	}

	public static boolean method1023(int i, int i_183_) {
		if (!aBool326)
			return false;
		int i_184_ = i >> 16;
		int i_185_ = i & 0xffff;
		if (null == Class31.aClass242Array302[i_184_] || (Class31.aClass242Array302[i_184_].aClass250Array2457[i_185_] == null))
			return false;
		InterfaceComponentDefinitions class250 = Class31.aClass242Array302[i_184_].aClass250Array2457[i_185_];
		if (-1 != i_183_ || 0 != class250.type * 36473529) {
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1096275125)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -26))) {
				if (i_183_ == -1947252983 * class523_sub27_sub6.anInt11634 && (class250.interfaceHash * -1363815505 == class523_sub27_sub6.anInt11640 * -967967353) && (class523_sub27_sub6.anInt11639 * -2101009827 == 58 || 1007 == class523_sub27_sub6.anInt11639 * -2101009827 || 25 == class523_sub27_sub6.anInt11639 * -2101009827 || class523_sub27_sub6.anInt11639 * -2101009827 == 57 || class523_sub27_sub6.anInt11639 * -2101009827 == 30))
					return true;
			}
		} else {
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1107484008)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -91))) {
				if (-2101009827 * class523_sub27_sub6.anInt11639 == 58 || 1007 == class523_sub27_sub6.anInt11639 * -2101009827 || 25 == -2101009827 * class523_sub27_sub6.anInt11639 || 57 == class523_sub27_sub6.anInt11639 * -2101009827 || -2101009827 * class523_sub27_sub6.anInt11639 == 30) {
					for (InterfaceComponentDefinitions class250_186_ = Class188.getDefinitions((-967967353 * (class523_sub27_sub6.anInt11640)), -882710905); class250_186_ != null; class250_186_ = Class617.method10090((Class31.aClass242Array302[(class250_186_.interfaceHash * -1363815505) >> 16]), class250_186_, 2025695974)) {
						if (class250.interfaceHash * -1363815505 == -1363815505 * class250_186_.interfaceHash)
							return true;
					}
				}
			}
		}
		return false;
	}

	static void method1024(Class178 class178) {
		if (null != aClass441_350) {
			class178.method3124(aClass441_350);
			class178.method3300(aClass435_352);
			class178.method3378(anInt346 * -1196807433, -1269933459 * anInt347, (anInt346 * -1196807433 + -1264269755 * anInt355), (anInt347 * -1269933459 + -831151971 * anInt349));
			class178.method3208(-1196807433 * anInt346, anInt347 * -1269933459, -1264269755 * anInt355, anInt349 * -831151971);
		}
	}

	public static String method1025(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (aBool326 || null == class523_sub27_sub6)
			return "";
		if ((class523_sub27_sub6.aString11637 == null || class523_sub27_sub6.aString11637.length() == 0) && null != class523_sub27_sub6.aString11633 && class523_sub27_sub6.aString11633.length() > 0)
			return class523_sub27_sub6.aString11633;
		return class523_sub27_sub6.aString11637;
	}

	static void method1026(Class435 class435, Class441 class441, int i, int i_187_) {
		if (null == aClass441_350)
			aClass441_350 = new Class441(class441);
		else
			aClass441_350.method7086(class441);
		aClass435_352.method6803(class435);
		anInt355 = i * 149314701;
		anInt349 = 1878910389 * i_187_;
	}

	static void method1027() {
		if (null != aClass523_Sub27_Sub8_328) {
			aClass523_Sub27_Sub8_328 = null;
			Class504.method8225(1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330, Class426.anInt4824 * 805194879, Class705.anInt8818 * 1850758193, (byte) -47);
		}
	}

	static void method1028() {
		if (-2131499789 * client.anInt11070 < 0) {
			Class10 class10 = client.method17697(1224044610);
			if (!aBool326)
				aBool327 = ((-2045228509 * anInt354 != -1 && anInt330 * 462991943 >= -2045228509 * anInt354) || ((462991943 * anInt330 * (1648921847 * anInt323) + (aBool353 ? 26 : 22)) > -495986435 * Class254.anInt2742));
			aClass708_340.method14235((byte) 18);
			aClass708_341.method14235((byte) -9);
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(620959113)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -39))) {
				int i = -2101009827 * class523_sub27_sub6.anInt11639;
				if (i < 1000) {
					class523_sub27_sub6.method8661(607052656);
					if (59 == i || i == 2 || i == 8 || 17 == i || i == 15 || 16 == i || 58 == i)
						aClass708_341.method14236(class523_sub27_sub6, -875066093);
					else
						aClass708_340.method14236(class523_sub27_sub6, -513546280);
				}
			}
			aClass708_340.method14239(aClass708_342, 1871561141);
			aClass708_341.method14239(aClass708_342, 1871561141);
			if (anInt330 * 462991943 > 1) {
				if (Class283.method5137((byte) 0) && anInt330 * 462991943 > 2)
					Class660.aClass523_Sub27_Sub6_8507 = (Class523_Sub27_Sub6) (aClass708_342.aClass523_8838.aClass523_7064.aClass523_7064);
				else
					Class660.aClass523_Sub27_Sub6_8507 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				aClass523_Sub27_Sub6_333 = ((Class523_Sub27_Sub6) aClass708_342.aClass523_8838.aClass523_7064);
				if (462991943 * anInt330 > 2)
					aClass523_Sub27_Sub6_334 = ((Class523_Sub27_Sub6) aClass523_Sub27_Sub6_333.aClass523_7064);
				else
					aClass523_Sub27_Sub6_334 = null;
			} else {
				Class660.aClass523_Sub27_Sub6_8507 = null;
				aClass523_Sub27_Sub6_333 = null;
				aClass523_Sub27_Sub6_334 = null;
			}
			Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(1684376254));
			int i;
			int i_188_;
			if (null != class523_sub39) {
				i = class523_sub39.method16519(-1635393069);
				i_188_ = class523_sub39.method16520((byte) 127);
			} else {
				i = Class642.aClass561_8334.method9426((byte) -16);
				i_188_ = Class642.aClass561_8334.method9432(-2007364807);
			}
			if (aBool326) {
				if (Class293.method5251((Class61.aClass633_769.anInterface68_8266), class523_sub39, 1260585143)) {
					if (null != aClass523_Sub27_Sub8_328 && i >= Class523_Sub7.anInt10405 * 1464782871 && i <= (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879) && i_188_ >= Class301.anInt3330 * 534142755 && i_188_ <= (534142755 * Class301.anInt3330 + Class705.anInt8818 * 1850758193)) {
						int i_189_ = -1;
						for (int i_190_ = 0; i_190_ < (aClass523_Sub27_Sub8_328.anInt11719 * 1060081949); i_190_++) {
							if (aBool353) {
								int i_191_ = (1648921847 * anInt323 * i_190_ + (class10.anInt76 * -1669009881 + (534142755 * Class301.anInt3330 + 20) + 1));
								if (i_188_ > (i_191_ - class10.anInt76 * -1669009881 - 1) && i_188_ < i_191_ + (class10.anInt80 * -853549931))
									i_189_ = i_190_;
							} else {
								int i_192_ = (i_190_ * (anInt323 * 1648921847) + (31 + Class301.anInt3330 * 534142755));
								if (i_188_ > i_192_ - 13 && i_188_ < 3 + i_192_)
									i_189_ = i_190_;
							}
						}
						if (-1 != i_189_) {
							int i_193_ = 0;
							Class703 class703 = new Class703(aClass523_Sub27_Sub8_328.aClass697_11718);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(-2630403)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
								if (i_193_ == i_189_) {
									Class381.method6407(class523_sub27_sub6, i, i_188_, true, (byte) 0);
									break;
								}
								i_193_++;
							}
						}
						Class524.method8685(-522212835);
					} else if (i >= -1744502791 * Whirlpool.anInt231 && i <= (BaseVarType.anInt5390 * -345535891 + Whirlpool.anInt231 * -1744502791) && i_188_ >= 14756423 * Class194_Sub17.anInt9941 && (i_188_ <= (2080544711 * Class523_Sub19.anInt10492 + (Class194_Sub17.anInt9941 * 14756423)))) {
						if (!aBool327) {
							int i_194_ = -1;
							for (int i_195_ = 0; i_195_ < anInt330 * 462991943; i_195_++) {
								if (aBool353) {
									int i_196_ = (((462991943 * anInt330 - 1 - i_195_) * (anInt323 * 1648921847)) + ((Class194_Sub17.anInt9941 * 14756423) + 20 + class10.anInt76 * -1669009881 + 1));
									if (i_188_ > i_196_ - (class10.anInt76 * -1669009881) - 1 && (i_188_ < (-853549931 * class10.anInt80 + i_196_)))
										i_194_ = i_195_;
								} else {
									int i_197_ = (31 + 14756423 * (Class194_Sub17.anInt9941) + (1648921847 * anInt323 * (anInt330 * 462991943 - 1 - i_195_)));
									if (i_188_ > i_197_ - 13 && i_188_ < i_197_ + 3)
										i_194_ = i_195_;
								}
							}
							if (-1 != i_194_) {
								int i_198_ = 0;
								Class706 class706 = new Class706(aClass708_342);
								for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(1445795586)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.next())) {
									if (i_198_ == i_194_) {
										Class381.method6407(class523_sub27_sub6, i, i_188_, true, (byte) 0);
										break;
									}
									i_198_++;
								}
							}
							Class524.method8685(-522212835);
						} else {
							int i_199_ = -1;
							for (int i_200_ = 0; i_200_ < -914479837 * anInt336; i_200_++) {
								if (aBool353) {
									int i_201_ = (anInt323 * 1648921847 * i_200_ + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423)) + 1));
									if ((i_188_ > (i_201_ - -1669009881 * class10.anInt76 - 1)) && (i_188_ < (-853549931 * class10.anInt80 + i_201_))) {
										i_199_ = i_200_;
										break;
									}
								} else {
									int i_202_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_200_);
									if (i_188_ > i_202_ - 13 && i_188_ < i_202_ + 3) {
										i_199_ = i_200_;
										break;
									}
								}
							}
							if (i_199_ != -1) {
								int i_203_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(2150128)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_203_ == i_199_) {
										Class381.method6407(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), i, i_188_, true, (byte) 0);
										Class524.method8685(-522212835);
										break;
									}
									i_203_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != aClass523_Sub27_Sub8_328) {
						if (i < Class523_Sub7.anInt10405 * 1464782871 - 10 || i > (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879 + 10) || i_188_ < 534142755 * Class301.anInt3330 - 10 || (i_188_ > 10 + (Class705.anInt8818 * 1850758193 + 534142755 * Class301.anInt3330)))
							Class529.method8769(-751338781);
						else
							bool = true;
					}
					if (!bool) {
						if (i < Whirlpool.anInt231 * -1744502791 - 10 || i > (BaseVarType.anInt5390 * -345535891 + -1744502791 * Whirlpool.anInt231 + 10) || (i_188_ < 14756423 * Class194_Sub17.anInt9941 - 10) || i_188_ > (2080544711 * Class523_Sub19.anInt10492 + Class194_Sub17.anInt9941 * 14756423 + 10))
							Class524.method8685(-522212835);
						else if (aBool327) {
							int i_204_ = -1;
							int i_205_ = -1;
							for (int i_206_ = 0; i_206_ < -914479837 * anInt336; i_206_++) {
								if (aBool353) {
									int i_207_ = (1 + (class10.anInt76 * -1669009881 + ((14756423 * Class194_Sub17.anInt9941) + 20)) + 1648921847 * anInt323 * i_206_);
									if (i_188_ > i_207_ - (class10.anInt76 * -1669009881) - 1 && i_188_ < (class10.anInt80 * -853549931) + i_207_) {
										i_204_ = i_206_;
										i_205_ = i_207_ - (class10.anInt76 * -1669009881) - 1;
										break;
									}
								} else {
									int i_208_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + anInt323 * 1648921847 * i_206_);
									if (i_188_ > i_208_ - 13 && i_188_ < i_208_ + 3) {
										i_204_ = i_206_;
										i_205_ = i_208_ - 13;
										break;
									}
								}
							}
							if (i_204_ != -1) {
								int i_209_ = 0;
								Class703 class703 = new Class703(aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(-1412150330)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_209_ == i_204_) {
										if ((1060081949 * class523_sub27_sub8.anInt11719) > 1)
											Class199.method3682(class523_sub27_sub8, i_205_, 399367680);
										break;
									}
									i_209_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class293.method5251((Class61.aClass633_769.anInterface68_8269), class523_sub39, 794178775);
				boolean bool_210_ = Class293.method5251((Class61.aClass633_769.anInterface68_8261), class523_sub39, 1401522854);
				boolean bool_211_ = Class293.method5251((Class61.aClass633_769.anInterface68_8262), class523_sub39, -394143309);
				if ((bool || bool_210_) && ((1 == client.anInt11176 * 247606787 && anInt330 * 462991943 > 2) || Class150.method2520((byte) 86)))
					bool_211_ = true;
				if (bool_211_ && anInt330 * 462991943 > 0) {
					if (client.aClass250_11197 == null && 0 == client.anInt11211 * 569005185)
						Class436.method6874(i, i_188_, 1407571064);
					else
						anInt332 = -10775390;
				} else if (bool_210_) {
					if (null != aClass523_Sub27_Sub6_334)
						Class381.method6407(aClass523_Sub27_Sub6_334, i, i_188_, false, (byte) 0);
				} else if (bool) {
					if (null != Class660.aClass523_Sub27_Sub6_8507) {
						boolean bool_212_ = (client.aClass250_11197 != null || client.anInt11211 * 569005185 > 0);
						if (bool_212_) {
							anInt332 = 2142095953;
							BaseVarType.aClass523_Sub27_Sub6_5392 = Class660.aClass523_Sub27_Sub6_8507;
						} else
							Class381.method6407((Class660.aClass523_Sub27_Sub6_8507), i, i_188_, false, (byte) 0);
					} else if (client.aBool11000)
						Class399.method6533(1076714459);
				}
				if (null == client.aClass250_11197 && 569005185 * client.anInt11211 == 0) {
					anInt332 = 0;
					BaseVarType.aClass523_Sub27_Sub6_5392 = null;
				}
			}
		}
	}

	static void method1029(Class441 class441) {
		aClass441_337.method7086(class441);
	}

	static void method1030(Class178 class178) {
		if (!aBool353)
			Class70.method1481(class178, (byte) 0);
		else
			Class654.method10721(class178, -576090841);
	}

	static void method1031(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (null != class523_sub27_sub6) {
			aClass708_342.method14236(class523_sub27_sub6, 1023079245);
			anInt330 += -308717705;
			Object object = null;
			Class523_Sub27_Sub8 class523_sub27_sub8;
			if (!class523_sub27_sub6.aBool11638 && !"".equals(class523_sub27_sub6.aString11637)) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				for (class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass14_338.getFromIndex(l); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (null == class523_sub27_sub8) {
					class523_sub27_sub8 = (Class523_Sub27_Sub8) aClass209_335.method3767(l);
					if (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637))
						class523_sub27_sub8 = null;
					if (class523_sub27_sub8 == null)
						class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
					aClass14_338.method738(class523_sub27_sub8, l);
					anInt336 += -599051637;
				}
			} else {
				class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
				anInt336 += -599051637;
			}
			if (class523_sub27_sub8.method18084(class523_sub27_sub6, (byte) 1))
				Class308.method5598(class523_sub27_sub8, -163812152);
		}
	}

	static void method1032(Class178 class178) {
		if (!aBool353)
			Class70.method1481(class178, (byte) 0);
		else
			Class654.method10721(class178, -576090841);
	}

	static void method1033(Class178 class178) {
		if (!aBool353)
			Class70.method1481(class178, (byte) 0);
		else
			Class654.method10721(class178, -576090841);
	}

	static void method1034(Class178 class178) {
		if ((anInt330 * 462991943 >= 2 || client.aBool11000) && null == client.aClass250_11197) {
			String string;
			if (client.aBool11000 && 462991943 * anInt330 < 2)
				string = new StringBuilder().append(client.aString11016).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -58)).append(client.aString11225).append(" ").append(Class31.aString299).toString();
			else if (Class283.method5137((byte) 0) && 462991943 * anInt330 > 2)
				string = Class48.method1257(Class660.aClass523_Sub27_Sub6_8507, 2032803046);
			else {
				Class523_Sub27_Sub6 class523_sub27_sub6 = Class660.aClass523_Sub27_Sub6_8507;
				if (class523_sub27_sub6 == null)
					return;
				string = Class48.method1257(class523_sub27_sub6, -1459109080);
				int[] is = Class209.method3809(class523_sub27_sub6, -833364097);
				if (null != is)
					string = new StringBuilder().append(string).append(Class163.method2593(is, 1559221752)).toString();
			}
			if (anInt330 * 462991943 > 2)
				string = new StringBuilder().append(string).append(Class495.method8101(16777215, -1828748898)).append(" / ").append(462991943 * anInt330 - 2).append(Class39.aClass39_397.method1124((Class53_Sub20.aClass668_10979), (byte) -125)).toString();
			if (aClass250_322 != null) {
				Class164 class164 = aClass250_322.method4493(Class491.aClass423_5536, client.anInterface50_11044, (short) 255);
				if (class164 == null)
					class164 = Class34.aClass164_319;
				class164.method2603(string, 1577839669 * anInt344, anInt345 * -975086493, aClass250_322.anInt2581 * 365308179, aClass250_322.anInt2543 * -1759297857, aClass250_322.anInt2556 * -293786715, -728754787 * aClass250_322.anInt2565, 1588100583 * aClass250_322.anInt2536, aClass250_322.anInt2512 * -899509811, client.aRandom11099, Class330.anInt3500, client.anIntArray11250, Class62.aClass148Array772, null, 1839810903);
				Class504.method8225(client.anIntArray11250[0], client.anIntArray11250[1], client.anIntArray11250[2], client.anIntArray11250[3], (byte) -2);
			}
		}
	}

	static void method1035(Class178 class178, int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_) {
		class178.method3354(i, i_213_, i_214_, i_215_, i_216_, (byte) 13);
		class178.method3354(1 + i, 1 + i_213_, i_214_ - 2, 16, i_217_, (byte) 123);
		class178.method3077(i + 1, i_213_ + 18, i_214_ - 2, i_215_ - 19, i_217_, 1808966053);
	}

	static String method1036(int[] is) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < is.length; i++) {
			Class280 class280 = ((Class280) Class655.aClass58_Sub1_8422.getDefinition(is[i], (byte) -8));
			if (class280.anInt3064 * -447328581 != -1)
				stringbuilder.append(" <sprite=").append(-447328581 * class280.anInt3064).append(">");
		}
		return stringbuilder.toString();
	}

	static void method1037(Class178 class178, int i, int i_218_, int i_219_, int i_220_, int i_221_, Class164 class164, Class10 class10, String string) {
		int i_222_ = 255 - Class529.anInt7121 * -1304274901 - 597769683 * anInt351;
		if (i_222_ < 0)
			i_222_ = 0;
		if (Class418.aClass148_4696 == null || null == Class687_Sub14.aClass148_10858) {
			if (Class523_Sub8.aClass472_10406.method7650(616625835 * Class53.anInt724, -1567815265) && Class523_Sub8.aClass472_10406.method7650((1112737405 * (Class184.anInt2126)), 270076042)) {
				Class418.aClass148_4696 = (class178.method3104(Class166.method2658(Class523_Sub8.aClass472_10406, Class53.anInt724 * 616625835, 0), true));
				Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, Class184.anInt2126 * 1112737405, 0);
				Class687_Sub14.aClass148_10858 = class178.method3104(class175, true);
				class175.method2956();
				Class78.aClass148_863 = class178.method3104(class175, true);
			} else
				class178.method3193(i, i_218_, i_219_, i_221_, (i_222_ << 24 | 809657313 * Class381.anInt3952), 1);
		}
		if (null != Class418.aClass148_4696 && null != Class687_Sub14.aClass148_10858) {
			int i_223_ = ((i_219_ - Class687_Sub14.aClass148_10858.method2504() * 2) / Class418.aClass148_4696.method2504());
			for (int i_224_ = 0; i_224_ < i_223_; i_224_++)
				Class418.aClass148_4696.method2435((i + Class687_Sub14.aClass148_10858.method2504() + i_224_ * Class418.aClass148_4696.method2504()), i_218_);
			Class687_Sub14.aClass148_10858.method2435(i, i_218_);
			Class78.aClass148_863.method2435(i + i_219_ - Class78.aClass148_863.method2504(), i_218_);
		}
		class164.method2635(string, 3 + i, ((20 - -1669009881 * class10.anInt76) / 2 + (i_218_ + class10.anInt76 * -1669009881)), (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), -1, (byte) 21);
		class178.method3193(i, i_218_ + i_221_, i_219_, i_220_ - i_221_, i_222_ << 24 | Class381.anInt3952 * 809657313, 1);
	}

	static void method1038(int i, int i_225_, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_, Class523_Sub27_Sub6 class523_sub27_sub6, Class164 class164, Class10 class10, int i_231_, int i_232_) {
		if (i > i_226_ && i < i_226_ + i_228_ && i_225_ > i_230_ - class10.anInt76 * -1669009881 - 1 && i_225_ < i_230_ + -853549931 * class10.anInt80 && class523_sub27_sub6.aBool11635)
			i_231_ = i_232_;
		int[] is = Class209.method3809(class523_sub27_sub6, 67713072);
		String string = Class48.method1257(class523_sub27_sub6, -639860589);
		if (null != is)
			string = new StringBuilder().append(string).append(Class163.method2593(is, 1650904000)).toString();
		class164.method2602(string, i_226_ + 3, i_230_, i_231_, 0, client.aRandom11099, Class330.anInt3500, Class62.aClass148Array772, null, -1786787414);
		if (class523_sub27_sub6.aBool11636)
			Class707_Sub2.aClass148_10972.method2435(5 + i_226_ + class10.method626(string, Class62.aClass148Array772, -1942791872), i_230_ - class10.anInt76 * -1669009881);
	}

	static void method1039(int i, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_, Class523_Sub27_Sub8 class523_sub27_sub8, Class164 class164, Class10 class10, int i_239_, int i_240_) {
		if (i > i_234_ && i < i_234_ + i_236_ && i_233_ > i_238_ - -1669009881 * class10.anInt76 - 1 && i_233_ < class10.anInt80 * -853549931 + i_238_)
			i_239_ = i_240_;
		String string = BodyDefinitions.method10330(class523_sub27_sub8, (short) -31409);
		class164.method2602(string, i_234_ + 3, i_238_, i_239_, 0, client.aRandom11099, Class330.anInt3500, Class62.aClass148Array772, null, -2121167641);
	}

	static void method1040(int i, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_, Class523_Sub27_Sub8 class523_sub27_sub8, Class164 class164, Class10 class10, int i_247_, int i_248_) {
		if (i > i_242_ && i < i_242_ + i_244_ && i_241_ > i_246_ - -1669009881 * class10.anInt76 - 1 && i_241_ < class10.anInt80 * -853549931 + i_246_)
			i_247_ = i_248_;
		String string = BodyDefinitions.method10330(class523_sub27_sub8, (short) -18872);
		class164.method2602(string, i_242_ + 3, i_246_, i_247_, 0, client.aRandom11099, Class330.anInt3500, Class62.aClass148Array772, null, -1857255148);
	}

	static void method1041(Class178 class178) {
		int i = -10660793;
		Class572.method9622(class178, -1744502791 * Whirlpool.anInt231, 14756423 * Class194_Sub17.anInt9941, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i, -16777216, 1064773407);
		Class34.aClass164_319.method2635(Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -79), 3 + Whirlpool.anInt231 * -1744502791, 14 + 14756423 * Class194_Sub17.anInt9941, i, -1, (byte) -44);
		int i_249_ = Class642.aClass561_8334.method9426((byte) 121);
		int i_250_ = Class642.aClass561_8334.method9432(-2062482922);
		if (!aBool327) {
			int i_251_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1739902191)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) 108))) {
				int i_252_ = ((462991943 * anInt330 - 1 - i_251_) * (1648921847 * anInt323) + (14756423 * Class194_Sub17.anInt9941 + 31));
				Class676_Sub1.method16780(i_249_, i_250_, -1744502791 * Whirlpool.anInt231, 14756423 * Class194_Sub17.anInt9941, BaseVarType.anInt5390 * -345535891, (Class523_Sub19.anInt10492 * 2080544711), i_252_, class523_sub27_sub6, Class34.aClass164_319, Class655.aClass10_8421, -1, -256, 162873804);
				i_251_++;
			}
		} else {
			int i_253_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
				int i_254_ = (1648921847 * anInt323 * i_253_ + (31 + 14756423 * Class194_Sub17.anInt9941));
				if (1 == 1060081949 * class523_sub27_sub8.anInt11719)
					Class676_Sub1.method16780(i_249_, i_250_, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_254_, ((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), Class34.aClass164_319, Class655.aClass10_8421, -1, -256, 162873804);
				else
					Class660.method10861(i_249_, i_250_, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, BaseVarType.anInt5390 * -345535891, (2080544711 * Class523_Sub19.anInt10492), i_254_, class523_sub27_sub8, Class34.aClass164_319, Class655.aClass10_8421, -1, -256, -1579629926);
				i_253_++;
			}
			if (aClass523_Sub27_Sub8_328 != null) {
				Class572.method9622(class178, 1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330, Class426.anInt4824 * 805194879, Class705.anInt8818 * 1850758193, i, -16777216, -1234710129);
				Class34.aClass164_319.method2635(aClass523_Sub27_Sub8_328.aString11720, 3 + 1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330 + 14, i, -1, (byte) 87);
				i_253_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218)) {
					int i_255_ = (i_253_ * (1648921847 * anInt323) + (31 + Class301.anInt3330 * 534142755));
					Class676_Sub1.method16780(i_249_, i_250_, (Class523_Sub7.anInt10405 * 1464782871), Class301.anInt3330 * 534142755, 805194879 * Class426.anInt4824, 1850758193 * Class705.anInt8818, i_255_, class523_sub27_sub6, Class34.aClass164_319, Class655.aClass10_8421, -1, -256, 162873804);
					i_253_++;
				}
			}
		}
	}

	static void method1042(Class178 class178, int i, int i_256_, int i_257_, int i_258_, int i_259_, Class164 class164, Class10 class10, String string) {
		int i_260_ = 255 - Class529.anInt7121 * -1304274901 - 597769683 * anInt351;
		if (i_260_ < 0)
			i_260_ = 0;
		if (Class418.aClass148_4696 == null || null == Class687_Sub14.aClass148_10858) {
			if (Class523_Sub8.aClass472_10406.method7650(616625835 * Class53.anInt724, -1009645778) && Class523_Sub8.aClass472_10406.method7650((1112737405 * (Class184.anInt2126)), -906309152)) {
				Class418.aClass148_4696 = (class178.method3104(Class166.method2658(Class523_Sub8.aClass472_10406, Class53.anInt724 * 616625835, 0), true));
				Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, Class184.anInt2126 * 1112737405, 0);
				Class687_Sub14.aClass148_10858 = class178.method3104(class175, true);
				class175.method2956();
				Class78.aClass148_863 = class178.method3104(class175, true);
			} else
				class178.method3193(i, i_256_, i_257_, i_259_, (i_260_ << 24 | 809657313 * Class381.anInt3952), 1);
		}
		if (null != Class418.aClass148_4696 && null != Class687_Sub14.aClass148_10858) {
			int i_261_ = ((i_257_ - Class687_Sub14.aClass148_10858.method2504() * 2) / Class418.aClass148_4696.method2504());
			for (int i_262_ = 0; i_262_ < i_261_; i_262_++)
				Class418.aClass148_4696.method2435((i + Class687_Sub14.aClass148_10858.method2504() + i_262_ * Class418.aClass148_4696.method2504()), i_256_);
			Class687_Sub14.aClass148_10858.method2435(i, i_256_);
			Class78.aClass148_863.method2435(i + i_257_ - Class78.aClass148_863.method2504(), i_256_);
		}
		class164.method2635(string, 3 + i, ((20 - -1669009881 * class10.anInt76) / 2 + (i_256_ + class10.anInt76 * -1669009881)), (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), -1, (byte) -14);
		class178.method3193(i, i_256_ + i_259_, i_257_, i_258_ - i_259_, i_260_ << 24 | Class381.anInt3952 * 809657313, 1);
	}

	static void method1043(Class178 class178, int i, int i_263_, int i_264_, int i_265_, int i_266_, Class164 class164, Class10 class10, String string) {
		int i_267_ = 255 - Class529.anInt7121 * -1304274901 - 597769683 * anInt351;
		if (i_267_ < 0)
			i_267_ = 0;
		if (Class418.aClass148_4696 == null || null == Class687_Sub14.aClass148_10858) {
			if (Class523_Sub8.aClass472_10406.method7650(616625835 * Class53.anInt724, 22412303) && Class523_Sub8.aClass472_10406.method7650((1112737405 * (Class184.anInt2126)), 500880349)) {
				Class418.aClass148_4696 = (class178.method3104(Class166.method2658(Class523_Sub8.aClass472_10406, Class53.anInt724 * 616625835, 0), true));
				Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, Class184.anInt2126 * 1112737405, 0);
				Class687_Sub14.aClass148_10858 = class178.method3104(class175, true);
				class175.method2956();
				Class78.aClass148_863 = class178.method3104(class175, true);
			} else
				class178.method3193(i, i_263_, i_264_, i_266_, (i_267_ << 24 | 809657313 * Class381.anInt3952), 1);
		}
		if (null != Class418.aClass148_4696 && null != Class687_Sub14.aClass148_10858) {
			int i_268_ = ((i_264_ - Class687_Sub14.aClass148_10858.method2504() * 2) / Class418.aClass148_4696.method2504());
			for (int i_269_ = 0; i_269_ < i_268_; i_269_++)
				Class418.aClass148_4696.method2435((i + Class687_Sub14.aClass148_10858.method2504() + i_269_ * Class418.aClass148_4696.method2504()), i_263_);
			Class687_Sub14.aClass148_10858.method2435(i, i_263_);
			Class78.aClass148_863.method2435(i + i_264_ - Class78.aClass148_863.method2504(), i_263_);
		}
		class164.method2635(string, 3 + i, ((20 - -1669009881 * class10.anInt76) / 2 + (i_263_ + class10.anInt76 * -1669009881)), (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), -1, (byte) -74);
		class178.method3193(i, i_263_ + i_266_, i_264_, i_265_ - i_266_, i_267_ << 24 | Class381.anInt3952 * 809657313, 1);
	}

	static void method1044(Class523_Sub27_Sub8 class523_sub27_sub8, int i) {
		if (aBool326) {
			Class10 class10 = client.method17697(1454738110);
			int i_270_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.next(768418218)) {
				int i_271_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
				if (i_271_ > i_270_)
					i_270_ = i_271_;
			}
			i_270_ += 8;
			int i_272_ = (1060081949 * class523_sub27_sub8.anInt11719 * (anInt323 * 1648921847) + 21);
			Class705.anInt8818 = (1060081949 * class523_sub27_sub8.anInt11719 * (anInt323 * 1648921847) + (aBool353 ? 26 : 22)) * -1633516335;
			int i_273_ = (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390);
			if (i_273_ + i_270_ > 2141365743 * Class170.anInt1833)
				i_273_ = -1744502791 * Whirlpool.anInt231 - i_270_;
			if (i_273_ < 0)
				i_273_ = 0;
			int i_274_ = aBool353 ? 1 + (20 + class10.anInt76 * -1669009881) : 31;
			int i_275_ = 1 + (i - i_274_ + -1669009881 * class10.anInt76);
			if (i_275_ + i_272_ > -495986435 * Class254.anInt2742)
				i_275_ = -495986435 * Class254.anInt2742 - i_272_;
			if (i_275_ < 0)
				i_275_ = 0;
			Class523_Sub7.anInt10405 = i_273_ * -299145305;
			Class301.anInt3330 = i_275_ * 848152715;
			Class426.anInt4824 = i_270_ * -1979354241;
			aClass523_Sub27_Sub8_328 = class523_sub27_sub8;
		}
	}

	static Class10 method1045() {
		Class10 class10;
		if (aBool353) {
			if (Class659.aClass164_8505 != null && null != Class331.aClass10_3506)
				class10 = Class331.aClass10_3506;
			else
				class10 = Class655.aClass10_8421;
		} else
			class10 = Class655.aClass10_8421;
		anInt323 = -1992209327 * class10.anInt76 + class10.anInt80 * 334461907;
		return class10;
	}

	static void method1046(Class178 class178, int i, int i_276_, int i_277_, int i_278_, int i_279_) {
		if ((Class699.aClass148_8772 == null || Class375_Sub2.aClass148_10192 == null || null == Class257.aClass148_2828) && Class523_Sub8.aClass472_10406.method7650(((Class194_Sub13.anInt9919) * -18041369), -461786801) && Class523_Sub8.aClass472_10406.method7650(((Class523_Sub18_Sub11.anInt11704) * -1663848907), 928825825) && Class523_Sub8.aClass472_10406.method7650((Class308.anInt3364 * -1743511611), -1619983403)) {
			Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, (-1663848907 * Class523_Sub18_Sub11.anInt11704), 0);
			Class375_Sub2.aClass148_10192 = class178.method3104(class175, true);
			class175.method2956();
			NetworkStream.aClass148_7480 = class178.method3104(class175, true);
			Class699.aClass148_8772 = class178.method3104(Class166.method2658((Class523_Sub8.aClass472_10406), ((Class194_Sub13.anInt9919) * -18041369), 0), true);
			Class175 class175_280_ = Class166.method2658(Class523_Sub8.aClass472_10406, Class308.anInt3364 * -1743511611, 0);
			Class257.aClass148_2828 = class178.method3104(class175_280_, true);
			class175_280_.method2956();
			Class419.aClass148_4724 = class178.method3104(class175_280_, true);
		}
		if (null != Class699.aClass148_8772 && Class375_Sub2.aClass148_10192 != null && Class257.aClass148_2828 != null) {
			int i_281_ = ((i_277_ - Class257.aClass148_2828.method2504() * 2) / Class699.aClass148_8772.method2504());
			for (int i_282_ = 0; i_282_ < i_281_; i_282_++)
				Class699.aClass148_8772.method2435((i + Class257.aClass148_2828.method2504() + i_282_ * Class699.aClass148_8772.method2504()), i_278_ + i_276_ - Class699.aClass148_8772.method2428());
			int i_283_ = ((i_278_ - i_279_ - Class257.aClass148_2828.method2428()) / Class375_Sub2.aClass148_10192.method2428());
			for (int i_284_ = 0; i_284_ < i_283_; i_284_++) {
				Class375_Sub2.aClass148_10192.method2435(i, (i_276_ + i_279_ + i_284_ * Class375_Sub2.aClass148_10192.method2428()));
				NetworkStream.aClass148_7480.method2435(i_277_ + i - NetworkStream.aClass148_7480.method2504(), (i_276_ + i_279_ + i_284_ * Class375_Sub2.aClass148_10192.method2428()));
			}
			Class257.aClass148_2828.method2435(i, (i_278_ + i_276_ - Class257.aClass148_2828.method2428()));
			Class419.aClass148_4724.method2435(i + i_277_ - Class257.aClass148_2828.method2504(), i_276_ + i_278_ - Class257.aClass148_2828.method2428());
		}
	}

	static void method1047(Class178 class178, int i, int i_285_, int i_286_, int i_287_, int i_288_) {
		if ((Class699.aClass148_8772 == null || Class375_Sub2.aClass148_10192 == null || null == Class257.aClass148_2828) && Class523_Sub8.aClass472_10406.method7650(Class194_Sub13.anInt9919 * -18041369, 940362876) && Class523_Sub8.aClass472_10406.method7650(((Class523_Sub18_Sub11.anInt11704) * -1663848907), 1107899383) && Class523_Sub8.aClass472_10406.method7650(Class308.anInt3364 * -1743511611, -501982797)) {
			Class175 class175 = Class166.method2658(Class523_Sub8.aClass472_10406, (-1663848907 * Class523_Sub18_Sub11.anInt11704), 0);
			Class375_Sub2.aClass148_10192 = class178.method3104(class175, true);
			class175.method2956();
			NetworkStream.aClass148_7480 = class178.method3104(class175, true);
			Class699.aClass148_8772 = class178.method3104(Class166.method2658((Class523_Sub8.aClass472_10406), ((Class194_Sub13.anInt9919) * -18041369), 0), true);
			Class175 class175_289_ = Class166.method2658(Class523_Sub8.aClass472_10406, Class308.anInt3364 * -1743511611, 0);
			Class257.aClass148_2828 = class178.method3104(class175_289_, true);
			class175_289_.method2956();
			Class419.aClass148_4724 = class178.method3104(class175_289_, true);
		}
		if (null != Class699.aClass148_8772 && Class375_Sub2.aClass148_10192 != null && Class257.aClass148_2828 != null) {
			int i_290_ = ((i_286_ - Class257.aClass148_2828.method2504() * 2) / Class699.aClass148_8772.method2504());
			for (int i_291_ = 0; i_291_ < i_290_; i_291_++)
				Class699.aClass148_8772.method2435((i + Class257.aClass148_2828.method2504() + i_291_ * Class699.aClass148_8772.method2504()), i_287_ + i_285_ - Class699.aClass148_8772.method2428());
			int i_292_ = ((i_287_ - i_288_ - Class257.aClass148_2828.method2428()) / Class375_Sub2.aClass148_10192.method2428());
			for (int i_293_ = 0; i_293_ < i_292_; i_293_++) {
				Class375_Sub2.aClass148_10192.method2435(i, (i_285_ + i_288_ + i_293_ * Class375_Sub2.aClass148_10192.method2428()));
				NetworkStream.aClass148_7480.method2435(i_286_ + i - NetworkStream.aClass148_7480.method2504(), (i_285_ + i_288_ + i_293_ * Class375_Sub2.aClass148_10192.method2428()));
			}
			Class257.aClass148_2828.method2435(i, (i_287_ + i_285_ - Class257.aClass148_2828.method2428()));
			Class419.aClass148_4724.method2435(i + i_286_ - Class257.aClass148_2828.method2504(), i_285_ + i_287_ - Class257.aClass148_2828.method2428());
		}
	}

	static boolean method1048() {
		return 462991943 * anInt330 > 0;
	}

	static void method1049(Class178 class178) {
		if (!aBool353)
			Class70.method1481(class178, (byte) 0);
		else
			Class654.method10721(class178, -576090841);
	}

	public static boolean method1050(int i) {
		for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass708_342.method14240(790880142); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -7))) {
			if (Class549.method9107((-2101009827 * class523_sub27_sub6.anInt11639), (byte) 1) && ((long) i == 7768112170675051057L * class523_sub27_sub6.aLong11632))
				return true;
		}
		return false;
	}

	static String method1051(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (null == class523_sub27_sub6.aString11633 || class523_sub27_sub6.aString11633.length() == 0) {
			if (class523_sub27_sub6.aString11637 != null && class523_sub27_sub6.aString11637.length() > 0)
				return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -5)).append(class523_sub27_sub6.aString11637).toString();
			return class523_sub27_sub6.aString11629;
		}
		if (class523_sub27_sub6.aString11637 != null && class523_sub27_sub6.aString11637.length() > 0)
			return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -114)).append(class523_sub27_sub6.aString11637).append(Class39.aClass39_516.method1124((Class53_Sub20.aClass668_10979), (byte) -75)).append(class523_sub27_sub6.aString11633).toString();
		return new StringBuilder().append(class523_sub27_sub6.aString11629).append(Class39.aClass39_516.method1124(Class53_Sub20.aClass668_10979, (byte) -29)).append(class523_sub27_sub6.aString11633).toString();
	}

	static void method1052(InterfaceComponentDefinitions class250, int i, int i_294_) {
		aClass250_322 = class250;
		anInt344 = i * -1639381475;
		anInt345 = i_294_ * -924580533;
	}

	static int method1053(Class523_Sub27_Sub8 class523_sub27_sub8, Class10 class10) {
		String string = BodyDefinitions.method10330(class523_sub27_sub8, (short) -21352);
		return class10.method626(string, Class62.aClass148Array772, -1942791872);
	}

	public static String method1054(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (aBool326 || null == class523_sub27_sub6)
			return "";
		return class523_sub27_sub6.aString11629;
	}

	static int method1055(Class523_Sub27_Sub6 class523_sub27_sub6, Class10 class10) {
		String string = Class48.method1257(class523_sub27_sub6, 347213101);
		int[] is = Class209.method3809(class523_sub27_sub6, -1787837091);
		if (null != is)
			string = new StringBuilder().append(string).append(Class163.method2593(is, 1596544200)).toString();
		int i = class10.method626(string, Class62.aClass148Array772, -1942791872);
		if (class523_sub27_sub6.aBool11636)
			i += Class707_Sub2.aClass148_10972.method2504() + 4;
		return i;
	}

	static void method1056(Class178 class178, int i, int i_295_) {
		if (i >= 0 && i_295_ >= 0 && aClass441_350 != null) {
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			Class441 class441 = class178.method3112();
			Class413.method6649(class178, 208243353);
			class441.method7090(aClass435_352);
			class441.method7089(aClass441_350);
			class441.method7163();
			int i_296_ = i - -1196807433 * anInt346;
			int i_297_ = i_295_ - -1269933459 * anInt347;
			if (client.aClass505_11019.method8241((byte) -43) != null) {
				if (!client.aBool11000 || (Class570.anInt7658 * 382935923 & 0x40) != 0) {
					int i_298_ = -1;
					int i_299_ = -1;
					float f = (2.0F * (float) i_296_ / (float) (-1264269755 * anInt355) - 1.0F);
					float f_300_ = (2.0F * (float) i_297_ / (float) (-831151971 * anInt349) - 1.0F);
					class441.method7185(f, f_300_, -1.0F, aFloatArray356);
					float f_301_ = aFloatArray356[0] / aFloatArray356[3];
					float f_302_ = aFloatArray356[1] / aFloatArray356[3];
					float f_303_ = aFloatArray356[2] / aFloatArray356[3];
					class441.method7185(f, f_300_, 1.0F, aFloatArray356);
					float f_304_ = aFloatArray356[0] / aFloatArray356[3];
					float f_305_ = aFloatArray356[1] / aFloatArray356[3];
					float f_306_ = aFloatArray356[2] / aFloatArray356[3];
					float f_307_ = Class304.method5547(f_301_, f_302_, f_303_, f_304_, f_305_, f_306_, 4, -1397657906);
					if (f_307_ > 0.0F) {
						float f_308_ = f_304_ - f_301_;
						float f_309_ = f_306_ - f_303_;
						int i_310_ = (int) (f_308_ * f_307_ + f_301_);
						int i_311_ = (int) (f_303_ + f_309_ * f_307_);
						i_298_ = i_310_ + (Class241.player.method18338(2145042932) - 1 << 8) >> 9;
						i_299_ = i_311_ + (Class241.player.method18338(2145198475) - 1 << 8) >> 9;
						int i_312_ = (Class241.player.aByte10821);
						if (i_312_ < 3 && ((client.aClass505_11019.method8243(-1481582972).aByteArrayArrayArray4962[1][i_310_ >> 9][i_311_ >> 9]) & 0x2) != 0)
							i_312_++;
					}
					if (i_298_ != -1 && i_299_ != -1) {
						if (client.aBool11000 && (382935923 * Class570.anInt7658 & 0x40) != 0) {
							InterfaceComponentDefinitions class250 = Class654.method10722((Class232.anInt2367 * 1383041209), (-1034378319 * client.anInt11105), (byte) 18);
							if (null != class250)
								Class463.method7523(client.aString11016, new StringBuilder().append(" ").append(Class31.aString299).append(" ").toString(), Class684.anInt8664 * 2088669163, 59, -1, 0L, i_298_, i_299_, true, false, (long) (i_298_ << 0 | i_299_), true, (byte) -29);
							else
								Class399.method6533(-2044305507);
						} else {
							if (Class318.aBool3431)
								Class463.method7523((Class39.aClass39_510.method1124((Class53_Sub20.aClass668_10979), (byte) -3)), "", -1, 60, -1, 0L, i_298_, i_299_, true, false, (long) (i_298_ << 0 | i_299_), true, (byte) -8);
							Class463.method7523(Class17.aString191, "", (-1101666563 * client.anInt10997), 23, -1, 0L, i_298_, i_299_, true, false, (long) (i_298_ << 0 | i_299_), true, (byte) -76);
						}
					}
				}
				Class549 class549 = (client.aClass505_11019.method8241((byte) -83).aClass549_7555);
				int i_313_ = i;
				int i_314_ = i_295_;
				List list = class549.aList7326;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class559 class559 = (Class559) iterator.next();
					if ((client.aBool11305 || ((Class241.player.aByte10821) == class559.aClass647_Sub1_7492.aByte10821)) && class559.method9235(class178, i_313_, i_314_, (byte) 1)) {
						boolean bool = false;
						boolean bool_315_ = false;
						int i_316_;
						int i_317_;
						if (class559.aClass647_Sub1_7492 instanceof Class647_Sub1_Sub3) {
							i_316_ = ((Class647_Sub1_Sub3) class559.aClass647_Sub1_7492).aShort11750;
							i_317_ = ((Class647_Sub1_Sub3) class559.aClass647_Sub1_7492).aShort11751;
						} else {
							Class437 class437 = (class559.aClass647_Sub1_7492.method10569().aClass437_4862);
							i_316_ = (int) class437.aFloat4903 >> 9;
							i_317_ = (int) class437.aFloat4905 >> 9;
						}
						if (class559.aClass647_Sub1_7492 instanceof Player) {
							Player class647_sub1_sub3_sub1_sub2 = ((Player) class559.aClass647_Sub1_7492);
							int i_318_ = class647_sub1_sub3_sub1_sub2.method18338(2146584831);
							Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
							if (((i_318_ & 0x1) == 0 && ((int) class437.aFloat4903 & 0x1ff) == 0 && ((int) class437.aFloat4905 & 0x1ff) == 0) || ((i_318_ & 0x1) == 1 && (((int) class437.aFloat4903 & 0x1ff) == 256) && 256 == ((int) class437.aFloat4905 & 0x1ff))) {
								int i_319_ = ((int) class437.aFloat4903 - (class647_sub1_sub3_sub1_sub2.method18338(2145638171) - 1 << 8));
								int i_320_ = ((int) class437.aFloat4905 - (class647_sub1_sub3_sub1_sub2.method18338(2144100935) - 1 << 8));
								for (int i_321_ = 0; i_321_ < client.anInt11050 * 920163749; i_321_++) {
									Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.getFromIndex((long) client.anIntArray11051[i_321_])));
									if (null != class523_sub28) {
										NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
										if ((client.cycles != (1673780867 * (class647_sub1_sub3_sub1_sub1.anInt11895))) && (class647_sub1_sub3_sub1_sub1.aBool11892)) {
											Class437 class437_322_ = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
											int i_323_ = ((int) (class437_322_.aFloat4903) - ((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) - 1 << 8));
											int i_324_ = ((int) (class437_322_.aFloat4905) - (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - 1 << 8));
											if (i_323_ >= i_319_ && ((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933 <= ((class647_sub1_sub3_sub1_sub2.method18338(2143547450)) - (i_323_ - i_319_ >> 9))) && i_324_ >= i_320_ && ((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933 <= ((class647_sub1_sub3_sub1_sub2.method18338(2142998459)) - (i_324_ - i_320_ >> 9)))) {
												Class232.method4255(class647_sub1_sub3_sub1_sub1, ((class559.aClass647_Sub1_7492.aByte10821) != (Class241.player.aByte10821)), -916961504);
												class647_sub1_sub3_sub1_sub1.anInt11895 = (client.cycles * -95559637);
											}
										}
									}
								}
								int i_325_ = 393652345 * Class108.anInt1318;
								int[] is = Class108.anIntArray1319;
								for (int i_326_ = 0; i_326_ < i_325_; i_326_++) {
									Player class647_sub1_sub3_sub1_sub2_327_ = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_326_]]);
									if ((class647_sub1_sub3_sub1_sub2_327_ != null) && ((class647_sub1_sub3_sub1_sub2_327_.anInt11895) * 1673780867 != client.cycles) && (class647_sub1_sub3_sub1_sub2 != class647_sub1_sub3_sub1_sub2_327_) && (class647_sub1_sub3_sub1_sub2_327_.aBool11892)) {
										Class437 class437_328_ = (class647_sub1_sub3_sub1_sub2_327_.method10569().aClass437_4862);
										int i_329_ = ((int) class437_328_.aFloat4903 - ((class647_sub1_sub3_sub1_sub2_327_.method18338(2146149566) - 1) << 8));
										int i_330_ = ((int) class437_328_.aFloat4905 - ((class647_sub1_sub3_sub1_sub2_327_.method18338(2145667270) - 1) << 8));
										if (i_329_ >= i_319_ && (class647_sub1_sub3_sub1_sub2_327_.method18338(2144475944) <= (class647_sub1_sub3_sub1_sub2.method18338(2143436854) - (i_329_ - i_319_ >> 9))) && i_330_ >= i_320_ && (class647_sub1_sub3_sub1_sub2_327_.method18338(2141821215) <= (class647_sub1_sub3_sub1_sub2.method18338(2143079384) - (i_330_ - i_320_ >> 9)))) {
											Class40.method1133(class647_sub1_sub3_sub1_sub2_327_, ((Class241.player.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), (short) 12657);
											class647_sub1_sub3_sub1_sub2_327_.anInt11895 = (client.cycles * -95559637);
										}
									}
								}
							}
							if ((class647_sub1_sub3_sub1_sub2.anInt11895 * 1673780867) == client.cycles)
								continue;
							Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.player.aByte10821) != class559.aClass647_Sub1_7492.aByte10821), (short) 10122);
							class647_sub1_sub3_sub1_sub2.anInt11895 = client.cycles * -95559637;
						}
						if (class559.aClass647_Sub1_7492 instanceof NPC) {
							NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class559.aClass647_Sub1_7492);
							if (class647_sub1_sub3_sub1_sub1.aClass300_12175 != null) {
								Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
								if ((0 == ((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) & 0x1) && (((int) class437.aFloat4903 & 0x1ff) == 0) && 0 == ((int) class437.aFloat4905 & 0x1ff)) || (((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) & 0x1) == 1 && 256 == ((int) class437.aFloat4903 & 0x1ff) && 256 == ((int) class437.aFloat4905 & 0x1ff))) {
									int i_331_ = ((int) class437.aFloat4903 - (((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) - 1) << 8));
									int i_332_ = ((int) class437.aFloat4905 - (((1610497933 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260)) - 1) << 8));
									for (int i_333_ = 0; (i_333_ < 920163749 * client.anInt11050); i_333_++) {
										Class523_Sub28 class523_sub28 = ((Class523_Sub28) (client.aClass14_11047.getFromIndex((long) client.anIntArray11051[i_333_])));
										if (null != class523_sub28) {
											NPC class647_sub1_sub3_sub1_sub1_334_ = ((NPC) (class523_sub28.anObject10554));
											if ((client.cycles != (1673780867 * (class647_sub1_sub3_sub1_sub1_334_.anInt11895))) && (class647_sub1_sub3_sub1_sub1_334_ != class647_sub1_sub3_sub1_sub1) && (class647_sub1_sub3_sub1_sub1_334_.aBool11892)) {
												Class437 class437_335_ = (class647_sub1_sub3_sub1_sub1_334_.method10569().aClass437_4862);
												int i_336_ = ((int) (class437_335_.aFloat4903) - ((1610497933 * (class647_sub1_sub3_sub1_sub1_334_.aClass300_12175.anInt3260)) - 1 << 8));
												int i_337_ = ((int) (class437_335_.aFloat4905) - ((1610497933 * (class647_sub1_sub3_sub1_sub1_334_.aClass300_12175.anInt3260)) - 1 << 8));
												if (i_336_ >= i_331_ && ((1610497933 * (class647_sub1_sub3_sub1_sub1_334_.aClass300_12175.anInt3260)) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_336_ - i_331_ >> 9))) && i_337_ >= i_332_ && ((1610497933 * (class647_sub1_sub3_sub1_sub1_334_.aClass300_12175.anInt3260)) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_337_ - i_332_ >> 9)))) {
													Class232.method4255(class647_sub1_sub3_sub1_sub1_334_, ((Class241.player.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), 1455236245);
													class647_sub1_sub3_sub1_sub1_334_.anInt11895 = (client.cycles * -95559637);
												}
											}
										}
									}
									int i_338_ = Class108.anInt1318 * 393652345;
									int[] is = Class108.anIntArray1319;
									for (int i_339_ = 0; i_339_ < i_338_; i_339_++) {
										Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_339_]]);
										if ((null != class647_sub1_sub3_sub1_sub2) && ((class647_sub1_sub3_sub1_sub2.anInt11895) * 1673780867 != client.cycles) && (class647_sub1_sub3_sub1_sub2.aBool11892)) {
											Class437 class437_340_ = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
											int i_341_ = ((int) (class437_340_.aFloat4903) - ((class647_sub1_sub3_sub1_sub2.method18338(2145426528)) - 1 << 8));
											int i_342_ = ((int) (class437_340_.aFloat4905) - ((class647_sub1_sub3_sub1_sub2.method18338(2143191608)) - 1 << 8));
											if (i_341_ >= i_331_ && (class647_sub1_sub3_sub1_sub2.method18338(2145397629) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_341_ - i_331_ >> 9))) && i_342_ >= i_332_ && (class647_sub1_sub3_sub1_sub2.method18338(2141186445) <= (((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260) * 1610497933) - (i_342_ - i_332_ >> 9)))) {
												Class40.method1133(class647_sub1_sub3_sub1_sub2, ((Class241.player.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), (short) -11129);
												class647_sub1_sub3_sub1_sub2.anInt11895 = (-95559637 * client.cycles);
											}
										}
									}
								}
								if ((1673780867 * class647_sub1_sub3_sub1_sub1.anInt11895) == client.cycles)
									continue;
								Class232.method4255(class647_sub1_sub3_sub1_sub1, ((Class241.player.aByte10821) != (class559.aClass647_Sub1_7492.aByte10821)), 521981082);
								class647_sub1_sub3_sub1_sub1.anInt11895 = -95559637 * client.cycles;
							}
						}
						if (class559.aClass647_Sub1_7492 instanceof Class647_Sub1_Sub5_Sub1) {
							int i_343_ = 235453015 * class592.localX + i_316_;
							int i_344_ = i_317_ + class592.localY * 1704054549;
							Class523_Sub10 class523_sub10 = ((Class523_Sub10) (client.aClass14_11172.getFromIndex((long) ((class559.aClass647_Sub1_7492.aByte10821) << 28 | i_344_ << 14 | i_343_))));
							if (class523_sub10 != null) {
								int i_345_ = 0;
								Class523_Sub25 class523_sub25 = ((Class523_Sub25) class523_sub10.aClass708_10417.method14242(2071788850));
								while (class523_sub25 != null) {
									ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition((-188706487 * class523_sub25.anInt10544), (byte) 22)));
									int i_346_;
									if (class12.aBool161)
										i_346_ = class12.anInt169 * -2003823303;
									else if (class12.aBool121)
										i_346_ = -2083409775 * (Class61.aClass633_769.anInt8267);
									else
										i_346_ = -857721843 * (Class61.aClass633_769.anInt8268);
									if (client.aBool11000 && ((Class241.player.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821))) {
										Class76 class76 = ((Class76) ((1180578917 * Class13.anInt173 != -1) ? (Class60.aClass53_Sub22_766.getDefinition((Class13.anInt173 * 1180578917), (byte) -28)) : null));
										if ((Class570.anInt7658 * 382935923 & 0x1) != 0 && (class76 == null || ((class12.method669((1180578917 * Class13.anInt173), (-1100663923 * class76.anInt850), -1884161060)) != (-1100663923 * class76.anInt850))))
											Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(i_346_, 678512625)).append(class12.itemName).toString(), (Class684.anInt8664 * 2088669163), 17, -1, (long) ((class523_sub25.anInt10544) * -188706487), i_316_, i_317_, true, false, (long) i_345_, false, (byte) -21);
									}
									if ((Class241.player.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821)) {
										String[] strings = class12.groundOptions;
										for (int i_347_ = strings.length - 1; i_347_ >= 0; i_347_--) {
											if (null != strings[i_347_]) {
												int i_348_ = 0;
												int i_349_ = (952073761 * client.anInt11179);
												if (i_347_ == 0)
													i_348_ = 18;
												if (1 == i_347_)
													i_348_ = 19;
												if (i_347_ == 2)
													i_348_ = 20;
												if (3 == i_347_)
													i_348_ = 21;
												if (i_347_ == 4)
													i_348_ = 22;
												if (i_347_ == 5)
													i_348_ = 1004;
												int i_350_ = (class12.method674(i_347_, (short) 26197));
												if (i_350_ != -1)
													i_349_ = i_350_;
												Class463.method7523(strings[i_347_], new StringBuilder().append(Class495.method8101(i_346_, -25405243)).append(class12.itemName).toString(), i_349_, i_348_, -1, (long) ((class523_sub25.anInt10544) * -188706487), i_316_, i_317_, true, false, (long) i_345_, false, (byte) -25);
											}
										}
									}
									class523_sub25 = ((Class523_Sub25) class523_sub10.aClass708_10417.method14245(1046551725));
									i_345_++;
								}
							}
						}
						if (class559.aClass647_Sub1_7492 instanceof Interface61) {
							Interface61 interface61 = (Interface61) class559.aClass647_Sub1_7492;
							Class602 class602 = ((Class602) (client.aClass505_11019.method8244(1913726865).getDefinition(interface61.method401(-770473736), (byte) -5)));
							if (class602.anIntArray7912 != null)
								class602 = class602.method9893((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), 433036618);
							if (class602 != null) {
								if (client.aBool11000 && ((Class241.player.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821))) {
									Class76 class76 = ((Class76) (Class13.anInt173 * 1180578917 != -1 ? (Class60.aClass53_Sub22_766.getDefinition(Class13.anInt173 * 1180578917, (byte) 19)) : null));
									if (0 != (Class570.anInt7658 * 382935923 & 0x4) && (null == class76 || ((class602.method9897((Class13.anInt173 * 1180578917), (-1100663923 * class76.anInt850), -309725615)) != (class76.anInt850 * -1100663923))))
										Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(65535, 1765836625)).append(class602.aString7859).toString(), 2088669163 * Class684.anInt8664, 2, -1, (Class689.method13949(interface61, i_316_, i_317_, (short) 3159)), i_316_, i_317_, true, false, (long) interface61.hashCode(), false, (byte) 19);
								}
								if ((Class241.player.aByte10821) == (class559.aClass647_Sub1_7492.aByte10821)) {
									String[] strings = class602.aStringArray7869;
									if (null != strings) {
										for (int i_351_ = strings.length - 1; i_351_ >= 0; i_351_--) {
											if (strings[i_351_] != null) {
												int i_352_ = 0;
												int i_353_ = (client.anInt11179 * 952073761);
												if (i_351_ == 0)
													i_352_ = 3;
												if (1 == i_351_)
													i_352_ = 4;
												if (i_351_ == 2)
													i_352_ = 5;
												if (i_351_ == 3)
													i_352_ = 6;
												if (i_351_ == 4)
													i_352_ = 1001;
												if (5 == i_351_)
													i_352_ = 1002;
												int i_354_ = (class602.method9904(i_351_, (byte) 30));
												if (i_354_ != -1)
													i_353_ = i_354_;
												Class463.method7523(strings[i_351_], new StringBuilder().append(Class495.method8101(65535, -2029568107)).append(class602.aString7859).toString(), i_353_, i_352_, -1, (Class689.method13949(interface61, i_316_, i_317_, (short) -625)), i_316_, i_317_, true, false, (long) interface61.hashCode(), false, (byte) -113);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static boolean method1057(int i) {
		return 57 == i || i == 58 || i == 1007 || 25 == i || 30 == i;
	}

	static boolean method1058(int i) {
		if (i == 18 || 19 == i || 20 == i || 21 == i || i == 22 || 1004 == i)
			return true;
		if (17 == i)
			return true;
		return false;
	}

	static boolean method1059(int i) {
		if (i == 9 || i == 10 || 11 == i || 12 == i || 13 == i || 1003 == i)
			return true;
		if (8 == i)
			return true;
		return false;
	}

	static boolean method1060(int i) {
		if (i == 9 || i == 10 || 11 == i || 12 == i || 13 == i || 1003 == i)
			return true;
		if (8 == i)
			return true;
		return false;
	}

	static boolean method1061(int i) {
		return (44 == i || 45 == i || 46 == i || 47 == i || 48 == i || 49 == i || i == 50 || 51 == i || i == 52 || 53 == i || i == 15);
	}

	static String method1062(int i, int i_355_) {
		int i_356_ = i_355_ - i;
		if (i_356_ < -9)
			return Class495.method8101(16711680, 158196077);
		if (i_356_ < -6)
			return Class495.method8101(16723968, 1282828568);
		if (i_356_ < -3)
			return Class495.method8101(16740352, -601900227);
		if (i_356_ < 0)
			return Class495.method8101(16756736, -1257297000);
		if (i_356_ > 9)
			return Class495.method8101(65280, -151179962);
		if (i_356_ > 6)
			return Class495.method8101(4259584, -1682315458);
		if (i_356_ > 3)
			return Class495.method8101(8453888, -1270171157);
		if (i_356_ > 0)
			return Class495.method8101(12648192, 1563301000);
		return Class495.method8101(16776960, 166963685);
	}

	static boolean method1063(int i) {
		if (3 == i || 4 == i || 5 == i || i == 6 || i == 1001 || 1002 == i)
			return true;
		if (i == 2)
			return true;
		return false;
	}

	static boolean method1064(int i) {
		if (3 == i || 4 == i || 5 == i || i == 6 || i == 1001 || 1002 == i)
			return true;
		if (i == 2)
			return true;
		return false;
	}

	static void method1065(Class178 class178) {
		int i = -1744502791 * Whirlpool.anInt231;
		int i_357_ = Class194_Sub17.anInt9941 * 14756423;
		int i_358_ = -345535891 * BaseVarType.anInt5390;
		int i_359_ = Class523_Sub19.anInt10492 * 2080544711 - 3;
		int i_360_ = 20;
		if (null == Class659.aClass164_8505 || null == Class331.aClass10_3506) {
			Class659.aClass164_8505 = (Class164) (Class491.aClass423_5536.method6689(client.anInterface50_11044, 1212810739 * Class687_Sub2.anInt10826, true, true, -1965146305));
			Class331.aClass10_3506 = Class491.aClass423_5536.method6688((client.anInterface50_11044), (Class687_Sub2.anInt10826 * 1212810739), (byte) -14);
			if (null != Class659.aClass164_8505 && Class331.aClass10_3506 != null) {
				Class524.method8685(-522212835);
				int i_361_ = i_358_ / 2 + i;
				if (i_358_ + i_361_ > Class170.anInt1833 * 2141365743)
					i_361_ = 2141365743 * Class170.anInt1833 - i_358_;
				if (i_361_ < 0)
					i_361_ = 0;
				Class436.method6874(i_361_, 14756423 * Class194_Sub17.anInt9941, 2016217352);
				return;
			}
		}
		Class164 class164;
		if (null == Class659.aClass164_8505 || null == Class331.aClass10_3506)
			class164 = Class34.aClass164_319;
		else
			class164 = Class659.aClass164_8505;
		Class10 class10 = client.method17697(1130253352);
		Class683.method13865(class178, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_360_, class164, class10, Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -2), -478464567);
		int i_362_ = 255 - 148318499 * Class392.anInt4036 - 597769683 * anInt351;
		if (i_362_ < 0)
			i_362_ = 0;
		int i_363_ = Class642.aClass561_8334.method9426((byte) -97);
		int i_364_ = Class642.aClass561_8334.method9432(-985739290);
		if (!aBool327) {
			int i_365_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(2014633555)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -28))) {
				int i_366_ = (anInt323 * 1648921847 * (462991943 * anInt330 - 1 - i_365_) + (1 + (i_360_ + i_357_ + class10.anInt76 * -1669009881)));
				if (i_363_ > Whirlpool.anInt231 * -1744502791 && i_363_ < (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390) && i_364_ > i_366_ - class10.anInt76 * -1669009881 - 1 && i_364_ < -853549931 * class10.anInt80 + i_366_ && class523_sub27_sub6.aBool11635)
					class178.method3193(-1744502791 * Whirlpool.anInt231, i_366_ - -1669009881 * class10.anInt76, BaseVarType.anInt5390 * -345535891, anInt323 * 1648921847, (i_362_ << 24 | -627853313 * Class17.anInt192), 1);
				i_365_++;
			}
		} else {
			int i_367_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
				int i_368_ = (i_367_ * (1648921847 * anInt323) + (1 + (i_360_ + i_357_ + class10.anInt76 * -1669009881)));
				if (i_363_ > Whirlpool.anInt231 * -1744502791 && i_363_ < (Whirlpool.anInt231 * -1744502791 + -345535891 * BaseVarType.anInt5390) && i_364_ > i_368_ - -1669009881 * class10.anInt76 - 1 && i_364_ < i_368_ + class10.anInt80 * -853549931 && (1060081949 * class523_sub27_sub8.anInt11719 > 1 || (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).aBool11635)))
					class178.method3193(Whirlpool.anInt231 * -1744502791, i_368_ - -1669009881 * class10.anInt76, -345535891 * BaseVarType.anInt5390, 1648921847 * anInt323, (i_362_ << 24 | -627853313 * Class17.anInt192), 1);
				i_367_++;
			}
			if (aClass523_Sub27_Sub8_328 != null) {
				Class683.method13865(class178, Class523_Sub7.anInt10405 * 1464782871, 534142755 * Class301.anInt3330, 805194879 * Class426.anInt4824, 1850758193 * Class705.anInt8818, i_360_, class164, class10, aClass523_Sub27_Sub8_328.aString11720, -861211561);
				i_367_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868); null != class523_sub27_sub6; class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218)) {
					int i_369_ = (i_367_ * (1648921847 * anInt323) + (534142755 * Class301.anInt3330 + i_360_ + -1669009881 * class10.anInt76 + 1));
					if (i_363_ > Class523_Sub7.anInt10405 * 1464782871 && i_363_ < (Class426.anInt4824 * 805194879 + 1464782871 * Class523_Sub7.anInt10405) && i_364_ > i_369_ - -1669009881 * class10.anInt76 - 1 && i_364_ < i_369_ + class10.anInt80 * -853549931 && class523_sub27_sub6.aBool11635)
						class178.method3193(Class523_Sub7.anInt10405 * 1464782871, i_369_ - class10.anInt76 * -1669009881, 805194879 * Class426.anInt4824, 1648921847 * anInt323, i_362_ << 24 | Class17.anInt192 * -627853313, 1);
					i_367_++;
				}
				Class297.method5303(class178, Class523_Sub7.anInt10405 * 1464782871, 534142755 * Class301.anInt3330, 805194879 * Class426.anInt4824, Class705.anInt8818 * 1850758193, i_360_, (short) 30073);
			}
		}
		Class297.method5303(class178, -1744502791 * Whirlpool.anInt231, 14756423 * Class194_Sub17.anInt9941, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i_360_, (short) -8417);
		if (!aBool327) {
			int i_370_ = 0;
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(947012355)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -83))) {
				int i_371_ = (-1669009881 * class10.anInt76 + (i_357_ + i_360_) + 1 + (anInt330 * 462991943 - 1 - i_370_) * (anInt323 * 1648921847));
				Class676_Sub1.method16780(i_363_, i_364_, i, i_357_, i_358_, i_359_, i_371_, class523_sub27_sub6, class164, class10, 1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff, Class328_Sub3_Sub3.anInt11591 * -391136693 | ~0xffffff, 162873804);
				i_370_++;
			}
		} else {
			int i_372_ = 0;
			for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
				int i_373_ = (14756423 * Class194_Sub17.anInt9941 + i_360_ + -1669009881 * class10.anInt76 + 1 + i_372_ * (anInt323 * 1648921847));
				if (1 == 1060081949 * class523_sub27_sub8.anInt11719)
					Class676_Sub1.method16780(i_363_, i_364_, Whirlpool.anInt231 * -1744502791, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, 2080544711 * Class523_Sub19.anInt10492, i_373_, ((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class164, class10, (1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), 162873804);
				else
					Class660.method10861(i_363_, i_364_, -1744502791 * Whirlpool.anInt231, Class194_Sub17.anInt9941 * 14756423, -345535891 * BaseVarType.anInt5390, Class523_Sub19.anInt10492 * 2080544711, i_373_, class523_sub27_sub8, class164, class10, (Class328_Sub3_Sub3.anInt11590 * 1638226811 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), -1579629926);
				i_372_++;
			}
			if (null != aClass523_Sub27_Sub8_328) {
				i_372_ = 0;
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.first(-1426448868); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) aClass523_Sub27_Sub8_328.aClass697_11718.next(768418218)) {
					int i_374_ = (1 + (class10.anInt76 * -1669009881 + (i_360_ + Class301.anInt3330 * 534142755)) + 1648921847 * anInt323 * i_372_);
					Class676_Sub1.method16780(i_363_, i_364_, 1464782871 * Class523_Sub7.anInt10405, Class301.anInt3330 * 534142755, 805194879 * Class426.anInt4824, Class705.anInt8818 * 1850758193, i_374_, class523_sub27_sub6, class164, class10, (1638226811 * Class328_Sub3_Sub3.anInt11590 | ~0xffffff), (-391136693 * Class328_Sub3_Sub3.anInt11591 | ~0xffffff), 162873804);
					i_372_++;
				}
			}
		}
	}

	static void method1066(Player class647_sub1_sub3_sub1_sub2, boolean bool) {
		if (anInt330 * 462991943 < 409) {
			if (Class241.player == class647_sub1_sub3_sub1_sub2) {
				if (client.aBool11000 && 0 != (382935923 * Class570.anInt7658 & 0x10))
					Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16777215, -680747299)).append(Class39.aClass39_464.method1124(Class53_Sub20.aClass668_10979, (byte) -43)).toString(), Class684.anInt8664 * 2088669163, 16, -1, 0L, 0, 0, true, false, (long) (class647_sub1_sub3_sub1_sub2.anInt11888 * -1087669731), false, (byte) -18);
			} else {
				String string;
				if (0 == -476056167 * class647_sub1_sub3_sub1_sub2.anInt12189) {
					boolean bool_375_ = true;
					if ((Class241.player.anInt12178 * 1202781135) != -1 && -1 != (1202781135 * class647_sub1_sub3_sub1_sub2.anInt12178)) {
						int i = (((Class241.player.anInt12178) * 1202781135 < 1202781135 * (class647_sub1_sub3_sub1_sub2.anInt12178)) ? (1202781135 * (Class241.player.anInt12178)) : 1202781135 * (class647_sub1_sub3_sub1_sub2.anInt12178));
						int i_376_ = ((Class241.player.anInt12186) * 1773490063 - (1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186));
						if (i_376_ < 0)
							i_376_ = -i_376_;
						if (i_376_ > i)
							bool_375_ = false;
					}
					String string_377_ = (client.aClass681_11284 == Class681.aClass681_8641 ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -82)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -73)));
					if (class647_sub1_sub3_sub1_sub2.anInt12186 * 1773490063 >= 98635177 * class647_sub1_sub3_sub1_sub2.anInt12187)
						string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 1361985780)).append(bool_375_ ? (Class443.method7204((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)), (1773490063 * (Class241.player.anInt12186)), (byte) -110)) : Class495.method8101(16777215, -722134032)).append(Class31.aString297).append(string_377_).append(1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186).append(Class31.aString295).toString();
					else
						string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 32321930)).append(bool_375_ ? (Class443.method7204((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)), (1773490063 * (Class241.player.anInt12186)), (byte) -56)) : Class495.method8101(16777215, -668399905)).append(Class31.aString297).append(string_377_).append(1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186).append("+").append((98635177 * class647_sub1_sub3_sub1_sub2.anInt12187) - (class647_sub1_sub3_sub1_sub2.anInt12186 * 1773490063)).append(Class31.aString295).toString();
				} else if (-1 == (-476056167 * class647_sub1_sub3_sub1_sub2.anInt12189))
					string = class647_sub1_sub3_sub1_sub2.method18682(true, 2023174561);
				else
					string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 678056818)).append(Class31.aString297).append(Class39.aClass39_526.method1124(Class53_Sub20.aClass668_10979, (byte) -82)).append(class647_sub1_sub3_sub1_sub2.anInt12189 * -476056167).append(Class31.aString295).toString();
				boolean bool_378_ = false;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && -1 != -1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106)) {
					NPCDefinition class300 = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) 61)));
					if (class300.aBool3308) {
						bool_378_ = true;
						string = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) 32))).name;
						if (0 != class300.anInt3295 * -380812719) {
							String string_379_ = ((Class681.aClass681_8641 == client.aClass681_11284) ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -83)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -94)));
							string = new StringBuilder().append(string).append(Class443.method7204(class300.anInt3295 * -380812719, (Class241.player.anInt12186) * 1773490063, (byte) -36)).append(Class31.aString297).append(string_379_).append(class300.anInt3295 * -380812719).append(Class31.aString295).toString();
						}
					}
				}
				if (client.aBool11000 && !bool && (382935923 * Class570.anInt7658 & 0x8) != 0)
					Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16777215, -421297816)).append(string).toString(), 2088669163 * Class684.anInt8664, 15, -1, (long) (class647_sub1_sub3_sub1_sub2.anInt11888 * -1087669731), 0, 0, true, false, (long) (-1087669731 * class647_sub1_sub3_sub1_sub2.anInt11888), false, (byte) -105);
				if (!bool) {
					for (int i = 7; i >= 0; i--) {
						if (null != client.aStringArray11316[i]) {
							short i_380_ = 0;
							if ((Class681.aClass681_8646 == client.aClass681_11284) && (client.aStringArray11316[i].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -128)))) {
								if (Class614.aClass614_8020 == client.aClass614_11032)
									i_380_ = (short) 2000;
								else if ((Class614.aClass614_8022 == client.aClass614_11032) && ((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)) > (Class241.player.anInt12186) * 1773490063))
									i_380_ = (short) 2000;
								if ((0 != (-514698785 * (Class241.player.anInt12192))) && 0 != (-514698785 * (class647_sub1_sub3_sub1_sub2.anInt12192))) {
									if ((-514698785 * (class647_sub1_sub3_sub1_sub2.anInt12192)) == (Class241.player.anInt12192) * -514698785)
										i_380_ = (short) 2000;
									else
										i_380_ = (short) 0;
								} else if (class647_sub1_sub3_sub1_sub2.isInAClan)
									i_380_ = (short) 2000;
							} else if (client.aBoolArray11169[i])
								i_380_ = (short) 2000;
							short i_381_ = (short) (i_380_ + client.aShortArray11166[i]);
							int i_382_ = (-1 != client.anIntArray11167[i] ? client.anIntArray11167[i] : client.anInt11179 * 952073761);
							int i_383_ = bool_378_ ? 16776960 : 16777215;
							Class463.method7523(client.aStringArray11316[i], new StringBuilder().append(Class495.method8101(i_383_, -1785306132)).append(string).toString(), i_382_, i_381_, -1, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), 0, 0, true, false, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), false, (byte) -15);
						}
					}
				} else if (!bool_378_)
					Class463.method7523(new StringBuilder().append(Class495.method8101(13421772, -1626529382)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), false, (byte) -23);
				if (!bool && !bool_378_) {
					for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(873099932)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -39))) {
						if (23 == class523_sub27_sub6.anInt11639 * -2101009827) {
							class523_sub27_sub6.aString11633 = new StringBuilder().append(Class495.method8101(16777215, -1112176146)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static void method1067(Player class647_sub1_sub3_sub1_sub2, boolean bool) {
		if (anInt330 * 462991943 < 409) {
			if (Class241.player == class647_sub1_sub3_sub1_sub2) {
				if (client.aBool11000 && 0 != (382935923 * Class570.anInt7658 & 0x10))
					Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16777215, -185188298)).append(Class39.aClass39_464.method1124(Class53_Sub20.aClass668_10979, (byte) -92)).toString(), Class684.anInt8664 * 2088669163, 16, -1, 0L, 0, 0, true, false, (long) (class647_sub1_sub3_sub1_sub2.anInt11888 * -1087669731), false, (byte) -112);
			} else {
				String string;
				if (0 == -476056167 * class647_sub1_sub3_sub1_sub2.anInt12189) {
					boolean bool_384_ = true;
					if ((Class241.player.anInt12178 * 1202781135) != -1 && -1 != (1202781135 * class647_sub1_sub3_sub1_sub2.anInt12178)) {
						int i = (((Class241.player.anInt12178) * 1202781135 < 1202781135 * (class647_sub1_sub3_sub1_sub2.anInt12178)) ? (1202781135 * (Class241.player.anInt12178)) : 1202781135 * (class647_sub1_sub3_sub1_sub2.anInt12178));
						int i_385_ = ((Class241.player.anInt12186) * 1773490063 - (1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186));
						if (i_385_ < 0)
							i_385_ = -i_385_;
						if (i_385_ > i)
							bool_384_ = false;
					}
					String string_386_ = (client.aClass681_11284 == Class681.aClass681_8641 ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -87)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -27)));
					if (class647_sub1_sub3_sub1_sub2.anInt12186 * 1773490063 >= 98635177 * class647_sub1_sub3_sub1_sub2.anInt12187)
						string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 436297856)).append(bool_384_ ? (Class443.method7204((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)), (1773490063 * (Class241.player.anInt12186)), (byte) -75)) : Class495.method8101(16777215, 1791034041)).append(Class31.aString297).append(string_386_).append(1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186).append(Class31.aString295).toString();
					else
						string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 1963265329)).append(bool_384_ ? (Class443.method7204((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)), (1773490063 * (Class241.player.anInt12186)), (byte) -93)) : Class495.method8101(16777215, -313949135)).append(Class31.aString297).append(string_386_).append(1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186).append("+").append((98635177 * class647_sub1_sub3_sub1_sub2.anInt12187) - (class647_sub1_sub3_sub1_sub2.anInt12186 * 1773490063)).append(Class31.aString295).toString();
				} else if (-1 == (-476056167 * class647_sub1_sub3_sub1_sub2.anInt12189))
					string = class647_sub1_sub3_sub1_sub2.method18682(true, 564821992);
				else
					string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, -128885650)).append(Class31.aString297).append(Class39.aClass39_526.method1124(Class53_Sub20.aClass668_10979, (byte) -46)).append(class647_sub1_sub3_sub1_sub2.anInt12189 * -476056167).append(Class31.aString295).toString();
				boolean bool_387_ = false;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && -1 != -1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106)) {
					NPCDefinition class300 = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) 13)));
					if (class300.aBool3308) {
						bool_387_ = true;
						string = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) 6))).name;
						if (0 != class300.anInt3295 * -380812719) {
							String string_388_ = ((Class681.aClass681_8641 == client.aClass681_11284) ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -110)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -124)));
							string = new StringBuilder().append(string).append(Class443.method7204(class300.anInt3295 * -380812719, (Class241.player.anInt12186) * 1773490063, (byte) -61)).append(Class31.aString297).append(string_388_).append(class300.anInt3295 * -380812719).append(Class31.aString295).toString();
						}
					}
				}
				if (client.aBool11000 && !bool && (382935923 * Class570.anInt7658 & 0x8) != 0)
					Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16777215, 720562959)).append(string).toString(), 2088669163 * Class684.anInt8664, 15, -1, (long) (class647_sub1_sub3_sub1_sub2.anInt11888 * -1087669731), 0, 0, true, false, (long) (-1087669731 * class647_sub1_sub3_sub1_sub2.anInt11888), false, (byte) 57);
				if (!bool) {
					for (int i = 7; i >= 0; i--) {
						if (null != client.aStringArray11316[i]) {
							short i_389_ = 0;
							if ((Class681.aClass681_8646 == client.aClass681_11284) && (client.aStringArray11316[i].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -40)))) {
								if (Class614.aClass614_8020 == client.aClass614_11032)
									i_389_ = (short) 2000;
								else if ((Class614.aClass614_8022 == client.aClass614_11032) && ((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)) > (Class241.player.anInt12186) * 1773490063))
									i_389_ = (short) 2000;
								if ((0 != (-514698785 * (Class241.player.anInt12192))) && 0 != (-514698785 * (class647_sub1_sub3_sub1_sub2.anInt12192))) {
									if ((-514698785 * (class647_sub1_sub3_sub1_sub2.anInt12192)) == (Class241.player.anInt12192) * -514698785)
										i_389_ = (short) 2000;
									else
										i_389_ = (short) 0;
								} else if (class647_sub1_sub3_sub1_sub2.isInAClan)
									i_389_ = (short) 2000;
							} else if (client.aBoolArray11169[i])
								i_389_ = (short) 2000;
							short i_390_ = (short) (i_389_ + client.aShortArray11166[i]);
							int i_391_ = (-1 != client.anIntArray11167[i] ? client.anIntArray11167[i] : client.anInt11179 * 952073761);
							int i_392_ = bool_387_ ? 16776960 : 16777215;
							Class463.method7523(client.aStringArray11316[i], new StringBuilder().append(Class495.method8101(i_392_, -1432206500)).append(string).toString(), i_391_, i_390_, -1, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), 0, 0, true, false, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), false, (byte) 36);
						}
					}
				} else if (!bool_387_)
					Class463.method7523(new StringBuilder().append(Class495.method8101(13421772, 1618055342)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), false, (byte) 24);
				if (!bool && !bool_387_) {
					for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1649425048)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) 31))) {
						if (23 == class523_sub27_sub6.anInt11639 * -2101009827) {
							class523_sub27_sub6.aString11633 = new StringBuilder().append(Class495.method8101(16777215, -1983514899)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static String method1068(InterfaceComponentDefinitions class250, int i) {
		if (!client.method17252(class250).method15966(i, -1629310735) && class250.anObjectArray2661 == null)
			return null;
		if (class250.aStringArray2626 == null || class250.aStringArray2626.length <= i || null == class250.aStringArray2626[i] || class250.aStringArray2626[i].trim().length() == 0) {
			if (client.aBool11180)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class250.aStringArray2626[i];
	}

	static void method1069(int i, int i_393_) {
		if (Class523_Sub11.aClass625_10427.aBool8147 || (1 != 462991943 * anInt330 && (!Class318.aBool3431 || 462991943 * anInt330 != 2 || !(aClass523_Sub27_Sub6_333.aString11629.equals(Class39.aClass39_510.method1124((Class53_Sub20.aClass668_10979), (byte) -45)))))) {
			Class10 class10 = client.method17697(2048545244);
			int i_394_ = class10.method597((Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -91)), -1759656773);
			int i_395_;
			if (!aBool327) {
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1977832871)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) 4))) {
					int i_396_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
					if (i_396_ > i_394_)
						i_394_ = i_396_;
				}
				i_394_ += 8;
				i_395_ = anInt330 * 462991943 * (anInt323 * 1648921847) + 21;
				Class523_Sub19.anInt10492 = (((aBool353 ? 26 : 22) + anInt330 * 462991943 * (1648921847 * anInt323)) * 1395259895);
			} else {
				for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
					int i_397_;
					if (1 == class523_sub27_sub8.anInt11719 * 1060081949)
						i_397_ = Class269.method4924(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class10, 1003475374);
					else
						i_397_ = Class323.method5727(class523_sub27_sub8, class10, -1279706673);
					if (i_397_ > i_394_)
						i_394_ = i_397_;
				}
				i_394_ += 8;
				i_395_ = anInt336 * -914479837 * (1648921847 * anInt323) + 21;
				Class523_Sub19.anInt10492 = 1395259895 * ((aBool353 ? 26 : 22) + anInt323 * 1648921847 * (-914479837 * anInt336));
			}
			i_394_ += 10;
			int i_398_ = i - i_394_ / 2;
			if (i_398_ + i_394_ > Class170.anInt1833 * 2141365743)
				i_398_ = Class170.anInt1833 * 2141365743 - i_394_;
			if (i_398_ < 0)
				i_398_ = 0;
			int i_399_ = i_393_;
			if (i_399_ + i_395_ > -495986435 * Class254.anInt2742)
				i_399_ = -495986435 * Class254.anInt2742 - i_395_;
			if (i_399_ < 0)
				i_399_ = 0;
			Whirlpool.anInt231 = 1963954761 * i_398_;
			Class194_Sub17.anInt9941 = i_399_ * 1068719991;
			BaseVarType.anInt5390 = -2064511131 * i_394_;
			anInt351 = (int) (Math.random() * 24.0) * -972873125;
			aBool326 = true;
		}
	}

	public static String method1070(Class523_Sub27_Sub6 class523_sub27_sub6) {
		if (aBool326 || null == class523_sub27_sub6)
			return "";
		if ((class523_sub27_sub6.aString11637 == null || class523_sub27_sub6.aString11637.length() == 0) && null != class523_sub27_sub6.aString11633 && class523_sub27_sub6.aString11633.length() > 0)
			return class523_sub27_sub6.aString11633;
		return class523_sub27_sub6.aString11637;
	}

	static void method1071(Class523_Sub27_Sub6 class523_sub27_sub6, int i, int i_400_, boolean bool) {
		if (null != class523_sub27_sub6 && aClass708_342.aClass523_8838 != class523_sub27_sub6) {
			int i_401_ = class523_sub27_sub6.anInt11634 * -1947252983;
			int i_402_ = -967967353 * class523_sub27_sub6.anInt11640;
			int i_403_ = -2101009827 * class523_sub27_sub6.anInt11639;
			int i_404_ = (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L);
			long l = 7768112170675051057L * class523_sub27_sub6.aLong11632;
			if (i_403_ >= 2000)
				i_403_ -= 2000;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			if (25 == i_403_) {
				InterfaceComponentDefinitions class250 = Class654.method10722(i_402_, i_401_, (byte) -53);
				if (null != class250) {
					Class399.method6533(631595286);
					InterfaceComponentSettings class523_sub13 = client.method17252(class250);
					Class225.method4157(class250, class523_sub13.method15964(-385247561), 330664637 * class523_sub13.anInt10454, (byte) 1);
					client.aString11016 = Class188.method3596(class250, 1314629078);
					if (null == client.aString11016)
						client.aString11016 = "Null";
					client.aString11225 = new StringBuilder().append(class250.aString2639).append(Class495.method8101(16777215, 804309705)).toString();
				}
			} else {
				if (16 == i_403_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_400_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4214, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -1376552782);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 97);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((Class241.player.anInt11888) * -1087669731, (byte) -72);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-325213033 * client.anInt11095, (byte) -122);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 37) ? 1 : 0, 610825780);
					client.aClass116_11058.method1974(class523_sub22, (byte) 118);
				}
				if (i_403_ == 1008 || i_403_ == 1009 || i_403_ == 1010 || 1011 == i_403_ || 1012 == i_403_)
					Class198.method3676(i_403_, i_404_, i_401_, (byte) -55);
				if (i_403_ == 2) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_400_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.INTERFACE_ON_OBJECT_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -1727859364);
					class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 61) ? 1 : 0, -159492164);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt((int) (l >>> 32) & 0x7fffffff, -1030358551);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(class592.localX * 235453015 + i_401_, (byte) 21);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1034378319 * client.anInt11105, (byte) -79);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_402_ + 1704054549 * class592.localY, (byte) -125);
					client.aClass116_11058.method1974(class523_sub22, (byte) 99);
					Class581.method9664(i_401_, i_402_, -105157506);
				}
				OutgoingPacket class408 = null;
				if (9 == i_403_)
					class408 = OutgoingPacket.NPC_CLICK_1_PACKET;
				else if (i_403_ == 10)
					class408 = OutgoingPacket.ATTACK_NPC_PACKET;
				else if (i_403_ == 11)
					class408 = OutgoingPacket.NPC_CLICK_2_PACKET;
				else if (12 == i_403_)
					class408 = OutgoingPacket.NPC_CLICK_3_PACKET;
				else if (i_403_ == 13)
					class408 = OutgoingPacket.aClass408_4292;
				else if (i_403_ == 1003)
					class408 = OutgoingPacket.NPC_EXAMINE_PACKET;
				if (class408 != null) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_404_));
					if (class523_sub28 != null) {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_400_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 92) ? 1 : 0, (byte) 10);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_404_, (byte) 23);
						client.aClass116_11058.method1974(class523_sub22, (byte) 117);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), 717511493);
					}
				}
				if (i_403_ == 59) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_400_ * 1014439817;
					client.anInt11135 = -457701609;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4251, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(-325213033 * client.anInt11095, -268949889);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(-1034378319 * client.anInt11105, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(235453015 * class592.localX + i_401_, -1358492550);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1383041209 * Class232.anInt2367, -957825467);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_402_, -1262882661);
					client.aClass116_11058.method1974(class523_sub22, (byte) 88);
					Class581.method9664(i_401_, i_402_, 1108691477);
				}
				OutgoingPacket class408_405_ = null;
				if (18 == i_403_)
					class408_405_ = OutgoingPacket.aClass408_4228;
				else if (i_403_ == 19)
					class408_405_ = OutgoingPacket.aClass408_4274;
				else if (i_403_ == 20)
					class408_405_ = OutgoingPacket.TAKE_GROUND_ITEM_PACKET;
				else if (21 == i_403_)
					class408_405_ = OutgoingPacket.aClass408_4298;
				else if (22 == i_403_)
					class408_405_ = OutgoingPacket.aClass408_4232;
				else if (i_403_ == 1004)
					class408_405_ = OutgoingPacket.GROUND_ITEM_OPTION_2_PACKET;
				if (null != class408_405_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_400_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_405_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_404_, -787383610);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_401_ + class592.localX * 235453015, (byte) -113);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((bool ? 2 : 0) | (Class315.method5677((byte) 85) ? 1 : 0), 560049819);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(1704054549 * class592.localY + i_402_, (byte) -70);
					client.aClass116_11058.method1974(class523_sub22, (byte) 17);
					Class581.method9664(i_401_, i_402_, -460930729);
				}
				if (60 == i_403_) {
					if (client.rights * -1746920271 > 0 && WorldVarDomainType.method15902(1903110918))
						RSSocket.method506((Class241.player.aByte10821), (i_401_ + 235453015 * class592.localX), (1704054549 * class592.localY + i_402_), -1631418497);
					else {
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = 1014439817 * i_400_;
						client.anInt11135 = -457701609;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4267), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_402_ + 1704054549 * class592.localY, 1900660765);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_401_ + class592.localX * 235453015, -1262882661);
						client.aClass116_11058.method1974(class523_sub22, (byte) 91);
					}
				}
				if (17 == i_403_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = 1014439817 * i_400_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4268, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_404_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(235453015 * class592.localX + i_401_, (byte) -34);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 31) ? 1 : 0, (byte) 74);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11105 * -1034378319, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(client.anInt11095 * -325213033, (byte) 28);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(class592.localY * 1704054549 + i_402_, -1152686651);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, -778558422);
					client.aClass116_11058.method1974(class523_sub22, (byte) 82);
					Class581.method9664(i_401_, i_402_, 1289938514);
				}
				if (15 == i_403_) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_404_]);
					if (class647_sub1_sub3_sub1_sub2 != null) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = i_400_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4214), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -824298449);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 21);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_404_, (byte) -15);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11095 * -325213033, (byte) -127);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 42) ? 1 : 0, 982275001);
						client.aClass116_11058.method1974(class523_sub22, (byte) 113);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), -254093427);
					}
				}
				if (58 == i_403_) {
					InterfaceComponentDefinitions class250 = Class654.method10722(i_402_, i_401_, (byte) -97);
					if (null != class250)
						Class446.method7240(class250, (byte) -18);
				}
				if (i_403_ == 23) {
					if (-1746920271 * client.rights > 0 && WorldVarDomainType.method15902(-1033045831))
						RSSocket.method506((Class241.player.aByte10821), (i_401_ + 235453015 * class592.localX), (i_402_ + 1704054549 * class592.localY), -2140524285);
					else {
						Class523_Sub22 class523_sub22 = Class446.method7239(i_401_, i_402_, i_404_, -1705087139);
						if (i_404_ == 1) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, -1063956224);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, -537827650);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) client.aFloat11129, (byte) -39);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(57, 1420970948);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(724985463 * client.anInt11094, 1597100550);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1193506389 * client.anInt11068, -1641910292);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(89, 44333275);
							Class437 class437 = (Class241.player.method10569().aClass437_4862);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4903, (byte) -4);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4905, (byte) -53);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(63, 681566380);
						} else {
							client.anInt11117 = i * -685128629;
							client.anInt11122 = 1014439817 * i_400_;
							client.anInt11135 = -457701609;
							client.anInt11134 = 0;
						}
						client.aClass116_11058.method1974(class523_sub22, (byte) 84);
						Class581.method9664(i_401_, i_402_, 2069768767);
					}
				}
				OutgoingPacket class408_406_ = null;
				if (44 == i_403_)
					class408_406_ = OutgoingPacket.aClass408_4304;
				else if (i_403_ == 45)
					class408_406_ = OutgoingPacket.aClass408_4206;
				else if (i_403_ == 46)
					class408_406_ = OutgoingPacket.aClass408_4273;
				else if (47 == i_403_)
					class408_406_ = OutgoingPacket.aClass408_4221;
				else if (48 == i_403_)
					class408_406_ = OutgoingPacket.aClass408_4303;
				else if (49 == i_403_)
					class408_406_ = OutgoingPacket.aClass408_4271;
				else if (i_403_ == 50)
					class408_406_ = OutgoingPacket.aClass408_4234;
				else if (51 == i_403_)
					class408_406_ = OutgoingPacket.aClass408_4258;
				else if (52 == i_403_)
					class408_406_ = OutgoingPacket.aClass408_4230;
				else if (i_403_ == 53)
					class408_406_ = OutgoingPacket.aClass408_4305;
				if (null != class408_406_) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_404_]);
					if (null != class647_sub1_sub3_sub1_sub2) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_400_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_406_, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 38) ? 1 : 0, -159492164);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_404_, (byte) 93);
						client.aClass116_11058.method1974(class523_sub22, (byte) 60);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), 568374503);
					}
				}
				if (i_403_ == 30 && null == client.aClass250_11189) {
					NetworkStream.method9225(i_402_, i_401_, 1369556809);
					client.aClass250_11189 = Class654.method10722(i_402_, i_401_, (byte) -85);
					if (client.aClass250_11189 != null)
						Login.method15991(client.aClass250_11189, (byte) -32);
				}
				if (i_403_ == 8) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_404_));
					if (class523_sub28 != null) {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = i_400_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4236), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, -1686024948);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 69) ? 1 : 0, -500703585);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_404_, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 44);
						client.aClass116_11058.method1974(class523_sub22, (byte) 22);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), 1195745647);
					}
				}
				if (i_403_ == 57 || i_403_ == 1007)
					Class553.method9164(i_404_, i_402_, i_401_, class523_sub27_sub6.aString11637, 2117686411);
				OutgoingPacket class408_407_ = null;
				if (i_403_ == 3)
					class408_407_ = OutgoingPacket.OBJECT_CLICK_1_PACKET;
				else if (i_403_ == 4)
					class408_407_ = OutgoingPacket.aClass408_4243;
				else if (5 == i_403_)
					class408_407_ = OutgoingPacket.aClass408_4244;
				else if (6 == i_403_)
					class408_407_ = OutgoingPacket.aClass408_4245;
				else if (1001 == i_403_)
					class408_407_ = OutgoingPacket.aClass408_4222;
				else if (i_403_ == 1002)
					class408_407_ = OutgoingPacket.OBJECT_EXAMINE_PACKET;
				if (null != class408_407_) {
					client.anInt11117 = i * -685128629;
					client.anInt11122 = 1014439817 * i_400_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_407_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 31) ? 1 : 0, -1238997638);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_402_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2((int) (l >>> 32) & 0x7fffffff, 458319359);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_401_ + class592.localX * 235453015, -2013961684);
					client.aClass116_11058.method1974(class523_sub22, (byte) 21);
					Class581.method9664(i_401_, i_402_, -594557336);
				}
				if (client.aBool11000)
					Class399.method6533(-1262194708);
				if (null != Class436.aClass250_4899 && client.anInt11173 * -1412331351 == 0)
					Login.method15991(Class436.aClass250_4899, (byte) -81);
			}
		}
	}

	static void method1072(Class523_Sub27_Sub6 class523_sub27_sub6, int i, int i_408_, boolean bool) {
		if (null != class523_sub27_sub6 && aClass708_342.aClass523_8838 != class523_sub27_sub6) {
			int i_409_ = class523_sub27_sub6.anInt11634 * -1947252983;
			int i_410_ = -967967353 * class523_sub27_sub6.anInt11640;
			int i_411_ = -2101009827 * class523_sub27_sub6.anInt11639;
			int i_412_ = (int) (class523_sub27_sub6.aLong11632 * 7768112170675051057L);
			long l = 7768112170675051057L * class523_sub27_sub6.aLong11632;
			if (i_411_ >= 2000)
				i_411_ -= 2000;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			if (25 == i_411_) {
				InterfaceComponentDefinitions class250 = Class654.method10722(i_410_, i_409_, (byte) 60);
				if (null != class250) {
					Class399.method6533(-784403166);
					InterfaceComponentSettings class523_sub13 = client.method17252(class250);
					Class225.method4157(class250, class523_sub13.method15964(-1494184336), 330664637 * class523_sub13.anInt10454, (byte) -43);
					client.aString11016 = Class188.method3596(class250, -1634777228);
					if (null == client.aString11016)
						client.aString11016 = "Null";
					client.aString11225 = new StringBuilder().append(class250.aString2639).append(Class495.method8101(16777215, -2121682203)).toString();
				}
			} else {
				if (16 == i_411_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_408_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4214, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -919441370);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 91);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((Class241.player.anInt11888) * -1087669731, (byte) -17);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-325213033 * client.anInt11095, (byte) -62);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 99) ? 1 : 0, 860974945);
					client.aClass116_11058.method1974(class523_sub22, (byte) 77);
				}
				if (i_411_ == 1008 || i_411_ == 1009 || i_411_ == 1010 || 1011 == i_411_ || 1012 == i_411_)
					Class198.method3676(i_411_, i_412_, i_409_, (byte) -122);
				if (i_411_ == 2) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_408_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.INTERFACE_ON_OBJECT_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -1689751859);
					class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 13) ? 1 : 0, -159492164);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt((int) (l >>> 32) & 0x7fffffff, -2013570372);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(class592.localX * 235453015 + i_409_, (byte) 21);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1034378319 * client.anInt11105, (byte) -44);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_410_ + 1704054549 * class592.localY, (byte) -20);
					client.aClass116_11058.method1974(class523_sub22, (byte) 34);
					Class581.method9664(i_409_, i_410_, 1453670771);
				}
				OutgoingPacket class408 = null;
				if (9 == i_411_)
					class408 = OutgoingPacket.NPC_CLICK_1_PACKET;
				else if (i_411_ == 10)
					class408 = OutgoingPacket.ATTACK_NPC_PACKET;
				else if (i_411_ == 11)
					class408 = OutgoingPacket.NPC_CLICK_2_PACKET;
				else if (12 == i_411_)
					class408 = OutgoingPacket.NPC_CLICK_3_PACKET;
				else if (i_411_ == 13)
					class408 = OutgoingPacket.aClass408_4292;
				else if (i_411_ == 1003)
					class408 = OutgoingPacket.NPC_EXAMINE_PACKET;
				if (class408 != null) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_412_));
					if (class523_sub28 != null) {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_408_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 69) ? 1 : 0, (byte) 11);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_412_, (byte) 49);
						client.aClass116_11058.method1974(class523_sub22, (byte) 16);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), -1235679423);
					}
				}
				if (i_411_ == 59) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_408_ * 1014439817;
					client.anInt11135 = -457701609;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4251, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(-325213033 * client.anInt11095, -866936029);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(-1034378319 * client.anInt11105, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(235453015 * class592.localX + i_409_, 921372925);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1383041209 * Class232.anInt2367, -1623791779);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_410_, -1262882661);
					client.aClass116_11058.method1974(class523_sub22, (byte) 21);
					Class581.method9664(i_409_, i_410_, -1093837420);
				}
				OutgoingPacket class408_413_ = null;
				if (18 == i_411_)
					class408_413_ = OutgoingPacket.aClass408_4228;
				else if (i_411_ == 19)
					class408_413_ = OutgoingPacket.aClass408_4274;
				else if (i_411_ == 20)
					class408_413_ = OutgoingPacket.TAKE_GROUND_ITEM_PACKET;
				else if (21 == i_411_)
					class408_413_ = OutgoingPacket.aClass408_4298;
				else if (22 == i_411_)
					class408_413_ = OutgoingPacket.aClass408_4232;
				else if (i_411_ == 1004)
					class408_413_ = OutgoingPacket.GROUND_ITEM_OPTION_2_PACKET;
				if (null != class408_413_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = i_408_ * 1014439817;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_413_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_412_, 304316569);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_409_ + class592.localX * 235453015, (byte) -29);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((bool ? 2 : 0) | (Class315.method5677((byte) 107) ? 1 : 0), 1898827039);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(1704054549 * class592.localY + i_410_, (byte) -39);
					client.aClass116_11058.method1974(class523_sub22, (byte) 39);
					Class581.method9664(i_409_, i_410_, 1474594788);
				}
				if (60 == i_411_) {
					if (client.rights * -1746920271 > 0 && WorldVarDomainType.method15902(1958647551))
						RSSocket.method506((Class241.player.aByte10821), (i_409_ + 235453015 * class592.localX), (1704054549 * class592.localY + i_410_), -1182588027);
					else {
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = 1014439817 * i_408_;
						client.anInt11135 = -457701609;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4267), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_410_ + 1704054549 * class592.localY, -773011580);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_409_ + class592.localX * 235453015, -1262882661);
						client.aClass116_11058.method1974(class523_sub22, (byte) 93);
					}
				}
				if (17 == i_411_) {
					client.anInt11117 = -685128629 * i;
					client.anInt11122 = 1014439817 * i_408_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4268, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_412_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(235453015 * class592.localX + i_409_, (byte) -10);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByteC(Class315.method5677((byte) 44) ? 1 : 0, (byte) 10);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11105 * -1034378319, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(client.anInt11095 * -325213033, (byte) 27);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(class592.localY * 1704054549 + i_410_, 91036234);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, 677979971);
					client.aClass116_11058.method1974(class523_sub22, (byte) 28);
					Class581.method9664(i_409_, i_410_, 552197817);
				}
				if (15 == i_411_) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_412_]);
					if (class647_sub1_sub3_sub1_sub2 != null) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = i_408_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4214), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(Class232.anInt2367 * 1383041209, -756547678);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 92);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i_412_, (byte) -38);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11095 * -325213033, (byte) -83);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 70) ? 1 : 0, -1858158234);
						client.aClass116_11058.method1974(class523_sub22, (byte) 118);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), -566595583);
					}
				}
				if (58 == i_411_) {
					InterfaceComponentDefinitions class250 = Class654.method10722(i_410_, i_409_, (byte) -28);
					if (null != class250)
						Class446.method7240(class250, (byte) -101);
				}
				if (i_411_ == 23) {
					if (-1746920271 * client.rights > 0 && WorldVarDomainType.method15902(1676330976))
						RSSocket.method506((Class241.player.aByte10821), (i_409_ + 235453015 * class592.localX), (i_410_ + 1704054549 * class592.localY), -1976575495);
					else {
						Class523_Sub22 class523_sub22 = Class446.method7239(i_409_, i_410_, i_412_, -1861331612);
						if (i_412_ == 1) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, 1678602689);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1, -1651548229);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) client.aFloat11129, (byte) -9);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(57, 2002382329);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(724985463 * client.anInt11094, 602320329);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(-1193506389 * client.anInt11068, -1425075486);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(89, -1245809696);
							Class437 class437 = (Class241.player.method10569().aClass437_4862);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4903, (byte) -36);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((int) class437.aFloat4905, (byte) -50);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(63, 795422503);
						} else {
							client.anInt11117 = i * -685128629;
							client.anInt11122 = 1014439817 * i_408_;
							client.anInt11135 = -457701609;
							client.anInt11134 = 0;
						}
						client.aClass116_11058.method1974(class523_sub22, (byte) 101);
						Class581.method9664(i_409_, i_410_, 1882540251);
					}
				}
				OutgoingPacket class408_414_ = null;
				if (44 == i_411_)
					class408_414_ = OutgoingPacket.aClass408_4304;
				else if (i_411_ == 45)
					class408_414_ = OutgoingPacket.aClass408_4206;
				else if (i_411_ == 46)
					class408_414_ = OutgoingPacket.aClass408_4273;
				else if (47 == i_411_)
					class408_414_ = OutgoingPacket.aClass408_4221;
				else if (48 == i_411_)
					class408_414_ = OutgoingPacket.aClass408_4303;
				else if (49 == i_411_)
					class408_414_ = OutgoingPacket.aClass408_4271;
				else if (i_411_ == 50)
					class408_414_ = OutgoingPacket.aClass408_4234;
				else if (51 == i_411_)
					class408_414_ = OutgoingPacket.aClass408_4258;
				else if (52 == i_411_)
					class408_414_ = OutgoingPacket.aClass408_4230;
				else if (i_411_ == 53)
					class408_414_ = OutgoingPacket.aClass408_4305;
				if (null != class408_414_) {
					Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_412_]);
					if (null != class647_sub1_sub3_sub1_sub2) {
						client.anInt11117 = i * -685128629;
						client.anInt11122 = 1014439817 * i_408_;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_414_, (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 9) ? 1 : 0, -159492164);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_412_, (byte) 50);
						client.aClass116_11058.method1974(class523_sub22, (byte) 91);
						Class581.method9664((class647_sub1_sub3_sub1_sub2.screenX[0]), (class647_sub1_sub3_sub1_sub2.screenY[0]), 2024517439);
					}
				}
				if (i_411_ == 30 && null == client.aClass250_11189) {
					NetworkStream.method9225(i_410_, i_409_, 1369556809);
					client.aClass250_11189 = Class654.method10722(i_410_, i_409_, (byte) 46);
					if (client.aClass250_11189 != null)
						Login.method15991(client.aClass250_11189, (byte) -73);
				}
				if (i_411_ == 8) {
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_412_));
					if (class523_sub28 != null) {
						NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
						client.anInt11117 = -685128629 * i;
						client.anInt11122 = i_408_ * 1014439817;
						client.anInt11135 = -915403218;
						client.anInt11134 = 0;
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4236), (client.aClass116_11058.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(Class232.anInt2367 * 1383041209, -1539880001);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 76) ? 1 : 0, 1045144778);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(client.anInt11095 * -325213033, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_412_, -1262882661);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1034378319 * client.anInt11105, (byte) 61);
						client.aClass116_11058.method1974(class523_sub22, (byte) 113);
						Class581.method9664((class647_sub1_sub3_sub1_sub1.screenX[0]), (class647_sub1_sub3_sub1_sub1.screenY[0]), -887245691);
					}
				}
				if (i_411_ == 57 || i_411_ == 1007)
					Class553.method9164(i_412_, i_410_, i_409_, class523_sub27_sub6.aString11637, 1228056342);
				OutgoingPacket class408_415_ = null;
				if (i_411_ == 3)
					class408_415_ = OutgoingPacket.OBJECT_CLICK_1_PACKET;
				else if (i_411_ == 4)
					class408_415_ = OutgoingPacket.aClass408_4243;
				else if (5 == i_411_)
					class408_415_ = OutgoingPacket.aClass408_4244;
				else if (6 == i_411_)
					class408_415_ = OutgoingPacket.aClass408_4245;
				else if (1001 == i_411_)
					class408_415_ = OutgoingPacket.aClass408_4222;
				else if (i_411_ == 1002)
					class408_415_ = OutgoingPacket.OBJECT_EXAMINE_PACKET;
				if (null != class408_415_) {
					client.anInt11117 = i * -685128629;
					client.anInt11122 = 1014439817 * i_408_;
					client.anInt11135 = -915403218;
					client.anInt11134 = 0;
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(class408_415_, (client.aClass116_11058.aClass11_1413), 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class315.method5677((byte) 12) ? 1 : 0, 1399961364);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(1704054549 * class592.localY + i_410_, -1262882661);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2((int) (l >>> 32) & 0x7fffffff, 911364748);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_409_ + class592.localX * 235453015, 310743586);
					client.aClass116_11058.method1974(class523_sub22, (byte) 94);
					Class581.method9664(i_409_, i_410_, 1582225436);
				}
				if (client.aBool11000)
					Class399.method6533(371252930);
				if (null != Class436.aClass250_4899 && client.anInt11173 * -1412331351 == 0)
					Login.method15991(Class436.aClass250_4899, (byte) -25);
			}
		}
	}

	static boolean method1073() {
		return Class276.method5047(Class61.aClass633_769.aClass574_8260, (byte) 19);
	}

	static boolean method1074(int i, int i_416_) {
		if (i_416_ >= 1000 && i < 1000)
			return true;
		if (i_416_ < 1000 && i < 1000) {
			if (InterfaceComponentDefinitions.method4518(i, 1648472928))
				return true;
			if (InterfaceComponentDefinitions.method4518(i_416_, 1777568132))
				return false;
			return true;
		}
		if (i_416_ >= 1000 && i >= 1000)
			return true;
		return false;
	}

	static Class523_Sub22 method1075(int i, int i_417_, int i_418_) {
		Class523_Sub22 class523_sub22 = null;
		if (i_418_ == 0)
			class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.WALK_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
		if (1 == i_418_)
			class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.MINIMAP_WALK_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i + class592.localX * 235453015, (byte) -54);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(i_417_ + 1704054549 * class592.localY, (byte) 81);
		class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(Class315.method5677((byte) 45) ? 1 : 0, -159492164);
		Class104.anInt1269 = -250567387 * i;
		Class104.anInt1270 = -1284332517 * i_417_;
		Class104.aBool1265 = false;
		Class84.method1597(933430903);
		return class523_sub22;
	}

	static boolean method1076(int i, int i_419_) {
		if (i_419_ >= 1000 && i < 1000)
			return true;
		if (i_419_ < 1000 && i < 1000) {
			if (InterfaceComponentDefinitions.method4518(i, 1858719003))
				return true;
			if (InterfaceComponentDefinitions.method4518(i_419_, 1892815694))
				return false;
			return true;
		}
		if (i_419_ >= 1000 && i >= 1000)
			return true;
		return false;
	}

	static boolean method1077(int i, int i_420_) {
		if (i_420_ >= 1000 && i < 1000)
			return true;
		if (i_420_ < 1000 && i < 1000) {
			if (InterfaceComponentDefinitions.method4518(i, 843507198))
				return true;
			if (InterfaceComponentDefinitions.method4518(i_420_, 2109661967))
				return false;
			return true;
		}
		if (i_420_ >= 1000 && i >= 1000)
			return true;
		return false;
	}

	static void method1078(int i, int i_421_) {
		if (Class523_Sub11.aClass625_10427.aBool8147 || (1 != 462991943 * anInt330 && (!Class318.aBool3431 || 462991943 * anInt330 != 2 || !(aClass523_Sub27_Sub6_333.aString11629.equals(Class39.aClass39_510.method1124((Class53_Sub20.aClass668_10979), (byte) -94)))))) {
			Class10 class10 = client.method17697(846827004);
			int i_422_ = class10.method597((Class39.aClass39_424.method1124(Class53_Sub20.aClass668_10979, (byte) -69)), -1759656773);
			int i_423_;
			if (!aBool327) {
				for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14240(1626539446)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) aClass708_342.method14244((byte) -6))) {
					int i_424_ = Class269.method4924(class523_sub27_sub6, class10, 1003475374);
					if (i_424_ > i_422_)
						i_422_ = i_424_;
				}
				i_422_ += 8;
				i_423_ = anInt330 * 462991943 * (anInt323 * 1648921847) + 21;
				Class523_Sub19.anInt10492 = (((aBool353 ? 26 : 22) + anInt330 * 462991943 * (1648921847 * anInt323)) * 1395259895);
			} else {
				for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) aClass697_339.next(768418218))) {
					int i_425_;
					if (1 == class523_sub27_sub8.anInt11719 * 1060081949)
						i_425_ = Class269.method4924(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), class10, 1003475374);
					else
						i_425_ = Class323.method5727(class523_sub27_sub8, class10, -1309278765);
					if (i_425_ > i_422_)
						i_422_ = i_425_;
				}
				i_422_ += 8;
				i_423_ = anInt336 * -914479837 * (1648921847 * anInt323) + 21;
				Class523_Sub19.anInt10492 = 1395259895 * ((aBool353 ? 26 : 22) + anInt323 * 1648921847 * (-914479837 * anInt336));
			}
			i_422_ += 10;
			int i_426_ = i - i_422_ / 2;
			if (i_426_ + i_422_ > Class170.anInt1833 * 2141365743)
				i_426_ = Class170.anInt1833 * 2141365743 - i_422_;
			if (i_426_ < 0)
				i_426_ = 0;
			int i_427_ = i_421_;
			if (i_427_ + i_423_ > -495986435 * Class254.anInt2742)
				i_427_ = -495986435 * Class254.anInt2742 - i_423_;
			if (i_427_ < 0)
				i_427_ = 0;
			Whirlpool.anInt231 = 1963954761 * i_426_;
			Class194_Sub17.anInt9941 = i_427_ * 1068719991;
			BaseVarType.anInt5390 = -2064511131 * i_422_;
			anInt351 = (int) (Math.random() * 24.0) * -972873125;
			aBool326 = true;
		}
	}

	static float method1079(float f, float f_428_, float f_429_, float f_430_, float f_431_, float f_432_, int i) {
		float f_433_ = 0.0F;
		float f_434_ = f_430_ - f;
		float f_435_ = f_431_ - f_428_;
		float f_436_ = f_432_ - f_429_;
		float f_437_ = 0.0F;
		float f_438_ = 0.0F;
		float f_439_ = 0.0F;
		Class560 class560 = client.aClass505_11019.method8241((byte) -10);
		for (/**/; f_433_ < 1.1F; f_433_ += 0.1F) {
			float f_440_ = f + f_433_ * f_434_;
			float f_441_ = f_435_ * f_433_ + f_428_;
			float f_442_ = f_433_ * f_436_ + f_429_;
			int i_443_ = (int) f_440_ >> 9;
			int i_444_ = (int) f_442_ >> 9;
			if (i_443_ > 0 && i_444_ > 0 && i_443_ < client.aClass505_11019.method8292((byte) 55) && i_444_ < client.aClass505_11019.method8235(2059463836)) {
				int i_445_ = Class241.player.aByte10821;
				if (i_445_ < 3 && ((client.aClass505_11019.method8243(-1255839364).aByteArrayArrayArray4962[1][i_443_][i_444_]) & 0x2) != 0)
					i_445_++;
				int i_446_ = class560.aClass142Array7547[i_445_].method2326((int) f_440_, (int) f_442_, 690020839);
				if ((float) i_446_ < f_441_) {
					if (i >= 2)
						return (f_433_ - 0.1F + (Class304.method5547(f_437_, f_438_, f_439_, f_440_, f_441_, f_442_, i - 1, -1087782740) * 0.1F));
					return f_433_;
				}
			}
			f_437_ = f_440_;
			f_438_ = f_441_;
			f_439_ = f_442_;
		}
		return -1.0F;
	}

	static float method1080(float f, float f_447_, float f_448_, float f_449_, float f_450_, float f_451_, int i) {
		float f_452_ = 0.0F;
		float f_453_ = f_449_ - f;
		float f_454_ = f_450_ - f_447_;
		float f_455_ = f_451_ - f_448_;
		float f_456_ = 0.0F;
		float f_457_ = 0.0F;
		float f_458_ = 0.0F;
		Class560 class560 = client.aClass505_11019.method8241((byte) -14);
		for (/**/; f_452_ < 1.1F; f_452_ += 0.1F) {
			float f_459_ = f + f_452_ * f_453_;
			float f_460_ = f_454_ * f_452_ + f_447_;
			float f_461_ = f_452_ * f_455_ + f_448_;
			int i_462_ = (int) f_459_ >> 9;
			int i_463_ = (int) f_461_ >> 9;
			if (i_462_ > 0 && i_463_ > 0 && i_462_ < client.aClass505_11019.method8292((byte) 70) && i_463_ < client.aClass505_11019.method8235(2111190076)) {
				int i_464_ = Class241.player.aByte10821;
				if (i_464_ < 3 && ((client.aClass505_11019.method8243(-163315219).aByteArrayArrayArray4962[1][i_462_][i_463_]) & 0x2) != 0)
					i_464_++;
				int i_465_ = class560.aClass142Array7547[i_464_].method2326((int) f_459_, (int) f_461_, -1629900264);
				if ((float) i_465_ < f_460_) {
					if (i >= 2)
						return (f_452_ - 0.1F + (Class304.method5547(f_456_, f_457_, f_458_, f_459_, f_460_, f_461_, i - 1, -1816585771) * 0.1F));
					return f_452_;
				}
			}
			f_456_ = f_459_;
			f_457_ = f_460_;
			f_458_ = f_461_;
		}
		return -1.0F;
	}

	public static Class57 method1081(int i) {
		Class19 class19 = null;
		try {
			Class57 class57;
			try {
				class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), false, 2011256287);
				byte[] is = new byte[(int) class19.method795(-1088268973)];
				int i_466_;
				for (int i_467_ = 0; i_467_ < is.length; i_467_ += i_466_) {
					i_466_ = class19.method784(is, i_467_, is.length - i_467_, (byte) 16);
					if (i_466_ == -1)
						throw new EOFException();
				}
				class57 = new Class57(new RSBuffer(is));
			} catch (Exception exception) {
				Class57 class57_468_ = new Class57();
				try {
					if (class19 != null)
						class19.method786(1778877862);
				} catch (Exception exception_469_) {
					/* empty */
				}
				return class57_468_;
			}
			try {
				if (class19 != null)
					class19.method786(1167095838);
			} catch (Exception exception) {
				/* empty */
			}
			return class57;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method786(1607462982);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	static final void method1082(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class86.friendsChatKickRequirement;
	}

	static final void method1083(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.method5906(((String) (class669.anObjectArray8559[((class669.anInt8560 -= 1235970069) * 240723773)])), (byte) -64);
	}

	static final void method1084(Class669 class669, int i) {
		Class313.method5656(NetworkStream.method9224(-812225192), 743172261);
	}

	static final void method1085(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1884947865 * client.anInt11162;
	}

	public static final void method1086(String string, boolean bool, int i) {
		int i_470_ = client.aBool11156 ? 400 : 100;
		if (string != null) {
			if (54287651 * client.anInt11078 >= i_470_)
				Class214.method3840(4, (client.aBool11156 ? Class39.aClass39_403.method1124((Class53_Sub20.aClass668_10979), (byte) -4) : Class39.aClass39_500.method1124((Class53_Sub20.aClass668_10979), (byte) -44)), 1972302542);
			else {
				String string_471_ = Class226.method4163(string, Class112.aClass73_1351, (byte) 79);
				if (string_471_ != null) {
					for (int i_472_ = 0; i_472_ < client.anInt11078 * 54287651; i_472_++) {
						Class51 class51 = client.aClass51Array11294[i_472_];
						String string_473_ = Class226.method4163(class51.aString714, Class112.aClass73_1351, (byte) 64);
						if (null != string_473_ && string_473_.equals(string_471_)) {
							Class214.method3840(4, new StringBuilder().append(string).append(Class39.aClass39_521.method1124((Class53_Sub20.aClass668_10979), (byte) -60)).toString(), 1970558980);
							return;
						}
						if (null != class51.aString712) {
							String string_474_ = Class226.method4163(class51.aString712, Class112.aClass73_1351, (byte) 17);
							if (string_474_ != null && string_474_.equals(string_471_)) {
								Class214.method3840(4, new StringBuilder().append(string).append(Class39.aClass39_521.method1124((Class53_Sub20.aClass668_10979), (byte) -75)).toString(), 2048660995);
								return;
							}
						}
					}
					for (int i_475_ = 0; i_475_ < 1563815891 * client.anInt11287; i_475_++) {
						Class60 class60 = client.aClass60Array11182[i_475_];
						String string_476_ = Class226.method4163(class60.aString763, Class112.aClass73_1351, (byte) 63);
						if (null != string_476_ && string_476_.equals(string_471_)) {
							Class214.method3840(4, new StringBuilder().append(Class39.aClass39_427.method1124(Class53_Sub20.aClass668_10979, (byte) -53)).append(string).append(Class39.aClass39_533.method1124(Class53_Sub20.aClass668_10979, (byte) -112)).toString(), 1887418331);
							return;
						}
						if (null != class60.aString764) {
							String string_477_ = Class226.method4163(class60.aString764, Class112.aClass73_1351, (byte) 8);
							if (null != string_477_ && string_477_.equals(string_471_)) {
								Class214.method3840(4, new StringBuilder().append(Class39.aClass39_427.method1124(Class53_Sub20.aClass668_10979, (byte) -42)).append(string).append(Class39.aClass39_533.method1124(Class53_Sub20.aClass668_10979, (byte) -29)).toString(), 1946045886);
								return;
							}
						}
					}
					if (Class226.method4163((Class241.player.username), Class112.aClass73_1351, (byte) 6).equals(string_471_))
						Class214.method3840(4, (Class39.aClass39_515.method1124(Class53_Sub20.aClass668_10979, (byte) -9)), 1940994242);
					else {
						RSStream class116 = Class537.method8941(-1969548408);
						Class523_Sub22 class523_sub22 = Class523_Sub18.method16042((OutgoingPacket.aClass408_4260), (class116.aClass11_1413), 1370050649);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) -52) + 1, -526641847);
						class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -61);
						class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -835451854);
						class116.method1974(class523_sub22, (byte) 125);
					}
				}
			}
		}
	}
}
