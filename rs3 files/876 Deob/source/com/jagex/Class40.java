/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class40 {
	Class210 aClass210_553 = Class210.aClass210_2258;
	int anInt554;
	int anInt555;
	int anInt556;
	boolean aBool557;

	Class40() {
		/* empty */
	}

	static void method1133(Player class647_sub1_sub3_sub1_sub2, boolean bool, short i) {
		if (Class36.anInt330 * 462991943 < 409) {
			if (Class241.player == class647_sub1_sub3_sub1_sub2) {
				if (client.aBool11000 && 0 != (382935923 * Class570.anInt7658 & 0x10))
					Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16777215, 342070251)).append(Class39.aClass39_464.method1124(Class53_Sub20.aClass668_10979, (byte) -9)).toString(), Class684.anInt8664 * 2088669163, 16, -1, 0L, 0, 0, true, false, (long) (class647_sub1_sub3_sub1_sub2.anInt11888 * -1087669731), false, (byte) 29);
			} else {
				String string;
				if (0 == -476056167 * class647_sub1_sub3_sub1_sub2.anInt12189) {
					boolean bool_0_ = true;
					if ((Class241.player.anInt12178 * 1202781135) != -1 && -1 != (1202781135 * class647_sub1_sub3_sub1_sub2.anInt12178)) {
						int i_1_ = (((Class241.player.anInt12178) * 1202781135 < (1202781135 * class647_sub1_sub3_sub1_sub2.anInt12178)) ? (1202781135 * (Class241.player.anInt12178)) : (1202781135 * class647_sub1_sub3_sub1_sub2.anInt12178));
						int i_2_ = ((Class241.player.anInt12186) * 1773490063 - (1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186));
						if (i_2_ < 0)
							i_2_ = -i_2_;
						if (i_2_ > i_1_)
							bool_0_ = false;
					}
					String string_3_ = (client.aClass681_11284 == Class681.aClass681_8641 ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -28)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -3)));
					if (class647_sub1_sub3_sub1_sub2.anInt12186 * 1773490063 >= 98635177 * class647_sub1_sub3_sub1_sub2.anInt12187)
						string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 643273452)).append(bool_0_ ? (Class443.method7204((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)), (1773490063 * (Class241.player.anInt12186)), (byte) -20)) : Class495.method8101(16777215, -183316928)).append(Class31.aString297).append(string_3_).append(1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186).append(Class31.aString295).toString();
					else
						string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 1760675182)).append(bool_0_ ? (Class443.method7204((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)), (1773490063 * (Class241.player.anInt12186)), (byte) -38)) : Class495.method8101(16777215, 801853259)).append(Class31.aString297).append(string_3_).append(1773490063 * class647_sub1_sub3_sub1_sub2.anInt12186).append("+").append((98635177 * class647_sub1_sub3_sub1_sub2.anInt12187) - (class647_sub1_sub3_sub1_sub2.anInt12186 * 1773490063)).append(Class31.aString295).toString();
				} else if (-1 == (-476056167 * class647_sub1_sub3_sub1_sub2.anInt12189))
					string = class647_sub1_sub3_sub1_sub2.method18682(true, 1934876047);
				else
					string = new StringBuilder().append(class647_sub1_sub3_sub1_sub2.method18682(true, 1027560473)).append(Class31.aString297).append(Class39.aClass39_526.method1124(Class53_Sub20.aClass668_10979, (byte) -92)).append(class647_sub1_sub3_sub1_sub2.anInt12189 * -476056167).append(Class31.aString295).toString();
				boolean bool_4_ = false;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && -1 != -1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106)) {
					NPCDefinition class300 = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) -87)));
					if (class300.aBool3308) {
						bool_4_ = true;
						string = ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) -46))).name;
						if (0 != class300.anInt3295 * -380812719) {
							String string_5_ = ((Class681.aClass681_8641 == client.aClass681_11284) ? (Class39.aClass39_532.method1124(Class53_Sub20.aClass668_10979, (byte) -7)) : (Class39.aClass39_511.method1124(Class53_Sub20.aClass668_10979, (byte) -9)));
							string = new StringBuilder().append(string).append(Class443.method7204(class300.anInt3295 * -380812719, (Class241.player.anInt12186) * 1773490063, (byte) -42)).append(Class31.aString297).append(string_5_).append(class300.anInt3295 * -380812719).append(Class31.aString295).toString();
						}
					}
				}
				if (client.aBool11000 && !bool && (382935923 * Class570.anInt7658 & 0x8) != 0)
					Class463.method7523(client.aString11016, new StringBuilder().append(client.aString11225).append(" ").append(Class31.aString299).append(" ").append(Class495.method8101(16777215, -694077466)).append(string).toString(), 2088669163 * Class684.anInt8664, 15, -1, (long) (class647_sub1_sub3_sub1_sub2.anInt11888 * -1087669731), 0, 0, true, false, (long) (-1087669731 * class647_sub1_sub3_sub1_sub2.anInt11888), false, (byte) -99);
				if (!bool) {
					for (int i_6_ = 7; i_6_ >= 0; i_6_--) {
						if (null != client.aStringArray11316[i_6_]) {
							short i_7_ = 0;
							if ((Class681.aClass681_8646 == client.aClass681_11284) && (client.aStringArray11316[i_6_].equalsIgnoreCase(Class39.aClass39_506.method1124(Class53_Sub20.aClass668_10979, (byte) -128)))) {
								if (Class614.aClass614_8020 == client.aClass614_11032)
									i_7_ = (short) 2000;
								else if ((Class614.aClass614_8022 == client.aClass614_11032) && ((1773490063 * (class647_sub1_sub3_sub1_sub2.anInt12186)) > (Class241.player.anInt12186) * 1773490063))
									i_7_ = (short) 2000;
								if ((0 != (-514698785 * (Class241.player.anInt12192))) && 0 != (-514698785 * (class647_sub1_sub3_sub1_sub2.anInt12192))) {
									if ((-514698785 * (class647_sub1_sub3_sub1_sub2.anInt12192)) == (Class241.player.anInt12192) * -514698785)
										i_7_ = (short) 2000;
									else
										i_7_ = (short) 0;
								} else if (class647_sub1_sub3_sub1_sub2.isInAClan)
									i_7_ = (short) 2000;
							} else if (client.aBoolArray11169[i_6_])
								i_7_ = (short) 2000;
							short i_8_ = (short) (i_7_ + client.aShortArray11166[i_6_]);
							int i_9_ = (-1 != client.anIntArray11167[i_6_] ? client.anIntArray11167[i_6_] : client.anInt11179 * 952073761);
							int i_10_ = bool_4_ ? 16776960 : 16777215;
							Class463.method7523(client.aStringArray11316[i_6_], new StringBuilder().append(Class495.method8101(i_10_, 965892124)).append(string).toString(), i_9_, i_8_, -1, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), 0, 0, true, false, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), false, (byte) 31);
						}
					}
				} else if (!bool_4_)
					Class463.method7523(new StringBuilder().append(Class495.method8101(13421772, 1121134203)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1087669731 * (class647_sub1_sub3_sub1_sub2.anInt11888)), false, (byte) 36);
				if (!bool && !bool_4_) {
					for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(1252974719)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) -43))) {
						if (23 == class523_sub27_sub6.anInt11639 * -2101009827) {
							class523_sub27_sub6.aString11633 = new StringBuilder().append(Class495.method8101(16777215, -428239985)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static final void method1134(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class214.method3838(class250, class242, class669, -1517952983);
	}

	static final void method1135(Class669 class669, int i) {
		VarBitDefinitions class309 = (VarBitDefinitions) (class669.aClass523_Sub27_Sub19_8580.anObjectArray11845[1180759405 * class669.anInt8579]);
		Interface20 interface20 = ((Interface20) (class669.anIntArray8577[1180759405 * class669.anInt8579] == 0 ? class669.aMap8573.get(class309.aClass159_3367.aClass470_1755) : class669.aMap8556.get(class309.aClass159_3367.aClass470_1755)));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = interface20.method93(class309, -57827148);
	}

	static final void method1136(Class669 class669, int i) {
		Class194_Sub15.method15517(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], 1799315845);
	}

	static final void method1137(InterfaceComponentDefinitions class250, Class669 class669, byte i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_12_ = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) - 1);
		if (6 != class250.modelType * -428962391)
			throw new RuntimeException("");
		NPCDefinition class300 = ((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(-2080195333 * class250.anInt2571, (byte) 42));
		if (class250.aClass302_2553 == null)
			class250.aClass302_2553 = new Class302(class300, true);
		class250.aClass302_2553.aLong3337 = Class547.method9086((byte) 9) * 1634705471692094829L;
		if (i_12_ < 0 || i_12_ >= class300.anIntArray3255.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_12_).toString());
		class250.aClass302_2553.anIntArray3332[i_12_] = i_11_;
		Login.method15991(class250, (byte) -82);
	}
}
