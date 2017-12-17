/* Class523_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;

public abstract class Login extends Class523 {
	abstract void method15985(Class523_Sub19 class523_sub19);

	abstract void method15986(RSBuffer class523_sub34, byte i);

	abstract void method15987(Class523_Sub19 class523_sub19, byte i);

	abstract void method15988(Class523_Sub19 class523_sub19);

	Login() {
		/* empty */
	}

	abstract void method15989(Class523_Sub19 class523_sub19);

	abstract void method15990(RSBuffer class523_sub34);

	public static void method15991(InterfaceComponentDefinitions class250, byte i) {
		if (class250.anInt2706 * -1047483525 == client.anInt11245 * 1004216405)
			client.aBoolArray11246[638354985 * class250.anInt2622] = true;
	}

	static final void method15992(Class669 class669, int i) {
		int i_0_ = class669.anIntArray8577[1180759405 * class669.anInt8579];
		class669.anInt8560 -= 1235970069 * i_0_;
		String string = Class272.method5024(class669.anObjectArray8559, class669.anInt8560 * 240723773, i_0_, (byte) 3);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
	}

	static final void method15993(int i) {
		if (-1905499279 * Class43.anInt601 != 1 && 102 != -1905499279 * Class43.anInt601) {
			do {
				try {
					int i_1_;
					if (Class43.anInt575 * -312035097 == 0 && -1905499279 * Class43.anInt601 < 95)
						i_1_ = 500;
					else
						i_1_ = 2000;
					if (Class43.aBool574 && -1905499279 * Class43.anInt601 >= 66)
						i_1_ = 6000;
					if ((267 == Class43.anInt567 * 1566115167 && 210 != Class43.anInt601 * -1905499279 && 42 != Class43.anInt610 * 404908773) || (142 == 1566115167 * Class43.anInt567 && 49 != Class43.anInt609 * -1471454747 && -1471454747 * Class43.anInt609 != 52))
						Class43.anInt607 += 477607871;
					if (128464959 * Class43.anInt607 > i_1_) {
						Class43.aClass116_568.method1980((short) -12596);
						if (-312035097 * Class43.anInt575 < 3) {
							if (267 == 1566115167 * Class43.anInt567)
								Class155.aClass1_1735.method497((byte) -13);
							else
								Class6.aClass1_42.method497((byte) -58);
							Class43.anInt607 = 0;
							Class43.anInt575 += -372581673;
							Class43.anInt601 = -1901992645;
						} else {
							Class43.anInt601 = -953811567;
							Class645.method10563(-5, 1595851907);
							Compression.method7275((byte) 0);
							break;
						}
					}
					if (-1905499279 * Class43.anInt601 == 11) {
						if (267 == Class43.anInt567 * 1566115167)
							Class43.aClass116_568.method1976(Class191.method3627((Class155.aClass1_1735.method502(-2130798188)), 40000, (byte) 0), Class155.aClass1_1735.aString9, 1031968539);
						else
							Class43.aClass116_568.method1976((Class191.method3627(Class6.aClass1_42.method502(-2147134389), 40000, (byte) 0)), Class6.aClass1_42.aString9, 442711532);
						Class43.aClass116_568.method1998(1162742962);
						Class523_Sub22 class523_sub22 = Class493.method8087(2064791809);
						if (Class43.aBool574) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4196.anInt4190), -1448755401);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -52);
							int i_2_ = ((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(876, -856130610);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1, -1623100861);
							if (1566115167 * Class43.anInt567 == 267)
								class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((client.anInt11136 * -2020118759 == 17 ? 1 : 0), -1278143451);
							RSBuffer class523_sub34 = Class608.method9988((byte) 0);
							Class263.method4739(class523_sub34, (long) (Class43.anInt572 * 426956199));
							Class176.aLong1857 = ((long) Class43.anInt572 * -2373984093781879965L);
							class523_sub34.writeByte((Class43.anInt572 * 426956199), 1227671146);
							class523_sub34.writeByte(Class53_Sub20.aClass668_10979.method82(), 46630432);
							class523_sub34.writeInt((client.anInt10984 * 1778108951), -790049247);
							for (int i_3_ = 0; i_3_ < 5; i_3_++)
								class523_sub34.writeInt((int) (Math.random() * 9.9999999E7), -1577968927);
							class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
							class523_sub34.writeByte((1884825957 * (client.aClass681_11284.anInt8648)), -749448613);
							class523_sub34.writeByte((int) (Math.random() * 9.9999999E7), -448381302);
							class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
							class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -5537);
							class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011 - i_2_, 1469229505);
						} else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4184.anInt4190), -497390968);
						Class43.aClass116_568.method1974(class523_sub22, (byte) 54);
						Class43.aClass116_568.method1973(1512049308);
						Class43.anInt601 = -457199072;
					}
					if (32 == Class43.anInt601 * -1905499279) {
						if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 1565720653))
							break;
						Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 8442);
						Class43.aClass116_568.updateBuffer.offset = 0;
						int i_4_ = Class43.aClass116_568.updateBuffer.readUnsignedByte(493399037);
						if (0 != i_4_) {
							Class43.anInt601 = -953811567;
							Class17.method778(i_4_, 2032708296);
							Class645.method10563(i_4_, -1125554225);
							Class43.aClass116_568.method1980((short) -21510);
							Compression.method7275((byte) 0);
							break;
						}
						Class43.aClass116_568.updateBuffer.offset = 0;
						if (Class43.aBool574)
							Class43.anInt601 = 502242984;
						else
							Class43.anInt601 = 1004485968;
					}
					if (40 == Class43.anInt601 * -1905499279) {
						if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(2, 1550637616))
							break;
						Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 2, (short) 11992);
						Class43.aClass116_568.updateBuffer.offset = 0;
						Class43.aClass116_568.updateBuffer.offset = Class43.aClass116_568.updateBuffer.readUnsignedShort(-1064090129) * 189765723;
						Class43.anInt601 = -920028633;
					}
					if (Class43.anInt601 * -1905499279 == 55) {
						if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(2349011 * (Class43.aClass116_568.updateBuffer.offset), 2000432183))
							break;
						Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 2349011 * (Class43.aClass116_568.updateBuffer.offset), (short) 15017);
						Class43.aClass116_568.updateBuffer.method16308(Class43.anIntArray569, (byte) -22);
						Class43.aClass116_568.updateBuffer.offset = 0;
						String string = Class43.aClass116_568.updateBuffer.readVersionedString(2100727929);
						Class43.aClass116_568.updateBuffer.offset = 0;
						String string_5_ = Class402.aClass402_4165.method6574(1621057790);
						Class388.method6470(string, true, string_5_, client.aBool10996, -494472837);
						Class43.anInt601 = 1472946018;
					}
					if (66 == Class43.anInt601 * -1905499279) {
						if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 803478991))
							break;
						Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 13379);
						if (1 == ((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff))
							Class43.anInt601 = -908767655;
					}
					if (-1905499279 * Class43.anInt601 == 73) {
						if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(16, 1703585395))
							break;
						Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 16, (short) 18756);
						Class43.aClass116_568.updateBuffer.offset = -1258715728;
						Class43.aClass116_568.updateBuffer.method16308(Class43.anIntArray569, (byte) -81);
						Class43.aClass116_568.updateBuffer.offset = 0;
						Class43.aLong573 = (Class43.aClass116_568.updateBuffer.readLong((byte) -74) * 9083684963104943157L);
						Class43.aLong577 = (Class43.aClass116_568.updateBuffer.readLong((byte) -90) * 8201862548359724895L);
						Class43.anInt601 = 1004485968;
					}
					if (-1905499279 * Class43.anInt601 == 80) {
						Class43.aClass116_568.updateBuffer.offset = 0;
						Class43.aClass116_568.method1998(1963803288);
						Class523_Sub22 class523_sub22 = Class493.method8087(123715820);
						RSBitBuffer class523_sub34_sub2 = class523_sub22.aClass523_Sub34_Sub2_10525;
						if (1566115167 * Class43.anInt567 == 267) {
							Class406 class406;
							if (Class43.aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4186;
							class523_sub34_sub2.writeByte((class406.anInt4190 * 1752807475), 349120484);
							class523_sub34_sub2.writeShort(0, (byte) -96);
							int i_6_ = class523_sub34_sub2.offset * 2349011;
							int i_7_ = 2349011 * class523_sub34_sub2.offset;
							if (!Class43.aBool574) {
								class523_sub34_sub2.writeInt(876, -1613205108);
								class523_sub34_sub2.writeInt(1, -710331364);
								class523_sub34_sub2.writeByte((-2020118759 * client.anInt11136 == 17 ? 1 : 0), 1575442460);
								i_7_ = 2349011 * class523_sub34_sub2.offset;
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -26663);
								i_7_ = 2349011 * class523_sub34_sub2.offset;
								class523_sub34_sub2.writeByte(-1L == (-529544860571826659L * Class43.aLong573) ? 1 : 0, 1214908490);
								if (Class43.aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(Class43.aString603, (byte) -39);
								else
									class523_sub34_sub2.method16441(Class43.aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(Class316.method5685(-1659532667), 1367240710);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -82);
							class523_sub34_sub2.writeShort((Class254.anInt2742 * -495986435), (byte) -115);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -85), -1765015040);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) -2);
							class523_sub34_sub2.writeInt((1778108951 * (client.anInt10984)), -628328175);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 24118);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), 800550405);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -14605);
							client.aBool11012 = true;
							RSBuffer class523_sub34_8_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(1759351106)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_8_, 1423963183);
							class523_sub34_sub2.readBytes(class523_sub34_8_.buffer, 0, class523_sub34_8_.buffer.length, (short) -4744);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -1593653096);
							class523_sub34_sub2.writeInt((client.anInt10988 * 503698129), -2052762889);
							class523_sub34_sub2.writeInt((742099907 * (client.anInt10987)), -695496769);
							class523_sub34_sub2.writeInt((-1652858555 * (client.anInt10990)), -1542430098);
							class523_sub34_sub2.writeInt((client.anInt11192 * -1046646323), -713107603);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) -5);
							class523_sub34_sub2.writeByte(((client.aString11112) == null) ? 0 : 1, -1402172156);
							if (null != client.aString11112)
								class523_sub34_sub2.method16270(client.aString11112, (byte) -6);
							class523_sub34_sub2.writeByte((client.aBool11185 ? 1 : 0), -1466404679);
							class523_sub34_sub2.writeByte((client.aBool11142 ? 1 : 0), 4618653);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, 215590579);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -1425441406);
							class523_sub34_sub2.method16270(client.aString11001, (byte) 2);
							class523_sub34_sub2.writeByte((null == Class6.aClass1_40 || (Class6.aClass1_40.anInt10 * -1126141351 != (Class155.aClass1_1735.anInt10 * -1126141351))) ? 1 : 0, 1432128489);
							class523_sub34_sub2.writeShort((-1126141351 * (Class6.aClass1_42.anInt10)), (byte) -109);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(Class43.anIntArray569, i_7_, 2349011 * class523_sub34_sub2.offset, (byte) 89);
							class523_sub34_sub2.method16275((2349011 * class523_sub34_sub2.offset - i_6_), -1086542173);
						} else {
							Class406 class406;
							if (Class43.aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4187;
							class523_sub34_sub2.writeByte((1752807475 * (class406.anInt4190)), 828161159);
							class523_sub34_sub2.writeShort(0, (byte) -82);
							int i_9_ = 2349011 * class523_sub34_sub2.offset;
							int i_10_ = class523_sub34_sub2.offset * 2349011;
							if (!Class43.aBool574) {
								class523_sub34_sub2.writeInt(876, -874033449);
								class523_sub34_sub2.writeInt(1, -2089941156);
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -25422);
								i_10_ = class523_sub34_sub2.offset * 2349011;
								class523_sub34_sub2.writeByte((-529544860571826659L * Class43.aLong573 == -1L) ? 1 : 0, 922894450);
								if (Class43.aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(Class43.aString603, (byte) 67);
								else
									class523_sub34_sub2.method16441(Class43.aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(1884825957 * client.aClass681_11284.anInt8648, 917707732);
							class523_sub34_sub2.writeByte(Class53_Sub20.aClass668_10979.method82(), -211662406);
							class523_sub34_sub2.writeByte(Class316.method5685(-881764442), -517010591);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -98);
							class523_sub34_sub2.writeShort((-495986435 * (Class254.anInt2742)), (byte) -13);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -31), -1413130550);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) -48);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 15415);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), -1079197661);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -23889);
							RSBuffer class523_sub34_11_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(-1194457668)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_11_, 898760708);
							class523_sub34_sub2.readBytes(class523_sub34_11_.buffer, 0, class523_sub34_11_.buffer.length, (short) -30605);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -900833697);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) 15);
							class523_sub34_sub2.writeInt((client.anInt10984 * 1778108951), -924177202);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -2078523303);
							class523_sub34_sub2.method16270(client.aString11001, (byte) -15);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, -1112231225);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(Class43.anIntArray569, i_10_, class523_sub34_sub2.offset * 2349011, (byte) 116);
							class523_sub34_sub2.method16275((class523_sub34_sub2.offset * 2349011 - i_9_), 1440756230);
						}
						Class43.aClass116_568.method1974(class523_sub22, (byte) 34);
						Class43.aClass116_568.method1973(1512049308);
						Class43.aClass116_568.aClass11_1413 = new Class11(Class43.anIntArray569);
						for (int i_12_ = 0; i_12_ < 4; i_12_++)
							Class43.anIntArray569[i_12_] += 50;
						Class43.aClass116_568.aClass11_1420 = new Class11(Class43.anIntArray569);
						new Class11(Class43.anIntArray569);
						Class43.aClass116_568.updateBuffer.method18218(Class43.aClass116_568.aClass11_1420, -525367091);
						Class43.anIntArray569 = null;
						Class43.anInt601 = -417785649;
					}
					if (95 == Class43.anInt601 * -1905499279) {
						if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 1035887598))
							break;
						Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 11082);
						int i_13_ = Class43.aClass116_568.updateBuffer.readUnsignedByte(-119667561);
						Class43.aClass116_568.updateBuffer.offset = 0;
						if (21 == i_13_)
							Class43.anInt601 = 1986449980;
						else {
							if (1 == i_13_) {
								Class43.anInt601 = 1495467974;
								Class645.method10563(i_13_, 1139637957);
								break;
							}
							if (52 == i_13_) {
								Class687_Sub20.anInt10869 = i_13_ * -344136887;
								Class43.anInt601 = 1094573792;
							} else if (2 == i_13_) {
								if (Class43.aBool620) {
									Class43.aBool620 = false;
									Class43.anInt601 = -1901992645;
									break;
								}
								if (1566115167 * Class43.anInt567 == 267) {
									Class423.clientConfigsDomain.method14395(34186);
									Class43.anInt601 = 637374720;
								} else
									Class43.anInt601 = 569808852;
							} else if (15 == i_13_) {
								Class43.aClass116_568.anInt1421 = 1993757502;
								Class43.anInt601 = 2037124381;
							} else {
								if (23 == i_13_ && -312035097 * Class43.anInt575 < 3) {
									Class43.anInt607 = 0;
									Class43.anInt575 += -372581673;
									Class43.anInt601 = -1901992645;
									Class43.aClass116_568.method1980((short) -5534);
									break;
								}
								if (42 == i_13_) {
									Class43.anInt601 = 1563033842;
									Class645.method10563(i_13_, 635626635);
									break;
								}
								if (142 == Class43.anInt567 * 1566115167 && i_13_ == 49 && 4 != -2020118759 * client.anInt11136) {
									if (Class43.anInt609 * -1471454747 != 52)
										Class645.method10563(i_13_, -1586974556);
									break;
								}
								if (Class43.aBool579 && !Class43.aBool574 && -1 != Class43.anInt572 * 426956199 && i_13_ == 35) {
									Class43.aBool574 = true;
									Class43.anInt607 = 0;
									Class43.anInt601 = -1901992645;
									Class43.aClass116_568.method1980((short) -10350);
									break;
								}
								if (53 == i_13_)
									Class43.anInt601 = -801788364;
								else {
									Class43.anInt601 = -953811567;
									Class645.method10563(i_13_, -2020646409);
									Class43.aClass116_568.method1980((short) -755);
									Compression.method7275((byte) 0);
									break;
								}
							}
						}
					}
					if (124 == -1905499279 * Class43.anInt601) {
						if (Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 447937331)) {
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 24132);
							int i_14_ = ((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff);
							Class43.anInt614 = -1962324270 * i_14_;
							Class43.anInt601 = -953811567;
							Class645.method10563(21, -2073896370);
							Class43.aClass116_568.method1980((short) -30058);
							Compression.method7275((byte) 0);
						}
					} else if (Class43.anInt601 * -1905499279 == 210) {
						if (Class43.aClass116_568.getCurrentStream(782493095).method9199(2, 1794777235)) {
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 2, (short) 31507);
							Class43.anInt617 = ((((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff) << 8) + ((Class43.aClass116_568.updateBuffer.buffer[1]) & 0xff)) * 1390260393;
							Class43.anInt601 = -417785649;
						}
					} else if (-1905499279 * Class43.anInt601 == 244) {
						if (Class43.aClass116_568.getCurrentStream(782493095).method9199(4, 1646151661)) {
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 4, (short) 8688);
							Class43.anInt619 = Class43.aClass116_568.updateBuffer.readUnsignedInt((byte) -46) * 284188369;
							Class43.aClass116_568.updateBuffer.offset = 0;
							Class43.anInt601 = -953811567;
							Class645.method10563(53, 470114665);
							Class43.aClass116_568.method1980((short) -7362);
							Compression.method7275((byte) 0);
						}
					} else if (198 == -1905499279 * Class43.anInt601) {
						if (29 == Class687_Sub20.anInt10869 * 1969323769) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 1832392104))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 11824);
							Class43.anInt616 = -234297499 * ((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff);
						} else if (1969323769 * Class687_Sub20.anInt10869 == 45) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(3, 1651384982))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 3, (short) 14522);
							Class43.anInt616 = ((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff) * -234297499;
							Class43.anInt578 = (((Class43.aClass116_568.updateBuffer.buffer[2]) & 0xff) + (((Class43.aClass116_568.updateBuffer.buffer[1]) & 0xff) << 8)) * -1142124537;
						} else
							throw new IllegalStateException();
						Class43.anInt601 = -953811567;
						Class645.method10563((1969323769 * Class687_Sub20.anInt10869), 1225952188);
						Class43.aClass116_568.method1980((short) -26972);
						Compression.method7275((byte) 0);
						if (Class691.method13965((-2020118759 * client.anInt11136), (byte) -5)) {
							Class669.method13691(true, -1838550041);
							Class43.anInt610 = -622674299 * Class687_Sub20.anInt10869;
						}
					} else if (224 == -1905499279 * Class43.anInt601) {
						if (Class43.aClass116_568.getCurrentStream(782493095).method9199(2, 1818596461)) {
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 2, (short) 16342);
							Class43.aClass116_568.updateBuffer.offset = 0;
							Class674.anInt8628 = Class43.aClass116_568.updateBuffer.readUnsignedShort(-405855619) * 1175030903;
							Class43.aClass116_568.updateBuffer.offset = 0;
							Class43.anInt601 = -1287139881;
						}
					} else if (231 == -1905499279 * Class43.anInt601) {
						if (Class43.aClass116_568.getCurrentStream(782493095).method9199(1216875847 * Class674.anInt8628, 516204028)) {
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1216875847 * Class674.anInt8628, (short) 15077);
							Class43.aClass116_568.updateBuffer.offset = 0;
							byte[] is = (new byte[1 + Class674.anInt8628 * 1216875847]);
							Class43.aClass116_568.updateBuffer.method18222(is, 0, 1216875847 * Class674.anInt8628, (byte) 47);
							Class43.aClass116_568.updateBuffer.offset = 0;
							RSBuffer class523_sub34 = new RSBuffer(is);
							String string = class523_sub34.readString(-17243387);
							Class331.method5825(string, true, client.aBool10996, -625078238);
							Class645.method10563((1969323769 * Class687_Sub20.anInt10869), 65244683);
							if (1566115167 * Class43.anInt567 == 142 && client.anInt11136 * -2020118759 != 4)
								Class43.anInt601 = -417785649;
							else {
								Class43.anInt601 = -953811567;
								Class43.aClass116_568.method1980((short) -15794);
								Compression.method7275((byte) 0);
							}
						}
					} else {
						if (256 == -1905499279 * Class43.anInt601) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(2, 565612725))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 2, (short) 31824);
							Class43.aClass116_568.updateBuffer.offset = 0;
							Class43.aClass116_568.anInt1421 = Class43.aClass116_568.updateBuffer.readUnsignedShort(-1032677209) * 1150604897;
							Class43.anInt601 = 643005209;
						}
						if (265 == Class43.anInt601 * -1905499279) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199((-1372959327 * Class43.aClass116_568.anInt1421), 1406271123))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, -1372959327 * Class43.aClass116_568.anInt1421, (short) 20537);
							Class43.aClass116_568.updateBuffer.offset = 0;
							boolean bool = (Class43.aClass116_568.updateBuffer.readUnsignedByte(-1750691202) == 1);
							while (2349011 * (Class43.aClass116_568.updateBuffer.offset) < (Class43.aClass116_568.anInt1421 * -1372959327)) {
								Class426 class426 = (Class114.aClass98_Sub1_Sub2_1405.refreshNIS((Class43.aClass116_568.updateBuffer), -899772852));
								Class423.clientConfigsDomain.anInterface2_1714.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1640812640);
							}
							if (bool) {
								Class523_Sub22 class523_sub22 = Class493.method8087(-545545041);
								RSBitBuffer class523_sub34_sub2 = (class523_sub22.aClass523_Sub34_Sub2_10525);
								class523_sub34_sub2.writeByte((1752807475 * Class406.aClass406_4185.anInt4190), -1157533872);
								Class43.aClass116_568.method1974(class523_sub22, (byte) 101);
								Class43.aClass116_568.method1973(1512049308);
								Class43.anInt601 = 84457335;
							} else
								Class43.anInt601 = 637374720;
						}
						if (-1905499279 * Class43.anInt601 == 135) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 448830387))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 5456);
							int i_15_ = ((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff);
							if (2 != i_15_) {
								if (29 == i_15_ || 45 == i_15_) {
									Class687_Sub20.anInt10869 = -344136887 * i_15_;
									Class43.anInt601 = 123870758;
								} else {
									Class43.anInt601 = -953811567;
									Class645.method10563(i_15_, -66487304);
									Class43.aClass116_568.method1980((short) -28027);
									Compression.method7275((byte) 0);
									if (Class691.method13965((-2020118759 * (client.anInt11136)), (byte) 24)) {
										Class669.method13691(true, -1838550041);
										Class43.anInt610 = -654032147 * i_15_;
									}
									break;
								}
								break;
							}
							Class43.anInt601 = 569808852;
						}
						if (Class43.anInt601 * -1905499279 == 148) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 1458616628))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 1, (short) 15235);
							Class548.anInt7321 = 811531845 * ((Class43.aClass116_568.updateBuffer.buffer[0]) & 0xff);
							Class43.anInt601 = -1811904821;
						}
						if (Class43.anInt601 * -1905499279 == 155) {
							RSBitBuffer class523_sub34_sub2 = (Class43.aClass116_568.updateBuffer);
							if (267 == 1566115167 * Class43.anInt567) {
								if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(Class548.anInt7321 * -31497075, 1913423643))
									break;
								Class43.aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, Class548.anInt7321 * -31497075, (short) 7347);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(597668785) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(-1219775740) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(-1443870335) == 1;
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(1465349113) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(401529328) == 1;
								client.aBool11164 = class523_sub34_sub2.readUnsignedByte(1356732408) == 1;
								client.anInt11154 = (class523_sub34_sub2.readUnsignedShort(-611961508) * -435708883);
								client.aBool11156 = class523_sub34_sub2.readUnsignedByte(-658318172) == 1;
								Class303.anInt3343 = (class523_sub34_sub2.method16286(-598353173) * 1728814959);
								client.aBool11157 = class523_sub34_sub2.readUnsignedByte(-1775621082) == 1;
								Class289.aString3120 = class523_sub34_sub2.readString(500199865);
								Class159_Sub1.aLong8869 = ((class523_sub34_sub2.method16291((short) 607) - TimeUtils.getCurrentTimeMilliseconds(1516375036)) * 1944424440918290845L);
								client.aClass505_11019.method8244(1876631531).method17222(client.aBool11157, (byte) 24);
								Class329_Sub2.aClass511_10050.method8540(1578767679).method8244(1494086084).method17222(client.aBool11157, (byte) 38);
								Class523_Sub37.aClass53_Sub8_10677.method17183(client.aBool11157, -1268397756);
								Class174.aClass53_Sub7_1856.method17174(client.aBool11157, (byte) 27);
							} else {
								if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(-31497075 * Class548.anInt7321, 1180649843))
									break;
								Class43.aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, -31497075 * Class548.anInt7321, (short) 26862);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(1134660560) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(-1918596230) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(1930977283) == 1;
								Class303.anInt3343 = (class523_sub34_sub2.method16286(-355462418) * 1728814959);
								Class241.player.aByte12182 = (byte) class523_sub34_sub2.readUnsignedByte(-164149490);
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(749828347) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(-472595596) == 1;
								Class461.aLong5121 = (class523_sub34_sub2.readLong((byte) -44) * 7102560564029533211L);
								Class159_Sub1.aLong8869 = (((2688366688243830291L * Class461.aLong5121) - TimeUtils.getCurrentTimeMilliseconds(1516375036) - class523_sub34_sub2.method16289((byte) -1)) * 1944424440918290845L);
								int i_16_ = class523_sub34_sub2.readUnsignedByte(-108805262);
								client.aBool11156 = 0 != (i_16_ & 0x1);
								Class411.aBool4540 = 0 != (i_16_ & 0x2);
								Compression.anInt4955 = class523_sub34_sub2.readUnsignedInt((byte) -15) * 242962777;
								Class431.anInt4861 = class523_sub34_sub2.readUnsignedInt((byte) -27) * -17008787;
								Class375_Sub1.anInt10163 = (class523_sub34_sub2.readUnsignedShort(-1268825410) * 2113837661);
								Class188.anInt2133 = (class523_sub34_sub2.readUnsignedShort(-1732206701) * -898335641);
								Class491.anInt5537 = (class523_sub34_sub2.readUnsignedShort(-1995694630) * -383547655);
								Class324.anInt3454 = class523_sub34_sub2.readUnsignedInt((byte) -81) * -82489775;
								Class454.aClass63_4979 = new Class63(134134449 * Class324.anInt3454);
								new Thread(Class454.aClass63_4979).start();
								client.anInt11162 = (class523_sub34_sub2.readUnsignedByte(-502179067) * -888766121);
								Class76.anInt853 = (class523_sub34_sub2.readUnsignedShort(-2010876399) * 459393563);
								Class227.anInt2346 = (class523_sub34_sub2.readUnsignedShort(-2040134196) * 2020015531);
								Class692.aBool8741 = class523_sub34_sub2.readUnsignedByte(1972218862) == 1;
								Class241.player.username = Class241.player.displayName = RuntimeException_Sub4.aString12099 = class523_sub34_sub2.readVersionedString(2005786439);
								Class190.anInt2154 = (class523_sub34_sub2.readUnsignedByte(1498600745) * -1376256479);
								Class297_Sub1.anInt10002 = (class523_sub34_sub2.readUnsignedInt((byte) -71) * -1095634933);
								Class6.aClass1_40 = new RSSocket();
								Class6.aClass1_40.anInt10 = (class523_sub34_sub2.readUnsignedShort(-1087884541) * 1274525161);
								if (65535 == -1126141351 * Class6.aClass1_40.anInt10)
									Class6.aClass1_40.anInt10 = -1274525161;
								Class6.aClass1_40.aString9 = class523_sub34_sub2.readVersionedString(2079070990);
								Class6.aClass1_40.anInt11 = (class523_sub34_sub2.readUnsignedShort(-1458603060) * 1509090121);
								Class6.aClass1_40.anInt12 = class523_sub34_sub2.readUnsignedShort(-846091470) * 19836347;
								if ((Class674.aClass674_8617 != Class80.aClass674_865) && ((Class674.aClass674_8615 != Class80.aClass674_865) || -1746920271 * client.rights < 2) && (Class155.aClass1_1735.method505(Class648.aClass1_8378, (short) 4222)))
									Class212.method3830(564030873);
							}
							if (client.aBool11224) {
								try {
									Class35.method952(Class305.anApplet3346, "zap", (byte) 9);
								} catch (Throwable throwable) {
									if (client.aBool10982) {
										try {
											Class305.anApplet3346.getAppletContext().showDocument(new URL(Class305.anApplet3346.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							} else {
								try {
									Class35.method952(Class305.anApplet3346, "unzap", (byte) 10);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class80.aClass674_865 == Class674.aClass674_8613)
								Class402.aClass402_4158.method6573((byte) -71);
							if (267 == 1566115167 * Class43.anInt567)
								Class43.anInt601 = 2020232914;
							else {
								Class43.anInt601 = -953811567;
								Class645.method10563(2, -1332581216);
								Class242.method4371((byte) -34);
								Class657.method10791(0, (byte) -69);
								Class43.aClass116_568.currentPacket = null;
								break;
							}
						}
						if (178 == Class43.anInt601 * -1905499279) {
							if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(3, 482567776))
								break;
							Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 3, (short) 30452);
							Class43.anInt601 = 1072051836;
						}
						if (188 == Class43.anInt601 * -1905499279) {
							RSBitBuffer class523_sub34_sub2 = (Class43.aClass116_568.updateBuffer);
							class523_sub34_sub2.offset = 0;
							if (class523_sub34_sub2.method18225(1085928362)) {
								if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(1, 703586992))
									break;
								Class43.aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 3, 1, (short) 31241);
							}
							Class43.aClass116_568.currentPacket = (Class189.method3601(2146503760)[class523_sub34_sub2.method18221((byte) 64)]);
							Class43.aClass116_568.anInt1421 = (class523_sub34_sub2.readUnsignedShort(-2082531582) * 1150604897);
							Class43.anInt601 = 1534881397;
						}
						if (165 == Class43.anInt601 * -1905499279) {
							if (Class43.aClass116_568.getCurrentStream(782493095).method9199(Class43.aClass116_568.anInt1421 * -1372959327, 894840257)) {
								Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, (Class43.aClass116_568.anInt1421 * -1372959327), (short) 14889);
								Class43.aClass116_568.updateBuffer.offset = 0;
								int i_17_ = (-1372959327 * Class43.aClass116_568.anInt1421);
								Class43.anInt601 = -953811567;
								Class645.method10563(2, -1375484558);
								Class221.method4137(1731470037);
								Class691.method13963((Class43.aClass116_568.updateBuffer), 702742205);
								int i_18_ = i_17_ - (Class43.aClass116_568.updateBuffer.offset) * 2349011;
								RSBitBuffer class523_sub34_sub2 = new RSBitBuffer(i_18_);
								System.arraycopy((Class43.aClass116_568.updateBuffer.buffer), (2349011 * (Class43.aClass116_568.updateBuffer.offset)), (class523_sub34_sub2.buffer), 0, i_18_);
								Class43.aClass116_568.updateBuffer.offset += 189765723 * i_18_;
								if (IncomingPacket.DYNAMIC_REGION_PACKET == Class43.aClass116_568.currentPacket)
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5571, class523_sub34_sub2), 1235970069);
								else
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5575, class523_sub34_sub2), 1235970069);
								if (2349011 * (Class43.aClass116_568.updateBuffer.offset) != i_17_)
									throw new RuntimeException(new StringBuilder().append((Class43.aClass116_568.updateBuffer.offset) * 2349011).append(" ").append(i_17_).toString());
								Class43.aClass116_568.currentPacket = null;
							}
						} else {
							if (205 != Class43.anInt601 * -1905499279)
								break;
							if (-1372959327 * Class43.aClass116_568.anInt1421 == -2) {
								if (!Class43.aClass116_568.getCurrentStream(782493095).method9199(2, 1706662619))
									break;
								Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, 2, (short) 24141);
								Class43.aClass116_568.updateBuffer.offset = 0;
								Class43.aClass116_568.anInt1421 = (Class43.aClass116_568.updateBuffer.readUnsignedShort(-1507871889) * 1150604897);
							}
							if (Class43.aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * Class43.aClass116_568.anInt1421, 1200582220)) {
								Class43.aClass116_568.getCurrentStream(782493095).read((Class43.aClass116_568.updateBuffer.buffer), 0, (Class43.aClass116_568.anInt1421 * -1372959327), (short) 9460);
								Class43.aClass116_568.updateBuffer.offset = 0;
								int i_19_ = (-1372959327 * Class43.aClass116_568.anInt1421);
								Class43.anInt601 = -953811567;
								Class645.method10563(15, 983513177);
								Class241.method4363(1912159838);
								Class691.method13963((Class43.aClass116_568.updateBuffer), 702742205);
								if (i_19_ != 2349011 * (Class43.aClass116_568.updateBuffer.offset))
									throw new RuntimeException(new StringBuilder().append(2349011 * (Class43.aClass116_568.updateBuffer.offset)).append(" ").append(i_19_).toString());
								Class43.aClass116_568.currentPacket = null;
							}
						}
					}
				} catch (IOException ioexception) {
					Class43.aClass116_568.method1980((short) -20131);
					if (-312035097 * Class43.anInt575 < 3) {
						if (Class43.anInt567 * 1566115167 == 267)
							Class155.aClass1_1735.method497((byte) -122);
						else
							Class6.aClass1_42.method497((byte) -104);
						Class43.anInt607 = 0;
						Class43.anInt575 += -372581673;
						Class43.anInt601 = -1901992645;
					} else {
						Class43.anInt601 = -953811567;
						Class645.method10563(-4, 2043451217);
						Compression.method7275((byte) 0);
					}
					break;
				}
				break;
			} while (false);
		}
	}
}
