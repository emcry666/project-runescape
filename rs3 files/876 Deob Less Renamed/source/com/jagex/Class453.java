/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class453 {
	int anInt4975;
	int anInt4976;
	int anInt4977;
	byte[] aByteArray4978;

	Class453(int i, int i_0_, int i_1_, int i_2_, byte[] is) {
		anInt4976 = i * -568123669;
		anInt4977 = -337296039 * i_0_;
		anInt4975 = 614546921 * i_1_;
		aByteArray4978 = is;
	}

	static final void method7316(boolean bool, Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_3_, -1116357714);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		if (bool)
			Class522_Sub1.method15785(class242, class250, (byte) -56);
		else
			Class383.method6423(class242, class250, -99020803);
	}

	static final void method7317(byte i) {
		if (client.anInt11186 * -1614846429 != -1) {
			int i_4_ = Class642.aClass561_8334.method9426((byte) 92);
			int i_5_ = Class642.aClass561_8334.method9432(-1327394136);
			Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(1009872067));
			if (null != class523_sub39) {
				i_4_ = class523_sub39.method16519(-706711452);
				i_5_ = class523_sub39.method16520((byte) 127);
			}
			if (null != client.aClass250_11197 && client.aClass250_11198 == Class474.aClass250_5391) {
				client.aBool11213 = true;
				client.anInt11270 = 0;
				client.anInt11204 = 0;
				client.anInt11158 = -448551605 * Class170.anInt1833;
				client.anInt11206 = Class254.anInt2742 * 582635681;
			}
			Class599.method9860(null, client.anInt11186 * -1614846429, 0, 0, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, 0, 0, i_4_, i_5_, -117971077);
			if (null != RSSocket.aClass250_15)
				Class680.method13841(i_4_, i_5_, (byte) -106);
		}
	}

	static void method7318(Class669 class669, short i) {
		class669.anIntArray8557[class669.anInt8558 * 1357652815 - 2] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815) - 2]), (byte) -2)).method5072(Class98_Sub1_Sub2.playerVarsProvider, class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1], -2082270816)) ? 1 : 0;
		class669.anInt8558 -= 2138772399;
	}

	public static int method7319(int i, int i_6_, boolean bool, boolean bool_7_, byte i_8_) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool_7_, -1647693954);
		if (class523_sub1 == null)
			return 0;
		int i_9_ = 0;
		for (int i_10_ = 0; i_10_ < class523_sub1.itemIds.length; i_10_++) {
			if (class523_sub1.itemIds[i_10_] >= 0 && (class523_sub1.itemIds[i_10_] < (Class523_Sub37.aClass53_Sub8_10677.anInt721 * 787510181))) {
				ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(class523_sub1.itemIds[i_10_], (byte) 22)));
				int i_11_ = class12.method669(i_6_, (((Class76) Class60.aClass53_Sub22_766.getDefinition(i_6_, (byte) -69)).anInt850) * -1100663923, -1805432827);
				if (bool)
					i_9_ += class523_sub1.itemAmounts[i_10_] * i_11_;
				else
					i_9_ += i_11_;
			}
		}
		return i_9_;
	}
}
