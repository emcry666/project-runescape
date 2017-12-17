/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class242 {
	public boolean aBool2456;
	public Class250[] aClass250Array2457;
	Class250[] aClass250Array2458;

	public Class250 method4364(int i) {
		if (i >>> 16 != aClass250Array2457[0].anInt2585 * -1363815505 >>> 16)
			throw new IllegalArgumentException();
		return aClass250Array2457[i & 0xffff];
	}

	public Class250[] method4365(byte i) {
		return (aClass250Array2458 == null ? aClass250Array2457 : aClass250Array2458);
	}

	Class242(boolean bool, Class250[] class250s) {
		aClass250Array2457 = class250s;
		aBool2456 = bool;
	}

	public Class250 method4366(int i, int i_0_) {
		if (i >>> 16 != aClass250Array2457[0].anInt2585 * -1363815505 >>> 16)
			throw new IllegalArgumentException();
		return aClass250Array2457[i & 0xffff];
	}

	public Class250[] method4367() {
		return (aClass250Array2458 == null ? aClass250Array2457 : aClass250Array2458);
	}

	public Class250[] method4368() {
		return (aClass250Array2458 == null ? aClass250Array2457 : aClass250Array2458);
	}

	public Class250[] method4369(int i) {
		if (aClass250Array2458 == null) {
			int i_1_ = aClass250Array2457.length;
			aClass250Array2458 = new Class250[i_1_];
			System.arraycopy(aClass250Array2457, 0, aClass250Array2458, 0, aClass250Array2457.length);
		}
		return aClass250Array2458;
	}

	static final void method4370(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_2_, -645612603);
		Class537.method8942(class250, class669, 1270173165);
	}

	static void method4371(byte i) {
		Class195.method3665((byte) 68);
	}

	public static void method4372(int i, String string, boolean bool, byte i_3_) {
		if (0 == i) {
			Class31.aClass178_303 = Class236.method4290(0, Class523_Sub18_Sub8.aCanvas11689, Class174_Sub1.aClass172_9785, Class333.anInterface25_3512, Class590.aClass390_7803, Class295.aClass399_3177, Class6.aClass397_48, Class519.aClass472_7058, Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -72) * 2, (byte) -90);
			if (string != null) {
				Class31.aClass178_303.method3076(1, 0);
				Class10 class10 = Class628.method10312(Class272.aClass472_2886, Class34.anInt314 * -672958487, 0, Class491.aClass423_5536, (byte) 119);
				Class164 class164 = (Class31.aClass178_303.method3111(class10, Class166.method2672(Class523_Sub8.aClass472_10406, Class34.anInt314 * -672958487, 0), true));
				Class410.method6632(1143223071);
				Class397.method6524(string, true, Class31.aClass178_303, class164, class10, -1216742667);
			}
		} else {
			Class178 class178 = null;
			if (null != string) {
				class178 = Class236.method4290(0, Class523_Sub18_Sub8.aCanvas11689, Class174_Sub1.aClass172_9785, Class333.anInterface25_3512, Class590.aClass390_7803, Class295.aClass399_3177, Class6.aClass397_48, Class519.aClass472_7058, 0, (byte) -82);
				class178.method3076(1, 0);
				Class10 class10 = Class696.method14010(Class272.aClass472_2886, Class34.anInt314 * -672958487, 0, 2142781426);
				Class164 class164 = (class178.method3111(class10, Class166.method2672(Class523_Sub8.aClass472_10406, Class34.anInt314 * -672958487, 0), true));
				Class410.method6632(1999784549);
				Class397.method6524(string, true, class178, class164, class10, -1810758235);
				try {
					class178.method3024(1380373231);
					class178 = null;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			try {
				try {
					Class571.method9620((byte) 17);
					System.gc();
					Class31.aClass178_303 = Class236.method4290(i, Class523_Sub18_Sub8.aCanvas11689, Class174_Sub1.aClass172_9785, Class333.anInterface25_3512, Class590.aClass390_7803, Class295.aClass399_3177, Class6.aClass397_48, Class519.aClass472_7058, Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -3) * 2, (byte) -69);
					Class491.aClass423_5536 = new Class423(Class31.aClass178_303, Class523_Sub8.aClass472_10406, Class272.aClass472_2886, Class33.method922((byte) -50));
					if (Class31.aClass178_303.method3026()) {
						boolean bool_4_ = true;
						try {
							bool_4_ = (Class218.aClass523_Sub41_2319.anInt10758 * -1222917157) > 256;
						} catch (Throwable throwable) {
							/* empty */
						}
						Class523_Sub8 class523_sub8;
						if (bool_4_)
							class523_sub8 = Class31.aClass178_303.method3385(146800640);
						else
							class523_sub8 = Class31.aClass178_303.method3385(104857600);
						Class31.aClass178_303.method3099(class523_sub8);
					}
				} catch (Throwable throwable) {
					switch (i) {
					case 1:
						Class304.method5545(Class64.aClass64_784, (byte) -93);
						break;
					case 3:
						Class304.method5545(Class64.aClass64_778, (byte) -89);
						break;
					}
					if (throwable instanceof RuntimeException_Sub3) {
						Class449.aClass523_Sub33_4946.aClass687_Sub39_10605.method13892(0, -1715432815);
						Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method13892(0, -2120815783);
					}
					int i_5_ = Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 32);
					Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630, 0, 1346212627);
					if (class178 != null) {
						try {
							class178.method3024(-411206248);
							class178 = null;
						} catch (Throwable throwable_6_) {
							/* empty */
						}
					}
					Class571.method9620((byte) 34);
					System.gc();
					method4372(i_5_, string, bool, (byte) 0);
					if (null != class178) {
						try {
							class178.method3024(-1071980808);
						} catch (Throwable throwable_7_) {
							/* empty */
						}
					}
					return;
				}
				if (null != class178) {
					try {
						class178.method3024(-2115334243);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception object) {
				if (null != class178) {
					try {
						class178.method3024(1751044368);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				throw object;
			}
		}
		if (bool)
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), !bool, 1385047703);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), i, 1264076561);
		if (!bool)
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), !bool, 1887547958);
		Class384_Sub2.method15773(-994385930);
		Class31.aClass178_303.method3114(20000);
		Class31.aClass178_303.method3128(32);
		client.aClass505_11019.method8256(160356133);
		if (Class31.aClass178_303.method3030())
			Class101.method1797(Class449.aClass523_Sub33_4946.aClass687_Sub30_10610.method16977((byte) 54) == 1, 2003843477);
		client.aClass505_11019.method8327(true, 779358106);
		client.aClass505_11019.method8271((byte) 8).method10249(-1490193988);
		Class691.method13966(-141197367);
		client.aBool11012 = false;
		client.aBool11013 = false;
		client.aBool11133 = true;
		Class97.aClass695Array1184 = null;
		Class31.aClass178_303.method3192(0.0F, 1.0F);
	}

	public static final void method4373(int i) {
		int i_8_ = Class449.aClass523_Sub33_4946.aClass687_Sub19_10634.method16906(-2130670558);
		if (0 == i_8_) {
			client.aClass505_11019.method8248(null, -1358816105);
			Class251.method4526(0, (byte) -58);
		} else if (1 == i_8_ || 3 == i_8_) {
			Class681.method13847((byte) 0, (byte) 21);
			Class251.method4526(512, (byte) -109);
			if (client.aClass505_11019.method8241((byte) -33) != null)
				Class543.method9009(-67735639);
		} else {
			Class681.method13847((byte) (-487274901 * client.anInt10981 - 4 & 0xff), (byte) 21);
			Class251.method4526(2, (byte) -9);
		}
		client.anInt11140 = Class222.anInt2334 * 1751468745;
	}

	static final void method4374(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
	}
}
