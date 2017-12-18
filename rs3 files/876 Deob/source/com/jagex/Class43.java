/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;

public class Class43 {
	static final int anInt565 = 55;
	static final int anInt566 = 178;
	static int anInt567;
	static RSStream aClass116_568;
	static int[] anIntArray569;
	static final int anInt570 = 80;
	static final int anInt571 = 267;
	static int anInt572;
	static long aLong573;
	static boolean aBool574;
	static int anInt575;
	static final int anInt576 = 142;
	static long aLong577;
	public static int anInt578;
	static boolean aBool579 = false;
	static final int anInt580 = 66;
	static final int anInt581 = 73;
	static final int anInt582 = 224;
	static String aString583;
	static final int anInt584 = 102;
	static final int anInt585 = 112;
	static final int anInt586 = 124;
	static final int anInt587 = 32;
	static boolean aBool588;
	static final int anInt589 = 1;
	static final int anInt590 = 165;
	static final int anInt591 = 95;
	static final int anInt592 = 188;
	static final int anInt593 = 198;
	public static String aString594;
	static final int anInt595 = 210;
	static final int anInt596 = 155;
	static final int anInt597 = 231;
	static final int anInt598 = 244;
	static final int anInt599 = 256;
	static final int anInt600 = 265;
	static int anInt601;
	static final int anInt602 = 11;
	public static String aString603;
	public static int anInt604;
	static final int anInt605 = 4;
	static final int anInt606 = 205;
	static int anInt607;
	static final int anInt608 = 148;
	public static int anInt609;
	public static int anInt610;
	public static int anInt611;
	public static int anInt612;
	static final int anInt613 = 40;
	public static int anInt614;
	static final int anInt615 = 135;
	public static int anInt616;
	public static int anInt617;
	static boolean aBool618;
	public static int anInt619;
	static boolean aBool620;

	static boolean method1148() {
		anInt567 = -730624974;
		aClass116_568 = client.aClass116_11057;
		return Class159.method2570(-529544860571826659L * aLong573 == -1L, true, "", "", -529544860571826659L * aLong573);
	}

	static void method1149() {
		aString583 = "";
		aString594 = "";
		aString603 = "";
		aBool588 = true;
	}

	static void method1150(RSBuffer class523_sub34, long l) {
		Class3 class3;
		if (null != aString583 && aString583.length() == 6) {
			if (aBool588)
				class3 = Class3.aClass3_29;
			else
				class3 = Class3.aClass3_30;
		} else if (Class220.aClass57_2331.method1367(l))
			class3 = Class3.aClass3_28;
		else
			class3 = Class3.aClass3_31;
		class523_sub34.writeByte(class3.method82(), -420425848);
		switch (-40972529 * class3.anInt27) {
		case 3:
			class523_sub34.offset += 759062892;
			break;
		case 1:
		case 2:
			class523_sub34.writeMedium(Integer.parseInt(aString583), (byte) 0);
			class523_sub34.offset += 189765723;
			break;
		case 0:
			class523_sub34.writeInt(Class220.aClass57_2331.method1374(l), -1114873546);
			break;
		}
	}

	static boolean method1151() {
		if (-1 != 426956199 * anInt572)
			return NPCVarDomainType.method15863(1778988549);
		return Class523_Sub30.method16186(aString603, aString594, 1031899985);
	}

	static boolean method1152() {
		if (-1 != 426956199 * anInt572)
			return NPCVarDomainType.method15863(-1204290745);
		return Class523_Sub30.method16186(aString603, aString594, -1349584736);
	}

	public static final void method1153() {
		anInt601 = -953811567;
		anInt610 = 1308064294;
		anInt609 = 1392121894;
	}

	public static final void method1154() {
		anInt601 = -953811567;
		anInt610 = 1308064294;
		anInt609 = 1392121894;
	}

	static void method1155() {
		aClass116_568.method1998(1777778530);
		aClass116_568.updateBuffer.offset = 0;
		aClass116_568.currentPacket = null;
		aClass116_568.aClass409_1417 = null;
		aClass116_568.aClass409_1430 = null;
		aClass116_568.aClass409_1426 = null;
		aClass116_568.anInt1421 = 0;
		aClass116_568.anInt1423 = 0;
		client.anInt11063 = 0;
		QuickChatStringType.method10448((byte) -65);
		Class100.method1794(-279578236);
		for (int i = 0; i < 2048; i++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
		Class241.player = null;
		for (int i = 0; i < client.anInt11049 * -1359865227; i++) {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i].anObject10554);
			if (null != class647_sub1_sub3_sub1)
				class647_sub1_sub3_sub1.faceEntityId = 1843265241;
		}
		Class39.method1131((short) 14040);
		Class313.method5656(NetworkStream.method9224(-892409861), 743172261);
		Class657.method10791(9, (byte) -70);
		for (int i = 0; i < 106; i++)
			client.aBoolArray11246[i] = true;
		PacketsDecoder.method4264(aClass116_568, -1041044506);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
		Class286.method5152((byte) -105);
		Class423.clientConfigsDomain.method14383((byte) 0);
	}

	static boolean method1156(String string, String string_0_) {
		anInt567 = 1953306581;
		aClass116_568 = client.aClass116_11058;
		return Class159.method2570(false, false, string, string_0_, -1L);
	}

	public static final void method1157() {
		if (1 != anInt601 * -1905499279) {
			aClass116_568.method1980((short) -6084);
			Class428.method6758(1705571518);
			Compression.method7275((byte) 0);
		}
	}

	static {
		aBool574 = false;
		anInt572 = 1907326441;
		aLong573 = -9083684963104943157L;
		anInt601 = -953811567;
		aLong577 = 0L;
		aString603 = "";
		aString594 = "";
		aString583 = "";
		aBool588 = true;
		anInt607 = 0;
		anInt575 = 0;
		anInt609 = 1392121894;
		anInt610 = 1308064294;
		anInt611 = -268739818;
		anInt612 = -451988427;
		anInt604 = -935440555;
		anInt614 = 0;
		anInt578 = 1142124537;
		anInt616 = 234297499;
		anInt617 = 0;
		aBool618 = false;
		anInt619 = 0;
		aBool620 = false;
	}

	public static final boolean method1158() {
		return 1 != -1905499279 * anInt601;
	}

	public static void method1159() {
		if (102 == -1905499279 * anInt601)
			anInt601 = 547286896;
	}

	public static void method1160() {
		if (102 == -1905499279 * anInt601)
			anInt601 = 547286896;
	}

	public static void method1161() {
		if (102 == -1905499279 * anInt601)
			anInt601 = 547286896;
	}

	public static void method1162(String string, String string_1_, String string_2_, boolean bool) {
		if (string.length() <= 320 && Class653_Sub1.method16688((byte) 67)) {
			Class387.method6467(1073635680);
			aString603 = string;
			aString594 = string_1_;
			aString583 = string_2_;
			aBool588 = bool;
			Class657.method10791(3, (byte) -70);
		}
	}

	public static void method1163(String string, String string_3_, String string_4_, boolean bool) {
		if (string.length() <= 320 && Class653_Sub1.method16688((byte) 68)) {
			Class387.method6467(1369460850);
			aString603 = string;
			aString594 = string_3_;
			aString583 = string_4_;
			aBool588 = bool;
			Class657.method10791(3, (byte) -39);
		}
	}

	public static void method1164(int i, String string, boolean bool) {
		if (Class653_Sub1.method16688((byte) 68)) {
			if (anInt572 * 426956199 != i)
				aLong573 = -9083684963104943157L;
			anInt572 = i * -1907326441;
			aString583 = string;
			aBool588 = bool;
			Class657.method10791(3, (byte) -101);
		}
	}

	static final void method1165() {
		if (-1905499279 * anInt601 != 1 && 102 != -1905499279 * anInt601) {
			do {
				try {
					int i;
					if (anInt575 * -312035097 == 0 && -1905499279 * anInt601 < 95)
						i = 500;
					else
						i = 2000;
					if (aBool574 && -1905499279 * anInt601 >= 66)
						i = 6000;
					if ((267 == anInt567 * 1566115167 && 210 != anInt601 * -1905499279 && 42 != anInt610 * 404908773) || (142 == 1566115167 * anInt567 && 49 != anInt609 * -1471454747 && -1471454747 * anInt609 != 52))
						anInt607 += 477607871;
					if (128464959 * anInt607 > i) {
						aClass116_568.method1980((short) -26848);
						if (-312035097 * anInt575 < 3) {
							if (267 == 1566115167 * anInt567)
								Class155.aClass1_1735.method497((byte) -3);
							else
								Class6.aClass1_42.method497((byte) -72);
							anInt607 = 0;
							anInt575 += -372581673;
							anInt601 = -1901992645;
						} else {
							anInt601 = -953811567;
							Class645.method10563(-5, 2037759138);
							Compression.method7275((byte) 0);
							break;
						}
					}
					if (-1905499279 * anInt601 == 11) {
						if (267 == anInt567 * 1566115167)
							aClass116_568.method1976(Class191.method3627((Class155.aClass1_1735.method502(-2140492612)), 40000, (byte) 0), Class155.aClass1_1735.aString9, -1903508599);
						else
							aClass116_568.method1976((Class191.method3627(Class6.aClass1_42.method502(-2131799903), 40000, (byte) 0)), Class6.aClass1_42.aString9, -1534567067);
						aClass116_568.method1998(1508681272);
						Class523_Sub22 class523_sub22 = Class493.method8087(110994031);
						if (aBool574) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4196.anInt4190), 374390001);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -50);
							int i_5_ = ((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(876, -2057788614);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1, -2083246719);
							if (1566115167 * anInt567 == 267)
								class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((client.anInt11136 * -2020118759 == 17 ? 1 : 0), -547387803);
							RSBuffer class523_sub34 = Class608.method9988((byte) 0);
							Class263.method4739(class523_sub34, (long) (anInt572 * 426956199));
							Class176.aLong1857 = (long) anInt572 * -2373984093781879965L;
							class523_sub34.writeByte(anInt572 * 426956199, -1886730254);
							class523_sub34.writeByte(Class53_Sub20.aClass668_10979.method82(), 1074809488);
							class523_sub34.writeInt((client.anInt10984 * 1778108951), -1967044590);
							for (int i_6_ = 0; i_6_ < 5; i_6_++)
								class523_sub34.writeInt((int) (Math.random() * 9.9999999E7), -2027821192);
							class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
							class523_sub34.writeByte((1884825957 * (client.aClass681_11284.anInt8648)), -1267005017);
							class523_sub34.writeByte((int) (Math.random() * 9.9999999E7), -873599801);
							class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
							class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -27886);
							class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011 - i_5_, -995289313);
						} else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4184.anInt4190), -1409597918);
						aClass116_568.method1974(class523_sub22, (byte) 32);
						aClass116_568.method1973(1512049308);
						anInt601 = -457199072;
					}
					if (32 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 524136610))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 19254);
						aClass116_568.updateBuffer.offset = 0;
						int i_7_ = aClass116_568.updateBuffer.readUnsignedByte(-1778515278);
						if (0 != i_7_) {
							anInt601 = -953811567;
							Class17.method778(i_7_, 2032708296);
							Class645.method10563(i_7_, 1878698942);
							aClass116_568.method1980((short) -10955);
							Compression.method7275((byte) 0);
							break;
						}
						aClass116_568.updateBuffer.offset = 0;
						if (aBool574)
							anInt601 = 502242984;
						else
							anInt601 = 1004485968;
					}
					if (40 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(2, 2002175007))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 15908);
						aClass116_568.updateBuffer.offset = 0;
						aClass116_568.updateBuffer.offset = aClass116_568.updateBuffer.readUnsignedShort(-472538024) * 189765723;
						anInt601 = -920028633;
					}
					if (anInt601 * -1905499279 == 55) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(2349011 * (aClass116_568.updateBuffer.offset), 1675246455))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2349011 * (aClass116_568.updateBuffer.offset), (short) 24987);
						aClass116_568.updateBuffer.method16308(anIntArray569, (byte) -63);
						aClass116_568.updateBuffer.offset = 0;
						String string = aClass116_568.updateBuffer.readVersionedString(2017312411);
						aClass116_568.updateBuffer.offset = 0;
						String string_8_ = Class402.aClass402_4165.method6574(1621057790);
						Class388.method6470(string, true, string_8_, client.aBool10996, -494472837);
						anInt601 = 1472946018;
					}
					if (66 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 969601683))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 30689);
						if (1 == ((aClass116_568.updateBuffer.buffer[0]) & 0xff))
							anInt601 = -908767655;
					}
					if (-1905499279 * anInt601 == 73) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(16, 719534764))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 16, (short) 31627);
						aClass116_568.updateBuffer.offset = -1258715728;
						aClass116_568.updateBuffer.method16308(anIntArray569, (byte) -4);
						aClass116_568.updateBuffer.offset = 0;
						aLong573 = (aClass116_568.updateBuffer.readLong((byte) 5) * 9083684963104943157L);
						aLong577 = (aClass116_568.updateBuffer.readLong((byte) -126) * 8201862548359724895L);
						anInt601 = 1004485968;
					}
					if (-1905499279 * anInt601 == 80) {
						aClass116_568.updateBuffer.offset = 0;
						aClass116_568.method1998(1438456452);
						Class523_Sub22 class523_sub22 = Class493.method8087(513598188);
						RSBitBuffer class523_sub34_sub2 = class523_sub22.aClass523_Sub34_Sub2_10525;
						if (1566115167 * anInt567 == 267) {
							Class406 class406;
							if (aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4186;
							class523_sub34_sub2.writeByte((class406.anInt4190 * 1752807475), 521483638);
							class523_sub34_sub2.writeShort(0, (byte) -13);
							int i_9_ = class523_sub34_sub2.offset * 2349011;
							int i_10_ = 2349011 * class523_sub34_sub2.offset;
							if (!aBool574) {
								class523_sub34_sub2.writeInt(876, -1886777724);
								class523_sub34_sub2.writeInt(1, -1312480107);
								class523_sub34_sub2.writeByte((-2020118759 * client.anInt11136 == 17 ? 1 : 0), 219400172);
								i_10_ = 2349011 * class523_sub34_sub2.offset;
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -320);
								i_10_ = 2349011 * class523_sub34_sub2.offset;
								class523_sub34_sub2.writeByte((-1L == -529544860571826659L * aLong573 ? 1 : 0), 749072040);
								if (aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(aString603, (byte) 88);
								else
									class523_sub34_sub2.method16441(aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(Class316.method5685(-1001907264), 226033303);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -4);
							class523_sub34_sub2.writeShort((Class254.anInt2742 * -495986435), (byte) -4);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -81), -348537573);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) 53);
							class523_sub34_sub2.writeInt((1778108951 * (client.anInt10984)), -657419419);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 25024);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), -2000366002);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -3081);
							client.aBool11012 = true;
							RSBuffer class523_sub34_11_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(-1282868590)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_11_, 1641932540);
							class523_sub34_sub2.readBytes(class523_sub34_11_.buffer, 0, class523_sub34_11_.buffer.length, (short) -8694);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -1023301302);
							class523_sub34_sub2.writeInt((client.anInt10988 * 503698129), -952543193);
							class523_sub34_sub2.writeInt((742099907 * (client.anInt10987)), -1107018382);
							class523_sub34_sub2.writeInt((-1652858555 * (client.anInt10990)), -1250002867);
							class523_sub34_sub2.writeInt((client.anInt11192 * -1046646323), -1495735109);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) 29);
							class523_sub34_sub2.writeByte(((client.aString11112) == null) ? 0 : 1, -1575650737);
							if (null != client.aString11112)
								class523_sub34_sub2.method16270(client.aString11112, (byte) 44);
							class523_sub34_sub2.writeByte((client.aBool11185 ? 1 : 0), -1657180057);
							class523_sub34_sub2.writeByte((client.aBool11142 ? 1 : 0), 1151082383);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, 286401775);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -1895755215);
							class523_sub34_sub2.method16270(client.aString11001, (byte) 88);
							class523_sub34_sub2.writeByte((null == Class6.aClass1_40 || (Class6.aClass1_40.anInt10 * -1126141351 != (Class155.aClass1_1735.anInt10 * -1126141351))) ? 1 : 0, 15421966);
							class523_sub34_sub2.writeShort((-1126141351 * (Class6.aClass1_42.anInt10)), (byte) -15);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(anIntArray569, i_10_, 2349011 * class523_sub34_sub2.offset, (byte) 52);
							class523_sub34_sub2.method16275((2349011 * class523_sub34_sub2.offset - i_9_), -1371513974);
						} else {
							Class406 class406;
							if (aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4187;
							class523_sub34_sub2.writeByte((1752807475 * (class406.anInt4190)), -1271818947);
							class523_sub34_sub2.writeShort(0, (byte) -47);
							int i_12_ = 2349011 * class523_sub34_sub2.offset;
							int i_13_ = class523_sub34_sub2.offset * 2349011;
							if (!aBool574) {
								class523_sub34_sub2.writeInt(876, -1204066063);
								class523_sub34_sub2.writeInt(1, -883598739);
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -2414);
								i_13_ = class523_sub34_sub2.offset * 2349011;
								class523_sub34_sub2.writeByte((-529544860571826659L * aLong573 == -1L ? 1 : 0), 1392156652);
								if (aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(aString603, (byte) 90);
								else
									class523_sub34_sub2.method16441(aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(1884825957 * client.aClass681_11284.anInt8648, -1772857473);
							class523_sub34_sub2.writeByte(Class53_Sub20.aClass668_10979.method82(), -803766709);
							class523_sub34_sub2.writeByte(Class316.method5685(-1667417349), -623326384);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -123);
							class523_sub34_sub2.writeShort((-495986435 * (Class254.anInt2742)), (byte) -8);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -46), -936830881);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) -43);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 3980);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), 1772463935);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -10405);
							RSBuffer class523_sub34_14_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(-362782810)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_14_, 738027186);
							class523_sub34_sub2.readBytes(class523_sub34_14_.buffer, 0, class523_sub34_14_.buffer.length, (short) -11813);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -1103438499);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) -34);
							class523_sub34_sub2.writeInt((client.anInt10984 * 1778108951), -646047460);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -1774932421);
							class523_sub34_sub2.method16270(client.aString11001, (byte) -60);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, 734527354);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(anIntArray569, i_13_, class523_sub34_sub2.offset * 2349011, (byte) 49);
							class523_sub34_sub2.method16275((class523_sub34_sub2.offset * 2349011 - i_12_), -544413182);
						}
						aClass116_568.method1974(class523_sub22, (byte) 62);
						aClass116_568.method1973(1512049308);
						aClass116_568.aClass11_1413 = new Class11(anIntArray569);
						for (int i_15_ = 0; i_15_ < 4; i_15_++)
							anIntArray569[i_15_] += 50;
						aClass116_568.aClass11_1420 = new Class11(anIntArray569);
						new Class11(anIntArray569);
						aClass116_568.updateBuffer.method18218(aClass116_568.aClass11_1420, -310463093);
						anIntArray569 = null;
						anInt601 = -417785649;
					}
					if (95 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1062131431))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 18716);
						int i_16_ = aClass116_568.updateBuffer.readUnsignedByte(-1623387153);
						aClass116_568.updateBuffer.offset = 0;
						if (21 == i_16_)
							anInt601 = 1986449980;
						else {
							if (1 == i_16_) {
								anInt601 = 1495467974;
								Class645.method10563(i_16_, -1370752007);
								break;
							}
							if (52 == i_16_) {
								Class687_Sub20.anInt10869 = i_16_ * -344136887;
								anInt601 = 1094573792;
							} else if (2 == i_16_) {
								if (aBool620) {
									aBool620 = false;
									anInt601 = -1901992645;
									break;
								}
								if (1566115167 * anInt567 == 267) {
									Class423.clientConfigsDomain.method14395(34186);
									anInt601 = 637374720;
								} else
									anInt601 = 569808852;
							} else if (15 == i_16_) {
								aClass116_568.anInt1421 = 1993757502;
								anInt601 = 2037124381;
							} else {
								if (23 == i_16_ && -312035097 * anInt575 < 3) {
									anInt607 = 0;
									anInt575 += -372581673;
									anInt601 = -1901992645;
									aClass116_568.method1980((short) -5517);
									break;
								}
								if (42 == i_16_) {
									anInt601 = 1563033842;
									Class645.method10563(i_16_, -1273244871);
									break;
								}
								if (142 == anInt567 * 1566115167 && i_16_ == 49 && 4 != -2020118759 * client.anInt11136) {
									if (anInt609 * -1471454747 != 52)
										Class645.method10563(i_16_, -1401982029);
									break;
								}
								if (aBool579 && !aBool574 && -1 != anInt572 * 426956199 && i_16_ == 35) {
									aBool574 = true;
									anInt607 = 0;
									anInt601 = -1901992645;
									aClass116_568.method1980((short) -15423);
									break;
								}
								if (53 == i_16_)
									anInt601 = -801788364;
								else {
									anInt601 = -953811567;
									Class645.method10563(i_16_, -1223957275);
									aClass116_568.method1980((short) -2085);
									Compression.method7275((byte) 0);
									break;
								}
							}
						}
					}
					if (124 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(1, 1953401758)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 15309);
							int i_17_ = ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							anInt614 = -1962324270 * i_17_;
							anInt601 = -953811567;
							Class645.method10563(21, -1974416170);
							aClass116_568.method1980((short) -1606);
							Compression.method7275((byte) 0);
						}
					} else if (anInt601 * -1905499279 == 210) {
						if (aClass116_568.getCurrentStream(782493095).method9199(2, 963470570)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 21533);
							anInt617 = ((((aClass116_568.updateBuffer.buffer[0]) & 0xff) << 8) + ((aClass116_568.updateBuffer.buffer[1]) & 0xff)) * 1390260393;
							anInt601 = -417785649;
						}
					} else if (-1905499279 * anInt601 == 244) {
						if (aClass116_568.getCurrentStream(782493095).method9199(4, 412510051)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 4, (short) 26959);
							anInt619 = aClass116_568.updateBuffer.readUnsignedInt((byte) -53) * 284188369;
							aClass116_568.updateBuffer.offset = 0;
							anInt601 = -953811567;
							Class645.method10563(53, -676830244);
							aClass116_568.method1980((short) -9785);
							Compression.method7275((byte) 0);
						}
					} else if (198 == -1905499279 * anInt601) {
						if (29 == Class687_Sub20.anInt10869 * 1969323769) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1941022026))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 32526);
							anInt616 = -234297499 * ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
						} else if (1969323769 * Class687_Sub20.anInt10869 == 45) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(3, 665490806))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 3, (short) 11077);
							anInt616 = ((aClass116_568.updateBuffer.buffer[0]) & 0xff) * -234297499;
							anInt578 = (((aClass116_568.updateBuffer.buffer[2]) & 0xff) + (((aClass116_568.updateBuffer.buffer[1]) & 0xff) << 8)) * -1142124537;
						} else
							throw new IllegalStateException();
						anInt601 = -953811567;
						Class645.method10563((1969323769 * Class687_Sub20.anInt10869), -844641819);
						aClass116_568.method1980((short) -32078);
						Compression.method7275((byte) 0);
						if (Class691.method13965((-2020118759 * client.anInt11136), (byte) 25)) {
							Class669.method13691(true, -1838550041);
							anInt610 = -622674299 * Class687_Sub20.anInt10869;
						}
					} else if (224 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(2, 1965833083)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 11653);
							aClass116_568.updateBuffer.offset = 0;
							Class674.anInt8628 = aClass116_568.updateBuffer.readUnsignedShort(-1871579133) * 1175030903;
							aClass116_568.updateBuffer.offset = 0;
							anInt601 = -1287139881;
						}
					} else if (231 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(1216875847 * Class674.anInt8628, 1299542313)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1216875847 * Class674.anInt8628, (short) 16301);
							aClass116_568.updateBuffer.offset = 0;
							byte[] is = (new byte[1 + Class674.anInt8628 * 1216875847]);
							aClass116_568.updateBuffer.method18222(is, 0, 1216875847 * Class674.anInt8628, (byte) 104);
							aClass116_568.updateBuffer.offset = 0;
							RSBuffer class523_sub34 = new RSBuffer(is);
							String string = class523_sub34.readString(347901673);
							Class331.method5825(string, true, client.aBool10996, -446123547);
							Class645.method10563((1969323769 * Class687_Sub20.anInt10869), 1389832573);
							if (1566115167 * anInt567 == 142 && client.anInt11136 * -2020118759 != 4)
								anInt601 = -417785649;
							else {
								anInt601 = -953811567;
								aClass116_568.method1980((short) -18792);
								Compression.method7275((byte) 0);
							}
						}
					} else {
						if (256 == -1905499279 * anInt601) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(2, 1757704317))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 18092);
							aClass116_568.updateBuffer.offset = 0;
							aClass116_568.anInt1421 = aClass116_568.updateBuffer.readUnsignedShort(-1937499316) * 1150604897;
							anInt601 = 643005209;
						}
						if (265 == anInt601 * -1905499279) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * aClass116_568.anInt1421, 1523800873))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, -1372959327 * aClass116_568.anInt1421, (short) 13151);
							aClass116_568.updateBuffer.offset = 0;
							boolean bool = (aClass116_568.updateBuffer.readUnsignedByte(1027591973) == 1);
							while (2349011 * (aClass116_568.updateBuffer.offset) < aClass116_568.anInt1421 * -1372959327) {
								Class426 class426 = (Class114.aClass98_Sub1_Sub2_1405.refreshNIS((aClass116_568.updateBuffer), -1610800694));
								Class423.clientConfigsDomain.anInterface2_1714.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1453855632);
							}
							if (bool) {
								Class523_Sub22 class523_sub22 = Class493.method8087(-1685365009);
								RSBitBuffer class523_sub34_sub2 = (class523_sub22.aClass523_Sub34_Sub2_10525);
								class523_sub34_sub2.writeByte((1752807475 * Class406.aClass406_4185.anInt4190), -2118004888);
								aClass116_568.method1974(class523_sub22, (byte) 106);
								aClass116_568.method1973(1512049308);
								anInt601 = 84457335;
							} else
								anInt601 = 637374720;
						}
						if (-1905499279 * anInt601 == 135) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 617485025))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 17359);
							int i_18_ = ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							if (2 != i_18_) {
								if (29 == i_18_ || 45 == i_18_) {
									Class687_Sub20.anInt10869 = -344136887 * i_18_;
									anInt601 = 123870758;
								} else {
									anInt601 = -953811567;
									Class645.method10563(i_18_, 1054228908);
									aClass116_568.method1980((short) -8980);
									Compression.method7275((byte) 0);
									if (Class691.method13965((-2020118759 * (client.anInt11136)), (byte) 12)) {
										Class669.method13691(true, -1838550041);
										anInt610 = -654032147 * i_18_;
									}
									break;
								}
								break;
							}
							anInt601 = 569808852;
						}
						if (anInt601 * -1905499279 == 148) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1895361003))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 17278);
							Class548.anInt7321 = 811531845 * ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							anInt601 = -1811904821;
						}
						if (anInt601 * -1905499279 == 155) {
							RSBitBuffer class523_sub34_sub2 = aClass116_568.updateBuffer;
							if (267 == 1566115167 * anInt567) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(Class548.anInt7321 * -31497075, 642445160))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, Class548.anInt7321 * -31497075, (short) 7391);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(-408933675) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(-711715060) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(1971867421) == 1;
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(-419327161) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(-1360130690) == 1;
								client.aBool11164 = class523_sub34_sub2.readUnsignedByte(-47765159) == 1;
								client.anInt11154 = (class523_sub34_sub2.readUnsignedShort(-1864391956) * -435708883);
								client.aBool11156 = class523_sub34_sub2.readUnsignedByte(651342944) == 1;
								Class303.anInt3343 = class523_sub34_sub2.method16286(446430516) * 1728814959;
								client.aBool11157 = class523_sub34_sub2.readUnsignedByte(-1196691266) == 1;
								Class289.aString3120 = class523_sub34_sub2.readString(-217592166);
								Class159_Sub1.aLong8869 = ((class523_sub34_sub2.method16291((short) 607) - TimeUtils.getCurrentTimeMilliseconds(1516375036)) * 1944424440918290845L);
								client.aClass505_11019.method8244(2059277342).method17222(client.aBool11157, (byte) 59);
								Class329_Sub2.aClass511_10050.method8540(304233020).method8244(1612036903).method17222(client.aBool11157, (byte) 65);
								Class523_Sub37.aClass53_Sub8_10677.method17183(client.aBool11157, -308557875);
								Class174.aClass53_Sub7_1856.method17174(client.aBool11157, (byte) 111);
							} else {
								if (!aClass116_568.getCurrentStream(782493095).method9199(-31497075 * Class548.anInt7321, 560865427))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, -31497075 * Class548.anInt7321, (short) 25734);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(1650958752) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(-1553449679) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(-1773494927) == 1;
								Class303.anInt3343 = (class523_sub34_sub2.method16286(1806766650) * 1728814959);
								Class241.player.aByte12182 = (byte) class523_sub34_sub2.readUnsignedByte(2008219144);
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(-386199010) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(614711929) == 1;
								Class461.aLong5121 = (class523_sub34_sub2.readLong((byte) -6) * 7102560564029533211L);
								Class159_Sub1.aLong8869 = (((2688366688243830291L * Class461.aLong5121) - TimeUtils.getCurrentTimeMilliseconds(1516375036) - class523_sub34_sub2.method16289((byte) -1)) * 1944424440918290845L);
								int i_19_ = class523_sub34_sub2.readUnsignedByte(-1541869346);
								client.aBool11156 = 0 != (i_19_ & 0x1);
								Class411.aBool4540 = 0 != (i_19_ & 0x2);
								Compression.anInt4955 = (class523_sub34_sub2.readUnsignedInt((byte) -103) * 242962777);
								Class431.anInt4861 = class523_sub34_sub2.readUnsignedInt((byte) -21) * -17008787;
								Class375_Sub1.anInt10163 = (class523_sub34_sub2.readUnsignedShort(-1096465039) * 2113837661);
								Class188.anInt2133 = (class523_sub34_sub2.readUnsignedShort(-1897316870) * -898335641);
								Class491.anInt5537 = (class523_sub34_sub2.readUnsignedShort(-1186247572) * -383547655);
								Class324.anInt3454 = class523_sub34_sub2.readUnsignedInt((byte) -87) * -82489775;
								Class454.aClass63_4979 = new Class63(134134449 * Class324.anInt3454);
								new Thread(Class454.aClass63_4979).start();
								client.anInt11162 = (class523_sub34_sub2.readUnsignedByte(-2083605773) * -888766121);
								Class76.anInt853 = class523_sub34_sub2.readUnsignedShort(-261406051) * 459393563;
								Class227.anInt2346 = (class523_sub34_sub2.readUnsignedShort(-1486044848) * 2020015531);
								Class692.aBool8741 = class523_sub34_sub2.readUnsignedByte(-734325847) == 1;
								Class241.player.username = Class241.player.displayName = RuntimeException_Sub4.aString12099 = class523_sub34_sub2.readVersionedString(2029706061);
								Class190.anInt2154 = (class523_sub34_sub2.readUnsignedByte(906284904) * -1376256479);
								Class297_Sub1.anInt10002 = (class523_sub34_sub2.readUnsignedInt((byte) -31) * -1095634933);
								Class6.aClass1_40 = new RSSocket();
								Class6.aClass1_40.anInt10 = (class523_sub34_sub2.readUnsignedShort(-1261464260) * 1274525161);
								if (65535 == -1126141351 * Class6.aClass1_40.anInt10)
									Class6.aClass1_40.anInt10 = -1274525161;
								Class6.aClass1_40.aString9 = class523_sub34_sub2.readVersionedString(2129152373);
								Class6.aClass1_40.anInt11 = (class523_sub34_sub2.readUnsignedShort(-2113914086) * 1509090121);
								Class6.aClass1_40.anInt12 = class523_sub34_sub2.readUnsignedShort(-260973272) * 19836347;
								if ((Class674.aClass674_8617 != Class80.aClass674_865) && ((Class674.aClass674_8615 != Class80.aClass674_865) || -1746920271 * client.rights < 2) && (Class155.aClass1_1735.method505(Class648.aClass1_8378, (short) 21983)))
									Class212.method3830(-1643581329);
							}
							if (client.aBool11224) {
								try {
									Class35.method952(Class305.anApplet3346, "zap", (byte) 4);
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
									Class35.method952(Class305.anApplet3346, "unzap", (byte) 83);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class80.aClass674_865 == Class674.aClass674_8613)
								Class402.aClass402_4158.method6573((byte) -66);
							if (267 == 1566115167 * anInt567)
								anInt601 = 2020232914;
							else {
								anInt601 = -953811567;
								Class645.method10563(2, 585852091);
								Class242.method4371((byte) 7);
								Class657.method10791(0, (byte) -92);
								aClass116_568.currentPacket = null;
								break;
							}
						}
						if (178 == anInt601 * -1905499279) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(3, 915870367))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 3, (short) 23057);
							anInt601 = 1072051836;
						}
						if (188 == anInt601 * -1905499279) {
							RSBitBuffer class523_sub34_sub2 = aClass116_568.updateBuffer;
							class523_sub34_sub2.offset = 0;
							if (class523_sub34_sub2.method18225(425085032)) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1050837812))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 3, 1, (short) 18507);
							}
							aClass116_568.currentPacket = (Class189.method3601(2143493825)[class523_sub34_sub2.method18221((byte) 33)]);
							aClass116_568.anInt1421 = (class523_sub34_sub2.readUnsignedShort(-2145075261) * 1150604897);
							anInt601 = 1534881397;
						}
						if (165 == anInt601 * -1905499279) {
							if (aClass116_568.getCurrentStream(782493095).method9199(aClass116_568.anInt1421 * -1372959327, 1229523406)) {
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, aClass116_568.anInt1421 * -1372959327, (short) 9300);
								aClass116_568.updateBuffer.offset = 0;
								int i_20_ = -1372959327 * aClass116_568.anInt1421;
								anInt601 = -953811567;
								Class645.method10563(2, 2035152666);
								Class221.method4137(1731470037);
								Class691.method13963(aClass116_568.updateBuffer, 702742205);
								int i_21_ = i_20_ - (aClass116_568.updateBuffer.offset) * 2349011;
								RSBitBuffer class523_sub34_sub2 = new RSBitBuffer(i_21_);
								System.arraycopy((aClass116_568.updateBuffer.buffer), (2349011 * (aClass116_568.updateBuffer.offset)), (class523_sub34_sub2.buffer), 0, i_21_);
								aClass116_568.updateBuffer.offset += 189765723 * i_21_;
								if (IncomingPacket.DYNAMIC_REGION_PACKET == aClass116_568.currentPacket)
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5571, class523_sub34_sub2), 1235970069);
								else
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5575, class523_sub34_sub2), 1235970069);
								if (2349011 * (aClass116_568.updateBuffer.offset) != i_20_)
									throw new RuntimeException(new StringBuilder().append((aClass116_568.updateBuffer.offset) * 2349011).append(" ").append(i_20_).toString());
								aClass116_568.currentPacket = null;
							}
						} else {
							if (205 != anInt601 * -1905499279)
								break;
							if (-1372959327 * aClass116_568.anInt1421 == -2) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(2, 1932407724))
									break;
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 19783);
								aClass116_568.updateBuffer.offset = 0;
								aClass116_568.anInt1421 = (aClass116_568.updateBuffer.readUnsignedShort(-687631245) * 1150604897);
							}
							if (aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * aClass116_568.anInt1421, 2005937871)) {
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, aClass116_568.anInt1421 * -1372959327, (short) 10334);
								aClass116_568.updateBuffer.offset = 0;
								int i_22_ = -1372959327 * aClass116_568.anInt1421;
								anInt601 = -953811567;
								Class645.method10563(15, 1641627247);
								Class241.method4363(1478369958);
								Class691.method13963(aClass116_568.updateBuffer, 702742205);
								if (i_22_ != 2349011 * (aClass116_568.updateBuffer.offset))
									throw new RuntimeException(new StringBuilder().append(2349011 * (aClass116_568.updateBuffer.offset)).append(" ").append(i_22_).toString());
								aClass116_568.currentPacket = null;
							}
						}
					}
				} catch (IOException ioexception) {
					aClass116_568.method1980((short) -27166);
					if (-312035097 * anInt575 < 3) {
						if (anInt567 * 1566115167 == 267)
							Class155.aClass1_1735.method497((byte) -23);
						else
							Class6.aClass1_42.method497((byte) -37);
						anInt607 = 0;
						anInt575 += -372581673;
						anInt601 = -1901992645;
					} else {
						anInt601 = -953811567;
						Class645.method10563(-4, 355081732);
						Compression.method7275((byte) 0);
					}
					break;
				}
				break;
			} while (false);
		}
	}

	public static void method1166(String string, String string_23_, String string_24_, boolean bool) {
		if (string.length() <= 320 && Class653_Sub1.method16688((byte) 108)) {
			client.aClass116_11057.method1980((short) -26163);
			Class387.method6467(892346414);
			aString603 = string;
			aString594 = string_23_;
			aString583 = string_24_;
			aBool588 = bool;
			Class657.method10791(1, (byte) -83);
		}
	}

	public static void method1167(String string, String string_25_, String string_26_, boolean bool) {
		if (string.length() <= 320 && Class653_Sub1.method16688((byte) 74)) {
			client.aClass116_11057.method1980((short) -9957);
			Class387.method6467(1223226766);
			aString603 = string;
			aString594 = string_25_;
			aString583 = string_26_;
			aBool588 = bool;
			Class657.method10791(1, (byte) -82);
		}
	}

	public static void method1168(int i, String string, boolean bool) {
		if (Class653_Sub1.method16688((byte) 12)) {
			if (anInt572 * 426956199 != i)
				aLong573 = -9083684963104943157L;
			anInt572 = i * -1907326441;
			aString583 = string;
			aBool588 = bool;
			client.aClass116_11057.method1980((short) -29367);
			Class657.method10791(1, (byte) -5);
		}
	}

	public static void method1169(int i, String string, boolean bool) {
		if (Class653_Sub1.method16688((byte) 48)) {
			if (anInt572 * 426956199 != i)
				aLong573 = -9083684963104943157L;
			anInt572 = i * -1907326441;
			aString583 = string;
			aBool588 = bool;
			client.aClass116_11057.method1980((short) 211);
			Class657.method10791(1, (byte) -97);
		}
	}

	public static void method1170(int i, String string, boolean bool) {
		if (Class653_Sub1.method16688((byte) 103)) {
			if (anInt572 * 426956199 != i)
				aLong573 = -9083684963104943157L;
			anInt572 = i * -1907326441;
			aString583 = string;
			aBool588 = bool;
			client.aClass116_11057.method1980((short) -12699);
			Class657.method10791(1, (byte) -89);
		}
	}

	public static void method1171(String string, boolean bool) {
		if (0 == -2020118759 * client.anInt11136 && (!Class366.method6324(943675097) && !Class471.method7636(-1990483367))) {
			aString583 = string;
			aBool588 = bool;
			Class657.method10791(8, (byte) -9);
		}
	}

	static void method1172(RSBuffer class523_sub34, long l) {
		Class3 class3;
		if (null != aString583 && aString583.length() == 6) {
			if (aBool588)
				class3 = Class3.aClass3_29;
			else
				class3 = Class3.aClass3_30;
		} else if (Class220.aClass57_2331.method1367(l))
			class3 = Class3.aClass3_28;
		else
			class3 = Class3.aClass3_31;
		class523_sub34.writeByte(class3.method82(), 832454006);
		switch (-40972529 * class3.anInt27) {
		case 3:
			class523_sub34.offset += 759062892;
			break;
		case 1:
		case 2:
			class523_sub34.writeMedium(Integer.parseInt(aString583), (byte) 0);
			class523_sub34.offset += 189765723;
			break;
		case 0:
			class523_sub34.writeInt(Class220.aClass57_2331.method1374(l), -743721281);
			break;
		}
	}

	Class43() throws Throwable {
		throw new Error();
	}

	static void method1173() {
		aString583 = "";
		aString594 = "";
		aString603 = "";
		aBool588 = true;
	}

	static boolean method1174(String string, String string_27_) {
		anInt567 = -730624974;
		aClass116_568 = client.aClass116_11057;
		return Class159.method2570(false, false, string, string_27_, -1L);
	}

	public static final void method1175() {
		anInt601 = -953811567;
		anInt610 = 1308064294;
		anInt609 = 1392121894;
	}

	static void method1176(RSBitBuffer class523_sub34_sub2) {
		JS5ArchiveReference[] class44s = Class88.getArchiveReferences(-401328218);
		for (int i = 0; i < class44s.length; i++) {
			JS5ArchiveReference class44 = class44s[i];
			if (class44 != JS5ArchiveReference.LOADING_SPRITES_INDEX) {
				Class472 class472 = (Class472) Class488.aMap5500.get(class44);
				if (class472 == null)
					class523_sub34_sub2.writeInt(0, -1124339870);
				else
					class523_sub34_sub2.writeInt(class472.method7719((short) 17680), -1584404764);
			}
		}
	}

	static boolean method1177(String string, String string_28_) {
		anInt567 = 1953306581;
		aClass116_568 = client.aClass116_11058;
		return Class159.method2570(false, false, string, string_28_, -1L);
	}

	static boolean method1178() {
		anInt567 = 1953306581;
		aClass116_568 = client.aClass116_11058;
		return Class159.method2570(-529544860571826659L * aLong573 == -1L, true, "", "", -529544860571826659L * aLong573);
	}

	static boolean method1179() {
		anInt567 = -730624974;
		aClass116_568 = client.aClass116_11057;
		return Class159.method2570(-529544860571826659L * aLong573 == -1L, true, "", "", -529544860571826659L * aLong573);
	}

	static void method1180() {
		Class195.method3665((byte) 5);
	}

	static final void method1181() {
		if (-1905499279 * anInt601 != 1 && 102 != -1905499279 * anInt601) {
			do {
				try {
					int i;
					if (anInt575 * -312035097 == 0 && -1905499279 * anInt601 < 95)
						i = 500;
					else
						i = 2000;
					if (aBool574 && -1905499279 * anInt601 >= 66)
						i = 6000;
					if ((267 == anInt567 * 1566115167 && 210 != anInt601 * -1905499279 && 42 != anInt610 * 404908773) || (142 == 1566115167 * anInt567 && 49 != anInt609 * -1471454747 && -1471454747 * anInt609 != 52))
						anInt607 += 477607871;
					if (128464959 * anInt607 > i) {
						aClass116_568.method1980((short) -10921);
						if (-312035097 * anInt575 < 3) {
							if (267 == 1566115167 * anInt567)
								Class155.aClass1_1735.method497((byte) -2);
							else
								Class6.aClass1_42.method497((byte) -106);
							anInt607 = 0;
							anInt575 += -372581673;
							anInt601 = -1901992645;
						} else {
							anInt601 = -953811567;
							Class645.method10563(-5, 569979328);
							Compression.method7275((byte) 0);
							break;
						}
					}
					if (-1905499279 * anInt601 == 11) {
						if (267 == anInt567 * 1566115167)
							aClass116_568.method1976(Class191.method3627((Class155.aClass1_1735.method502(-2126304650)), 40000, (byte) 0), Class155.aClass1_1735.aString9, 1098169159);
						else
							aClass116_568.method1976((Class191.method3627(Class6.aClass1_42.method502(-2122305599), 40000, (byte) 0)), Class6.aClass1_42.aString9, -473218856);
						aClass116_568.method1998(1594962206);
						Class523_Sub22 class523_sub22 = Class493.method8087(-1927516467);
						if (aBool574) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4196.anInt4190), -671247194);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -115);
							int i_29_ = ((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(876, -1337960875);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1, -1559280231);
							if (1566115167 * anInt567 == 267)
								class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((client.anInt11136 * -2020118759 == 17 ? 1 : 0), -1970835829);
							RSBuffer class523_sub34 = Class608.method9988((byte) 0);
							Class263.method4739(class523_sub34, (long) (anInt572 * 426956199));
							Class176.aLong1857 = (long) anInt572 * -2373984093781879965L;
							class523_sub34.writeByte(anInt572 * 426956199, -753528370);
							class523_sub34.writeByte(Class53_Sub20.aClass668_10979.method82(), 767403588);
							class523_sub34.writeInt((client.anInt10984 * 1778108951), -784214466);
							for (int i_30_ = 0; i_30_ < 5; i_30_++)
								class523_sub34.writeInt((int) (Math.random() * 9.9999999E7), -879750174);
							class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
							class523_sub34.writeByte((1884825957 * (client.aClass681_11284.anInt8648)), -1575060319);
							class523_sub34.writeByte((int) (Math.random() * 9.9999999E7), 1929667814);
							class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
							class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -20124);
							class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011 - i_29_, -1214140792);
						} else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4184.anInt4190), 1292999778);
						aClass116_568.method1974(class523_sub22, (byte) 17);
						aClass116_568.method1973(1512049308);
						anInt601 = -457199072;
					}
					if (32 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 814032199))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 30881);
						aClass116_568.updateBuffer.offset = 0;
						int i_31_ = aClass116_568.updateBuffer.readUnsignedByte(-361045180);
						if (0 != i_31_) {
							anInt601 = -953811567;
							Class17.method778(i_31_, 2032708296);
							Class645.method10563(i_31_, -1721120072);
							aClass116_568.method1980((short) -6519);
							Compression.method7275((byte) 0);
							break;
						}
						aClass116_568.updateBuffer.offset = 0;
						if (aBool574)
							anInt601 = 502242984;
						else
							anInt601 = 1004485968;
					}
					if (40 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(2, 1589519710))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 26177);
						aClass116_568.updateBuffer.offset = 0;
						aClass116_568.updateBuffer.offset = aClass116_568.updateBuffer.readUnsignedShort(-1103355067) * 189765723;
						anInt601 = -920028633;
					}
					if (anInt601 * -1905499279 == 55) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(2349011 * (aClass116_568.updateBuffer.offset), 947666278))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2349011 * (aClass116_568.updateBuffer.offset), (short) 26339);
						aClass116_568.updateBuffer.method16308(anIntArray569, (byte) -24);
						aClass116_568.updateBuffer.offset = 0;
						String string = aClass116_568.updateBuffer.readVersionedString(2081319292);
						aClass116_568.updateBuffer.offset = 0;
						String string_32_ = Class402.aClass402_4165.method6574(1621057790);
						Class388.method6470(string, true, string_32_, client.aBool10996, -494472837);
						anInt601 = 1472946018;
					}
					if (66 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1245789215))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 10021);
						if (1 == ((aClass116_568.updateBuffer.buffer[0]) & 0xff))
							anInt601 = -908767655;
					}
					if (-1905499279 * anInt601 == 73) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(16, 1902674223))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 16, (short) 24940);
						aClass116_568.updateBuffer.offset = -1258715728;
						aClass116_568.updateBuffer.method16308(anIntArray569, (byte) -51);
						aClass116_568.updateBuffer.offset = 0;
						aLong573 = (aClass116_568.updateBuffer.readLong((byte) -99) * 9083684963104943157L);
						aLong577 = (aClass116_568.updateBuffer.readLong((byte) -12) * 8201862548359724895L);
						anInt601 = 1004485968;
					}
					if (-1905499279 * anInt601 == 80) {
						aClass116_568.updateBuffer.offset = 0;
						aClass116_568.method1998(1508886143);
						Class523_Sub22 class523_sub22 = Class493.method8087(-305429677);
						RSBitBuffer class523_sub34_sub2 = class523_sub22.aClass523_Sub34_Sub2_10525;
						if (1566115167 * anInt567 == 267) {
							Class406 class406;
							if (aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4186;
							class523_sub34_sub2.writeByte((class406.anInt4190 * 1752807475), -1500116797);
							class523_sub34_sub2.writeShort(0, (byte) -28);
							int i_33_ = class523_sub34_sub2.offset * 2349011;
							int i_34_ = 2349011 * class523_sub34_sub2.offset;
							if (!aBool574) {
								class523_sub34_sub2.writeInt(876, -2013870246);
								class523_sub34_sub2.writeInt(1, -2102167491);
								class523_sub34_sub2.writeByte((-2020118759 * client.anInt11136 == 17 ? 1 : 0), 1125482237);
								i_34_ = 2349011 * class523_sub34_sub2.offset;
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -6736);
								i_34_ = 2349011 * class523_sub34_sub2.offset;
								class523_sub34_sub2.writeByte((-1L == -529544860571826659L * aLong573 ? 1 : 0), 1771013508);
								if (aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(aString603, (byte) 31);
								else
									class523_sub34_sub2.method16441(aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(Class316.method5685(-987059015), -1871406439);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -119);
							class523_sub34_sub2.writeShort((Class254.anInt2742 * -495986435), (byte) -81);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -14), 1718536241);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) 3);
							class523_sub34_sub2.writeInt((1778108951 * (client.anInt10984)), -1144587492);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 17720);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), -1671595995);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -26534);
							client.aBool11012 = true;
							RSBuffer class523_sub34_35_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(-1705022535)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_35_, 1965342999);
							class523_sub34_sub2.readBytes(class523_sub34_35_.buffer, 0, class523_sub34_35_.buffer.length, (short) -9650);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -853260295);
							class523_sub34_sub2.writeInt((client.anInt10988 * 503698129), -703603735);
							class523_sub34_sub2.writeInt((742099907 * (client.anInt10987)), -1915591701);
							class523_sub34_sub2.writeInt((-1652858555 * (client.anInt10990)), -1988115026);
							class523_sub34_sub2.writeInt((client.anInt11192 * -1046646323), -1147173339);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) 4);
							class523_sub34_sub2.writeByte(((client.aString11112) == null) ? 0 : 1, -682013630);
							if (null != client.aString11112)
								class523_sub34_sub2.method16270(client.aString11112, (byte) 9);
							class523_sub34_sub2.writeByte((client.aBool11185 ? 1 : 0), 598243046);
							class523_sub34_sub2.writeByte((client.aBool11142 ? 1 : 0), -1327697485);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, -800311024);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -810448681);
							class523_sub34_sub2.method16270(client.aString11001, (byte) 45);
							class523_sub34_sub2.writeByte((null == Class6.aClass1_40 || (Class6.aClass1_40.anInt10 * -1126141351 != (Class155.aClass1_1735.anInt10 * -1126141351))) ? 1 : 0, 1122903052);
							class523_sub34_sub2.writeShort((-1126141351 * (Class6.aClass1_42.anInt10)), (byte) -1);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(anIntArray569, i_34_, 2349011 * class523_sub34_sub2.offset, (byte) 110);
							class523_sub34_sub2.method16275((2349011 * class523_sub34_sub2.offset - i_33_), 1906394213);
						} else {
							Class406 class406;
							if (aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4187;
							class523_sub34_sub2.writeByte((1752807475 * (class406.anInt4190)), 354568520);
							class523_sub34_sub2.writeShort(0, (byte) -113);
							int i_36_ = 2349011 * class523_sub34_sub2.offset;
							int i_37_ = class523_sub34_sub2.offset * 2349011;
							if (!aBool574) {
								class523_sub34_sub2.writeInt(876, -1999721081);
								class523_sub34_sub2.writeInt(1, -1911098499);
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -17719);
								i_37_ = class523_sub34_sub2.offset * 2349011;
								class523_sub34_sub2.writeByte((-529544860571826659L * aLong573 == -1L ? 1 : 0), 1627873916);
								if (aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(aString603, (byte) 77);
								else
									class523_sub34_sub2.method16441(aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(1884825957 * client.aClass681_11284.anInt8648, 606505285);
							class523_sub34_sub2.writeByte(Class53_Sub20.aClass668_10979.method82(), -1837156129);
							class523_sub34_sub2.writeByte(Class316.method5685(1997379098), -1015744174);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -79);
							class523_sub34_sub2.writeShort((-495986435 * (Class254.anInt2742)), (byte) -45);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) 0), 1852488147);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) 30);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 31088);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), -604870431);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -15692);
							RSBuffer class523_sub34_38_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(-1365589663)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_38_, 910009169);
							class523_sub34_sub2.readBytes(class523_sub34_38_.buffer, 0, class523_sub34_38_.buffer.length, (short) -1442);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -820292888);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) 31);
							class523_sub34_sub2.writeInt((client.anInt10984 * 1778108951), -865407957);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -1639575168);
							class523_sub34_sub2.method16270(client.aString11001, (byte) 41);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, 733186502);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(anIntArray569, i_37_, class523_sub34_sub2.offset * 2349011, (byte) 53);
							class523_sub34_sub2.method16275((class523_sub34_sub2.offset * 2349011 - i_36_), -1330033492);
						}
						aClass116_568.method1974(class523_sub22, (byte) 60);
						aClass116_568.method1973(1512049308);
						aClass116_568.aClass11_1413 = new Class11(anIntArray569);
						for (int i_39_ = 0; i_39_ < 4; i_39_++)
							anIntArray569[i_39_] += 50;
						aClass116_568.aClass11_1420 = new Class11(anIntArray569);
						new Class11(anIntArray569);
						aClass116_568.updateBuffer.method18218(aClass116_568.aClass11_1420, -841783983);
						anIntArray569 = null;
						anInt601 = -417785649;
					}
					if (95 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 421034707))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 9680);
						int i_40_ = aClass116_568.updateBuffer.readUnsignedByte(-1377487241);
						aClass116_568.updateBuffer.offset = 0;
						if (21 == i_40_)
							anInt601 = 1986449980;
						else {
							if (1 == i_40_) {
								anInt601 = 1495467974;
								Class645.method10563(i_40_, -1201883865);
								break;
							}
							if (52 == i_40_) {
								Class687_Sub20.anInt10869 = i_40_ * -344136887;
								anInt601 = 1094573792;
							} else if (2 == i_40_) {
								if (aBool620) {
									aBool620 = false;
									anInt601 = -1901992645;
									break;
								}
								if (1566115167 * anInt567 == 267) {
									Class423.clientConfigsDomain.method14395(34186);
									anInt601 = 637374720;
								} else
									anInt601 = 569808852;
							} else if (15 == i_40_) {
								aClass116_568.anInt1421 = 1993757502;
								anInt601 = 2037124381;
							} else {
								if (23 == i_40_ && -312035097 * anInt575 < 3) {
									anInt607 = 0;
									anInt575 += -372581673;
									anInt601 = -1901992645;
									aClass116_568.method1980((short) -2678);
									break;
								}
								if (42 == i_40_) {
									anInt601 = 1563033842;
									Class645.method10563(i_40_, -167661133);
									break;
								}
								if (142 == anInt567 * 1566115167 && i_40_ == 49 && 4 != -2020118759 * client.anInt11136) {
									if (anInt609 * -1471454747 != 52)
										Class645.method10563(i_40_, 1889658161);
									break;
								}
								if (aBool579 && !aBool574 && -1 != anInt572 * 426956199 && i_40_ == 35) {
									aBool574 = true;
									anInt607 = 0;
									anInt601 = -1901992645;
									aClass116_568.method1980((short) -15536);
									break;
								}
								if (53 == i_40_)
									anInt601 = -801788364;
								else {
									anInt601 = -953811567;
									Class645.method10563(i_40_, -813132838);
									aClass116_568.method1980((short) -32126);
									Compression.method7275((byte) 0);
									break;
								}
							}
						}
					}
					if (124 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(1, 1243203557)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 29430);
							int i_41_ = ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							anInt614 = -1962324270 * i_41_;
							anInt601 = -953811567;
							Class645.method10563(21, 2104992644);
							aClass116_568.method1980((short) -9007);
							Compression.method7275((byte) 0);
						}
					} else if (anInt601 * -1905499279 == 210) {
						if (aClass116_568.getCurrentStream(782493095).method9199(2, 1975901265)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 5416);
							anInt617 = ((((aClass116_568.updateBuffer.buffer[0]) & 0xff) << 8) + ((aClass116_568.updateBuffer.buffer[1]) & 0xff)) * 1390260393;
							anInt601 = -417785649;
						}
					} else if (-1905499279 * anInt601 == 244) {
						if (aClass116_568.getCurrentStream(782493095).method9199(4, 478661921)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 4, (short) 32705);
							anInt619 = aClass116_568.updateBuffer.readUnsignedInt((byte) -45) * 284188369;
							aClass116_568.updateBuffer.offset = 0;
							anInt601 = -953811567;
							Class645.method10563(53, 1639419167);
							aClass116_568.method1980((short) -19907);
							Compression.method7275((byte) 0);
						}
					} else if (198 == -1905499279 * anInt601) {
						if (29 == Class687_Sub20.anInt10869 * 1969323769) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1071640761))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 13200);
							anInt616 = -234297499 * ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
						} else if (1969323769 * Class687_Sub20.anInt10869 == 45) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(3, 1329031602))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 3, (short) 20619);
							anInt616 = ((aClass116_568.updateBuffer.buffer[0]) & 0xff) * -234297499;
							anInt578 = (((aClass116_568.updateBuffer.buffer[2]) & 0xff) + (((aClass116_568.updateBuffer.buffer[1]) & 0xff) << 8)) * -1142124537;
						} else
							throw new IllegalStateException();
						anInt601 = -953811567;
						Class645.method10563((1969323769 * Class687_Sub20.anInt10869), -591400331);
						aClass116_568.method1980((short) -2733);
						Compression.method7275((byte) 0);
						if (Class691.method13965((-2020118759 * client.anInt11136), (byte) -77)) {
							Class669.method13691(true, -1838550041);
							anInt610 = -622674299 * Class687_Sub20.anInt10869;
						}
					} else if (224 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(2, 1412029803)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 26941);
							aClass116_568.updateBuffer.offset = 0;
							Class674.anInt8628 = aClass116_568.updateBuffer.readUnsignedShort(-758914243) * 1175030903;
							aClass116_568.updateBuffer.offset = 0;
							anInt601 = -1287139881;
						}
					} else if (231 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(1216875847 * Class674.anInt8628, 1261412484)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1216875847 * Class674.anInt8628, (short) 27666);
							aClass116_568.updateBuffer.offset = 0;
							byte[] is = (new byte[1 + Class674.anInt8628 * 1216875847]);
							aClass116_568.updateBuffer.method18222(is, 0, 1216875847 * Class674.anInt8628, (byte) 112);
							aClass116_568.updateBuffer.offset = 0;
							RSBuffer class523_sub34 = new RSBuffer(is);
							String string = class523_sub34.readString(-16223037);
							Class331.method5825(string, true, client.aBool10996, 2036475375);
							Class645.method10563((1969323769 * Class687_Sub20.anInt10869), 610722412);
							if (1566115167 * anInt567 == 142 && client.anInt11136 * -2020118759 != 4)
								anInt601 = -417785649;
							else {
								anInt601 = -953811567;
								aClass116_568.method1980((short) -10679);
								Compression.method7275((byte) 0);
							}
						}
					} else {
						if (256 == -1905499279 * anInt601) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(2, 1144400554))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 15929);
							aClass116_568.updateBuffer.offset = 0;
							aClass116_568.anInt1421 = aClass116_568.updateBuffer.readUnsignedShort(-425123280) * 1150604897;
							anInt601 = 643005209;
						}
						if (265 == anInt601 * -1905499279) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * aClass116_568.anInt1421, 1119120886))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, -1372959327 * aClass116_568.anInt1421, (short) 6845);
							aClass116_568.updateBuffer.offset = 0;
							boolean bool = (aClass116_568.updateBuffer.readUnsignedByte(-188183302) == 1);
							while (2349011 * (aClass116_568.updateBuffer.offset) < aClass116_568.anInt1421 * -1372959327) {
								Class426 class426 = (Class114.aClass98_Sub1_Sub2_1405.refreshNIS((aClass116_568.updateBuffer), -470195162));
								Class423.clientConfigsDomain.anInterface2_1714.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1752237972);
							}
							if (bool) {
								Class523_Sub22 class523_sub22 = Class493.method8087(-1072245741);
								RSBitBuffer class523_sub34_sub2 = (class523_sub22.aClass523_Sub34_Sub2_10525);
								class523_sub34_sub2.writeByte((1752807475 * Class406.aClass406_4185.anInt4190), -725245919);
								aClass116_568.method1974(class523_sub22, (byte) 38);
								aClass116_568.method1973(1512049308);
								anInt601 = 84457335;
							} else
								anInt601 = 637374720;
						}
						if (-1905499279 * anInt601 == 135) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 2127433428))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 13550);
							int i_42_ = ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							if (2 != i_42_) {
								if (29 == i_42_ || 45 == i_42_) {
									Class687_Sub20.anInt10869 = -344136887 * i_42_;
									anInt601 = 123870758;
								} else {
									anInt601 = -953811567;
									Class645.method10563(i_42_, 211694293);
									aClass116_568.method1980((short) -9182);
									Compression.method7275((byte) 0);
									if (Class691.method13965((-2020118759 * (client.anInt11136)), (byte) -40)) {
										Class669.method13691(true, -1838550041);
										anInt610 = -654032147 * i_42_;
									}
									break;
								}
								break;
							}
							anInt601 = 569808852;
						}
						if (anInt601 * -1905499279 == 148) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1844779506))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 21906);
							Class548.anInt7321 = 811531845 * ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							anInt601 = -1811904821;
						}
						if (anInt601 * -1905499279 == 155) {
							RSBitBuffer class523_sub34_sub2 = aClass116_568.updateBuffer;
							if (267 == 1566115167 * anInt567) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(Class548.anInt7321 * -31497075, 724816736))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, Class548.anInt7321 * -31497075, (short) 11622);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(1968836304) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(-645789072) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(-217964759) == 1;
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(1525965742) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(-1239153142) == 1;
								client.aBool11164 = class523_sub34_sub2.readUnsignedByte(-1529481486) == 1;
								client.anInt11154 = (class523_sub34_sub2.readUnsignedShort(-1333563461) * -435708883);
								client.aBool11156 = class523_sub34_sub2.readUnsignedByte(1064882107) == 1;
								Class303.anInt3343 = (class523_sub34_sub2.method16286(1131407056) * 1728814959);
								client.aBool11157 = class523_sub34_sub2.readUnsignedByte(1844807421) == 1;
								Class289.aString3120 = class523_sub34_sub2.readString(-1107207073);
								Class159_Sub1.aLong8869 = ((class523_sub34_sub2.method16291((short) 607) - TimeUtils.getCurrentTimeMilliseconds(1516375036)) * 1944424440918290845L);
								client.aClass505_11019.method8244(1503839940).method17222(client.aBool11157, (byte) 113);
								Class329_Sub2.aClass511_10050.method8540(-117697909).method8244(876418900).method17222(client.aBool11157, (byte) 123);
								Class523_Sub37.aClass53_Sub8_10677.method17183(client.aBool11157, 35649444);
								Class174.aClass53_Sub7_1856.method17174(client.aBool11157, (byte) 127);
							} else {
								if (!aClass116_568.getCurrentStream(782493095).method9199(-31497075 * Class548.anInt7321, 505284237))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, -31497075 * Class548.anInt7321, (short) 15388);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(1183315214) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(-789979544) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(-200116430) == 1;
								Class303.anInt3343 = (class523_sub34_sub2.method16286(2018423803) * 1728814959);
								Class241.player.aByte12182 = (byte) class523_sub34_sub2.readUnsignedByte(521557998);
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(-96343931) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(810392512) == 1;
								Class461.aLong5121 = (class523_sub34_sub2.readLong((byte) -123) * 7102560564029533211L);
								Class159_Sub1.aLong8869 = (((2688366688243830291L * Class461.aLong5121) - TimeUtils.getCurrentTimeMilliseconds(1516375036) - class523_sub34_sub2.method16289((byte) -1)) * 1944424440918290845L);
								int i_43_ = class523_sub34_sub2.readUnsignedByte(-674418081);
								client.aBool11156 = 0 != (i_43_ & 0x1);
								Class411.aBool4540 = 0 != (i_43_ & 0x2);
								Compression.anInt4955 = class523_sub34_sub2.readUnsignedInt((byte) -65) * 242962777;
								Class431.anInt4861 = class523_sub34_sub2.readUnsignedInt((byte) -23) * -17008787;
								Class375_Sub1.anInt10163 = (class523_sub34_sub2.readUnsignedShort(-1044123141) * 2113837661);
								Class188.anInt2133 = (class523_sub34_sub2.readUnsignedShort(-504959456) * -898335641);
								Class491.anInt5537 = (class523_sub34_sub2.readUnsignedShort(-993678575) * -383547655);
								Class324.anInt3454 = class523_sub34_sub2.readUnsignedInt((byte) -33) * -82489775;
								Class454.aClass63_4979 = new Class63(134134449 * Class324.anInt3454);
								new Thread(Class454.aClass63_4979).start();
								client.anInt11162 = (class523_sub34_sub2.readUnsignedByte(-895426090) * -888766121);
								Class76.anInt853 = class523_sub34_sub2.readUnsignedShort(-400611737) * 459393563;
								Class227.anInt2346 = (class523_sub34_sub2.readUnsignedShort(-281583106) * 2020015531);
								Class692.aBool8741 = class523_sub34_sub2.readUnsignedByte(-1567496214) == 1;
								Class241.player.username = Class241.player.displayName = RuntimeException_Sub4.aString12099 = class523_sub34_sub2.readVersionedString(2129244272);
								Class190.anInt2154 = (class523_sub34_sub2.readUnsignedByte(108988731) * -1376256479);
								Class297_Sub1.anInt10002 = (class523_sub34_sub2.readUnsignedInt((byte) -80) * -1095634933);
								Class6.aClass1_40 = new RSSocket();
								Class6.aClass1_40.anInt10 = (class523_sub34_sub2.readUnsignedShort(-1828946416) * 1274525161);
								if (65535 == -1126141351 * Class6.aClass1_40.anInt10)
									Class6.aClass1_40.anInt10 = -1274525161;
								Class6.aClass1_40.aString9 = class523_sub34_sub2.readVersionedString(2071852569);
								Class6.aClass1_40.anInt11 = (class523_sub34_sub2.readUnsignedShort(-1809137930) * 1509090121);
								Class6.aClass1_40.anInt12 = class523_sub34_sub2.readUnsignedShort(-29516636) * 19836347;
								if ((Class674.aClass674_8617 != Class80.aClass674_865) && ((Class674.aClass674_8615 != Class80.aClass674_865) || -1746920271 * client.rights < 2) && (Class155.aClass1_1735.method505(Class648.aClass1_8378, (short) 23109)))
									Class212.method3830(1497269989);
							}
							if (client.aBool11224) {
								try {
									Class35.method952(Class305.anApplet3346, "zap", (byte) -24);
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
									Class35.method952(Class305.anApplet3346, "unzap", (byte) -58);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class80.aClass674_865 == Class674.aClass674_8613)
								Class402.aClass402_4158.method6573((byte) -98);
							if (267 == 1566115167 * anInt567)
								anInt601 = 2020232914;
							else {
								anInt601 = -953811567;
								Class645.method10563(2, 181369840);
								Class242.method4371((byte) 42);
								Class657.method10791(0, (byte) -31);
								aClass116_568.currentPacket = null;
								break;
							}
						}
						if (178 == anInt601 * -1905499279) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(3, 1179912678))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 3, (short) 6775);
							anInt601 = 1072051836;
						}
						if (188 == anInt601 * -1905499279) {
							RSBitBuffer class523_sub34_sub2 = aClass116_568.updateBuffer;
							class523_sub34_sub2.offset = 0;
							if (class523_sub34_sub2.method18225(1222468054)) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(1, 659679976))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 3, 1, (short) 8410);
							}
							aClass116_568.currentPacket = (Class189.method3601(2146909922)[class523_sub34_sub2.method18221((byte) 84)]);
							aClass116_568.anInt1421 = (class523_sub34_sub2.readUnsignedShort(-701577790) * 1150604897);
							anInt601 = 1534881397;
						}
						if (165 == anInt601 * -1905499279) {
							if (aClass116_568.getCurrentStream(782493095).method9199(aClass116_568.anInt1421 * -1372959327, 1037911698)) {
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, aClass116_568.anInt1421 * -1372959327, (short) 16483);
								aClass116_568.updateBuffer.offset = 0;
								int i_44_ = -1372959327 * aClass116_568.anInt1421;
								anInt601 = -953811567;
								Class645.method10563(2, -1441173820);
								Class221.method4137(1731470037);
								Class691.method13963(aClass116_568.updateBuffer, 702742205);
								int i_45_ = i_44_ - (aClass116_568.updateBuffer.offset) * 2349011;
								RSBitBuffer class523_sub34_sub2 = new RSBitBuffer(i_45_);
								System.arraycopy((aClass116_568.updateBuffer.buffer), (2349011 * (aClass116_568.updateBuffer.offset)), (class523_sub34_sub2.buffer), 0, i_45_);
								aClass116_568.updateBuffer.offset += 189765723 * i_45_;
								if (IncomingPacket.DYNAMIC_REGION_PACKET == aClass116_568.currentPacket)
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5571, class523_sub34_sub2), 1235970069);
								else
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5575, class523_sub34_sub2), 1235970069);
								if (2349011 * (aClass116_568.updateBuffer.offset) != i_44_)
									throw new RuntimeException(new StringBuilder().append((aClass116_568.updateBuffer.offset) * 2349011).append(" ").append(i_44_).toString());
								aClass116_568.currentPacket = null;
							}
						} else {
							if (205 != anInt601 * -1905499279)
								break;
							if (-1372959327 * aClass116_568.anInt1421 == -2) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(2, 1892162912))
									break;
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 9472);
								aClass116_568.updateBuffer.offset = 0;
								aClass116_568.anInt1421 = (aClass116_568.updateBuffer.readUnsignedShort(-335815830) * 1150604897);
							}
							if (aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * aClass116_568.anInt1421, 1838616598)) {
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, aClass116_568.anInt1421 * -1372959327, (short) 21984);
								aClass116_568.updateBuffer.offset = 0;
								int i_46_ = -1372959327 * aClass116_568.anInt1421;
								anInt601 = -953811567;
								Class645.method10563(15, 956806254);
								Class241.method4363(2111717573);
								Class691.method13963(aClass116_568.updateBuffer, 702742205);
								if (i_46_ != 2349011 * (aClass116_568.updateBuffer.offset))
									throw new RuntimeException(new StringBuilder().append(2349011 * (aClass116_568.updateBuffer.offset)).append(" ").append(i_46_).toString());
								aClass116_568.currentPacket = null;
							}
						}
					}
				} catch (IOException ioexception) {
					aClass116_568.method1980((short) -243);
					if (-312035097 * anInt575 < 3) {
						if (anInt567 * 1566115167 == 267)
							Class155.aClass1_1735.method497((byte) -31);
						else
							Class6.aClass1_42.method497((byte) -113);
						anInt607 = 0;
						anInt575 += -372581673;
						anInt601 = -1901992645;
					} else {
						anInt601 = -953811567;
						Class645.method10563(-4, -1083801219);
						Compression.method7275((byte) 0);
					}
					break;
				}
				break;
			} while (false);
		}
	}

	static final void method1182() {
		if (-1905499279 * anInt601 != 1 && 102 != -1905499279 * anInt601) {
			do {
				try {
					int i;
					if (anInt575 * -312035097 == 0 && -1905499279 * anInt601 < 95)
						i = 500;
					else
						i = 2000;
					if (aBool574 && -1905499279 * anInt601 >= 66)
						i = 6000;
					if ((267 == anInt567 * 1566115167 && 210 != anInt601 * -1905499279 && 42 != anInt610 * 404908773) || (142 == 1566115167 * anInt567 && 49 != anInt609 * -1471454747 && -1471454747 * anInt609 != 52))
						anInt607 += 477607871;
					if (128464959 * anInt607 > i) {
						aClass116_568.method1980((short) -16308);
						if (-312035097 * anInt575 < 3) {
							if (267 == 1566115167 * anInt567)
								Class155.aClass1_1735.method497((byte) -40);
							else
								Class6.aClass1_42.method497((byte) -120);
							anInt607 = 0;
							anInt575 += -372581673;
							anInt601 = -1901992645;
						} else {
							anInt601 = -953811567;
							Class645.method10563(-5, 1717400228);
							Compression.method7275((byte) 0);
							break;
						}
					}
					if (-1905499279 * anInt601 == 11) {
						if (267 == anInt567 * 1566115167)
							aClass116_568.method1976(Class191.method3627((Class155.aClass1_1735.method502(-2129141329)), 40000, (byte) 0), Class155.aClass1_1735.aString9, -550884023);
						else
							aClass116_568.method1976((Class191.method3627(Class6.aClass1_42.method502(-2147145197), 40000, (byte) 0)), Class6.aClass1_42.aString9, 1101445210);
						aClass116_568.method1998(1734783822);
						Class523_Sub22 class523_sub22 = Class493.method8087(1394128329);
						if (aBool574) {
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4196.anInt4190), 1357302820);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -76);
							int i_47_ = ((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(876, -874091969);
							class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(1, -892303179);
							if (1566115167 * anInt567 == 267)
								class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((client.anInt11136 * -2020118759 == 17 ? 1 : 0), -1630993152);
							RSBuffer class523_sub34 = Class608.method9988((byte) 0);
							Class263.method4739(class523_sub34, (long) (anInt572 * 426956199));
							Class176.aLong1857 = (long) anInt572 * -2373984093781879965L;
							class523_sub34.writeByte(anInt572 * 426956199, -1266040799);
							class523_sub34.writeByte(Class53_Sub20.aClass668_10979.method82(), 529661664);
							class523_sub34.writeInt((client.anInt10984 * 1778108951), -1110108269);
							for (int i_48_ = 0; i_48_ < 5; i_48_++)
								class523_sub34.writeInt((int) (Math.random() * 9.9999999E7), -976344724);
							class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
							class523_sub34.writeByte((1884825957 * (client.aClass681_11284.anInt8648)), 1205631369);
							class523_sub34.writeByte((int) (Math.random() * 9.9999999E7), 588479264);
							class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
							class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -8557);
							class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.offset) * 2349011 - i_47_, 1699025767);
						} else
							class523_sub22.aClass523_Sub34_Sub2_10525.writeByte((1752807475 * Class406.aClass406_4184.anInt4190), -757741870);
						aClass116_568.method1974(class523_sub22, (byte) 16);
						aClass116_568.method1973(1512049308);
						anInt601 = -457199072;
					}
					if (32 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 955983664))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 18903);
						aClass116_568.updateBuffer.offset = 0;
						int i_49_ = aClass116_568.updateBuffer.readUnsignedByte(-197661696);
						if (0 != i_49_) {
							anInt601 = -953811567;
							Class17.method778(i_49_, 2032708296);
							Class645.method10563(i_49_, -429236989);
							aClass116_568.method1980((short) -19866);
							Compression.method7275((byte) 0);
							break;
						}
						aClass116_568.updateBuffer.offset = 0;
						if (aBool574)
							anInt601 = 502242984;
						else
							anInt601 = 1004485968;
					}
					if (40 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(2, 591699348))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 13020);
						aClass116_568.updateBuffer.offset = 0;
						aClass116_568.updateBuffer.offset = aClass116_568.updateBuffer.readUnsignedShort(-1851511028) * 189765723;
						anInt601 = -920028633;
					}
					if (anInt601 * -1905499279 == 55) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(2349011 * (aClass116_568.updateBuffer.offset), 1872353980))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2349011 * (aClass116_568.updateBuffer.offset), (short) 19972);
						aClass116_568.updateBuffer.method16308(anIntArray569, (byte) -116);
						aClass116_568.updateBuffer.offset = 0;
						String string = aClass116_568.updateBuffer.readVersionedString(2104630399);
						aClass116_568.updateBuffer.offset = 0;
						String string_50_ = Class402.aClass402_4165.method6574(1621057790);
						Class388.method6470(string, true, string_50_, client.aBool10996, -494472837);
						anInt601 = 1472946018;
					}
					if (66 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1261117846))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 20655);
						if (1 == ((aClass116_568.updateBuffer.buffer[0]) & 0xff))
							anInt601 = -908767655;
					}
					if (-1905499279 * anInt601 == 73) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(16, 2108507968))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 16, (short) 16813);
						aClass116_568.updateBuffer.offset = -1258715728;
						aClass116_568.updateBuffer.method16308(anIntArray569, (byte) -25);
						aClass116_568.updateBuffer.offset = 0;
						aLong573 = (aClass116_568.updateBuffer.readLong((byte) -79) * 9083684963104943157L);
						aLong577 = (aClass116_568.updateBuffer.readLong((byte) -102) * 8201862548359724895L);
						anInt601 = 1004485968;
					}
					if (-1905499279 * anInt601 == 80) {
						aClass116_568.updateBuffer.offset = 0;
						aClass116_568.method1998(1312536176);
						Class523_Sub22 class523_sub22 = Class493.method8087(-223531767);
						RSBitBuffer class523_sub34_sub2 = class523_sub22.aClass523_Sub34_Sub2_10525;
						if (1566115167 * anInt567 == 267) {
							Class406 class406;
							if (aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4186;
							class523_sub34_sub2.writeByte((class406.anInt4190 * 1752807475), 702470558);
							class523_sub34_sub2.writeShort(0, (byte) -100);
							int i_51_ = class523_sub34_sub2.offset * 2349011;
							int i_52_ = 2349011 * class523_sub34_sub2.offset;
							if (!aBool574) {
								class523_sub34_sub2.writeInt(876, -2018017732);
								class523_sub34_sub2.writeInt(1, -721835265);
								class523_sub34_sub2.writeByte((-2020118759 * client.anInt11136 == 17 ? 1 : 0), 797617129);
								i_52_ = 2349011 * class523_sub34_sub2.offset;
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -10336);
								i_52_ = 2349011 * class523_sub34_sub2.offset;
								class523_sub34_sub2.writeByte((-1L == -529544860571826659L * aLong573 ? 1 : 0), -815804526);
								if (aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(aString603, (byte) 11);
								else
									class523_sub34_sub2.method16441(aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(Class316.method5685(1694113628), 1481812020);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -31);
							class523_sub34_sub2.writeShort((Class254.anInt2742 * -495986435), (byte) -42);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -85), -2022063076);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) -72);
							class523_sub34_sub2.writeInt((1778108951 * (client.anInt10984)), -1262030368);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 26650);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), 1223708080);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -821);
							client.aBool11012 = true;
							RSBuffer class523_sub34_53_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(561095566)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_53_, 1659522655);
							class523_sub34_sub2.readBytes(class523_sub34_53_.buffer, 0, class523_sub34_53_.buffer.length, (short) -15345);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -1505378241);
							class523_sub34_sub2.writeInt((client.anInt10988 * 503698129), -1121625850);
							class523_sub34_sub2.writeInt((742099907 * (client.anInt10987)), -917468121);
							class523_sub34_sub2.writeInt((-1652858555 * (client.anInt10990)), -1133511099);
							class523_sub34_sub2.writeInt((client.anInt11192 * -1046646323), -698656983);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) -32);
							class523_sub34_sub2.writeByte(((client.aString11112) == null) ? 0 : 1, 1947493845);
							if (null != client.aString11112)
								class523_sub34_sub2.method16270(client.aString11112, (byte) -57);
							class523_sub34_sub2.writeByte((client.aBool11185 ? 1 : 0), 1762801913);
							class523_sub34_sub2.writeByte((client.aBool11142 ? 1 : 0), 1672612193);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, -1917748643);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -1418228801);
							class523_sub34_sub2.method16270(client.aString11001, (byte) -66);
							class523_sub34_sub2.writeByte((null == Class6.aClass1_40 || (Class6.aClass1_40.anInt10 * -1126141351 != (Class155.aClass1_1735.anInt10 * -1126141351))) ? 1 : 0, -1220321028);
							class523_sub34_sub2.writeShort((-1126141351 * (Class6.aClass1_42.anInt10)), (byte) -6);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(anIntArray569, i_52_, 2349011 * class523_sub34_sub2.offset, (byte) 40);
							class523_sub34_sub2.method16275((2349011 * class523_sub34_sub2.offset - i_51_), -804812739);
						} else {
							Class406 class406;
							if (aBool574)
								class406 = Class406.aClass406_4193;
							else
								class406 = Class406.aClass406_4187;
							class523_sub34_sub2.writeByte((1752807475 * (class406.anInt4190)), -1743552536);
							class523_sub34_sub2.writeShort(0, (byte) -65);
							int i_54_ = 2349011 * class523_sub34_sub2.offset;
							int i_55_ = class523_sub34_sub2.offset * 2349011;
							if (!aBool574) {
								class523_sub34_sub2.writeInt(876, -660665982);
								class523_sub34_sub2.writeInt(1, -1477487127);
								RSBuffer class523_sub34 = Class26_Sub1.method16508(23877014);
								class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, (short) -10458);
								i_55_ = class523_sub34_sub2.offset * 2349011;
								class523_sub34_sub2.writeByte((-529544860571826659L * aLong573 == -1L ? 1 : 0), -1290461945);
								if (aLong573 * -529544860571826659L == -1L)
									class523_sub34_sub2.method16270(aString603, (byte) 10);
								else
									class523_sub34_sub2.method16441(aLong573 * -529544860571826659L);
							}
							class523_sub34_sub2.writeByte(1884825957 * client.aClass681_11284.anInt8648, 1703317626);
							class523_sub34_sub2.writeByte(Class53_Sub20.aClass668_10979.method82(), -1779628636);
							class523_sub34_sub2.writeByte(Class316.method5685(-2115947830), 1129375699);
							class523_sub34_sub2.writeShort((2141365743 * (Class170.anInt1833)), (byte) -60);
							class523_sub34_sub2.writeShort((-495986435 * (Class254.anInt2742)), (byte) -71);
							class523_sub34_sub2.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -15), 1127554358);
							Class289.method5204(class523_sub34_sub2, -276541507);
							class523_sub34_sub2.method16270(client.aString10983, (byte) -40);
							RSBuffer class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 3809);
							class523_sub34_sub2.writeByte(((class523_sub34.offset) * 2349011), -1615101019);
							class523_sub34_sub2.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -20793);
							RSBuffer class523_sub34_56_ = (new RSBuffer(Class218.aClass523_Sub41_2319.method16570(-2115337926)));
							Class218.aClass523_Sub41_2319.method16565(class523_sub34_56_, 775903371);
							class523_sub34_sub2.readBytes(class523_sub34_56_.buffer, 0, class523_sub34_56_.buffer.length, (short) -5099);
							class523_sub34_sub2.writeInt((1369210245 * (client.anInt11060)), -1810416850);
							class523_sub34_sub2.method16270((Class312_Sub2_Sub1.aString11593), (byte) 25);
							class523_sub34_sub2.writeInt((client.anInt10984 * 1778108951), -1950396590);
							class523_sub34_sub2.writeInt((793658911 * (client.anInt11081)), -1498630492);
							class523_sub34_sub2.method16270(client.aString11001, (byte) -3);
							class523_sub34_sub2.writeByte(Class194_Sub14.anInt9931 * 1106916417 & 0x1, 1919704063);
							Class236.method4292(class523_sub34_sub2, 848435968);
							class523_sub34_sub2.method16263(anIntArray569, i_55_, class523_sub34_sub2.offset * 2349011, (byte) 41);
							class523_sub34_sub2.method16275((class523_sub34_sub2.offset * 2349011 - i_54_), 88115640);
						}
						aClass116_568.method1974(class523_sub22, (byte) 122);
						aClass116_568.method1973(1512049308);
						aClass116_568.aClass11_1413 = new Class11(anIntArray569);
						for (int i_57_ = 0; i_57_ < 4; i_57_++)
							anIntArray569[i_57_] += 50;
						aClass116_568.aClass11_1420 = new Class11(anIntArray569);
						new Class11(anIntArray569);
						aClass116_568.updateBuffer.method18218(aClass116_568.aClass11_1420, -374163008);
						anIntArray569 = null;
						anInt601 = -417785649;
					}
					if (95 == anInt601 * -1905499279) {
						if (!aClass116_568.getCurrentStream(782493095).method9199(1, 2046049747))
							break;
						aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 9133);
						int i_58_ = aClass116_568.updateBuffer.readUnsignedByte(-1997028706);
						aClass116_568.updateBuffer.offset = 0;
						if (21 == i_58_)
							anInt601 = 1986449980;
						else {
							if (1 == i_58_) {
								anInt601 = 1495467974;
								Class645.method10563(i_58_, -280809746);
								break;
							}
							if (52 == i_58_) {
								Class687_Sub20.anInt10869 = i_58_ * -344136887;
								anInt601 = 1094573792;
							} else if (2 == i_58_) {
								if (aBool620) {
									aBool620 = false;
									anInt601 = -1901992645;
									break;
								}
								if (1566115167 * anInt567 == 267) {
									Class423.clientConfigsDomain.method14395(34186);
									anInt601 = 637374720;
								} else
									anInt601 = 569808852;
							} else if (15 == i_58_) {
								aClass116_568.anInt1421 = 1993757502;
								anInt601 = 2037124381;
							} else {
								if (23 == i_58_ && -312035097 * anInt575 < 3) {
									anInt607 = 0;
									anInt575 += -372581673;
									anInt601 = -1901992645;
									aClass116_568.method1980((short) -9159);
									break;
								}
								if (42 == i_58_) {
									anInt601 = 1563033842;
									Class645.method10563(i_58_, 357178425);
									break;
								}
								if (142 == anInt567 * 1566115167 && i_58_ == 49 && 4 != -2020118759 * client.anInt11136) {
									if (anInt609 * -1471454747 != 52)
										Class645.method10563(i_58_, 1447527860);
									break;
								}
								if (aBool579 && !aBool574 && -1 != anInt572 * 426956199 && i_58_ == 35) {
									aBool574 = true;
									anInt607 = 0;
									anInt601 = -1901992645;
									aClass116_568.method1980((short) -29836);
									break;
								}
								if (53 == i_58_)
									anInt601 = -801788364;
								else {
									anInt601 = -953811567;
									Class645.method10563(i_58_, 1577840934);
									aClass116_568.method1980((short) -1731);
									Compression.method7275((byte) 0);
									break;
								}
							}
						}
					}
					if (124 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(1, 1670494122)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 21258);
							int i_59_ = ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							anInt614 = -1962324270 * i_59_;
							anInt601 = -953811567;
							Class645.method10563(21, 1522452099);
							aClass116_568.method1980((short) -23049);
							Compression.method7275((byte) 0);
						}
					} else if (anInt601 * -1905499279 == 210) {
						if (aClass116_568.getCurrentStream(782493095).method9199(2, 915225613)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 16848);
							anInt617 = ((((aClass116_568.updateBuffer.buffer[0]) & 0xff) << 8) + ((aClass116_568.updateBuffer.buffer[1]) & 0xff)) * 1390260393;
							anInt601 = -417785649;
						}
					} else if (-1905499279 * anInt601 == 244) {
						if (aClass116_568.getCurrentStream(782493095).method9199(4, 1390694582)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 4, (short) 32748);
							anInt619 = aClass116_568.updateBuffer.readUnsignedInt((byte) -123) * 284188369;
							aClass116_568.updateBuffer.offset = 0;
							anInt601 = -953811567;
							Class645.method10563(53, 37615478);
							aClass116_568.method1980((short) -15765);
							Compression.method7275((byte) 0);
						}
					} else if (198 == -1905499279 * anInt601) {
						if (29 == Class687_Sub20.anInt10869 * 1969323769) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 784158701))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 18301);
							anInt616 = -234297499 * ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
						} else if (1969323769 * Class687_Sub20.anInt10869 == 45) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(3, 2114840264))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 3, (short) 28773);
							anInt616 = ((aClass116_568.updateBuffer.buffer[0]) & 0xff) * -234297499;
							anInt578 = (((aClass116_568.updateBuffer.buffer[2]) & 0xff) + (((aClass116_568.updateBuffer.buffer[1]) & 0xff) << 8)) * -1142124537;
						} else
							throw new IllegalStateException();
						anInt601 = -953811567;
						Class645.method10563((1969323769 * Class687_Sub20.anInt10869), 1343556444);
						aClass116_568.method1980((short) -18556);
						Compression.method7275((byte) 0);
						if (Class691.method13965((-2020118759 * client.anInt11136), (byte) -68)) {
							Class669.method13691(true, -1838550041);
							anInt610 = -622674299 * Class687_Sub20.anInt10869;
						}
					} else if (224 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(2, 1354180094)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 14436);
							aClass116_568.updateBuffer.offset = 0;
							Class674.anInt8628 = aClass116_568.updateBuffer.readUnsignedShort(-927524053) * 1175030903;
							aClass116_568.updateBuffer.offset = 0;
							anInt601 = -1287139881;
						}
					} else if (231 == -1905499279 * anInt601) {
						if (aClass116_568.getCurrentStream(782493095).method9199(1216875847 * Class674.anInt8628, 1110809956)) {
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1216875847 * Class674.anInt8628, (short) 12326);
							aClass116_568.updateBuffer.offset = 0;
							byte[] is = (new byte[1 + Class674.anInt8628 * 1216875847]);
							aClass116_568.updateBuffer.method18222(is, 0, 1216875847 * Class674.anInt8628, (byte) 107);
							aClass116_568.updateBuffer.offset = 0;
							RSBuffer class523_sub34 = new RSBuffer(is);
							String string = class523_sub34.readString(-855742219);
							Class331.method5825(string, true, client.aBool10996, -2070956261);
							Class645.method10563((1969323769 * Class687_Sub20.anInt10869), 519628500);
							if (1566115167 * anInt567 == 142 && client.anInt11136 * -2020118759 != 4)
								anInt601 = -417785649;
							else {
								anInt601 = -953811567;
								aClass116_568.method1980((short) -6651);
								Compression.method7275((byte) 0);
							}
						}
					} else {
						if (256 == -1905499279 * anInt601) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(2, 973251931))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 30166);
							aClass116_568.updateBuffer.offset = 0;
							aClass116_568.anInt1421 = aClass116_568.updateBuffer.readUnsignedShort(-1110005212) * 1150604897;
							anInt601 = 643005209;
						}
						if (265 == anInt601 * -1905499279) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * aClass116_568.anInt1421, 1018022100))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, -1372959327 * aClass116_568.anInt1421, (short) 22825);
							aClass116_568.updateBuffer.offset = 0;
							boolean bool = (aClass116_568.updateBuffer.readUnsignedByte(26758852) == 1);
							while (2349011 * (aClass116_568.updateBuffer.offset) < aClass116_568.anInt1421 * -1372959327) {
								Class426 class426 = (Class114.aClass98_Sub1_Sub2_1405.refreshNIS((aClass116_568.updateBuffer), -96125009));
								Class423.clientConfigsDomain.anInterface2_1714.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1235299639);
							}
							if (bool) {
								Class523_Sub22 class523_sub22 = Class493.method8087(1277795971);
								RSBitBuffer class523_sub34_sub2 = (class523_sub22.aClass523_Sub34_Sub2_10525);
								class523_sub34_sub2.writeByte((1752807475 * Class406.aClass406_4185.anInt4190), 2091037089);
								aClass116_568.method1974(class523_sub22, (byte) 72);
								aClass116_568.method1973(1512049308);
								anInt601 = 84457335;
							} else
								anInt601 = 637374720;
						}
						if (-1905499279 * anInt601 == 135) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1124878319))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 23919);
							int i_60_ = ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							if (2 != i_60_) {
								if (29 == i_60_ || 45 == i_60_) {
									Class687_Sub20.anInt10869 = -344136887 * i_60_;
									anInt601 = 123870758;
								} else {
									anInt601 = -953811567;
									Class645.method10563(i_60_, 1653099268);
									aClass116_568.method1980((short) -9276);
									Compression.method7275((byte) 0);
									if (Class691.method13965((-2020118759 * (client.anInt11136)), (byte) -21)) {
										Class669.method13691(true, -1838550041);
										anInt610 = -654032147 * i_60_;
									}
									break;
								}
								break;
							}
							anInt601 = 569808852;
						}
						if (anInt601 * -1905499279 == 148) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(1, 1172874765))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 1, (short) 11550);
							Class548.anInt7321 = 811531845 * ((aClass116_568.updateBuffer.buffer[0]) & 0xff);
							anInt601 = -1811904821;
						}
						if (anInt601 * -1905499279 == 155) {
							RSBitBuffer class523_sub34_sub2 = aClass116_568.updateBuffer;
							if (267 == 1566115167 * anInt567) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(Class548.anInt7321 * -31497075, 1986434524))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, Class548.anInt7321 * -31497075, (short) 16954);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = class523_sub34_sub2.readUnsignedByte(71670403) * -1076843439;
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(697904385) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(-26888840) == 1;
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(1570638274) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(1714762915) == 1;
								client.aBool11164 = class523_sub34_sub2.readUnsignedByte(-1740440355) == 1;
								client.anInt11154 = (class523_sub34_sub2.readUnsignedShort(-1364516683) * -435708883);
								client.aBool11156 = class523_sub34_sub2.readUnsignedByte(427180863) == 1;
								Class303.anInt3343 = class523_sub34_sub2.method16286(111501811) * 1728814959;
								client.aBool11157 = class523_sub34_sub2.readUnsignedByte(1314525894) == 1;
								Class289.aString3120 = class523_sub34_sub2.readString(-337445014);
								Class159_Sub1.aLong8869 = ((class523_sub34_sub2.method16291((short) 607) - TimeUtils.getCurrentTimeMilliseconds(1516375036)) * 1944424440918290845L);
								client.aClass505_11019.method8244(2118242585).method17222(client.aBool11157, (byte) 60);
								Class329_Sub2.aClass511_10050.method8540(1638787650).method8244(979484120).method17222(client.aBool11157, (byte) 104);
								Class523_Sub37.aClass53_Sub8_10677.method17183(client.aBool11157, 9727761);
								Class174.aClass53_Sub7_1856.method17174(client.aBool11157, (byte) 117);
							} else {
								if (!aClass116_568.getCurrentStream(782493095).method9199(-31497075 * Class548.anInt7321, 804857090))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 0, -31497075 * Class548.anInt7321, (short) 22009);
								class523_sub34_sub2.offset = 0;
								NPCDefinition.method5510(class523_sub34_sub2, 1912439293);
								client.rights = (class523_sub34_sub2.readUnsignedByte(1350206189) * -1076843439);
								client.anInt11256 = (class523_sub34_sub2.readUnsignedByte(504158557) * -1326815283);
								client.aBool11160 = class523_sub34_sub2.readUnsignedByte(-798626559) == 1;
								Class303.anInt3343 = (class523_sub34_sub2.method16286(1171505199) * 1728814959);
								Class241.player.aByte12182 = (byte) class523_sub34_sub2.readUnsignedByte(-954734143);
								client.aBool11161 = class523_sub34_sub2.readUnsignedByte(-50562857) == 1;
								client.aBool11224 = class523_sub34_sub2.readUnsignedByte(514015004) == 1;
								Class461.aLong5121 = (class523_sub34_sub2.readLong((byte) -50) * 7102560564029533211L);
								Class159_Sub1.aLong8869 = (((2688366688243830291L * Class461.aLong5121) - TimeUtils.getCurrentTimeMilliseconds(1516375036) - class523_sub34_sub2.method16289((byte) -1)) * 1944424440918290845L);
								int i_61_ = class523_sub34_sub2.readUnsignedByte(499242782);
								client.aBool11156 = 0 != (i_61_ & 0x1);
								Class411.aBool4540 = 0 != (i_61_ & 0x2);
								Compression.anInt4955 = class523_sub34_sub2.readUnsignedInt((byte) -42) * 242962777;
								Class431.anInt4861 = (class523_sub34_sub2.readUnsignedInt((byte) -103) * -17008787);
								Class375_Sub1.anInt10163 = (class523_sub34_sub2.readUnsignedShort(-1266021094) * 2113837661);
								Class188.anInt2133 = (class523_sub34_sub2.readUnsignedShort(-1067628032) * -898335641);
								Class491.anInt5537 = (class523_sub34_sub2.readUnsignedShort(-1790111486) * -383547655);
								Class324.anInt3454 = class523_sub34_sub2.readUnsignedInt((byte) -33) * -82489775;
								Class454.aClass63_4979 = new Class63(134134449 * Class324.anInt3454);
								new Thread(Class454.aClass63_4979).start();
								client.anInt11162 = class523_sub34_sub2.readUnsignedByte(613886581) * -888766121;
								Class76.anInt853 = class523_sub34_sub2.readUnsignedShort(-815842643) * 459393563;
								Class227.anInt2346 = (class523_sub34_sub2.readUnsignedShort(-899906508) * 2020015531);
								Class692.aBool8741 = class523_sub34_sub2.readUnsignedByte(492278314) == 1;
								Class241.player.username = Class241.player.displayName = RuntimeException_Sub4.aString12099 = class523_sub34_sub2.readVersionedString(2122657381);
								Class190.anInt2154 = (class523_sub34_sub2.readUnsignedByte(-1938115708) * -1376256479);
								Class297_Sub1.anInt10002 = (class523_sub34_sub2.readUnsignedInt((byte) -42) * -1095634933);
								Class6.aClass1_40 = new RSSocket();
								Class6.aClass1_40.anInt10 = (class523_sub34_sub2.readUnsignedShort(-1264439020) * 1274525161);
								if (65535 == -1126141351 * Class6.aClass1_40.anInt10)
									Class6.aClass1_40.anInt10 = -1274525161;
								Class6.aClass1_40.aString9 = class523_sub34_sub2.readVersionedString(2045224924);
								Class6.aClass1_40.anInt11 = (class523_sub34_sub2.readUnsignedShort(-2136112477) * 1509090121);
								Class6.aClass1_40.anInt12 = class523_sub34_sub2.readUnsignedShort(-648785569) * 19836347;
								if ((Class674.aClass674_8617 != Class80.aClass674_865) && ((Class674.aClass674_8615 != Class80.aClass674_865) || -1746920271 * client.rights < 2) && (Class155.aClass1_1735.method505(Class648.aClass1_8378, (short) 3862)))
									Class212.method3830(-153039877);
							}
							if (client.aBool11224) {
								try {
									Class35.method952(Class305.anApplet3346, "zap", (byte) -59);
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
									Class35.method952(Class305.anApplet3346, "unzap", (byte) -70);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class80.aClass674_865 == Class674.aClass674_8613)
								Class402.aClass402_4158.method6573((byte) -29);
							if (267 == 1566115167 * anInt567)
								anInt601 = 2020232914;
							else {
								anInt601 = -953811567;
								Class645.method10563(2, 1072215476);
								Class242.method4371((byte) 33);
								Class657.method10791(0, (byte) -62);
								aClass116_568.currentPacket = null;
								break;
							}
						}
						if (178 == anInt601 * -1905499279) {
							if (!aClass116_568.getCurrentStream(782493095).method9199(3, 1682930040))
								break;
							aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 3, (short) 17506);
							anInt601 = 1072051836;
						}
						if (188 == anInt601 * -1905499279) {
							RSBitBuffer class523_sub34_sub2 = aClass116_568.updateBuffer;
							class523_sub34_sub2.offset = 0;
							if (class523_sub34_sub2.method18225(2086235175)) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(1, 438880174))
									break;
								aClass116_568.getCurrentStream(782493095).read(class523_sub34_sub2.buffer, 3, 1, (short) 21665);
							}
							aClass116_568.currentPacket = (Class189.method3601(2146182758)[class523_sub34_sub2.method18221((byte) 73)]);
							aClass116_568.anInt1421 = (class523_sub34_sub2.readUnsignedShort(-381163349) * 1150604897);
							anInt601 = 1534881397;
						}
						if (165 == anInt601 * -1905499279) {
							if (aClass116_568.getCurrentStream(782493095).method9199(aClass116_568.anInt1421 * -1372959327, 886932540)) {
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, aClass116_568.anInt1421 * -1372959327, (short) 9071);
								aClass116_568.updateBuffer.offset = 0;
								int i_62_ = -1372959327 * aClass116_568.anInt1421;
								anInt601 = -953811567;
								Class645.method10563(2, -1978711976);
								Class221.method4137(1731470037);
								Class691.method13963(aClass116_568.updateBuffer, 702742205);
								int i_63_ = i_62_ - (aClass116_568.updateBuffer.offset) * 2349011;
								RSBitBuffer class523_sub34_sub2 = new RSBitBuffer(i_63_);
								System.arraycopy((aClass116_568.updateBuffer.buffer), (2349011 * (aClass116_568.updateBuffer.offset)), (class523_sub34_sub2.buffer), 0, i_63_);
								aClass116_568.updateBuffer.offset += 189765723 * i_63_;
								if (IncomingPacket.DYNAMIC_REGION_PACKET == aClass116_568.currentPacket)
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5571, class523_sub34_sub2), 1235970069);
								else
									client.aClass505_11019.method8368(new Class496(Class500.aClass500_5575, class523_sub34_sub2), 1235970069);
								if (2349011 * (aClass116_568.updateBuffer.offset) != i_62_)
									throw new RuntimeException(new StringBuilder().append((aClass116_568.updateBuffer.offset) * 2349011).append(" ").append(i_62_).toString());
								aClass116_568.currentPacket = null;
							}
						} else {
							if (205 != anInt601 * -1905499279)
								break;
							if (-1372959327 * aClass116_568.anInt1421 == -2) {
								if (!aClass116_568.getCurrentStream(782493095).method9199(2, 904291249))
									break;
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, 2, (short) 18782);
								aClass116_568.updateBuffer.offset = 0;
								aClass116_568.anInt1421 = (aClass116_568.updateBuffer.readUnsignedShort(-1128749696) * 1150604897);
							}
							if (aClass116_568.getCurrentStream(782493095).method9199(-1372959327 * aClass116_568.anInt1421, 1851818876)) {
								aClass116_568.getCurrentStream(782493095).read((aClass116_568.updateBuffer.buffer), 0, aClass116_568.anInt1421 * -1372959327, (short) 15150);
								aClass116_568.updateBuffer.offset = 0;
								int i_64_ = -1372959327 * aClass116_568.anInt1421;
								anInt601 = -953811567;
								Class645.method10563(15, 51026222);
								Class241.method4363(1941541926);
								Class691.method13963(aClass116_568.updateBuffer, 702742205);
								if (i_64_ != 2349011 * (aClass116_568.updateBuffer.offset))
									throw new RuntimeException(new StringBuilder().append(2349011 * (aClass116_568.updateBuffer.offset)).append(" ").append(i_64_).toString());
								aClass116_568.currentPacket = null;
							}
						}
					}
				} catch (IOException ioexception) {
					aClass116_568.method1980((short) -20096);
					if (-312035097 * anInt575 < 3) {
						if (anInt567 * 1566115167 == 267)
							Class155.aClass1_1735.method497((byte) -9);
						else
							Class6.aClass1_42.method497((byte) -41);
						anInt607 = 0;
						anInt575 += -372581673;
						anInt601 = -1901992645;
					} else {
						anInt601 = -953811567;
						Class645.method10563(-4, 1296397975);
						Compression.method7275((byte) 0);
					}
					break;
				}
				break;
			} while (false);
		}
	}

	static void method1183() {
		if (Class91.method1657(-2020118759 * client.anInt11136, (byte) 56)) {
			if (client.aClass116_11057.getCurrentStream(782493095) == null)
				Class657.method10791(1, (byte) -21);
			else
				Class657.method10791(0, (byte) -107);
		} else if (client.anInt11136 * -2020118759 == 1 || -2020118759 * client.anInt11136 == 3)
			Class657.method10791(16, (byte) -46);
		else if (4 == client.anInt11136 * -2020118759)
			Class657.method10791(16, (byte) -97);
	}

	static void method1184() {
		aClass116_568.method1998(1161796360);
		aClass116_568.updateBuffer.offset = 0;
		aClass116_568.currentPacket = null;
		aClass116_568.aClass409_1417 = null;
		aClass116_568.aClass409_1430 = null;
		aClass116_568.aClass409_1426 = null;
		aClass116_568.anInt1421 = 0;
		aClass116_568.anInt1423 = 0;
		client.anInt11063 = 0;
		QuickChatStringType.method10448((byte) -105);
		Class100.method1794(2119804713);
		for (int i = 0; i < 2048; i++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
		Class241.player = null;
		for (int i = 0; i < client.anInt11049 * -1359865227; i++) {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i].anObject10554);
			if (null != class647_sub1_sub3_sub1)
				class647_sub1_sub3_sub1.faceEntityId = 1843265241;
		}
		Class39.method1131((short) 29592);
		Class313.method5656(NetworkStream.method9224(1580162816), 743172261);
		Class657.method10791(9, (byte) -86);
		for (int i = 0; i < 106; i++)
			client.aBoolArray11246[i] = true;
		PacketsDecoder.method4264(aClass116_568, -1653494543);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
		Class286.method5152((byte) -60);
		Class423.clientConfigsDomain.method14383((byte) 0);
	}

	static void method1185(RSBitBuffer class523_sub34_sub2) {
		boolean bool = class523_sub34_sub2.readUnsignedByte(1295906278) == 1;
		if (bool) {
			boolean bool_65_ = false;
			int i = class523_sub34_sub2.method18220(-289255348) << 24;
			i |= class523_sub34_sub2.method18220(-1066025756) << 16;
			i |= class523_sub34_sub2.method18220(-1603242871) << 8;
			i |= class523_sub34_sub2.method18220(1071367175);
			Class220.aClass57_2331.method1366((Class176.aLong1857 * -4875073953973370387L), i, -929823142);
		}
	}

	static void method1186(int i) {
		/* empty */
	}

	static void method1187(int i) {
		if (anInt567 * 1566115167 == 142)
			anInt609 = i * 1451422701;
		else if (anInt567 * 1566115167 == 267)
			anInt610 = i * -654032147;
	}

	static RSBuffer method1188() {
		RSBuffer class523_sub34 = new RSBuffer(518);
		anIntArray569 = new int[4];
		anIntArray569[0] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[1] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[2] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[3] = (int) (Math.random() * 9.9999999E7);
		class523_sub34.writeByte(10, -1217819893);
		class523_sub34.writeInt(anIntArray569[0], -1462746856);
		class523_sub34.writeInt(anIntArray569[1], -644268825);
		class523_sub34.writeInt(anIntArray569[2], -1498447761);
		class523_sub34.writeInt(anIntArray569[3], -1354037526);
		return class523_sub34;
	}

	static RSBuffer method1189() {
		RSBuffer class523_sub34 = new RSBuffer(518);
		anIntArray569 = new int[4];
		anIntArray569[0] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[1] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[2] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[3] = (int) (Math.random() * 9.9999999E7);
		class523_sub34.writeByte(10, -1315990903);
		class523_sub34.writeInt(anIntArray569[0], -1582166474);
		class523_sub34.writeInt(anIntArray569[1], -1111893065);
		class523_sub34.writeInt(anIntArray569[2], -2105816733);
		class523_sub34.writeInt(anIntArray569[3], -1502030764);
		return class523_sub34;
	}

	static RSBuffer method1190() {
		RSBuffer class523_sub34 = new RSBuffer(518);
		anIntArray569 = new int[4];
		anIntArray569[0] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[1] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[2] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[3] = (int) (Math.random() * 9.9999999E7);
		class523_sub34.writeByte(10, -2117518624);
		class523_sub34.writeInt(anIntArray569[0], -1056377914);
		class523_sub34.writeInt(anIntArray569[1], -1082788020);
		class523_sub34.writeInt(anIntArray569[2], -1603186378);
		class523_sub34.writeInt(anIntArray569[3], -2052865897);
		return class523_sub34;
	}

	static RSBuffer method1191() {
		RSBuffer class523_sub34 = new RSBuffer(518);
		anIntArray569 = new int[4];
		anIntArray569[0] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[1] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[2] = (int) (Math.random() * 9.9999999E7);
		anIntArray569[3] = (int) (Math.random() * 9.9999999E7);
		class523_sub34.writeByte(10, -1884673433);
		class523_sub34.writeInt(anIntArray569[0], -1217991424);
		class523_sub34.writeInt(anIntArray569[1], -1297051091);
		class523_sub34.writeInt(anIntArray569[2], -1922138517);
		class523_sub34.writeInt(anIntArray569[3], -705951365);
		return class523_sub34;
	}

	static void method1192(RSBitBuffer class523_sub34_sub2) {
		boolean bool = class523_sub34_sub2.readUnsignedByte(-1339304867) == 1;
		if (bool) {
			boolean bool_66_ = false;
			int i = class523_sub34_sub2.method18220(-1529088598) << 24;
			i |= class523_sub34_sub2.method18220(821311765) << 16;
			i |= class523_sub34_sub2.method18220(-377545931) << 8;
			i |= class523_sub34_sub2.method18220(95913222);
			Class220.aClass57_2331.method1366((Class176.aLong1857 * -4875073953973370387L), i, -929823142);
		}
	}

	public static void method1193(int i, String string, boolean bool) {
		if (Class653_Sub1.method16688((byte) 44)) {
			if (anInt572 * 426956199 != i)
				aLong573 = -9083684963104943157L;
			anInt572 = i * -1907326441;
			aString583 = string;
			aBool588 = bool;
			Class657.method10791(3, (byte) -7);
		}
	}

	static RSBuffer method1194() {
		RSBuffer class523_sub34 = Class608.method9988((byte) 0);
		long l;
		if (anInt572 * 426956199 != -1)
			l = (long) (426956199 * anInt572);
		else if (aLong573 * -529544860571826659L == -1L)
			l = Class388.method6472(aString603, 2141811390);
		else
			l = -529544860571826659L * aLong573;
		Class176.aLong1857 = -7143280088934120475L * l;
		Class263.method4739(class523_sub34, l);
		class523_sub34.method16270(aString594, (byte) -29);
		class523_sub34.method16441(aLong577 * 505450044301663391L);
		class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
		class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
		return class523_sub34;
	}

	static RSBuffer method1195() {
		RSBuffer class523_sub34 = Class608.method9988((byte) 0);
		long l;
		if (anInt572 * 426956199 != -1)
			l = (long) (426956199 * anInt572);
		else if (aLong573 * -529544860571826659L == -1L)
			l = Class388.method6472(aString603, 2139963700);
		else
			l = -529544860571826659L * aLong573;
		Class176.aLong1857 = -7143280088934120475L * l;
		Class263.method4739(class523_sub34, l);
		class523_sub34.method16270(aString594, (byte) 94);
		class523_sub34.method16441(aLong577 * 505450044301663391L);
		class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
		class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
		return class523_sub34;
	}

	static RSBuffer method1196() {
		RSBuffer class523_sub34 = Class608.method9988((byte) 0);
		long l;
		if (anInt572 * 426956199 != -1)
			l = (long) (426956199 * anInt572);
		else if (aLong573 * -529544860571826659L == -1L)
			l = Class388.method6472(aString603, 2140367987);
		else
			l = -529544860571826659L * aLong573;
		Class176.aLong1857 = -7143280088934120475L * l;
		Class263.method4739(class523_sub34, l);
		class523_sub34.method16270(aString594, (byte) 31);
		class523_sub34.method16441(aLong577 * 505450044301663391L);
		class523_sub34.method16441(client.aLong11022 * -4419446356417383625L);
		class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
		return class523_sub34;
	}

	static void method1197(int i) {
		if (anInt567 * 1566115167 == 142)
			anInt609 = i * 1451422701;
		else if (anInt567 * 1566115167 == 267)
			anInt610 = i * -654032147;
	}

	static void method1198() {
		aClass116_568.method1998(1384776233);
		aClass116_568.updateBuffer.offset = 0;
		aClass116_568.aClass409_1417 = null;
		aClass116_568.aClass409_1430 = null;
		aClass116_568.aClass409_1426 = null;
		aClass116_568.anInt1423 = 0;
		client.anInt11063 = 0;
		client.anInt11235 = 0;
		client.anInt11287 = 0;
		client.anInt11078 = 0;
		client.friendsChatName = null;
		Class365.anInt3866 = 0;
		Class99.aClass115Array1232 = null;
		Class143.aClass334_1693 = null;
		Class194_Sub6.aClass334_9900 = null;
		client.aBool11302 = true;
		Class523_Sub27_Sub5.method17954(1392357891);
		for (int i = 0; i < Class98_Sub1_Sub2.playerVarsProvider.aClass635Array1349.length; i++) {
			Class635 class635 = new Class635(Class551.aClass600_7467.method9866(i, -786678446), false);
			class635.method10421(0, (byte) -73);
			class635.method10420(0, -522020914);
			Class98_Sub1_Sub2.playerVarsProvider.aClass635Array1349[i] = class635;
		}
		Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9755(2029133332);
		Class493.method8089(-1880869284);
		PacketsDecoder.method4264(aClass116_568, -1988502084);
	}

	static void method1199(int i) {
		if (anInt567 * 1566115167 == 142)
			anInt609 = i * 1451422701;
		else if (anInt567 * 1566115167 == 267)
			anInt610 = i * -654032147;
	}

	static void method1200(int i) {
		if (anInt567 * 1566115167 == 142)
			anInt609 = i * 1451422701;
		else if (anInt567 * 1566115167 == 267)
			anInt610 = i * -654032147;
	}

	static void method1201() {
		if (Class91.method1657(-2020118759 * client.anInt11136, (byte) 95)) {
			if (client.aClass116_11057.getCurrentStream(782493095) == null)
				Class657.method10791(1, (byte) -7);
			else
				Class657.method10791(0, (byte) -33);
		} else if (client.anInt11136 * -2020118759 == 1 || -2020118759 * client.anInt11136 == 3)
			Class657.method10791(16, (byte) -65);
		else if (4 == client.anInt11136 * -2020118759)
			Class657.method10791(16, (byte) -2);
	}

	static void method1202() {
		if (19 == client.anInt11136 * -2020118759)
			Class317.method5688((byte) -46);
		client.aClass116_11057.method1980((short) -28285);
		Class195.method3665((byte) 70);
		Class341.aBool3608 = true;
		Class53.method1307(1662746290);
		for (int i = 0; i < client.aClass111Array11017.length; i++)
			client.aClass111Array11017[i] = null;
		client.aBool11000 = false;
		client.anInt11087 = ((int) (Math.random() * 100.0) - 50) * 1986511139;
		client.anInt11089 = ((int) (Math.random() * 110.0) - 55) * -550134747;
		client.anInt11091 = ((int) (Math.random() * 80.0) - 40) * -109611635;
		client.anInt11094 = ((int) (Math.random() * 120.0) - 60) * 873943879;
		client.anInt11068 = ((int) (Math.random() * 30.0) - 20) * -1743116029;
		client.aFloat11129 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class689.method13950(-961934983);
		for (int i = 0; i < 2048; i++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
		Class241.player = null;
		client.anInt11050 = 0;
		client.anInt11049 = 0;
		client.aClass14_11047.method733(1034709842);
		client.aClass708_11074.method14235((byte) -22);
		client.aClass14_11174.method733(134630031);
		client.aClass701_11132.method14082((byte) -121);
		client.aClass14_11172.method733(-1683646618);
		Class523_Sub2.aClass708_10359 = new Class708();
		Class523_Sub2.aClass708_10360 = new Class708();
		Class548.anInt7322 = 0;
		Class144.anInt1695 = 0;
		Class700.anInt8780 = 0;
		Class382.anInt3963 = 0;
		Class170.anInt1834 = 0;
		Class602.anInt7934 = 0;
		Class42.anInt564 = 0;
		Class290.anInt3146 = 0;
		Class168.anInt1801 = 0;
		Class277.anInt3030 = 0;
		if (-1614846429 * client.anInt11186 != -1)
			Class375_Sub2.method15718(-1614846429 * client.anInt11186, -1846859206);
		for (Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255)); class523_sub36 != null; class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method749(1522519441))) {
			if (!class523_sub36.method8660(630290790)) {
				class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255));
				if (class523_sub36 == null)
					break;
			}
			Class579.method9657(class523_sub36, true, false, -891295326);
		}
		client.anInt11186 = 1924171381;
		client.aClass14_11187 = new Class14(8);
		Class110.method1923((byte) 1);
		client.aClass250_11189 = null;
		for (int i = 0; i < 8; i++) {
			client.aStringArray11316[i] = null;
			client.aBoolArray11169[i] = false;
			client.anIntArray11167[i] = -1;
		}
		Class39.method1131((short) 7727);
		client.aBool11009 = true;
		for (int i = 0; i < 106; i++)
			client.aBoolArray11246[i] = true;
		for (int i = 0; i < 3; i++) {
			for (int i_67_ = 0; i_67_ < 8; i_67_++)
				client.exchangeOfferSlots[i][i_67_] = new Class481();
		}
		client.aClass505_11019.method8271((byte) 8).method10249(-125031773);
		client.aBool11111 = true;
		Class602.aShortArray7864 = NPCDefinition.aShortArray3249 = ItemDefinitions.aShortArray162 = new short[256];
		Class17.aString191 = Class39.aClass39_493.method1124(Class53_Sub20.aClass668_10979, (byte) -14);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub19_10634, Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16906(-2078422909), 345586073);
		client.anInt11060 = 0;
		QuickChatStringType.method10448((byte) 18);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
	}

	static void method1203() {
		if (Class91.method1657(-2020118759 * client.anInt11136, (byte) 96)) {
			if (client.aClass116_11057.getCurrentStream(782493095) == null)
				Class657.method10791(1, (byte) -107);
			else
				Class657.method10791(0, (byte) -104);
		} else if (client.anInt11136 * -2020118759 == 1 || -2020118759 * client.anInt11136 == 3)
			Class657.method10791(16, (byte) -91);
		else if (4 == client.anInt11136 * -2020118759)
			Class657.method10791(16, (byte) -48);
	}

	static boolean method1204() {
		if (-2020118759 * client.anInt11136 != 16)
			return false;
		if (Class366.method6324(1290392172) || Class471.method7636(-1990483367))
			return false;
		return true;
	}

	static void method1205(RSBitBuffer class523_sub34_sub2) {
		JS5ArchiveReference[] class44s = Class88.getArchiveReferences(1496972077);
		for (int i = 0; i < class44s.length; i++) {
			JS5ArchiveReference class44 = class44s[i];
			if (class44 != JS5ArchiveReference.LOADING_SPRITES_INDEX) {
				Class472 class472 = (Class472) Class488.aMap5500.get(class44);
				if (class472 == null)
					class523_sub34_sub2.writeInt(0, -918905978);
				else
					class523_sub34_sub2.writeInt(class472.method7719((short) 7562), -1542461919);
			}
		}
	}

	static boolean method1206() {
		if (-2020118759 * client.anInt11136 != 16)
			return false;
		if (Class366.method6324(-1058528574) || Class471.method7636(-1990483367))
			return false;
		return true;
	}

	static void method1207(int i) {
		/* empty */
	}

	static void method1208() {
		if (19 == client.anInt11136 * -2020118759)
			Class317.method5688((byte) -24);
		client.aClass116_11057.method1980((short) -29007);
		Class195.method3665((byte) 12);
		Class341.aBool3608 = true;
		Class53.method1307(1830314495);
		for (int i = 0; i < client.aClass111Array11017.length; i++)
			client.aClass111Array11017[i] = null;
		client.aBool11000 = false;
		client.anInt11087 = ((int) (Math.random() * 100.0) - 50) * 1986511139;
		client.anInt11089 = ((int) (Math.random() * 110.0) - 55) * -550134747;
		client.anInt11091 = ((int) (Math.random() * 80.0) - 40) * -109611635;
		client.anInt11094 = ((int) (Math.random() * 120.0) - 60) * 873943879;
		client.anInt11068 = ((int) (Math.random() * 30.0) - 20) * -1743116029;
		client.aFloat11129 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class689.method13950(-383990992);
		for (int i = 0; i < 2048; i++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
		Class241.player = null;
		client.anInt11050 = 0;
		client.anInt11049 = 0;
		client.aClass14_11047.method733(-1371978432);
		client.aClass708_11074.method14235((byte) 11);
		client.aClass14_11174.method733(-69433742);
		client.aClass701_11132.method14082((byte) -107);
		client.aClass14_11172.method733(-816380597);
		Class523_Sub2.aClass708_10359 = new Class708();
		Class523_Sub2.aClass708_10360 = new Class708();
		Class548.anInt7322 = 0;
		Class144.anInt1695 = 0;
		Class700.anInt8780 = 0;
		Class382.anInt3963 = 0;
		Class170.anInt1834 = 0;
		Class602.anInt7934 = 0;
		Class42.anInt564 = 0;
		Class290.anInt3146 = 0;
		Class168.anInt1801 = 0;
		Class277.anInt3030 = 0;
		if (-1614846429 * client.anInt11186 != -1)
			Class375_Sub2.method15718(-1614846429 * client.anInt11186, -1459014361);
		for (Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255)); class523_sub36 != null; class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method749(-1631197465))) {
			if (!class523_sub36.method8660(-212165123)) {
				class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255));
				if (class523_sub36 == null)
					break;
			}
			Class579.method9657(class523_sub36, true, false, -777633974);
		}
		client.anInt11186 = 1924171381;
		client.aClass14_11187 = new Class14(8);
		Class110.method1923((byte) 1);
		client.aClass250_11189 = null;
		for (int i = 0; i < 8; i++) {
			client.aStringArray11316[i] = null;
			client.aBoolArray11169[i] = false;
			client.anIntArray11167[i] = -1;
		}
		Class39.method1131((short) 31074);
		client.aBool11009 = true;
		for (int i = 0; i < 106; i++)
			client.aBoolArray11246[i] = true;
		for (int i = 0; i < 3; i++) {
			for (int i_68_ = 0; i_68_ < 8; i_68_++)
				client.exchangeOfferSlots[i][i_68_] = new Class481();
		}
		client.aClass505_11019.method8271((byte) 8).method10249(-275885226);
		client.aBool11111 = true;
		Class602.aShortArray7864 = NPCDefinition.aShortArray3249 = ItemDefinitions.aShortArray162 = new short[256];
		Class17.aString191 = Class39.aClass39_493.method1124(Class53_Sub20.aClass668_10979, (byte) -126);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub19_10634, Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16906(-2115972031), 1864374164);
		client.anInt11060 = 0;
		QuickChatStringType.method10448((byte) -33);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
	}

	static final void method1209() {
		aLong573 = -9083684963104943157L;
		aLong577 = 0L;
		anInt572 = 1907326441;
	}

	static void method1210() {
		if (19 == client.anInt11136 * -2020118759)
			Class317.method5688((byte) -32);
		client.aClass116_11057.method1980((short) -207);
		Class195.method3665((byte) 47);
		Class341.aBool3608 = true;
		Class53.method1307(1867245958);
		for (int i = 0; i < client.aClass111Array11017.length; i++)
			client.aClass111Array11017[i] = null;
		client.aBool11000 = false;
		client.anInt11087 = ((int) (Math.random() * 100.0) - 50) * 1986511139;
		client.anInt11089 = ((int) (Math.random() * 110.0) - 55) * -550134747;
		client.anInt11091 = ((int) (Math.random() * 80.0) - 40) * -109611635;
		client.anInt11094 = ((int) (Math.random() * 120.0) - 60) * 873943879;
		client.anInt11068 = ((int) (Math.random() * 30.0) - 20) * -1743116029;
		client.aFloat11129 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class689.method13950(1982886930);
		for (int i = 0; i < 2048; i++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
		Class241.player = null;
		client.anInt11050 = 0;
		client.anInt11049 = 0;
		client.aClass14_11047.method733(-828363725);
		client.aClass708_11074.method14235((byte) -26);
		client.aClass14_11174.method733(2117072461);
		client.aClass701_11132.method14082((byte) -38);
		client.aClass14_11172.method733(937329937);
		Class523_Sub2.aClass708_10359 = new Class708();
		Class523_Sub2.aClass708_10360 = new Class708();
		Class548.anInt7322 = 0;
		Class144.anInt1695 = 0;
		Class700.anInt8780 = 0;
		Class382.anInt3963 = 0;
		Class170.anInt1834 = 0;
		Class602.anInt7934 = 0;
		Class42.anInt564 = 0;
		Class290.anInt3146 = 0;
		Class168.anInt1801 = 0;
		Class277.anInt3030 = 0;
		if (-1614846429 * client.anInt11186 != -1)
			Class375_Sub2.method15718(-1614846429 * client.anInt11186, -1485274148);
		for (Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255)); class523_sub36 != null; class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method749(2069410939))) {
			if (!class523_sub36.method8660(746934601)) {
				class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255));
				if (class523_sub36 == null)
					break;
			}
			Class579.method9657(class523_sub36, true, false, -1818145328);
		}
		client.anInt11186 = 1924171381;
		client.aClass14_11187 = new Class14(8);
		Class110.method1923((byte) 1);
		client.aClass250_11189 = null;
		for (int i = 0; i < 8; i++) {
			client.aStringArray11316[i] = null;
			client.aBoolArray11169[i] = false;
			client.anIntArray11167[i] = -1;
		}
		Class39.method1131((short) 23670);
		client.aBool11009 = true;
		for (int i = 0; i < 106; i++)
			client.aBoolArray11246[i] = true;
		for (int i = 0; i < 3; i++) {
			for (int i_69_ = 0; i_69_ < 8; i_69_++)
				client.exchangeOfferSlots[i][i_69_] = new Class481();
		}
		client.aClass505_11019.method8271((byte) 8).method10249(-549563112);
		client.aBool11111 = true;
		Class602.aShortArray7864 = NPCDefinition.aShortArray3249 = ItemDefinitions.aShortArray162 = new short[256];
		Class17.aString191 = Class39.aClass39_493.method1124(Class53_Sub20.aClass668_10979, (byte) -31);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub19_10634, Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16906(-2087580094), -1212464759);
		client.anInt11060 = 0;
		QuickChatStringType.method10448((byte) 17);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
	}

	public static final boolean method1211() {
		return 1 != -1905499279 * anInt601;
	}

	static boolean method1212(String string, String string_70_) {
		anInt567 = 1953306581;
		aClass116_568 = client.aClass116_11058;
		return Class159.method2570(false, false, string, string_70_, -1L);
	}

	static void method1213() {
		aClass116_568.method1998(1429317633);
		aClass116_568.updateBuffer.offset = 0;
		aClass116_568.currentPacket = null;
		aClass116_568.aClass409_1417 = null;
		aClass116_568.aClass409_1430 = null;
		aClass116_568.aClass409_1426 = null;
		aClass116_568.anInt1421 = 0;
		aClass116_568.anInt1423 = 0;
		client.anInt11063 = 0;
		QuickChatStringType.method10448((byte) 26);
		Class100.method1794(293609044);
		for (int i = 0; i < 2048; i++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = null;
		Class241.player = null;
		for (int i = 0; i < client.anInt11049 * -1359865227; i++) {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i].anObject10554);
			if (null != class647_sub1_sub3_sub1)
				class647_sub1_sub3_sub1.faceEntityId = 1843265241;
		}
		Class39.method1131((short) 6718);
		Class313.method5656(NetworkStream.method9224(36627274), 743172261);
		Class657.method10791(9, (byte) -60);
		for (int i = 0; i < 106; i++)
			client.aBoolArray11246[i] = true;
		PacketsDecoder.method4264(aClass116_568, -342364910);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
		Class286.method5152((byte) -66);
		Class423.clientConfigsDomain.method14383((byte) 0);
	}

	static boolean method1214() {
		if (-1 != 426956199 * anInt572)
			return NPCVarDomainType.method15863(1648344126);
		return Class523_Sub30.method16186(aString603, aString594, -478181682);
	}

	public static void method1215(String string, boolean bool) {
		if (0 == -2020118759 * client.anInt11136 && (!Class366.method6324(937402571) && !Class471.method7636(-1990483367))) {
			aString583 = string;
			aBool588 = bool;
			Class657.method10791(8, (byte) -121);
		}
	}

	static boolean method1216() {
		if (-2020118759 * client.anInt11136 != 16)
			return false;
		if (Class366.method6324(1370420359) || Class471.method7636(-1990483367))
			return false;
		return true;
	}

	static Class273[] method1217(byte i) {
		return (new Class273[] { Class273.aClass273_2888, Class273.aClass273_2889, Class273.aClass273_2890 });
	}

	static final void method1218(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -638979175 * anInt617;
	}

	static final void method1219(Class669 class669, byte i) {
		Class173.method2902(724834093);
	}

	static void method1220(int i, int i_71_) {
		ItemsContainer.anInt10321 = 1772781435 * i;
		ItemsContainer.aClass209_10324.method3773(-2112567046);
	}

	static final void method1221(Class669 class669, int i) {
		int i_72_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_72_, -587126789);
		Class242 class242 = Class31.aClass242Array302[i_72_ >> 16];
		Class647_Sub1_Sub3_Sub3.method18448(class250, class242, class669, -948584087);
	}
}
