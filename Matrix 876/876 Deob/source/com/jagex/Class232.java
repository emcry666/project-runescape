/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class232 implements Interface28 {
	int anInt2365;
	int anInt2366;
	Class224 this$0;
	static int anInt2367;

	public void method162(Class218 class218) {
		class218.method3981(anInt2366 * -651895585, -1717995619 * anInt2365, 341909049);
		class218.method3967(-651895585 * anInt2366, (byte) 2).method4221(903061379);
	}

	public void method163(Class218 class218, int i) {
		class218.method3981(anInt2366 * -651895585, -1717995619 * anInt2365, 341909049);
		class218.method3967(-651895585 * anInt2366, (byte) 2).method4221(646853394);
	}

	Class232(Class224 class224, RSBuffer class523_sub34) {
		this$0 = class224;
		anInt2366 = class523_sub34.readUnsignedShort(-482382458) * -381821153;
		anInt2365 = class523_sub34.readUnsignedByte(-303893735) * 1652016821;
	}

	public void method161(Class218 class218) {
		class218.method3981(anInt2366 * -651895585, -1717995619 * anInt2365, 341909049);
		class218.method3967(-651895585 * anInt2366, (byte) 2).method4221(-628498695);
	}

	public void method164(Class218 class218) {
		class218.method3981(anInt2366 * -651895585, -1717995619 * anInt2365, 341909049);
		class218.method3967(-651895585 * anInt2366, (byte) 2).method4221(592545401);
	}

	public void method165(Class218 class218) {
		class218.method3981(anInt2366 * -651895585, -1717995619 * anInt2365, 341909049);
		class218.method3967(-651895585 * anInt2366, (byte) 2).method4221(-155588241);
	}

	public static void method4252(int[] is, float[] fs, float[] fs_0_, int i) {
		Class402.method6588(is, fs, fs_0_, 0, is.length - 1, -1826705737);
	}

	static final void method4253(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub12_10618, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1 ? 1 : 0, 1053182758);
		Class165.method2655((byte) 69);
		client.aClass505_11019.method8271((byte) 8).method10249(185518512);
		Class211.method3824(1026020742);
		client.aBool11012 = false;
	}

	static final void decodeMask(RSBitBuffer buffer, int playerIndex, Player player, int mask, byte i_2_) {
		// Face Entity 0
		if (0 != (mask & 0x20)) {
			int id = buffer.readUnsignedShort(-1216078617);
			if (65535 == id)
				id = -1;
			player.faceEntityId = -1843265241 * id;
		}

		// Unknown 1
		if (0 != (mask & 0x400)) {
			player.aClass210_12200 = ((Class210) Class334.method5910(Class210.method3815(-788039020), buffer.readUnsignedByte(959526427), 1146269841));
			if (player.aClass210_12200 == null)
				player.aClass210_12200 = Class210.aClass210_2258;
		}

		// Force Talk 2
		if (0 != (mask & 0x4000)) {
			String message = buffer.readString(-1888011741);
			if (Class241.player == player)
				Class515.method8593(2, 0, player.method18682(true, 1053685246), player.method18669(false, (byte) 0), player.displayName, message, null, -1531290572);
			player.setNextOverHeadMessage(message, 0, 0, -369582292);
		}

		// Graphics 1 3
		if (0 != (mask & 0x4)) {
			int id = buffer.readUnsignedShortLE((byte) 89);
			int settings = buffer.readUnsignedIntV1(-1908553945);
			if (id == 65535)
				id = -1;
			int hash = buffer.readUnsignedByte128(147554596);
			int i_7_ = hash & 0x7;
			int i_8_ = hash >> 3 & 0xf;
			if (15 == i_8_)
				i_8_ = -1;
			boolean bool = 1 == (hash >> 7 & 0x1);
			player.setGraphics(id, settings, i_7_, i_8_, bool, 0, 1924177644);
		}

		// Overhead Icons 4
		if (0 != (mask & 0x2000)) {
			int length = buffer.readUnsignedByte(1862392730);
			byte[] data = new byte[length];
			RSBuffer buf = new RSBuffer(data);
			buffer.readBytesReversed(data, 0, length, 2013353240);
			Class108.aClass523_Sub34Array1317[playerIndex] = buf;
			player.decodeHeadIcons(buf, -654999937);
		}

		// Color 5
		if (0 != (mask & 0x100000)) {
			player.aByte11926 = buffer.readByte((short) -19211);
			player.aByte11927 = buffer.read128Byte(1542854725);
			player.aByte11936 = buffer.readByte128(294394819);
			player.aByte11929 = (byte) buffer.readUnsignedByte128(1828121125);
			player.colorDelay = ((client.cycles + buffer.readUnsignedShortLE128(1939502057)) * -1819254063);
			player.colorDuration = (client.cycles + buffer.readUnsignedShortLE128(1856314296)) * -637108827;
		}

		// Clan Icon 6
		if ((mask & 0x800000) != 0) {
			player.isInAClan = buffer.readUnsignedByte128(-1406808550) == 1;
		}

		// Force Movement 7
		if ((mask & 0x2) != 0) {
			player.anInt11915 = buffer.read128Byte(1542854725) * -25072087;
			player.anInt11917 = buffer.readByte128(895458335) * 245440217;
			player.anInt11908 = buffer.readByte((short) -27791) * 1206178097;
			player.anInt11918 = buffer.readByteC(-1270473922) * -360111831;
			player.anInt11940 = buffer.readByteC(-1270473922) * -2133855093;
			player.anInt11893 = buffer.readByteC(-1270473922) * -901004921;
			player.anInt11954 = (buffer.readUnsignedShort128((short) 767) + client.cycles) * -1242459571;
			player.anInt11932 = (buffer.readUnsignedShort(-1960659089) + client.cycles) * 1395835143;
			player.anInt11923 = buffer.readUnsignedShortLE((byte) 116) * 272295045;
			player.stepsCount = -822788275;
			player.anInt11946 = 0;
			player.anInt11915 += player.screenX[0] * -25072087;
			player.anInt11917 += player.screenY[0] * 245440217;
			player.anInt11908 += (1206178097 * player.screenX[0]);
			player.anInt11918 += (-360111831 * player.screenY[0]);
			player.anInt11940 += -2133855093 * player.aByte10821;
			player.anInt11893 += -901004921 * player.aByte10821;
		}

		// Target Reticule 8
		if ((mask & 0x10000) != 0) {
			int i_10_ = buffer.readUnsignedShortLE((byte) 9);
			int i_11_ = buffer.readUnsignedIntV2((short) 17184);
			if (i_10_ == 65535)
				i_10_ = -1;
			int i_12_ = buffer.readUnsignedByte128(-1399139112);
			int i_13_ = i_12_ & 0x7;
			int i_14_ = i_12_ >> 3 & 0xf;
			if (15 == i_14_)
				i_14_ = -1;
			boolean bool = (i_12_ >> 7 & 0x1) == 1;
			player.setGraphics(i_10_, i_11_, i_13_, i_14_, bool, 4, -808976619);
		}

		// Face Tile 9
		if (0 != (mask & 0x40)) {
			player.direction = buffer.readUnsignedShort128((short) 28505) * -505899647;
			if (0 == player.stepsCount * 703205765) {
				player.method18331(-1693078911 * player.direction, 1444433219);
				player.direction = 505899647;
			}
		}

		// 10
		if ((mask & 0x40000) != 0) {
			player.anInterface2_11952.method20(-2046438609);
			buffer.offset += 379531446;
			int i_15_ = ((buffer.buffer[((buffer.offset += 189765723) * 2349011 - 1)]) & 0xff);
			for (int index = 0; index < i_15_; index++) {
				int i_17_ = buffer.readUnsignedByte128(885582781);
				BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(693190351), i_17_, 866760439));
				Class426 class426 = (Class669.aClass98_Sub1_Sub1_8582.method14344(buffer, class474, (byte) 1));
				player.anInterface2_11952.method14(class426.anInt4821 * -408785679, class426.anObject4822, -1409559582);
			}
		}

		// Hitbar 11
		if ((mask & 0x1) != 0) {
			int i_18_ = buffer.readUnsignedByte(1167557487);
			if (i_18_ > 0) {
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					int i_20_ = -1;
					int i_21_ = -1;
					int i_22_ = -1;
					int i_23_ = buffer.readUnsignedSmart(368514876);
					if (32767 == i_23_) {
						i_23_ = buffer.readUnsignedSmart(368514876);
						i_21_ = buffer.readUnsignedSmart(368514876);
						i_20_ = buffer.readUnsignedSmart(368514876);
						i_22_ = buffer.readUnsignedSmart(368514876);
					} else if (i_23_ != 32766)
						i_21_ = buffer.readUnsignedSmart(368514876);
					else {
						i_23_ = -1;
						i_21_ = buffer.readUnsignedByte128(1819373855);
					}
					int i_24_ = buffer.readUnsignedSmart(368514876);
					player.method18340(i_23_, i_21_, i_20_, i_22_, client.cycles, i_24_, 513676825);
				}
			}
			int i_25_ = buffer.readUnsignedByte(1270234277);
			if (i_25_ > 0) {
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
					int i_27_ = buffer.readUnsignedSmart(368514876);
					int i_28_ = buffer.readUnsignedSmart(368514876);
					if (i_28_ != 32767) {
						int i_29_ = buffer.readUnsignedSmart(368514876);
						int i_30_ = buffer.readUnsigned128Byte(1579558622);
						int i_31_ = (i_28_ > 0 ? buffer.readUnsignedByteC(1900258322) : i_30_);
						player.method18349(i_27_, (client.cycles), i_28_, i_29_, i_30_, i_31_, -1970230724);
					} else
						player.method18341(i_27_, 1690324009);
				}
			}
		}

		// Graphics 3 12
		if ((mask & 0x8000) != 0) {
			int i_32_ = buffer.readUnsignedShort128((short) 24475);
			int i_33_ = buffer.readUnsignedIntV2((short) 21942);
			if (i_32_ == 65535)
				i_32_ = -1;
			int i_34_ = buffer.readUnsigned128Byte(2036543359);
			int i_35_ = i_34_ & 0x7;
			int i_36_ = i_34_ >> 3 & 0xf;
			if (15 == i_36_)
				i_36_ = -1;
			boolean bool = (i_34_ >> 7 & 0x1) == 1;
			player.setGraphics(i_32_, i_33_, i_35_, i_36_, bool, 2, 559682214);
		}

		// Graphics 4 13
		if (0 != (mask & 0x200000)) {
			int i_37_ = buffer.readUnsignedShort(-912630204);
			int i_38_ = buffer.readUnsignedIntV2((short) 28700);
			if (65535 == i_37_)
				i_37_ = -1;
			int i_39_ = buffer.readUnsignedByte(1074876559);
			int i_40_ = i_39_ & 0x7;
			int i_41_ = i_39_ >> 3 & 0xf;
			if (i_41_ == 15)
				i_41_ = -1;
			boolean bool = 1 == (i_39_ >> 7 & 0x1);
			player.setGraphics(i_37_, i_38_, i_40_, i_41_, bool, 3, -781365698);
		}

		// Appearance 14
		if ((mask & 0x8) != 0) {
			int i_42_ = buffer.readUnsignedByteC(-2026222340);
			byte[] is = new byte[i_42_];
			RSBuffer class523_sub34 = new RSBuffer(is);
			buffer.readBytesReversed(is, 0, i_42_, 2046906494);
			Class108.aClass523_Sub34Array1316[playerIndex] = class523_sub34;
			player.decodeAppearance(class523_sub34, 868284689);
		}

		// 15
		if (0 != (mask & 0x20000)) {
			buffer.offset += 379531446;
			int i_43_ = ((buffer.buffer[((buffer.offset += 189765723) * 2349011 - 1)]) & 0xff);
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				int i_45_ = buffer.readUnsignedByteC(674586290);
				BaseVarType class474 = ((BaseVarType) Class334.method5910(BaseVarType.method7746(2028976425), i_45_, 1359595407));
				Class426 class426 = (Class669.aClass98_Sub1_Sub1_8582.method14344(buffer, class474, (byte) 1));
				player.anInterface2_11952.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1543009574);
			}
		}

		// 16 *Another force chat?*
		if ((mask & 0x400000) != 0) {
			String string = buffer.readString(392811625);
			int i_46_ = buffer.readUnsignedByte(-18884581);
			if (0 != (i_46_ & 0x1))
				Class515.method8593(2, i_46_, player.method18682(true, -37349813), player.method18669(false, (byte) 0), player.displayName, string, null, 21588808);
			player.setNextOverHeadMessage(string, 0, 0, -940600446);
		}

		// 17
		if ((mask & 0x80000) != 0) {
			int i_47_ = buffer.readUnsigned128Byte(1309340079);
			int[] is = new int[i_47_];
			int[] is_48_ = new int[i_47_];
			for (int i_49_ = 0; i_49_ < i_47_; i_49_++) {
				int i_50_ = buffer.readUnsignedShort128((short) 19798);
				if ((i_50_ & 0xc000) == 49152) {
					int i_51_ = buffer.readUnsignedShortLE((byte) 120);
					is[i_49_] = i_50_ << 16 | i_51_;
				} else
					is[i_49_] = i_50_;
				is_48_[i_49_] = buffer.readUnsignedShortLE128(2001290982);
			}
			player.method18334(is, is_48_, 132268876);
		}

		// Graphics 2 18
		if ((mask & 0x1000) != 0) {
			int i_52_ = buffer.readUnsignedShortLE128(1517932219);
			int i_53_ = buffer.readUnsignedIntLE((short) -25936);
			if (65535 == i_52_)
				i_52_ = -1;
			int i_54_ = buffer.readUnsignedByteC(858031744);
			int i_55_ = i_54_ & 0x7;
			int i_56_ = i_54_ >> 3 & 0xf;
			if (i_56_ == 15)
				i_56_ = -1;
			boolean bool = 1 == (i_54_ >> 7 & 0x1);
			player.setGraphics(i_52_, i_53_, i_55_, i_56_, bool, 1, -1720737465);
		}

		// 19
		if ((mask & 0x200) != 0) {
			int i_57_ = buffer.readUnsigned128Byte(1765957428);
			int[] is = new int[i_57_];
			int[] is_58_ = new int[i_57_];
			int[] is_59_ = new int[i_57_];
			for (int i_60_ = 0; i_60_ < i_57_; i_60_++) {
				is[i_60_] = buffer.readBigSmart((byte) -113);
				is_58_[i_60_] = buffer.readUnsigned128Byte(1146515670);
				is_59_[i_60_] = buffer.readUnsignedShortLE128(2046417074);
			}
			Class523.method8667(player, is, is_58_, is_59_, (byte) 64);
		}

		// Animation 20
		if ((mask & 0x10) != 0) {
			int[] is = new int[4];
			for (int i_61_ = 0; i_61_ < 4; i_61_++)
				is[i_61_] = buffer.readBigSmart((byte) -54);
			int i_62_ = buffer.readUnsigned128Byte(1193441201);
			Class643.setAnimation(player, is, i_62_, false, -700536104);
		}
	}

	static void method4255(NPC class647_sub1_sub3_sub1_sub1, boolean bool, int i) {
		if (Class36.anInt330 * 462991943 < 409) {
			NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
			String string = class647_sub1_sub3_sub1_sub1.customName;
			if (class300.anIntArray3286 != null) {
				class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 46);
				if (class300 == null)
					return;
				string = class300.name;
			}
			if (class300.aBool3287) {
				if (0 != 1167898669 * class647_sub1_sub3_sub1_sub1.customCombatLevel) {
					String string_63_ = (client.aClass681_11284 == Class681.aClass681_8641 ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -1)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -108)));
					string = new StringBuilder().append(string).append(Class443.method7204((class647_sub1_sub3_sub1_sub1.customCombatLevel * 1167898669), (Class241.player.anInt12186) * 1773490063, (byte) -63)).append(Class31.aString297).append(string_63_).append(1167898669 * class647_sub1_sub3_sub1_sub1.customCombatLevel).append(Class31.aString295).toString();
				}
				if (client.aBool11000 && !bool) {
					Class76 class76 = ((Class76) (-1 != 1180578917 * Class13.anInt173 ? (Class60.aClass53_Sub22_766.getDefinition(Class13.anInt173 * 1180578917, (byte) -30)) : null));
					if (0 != (Class570.anInt7658 * 382935923 & 0x2) && (null == class76 || (class300.method5488((Class13.anInt173 * 1180578917), (class76.anInt850 * -1100663923), -1832115898) != -1100663923 * class76.anInt850)))
						Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16776960, -284055399)).append(string).toString(), Class684.anInt8664 * 2088669163, 8, -1, (long) (class647_sub1_sub3_sub1_sub1.anInt11888 * -1087669731), 0, 0, true, false, (long) (class647_sub1_sub3_sub1_sub1.anInt11888 * -1087669731), false, (byte) -91);
				}
				if (!bool) {
					String[] strings = class300.aStringArray3270;
					if (client.aBool11193)
						strings = Class523_Sub19.method16060(strings, 1966711963);
					if (strings != null) {
						for (int i_64_ = strings.length - 1; i_64_ >= 0; i_64_--) {
							if (null != strings[i_64_] && ((class647_sub1_sub3_sub1_sub1.anInt12176 * 1150737897) & 1 << i_64_) == 0 && (0 == class300.aByte3250 || (!(strings[i_64_].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -128))) && !(strings[i_64_].equalsIgnoreCase(Class39.aClass39_505.method1124(Class53_Sub20.aClass668_10979, (byte) -16)))))) {
								int i_65_ = 0;
								int i_66_ = 952073761 * client.anInt11179;
								if (i_64_ == 0)
									i_65_ = 9;
								if (i_64_ == 1)
									i_65_ = 10;
								if (2 == i_64_)
									i_65_ = 11;
								if (i_64_ == 3)
									i_65_ = 12;
								if (i_64_ == 4)
									i_65_ = 13;
								if (5 == i_64_)
									i_65_ = 1003;
								int i_67_ = class300.method5485(i_64_, 1745063011);
								if (-1 != i_67_)
									i_66_ = i_67_;
								Class463.method7523(strings[i_64_], new StringBuilder().append(Class495.method8101(16776960, 1258293448)).append(string).toString(), ((strings[i_64_].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -51))) ? -1085767413 * class300.anInt3272 : i_66_), i_65_, -1, (long) ((class647_sub1_sub3_sub1_sub1.anInt11888) * -1087669731), 0, 0, true, false, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub1.anInt11888)), false, (byte) -124);
							}
						}
						if (class300.aByte3250 == 1) {
							for (int i_68_ = 0; i_68_ < strings.length; i_68_++) {
								if (null != strings[i_68_] && 0 == ((1150737897 * (class647_sub1_sub3_sub1_sub1.anInt12176)) & 1 << i_68_) && ((strings[i_68_].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -9))) || (strings[i_68_].equalsIgnoreCase(Class39.aClass39_505.method1124(Class53_Sub20.aClass668_10979, (byte) -48))))) {
									short i_69_ = 0;
									if ((1167898669 * (class647_sub1_sub3_sub1_sub1.customCombatLevel)) > (Class241.player.anInt12186) * 1773490063)
										i_69_ = (short) 2000;
									short i_70_ = 0;
									int i_71_ = client.anInt11179 * 952073761;
									if (0 == i_68_)
										i_70_ = (short) 9;
									if (i_68_ == 1)
										i_70_ = (short) 10;
									if (i_68_ == 2)
										i_70_ = (short) 11;
									if (3 == i_68_)
										i_70_ = (short) 12;
									if (i_68_ == 4)
										i_70_ = (short) 13;
									if (i_68_ == 5)
										i_70_ = (short) 1003;
									if (0 != i_70_)
										i_70_ += i_69_;
									int i_72_ = class300.method5485(i_68_, 1836468424);
									if (-1 != i_72_)
										i_71_ = i_72_;
									Class463.method7523(strings[i_68_], new StringBuilder().append(Class495.method8101(16776960, 2080310728)).append(string).toString(), ((strings[i_68_].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -93))) ? class300.anInt3272 * -1085767413 : i_71_), i_70_, -1, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub1.anInt11888)), 0, 0, true, false, (long) ((class647_sub1_sub3_sub1_sub1.anInt11888) * -1087669731), false, (byte) -56);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method4256(Class523_Sub27_Sub6 class523_sub27_sub6, byte i) {
		if (!Class36.aBool326) {
			class523_sub27_sub6.method8661(607052656);
			Class36.anInt330 -= -308717705;
			if (!class523_sub27_sub6.aBool11638) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				Class523_Sub27_Sub8 class523_sub27_sub8;
				for (class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass14_338.getFromIndex(l)); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (class523_sub27_sub8 != null && class523_sub27_sub8.method18085(class523_sub27_sub6, -1564215867))
					Class308.method5598(class523_sub27_sub8, -790601632);
			} else {
				for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.next(768418218))) {
					if (class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)) {
						boolean bool = false;
						for (Class523_Sub27_Sub6 class523_sub27_sub6_73_ = ((Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.first(-1426448868)); class523_sub27_sub6_73_ != null; class523_sub27_sub6_73_ = ((Class523_Sub27_Sub6) class523_sub27_sub8.aClass697_11718.next(768418218))) {
							if (class523_sub27_sub6_73_ == class523_sub27_sub6) {
								if (class523_sub27_sub8.method18085(class523_sub27_sub6, -1564215867))
									Class308.method5598(class523_sub27_sub8, -195684800);
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

	static final void method4257(Class669 class669, int i) {
		int i_74_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (Class380.aClass473_3938.method7739(i_74_, (byte) -36).aString11726);
	}

	static void method4258(Class523_Sub27_Sub6 class523_sub27_sub6, int i) {
		if (null != class523_sub27_sub6) {
			Class36.aClass708_342.method14236(class523_sub27_sub6, -740245631);
			Class36.anInt330 += -308717705;
			Object object = null;
			Class523_Sub27_Sub8 class523_sub27_sub8;
			if (!class523_sub27_sub6.aBool11638 && !"".equals(class523_sub27_sub6.aString11637)) {
				long l = class523_sub27_sub6.aLong11628 * 5220346430341563535L;
				for (class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass14_338.getFromIndex(l)); (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637)); class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass14_338.method740(231172810))) {
					/* empty */
				}
				if (null == class523_sub27_sub8) {
					class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass209_335.method3767(l));
					if (null != class523_sub27_sub8 && !class523_sub27_sub8.aString11720.equals(class523_sub27_sub6.aString11637))
						class523_sub27_sub8 = null;
					if (class523_sub27_sub8 == null)
						class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
					Class36.aClass14_338.method738(class523_sub27_sub8, l);
					Class36.anInt336 += -599051637;
				}
			} else {
				class523_sub27_sub8 = new Class523_Sub27_Sub8(class523_sub27_sub6.aString11637);
				Class36.anInt336 += -599051637;
			}
			if (class523_sub27_sub8.method18084(class523_sub27_sub6, (byte) 1))
				Class308.method5598(class523_sub27_sub8, -276728441);
		}
	}
}
