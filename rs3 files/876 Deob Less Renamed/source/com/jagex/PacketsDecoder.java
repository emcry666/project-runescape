/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class PacketsDecoder implements Interface75 {
	public static PacketsDecoder aClass233_2368 = new PacketsDecoder(1, 0);
	public static PacketsDecoder aClass233_2369 = new PacketsDecoder(2, 1);
	public static PacketsDecoder aClass233_2370;
	public static PacketsDecoder aClass233_2371 = new PacketsDecoder(4, 2);
	public static PacketsDecoder aClass233_2372;
	public static PacketsDecoder aClass233_2373;
	public int anInt2374;
	int anInt2375;

	public int method82() {
		return 465364717 * anInt2375;
	}

	static {
		aClass233_2370 = new PacketsDecoder(3, 3);
		aClass233_2372 = new PacketsDecoder(5, 4);
		aClass233_2373 = new PacketsDecoder(0, 5);
	}

	PacketsDecoder(int i, int i_0_) {
		anInt2374 = i * 1588504009;
		anInt2375 = i_0_ * 1353672421;
	}

	public int method6() {
		return 465364717 * anInt2375;
	}

	public int method101() {
		return 465364717 * anInt2375;
	}

	static final void method4259(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class499.method8111(class250, class242, class669, -2019883664);
	}

	static final void method4260(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_1_, -1436423795);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class583.method9670(class250, class242, class669, 8989159);
	}

	static final void method4261(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2605 * 1569774109;
	}

	static final void method4262(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (Math.random() * (double) (1 + i_2_));
	}

	static final void method4263(Class669 class669, byte i) {
		client.aBool10980 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		if (client.aBool10980)
			Class201.method3691((byte) -1);
	}

	static void method4264(Class116 class116, int i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.SCREEN_PACKET, class116.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class316.method5685(1911694235), 486037681);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(Class170.anInt1833 * 2141365743, (byte) -56);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(Class254.anInt2742 * -495986435, (byte) -101);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -103), 1690177178);
		class116.method1974(class523_sub22, (byte) 51);
	}

	static final boolean method4265(Class116 class116, int i) throws IOException {
		Class557 class557 = class116.method1979(782493095);
		Class523_Sub34_Sub2 buffer = class116.aClass523_Sub34_Sub2_1431;
		if (class557 == null)
			return false;
		if (null == class116.currentPacket) {
			if (class116.aBool1422) {
				if (!class557.method9199(1, 1295053713))
					return false;
				class557.method9201((class116.aClass523_Sub34_Sub2_1431.aByteArray10658), 0, 1, (short) 21428);
				class116.anInt1419 += 1798320187;
				class116.anInt1423 = 0;
				class116.aBool1422 = false;
			}
			buffer.anInt10661 = 0;
			if (buffer.method18225(1673560962)) {
				if (!class557.method9199(1, 725305458))
					return false;
				class557.method9201((class116.aClass523_Sub34_Sub2_1431.aByteArray10658), 1, 1, (short) 4913);
				class116.anInt1419 += 1798320187;
				class116.anInt1423 = 0;
			}
			class116.aBool1422 = true;
			IncomingPacket[] class409s = Class189.method3601(2143114887);
			int i_3_ = buffer.method18221((byte) 49);
			if (i_3_ < 0 || i_3_ >= class409s.length)
				throw new IOException(new StringBuilder().append(i_3_).append(" ").append(2349011 * buffer.anInt10661).toString());
			class116.currentPacket = class409s[i_3_];
			class116.anInt1421 = class116.currentPacket.anInt4523 * 885392747;
		}
		if (-1 == class116.anInt1421 * -1372959327) {
			if (!class557.method9199(1, 993218518))
				return false;
			class557.method9201(buffer.aByteArray10658, 0, 1, (short) 15547);
			class116.anInt1421 = (buffer.aByteArray10658[0] & 0xff) * 1150604897;
			class116.anInt1419 += 1798320187;
			class116.anInt1423 = 0;
		}
		if (class116.anInt1421 * -1372959327 == -2) {
			if (!class557.method9199(2, 784820347))
				return false;
			class557.method9201(buffer.aByteArray10658, 0, 2, (short) 7473);
			buffer.anInt10661 = 0;
			class116.anInt1421 = buffer.readUnsignedShort(-441732599) * 1150604897;
			class116.anInt1419 += -698326922;
			class116.anInt1423 = 0;
		}
		if (class116.anInt1421 * -1372959327 > 0) {
			if (!class557.method9199(class116.anInt1421 * -1372959327, 1596390223))
				return false;
			buffer.anInt10661 = 0;
			class557.method9201(buffer.aByteArray10658, 0, -1372959327 * class116.anInt1421, (short) 22129);
			class116.anInt1419 += class116.anInt1421 * -344058853;
			class116.anInt1423 = 0;
		}
		class116.aClass409_1426 = class116.aClass409_1430;
		class116.aClass409_1430 = class116.aClass409_1417;
		class116.aClass409_1417 = class116.currentPacket;

		// TODO
		// System.out.println("PACKET SENT: " + 942758347 * class116.currentPacket.anInt4522);

		if (class116.currentPacket == IncomingPacket.OPEN_URL_PACKET) {
			if (Class710.aBool8840 && null != Class310.aFrame3385)
				Class82.method1585(Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(-281269723), -1, -1, false, -1011984276);
			byte[] is = new byte[-1372959327 * class116.anInt1421 - 1];
			boolean bool = buffer.readUnsignedByte(-740229672) == 1;
			buffer.method18222(is, 0, (class116.anInt1421 * -1372959327 - 1), (byte) 92);
			Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
			String string = class523_sub34.readString(-672712762);
			if (bool) {
				String string_4_ = class523_sub34.readString(-1112609269);
				if (string_4_.length() == 0)
					string_4_ = string;
				if (!client.aBool11185 || Class611.aString8013.startsWith("mac") || !Class571.method9619(string, 1, Class402.aClass402_4166.method6574(1621057790), 1067889208))
					Class331.method5825(string_4_, true, client.aBool10996, 861338412);
			} else
				Class331.method5825(string, true, client.aBool10996, 293277805);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_WEIGHT_PACKET == class116.currentPacket) {
			client.anInt11191 = buffer.readShort(-1368686200) * 1182053959;
			client.anInt11221 = 1635505145 * client.anInt11251;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.RUN_ENERGY_PACKET) {
			client.anInt11190 = buffer.readUnsignedByte(-2015901482) * 1150131413;
			client.anInt11221 = 1635505145 * client.anInt11251;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4454 == class116.currentPacket) {
			int i_5_ = buffer.readUnsignedByte(-153489326);
			i_5_ = -i_5_ - 2;
			byte i_6_ = buffer.readByte((short) -26811);
			Player class647_sub1_sub3_sub1_sub2 = ((Player) client.aMap11155.get(Integer.valueOf(i_5_)));
			if (null == class647_sub1_sub3_sub1_sub2) {
				class647_sub1_sub3_sub1_sub2 = new Player(null);
				class647_sub1_sub3_sub1_sub2.anInt11888 = -1926162379 * i_5_;
				client.aMap11155.put(Integer.valueOf(i_5_), class647_sub1_sub3_sub1_sub2);
			}
			class647_sub1_sub3_sub1_sub2.decodePlayerLook(buffer, i_6_, (byte) 2);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CUTSCENE_PACKET == class116.currentPacket) {
			int i_7_ = buffer.readUnsignedShort(-1468300491);
			client.anInt11073 = -470293709;
			client.anInt11070 = -1723083717 * i_7_;
			client.anInt11071 = 0;
			Class291.aClass472_3154.method7650(-2131499789 * client.anInt11070, 609428322);
			Class524.method8685(-522212835);
			Class648.method10616(-2119225849);
			int i_8_ = buffer.readUnsignedShort(-382195579);
			client.anInt11075 = i_8_ * 177638717;
			int i_9_ = buffer.readUnsignedByte(635824658);
			Class145_Sub1.aClass523_Sub34_9522 = new Class523_Sub34(i_9_);
			Class145_Sub1.aClass523_Sub34_9522.readBytes(buffer.aByteArray10658, buffer.anInt10661 * 2349011, i_9_, (short) -13026);
			buffer.anInt10661 += i_9_ * 189765723;
			class116.currentPacket = null;
			return false;
		}
		if (IncomingPacket.MESSAGE_STATUS_UPDATE_PACKET == class116.currentPacket) {
			Class392.aClass705_4037 = Class488.method7951(buffer.readUnsignedByte(-113212344), -1921157876);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_UNDER_NPC_PACKET == class116.currentPacket) {
			int i_10_ = buffer.readUnsignedByteC(233637736);
			Class220.method4131(-17414964);
			client.anInt11130 = -1406683893 * i_10_;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4393 == class116.currentPacket) {
			int i_11_ = buffer.readUnsignedIntLE((short) -317);
			boolean bool = buffer.readUnsigned128Byte(1030561790) == 1;
			Class220.method4131(-17414964);
			Class647_Sub1_Sub1_Sub2.method18463(i_11_, bool, (short) -11709);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4487 == class116.currentPacket) {
			boolean bool = buffer.readUnsignedByte(-1624569985) == 1;
			long l = (long) buffer.readUnsignedShort(-524959361);
			long l_12_ = (long) buffer.read24BitInt(-1372488345);
			long l_13_ = l_12_ + (l << 32);
			boolean bool_14_ = false;
			Class523_Sub19 class523_sub19 = (bool ? Class673.aClass523_Sub19_8611 : Class675.aClass523_Sub19_8632);
			if (class523_sub19 == null)
				bool_14_ = true;
			else {
				for (int i_15_ = 0; i_15_ < 100; i_15_++) {
					if (client.aLongArray11175[i_15_] == l_13_) {
						bool_14_ = true;
						break;
					}
				}
			}
			if (!bool_14_) {
				client.aLongArray11175[-435008989 * client.anInt11069] = l_13_;
				client.anInt11069 = -2068990581 * ((1 + client.anInt11069 * -435008989) % 100);
				String string = Class523_Sub19.decodeHuffman(buffer, -260163259);
				int i_16_ = bool ? 43 : 46;
				Class644.method10552(i_16_, 0, "", "", "", string, class523_sub19.aString10484, -1, null, (byte) 80);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.LOBBY_LOGOUT_PACKET) {
			Class669.method13691(Class43.aBool618, -1838550041);
			class116.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass409_4422 == class116.currentPacket) {
			Class17.aString191 = (class116.anInt1421 * -1372959327 > 2 ? buffer.readString(391219731) : Class39.aClass39_493.method1124((Class53_Sub20.aClass668_10979), (byte) -20));
			client.anInt10997 = (class116.anInt1421 * -1372959327 > 0 ? buffer.readUnsignedShort(-263074665) : -1) * 1840244309;
			if (client.anInt10997 * -1101666563 == 65535)
				client.anInt10997 = -1840244309;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ACCESS_MASK_PACKET == class116.currentPacket) {
			int i_17_ = buffer.readUnsignedIntV1(-1908553945);
			int i_18_ = buffer.readUnsignedShortLE128(1704154736);
			if (65535 == i_18_)
				i_18_ = -1;
			int i_19_ = buffer.readUnsignedInt((byte) -112);
			int i_20_ = buffer.readUnsignedShort128((short) 10286);
			if (65535 == i_20_)
				i_20_ = -1;
			Class220.method4131(-17414964);
			for (int i_21_ = i_20_; i_21_ <= i_18_; i_21_++) {
				long l = ((long) i_19_ << 32) + (long) i_21_;
				Class523_Sub13 class523_sub13 = (Class523_Sub13) client.aClass14_11242.method741(l);
				Class523_Sub13 class523_sub13_22_;
				if (class523_sub13 == null) {
					if (i_21_ == -1)
						class523_sub13_22_ = new Class523_Sub13(i_17_, (Class188.method3592(i_19_, -1137161163).aClass523_Sub13_2559.anInt10454) * 330664637);
					else
						class523_sub13_22_ = new Class523_Sub13(i_17_, -1);
				} else {
					class523_sub13_22_ = new Class523_Sub13(i_17_, 330664637 * (class523_sub13.anInt10454));
					class523_sub13.method8661(607052656);
				}
				client.aClass14_11242.method738(class523_sub13_22_, l);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.SEND_NIS_VAR_PACKET) {
			if (null == Class636.aClass149_8300)
				Class636.aClass149_8300 = new Class149(Class663.aClass98_Sub1_Sub2_8525);
			Class426 class426 = Class663.aClass98_Sub1_Sub2_8525.refreshNIS(buffer, -888806254);
			Class636.aClass149_8300.anInterface2_1714.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1795078800);
			client.anIntArray11227[(client.anInt11181 += 984637543) * -1262699689 - 1 & 0x3f] = -408785679 * class426.anInt4821;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_UPDATE_PACKET == class116.currentPacket) {
			Class617.updatePlayer(buffer, class116.anInt1421 * -1372959327, 1860794598);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.CS2_SCRIPT_PACKET) {
			String string = buffer.readString(-1281033795);
			Object[] objects = new Object[string.length() + 1];
			for (int i_23_ = string.length() - 1; i_23_ >= 0; i_23_--) {
				if (string.charAt(i_23_) == 's')
					objects[1 + i_23_] = buffer.readString(-850609264);
				else
					objects[1 + i_23_] = new Integer(buffer.readUnsignedInt((byte) -80));
			}
			objects[0] = new Integer(buffer.readUnsignedInt((byte) -110));
			Class220.method4131(-17414964);
			Class523_Sub38 class523_sub38 = new Class523_Sub38();
			class523_sub38.anObjectArray10687 = objects;
			Class482.method7916(class523_sub38, (byte) 3);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.RESET_NIS_VARS_PACKET == class116.currentPacket) {
			Class423.clientConfigsDomain.method14387(2016272608);
			class116.currentPacket = null;
			return false;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4376) {
			int i_24_ = buffer.readUnsignedShort(-2115372942);
			Class254.aClass217_2743.method3863(i_24_, (byte) 75);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4419 == class116.currentPacket) {
			boolean bool = buffer.readUnsignedByte(1956273563) == 1;
			String string = buffer.readString(-47580686);
			long l = (long) buffer.readUnsignedShort(-320148245);
			long l_25_ = (long) buffer.read24BitInt(-119609469);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) 5698), buffer.readUnsignedByte(-166980084), 1758608294));
			long l_26_ = l_25_ + (l << 32);
			boolean bool_27_ = false;
			Object object = null;
			Class523_Sub19 class523_sub19 = (bool ? Class673.aClass523_Sub19_8611 : Class675.aClass523_Sub19_8632);
			while_133_: do {
				if (null == class523_sub19)
					bool_27_ = true;
				else {
					for (int i_28_ = 0; i_28_ < 100; i_28_++) {
						if (client.aLongArray11175[i_28_] == l_26_) {
							bool_27_ = true;
							break while_133_;
						}
					}
					if (class421.aBool4790) {
						if (client.aBool11160 && !client.aBool11161 || client.aBool11164)
							bool_27_ = true;
						else if (Class519.method8641(string, -1235019087))
							bool_27_ = true;
					}
				}
			} while (false);
			if (!bool_27_) {
				client.aLongArray11175[-435008989 * client.anInt11069] = l_26_;
				client.anInt11069 = (-435008989 * client.anInt11069 + 1) % 100 * -2068990581;
				String string_29_ = (Class55.method1360(Class523_Sub19.decodeHuffman(buffer, -851321552), -1678762418));
				int i_30_ = bool ? 41 : 44;
				if (-429816343 * class421.anInt4788 != -1)
					Class644.method10552(i_30_, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -583075276)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((-429816343 * class421.anInt4788), -1225593416)).append(string).toString(), string, string_29_, class523_sub19.aString10484, -1, class421, (byte) 16);
				else
					Class644.method10552(i_30_, 0, string, string, string, string_29_, class523_sub19.aString10484, -1, class421, (byte) 42);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4462 == class116.currentPacket) {
			boolean bool = buffer.readUnsignedByteC(-513835279) == 1;
			Class220.method4131(-17414964);
			Class318.aBool3431 = bool;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4417) {
			int[] is = new int[4];
			for (int i_31_ = 0; i_31_ < 4; i_31_++)
				is[i_31_] = buffer.readUnsignedIntV1(-1908553945);
			int i_32_ = buffer.readUnsigned128Byte(1895850171);
			int i_33_ = buffer.readUnsignedShort128((short) 16925);
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_33_));
			if (null != class523_sub28)
				Class643.method10538(((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554), is, i_32_, true, -1482327619);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.ROOT_INTERFACE_PACKET) {
			buffer.readUnsigned128Byte(983090782);
			int i_34_ = buffer.readUnsignedInt((byte) -3);
			int i_35_ = buffer.readUnsignedIntLE((short) -3923);
			int i_36_ = buffer.readUnsignedIntV2((short) 19071);
			int i_37_ = buffer.readUnsignedShort(-10469236);
			int i_38_ = buffer.readUnsignedIntV1(-1908553945);
			Class220.method4131(-17414964);
			int[] is = { i_38_, i_34_, i_36_, i_35_ };
			client.anInt11186 = i_37_ * -1924171381;
			Class607.method9986(i_37_, is, -1067936249);
			Class284.method5142(false, (byte) -17);
			Class591.method9777(client.anInt11186 * -1614846429, is, 1540936291);
			for (int i_39_ = 0; i_39_ < 106; i_39_++)
				client.aBoolArray11246[i_39_] = true;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.VAR_2_PACKET == class116.currentPacket) {
			int i_40_ = buffer.readUnsignedIntLE((short) -15575);
			int i_41_ = buffer.readUnsignedShort128((short) 4018);
			Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9763(((Class159) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i_41_, (byte) 16)), i_40_, -1806202437);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.BLACK_OUT_PACKET) {
			Class104.anInt1274 = buffer.readUnsignedByte(1455369303) * 2053199425;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4506) {
			int i_42_ = buffer.readUnsignedByteC(-683783801);
			int i_43_ = buffer.readUnsigned128Byte(1460016540);
			int i_44_ = buffer.readUnsigned128Byte(2058161350);
			int i_45_ = buffer.readUnsignedShortLE((byte) 126) << 2;
			int i_46_ = buffer.readUnsignedByteC(-1655913393);
			Class220.method4131(-17414964);
			IncomingPacket.method6629(i_44_, i_43_, i_45_, i_46_, i_42_, (byte) -107);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4514) {
			int i_47_ = buffer.readUnsignedIntV1(-1908553945);
			int i_48_ = buffer.readUnsignedByte128(831508956);
			i_48_ = -i_48_ - 2;
			Class220.method4131(-17414964);
			Class149.method2518(i_47_, 5, i_48_, 0, -1205778497);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.PLAYER_ON_ICOMPONENT_PACKET) {
			int hash = buffer.readUnsignedIntV1(-1908553945);
			Class220.method4131(-17414964);
			Class149.method2518(hash, 5, client.anInt11154 * 1109726117, 0, -1475532405);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4428 == class116.currentPacket) {
			client.anInt11014 = client.anInt11251 * -217609959;
			boolean bool = buffer.readUnsignedByte(737069848) == 1;
			if (1 == -1372959327 * class116.anInt1421) {
				if (bool)
					Class673.aClass523_Sub19_8611 = null;
				else
					Class675.aClass523_Sub19_8632 = null;
				class116.currentPacket = null;
				return true;
			}
			if (bool)
				Class673.aClass523_Sub19_8611 = new Class523_Sub19(buffer);
			else
				Class675.aClass523_Sub19_8632 = new Class523_Sub19(buffer);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.APPEARANCE_LOOK_PACKET) {
			byte gender = buffer.readByte((short) -20035);
			Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.decodePlayerLook(buffer, gender, (byte) 2);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4378 == class116.currentPacket) {
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4331) {
			int i_51_ = buffer.readUnsignedShort128((short) 3074);
			int i_52_ = buffer.readUnsignedInt((byte) -62);
			int i_53_ = buffer.readUnsignedShortLE128(1820015545);
			int i_54_ = buffer.readUnsignedShortLE((byte) 2);
			Class220.method4131(-17414964);
			Class212.method3833(i_52_, i_54_, i_53_, i_51_, -1522122657);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4498 == class116.currentPacket) {
			Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method15549(buffer, -1372959327 * class116.anInt1421, (byte) -27);
			client.anInt11238 = 1396903407 * client.anInt11251;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4377 == class116.currentPacket) {
			boolean bool = buffer.readUnsignedByte(-1673911673) == 1;
			int i_55_ = buffer.readUnsignedInt((byte) -86);
			Class220.method4131(-17414964);
			Class178.method3477(i_55_, bool, -1749900831);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4458) {
			int i_56_ = buffer.readUnsignedIntV2((short) 28328);
			int i_57_ = buffer.readUnsignedInt((byte) -27);
			Class220.method4131(-17414964);
			Class530.method8774(i_56_, i_57_, -1363171976);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4329 == class116.currentPacket) {
			int i_58_ = buffer.readUnsignedInt((byte) -111);
			int i_59_ = buffer.readUnsignedInt((byte) -76);
			Class220.method4131(-17414964);
			Class149.method2518(i_58_, 1, i_59_, -1, -2132569525);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.CS_VAR_2_PACKET) {
			int i_60_ = buffer.readUnsignedShort128((short) 8468);
			int i_61_ = buffer.readUnsignedInt((byte) -23);
			Class220.method4131(-17414964);
			Class375.method6386(i_60_, i_61_, -164386176);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4355 == class116.currentPacket) {
			Player.method18698(Class412.aClass412_4549, (byte) 5);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.GAME_LOGOUT_PACKET == class116.currentPacket) {
			Class669.method13691(false, -1838550041);
			class116.currentPacket = null;
			return false;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4370) {
			int i_62_ = buffer.readUnsignedShortLE((byte) 6);
			int i_63_ = buffer.readUnsigned128Byte(1093168382);
			boolean bool = (i_63_ & 0x1) == 1;
			Class705.method14142(i_62_, bool, 2136416234);
			client.anIntArray11219[(client.anInt11220 += 462942153) * 1934318201 - 1 & 0x3f] = i_62_;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4508 == class116.currentPacket) {
			client.aClass220_11301.method4111(-727152801);
			int i_64_ = buffer.readUnsignedByte(-271774006);
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
				int i_66_ = buffer.readUnsignedInt((byte) -30);
				Class219 class219 = new Class219(i_66_);
				client.aClass220_11301.method4118(class219, 533824147);
				int i_67_ = buffer.readUnsignedByte(-885328127);
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++)
					class219.method4061(buffer.readUnsignedInt((byte) -52), -1889548775);
				int i_69_ = buffer.readUnsignedByte(-1020574884);
				for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
					class219.method4045(buffer.readUnsignedInt((byte) -97), -1636735271);
				for (int i_71_ = 0; i_71_ < i_67_; i_71_++) {
					byte i_72_ = buffer.readByte((short) -23780);
					class219.method4047(i_71_, i_72_, -1088712784);
					for (int i_73_ = 0; i_73_ < i_69_; i_73_++) {
						if (buffer.readUnsignedByte(-1184742087) == 0)
							class219.method4060(i_71_, i_73_, null, 505418394);
						else
							class219.method4060(i_71_, i_73_, Integer.valueOf(buffer.readUnsignedInt((byte) -57)), 505418394);
					}
				}
			}
			client.aBool11302 = false;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.CONTAINER_UPDATE_PACKET) {
			int key = buffer.readUnsignedShort(-1523794622);
			int flag = buffer.readUnsignedByte(1151971697);
			boolean negativeKey = (flag & 0x1) != 0;
			boolean nis = 0 != (flag & 0x2);
			while (buffer.anInt10661 * 2349011 < class116.anInt1421 * -1372959327) {
				int index = buffer.readUnsignedSmart(368514876);
				int id = buffer.readUnsignedShort(-1994271913);
				int amount = 0;
				Class4 class4 = null;
				if (id != 0) {
					amount = buffer.readUnsignedByte(-1381885425);
					if (255 == amount)
						amount = buffer.readUnsignedInt((byte) -51);
					if (nis) {
						int i_80_ = buffer.readUnsignedByte(-392271523);
						if (i_80_ > 0) {
							class4 = new Class4(Class602.aClass98_Sub1_Sub2_7933);
							while (i_80_-- > 0) {
								Class426 class426 = (Class602.aClass98_Sub1_Sub2_7933.refreshNIS(buffer, -683143195));
								class4.method14((class426.anInt4821 * -408785679), class426.anObject4822, -1266646826);
							}
						}
					}
				}
				Class518.setContainerItem(key, index, id - 1, amount, class4, negativeKey, (byte) 79);
			}
			client.anIntArray11219[(client.anInt11220 += 462942153) * 1934318201 - 1 & 0x3f] = key;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SELECT_TARGET_PACKET == class116.currentPacket) {
			client.anInt10999 = buffer.readUnsignedShortLE(814349991) * 1880104385;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.ADJUSTED_PROJECTILE_PACKET) {
			Player.method18698(Class412.ADJUSTED_PROJECTILE, (byte) -104);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4404) {
			int i_81_ = buffer.readUnsignedByte(-668435039);
			Class704 class704 = ((Class704) Class334.method5910(Class297.method5305(205020547), i_81_, -310513999));
			if (null == class704)
				class704 = Class704.aClass704_8796;
			Class262.method4736(class704, (byte) 84);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4394 == class116.currentPacket) {
			int i_82_ = buffer.readUnsignedByte(1068099962);
			i_82_ = -i_82_ - 2;
			client.aMap11155.remove(Integer.valueOf(i_82_));
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4426) {
			String string = buffer.readString(-1962045120);
			Class178.method3476(string, 1529281938);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.GRAPHICS_PACKET == class116.currentPacket) {
			int delay = buffer.readUnsignedShort(-1776680795);
			int slotId = buffer.readUnsignedByte128(1823961015);
			int tHash = buffer.readUnsignedIntV1(-1908553945);
			int hash = buffer.readUnsignedByte(-1311323621);
			int graphicsId = buffer.readUnsignedShort128((short) 16268);
			if (graphicsId == 65535)
				graphicsId = -1;
			int height = buffer.readUnsignedShort(-1714242343);
			int i_89_ = hash & 0x7;
			int i_90_ = hash >> 3 & 0xf;
			if (15 == i_90_)
				i_90_ = -1;
			boolean bool = 1 == (hash >> 7 & 0x1);
			if (tHash >> 30 != 0) {
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_91_ = tHash >> 28 & 0x3;
				int i_92_ = (tHash >> 14 & 0x3fff) - 235453015 * class592.localX;
				int i_93_ = (tHash & 0x3fff) - class592.localY * 1704054549;
				if (i_92_ >= 0 && i_93_ >= 0 && i_92_ < client.aClass505_11019.method8292((byte) 118) && i_93_ < client.aClass505_11019.method8235(2130804745)) {
					if (graphicsId == -1) {
						Class523_Sub27_Sub9 class523_sub27_sub9 = ((Class523_Sub27_Sub9) client.aClass14_11174.method741((long) (i_92_ << 16 | i_93_)));
						if (class523_sub27_sub9 != null) {
							class523_sub27_sub9.aClass647_Sub1_Sub3_Sub4_11721.method18578(2139841144);
							class523_sub27_sub9.method8661(607052656);
						}
					} else {
						int i_94_ = i_92_ * 512 + 256;
						int i_95_ = 256 + i_93_ * 512;
						int i_96_ = i_91_;
						if (i_96_ < 3 && client.aClass505_11019.method8243(-727782425).method7282(i_92_, i_93_, -638715901))
							i_96_++;
						Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = (new Class647_Sub1_Sub3_Sub4(client.aClass505_11019.method8241((byte) -126), graphicsId, delay, i_91_, i_96_, i_94_, Class53_Sub17.method17220(i_94_, i_95_, i_91_, 1944308654) - height, i_95_, i_92_, i_92_, i_93_, i_93_, i_89_, bool, 0));
						client.aClass14_11174.method738(new Class523_Sub27_Sub9(class647_sub1_sub3_sub4), (long) (i_92_ << 16 | i_93_));
					}
				}
			} else if (tHash >> 29 != 0) {
				int i_97_ = tHash & 0xffff;
				Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_97_));
				if (class523_sub28 != null) {
					Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
					Class515 class515 = (class647_sub1_sub3_sub1_sub1.aClass515Array11912[slotId]);
					if (graphicsId == 65535)
						graphicsId = -1;
					boolean bool_98_ = true;
					int i_99_ = class515.id * 985865715;
					if (graphicsId != -1 && -1 != i_99_) {
						if (graphicsId == i_99_) {
							GraphicsDefinitions class671 = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(graphicsId, (byte) -63);
							if (class671.aBool8602 && -61429051 * class671.anInt8590 != -1) {
								AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) -28)));
								int i_100_ = class205.anInt2220 * 1566662983;
								if (0 == i_100_ || i_100_ == 2)
									bool_98_ = false;
								else if (i_100_ == 1)
									bool_98_ = true;
							}
						} else {
							GraphicsDefinitions class671 = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(graphicsId, (byte) -3);
							GraphicsDefinitions class671_101_ = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i_99_, (byte) -5);
							if (-1 != class671.anInt8590 * -61429051 && -61429051 * class671_101_.anInt8590 != -1) {
								AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) -56)));
								AnimationDefinitions class205_102_ = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671_101_.anInt8590, (byte) 100)));
								if (1835115947 * class205.priority < class205_102_.priority * 1835115947)
									bool_98_ = false;
							}
						}
					}
					if (bool_98_) {
						class515.id = -873938117 * graphicsId;
						class515.height = -63249911 * height;
						class515.anInt7041 = i_90_ * -1792689941;
						if (graphicsId != -1) {
							GraphicsDefinitions class671 = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(graphicsId, (byte) 48);
							int i_103_ = class671.aBool8602 ? 0 : 2;
							if (bool)
								i_103_ = 1;
							class515.aClass707_7043.method14168(class671.anInt8590 * -61429051, delay, i_103_, false, 1840849895);
						} else
							class515.aClass707_7043.method14164(-1, (byte) 12);
					}
				}
			} else if (0 != tHash >> 28) {
				int i_104_ = tHash & 0xffff;
				Player class647_sub1_sub3_sub1_sub2;
				if (i_104_ == 1109726117 * client.anInt11154)
					class647_sub1_sub3_sub1_sub2 = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453;
				else
					class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_104_]);
				if (class647_sub1_sub3_sub1_sub2 != null) {
					Class515 class515 = (class647_sub1_sub3_sub1_sub2.aClass515Array11912[slotId]);
					if (65535 == graphicsId)
						graphicsId = -1;
					boolean bool_105_ = true;
					int i_106_ = class515.id * 985865715;
					if (-1 != graphicsId && i_106_ != -1) {
						if (graphicsId == i_106_) {
							GraphicsDefinitions class671 = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(graphicsId, (byte) -29);
							if (class671.aBool8602 && -61429051 * class671.anInt8590 != -1) {
								AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) -20)));
								int i_107_ = 1566662983 * class205.anInt2220;
								if (i_107_ == 0 || 2 == i_107_)
									bool_105_ = false;
								else if (1 == i_107_)
									bool_105_ = true;
							}
						} else {
							GraphicsDefinitions class671 = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(graphicsId, (byte) -31);
							GraphicsDefinitions class671_108_ = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i_106_, (byte) -77);
							if (-1 != -61429051 * class671.anInt8590 && -1 != class671_108_.anInt8590 * -61429051) {
								AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(class671.anInt8590 * -61429051, (byte) -73)));
								AnimationDefinitions class205_109_ = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(class671_108_.anInt8590 * -61429051, (byte) 25)));
								if (1835115947 * class205.priority < class205_109_.priority * 1835115947)
									bool_105_ = false;
							}
						}
					}
					if (bool_105_) {
						class515.id = -873938117 * graphicsId;
						class515.height = -63249911 * height;
						class515.anInt7041 = -1792689941 * i_90_;
						class515.anInt7044 = 1328826279 * i_89_;
						if (graphicsId != -1) {
							GraphicsDefinitions class671 = (GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(graphicsId, (byte) 16);
							int i_110_ = class671.aBool8602 ? 0 : 2;
							if (bool)
								i_110_ = 1;
							class515.aClass707_7043.method14168(-61429051 * class671.anInt8590, delay, i_110_, false, 1840849895);
						} else
							class515.aClass707_7043.method14164(-1, (byte) 12);
					}
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.LOBBY_INFO_PACKET == class116.currentPacket) {
			Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9755(1388141027);
			client.anInt11272 += 1591286976;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4361 == class116.currentPacket) {
			class116.currentPacket = null;
			return false;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4496) {
			int i_111_ = buffer.readUnsignedShortLE((byte) 66);
			int i_112_ = buffer.method16268(337763545);
			int i_113_ = buffer.readUnsigned128Byte(2034163322);
			int i_114_ = buffer.readUnsignedIntV2((short) 19367);
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_111_));
			if (null != class523_sub28) {
				Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.aClass304_12167 == null)
					class647_sub1_sub3_sub1_sub1.aClass304_12167 = new Class304(class647_sub1_sub3_sub1_sub1.aClass300_12175);
				class647_sub1_sub3_sub1_sub1.aClass304_12167.anIntArray3345[i_113_] = i_114_;
				class647_sub1_sub3_sub1_sub1.aClass304_12167.aShortArray3344[i_113_] = (short) i_112_;
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4477 == class116.currentPacket) {
			if (!client.aBool11302) {
				try {
					int i_115_ = buffer.readUnsignedByteC(1585534599);
					int i_116_ = buffer.readUnsignedByteC(1138519113);
					int i_117_ = buffer.readUnsigned128Byte(1754896924);
					client.aClass220_11301.method4107(i_117_, -647880304).method4058(i_115_, i_116_, -1414307217);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -2078547056);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4500) {
			boolean bool = buffer.readUnsignedByte(-1777477256) == 1;
			String string = buffer.readString(-73718377);
			long l = (long) buffer.readUnsignedShort(-1181419020);
			long l_118_ = (long) buffer.read24BitInt(-296598057);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) -15929), buffer.readUnsignedByte(941989764), -956269740));
			int i_119_ = buffer.readUnsignedShort(-1599458389);
			long l_120_ = (l << 32) + l_118_;
			boolean bool_121_ = false;
			Object object = null;
			Class523_Sub19 class523_sub19 = (bool ? Class673.aClass523_Sub19_8611 : Class675.aClass523_Sub19_8632);
			while_134_: do {
				if (null == class523_sub19)
					bool_121_ = true;
				else {
					for (int i_122_ = 0; i_122_ < 100; i_122_++) {
						if (client.aLongArray11175[i_122_] == l_120_) {
							bool_121_ = true;
							break while_134_;
						}
					}
					if (class421.aBool4790 && Class519.method8641(string, -499186512))
						bool_121_ = true;
				}
			} while (false);
			if (!bool_121_) {
				client.aLongArray11175[client.anInt11069 * -435008989] = l_120_;
				client.anInt11069 = -2068990581 * ((1 + client.anInt11069 * -435008989) % 100);
				String string_123_ = Class645.aClass24_8347.method839(i_119_, (byte) 89).method18248(buffer, 469930582);
				int i_124_ = bool ? 42 : 45;
				if (-429816343 * class421.anInt4788 != -1)
					Class644.method10552(i_124_, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1281155507)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((-429816343 * class421.anInt4788), -1306973754)).append(string).toString(), string, string_123_, class523_sub19.aString10484, i_119_, class421, (byte) 54);
				else
					Class644.method10552(i_124_, 0, string, string, string, string_123_, class523_sub19.aString10484, i_119_, class421, (byte) 18);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4330 == class116.currentPacket) {
			int i_125_ = buffer.readUnsignedShortLE((byte) 103);
			byte i_126_ = buffer.readByte((short) -4257);
			Class220.method4131(-17414964);
			Class53_Sub16.method17217(i_125_, i_126_, 343742297);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4343 == class116.currentPacket) {
			int i_127_ = buffer.readUnsignedIntLE((short) -25764);
			int i_128_ = buffer.readUnsignedInt((byte) -126);
			int i_129_ = buffer.readUnsignedShortLE((byte) 53);
			Class220.method4131(-17414964);
			Class149.method2518(i_128_, 3, i_129_, i_127_, -2052138998);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4353 == class116.currentPacket) {
			Player.method18698(Class412.aClass412_4546, (byte) -65);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.PLAYER_OPTION_PACKET) {
			int slot = buffer.readUnsignedByte128(-810763044);
			int id = buffer.readUnsignedShort(-1441197610);
			if (id == 65535)
				id = -1;
			int isTopOption = buffer.readUnsignedByte(431106730);
			String option = buffer.readString(-1877889218);
			if (slot >= 1 && slot <= 8) {
				if (option.equalsIgnoreCase("null"))
					option = null;
				client.aStringArray11316[slot - 1] = option;
				client.anIntArray11167[slot - 1] = id;
				client.aBoolArray11169[slot - 1] = isTopOption == 0;
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SET_SPRITE_PACKET == class116.currentPacket) {
			int i_133_ = buffer.readUnsignedIntV2((short) 23503);
			int i_134_ = buffer.readUnsignedIntV2((short) 17527);
			Class220.method4131(-17414964);
			Class250 class250 = Class188.method3592(i_134_, -1010313502);
			class250.anInt2691 = i_133_ * 219232365;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SEND_OBJECT_PACKET == class116.currentPacket) {
			Player.method18698(Class412.SEND_OBJECT, (byte) -50);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4384 == class116.currentPacket) {
			if (Class710.aBool8840 && null != Class310.aFrame3385)
				Class82.method1585(Class449.aClass523_Sub33_4946.aClass687_Sub5_10632.method16784(-57274443), -1, -1, false, -1011984276);
			byte[] is = new byte[class116.anInt1421 * -1372959327];
			buffer.method18222(is, 0, -1372959327 * class116.anInt1421, (byte) 9);
			String string = Class651.method10636(is, 0, -1372959327 * class116.anInt1421, -1210151419);
			Class331.method5825(string, true, client.aBool10996, 1902580751);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4367 == class116.currentPacket) {
			client.anInt11290 = 558579797 * client.anInt11251;
			int i_135_ = 2349011 * buffer.anInt10661;
			int i_136_ = buffer.readUnsignedShort(-1897180840);
			boolean bool = buffer.readUnsignedByte(377635986) == 1;
			Class229 class229 = Class461.aClass218_5122.method3967(i_136_, (byte) 2);
			Class4 class4 = class229.method4193(2074198654);
			if (class4 == null || bool) {
				class229.method4207(client.anInterface27_11046, -203707259);
				class4 = class229.method4193(2137755166);
			}
			while ((-1372959327 * class116.anInt1421 - (2349011 * buffer.anInt10661 - i_135_)) > 0) {
				Class426 class426 = Class669.aClass98_Sub1_Sub1_8582.refreshNIS(buffer, 764731950);
				class4.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1992246242);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.VAR_SMALL_STRING_PACKET == class116.currentPacket) {
			int i_137_ = buffer.readUnsignedShort(-498643378);
			String string = buffer.readString(-1790890281);
			Class220.method4131(-17414964);
			Class449.method7267(i_137_, string, (byte) -11);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.REMOVE_OBJECT_PACKET) {
			Player.method18698(Class412.REMOVE_OBJECT, (byte) -46);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4379 == class116.currentPacket) {
			int i_138_ = buffer.readUnsignedByteC(542194851);
			int i_139_ = buffer.readUnsignedByteC(-2106878335);
			int i_140_ = buffer.readUnsignedByte(87682395);
			int i_141_ = buffer.readUnsignedShort128((short) 12756) << 2;
			int i_142_ = buffer.readUnsigned128Byte(2109187461);
			Class220.method4131(-17414964);
			Class202.method3699(i_138_, i_142_, i_141_, i_139_, i_140_, true, -1872803936);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4336) {
			int i_143_ = buffer.readUnsignedByte(1613710452);
			Class699 class699 = ((Class699) Class334.method5910(Class168.method2884(-97436919), i_143_, -130161670));
			if (class699 == null)
				class699 = Class699.aClass699_8765;
			Class673.method13725(class699, (short) 255);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4380) {
			client.anInt11014 = -217609959 * client.anInt11251;
			boolean bool = buffer.readUnsignedByte(290335513) == 1;
			Class352 class352 = new Class352(buffer);
			Class523_Sub19 class523_sub19;
			if (bool)
				class523_sub19 = Class673.aClass523_Sub19_8611;
			else
				class523_sub19 = Class675.aClass523_Sub19_8632;
			class352.method6181(class523_sub19, 1785919734);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4439) {
			int i_144_ = buffer.readUnsignedInt((byte) -73);
			int i_145_ = buffer.readUnsignedInt((byte) -26);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4266, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV2(i_144_, -984673975);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeInt(i_145_, -776634594);
			class523_sub22.aClass523_Sub34_Sub2_10525.write128Byte(client.anInt5662 * -1307622225, -159492164);
			class116.method1974(class523_sub22, (byte) 98);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4375) {
			if (!client.aBool11302) {
				try {
					int i_146_ = buffer.readUnsignedByte(310319532);
					client.aClass220_11301.method4121(i_146_, -1623186464);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1594621659);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.CS_VAR_1_PACKET) {
			int i_147_ = buffer.readUnsignedShort128((short) 10123);
			byte i_148_ = buffer.readByte((short) -3809);
			Class220.method4131(-17414964);
			Class375.method6386(i_147_, i_148_, -831168000);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.ITEM_ON_ICOMPONENT_PACKET) {
			int amount = buffer.readUnsignedInt((byte) -5);
			int hash = buffer.readUnsignedIntLE((short) -3050);
			int id = buffer.readUnsignedShort(-1072258632);
			if (id == 65535)
				id = -1;
			Class220.method4131(-17414964);
			Class298_Sub1.method15555(hash, id, amount, (byte) -80);
			ItemDefinitions definitions = (ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(id, (byte) 108);
			Class212.method3833(hash, -280549515 * definitions.anInt128, 95914633 * definitions.anInt101, -1174947681 * definitions.anInt98, -308086954);
			NPCDefinition.method5517(hash, 136766933 * definitions.anInt118, -354841693 * definitions.anInt117, -1050168005 * definitions.anInt115, -939560974);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4362) {
			Player.method18698(Class412.aClass412_4552, (byte) 117);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT_PACKET) {
			int hash = buffer.readUnsignedInt((byte) -113);
			Class220.method4131(-17414964);
			Class149.method2518(hash, 3, client.anInt11154 * 1109726117, 0, -1976924513);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_COMMAND_PACKET == class116.currentPacket) {
			String string = buffer.readString(-817852027);
			Class264.method4746(string, false, false, 218713764);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SET_PLAYER_INTERFACE_PACKET == class116.currentPacket) {
			int interfaceId = buffer.readUnsignedShort(-847981326);
			int clipped = buffer.readUnsignedByte(2002392581);
			int xtea3 = buffer.readUnsignedIntLE((short) -4073);
			int xtea0 = buffer.readUnsignedInt((byte) -40);
			int xtea1 = buffer.readUnsignedInt((byte) -4);
			int index = buffer.readUnsignedShort128((short) 25527);
			int hash = buffer.readUnsignedIntLE((short) -28166);
			int xtea2 = buffer.readUnsignedIntV2((short) 18169);
			Class220.method4131(-17414964);
			Class45.method1237(hash, new Class523_Sub36_Sub3(interfaceId, clipped, index), new int[] { xtea0, xtea1, xtea2, xtea3 }, false, 581794136);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4449 == class116.currentPacket) {
			int i_161_ = buffer.readUnsignedIntLE((short) -19738);
			int i_162_ = buffer.readUnsignedShortLE128(1911795137);
			Class220.method4131(-17414964);
			Class661.method10908(i_161_, i_162_, (short) -8049);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.TEXT_ON_ICOMPONENT_PACKET) {
			int hash = buffer.readUnsignedInt((byte) -35);
			String string = buffer.readString(404651299);
			Class220.method4131(-17414964);
			Class97.method1775(hash, string, -215635651);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4457 == class116.currentPacket) {
			int i_164_ = buffer.readUnsignedShort128((short) 858);
			int i_165_ = buffer.readUnsignedIntLE((short) -5569);
			Class220.method4131(-17414964);
			Class523_Sub20.method16097(i_165_, i_164_, (short) 255);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4507) {
			int i_166_ = buffer.readUnsignedShort(-28665877);
			if (i_166_ == 65535)
				i_166_ = -1;
			int i_167_ = buffer.readUnsignedByte(-1948469804);
			int i_168_ = buffer.readUnsignedShort(-1157928008);
			int i_169_ = buffer.readUnsignedByte(1197006123);
			int i_170_ = buffer.readUnsignedShort(-1751088293);
			int i_171_ = buffer.readUnsignedShort(-1142155162);
			Class489 class489 = (Class254.aClass217_2743.method3877(Class189.aClass189_2144, Class254.aClass217_2743, i_166_, i_167_, i_169_, Class198.aClass198_2195.method3672((byte) 75), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, i_170_, false, (short) -21290));
			if (null != class489)
				Class254.aClass217_2743.method3860(class489, i_171_, i_168_, 995535488);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SEND_PRIVATE_MESSAGE == class116.currentPacket) {
			String string = buffer.readString(-960100665);
			String string_172_ = (Class55.method1360(Class523_Sub19.decodeHuffman(buffer, -1333717867), -1678762418));
			Class515.method8593(6, 0, string, string, string, string_172_, null, -1765973027);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4372) {
			Class636.aClass149_8300 = new Class149(Class663.aClass98_Sub1_Sub2_8525);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4517) {
			if (!client.aBool11302) {
				try {
					int i_173_ = buffer.readUnsignedByteC(-935171795);
					int i_174_ = buffer.readUnsignedByte128(873166188);
					client.aClass220_11301.method4107(i_173_, -1674431798).method4097(i_174_, (byte) 19);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1530624780);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4451 == class116.currentPacket) {
			Class254.aClass217_2743.method3870(buffer.readUnsignedShort(-1225050047), 41418460);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.ADD_FRIEND_PACKET) {
			while (2349011 * buffer.anInt10661 < class116.anInt1421 * -1372959327) {
				boolean bool = buffer.readUnsignedByte(-1518160268) == 1;
				String string = buffer.readString(273055747);
				String string_175_ = buffer.readString(-718609810);
				int i_176_ = buffer.readUnsignedShort(-663169819);
				int i_177_ = buffer.readUnsignedByte(705328581);
				int i_178_ = buffer.readUnsignedByte(687806164);
				boolean bool_179_ = (i_178_ & 0x2) != 0;
				boolean bool_180_ = (i_178_ & 0x1) != 0;
				String string_181_ = "";
				int i_182_ = -1;
				int i_183_ = 0;
				if (i_176_ > 0) {
					string_181_ = buffer.readString(251663086);
					i_182_ = buffer.readUnsignedByte(-1494636136);
					i_183_ = buffer.readUnsignedInt((byte) -120);
				}
				String string_184_ = buffer.readString(-1899767290);
				for (int i_185_ = 0; i_185_ < client.anInt11287 * 1563815891; i_185_++) {
					Class60 class60 = client.aClass60Array11182[i_185_];
					if (!bool) {
						if (string.equals(class60.aString763)) {
							if (i_176_ != 2036106249 * class60.anInt757) {
								boolean bool_186_ = true;
								for (Class522_Sub5 class522_sub5 = ((Class522_Sub5) client.aClass701_11309.method14087(1706431677)); class522_sub5 != null; class522_sub5 = ((Class522_Sub5) client.aClass701_11309.method14088(1976192860))) {
									if (class522_sub5.aString10342.equals(string)) {
										if (0 != i_176_ && 0 == (class522_sub5.aShort10343)) {
											class522_sub5.method8652((byte) 1);
											bool_186_ = false;
										} else if (0 == i_176_ && 0 != (class522_sub5.aShort10343)) {
											class522_sub5.method8652((byte) -26);
											bool_186_ = false;
										}
									}
								}
								if (bool_186_)
									client.aClass701_11309.method14084(new Class522_Sub5(string, i_176_), -1198593344);
								class60.anInt757 = -1050916295 * i_176_;
							}
							class60.aString764 = string_175_;
							class60.aString759 = string_181_;
							class60.anInt760 = 2127188227 * i_177_;
							class60.anInt758 = 1037626471 * i_182_;
							class60.aBool762 = bool_179_;
							class60.aBool761 = bool_180_;
							class60.aString765 = string_184_;
							class60.anInt756 = i_183_ * 1042481901;
							string = null;
							break;
						}
					} else if (string_175_.equals(class60.aString763)) {
						class60.aString763 = string;
						class60.aString764 = string_175_;
						string = null;
						break;
					}
				}
				if (null != string && client.anInt11287 * 1563815891 < 400) {
					Class60 class60 = new Class60();
					client.aClass60Array11182[1563815891 * client.anInt11287] = class60;
					class60.aString763 = string;
					class60.aString764 = string_175_;
					class60.anInt757 = -1050916295 * i_176_;
					class60.aString759 = string_181_;
					class60.anInt760 = i_177_ * 2127188227;
					class60.anInt758 = 1037626471 * i_182_;
					class60.aBool762 = bool_179_;
					class60.aBool761 = bool_180_;
					class60.aString765 = string_184_;
					class60.anInt756 = i_183_ * 1042481901;
					client.anInt11287 += -1975173029;
				}
			}
			client.anInt11235 = 1106742526;
			client.anInt11183 = client.anInt11251 * -684273789;
			boolean bool = false;
			int i_187_ = client.anInt11287 * 1563815891;
			do {
				if (i_187_ <= 0)
					break;
				bool = true;
				i_187_--;
				for (int i_188_ = 0; i_188_ < i_187_; i_188_++) {
					boolean bool_189_ = false;
					Class60 class60 = client.aClass60Array11182[i_188_];
					Class60 class60_190_ = client.aClass60Array11182[1 + i_188_];
					if ((Class155.aClass1_1735.anInt10 * -1126141351 != 2036106249 * class60.anInt757) && (-1126141351 * Class155.aClass1_1735.anInt10 == 2036106249 * class60_190_.anInt757))
						bool_189_ = true;
					if (!bool_189_ && class60.anInt757 * 2036106249 == 0 && 0 != class60_190_.anInt757 * 2036106249)
						bool_189_ = true;
					if (!bool_189_ && !class60.aBool762 && class60_190_.aBool762)
						bool_189_ = true;
					if (!bool_189_ && !class60.aBool761 && class60_190_.aBool761)
						bool_189_ = true;
					if (bool_189_) {
						Class60 class60_191_ = client.aClass60Array11182[i_188_];
						client.aClass60Array11182[i_188_] = client.aClass60Array11182[i_188_ + 1];
						client.aClass60Array11182[i_188_ + 1] = class60_191_;
						bool = false;
					}
				}
			} while (!bool);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4340 == class116.currentPacket) {
			int i_192_ = buffer.readUnsignedShort(-1916499825);
			if (65535 == i_192_)
				i_192_ = -1;
			int i_193_ = buffer.readUnsignedByte(-1129435451);
			int i_194_ = buffer.readUnsignedShort(-138522850);
			int i_195_ = buffer.readUnsignedByte(-1097680326);
			int i_196_ = buffer.readUnsignedShort(-101720699);
			Class254.aClass217_2743.method3854(Class189.aClass189_2144, i_192_, i_193_, i_195_, Class198.aClass198_2195.method3672((byte) 27), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, i_196_, i_194_, -1009017376);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4501 == class116.currentPacket) {
			client.aClass614_11032 = ((Class614) Class334.method5910(Class614.method10056((byte) -100), buffer.readUnsigned128Byte(1292723526), -1879507082));
			if (null == client.aClass614_11032)
				client.aClass614_11032 = Class614.aClass614_8022;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4483 == class116.currentPacket) {
			int i_197_ = buffer.readUnsignedIntV1(-1908553945);
			int i_198_ = buffer.readUnsignedIntV1(-1908553945);
			Class220.method4131(-17414964);
			Class9_Sub1.method17195(i_198_, i_197_, -2070755641);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4387) {
			if (!client.aBool11302) {
				try {
					int i_199_ = buffer.readUnsignedByte(-1204498824);
					int i_200_ = buffer.readUnsignedByte(-2081494681);
					client.aClass220_11301.method4107(i_200_, -1509039747).method4056(i_199_, -1236619530);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1408541246);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4456 == class116.currentPacket) {
			int i_201_ = buffer.readUnsignedShort(-1008948235);
			Class254.aClass217_2743.method3893(i_201_, (byte) -86);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4471) {
			if (!client.aBool11302) {
				try {
					int i_202_ = buffer.readUnsignedByteC(1169579487);
					boolean bool = buffer.readUnsigned128Byte(1764237813) == 1;
					int i_203_ = buffer.readUnsignedByte(145639242);
					client.aClass220_11301.method4107(i_203_, -1231011161).method4046(i_202_, bool, -1915358434);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1873965571);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.GAME_SCENE_PACKET == class116.currentPacket) {
			Class523_Sub34_Sub2 class523_sub34_sub2_204_ = new Class523_Sub34_Sub2(-1372959327 * class116.anInt1421);
			System.arraycopy((class116.aClass523_Sub34_Sub2_1431.aByteArray10658), (2349011 * class116.aClass523_Sub34_Sub2_1431.anInt10661), class523_sub34_sub2_204_.aByteArray10658, 0, -1372959327 * class116.anInt1421);
			Class286.method5152((byte) -97);
			if (Class449.aClass523_Sub33_4946.aClass687_Sub29_10647.method16971((byte) 50) == 1)
				Class329_Sub2.aClass511_10050.method8556(new Class496(Class500.aClass500_5575, class523_sub34_sub2_204_), (short) 3787);
			else
				client.aClass505_11019.method8368(new Class496(Class500.aClass500_5575, class523_sub34_sub2_204_), 1235970069);
			class116.currentPacket = null;
			return false;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4398) {
			boolean bool = buffer.readUnsignedByte(225326672) == 1;
			String string = buffer.readString(-1132131931);
			String string_205_ = string;
			if (bool)
				string_205_ = buffer.readString(-1309140983);
			String string_206_ = buffer.readString(-420926634);
			long l = (long) buffer.readUnsignedShort(-1967259139);
			long l_207_ = (long) buffer.read24BitInt(1454784360);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) 25002), buffer.readUnsignedByte(-1598017131), 276554630));
			long l_208_ = (l << 32) + l_207_;
			boolean bool_209_ = false;
			while_135_: do {
				for (int i_210_ = 0; i_210_ < 100; i_210_++) {
					if (client.aLongArray11175[i_210_] == l_208_) {
						bool_209_ = true;
						break while_135_;
					}
				}
				if (class421.aBool4790) {
					if (client.aBool11160 && !client.aBool11161 || client.aBool11164)
						bool_209_ = true;
					else if (Class519.method8641(string_205_, -229386075))
						bool_209_ = true;
				}
			} while (false);
			if (!bool_209_) {
				client.aLongArray11175[client.anInt11069 * -435008989] = l_208_;
				client.anInt11069 = (client.anInt11069 * -435008989 + 1) % 100 * -2068990581;
				String string_211_ = (Class55.method1360(Class523_Sub19.decodeHuffman(buffer, 1081173527), -1678762418));
				if (class421.anInt4788 * -429816343 != -1)
					Class644.method10552(9, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1397565208)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -560874748)).append(string_205_).toString(), string, string_211_, string_206_, -1, class421, (byte) 105);
				else
					Class644.method10552(9, 0, string, string_205_, string, string_211_, string_206_, -1, class421, (byte) 120);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4373) {
			int i_212_ = buffer.readUnsignedShortLE((byte) 61);
			int i_213_ = buffer.readUnsignedByte128(-1870141341);
			Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9757((Class309) Class539.aClass53_Sub3_7213.getDefinition(i_212_, (byte) 113), i_213_, 2138772399);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4414) {
			client.anInt11232 = client.anInt11251 * 1307894601;
			boolean bool = buffer.readUnsignedByte(-1596088340) == 1;
			Class341 class341 = new Class341(buffer);
			Class334 class334;
			if (bool)
				class334 = Class194_Sub6.aClass334_9900;
			else
				class334 = Class143.aClass334_1693;
			class341.method5983(class334, -1966090980);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4381 == class116.currentPacket) {
			client.anInt11236 = client.anInt11251 * -1819053623;
			Class224 class224 = new Class224(buffer, client.anInterface27_11046);
			class224.method4150(Class461.aClass218_5122, -700619825);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.SLOT_CONTAINER_UPDATE_PACKET) {
			int key = buffer.readUnsignedShort(-1047249926);
			int flag = buffer.readUnsignedByte(-267206787);
			boolean negativeKey = (flag & 0x1) != 0;
			boolean nis = (flag & 0x2) != 0;
			Class60.method1410(key, negativeKey, 586929566);
			int i_217_ = buffer.readUnsignedShort(-1053880719);
			for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
				int i_219_ = buffer.readUnsignedShort(-604550555);
				int i_220_ = buffer.readUnsignedByte(-1258472376);
				if (255 == i_220_)
					i_220_ = buffer.readUnsignedInt((byte) -70);
				Class4 class4 = null;
				if (nis) {
					int i_221_ = buffer.readUnsignedByte(1690922185);
					if (i_221_ > 0) {
						class4 = new Class4(Class602.aClass98_Sub1_Sub2_7933);
						while (i_221_-- > 0) {
							Class426 class426 = (Class602.aClass98_Sub1_Sub2_7933.refreshNIS(buffer, 106491928));
							class4.method14(class426.anInt4821 * -408785679, class426.anObject4822, -2136812546);
						}
					}
				}
				Class518.setContainerItem(key, i_218_, i_219_ - 1, i_220_, class4, negativeKey, (byte) 67);
			}
			client.anIntArray11219[(client.anInt11220 += 462942153) * 1934318201 - 1 & 0x3f] = key;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4400) {
			int i_222_ = buffer.readUnsignedIntV2((short) 16574);
			if (i_222_ != -2122979607 * Class450.anInt4955) {
				Class450.anInt4955 = i_222_ * 242962777;
				Class486.method7941(Class572.aClass572_7670, -1, -1, -886052652);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4478) {
			boolean bool = buffer.readUnsignedByte(-253856559) == 1;
			byte[] is = new byte[-1372959327 * class116.anInt1421 - 1];
			buffer.method16298(is, 0, (class116.anInt1421 * -1372959327 - 1), (byte) -51);
			Class683.method13864(bool, is, 743474259);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4492) {
			int i_223_ = buffer.readUnsignedShort(-1058442425);
			int i_224_ = buffer.readUnsignedIntV2((short) 23735);
			Class220.method4131(-17414964);
			Class53_Sub16.method17217(i_223_, i_224_, 1630710235);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4495 == class116.currentPacket) {
			Class352.method6190(buffer.readString(-2083606890), -1081623124);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4345 == class116.currentPacket) {
			Class636.aClass149_8300 = null;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4401) {
			int i_225_ = buffer.readUnsignedIntLE((short) -14558);
			Class220.method4131(-17414964);
			if (i_225_ == -1) {
				Class697.anInt8764 = -763239385;
				Class59.anInt755 = 1325954419;
			} else {
				Class592 class592 = client.aClass505_11019.method8242(55538902);
				int i_226_ = i_225_ >> 14 & 0x3fff;
				int i_227_ = i_225_ & 0x3fff;
				i_226_ -= 235453015 * class592.localX;
				if (i_226_ < 0)
					i_226_ = 0;
				else if (i_226_ >= client.aClass505_11019.method8292((byte) 86))
					i_226_ = client.aClass505_11019.method8292((byte) 73);
				i_227_ -= class592.localY * 1704054549;
				if (i_227_ < 0)
					i_227_ = 0;
				else if (i_227_ >= client.aClass505_11019.method8235(2049659906))
					i_227_ = client.aClass505_11019.method8235(2083905674);
				Class697.anInt8764 = (256 + (i_226_ << 9)) * 763239385;
				Class59.anInt755 = -1325954419 * ((i_227_ << 9) + 256);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CHUNK_STREAM_PACKET == class116.currentPacket) {
			Class523_Sub30.anInt10571 = ((buffer.readByteC(-1270473922) << 3) * 877261249);
			Class369.anInt3884 = (buffer.readByte128(1661172407) << 3) * -1618062701;
			Class601.anInt7851 = buffer.readUnsignedByte(-1249584215) * 1365891833;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4443 == class116.currentPacket) {
			Class523_Sub30.anInt10571 = ((buffer.readByteC(-1270473922) << 3) * 877261249);
			Class369.anInt3884 = ((buffer.readByte((short) -21862) << 3) * -1618062701);
			Class601.anInt7851 = buffer.readUnsigned128Byte(1159551914) * 1365891833;
			while (2349011 * buffer.anInt10661 < class116.anInt1421 * -1372959327) {
				Class412 class412 = (Class173.method2901((byte) -74)[buffer.readUnsignedByte(-1488472145)]);
				Player.method18698(class412, (byte) 15);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4464) {
			int i_228_ = buffer.readUnsignedShortLE128(1998152847);
			if (i_228_ == 65535)
				i_228_ = -1;
			int i_229_ = buffer.readUnsignedShort128((short) 3180);
			int i_230_ = buffer.readUnsignedShort128((short) 11043);
			if (i_230_ == 65535)
				i_230_ = -1;
			int i_231_ = buffer.readUnsignedIntV1(-1908553945);
			Class220.method4131(-17414964);
			for (int i_232_ = i_228_; i_232_ <= i_230_; i_232_++) {
				long l = (long) i_232_ + ((long) i_231_ << 32);
				Class523_Sub13 class523_sub13 = (Class523_Sub13) client.aClass14_11242.method741(l);
				Class523_Sub13 class523_sub13_233_;
				if (class523_sub13 == null) {
					if (i_232_ == -1)
						class523_sub13_233_ = new Class523_Sub13((Class188.method3592(i_231_, -1410357433).aClass523_Sub13_2559.anInt10450) * 747608249, i_229_);
					else
						class523_sub13_233_ = new Class523_Sub13(0, i_229_);
				} else {
					class523_sub13_233_ = new Class523_Sub13((class523_sub13.anInt10450 * 747608249), i_229_);
					class523_sub13.method8661(607052656);
				}
				client.aClass14_11242.method738(class523_sub13_233_, l);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4513 == class116.currentPacket) {
			Class191.method3626(buffer, -1372959327 * class116.anInt1421, 1304959141);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.VAR_1_PACKET == class116.currentPacket) {
			int i_234_ = buffer.readUnsignedShortLE128(1496954358);
			byte i_235_ = buffer.readByteC(-1270473922);
			Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9763((Class159) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i_234_, (byte) 119), i_235_, -1806202437);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4485 == class116.currentPacket) {
			if (!client.aBool11302) {
				try {
					byte i_236_ = buffer.readByteC(-1270473922);
					int i_237_ = buffer.readUnsignedIntV2((short) 17096);
					int i_238_ = buffer.readUnsignedByte(540257930);
					client.aClass220_11301.method4107(i_238_, -1431009447).method4049(i_237_, i_236_, 523365091);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1505773220);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.STOP_CAMERA_SHAKE_PACKET == class116.currentPacket) {
			Class220.method4131(-17414964);
			Class313.method5656(Class557.method9224(-1496137026), 743172261);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4446) {
			Class303.anInt3343 = buffer.method16286(-1016535194) * 1728814959;
			client.aBool11160 = buffer.readUnsignedByte(-1327501813) == 1;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.FRIENDS_CHAT_PACKET) {
			client.anInt11048 = client.anInt11251 * -1658435485;
			if (-1372959327 * class116.anInt1421 == 0) {
				client.friendsChatName = null;
				client.friendsChatOwner = null;
				Class365.anInt3866 = 0;
				Class99.aClass115Array1232 = null;
				class116.currentPacket = null;
				return true;
			}
			client.friendsChatOwner = buffer.readString(-1443654962);
			boolean bool = buffer.readUnsignedByte(914697959) == 1;
			if (bool)
				buffer.readString(-1465088802);
			client.friendsChatName = buffer.readString(-1800593681);
			Class86.friendsChatKickRequirement = buffer.readByte((short) -13007);
			int count = buffer.readUnsignedByte(-1883699356);
			if (count == 255) {
				class116.currentPacket = null;
				return true;
			}
			Class365.anInt3866 = count * -1502801031;
			Class115[] class115s = new Class115[100];
			for (int i_240_ = 0; i_240_ < 797304521 * Class365.anInt3866; i_240_++) {
				class115s[i_240_] = new Class115();
				class115s[i_240_].aString1409 = buffer.readString(-1535189675);
				bool = buffer.readUnsignedByte(1496158489) == 1;
				if (bool)
					class115s[i_240_].aString1407 = buffer.readString(-1049663095);
				else
					class115s[i_240_].aString1407 = class115s[i_240_].aString1409;
				class115s[i_240_].aString1410 = Class226.method4163(class115s[i_240_].aString1407, Class112.aClass73_1351, (byte) 48);
				class115s[i_240_].anInt1406 = (buffer.readUnsignedShort(-1434825231) * -973627117);
				class115s[i_240_].aByte1411 = buffer.readByte((short) -32591);
				class115s[i_240_].aString1408 = buffer.readString(492755071);
				if (class115s[i_240_].aString1407.equals(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.username))
					Class509.aByte5726 = class115s[i_240_].aByte1411;
			}
			boolean bool_241_ = false;
			int i_242_ = 797304521 * Class365.anInt3866;
			do {
				if (i_242_ <= 0)
					break;
				bool_241_ = true;
				i_242_--;
				for (int i_243_ = 0; i_243_ < i_242_; i_243_++) {
					if (class115s[i_243_].aString1410.compareTo(class115s[1 + i_243_].aString1410) > 0) {
						Class115 class115 = class115s[i_243_];
						class115s[i_243_] = class115s[1 + i_243_];
						class115s[i_243_ + 1] = class115;
						bool_241_ = false;
					}
				}
			} while (!bool_241_);
			Class99.aClass115Array1232 = class115s;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4515 == class116.currentPacket) {
			client.anInt11236 = client.anInt11251 * -1819053623;
			if (-1372959327 * class116.anInt1421 == 0)
				Class461.aClass218_5122 = null;
			else
				Class461.aClass218_5122 = new Class218(0L, buffer, true, client.anInterface27_11046);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4339) {
			Player.method18698(Class412.aClass412_4551, (byte) 40);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.DYNAMIC_REGION_PACKET == class116.currentPacket) {
			Class523_Sub34_Sub2 class523_sub34_sub2_244_ = new Class523_Sub34_Sub2(-1372959327 * class116.anInt1421);
			System.arraycopy((class116.aClass523_Sub34_Sub2_1431.aByteArray10658), (class116.aClass523_Sub34_Sub2_1431.anInt10661 * 2349011), class523_sub34_sub2_244_.aByteArray10658, 0, -1372959327 * class116.anInt1421);
			Class286.method5152((byte) -87);
			if (Class449.aClass523_Sub33_4946.aClass687_Sub29_10647.method16971((byte) -72) == 1)
				Class329_Sub2.aClass511_10050.method8556(new Class496(Class500.aClass500_5571, class523_sub34_sub2_244_), (short) 23276);
			else
				client.aClass505_11019.method8368(new Class496(Class500.aClass500_5571, class523_sub34_sub2_244_), 1235970069);
			class116.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass409_4346 == class116.currentPacket) {
			boolean bool = buffer.readUnsignedByte(1458956768) == 1;
			String string = buffer.readString(-454969113);
			String string_245_ = string;
			if (bool)
				string_245_ = buffer.readString(108882893);
			String string_246_ = buffer.readString(515061759);
			long l = (long) buffer.readUnsignedShort(-1981824496);
			long l_247_ = (long) buffer.read24BitInt(-2215125);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) 9103), buffer.readUnsignedByte(-1806129885), 985967964));
			int i_248_ = buffer.readUnsignedShort(-72584430);
			long l_249_ = (l << 32) + l_247_;
			boolean bool_250_ = false;
			while_136_: do {
				for (int i_251_ = 0; i_251_ < 100; i_251_++) {
					if (client.aLongArray11175[i_251_] == l_249_) {
						bool_250_ = true;
						break while_136_;
					}
				}
				if (class421.aBool4790 && Class519.method8641(string_245_, -1094004769))
					bool_250_ = true;
			} while (false);
			if (!bool_250_) {
				client.aLongArray11175[-435008989 * client.anInt11069] = l_249_;
				client.anInt11069 = (1 + client.anInt11069 * -435008989) % 100 * -2068990581;
				String string_252_ = Class645.aClass24_8347.method839(i_248_, (byte) 38).method18248(buffer, 1015992390);
				if (-1 != class421.anInt4788 * -429816343)
					Class644.method10552(20, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -57072622)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1937448888)).append(string_245_).toString(), string, string_252_, string_246_, i_248_, class421, (byte) 119);
				else
					Class644.method10552(20, 0, string, string_245_, string, string_252_, string_246_, i_248_, class421, (byte) 26);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4434) {
			boolean bool = buffer.readUnsignedByte(515708823) == 1;
			if (bool)
				Class313.method5656(2, 743172261);
			else
				Class313.method5656(1, 743172261);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4390 == class116.currentPacket) {
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4338 == class116.currentPacket) {
			int i_253_ = buffer.readUnsignedShort128((short) 17635);
			if (65535 == i_253_)
				i_253_ = -1;
			Class254.aClass217_2743.method3896(i_253_, 255, -548505697);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4493) {
			int i_254_ = buffer.readUnsignedByte(-425409400);
			int i_255_ = buffer.readBigSmart((byte) -40);
			if (client.aClass540Array11018[i_254_] != null) {
				client.aClass540Array11018[i_254_].method8962(client.aClass505_11019.method8241((byte) -47), (byte) 33);
				client.aClass540Array11018[i_254_] = null;
			}
			if (i_255_ != -1)
				client.aClass540Array11018[i_254_] = new Class540(Class31.aClass178_303, buffer, i_255_);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.HIDE_ICOMPONENT_PACKET == class116.currentPacket) {
			int hash = buffer.readUnsignedIntV2((short) 19622);
			int hidden = buffer.readUnsigned128Byte(1238552937);
			Class220.method4131(-17414964);
			Class198.method3679(hash, hidden, (short) 255);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.REMOVE_GROUND_ITEM_PACKET == class116.currentPacket) {
			Player.method18698(Class412.REMOVE_GROUND_ITEM, (byte) 32);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4445) {
			int i_258_ = buffer.readUnsignedShort(-1608005338);
			int i_259_ = buffer.readUnsignedShort(-177984241);
			int i_260_ = buffer.readUnsignedShort(-263427399);
			Class220.method4131(-17414964);
			if (null != Class31.aClass242Array302[i_258_]) {
				for (int i_261_ = i_259_; i_261_ < i_260_; i_261_++) {
					int i_262_ = buffer.read24BitInt(-1333890047);
					if (i_261_ < (Class31.aClass242Array302[i_258_].aClass250Array2457).length && null != (Class31.aClass242Array302[i_258_].aClass250Array2457[i_261_]))
						Class31.aClass242Array302[i_258_].aClass250Array2457[i_261_].anInt2527 = 2032168729 * i_262_;
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4488 == class116.currentPacket) {
			String string = buffer.readString(-1518370728);
			boolean bool = buffer.readUnsignedByte(1550735591) == 1;
			String string_263_;
			if (bool)
				string_263_ = buffer.readString(-1932747053);
			else
				string_263_ = string;
			int i_264_ = buffer.readUnsignedShort(-898048594);
			byte i_265_ = buffer.readByte((short) -8084);
			boolean bool_266_ = false;
			if (i_265_ == -128)
				bool_266_ = true;
			if (bool_266_) {
				if (0 == Class365.anInt3866 * 797304521) {
					class116.currentPacket = null;
					return true;
				}
				boolean bool_267_ = false;
				int i_268_;
				for (i_268_ = 0; (i_268_ < Class365.anInt3866 * 797304521 && (!Class99.aClass115Array1232[i_268_].aString1407.equals(string_263_) || i_264_ != (Class99.aClass115Array1232[i_268_].anInt1406) * 533287195)); i_268_++) {
					/* empty */
				}
				if (i_268_ < Class365.anInt3866 * 797304521) {
					for (/**/; i_268_ < 797304521 * Class365.anInt3866 - 1; i_268_++)
						Class99.aClass115Array1232[i_268_] = Class99.aClass115Array1232[1 + i_268_];
					Class365.anInt3866 -= -1502801031;
					Class99.aClass115Array1232[Class365.anInt3866 * 797304521] = null;
				}
			} else {
				String string_269_ = buffer.readString(626215946);
				Class115 class115 = new Class115();
				class115.aString1409 = string;
				class115.aString1407 = string_263_;
				class115.aString1410 = Class226.method4163(class115.aString1407, Class112.aClass73_1351, (byte) 44);
				class115.anInt1406 = i_264_ * -973627117;
				class115.aByte1411 = i_265_;
				class115.aString1408 = string_269_;
				int i_270_;
				for (i_270_ = 797304521 * Class365.anInt3866 - 1; i_270_ >= 0; i_270_--) {
					int i_271_ = Class99.aClass115Array1232[i_270_].aString1410.compareTo(class115.aString1410);
					if (0 == i_271_) {
						Class99.aClass115Array1232[i_270_].anInt1406 = i_264_ * -973627117;
						Class99.aClass115Array1232[i_270_].aByte1411 = i_265_;
						Class99.aClass115Array1232[i_270_].aString1408 = string_269_;
						if (string_263_.equals(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.username))
							Class509.aByte5726 = i_265_;
						client.anInt11048 = client.anInt11251 * -1658435485;
						class116.currentPacket = null;
						return true;
					}
					if (i_271_ < 0)
						break;
				}
				if (797304521 * Class365.anInt3866 >= Class99.aClass115Array1232.length) {
					class116.currentPacket = null;
					return true;
				}
				for (int i_272_ = Class365.anInt3866 * 797304521 - 1; i_272_ > i_270_; i_272_--)
					Class99.aClass115Array1232[i_272_ + 1] = Class99.aClass115Array1232[i_272_];
				if (0 == Class365.anInt3866 * 797304521)
					Class99.aClass115Array1232 = new Class115[100];
				Class99.aClass115Array1232[1 + i_270_] = class115;
				Class365.anInt3866 += -1502801031;
				if (string_263_.equals(Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.username))
					Class509.aByte5726 = i_265_;
			}
			client.anInt11048 = -1658435485 * client.anInt11251;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.GAME_MESSAGE_PACKET) {
			int i_273_ = buffer.readUnsignedSmart(368514876);
			int i_274_ = buffer.readUnsignedInt((byte) -39);
			int i_275_ = buffer.readUnsignedByte(-1513304809);
			String string = "";
			String string_276_ = string;
			if ((i_275_ & 0x1) != 0) {
				string = buffer.readString(-375306936);
				if (0 != (i_275_ & 0x2))
					string_276_ = buffer.readString(87833865);
				else
					string_276_ = string;
			}
			String string_277_ = buffer.readString(-663075270);
			if (99 == i_273_)
				Class485.method7932(string_277_, (byte) -26);
			else if (98 == i_273_)
				Class500.method8122(string_277_, 1186383188);
			else {
				if (!string_276_.equals("") && Class519.method8641(string_276_, -772918016)) {
					class116.currentPacket = null;
					return true;
				}
				Class515.method8593(i_273_, i_274_, string, string_276_, string, string_277_, null, 148152477);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4502 == class116.currentPacket) {
			int toSlot = buffer.readUnsignedIntV2((short) 20882);
			int fromId = buffer.readUnsignedIntV1(-1908553945);
			Class220.method4131(-17414964);
			Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method741((long) fromId));
			Class523_Sub36 class523_sub36_280_ = ((Class523_Sub36) client.aClass14_11187.method741((long) toSlot));
			if (class523_sub36_280_ != null)
				Class579.method9657(class523_sub36_280_, (null == class523_sub36 || ((-1444773101 * class523_sub36_280_.anInt10666) != (-1444773101 * class523_sub36.anInt10666))), false, -190446111);
			if (class523_sub36 != null) {
				class523_sub36.method8661(607052656);
				client.aClass14_11187.method738(class523_sub36, (long) toSlot);
			}
			Class250 class250 = Class188.method3592(fromId, -1806021736);
			if (class250 != null)
				Class523_Sub14.method15991(class250, (byte) -91);
			class250 = Class188.method3592(toSlot, -557376317);
			if (class250 != null) {
				Class523_Sub14.method15991(class250, (byte) -26);
				Class644.method10553((Class31.aClass242Array302[(-1363815505 * class250.anInt2585 >>> 16)]), class250, true, (byte) -97);
			}
			if (-1 != -1614846429 * client.anInt11186)
				Class562.method9466(client.anInt11186 * -1614846429, 1, 422538018);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.CAMERA_SHAKE_PACKET) {
			int i_281_ = buffer.readUnsignedByte128(1172324326);
			int i_282_ = buffer.readUnsignedByte128(-946185446);
			int i_283_ = buffer.readUnsignedShort(-443742006);
			int slotId = buffer.readUnsignedByte(505854915);
			int i_285_ = buffer.readUnsignedByte(231012539);
			Class220.method4131(-17414964);
			client.aBoolArray11269[slotId] = true;
			client.anIntArray10998[slotId] = i_282_;
			client.anIntArray11271[slotId] = i_285_;
			client.anIntArray11203[slotId] = i_281_;
			client.anIntArray11273[slotId] = i_283_;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4382 == class116.currentPacket) {
			if (!client.aBool11302) {
				try {
					int i_286_ = buffer.readUnsignedByte128(-1824310348);
					int i_287_ = buffer.readUnsignedByteC(-1576083164);
					int i_288_ = buffer.readUnsignedByteC(1429253018);
					client.aClass220_11301.method4107(i_288_, -1404457710).method4060(i_287_, i_286_, null, 505418394);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1643506722);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.VAR_BIG_STRING_PACKET) {
			String string = buffer.readString(324589295);
			int i_289_ = buffer.readUnsignedShort128((short) 24636);
			Class220.method4131(-17414964);
			Class449.method7267(i_289_, string, (byte) 97);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4511 == class116.currentPacket) {
			if (-1 != -1614846429 * client.anInt11186)
				Class562.method9466(client.anInt11186 * -1614846429, 0, -864654222);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.HINT_ICON_PACKET) {
			int i_290_ = buffer.readUnsignedByte(201537542);
			int i_291_ = i_290_ >> 5;
			int i_292_ = i_290_ & 0x1f;
			if (0 == i_292_) {
				client.aClass111Array11017[i_291_] = null;
				class116.currentPacket = null;
				return true;
			}
			Class111 class111 = new Class111();
			class111.anInt1334 = i_292_ * -858546083;
			class111.anInt1344 = buffer.readUnsignedByte(1031496269) * -1086988711;
			if (class111.anInt1344 * 309561833 >= 0 && (309561833 * class111.anInt1344 < Class566.aClass148Array7606.length)) {
				if (239678453 * class111.anInt1334 == 1 || 10 == class111.anInt1334 * 239678453) {
					class111.anInt1336 = (buffer.readUnsignedShort(-974362741) * -1169395211);
					class111.anInt1343 = (buffer.readUnsignedShort(-1036601583) * 314538177);
					buffer.anInt10661 += 759062892;
				} else if (239678453 * class111.anInt1334 >= 2 && 239678453 * class111.anInt1334 <= 6) {
					if (2 == class111.anInt1334 * 239678453) {
						class111.anInt1338 = 859358976;
						class111.anInt1339 = 362098944;
					}
					if (class111.anInt1334 * 239678453 == 3) {
						class111.anInt1338 = 0;
						class111.anInt1339 = 362098944;
					}
					if (class111.anInt1334 * 239678453 == 4) {
						class111.anInt1338 = 1718717952;
						class111.anInt1339 = 362098944;
					}
					if (239678453 * class111.anInt1334 == 5) {
						class111.anInt1338 = 859358976;
						class111.anInt1339 = 0;
					}
					if (class111.anInt1334 * 239678453 == 6) {
						class111.anInt1338 = 859358976;
						class111.anInt1339 = 724197888;
					}
					class111.anInt1334 = -1717092166;
					class111.anInt1335 = (buffer.readUnsignedByte(-1505277766) * 710845277);
					Class592 class592 = client.aClass505_11019.method8242(55538902);
					class111.anInt1338 += ((buffer.readUnsignedShort(-967558787) - 235453015 * class592.localX) << 9) * -634177337;
					class111.anInt1339 += ((buffer.readUnsignedShort(-1079281257) - class592.localY * 1704054549) << 9) * -1860856527;
					class111.anInt1337 = ((buffer.readUnsignedByte(-190183581) << 2) * -727802587);
					class111.anInt1342 = (buffer.readUnsignedShort(-971075967) * -1759312261);
				}
				class111.anInt1341 = buffer.readUnsignedInt((byte) -123) * 904299147;
				client.aClass111Array11017[i_291_] = class111;
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SEND_QC_PRIVATE_MESSAGE == class116.currentPacket) {
			String string = buffer.readString(-2111421123);
			int i_293_ = buffer.readUnsignedShort(-2064058606);
			String string_294_ = Class645.aClass24_8347.method839(i_293_, (byte) 58).method18248(buffer, 565239763);
			Class644.method10552(19, 0, string, string, string, string_294_, null, i_293_, null, (byte) 13);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4396 == class116.currentPacket) {
			int i_295_ = buffer.readUnsignedShort(-465408839);
			String string = buffer.readString(-1221580400);
			int i_296_ = buffer.readUnsignedShort(-888029736);
			int i_297_ = buffer.readUnsignedShort(-47954450);
			boolean bool = buffer.readUnsignedByte(1116850803) == 1;
			Class86.aClass1_881 = Class155.aClass1_1735;
			Class6.aBool38 = bool;
			Class28.method873(i_295_, string, i_296_, i_297_, -1877088896);
			Object object = null;
			Class657.method10791(19, (byte) -124);
			class116.currentPacket = null;
			return false;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4420) {
			Class601.anInt7851 = buffer.readUnsignedByte128(680545891) * 1365891833;
			Class369.anInt3884 = ((buffer.readByte((short) -22991) << 3) * -1618062701);
			Class523_Sub30.anInt10571 = ((buffer.readByte((short) -17643) << 3) * 877261249);
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			for (Class523_Sub10 class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method735(-380907255)); class523_sub10 != null; class523_sub10 = ((Class523_Sub10) client.aClass14_11172.method749(2046931934))) {
				int i_298_ = (int) ((1055205983951172633L * class523_sub10.aLong7065 >> 28) & 0x3L);
				int i_299_ = (int) (1055205983951172633L * class523_sub10.aLong7065 & 0x3fffL);
				int i_300_ = i_299_ - 235453015 * class592.localX;
				int i_301_ = (int) ((class523_sub10.aLong7065 * 1055205983951172633L >> 14) & 0x3fffL);
				int i_302_ = i_301_ - class592.localY * 1704054549;
				if (i_298_ == 1369556809 * Class601.anInt7851 && i_300_ >= Class369.anInt3884 * 1610062747 && i_300_ < Class369.anInt3884 * 1610062747 + 8 && i_302_ >= -1641734591 * Class523_Sub30.anInt10571 && i_302_ < Class523_Sub30.anInt10571 * -1641734591 + 8) {
					class523_sub10.method8661(607052656);
					if (i_300_ >= 0 && i_302_ >= 0 && (i_300_ < client.aClass505_11019.method8292((byte) 45)) && (i_302_ < client.aClass505_11019.method8235(2072807136)))
						Class251.method4527(1369556809 * Class601.anInt7851, i_300_, i_302_, 1899230175);
				}
			}
			for (Class523_Sub2 class523_sub2 = ((Class523_Sub2) Class523_Sub2.aClass708_10359.method14240(1138437864)); class523_sub2 != null; class523_sub2 = (Class523_Sub2) Class523_Sub2.aClass708_10359.method14244((byte) -92)) {
				if ((1813697231 * class523_sub2.anInt10348 >= Class369.anInt3884 * 1610062747) && (class523_sub2.anInt10348 * 1813697231 < 8 + Class369.anInt3884 * 1610062747) && (1818669861 * class523_sub2.anInt10355 >= Class523_Sub30.anInt10571 * -1641734591) && (class523_sub2.anInt10355 * 1818669861 < 8 + Class523_Sub30.anInt10571 * -1641734591) && (class523_sub2.anInt10354 * 1338368275 == Class601.anInt7851 * 1369556809))
					class523_sub2.aBool10358 = true;
			}
			for (Class523_Sub2 class523_sub2 = ((Class523_Sub2) Class523_Sub2.aClass708_10360.method14240(1689820247)); class523_sub2 != null; class523_sub2 = (Class523_Sub2) Class523_Sub2.aClass708_10360.method14244((byte) 59)) {
				if ((class523_sub2.anInt10348 * 1813697231 >= Class369.anInt3884 * 1610062747) && (class523_sub2.anInt10348 * 1813697231 < 1610062747 * Class369.anInt3884 + 8) && (1818669861 * class523_sub2.anInt10355 >= -1641734591 * Class523_Sub30.anInt10571) && (class523_sub2.anInt10355 * 1818669861 < -1641734591 * Class523_Sub30.anInt10571 + 8) && (1338368275 * class523_sub2.anInt10354 == Class601.anInt7851 * 1369556809))
					class523_sub2.aBool10358 = true;
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4519) {
			client.anInt11232 = 1307894601 * client.anInt11251;
			boolean bool = buffer.readUnsignedByte(490018592) == 1;
			if (-1372959327 * class116.anInt1421 == 1) {
				if (bool)
					Class194_Sub6.aClass334_9900 = null;
				else
					Class143.aClass334_1693 = null;
				class116.currentPacket = null;
				return true;
			}
			if (bool)
				Class194_Sub6.aClass334_9900 = new Class334(buffer);
			else
				Class143.aClass334_1693 = new Class334(buffer);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4437 == class116.currentPacket) {
			int i_303_ = buffer.readUnsignedShort(-906956569);
			int i_304_ = buffer.readUnsignedInt((byte) -112);
			int i_305_ = buffer.readUnsignedShort128((short) 17584);
			int i_306_ = buffer.readUnsignedByteC(792949436);
			Class220.method4131(-17414964);
			Class201.method3694(i_304_, i_306_, i_303_, i_305_, (byte) 2);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.SEND_GROUND_ITEM_PACKET) {
			Player.method18698(Class412.SEND_GROUND_ITEM, (byte) -29);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4461 == class116.currentPacket) {
			int i_307_ = buffer.readUnsignedShort(-1760255328);
			if (65535 == i_307_)
				i_307_ = -1;
			int i_308_ = buffer.readUnsignedByte(-526422376);
			int i_309_ = buffer.readUnsignedShort(-1182363544);
			int i_310_ = buffer.readUnsignedByte(627924483);
			int i_311_ = buffer.readUnsignedShort(-2064935237);
			Class254.aClass217_2743.method3854(Class189.aClass189_2144, i_307_, i_308_, i_310_, Class198.aClass198_2195.method3672((byte) 62), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, i_311_, i_309_, 1966158722);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4450 == class116.currentPacket) {
			Class654 class654 = new Class654();
			boolean bool = class654.method10674(buffer, 1186260143);
			client.aClass505_11019.method8271((byte) 8).method10236(client.aClass505_11019, bool ? class654 : null, class654.method10677(1616892831), -1462884800);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.SYSTEM_UPDATE_PACKET) {
			if (Class691.method13965(client.anInt11136 * -2020118759, (byte) -93))
				client.anInt11063 = (int) ((float) buffer.readUnsignedShort(-1930456916) * 2.5F) * -1078582639;
			else
				client.anInt11063 = (buffer.readUnsignedShort(-1577846441) * 2002259198);
			client.anInt11221 = client.anInt11251 * 1635505145;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4459) {
			if (!client.aBool11302) {
				try {
					byte i_312_ = buffer.readByte((short) -28936);
					int i_313_ = buffer.readUnsignedIntLE((short) -9739);
					client.aClass220_11301.method4109(new Class219(i_313_), i_312_, -1795268357);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1744871732);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.CLOSE_INTERFACE_PACKET) {
			int i_314_ = buffer.readUnsignedIntLE((short) -15886);
			Class220.method4131(-17414964);
			Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method741((long) i_314_));
			if (null != class523_sub36)
				Class579.method9657(class523_sub36, true, false, -259160531);
			if (null != client.aClass250_11189) {
				Class523_Sub14.method15991(client.aClass250_11189, (byte) -81);
				client.aClass250_11189 = null;
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4470) {
			boolean bool = buffer.readUnsignedByte(1975456694) == 1;
			String string = buffer.readString(251789150);
			String string_315_ = string;
			if (bool)
				string_315_ = buffer.readString(-467136707);
			long l = (long) buffer.readUnsignedShort(-908761298);
			long l_316_ = (long) buffer.read24BitInt(1405392551);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) -20280), buffer.readUnsignedByte(-600072518), -399965755));
			int i_317_ = buffer.readUnsignedShort(-1527608344);
			long l_318_ = l_316_ + (l << 32);
			boolean bool_319_ = false;
			while_137_: do {
				for (int i_320_ = 0; i_320_ < 100; i_320_++) {
					if (client.aLongArray11175[i_320_] == l_318_) {
						bool_319_ = true;
						break while_137_;
					}
				}
				if (class421.aBool4790 && Class519.method8641(string_315_, -71727778))
					bool_319_ = true;
			} while (false);
			if (!bool_319_) {
				client.aLongArray11175[client.anInt11069 * -435008989] = l_318_;
				client.anInt11069 = -2068990581 * ((client.anInt11069 * -435008989 + 1) % 100);
				String string_321_ = Class645.aClass24_8347.method839(i_317_, (byte) 91).method18248(buffer, 1697716245);
				if (-1 != class421.anInt4788 * -429816343)
					Class644.method10552(18, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1858644738)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -2109967642)).append(string_315_).toString(), string, string_321_, null, i_317_, class421, (byte) 116);
				else
					Class644.method10552(18, 0, string, string_315_, string, string_321_, null, i_317_, class421, (byte) 47);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4435) {
			Player.method18698(Class412.aClass412_4555, (byte) 88);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.NPC_UPDATE_PACKET) {
			Class24.updateNPC(814553095 * client.aClass505_11019.npcRenderDistance, 262980577);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4356 == class116.currentPacket) {
			Class220.method4131(-17414964);
			Class97.method1776(575906096);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4490 == class116.currentPacket) {
			int i_322_ = buffer.readUnsignedShort(-1115116169);
			int i_323_ = buffer.readUnsignedShort(-698150299);
			Class254.aClass217_2743.method3866(i_322_, i_323_, (byte) 26);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4365) {
			int i_324_ = buffer.readUnsignedInt((byte) -64);
			int i_325_ = buffer.readUnsignedByte128(-1163087179);
			int i_326_ = buffer.readUnsignedIntV2((short) 22900);
			int i_327_ = buffer.readUnsignedByte(2047955661);
			int i_328_ = i_327_ >> 2;
			int i_329_ = i_327_ & 0x3;
			int i_330_ = buffer.readUnsignedIntV2((short) 20551);
			int i_331_ = buffer.readUnsignedInt((byte) -90);
			int i_332_ = buffer.readUnsignedIntV1(-1908553945);
			int i_333_ = buffer.readUnsignedShort128((short) 22053);
			Class592 class592 = new Class592(buffer.readUnsignedIntV2((short) 18524));
			int i_334_ = buffer.readUnsignedIntV1(-1908553945);
			Class220.method4131(-17414964);
			Class45.method1237(i_324_, new Class523_Sub36_Sub4(i_333_, i_325_, new Class675(class592, i_328_, i_329_, i_326_)), new int[] { i_330_, i_334_, i_331_, i_332_ }, false, 581794136);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4455) {
			int i_335_ = buffer.readUnsignedIntLE((short) -12190);
			int i_336_ = buffer.readUnsignedShort(-855606631);
			Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9757((Class309) Class539.aClass53_Sub3_7213.getDefinition(i_336_, (byte) 62), i_335_, 2138772399);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4347) {
			client.anInt11235 = -1594112385;
			client.anInt11183 = client.anInt11251 * -684273789;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4333 == class116.currentPacket) {
			int i_337_ = buffer.readUnsignedByte(431400942);
			Class700 class700 = ((Class700) Class334.method5910(Class610.method10019(1292252590), i_337_, -1554561126));
			if (class700 == null)
				class700 = Class700.aClass700_8777;
			Class145.method2380(class700, 297704438);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4406 == class116.currentPacket) {
			int i_338_ = buffer.readUnsignedShort(-1804880215);
			int i_339_ = buffer.readUnsignedShortLE((byte) 9);
			Class220.method4131(-17414964);
			Class592.method9797(i_339_, i_338_, 0, (byte) 108);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4405) {
			int i_340_ = buffer.readUnsignedShort(-48493853);
			if (i_340_ == 65535)
				i_340_ = -1;
			int i_341_ = buffer.readUnsignedByte(1492226469);
			int i_342_ = buffer.readUnsignedShort(-1147306942);
			int i_343_ = buffer.readUnsignedByte(317912855);
			Class254.aClass217_2743.method3854(Class189.aClass189_2144, i_340_, i_341_, i_343_, Class198.aClass198_2194.method3672((byte) 18), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, 256, i_342_, -492193492);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4468 == class116.currentPacket) {
			int i_344_ = buffer.readUnsignedByte(997976600);
			Class691 class691 = ((Class691) Class334.method5910(Class218.method4035(396309116), i_344_, 294645782));
			if (null == class691)
				class691 = Class691.aClass691_8694;
			Class543.method9011(class691, -1304162855);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4351 == class116.currentPacket) {
			buffer.anInt10661 += 1018472948;
			if (buffer.method16313(-1841926077))
				IncomingPacket.method6628(buffer, (2349011 * buffer.anInt10661 - 28), 421847514);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4444) {
			String string = buffer.readString(-887136721);
			long l = (long) buffer.readUnsignedShort(-790536554);
			long l_345_ = (long) buffer.read24BitInt(1351263407);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) -12496), buffer.readUnsignedByte(-1544046521), 2028427683));
			boolean bool = buffer.readUnsignedByte(503854694) == 1;
			long l_346_ = (l << 32) + l_345_;
			boolean bool_347_ = false;
			while_138_: do {
				if (Class461.aClass218_5122 == null)
					bool_347_ = true;
				else {
					for (int i_348_ = 0; i_348_ < 100; i_348_++) {
						if (l_346_ == client.aLongArray11175[i_348_]) {
							bool_347_ = true;
							break while_138_;
						}
					}
					if (class421.aBool4790) {
						if (client.aBool11160 && !client.aBool11161 || client.aBool11164)
							bool_347_ = true;
						else if (Class519.method8641(string, 2640037))
							bool_347_ = true;
					}
				}
			} while (false);
			if (!bool_347_) {
				client.aLongArray11175[-435008989 * client.anInt11069] = l_346_;
				client.anInt11069 = -2068990581 * ((-435008989 * client.anInt11069 + 1) % 100);
				String string_349_ = (Class55.method1360(Class523_Sub19.decodeHuffman(buffer, -834595471), -1678762418));
				int i_350_ = bool ? 22 : 24;
				if (-1 != -429816343 * class421.anInt4788)
					Class644.method10552(i_350_, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1881821689)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((-429816343 * class421.anInt4788), -1089171042)).append(string).toString(), string, string_349_, Class461.aClass218_5122.method3968(1775783548), -1, class421, (byte) 110);
				else
					Class644.method10552(i_350_, 0, string, string, string, string_349_, Class461.aClass218_5122.method3968(1734232663), -1, class421, (byte) 99);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4366 == class116.currentPacket) {
			for (int i_351_ = 0; (i_351_ < client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153.length); i_351_++) {
				if (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_351_] != null) {
					client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_351_].anIntArray11911 = null;
					client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_351_].aClass707_11913.method14164(-1, (byte) 12);
				}
			}
			for (int i_352_ = 0; i_352_ < -1359865227 * client.anInt11049; i_352_++) {
				((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i_352_].anObject10554).anIntArray11911 = null;
				((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i_352_].anObject10554).aClass707_11913.method14164(-1, (byte) 12);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4474) {
			int i_353_ = buffer.readUnsignedShortLE(-1390789636);
			int i_354_ = buffer.readByte128(1477141981);
			int i_355_ = buffer.readUnsigned128Byte(2070933982);
			int i_356_ = buffer.readUnsignedShort(-968737621);
			int i_357_ = buffer.readByte128(2107661607);
			int i_358_ = buffer.readUnsignedShortLE((byte) 121);
			int i_359_ = buffer.readUnsigned128Byte(2066684295);
			if (255 == i_359_)
				i_359_ = -1;
			int i_360_ = buffer.readUnsignedShort128((short) 29710);
			int i_361_ = buffer.readUnsignedShortLE128(1476790721);
			int i_362_ = buffer.readUnsignedByteC(1358900042) * 4;
			int i_363_ = buffer.readUnsignedByte(-877530368);
			int i_364_ = buffer.readUnsignedShortLE(50057779);
			int i_365_ = buffer.readUnsignedShort(-2000784438);
			int i_366_ = buffer.readUnsignedShortLE((byte) 122);
			boolean bool = (i_363_ & 0x1) != 0;
			boolean bool_367_ = 0 != (i_363_ & 0x2);
			int i_368_ = bool_367_ ? i_363_ >> 2 : -1;
			if (bool_367_)
				i_355_ = (byte) i_355_;
			else
				i_355_ *= 4;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_369_ = i_356_ - class592.localX * 470906030;
			int i_370_ = i_358_ - class592.localY * -886858198;
			i_354_ += i_369_;
			i_357_ += i_370_;
			if (i_369_ >= 0 && i_370_ >= 0 && i_369_ < client.aClass505_11019.method8292((byte) 36) * 2 && i_370_ < client.aClass505_11019.method8292((byte) 4) * 2 && i_354_ >= 0 && i_357_ >= 0 && i_354_ < client.aClass505_11019.method8235(2095183645) * 2 && i_357_ < client.aClass505_11019.method8235(2076251595) * 2 && 65535 != i_360_) {
				i_369_ *= 256;
				i_370_ = 256 * i_370_;
				i_354_ = 256 * i_354_;
				i_357_ *= 256;
				i_355_ <<= 2;
				i_362_ <<= 2;
				i_361_ <<= 2;
				Class534_Sub1.method16657(i_360_, i_353_, i_364_, i_368_, i_355_, i_362_, i_369_, i_370_, i_354_, i_357_, i_366_, i_365_, i_359_, i_361_, bool, 0, (byte) 0);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.PROJECTILE_PACKET) {
			Player.method18698(Class412.PROJECTILE, (byte) -16);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.OTHER_PLAYER_ON_ICOMPONENT_PACKET) {
			int parent = buffer.readUnsignedIntV1(-1908553945);
			int index = buffer.readUnsignedShortLE((byte) 119);
			int hash = buffer.readUnsignedIntLE((short) -584);
			Class220.method4131(-17414964);
			Class149.method2518(parent, 5, index, hash, -1431291730);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4409 == class116.currentPacket) {
			if (!client.aBool11302) {
				try {
					byte i_374_ = buffer.readByteC(-1270473922);
					int i_375_ = buffer.readUnsignedIntV1(-1908553945);
					int i_376_ = buffer.readUnsignedByteC(-773558284);
					client.aClass220_11301.method4107(i_376_, -801121771).method4080(i_375_, i_374_, -1842403861);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1420566831);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.NPC_ON_ICOMPONENT_PACKET) {
			int npcId = buffer.readUnsignedIntV2((short) 30716);
			int hash = buffer.readUnsignedInt((byte) -98);
			Class220.method4131(-17414964);
			Class149.method2518(hash, 2, npcId, -1, -1835295396);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4349 == class116.currentPacket) {
			int i_379_ = buffer.readUnsignedIntLE((short) -3650);
			int i_380_ = buffer.readUnsignedIntV1(-1908553945);
			int i_381_ = buffer.readUnsignedByte128(-902131276);
			int i_382_ = buffer.readUnsignedByte128(-512648636);
			int i_383_ = buffer.readUnsigned128Byte(1635603437);
			int i_384_ = i_380_ >> 28;
			int i_385_ = i_380_ >> 14 & 0x3fff;
			int i_386_ = i_380_ & 0x3fff;
			Class254.aClass217_2743.method3885(i_379_, i_381_, true, i_384_, i_385_ << 9, i_386_ << 9, i_382_ << 9, i_383_ << 9, -1703063631);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.MINIMAP_FLAG_PACKET == class116.currentPacket) {
			int x = buffer.readUnsignedByteC(1423011831);
			int y = buffer.readUnsigned128Byte(1212940043);
			if (255 == x) {
				x = -1;
				y = -1;
			}
			Class352.method6192(x, y, 200397028);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.SKILLS_UPDATE_PACKET) {
			int level = buffer.readUnsignedByte128(931267933);
			int experience = buffer.readUnsignedIntV1(-1908553945);
			int id = buffer.readUnsignedByte(883397253);
			Class551.aClass600_7467.method9866(id, 382992953);
			Class98_Sub1_Sub2.playerVarsProvider.aClass635Array1349[id].method10421(experience, (byte) 30);
			Class98_Sub1_Sub2.playerVarsProvider.aClass635Array1349[id].method10420(level, -1953719700);
			client.anIntArray11265[(client.anInt11222 += 771136301) * -2091684699 - 1 & 0x3f] = id;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4358 == class116.currentPacket) {
			int i_392_ = buffer.readUnsignedShortLE(-1987793772);
			int i_393_ = buffer.readUnsignedShortLE(-323497313);
			int i_394_ = buffer.readUnsignedInt((byte) -72);
			Class220.method4131(-17414964);
			Class647_Sub1_Sub3_Sub3.method18449(i_394_, i_393_, i_392_, 312421118);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ANIMATION_ON_ICOMPONENT_PACKET == class116.currentPacket) {
			int hash = buffer.readUnsignedIntV2((short) 26497);
			int id = buffer.readUnsignedIntV2((short) 19649);
			Class220.method4131(-17414964);
			Class607.method9987(hash, id, 749055182);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.GRAND_EXCHANGE_PACKET) {
			int unknown = buffer.readUnsignedByte(-2005158913);
			int slotId = buffer.readUnsignedByte(-1808358799);
			if (buffer.readUnsignedByte(-2057698288) == 0)//stage
				client.exchangeOfferSlots[unknown][slotId] = new Class481();
			else {
				buffer.anInt10661 -= 189765723;
				client.exchangeOfferSlots[unknown][slotId] = new Class481(buffer, null);
			}
			client.anInt11234 = client.anInt11251 * 18992027;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.PUBLIC_CHAT_PACKET) {
			int i_399_ = buffer.readUnsignedShort(-1622609290);
			Player player;
			if (i_399_ == client.anInt11154 * 1109726117)
				player = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453;
			else
				player = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_399_];
			if (player == null) {
				class116.currentPacket = null;
				return true;
			}
			int effects = buffer.readUnsignedShort(-1487692368);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) 13439), buffer.readUnsignedByte(2053893494), 1184381660));
			boolean hasEffects = 0 != (effects & 0x8000);
			if (player.username != null && player.aClass623_12183 != null) {
				boolean bool_401_ = false;
				if (class421.aBool4790) {
					if (!hasEffects && (client.aBool11160 && !client.aBool11161 || client.aBool11164))
						bool_401_ = true;
					else if (Class519.method8641((player.username), -909654482))
						bool_401_ = true;
				}
				if (!bool_401_) {
					int i_402_ = -1;
					String string;
					if (hasEffects) {
						effects &= 0x7fff;
						Class387 class387 = Class159.method2568(buffer, -1428453319);
						i_402_ = class387.anInt4010 * -1038659943;
						string = class387.aClass523_Sub27_Sub18_4009.method18248(buffer, 948918564);
					} else
						string = Class55.method1360((Class523_Sub19.decodeHuffman(buffer, -592635409)), -1678762418);
					player.method18660(string.trim(), effects >> 8, effects & 0xff, -1461166679);
					int i_403_;
					if (class421.aBool4787)
						i_403_ = hasEffects ? 17 : 1;
					else
						i_403_ = hasEffects ? 17 : 2;
					if (-429816343 * class421.anInt4788 != -1)
						Class644.method10552(i_403_, 0, new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1237585887)).append(player.method18682(true, 1656815856)).toString(), new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), -1387312813)).append(player.method18669(false, (byte) 0)).toString(), player.displayName, string, null, i_402_, class421, (byte) 73);
					else
						Class644.method10552(i_403_, 0, player.method18682(true, 1113408981), player.method18669(false, (byte) 0), player.displayName, string, null, i_402_, class421, (byte) 119);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4430) {
			Class254.aClass217_2743.method3887((byte) 1);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4499) {
			int i_404_ = buffer.readUnsignedShort(-1519624946);
			int i_405_ = buffer.readUnsignedShort(-1221672617);
			int i_406_ = buffer.readUnsignedShort(-1249064202);
			Class254.aClass217_2743.method3865(i_404_, i_405_, i_406_, (byte) -24);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4473 == class116.currentPacket) {
			String string = buffer.readString(-760035576);
			long l = (long) buffer.readUnsignedShort(-466647290);
			long l_407_ = (long) buffer.read24BitInt(-947581764);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) 6084), buffer.readUnsignedByte(-1250853926), -1628484532));
			boolean bool = buffer.readUnsignedByte(1282317962) == 1;
			int i_408_ = buffer.readUnsignedShort(-1874268087);
			long l_409_ = (l << 32) + l_407_;
			boolean bool_410_ = false;
			while_139_: do {
				if (Class461.aClass218_5122 == null)
					bool_410_ = true;
				else {
					for (int i_411_ = 0; i_411_ < 100; i_411_++) {
						if (client.aLongArray11175[i_411_] == l_409_) {
							bool_410_ = true;
							break while_139_;
						}
					}
					if (class421.aBool4790 && Class519.method8641(string, -400150800))
						bool_410_ = true;
				}
			} while (false);
			if (!bool_410_) {
				client.aLongArray11175[-435008989 * client.anInt11069] = l_409_;
				client.anInt11069 = -2068990581 * ((client.anInt11069 * -435008989 + 1) % 100);
				String string_412_ = Class645.aClass24_8347.method839(i_408_, (byte) -61).method18248(buffer, 1757269008);
				int i_413_ = bool ? 23 : 25;
				if (-1 != -429816343 * class421.anInt4788)
					Class644.method10552(i_413_, 0, new StringBuilder().append(Class328_Sub3.method15694((-429816343 * class421.anInt4788), -622084749)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((class421.anInt4788 * -429816343), 170079993)).append(string).toString(), string, string_412_, Class461.aClass218_5122.method3968(-848100993), i_408_, class421, (byte) 53);
				else
					Class644.method10552(i_413_, 0, string, string, string, string_412_, Class461.aClass218_5122.method3968(2051597963), i_408_, class421, (byte) 53);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ADD_IGNORE_PACKET == class116.currentPacket) {
			while (2349011 * buffer.anInt10661 < -1372959327 * class116.anInt1421) {
				int i_414_ = buffer.readUnsignedByte(22955186);
				boolean bool = (i_414_ & 0x1) == 1;
				String string = buffer.readString(-642816950);
				String string_415_ = buffer.readString(-1365037579);
				String string_416_ = buffer.readString(698365259);
				for (int i_417_ = 0; i_417_ < 54287651 * client.anInt11078; i_417_++) {
					Class51 class51 = client.aClass51Array11294[i_417_];
					if (bool) {
						if (string_415_.equals(class51.aString714)) {
							class51.aString714 = string;
							class51.aString712 = string_415_;
							string = null;
							break;
						}
					} else if (string.equals(class51.aString714)) {
						class51.aString714 = string;
						class51.aString712 = string_415_;
						class51.aString713 = string_416_;
						string = null;
						break;
					}
				}
				if (string != null && client.anInt11078 * 54287651 < 400) {
					Class51 class51 = new Class51();
					client.aClass51Array11294[54287651 * client.anInt11078] = class51;
					class51.aString714 = string;
					class51.aString712 = string_415_;
					class51.aString713 = string_416_;
					class51.aBool711 = (i_414_ & 0x2) == 2;
					client.anInt11078 += -1357202805;
				}
			}
			client.anInt11183 = client.anInt11251 * -684273789;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.OTHER_GAMEBAR_UPDATE_PACKET == class116.currentPacket) {
			client.anInt11258 = buffer.readUnsignedByte128(-901228916) * 1082174507;
			client.anInt11163 = buffer.readUnsignedByteC(1129939493) * 367155739;
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4411 == class116.currentPacket) {
			int i_418_ = buffer.readUnsignedByte(-1376323178);
			int i_419_ = buffer.readUnsignedIntV2((short) 26112);
			int i_420_ = buffer.readUnsignedShort128((short) 26441);
			int i_421_ = buffer.readUnsignedShortLE128(1537648424);
			Class220.method4131(-17414964);
			Class687_Sub21.method16928(i_419_, i_418_, i_421_, i_420_, (byte) 45);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4448 == class116.currentPacket) {
			String string = buffer.readString(496839833);
			int i_422_ = buffer.readUnsignedShort(-401106267);
			int i_423_ = buffer.readUnsignedShort(-1194498114);
			int i_424_ = buffer.readUnsignedShort(-1821590507);
			Class6.aClass1_42.aString9 = string;
			Class6.aClass1_42.anInt10 = 1274525161 * i_422_;
			Class6.aClass1_42.anInt11 = 1509090121 * i_423_;
			Class6.aClass1_42.anInt12 = i_424_ * 19836347;
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4397) {
			int i_425_ = buffer.readUnsignedIntLE((short) -10211);
			int i_426_ = buffer.readUnsignedIntV1(-1908553945);
			int i_427_ = buffer.readUnsignedIntV2((short) 28724);
			int i_428_ = buffer.readUnsignedShortLE128(1521249176);
			int i_429_ = buffer.readUnsignedIntLE((short) -22292);
			int i_430_ = buffer.readUnsignedByte128(447189842);
			int i_431_ = buffer.readUnsignedIntV2((short) 27135);
			int i_432_ = buffer.readUnsignedShortLE128(1526567876);
			Class220.method4131(-17414964);
			Class45.method1237(i_425_, new Class523_Sub36_Sub2(i_432_, i_430_, i_428_), new int[] { i_427_, i_431_, i_429_, i_426_ }, false, 581794136);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4391 == class116.currentPacket) {
			Player.method18698(Class412.aClass412_4554, (byte) -15);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.OBJECT_ANIMATION_PACKET == class116.currentPacket) {
			int i_433_ = buffer.readUnsignedByte128(-1793484955);
			int animationId = buffer.readUnsignedIntV2((short) 21135);
			int i_435_ = animationId >> 28 & 0x3;
			int i_436_ = animationId >> 14 & 0x3fff;
			int i_437_ = animationId & 0x3fff;
			int typeHash = buffer.readUnsigned128Byte(1355839213);
			int i_439_ = typeHash >> 2;
			int i_440_ = typeHash & 0x3;
			int i_441_ = client.anIntArray10985[i_439_];
			int i_442_ = buffer.readUnsignedIntLE((short) -1359);
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			i_436_ -= 235453015 * class592.localX;
			i_437_ -= 1704054549 * class592.localY;
			Class59.method1401(i_435_, i_436_, i_437_, i_441_, i_439_, i_440_, i_442_, i_433_, (byte) 9);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4436) {
			Player.method18698(Class412.aClass412_4544, (byte) -53);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4480) {
			int i_443_ = buffer.readUnsignedShort(-1379783948);
			Class254.aClass217_2743.method3861(i_443_, (byte) -98);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4371) {
			Player.method18698(Class412.aClass412_4553, (byte) -48);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4466 == class116.currentPacket) {
			int i_444_ = buffer.readUnsignedIntV1(-1908553945);
			int i_445_ = buffer.readUnsignedByte128(-348220052);
			int i_446_ = buffer.readUnsignedIntV2((short) 27851);
			int i_447_ = buffer.readUnsignedShortLE((byte) 109);
			int i_448_ = buffer.readUnsignedShort128((short) 31156);
			Class592 class592 = new Class592(buffer.readUnsignedIntV2((short) 17973));
			int i_449_ = buffer.readUnsignedIntLE((short) -8057);
			int i_450_ = buffer.readUnsignedInt((byte) -103);
			int i_451_ = buffer.readUnsignedInt((byte) -100);
			Class220.method4131(-17414964);
			Class45.method1237(i_450_, new Class523_Sub36_Sub1(i_447_, i_445_, new Class667(class592, i_448_)), new int[] { i_446_, i_449_, i_444_, i_451_ }, false, 581794136);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4350 == class116.currentPacket) {
			if (!client.aBool11302) {
				try {
					int i_452_ = buffer.readUnsignedByte128(476214242);
					int i_453_ = buffer.readUnsignedByteC(-1965073877);
					int i_454_ = buffer.readUnsignedByte128(-975456691);
					client.aClass220_11301.method4107(i_453_, -1451755783).method4052(i_452_, i_454_, (byte) -42);
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1671978696);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4429 == class116.currentPacket) {
			Class254.aClass217_2743.method3868(Class198.aClass198_2194.method3672((byte) 50), 1430690367);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4415) {
			int i_455_ = buffer.readUnsignedShortLE128(1716062137);
			int i_456_ = buffer.readUnsignedIntV1(-1908553945);
			int i_457_ = buffer.readUnsignedShortLE((byte) 35);
			client.aClass505_11019.method8241((byte) -24).method9302(i_457_, i_456_, i_455_, -2057888840);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.INTERFACE_PACKET == class116.currentPacket) {
			int id = buffer.readUnsignedShortLE((byte) 125);
			int i_459_ = buffer.readUnsignedInt((byte) -85);
			int i_460_ = buffer.readUnsignedIntLE((short) -5332);
			int i_461_ = buffer.readUnsignedIntV2((short) 20150);
			int clipped = buffer.readUnsignedByte128(1720038206);
			int hash = buffer.readUnsignedIntV2((short) 32715);
			int i_464_ = buffer.readUnsignedInt((byte) -85);
			
			int windowId = hash >> 16;
			int childId = hash & 0xffff;
			
			System.out.println("setWindowInterface(" + childId + ", " + id + " );");
			
			Class220.method4131(-17414964);
			Class45.method1237(hash, new Class523_Sub36(id, clipped), new int[] { i_460_, i_464_, i_461_, i_459_ }, false, 581794136);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4344 == class116.currentPacket) {
			int i_465_ = buffer.readUnsignedInt((byte) -74);
			Class454.aClass63_4979 = new Class63(i_465_);
			Thread thread = new Thread(Class454.aClass63_4979);
			thread.setPriority(1);
			thread.start();
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4475 == class116.currentPacket) {
			Class461.method7507(-1858870095);
			class116.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass409_4467 == class116.currentPacket) {
			if (!client.aBool11302) {
				try {
					for (byte i_466_ = buffer.readByte((short) -14611); i_466_ != -1; i_466_ = buffer.readByte((short) -2050)) {
						for (byte i_467_ = buffer.readByte((short) -19246); i_467_ != -1; i_467_ = buffer.readByte((short) -2829)) {
							for (byte i_468_ = buffer.readByte((short) -7633); -1 != i_468_; i_468_ = buffer.readByte((short) -29017))
								client.aClass220_11301.method4107(i_466_, -895539762).method4060(i_467_, i_468_, Integer.valueOf(buffer.readUnsignedInt((byte) -126)), 505418394);
						}
					}
				} catch (RuntimeException runtimeexception) {
					Class305.method5553(null, runtimeexception, (byte) 1);
					Class204.method3712(class116, -1933604184);
				}
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.RECIEVE_PRIVATE_MESSAGE_PACKET == class116.currentPacket) {
			boolean bool = buffer.readUnsignedByte(1176065641) == 1;
			String string = buffer.readString(713236253);
			String string_469_ = string;
			if (bool)
				string_469_ = buffer.readString(562613650);
			long l = (long) buffer.readUnsignedShort(-1154974266);
			long l_470_ = (long) buffer.read24BitInt(-584305408);
			Class421 class421 = ((Class421) Class334.method5910(Class421.method6674((short) -1013), buffer.readUnsignedByte(1874777545), 855988363));
			long l_471_ = (l << 32) + l_470_;
			boolean bool_472_ = false;
			while_140_: do {
				for (int i_473_ = 0; i_473_ < 100; i_473_++) {
					if (l_471_ == client.aLongArray11175[i_473_]) {
						bool_472_ = true;
						break while_140_;
					}
				}
				if (class421.aBool4790) {
					if (client.aBool11160 && !client.aBool11161 || client.aBool11164)
						bool_472_ = true;
					else if (Class519.method8641(string_469_, -1980973276))
						bool_472_ = true;
				}
			} while (false);
			if (!bool_472_) {
				client.aLongArray11175[-435008989 * client.anInt11069] = l_471_;
				client.anInt11069 = (1 + -435008989 * client.anInt11069) % 100 * -2068990581;
				String string_474_ = (Class55.method1360(Class523_Sub19.decodeHuffman(buffer, 1251181240), -1678762418));
				int i_475_ = class421.aBool4787 ? 7 : 3;
				if (class421.anInt4788 * -429816343 != -1)
					Class644.method10552(i_475_, 0, new StringBuilder().append(Class328_Sub3.method15694((-429816343 * class421.anInt4788), -1913440619)).append(string).toString(), new StringBuilder().append(Class328_Sub3.method15694((-429816343 * class421.anInt4788), -1603699615)).append(string_469_).toString(), string, string_474_, null, -1, class421, (byte) 121);
				else
					Class644.method10552(i_475_, 0, string, string_469_, string, string_474_, null, -1, class421, (byte) 123);
			}
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4360) {
			int i_476_ = buffer.readUnsignedByteC(1247356556);
			int i_477_ = buffer.readUnsignedShort(-412718480);
			if (i_477_ == 65535)
				i_477_ = -1;
			Class254.aClass217_2743.method3909(i_477_, i_476_, -237463688);
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4388 == class116.currentPacket) {
			int i_478_ = buffer.readUnsignedInt((byte) -79);
			int i_479_ = buffer.readUnsignedShortLE128(1436072773);
			int i_480_ = buffer.readUnsignedShortLE128(1724209920);
			int i_481_ = buffer.readUnsignedShortLE((byte) 93);
			Class220.method4131(-17414964);
			Class149.method2518(i_478_, 7, i_479_ << 16 | i_481_, i_480_, -2113668554);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.SEND_MUSIC_PACKET) {
			int volume = buffer.readUnsignedByte(-1545485793);
			int archiveId = buffer.readUnsignedShortLE128(1499186519);
			if (archiveId == 65535)
				archiveId = -1;
			Class254.aClass217_2743.sendMusic(archiveId, volume, (byte) 2);
			class116.currentPacket = null;
			return true;
		}
		if (class116.currentPacket == IncomingPacket.aClass409_4481) {
			int i_484_ = buffer.readUnsignedIntV2((short) 27270);
			if (i_484_ != -1797182875 * Class431.anInt4861) {
				Class431.anInt4861 = -17008787 * i_484_;
				Class486.method7941(Class572.aClass572_7675, -1, -1, -886052652);
			}
			class116.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass409_4402 == class116.currentPacket) {
			int i_485_ = buffer.readUnsignedShort(-738213074);
			Class268.method4903(i_485_, -526666943);
			class116.currentPacket = null;
			return true;
		}
		Class305.method5553(new StringBuilder().append(class116.currentPacket != null ? 942758347 * class116.currentPacket.anInt4522 : -1).append(Class31.aString300).append(class116.aClass409_1430 != null ? 942758347 * class116.aClass409_1430.anInt4522 : -1).append(Class31.aString300).append(null != class116.aClass409_1426 ? 942758347 * class116.aClass409_1426.anInt4522 : -1).append(" ").append(-1372959327 * class116.anInt1421).toString(), new RuntimeException(), (byte) 1);
		Class669.method13691(false, -1838550041);
		return true;
	}

	public static final void method4266(Class250 class250, int i, int i_486_, byte i_487_) {
		if (null == client.aClass250_11197 && !Class36.aBool326 && (null != class250 && Class473.method7741(class250, (byte) -116))) {
			client.aClass250_11197 = class250;
			client.aClass250_11198 = Class547.method9094(class250, 1476932382);
			client.anInt11104 = i * 168535203;
			client.anInt11200 = i_486_ * -1882326933;
			Class23.anInt236 = 0;
			client.aBool11231 = false;
		}
	}
}
