/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class221 implements Interface44 {
	Class217 this$0;
	static NetworkStream aClass557_2332;

	public float method338(short i) {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10637.method16930(828895072) / 255.0F);
	}

	Class221(Class217 class217) {
		this$0 = class217;
	}

	public float method337() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10637.method16930(888145517) / 255.0F);
	}

	public float method336() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10637.method16930(570963458) / 255.0F);
	}

	public float method339() {
		return ((float) Class449.aClass523_Sub33_4946.aClass687_Sub22_10637.method16930(1471474892) / 255.0F);
	}

	public static Class242 method4132(int i, int[] is, Class242 class242, boolean bool, byte i_0_) {
		if (!Class251.aClass472_2716.method7651(i, (byte) -25))
			return null;
		int i_1_ = Class251.aClass472_2716.method7702(i, (byte) -62);
		InterfaceComponentDefinitions[] class250s;
		if (i_1_ == 0)
			class250s = new InterfaceComponentDefinitions[0];
		else if (class242 == null)
			class250s = new InterfaceComponentDefinitions[i_1_];
		else
			class250s = class242.aClass250Array2457;
		if (class242 == null)
			class242 = new Class242(bool, class250s);
		else {
			class242.aClass250Array2457 = class250s;
			class242.aBool2456 = bool;
		}
		for (int index = 0; index < i_1_; index++) {
			if (class242.aClass250Array2457[index] == null) {
				byte[] data = Class251.aClass472_2716.method7648(i, index, is, -1876906699);
				if (data != null) {
					InterfaceComponentDefinitions definitions = class242.aClass250Array2457[index] = new InterfaceComponentDefinitions();
					definitions.interfaceHash = -2111216817 * (index + (i << 16));
					definitions.decode(new RSBuffer(data), (byte) 18);
				}
			}
		}
		return class242;
	}

	public static Class606[] method4133(int i) {
		return (new Class606[] { Class606.aClass606_7959, Class606.aClass606_7956, Class606.aClass606_7960, Class606.aClass606_7958, Class606.aClass606_7957, Class606.aClass606_7961 });
	}

	static final void method4134(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class316.method5685(1125055579);
	}

	public static void method4135(int i, String string, boolean bool, int i_4_) {
		if (Class653_Sub1.method16688((byte) 38)) {
			if (Class43.anInt572 * 426956199 != i)
				Class43.aLong573 = -9083684963104943157L;
			Class43.anInt572 = i * -1907326441;
			Class43.aString583 = string;
			Class43.aBool588 = bool;
			client.aClass116_11057.method1980((short) -19605);
			Class657.method10791(1, (byte) -63);
		}
	}

	static int method4136(CharSequence charsequence, int i, boolean bool, int i_5_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		int i_8_ = 0;
		int i_9_ = charsequence.length();
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			int i_11_ = charsequence.charAt(i_10_);
			if (0 == i_10_) {
				if (45 == i_11_) {
					bool_6_ = true;
					continue;
				}
				if (43 == i_11_ && bool)
					continue;
			}
			if (i_11_ >= 48 && i_11_ <= 57)
				i_11_ -= 48;
			else if (i_11_ >= 65 && i_11_ <= 90)
				i_11_ -= 55;
			else if (i_11_ >= 97 && i_11_ <= 122)
				i_11_ -= 87;
			else
				throw new NumberFormatException();
			if (i_11_ >= i)
				throw new NumberFormatException();
			if (bool_6_)
				i_11_ = -i_11_;
			int i_12_ = i_11_ + i * i_8_;
			if (i_12_ / i != i_8_)
				throw new NumberFormatException();
			i_8_ = i_12_;
			bool_7_ = true;
		}
		if (!bool_7_)
			throw new NumberFormatException();
		return i_8_;
	}

	static void method4137(int i) {
		if (19 == client.anInt11136 * -2020118759)
			Class317.method5688((byte) -14);
		client.aClass116_11057.method1980((short) -4752);
		Class195.method3665((byte) 93);
		Class341.aBool3608 = true;
		Class53.method1307(2002920728);
		for (int i_13_ = 0; i_13_ < client.aClass111Array11017.length; i_13_++)
			client.aClass111Array11017[i_13_] = null;
		client.aBool11000 = false;
		client.anInt11087 = ((int) (Math.random() * 100.0) - 50) * 1986511139;
		client.anInt11089 = ((int) (Math.random() * 110.0) - 55) * -550134747;
		client.anInt11091 = ((int) (Math.random() * 80.0) - 40) * -109611635;
		client.anInt11094 = ((int) (Math.random() * 120.0) - 60) * 873943879;
		client.anInt11068 = ((int) (Math.random() * 30.0) - 20) * -1743116029;
		client.aFloat11129 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class689.method13950(973717376);
		for (int i_14_ = 0; i_14_ < 2048; i_14_++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_14_] = null;
		Class241.player = null;
		client.anInt11050 = 0;
		client.anInt11049 = 0;
		client.aClass14_11047.method733(-154935081);
		client.aClass708_11074.method14235((byte) -23);
		client.aClass14_11174.method733(1370807668);
		client.aClass701_11132.method14082((byte) -72);
		client.aClass14_11172.method733(1561567736);
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
			Class375_Sub2.method15718(-1614846429 * client.anInt11186, -1740295868);
		for (Class523_Sub36 class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255)); class523_sub36 != null; class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method749(-400995440))) {
			if (!class523_sub36.method8660(1770056844)) {
				class523_sub36 = ((Class523_Sub36) client.aClass14_11187.method735(-380907255));
				if (class523_sub36 == null)
					break;
			}
			Class579.method9657(class523_sub36, true, false, -2107595360);
		}
		client.anInt11186 = 1924171381;
		client.aClass14_11187 = new Class14(8);
		Class110.method1923((byte) 1);
		client.aClass250_11189 = null;
		for (int i_15_ = 0; i_15_ < 8; i_15_++) {
			client.aStringArray11316[i_15_] = null;
			client.aBoolArray11169[i_15_] = false;
			client.anIntArray11167[i_15_] = -1;
		}
		Class39.method1131((short) 5424);
		client.aBool11009 = true;
		for (int i_16_ = 0; i_16_ < 106; i_16_++)
			client.aBoolArray11246[i_16_] = true;
		for (int i_17_ = 0; i_17_ < 3; i_17_++) {
			for (int i_18_ = 0; i_18_ < 8; i_18_++)
				client.exchangeOfferSlots[i_17_][i_18_] = new Class481();
		}
		client.aClass505_11019.method8271((byte) 8).method10249(-755151478);
		client.aBool11111 = true;
		Class602.aShortArray7864 = NPCDefinition.aShortArray3249 = ItemDefinitions.aShortArray162 = new short[256];
		Class17.aString191 = Class39.aClass39_493.method1124(Class53_Sub20.aClass668_10979, (byte) -16);
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub19_10634, Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16906(-2128671585), -734795004);
		client.anInt11060 = 0;
		QuickChatStringType.method10448((byte) 38);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
	}

	public static String method4138(byte[] is, int i) {
		return Class599.method9859(is, 0, is.length, (short) -2808);
	}
}
