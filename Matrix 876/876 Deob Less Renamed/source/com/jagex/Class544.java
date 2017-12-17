/* Class544 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class544 {
	int[] anIntArray7249;
	boolean aBool7250;
	static final int anInt7251 = 10;
	static final float aFloat7252 = 3.0F;
	int[] anIntArray7253;
	float[] aFloatArray7254;
	int anInt7255;
	boolean aBool7256;
	int anInt7257;
	int anInt7258;
	int[][][] anIntArrayArrayArray7259;
	int anInt7260;
	Class546[] aClass546Array7261;
	int[] anIntArray7262;
	static final int anInt7263 = 100;
	int anInt7264;
	Class546[] aClass546Array7265;
	int anInt7266;
	Class546[] aClass546Array7267;
	static Class178 aClass178_7268;
	int[] anIntArray7269;
	int anInt7270;
	int[] anIntArray7271;
	Class560 aClass560_7272;
	int[] anIntArray7273;
	Class563 aClass563_7274;
	Class546[] aClass546Array7275;
	int[] anIntArray7276;
	public boolean aBool7277 = true;
	int anInt7278;
	boolean aBool7279;

	boolean method9012(int i, int i_0_, int i_1_, int i_2_) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		if (!method9022(i, i_0_, i_1_))
			return false;
		int i_3_ = i_0_ << aClass560_7272.anInt7496 * -906898059;
		int i_4_ = i_1_ << aClass560_7272.anInt7496 * -906898059;
		if (method9027(i_3_, aClass560_7272.aClass142Array7509[i].method2321(i_0_, i_1_, 1855033619), i_4_, aClass560_7272.anInt7559 * -1817614813, i_2_, aClass560_7272.anInt7559 * -1817614813))
			return true;
		return false;
	}

	final boolean method9013(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (!method9021(i, i_5_, i_6_))
			return false;
		i = (int) aFloatArray7254[0];
		i_5_ = (int) aFloatArray7254[1];
		i_6_ = (int) aFloatArray7254[2];
		if (!method9021(i_7_, i_8_, i_9_))
			return false;
		i_7_ = (int) aFloatArray7254[0];
		i_8_ = (int) aFloatArray7254[1];
		i_9_ = (int) aFloatArray7254[2];
		if (!method9021(i_10_, i_11_, i_12_))
			return false;
		i_10_ = (int) aFloatArray7254[0];
		i_11_ = (int) aFloatArray7254[1];
		i_12_ = (int) aFloatArray7254[2];
		return aClass563_7274.method9474(i_5_, i_8_, i_11_, i, i_7_, i_10_, i_6_, i_9_, i_12_);
	}

	final boolean method9014(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		if (!method9021(i, i_13_, i_14_))
			return false;
		i = (int) aFloatArray7254[0];
		i_13_ = (int) aFloatArray7254[1];
		i_14_ = (int) aFloatArray7254[2];
		if (!method9021(i_15_, i_16_, i_17_))
			return false;
		i_15_ = (int) aFloatArray7254[0];
		i_16_ = (int) aFloatArray7254[1];
		i_17_ = (int) aFloatArray7254[2];
		if (!method9021(i_18_, i_19_, i_20_))
			return false;
		i_18_ = (int) aFloatArray7254[0];
		i_19_ = (int) aFloatArray7254[1];
		i_20_ = (int) aFloatArray7254[2];
		return aClass563_7274.method9474(i_13_, i_16_, i_19_, i, i_15_, i_18_, i_14_, i_17_, i_20_);
	}

	public void method9015() {
		method9016();
	}

	void method9016() {
		for (int i = 0; i < anInt7270; i++)
			aClass546Array7275[i] = null;
		anInt7270 = 0;
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_21_ = 0; i_21_ < aClass560_7272.anInt7546 * -957102653; i_21_++) {
				for (int i_22_ = 0; i_22_ < aClass560_7272.anInt7507 * -34274863; i_22_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_22_][i_21_]);
					if (class565 != null) {
						if (class565.aShort7588 > 0)
							class565.aShort7588 *= -1;
						if (class565.aShort7594 > 0)
							class565.aShort7594 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_23_ = 0; i_23_ < aClass560_7272.anInt7546 * -957102653; i_23_++) {
				for (int i_24_ = 0; i_24_ < aClass560_7272.anInt7507 * -34274863; i_24_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_24_][i_23_]);
					if (class565 != null) {
						boolean bool = ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_24_][i_23_]) != null && (aClass560_7272.aClass565ArrayArrayArray7508[0][i_24_][i_23_].aClass565_7586) != null);
						if (class565.aShort7588 < 0) {
							int i_25_ = i_23_;
							int i_26_ = i_23_;
							int i_27_ = i;
							int i_28_ = i;
							Class565 class565_29_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_24_][i_25_ - 1]);
							int i_30_;
							for (i_30_ = (aClass560_7272.aClass142Array7547[i].method2321(i_24_, i_23_, 1995312871)); (i_25_ > 0 && class565_29_ != null && class565_29_.aShort7588 < 0 && (class565_29_.aShort7588 == class565.aShort7588) && (class565_29_.aShort7585 == class565.aShort7585) && i_30_ == (aClass560_7272.aClass142Array7547[i].method2321(i_24_, i_25_ - 1, 1623679292)) && (i_25_ - 1 <= 0 || (i_30_ == (aClass560_7272.aClass142Array7547[i].method2321(i_24_, i_25_ - 2, 2009822306)))) && i_26_ - i_25_ <= 10); class565_29_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_24_][i_25_ - 1]))
								i_25_--;
							for (class565_29_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_24_][i_26_ + 1]); (i_26_ < aClass560_7272.anInt7507 * -34274863 && class565_29_ != null && class565_29_.aShort7588 < 0 && (class565_29_.aShort7588 == class565.aShort7588) && (class565_29_.aShort7585 == class565.aShort7585) && i_30_ == (aClass560_7272.aClass142Array7547[i].method2321(i_24_, i_26_ + 1, 2028475890)) && ((i_26_ + 1 >= aClass560_7272.anInt7507 * -34274863) || (i_30_ == (aClass560_7272.aClass142Array7547[i].method2321(i_24_, i_26_ + 2, 2022648563)))) && i_26_ - i_25_ <= 10); class565_29_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_24_][i_26_ + 1]))
								i_26_++;
							int i_31_ = i_28_ - i_27_ + 1;
							int i_32_ = aClass560_7272.aClass142Array7547[bool ? i_27_ + 1 : i_27_].method2321(i_24_, i_25_, 1955208156);
							int i_33_ = i_32_ + class565.aShort7588 * i_31_;
							int i_34_ = (aClass560_7272.aClass142Array7547[bool ? i_27_ + 1 : i_27_].method2321(i_24_, i_26_ + 1, 1953742693));
							int i_35_ = i_34_ + class565.aShort7588 * i_31_;
							int i_36_ = (i_24_ << aClass560_7272.anInt7496 * -906898059);
							int i_37_ = (i_25_ << aClass560_7272.anInt7496 * -906898059);
							int i_38_ = ((i_26_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 1, i_28_, i_36_ + class565.aShort7585, i_36_ + class565.aShort7585, i_36_ + class565.aShort7585, i_36_ + class565.aShort7585, i_32_, i_34_, i_35_, i_33_, i_37_, i_38_, i_38_, i_37_);
							for (int i_39_ = i_27_; i_39_ <= i_28_; i_39_++) {
								for (int i_40_ = i_25_; i_40_ <= i_26_; i_40_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_39_][i_24_][i_40_].aShort7588 *= -1;
							}
						}
						if (class565.aShort7594 < 0) {
							int i_41_ = i_24_;
							int i_42_ = i_24_;
							int i_43_ = i;
							int i_44_ = i;
							Class565 class565_45_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_41_ - 1][i_23_]);
							int i_46_;
							for (i_46_ = (aClass560_7272.aClass142Array7547[i].method2321(i_24_, i_23_, 1850658559)); (i_41_ > 0 && class565_45_ != null && class565_45_.aShort7594 < 0 && (class565_45_.aShort7594 == class565.aShort7594) && (class565_45_.aShort7597 == class565.aShort7597) && i_46_ == (aClass560_7272.aClass142Array7547[i].method2321(i_41_ - 1, i_23_, 1579470705)) && (i_41_ - 1 <= 0 || (i_46_ == (aClass560_7272.aClass142Array7547[i].method2321(i_41_ - 2, i_23_, 1738238681)))) && i_42_ - i_41_ <= 10); class565_45_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_41_ - 1][i_23_]))
								i_41_--;
							for (class565_45_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_42_ + 1][i_23_]); (i_42_ < aClass560_7272.anInt7546 * -957102653 && class565_45_ != null && class565_45_.aShort7594 < 0 && (class565_45_.aShort7594 == class565.aShort7594) && (class565_45_.aShort7597 == class565.aShort7597) && i_46_ == (aClass560_7272.aClass142Array7547[i].method2321(i_42_ + 1, i_23_, 1718622244)) && (i_42_ + 1 >= (aClass560_7272.anInt7546 * -957102653) || (i_46_ == (aClass560_7272.aClass142Array7547[i].method2321(i_42_ + 2, i_23_, 1549530955)))) && i_42_ - i_41_ <= 10); class565_45_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_42_ + 1][i_23_]))
								i_42_++;
							int i_47_ = i_44_ - i_43_ + 1;
							int i_48_ = aClass560_7272.aClass142Array7547[bool ? i_43_ + 1 : i_43_].method2321(i_41_, i_23_, 1576224123);
							int i_49_ = i_48_ + class565.aShort7594 * i_47_;
							int i_50_ = (aClass560_7272.aClass142Array7547[bool ? i_43_ + 1 : i_43_].method2321(i_42_ + 1, i_23_, 1711090546));
							int i_51_ = i_50_ + class565.aShort7594 * i_47_;
							int i_52_ = (i_41_ << aClass560_7272.anInt7496 * -906898059);
							int i_53_ = ((i_42_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							int i_54_ = (i_23_ << aClass560_7272.anInt7496 * -906898059);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 2, i_44_, i_52_, i_53_, i_53_, i_52_, i_48_, i_50_, i_51_, i_49_, i_54_ + class565.aShort7597, i_54_ + class565.aShort7597, i_54_ + class565.aShort7597, i_54_ + class565.aShort7597);
							for (int i_55_ = i_43_; i_55_ <= i_44_; i_55_++) {
								for (int i_56_ = i_41_; i_56_ <= i_42_; i_56_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_55_][i_56_][i_23_].aShort7594 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7256 = true;
	}

	public void method9017(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		aClass546Array7261[anInt7260++] = new Class546(aClass560_7272, i, i_57_, i_58_, i_59_, i_59_, i_58_, i_62_, i_63_, i_63_, i_62_, i_60_, i_60_, i_61_, i_61_);
	}

	void method9018(Class178 class178, int i) {
		aClass178_7268 = class178;
		if (!aBool7277 || !aBool7250)
			anInt7266 = 0;
		else {
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-1821824817);
			aClass178_7268.method3038(anIntArray7276);
			if (anInt7255 != (int) ((float) anIntArray7276[0] / 3.0F) || anInt7278 != (int) ((float) anIntArray7276[1] / 3.0F)) {
				anInt7255 = (int) ((float) anIntArray7276[0] / 3.0F);
				anInt7278 = (int) ((float) anIntArray7276[1] / 3.0F);
				anIntArray7273 = new int[anInt7255 * anInt7278];
			}
			anInt7266 = 0;
			for (int i_64_ = 0; i_64_ < anInt7260; i_64_++)
				method9019(aClass178_7268, aClass546Array7261[i_64_], i);
			for (int i_65_ = 0; i_65_ < anInt7270; i_65_++)
				method9019(aClass178_7268, aClass546Array7275[i_65_], i);
			for (int i_66_ = 0; i_66_ < anInt7264; i_66_++)
				method9019(aClass178_7268, aClass546Array7265[i_66_], i);
			aClass563_7274.anInt7572 = 0;
			if (anInt7266 > 0) {
				int i_67_ = anIntArray7273.length;
				int i_68_ = i_67_ - i_67_ & 0x7;
				int i_69_ = 0;
				while (i_69_ < i_68_) {
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
					anIntArray7273[i_69_++] = 2147483647;
				}
				while (i_69_ < i_67_)
					anIntArray7273[i_69_++] = 2147483647;
				aClass563_7274.anInt7571 = 1;
				for (int i_70_ = 0; i_70_ < anInt7266; i_70_++) {
					Class546 class546 = aClass546Array7267[i_70_];
					aClass563_7274.method9474(class546.aShortArray7300[0], class546.aShortArray7300[1], class546.aShortArray7300[3], class546.aShortArray7299[0], class546.aShortArray7299[1], class546.aShortArray7299[3], class546.aShortArray7301[0], class546.aShortArray7301[1], class546.aShortArray7301[3]);
					aClass563_7274.method9474(class546.aShortArray7300[1], class546.aShortArray7300[2], class546.aShortArray7300[3], class546.aShortArray7299[1], class546.aShortArray7299[2], class546.aShortArray7299[3], class546.aShortArray7301[1], class546.aShortArray7301[2], class546.aShortArray7301[3]);
				}
				aClass563_7274.anInt7571 = 2;
			}
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-1689823768);
		}
	}

	void method9019(Class178 class178, Class546 class546, int i) {
		aClass178_7268 = class178;
		if (anIntArray7253 != null && class546.aByte7285 >= i) {
			for (int i_71_ = 0; i_71_ < anIntArray7253.length; i_71_++) {
				if (anIntArray7253[i_71_] != -1000000 && (class546.anIntArray7297[0] <= anIntArray7253[i_71_] || class546.anIntArray7297[1] <= anIntArray7253[i_71_] || class546.anIntArray7297[2] <= anIntArray7253[i_71_] || class546.anIntArray7297[3] <= anIntArray7253[i_71_]) && (class546.anIntArray7286[0] <= anIntArray7249[i_71_] || class546.anIntArray7286[1] <= anIntArray7249[i_71_] || class546.anIntArray7286[2] <= anIntArray7249[i_71_] || class546.anIntArray7286[3] <= anIntArray7249[i_71_]) && (class546.anIntArray7286[0] >= anIntArray7269[i_71_] || class546.anIntArray7286[1] >= anIntArray7269[i_71_] || class546.anIntArray7286[2] >= anIntArray7269[i_71_] || class546.anIntArray7286[3] >= anIntArray7269[i_71_]) && (class546.anIntArray7288[0] <= anIntArray7271[i_71_] || class546.anIntArray7288[1] <= anIntArray7271[i_71_] || class546.anIntArray7288[2] <= anIntArray7271[i_71_] || class546.anIntArray7288[3] <= anIntArray7271[i_71_]) && (class546.anIntArray7288[0] >= anIntArray7262[i_71_] || class546.anIntArray7288[1] >= anIntArray7262[i_71_] || class546.anIntArray7288[2] >= anIntArray7262[i_71_] || (class546.anIntArray7288[3] >= anIntArray7262[i_71_])))
					return;
			}
		}
		if (class546.aByte7290 == 1) {
			int i_72_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
			if (i_72_ >= 0 && i_72_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089)) {
				int i_73_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_73_ < 0)
					i_73_ = 0;
				else if (i_73_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_74_ = (class546.aShort7295 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_74_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_74_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_74_ < 0)
					return;
				boolean bool = false;
				while_37_: do {
					do {
						if (i_73_ > i_74_)
							break while_37_;
					} while (!aClass560_7272.aBoolArrayArray7558[i_72_][i_73_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass560_7272.anInt7523 * -532339521 - class546.anIntArray7286[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7257) && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
						aClass546Array7267[anInt7266++] = class546;
				}
			}
		} else if (class546.aByte7290 == 2) {
			int i_75_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
			if (i_75_ >= 0 && i_75_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089)) {
				int i_76_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_76_ < 0)
					i_76_ = 0;
				else if (i_76_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_77_ = (class546.aShort7293 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_77_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_77_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_77_ < 0)
					return;
				boolean bool = false;
				while_38_: do {
					do {
						if (i_76_ > i_77_)
							break while_38_;
					} while (!aClass560_7272.aBoolArrayArray7558[i_76_++][i_75_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass560_7272.anInt7535 * 2069862001 - class546.anIntArray7288[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7257) && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
						aClass546Array7267[anInt7266++] = class546;
				}
			}
		} else if (class546.aByte7290 == 16 || class546.aByte7290 == 8) {
			int i_78_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
			if (i_78_ >= 0 && i_78_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089)) {
				int i_79_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_79_ >= 0 && i_79_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089) && aClass560_7272.aBoolArrayArray7558[i_78_][i_79_]) {
					float f = (float) (aClass560_7272.anInt7523 * -532339521 - class546.anIntArray7286[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_80_ = (float) (aClass560_7272.anInt7535 * 2069862001 - class546.anIntArray7288[0]);
					if (f_80_ < 0.0F)
						f_80_ *= -1.0F;
					if ((!(f < (float) anInt7257) || !(f_80_ < (float) anInt7257)) && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
						aClass546Array7267[anInt7266++] = class546;
				}
			}
		} else if (class546.aByte7290 == 4) {
			float f = (float) (class546.anIntArray7297[0] - aClass560_7272.anInt7536 * 819461699);
			if (!(f <= (float) anInt7258)) {
				int i_81_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_81_ < 0)
					i_81_ = 0;
				else if (i_81_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_82_ = (class546.aShort7295 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_82_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_82_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_82_ < 0)
					return;
				int i_83_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_83_ < 0)
					i_83_ = 0;
				else if (i_83_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_84_ = (class546.aShort7293 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_84_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_84_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_84_ < 0)
					return;
				boolean bool = false;
				while_39_: for (int i_85_ = i_83_; i_85_ <= i_84_; i_85_++) {
					for (int i_86_ = i_81_; i_86_ <= i_82_; i_86_++) {
						if (aClass560_7272.aBoolArrayArray7558[i_85_][i_86_]) {
							bool = true;
							break while_39_;
						}
					}
				}
				if (bool && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
					aClass546Array7267[anInt7266++] = class546;
			}
		}
	}

	boolean method9020(Class546 class546, int i) {
		if (!method9021(class546.anIntArray7286[i], class546.anIntArray7297[i], class546.anIntArray7288[i]))
			return false;
		class546.aShortArray7299[i] = (short) (int) aFloatArray7254[0];
		class546.aShortArray7300[i] = (short) (int) aFloatArray7254[1];
		class546.aShortArray7301[i] = (short) (int) aFloatArray7254[2];
		return true;
	}

	final boolean method9021(int i, int i_87_, int i_88_) {
		aClass178_7268.method3153((float) i, (float) i_87_, (float) i_88_, aFloatArray7254);
		if (aFloatArray7254[2] < 50.0F)
			return false;
		aFloatArray7254[0] /= 3.0F;
		aFloatArray7254[1] /= 3.0F;
		return true;
	}

	boolean method9022(int i, int i_89_, int i_90_) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		int i_91_ = anIntArrayArrayArray7259[i][i_89_][i_90_];
		if (i_91_ == -(aClass560_7272.anInt7500 * 1075365329))
			return false;
		if (i_91_ == aClass560_7272.anInt7500 * 1075365329)
			return true;
		if (aClass560_7272.aClass142Array7509 == aClass560_7272.aClass142Array7513)
			return false;
		int i_92_ = i_89_ << aClass560_7272.anInt7496 * -906898059;
		int i_93_ = i_90_ << aClass560_7272.anInt7496 * -906898059;
		if (method9013(i_92_ + 1, aClass560_7272.aClass142Array7509[i].method2321(i_89_, i_90_, 2053381091), i_93_ + 1, i_92_ + aClass560_7272.anInt7559 * -1817614813 - 1, aClass560_7272.aClass142Array7509[i].method2321(i_89_ + 1, i_90_ + 1, 1659679459), i_93_ + aClass560_7272.anInt7559 * -1817614813 - 1, i_92_ + 1, aClass560_7272.aClass142Array7509[i].method2321(i_89_, i_90_ + 1, 1890264683), i_93_ + aClass560_7272.anInt7559 * -1817614813 - 1) && method9013(i_92_ + 1, aClass560_7272.aClass142Array7509[i].method2321(i_89_, i_90_, 2107971949), i_93_ + 1, i_92_ + aClass560_7272.anInt7559 * -1817614813 - 1, aClass560_7272.aClass142Array7509[i].method2321(i_89_ + 1, i_90_, 1843150557), i_93_ + 1, i_92_ + aClass560_7272.anInt7559 * -1817614813 - 1, aClass560_7272.aClass142Array7509[i].method2321(i_89_ + 1, i_90_ + 1, 1794248788), (i_93_ + aClass560_7272.anInt7559 * -1817614813 - 1))) {
			anIntArrayArrayArray7259[i][i_89_][i_90_] = aClass560_7272.anInt7500 * 1075365329;
			return true;
		}
		anIntArrayArrayArray7259[i][i_89_][i_90_] = -(aClass560_7272.anInt7500 * 1075365329);
		return false;
	}

	boolean method9023(Class647_Sub1_Sub4 class647_sub1_sub4, int i, int i_94_, int i_95_) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		if (!method9022(i, i_94_, i_95_))
			return false;
		int i_96_ = i_94_ << aClass560_7272.anInt7496 * -906898059;
		int i_97_ = i_95_ << aClass560_7272.anInt7496 * -906898059;
		int i_98_ = (aClass560_7272.aClass142Array7509[i].method2321(i_94_, i_95_, 1693546134) - 1);
		int i_99_ = i_98_ + class647_sub1_sub4.method16743(16355512);
		if (class647_sub1_sub4.aShort11814 == 1) {
			if (!method9013(i_96_, i_98_, i_97_, i_96_, i_99_, i_97_, i_96_, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813))
				return false;
			if (!method9013(i_96_, i_98_, i_97_, i_96_, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813, i_96_, i_98_, i_97_ + aClass560_7272.anInt7559 * -1817614813))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 2) {
			if (!method9013(i_96_, i_98_, i_97_ + aClass560_7272.anInt7559 * -1817614813, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813, i_96_, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813))
				return false;
			if (!method9013(i_96_, i_98_, i_97_ + aClass560_7272.anInt7559 * -1817614813, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_98_, i_97_ + aClass560_7272.anInt7559 * -1817614813, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 4) {
			if (!method9013(i_96_ + aClass560_7272.anInt7559 * -1817614813, i_98_, i_97_, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813))
				return false;
			if (!method9013(i_96_ + aClass560_7272.anInt7559 * -1817614813, i_98_, i_97_, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_ + aClass560_7272.anInt7559 * -1817614813, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_98_, i_97_ + aClass560_7272.anInt7559 * -1817614813))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 8) {
			if (!method9013(i_96_, i_98_, i_97_, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_, i_96_, i_99_, i_97_))
				return false;
			if (!method9013(i_96_, i_98_, i_97_, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_98_, i_97_, i_96_ + aClass560_7272.anInt7559 * -1817614813, i_99_, i_97_))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 16) {
			if (!method9027(i_96_, i_98_, i_97_ + aClass560_7272.anInt7498 * 1774368449, aClass560_7272.anInt7498 * 1774368449, i_99_, aClass560_7272.anInt7498 * 1774368449))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 32) {
			if (!method9027(i_96_ + aClass560_7272.anInt7498 * 1774368449, i_98_, i_97_ + aClass560_7272.anInt7498 * 1774368449, aClass560_7272.anInt7498 * 1774368449, i_99_, aClass560_7272.anInt7498 * 1774368449))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 64) {
			if (!method9027(i_96_ + aClass560_7272.anInt7498 * 1774368449, i_98_, i_97_, aClass560_7272.anInt7498 * 1774368449, i_99_, aClass560_7272.anInt7498 * 1774368449))
				return false;
			return true;
		}
		if (class647_sub1_sub4.aShort11814 == 128) {
			if (!method9027(i_96_, i_98_, i_97_, aClass560_7272.anInt7498 * 1774368449, i_99_, aClass560_7272.anInt7498 * 1774368449))
				return false;
			return true;
		}
		return true;
	}

	final boolean method9024(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		if (!method9021(i, i_100_, i_101_))
			return false;
		i = (int) aFloatArray7254[0];
		i_100_ = (int) aFloatArray7254[1];
		i_101_ = (int) aFloatArray7254[2];
		if (!method9021(i_102_, i_103_, i_104_))
			return false;
		i_102_ = (int) aFloatArray7254[0];
		i_103_ = (int) aFloatArray7254[1];
		i_104_ = (int) aFloatArray7254[2];
		if (!method9021(i_105_, i_106_, i_107_))
			return false;
		i_105_ = (int) aFloatArray7254[0];
		i_106_ = (int) aFloatArray7254[1];
		i_107_ = (int) aFloatArray7254[2];
		return aClass563_7274.method9474(i_100_, i_103_, i_106_, i, i_102_, i_105_, i_101_, i_104_, i_107_);
	}

	boolean method9025(int i, int i_108_, int i_109_, int i_110_, int i_111_, Class564 class564) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		if (i_108_ < 0 || i_110_ < 0 || i_109_ >= anIntArrayArrayArray7259[i].length || i_111_ >= anIntArrayArrayArray7259[i][i_108_].length)
			return false;
		if (i_108_ == i_109_ && i_110_ == i_111_) {
			if (!method9022(i, i_108_, i_110_))
				return false;
			if (method9032(class564))
				return true;
			return false;
		}
		for (int i_112_ = i_108_; i_112_ <= i_109_; i_112_++) {
			for (int i_113_ = i_110_; i_113_ <= i_111_; i_113_++) {
				if (anIntArrayArrayArray7259[i][i_112_][i_113_] == -(aClass560_7272.anInt7500 * 1075365329))
					return false;
			}
		}
		if (!method9032(class564))
			return false;
		return true;
	}

	final boolean method9026(int i, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_) {
		if (!method9021(i, i_114_, i_115_))
			return false;
		i = (int) aFloatArray7254[0];
		i_114_ = (int) aFloatArray7254[1];
		i_115_ = (int) aFloatArray7254[2];
		if (!method9021(i_116_, i_117_, i_118_))
			return false;
		i_116_ = (int) aFloatArray7254[0];
		i_117_ = (int) aFloatArray7254[1];
		i_118_ = (int) aFloatArray7254[2];
		if (!method9021(i_119_, i_120_, i_121_))
			return false;
		i_119_ = (int) aFloatArray7254[0];
		i_120_ = (int) aFloatArray7254[1];
		i_121_ = (int) aFloatArray7254[2];
		return aClass563_7274.method9474(i_114_, i_117_, i_120_, i, i_116_, i_119_, i_115_, i_118_, i_121_);
	}

	final boolean method9027(int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_) {
		int i_127_ = i + i_124_;
		int i_128_ = i_122_ + i_125_;
		int i_129_ = i_123_ + i_126_;
		if (!method9013(i, i_128_, i_123_, i_127_, i_128_, i_129_, i, i_128_, i_129_))
			return false;
		if (!method9013(i, i_128_, i_123_, i_127_, i_128_, i_123_, i_127_, i_128_, i_129_))
			return false;
		if (i < aClass560_7272.anInt7523 * -532339521) {
			if (!method9013(i, i_122_, i_129_, i, i_128_, i_123_, i, i_128_, i_129_))
				return false;
			if (!method9013(i, i_122_, i_129_, i, i_122_, i_123_, i, i_128_, i_123_))
				return false;
		} else {
			if (!method9013(i_127_, i_122_, i_129_, i_127_, i_128_, i_123_, i_127_, i_128_, i_129_))
				return false;
			if (!method9013(i_127_, i_122_, i_129_, i_127_, i_122_, i_123_, i_127_, i_128_, i_123_))
				return false;
		}
		if (i_123_ < aClass560_7272.anInt7535 * 2069862001) {
			if (!method9013(i, i_122_, i_123_, i_127_, i_128_, i_123_, i, i_128_, i_123_))
				return false;
			if (!method9013(i, i_122_, i_123_, i_127_, i_122_, i_123_, i_127_, i_128_, i_123_))
				return false;
		} else {
			if (!method9013(i, i_122_, i_129_, i_127_, i_128_, i_129_, i, i_128_, i_129_))
				return false;
			if (!method9013(i, i_122_, i_129_, i_127_, i_122_, i_129_, i_127_, i_128_, i_129_))
				return false;
		}
		return true;
	}

	void method9028(Class178 class178, int i) {
		aClass178_7268 = class178;
		if (!aBool7277 || !aBool7250)
			anInt7266 = 0;
		else {
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-268025721);
			aClass178_7268.method3038(anIntArray7276);
			if (anInt7255 != (int) ((float) anIntArray7276[0] / 3.0F) || anInt7278 != (int) ((float) anIntArray7276[1] / 3.0F)) {
				anInt7255 = (int) ((float) anIntArray7276[0] / 3.0F);
				anInt7278 = (int) ((float) anIntArray7276[1] / 3.0F);
				anIntArray7273 = new int[anInt7255 * anInt7278];
			}
			anInt7266 = 0;
			for (int i_130_ = 0; i_130_ < anInt7260; i_130_++)
				method9019(aClass178_7268, aClass546Array7261[i_130_], i);
			for (int i_131_ = 0; i_131_ < anInt7270; i_131_++)
				method9019(aClass178_7268, aClass546Array7275[i_131_], i);
			for (int i_132_ = 0; i_132_ < anInt7264; i_132_++)
				method9019(aClass178_7268, aClass546Array7265[i_132_], i);
			aClass563_7274.anInt7572 = 0;
			if (anInt7266 > 0) {
				int i_133_ = anIntArray7273.length;
				int i_134_ = i_133_ - i_133_ & 0x7;
				int i_135_ = 0;
				while (i_135_ < i_134_) {
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
					anIntArray7273[i_135_++] = 2147483647;
				}
				while (i_135_ < i_133_)
					anIntArray7273[i_135_++] = 2147483647;
				aClass563_7274.anInt7571 = 1;
				for (int i_136_ = 0; i_136_ < anInt7266; i_136_++) {
					Class546 class546 = aClass546Array7267[i_136_];
					aClass563_7274.method9474(class546.aShortArray7300[0], class546.aShortArray7300[1], class546.aShortArray7300[3], class546.aShortArray7299[0], class546.aShortArray7299[1], class546.aShortArray7299[3], class546.aShortArray7301[0], class546.aShortArray7301[1], class546.aShortArray7301[3]);
					aClass563_7274.method9474(class546.aShortArray7300[1], class546.aShortArray7300[2], class546.aShortArray7300[3], class546.aShortArray7299[1], class546.aShortArray7299[2], class546.aShortArray7299[3], class546.aShortArray7301[1], class546.aShortArray7301[2], class546.aShortArray7301[3]);
				}
				aClass563_7274.anInt7571 = 2;
			}
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-1359548292);
		}
	}

	public void method9029(int i, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_142_ = i_138_ << aClass560_7272.anInt7496 * -906898059;
				int i_143_ = i_142_ + aClass560_7272.anInt7559 * -1817614813;
				int i_144_ = i_139_ << aClass560_7272.anInt7496 * -906898059;
				int i_145_ = i_144_ + aClass560_7272.anInt7559 * -1817614813;
				int i_146_ = aClass560_7272.aClass142Array7547[i_137_].method2321(i_138_, i_139_, 1673092433);
				int i_147_ = aClass560_7272.aClass142Array7547[i_137_].method2321(i_138_ + 1, i_139_ + 1, 1944999539);
				aClass546Array7265[anInt7264++] = new Class546(aClass560_7272, i, i_137_, i_142_, i_143_, i_143_, i_142_, i_146_, i_147_, i_147_ - i_140_, i_146_ - i_140_, i_144_, i_145_, i_145_, i_144_);
			} else {
				int i_148_ = ((i_138_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
				int i_149_ = i_148_ - aClass560_7272.anInt7559 * -1817614813;
				int i_150_ = i_139_ << aClass560_7272.anInt7496 * -906898059;
				int i_151_ = i_150_ + aClass560_7272.anInt7559 * -1817614813;
				int i_152_ = aClass560_7272.aClass142Array7547[i_137_].method2321(i_138_ + 1, i_139_, 1778151134);
				int i_153_ = aClass560_7272.aClass142Array7547[i_137_].method2321(i_138_, i_139_ + 1, 1972837941);
				aClass546Array7265[anInt7264++] = new Class546(aClass560_7272, i, i_137_, i_148_, i_149_, i_149_, i_148_, i_152_, i_153_, i_153_ - i_140_, i_152_ - i_140_, i_150_, i_151_, i_151_, i_150_);
			}
		} else {
			Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i_137_][i_138_][i_139_]);
			if (class565 == null)
				aClass560_7272.aClass565ArrayArrayArray7508[i_137_][i_138_][i_139_] = class565 = new Class565(i_137_);
			if (i == 1) {
				class565.aShort7588 = (short) i_140_;
				class565.aShort7585 = (short) i_141_;
			} else if (i == 2) {
				class565.aShort7594 = (short) i_140_;
				class565.aShort7597 = (short) i_141_;
			}
			if (aBool7256)
				method9016();
		}
	}

	void method9030(Class178 class178, int i) {
		aClass178_7268 = class178;
		if (!aBool7277 || !aBool7250)
			anInt7266 = 0;
		else {
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-547039063);
			aClass178_7268.method3038(anIntArray7276);
			if (anInt7255 != (int) ((float) anIntArray7276[0] / 3.0F) || anInt7278 != (int) ((float) anIntArray7276[1] / 3.0F)) {
				anInt7255 = (int) ((float) anIntArray7276[0] / 3.0F);
				anInt7278 = (int) ((float) anIntArray7276[1] / 3.0F);
				anIntArray7273 = new int[anInt7255 * anInt7278];
			}
			anInt7266 = 0;
			for (int i_154_ = 0; i_154_ < anInt7260; i_154_++)
				method9019(aClass178_7268, aClass546Array7261[i_154_], i);
			for (int i_155_ = 0; i_155_ < anInt7270; i_155_++)
				method9019(aClass178_7268, aClass546Array7275[i_155_], i);
			for (int i_156_ = 0; i_156_ < anInt7264; i_156_++)
				method9019(aClass178_7268, aClass546Array7265[i_156_], i);
			aClass563_7274.anInt7572 = 0;
			if (anInt7266 > 0) {
				int i_157_ = anIntArray7273.length;
				int i_158_ = i_157_ - i_157_ & 0x7;
				int i_159_ = 0;
				while (i_159_ < i_158_) {
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
					anIntArray7273[i_159_++] = 2147483647;
				}
				while (i_159_ < i_157_)
					anIntArray7273[i_159_++] = 2147483647;
				aClass563_7274.anInt7571 = 1;
				for (int i_160_ = 0; i_160_ < anInt7266; i_160_++) {
					Class546 class546 = aClass546Array7267[i_160_];
					aClass563_7274.method9474(class546.aShortArray7300[0], class546.aShortArray7300[1], class546.aShortArray7300[3], class546.aShortArray7299[0], class546.aShortArray7299[1], class546.aShortArray7299[3], class546.aShortArray7301[0], class546.aShortArray7301[1], class546.aShortArray7301[3]);
					aClass563_7274.method9474(class546.aShortArray7300[1], class546.aShortArray7300[2], class546.aShortArray7300[3], class546.aShortArray7299[1], class546.aShortArray7299[2], class546.aShortArray7299[3], class546.aShortArray7301[1], class546.aShortArray7301[2], class546.aShortArray7301[3]);
				}
				aClass563_7274.anInt7571 = 2;
			}
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(91305626);
		}
	}

	void method9031() {
		for (int i = 0; i < anInt7270; i++)
			aClass546Array7275[i] = null;
		anInt7270 = 0;
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_161_ = 0; i_161_ < aClass560_7272.anInt7546 * -957102653; i_161_++) {
				for (int i_162_ = 0; i_162_ < aClass560_7272.anInt7507 * -34274863; i_162_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_162_][i_161_]);
					if (class565 != null) {
						if (class565.aShort7588 > 0)
							class565.aShort7588 *= -1;
						if (class565.aShort7594 > 0)
							class565.aShort7594 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_163_ = 0; i_163_ < aClass560_7272.anInt7546 * -957102653; i_163_++) {
				for (int i_164_ = 0; i_164_ < aClass560_7272.anInt7507 * -34274863; i_164_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_164_][i_163_]);
					if (class565 != null) {
						boolean bool = ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_164_][i_163_]) != null && ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_164_][i_163_].aClass565_7586) != null));
						if (class565.aShort7588 < 0) {
							int i_165_ = i_163_;
							int i_166_ = i_163_;
							int i_167_ = i;
							int i_168_ = i;
							Class565 class565_169_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_164_][i_165_ - 1]);
							int i_170_;
							for (i_170_ = (aClass560_7272.aClass142Array7547[i].method2321(i_164_, i_163_, 1889698402)); (i_165_ > 0 && class565_169_ != null && class565_169_.aShort7588 < 0 && (class565_169_.aShort7588 == class565.aShort7588) && (class565_169_.aShort7585 == class565.aShort7585) && (i_170_ == (aClass560_7272.aClass142Array7547[i].method2321(i_164_, i_165_ - 1, 2094032270))) && (i_165_ - 1 <= 0 || i_170_ == (aClass560_7272.aClass142Array7547[i].method2321(i_164_, i_165_ - 2, 1986105119))) && i_166_ - i_165_ <= 10); class565_169_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_164_][i_165_ - 1]))
								i_165_--;
							for (class565_169_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_164_][i_166_ + 1]); (i_166_ < aClass560_7272.anInt7507 * -34274863 && class565_169_ != null && class565_169_.aShort7588 < 0 && (class565_169_.aShort7588 == class565.aShort7588) && (class565_169_.aShort7585 == class565.aShort7585) && (i_170_ == (aClass560_7272.aClass142Array7547[i].method2321(i_164_, i_166_ + 1, 1942461752))) && ((i_166_ + 1 >= aClass560_7272.anInt7507 * -34274863) || i_170_ == (aClass560_7272.aClass142Array7547[i].method2321(i_164_, i_166_ + 2, 1840184644))) && i_166_ - i_165_ <= 10); class565_169_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_164_][i_166_ + 1]))
								i_166_++;
							int i_171_ = i_168_ - i_167_ + 1;
							int i_172_ = aClass560_7272.aClass142Array7547[bool ? i_167_ + 1 : i_167_].method2321(i_164_, i_165_, 1739024927);
							int i_173_ = i_172_ + class565.aShort7588 * i_171_;
							int i_174_ = (aClass560_7272.aClass142Array7547[bool ? i_167_ + 1 : i_167_].method2321(i_164_, i_166_ + 1, 1759910901));
							int i_175_ = i_174_ + class565.aShort7588 * i_171_;
							int i_176_ = (i_164_ << aClass560_7272.anInt7496 * -906898059);
							int i_177_ = (i_165_ << aClass560_7272.anInt7496 * -906898059);
							int i_178_ = ((i_166_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 1, i_168_, i_176_ + class565.aShort7585, i_176_ + class565.aShort7585, i_176_ + class565.aShort7585, i_176_ + class565.aShort7585, i_172_, i_174_, i_175_, i_173_, i_177_, i_178_, i_178_, i_177_);
							for (int i_179_ = i_167_; i_179_ <= i_168_; i_179_++) {
								for (int i_180_ = i_165_; i_180_ <= i_166_; i_180_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_179_][i_164_][i_180_].aShort7588 *= -1;
							}
						}
						if (class565.aShort7594 < 0) {
							int i_181_ = i_164_;
							int i_182_ = i_164_;
							int i_183_ = i;
							int i_184_ = i;
							Class565 class565_185_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_181_ - 1][i_163_]);
							int i_186_;
							for (i_186_ = (aClass560_7272.aClass142Array7547[i].method2321(i_164_, i_163_, 2079644138)); (i_181_ > 0 && class565_185_ != null && class565_185_.aShort7594 < 0 && (class565_185_.aShort7594 == class565.aShort7594) && (class565_185_.aShort7597 == class565.aShort7597) && (i_186_ == (aClass560_7272.aClass142Array7547[i].method2321(i_181_ - 1, i_163_, 1738403799))) && (i_181_ - 1 <= 0 || i_186_ == (aClass560_7272.aClass142Array7547[i].method2321(i_181_ - 2, i_163_, 1808932230))) && i_182_ - i_181_ <= 10); class565_185_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_181_ - 1][i_163_]))
								i_181_--;
							for (class565_185_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_182_ + 1][i_163_]); ((i_182_ < aClass560_7272.anInt7546 * -957102653) && class565_185_ != null && class565_185_.aShort7594 < 0 && (class565_185_.aShort7594 == class565.aShort7594) && (class565_185_.aShort7597 == class565.aShort7597) && (i_186_ == (aClass560_7272.aClass142Array7547[i].method2321(i_182_ + 1, i_163_, 1816772296))) && (i_182_ + 1 >= (aClass560_7272.anInt7546 * -957102653) || i_186_ == (aClass560_7272.aClass142Array7547[i].method2321(i_182_ + 2, i_163_, 1968136375))) && i_182_ - i_181_ <= 10); class565_185_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_182_ + 1][i_163_]))
								i_182_++;
							int i_187_ = i_184_ - i_183_ + 1;
							int i_188_ = aClass560_7272.aClass142Array7547[bool ? i_183_ + 1 : i_183_].method2321(i_181_, i_163_, 1871630539);
							int i_189_ = i_188_ + class565.aShort7594 * i_187_;
							int i_190_ = (aClass560_7272.aClass142Array7547[bool ? i_183_ + 1 : i_183_].method2321(i_182_ + 1, i_163_, 1847116631));
							int i_191_ = i_190_ + class565.aShort7594 * i_187_;
							int i_192_ = (i_181_ << aClass560_7272.anInt7496 * -906898059);
							int i_193_ = ((i_182_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							int i_194_ = (i_163_ << aClass560_7272.anInt7496 * -906898059);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 2, i_184_, i_192_, i_193_, i_193_, i_192_, i_188_, i_190_, i_191_, i_189_, i_194_ + class565.aShort7597, i_194_ + class565.aShort7597, i_194_ + class565.aShort7597, i_194_ + class565.aShort7597);
							for (int i_195_ = i_183_; i_195_ <= i_184_; i_195_++) {
								for (int i_196_ = i_181_; i_196_ <= i_182_; i_196_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_195_][i_196_][i_163_].aShort7594 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7256 = true;
	}

	final boolean method9032(Class564 class564) {
		if (class564 == null)
			return false;
		return method9027(class564.anInt7579, class564.anInt7581, class564.anInt7577, class564.anInt7575 - class564.anInt7579, class564.anInt7582 - class564.anInt7581, class564.anInt7584 - class564.anInt7577);
	}

	final boolean method9033(Class564 class564) {
		if (class564 == null)
			return false;
		return method9027(class564.anInt7579, class564.anInt7581, class564.anInt7577, class564.anInt7575 - class564.anInt7579, class564.anInt7582 - class564.anInt7581, class564.anInt7584 - class564.anInt7577);
	}

	public void method9034(int i, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_) {
		aClass546Array7261[anInt7260++] = new Class546(aClass560_7272, i, i_197_, i_198_, i_199_, i_199_, i_198_, i_202_, i_203_, i_203_, i_202_, i_200_, i_200_, i_201_, i_201_);
	}

	Class544(Class560 class560) {
		aBool7250 = true;
		aBool7256 = false;
		anInt7266 = 0;
		aFloatArray7254 = new float[3];
		anIntArray7276 = new int[2];
		anInt7255 = -1;
		anInt7278 = -1;
		aBool7279 = true;
		anInt7257 = class560.anInt7559 * -1817614813;
		anInt7258 = class560.anInt7559 * -1817614813;
		aClass560_7272 = class560;
		aClass546Array7261 = new Class546[546];
		anInt7260 = 0;
		aClass546Array7275 = new Class546[2032];
		anInt7270 = 0;
		aClass546Array7265 = new Class546[1028];
		anInt7264 = 0;
		aClass546Array7267 = new Class546[1039];
		anInt7266 = 0;
		anIntArrayArrayArray7259 = (new int[aClass560_7272.anInt7505 * -1277045625][aClass560_7272.anInt7546 * -957102653 + 1][aClass560_7272.anInt7507 * -34274863 + 1]);
		aBool7256 = false;
		aBool7277 = true;
		if (aBool7277)
			aClass563_7274 = new Class563(this);
	}

	public void method9035(int i, int i_204_, int i_205_, int i_206_) {
		if (i == 8 || i == 16) {
			for (int i_207_ = 0; i_207_ < anInt7264; i_207_++) {
				Class546 class546 = aClass546Array7265[i_207_];
				if (class546.aByte7290 == i && class546.aByte7285 == i_204_ && ((class546.aShort7296 == i_205_ && class546.aShort7294 == i_206_) || (class546.aShort7293 == i_205_ && class546.aShort7295 == i_206_))) {
					if (i_207_ != anInt7264)
						System.arraycopy(aClass546Array7265, i_207_ + 1, aClass546Array7265, i_207_, aClass546Array7265.length - (i_207_ + 1));
					anInt7264--;
					break;
				}
			}
		} else {
			Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i_204_][i_205_][i_206_]);
			if (class565 != null) {
				if (i == 1)
					class565.aShort7588 = (short) 0;
				else if (i == 2)
					class565.aShort7594 = (short) 0;
			}
			method9016();
		}
	}

	void method9036() {
		for (int i = 0; i < anInt7270; i++)
			aClass546Array7275[i] = null;
		anInt7270 = 0;
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_208_ = 0; i_208_ < aClass560_7272.anInt7546 * -957102653; i_208_++) {
				for (int i_209_ = 0; i_209_ < aClass560_7272.anInt7507 * -34274863; i_209_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_209_][i_208_]);
					if (class565 != null) {
						if (class565.aShort7588 > 0)
							class565.aShort7588 *= -1;
						if (class565.aShort7594 > 0)
							class565.aShort7594 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_210_ = 0; i_210_ < aClass560_7272.anInt7546 * -957102653; i_210_++) {
				for (int i_211_ = 0; i_211_ < aClass560_7272.anInt7507 * -34274863; i_211_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_211_][i_210_]);
					if (class565 != null) {
						boolean bool = ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_211_][i_210_]) != null && ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_211_][i_210_].aClass565_7586) != null));
						if (class565.aShort7588 < 0) {
							int i_212_ = i_210_;
							int i_213_ = i_210_;
							int i_214_ = i;
							int i_215_ = i;
							Class565 class565_216_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_211_][i_212_ - 1]);
							int i_217_;
							for (i_217_ = (aClass560_7272.aClass142Array7547[i].method2321(i_211_, i_210_, 1899424314)); (i_212_ > 0 && class565_216_ != null && class565_216_.aShort7588 < 0 && (class565_216_.aShort7588 == class565.aShort7588) && (class565_216_.aShort7585 == class565.aShort7585) && (i_217_ == (aClass560_7272.aClass142Array7547[i].method2321(i_211_, i_212_ - 1, 2045239874))) && (i_212_ - 1 <= 0 || i_217_ == (aClass560_7272.aClass142Array7547[i].method2321(i_211_, i_212_ - 2, 2066140581))) && i_213_ - i_212_ <= 10); class565_216_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_211_][i_212_ - 1]))
								i_212_--;
							for (class565_216_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_211_][i_213_ + 1]); (i_213_ < aClass560_7272.anInt7507 * -34274863 && class565_216_ != null && class565_216_.aShort7588 < 0 && (class565_216_.aShort7588 == class565.aShort7588) && (class565_216_.aShort7585 == class565.aShort7585) && (i_217_ == (aClass560_7272.aClass142Array7547[i].method2321(i_211_, i_213_ + 1, 1573568765))) && ((i_213_ + 1 >= aClass560_7272.anInt7507 * -34274863) || i_217_ == (aClass560_7272.aClass142Array7547[i].method2321(i_211_, i_213_ + 2, 1870265308))) && i_213_ - i_212_ <= 10); class565_216_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_211_][i_213_ + 1]))
								i_213_++;
							int i_218_ = i_215_ - i_214_ + 1;
							int i_219_ = aClass560_7272.aClass142Array7547[bool ? i_214_ + 1 : i_214_].method2321(i_211_, i_212_, 1990723162);
							int i_220_ = i_219_ + class565.aShort7588 * i_218_;
							int i_221_ = (aClass560_7272.aClass142Array7547[bool ? i_214_ + 1 : i_214_].method2321(i_211_, i_213_ + 1, 1785917946));
							int i_222_ = i_221_ + class565.aShort7588 * i_218_;
							int i_223_ = (i_211_ << aClass560_7272.anInt7496 * -906898059);
							int i_224_ = (i_212_ << aClass560_7272.anInt7496 * -906898059);
							int i_225_ = ((i_213_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 1, i_215_, i_223_ + class565.aShort7585, i_223_ + class565.aShort7585, i_223_ + class565.aShort7585, i_223_ + class565.aShort7585, i_219_, i_221_, i_222_, i_220_, i_224_, i_225_, i_225_, i_224_);
							for (int i_226_ = i_214_; i_226_ <= i_215_; i_226_++) {
								for (int i_227_ = i_212_; i_227_ <= i_213_; i_227_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_226_][i_211_][i_227_].aShort7588 *= -1;
							}
						}
						if (class565.aShort7594 < 0) {
							int i_228_ = i_211_;
							int i_229_ = i_211_;
							int i_230_ = i;
							int i_231_ = i;
							Class565 class565_232_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_228_ - 1][i_210_]);
							int i_233_;
							for (i_233_ = (aClass560_7272.aClass142Array7547[i].method2321(i_211_, i_210_, 2133742888)); (i_228_ > 0 && class565_232_ != null && class565_232_.aShort7594 < 0 && (class565_232_.aShort7594 == class565.aShort7594) && (class565_232_.aShort7597 == class565.aShort7597) && (i_233_ == (aClass560_7272.aClass142Array7547[i].method2321(i_228_ - 1, i_210_, 1972895507))) && (i_228_ - 1 <= 0 || i_233_ == (aClass560_7272.aClass142Array7547[i].method2321(i_228_ - 2, i_210_, 1809724605))) && i_229_ - i_228_ <= 10); class565_232_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_228_ - 1][i_210_]))
								i_228_--;
							for (class565_232_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_229_ + 1][i_210_]); ((i_229_ < aClass560_7272.anInt7546 * -957102653) && class565_232_ != null && class565_232_.aShort7594 < 0 && (class565_232_.aShort7594 == class565.aShort7594) && (class565_232_.aShort7597 == class565.aShort7597) && (i_233_ == (aClass560_7272.aClass142Array7547[i].method2321(i_229_ + 1, i_210_, 1792824470))) && (i_229_ + 1 >= (aClass560_7272.anInt7546 * -957102653) || i_233_ == (aClass560_7272.aClass142Array7547[i].method2321(i_229_ + 2, i_210_, 1625087028))) && i_229_ - i_228_ <= 10); class565_232_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_229_ + 1][i_210_]))
								i_229_++;
							int i_234_ = i_231_ - i_230_ + 1;
							int i_235_ = aClass560_7272.aClass142Array7547[bool ? i_230_ + 1 : i_230_].method2321(i_228_, i_210_, 1544660970);
							int i_236_ = i_235_ + class565.aShort7594 * i_234_;
							int i_237_ = (aClass560_7272.aClass142Array7547[bool ? i_230_ + 1 : i_230_].method2321(i_229_ + 1, i_210_, 1961349868));
							int i_238_ = i_237_ + class565.aShort7594 * i_234_;
							int i_239_ = (i_228_ << aClass560_7272.anInt7496 * -906898059);
							int i_240_ = ((i_229_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							int i_241_ = (i_210_ << aClass560_7272.anInt7496 * -906898059);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 2, i_231_, i_239_, i_240_, i_240_, i_239_, i_235_, i_237_, i_238_, i_236_, i_241_ + class565.aShort7597, i_241_ + class565.aShort7597, i_241_ + class565.aShort7597, i_241_ + class565.aShort7597);
							for (int i_242_ = i_230_; i_242_ <= i_231_; i_242_++) {
								for (int i_243_ = i_228_; i_243_ <= i_229_; i_243_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_242_][i_243_][i_210_].aShort7594 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7256 = true;
	}

	void method9037(Class178 class178, Class546 class546, int i) {
		aClass178_7268 = class178;
		if (anIntArray7253 != null && class546.aByte7285 >= i) {
			for (int i_244_ = 0; i_244_ < anIntArray7253.length; i_244_++) {
				if (anIntArray7253[i_244_] != -1000000 && (class546.anIntArray7297[0] <= anIntArray7253[i_244_] || class546.anIntArray7297[1] <= anIntArray7253[i_244_] || class546.anIntArray7297[2] <= anIntArray7253[i_244_] || (class546.anIntArray7297[3] <= anIntArray7253[i_244_])) && (class546.anIntArray7286[0] <= anIntArray7249[i_244_] || class546.anIntArray7286[1] <= anIntArray7249[i_244_] || class546.anIntArray7286[2] <= anIntArray7249[i_244_] || (class546.anIntArray7286[3] <= anIntArray7249[i_244_])) && (class546.anIntArray7286[0] >= anIntArray7269[i_244_] || class546.anIntArray7286[1] >= anIntArray7269[i_244_] || class546.anIntArray7286[2] >= anIntArray7269[i_244_] || (class546.anIntArray7286[3] >= anIntArray7269[i_244_])) && (class546.anIntArray7288[0] <= anIntArray7271[i_244_] || class546.anIntArray7288[1] <= anIntArray7271[i_244_] || class546.anIntArray7288[2] <= anIntArray7271[i_244_] || (class546.anIntArray7288[3] <= anIntArray7271[i_244_])) && (class546.anIntArray7288[0] >= anIntArray7262[i_244_] || class546.anIntArray7288[1] >= anIntArray7262[i_244_] || class546.anIntArray7288[2] >= anIntArray7262[i_244_] || (class546.anIntArray7288[3] >= anIntArray7262[i_244_])))
					return;
			}
		}
		if (class546.aByte7290 == 1) {
			int i_245_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
			if (i_245_ >= 0 && i_245_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089)) {
				int i_246_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_246_ < 0)
					i_246_ = 0;
				else if (i_246_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_247_ = (class546.aShort7295 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_247_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_247_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_247_ < 0)
					return;
				boolean bool = false;
				while_40_: do {
					do {
						if (i_246_ > i_247_)
							break while_40_;
					} while (!aClass560_7272.aBoolArrayArray7558[i_245_][i_246_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass560_7272.anInt7523 * -532339521 - class546.anIntArray7286[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7257) && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
						aClass546Array7267[anInt7266++] = class546;
				}
			}
		} else if (class546.aByte7290 == 2) {
			int i_248_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
			if (i_248_ >= 0 && i_248_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089)) {
				int i_249_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_249_ < 0)
					i_249_ = 0;
				else if (i_249_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_250_ = (class546.aShort7293 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_250_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_250_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_250_ < 0)
					return;
				boolean bool = false;
				while_41_: do {
					do {
						if (i_249_ > i_250_)
							break while_41_;
					} while (!aClass560_7272.aBoolArrayArray7558[i_249_++][i_248_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass560_7272.anInt7535 * 2069862001 - class546.anIntArray7288[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7257) && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
						aClass546Array7267[anInt7266++] = class546;
				}
			}
		} else if (class546.aByte7290 == 16 || class546.aByte7290 == 8) {
			int i_251_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
			if (i_251_ >= 0 && i_251_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089)) {
				int i_252_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_252_ >= 0 && i_252_ <= (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089) && aClass560_7272.aBoolArrayArray7558[i_251_][i_252_]) {
					float f = (float) (aClass560_7272.anInt7523 * -532339521 - class546.anIntArray7286[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_253_ = (float) (aClass560_7272.anInt7535 * 2069862001 - class546.anIntArray7288[0]);
					if (f_253_ < 0.0F)
						f_253_ *= -1.0F;
					if ((!(f < (float) anInt7257) || !(f_253_ < (float) anInt7257)) && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
						aClass546Array7267[anInt7266++] = class546;
				}
			}
		} else if (class546.aByte7290 == 4) {
			float f = (float) (class546.anIntArray7297[0] - aClass560_7272.anInt7536 * 819461699);
			if (!(f <= (float) anInt7258)) {
				int i_254_ = (class546.aShort7294 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_254_ < 0)
					i_254_ = 0;
				else if (i_254_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_255_ = (class546.aShort7295 - aClass560_7272.anInt7533 * 164493233 + aClass560_7272.anInt7538 * -1164760089);
				if (i_255_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_255_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_255_ < 0)
					return;
				int i_256_ = (class546.aShort7296 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_256_ < 0)
					i_256_ = 0;
				else if (i_256_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					return;
				int i_257_ = (class546.aShort7293 - aClass560_7272.anInt7504 * -208391685 + aClass560_7272.anInt7538 * -1164760089);
				if (i_257_ > (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089))
					i_257_ = (aClass560_7272.anInt7538 * -1164760089 + aClass560_7272.anInt7538 * -1164760089);
				else if (i_257_ < 0)
					return;
				boolean bool = false;
				while_42_: for (int i_258_ = i_256_; i_258_ <= i_257_; i_258_++) {
					for (int i_259_ = i_254_; i_259_ <= i_255_; i_259_++) {
						if (aClass560_7272.aBoolArrayArray7558[i_258_][i_259_]) {
							bool = true;
							break while_42_;
						}
					}
				}
				if (bool && method9020(class546, 0) && method9020(class546, 1) && method9020(class546, 2) && method9020(class546, 3))
					aClass546Array7267[anInt7266++] = class546;
			}
		}
	}

	final boolean method9038(int i, int i_260_, int i_261_) {
		aClass178_7268.method3153((float) i, (float) i_260_, (float) i_261_, aFloatArray7254);
		if (aFloatArray7254[2] < 50.0F)
			return false;
		aFloatArray7254[0] /= 3.0F;
		aFloatArray7254[1] /= 3.0F;
		return true;
	}

	boolean method9039(int i, int i_262_, int i_263_) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		int i_264_ = anIntArrayArrayArray7259[i][i_262_][i_263_];
		if (i_264_ == -(aClass560_7272.anInt7500 * 1075365329))
			return false;
		if (i_264_ == aClass560_7272.anInt7500 * 1075365329)
			return true;
		if (aClass560_7272.aClass142Array7509 == aClass560_7272.aClass142Array7513)
			return false;
		int i_265_ = i_262_ << aClass560_7272.anInt7496 * -906898059;
		int i_266_ = i_263_ << aClass560_7272.anInt7496 * -906898059;
		if (method9013(i_265_ + 1, aClass560_7272.aClass142Array7509[i].method2321(i_262_, i_263_, 1915206248), i_266_ + 1, i_265_ + aClass560_7272.anInt7559 * -1817614813 - 1, aClass560_7272.aClass142Array7509[i].method2321(i_262_ + 1, i_263_ + 1, 1986347972), i_266_ + aClass560_7272.anInt7559 * -1817614813 - 1, i_265_ + 1, aClass560_7272.aClass142Array7509[i].method2321(i_262_, i_263_ + 1, 2105960756), i_266_ + aClass560_7272.anInt7559 * -1817614813 - 1) && method9013(i_265_ + 1, aClass560_7272.aClass142Array7509[i].method2321(i_262_, i_263_, 1590196220), i_266_ + 1, i_265_ + aClass560_7272.anInt7559 * -1817614813 - 1, aClass560_7272.aClass142Array7509[i].method2321(i_262_ + 1, i_263_, 1907522208), i_266_ + 1, i_265_ + aClass560_7272.anInt7559 * -1817614813 - 1, aClass560_7272.aClass142Array7509[i].method2321(i_262_ + 1, i_263_ + 1, 1963521383), (i_266_ + aClass560_7272.anInt7559 * -1817614813 - 1))) {
			anIntArrayArrayArray7259[i][i_262_][i_263_] = aClass560_7272.anInt7500 * 1075365329;
			return true;
		}
		anIntArrayArrayArray7259[i][i_262_][i_263_] = -(aClass560_7272.anInt7500 * 1075365329);
		return false;
	}

	boolean method9040(int i, int i_267_, int i_268_, int i_269_, int i_270_, Class564 class564) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		if (i_267_ < 0 || i_269_ < 0 || i_268_ >= anIntArrayArrayArray7259[i].length || i_270_ >= anIntArrayArrayArray7259[i][i_267_].length)
			return false;
		if (i_267_ == i_268_ && i_269_ == i_270_) {
			if (!method9022(i, i_267_, i_269_))
				return false;
			if (method9032(class564))
				return true;
			return false;
		}
		for (int i_271_ = i_267_; i_271_ <= i_268_; i_271_++) {
			for (int i_272_ = i_269_; i_272_ <= i_270_; i_272_++) {
				if (anIntArrayArrayArray7259[i][i_271_][i_272_] == -(aClass560_7272.anInt7500 * 1075365329))
					return false;
			}
		}
		if (!method9032(class564))
			return false;
		return true;
	}

	boolean method9041(int i, int i_273_, int i_274_, int i_275_, int i_276_, Class564 class564) {
		if (!aBool7277 || !aBool7250)
			return false;
		if (aClass563_7274.anInt7572 < 100)
			return false;
		if (i_273_ < 0 || i_275_ < 0 || i_274_ >= anIntArrayArrayArray7259[i].length || i_276_ >= anIntArrayArrayArray7259[i][i_273_].length)
			return false;
		if (i_273_ == i_274_ && i_275_ == i_276_) {
			if (!method9022(i, i_273_, i_275_))
				return false;
			if (method9032(class564))
				return true;
			return false;
		}
		for (int i_277_ = i_273_; i_277_ <= i_274_; i_277_++) {
			for (int i_278_ = i_275_; i_278_ <= i_276_; i_278_++) {
				if (anIntArrayArrayArray7259[i][i_277_][i_278_] == -(aClass560_7272.anInt7500 * 1075365329))
					return false;
			}
		}
		if (!method9032(class564))
			return false;
		return true;
	}

	void method9042() {
		for (int i = 0; i < anInt7270; i++)
			aClass546Array7275[i] = null;
		anInt7270 = 0;
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_279_ = 0; i_279_ < aClass560_7272.anInt7546 * -957102653; i_279_++) {
				for (int i_280_ = 0; i_280_ < aClass560_7272.anInt7507 * -34274863; i_280_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_280_][i_279_]);
					if (class565 != null) {
						if (class565.aShort7588 > 0)
							class565.aShort7588 *= -1;
						if (class565.aShort7594 > 0)
							class565.aShort7594 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass560_7272.anInt7505 * -1277045625; i++) {
			for (int i_281_ = 0; i_281_ < aClass560_7272.anInt7546 * -957102653; i_281_++) {
				for (int i_282_ = 0; i_282_ < aClass560_7272.anInt7507 * -34274863; i_282_++) {
					Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_282_][i_281_]);
					if (class565 != null) {
						boolean bool = ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_282_][i_281_]) != null && ((aClass560_7272.aClass565ArrayArrayArray7508[0][i_282_][i_281_].aClass565_7586) != null));
						if (class565.aShort7588 < 0) {
							int i_283_ = i_281_;
							int i_284_ = i_281_;
							int i_285_ = i;
							int i_286_ = i;
							Class565 class565_287_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_282_][i_283_ - 1]);
							int i_288_;
							for (i_288_ = (aClass560_7272.aClass142Array7547[i].method2321(i_282_, i_281_, 1646902543)); (i_283_ > 0 && class565_287_ != null && class565_287_.aShort7588 < 0 && (class565_287_.aShort7588 == class565.aShort7588) && (class565_287_.aShort7585 == class565.aShort7585) && (i_288_ == (aClass560_7272.aClass142Array7547[i].method2321(i_282_, i_283_ - 1, 1724211452))) && (i_283_ - 1 <= 0 || i_288_ == (aClass560_7272.aClass142Array7547[i].method2321(i_282_, i_283_ - 2, 2052175188))) && i_284_ - i_283_ <= 10); class565_287_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_282_][i_283_ - 1]))
								i_283_--;
							for (class565_287_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_282_][i_284_ + 1]); (i_284_ < aClass560_7272.anInt7507 * -34274863 && class565_287_ != null && class565_287_.aShort7588 < 0 && (class565_287_.aShort7588 == class565.aShort7588) && (class565_287_.aShort7585 == class565.aShort7585) && (i_288_ == (aClass560_7272.aClass142Array7547[i].method2321(i_282_, i_284_ + 1, 1765009510))) && ((i_284_ + 1 >= aClass560_7272.anInt7507 * -34274863) || i_288_ == (aClass560_7272.aClass142Array7547[i].method2321(i_282_, i_284_ + 2, 1894991206))) && i_284_ - i_283_ <= 10); class565_287_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_282_][i_284_ + 1]))
								i_284_++;
							int i_289_ = i_286_ - i_285_ + 1;
							int i_290_ = aClass560_7272.aClass142Array7547[bool ? i_285_ + 1 : i_285_].method2321(i_282_, i_283_, 1771945684);
							int i_291_ = i_290_ + class565.aShort7588 * i_289_;
							int i_292_ = (aClass560_7272.aClass142Array7547[bool ? i_285_ + 1 : i_285_].method2321(i_282_, i_284_ + 1, 1780208372));
							int i_293_ = i_292_ + class565.aShort7588 * i_289_;
							int i_294_ = (i_282_ << aClass560_7272.anInt7496 * -906898059);
							int i_295_ = (i_283_ << aClass560_7272.anInt7496 * -906898059);
							int i_296_ = ((i_284_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 1, i_286_, i_294_ + class565.aShort7585, i_294_ + class565.aShort7585, i_294_ + class565.aShort7585, i_294_ + class565.aShort7585, i_290_, i_292_, i_293_, i_291_, i_295_, i_296_, i_296_, i_295_);
							for (int i_297_ = i_285_; i_297_ <= i_286_; i_297_++) {
								for (int i_298_ = i_283_; i_298_ <= i_284_; i_298_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_297_][i_282_][i_298_].aShort7588 *= -1;
							}
						}
						if (class565.aShort7594 < 0) {
							int i_299_ = i_282_;
							int i_300_ = i_282_;
							int i_301_ = i;
							int i_302_ = i;
							Class565 class565_303_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_299_ - 1][i_281_]);
							int i_304_;
							for (i_304_ = (aClass560_7272.aClass142Array7547[i].method2321(i_282_, i_281_, 2128089384)); (i_299_ > 0 && class565_303_ != null && class565_303_.aShort7594 < 0 && (class565_303_.aShort7594 == class565.aShort7594) && (class565_303_.aShort7597 == class565.aShort7597) && (i_304_ == (aClass560_7272.aClass142Array7547[i].method2321(i_299_ - 1, i_281_, 1602171121))) && (i_299_ - 1 <= 0 || i_304_ == (aClass560_7272.aClass142Array7547[i].method2321(i_299_ - 2, i_281_, 1704819853))) && i_300_ - i_299_ <= 10); class565_303_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_299_ - 1][i_281_]))
								i_299_--;
							for (class565_303_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_300_ + 1][i_281_]); ((i_300_ < aClass560_7272.anInt7546 * -957102653) && class565_303_ != null && class565_303_.aShort7594 < 0 && (class565_303_.aShort7594 == class565.aShort7594) && (class565_303_.aShort7597 == class565.aShort7597) && (i_304_ == (aClass560_7272.aClass142Array7547[i].method2321(i_300_ + 1, i_281_, 1903208716))) && (i_300_ + 1 >= (aClass560_7272.anInt7546 * -957102653) || i_304_ == (aClass560_7272.aClass142Array7547[i].method2321(i_300_ + 2, i_281_, 2145581949))) && i_300_ - i_299_ <= 10); class565_303_ = (aClass560_7272.aClass565ArrayArrayArray7508[i][i_300_ + 1][i_281_]))
								i_300_++;
							int i_305_ = i_302_ - i_301_ + 1;
							int i_306_ = aClass560_7272.aClass142Array7547[bool ? i_301_ + 1 : i_301_].method2321(i_299_, i_281_, 1982764599);
							int i_307_ = i_306_ + class565.aShort7594 * i_305_;
							int i_308_ = (aClass560_7272.aClass142Array7547[bool ? i_301_ + 1 : i_301_].method2321(i_300_ + 1, i_281_, 2051163971));
							int i_309_ = i_308_ + class565.aShort7594 * i_305_;
							int i_310_ = (i_299_ << aClass560_7272.anInt7496 * -906898059);
							int i_311_ = ((i_300_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
							int i_312_ = (i_281_ << aClass560_7272.anInt7496 * -906898059);
							aClass546Array7275[anInt7270++] = new Class546(aClass560_7272, 2, i_302_, i_310_, i_311_, i_311_, i_310_, i_306_, i_308_, i_309_, i_307_, i_312_ + class565.aShort7597, i_312_ + class565.aShort7597, i_312_ + class565.aShort7597, i_312_ + class565.aShort7597);
							for (int i_313_ = i_301_; i_313_ <= i_302_; i_313_++) {
								for (int i_314_ = i_299_; i_314_ <= i_300_; i_314_++)
									aClass560_7272.aClass565ArrayArrayArray7508[i_313_][i_314_][i_281_].aShort7594 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7256 = true;
	}

	final boolean method9043(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_) {
		if (!method9021(i, i_315_, i_316_))
			return false;
		i = (int) aFloatArray7254[0];
		i_315_ = (int) aFloatArray7254[1];
		i_316_ = (int) aFloatArray7254[2];
		if (!method9021(i_317_, i_318_, i_319_))
			return false;
		i_317_ = (int) aFloatArray7254[0];
		i_318_ = (int) aFloatArray7254[1];
		i_319_ = (int) aFloatArray7254[2];
		if (!method9021(i_320_, i_321_, i_322_))
			return false;
		i_320_ = (int) aFloatArray7254[0];
		i_321_ = (int) aFloatArray7254[1];
		i_322_ = (int) aFloatArray7254[2];
		return aClass563_7274.method9474(i_315_, i_318_, i_321_, i, i_317_, i_320_, i_316_, i_319_, i_322_);
	}

	public void method9044(int i, int i_323_, int i_324_, int i_325_) {
		if (i == 8 || i == 16) {
			for (int i_326_ = 0; i_326_ < anInt7264; i_326_++) {
				Class546 class546 = aClass546Array7265[i_326_];
				if (class546.aByte7290 == i && class546.aByte7285 == i_323_ && ((class546.aShort7296 == i_324_ && class546.aShort7294 == i_325_) || (class546.aShort7293 == i_324_ && class546.aShort7295 == i_325_))) {
					if (i_326_ != anInt7264)
						System.arraycopy(aClass546Array7265, i_326_ + 1, aClass546Array7265, i_326_, aClass546Array7265.length - (i_326_ + 1));
					anInt7264--;
					break;
				}
			}
		} else {
			Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i_323_][i_324_][i_325_]);
			if (class565 != null) {
				if (i == 1)
					class565.aShort7588 = (short) 0;
				else if (i == 2)
					class565.aShort7594 = (short) 0;
			}
			method9016();
		}
	}

	void method9045(Class178 class178, int i) {
		aClass178_7268 = class178;
		if (!aBool7277 || !aBool7250)
			anInt7266 = 0;
		else {
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-1693468824);
			aClass178_7268.method3038(anIntArray7276);
			if (anInt7255 != (int) ((float) anIntArray7276[0] / 3.0F) || anInt7278 != (int) ((float) anIntArray7276[1] / 3.0F)) {
				anInt7255 = (int) ((float) anIntArray7276[0] / 3.0F);
				anInt7278 = (int) ((float) anIntArray7276[1] / 3.0F);
				anIntArray7273 = new int[anInt7255 * anInt7278];
			}
			anInt7266 = 0;
			for (int i_327_ = 0; i_327_ < anInt7260; i_327_++)
				method9019(aClass178_7268, aClass546Array7261[i_327_], i);
			for (int i_328_ = 0; i_328_ < anInt7270; i_328_++)
				method9019(aClass178_7268, aClass546Array7275[i_328_], i);
			for (int i_329_ = 0; i_329_ < anInt7264; i_329_++)
				method9019(aClass178_7268, aClass546Array7265[i_329_], i);
			aClass563_7274.anInt7572 = 0;
			if (anInt7266 > 0) {
				int i_330_ = anIntArray7273.length;
				int i_331_ = i_330_ - i_330_ & 0x7;
				int i_332_ = 0;
				while (i_332_ < i_331_) {
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
					anIntArray7273[i_332_++] = 2147483647;
				}
				while (i_332_ < i_330_)
					anIntArray7273[i_332_++] = 2147483647;
				aClass563_7274.anInt7571 = 1;
				for (int i_333_ = 0; i_333_ < anInt7266; i_333_++) {
					Class546 class546 = aClass546Array7267[i_333_];
					aClass563_7274.method9474(class546.aShortArray7300[0], class546.aShortArray7300[1], class546.aShortArray7300[3], class546.aShortArray7299[0], class546.aShortArray7299[1], class546.aShortArray7299[3], class546.aShortArray7301[0], class546.aShortArray7301[1], class546.aShortArray7301[3]);
					aClass563_7274.method9474(class546.aShortArray7300[1], class546.aShortArray7300[2], class546.aShortArray7300[3], class546.aShortArray7299[1], class546.aShortArray7299[2], class546.aShortArray7299[3], class546.aShortArray7301[1], class546.aShortArray7301[2], class546.aShortArray7301[3]);
				}
				aClass563_7274.anInt7571 = 2;
			}
			if (aBool7279)
				aClass560_7272.aClass61_7501.method1412(-281412401);
		}
	}

	public void method9046(int i, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_339_ = i_335_ << aClass560_7272.anInt7496 * -906898059;
				int i_340_ = i_339_ + aClass560_7272.anInt7559 * -1817614813;
				int i_341_ = i_336_ << aClass560_7272.anInt7496 * -906898059;
				int i_342_ = i_341_ + aClass560_7272.anInt7559 * -1817614813;
				int i_343_ = aClass560_7272.aClass142Array7547[i_334_].method2321(i_335_, i_336_, 1716276167);
				int i_344_ = aClass560_7272.aClass142Array7547[i_334_].method2321(i_335_ + 1, i_336_ + 1, 1544208005);
				aClass546Array7265[anInt7264++] = new Class546(aClass560_7272, i, i_334_, i_339_, i_340_, i_340_, i_339_, i_343_, i_344_, i_344_ - i_337_, i_343_ - i_337_, i_341_, i_342_, i_342_, i_341_);
			} else {
				int i_345_ = ((i_335_ << aClass560_7272.anInt7496 * -906898059) + aClass560_7272.anInt7559 * -1817614813);
				int i_346_ = i_345_ - aClass560_7272.anInt7559 * -1817614813;
				int i_347_ = i_336_ << aClass560_7272.anInt7496 * -906898059;
				int i_348_ = i_347_ + aClass560_7272.anInt7559 * -1817614813;
				int i_349_ = aClass560_7272.aClass142Array7547[i_334_].method2321(i_335_ + 1, i_336_, 1697588911);
				int i_350_ = aClass560_7272.aClass142Array7547[i_334_].method2321(i_335_, i_336_ + 1, 1911721187);
				aClass546Array7265[anInt7264++] = new Class546(aClass560_7272, i, i_334_, i_345_, i_346_, i_346_, i_345_, i_349_, i_350_, i_350_ - i_337_, i_349_ - i_337_, i_347_, i_348_, i_348_, i_347_);
			}
		} else {
			Class565 class565 = (aClass560_7272.aClass565ArrayArrayArray7508[i_334_][i_335_][i_336_]);
			if (class565 == null)
				aClass560_7272.aClass565ArrayArrayArray7508[i_334_][i_335_][i_336_] = class565 = new Class565(i_334_);
			if (i == 1) {
				class565.aShort7588 = (short) i_337_;
				class565.aShort7585 = (short) i_338_;
			} else if (i == 2) {
				class565.aShort7594 = (short) i_337_;
				class565.aShort7597 = (short) i_338_;
			}
			if (aBool7256)
				method9016();
		}
	}
}
