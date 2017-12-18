/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class529 {
	boolean[] aBoolArray7101;
	int anInt7102;
	Class647_Sub1 aClass647_Sub1_7103;
	int anInt7104;
	int anInt7105;
	byte aByte7106;
	boolean aBool7107 = false;
	boolean aBool7108;
	Class707 aClass707_7109;
	Class707 aClass707_7110;
	int anInt7111;
	int anInt7112 = -1689033933;
	int anInt7113;
	Class53_Sub18 aClass53_Sub18_7114;
	boolean aBool7115;
	Class523_Sub27_Sub4 aClass523_Sub27_Sub4_7116;
	boolean aBool7117;
	Class167 aClass167_7118;
	Class621 aClass621_7119;
	Class591 aClass591_7120;
	public static int anInt7121;

	void method8735(Class647_Sub1 class647_sub1) {
		if (aClass707_7110 != null && aClass707_7110.method14161(-175745469)) {
			aClass707_7110.method14205((client.cycles - -55668821 * anInt7111), (byte) 101);
			if (aClass707_7110.method14177(1357652815))
				aClass707_7110.method14164(-1, (byte) 12);
			if (!aClass707_7110.method14170((short) 255)) {
				aClass707_7109 = aClass707_7110;
				aBool7108 = true;
				anInt7111 = client.cycles * 1975513859;
				return;
			}
		}
		if (aClass707_7109.method14161(-1920167840)) {
			if (aClass707_7109.method14205((client.cycles - -55668821 * anInt7111), (byte) 71)) {
				if (Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) == 2)
					aBool7117 = false;
				if (aClass707_7109.method14177(1357652815)) {
					aClass707_7109.method14164(-1, (byte) 12);
					aBool7108 = false;
					method8746(false, -1, 0, 0, 293340314);
				}
			}
		} else
			method8746(false, -1, 0, 0, 1318293986);
		anInt7111 = client.cycles * 1975513859;
	}

	public void method8736(int i, int i_0_, int i_1_) {
		aClass707_7110 = null;
		if (i_0_ > 0) {
			aClass707_7110 = new Class707_Sub2(aClass647_Sub1_7103, false);
			aClass707_7110.method14168(i, i_0_, 1, false, 1840849895);
		} else {
			aBool7108 = true;
			method8746(false, i, 1, 0, 1148757111);
		}
	}

	int method8737(int i) {
		return -2027747265 * anInt7102;
	}

	void method8738(Class591 class591, int i) {
		aClass591_7120 = class591;
		aClass167_7118 = null;
	}

	int method8739() {
		return -2027747265 * anInt7102;
	}

	Class602 method8740(byte i) {
		return (Class602) aClass53_Sub18_7114.getDefinition(241225827 * anInt7104, (byte) -44);
	}

	final Class167 method8741(Class178 class178, int i, boolean bool, boolean bool_2_, int i_3_) {
		Class602 class602 = ((Class602) aClass53_Sub18_7114.getDefinition(anInt7104 * 241225827, (byte) 4));
		if (null != class602.anIntArray7912)
			class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == -1616721887 * client.anInt11071 ? (Interface17) (Class191.anInterface17_2169) : Class98_Sub1_Sub2.playerVarsProvider), 1070022685);
		if (class602 == null) {
			method8744(class178, -1403099590);
			anInt7112 = -1689033933;
			return null;
		}
		if (!aBool7108 && anInt7112 * -1876643835 != -2005438859 * class602.anInt7854) {
			method8746(true, -1, 0, 0, 1864499678);
			aBool7117 = false;
			aClass167_7118 = null;
		}
		method8756(aClass647_Sub1_7103, (byte) -74);
		if (bool_2_)
			bool_2_ = bool_2_ & (aBool7115 & !aBool7117 & Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		if (bool && !bool_2_) {
			anInt7112 = -108085327 * class602.anInt7854;
			return null;
		}
		Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
		Class560 class560 = client.aClass505_11019.method8241((byte) -101);
		if (bool_2_) {
			class560.method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -891584460);
			aBool7117 = false;
		}
		Class142 class142 = class560.aClass142Array7509[aByte7106];
		Class142 class142_4_;
		if (aBool7107)
			class142_4_ = class560.aClass142Array7547[0];
		else
			class142_4_ = (aByte7106 < 3 ? class560.aClass142Array7509[1 + aByte7106] : null);
		Class167 class167 = null;
		if (aClass707_7109.method14161(1505993406)) {
			if (bool_2_)
				i |= 0x40000;
			class167 = (class602.method9894(class178, i, 673355279 * anInt7105 != 11 ? anInt7105 * 673355279 : 10, (11 == anInt7105 * 673355279 ? 5257107 * anInt7113 + 4 : anInt7113 * 5257107), class142, class142_4_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, -836082100), (int) class437.aFloat4905, aClass707_7109, aClass591_7120, -2052097200));
			if (class167 != null) {
				if (bool_2_) {
					if (null == aBoolArray7101)
						aBoolArray7101 = new boolean[4];
					aClass523_Sub27_Sub4_7116 = class167.method2710(aClass523_Sub27_Sub4_7116);
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				anInt7102 = 0;
			}
			aClass167_7118 = null;
		} else if (null == aClass167_7118 || (aClass167_7118.method2683() & i) != i || (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)) {
			if (null != aClass167_7118)
				i |= aClass167_7118.method2683();
			Class5 class5 = (class602.method9922(class178, i, 11 != anInt7105 * 673355279 ? 673355279 * anInt7105 : 10, (11 == 673355279 * anInt7105 ? anInt7113 * 5257107 + 4 : anInt7113 * 5257107), class142, class142_4_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, -515318428), (int) class437.aFloat4905, bool_2_, aClass591_7120, 1192307474));
			if (class5 != null) {
				aClass167_7118 = class167 = (Class167) class5.anObject37;
				if (bool_2_) {
					aClass523_Sub27_Sub4_7116 = (Class523_Sub27_Sub4) class5.anObject36;
					aBoolArray7101 = null;
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				aClass167_7118 = null;
				anInt7102 = 0;
			}
		} else
			class167 = aClass167_7118;
		anInt7112 = class602.anInt7854 * -108085327;
		return class167;
	}

	Class529(Class178 class178, Class53_Sub18 class53_sub18, Class602 class602, int i, int i_5_, int i_6_, Class647_Sub1 class647_sub1, boolean bool, int i_7_, int i_8_) {
		anInt7102 = 0;
		aBool7108 = false;
		aBool7117 = false;
		aClass53_Sub18_7114 = class53_sub18;
		anInt7104 = class602.anInt7854 * -748568249;
		anInt7105 = -325871377 * i;
		anInt7113 = i_5_ * -1071874405;
		aClass647_Sub1_7103 = class647_sub1;
		aBool7108 = i_7_ != -1;
		aByte7106 = (byte) i_6_;
		aBool7107 = bool;
		aBool7115 = class178.method3351() && class602.aBool7921 && !aBool7107;
		aClass707_7109 = new Class707_Sub2(class647_sub1, false);
		method8746(false, i_7_, 1, aBool7108 ? i_8_ : 0, 1168287352);
	}

	boolean method8742(byte i) {
		return aBool7115;
	}

	void method8743(Class178 class178, byte i) {
		method8741(class178, 262144, true, true, -763239385);
	}

	void method8744(Class178 class178, int i) {
		if (aClass523_Sub27_Sub4_7116 != null) {
			Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
			client.aClass505_11019.method8241((byte) -66).method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -624502444);
			aBoolArray7101 = null;
			aClass523_Sub27_Sub4_7116 = null;
		}
	}

	public void method8745(int i, int i_9_) {
		aClass707_7110 = null;
		if (i_9_ > 0) {
			aClass707_7110 = new Class707_Sub2(aClass647_Sub1_7103, false);
			aClass707_7110.method14168(i, i_9_, 1, false, 1840849895);
		} else {
			aBool7108 = true;
			method8746(false, i, 1, 0, 1173733528);
		}
	}

	void method8746(boolean bool, int i, int i_10_, int i_11_, int i_12_) {
		int i_13_ = i;
		boolean bool_14_ = false;
		if (-1 == i_13_) {
			Class602 class602 = ((Class602) aClass53_Sub18_7114.getDefinition(241225827 * anInt7104, (byte) -52));
			Class602 class602_15_ = class602;
			if (class602.anIntArray7912 != null)
				class602 = (class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (client.anInt11071 * -1616721887 == 4 ? (Interface17) Class191.anInterface17_2169 : Class98_Sub1_Sub2.playerVarsProvider), 757946237));
			if (null == class602)
				return;
			if (class602 == class602_15_)
				class602_15_ = null;
			if (class602.method9935((byte) 0)) {
				if (!class602.aBool7883 || Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) 76) == 1) {
					if (bool && aClass707_7109.method14161(-1948758691) && class602.method9903(aClass707_7109.method14163(-1824934297), -848181550))
						return;
					if (-2005438859 * class602.anInt7854 != -1876643835 * anInt7112)
						bool_14_ = class602.aBool7919;
					i_13_ = class602.method9921((short) -10607);
					if (class602.method9900(-1572004650))
						i_10_ = 0;
					else
						i_10_ = 1;
				}
			} else if (null != class602_15_ && class602_15_.method9935((byte) 0) && (!class602_15_.aBool7883 || Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) 51) == 1)) {
				if (bool && aClass707_7109.method14161(-680542421) && class602_15_.method9903(aClass707_7109.method14163(-1972975723), -581663131))
					return;
				if (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)
					bool_14_ = class602_15_.aBool7919;
				i_13_ = class602_15_.method9921((short) -30801);
				if (class602_15_.method9900(-1572004650))
					i_10_ = 0;
				else
					i_10_ = 1;
			}
		}
		if (i_13_ == -1)
			aClass707_7109.method14166(-1, false, (byte) -22);
		else {
			aClass707_7109.method14168(i_13_, i_11_, i_10_, bool_14_, 1840849895);
			anInt7111 = 1975513859 * client.cycles;
			aBool7117 = false;
			aClass167_7118 = null;
		}
	}

	public void method8747(int i, int i_16_) {
		aClass707_7110 = null;
		if (i_16_ > 0) {
			aClass707_7110 = new Class707_Sub2(aClass647_Sub1_7103, false);
			aClass707_7110.method14168(i, i_16_, 1, false, 1840849895);
		} else {
			aBool7108 = true;
			method8746(false, i, 1, 0, 968209268);
		}
	}

	void method8748(Class647_Sub1 class647_sub1) {
		if (aClass707_7110 != null && aClass707_7110.method14161(841536171)) {
			aClass707_7110.method14205((client.cycles - -55668821 * anInt7111), (byte) 26);
			if (aClass707_7110.method14177(1357652815))
				aClass707_7110.method14164(-1, (byte) 12);
			if (!aClass707_7110.method14170((short) 255)) {
				aClass707_7109 = aClass707_7110;
				aBool7108 = true;
				anInt7111 = client.cycles * 1975513859;
				return;
			}
		}
		if (aClass707_7109.method14161(1741725317)) {
			if (aClass707_7109.method14205((client.cycles - -55668821 * anInt7111), (byte) 46)) {
				if (Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) == 2)
					aBool7117 = false;
				if (aClass707_7109.method14177(1357652815)) {
					aClass707_7109.method14164(-1, (byte) 12);
					aBool7108 = false;
					method8746(false, -1, 0, 0, 818838450);
				}
			}
		} else
			method8746(false, -1, 0, 0, 1794594584);
		anInt7111 = client.cycles * 1975513859;
	}

	final Class167 method8749(Class178 class178, int i, boolean bool, boolean bool_17_) {
		Class602 class602 = (Class602) aClass53_Sub18_7114.getDefinition(anInt7104 * 241225827, (byte) -46);
		if (null != class602.anIntArray7912)
			class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == -1616721887 * client.anInt11071 ? (Interface17) (Class191.anInterface17_2169) : Class98_Sub1_Sub2.playerVarsProvider), 1381285726);
		if (class602 == null) {
			method8744(class178, -1601397693);
			anInt7112 = -1689033933;
			return null;
		}
		if (!aBool7108 && anInt7112 * -1876643835 != -2005438859 * class602.anInt7854) {
			method8746(true, -1, 0, 0, 1393072130);
			aBool7117 = false;
			aClass167_7118 = null;
		}
		method8756(aClass647_Sub1_7103, (byte) -36);
		if (bool_17_)
			bool_17_ = bool_17_ & (aBool7115 & !aBool7117 & Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		if (bool && !bool_17_) {
			anInt7112 = -108085327 * class602.anInt7854;
			return null;
		}
		Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
		Class560 class560 = client.aClass505_11019.method8241((byte) -91);
		if (bool_17_) {
			class560.method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, 30477068);
			aBool7117 = false;
		}
		Class142 class142 = class560.aClass142Array7509[aByte7106];
		Class142 class142_18_;
		if (aBool7107)
			class142_18_ = class560.aClass142Array7547[0];
		else
			class142_18_ = (aByte7106 < 3 ? class560.aClass142Array7509[1 + aByte7106] : null);
		Class167 class167 = null;
		if (aClass707_7109.method14161(-1689094242)) {
			if (bool_17_)
				i |= 0x40000;
			class167 = (class602.method9894(class178, i, 673355279 * anInt7105 != 11 ? anInt7105 * 673355279 : 10, (11 == anInt7105 * 673355279 ? 5257107 * anInt7113 + 4 : anInt7113 * 5257107), class142, class142_18_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 147359049), (int) class437.aFloat4905, aClass707_7109, aClass591_7120, -2052097200));
			if (class167 != null) {
				if (bool_17_) {
					if (null == aBoolArray7101)
						aBoolArray7101 = new boolean[4];
					aClass523_Sub27_Sub4_7116 = class167.method2710(aClass523_Sub27_Sub4_7116);
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				anInt7102 = 0;
			}
			aClass167_7118 = null;
		} else if (null == aClass167_7118 || (aClass167_7118.method2683() & i) != i || (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)) {
			if (null != aClass167_7118)
				i |= aClass167_7118.method2683();
			Class5 class5 = (class602.method9922(class178, i, 11 != anInt7105 * 673355279 ? 673355279 * anInt7105 : 10, (11 == 673355279 * anInt7105 ? anInt7113 * 5257107 + 4 : anInt7113 * 5257107), class142, class142_18_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 908202466), (int) class437.aFloat4905, bool_17_, aClass591_7120, 1192307474));
			if (class5 != null) {
				aClass167_7118 = class167 = (Class167) class5.anObject37;
				if (bool_17_) {
					aClass523_Sub27_Sub4_7116 = (Class523_Sub27_Sub4) class5.anObject36;
					aBoolArray7101 = null;
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				aClass167_7118 = null;
				anInt7102 = 0;
			}
		} else
			class167 = aClass167_7118;
		anInt7112 = class602.anInt7854 * -108085327;
		return class167;
	}

	Class602 method8750() {
		return (Class602) aClass53_Sub18_7114.getDefinition(241225827 * anInt7104, (byte) 28);
	}

	void method8751(Class591 class591) {
		aClass591_7120 = class591;
		aClass167_7118 = null;
	}

	void method8752(Class591 class591) {
		aClass591_7120 = class591;
		aClass167_7118 = null;
	}

	int method8753() {
		return -2027747265 * anInt7102;
	}

	void method8754(Class178 class178, Class167 class167, Class435 class435, int i, int i_19_, int i_20_, int i_21_, boolean bool, byte i_22_) {
		Class184[] class184s = class167.method2733();
		Class143[] class143s = class167.method2734();
		if ((aClass621_7119 == null || aClass621_7119.aBool8083) && (null != class184s || null != class143s)) {
			Class602 class602 = ((Class602) aClass53_Sub18_7114.getDefinition(241225827 * anInt7104, (byte) 15));
			if (null != class602.anIntArray7912)
				class602 = (class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (-1616721887 * client.anInt11071 == 4 ? (Interface17) Class191.anInterface17_2169 : Class98_Sub1_Sub2.playerVarsProvider), 1486188392));
			if (class602 != null)
				aClass621_7119 = Class621.method10149(client.cycles, true);
		}
		if (null != aClass621_7119) {
			class167.method2732(class435);
			if (bool)
				aClass621_7119.method10129(class178, (long) client.cycles, class184s, class143s, false);
			else
				aClass621_7119.method10128((long) client.cycles);
			aClass621_7119.method10133(aByte7106, i, i_19_, i_20_, i_21_);
		}
	}

	final Class167 method8755(Class178 class178, int i, boolean bool, boolean bool_23_) {
		Class602 class602 = ((Class602) aClass53_Sub18_7114.getDefinition(anInt7104 * 241225827, (byte) 41));
		if (null != class602.anIntArray7912)
			class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == -1616721887 * client.anInt11071 ? (Interface17) (Class191.anInterface17_2169) : Class98_Sub1_Sub2.playerVarsProvider), 674512216);
		if (class602 == null) {
			method8744(class178, -730111600);
			anInt7112 = -1689033933;
			return null;
		}
		if (!aBool7108 && anInt7112 * -1876643835 != -2005438859 * class602.anInt7854) {
			method8746(true, -1, 0, 0, 2136416768);
			aBool7117 = false;
			aClass167_7118 = null;
		}
		method8756(aClass647_Sub1_7103, (byte) -34);
		if (bool_23_)
			bool_23_ = bool_23_ & (aBool7115 & !aBool7117 & Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		if (bool && !bool_23_) {
			anInt7112 = -108085327 * class602.anInt7854;
			return null;
		}
		Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
		Class560 class560 = client.aClass505_11019.method8241((byte) -51);
		if (bool_23_) {
			class560.method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -1068171687);
			aBool7117 = false;
		}
		Class142 class142 = class560.aClass142Array7509[aByte7106];
		Class142 class142_24_;
		if (aBool7107)
			class142_24_ = class560.aClass142Array7547[0];
		else
			class142_24_ = (aByte7106 < 3 ? class560.aClass142Array7509[1 + aByte7106] : null);
		Class167 class167 = null;
		if (aClass707_7109.method14161(379129099)) {
			if (bool_23_)
				i |= 0x40000;
			class167 = (class602.method9894(class178, i, 673355279 * anInt7105 != 11 ? anInt7105 * 673355279 : 10, (11 == anInt7105 * 673355279 ? 5257107 * anInt7113 + 4 : anInt7113 * 5257107), class142, class142_24_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 769548895), (int) class437.aFloat4905, aClass707_7109, aClass591_7120, -2052097200));
			if (class167 != null) {
				if (bool_23_) {
					if (null == aBoolArray7101)
						aBoolArray7101 = new boolean[4];
					aClass523_Sub27_Sub4_7116 = class167.method2710(aClass523_Sub27_Sub4_7116);
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				anInt7102 = 0;
			}
			aClass167_7118 = null;
		} else if (null == aClass167_7118 || (aClass167_7118.method2683() & i) != i || (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)) {
			if (null != aClass167_7118)
				i |= aClass167_7118.method2683();
			Class5 class5 = (class602.method9922(class178, i, 11 != anInt7105 * 673355279 ? 673355279 * anInt7105 : 10, (11 == 673355279 * anInt7105 ? anInt7113 * 5257107 + 4 : anInt7113 * 5257107), class142, class142_24_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 2108627383), (int) class437.aFloat4905, bool_23_, aClass591_7120, 1192307474));
			if (class5 != null) {
				aClass167_7118 = class167 = (Class167) class5.anObject37;
				if (bool_23_) {
					aClass523_Sub27_Sub4_7116 = (Class523_Sub27_Sub4) class5.anObject36;
					aBoolArray7101 = null;
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				aClass167_7118 = null;
				anInt7102 = 0;
			}
		} else
			class167 = aClass167_7118;
		anInt7112 = class602.anInt7854 * -108085327;
		return class167;
	}

	void method8756(Class647_Sub1 class647_sub1, byte i) {
		if (aClass707_7110 != null && aClass707_7110.method14161(-676397699)) {
			aClass707_7110.method14205((client.cycles - -55668821 * anInt7111), (byte) 101);
			if (aClass707_7110.method14177(1357652815))
				aClass707_7110.method14164(-1, (byte) 12);
			if (!aClass707_7110.method14170((short) 255)) {
				aClass707_7109 = aClass707_7110;
				aBool7108 = true;
				anInt7111 = client.cycles * 1975513859;
				return;
			}
		}
		if (aClass707_7109.method14161(-708975842)) {
			if (aClass707_7109.method14205((client.cycles - -55668821 * anInt7111), (byte) 17)) {
				if (Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) == 2)
					aBool7117 = false;
				if (aClass707_7109.method14177(1357652815)) {
					aClass707_7109.method14164(-1, (byte) 12);
					aBool7108 = false;
					method8746(false, -1, 0, 0, 2136751591);
				}
			}
		} else
			method8746(false, -1, 0, 0, 880497298);
		anInt7111 = client.cycles * 1975513859;
	}

	final Class167 method8757(Class178 class178, int i, boolean bool, boolean bool_25_) {
		Class602 class602 = ((Class602) aClass53_Sub18_7114.getDefinition(anInt7104 * 241225827, (byte) 3));
		if (null != class602.anIntArray7912)
			class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == -1616721887 * client.anInt11071 ? (Interface17) (Class191.anInterface17_2169) : Class98_Sub1_Sub2.playerVarsProvider), 76364718);
		if (class602 == null) {
			method8744(class178, 1780502548);
			anInt7112 = -1689033933;
			return null;
		}
		if (!aBool7108 && anInt7112 * -1876643835 != -2005438859 * class602.anInt7854) {
			method8746(true, -1, 0, 0, 527001315);
			aBool7117 = false;
			aClass167_7118 = null;
		}
		method8756(aClass647_Sub1_7103, (byte) 29);
		if (bool_25_)
			bool_25_ = bool_25_ & (aBool7115 & !aBool7117 & Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		if (bool && !bool_25_) {
			anInt7112 = -108085327 * class602.anInt7854;
			return null;
		}
		Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
		Class560 class560 = client.aClass505_11019.method8241((byte) -4);
		if (bool_25_) {
			class560.method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -886267506);
			aBool7117 = false;
		}
		Class142 class142 = class560.aClass142Array7509[aByte7106];
		Class142 class142_26_;
		if (aBool7107)
			class142_26_ = class560.aClass142Array7547[0];
		else
			class142_26_ = (aByte7106 < 3 ? class560.aClass142Array7509[1 + aByte7106] : null);
		Class167 class167 = null;
		if (aClass707_7109.method14161(-1455420466)) {
			if (bool_25_)
				i |= 0x40000;
			class167 = (class602.method9894(class178, i, 673355279 * anInt7105 != 11 ? anInt7105 * 673355279 : 10, (11 == anInt7105 * 673355279 ? 5257107 * anInt7113 + 4 : anInt7113 * 5257107), class142, class142_26_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 169710444), (int) class437.aFloat4905, aClass707_7109, aClass591_7120, -2052097200));
			if (class167 != null) {
				if (bool_25_) {
					if (null == aBoolArray7101)
						aBoolArray7101 = new boolean[4];
					aClass523_Sub27_Sub4_7116 = class167.method2710(aClass523_Sub27_Sub4_7116);
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				anInt7102 = 0;
			}
			aClass167_7118 = null;
		} else if (null == aClass167_7118 || (aClass167_7118.method2683() & i) != i || (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)) {
			if (null != aClass167_7118)
				i |= aClass167_7118.method2683();
			Class5 class5 = (class602.method9922(class178, i, 11 != anInt7105 * 673355279 ? 673355279 * anInt7105 : 10, (11 == 673355279 * anInt7105 ? anInt7113 * 5257107 + 4 : anInt7113 * 5257107), class142, class142_26_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 1004733071), (int) class437.aFloat4905, bool_25_, aClass591_7120, 1192307474));
			if (class5 != null) {
				aClass167_7118 = class167 = (Class167) class5.anObject37;
				if (bool_25_) {
					aClass523_Sub27_Sub4_7116 = (Class523_Sub27_Sub4) class5.anObject36;
					aBoolArray7101 = null;
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				aClass167_7118 = null;
				anInt7102 = 0;
			}
		} else
			class167 = aClass167_7118;
		anInt7112 = class602.anInt7854 * -108085327;
		return class167;
	}

	final Class167 method8758(Class178 class178, int i, boolean bool, boolean bool_27_) {
		Class602 class602 = (Class602) aClass53_Sub18_7114.getDefinition(anInt7104 * 241225827, (byte) -44);
		if (null != class602.anIntArray7912)
			class602 = class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (4 == -1616721887 * client.anInt11071 ? (Interface17) (Class191.anInterface17_2169) : Class98_Sub1_Sub2.playerVarsProvider), -112210205);
		if (class602 == null) {
			method8744(class178, 969353504);
			anInt7112 = -1689033933;
			return null;
		}
		if (!aBool7108 && anInt7112 * -1876643835 != -2005438859 * class602.anInt7854) {
			method8746(true, -1, 0, 0, 1829409768);
			aBool7117 = false;
			aClass167_7118 = null;
		}
		method8756(aClass647_Sub1_7103, (byte) 60);
		if (bool_27_)
			bool_27_ = bool_27_ & (aBool7115 & !aBool7117 & Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		if (bool && !bool_27_) {
			anInt7112 = -108085327 * class602.anInt7854;
			return null;
		}
		Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
		Class560 class560 = client.aClass505_11019.method8241((byte) -83);
		if (bool_27_) {
			class560.method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -873180078);
			aBool7117 = false;
		}
		Class142 class142 = class560.aClass142Array7509[aByte7106];
		Class142 class142_28_;
		if (aBool7107)
			class142_28_ = class560.aClass142Array7547[0];
		else
			class142_28_ = (aByte7106 < 3 ? class560.aClass142Array7509[1 + aByte7106] : null);
		Class167 class167 = null;
		if (aClass707_7109.method14161(94589356)) {
			if (bool_27_)
				i |= 0x40000;
			class167 = (class602.method9894(class178, i, 673355279 * anInt7105 != 11 ? anInt7105 * 673355279 : 10, (11 == anInt7105 * 673355279 ? 5257107 * anInt7113 + 4 : anInt7113 * 5257107), class142, class142_28_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 952136400), (int) class437.aFloat4905, aClass707_7109, aClass591_7120, -2052097200));
			if (class167 != null) {
				if (bool_27_) {
					if (null == aBoolArray7101)
						aBoolArray7101 = new boolean[4];
					aClass523_Sub27_Sub4_7116 = class167.method2710(aClass523_Sub27_Sub4_7116);
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				anInt7102 = 0;
			}
			aClass167_7118 = null;
		} else if (null == aClass167_7118 || (aClass167_7118.method2683() & i) != i || (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)) {
			if (null != aClass167_7118)
				i |= aClass167_7118.method2683();
			Class5 class5 = (class602.method9922(class178, i, 11 != anInt7105 * 673355279 ? 673355279 * anInt7105 : 10, (11 == 673355279 * anInt7105 ? anInt7113 * 5257107 + 4 : anInt7113 * 5257107), class142, class142_28_, (int) class437.aFloat4903, class142.method2326((int) class437.aFloat4903, (int) class437.aFloat4905, -1918716298), (int) class437.aFloat4905, bool_27_, aClass591_7120, 1192307474));
			if (class5 != null) {
				aClass167_7118 = class167 = (Class167) class5.anObject37;
				if (bool_27_) {
					aClass523_Sub27_Sub4_7116 = (Class523_Sub27_Sub4) class5.anObject36;
					aBoolArray7101 = null;
					class560.method9297(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
					aBool7117 = true;
				}
				anInt7102 = class167.method2804() * 882173887;
				class167.method2834();
			} else {
				aBoolArray7101 = null;
				aClass523_Sub27_Sub4_7116 = null;
				aClass167_7118 = null;
				anInt7102 = 0;
			}
		} else
			class167 = aClass167_7118;
		anInt7112 = class602.anInt7854 * -108085327;
		return class167;
	}

	void method8759(Class178 class178) {
		if (aClass523_Sub27_Sub4_7116 != null) {
			Class437 class437 = aClass647_Sub1_7103.method10569().aClass437_4862;
			client.aClass505_11019.method8241((byte) -108).method9354(aClass523_Sub27_Sub4_7116, aByte7106, (int) class437.aFloat4903, (int) class437.aFloat4905, aBoolArray7101, -531136137);
			aBoolArray7101 = null;
			aClass523_Sub27_Sub4_7116 = null;
		}
	}

	Class602 method8760() {
		return (Class602) aClass53_Sub18_7114.getDefinition(241225827 * anInt7104, (byte) 40);
	}

	int method8761(int i) {
		return -method8737(-759793831);
	}

	void method8762(Class647_Sub1 class647_sub1) {
		if (aClass707_7110 != null && aClass707_7110.method14161(-1376754890)) {
			aClass707_7110.method14205((client.cycles - -55668821 * anInt7111), (byte) 52);
			if (aClass707_7110.method14177(1357652815))
				aClass707_7110.method14164(-1, (byte) 12);
			if (!aClass707_7110.method14170((short) 255)) {
				aClass707_7109 = aClass707_7110;
				aBool7108 = true;
				anInt7111 = client.cycles * 1975513859;
				return;
			}
		}
		if (aClass707_7109.method14161(-85907530)) {
			if (aClass707_7109.method14205((client.cycles - -55668821 * anInt7111), (byte) 32)) {
				if (Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) == 2)
					aBool7117 = false;
				if (aClass707_7109.method14177(1357652815)) {
					aClass707_7109.method14164(-1, (byte) 12);
					aBool7108 = false;
					method8746(false, -1, 0, 0, 1243015253);
				}
			}
		} else
			method8746(false, -1, 0, 0, 1702609082);
		anInt7111 = client.cycles * 1975513859;
	}

	void method8763(Class647_Sub1 class647_sub1) {
		if (aClass707_7110 != null && aClass707_7110.method14161(-1702554785)) {
			aClass707_7110.method14205((client.cycles - -55668821 * anInt7111), (byte) 120);
			if (aClass707_7110.method14177(1357652815))
				aClass707_7110.method14164(-1, (byte) 12);
			if (!aClass707_7110.method14170((short) 255)) {
				aClass707_7109 = aClass707_7110;
				aBool7108 = true;
				anInt7111 = client.cycles * 1975513859;
				return;
			}
		}
		if (aClass707_7109.method14161(583970990)) {
			if (aClass707_7109.method14205((client.cycles - -55668821 * anInt7111), (byte) 65)) {
				if (Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) == 2)
					aBool7117 = false;
				if (aClass707_7109.method14177(1357652815)) {
					aClass707_7109.method14164(-1, (byte) 12);
					aBool7108 = false;
					method8746(false, -1, 0, 0, 979906734);
				}
			}
		} else
			method8746(false, -1, 0, 0, 291404610);
		anInt7111 = client.cycles * 1975513859;
	}

	boolean method8764() {
		return aBool7115;
	}

	void method8765(boolean bool, int i, int i_29_, int i_30_) {
		int i_31_ = i;
		boolean bool_32_ = false;
		if (-1 == i_31_) {
			Class602 class602 = ((Class602) aClass53_Sub18_7114.getDefinition(241225827 * anInt7104, (byte) -65));
			Class602 class602_33_ = class602;
			if (class602.anIntArray7912 != null)
				class602 = (class602.method9893(Class98_Sub1_Sub2.playerVarsProvider, (client.anInt11071 * -1616721887 == 4 ? (Interface17) Class191.anInterface17_2169 : Class98_Sub1_Sub2.playerVarsProvider), 1275633510));
			if (null == class602)
				return;
			if (class602 == class602_33_)
				class602_33_ = null;
			if (class602.method9935((byte) 0)) {
				if (!class602.aBool7883 || Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) -29) == 1) {
					if (bool && aClass707_7109.method14161(-538557957) && class602.method9903(aClass707_7109.method14163(-2082188020), -1892819837))
						return;
					if (-2005438859 * class602.anInt7854 != -1876643835 * anInt7112)
						bool_32_ = class602.aBool7919;
					i_31_ = class602.method9921((short) -16571);
					if (class602.method9900(-1572004650))
						i_29_ = 0;
					else
						i_29_ = 1;
				}
			} else if (null != class602_33_ && class602_33_.method9935((byte) 0) && (!class602_33_.aBool7883 || Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) 11) == 1)) {
				if (bool && aClass707_7109.method14161(-1557079680) && class602_33_.method9903(aClass707_7109.method14163(-1667952841), 152907839))
					return;
				if (-1876643835 * anInt7112 != class602.anInt7854 * -2005438859)
					bool_32_ = class602_33_.aBool7919;
				i_31_ = class602_33_.method9921((short) -26578);
				if (class602_33_.method9900(-1572004650))
					i_29_ = 0;
				else
					i_29_ = 1;
			}
		}
		if (i_31_ == -1)
			aClass707_7109.method14166(-1, false, (byte) -19);
		else {
			aClass707_7109.method14168(i_31_, i_30_, i_29_, bool_32_, 1840849895);
			anInt7111 = 1975513859 * client.cycles;
			aBool7117 = false;
			aClass167_7118 = null;
		}
	}

	public static void method8766(int i) {
		if (Class640.method10529((short) -20773))
			Class219.method4103(new Class628(), 1294249668);
	}

	static final void method8767(Class669 class669, byte i) {
		int i_34_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_34_, -1252833902);
		Class242 class242 = Class31.aClass242Array302[i_34_ >> 16];
		Class186.method3584(class250, class242, class669, (short) -7610);
	}

	static final void method8768(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.hidden ? 1 : 0;
	}

	static void method8769(int i) {
		if (null != Class36.aClass523_Sub27_Sub8_328) {
			Class36.aClass523_Sub27_Sub8_328 = null;
			Class504.method8225(1464782871 * Class523_Sub7.anInt10405, 534142755 * Class301.anInt3330, Class426.anInt4824 * 805194879, Class705.anInt8818 * 1850758193, (byte) -48);
		}
	}

	public static void method8770(Class262 class262, int i) {
		Class260.aClass262_2837 = class262;
	}

	static final void method8771(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_35_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_36_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class54.method1350(i_35_, i_36_, false, (byte) 9);
	}

	static final void method8772(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class250.anInt2694 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 163847493;
		Login.method15991(class250, (byte) -31);
	}
}
