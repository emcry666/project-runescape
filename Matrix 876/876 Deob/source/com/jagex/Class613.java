/* Class613 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class613 {
	public Interface68 anInterface68_8018;

	void method10046(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1984083080);
			if (0 == i)
				break;
			if (i == 1)
				anInterface68_8018 = Class533.method8803(class523_sub34, (byte) 8);
		}
	}

	void method10047(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(2016874478);
			if (0 == i)
				break;
			if (i == 1)
				anInterface68_8018 = Class533.method8803(class523_sub34, (byte) 8);
		}
	}

	public Class613(Class472 class472) {
		byte[] is = class472.method7721((Class620.aClass620_8066.anInt8073 * 1325648699), -387132909);
		if (null != is)
			method10048(new RSBuffer(is), -1667043721);
	}

	void method10048(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(1386228495);
			if (0 == i_0_)
				break;
			if (i_0_ == 1)
				anInterface68_8018 = Class533.method8803(class523_sub34, (byte) 8);
		}
	}

	void method10049(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(169032458);
			if (0 == i)
				break;
			if (i == 1)
				anInterface68_8018 = Class533.method8803(class523_sub34, (byte) 8);
		}
	}

	void method10050(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-957222798);
			if (0 == i)
				break;
			if (i == 1)
				anInterface68_8018 = Class533.method8803(class523_sub34, (byte) 8);
		}
	}

	static final void method10051(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class191.method3623(class250, class242, class669, 457413031);
	}

	static final void method10052(Class669 class669, int i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class482.method7918((char) i_1_, (byte) -28) ? 1 : 0;
	}

	static final void method10053(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class663.anInt8516 * -61549695;
	}

	static final void method10054(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2542 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static void method10055(Class178 class178, int i, int i_2_, InterfaceComponentDefinitions class250, Class145 class145, int i_3_, int i_4_, int i_5_) {
		for (int i_6_ = 0; i_6_ < client.anInt11050 * 920163749; i_6_++) {
			Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) client.anIntArray11051[i_6_]));
			if (null != class523_sub28) {
				NPC class647_sub1_sub3_sub1_sub1 = ((NPC) class523_sub28.anObject10554);
				if (class647_sub1_sub3_sub1_sub1.method18627(2079325769) && (class647_sub1_sub3_sub1_sub1.aByte10821 == (Class241.player.aByte10821))) {
					NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
					if (null != class300 && class300.anIntArray3286 != null)
						class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) 61);
					if (null != class300 && class300.aBool3273 && class300.aBool3287) {
						Class437 class437 = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
						int i_7_ = (int) class437.aFloat4903 / 128 - i / 128;
						int i_8_ = (int) class437.aFloat4905 / 128 - i_2_ / 128;
						if (-1 != class300.anInt3279 * -287613779)
							Class523_Sub11.method15946(class178, class145, class250, i_3_, i_4_, i_7_, i_8_, (-287613779 * class300.anInt3279), -405425510);
						else
							Class203.method3705(class250, class145, i_3_, i_4_, i_7_, i_8_, Class501.aClass148Array5584[1], -867631999);
					}
				}
			}
		}
	}
}
