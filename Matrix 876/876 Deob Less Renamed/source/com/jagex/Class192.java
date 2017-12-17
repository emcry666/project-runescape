/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class192 {
	static final int anInt2170 = 25;
	int anInt2171;
	public int anInt2172;
	Class647_Sub1_Sub3_Sub1_Sub1 aClass647_Sub1_Sub3_Sub1_Sub1_2173;
	public boolean aBool2174 = false;
	Player aClass647_Sub1_Sub3_Sub1_Sub2_2175;
	int[] anIntArray2176;
	static int anInt2177;
	static String[] aStringArray2178;

	void method3628(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (!aBool2174) {
			aBool2174 = true;
			if (-580266303 * anInt2172 >= 0) {
				aClass647_Sub1_Sub3_Sub1_Sub1_2173 = (new Class647_Sub1_Sub3_Sub1_Sub1(client.aClass505_11019.method8241((byte) -93), 25));
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11888 = -39653875 * anInt2171;
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11916 = client.anInt11011 * 395066505;
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18622(((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(anInt2172 * -580266303, (byte) 18)), -65534);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18344((aClass647_Sub1_Sub3_Sub1_Sub1_2173.aClass300_12175.anInt3260) * 1610497933, 2098337383);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11922 = 876423069 * ((aClass647_Sub1_Sub3_Sub1_Sub1_2173.aClass300_12175.anInt3285) * 486429345 << 3);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11896 = (((Class191.anInt2156 += -1078043049) * 629894503 - 1) * 905781779);
			} else {
				aClass647_Sub1_Sub3_Sub1_Sub2_2175 = (new Player(client.aClass505_11019.method8241((byte) -119), 25));
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.decodeAppearance(Class145_Sub1.aClass523_Sub34_9522, 927545689);
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11888 = anInt2171 * -39653875;
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11916 = 395066505 * client.anInt11011;
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11896 = (((Class191.anInt2156 += -1078043049) * 629894503 - 1) * 905781779);
			}
		}
		if (anInt2172 * -580266303 >= 0) {
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18626(i_1_, i, i_0_, true, aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18338(2146696881), 2033108516);
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18332(i_2_, true, 1958307138);
		} else {
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10821 = aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10818 = (byte) i_1_;
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18666(i, i_0_, (byte) 29);
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18332(i_2_, true, 1958307138);
		}
	}

	Class192(Class523_Sub34 class523_sub34, int i) {
		aClass647_Sub1_Sub3_Sub1_Sub1_2173 = null;
		aClass647_Sub1_Sub3_Sub1_Sub2_2175 = null;
		anInt2171 = -1619463991 * i;
		int i_4_ = class523_sub34.readUnsignedByte(768513603);
		switch (i_4_) {
		case 1:
			anInt2172 = 22038207;
			break;
		case 0:
			anInt2172 = class523_sub34.readBigSmart((byte) -85) * -22038207;
			break;
		default:
			anInt2172 = 22038207;
		}
		class523_sub34.readString(-1913787470);
	}

	void method3629(int i) {
		aClass647_Sub1_Sub3_Sub1_Sub1_2173 = null;
		aClass647_Sub1_Sub3_Sub1_Sub2_2175 = null;
		aBool2174 = false;
	}

	void method3630(int i, int i_5_, int i_6_, byte i_7_) {
		if (null != aClass647_Sub1_Sub3_Sub1_Sub1_2173)
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18626(i, i_5_, i_6_, true, aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18338(2146694679), 1984043952);
		else {
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10821 = aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10818 = (byte) i;
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18666(i_5_, i_6_, (byte) 17);
		}
	}

	public Class647_Sub1_Sub3_Sub1 method3631(int i) {
		if (aClass647_Sub1_Sub3_Sub1_Sub1_2173 != null)
			return aClass647_Sub1_Sub3_Sub1_Sub1_2173;
		return aClass647_Sub1_Sub3_Sub1_Sub2_2175;
	}

	boolean method3632(int i) {
		if (-580266303 * anInt2172 >= 0) {
			NPCDefinition class300 = ((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(-580266303 * anInt2172, (byte) 112));
			boolean bool = class300.method5487(-5864941);
			if (null == anIntArray2176) {
				Class588 class588 = ((Class588) Class80.aClass53_Sub17_866.getDefinition((-764434723 * (class300.anInt3258)), (byte) 43));
				anIntArray2176 = class588.method9720((byte) 3);
			}
			int[] is = anIntArray2176;
			for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
				int i_9_ = is[i_8_];
				bool &= ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(i_9_, (byte) -91)).method3719(169699403);
			}
			return bool;
		}
		return true;
	}

	void method3633(int i, int i_10_, int i_11_, int i_12_) {
		if (!aBool2174) {
			aBool2174 = true;
			if (-580266303 * anInt2172 >= 0) {
				aClass647_Sub1_Sub3_Sub1_Sub1_2173 = (new Class647_Sub1_Sub3_Sub1_Sub1(client.aClass505_11019.method8241((byte) -6), 25));
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11888 = -39653875 * anInt2171;
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11916 = client.anInt11011 * 395066505;
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18622(((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(anInt2172 * -580266303, (byte) -44)), -65534);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18344((aClass647_Sub1_Sub3_Sub1_Sub1_2173.aClass300_12175.anInt3260) * 1610497933, 2066964817);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11922 = 876423069 * ((aClass647_Sub1_Sub3_Sub1_Sub1_2173.aClass300_12175.anInt3285) * 486429345 << 3);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11896 = (((Class191.anInt2156 += -1078043049) * 629894503 - 1) * 905781779);
			} else {
				aClass647_Sub1_Sub3_Sub1_Sub2_2175 = (new Player(client.aClass505_11019.method8241((byte) -54), 25));
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.decodeAppearance(Class145_Sub1.aClass523_Sub34_9522, 783851710);
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11888 = anInt2171 * -39653875;
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11916 = 395066505 * client.anInt11011;
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11896 = (((Class191.anInt2156 += -1078043049) * 629894503 - 1) * 905781779);
			}
		}
		if (anInt2172 * -580266303 >= 0) {
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18626(i_11_, i, i_10_, true, aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18338(2141409026), 2046105244);
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18332(i_12_, true, 1958307138);
		} else {
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10821 = aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10818 = (byte) i_11_;
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18666(i, i_10_, (byte) 16);
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18332(i_12_, true, 1958307138);
		}
	}

	void method3634(int i, int i_13_, int i_14_, int i_15_) {
		if (!aBool2174) {
			aBool2174 = true;
			if (-580266303 * anInt2172 >= 0) {
				aClass647_Sub1_Sub3_Sub1_Sub1_2173 = (new Class647_Sub1_Sub3_Sub1_Sub1(client.aClass505_11019.method8241((byte) -52), 25));
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11888 = -39653875 * anInt2171;
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11916 = client.anInt11011 * 395066505;
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18622(((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(anInt2172 * -580266303, (byte) 54)), -65534);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18344((aClass647_Sub1_Sub3_Sub1_Sub1_2173.aClass300_12175.anInt3260) * 1610497933, 1742900941);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11922 = 876423069 * ((aClass647_Sub1_Sub3_Sub1_Sub1_2173.aClass300_12175.anInt3285) * 486429345 << 3);
				aClass647_Sub1_Sub3_Sub1_Sub1_2173.anInt11896 = (((Class191.anInt2156 += -1078043049) * 629894503 - 1) * 905781779);
			} else {
				aClass647_Sub1_Sub3_Sub1_Sub2_2175 = (new Player(client.aClass505_11019.method8241((byte) -88), 25));
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.decodeAppearance(Class145_Sub1.aClass523_Sub34_9522, 944888310);
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11888 = anInt2171 * -39653875;
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11916 = 395066505 * client.anInt11011;
				aClass647_Sub1_Sub3_Sub1_Sub2_2175.anInt11896 = (((Class191.anInt2156 += -1078043049) * 629894503 - 1) * 905781779);
			}
		}
		if (anInt2172 * -580266303 >= 0) {
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18626(i_14_, i, i_13_, true, aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18338(2144826260), 1948807989);
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18332(i_15_, true, 1958307138);
		} else {
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10821 = aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10818 = (byte) i_14_;
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18666(i, i_13_, (byte) 120);
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18332(i_15_, true, 1958307138);
		}
	}

	void method3635(int i, int i_16_, int i_17_) {
		if (null != aClass647_Sub1_Sub3_Sub1_Sub1_2173)
			aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18626(i, i_16_, i_17_, true, aClass647_Sub1_Sub3_Sub1_Sub1_2173.method18338(2140853429), 1747467636);
		else {
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10821 = aClass647_Sub1_Sub3_Sub1_Sub2_2175.aByte10818 = (byte) i;
			aClass647_Sub1_Sub3_Sub1_Sub2_2175.method18666(i_16_, i_17_, (byte) 99);
		}
	}

	boolean method3636() {
		if (-580266303 * anInt2172 >= 0) {
			NPCDefinition class300 = ((NPCDefinition) Class174.aClass53_Sub7_1856.getDefinition(-580266303 * anInt2172, (byte) 1));
			boolean bool = class300.method5487(-1038469651);
			if (null == anIntArray2176) {
				Class588 class588 = ((Class588) Class80.aClass53_Sub17_866.getDefinition((-764434723 * (class300.anInt3258)), (byte) -5));
				anIntArray2176 = class588.method9720((byte) 3);
			}
			int[] is = anIntArray2176;
			for (int i = 0; i < is.length; i++) {
				int i_18_ = is[i];
				bool &= ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(i_18_, (byte) -47)).method3719(169699403);
			}
			return bool;
		}
		return true;
	}

	static final void method3637(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub42_10612.method17128(528753049) ? 1 : 0;
	}

	static void method3638(byte i) {
		Class551_Sub1.anIntArray10597[44] = 71;
		Class551_Sub1.anIntArray10597[45] = 26;
		Class551_Sub1.anIntArray10597[46] = 72;
		Class551_Sub1.anIntArray10597[47] = 73;
		Class551_Sub1.anIntArray10597[59] = 57;
		Class551_Sub1.anIntArray10597[61] = 27;
		Class551_Sub1.anIntArray10597[91] = 42;
		Class551_Sub1.anIntArray10597[92] = 74;
		Class551_Sub1.anIntArray10597[93] = 43;
		Class551_Sub1.anIntArray10597[192] = 28;
		Class551_Sub1.anIntArray10597[222] = 58;
		Class551_Sub1.anIntArray10597[520] = 59;
	}
}
