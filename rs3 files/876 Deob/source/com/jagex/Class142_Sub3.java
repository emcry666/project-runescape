/* Class142_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class142_Sub3 extends Class142 {
	float aFloat9741;
	static final int anInt9742 = -1694498816;
	static final int anInt9743 = 1;
	static final int anInt9744 = 2;
	static final int anInt9745 = 64;
	Class178_Sub3 aClass178_Sub3_9746;
	Class129[][] aClass129ArrayArray9747;
	float aFloat9748;
	Class107[][] aClass107ArrayArray9749;
	float aFloat9750;
	Class94[][] aClass94ArrayArray9751;
	Class124[][] aClass124ArrayArray9752;
	float aFloat9753;
	float aFloat9754;
	float aFloat9755;
	float aFloat9756;
	float aFloat9757;
	Class106[][] aClass106ArrayArray9758;
	int anInt9759;
	static final int anInt9760 = 4;
	float aFloat9761;
	float aFloat9762;
	static final boolean aBool9763 = true;
	float aFloat9764;
	float aFloat9765;
	static final boolean aBool9766 = true;
	float aFloat9767;
	float aFloat9768;
	byte[][] aByteArrayArray9769;
	byte[][] aByteArrayArray9770;
	float aFloat9771;
	static final boolean aBool9772 = false;
	float aFloat9773;

	public Class523_Sub27_Sub4 method2349(int i, int i_0_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	public boolean method2341(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_1_, int i_2_, int i_3_, boolean bool) {
		return false;
	}

	public void method2339(int i, int i_4_, int[] is, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, Class163 class163, boolean bool) {
		boolean bool_12_ = (anInt9759 & 0x20) == 0;
		if (aClass106ArrayArray9758 == null && !bool_12_) {
			aClass106ArrayArray9758 = new Class106[anInt1683 * 692304099][anInt1681 * 452998539];
			aClass94ArrayArray9751 = new Class94[anInt1683 * 692304099][anInt1681 * 452998539];
		} else if (aClass124ArrayArray9752 == null && bool_12_)
			aClass124ArrayArray9752 = new Class124[anInt1683 * 692304099][anInt1681 * 452998539];
		else if (aClass129ArrayArray9747 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_13_ = 0; i_13_ < is_8_.length; i_13_++) {
				if (is_8_[i_13_] == -1)
					is_8_[i_13_] = 0;
				else
					is_8_[i_13_] = (Class638.anIntArray8306[(Class493.method8085(is_8_[i_13_], 78657602) & 0xffff)]) << 8 | 0xff;
			}
			if (is_9_ != null) {
				for (int i_14_ = 0; i_14_ < is_9_.length; i_14_++) {
					if (is_9_[i_14_] == -1)
						is_9_[i_14_] = 0;
					else
						is_9_[i_14_] = (Class638.anIntArray8306[(Class493.method8085(is_9_[i_14_], -338977929) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_12_) {
				Class124 class124 = new Class124();
				class124.aShort1516 = (short) is.length;
				class124.aShort1525 = (short) (is.length / 3);
				class124.aShortArray1517 = new short[class124.aShort1516];
				class124.aShortArray1518 = new short[class124.aShort1516];
				class124.aShortArray1522 = new short[class124.aShort1516];
				class124.anIntArray1519 = new int[class124.aShort1516];
				class124.aShortArray1520 = new short[class124.aShort1516];
				class124.aShortArray1515 = new short[class124.aShort1516];
				class124.aByteArray1524 = new byte[class124.aShort1516];
				if (is_7_ != null)
					class124.aShortArray1523 = new short[class124.aShort1516];
				for (int i_15_ = 0; i_15_ < class124.aShort1516; i_15_++) {
					int i_16_ = is[i_15_];
					int i_17_ = is_6_[i_15_];
					boolean bool_18_ = false;
					int i_19_;
					if (i_16_ == 0 && i_17_ == 0)
						i_19_ = (aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_]);
					else if (i_16_ == 0 && i_17_ == anInt1682 * 341909049)
						i_19_ = (aByteArrayArray9769[i][i_4_ + 1] - aByteArrayArray9770[i][i_4_ + 1]);
					else if (i_16_ == anInt1682 * 341909049 && i_17_ == anInt1682 * 341909049)
						i_19_ = (aByteArrayArray9769[i + 1][i_4_ + 1] - aByteArrayArray9770[i + 1][i_4_ + 1]);
					else if (i_16_ == anInt1682 * 341909049 && i_17_ == 0)
						i_19_ = (aByteArrayArray9769[i + 1][i_4_] - aByteArrayArray9770[i + 1][i_4_]);
					else {
						int i_20_ = (((aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_]) * (anInt1682 * 341909049 - i_16_)) + (aByteArrayArray9769[i + 1][i_4_] - aByteArrayArray9770[i + 1][i_4_]) * i_16_);
						int i_21_ = (((aByteArrayArray9769[i][i_4_ + 1] - aByteArrayArray9770[i][i_4_ + 1]) * (anInt1682 * 341909049 - i_16_)) + ((aByteArrayArray9769[i + 1][i_4_ + 1] - aByteArrayArray9770[i + 1][i_4_ + 1]) * i_16_));
						i_19_ = (i_20_ * (anInt1682 * 341909049 - i_17_) + i_21_ * i_17_) >> anInt1680 * 1908849946;
					}
					int i_22_ = (i << anInt1680 * -1193058675) + i_16_;
					int i_23_ = (i_4_ << anInt1680 * -1193058675) + i_17_;
					class124.aShortArray1517[i_15_] = (short) i_16_;
					class124.aShortArray1522[i_15_] = (short) i_17_;
					class124.aShortArray1518[i_15_] = (short) (method2326(i_22_, i_23_, 75967032) + (is_5_ != null ? is_5_[i_15_] : 0));
					if (i_19_ < 0)
						i_19_ = 0;
					if (is_8_[i_15_] == 0) {
						class124.anIntArray1519[i_15_] = 0;
						if (is_9_ != null)
							class124.aByteArray1524[i_15_] = (byte) i_19_;
					} else {
						int i_24_ = 0;
						if (is_7_ != null) {
							int i_25_ = (class124.aShortArray1523[i_15_] = (short) is_7_[i_15_]);
							if (class163.anInt1775 * -118212955 != 0) {
								i_24_ = 255 * i_25_ / (class163.anInt1775 * -118212955);
								if (i_24_ < 0)
									i_24_ = 0;
								else if (i_24_ > 255)
									i_24_ = 255;
							}
						}
						int i_26_ = -16777216;
						if (is_10_[i_15_] != -1) {
							Class177 class177 = aClass178_Sub3_9746.aClass172_1916.method2895(is_10_[i_15_], 469139123);
							if (class177.aBool1881 && method15364(class177.aByte1905))
								i_26_ = -1694498816;
						}
						class124.anIntArray1519[i_15_] = (i_26_ | Class381.method6408(method15351((is_8_[i_15_] >> 8), i_19_), (class163.anInt1776 * -319632409), i_24_, -1932462004));
						if (is_9_ != null)
							class124.aByteArray1524[i_15_] = (byte) i_19_;
					}
					class124.aShortArray1520[i_15_] = (short) is_10_[i_15_];
					class124.aShortArray1515[i_15_] = (short) is_11_[i_15_];
				}
				if (is_9_ != null) {
					class124.anIntArray1521 = new int[class124.aShort1525];
					for (int i_27_ = 0; i_27_ < class124.aShort1525; i_27_++) {
						int i_28_ = i_27_ * 3;
						if (is_9_[i_28_] != 0)
							class124.anIntArray1521[i_27_] = ~0xffffff | is_9_[i_28_] >> 8;
					}
				}
				aClass124ArrayArray9752[i][i_4_] = class124;
			} else {
				boolean bool_29_ = true;
				int i_30_ = -1;
				int i_31_ = -1;
				int i_32_ = -1;
				int i_33_ = -1;
				if (is.length == 6) {
					for (int i_34_ = 0; i_34_ < 6; i_34_++) {
						if (is[i_34_] == 0 && is_6_[i_34_] == 0) {
							if (i_30_ != -1 && is_8_[i_30_] != is_8_[i_34_]) {
								bool_29_ = false;
								break;
							}
							i_30_ = i_34_;
						} else if (is[i_34_] == anInt1682 * 341909049 && is_6_[i_34_] == 0) {
							if (i_31_ != -1 && is_8_[i_31_] != is_8_[i_34_]) {
								bool_29_ = false;
								break;
							}
							i_31_ = i_34_;
						} else if (is[i_34_] == anInt1682 * 341909049 && is_6_[i_34_] == anInt1682 * 341909049) {
							if (i_32_ != -1 && is_8_[i_32_] != is_8_[i_34_]) {
								bool_29_ = false;
								break;
							}
							i_32_ = i_34_;
						} else if (is[i_34_] == 0 && is_6_[i_34_] == anInt1682 * 341909049) {
							if (i_33_ != -1 && is_8_[i_33_] != is_8_[i_34_]) {
								bool_29_ = false;
								break;
							}
							i_33_ = i_34_;
						}
					}
					if (i_30_ == -1 || i_31_ == -1 || i_32_ == -1 || i_33_ == -1)
						bool_29_ = false;
					if (bool_29_) {
						if (is_5_ != null) {
							for (int i_35_ = 0; i_35_ < 4; i_35_++) {
								if (is_5_[i_35_] != 0) {
									bool_29_ = false;
									break;
								}
							}
						}
						if (bool_29_) {
							for (int i_36_ = 1; i_36_ < 4; i_36_++) {
								if (is[i_36_] != is[0] && (is[i_36_] != is[0] + anInt1682 * 341909049) && (is[i_36_] != is[0] - anInt1682 * 341909049)) {
									bool_29_ = false;
									break;
								}
								if (is_6_[i_36_] != is_6_[0] && (is_6_[i_36_] != is_6_[0] + anInt1682 * 341909049) && (is_6_[i_36_] != is_6_[0] - anInt1682 * 341909049)) {
									bool_29_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_29_ = false;
				if (bool_29_) {
					Class106 class106 = new Class106();
					int i_37_ = is_8_[0];
					int i_38_ = is_10_[0];
					if (is_9_ != null) {
						class106.anInt1296 = is_9_[0] >> 8;
						if (i_37_ == 0)
							class106.aByte1292 |= 0x2;
					} else if (i_37_ == 0)
						return;
					if ((anIntArrayArray1684[i][i_4_] == anIntArrayArray1684[i + 1][i_4_]) && (anIntArrayArray1684[i][i_4_] == anIntArrayArray1684[i + 1][i_4_ + 1]) && (anIntArrayArray1684[i][i_4_] == anIntArrayArray1684[i][i_4_ + 1]))
						class106.aByte1292 |= 0x1;
					if (i_38_ != -1 && (class106.aByte1292 & 0x2) == 0 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_38_, -1325132308).aBool1876)) {
						int i_39_;
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_39_ = 255 * is_7_[i_30_] / (class163.anInt1775 * -118212955);
							if (i_39_ < 0)
								i_39_ = 0;
							else if (i_39_ > 255)
								i_39_ = 255;
						} else
							i_39_ = 0;
						class106.anInt1288 = (Class381.method6408(method15351(is_8_[i_30_] >> 8, (aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_])), class163.anInt1776 * -319632409, i_39_, -1800788171));
						if (class106.anInt1296 != 0)
							class106.anInt1288 |= (255 - (aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_]) << 25);
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_39_ = 255 * is_7_[i_31_] / (class163.anInt1775 * -118212955);
							if (i_39_ < 0)
								i_39_ = 0;
							else if (i_39_ > 255)
								i_39_ = 255;
						} else
							i_39_ = 0;
						class106.anInt1287 = (Class381.method6408(method15351(is_8_[i_31_] >> 8, (aByteArrayArray9769[i + 1][i_4_] - (aByteArrayArray9770[i + 1][i_4_]))), class163.anInt1776 * -319632409, i_39_, -1821371949));
						if (class106.anInt1296 != 0)
							class106.anInt1287 |= (255 - (aByteArrayArray9769[i + 1][i_4_] - aByteArrayArray9770[i + 1][i_4_]) << 25);
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_39_ = 255 * is_7_[i_32_] / (class163.anInt1775 * -118212955);
							if (i_39_ < 0)
								i_39_ = 0;
							else if (i_39_ > 255)
								i_39_ = 255;
						} else
							i_39_ = 0;
						class106.anInt1289 = (Class381.method6408(method15351(is_8_[i_32_] >> 8, ((aByteArrayArray9769[i + 1][i_4_ + 1]) - (aByteArrayArray9770[i + 1][i_4_ + 1]))), class163.anInt1776 * -319632409, i_39_, -1230540333));
						if (class106.anInt1296 != 0)
							class106.anInt1289 |= 255 - (aByteArrayArray9769[i + 1][i_4_ + 1] - (aByteArrayArray9770[i + 1][i_4_ + 1])) << 25;
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_39_ = 255 * is_7_[i_33_] / (class163.anInt1775 * -118212955);
							if (i_39_ < 0)
								i_39_ = 0;
							else if (i_39_ > 255)
								i_39_ = 255;
						} else
							i_39_ = 0;
						class106.anInt1291 = (Class381.method6408(method15351(is_8_[i_33_] >> 8, (aByteArrayArray9769[i][i_4_ + 1] - (aByteArrayArray9770[i][i_4_ + 1]))), class163.anInt1776 * -319632409, i_39_, -879406041));
						class106.aShort1297 = (short) i_38_;
					} else {
						int i_40_;
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_40_ = 255 * is_7_[i_30_] / (class163.anInt1775 * -118212955);
							if (i_40_ < 0)
								i_40_ = 0;
							else if (i_40_ > 255)
								i_40_ = 255;
						} else
							i_40_ = 0;
						class106.anInt1288 = (Class381.method6408(method15351(is_8_[i_30_] >> 8, (aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_])), class163.anInt1776 * -319632409, i_40_, -1548271950));
						if (class106.anInt1296 != 0)
							class106.anInt1288 |= (255 - (aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_]) << 25);
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_40_ = 255 * is_7_[i_31_] / (class163.anInt1775 * -118212955);
							if (i_40_ < 0)
								i_40_ = 0;
							else if (i_40_ > 255)
								i_40_ = 255;
						} else
							i_40_ = 0;
						class106.anInt1287 = (Class381.method6408(method15351(is_8_[i_31_] >> 8, (aByteArrayArray9769[i + 1][i_4_] - (aByteArrayArray9770[i + 1][i_4_]))), class163.anInt1776 * -319632409, i_40_, -1753180803));
						if (class106.anInt1296 != 0)
							class106.anInt1287 |= (255 - (aByteArrayArray9769[i + 1][i_4_] - aByteArrayArray9770[i + 1][i_4_]) << 25);
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_40_ = 255 * is_7_[i_32_] / (class163.anInt1775 * -118212955);
							if (i_40_ < 0)
								i_40_ = 0;
							else if (i_40_ > 255)
								i_40_ = 255;
						} else
							i_40_ = 0;
						class106.anInt1289 = (Class381.method6408(method15351(is_8_[i_32_] >> 8, ((aByteArrayArray9769[i + 1][i_4_ + 1]) - (aByteArrayArray9770[i + 1][i_4_ + 1]))), class163.anInt1776 * -319632409, i_40_, -1727122184));
						if (class106.anInt1296 != 0)
							class106.anInt1289 |= 255 - (aByteArrayArray9769[i + 1][i_4_ + 1] - (aByteArrayArray9770[i + 1][i_4_ + 1])) << 25;
						if (is_7_ != null && class163.anInt1775 * -118212955 != 0) {
							i_40_ = 255 * is_7_[i_33_] / (class163.anInt1775 * -118212955);
							if (i_40_ < 0)
								i_40_ = 0;
							else if (i_40_ > 255)
								i_40_ = 255;
						} else
							i_40_ = 0;
						class106.anInt1291 = (Class381.method6408(method15351(is_8_[i_33_] >> 8, (aByteArrayArray9769[i][i_4_ + 1] - (aByteArrayArray9770[i][i_4_ + 1]))), class163.anInt1776 * -319632409, i_40_, -1259544083));
						if (class106.anInt1296 != 0)
							class106.anInt1291 |= (255 - (aByteArrayArray9769[i][i_4_ + 1] - aByteArrayArray9770[i][i_4_ + 1]) << 25);
						class106.aShort1297 = (short) -1;
					}
					if (is_7_ != null) {
						class106.aShort1294 = (short) is_7_[i_32_];
						class106.aShort1295 = (short) is_7_[i_33_];
						class106.aShort1293 = (short) is_7_[i_31_];
						class106.aShort1290 = (short) is_7_[i_30_];
					}
					aClass106ArrayArray9758[i][i_4_] = class106;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1152 = (short) is.length;
					class94.aShort1161 = (short) (is.length / 3);
					class94.aShortArray1154 = new short[class94.aShort1152];
					class94.aShortArray1151 = new short[class94.aShort1152];
					class94.aShortArray1156 = new short[class94.aShort1152];
					class94.anIntArray1158 = new int[class94.aShort1152];
					if (is_7_ != null)
						class94.aShortArray1157 = new short[class94.aShort1152];
					for (int i_41_ = 0; i_41_ < class94.aShort1152; i_41_++) {
						int i_42_ = is[i_41_];
						int i_43_ = is_6_[i_41_];
						boolean bool_44_ = false;
						int i_45_;
						if (i_42_ == 0 && i_43_ == 0)
							i_45_ = (aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_]);
						else if (i_42_ == 0 && i_43_ == anInt1682 * 341909049)
							i_45_ = (aByteArrayArray9769[i][i_4_ + 1] - aByteArrayArray9770[i][i_4_ + 1]);
						else if (i_42_ == anInt1682 * 341909049 && i_43_ == anInt1682 * 341909049)
							i_45_ = (aByteArrayArray9769[i + 1][i_4_ + 1] - aByteArrayArray9770[i + 1][i_4_ + 1]);
						else if (i_42_ == anInt1682 * 341909049 && i_43_ == 0)
							i_45_ = (aByteArrayArray9769[i + 1][i_4_] - aByteArrayArray9770[i + 1][i_4_]);
						else {
							int i_46_ = (((aByteArrayArray9769[i][i_4_] - aByteArrayArray9770[i][i_4_]) * (anInt1682 * 341909049 - i_42_)) + ((aByteArrayArray9769[i + 1][i_4_] - aByteArrayArray9770[i + 1][i_4_]) * i_42_));
							int i_47_ = (((aByteArrayArray9769[i][i_4_ + 1] - aByteArrayArray9770[i][i_4_ + 1]) * (anInt1682 * 341909049 - i_42_)) + ((aByteArrayArray9769[i + 1][i_4_ + 1] - aByteArrayArray9770[i + 1][i_4_ + 1]) * i_42_));
							i_45_ = (i_46_ * (anInt1682 * 341909049 - i_43_) + i_47_ * i_43_) >> anInt1680 * 1908849946;
						}
						int i_48_ = (i << anInt1680 * -1193058675) + i_42_;
						int i_49_ = (i_4_ << anInt1680 * -1193058675) + i_43_;
						class94.aShortArray1154[i_41_] = (short) i_42_;
						class94.aShortArray1156[i_41_] = (short) i_43_;
						class94.aShortArray1151[i_41_] = (short) (method2326(i_48_, i_49_, 1527769331) + (is_5_ != null ? is_5_[i_41_] : 0));
						if (i_45_ < 0)
							i_45_ = 0;
						if (is_8_[i_41_] == 0) {
							if (is_9_ != null)
								class94.anIntArray1158[i_41_] = i_45_ << 25;
							else
								class94.anIntArray1158[i_41_] = 0;
						} else {
							int i_50_ = 0;
							if (is_7_ != null) {
								int i_51_ = (class94.aShortArray1157[i_41_] = (short) is_7_[i_41_]);
								if (class163.anInt1775 * -118212955 != 0) {
									i_50_ = 255 * i_51_ / (class163.anInt1775 * -118212955);
									if (i_50_ < 0)
										i_50_ = 0;
									else if (i_50_ > 255)
										i_50_ = 255;
								}
							}
							class94.anIntArray1158[i_41_] = Class381.method6408(method15351((is_8_[i_41_] >> 8), i_45_), (class163.anInt1776 * -319632409), i_50_, -1101279235);
							if (is_9_ != null)
								class94.anIntArray1158[i_41_] |= i_45_ << 25;
						}
					}
					boolean bool_52_ = false;
					for (int i_53_ = 0; i_53_ < class94.aShort1161; i_53_++) {
						if (is_10_[i_53_ * 3] != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(is_10_[i_53_ * 3], -151674318).aBool1876))
							bool_52_ = true;
					}
					if (is_9_ != null)
						class94.anIntArray1160 = new int[class94.aShort1161];
					if (bool_52_) {
						class94.aShortArray1155 = new short[class94.aShort1161];
						class94.aShortArray1159 = new short[class94.aShort1161];
					}
					for (int i_54_ = 0; i_54_ < class94.aShort1161; i_54_++) {
						int i_55_ = i_54_ * 3;
						if (is_9_ != null && is_9_[i_55_] != 0)
							class94.anIntArray1160[i_54_] = is_9_[i_55_] >> 8;
						if (bool_52_) {
							int i_56_ = i_55_ + 1;
							int i_57_ = i_56_ + 1;
							boolean bool_58_ = false;
							boolean bool_59_ = true;
							int i_60_ = is_10_[i_55_];
							if (i_60_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -297979988).aBool1876))
								bool_59_ = false;
							else
								bool_58_ = true;
							i_60_ = is_10_[i_56_];
							if (i_60_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -1050892403).aBool1876))
								bool_59_ = false;
							else
								bool_58_ = true;
							i_60_ = is_10_[i_57_];
							if (i_60_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -1849488864).aBool1876))
								bool_59_ = false;
							else
								bool_58_ = true;
							if (bool_59_) {
								class94.aShortArray1155[i_54_] = (short) i_60_;
								class94.aShortArray1159[i_54_] = (short) is_11_[i_55_];
							} else {
								if (bool_58_) {
									i_60_ = is_10_[i_55_];
									if (i_60_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, 543271099).aBool1876))
										class94.anIntArray1158[i_55_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -1545369961).aShort1907) & 0xffff, -879262451)) & 0xffff]);
									i_60_ = is_10_[i_56_];
									if (i_60_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -1275194600).aBool1876))
										class94.anIntArray1158[i_56_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -755885633).aShort1907) & 0xffff, 687693288)) & 0xffff]);
									i_60_ = is_10_[i_57_];
									if (i_60_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -1873394371).aBool1876))
										class94.anIntArray1158[i_57_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_60_, -1927075536).aShort1907) & 0xffff, 102755408)) & 0xffff]);
								}
								class94.aShortArray1155[i_54_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9751[i][i_4_] = class94;
				}
			}
		}
	}

	public void method2351(int i, int i_61_, int[] is, int[] is_62_, int[] is_63_, int[] is_64_, int[] is_65_, int[] is_66_, int[] is_67_, int[] is_68_, Class163 class163, boolean bool) {
		boolean bool_69_ = (anInt9759 & 0x20) == 0;
		if (aClass106ArrayArray9758 == null && !bool_69_) {
			aClass106ArrayArray9758 = new Class106[anInt1683 * 692304099][anInt1681 * 452998539];
			aClass94ArrayArray9751 = new Class94[anInt1683 * 692304099][anInt1681 * 452998539];
		} else if (aClass124ArrayArray9752 == null && bool_69_)
			aClass124ArrayArray9752 = new Class124[anInt1683 * 692304099][anInt1681 * 452998539];
		else if (aClass129ArrayArray9747 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_70_ = 0; i_70_ < is_65_.length; i_70_++) {
				if (is_65_[i_70_] == -1)
					is_65_[i_70_] = 0;
				else
					is_65_[i_70_] = (Class638.anIntArray8306[(Class493.method8085(is_65_[i_70_], 925378435) & 0xffff)]) << 8 | 0xff;
			}
			if (is_66_ != null) {
				for (int i_71_ = 0; i_71_ < is_66_.length; i_71_++) {
					if (is_66_[i_71_] == -1)
						is_66_[i_71_] = 0;
					else
						is_66_[i_71_] = (Class638.anIntArray8306[(Class493.method8085(is_66_[i_71_], -275574419) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_69_) {
				Class124 class124 = new Class124();
				class124.aShort1516 = (short) is.length;
				class124.aShort1525 = (short) (is.length / 3);
				class124.aShortArray1517 = new short[class124.aShort1516];
				class124.aShortArray1518 = new short[class124.aShort1516];
				class124.aShortArray1522 = new short[class124.aShort1516];
				class124.anIntArray1519 = new int[class124.aShort1516];
				class124.aShortArray1520 = new short[class124.aShort1516];
				class124.aShortArray1515 = new short[class124.aShort1516];
				class124.aByteArray1524 = new byte[class124.aShort1516];
				if (is_64_ != null)
					class124.aShortArray1523 = new short[class124.aShort1516];
				for (int i_72_ = 0; i_72_ < class124.aShort1516; i_72_++) {
					int i_73_ = is[i_72_];
					int i_74_ = is_63_[i_72_];
					boolean bool_75_ = false;
					int i_76_;
					if (i_73_ == 0 && i_74_ == 0)
						i_76_ = (aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_]);
					else if (i_73_ == 0 && i_74_ == anInt1682 * 341909049)
						i_76_ = (aByteArrayArray9769[i][i_61_ + 1] - aByteArrayArray9770[i][i_61_ + 1]);
					else if (i_73_ == anInt1682 * 341909049 && i_74_ == anInt1682 * 341909049)
						i_76_ = (aByteArrayArray9769[i + 1][i_61_ + 1] - aByteArrayArray9770[i + 1][i_61_ + 1]);
					else if (i_73_ == anInt1682 * 341909049 && i_74_ == 0)
						i_76_ = (aByteArrayArray9769[i + 1][i_61_] - aByteArrayArray9770[i + 1][i_61_]);
					else {
						int i_77_ = (((aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_]) * (anInt1682 * 341909049 - i_73_)) + ((aByteArrayArray9769[i + 1][i_61_] - aByteArrayArray9770[i + 1][i_61_]) * i_73_));
						int i_78_ = (((aByteArrayArray9769[i][i_61_ + 1] - aByteArrayArray9770[i][i_61_ + 1]) * (anInt1682 * 341909049 - i_73_)) + ((aByteArrayArray9769[i + 1][i_61_ + 1] - aByteArrayArray9770[i + 1][i_61_ + 1]) * i_73_));
						i_76_ = (i_77_ * (anInt1682 * 341909049 - i_74_) + i_78_ * i_74_) >> anInt1680 * 1908849946;
					}
					int i_79_ = (i << anInt1680 * -1193058675) + i_73_;
					int i_80_ = (i_61_ << anInt1680 * -1193058675) + i_74_;
					class124.aShortArray1517[i_72_] = (short) i_73_;
					class124.aShortArray1522[i_72_] = (short) i_74_;
					class124.aShortArray1518[i_72_] = (short) (method2326(i_79_, i_80_, -1653240008) + (is_62_ != null ? is_62_[i_72_] : 0));
					if (i_76_ < 0)
						i_76_ = 0;
					if (is_65_[i_72_] == 0) {
						class124.anIntArray1519[i_72_] = 0;
						if (is_66_ != null)
							class124.aByteArray1524[i_72_] = (byte) i_76_;
					} else {
						int i_81_ = 0;
						if (is_64_ != null) {
							int i_82_ = (class124.aShortArray1523[i_72_] = (short) is_64_[i_72_]);
							if (class163.anInt1775 * -118212955 != 0) {
								i_81_ = 255 * i_82_ / (class163.anInt1775 * -118212955);
								if (i_81_ < 0)
									i_81_ = 0;
								else if (i_81_ > 255)
									i_81_ = 255;
							}
						}
						int i_83_ = -16777216;
						if (is_67_[i_72_] != -1) {
							Class177 class177 = aClass178_Sub3_9746.aClass172_1916.method2895(is_67_[i_72_], -849321488);
							if (class177.aBool1881 && method15364(class177.aByte1905))
								i_83_ = -1694498816;
						}
						class124.anIntArray1519[i_72_] = (i_83_ | Class381.method6408(method15351((is_65_[i_72_] >> 8), i_76_), (class163.anInt1776 * -319632409), i_81_, -777992742));
						if (is_66_ != null)
							class124.aByteArray1524[i_72_] = (byte) i_76_;
					}
					class124.aShortArray1520[i_72_] = (short) is_67_[i_72_];
					class124.aShortArray1515[i_72_] = (short) is_68_[i_72_];
				}
				if (is_66_ != null) {
					class124.anIntArray1521 = new int[class124.aShort1525];
					for (int i_84_ = 0; i_84_ < class124.aShort1525; i_84_++) {
						int i_85_ = i_84_ * 3;
						if (is_66_[i_85_] != 0)
							class124.anIntArray1521[i_84_] = ~0xffffff | is_66_[i_85_] >> 8;
					}
				}
				aClass124ArrayArray9752[i][i_61_] = class124;
			} else {
				boolean bool_86_ = true;
				int i_87_ = -1;
				int i_88_ = -1;
				int i_89_ = -1;
				int i_90_ = -1;
				if (is.length == 6) {
					for (int i_91_ = 0; i_91_ < 6; i_91_++) {
						if (is[i_91_] == 0 && is_63_[i_91_] == 0) {
							if (i_87_ != -1 && is_65_[i_87_] != is_65_[i_91_]) {
								bool_86_ = false;
								break;
							}
							i_87_ = i_91_;
						} else if (is[i_91_] == anInt1682 * 341909049 && is_63_[i_91_] == 0) {
							if (i_88_ != -1 && is_65_[i_88_] != is_65_[i_91_]) {
								bool_86_ = false;
								break;
							}
							i_88_ = i_91_;
						} else if (is[i_91_] == anInt1682 * 341909049 && is_63_[i_91_] == anInt1682 * 341909049) {
							if (i_89_ != -1 && is_65_[i_89_] != is_65_[i_91_]) {
								bool_86_ = false;
								break;
							}
							i_89_ = i_91_;
						} else if (is[i_91_] == 0 && is_63_[i_91_] == anInt1682 * 341909049) {
							if (i_90_ != -1 && is_65_[i_90_] != is_65_[i_91_]) {
								bool_86_ = false;
								break;
							}
							i_90_ = i_91_;
						}
					}
					if (i_87_ == -1 || i_88_ == -1 || i_89_ == -1 || i_90_ == -1)
						bool_86_ = false;
					if (bool_86_) {
						if (is_62_ != null) {
							for (int i_92_ = 0; i_92_ < 4; i_92_++) {
								if (is_62_[i_92_] != 0) {
									bool_86_ = false;
									break;
								}
							}
						}
						if (bool_86_) {
							for (int i_93_ = 1; i_93_ < 4; i_93_++) {
								if (is[i_93_] != is[0] && (is[i_93_] != is[0] + anInt1682 * 341909049) && (is[i_93_] != is[0] - anInt1682 * 341909049)) {
									bool_86_ = false;
									break;
								}
								if (is_63_[i_93_] != is_63_[0] && (is_63_[i_93_] != is_63_[0] + anInt1682 * 341909049) && (is_63_[i_93_] != (is_63_[0] - anInt1682 * 341909049))) {
									bool_86_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_86_ = false;
				if (bool_86_) {
					Class106 class106 = new Class106();
					int i_94_ = is_65_[0];
					int i_95_ = is_67_[0];
					if (is_66_ != null) {
						class106.anInt1296 = is_66_[0] >> 8;
						if (i_94_ == 0)
							class106.aByte1292 |= 0x2;
					} else if (i_94_ == 0)
						return;
					if ((anIntArrayArray1684[i][i_61_] == anIntArrayArray1684[i + 1][i_61_]) && (anIntArrayArray1684[i][i_61_] == anIntArrayArray1684[i + 1][i_61_ + 1]) && (anIntArrayArray1684[i][i_61_] == anIntArrayArray1684[i][i_61_ + 1]))
						class106.aByte1292 |= 0x1;
					if (i_95_ != -1 && (class106.aByte1292 & 0x2) == 0 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_95_, -2014123914).aBool1876)) {
						int i_96_;
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_96_ = 255 * is_64_[i_87_] / (class163.anInt1775 * -118212955);
							if (i_96_ < 0)
								i_96_ = 0;
							else if (i_96_ > 255)
								i_96_ = 255;
						} else
							i_96_ = 0;
						class106.anInt1288 = (Class381.method6408(method15351(is_65_[i_87_] >> 8, (aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_])), class163.anInt1776 * -319632409, i_96_, -859640314));
						if (class106.anInt1296 != 0)
							class106.anInt1288 |= (255 - (aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_]) << 25);
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_96_ = 255 * is_64_[i_88_] / (class163.anInt1775 * -118212955);
							if (i_96_ < 0)
								i_96_ = 0;
							else if (i_96_ > 255)
								i_96_ = 255;
						} else
							i_96_ = 0;
						class106.anInt1287 = (Class381.method6408(method15351(is_65_[i_88_] >> 8, (aByteArrayArray9769[i + 1][i_61_] - (aByteArrayArray9770[i + 1][i_61_]))), class163.anInt1776 * -319632409, i_96_, -1614329428));
						if (class106.anInt1296 != 0)
							class106.anInt1287 |= (255 - (aByteArrayArray9769[i + 1][i_61_] - aByteArrayArray9770[i + 1][i_61_]) << 25);
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_96_ = 255 * is_64_[i_89_] / (class163.anInt1775 * -118212955);
							if (i_96_ < 0)
								i_96_ = 0;
							else if (i_96_ > 255)
								i_96_ = 255;
						} else
							i_96_ = 0;
						class106.anInt1289 = (Class381.method6408(method15351(is_65_[i_89_] >> 8, ((aByteArrayArray9769[i + 1][i_61_ + 1]) - (aByteArrayArray9770[i + 1][i_61_ + 1]))), class163.anInt1776 * -319632409, i_96_, -820711626));
						if (class106.anInt1296 != 0)
							class106.anInt1289 |= 255 - (aByteArrayArray9769[i + 1][i_61_ + 1] - (aByteArrayArray9770[i + 1][i_61_ + 1])) << 25;
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_96_ = 255 * is_64_[i_90_] / (class163.anInt1775 * -118212955);
							if (i_96_ < 0)
								i_96_ = 0;
							else if (i_96_ > 255)
								i_96_ = 255;
						} else
							i_96_ = 0;
						class106.anInt1291 = (Class381.method6408(method15351(is_65_[i_90_] >> 8, (aByteArrayArray9769[i][i_61_ + 1] - (aByteArrayArray9770[i][i_61_ + 1]))), class163.anInt1776 * -319632409, i_96_, -851562227));
						class106.aShort1297 = (short) i_95_;
					} else {
						int i_97_;
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_97_ = 255 * is_64_[i_87_] / (class163.anInt1775 * -118212955);
							if (i_97_ < 0)
								i_97_ = 0;
							else if (i_97_ > 255)
								i_97_ = 255;
						} else
							i_97_ = 0;
						class106.anInt1288 = (Class381.method6408(method15351(is_65_[i_87_] >> 8, (aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_])), class163.anInt1776 * -319632409, i_97_, -1265175988));
						if (class106.anInt1296 != 0)
							class106.anInt1288 |= (255 - (aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_]) << 25);
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_97_ = 255 * is_64_[i_88_] / (class163.anInt1775 * -118212955);
							if (i_97_ < 0)
								i_97_ = 0;
							else if (i_97_ > 255)
								i_97_ = 255;
						} else
							i_97_ = 0;
						class106.anInt1287 = (Class381.method6408(method15351(is_65_[i_88_] >> 8, (aByteArrayArray9769[i + 1][i_61_] - (aByteArrayArray9770[i + 1][i_61_]))), class163.anInt1776 * -319632409, i_97_, -1146582100));
						if (class106.anInt1296 != 0)
							class106.anInt1287 |= (255 - (aByteArrayArray9769[i + 1][i_61_] - aByteArrayArray9770[i + 1][i_61_]) << 25);
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_97_ = 255 * is_64_[i_89_] / (class163.anInt1775 * -118212955);
							if (i_97_ < 0)
								i_97_ = 0;
							else if (i_97_ > 255)
								i_97_ = 255;
						} else
							i_97_ = 0;
						class106.anInt1289 = (Class381.method6408(method15351(is_65_[i_89_] >> 8, ((aByteArrayArray9769[i + 1][i_61_ + 1]) - (aByteArrayArray9770[i + 1][i_61_ + 1]))), class163.anInt1776 * -319632409, i_97_, -1799375822));
						if (class106.anInt1296 != 0)
							class106.anInt1289 |= 255 - (aByteArrayArray9769[i + 1][i_61_ + 1] - (aByteArrayArray9770[i + 1][i_61_ + 1])) << 25;
						if (is_64_ != null && class163.anInt1775 * -118212955 != 0) {
							i_97_ = 255 * is_64_[i_90_] / (class163.anInt1775 * -118212955);
							if (i_97_ < 0)
								i_97_ = 0;
							else if (i_97_ > 255)
								i_97_ = 255;
						} else
							i_97_ = 0;
						class106.anInt1291 = (Class381.method6408(method15351(is_65_[i_90_] >> 8, (aByteArrayArray9769[i][i_61_ + 1] - (aByteArrayArray9770[i][i_61_ + 1]))), class163.anInt1776 * -319632409, i_97_, -1294368898));
						if (class106.anInt1296 != 0)
							class106.anInt1291 |= (255 - (aByteArrayArray9769[i][i_61_ + 1] - aByteArrayArray9770[i][i_61_ + 1]) << 25);
						class106.aShort1297 = (short) -1;
					}
					if (is_64_ != null) {
						class106.aShort1294 = (short) is_64_[i_89_];
						class106.aShort1295 = (short) is_64_[i_90_];
						class106.aShort1293 = (short) is_64_[i_88_];
						class106.aShort1290 = (short) is_64_[i_87_];
					}
					aClass106ArrayArray9758[i][i_61_] = class106;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1152 = (short) is.length;
					class94.aShort1161 = (short) (is.length / 3);
					class94.aShortArray1154 = new short[class94.aShort1152];
					class94.aShortArray1151 = new short[class94.aShort1152];
					class94.aShortArray1156 = new short[class94.aShort1152];
					class94.anIntArray1158 = new int[class94.aShort1152];
					if (is_64_ != null)
						class94.aShortArray1157 = new short[class94.aShort1152];
					for (int i_98_ = 0; i_98_ < class94.aShort1152; i_98_++) {
						int i_99_ = is[i_98_];
						int i_100_ = is_63_[i_98_];
						boolean bool_101_ = false;
						int i_102_;
						if (i_99_ == 0 && i_100_ == 0)
							i_102_ = (aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_]);
						else if (i_99_ == 0 && i_100_ == anInt1682 * 341909049)
							i_102_ = (aByteArrayArray9769[i][i_61_ + 1] - aByteArrayArray9770[i][i_61_ + 1]);
						else if (i_99_ == anInt1682 * 341909049 && i_100_ == anInt1682 * 341909049)
							i_102_ = (aByteArrayArray9769[i + 1][i_61_ + 1] - aByteArrayArray9770[i + 1][i_61_ + 1]);
						else if (i_99_ == anInt1682 * 341909049 && i_100_ == 0)
							i_102_ = (aByteArrayArray9769[i + 1][i_61_] - aByteArrayArray9770[i + 1][i_61_]);
						else {
							int i_103_ = (((aByteArrayArray9769[i][i_61_] - aByteArrayArray9770[i][i_61_]) * (anInt1682 * 341909049 - i_99_)) + ((aByteArrayArray9769[i + 1][i_61_] - aByteArrayArray9770[i + 1][i_61_]) * i_99_));
							int i_104_ = (((aByteArrayArray9769[i][i_61_ + 1] - aByteArrayArray9770[i][i_61_ + 1]) * (anInt1682 * 341909049 - i_99_)) + ((aByteArrayArray9769[i + 1][i_61_ + 1] - aByteArrayArray9770[i + 1][i_61_ + 1]) * i_99_));
							i_102_ = (i_103_ * (anInt1682 * 341909049 - i_100_) + i_104_ * i_100_ >> anInt1680 * 1908849946);
						}
						int i_105_ = (i << anInt1680 * -1193058675) + i_99_;
						int i_106_ = (i_61_ << anInt1680 * -1193058675) + i_100_;
						class94.aShortArray1154[i_98_] = (short) i_99_;
						class94.aShortArray1156[i_98_] = (short) i_100_;
						class94.aShortArray1151[i_98_] = (short) (method2326(i_105_, i_106_, -113163846) + (is_62_ != null ? is_62_[i_98_] : 0));
						if (i_102_ < 0)
							i_102_ = 0;
						if (is_65_[i_98_] == 0) {
							if (is_66_ != null)
								class94.anIntArray1158[i_98_] = i_102_ << 25;
							else
								class94.anIntArray1158[i_98_] = 0;
						} else {
							int i_107_ = 0;
							if (is_64_ != null) {
								int i_108_ = (class94.aShortArray1157[i_98_] = (short) is_64_[i_98_]);
								if (class163.anInt1775 * -118212955 != 0) {
									i_107_ = 255 * i_108_ / (class163.anInt1775 * -118212955);
									if (i_107_ < 0)
										i_107_ = 0;
									else if (i_107_ > 255)
										i_107_ = 255;
								}
							}
							class94.anIntArray1158[i_98_] = (Class381.method6408(method15351(is_65_[i_98_] >> 8, i_102_), class163.anInt1776 * -319632409, i_107_, -2131474566));
							if (is_66_ != null)
								class94.anIntArray1158[i_98_] |= i_102_ << 25;
						}
					}
					boolean bool_109_ = false;
					for (int i_110_ = 0; i_110_ < class94.aShort1161; i_110_++) {
						if (is_67_[i_110_ * 3] != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(is_67_[i_110_ * 3], -555886768).aBool1876))
							bool_109_ = true;
					}
					if (is_66_ != null)
						class94.anIntArray1160 = new int[class94.aShort1161];
					if (bool_109_) {
						class94.aShortArray1155 = new short[class94.aShort1161];
						class94.aShortArray1159 = new short[class94.aShort1161];
					}
					for (int i_111_ = 0; i_111_ < class94.aShort1161; i_111_++) {
						int i_112_ = i_111_ * 3;
						if (is_66_ != null && is_66_[i_112_] != 0)
							class94.anIntArray1160[i_111_] = is_66_[i_112_] >> 8;
						if (bool_109_) {
							int i_113_ = i_112_ + 1;
							int i_114_ = i_113_ + 1;
							boolean bool_115_ = false;
							boolean bool_116_ = true;
							int i_117_ = is_67_[i_112_];
							if (i_117_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -271148637).aBool1876))
								bool_116_ = false;
							else
								bool_115_ = true;
							i_117_ = is_67_[i_113_];
							if (i_117_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -706276804).aBool1876))
								bool_116_ = false;
							else
								bool_115_ = true;
							i_117_ = is_67_[i_114_];
							if (i_117_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -34377762).aBool1876))
								bool_116_ = false;
							else
								bool_115_ = true;
							if (bool_116_) {
								class94.aShortArray1155[i_111_] = (short) i_117_;
								class94.aShortArray1159[i_111_] = (short) is_68_[i_112_];
							} else {
								if (bool_115_) {
									i_117_ = is_67_[i_112_];
									if (i_117_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -1145208433).aBool1876))
										class94.anIntArray1158[i_112_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -1878570514).aShort1907) & 0xffff, 556765142)) & 0xffff]);
									i_117_ = is_67_[i_113_];
									if (i_117_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -1044850274).aBool1876))
										class94.anIntArray1158[i_113_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -921747928).aShort1907) & 0xffff, 820568056)) & 0xffff]);
									i_117_ = is_67_[i_114_];
									if (i_117_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -903023652).aBool1876))
										class94.anIntArray1158[i_114_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_117_, -1579568637).aShort1907) & 0xffff, 774248893)) & 0xffff]);
								}
								class94.aShortArray1155[i_111_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9751[i][i_61_] = class94;
				}
			}
		}
	}

	static int method15351(int i, int i_118_) {
		int i_119_ = (i & 0xff0000) * i_118_ >> 23;
		if (i_119_ < 2)
			i_119_ = 2;
		else if (i_119_ > 253)
			i_119_ = 253;
		int i_120_ = (i & 0xff00) * i_118_ >> 15;
		if (i_120_ < 2)
			i_120_ = 2;
		else if (i_120_ > 253)
			i_120_ = 253;
		int i_121_ = (i & 0xff) * i_118_ >> 7;
		if (i_121_ < 2)
			i_121_ = 2;
		else if (i_121_ > 253)
			i_121_ = 253;
		return i_119_ << 16 | i_120_ << 8 | i_121_;
	}

	public void method2347() {
		aByteArrayArray9769 = null;
		aByteArrayArray9770 = null;
	}

	public void method2322(int i, int i_122_, int i_123_, boolean[][] bools, boolean bool, int i_124_) {
		if (aClass178_Sub3_9746.anIntArray9804 == null || aClass178_Sub3_9746.aFloatArray9807 == null)
			throw new IllegalStateException("");
		Class441 class441 = aClass178_Sub3_9746.aClass441_9821;
		aFloat9753 = class441.aFloatArray4916[0];
		aFloat9771 = class441.aFloatArray4916[1];
		aFloat9755 = class441.aFloatArray4916[2];
		aFloat9756 = class441.aFloatArray4916[3];
		aFloat9757 = class441.aFloatArray4916[4];
		aFloat9748 = class441.aFloatArray4916[5];
		aFloat9773 = class441.aFloatArray4916[6];
		aFloat9754 = class441.aFloatArray4916[7];
		aFloat9741 = class441.aFloatArray4916[8];
		aFloat9762 = class441.aFloatArray4916[9];
		aFloat9750 = class441.aFloatArray4916[10];
		aFloat9764 = class441.aFloatArray4916[11];
		aFloat9765 = class441.aFloatArray4916[12];
		aFloat9761 = class441.aFloatArray4916[13];
		aFloat9767 = class441.aFloatArray4916[14];
		aFloat9768 = class441.aFloatArray4916[15];
		for (int i_125_ = 0; i_125_ < i_123_ + i_123_; i_125_++) {
			for (int i_126_ = 0; i_126_ < i_123_ + i_123_; i_126_++) {
				if (bools[i_125_][i_126_]) {
					int i_127_ = i - i_123_ + i_125_;
					int i_128_ = i_122_ - i_123_ + i_126_;
					if (i_127_ >= 0 && i_127_ < anInt1683 * 692304099 && i_128_ >= 0 && i_128_ < anInt1681 * 452998539)
						method15352(i_127_, i_128_, i_124_);
				}
			}
		}
	}

	void method15352(int i, int i_129_, int i_130_) {
		Class99 class99 = aClass178_Sub3_9746.method15475(Thread.currentThread());
		class99.aClass118_1200.anInt1438 = 0;
		if (aClass106ArrayArray9758 != null)
			method15354(i, i_129_, class99.aBool1204, class99, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_130_);
		else if (aClass129ArrayArray9747 != null)
			method15353(i, i_129_, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_130_);
		else if (aClass124ArrayArray9752 != null)
			method15355(i, i_129_, class99.aBool1204, class99, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_130_);
	}

	void method15353(int i, int i_131_, Class118 class118, float[] fs, float[] fs_132_, float[] fs_133_, float[] fs_134_, float[] fs_135_, int i_136_) {
		Class129 class129 = aClass129ArrayArray9747[i][i_131_];
		if (class129 != null) {
			if ((class129.aByte1550 & 0x2) == 0) {
				if (i_136_ != 0) {
					if ((class129.aByte1550 & 0x4) != 0) {
						if ((i_136_ & 0x1) != 0)
							return;
					} else if ((i_136_ & 0x2) != 0)
						return;
				}
				int i_137_ = i * (anInt1682 * 341909049);
				int i_138_ = i_137_ + anInt1682 * 341909049;
				int i_139_ = i_131_ * (anInt1682 * 341909049);
				int i_140_ = i_139_ + anInt1682 * 341909049;
				float f;
				float f_141_;
				float f_142_;
				float f_143_;
				float f_144_;
				float f_145_;
				float f_146_;
				float f_147_;
				float f_148_;
				float f_149_;
				float f_150_;
				float f_151_;
				float f_152_;
				float f_153_;
				float f_154_;
				float f_155_;
				if ((class129.aByte1550 & 0x1) != 0) {
					int i_156_ = anIntArrayArray1684[i][i_131_];
					float f_157_ = aFloat9773 * (float) i_156_;
					float f_158_ = aFloat9754 * (float) i_156_;
					float f_159_ = aFloat9767 + (aFloat9755 * (float) i_137_ + f_157_ + aFloat9750 * (float) i_139_);
					f = aFloat9768 + (aFloat9756 * (float) i_137_ + f_158_ + aFloat9764 * (float) i_139_);
					if (f_159_ < -f)
						return;
					float f_160_ = aFloat9767 + (aFloat9755 * (float) i_138_ + f_157_ + aFloat9750 * (float) i_139_);
					f_141_ = aFloat9768 + (aFloat9756 * (float) i_138_ + f_158_ + aFloat9764 * (float) i_139_);
					if (f_160_ < -f_141_)
						return;
					float f_161_ = aFloat9767 + (aFloat9755 * (float) i_138_ + f_157_ + aFloat9750 * (float) i_140_);
					f_142_ = aFloat9768 + (aFloat9756 * (float) i_138_ + f_158_ + aFloat9764 * (float) i_140_);
					if (f_161_ < -f_142_)
						return;
					float f_162_ = aFloat9767 + (aFloat9755 * (float) i_137_ + f_157_ + aFloat9750 * (float) i_140_);
					f_143_ = aFloat9768 + (aFloat9756 * (float) i_137_ + f_158_ + aFloat9764 * (float) i_140_);
					if (f_162_ < -f_143_)
						return;
					float f_163_ = aFloat9757 * (float) i_156_;
					float f_164_ = aFloat9748 * (float) i_156_;
					float f_165_ = aFloat9765 + (aFloat9753 * (float) i_137_ + f_163_ + aFloat9741 * (float) i_139_);
					f_144_ = (class118.aFloat1442 + class118.aFloat1469 * f_165_ / f);
					float f_166_ = aFloat9761 + (aFloat9771 * (float) i_137_ + f_164_ + aFloat9762 * (float) i_139_);
					f_145_ = (class118.aFloat1473 + class118.aFloat1444 * f_166_ / f);
					f_146_ = (class118.aFloat1458 + class118.aFloat1447 * f_159_ / f);
					float f_167_ = aFloat9765 + (aFloat9753 * (float) i_138_ + f_163_ + aFloat9741 * (float) i_139_);
					f_147_ = (class118.aFloat1442 + class118.aFloat1469 * f_167_ / f_141_);
					float f_168_ = aFloat9761 + (aFloat9771 * (float) i_138_ + f_164_ + aFloat9762 * (float) i_139_);
					f_148_ = (class118.aFloat1473 + class118.aFloat1444 * f_168_ / f_141_);
					f_149_ = (class118.aFloat1458 + class118.aFloat1447 * f_160_ / f_141_);
					float f_169_ = aFloat9765 + (aFloat9753 * (float) i_138_ + f_163_ + aFloat9741 * (float) i_140_);
					f_150_ = (class118.aFloat1442 + class118.aFloat1469 * f_169_ / f_142_);
					float f_170_ = aFloat9761 + (aFloat9771 * (float) i_138_ + f_164_ + aFloat9762 * (float) i_140_);
					f_151_ = (class118.aFloat1473 + class118.aFloat1444 * f_170_ / f_142_);
					f_152_ = (class118.aFloat1458 + class118.aFloat1447 * f_161_ / f_142_);
					float f_171_ = aFloat9765 + (aFloat9753 * (float) i_137_ + f_163_ + aFloat9741 * (float) i_140_);
					f_153_ = (class118.aFloat1442 + class118.aFloat1469 * f_171_ / f_143_);
					float f_172_ = aFloat9761 + (aFloat9771 * (float) i_137_ + f_164_ + aFloat9762 * (float) i_140_);
					f_154_ = (class118.aFloat1473 + class118.aFloat1444 * f_172_ / f_143_);
					f_155_ = (class118.aFloat1458 + class118.aFloat1447 * f_162_ / f_143_);
				} else {
					int i_173_ = anIntArrayArray1684[i][i_131_];
					int i_174_ = anIntArrayArray1684[i + 1][i_131_];
					int i_175_ = anIntArrayArray1684[i + 1][i_131_ + 1];
					int i_176_ = anIntArrayArray1684[i][i_131_ + 1];
					float f_177_ = aFloat9767 + (aFloat9755 * (float) i_137_ + aFloat9773 * (float) i_173_ + aFloat9750 * (float) i_139_);
					f = aFloat9768 + (aFloat9756 * (float) i_137_ + aFloat9754 * (float) i_173_ + aFloat9764 * (float) i_139_);
					if (f_177_ < -f)
						return;
					float f_178_ = aFloat9767 + (aFloat9755 * (float) i_138_ + aFloat9773 * (float) i_174_ + aFloat9750 * (float) i_139_);
					f_141_ = aFloat9768 + (aFloat9756 * (float) i_138_ + aFloat9754 * (float) i_174_ + aFloat9764 * (float) i_139_);
					if (f_178_ < -f_141_)
						return;
					float f_179_ = aFloat9767 + (aFloat9755 * (float) i_138_ + aFloat9773 * (float) i_175_ + aFloat9750 * (float) i_140_);
					f_142_ = aFloat9768 + (aFloat9756 * (float) i_138_ + aFloat9754 * (float) i_175_ + aFloat9764 * (float) i_140_);
					if (f_179_ < -f_142_)
						return;
					float f_180_ = aFloat9767 + (aFloat9755 * (float) i_137_ + aFloat9773 * (float) i_176_ + aFloat9750 * (float) i_140_);
					f_143_ = aFloat9768 + (aFloat9756 * (float) i_137_ + aFloat9754 * (float) i_176_ + aFloat9764 * (float) i_140_);
					if (f_180_ < -f_143_)
						return;
					float f_181_ = aFloat9765 + (aFloat9753 * (float) i_137_ + aFloat9757 * (float) i_173_ + aFloat9741 * (float) i_139_);
					f_144_ = (class118.aFloat1442 + class118.aFloat1469 * f_181_ / f);
					float f_182_ = aFloat9761 + (aFloat9771 * (float) i_137_ + aFloat9748 * (float) i_173_ + aFloat9762 * (float) i_139_);
					f_145_ = (class118.aFloat1473 + class118.aFloat1444 * f_182_ / f);
					f_146_ = (class118.aFloat1458 + class118.aFloat1447 * f_177_ / f);
					float f_183_ = aFloat9765 + (aFloat9753 * (float) i_138_ + aFloat9757 * (float) i_174_ + aFloat9741 * (float) i_139_);
					f_147_ = (class118.aFloat1442 + class118.aFloat1469 * f_183_ / f_141_);
					float f_184_ = aFloat9761 + (aFloat9771 * (float) i_138_ + aFloat9748 * (float) i_174_ + aFloat9762 * (float) i_139_);
					f_148_ = (class118.aFloat1473 + class118.aFloat1444 * f_184_ / f_141_);
					f_149_ = (class118.aFloat1458 + class118.aFloat1447 * f_178_ / f_141_);
					float f_185_ = aFloat9765 + (aFloat9753 * (float) i_138_ + aFloat9757 * (float) i_175_ + aFloat9741 * (float) i_140_);
					f_150_ = (class118.aFloat1442 + class118.aFloat1469 * f_185_ / f_142_);
					float f_186_ = aFloat9761 + (aFloat9771 * (float) i_138_ + aFloat9748 * (float) i_175_ + aFloat9762 * (float) i_140_);
					f_151_ = (class118.aFloat1473 + class118.aFloat1444 * f_186_ / f_142_);
					f_152_ = (class118.aFloat1458 + class118.aFloat1447 * f_179_ / f_142_);
					float f_187_ = aFloat9765 + (aFloat9753 * (float) i_137_ + aFloat9757 * (float) i_176_ + aFloat9741 * (float) i_140_);
					f_153_ = (class118.aFloat1442 + class118.aFloat1469 * f_187_ / f_143_);
					float f_188_ = aFloat9761 + (aFloat9771 * (float) i_137_ + aFloat9748 * (float) i_176_ + aFloat9762 * (float) i_140_);
					f_154_ = (class118.aFloat1473 + class118.aFloat1444 * f_188_ / f_143_);
					f_155_ = (class118.aFloat1458 + class118.aFloat1447 * f_180_ / f_143_);
				}
				boolean bool = false;
				if (class129.aShort1552 != -1) {
					Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class129.aShort1552 & 0xffff, -323715710));
					bool = class177.aBool1881;
				}
				if (((f_150_ - f_153_) * (f_148_ - f_154_) - (f_151_ - f_154_) * (f_147_ - f_153_)) > 0.0F) {
					class118.aBool1455 = (f_150_ < 0.0F || f_153_ < 0.0F || f_147_ < 0.0F || f_150_ > (float) class118.anInt1448 || f_153_ > (float) class118.anInt1448 || f_147_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_151_, f_154_, f_148_, f_150_, f_153_, f_147_, f_152_, f_155_, f_149_, f_142_, f_143_, f_141_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1549 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_151_, f_154_, f_148_, f_150_, f_153_, f_147_, f_152_, f_155_, f_149_, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
				}
				if (((f_144_ - f_147_) * (f_154_ - f_148_) - (f_145_ - f_148_) * (f_153_ - f_147_)) > 0.0F) {
					class118.aBool1455 = (f_144_ < 0.0F || f_147_ < 0.0F || f_153_ < 0.0F || f_144_ > (float) class118.anInt1448 || f_147_ > (float) class118.anInt1448 || f_153_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_145_, f_148_, f_154_, f_144_, f_147_, f_153_, f_146_, f_149_, f_155_, f, f_141_, f_143_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1547 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_145_, f_148_, f_154_, f_144_, f_147_, f_153_, f_146_, f_149_, f_155_, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
				}
			}
		} else {
			Class107 class107 = aClass107ArrayArray9749[i][i_131_];
			if (class107 != null) {
				if (i_136_ != 0) {
					if ((class107.aByte1306 & 0x4) != 0) {
						if ((i_136_ & 0x1) != 0)
							return;
					} else if ((i_136_ & 0x2) != 0)
						return;
				}
				for (int i_189_ = 0; i_189_ < class107.aShort1300; i_189_++) {
					int i_190_ = (class107.aShortArray1301[i_189_] + (i << anInt1680 * -1193058675));
					short i_191_ = class107.aShortArray1302[i_189_];
					int i_192_ = (class107.aShortArray1303[i_189_] + (i_131_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_190_ + aFloat9773 * (float) i_191_ + aFloat9750 * (float) i_192_);
					float f_193_ = aFloat9768 + (aFloat9756 * (float) i_190_ + aFloat9754 * (float) i_191_ + aFloat9764 * (float) i_192_);
					if (f < -f_193_)
						return;
					float f_194_ = aFloat9765 + (aFloat9753 * (float) i_190_ + aFloat9757 * (float) i_191_ + aFloat9741 * (float) i_192_);
					float f_195_ = aFloat9761 + (aFloat9771 * (float) i_190_ + aFloat9748 * (float) i_191_ + aFloat9762 * (float) i_192_);
					fs[i_189_] = (class118.aFloat1442 + class118.aFloat1469 * f_194_ / f_193_);
					fs_132_[i_189_] = (class118.aFloat1473 + class118.aFloat1444 * f_195_ / f_193_);
					fs_133_[i_189_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_193_);
					fs_134_[i_189_] = f_193_;
				}
				if (class107.aShortArray1308 != null) {
					for (int i_196_ = 0; i_196_ < class107.aShort1299; i_196_++) {
						short i_197_ = class107.aShortArray1305[i_196_];
						short i_198_ = class107.aShortArray1307[i_196_];
						short i_199_ = class107.aShortArray1298[i_196_];
						float f = fs[i_197_];
						float f_200_ = fs[i_198_];
						float f_201_ = fs[i_199_];
						float f_202_ = fs_132_[i_197_];
						float f_203_ = fs_132_[i_198_];
						float f_204_ = fs_132_[i_199_];
						if (((f - f_200_) * (f_204_ - f_203_) - (f_202_ - f_203_) * (f_201_ - f_200_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_200_ < 0.0F || f_201_ < 0.0F || f > (float) class118.anInt1448 || f_200_ > (float) class118.anInt1448 || f_201_ > (float) class118.anInt1448);
							boolean bool = false;
							if (class107.aShortArray1308[i_196_] != -1) {
								Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class107.aShortArray1308[i_196_] & 0xffff), -97350102));
								bool = class177.aBool1881;
							}
							if (bool)
								class118.method2053(true, true, false, f_202_, f_203_, f_204_, f, f_200_, f_201_, fs_133_[i_197_], fs_133_[i_198_], fs_133_[i_199_], fs_134_[i_197_], fs_134_[i_198_], fs_134_[i_199_], ((float) class107.aShortArray1301[i_197_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_198_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_199_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_197_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_198_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_199_] / (float) (anInt1682 * 341909049)), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_197_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_198_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_199_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class107.aShortArray1308[i_196_] & 0xffff));
							else {
								int i_205_ = class107.anIntArray1310[i_196_];
								if (i_205_ != -1)
									class118.method2033(true, true, false, f_202_, f_203_, f_204_, f, f_200_, f_201_, fs_133_[i_197_], fs_133_[i_198_], fs_133_[i_199_], (float) (Class174.method2935(i_205_, (class107.aShortArray1304[i_197_]), 1530418723)), (float) (Class174.method2935(i_205_, (class107.aShortArray1304[i_198_]), 1530418723)), (float) (Class174.method2935(i_205_, (class107.aShortArray1304[i_199_]), 1530418723)));
							}
						}
					}
				} else {
					for (int i_206_ = 0; i_206_ < class107.aShort1299; i_206_++) {
						short i_207_ = class107.aShortArray1305[i_206_];
						short i_208_ = class107.aShortArray1307[i_206_];
						short i_209_ = class107.aShortArray1298[i_206_];
						float f = fs[i_207_];
						float f_210_ = fs[i_208_];
						float f_211_ = fs[i_209_];
						float f_212_ = fs_132_[i_207_];
						float f_213_ = fs_132_[i_208_];
						float f_214_ = fs_132_[i_209_];
						if (((f - f_210_) * (f_214_ - f_213_) - (f_212_ - f_213_) * (f_211_ - f_210_)) > 0.0F) {
							int i_215_ = class107.anIntArray1310[i_206_];
							if (i_215_ != -1) {
								class118.aBool1455 = (f < 0.0F || f_210_ < 0.0F || f_211_ < 0.0F || f > (float) class118.anInt1448 || f_210_ > (float) class118.anInt1448 || f_211_ > (float) class118.anInt1448);
								class118.method2033(true, true, false, f_212_, f_213_, f_214_, f, f_210_, f_211_, fs_133_[i_207_], fs_133_[i_208_], fs_133_[i_209_], (float) (Class174.method2935(i_215_, (class107.aShortArray1304[i_207_]), 1530418723)), (float) (Class174.method2935(i_215_, (class107.aShortArray1304[i_208_]), 1530418723)), (float) (Class174.method2935(i_215_, (class107.aShortArray1304[i_209_]), 1530418723)));
							}
						}
					}
				}
			}
		}
	}

	void method15354(int i, int i_216_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_217_, float[] fs_218_, float[] fs_219_, float[] fs_220_, int i_221_) {
		Class106 class106 = aClass106ArrayArray9758[i][i_216_];
		if (class106 != null) {
			if ((class106.aByte1292 & 0x2) == 0) {
				if (i_221_ != 0) {
					if ((class106.aByte1292 & 0x4) != 0) {
						if ((i_221_ & 0x1) != 0)
							return;
					} else if ((i_221_ & 0x2) != 0)
						return;
				}
				int i_222_ = i * (anInt1682 * 341909049);
				int i_223_ = i_222_ + anInt1682 * 341909049;
				int i_224_ = i_216_ * (anInt1682 * 341909049);
				int i_225_ = i_224_ + anInt1682 * 341909049;
				float f = 0.0F;
				float f_226_ = 0.0F;
				float f_227_ = 0.0F;
				float f_228_ = 0.0F;
				float f_229_;
				float f_230_;
				float f_231_;
				float f_232_;
				float f_233_;
				float f_234_;
				float f_235_;
				float f_236_;
				float f_237_;
				float f_238_;
				float f_239_;
				float f_240_;
				float f_241_;
				float f_242_;
				float f_243_;
				float f_244_;
				if ((class106.aByte1292 & 0x1) != 0 && !bool) {
					int i_245_ = anIntArrayArray1684[i][i_216_];
					float f_246_ = aFloat9773 * (float) i_245_;
					float f_247_ = aFloat9754 * (float) i_245_;
					float f_248_ = aFloat9767 + (aFloat9755 * (float) i_222_ + f_246_ + aFloat9750 * (float) i_224_);
					f_229_ = aFloat9768 + (aFloat9756 * (float) i_222_ + f_247_ + aFloat9764 * (float) i_224_);
					if (f_248_ < -f_229_)
						return;
					float f_249_ = aFloat9767 + (aFloat9755 * (float) i_223_ + f_246_ + aFloat9750 * (float) i_224_);
					f_230_ = aFloat9768 + (aFloat9756 * (float) i_223_ + f_247_ + aFloat9764 * (float) i_224_);
					if (f_249_ < -f_230_)
						return;
					float f_250_ = aFloat9767 + (aFloat9755 * (float) i_223_ + f_246_ + aFloat9750 * (float) i_225_);
					f_231_ = aFloat9768 + (aFloat9756 * (float) i_223_ + f_247_ + aFloat9764 * (float) i_225_);
					if (f_250_ < -f_231_)
						return;
					float f_251_ = aFloat9767 + (aFloat9755 * (float) i_222_ + f_246_ + aFloat9750 * (float) i_225_);
					f_232_ = aFloat9768 + (aFloat9756 * (float) i_222_ + f_247_ + aFloat9764 * (float) i_225_);
					if (f_251_ < -f_232_)
						return;
					f_233_ = (class118.aFloat1458 + class118.aFloat1447 * f_248_ / f_229_);
					f_234_ = (class118.aFloat1458 + class118.aFloat1447 * f_249_ / f_230_);
					f_235_ = (class118.aFloat1458 + class118.aFloat1447 * f_250_ / f_231_);
					f_236_ = (class118.aFloat1458 + class118.aFloat1447 * f_251_ / f_232_);
					if (class99.aBool1189) {
						float f_252_ = f_248_ - class99.aFloat1205;
						if (f_252_ > 0.0F) {
							f = f_252_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_252_ = f_249_ - class99.aFloat1205;
						if (f_252_ > 0.0F) {
							f_226_ = f_252_ / class99.aFloat1191;
							if (f_226_ > 1.0F)
								f_226_ = 1.0F;
						}
						f_252_ = f_250_ - class99.aFloat1205;
						if (f_252_ > 0.0F) {
							f_227_ = f_252_ / class99.aFloat1191;
							if (f_227_ > 1.0F)
								f_227_ = 1.0F;
						}
						f_252_ = f_251_ - class99.aFloat1205;
						if (f_252_ > 0.0F) {
							f_228_ = f_252_ / class99.aFloat1191;
							if (f_228_ > 1.0F)
								f_228_ = 1.0F;
						}
					}
					float f_253_ = aFloat9757 * (float) i_245_;
					float f_254_ = aFloat9748 * (float) i_245_;
					float f_255_ = aFloat9765 + (aFloat9753 * (float) i_222_ + f_253_ + aFloat9741 * (float) i_224_);
					f_237_ = (class118.aFloat1442 + class118.aFloat1469 * f_255_ / f_229_);
					float f_256_ = aFloat9761 + (aFloat9771 * (float) i_222_ + f_254_ + aFloat9762 * (float) i_224_);
					f_238_ = (class118.aFloat1473 + class118.aFloat1444 * f_256_ / f_229_);
					float f_257_ = aFloat9765 + (aFloat9753 * (float) i_223_ + f_253_ + aFloat9741 * (float) i_224_);
					f_239_ = (class118.aFloat1442 + class118.aFloat1469 * f_257_ / f_230_);
					float f_258_ = aFloat9761 + (aFloat9771 * (float) i_223_ + f_254_ + aFloat9762 * (float) i_224_);
					f_240_ = (class118.aFloat1473 + class118.aFloat1444 * f_258_ / f_230_);
					float f_259_ = aFloat9765 + (aFloat9753 * (float) i_223_ + f_253_ + aFloat9741 * (float) i_225_);
					f_241_ = (class118.aFloat1442 + class118.aFloat1469 * f_259_ / f_231_);
					float f_260_ = aFloat9761 + (aFloat9771 * (float) i_223_ + f_254_ + aFloat9762 * (float) i_225_);
					f_242_ = (class118.aFloat1473 + class118.aFloat1444 * f_260_ / f_231_);
					float f_261_ = aFloat9765 + (aFloat9753 * (float) i_222_ + f_253_ + aFloat9741 * (float) i_225_);
					f_243_ = (class118.aFloat1442 + class118.aFloat1469 * f_261_ / f_232_);
					float f_262_ = aFloat9761 + (aFloat9771 * (float) i_222_ + f_254_ + aFloat9762 * (float) i_225_);
					f_244_ = (class118.aFloat1473 + class118.aFloat1444 * f_262_ / f_232_);
				} else {
					int i_263_ = anIntArrayArray1684[i][i_216_];
					int i_264_ = anIntArrayArray1684[i + 1][i_216_];
					int i_265_ = anIntArrayArray1684[i + 1][i_216_ + 1];
					int i_266_ = anIntArrayArray1684[i][i_216_ + 1];
					float f_267_ = aFloat9767 + (aFloat9755 * (float) i_222_ + aFloat9773 * (float) i_263_ + aFloat9750 * (float) i_224_);
					f_229_ = aFloat9768 + (aFloat9756 * (float) i_222_ + aFloat9754 * (float) i_263_ + aFloat9764 * (float) i_224_);
					if (f_267_ < -f_229_)
						return;
					float f_268_ = aFloat9767 + (aFloat9755 * (float) i_223_ + aFloat9773 * (float) i_264_ + aFloat9750 * (float) i_224_);
					f_230_ = aFloat9768 + (aFloat9756 * (float) i_223_ + aFloat9754 * (float) i_264_ + aFloat9764 * (float) i_224_);
					if (f_268_ < -f_230_)
						return;
					float f_269_ = aFloat9767 + (aFloat9755 * (float) i_223_ + aFloat9773 * (float) i_265_ + aFloat9750 * (float) i_225_);
					f_231_ = aFloat9768 + (aFloat9756 * (float) i_223_ + aFloat9754 * (float) i_265_ + aFloat9764 * (float) i_225_);
					if (f_269_ < -f_231_)
						return;
					float f_270_ = aFloat9767 + (aFloat9755 * (float) i_222_ + aFloat9773 * (float) i_266_ + aFloat9750 * (float) i_225_);
					f_232_ = aFloat9768 + (aFloat9756 * (float) i_222_ + aFloat9754 * (float) i_266_ + aFloat9764 * (float) i_225_);
					if (f_270_ < -f_232_)
						return;
					f_233_ = (class118.aFloat1458 + class118.aFloat1447 * f_267_ / f_229_);
					f_234_ = (class118.aFloat1458 + class118.aFloat1447 * f_268_ / f_230_);
					f_235_ = (class118.aFloat1458 + class118.aFloat1447 * f_269_ / f_231_);
					f_236_ = (class118.aFloat1458 + class118.aFloat1447 * f_270_ / f_232_);
					if (bool) {
						float f_271_ = f_267_ - class99.aFloat1205;
						if (f_271_ > 0.0F) {
							f_271_ /= class99.aFloat1191;
							if (f_271_ > 1.0F)
								f_271_ = 1.0F;
							f = f_271_;
							int i_272_ = (int) ((float) class106.aShort1290 * f_271_);
							if (i_272_ > 0)
								i_263_ -= i_272_;
						}
						f_271_ = f_268_ - class99.aFloat1205;
						if (f_271_ > 0.0F) {
							f_271_ /= class99.aFloat1191;
							if (f_271_ > 1.0F)
								f_271_ = 1.0F;
							f_226_ = f_271_;
							int i_273_ = (int) ((float) class106.aShort1293 * f_271_);
							if (i_273_ > 0)
								i_264_ -= i_273_;
						}
						f_271_ = f_269_ - class99.aFloat1205;
						if (f_271_ > 0.0F) {
							f_271_ /= class99.aFloat1191;
							if (f_271_ > 1.0F)
								f_271_ = 1.0F;
							f_227_ = f_271_;
							int i_274_ = (int) ((float) class106.aShort1294 * f_271_);
							if (i_274_ > 0)
								i_265_ -= i_274_;
						}
						f_271_ = f_270_ - class99.aFloat1205;
						if (f_271_ > 0.0F) {
							f_271_ /= class99.aFloat1191;
							if (f_271_ > 1.0F)
								f_271_ = 1.0F;
							f_228_ = f_271_;
							int i_275_ = (int) ((float) class106.aShort1295 * f_271_);
							if (i_275_ > 0)
								i_266_ -= i_275_;
						}
					} else if (class99.aBool1189) {
						float f_276_ = f_267_ - class99.aFloat1205;
						if (f_276_ > 0.0F) {
							f = f_276_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_276_ = f_268_ - class99.aFloat1205;
						if (f_276_ > 0.0F) {
							f_226_ = f_276_ / class99.aFloat1191;
							if (f_226_ > 1.0F)
								f_226_ = 1.0F;
						}
						f_276_ = f_269_ - class99.aFloat1205;
						if (f_276_ > 0.0F) {
							f_227_ = f_276_ / class99.aFloat1191;
							if (f_227_ > 1.0F)
								f_227_ = 1.0F;
						}
						f_276_ = f_270_ - class99.aFloat1205;
						if (f_276_ > 0.0F) {
							f_228_ = f_276_ / class99.aFloat1191;
							if (f_228_ > 1.0F)
								f_228_ = 1.0F;
						}
					}
					float f_277_ = aFloat9765 + (aFloat9753 * (float) i_222_ + aFloat9757 * (float) i_263_ + aFloat9741 * (float) i_224_);
					f_237_ = (class118.aFloat1442 + class118.aFloat1469 * f_277_ / f_229_);
					float f_278_ = aFloat9761 + (aFloat9771 * (float) i_222_ + aFloat9748 * (float) i_263_ + aFloat9762 * (float) i_224_);
					f_238_ = (class118.aFloat1473 + class118.aFloat1444 * f_278_ / f_229_);
					float f_279_ = aFloat9765 + (aFloat9753 * (float) i_223_ + aFloat9757 * (float) i_264_ + aFloat9741 * (float) i_224_);
					f_239_ = (class118.aFloat1442 + class118.aFloat1469 * f_279_ / f_230_);
					float f_280_ = aFloat9761 + (aFloat9771 * (float) i_223_ + aFloat9748 * (float) i_264_ + aFloat9762 * (float) i_224_);
					f_240_ = (class118.aFloat1473 + class118.aFloat1444 * f_280_ / f_230_);
					float f_281_ = aFloat9765 + (aFloat9753 * (float) i_223_ + aFloat9757 * (float) i_265_ + aFloat9741 * (float) i_225_);
					f_241_ = (class118.aFloat1442 + class118.aFloat1469 * f_281_ / f_231_);
					float f_282_ = aFloat9761 + (aFloat9771 * (float) i_223_ + aFloat9748 * (float) i_265_ + aFloat9762 * (float) i_225_);
					f_242_ = (class118.aFloat1473 + class118.aFloat1444 * f_282_ / f_231_);
					float f_283_ = aFloat9765 + (aFloat9753 * (float) i_222_ + aFloat9757 * (float) i_266_ + aFloat9741 * (float) i_225_);
					f_243_ = (class118.aFloat1442 + class118.aFloat1469 * f_283_ / f_232_);
					float f_284_ = aFloat9761 + (aFloat9771 * (float) i_222_ + aFloat9748 * (float) i_266_ + aFloat9762 * (float) i_225_);
					f_244_ = (class118.aFloat1473 + class118.aFloat1444 * f_284_ / f_232_);
				}
				Class177 class177 = null;
				boolean bool_285_ = false;
				if (class106.aShort1297 != -1) {
					class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class106.aShort1297 & 0xffff, -749267864));
					bool_285_ = class177.aBool1881;
				}
				boolean bool_286_ = class177 != null && method15364(class177.aByte1905);
				float f_287_ = f_226_ + f_227_ + f_228_;
				if (((f_241_ - f_243_) * (f_240_ - f_244_) - (f_242_ - f_244_) * (f_239_ - f_243_)) > 0.0F) {
					class118.aBool1455 = (f_241_ < 0.0F || f_243_ < 0.0F || f_239_ < 0.0F || f_241_ > (float) class118.anInt1448 || f_243_ > (float) class118.anInt1448 || f_239_ > (float) class118.anInt1448);
					if (f_287_ < 3.0F) {
						if (f_287_ > 0.0F) {
							if (bool_285_) {
								int i_288_ = -16777216;
								if (bool_286_)
									i_288_ = -1694498816;
								class118.method2053(true, true, false, f_242_, f_244_, f_240_, f_241_, f_243_, f_239_, f_235_, f_236_, f_234_, f_231_, f_232_, f_230_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_288_ | class106.anInt1289 & 0xffffff, i_288_ | class106.anInt1291 & 0xffffff, i_288_ | class106.anInt1287 & 0xffffff, class99.anInt1192 * 340278173, f_227_ * 255.0F, f_228_ * 255.0F, f_226_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_286_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_242_, f_244_, f_240_, f_241_, f_243_, f_239_, f_235_, f_236_, f_234_, Class155.method2546(class106.anInt1289, (((int) (f_227_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -2125344685), Class155.method2546(class106.anInt1291, (((int) (f_228_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1255778878), Class155.method2546(class106.anInt1287, (((int) (f_226_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -621285263));
								class118.anInt1438 = 0;
							}
						} else if (bool_285_) {
							int i_289_ = -16777216;
							if (bool_286_)
								i_289_ = -1694498816;
							class118.method2053(true, true, false, f_242_, f_244_, f_240_, f_241_, f_243_, f_239_, f_235_, f_236_, f_234_, f_231_, f_232_, f_230_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_289_ | class106.anInt1289 & 0xffffff, i_289_ | class106.anInt1291 & 0xffffff, i_289_ | class106.anInt1287 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_286_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_242_, f_244_, f_240_, f_241_, f_243_, f_239_, f_235_, f_236_, f_234_, class106.anInt1289, class106.anInt1291, class106.anInt1287);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_242_, f_244_, f_240_, f_241_, f_243_, f_239_, f_235_, f_236_, f_234_, class99.anInt1192 * 340278173);
				}
				f_287_ = f + f_226_ + f_228_;
				if (((f_237_ - f_239_) * (f_244_ - f_240_) - (f_238_ - f_240_) * (f_243_ - f_239_)) > 0.0F) {
					class118.aBool1455 = (f_237_ < 0.0F || f_239_ < 0.0F || f_243_ < 0.0F || f_237_ > (float) class118.anInt1448 || f_239_ > (float) class118.anInt1448 || f_243_ > (float) class118.anInt1448);
					if (f_287_ < 3.0F) {
						if (bool_286_)
							class118.anInt1438 = -1694498816;
						if (f_287_ > 0.0F) {
							if (bool_285_) {
								int i_290_ = -16777216;
								if (bool_286_)
									i_290_ = -1694498816;
								class118.method2053(true, true, false, f_238_, f_240_, f_244_, f_237_, f_239_, f_243_, f_233_, f_234_, f_236_, f_229_, f_230_, f_232_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_290_ | class106.anInt1288 & 0xffffff, i_290_ | class106.anInt1287 & 0xffffff, i_290_ | class106.anInt1291 & 0xffffff, class99.anInt1192 * 340278173, f * 255.0F, f_226_ * 255.0F, f_228_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_286_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_238_, f_240_, f_244_, f_237_, f_239_, f_243_, f_233_, f_234_, f_236_, Class155.method2546(class106.anInt1288, (((int) (f * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1675267582), Class155.method2546(class106.anInt1287, (((int) (f_226_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1407356387), Class155.method2546(class106.anInt1291, (((int) (f_228_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1574486851));
								class118.anInt1438 = 0;
							}
						} else if (bool_285_) {
							int i_291_ = -16777216;
							if (bool_286_)
								i_291_ = -1694498816;
							class118.method2053(true, true, false, f_238_, f_240_, f_244_, f_237_, f_239_, f_243_, f_233_, f_234_, f_236_, f_229_, f_230_, f_232_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_291_ | class106.anInt1288 & 0xffffff, i_291_ | class106.anInt1287 & 0xffffff, i_291_ | class106.anInt1291 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_286_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_238_, f_240_, f_244_, f_237_, f_239_, f_243_, f_233_, f_234_, f_236_, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_238_, f_240_, f_244_, f_237_, f_239_, f_243_, f_233_, f_234_, f_236_, class99.anInt1192 * 340278173);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9751[i][i_216_];
			if (class94 != null) {
				if (i_221_ != 0) {
					if ((class94.aByte1153 & 0x4) != 0) {
						if ((i_221_ & 0x1) != 0)
							return;
					} else if ((i_221_ & 0x2) != 0)
						return;
				}
				for (int i_292_ = 0; i_292_ < class94.aShort1152; i_292_++) {
					int i_293_ = (class94.aShortArray1154[i_292_] + (i << anInt1680 * -1193058675));
					int i_294_ = class94.aShortArray1151[i_292_];
					int i_295_ = (class94.aShortArray1156[i_292_] + (i_216_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_293_ + aFloat9773 * (float) i_294_ + aFloat9750 * (float) i_295_);
					float f_296_ = aFloat9768 + (aFloat9756 * (float) i_293_ + aFloat9754 * (float) i_294_ + aFloat9764 * (float) i_295_);
					if (f < -f_296_)
						return;
					float f_297_ = (class118.aFloat1458 + class118.aFloat1447 * f / f_296_);
					fs_220_[i_292_] = 0.0F;
					if (bool) {
						float f_298_ = f - class99.aFloat1205;
						if (f_298_ > 0.0F) {
							f_298_ /= class99.aFloat1191;
							if (f_298_ > 1.0F)
								f_298_ = 1.0F;
							fs_220_[i_292_] = f_298_;
							int i_299_ = (int) ((float) (class94.aShortArray1157[i_292_]) * f_298_);
							if (i_299_ > 0)
								i_294_ -= i_299_;
						}
					} else if (class99.aBool1189) {
						float f_300_ = f - class99.aFloat1205;
						if (f_300_ > 0.0F) {
							fs_220_[i_292_] = f_300_ / class99.aFloat1191;
							if (fs_220_[i_292_] > 1.0F)
								fs_220_[i_292_] = 1.0F;
						}
					}
					float f_301_ = aFloat9765 + (aFloat9753 * (float) i_293_ + aFloat9757 * (float) i_294_ + aFloat9741 * (float) i_295_);
					float f_302_ = aFloat9761 + (aFloat9771 * (float) i_293_ + aFloat9748 * (float) i_294_ + aFloat9762 * (float) i_295_);
					fs[i_292_] = (class118.aFloat1442 + class118.aFloat1469 * f_301_ / f_296_);
					fs_217_[i_292_] = (class118.aFloat1473 + class118.aFloat1444 * f_302_ / f_296_);
					fs_218_[i_292_] = f_297_;
					fs_219_[i_292_] = f_296_;
				}
				if (class94.aShortArray1155 != null) {
					for (int i_303_ = 0; i_303_ < class94.aShort1161; i_303_++) {
						int i_304_ = i_303_ * 3;
						int i_305_ = i_304_ + 1;
						int i_306_ = i_305_ + 1;
						float f = fs[i_304_];
						float f_307_ = fs[i_305_];
						float f_308_ = fs[i_306_];
						float f_309_ = fs_217_[i_304_];
						float f_310_ = fs_217_[i_305_];
						float f_311_ = fs_217_[i_306_];
						float f_312_ = (fs_220_[i_304_] + fs_220_[i_305_] + fs_220_[i_306_]);
						if (((f - f_307_) * (f_311_ - f_310_) - (f_309_ - f_310_) * (f_308_ - f_307_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_307_ < 0.0F || f_308_ < 0.0F || f > (float) class118.anInt1448 || f_307_ > (float) class118.anInt1448 || f_308_ > (float) class118.anInt1448);
							Class177 class177 = null;
							boolean bool_313_ = false;
							if (class94.aShortArray1155[i_303_] != -1) {
								class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class94.aShortArray1155[i_303_] & 0xffff), 120600503));
								bool_313_ = class177.aBool1881;
							}
							if (f_312_ < 3.0F) {
								if (f_312_ > 0.0F) {
									if (bool_313_) {
										int i_314_ = -16777216;
										if (method15364(class177.aByte1905))
											i_314_ = -1694498816;
										class118.method2053(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_218_[i_304_], fs_218_[i_305_], fs_218_[i_306_], fs_219_[i_304_], fs_219_[i_305_], fs_219_[i_306_], ((float) (class94.aShortArray1154[i_304_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_305_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_306_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_304_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_305_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_306_]) / (float) (anInt1682 * 341909049)), i_314_ | (class94.anIntArray1158[i_304_]) & 0xffffff, i_314_ | (class94.anIntArray1158[i_305_]) & 0xffffff, i_314_ | (class94.anIntArray1158[i_306_]) & 0xffffff, class99.anInt1192 * 340278173, fs_220_[i_304_] * 255.0F, fs_220_[i_305_] * 255.0F, fs_220_[i_306_] * 255.0F, (class94.aShortArray1155[i_303_] & 0xffff));
									} else if ((class94.anIntArray1158[i_304_] & 0xffffff) != 0) {
										class118.method2031(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_218_[i_304_], fs_218_[i_305_], fs_218_[i_306_], (Class155.method2546(class94.anIntArray1158[i_304_], ((int) (fs_220_[i_304_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1479413528)), (Class155.method2546(class94.anIntArray1158[i_305_], ((int) (fs_220_[i_305_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1409769990)), (Class155.method2546(class94.anIntArray1158[i_306_], ((int) (fs_220_[i_306_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -684459035)));
										class118.anInt1438 = 0;
									}
								} else if (bool_313_) {
									int i_315_ = -16777216;
									if (method15364(class177.aByte1905))
										i_315_ = -1694498816;
									class118.method2053(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_218_[i_304_], fs_218_[i_305_], fs_218_[i_306_], fs_219_[i_304_], fs_219_[i_305_], fs_219_[i_306_], ((float) (class94.aShortArray1154[i_304_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_305_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_306_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_304_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_305_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_306_]) / (float) (anInt1682 * 341909049)), i_315_ | (class94.anIntArray1158[i_304_]) & 0xffffff, i_315_ | (class94.anIntArray1158[i_305_]) & 0xffffff, i_315_ | (class94.anIntArray1158[i_306_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (class94.aShortArray1155[i_303_] & 0xffff));
								} else if ((class94.anIntArray1158[i_304_] & 0xffffff) != 0) {
									class118.method2031(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_218_[i_304_], fs_218_[i_305_], fs_218_[i_306_], class94.anIntArray1158[i_304_], class94.anIntArray1158[i_305_], class94.anIntArray1158[i_306_]);
									class118.anInt1438 = 0;
								}
							} else
								class118.method2037(true, true, false, f_309_, f_310_, f_311_, f, f_307_, f_308_, fs_218_[i_304_], fs_218_[i_305_], fs_218_[i_306_], (class99.anInt1192 * 340278173));
						}
					}
				} else {
					for (int i_316_ = 0; i_316_ < class94.aShort1161; i_316_++) {
						int i_317_ = i_316_ * 3;
						int i_318_ = i_317_ + 1;
						int i_319_ = i_318_ + 1;
						float f = fs[i_317_];
						float f_320_ = fs[i_318_];
						float f_321_ = fs[i_319_];
						float f_322_ = fs_217_[i_317_];
						float f_323_ = fs_217_[i_318_];
						float f_324_ = fs_217_[i_319_];
						float f_325_ = (fs_220_[i_317_] + fs_220_[i_318_] + fs_220_[i_319_]);
						if (((f - f_320_) * (f_324_ - f_323_) - (f_322_ - f_323_) * (f_321_ - f_320_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_320_ < 0.0F || f_321_ < 0.0F || f > (float) class118.anInt1448 || f_320_ > (float) class118.anInt1448 || f_321_ > (float) class118.anInt1448);
							if (f_325_ < 3.0F) {
								if (f_325_ > 0.0F) {
									if ((class94.anIntArray1158[i_317_] & 0xffffff) != 0)
										class118.method2031(true, true, false, f_322_, f_323_, f_324_, f, f_320_, f_321_, fs_218_[i_317_], fs_218_[i_318_], fs_218_[i_319_], (Class234.method4271(class94.anIntArray1158[i_317_], class99.anInt1192 * 340278173, fs_220_[i_317_] * 255.0F, 888977831)), (Class234.method4271(class94.anIntArray1158[i_318_], class99.anInt1192 * 340278173, fs_220_[i_318_] * 255.0F, 967413465)), (Class234.method4271(class94.anIntArray1158[i_319_], class99.anInt1192 * 340278173, fs_220_[i_319_] * 255.0F, 588326541)));
								} else if ((class94.anIntArray1158[i_317_] & 0xffffff) != 0)
									class118.method2031(true, true, false, f_322_, f_323_, f_324_, f, f_320_, f_321_, fs_218_[i_317_], fs_218_[i_318_], fs_218_[i_319_], class94.anIntArray1158[i_317_], class94.anIntArray1158[i_318_], class94.anIntArray1158[i_319_]);
							} else
								class118.method2037(true, true, false, f_322_, f_323_, f_324_, f, f_320_, f_321_, fs_218_[i_317_], fs_218_[i_318_], fs_218_[i_319_], (class99.anInt1192 * 340278173));
						}
					}
				}
			}
		}
	}

	void method15355(int i, int i_326_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_327_, float[] fs_328_, float[] fs_329_, float[] fs_330_, int i_331_) {
		Class124 class124 = aClass124ArrayArray9752[i][i_326_];
		if (i_331_ == 0 || (i_331_ & 0x2) == 0) {
			if (class124 != null) {
				for (int i_332_ = 0; i_332_ < class124.aShort1516; i_332_++) {
					int i_333_ = (class124.aShortArray1517[i_332_] + (i << anInt1680 * -1193058675));
					int i_334_ = class124.aShortArray1518[i_332_];
					int i_335_ = (class124.aShortArray1522[i_332_] + (i_326_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_333_ + aFloat9773 * (float) i_334_ + aFloat9750 * (float) i_335_);
					float f_336_ = aFloat9768 + (aFloat9756 * (float) i_333_ + aFloat9754 * (float) i_334_ + aFloat9764 * (float) i_335_);
					if (f < -f_336_)
						return;
					fs_330_[i_332_] = 0.0F;
					if (bool) {
						float f_337_ = f - class99.aFloat1205;
						if (f_337_ > 0.0F) {
							f_337_ /= class99.aFloat1191;
							if (f_337_ > 1.0F)
								f_337_ = 1.0F;
							fs_330_[i_332_] = f_337_;
							int i_338_ = (int) ((float) (class124.aShortArray1523[i_332_]) * f_337_);
							if (i_338_ > 0)
								i_334_ -= i_338_;
						}
					} else if (class99.aBool1189) {
						float f_339_ = f - class99.aFloat1205;
						if (f_339_ > 0.0F) {
							fs_330_[i_332_] = f_339_ / class99.aFloat1191;
							if (fs_330_[i_332_] > 1.0F)
								fs_330_[i_332_] = 1.0F;
						}
					}
					float f_340_ = aFloat9765 + (aFloat9753 * (float) i_333_ + aFloat9757 * (float) i_334_ + aFloat9741 * (float) i_335_);
					float f_341_ = aFloat9761 + (aFloat9771 * (float) i_333_ + aFloat9748 * (float) i_334_ + aFloat9762 * (float) i_335_);
					fs[i_332_] = (class118.aFloat1442 + class118.aFloat1469 * f_340_ / f_336_);
					fs_327_[i_332_] = (class118.aFloat1473 + class118.aFloat1444 * f_341_ / f_336_);
					fs_328_[i_332_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_336_);
					fs_329_[i_332_] = f_336_;
				}
				float f = (float) (anInt1682 * 341909049);
				for (int i_342_ = 0; i_342_ < class124.aShort1525; i_342_++) {
					int i_343_ = i_342_ * 3;
					int i_344_ = i_343_ + 1;
					int i_345_ = i_344_ + 1;
					float f_346_ = fs[i_343_];
					float f_347_ = fs[i_344_];
					float f_348_ = fs[i_345_];
					float f_349_ = fs_327_[i_343_];
					float f_350_ = fs_327_[i_344_];
					float f_351_ = fs_327_[i_345_];
					if (((f_346_ - f_347_) * (f_351_ - f_350_) - (f_349_ - f_350_) * (f_348_ - f_347_)) > 0.0F) {
						class118.aBool1455 = (f_346_ < 0.0F || f_347_ < 0.0F || f_348_ < 0.0F || f_346_ > (float) class118.anInt1448 || f_347_ > (float) class118.anInt1448 || f_348_ > (float) class118.anInt1448);
						if (fs_330_[i_343_] + fs_330_[i_344_] + fs_330_[i_345_] < 3.0F) {
							int i_352_ = i << anInt1680 * -1193058675;
							int i_353_ = i_326_ << anInt1680 * -1193058675;
							if ((class124.anIntArray1519[i_343_] & 0xffffff) != 0) {
								if (class124.aShortArray1520[i_343_] != -1 && class124.aShortArray1520[i_344_] != -1 && (class124.aShortArray1520[i_345_] != -1)) {
									if ((class124.aShortArray1520[i_343_] == class124.aShortArray1520[i_344_]) && (class124.aShortArray1520[i_343_] == (class124.aShortArray1520[i_345_])) && (class124.aShortArray1515[i_343_] == (class124.aShortArray1515[i_344_])) && (class124.aShortArray1515[i_343_] == (class124.aShortArray1515[i_345_])))
										class118.method2053(true, true, false, f_349_, f_350_, f_351_, f_346_, f_347_, f_348_, fs_328_[i_343_], fs_328_[i_344_], fs_328_[i_345_], fs_329_[i_343_], fs_329_[i_344_], fs_329_[i_345_], ((float) (i_352_ + (class124.aShortArray1517[i_343_])) / (float) (class124.aShortArray1515[i_343_])), ((float) (i_352_ + (class124.aShortArray1517[i_344_])) / (float) (class124.aShortArray1515[i_344_])), ((float) (i_352_ + (class124.aShortArray1517[i_345_])) / (float) (class124.aShortArray1515[i_345_])), ((float) (i_353_ + (class124.aShortArray1522[i_343_])) / (float) (class124.aShortArray1515[i_343_])), ((float) (i_353_ + (class124.aShortArray1522[i_344_])) / (float) (class124.aShortArray1515[i_344_])), ((float) (i_353_ + (class124.aShortArray1522[i_345_])) / (float) (class124.aShortArray1515[i_345_])), class124.anIntArray1519[i_343_], class124.anIntArray1519[i_344_], class124.anIntArray1519[i_345_], class99.anInt1192 * 340278173, fs_330_[i_343_] * 255.0F, fs_330_[i_344_] * 255.0F, fs_330_[i_345_] * 255.0F, (class124.aShortArray1520[i_343_] & 0xffff));
									else
										class118.method2041(true, true, false, f_349_, f_350_, f_351_, f_346_, f_347_, f_348_, fs_328_[i_343_], fs_328_[i_344_], fs_328_[i_345_], fs_329_[i_343_], fs_329_[i_344_], fs_329_[i_345_], (float) (i_352_ + (class124.aShortArray1517[i_343_])) / f, (float) (i_352_ + (class124.aShortArray1517[i_344_])) / f, (float) (i_352_ + (class124.aShortArray1517[i_345_])) / f, (float) (i_353_ + (class124.aShortArray1522[i_343_])) / f, (float) (i_353_ + (class124.aShortArray1522[i_344_])) / f, (float) (i_353_ + (class124.aShortArray1522[i_345_])) / f, class124.anIntArray1519[i_343_], class124.anIntArray1519[i_344_], class124.anIntArray1519[i_345_], class99.anInt1192 * 340278173, fs_330_[i_343_] * 255.0F, fs_330_[i_344_] * 255.0F, fs_330_[i_345_] * 255.0F, (class124.aShortArray1520[i_343_] & 0xffff), f / (float) (class124.aShortArray1515[i_343_]), (class124.aShortArray1520[i_344_] & 0xffff), f / (float) (class124.aShortArray1515[i_344_]), (class124.aShortArray1520[i_345_] & 0xffff), f / (float) (class124.aShortArray1515[i_345_]));
								} else if ((fs_330_[i_343_] + fs_330_[i_344_] + fs_330_[i_345_]) > 0.0F)
									class118.method2031(true, true, false, f_349_, f_350_, f_351_, f_346_, f_347_, f_348_, fs_328_[i_343_], fs_328_[i_344_], fs_328_[i_345_], (Class234.method4271(class124.anIntArray1519[i_343_], class99.anInt1192 * 340278173, fs_330_[i_343_] * 255.0F, -1149975092)), (Class234.method4271(class124.anIntArray1519[i_344_], class99.anInt1192 * 340278173, fs_330_[i_344_] * 255.0F, -1140509089)), (Class234.method4271(class124.anIntArray1519[i_345_], class99.anInt1192 * 340278173, fs_330_[i_345_] * 255.0F, -2133580052)));
								else
									class118.method2031(true, true, false, f_349_, f_350_, f_351_, f_346_, f_347_, f_348_, fs_328_[i_343_], fs_328_[i_344_], fs_328_[i_345_], class124.anIntArray1519[i_343_], class124.anIntArray1519[i_344_], class124.anIntArray1519[i_345_]);
							}
						} else
							class118.method2037(true, true, false, f_349_, f_350_, f_351_, f_346_, f_347_, f_348_, fs_328_[i_343_], fs_328_[i_344_], fs_328_[i_345_], class99.anInt1192 * 340278173);
					}
				}
			}
		}
	}

	void method15356(int i, int i_354_, Class118 class118, float[] fs, float[] fs_355_, float[] fs_356_, float[] fs_357_, float[] fs_358_, int i_359_) {
		Class129 class129 = aClass129ArrayArray9747[i][i_354_];
		if (class129 != null) {
			if ((class129.aByte1550 & 0x2) == 0) {
				if (i_359_ != 0) {
					if ((class129.aByte1550 & 0x4) != 0) {
						if ((i_359_ & 0x1) != 0)
							return;
					} else if ((i_359_ & 0x2) != 0)
						return;
				}
				int i_360_ = i * (anInt1682 * 341909049);
				int i_361_ = i_360_ + anInt1682 * 341909049;
				int i_362_ = i_354_ * (anInt1682 * 341909049);
				int i_363_ = i_362_ + anInt1682 * 341909049;
				float f;
				float f_364_;
				float f_365_;
				float f_366_;
				float f_367_;
				float f_368_;
				float f_369_;
				float f_370_;
				float f_371_;
				float f_372_;
				float f_373_;
				float f_374_;
				float f_375_;
				float f_376_;
				float f_377_;
				float f_378_;
				if ((class129.aByte1550 & 0x1) != 0) {
					int i_379_ = anIntArrayArray1684[i][i_354_];
					float f_380_ = aFloat9773 * (float) i_379_;
					float f_381_ = aFloat9754 * (float) i_379_;
					float f_382_ = aFloat9767 + (aFloat9755 * (float) i_360_ + f_380_ + aFloat9750 * (float) i_362_);
					f = aFloat9768 + (aFloat9756 * (float) i_360_ + f_381_ + aFloat9764 * (float) i_362_);
					if (f_382_ < -f)
						return;
					float f_383_ = aFloat9767 + (aFloat9755 * (float) i_361_ + f_380_ + aFloat9750 * (float) i_362_);
					f_364_ = aFloat9768 + (aFloat9756 * (float) i_361_ + f_381_ + aFloat9764 * (float) i_362_);
					if (f_383_ < -f_364_)
						return;
					float f_384_ = aFloat9767 + (aFloat9755 * (float) i_361_ + f_380_ + aFloat9750 * (float) i_363_);
					f_365_ = aFloat9768 + (aFloat9756 * (float) i_361_ + f_381_ + aFloat9764 * (float) i_363_);
					if (f_384_ < -f_365_)
						return;
					float f_385_ = aFloat9767 + (aFloat9755 * (float) i_360_ + f_380_ + aFloat9750 * (float) i_363_);
					f_366_ = aFloat9768 + (aFloat9756 * (float) i_360_ + f_381_ + aFloat9764 * (float) i_363_);
					if (f_385_ < -f_366_)
						return;
					float f_386_ = aFloat9757 * (float) i_379_;
					float f_387_ = aFloat9748 * (float) i_379_;
					float f_388_ = aFloat9765 + (aFloat9753 * (float) i_360_ + f_386_ + aFloat9741 * (float) i_362_);
					f_367_ = (class118.aFloat1442 + class118.aFloat1469 * f_388_ / f);
					float f_389_ = aFloat9761 + (aFloat9771 * (float) i_360_ + f_387_ + aFloat9762 * (float) i_362_);
					f_368_ = (class118.aFloat1473 + class118.aFloat1444 * f_389_ / f);
					f_369_ = (class118.aFloat1458 + class118.aFloat1447 * f_382_ / f);
					float f_390_ = aFloat9765 + (aFloat9753 * (float) i_361_ + f_386_ + aFloat9741 * (float) i_362_);
					f_370_ = (class118.aFloat1442 + class118.aFloat1469 * f_390_ / f_364_);
					float f_391_ = aFloat9761 + (aFloat9771 * (float) i_361_ + f_387_ + aFloat9762 * (float) i_362_);
					f_371_ = (class118.aFloat1473 + class118.aFloat1444 * f_391_ / f_364_);
					f_372_ = (class118.aFloat1458 + class118.aFloat1447 * f_383_ / f_364_);
					float f_392_ = aFloat9765 + (aFloat9753 * (float) i_361_ + f_386_ + aFloat9741 * (float) i_363_);
					f_373_ = (class118.aFloat1442 + class118.aFloat1469 * f_392_ / f_365_);
					float f_393_ = aFloat9761 + (aFloat9771 * (float) i_361_ + f_387_ + aFloat9762 * (float) i_363_);
					f_374_ = (class118.aFloat1473 + class118.aFloat1444 * f_393_ / f_365_);
					f_375_ = (class118.aFloat1458 + class118.aFloat1447 * f_384_ / f_365_);
					float f_394_ = aFloat9765 + (aFloat9753 * (float) i_360_ + f_386_ + aFloat9741 * (float) i_363_);
					f_376_ = (class118.aFloat1442 + class118.aFloat1469 * f_394_ / f_366_);
					float f_395_ = aFloat9761 + (aFloat9771 * (float) i_360_ + f_387_ + aFloat9762 * (float) i_363_);
					f_377_ = (class118.aFloat1473 + class118.aFloat1444 * f_395_ / f_366_);
					f_378_ = (class118.aFloat1458 + class118.aFloat1447 * f_385_ / f_366_);
				} else {
					int i_396_ = anIntArrayArray1684[i][i_354_];
					int i_397_ = anIntArrayArray1684[i + 1][i_354_];
					int i_398_ = anIntArrayArray1684[i + 1][i_354_ + 1];
					int i_399_ = anIntArrayArray1684[i][i_354_ + 1];
					float f_400_ = aFloat9767 + (aFloat9755 * (float) i_360_ + aFloat9773 * (float) i_396_ + aFloat9750 * (float) i_362_);
					f = aFloat9768 + (aFloat9756 * (float) i_360_ + aFloat9754 * (float) i_396_ + aFloat9764 * (float) i_362_);
					if (f_400_ < -f)
						return;
					float f_401_ = aFloat9767 + (aFloat9755 * (float) i_361_ + aFloat9773 * (float) i_397_ + aFloat9750 * (float) i_362_);
					f_364_ = aFloat9768 + (aFloat9756 * (float) i_361_ + aFloat9754 * (float) i_397_ + aFloat9764 * (float) i_362_);
					if (f_401_ < -f_364_)
						return;
					float f_402_ = aFloat9767 + (aFloat9755 * (float) i_361_ + aFloat9773 * (float) i_398_ + aFloat9750 * (float) i_363_);
					f_365_ = aFloat9768 + (aFloat9756 * (float) i_361_ + aFloat9754 * (float) i_398_ + aFloat9764 * (float) i_363_);
					if (f_402_ < -f_365_)
						return;
					float f_403_ = aFloat9767 + (aFloat9755 * (float) i_360_ + aFloat9773 * (float) i_399_ + aFloat9750 * (float) i_363_);
					f_366_ = aFloat9768 + (aFloat9756 * (float) i_360_ + aFloat9754 * (float) i_399_ + aFloat9764 * (float) i_363_);
					if (f_403_ < -f_366_)
						return;
					float f_404_ = aFloat9765 + (aFloat9753 * (float) i_360_ + aFloat9757 * (float) i_396_ + aFloat9741 * (float) i_362_);
					f_367_ = (class118.aFloat1442 + class118.aFloat1469 * f_404_ / f);
					float f_405_ = aFloat9761 + (aFloat9771 * (float) i_360_ + aFloat9748 * (float) i_396_ + aFloat9762 * (float) i_362_);
					f_368_ = (class118.aFloat1473 + class118.aFloat1444 * f_405_ / f);
					f_369_ = (class118.aFloat1458 + class118.aFloat1447 * f_400_ / f);
					float f_406_ = aFloat9765 + (aFloat9753 * (float) i_361_ + aFloat9757 * (float) i_397_ + aFloat9741 * (float) i_362_);
					f_370_ = (class118.aFloat1442 + class118.aFloat1469 * f_406_ / f_364_);
					float f_407_ = aFloat9761 + (aFloat9771 * (float) i_361_ + aFloat9748 * (float) i_397_ + aFloat9762 * (float) i_362_);
					f_371_ = (class118.aFloat1473 + class118.aFloat1444 * f_407_ / f_364_);
					f_372_ = (class118.aFloat1458 + class118.aFloat1447 * f_401_ / f_364_);
					float f_408_ = aFloat9765 + (aFloat9753 * (float) i_361_ + aFloat9757 * (float) i_398_ + aFloat9741 * (float) i_363_);
					f_373_ = (class118.aFloat1442 + class118.aFloat1469 * f_408_ / f_365_);
					float f_409_ = aFloat9761 + (aFloat9771 * (float) i_361_ + aFloat9748 * (float) i_398_ + aFloat9762 * (float) i_363_);
					f_374_ = (class118.aFloat1473 + class118.aFloat1444 * f_409_ / f_365_);
					f_375_ = (class118.aFloat1458 + class118.aFloat1447 * f_402_ / f_365_);
					float f_410_ = aFloat9765 + (aFloat9753 * (float) i_360_ + aFloat9757 * (float) i_399_ + aFloat9741 * (float) i_363_);
					f_376_ = (class118.aFloat1442 + class118.aFloat1469 * f_410_ / f_366_);
					float f_411_ = aFloat9761 + (aFloat9771 * (float) i_360_ + aFloat9748 * (float) i_399_ + aFloat9762 * (float) i_363_);
					f_377_ = (class118.aFloat1473 + class118.aFloat1444 * f_411_ / f_366_);
					f_378_ = (class118.aFloat1458 + class118.aFloat1447 * f_403_ / f_366_);
				}
				boolean bool = false;
				if (class129.aShort1552 != -1) {
					Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class129.aShort1552 & 0xffff, 17184855));
					bool = class177.aBool1881;
				}
				if (((f_373_ - f_376_) * (f_371_ - f_377_) - (f_374_ - f_377_) * (f_370_ - f_376_)) > 0.0F) {
					class118.aBool1455 = (f_373_ < 0.0F || f_376_ < 0.0F || f_370_ < 0.0F || f_373_ > (float) class118.anInt1448 || f_376_ > (float) class118.anInt1448 || f_370_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_374_, f_377_, f_371_, f_373_, f_376_, f_370_, f_375_, f_378_, f_372_, f_365_, f_366_, f_364_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1549 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_374_, f_377_, f_371_, f_373_, f_376_, f_370_, f_375_, f_378_, f_372_, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
				}
				if (((f_367_ - f_370_) * (f_377_ - f_371_) - (f_368_ - f_371_) * (f_376_ - f_370_)) > 0.0F) {
					class118.aBool1455 = (f_367_ < 0.0F || f_370_ < 0.0F || f_376_ < 0.0F || f_367_ > (float) class118.anInt1448 || f_370_ > (float) class118.anInt1448 || f_376_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_368_, f_371_, f_377_, f_367_, f_370_, f_376_, f_369_, f_372_, f_378_, f, f_364_, f_366_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1547 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_368_, f_371_, f_377_, f_367_, f_370_, f_376_, f_369_, f_372_, f_378_, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
				}
			}
		} else {
			Class107 class107 = aClass107ArrayArray9749[i][i_354_];
			if (class107 != null) {
				if (i_359_ != 0) {
					if ((class107.aByte1306 & 0x4) != 0) {
						if ((i_359_ & 0x1) != 0)
							return;
					} else if ((i_359_ & 0x2) != 0)
						return;
				}
				for (int i_412_ = 0; i_412_ < class107.aShort1300; i_412_++) {
					int i_413_ = (class107.aShortArray1301[i_412_] + (i << anInt1680 * -1193058675));
					short i_414_ = class107.aShortArray1302[i_412_];
					int i_415_ = (class107.aShortArray1303[i_412_] + (i_354_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_413_ + aFloat9773 * (float) i_414_ + aFloat9750 * (float) i_415_);
					float f_416_ = aFloat9768 + (aFloat9756 * (float) i_413_ + aFloat9754 * (float) i_414_ + aFloat9764 * (float) i_415_);
					if (f < -f_416_)
						return;
					float f_417_ = aFloat9765 + (aFloat9753 * (float) i_413_ + aFloat9757 * (float) i_414_ + aFloat9741 * (float) i_415_);
					float f_418_ = aFloat9761 + (aFloat9771 * (float) i_413_ + aFloat9748 * (float) i_414_ + aFloat9762 * (float) i_415_);
					fs[i_412_] = (class118.aFloat1442 + class118.aFloat1469 * f_417_ / f_416_);
					fs_355_[i_412_] = (class118.aFloat1473 + class118.aFloat1444 * f_418_ / f_416_);
					fs_356_[i_412_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_416_);
					fs_357_[i_412_] = f_416_;
				}
				if (class107.aShortArray1308 != null) {
					for (int i_419_ = 0; i_419_ < class107.aShort1299; i_419_++) {
						short i_420_ = class107.aShortArray1305[i_419_];
						short i_421_ = class107.aShortArray1307[i_419_];
						short i_422_ = class107.aShortArray1298[i_419_];
						float f = fs[i_420_];
						float f_423_ = fs[i_421_];
						float f_424_ = fs[i_422_];
						float f_425_ = fs_355_[i_420_];
						float f_426_ = fs_355_[i_421_];
						float f_427_ = fs_355_[i_422_];
						if (((f - f_423_) * (f_427_ - f_426_) - (f_425_ - f_426_) * (f_424_ - f_423_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_423_ < 0.0F || f_424_ < 0.0F || f > (float) class118.anInt1448 || f_423_ > (float) class118.anInt1448 || f_424_ > (float) class118.anInt1448);
							boolean bool = false;
							if (class107.aShortArray1308[i_419_] != -1) {
								Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class107.aShortArray1308[i_419_] & 0xffff), -689231105));
								bool = class177.aBool1881;
							}
							if (bool)
								class118.method2053(true, true, false, f_425_, f_426_, f_427_, f, f_423_, f_424_, fs_356_[i_420_], fs_356_[i_421_], fs_356_[i_422_], fs_357_[i_420_], fs_357_[i_421_], fs_357_[i_422_], ((float) class107.aShortArray1301[i_420_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_421_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_422_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_420_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_421_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_422_] / (float) (anInt1682 * 341909049)), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_420_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_421_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_422_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class107.aShortArray1308[i_419_] & 0xffff));
							else {
								int i_428_ = class107.anIntArray1310[i_419_];
								if (i_428_ != -1)
									class118.method2033(true, true, false, f_425_, f_426_, f_427_, f, f_423_, f_424_, fs_356_[i_420_], fs_356_[i_421_], fs_356_[i_422_], (float) (Class174.method2935(i_428_, (class107.aShortArray1304[i_420_]), 1530418723)), (float) (Class174.method2935(i_428_, (class107.aShortArray1304[i_421_]), 1530418723)), (float) (Class174.method2935(i_428_, (class107.aShortArray1304[i_422_]), 1530418723)));
							}
						}
					}
				} else {
					for (int i_429_ = 0; i_429_ < class107.aShort1299; i_429_++) {
						short i_430_ = class107.aShortArray1305[i_429_];
						short i_431_ = class107.aShortArray1307[i_429_];
						short i_432_ = class107.aShortArray1298[i_429_];
						float f = fs[i_430_];
						float f_433_ = fs[i_431_];
						float f_434_ = fs[i_432_];
						float f_435_ = fs_355_[i_430_];
						float f_436_ = fs_355_[i_431_];
						float f_437_ = fs_355_[i_432_];
						if (((f - f_433_) * (f_437_ - f_436_) - (f_435_ - f_436_) * (f_434_ - f_433_)) > 0.0F) {
							int i_438_ = class107.anIntArray1310[i_429_];
							if (i_438_ != -1) {
								class118.aBool1455 = (f < 0.0F || f_433_ < 0.0F || f_434_ < 0.0F || f > (float) class118.anInt1448 || f_433_ > (float) class118.anInt1448 || f_434_ > (float) class118.anInt1448);
								class118.method2033(true, true, false, f_435_, f_436_, f_437_, f, f_433_, f_434_, fs_356_[i_430_], fs_356_[i_431_], fs_356_[i_432_], (float) (Class174.method2935(i_438_, (class107.aShortArray1304[i_430_]), 1530418723)), (float) (Class174.method2935(i_438_, (class107.aShortArray1304[i_431_]), 1530418723)), (float) (Class174.method2935(i_438_, (class107.aShortArray1304[i_432_]), 1530418723)));
							}
						}
					}
				}
			}
		}
	}

	void method15357(int i, int i_439_, Class118 class118, float[] fs, float[] fs_440_, float[] fs_441_, float[] fs_442_, float[] fs_443_, int i_444_) {
		Class129 class129 = aClass129ArrayArray9747[i][i_439_];
		if (class129 != null) {
			if ((class129.aByte1550 & 0x2) == 0) {
				if (i_444_ != 0) {
					if ((class129.aByte1550 & 0x4) != 0) {
						if ((i_444_ & 0x1) != 0)
							return;
					} else if ((i_444_ & 0x2) != 0)
						return;
				}
				int i_445_ = i * (anInt1682 * 341909049);
				int i_446_ = i_445_ + anInt1682 * 341909049;
				int i_447_ = i_439_ * (anInt1682 * 341909049);
				int i_448_ = i_447_ + anInt1682 * 341909049;
				float f;
				float f_449_;
				float f_450_;
				float f_451_;
				float f_452_;
				float f_453_;
				float f_454_;
				float f_455_;
				float f_456_;
				float f_457_;
				float f_458_;
				float f_459_;
				float f_460_;
				float f_461_;
				float f_462_;
				float f_463_;
				if ((class129.aByte1550 & 0x1) != 0) {
					int i_464_ = anIntArrayArray1684[i][i_439_];
					float f_465_ = aFloat9773 * (float) i_464_;
					float f_466_ = aFloat9754 * (float) i_464_;
					float f_467_ = aFloat9767 + (aFloat9755 * (float) i_445_ + f_465_ + aFloat9750 * (float) i_447_);
					f = aFloat9768 + (aFloat9756 * (float) i_445_ + f_466_ + aFloat9764 * (float) i_447_);
					if (f_467_ < -f)
						return;
					float f_468_ = aFloat9767 + (aFloat9755 * (float) i_446_ + f_465_ + aFloat9750 * (float) i_447_);
					f_449_ = aFloat9768 + (aFloat9756 * (float) i_446_ + f_466_ + aFloat9764 * (float) i_447_);
					if (f_468_ < -f_449_)
						return;
					float f_469_ = aFloat9767 + (aFloat9755 * (float) i_446_ + f_465_ + aFloat9750 * (float) i_448_);
					f_450_ = aFloat9768 + (aFloat9756 * (float) i_446_ + f_466_ + aFloat9764 * (float) i_448_);
					if (f_469_ < -f_450_)
						return;
					float f_470_ = aFloat9767 + (aFloat9755 * (float) i_445_ + f_465_ + aFloat9750 * (float) i_448_);
					f_451_ = aFloat9768 + (aFloat9756 * (float) i_445_ + f_466_ + aFloat9764 * (float) i_448_);
					if (f_470_ < -f_451_)
						return;
					float f_471_ = aFloat9757 * (float) i_464_;
					float f_472_ = aFloat9748 * (float) i_464_;
					float f_473_ = aFloat9765 + (aFloat9753 * (float) i_445_ + f_471_ + aFloat9741 * (float) i_447_);
					f_452_ = (class118.aFloat1442 + class118.aFloat1469 * f_473_ / f);
					float f_474_ = aFloat9761 + (aFloat9771 * (float) i_445_ + f_472_ + aFloat9762 * (float) i_447_);
					f_453_ = (class118.aFloat1473 + class118.aFloat1444 * f_474_ / f);
					f_454_ = (class118.aFloat1458 + class118.aFloat1447 * f_467_ / f);
					float f_475_ = aFloat9765 + (aFloat9753 * (float) i_446_ + f_471_ + aFloat9741 * (float) i_447_);
					f_455_ = (class118.aFloat1442 + class118.aFloat1469 * f_475_ / f_449_);
					float f_476_ = aFloat9761 + (aFloat9771 * (float) i_446_ + f_472_ + aFloat9762 * (float) i_447_);
					f_456_ = (class118.aFloat1473 + class118.aFloat1444 * f_476_ / f_449_);
					f_457_ = (class118.aFloat1458 + class118.aFloat1447 * f_468_ / f_449_);
					float f_477_ = aFloat9765 + (aFloat9753 * (float) i_446_ + f_471_ + aFloat9741 * (float) i_448_);
					f_458_ = (class118.aFloat1442 + class118.aFloat1469 * f_477_ / f_450_);
					float f_478_ = aFloat9761 + (aFloat9771 * (float) i_446_ + f_472_ + aFloat9762 * (float) i_448_);
					f_459_ = (class118.aFloat1473 + class118.aFloat1444 * f_478_ / f_450_);
					f_460_ = (class118.aFloat1458 + class118.aFloat1447 * f_469_ / f_450_);
					float f_479_ = aFloat9765 + (aFloat9753 * (float) i_445_ + f_471_ + aFloat9741 * (float) i_448_);
					f_461_ = (class118.aFloat1442 + class118.aFloat1469 * f_479_ / f_451_);
					float f_480_ = aFloat9761 + (aFloat9771 * (float) i_445_ + f_472_ + aFloat9762 * (float) i_448_);
					f_462_ = (class118.aFloat1473 + class118.aFloat1444 * f_480_ / f_451_);
					f_463_ = (class118.aFloat1458 + class118.aFloat1447 * f_470_ / f_451_);
				} else {
					int i_481_ = anIntArrayArray1684[i][i_439_];
					int i_482_ = anIntArrayArray1684[i + 1][i_439_];
					int i_483_ = anIntArrayArray1684[i + 1][i_439_ + 1];
					int i_484_ = anIntArrayArray1684[i][i_439_ + 1];
					float f_485_ = aFloat9767 + (aFloat9755 * (float) i_445_ + aFloat9773 * (float) i_481_ + aFloat9750 * (float) i_447_);
					f = aFloat9768 + (aFloat9756 * (float) i_445_ + aFloat9754 * (float) i_481_ + aFloat9764 * (float) i_447_);
					if (f_485_ < -f)
						return;
					float f_486_ = aFloat9767 + (aFloat9755 * (float) i_446_ + aFloat9773 * (float) i_482_ + aFloat9750 * (float) i_447_);
					f_449_ = aFloat9768 + (aFloat9756 * (float) i_446_ + aFloat9754 * (float) i_482_ + aFloat9764 * (float) i_447_);
					if (f_486_ < -f_449_)
						return;
					float f_487_ = aFloat9767 + (aFloat9755 * (float) i_446_ + aFloat9773 * (float) i_483_ + aFloat9750 * (float) i_448_);
					f_450_ = aFloat9768 + (aFloat9756 * (float) i_446_ + aFloat9754 * (float) i_483_ + aFloat9764 * (float) i_448_);
					if (f_487_ < -f_450_)
						return;
					float f_488_ = aFloat9767 + (aFloat9755 * (float) i_445_ + aFloat9773 * (float) i_484_ + aFloat9750 * (float) i_448_);
					f_451_ = aFloat9768 + (aFloat9756 * (float) i_445_ + aFloat9754 * (float) i_484_ + aFloat9764 * (float) i_448_);
					if (f_488_ < -f_451_)
						return;
					float f_489_ = aFloat9765 + (aFloat9753 * (float) i_445_ + aFloat9757 * (float) i_481_ + aFloat9741 * (float) i_447_);
					f_452_ = (class118.aFloat1442 + class118.aFloat1469 * f_489_ / f);
					float f_490_ = aFloat9761 + (aFloat9771 * (float) i_445_ + aFloat9748 * (float) i_481_ + aFloat9762 * (float) i_447_);
					f_453_ = (class118.aFloat1473 + class118.aFloat1444 * f_490_ / f);
					f_454_ = (class118.aFloat1458 + class118.aFloat1447 * f_485_ / f);
					float f_491_ = aFloat9765 + (aFloat9753 * (float) i_446_ + aFloat9757 * (float) i_482_ + aFloat9741 * (float) i_447_);
					f_455_ = (class118.aFloat1442 + class118.aFloat1469 * f_491_ / f_449_);
					float f_492_ = aFloat9761 + (aFloat9771 * (float) i_446_ + aFloat9748 * (float) i_482_ + aFloat9762 * (float) i_447_);
					f_456_ = (class118.aFloat1473 + class118.aFloat1444 * f_492_ / f_449_);
					f_457_ = (class118.aFloat1458 + class118.aFloat1447 * f_486_ / f_449_);
					float f_493_ = aFloat9765 + (aFloat9753 * (float) i_446_ + aFloat9757 * (float) i_483_ + aFloat9741 * (float) i_448_);
					f_458_ = (class118.aFloat1442 + class118.aFloat1469 * f_493_ / f_450_);
					float f_494_ = aFloat9761 + (aFloat9771 * (float) i_446_ + aFloat9748 * (float) i_483_ + aFloat9762 * (float) i_448_);
					f_459_ = (class118.aFloat1473 + class118.aFloat1444 * f_494_ / f_450_);
					f_460_ = (class118.aFloat1458 + class118.aFloat1447 * f_487_ / f_450_);
					float f_495_ = aFloat9765 + (aFloat9753 * (float) i_445_ + aFloat9757 * (float) i_484_ + aFloat9741 * (float) i_448_);
					f_461_ = (class118.aFloat1442 + class118.aFloat1469 * f_495_ / f_451_);
					float f_496_ = aFloat9761 + (aFloat9771 * (float) i_445_ + aFloat9748 * (float) i_484_ + aFloat9762 * (float) i_448_);
					f_462_ = (class118.aFloat1473 + class118.aFloat1444 * f_496_ / f_451_);
					f_463_ = (class118.aFloat1458 + class118.aFloat1447 * f_488_ / f_451_);
				}
				boolean bool = false;
				if (class129.aShort1552 != -1) {
					Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class129.aShort1552 & 0xffff, 349241118));
					bool = class177.aBool1881;
				}
				if (((f_458_ - f_461_) * (f_456_ - f_462_) - (f_459_ - f_462_) * (f_455_ - f_461_)) > 0.0F) {
					class118.aBool1455 = (f_458_ < 0.0F || f_461_ < 0.0F || f_455_ < 0.0F || f_458_ > (float) class118.anInt1448 || f_461_ > (float) class118.anInt1448 || f_455_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_459_, f_462_, f_456_, f_458_, f_461_, f_455_, f_460_, f_463_, f_457_, f_450_, f_451_, f_449_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1549 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_459_, f_462_, f_456_, f_458_, f_461_, f_455_, f_460_, f_463_, f_457_, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
				}
				if (((f_452_ - f_455_) * (f_462_ - f_456_) - (f_453_ - f_456_) * (f_461_ - f_455_)) > 0.0F) {
					class118.aBool1455 = (f_452_ < 0.0F || f_455_ < 0.0F || f_461_ < 0.0F || f_452_ > (float) class118.anInt1448 || f_455_ > (float) class118.anInt1448 || f_461_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_453_, f_456_, f_462_, f_452_, f_455_, f_461_, f_454_, f_457_, f_463_, f, f_449_, f_451_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1547 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_453_, f_456_, f_462_, f_452_, f_455_, f_461_, f_454_, f_457_, f_463_, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
				}
			}
		} else {
			Class107 class107 = aClass107ArrayArray9749[i][i_439_];
			if (class107 != null) {
				if (i_444_ != 0) {
					if ((class107.aByte1306 & 0x4) != 0) {
						if ((i_444_ & 0x1) != 0)
							return;
					} else if ((i_444_ & 0x2) != 0)
						return;
				}
				for (int i_497_ = 0; i_497_ < class107.aShort1300; i_497_++) {
					int i_498_ = (class107.aShortArray1301[i_497_] + (i << anInt1680 * -1193058675));
					short i_499_ = class107.aShortArray1302[i_497_];
					int i_500_ = (class107.aShortArray1303[i_497_] + (i_439_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_498_ + aFloat9773 * (float) i_499_ + aFloat9750 * (float) i_500_);
					float f_501_ = aFloat9768 + (aFloat9756 * (float) i_498_ + aFloat9754 * (float) i_499_ + aFloat9764 * (float) i_500_);
					if (f < -f_501_)
						return;
					float f_502_ = aFloat9765 + (aFloat9753 * (float) i_498_ + aFloat9757 * (float) i_499_ + aFloat9741 * (float) i_500_);
					float f_503_ = aFloat9761 + (aFloat9771 * (float) i_498_ + aFloat9748 * (float) i_499_ + aFloat9762 * (float) i_500_);
					fs[i_497_] = (class118.aFloat1442 + class118.aFloat1469 * f_502_ / f_501_);
					fs_440_[i_497_] = (class118.aFloat1473 + class118.aFloat1444 * f_503_ / f_501_);
					fs_441_[i_497_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_501_);
					fs_442_[i_497_] = f_501_;
				}
				if (class107.aShortArray1308 != null) {
					for (int i_504_ = 0; i_504_ < class107.aShort1299; i_504_++) {
						short i_505_ = class107.aShortArray1305[i_504_];
						short i_506_ = class107.aShortArray1307[i_504_];
						short i_507_ = class107.aShortArray1298[i_504_];
						float f = fs[i_505_];
						float f_508_ = fs[i_506_];
						float f_509_ = fs[i_507_];
						float f_510_ = fs_440_[i_505_];
						float f_511_ = fs_440_[i_506_];
						float f_512_ = fs_440_[i_507_];
						if (((f - f_508_) * (f_512_ - f_511_) - (f_510_ - f_511_) * (f_509_ - f_508_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_508_ < 0.0F || f_509_ < 0.0F || f > (float) class118.anInt1448 || f_508_ > (float) class118.anInt1448 || f_509_ > (float) class118.anInt1448);
							boolean bool = false;
							if (class107.aShortArray1308[i_504_] != -1) {
								Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class107.aShortArray1308[i_504_] & 0xffff), -231904952));
								bool = class177.aBool1881;
							}
							if (bool)
								class118.method2053(true, true, false, f_510_, f_511_, f_512_, f, f_508_, f_509_, fs_441_[i_505_], fs_441_[i_506_], fs_441_[i_507_], fs_442_[i_505_], fs_442_[i_506_], fs_442_[i_507_], ((float) class107.aShortArray1301[i_505_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_506_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_507_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_505_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_506_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_507_] / (float) (anInt1682 * 341909049)), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_505_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_506_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_507_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class107.aShortArray1308[i_504_] & 0xffff));
							else {
								int i_513_ = class107.anIntArray1310[i_504_];
								if (i_513_ != -1)
									class118.method2033(true, true, false, f_510_, f_511_, f_512_, f, f_508_, f_509_, fs_441_[i_505_], fs_441_[i_506_], fs_441_[i_507_], (float) (Class174.method2935(i_513_, (class107.aShortArray1304[i_505_]), 1530418723)), (float) (Class174.method2935(i_513_, (class107.aShortArray1304[i_506_]), 1530418723)), (float) (Class174.method2935(i_513_, (class107.aShortArray1304[i_507_]), 1530418723)));
							}
						}
					}
				} else {
					for (int i_514_ = 0; i_514_ < class107.aShort1299; i_514_++) {
						short i_515_ = class107.aShortArray1305[i_514_];
						short i_516_ = class107.aShortArray1307[i_514_];
						short i_517_ = class107.aShortArray1298[i_514_];
						float f = fs[i_515_];
						float f_518_ = fs[i_516_];
						float f_519_ = fs[i_517_];
						float f_520_ = fs_440_[i_515_];
						float f_521_ = fs_440_[i_516_];
						float f_522_ = fs_440_[i_517_];
						if (((f - f_518_) * (f_522_ - f_521_) - (f_520_ - f_521_) * (f_519_ - f_518_)) > 0.0F) {
							int i_523_ = class107.anIntArray1310[i_514_];
							if (i_523_ != -1) {
								class118.aBool1455 = (f < 0.0F || f_518_ < 0.0F || f_519_ < 0.0F || f > (float) class118.anInt1448 || f_518_ > (float) class118.anInt1448 || f_519_ > (float) class118.anInt1448);
								class118.method2033(true, true, false, f_520_, f_521_, f_522_, f, f_518_, f_519_, fs_441_[i_515_], fs_441_[i_516_], fs_441_[i_517_], (float) (Class174.method2935(i_523_, (class107.aShortArray1304[i_515_]), 1530418723)), (float) (Class174.method2935(i_523_, (class107.aShortArray1304[i_516_]), 1530418723)), (float) (Class174.method2935(i_523_, (class107.aShortArray1304[i_517_]), 1530418723)));
							}
						}
					}
				}
			}
		}
	}

	void method15358(int i, int i_524_, int i_525_, int i_526_, int i_527_, int i_528_, int i_529_, boolean[][] bools, Class99 class99, Class118 class118, float[] fs, float[] fs_530_) {
		int i_531_ = (i_529_ - i_527_) * i_525_ / 256;
		int i_532_ = i_525_ >> 8;
		boolean bool = class99.aBool1186;
		aClass178_Sub3_9746.method3287(false);
		class118.aBool1465 = false;
		class118.aBool1437 = false;
		int i_533_ = i;
		int i_534_ = i_524_ + i_531_;
		for (int i_535_ = i_526_; i_535_ < i_528_; i_535_++) {
			for (int i_536_ = i_527_; i_536_ < i_529_; i_536_++) {
				if (bools[i_535_ - i_526_][i_536_ - i_527_]) {
					if (aClass129ArrayArray9747[i_535_][i_536_] != null) {
						Class129 class129 = aClass129ArrayArray9747[i_535_][i_536_];
						if (class129.aShort1552 != -1 && (class129.aByte1550 & 0x2) == 0 && class129.anInt1546 == -1) {
							int i_537_ = aClass178_Sub3_9746.method15416((class129.aShort1552) & 0xffff);
							class118.method2033(true, true, false, (float) (i_534_ - i_532_), (float) (i_534_ - i_532_), (float) i_534_, (float) (i_533_ + i_532_), (float) i_533_, (float) (i_533_ + i_532_), 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_537_, ((class129.aShort1549) & 0xffff), 1530418723), (float) Class174.method2935(i_537_, ((class129.aShort1551) & 0xffff), 1530418723), (float) Class174.method2935(i_537_, ((class129.aShort1548) & 0xffff), 1530418723));
							class118.method2033(true, true, false, (float) i_534_, (float) i_534_, (float) (i_534_ - i_532_), (float) i_533_, (float) (i_533_ + i_532_), (float) i_533_, 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_537_, ((class129.aShort1547) & 0xffff), 1530418723), (float) Class174.method2935(i_537_, ((class129.aShort1548) & 0xffff), 1530418723), (float) Class174.method2935(i_537_, ((class129.aShort1551) & 0xffff), 1530418723));
						} else if (class129.anInt1546 == -1) {
							class118.method2033(true, true, false, (float) (i_534_ - i_532_), (float) (i_534_ - i_532_), (float) i_534_, (float) (i_533_ + i_532_), (float) i_533_, (float) (i_533_ + i_532_), 100.0F, 100.0F, 100.0F, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
							class118.method2033(true, true, false, (float) i_534_, (float) i_534_, (float) (i_534_ - i_532_), (float) i_533_, (float) (i_533_ + i_532_), (float) i_533_, 100.0F, 100.0F, 100.0F, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
						} else {
							int i_538_ = class129.anInt1546;
							class118.method2033(true, true, false, (float) (i_534_ - i_532_), (float) (i_534_ - i_532_), (float) i_534_, (float) (i_533_ + i_532_), (float) i_533_, (float) (i_533_ + i_532_), 100.0F, 100.0F, 100.0F, (float) i_538_, (float) i_538_, (float) i_538_);
							class118.method2033(true, true, false, (float) i_534_, (float) i_534_, (float) (i_534_ - i_532_), (float) i_533_, (float) (i_533_ + i_532_), (float) i_533_, 100.0F, 100.0F, 100.0F, (float) i_538_, (float) i_538_, (float) i_538_);
						}
					} else if (aClass107ArrayArray9749[i_535_][i_536_] != null) {
						Class107 class107 = aClass107ArrayArray9749[i_535_][i_536_];
						for (int i_539_ = 0; i_539_ < class107.aShort1300; i_539_++) {
							fs[i_539_] = (float) (i_533_ + (class107.aShortArray1301[i_539_] * i_532_ / (anInt1682 * 341909049)));
							fs_530_[i_539_] = (float) (i_534_ - (class107.aShortArray1303[i_539_] * i_532_ / (anInt1682 * 341909049)));
						}
						for (int i_540_ = 0; i_540_ < class107.aShort1299; i_540_++) {
							short i_541_ = class107.aShortArray1305[i_540_];
							short i_542_ = class107.aShortArray1307[i_540_];
							short i_543_ = class107.aShortArray1298[i_540_];
							float f = fs[i_541_];
							float f_544_ = fs[i_542_];
							float f_545_ = fs[i_543_];
							float f_546_ = fs_530_[i_541_];
							float f_547_ = fs_530_[i_542_];
							float f_548_ = fs_530_[i_543_];
							if (class107.anIntArray1311 != null && class107.anIntArray1311[i_540_] != -1) {
								int i_549_ = class107.anIntArray1311[i_540_];
								class118.method2033(true, true, false, f_546_, f_547_, f_548_, f, f_544_, f_545_, 100.0F, 100.0F, 100.0F, (float) (Class174.method2935(i_549_, (class107.aShortArray1304[i_541_]), 1530418723)), (float) (Class174.method2935(i_549_, (class107.aShortArray1304[i_542_]), 1530418723)), (float) (Class174.method2935(i_549_, (class107.aShortArray1304[i_543_]), 1530418723)));
							} else if (class107.aShortArray1308 != null && (class107.aShortArray1308[i_540_] != -1)) {
								int i_550_ = (aClass178_Sub3_9746.method15416(class107.aShortArray1308[i_540_] & 0xffff));
								class118.method2033(true, true, false, f_546_, f_547_, f_548_, f, f_544_, f_545_, 100.0F, 100.0F, 100.0F, (float) (Class174.method2935(i_550_, (class107.aShortArray1304[i_541_]), 1530418723)), (float) (Class174.method2935(i_550_, (class107.aShortArray1304[i_542_]), 1530418723)), (float) (Class174.method2935(i_550_, (class107.aShortArray1304[i_543_]), 1530418723)));
							} else {
								int i_551_ = class107.anIntArray1310[i_540_];
								class118.method2033(true, true, false, f_546_, f_547_, f_548_, f, f_544_, f_545_, 100.0F, 100.0F, 100.0F, (float) (Class174.method2935(i_551_, (class107.aShortArray1304[i_541_]), 1530418723)), (float) (Class174.method2935(i_551_, (class107.aShortArray1304[i_542_]), 1530418723)), (float) (Class174.method2935(i_551_, (class107.aShortArray1304[i_543_]), 1530418723)));
							}
						}
					}
				}
				i_534_ -= i_532_;
			}
			i_534_ = i_524_ + i_531_;
			i_533_ += i_532_;
		}
		class118.aBool1465 = true;
		aClass178_Sub3_9746.method3287(bool);
	}

	void method15359(int i, int i_552_, int i_553_, int i_554_, int i_555_, int i_556_, int i_557_, boolean[][] bools, Class99 class99, Class118 class118, float[] fs, float[] fs_558_) {
		int i_559_ = (i_557_ - i_555_) * i_553_ / 256;
		int i_560_ = i_553_ >> 8;
		boolean bool = class99.aBool1186;
		aClass178_Sub3_9746.method3287(false);
		class118.aBool1465 = false;
		class118.aBool1437 = false;
		int i_561_ = i;
		int i_562_ = i_552_ + i_559_;
		for (int i_563_ = i_554_; i_563_ < i_556_; i_563_++) {
			for (int i_564_ = i_555_; i_564_ < i_557_; i_564_++) {
				if (bools[i_563_ - i_554_][i_564_ - i_555_]) {
					if (aClass106ArrayArray9758 != null) {
						if (aClass106ArrayArray9758[i_563_][i_564_] != null) {
							Class106 class106 = aClass106ArrayArray9758[i_563_][i_564_];
							if (class106.aShort1297 != -1 && (class106.aByte1292 & 0x2) == 0 && class106.anInt1296 == 0) {
								int i_565_ = (aClass178_Sub3_9746.method15416(class106.aShort1297 & 0xffff));
								class118.method2033(true, true, false, (float) (i_562_ - i_560_), (float) (i_562_ - i_560_), (float) i_562_, (float) (i_561_ + i_560_), (float) i_561_, (float) (i_561_ + i_560_), 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_565_, (class106.anInt1289), 1530418723), (float) Class174.method2935(i_565_, (class106.anInt1291), 1530418723), (float) Class174.method2935(i_565_, (class106.anInt1287), 1530418723));
								class118.method2033(true, true, false, (float) i_562_, (float) i_562_, (float) (i_562_ - i_560_), (float) i_561_, (float) (i_561_ + i_560_), (float) i_561_, 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_565_, (class106.anInt1288), 1530418723), (float) Class174.method2935(i_565_, (class106.anInt1287), 1530418723), (float) Class174.method2935(i_565_, (class106.anInt1291), 1530418723));
							} else if (class106.anInt1296 == 0) {
								class118.method2031(true, true, false, (float) (i_562_ - i_560_), (float) (i_562_ - i_560_), (float) i_562_, (float) (i_561_ + i_560_), (float) i_561_, (float) (i_561_ + i_560_), 100.0F, 100.0F, 100.0F, class106.anInt1289, class106.anInt1291, class106.anInt1287);
								class118.method2031(true, true, false, (float) i_562_, (float) i_562_, (float) (i_562_ - i_560_), (float) i_561_, (float) (i_561_ + i_560_), (float) i_561_, 100.0F, 100.0F, 100.0F, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							} else {
								int i_566_ = class106.anInt1296;
								class118.method2031(true, true, false, (float) (i_562_ - i_560_), (float) (i_562_ - i_560_), (float) i_562_, (float) (i_561_ + i_560_), (float) i_561_, (float) (i_561_ + i_560_), 100.0F, 100.0F, 100.0F, Class155.method2546(i_566_, (class106.anInt1289 & ~0xffffff), -1609971347), Class155.method2546(i_566_, (class106.anInt1291 & ~0xffffff), -1463540676), Class155.method2546(i_566_, (class106.anInt1287 & ~0xffffff), -980398258));
								class118.method2031(true, true, false, (float) i_562_, (float) i_562_, (float) (i_562_ - i_560_), (float) i_561_, (float) (i_561_ + i_560_), (float) i_561_, 100.0F, 100.0F, 100.0F, Class155.method2546(i_566_, (class106.anInt1288 & ~0xffffff), -1256090455), Class155.method2546(i_566_, (class106.anInt1287 & ~0xffffff), -1721636996), Class155.method2546(i_566_, (class106.anInt1291 & ~0xffffff), -1501306282));
							}
						} else if (aClass94ArrayArray9751[i_563_][i_564_] != null) {
							Class94 class94 = aClass94ArrayArray9751[i_563_][i_564_];
							for (int i_567_ = 0; i_567_ < class94.aShort1152; i_567_++) {
								fs[i_567_] = (float) (i_561_ + ((class94.aShortArray1154[i_567_]) * i_560_ / (anInt1682 * 341909049)));
								fs_558_[i_567_] = (float) (i_562_ - ((class94.aShortArray1156[i_567_]) * i_560_ / (anInt1682 * 341909049)));
							}
							for (int i_568_ = 0; i_568_ < class94.aShort1161; i_568_++) {
								int i_569_ = i_568_ * 3;
								int i_570_ = i_569_ + 1;
								int i_571_ = i_570_ + 1;
								float f = fs[i_569_];
								float f_572_ = fs[i_570_];
								float f_573_ = fs[i_571_];
								float f_574_ = fs_558_[i_569_];
								float f_575_ = fs_558_[i_570_];
								float f_576_ = fs_558_[i_571_];
								if (class94.anIntArray1160 != null && class94.anIntArray1160[i_568_] != 0 && (class94.aShortArray1155 == null || (class94.aShortArray1155 != null && (class94.aShortArray1155[i_568_] == -1)))) {
									int i_577_ = class94.anIntArray1160[i_568_];
									class118.method2031(true, true, false, f_574_, f_575_, f_576_, f, f_572_, f_573_, 100.0F, 100.0F, 100.0F, (Class155.method2546(i_577_, (-16777216 - (class94.anIntArray1158[i_569_] & ~0xffffff)), -1899717539)), (Class155.method2546(i_577_, (-16777216 - (class94.anIntArray1158[i_570_] & ~0xffffff)), -850032665)), (Class155.method2546(i_577_, (-16777216 - (class94.anIntArray1158[i_571_] & ~0xffffff)), -2081391790)));
								} else if (class94.aShortArray1155 != null && (class94.aShortArray1155[i_568_] != -1)) {
									int i_578_ = (aClass178_Sub3_9746.method15416(class94.aShortArray1155[i_568_] & 0xffff));
									class118.method2033(true, true, false, f_574_, f_575_, f_576_, f, f_572_, f_573_, 100.0F, 100.0F, 100.0F, (float) i_578_, (float) i_578_, (float) i_578_);
								} else
									class118.method2031(true, true, false, f_574_, f_575_, f_576_, f, f_572_, f_573_, 100.0F, 100.0F, 100.0F, class94.anIntArray1158[i_569_], class94.anIntArray1158[i_570_], class94.anIntArray1158[i_571_]);
							}
						}
					} else if (aClass124ArrayArray9752[i_563_][i_564_] != null) {
						Class124 class124 = aClass124ArrayArray9752[i_563_][i_564_];
						for (int i_579_ = 0; i_579_ < class124.aShort1516; i_579_++) {
							fs[i_579_] = (float) (i_561_ + (class124.aShortArray1517[i_579_] * i_560_ / (anInt1682 * 341909049)));
							fs_558_[i_579_] = (float) (i_562_ - (class124.aShortArray1522[i_579_] * i_560_ / (anInt1682 * 341909049)));
						}
						for (int i_580_ = 0; i_580_ < class124.aShort1525; i_580_++) {
							int i_581_ = i_580_ * 3;
							int i_582_ = i_581_ + 1;
							int i_583_ = i_582_ + 1;
							float f = fs[i_581_];
							float f_584_ = fs[i_582_];
							float f_585_ = fs[i_583_];
							float f_586_ = fs_558_[i_581_];
							float f_587_ = fs_558_[i_582_];
							float f_588_ = fs_558_[i_583_];
							if (class124.anIntArray1521 != null && class124.anIntArray1521[i_580_] != 0) {
								int i_589_ = class124.anIntArray1521[i_580_];
								class118.method2031(true, true, false, f_586_, f_587_, f_588_, f, f_584_, f_585_, 100.0F, 100.0F, 100.0F, i_589_, i_589_, i_589_);
							} else
								class118.method2031(true, true, false, f_586_, f_587_, f_588_, f, f_584_, f_585_, 100.0F, 100.0F, 100.0F, class124.anIntArray1519[i_581_], class124.anIntArray1519[i_582_], class124.anIntArray1519[i_583_]);
						}
					}
				}
				i_562_ -= i_560_;
			}
			i_562_ = i_552_ + i_559_;
			i_561_ += i_560_;
		}
		class118.aBool1465 = true;
		aClass178_Sub3_9746.method3287(bool);
	}

	public Class523_Sub27_Sub4 method2330(int i, int i_590_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	public void method2354(Class523_Sub20 class523_sub20, int[] is) {
		/* empty */
	}

	public boolean method2333(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_591_, int i_592_, int i_593_, boolean bool) {
		return false;
	}

	public void method2332(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_594_, int i_595_, int i_596_, boolean bool) {
		/* empty */
	}

	public void method2334(Class523_Sub20 class523_sub20, int[] is) {
		/* empty */
	}

	public void method2319(int i, int i_597_, int i_598_) {
		i = Math.min(aByteArrayArray9770.length - 1, Math.max(0, i));
		i_597_ = Math.min(aByteArrayArray9770[i].length - 1, Math.max(0, i_597_));
		if (aByteArrayArray9770[i][i_597_] < i_598_)
			aByteArrayArray9770[i][i_597_] = (byte) i_598_;
	}

	public void method2336(int i, int i_599_, int i_600_) {
		i = Math.min(aByteArrayArray9770.length - 1, Math.max(0, i));
		i_599_ = Math.min(aByteArrayArray9770[i].length - 1, Math.max(0, i_599_));
		if (aByteArrayArray9770[i][i_599_] < i_600_)
			aByteArrayArray9770[i][i_599_] = (byte) i_600_;
	}

	public void method2337(int i, int i_601_, int[] is, int[] is_602_, int[] is_603_, int[] is_604_, int[] is_605_, int[] is_606_, int[] is_607_, int[] is_608_, int[] is_609_, int[] is_610_, int[] is_611_, Class163 class163, boolean bool) {
		if (aClass129ArrayArray9747 == null) {
			aClass129ArrayArray9747 = new Class129[anInt1683 * 692304099][anInt1681 * 452998539];
			aClass107ArrayArray9749 = new Class107[anInt1683 * 692304099][anInt1681 * 452998539];
		} else if (aClass106ArrayArray9758 != null || aClass124ArrayArray9752 != null)
			throw new IllegalStateException();
		boolean bool_612_ = false;
		if (is_608_.length == 2 && is_605_.length == 2 && (is_608_[0] == is_608_[1] || is_610_[0] != -1 && is_610_[0] == is_610_[1])) {
			bool_612_ = true;
			for (int i_613_ = 1; i_613_ < 2; i_613_++) {
				int i_614_ = is[is_605_[i_613_]];
				int i_615_ = is_603_[is_605_[i_613_]];
				if (i_614_ != 0 && i_614_ != anInt1682 * 341909049 || i_615_ != 0 && i_615_ != anInt1682 * 341909049) {
					bool_612_ = false;
					break;
				}
			}
		}
		if (!bool_612_) {
			Class107 class107 = new Class107();
			short i_616_ = (short) is.length;
			int i_617_ = (short) is_608_.length;
			class107.aShort1300 = i_616_;
			class107.aShortArray1304 = new short[i_616_];
			class107.aShortArray1301 = new short[i_616_];
			class107.aShortArray1302 = new short[i_616_];
			class107.aShortArray1303 = new short[i_616_];
			for (int i_618_ = 0; i_618_ < i_616_; i_618_++) {
				int i_619_ = is[i_618_];
				int i_620_ = is_603_[i_618_];
				if (i_619_ == 0 && i_620_ == 0)
					class107.aShortArray1304[i_618_] = (short) (aByteArrayArray9769[i][i_601_] - aByteArrayArray9770[i][i_601_]);
				else if (i_619_ == 0 && i_620_ == anInt1682 * 341909049)
					class107.aShortArray1304[i_618_] = (short) (aByteArrayArray9769[i][i_601_ + 1] - aByteArrayArray9770[i][i_601_ + 1]);
				else if (i_619_ == anInt1682 * 341909049 && i_620_ == anInt1682 * 341909049)
					class107.aShortArray1304[i_618_] = (short) (aByteArrayArray9769[i + 1][i_601_ + 1] - aByteArrayArray9770[i + 1][i_601_ + 1]);
				else if (i_619_ == anInt1682 * 341909049 && i_620_ == 0)
					class107.aShortArray1304[i_618_] = (short) (aByteArrayArray9769[i + 1][i_601_] - aByteArrayArray9770[i + 1][i_601_]);
				else {
					int i_621_ = (((aByteArrayArray9769[i][i_601_] - aByteArrayArray9770[i][i_601_]) * (anInt1682 * 341909049 - i_619_)) + (aByteArrayArray9769[i + 1][i_601_] - aByteArrayArray9770[i + 1][i_601_]) * i_619_);
					int i_622_ = (((aByteArrayArray9769[i][i_601_ + 1] - aByteArrayArray9770[i][i_601_ + 1]) * (anInt1682 * 341909049 - i_619_)) + ((aByteArrayArray9769[i + 1][i_601_ + 1] - aByteArrayArray9770[i + 1][i_601_ + 1]) * i_619_));
					class107.aShortArray1304[i_618_] = (short) ((i_621_ * (anInt1682 * 341909049 - i_620_) + i_622_ * i_620_) >> anInt1680 * 1908849946);
				}
				int i_623_ = (i << anInt1680 * -1193058675) + i_619_;
				int i_624_ = (i_601_ << anInt1680 * -1193058675) + i_620_;
				class107.aShortArray1301[i_618_] = (short) i_619_;
				class107.aShortArray1303[i_618_] = (short) i_620_;
				class107.aShortArray1302[i_618_] = (short) (method2326(i_623_, i_624_, -1820295574) + (is_602_ != null ? is_602_[i_618_] : 0));
				if (class107.aShortArray1304[i_618_] < 2)
					class107.aShortArray1304[i_618_] = (short) 2;
			}
			boolean bool_625_ = false;
			int i_626_ = 0;
			for (int i_627_ = 0; i_627_ < i_617_; i_627_++) {
				if (is_608_[i_627_] >= 0 || is_609_ != null && is_609_[i_627_] >= 0)
					i_626_++;
				int i_628_ = is_610_[i_627_];
				if (i_628_ != -1) {
					Class177 class177 = aClass178_Sub3_9746.aClass172_1916.method2895(i_628_, -2062855855);
					if (!class177.aBool1876) {
						bool_625_ = true;
						if (method15364(class177.aByte1905) || class177.aByte1885 != 0 || class177.aByte1886 != 0)
							class107.aByte1306 |= 0x4;
					}
				}
			}
			class107.anIntArray1310 = new int[i_626_];
			if (is_609_ != null)
				class107.anIntArray1311 = new int[i_626_];
			class107.aShortArray1305 = new short[i_626_];
			class107.aShortArray1307 = new short[i_626_];
			class107.aShortArray1298 = new short[i_626_];
			if (bool_625_) {
				class107.aShortArray1308 = new short[i_626_];
				class107.aShortArray1309 = new short[i_626_];
			}
			for (int i_629_ = 0; i_629_ < i_617_; i_629_++) {
				if (is_608_[i_629_] >= 0 || is_609_ != null && is_609_[i_629_] >= 0) {
					if (is_608_[i_629_] >= 0)
						class107.anIntArray1310[class107.aShort1299] = Class493.method8085(is_608_[i_629_], -506348752);
					else
						class107.anIntArray1310[class107.aShort1299] = -1;
					if (is_609_ != null) {
						if (is_609_[i_629_] != -1)
							class107.anIntArray1311[class107.aShort1299] = Class493.method8085(is_609_[i_629_], 829570186);
						else
							class107.anIntArray1311[class107.aShort1299] = -1;
					}
					class107.aShortArray1305[class107.aShort1299] = (short) is_605_[i_629_];
					class107.aShortArray1307[class107.aShort1299] = (short) is_606_[i_629_];
					class107.aShortArray1298[class107.aShort1299] = (short) is_607_[i_629_];
					if (bool_625_) {
						if (is_610_[i_629_] != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(is_610_[i_629_], 376978982).aBool1876)) {
							class107.aShortArray1308[class107.aShort1299] = (short) is_610_[i_629_];
							class107.aShortArray1309[class107.aShort1299] = (short) is_611_[i_629_];
						} else
							class107.aShortArray1308[class107.aShort1299] = (short) -1;
					}
					class107.aShort1299++;
				}
			}
			aClass107ArrayArray9749[i][i_601_] = class107;
		} else if (is_608_[0] >= 0 || is_609_ != null && is_609_[0] >= 0) {
			Class129 class129 = new Class129();
			int i_630_ = is_608_[0];
			int i_631_ = is_610_[0];
			if (is_609_ != null) {
				class129.anInt1546 = Class174.method2935(Class493.method8085(is_609_[0], -186371854), (aByteArrayArray9769[i][i_601_] - aByteArrayArray9770[i][i_601_]), 1530418723);
				if (i_630_ == -1)
					class129.aByte1550 |= 0x2;
			}
			if ((anIntArrayArray1684[i][i_601_] == anIntArrayArray1684[i + 1][i_601_]) && (anIntArrayArray1684[i][i_601_] == anIntArrayArray1684[i + 1][i_601_ + 1]) && (anIntArrayArray1684[i][i_601_] == anIntArrayArray1684[i][i_601_ + 1]))
				class129.aByte1550 |= 0x1;
			Class177 class177 = null;
			if (i_631_ != -1)
				class177 = aClass178_Sub3_9746.aClass172_1916.method2895(i_631_, 510634140);
			if (class177 != null && (class129.aByte1550 & 0x2) == 0 && !class177.aBool1876) {
				class129.aShort1547 = (short) (aByteArrayArray9769[i][i_601_] - aByteArrayArray9770[i][i_601_]);
				class129.aShort1548 = (short) (aByteArrayArray9769[i + 1][i_601_] - aByteArrayArray9770[i + 1][i_601_]);
				class129.aShort1549 = (short) (aByteArrayArray9769[i + 1][i_601_ + 1] - aByteArrayArray9770[i + 1][i_601_ + 1]);
				class129.aShort1551 = (short) (aByteArrayArray9769[i][i_601_ + 1] - aByteArrayArray9770[i][i_601_ + 1]);
				class129.aShort1552 = (short) i_631_;
				if (method15364(class177.aByte1905) || class177.aByte1885 != 0 || class177.aByte1886 != 0)
					class129.aByte1550 |= 0x4;
			} else {
				short i_632_ = Class493.method8085(i_630_, -749900708);
				class129.aShort1547 = (short) Class174.method2935(i_632_, ((aByteArrayArray9769[i][i_601_]) - (aByteArrayArray9770[i][i_601_])), 1530418723);
				class129.aShort1548 = (short) Class174.method2935(i_632_, ((aByteArrayArray9769[i + 1][i_601_]) - (aByteArrayArray9770[i + 1][i_601_])), 1530418723);
				class129.aShort1549 = (short) Class174.method2935(i_632_, ((aByteArrayArray9769[i + 1][i_601_ + 1]) - (aByteArrayArray9770[i + 1][i_601_ + 1])), 1530418723);
				class129.aShort1551 = (short) Class174.method2935(i_632_, ((aByteArrayArray9769[i][i_601_ + 1]) - (aByteArrayArray9770[i][i_601_ + 1])), 1530418723);
				class129.aShort1552 = (short) -1;
			}
			aClass129ArrayArray9747[i][i_601_] = class129;
		}
	}

	public void method2328(int i, int i_633_, int[] is, int[] is_634_, int[] is_635_, int[] is_636_, int[] is_637_, int[] is_638_, int[] is_639_, int[] is_640_, Class163 class163, boolean bool) {
		boolean bool_641_ = (anInt9759 & 0x20) == 0;
		if (aClass106ArrayArray9758 == null && !bool_641_) {
			aClass106ArrayArray9758 = new Class106[anInt1683 * 692304099][anInt1681 * 452998539];
			aClass94ArrayArray9751 = new Class94[anInt1683 * 692304099][anInt1681 * 452998539];
		} else if (aClass124ArrayArray9752 == null && bool_641_)
			aClass124ArrayArray9752 = new Class124[anInt1683 * 692304099][anInt1681 * 452998539];
		else if (aClass129ArrayArray9747 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_642_ = 0; i_642_ < is_637_.length; i_642_++) {
				if (is_637_[i_642_] == -1)
					is_637_[i_642_] = 0;
				else
					is_637_[i_642_] = (Class638.anIntArray8306[(Class493.method8085(is_637_[i_642_], 708194021) & 0xffff)]) << 8 | 0xff;
			}
			if (is_638_ != null) {
				for (int i_643_ = 0; i_643_ < is_638_.length; i_643_++) {
					if (is_638_[i_643_] == -1)
						is_638_[i_643_] = 0;
					else
						is_638_[i_643_] = ((Class638.anIntArray8306[Class493.method8085(is_638_[i_643_], -382981949) & 0xffff]) << 8) | 0xff;
				}
			}
			if (bool_641_) {
				Class124 class124 = new Class124();
				class124.aShort1516 = (short) is.length;
				class124.aShort1525 = (short) (is.length / 3);
				class124.aShortArray1517 = new short[class124.aShort1516];
				class124.aShortArray1518 = new short[class124.aShort1516];
				class124.aShortArray1522 = new short[class124.aShort1516];
				class124.anIntArray1519 = new int[class124.aShort1516];
				class124.aShortArray1520 = new short[class124.aShort1516];
				class124.aShortArray1515 = new short[class124.aShort1516];
				class124.aByteArray1524 = new byte[class124.aShort1516];
				if (is_636_ != null)
					class124.aShortArray1523 = new short[class124.aShort1516];
				for (int i_644_ = 0; i_644_ < class124.aShort1516; i_644_++) {
					int i_645_ = is[i_644_];
					int i_646_ = is_635_[i_644_];
					boolean bool_647_ = false;
					int i_648_;
					if (i_645_ == 0 && i_646_ == 0)
						i_648_ = (aByteArrayArray9769[i][i_633_] - aByteArrayArray9770[i][i_633_]);
					else if (i_645_ == 0 && i_646_ == anInt1682 * 341909049)
						i_648_ = (aByteArrayArray9769[i][i_633_ + 1] - aByteArrayArray9770[i][i_633_ + 1]);
					else if (i_645_ == anInt1682 * 341909049 && i_646_ == anInt1682 * 341909049)
						i_648_ = (aByteArrayArray9769[i + 1][i_633_ + 1] - aByteArrayArray9770[i + 1][i_633_ + 1]);
					else if (i_645_ == anInt1682 * 341909049 && i_646_ == 0)
						i_648_ = (aByteArrayArray9769[i + 1][i_633_] - aByteArrayArray9770[i + 1][i_633_]);
					else {
						int i_649_ = (((aByteArrayArray9769[i][i_633_] - aByteArrayArray9770[i][i_633_]) * (anInt1682 * 341909049 - i_645_)) + ((aByteArrayArray9769[i + 1][i_633_] - aByteArrayArray9770[i + 1][i_633_]) * i_645_));
						int i_650_ = (((aByteArrayArray9769[i][i_633_ + 1] - aByteArrayArray9770[i][i_633_ + 1]) * (anInt1682 * 341909049 - i_645_)) + ((aByteArrayArray9769[i + 1][i_633_ + 1] - aByteArrayArray9770[i + 1][i_633_ + 1]) * i_645_));
						i_648_ = (i_649_ * (anInt1682 * 341909049 - i_646_) + i_650_ * i_646_) >> anInt1680 * 1908849946;
					}
					int i_651_ = (i << anInt1680 * -1193058675) + i_645_;
					int i_652_ = (i_633_ << anInt1680 * -1193058675) + i_646_;
					class124.aShortArray1517[i_644_] = (short) i_645_;
					class124.aShortArray1522[i_644_] = (short) i_646_;
					class124.aShortArray1518[i_644_] = (short) (method2326(i_651_, i_652_, -1385675900) + (is_634_ != null ? is_634_[i_644_] : 0));
					if (i_648_ < 0)
						i_648_ = 0;
					if (is_637_[i_644_] == 0) {
						class124.anIntArray1519[i_644_] = 0;
						if (is_638_ != null)
							class124.aByteArray1524[i_644_] = (byte) i_648_;
					} else {
						int i_653_ = 0;
						if (is_636_ != null) {
							int i_654_ = (class124.aShortArray1523[i_644_] = (short) is_636_[i_644_]);
							if (class163.anInt1775 * -118212955 != 0) {
								i_653_ = 255 * i_654_ / (class163.anInt1775 * -118212955);
								if (i_653_ < 0)
									i_653_ = 0;
								else if (i_653_ > 255)
									i_653_ = 255;
							}
						}
						int i_655_ = -16777216;
						if (is_639_[i_644_] != -1) {
							Class177 class177 = aClass178_Sub3_9746.aClass172_1916.method2895(is_639_[i_644_], -339076559);
							if (class177.aBool1881 && method15364(class177.aByte1905))
								i_655_ = -1694498816;
						}
						class124.anIntArray1519[i_644_] = i_655_ | (Class381.method6408(method15351(is_637_[i_644_] >> 8, i_648_), class163.anInt1776 * -319632409, i_653_, -1532260199));
						if (is_638_ != null)
							class124.aByteArray1524[i_644_] = (byte) i_648_;
					}
					class124.aShortArray1520[i_644_] = (short) is_639_[i_644_];
					class124.aShortArray1515[i_644_] = (short) is_640_[i_644_];
				}
				if (is_638_ != null) {
					class124.anIntArray1521 = new int[class124.aShort1525];
					for (int i_656_ = 0; i_656_ < class124.aShort1525; i_656_++) {
						int i_657_ = i_656_ * 3;
						if (is_638_[i_657_] != 0)
							class124.anIntArray1521[i_656_] = ~0xffffff | is_638_[i_657_] >> 8;
					}
				}
				aClass124ArrayArray9752[i][i_633_] = class124;
			} else {
				boolean bool_658_ = true;
				int i_659_ = -1;
				int i_660_ = -1;
				int i_661_ = -1;
				int i_662_ = -1;
				if (is.length == 6) {
					for (int i_663_ = 0; i_663_ < 6; i_663_++) {
						if (is[i_663_] == 0 && is_635_[i_663_] == 0) {
							if (i_659_ != -1 && is_637_[i_659_] != is_637_[i_663_]) {
								bool_658_ = false;
								break;
							}
							i_659_ = i_663_;
						} else if (is[i_663_] == anInt1682 * 341909049 && is_635_[i_663_] == 0) {
							if (i_660_ != -1 && is_637_[i_660_] != is_637_[i_663_]) {
								bool_658_ = false;
								break;
							}
							i_660_ = i_663_;
						} else if (is[i_663_] == anInt1682 * 341909049 && (is_635_[i_663_] == anInt1682 * 341909049)) {
							if (i_661_ != -1 && is_637_[i_661_] != is_637_[i_663_]) {
								bool_658_ = false;
								break;
							}
							i_661_ = i_663_;
						} else if (is[i_663_] == 0 && (is_635_[i_663_] == anInt1682 * 341909049)) {
							if (i_662_ != -1 && is_637_[i_662_] != is_637_[i_663_]) {
								bool_658_ = false;
								break;
							}
							i_662_ = i_663_;
						}
					}
					if (i_659_ == -1 || i_660_ == -1 || i_661_ == -1 || i_662_ == -1)
						bool_658_ = false;
					if (bool_658_) {
						if (is_634_ != null) {
							for (int i_664_ = 0; i_664_ < 4; i_664_++) {
								if (is_634_[i_664_] != 0) {
									bool_658_ = false;
									break;
								}
							}
						}
						if (bool_658_) {
							for (int i_665_ = 1; i_665_ < 4; i_665_++) {
								if (is[i_665_] != is[0] && (is[i_665_] != is[0] + anInt1682 * 341909049) && (is[i_665_] != is[0] - anInt1682 * 341909049)) {
									bool_658_ = false;
									break;
								}
								if (is_635_[i_665_] != is_635_[0] && (is_635_[i_665_] != is_635_[0] + anInt1682 * 341909049) && (is_635_[i_665_] != (is_635_[0] - anInt1682 * 341909049))) {
									bool_658_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_658_ = false;
				if (bool_658_) {
					Class106 class106 = new Class106();
					int i_666_ = is_637_[0];
					int i_667_ = is_639_[0];
					if (is_638_ != null) {
						class106.anInt1296 = is_638_[0] >> 8;
						if (i_666_ == 0)
							class106.aByte1292 |= 0x2;
					} else if (i_666_ == 0)
						return;
					if ((anIntArrayArray1684[i][i_633_] == anIntArrayArray1684[i + 1][i_633_]) && (anIntArrayArray1684[i][i_633_] == anIntArrayArray1684[i + 1][i_633_ + 1]) && (anIntArrayArray1684[i][i_633_] == anIntArrayArray1684[i][i_633_ + 1]))
						class106.aByte1292 |= 0x1;
					if (i_667_ != -1 && (class106.aByte1292 & 0x2) == 0 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_667_, -192791741).aBool1876)) {
						int i_668_;
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_668_ = 255 * is_636_[i_659_] / (class163.anInt1775 * -118212955);
							if (i_668_ < 0)
								i_668_ = 0;
							else if (i_668_ > 255)
								i_668_ = 255;
						} else
							i_668_ = 0;
						class106.anInt1288 = (Class381.method6408(method15351(is_637_[i_659_] >> 8, (aByteArrayArray9769[i][i_633_] - (aByteArrayArray9770[i][i_633_]))), class163.anInt1776 * -319632409, i_668_, -1255224579));
						if (class106.anInt1296 != 0)
							class106.anInt1288 |= (255 - (aByteArrayArray9769[i][i_633_] - aByteArrayArray9770[i][i_633_]) << 25);
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_668_ = 255 * is_636_[i_660_] / (class163.anInt1775 * -118212955);
							if (i_668_ < 0)
								i_668_ = 0;
							else if (i_668_ > 255)
								i_668_ = 255;
						} else
							i_668_ = 0;
						class106.anInt1287 = (Class381.method6408(method15351(is_637_[i_660_] >> 8, (aByteArrayArray9769[i + 1][i_633_] - (aByteArrayArray9770[i + 1][i_633_]))), class163.anInt1776 * -319632409, i_668_, -610849909));
						if (class106.anInt1296 != 0)
							class106.anInt1287 |= 255 - (aByteArrayArray9769[i + 1][i_633_] - (aByteArrayArray9770[i + 1][i_633_])) << 25;
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_668_ = 255 * is_636_[i_661_] / (class163.anInt1775 * -118212955);
							if (i_668_ < 0)
								i_668_ = 0;
							else if (i_668_ > 255)
								i_668_ = 255;
						} else
							i_668_ = 0;
						class106.anInt1289 = (Class381.method6408(method15351(is_637_[i_661_] >> 8, ((aByteArrayArray9769[i + 1][i_633_ + 1]) - (aByteArrayArray9770[i + 1][i_633_ + 1]))), class163.anInt1776 * -319632409, i_668_, -1583290946));
						if (class106.anInt1296 != 0)
							class106.anInt1289 |= (255 - (aByteArrayArray9769[i + 1][i_633_ + 1] - (aByteArrayArray9770[i + 1][i_633_ + 1]))) << 25;
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_668_ = 255 * is_636_[i_662_] / (class163.anInt1775 * -118212955);
							if (i_668_ < 0)
								i_668_ = 0;
							else if (i_668_ > 255)
								i_668_ = 255;
						} else
							i_668_ = 0;
						class106.anInt1291 = (Class381.method6408(method15351(is_637_[i_662_] >> 8, (aByteArrayArray9769[i][i_633_ + 1] - (aByteArrayArray9770[i][i_633_ + 1]))), class163.anInt1776 * -319632409, i_668_, -1291601492));
						class106.aShort1297 = (short) i_667_;
					} else {
						int i_669_;
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_669_ = 255 * is_636_[i_659_] / (class163.anInt1775 * -118212955);
							if (i_669_ < 0)
								i_669_ = 0;
							else if (i_669_ > 255)
								i_669_ = 255;
						} else
							i_669_ = 0;
						class106.anInt1288 = (Class381.method6408(method15351(is_637_[i_659_] >> 8, (aByteArrayArray9769[i][i_633_] - (aByteArrayArray9770[i][i_633_]))), class163.anInt1776 * -319632409, i_669_, -1320545817));
						if (class106.anInt1296 != 0)
							class106.anInt1288 |= (255 - (aByteArrayArray9769[i][i_633_] - aByteArrayArray9770[i][i_633_]) << 25);
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_669_ = 255 * is_636_[i_660_] / (class163.anInt1775 * -118212955);
							if (i_669_ < 0)
								i_669_ = 0;
							else if (i_669_ > 255)
								i_669_ = 255;
						} else
							i_669_ = 0;
						class106.anInt1287 = (Class381.method6408(method15351(is_637_[i_660_] >> 8, (aByteArrayArray9769[i + 1][i_633_] - (aByteArrayArray9770[i + 1][i_633_]))), class163.anInt1776 * -319632409, i_669_, -857189513));
						if (class106.anInt1296 != 0)
							class106.anInt1287 |= 255 - (aByteArrayArray9769[i + 1][i_633_] - (aByteArrayArray9770[i + 1][i_633_])) << 25;
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_669_ = 255 * is_636_[i_661_] / (class163.anInt1775 * -118212955);
							if (i_669_ < 0)
								i_669_ = 0;
							else if (i_669_ > 255)
								i_669_ = 255;
						} else
							i_669_ = 0;
						class106.anInt1289 = (Class381.method6408(method15351(is_637_[i_661_] >> 8, ((aByteArrayArray9769[i + 1][i_633_ + 1]) - (aByteArrayArray9770[i + 1][i_633_ + 1]))), class163.anInt1776 * -319632409, i_669_, -1823084102));
						if (class106.anInt1296 != 0)
							class106.anInt1289 |= (255 - (aByteArrayArray9769[i + 1][i_633_ + 1] - (aByteArrayArray9770[i + 1][i_633_ + 1]))) << 25;
						if (is_636_ != null && class163.anInt1775 * -118212955 != 0) {
							i_669_ = 255 * is_636_[i_662_] / (class163.anInt1775 * -118212955);
							if (i_669_ < 0)
								i_669_ = 0;
							else if (i_669_ > 255)
								i_669_ = 255;
						} else
							i_669_ = 0;
						class106.anInt1291 = (Class381.method6408(method15351(is_637_[i_662_] >> 8, (aByteArrayArray9769[i][i_633_ + 1] - (aByteArrayArray9770[i][i_633_ + 1]))), class163.anInt1776 * -319632409, i_669_, -2058284704));
						if (class106.anInt1296 != 0)
							class106.anInt1291 |= 255 - (aByteArrayArray9769[i][i_633_ + 1] - (aByteArrayArray9770[i][i_633_ + 1])) << 25;
						class106.aShort1297 = (short) -1;
					}
					if (is_636_ != null) {
						class106.aShort1294 = (short) is_636_[i_661_];
						class106.aShort1295 = (short) is_636_[i_662_];
						class106.aShort1293 = (short) is_636_[i_660_];
						class106.aShort1290 = (short) is_636_[i_659_];
					}
					aClass106ArrayArray9758[i][i_633_] = class106;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1152 = (short) is.length;
					class94.aShort1161 = (short) (is.length / 3);
					class94.aShortArray1154 = new short[class94.aShort1152];
					class94.aShortArray1151 = new short[class94.aShort1152];
					class94.aShortArray1156 = new short[class94.aShort1152];
					class94.anIntArray1158 = new int[class94.aShort1152];
					if (is_636_ != null)
						class94.aShortArray1157 = new short[class94.aShort1152];
					for (int i_670_ = 0; i_670_ < class94.aShort1152; i_670_++) {
						int i_671_ = is[i_670_];
						int i_672_ = is_635_[i_670_];
						boolean bool_673_ = false;
						int i_674_;
						if (i_671_ == 0 && i_672_ == 0)
							i_674_ = (aByteArrayArray9769[i][i_633_] - aByteArrayArray9770[i][i_633_]);
						else if (i_671_ == 0 && i_672_ == anInt1682 * 341909049)
							i_674_ = (aByteArrayArray9769[i][i_633_ + 1] - aByteArrayArray9770[i][i_633_ + 1]);
						else if (i_671_ == anInt1682 * 341909049 && i_672_ == anInt1682 * 341909049)
							i_674_ = (aByteArrayArray9769[i + 1][i_633_ + 1] - aByteArrayArray9770[i + 1][i_633_ + 1]);
						else if (i_671_ == anInt1682 * 341909049 && i_672_ == 0)
							i_674_ = (aByteArrayArray9769[i + 1][i_633_] - aByteArrayArray9770[i + 1][i_633_]);
						else {
							int i_675_ = (((aByteArrayArray9769[i][i_633_] - aByteArrayArray9770[i][i_633_]) * (anInt1682 * 341909049 - i_671_)) + ((aByteArrayArray9769[i + 1][i_633_] - aByteArrayArray9770[i + 1][i_633_]) * i_671_));
							int i_676_ = (((aByteArrayArray9769[i][i_633_ + 1] - aByteArrayArray9770[i][i_633_ + 1]) * (anInt1682 * 341909049 - i_671_)) + (aByteArrayArray9769[i + 1][i_633_ + 1] - (aByteArrayArray9770[i + 1][i_633_ + 1])) * i_671_);
							i_674_ = (i_675_ * (anInt1682 * 341909049 - i_672_) + i_676_ * i_672_ >> anInt1680 * 1908849946);
						}
						int i_677_ = (i << anInt1680 * -1193058675) + i_671_;
						int i_678_ = (i_633_ << anInt1680 * -1193058675) + i_672_;
						class94.aShortArray1154[i_670_] = (short) i_671_;
						class94.aShortArray1156[i_670_] = (short) i_672_;
						class94.aShortArray1151[i_670_] = (short) (method2326(i_677_, i_678_, 1496647048) + (is_634_ != null ? is_634_[i_670_] : 0));
						if (i_674_ < 0)
							i_674_ = 0;
						if (is_637_[i_670_] == 0) {
							if (is_638_ != null)
								class94.anIntArray1158[i_670_] = i_674_ << 25;
							else
								class94.anIntArray1158[i_670_] = 0;
						} else {
							int i_679_ = 0;
							if (is_636_ != null) {
								int i_680_ = (class94.aShortArray1157[i_670_] = (short) is_636_[i_670_]);
								if (class163.anInt1775 * -118212955 != 0) {
									i_679_ = 255 * i_680_ / (class163.anInt1775 * -118212955);
									if (i_679_ < 0)
										i_679_ = 0;
									else if (i_679_ > 255)
										i_679_ = 255;
								}
							}
							class94.anIntArray1158[i_670_] = (Class381.method6408(method15351(is_637_[i_670_] >> 8, i_674_), class163.anInt1776 * -319632409, i_679_, -669846641));
							if (is_638_ != null)
								class94.anIntArray1158[i_670_] |= i_674_ << 25;
						}
					}
					boolean bool_681_ = false;
					for (int i_682_ = 0; i_682_ < class94.aShort1161; i_682_++) {
						if (is_639_[i_682_ * 3] != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(is_639_[i_682_ * 3], 135837088).aBool1876))
							bool_681_ = true;
					}
					if (is_638_ != null)
						class94.anIntArray1160 = new int[class94.aShort1161];
					if (bool_681_) {
						class94.aShortArray1155 = new short[class94.aShort1161];
						class94.aShortArray1159 = new short[class94.aShort1161];
					}
					for (int i_683_ = 0; i_683_ < class94.aShort1161; i_683_++) {
						int i_684_ = i_683_ * 3;
						if (is_638_ != null && is_638_[i_684_] != 0)
							class94.anIntArray1160[i_683_] = is_638_[i_684_] >> 8;
						if (bool_681_) {
							int i_685_ = i_684_ + 1;
							int i_686_ = i_685_ + 1;
							boolean bool_687_ = false;
							boolean bool_688_ = true;
							int i_689_ = is_639_[i_684_];
							if (i_689_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, -1405787043).aBool1876))
								bool_688_ = false;
							else
								bool_687_ = true;
							i_689_ = is_639_[i_685_];
							if (i_689_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, -536342159).aBool1876))
								bool_688_ = false;
							else
								bool_687_ = true;
							i_689_ = is_639_[i_686_];
							if (i_689_ == -1 || (aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, 349262894).aBool1876))
								bool_688_ = false;
							else
								bool_687_ = true;
							if (bool_688_) {
								class94.aShortArray1155[i_683_] = (short) i_689_;
								class94.aShortArray1159[i_683_] = (short) is_640_[i_684_];
							} else {
								if (bool_687_) {
									i_689_ = is_639_[i_684_];
									if (i_689_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, 367181835).aBool1876))
										class94.anIntArray1158[i_684_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, 285364655).aShort1907) & 0xffff, -593983673)) & 0xffff]);
									i_689_ = is_639_[i_685_];
									if (i_689_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, -1911245690).aBool1876))
										class94.anIntArray1158[i_685_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, 500600697).aShort1907) & 0xffff, 532817612)) & 0xffff]);
									i_689_ = is_639_[i_686_];
									if (i_689_ != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, 545382221).aBool1876))
										class94.anIntArray1158[i_686_] = (Class638.anIntArray8306[(Class493.method8085((aClass178_Sub3_9746.aClass172_1916.method2895(i_689_, -514210757).aShort1907) & 0xffff, 323355415)) & 0xffff]);
								}
								class94.aShortArray1155[i_683_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9751[i][i_633_] = class94;
				}
			}
		}
	}

	public void method2320(int i, int i_690_, int i_691_) {
		i = Math.min(aByteArrayArray9770.length - 1, Math.max(0, i));
		i_690_ = Math.min(aByteArrayArray9770[i].length - 1, Math.max(0, i_690_));
		if (aByteArrayArray9770[i][i_690_] < i_691_)
			aByteArrayArray9770[i][i_690_] = (byte) i_691_;
	}

	static int method15360(int i, int i_692_) {
		int i_693_ = (i & 0xff0000) * i_692_ >> 23;
		if (i_693_ < 2)
			i_693_ = 2;
		else if (i_693_ > 253)
			i_693_ = 253;
		int i_694_ = (i & 0xff00) * i_692_ >> 15;
		if (i_694_ < 2)
			i_694_ = 2;
		else if (i_694_ > 253)
			i_694_ = 253;
		int i_695_ = (i & 0xff) * i_692_ >> 7;
		if (i_695_ < 2)
			i_695_ = 2;
		else if (i_695_ > 253)
			i_695_ = 253;
		return i_693_ << 16 | i_694_ << 8 | i_695_;
	}

	static int method15361(int i, int i_696_) {
		int i_697_ = (i & 0xff0000) * i_696_ >> 23;
		if (i_697_ < 2)
			i_697_ = 2;
		else if (i_697_ > 253)
			i_697_ = 253;
		int i_698_ = (i & 0xff00) * i_696_ >> 15;
		if (i_698_ < 2)
			i_698_ = 2;
		else if (i_698_ > 253)
			i_698_ = 253;
		int i_699_ = (i & 0xff) * i_696_ >> 7;
		if (i_699_ < 2)
			i_699_ = 2;
		else if (i_699_ > 253)
			i_699_ = 253;
		return i_697_ << 16 | i_698_ << 8 | i_699_;
	}

	public void method2340() {
		aByteArrayArray9769 = null;
		aByteArrayArray9770 = null;
	}

	public void method2342(int i, int i_700_, int i_701_, boolean[][] bools, boolean bool, int i_702_) {
		if (aClass178_Sub3_9746.anIntArray9804 == null || aClass178_Sub3_9746.aFloatArray9807 == null)
			throw new IllegalStateException("");
		Class441 class441 = aClass178_Sub3_9746.aClass441_9821;
		aFloat9753 = class441.aFloatArray4916[0];
		aFloat9771 = class441.aFloatArray4916[1];
		aFloat9755 = class441.aFloatArray4916[2];
		aFloat9756 = class441.aFloatArray4916[3];
		aFloat9757 = class441.aFloatArray4916[4];
		aFloat9748 = class441.aFloatArray4916[5];
		aFloat9773 = class441.aFloatArray4916[6];
		aFloat9754 = class441.aFloatArray4916[7];
		aFloat9741 = class441.aFloatArray4916[8];
		aFloat9762 = class441.aFloatArray4916[9];
		aFloat9750 = class441.aFloatArray4916[10];
		aFloat9764 = class441.aFloatArray4916[11];
		aFloat9765 = class441.aFloatArray4916[12];
		aFloat9761 = class441.aFloatArray4916[13];
		aFloat9767 = class441.aFloatArray4916[14];
		aFloat9768 = class441.aFloatArray4916[15];
		for (int i_703_ = 0; i_703_ < i_701_ + i_701_; i_703_++) {
			for (int i_704_ = 0; i_704_ < i_701_ + i_701_; i_704_++) {
				if (bools[i_703_][i_704_]) {
					int i_705_ = i - i_701_ + i_703_;
					int i_706_ = i_700_ - i_701_ + i_704_;
					if (i_705_ >= 0 && i_705_ < anInt1683 * 692304099 && i_706_ >= 0 && i_706_ < anInt1681 * 452998539)
						method15352(i_705_, i_706_, i_702_);
				}
			}
		}
	}

	void method15362(int i, int i_707_, int i_708_, int i_709_, int i_710_, int i_711_, int i_712_, boolean[][] bools, Class99 class99, Class118 class118, float[] fs, float[] fs_713_) {
		int i_714_ = (i_712_ - i_710_) * i_708_ / 256;
		int i_715_ = i_708_ >> 8;
		boolean bool = class99.aBool1186;
		aClass178_Sub3_9746.method3287(false);
		class118.aBool1465 = false;
		class118.aBool1437 = false;
		int i_716_ = i;
		int i_717_ = i_707_ + i_714_;
		for (int i_718_ = i_709_; i_718_ < i_711_; i_718_++) {
			for (int i_719_ = i_710_; i_719_ < i_712_; i_719_++) {
				if (bools[i_718_ - i_709_][i_719_ - i_710_]) {
					if (aClass129ArrayArray9747[i_718_][i_719_] != null) {
						Class129 class129 = aClass129ArrayArray9747[i_718_][i_719_];
						if (class129.aShort1552 != -1 && (class129.aByte1550 & 0x2) == 0 && class129.anInt1546 == -1) {
							int i_720_ = aClass178_Sub3_9746.method15416((class129.aShort1552) & 0xffff);
							class118.method2033(true, true, false, (float) (i_717_ - i_715_), (float) (i_717_ - i_715_), (float) i_717_, (float) (i_716_ + i_715_), (float) i_716_, (float) (i_716_ + i_715_), 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_720_, ((class129.aShort1549) & 0xffff), 1530418723), (float) Class174.method2935(i_720_, ((class129.aShort1551) & 0xffff), 1530418723), (float) Class174.method2935(i_720_, ((class129.aShort1548) & 0xffff), 1530418723));
							class118.method2033(true, true, false, (float) i_717_, (float) i_717_, (float) (i_717_ - i_715_), (float) i_716_, (float) (i_716_ + i_715_), (float) i_716_, 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_720_, ((class129.aShort1547) & 0xffff), 1530418723), (float) Class174.method2935(i_720_, ((class129.aShort1548) & 0xffff), 1530418723), (float) Class174.method2935(i_720_, ((class129.aShort1551) & 0xffff), 1530418723));
						} else if (class129.anInt1546 == -1) {
							class118.method2033(true, true, false, (float) (i_717_ - i_715_), (float) (i_717_ - i_715_), (float) i_717_, (float) (i_716_ + i_715_), (float) i_716_, (float) (i_716_ + i_715_), 100.0F, 100.0F, 100.0F, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
							class118.method2033(true, true, false, (float) i_717_, (float) i_717_, (float) (i_717_ - i_715_), (float) i_716_, (float) (i_716_ + i_715_), (float) i_716_, 100.0F, 100.0F, 100.0F, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
						} else {
							int i_721_ = class129.anInt1546;
							class118.method2033(true, true, false, (float) (i_717_ - i_715_), (float) (i_717_ - i_715_), (float) i_717_, (float) (i_716_ + i_715_), (float) i_716_, (float) (i_716_ + i_715_), 100.0F, 100.0F, 100.0F, (float) i_721_, (float) i_721_, (float) i_721_);
							class118.method2033(true, true, false, (float) i_717_, (float) i_717_, (float) (i_717_ - i_715_), (float) i_716_, (float) (i_716_ + i_715_), (float) i_716_, 100.0F, 100.0F, 100.0F, (float) i_721_, (float) i_721_, (float) i_721_);
						}
					} else if (aClass107ArrayArray9749[i_718_][i_719_] != null) {
						Class107 class107 = aClass107ArrayArray9749[i_718_][i_719_];
						for (int i_722_ = 0; i_722_ < class107.aShort1300; i_722_++) {
							fs[i_722_] = (float) (i_716_ + (class107.aShortArray1301[i_722_] * i_715_ / (anInt1682 * 341909049)));
							fs_713_[i_722_] = (float) (i_717_ - (class107.aShortArray1303[i_722_] * i_715_ / (anInt1682 * 341909049)));
						}
						for (int i_723_ = 0; i_723_ < class107.aShort1299; i_723_++) {
							short i_724_ = class107.aShortArray1305[i_723_];
							short i_725_ = class107.aShortArray1307[i_723_];
							short i_726_ = class107.aShortArray1298[i_723_];
							float f = fs[i_724_];
							float f_727_ = fs[i_725_];
							float f_728_ = fs[i_726_];
							float f_729_ = fs_713_[i_724_];
							float f_730_ = fs_713_[i_725_];
							float f_731_ = fs_713_[i_726_];
							if (class107.anIntArray1311 != null && class107.anIntArray1311[i_723_] != -1) {
								int i_732_ = class107.anIntArray1311[i_723_];
								class118.method2033(true, true, false, f_729_, f_730_, f_731_, f, f_727_, f_728_, 100.0F, 100.0F, 100.0F, (float) (Class174.method2935(i_732_, (class107.aShortArray1304[i_724_]), 1530418723)), (float) (Class174.method2935(i_732_, (class107.aShortArray1304[i_725_]), 1530418723)), (float) (Class174.method2935(i_732_, (class107.aShortArray1304[i_726_]), 1530418723)));
							} else if (class107.aShortArray1308 != null && (class107.aShortArray1308[i_723_] != -1)) {
								int i_733_ = (aClass178_Sub3_9746.method15416(class107.aShortArray1308[i_723_] & 0xffff));
								class118.method2033(true, true, false, f_729_, f_730_, f_731_, f, f_727_, f_728_, 100.0F, 100.0F, 100.0F, (float) (Class174.method2935(i_733_, (class107.aShortArray1304[i_724_]), 1530418723)), (float) (Class174.method2935(i_733_, (class107.aShortArray1304[i_725_]), 1530418723)), (float) (Class174.method2935(i_733_, (class107.aShortArray1304[i_726_]), 1530418723)));
							} else {
								int i_734_ = class107.anIntArray1310[i_723_];
								class118.method2033(true, true, false, f_729_, f_730_, f_731_, f, f_727_, f_728_, 100.0F, 100.0F, 100.0F, (float) (Class174.method2935(i_734_, (class107.aShortArray1304[i_724_]), 1530418723)), (float) (Class174.method2935(i_734_, (class107.aShortArray1304[i_725_]), 1530418723)), (float) (Class174.method2935(i_734_, (class107.aShortArray1304[i_726_]), 1530418723)));
							}
						}
					}
				}
				i_717_ -= i_715_;
			}
			i_717_ = i_707_ + i_714_;
			i_716_ += i_715_;
		}
		class118.aBool1465 = true;
		aClass178_Sub3_9746.method3287(bool);
	}

	public void method2343(int i, int i_735_, int i_736_, boolean[][] bools, boolean bool, int i_737_) {
		if (aClass178_Sub3_9746.anIntArray9804 == null || aClass178_Sub3_9746.aFloatArray9807 == null)
			throw new IllegalStateException("");
		Class441 class441 = aClass178_Sub3_9746.aClass441_9821;
		aFloat9753 = class441.aFloatArray4916[0];
		aFloat9771 = class441.aFloatArray4916[1];
		aFloat9755 = class441.aFloatArray4916[2];
		aFloat9756 = class441.aFloatArray4916[3];
		aFloat9757 = class441.aFloatArray4916[4];
		aFloat9748 = class441.aFloatArray4916[5];
		aFloat9773 = class441.aFloatArray4916[6];
		aFloat9754 = class441.aFloatArray4916[7];
		aFloat9741 = class441.aFloatArray4916[8];
		aFloat9762 = class441.aFloatArray4916[9];
		aFloat9750 = class441.aFloatArray4916[10];
		aFloat9764 = class441.aFloatArray4916[11];
		aFloat9765 = class441.aFloatArray4916[12];
		aFloat9761 = class441.aFloatArray4916[13];
		aFloat9767 = class441.aFloatArray4916[14];
		aFloat9768 = class441.aFloatArray4916[15];
		for (int i_738_ = 0; i_738_ < i_736_ + i_736_; i_738_++) {
			for (int i_739_ = 0; i_739_ < i_736_ + i_736_; i_739_++) {
				if (bools[i_738_][i_739_]) {
					int i_740_ = i - i_736_ + i_738_;
					int i_741_ = i_735_ - i_736_ + i_739_;
					if (i_740_ >= 0 && i_740_ < anInt1683 * 692304099 && i_741_ >= 0 && i_741_ < anInt1681 * 452998539)
						method15352(i_740_, i_741_, i_737_);
				}
			}
		}
	}

	void method15363(int i, int i_742_, int i_743_) {
		Class99 class99 = aClass178_Sub3_9746.method15475(Thread.currentThread());
		class99.aClass118_1200.anInt1438 = 0;
		if (aClass106ArrayArray9758 != null)
			method15354(i, i_742_, class99.aBool1204, class99, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_743_);
		else if (aClass129ArrayArray9747 != null)
			method15353(i, i_742_, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_743_);
		else if (aClass124ArrayArray9752 != null)
			method15355(i, i_742_, class99.aBool1204, class99, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_743_);
	}

	public void method2345(int i, int i_744_, int i_745_, int i_746_, int i_747_, int i_748_, int i_749_, boolean[][] bools) {
		Class99 class99 = aClass178_Sub3_9746.method15475(Thread.currentThread());
		Class118 class118 = class99.aClass118_1200;
		class118.anInt1438 = 0;
		class118.aBool1455 = true;
		aClass178_Sub3_9746.method15420();
		if (aClass106ArrayArray9758 != null || aClass124ArrayArray9752 != null)
			method15359(i, i_744_, i_745_, i_746_, i_747_, i_748_, i_749_, bools, class99, class118, class99.aFloatArray1201, class99.aFloatArray1227);
		else if (aClass129ArrayArray9747 != null)
			method15358(i, i_744_, i_745_, i_746_, i_747_, i_748_, i_749_, bools, class99, class118, class99.aFloatArray1201, class99.aFloatArray1227);
	}

	boolean method15364(int i) {
		if ((anInt9759 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public boolean method2352(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_750_, int i_751_, int i_752_, boolean bool) {
		return false;
	}

	void method15365(int i, int i_753_, Class118 class118, float[] fs, float[] fs_754_, float[] fs_755_, float[] fs_756_, float[] fs_757_, int i_758_) {
		Class129 class129 = aClass129ArrayArray9747[i][i_753_];
		if (class129 != null) {
			if ((class129.aByte1550 & 0x2) == 0) {
				if (i_758_ != 0) {
					if ((class129.aByte1550 & 0x4) != 0) {
						if ((i_758_ & 0x1) != 0)
							return;
					} else if ((i_758_ & 0x2) != 0)
						return;
				}
				int i_759_ = i * (anInt1682 * 341909049);
				int i_760_ = i_759_ + anInt1682 * 341909049;
				int i_761_ = i_753_ * (anInt1682 * 341909049);
				int i_762_ = i_761_ + anInt1682 * 341909049;
				float f;
				float f_763_;
				float f_764_;
				float f_765_;
				float f_766_;
				float f_767_;
				float f_768_;
				float f_769_;
				float f_770_;
				float f_771_;
				float f_772_;
				float f_773_;
				float f_774_;
				float f_775_;
				float f_776_;
				float f_777_;
				if ((class129.aByte1550 & 0x1) != 0) {
					int i_778_ = anIntArrayArray1684[i][i_753_];
					float f_779_ = aFloat9773 * (float) i_778_;
					float f_780_ = aFloat9754 * (float) i_778_;
					float f_781_ = aFloat9767 + (aFloat9755 * (float) i_759_ + f_779_ + aFloat9750 * (float) i_761_);
					f = aFloat9768 + (aFloat9756 * (float) i_759_ + f_780_ + aFloat9764 * (float) i_761_);
					if (f_781_ < -f)
						return;
					float f_782_ = aFloat9767 + (aFloat9755 * (float) i_760_ + f_779_ + aFloat9750 * (float) i_761_);
					f_763_ = aFloat9768 + (aFloat9756 * (float) i_760_ + f_780_ + aFloat9764 * (float) i_761_);
					if (f_782_ < -f_763_)
						return;
					float f_783_ = aFloat9767 + (aFloat9755 * (float) i_760_ + f_779_ + aFloat9750 * (float) i_762_);
					f_764_ = aFloat9768 + (aFloat9756 * (float) i_760_ + f_780_ + aFloat9764 * (float) i_762_);
					if (f_783_ < -f_764_)
						return;
					float f_784_ = aFloat9767 + (aFloat9755 * (float) i_759_ + f_779_ + aFloat9750 * (float) i_762_);
					f_765_ = aFloat9768 + (aFloat9756 * (float) i_759_ + f_780_ + aFloat9764 * (float) i_762_);
					if (f_784_ < -f_765_)
						return;
					float f_785_ = aFloat9757 * (float) i_778_;
					float f_786_ = aFloat9748 * (float) i_778_;
					float f_787_ = aFloat9765 + (aFloat9753 * (float) i_759_ + f_785_ + aFloat9741 * (float) i_761_);
					f_766_ = (class118.aFloat1442 + class118.aFloat1469 * f_787_ / f);
					float f_788_ = aFloat9761 + (aFloat9771 * (float) i_759_ + f_786_ + aFloat9762 * (float) i_761_);
					f_767_ = (class118.aFloat1473 + class118.aFloat1444 * f_788_ / f);
					f_768_ = (class118.aFloat1458 + class118.aFloat1447 * f_781_ / f);
					float f_789_ = aFloat9765 + (aFloat9753 * (float) i_760_ + f_785_ + aFloat9741 * (float) i_761_);
					f_769_ = (class118.aFloat1442 + class118.aFloat1469 * f_789_ / f_763_);
					float f_790_ = aFloat9761 + (aFloat9771 * (float) i_760_ + f_786_ + aFloat9762 * (float) i_761_);
					f_770_ = (class118.aFloat1473 + class118.aFloat1444 * f_790_ / f_763_);
					f_771_ = (class118.aFloat1458 + class118.aFloat1447 * f_782_ / f_763_);
					float f_791_ = aFloat9765 + (aFloat9753 * (float) i_760_ + f_785_ + aFloat9741 * (float) i_762_);
					f_772_ = (class118.aFloat1442 + class118.aFloat1469 * f_791_ / f_764_);
					float f_792_ = aFloat9761 + (aFloat9771 * (float) i_760_ + f_786_ + aFloat9762 * (float) i_762_);
					f_773_ = (class118.aFloat1473 + class118.aFloat1444 * f_792_ / f_764_);
					f_774_ = (class118.aFloat1458 + class118.aFloat1447 * f_783_ / f_764_);
					float f_793_ = aFloat9765 + (aFloat9753 * (float) i_759_ + f_785_ + aFloat9741 * (float) i_762_);
					f_775_ = (class118.aFloat1442 + class118.aFloat1469 * f_793_ / f_765_);
					float f_794_ = aFloat9761 + (aFloat9771 * (float) i_759_ + f_786_ + aFloat9762 * (float) i_762_);
					f_776_ = (class118.aFloat1473 + class118.aFloat1444 * f_794_ / f_765_);
					f_777_ = (class118.aFloat1458 + class118.aFloat1447 * f_784_ / f_765_);
				} else {
					int i_795_ = anIntArrayArray1684[i][i_753_];
					int i_796_ = anIntArrayArray1684[i + 1][i_753_];
					int i_797_ = anIntArrayArray1684[i + 1][i_753_ + 1];
					int i_798_ = anIntArrayArray1684[i][i_753_ + 1];
					float f_799_ = aFloat9767 + (aFloat9755 * (float) i_759_ + aFloat9773 * (float) i_795_ + aFloat9750 * (float) i_761_);
					f = aFloat9768 + (aFloat9756 * (float) i_759_ + aFloat9754 * (float) i_795_ + aFloat9764 * (float) i_761_);
					if (f_799_ < -f)
						return;
					float f_800_ = aFloat9767 + (aFloat9755 * (float) i_760_ + aFloat9773 * (float) i_796_ + aFloat9750 * (float) i_761_);
					f_763_ = aFloat9768 + (aFloat9756 * (float) i_760_ + aFloat9754 * (float) i_796_ + aFloat9764 * (float) i_761_);
					if (f_800_ < -f_763_)
						return;
					float f_801_ = aFloat9767 + (aFloat9755 * (float) i_760_ + aFloat9773 * (float) i_797_ + aFloat9750 * (float) i_762_);
					f_764_ = aFloat9768 + (aFloat9756 * (float) i_760_ + aFloat9754 * (float) i_797_ + aFloat9764 * (float) i_762_);
					if (f_801_ < -f_764_)
						return;
					float f_802_ = aFloat9767 + (aFloat9755 * (float) i_759_ + aFloat9773 * (float) i_798_ + aFloat9750 * (float) i_762_);
					f_765_ = aFloat9768 + (aFloat9756 * (float) i_759_ + aFloat9754 * (float) i_798_ + aFloat9764 * (float) i_762_);
					if (f_802_ < -f_765_)
						return;
					float f_803_ = aFloat9765 + (aFloat9753 * (float) i_759_ + aFloat9757 * (float) i_795_ + aFloat9741 * (float) i_761_);
					f_766_ = (class118.aFloat1442 + class118.aFloat1469 * f_803_ / f);
					float f_804_ = aFloat9761 + (aFloat9771 * (float) i_759_ + aFloat9748 * (float) i_795_ + aFloat9762 * (float) i_761_);
					f_767_ = (class118.aFloat1473 + class118.aFloat1444 * f_804_ / f);
					f_768_ = (class118.aFloat1458 + class118.aFloat1447 * f_799_ / f);
					float f_805_ = aFloat9765 + (aFloat9753 * (float) i_760_ + aFloat9757 * (float) i_796_ + aFloat9741 * (float) i_761_);
					f_769_ = (class118.aFloat1442 + class118.aFloat1469 * f_805_ / f_763_);
					float f_806_ = aFloat9761 + (aFloat9771 * (float) i_760_ + aFloat9748 * (float) i_796_ + aFloat9762 * (float) i_761_);
					f_770_ = (class118.aFloat1473 + class118.aFloat1444 * f_806_ / f_763_);
					f_771_ = (class118.aFloat1458 + class118.aFloat1447 * f_800_ / f_763_);
					float f_807_ = aFloat9765 + (aFloat9753 * (float) i_760_ + aFloat9757 * (float) i_797_ + aFloat9741 * (float) i_762_);
					f_772_ = (class118.aFloat1442 + class118.aFloat1469 * f_807_ / f_764_);
					float f_808_ = aFloat9761 + (aFloat9771 * (float) i_760_ + aFloat9748 * (float) i_797_ + aFloat9762 * (float) i_762_);
					f_773_ = (class118.aFloat1473 + class118.aFloat1444 * f_808_ / f_764_);
					f_774_ = (class118.aFloat1458 + class118.aFloat1447 * f_801_ / f_764_);
					float f_809_ = aFloat9765 + (aFloat9753 * (float) i_759_ + aFloat9757 * (float) i_798_ + aFloat9741 * (float) i_762_);
					f_775_ = (class118.aFloat1442 + class118.aFloat1469 * f_809_ / f_765_);
					float f_810_ = aFloat9761 + (aFloat9771 * (float) i_759_ + aFloat9748 * (float) i_798_ + aFloat9762 * (float) i_762_);
					f_776_ = (class118.aFloat1473 + class118.aFloat1444 * f_810_ / f_765_);
					f_777_ = (class118.aFloat1458 + class118.aFloat1447 * f_802_ / f_765_);
				}
				boolean bool = false;
				if (class129.aShort1552 != -1) {
					Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class129.aShort1552 & 0xffff, -1615299235));
					bool = class177.aBool1881;
				}
				if (((f_772_ - f_775_) * (f_770_ - f_776_) - (f_773_ - f_776_) * (f_769_ - f_775_)) > 0.0F) {
					class118.aBool1455 = (f_772_ < 0.0F || f_775_ < 0.0F || f_769_ < 0.0F || f_772_ > (float) class118.anInt1448 || f_775_ > (float) class118.anInt1448 || f_769_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_773_, f_776_, f_770_, f_772_, f_775_, f_769_, f_774_, f_777_, f_771_, f_764_, f_765_, f_763_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1549 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_773_, f_776_, f_770_, f_772_, f_775_, f_769_, f_774_, f_777_, f_771_, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
				}
				if (((f_766_ - f_769_) * (f_776_ - f_770_) - (f_767_ - f_770_) * (f_775_ - f_769_)) > 0.0F) {
					class118.aBool1455 = (f_766_ < 0.0F || f_769_ < 0.0F || f_775_ < 0.0F || f_766_ > (float) class118.anInt1448 || f_769_ > (float) class118.anInt1448 || f_775_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_767_, f_770_, f_776_, f_766_, f_769_, f_775_, f_768_, f_771_, f_777_, f, f_763_, f_765_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1547 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_767_, f_770_, f_776_, f_766_, f_769_, f_775_, f_768_, f_771_, f_777_, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
				}
			}
		} else {
			Class107 class107 = aClass107ArrayArray9749[i][i_753_];
			if (class107 != null) {
				if (i_758_ != 0) {
					if ((class107.aByte1306 & 0x4) != 0) {
						if ((i_758_ & 0x1) != 0)
							return;
					} else if ((i_758_ & 0x2) != 0)
						return;
				}
				for (int i_811_ = 0; i_811_ < class107.aShort1300; i_811_++) {
					int i_812_ = (class107.aShortArray1301[i_811_] + (i << anInt1680 * -1193058675));
					short i_813_ = class107.aShortArray1302[i_811_];
					int i_814_ = (class107.aShortArray1303[i_811_] + (i_753_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_812_ + aFloat9773 * (float) i_813_ + aFloat9750 * (float) i_814_);
					float f_815_ = aFloat9768 + (aFloat9756 * (float) i_812_ + aFloat9754 * (float) i_813_ + aFloat9764 * (float) i_814_);
					if (f < -f_815_)
						return;
					float f_816_ = aFloat9765 + (aFloat9753 * (float) i_812_ + aFloat9757 * (float) i_813_ + aFloat9741 * (float) i_814_);
					float f_817_ = aFloat9761 + (aFloat9771 * (float) i_812_ + aFloat9748 * (float) i_813_ + aFloat9762 * (float) i_814_);
					fs[i_811_] = (class118.aFloat1442 + class118.aFloat1469 * f_816_ / f_815_);
					fs_754_[i_811_] = (class118.aFloat1473 + class118.aFloat1444 * f_817_ / f_815_);
					fs_755_[i_811_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_815_);
					fs_756_[i_811_] = f_815_;
				}
				if (class107.aShortArray1308 != null) {
					for (int i_818_ = 0; i_818_ < class107.aShort1299; i_818_++) {
						short i_819_ = class107.aShortArray1305[i_818_];
						short i_820_ = class107.aShortArray1307[i_818_];
						short i_821_ = class107.aShortArray1298[i_818_];
						float f = fs[i_819_];
						float f_822_ = fs[i_820_];
						float f_823_ = fs[i_821_];
						float f_824_ = fs_754_[i_819_];
						float f_825_ = fs_754_[i_820_];
						float f_826_ = fs_754_[i_821_];
						if (((f - f_822_) * (f_826_ - f_825_) - (f_824_ - f_825_) * (f_823_ - f_822_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_822_ < 0.0F || f_823_ < 0.0F || f > (float) class118.anInt1448 || f_822_ > (float) class118.anInt1448 || f_823_ > (float) class118.anInt1448);
							boolean bool = false;
							if (class107.aShortArray1308[i_818_] != -1) {
								Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class107.aShortArray1308[i_818_] & 0xffff), -629509495));
								bool = class177.aBool1881;
							}
							if (bool)
								class118.method2053(true, true, false, f_824_, f_825_, f_826_, f, f_822_, f_823_, fs_755_[i_819_], fs_755_[i_820_], fs_755_[i_821_], fs_756_[i_819_], fs_756_[i_820_], fs_756_[i_821_], ((float) class107.aShortArray1301[i_819_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_820_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_821_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_819_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_820_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_821_] / (float) (anInt1682 * 341909049)), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_819_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_820_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_821_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class107.aShortArray1308[i_818_] & 0xffff));
							else {
								int i_827_ = class107.anIntArray1310[i_818_];
								if (i_827_ != -1)
									class118.method2033(true, true, false, f_824_, f_825_, f_826_, f, f_822_, f_823_, fs_755_[i_819_], fs_755_[i_820_], fs_755_[i_821_], (float) (Class174.method2935(i_827_, (class107.aShortArray1304[i_819_]), 1530418723)), (float) (Class174.method2935(i_827_, (class107.aShortArray1304[i_820_]), 1530418723)), (float) (Class174.method2935(i_827_, (class107.aShortArray1304[i_821_]), 1530418723)));
							}
						}
					}
				} else {
					for (int i_828_ = 0; i_828_ < class107.aShort1299; i_828_++) {
						short i_829_ = class107.aShortArray1305[i_828_];
						short i_830_ = class107.aShortArray1307[i_828_];
						short i_831_ = class107.aShortArray1298[i_828_];
						float f = fs[i_829_];
						float f_832_ = fs[i_830_];
						float f_833_ = fs[i_831_];
						float f_834_ = fs_754_[i_829_];
						float f_835_ = fs_754_[i_830_];
						float f_836_ = fs_754_[i_831_];
						if (((f - f_832_) * (f_836_ - f_835_) - (f_834_ - f_835_) * (f_833_ - f_832_)) > 0.0F) {
							int i_837_ = class107.anIntArray1310[i_828_];
							if (i_837_ != -1) {
								class118.aBool1455 = (f < 0.0F || f_832_ < 0.0F || f_833_ < 0.0F || f > (float) class118.anInt1448 || f_832_ > (float) class118.anInt1448 || f_833_ > (float) class118.anInt1448);
								class118.method2033(true, true, false, f_834_, f_835_, f_836_, f, f_832_, f_833_, fs_755_[i_829_], fs_755_[i_830_], fs_755_[i_831_], (float) (Class174.method2935(i_837_, (class107.aShortArray1304[i_829_]), 1530418723)), (float) (Class174.method2935(i_837_, (class107.aShortArray1304[i_830_]), 1530418723)), (float) (Class174.method2935(i_837_, (class107.aShortArray1304[i_831_]), 1530418723)));
							}
						}
					}
				}
			}
		}
	}

	public void method2323(int i, int i_838_, int[] is, int[] is_839_, int[] is_840_, int[] is_841_, int[] is_842_, int[] is_843_, int[] is_844_, int[] is_845_, int[] is_846_, int[] is_847_, int[] is_848_, Class163 class163, boolean bool) {
		if (aClass129ArrayArray9747 == null) {
			aClass129ArrayArray9747 = new Class129[anInt1683 * 692304099][anInt1681 * 452998539];
			aClass107ArrayArray9749 = new Class107[anInt1683 * 692304099][anInt1681 * 452998539];
		} else if (aClass106ArrayArray9758 != null || aClass124ArrayArray9752 != null)
			throw new IllegalStateException();
		boolean bool_849_ = false;
		if (is_845_.length == 2 && is_842_.length == 2 && (is_845_[0] == is_845_[1] || is_847_[0] != -1 && is_847_[0] == is_847_[1])) {
			bool_849_ = true;
			for (int i_850_ = 1; i_850_ < 2; i_850_++) {
				int i_851_ = is[is_842_[i_850_]];
				int i_852_ = is_840_[is_842_[i_850_]];
				if (i_851_ != 0 && i_851_ != anInt1682 * 341909049 || i_852_ != 0 && i_852_ != anInt1682 * 341909049) {
					bool_849_ = false;
					break;
				}
			}
		}
		if (!bool_849_) {
			Class107 class107 = new Class107();
			short i_853_ = (short) is.length;
			int i_854_ = (short) is_845_.length;
			class107.aShort1300 = i_853_;
			class107.aShortArray1304 = new short[i_853_];
			class107.aShortArray1301 = new short[i_853_];
			class107.aShortArray1302 = new short[i_853_];
			class107.aShortArray1303 = new short[i_853_];
			for (int i_855_ = 0; i_855_ < i_853_; i_855_++) {
				int i_856_ = is[i_855_];
				int i_857_ = is_840_[i_855_];
				if (i_856_ == 0 && i_857_ == 0)
					class107.aShortArray1304[i_855_] = (short) (aByteArrayArray9769[i][i_838_] - aByteArrayArray9770[i][i_838_]);
				else if (i_856_ == 0 && i_857_ == anInt1682 * 341909049)
					class107.aShortArray1304[i_855_] = (short) (aByteArrayArray9769[i][i_838_ + 1] - aByteArrayArray9770[i][i_838_ + 1]);
				else if (i_856_ == anInt1682 * 341909049 && i_857_ == anInt1682 * 341909049)
					class107.aShortArray1304[i_855_] = (short) (aByteArrayArray9769[i + 1][i_838_ + 1] - aByteArrayArray9770[i + 1][i_838_ + 1]);
				else if (i_856_ == anInt1682 * 341909049 && i_857_ == 0)
					class107.aShortArray1304[i_855_] = (short) (aByteArrayArray9769[i + 1][i_838_] - aByteArrayArray9770[i + 1][i_838_]);
				else {
					int i_858_ = (((aByteArrayArray9769[i][i_838_] - aByteArrayArray9770[i][i_838_]) * (anInt1682 * 341909049 - i_856_)) + (aByteArrayArray9769[i + 1][i_838_] - aByteArrayArray9770[i + 1][i_838_]) * i_856_);
					int i_859_ = (((aByteArrayArray9769[i][i_838_ + 1] - aByteArrayArray9770[i][i_838_ + 1]) * (anInt1682 * 341909049 - i_856_)) + ((aByteArrayArray9769[i + 1][i_838_ + 1] - aByteArrayArray9770[i + 1][i_838_ + 1]) * i_856_));
					class107.aShortArray1304[i_855_] = (short) ((i_858_ * (anInt1682 * 341909049 - i_857_) + i_859_ * i_857_) >> anInt1680 * 1908849946);
				}
				int i_860_ = (i << anInt1680 * -1193058675) + i_856_;
				int i_861_ = (i_838_ << anInt1680 * -1193058675) + i_857_;
				class107.aShortArray1301[i_855_] = (short) i_856_;
				class107.aShortArray1303[i_855_] = (short) i_857_;
				class107.aShortArray1302[i_855_] = (short) (method2326(i_860_, i_861_, 779357821) + (is_839_ != null ? is_839_[i_855_] : 0));
				if (class107.aShortArray1304[i_855_] < 2)
					class107.aShortArray1304[i_855_] = (short) 2;
			}
			boolean bool_862_ = false;
			int i_863_ = 0;
			for (int i_864_ = 0; i_864_ < i_854_; i_864_++) {
				if (is_845_[i_864_] >= 0 || is_846_ != null && is_846_[i_864_] >= 0)
					i_863_++;
				int i_865_ = is_847_[i_864_];
				if (i_865_ != -1) {
					Class177 class177 = aClass178_Sub3_9746.aClass172_1916.method2895(i_865_, -81286245);
					if (!class177.aBool1876) {
						bool_862_ = true;
						if (method15364(class177.aByte1905) || class177.aByte1885 != 0 || class177.aByte1886 != 0)
							class107.aByte1306 |= 0x4;
					}
				}
			}
			class107.anIntArray1310 = new int[i_863_];
			if (is_846_ != null)
				class107.anIntArray1311 = new int[i_863_];
			class107.aShortArray1305 = new short[i_863_];
			class107.aShortArray1307 = new short[i_863_];
			class107.aShortArray1298 = new short[i_863_];
			if (bool_862_) {
				class107.aShortArray1308 = new short[i_863_];
				class107.aShortArray1309 = new short[i_863_];
			}
			for (int i_866_ = 0; i_866_ < i_854_; i_866_++) {
				if (is_845_[i_866_] >= 0 || is_846_ != null && is_846_[i_866_] >= 0) {
					if (is_845_[i_866_] >= 0)
						class107.anIntArray1310[class107.aShort1299] = Class493.method8085(is_845_[i_866_], 845597749);
					else
						class107.anIntArray1310[class107.aShort1299] = -1;
					if (is_846_ != null) {
						if (is_846_[i_866_] != -1)
							class107.anIntArray1311[class107.aShort1299] = Class493.method8085(is_846_[i_866_], 1604223632);
						else
							class107.anIntArray1311[class107.aShort1299] = -1;
					}
					class107.aShortArray1305[class107.aShort1299] = (short) is_842_[i_866_];
					class107.aShortArray1307[class107.aShort1299] = (short) is_843_[i_866_];
					class107.aShortArray1298[class107.aShort1299] = (short) is_844_[i_866_];
					if (bool_862_) {
						if (is_847_[i_866_] != -1 && !(aClass178_Sub3_9746.aClass172_1916.method2895(is_847_[i_866_], 130370577).aBool1876)) {
							class107.aShortArray1308[class107.aShort1299] = (short) is_847_[i_866_];
							class107.aShortArray1309[class107.aShort1299] = (short) is_848_[i_866_];
						} else
							class107.aShortArray1308[class107.aShort1299] = (short) -1;
					}
					class107.aShort1299++;
				}
			}
			aClass107ArrayArray9749[i][i_838_] = class107;
		} else if (is_845_[0] >= 0 || is_846_ != null && is_846_[0] >= 0) {
			Class129 class129 = new Class129();
			int i_867_ = is_845_[0];
			int i_868_ = is_847_[0];
			if (is_846_ != null) {
				class129.anInt1546 = Class174.method2935(Class493.method8085(is_846_[0], -730612210), (aByteArrayArray9769[i][i_838_] - aByteArrayArray9770[i][i_838_]), 1530418723);
				if (i_867_ == -1)
					class129.aByte1550 |= 0x2;
			}
			if ((anIntArrayArray1684[i][i_838_] == anIntArrayArray1684[i + 1][i_838_]) && (anIntArrayArray1684[i][i_838_] == anIntArrayArray1684[i + 1][i_838_ + 1]) && (anIntArrayArray1684[i][i_838_] == anIntArrayArray1684[i][i_838_ + 1]))
				class129.aByte1550 |= 0x1;
			Class177 class177 = null;
			if (i_868_ != -1)
				class177 = aClass178_Sub3_9746.aClass172_1916.method2895(i_868_, 140578114);
			if (class177 != null && (class129.aByte1550 & 0x2) == 0 && !class177.aBool1876) {
				class129.aShort1547 = (short) (aByteArrayArray9769[i][i_838_] - aByteArrayArray9770[i][i_838_]);
				class129.aShort1548 = (short) (aByteArrayArray9769[i + 1][i_838_] - aByteArrayArray9770[i + 1][i_838_]);
				class129.aShort1549 = (short) (aByteArrayArray9769[i + 1][i_838_ + 1] - aByteArrayArray9770[i + 1][i_838_ + 1]);
				class129.aShort1551 = (short) (aByteArrayArray9769[i][i_838_ + 1] - aByteArrayArray9770[i][i_838_ + 1]);
				class129.aShort1552 = (short) i_868_;
				if (method15364(class177.aByte1905) || class177.aByte1885 != 0 || class177.aByte1886 != 0)
					class129.aByte1550 |= 0x4;
			} else {
				short i_869_ = Class493.method8085(i_867_, -211276936);
				class129.aShort1547 = (short) Class174.method2935(i_869_, ((aByteArrayArray9769[i][i_838_]) - (aByteArrayArray9770[i][i_838_])), 1530418723);
				class129.aShort1548 = (short) Class174.method2935(i_869_, ((aByteArrayArray9769[i + 1][i_838_]) - (aByteArrayArray9770[i + 1][i_838_])), 1530418723);
				class129.aShort1549 = (short) Class174.method2935(i_869_, ((aByteArrayArray9769[i + 1][i_838_ + 1]) - (aByteArrayArray9770[i + 1][i_838_ + 1])), 1530418723);
				class129.aShort1551 = (short) Class174.method2935(i_869_, ((aByteArrayArray9769[i][i_838_ + 1]) - (aByteArrayArray9770[i][i_838_ + 1])), 1530418723);
				class129.aShort1552 = (short) -1;
			}
			aClass129ArrayArray9747[i][i_838_] = class129;
		}
	}

	public void method2325(int i, int i_870_, int i_871_, int i_872_, int i_873_, int i_874_, int i_875_, boolean[][] bools) {
		Class99 class99 = aClass178_Sub3_9746.method15475(Thread.currentThread());
		Class118 class118 = class99.aClass118_1200;
		class118.anInt1438 = 0;
		class118.aBool1455 = true;
		aClass178_Sub3_9746.method15420();
		if (aClass106ArrayArray9758 != null || aClass124ArrayArray9752 != null)
			method15359(i, i_870_, i_871_, i_872_, i_873_, i_874_, i_875_, bools, class99, class118, class99.aFloatArray1201, class99.aFloatArray1227);
		else if (aClass129ArrayArray9747 != null)
			method15358(i, i_870_, i_871_, i_872_, i_873_, i_874_, i_875_, bools, class99, class118, class99.aFloatArray1201, class99.aFloatArray1227);
	}

	void method15366(int i, int i_876_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_877_, float[] fs_878_, float[] fs_879_, float[] fs_880_, int i_881_) {
		Class106 class106 = aClass106ArrayArray9758[i][i_876_];
		if (class106 != null) {
			if ((class106.aByte1292 & 0x2) == 0) {
				if (i_881_ != 0) {
					if ((class106.aByte1292 & 0x4) != 0) {
						if ((i_881_ & 0x1) != 0)
							return;
					} else if ((i_881_ & 0x2) != 0)
						return;
				}
				int i_882_ = i * (anInt1682 * 341909049);
				int i_883_ = i_882_ + anInt1682 * 341909049;
				int i_884_ = i_876_ * (anInt1682 * 341909049);
				int i_885_ = i_884_ + anInt1682 * 341909049;
				float f = 0.0F;
				float f_886_ = 0.0F;
				float f_887_ = 0.0F;
				float f_888_ = 0.0F;
				float f_889_;
				float f_890_;
				float f_891_;
				float f_892_;
				float f_893_;
				float f_894_;
				float f_895_;
				float f_896_;
				float f_897_;
				float f_898_;
				float f_899_;
				float f_900_;
				float f_901_;
				float f_902_;
				float f_903_;
				float f_904_;
				if ((class106.aByte1292 & 0x1) != 0 && !bool) {
					int i_905_ = anIntArrayArray1684[i][i_876_];
					float f_906_ = aFloat9773 * (float) i_905_;
					float f_907_ = aFloat9754 * (float) i_905_;
					float f_908_ = aFloat9767 + (aFloat9755 * (float) i_882_ + f_906_ + aFloat9750 * (float) i_884_);
					f_889_ = aFloat9768 + (aFloat9756 * (float) i_882_ + f_907_ + aFloat9764 * (float) i_884_);
					if (f_908_ < -f_889_)
						return;
					float f_909_ = aFloat9767 + (aFloat9755 * (float) i_883_ + f_906_ + aFloat9750 * (float) i_884_);
					f_890_ = aFloat9768 + (aFloat9756 * (float) i_883_ + f_907_ + aFloat9764 * (float) i_884_);
					if (f_909_ < -f_890_)
						return;
					float f_910_ = aFloat9767 + (aFloat9755 * (float) i_883_ + f_906_ + aFloat9750 * (float) i_885_);
					f_891_ = aFloat9768 + (aFloat9756 * (float) i_883_ + f_907_ + aFloat9764 * (float) i_885_);
					if (f_910_ < -f_891_)
						return;
					float f_911_ = aFloat9767 + (aFloat9755 * (float) i_882_ + f_906_ + aFloat9750 * (float) i_885_);
					f_892_ = aFloat9768 + (aFloat9756 * (float) i_882_ + f_907_ + aFloat9764 * (float) i_885_);
					if (f_911_ < -f_892_)
						return;
					f_893_ = (class118.aFloat1458 + class118.aFloat1447 * f_908_ / f_889_);
					f_894_ = (class118.aFloat1458 + class118.aFloat1447 * f_909_ / f_890_);
					f_895_ = (class118.aFloat1458 + class118.aFloat1447 * f_910_ / f_891_);
					f_896_ = (class118.aFloat1458 + class118.aFloat1447 * f_911_ / f_892_);
					if (class99.aBool1189) {
						float f_912_ = f_908_ - class99.aFloat1205;
						if (f_912_ > 0.0F) {
							f = f_912_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_912_ = f_909_ - class99.aFloat1205;
						if (f_912_ > 0.0F) {
							f_886_ = f_912_ / class99.aFloat1191;
							if (f_886_ > 1.0F)
								f_886_ = 1.0F;
						}
						f_912_ = f_910_ - class99.aFloat1205;
						if (f_912_ > 0.0F) {
							f_887_ = f_912_ / class99.aFloat1191;
							if (f_887_ > 1.0F)
								f_887_ = 1.0F;
						}
						f_912_ = f_911_ - class99.aFloat1205;
						if (f_912_ > 0.0F) {
							f_888_ = f_912_ / class99.aFloat1191;
							if (f_888_ > 1.0F)
								f_888_ = 1.0F;
						}
					}
					float f_913_ = aFloat9757 * (float) i_905_;
					float f_914_ = aFloat9748 * (float) i_905_;
					float f_915_ = aFloat9765 + (aFloat9753 * (float) i_882_ + f_913_ + aFloat9741 * (float) i_884_);
					f_897_ = (class118.aFloat1442 + class118.aFloat1469 * f_915_ / f_889_);
					float f_916_ = aFloat9761 + (aFloat9771 * (float) i_882_ + f_914_ + aFloat9762 * (float) i_884_);
					f_898_ = (class118.aFloat1473 + class118.aFloat1444 * f_916_ / f_889_);
					float f_917_ = aFloat9765 + (aFloat9753 * (float) i_883_ + f_913_ + aFloat9741 * (float) i_884_);
					f_899_ = (class118.aFloat1442 + class118.aFloat1469 * f_917_ / f_890_);
					float f_918_ = aFloat9761 + (aFloat9771 * (float) i_883_ + f_914_ + aFloat9762 * (float) i_884_);
					f_900_ = (class118.aFloat1473 + class118.aFloat1444 * f_918_ / f_890_);
					float f_919_ = aFloat9765 + (aFloat9753 * (float) i_883_ + f_913_ + aFloat9741 * (float) i_885_);
					f_901_ = (class118.aFloat1442 + class118.aFloat1469 * f_919_ / f_891_);
					float f_920_ = aFloat9761 + (aFloat9771 * (float) i_883_ + f_914_ + aFloat9762 * (float) i_885_);
					f_902_ = (class118.aFloat1473 + class118.aFloat1444 * f_920_ / f_891_);
					float f_921_ = aFloat9765 + (aFloat9753 * (float) i_882_ + f_913_ + aFloat9741 * (float) i_885_);
					f_903_ = (class118.aFloat1442 + class118.aFloat1469 * f_921_ / f_892_);
					float f_922_ = aFloat9761 + (aFloat9771 * (float) i_882_ + f_914_ + aFloat9762 * (float) i_885_);
					f_904_ = (class118.aFloat1473 + class118.aFloat1444 * f_922_ / f_892_);
				} else {
					int i_923_ = anIntArrayArray1684[i][i_876_];
					int i_924_ = anIntArrayArray1684[i + 1][i_876_];
					int i_925_ = anIntArrayArray1684[i + 1][i_876_ + 1];
					int i_926_ = anIntArrayArray1684[i][i_876_ + 1];
					float f_927_ = aFloat9767 + (aFloat9755 * (float) i_882_ + aFloat9773 * (float) i_923_ + aFloat9750 * (float) i_884_);
					f_889_ = aFloat9768 + (aFloat9756 * (float) i_882_ + aFloat9754 * (float) i_923_ + aFloat9764 * (float) i_884_);
					if (f_927_ < -f_889_)
						return;
					float f_928_ = aFloat9767 + (aFloat9755 * (float) i_883_ + aFloat9773 * (float) i_924_ + aFloat9750 * (float) i_884_);
					f_890_ = aFloat9768 + (aFloat9756 * (float) i_883_ + aFloat9754 * (float) i_924_ + aFloat9764 * (float) i_884_);
					if (f_928_ < -f_890_)
						return;
					float f_929_ = aFloat9767 + (aFloat9755 * (float) i_883_ + aFloat9773 * (float) i_925_ + aFloat9750 * (float) i_885_);
					f_891_ = aFloat9768 + (aFloat9756 * (float) i_883_ + aFloat9754 * (float) i_925_ + aFloat9764 * (float) i_885_);
					if (f_929_ < -f_891_)
						return;
					float f_930_ = aFloat9767 + (aFloat9755 * (float) i_882_ + aFloat9773 * (float) i_926_ + aFloat9750 * (float) i_885_);
					f_892_ = aFloat9768 + (aFloat9756 * (float) i_882_ + aFloat9754 * (float) i_926_ + aFloat9764 * (float) i_885_);
					if (f_930_ < -f_892_)
						return;
					f_893_ = (class118.aFloat1458 + class118.aFloat1447 * f_927_ / f_889_);
					f_894_ = (class118.aFloat1458 + class118.aFloat1447 * f_928_ / f_890_);
					f_895_ = (class118.aFloat1458 + class118.aFloat1447 * f_929_ / f_891_);
					f_896_ = (class118.aFloat1458 + class118.aFloat1447 * f_930_ / f_892_);
					if (bool) {
						float f_931_ = f_927_ - class99.aFloat1205;
						if (f_931_ > 0.0F) {
							f_931_ /= class99.aFloat1191;
							if (f_931_ > 1.0F)
								f_931_ = 1.0F;
							f = f_931_;
							int i_932_ = (int) ((float) class106.aShort1290 * f_931_);
							if (i_932_ > 0)
								i_923_ -= i_932_;
						}
						f_931_ = f_928_ - class99.aFloat1205;
						if (f_931_ > 0.0F) {
							f_931_ /= class99.aFloat1191;
							if (f_931_ > 1.0F)
								f_931_ = 1.0F;
							f_886_ = f_931_;
							int i_933_ = (int) ((float) class106.aShort1293 * f_931_);
							if (i_933_ > 0)
								i_924_ -= i_933_;
						}
						f_931_ = f_929_ - class99.aFloat1205;
						if (f_931_ > 0.0F) {
							f_931_ /= class99.aFloat1191;
							if (f_931_ > 1.0F)
								f_931_ = 1.0F;
							f_887_ = f_931_;
							int i_934_ = (int) ((float) class106.aShort1294 * f_931_);
							if (i_934_ > 0)
								i_925_ -= i_934_;
						}
						f_931_ = f_930_ - class99.aFloat1205;
						if (f_931_ > 0.0F) {
							f_931_ /= class99.aFloat1191;
							if (f_931_ > 1.0F)
								f_931_ = 1.0F;
							f_888_ = f_931_;
							int i_935_ = (int) ((float) class106.aShort1295 * f_931_);
							if (i_935_ > 0)
								i_926_ -= i_935_;
						}
					} else if (class99.aBool1189) {
						float f_936_ = f_927_ - class99.aFloat1205;
						if (f_936_ > 0.0F) {
							f = f_936_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_936_ = f_928_ - class99.aFloat1205;
						if (f_936_ > 0.0F) {
							f_886_ = f_936_ / class99.aFloat1191;
							if (f_886_ > 1.0F)
								f_886_ = 1.0F;
						}
						f_936_ = f_929_ - class99.aFloat1205;
						if (f_936_ > 0.0F) {
							f_887_ = f_936_ / class99.aFloat1191;
							if (f_887_ > 1.0F)
								f_887_ = 1.0F;
						}
						f_936_ = f_930_ - class99.aFloat1205;
						if (f_936_ > 0.0F) {
							f_888_ = f_936_ / class99.aFloat1191;
							if (f_888_ > 1.0F)
								f_888_ = 1.0F;
						}
					}
					float f_937_ = aFloat9765 + (aFloat9753 * (float) i_882_ + aFloat9757 * (float) i_923_ + aFloat9741 * (float) i_884_);
					f_897_ = (class118.aFloat1442 + class118.aFloat1469 * f_937_ / f_889_);
					float f_938_ = aFloat9761 + (aFloat9771 * (float) i_882_ + aFloat9748 * (float) i_923_ + aFloat9762 * (float) i_884_);
					f_898_ = (class118.aFloat1473 + class118.aFloat1444 * f_938_ / f_889_);
					float f_939_ = aFloat9765 + (aFloat9753 * (float) i_883_ + aFloat9757 * (float) i_924_ + aFloat9741 * (float) i_884_);
					f_899_ = (class118.aFloat1442 + class118.aFloat1469 * f_939_ / f_890_);
					float f_940_ = aFloat9761 + (aFloat9771 * (float) i_883_ + aFloat9748 * (float) i_924_ + aFloat9762 * (float) i_884_);
					f_900_ = (class118.aFloat1473 + class118.aFloat1444 * f_940_ / f_890_);
					float f_941_ = aFloat9765 + (aFloat9753 * (float) i_883_ + aFloat9757 * (float) i_925_ + aFloat9741 * (float) i_885_);
					f_901_ = (class118.aFloat1442 + class118.aFloat1469 * f_941_ / f_891_);
					float f_942_ = aFloat9761 + (aFloat9771 * (float) i_883_ + aFloat9748 * (float) i_925_ + aFloat9762 * (float) i_885_);
					f_902_ = (class118.aFloat1473 + class118.aFloat1444 * f_942_ / f_891_);
					float f_943_ = aFloat9765 + (aFloat9753 * (float) i_882_ + aFloat9757 * (float) i_926_ + aFloat9741 * (float) i_885_);
					f_903_ = (class118.aFloat1442 + class118.aFloat1469 * f_943_ / f_892_);
					float f_944_ = aFloat9761 + (aFloat9771 * (float) i_882_ + aFloat9748 * (float) i_926_ + aFloat9762 * (float) i_885_);
					f_904_ = (class118.aFloat1473 + class118.aFloat1444 * f_944_ / f_892_);
				}
				Class177 class177 = null;
				boolean bool_945_ = false;
				if (class106.aShort1297 != -1) {
					class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class106.aShort1297 & 0xffff, 226242308));
					bool_945_ = class177.aBool1881;
				}
				boolean bool_946_ = class177 != null && method15364(class177.aByte1905);
				float f_947_ = f_886_ + f_887_ + f_888_;
				if (((f_901_ - f_903_) * (f_900_ - f_904_) - (f_902_ - f_904_) * (f_899_ - f_903_)) > 0.0F) {
					class118.aBool1455 = (f_901_ < 0.0F || f_903_ < 0.0F || f_899_ < 0.0F || f_901_ > (float) class118.anInt1448 || f_903_ > (float) class118.anInt1448 || f_899_ > (float) class118.anInt1448);
					if (f_947_ < 3.0F) {
						if (f_947_ > 0.0F) {
							if (bool_945_) {
								int i_948_ = -16777216;
								if (bool_946_)
									i_948_ = -1694498816;
								class118.method2053(true, true, false, f_902_, f_904_, f_900_, f_901_, f_903_, f_899_, f_895_, f_896_, f_894_, f_891_, f_892_, f_890_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_948_ | class106.anInt1289 & 0xffffff, i_948_ | class106.anInt1291 & 0xffffff, i_948_ | class106.anInt1287 & 0xffffff, class99.anInt1192 * 340278173, f_887_ * 255.0F, f_888_ * 255.0F, f_886_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_946_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_902_, f_904_, f_900_, f_901_, f_903_, f_899_, f_895_, f_896_, f_894_, Class155.method2546(class106.anInt1289, (((int) (f_887_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1727729821), Class155.method2546(class106.anInt1291, (((int) (f_888_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1707930898), Class155.method2546(class106.anInt1287, (((int) (f_886_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1370694401));
								class118.anInt1438 = 0;
							}
						} else if (bool_945_) {
							int i_949_ = -16777216;
							if (bool_946_)
								i_949_ = -1694498816;
							class118.method2053(true, true, false, f_902_, f_904_, f_900_, f_901_, f_903_, f_899_, f_895_, f_896_, f_894_, f_891_, f_892_, f_890_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_949_ | class106.anInt1289 & 0xffffff, i_949_ | class106.anInt1291 & 0xffffff, i_949_ | class106.anInt1287 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_946_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_902_, f_904_, f_900_, f_901_, f_903_, f_899_, f_895_, f_896_, f_894_, class106.anInt1289, class106.anInt1291, class106.anInt1287);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_902_, f_904_, f_900_, f_901_, f_903_, f_899_, f_895_, f_896_, f_894_, class99.anInt1192 * 340278173);
				}
				f_947_ = f + f_886_ + f_888_;
				if (((f_897_ - f_899_) * (f_904_ - f_900_) - (f_898_ - f_900_) * (f_903_ - f_899_)) > 0.0F) {
					class118.aBool1455 = (f_897_ < 0.0F || f_899_ < 0.0F || f_903_ < 0.0F || f_897_ > (float) class118.anInt1448 || f_899_ > (float) class118.anInt1448 || f_903_ > (float) class118.anInt1448);
					if (f_947_ < 3.0F) {
						if (bool_946_)
							class118.anInt1438 = -1694498816;
						if (f_947_ > 0.0F) {
							if (bool_945_) {
								int i_950_ = -16777216;
								if (bool_946_)
									i_950_ = -1694498816;
								class118.method2053(true, true, false, f_898_, f_900_, f_904_, f_897_, f_899_, f_903_, f_893_, f_894_, f_896_, f_889_, f_890_, f_892_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_950_ | class106.anInt1288 & 0xffffff, i_950_ | class106.anInt1287 & 0xffffff, i_950_ | class106.anInt1291 & 0xffffff, class99.anInt1192 * 340278173, f * 255.0F, f_886_ * 255.0F, f_888_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_946_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_898_, f_900_, f_904_, f_897_, f_899_, f_903_, f_893_, f_894_, f_896_, Class155.method2546(class106.anInt1288, (((int) (f * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1231361835), Class155.method2546(class106.anInt1287, (((int) (f_886_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -735238227), Class155.method2546(class106.anInt1291, (((int) (f_888_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1775984173));
								class118.anInt1438 = 0;
							}
						} else if (bool_945_) {
							int i_951_ = -16777216;
							if (bool_946_)
								i_951_ = -1694498816;
							class118.method2053(true, true, false, f_898_, f_900_, f_904_, f_897_, f_899_, f_903_, f_893_, f_894_, f_896_, f_889_, f_890_, f_892_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_951_ | class106.anInt1288 & 0xffffff, i_951_ | class106.anInt1287 & 0xffffff, i_951_ | class106.anInt1291 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_946_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_898_, f_900_, f_904_, f_897_, f_899_, f_903_, f_893_, f_894_, f_896_, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_898_, f_900_, f_904_, f_897_, f_899_, f_903_, f_893_, f_894_, f_896_, class99.anInt1192 * 340278173);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9751[i][i_876_];
			if (class94 != null) {
				if (i_881_ != 0) {
					if ((class94.aByte1153 & 0x4) != 0) {
						if ((i_881_ & 0x1) != 0)
							return;
					} else if ((i_881_ & 0x2) != 0)
						return;
				}
				for (int i_952_ = 0; i_952_ < class94.aShort1152; i_952_++) {
					int i_953_ = (class94.aShortArray1154[i_952_] + (i << anInt1680 * -1193058675));
					int i_954_ = class94.aShortArray1151[i_952_];
					int i_955_ = (class94.aShortArray1156[i_952_] + (i_876_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_953_ + aFloat9773 * (float) i_954_ + aFloat9750 * (float) i_955_);
					float f_956_ = aFloat9768 + (aFloat9756 * (float) i_953_ + aFloat9754 * (float) i_954_ + aFloat9764 * (float) i_955_);
					if (f < -f_956_)
						return;
					float f_957_ = (class118.aFloat1458 + class118.aFloat1447 * f / f_956_);
					fs_880_[i_952_] = 0.0F;
					if (bool) {
						float f_958_ = f - class99.aFloat1205;
						if (f_958_ > 0.0F) {
							f_958_ /= class99.aFloat1191;
							if (f_958_ > 1.0F)
								f_958_ = 1.0F;
							fs_880_[i_952_] = f_958_;
							int i_959_ = (int) ((float) (class94.aShortArray1157[i_952_]) * f_958_);
							if (i_959_ > 0)
								i_954_ -= i_959_;
						}
					} else if (class99.aBool1189) {
						float f_960_ = f - class99.aFloat1205;
						if (f_960_ > 0.0F) {
							fs_880_[i_952_] = f_960_ / class99.aFloat1191;
							if (fs_880_[i_952_] > 1.0F)
								fs_880_[i_952_] = 1.0F;
						}
					}
					float f_961_ = aFloat9765 + (aFloat9753 * (float) i_953_ + aFloat9757 * (float) i_954_ + aFloat9741 * (float) i_955_);
					float f_962_ = aFloat9761 + (aFloat9771 * (float) i_953_ + aFloat9748 * (float) i_954_ + aFloat9762 * (float) i_955_);
					fs[i_952_] = (class118.aFloat1442 + class118.aFloat1469 * f_961_ / f_956_);
					fs_877_[i_952_] = (class118.aFloat1473 + class118.aFloat1444 * f_962_ / f_956_);
					fs_878_[i_952_] = f_957_;
					fs_879_[i_952_] = f_956_;
				}
				if (class94.aShortArray1155 != null) {
					for (int i_963_ = 0; i_963_ < class94.aShort1161; i_963_++) {
						int i_964_ = i_963_ * 3;
						int i_965_ = i_964_ + 1;
						int i_966_ = i_965_ + 1;
						float f = fs[i_964_];
						float f_967_ = fs[i_965_];
						float f_968_ = fs[i_966_];
						float f_969_ = fs_877_[i_964_];
						float f_970_ = fs_877_[i_965_];
						float f_971_ = fs_877_[i_966_];
						float f_972_ = (fs_880_[i_964_] + fs_880_[i_965_] + fs_880_[i_966_]);
						if (((f - f_967_) * (f_971_ - f_970_) - (f_969_ - f_970_) * (f_968_ - f_967_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_967_ < 0.0F || f_968_ < 0.0F || f > (float) class118.anInt1448 || f_967_ > (float) class118.anInt1448 || f_968_ > (float) class118.anInt1448);
							Class177 class177 = null;
							boolean bool_973_ = false;
							if (class94.aShortArray1155[i_963_] != -1) {
								class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class94.aShortArray1155[i_963_] & 0xffff), -127425032));
								bool_973_ = class177.aBool1881;
							}
							if (f_972_ < 3.0F) {
								if (f_972_ > 0.0F) {
									if (bool_973_) {
										int i_974_ = -16777216;
										if (method15364(class177.aByte1905))
											i_974_ = -1694498816;
										class118.method2053(true, true, false, f_969_, f_970_, f_971_, f, f_967_, f_968_, fs_878_[i_964_], fs_878_[i_965_], fs_878_[i_966_], fs_879_[i_964_], fs_879_[i_965_], fs_879_[i_966_], ((float) (class94.aShortArray1154[i_964_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_965_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_966_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_964_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_965_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_966_]) / (float) (anInt1682 * 341909049)), i_974_ | (class94.anIntArray1158[i_964_]) & 0xffffff, i_974_ | (class94.anIntArray1158[i_965_]) & 0xffffff, i_974_ | (class94.anIntArray1158[i_966_]) & 0xffffff, class99.anInt1192 * 340278173, fs_880_[i_964_] * 255.0F, fs_880_[i_965_] * 255.0F, fs_880_[i_966_] * 255.0F, (class94.aShortArray1155[i_963_] & 0xffff));
									} else if ((class94.anIntArray1158[i_964_] & 0xffffff) != 0) {
										class118.method2031(true, true, false, f_969_, f_970_, f_971_, f, f_967_, f_968_, fs_878_[i_964_], fs_878_[i_965_], fs_878_[i_966_], (Class155.method2546(class94.anIntArray1158[i_964_], ((int) (fs_880_[i_964_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1568960717)), (Class155.method2546(class94.anIntArray1158[i_965_], ((int) (fs_880_[i_965_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1695195977)), (Class155.method2546(class94.anIntArray1158[i_966_], ((int) (fs_880_[i_966_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -2082596608)));
										class118.anInt1438 = 0;
									}
								} else if (bool_973_) {
									int i_975_ = -16777216;
									if (method15364(class177.aByte1905))
										i_975_ = -1694498816;
									class118.method2053(true, true, false, f_969_, f_970_, f_971_, f, f_967_, f_968_, fs_878_[i_964_], fs_878_[i_965_], fs_878_[i_966_], fs_879_[i_964_], fs_879_[i_965_], fs_879_[i_966_], ((float) (class94.aShortArray1154[i_964_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_965_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_966_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_964_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_965_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_966_]) / (float) (anInt1682 * 341909049)), i_975_ | (class94.anIntArray1158[i_964_]) & 0xffffff, i_975_ | (class94.anIntArray1158[i_965_]) & 0xffffff, i_975_ | (class94.anIntArray1158[i_966_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (class94.aShortArray1155[i_963_] & 0xffff));
								} else if ((class94.anIntArray1158[i_964_] & 0xffffff) != 0) {
									class118.method2031(true, true, false, f_969_, f_970_, f_971_, f, f_967_, f_968_, fs_878_[i_964_], fs_878_[i_965_], fs_878_[i_966_], class94.anIntArray1158[i_964_], class94.anIntArray1158[i_965_], class94.anIntArray1158[i_966_]);
									class118.anInt1438 = 0;
								}
							} else
								class118.method2037(true, true, false, f_969_, f_970_, f_971_, f, f_967_, f_968_, fs_878_[i_964_], fs_878_[i_965_], fs_878_[i_966_], (class99.anInt1192 * 340278173));
						}
					}
				} else {
					for (int i_976_ = 0; i_976_ < class94.aShort1161; i_976_++) {
						int i_977_ = i_976_ * 3;
						int i_978_ = i_977_ + 1;
						int i_979_ = i_978_ + 1;
						float f = fs[i_977_];
						float f_980_ = fs[i_978_];
						float f_981_ = fs[i_979_];
						float f_982_ = fs_877_[i_977_];
						float f_983_ = fs_877_[i_978_];
						float f_984_ = fs_877_[i_979_];
						float f_985_ = (fs_880_[i_977_] + fs_880_[i_978_] + fs_880_[i_979_]);
						if (((f - f_980_) * (f_984_ - f_983_) - (f_982_ - f_983_) * (f_981_ - f_980_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_980_ < 0.0F || f_981_ < 0.0F || f > (float) class118.anInt1448 || f_980_ > (float) class118.anInt1448 || f_981_ > (float) class118.anInt1448);
							if (f_985_ < 3.0F) {
								if (f_985_ > 0.0F) {
									if ((class94.anIntArray1158[i_977_] & 0xffffff) != 0)
										class118.method2031(true, true, false, f_982_, f_983_, f_984_, f, f_980_, f_981_, fs_878_[i_977_], fs_878_[i_978_], fs_878_[i_979_], (Class234.method4271(class94.anIntArray1158[i_977_], class99.anInt1192 * 340278173, fs_880_[i_977_] * 255.0F, -1199678454)), (Class234.method4271(class94.anIntArray1158[i_978_], class99.anInt1192 * 340278173, fs_880_[i_978_] * 255.0F, -2062839209)), (Class234.method4271(class94.anIntArray1158[i_979_], class99.anInt1192 * 340278173, fs_880_[i_979_] * 255.0F, -1061986230)));
								} else if ((class94.anIntArray1158[i_977_] & 0xffffff) != 0)
									class118.method2031(true, true, false, f_982_, f_983_, f_984_, f, f_980_, f_981_, fs_878_[i_977_], fs_878_[i_978_], fs_878_[i_979_], class94.anIntArray1158[i_977_], class94.anIntArray1158[i_978_], class94.anIntArray1158[i_979_]);
							} else
								class118.method2037(true, true, false, f_982_, f_983_, f_984_, f, f_980_, f_981_, fs_878_[i_977_], fs_878_[i_978_], fs_878_[i_979_], (class99.anInt1192 * 340278173));
						}
					}
				}
			}
		}
	}

	void method15367(int i, int i_986_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_987_, float[] fs_988_, float[] fs_989_, float[] fs_990_, int i_991_) {
		Class106 class106 = aClass106ArrayArray9758[i][i_986_];
		if (class106 != null) {
			if ((class106.aByte1292 & 0x2) == 0) {
				if (i_991_ != 0) {
					if ((class106.aByte1292 & 0x4) != 0) {
						if ((i_991_ & 0x1) != 0)
							return;
					} else if ((i_991_ & 0x2) != 0)
						return;
				}
				int i_992_ = i * (anInt1682 * 341909049);
				int i_993_ = i_992_ + anInt1682 * 341909049;
				int i_994_ = i_986_ * (anInt1682 * 341909049);
				int i_995_ = i_994_ + anInt1682 * 341909049;
				float f = 0.0F;
				float f_996_ = 0.0F;
				float f_997_ = 0.0F;
				float f_998_ = 0.0F;
				float f_999_;
				float f_1000_;
				float f_1001_;
				float f_1002_;
				float f_1003_;
				float f_1004_;
				float f_1005_;
				float f_1006_;
				float f_1007_;
				float f_1008_;
				float f_1009_;
				float f_1010_;
				float f_1011_;
				float f_1012_;
				float f_1013_;
				float f_1014_;
				if ((class106.aByte1292 & 0x1) != 0 && !bool) {
					int i_1015_ = anIntArrayArray1684[i][i_986_];
					float f_1016_ = aFloat9773 * (float) i_1015_;
					float f_1017_ = aFloat9754 * (float) i_1015_;
					float f_1018_ = aFloat9767 + (aFloat9755 * (float) i_992_ + f_1016_ + aFloat9750 * (float) i_994_);
					f_999_ = aFloat9768 + (aFloat9756 * (float) i_992_ + f_1017_ + aFloat9764 * (float) i_994_);
					if (f_1018_ < -f_999_)
						return;
					float f_1019_ = aFloat9767 + (aFloat9755 * (float) i_993_ + f_1016_ + aFloat9750 * (float) i_994_);
					f_1000_ = aFloat9768 + (aFloat9756 * (float) i_993_ + f_1017_ + aFloat9764 * (float) i_994_);
					if (f_1019_ < -f_1000_)
						return;
					float f_1020_ = aFloat9767 + (aFloat9755 * (float) i_993_ + f_1016_ + aFloat9750 * (float) i_995_);
					f_1001_ = aFloat9768 + (aFloat9756 * (float) i_993_ + f_1017_ + aFloat9764 * (float) i_995_);
					if (f_1020_ < -f_1001_)
						return;
					float f_1021_ = aFloat9767 + (aFloat9755 * (float) i_992_ + f_1016_ + aFloat9750 * (float) i_995_);
					f_1002_ = aFloat9768 + (aFloat9756 * (float) i_992_ + f_1017_ + aFloat9764 * (float) i_995_);
					if (f_1021_ < -f_1002_)
						return;
					f_1003_ = (class118.aFloat1458 + class118.aFloat1447 * f_1018_ / f_999_);
					f_1004_ = (class118.aFloat1458 + class118.aFloat1447 * f_1019_ / f_1000_);
					f_1005_ = (class118.aFloat1458 + class118.aFloat1447 * f_1020_ / f_1001_);
					f_1006_ = (class118.aFloat1458 + class118.aFloat1447 * f_1021_ / f_1002_);
					if (class99.aBool1189) {
						float f_1022_ = f_1018_ - class99.aFloat1205;
						if (f_1022_ > 0.0F) {
							f = f_1022_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1022_ = f_1019_ - class99.aFloat1205;
						if (f_1022_ > 0.0F) {
							f_996_ = f_1022_ / class99.aFloat1191;
							if (f_996_ > 1.0F)
								f_996_ = 1.0F;
						}
						f_1022_ = f_1020_ - class99.aFloat1205;
						if (f_1022_ > 0.0F) {
							f_997_ = f_1022_ / class99.aFloat1191;
							if (f_997_ > 1.0F)
								f_997_ = 1.0F;
						}
						f_1022_ = f_1021_ - class99.aFloat1205;
						if (f_1022_ > 0.0F) {
							f_998_ = f_1022_ / class99.aFloat1191;
							if (f_998_ > 1.0F)
								f_998_ = 1.0F;
						}
					}
					float f_1023_ = aFloat9757 * (float) i_1015_;
					float f_1024_ = aFloat9748 * (float) i_1015_;
					float f_1025_ = aFloat9765 + (aFloat9753 * (float) i_992_ + f_1023_ + aFloat9741 * (float) i_994_);
					f_1007_ = (class118.aFloat1442 + class118.aFloat1469 * f_1025_ / f_999_);
					float f_1026_ = aFloat9761 + (aFloat9771 * (float) i_992_ + f_1024_ + aFloat9762 * (float) i_994_);
					f_1008_ = (class118.aFloat1473 + class118.aFloat1444 * f_1026_ / f_999_);
					float f_1027_ = aFloat9765 + (aFloat9753 * (float) i_993_ + f_1023_ + aFloat9741 * (float) i_994_);
					f_1009_ = (class118.aFloat1442 + class118.aFloat1469 * f_1027_ / f_1000_);
					float f_1028_ = aFloat9761 + (aFloat9771 * (float) i_993_ + f_1024_ + aFloat9762 * (float) i_994_);
					f_1010_ = (class118.aFloat1473 + class118.aFloat1444 * f_1028_ / f_1000_);
					float f_1029_ = aFloat9765 + (aFloat9753 * (float) i_993_ + f_1023_ + aFloat9741 * (float) i_995_);
					f_1011_ = (class118.aFloat1442 + class118.aFloat1469 * f_1029_ / f_1001_);
					float f_1030_ = aFloat9761 + (aFloat9771 * (float) i_993_ + f_1024_ + aFloat9762 * (float) i_995_);
					f_1012_ = (class118.aFloat1473 + class118.aFloat1444 * f_1030_ / f_1001_);
					float f_1031_ = aFloat9765 + (aFloat9753 * (float) i_992_ + f_1023_ + aFloat9741 * (float) i_995_);
					f_1013_ = (class118.aFloat1442 + class118.aFloat1469 * f_1031_ / f_1002_);
					float f_1032_ = aFloat9761 + (aFloat9771 * (float) i_992_ + f_1024_ + aFloat9762 * (float) i_995_);
					f_1014_ = (class118.aFloat1473 + class118.aFloat1444 * f_1032_ / f_1002_);
				} else {
					int i_1033_ = anIntArrayArray1684[i][i_986_];
					int i_1034_ = anIntArrayArray1684[i + 1][i_986_];
					int i_1035_ = anIntArrayArray1684[i + 1][i_986_ + 1];
					int i_1036_ = anIntArrayArray1684[i][i_986_ + 1];
					float f_1037_ = aFloat9767 + (aFloat9755 * (float) i_992_ + aFloat9773 * (float) i_1033_ + aFloat9750 * (float) i_994_);
					f_999_ = aFloat9768 + (aFloat9756 * (float) i_992_ + aFloat9754 * (float) i_1033_ + aFloat9764 * (float) i_994_);
					if (f_1037_ < -f_999_)
						return;
					float f_1038_ = aFloat9767 + (aFloat9755 * (float) i_993_ + aFloat9773 * (float) i_1034_ + aFloat9750 * (float) i_994_);
					f_1000_ = aFloat9768 + (aFloat9756 * (float) i_993_ + aFloat9754 * (float) i_1034_ + aFloat9764 * (float) i_994_);
					if (f_1038_ < -f_1000_)
						return;
					float f_1039_ = aFloat9767 + (aFloat9755 * (float) i_993_ + aFloat9773 * (float) i_1035_ + aFloat9750 * (float) i_995_);
					f_1001_ = aFloat9768 + (aFloat9756 * (float) i_993_ + aFloat9754 * (float) i_1035_ + aFloat9764 * (float) i_995_);
					if (f_1039_ < -f_1001_)
						return;
					float f_1040_ = aFloat9767 + (aFloat9755 * (float) i_992_ + aFloat9773 * (float) i_1036_ + aFloat9750 * (float) i_995_);
					f_1002_ = aFloat9768 + (aFloat9756 * (float) i_992_ + aFloat9754 * (float) i_1036_ + aFloat9764 * (float) i_995_);
					if (f_1040_ < -f_1002_)
						return;
					f_1003_ = (class118.aFloat1458 + class118.aFloat1447 * f_1037_ / f_999_);
					f_1004_ = (class118.aFloat1458 + class118.aFloat1447 * f_1038_ / f_1000_);
					f_1005_ = (class118.aFloat1458 + class118.aFloat1447 * f_1039_ / f_1001_);
					f_1006_ = (class118.aFloat1458 + class118.aFloat1447 * f_1040_ / f_1002_);
					if (bool) {
						float f_1041_ = f_1037_ - class99.aFloat1205;
						if (f_1041_ > 0.0F) {
							f_1041_ /= class99.aFloat1191;
							if (f_1041_ > 1.0F)
								f_1041_ = 1.0F;
							f = f_1041_;
							int i_1042_ = (int) ((float) class106.aShort1290 * f_1041_);
							if (i_1042_ > 0)
								i_1033_ -= i_1042_;
						}
						f_1041_ = f_1038_ - class99.aFloat1205;
						if (f_1041_ > 0.0F) {
							f_1041_ /= class99.aFloat1191;
							if (f_1041_ > 1.0F)
								f_1041_ = 1.0F;
							f_996_ = f_1041_;
							int i_1043_ = (int) ((float) class106.aShort1293 * f_1041_);
							if (i_1043_ > 0)
								i_1034_ -= i_1043_;
						}
						f_1041_ = f_1039_ - class99.aFloat1205;
						if (f_1041_ > 0.0F) {
							f_1041_ /= class99.aFloat1191;
							if (f_1041_ > 1.0F)
								f_1041_ = 1.0F;
							f_997_ = f_1041_;
							int i_1044_ = (int) ((float) class106.aShort1294 * f_1041_);
							if (i_1044_ > 0)
								i_1035_ -= i_1044_;
						}
						f_1041_ = f_1040_ - class99.aFloat1205;
						if (f_1041_ > 0.0F) {
							f_1041_ /= class99.aFloat1191;
							if (f_1041_ > 1.0F)
								f_1041_ = 1.0F;
							f_998_ = f_1041_;
							int i_1045_ = (int) ((float) class106.aShort1295 * f_1041_);
							if (i_1045_ > 0)
								i_1036_ -= i_1045_;
						}
					} else if (class99.aBool1189) {
						float f_1046_ = f_1037_ - class99.aFloat1205;
						if (f_1046_ > 0.0F) {
							f = f_1046_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1046_ = f_1038_ - class99.aFloat1205;
						if (f_1046_ > 0.0F) {
							f_996_ = f_1046_ / class99.aFloat1191;
							if (f_996_ > 1.0F)
								f_996_ = 1.0F;
						}
						f_1046_ = f_1039_ - class99.aFloat1205;
						if (f_1046_ > 0.0F) {
							f_997_ = f_1046_ / class99.aFloat1191;
							if (f_997_ > 1.0F)
								f_997_ = 1.0F;
						}
						f_1046_ = f_1040_ - class99.aFloat1205;
						if (f_1046_ > 0.0F) {
							f_998_ = f_1046_ / class99.aFloat1191;
							if (f_998_ > 1.0F)
								f_998_ = 1.0F;
						}
					}
					float f_1047_ = aFloat9765 + (aFloat9753 * (float) i_992_ + aFloat9757 * (float) i_1033_ + aFloat9741 * (float) i_994_);
					f_1007_ = (class118.aFloat1442 + class118.aFloat1469 * f_1047_ / f_999_);
					float f_1048_ = aFloat9761 + (aFloat9771 * (float) i_992_ + aFloat9748 * (float) i_1033_ + aFloat9762 * (float) i_994_);
					f_1008_ = (class118.aFloat1473 + class118.aFloat1444 * f_1048_ / f_999_);
					float f_1049_ = aFloat9765 + (aFloat9753 * (float) i_993_ + aFloat9757 * (float) i_1034_ + aFloat9741 * (float) i_994_);
					f_1009_ = (class118.aFloat1442 + class118.aFloat1469 * f_1049_ / f_1000_);
					float f_1050_ = aFloat9761 + (aFloat9771 * (float) i_993_ + aFloat9748 * (float) i_1034_ + aFloat9762 * (float) i_994_);
					f_1010_ = (class118.aFloat1473 + class118.aFloat1444 * f_1050_ / f_1000_);
					float f_1051_ = aFloat9765 + (aFloat9753 * (float) i_993_ + aFloat9757 * (float) i_1035_ + aFloat9741 * (float) i_995_);
					f_1011_ = (class118.aFloat1442 + class118.aFloat1469 * f_1051_ / f_1001_);
					float f_1052_ = aFloat9761 + (aFloat9771 * (float) i_993_ + aFloat9748 * (float) i_1035_ + aFloat9762 * (float) i_995_);
					f_1012_ = (class118.aFloat1473 + class118.aFloat1444 * f_1052_ / f_1001_);
					float f_1053_ = aFloat9765 + (aFloat9753 * (float) i_992_ + aFloat9757 * (float) i_1036_ + aFloat9741 * (float) i_995_);
					f_1013_ = (class118.aFloat1442 + class118.aFloat1469 * f_1053_ / f_1002_);
					float f_1054_ = aFloat9761 + (aFloat9771 * (float) i_992_ + aFloat9748 * (float) i_1036_ + aFloat9762 * (float) i_995_);
					f_1014_ = (class118.aFloat1473 + class118.aFloat1444 * f_1054_ / f_1002_);
				}
				Class177 class177 = null;
				boolean bool_1055_ = false;
				if (class106.aShort1297 != -1) {
					class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class106.aShort1297 & 0xffff, -1641483816));
					bool_1055_ = class177.aBool1881;
				}
				boolean bool_1056_ = class177 != null && method15364(class177.aByte1905);
				float f_1057_ = f_996_ + f_997_ + f_998_;
				if (((f_1011_ - f_1013_) * (f_1010_ - f_1014_) - (f_1012_ - f_1014_) * (f_1009_ - f_1013_)) > 0.0F) {
					class118.aBool1455 = (f_1011_ < 0.0F || f_1013_ < 0.0F || f_1009_ < 0.0F || f_1011_ > (float) class118.anInt1448 || f_1013_ > (float) class118.anInt1448 || f_1009_ > (float) class118.anInt1448);
					if (f_1057_ < 3.0F) {
						if (f_1057_ > 0.0F) {
							if (bool_1055_) {
								int i_1058_ = -16777216;
								if (bool_1056_)
									i_1058_ = -1694498816;
								class118.method2053(true, true, false, f_1012_, f_1014_, f_1010_, f_1011_, f_1013_, f_1009_, f_1005_, f_1006_, f_1004_, f_1001_, f_1002_, f_1000_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1058_ | class106.anInt1289 & 0xffffff, i_1058_ | class106.anInt1291 & 0xffffff, i_1058_ | class106.anInt1287 & 0xffffff, class99.anInt1192 * 340278173, f_997_ * 255.0F, f_998_ * 255.0F, f_996_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1056_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1012_, f_1014_, f_1010_, f_1011_, f_1013_, f_1009_, f_1005_, f_1006_, f_1004_, Class155.method2546(class106.anInt1289, (((int) (f_997_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -293545844), Class155.method2546(class106.anInt1291, (((int) (f_998_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1458715922), Class155.method2546(class106.anInt1287, (((int) (f_996_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -940369290));
								class118.anInt1438 = 0;
							}
						} else if (bool_1055_) {
							int i_1059_ = -16777216;
							if (bool_1056_)
								i_1059_ = -1694498816;
							class118.method2053(true, true, false, f_1012_, f_1014_, f_1010_, f_1011_, f_1013_, f_1009_, f_1005_, f_1006_, f_1004_, f_1001_, f_1002_, f_1000_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1059_ | class106.anInt1289 & 0xffffff, i_1059_ | class106.anInt1291 & 0xffffff, i_1059_ | class106.anInt1287 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1056_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1012_, f_1014_, f_1010_, f_1011_, f_1013_, f_1009_, f_1005_, f_1006_, f_1004_, class106.anInt1289, class106.anInt1291, class106.anInt1287);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1012_, f_1014_, f_1010_, f_1011_, f_1013_, f_1009_, f_1005_, f_1006_, f_1004_, class99.anInt1192 * 340278173);
				}
				f_1057_ = f + f_996_ + f_998_;
				if (((f_1007_ - f_1009_) * (f_1014_ - f_1010_) - (f_1008_ - f_1010_) * (f_1013_ - f_1009_)) > 0.0F) {
					class118.aBool1455 = (f_1007_ < 0.0F || f_1009_ < 0.0F || f_1013_ < 0.0F || f_1007_ > (float) class118.anInt1448 || f_1009_ > (float) class118.anInt1448 || f_1013_ > (float) class118.anInt1448);
					if (f_1057_ < 3.0F) {
						if (bool_1056_)
							class118.anInt1438 = -1694498816;
						if (f_1057_ > 0.0F) {
							if (bool_1055_) {
								int i_1060_ = -16777216;
								if (bool_1056_)
									i_1060_ = -1694498816;
								class118.method2053(true, true, false, f_1008_, f_1010_, f_1014_, f_1007_, f_1009_, f_1013_, f_1003_, f_1004_, f_1006_, f_999_, f_1000_, f_1002_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1060_ | class106.anInt1288 & 0xffffff, i_1060_ | class106.anInt1287 & 0xffffff, i_1060_ | class106.anInt1291 & 0xffffff, class99.anInt1192 * 340278173, f * 255.0F, f_996_ * 255.0F, f_998_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1056_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1008_, f_1010_, f_1014_, f_1007_, f_1009_, f_1013_, f_1003_, f_1004_, f_1006_, Class155.method2546(class106.anInt1288, (((int) (f * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -908520203), Class155.method2546(class106.anInt1287, (((int) (f_996_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1816690569), Class155.method2546(class106.anInt1291, (((int) (f_998_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1346079019));
								class118.anInt1438 = 0;
							}
						} else if (bool_1055_) {
							int i_1061_ = -16777216;
							if (bool_1056_)
								i_1061_ = -1694498816;
							class118.method2053(true, true, false, f_1008_, f_1010_, f_1014_, f_1007_, f_1009_, f_1013_, f_1003_, f_1004_, f_1006_, f_999_, f_1000_, f_1002_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1061_ | class106.anInt1288 & 0xffffff, i_1061_ | class106.anInt1287 & 0xffffff, i_1061_ | class106.anInt1291 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1056_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1008_, f_1010_, f_1014_, f_1007_, f_1009_, f_1013_, f_1003_, f_1004_, f_1006_, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1008_, f_1010_, f_1014_, f_1007_, f_1009_, f_1013_, f_1003_, f_1004_, f_1006_, class99.anInt1192 * 340278173);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9751[i][i_986_];
			if (class94 != null) {
				if (i_991_ != 0) {
					if ((class94.aByte1153 & 0x4) != 0) {
						if ((i_991_ & 0x1) != 0)
							return;
					} else if ((i_991_ & 0x2) != 0)
						return;
				}
				for (int i_1062_ = 0; i_1062_ < class94.aShort1152; i_1062_++) {
					int i_1063_ = (class94.aShortArray1154[i_1062_] + (i << anInt1680 * -1193058675));
					int i_1064_ = class94.aShortArray1151[i_1062_];
					int i_1065_ = (class94.aShortArray1156[i_1062_] + (i_986_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1063_ + aFloat9773 * (float) i_1064_ + aFloat9750 * (float) i_1065_);
					float f_1066_ = aFloat9768 + (aFloat9756 * (float) i_1063_ + aFloat9754 * (float) i_1064_ + aFloat9764 * (float) i_1065_);
					if (f < -f_1066_)
						return;
					float f_1067_ = (class118.aFloat1458 + class118.aFloat1447 * f / f_1066_);
					fs_990_[i_1062_] = 0.0F;
					if (bool) {
						float f_1068_ = f - class99.aFloat1205;
						if (f_1068_ > 0.0F) {
							f_1068_ /= class99.aFloat1191;
							if (f_1068_ > 1.0F)
								f_1068_ = 1.0F;
							fs_990_[i_1062_] = f_1068_;
							int i_1069_ = (int) ((float) (class94.aShortArray1157[i_1062_]) * f_1068_);
							if (i_1069_ > 0)
								i_1064_ -= i_1069_;
						}
					} else if (class99.aBool1189) {
						float f_1070_ = f - class99.aFloat1205;
						if (f_1070_ > 0.0F) {
							fs_990_[i_1062_] = f_1070_ / class99.aFloat1191;
							if (fs_990_[i_1062_] > 1.0F)
								fs_990_[i_1062_] = 1.0F;
						}
					}
					float f_1071_ = aFloat9765 + (aFloat9753 * (float) i_1063_ + aFloat9757 * (float) i_1064_ + aFloat9741 * (float) i_1065_);
					float f_1072_ = aFloat9761 + (aFloat9771 * (float) i_1063_ + aFloat9748 * (float) i_1064_ + aFloat9762 * (float) i_1065_);
					fs[i_1062_] = (class118.aFloat1442 + class118.aFloat1469 * f_1071_ / f_1066_);
					fs_987_[i_1062_] = (class118.aFloat1473 + class118.aFloat1444 * f_1072_ / f_1066_);
					fs_988_[i_1062_] = f_1067_;
					fs_989_[i_1062_] = f_1066_;
				}
				if (class94.aShortArray1155 != null) {
					for (int i_1073_ = 0; i_1073_ < class94.aShort1161; i_1073_++) {
						int i_1074_ = i_1073_ * 3;
						int i_1075_ = i_1074_ + 1;
						int i_1076_ = i_1075_ + 1;
						float f = fs[i_1074_];
						float f_1077_ = fs[i_1075_];
						float f_1078_ = fs[i_1076_];
						float f_1079_ = fs_987_[i_1074_];
						float f_1080_ = fs_987_[i_1075_];
						float f_1081_ = fs_987_[i_1076_];
						float f_1082_ = (fs_990_[i_1074_] + fs_990_[i_1075_] + fs_990_[i_1076_]);
						if (((f - f_1077_) * (f_1081_ - f_1080_) - (f_1079_ - f_1080_) * (f_1078_ - f_1077_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1077_ < 0.0F || f_1078_ < 0.0F || f > (float) class118.anInt1448 || f_1077_ > (float) class118.anInt1448 || f_1078_ > (float) class118.anInt1448);
							Class177 class177 = null;
							boolean bool_1083_ = false;
							if (class94.aShortArray1155[i_1073_] != -1) {
								class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class94.aShortArray1155[i_1073_] & 0xffff), -461423214));
								bool_1083_ = class177.aBool1881;
							}
							if (f_1082_ < 3.0F) {
								if (f_1082_ > 0.0F) {
									if (bool_1083_) {
										int i_1084_ = -16777216;
										if (method15364(class177.aByte1905))
											i_1084_ = -1694498816;
										class118.method2053(true, true, false, f_1079_, f_1080_, f_1081_, f, f_1077_, f_1078_, fs_988_[i_1074_], fs_988_[i_1075_], fs_988_[i_1076_], fs_989_[i_1074_], fs_989_[i_1075_], fs_989_[i_1076_], ((float) (class94.aShortArray1154[i_1074_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1075_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1076_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1074_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1075_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1076_]) / (float) (anInt1682 * 341909049)), i_1084_ | (class94.anIntArray1158[i_1074_]) & 0xffffff, i_1084_ | (class94.anIntArray1158[i_1075_]) & 0xffffff, i_1084_ | (class94.anIntArray1158[i_1076_]) & 0xffffff, class99.anInt1192 * 340278173, fs_990_[i_1074_] * 255.0F, fs_990_[i_1075_] * 255.0F, fs_990_[i_1076_] * 255.0F, (class94.aShortArray1155[i_1073_] & 0xffff));
									} else if ((class94.anIntArray1158[i_1074_] & 0xffffff) != 0) {
										class118.method2031(true, true, false, f_1079_, f_1080_, f_1081_, f, f_1077_, f_1078_, fs_988_[i_1074_], fs_988_[i_1075_], fs_988_[i_1076_], (Class155.method2546(class94.anIntArray1158[i_1074_], ((int) (fs_990_[i_1074_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1304068774)), (Class155.method2546(class94.anIntArray1158[i_1075_], ((int) (fs_990_[i_1075_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1485319439)), (Class155.method2546(class94.anIntArray1158[i_1076_], ((int) (fs_990_[i_1076_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1037516820)));
										class118.anInt1438 = 0;
									}
								} else if (bool_1083_) {
									int i_1085_ = -16777216;
									if (method15364(class177.aByte1905))
										i_1085_ = -1694498816;
									class118.method2053(true, true, false, f_1079_, f_1080_, f_1081_, f, f_1077_, f_1078_, fs_988_[i_1074_], fs_988_[i_1075_], fs_988_[i_1076_], fs_989_[i_1074_], fs_989_[i_1075_], fs_989_[i_1076_], ((float) (class94.aShortArray1154[i_1074_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1075_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1076_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1074_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1075_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1076_]) / (float) (anInt1682 * 341909049)), i_1085_ | (class94.anIntArray1158[i_1074_]) & 0xffffff, i_1085_ | (class94.anIntArray1158[i_1075_]) & 0xffffff, i_1085_ | (class94.anIntArray1158[i_1076_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (class94.aShortArray1155[i_1073_] & 0xffff));
								} else if ((class94.anIntArray1158[i_1074_] & 0xffffff) != 0) {
									class118.method2031(true, true, false, f_1079_, f_1080_, f_1081_, f, f_1077_, f_1078_, fs_988_[i_1074_], fs_988_[i_1075_], fs_988_[i_1076_], class94.anIntArray1158[i_1074_], class94.anIntArray1158[i_1075_], class94.anIntArray1158[i_1076_]);
									class118.anInt1438 = 0;
								}
							} else
								class118.method2037(true, true, false, f_1079_, f_1080_, f_1081_, f, f_1077_, f_1078_, fs_988_[i_1074_], fs_988_[i_1075_], fs_988_[i_1076_], (class99.anInt1192 * 340278173));
						}
					}
				} else {
					for (int i_1086_ = 0; i_1086_ < class94.aShort1161; i_1086_++) {
						int i_1087_ = i_1086_ * 3;
						int i_1088_ = i_1087_ + 1;
						int i_1089_ = i_1088_ + 1;
						float f = fs[i_1087_];
						float f_1090_ = fs[i_1088_];
						float f_1091_ = fs[i_1089_];
						float f_1092_ = fs_987_[i_1087_];
						float f_1093_ = fs_987_[i_1088_];
						float f_1094_ = fs_987_[i_1089_];
						float f_1095_ = (fs_990_[i_1087_] + fs_990_[i_1088_] + fs_990_[i_1089_]);
						if (((f - f_1090_) * (f_1094_ - f_1093_) - (f_1092_ - f_1093_) * (f_1091_ - f_1090_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1090_ < 0.0F || f_1091_ < 0.0F || f > (float) class118.anInt1448 || f_1090_ > (float) class118.anInt1448 || f_1091_ > (float) class118.anInt1448);
							if (f_1095_ < 3.0F) {
								if (f_1095_ > 0.0F) {
									if ((class94.anIntArray1158[i_1087_] & 0xffffff) != 0)
										class118.method2031(true, true, false, f_1092_, f_1093_, f_1094_, f, f_1090_, f_1091_, fs_988_[i_1087_], fs_988_[i_1088_], fs_988_[i_1089_], (Class234.method4271(class94.anIntArray1158[i_1087_], class99.anInt1192 * 340278173, fs_990_[i_1087_] * 255.0F, -1820342822)), (Class234.method4271(class94.anIntArray1158[i_1088_], class99.anInt1192 * 340278173, fs_990_[i_1088_] * 255.0F, 819714143)), (Class234.method4271(class94.anIntArray1158[i_1089_], class99.anInt1192 * 340278173, fs_990_[i_1089_] * 255.0F, 1197353275)));
								} else if ((class94.anIntArray1158[i_1087_] & 0xffffff) != 0)
									class118.method2031(true, true, false, f_1092_, f_1093_, f_1094_, f, f_1090_, f_1091_, fs_988_[i_1087_], fs_988_[i_1088_], fs_988_[i_1089_], class94.anIntArray1158[i_1087_], class94.anIntArray1158[i_1088_], class94.anIntArray1158[i_1089_]);
							} else
								class118.method2037(true, true, false, f_1092_, f_1093_, f_1094_, f, f_1090_, f_1091_, fs_988_[i_1087_], fs_988_[i_1088_], fs_988_[i_1089_], (class99.anInt1192 * 340278173));
						}
					}
				}
			}
		}
	}

	void method15368(int i, int i_1096_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_1097_, float[] fs_1098_, float[] fs_1099_, float[] fs_1100_, int i_1101_) {
		Class106 class106 = aClass106ArrayArray9758[i][i_1096_];
		if (class106 != null) {
			if ((class106.aByte1292 & 0x2) == 0) {
				if (i_1101_ != 0) {
					if ((class106.aByte1292 & 0x4) != 0) {
						if ((i_1101_ & 0x1) != 0)
							return;
					} else if ((i_1101_ & 0x2) != 0)
						return;
				}
				int i_1102_ = i * (anInt1682 * 341909049);
				int i_1103_ = i_1102_ + anInt1682 * 341909049;
				int i_1104_ = i_1096_ * (anInt1682 * 341909049);
				int i_1105_ = i_1104_ + anInt1682 * 341909049;
				float f = 0.0F;
				float f_1106_ = 0.0F;
				float f_1107_ = 0.0F;
				float f_1108_ = 0.0F;
				float f_1109_;
				float f_1110_;
				float f_1111_;
				float f_1112_;
				float f_1113_;
				float f_1114_;
				float f_1115_;
				float f_1116_;
				float f_1117_;
				float f_1118_;
				float f_1119_;
				float f_1120_;
				float f_1121_;
				float f_1122_;
				float f_1123_;
				float f_1124_;
				if ((class106.aByte1292 & 0x1) != 0 && !bool) {
					int i_1125_ = anIntArrayArray1684[i][i_1096_];
					float f_1126_ = aFloat9773 * (float) i_1125_;
					float f_1127_ = aFloat9754 * (float) i_1125_;
					float f_1128_ = aFloat9767 + (aFloat9755 * (float) i_1102_ + f_1126_ + aFloat9750 * (float) i_1104_);
					f_1109_ = aFloat9768 + (aFloat9756 * (float) i_1102_ + f_1127_ + aFloat9764 * (float) i_1104_);
					if (f_1128_ < -f_1109_)
						return;
					float f_1129_ = aFloat9767 + (aFloat9755 * (float) i_1103_ + f_1126_ + aFloat9750 * (float) i_1104_);
					f_1110_ = aFloat9768 + (aFloat9756 * (float) i_1103_ + f_1127_ + aFloat9764 * (float) i_1104_);
					if (f_1129_ < -f_1110_)
						return;
					float f_1130_ = aFloat9767 + (aFloat9755 * (float) i_1103_ + f_1126_ + aFloat9750 * (float) i_1105_);
					f_1111_ = aFloat9768 + (aFloat9756 * (float) i_1103_ + f_1127_ + aFloat9764 * (float) i_1105_);
					if (f_1130_ < -f_1111_)
						return;
					float f_1131_ = aFloat9767 + (aFloat9755 * (float) i_1102_ + f_1126_ + aFloat9750 * (float) i_1105_);
					f_1112_ = aFloat9768 + (aFloat9756 * (float) i_1102_ + f_1127_ + aFloat9764 * (float) i_1105_);
					if (f_1131_ < -f_1112_)
						return;
					f_1113_ = (class118.aFloat1458 + class118.aFloat1447 * f_1128_ / f_1109_);
					f_1114_ = (class118.aFloat1458 + class118.aFloat1447 * f_1129_ / f_1110_);
					f_1115_ = (class118.aFloat1458 + class118.aFloat1447 * f_1130_ / f_1111_);
					f_1116_ = (class118.aFloat1458 + class118.aFloat1447 * f_1131_ / f_1112_);
					if (class99.aBool1189) {
						float f_1132_ = f_1128_ - class99.aFloat1205;
						if (f_1132_ > 0.0F) {
							f = f_1132_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1132_ = f_1129_ - class99.aFloat1205;
						if (f_1132_ > 0.0F) {
							f_1106_ = f_1132_ / class99.aFloat1191;
							if (f_1106_ > 1.0F)
								f_1106_ = 1.0F;
						}
						f_1132_ = f_1130_ - class99.aFloat1205;
						if (f_1132_ > 0.0F) {
							f_1107_ = f_1132_ / class99.aFloat1191;
							if (f_1107_ > 1.0F)
								f_1107_ = 1.0F;
						}
						f_1132_ = f_1131_ - class99.aFloat1205;
						if (f_1132_ > 0.0F) {
							f_1108_ = f_1132_ / class99.aFloat1191;
							if (f_1108_ > 1.0F)
								f_1108_ = 1.0F;
						}
					}
					float f_1133_ = aFloat9757 * (float) i_1125_;
					float f_1134_ = aFloat9748 * (float) i_1125_;
					float f_1135_ = aFloat9765 + (aFloat9753 * (float) i_1102_ + f_1133_ + aFloat9741 * (float) i_1104_);
					f_1117_ = (class118.aFloat1442 + class118.aFloat1469 * f_1135_ / f_1109_);
					float f_1136_ = aFloat9761 + (aFloat9771 * (float) i_1102_ + f_1134_ + aFloat9762 * (float) i_1104_);
					f_1118_ = (class118.aFloat1473 + class118.aFloat1444 * f_1136_ / f_1109_);
					float f_1137_ = aFloat9765 + (aFloat9753 * (float) i_1103_ + f_1133_ + aFloat9741 * (float) i_1104_);
					f_1119_ = (class118.aFloat1442 + class118.aFloat1469 * f_1137_ / f_1110_);
					float f_1138_ = aFloat9761 + (aFloat9771 * (float) i_1103_ + f_1134_ + aFloat9762 * (float) i_1104_);
					f_1120_ = (class118.aFloat1473 + class118.aFloat1444 * f_1138_ / f_1110_);
					float f_1139_ = aFloat9765 + (aFloat9753 * (float) i_1103_ + f_1133_ + aFloat9741 * (float) i_1105_);
					f_1121_ = (class118.aFloat1442 + class118.aFloat1469 * f_1139_ / f_1111_);
					float f_1140_ = aFloat9761 + (aFloat9771 * (float) i_1103_ + f_1134_ + aFloat9762 * (float) i_1105_);
					f_1122_ = (class118.aFloat1473 + class118.aFloat1444 * f_1140_ / f_1111_);
					float f_1141_ = aFloat9765 + (aFloat9753 * (float) i_1102_ + f_1133_ + aFloat9741 * (float) i_1105_);
					f_1123_ = (class118.aFloat1442 + class118.aFloat1469 * f_1141_ / f_1112_);
					float f_1142_ = aFloat9761 + (aFloat9771 * (float) i_1102_ + f_1134_ + aFloat9762 * (float) i_1105_);
					f_1124_ = (class118.aFloat1473 + class118.aFloat1444 * f_1142_ / f_1112_);
				} else {
					int i_1143_ = anIntArrayArray1684[i][i_1096_];
					int i_1144_ = anIntArrayArray1684[i + 1][i_1096_];
					int i_1145_ = anIntArrayArray1684[i + 1][i_1096_ + 1];
					int i_1146_ = anIntArrayArray1684[i][i_1096_ + 1];
					float f_1147_ = aFloat9767 + (aFloat9755 * (float) i_1102_ + aFloat9773 * (float) i_1143_ + aFloat9750 * (float) i_1104_);
					f_1109_ = aFloat9768 + (aFloat9756 * (float) i_1102_ + aFloat9754 * (float) i_1143_ + aFloat9764 * (float) i_1104_);
					if (f_1147_ < -f_1109_)
						return;
					float f_1148_ = aFloat9767 + (aFloat9755 * (float) i_1103_ + aFloat9773 * (float) i_1144_ + aFloat9750 * (float) i_1104_);
					f_1110_ = aFloat9768 + (aFloat9756 * (float) i_1103_ + aFloat9754 * (float) i_1144_ + aFloat9764 * (float) i_1104_);
					if (f_1148_ < -f_1110_)
						return;
					float f_1149_ = aFloat9767 + (aFloat9755 * (float) i_1103_ + aFloat9773 * (float) i_1145_ + aFloat9750 * (float) i_1105_);
					f_1111_ = aFloat9768 + (aFloat9756 * (float) i_1103_ + aFloat9754 * (float) i_1145_ + aFloat9764 * (float) i_1105_);
					if (f_1149_ < -f_1111_)
						return;
					float f_1150_ = aFloat9767 + (aFloat9755 * (float) i_1102_ + aFloat9773 * (float) i_1146_ + aFloat9750 * (float) i_1105_);
					f_1112_ = aFloat9768 + (aFloat9756 * (float) i_1102_ + aFloat9754 * (float) i_1146_ + aFloat9764 * (float) i_1105_);
					if (f_1150_ < -f_1112_)
						return;
					f_1113_ = (class118.aFloat1458 + class118.aFloat1447 * f_1147_ / f_1109_);
					f_1114_ = (class118.aFloat1458 + class118.aFloat1447 * f_1148_ / f_1110_);
					f_1115_ = (class118.aFloat1458 + class118.aFloat1447 * f_1149_ / f_1111_);
					f_1116_ = (class118.aFloat1458 + class118.aFloat1447 * f_1150_ / f_1112_);
					if (bool) {
						float f_1151_ = f_1147_ - class99.aFloat1205;
						if (f_1151_ > 0.0F) {
							f_1151_ /= class99.aFloat1191;
							if (f_1151_ > 1.0F)
								f_1151_ = 1.0F;
							f = f_1151_;
							int i_1152_ = (int) ((float) class106.aShort1290 * f_1151_);
							if (i_1152_ > 0)
								i_1143_ -= i_1152_;
						}
						f_1151_ = f_1148_ - class99.aFloat1205;
						if (f_1151_ > 0.0F) {
							f_1151_ /= class99.aFloat1191;
							if (f_1151_ > 1.0F)
								f_1151_ = 1.0F;
							f_1106_ = f_1151_;
							int i_1153_ = (int) ((float) class106.aShort1293 * f_1151_);
							if (i_1153_ > 0)
								i_1144_ -= i_1153_;
						}
						f_1151_ = f_1149_ - class99.aFloat1205;
						if (f_1151_ > 0.0F) {
							f_1151_ /= class99.aFloat1191;
							if (f_1151_ > 1.0F)
								f_1151_ = 1.0F;
							f_1107_ = f_1151_;
							int i_1154_ = (int) ((float) class106.aShort1294 * f_1151_);
							if (i_1154_ > 0)
								i_1145_ -= i_1154_;
						}
						f_1151_ = f_1150_ - class99.aFloat1205;
						if (f_1151_ > 0.0F) {
							f_1151_ /= class99.aFloat1191;
							if (f_1151_ > 1.0F)
								f_1151_ = 1.0F;
							f_1108_ = f_1151_;
							int i_1155_ = (int) ((float) class106.aShort1295 * f_1151_);
							if (i_1155_ > 0)
								i_1146_ -= i_1155_;
						}
					} else if (class99.aBool1189) {
						float f_1156_ = f_1147_ - class99.aFloat1205;
						if (f_1156_ > 0.0F) {
							f = f_1156_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1156_ = f_1148_ - class99.aFloat1205;
						if (f_1156_ > 0.0F) {
							f_1106_ = f_1156_ / class99.aFloat1191;
							if (f_1106_ > 1.0F)
								f_1106_ = 1.0F;
						}
						f_1156_ = f_1149_ - class99.aFloat1205;
						if (f_1156_ > 0.0F) {
							f_1107_ = f_1156_ / class99.aFloat1191;
							if (f_1107_ > 1.0F)
								f_1107_ = 1.0F;
						}
						f_1156_ = f_1150_ - class99.aFloat1205;
						if (f_1156_ > 0.0F) {
							f_1108_ = f_1156_ / class99.aFloat1191;
							if (f_1108_ > 1.0F)
								f_1108_ = 1.0F;
						}
					}
					float f_1157_ = aFloat9765 + (aFloat9753 * (float) i_1102_ + aFloat9757 * (float) i_1143_ + aFloat9741 * (float) i_1104_);
					f_1117_ = (class118.aFloat1442 + class118.aFloat1469 * f_1157_ / f_1109_);
					float f_1158_ = aFloat9761 + (aFloat9771 * (float) i_1102_ + aFloat9748 * (float) i_1143_ + aFloat9762 * (float) i_1104_);
					f_1118_ = (class118.aFloat1473 + class118.aFloat1444 * f_1158_ / f_1109_);
					float f_1159_ = aFloat9765 + (aFloat9753 * (float) i_1103_ + aFloat9757 * (float) i_1144_ + aFloat9741 * (float) i_1104_);
					f_1119_ = (class118.aFloat1442 + class118.aFloat1469 * f_1159_ / f_1110_);
					float f_1160_ = aFloat9761 + (aFloat9771 * (float) i_1103_ + aFloat9748 * (float) i_1144_ + aFloat9762 * (float) i_1104_);
					f_1120_ = (class118.aFloat1473 + class118.aFloat1444 * f_1160_ / f_1110_);
					float f_1161_ = aFloat9765 + (aFloat9753 * (float) i_1103_ + aFloat9757 * (float) i_1145_ + aFloat9741 * (float) i_1105_);
					f_1121_ = (class118.aFloat1442 + class118.aFloat1469 * f_1161_ / f_1111_);
					float f_1162_ = aFloat9761 + (aFloat9771 * (float) i_1103_ + aFloat9748 * (float) i_1145_ + aFloat9762 * (float) i_1105_);
					f_1122_ = (class118.aFloat1473 + class118.aFloat1444 * f_1162_ / f_1111_);
					float f_1163_ = aFloat9765 + (aFloat9753 * (float) i_1102_ + aFloat9757 * (float) i_1146_ + aFloat9741 * (float) i_1105_);
					f_1123_ = (class118.aFloat1442 + class118.aFloat1469 * f_1163_ / f_1112_);
					float f_1164_ = aFloat9761 + (aFloat9771 * (float) i_1102_ + aFloat9748 * (float) i_1146_ + aFloat9762 * (float) i_1105_);
					f_1124_ = (class118.aFloat1473 + class118.aFloat1444 * f_1164_ / f_1112_);
				}
				Class177 class177 = null;
				boolean bool_1165_ = false;
				if (class106.aShort1297 != -1) {
					class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class106.aShort1297 & 0xffff, -401861851));
					bool_1165_ = class177.aBool1881;
				}
				boolean bool_1166_ = class177 != null && method15364(class177.aByte1905);
				float f_1167_ = f_1106_ + f_1107_ + f_1108_;
				if (((f_1121_ - f_1123_) * (f_1120_ - f_1124_) - (f_1122_ - f_1124_) * (f_1119_ - f_1123_)) > 0.0F) {
					class118.aBool1455 = (f_1121_ < 0.0F || f_1123_ < 0.0F || f_1119_ < 0.0F || f_1121_ > (float) class118.anInt1448 || f_1123_ > (float) class118.anInt1448 || f_1119_ > (float) class118.anInt1448);
					if (f_1167_ < 3.0F) {
						if (f_1167_ > 0.0F) {
							if (bool_1165_) {
								int i_1168_ = -16777216;
								if (bool_1166_)
									i_1168_ = -1694498816;
								class118.method2053(true, true, false, f_1122_, f_1124_, f_1120_, f_1121_, f_1123_, f_1119_, f_1115_, f_1116_, f_1114_, f_1111_, f_1112_, f_1110_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1168_ | class106.anInt1289 & 0xffffff, i_1168_ | class106.anInt1291 & 0xffffff, i_1168_ | class106.anInt1287 & 0xffffff, class99.anInt1192 * 340278173, f_1107_ * 255.0F, f_1108_ * 255.0F, f_1106_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1166_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1122_, f_1124_, f_1120_, f_1121_, f_1123_, f_1119_, f_1115_, f_1116_, f_1114_, Class155.method2546(class106.anInt1289, (((int) (f_1107_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1599828717), Class155.method2546(class106.anInt1291, (((int) (f_1108_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -930587949), Class155.method2546(class106.anInt1287, (((int) (f_1106_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1343750785));
								class118.anInt1438 = 0;
							}
						} else if (bool_1165_) {
							int i_1169_ = -16777216;
							if (bool_1166_)
								i_1169_ = -1694498816;
							class118.method2053(true, true, false, f_1122_, f_1124_, f_1120_, f_1121_, f_1123_, f_1119_, f_1115_, f_1116_, f_1114_, f_1111_, f_1112_, f_1110_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1169_ | class106.anInt1289 & 0xffffff, i_1169_ | class106.anInt1291 & 0xffffff, i_1169_ | class106.anInt1287 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1166_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1122_, f_1124_, f_1120_, f_1121_, f_1123_, f_1119_, f_1115_, f_1116_, f_1114_, class106.anInt1289, class106.anInt1291, class106.anInt1287);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1122_, f_1124_, f_1120_, f_1121_, f_1123_, f_1119_, f_1115_, f_1116_, f_1114_, class99.anInt1192 * 340278173);
				}
				f_1167_ = f + f_1106_ + f_1108_;
				if (((f_1117_ - f_1119_) * (f_1124_ - f_1120_) - (f_1118_ - f_1120_) * (f_1123_ - f_1119_)) > 0.0F) {
					class118.aBool1455 = (f_1117_ < 0.0F || f_1119_ < 0.0F || f_1123_ < 0.0F || f_1117_ > (float) class118.anInt1448 || f_1119_ > (float) class118.anInt1448 || f_1123_ > (float) class118.anInt1448);
					if (f_1167_ < 3.0F) {
						if (bool_1166_)
							class118.anInt1438 = -1694498816;
						if (f_1167_ > 0.0F) {
							if (bool_1165_) {
								int i_1170_ = -16777216;
								if (bool_1166_)
									i_1170_ = -1694498816;
								class118.method2053(true, true, false, f_1118_, f_1120_, f_1124_, f_1117_, f_1119_, f_1123_, f_1113_, f_1114_, f_1116_, f_1109_, f_1110_, f_1112_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1170_ | class106.anInt1288 & 0xffffff, i_1170_ | class106.anInt1287 & 0xffffff, i_1170_ | class106.anInt1291 & 0xffffff, class99.anInt1192 * 340278173, f * 255.0F, f_1106_ * 255.0F, f_1108_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1166_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1118_, f_1120_, f_1124_, f_1117_, f_1119_, f_1123_, f_1113_, f_1114_, f_1116_, Class155.method2546(class106.anInt1288, (((int) (f * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -856559133), Class155.method2546(class106.anInt1287, (((int) (f_1106_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1030616005), Class155.method2546(class106.anInt1291, (((int) (f_1108_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -387876405));
								class118.anInt1438 = 0;
							}
						} else if (bool_1165_) {
							int i_1171_ = -16777216;
							if (bool_1166_)
								i_1171_ = -1694498816;
							class118.method2053(true, true, false, f_1118_, f_1120_, f_1124_, f_1117_, f_1119_, f_1123_, f_1113_, f_1114_, f_1116_, f_1109_, f_1110_, f_1112_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1171_ | class106.anInt1288 & 0xffffff, i_1171_ | class106.anInt1287 & 0xffffff, i_1171_ | class106.anInt1291 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1166_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1118_, f_1120_, f_1124_, f_1117_, f_1119_, f_1123_, f_1113_, f_1114_, f_1116_, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1118_, f_1120_, f_1124_, f_1117_, f_1119_, f_1123_, f_1113_, f_1114_, f_1116_, class99.anInt1192 * 340278173);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9751[i][i_1096_];
			if (class94 != null) {
				if (i_1101_ != 0) {
					if ((class94.aByte1153 & 0x4) != 0) {
						if ((i_1101_ & 0x1) != 0)
							return;
					} else if ((i_1101_ & 0x2) != 0)
						return;
				}
				for (int i_1172_ = 0; i_1172_ < class94.aShort1152; i_1172_++) {
					int i_1173_ = (class94.aShortArray1154[i_1172_] + (i << anInt1680 * -1193058675));
					int i_1174_ = class94.aShortArray1151[i_1172_];
					int i_1175_ = (class94.aShortArray1156[i_1172_] + (i_1096_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1173_ + aFloat9773 * (float) i_1174_ + aFloat9750 * (float) i_1175_);
					float f_1176_ = aFloat9768 + (aFloat9756 * (float) i_1173_ + aFloat9754 * (float) i_1174_ + aFloat9764 * (float) i_1175_);
					if (f < -f_1176_)
						return;
					float f_1177_ = (class118.aFloat1458 + class118.aFloat1447 * f / f_1176_);
					fs_1100_[i_1172_] = 0.0F;
					if (bool) {
						float f_1178_ = f - class99.aFloat1205;
						if (f_1178_ > 0.0F) {
							f_1178_ /= class99.aFloat1191;
							if (f_1178_ > 1.0F)
								f_1178_ = 1.0F;
							fs_1100_[i_1172_] = f_1178_;
							int i_1179_ = (int) ((float) (class94.aShortArray1157[i_1172_]) * f_1178_);
							if (i_1179_ > 0)
								i_1174_ -= i_1179_;
						}
					} else if (class99.aBool1189) {
						float f_1180_ = f - class99.aFloat1205;
						if (f_1180_ > 0.0F) {
							fs_1100_[i_1172_] = f_1180_ / class99.aFloat1191;
							if (fs_1100_[i_1172_] > 1.0F)
								fs_1100_[i_1172_] = 1.0F;
						}
					}
					float f_1181_ = aFloat9765 + (aFloat9753 * (float) i_1173_ + aFloat9757 * (float) i_1174_ + aFloat9741 * (float) i_1175_);
					float f_1182_ = aFloat9761 + (aFloat9771 * (float) i_1173_ + aFloat9748 * (float) i_1174_ + aFloat9762 * (float) i_1175_);
					fs[i_1172_] = (class118.aFloat1442 + class118.aFloat1469 * f_1181_ / f_1176_);
					fs_1097_[i_1172_] = (class118.aFloat1473 + class118.aFloat1444 * f_1182_ / f_1176_);
					fs_1098_[i_1172_] = f_1177_;
					fs_1099_[i_1172_] = f_1176_;
				}
				if (class94.aShortArray1155 != null) {
					for (int i_1183_ = 0; i_1183_ < class94.aShort1161; i_1183_++) {
						int i_1184_ = i_1183_ * 3;
						int i_1185_ = i_1184_ + 1;
						int i_1186_ = i_1185_ + 1;
						float f = fs[i_1184_];
						float f_1187_ = fs[i_1185_];
						float f_1188_ = fs[i_1186_];
						float f_1189_ = fs_1097_[i_1184_];
						float f_1190_ = fs_1097_[i_1185_];
						float f_1191_ = fs_1097_[i_1186_];
						float f_1192_ = (fs_1100_[i_1184_] + fs_1100_[i_1185_] + fs_1100_[i_1186_]);
						if (((f - f_1187_) * (f_1191_ - f_1190_) - (f_1189_ - f_1190_) * (f_1188_ - f_1187_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1187_ < 0.0F || f_1188_ < 0.0F || f > (float) class118.anInt1448 || f_1187_ > (float) class118.anInt1448 || f_1188_ > (float) class118.anInt1448);
							Class177 class177 = null;
							boolean bool_1193_ = false;
							if (class94.aShortArray1155[i_1183_] != -1) {
								class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class94.aShortArray1155[i_1183_] & 0xffff), -87874856));
								bool_1193_ = class177.aBool1881;
							}
							if (f_1192_ < 3.0F) {
								if (f_1192_ > 0.0F) {
									if (bool_1193_) {
										int i_1194_ = -16777216;
										if (method15364(class177.aByte1905))
											i_1194_ = -1694498816;
										class118.method2053(true, true, false, f_1189_, f_1190_, f_1191_, f, f_1187_, f_1188_, fs_1098_[i_1184_], fs_1098_[i_1185_], fs_1098_[i_1186_], fs_1099_[i_1184_], fs_1099_[i_1185_], fs_1099_[i_1186_], ((float) (class94.aShortArray1154[i_1184_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1185_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1186_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1184_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1185_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1186_]) / (float) (anInt1682 * 341909049)), i_1194_ | (class94.anIntArray1158[i_1184_]) & 0xffffff, i_1194_ | (class94.anIntArray1158[i_1185_]) & 0xffffff, i_1194_ | (class94.anIntArray1158[i_1186_]) & 0xffffff, class99.anInt1192 * 340278173, fs_1100_[i_1184_] * 255.0F, fs_1100_[i_1185_] * 255.0F, fs_1100_[i_1186_] * 255.0F, (class94.aShortArray1155[i_1183_] & 0xffff));
									} else if ((class94.anIntArray1158[i_1184_] & 0xffffff) != 0) {
										class118.method2031(true, true, false, f_1189_, f_1190_, f_1191_, f, f_1187_, f_1188_, fs_1098_[i_1184_], fs_1098_[i_1185_], fs_1098_[i_1186_], (Class155.method2546(class94.anIntArray1158[i_1184_], ((int) (fs_1100_[i_1184_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -968873045)), (Class155.method2546(class94.anIntArray1158[i_1185_], ((int) (fs_1100_[i_1185_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -664752304)), (Class155.method2546(class94.anIntArray1158[i_1186_], ((int) (fs_1100_[i_1186_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -366691381)));
										class118.anInt1438 = 0;
									}
								} else if (bool_1193_) {
									int i_1195_ = -16777216;
									if (method15364(class177.aByte1905))
										i_1195_ = -1694498816;
									class118.method2053(true, true, false, f_1189_, f_1190_, f_1191_, f, f_1187_, f_1188_, fs_1098_[i_1184_], fs_1098_[i_1185_], fs_1098_[i_1186_], fs_1099_[i_1184_], fs_1099_[i_1185_], fs_1099_[i_1186_], ((float) (class94.aShortArray1154[i_1184_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1185_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1186_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1184_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1185_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1186_]) / (float) (anInt1682 * 341909049)), i_1195_ | (class94.anIntArray1158[i_1184_]) & 0xffffff, i_1195_ | (class94.anIntArray1158[i_1185_]) & 0xffffff, i_1195_ | (class94.anIntArray1158[i_1186_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (class94.aShortArray1155[i_1183_] & 0xffff));
								} else if ((class94.anIntArray1158[i_1184_] & 0xffffff) != 0) {
									class118.method2031(true, true, false, f_1189_, f_1190_, f_1191_, f, f_1187_, f_1188_, fs_1098_[i_1184_], fs_1098_[i_1185_], fs_1098_[i_1186_], class94.anIntArray1158[i_1184_], class94.anIntArray1158[i_1185_], class94.anIntArray1158[i_1186_]);
									class118.anInt1438 = 0;
								}
							} else
								class118.method2037(true, true, false, f_1189_, f_1190_, f_1191_, f, f_1187_, f_1188_, fs_1098_[i_1184_], fs_1098_[i_1185_], fs_1098_[i_1186_], (class99.anInt1192 * 340278173));
						}
					}
				} else {
					for (int i_1196_ = 0; i_1196_ < class94.aShort1161; i_1196_++) {
						int i_1197_ = i_1196_ * 3;
						int i_1198_ = i_1197_ + 1;
						int i_1199_ = i_1198_ + 1;
						float f = fs[i_1197_];
						float f_1200_ = fs[i_1198_];
						float f_1201_ = fs[i_1199_];
						float f_1202_ = fs_1097_[i_1197_];
						float f_1203_ = fs_1097_[i_1198_];
						float f_1204_ = fs_1097_[i_1199_];
						float f_1205_ = (fs_1100_[i_1197_] + fs_1100_[i_1198_] + fs_1100_[i_1199_]);
						if (((f - f_1200_) * (f_1204_ - f_1203_) - (f_1202_ - f_1203_) * (f_1201_ - f_1200_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1200_ < 0.0F || f_1201_ < 0.0F || f > (float) class118.anInt1448 || f_1200_ > (float) class118.anInt1448 || f_1201_ > (float) class118.anInt1448);
							if (f_1205_ < 3.0F) {
								if (f_1205_ > 0.0F) {
									if ((class94.anIntArray1158[i_1197_] & 0xffffff) != 0)
										class118.method2031(true, true, false, f_1202_, f_1203_, f_1204_, f, f_1200_, f_1201_, fs_1098_[i_1197_], fs_1098_[i_1198_], fs_1098_[i_1199_], (Class234.method4271(class94.anIntArray1158[i_1197_], class99.anInt1192 * 340278173, fs_1100_[i_1197_] * 255.0F, 867964410)), (Class234.method4271(class94.anIntArray1158[i_1198_], class99.anInt1192 * 340278173, fs_1100_[i_1198_] * 255.0F, -1617847782)), (Class234.method4271(class94.anIntArray1158[i_1199_], class99.anInt1192 * 340278173, fs_1100_[i_1199_] * 255.0F, -1975391325)));
								} else if ((class94.anIntArray1158[i_1197_] & 0xffffff) != 0)
									class118.method2031(true, true, false, f_1202_, f_1203_, f_1204_, f, f_1200_, f_1201_, fs_1098_[i_1197_], fs_1098_[i_1198_], fs_1098_[i_1199_], class94.anIntArray1158[i_1197_], class94.anIntArray1158[i_1198_], class94.anIntArray1158[i_1199_]);
							} else
								class118.method2037(true, true, false, f_1202_, f_1203_, f_1204_, f, f_1200_, f_1201_, fs_1098_[i_1197_], fs_1098_[i_1198_], fs_1098_[i_1199_], (class99.anInt1192 * 340278173));
						}
					}
				}
			}
		}
	}

	void method15369(int i, int i_1206_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_1207_, float[] fs_1208_, float[] fs_1209_, float[] fs_1210_, int i_1211_) {
		Class106 class106 = aClass106ArrayArray9758[i][i_1206_];
		if (class106 != null) {
			if ((class106.aByte1292 & 0x2) == 0) {
				if (i_1211_ != 0) {
					if ((class106.aByte1292 & 0x4) != 0) {
						if ((i_1211_ & 0x1) != 0)
							return;
					} else if ((i_1211_ & 0x2) != 0)
						return;
				}
				int i_1212_ = i * (anInt1682 * 341909049);
				int i_1213_ = i_1212_ + anInt1682 * 341909049;
				int i_1214_ = i_1206_ * (anInt1682 * 341909049);
				int i_1215_ = i_1214_ + anInt1682 * 341909049;
				float f = 0.0F;
				float f_1216_ = 0.0F;
				float f_1217_ = 0.0F;
				float f_1218_ = 0.0F;
				float f_1219_;
				float f_1220_;
				float f_1221_;
				float f_1222_;
				float f_1223_;
				float f_1224_;
				float f_1225_;
				float f_1226_;
				float f_1227_;
				float f_1228_;
				float f_1229_;
				float f_1230_;
				float f_1231_;
				float f_1232_;
				float f_1233_;
				float f_1234_;
				if ((class106.aByte1292 & 0x1) != 0 && !bool) {
					int i_1235_ = anIntArrayArray1684[i][i_1206_];
					float f_1236_ = aFloat9773 * (float) i_1235_;
					float f_1237_ = aFloat9754 * (float) i_1235_;
					float f_1238_ = aFloat9767 + (aFloat9755 * (float) i_1212_ + f_1236_ + aFloat9750 * (float) i_1214_);
					f_1219_ = aFloat9768 + (aFloat9756 * (float) i_1212_ + f_1237_ + aFloat9764 * (float) i_1214_);
					if (f_1238_ < -f_1219_)
						return;
					float f_1239_ = aFloat9767 + (aFloat9755 * (float) i_1213_ + f_1236_ + aFloat9750 * (float) i_1214_);
					f_1220_ = aFloat9768 + (aFloat9756 * (float) i_1213_ + f_1237_ + aFloat9764 * (float) i_1214_);
					if (f_1239_ < -f_1220_)
						return;
					float f_1240_ = aFloat9767 + (aFloat9755 * (float) i_1213_ + f_1236_ + aFloat9750 * (float) i_1215_);
					f_1221_ = aFloat9768 + (aFloat9756 * (float) i_1213_ + f_1237_ + aFloat9764 * (float) i_1215_);
					if (f_1240_ < -f_1221_)
						return;
					float f_1241_ = aFloat9767 + (aFloat9755 * (float) i_1212_ + f_1236_ + aFloat9750 * (float) i_1215_);
					f_1222_ = aFloat9768 + (aFloat9756 * (float) i_1212_ + f_1237_ + aFloat9764 * (float) i_1215_);
					if (f_1241_ < -f_1222_)
						return;
					f_1223_ = (class118.aFloat1458 + class118.aFloat1447 * f_1238_ / f_1219_);
					f_1224_ = (class118.aFloat1458 + class118.aFloat1447 * f_1239_ / f_1220_);
					f_1225_ = (class118.aFloat1458 + class118.aFloat1447 * f_1240_ / f_1221_);
					f_1226_ = (class118.aFloat1458 + class118.aFloat1447 * f_1241_ / f_1222_);
					if (class99.aBool1189) {
						float f_1242_ = f_1238_ - class99.aFloat1205;
						if (f_1242_ > 0.0F) {
							f = f_1242_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1242_ = f_1239_ - class99.aFloat1205;
						if (f_1242_ > 0.0F) {
							f_1216_ = f_1242_ / class99.aFloat1191;
							if (f_1216_ > 1.0F)
								f_1216_ = 1.0F;
						}
						f_1242_ = f_1240_ - class99.aFloat1205;
						if (f_1242_ > 0.0F) {
							f_1217_ = f_1242_ / class99.aFloat1191;
							if (f_1217_ > 1.0F)
								f_1217_ = 1.0F;
						}
						f_1242_ = f_1241_ - class99.aFloat1205;
						if (f_1242_ > 0.0F) {
							f_1218_ = f_1242_ / class99.aFloat1191;
							if (f_1218_ > 1.0F)
								f_1218_ = 1.0F;
						}
					}
					float f_1243_ = aFloat9757 * (float) i_1235_;
					float f_1244_ = aFloat9748 * (float) i_1235_;
					float f_1245_ = aFloat9765 + (aFloat9753 * (float) i_1212_ + f_1243_ + aFloat9741 * (float) i_1214_);
					f_1227_ = (class118.aFloat1442 + class118.aFloat1469 * f_1245_ / f_1219_);
					float f_1246_ = aFloat9761 + (aFloat9771 * (float) i_1212_ + f_1244_ + aFloat9762 * (float) i_1214_);
					f_1228_ = (class118.aFloat1473 + class118.aFloat1444 * f_1246_ / f_1219_);
					float f_1247_ = aFloat9765 + (aFloat9753 * (float) i_1213_ + f_1243_ + aFloat9741 * (float) i_1214_);
					f_1229_ = (class118.aFloat1442 + class118.aFloat1469 * f_1247_ / f_1220_);
					float f_1248_ = aFloat9761 + (aFloat9771 * (float) i_1213_ + f_1244_ + aFloat9762 * (float) i_1214_);
					f_1230_ = (class118.aFloat1473 + class118.aFloat1444 * f_1248_ / f_1220_);
					float f_1249_ = aFloat9765 + (aFloat9753 * (float) i_1213_ + f_1243_ + aFloat9741 * (float) i_1215_);
					f_1231_ = (class118.aFloat1442 + class118.aFloat1469 * f_1249_ / f_1221_);
					float f_1250_ = aFloat9761 + (aFloat9771 * (float) i_1213_ + f_1244_ + aFloat9762 * (float) i_1215_);
					f_1232_ = (class118.aFloat1473 + class118.aFloat1444 * f_1250_ / f_1221_);
					float f_1251_ = aFloat9765 + (aFloat9753 * (float) i_1212_ + f_1243_ + aFloat9741 * (float) i_1215_);
					f_1233_ = (class118.aFloat1442 + class118.aFloat1469 * f_1251_ / f_1222_);
					float f_1252_ = aFloat9761 + (aFloat9771 * (float) i_1212_ + f_1244_ + aFloat9762 * (float) i_1215_);
					f_1234_ = (class118.aFloat1473 + class118.aFloat1444 * f_1252_ / f_1222_);
				} else {
					int i_1253_ = anIntArrayArray1684[i][i_1206_];
					int i_1254_ = anIntArrayArray1684[i + 1][i_1206_];
					int i_1255_ = anIntArrayArray1684[i + 1][i_1206_ + 1];
					int i_1256_ = anIntArrayArray1684[i][i_1206_ + 1];
					float f_1257_ = aFloat9767 + (aFloat9755 * (float) i_1212_ + aFloat9773 * (float) i_1253_ + aFloat9750 * (float) i_1214_);
					f_1219_ = aFloat9768 + (aFloat9756 * (float) i_1212_ + aFloat9754 * (float) i_1253_ + aFloat9764 * (float) i_1214_);
					if (f_1257_ < -f_1219_)
						return;
					float f_1258_ = aFloat9767 + (aFloat9755 * (float) i_1213_ + aFloat9773 * (float) i_1254_ + aFloat9750 * (float) i_1214_);
					f_1220_ = aFloat9768 + (aFloat9756 * (float) i_1213_ + aFloat9754 * (float) i_1254_ + aFloat9764 * (float) i_1214_);
					if (f_1258_ < -f_1220_)
						return;
					float f_1259_ = aFloat9767 + (aFloat9755 * (float) i_1213_ + aFloat9773 * (float) i_1255_ + aFloat9750 * (float) i_1215_);
					f_1221_ = aFloat9768 + (aFloat9756 * (float) i_1213_ + aFloat9754 * (float) i_1255_ + aFloat9764 * (float) i_1215_);
					if (f_1259_ < -f_1221_)
						return;
					float f_1260_ = aFloat9767 + (aFloat9755 * (float) i_1212_ + aFloat9773 * (float) i_1256_ + aFloat9750 * (float) i_1215_);
					f_1222_ = aFloat9768 + (aFloat9756 * (float) i_1212_ + aFloat9754 * (float) i_1256_ + aFloat9764 * (float) i_1215_);
					if (f_1260_ < -f_1222_)
						return;
					f_1223_ = (class118.aFloat1458 + class118.aFloat1447 * f_1257_ / f_1219_);
					f_1224_ = (class118.aFloat1458 + class118.aFloat1447 * f_1258_ / f_1220_);
					f_1225_ = (class118.aFloat1458 + class118.aFloat1447 * f_1259_ / f_1221_);
					f_1226_ = (class118.aFloat1458 + class118.aFloat1447 * f_1260_ / f_1222_);
					if (bool) {
						float f_1261_ = f_1257_ - class99.aFloat1205;
						if (f_1261_ > 0.0F) {
							f_1261_ /= class99.aFloat1191;
							if (f_1261_ > 1.0F)
								f_1261_ = 1.0F;
							f = f_1261_;
							int i_1262_ = (int) ((float) class106.aShort1290 * f_1261_);
							if (i_1262_ > 0)
								i_1253_ -= i_1262_;
						}
						f_1261_ = f_1258_ - class99.aFloat1205;
						if (f_1261_ > 0.0F) {
							f_1261_ /= class99.aFloat1191;
							if (f_1261_ > 1.0F)
								f_1261_ = 1.0F;
							f_1216_ = f_1261_;
							int i_1263_ = (int) ((float) class106.aShort1293 * f_1261_);
							if (i_1263_ > 0)
								i_1254_ -= i_1263_;
						}
						f_1261_ = f_1259_ - class99.aFloat1205;
						if (f_1261_ > 0.0F) {
							f_1261_ /= class99.aFloat1191;
							if (f_1261_ > 1.0F)
								f_1261_ = 1.0F;
							f_1217_ = f_1261_;
							int i_1264_ = (int) ((float) class106.aShort1294 * f_1261_);
							if (i_1264_ > 0)
								i_1255_ -= i_1264_;
						}
						f_1261_ = f_1260_ - class99.aFloat1205;
						if (f_1261_ > 0.0F) {
							f_1261_ /= class99.aFloat1191;
							if (f_1261_ > 1.0F)
								f_1261_ = 1.0F;
							f_1218_ = f_1261_;
							int i_1265_ = (int) ((float) class106.aShort1295 * f_1261_);
							if (i_1265_ > 0)
								i_1256_ -= i_1265_;
						}
					} else if (class99.aBool1189) {
						float f_1266_ = f_1257_ - class99.aFloat1205;
						if (f_1266_ > 0.0F) {
							f = f_1266_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1266_ = f_1258_ - class99.aFloat1205;
						if (f_1266_ > 0.0F) {
							f_1216_ = f_1266_ / class99.aFloat1191;
							if (f_1216_ > 1.0F)
								f_1216_ = 1.0F;
						}
						f_1266_ = f_1259_ - class99.aFloat1205;
						if (f_1266_ > 0.0F) {
							f_1217_ = f_1266_ / class99.aFloat1191;
							if (f_1217_ > 1.0F)
								f_1217_ = 1.0F;
						}
						f_1266_ = f_1260_ - class99.aFloat1205;
						if (f_1266_ > 0.0F) {
							f_1218_ = f_1266_ / class99.aFloat1191;
							if (f_1218_ > 1.0F)
								f_1218_ = 1.0F;
						}
					}
					float f_1267_ = aFloat9765 + (aFloat9753 * (float) i_1212_ + aFloat9757 * (float) i_1253_ + aFloat9741 * (float) i_1214_);
					f_1227_ = (class118.aFloat1442 + class118.aFloat1469 * f_1267_ / f_1219_);
					float f_1268_ = aFloat9761 + (aFloat9771 * (float) i_1212_ + aFloat9748 * (float) i_1253_ + aFloat9762 * (float) i_1214_);
					f_1228_ = (class118.aFloat1473 + class118.aFloat1444 * f_1268_ / f_1219_);
					float f_1269_ = aFloat9765 + (aFloat9753 * (float) i_1213_ + aFloat9757 * (float) i_1254_ + aFloat9741 * (float) i_1214_);
					f_1229_ = (class118.aFloat1442 + class118.aFloat1469 * f_1269_ / f_1220_);
					float f_1270_ = aFloat9761 + (aFloat9771 * (float) i_1213_ + aFloat9748 * (float) i_1254_ + aFloat9762 * (float) i_1214_);
					f_1230_ = (class118.aFloat1473 + class118.aFloat1444 * f_1270_ / f_1220_);
					float f_1271_ = aFloat9765 + (aFloat9753 * (float) i_1213_ + aFloat9757 * (float) i_1255_ + aFloat9741 * (float) i_1215_);
					f_1231_ = (class118.aFloat1442 + class118.aFloat1469 * f_1271_ / f_1221_);
					float f_1272_ = aFloat9761 + (aFloat9771 * (float) i_1213_ + aFloat9748 * (float) i_1255_ + aFloat9762 * (float) i_1215_);
					f_1232_ = (class118.aFloat1473 + class118.aFloat1444 * f_1272_ / f_1221_);
					float f_1273_ = aFloat9765 + (aFloat9753 * (float) i_1212_ + aFloat9757 * (float) i_1256_ + aFloat9741 * (float) i_1215_);
					f_1233_ = (class118.aFloat1442 + class118.aFloat1469 * f_1273_ / f_1222_);
					float f_1274_ = aFloat9761 + (aFloat9771 * (float) i_1212_ + aFloat9748 * (float) i_1256_ + aFloat9762 * (float) i_1215_);
					f_1234_ = (class118.aFloat1473 + class118.aFloat1444 * f_1274_ / f_1222_);
				}
				Class177 class177 = null;
				boolean bool_1275_ = false;
				if (class106.aShort1297 != -1) {
					class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class106.aShort1297 & 0xffff, -176205790));
					bool_1275_ = class177.aBool1881;
				}
				boolean bool_1276_ = class177 != null && method15364(class177.aByte1905);
				float f_1277_ = f_1216_ + f_1217_ + f_1218_;
				if (((f_1231_ - f_1233_) * (f_1230_ - f_1234_) - (f_1232_ - f_1234_) * (f_1229_ - f_1233_)) > 0.0F) {
					class118.aBool1455 = (f_1231_ < 0.0F || f_1233_ < 0.0F || f_1229_ < 0.0F || f_1231_ > (float) class118.anInt1448 || f_1233_ > (float) class118.anInt1448 || f_1229_ > (float) class118.anInt1448);
					if (f_1277_ < 3.0F) {
						if (f_1277_ > 0.0F) {
							if (bool_1275_) {
								int i_1278_ = -16777216;
								if (bool_1276_)
									i_1278_ = -1694498816;
								class118.method2053(true, true, false, f_1232_, f_1234_, f_1230_, f_1231_, f_1233_, f_1229_, f_1225_, f_1226_, f_1224_, f_1221_, f_1222_, f_1220_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1278_ | class106.anInt1289 & 0xffffff, i_1278_ | class106.anInt1291 & 0xffffff, i_1278_ | class106.anInt1287 & 0xffffff, class99.anInt1192 * 340278173, f_1217_ * 255.0F, f_1218_ * 255.0F, f_1216_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1276_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1232_, f_1234_, f_1230_, f_1231_, f_1233_, f_1229_, f_1225_, f_1226_, f_1224_, Class155.method2546(class106.anInt1289, (((int) (f_1217_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1498433642), Class155.method2546(class106.anInt1291, (((int) (f_1218_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1135162544), Class155.method2546(class106.anInt1287, (((int) (f_1216_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -784014026));
								class118.anInt1438 = 0;
							}
						} else if (bool_1275_) {
							int i_1279_ = -16777216;
							if (bool_1276_)
								i_1279_ = -1694498816;
							class118.method2053(true, true, false, f_1232_, f_1234_, f_1230_, f_1231_, f_1233_, f_1229_, f_1225_, f_1226_, f_1224_, f_1221_, f_1222_, f_1220_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1279_ | class106.anInt1289 & 0xffffff, i_1279_ | class106.anInt1291 & 0xffffff, i_1279_ | class106.anInt1287 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1276_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1232_, f_1234_, f_1230_, f_1231_, f_1233_, f_1229_, f_1225_, f_1226_, f_1224_, class106.anInt1289, class106.anInt1291, class106.anInt1287);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1232_, f_1234_, f_1230_, f_1231_, f_1233_, f_1229_, f_1225_, f_1226_, f_1224_, class99.anInt1192 * 340278173);
				}
				f_1277_ = f + f_1216_ + f_1218_;
				if (((f_1227_ - f_1229_) * (f_1234_ - f_1230_) - (f_1228_ - f_1230_) * (f_1233_ - f_1229_)) > 0.0F) {
					class118.aBool1455 = (f_1227_ < 0.0F || f_1229_ < 0.0F || f_1233_ < 0.0F || f_1227_ > (float) class118.anInt1448 || f_1229_ > (float) class118.anInt1448 || f_1233_ > (float) class118.anInt1448);
					if (f_1277_ < 3.0F) {
						if (bool_1276_)
							class118.anInt1438 = -1694498816;
						if (f_1277_ > 0.0F) {
							if (bool_1275_) {
								int i_1280_ = -16777216;
								if (bool_1276_)
									i_1280_ = -1694498816;
								class118.method2053(true, true, false, f_1228_, f_1230_, f_1234_, f_1227_, f_1229_, f_1233_, f_1223_, f_1224_, f_1226_, f_1219_, f_1220_, f_1222_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1280_ | class106.anInt1288 & 0xffffff, i_1280_ | class106.anInt1287 & 0xffffff, i_1280_ | class106.anInt1291 & 0xffffff, class99.anInt1192 * 340278173, f * 255.0F, f_1216_ * 255.0F, f_1218_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1276_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1228_, f_1230_, f_1234_, f_1227_, f_1229_, f_1233_, f_1223_, f_1224_, f_1226_, Class155.method2546(class106.anInt1288, (((int) (f * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -219207022), Class155.method2546(class106.anInt1287, (((int) (f_1216_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -950295419), Class155.method2546(class106.anInt1291, (((int) (f_1218_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -590270365));
								class118.anInt1438 = 0;
							}
						} else if (bool_1275_) {
							int i_1281_ = -16777216;
							if (bool_1276_)
								i_1281_ = -1694498816;
							class118.method2053(true, true, false, f_1228_, f_1230_, f_1234_, f_1227_, f_1229_, f_1233_, f_1223_, f_1224_, f_1226_, f_1219_, f_1220_, f_1222_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1281_ | class106.anInt1288 & 0xffffff, i_1281_ | class106.anInt1287 & 0xffffff, i_1281_ | class106.anInt1291 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1276_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1228_, f_1230_, f_1234_, f_1227_, f_1229_, f_1233_, f_1223_, f_1224_, f_1226_, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1228_, f_1230_, f_1234_, f_1227_, f_1229_, f_1233_, f_1223_, f_1224_, f_1226_, class99.anInt1192 * 340278173);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9751[i][i_1206_];
			if (class94 != null) {
				if (i_1211_ != 0) {
					if ((class94.aByte1153 & 0x4) != 0) {
						if ((i_1211_ & 0x1) != 0)
							return;
					} else if ((i_1211_ & 0x2) != 0)
						return;
				}
				for (int i_1282_ = 0; i_1282_ < class94.aShort1152; i_1282_++) {
					int i_1283_ = (class94.aShortArray1154[i_1282_] + (i << anInt1680 * -1193058675));
					int i_1284_ = class94.aShortArray1151[i_1282_];
					int i_1285_ = (class94.aShortArray1156[i_1282_] + (i_1206_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1283_ + aFloat9773 * (float) i_1284_ + aFloat9750 * (float) i_1285_);
					float f_1286_ = aFloat9768 + (aFloat9756 * (float) i_1283_ + aFloat9754 * (float) i_1284_ + aFloat9764 * (float) i_1285_);
					if (f < -f_1286_)
						return;
					float f_1287_ = (class118.aFloat1458 + class118.aFloat1447 * f / f_1286_);
					fs_1210_[i_1282_] = 0.0F;
					if (bool) {
						float f_1288_ = f - class99.aFloat1205;
						if (f_1288_ > 0.0F) {
							f_1288_ /= class99.aFloat1191;
							if (f_1288_ > 1.0F)
								f_1288_ = 1.0F;
							fs_1210_[i_1282_] = f_1288_;
							int i_1289_ = (int) ((float) (class94.aShortArray1157[i_1282_]) * f_1288_);
							if (i_1289_ > 0)
								i_1284_ -= i_1289_;
						}
					} else if (class99.aBool1189) {
						float f_1290_ = f - class99.aFloat1205;
						if (f_1290_ > 0.0F) {
							fs_1210_[i_1282_] = f_1290_ / class99.aFloat1191;
							if (fs_1210_[i_1282_] > 1.0F)
								fs_1210_[i_1282_] = 1.0F;
						}
					}
					float f_1291_ = aFloat9765 + (aFloat9753 * (float) i_1283_ + aFloat9757 * (float) i_1284_ + aFloat9741 * (float) i_1285_);
					float f_1292_ = aFloat9761 + (aFloat9771 * (float) i_1283_ + aFloat9748 * (float) i_1284_ + aFloat9762 * (float) i_1285_);
					fs[i_1282_] = (class118.aFloat1442 + class118.aFloat1469 * f_1291_ / f_1286_);
					fs_1207_[i_1282_] = (class118.aFloat1473 + class118.aFloat1444 * f_1292_ / f_1286_);
					fs_1208_[i_1282_] = f_1287_;
					fs_1209_[i_1282_] = f_1286_;
				}
				if (class94.aShortArray1155 != null) {
					for (int i_1293_ = 0; i_1293_ < class94.aShort1161; i_1293_++) {
						int i_1294_ = i_1293_ * 3;
						int i_1295_ = i_1294_ + 1;
						int i_1296_ = i_1295_ + 1;
						float f = fs[i_1294_];
						float f_1297_ = fs[i_1295_];
						float f_1298_ = fs[i_1296_];
						float f_1299_ = fs_1207_[i_1294_];
						float f_1300_ = fs_1207_[i_1295_];
						float f_1301_ = fs_1207_[i_1296_];
						float f_1302_ = (fs_1210_[i_1294_] + fs_1210_[i_1295_] + fs_1210_[i_1296_]);
						if (((f - f_1297_) * (f_1301_ - f_1300_) - (f_1299_ - f_1300_) * (f_1298_ - f_1297_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1297_ < 0.0F || f_1298_ < 0.0F || f > (float) class118.anInt1448 || f_1297_ > (float) class118.anInt1448 || f_1298_ > (float) class118.anInt1448);
							Class177 class177 = null;
							boolean bool_1303_ = false;
							if (class94.aShortArray1155[i_1293_] != -1) {
								class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class94.aShortArray1155[i_1293_] & 0xffff), 500858000));
								bool_1303_ = class177.aBool1881;
							}
							if (f_1302_ < 3.0F) {
								if (f_1302_ > 0.0F) {
									if (bool_1303_) {
										int i_1304_ = -16777216;
										if (method15364(class177.aByte1905))
											i_1304_ = -1694498816;
										class118.method2053(true, true, false, f_1299_, f_1300_, f_1301_, f, f_1297_, f_1298_, fs_1208_[i_1294_], fs_1208_[i_1295_], fs_1208_[i_1296_], fs_1209_[i_1294_], fs_1209_[i_1295_], fs_1209_[i_1296_], ((float) (class94.aShortArray1154[i_1294_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1295_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1296_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1294_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1295_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1296_]) / (float) (anInt1682 * 341909049)), i_1304_ | (class94.anIntArray1158[i_1294_]) & 0xffffff, i_1304_ | (class94.anIntArray1158[i_1295_]) & 0xffffff, i_1304_ | (class94.anIntArray1158[i_1296_]) & 0xffffff, class99.anInt1192 * 340278173, fs_1210_[i_1294_] * 255.0F, fs_1210_[i_1295_] * 255.0F, fs_1210_[i_1296_] * 255.0F, (class94.aShortArray1155[i_1293_] & 0xffff));
									} else if ((class94.anIntArray1158[i_1294_] & 0xffffff) != 0) {
										class118.method2031(true, true, false, f_1299_, f_1300_, f_1301_, f, f_1297_, f_1298_, fs_1208_[i_1294_], fs_1208_[i_1295_], fs_1208_[i_1296_], (Class155.method2546(class94.anIntArray1158[i_1294_], ((int) (fs_1210_[i_1294_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -869413342)), (Class155.method2546(class94.anIntArray1158[i_1295_], ((int) (fs_1210_[i_1295_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -2078223251)), (Class155.method2546(class94.anIntArray1158[i_1296_], ((int) (fs_1210_[i_1296_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -447308837)));
										class118.anInt1438 = 0;
									}
								} else if (bool_1303_) {
									int i_1305_ = -16777216;
									if (method15364(class177.aByte1905))
										i_1305_ = -1694498816;
									class118.method2053(true, true, false, f_1299_, f_1300_, f_1301_, f, f_1297_, f_1298_, fs_1208_[i_1294_], fs_1208_[i_1295_], fs_1208_[i_1296_], fs_1209_[i_1294_], fs_1209_[i_1295_], fs_1209_[i_1296_], ((float) (class94.aShortArray1154[i_1294_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1295_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1296_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1294_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1295_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1296_]) / (float) (anInt1682 * 341909049)), i_1305_ | (class94.anIntArray1158[i_1294_]) & 0xffffff, i_1305_ | (class94.anIntArray1158[i_1295_]) & 0xffffff, i_1305_ | (class94.anIntArray1158[i_1296_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (class94.aShortArray1155[i_1293_] & 0xffff));
								} else if ((class94.anIntArray1158[i_1294_] & 0xffffff) != 0) {
									class118.method2031(true, true, false, f_1299_, f_1300_, f_1301_, f, f_1297_, f_1298_, fs_1208_[i_1294_], fs_1208_[i_1295_], fs_1208_[i_1296_], class94.anIntArray1158[i_1294_], class94.anIntArray1158[i_1295_], class94.anIntArray1158[i_1296_]);
									class118.anInt1438 = 0;
								}
							} else
								class118.method2037(true, true, false, f_1299_, f_1300_, f_1301_, f, f_1297_, f_1298_, fs_1208_[i_1294_], fs_1208_[i_1295_], fs_1208_[i_1296_], (class99.anInt1192 * 340278173));
						}
					}
				} else {
					for (int i_1306_ = 0; i_1306_ < class94.aShort1161; i_1306_++) {
						int i_1307_ = i_1306_ * 3;
						int i_1308_ = i_1307_ + 1;
						int i_1309_ = i_1308_ + 1;
						float f = fs[i_1307_];
						float f_1310_ = fs[i_1308_];
						float f_1311_ = fs[i_1309_];
						float f_1312_ = fs_1207_[i_1307_];
						float f_1313_ = fs_1207_[i_1308_];
						float f_1314_ = fs_1207_[i_1309_];
						float f_1315_ = (fs_1210_[i_1307_] + fs_1210_[i_1308_] + fs_1210_[i_1309_]);
						if (((f - f_1310_) * (f_1314_ - f_1313_) - (f_1312_ - f_1313_) * (f_1311_ - f_1310_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1310_ < 0.0F || f_1311_ < 0.0F || f > (float) class118.anInt1448 || f_1310_ > (float) class118.anInt1448 || f_1311_ > (float) class118.anInt1448);
							if (f_1315_ < 3.0F) {
								if (f_1315_ > 0.0F) {
									if ((class94.anIntArray1158[i_1307_] & 0xffffff) != 0)
										class118.method2031(true, true, false, f_1312_, f_1313_, f_1314_, f, f_1310_, f_1311_, fs_1208_[i_1307_], fs_1208_[i_1308_], fs_1208_[i_1309_], (Class234.method4271(class94.anIntArray1158[i_1307_], class99.anInt1192 * 340278173, fs_1210_[i_1307_] * 255.0F, 486254753)), (Class234.method4271(class94.anIntArray1158[i_1308_], class99.anInt1192 * 340278173, fs_1210_[i_1308_] * 255.0F, -1292711007)), (Class234.method4271(class94.anIntArray1158[i_1309_], class99.anInt1192 * 340278173, fs_1210_[i_1309_] * 255.0F, 57492595)));
								} else if ((class94.anIntArray1158[i_1307_] & 0xffffff) != 0)
									class118.method2031(true, true, false, f_1312_, f_1313_, f_1314_, f, f_1310_, f_1311_, fs_1208_[i_1307_], fs_1208_[i_1308_], fs_1208_[i_1309_], class94.anIntArray1158[i_1307_], class94.anIntArray1158[i_1308_], class94.anIntArray1158[i_1309_]);
							} else
								class118.method2037(true, true, false, f_1312_, f_1313_, f_1314_, f, f_1310_, f_1311_, fs_1208_[i_1307_], fs_1208_[i_1308_], fs_1208_[i_1309_], (class99.anInt1192 * 340278173));
						}
					}
				}
			}
		}
	}

	void method15370(int i, int i_1316_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_1317_, float[] fs_1318_, float[] fs_1319_, float[] fs_1320_, int i_1321_) {
		Class106 class106 = aClass106ArrayArray9758[i][i_1316_];
		if (class106 != null) {
			if ((class106.aByte1292 & 0x2) == 0) {
				if (i_1321_ != 0) {
					if ((class106.aByte1292 & 0x4) != 0) {
						if ((i_1321_ & 0x1) != 0)
							return;
					} else if ((i_1321_ & 0x2) != 0)
						return;
				}
				int i_1322_ = i * (anInt1682 * 341909049);
				int i_1323_ = i_1322_ + anInt1682 * 341909049;
				int i_1324_ = i_1316_ * (anInt1682 * 341909049);
				int i_1325_ = i_1324_ + anInt1682 * 341909049;
				float f = 0.0F;
				float f_1326_ = 0.0F;
				float f_1327_ = 0.0F;
				float f_1328_ = 0.0F;
				float f_1329_;
				float f_1330_;
				float f_1331_;
				float f_1332_;
				float f_1333_;
				float f_1334_;
				float f_1335_;
				float f_1336_;
				float f_1337_;
				float f_1338_;
				float f_1339_;
				float f_1340_;
				float f_1341_;
				float f_1342_;
				float f_1343_;
				float f_1344_;
				if ((class106.aByte1292 & 0x1) != 0 && !bool) {
					int i_1345_ = anIntArrayArray1684[i][i_1316_];
					float f_1346_ = aFloat9773 * (float) i_1345_;
					float f_1347_ = aFloat9754 * (float) i_1345_;
					float f_1348_ = aFloat9767 + (aFloat9755 * (float) i_1322_ + f_1346_ + aFloat9750 * (float) i_1324_);
					f_1329_ = aFloat9768 + (aFloat9756 * (float) i_1322_ + f_1347_ + aFloat9764 * (float) i_1324_);
					if (f_1348_ < -f_1329_)
						return;
					float f_1349_ = aFloat9767 + (aFloat9755 * (float) i_1323_ + f_1346_ + aFloat9750 * (float) i_1324_);
					f_1330_ = aFloat9768 + (aFloat9756 * (float) i_1323_ + f_1347_ + aFloat9764 * (float) i_1324_);
					if (f_1349_ < -f_1330_)
						return;
					float f_1350_ = aFloat9767 + (aFloat9755 * (float) i_1323_ + f_1346_ + aFloat9750 * (float) i_1325_);
					f_1331_ = aFloat9768 + (aFloat9756 * (float) i_1323_ + f_1347_ + aFloat9764 * (float) i_1325_);
					if (f_1350_ < -f_1331_)
						return;
					float f_1351_ = aFloat9767 + (aFloat9755 * (float) i_1322_ + f_1346_ + aFloat9750 * (float) i_1325_);
					f_1332_ = aFloat9768 + (aFloat9756 * (float) i_1322_ + f_1347_ + aFloat9764 * (float) i_1325_);
					if (f_1351_ < -f_1332_)
						return;
					f_1333_ = (class118.aFloat1458 + class118.aFloat1447 * f_1348_ / f_1329_);
					f_1334_ = (class118.aFloat1458 + class118.aFloat1447 * f_1349_ / f_1330_);
					f_1335_ = (class118.aFloat1458 + class118.aFloat1447 * f_1350_ / f_1331_);
					f_1336_ = (class118.aFloat1458 + class118.aFloat1447 * f_1351_ / f_1332_);
					if (class99.aBool1189) {
						float f_1352_ = f_1348_ - class99.aFloat1205;
						if (f_1352_ > 0.0F) {
							f = f_1352_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1352_ = f_1349_ - class99.aFloat1205;
						if (f_1352_ > 0.0F) {
							f_1326_ = f_1352_ / class99.aFloat1191;
							if (f_1326_ > 1.0F)
								f_1326_ = 1.0F;
						}
						f_1352_ = f_1350_ - class99.aFloat1205;
						if (f_1352_ > 0.0F) {
							f_1327_ = f_1352_ / class99.aFloat1191;
							if (f_1327_ > 1.0F)
								f_1327_ = 1.0F;
						}
						f_1352_ = f_1351_ - class99.aFloat1205;
						if (f_1352_ > 0.0F) {
							f_1328_ = f_1352_ / class99.aFloat1191;
							if (f_1328_ > 1.0F)
								f_1328_ = 1.0F;
						}
					}
					float f_1353_ = aFloat9757 * (float) i_1345_;
					float f_1354_ = aFloat9748 * (float) i_1345_;
					float f_1355_ = aFloat9765 + (aFloat9753 * (float) i_1322_ + f_1353_ + aFloat9741 * (float) i_1324_);
					f_1337_ = (class118.aFloat1442 + class118.aFloat1469 * f_1355_ / f_1329_);
					float f_1356_ = aFloat9761 + (aFloat9771 * (float) i_1322_ + f_1354_ + aFloat9762 * (float) i_1324_);
					f_1338_ = (class118.aFloat1473 + class118.aFloat1444 * f_1356_ / f_1329_);
					float f_1357_ = aFloat9765 + (aFloat9753 * (float) i_1323_ + f_1353_ + aFloat9741 * (float) i_1324_);
					f_1339_ = (class118.aFloat1442 + class118.aFloat1469 * f_1357_ / f_1330_);
					float f_1358_ = aFloat9761 + (aFloat9771 * (float) i_1323_ + f_1354_ + aFloat9762 * (float) i_1324_);
					f_1340_ = (class118.aFloat1473 + class118.aFloat1444 * f_1358_ / f_1330_);
					float f_1359_ = aFloat9765 + (aFloat9753 * (float) i_1323_ + f_1353_ + aFloat9741 * (float) i_1325_);
					f_1341_ = (class118.aFloat1442 + class118.aFloat1469 * f_1359_ / f_1331_);
					float f_1360_ = aFloat9761 + (aFloat9771 * (float) i_1323_ + f_1354_ + aFloat9762 * (float) i_1325_);
					f_1342_ = (class118.aFloat1473 + class118.aFloat1444 * f_1360_ / f_1331_);
					float f_1361_ = aFloat9765 + (aFloat9753 * (float) i_1322_ + f_1353_ + aFloat9741 * (float) i_1325_);
					f_1343_ = (class118.aFloat1442 + class118.aFloat1469 * f_1361_ / f_1332_);
					float f_1362_ = aFloat9761 + (aFloat9771 * (float) i_1322_ + f_1354_ + aFloat9762 * (float) i_1325_);
					f_1344_ = (class118.aFloat1473 + class118.aFloat1444 * f_1362_ / f_1332_);
				} else {
					int i_1363_ = anIntArrayArray1684[i][i_1316_];
					int i_1364_ = anIntArrayArray1684[i + 1][i_1316_];
					int i_1365_ = anIntArrayArray1684[i + 1][i_1316_ + 1];
					int i_1366_ = anIntArrayArray1684[i][i_1316_ + 1];
					float f_1367_ = aFloat9767 + (aFloat9755 * (float) i_1322_ + aFloat9773 * (float) i_1363_ + aFloat9750 * (float) i_1324_);
					f_1329_ = aFloat9768 + (aFloat9756 * (float) i_1322_ + aFloat9754 * (float) i_1363_ + aFloat9764 * (float) i_1324_);
					if (f_1367_ < -f_1329_)
						return;
					float f_1368_ = aFloat9767 + (aFloat9755 * (float) i_1323_ + aFloat9773 * (float) i_1364_ + aFloat9750 * (float) i_1324_);
					f_1330_ = aFloat9768 + (aFloat9756 * (float) i_1323_ + aFloat9754 * (float) i_1364_ + aFloat9764 * (float) i_1324_);
					if (f_1368_ < -f_1330_)
						return;
					float f_1369_ = aFloat9767 + (aFloat9755 * (float) i_1323_ + aFloat9773 * (float) i_1365_ + aFloat9750 * (float) i_1325_);
					f_1331_ = aFloat9768 + (aFloat9756 * (float) i_1323_ + aFloat9754 * (float) i_1365_ + aFloat9764 * (float) i_1325_);
					if (f_1369_ < -f_1331_)
						return;
					float f_1370_ = aFloat9767 + (aFloat9755 * (float) i_1322_ + aFloat9773 * (float) i_1366_ + aFloat9750 * (float) i_1325_);
					f_1332_ = aFloat9768 + (aFloat9756 * (float) i_1322_ + aFloat9754 * (float) i_1366_ + aFloat9764 * (float) i_1325_);
					if (f_1370_ < -f_1332_)
						return;
					f_1333_ = (class118.aFloat1458 + class118.aFloat1447 * f_1367_ / f_1329_);
					f_1334_ = (class118.aFloat1458 + class118.aFloat1447 * f_1368_ / f_1330_);
					f_1335_ = (class118.aFloat1458 + class118.aFloat1447 * f_1369_ / f_1331_);
					f_1336_ = (class118.aFloat1458 + class118.aFloat1447 * f_1370_ / f_1332_);
					if (bool) {
						float f_1371_ = f_1367_ - class99.aFloat1205;
						if (f_1371_ > 0.0F) {
							f_1371_ /= class99.aFloat1191;
							if (f_1371_ > 1.0F)
								f_1371_ = 1.0F;
							f = f_1371_;
							int i_1372_ = (int) ((float) class106.aShort1290 * f_1371_);
							if (i_1372_ > 0)
								i_1363_ -= i_1372_;
						}
						f_1371_ = f_1368_ - class99.aFloat1205;
						if (f_1371_ > 0.0F) {
							f_1371_ /= class99.aFloat1191;
							if (f_1371_ > 1.0F)
								f_1371_ = 1.0F;
							f_1326_ = f_1371_;
							int i_1373_ = (int) ((float) class106.aShort1293 * f_1371_);
							if (i_1373_ > 0)
								i_1364_ -= i_1373_;
						}
						f_1371_ = f_1369_ - class99.aFloat1205;
						if (f_1371_ > 0.0F) {
							f_1371_ /= class99.aFloat1191;
							if (f_1371_ > 1.0F)
								f_1371_ = 1.0F;
							f_1327_ = f_1371_;
							int i_1374_ = (int) ((float) class106.aShort1294 * f_1371_);
							if (i_1374_ > 0)
								i_1365_ -= i_1374_;
						}
						f_1371_ = f_1370_ - class99.aFloat1205;
						if (f_1371_ > 0.0F) {
							f_1371_ /= class99.aFloat1191;
							if (f_1371_ > 1.0F)
								f_1371_ = 1.0F;
							f_1328_ = f_1371_;
							int i_1375_ = (int) ((float) class106.aShort1295 * f_1371_);
							if (i_1375_ > 0)
								i_1366_ -= i_1375_;
						}
					} else if (class99.aBool1189) {
						float f_1376_ = f_1367_ - class99.aFloat1205;
						if (f_1376_ > 0.0F) {
							f = f_1376_ / class99.aFloat1191;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_1376_ = f_1368_ - class99.aFloat1205;
						if (f_1376_ > 0.0F) {
							f_1326_ = f_1376_ / class99.aFloat1191;
							if (f_1326_ > 1.0F)
								f_1326_ = 1.0F;
						}
						f_1376_ = f_1369_ - class99.aFloat1205;
						if (f_1376_ > 0.0F) {
							f_1327_ = f_1376_ / class99.aFloat1191;
							if (f_1327_ > 1.0F)
								f_1327_ = 1.0F;
						}
						f_1376_ = f_1370_ - class99.aFloat1205;
						if (f_1376_ > 0.0F) {
							f_1328_ = f_1376_ / class99.aFloat1191;
							if (f_1328_ > 1.0F)
								f_1328_ = 1.0F;
						}
					}
					float f_1377_ = aFloat9765 + (aFloat9753 * (float) i_1322_ + aFloat9757 * (float) i_1363_ + aFloat9741 * (float) i_1324_);
					f_1337_ = (class118.aFloat1442 + class118.aFloat1469 * f_1377_ / f_1329_);
					float f_1378_ = aFloat9761 + (aFloat9771 * (float) i_1322_ + aFloat9748 * (float) i_1363_ + aFloat9762 * (float) i_1324_);
					f_1338_ = (class118.aFloat1473 + class118.aFloat1444 * f_1378_ / f_1329_);
					float f_1379_ = aFloat9765 + (aFloat9753 * (float) i_1323_ + aFloat9757 * (float) i_1364_ + aFloat9741 * (float) i_1324_);
					f_1339_ = (class118.aFloat1442 + class118.aFloat1469 * f_1379_ / f_1330_);
					float f_1380_ = aFloat9761 + (aFloat9771 * (float) i_1323_ + aFloat9748 * (float) i_1364_ + aFloat9762 * (float) i_1324_);
					f_1340_ = (class118.aFloat1473 + class118.aFloat1444 * f_1380_ / f_1330_);
					float f_1381_ = aFloat9765 + (aFloat9753 * (float) i_1323_ + aFloat9757 * (float) i_1365_ + aFloat9741 * (float) i_1325_);
					f_1341_ = (class118.aFloat1442 + class118.aFloat1469 * f_1381_ / f_1331_);
					float f_1382_ = aFloat9761 + (aFloat9771 * (float) i_1323_ + aFloat9748 * (float) i_1365_ + aFloat9762 * (float) i_1325_);
					f_1342_ = (class118.aFloat1473 + class118.aFloat1444 * f_1382_ / f_1331_);
					float f_1383_ = aFloat9765 + (aFloat9753 * (float) i_1322_ + aFloat9757 * (float) i_1366_ + aFloat9741 * (float) i_1325_);
					f_1343_ = (class118.aFloat1442 + class118.aFloat1469 * f_1383_ / f_1332_);
					float f_1384_ = aFloat9761 + (aFloat9771 * (float) i_1322_ + aFloat9748 * (float) i_1366_ + aFloat9762 * (float) i_1325_);
					f_1344_ = (class118.aFloat1473 + class118.aFloat1444 * f_1384_ / f_1332_);
				}
				Class177 class177 = null;
				boolean bool_1385_ = false;
				if (class106.aShort1297 != -1) {
					class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class106.aShort1297 & 0xffff, -1097717996));
					bool_1385_ = class177.aBool1881;
				}
				boolean bool_1386_ = class177 != null && method15364(class177.aByte1905);
				float f_1387_ = f_1326_ + f_1327_ + f_1328_;
				if (((f_1341_ - f_1343_) * (f_1340_ - f_1344_) - (f_1342_ - f_1344_) * (f_1339_ - f_1343_)) > 0.0F) {
					class118.aBool1455 = (f_1341_ < 0.0F || f_1343_ < 0.0F || f_1339_ < 0.0F || f_1341_ > (float) class118.anInt1448 || f_1343_ > (float) class118.anInt1448 || f_1339_ > (float) class118.anInt1448);
					if (f_1387_ < 3.0F) {
						if (f_1387_ > 0.0F) {
							if (bool_1385_) {
								int i_1388_ = -16777216;
								if (bool_1386_)
									i_1388_ = -1694498816;
								class118.method2053(true, true, false, f_1342_, f_1344_, f_1340_, f_1341_, f_1343_, f_1339_, f_1335_, f_1336_, f_1334_, f_1331_, f_1332_, f_1330_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1388_ | class106.anInt1289 & 0xffffff, i_1388_ | class106.anInt1291 & 0xffffff, i_1388_ | class106.anInt1287 & 0xffffff, class99.anInt1192 * 340278173, f_1327_ * 255.0F, f_1328_ * 255.0F, f_1326_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1386_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1342_, f_1344_, f_1340_, f_1341_, f_1343_, f_1339_, f_1335_, f_1336_, f_1334_, Class155.method2546(class106.anInt1289, (((int) (f_1327_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1712462843), Class155.method2546(class106.anInt1291, (((int) (f_1328_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -614102336), Class155.method2546(class106.anInt1287, (((int) (f_1326_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -760611591));
								class118.anInt1438 = 0;
							}
						} else if (bool_1385_) {
							int i_1389_ = -16777216;
							if (bool_1386_)
								i_1389_ = -1694498816;
							class118.method2053(true, true, false, f_1342_, f_1344_, f_1340_, f_1341_, f_1343_, f_1339_, f_1335_, f_1336_, f_1334_, f_1331_, f_1332_, f_1330_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_1389_ | class106.anInt1289 & 0xffffff, i_1389_ | class106.anInt1291 & 0xffffff, i_1389_ | class106.anInt1287 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1386_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1342_, f_1344_, f_1340_, f_1341_, f_1343_, f_1339_, f_1335_, f_1336_, f_1334_, class106.anInt1289, class106.anInt1291, class106.anInt1287);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1342_, f_1344_, f_1340_, f_1341_, f_1343_, f_1339_, f_1335_, f_1336_, f_1334_, class99.anInt1192 * 340278173);
				}
				f_1387_ = f + f_1326_ + f_1328_;
				if (((f_1337_ - f_1339_) * (f_1344_ - f_1340_) - (f_1338_ - f_1340_) * (f_1343_ - f_1339_)) > 0.0F) {
					class118.aBool1455 = (f_1337_ < 0.0F || f_1339_ < 0.0F || f_1343_ < 0.0F || f_1337_ > (float) class118.anInt1448 || f_1339_ > (float) class118.anInt1448 || f_1343_ > (float) class118.anInt1448);
					if (f_1387_ < 3.0F) {
						if (bool_1386_)
							class118.anInt1438 = -1694498816;
						if (f_1387_ > 0.0F) {
							if (bool_1385_) {
								int i_1390_ = -16777216;
								if (bool_1386_)
									i_1390_ = -1694498816;
								class118.method2053(true, true, false, f_1338_, f_1340_, f_1344_, f_1337_, f_1339_, f_1343_, f_1333_, f_1334_, f_1336_, f_1329_, f_1330_, f_1332_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1390_ | class106.anInt1288 & 0xffffff, i_1390_ | class106.anInt1287 & 0xffffff, i_1390_ | class106.anInt1291 & 0xffffff, class99.anInt1192 * 340278173, f * 255.0F, f_1326_ * 255.0F, f_1328_ * 255.0F, class106.aShort1297 & 0xffff);
							} else {
								if (bool_1386_)
									class118.anInt1438 = 100;
								class118.method2031(true, true, false, f_1338_, f_1340_, f_1344_, f_1337_, f_1339_, f_1343_, f_1333_, f_1334_, f_1336_, Class155.method2546(class106.anInt1288, (((int) (f * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1684352566), Class155.method2546(class106.anInt1287, (((int) (f_1326_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -1935729648), Class155.method2546(class106.anInt1291, (((int) (f_1328_ * 255.0F) << 24) | (class99.anInt1192 * 340278173)), -916264761));
								class118.anInt1438 = 0;
							}
						} else if (bool_1385_) {
							int i_1391_ = -16777216;
							if (bool_1386_)
								i_1391_ = -1694498816;
							class118.method2053(true, true, false, f_1338_, f_1340_, f_1344_, f_1337_, f_1339_, f_1343_, f_1333_, f_1334_, f_1336_, f_1329_, f_1330_, f_1332_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_1391_ | class106.anInt1288 & 0xffffff, i_1391_ | class106.anInt1287 & 0xffffff, i_1391_ | class106.anInt1291 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class106.aShort1297 & 0xffff);
						} else {
							if (bool_1386_)
								class118.anInt1438 = 100;
							class118.method2031(true, true, false, f_1338_, f_1340_, f_1344_, f_1337_, f_1339_, f_1343_, f_1333_, f_1334_, f_1336_, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							class118.anInt1438 = 0;
						}
					} else
						class118.method2037(true, true, false, f_1338_, f_1340_, f_1344_, f_1337_, f_1339_, f_1343_, f_1333_, f_1334_, f_1336_, class99.anInt1192 * 340278173);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9751[i][i_1316_];
			if (class94 != null) {
				if (i_1321_ != 0) {
					if ((class94.aByte1153 & 0x4) != 0) {
						if ((i_1321_ & 0x1) != 0)
							return;
					} else if ((i_1321_ & 0x2) != 0)
						return;
				}
				for (int i_1392_ = 0; i_1392_ < class94.aShort1152; i_1392_++) {
					int i_1393_ = (class94.aShortArray1154[i_1392_] + (i << anInt1680 * -1193058675));
					int i_1394_ = class94.aShortArray1151[i_1392_];
					int i_1395_ = (class94.aShortArray1156[i_1392_] + (i_1316_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1393_ + aFloat9773 * (float) i_1394_ + aFloat9750 * (float) i_1395_);
					float f_1396_ = aFloat9768 + (aFloat9756 * (float) i_1393_ + aFloat9754 * (float) i_1394_ + aFloat9764 * (float) i_1395_);
					if (f < -f_1396_)
						return;
					float f_1397_ = (class118.aFloat1458 + class118.aFloat1447 * f / f_1396_);
					fs_1320_[i_1392_] = 0.0F;
					if (bool) {
						float f_1398_ = f - class99.aFloat1205;
						if (f_1398_ > 0.0F) {
							f_1398_ /= class99.aFloat1191;
							if (f_1398_ > 1.0F)
								f_1398_ = 1.0F;
							fs_1320_[i_1392_] = f_1398_;
							int i_1399_ = (int) ((float) (class94.aShortArray1157[i_1392_]) * f_1398_);
							if (i_1399_ > 0)
								i_1394_ -= i_1399_;
						}
					} else if (class99.aBool1189) {
						float f_1400_ = f - class99.aFloat1205;
						if (f_1400_ > 0.0F) {
							fs_1320_[i_1392_] = f_1400_ / class99.aFloat1191;
							if (fs_1320_[i_1392_] > 1.0F)
								fs_1320_[i_1392_] = 1.0F;
						}
					}
					float f_1401_ = aFloat9765 + (aFloat9753 * (float) i_1393_ + aFloat9757 * (float) i_1394_ + aFloat9741 * (float) i_1395_);
					float f_1402_ = aFloat9761 + (aFloat9771 * (float) i_1393_ + aFloat9748 * (float) i_1394_ + aFloat9762 * (float) i_1395_);
					fs[i_1392_] = (class118.aFloat1442 + class118.aFloat1469 * f_1401_ / f_1396_);
					fs_1317_[i_1392_] = (class118.aFloat1473 + class118.aFloat1444 * f_1402_ / f_1396_);
					fs_1318_[i_1392_] = f_1397_;
					fs_1319_[i_1392_] = f_1396_;
				}
				if (class94.aShortArray1155 != null) {
					for (int i_1403_ = 0; i_1403_ < class94.aShort1161; i_1403_++) {
						int i_1404_ = i_1403_ * 3;
						int i_1405_ = i_1404_ + 1;
						int i_1406_ = i_1405_ + 1;
						float f = fs[i_1404_];
						float f_1407_ = fs[i_1405_];
						float f_1408_ = fs[i_1406_];
						float f_1409_ = fs_1317_[i_1404_];
						float f_1410_ = fs_1317_[i_1405_];
						float f_1411_ = fs_1317_[i_1406_];
						float f_1412_ = (fs_1320_[i_1404_] + fs_1320_[i_1405_] + fs_1320_[i_1406_]);
						if (((f - f_1407_) * (f_1411_ - f_1410_) - (f_1409_ - f_1410_) * (f_1408_ - f_1407_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1407_ < 0.0F || f_1408_ < 0.0F || f > (float) class118.anInt1448 || f_1407_ > (float) class118.anInt1448 || f_1408_ > (float) class118.anInt1448);
							Class177 class177 = null;
							boolean bool_1413_ = false;
							if (class94.aShortArray1155[i_1403_] != -1) {
								class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class94.aShortArray1155[i_1403_] & 0xffff), 370543990));
								bool_1413_ = class177.aBool1881;
							}
							if (f_1412_ < 3.0F) {
								if (f_1412_ > 0.0F) {
									if (bool_1413_) {
										int i_1414_ = -16777216;
										if (method15364(class177.aByte1905))
											i_1414_ = -1694498816;
										class118.method2053(true, true, false, f_1409_, f_1410_, f_1411_, f, f_1407_, f_1408_, fs_1318_[i_1404_], fs_1318_[i_1405_], fs_1318_[i_1406_], fs_1319_[i_1404_], fs_1319_[i_1405_], fs_1319_[i_1406_], ((float) (class94.aShortArray1154[i_1404_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1405_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1406_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1404_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1405_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1406_]) / (float) (anInt1682 * 341909049)), i_1414_ | (class94.anIntArray1158[i_1404_]) & 0xffffff, i_1414_ | (class94.anIntArray1158[i_1405_]) & 0xffffff, i_1414_ | (class94.anIntArray1158[i_1406_]) & 0xffffff, class99.anInt1192 * 340278173, fs_1320_[i_1404_] * 255.0F, fs_1320_[i_1405_] * 255.0F, fs_1320_[i_1406_] * 255.0F, (class94.aShortArray1155[i_1403_] & 0xffff));
									} else if ((class94.anIntArray1158[i_1404_] & 0xffffff) != 0) {
										class118.method2031(true, true, false, f_1409_, f_1410_, f_1411_, f, f_1407_, f_1408_, fs_1318_[i_1404_], fs_1318_[i_1405_], fs_1318_[i_1406_], (Class155.method2546(class94.anIntArray1158[i_1404_], ((int) (fs_1320_[i_1404_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -1896438860)), (Class155.method2546(class94.anIntArray1158[i_1405_], ((int) (fs_1320_[i_1405_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -612014900)), (Class155.method2546(class94.anIntArray1158[i_1406_], ((int) (fs_1320_[i_1406_] * 255.0F) << 24 | (class99.anInt1192 * 340278173)), -648290016)));
										class118.anInt1438 = 0;
									}
								} else if (bool_1413_) {
									int i_1415_ = -16777216;
									if (method15364(class177.aByte1905))
										i_1415_ = -1694498816;
									class118.method2053(true, true, false, f_1409_, f_1410_, f_1411_, f, f_1407_, f_1408_, fs_1318_[i_1404_], fs_1318_[i_1405_], fs_1318_[i_1406_], fs_1319_[i_1404_], fs_1319_[i_1405_], fs_1319_[i_1406_], ((float) (class94.aShortArray1154[i_1404_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1405_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1154[i_1406_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1404_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1405_]) / (float) (anInt1682 * 341909049)), ((float) (class94.aShortArray1156[i_1406_]) / (float) (anInt1682 * 341909049)), i_1415_ | (class94.anIntArray1158[i_1404_]) & 0xffffff, i_1415_ | (class94.anIntArray1158[i_1405_]) & 0xffffff, i_1415_ | (class94.anIntArray1158[i_1406_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, (class94.aShortArray1155[i_1403_] & 0xffff));
								} else if ((class94.anIntArray1158[i_1404_] & 0xffffff) != 0) {
									class118.method2031(true, true, false, f_1409_, f_1410_, f_1411_, f, f_1407_, f_1408_, fs_1318_[i_1404_], fs_1318_[i_1405_], fs_1318_[i_1406_], class94.anIntArray1158[i_1404_], class94.anIntArray1158[i_1405_], class94.anIntArray1158[i_1406_]);
									class118.anInt1438 = 0;
								}
							} else
								class118.method2037(true, true, false, f_1409_, f_1410_, f_1411_, f, f_1407_, f_1408_, fs_1318_[i_1404_], fs_1318_[i_1405_], fs_1318_[i_1406_], (class99.anInt1192 * 340278173));
						}
					}
				} else {
					for (int i_1416_ = 0; i_1416_ < class94.aShort1161; i_1416_++) {
						int i_1417_ = i_1416_ * 3;
						int i_1418_ = i_1417_ + 1;
						int i_1419_ = i_1418_ + 1;
						float f = fs[i_1417_];
						float f_1420_ = fs[i_1418_];
						float f_1421_ = fs[i_1419_];
						float f_1422_ = fs_1317_[i_1417_];
						float f_1423_ = fs_1317_[i_1418_];
						float f_1424_ = fs_1317_[i_1419_];
						float f_1425_ = (fs_1320_[i_1417_] + fs_1320_[i_1418_] + fs_1320_[i_1419_]);
						if (((f - f_1420_) * (f_1424_ - f_1423_) - (f_1422_ - f_1423_) * (f_1421_ - f_1420_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1420_ < 0.0F || f_1421_ < 0.0F || f > (float) class118.anInt1448 || f_1420_ > (float) class118.anInt1448 || f_1421_ > (float) class118.anInt1448);
							if (f_1425_ < 3.0F) {
								if (f_1425_ > 0.0F) {
									if ((class94.anIntArray1158[i_1417_] & 0xffffff) != 0)
										class118.method2031(true, true, false, f_1422_, f_1423_, f_1424_, f, f_1420_, f_1421_, fs_1318_[i_1417_], fs_1318_[i_1418_], fs_1318_[i_1419_], (Class234.method4271(class94.anIntArray1158[i_1417_], class99.anInt1192 * 340278173, fs_1320_[i_1417_] * 255.0F, -1029476374)), (Class234.method4271(class94.anIntArray1158[i_1418_], class99.anInt1192 * 340278173, fs_1320_[i_1418_] * 255.0F, -2128525835)), (Class234.method4271(class94.anIntArray1158[i_1419_], class99.anInt1192 * 340278173, fs_1320_[i_1419_] * 255.0F, 392006298)));
								} else if ((class94.anIntArray1158[i_1417_] & 0xffffff) != 0)
									class118.method2031(true, true, false, f_1422_, f_1423_, f_1424_, f, f_1420_, f_1421_, fs_1318_[i_1417_], fs_1318_[i_1418_], fs_1318_[i_1419_], class94.anIntArray1158[i_1417_], class94.anIntArray1158[i_1418_], class94.anIntArray1158[i_1419_]);
							} else
								class118.method2037(true, true, false, f_1422_, f_1423_, f_1424_, f, f_1420_, f_1421_, fs_1318_[i_1417_], fs_1318_[i_1418_], fs_1318_[i_1419_], (class99.anInt1192 * 340278173));
						}
					}
				}
			}
		}
	}

	public void method2359() {
		aByteArrayArray9769 = null;
		aByteArrayArray9770 = null;
	}

	void method15371(int i, int i_1426_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_1427_, float[] fs_1428_, float[] fs_1429_, float[] fs_1430_, int i_1431_) {
		Class124 class124 = aClass124ArrayArray9752[i][i_1426_];
		if (i_1431_ == 0 || (i_1431_ & 0x2) == 0) {
			if (class124 != null) {
				for (int i_1432_ = 0; i_1432_ < class124.aShort1516; i_1432_++) {
					int i_1433_ = (class124.aShortArray1517[i_1432_] + (i << anInt1680 * -1193058675));
					int i_1434_ = class124.aShortArray1518[i_1432_];
					int i_1435_ = (class124.aShortArray1522[i_1432_] + (i_1426_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1433_ + aFloat9773 * (float) i_1434_ + aFloat9750 * (float) i_1435_);
					float f_1436_ = aFloat9768 + (aFloat9756 * (float) i_1433_ + aFloat9754 * (float) i_1434_ + aFloat9764 * (float) i_1435_);
					if (f < -f_1436_)
						return;
					fs_1430_[i_1432_] = 0.0F;
					if (bool) {
						float f_1437_ = f - class99.aFloat1205;
						if (f_1437_ > 0.0F) {
							f_1437_ /= class99.aFloat1191;
							if (f_1437_ > 1.0F)
								f_1437_ = 1.0F;
							fs_1430_[i_1432_] = f_1437_;
							int i_1438_ = (int) ((float) (class124.aShortArray1523[i_1432_]) * f_1437_);
							if (i_1438_ > 0)
								i_1434_ -= i_1438_;
						}
					} else if (class99.aBool1189) {
						float f_1439_ = f - class99.aFloat1205;
						if (f_1439_ > 0.0F) {
							fs_1430_[i_1432_] = f_1439_ / class99.aFloat1191;
							if (fs_1430_[i_1432_] > 1.0F)
								fs_1430_[i_1432_] = 1.0F;
						}
					}
					float f_1440_ = aFloat9765 + (aFloat9753 * (float) i_1433_ + aFloat9757 * (float) i_1434_ + aFloat9741 * (float) i_1435_);
					float f_1441_ = aFloat9761 + (aFloat9771 * (float) i_1433_ + aFloat9748 * (float) i_1434_ + aFloat9762 * (float) i_1435_);
					fs[i_1432_] = (class118.aFloat1442 + class118.aFloat1469 * f_1440_ / f_1436_);
					fs_1427_[i_1432_] = (class118.aFloat1473 + class118.aFloat1444 * f_1441_ / f_1436_);
					fs_1428_[i_1432_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_1436_);
					fs_1429_[i_1432_] = f_1436_;
				}
				float f = (float) (anInt1682 * 341909049);
				for (int i_1442_ = 0; i_1442_ < class124.aShort1525; i_1442_++) {
					int i_1443_ = i_1442_ * 3;
					int i_1444_ = i_1443_ + 1;
					int i_1445_ = i_1444_ + 1;
					float f_1446_ = fs[i_1443_];
					float f_1447_ = fs[i_1444_];
					float f_1448_ = fs[i_1445_];
					float f_1449_ = fs_1427_[i_1443_];
					float f_1450_ = fs_1427_[i_1444_];
					float f_1451_ = fs_1427_[i_1445_];
					if (((f_1446_ - f_1447_) * (f_1451_ - f_1450_) - (f_1449_ - f_1450_) * (f_1448_ - f_1447_)) > 0.0F) {
						class118.aBool1455 = (f_1446_ < 0.0F || f_1447_ < 0.0F || f_1448_ < 0.0F || f_1446_ > (float) class118.anInt1448 || f_1447_ > (float) class118.anInt1448 || f_1448_ > (float) class118.anInt1448);
						if ((fs_1430_[i_1443_] + fs_1430_[i_1444_] + fs_1430_[i_1445_]) < 3.0F) {
							int i_1452_ = i << anInt1680 * -1193058675;
							int i_1453_ = i_1426_ << anInt1680 * -1193058675;
							if ((class124.anIntArray1519[i_1443_] & 0xffffff) != 0) {
								if (class124.aShortArray1520[i_1443_] != -1 && class124.aShortArray1520[i_1444_] != -1 && (class124.aShortArray1520[i_1445_] != -1)) {
									if ((class124.aShortArray1520[i_1443_] == class124.aShortArray1520[i_1444_]) && (class124.aShortArray1520[i_1443_] == (class124.aShortArray1520[i_1445_])) && (class124.aShortArray1515[i_1443_] == (class124.aShortArray1515[i_1444_])) && (class124.aShortArray1515[i_1443_] == (class124.aShortArray1515[i_1445_])))
										class118.method2053(true, true, false, f_1449_, f_1450_, f_1451_, f_1446_, f_1447_, f_1448_, fs_1428_[i_1443_], fs_1428_[i_1444_], fs_1428_[i_1445_], fs_1429_[i_1443_], fs_1429_[i_1444_], fs_1429_[i_1445_], ((float) (i_1452_ + (class124.aShortArray1517[i_1443_])) / (float) (class124.aShortArray1515[i_1443_])), ((float) (i_1452_ + (class124.aShortArray1517[i_1444_])) / (float) (class124.aShortArray1515[i_1444_])), ((float) (i_1452_ + (class124.aShortArray1517[i_1445_])) / (float) (class124.aShortArray1515[i_1445_])), ((float) (i_1453_ + (class124.aShortArray1522[i_1443_])) / (float) (class124.aShortArray1515[i_1443_])), ((float) (i_1453_ + (class124.aShortArray1522[i_1444_])) / (float) (class124.aShortArray1515[i_1444_])), ((float) (i_1453_ + (class124.aShortArray1522[i_1445_])) / (float) (class124.aShortArray1515[i_1445_])), class124.anIntArray1519[i_1443_], class124.anIntArray1519[i_1444_], class124.anIntArray1519[i_1445_], class99.anInt1192 * 340278173, fs_1430_[i_1443_] * 255.0F, fs_1430_[i_1444_] * 255.0F, fs_1430_[i_1445_] * 255.0F, (class124.aShortArray1520[i_1443_] & 0xffff));
									else
										class118.method2041(true, true, false, f_1449_, f_1450_, f_1451_, f_1446_, f_1447_, f_1448_, fs_1428_[i_1443_], fs_1428_[i_1444_], fs_1428_[i_1445_], fs_1429_[i_1443_], fs_1429_[i_1444_], fs_1429_[i_1445_], (float) (i_1452_ + (class124.aShortArray1517[i_1443_])) / f, (float) (i_1452_ + (class124.aShortArray1517[i_1444_])) / f, (float) (i_1452_ + (class124.aShortArray1517[i_1445_])) / f, (float) (i_1453_ + (class124.aShortArray1522[i_1443_])) / f, (float) (i_1453_ + (class124.aShortArray1522[i_1444_])) / f, (float) (i_1453_ + (class124.aShortArray1522[i_1445_])) / f, class124.anIntArray1519[i_1443_], class124.anIntArray1519[i_1444_], class124.anIntArray1519[i_1445_], class99.anInt1192 * 340278173, fs_1430_[i_1443_] * 255.0F, fs_1430_[i_1444_] * 255.0F, fs_1430_[i_1445_] * 255.0F, (class124.aShortArray1520[i_1443_] & 0xffff), f / (float) (class124.aShortArray1515[i_1443_]), (class124.aShortArray1520[i_1444_] & 0xffff), f / (float) (class124.aShortArray1515[i_1444_]), (class124.aShortArray1520[i_1445_] & 0xffff), f / (float) (class124.aShortArray1515[i_1445_]));
								} else if ((fs_1430_[i_1443_] + fs_1430_[i_1444_] + fs_1430_[i_1445_]) > 0.0F)
									class118.method2031(true, true, false, f_1449_, f_1450_, f_1451_, f_1446_, f_1447_, f_1448_, fs_1428_[i_1443_], fs_1428_[i_1444_], fs_1428_[i_1445_], (Class234.method4271(class124.anIntArray1519[i_1443_], class99.anInt1192 * 340278173, fs_1430_[i_1443_] * 255.0F, -1456496946)), (Class234.method4271(class124.anIntArray1519[i_1444_], class99.anInt1192 * 340278173, fs_1430_[i_1444_] * 255.0F, -439963656)), (Class234.method4271(class124.anIntArray1519[i_1445_], class99.anInt1192 * 340278173, fs_1430_[i_1445_] * 255.0F, -1158534295)));
								else
									class118.method2031(true, true, false, f_1449_, f_1450_, f_1451_, f_1446_, f_1447_, f_1448_, fs_1428_[i_1443_], fs_1428_[i_1444_], fs_1428_[i_1445_], class124.anIntArray1519[i_1443_], class124.anIntArray1519[i_1444_], class124.anIntArray1519[i_1445_]);
							}
						} else
							class118.method2037(true, true, false, f_1449_, f_1450_, f_1451_, f_1446_, f_1447_, f_1448_, fs_1428_[i_1443_], fs_1428_[i_1444_], fs_1428_[i_1445_], class99.anInt1192 * 340278173);
					}
				}
			}
		}
	}

	void method15372(int i, int i_1454_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_1455_, float[] fs_1456_, float[] fs_1457_, float[] fs_1458_, int i_1459_) {
		Class124 class124 = aClass124ArrayArray9752[i][i_1454_];
		if (i_1459_ == 0 || (i_1459_ & 0x2) == 0) {
			if (class124 != null) {
				for (int i_1460_ = 0; i_1460_ < class124.aShort1516; i_1460_++) {
					int i_1461_ = (class124.aShortArray1517[i_1460_] + (i << anInt1680 * -1193058675));
					int i_1462_ = class124.aShortArray1518[i_1460_];
					int i_1463_ = (class124.aShortArray1522[i_1460_] + (i_1454_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1461_ + aFloat9773 * (float) i_1462_ + aFloat9750 * (float) i_1463_);
					float f_1464_ = aFloat9768 + (aFloat9756 * (float) i_1461_ + aFloat9754 * (float) i_1462_ + aFloat9764 * (float) i_1463_);
					if (f < -f_1464_)
						return;
					fs_1458_[i_1460_] = 0.0F;
					if (bool) {
						float f_1465_ = f - class99.aFloat1205;
						if (f_1465_ > 0.0F) {
							f_1465_ /= class99.aFloat1191;
							if (f_1465_ > 1.0F)
								f_1465_ = 1.0F;
							fs_1458_[i_1460_] = f_1465_;
							int i_1466_ = (int) ((float) (class124.aShortArray1523[i_1460_]) * f_1465_);
							if (i_1466_ > 0)
								i_1462_ -= i_1466_;
						}
					} else if (class99.aBool1189) {
						float f_1467_ = f - class99.aFloat1205;
						if (f_1467_ > 0.0F) {
							fs_1458_[i_1460_] = f_1467_ / class99.aFloat1191;
							if (fs_1458_[i_1460_] > 1.0F)
								fs_1458_[i_1460_] = 1.0F;
						}
					}
					float f_1468_ = aFloat9765 + (aFloat9753 * (float) i_1461_ + aFloat9757 * (float) i_1462_ + aFloat9741 * (float) i_1463_);
					float f_1469_ = aFloat9761 + (aFloat9771 * (float) i_1461_ + aFloat9748 * (float) i_1462_ + aFloat9762 * (float) i_1463_);
					fs[i_1460_] = (class118.aFloat1442 + class118.aFloat1469 * f_1468_ / f_1464_);
					fs_1455_[i_1460_] = (class118.aFloat1473 + class118.aFloat1444 * f_1469_ / f_1464_);
					fs_1456_[i_1460_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_1464_);
					fs_1457_[i_1460_] = f_1464_;
				}
				float f = (float) (anInt1682 * 341909049);
				for (int i_1470_ = 0; i_1470_ < class124.aShort1525; i_1470_++) {
					int i_1471_ = i_1470_ * 3;
					int i_1472_ = i_1471_ + 1;
					int i_1473_ = i_1472_ + 1;
					float f_1474_ = fs[i_1471_];
					float f_1475_ = fs[i_1472_];
					float f_1476_ = fs[i_1473_];
					float f_1477_ = fs_1455_[i_1471_];
					float f_1478_ = fs_1455_[i_1472_];
					float f_1479_ = fs_1455_[i_1473_];
					if (((f_1474_ - f_1475_) * (f_1479_ - f_1478_) - (f_1477_ - f_1478_) * (f_1476_ - f_1475_)) > 0.0F) {
						class118.aBool1455 = (f_1474_ < 0.0F || f_1475_ < 0.0F || f_1476_ < 0.0F || f_1474_ > (float) class118.anInt1448 || f_1475_ > (float) class118.anInt1448 || f_1476_ > (float) class118.anInt1448);
						if ((fs_1458_[i_1471_] + fs_1458_[i_1472_] + fs_1458_[i_1473_]) < 3.0F) {
							int i_1480_ = i << anInt1680 * -1193058675;
							int i_1481_ = i_1454_ << anInt1680 * -1193058675;
							if ((class124.anIntArray1519[i_1471_] & 0xffffff) != 0) {
								if (class124.aShortArray1520[i_1471_] != -1 && class124.aShortArray1520[i_1472_] != -1 && (class124.aShortArray1520[i_1473_] != -1)) {
									if ((class124.aShortArray1520[i_1471_] == class124.aShortArray1520[i_1472_]) && (class124.aShortArray1520[i_1471_] == (class124.aShortArray1520[i_1473_])) && (class124.aShortArray1515[i_1471_] == (class124.aShortArray1515[i_1472_])) && (class124.aShortArray1515[i_1471_] == (class124.aShortArray1515[i_1473_])))
										class118.method2053(true, true, false, f_1477_, f_1478_, f_1479_, f_1474_, f_1475_, f_1476_, fs_1456_[i_1471_], fs_1456_[i_1472_], fs_1456_[i_1473_], fs_1457_[i_1471_], fs_1457_[i_1472_], fs_1457_[i_1473_], ((float) (i_1480_ + (class124.aShortArray1517[i_1471_])) / (float) (class124.aShortArray1515[i_1471_])), ((float) (i_1480_ + (class124.aShortArray1517[i_1472_])) / (float) (class124.aShortArray1515[i_1472_])), ((float) (i_1480_ + (class124.aShortArray1517[i_1473_])) / (float) (class124.aShortArray1515[i_1473_])), ((float) (i_1481_ + (class124.aShortArray1522[i_1471_])) / (float) (class124.aShortArray1515[i_1471_])), ((float) (i_1481_ + (class124.aShortArray1522[i_1472_])) / (float) (class124.aShortArray1515[i_1472_])), ((float) (i_1481_ + (class124.aShortArray1522[i_1473_])) / (float) (class124.aShortArray1515[i_1473_])), class124.anIntArray1519[i_1471_], class124.anIntArray1519[i_1472_], class124.anIntArray1519[i_1473_], class99.anInt1192 * 340278173, fs_1458_[i_1471_] * 255.0F, fs_1458_[i_1472_] * 255.0F, fs_1458_[i_1473_] * 255.0F, (class124.aShortArray1520[i_1471_] & 0xffff));
									else
										class118.method2041(true, true, false, f_1477_, f_1478_, f_1479_, f_1474_, f_1475_, f_1476_, fs_1456_[i_1471_], fs_1456_[i_1472_], fs_1456_[i_1473_], fs_1457_[i_1471_], fs_1457_[i_1472_], fs_1457_[i_1473_], (float) (i_1480_ + (class124.aShortArray1517[i_1471_])) / f, (float) (i_1480_ + (class124.aShortArray1517[i_1472_])) / f, (float) (i_1480_ + (class124.aShortArray1517[i_1473_])) / f, (float) (i_1481_ + (class124.aShortArray1522[i_1471_])) / f, (float) (i_1481_ + (class124.aShortArray1522[i_1472_])) / f, (float) (i_1481_ + (class124.aShortArray1522[i_1473_])) / f, class124.anIntArray1519[i_1471_], class124.anIntArray1519[i_1472_], class124.anIntArray1519[i_1473_], class99.anInt1192 * 340278173, fs_1458_[i_1471_] * 255.0F, fs_1458_[i_1472_] * 255.0F, fs_1458_[i_1473_] * 255.0F, (class124.aShortArray1520[i_1471_] & 0xffff), f / (float) (class124.aShortArray1515[i_1471_]), (class124.aShortArray1520[i_1472_] & 0xffff), f / (float) (class124.aShortArray1515[i_1472_]), (class124.aShortArray1520[i_1473_] & 0xffff), f / (float) (class124.aShortArray1515[i_1473_]));
								} else if ((fs_1458_[i_1471_] + fs_1458_[i_1472_] + fs_1458_[i_1473_]) > 0.0F)
									class118.method2031(true, true, false, f_1477_, f_1478_, f_1479_, f_1474_, f_1475_, f_1476_, fs_1456_[i_1471_], fs_1456_[i_1472_], fs_1456_[i_1473_], (Class234.method4271(class124.anIntArray1519[i_1471_], class99.anInt1192 * 340278173, fs_1458_[i_1471_] * 255.0F, 270760258)), (Class234.method4271(class124.anIntArray1519[i_1472_], class99.anInt1192 * 340278173, fs_1458_[i_1472_] * 255.0F, -582466215)), (Class234.method4271(class124.anIntArray1519[i_1473_], class99.anInt1192 * 340278173, fs_1458_[i_1473_] * 255.0F, 159191499)));
								else
									class118.method2031(true, true, false, f_1477_, f_1478_, f_1479_, f_1474_, f_1475_, f_1476_, fs_1456_[i_1471_], fs_1456_[i_1472_], fs_1456_[i_1473_], class124.anIntArray1519[i_1471_], class124.anIntArray1519[i_1472_], class124.anIntArray1519[i_1473_]);
							}
						} else
							class118.method2037(true, true, false, f_1477_, f_1478_, f_1479_, f_1474_, f_1475_, f_1476_, fs_1456_[i_1471_], fs_1456_[i_1472_], fs_1456_[i_1473_], class99.anInt1192 * 340278173);
					}
				}
			}
		}
	}

	boolean method15373(int i) {
		if ((anInt9759 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	boolean method15374(int i) {
		if ((anInt9759 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	void method15375(int i, int i_1482_, boolean bool, Class99 class99, Class118 class118, float[] fs, float[] fs_1483_, float[] fs_1484_, float[] fs_1485_, float[] fs_1486_, int i_1487_) {
		Class124 class124 = aClass124ArrayArray9752[i][i_1482_];
		if (i_1487_ == 0 || (i_1487_ & 0x2) == 0) {
			if (class124 != null) {
				for (int i_1488_ = 0; i_1488_ < class124.aShort1516; i_1488_++) {
					int i_1489_ = (class124.aShortArray1517[i_1488_] + (i << anInt1680 * -1193058675));
					int i_1490_ = class124.aShortArray1518[i_1488_];
					int i_1491_ = (class124.aShortArray1522[i_1488_] + (i_1482_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1489_ + aFloat9773 * (float) i_1490_ + aFloat9750 * (float) i_1491_);
					float f_1492_ = aFloat9768 + (aFloat9756 * (float) i_1489_ + aFloat9754 * (float) i_1490_ + aFloat9764 * (float) i_1491_);
					if (f < -f_1492_)
						return;
					fs_1486_[i_1488_] = 0.0F;
					if (bool) {
						float f_1493_ = f - class99.aFloat1205;
						if (f_1493_ > 0.0F) {
							f_1493_ /= class99.aFloat1191;
							if (f_1493_ > 1.0F)
								f_1493_ = 1.0F;
							fs_1486_[i_1488_] = f_1493_;
							int i_1494_ = (int) ((float) (class124.aShortArray1523[i_1488_]) * f_1493_);
							if (i_1494_ > 0)
								i_1490_ -= i_1494_;
						}
					} else if (class99.aBool1189) {
						float f_1495_ = f - class99.aFloat1205;
						if (f_1495_ > 0.0F) {
							fs_1486_[i_1488_] = f_1495_ / class99.aFloat1191;
							if (fs_1486_[i_1488_] > 1.0F)
								fs_1486_[i_1488_] = 1.0F;
						}
					}
					float f_1496_ = aFloat9765 + (aFloat9753 * (float) i_1489_ + aFloat9757 * (float) i_1490_ + aFloat9741 * (float) i_1491_);
					float f_1497_ = aFloat9761 + (aFloat9771 * (float) i_1489_ + aFloat9748 * (float) i_1490_ + aFloat9762 * (float) i_1491_);
					fs[i_1488_] = (class118.aFloat1442 + class118.aFloat1469 * f_1496_ / f_1492_);
					fs_1483_[i_1488_] = (class118.aFloat1473 + class118.aFloat1444 * f_1497_ / f_1492_);
					fs_1484_[i_1488_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_1492_);
					fs_1485_[i_1488_] = f_1492_;
				}
				float f = (float) (anInt1682 * 341909049);
				for (int i_1498_ = 0; i_1498_ < class124.aShort1525; i_1498_++) {
					int i_1499_ = i_1498_ * 3;
					int i_1500_ = i_1499_ + 1;
					int i_1501_ = i_1500_ + 1;
					float f_1502_ = fs[i_1499_];
					float f_1503_ = fs[i_1500_];
					float f_1504_ = fs[i_1501_];
					float f_1505_ = fs_1483_[i_1499_];
					float f_1506_ = fs_1483_[i_1500_];
					float f_1507_ = fs_1483_[i_1501_];
					if (((f_1502_ - f_1503_) * (f_1507_ - f_1506_) - (f_1505_ - f_1506_) * (f_1504_ - f_1503_)) > 0.0F) {
						class118.aBool1455 = (f_1502_ < 0.0F || f_1503_ < 0.0F || f_1504_ < 0.0F || f_1502_ > (float) class118.anInt1448 || f_1503_ > (float) class118.anInt1448 || f_1504_ > (float) class118.anInt1448);
						if ((fs_1486_[i_1499_] + fs_1486_[i_1500_] + fs_1486_[i_1501_]) < 3.0F) {
							int i_1508_ = i << anInt1680 * -1193058675;
							int i_1509_ = i_1482_ << anInt1680 * -1193058675;
							if ((class124.anIntArray1519[i_1499_] & 0xffffff) != 0) {
								if (class124.aShortArray1520[i_1499_] != -1 && class124.aShortArray1520[i_1500_] != -1 && (class124.aShortArray1520[i_1501_] != -1)) {
									if ((class124.aShortArray1520[i_1499_] == class124.aShortArray1520[i_1500_]) && (class124.aShortArray1520[i_1499_] == (class124.aShortArray1520[i_1501_])) && (class124.aShortArray1515[i_1499_] == (class124.aShortArray1515[i_1500_])) && (class124.aShortArray1515[i_1499_] == (class124.aShortArray1515[i_1501_])))
										class118.method2053(true, true, false, f_1505_, f_1506_, f_1507_, f_1502_, f_1503_, f_1504_, fs_1484_[i_1499_], fs_1484_[i_1500_], fs_1484_[i_1501_], fs_1485_[i_1499_], fs_1485_[i_1500_], fs_1485_[i_1501_], ((float) (i_1508_ + (class124.aShortArray1517[i_1499_])) / (float) (class124.aShortArray1515[i_1499_])), ((float) (i_1508_ + (class124.aShortArray1517[i_1500_])) / (float) (class124.aShortArray1515[i_1500_])), ((float) (i_1508_ + (class124.aShortArray1517[i_1501_])) / (float) (class124.aShortArray1515[i_1501_])), ((float) (i_1509_ + (class124.aShortArray1522[i_1499_])) / (float) (class124.aShortArray1515[i_1499_])), ((float) (i_1509_ + (class124.aShortArray1522[i_1500_])) / (float) (class124.aShortArray1515[i_1500_])), ((float) (i_1509_ + (class124.aShortArray1522[i_1501_])) / (float) (class124.aShortArray1515[i_1501_])), class124.anIntArray1519[i_1499_], class124.anIntArray1519[i_1500_], class124.anIntArray1519[i_1501_], class99.anInt1192 * 340278173, fs_1486_[i_1499_] * 255.0F, fs_1486_[i_1500_] * 255.0F, fs_1486_[i_1501_] * 255.0F, (class124.aShortArray1520[i_1499_] & 0xffff));
									else
										class118.method2041(true, true, false, f_1505_, f_1506_, f_1507_, f_1502_, f_1503_, f_1504_, fs_1484_[i_1499_], fs_1484_[i_1500_], fs_1484_[i_1501_], fs_1485_[i_1499_], fs_1485_[i_1500_], fs_1485_[i_1501_], (float) (i_1508_ + (class124.aShortArray1517[i_1499_])) / f, (float) (i_1508_ + (class124.aShortArray1517[i_1500_])) / f, (float) (i_1508_ + (class124.aShortArray1517[i_1501_])) / f, (float) (i_1509_ + (class124.aShortArray1522[i_1499_])) / f, (float) (i_1509_ + (class124.aShortArray1522[i_1500_])) / f, (float) (i_1509_ + (class124.aShortArray1522[i_1501_])) / f, class124.anIntArray1519[i_1499_], class124.anIntArray1519[i_1500_], class124.anIntArray1519[i_1501_], class99.anInt1192 * 340278173, fs_1486_[i_1499_] * 255.0F, fs_1486_[i_1500_] * 255.0F, fs_1486_[i_1501_] * 255.0F, (class124.aShortArray1520[i_1499_] & 0xffff), f / (float) (class124.aShortArray1515[i_1499_]), (class124.aShortArray1520[i_1500_] & 0xffff), f / (float) (class124.aShortArray1515[i_1500_]), (class124.aShortArray1520[i_1501_] & 0xffff), f / (float) (class124.aShortArray1515[i_1501_]));
								} else if ((fs_1486_[i_1499_] + fs_1486_[i_1500_] + fs_1486_[i_1501_]) > 0.0F)
									class118.method2031(true, true, false, f_1505_, f_1506_, f_1507_, f_1502_, f_1503_, f_1504_, fs_1484_[i_1499_], fs_1484_[i_1500_], fs_1484_[i_1501_], (Class234.method4271(class124.anIntArray1519[i_1499_], class99.anInt1192 * 340278173, fs_1486_[i_1499_] * 255.0F, -383424386)), (Class234.method4271(class124.anIntArray1519[i_1500_], class99.anInt1192 * 340278173, fs_1486_[i_1500_] * 255.0F, -918377377)), (Class234.method4271(class124.anIntArray1519[i_1501_], class99.anInt1192 * 340278173, fs_1486_[i_1501_] * 255.0F, -1933990924)));
								else
									class118.method2031(true, true, false, f_1505_, f_1506_, f_1507_, f_1502_, f_1503_, f_1504_, fs_1484_[i_1499_], fs_1484_[i_1500_], fs_1484_[i_1501_], class124.anIntArray1519[i_1499_], class124.anIntArray1519[i_1500_], class124.anIntArray1519[i_1501_]);
							}
						} else
							class118.method2037(true, true, false, f_1505_, f_1506_, f_1507_, f_1502_, f_1503_, f_1504_, fs_1484_[i_1499_], fs_1484_[i_1500_], fs_1484_[i_1501_], class99.anInt1192 * 340278173);
					}
				}
			}
		}
	}

	Class142_Sub3(Class178_Sub3 class178_sub3, int i, int i_1510_, int i_1511_, int i_1512_, int[][] is, int[][] is_1513_, int i_1514_) {
		super(i_1511_, i_1512_, i_1514_, is);
		aClass178_Sub3_9746 = class178_sub3;
		anInt9759 = i_1510_;
		aByteArrayArray9769 = new byte[i_1511_ + 1][i_1512_ + 1];
		int i_1515_ = aClass178_Sub3_9746.anInt9817 * 424272355 >> 9;
		for (int i_1516_ = 1; i_1516_ < i_1512_; i_1516_++) {
			for (int i_1517_ = 1; i_1517_ < i_1511_; i_1517_++) {
				int i_1518_ = i_1515_;
				int i_1519_ = (is_1513_[i_1517_ + 1][i_1516_] - is_1513_[i_1517_ - 1][i_1516_]);
				int i_1520_ = (is_1513_[i_1517_][i_1516_ + 1] - is_1513_[i_1517_][i_1516_ - 1]);
				int i_1521_ = (int) Math.sqrt((double) (i_1519_ * i_1519_ + 512 * i_1514_ + i_1520_ * i_1520_));
				int i_1522_ = (i_1519_ << 8) / i_1521_;
				int i_1523_ = -512 * i_1514_ / i_1521_;
				int i_1524_ = (i_1520_ << 8) / i_1521_;
				i_1518_ += (aClass178_Sub3_9746.anInt9839 * 1364344413 * i_1522_ + aClass178_Sub3_9746.anInt9813 * 126842783 * i_1523_ + (aClass178_Sub3_9746.anInt9834 * 1707081643 * i_1524_)) >> 17;
				i_1518_ >>= 1;
				if (i_1518_ < 2)
					i_1518_ = 2;
				else if (i_1518_ > 126)
					i_1518_ = 126;
				aByteArrayArray9769[i_1517_][i_1516_] = (byte) i_1518_;
			}
		}
		aByteArrayArray9770 = new byte[i_1511_ + 1][i_1512_ + 1];
	}

	public void method2331(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_1525_, int i_1526_, int i_1527_, boolean bool) {
		/* empty */
	}

	void method15376(int i, int i_1528_, int i_1529_, int i_1530_, int i_1531_, int i_1532_, int i_1533_, boolean[][] bools, Class99 class99, Class118 class118, float[] fs, float[] fs_1534_) {
		int i_1535_ = (i_1533_ - i_1531_) * i_1529_ / 256;
		int i_1536_ = i_1529_ >> 8;
		boolean bool = class99.aBool1186;
		aClass178_Sub3_9746.method3287(false);
		class118.aBool1465 = false;
		class118.aBool1437 = false;
		int i_1537_ = i;
		int i_1538_ = i_1528_ + i_1535_;
		for (int i_1539_ = i_1530_; i_1539_ < i_1532_; i_1539_++) {
			for (int i_1540_ = i_1531_; i_1540_ < i_1533_; i_1540_++) {
				if (bools[i_1539_ - i_1530_][i_1540_ - i_1531_]) {
					if (aClass106ArrayArray9758 != null) {
						if (aClass106ArrayArray9758[i_1539_][i_1540_] != null) {
							Class106 class106 = aClass106ArrayArray9758[i_1539_][i_1540_];
							if (class106.aShort1297 != -1 && (class106.aByte1292 & 0x2) == 0 && class106.anInt1296 == 0) {
								int i_1541_ = (aClass178_Sub3_9746.method15416(class106.aShort1297 & 0xffff));
								class118.method2033(true, true, false, (float) (i_1538_ - i_1536_), (float) (i_1538_ - i_1536_), (float) i_1538_, (float) (i_1537_ + i_1536_), (float) i_1537_, (float) (i_1537_ + i_1536_), 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_1541_, (class106.anInt1289), 1530418723), (float) Class174.method2935(i_1541_, (class106.anInt1291), 1530418723), (float) Class174.method2935(i_1541_, (class106.anInt1287), 1530418723));
								class118.method2033(true, true, false, (float) i_1538_, (float) i_1538_, (float) (i_1538_ - i_1536_), (float) i_1537_, (float) (i_1537_ + i_1536_), (float) i_1537_, 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_1541_, (class106.anInt1288), 1530418723), (float) Class174.method2935(i_1541_, (class106.anInt1287), 1530418723), (float) Class174.method2935(i_1541_, (class106.anInt1291), 1530418723));
							} else if (class106.anInt1296 == 0) {
								class118.method2031(true, true, false, (float) (i_1538_ - i_1536_), (float) (i_1538_ - i_1536_), (float) i_1538_, (float) (i_1537_ + i_1536_), (float) i_1537_, (float) (i_1537_ + i_1536_), 100.0F, 100.0F, 100.0F, class106.anInt1289, class106.anInt1291, class106.anInt1287);
								class118.method2031(true, true, false, (float) i_1538_, (float) i_1538_, (float) (i_1538_ - i_1536_), (float) i_1537_, (float) (i_1537_ + i_1536_), (float) i_1537_, 100.0F, 100.0F, 100.0F, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							} else {
								int i_1542_ = class106.anInt1296;
								class118.method2031(true, true, false, (float) (i_1538_ - i_1536_), (float) (i_1538_ - i_1536_), (float) i_1538_, (float) (i_1537_ + i_1536_), (float) i_1537_, (float) (i_1537_ + i_1536_), 100.0F, 100.0F, 100.0F, Class155.method2546(i_1542_, (class106.anInt1289 & ~0xffffff), -1169595231), Class155.method2546(i_1542_, (class106.anInt1291 & ~0xffffff), -1320639469), Class155.method2546(i_1542_, (class106.anInt1287 & ~0xffffff), -1882053088));
								class118.method2031(true, true, false, (float) i_1538_, (float) i_1538_, (float) (i_1538_ - i_1536_), (float) i_1537_, (float) (i_1537_ + i_1536_), (float) i_1537_, 100.0F, 100.0F, 100.0F, Class155.method2546(i_1542_, (class106.anInt1288 & ~0xffffff), -988347144), Class155.method2546(i_1542_, (class106.anInt1287 & ~0xffffff), -1269963521), Class155.method2546(i_1542_, (class106.anInt1291 & ~0xffffff), -249377590));
							}
						} else if (aClass94ArrayArray9751[i_1539_][i_1540_] != null) {
							Class94 class94 = aClass94ArrayArray9751[i_1539_][i_1540_];
							for (int i_1543_ = 0; i_1543_ < class94.aShort1152; i_1543_++) {
								fs[i_1543_] = (float) (i_1537_ + ((class94.aShortArray1154[i_1543_]) * i_1536_ / (anInt1682 * 341909049)));
								fs_1534_[i_1543_] = (float) (i_1538_ - ((class94.aShortArray1156[i_1543_]) * i_1536_ / (anInt1682 * 341909049)));
							}
							for (int i_1544_ = 0; i_1544_ < class94.aShort1161; i_1544_++) {
								int i_1545_ = i_1544_ * 3;
								int i_1546_ = i_1545_ + 1;
								int i_1547_ = i_1546_ + 1;
								float f = fs[i_1545_];
								float f_1548_ = fs[i_1546_];
								float f_1549_ = fs[i_1547_];
								float f_1550_ = fs_1534_[i_1545_];
								float f_1551_ = fs_1534_[i_1546_];
								float f_1552_ = fs_1534_[i_1547_];
								if (class94.anIntArray1160 != null && class94.anIntArray1160[i_1544_] != 0 && (class94.aShortArray1155 == null || (class94.aShortArray1155 != null && (class94.aShortArray1155[i_1544_]) == -1))) {
									int i_1553_ = class94.anIntArray1160[i_1544_];
									class118.method2031(true, true, false, f_1550_, f_1551_, f_1552_, f, f_1548_, f_1549_, 100.0F, 100.0F, 100.0F, (Class155.method2546(i_1553_, (-16777216 - (class94.anIntArray1158[i_1545_] & ~0xffffff)), -380082539)), (Class155.method2546(i_1553_, (-16777216 - (class94.anIntArray1158[i_1546_] & ~0xffffff)), -1932475099)), (Class155.method2546(i_1553_, (-16777216 - (class94.anIntArray1158[i_1547_] & ~0xffffff)), -758956598)));
								} else if (class94.aShortArray1155 != null && (class94.aShortArray1155[i_1544_] != -1)) {
									int i_1554_ = (aClass178_Sub3_9746.method15416(class94.aShortArray1155[i_1544_] & 0xffff));
									class118.method2033(true, true, false, f_1550_, f_1551_, f_1552_, f, f_1548_, f_1549_, 100.0F, 100.0F, 100.0F, (float) i_1554_, (float) i_1554_, (float) i_1554_);
								} else
									class118.method2031(true, true, false, f_1550_, f_1551_, f_1552_, f, f_1548_, f_1549_, 100.0F, 100.0F, 100.0F, class94.anIntArray1158[i_1545_], class94.anIntArray1158[i_1546_], class94.anIntArray1158[i_1547_]);
							}
						}
					} else if (aClass124ArrayArray9752[i_1539_][i_1540_] != null) {
						Class124 class124 = aClass124ArrayArray9752[i_1539_][i_1540_];
						for (int i_1555_ = 0; i_1555_ < class124.aShort1516; i_1555_++) {
							fs[i_1555_] = (float) (i_1537_ + (class124.aShortArray1517[i_1555_] * i_1536_ / (anInt1682 * 341909049)));
							fs_1534_[i_1555_] = (float) (i_1538_ - (class124.aShortArray1522[i_1555_] * i_1536_ / (anInt1682 * 341909049)));
						}
						for (int i_1556_ = 0; i_1556_ < class124.aShort1525; i_1556_++) {
							int i_1557_ = i_1556_ * 3;
							int i_1558_ = i_1557_ + 1;
							int i_1559_ = i_1558_ + 1;
							float f = fs[i_1557_];
							float f_1560_ = fs[i_1558_];
							float f_1561_ = fs[i_1559_];
							float f_1562_ = fs_1534_[i_1557_];
							float f_1563_ = fs_1534_[i_1558_];
							float f_1564_ = fs_1534_[i_1559_];
							if (class124.anIntArray1521 != null && class124.anIntArray1521[i_1556_] != 0) {
								int i_1565_ = class124.anIntArray1521[i_1556_];
								class118.method2031(true, true, false, f_1562_, f_1563_, f_1564_, f, f_1560_, f_1561_, 100.0F, 100.0F, 100.0F, i_1565_, i_1565_, i_1565_);
							} else
								class118.method2031(true, true, false, f_1562_, f_1563_, f_1564_, f, f_1560_, f_1561_, 100.0F, 100.0F, 100.0F, class124.anIntArray1519[i_1557_], class124.anIntArray1519[i_1558_], class124.anIntArray1519[i_1559_]);
						}
					}
				}
				i_1538_ -= i_1536_;
			}
			i_1538_ = i_1528_ + i_1535_;
			i_1537_ += i_1536_;
		}
		class118.aBool1465 = true;
		aClass178_Sub3_9746.method3287(bool);
	}

	void method15377(int i, int i_1566_, int i_1567_) {
		Class99 class99 = aClass178_Sub3_9746.method15475(Thread.currentThread());
		class99.aClass118_1200.anInt1438 = 0;
		if (aClass106ArrayArray9758 != null)
			method15354(i, i_1566_, class99.aBool1204, class99, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_1567_);
		else if (aClass129ArrayArray9747 != null)
			method15353(i, i_1566_, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_1567_);
		else if (aClass124ArrayArray9752 != null)
			method15355(i, i_1566_, class99.aBool1204, class99, class99.aClass118_1200, class99.aFloatArray1201, class99.aFloatArray1227, class99.aFloatArray1228, class99.aFloatArray1229, class99.aFloatArray1230, i_1567_);
	}

	public Class523_Sub27_Sub4 method2346(int i, int i_1568_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	public void method2338(int i, int i_1569_, int i_1570_, int i_1571_, int i_1572_, int i_1573_, int i_1574_, boolean[][] bools) {
		Class99 class99 = aClass178_Sub3_9746.method15475(Thread.currentThread());
		Class118 class118 = class99.aClass118_1200;
		class118.anInt1438 = 0;
		class118.aBool1455 = true;
		aClass178_Sub3_9746.method15420();
		if (aClass106ArrayArray9758 != null || aClass124ArrayArray9752 != null)
			method15359(i, i_1569_, i_1570_, i_1571_, i_1572_, i_1573_, i_1574_, bools, class99, class118, class99.aFloatArray1201, class99.aFloatArray1227);
		else if (aClass129ArrayArray9747 != null)
			method15358(i, i_1569_, i_1570_, i_1571_, i_1572_, i_1573_, i_1574_, bools, class99, class118, class99.aFloatArray1201, class99.aFloatArray1227);
	}

	public Class523_Sub27_Sub4 method2348(int i, int i_1575_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	public Class523_Sub27_Sub4 method2350(int i, int i_1576_, Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	public void method2324(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_1577_, int i_1578_, int i_1579_, boolean bool) {
		/* empty */
	}

	public void method2357(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_1580_, int i_1581_, int i_1582_, boolean bool) {
		/* empty */
	}

	void method15378(int i, int i_1583_, Class118 class118, float[] fs, float[] fs_1584_, float[] fs_1585_, float[] fs_1586_, float[] fs_1587_, int i_1588_) {
		Class129 class129 = aClass129ArrayArray9747[i][i_1583_];
		if (class129 != null) {
			if ((class129.aByte1550 & 0x2) == 0) {
				if (i_1588_ != 0) {
					if ((class129.aByte1550 & 0x4) != 0) {
						if ((i_1588_ & 0x1) != 0)
							return;
					} else if ((i_1588_ & 0x2) != 0)
						return;
				}
				int i_1589_ = i * (anInt1682 * 341909049);
				int i_1590_ = i_1589_ + anInt1682 * 341909049;
				int i_1591_ = i_1583_ * (anInt1682 * 341909049);
				int i_1592_ = i_1591_ + anInt1682 * 341909049;
				float f;
				float f_1593_;
				float f_1594_;
				float f_1595_;
				float f_1596_;
				float f_1597_;
				float f_1598_;
				float f_1599_;
				float f_1600_;
				float f_1601_;
				float f_1602_;
				float f_1603_;
				float f_1604_;
				float f_1605_;
				float f_1606_;
				float f_1607_;
				if ((class129.aByte1550 & 0x1) != 0) {
					int i_1608_ = anIntArrayArray1684[i][i_1583_];
					float f_1609_ = aFloat9773 * (float) i_1608_;
					float f_1610_ = aFloat9754 * (float) i_1608_;
					float f_1611_ = aFloat9767 + (aFloat9755 * (float) i_1589_ + f_1609_ + aFloat9750 * (float) i_1591_);
					f = aFloat9768 + (aFloat9756 * (float) i_1589_ + f_1610_ + aFloat9764 * (float) i_1591_);
					if (f_1611_ < -f)
						return;
					float f_1612_ = aFloat9767 + (aFloat9755 * (float) i_1590_ + f_1609_ + aFloat9750 * (float) i_1591_);
					f_1593_ = aFloat9768 + (aFloat9756 * (float) i_1590_ + f_1610_ + aFloat9764 * (float) i_1591_);
					if (f_1612_ < -f_1593_)
						return;
					float f_1613_ = aFloat9767 + (aFloat9755 * (float) i_1590_ + f_1609_ + aFloat9750 * (float) i_1592_);
					f_1594_ = aFloat9768 + (aFloat9756 * (float) i_1590_ + f_1610_ + aFloat9764 * (float) i_1592_);
					if (f_1613_ < -f_1594_)
						return;
					float f_1614_ = aFloat9767 + (aFloat9755 * (float) i_1589_ + f_1609_ + aFloat9750 * (float) i_1592_);
					f_1595_ = aFloat9768 + (aFloat9756 * (float) i_1589_ + f_1610_ + aFloat9764 * (float) i_1592_);
					if (f_1614_ < -f_1595_)
						return;
					float f_1615_ = aFloat9757 * (float) i_1608_;
					float f_1616_ = aFloat9748 * (float) i_1608_;
					float f_1617_ = aFloat9765 + (aFloat9753 * (float) i_1589_ + f_1615_ + aFloat9741 * (float) i_1591_);
					f_1596_ = (class118.aFloat1442 + class118.aFloat1469 * f_1617_ / f);
					float f_1618_ = aFloat9761 + (aFloat9771 * (float) i_1589_ + f_1616_ + aFloat9762 * (float) i_1591_);
					f_1597_ = (class118.aFloat1473 + class118.aFloat1444 * f_1618_ / f);
					f_1598_ = (class118.aFloat1458 + class118.aFloat1447 * f_1611_ / f);
					float f_1619_ = aFloat9765 + (aFloat9753 * (float) i_1590_ + f_1615_ + aFloat9741 * (float) i_1591_);
					f_1599_ = (class118.aFloat1442 + class118.aFloat1469 * f_1619_ / f_1593_);
					float f_1620_ = aFloat9761 + (aFloat9771 * (float) i_1590_ + f_1616_ + aFloat9762 * (float) i_1591_);
					f_1600_ = (class118.aFloat1473 + class118.aFloat1444 * f_1620_ / f_1593_);
					f_1601_ = (class118.aFloat1458 + class118.aFloat1447 * f_1612_ / f_1593_);
					float f_1621_ = aFloat9765 + (aFloat9753 * (float) i_1590_ + f_1615_ + aFloat9741 * (float) i_1592_);
					f_1602_ = (class118.aFloat1442 + class118.aFloat1469 * f_1621_ / f_1594_);
					float f_1622_ = aFloat9761 + (aFloat9771 * (float) i_1590_ + f_1616_ + aFloat9762 * (float) i_1592_);
					f_1603_ = (class118.aFloat1473 + class118.aFloat1444 * f_1622_ / f_1594_);
					f_1604_ = (class118.aFloat1458 + class118.aFloat1447 * f_1613_ / f_1594_);
					float f_1623_ = aFloat9765 + (aFloat9753 * (float) i_1589_ + f_1615_ + aFloat9741 * (float) i_1592_);
					f_1605_ = (class118.aFloat1442 + class118.aFloat1469 * f_1623_ / f_1595_);
					float f_1624_ = aFloat9761 + (aFloat9771 * (float) i_1589_ + f_1616_ + aFloat9762 * (float) i_1592_);
					f_1606_ = (class118.aFloat1473 + class118.aFloat1444 * f_1624_ / f_1595_);
					f_1607_ = (class118.aFloat1458 + class118.aFloat1447 * f_1614_ / f_1595_);
				} else {
					int i_1625_ = anIntArrayArray1684[i][i_1583_];
					int i_1626_ = anIntArrayArray1684[i + 1][i_1583_];
					int i_1627_ = anIntArrayArray1684[i + 1][i_1583_ + 1];
					int i_1628_ = anIntArrayArray1684[i][i_1583_ + 1];
					float f_1629_ = aFloat9767 + (aFloat9755 * (float) i_1589_ + aFloat9773 * (float) i_1625_ + aFloat9750 * (float) i_1591_);
					f = aFloat9768 + (aFloat9756 * (float) i_1589_ + aFloat9754 * (float) i_1625_ + aFloat9764 * (float) i_1591_);
					if (f_1629_ < -f)
						return;
					float f_1630_ = aFloat9767 + (aFloat9755 * (float) i_1590_ + aFloat9773 * (float) i_1626_ + aFloat9750 * (float) i_1591_);
					f_1593_ = aFloat9768 + (aFloat9756 * (float) i_1590_ + aFloat9754 * (float) i_1626_ + aFloat9764 * (float) i_1591_);
					if (f_1630_ < -f_1593_)
						return;
					float f_1631_ = aFloat9767 + (aFloat9755 * (float) i_1590_ + aFloat9773 * (float) i_1627_ + aFloat9750 * (float) i_1592_);
					f_1594_ = aFloat9768 + (aFloat9756 * (float) i_1590_ + aFloat9754 * (float) i_1627_ + aFloat9764 * (float) i_1592_);
					if (f_1631_ < -f_1594_)
						return;
					float f_1632_ = aFloat9767 + (aFloat9755 * (float) i_1589_ + aFloat9773 * (float) i_1628_ + aFloat9750 * (float) i_1592_);
					f_1595_ = aFloat9768 + (aFloat9756 * (float) i_1589_ + aFloat9754 * (float) i_1628_ + aFloat9764 * (float) i_1592_);
					if (f_1632_ < -f_1595_)
						return;
					float f_1633_ = aFloat9765 + (aFloat9753 * (float) i_1589_ + aFloat9757 * (float) i_1625_ + aFloat9741 * (float) i_1591_);
					f_1596_ = (class118.aFloat1442 + class118.aFloat1469 * f_1633_ / f);
					float f_1634_ = aFloat9761 + (aFloat9771 * (float) i_1589_ + aFloat9748 * (float) i_1625_ + aFloat9762 * (float) i_1591_);
					f_1597_ = (class118.aFloat1473 + class118.aFloat1444 * f_1634_ / f);
					f_1598_ = (class118.aFloat1458 + class118.aFloat1447 * f_1629_ / f);
					float f_1635_ = aFloat9765 + (aFloat9753 * (float) i_1590_ + aFloat9757 * (float) i_1626_ + aFloat9741 * (float) i_1591_);
					f_1599_ = (class118.aFloat1442 + class118.aFloat1469 * f_1635_ / f_1593_);
					float f_1636_ = aFloat9761 + (aFloat9771 * (float) i_1590_ + aFloat9748 * (float) i_1626_ + aFloat9762 * (float) i_1591_);
					f_1600_ = (class118.aFloat1473 + class118.aFloat1444 * f_1636_ / f_1593_);
					f_1601_ = (class118.aFloat1458 + class118.aFloat1447 * f_1630_ / f_1593_);
					float f_1637_ = aFloat9765 + (aFloat9753 * (float) i_1590_ + aFloat9757 * (float) i_1627_ + aFloat9741 * (float) i_1592_);
					f_1602_ = (class118.aFloat1442 + class118.aFloat1469 * f_1637_ / f_1594_);
					float f_1638_ = aFloat9761 + (aFloat9771 * (float) i_1590_ + aFloat9748 * (float) i_1627_ + aFloat9762 * (float) i_1592_);
					f_1603_ = (class118.aFloat1473 + class118.aFloat1444 * f_1638_ / f_1594_);
					f_1604_ = (class118.aFloat1458 + class118.aFloat1447 * f_1631_ / f_1594_);
					float f_1639_ = aFloat9765 + (aFloat9753 * (float) i_1589_ + aFloat9757 * (float) i_1628_ + aFloat9741 * (float) i_1592_);
					f_1605_ = (class118.aFloat1442 + class118.aFloat1469 * f_1639_ / f_1595_);
					float f_1640_ = aFloat9761 + (aFloat9771 * (float) i_1589_ + aFloat9748 * (float) i_1628_ + aFloat9762 * (float) i_1592_);
					f_1606_ = (class118.aFloat1473 + class118.aFloat1444 * f_1640_ / f_1595_);
					f_1607_ = (class118.aFloat1458 + class118.aFloat1447 * f_1632_ / f_1595_);
				}
				boolean bool = false;
				if (class129.aShort1552 != -1) {
					Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class129.aShort1552 & 0xffff, 381465948));
					bool = class177.aBool1881;
				}
				if (((f_1602_ - f_1605_) * (f_1600_ - f_1606_) - (f_1603_ - f_1606_) * (f_1599_ - f_1605_)) > 0.0F) {
					class118.aBool1455 = (f_1602_ < 0.0F || f_1605_ < 0.0F || f_1599_ < 0.0F || f_1602_ > (float) class118.anInt1448 || f_1605_ > (float) class118.anInt1448 || f_1599_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_1603_, f_1606_, f_1600_, f_1602_, f_1605_, f_1599_, f_1604_, f_1607_, f_1601_, f_1594_, f_1595_, f_1593_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1549 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_1603_, f_1606_, f_1600_, f_1602_, f_1605_, f_1599_, f_1604_, f_1607_, f_1601_, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
				}
				if (((f_1596_ - f_1599_) * (f_1606_ - f_1600_) - (f_1597_ - f_1600_) * (f_1605_ - f_1599_)) > 0.0F) {
					class118.aBool1455 = (f_1596_ < 0.0F || f_1599_ < 0.0F || f_1605_ < 0.0F || f_1596_ > (float) class118.anInt1448 || f_1599_ > (float) class118.anInt1448 || f_1605_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_1597_, f_1600_, f_1606_, f_1596_, f_1599_, f_1605_, f_1598_, f_1601_, f_1607_, f, f_1593_, f_1595_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1547 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_1597_, f_1600_, f_1606_, f_1596_, f_1599_, f_1605_, f_1598_, f_1601_, f_1607_, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
				}
			}
		} else {
			Class107 class107 = aClass107ArrayArray9749[i][i_1583_];
			if (class107 != null) {
				if (i_1588_ != 0) {
					if ((class107.aByte1306 & 0x4) != 0) {
						if ((i_1588_ & 0x1) != 0)
							return;
					} else if ((i_1588_ & 0x2) != 0)
						return;
				}
				for (int i_1641_ = 0; i_1641_ < class107.aShort1300; i_1641_++) {
					int i_1642_ = (class107.aShortArray1301[i_1641_] + (i << anInt1680 * -1193058675));
					short i_1643_ = class107.aShortArray1302[i_1641_];
					int i_1644_ = (class107.aShortArray1303[i_1641_] + (i_1583_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1642_ + aFloat9773 * (float) i_1643_ + aFloat9750 * (float) i_1644_);
					float f_1645_ = aFloat9768 + (aFloat9756 * (float) i_1642_ + aFloat9754 * (float) i_1643_ + aFloat9764 * (float) i_1644_);
					if (f < -f_1645_)
						return;
					float f_1646_ = aFloat9765 + (aFloat9753 * (float) i_1642_ + aFloat9757 * (float) i_1643_ + aFloat9741 * (float) i_1644_);
					float f_1647_ = aFloat9761 + (aFloat9771 * (float) i_1642_ + aFloat9748 * (float) i_1643_ + aFloat9762 * (float) i_1644_);
					fs[i_1641_] = (class118.aFloat1442 + class118.aFloat1469 * f_1646_ / f_1645_);
					fs_1584_[i_1641_] = (class118.aFloat1473 + class118.aFloat1444 * f_1647_ / f_1645_);
					fs_1585_[i_1641_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_1645_);
					fs_1586_[i_1641_] = f_1645_;
				}
				if (class107.aShortArray1308 != null) {
					for (int i_1648_ = 0; i_1648_ < class107.aShort1299; i_1648_++) {
						short i_1649_ = class107.aShortArray1305[i_1648_];
						short i_1650_ = class107.aShortArray1307[i_1648_];
						short i_1651_ = class107.aShortArray1298[i_1648_];
						float f = fs[i_1649_];
						float f_1652_ = fs[i_1650_];
						float f_1653_ = fs[i_1651_];
						float f_1654_ = fs_1584_[i_1649_];
						float f_1655_ = fs_1584_[i_1650_];
						float f_1656_ = fs_1584_[i_1651_];
						if (((f - f_1652_) * (f_1656_ - f_1655_) - (f_1654_ - f_1655_) * (f_1653_ - f_1652_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1652_ < 0.0F || f_1653_ < 0.0F || f > (float) class118.anInt1448 || f_1652_ > (float) class118.anInt1448 || f_1653_ > (float) class118.anInt1448);
							boolean bool = false;
							if (class107.aShortArray1308[i_1648_] != -1) {
								Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class107.aShortArray1308[i_1648_] & 0xffff), 285388058));
								bool = class177.aBool1881;
							}
							if (bool)
								class118.method2053(true, true, false, f_1654_, f_1655_, f_1656_, f, f_1652_, f_1653_, fs_1585_[i_1649_], fs_1585_[i_1650_], fs_1585_[i_1651_], fs_1586_[i_1649_], fs_1586_[i_1650_], fs_1586_[i_1651_], ((float) class107.aShortArray1301[i_1649_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_1650_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_1651_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_1649_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_1650_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_1651_] / (float) (anInt1682 * 341909049)), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_1649_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_1650_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_1651_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class107.aShortArray1308[i_1648_] & 0xffff));
							else {
								int i_1657_ = class107.anIntArray1310[i_1648_];
								if (i_1657_ != -1)
									class118.method2033(true, true, false, f_1654_, f_1655_, f_1656_, f, f_1652_, f_1653_, fs_1585_[i_1649_], fs_1585_[i_1650_], fs_1585_[i_1651_], (float) (Class174.method2935(i_1657_, (class107.aShortArray1304[i_1649_]), 1530418723)), (float) (Class174.method2935(i_1657_, (class107.aShortArray1304[i_1650_]), 1530418723)), (float) (Class174.method2935(i_1657_, (class107.aShortArray1304[i_1651_]), 1530418723)));
							}
						}
					}
				} else {
					for (int i_1658_ = 0; i_1658_ < class107.aShort1299; i_1658_++) {
						short i_1659_ = class107.aShortArray1305[i_1658_];
						short i_1660_ = class107.aShortArray1307[i_1658_];
						short i_1661_ = class107.aShortArray1298[i_1658_];
						float f = fs[i_1659_];
						float f_1662_ = fs[i_1660_];
						float f_1663_ = fs[i_1661_];
						float f_1664_ = fs_1584_[i_1659_];
						float f_1665_ = fs_1584_[i_1660_];
						float f_1666_ = fs_1584_[i_1661_];
						if (((f - f_1662_) * (f_1666_ - f_1665_) - (f_1664_ - f_1665_) * (f_1663_ - f_1662_)) > 0.0F) {
							int i_1667_ = class107.anIntArray1310[i_1658_];
							if (i_1667_ != -1) {
								class118.aBool1455 = (f < 0.0F || f_1662_ < 0.0F || f_1663_ < 0.0F || f > (float) class118.anInt1448 || f_1662_ > (float) class118.anInt1448 || (f_1663_ > (float) class118.anInt1448));
								class118.method2033(true, true, false, f_1664_, f_1665_, f_1666_, f, f_1662_, f_1663_, fs_1585_[i_1659_], fs_1585_[i_1660_], fs_1585_[i_1661_], (float) (Class174.method2935(i_1667_, (class107.aShortArray1304[i_1659_]), 1530418723)), (float) (Class174.method2935(i_1667_, (class107.aShortArray1304[i_1660_]), 1530418723)), (float) (Class174.method2935(i_1667_, (class107.aShortArray1304[i_1661_]), 1530418723)));
							}
						}
					}
				}
			}
		}
	}

	void method15379(int i, int i_1668_, Class118 class118, float[] fs, float[] fs_1669_, float[] fs_1670_, float[] fs_1671_, float[] fs_1672_, int i_1673_) {
		Class129 class129 = aClass129ArrayArray9747[i][i_1668_];
		if (class129 != null) {
			if ((class129.aByte1550 & 0x2) == 0) {
				if (i_1673_ != 0) {
					if ((class129.aByte1550 & 0x4) != 0) {
						if ((i_1673_ & 0x1) != 0)
							return;
					} else if ((i_1673_ & 0x2) != 0)
						return;
				}
				int i_1674_ = i * (anInt1682 * 341909049);
				int i_1675_ = i_1674_ + anInt1682 * 341909049;
				int i_1676_ = i_1668_ * (anInt1682 * 341909049);
				int i_1677_ = i_1676_ + anInt1682 * 341909049;
				float f;
				float f_1678_;
				float f_1679_;
				float f_1680_;
				float f_1681_;
				float f_1682_;
				float f_1683_;
				float f_1684_;
				float f_1685_;
				float f_1686_;
				float f_1687_;
				float f_1688_;
				float f_1689_;
				float f_1690_;
				float f_1691_;
				float f_1692_;
				if ((class129.aByte1550 & 0x1) != 0) {
					int i_1693_ = anIntArrayArray1684[i][i_1668_];
					float f_1694_ = aFloat9773 * (float) i_1693_;
					float f_1695_ = aFloat9754 * (float) i_1693_;
					float f_1696_ = aFloat9767 + (aFloat9755 * (float) i_1674_ + f_1694_ + aFloat9750 * (float) i_1676_);
					f = aFloat9768 + (aFloat9756 * (float) i_1674_ + f_1695_ + aFloat9764 * (float) i_1676_);
					if (f_1696_ < -f)
						return;
					float f_1697_ = aFloat9767 + (aFloat9755 * (float) i_1675_ + f_1694_ + aFloat9750 * (float) i_1676_);
					f_1678_ = aFloat9768 + (aFloat9756 * (float) i_1675_ + f_1695_ + aFloat9764 * (float) i_1676_);
					if (f_1697_ < -f_1678_)
						return;
					float f_1698_ = aFloat9767 + (aFloat9755 * (float) i_1675_ + f_1694_ + aFloat9750 * (float) i_1677_);
					f_1679_ = aFloat9768 + (aFloat9756 * (float) i_1675_ + f_1695_ + aFloat9764 * (float) i_1677_);
					if (f_1698_ < -f_1679_)
						return;
					float f_1699_ = aFloat9767 + (aFloat9755 * (float) i_1674_ + f_1694_ + aFloat9750 * (float) i_1677_);
					f_1680_ = aFloat9768 + (aFloat9756 * (float) i_1674_ + f_1695_ + aFloat9764 * (float) i_1677_);
					if (f_1699_ < -f_1680_)
						return;
					float f_1700_ = aFloat9757 * (float) i_1693_;
					float f_1701_ = aFloat9748 * (float) i_1693_;
					float f_1702_ = aFloat9765 + (aFloat9753 * (float) i_1674_ + f_1700_ + aFloat9741 * (float) i_1676_);
					f_1681_ = (class118.aFloat1442 + class118.aFloat1469 * f_1702_ / f);
					float f_1703_ = aFloat9761 + (aFloat9771 * (float) i_1674_ + f_1701_ + aFloat9762 * (float) i_1676_);
					f_1682_ = (class118.aFloat1473 + class118.aFloat1444 * f_1703_ / f);
					f_1683_ = (class118.aFloat1458 + class118.aFloat1447 * f_1696_ / f);
					float f_1704_ = aFloat9765 + (aFloat9753 * (float) i_1675_ + f_1700_ + aFloat9741 * (float) i_1676_);
					f_1684_ = (class118.aFloat1442 + class118.aFloat1469 * f_1704_ / f_1678_);
					float f_1705_ = aFloat9761 + (aFloat9771 * (float) i_1675_ + f_1701_ + aFloat9762 * (float) i_1676_);
					f_1685_ = (class118.aFloat1473 + class118.aFloat1444 * f_1705_ / f_1678_);
					f_1686_ = (class118.aFloat1458 + class118.aFloat1447 * f_1697_ / f_1678_);
					float f_1706_ = aFloat9765 + (aFloat9753 * (float) i_1675_ + f_1700_ + aFloat9741 * (float) i_1677_);
					f_1687_ = (class118.aFloat1442 + class118.aFloat1469 * f_1706_ / f_1679_);
					float f_1707_ = aFloat9761 + (aFloat9771 * (float) i_1675_ + f_1701_ + aFloat9762 * (float) i_1677_);
					f_1688_ = (class118.aFloat1473 + class118.aFloat1444 * f_1707_ / f_1679_);
					f_1689_ = (class118.aFloat1458 + class118.aFloat1447 * f_1698_ / f_1679_);
					float f_1708_ = aFloat9765 + (aFloat9753 * (float) i_1674_ + f_1700_ + aFloat9741 * (float) i_1677_);
					f_1690_ = (class118.aFloat1442 + class118.aFloat1469 * f_1708_ / f_1680_);
					float f_1709_ = aFloat9761 + (aFloat9771 * (float) i_1674_ + f_1701_ + aFloat9762 * (float) i_1677_);
					f_1691_ = (class118.aFloat1473 + class118.aFloat1444 * f_1709_ / f_1680_);
					f_1692_ = (class118.aFloat1458 + class118.aFloat1447 * f_1699_ / f_1680_);
				} else {
					int i_1710_ = anIntArrayArray1684[i][i_1668_];
					int i_1711_ = anIntArrayArray1684[i + 1][i_1668_];
					int i_1712_ = anIntArrayArray1684[i + 1][i_1668_ + 1];
					int i_1713_ = anIntArrayArray1684[i][i_1668_ + 1];
					float f_1714_ = aFloat9767 + (aFloat9755 * (float) i_1674_ + aFloat9773 * (float) i_1710_ + aFloat9750 * (float) i_1676_);
					f = aFloat9768 + (aFloat9756 * (float) i_1674_ + aFloat9754 * (float) i_1710_ + aFloat9764 * (float) i_1676_);
					if (f_1714_ < -f)
						return;
					float f_1715_ = aFloat9767 + (aFloat9755 * (float) i_1675_ + aFloat9773 * (float) i_1711_ + aFloat9750 * (float) i_1676_);
					f_1678_ = aFloat9768 + (aFloat9756 * (float) i_1675_ + aFloat9754 * (float) i_1711_ + aFloat9764 * (float) i_1676_);
					if (f_1715_ < -f_1678_)
						return;
					float f_1716_ = aFloat9767 + (aFloat9755 * (float) i_1675_ + aFloat9773 * (float) i_1712_ + aFloat9750 * (float) i_1677_);
					f_1679_ = aFloat9768 + (aFloat9756 * (float) i_1675_ + aFloat9754 * (float) i_1712_ + aFloat9764 * (float) i_1677_);
					if (f_1716_ < -f_1679_)
						return;
					float f_1717_ = aFloat9767 + (aFloat9755 * (float) i_1674_ + aFloat9773 * (float) i_1713_ + aFloat9750 * (float) i_1677_);
					f_1680_ = aFloat9768 + (aFloat9756 * (float) i_1674_ + aFloat9754 * (float) i_1713_ + aFloat9764 * (float) i_1677_);
					if (f_1717_ < -f_1680_)
						return;
					float f_1718_ = aFloat9765 + (aFloat9753 * (float) i_1674_ + aFloat9757 * (float) i_1710_ + aFloat9741 * (float) i_1676_);
					f_1681_ = (class118.aFloat1442 + class118.aFloat1469 * f_1718_ / f);
					float f_1719_ = aFloat9761 + (aFloat9771 * (float) i_1674_ + aFloat9748 * (float) i_1710_ + aFloat9762 * (float) i_1676_);
					f_1682_ = (class118.aFloat1473 + class118.aFloat1444 * f_1719_ / f);
					f_1683_ = (class118.aFloat1458 + class118.aFloat1447 * f_1714_ / f);
					float f_1720_ = aFloat9765 + (aFloat9753 * (float) i_1675_ + aFloat9757 * (float) i_1711_ + aFloat9741 * (float) i_1676_);
					f_1684_ = (class118.aFloat1442 + class118.aFloat1469 * f_1720_ / f_1678_);
					float f_1721_ = aFloat9761 + (aFloat9771 * (float) i_1675_ + aFloat9748 * (float) i_1711_ + aFloat9762 * (float) i_1676_);
					f_1685_ = (class118.aFloat1473 + class118.aFloat1444 * f_1721_ / f_1678_);
					f_1686_ = (class118.aFloat1458 + class118.aFloat1447 * f_1715_ / f_1678_);
					float f_1722_ = aFloat9765 + (aFloat9753 * (float) i_1675_ + aFloat9757 * (float) i_1712_ + aFloat9741 * (float) i_1677_);
					f_1687_ = (class118.aFloat1442 + class118.aFloat1469 * f_1722_ / f_1679_);
					float f_1723_ = aFloat9761 + (aFloat9771 * (float) i_1675_ + aFloat9748 * (float) i_1712_ + aFloat9762 * (float) i_1677_);
					f_1688_ = (class118.aFloat1473 + class118.aFloat1444 * f_1723_ / f_1679_);
					f_1689_ = (class118.aFloat1458 + class118.aFloat1447 * f_1716_ / f_1679_);
					float f_1724_ = aFloat9765 + (aFloat9753 * (float) i_1674_ + aFloat9757 * (float) i_1713_ + aFloat9741 * (float) i_1677_);
					f_1690_ = (class118.aFloat1442 + class118.aFloat1469 * f_1724_ / f_1680_);
					float f_1725_ = aFloat9761 + (aFloat9771 * (float) i_1674_ + aFloat9748 * (float) i_1713_ + aFloat9762 * (float) i_1677_);
					f_1691_ = (class118.aFloat1473 + class118.aFloat1444 * f_1725_ / f_1680_);
					f_1692_ = (class118.aFloat1458 + class118.aFloat1447 * f_1717_ / f_1680_);
				}
				boolean bool = false;
				if (class129.aShort1552 != -1) {
					Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895(class129.aShort1552 & 0xffff, -835831223));
					bool = class177.aBool1881;
				}
				if (((f_1687_ - f_1690_) * (f_1685_ - f_1691_) - (f_1688_ - f_1691_) * (f_1684_ - f_1690_)) > 0.0F) {
					class118.aBool1455 = (f_1687_ < 0.0F || f_1690_ < 0.0F || f_1684_ < 0.0F || f_1687_ > (float) class118.anInt1448 || f_1690_ > (float) class118.anInt1448 || f_1684_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_1688_, f_1691_, f_1685_, f_1687_, f_1690_, f_1684_, f_1689_, f_1692_, f_1686_, f_1679_, f_1680_, f_1678_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1549 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_1688_, f_1691_, f_1685_, f_1687_, f_1690_, f_1684_, f_1689_, f_1692_, f_1686_, (float) (class129.aShort1549 & 0xffff), (float) (class129.aShort1551 & 0xffff), (float) (class129.aShort1548 & 0xffff));
				}
				if (((f_1681_ - f_1684_) * (f_1691_ - f_1685_) - (f_1682_ - f_1685_) * (f_1690_ - f_1684_)) > 0.0F) {
					class118.aBool1455 = (f_1681_ < 0.0F || f_1684_ < 0.0F || f_1690_ < 0.0F || f_1681_ > (float) class118.anInt1448 || f_1684_ > (float) class118.anInt1448 || f_1690_ > (float) class118.anInt1448);
					if (bool)
						class118.method2053(true, true, false, f_1682_, f_1685_, f_1691_, f_1681_, f_1684_, f_1690_, f_1683_, f_1686_, f_1692_, f, f_1678_, f_1680_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class638.anIntArray8306[class129.aShort1547 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1548 & 0xffff]) & 0xffffff), ~0xffffff | ((Class638.anIntArray8306[class129.aShort1551 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class129.aShort1552 & 0xffff);
					else
						class118.method2033(true, true, false, f_1682_, f_1685_, f_1691_, f_1681_, f_1684_, f_1690_, f_1683_, f_1686_, f_1692_, (float) (class129.aShort1547 & 0xffff), (float) (class129.aShort1548 & 0xffff), (float) (class129.aShort1551 & 0xffff));
				}
			}
		} else {
			Class107 class107 = aClass107ArrayArray9749[i][i_1668_];
			if (class107 != null) {
				if (i_1673_ != 0) {
					if ((class107.aByte1306 & 0x4) != 0) {
						if ((i_1673_ & 0x1) != 0)
							return;
					} else if ((i_1673_ & 0x2) != 0)
						return;
				}
				for (int i_1726_ = 0; i_1726_ < class107.aShort1300; i_1726_++) {
					int i_1727_ = (class107.aShortArray1301[i_1726_] + (i << anInt1680 * -1193058675));
					short i_1728_ = class107.aShortArray1302[i_1726_];
					int i_1729_ = (class107.aShortArray1303[i_1726_] + (i_1668_ << anInt1680 * -1193058675));
					float f = aFloat9767 + (aFloat9755 * (float) i_1727_ + aFloat9773 * (float) i_1728_ + aFloat9750 * (float) i_1729_);
					float f_1730_ = aFloat9768 + (aFloat9756 * (float) i_1727_ + aFloat9754 * (float) i_1728_ + aFloat9764 * (float) i_1729_);
					if (f < -f_1730_)
						return;
					float f_1731_ = aFloat9765 + (aFloat9753 * (float) i_1727_ + aFloat9757 * (float) i_1728_ + aFloat9741 * (float) i_1729_);
					float f_1732_ = aFloat9761 + (aFloat9771 * (float) i_1727_ + aFloat9748 * (float) i_1728_ + aFloat9762 * (float) i_1729_);
					fs[i_1726_] = (class118.aFloat1442 + class118.aFloat1469 * f_1731_ / f_1730_);
					fs_1669_[i_1726_] = (class118.aFloat1473 + class118.aFloat1444 * f_1732_ / f_1730_);
					fs_1670_[i_1726_] = (class118.aFloat1458 + class118.aFloat1447 * f / f_1730_);
					fs_1671_[i_1726_] = f_1730_;
				}
				if (class107.aShortArray1308 != null) {
					for (int i_1733_ = 0; i_1733_ < class107.aShort1299; i_1733_++) {
						short i_1734_ = class107.aShortArray1305[i_1733_];
						short i_1735_ = class107.aShortArray1307[i_1733_];
						short i_1736_ = class107.aShortArray1298[i_1733_];
						float f = fs[i_1734_];
						float f_1737_ = fs[i_1735_];
						float f_1738_ = fs[i_1736_];
						float f_1739_ = fs_1669_[i_1734_];
						float f_1740_ = fs_1669_[i_1735_];
						float f_1741_ = fs_1669_[i_1736_];
						if (((f - f_1737_) * (f_1741_ - f_1740_) - (f_1739_ - f_1740_) * (f_1738_ - f_1737_)) > 0.0F) {
							class118.aBool1455 = (f < 0.0F || f_1737_ < 0.0F || f_1738_ < 0.0F || f > (float) class118.anInt1448 || f_1737_ > (float) class118.anInt1448 || f_1738_ > (float) class118.anInt1448);
							boolean bool = false;
							if (class107.aShortArray1308[i_1733_] != -1) {
								Class177 class177 = (aClass178_Sub3_9746.aClass172_1916.method2895((class107.aShortArray1308[i_1733_] & 0xffff), -1870719375));
								bool = class177.aBool1881;
							}
							if (bool)
								class118.method2053(true, true, false, f_1739_, f_1740_, f_1741_, f, f_1737_, f_1738_, fs_1670_[i_1734_], fs_1670_[i_1735_], fs_1670_[i_1736_], fs_1671_[i_1734_], fs_1671_[i_1735_], fs_1671_[i_1736_], ((float) class107.aShortArray1301[i_1734_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_1735_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1301[i_1736_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_1734_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_1735_] / (float) (anInt1682 * 341909049)), ((float) class107.aShortArray1303[i_1736_] / (float) (anInt1682 * 341909049)), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_1734_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_1735_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class638.anIntArray8306[(class107.aShortArray1304[i_1736_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class107.aShortArray1308[i_1733_] & 0xffff));
							else {
								int i_1742_ = class107.anIntArray1310[i_1733_];
								if (i_1742_ != -1)
									class118.method2033(true, true, false, f_1739_, f_1740_, f_1741_, f, f_1737_, f_1738_, fs_1670_[i_1734_], fs_1670_[i_1735_], fs_1670_[i_1736_], (float) (Class174.method2935(i_1742_, (class107.aShortArray1304[i_1734_]), 1530418723)), (float) (Class174.method2935(i_1742_, (class107.aShortArray1304[i_1735_]), 1530418723)), (float) (Class174.method2935(i_1742_, (class107.aShortArray1304[i_1736_]), 1530418723)));
							}
						}
					}
				} else {
					for (int i_1743_ = 0; i_1743_ < class107.aShort1299; i_1743_++) {
						short i_1744_ = class107.aShortArray1305[i_1743_];
						short i_1745_ = class107.aShortArray1307[i_1743_];
						short i_1746_ = class107.aShortArray1298[i_1743_];
						float f = fs[i_1744_];
						float f_1747_ = fs[i_1745_];
						float f_1748_ = fs[i_1746_];
						float f_1749_ = fs_1669_[i_1744_];
						float f_1750_ = fs_1669_[i_1745_];
						float f_1751_ = fs_1669_[i_1746_];
						if (((f - f_1747_) * (f_1751_ - f_1750_) - (f_1749_ - f_1750_) * (f_1748_ - f_1747_)) > 0.0F) {
							int i_1752_ = class107.anIntArray1310[i_1743_];
							if (i_1752_ != -1) {
								class118.aBool1455 = (f < 0.0F || f_1747_ < 0.0F || f_1748_ < 0.0F || f > (float) class118.anInt1448 || f_1747_ > (float) class118.anInt1448 || (f_1748_ > (float) class118.anInt1448));
								class118.method2033(true, true, false, f_1749_, f_1750_, f_1751_, f, f_1747_, f_1748_, fs_1670_[i_1744_], fs_1670_[i_1745_], fs_1670_[i_1746_], (float) (Class174.method2935(i_1752_, (class107.aShortArray1304[i_1744_]), 1530418723)), (float) (Class174.method2935(i_1752_, (class107.aShortArray1304[i_1745_]), 1530418723)), (float) (Class174.method2935(i_1752_, (class107.aShortArray1304[i_1746_]), 1530418723)));
							}
						}
					}
				}
			}
		}
	}

	public void method2353(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_1753_, int i_1754_, int i_1755_, boolean bool) {
		/* empty */
	}

	void method15380(int i, int i_1756_, int i_1757_, int i_1758_, int i_1759_, int i_1760_, int i_1761_, boolean[][] bools, Class99 class99, Class118 class118, float[] fs, float[] fs_1762_) {
		int i_1763_ = (i_1761_ - i_1759_) * i_1757_ / 256;
		int i_1764_ = i_1757_ >> 8;
		boolean bool = class99.aBool1186;
		aClass178_Sub3_9746.method3287(false);
		class118.aBool1465 = false;
		class118.aBool1437 = false;
		int i_1765_ = i;
		int i_1766_ = i_1756_ + i_1763_;
		for (int i_1767_ = i_1758_; i_1767_ < i_1760_; i_1767_++) {
			for (int i_1768_ = i_1759_; i_1768_ < i_1761_; i_1768_++) {
				if (bools[i_1767_ - i_1758_][i_1768_ - i_1759_]) {
					if (aClass106ArrayArray9758 != null) {
						if (aClass106ArrayArray9758[i_1767_][i_1768_] != null) {
							Class106 class106 = aClass106ArrayArray9758[i_1767_][i_1768_];
							if (class106.aShort1297 != -1 && (class106.aByte1292 & 0x2) == 0 && class106.anInt1296 == 0) {
								int i_1769_ = (aClass178_Sub3_9746.method15416(class106.aShort1297 & 0xffff));
								class118.method2033(true, true, false, (float) (i_1766_ - i_1764_), (float) (i_1766_ - i_1764_), (float) i_1766_, (float) (i_1765_ + i_1764_), (float) i_1765_, (float) (i_1765_ + i_1764_), 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_1769_, (class106.anInt1289), 1530418723), (float) Class174.method2935(i_1769_, (class106.anInt1291), 1530418723), (float) Class174.method2935(i_1769_, (class106.anInt1287), 1530418723));
								class118.method2033(true, true, false, (float) i_1766_, (float) i_1766_, (float) (i_1766_ - i_1764_), (float) i_1765_, (float) (i_1765_ + i_1764_), (float) i_1765_, 100.0F, 100.0F, 100.0F, (float) Class174.method2935(i_1769_, (class106.anInt1288), 1530418723), (float) Class174.method2935(i_1769_, (class106.anInt1287), 1530418723), (float) Class174.method2935(i_1769_, (class106.anInt1291), 1530418723));
							} else if (class106.anInt1296 == 0) {
								class118.method2031(true, true, false, (float) (i_1766_ - i_1764_), (float) (i_1766_ - i_1764_), (float) i_1766_, (float) (i_1765_ + i_1764_), (float) i_1765_, (float) (i_1765_ + i_1764_), 100.0F, 100.0F, 100.0F, class106.anInt1289, class106.anInt1291, class106.anInt1287);
								class118.method2031(true, true, false, (float) i_1766_, (float) i_1766_, (float) (i_1766_ - i_1764_), (float) i_1765_, (float) (i_1765_ + i_1764_), (float) i_1765_, 100.0F, 100.0F, 100.0F, class106.anInt1288, class106.anInt1287, class106.anInt1291);
							} else {
								int i_1770_ = class106.anInt1296;
								class118.method2031(true, true, false, (float) (i_1766_ - i_1764_), (float) (i_1766_ - i_1764_), (float) i_1766_, (float) (i_1765_ + i_1764_), (float) i_1765_, (float) (i_1765_ + i_1764_), 100.0F, 100.0F, 100.0F, Class155.method2546(i_1770_, (class106.anInt1289 & ~0xffffff), -1332859255), Class155.method2546(i_1770_, (class106.anInt1291 & ~0xffffff), -1164290681), Class155.method2546(i_1770_, (class106.anInt1287 & ~0xffffff), -211789452));
								class118.method2031(true, true, false, (float) i_1766_, (float) i_1766_, (float) (i_1766_ - i_1764_), (float) i_1765_, (float) (i_1765_ + i_1764_), (float) i_1765_, 100.0F, 100.0F, 100.0F, Class155.method2546(i_1770_, (class106.anInt1288 & ~0xffffff), -335121619), Class155.method2546(i_1770_, (class106.anInt1287 & ~0xffffff), -769973804), Class155.method2546(i_1770_, (class106.anInt1291 & ~0xffffff), -1448515512));
							}
						} else if (aClass94ArrayArray9751[i_1767_][i_1768_] != null) {
							Class94 class94 = aClass94ArrayArray9751[i_1767_][i_1768_];
							for (int i_1771_ = 0; i_1771_ < class94.aShort1152; i_1771_++) {
								fs[i_1771_] = (float) (i_1765_ + ((class94.aShortArray1154[i_1771_]) * i_1764_ / (anInt1682 * 341909049)));
								fs_1762_[i_1771_] = (float) (i_1766_ - ((class94.aShortArray1156[i_1771_]) * i_1764_ / (anInt1682 * 341909049)));
							}
							for (int i_1772_ = 0; i_1772_ < class94.aShort1161; i_1772_++) {
								int i_1773_ = i_1772_ * 3;
								int i_1774_ = i_1773_ + 1;
								int i_1775_ = i_1774_ + 1;
								float f = fs[i_1773_];
								float f_1776_ = fs[i_1774_];
								float f_1777_ = fs[i_1775_];
								float f_1778_ = fs_1762_[i_1773_];
								float f_1779_ = fs_1762_[i_1774_];
								float f_1780_ = fs_1762_[i_1775_];
								if (class94.anIntArray1160 != null && class94.anIntArray1160[i_1772_] != 0 && (class94.aShortArray1155 == null || (class94.aShortArray1155 != null && (class94.aShortArray1155[i_1772_]) == -1))) {
									int i_1781_ = class94.anIntArray1160[i_1772_];
									class118.method2031(true, true, false, f_1778_, f_1779_, f_1780_, f, f_1776_, f_1777_, 100.0F, 100.0F, 100.0F, (Class155.method2546(i_1781_, (-16777216 - (class94.anIntArray1158[i_1773_] & ~0xffffff)), -1622377182)), (Class155.method2546(i_1781_, (-16777216 - (class94.anIntArray1158[i_1774_] & ~0xffffff)), -479279180)), (Class155.method2546(i_1781_, (-16777216 - (class94.anIntArray1158[i_1775_] & ~0xffffff)), -1197853486)));
								} else if (class94.aShortArray1155 != null && (class94.aShortArray1155[i_1772_] != -1)) {
									int i_1782_ = (aClass178_Sub3_9746.method15416(class94.aShortArray1155[i_1772_] & 0xffff));
									class118.method2033(true, true, false, f_1778_, f_1779_, f_1780_, f, f_1776_, f_1777_, 100.0F, 100.0F, 100.0F, (float) i_1782_, (float) i_1782_, (float) i_1782_);
								} else
									class118.method2031(true, true, false, f_1778_, f_1779_, f_1780_, f, f_1776_, f_1777_, 100.0F, 100.0F, 100.0F, class94.anIntArray1158[i_1773_], class94.anIntArray1158[i_1774_], class94.anIntArray1158[i_1775_]);
							}
						}
					} else if (aClass124ArrayArray9752[i_1767_][i_1768_] != null) {
						Class124 class124 = aClass124ArrayArray9752[i_1767_][i_1768_];
						for (int i_1783_ = 0; i_1783_ < class124.aShort1516; i_1783_++) {
							fs[i_1783_] = (float) (i_1765_ + (class124.aShortArray1517[i_1783_] * i_1764_ / (anInt1682 * 341909049)));
							fs_1762_[i_1783_] = (float) (i_1766_ - (class124.aShortArray1522[i_1783_] * i_1764_ / (anInt1682 * 341909049)));
						}
						for (int i_1784_ = 0; i_1784_ < class124.aShort1525; i_1784_++) {
							int i_1785_ = i_1784_ * 3;
							int i_1786_ = i_1785_ + 1;
							int i_1787_ = i_1786_ + 1;
							float f = fs[i_1785_];
							float f_1788_ = fs[i_1786_];
							float f_1789_ = fs[i_1787_];
							float f_1790_ = fs_1762_[i_1785_];
							float f_1791_ = fs_1762_[i_1786_];
							float f_1792_ = fs_1762_[i_1787_];
							if (class124.anIntArray1521 != null && class124.anIntArray1521[i_1784_] != 0) {
								int i_1793_ = class124.anIntArray1521[i_1784_];
								class118.method2031(true, true, false, f_1790_, f_1791_, f_1792_, f, f_1788_, f_1789_, 100.0F, 100.0F, 100.0F, i_1793_, i_1793_, i_1793_);
							} else
								class118.method2031(true, true, false, f_1790_, f_1791_, f_1792_, f, f_1788_, f_1789_, 100.0F, 100.0F, 100.0F, class124.anIntArray1519[i_1785_], class124.anIntArray1519[i_1786_], class124.anIntArray1519[i_1787_]);
						}
					}
				}
				i_1766_ -= i_1764_;
			}
			i_1766_ = i_1756_ + i_1763_;
			i_1765_ += i_1764_;
		}
		class118.aBool1465 = true;
		aClass178_Sub3_9746.method3287(bool);
	}
}
