/* Class560 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class560 {
	Class178 aClass178_7495;
	public int anInt7496;
	Class647_Sub1[] aClass647_Sub1Array7497;
	int anInt7498;
	int anInt7499;
	int anInt7500;
	Class61 aClass61_7501;
	boolean aBool7502;
	boolean aBool7503;
	int anInt7504;
	public int anInt7505;
	Class550[] aClass550Array7506;
	public int anInt7507;
	public Class565[][][] aClass565ArrayArrayArray7508;
	public Class142[] aClass142Array7509;
	public Class565[][][] aClass565ArrayArrayArray7510;
	int anInt7511 = 5016;
	public Class565[][][] aClass565ArrayArrayArray7512;
	public Class142[] aClass142Array7513;
	int[][] anIntArrayArray7514;
	int anInt7515 = 65164;
	short[][] aShortArrayArray7516;
	byte[][] aByteArrayArray7517;
	byte[][] aByteArrayArray7518;
	int anInt7519 = 5090;
	int anInt7520;
	int anInt7521 = 10067;
	Class647_Sub1[] aClass647_Sub1Array7522;
	int anInt7523;
	int anInt7524;
	Class647_Sub1[] aClass647_Sub1Array7525;
	Class647_Sub1[] aClass647_Sub1Array7526;
	int anInt7527;
	int anInt7528;
	long[][][] aLongArrayArrayArray7529;
	Class647_Sub1[] aClass647_Sub1Array7530;
	Class647_Sub1_Sub3[] aClass647_Sub1_Sub3Array7531;
	byte[][] aByteArrayArray7532;
	int anInt7533;
	int anInt7534;
	int anInt7535;
	int anInt7536;
	Class523_Sub20[] aClass523_Sub20Array7537;
	int anInt7538;
	byte[][] aByteArrayArray7539;
	int anInt7540;
	public Class544 aClass544_7541;
	int anInt7542;
	int anInt7543;
	int anInt7544;
	float[] aFloatArray7545;
	public int anInt7546;
	public Class142[] aClass142Array7547;
	static final int anInt7548 = 4;
	boolean[][] aBoolArrayArray7549;
	int anInt7550 = 16;
	public static boolean aBool7551 = true;
	boolean[] aBoolArray7552;
	HashMap aHashMap7553;
	HashMap aHashMap7554;
	public Class549 aClass549_7555;
	boolean[][] aBoolArrayArray7556;
	int[] anIntArray7557;
	boolean[][] aBoolArrayArray7558;
	int anInt7559;

	public Class647_Sub1_Sub1 method9247(int i, int i_0_, int i_1_, byte i_2_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_0_][i_1_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7590, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7590 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7590;
				class565.aClass647_Sub1_Sub1_7590 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public void method9248(int i, int i_3_) {
		/* empty */
	}

	public void method9249(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (null != anIntArrayArray7514)
			anIntArrayArray7514[i][i_4_] = ~0xffffff | i_5_;
		if (aShortArrayArray7516 != null)
			aShortArrayArray7516[i][i_4_] = (short) i_6_;
		if (null != aByteArrayArray7532)
			aByteArrayArray7532[i][i_4_] = (byte) i_7_;
		if (null != aByteArrayArray7517)
			aByteArrayArray7517[i][i_4_] = (byte) i_8_;
		if (null != aByteArrayArray7518)
			aByteArrayArray7518[i][i_4_] = (byte) i_9_;
		if (aByteArrayArray7539 != null)
			aByteArrayArray7539[i][i_4_] = (byte) i_10_;
	}

	public void method9250(boolean bool, int i) {
		if (bool) {
			aClass565ArrayArrayArray7508 = aClass565ArrayArrayArray7512;
			aClass142Array7509 = aClass142Array7513;
		} else {
			aClass565ArrayArrayArray7508 = aClass565ArrayArrayArray7510;
			aClass142Array7509 = aClass142Array7547;
		}
		anInt7505 = 564572471 * aClass565ArrayArrayArray7508.length;
	}

	public void method9251(int i, int i_11_) {
		Class565 class565 = aClass565ArrayArrayArray7508[0][i][i_11_];
		for (int i_12_ = 0; i_12_ < 3; i_12_++) {
			Class565 class565_13_ = (aClass565ArrayArrayArray7508[i_12_][i][i_11_] = aClass565ArrayArrayArray7508[1 + i_12_][i][i_11_]);
			if (null != class565_13_) {
				for (Class548 class548 = class565_13_.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
					Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
					if (class647_sub1_sub3.aShort11750 == i && class647_sub1_sub3.aShort11751 == i_11_)
						class647_sub1_sub3.aByte10821--;
				}
				if (class565_13_.aClass647_Sub1_Sub2_7591 != null)
					class565_13_.aClass647_Sub1_Sub2_7591.aByte10821--;
				if (null != class565_13_.aClass647_Sub1_Sub4_7587)
					class565_13_.aClass647_Sub1_Sub4_7587.aByte10821--;
				if (class565_13_.aClass647_Sub1_Sub4_7596 != null)
					class565_13_.aClass647_Sub1_Sub4_7596.aByte10821--;
				if (null != class565_13_.aClass647_Sub1_Sub1_7589)
					class565_13_.aClass647_Sub1_Sub1_7589.aByte10821--;
				if (null != class565_13_.aClass647_Sub1_Sub1_7590)
					class565_13_.aClass647_Sub1_Sub1_7590.aByte10821--;
			}
		}
		if (null == aClass565ArrayArrayArray7508[0][i][i_11_]) {
			aClass565ArrayArrayArray7508[0][i][i_11_] = new Class565(0);
			aClass565ArrayArrayArray7508[0][i][i_11_].aByte7595 = (byte) 1;
		}
		aClass565ArrayArrayArray7508[0][i][i_11_].aClass565_7586 = class565;
		aClass565ArrayArrayArray7508[3][i][i_11_] = null;
	}

	public void method9252(int i) {
		/* empty */
	}

	Class565 method9253(int i, int i_14_, int i_15_, short i_16_) {
		if (null == aClass565ArrayArrayArray7508[i][i_14_][i_15_]) {
			boolean bool = (aClass565ArrayArrayArray7508[0][i_14_][i_15_] != null && (aClass565ArrayArrayArray7508[0][i_14_][i_15_].aClass565_7586) != null);
			if (bool && i >= anInt7505 * -1277045625 - 1)
				return null;
			method9330(i, i_14_, i_15_, (byte) 4);
		}
		return aClass565ArrayArrayArray7508[i][i_14_][i_15_];
	}

	public int method9254(int i, int i_17_, int i_18_) {
		return (aShortArrayArray7516 != null ? aShortArrayArray7516[i][i_17_] & 0xffff : 0);
	}

	public int method9255(int i, int i_19_) {
		return (aByteArrayArray7532 != null ? aByteArrayArray7532[i][i_19_] & 0xff : 0);
	}

	public void method9256(int i, Class142 class142, byte i_20_) {
		aClass142Array7509[i] = class142;
	}

	public void method9257(int i, int i_21_, int i_22_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_21_][i_22_] != null && (aClass565ArrayArrayArray7508[0][i_21_][i_22_].aClass565_7586 != null));
		for (int i_23_ = i; i_23_ >= 0; i_23_--) {
			if (null == aClass565ArrayArrayArray7508[i_23_][i_21_][i_22_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_23_][i_21_][i_22_] = new Class565(i_23_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public int method9258(int i, int i_24_, byte i_25_) {
		return (anIntArrayArray7514 != null ? anIntArrayArray7514[i][i_24_] & 0xffffff : 0);
	}

	public void method9259(int i, int i_26_, int i_27_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_26_][i_27_] != null && (aClass565ArrayArrayArray7508[0][i_26_][i_27_].aClass565_7586 != null));
		for (int i_28_ = i; i_28_ >= 0; i_28_--) {
			if (null == aClass565ArrayArrayArray7508[i_28_][i_26_][i_27_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_28_][i_26_][i_27_] = new Class565(i_28_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public int method9260(int i, int i_29_, short i_30_) {
		return (null != aByteArrayArray7517 ? aByteArrayArray7517[i][i_29_] & 0xff : 0);
	}

	public int method9261(int i, int i_31_, short i_32_) {
		return (null != aByteArrayArray7518 ? aByteArrayArray7518[i][i_31_] & 0xff : 0);
	}

	public void method9262(Class550 class550, int i) {
		if (1807701791 * anInt7499 < 65164) {
			Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
			aClass550Array7506[anInt7499 * 1807701791] = class550;
			aBoolArray7552[1807701791 * anInt7499] = false;
			anInt7499 += 1733649631;
			int i_33_ = class550.anInt7352 * 1991405609;
			if (class550.aBool7345)
				i_33_ = 0;
			int i_34_ = class550.anInt7352 * 1991405609;
			if (class550.aBool7333)
				i_34_ = anInt7505 * -1277045625 - 1;
			for (int i_35_ = i_33_; i_35_ <= i_34_; i_35_++) {
				int i_36_ = 0;
				int i_37_ = ((class523_sub20.method16065(1954265718) - class523_sub20.method16066(-1879460461) + anInt7498 * 1774368449) >> -906898059 * anInt7496);
				if (i_37_ < 0) {
					i_36_ -= i_37_;
					i_37_ = 0;
				}
				int i_38_ = ((class523_sub20.method16065(1919858280) + class523_sub20.method16066(-1879460461) - anInt7498 * 1774368449) >> anInt7496 * -906898059);
				if (i_38_ >= -34274863 * anInt7507)
					i_38_ = anInt7507 * -34274863 - 1;
				for (int i_39_ = i_37_; i_39_ <= i_38_; i_39_++) {
					int i_40_ = class550.aShortArray7353[i_36_++];
					int i_41_ = (((class523_sub20.method16062(2131811589) - class523_sub20.method16066(-1879460461) + 1774368449 * anInt7498) >> anInt7496 * -906898059) + (i_40_ >>> 8));
					int i_42_ = (i_40_ & 0xff) + i_41_ - 1;
					if (i_41_ < 0)
						i_41_ = 0;
					if (i_42_ >= anInt7546 * -957102653)
						i_42_ = anInt7546 * -957102653 - 1;
					for (int i_43_ = i_41_; i_43_ <= i_42_; i_43_++) {
						long l = aLongArrayArrayArray7529[i_35_][i_43_][i_39_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7529[i_35_][i_43_][i_39_] = l | (long) (1807701791 * anInt7499);
						else if (0L == (l & 0xffff0000L))
							aLongArrayArrayArray7529[i_35_][i_43_][i_39_] = l | (long) (1807701791 * anInt7499) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7529[i_35_][i_43_][i_39_] = l | (long) (1807701791 * anInt7499) << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							aLongArrayArrayArray7529[i_35_][i_43_][i_39_] = l | (long) (1807701791 * anInt7499) << 48;
					}
				}
			}
			if (-1 != class550.anInt7360 * 293084327) {
				List list = ((List) aHashMap7553.get(Integer.valueOf(class550.anInt7360 * 293084327)));
				if (list == null) {
					list = new ArrayList();
					aHashMap7553.put(Integer.valueOf(class550.anInt7360 * 293084327), list);
				}
				list.add(class550);
				Class523_Sub20 class523_sub20_44_ = ((Class523_Sub20) aHashMap7554.get(Integer.valueOf(class550.anInt7360 * 293084327)));
				if (null != class523_sub20_44_) {
					class550.aClass523_Sub20_7349.method16063(class523_sub20_44_.method16067(856453637), 1436386053);
					class550.aClass523_Sub20_7349.method16074(class523_sub20_44_.method16071(1661164989), class523_sub20_44_.method16072((byte) -11), 360781879);
				}
			}
		}
	}

	public void method9263(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, byte i_52_) {
		if (null != anIntArrayArray7514)
			anIntArrayArray7514[i][i_45_] = ~0xffffff | i_46_;
		if (aShortArrayArray7516 != null)
			aShortArrayArray7516[i][i_45_] = (short) i_47_;
		if (null != aByteArrayArray7532)
			aByteArrayArray7532[i][i_45_] = (byte) i_48_;
		if (null != aByteArrayArray7517)
			aByteArrayArray7517[i][i_45_] = (byte) i_49_;
		if (null != aByteArrayArray7518)
			aByteArrayArray7518[i][i_45_] = (byte) i_50_;
		if (aByteArrayArray7539 != null)
			aByteArrayArray7539[i][i_45_] = (byte) i_51_;
	}

	public void method9264(int i, int i_53_, int i_54_, Class647_Sub1_Sub2 class647_sub1_sub2, byte i_55_) {
		Class565 class565 = method9253(i, i_53_, i_54_, (short) 32380);
		if (null != class565) {
			class565.aClass647_Sub1_Sub2_7591 = class647_sub1_sub2;
			int i_56_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub2.method16701(-1048617473)) {
				if (class647_sub1_sub2.method16702(176387585)) {
					class647_sub1_sub2.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_56_];
					aClass647_Sub1Array7525[i_56_] = class647_sub1_sub2;
				} else {
					class647_sub1_sub2.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_56_];
					aClass647_Sub1Array7522[i_56_] = class647_sub1_sub2;
				}
			} else {
				class647_sub1_sub2.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_56_];
				aClass647_Sub1Array7526[i_56_] = class647_sub1_sub2;
			}
		}
	}

	public void method9265(int i, int i_57_, int i_58_, int i_59_, Class647_Sub1_Sub5 class647_sub1_sub5, int i_60_) {
		Class565 class565 = method9253(i, i_57_, i_58_, (short) 15608);
		if (null != class565) {
			class647_sub1_sub5.method10573(new Class437((float) (anInt7498 * 1774368449 + (i_57_ << -906898059 * anInt7496)), (float) i_59_, (float) (anInt7498 * 1774368449 + (i_58_ << -906898059 * anInt7496))));
			class565.aClass647_Sub1_Sub5_7592 = class647_sub1_sub5;
			int i_61_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub5.method16701(-1998467192)) {
				if (class647_sub1_sub5.method16702(243528027)) {
					class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_61_];
					aClass647_Sub1Array7525[i_61_] = class647_sub1_sub5;
				} else {
					class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_61_];
					aClass647_Sub1Array7522[i_61_] = class647_sub1_sub5;
				}
			} else {
				class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_61_];
				aClass647_Sub1Array7526[i_61_] = class647_sub1_sub5;
			}
		}
	}

	public void method9266(int i, int i_62_, int i_63_, Class647_Sub1_Sub4 class647_sub1_sub4, Class647_Sub1_Sub4 class647_sub1_sub4_64_, int i_65_) {
		Class565 class565 = method9253(i, i_62_, i_63_, (short) 18736);
		if (class565 != null) {
			class565.aClass647_Sub1_Sub4_7587 = class647_sub1_sub4;
			class565.aClass647_Sub1_Sub4_7596 = class647_sub1_sub4_64_;
			int i_66_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub4.method16701(-1823585906)) {
				if (class647_sub1_sub4.method16702(1178777629)) {
					class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_66_];
					aClass647_Sub1Array7525[i_66_] = class647_sub1_sub4;
				} else {
					class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_66_];
					aClass647_Sub1Array7522[i_66_] = class647_sub1_sub4;
				}
			} else {
				class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_66_];
				aClass647_Sub1Array7526[i_66_] = class647_sub1_sub4;
			}
			if (class647_sub1_sub4_64_ != null) {
				if (class647_sub1_sub4_64_.method16701(95264409)) {
					if (class647_sub1_sub4_64_.method16702(211655515)) {
						class647_sub1_sub4_64_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_66_];
						aClass647_Sub1Array7525[i_66_] = class647_sub1_sub4_64_;
					} else {
						class647_sub1_sub4_64_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_66_];
						aClass647_Sub1Array7522[i_66_] = class647_sub1_sub4_64_;
					}
				} else {
					class647_sub1_sub4_64_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_66_];
					aClass647_Sub1Array7526[i_66_] = class647_sub1_sub4_64_;
				}
			}
		}
	}

	public void method9267(int i, int i_67_, int i_68_, Class647_Sub1_Sub1 class647_sub1_sub1, Class647_Sub1_Sub1 class647_sub1_sub1_69_, int i_70_) {
		Class565 class565 = method9253(i, i_67_, i_68_, (short) 28340);
		if (null != class565) {
			class565.aClass647_Sub1_Sub1_7589 = class647_sub1_sub1;
			class565.aClass647_Sub1_Sub1_7590 = class647_sub1_sub1_69_;
			int i_71_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub1.method16701(73594209)) {
				if (class647_sub1_sub1.method16702(2005348230)) {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_71_];
					aClass647_Sub1Array7525[i_71_] = class647_sub1_sub1;
				} else {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_71_];
					aClass647_Sub1Array7522[i_71_] = class647_sub1_sub1;
				}
			} else {
				class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_71_];
				aClass647_Sub1Array7526[i_71_] = class647_sub1_sub1;
			}
			if (null != class647_sub1_sub1_69_) {
				if (class647_sub1_sub1_69_.method16701(-1027857686)) {
					if (class647_sub1_sub1_69_.method16702(57317827)) {
						class647_sub1_sub1_69_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_71_];
						aClass647_Sub1Array7525[i_71_] = class647_sub1_sub1_69_;
					} else {
						class647_sub1_sub1_69_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_71_];
						aClass647_Sub1Array7522[i_71_] = class647_sub1_sub1_69_;
					}
				} else {
					class647_sub1_sub1_69_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_71_];
					aClass647_Sub1Array7526[i_71_] = class647_sub1_sub1_69_;
				}
			}
		}
	}

	public boolean method9268(Class647_Sub1_Sub3 class647_sub1_sub3, boolean bool, byte i) {
		boolean bool_72_ = aClass142Array7513 == aClass142Array7509;
		int i_73_ = 0;
		short i_74_ = 0;
		byte i_75_ = 0;
		class647_sub1_sub3.method18158(1057794043);
		short i_76_ = 0;
		int i_77_ = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11750));
		int i_78_ = Math.min(-957102653 * anInt7546 - 1, Math.max(0, class647_sub1_sub3.aShort11749));
		int i_79_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11751));
		int i_80_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11752));
		for (int i_81_ = i_77_; i_81_ <= i_78_; i_81_++) {
			for (int i_82_ = i_79_; i_82_ <= i_80_; i_82_++) {
				Class565 class565 = method9377(class647_sub1_sub3.aByte10821, i_81_, i_82_, -1035984213);
				if (class565 != null) {
					Class548 class548 = Class211.method3822(class647_sub1_sub3, 853020920);
					Class548 class548_83_ = class565.aClass548_7593;
					if (class548_83_ == null)
						class565.aClass548_7593 = class548;
					else {
						for (/**/; null != class548_83_.aClass548_7319; class548_83_ = class548_83_.aClass548_7319) {
							/* empty */
						}
						class548_83_.aClass548_7319 = class548;
					}
					if (bool_72_ && (anIntArrayArray7514[i_81_][i_82_] & ~0xffffff) != 0) {
						i_73_ = anIntArrayArray7514[i_81_][i_82_];
						i_74_ = aShortArrayArray7516[i_81_][i_82_];
						i_75_ = aByteArrayArray7532[i_81_][i_82_];
					}
					if (!bool && class565.aClass647_Sub1_Sub2_7591 != null && (class565.aClass647_Sub1_Sub2_7591.aShort11740 > i_76_))
						i_76_ = class565.aClass647_Sub1_Sub2_7591.aShort11740;
				}
			}
		}
		if (bool_72_ && (i_73_ & ~0xffffff) != 0) {
			for (int i_84_ = i_77_; i_84_ <= i_78_; i_84_++) {
				for (int i_85_ = i_79_; i_85_ <= i_80_; i_85_++) {
					if (0 == (anIntArrayArray7514[i_84_][i_85_] & ~0xffffff)) {
						anIntArrayArray7514[i_84_][i_85_] = i_73_;
						aShortArrayArray7516[i_84_][i_85_] = i_74_;
						aByteArrayArray7532[i_84_][i_85_] = i_75_;
					}
				}
			}
		}
		if (bool) {
			aClass647_Sub1_Sub3Array7531[(anInt7520 += -595278139) * -1449605107 - 1] = class647_sub1_sub3;
			class647_sub1_sub3.aClass560_10822 = this;
		} else {
			int i_86_ = aClass142Array7513 == aClass142Array7509 ? 1 : 0;
			if (class647_sub1_sub3.method16701(-1687148410)) {
				if (class647_sub1_sub3.method16702(780374600)) {
					class647_sub1_sub3.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_86_];
					aClass647_Sub1Array7525[i_86_] = class647_sub1_sub3;
				} else {
					class647_sub1_sub3.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_86_];
					aClass647_Sub1Array7522[i_86_] = class647_sub1_sub3;
				}
			} else {
				class647_sub1_sub3.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_86_];
				aClass647_Sub1Array7526[i_86_] = class647_sub1_sub3;
			}
		}
		if (bool) {
			Class437 class437 = Class437.method6884(class647_sub1_sub3.method10569().aClass437_4862);
			class437.aFloat4904 -= (float) i_76_;
			class647_sub1_sub3.method10573(class437);
			class437.method6949();
		}
		return true;
	}

	public void method9269(int i, int i_87_, int i_88_, int i_89_, short i_90_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_87_][i_88_];
		if (class565 != null) {
			Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
			Class647_Sub1_Sub1 class647_sub1_sub1_91_ = class565.aClass647_Sub1_Sub1_7590;
			if (null != class647_sub1_sub1) {
				class647_sub1_sub1.aShort11734 = (short) (class647_sub1_sub1.aShort11734 * i_89_ / (16 << anInt7496 * -906898059 - 7));
				class647_sub1_sub1.aShort11735 = (short) (i_89_ * class647_sub1_sub1.aShort11735 / (16 << -906898059 * anInt7496 - 7));
			}
			if (class647_sub1_sub1_91_ != null) {
				class647_sub1_sub1_91_.aShort11734 = (short) (class647_sub1_sub1_91_.aShort11734 * i_89_ / (16 << anInt7496 * -906898059 - 7));
				class647_sub1_sub1_91_.aShort11735 = (short) (i_89_ * class647_sub1_sub1_91_.aShort11735 / (16 << anInt7496 * -906898059 - 7));
			}
		}
	}

	void method9270(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_92_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_93_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_93_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_93_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_93_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_93_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_93_, (byte) 8) * -780986409;
			class163.anInt1775 = method9254(i, i_93_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_93_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_93_, (short) -21645) * -923094865;
			class163.anInt1777 = method9261(i, i_93_, (short) -354) * -320151975;
			class163.anInt1773 = method9329(i, i_93_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, -280706935), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) -2);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -1744634840);
			} else
				Class478.method7893(class559, -281533492);
		}
	}

	public Class647_Sub1_Sub4 method9271(int i, int i_94_, int i_95_, int i_96_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_94_][i_95_];
		if (null != class565) {
			method9279(class565.aClass647_Sub1_Sub4_7587, 1185013548);
			if (class565.aClass647_Sub1_Sub4_7587 != null) {
				Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
				class565.aClass647_Sub1_Sub4_7587 = null;
				return class647_sub1_sub4;
			}
		}
		return null;
	}

	public Class647_Sub1_Sub4 method9272(int i, int i_97_, int i_98_, int i_99_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_97_][i_98_];
		if (null != class565) {
			method9279(class565.aClass647_Sub1_Sub4_7596, 1185013548);
			if (class565.aClass647_Sub1_Sub4_7596 != null) {
				Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7596;
				class565.aClass647_Sub1_Sub4_7596 = null;
				return class647_sub1_sub4;
			}
		}
		return null;
	}

	public void method9273(int i, int i_100_, int i_101_, int i_102_, byte[][][] is, int[] is_103_, int[] is_104_, int[] is_105_, int[] is_106_, int[] is_107_, int i_108_, byte i_109_, int i_110_, int i_111_, boolean bool, boolean bool_112_, int i_113_, boolean bool_114_) {
		aClass544_7541.aBool7250 = true;
		aBool7503 = bool_112_;
		anInt7504 = (i_100_ >> -906898059 * anInt7496) * 678113587;
		anInt7533 = 450359633 * (i_102_ >> anInt7496 * -906898059);
		anInt7523 = i_100_ * 684215103;
		anInt7535 = -2044630383 * i_102_;
		anInt7536 = i_101_ * -398344597;
		anInt7524 = -146656701 * anInt7504 - 1420189007 * anInt7538;
		if (anInt7524 * 1814696425 < 0) {
			anInt7534 = -(1149090577 * anInt7524);
			anInt7524 = 0;
		} else
			anInt7534 = 0;
		anInt7543 = -1530967211 * anInt7533 - -665519197 * anInt7538;
		if (1279546093 * anInt7543 < 0) {
			anInt7540 = -(-1475850095 * anInt7543);
			anInt7543 = 0;
		} else
			anInt7540 = 0;
		anInt7542 = 1318451865 * anInt7504 + -1158026499 * anInt7538;
		if (-1106091597 * anInt7542 > -957102653 * anInt7546)
			anInt7542 = 1722966961 * anInt7546;
		anInt7544 = anInt7533 * -1907041149 + anInt7538 * 1286889669;
		if (anInt7544 * -2095166277 > -34274863 * anInt7507)
			anInt7544 = anInt7507 * 261187811;
		boolean[][] bools = aBoolArrayArray7558;
		boolean[][] bools_115_ = aBoolArrayArray7556;
		if (aBool7503) {
			for (int i_116_ = 0; (i_116_ < anInt7538 * -1164760089 + anInt7538 * -1164760089 + 2); i_116_++) {
				int i_117_ = 0;
				int i_118_ = 0;
				for (int i_119_ = 0; (i_119_ < anInt7538 * -1164760089 + -1164760089 * anInt7538 + 2); i_119_++) {
					if (i_119_ > 1)
						anIntArray7557[i_119_ - 2] = i_117_;
					i_117_ = i_118_;
					int i_120_ = i_116_ + (-208391685 * anInt7504 - -1164760089 * anInt7538);
					int i_121_ = (anInt7533 * 164493233 - anInt7538 * -1164760089 + i_119_);
					if (i_120_ >= 0 && i_121_ >= 0 && i_120_ < anInt7546 * -957102653 && i_121_ < -34274863 * anInt7507) {
						int i_122_ = i_120_ << -906898059 * anInt7496;
						int i_123_ = i_121_ << anInt7496 * -906898059;
						int i_124_ = (aClass142Array7547[aClass142Array7547.length - 1].method2321(i_120_, i_121_, 1919334669) - (1000 << -906898059 * anInt7496 - 7));
						int i_125_ = ((aClass142Array7513 != null ? (aClass142Array7513[0].method2321(i_120_, i_121_, 2014191658) + -1817614813 * anInt7559) : (aClass142Array7547[0].method2321(i_120_, i_121_, 1682026153) + -1817614813 * anInt7559)) + (1000 << -906898059 * anInt7496 - 7));
						i_118_ = aClass178_7495.method3094(i_122_, i_124_, i_123_, i_122_, i_125_, i_123_);
						aBoolArrayArray7556[i_116_][i_119_] = 0 == i_118_;
					} else {
						i_118_ = -1;
						aBoolArrayArray7556[i_116_][i_119_] = false;
					}
					if (i_116_ > 0 && i_119_ > 0) {
						int i_126_ = (anIntArray7557[i_119_ - 1] & anIntArray7557[i_119_] & i_117_ & i_118_);
						aBoolArrayArray7558[i_116_ - 1][i_119_ - 1] = 0 == i_126_;
					}
				}
				anIntArray7557[(anInt7538 * -1164760089 + -1164760089 * anInt7538)] = i_117_;
				anIntArray7557[1 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)] = i_118_;
			}
			if (!bool_114_)
				aClass544_7541.aBool7250 = false;
			else {
				aClass544_7541.anIntArray7253 = is_103_;
				aClass544_7541.anIntArray7269 = is_104_;
				aClass544_7541.anIntArray7249 = is_105_;
				aClass544_7541.anIntArray7271 = is_106_;
				aClass544_7541.anIntArray7262 = is_107_;
				aClass544_7541.method9018(aClass178_7495, i_108_);
			}
		} else {
			if (aBoolArrayArray7549 == null)
				aBoolArrayArray7549 = (new boolean[2 + (anInt7538 * -1164760089 + -1164760089 * anInt7538)][2 + (-1164760089 * anInt7538 + anInt7538 * -1164760089)]);
			for (int i_127_ = 0; i_127_ < aBoolArrayArray7549.length; i_127_++) {
				for (int i_128_ = 0; i_128_ < aBoolArrayArray7549[0].length; i_128_++)
					aBoolArrayArray7549[i_127_][i_128_] = true;
			}
			aBoolArrayArray7556 = aBoolArrayArray7549;
			aBoolArrayArray7558 = aBoolArrayArray7549;
			anInt7524 = 0;
			anInt7543 = 0;
			anInt7542 = anInt7546 * 1722966961;
			anInt7544 = 261187811 * anInt7507;
			aClass544_7541.aBool7250 = false;
		}
		Class553.method9162(this, aClass178_7495, (byte) -62);
		if (!aClass549_7555.aBool7323) {
			Iterator iterator = aClass549_7555.aList7326.iterator();
			while (iterator.hasNext()) {
				Class559 class559 = (Class559) iterator.next();
				iterator.remove();
				Class478.method7893(class559, 1055648727);
			}
		}
		if (aBool7502) {
			for (int i_129_ = 0; i_129_ < 1807701791 * anInt7499; i_129_++)
				aClass550Array7506[i_129_].method9112(i, bool, 2144002290);
		}
		if (null != aClass565ArrayArrayArray7512) {
			method9250(true, 1357652815);
			aClass178_7495.method3149(-1, new Class163(1583160, 40, 127, 63, 0, 0, 0));
			method9291(true, is, i_108_, i_109_, i_113_);
			aClass178_7495.method3323();
			method9250(false, 1357652815);
		}
		method9291(false, is, i_108_, i_109_, i_113_);
		if (!aBool7503) {
			aBoolArrayArray7558 = bools;
			aBoolArrayArray7556 = bools_115_;
		}
	}

	public boolean method9274(Class647_Sub1_Sub3 class647_sub1_sub3, boolean bool) {
		boolean bool_130_ = aClass142Array7513 == aClass142Array7509;
		int i = 0;
		short i_131_ = 0;
		byte i_132_ = 0;
		class647_sub1_sub3.method18158(206905111);
		short i_133_ = 0;
		int i_134_ = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11750));
		int i_135_ = Math.min(-957102653 * anInt7546 - 1, Math.max(0, class647_sub1_sub3.aShort11749));
		int i_136_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11751));
		int i_137_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11752));
		for (int i_138_ = i_134_; i_138_ <= i_135_; i_138_++) {
			for (int i_139_ = i_136_; i_139_ <= i_137_; i_139_++) {
				Class565 class565 = method9377(class647_sub1_sub3.aByte10821, i_138_, i_139_, 939939011);
				if (class565 != null) {
					Class548 class548 = Class211.method3822(class647_sub1_sub3, -1773973421);
					Class548 class548_140_ = class565.aClass548_7593;
					if (class548_140_ == null)
						class565.aClass548_7593 = class548;
					else {
						for (/**/; null != class548_140_.aClass548_7319; class548_140_ = class548_140_.aClass548_7319) {
							/* empty */
						}
						class548_140_.aClass548_7319 = class548;
					}
					if (bool_130_ && (anIntArrayArray7514[i_138_][i_139_] & ~0xffffff) != 0) {
						i = anIntArrayArray7514[i_138_][i_139_];
						i_131_ = aShortArrayArray7516[i_138_][i_139_];
						i_132_ = aByteArrayArray7532[i_138_][i_139_];
					}
					if (!bool && class565.aClass647_Sub1_Sub2_7591 != null && (class565.aClass647_Sub1_Sub2_7591.aShort11740 > i_133_))
						i_133_ = class565.aClass647_Sub1_Sub2_7591.aShort11740;
				}
			}
		}
		if (bool_130_ && (i & ~0xffffff) != 0) {
			for (int i_141_ = i_134_; i_141_ <= i_135_; i_141_++) {
				for (int i_142_ = i_136_; i_142_ <= i_137_; i_142_++) {
					if (0 == (anIntArrayArray7514[i_141_][i_142_] & ~0xffffff)) {
						anIntArrayArray7514[i_141_][i_142_] = i;
						aShortArrayArray7516[i_141_][i_142_] = i_131_;
						aByteArrayArray7532[i_141_][i_142_] = i_132_;
					}
				}
			}
		}
		if (bool) {
			aClass647_Sub1_Sub3Array7531[(anInt7520 += -595278139) * -1449605107 - 1] = class647_sub1_sub3;
			class647_sub1_sub3.aClass560_10822 = this;
		} else {
			int i_143_ = aClass142Array7513 == aClass142Array7509 ? 1 : 0;
			if (class647_sub1_sub3.method16701(-291807627)) {
				if (class647_sub1_sub3.method16702(1474116384)) {
					class647_sub1_sub3.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_143_];
					aClass647_Sub1Array7525[i_143_] = class647_sub1_sub3;
				} else {
					class647_sub1_sub3.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_143_];
					aClass647_Sub1Array7522[i_143_] = class647_sub1_sub3;
				}
			} else {
				class647_sub1_sub3.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_143_];
				aClass647_Sub1Array7526[i_143_] = class647_sub1_sub3;
			}
		}
		if (bool) {
			Class437 class437 = Class437.method6884(class647_sub1_sub3.method10569().aClass437_4862);
			class437.aFloat4904 -= (float) i_133_;
			class647_sub1_sub3.method10573(class437);
			class437.method6949();
		}
		return true;
	}

	public void method9275() {
		for (int i = 0; i < -1277045625 * anInt7505; i++) {
			for (int i_144_ = 0; i_144_ < -957102653 * anInt7546; i_144_++) {
				for (int i_145_ = 0; i_145_ < anInt7507 * -34274863; i_145_++) {
					Class565 class565 = aClass565ArrayArrayArray7508[i][i_144_][i_145_];
					if (class565 != null) {
						Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
						Class647_Sub1_Sub4 class647_sub1_sub4_146_ = class565.aClass647_Sub1_Sub4_7596;
						if (class647_sub1_sub4 != null && class647_sub1_sub4.method16699(-50469117)) {
							method9289(class647_sub1_sub4, i, i_144_, i_145_, 1, 1);
							if (null != class647_sub1_sub4_146_ && class647_sub1_sub4_146_.method16699(-34391221)) {
								method9289(class647_sub1_sub4_146_, i, i_144_, i_145_, 1, 1);
								class647_sub1_sub4_146_.method16703(aClass178_7495, class647_sub1_sub4, 0, 0, 0, false, 2056018675);
								class647_sub1_sub4_146_.method16704((byte) -50);
							}
							class647_sub1_sub4.method16704((byte) 19);
						}
						for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
							Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
							if (class647_sub1_sub3 != null && class647_sub1_sub3.method16699(1207882809)) {
								method9289(class647_sub1_sub3, i, i_144_, i_145_, (class647_sub1_sub3.aShort11749 - class647_sub1_sub3.aShort11750 + 1), 1 + (class647_sub1_sub3.aShort11752 - (class647_sub1_sub3.aShort11751)));
								class647_sub1_sub3.method16704((byte) -16);
							}
						}
						Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
						if (class647_sub1_sub2 != null && class647_sub1_sub2.method16699(-366428909)) {
							method9288(class647_sub1_sub2, i, i_144_, i_145_, (byte) -1);
							class647_sub1_sub2.method16704((byte) -74);
						}
					}
				}
			}
		}
	}

	void method9276(Class647_Sub1[] class647_sub1s, int i, int i_147_) {
		if (i < i_147_) {
			int i_148_ = (i + i_147_) / 2;
			int i_149_ = i;
			Class647_Sub1 class647_sub1 = class647_sub1s[i_148_];
			class647_sub1s[i_148_] = class647_sub1s[i_147_];
			class647_sub1s[i_147_] = class647_sub1;
			int i_150_ = -1529775437 * class647_sub1.anInt10820;
			for (int i_151_ = i; i_151_ < i_147_; i_151_++) {
				if (class647_sub1s[i_151_].anInt10820 * -1529775437 > (i_151_ & 0x1) + i_150_) {
					Class647_Sub1 class647_sub1_152_ = class647_sub1s[i_151_];
					class647_sub1s[i_151_] = class647_sub1s[i_149_];
					class647_sub1s[i_149_++] = class647_sub1_152_;
				}
			}
			class647_sub1s[i_147_] = class647_sub1s[i_149_];
			class647_sub1s[i_149_] = class647_sub1;
			method9278(class647_sub1s, i, i_149_ - 1);
			method9278(class647_sub1s, i_149_ + 1, i_147_);
		}
	}

	void method9277(Class647_Sub1_Sub3 class647_sub1_sub3, boolean bool) {
		int i = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11750));
		int i_153_ = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11749));
		int i_154_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11751));
		int i_155_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, class647_sub1_sub3.aShort11752));
		for (int i_156_ = i; i_156_ <= i_153_; i_156_++) {
			for (int i_157_ = i_154_; i_157_ <= i_155_; i_157_++) {
				Class565 class565 = (aClass565ArrayArrayArray7508[class647_sub1_sub3.aByte10821][i_156_][i_157_]);
				if (null != class565) {
					Class548 class548 = class565.aClass548_7593;
					Class548 class548_158_ = null;
					for (/**/; null != class548; class548 = class548.aClass548_7319) {
						if (class548.aClass647_Sub1_Sub3_7318 == class647_sub1_sub3) {
							if (class548_158_ != null)
								class548_158_.aClass548_7319 = class548.aClass548_7319;
							else
								class565.aClass548_7593 = class548.aClass548_7319;
							class548.method9095(-2065280630);
							break;
						}
						class548_158_ = class548;
					}
				}
			}
		}
		if (!bool)
			method9279(class647_sub1_sub3, 1185013548);
	}

	void method9278(Class647_Sub1[] class647_sub1s, int i, int i_159_) {
		if (i < i_159_) {
			int i_160_ = (i + i_159_) / 2;
			int i_161_ = i;
			Class647_Sub1 class647_sub1 = class647_sub1s[i_160_];
			class647_sub1s[i_160_] = class647_sub1s[i_159_];
			class647_sub1s[i_159_] = class647_sub1;
			int i_162_ = -1529775437 * class647_sub1.anInt10820;
			for (int i_163_ = i; i_163_ < i_159_; i_163_++) {
				if (class647_sub1s[i_163_].anInt10820 * -1529775437 > (i_163_ & 0x1) + i_162_) {
					Class647_Sub1 class647_sub1_164_ = class647_sub1s[i_163_];
					class647_sub1s[i_163_] = class647_sub1s[i_161_];
					class647_sub1s[i_161_++] = class647_sub1_164_;
				}
			}
			class647_sub1s[i_159_] = class647_sub1s[i_161_];
			class647_sub1s[i_161_] = class647_sub1;
			method9278(class647_sub1s, i, i_161_ - 1);
			method9278(class647_sub1s, i_161_ + 1, i_159_);
		}
	}

	void method9279(Class647_Sub1 class647_sub1, int i) {
		if (null != class647_sub1) {
			class647_sub1.method10591();
			for (int i_165_ = 0; i_165_ < 2; i_165_++) {
				Class647_Sub1 class647_sub1_166_ = null;
				for (Class647_Sub1 class647_sub1_167_ = aClass647_Sub1Array7522[i_165_]; class647_sub1_167_ != null; class647_sub1_167_ = class647_sub1_167_.aClass647_Sub1_10819) {
					if (class647_sub1 == class647_sub1_167_) {
						if (class647_sub1_166_ != null)
							class647_sub1_166_.aClass647_Sub1_10819 = class647_sub1_167_.aClass647_Sub1_10819;
						else
							aClass647_Sub1Array7522[i_165_] = class647_sub1_167_.aClass647_Sub1_10819;
						return;
					}
					class647_sub1_166_ = class647_sub1_167_;
				}
				class647_sub1_166_ = null;
				for (Class647_Sub1 class647_sub1_168_ = aClass647_Sub1Array7525[i_165_]; null != class647_sub1_168_; class647_sub1_168_ = class647_sub1_168_.aClass647_Sub1_10819) {
					if (class647_sub1_168_ == class647_sub1) {
						if (class647_sub1_166_ != null)
							class647_sub1_166_.aClass647_Sub1_10819 = class647_sub1_168_.aClass647_Sub1_10819;
						else
							aClass647_Sub1Array7525[i_165_] = class647_sub1_168_.aClass647_Sub1_10819;
						return;
					}
					class647_sub1_166_ = class647_sub1_168_;
				}
				class647_sub1_166_ = null;
				for (Class647_Sub1 class647_sub1_169_ = aClass647_Sub1Array7526[i_165_]; null != class647_sub1_169_; class647_sub1_169_ = class647_sub1_169_.aClass647_Sub1_10819) {
					if (class647_sub1_169_ == class647_sub1) {
						if (class647_sub1_166_ != null)
							class647_sub1_166_.aClass647_Sub1_10819 = class647_sub1_169_.aClass647_Sub1_10819;
						else
							aClass647_Sub1Array7526[i_165_] = class647_sub1_169_.aClass647_Sub1_10819;
						return;
					}
					class647_sub1_166_ = class647_sub1_169_;
				}
			}
		}
	}

	public Class647_Sub1_Sub4 method9280(int i, int i_170_, int i_171_, int i_172_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_170_][i_171_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub4_7587;
	}

	public int method9281(int i, int i_173_) {
		return (null != aByteArrayArray7517 ? aByteArrayArray7517[i][i_173_] & 0xff : 0);
	}

	public Class647_Sub1_Sub2 method9282(int i, int i_174_, int i_175_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_174_][i_175_];
		if (null == class565 || class565.aClass647_Sub1_Sub2_7591 == null)
			return null;
		return class565.aClass647_Sub1_Sub2_7591;
	}

	public Class647_Sub1_Sub5 method9283(int i, int i_176_, int i_177_, byte i_178_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_176_][i_177_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub5_7592;
	}

	public Class647_Sub1_Sub1 method9284(int i, int i_179_, int i_180_, byte i_181_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_179_][i_180_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub1_7589;
	}

	public Class548 method9285(int i, int i_182_, int i_183_, int i_184_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_182_][i_183_];
		if (class565 == null)
			return null;
		return class565.aClass548_7593;
	}

	public void method9286(int i, Class142 class142) {
		aClass142Array7509[i] = class142;
	}

	void method9287(Class647_Sub1_Sub3 class647_sub1_sub3, boolean bool, int i) {
		int i_185_ = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11750));
		int i_186_ = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11749));
		int i_187_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11751));
		int i_188_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, class647_sub1_sub3.aShort11752));
		for (int i_189_ = i_185_; i_189_ <= i_186_; i_189_++) {
			for (int i_190_ = i_187_; i_190_ <= i_188_; i_190_++) {
				Class565 class565 = (aClass565ArrayArrayArray7508[class647_sub1_sub3.aByte10821][i_189_][i_190_]);
				if (null != class565) {
					Class548 class548 = class565.aClass548_7593;
					Class548 class548_191_ = null;
					for (/**/; null != class548; class548 = class548.aClass548_7319) {
						if (class548.aClass647_Sub1_Sub3_7318 == class647_sub1_sub3) {
							if (class548_191_ != null)
								class548_191_.aClass548_7319 = class548.aClass548_7319;
							else
								class565.aClass548_7593 = class548.aClass548_7319;
							class548.method9095(-2065280630);
							break;
						}
						class548_191_ = class548;
					}
				}
			}
		}
		if (!bool)
			method9279(class647_sub1_sub3, 1185013548);
	}

	void method9288(Class647_Sub1 class647_sub1, int i, int i_192_, int i_193_, byte i_194_) {
		if (i_192_ < -957102653 * anInt7546) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_192_ + 1][i_193_];
			if (class565 != null && class565.aClass647_Sub1_Sub2_7591 != null && class565.aClass647_Sub1_Sub2_7591.method16699(164281225)) {
				int i_195_ = ((aClass142Array7509[i].method2321(1 + i_192_, i_193_, 1912598517) + aClass142Array7509[i].method2321(1 + i_192_ + 1, i_193_, 2109283346) + aClass142Array7509[i].method2321(i_192_ + 1, i_193_ + 1, 1706077420) + aClass142Array7509[i].method2321(i_192_ + 1 + 1, i_193_ + 1, 1700735960)) / 4 - (aClass142Array7509[i].method2321(i_192_, i_193_, 1629102840) + aClass142Array7509[i].method2321(1 + i_192_, i_193_, 1933563734) + aClass142Array7509[i].method2321(i_192_, 1 + i_193_, 1631533101) + aClass142Array7509[i].method2321(i_192_ + 1, 1 + i_193_, 1986618295)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_195_, 0, true, 1596660218);
			}
		}
		if (i_193_ < anInt7546 * -957102653) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_192_][1 + i_193_];
			if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591 && class565.aClass647_Sub1_Sub2_7591.method16699(223118935)) {
				int i_196_ = ((aClass142Array7509[i].method2321(i_192_, i_193_, 1829422953) + aClass142Array7509[i].method2321(1 + i_192_, i_193_ + 1, 1924521726) + aClass142Array7509[i].method2321(i_192_, i_193_ + 1 + 1, 2033743013) + aClass142Array7509[i].method2321(1 + i_192_, 1 + i_193_ + 1, 1980109667)) / 4 - (aClass142Array7509[i].method2321(i_192_, i_193_, 1946204177) + aClass142Array7509[i].method2321(1 + i_192_, i_193_, 2120888733) + aClass142Array7509[i].method2321(i_192_, i_193_ + 1, 1975868657) + aClass142Array7509[i].method2321(i_192_ + 1, i_193_ + 1, 1652568506)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, 0, i_196_, -1817614813 * anInt7559, true, 1766835618);
			}
		}
		if (i_192_ < anInt7546 * -957102653 && i_193_ < -34274863 * anInt7507) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_192_ + 1][1 + i_193_];
			if (class565 != null && class565.aClass647_Sub1_Sub2_7591 != null && class565.aClass647_Sub1_Sub2_7591.method16699(493229970)) {
				int i_197_ = ((aClass142Array7509[i].method2321(1 + i_192_, 1 + i_193_, 2081267665) + aClass142Array7509[i].method2321(1 + (1 + i_192_), i_193_ + 1, 1542749831) + aClass142Array7509[i].method2321(i_192_ + 1, 1 + (i_193_ + 1), 1815307791) + aClass142Array7509[i].method2321(i_192_ + 1 + 1, 1 + i_193_ + 1, 1649882466)) / 4 - (aClass142Array7509[i].method2321(i_192_, i_193_, 1563896945) + aClass142Array7509[i].method2321(1 + i_192_, i_193_, 1843628261) + aClass142Array7509[i].method2321(i_192_, i_193_ + 1, 1864297910) + aClass142Array7509[i].method2321(i_192_ + 1, i_193_ + 1, 1601667754)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_197_, anInt7559 * -1817614813, true, 1547322650);
			}
		}
		if (i_192_ < -957102653 * anInt7546 && i_193_ > 0) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_192_ + 1][i_193_ - 1];
			if (class565 != null && null != class565.aClass647_Sub1_Sub2_7591 && class565.aClass647_Sub1_Sub2_7591.method16699(489753718)) {
				int i_198_ = ((aClass142Array7509[i].method2321(1 + i_192_, i_193_ - 1, 1586333106) + aClass142Array7509[i].method2321(1 + (1 + i_192_), i_193_ - 1, 1802885541) + aClass142Array7509[i].method2321(1 + i_192_, i_193_ + 1 - 1, 1878038719) + aClass142Array7509[i].method2321(1 + (1 + i_192_), 1 + i_193_ - 1, 2138665325)) / 4 - (aClass142Array7509[i].method2321(i_192_, i_193_, 2011896176) + aClass142Array7509[i].method2321(1 + i_192_, i_193_, 1639489464) + aClass142Array7509[i].method2321(i_192_, 1 + i_193_, 1919741389) + aClass142Array7509[i].method2321(1 + i_192_, i_193_ + 1, 1967143189)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_198_, -(anInt7559 * -1817614813), true, -539563460);
			}
		}
	}

	void method9289(Class647_Sub1 class647_sub1, int i, int i_199_, int i_200_, int i_201_, int i_202_) {
		boolean bool = true;
		int i_203_ = i_199_;
		int i_204_ = i_199_ + i_201_;
		int i_205_ = i_200_ - 1;
		int i_206_ = i_200_ + i_202_;
		for (int i_207_ = i; i_207_ <= i + 1; i_207_++) {
			if (i_207_ != anInt7505 * -1277045625) {
				for (int i_208_ = i_203_; i_208_ <= i_204_; i_208_++) {
					if (i_208_ >= 0 && i_208_ < anInt7546 * -957102653) {
						for (int i_209_ = i_205_; i_209_ <= i_206_; i_209_++) {
							if (i_209_ >= 0 && i_209_ < anInt7507 * -34274863 && (!bool || i_208_ >= i_204_ || i_209_ >= i_206_ || i_209_ < i_200_ && i_208_ != i_199_)) {
								Class565 class565 = (aClass565ArrayArrayArray7508[i_207_][i_208_][i_209_]);
								if (null != class565) {
									int i_210_ = (((aClass142Array7509[i_207_].method2321(i_208_, i_209_, 2033111003)) + (aClass142Array7509[i_207_].method2321(i_208_ + 1, i_209_, 1628519816)) + (aClass142Array7509[i_207_].method2321(i_208_, i_209_ + 1, 2082324304)) + (aClass142Array7509[i_207_].method2321(1 + i_208_, 1 + i_209_, 1838851368))) / 4 - ((aClass142Array7509[i].method2321(i_199_, i_200_, 1563383033)) + (aClass142Array7509[i].method2321(i_199_ + 1, i_200_, 1597951495)) + (aClass142Array7509[i].method2321(i_199_, i_200_ + 1, 1731417398)) + (aClass142Array7509[i].method2321(i_199_ + 1, 1 + i_200_, 1833163594))) / 4);
									Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
									Class647_Sub1_Sub4 class647_sub1_sub4_211_ = class565.aClass647_Sub1_Sub4_7596;
									if (null != class647_sub1_sub4 && class647_sub1_sub4.method16699(37399939))
										class647_sub1.method16703(aClass178_7495, class647_sub1_sub4, ((1774368449 * anInt7498 * (1 - i_201_)) + ((i_208_ - i_199_) * (-1817614813 * anInt7559))), i_210_, ((1 - i_202_) * (anInt7498 * 1774368449) + (-1817614813 * anInt7559 * (i_209_ - i_200_))), bool, -981502701);
									if (null != class647_sub1_sub4_211_ && class647_sub1_sub4_211_.method16699(1548675360))
										class647_sub1.method16703(aClass178_7495, class647_sub1_sub4_211_, ((anInt7498 * 1774368449 * (1 - i_201_)) + ((i_208_ - i_199_) * (anInt7559 * -1817614813))), i_210_, ((anInt7498 * 1774368449 * (1 - i_202_)) + (anInt7559 * -1817614813 * (i_209_ - i_200_))), bool, 1806952155);
									for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
										Class647_Sub1_Sub3 class647_sub1_sub3 = (class548.aClass647_Sub1_Sub3_7318);
										if (null != class647_sub1_sub3 && class647_sub1_sub3.method16699(884833897) && (i_208_ == (class647_sub1_sub3.aShort11750) || i_208_ == i_203_) && ((class647_sub1_sub3.aShort11751 == i_209_) || i_205_ == i_209_)) {
											int i_212_ = 1 + ((class647_sub1_sub3.aShort11749) - (class647_sub1_sub3.aShort11750));
											int i_213_ = 1 + ((class647_sub1_sub3.aShort11752) - (class647_sub1_sub3.aShort11751));
											class647_sub1.method16703(aClass178_7495, class647_sub1_sub3, ((((class647_sub1_sub3.aShort11750) - i_199_) * (anInt7559 * -1817614813)) + (anInt7498 * 1774368449 * (i_212_ - i_201_))), i_210_, ((1774368449 * anInt7498 * (i_213_ - i_202_)) + (anInt7559 * -1817614813 * ((class647_sub1_sub3.aShort11751) - i_200_))), bool, 488035262);
										}
									}
								}
							}
						}
					}
				}
				i_203_--;
				bool = false;
			}
		}
	}

	void method9290(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_214_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_215_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_215_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_215_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_215_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_215_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_215_, (byte) 28) * -780986409;
			class163.anInt1775 = method9254(i, i_215_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_215_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_215_, (short) -9128) * -923094865;
			class163.anInt1777 = method9261(i, i_215_, (short) -903) * -320151975;
			class163.anInt1773 = method9329(i, i_215_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, -1324514693), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) -74);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -1328300853);
			} else
				Class478.method7893(class559, 483487421);
		}
	}

	void method9291(boolean bool, byte[][][] is, int i, byte i_216_, int i_217_) {
		int i_218_ = bool ? 1 : 0;
		anInt7527 = 0;
		anInt7528 = 0;
		anInt7500 += -1725844687;
		if (0 == (i_217_ & 0x2)) {
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7522[i_218_]; class647_sub1 != null; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -83);
				if (-1529775437 * class647_sub1.anInt10820 != -1 && !method9371(class647_sub1, bool, is, i, i_216_))
					aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = class647_sub1;
			}
		}
		if ((i_217_ & 0x1) == 0) {
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7525[i_218_]; class647_sub1 != null; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -115);
				if (-1 != class647_sub1.anInt10820 * -1529775437 && !method9371(class647_sub1, bool, is, i, i_216_))
					aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = class647_sub1;
			}
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7526[i_218_]; null != class647_sub1; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -100);
				if (class647_sub1.anInt10820 * -1529775437 != -1 && !method9371(class647_sub1, bool, is, i, i_216_)) {
					if (class647_sub1.method16702(1620355641))
						aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = class647_sub1;
					else
						aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = class647_sub1;
				}
			}
			if (!bool) {
				for (int i_219_ = 0; i_219_ < -1449605107 * anInt7520; i_219_++) {
					method9292(aClass647_Sub1_Sub3Array7531[i_219_], (byte) -26);
					if (-1 != (aClass647_Sub1_Sub3Array7531[i_219_].anInt10820 * -1529775437) && !method9371(aClass647_Sub1_Sub3Array7531[i_219_], bool, is, i, i_216_)) {
						if (aClass647_Sub1_Sub3Array7531[i_219_].method16702(-693796539))
							aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = aClass647_Sub1_Sub3Array7531[i_219_];
						else
							aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = aClass647_Sub1_Sub3Array7531[i_219_];
					}
				}
			}
		}
		if (1242708363 * anInt7527 > 0) {
			method9294(aClass647_Sub1Array7530, 0, anInt7527 * 1242708363 - 1);
			for (int i_220_ = 0; i_220_ < anInt7527 * 1242708363; i_220_++)
				method9296(aClass647_Sub1Array7530[i_220_], aClass523_Sub20Array7537);
		}
		if (aBool7502)
			aClass178_7495.method3132(0, null);
		if (0 == (i_217_ & 0x2)) {
			for (int i_221_ = 0; i_221_ < -1277045625 * anInt7505; i_221_++) {
				if (i_221_ >= i && null != is) {
					int i_222_ = aBoolArrayArray7558.length;
					if (1814696425 * anInt7524 + aBoolArrayArray7558.length > anInt7546 * -957102653)
						i_222_ -= (anInt7524 * 1814696425 + aBoolArrayArray7558.length - anInt7546 * -957102653);
					int i_223_ = aBoolArrayArray7558[0].length;
					if (aBoolArrayArray7558[0].length + anInt7543 * 1279546093 > anInt7507 * -34274863)
						i_223_ -= (anInt7543 * 1279546093 + aBoolArrayArray7558[0].length - anInt7507 * -34274863);
					boolean[][] bools = aBoolArrayArray7556;
					if (aBool7503) {
						for (int i_224_ = anInt7534 * -2072413863; i_224_ < i_222_; i_224_++) {
							int i_225_ = (i_224_ + 1814696425 * anInt7524 - anInt7534 * -2072413863);
							for (int i_226_ = anInt7540 * -1169077603; i_226_ < i_223_; i_226_++) {
								bools[i_224_][i_226_] = false;
								if (aBoolArrayArray7558[i_224_][i_226_]) {
									int i_227_ = (i_226_ + anInt7543 * 1279546093 - -1169077603 * anInt7540);
									for (int i_228_ = i_221_; i_228_ >= 0; i_228_--) {
										if ((null != (aClass565ArrayArrayArray7508[i_228_][i_225_][i_227_])) && (aClass565ArrayArrayArray7508[i_228_][i_225_][i_227_].aByte7595) == i_221_) {
											if ((i_228_ >= i && (is[i_228_][i_225_][i_227_] == i_216_)) || (aClass544_7541.method9022(i_221_, i_225_, i_227_)))
												bools[i_224_][i_226_] = false;
											else
												bools[i_224_][i_226_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass142Array7509[i_221_].method2322(-208391685 * anInt7504, anInt7533 * 164493233, -1164760089 * anInt7538, aBoolArrayArray7556, false, i_217_);
				} else {
					int i_229_ = aBoolArrayArray7558.length;
					if (1814696425 * anInt7524 + aBoolArrayArray7558.length > -957102653 * anInt7546)
						i_229_ -= (aBoolArrayArray7558.length + 1814696425 * anInt7524 - -957102653 * anInt7546);
					int i_230_ = aBoolArrayArray7558[0].length;
					if (aBoolArrayArray7558[0].length + 1279546093 * anInt7543 > -34274863 * anInt7507)
						i_230_ -= (1279546093 * anInt7543 + aBoolArrayArray7558[0].length - -34274863 * anInt7507);
					boolean[][] bools = aBoolArrayArray7556;
					if (aBool7503) {
						for (int i_231_ = -2072413863 * anInt7534; i_231_ < i_229_; i_231_++) {
							int i_232_ = (i_231_ + anInt7524 * 1814696425 - anInt7534 * -2072413863);
							for (int i_233_ = anInt7540 * -1169077603; i_233_ < i_230_; i_233_++) {
								if (aBoolArrayArray7558[i_231_][i_233_] && !(aClass544_7541.method9022(i_221_, i_232_, (i_233_ + anInt7543 * 1279546093 - anInt7540 * -1169077603))))
									bools[i_231_][i_233_] = true;
								else
									bools[i_231_][i_233_] = false;
							}
						}
					}
					aClass142Array7509[i_221_].method2322(-208391685 * anInt7504, anInt7533 * 164493233, anInt7538 * -1164760089, aBoolArrayArray7556, true, i_217_);
				}
			}
		}
		if (anInt7528 * 1996215013 > 0) {
			method9278(aClass647_Sub1Array7497, 0, anInt7528 * 1996215013 - 1);
			for (int i_234_ = 0; i_234_ < 1996215013 * anInt7528; i_234_++)
				method9296(aClass647_Sub1Array7497[i_234_], aClass523_Sub20Array7537);
		}
	}

	void method9292(Class647_Sub1 class647_sub1, byte i) {
		Class437 class437 = class647_sub1.method10569().aClass437_4862;
		aClass178_7495.method3153((float) (int) class437.aFloat4903, (float) ((int) class437.aFloat4904 + (class647_sub1.method16743(-506114646) >> 1)), (float) (int) class437.aFloat4905, aFloatArray7545);
		class647_sub1.anInt10820 = -176962437 * (int) aFloatArray7545[2];
	}

	public int method9293(int i, int i_235_) {
		return (aByteArrayArray7532 != null ? aByteArrayArray7532[i][i_235_] & 0xff : 0);
	}

	void method9294(Class647_Sub1[] class647_sub1s, int i, int i_236_) {
		if (i < i_236_) {
			int i_237_ = (i + i_236_) / 2;
			int i_238_ = i;
			Class647_Sub1 class647_sub1 = class647_sub1s[i_237_];
			class647_sub1s[i_237_] = class647_sub1s[i_236_];
			class647_sub1s[i_236_] = class647_sub1;
			int i_239_ = -1529775437 * class647_sub1.anInt10820;
			for (int i_240_ = i; i_240_ < i_236_; i_240_++) {
				if (-1529775437 * class647_sub1s[i_240_].anInt10820 < (i_240_ & 0x1) + i_239_) {
					Class647_Sub1 class647_sub1_241_ = class647_sub1s[i_240_];
					class647_sub1s[i_240_] = class647_sub1s[i_238_];
					class647_sub1s[i_238_++] = class647_sub1_241_;
				}
			}
			class647_sub1s[i_236_] = class647_sub1s[i_238_];
			class647_sub1s[i_238_] = class647_sub1;
			method9294(class647_sub1s, i, i_238_ - 1);
			method9294(class647_sub1s, 1 + i_238_, i_236_);
		}
	}

	public Class647_Sub1_Sub3 method9295(int i, int i_242_, int i_243_, Interface63 interface63, byte i_244_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_242_][i_243_];
		if (null == class565)
			return null;
		for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
			if ((null == interface63 || interface63.method422(class647_sub1_sub3, -1374271135)) && i_242_ == class647_sub1_sub3.aShort11750 && class647_sub1_sub3.aShort11751 == i_243_)
				return class647_sub1_sub3;
		}
		return null;
	}

	void method9296(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_245_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_246_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_246_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_246_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_246_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_246_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_246_, (byte) 54) * -780986409;
			class163.anInt1775 = method9254(i, i_246_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_246_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_246_, (short) -13486) * -923094865;
			class163.anInt1777 = method9261(i, i_246_, (short) 8396) * -320151975;
			class163.anInt1773 = method9329(i, i_246_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 456669784), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) 83);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -1472947122);
			} else
				Class478.method7893(class559, -642959786);
		}
	}

	public boolean method9297(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_247_, int i_248_, boolean[] bools, int i_249_) {
		boolean bool = false;
		if (aClass142Array7513 != aClass142Array7509) {
			int i_250_ = aClass142Array7547[i].method2326(i_247_, i_248_, -743277740);
			int i_251_ = 0;
			for (/**/; i_251_ <= i; i_251_++) {
				Class142 class142 = aClass142Array7547[i_251_];
				if (null != class142) {
					int i_252_ = i_250_ - class142.method2326(i_247_, i_248_, -734565904);
					if (bools != null) {
						bools[i_251_] = class142.method2333(class523_sub27_sub4, i_247_, i_252_, i_248_, 0, false);
						if (!bools[i_251_])
							continue;
					}
					class142.method2331(class523_sub27_sub4, i_247_, i_252_, i_248_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public Class560(Class178 class178, int i, int i_253_, int i_254_, int i_255_, int i_256_, boolean bool, boolean bool_257_) {
		anInt7520 = 0;
		anInt7521 = 10067;
		anInt7519 = 5090;
		anInt7511 = 5016;
		aFloatArray7545 = new float[3];
		aClass523_Sub20Array7537 = new Class523_Sub20[8];
		anInt7515 = 65164;
		aHashMap7553 = new HashMap();
		aHashMap7554 = new HashMap();
		aClass178_7495 = class178;
		aBool7502 = aClass178_7495.method3267() > 0;
		anInt7496 = i * 1321636573;
		anInt7559 = 2041936267 * (1 << -906898059 * anInt7496);
		anInt7498 = -131671743 * (anInt7559 * -1817614813 >> 1);
		anInt7505 = i_253_ * 564572471;
		anInt7546 = -125086997 * i_254_;
		anInt7507 = -1237649615 * i_255_;
		anInt7538 = i_256_ * -1252214825;
		aClass61_7501 = new Class61();
		aClass544_7541 = new Class544(this);
		aClass565ArrayArrayArray7510 = (new Class565[i_253_][-957102653 * anInt7546][-34274863 * anInt7507]);
		aClass142Array7547 = new Class142[i_253_];
		if (bool) {
			anIntArrayArray7514 = new int[anInt7546 * -957102653][-34274863 * anInt7507];
			aByteArrayArray7532 = new byte[-957102653 * anInt7546][-34274863 * anInt7507];
			aShortArrayArray7516 = new short[-957102653 * anInt7546][anInt7507 * -34274863];
			aByteArrayArray7517 = new byte[anInt7546 * -957102653][anInt7507 * -34274863];
			aByteArrayArray7518 = new byte[anInt7546 * -957102653][-34274863 * anInt7507];
			aByteArrayArray7539 = new byte[anInt7546 * -957102653][anInt7507 * -34274863];
			aClass565ArrayArrayArray7512 = (new Class565[1][-957102653 * anInt7546][anInt7507 * -34274863]);
			aClass142Array7513 = new Class142[1];
		}
		if (bool_257_) {
			aLongArrayArrayArray7529 = new long[i_253_][i_254_][i_255_];
			aClass550Array7506 = new Class550[65164];
			aBoolArray7552 = new boolean[65164];
			anInt7499 = 0;
		}
		method9250(false, 1357652815);
		aClass647_Sub1Array7522 = new Class647_Sub1[2];
		aClass647_Sub1Array7525 = new Class647_Sub1[2];
		aClass647_Sub1Array7526 = new Class647_Sub1[2];
		aClass647_Sub1Array7530 = new Class647_Sub1[10067];
		anInt7527 = 0;
		aClass647_Sub1Array7497 = new Class647_Sub1[5090];
		anInt7528 = 0;
		aClass647_Sub1_Sub3Array7531 = new Class647_Sub1_Sub3[5016];
		anInt7520 = 0;
		aBoolArrayArray7558 = (new boolean[1 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)][1 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)]);
		aBoolArrayArray7556 = (new boolean[2 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)][-1164760089 * anInt7538 + anInt7538 * -1164760089 + 2]);
		anIntArray7557 = new int[2 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)];
		aClass549_7555 = new Class549(false);
	}

	void method9298(int i, int i_258_, int i_259_) {
		Class523_Sub27_Sub4 class523_sub27_sub4 = null;
		for (int i_260_ = i; i_260_ < i_258_; i_260_++) {
			Class142 class142 = aClass142Array7547[i_260_];
			if (class142 != null) {
				for (int i_261_ = 0; i_261_ < anInt7507 * -34274863; i_261_++) {
					for (int i_262_ = 0; i_262_ < anInt7546 * -957102653; i_262_++) {
						class523_sub27_sub4 = class142.method2330(i_262_, i_261_, class523_sub27_sub4);
						if (null != class523_sub27_sub4) {
							int i_263_ = i_262_ << anInt7496 * -906898059;
							int i_264_ = i_261_ << -906898059 * anInt7496;
							for (int i_265_ = i_260_ - 1; i_265_ >= 0; i_265_--) {
								Class142 class142_266_ = aClass142Array7547[i_265_];
								if (class142_266_ != null) {
									int i_267_ = (class142.method2321(i_262_, i_261_, 1937564598) - (class142_266_.method2321(i_262_, i_261_, 1632928974)));
									int i_268_ = (class142.method2321(i_262_ + 1, i_261_, 2123148919) - (class142_266_.method2321(i_262_ + 1, i_261_, 1647871861)));
									int i_269_ = (class142.method2321(1 + i_262_, 1 + i_261_, 2087460546) - (class142_266_.method2321(i_262_ + 1, i_261_ + 1, 1673805884)));
									int i_270_ = (class142.method2321(i_262_, 1 + i_261_, 1816458674) - (class142_266_.method2321(i_262_, 1 + i_261_, 1776081581)));
									class142_266_.method2331(class523_sub27_sub4, i_263_, ((i_270_ + (i_268_ + i_267_ + i_269_)) / 4), i_264_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public void method9299(byte i) {
		for (int i_271_ = 0; i_271_ < anInt7499 * 1807701791; i_271_++) {
			if (!aBoolArray7552[i_271_]) {
				Class550 class550 = aClass550Array7506[i_271_];
				Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
				int i_272_ = 1991405609 * class550.anInt7352;
				int i_273_ = (class523_sub20.method16066(-1879460461) - anInt7498 * 1774368449);
				int i_274_ = 1 + (i_273_ * 2 >> anInt7496 * -906898059);
				int i_275_ = 0;
				int[] is = new int[i_274_ * i_274_];
				int i_276_ = (class523_sub20.method16062(2131811589) - i_273_ >> anInt7496 * -906898059);
				int i_277_ = (class523_sub20.method16065(1730151178) - i_273_ >> anInt7496 * -906898059);
				int i_278_ = (class523_sub20.method16065(2082736287) + i_273_ >> -906898059 * anInt7496);
				if (i_277_ < 0) {
					i_275_ -= i_277_;
					i_277_ = 0;
				}
				if (i_278_ >= -34274863 * anInt7507)
					i_278_ = anInt7507 * -34274863 - 1;
				for (int i_279_ = i_277_; i_279_ <= i_278_; i_279_++) {
					int i_280_ = class550.aShortArray7353[i_275_];
					int i_281_ = i_280_ >>> 8;
					int i_282_ = i_274_ * i_275_ + i_281_;
					int i_283_ = (i_280_ >>> 8) + i_276_;
					int i_284_ = i_283_ + (i_280_ & 0xff) - 1;
					if (i_283_ < 0) {
						i_282_ -= i_283_;
						i_283_ = 0;
					}
					if (i_284_ >= -957102653 * anInt7546)
						i_284_ = -957102653 * anInt7546 - 1;
					for (int i_285_ = i_283_; i_285_ <= i_284_; i_285_++) {
						int i_286_ = 1;
						Class647_Sub1_Sub3 class647_sub1_sub3 = method9295(i_272_, i_285_, i_279_, null, (byte) 4);
						if (class647_sub1_sub3 != null && 0 != class647_sub1_sub3.aByte11756) {
							if (class647_sub1_sub3.aByte11756 == 1) {
								boolean bool = i_285_ - 1 >= i_283_;
								boolean bool_287_ = 1 + i_285_ <= i_284_;
								if (!bool && i_279_ + 1 <= i_278_) {
									int i_288_ = class550.aShortArray7353[i_275_ + 1];
									int i_289_ = i_276_ + (i_288_ >>> 8);
									int i_290_ = i_289_ + (i_288_ & 0xff);
									bool = i_285_ > i_289_ && i_285_ < i_290_;
								}
								if (!bool_287_ && i_279_ - 1 >= i_277_) {
									int i_291_ = class550.aShortArray7353[i_275_ - 1];
									int i_292_ = i_276_ + (i_291_ >>> 8);
									int i_293_ = (i_291_ & 0xff) + i_292_;
									bool_287_ = i_285_ > i_292_ && i_285_ < i_293_;
								}
								if (bool && !bool_287_)
									i_286_ = 4;
								else if (bool_287_ && !bool)
									i_286_ = 2;
							} else {
								boolean bool = i_285_ - 1 >= i_283_;
								boolean bool_294_ = 1 + i_285_ <= i_284_;
								if (!bool && i_279_ - 1 >= i_277_) {
									int i_295_ = class550.aShortArray7353[i_275_ - 1];
									int i_296_ = i_276_ + (i_295_ >>> 8);
									int i_297_ = i_296_ + (i_295_ & 0xff);
									bool = i_285_ > i_296_ && i_285_ < i_297_;
								}
								if (!bool_294_ && i_279_ + 1 <= i_278_) {
									int i_298_ = class550.aShortArray7353[1 + i_275_];
									int i_299_ = i_276_ + (i_298_ >>> 8);
									int i_300_ = i_299_ + (i_298_ & 0xff);
									bool_294_ = i_285_ > i_299_ && i_285_ < i_300_;
								}
								if (bool && !bool_294_)
									i_286_ = 3;
								else if (bool_294_ && !bool)
									i_286_ = 5;
							}
						}
						is[i_282_++] = i_286_;
					}
					i_275_++;
				}
				aBoolArray7552[i_271_] = true;
				if (aBool7551)
					aClass142Array7509[i_272_].method2334(class523_sub20, is);
			}
		}
	}

	public void method9300(int i, int i_301_, int i_302_) {
		Class565 class565 = aClass565ArrayArrayArray7508[0][i][i_301_];
		for (int i_303_ = 0; i_303_ < 3; i_303_++) {
			Class565 class565_304_ = (aClass565ArrayArrayArray7508[i_303_][i][i_301_] = aClass565ArrayArrayArray7508[1 + i_303_][i][i_301_]);
			if (null != class565_304_) {
				for (Class548 class548 = class565_304_.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
					Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
					if (class647_sub1_sub3.aShort11750 == i && class647_sub1_sub3.aShort11751 == i_301_)
						class647_sub1_sub3.aByte10821--;
				}
				if (class565_304_.aClass647_Sub1_Sub2_7591 != null)
					class565_304_.aClass647_Sub1_Sub2_7591.aByte10821--;
				if (null != class565_304_.aClass647_Sub1_Sub4_7587)
					class565_304_.aClass647_Sub1_Sub4_7587.aByte10821--;
				if (class565_304_.aClass647_Sub1_Sub4_7596 != null)
					class565_304_.aClass647_Sub1_Sub4_7596.aByte10821--;
				if (null != class565_304_.aClass647_Sub1_Sub1_7589)
					class565_304_.aClass647_Sub1_Sub1_7589.aByte10821--;
				if (null != class565_304_.aClass647_Sub1_Sub1_7590)
					class565_304_.aClass647_Sub1_Sub1_7590.aByte10821--;
			}
		}
		if (null == aClass565ArrayArrayArray7508[0][i][i_301_]) {
			aClass565ArrayArrayArray7508[0][i][i_301_] = new Class565(0);
			aClass565ArrayArrayArray7508[0][i][i_301_].aByte7595 = (byte) 1;
		}
		aClass565ArrayArrayArray7508[0][i][i_301_].aClass565_7586 = class565;
		aClass565ArrayArrayArray7508[3][i][i_301_] = null;
	}

	public int method9301(int i, int i_305_, int i_306_) {
		return (aByteArrayArray7532 != null ? aByteArrayArray7532[i][i_305_] & 0xff : 0);
	}

	public void method9302(int i, int i_307_, int i_308_, int i_309_) {
		List list = (List) aHashMap7553.get(Integer.valueOf(i));
		if (list != null) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class550 class550 = (Class550) iterator.next();
				class550.aClass523_Sub20_7349.method16074(i_307_, i_308_, 1984085007);
			}
		}
	}

	public void method9303(int i, int i_310_, int i_311_, int i_312_, Class647_Sub1_Sub5 class647_sub1_sub5) {
		Class565 class565 = method9253(i, i_310_, i_311_, (short) 11101);
		if (null != class565) {
			class647_sub1_sub5.method10573(new Class437((float) (anInt7498 * 1774368449 + (i_310_ << -906898059 * anInt7496)), (float) i_312_, (float) (anInt7498 * 1774368449 + (i_311_ << -906898059 * anInt7496))));
			class565.aClass647_Sub1_Sub5_7592 = class647_sub1_sub5;
			int i_313_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub5.method16701(-168005437)) {
				if (class647_sub1_sub5.method16702(1194603769)) {
					class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_313_];
					aClass647_Sub1Array7525[i_313_] = class647_sub1_sub5;
				} else {
					class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_313_];
					aClass647_Sub1Array7522[i_313_] = class647_sub1_sub5;
				}
			} else {
				class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_313_];
				aClass647_Sub1Array7526[i_313_] = class647_sub1_sub5;
			}
		}
	}

	public Class647_Sub1_Sub1 method9304(int i, int i_314_, int i_315_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_314_][i_315_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7589, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7589 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
				class565.aClass647_Sub1_Sub1_7589 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public void method9305(int i) {
		for (int i_316_ = 0; i_316_ < anInt7546 * -957102653; i_316_++) {
			for (int i_317_ = 0; i_317_ < anInt7507 * -34274863; i_317_++) {
				if (aClass565ArrayArrayArray7508[0][i_316_][i_317_] == null)
					aClass565ArrayArrayArray7508[0][i_316_][i_317_] = new Class565(0);
			}
		}
	}

	public void method9306(int i) {
		/* empty */
	}

	public void method9307(boolean bool) {
		if (bool) {
			aClass565ArrayArrayArray7508 = aClass565ArrayArrayArray7512;
			aClass142Array7509 = aClass142Array7513;
		} else {
			aClass565ArrayArrayArray7508 = aClass565ArrayArrayArray7510;
			aClass142Array7509 = aClass142Array7547;
		}
		anInt7505 = 564572471 * aClass565ArrayArrayArray7508.length;
	}

	public void method9308() {
		for (int i = 0; i < anInt7546 * -957102653; i++) {
			for (int i_318_ = 0; i_318_ < anInt7507 * -34274863; i_318_++) {
				if (aClass565ArrayArrayArray7508[0][i][i_318_] == null)
					aClass565ArrayArrayArray7508[0][i][i_318_] = new Class565(0);
			}
		}
	}

	public void method9309(HashMap hashmap, int i) {
		aHashMap7554 = hashmap;
	}

	void method9310(Class647_Sub1 class647_sub1, int i, int i_319_, int i_320_, int i_321_, int i_322_) {
		boolean bool = true;
		int i_323_ = i_319_;
		int i_324_ = i_319_ + i_321_;
		int i_325_ = i_320_ - 1;
		int i_326_ = i_320_ + i_322_;
		for (int i_327_ = i; i_327_ <= i + 1; i_327_++) {
			if (i_327_ != anInt7505 * -1277045625) {
				for (int i_328_ = i_323_; i_328_ <= i_324_; i_328_++) {
					if (i_328_ >= 0 && i_328_ < anInt7546 * -957102653) {
						for (int i_329_ = i_325_; i_329_ <= i_326_; i_329_++) {
							if (i_329_ >= 0 && i_329_ < anInt7507 * -34274863 && (!bool || i_328_ >= i_324_ || i_329_ >= i_326_ || i_329_ < i_320_ && i_328_ != i_319_)) {
								Class565 class565 = (aClass565ArrayArrayArray7508[i_327_][i_328_][i_329_]);
								if (null != class565) {
									int i_330_ = (((aClass142Array7509[i_327_].method2321(i_328_, i_329_, 1933411992)) + (aClass142Array7509[i_327_].method2321(i_328_ + 1, i_329_, 1999802626)) + (aClass142Array7509[i_327_].method2321(i_328_, i_329_ + 1, 1700610453)) + (aClass142Array7509[i_327_].method2321(1 + i_328_, 1 + i_329_, 1634360426))) / 4 - ((aClass142Array7509[i].method2321(i_319_, i_320_, 1848745758)) + (aClass142Array7509[i].method2321(i_319_ + 1, i_320_, 1733657488)) + (aClass142Array7509[i].method2321(i_319_, i_320_ + 1, 1781153711)) + (aClass142Array7509[i].method2321(i_319_ + 1, 1 + i_320_, 1631370667))) / 4);
									Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
									Class647_Sub1_Sub4 class647_sub1_sub4_331_ = class565.aClass647_Sub1_Sub4_7596;
									if (null != class647_sub1_sub4 && class647_sub1_sub4.method16699(-383761256))
										class647_sub1.method16703(aClass178_7495, class647_sub1_sub4, ((1774368449 * anInt7498 * (1 - i_321_)) + ((i_328_ - i_319_) * (-1817614813 * anInt7559))), i_330_, ((1 - i_322_) * (anInt7498 * 1774368449) + (-1817614813 * anInt7559 * (i_329_ - i_320_))), bool, 441538475);
									if (null != class647_sub1_sub4_331_ && class647_sub1_sub4_331_.method16699(1493903749))
										class647_sub1.method16703(aClass178_7495, class647_sub1_sub4_331_, ((anInt7498 * 1774368449 * (1 - i_321_)) + ((i_328_ - i_319_) * (anInt7559 * -1817614813))), i_330_, ((anInt7498 * 1774368449 * (1 - i_322_)) + (anInt7559 * -1817614813 * (i_329_ - i_320_))), bool, 1580947688);
									for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
										Class647_Sub1_Sub3 class647_sub1_sub3 = (class548.aClass647_Sub1_Sub3_7318);
										if (null != class647_sub1_sub3 && class647_sub1_sub3.method16699(2116688926) && (i_328_ == (class647_sub1_sub3.aShort11750) || i_328_ == i_323_) && ((class647_sub1_sub3.aShort11751 == i_329_) || i_325_ == i_329_)) {
											int i_332_ = 1 + ((class647_sub1_sub3.aShort11749) - (class647_sub1_sub3.aShort11750));
											int i_333_ = 1 + ((class647_sub1_sub3.aShort11752) - (class647_sub1_sub3.aShort11751));
											class647_sub1.method16703(aClass178_7495, class647_sub1_sub3, ((((class647_sub1_sub3.aShort11750) - i_319_) * (anInt7559 * -1817614813)) + (anInt7498 * 1774368449 * (i_332_ - i_321_))), i_330_, ((1774368449 * anInt7498 * (i_333_ - i_322_)) + (anInt7559 * -1817614813 * ((class647_sub1_sub3.aShort11751) - i_320_))), bool, -398403753);
										}
									}
								}
							}
						}
					}
				}
				i_323_--;
				bool = false;
			}
		}
	}

	public HashMap method9311(int i) {
		aHashMap7554.clear();
		Iterator iterator = aHashMap7553.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			aHashMap7554.put(entry.getKey(), (((Class550) ((List) entry.getValue()).get(0)).aClass523_Sub20_7349));
		}
		return aHashMap7554;
	}

	public void method9312(int i, int i_334_) {
		Class565 class565 = aClass565ArrayArrayArray7508[0][i][i_334_];
		for (int i_335_ = 0; i_335_ < 3; i_335_++) {
			Class565 class565_336_ = (aClass565ArrayArrayArray7508[i_335_][i][i_334_] = aClass565ArrayArrayArray7508[1 + i_335_][i][i_334_]);
			if (null != class565_336_) {
				for (Class548 class548 = class565_336_.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
					Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
					if (class647_sub1_sub3.aShort11750 == i && class647_sub1_sub3.aShort11751 == i_334_)
						class647_sub1_sub3.aByte10821--;
				}
				if (class565_336_.aClass647_Sub1_Sub2_7591 != null)
					class565_336_.aClass647_Sub1_Sub2_7591.aByte10821--;
				if (null != class565_336_.aClass647_Sub1_Sub4_7587)
					class565_336_.aClass647_Sub1_Sub4_7587.aByte10821--;
				if (class565_336_.aClass647_Sub1_Sub4_7596 != null)
					class565_336_.aClass647_Sub1_Sub4_7596.aByte10821--;
				if (null != class565_336_.aClass647_Sub1_Sub1_7589)
					class565_336_.aClass647_Sub1_Sub1_7589.aByte10821--;
				if (null != class565_336_.aClass647_Sub1_Sub1_7590)
					class565_336_.aClass647_Sub1_Sub1_7590.aByte10821--;
			}
		}
		if (null == aClass565ArrayArrayArray7508[0][i][i_334_]) {
			aClass565ArrayArrayArray7508[0][i][i_334_] = new Class565(0);
			aClass565ArrayArrayArray7508[0][i][i_334_].aByte7595 = (byte) 1;
		}
		aClass565ArrayArrayArray7508[0][i][i_334_].aClass565_7586 = class565;
		aClass565ArrayArrayArray7508[3][i][i_334_] = null;
	}

	public void method9313(Class164 class164, byte i) {
		/* empty */
	}

	Class565 method9314(int i, int i_337_, int i_338_) {
		if (null == aClass565ArrayArrayArray7508[i][i_337_][i_338_]) {
			boolean bool = (aClass565ArrayArrayArray7508[0][i_337_][i_338_] != null && (aClass565ArrayArrayArray7508[0][i_337_][i_338_].aClass565_7586) != null);
			if (bool && i >= anInt7505 * -1277045625 - 1)
				return null;
			method9330(i, i_337_, i_338_, (byte) 4);
		}
		return aClass565ArrayArrayArray7508[i][i_337_][i_338_];
	}

	Class565 method9315(int i, int i_339_, int i_340_) {
		if (null == aClass565ArrayArrayArray7508[i][i_339_][i_340_]) {
			boolean bool = (aClass565ArrayArrayArray7508[0][i_339_][i_340_] != null && (aClass565ArrayArrayArray7508[0][i_339_][i_340_].aClass565_7586) != null);
			if (bool && i >= anInt7505 * -1277045625 - 1)
				return null;
			method9330(i, i_339_, i_340_, (byte) 4);
		}
		return aClass565ArrayArrayArray7508[i][i_339_][i_340_];
	}

	Class565 method9316(int i, int i_341_, int i_342_) {
		return method9253(i, Math.min(-957102653 * anInt7546 - 1, Math.max(0, i_341_)), Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_342_)), (short) 14483);
	}

	Class565 method9317(int i, int i_343_, int i_344_) {
		return method9253(i, Math.min(-957102653 * anInt7546 - 1, Math.max(0, i_343_)), Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_344_)), (short) 13968);
	}

	Class565 method9318(int i, int i_345_, int i_346_) {
		return method9253(i, Math.min(-957102653 * anInt7546 - 1, Math.max(0, i_345_)), Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_346_)), (short) 26264);
	}

	public void method9319(int i, int i_347_, int i_348_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_347_][i_348_] != null && (aClass565ArrayArrayArray7508[0][i_347_][i_348_].aClass565_7586) != null);
		for (int i_349_ = i; i_349_ >= 0; i_349_--) {
			if (null == aClass565ArrayArrayArray7508[i_349_][i_347_][i_348_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_349_][i_347_][i_348_] = new Class565(i_349_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	void method9320(Class647_Sub1 class647_sub1, int i, int i_350_, int i_351_) {
		if (i_350_ < -957102653 * anInt7546) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_350_ + 1][i_351_];
			if (class565 != null && class565.aClass647_Sub1_Sub2_7591 != null && class565.aClass647_Sub1_Sub2_7591.method16699(1837982100)) {
				int i_352_ = ((aClass142Array7509[i].method2321(1 + i_350_, i_351_, 1602249174) + aClass142Array7509[i].method2321(1 + i_350_ + 1, i_351_, 1686777752) + aClass142Array7509[i].method2321(i_350_ + 1, i_351_ + 1, 1823080959) + aClass142Array7509[i].method2321(i_350_ + 1 + 1, i_351_ + 1, 1753114457)) / 4 - (aClass142Array7509[i].method2321(i_350_, i_351_, 2011896032) + aClass142Array7509[i].method2321(1 + i_350_, i_351_, 1909993742) + aClass142Array7509[i].method2321(i_350_, 1 + i_351_, 2005967410) + aClass142Array7509[i].method2321(i_350_ + 1, 1 + i_351_, 1774058819)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_352_, 0, true, -696362282);
			}
		}
		if (i_351_ < anInt7546 * -957102653) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_350_][1 + i_351_];
			if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591 && class565.aClass647_Sub1_Sub2_7591.method16699(-183565112)) {
				int i_353_ = ((aClass142Array7509[i].method2321(i_350_, i_351_, 1877793827) + aClass142Array7509[i].method2321(1 + i_350_, i_351_ + 1, 1943703321) + aClass142Array7509[i].method2321(i_350_, i_351_ + 1 + 1, 2027699393) + aClass142Array7509[i].method2321(1 + i_350_, 1 + i_351_ + 1, 2145009973)) / 4 - (aClass142Array7509[i].method2321(i_350_, i_351_, 1808225605) + aClass142Array7509[i].method2321(1 + i_350_, i_351_, 1565587959) + aClass142Array7509[i].method2321(i_350_, i_351_ + 1, 1541145249) + aClass142Array7509[i].method2321(i_350_ + 1, i_351_ + 1, 2128440347)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, 0, i_353_, -1817614813 * anInt7559, true, -1589678674);
			}
		}
		if (i_350_ < anInt7546 * -957102653 && i_351_ < -34274863 * anInt7507) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_350_ + 1][1 + i_351_];
			if (class565 != null && class565.aClass647_Sub1_Sub2_7591 != null && class565.aClass647_Sub1_Sub2_7591.method16699(-204766279)) {
				int i_354_ = ((aClass142Array7509[i].method2321(1 + i_350_, 1 + i_351_, 2053805946) + aClass142Array7509[i].method2321(1 + (1 + i_350_), i_351_ + 1, 1619817712) + aClass142Array7509[i].method2321(i_350_ + 1, 1 + (i_351_ + 1), 1575833153) + aClass142Array7509[i].method2321(i_350_ + 1 + 1, 1 + i_351_ + 1, 1676113923)) / 4 - (aClass142Array7509[i].method2321(i_350_, i_351_, 1938992793) + aClass142Array7509[i].method2321(1 + i_350_, i_351_, 2084488383) + aClass142Array7509[i].method2321(i_350_, i_351_ + 1, 1952065684) + aClass142Array7509[i].method2321(i_350_ + 1, i_351_ + 1, 1582718010)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_354_, anInt7559 * -1817614813, true, 699091129);
			}
		}
		if (i_350_ < -957102653 * anInt7546 && i_351_ > 0) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_350_ + 1][i_351_ - 1];
			if (class565 != null && null != class565.aClass647_Sub1_Sub2_7591 && class565.aClass647_Sub1_Sub2_7591.method16699(-106495110)) {
				int i_355_ = ((aClass142Array7509[i].method2321(1 + i_350_, i_351_ - 1, 2112213375) + aClass142Array7509[i].method2321(1 + (1 + i_350_), i_351_ - 1, 1625958019) + aClass142Array7509[i].method2321(1 + i_350_, i_351_ + 1 - 1, 2119560124) + aClass142Array7509[i].method2321(1 + (1 + i_350_), 1 + i_351_ - 1, 1661939403)) / 4 - (aClass142Array7509[i].method2321(i_350_, i_351_, 1906835960) + aClass142Array7509[i].method2321(1 + i_350_, i_351_, 2131745275) + aClass142Array7509[i].method2321(i_350_, 1 + i_351_, 1681697173) + aClass142Array7509[i].method2321(1 + i_350_, i_351_ + 1, 1812868236)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_355_, -(anInt7559 * -1817614813), true, 261463326);
			}
		}
	}

	public void method9321(int i, int i_356_, int i_357_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_356_][i_357_] != null && (aClass565ArrayArrayArray7508[0][i_356_][i_357_].aClass565_7586) != null);
		for (int i_358_ = i; i_358_ >= 0; i_358_--) {
			if (null == aClass565ArrayArrayArray7508[i_358_][i_356_][i_357_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_358_][i_356_][i_357_] = new Class565(i_358_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public Class647_Sub1_Sub1 method9322(int i, int i_359_, int i_360_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_359_][i_360_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7589, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7589 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
				class565.aClass647_Sub1_Sub1_7589 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public void method9323(int i, int i_361_, int i_362_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_361_][i_362_] != null && (aClass565ArrayArrayArray7508[0][i_361_][i_362_].aClass565_7586) != null);
		for (int i_363_ = i; i_363_ >= 0; i_363_--) {
			if (null == aClass565ArrayArrayArray7508[i_363_][i_361_][i_362_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_363_][i_361_][i_362_] = new Class565(i_363_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public void method9324(int i, int i_364_, int i_365_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_364_][i_365_] != null && (aClass565ArrayArrayArray7508[0][i_364_][i_365_].aClass565_7586) != null);
		for (int i_366_ = i; i_366_ >= 0; i_366_--) {
			if (null == aClass565ArrayArrayArray7508[i_366_][i_364_][i_365_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_366_][i_364_][i_365_] = new Class565(i_366_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public void method9325(int i, int i_367_, int i_368_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_367_][i_368_] != null && (aClass565ArrayArrayArray7508[0][i_367_][i_368_].aClass565_7586) != null);
		for (int i_369_ = i; i_369_ >= 0; i_369_--) {
			if (null == aClass565ArrayArrayArray7508[i_369_][i_367_][i_368_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_369_][i_367_][i_368_] = new Class565(i_369_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public void method9326(int i, Class142 class142) {
		aClass142Array7509[i] = class142;
	}

	public Class647_Sub1_Sub5 method9327(int i, int i_370_, int i_371_, int i_372_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_370_][i_371_];
		if (null == class565)
			return null;
		Class647_Sub1_Sub5 class647_sub1_sub5 = class565.aClass647_Sub1_Sub5_7592;
		class565.aClass647_Sub1_Sub5_7592 = null;
		method9279(class647_sub1_sub5, 1185013548);
		return class647_sub1_sub5;
	}

	public int method9328(int i, int i_373_) {
		return (aShortArrayArray7516 != null ? aShortArrayArray7516[i][i_373_] & 0xffff : 0);
	}

	public int method9329(int i, int i_374_, int i_375_) {
		return (aByteArrayArray7539 != null ? aByteArrayArray7539[i][i_374_] & 0xff : 0);
	}

	public void method9330(int i, int i_376_, int i_377_, byte i_378_) {
		boolean bool = (aClass565ArrayArrayArray7508[0][i_376_][i_377_] != null && (aClass565ArrayArrayArray7508[0][i_376_][i_377_].aClass565_7586) != null);
		for (int i_379_ = i; i_379_ >= 0; i_379_--) {
			if (null == aClass565ArrayArrayArray7508[i_379_][i_376_][i_377_]) {
				Class565 class565 = (aClass565ArrayArrayArray7508[i_379_][i_376_][i_377_] = new Class565(i_379_));
				if (bool)
					class565.aByte7595++;
			}
		}
	}

	public int method9331(int i, int i_380_) {
		return (aByteArrayArray7539 != null ? aByteArrayArray7539[i][i_380_] & 0xff : 0);
	}

	public int method9332(int i, int i_381_) {
		return (aByteArrayArray7532 != null ? aByteArrayArray7532[i][i_381_] & 0xff : 0);
	}

	public int method9333(int i, int i_382_) {
		return (aByteArrayArray7532 != null ? aByteArrayArray7532[i][i_382_] & 0xff : 0);
	}

	public void method9334(int i) {
		method9298(1, anInt7505 * -1277045625, 988044534);
	}

	public Class647_Sub1_Sub4 method9335(int i, int i_383_, int i_384_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_383_][i_384_];
		if (class565 == null)
			return null;
		return class565.aClass647_Sub1_Sub4_7596;
	}

	public void method9336(int i) {
		for (int i_385_ = 0; i_385_ < -1449605107 * anInt7520; i_385_++) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = aClass647_Sub1_Sub3Array7531[i_385_];
			method9287(class647_sub1_sub3, true, -1200246563);
			aClass647_Sub1_Sub3Array7531[i_385_] = null;
		}
		anInt7520 = 0;
	}

	public void method9337() {
		for (int i = 0; i < anInt7546 * -957102653; i++) {
			for (int i_386_ = 0; i_386_ < anInt7507 * -34274863; i_386_++) {
				if (aClass565ArrayArrayArray7508[0][i][i_386_] == null)
					aClass565ArrayArrayArray7508[0][i][i_386_] = new Class565(0);
			}
		}
	}

	public int method9338(int i, int i_387_) {
		return (aByteArrayArray7539 != null ? aByteArrayArray7539[i][i_387_] & 0xff : 0);
	}

	public void method9339(int i, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_) {
		if (null != anIntArrayArray7514)
			anIntArrayArray7514[i][i_388_] = ~0xffffff | i_389_;
		if (aShortArrayArray7516 != null)
			aShortArrayArray7516[i][i_388_] = (short) i_390_;
		if (null != aByteArrayArray7532)
			aByteArrayArray7532[i][i_388_] = (byte) i_391_;
		if (null != aByteArrayArray7517)
			aByteArrayArray7517[i][i_388_] = (byte) i_392_;
		if (null != aByteArrayArray7518)
			aByteArrayArray7518[i][i_388_] = (byte) i_393_;
		if (aByteArrayArray7539 != null)
			aByteArrayArray7539[i][i_388_] = (byte) i_394_;
	}

	public void method9340() {
		for (int i = 0; i < -1277045625 * anInt7505; i++) {
			for (int i_395_ = 0; i_395_ < -957102653 * anInt7546; i_395_++) {
				for (int i_396_ = 0; i_396_ < anInt7507 * -34274863; i_396_++) {
					Class565 class565 = aClass565ArrayArrayArray7508[i][i_395_][i_396_];
					if (class565 != null) {
						Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
						Class647_Sub1_Sub4 class647_sub1_sub4_397_ = class565.aClass647_Sub1_Sub4_7596;
						if (class647_sub1_sub4 != null && class647_sub1_sub4.method16699(1315302143)) {
							method9289(class647_sub1_sub4, i, i_395_, i_396_, 1, 1);
							if (null != class647_sub1_sub4_397_ && class647_sub1_sub4_397_.method16699(1485178635)) {
								method9289(class647_sub1_sub4_397_, i, i_395_, i_396_, 1, 1);
								class647_sub1_sub4_397_.method16703(aClass178_7495, class647_sub1_sub4, 0, 0, 0, false, -2037430804);
								class647_sub1_sub4_397_.method16704((byte) -44);
							}
							class647_sub1_sub4.method16704((byte) 46);
						}
						for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
							Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
							if (class647_sub1_sub3 != null && class647_sub1_sub3.method16699(604462238)) {
								method9289(class647_sub1_sub3, i, i_395_, i_396_, (class647_sub1_sub3.aShort11749 - class647_sub1_sub3.aShort11750 + 1), 1 + (class647_sub1_sub3.aShort11752 - (class647_sub1_sub3.aShort11751)));
								class647_sub1_sub3.method16704((byte) -46);
							}
						}
						Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
						if (class647_sub1_sub2 != null && class647_sub1_sub2.method16699(1354807022)) {
							method9288(class647_sub1_sub2, i, i_395_, i_396_, (byte) -1);
							class647_sub1_sub2.method16704((byte) -69);
						}
					}
				}
			}
		}
	}

	public void method9341(int i, int i_398_, int i_399_, Class647_Sub1_Sub2 class647_sub1_sub2) {
		Class565 class565 = method9253(i, i_398_, i_399_, (short) 9833);
		if (null != class565) {
			class565.aClass647_Sub1_Sub2_7591 = class647_sub1_sub2;
			int i_400_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub2.method16701(-394434871)) {
				if (class647_sub1_sub2.method16702(988554964)) {
					class647_sub1_sub2.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_400_];
					aClass647_Sub1Array7525[i_400_] = class647_sub1_sub2;
				} else {
					class647_sub1_sub2.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_400_];
					aClass647_Sub1Array7522[i_400_] = class647_sub1_sub2;
				}
			} else {
				class647_sub1_sub2.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_400_];
				aClass647_Sub1Array7526[i_400_] = class647_sub1_sub2;
			}
		}
	}

	public int method9342(int i, int i_401_) {
		return (anIntArrayArray7514 != null ? anIntArrayArray7514[i][i_401_] & 0xffffff : 0);
	}

	public void method9343(int i, int i_402_, int i_403_, int i_404_, Class647_Sub1_Sub5 class647_sub1_sub5) {
		Class565 class565 = method9253(i, i_402_, i_403_, (short) 12312);
		if (null != class565) {
			class647_sub1_sub5.method10573(new Class437((float) (anInt7498 * 1774368449 + (i_402_ << -906898059 * anInt7496)), (float) i_404_, (float) (anInt7498 * 1774368449 + (i_403_ << -906898059 * anInt7496))));
			class565.aClass647_Sub1_Sub5_7592 = class647_sub1_sub5;
			int i_405_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub5.method16701(-1734572448)) {
				if (class647_sub1_sub5.method16702(-587116964)) {
					class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_405_];
					aClass647_Sub1Array7525[i_405_] = class647_sub1_sub5;
				} else {
					class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_405_];
					aClass647_Sub1Array7522[i_405_] = class647_sub1_sub5;
				}
			} else {
				class647_sub1_sub5.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_405_];
				aClass647_Sub1Array7526[i_405_] = class647_sub1_sub5;
			}
		}
	}

	public void method9344(HashMap hashmap) {
		aHashMap7554 = hashmap;
	}

	public void method9345(int i, int i_406_, int i_407_, Class647_Sub1_Sub4 class647_sub1_sub4, Class647_Sub1_Sub4 class647_sub1_sub4_408_) {
		Class565 class565 = method9253(i, i_406_, i_407_, (short) 31885);
		if (class565 != null) {
			class565.aClass647_Sub1_Sub4_7587 = class647_sub1_sub4;
			class565.aClass647_Sub1_Sub4_7596 = class647_sub1_sub4_408_;
			int i_409_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub4.method16701(-1854097698)) {
				if (class647_sub1_sub4.method16702(1763636532)) {
					class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_409_];
					aClass647_Sub1Array7525[i_409_] = class647_sub1_sub4;
				} else {
					class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_409_];
					aClass647_Sub1Array7522[i_409_] = class647_sub1_sub4;
				}
			} else {
				class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_409_];
				aClass647_Sub1Array7526[i_409_] = class647_sub1_sub4;
			}
			if (class647_sub1_sub4_408_ != null) {
				if (class647_sub1_sub4_408_.method16701(-180852563)) {
					if (class647_sub1_sub4_408_.method16702(4129780)) {
						class647_sub1_sub4_408_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_409_];
						aClass647_Sub1Array7525[i_409_] = class647_sub1_sub4_408_;
					} else {
						class647_sub1_sub4_408_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_409_];
						aClass647_Sub1Array7522[i_409_] = class647_sub1_sub4_408_;
					}
				} else {
					class647_sub1_sub4_408_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_409_];
					aClass647_Sub1Array7526[i_409_] = class647_sub1_sub4_408_;
				}
			}
		}
	}

	public void method9346(int i, int i_410_, int i_411_, Class647_Sub1_Sub1 class647_sub1_sub1, Class647_Sub1_Sub1 class647_sub1_sub1_412_) {
		Class565 class565 = method9253(i, i_410_, i_411_, (short) 25841);
		if (null != class565) {
			class565.aClass647_Sub1_Sub1_7589 = class647_sub1_sub1;
			class565.aClass647_Sub1_Sub1_7590 = class647_sub1_sub1_412_;
			int i_413_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub1.method16701(-2050271943)) {
				if (class647_sub1_sub1.method16702(138763811)) {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_413_];
					aClass647_Sub1Array7525[i_413_] = class647_sub1_sub1;
				} else {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_413_];
					aClass647_Sub1Array7522[i_413_] = class647_sub1_sub1;
				}
			} else {
				class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_413_];
				aClass647_Sub1Array7526[i_413_] = class647_sub1_sub1;
			}
			if (null != class647_sub1_sub1_412_) {
				if (class647_sub1_sub1_412_.method16701(-512756317)) {
					if (class647_sub1_sub1_412_.method16702(2117641234)) {
						class647_sub1_sub1_412_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_413_];
						aClass647_Sub1Array7525[i_413_] = class647_sub1_sub1_412_;
					} else {
						class647_sub1_sub1_412_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_413_];
						aClass647_Sub1Array7522[i_413_] = class647_sub1_sub1_412_;
					}
				} else {
					class647_sub1_sub1_412_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_413_];
					aClass647_Sub1Array7526[i_413_] = class647_sub1_sub1_412_;
				}
			}
		}
	}

	public void method9347(int i, int i_414_, int i_415_, Class647_Sub1_Sub1 class647_sub1_sub1, Class647_Sub1_Sub1 class647_sub1_sub1_416_) {
		Class565 class565 = method9253(i, i_414_, i_415_, (short) 6123);
		if (null != class565) {
			class565.aClass647_Sub1_Sub1_7589 = class647_sub1_sub1;
			class565.aClass647_Sub1_Sub1_7590 = class647_sub1_sub1_416_;
			int i_417_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub1.method16701(-1988343281)) {
				if (class647_sub1_sub1.method16702(645784040)) {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_417_];
					aClass647_Sub1Array7525[i_417_] = class647_sub1_sub1;
				} else {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_417_];
					aClass647_Sub1Array7522[i_417_] = class647_sub1_sub1;
				}
			} else {
				class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_417_];
				aClass647_Sub1Array7526[i_417_] = class647_sub1_sub1;
			}
			if (null != class647_sub1_sub1_416_) {
				if (class647_sub1_sub1_416_.method16701(-559011547)) {
					if (class647_sub1_sub1_416_.method16702(159562777)) {
						class647_sub1_sub1_416_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_417_];
						aClass647_Sub1Array7525[i_417_] = class647_sub1_sub1_416_;
					} else {
						class647_sub1_sub1_416_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_417_];
						aClass647_Sub1Array7522[i_417_] = class647_sub1_sub1_416_;
					}
				} else {
					class647_sub1_sub1_416_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_417_];
					aClass647_Sub1Array7526[i_417_] = class647_sub1_sub1_416_;
				}
			}
		}
	}

	public void method9348(int i, int i_418_, int i_419_, Class647_Sub1_Sub1 class647_sub1_sub1, Class647_Sub1_Sub1 class647_sub1_sub1_420_) {
		Class565 class565 = method9253(i, i_418_, i_419_, (short) 29060);
		if (null != class565) {
			class565.aClass647_Sub1_Sub1_7589 = class647_sub1_sub1;
			class565.aClass647_Sub1_Sub1_7590 = class647_sub1_sub1_420_;
			int i_421_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub1.method16701(-116836244)) {
				if (class647_sub1_sub1.method16702(1527551687)) {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_421_];
					aClass647_Sub1Array7525[i_421_] = class647_sub1_sub1;
				} else {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_421_];
					aClass647_Sub1Array7522[i_421_] = class647_sub1_sub1;
				}
			} else {
				class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_421_];
				aClass647_Sub1Array7526[i_421_] = class647_sub1_sub1;
			}
			if (null != class647_sub1_sub1_420_) {
				if (class647_sub1_sub1_420_.method16701(-989787156)) {
					if (class647_sub1_sub1_420_.method16702(606611683)) {
						class647_sub1_sub1_420_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_421_];
						aClass647_Sub1Array7525[i_421_] = class647_sub1_sub1_420_;
					} else {
						class647_sub1_sub1_420_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_421_];
						aClass647_Sub1Array7522[i_421_] = class647_sub1_sub1_420_;
					}
				} else {
					class647_sub1_sub1_420_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_421_];
					aClass647_Sub1Array7526[i_421_] = class647_sub1_sub1_420_;
				}
			}
		}
	}

	public void method9349(int i, int i_422_, int i_423_, Class647_Sub1_Sub1 class647_sub1_sub1, Class647_Sub1_Sub1 class647_sub1_sub1_424_) {
		Class565 class565 = method9253(i, i_422_, i_423_, (short) 24627);
		if (null != class565) {
			class565.aClass647_Sub1_Sub1_7589 = class647_sub1_sub1;
			class565.aClass647_Sub1_Sub1_7590 = class647_sub1_sub1_424_;
			int i_425_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub1.method16701(74351085)) {
				if (class647_sub1_sub1.method16702(1229409723)) {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_425_];
					aClass647_Sub1Array7525[i_425_] = class647_sub1_sub1;
				} else {
					class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_425_];
					aClass647_Sub1Array7522[i_425_] = class647_sub1_sub1;
				}
			} else {
				class647_sub1_sub1.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_425_];
				aClass647_Sub1Array7526[i_425_] = class647_sub1_sub1;
			}
			if (null != class647_sub1_sub1_424_) {
				if (class647_sub1_sub1_424_.method16701(-161905118)) {
					if (class647_sub1_sub1_424_.method16702(-35747128)) {
						class647_sub1_sub1_424_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_425_];
						aClass647_Sub1Array7525[i_425_] = class647_sub1_sub1_424_;
					} else {
						class647_sub1_sub1_424_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_425_];
						aClass647_Sub1Array7522[i_425_] = class647_sub1_sub1_424_;
					}
				} else {
					class647_sub1_sub1_424_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_425_];
					aClass647_Sub1Array7526[i_425_] = class647_sub1_sub1_424_;
				}
			}
		}
	}

	public Class647_Sub1_Sub1 method9350(int i, int i_426_, int i_427_, byte i_428_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_426_][i_427_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7589, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7589 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
				class565.aClass647_Sub1_Sub1_7589 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public void method9351(int i, int i_429_, int i_430_, int i_431_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_429_][i_430_];
		if (class565 != null) {
			Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
			Class647_Sub1_Sub1 class647_sub1_sub1_432_ = class565.aClass647_Sub1_Sub1_7590;
			if (null != class647_sub1_sub1) {
				class647_sub1_sub1.aShort11734 = (short) (class647_sub1_sub1.aShort11734 * i_431_ / (16 << anInt7496 * -906898059 - 7));
				class647_sub1_sub1.aShort11735 = (short) (i_431_ * class647_sub1_sub1.aShort11735 / (16 << -906898059 * anInt7496 - 7));
			}
			if (class647_sub1_sub1_432_ != null) {
				class647_sub1_sub1_432_.aShort11734 = (short) (class647_sub1_sub1_432_.aShort11734 * i_431_ / (16 << anInt7496 * -906898059 - 7));
				class647_sub1_sub1_432_.aShort11735 = (short) (i_431_ * class647_sub1_sub1_432_.aShort11735 / (16 << anInt7496 * -906898059 - 7));
			}
		}
	}

	public void method9352(int i, int i_433_, int i_434_, int i_435_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_433_][i_434_];
		if (class565 != null) {
			Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
			Class647_Sub1_Sub1 class647_sub1_sub1_436_ = class565.aClass647_Sub1_Sub1_7590;
			if (null != class647_sub1_sub1) {
				class647_sub1_sub1.aShort11734 = (short) (class647_sub1_sub1.aShort11734 * i_435_ / (16 << anInt7496 * -906898059 - 7));
				class647_sub1_sub1.aShort11735 = (short) (i_435_ * class647_sub1_sub1.aShort11735 / (16 << -906898059 * anInt7496 - 7));
			}
			if (class647_sub1_sub1_436_ != null) {
				class647_sub1_sub1_436_.aShort11734 = (short) (class647_sub1_sub1_436_.aShort11734 * i_435_ / (16 << anInt7496 * -906898059 - 7));
				class647_sub1_sub1_436_.aShort11735 = (short) (i_435_ * class647_sub1_sub1_436_.aShort11735 / (16 << anInt7496 * -906898059 - 7));
			}
		}
	}

	public void method9353() {
		for (int i = 0; i < -1449605107 * anInt7520; i++) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = aClass647_Sub1_Sub3Array7531[i];
			method9287(class647_sub1_sub3, true, -1443065797);
			aClass647_Sub1_Sub3Array7531[i] = null;
		}
		anInt7520 = 0;
	}

	public void method9354(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_437_, int i_438_, boolean[] bools, int i_439_) {
		if (aClass142Array7509 != aClass142Array7513) {
			int i_440_ = aClass142Array7547[i].method2326(i_437_, i_438_, 995682261);
			for (int i_441_ = 0; i_441_ <= i; i_441_++) {
				if (null == bools || bools[i_441_]) {
					Class142 class142 = aClass142Array7547[i_441_];
					if (null != class142)
						class142.method2332(class523_sub27_sub4, i_437_, (i_440_ - class142.method2326(i_437_, i_438_, 191815267)), i_438_, 0, false);
				}
			}
		}
	}

	public Class647_Sub1_Sub1 method9355(int i, int i_442_, int i_443_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_442_][i_443_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub1_7589;
	}

	public Class647_Sub1_Sub2 method9356(int i, int i_444_, int i_445_, byte i_446_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_444_][i_445_];
		if (class565 == null)
			return null;
		method9279(class565.aClass647_Sub1_Sub2_7591, 1185013548);
		if (null != class565.aClass647_Sub1_Sub2_7591) {
			Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
			class565.aClass647_Sub1_Sub2_7591 = null;
			return class647_sub1_sub2;
		}
		return null;
	}

	public Class647_Sub1_Sub1 method9357(int i, int i_447_, int i_448_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_447_][i_448_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7589, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7589 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
				class565.aClass647_Sub1_Sub1_7589 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public Class647_Sub1_Sub1 method9358(int i, int i_449_, int i_450_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_449_][i_450_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7589, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7589 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
				class565.aClass647_Sub1_Sub1_7589 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public Class647_Sub1_Sub4 method9359(int i, int i_451_, int i_452_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_451_][i_452_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub4_7587;
	}

	public Class647_Sub1_Sub1 method9360(int i, int i_453_, int i_454_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_453_][i_454_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7590, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7590 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7590;
				class565.aClass647_Sub1_Sub1_7590 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	public Class647_Sub1_Sub2 method9361(int i, int i_455_, int i_456_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_455_][i_456_];
		if (class565 == null)
			return null;
		method9279(class565.aClass647_Sub1_Sub2_7591, 1185013548);
		if (null != class565.aClass647_Sub1_Sub2_7591) {
			Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
			class565.aClass647_Sub1_Sub2_7591 = null;
			return class647_sub1_sub2;
		}
		return null;
	}

	public Class647_Sub1_Sub2 method9362(int i, int i_457_, int i_458_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_457_][i_458_];
		if (class565 == null)
			return null;
		method9279(class565.aClass647_Sub1_Sub2_7591, 1185013548);
		if (null != class565.aClass647_Sub1_Sub2_7591) {
			Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
			class565.aClass647_Sub1_Sub2_7591 = null;
			return class647_sub1_sub2;
		}
		return null;
	}

	public Class647_Sub1_Sub5 method9363(int i, int i_459_, int i_460_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_459_][i_460_];
		if (null == class565)
			return null;
		Class647_Sub1_Sub5 class647_sub1_sub5 = class565.aClass647_Sub1_Sub5_7592;
		class565.aClass647_Sub1_Sub5_7592 = null;
		method9279(class647_sub1_sub5, 1185013548);
		return class647_sub1_sub5;
	}

	public void method9364() {
		for (int i = 0; i < -1277045625 * anInt7505; i++) {
			for (int i_461_ = 0; i_461_ < -957102653 * anInt7546; i_461_++) {
				for (int i_462_ = 0; i_462_ < anInt7507 * -34274863; i_462_++) {
					Class565 class565 = aClass565ArrayArrayArray7508[i][i_461_][i_462_];
					if (class565 != null) {
						Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
						Class647_Sub1_Sub4 class647_sub1_sub4_463_ = class565.aClass647_Sub1_Sub4_7596;
						if (class647_sub1_sub4 != null && class647_sub1_sub4.method16699(1710145971)) {
							method9289(class647_sub1_sub4, i, i_461_, i_462_, 1, 1);
							if (null != class647_sub1_sub4_463_ && class647_sub1_sub4_463_.method16699(1000733866)) {
								method9289(class647_sub1_sub4_463_, i, i_461_, i_462_, 1, 1);
								class647_sub1_sub4_463_.method16703(aClass178_7495, class647_sub1_sub4, 0, 0, 0, false, 1345672106);
								class647_sub1_sub4_463_.method16704((byte) -81);
							}
							class647_sub1_sub4.method16704((byte) 24);
						}
						for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
							Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
							if (class647_sub1_sub3 != null && class647_sub1_sub3.method16699(587651421)) {
								method9289(class647_sub1_sub3, i, i_461_, i_462_, (class647_sub1_sub3.aShort11749 - class647_sub1_sub3.aShort11750 + 1), 1 + (class647_sub1_sub3.aShort11752 - (class647_sub1_sub3.aShort11751)));
								class647_sub1_sub3.method16704((byte) 47);
							}
						}
						Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
						if (class647_sub1_sub2 != null && class647_sub1_sub2.method16699(275336367)) {
							method9288(class647_sub1_sub2, i, i_461_, i_462_, (byte) -1);
							class647_sub1_sub2.method16704((byte) 4);
						}
					}
				}
			}
		}
	}

	void method9365(Class647_Sub1_Sub3 class647_sub1_sub3, boolean bool) {
		int i = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11750));
		int i_464_ = Math.min(anInt7546 * -957102653 - 1, Math.max(0, class647_sub1_sub3.aShort11749));
		int i_465_ = Math.min(-34274863 * anInt7507 - 1, Math.max(0, class647_sub1_sub3.aShort11751));
		int i_466_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, class647_sub1_sub3.aShort11752));
		for (int i_467_ = i; i_467_ <= i_464_; i_467_++) {
			for (int i_468_ = i_465_; i_468_ <= i_466_; i_468_++) {
				Class565 class565 = (aClass565ArrayArrayArray7508[class647_sub1_sub3.aByte10821][i_467_][i_468_]);
				if (null != class565) {
					Class548 class548 = class565.aClass548_7593;
					Class548 class548_469_ = null;
					for (/**/; null != class548; class548 = class548.aClass548_7319) {
						if (class548.aClass647_Sub1_Sub3_7318 == class647_sub1_sub3) {
							if (class548_469_ != null)
								class548_469_.aClass548_7319 = class548.aClass548_7319;
							else
								class565.aClass548_7593 = class548.aClass548_7319;
							class548.method9095(-2065280630);
							break;
						}
						class548_469_ = class548;
					}
				}
			}
		}
		if (!bool)
			method9279(class647_sub1_sub3, 1185013548);
	}

	void method9366(Class647_Sub1 class647_sub1) {
		if (null != class647_sub1) {
			class647_sub1.method10591();
			for (int i = 0; i < 2; i++) {
				Class647_Sub1 class647_sub1_470_ = null;
				for (Class647_Sub1 class647_sub1_471_ = aClass647_Sub1Array7522[i]; class647_sub1_471_ != null; class647_sub1_471_ = class647_sub1_471_.aClass647_Sub1_10819) {
					if (class647_sub1 == class647_sub1_471_) {
						if (class647_sub1_470_ != null)
							class647_sub1_470_.aClass647_Sub1_10819 = class647_sub1_471_.aClass647_Sub1_10819;
						else
							aClass647_Sub1Array7522[i] = class647_sub1_471_.aClass647_Sub1_10819;
						return;
					}
					class647_sub1_470_ = class647_sub1_471_;
				}
				class647_sub1_470_ = null;
				for (Class647_Sub1 class647_sub1_472_ = aClass647_Sub1Array7525[i]; null != class647_sub1_472_; class647_sub1_472_ = class647_sub1_472_.aClass647_Sub1_10819) {
					if (class647_sub1_472_ == class647_sub1) {
						if (class647_sub1_470_ != null)
							class647_sub1_470_.aClass647_Sub1_10819 = class647_sub1_472_.aClass647_Sub1_10819;
						else
							aClass647_Sub1Array7525[i] = class647_sub1_472_.aClass647_Sub1_10819;
						return;
					}
					class647_sub1_470_ = class647_sub1_472_;
				}
				class647_sub1_470_ = null;
				for (Class647_Sub1 class647_sub1_473_ = aClass647_Sub1Array7526[i]; null != class647_sub1_473_; class647_sub1_473_ = class647_sub1_473_.aClass647_Sub1_10819) {
					if (class647_sub1_473_ == class647_sub1) {
						if (class647_sub1_470_ != null)
							class647_sub1_470_.aClass647_Sub1_10819 = class647_sub1_473_.aClass647_Sub1_10819;
						else
							aClass647_Sub1Array7526[i] = class647_sub1_473_.aClass647_Sub1_10819;
						return;
					}
					class647_sub1_470_ = class647_sub1_473_;
				}
			}
		}
	}

	public void method9367() {
		for (int i = 0; i < anInt7546 * -957102653; i++) {
			for (int i_474_ = 0; i_474_ < anInt7507 * -34274863; i_474_++) {
				if (aClass565ArrayArrayArray7508[0][i][i_474_] == null)
					aClass565ArrayArrayArray7508[0][i][i_474_] = new Class565(0);
			}
		}
	}

	public Class647_Sub1_Sub4 method9368(int i, int i_475_, int i_476_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_475_][i_476_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub4_7587;
	}

	public Class647_Sub1_Sub4 method9369(int i, int i_477_, int i_478_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_477_][i_478_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub4_7587;
	}

	void method9370(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_479_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_480_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_480_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_480_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_480_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_480_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_480_, (byte) 4) * -780986409;
			class163.anInt1775 = method9254(i, i_480_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_480_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_480_, (short) -13306) * -923094865;
			class163.anInt1777 = method9261(i, i_480_, (short) 13578) * -320151975;
			class163.anInt1773 = method9329(i, i_480_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 992631178), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) -102);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -1081771851);
			} else
				Class478.method7893(class559, 2101771221);
		}
	}

	boolean method9371(Class647_Sub1 class647_sub1, boolean bool, byte[][][] is, int i, byte i_481_) {
		if (!aBool7503)
			return false;
		if (class647_sub1 instanceof Class647_Sub1_Sub3) {
			int i_482_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11749;
			int i_483_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11752;
			int i_484_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
			int i_485_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			for (int i_486_ = i_484_; i_486_ <= i_482_; i_486_++) {
				for (int i_487_ = i_485_; i_487_ <= i_483_; i_487_++) {
					if (class647_sub1.aByte10818 < -1277045625 * anInt7505 && i_486_ >= 1814696425 * anInt7524 && i_486_ < -1106091597 * anInt7542 && i_487_ >= anInt7543 * 1279546093 && i_487_ < anInt7544 * -2095166277) {
						if ((null != is && class647_sub1.aByte10821 >= i && i_481_ == (is[class647_sub1.aByte10821][i_486_][i_487_])) || !class647_sub1.method16709(1202131966) || class647_sub1.method16708(aClass178_7495, -328794731)) {
							if (!bool && i_486_ >= anInt7504 * -208391685 - 16 && i_486_ <= 16 + anInt7504 * -208391685 && i_487_ >= 164493233 * anInt7533 - 16 && i_487_ <= 16 + anInt7533 * 164493233)
								class647_sub1.method16706(aClass178_7495, (short) 32767);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class437 class437 = class647_sub1.method10569().aClass437_4862;
		int i_488_ = (int) class437.aFloat4903 >> anInt7496 * -906898059;
		int i_489_ = (int) class437.aFloat4905 >> anInt7496 * -906898059;
		if (class647_sub1.aByte10818 < -1277045625 * anInt7505 && i_488_ >= anInt7524 * 1814696425 && i_488_ < -1106091597 * anInt7542 && i_489_ >= anInt7543 * 1279546093 && i_489_ < anInt7544 * -2095166277) {
			if ((is != null && class647_sub1.aByte10821 >= i && i_481_ == is[class647_sub1.aByte10821][i_488_][i_489_]) || !class647_sub1.method16709(1202131966) || class647_sub1.method16708(aClass178_7495, 264458569)) {
				if (!bool && i_488_ >= -208391685 * anInt7504 - 16 && i_488_ <= 16 + -208391685 * anInt7504 && i_489_ >= anInt7533 * 164493233 - 16 && i_489_ <= anInt7533 * 164493233 + 16)
					class647_sub1.method16706(aClass178_7495, (short) 32767);
				return true;
			}
			return false;
		}
		return true;
	}

	public Class647_Sub1_Sub1 method9372(int i, int i_490_, int i_491_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_490_][i_491_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub1_7589;
	}

	public Class647_Sub1_Sub1 method9373(int i, int i_492_, int i_493_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_492_][i_493_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub1_7589;
	}

	public Class647_Sub1_Sub5 method9374(int i, int i_494_, int i_495_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_494_][i_495_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub5_7592;
	}

	public Class647_Sub1_Sub5 method9375(int i, int i_496_, int i_497_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_496_][i_497_];
		if (null == class565)
			return null;
		return class565.aClass647_Sub1_Sub5_7592;
	}

	public Class647_Sub1_Sub3 method9376(int i, int i_498_, int i_499_, Interface63 interface63) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_498_][i_499_];
		if (null == class565)
			return null;
		for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
			if ((null == interface63 || interface63.method422(class647_sub1_sub3, -151866546)) && i_498_ == class647_sub1_sub3.aShort11750 && class647_sub1_sub3.aShort11751 == i_499_)
				return class647_sub1_sub3;
		}
		return null;
	}

	Class565 method9377(int i, int i_500_, int i_501_, int i_502_) {
		return method9253(i, Math.min(-957102653 * anInt7546 - 1, Math.max(0, i_500_)), Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_501_)), (short) 28285);
	}

	public Class647_Sub1_Sub2 method9378(int i, int i_503_, int i_504_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_503_][i_504_];
		if (null == class565 || class565.aClass647_Sub1_Sub2_7591 == null)
			return null;
		return class565.aClass647_Sub1_Sub2_7591;
	}

	public Class647_Sub1_Sub2 method9379(int i, int i_505_, int i_506_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_505_][i_506_];
		if (null == class565 || class565.aClass647_Sub1_Sub2_7591 == null)
			return null;
		return class565.aClass647_Sub1_Sub2_7591;
	}

	public Class647_Sub1_Sub4 method9380(int i, int i_507_, int i_508_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_507_][i_508_];
		if (null != class565) {
			method9279(class565.aClass647_Sub1_Sub4_7596, 1185013548);
			if (class565.aClass647_Sub1_Sub4_7596 != null) {
				Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7596;
				class565.aClass647_Sub1_Sub4_7596 = null;
				return class647_sub1_sub4;
			}
		}
		return null;
	}

	public int method9381(int i, int i_509_) {
		return (aByteArrayArray7539 != null ? aByteArrayArray7539[i][i_509_] & 0xff : 0);
	}

	public void method9382() {
		for (int i = 0; i < -1277045625 * anInt7505; i++) {
			for (int i_510_ = 0; i_510_ < -957102653 * anInt7546; i_510_++) {
				for (int i_511_ = 0; i_511_ < anInt7507 * -34274863; i_511_++) {
					Class565 class565 = aClass565ArrayArrayArray7508[i][i_510_][i_511_];
					if (class565 != null) {
						Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
						Class647_Sub1_Sub4 class647_sub1_sub4_512_ = class565.aClass647_Sub1_Sub4_7596;
						if (class647_sub1_sub4 != null && class647_sub1_sub4.method16699(606046465)) {
							method9289(class647_sub1_sub4, i, i_510_, i_511_, 1, 1);
							if (null != class647_sub1_sub4_512_ && class647_sub1_sub4_512_.method16699(1245238562)) {
								method9289(class647_sub1_sub4_512_, i, i_510_, i_511_, 1, 1);
								class647_sub1_sub4_512_.method16703(aClass178_7495, class647_sub1_sub4, 0, 0, 0, false, 1589792792);
								class647_sub1_sub4_512_.method16704((byte) 59);
							}
							class647_sub1_sub4.method16704((byte) 10);
						}
						for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
							Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
							if (class647_sub1_sub3 != null && class647_sub1_sub3.method16699(729746233)) {
								method9289(class647_sub1_sub3, i, i_510_, i_511_, (class647_sub1_sub3.aShort11749 - class647_sub1_sub3.aShort11750 + 1), 1 + (class647_sub1_sub3.aShort11752 - (class647_sub1_sub3.aShort11751)));
								class647_sub1_sub3.method16704((byte) -66);
							}
						}
						Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
						if (class647_sub1_sub2 != null && class647_sub1_sub2.method16699(397270248)) {
							method9288(class647_sub1_sub2, i, i_510_, i_511_, (byte) -1);
							class647_sub1_sub2.method16704((byte) -30);
						}
					}
				}
			}
		}
	}

	public void method9383() {
		for (int i = 0; i < -1277045625 * anInt7505; i++) {
			for (int i_513_ = 0; i_513_ < -957102653 * anInt7546; i_513_++) {
				for (int i_514_ = 0; i_514_ < anInt7507 * -34274863; i_514_++) {
					Class565 class565 = aClass565ArrayArrayArray7508[i][i_513_][i_514_];
					if (class565 != null) {
						Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
						Class647_Sub1_Sub4 class647_sub1_sub4_515_ = class565.aClass647_Sub1_Sub4_7596;
						if (class647_sub1_sub4 != null && class647_sub1_sub4.method16699(1335586985)) {
							method9289(class647_sub1_sub4, i, i_513_, i_514_, 1, 1);
							if (null != class647_sub1_sub4_515_ && class647_sub1_sub4_515_.method16699(113737281)) {
								method9289(class647_sub1_sub4_515_, i, i_513_, i_514_, 1, 1);
								class647_sub1_sub4_515_.method16703(aClass178_7495, class647_sub1_sub4, 0, 0, 0, false, 1396998647);
								class647_sub1_sub4_515_.method16704((byte) -24);
							}
							class647_sub1_sub4.method16704((byte) 48);
						}
						for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
							Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
							if (class647_sub1_sub3 != null && class647_sub1_sub3.method16699(1764343262)) {
								method9289(class647_sub1_sub3, i, i_513_, i_514_, (class647_sub1_sub3.aShort11749 - class647_sub1_sub3.aShort11750 + 1), 1 + (class647_sub1_sub3.aShort11752 - (class647_sub1_sub3.aShort11751)));
								class647_sub1_sub3.method16704((byte) -27);
							}
						}
						Class647_Sub1_Sub2 class647_sub1_sub2 = class565.aClass647_Sub1_Sub2_7591;
						if (class647_sub1_sub2 != null && class647_sub1_sub2.method16699(1564591292)) {
							method9288(class647_sub1_sub2, i, i_513_, i_514_, (byte) -1);
							class647_sub1_sub2.method16704((byte) -20);
						}
					}
				}
			}
		}
	}

	void method9384(Class647_Sub1 class647_sub1, int i, int i_516_, int i_517_) {
		if (i_516_ < -957102653 * anInt7546) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_516_ + 1][i_517_];
			if (class565 != null && class565.aClass647_Sub1_Sub2_7591 != null && class565.aClass647_Sub1_Sub2_7591.method16699(350669895)) {
				int i_518_ = ((aClass142Array7509[i].method2321(1 + i_516_, i_517_, 1966537357) + aClass142Array7509[i].method2321(1 + i_516_ + 1, i_517_, 1568813970) + aClass142Array7509[i].method2321(i_516_ + 1, i_517_ + 1, 1996928133) + aClass142Array7509[i].method2321(i_516_ + 1 + 1, i_517_ + 1, 2090293440)) / 4 - (aClass142Array7509[i].method2321(i_516_, i_517_, 1682207433) + aClass142Array7509[i].method2321(1 + i_516_, i_517_, 1898046497) + aClass142Array7509[i].method2321(i_516_, 1 + i_517_, 1549541887) + aClass142Array7509[i].method2321(i_516_ + 1, 1 + i_517_, 1964154036)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_518_, 0, true, 457775886);
			}
		}
		if (i_517_ < anInt7546 * -957102653) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_516_][1 + i_517_];
			if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591 && class565.aClass647_Sub1_Sub2_7591.method16699(563810132)) {
				int i_519_ = ((aClass142Array7509[i].method2321(i_516_, i_517_, 1917069930) + aClass142Array7509[i].method2321(1 + i_516_, i_517_ + 1, 1670625134) + aClass142Array7509[i].method2321(i_516_, i_517_ + 1 + 1, 2109308760) + aClass142Array7509[i].method2321(1 + i_516_, 1 + i_517_ + 1, 1700251700)) / 4 - (aClass142Array7509[i].method2321(i_516_, i_517_, 1791941407) + aClass142Array7509[i].method2321(1 + i_516_, i_517_, 1859289166) + aClass142Array7509[i].method2321(i_516_, i_517_ + 1, 1728107935) + aClass142Array7509[i].method2321(i_516_ + 1, i_517_ + 1, 1721809968)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, 0, i_519_, -1817614813 * anInt7559, true, -1820721324);
			}
		}
		if (i_516_ < anInt7546 * -957102653 && i_517_ < -34274863 * anInt7507) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_516_ + 1][1 + i_517_];
			if (class565 != null && class565.aClass647_Sub1_Sub2_7591 != null && class565.aClass647_Sub1_Sub2_7591.method16699(1496155112)) {
				int i_520_ = ((aClass142Array7509[i].method2321(1 + i_516_, 1 + i_517_, 1759129989) + aClass142Array7509[i].method2321(1 + (1 + i_516_), i_517_ + 1, 1564041231) + aClass142Array7509[i].method2321(i_516_ + 1, 1 + (i_517_ + 1), 2083310677) + aClass142Array7509[i].method2321(i_516_ + 1 + 1, 1 + i_517_ + 1, 1871615708)) / 4 - (aClass142Array7509[i].method2321(i_516_, i_517_, 2091745315) + aClass142Array7509[i].method2321(1 + i_516_, i_517_, 1868291559) + aClass142Array7509[i].method2321(i_516_, i_517_ + 1, 1919140748) + aClass142Array7509[i].method2321(i_516_ + 1, i_517_ + 1, 1953961545)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_520_, anInt7559 * -1817614813, true, 185417179);
			}
		}
		if (i_516_ < -957102653 * anInt7546 && i_517_ > 0) {
			Class565 class565 = aClass565ArrayArrayArray7508[i][i_516_ + 1][i_517_ - 1];
			if (class565 != null && null != class565.aClass647_Sub1_Sub2_7591 && class565.aClass647_Sub1_Sub2_7591.method16699(56628172)) {
				int i_521_ = ((aClass142Array7509[i].method2321(1 + i_516_, i_517_ - 1, 2131152929) + aClass142Array7509[i].method2321(1 + (1 + i_516_), i_517_ - 1, 1900803201) + aClass142Array7509[i].method2321(1 + i_516_, i_517_ + 1 - 1, 2115673987) + aClass142Array7509[i].method2321(1 + (1 + i_516_), 1 + i_517_ - 1, 1642726579)) / 4 - (aClass142Array7509[i].method2321(i_516_, i_517_, 2123592200) + aClass142Array7509[i].method2321(1 + i_516_, i_517_, 1768836860) + aClass142Array7509[i].method2321(i_516_, 1 + i_517_, 1950117516) + aClass142Array7509[i].method2321(1 + i_516_, i_517_ + 1, 1729048879)) / 4);
				class647_sub1.method16703(aClass178_7495, class565.aClass647_Sub1_Sub2_7591, anInt7559 * -1817614813, i_521_, -(anInt7559 * -1817614813), true, -724873441);
			}
		}
	}

	public void method9385(HashMap hashmap) {
		aHashMap7554 = hashmap;
	}

	public int method9386(int i, int i_522_) {
		return (null != aByteArrayArray7518 ? aByteArrayArray7518[i][i_522_] & 0xff : 0);
	}

	void method9387(Class647_Sub1 class647_sub1, int i, int i_523_, int i_524_, int i_525_, int i_526_) {
		boolean bool = true;
		int i_527_ = i_523_;
		int i_528_ = i_523_ + i_525_;
		int i_529_ = i_524_ - 1;
		int i_530_ = i_524_ + i_526_;
		for (int i_531_ = i; i_531_ <= i + 1; i_531_++) {
			if (i_531_ != anInt7505 * -1277045625) {
				for (int i_532_ = i_527_; i_532_ <= i_528_; i_532_++) {
					if (i_532_ >= 0 && i_532_ < anInt7546 * -957102653) {
						for (int i_533_ = i_529_; i_533_ <= i_530_; i_533_++) {
							if (i_533_ >= 0 && i_533_ < anInt7507 * -34274863 && (!bool || i_532_ >= i_528_ || i_533_ >= i_530_ || i_533_ < i_524_ && i_532_ != i_523_)) {
								Class565 class565 = (aClass565ArrayArrayArray7508[i_531_][i_532_][i_533_]);
								if (null != class565) {
									int i_534_ = (((aClass142Array7509[i_531_].method2321(i_532_, i_533_, 1721916654)) + (aClass142Array7509[i_531_].method2321(i_532_ + 1, i_533_, 1687138105)) + (aClass142Array7509[i_531_].method2321(i_532_, i_533_ + 1, 1929251617)) + (aClass142Array7509[i_531_].method2321(1 + i_532_, 1 + i_533_, 2014273491))) / 4 - ((aClass142Array7509[i].method2321(i_523_, i_524_, 1972418168)) + (aClass142Array7509[i].method2321(i_523_ + 1, i_524_, 1574276513)) + (aClass142Array7509[i].method2321(i_523_, i_524_ + 1, 1778963174)) + (aClass142Array7509[i].method2321(i_523_ + 1, 1 + i_524_, 1604063859))) / 4);
									Class647_Sub1_Sub4 class647_sub1_sub4 = class565.aClass647_Sub1_Sub4_7587;
									Class647_Sub1_Sub4 class647_sub1_sub4_535_ = class565.aClass647_Sub1_Sub4_7596;
									if (null != class647_sub1_sub4 && class647_sub1_sub4.method16699(369610392))
										class647_sub1.method16703(aClass178_7495, class647_sub1_sub4, ((1774368449 * anInt7498 * (1 - i_525_)) + ((i_532_ - i_523_) * (-1817614813 * anInt7559))), i_534_, ((1 - i_526_) * (anInt7498 * 1774368449) + (-1817614813 * anInt7559 * (i_533_ - i_524_))), bool, 1338241644);
									if (null != class647_sub1_sub4_535_ && class647_sub1_sub4_535_.method16699(-5838226))
										class647_sub1.method16703(aClass178_7495, class647_sub1_sub4_535_, ((anInt7498 * 1774368449 * (1 - i_525_)) + ((i_532_ - i_523_) * (anInt7559 * -1817614813))), i_534_, ((anInt7498 * 1774368449 * (1 - i_526_)) + (anInt7559 * -1817614813 * (i_533_ - i_524_))), bool, -1937117705);
									for (Class548 class548 = class565.aClass548_7593; null != class548; class548 = class548.aClass548_7319) {
										Class647_Sub1_Sub3 class647_sub1_sub3 = (class548.aClass647_Sub1_Sub3_7318);
										if (null != class647_sub1_sub3 && class647_sub1_sub3.method16699(1300039213) && (i_532_ == (class647_sub1_sub3.aShort11750) || i_532_ == i_527_) && ((class647_sub1_sub3.aShort11751 == i_533_) || i_529_ == i_533_)) {
											int i_536_ = 1 + ((class647_sub1_sub3.aShort11749) - (class647_sub1_sub3.aShort11750));
											int i_537_ = 1 + ((class647_sub1_sub3.aShort11752) - (class647_sub1_sub3.aShort11751));
											class647_sub1.method16703(aClass178_7495, class647_sub1_sub3, ((((class647_sub1_sub3.aShort11750) - i_523_) * (anInt7559 * -1817614813)) + (anInt7498 * 1774368449 * (i_536_ - i_525_))), i_534_, ((1774368449 * anInt7498 * (i_537_ - i_526_)) + (anInt7559 * -1817614813 * ((class647_sub1_sub3.aShort11751) - i_524_))), bool, -1967954299);
										}
									}
								}
							}
						}
					}
				}
				i_527_--;
				bool = false;
			}
		}
	}

	public void method9388(int i, int i_538_, int i_539_, int i_540_, byte[][][] is, int[] is_541_, int[] is_542_, int[] is_543_, int[] is_544_, int[] is_545_, int i_546_, byte i_547_, int i_548_, int i_549_, boolean bool, boolean bool_550_, int i_551_, boolean bool_552_) {
		aClass544_7541.aBool7250 = true;
		aBool7503 = bool_550_;
		anInt7504 = (i_538_ >> -906898059 * anInt7496) * 678113587;
		anInt7533 = 450359633 * (i_540_ >> anInt7496 * -906898059);
		anInt7523 = i_538_ * 684215103;
		anInt7535 = -2044630383 * i_540_;
		anInt7536 = i_539_ * -398344597;
		anInt7524 = -146656701 * anInt7504 - 1420189007 * anInt7538;
		if (anInt7524 * 1814696425 < 0) {
			anInt7534 = -(1149090577 * anInt7524);
			anInt7524 = 0;
		} else
			anInt7534 = 0;
		anInt7543 = -1530967211 * anInt7533 - -665519197 * anInt7538;
		if (1279546093 * anInt7543 < 0) {
			anInt7540 = -(-1475850095 * anInt7543);
			anInt7543 = 0;
		} else
			anInt7540 = 0;
		anInt7542 = 1318451865 * anInt7504 + -1158026499 * anInt7538;
		if (-1106091597 * anInt7542 > -957102653 * anInt7546)
			anInt7542 = 1722966961 * anInt7546;
		anInt7544 = anInt7533 * -1907041149 + anInt7538 * 1286889669;
		if (anInt7544 * -2095166277 > -34274863 * anInt7507)
			anInt7544 = anInt7507 * 261187811;
		boolean[][] bools = aBoolArrayArray7558;
		boolean[][] bools_553_ = aBoolArrayArray7556;
		if (aBool7503) {
			for (int i_554_ = 0; (i_554_ < anInt7538 * -1164760089 + anInt7538 * -1164760089 + 2); i_554_++) {
				int i_555_ = 0;
				int i_556_ = 0;
				for (int i_557_ = 0; (i_557_ < anInt7538 * -1164760089 + -1164760089 * anInt7538 + 2); i_557_++) {
					if (i_557_ > 1)
						anIntArray7557[i_557_ - 2] = i_555_;
					i_555_ = i_556_;
					int i_558_ = i_554_ + (-208391685 * anInt7504 - -1164760089 * anInt7538);
					int i_559_ = (anInt7533 * 164493233 - anInt7538 * -1164760089 + i_557_);
					if (i_558_ >= 0 && i_559_ >= 0 && i_558_ < anInt7546 * -957102653 && i_559_ < -34274863 * anInt7507) {
						int i_560_ = i_558_ << -906898059 * anInt7496;
						int i_561_ = i_559_ << anInt7496 * -906898059;
						int i_562_ = (aClass142Array7547[aClass142Array7547.length - 1].method2321(i_558_, i_559_, 1984398889) - (1000 << -906898059 * anInt7496 - 7));
						int i_563_ = ((aClass142Array7513 != null ? (aClass142Array7513[0].method2321(i_558_, i_559_, 2064178608) + -1817614813 * anInt7559) : (aClass142Array7547[0].method2321(i_558_, i_559_, 1993018681) + -1817614813 * anInt7559)) + (1000 << -906898059 * anInt7496 - 7));
						i_556_ = aClass178_7495.method3094(i_560_, i_562_, i_561_, i_560_, i_563_, i_561_);
						aBoolArrayArray7556[i_554_][i_557_] = 0 == i_556_;
					} else {
						i_556_ = -1;
						aBoolArrayArray7556[i_554_][i_557_] = false;
					}
					if (i_554_ > 0 && i_557_ > 0) {
						int i_564_ = (anIntArray7557[i_557_ - 1] & anIntArray7557[i_557_] & i_555_ & i_556_);
						aBoolArrayArray7558[i_554_ - 1][i_557_ - 1] = 0 == i_564_;
					}
				}
				anIntArray7557[(anInt7538 * -1164760089 + -1164760089 * anInt7538)] = i_555_;
				anIntArray7557[1 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)] = i_556_;
			}
			if (!bool_552_)
				aClass544_7541.aBool7250 = false;
			else {
				aClass544_7541.anIntArray7253 = is_541_;
				aClass544_7541.anIntArray7269 = is_542_;
				aClass544_7541.anIntArray7249 = is_543_;
				aClass544_7541.anIntArray7271 = is_544_;
				aClass544_7541.anIntArray7262 = is_545_;
				aClass544_7541.method9018(aClass178_7495, i_546_);
			}
		} else {
			if (aBoolArrayArray7549 == null)
				aBoolArrayArray7549 = (new boolean[2 + (anInt7538 * -1164760089 + -1164760089 * anInt7538)][2 + (-1164760089 * anInt7538 + anInt7538 * -1164760089)]);
			for (int i_565_ = 0; i_565_ < aBoolArrayArray7549.length; i_565_++) {
				for (int i_566_ = 0; i_566_ < aBoolArrayArray7549[0].length; i_566_++)
					aBoolArrayArray7549[i_565_][i_566_] = true;
			}
			aBoolArrayArray7556 = aBoolArrayArray7549;
			aBoolArrayArray7558 = aBoolArrayArray7549;
			anInt7524 = 0;
			anInt7543 = 0;
			anInt7542 = anInt7546 * 1722966961;
			anInt7544 = 261187811 * anInt7507;
			aClass544_7541.aBool7250 = false;
		}
		Class553.method9162(this, aClass178_7495, (byte) -107);
		if (!aClass549_7555.aBool7323) {
			Iterator iterator = aClass549_7555.aList7326.iterator();
			while (iterator.hasNext()) {
				Class559 class559 = (Class559) iterator.next();
				iterator.remove();
				Class478.method7893(class559, 318536101);
			}
		}
		if (aBool7502) {
			for (int i_567_ = 0; i_567_ < 1807701791 * anInt7499; i_567_++)
				aClass550Array7506[i_567_].method9112(i, bool, 2126680190);
		}
		if (null != aClass565ArrayArrayArray7512) {
			method9250(true, 1357652815);
			aClass178_7495.method3149(-1, new Class163(1583160, 40, 127, 63, 0, 0, 0));
			method9291(true, is, i_546_, i_547_, i_551_);
			aClass178_7495.method3323();
			method9250(false, 1357652815);
		}
		method9291(false, is, i_546_, i_547_, i_551_);
		if (!aBool7503) {
			aBoolArrayArray7558 = bools;
			aBoolArrayArray7556 = bools_553_;
		}
	}

	public void method9389(int i, int i_568_, int i_569_, int i_570_, byte[][][] is, int[] is_571_, int[] is_572_, int[] is_573_, int[] is_574_, int[] is_575_, int i_576_, byte i_577_, int i_578_, int i_579_, boolean bool, boolean bool_580_, int i_581_, boolean bool_582_) {
		aClass544_7541.aBool7250 = true;
		aBool7503 = bool_580_;
		anInt7504 = (i_568_ >> -906898059 * anInt7496) * 678113587;
		anInt7533 = 450359633 * (i_570_ >> anInt7496 * -906898059);
		anInt7523 = i_568_ * 684215103;
		anInt7535 = -2044630383 * i_570_;
		anInt7536 = i_569_ * -398344597;
		anInt7524 = -146656701 * anInt7504 - 1420189007 * anInt7538;
		if (anInt7524 * 1814696425 < 0) {
			anInt7534 = -(1149090577 * anInt7524);
			anInt7524 = 0;
		} else
			anInt7534 = 0;
		anInt7543 = -1530967211 * anInt7533 - -665519197 * anInt7538;
		if (1279546093 * anInt7543 < 0) {
			anInt7540 = -(-1475850095 * anInt7543);
			anInt7543 = 0;
		} else
			anInt7540 = 0;
		anInt7542 = 1318451865 * anInt7504 + -1158026499 * anInt7538;
		if (-1106091597 * anInt7542 > -957102653 * anInt7546)
			anInt7542 = 1722966961 * anInt7546;
		anInt7544 = anInt7533 * -1907041149 + anInt7538 * 1286889669;
		if (anInt7544 * -2095166277 > -34274863 * anInt7507)
			anInt7544 = anInt7507 * 261187811;
		boolean[][] bools = aBoolArrayArray7558;
		boolean[][] bools_583_ = aBoolArrayArray7556;
		if (aBool7503) {
			for (int i_584_ = 0; (i_584_ < anInt7538 * -1164760089 + anInt7538 * -1164760089 + 2); i_584_++) {
				int i_585_ = 0;
				int i_586_ = 0;
				for (int i_587_ = 0; (i_587_ < anInt7538 * -1164760089 + -1164760089 * anInt7538 + 2); i_587_++) {
					if (i_587_ > 1)
						anIntArray7557[i_587_ - 2] = i_585_;
					i_585_ = i_586_;
					int i_588_ = i_584_ + (-208391685 * anInt7504 - -1164760089 * anInt7538);
					int i_589_ = (anInt7533 * 164493233 - anInt7538 * -1164760089 + i_587_);
					if (i_588_ >= 0 && i_589_ >= 0 && i_588_ < anInt7546 * -957102653 && i_589_ < -34274863 * anInt7507) {
						int i_590_ = i_588_ << -906898059 * anInt7496;
						int i_591_ = i_589_ << anInt7496 * -906898059;
						int i_592_ = (aClass142Array7547[aClass142Array7547.length - 1].method2321(i_588_, i_589_, 1780829455) - (1000 << -906898059 * anInt7496 - 7));
						int i_593_ = ((aClass142Array7513 != null ? (aClass142Array7513[0].method2321(i_588_, i_589_, 1736292819) + -1817614813 * anInt7559) : (aClass142Array7547[0].method2321(i_588_, i_589_, 1785184790) + -1817614813 * anInt7559)) + (1000 << -906898059 * anInt7496 - 7));
						i_586_ = aClass178_7495.method3094(i_590_, i_592_, i_591_, i_590_, i_593_, i_591_);
						aBoolArrayArray7556[i_584_][i_587_] = 0 == i_586_;
					} else {
						i_586_ = -1;
						aBoolArrayArray7556[i_584_][i_587_] = false;
					}
					if (i_584_ > 0 && i_587_ > 0) {
						int i_594_ = (anIntArray7557[i_587_ - 1] & anIntArray7557[i_587_] & i_585_ & i_586_);
						aBoolArrayArray7558[i_584_ - 1][i_587_ - 1] = 0 == i_594_;
					}
				}
				anIntArray7557[(anInt7538 * -1164760089 + -1164760089 * anInt7538)] = i_585_;
				anIntArray7557[1 + (-1164760089 * anInt7538 + -1164760089 * anInt7538)] = i_586_;
			}
			if (!bool_582_)
				aClass544_7541.aBool7250 = false;
			else {
				aClass544_7541.anIntArray7253 = is_571_;
				aClass544_7541.anIntArray7269 = is_572_;
				aClass544_7541.anIntArray7249 = is_573_;
				aClass544_7541.anIntArray7271 = is_574_;
				aClass544_7541.anIntArray7262 = is_575_;
				aClass544_7541.method9018(aClass178_7495, i_576_);
			}
		} else {
			if (aBoolArrayArray7549 == null)
				aBoolArrayArray7549 = (new boolean[2 + (anInt7538 * -1164760089 + -1164760089 * anInt7538)][2 + (-1164760089 * anInt7538 + anInt7538 * -1164760089)]);
			for (int i_595_ = 0; i_595_ < aBoolArrayArray7549.length; i_595_++) {
				for (int i_596_ = 0; i_596_ < aBoolArrayArray7549[0].length; i_596_++)
					aBoolArrayArray7549[i_595_][i_596_] = true;
			}
			aBoolArrayArray7556 = aBoolArrayArray7549;
			aBoolArrayArray7558 = aBoolArrayArray7549;
			anInt7524 = 0;
			anInt7543 = 0;
			anInt7542 = anInt7546 * 1722966961;
			anInt7544 = 261187811 * anInt7507;
			aClass544_7541.aBool7250 = false;
		}
		Class553.method9162(this, aClass178_7495, (byte) -9);
		if (!aClass549_7555.aBool7323) {
			Iterator iterator = aClass549_7555.aList7326.iterator();
			while (iterator.hasNext()) {
				Class559 class559 = (Class559) iterator.next();
				iterator.remove();
				Class478.method7893(class559, -128178194);
			}
		}
		if (aBool7502) {
			for (int i_597_ = 0; i_597_ < 1807701791 * anInt7499; i_597_++)
				aClass550Array7506[i_597_].method9112(i, bool, 2087903933);
		}
		if (null != aClass565ArrayArrayArray7512) {
			method9250(true, 1357652815);
			aClass178_7495.method3149(-1, new Class163(1583160, 40, 127, 63, 0, 0, 0));
			method9291(true, is, i_576_, i_577_, i_581_);
			aClass178_7495.method3323();
			method9250(false, 1357652815);
		}
		method9291(false, is, i_576_, i_577_, i_581_);
		if (!aBool7503) {
			aBoolArrayArray7558 = bools;
			aBoolArrayArray7556 = bools_583_;
		}
	}

	void method9390(boolean bool, byte[][][] is, int i, byte i_598_, int i_599_) {
		int i_600_ = bool ? 1 : 0;
		anInt7527 = 0;
		anInt7528 = 0;
		anInt7500 += -1725844687;
		if (0 == (i_599_ & 0x2)) {
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7522[i_600_]; class647_sub1 != null; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -30);
				if (-1529775437 * class647_sub1.anInt10820 != -1 && !method9371(class647_sub1, bool, is, i, i_598_))
					aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = class647_sub1;
			}
		}
		if ((i_599_ & 0x1) == 0) {
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7525[i_600_]; class647_sub1 != null; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -41);
				if (-1 != class647_sub1.anInt10820 * -1529775437 && !method9371(class647_sub1, bool, is, i, i_598_))
					aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = class647_sub1;
			}
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7526[i_600_]; null != class647_sub1; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -35);
				if (class647_sub1.anInt10820 * -1529775437 != -1 && !method9371(class647_sub1, bool, is, i, i_598_)) {
					if (class647_sub1.method16702(1308511409))
						aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = class647_sub1;
					else
						aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = class647_sub1;
				}
			}
			if (!bool) {
				for (int i_601_ = 0; i_601_ < -1449605107 * anInt7520; i_601_++) {
					method9292(aClass647_Sub1_Sub3Array7531[i_601_], (byte) -61);
					if (-1 != (aClass647_Sub1_Sub3Array7531[i_601_].anInt10820 * -1529775437) && !method9371(aClass647_Sub1_Sub3Array7531[i_601_], bool, is, i, i_598_)) {
						if (aClass647_Sub1_Sub3Array7531[i_601_].method16702(-60075501))
							aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = aClass647_Sub1_Sub3Array7531[i_601_];
						else
							aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = aClass647_Sub1_Sub3Array7531[i_601_];
					}
				}
			}
		}
		if (1242708363 * anInt7527 > 0) {
			method9294(aClass647_Sub1Array7530, 0, anInt7527 * 1242708363 - 1);
			for (int i_602_ = 0; i_602_ < anInt7527 * 1242708363; i_602_++)
				method9296(aClass647_Sub1Array7530[i_602_], aClass523_Sub20Array7537);
		}
		if (aBool7502)
			aClass178_7495.method3132(0, null);
		if (0 == (i_599_ & 0x2)) {
			for (int i_603_ = 0; i_603_ < -1277045625 * anInt7505; i_603_++) {
				if (i_603_ >= i && null != is) {
					int i_604_ = aBoolArrayArray7558.length;
					if (1814696425 * anInt7524 + aBoolArrayArray7558.length > anInt7546 * -957102653)
						i_604_ -= (anInt7524 * 1814696425 + aBoolArrayArray7558.length - anInt7546 * -957102653);
					int i_605_ = aBoolArrayArray7558[0].length;
					if (aBoolArrayArray7558[0].length + anInt7543 * 1279546093 > anInt7507 * -34274863)
						i_605_ -= (anInt7543 * 1279546093 + aBoolArrayArray7558[0].length - anInt7507 * -34274863);
					boolean[][] bools = aBoolArrayArray7556;
					if (aBool7503) {
						for (int i_606_ = anInt7534 * -2072413863; i_606_ < i_604_; i_606_++) {
							int i_607_ = (i_606_ + 1814696425 * anInt7524 - anInt7534 * -2072413863);
							for (int i_608_ = anInt7540 * -1169077603; i_608_ < i_605_; i_608_++) {
								bools[i_606_][i_608_] = false;
								if (aBoolArrayArray7558[i_606_][i_608_]) {
									int i_609_ = (i_608_ + anInt7543 * 1279546093 - -1169077603 * anInt7540);
									for (int i_610_ = i_603_; i_610_ >= 0; i_610_--) {
										if ((null != (aClass565ArrayArrayArray7508[i_610_][i_607_][i_609_])) && (aClass565ArrayArrayArray7508[i_610_][i_607_][i_609_].aByte7595) == i_603_) {
											if ((i_610_ >= i && (is[i_610_][i_607_][i_609_] == i_598_)) || (aClass544_7541.method9022(i_603_, i_607_, i_609_)))
												bools[i_606_][i_608_] = false;
											else
												bools[i_606_][i_608_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass142Array7509[i_603_].method2322(-208391685 * anInt7504, anInt7533 * 164493233, -1164760089 * anInt7538, aBoolArrayArray7556, false, i_599_);
				} else {
					int i_611_ = aBoolArrayArray7558.length;
					if (1814696425 * anInt7524 + aBoolArrayArray7558.length > -957102653 * anInt7546)
						i_611_ -= (aBoolArrayArray7558.length + 1814696425 * anInt7524 - -957102653 * anInt7546);
					int i_612_ = aBoolArrayArray7558[0].length;
					if (aBoolArrayArray7558[0].length + 1279546093 * anInt7543 > -34274863 * anInt7507)
						i_612_ -= (1279546093 * anInt7543 + aBoolArrayArray7558[0].length - -34274863 * anInt7507);
					boolean[][] bools = aBoolArrayArray7556;
					if (aBool7503) {
						for (int i_613_ = -2072413863 * anInt7534; i_613_ < i_611_; i_613_++) {
							int i_614_ = (i_613_ + anInt7524 * 1814696425 - anInt7534 * -2072413863);
							for (int i_615_ = anInt7540 * -1169077603; i_615_ < i_612_; i_615_++) {
								if (aBoolArrayArray7558[i_613_][i_615_] && !(aClass544_7541.method9022(i_603_, i_614_, (i_615_ + anInt7543 * 1279546093 - anInt7540 * -1169077603))))
									bools[i_613_][i_615_] = true;
								else
									bools[i_613_][i_615_] = false;
							}
						}
					}
					aClass142Array7509[i_603_].method2322(-208391685 * anInt7504, anInt7533 * 164493233, anInt7538 * -1164760089, aBoolArrayArray7556, true, i_599_);
				}
			}
		}
		if (anInt7528 * 1996215013 > 0) {
			method9278(aClass647_Sub1Array7497, 0, anInt7528 * 1996215013 - 1);
			for (int i_616_ = 0; i_616_ < 1996215013 * anInt7528; i_616_++)
				method9296(aClass647_Sub1Array7497[i_616_], aClass523_Sub20Array7537);
		}
	}

	public Class647_Sub1_Sub1 method9391(int i, int i_617_, int i_618_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_617_][i_618_];
		if (class565 != null) {
			method9279(class565.aClass647_Sub1_Sub1_7589, 1185013548);
			if (class565.aClass647_Sub1_Sub1_7589 != null) {
				Class647_Sub1_Sub1 class647_sub1_sub1 = class565.aClass647_Sub1_Sub1_7589;
				class565.aClass647_Sub1_Sub1_7589 = null;
				return class647_sub1_sub1;
			}
		}
		return null;
	}

	void method9392(Class647_Sub1 class647_sub1) {
		Class437 class437 = class647_sub1.method10569().aClass437_4862;
		aClass178_7495.method3153((float) (int) class437.aFloat4903, (float) ((int) class437.aFloat4904 + (class647_sub1.method16743(-2048314214) >> 1)), (float) (int) class437.aFloat4905, aFloatArray7545);
		class647_sub1.anInt10820 = -176962437 * (int) aFloatArray7545[2];
	}

	void method9393(Class647_Sub1 class647_sub1) {
		Class437 class437 = class647_sub1.method10569().aClass437_4862;
		aClass178_7495.method3153((float) (int) class437.aFloat4903, (float) ((int) class437.aFloat4904 + (class647_sub1.method16743(2052540992) >> 1)), (float) (int) class437.aFloat4905, aFloatArray7545);
		class647_sub1.anInt10820 = -176962437 * (int) aFloatArray7545[2];
	}

	void method9394(Class647_Sub1[] class647_sub1s, int i, int i_619_) {
		if (i < i_619_) {
			int i_620_ = (i + i_619_) / 2;
			int i_621_ = i;
			Class647_Sub1 class647_sub1 = class647_sub1s[i_620_];
			class647_sub1s[i_620_] = class647_sub1s[i_619_];
			class647_sub1s[i_619_] = class647_sub1;
			int i_622_ = -1529775437 * class647_sub1.anInt10820;
			for (int i_623_ = i; i_623_ < i_619_; i_623_++) {
				if (class647_sub1s[i_623_].anInt10820 * -1529775437 > (i_623_ & 0x1) + i_622_) {
					Class647_Sub1 class647_sub1_624_ = class647_sub1s[i_623_];
					class647_sub1s[i_623_] = class647_sub1s[i_621_];
					class647_sub1s[i_621_++] = class647_sub1_624_;
				}
			}
			class647_sub1s[i_619_] = class647_sub1s[i_621_];
			class647_sub1s[i_621_] = class647_sub1;
			method9278(class647_sub1s, i, i_621_ - 1);
			method9278(class647_sub1s, i_621_ + 1, i_619_);
		}
	}

	public Class647_Sub1_Sub4 method9395(int i, int i_625_, int i_626_, byte i_627_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_625_][i_626_];
		if (class565 == null)
			return null;
		return class565.aClass647_Sub1_Sub4_7596;
	}

	boolean method9396(Class647_Sub1 class647_sub1, boolean bool, byte[][][] is, int i, byte i_628_) {
		if (!aBool7503)
			return false;
		if (class647_sub1 instanceof Class647_Sub1_Sub3) {
			int i_629_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11749;
			int i_630_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11752;
			int i_631_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
			int i_632_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			for (int i_633_ = i_631_; i_633_ <= i_629_; i_633_++) {
				for (int i_634_ = i_632_; i_634_ <= i_630_; i_634_++) {
					if (class647_sub1.aByte10818 < -1277045625 * anInt7505 && i_633_ >= 1814696425 * anInt7524 && i_633_ < -1106091597 * anInt7542 && i_634_ >= anInt7543 * 1279546093 && i_634_ < anInt7544 * -2095166277) {
						if ((null != is && class647_sub1.aByte10821 >= i && i_628_ == (is[class647_sub1.aByte10821][i_633_][i_634_])) || !class647_sub1.method16709(1202131966) || class647_sub1.method16708(aClass178_7495, 1585689699)) {
							if (!bool && i_633_ >= anInt7504 * -208391685 - 16 && i_633_ <= 16 + anInt7504 * -208391685 && i_634_ >= 164493233 * anInt7533 - 16 && i_634_ <= 16 + anInt7533 * 164493233)
								class647_sub1.method16706(aClass178_7495, (short) 32767);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class437 class437 = class647_sub1.method10569().aClass437_4862;
		int i_635_ = (int) class437.aFloat4903 >> anInt7496 * -906898059;
		int i_636_ = (int) class437.aFloat4905 >> anInt7496 * -906898059;
		if (class647_sub1.aByte10818 < -1277045625 * anInt7505 && i_635_ >= anInt7524 * 1814696425 && i_635_ < -1106091597 * anInt7542 && i_636_ >= anInt7543 * 1279546093 && i_636_ < anInt7544 * -2095166277) {
			if ((is != null && class647_sub1.aByte10821 >= i && i_628_ == is[class647_sub1.aByte10821][i_635_][i_636_]) || !class647_sub1.method16709(1202131966) || class647_sub1.method16708(aClass178_7495, 874701454)) {
				if (!bool && i_635_ >= -208391685 * anInt7504 - 16 && i_635_ <= 16 + -208391685 * anInt7504 && i_636_ >= anInt7533 * 164493233 - 16 && i_636_ <= anInt7533 * 164493233 + 16)
					class647_sub1.method16706(aClass178_7495, (short) 32767);
				return true;
			}
			return false;
		}
		return true;
	}

	boolean method9397(Class647_Sub1 class647_sub1, boolean bool, byte[][][] is, int i, byte i_637_) {
		if (!aBool7503)
			return false;
		if (class647_sub1 instanceof Class647_Sub1_Sub3) {
			int i_638_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11749;
			int i_639_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11752;
			int i_640_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
			int i_641_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			for (int i_642_ = i_640_; i_642_ <= i_638_; i_642_++) {
				for (int i_643_ = i_641_; i_643_ <= i_639_; i_643_++) {
					if (class647_sub1.aByte10818 < -1277045625 * anInt7505 && i_642_ >= 1814696425 * anInt7524 && i_642_ < -1106091597 * anInt7542 && i_643_ >= anInt7543 * 1279546093 && i_643_ < anInt7544 * -2095166277) {
						if ((null != is && class647_sub1.aByte10821 >= i && i_637_ == (is[class647_sub1.aByte10821][i_642_][i_643_])) || !class647_sub1.method16709(1202131966) || class647_sub1.method16708(aClass178_7495, -1849868184)) {
							if (!bool && i_642_ >= anInt7504 * -208391685 - 16 && i_642_ <= 16 + anInt7504 * -208391685 && i_643_ >= 164493233 * anInt7533 - 16 && i_643_ <= 16 + anInt7533 * 164493233)
								class647_sub1.method16706(aClass178_7495, (short) 32767);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class437 class437 = class647_sub1.method10569().aClass437_4862;
		int i_644_ = (int) class437.aFloat4903 >> anInt7496 * -906898059;
		int i_645_ = (int) class437.aFloat4905 >> anInt7496 * -906898059;
		if (class647_sub1.aByte10818 < -1277045625 * anInt7505 && i_644_ >= anInt7524 * 1814696425 && i_644_ < -1106091597 * anInt7542 && i_645_ >= anInt7543 * 1279546093 && i_645_ < anInt7544 * -2095166277) {
			if ((is != null && class647_sub1.aByte10821 >= i && i_637_ == is[class647_sub1.aByte10821][i_644_][i_645_]) || !class647_sub1.method16709(1202131966) || class647_sub1.method16708(aClass178_7495, -844826041)) {
				if (!bool && i_644_ >= -208391685 * anInt7504 - 16 && i_644_ <= 16 + -208391685 * anInt7504 && i_645_ >= anInt7533 * 164493233 - 16 && i_645_ <= anInt7533 * 164493233 + 16)
					class647_sub1.method16706(aClass178_7495, (short) 32767);
				return true;
			}
			return false;
		}
		return true;
	}

	public Class647_Sub1_Sub2 method9398(int i, int i_646_, int i_647_, int i_648_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_646_][i_647_];
		if (null == class565 || class565.aClass647_Sub1_Sub2_7591 == null)
			return null;
		return class565.aClass647_Sub1_Sub2_7591;
	}

	void method9399(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_649_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_650_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_650_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_650_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_650_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_650_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_650_, (byte) 9) * -780986409;
			class163.anInt1775 = method9254(i, i_650_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_650_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_650_, (short) -22198) * -923094865;
			class163.anInt1777 = method9261(i, i_650_, (short) -4957) * -320151975;
			class163.anInt1773 = method9329(i, i_650_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, -1776481396), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) -44);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -1421938002);
			} else
				Class478.method7893(class559, 181418106);
		}
	}

	public void method9400(int i, int i_651_, int i_652_, Class647_Sub1_Sub4 class647_sub1_sub4, Class647_Sub1_Sub4 class647_sub1_sub4_653_) {
		Class565 class565 = method9253(i, i_651_, i_652_, (short) 31191);
		if (class565 != null) {
			class565.aClass647_Sub1_Sub4_7587 = class647_sub1_sub4;
			class565.aClass647_Sub1_Sub4_7596 = class647_sub1_sub4_653_;
			int i_654_ = aClass142Array7509 == aClass142Array7513 ? 1 : 0;
			if (class647_sub1_sub4.method16701(-1528540363)) {
				if (class647_sub1_sub4.method16702(-340854002)) {
					class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_654_];
					aClass647_Sub1Array7525[i_654_] = class647_sub1_sub4;
				} else {
					class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_654_];
					aClass647_Sub1Array7522[i_654_] = class647_sub1_sub4;
				}
			} else {
				class647_sub1_sub4.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_654_];
				aClass647_Sub1Array7526[i_654_] = class647_sub1_sub4;
			}
			if (class647_sub1_sub4_653_ != null) {
				if (class647_sub1_sub4_653_.method16701(-2068859854)) {
					if (class647_sub1_sub4_653_.method16702(1446450489)) {
						class647_sub1_sub4_653_.aClass647_Sub1_10819 = aClass647_Sub1Array7525[i_654_];
						aClass647_Sub1Array7525[i_654_] = class647_sub1_sub4_653_;
					} else {
						class647_sub1_sub4_653_.aClass647_Sub1_10819 = aClass647_Sub1Array7522[i_654_];
						aClass647_Sub1Array7522[i_654_] = class647_sub1_sub4_653_;
					}
				} else {
					class647_sub1_sub4_653_.aClass647_Sub1_10819 = aClass647_Sub1Array7526[i_654_];
					aClass647_Sub1Array7526[i_654_] = class647_sub1_sub4_653_;
				}
			}
		}
	}

	void method9401(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_655_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_656_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_656_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_656_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_656_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_656_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_656_, (byte) 80) * -780986409;
			class163.anInt1775 = method9254(i, i_656_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_656_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_656_, (short) -24604) * -923094865;
			class163.anInt1777 = method9261(i, i_656_, (short) 11018) * -320151975;
			class163.anInt1773 = method9329(i, i_656_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 2095480415), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) -40);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -607819687);
			} else
				Class478.method7893(class559, 1225395273);
		}
	}

	public void method9402(int i, int i_657_) {
		Class565 class565 = aClass565ArrayArrayArray7508[0][i][i_657_];
		for (int i_658_ = 0; i_658_ < 3; i_658_++) {
			Class565 class565_659_ = (aClass565ArrayArrayArray7508[i_658_][i][i_657_] = aClass565ArrayArrayArray7508[1 + i_658_][i][i_657_]);
			if (null != class565_659_) {
				for (Class548 class548 = class565_659_.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
					Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
					if (class647_sub1_sub3.aShort11750 == i && class647_sub1_sub3.aShort11751 == i_657_)
						class647_sub1_sub3.aByte10821--;
				}
				if (class565_659_.aClass647_Sub1_Sub2_7591 != null)
					class565_659_.aClass647_Sub1_Sub2_7591.aByte10821--;
				if (null != class565_659_.aClass647_Sub1_Sub4_7587)
					class565_659_.aClass647_Sub1_Sub4_7587.aByte10821--;
				if (class565_659_.aClass647_Sub1_Sub4_7596 != null)
					class565_659_.aClass647_Sub1_Sub4_7596.aByte10821--;
				if (null != class565_659_.aClass647_Sub1_Sub1_7589)
					class565_659_.aClass647_Sub1_Sub1_7589.aByte10821--;
				if (null != class565_659_.aClass647_Sub1_Sub1_7590)
					class565_659_.aClass647_Sub1_Sub1_7590.aByte10821--;
			}
		}
		if (null == aClass565ArrayArrayArray7508[0][i][i_657_]) {
			aClass565ArrayArrayArray7508[0][i][i_657_] = new Class565(0);
			aClass565ArrayArrayArray7508[0][i][i_657_].aByte7595 = (byte) 1;
		}
		aClass565ArrayArrayArray7508[0][i][i_657_].aClass565_7586 = class565;
		aClass565ArrayArrayArray7508[3][i][i_657_] = null;
	}

	void method9403(Class647_Sub1 class647_sub1, Class523_Sub20[] class523_sub20s) {
		if (aBool7502) {
			int i = class647_sub1.method16751(class523_sub20s, (byte) 64);
			aClass178_7495.method3132(i, class523_sub20s);
		}
		if (aClass142Array7509 == aClass142Array7513) {
			boolean bool = false;
			boolean bool_660_ = false;
			Class437 class437 = class647_sub1.method10569().aClass437_4862;
			int i;
			int i_661_;
			if (class647_sub1 instanceof Class647_Sub1_Sub3) {
				i = ((Class647_Sub1_Sub3) class647_sub1).aShort11750;
				i_661_ = ((Class647_Sub1_Sub3) class647_sub1).aShort11751;
			} else {
				i = (int) class437.aFloat4903 >> -906898059 * anInt7496;
				i_661_ = (int) class437.aFloat4905 >> -906898059 * anInt7496;
			}
			i = Math.min(-957102653 * anInt7546 - 1, Math.max(0, i));
			i_661_ = Math.min(anInt7507 * -34274863 - 1, Math.max(0, i_661_));
			Class163 class163 = new Class163();
			class163.anInt1776 = method9258(i, i_661_, (byte) 119) * -780986409;
			class163.anInt1775 = method9254(i, i_661_, 16711935) * 2053161261;
			class163.anInt1774 = method9301(i, i_661_, 65535) * 1512945865;
			class163.anInt1778 = method9260(i, i_661_, (short) -21872) * -923094865;
			class163.anInt1777 = method9261(i, i_661_, (short) 6265) * -320151975;
			class163.anInt1773 = method9329(i, i_661_, 40000) * -58453511;
			aClass178_7495.method3150(aClass142Array7547[0].method2326((int) class437.aFloat4903, (int) class437.aFloat4905, 80983415), class163);
		}
		Class559 class559 = class647_sub1.method16744(aClass178_7495, (byte) -39);
		if (class559 != null) {
			if (class559.aBool7493) {
				class559.aClass647_Sub1_7492 = class647_sub1;
				aClass549_7555.method9101(class559, -1072031377);
			} else
				Class478.method7893(class559, -277484839);
		}
	}

	public boolean method9404(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_662_, int i_663_, boolean[] bools) {
		boolean bool = false;
		if (aClass142Array7513 != aClass142Array7509) {
			int i_664_ = aClass142Array7547[i].method2326(i_662_, i_663_, 46187342);
			int i_665_ = 0;
			for (/**/; i_665_ <= i; i_665_++) {
				Class142 class142 = aClass142Array7547[i_665_];
				if (null != class142) {
					int i_666_ = i_664_ - class142.method2326(i_662_, i_663_, -1538657621);
					if (bools != null) {
						bools[i_665_] = class142.method2333(class523_sub27_sub4, i_662_, i_666_, i_663_, 0, false);
						if (!bools[i_665_])
							continue;
					}
					class142.method2331(class523_sub27_sub4, i_662_, i_666_, i_663_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public void method9405(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_667_, int i_668_, boolean[] bools) {
		if (aClass142Array7509 != aClass142Array7513) {
			int i_669_ = aClass142Array7547[i].method2326(i_667_, i_668_, -754009582);
			for (int i_670_ = 0; i_670_ <= i; i_670_++) {
				if (null == bools || bools[i_670_]) {
					Class142 class142 = aClass142Array7547[i_670_];
					if (null != class142)
						class142.method2332(class523_sub27_sub4, i_667_, i_669_ - class142.method2326(i_667_, i_668_, -1844079207), i_668_, 0, false);
				}
			}
		}
	}

	void method9406(int i, int i_671_) {
		Class523_Sub27_Sub4 class523_sub27_sub4 = null;
		for (int i_672_ = i; i_672_ < i_671_; i_672_++) {
			Class142 class142 = aClass142Array7547[i_672_];
			if (class142 != null) {
				for (int i_673_ = 0; i_673_ < anInt7507 * -34274863; i_673_++) {
					for (int i_674_ = 0; i_674_ < anInt7546 * -957102653; i_674_++) {
						class523_sub27_sub4 = class142.method2330(i_674_, i_673_, class523_sub27_sub4);
						if (null != class523_sub27_sub4) {
							int i_675_ = i_674_ << anInt7496 * -906898059;
							int i_676_ = i_673_ << -906898059 * anInt7496;
							for (int i_677_ = i_672_ - 1; i_677_ >= 0; i_677_--) {
								Class142 class142_678_ = aClass142Array7547[i_677_];
								if (class142_678_ != null) {
									int i_679_ = (class142.method2321(i_674_, i_673_, 1753614201) - (class142_678_.method2321(i_674_, i_673_, 1716128091)));
									int i_680_ = (class142.method2321(i_674_ + 1, i_673_, 1959847446) - (class142_678_.method2321(i_674_ + 1, i_673_, 2093284477)));
									int i_681_ = (class142.method2321(1 + i_674_, 1 + i_673_, 1550467451) - (class142_678_.method2321(i_674_ + 1, i_673_ + 1, 1880847010)));
									int i_682_ = (class142.method2321(i_674_, 1 + i_673_, 2007528843) - (class142_678_.method2321(i_674_, 1 + i_673_, 1580708154)));
									class142_678_.method2331(class523_sub27_sub4, i_675_, ((i_682_ + (i_680_ + i_679_ + i_681_)) / 4), i_676_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	void method9407(int i, int i_683_) {
		Class523_Sub27_Sub4 class523_sub27_sub4 = null;
		for (int i_684_ = i; i_684_ < i_683_; i_684_++) {
			Class142 class142 = aClass142Array7547[i_684_];
			if (class142 != null) {
				for (int i_685_ = 0; i_685_ < anInt7507 * -34274863; i_685_++) {
					for (int i_686_ = 0; i_686_ < anInt7546 * -957102653; i_686_++) {
						class523_sub27_sub4 = class142.method2330(i_686_, i_685_, class523_sub27_sub4);
						if (null != class523_sub27_sub4) {
							int i_687_ = i_686_ << anInt7496 * -906898059;
							int i_688_ = i_685_ << -906898059 * anInt7496;
							for (int i_689_ = i_684_ - 1; i_689_ >= 0; i_689_--) {
								Class142 class142_690_ = aClass142Array7547[i_689_];
								if (class142_690_ != null) {
									int i_691_ = (class142.method2321(i_686_, i_685_, 1714593478) - (class142_690_.method2321(i_686_, i_685_, 1690144901)));
									int i_692_ = (class142.method2321(i_686_ + 1, i_685_, 1637207900) - (class142_690_.method2321(i_686_ + 1, i_685_, 1749112492)));
									int i_693_ = (class142.method2321(1 + i_686_, 1 + i_685_, 1866146810) - (class142_690_.method2321(i_686_ + 1, i_685_ + 1, 1548335311)));
									int i_694_ = (class142.method2321(i_686_, 1 + i_685_, 2025549542) - (class142_690_.method2321(i_686_, 1 + i_685_, 1851163630)));
									class142_690_.method2331(class523_sub27_sub4, i_687_, ((i_694_ + (i_692_ + i_691_ + i_693_)) / 4), i_688_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public void method9408() {
		method9298(1, anInt7505 * -1277045625, 1529410208);
	}

	public void method9409(Class550 class550) {
		if (1807701791 * anInt7499 < 65164) {
			Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
			aClass550Array7506[anInt7499 * 1807701791] = class550;
			aBoolArray7552[1807701791 * anInt7499] = false;
			anInt7499 += 1733649631;
			int i = class550.anInt7352 * 1991405609;
			if (class550.aBool7345)
				i = 0;
			int i_695_ = class550.anInt7352 * 1991405609;
			if (class550.aBool7333)
				i_695_ = anInt7505 * -1277045625 - 1;
			for (int i_696_ = i; i_696_ <= i_695_; i_696_++) {
				int i_697_ = 0;
				int i_698_ = ((class523_sub20.method16065(1741451871) - class523_sub20.method16066(-1879460461) + anInt7498 * 1774368449) >> -906898059 * anInt7496);
				if (i_698_ < 0) {
					i_697_ -= i_698_;
					i_698_ = 0;
				}
				int i_699_ = ((class523_sub20.method16065(2137427110) + class523_sub20.method16066(-1879460461) - anInt7498 * 1774368449) >> anInt7496 * -906898059);
				if (i_699_ >= -34274863 * anInt7507)
					i_699_ = anInt7507 * -34274863 - 1;
				for (int i_700_ = i_698_; i_700_ <= i_699_; i_700_++) {
					int i_701_ = class550.aShortArray7353[i_697_++];
					int i_702_ = (((class523_sub20.method16062(2131811589) - class523_sub20.method16066(-1879460461) + 1774368449 * anInt7498) >> anInt7496 * -906898059) + (i_701_ >>> 8));
					int i_703_ = (i_701_ & 0xff) + i_702_ - 1;
					if (i_702_ < 0)
						i_702_ = 0;
					if (i_703_ >= anInt7546 * -957102653)
						i_703_ = anInt7546 * -957102653 - 1;
					for (int i_704_ = i_702_; i_704_ <= i_703_; i_704_++) {
						long l = aLongArrayArrayArray7529[i_696_][i_704_][i_700_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7529[i_696_][i_704_][i_700_] = l | (long) (1807701791 * anInt7499);
						else if (0L == (l & 0xffff0000L))
							aLongArrayArrayArray7529[i_696_][i_704_][i_700_] = l | (long) (1807701791 * anInt7499) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7529[i_696_][i_704_][i_700_] = l | (long) (1807701791 * anInt7499) << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							aLongArrayArrayArray7529[i_696_][i_704_][i_700_] = l | (long) (1807701791 * anInt7499) << 48;
					}
				}
			}
			if (-1 != class550.anInt7360 * 293084327) {
				List list = ((List) aHashMap7553.get(Integer.valueOf(class550.anInt7360 * 293084327)));
				if (list == null) {
					list = new ArrayList();
					aHashMap7553.put(Integer.valueOf(class550.anInt7360 * 293084327), list);
				}
				list.add(class550);
				Class523_Sub20 class523_sub20_705_ = ((Class523_Sub20) aHashMap7554.get(Integer.valueOf(class550.anInt7360 * 293084327)));
				if (null != class523_sub20_705_) {
					class550.aClass523_Sub20_7349.method16063(class523_sub20_705_.method16067(856453637), 1501639705);
					class550.aClass523_Sub20_7349.method16074(class523_sub20_705_.method16071(1192834142), class523_sub20_705_.method16072((byte) -95), 1887752128);
				}
			}
		}
	}

	public void method9410(Class550 class550) {
		if (1807701791 * anInt7499 < 65164) {
			Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
			aClass550Array7506[anInt7499 * 1807701791] = class550;
			aBoolArray7552[1807701791 * anInt7499] = false;
			anInt7499 += 1733649631;
			int i = class550.anInt7352 * 1991405609;
			if (class550.aBool7345)
				i = 0;
			int i_706_ = class550.anInt7352 * 1991405609;
			if (class550.aBool7333)
				i_706_ = anInt7505 * -1277045625 - 1;
			for (int i_707_ = i; i_707_ <= i_706_; i_707_++) {
				int i_708_ = 0;
				int i_709_ = ((class523_sub20.method16065(1823850462) - class523_sub20.method16066(-1879460461) + anInt7498 * 1774368449) >> -906898059 * anInt7496);
				if (i_709_ < 0) {
					i_708_ -= i_709_;
					i_709_ = 0;
				}
				int i_710_ = ((class523_sub20.method16065(1945768103) + class523_sub20.method16066(-1879460461) - anInt7498 * 1774368449) >> anInt7496 * -906898059);
				if (i_710_ >= -34274863 * anInt7507)
					i_710_ = anInt7507 * -34274863 - 1;
				for (int i_711_ = i_709_; i_711_ <= i_710_; i_711_++) {
					int i_712_ = class550.aShortArray7353[i_708_++];
					int i_713_ = (((class523_sub20.method16062(2131811589) - class523_sub20.method16066(-1879460461) + 1774368449 * anInt7498) >> anInt7496 * -906898059) + (i_712_ >>> 8));
					int i_714_ = (i_712_ & 0xff) + i_713_ - 1;
					if (i_713_ < 0)
						i_713_ = 0;
					if (i_714_ >= anInt7546 * -957102653)
						i_714_ = anInt7546 * -957102653 - 1;
					for (int i_715_ = i_713_; i_715_ <= i_714_; i_715_++) {
						long l = aLongArrayArrayArray7529[i_707_][i_715_][i_711_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7529[i_707_][i_715_][i_711_] = l | (long) (1807701791 * anInt7499);
						else if (0L == (l & 0xffff0000L))
							aLongArrayArrayArray7529[i_707_][i_715_][i_711_] = l | (long) (1807701791 * anInt7499) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7529[i_707_][i_715_][i_711_] = l | (long) (1807701791 * anInt7499) << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							aLongArrayArrayArray7529[i_707_][i_715_][i_711_] = l | (long) (1807701791 * anInt7499) << 48;
					}
				}
			}
			if (-1 != class550.anInt7360 * 293084327) {
				List list = ((List) aHashMap7553.get(Integer.valueOf(class550.anInt7360 * 293084327)));
				if (list == null) {
					list = new ArrayList();
					aHashMap7553.put(Integer.valueOf(class550.anInt7360 * 293084327), list);
				}
				list.add(class550);
				Class523_Sub20 class523_sub20_716_ = ((Class523_Sub20) aHashMap7554.get(Integer.valueOf(class550.anInt7360 * 293084327)));
				if (null != class523_sub20_716_) {
					class550.aClass523_Sub20_7349.method16063(class523_sub20_716_.method16067(856453637), 1565768189);
					class550.aClass523_Sub20_7349.method16074(class523_sub20_716_.method16071(2142518573), class523_sub20_716_.method16072((byte) -76), 1892655913);
				}
			}
		}
	}

	public void method9411() {
		for (int i = 0; i < anInt7499 * 1807701791; i++) {
			if (!aBoolArray7552[i]) {
				Class550 class550 = aClass550Array7506[i];
				Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
				int i_717_ = 1991405609 * class550.anInt7352;
				int i_718_ = (class523_sub20.method16066(-1879460461) - anInt7498 * 1774368449);
				int i_719_ = 1 + (i_718_ * 2 >> anInt7496 * -906898059);
				int i_720_ = 0;
				int[] is = new int[i_719_ * i_719_];
				int i_721_ = (class523_sub20.method16062(2131811589) - i_718_ >> anInt7496 * -906898059);
				int i_722_ = (class523_sub20.method16065(1744679873) - i_718_ >> anInt7496 * -906898059);
				int i_723_ = (class523_sub20.method16065(1749786037) + i_718_ >> -906898059 * anInt7496);
				if (i_722_ < 0) {
					i_720_ -= i_722_;
					i_722_ = 0;
				}
				if (i_723_ >= -34274863 * anInt7507)
					i_723_ = anInt7507 * -34274863 - 1;
				for (int i_724_ = i_722_; i_724_ <= i_723_; i_724_++) {
					int i_725_ = class550.aShortArray7353[i_720_];
					int i_726_ = i_725_ >>> 8;
					int i_727_ = i_719_ * i_720_ + i_726_;
					int i_728_ = (i_725_ >>> 8) + i_721_;
					int i_729_ = i_728_ + (i_725_ & 0xff) - 1;
					if (i_728_ < 0) {
						i_727_ -= i_728_;
						i_728_ = 0;
					}
					if (i_729_ >= -957102653 * anInt7546)
						i_729_ = -957102653 * anInt7546 - 1;
					for (int i_730_ = i_728_; i_730_ <= i_729_; i_730_++) {
						int i_731_ = 1;
						Class647_Sub1_Sub3 class647_sub1_sub3 = method9295(i_717_, i_730_, i_724_, null, (byte) -50);
						if (class647_sub1_sub3 != null && 0 != class647_sub1_sub3.aByte11756) {
							if (class647_sub1_sub3.aByte11756 == 1) {
								boolean bool = i_730_ - 1 >= i_728_;
								boolean bool_732_ = 1 + i_730_ <= i_729_;
								if (!bool && i_724_ + 1 <= i_723_) {
									int i_733_ = class550.aShortArray7353[i_720_ + 1];
									int i_734_ = i_721_ + (i_733_ >>> 8);
									int i_735_ = i_734_ + (i_733_ & 0xff);
									bool = i_730_ > i_734_ && i_730_ < i_735_;
								}
								if (!bool_732_ && i_724_ - 1 >= i_722_) {
									int i_736_ = class550.aShortArray7353[i_720_ - 1];
									int i_737_ = i_721_ + (i_736_ >>> 8);
									int i_738_ = (i_736_ & 0xff) + i_737_;
									bool_732_ = i_730_ > i_737_ && i_730_ < i_738_;
								}
								if (bool && !bool_732_)
									i_731_ = 4;
								else if (bool_732_ && !bool)
									i_731_ = 2;
							} else {
								boolean bool = i_730_ - 1 >= i_728_;
								boolean bool_739_ = 1 + i_730_ <= i_729_;
								if (!bool && i_724_ - 1 >= i_722_) {
									int i_740_ = class550.aShortArray7353[i_720_ - 1];
									int i_741_ = i_721_ + (i_740_ >>> 8);
									int i_742_ = i_741_ + (i_740_ & 0xff);
									bool = i_730_ > i_741_ && i_730_ < i_742_;
								}
								if (!bool_739_ && i_724_ + 1 <= i_723_) {
									int i_743_ = class550.aShortArray7353[1 + i_720_];
									int i_744_ = i_721_ + (i_743_ >>> 8);
									int i_745_ = i_744_ + (i_743_ & 0xff);
									bool_739_ = i_730_ > i_744_ && i_730_ < i_745_;
								}
								if (bool && !bool_739_)
									i_731_ = 3;
								else if (bool_739_ && !bool)
									i_731_ = 5;
							}
						}
						is[i_727_++] = i_731_;
					}
					i_720_++;
				}
				aBoolArray7552[i] = true;
				if (aBool7551)
					aClass142Array7509[i_717_].method2334(class523_sub20, is);
			}
		}
	}

	public HashMap method9412() {
		aHashMap7554.clear();
		Iterator iterator = aHashMap7553.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			aHashMap7554.put(entry.getKey(), (((Class550) ((List) entry.getValue()).get(0)).aClass523_Sub20_7349));
		}
		return aHashMap7554;
	}

	public Class647_Sub1_Sub3 method9413(int i, int i_746_, int i_747_, Interface63 interface63, int i_748_) {
		Class565 class565 = aClass565ArrayArrayArray7508[i][i_746_][i_747_];
		if (null == class565)
			return null;
		for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
			Class647_Sub1_Sub3 class647_sub1_sub3 = class548.aClass647_Sub1_Sub3_7318;
			if ((interface63 == null || interface63.method422(class647_sub1_sub3, -1838645569)) && i_746_ == class647_sub1_sub3.aShort11750 && class647_sub1_sub3.aShort11751 == i_747_) {
				method9287(class647_sub1_sub3, false, -1583331872);
				return class647_sub1_sub3;
			}
		}
		return null;
	}

	void method9414(boolean bool, byte[][][] is, int i, byte i_749_, int i_750_) {
		int i_751_ = bool ? 1 : 0;
		anInt7527 = 0;
		anInt7528 = 0;
		anInt7500 += -1725844687;
		if (0 == (i_750_ & 0x2)) {
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7522[i_751_]; class647_sub1 != null; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) 4);
				if (-1529775437 * class647_sub1.anInt10820 != -1 && !method9371(class647_sub1, bool, is, i, i_749_))
					aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = class647_sub1;
			}
		}
		if ((i_750_ & 0x1) == 0) {
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7525[i_751_]; class647_sub1 != null; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -102);
				if (-1 != class647_sub1.anInt10820 * -1529775437 && !method9371(class647_sub1, bool, is, i, i_749_))
					aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = class647_sub1;
			}
			for (Class647_Sub1 class647_sub1 = aClass647_Sub1Array7526[i_751_]; null != class647_sub1; class647_sub1 = class647_sub1.aClass647_Sub1_10819) {
				method9292(class647_sub1, (byte) -66);
				if (class647_sub1.anInt10820 * -1529775437 != -1 && !method9371(class647_sub1, bool, is, i, i_749_)) {
					if (class647_sub1.method16702(1502760704))
						aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = class647_sub1;
					else
						aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = class647_sub1;
				}
			}
			if (!bool) {
				for (int i_752_ = 0; i_752_ < -1449605107 * anInt7520; i_752_++) {
					method9292(aClass647_Sub1_Sub3Array7531[i_752_], (byte) 6);
					if (-1 != (aClass647_Sub1_Sub3Array7531[i_752_].anInt10820 * -1529775437) && !method9371(aClass647_Sub1_Sub3Array7531[i_752_], bool, is, i, i_749_)) {
						if (aClass647_Sub1_Sub3Array7531[i_752_].method16702(-692531502))
							aClass647_Sub1Array7497[(anInt7528 += 738237165) * 1996215013 - 1] = aClass647_Sub1_Sub3Array7531[i_752_];
						else
							aClass647_Sub1Array7530[(anInt7527 += 1557571107) * 1242708363 - 1] = aClass647_Sub1_Sub3Array7531[i_752_];
					}
				}
			}
		}
		if (1242708363 * anInt7527 > 0) {
			method9294(aClass647_Sub1Array7530, 0, anInt7527 * 1242708363 - 1);
			for (int i_753_ = 0; i_753_ < anInt7527 * 1242708363; i_753_++)
				method9296(aClass647_Sub1Array7530[i_753_], aClass523_Sub20Array7537);
		}
		if (aBool7502)
			aClass178_7495.method3132(0, null);
		if (0 == (i_750_ & 0x2)) {
			for (int i_754_ = 0; i_754_ < -1277045625 * anInt7505; i_754_++) {
				if (i_754_ >= i && null != is) {
					int i_755_ = aBoolArrayArray7558.length;
					if (1814696425 * anInt7524 + aBoolArrayArray7558.length > anInt7546 * -957102653)
						i_755_ -= (anInt7524 * 1814696425 + aBoolArrayArray7558.length - anInt7546 * -957102653);
					int i_756_ = aBoolArrayArray7558[0].length;
					if (aBoolArrayArray7558[0].length + anInt7543 * 1279546093 > anInt7507 * -34274863)
						i_756_ -= (anInt7543 * 1279546093 + aBoolArrayArray7558[0].length - anInt7507 * -34274863);
					boolean[][] bools = aBoolArrayArray7556;
					if (aBool7503) {
						for (int i_757_ = anInt7534 * -2072413863; i_757_ < i_755_; i_757_++) {
							int i_758_ = (i_757_ + 1814696425 * anInt7524 - anInt7534 * -2072413863);
							for (int i_759_ = anInt7540 * -1169077603; i_759_ < i_756_; i_759_++) {
								bools[i_757_][i_759_] = false;
								if (aBoolArrayArray7558[i_757_][i_759_]) {
									int i_760_ = (i_759_ + anInt7543 * 1279546093 - -1169077603 * anInt7540);
									for (int i_761_ = i_754_; i_761_ >= 0; i_761_--) {
										if ((null != (aClass565ArrayArrayArray7508[i_761_][i_758_][i_760_])) && (aClass565ArrayArrayArray7508[i_761_][i_758_][i_760_].aByte7595) == i_754_) {
											if ((i_761_ >= i && (is[i_761_][i_758_][i_760_] == i_749_)) || (aClass544_7541.method9022(i_754_, i_758_, i_760_)))
												bools[i_757_][i_759_] = false;
											else
												bools[i_757_][i_759_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass142Array7509[i_754_].method2322(-208391685 * anInt7504, anInt7533 * 164493233, -1164760089 * anInt7538, aBoolArrayArray7556, false, i_750_);
				} else {
					int i_762_ = aBoolArrayArray7558.length;
					if (1814696425 * anInt7524 + aBoolArrayArray7558.length > -957102653 * anInt7546)
						i_762_ -= (aBoolArrayArray7558.length + 1814696425 * anInt7524 - -957102653 * anInt7546);
					int i_763_ = aBoolArrayArray7558[0].length;
					if (aBoolArrayArray7558[0].length + 1279546093 * anInt7543 > -34274863 * anInt7507)
						i_763_ -= (1279546093 * anInt7543 + aBoolArrayArray7558[0].length - -34274863 * anInt7507);
					boolean[][] bools = aBoolArrayArray7556;
					if (aBool7503) {
						for (int i_764_ = -2072413863 * anInt7534; i_764_ < i_762_; i_764_++) {
							int i_765_ = (i_764_ + anInt7524 * 1814696425 - anInt7534 * -2072413863);
							for (int i_766_ = anInt7540 * -1169077603; i_766_ < i_763_; i_766_++) {
								if (aBoolArrayArray7558[i_764_][i_766_] && !(aClass544_7541.method9022(i_754_, i_765_, (i_766_ + anInt7543 * 1279546093 - anInt7540 * -1169077603))))
									bools[i_764_][i_766_] = true;
								else
									bools[i_764_][i_766_] = false;
							}
						}
					}
					aClass142Array7509[i_754_].method2322(-208391685 * anInt7504, anInt7533 * 164493233, anInt7538 * -1164760089, aBoolArrayArray7556, true, i_750_);
				}
			}
		}
		if (anInt7528 * 1996215013 > 0) {
			method9278(aClass647_Sub1Array7497, 0, anInt7528 * 1996215013 - 1);
			for (int i_767_ = 0; i_767_ < 1996215013 * anInt7528; i_767_++)
				method9296(aClass647_Sub1Array7497[i_767_], aClass523_Sub20Array7537);
		}
	}

	public void method9415(HashMap hashmap) {
		aHashMap7554 = hashmap;
	}

	static final void method9416(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_768_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_769_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		if (null != Class241.player.aClass623_12183) {
			for (int i_770_ = 0; i_770_ < Class310.anIntArray3381.length; i_770_++) {
				if (i_768_ == Class310.anIntArray3381[i_770_]) {
					Class241.player.aClass623_12183.method10200(i_770_, i_769_, Class448.aClass53_Sub6_4945, -765416071);
					return;
				}
			}
			for (int i_771_ = 0; i_771_ < Class310.anIntArray3384.length; i_771_++) {
				if (i_768_ == Class310.anIntArray3384[i_771_]) {
					Class241.player.aClass623_12183.method10200(i_771_, i_769_, Class448.aClass53_Sub6_4945, -1163960171);
					break;
				}
			}
		}
	}

	static final void method9417(Class669 class669, int i) {
		int i_772_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		ClientScriptDefinitions class37 = ((ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_772_, (byte) 7));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class37.method1096(1905557370);
	}

	static final void method9418(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class642.aClass561_8334.method9422((byte) 106) ? 1 : 0;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class642.aClass561_8334.method9423((byte) 93) ? 1 : 0;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class642.aClass561_8334.method9424(-715309985) ? 1 : 0;
	}

	static final void method9419(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		client.aShort11276 = (short) class669.anIntArray8557[1357652815 * class669.anInt8558];
		if (client.aShort11276 <= 0)
			client.aShort11276 = (short) 256;
		client.aShort11277 = (short) (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815]);
		if (client.aShort11277 <= 0)
			client.aShort11277 = (short) 320;
	}
}
