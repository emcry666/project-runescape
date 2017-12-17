/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class455 {
	boolean aBool4980;
	Class53_Sub5 aClass53_Sub5_4981;
	protected Class451 aClass451_4982;
	protected Class560 aClass560_4983;
	protected int anInt4984;
	public int anInt4985 = 0;
	public boolean aBool4986 = false;
	public boolean aBool4987 = false;
	public boolean aBool4988 = false;
	public boolean aBool4989 = false;
	public int anInt4990;
	protected int anInt4991;
	int[] anIntArray4992;
	static int[][] anIntArrayArray4993;
	protected boolean aBool4994;
	public byte[][][] aByteArrayArrayArray4995;
	static int[] anIntArray4996;
	byte[][][] aByteArrayArrayArray4997;
	byte[][][] aByteArrayArrayArray4998;
	int[] anIntArray4999;
	boolean aBool5000;
	protected byte[][][] aByteArrayArrayArray5001;
	static final int anInt5002 = 1;
	int[] anIntArray5003;
	int[] anIntArray5004;
	int[] anIntArray5005;
	Class53_Sub12 aClass53_Sub12_5006;
	static final int anInt5007 = 0;
	static final int anInt5008 = 0;
	int[] anIntArray5009;
	static final int anInt5010 = 3;
	static final int anInt5011 = 1;
	static final int anInt5012 = 2;
	short[][][] aShortArrayArrayArray5013;
	static final int anInt5014 = 8;
	static final int anInt5015 = 16;
	static int[][] anIntArrayArray5016;
	static final int anInt5017 = 64;
	static final int anInt5018 = 128;
	static int[][] anIntArrayArray5019;
	static final int anInt5020 = 4;
	static int[] anIntArray5021 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	public boolean aBool5022;
	int anInt5023;
	static int[] anIntArray5024;
	static int[] anIntArray5025;
	static boolean[][] aBoolArrayArray5026;
	static int[] anIntArray5027;
	static int[] anIntArray5028;
	int[] anIntArray5029;
	static final int anInt5030 = 2;
	static int[][] anIntArrayArray5031;
	int[] anIntArray5032;
	public int[][][] anIntArrayArrayArray5033;
	static boolean[][] aBoolArrayArray5034;
	static int[][] anIntArrayArray5035;
	static int[] anIntArray5036;
	static int[][] anIntArrayArray5037;
	static final int anInt5038 = 256;
	static final int anInt5039 = 512;
	static int[][] anIntArrayArray5040;
	static int[][] anIntArrayArray5041;
	static int[][] anIntArrayArray5042;
	static int[][] anIntArrayArray5043;
	int[] anIntArray5044 = new int[6];
	int[] anIntArray5045 = new int[13];
	int[] anIntArray5046 = new int[13];
	int[] anIntArray5047 = new int[13];
	int[] anIntArray5048 = new int[13];
	int[] anIntArray5049 = new int[13];
	static int[] anIntArray5050;
	int anInt5051;
	int anInt5052;
	int anInt5053;
	int anInt5054;
	int anInt5055;
	int anInt5056;
	short[][][] aShortArrayArrayArray5057;
	static boolean[][] aBoolArrayArray5058;
	int[] anIntArray5059;
	boolean aBool5060;
	boolean aBool5061;
	int anInt5062;
	int anInt5063;
	static boolean[][] aBoolArrayArray5064;
	static final int anInt5065 = 32;
	int[] anIntArray5066;
	static int[][] anIntArrayArray5067;

	public void method7327(Class178 class178, int[][][] is) {
		for (int i = 0; i < anInt4990 * 1248554419; i++) {
			int i_0_ = 0;
			int i_1_ = 0;
			if (!aBool5022) {
				if (aBool4986)
					i_1_ |= 0x8;
				if (aBool4987)
					i_0_ |= 0x2;
				if (anInt4985 * -841434311 != 0) {
					i_0_ |= 0x1;
					i_1_ |= 0x10;
				}
			}
			if (aBool4987)
				i_1_ |= 0x7;
			if (!aBool4989)
				i_1_ |= 0x20;
			int[][] is_2_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray5033[i]);
			aClass560_4983.method9256(i, class178.method3082(anInt4991 * -1287541105, -215635651 * anInt4984, anIntArrayArrayArray5033[i], is_2_, 512, i_0_, i_1_), (byte) 86);
		}
	}

	static final int method7328(int i, int i_3_) {
		int i_4_ = (Class53_Sub19.method17231(45365 + i, i_3_ + 91923, 4, 1014439817) - 128 + (Class53_Sub19.method17231(i + 10294, i_3_ + 37821, 2, 1014439817) - 128 >> 1) + (Class53_Sub19.method17231(i, i_3_, 1, 1014439817) - 128 >> 2));
		i_4_ = (int) (0.3 * (double) i_4_) + 35;
		if (i_4_ < 10)
			i_4_ = 10;
		else if (i_4_ > 60)
			i_4_ = 60;
		return i_4_;
	}

	public void method7329(byte i) {
		anIntArray5059 = null;
		anIntArray5003 = null;
		anIntArray5004 = null;
		anIntArray5005 = null;
		anIntArray5029 = null;
		aBool4994 = false;
	}

	public final void method7330(int i, int i_5_, int i_6_, int i_7_, short i_8_) {
		for (int i_9_ = 0; i_9_ < anInt4990 * 1248554419; i_9_++)
			method7400(i_9_, i, i_5_, i_6_, i_7_, 843139140);
	}

	static final int method7331(int i, int i_10_, int i_11_, int i_12_) {
		int i_13_ = 65536 - Class433.anIntArray4881[8192 * i_11_ / i_12_] >> 1;
		return (i_10_ * i_13_ >> 16) + (i * (65536 - i_13_) >> 16);
	}

	static final int method7332(int i, int i_14_) {
		int i_15_ = (Class53_Sub19.method17231(45365 + i, i_14_ + 91923, 4, 1014439817) - 128 + (Class53_Sub19.method17231(i + 10294, i_14_ + 37821, 2, 1014439817) - 128 >> 1) + (Class53_Sub19.method17231(i, i_14_, 1, 1014439817) - 128 >> 2));
		i_15_ = (int) (0.3 * (double) i_15_) + 35;
		if (i_15_ < 10)
			i_15_ = 10;
		else if (i_15_ > 60)
			i_15_ = 60;
		return i_15_;
	}

	void method7333(Class178 class178, Class651 class651, Class7 class7, int i, int i_16_, byte[][] is, byte[][] is_17_, short[][] is_18_, boolean[] bools) {
		boolean[] bools_19_ = (class651 != null && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		method7346(class178, class651, class7, i, i_16_, -1287541105 * anInt4991, anInt4984 * -215635651, is_18_, is, is_17_, bools, -1192216255);
		aBool5061 = class651 != null && (-1082268879 * class651.anInt8383 != class651.anInt8386 * 99640975);
		if (!aBool5061) {
			for (int i_20_ = 0; i_20_ < 8; i_20_++) {
				if (anIntArray5049[i_20_] >= 0 && anIntArray5046[i_20_] != anIntArray5045[i_20_]) {
					aBool5061 = true;
					break;
				}
			}
		}
		if (!bools_19_[anInt5052 * 425193199 + 1 & 0x3]) {
			boolean[] bools_21_ = bools;
			int i_22_ = 1;
			bools_21_[i_22_] = bools_21_[i_22_] | (anIntArray5032[2] & anIntArray5032[4]) == 0;
		}
		if (!bools_19_[425193199 * anInt5052 + 3 & 0x3]) {
			boolean[] bools_23_ = bools;
			int i_24_ = 3;
			bools_23_[i_24_] = bools_23_[i_24_] | 0 == (anIntArray5032[6] & anIntArray5032[0]);
		}
		if (!bools_19_[anInt5052 * 425193199 + 0 & 0x3]) {
			boolean[] bools_25_ = bools;
			int i_26_ = 0;
			bools_25_[i_26_] = bools_25_[i_26_] | 0 == (anIntArray5032[0] & anIntArray5032[2]);
		}
		if (!bools_19_[2 + anInt5052 * 425193199 & 0x3]) {
			boolean[] bools_27_ = bools;
			int i_28_ = 2;
			bools_27_[i_28_] = bools_27_[i_28_] | (anIntArray5032[4] & anIntArray5032[6]) == 0;
		}
		if (!aBool5060 && (-366854495 * anInt5051 == 0 || anInt5051 * -366854495 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_29_ = bools;
				bools[3] = false;
				bools_29_[0] = false;
				anInt5051 = (anInt5051 * -366854495 == 0 ? 13 : 14) * -1873205919;
				anInt5052 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_30_ = bools;
				bools[1] = false;
				bools_30_[0] = false;
				anInt5051 = (0 == anInt5051 * -366854495 ? 13 : 14) * -1873205919;
				anInt5052 = 757399597;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_31_ = bools;
				bools[2] = false;
				bools_31_[1] = false;
				anInt5051 = -1873205919 * (anInt5051 * -366854495 == 0 ? 13 : 14);
				anInt5052 = 1936588830;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_32_ = bools;
				bools[3] = false;
				bools_32_[2] = false;
				anInt5051 = -1873205919 * (-366854495 * anInt5051 == 0 ? 13 : 14);
				anInt5052 = -1179189233;
			}
		}
	}

	final void method7334(Class523_Sub34 class523_sub34, int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, boolean bool, int i_40_) {
		if (1 == i_39_)
			i_36_ = 1;
		else if (2 == i_39_) {
			i_35_ = 1;
			i_36_ = 1;
		} else if (3 == i_39_)
			i_35_ = 1;
		if (i_33_ >= 0 && i_33_ < anInt4991 * -1287541105 && i_34_ >= 0 && i_34_ < -215635651 * anInt4984) {
			if (!aBool5022 && !bool)
				aClass451_4982.aByteArrayArrayArray4962[i][i_33_][i_34_] = (byte) 0;
			int i_41_ = class523_sub34.readUnsignedByte(1946656314);
			if (0 != (i_41_ & 0x1)) {
				if (bool) {
					class523_sub34.readUnsignedByte(-1300106162);
					class523_sub34.readUnsignedSmart(368514876);
				} else {
					int i_42_ = class523_sub34.readUnsignedByte(-2136631763);
					aShortArrayArrayArray5013[i][i_33_][i_34_] = (short) class523_sub34.readUnsignedSmart(368514876);
					aByteArrayArrayArray4997[i][i_33_][i_34_] = (byte) (i_42_ >> 2);
					aByteArrayArrayArray4998[i][i_33_][i_34_] = (byte) (i_39_ + i_42_ & 0x3);
				}
			}
			if ((i_41_ & 0x2) != 0) {
				if (!aBool5022 && !bool)
					aClass451_4982.aByteArrayArrayArray4962[i][i_33_][i_34_] = class523_sub34.readByte((short) -26897);
				else
					class523_sub34.anInt10661 += 189765723;
			}
			if ((i_41_ & 0x4) != 0) {
				if (bool)
					class523_sub34.readUnsignedSmart(368514876);
				else
					aShortArrayArrayArray5057[i][i_33_][i_34_] = (short) class523_sub34.readUnsignedSmart(368514876);
			}
			if ((i_41_ & 0x8) != 0) {
				int i_43_ = class523_sub34.readUnsignedByte(-1515561476);
				if (!aBool5022) {
					if (1 == i_43_)
						i_43_ = 0;
					if (0 == i)
						anIntArrayArrayArray5033[0][i_33_ + i_35_][(i_36_ + i_34_)] = -i_43_ * 8 << 2;
					else
						anIntArrayArrayArray5033[i][i_33_ + i_35_][(i_36_ + i_34_)] = (anIntArrayArrayArray5033[i - 1][i_35_ + i_33_][i_36_ + i_34_]) - (i_43_ * 8 << 2);
				} else
					anIntArrayArrayArray5033[0][i_35_ + i_33_][i_34_ + i_36_] = 8 * i_43_ << 2;
			} else if (aBool5022)
				anIntArrayArrayArray5033[0][i_33_ + i_35_][i_34_ + i_36_] = 0;
			else if (0 == i)
				anIntArrayArrayArray5033[0][i_33_ + i_35_][i_36_ + i_34_] = -Class46.method1250(932731 + i_37_, i_38_ + 556238, 245722651) * 8 << 2;
			else
				anIntArrayArrayArray5033[i][i_33_ + i_35_][i_34_ + i_36_] = (anIntArrayArrayArray5033[i - 1][i_35_ + i_33_][i_34_ + i_36_]) - 960;
		} else {
			int i_44_ = class523_sub34.readUnsignedByte(1346184831);
			if (0 != (i_44_ & 0x1)) {
				class523_sub34.readUnsignedByte(1292628391);
				class523_sub34.readUnsignedSmart(368514876);
			}
			if (0 != (i_44_ & 0x2))
				class523_sub34.anInt10661 += 189765723;
			if (0 != (i_44_ & 0x4))
				class523_sub34.readUnsignedSmart(368514876);
			if ((i_44_ & 0x8) != 0)
				class523_sub34.readUnsignedByte(-1829522912);
		}
	}

	void method7335(Class651 class651, Class7 class7) {
		if (aBool5000) {
			anIntArray4999 = anIntArrayArray5031[-366854495 * anInt5051];
			anIntArray4992 = anIntArrayArray5019[anInt5051 * -366854495];
			anIntArray5066 = anIntArrayArray5016[-366854495 * anInt5051];
			anInt5063 = -280478319 * (null != class651 ? anIntArray5021[anInt5051 * -366854495] : 0);
			anInt5062 = (class7 != null ? anIntArray4996[anInt5051 * -366854495] : 0) * 1209531539;
		} else if (aBool5060) {
			anIntArray4999 = anIntArrayArray5041[anInt5051 * -366854495];
			anIntArray4992 = anIntArrayArray5042[-366854495 * anInt5051];
			anIntArray5066 = anIntArrayArray5043[-366854495 * anInt5051];
			anInt5063 = -280478319 * (null != class651 ? anIntArray5036[-366854495 * anInt5051] : 0);
			anInt5062 = 1209531539 * (null != class7 ? anIntArray5025[-366854495 * anInt5051] : 0);
			anIntArray5009 = anIntArrayArray5040[anInt5051 * -366854495];
		} else {
			anIntArray4999 = anIntArrayArray5067[-366854495 * anInt5051];
			anIntArray4992 = anIntArrayArray5037[anInt5051 * -366854495];
			anIntArray5066 = anIntArrayArray4993[-366854495 * anInt5051];
			anInt5063 = (null != class651 ? anIntArray5050[anInt5051 * -366854495] : 0) * -280478319;
			anInt5062 = (null != class7 ? anIntArray5024[-366854495 * anInt5051] : 0) * 1209531539;
			anIntArray5009 = anIntArrayArray5035[-366854495 * anInt5051];
		}
	}

	public void method7336(Class178 class178, int[][][] is, int i) {
		for (int i_45_ = 0; i_45_ < anInt4990 * 1248554419; i_45_++) {
			int i_46_ = 0;
			int i_47_ = 0;
			if (!aBool5022) {
				if (aBool4986)
					i_47_ |= 0x8;
				if (aBool4987)
					i_46_ |= 0x2;
				if (anInt4985 * -841434311 != 0) {
					i_46_ |= 0x1;
					i_47_ |= 0x10;
				}
			}
			if (aBool4987)
				i_47_ |= 0x7;
			if (!aBool4989)
				i_47_ |= 0x20;
			int[][] is_48_ = (null != is && i_45_ < is.length ? is[i_45_] : anIntArrayArrayArray5033[i_45_]);
			aClass560_4983.method9256(i_45_, class178.method3082(anInt4991 * -1287541105, -215635651 * anInt4984, anIntArrayArrayArray5033[i_45_], is_48_, 512, i_46_, i_47_), (byte) 65);
		}
	}

	public final void method7337(Class178 class178, Class142 class142, Class142 class142_49_, int i) {
		int[][] is = new int[anInt4991 * -1287541105][anInt4984 * -215635651];
		if (anIntArray5059 == null || anInt4984 * -215635651 != anIntArray5059.length) {
			anIntArray5059 = new int[anInt4984 * -215635651];
			anIntArray5003 = new int[anInt4984 * -215635651];
			anIntArray5004 = new int[anInt4984 * -215635651];
			anIntArray5005 = new int[-215635651 * anInt4984];
			anIntArray5029 = new int[-215635651 * anInt4984];
		}
		for (int i_50_ = 0; i_50_ < 1248554419 * anInt4990; i_50_++) {
			for (int i_51_ = 0; i_51_ < -215635651 * anInt4984; i_51_++) {
				anIntArray5059[i_51_] = 0;
				anIntArray5003[i_51_] = 0;
				anIntArray5004[i_51_] = 0;
				anIntArray5005[i_51_] = 0;
				anIntArray5029[i_51_] = 0;
			}
			for (int i_52_ = -5; i_52_ < -1287541105 * anInt4991; i_52_++) {
				for (int i_53_ = 0; i_53_ < anInt4984 * -215635651; i_53_++) {
					int i_54_ = i_52_ + 5;
					if (i_54_ < -1287541105 * anInt4991) {
						int i_55_ = (aShortArrayArrayArray5057[i_50_][i_54_][i_53_] & 0x7fff);
						if (i_55_ > 0) {
							Class7 class7 = ((Class7) aClass53_Sub5_4981.getDefinition(i_55_ - 1, (byte) -29));
							anIntArray5059[i_53_] += -95297807 * class7.anInt54;
							anIntArray5003[i_53_] += 1400193059 * class7.anInt55;
							anIntArray5004[i_53_] += class7.anInt50 * 271765687;
							anIntArray5005[i_53_] += 1218541115 * class7.anInt51;
							anIntArray5029[i_53_]++;
						}
					}
					int i_56_ = i_52_ - 5;
					if (i_56_ >= 0) {
						int i_57_ = (aShortArrayArrayArray5057[i_50_][i_56_][i_53_] & 0x7fff);
						if (i_57_ > 0) {
							Class7 class7 = ((Class7) aClass53_Sub5_4981.getDefinition(i_57_ - 1, (byte) -74));
							anIntArray5059[i_53_] -= class7.anInt54 * -95297807;
							anIntArray5003[i_53_] -= class7.anInt55 * 1400193059;
							anIntArray5004[i_53_] -= class7.anInt50 * 271765687;
							anIntArray5005[i_53_] -= class7.anInt51 * 1218541115;
							anIntArray5029[i_53_]--;
						}
					}
				}
				if (i_52_ >= 0) {
					int i_58_ = 0;
					int i_59_ = 0;
					int i_60_ = 0;
					int i_61_ = 0;
					int i_62_ = 0;
					for (int i_63_ = -5; i_63_ < -215635651 * anInt4984; i_63_++) {
						int i_64_ = i_63_ + 5;
						if (i_64_ < anInt4984 * -215635651) {
							i_58_ += anIntArray5059[i_64_];
							i_59_ += anIntArray5003[i_64_];
							i_60_ += anIntArray5004[i_64_];
							i_61_ += anIntArray5005[i_64_];
							i_62_ += anIntArray5029[i_64_];
						}
						int i_65_ = i_63_ - 5;
						if (i_65_ >= 0) {
							i_58_ -= anIntArray5059[i_65_];
							i_59_ -= anIntArray5003[i_65_];
							i_60_ -= anIntArray5004[i_65_];
							i_61_ -= anIntArray5005[i_65_];
							i_62_ -= anIntArray5029[i_65_];
						}
						if (i_63_ >= 0 && i_61_ > 0 && i_62_ > 0)
							is[i_52_][i_63_] = Class645.method10562(256 * i_58_ / i_61_, i_59_ / i_62_, i_60_ / i_62_, -2042904262);
					}
				}
			}
			if (aBool4988)
				method7339(class178, aClass560_4983.aClass142Array7509[i_50_], i_50_, is, i_50_ == 0 ? class142 : null, i_50_ == 0 ? class142_49_ : null, 2085222241);
			else
				method7409(class178, aClass560_4983.aClass142Array7509[i_50_], i_50_, is, 0 == i_50_ ? class142 : null, i_50_ == 0 ? class142_49_ : null, (byte) 85);
			aShortArrayArrayArray5057[i_50_] = null;
			aShortArrayArrayArray5013[i_50_] = null;
			aByteArrayArrayArray4997[i_50_] = null;
			aByteArrayArrayArray4998[i_50_] = null;
		}
		if (!aBool5022) {
			if (-841434311 * anInt4985 != 0)
				aClass560_4983.method9334(-1857973416);
			if (aBool4987)
				aClass560_4983.method9299((byte) 56);
		}
		for (int i_66_ = 0; i_66_ < 1248554419 * anInt4990; i_66_++)
			aClass560_4983.aClass142Array7509[i_66_].method2347();
	}

	public void method7338(Class178 class178, int[][][] is) {
		for (int i = 0; i < anInt4990 * 1248554419; i++) {
			int i_67_ = 0;
			int i_68_ = 0;
			if (!aBool5022) {
				if (aBool4986)
					i_68_ |= 0x8;
				if (aBool4987)
					i_67_ |= 0x2;
				if (anInt4985 * -841434311 != 0) {
					i_67_ |= 0x1;
					i_68_ |= 0x10;
				}
			}
			if (aBool4987)
				i_68_ |= 0x7;
			if (!aBool4989)
				i_68_ |= 0x20;
			int[][] is_69_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray5033[i]);
			aClass560_4983.method9256(i, class178.method3082(anInt4991 * -1287541105, -215635651 * anInt4984, anIntArrayArrayArray5033[i], is_69_, 512, i_67_, i_68_), (byte) 80);
		}
	}

	void method7339(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_70_, Class142 class142_71_, int i_72_) {
		byte[][] is_73_ = aByteArrayArrayArray4997[i];
		byte[][] is_74_ = aByteArrayArrayArray4998[i];
		short[][] is_75_ = aShortArrayArrayArray5057[i];
		short[][] is_76_ = aShortArrayArrayArray5013[i];
		boolean[] bools = new boolean[4];
		for (int i_77_ = 0; i_77_ < -1287541105 * anInt4991; i_77_++) {
			int i_78_ = i_77_ < -1287541105 * anInt4991 - 1 ? i_77_ + 1 : i_77_;
			for (int i_79_ = 0; i_79_ < anInt4984 * -215635651; i_79_++) {
				int i_80_ = i_79_ < anInt4984 * -215635651 - 1 ? 1 + i_79_ : i_79_;
				anInt5051 = is_73_[i_77_][i_79_] * -1873205919;
				anInt5052 = -1179189233 * is_74_[i_77_][i_79_];
				int i_81_ = is_76_[i_77_][i_79_] & 0x7fff;
				int i_82_ = is_75_[i_77_][i_79_] & 0x7fff;
				if (i_81_ != 0 || 0 != i_82_) {
					Class651 class651 = (Class651) (0 != i_81_ ? aClass53_Sub12_5006.getDefinition(i_81_ - 1, (byte) 46) : null);
					Class7 class7 = ((Class7) (i_82_ != 0 ? aClass53_Sub5_4981.getDefinition(i_82_ - 1, (byte) 16) : null));
					if (-366854495 * anInt5051 == 0 && null == class651)
						anInt5051 = -1003634548;
					aBool4980 = false;
					aBool5060 = false;
					boolean[] bools_83_ = bools;
					boolean[] bools_84_ = bools;
					boolean[] bools_85_ = bools;
					bools[3] = false;
					bools_85_[2] = false;
					bools_84_[1] = false;
					bools_83_[0] = false;
					Class651 class651_86_ = class651;
					if (class651 != null) {
						if (-1 == -1082268879 * class651.anInt8383 && 99640975 * class651.anInt8386 == -1) {
							class651_86_ = class651;
							class651 = null;
						} else if (class7 != null && 0 != -366854495 * anInt5051)
							aBool5060 = class651.aBool8381;
					}
					anInt5052 = (method7340(i_82_, i_77_, i_79_, i_78_, i_80_, class142, is_75_, (byte) 12) * -1179189233);
					for (int i_87_ = 0; i_87_ < 13; i_87_++) {
						anIntArray5049[i_87_] = -1;
						anIntArray5032[i_87_] = 1;
					}
					method7341(class178, class651, class7, i_77_, i_79_, is_73_, is_74_, is_76_, bools, (byte) 36);
					aBool5000 = (!aBool5060 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method7398(class651, class7, -960392330);
					int i_88_ = anInt5063 * 613557105 + -461602405 * anInt5062;
					if (i_88_ <= 0)
						aClass560_4983.method9330(i, i_77_, i_79_, (byte) 4);
					else {
						if (bools[0])
							i_88_++;
						if (bools[2])
							i_88_++;
						if (bools[1])
							i_88_++;
						if (bools[3])
							i_88_++;
						anInt5053 = 0;
						anInt5054 = 0;
						int i_89_ = i_88_ * 3;
						int[] is_90_ = aBool5061 ? new int[i_89_] : null;
						int[] is_91_ = new int[i_89_];
						int[] is_92_ = new int[i_89_];
						int[] is_93_ = new int[i_89_];
						int[] is_94_ = new int[i_89_];
						int[] is_95_ = new int[i_89_];
						int[] is_96_ = null != class142_71_ ? new int[i_89_] : null;
						int[] is_97_ = (null != class142_71_ || null != class142_70_ ? new int[i_89_] : null);
						for (int i_98_ = 0; i_98_ < i_89_; i_98_++)
							is_94_[i_98_] = -1;
						method7343(class178, i, i_77_, i_79_, class651, bools, is_90_, is_91_, is_92_, is_93_, is_94_, is_95_, is_96_, is_97_, class142, class142_71_, class142_70_, -2104437900);
						int i_99_ = is_75_[i_77_][i_80_] & 0x7fff;
						int i_100_ = is_75_[i_78_][i_80_] & 0x7fff;
						int i_101_ = is_75_[i_78_][i_79_] & 0x7fff;
						method7344(class178, i, i_77_, i_79_, i_78_, i_80_, class7, i_82_, i_99_, i_100_, i_101_, bools, is_90_, is_91_, is_92_, is_93_, is_94_, is_95_, is_96_, is_97_, is, class142, class142_71_, class142_70_, 919286051);
						method7345(class142, class7, class651_86_, i, i_77_, i_79_, i_78_, i_80_, i_82_, i_81_, (byte) -38);
						Class163 class163 = new Class163();
						if (aBool5022) {
							class163.anInt1776 = (aClass560_4983.method9258(i_77_, i_79_, (byte) 74) * -780986409);
							class163.anInt1775 = (aClass560_4983.method9254(i_77_, i_79_, 16711935) * 2053161261);
							class163.anInt1774 = (aClass560_4983.method9301(i_77_, i_79_, 65535) * 1512945865);
							class163.anInt1778 = (aClass560_4983.method9260(i_77_, i_79_, (short) -25037) * -923094865);
							class163.anInt1777 = (aClass560_4983.method9261(i_77_, i_79_, (short) -4272) * -320151975);
							class163.anInt1773 = aClass560_4983.method9329(i_77_, i_79_, 40000) * -58453511;
						}
						class142.method2351(i_77_, i_79_, is_91_, is_96_, is_92_, is_97_, is_93_, is_90_, is_94_, is_95_, class163, aBool4980);
						aClass560_4983.method9330(i, i_77_, i_79_, (byte) 4);
					}
				}
			}
		}
	}

	int method7340(int i, int i_102_, int i_103_, int i_104_, int i_105_, Class142 class142, short[][] is, byte i_106_) {
		if ((-366854495 * anInt5051 == 0 || 12 == anInt5051 * -366854495) && i_102_ > 0 && i_103_ > 0 && i_102_ < -1287541105 * anInt4991 && i_103_ < anInt4984 * -215635651) {
			int i_107_ = 0;
			int i_108_ = 0;
			int i_109_ = 0;
			int i_110_ = 0;
			i_107_ = i_107_ + (i == is[i_102_ - 1][i_103_ - 1] ? 1 : -1);
			i_108_ = i_108_ + (i == is[i_104_][i_103_ - 1] ? 1 : -1);
			i_109_ = i_109_ + (is[i_104_][i_105_] == i ? 1 : -1);
			i_110_ = i_110_ + (is[i_102_ - 1][i_105_] == i ? 1 : -1);
			if (is[i_102_][i_103_ - 1] == i) {
				i_107_++;
				i_108_++;
			} else {
				i_107_--;
				i_108_--;
			}
			if (is[i_104_][i_103_] == i) {
				i_108_++;
				i_109_++;
			} else {
				i_108_--;
				i_109_--;
			}
			if (is[i_102_][i_105_] == i) {
				i_109_++;
				i_110_++;
			} else {
				i_109_--;
				i_110_--;
			}
			if (is[i_102_ - 1][i_103_] == i) {
				i_110_++;
				i_107_++;
			} else {
				i_110_--;
				i_107_--;
			}
			int i_111_ = i_107_ - i_109_;
			if (i_111_ < 0)
				i_111_ = -i_111_;
			int i_112_ = i_108_ - i_110_;
			if (i_112_ < 0)
				i_112_ = -i_112_;
			if (i_112_ == i_111_) {
				i_111_ = (class142.method2321(i_102_, i_103_, 1622251020) - class142.method2321(i_104_, i_105_, 1652589545));
				if (i_111_ < 0)
					i_111_ = -i_111_;
				i_112_ = (class142.method2321(i_104_, i_103_, 1713314809) - class142.method2321(i_102_, i_105_, 1920234903));
				if (i_112_ < 0)
					i_112_ = -i_112_;
			}
			return i_111_ < i_112_ ? 1 : 0;
		}
		return 425193199 * anInt5052;
	}

	void method7341(Class178 class178, Class651 class651, Class7 class7, int i, int i_113_, byte[][] is, byte[][] is_114_, short[][] is_115_, boolean[] bools, byte i_116_) {
		boolean[] bools_117_ = (class651 != null && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		method7346(class178, class651, class7, i, i_113_, -1287541105 * anInt4991, anInt4984 * -215635651, is_115_, is, is_114_, bools, -1801068123);
		aBool5061 = class651 != null && (-1082268879 * class651.anInt8383 != class651.anInt8386 * 99640975);
		if (!aBool5061) {
			for (int i_118_ = 0; i_118_ < 8; i_118_++) {
				if (anIntArray5049[i_118_] >= 0 && anIntArray5046[i_118_] != anIntArray5045[i_118_]) {
					aBool5061 = true;
					break;
				}
			}
		}
		if (!bools_117_[anInt5052 * 425193199 + 1 & 0x3]) {
			boolean[] bools_119_ = bools;
			int i_120_ = 1;
			bools_119_[i_120_] = (bools_119_[i_120_] | (anIntArray5032[2] & anIntArray5032[4]) == 0);
		}
		if (!bools_117_[425193199 * anInt5052 + 3 & 0x3]) {
			boolean[] bools_121_ = bools;
			int i_122_ = 3;
			bools_121_[i_122_] = bools_121_[i_122_] | 0 == (anIntArray5032[6] & anIntArray5032[0]);
		}
		if (!bools_117_[anInt5052 * 425193199 + 0 & 0x3]) {
			boolean[] bools_123_ = bools;
			int i_124_ = 0;
			bools_123_[i_124_] = bools_123_[i_124_] | 0 == (anIntArray5032[0] & anIntArray5032[2]);
		}
		if (!bools_117_[2 + anInt5052 * 425193199 & 0x3]) {
			boolean[] bools_125_ = bools;
			int i_126_ = 2;
			bools_125_[i_126_] = (bools_125_[i_126_] | (anIntArray5032[4] & anIntArray5032[6]) == 0);
		}
		if (!aBool5060 && (-366854495 * anInt5051 == 0 || anInt5051 * -366854495 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_127_ = bools;
				bools[3] = false;
				bools_127_[0] = false;
				anInt5051 = (anInt5051 * -366854495 == 0 ? 13 : 14) * -1873205919;
				anInt5052 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_128_ = bools;
				bools[1] = false;
				bools_128_[0] = false;
				anInt5051 = (0 == anInt5051 * -366854495 ? 13 : 14) * -1873205919;
				anInt5052 = 757399597;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_129_ = bools;
				bools[2] = false;
				bools_129_[1] = false;
				anInt5051 = -1873205919 * (anInt5051 * -366854495 == 0 ? 13 : 14);
				anInt5052 = 1936588830;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_130_ = bools;
				bools[3] = false;
				bools_130_[2] = false;
				anInt5051 = -1873205919 * (-366854495 * anInt5051 == 0 ? 13 : 14);
				anInt5052 = -1179189233;
			}
		}
	}

	void method7342(Class178 class178, Class651 class651, Class7 class7, int i, int i_131_, byte[][] is, byte[][] is_132_, short[][] is_133_, boolean[] bools) {
		boolean[] bools_134_ = (class651 != null && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		method7346(class178, class651, class7, i, i_131_, -1287541105 * anInt4991, anInt4984 * -215635651, is_133_, is, is_132_, bools, -1635266119);
		aBool5061 = class651 != null && (-1082268879 * class651.anInt8383 != class651.anInt8386 * 99640975);
		if (!aBool5061) {
			for (int i_135_ = 0; i_135_ < 8; i_135_++) {
				if (anIntArray5049[i_135_] >= 0 && anIntArray5046[i_135_] != anIntArray5045[i_135_]) {
					aBool5061 = true;
					break;
				}
			}
		}
		if (!bools_134_[anInt5052 * 425193199 + 1 & 0x3]) {
			boolean[] bools_136_ = bools;
			int i_137_ = 1;
			bools_136_[i_137_] = (bools_136_[i_137_] | (anIntArray5032[2] & anIntArray5032[4]) == 0);
		}
		if (!bools_134_[425193199 * anInt5052 + 3 & 0x3]) {
			boolean[] bools_138_ = bools;
			int i_139_ = 3;
			bools_138_[i_139_] = bools_138_[i_139_] | 0 == (anIntArray5032[6] & anIntArray5032[0]);
		}
		if (!bools_134_[anInt5052 * 425193199 + 0 & 0x3]) {
			boolean[] bools_140_ = bools;
			int i_141_ = 0;
			bools_140_[i_141_] = bools_140_[i_141_] | 0 == (anIntArray5032[0] & anIntArray5032[2]);
		}
		if (!bools_134_[2 + anInt5052 * 425193199 & 0x3]) {
			boolean[] bools_142_ = bools;
			int i_143_ = 2;
			bools_142_[i_143_] = (bools_142_[i_143_] | (anIntArray5032[4] & anIntArray5032[6]) == 0);
		}
		if (!aBool5060 && (-366854495 * anInt5051 == 0 || anInt5051 * -366854495 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_144_ = bools;
				bools[3] = false;
				bools_144_[0] = false;
				anInt5051 = (anInt5051 * -366854495 == 0 ? 13 : 14) * -1873205919;
				anInt5052 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_145_ = bools;
				bools[1] = false;
				bools_145_[0] = false;
				anInt5051 = (0 == anInt5051 * -366854495 ? 13 : 14) * -1873205919;
				anInt5052 = 757399597;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_146_ = bools;
				bools[2] = false;
				bools_146_[1] = false;
				anInt5051 = -1873205919 * (anInt5051 * -366854495 == 0 ? 13 : 14);
				anInt5052 = 1936588830;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_147_ = bools;
				bools[3] = false;
				bools_147_[2] = false;
				anInt5051 = -1873205919 * (-366854495 * anInt5051 == 0 ? 13 : 14);
				anInt5052 = -1179189233;
			}
		}
	}

	void method7343(Class178 class178, int i, int i_148_, int i_149_, Class651 class651, boolean[] bools, int[] is, int[] is_150_, int[] is_151_, int[] is_152_, int[] is_153_, int[] is_154_, int[] is_155_, int[] is_156_, Class142 class142, Class142 class142_157_, Class142 class142_158_, int i_159_) {
		anInt5023 = -1041445097;
		anInt5055 = -17269097;
		anInt5056 = 1687558400;
		if (null != class651) {
			anInt5023 = -1630537831 * class651.anInt8383;
			anInt5055 = class651.anInt8394 * 1340203869;
			anInt5056 = 780116687 * class651.anInt8387;
			int i_160_ = Class386.method6456(class178, class651, 995988982);
			for (int i_161_ = 0; i_161_ < 613557105 * anInt5063; i_161_++) {
				boolean bool = false;
				int i_162_;
				if (bools[0 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_162_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[2]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_162_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anIntArray5009[1] == anInt5053 * -183625315) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_162_ = 6;
				} else if (bools[3 - anInt5052 * 425193199 & 0x3] && -183625315 * anInt5053 == anIntArray5009[3]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_162_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_162_ = 3;
				}
				for (int i_163_ = 0; i_163_ < i_162_; i_163_++) {
					int i_164_ = anIntArray5044[i_163_];
					int i_165_ = i_164_ - 850386398 * anInt5052 & 0x7;
					int i_166_ = anIntArray5027[i_164_];
					int i_167_ = anIntArray5028[i_164_];
					int i_168_;
					int i_169_;
					if (1 == 425193199 * anInt5052) {
						i_168_ = i_167_;
						i_169_ = 512 - i_166_;
					} else if (425193199 * anInt5052 == 2) {
						i_168_ = 512 - i_166_;
						i_169_ = 512 - i_167_;
					} else if (3 == anInt5052 * 425193199) {
						i_168_ = 512 - i_167_;
						i_169_ = i_166_;
					} else {
						i_168_ = i_166_;
						i_169_ = i_167_;
					}
					is_150_[1415532205 * anInt5054] = i_168_;
					is_151_[anInt5054 * 1415532205] = i_169_;
					if (null != is_155_ && (aBoolArrayArray5058[anInt5051 * -366854495][i_164_])) {
						int i_170_ = i_168_ + (i_148_ << 9);
						int i_171_ = i_169_ + (i_149_ << 9);
						is_155_[1415532205 * anInt5054] = (class142_157_.method2326(i_170_, i_171_, -1043391351) - class142.method2326(i_170_, i_171_, 445032642));
					}
					if (is_156_ != null) {
						if (class142_157_ != null && !(aBoolArrayArray5058[-366854495 * anInt5051][i_164_])) {
							int i_172_ = (i_148_ << 9) + i_168_;
							int i_173_ = i_169_ + (i_149_ << 9);
							is_156_[anInt5054 * 1415532205] = (class142.method2326(i_172_, i_173_, -955424290) - class142_157_.method2326(i_172_, i_173_, 1256457138));
						} else if (null != class142_158_ && !(aBoolArrayArray5064[-366854495 * anInt5051][i_164_])) {
							int i_174_ = (i_148_ << 9) + i_168_;
							int i_175_ = (i_149_ << 9) + i_169_;
							is_156_[1415532205 * anInt5054] = (class142_158_.method2326(i_174_, i_175_, 1239650387) - class142.method2326(i_174_, i_175_, 1647219715));
						}
					}
					if (i_164_ < 8 && (anIntArray5049[i_165_] > class651.anInt8385 * 486905283)) {
						if (null != is)
							is[anInt5054 * 1415532205] = anIntArray5046[i_165_];
						is_154_[anInt5054 * 1415532205] = anIntArray5048[i_165_];
						is_153_[anInt5054 * 1415532205] = anIntArray5047[i_165_];
						is_152_[1415532205 * anInt5054] = anIntArray5045[i_165_];
					} else {
						if (null != is)
							is[1415532205 * anInt5054] = i_160_;
						is_153_[anInt5054 * 1415532205] = class651.anInt8394 * 634101717;
						is_154_[1415532205 * anInt5054] = -576090841 * class651.anInt8387;
						is_152_[anInt5054 * 1415532205] = -1886607527 * anInt5023;
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (!aBool5022 && i == 0)
				aClass560_4983.method9263(i_148_, i_149_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, -134620943 * class651.anInt8388, class651.anInt8395 * 19373761, class651.anInt8396 * 2062212613, (byte) -2);
			if (anInt5051 * -366854495 != 12 && -1082268879 * class651.anInt8383 != -1 && class651.aBool8390)
				aBool4980 = true;
		} else if (aBool5000)
			anInt5053 += 1357132981 * anIntArray5021[anInt5051 * -366854495];
		else if (aBool5060)
			anInt5053 += 1357132981 * anIntArray5036[anInt5051 * -366854495];
		else
			anInt5053 += anIntArray5050[-366854495 * anInt5051] * 1357132981;
	}

	void method7344(Class178 class178, int i, int i_176_, int i_177_, int i_178_, int i_179_, Class7 class7, int i_180_, int i_181_, int i_182_, int i_183_, boolean[] bools, int[] is, int[] is_184_, int[] is_185_, int[] is_186_, int[] is_187_, int[] is_188_, int[] is_189_, int[] is_190_, int[][] is_191_, Class142 class142, Class142 class142_192_, Class142 class142_193_, int i_194_) {
		if (null != class7) {
			if (i_181_ == 0)
				i_181_ = i_180_;
			if (0 == i_182_)
				i_182_ = i_180_;
			if (i_183_ == 0)
				i_183_ = i_180_;
			Class7 class7_195_ = (Class7) aClass53_Sub5_4981.getDefinition(i_180_ - 1, (byte) -40);
			Class7 class7_196_ = (Class7) aClass53_Sub5_4981.getDefinition(i_181_ - 1, (byte) 28);
			Class7 class7_197_ = (Class7) aClass53_Sub5_4981.getDefinition(i_182_ - 1, (byte) -15);
			Class7 class7_198_ = (Class7) aClass53_Sub5_4981.getDefinition(i_183_ - 1, (byte) -37);
			for (int i_199_ = 0; i_199_ < anInt5062 * -461602405; i_199_++) {
				boolean bool = false;
				int i_200_;
				if (bools[0 - anInt5052 * 425193199 & 0x3] && anInt5053 * -183625315 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_200_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && anIntArray5009[2] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_200_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anInt5053 * -183625315 == anIntArray5009[1]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_200_ = 6;
				} else if (bools[3 - 425193199 * anInt5052 & 0x3] && anIntArray5009[3] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_200_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_200_ = 3;
				}
				for (int i_201_ = 0; i_201_ < i_200_; i_201_++) {
					int i_202_ = anIntArray5044[i_201_];
					int i_203_ = i_202_ - anInt5052 * 850386398 & 0x7;
					int i_204_ = anIntArray5027[i_202_];
					int i_205_ = anIntArray5028[i_202_];
					int i_206_;
					int i_207_;
					if (1 == anInt5052 * 425193199) {
						i_206_ = i_205_;
						i_207_ = 512 - i_204_;
					} else if (2 == 425193199 * anInt5052) {
						i_206_ = 512 - i_204_;
						i_207_ = 512 - i_205_;
					} else if (anInt5052 * 425193199 == 3) {
						i_206_ = 512 - i_205_;
						i_207_ = i_204_;
					} else {
						i_206_ = i_204_;
						i_207_ = i_205_;
					}
					is_184_[anInt5054 * 1415532205] = i_206_;
					is_185_[anInt5054 * 1415532205] = i_207_;
					if (null != is_189_ && (aBoolArrayArray5058[-366854495 * anInt5051][i_202_])) {
						int i_208_ = (i_176_ << 9) + i_206_;
						int i_209_ = i_207_ + (i_177_ << 9);
						is_189_[anInt5054 * 1415532205] = (class142_192_.method2326(i_208_, i_209_, -1279470064) - class142.method2326(i_208_, i_209_, 1442834530));
					}
					if (is_190_ != null) {
						if (null != class142_192_ && !(aBoolArrayArray5058[-366854495 * anInt5051][i_202_])) {
							int i_210_ = i_206_ + (i_176_ << 9);
							int i_211_ = (i_177_ << 9) + i_207_;
							is_190_[1415532205 * anInt5054] = (class142.method2326(i_210_, i_211_, 1005416521) - class142_192_.method2326(i_210_, i_211_, -1568730068));
						} else if (class142_193_ != null && !(aBoolArrayArray5064[-366854495 * anInt5051][i_202_])) {
							int i_212_ = i_206_ + (i_176_ << 9);
							int i_213_ = (i_177_ << 9) + i_207_;
							is_190_[1415532205 * anInt5054] = (class142_193_.method2326(i_212_, i_213_, 123990728) - class142.method2326(i_212_, i_213_, 1289922943));
						}
					}
					if (i_202_ < 8 && anIntArray5049[i_203_] >= 0) {
						if (is != null)
							is[1415532205 * anInt5054] = anIntArray5046[i_203_];
						is_188_[anInt5054 * 1415532205] = anIntArray5048[i_203_];
						is_187_[anInt5054 * 1415532205] = anIntArray5047[i_203_];
						is_186_[anInt5054 * 1415532205] = anIntArray5045[i_203_];
					} else {
						if (aBool5060 && (aBoolArrayArray5058[anInt5051 * -366854495][i_202_])) {
							is_187_[anInt5054 * 1415532205] = -74375463 * anInt5055;
							is_188_[1415532205 * anInt5054] = 679896617 * anInt5056;
							is_186_[1415532205 * anInt5054] = -1886607527 * anInt5023;
						} else if (i_206_ == 0 && 0 == i_207_) {
							is_186_[1415532205 * anInt5054] = is_191_[i_176_][i_177_];
							is_187_[1415532205 * anInt5054] = class7_195_.anInt56 * -609411693;
							is_188_[anInt5054 * 1415532205] = 424256487 * class7_195_.anInt49;
						} else if (i_206_ == 0 && i_207_ == 512) {
							is_186_[anInt5054 * 1415532205] = is_191_[i_176_][i_179_];
							is_187_[1415532205 * anInt5054] = class7_196_.anInt56 * -609411693;
							is_188_[1415532205 * anInt5054] = class7_196_.anInt49 * 424256487;
						} else if (512 == i_206_ && 512 == i_207_) {
							is_186_[1415532205 * anInt5054] = is_191_[i_178_][i_179_];
							is_187_[anInt5054 * 1415532205] = -609411693 * class7_197_.anInt56;
							is_188_[anInt5054 * 1415532205] = class7_197_.anInt49 * 424256487;
						} else if (512 == i_206_ && i_207_ == 0) {
							is_186_[1415532205 * anInt5054] = is_191_[i_178_][i_177_];
							is_187_[1415532205 * anInt5054] = -609411693 * class7_198_.anInt56;
							is_188_[1415532205 * anInt5054] = 424256487 * class7_198_.anInt49;
						} else {
							if (i_206_ < 256) {
								if (i_207_ < 256) {
									is_187_[anInt5054 * 1415532205] = -609411693 * class7_195_.anInt56;
									is_188_[anInt5054 * 1415532205] = class7_195_.anInt49 * 424256487;
								} else {
									is_187_[1415532205 * anInt5054] = -609411693 * class7_196_.anInt56;
									is_188_[1415532205 * anInt5054] = 424256487 * class7_196_.anInt49;
								}
							} else if (i_207_ < 256) {
								is_187_[anInt5054 * 1415532205] = class7_198_.anInt56 * -609411693;
								is_188_[1415532205 * anInt5054] = class7_198_.anInt49 * 424256487;
							} else {
								is_187_[1415532205 * anInt5054] = -609411693 * class7_197_.anInt56;
								is_188_[1415532205 * anInt5054] = class7_197_.anInt49 * 424256487;
							}
							int i_214_ = Class102.method1799(is_191_[i_176_][i_177_], is_191_[i_178_][i_177_], i_206_ << 7 >> 9, 1936940224);
							int i_215_ = Class102.method1799(is_191_[i_176_][i_179_], is_191_[i_178_][i_179_], i_206_ << 7 >> 9, 1097630078);
							is_186_[1415532205 * anInt5054] = Class102.method1799(i_214_, i_215_, i_207_ << 7 >> 9, 768173461);
						}
						if (is != null)
							is[1415532205 * anInt5054] = is_186_[anInt5054 * 1415532205];
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (0 != anInt5051 * -366854495 && class7.aBool52)
				aBool4980 = true;
		}
	}

	void method7345(Class142 class142, Class7 class7, Class651 class651, int i, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, byte i_222_) {
		int i_223_ = class142.method2321(i_216_, i_217_, 1942805889);
		int i_224_ = class142.method2321(i_218_, i_217_, 2017288162);
		int i_225_ = class142.method2321(i_218_, i_219_, 1888091239);
		int i_226_ = class142.method2321(i_216_, i_219_, 1641123158);
		boolean bool = aClass451_4982.method7282(i_216_, i_217_, -638715901);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_227_ = true;
			if (null != class7 && !class7.aBool53)
				bool_227_ = false;
			else if (i_220_ == 0 && anInt5051 * -366854495 != 0)
				bool_227_ = false;
			else if (i_221_ > 0 && null != class651 && !class651.aBool8382)
				bool_227_ = false;
			if (bool_227_ && i_224_ == i_223_ && i_225_ == i_223_ && i_223_ == i_226_)
				aByteArrayArrayArray5001[i][i_216_][i_217_] |= 0x4;
		}
	}

	final void method7346(Class178 class178, Class651 class651, Class7 class7, int i, int i_228_, int i_229_, int i_230_, short[][] is, byte[][] is_231_, byte[][] is_232_, boolean[] bools, int i_233_) {
		boolean[] bools_234_ = (null != class651 && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		if (i_228_ > 0) {
			if (i > 0) {
				int i_235_ = is[i - 1][i_228_ - 1] & 0x7fff;
				if (i_235_ > 0) {
					Class651 class651_236_ = (Class651) aClass53_Sub12_5006.getDefinition(i_235_ - 1, (byte) 114);
					if (-1 != class651_236_.anInt8383 * -1082268879 && class651_236_.aBool8381) {
						byte i_237_ = is_231_[i - 1][i_228_ - 1];
						int i_238_ = 4 + 2 * is_232_[i - 1][i_228_ - 1] & 0x7;
						int i_239_ = Class386.method6456(class178, class651_236_, 699524955);
						if (aBoolArrayArray5058[i_237_][i_238_]) {
							anIntArray5045[0] = -1082268879 * class651_236_.anInt8383;
							anIntArray5046[0] = i_239_;
							anIntArray5047[0] = class651_236_.anInt8394 * 634101717;
							anIntArray5048[0] = class651_236_.anInt8387 * -576090841;
							anIntArray5049[0] = class651_236_.anInt8385 * 486905283;
							anIntArray5032[0] = 256;
						}
					}
				}
			}
			if (i < i_229_ - 1) {
				int i_240_ = is[1 + i][i_228_ - 1] & 0x7fff;
				if (i_240_ > 0) {
					Class651 class651_241_ = (Class651) aClass53_Sub12_5006.getDefinition(i_240_ - 1, (byte) -89);
					if (-1082268879 * class651_241_.anInt8383 != -1 && class651_241_.aBool8381) {
						byte i_242_ = is_231_[i + 1][i_228_ - 1];
						int i_243_ = 2 * is_232_[1 + i][i_228_ - 1] + 6 & 0x7;
						int i_244_ = Class386.method6456(class178, class651_241_, -305456891);
						if (aBoolArrayArray5058[i_242_][i_243_]) {
							anIntArray5045[2] = class651_241_.anInt8383 * -1082268879;
							anIntArray5046[2] = i_244_;
							anIntArray5047[2] = 634101717 * class651_241_.anInt8394;
							anIntArray5048[2] = class651_241_.anInt8387 * -576090841;
							anIntArray5049[2] = class651_241_.anInt8385 * 486905283;
							anIntArray5032[2] = 512;
						}
					}
				}
			}
		}
		if (i_228_ < i_230_ - 1) {
			if (i > 0) {
				int i_245_ = is[i - 1][i_228_ + 1] & 0x7fff;
				if (i_245_ > 0) {
					Class651 class651_246_ = (Class651) aClass53_Sub12_5006.getDefinition(i_245_ - 1, (byte) 15);
					if (-1082268879 * class651_246_.anInt8383 != -1 && class651_246_.aBool8381) {
						byte i_247_ = is_231_[i - 1][1 + i_228_];
						int i_248_ = 2 + is_232_[i - 1][1 + i_228_] * 2 & 0x7;
						int i_249_ = Class386.method6456(class178, class651_246_, -302018431);
						if (aBoolArrayArray5058[i_247_][i_248_]) {
							anIntArray5045[6] = class651_246_.anInt8383 * -1082268879;
							anIntArray5046[6] = i_249_;
							anIntArray5047[6] = class651_246_.anInt8394 * 634101717;
							anIntArray5048[6] = class651_246_.anInt8387 * -576090841;
							anIntArray5049[6] = class651_246_.anInt8385 * 486905283;
							anIntArray5032[6] = 64;
						}
					}
				}
			}
			if (i < i_229_ - 1) {
				int i_250_ = is[1 + i][i_228_ + 1] & 0x7fff;
				if (i_250_ > 0) {
					Class651 class651_251_ = (Class651) aClass53_Sub12_5006.getDefinition(i_250_ - 1, (byte) 39);
					if (class651_251_.anInt8383 * -1082268879 != -1 && class651_251_.aBool8381) {
						byte i_252_ = is_231_[1 + i][i_228_ + 1];
						int i_253_ = 0 + is_232_[1 + i][i_228_ + 1] * 2 & 0x7;
						int i_254_ = Class386.method6456(class178, class651_251_, 2141470262);
						if (aBoolArrayArray5058[i_252_][i_253_]) {
							anIntArray5045[4] = class651_251_.anInt8383 * -1082268879;
							anIntArray5046[4] = i_254_;
							anIntArray5047[4] = 634101717 * class651_251_.anInt8394;
							anIntArray5048[4] = -576090841 * class651_251_.anInt8387;
							anIntArray5049[4] = class651_251_.anInt8385 * 486905283;
							anIntArray5032[4] = 128;
						}
					}
				}
			}
		}
		if (i_228_ > 0) {
			int i_255_ = is[i][i_228_ - 1] & 0x7fff;
			if (i_255_ > 0) {
				Class651 class651_256_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_255_ - 1, (byte) -96));
				if (-1082268879 * class651_256_.anInt8383 != -1) {
					byte i_257_ = is_231_[i][i_228_ - 1];
					int i_258_ = is_232_[i][i_228_ - 1];
					if (class651_256_.aBool8381) {
						int i_259_ = 2;
						int i_260_ = 2 * i_258_ + 4;
						int i_261_ = Class386.method6456(class178, class651_256_, -1846054767);
						for (int i_262_ = 0; i_262_ < 3; i_262_++) {
							i_260_ &= 0x7;
							i_259_ &= 0x7;
							if (aBoolArrayArray5058[i_257_][i_260_] && (anIntArray5049[i_259_] <= 486905283 * class651_256_.anInt8385)) {
								anIntArray5045[i_259_] = class651_256_.anInt8383 * -1082268879;
								anIntArray5046[i_259_] = i_261_;
								anIntArray5047[i_259_] = class651_256_.anInt8394 * 634101717;
								anIntArray5048[i_259_] = -576090841 * class651_256_.anInt8387;
								if (anIntArray5049[i_259_] == class651_256_.anInt8385 * 486905283)
									anIntArray5032[i_259_] |= 0x20;
								else
									anIntArray5032[i_259_] = 32;
								anIntArray5049[i_259_] = class651_256_.anInt8385 * 486905283;
							}
							i_260_++;
							i_259_--;
						}
						if (!bools_234_[425193199 * anInt5052 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5026[i_257_][2 + i_258_ & 0x3]);
					} else if (!bools_234_[0 + anInt5052 * 425193199 & 0x3])
						bools[0] = aBoolArrayArray5034[i_257_][2 + i_258_ & 0x3];
				}
			}
		}
		if (i_228_ < i_230_ - 1) {
			int i_263_ = is[i][i_228_ + 1] & 0x7fff;
			if (i_263_ > 0) {
				Class651 class651_264_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_263_ - 1, (byte) 14));
				if (-1 != -1082268879 * class651_264_.anInt8383) {
					byte i_265_ = is_231_[i][1 + i_228_];
					int i_266_ = is_232_[i][i_228_ + 1];
					if (class651_264_.aBool8381) {
						int i_267_ = 4;
						int i_268_ = i_266_ * 2 + 2;
						int i_269_ = Class386.method6456(class178, class651_264_, -1449038652);
						for (int i_270_ = 0; i_270_ < 3; i_270_++) {
							i_268_ &= 0x7;
							i_267_ &= 0x7;
							if (aBoolArrayArray5058[i_265_][i_268_] && (anIntArray5049[i_267_] <= class651_264_.anInt8385 * 486905283)) {
								anIntArray5045[i_267_] = class651_264_.anInt8383 * -1082268879;
								anIntArray5046[i_267_] = i_269_;
								anIntArray5047[i_267_] = class651_264_.anInt8394 * 634101717;
								anIntArray5048[i_267_] = class651_264_.anInt8387 * -576090841;
								if (anIntArray5049[i_267_] == class651_264_.anInt8385 * 486905283)
									anIntArray5032[i_267_] |= 0x10;
								else
									anIntArray5032[i_267_] = 16;
								anIntArray5049[i_267_] = class651_264_.anInt8385 * 486905283;
							}
							i_268_--;
							i_267_++;
						}
						if (!bools_234_[2 + 425193199 * anInt5052 & 0x3])
							bools[2] = (aBoolArrayArray5026[i_265_][0 + i_266_ & 0x3]);
					} else if (!bools_234_[2 + 425193199 * anInt5052 & 0x3])
						bools[2] = aBoolArrayArray5034[i_265_][0 + i_266_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_271_ = is[i - 1][i_228_] & 0x7fff;
			if (i_271_ > 0) {
				Class651 class651_272_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_271_ - 1, (byte) 81));
				if (-1 != -1082268879 * class651_272_.anInt8383) {
					byte i_273_ = is_231_[i - 1][i_228_];
					int i_274_ = is_232_[i - 1][i_228_];
					if (class651_272_.aBool8381) {
						int i_275_ = 6;
						int i_276_ = i_274_ * 2 + 4;
						int i_277_ = Class386.method6456(class178, class651_272_, -1529204070);
						for (int i_278_ = 0; i_278_ < 3; i_278_++) {
							i_276_ &= 0x7;
							i_275_ &= 0x7;
							if (aBoolArrayArray5058[i_273_][i_276_] && (anIntArray5049[i_275_] <= class651_272_.anInt8385 * 486905283)) {
								anIntArray5045[i_275_] = -1082268879 * class651_272_.anInt8383;
								anIntArray5046[i_275_] = i_277_;
								anIntArray5047[i_275_] = 634101717 * class651_272_.anInt8394;
								anIntArray5048[i_275_] = -576090841 * class651_272_.anInt8387;
								if (anIntArray5049[i_275_] == class651_272_.anInt8385 * 486905283)
									anIntArray5032[i_275_] |= 0x8;
								else
									anIntArray5032[i_275_] = 8;
								anIntArray5049[i_275_] = class651_272_.anInt8385 * 486905283;
							}
							i_276_--;
							i_275_++;
						}
						if (!bools_234_[3 + anInt5052 * 425193199 & 0x3])
							bools[3] = (aBoolArrayArray5026[i_273_][1 + i_274_ & 0x3]);
					} else if (!bools_234_[425193199 * anInt5052 + 3 & 0x3])
						bools[3] = aBoolArrayArray5034[i_273_][i_274_ + 1 & 0x3];
				}
			}
		}
		if (i < i_229_ - 1) {
			int i_279_ = is[i + 1][i_228_] & 0x7fff;
			if (i_279_ > 0) {
				Class651 class651_280_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_279_ - 1, (byte) -62));
				if (-1 != class651_280_.anInt8383 * -1082268879) {
					byte i_281_ = is_231_[i + 1][i_228_];
					int i_282_ = is_232_[1 + i][i_228_];
					if (class651_280_.aBool8381) {
						int i_283_ = 4;
						int i_284_ = 2 * i_282_ + 6;
						int i_285_ = Class386.method6456(class178, class651_280_, -1132635626);
						for (int i_286_ = 0; i_286_ < 3; i_286_++) {
							i_284_ &= 0x7;
							i_283_ &= 0x7;
							if (aBoolArrayArray5058[i_281_][i_284_] && (anIntArray5049[i_283_] <= 486905283 * class651_280_.anInt8385)) {
								anIntArray5045[i_283_] = class651_280_.anInt8383 * -1082268879;
								anIntArray5046[i_283_] = i_285_;
								anIntArray5047[i_283_] = class651_280_.anInt8394 * 634101717;
								anIntArray5048[i_283_] = class651_280_.anInt8387 * -576090841;
								if (anIntArray5049[i_283_] == 486905283 * class651_280_.anInt8385)
									anIntArray5032[i_283_] |= 0x4;
								else
									anIntArray5032[i_283_] = 4;
								anIntArray5049[i_283_] = class651_280_.anInt8385 * 486905283;
							}
							i_284_++;
							i_283_--;
						}
						if (!bools_234_[anInt5052 * 425193199 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5026[i_281_][3 + i_282_ & 0x3]);
					} else if (!bools_234_[425193199 * anInt5052 + 1 & 0x3])
						bools[1] = aBoolArrayArray5034[i_281_][3 + i_282_ & 0x3];
				}
			}
		}
		if (null != class651 && class651.aBool8381) {
			int i_287_ = Class386.method6456(class178, class651, 1229466233);
			for (int i_288_ = 0; i_288_ < 8; i_288_++) {
				int i_289_ = i_288_ - anInt5052 * 850386398 & 0x7;
				if (aBoolArrayArray5058[-366854495 * anInt5051][i_288_] && (anIntArray5049[i_289_] <= 486905283 * class651.anInt8385)) {
					anIntArray5045[i_289_] = class651.anInt8383 * -1082268879;
					anIntArray5046[i_289_] = i_287_;
					anIntArray5047[i_289_] = class651.anInt8394 * 634101717;
					anIntArray5048[i_289_] = -576090841 * class651.anInt8387;
					if (anIntArray5049[i_289_] == class651.anInt8385 * 486905283)
						anIntArray5032[i_289_] |= 0x2;
					else
						anIntArray5032[i_289_] = 2;
					anIntArray5049[i_289_] = class651.anInt8385 * 486905283;
				}
			}
		}
	}

	static {
		anIntArray4996 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		anIntArray5050 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray5024 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray5036 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray5025 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray5027 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray5028 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray5058 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBoolArrayArray5064 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray5031 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray5019 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray5016 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray5034 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray5035 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray5067 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray5037 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray4993 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray5026 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray5040 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray5041 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray5042 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray5043 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	public void method7347() {
		aBool4994 = true;
	}

	public void method7348() {
		aBool4994 = true;
	}

	void method7349(Class178 class178, int i, int i_290_, int i_291_, int i_292_, int i_293_, Class7 class7, int i_294_, int i_295_, int i_296_, int i_297_, boolean[] bools, int[] is, int[] is_298_, int[] is_299_, int[] is_300_, int[] is_301_, int[] is_302_, int[] is_303_, int[] is_304_, int[][] is_305_, Class142 class142, Class142 class142_306_, Class142 class142_307_) {
		if (null != class7) {
			if (i_295_ == 0)
				i_295_ = i_294_;
			if (0 == i_296_)
				i_296_ = i_294_;
			if (i_297_ == 0)
				i_297_ = i_294_;
			Class7 class7_308_ = (Class7) aClass53_Sub5_4981.getDefinition(i_294_ - 1, (byte) 37);
			Class7 class7_309_ = (Class7) aClass53_Sub5_4981.getDefinition(i_295_ - 1, (byte) -11);
			Class7 class7_310_ = (Class7) aClass53_Sub5_4981.getDefinition(i_296_ - 1, (byte) 9);
			Class7 class7_311_ = (Class7) aClass53_Sub5_4981.getDefinition(i_297_ - 1, (byte) -85);
			for (int i_312_ = 0; i_312_ < anInt5062 * -461602405; i_312_++) {
				boolean bool = false;
				int i_313_;
				if (bools[0 - anInt5052 * 425193199 & 0x3] && anInt5053 * -183625315 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_313_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && anIntArray5009[2] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_313_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anInt5053 * -183625315 == anIntArray5009[1]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_313_ = 6;
				} else if (bools[3 - 425193199 * anInt5052 & 0x3] && anIntArray5009[3] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_313_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_313_ = 3;
				}
				for (int i_314_ = 0; i_314_ < i_313_; i_314_++) {
					int i_315_ = anIntArray5044[i_314_];
					int i_316_ = i_315_ - anInt5052 * 850386398 & 0x7;
					int i_317_ = anIntArray5027[i_315_];
					int i_318_ = anIntArray5028[i_315_];
					int i_319_;
					int i_320_;
					if (1 == anInt5052 * 425193199) {
						i_319_ = i_318_;
						i_320_ = 512 - i_317_;
					} else if (2 == 425193199 * anInt5052) {
						i_319_ = 512 - i_317_;
						i_320_ = 512 - i_318_;
					} else if (anInt5052 * 425193199 == 3) {
						i_319_ = 512 - i_318_;
						i_320_ = i_317_;
					} else {
						i_319_ = i_317_;
						i_320_ = i_318_;
					}
					is_298_[anInt5054 * 1415532205] = i_319_;
					is_299_[anInt5054 * 1415532205] = i_320_;
					if (null != is_303_ && (aBoolArrayArray5058[-366854495 * anInt5051][i_315_])) {
						int i_321_ = (i_290_ << 9) + i_319_;
						int i_322_ = i_320_ + (i_291_ << 9);
						is_303_[anInt5054 * 1415532205] = (class142_306_.method2326(i_321_, i_322_, -1387672905) - class142.method2326(i_321_, i_322_, -1323197321));
					}
					if (is_304_ != null) {
						if (null != class142_306_ && !(aBoolArrayArray5058[-366854495 * anInt5051][i_315_])) {
							int i_323_ = i_319_ + (i_290_ << 9);
							int i_324_ = (i_291_ << 9) + i_320_;
							is_304_[1415532205 * anInt5054] = (class142.method2326(i_323_, i_324_, 1206206815) - class142_306_.method2326(i_323_, i_324_, 137145128));
						} else if (class142_307_ != null && !(aBoolArrayArray5064[-366854495 * anInt5051][i_315_])) {
							int i_325_ = i_319_ + (i_290_ << 9);
							int i_326_ = (i_291_ << 9) + i_320_;
							is_304_[1415532205 * anInt5054] = (class142_307_.method2326(i_325_, i_326_, -939984112) - class142.method2326(i_325_, i_326_, -840895768));
						}
					}
					if (i_315_ < 8 && anIntArray5049[i_316_] >= 0) {
						if (is != null)
							is[1415532205 * anInt5054] = anIntArray5046[i_316_];
						is_302_[anInt5054 * 1415532205] = anIntArray5048[i_316_];
						is_301_[anInt5054 * 1415532205] = anIntArray5047[i_316_];
						is_300_[anInt5054 * 1415532205] = anIntArray5045[i_316_];
					} else {
						if (aBool5060 && (aBoolArrayArray5058[anInt5051 * -366854495][i_315_])) {
							is_301_[anInt5054 * 1415532205] = -74375463 * anInt5055;
							is_302_[1415532205 * anInt5054] = 679896617 * anInt5056;
							is_300_[1415532205 * anInt5054] = -1886607527 * anInt5023;
						} else if (i_319_ == 0 && 0 == i_320_) {
							is_300_[1415532205 * anInt5054] = is_305_[i_290_][i_291_];
							is_301_[1415532205 * anInt5054] = class7_308_.anInt56 * -609411693;
							is_302_[anInt5054 * 1415532205] = 424256487 * class7_308_.anInt49;
						} else if (i_319_ == 0 && i_320_ == 512) {
							is_300_[anInt5054 * 1415532205] = is_305_[i_290_][i_293_];
							is_301_[1415532205 * anInt5054] = class7_309_.anInt56 * -609411693;
							is_302_[1415532205 * anInt5054] = class7_309_.anInt49 * 424256487;
						} else if (512 == i_319_ && 512 == i_320_) {
							is_300_[1415532205 * anInt5054] = is_305_[i_292_][i_293_];
							is_301_[anInt5054 * 1415532205] = -609411693 * class7_310_.anInt56;
							is_302_[anInt5054 * 1415532205] = class7_310_.anInt49 * 424256487;
						} else if (512 == i_319_ && i_320_ == 0) {
							is_300_[1415532205 * anInt5054] = is_305_[i_292_][i_291_];
							is_301_[1415532205 * anInt5054] = -609411693 * class7_311_.anInt56;
							is_302_[1415532205 * anInt5054] = 424256487 * class7_311_.anInt49;
						} else {
							if (i_319_ < 256) {
								if (i_320_ < 256) {
									is_301_[anInt5054 * 1415532205] = -609411693 * class7_308_.anInt56;
									is_302_[anInt5054 * 1415532205] = class7_308_.anInt49 * 424256487;
								} else {
									is_301_[1415532205 * anInt5054] = -609411693 * class7_309_.anInt56;
									is_302_[1415532205 * anInt5054] = 424256487 * class7_309_.anInt49;
								}
							} else if (i_320_ < 256) {
								is_301_[anInt5054 * 1415532205] = class7_311_.anInt56 * -609411693;
								is_302_[1415532205 * anInt5054] = class7_311_.anInt49 * 424256487;
							} else {
								is_301_[1415532205 * anInt5054] = -609411693 * class7_310_.anInt56;
								is_302_[1415532205 * anInt5054] = class7_310_.anInt49 * 424256487;
							}
							int i_327_ = Class102.method1799(is_305_[i_290_][i_291_], is_305_[i_292_][i_291_], i_319_ << 7 >> 9, 1811069784);
							int i_328_ = Class102.method1799(is_305_[i_290_][i_293_], is_305_[i_292_][i_293_], i_319_ << 7 >> 9, 1994871222);
							is_300_[1415532205 * anInt5054] = Class102.method1799(i_327_, i_328_, i_320_ << 7 >> 9, -1207343340);
						}
						if (is != null)
							is[1415532205 * anInt5054] = is_300_[anInt5054 * 1415532205];
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (0 != anInt5051 * -366854495 && class7.aBool52)
				aBool4980 = true;
		}
	}

	public void method7350() {
		aBool4994 = true;
	}

	public void method7351() {
		anIntArray5059 = null;
		anIntArray5003 = null;
		anIntArray5004 = null;
		anIntArray5005 = null;
		anIntArray5029 = null;
		aBool4994 = false;
	}

	static final int method7352(int i, int i_329_) {
		int i_330_ = 57 * i_329_ + i;
		i_330_ = i_330_ << 13 ^ i_330_;
		int i_331_ = (1376312589 + (789221 + 15731 * (i_330_ * i_330_)) * i_330_ & 0x7fffffff);
		return i_331_ >> 19 & 0xff;
	}

	public void method7353(byte i) {
		aBool4994 = true;
	}

	void method7354(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_332_, Class142 class142_333_) {
		byte[][] is_334_ = aByteArrayArrayArray4997[i];
		byte[][] is_335_ = aByteArrayArrayArray4998[i];
		short[][] is_336_ = aShortArrayArrayArray5057[i];
		short[][] is_337_ = aShortArrayArrayArray5013[i];
		boolean[] bools = new boolean[4];
		for (int i_338_ = 0; i_338_ < -1287541105 * anInt4991; i_338_++) {
			int i_339_ = i_338_ < -1287541105 * anInt4991 - 1 ? i_338_ + 1 : i_338_;
			for (int i_340_ = 0; i_340_ < anInt4984 * -215635651; i_340_++) {
				int i_341_ = (i_340_ < anInt4984 * -215635651 - 1 ? 1 + i_340_ : i_340_);
				anInt5051 = is_334_[i_338_][i_340_] * -1873205919;
				anInt5052 = -1179189233 * is_335_[i_338_][i_340_];
				int i_342_ = is_337_[i_338_][i_340_] & 0x7fff;
				int i_343_ = is_336_[i_338_][i_340_] & 0x7fff;
				if (i_342_ != 0 || 0 != i_343_) {
					Class651 class651 = ((Class651) (0 != i_342_ ? aClass53_Sub12_5006.getDefinition(i_342_ - 1, (byte) -33) : null));
					Class7 class7 = (Class7) (i_343_ != 0 ? aClass53_Sub5_4981.getDefinition(i_343_ - 1, (byte) 80) : null);
					if (-366854495 * anInt5051 == 0 && null == class651)
						anInt5051 = -1003634548;
					aBool4980 = false;
					aBool5060 = false;
					boolean[] bools_344_ = bools;
					boolean[] bools_345_ = bools;
					boolean[] bools_346_ = bools;
					bools[3] = false;
					bools_346_[2] = false;
					bools_345_[1] = false;
					bools_344_[0] = false;
					Class651 class651_347_ = class651;
					if (class651 != null) {
						if (-1 == -1082268879 * class651.anInt8383 && 99640975 * class651.anInt8386 == -1) {
							class651_347_ = class651;
							class651 = null;
						} else if (class7 != null && 0 != -366854495 * anInt5051)
							aBool5060 = class651.aBool8381;
					}
					anInt5052 = method7340(i_343_, i_338_, i_340_, i_339_, i_341_, class142, is_336_, (byte) 35) * -1179189233;
					for (int i_348_ = 0; i_348_ < 13; i_348_++) {
						anIntArray5049[i_348_] = -1;
						anIntArray5032[i_348_] = 1;
					}
					method7341(class178, class651, class7, i_338_, i_340_, is_334_, is_335_, is_337_, bools, (byte) 42);
					aBool5000 = (!aBool5060 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method7398(class651, class7, -836251761);
					int i_349_ = anInt5063 * 613557105 + -461602405 * anInt5062;
					if (i_349_ <= 0)
						aClass560_4983.method9330(i, i_338_, i_340_, (byte) 4);
					else {
						if (bools[0])
							i_349_++;
						if (bools[2])
							i_349_++;
						if (bools[1])
							i_349_++;
						if (bools[3])
							i_349_++;
						anInt5053 = 0;
						anInt5054 = 0;
						int i_350_ = i_349_ * 3;
						int[] is_351_ = aBool5061 ? new int[i_350_] : null;
						int[] is_352_ = new int[i_350_];
						int[] is_353_ = new int[i_350_];
						int[] is_354_ = new int[i_350_];
						int[] is_355_ = new int[i_350_];
						int[] is_356_ = new int[i_350_];
						int[] is_357_ = null != class142_333_ ? new int[i_350_] : null;
						int[] is_358_ = (null != class142_333_ || null != class142_332_ ? new int[i_350_] : null);
						for (int i_359_ = 0; i_359_ < i_350_; i_359_++)
							is_355_[i_359_] = -1;
						method7343(class178, i, i_338_, i_340_, class651, bools, is_351_, is_352_, is_353_, is_354_, is_355_, is_356_, is_357_, is_358_, class142, class142_333_, class142_332_, -1992577023);
						int i_360_ = is_336_[i_338_][i_341_] & 0x7fff;
						int i_361_ = is_336_[i_339_][i_341_] & 0x7fff;
						int i_362_ = is_336_[i_339_][i_340_] & 0x7fff;
						method7344(class178, i, i_338_, i_340_, i_339_, i_341_, class7, i_343_, i_360_, i_361_, i_362_, bools, is_351_, is_352_, is_353_, is_354_, is_355_, is_356_, is_357_, is_358_, is, class142, class142_333_, class142_332_, 919286051);
						method7345(class142, class7, class651_347_, i, i_338_, i_340_, i_339_, i_341_, i_343_, i_342_, (byte) 1);
						Class163 class163 = new Class163();
						if (aBool5022) {
							class163.anInt1776 = (aClass560_4983.method9258(i_338_, i_340_, (byte) 75) * -780986409);
							class163.anInt1775 = (aClass560_4983.method9254(i_338_, i_340_, 16711935) * 2053161261);
							class163.anInt1774 = (aClass560_4983.method9301(i_338_, i_340_, 65535) * 1512945865);
							class163.anInt1778 = (aClass560_4983.method9260(i_338_, i_340_, (short) -23634) * -923094865);
							class163.anInt1777 = (aClass560_4983.method9261(i_338_, i_340_, (short) -10841) * -320151975);
							class163.anInt1773 = aClass560_4983.method9329(i_338_, i_340_, 40000) * -58453511;
						}
						class142.method2351(i_338_, i_340_, is_352_, is_357_, is_353_, is_358_, is_354_, is_351_, is_355_, is_356_, class163, aBool4980);
						aClass560_4983.method9330(i, i_338_, i_340_, (byte) 4);
					}
				}
			}
		}
	}

	public final void method7355(Class523_Sub34 class523_sub34, int i, int i_363_, int i_364_, int i_365_) {
		int i_366_ = i + i_364_;
		int i_367_ = i_363_ + i_365_;
		for (int i_368_ = 0; i_368_ < anInt4990 * 1248554419; i_368_++) {
			for (int i_369_ = 0; i_369_ < 64; i_369_++) {
				for (int i_370_ = 0; i_370_ < 64; i_370_++)
					method7334(class523_sub34, i_368_, i_369_ + i, i_370_ + i_363_, 0, 0, i_369_ + i_366_, i_367_ + i_370_, 0, false, -1198603712);
			}
		}
	}

	public final void method7356(Class523_Sub34 class523_sub34, int i, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, int i_376_, byte i_377_) {
		int i_378_ = 8 * (i_374_ & 0x7);
		int i_379_ = 8 * (i_375_ & 0x7);
		int i_380_ = (i_374_ & ~0x7) << 3;
		int i_381_ = (i_375_ & ~0x7) << 3;
		int i_382_ = 0;
		int i_383_ = 0;
		if (1 == i_376_)
			i_383_ = 1;
		else if (i_376_ == 2) {
			i_382_ = 1;
			i_383_ = 1;
		} else if (3 == i_376_)
			i_382_ = 1;
		for (int i_384_ = 0; i_384_ < anInt4990 * 1248554419; i_384_++) {
			for (int i_385_ = 0; i_385_ < 64; i_385_++) {
				for (int i_386_ = 0; i_386_ < 64; i_386_++) {
					if (i_384_ == i_373_ && i_385_ >= i_378_ && i_385_ <= 8 + i_378_ && i_386_ >= i_379_ && i_386_ <= 8 + i_379_) {
						int i_387_;
						int i_388_;
						if (i_385_ == i_378_ + 8 || i_386_ == i_379_ + 8) {
							if (0 == i_376_) {
								i_387_ = i_371_ + (i_385_ - i_378_);
								i_388_ = i_386_ - i_379_ + i_372_;
							} else if (1 == i_376_) {
								i_387_ = i_386_ - i_379_ + i_371_;
								i_388_ = i_372_ + 8 - (i_385_ - i_378_);
							} else if (i_376_ == 2) {
								i_387_ = 8 + i_371_ - (i_385_ - i_378_);
								i_388_ = 8 + i_372_ - (i_386_ - i_379_);
							} else {
								i_387_ = 8 + i_371_ - (i_386_ - i_379_);
								i_388_ = i_372_ + (i_385_ - i_378_);
							}
							method7334(class523_sub34, i, i_387_, i_388_, 0, 0, i_385_ + i_380_, i_381_ + i_386_, 0, true, 1247465516);
						} else {
							i_387_ = i_371_ + Class283.method5136(i_385_ & 0x7, i_386_ & 0x7, i_376_, (byte) 0);
							i_388_ = i_372_ + Class412.method6646(i_385_ & 0x7, i_386_ & 0x7, i_376_, 1972612179);
							method7334(class523_sub34, i, i_387_, i_388_, i_382_, i_383_, i_385_ + i_380_, i_381_ + i_386_, i_376_, false, -96953604);
						}
						if (i_385_ == 63 || i_386_ == 63) {
							int i_389_ = 1;
							if (i_385_ == 63 && i_386_ == 63)
								i_389_ = 3;
							for (int i_390_ = 0; i_390_ < i_389_; i_390_++) {
								int i_391_ = i_385_;
								int i_392_ = i_386_;
								if (i_390_ == 0) {
									i_391_ = 63 == i_385_ ? 64 : i_385_;
									i_392_ = 63 == i_386_ ? 64 : i_386_;
								} else if (1 == i_390_)
									i_391_ = 64;
								else if (2 == i_390_)
									i_392_ = 64;
								int i_393_;
								int i_394_;
								if (0 == i_376_) {
									i_393_ = i_371_ + (i_391_ - i_378_);
									i_394_ = i_392_ - i_379_ + i_372_;
								} else if (1 == i_376_) {
									i_393_ = i_371_ + (i_392_ - i_379_);
									i_394_ = 8 + i_372_ - (i_391_ - i_378_);
								} else if (2 == i_376_) {
									i_393_ = 8 + i_371_ - (i_391_ - i_378_);
									i_394_ = i_372_ + 8 - (i_392_ - i_379_);
								} else {
									i_393_ = 8 + i_371_ - (i_392_ - i_379_);
									i_394_ = i_372_ + (i_391_ - i_378_);
								}
								if (i_393_ >= 0 && i_393_ < -1287541105 * anInt4991 && i_394_ >= 0 && i_394_ < -215635651 * anInt4984)
									anIntArrayArrayArray5033[i][i_393_][i_394_] = (anIntArrayArrayArray5033[i][i_387_ + i_382_][i_388_ + i_383_]);
							}
						}
					} else
						method7334(class523_sub34, 0, -1, -1, 0, 0, 0, 0, 0, false, -1189579752);
				}
			}
		}
	}

	public final void method7357(Class523_Sub34 class523_sub34, int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_) {
		int i_401_ = 8 * (i_398_ & 0x7);
		int i_402_ = 8 * (i_399_ & 0x7);
		int i_403_ = (i_398_ & ~0x7) << 3;
		int i_404_ = (i_399_ & ~0x7) << 3;
		int i_405_ = 0;
		int i_406_ = 0;
		if (1 == i_400_)
			i_406_ = 1;
		else if (i_400_ == 2) {
			i_405_ = 1;
			i_406_ = 1;
		} else if (3 == i_400_)
			i_405_ = 1;
		for (int i_407_ = 0; i_407_ < anInt4990 * 1248554419; i_407_++) {
			for (int i_408_ = 0; i_408_ < 64; i_408_++) {
				for (int i_409_ = 0; i_409_ < 64; i_409_++) {
					if (i_407_ == i_397_ && i_408_ >= i_401_ && i_408_ <= 8 + i_401_ && i_409_ >= i_402_ && i_409_ <= 8 + i_402_) {
						int i_410_;
						int i_411_;
						if (i_408_ == i_401_ + 8 || i_409_ == i_402_ + 8) {
							if (0 == i_400_) {
								i_410_ = i_395_ + (i_408_ - i_401_);
								i_411_ = i_409_ - i_402_ + i_396_;
							} else if (1 == i_400_) {
								i_410_ = i_409_ - i_402_ + i_395_;
								i_411_ = i_396_ + 8 - (i_408_ - i_401_);
							} else if (i_400_ == 2) {
								i_410_ = 8 + i_395_ - (i_408_ - i_401_);
								i_411_ = 8 + i_396_ - (i_409_ - i_402_);
							} else {
								i_410_ = 8 + i_395_ - (i_409_ - i_402_);
								i_411_ = i_396_ + (i_408_ - i_401_);
							}
							method7334(class523_sub34, i, i_410_, i_411_, 0, 0, i_408_ + i_403_, i_404_ + i_409_, 0, true, -1617573979);
						} else {
							i_410_ = i_395_ + Class283.method5136(i_408_ & 0x7, i_409_ & 0x7, i_400_, (byte) 0);
							i_411_ = i_396_ + Class412.method6646(i_408_ & 0x7, i_409_ & 0x7, i_400_, 2090216726);
							method7334(class523_sub34, i, i_410_, i_411_, i_405_, i_406_, i_408_ + i_403_, i_404_ + i_409_, i_400_, false, 391797520);
						}
						if (i_408_ == 63 || i_409_ == 63) {
							int i_412_ = 1;
							if (i_408_ == 63 && i_409_ == 63)
								i_412_ = 3;
							for (int i_413_ = 0; i_413_ < i_412_; i_413_++) {
								int i_414_ = i_408_;
								int i_415_ = i_409_;
								if (i_413_ == 0) {
									i_414_ = 63 == i_408_ ? 64 : i_408_;
									i_415_ = 63 == i_409_ ? 64 : i_409_;
								} else if (1 == i_413_)
									i_414_ = 64;
								else if (2 == i_413_)
									i_415_ = 64;
								int i_416_;
								int i_417_;
								if (0 == i_400_) {
									i_416_ = i_395_ + (i_414_ - i_401_);
									i_417_ = i_415_ - i_402_ + i_396_;
								} else if (1 == i_400_) {
									i_416_ = i_395_ + (i_415_ - i_402_);
									i_417_ = 8 + i_396_ - (i_414_ - i_401_);
								} else if (2 == i_400_) {
									i_416_ = 8 + i_395_ - (i_414_ - i_401_);
									i_417_ = i_396_ + 8 - (i_415_ - i_402_);
								} else {
									i_416_ = 8 + i_395_ - (i_415_ - i_402_);
									i_417_ = i_396_ + (i_414_ - i_401_);
								}
								if (i_416_ >= 0 && i_416_ < -1287541105 * anInt4991 && i_417_ >= 0 && i_417_ < -215635651 * anInt4984)
									anIntArrayArrayArray5033[i][i_416_][i_417_] = (anIntArrayArrayArray5033[i][i_410_ + i_405_][i_411_ + i_406_]);
							}
						}
					} else
						method7334(class523_sub34, 0, -1, -1, 0, 0, 0, 0, 0, false, 903384618);
				}
			}
		}
	}

	final void method7358(Class523_Sub34 class523_sub34, int i, int i_418_, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, int i_424_, boolean bool) {
		if (1 == i_424_)
			i_421_ = 1;
		else if (2 == i_424_) {
			i_420_ = 1;
			i_421_ = 1;
		} else if (3 == i_424_)
			i_420_ = 1;
		if (i_418_ >= 0 && i_418_ < anInt4991 * -1287541105 && i_419_ >= 0 && i_419_ < -215635651 * anInt4984) {
			if (!aBool5022 && !bool)
				aClass451_4982.aByteArrayArrayArray4962[i][i_418_][i_419_] = (byte) 0;
			int i_425_ = class523_sub34.readUnsignedByte(-363367693);
			if (0 != (i_425_ & 0x1)) {
				if (bool) {
					class523_sub34.readUnsignedByte(-1382294180);
					class523_sub34.readUnsignedSmart(368514876);
				} else {
					int i_426_ = class523_sub34.readUnsignedByte(683370993);
					aShortArrayArrayArray5013[i][i_418_][i_419_] = (short) class523_sub34.readUnsignedSmart(368514876);
					aByteArrayArrayArray4997[i][i_418_][i_419_] = (byte) (i_426_ >> 2);
					aByteArrayArrayArray4998[i][i_418_][i_419_] = (byte) (i_424_ + i_426_ & 0x3);
				}
			}
			if ((i_425_ & 0x2) != 0) {
				if (!aBool5022 && !bool)
					aClass451_4982.aByteArrayArrayArray4962[i][i_418_][i_419_] = class523_sub34.readByte((short) -29503);
				else
					class523_sub34.anInt10661 += 189765723;
			}
			if ((i_425_ & 0x4) != 0) {
				if (bool)
					class523_sub34.readUnsignedSmart(368514876);
				else
					aShortArrayArrayArray5057[i][i_418_][i_419_] = (short) class523_sub34.readUnsignedSmart(368514876);
			}
			if ((i_425_ & 0x8) != 0) {
				int i_427_ = class523_sub34.readUnsignedByte(-2144723142);
				if (!aBool5022) {
					if (1 == i_427_)
						i_427_ = 0;
					if (0 == i)
						anIntArrayArrayArray5033[0][i_418_ + i_420_][i_421_ + i_419_] = -i_427_ * 8 << 2;
					else
						anIntArrayArrayArray5033[i][i_418_ + i_420_][i_421_ + i_419_] = (anIntArrayArrayArray5033[i - 1][i_420_ + i_418_][i_421_ + i_419_]) - (i_427_ * 8 << 2);
				} else
					anIntArrayArrayArray5033[0][i_420_ + i_418_][(i_419_ + i_421_)] = 8 * i_427_ << 2;
			} else if (aBool5022)
				anIntArrayArrayArray5033[0][i_418_ + i_420_][i_419_ + i_421_] = 0;
			else if (0 == i)
				anIntArrayArrayArray5033[0][i_418_ + i_420_][i_421_ + i_419_] = -Class46.method1250(932731 + i_422_, i_423_ + 556238, 245722651) * 8 << 2;
			else
				anIntArrayArrayArray5033[i][i_418_ + i_420_][i_419_ + i_421_] = (anIntArrayArrayArray5033[i - 1][i_420_ + i_418_][i_419_ + i_421_]) - 960;
		} else {
			int i_428_ = class523_sub34.readUnsignedByte(-832512786);
			if (0 != (i_428_ & 0x1)) {
				class523_sub34.readUnsignedByte(-14739515);
				class523_sub34.readUnsignedSmart(368514876);
			}
			if (0 != (i_428_ & 0x2))
				class523_sub34.anInt10661 += 189765723;
			if (0 != (i_428_ & 0x4))
				class523_sub34.readUnsignedSmart(368514876);
			if ((i_428_ & 0x8) != 0)
				class523_sub34.readUnsignedByte(1852299077);
		}
	}

	final void method7359(Class523_Sub34 class523_sub34, int i, int i_429_, int i_430_, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_, boolean bool) {
		if (1 == i_435_)
			i_432_ = 1;
		else if (2 == i_435_) {
			i_431_ = 1;
			i_432_ = 1;
		} else if (3 == i_435_)
			i_431_ = 1;
		if (i_429_ >= 0 && i_429_ < anInt4991 * -1287541105 && i_430_ >= 0 && i_430_ < -215635651 * anInt4984) {
			if (!aBool5022 && !bool)
				aClass451_4982.aByteArrayArrayArray4962[i][i_429_][i_430_] = (byte) 0;
			int i_436_ = class523_sub34.readUnsignedByte(-547423397);
			if (0 != (i_436_ & 0x1)) {
				if (bool) {
					class523_sub34.readUnsignedByte(-864842451);
					class523_sub34.readUnsignedSmart(368514876);
				} else {
					int i_437_ = class523_sub34.readUnsignedByte(-1844288766);
					aShortArrayArrayArray5013[i][i_429_][i_430_] = (short) class523_sub34.readUnsignedSmart(368514876);
					aByteArrayArrayArray4997[i][i_429_][i_430_] = (byte) (i_437_ >> 2);
					aByteArrayArrayArray4998[i][i_429_][i_430_] = (byte) (i_435_ + i_437_ & 0x3);
				}
			}
			if ((i_436_ & 0x2) != 0) {
				if (!aBool5022 && !bool)
					aClass451_4982.aByteArrayArrayArray4962[i][i_429_][i_430_] = class523_sub34.readByte((short) -5741);
				else
					class523_sub34.anInt10661 += 189765723;
			}
			if ((i_436_ & 0x4) != 0) {
				if (bool)
					class523_sub34.readUnsignedSmart(368514876);
				else
					aShortArrayArrayArray5057[i][i_429_][i_430_] = (short) class523_sub34.readUnsignedSmart(368514876);
			}
			if ((i_436_ & 0x8) != 0) {
				int i_438_ = class523_sub34.readUnsignedByte(1375923342);
				if (!aBool5022) {
					if (1 == i_438_)
						i_438_ = 0;
					if (0 == i)
						anIntArrayArrayArray5033[0][i_429_ + i_431_][i_432_ + i_430_] = -i_438_ * 8 << 2;
					else
						anIntArrayArrayArray5033[i][i_429_ + i_431_][i_432_ + i_430_] = (anIntArrayArrayArray5033[i - 1][i_431_ + i_429_][i_432_ + i_430_]) - (i_438_ * 8 << 2);
				} else
					anIntArrayArrayArray5033[0][i_431_ + i_429_][(i_430_ + i_432_)] = 8 * i_438_ << 2;
			} else if (aBool5022)
				anIntArrayArrayArray5033[0][i_429_ + i_431_][i_430_ + i_432_] = 0;
			else if (0 == i)
				anIntArrayArrayArray5033[0][i_429_ + i_431_][i_432_ + i_430_] = -Class46.method1250(932731 + i_433_, i_434_ + 556238, 245722651) * 8 << 2;
			else
				anIntArrayArrayArray5033[i][i_429_ + i_431_][i_430_ + i_432_] = (anIntArrayArrayArray5033[i - 1][i_431_ + i_429_][i_430_ + i_432_]) - 960;
		} else {
			int i_439_ = class523_sub34.readUnsignedByte(1772212657);
			if (0 != (i_439_ & 0x1)) {
				class523_sub34.readUnsignedByte(1255107271);
				class523_sub34.readUnsignedSmart(368514876);
			}
			if (0 != (i_439_ & 0x2))
				class523_sub34.anInt10661 += 189765723;
			if (0 != (i_439_ & 0x4))
				class523_sub34.readUnsignedSmart(368514876);
			if ((i_439_ & 0x8) != 0)
				class523_sub34.readUnsignedByte(2124562089);
		}
	}

	final void method7360(Class523_Sub34 class523_sub34, int i, int i_440_, int i_441_, int i_442_, int i_443_, int i_444_, int i_445_, int i_446_, boolean bool) {
		if (1 == i_446_)
			i_443_ = 1;
		else if (2 == i_446_) {
			i_442_ = 1;
			i_443_ = 1;
		} else if (3 == i_446_)
			i_442_ = 1;
		if (i_440_ >= 0 && i_440_ < anInt4991 * -1287541105 && i_441_ >= 0 && i_441_ < -215635651 * anInt4984) {
			if (!aBool5022 && !bool)
				aClass451_4982.aByteArrayArrayArray4962[i][i_440_][i_441_] = (byte) 0;
			int i_447_ = class523_sub34.readUnsignedByte(624484232);
			if (0 != (i_447_ & 0x1)) {
				if (bool) {
					class523_sub34.readUnsignedByte(-1600260934);
					class523_sub34.readUnsignedSmart(368514876);
				} else {
					int i_448_ = class523_sub34.readUnsignedByte(190987420);
					aShortArrayArrayArray5013[i][i_440_][i_441_] = (short) class523_sub34.readUnsignedSmart(368514876);
					aByteArrayArrayArray4997[i][i_440_][i_441_] = (byte) (i_448_ >> 2);
					aByteArrayArrayArray4998[i][i_440_][i_441_] = (byte) (i_446_ + i_448_ & 0x3);
				}
			}
			if ((i_447_ & 0x2) != 0) {
				if (!aBool5022 && !bool)
					aClass451_4982.aByteArrayArrayArray4962[i][i_440_][i_441_] = class523_sub34.readByte((short) -15516);
				else
					class523_sub34.anInt10661 += 189765723;
			}
			if ((i_447_ & 0x4) != 0) {
				if (bool)
					class523_sub34.readUnsignedSmart(368514876);
				else
					aShortArrayArrayArray5057[i][i_440_][i_441_] = (short) class523_sub34.readUnsignedSmart(368514876);
			}
			if ((i_447_ & 0x8) != 0) {
				int i_449_ = class523_sub34.readUnsignedByte(1879709343);
				if (!aBool5022) {
					if (1 == i_449_)
						i_449_ = 0;
					if (0 == i)
						anIntArrayArrayArray5033[0][i_440_ + i_442_][i_443_ + i_441_] = -i_449_ * 8 << 2;
					else
						anIntArrayArrayArray5033[i][i_440_ + i_442_][i_443_ + i_441_] = (anIntArrayArrayArray5033[i - 1][i_442_ + i_440_][i_443_ + i_441_]) - (i_449_ * 8 << 2);
				} else
					anIntArrayArrayArray5033[0][i_442_ + i_440_][(i_441_ + i_443_)] = 8 * i_449_ << 2;
			} else if (aBool5022)
				anIntArrayArrayArray5033[0][i_440_ + i_442_][i_441_ + i_443_] = 0;
			else if (0 == i)
				anIntArrayArrayArray5033[0][i_440_ + i_442_][i_443_ + i_441_] = -Class46.method1250(932731 + i_444_, i_445_ + 556238, 245722651) * 8 << 2;
			else
				anIntArrayArrayArray5033[i][i_440_ + i_442_][i_441_ + i_443_] = (anIntArrayArrayArray5033[i - 1][i_442_ + i_440_][i_441_ + i_443_]) - 960;
		} else {
			int i_450_ = class523_sub34.readUnsignedByte(-32509252);
			if (0 != (i_450_ & 0x1)) {
				class523_sub34.readUnsignedByte(560863301);
				class523_sub34.readUnsignedSmart(368514876);
			}
			if (0 != (i_450_ & 0x2))
				class523_sub34.anInt10661 += 189765723;
			if (0 != (i_450_ & 0x4))
				class523_sub34.readUnsignedSmart(368514876);
			if ((i_450_ & 0x8) != 0)
				class523_sub34.readUnsignedByte(680907613);
		}
	}

	public final void method7361(int i, int[][] is) {
		int[][] is_451_ = anIntArrayArrayArray5033[i];
		for (int i_452_ = 0; i_452_ < anInt4991 * -1287541105 + 1; i_452_++) {
			for (int i_453_ = 0; i_453_ < 1 + anInt4984 * -215635651; i_453_++)
				is_451_[i_452_][i_453_] += is[i_452_][i_453_];
		}
	}

	int method7362(int i, int i_454_, int i_455_, int i_456_, int i_457_, Class142 class142, short[][] is) {
		if ((-366854495 * anInt5051 == 0 || 12 == anInt5051 * -366854495) && i_454_ > 0 && i_455_ > 0 && i_454_ < -1287541105 * anInt4991 && i_455_ < anInt4984 * -215635651) {
			int i_458_ = 0;
			int i_459_ = 0;
			int i_460_ = 0;
			int i_461_ = 0;
			i_458_ = i_458_ + (i == is[i_454_ - 1][i_455_ - 1] ? 1 : -1);
			i_459_ = i_459_ + (i == is[i_456_][i_455_ - 1] ? 1 : -1);
			i_460_ = i_460_ + (is[i_456_][i_457_] == i ? 1 : -1);
			i_461_ = i_461_ + (is[i_454_ - 1][i_457_] == i ? 1 : -1);
			if (is[i_454_][i_455_ - 1] == i) {
				i_458_++;
				i_459_++;
			} else {
				i_458_--;
				i_459_--;
			}
			if (is[i_456_][i_455_] == i) {
				i_459_++;
				i_460_++;
			} else {
				i_459_--;
				i_460_--;
			}
			if (is[i_454_][i_457_] == i) {
				i_460_++;
				i_461_++;
			} else {
				i_460_--;
				i_461_--;
			}
			if (is[i_454_ - 1][i_455_] == i) {
				i_461_++;
				i_458_++;
			} else {
				i_461_--;
				i_458_--;
			}
			int i_462_ = i_458_ - i_460_;
			if (i_462_ < 0)
				i_462_ = -i_462_;
			int i_463_ = i_459_ - i_461_;
			if (i_463_ < 0)
				i_463_ = -i_463_;
			if (i_463_ == i_462_) {
				i_462_ = (class142.method2321(i_454_, i_455_, 2128449844) - class142.method2321(i_456_, i_457_, 2004570598));
				if (i_462_ < 0)
					i_462_ = -i_462_;
				i_463_ = (class142.method2321(i_456_, i_455_, 1958360475) - class142.method2321(i_454_, i_457_, 1610211985));
				if (i_463_ < 0)
					i_463_ = -i_463_;
			}
			return i_462_ < i_463_ ? 1 : 0;
		}
		return 425193199 * anInt5052;
	}

	void method7363(Class178 class178, int i, int i_464_, int i_465_, int i_466_, int i_467_, Class7 class7, int i_468_, int i_469_, int i_470_, int i_471_, boolean[] bools, int[] is, int[] is_472_, int[] is_473_, int[] is_474_, int[] is_475_, int[] is_476_, int[] is_477_, int[] is_478_, int[][] is_479_, Class142 class142, Class142 class142_480_, Class142 class142_481_) {
		if (null != class7) {
			if (i_469_ == 0)
				i_469_ = i_468_;
			if (0 == i_470_)
				i_470_ = i_468_;
			if (i_471_ == 0)
				i_471_ = i_468_;
			Class7 class7_482_ = (Class7) aClass53_Sub5_4981.getDefinition(i_468_ - 1, (byte) -31);
			Class7 class7_483_ = (Class7) aClass53_Sub5_4981.getDefinition(i_469_ - 1, (byte) 61);
			Class7 class7_484_ = (Class7) aClass53_Sub5_4981.getDefinition(i_470_ - 1, (byte) 32);
			Class7 class7_485_ = (Class7) aClass53_Sub5_4981.getDefinition(i_471_ - 1, (byte) -55);
			for (int i_486_ = 0; i_486_ < anInt5062 * -461602405; i_486_++) {
				boolean bool = false;
				int i_487_;
				if (bools[0 - anInt5052 * 425193199 & 0x3] && anInt5053 * -183625315 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_487_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && anIntArray5009[2] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_487_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anInt5053 * -183625315 == anIntArray5009[1]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_487_ = 6;
				} else if (bools[3 - 425193199 * anInt5052 & 0x3] && anIntArray5009[3] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_487_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_487_ = 3;
				}
				for (int i_488_ = 0; i_488_ < i_487_; i_488_++) {
					int i_489_ = anIntArray5044[i_488_];
					int i_490_ = i_489_ - anInt5052 * 850386398 & 0x7;
					int i_491_ = anIntArray5027[i_489_];
					int i_492_ = anIntArray5028[i_489_];
					int i_493_;
					int i_494_;
					if (1 == anInt5052 * 425193199) {
						i_493_ = i_492_;
						i_494_ = 512 - i_491_;
					} else if (2 == 425193199 * anInt5052) {
						i_493_ = 512 - i_491_;
						i_494_ = 512 - i_492_;
					} else if (anInt5052 * 425193199 == 3) {
						i_493_ = 512 - i_492_;
						i_494_ = i_491_;
					} else {
						i_493_ = i_491_;
						i_494_ = i_492_;
					}
					is_472_[anInt5054 * 1415532205] = i_493_;
					is_473_[anInt5054 * 1415532205] = i_494_;
					if (null != is_477_ && (aBoolArrayArray5058[-366854495 * anInt5051][i_489_])) {
						int i_495_ = (i_464_ << 9) + i_493_;
						int i_496_ = i_494_ + (i_465_ << 9);
						is_477_[anInt5054 * 1415532205] = (class142_480_.method2326(i_495_, i_496_, 564530866) - class142.method2326(i_495_, i_496_, -691280815));
					}
					if (is_478_ != null) {
						if (null != class142_480_ && !(aBoolArrayArray5058[-366854495 * anInt5051][i_489_])) {
							int i_497_ = i_493_ + (i_464_ << 9);
							int i_498_ = (i_465_ << 9) + i_494_;
							is_478_[1415532205 * anInt5054] = (class142.method2326(i_497_, i_498_, -1772376044) - class142_480_.method2326(i_497_, i_498_, 1694885262));
						} else if (class142_481_ != null && !(aBoolArrayArray5064[-366854495 * anInt5051][i_489_])) {
							int i_499_ = i_493_ + (i_464_ << 9);
							int i_500_ = (i_465_ << 9) + i_494_;
							is_478_[1415532205 * anInt5054] = (class142_481_.method2326(i_499_, i_500_, -847284863) - class142.method2326(i_499_, i_500_, 770603626));
						}
					}
					if (i_489_ < 8 && anIntArray5049[i_490_] >= 0) {
						if (is != null)
							is[1415532205 * anInt5054] = anIntArray5046[i_490_];
						is_476_[anInt5054 * 1415532205] = anIntArray5048[i_490_];
						is_475_[anInt5054 * 1415532205] = anIntArray5047[i_490_];
						is_474_[anInt5054 * 1415532205] = anIntArray5045[i_490_];
					} else {
						if (aBool5060 && (aBoolArrayArray5058[anInt5051 * -366854495][i_489_])) {
							is_475_[anInt5054 * 1415532205] = -74375463 * anInt5055;
							is_476_[1415532205 * anInt5054] = 679896617 * anInt5056;
							is_474_[1415532205 * anInt5054] = -1886607527 * anInt5023;
						} else if (i_493_ == 0 && 0 == i_494_) {
							is_474_[1415532205 * anInt5054] = is_479_[i_464_][i_465_];
							is_475_[1415532205 * anInt5054] = class7_482_.anInt56 * -609411693;
							is_476_[anInt5054 * 1415532205] = 424256487 * class7_482_.anInt49;
						} else if (i_493_ == 0 && i_494_ == 512) {
							is_474_[anInt5054 * 1415532205] = is_479_[i_464_][i_467_];
							is_475_[1415532205 * anInt5054] = class7_483_.anInt56 * -609411693;
							is_476_[1415532205 * anInt5054] = class7_483_.anInt49 * 424256487;
						} else if (512 == i_493_ && 512 == i_494_) {
							is_474_[1415532205 * anInt5054] = is_479_[i_466_][i_467_];
							is_475_[anInt5054 * 1415532205] = -609411693 * class7_484_.anInt56;
							is_476_[anInt5054 * 1415532205] = class7_484_.anInt49 * 424256487;
						} else if (512 == i_493_ && i_494_ == 0) {
							is_474_[1415532205 * anInt5054] = is_479_[i_466_][i_465_];
							is_475_[1415532205 * anInt5054] = -609411693 * class7_485_.anInt56;
							is_476_[1415532205 * anInt5054] = 424256487 * class7_485_.anInt49;
						} else {
							if (i_493_ < 256) {
								if (i_494_ < 256) {
									is_475_[anInt5054 * 1415532205] = -609411693 * class7_482_.anInt56;
									is_476_[anInt5054 * 1415532205] = class7_482_.anInt49 * 424256487;
								} else {
									is_475_[1415532205 * anInt5054] = -609411693 * class7_483_.anInt56;
									is_476_[1415532205 * anInt5054] = 424256487 * class7_483_.anInt49;
								}
							} else if (i_494_ < 256) {
								is_475_[anInt5054 * 1415532205] = class7_485_.anInt56 * -609411693;
								is_476_[1415532205 * anInt5054] = class7_485_.anInt49 * 424256487;
							} else {
								is_475_[1415532205 * anInt5054] = -609411693 * class7_484_.anInt56;
								is_476_[1415532205 * anInt5054] = class7_484_.anInt49 * 424256487;
							}
							int i_501_ = Class102.method1799(is_479_[i_464_][i_465_], is_479_[i_466_][i_465_], i_493_ << 7 >> 9, -2118458813);
							int i_502_ = Class102.method1799(is_479_[i_464_][i_467_], is_479_[i_466_][i_467_], i_493_ << 7 >> 9, 1983605661);
							is_474_[1415532205 * anInt5054] = Class102.method1799(i_501_, i_502_, i_494_ << 7 >> 9, 2027178008);
						}
						if (is != null)
							is[1415532205 * anInt5054] = is_474_[anInt5054 * 1415532205];
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (0 != anInt5051 * -366854495 && class7.aBool52)
				aBool4980 = true;
		}
	}

	public void method7364(Class178 class178, int[][][] is) {
		for (int i = 0; i < anInt4990 * 1248554419; i++) {
			int i_503_ = 0;
			int i_504_ = 0;
			if (!aBool5022) {
				if (aBool4986)
					i_504_ |= 0x8;
				if (aBool4987)
					i_503_ |= 0x2;
				if (anInt4985 * -841434311 != 0) {
					i_503_ |= 0x1;
					i_504_ |= 0x10;
				}
			}
			if (aBool4987)
				i_504_ |= 0x7;
			if (!aBool4989)
				i_504_ |= 0x20;
			int[][] is_505_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray5033[i]);
			aClass560_4983.method9256(i, class178.method3082(anInt4991 * -1287541105, -215635651 * anInt4984, anIntArrayArrayArray5033[i], is_505_, 512, i_503_, i_504_), (byte) 76);
		}
	}

	public final void method7365(Class523_Sub34 class523_sub34, int i, int i_506_, int i_507_, int i_508_) {
		int i_509_ = i + i_507_;
		int i_510_ = i_506_ + i_508_;
		for (int i_511_ = 0; i_511_ < anInt4990 * 1248554419; i_511_++) {
			for (int i_512_ = 0; i_512_ < 64; i_512_++) {
				for (int i_513_ = 0; i_513_ < 64; i_513_++)
					method7334(class523_sub34, i_511_, i_512_ + i, i_513_ + i_506_, 0, 0, i_512_ + i_509_, i_510_ + i_513_, 0, false, -2070323202);
			}
		}
	}

	public final void method7366(Class178 class178, Class142 class142, Class142 class142_514_) {
		int[][] is = new int[anInt4991 * -1287541105][anInt4984 * -215635651];
		if (anIntArray5059 == null || anInt4984 * -215635651 != anIntArray5059.length) {
			anIntArray5059 = new int[anInt4984 * -215635651];
			anIntArray5003 = new int[anInt4984 * -215635651];
			anIntArray5004 = new int[anInt4984 * -215635651];
			anIntArray5005 = new int[-215635651 * anInt4984];
			anIntArray5029 = new int[-215635651 * anInt4984];
		}
		for (int i = 0; i < 1248554419 * anInt4990; i++) {
			for (int i_515_ = 0; i_515_ < -215635651 * anInt4984; i_515_++) {
				anIntArray5059[i_515_] = 0;
				anIntArray5003[i_515_] = 0;
				anIntArray5004[i_515_] = 0;
				anIntArray5005[i_515_] = 0;
				anIntArray5029[i_515_] = 0;
			}
			for (int i_516_ = -5; i_516_ < -1287541105 * anInt4991; i_516_++) {
				for (int i_517_ = 0; i_517_ < anInt4984 * -215635651; i_517_++) {
					int i_518_ = i_516_ + 5;
					if (i_518_ < -1287541105 * anInt4991) {
						int i_519_ = (aShortArrayArrayArray5057[i][i_518_][i_517_] & 0x7fff);
						if (i_519_ > 0) {
							Class7 class7 = ((Class7) aClass53_Sub5_4981.getDefinition(i_519_ - 1, (byte) 100));
							anIntArray5059[i_517_] += -95297807 * class7.anInt54;
							anIntArray5003[i_517_] += 1400193059 * class7.anInt55;
							anIntArray5004[i_517_] += class7.anInt50 * 271765687;
							anIntArray5005[i_517_] += 1218541115 * class7.anInt51;
							anIntArray5029[i_517_]++;
						}
					}
					int i_520_ = i_516_ - 5;
					if (i_520_ >= 0) {
						int i_521_ = (aShortArrayArrayArray5057[i][i_520_][i_517_] & 0x7fff);
						if (i_521_ > 0) {
							Class7 class7 = ((Class7) aClass53_Sub5_4981.getDefinition(i_521_ - 1, (byte) -93));
							anIntArray5059[i_517_] -= class7.anInt54 * -95297807;
							anIntArray5003[i_517_] -= class7.anInt55 * 1400193059;
							anIntArray5004[i_517_] -= class7.anInt50 * 271765687;
							anIntArray5005[i_517_] -= class7.anInt51 * 1218541115;
							anIntArray5029[i_517_]--;
						}
					}
				}
				if (i_516_ >= 0) {
					int i_522_ = 0;
					int i_523_ = 0;
					int i_524_ = 0;
					int i_525_ = 0;
					int i_526_ = 0;
					for (int i_527_ = -5; i_527_ < -215635651 * anInt4984; i_527_++) {
						int i_528_ = i_527_ + 5;
						if (i_528_ < anInt4984 * -215635651) {
							i_522_ += anIntArray5059[i_528_];
							i_523_ += anIntArray5003[i_528_];
							i_524_ += anIntArray5004[i_528_];
							i_525_ += anIntArray5005[i_528_];
							i_526_ += anIntArray5029[i_528_];
						}
						int i_529_ = i_527_ - 5;
						if (i_529_ >= 0) {
							i_522_ -= anIntArray5059[i_529_];
							i_523_ -= anIntArray5003[i_529_];
							i_524_ -= anIntArray5004[i_529_];
							i_525_ -= anIntArray5005[i_529_];
							i_526_ -= anIntArray5029[i_529_];
						}
						if (i_527_ >= 0 && i_525_ > 0 && i_526_ > 0)
							is[i_516_][i_527_] = Class645.method10562(256 * i_522_ / i_525_, i_523_ / i_526_, i_524_ / i_526_, -573495386);
					}
				}
			}
			if (aBool4988)
				method7339(class178, aClass560_4983.aClass142Array7509[i], i, is, i == 0 ? class142 : null, i == 0 ? class142_514_ : null, 2085222241);
			else
				method7409(class178, aClass560_4983.aClass142Array7509[i], i, is, 0 == i ? class142 : null, i == 0 ? class142_514_ : null, (byte) 51);
			aShortArrayArrayArray5057[i] = null;
			aShortArrayArrayArray5013[i] = null;
			aByteArrayArrayArray4997[i] = null;
			aByteArrayArrayArray4998[i] = null;
		}
		if (!aBool5022) {
			if (-841434311 * anInt4985 != 0)
				aClass560_4983.method9334(-1857973416);
			if (aBool4987)
				aClass560_4983.method9299((byte) -75);
		}
		for (int i = 0; i < 1248554419 * anInt4990; i++)
			aClass560_4983.aClass142Array7509[i].method2347();
	}

	public void method7367() {
		aBool4994 = true;
	}

	void method7368(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_530_, Class142 class142_531_) {
		for (int i_532_ = 0; i_532_ < anInt4991 * -1287541105; i_532_++) {
			for (int i_533_ = 0; i_533_ < -215635651 * anInt4984; i_533_++) {
				byte i_534_ = aByteArrayArrayArray4997[i][i_532_][i_533_];
				byte i_535_ = aByteArrayArrayArray4998[i][i_532_][i_533_];
				int i_536_ = aShortArrayArrayArray5013[i][i_532_][i_533_] & 0x7fff;
				int i_537_ = aShortArrayArrayArray5057[i][i_532_][i_533_] & 0x7fff;
				Class651 class651 = ((Class651) (0 != i_536_ ? aClass53_Sub12_5006.getDefinition(i_536_ - 1, (byte) -26) : null));
				Class7 class7 = ((Class7) (0 != i_537_ ? aClass53_Sub5_4981.getDefinition(i_537_ - 1, (byte) -72) : null));
				if (i_534_ == 0 && class651 == null)
					i_534_ = (byte) 12;
				Class651 class651_538_ = class651;
				if (null != class651 && -1 == class651.anInt8383 * -1082268879 && class651.anInt8386 * 99640975 == -1) {
					class651_538_ = class651;
					class651 = null;
				}
				if (null != class651 || class7 != null) {
					anInt5062 = anIntArray4996[i_534_] * 1209531539;
					anInt5063 = -280478319 * anIntArray5021[i_534_];
					int i_539_ = ((class7 != null ? anInt5062 * -461602405 : 0) + (null != class651 ? 613557105 * anInt5063 : 0));
					int i_540_ = 0;
					anInt5052 = 0;
					anInt5055 = (null != class651 ? 634101717 * class651.anInt8394 : -1) * 17269097;
					int i_541_ = class7 != null ? -609411693 * class7.anInt56 : -1;
					int[] is_542_ = new int[i_539_];
					int[] is_543_ = new int[i_539_];
					int[] is_544_ = new int[i_539_];
					int[] is_545_ = new int[i_539_];
					int[] is_546_ = new int[i_539_];
					int[] is_547_ = new int[i_539_];
					int[] is_548_ = ((null != class651 && -1 != 99640975 * class651.anInt8386) ? new int[i_539_] : null);
					if (null != class651) {
						for (int i_549_ = 0; i_549_ < 613557105 * anInt5063; i_549_++) {
							is_542_[i_540_] = (anIntArrayArray5031[i_534_][anInt5052 * 425193199]);
							is_543_[i_540_] = (anIntArrayArray5019[i_534_][425193199 * anInt5052]);
							is_544_[i_540_] = (anIntArrayArray5016[i_534_][anInt5052 * 425193199]);
							is_546_[i_540_] = -74375463 * anInt5055;
							is_547_[i_540_] = -576090841 * class651.anInt8387;
							is_545_[i_540_] = -1082268879 * class651.anInt8383;
							if (null != is_548_)
								is_548_[i_540_] = class651.anInt8386 * 99640975;
							i_540_++;
							anInt5052 += -1179189233;
						}
						if (!aBool5022 && 0 == i)
							aClass560_4983.method9263(i_532_, i_533_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, class651.anInt8388 * -134620943, class651.anInt8395 * 19373761, 2062212613 * class651.anInt8396, (byte) 17);
					} else
						anInt5052 += anInt5063 * 592909215;
					if (null != class7) {
						for (int i_550_ = 0; i_550_ < anInt5062 * -461602405; i_550_++) {
							is_542_[i_540_] = (anIntArrayArray5031[i_534_][425193199 * anInt5052]);
							is_543_[i_540_] = (anIntArrayArray5019[i_534_][anInt5052 * 425193199]);
							is_544_[i_540_] = (anIntArrayArray5016[i_534_][425193199 * anInt5052]);
							is_546_[i_540_] = i_541_;
							is_547_[i_540_] = class7.anInt49 * 424256487;
							is_545_[i_540_] = is[i_532_][i_533_];
							if (is_548_ != null)
								is_548_[i_540_] = is_545_[i_540_];
							i_540_++;
							anInt5052 += -1179189233;
						}
					}
					int i_551_ = anIntArray5027.length;
					int[] is_552_ = new int[i_551_];
					int[] is_553_ = new int[i_551_];
					int[] is_554_ = class142_531_ != null ? new int[i_551_] : null;
					int[] is_555_ = (class142_531_ != null || null != class142_530_ ? new int[i_551_] : null);
					for (int i_556_ = 0; i_556_ < i_551_; i_556_++) {
						int i_557_ = anIntArray5027[i_556_];
						int i_558_ = anIntArray5028[i_556_];
						if (0 == i_535_) {
							is_552_[i_556_] = i_557_;
							is_553_[i_556_] = i_558_;
						} else if (1 == i_535_) {
							int i_559_ = i_557_;
							is_552_[i_556_] = i_558_;
							is_553_[i_556_] = 512 - i_559_;
						} else if (2 == i_535_) {
							is_552_[i_556_] = 512 - i_557_;
							is_553_[i_556_] = 512 - i_558_;
						} else if (i_535_ == 3) {
							int i_560_ = i_557_;
							is_552_[i_556_] = 512 - i_558_;
							is_553_[i_556_] = i_560_;
						}
						if (null != is_554_ && aBoolArrayArray5058[i_534_][i_556_]) {
							int i_561_ = (i_532_ << 9) + is_552_[i_556_];
							int i_562_ = (i_533_ << 9) + is_553_[i_556_];
							is_554_[i_556_] = (class142_531_.method2326(i_561_, i_562_, 2078002652) - class142.method2326(i_561_, i_562_, -1163631517));
						}
						if (null != is_555_) {
							if (null != class142_531_ && !aBoolArrayArray5058[i_534_][i_556_]) {
								int i_563_ = (i_532_ << 9) + is_552_[i_556_];
								int i_564_ = is_553_[i_556_] + (i_533_ << 9);
								is_555_[i_556_] = (class142.method2326(i_563_, i_564_, -762062602) - (class142_531_.method2326(i_563_, i_564_, -1377571863)));
							} else if (null != class142_530_ && !(aBoolArrayArray5064[i_534_][i_556_])) {
								int i_565_ = is_552_[i_556_] + (i_532_ << 9);
								int i_566_ = (i_533_ << 9) + is_553_[i_556_];
								is_555_[i_556_] = (class142_530_.method2326(i_565_, i_566_, -705064151) - class142.method2326(i_565_, i_566_, -1027563262));
							}
						}
					}
					int i_567_ = class142.method2321(i_532_, i_533_, 1971121401);
					int i_568_ = class142.method2321(1 + i_532_, i_533_, 1902089526);
					int i_569_ = class142.method2321(1 + i_532_, 1 + i_533_, 1946435547);
					int i_570_ = class142.method2321(i_532_, 1 + i_533_, 1733195206);
					boolean bool = aClass451_4982.method7282(i_532_, i_533_, -638715901);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_571_ = true;
						if (class7 != null && !class7.aBool53)
							bool_571_ = false;
						else if (0 == i_537_ && i_534_ != 0)
							bool_571_ = false;
						else if (i_536_ > 0 && null != class651_538_ && !class651_538_.aBool8382)
							bool_571_ = false;
						if (bool_571_ && i_567_ == i_568_ && i_569_ == i_567_ && i_570_ == i_567_)
							aByteArrayArrayArray5001[i][i_532_][i_533_] |= 0x4;
					}
					Class163 class163 = new Class163();
					if (aBool5022) {
						class163.anInt1776 = (aClass560_4983.method9258(i_532_, i_533_, (byte) 110) * -780986409);
						class163.anInt1775 = aClass560_4983.method9254(i_532_, i_533_, 16711935) * 2053161261;
						class163.anInt1774 = (aClass560_4983.method9301(i_532_, i_533_, 65535) * 1512945865);
						class163.anInt1778 = (aClass560_4983.method9260(i_532_, i_533_, (short) -4092) * -923094865);
						class163.anInt1777 = (aClass560_4983.method9261(i_532_, i_533_, (short) -1601) * -320151975);
						class163.anInt1773 = (aClass560_4983.method9329(i_532_, i_533_, 40000) * -58453511);
					}
					class142.method2323(i_532_, i_533_, is_552_, is_554_, is_553_, is_555_, is_542_, is_543_, is_544_, is_545_, is_548_, is_546_, is_547_, class163, false);
					aClass560_4983.method9330(i, i_532_, i_533_, (byte) 4);
				}
			}
		}
	}

	void method7369(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_572_, Class142 class142_573_) {
		for (int i_574_ = 0; i_574_ < anInt4991 * -1287541105; i_574_++) {
			for (int i_575_ = 0; i_575_ < -215635651 * anInt4984; i_575_++) {
				byte i_576_ = aByteArrayArrayArray4997[i][i_574_][i_575_];
				byte i_577_ = aByteArrayArrayArray4998[i][i_574_][i_575_];
				int i_578_ = aShortArrayArrayArray5013[i][i_574_][i_575_] & 0x7fff;
				int i_579_ = aShortArrayArrayArray5057[i][i_574_][i_575_] & 0x7fff;
				Class651 class651 = ((Class651) (0 != i_578_ ? aClass53_Sub12_5006.getDefinition(i_578_ - 1, (byte) -95) : null));
				Class7 class7 = ((Class7) (0 != i_579_ ? aClass53_Sub5_4981.getDefinition(i_579_ - 1, (byte) 4) : null));
				if (i_576_ == 0 && class651 == null)
					i_576_ = (byte) 12;
				Class651 class651_580_ = class651;
				if (null != class651 && -1 == class651.anInt8383 * -1082268879 && class651.anInt8386 * 99640975 == -1) {
					class651_580_ = class651;
					class651 = null;
				}
				if (null != class651 || class7 != null) {
					anInt5062 = anIntArray4996[i_576_] * 1209531539;
					anInt5063 = -280478319 * anIntArray5021[i_576_];
					int i_581_ = ((class7 != null ? anInt5062 * -461602405 : 0) + (null != class651 ? 613557105 * anInt5063 : 0));
					int i_582_ = 0;
					anInt5052 = 0;
					anInt5055 = (null != class651 ? 634101717 * class651.anInt8394 : -1) * 17269097;
					int i_583_ = class7 != null ? -609411693 * class7.anInt56 : -1;
					int[] is_584_ = new int[i_581_];
					int[] is_585_ = new int[i_581_];
					int[] is_586_ = new int[i_581_];
					int[] is_587_ = new int[i_581_];
					int[] is_588_ = new int[i_581_];
					int[] is_589_ = new int[i_581_];
					int[] is_590_ = ((null != class651 && -1 != 99640975 * class651.anInt8386) ? new int[i_581_] : null);
					if (null != class651) {
						for (int i_591_ = 0; i_591_ < 613557105 * anInt5063; i_591_++) {
							is_584_[i_582_] = (anIntArrayArray5031[i_576_][anInt5052 * 425193199]);
							is_585_[i_582_] = (anIntArrayArray5019[i_576_][425193199 * anInt5052]);
							is_586_[i_582_] = (anIntArrayArray5016[i_576_][anInt5052 * 425193199]);
							is_588_[i_582_] = -74375463 * anInt5055;
							is_589_[i_582_] = -576090841 * class651.anInt8387;
							is_587_[i_582_] = -1082268879 * class651.anInt8383;
							if (null != is_590_)
								is_590_[i_582_] = class651.anInt8386 * 99640975;
							i_582_++;
							anInt5052 += -1179189233;
						}
						if (!aBool5022 && 0 == i)
							aClass560_4983.method9263(i_574_, i_575_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, class651.anInt8388 * -134620943, class651.anInt8395 * 19373761, 2062212613 * class651.anInt8396, (byte) 8);
					} else
						anInt5052 += anInt5063 * 592909215;
					if (null != class7) {
						for (int i_592_ = 0; i_592_ < anInt5062 * -461602405; i_592_++) {
							is_584_[i_582_] = (anIntArrayArray5031[i_576_][425193199 * anInt5052]);
							is_585_[i_582_] = (anIntArrayArray5019[i_576_][anInt5052 * 425193199]);
							is_586_[i_582_] = (anIntArrayArray5016[i_576_][425193199 * anInt5052]);
							is_588_[i_582_] = i_583_;
							is_589_[i_582_] = class7.anInt49 * 424256487;
							is_587_[i_582_] = is[i_574_][i_575_];
							if (is_590_ != null)
								is_590_[i_582_] = is_587_[i_582_];
							i_582_++;
							anInt5052 += -1179189233;
						}
					}
					int i_593_ = anIntArray5027.length;
					int[] is_594_ = new int[i_593_];
					int[] is_595_ = new int[i_593_];
					int[] is_596_ = class142_573_ != null ? new int[i_593_] : null;
					int[] is_597_ = (class142_573_ != null || null != class142_572_ ? new int[i_593_] : null);
					for (int i_598_ = 0; i_598_ < i_593_; i_598_++) {
						int i_599_ = anIntArray5027[i_598_];
						int i_600_ = anIntArray5028[i_598_];
						if (0 == i_577_) {
							is_594_[i_598_] = i_599_;
							is_595_[i_598_] = i_600_;
						} else if (1 == i_577_) {
							int i_601_ = i_599_;
							is_594_[i_598_] = i_600_;
							is_595_[i_598_] = 512 - i_601_;
						} else if (2 == i_577_) {
							is_594_[i_598_] = 512 - i_599_;
							is_595_[i_598_] = 512 - i_600_;
						} else if (i_577_ == 3) {
							int i_602_ = i_599_;
							is_594_[i_598_] = 512 - i_600_;
							is_595_[i_598_] = i_602_;
						}
						if (null != is_596_ && aBoolArrayArray5058[i_576_][i_598_]) {
							int i_603_ = (i_574_ << 9) + is_594_[i_598_];
							int i_604_ = (i_575_ << 9) + is_595_[i_598_];
							is_596_[i_598_] = (class142_573_.method2326(i_603_, i_604_, -373877201) - class142.method2326(i_603_, i_604_, 1379293906));
						}
						if (null != is_597_) {
							if (null != class142_573_ && !aBoolArrayArray5058[i_576_][i_598_]) {
								int i_605_ = (i_574_ << 9) + is_594_[i_598_];
								int i_606_ = is_595_[i_598_] + (i_575_ << 9);
								is_597_[i_598_] = (class142.method2326(i_605_, i_606_, 547689182) - (class142_573_.method2326(i_605_, i_606_, -1633426496)));
							} else if (null != class142_572_ && !(aBoolArrayArray5064[i_576_][i_598_])) {
								int i_607_ = is_594_[i_598_] + (i_574_ << 9);
								int i_608_ = (i_575_ << 9) + is_595_[i_598_];
								is_597_[i_598_] = (class142_572_.method2326(i_607_, i_608_, 286427568) - class142.method2326(i_607_, i_608_, 678120577));
							}
						}
					}
					int i_609_ = class142.method2321(i_574_, i_575_, 2022946115);
					int i_610_ = class142.method2321(1 + i_574_, i_575_, 1620188642);
					int i_611_ = class142.method2321(1 + i_574_, 1 + i_575_, 2055546505);
					int i_612_ = class142.method2321(i_574_, 1 + i_575_, 1641000474);
					boolean bool = aClass451_4982.method7282(i_574_, i_575_, -638715901);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_613_ = true;
						if (class7 != null && !class7.aBool53)
							bool_613_ = false;
						else if (0 == i_579_ && i_576_ != 0)
							bool_613_ = false;
						else if (i_578_ > 0 && null != class651_580_ && !class651_580_.aBool8382)
							bool_613_ = false;
						if (bool_613_ && i_609_ == i_610_ && i_611_ == i_609_ && i_612_ == i_609_)
							aByteArrayArrayArray5001[i][i_574_][i_575_] |= 0x4;
					}
					Class163 class163 = new Class163();
					if (aBool5022) {
						class163.anInt1776 = (aClass560_4983.method9258(i_574_, i_575_, (byte) 48) * -780986409);
						class163.anInt1775 = aClass560_4983.method9254(i_574_, i_575_, 16711935) * 2053161261;
						class163.anInt1774 = (aClass560_4983.method9301(i_574_, i_575_, 65535) * 1512945865);
						class163.anInt1778 = (aClass560_4983.method9260(i_574_, i_575_, (short) -17475) * -923094865);
						class163.anInt1777 = (aClass560_4983.method9261(i_574_, i_575_, (short) 1206) * -320151975);
						class163.anInt1773 = (aClass560_4983.method9329(i_574_, i_575_, 40000) * -58453511);
					}
					class142.method2323(i_574_, i_575_, is_594_, is_596_, is_595_, is_597_, is_584_, is_585_, is_586_, is_587_, is_590_, is_588_, is_589_, class163, false);
					aClass560_4983.method9330(i, i_574_, i_575_, (byte) 4);
				}
			}
		}
	}

	void method7370(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_614_, Class142 class142_615_) {
		for (int i_616_ = 0; i_616_ < anInt4991 * -1287541105; i_616_++) {
			for (int i_617_ = 0; i_617_ < -215635651 * anInt4984; i_617_++) {
				byte i_618_ = aByteArrayArrayArray4997[i][i_616_][i_617_];
				byte i_619_ = aByteArrayArrayArray4998[i][i_616_][i_617_];
				int i_620_ = aShortArrayArrayArray5013[i][i_616_][i_617_] & 0x7fff;
				int i_621_ = aShortArrayArrayArray5057[i][i_616_][i_617_] & 0x7fff;
				Class651 class651 = ((Class651) (0 != i_620_ ? aClass53_Sub12_5006.getDefinition(i_620_ - 1, (byte) -11) : null));
				Class7 class7 = ((Class7) (0 != i_621_ ? aClass53_Sub5_4981.getDefinition(i_621_ - 1, (byte) -52) : null));
				if (i_618_ == 0 && class651 == null)
					i_618_ = (byte) 12;
				Class651 class651_622_ = class651;
				if (null != class651 && -1 == class651.anInt8383 * -1082268879 && class651.anInt8386 * 99640975 == -1) {
					class651_622_ = class651;
					class651 = null;
				}
				if (null != class651 || class7 != null) {
					anInt5062 = anIntArray4996[i_618_] * 1209531539;
					anInt5063 = -280478319 * anIntArray5021[i_618_];
					int i_623_ = ((class7 != null ? anInt5062 * -461602405 : 0) + (null != class651 ? 613557105 * anInt5063 : 0));
					int i_624_ = 0;
					anInt5052 = 0;
					anInt5055 = (null != class651 ? 634101717 * class651.anInt8394 : -1) * 17269097;
					int i_625_ = class7 != null ? -609411693 * class7.anInt56 : -1;
					int[] is_626_ = new int[i_623_];
					int[] is_627_ = new int[i_623_];
					int[] is_628_ = new int[i_623_];
					int[] is_629_ = new int[i_623_];
					int[] is_630_ = new int[i_623_];
					int[] is_631_ = new int[i_623_];
					int[] is_632_ = ((null != class651 && -1 != 99640975 * class651.anInt8386) ? new int[i_623_] : null);
					if (null != class651) {
						for (int i_633_ = 0; i_633_ < 613557105 * anInt5063; i_633_++) {
							is_626_[i_624_] = (anIntArrayArray5031[i_618_][anInt5052 * 425193199]);
							is_627_[i_624_] = (anIntArrayArray5019[i_618_][425193199 * anInt5052]);
							is_628_[i_624_] = (anIntArrayArray5016[i_618_][anInt5052 * 425193199]);
							is_630_[i_624_] = -74375463 * anInt5055;
							is_631_[i_624_] = -576090841 * class651.anInt8387;
							is_629_[i_624_] = -1082268879 * class651.anInt8383;
							if (null != is_632_)
								is_632_[i_624_] = class651.anInt8386 * 99640975;
							i_624_++;
							anInt5052 += -1179189233;
						}
						if (!aBool5022 && 0 == i)
							aClass560_4983.method9263(i_616_, i_617_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, class651.anInt8388 * -134620943, class651.anInt8395 * 19373761, 2062212613 * class651.anInt8396, (byte) -26);
					} else
						anInt5052 += anInt5063 * 592909215;
					if (null != class7) {
						for (int i_634_ = 0; i_634_ < anInt5062 * -461602405; i_634_++) {
							is_626_[i_624_] = (anIntArrayArray5031[i_618_][425193199 * anInt5052]);
							is_627_[i_624_] = (anIntArrayArray5019[i_618_][anInt5052 * 425193199]);
							is_628_[i_624_] = (anIntArrayArray5016[i_618_][425193199 * anInt5052]);
							is_630_[i_624_] = i_625_;
							is_631_[i_624_] = class7.anInt49 * 424256487;
							is_629_[i_624_] = is[i_616_][i_617_];
							if (is_632_ != null)
								is_632_[i_624_] = is_629_[i_624_];
							i_624_++;
							anInt5052 += -1179189233;
						}
					}
					int i_635_ = anIntArray5027.length;
					int[] is_636_ = new int[i_635_];
					int[] is_637_ = new int[i_635_];
					int[] is_638_ = class142_615_ != null ? new int[i_635_] : null;
					int[] is_639_ = (class142_615_ != null || null != class142_614_ ? new int[i_635_] : null);
					for (int i_640_ = 0; i_640_ < i_635_; i_640_++) {
						int i_641_ = anIntArray5027[i_640_];
						int i_642_ = anIntArray5028[i_640_];
						if (0 == i_619_) {
							is_636_[i_640_] = i_641_;
							is_637_[i_640_] = i_642_;
						} else if (1 == i_619_) {
							int i_643_ = i_641_;
							is_636_[i_640_] = i_642_;
							is_637_[i_640_] = 512 - i_643_;
						} else if (2 == i_619_) {
							is_636_[i_640_] = 512 - i_641_;
							is_637_[i_640_] = 512 - i_642_;
						} else if (i_619_ == 3) {
							int i_644_ = i_641_;
							is_636_[i_640_] = 512 - i_642_;
							is_637_[i_640_] = i_644_;
						}
						if (null != is_638_ && aBoolArrayArray5058[i_618_][i_640_]) {
							int i_645_ = (i_616_ << 9) + is_636_[i_640_];
							int i_646_ = (i_617_ << 9) + is_637_[i_640_];
							is_638_[i_640_] = (class142_615_.method2326(i_645_, i_646_, 868580444) - class142.method2326(i_645_, i_646_, -2111152079));
						}
						if (null != is_639_) {
							if (null != class142_615_ && !aBoolArrayArray5058[i_618_][i_640_]) {
								int i_647_ = (i_616_ << 9) + is_636_[i_640_];
								int i_648_ = is_637_[i_640_] + (i_617_ << 9);
								is_639_[i_640_] = (class142.method2326(i_647_, i_648_, -374658976) - (class142_615_.method2326(i_647_, i_648_, -1102296747)));
							} else if (null != class142_614_ && !(aBoolArrayArray5064[i_618_][i_640_])) {
								int i_649_ = is_636_[i_640_] + (i_616_ << 9);
								int i_650_ = (i_617_ << 9) + is_637_[i_640_];
								is_639_[i_640_] = (class142_614_.method2326(i_649_, i_650_, 1124555411) - class142.method2326(i_649_, i_650_, -1867089927));
							}
						}
					}
					int i_651_ = class142.method2321(i_616_, i_617_, 1641808176);
					int i_652_ = class142.method2321(1 + i_616_, i_617_, 1784217114);
					int i_653_ = class142.method2321(1 + i_616_, 1 + i_617_, 2107873031);
					int i_654_ = class142.method2321(i_616_, 1 + i_617_, 1968719845);
					boolean bool = aClass451_4982.method7282(i_616_, i_617_, -638715901);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_655_ = true;
						if (class7 != null && !class7.aBool53)
							bool_655_ = false;
						else if (0 == i_621_ && i_618_ != 0)
							bool_655_ = false;
						else if (i_620_ > 0 && null != class651_622_ && !class651_622_.aBool8382)
							bool_655_ = false;
						if (bool_655_ && i_651_ == i_652_ && i_653_ == i_651_ && i_654_ == i_651_)
							aByteArrayArrayArray5001[i][i_616_][i_617_] |= 0x4;
					}
					Class163 class163 = new Class163();
					if (aBool5022) {
						class163.anInt1776 = (aClass560_4983.method9258(i_616_, i_617_, (byte) 65) * -780986409);
						class163.anInt1775 = aClass560_4983.method9254(i_616_, i_617_, 16711935) * 2053161261;
						class163.anInt1774 = (aClass560_4983.method9301(i_616_, i_617_, 65535) * 1512945865);
						class163.anInt1778 = (aClass560_4983.method9260(i_616_, i_617_, (short) -12095) * -923094865);
						class163.anInt1777 = (aClass560_4983.method9261(i_616_, i_617_, (short) 25732) * -320151975);
						class163.anInt1773 = (aClass560_4983.method9329(i_616_, i_617_, 40000) * -58453511);
					}
					class142.method2323(i_616_, i_617_, is_636_, is_638_, is_637_, is_639_, is_626_, is_627_, is_628_, is_629_, is_632_, is_630_, is_631_, class163, false);
					aClass560_4983.method9330(i, i_616_, i_617_, (byte) 4);
				}
			}
		}
	}

	public final void method7371(Class523_Sub34 class523_sub34, int i, int i_656_, int i_657_, int i_658_) {
		int i_659_ = i + i_657_;
		int i_660_ = i_656_ + i_658_;
		for (int i_661_ = 0; i_661_ < anInt4990 * 1248554419; i_661_++) {
			for (int i_662_ = 0; i_662_ < 64; i_662_++) {
				for (int i_663_ = 0; i_663_ < 64; i_663_++)
					method7334(class523_sub34, i_661_, i_662_ + i, i_663_ + i_656_, 0, 0, i_662_ + i_659_, i_660_ + i_663_, 0, false, -999822360);
			}
		}
	}

	void method7372(Class178 class178, int i, int i_664_, int i_665_, int i_666_, int i_667_, Class7 class7, int i_668_, int i_669_, int i_670_, int i_671_, boolean[] bools, int[] is, int[] is_672_, int[] is_673_, int[] is_674_, int[] is_675_, int[] is_676_, int[] is_677_, int[] is_678_, int[][] is_679_, Class142 class142, Class142 class142_680_, Class142 class142_681_) {
		if (null != class7) {
			if (i_669_ == 0)
				i_669_ = i_668_;
			if (0 == i_670_)
				i_670_ = i_668_;
			if (i_671_ == 0)
				i_671_ = i_668_;
			Class7 class7_682_ = (Class7) aClass53_Sub5_4981.getDefinition(i_668_ - 1, (byte) 1);
			Class7 class7_683_ = (Class7) aClass53_Sub5_4981.getDefinition(i_669_ - 1, (byte) -53);
			Class7 class7_684_ = (Class7) aClass53_Sub5_4981.getDefinition(i_670_ - 1, (byte) 114);
			Class7 class7_685_ = (Class7) aClass53_Sub5_4981.getDefinition(i_671_ - 1, (byte) -43);
			for (int i_686_ = 0; i_686_ < anInt5062 * -461602405; i_686_++) {
				boolean bool = false;
				int i_687_;
				if (bools[0 - anInt5052 * 425193199 & 0x3] && anInt5053 * -183625315 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_687_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && anIntArray5009[2] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_687_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anInt5053 * -183625315 == anIntArray5009[1]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_687_ = 6;
				} else if (bools[3 - 425193199 * anInt5052 & 0x3] && anIntArray5009[3] == -183625315 * anInt5053) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[anInt5053 * -183625315];
					i_687_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_687_ = 3;
				}
				for (int i_688_ = 0; i_688_ < i_687_; i_688_++) {
					int i_689_ = anIntArray5044[i_688_];
					int i_690_ = i_689_ - anInt5052 * 850386398 & 0x7;
					int i_691_ = anIntArray5027[i_689_];
					int i_692_ = anIntArray5028[i_689_];
					int i_693_;
					int i_694_;
					if (1 == anInt5052 * 425193199) {
						i_693_ = i_692_;
						i_694_ = 512 - i_691_;
					} else if (2 == 425193199 * anInt5052) {
						i_693_ = 512 - i_691_;
						i_694_ = 512 - i_692_;
					} else if (anInt5052 * 425193199 == 3) {
						i_693_ = 512 - i_692_;
						i_694_ = i_691_;
					} else {
						i_693_ = i_691_;
						i_694_ = i_692_;
					}
					is_672_[anInt5054 * 1415532205] = i_693_;
					is_673_[anInt5054 * 1415532205] = i_694_;
					if (null != is_677_ && (aBoolArrayArray5058[-366854495 * anInt5051][i_689_])) {
						int i_695_ = (i_664_ << 9) + i_693_;
						int i_696_ = i_694_ + (i_665_ << 9);
						is_677_[anInt5054 * 1415532205] = (class142_680_.method2326(i_695_, i_696_, -1295070014) - class142.method2326(i_695_, i_696_, -1260022042));
					}
					if (is_678_ != null) {
						if (null != class142_680_ && !(aBoolArrayArray5058[-366854495 * anInt5051][i_689_])) {
							int i_697_ = i_693_ + (i_664_ << 9);
							int i_698_ = (i_665_ << 9) + i_694_;
							is_678_[1415532205 * anInt5054] = (class142.method2326(i_697_, i_698_, 1481783569) - class142_680_.method2326(i_697_, i_698_, -1538598323));
						} else if (class142_681_ != null && !(aBoolArrayArray5064[-366854495 * anInt5051][i_689_])) {
							int i_699_ = i_693_ + (i_664_ << 9);
							int i_700_ = (i_665_ << 9) + i_694_;
							is_678_[1415532205 * anInt5054] = (class142_681_.method2326(i_699_, i_700_, 1844809866) - class142.method2326(i_699_, i_700_, 2108458172));
						}
					}
					if (i_689_ < 8 && anIntArray5049[i_690_] >= 0) {
						if (is != null)
							is[1415532205 * anInt5054] = anIntArray5046[i_690_];
						is_676_[anInt5054 * 1415532205] = anIntArray5048[i_690_];
						is_675_[anInt5054 * 1415532205] = anIntArray5047[i_690_];
						is_674_[anInt5054 * 1415532205] = anIntArray5045[i_690_];
					} else {
						if (aBool5060 && (aBoolArrayArray5058[anInt5051 * -366854495][i_689_])) {
							is_675_[anInt5054 * 1415532205] = -74375463 * anInt5055;
							is_676_[1415532205 * anInt5054] = 679896617 * anInt5056;
							is_674_[1415532205 * anInt5054] = -1886607527 * anInt5023;
						} else if (i_693_ == 0 && 0 == i_694_) {
							is_674_[1415532205 * anInt5054] = is_679_[i_664_][i_665_];
							is_675_[1415532205 * anInt5054] = class7_682_.anInt56 * -609411693;
							is_676_[anInt5054 * 1415532205] = 424256487 * class7_682_.anInt49;
						} else if (i_693_ == 0 && i_694_ == 512) {
							is_674_[anInt5054 * 1415532205] = is_679_[i_664_][i_667_];
							is_675_[1415532205 * anInt5054] = class7_683_.anInt56 * -609411693;
							is_676_[1415532205 * anInt5054] = class7_683_.anInt49 * 424256487;
						} else if (512 == i_693_ && 512 == i_694_) {
							is_674_[1415532205 * anInt5054] = is_679_[i_666_][i_667_];
							is_675_[anInt5054 * 1415532205] = -609411693 * class7_684_.anInt56;
							is_676_[anInt5054 * 1415532205] = class7_684_.anInt49 * 424256487;
						} else if (512 == i_693_ && i_694_ == 0) {
							is_674_[1415532205 * anInt5054] = is_679_[i_666_][i_665_];
							is_675_[1415532205 * anInt5054] = -609411693 * class7_685_.anInt56;
							is_676_[1415532205 * anInt5054] = 424256487 * class7_685_.anInt49;
						} else {
							if (i_693_ < 256) {
								if (i_694_ < 256) {
									is_675_[anInt5054 * 1415532205] = -609411693 * class7_682_.anInt56;
									is_676_[anInt5054 * 1415532205] = class7_682_.anInt49 * 424256487;
								} else {
									is_675_[1415532205 * anInt5054] = -609411693 * class7_683_.anInt56;
									is_676_[1415532205 * anInt5054] = 424256487 * class7_683_.anInt49;
								}
							} else if (i_694_ < 256) {
								is_675_[anInt5054 * 1415532205] = class7_685_.anInt56 * -609411693;
								is_676_[1415532205 * anInt5054] = class7_685_.anInt49 * 424256487;
							} else {
								is_675_[1415532205 * anInt5054] = -609411693 * class7_684_.anInt56;
								is_676_[1415532205 * anInt5054] = class7_684_.anInt49 * 424256487;
							}
							int i_701_ = Class102.method1799(is_679_[i_664_][i_665_], is_679_[i_666_][i_665_], i_693_ << 7 >> 9, 1367416429);
							int i_702_ = Class102.method1799(is_679_[i_664_][i_667_], is_679_[i_666_][i_667_], i_693_ << 7 >> 9, 870398049);
							is_674_[1415532205 * anInt5054] = Class102.method1799(i_701_, i_702_, i_694_ << 7 >> 9, -2135324647);
						}
						if (is != null)
							is[1415532205 * anInt5054] = is_674_[anInt5054 * 1415532205];
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (0 != anInt5051 * -366854495 && class7.aBool52)
				aBool4980 = true;
		}
	}

	int method7373(int i, int i_703_, int i_704_, int i_705_, int i_706_, Class142 class142, short[][] is) {
		if ((-366854495 * anInt5051 == 0 || 12 == anInt5051 * -366854495) && i_703_ > 0 && i_704_ > 0 && i_703_ < -1287541105 * anInt4991 && i_704_ < anInt4984 * -215635651) {
			int i_707_ = 0;
			int i_708_ = 0;
			int i_709_ = 0;
			int i_710_ = 0;
			i_707_ = i_707_ + (i == is[i_703_ - 1][i_704_ - 1] ? 1 : -1);
			i_708_ = i_708_ + (i == is[i_705_][i_704_ - 1] ? 1 : -1);
			i_709_ = i_709_ + (is[i_705_][i_706_] == i ? 1 : -1);
			i_710_ = i_710_ + (is[i_703_ - 1][i_706_] == i ? 1 : -1);
			if (is[i_703_][i_704_ - 1] == i) {
				i_707_++;
				i_708_++;
			} else {
				i_707_--;
				i_708_--;
			}
			if (is[i_705_][i_704_] == i) {
				i_708_++;
				i_709_++;
			} else {
				i_708_--;
				i_709_--;
			}
			if (is[i_703_][i_706_] == i) {
				i_709_++;
				i_710_++;
			} else {
				i_709_--;
				i_710_--;
			}
			if (is[i_703_ - 1][i_704_] == i) {
				i_710_++;
				i_707_++;
			} else {
				i_710_--;
				i_707_--;
			}
			int i_711_ = i_707_ - i_709_;
			if (i_711_ < 0)
				i_711_ = -i_711_;
			int i_712_ = i_708_ - i_710_;
			if (i_712_ < 0)
				i_712_ = -i_712_;
			if (i_712_ == i_711_) {
				i_711_ = (class142.method2321(i_703_, i_704_, 1857161228) - class142.method2321(i_705_, i_706_, 1967047198));
				if (i_711_ < 0)
					i_711_ = -i_711_;
				i_712_ = (class142.method2321(i_705_, i_704_, 1922995855) - class142.method2321(i_703_, i_706_, 1789779363));
				if (i_712_ < 0)
					i_712_ = -i_712_;
			}
			return i_711_ < i_712_ ? 1 : 0;
		}
		return 425193199 * anInt5052;
	}

	void method7374(Class178 class178, int i, int i_713_, int i_714_, Class651 class651, boolean[] bools, int[] is, int[] is_715_, int[] is_716_, int[] is_717_, int[] is_718_, int[] is_719_, int[] is_720_, int[] is_721_, Class142 class142, Class142 class142_722_, Class142 class142_723_) {
		anInt5023 = -1041445097;
		anInt5055 = -17269097;
		anInt5056 = 1687558400;
		if (null != class651) {
			anInt5023 = -1630537831 * class651.anInt8383;
			anInt5055 = class651.anInt8394 * 1340203869;
			anInt5056 = 780116687 * class651.anInt8387;
			int i_724_ = Class386.method6456(class178, class651, 365785327);
			for (int i_725_ = 0; i_725_ < 613557105 * anInt5063; i_725_++) {
				boolean bool = false;
				int i_726_;
				if (bools[0 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_726_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[2]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_726_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anIntArray5009[1] == anInt5053 * -183625315) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_726_ = 6;
				} else if (bools[3 - anInt5052 * 425193199 & 0x3] && -183625315 * anInt5053 == anIntArray5009[3]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_726_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_726_ = 3;
				}
				for (int i_727_ = 0; i_727_ < i_726_; i_727_++) {
					int i_728_ = anIntArray5044[i_727_];
					int i_729_ = i_728_ - 850386398 * anInt5052 & 0x7;
					int i_730_ = anIntArray5027[i_728_];
					int i_731_ = anIntArray5028[i_728_];
					int i_732_;
					int i_733_;
					if (1 == 425193199 * anInt5052) {
						i_732_ = i_731_;
						i_733_ = 512 - i_730_;
					} else if (425193199 * anInt5052 == 2) {
						i_732_ = 512 - i_730_;
						i_733_ = 512 - i_731_;
					} else if (3 == anInt5052 * 425193199) {
						i_732_ = 512 - i_731_;
						i_733_ = i_730_;
					} else {
						i_732_ = i_730_;
						i_733_ = i_731_;
					}
					is_715_[1415532205 * anInt5054] = i_732_;
					is_716_[anInt5054 * 1415532205] = i_733_;
					if (null != is_720_ && (aBoolArrayArray5058[anInt5051 * -366854495][i_728_])) {
						int i_734_ = i_732_ + (i_713_ << 9);
						int i_735_ = i_733_ + (i_714_ << 9);
						is_720_[1415532205 * anInt5054] = (class142_722_.method2326(i_734_, i_735_, -902695233) - class142.method2326(i_734_, i_735_, -1242148236));
					}
					if (is_721_ != null) {
						if (class142_722_ != null && !(aBoolArrayArray5058[-366854495 * anInt5051][i_728_])) {
							int i_736_ = (i_713_ << 9) + i_732_;
							int i_737_ = i_733_ + (i_714_ << 9);
							is_721_[anInt5054 * 1415532205] = (class142.method2326(i_736_, i_737_, -174413555) - class142_722_.method2326(i_736_, i_737_, 1796142128));
						} else if (null != class142_723_ && !(aBoolArrayArray5064[-366854495 * anInt5051][i_728_])) {
							int i_738_ = (i_713_ << 9) + i_732_;
							int i_739_ = (i_714_ << 9) + i_733_;
							is_721_[1415532205 * anInt5054] = (class142_723_.method2326(i_738_, i_739_, -1149057435) - class142.method2326(i_738_, i_739_, -1083555650));
						}
					}
					if (i_728_ < 8 && (anIntArray5049[i_729_] > class651.anInt8385 * 486905283)) {
						if (null != is)
							is[anInt5054 * 1415532205] = anIntArray5046[i_729_];
						is_719_[anInt5054 * 1415532205] = anIntArray5048[i_729_];
						is_718_[anInt5054 * 1415532205] = anIntArray5047[i_729_];
						is_717_[1415532205 * anInt5054] = anIntArray5045[i_729_];
					} else {
						if (null != is)
							is[1415532205 * anInt5054] = i_724_;
						is_718_[anInt5054 * 1415532205] = class651.anInt8394 * 634101717;
						is_719_[1415532205 * anInt5054] = -576090841 * class651.anInt8387;
						is_717_[anInt5054 * 1415532205] = -1886607527 * anInt5023;
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (!aBool5022 && i == 0)
				aClass560_4983.method9263(i_713_, i_714_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, -134620943 * class651.anInt8388, class651.anInt8395 * 19373761, class651.anInt8396 * 2062212613, (byte) -64);
			if (anInt5051 * -366854495 != 12 && -1082268879 * class651.anInt8383 != -1 && class651.aBool8390)
				aBool4980 = true;
		} else if (aBool5000)
			anInt5053 += 1357132981 * anIntArray5021[anInt5051 * -366854495];
		else if (aBool5060)
			anInt5053 += 1357132981 * anIntArray5036[anInt5051 * -366854495];
		else
			anInt5053 += anIntArray5050[-366854495 * anInt5051] * 1357132981;
	}

	int method7375(int i, int i_740_, int i_741_, int i_742_, int i_743_, Class142 class142, short[][] is) {
		if ((-366854495 * anInt5051 == 0 || 12 == anInt5051 * -366854495) && i_740_ > 0 && i_741_ > 0 && i_740_ < -1287541105 * anInt4991 && i_741_ < anInt4984 * -215635651) {
			int i_744_ = 0;
			int i_745_ = 0;
			int i_746_ = 0;
			int i_747_ = 0;
			i_744_ = i_744_ + (i == is[i_740_ - 1][i_741_ - 1] ? 1 : -1);
			i_745_ = i_745_ + (i == is[i_742_][i_741_ - 1] ? 1 : -1);
			i_746_ = i_746_ + (is[i_742_][i_743_] == i ? 1 : -1);
			i_747_ = i_747_ + (is[i_740_ - 1][i_743_] == i ? 1 : -1);
			if (is[i_740_][i_741_ - 1] == i) {
				i_744_++;
				i_745_++;
			} else {
				i_744_--;
				i_745_--;
			}
			if (is[i_742_][i_741_] == i) {
				i_745_++;
				i_746_++;
			} else {
				i_745_--;
				i_746_--;
			}
			if (is[i_740_][i_743_] == i) {
				i_746_++;
				i_747_++;
			} else {
				i_746_--;
				i_747_--;
			}
			if (is[i_740_ - 1][i_741_] == i) {
				i_747_++;
				i_744_++;
			} else {
				i_747_--;
				i_744_--;
			}
			int i_748_ = i_744_ - i_746_;
			if (i_748_ < 0)
				i_748_ = -i_748_;
			int i_749_ = i_745_ - i_747_;
			if (i_749_ < 0)
				i_749_ = -i_749_;
			if (i_749_ == i_748_) {
				i_748_ = (class142.method2321(i_740_, i_741_, 1664929878) - class142.method2321(i_742_, i_743_, 2099202117));
				if (i_748_ < 0)
					i_748_ = -i_748_;
				i_749_ = (class142.method2321(i_742_, i_741_, 1901560501) - class142.method2321(i_740_, i_743_, 2089284638));
				if (i_749_ < 0)
					i_749_ = -i_749_;
			}
			return i_748_ < i_749_ ? 1 : 0;
		}
		return 425193199 * anInt5052;
	}

	void method7376(Class178 class178, Class651 class651, Class7 class7, int i, int i_750_, byte[][] is, byte[][] is_751_, short[][] is_752_, boolean[] bools) {
		boolean[] bools_753_ = (class651 != null && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		method7346(class178, class651, class7, i, i_750_, -1287541105 * anInt4991, anInt4984 * -215635651, is_752_, is, is_751_, bools, -2134316234);
		aBool5061 = class651 != null && (-1082268879 * class651.anInt8383 != class651.anInt8386 * 99640975);
		if (!aBool5061) {
			for (int i_754_ = 0; i_754_ < 8; i_754_++) {
				if (anIntArray5049[i_754_] >= 0 && anIntArray5046[i_754_] != anIntArray5045[i_754_]) {
					aBool5061 = true;
					break;
				}
			}
		}
		if (!bools_753_[anInt5052 * 425193199 + 1 & 0x3]) {
			boolean[] bools_755_ = bools;
			int i_756_ = 1;
			bools_755_[i_756_] = (bools_755_[i_756_] | (anIntArray5032[2] & anIntArray5032[4]) == 0);
		}
		if (!bools_753_[425193199 * anInt5052 + 3 & 0x3]) {
			boolean[] bools_757_ = bools;
			int i_758_ = 3;
			bools_757_[i_758_] = bools_757_[i_758_] | 0 == (anIntArray5032[6] & anIntArray5032[0]);
		}
		if (!bools_753_[anInt5052 * 425193199 + 0 & 0x3]) {
			boolean[] bools_759_ = bools;
			int i_760_ = 0;
			bools_759_[i_760_] = bools_759_[i_760_] | 0 == (anIntArray5032[0] & anIntArray5032[2]);
		}
		if (!bools_753_[2 + anInt5052 * 425193199 & 0x3]) {
			boolean[] bools_761_ = bools;
			int i_762_ = 2;
			bools_761_[i_762_] = (bools_761_[i_762_] | (anIntArray5032[4] & anIntArray5032[6]) == 0);
		}
		if (!aBool5060 && (-366854495 * anInt5051 == 0 || anInt5051 * -366854495 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_763_ = bools;
				bools[3] = false;
				bools_763_[0] = false;
				anInt5051 = (anInt5051 * -366854495 == 0 ? 13 : 14) * -1873205919;
				anInt5052 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_764_ = bools;
				bools[1] = false;
				bools_764_[0] = false;
				anInt5051 = (0 == anInt5051 * -366854495 ? 13 : 14) * -1873205919;
				anInt5052 = 757399597;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_765_ = bools;
				bools[2] = false;
				bools_765_[1] = false;
				anInt5051 = -1873205919 * (anInt5051 * -366854495 == 0 ? 13 : 14);
				anInt5052 = 1936588830;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_766_ = bools;
				bools[3] = false;
				bools_766_[2] = false;
				anInt5051 = -1873205919 * (-366854495 * anInt5051 == 0 ? 13 : 14);
				anInt5052 = -1179189233;
			}
		}
	}

	static final int method7377(int i, int i_767_) {
		int i_768_ = (Class53_Sub19.method17231(45365 + i, i_767_ + 91923, 4, 1014439817) - 128 + (Class53_Sub19.method17231(i + 10294, i_767_ + 37821, 2, 1014439817) - 128 >> 1) + (Class53_Sub19.method17231(i, i_767_, 1, 1014439817) - 128 >> 2));
		i_768_ = (int) (0.3 * (double) i_768_) + 35;
		if (i_768_ < 10)
			i_768_ = 10;
		else if (i_768_ > 60)
			i_768_ = 60;
		return i_768_;
	}

	void method7378(Class178 class178, int i, int i_769_, int i_770_, Class651 class651, boolean[] bools, int[] is, int[] is_771_, int[] is_772_, int[] is_773_, int[] is_774_, int[] is_775_, int[] is_776_, int[] is_777_, Class142 class142, Class142 class142_778_, Class142 class142_779_) {
		anInt5023 = -1041445097;
		anInt5055 = -17269097;
		anInt5056 = 1687558400;
		if (null != class651) {
			anInt5023 = -1630537831 * class651.anInt8383;
			anInt5055 = class651.anInt8394 * 1340203869;
			anInt5056 = 780116687 * class651.anInt8387;
			int i_780_ = Class386.method6456(class178, class651, 2049385287);
			for (int i_781_ = 0; i_781_ < 613557105 * anInt5063; i_781_++) {
				boolean bool = false;
				int i_782_;
				if (bools[0 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_782_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[2]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_782_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anIntArray5009[1] == anInt5053 * -183625315) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_782_ = 6;
				} else if (bools[3 - anInt5052 * 425193199 & 0x3] && -183625315 * anInt5053 == anIntArray5009[3]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_782_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_782_ = 3;
				}
				for (int i_783_ = 0; i_783_ < i_782_; i_783_++) {
					int i_784_ = anIntArray5044[i_783_];
					int i_785_ = i_784_ - 850386398 * anInt5052 & 0x7;
					int i_786_ = anIntArray5027[i_784_];
					int i_787_ = anIntArray5028[i_784_];
					int i_788_;
					int i_789_;
					if (1 == 425193199 * anInt5052) {
						i_788_ = i_787_;
						i_789_ = 512 - i_786_;
					} else if (425193199 * anInt5052 == 2) {
						i_788_ = 512 - i_786_;
						i_789_ = 512 - i_787_;
					} else if (3 == anInt5052 * 425193199) {
						i_788_ = 512 - i_787_;
						i_789_ = i_786_;
					} else {
						i_788_ = i_786_;
						i_789_ = i_787_;
					}
					is_771_[1415532205 * anInt5054] = i_788_;
					is_772_[anInt5054 * 1415532205] = i_789_;
					if (null != is_776_ && (aBoolArrayArray5058[anInt5051 * -366854495][i_784_])) {
						int i_790_ = i_788_ + (i_769_ << 9);
						int i_791_ = i_789_ + (i_770_ << 9);
						is_776_[1415532205 * anInt5054] = (class142_778_.method2326(i_790_, i_791_, 375090103) - class142.method2326(i_790_, i_791_, -1352410952));
					}
					if (is_777_ != null) {
						if (class142_778_ != null && !(aBoolArrayArray5058[-366854495 * anInt5051][i_784_])) {
							int i_792_ = (i_769_ << 9) + i_788_;
							int i_793_ = i_789_ + (i_770_ << 9);
							is_777_[anInt5054 * 1415532205] = (class142.method2326(i_792_, i_793_, -1774815740) - class142_778_.method2326(i_792_, i_793_, -1126011698));
						} else if (null != class142_779_ && !(aBoolArrayArray5064[-366854495 * anInt5051][i_784_])) {
							int i_794_ = (i_769_ << 9) + i_788_;
							int i_795_ = (i_770_ << 9) + i_789_;
							is_777_[1415532205 * anInt5054] = (class142_779_.method2326(i_794_, i_795_, -1398189122) - class142.method2326(i_794_, i_795_, 148394791));
						}
					}
					if (i_784_ < 8 && (anIntArray5049[i_785_] > class651.anInt8385 * 486905283)) {
						if (null != is)
							is[anInt5054 * 1415532205] = anIntArray5046[i_785_];
						is_775_[anInt5054 * 1415532205] = anIntArray5048[i_785_];
						is_774_[anInt5054 * 1415532205] = anIntArray5047[i_785_];
						is_773_[1415532205 * anInt5054] = anIntArray5045[i_785_];
					} else {
						if (null != is)
							is[1415532205 * anInt5054] = i_780_;
						is_774_[anInt5054 * 1415532205] = class651.anInt8394 * 634101717;
						is_775_[1415532205 * anInt5054] = -576090841 * class651.anInt8387;
						is_773_[anInt5054 * 1415532205] = -1886607527 * anInt5023;
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (!aBool5022 && i == 0)
				aClass560_4983.method9263(i_769_, i_770_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, -134620943 * class651.anInt8388, class651.anInt8395 * 19373761, class651.anInt8396 * 2062212613, (byte) -79);
			if (anInt5051 * -366854495 != 12 && -1082268879 * class651.anInt8383 != -1 && class651.aBool8390)
				aBool4980 = true;
		} else if (aBool5000)
			anInt5053 += 1357132981 * anIntArray5021[anInt5051 * -366854495];
		else if (aBool5060)
			anInt5053 += 1357132981 * anIntArray5036[anInt5051 * -366854495];
		else
			anInt5053 += anIntArray5050[-366854495 * anInt5051] * 1357132981;
	}

	public final void method7379(int i, int[][] is, byte i_796_) {
		int[][] is_797_ = anIntArrayArrayArray5033[i];
		for (int i_798_ = 0; i_798_ < anInt4991 * -1287541105 + 1; i_798_++) {
			for (int i_799_ = 0; i_799_ < 1 + anInt4984 * -215635651; i_799_++)
				is_797_[i_798_][i_799_] += is[i_798_][i_799_];
		}
	}

	void method7380(Class651 class651, Class7 class7) {
		if (aBool5000) {
			anIntArray4999 = anIntArrayArray5031[-366854495 * anInt5051];
			anIntArray4992 = anIntArrayArray5019[anInt5051 * -366854495];
			anIntArray5066 = anIntArrayArray5016[-366854495 * anInt5051];
			anInt5063 = -280478319 * (null != class651 ? anIntArray5021[anInt5051 * -366854495] : 0);
			anInt5062 = (class7 != null ? anIntArray4996[anInt5051 * -366854495] : 0) * 1209531539;
		} else if (aBool5060) {
			anIntArray4999 = anIntArrayArray5041[anInt5051 * -366854495];
			anIntArray4992 = anIntArrayArray5042[-366854495 * anInt5051];
			anIntArray5066 = anIntArrayArray5043[-366854495 * anInt5051];
			anInt5063 = -280478319 * (null != class651 ? anIntArray5036[-366854495 * anInt5051] : 0);
			anInt5062 = 1209531539 * (null != class7 ? anIntArray5025[-366854495 * anInt5051] : 0);
			anIntArray5009 = anIntArrayArray5040[anInt5051 * -366854495];
		} else {
			anIntArray4999 = anIntArrayArray5067[-366854495 * anInt5051];
			anIntArray4992 = anIntArrayArray5037[anInt5051 * -366854495];
			anIntArray5066 = anIntArrayArray4993[-366854495 * anInt5051];
			anInt5063 = (null != class651 ? anIntArray5050[anInt5051 * -366854495] : 0) * -280478319;
			anInt5062 = (null != class7 ? anIntArray5024[-366854495 * anInt5051] : 0) * 1209531539;
			anIntArray5009 = anIntArrayArray5035[-366854495 * anInt5051];
		}
	}

	static final int method7381(int i, int i_800_, int i_801_) {
		int i_802_ = i / i_801_;
		int i_803_ = i & i_801_ - 1;
		int i_804_ = i_800_ / i_801_;
		int i_805_ = i_800_ & i_801_ - 1;
		int i_806_ = Class310.method5635(i_802_, i_804_, 1878801744);
		int i_807_ = Class310.method5635(1 + i_802_, i_804_, 1878801744);
		int i_808_ = Class310.method5635(i_802_, i_804_ + 1, 1878801744);
		int i_809_ = Class310.method5635(1 + i_802_, 1 + i_804_, 1878801744);
		int i_810_ = Class501.method8140(i_806_, i_807_, i_803_, i_801_, -1773657286);
		int i_811_ = Class501.method8140(i_808_, i_809_, i_803_, i_801_, -1773657286);
		return Class501.method8140(i_810_, i_811_, i_805_, i_801_, -1773657286);
	}

	int method7382(int i, int i_812_, int i_813_, int i_814_, int i_815_, Class142 class142, short[][] is) {
		if ((-366854495 * anInt5051 == 0 || 12 == anInt5051 * -366854495) && i_812_ > 0 && i_813_ > 0 && i_812_ < -1287541105 * anInt4991 && i_813_ < anInt4984 * -215635651) {
			int i_816_ = 0;
			int i_817_ = 0;
			int i_818_ = 0;
			int i_819_ = 0;
			i_816_ = i_816_ + (i == is[i_812_ - 1][i_813_ - 1] ? 1 : -1);
			i_817_ = i_817_ + (i == is[i_814_][i_813_ - 1] ? 1 : -1);
			i_818_ = i_818_ + (is[i_814_][i_815_] == i ? 1 : -1);
			i_819_ = i_819_ + (is[i_812_ - 1][i_815_] == i ? 1 : -1);
			if (is[i_812_][i_813_ - 1] == i) {
				i_816_++;
				i_817_++;
			} else {
				i_816_--;
				i_817_--;
			}
			if (is[i_814_][i_813_] == i) {
				i_817_++;
				i_818_++;
			} else {
				i_817_--;
				i_818_--;
			}
			if (is[i_812_][i_815_] == i) {
				i_818_++;
				i_819_++;
			} else {
				i_818_--;
				i_819_--;
			}
			if (is[i_812_ - 1][i_813_] == i) {
				i_819_++;
				i_816_++;
			} else {
				i_819_--;
				i_816_--;
			}
			int i_820_ = i_816_ - i_818_;
			if (i_820_ < 0)
				i_820_ = -i_820_;
			int i_821_ = i_817_ - i_819_;
			if (i_821_ < 0)
				i_821_ = -i_821_;
			if (i_821_ == i_820_) {
				i_820_ = (class142.method2321(i_812_, i_813_, 1560519367) - class142.method2321(i_814_, i_815_, 1591080725));
				if (i_820_ < 0)
					i_820_ = -i_820_;
				i_821_ = (class142.method2321(i_814_, i_813_, 1557250446) - class142.method2321(i_812_, i_815_, 1765021153));
				if (i_821_ < 0)
					i_821_ = -i_821_;
			}
			return i_820_ < i_821_ ? 1 : 0;
		}
		return 425193199 * anInt5052;
	}

	void method7383(Class178 class178, int i, int i_822_, int i_823_, Class651 class651, boolean[] bools, int[] is, int[] is_824_, int[] is_825_, int[] is_826_, int[] is_827_, int[] is_828_, int[] is_829_, int[] is_830_, Class142 class142, Class142 class142_831_, Class142 class142_832_) {
		anInt5023 = -1041445097;
		anInt5055 = -17269097;
		anInt5056 = 1687558400;
		if (null != class651) {
			anInt5023 = -1630537831 * class651.anInt8383;
			anInt5055 = class651.anInt8394 * 1340203869;
			anInt5056 = 780116687 * class651.anInt8387;
			int i_833_ = Class386.method6456(class178, class651, 1850896319);
			for (int i_834_ = 0; i_834_ < 613557105 * anInt5063; i_834_++) {
				boolean bool = false;
				int i_835_;
				if (bools[0 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[0]) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 1;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 1;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_835_ = 6;
				} else if (bools[2 - 425193199 * anInt5052 & 0x3] && -183625315 * anInt5053 == anIntArray5009[2]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 5;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 5;
					anIntArray5044[4] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_835_ = 6;
				} else if (bools[1 - 425193199 * anInt5052 & 0x3] && anIntArray5009[1] == anInt5053 * -183625315) {
					anIntArray5044[0] = anIntArray4999[anInt5053 * -183625315];
					anIntArray5044[1] = 3;
					anIntArray5044[2] = anIntArray5066[anInt5053 * -183625315];
					anIntArray5044[3] = 3;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_835_ = 6;
				} else if (bools[3 - anInt5052 * 425193199 & 0x3] && -183625315 * anInt5053 == anIntArray5009[3]) {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = 7;
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					anIntArray5044[3] = 7;
					anIntArray5044[4] = anIntArray4992[-183625315 * anInt5053];
					anIntArray5044[5] = anIntArray5066[-183625315 * anInt5053];
					i_835_ = 6;
				} else {
					anIntArray5044[0] = anIntArray4999[-183625315 * anInt5053];
					anIntArray5044[1] = anIntArray4992[anInt5053 * -183625315];
					anIntArray5044[2] = anIntArray5066[-183625315 * anInt5053];
					i_835_ = 3;
				}
				for (int i_836_ = 0; i_836_ < i_835_; i_836_++) {
					int i_837_ = anIntArray5044[i_836_];
					int i_838_ = i_837_ - 850386398 * anInt5052 & 0x7;
					int i_839_ = anIntArray5027[i_837_];
					int i_840_ = anIntArray5028[i_837_];
					int i_841_;
					int i_842_;
					if (1 == 425193199 * anInt5052) {
						i_841_ = i_840_;
						i_842_ = 512 - i_839_;
					} else if (425193199 * anInt5052 == 2) {
						i_841_ = 512 - i_839_;
						i_842_ = 512 - i_840_;
					} else if (3 == anInt5052 * 425193199) {
						i_841_ = 512 - i_840_;
						i_842_ = i_839_;
					} else {
						i_841_ = i_839_;
						i_842_ = i_840_;
					}
					is_824_[1415532205 * anInt5054] = i_841_;
					is_825_[anInt5054 * 1415532205] = i_842_;
					if (null != is_829_ && (aBoolArrayArray5058[anInt5051 * -366854495][i_837_])) {
						int i_843_ = i_841_ + (i_822_ << 9);
						int i_844_ = i_842_ + (i_823_ << 9);
						is_829_[1415532205 * anInt5054] = (class142_831_.method2326(i_843_, i_844_, -1475379507) - class142.method2326(i_843_, i_844_, 1105144942));
					}
					if (is_830_ != null) {
						if (class142_831_ != null && !(aBoolArrayArray5058[-366854495 * anInt5051][i_837_])) {
							int i_845_ = (i_822_ << 9) + i_841_;
							int i_846_ = i_842_ + (i_823_ << 9);
							is_830_[anInt5054 * 1415532205] = (class142.method2326(i_845_, i_846_, 1419522597) - class142_831_.method2326(i_845_, i_846_, -1883454061));
						} else if (null != class142_832_ && !(aBoolArrayArray5064[-366854495 * anInt5051][i_837_])) {
							int i_847_ = (i_822_ << 9) + i_841_;
							int i_848_ = (i_823_ << 9) + i_842_;
							is_830_[1415532205 * anInt5054] = (class142_832_.method2326(i_847_, i_848_, 1865086135) - class142.method2326(i_847_, i_848_, -1122094194));
						}
					}
					if (i_837_ < 8 && (anIntArray5049[i_838_] > class651.anInt8385 * 486905283)) {
						if (null != is)
							is[anInt5054 * 1415532205] = anIntArray5046[i_838_];
						is_828_[anInt5054 * 1415532205] = anIntArray5048[i_838_];
						is_827_[anInt5054 * 1415532205] = anIntArray5047[i_838_];
						is_826_[1415532205 * anInt5054] = anIntArray5045[i_838_];
					} else {
						if (null != is)
							is[1415532205 * anInt5054] = i_833_;
						is_827_[anInt5054 * 1415532205] = class651.anInt8394 * 634101717;
						is_828_[1415532205 * anInt5054] = -576090841 * class651.anInt8387;
						is_826_[anInt5054 * 1415532205] = -1886607527 * anInt5023;
					}
					anInt5054 += -1346812635;
				}
				anInt5053 += 1357132981;
			}
			if (!aBool5022 && i == 0)
				aClass560_4983.method9263(i_822_, i_823_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, -134620943 * class651.anInt8388, class651.anInt8395 * 19373761, class651.anInt8396 * 2062212613, (byte) -38);
			if (anInt5051 * -366854495 != 12 && -1082268879 * class651.anInt8383 != -1 && class651.aBool8390)
				aBool4980 = true;
		} else if (aBool5000)
			anInt5053 += 1357132981 * anIntArray5021[anInt5051 * -366854495];
		else if (aBool5060)
			anInt5053 += 1357132981 * anIntArray5036[anInt5051 * -366854495];
		else
			anInt5053 += anIntArray5050[-366854495 * anInt5051] * 1357132981;
	}

	public void method7384(Class178 class178, int[][][] is) {
		for (int i = 0; i < anInt4990 * 1248554419; i++) {
			int i_849_ = 0;
			int i_850_ = 0;
			if (!aBool5022) {
				if (aBool4986)
					i_850_ |= 0x8;
				if (aBool4987)
					i_849_ |= 0x2;
				if (anInt4985 * -841434311 != 0) {
					i_849_ |= 0x1;
					i_850_ |= 0x10;
				}
			}
			if (aBool4987)
				i_850_ |= 0x7;
			if (!aBool4989)
				i_850_ |= 0x20;
			int[][] is_851_ = (null != is && i < is.length ? is[i] : anIntArrayArrayArray5033[i]);
			aClass560_4983.method9256(i, class178.method3082(anInt4991 * -1287541105, -215635651 * anInt4984, anIntArrayArrayArray5033[i], is_851_, 512, i_849_, i_850_), (byte) 6);
		}
	}

	static final int method7385(int i, int i_852_) {
		int i_853_ = 57 * i_852_ + i;
		i_853_ = i_853_ << 13 ^ i_853_;
		int i_854_ = (1376312589 + (789221 + 15731 * (i_853_ * i_853_)) * i_853_ & 0x7fffffff);
		return i_854_ >> 19 & 0xff;
	}

	void method7386(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_855_, Class142 class142_856_) {
		for (int i_857_ = 0; i_857_ < anInt4991 * -1287541105; i_857_++) {
			for (int i_858_ = 0; i_858_ < -215635651 * anInt4984; i_858_++) {
				byte i_859_ = aByteArrayArrayArray4997[i][i_857_][i_858_];
				byte i_860_ = aByteArrayArrayArray4998[i][i_857_][i_858_];
				int i_861_ = aShortArrayArrayArray5013[i][i_857_][i_858_] & 0x7fff;
				int i_862_ = aShortArrayArrayArray5057[i][i_857_][i_858_] & 0x7fff;
				Class651 class651 = ((Class651) (0 != i_861_ ? aClass53_Sub12_5006.getDefinition(i_861_ - 1, (byte) -44) : null));
				Class7 class7 = ((Class7) (0 != i_862_ ? aClass53_Sub5_4981.getDefinition(i_862_ - 1, (byte) -107) : null));
				if (i_859_ == 0 && class651 == null)
					i_859_ = (byte) 12;
				Class651 class651_863_ = class651;
				if (null != class651 && -1 == class651.anInt8383 * -1082268879 && class651.anInt8386 * 99640975 == -1) {
					class651_863_ = class651;
					class651 = null;
				}
				if (null != class651 || class7 != null) {
					anInt5062 = anIntArray4996[i_859_] * 1209531539;
					anInt5063 = -280478319 * anIntArray5021[i_859_];
					int i_864_ = ((class7 != null ? anInt5062 * -461602405 : 0) + (null != class651 ? 613557105 * anInt5063 : 0));
					int i_865_ = 0;
					anInt5052 = 0;
					anInt5055 = (null != class651 ? 634101717 * class651.anInt8394 : -1) * 17269097;
					int i_866_ = class7 != null ? -609411693 * class7.anInt56 : -1;
					int[] is_867_ = new int[i_864_];
					int[] is_868_ = new int[i_864_];
					int[] is_869_ = new int[i_864_];
					int[] is_870_ = new int[i_864_];
					int[] is_871_ = new int[i_864_];
					int[] is_872_ = new int[i_864_];
					int[] is_873_ = ((null != class651 && -1 != 99640975 * class651.anInt8386) ? new int[i_864_] : null);
					if (null != class651) {
						for (int i_874_ = 0; i_874_ < 613557105 * anInt5063; i_874_++) {
							is_867_[i_865_] = (anIntArrayArray5031[i_859_][anInt5052 * 425193199]);
							is_868_[i_865_] = (anIntArrayArray5019[i_859_][425193199 * anInt5052]);
							is_869_[i_865_] = (anIntArrayArray5016[i_859_][anInt5052 * 425193199]);
							is_871_[i_865_] = -74375463 * anInt5055;
							is_872_[i_865_] = -576090841 * class651.anInt8387;
							is_870_[i_865_] = -1082268879 * class651.anInt8383;
							if (null != is_873_)
								is_873_[i_865_] = class651.anInt8386 * 99640975;
							i_865_++;
							anInt5052 += -1179189233;
						}
						if (!aBool5022 && 0 == i)
							aClass560_4983.method9263(i_857_, i_858_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, class651.anInt8388 * -134620943, class651.anInt8395 * 19373761, 2062212613 * class651.anInt8396, (byte) 33);
					} else
						anInt5052 += anInt5063 * 592909215;
					if (null != class7) {
						for (int i_875_ = 0; i_875_ < anInt5062 * -461602405; i_875_++) {
							is_867_[i_865_] = (anIntArrayArray5031[i_859_][425193199 * anInt5052]);
							is_868_[i_865_] = (anIntArrayArray5019[i_859_][anInt5052 * 425193199]);
							is_869_[i_865_] = (anIntArrayArray5016[i_859_][425193199 * anInt5052]);
							is_871_[i_865_] = i_866_;
							is_872_[i_865_] = class7.anInt49 * 424256487;
							is_870_[i_865_] = is[i_857_][i_858_];
							if (is_873_ != null)
								is_873_[i_865_] = is_870_[i_865_];
							i_865_++;
							anInt5052 += -1179189233;
						}
					}
					int i_876_ = anIntArray5027.length;
					int[] is_877_ = new int[i_876_];
					int[] is_878_ = new int[i_876_];
					int[] is_879_ = class142_856_ != null ? new int[i_876_] : null;
					int[] is_880_ = (class142_856_ != null || null != class142_855_ ? new int[i_876_] : null);
					for (int i_881_ = 0; i_881_ < i_876_; i_881_++) {
						int i_882_ = anIntArray5027[i_881_];
						int i_883_ = anIntArray5028[i_881_];
						if (0 == i_860_) {
							is_877_[i_881_] = i_882_;
							is_878_[i_881_] = i_883_;
						} else if (1 == i_860_) {
							int i_884_ = i_882_;
							is_877_[i_881_] = i_883_;
							is_878_[i_881_] = 512 - i_884_;
						} else if (2 == i_860_) {
							is_877_[i_881_] = 512 - i_882_;
							is_878_[i_881_] = 512 - i_883_;
						} else if (i_860_ == 3) {
							int i_885_ = i_882_;
							is_877_[i_881_] = 512 - i_883_;
							is_878_[i_881_] = i_885_;
						}
						if (null != is_879_ && aBoolArrayArray5058[i_859_][i_881_]) {
							int i_886_ = (i_857_ << 9) + is_877_[i_881_];
							int i_887_ = (i_858_ << 9) + is_878_[i_881_];
							is_879_[i_881_] = (class142_856_.method2326(i_886_, i_887_, 1237153923) - class142.method2326(i_886_, i_887_, -1264696245));
						}
						if (null != is_880_) {
							if (null != class142_856_ && !aBoolArrayArray5058[i_859_][i_881_]) {
								int i_888_ = (i_857_ << 9) + is_877_[i_881_];
								int i_889_ = is_878_[i_881_] + (i_858_ << 9);
								is_880_[i_881_] = (class142.method2326(i_888_, i_889_, 1046629670) - (class142_856_.method2326(i_888_, i_889_, -1262242210)));
							} else if (null != class142_855_ && !(aBoolArrayArray5064[i_859_][i_881_])) {
								int i_890_ = is_877_[i_881_] + (i_857_ << 9);
								int i_891_ = (i_858_ << 9) + is_878_[i_881_];
								is_880_[i_881_] = (class142_855_.method2326(i_890_, i_891_, 1796841385) - class142.method2326(i_890_, i_891_, -309271429));
							}
						}
					}
					int i_892_ = class142.method2321(i_857_, i_858_, 1625606672);
					int i_893_ = class142.method2321(1 + i_857_, i_858_, 1997590181);
					int i_894_ = class142.method2321(1 + i_857_, 1 + i_858_, 1898730853);
					int i_895_ = class142.method2321(i_857_, 1 + i_858_, 2037946610);
					boolean bool = aClass451_4982.method7282(i_857_, i_858_, -638715901);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_896_ = true;
						if (class7 != null && !class7.aBool53)
							bool_896_ = false;
						else if (0 == i_862_ && i_859_ != 0)
							bool_896_ = false;
						else if (i_861_ > 0 && null != class651_863_ && !class651_863_.aBool8382)
							bool_896_ = false;
						if (bool_896_ && i_892_ == i_893_ && i_894_ == i_892_ && i_895_ == i_892_)
							aByteArrayArrayArray5001[i][i_857_][i_858_] |= 0x4;
					}
					Class163 class163 = new Class163();
					if (aBool5022) {
						class163.anInt1776 = (aClass560_4983.method9258(i_857_, i_858_, (byte) 109) * -780986409);
						class163.anInt1775 = aClass560_4983.method9254(i_857_, i_858_, 16711935) * 2053161261;
						class163.anInt1774 = (aClass560_4983.method9301(i_857_, i_858_, 65535) * 1512945865);
						class163.anInt1778 = (aClass560_4983.method9260(i_857_, i_858_, (short) -29625) * -923094865);
						class163.anInt1777 = (aClass560_4983.method9261(i_857_, i_858_, (short) 9757) * -320151975);
						class163.anInt1773 = (aClass560_4983.method9329(i_857_, i_858_, 40000) * -58453511);
					}
					class142.method2323(i_857_, i_858_, is_877_, is_879_, is_878_, is_880_, is_867_, is_868_, is_869_, is_870_, is_873_, is_871_, is_872_, class163, false);
					aClass560_4983.method9330(i, i_857_, i_858_, (byte) 4);
				}
			}
		}
	}

	static final int method7387(int i, int i_897_, int i_898_, int i_899_) {
		int i_900_ = 65536 - Class433.anIntArray4881[8192 * i_898_ / i_899_] >> 1;
		return (i_897_ * i_900_ >> 16) + (i * (65536 - i_900_) >> 16);
	}

	void method7388(Class142 class142, Class7 class7, Class651 class651, int i, int i_901_, int i_902_, int i_903_, int i_904_, int i_905_, int i_906_) {
		int i_907_ = class142.method2321(i_901_, i_902_, 1798998387);
		int i_908_ = class142.method2321(i_903_, i_902_, 2139630065);
		int i_909_ = class142.method2321(i_903_, i_904_, 2116472086);
		int i_910_ = class142.method2321(i_901_, i_904_, 1867094300);
		boolean bool = aClass451_4982.method7282(i_901_, i_902_, -638715901);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_911_ = true;
			if (null != class7 && !class7.aBool53)
				bool_911_ = false;
			else if (i_905_ == 0 && anInt5051 * -366854495 != 0)
				bool_911_ = false;
			else if (i_906_ > 0 && null != class651 && !class651.aBool8382)
				bool_911_ = false;
			if (bool_911_ && i_908_ == i_907_ && i_909_ == i_907_ && i_907_ == i_910_)
				aByteArrayArrayArray5001[i][i_901_][i_902_] |= 0x4;
		}
	}

	void method7389(Class142 class142, Class7 class7, Class651 class651, int i, int i_912_, int i_913_, int i_914_, int i_915_, int i_916_, int i_917_) {
		int i_918_ = class142.method2321(i_912_, i_913_, 1945441595);
		int i_919_ = class142.method2321(i_914_, i_913_, 2001633144);
		int i_920_ = class142.method2321(i_914_, i_915_, 1648464872);
		int i_921_ = class142.method2321(i_912_, i_915_, 1974596036);
		boolean bool = aClass451_4982.method7282(i_912_, i_913_, -638715901);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_922_ = true;
			if (null != class7 && !class7.aBool53)
				bool_922_ = false;
			else if (i_916_ == 0 && anInt5051 * -366854495 != 0)
				bool_922_ = false;
			else if (i_917_ > 0 && null != class651 && !class651.aBool8382)
				bool_922_ = false;
			if (bool_922_ && i_919_ == i_918_ && i_920_ == i_918_ && i_918_ == i_921_)
				aByteArrayArrayArray5001[i][i_912_][i_913_] |= 0x4;
		}
	}

	final void method7390(Class178 class178, Class651 class651, Class7 class7, int i, int i_923_, int i_924_, int i_925_, short[][] is, byte[][] is_926_, byte[][] is_927_, boolean[] bools) {
		boolean[] bools_928_ = (null != class651 && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		if (i_923_ > 0) {
			if (i > 0) {
				int i_929_ = is[i - 1][i_923_ - 1] & 0x7fff;
				if (i_929_ > 0) {
					Class651 class651_930_ = (Class651) aClass53_Sub12_5006.getDefinition(i_929_ - 1, (byte) -17);
					if (-1 != class651_930_.anInt8383 * -1082268879 && class651_930_.aBool8381) {
						byte i_931_ = is_926_[i - 1][i_923_ - 1];
						int i_932_ = 4 + 2 * is_927_[i - 1][i_923_ - 1] & 0x7;
						int i_933_ = Class386.method6456(class178, class651_930_, 1062842542);
						if (aBoolArrayArray5058[i_931_][i_932_]) {
							anIntArray5045[0] = -1082268879 * class651_930_.anInt8383;
							anIntArray5046[0] = i_933_;
							anIntArray5047[0] = class651_930_.anInt8394 * 634101717;
							anIntArray5048[0] = class651_930_.anInt8387 * -576090841;
							anIntArray5049[0] = class651_930_.anInt8385 * 486905283;
							anIntArray5032[0] = 256;
						}
					}
				}
			}
			if (i < i_924_ - 1) {
				int i_934_ = is[1 + i][i_923_ - 1] & 0x7fff;
				if (i_934_ > 0) {
					Class651 class651_935_ = (Class651) aClass53_Sub12_5006.getDefinition(i_934_ - 1, (byte) 45);
					if (-1082268879 * class651_935_.anInt8383 != -1 && class651_935_.aBool8381) {
						byte i_936_ = is_926_[i + 1][i_923_ - 1];
						int i_937_ = 2 * is_927_[1 + i][i_923_ - 1] + 6 & 0x7;
						int i_938_ = Class386.method6456(class178, class651_935_, 765275324);
						if (aBoolArrayArray5058[i_936_][i_937_]) {
							anIntArray5045[2] = class651_935_.anInt8383 * -1082268879;
							anIntArray5046[2] = i_938_;
							anIntArray5047[2] = 634101717 * class651_935_.anInt8394;
							anIntArray5048[2] = class651_935_.anInt8387 * -576090841;
							anIntArray5049[2] = class651_935_.anInt8385 * 486905283;
							anIntArray5032[2] = 512;
						}
					}
				}
			}
		}
		if (i_923_ < i_925_ - 1) {
			if (i > 0) {
				int i_939_ = is[i - 1][i_923_ + 1] & 0x7fff;
				if (i_939_ > 0) {
					Class651 class651_940_ = (Class651) aClass53_Sub12_5006.getDefinition(i_939_ - 1, (byte) -4);
					if (-1082268879 * class651_940_.anInt8383 != -1 && class651_940_.aBool8381) {
						byte i_941_ = is_926_[i - 1][1 + i_923_];
						int i_942_ = 2 + is_927_[i - 1][1 + i_923_] * 2 & 0x7;
						int i_943_ = Class386.method6456(class178, class651_940_, -1894927258);
						if (aBoolArrayArray5058[i_941_][i_942_]) {
							anIntArray5045[6] = class651_940_.anInt8383 * -1082268879;
							anIntArray5046[6] = i_943_;
							anIntArray5047[6] = class651_940_.anInt8394 * 634101717;
							anIntArray5048[6] = class651_940_.anInt8387 * -576090841;
							anIntArray5049[6] = class651_940_.anInt8385 * 486905283;
							anIntArray5032[6] = 64;
						}
					}
				}
			}
			if (i < i_924_ - 1) {
				int i_944_ = is[1 + i][i_923_ + 1] & 0x7fff;
				if (i_944_ > 0) {
					Class651 class651_945_ = (Class651) aClass53_Sub12_5006.getDefinition(i_944_ - 1, (byte) -24);
					if (class651_945_.anInt8383 * -1082268879 != -1 && class651_945_.aBool8381) {
						byte i_946_ = is_926_[1 + i][i_923_ + 1];
						int i_947_ = 0 + is_927_[1 + i][i_923_ + 1] * 2 & 0x7;
						int i_948_ = Class386.method6456(class178, class651_945_, -1268026904);
						if (aBoolArrayArray5058[i_946_][i_947_]) {
							anIntArray5045[4] = class651_945_.anInt8383 * -1082268879;
							anIntArray5046[4] = i_948_;
							anIntArray5047[4] = 634101717 * class651_945_.anInt8394;
							anIntArray5048[4] = -576090841 * class651_945_.anInt8387;
							anIntArray5049[4] = class651_945_.anInt8385 * 486905283;
							anIntArray5032[4] = 128;
						}
					}
				}
			}
		}
		if (i_923_ > 0) {
			int i_949_ = is[i][i_923_ - 1] & 0x7fff;
			if (i_949_ > 0) {
				Class651 class651_950_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_949_ - 1, (byte) 22));
				if (-1082268879 * class651_950_.anInt8383 != -1) {
					byte i_951_ = is_926_[i][i_923_ - 1];
					int i_952_ = is_927_[i][i_923_ - 1];
					if (class651_950_.aBool8381) {
						int i_953_ = 2;
						int i_954_ = 2 * i_952_ + 4;
						int i_955_ = Class386.method6456(class178, class651_950_, -681982499);
						for (int i_956_ = 0; i_956_ < 3; i_956_++) {
							i_954_ &= 0x7;
							i_953_ &= 0x7;
							if (aBoolArrayArray5058[i_951_][i_954_] && (anIntArray5049[i_953_] <= 486905283 * class651_950_.anInt8385)) {
								anIntArray5045[i_953_] = class651_950_.anInt8383 * -1082268879;
								anIntArray5046[i_953_] = i_955_;
								anIntArray5047[i_953_] = class651_950_.anInt8394 * 634101717;
								anIntArray5048[i_953_] = -576090841 * class651_950_.anInt8387;
								if (anIntArray5049[i_953_] == class651_950_.anInt8385 * 486905283)
									anIntArray5032[i_953_] |= 0x20;
								else
									anIntArray5032[i_953_] = 32;
								anIntArray5049[i_953_] = class651_950_.anInt8385 * 486905283;
							}
							i_954_++;
							i_953_--;
						}
						if (!bools_928_[425193199 * anInt5052 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5026[i_951_][2 + i_952_ & 0x3]);
					} else if (!bools_928_[0 + anInt5052 * 425193199 & 0x3])
						bools[0] = aBoolArrayArray5034[i_951_][2 + i_952_ & 0x3];
				}
			}
		}
		if (i_923_ < i_925_ - 1) {
			int i_957_ = is[i][i_923_ + 1] & 0x7fff;
			if (i_957_ > 0) {
				Class651 class651_958_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_957_ - 1, (byte) 83));
				if (-1 != -1082268879 * class651_958_.anInt8383) {
					byte i_959_ = is_926_[i][1 + i_923_];
					int i_960_ = is_927_[i][i_923_ + 1];
					if (class651_958_.aBool8381) {
						int i_961_ = 4;
						int i_962_ = i_960_ * 2 + 2;
						int i_963_ = Class386.method6456(class178, class651_958_, -2045567259);
						for (int i_964_ = 0; i_964_ < 3; i_964_++) {
							i_962_ &= 0x7;
							i_961_ &= 0x7;
							if (aBoolArrayArray5058[i_959_][i_962_] && (anIntArray5049[i_961_] <= class651_958_.anInt8385 * 486905283)) {
								anIntArray5045[i_961_] = class651_958_.anInt8383 * -1082268879;
								anIntArray5046[i_961_] = i_963_;
								anIntArray5047[i_961_] = class651_958_.anInt8394 * 634101717;
								anIntArray5048[i_961_] = class651_958_.anInt8387 * -576090841;
								if (anIntArray5049[i_961_] == class651_958_.anInt8385 * 486905283)
									anIntArray5032[i_961_] |= 0x10;
								else
									anIntArray5032[i_961_] = 16;
								anIntArray5049[i_961_] = class651_958_.anInt8385 * 486905283;
							}
							i_962_--;
							i_961_++;
						}
						if (!bools_928_[2 + 425193199 * anInt5052 & 0x3])
							bools[2] = (aBoolArrayArray5026[i_959_][0 + i_960_ & 0x3]);
					} else if (!bools_928_[2 + 425193199 * anInt5052 & 0x3])
						bools[2] = aBoolArrayArray5034[i_959_][0 + i_960_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_965_ = is[i - 1][i_923_] & 0x7fff;
			if (i_965_ > 0) {
				Class651 class651_966_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_965_ - 1, (byte) 51));
				if (-1 != -1082268879 * class651_966_.anInt8383) {
					byte i_967_ = is_926_[i - 1][i_923_];
					int i_968_ = is_927_[i - 1][i_923_];
					if (class651_966_.aBool8381) {
						int i_969_ = 6;
						int i_970_ = i_968_ * 2 + 4;
						int i_971_ = Class386.method6456(class178, class651_966_, -955716108);
						for (int i_972_ = 0; i_972_ < 3; i_972_++) {
							i_970_ &= 0x7;
							i_969_ &= 0x7;
							if (aBoolArrayArray5058[i_967_][i_970_] && (anIntArray5049[i_969_] <= class651_966_.anInt8385 * 486905283)) {
								anIntArray5045[i_969_] = -1082268879 * class651_966_.anInt8383;
								anIntArray5046[i_969_] = i_971_;
								anIntArray5047[i_969_] = 634101717 * class651_966_.anInt8394;
								anIntArray5048[i_969_] = -576090841 * class651_966_.anInt8387;
								if (anIntArray5049[i_969_] == class651_966_.anInt8385 * 486905283)
									anIntArray5032[i_969_] |= 0x8;
								else
									anIntArray5032[i_969_] = 8;
								anIntArray5049[i_969_] = class651_966_.anInt8385 * 486905283;
							}
							i_970_--;
							i_969_++;
						}
						if (!bools_928_[3 + anInt5052 * 425193199 & 0x3])
							bools[3] = (aBoolArrayArray5026[i_967_][1 + i_968_ & 0x3]);
					} else if (!bools_928_[425193199 * anInt5052 + 3 & 0x3])
						bools[3] = aBoolArrayArray5034[i_967_][i_968_ + 1 & 0x3];
				}
			}
		}
		if (i < i_924_ - 1) {
			int i_973_ = is[i + 1][i_923_] & 0x7fff;
			if (i_973_ > 0) {
				Class651 class651_974_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_973_ - 1, (byte) -41));
				if (-1 != class651_974_.anInt8383 * -1082268879) {
					byte i_975_ = is_926_[i + 1][i_923_];
					int i_976_ = is_927_[1 + i][i_923_];
					if (class651_974_.aBool8381) {
						int i_977_ = 4;
						int i_978_ = 2 * i_976_ + 6;
						int i_979_ = Class386.method6456(class178, class651_974_, -218512931);
						for (int i_980_ = 0; i_980_ < 3; i_980_++) {
							i_978_ &= 0x7;
							i_977_ &= 0x7;
							if (aBoolArrayArray5058[i_975_][i_978_] && (anIntArray5049[i_977_] <= 486905283 * class651_974_.anInt8385)) {
								anIntArray5045[i_977_] = class651_974_.anInt8383 * -1082268879;
								anIntArray5046[i_977_] = i_979_;
								anIntArray5047[i_977_] = class651_974_.anInt8394 * 634101717;
								anIntArray5048[i_977_] = class651_974_.anInt8387 * -576090841;
								if (anIntArray5049[i_977_] == 486905283 * class651_974_.anInt8385)
									anIntArray5032[i_977_] |= 0x4;
								else
									anIntArray5032[i_977_] = 4;
								anIntArray5049[i_977_] = class651_974_.anInt8385 * 486905283;
							}
							i_978_++;
							i_977_--;
						}
						if (!bools_928_[anInt5052 * 425193199 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5026[i_975_][3 + i_976_ & 0x3]);
					} else if (!bools_928_[425193199 * anInt5052 + 1 & 0x3])
						bools[1] = aBoolArrayArray5034[i_975_][3 + i_976_ & 0x3];
				}
			}
		}
		if (null != class651 && class651.aBool8381) {
			int i_981_ = Class386.method6456(class178, class651, -1937365565);
			for (int i_982_ = 0; i_982_ < 8; i_982_++) {
				int i_983_ = i_982_ - anInt5052 * 850386398 & 0x7;
				if (aBoolArrayArray5058[-366854495 * anInt5051][i_982_] && (anIntArray5049[i_983_] <= 486905283 * class651.anInt8385)) {
					anIntArray5045[i_983_] = class651.anInt8383 * -1082268879;
					anIntArray5046[i_983_] = i_981_;
					anIntArray5047[i_983_] = class651.anInt8394 * 634101717;
					anIntArray5048[i_983_] = -576090841 * class651.anInt8387;
					if (anIntArray5049[i_983_] == class651.anInt8385 * 486905283)
						anIntArray5032[i_983_] |= 0x2;
					else
						anIntArray5032[i_983_] = 2;
					anIntArray5049[i_983_] = class651.anInt8385 * 486905283;
				}
			}
		}
	}

	final void method7391(Class178 class178, Class651 class651, Class7 class7, int i, int i_984_, int i_985_, int i_986_, short[][] is, byte[][] is_987_, byte[][] is_988_, boolean[] bools) {
		boolean[] bools_989_ = (null != class651 && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		if (i_984_ > 0) {
			if (i > 0) {
				int i_990_ = is[i - 1][i_984_ - 1] & 0x7fff;
				if (i_990_ > 0) {
					Class651 class651_991_ = (Class651) aClass53_Sub12_5006.getDefinition(i_990_ - 1, (byte) 87);
					if (-1 != class651_991_.anInt8383 * -1082268879 && class651_991_.aBool8381) {
						byte i_992_ = is_987_[i - 1][i_984_ - 1];
						int i_993_ = 4 + 2 * is_988_[i - 1][i_984_ - 1] & 0x7;
						int i_994_ = Class386.method6456(class178, class651_991_, 1776310034);
						if (aBoolArrayArray5058[i_992_][i_993_]) {
							anIntArray5045[0] = -1082268879 * class651_991_.anInt8383;
							anIntArray5046[0] = i_994_;
							anIntArray5047[0] = class651_991_.anInt8394 * 634101717;
							anIntArray5048[0] = class651_991_.anInt8387 * -576090841;
							anIntArray5049[0] = class651_991_.anInt8385 * 486905283;
							anIntArray5032[0] = 256;
						}
					}
				}
			}
			if (i < i_985_ - 1) {
				int i_995_ = is[1 + i][i_984_ - 1] & 0x7fff;
				if (i_995_ > 0) {
					Class651 class651_996_ = (Class651) aClass53_Sub12_5006.getDefinition(i_995_ - 1, (byte) 45);
					if (-1082268879 * class651_996_.anInt8383 != -1 && class651_996_.aBool8381) {
						byte i_997_ = is_987_[i + 1][i_984_ - 1];
						int i_998_ = 2 * is_988_[1 + i][i_984_ - 1] + 6 & 0x7;
						int i_999_ = Class386.method6456(class178, class651_996_, 963217565);
						if (aBoolArrayArray5058[i_997_][i_998_]) {
							anIntArray5045[2] = class651_996_.anInt8383 * -1082268879;
							anIntArray5046[2] = i_999_;
							anIntArray5047[2] = 634101717 * class651_996_.anInt8394;
							anIntArray5048[2] = class651_996_.anInt8387 * -576090841;
							anIntArray5049[2] = class651_996_.anInt8385 * 486905283;
							anIntArray5032[2] = 512;
						}
					}
				}
			}
		}
		if (i_984_ < i_986_ - 1) {
			if (i > 0) {
				int i_1000_ = is[i - 1][i_984_ + 1] & 0x7fff;
				if (i_1000_ > 0) {
					Class651 class651_1001_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1000_ - 1, (byte) 35);
					if (-1082268879 * class651_1001_.anInt8383 != -1 && class651_1001_.aBool8381) {
						byte i_1002_ = is_987_[i - 1][1 + i_984_];
						int i_1003_ = 2 + is_988_[i - 1][1 + i_984_] * 2 & 0x7;
						int i_1004_ = Class386.method6456(class178, class651_1001_, -691965581);
						if (aBoolArrayArray5058[i_1002_][i_1003_]) {
							anIntArray5045[6] = class651_1001_.anInt8383 * -1082268879;
							anIntArray5046[6] = i_1004_;
							anIntArray5047[6] = class651_1001_.anInt8394 * 634101717;
							anIntArray5048[6] = class651_1001_.anInt8387 * -576090841;
							anIntArray5049[6] = class651_1001_.anInt8385 * 486905283;
							anIntArray5032[6] = 64;
						}
					}
				}
			}
			if (i < i_985_ - 1) {
				int i_1005_ = is[1 + i][i_984_ + 1] & 0x7fff;
				if (i_1005_ > 0) {
					Class651 class651_1006_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1005_ - 1, (byte) -19);
					if (class651_1006_.anInt8383 * -1082268879 != -1 && class651_1006_.aBool8381) {
						byte i_1007_ = is_987_[1 + i][i_984_ + 1];
						int i_1008_ = 0 + is_988_[1 + i][i_984_ + 1] * 2 & 0x7;
						int i_1009_ = Class386.method6456(class178, class651_1006_, -819161301);
						if (aBoolArrayArray5058[i_1007_][i_1008_]) {
							anIntArray5045[4] = class651_1006_.anInt8383 * -1082268879;
							anIntArray5046[4] = i_1009_;
							anIntArray5047[4] = 634101717 * class651_1006_.anInt8394;
							anIntArray5048[4] = -576090841 * class651_1006_.anInt8387;
							anIntArray5049[4] = class651_1006_.anInt8385 * 486905283;
							anIntArray5032[4] = 128;
						}
					}
				}
			}
		}
		if (i_984_ > 0) {
			int i_1010_ = is[i][i_984_ - 1] & 0x7fff;
			if (i_1010_ > 0) {
				Class651 class651_1011_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1010_ - 1, (byte) -89));
				if (-1082268879 * class651_1011_.anInt8383 != -1) {
					byte i_1012_ = is_987_[i][i_984_ - 1];
					int i_1013_ = is_988_[i][i_984_ - 1];
					if (class651_1011_.aBool8381) {
						int i_1014_ = 2;
						int i_1015_ = 2 * i_1013_ + 4;
						int i_1016_ = Class386.method6456(class178, class651_1011_, 1230986276);
						for (int i_1017_ = 0; i_1017_ < 3; i_1017_++) {
							i_1015_ &= 0x7;
							i_1014_ &= 0x7;
							if (aBoolArrayArray5058[i_1012_][i_1015_] && (anIntArray5049[i_1014_] <= 486905283 * class651_1011_.anInt8385)) {
								anIntArray5045[i_1014_] = class651_1011_.anInt8383 * -1082268879;
								anIntArray5046[i_1014_] = i_1016_;
								anIntArray5047[i_1014_] = class651_1011_.anInt8394 * 634101717;
								anIntArray5048[i_1014_] = -576090841 * class651_1011_.anInt8387;
								if (anIntArray5049[i_1014_] == class651_1011_.anInt8385 * 486905283)
									anIntArray5032[i_1014_] |= 0x20;
								else
									anIntArray5032[i_1014_] = 32;
								anIntArray5049[i_1014_] = class651_1011_.anInt8385 * 486905283;
							}
							i_1015_++;
							i_1014_--;
						}
						if (!bools_989_[425193199 * anInt5052 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5026[i_1012_][2 + i_1013_ & 0x3]);
					} else if (!bools_989_[0 + anInt5052 * 425193199 & 0x3])
						bools[0] = aBoolArrayArray5034[i_1012_][2 + i_1013_ & 0x3];
				}
			}
		}
		if (i_984_ < i_986_ - 1) {
			int i_1018_ = is[i][i_984_ + 1] & 0x7fff;
			if (i_1018_ > 0) {
				Class651 class651_1019_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1018_ - 1, (byte) -74));
				if (-1 != -1082268879 * class651_1019_.anInt8383) {
					byte i_1020_ = is_987_[i][1 + i_984_];
					int i_1021_ = is_988_[i][i_984_ + 1];
					if (class651_1019_.aBool8381) {
						int i_1022_ = 4;
						int i_1023_ = i_1021_ * 2 + 2;
						int i_1024_ = Class386.method6456(class178, class651_1019_, -221930635);
						for (int i_1025_ = 0; i_1025_ < 3; i_1025_++) {
							i_1023_ &= 0x7;
							i_1022_ &= 0x7;
							if (aBoolArrayArray5058[i_1020_][i_1023_] && (anIntArray5049[i_1022_] <= class651_1019_.anInt8385 * 486905283)) {
								anIntArray5045[i_1022_] = class651_1019_.anInt8383 * -1082268879;
								anIntArray5046[i_1022_] = i_1024_;
								anIntArray5047[i_1022_] = class651_1019_.anInt8394 * 634101717;
								anIntArray5048[i_1022_] = class651_1019_.anInt8387 * -576090841;
								if (anIntArray5049[i_1022_] == class651_1019_.anInt8385 * 486905283)
									anIntArray5032[i_1022_] |= 0x10;
								else
									anIntArray5032[i_1022_] = 16;
								anIntArray5049[i_1022_] = class651_1019_.anInt8385 * 486905283;
							}
							i_1023_--;
							i_1022_++;
						}
						if (!bools_989_[2 + 425193199 * anInt5052 & 0x3])
							bools[2] = (aBoolArrayArray5026[i_1020_][0 + i_1021_ & 0x3]);
					} else if (!bools_989_[2 + 425193199 * anInt5052 & 0x3])
						bools[2] = aBoolArrayArray5034[i_1020_][0 + i_1021_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_1026_ = is[i - 1][i_984_] & 0x7fff;
			if (i_1026_ > 0) {
				Class651 class651_1027_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1026_ - 1, (byte) 11));
				if (-1 != -1082268879 * class651_1027_.anInt8383) {
					byte i_1028_ = is_987_[i - 1][i_984_];
					int i_1029_ = is_988_[i - 1][i_984_];
					if (class651_1027_.aBool8381) {
						int i_1030_ = 6;
						int i_1031_ = i_1029_ * 2 + 4;
						int i_1032_ = Class386.method6456(class178, class651_1027_, 2011743508);
						for (int i_1033_ = 0; i_1033_ < 3; i_1033_++) {
							i_1031_ &= 0x7;
							i_1030_ &= 0x7;
							if (aBoolArrayArray5058[i_1028_][i_1031_] && (anIntArray5049[i_1030_] <= class651_1027_.anInt8385 * 486905283)) {
								anIntArray5045[i_1030_] = -1082268879 * class651_1027_.anInt8383;
								anIntArray5046[i_1030_] = i_1032_;
								anIntArray5047[i_1030_] = 634101717 * class651_1027_.anInt8394;
								anIntArray5048[i_1030_] = -576090841 * class651_1027_.anInt8387;
								if (anIntArray5049[i_1030_] == class651_1027_.anInt8385 * 486905283)
									anIntArray5032[i_1030_] |= 0x8;
								else
									anIntArray5032[i_1030_] = 8;
								anIntArray5049[i_1030_] = class651_1027_.anInt8385 * 486905283;
							}
							i_1031_--;
							i_1030_++;
						}
						if (!bools_989_[3 + anInt5052 * 425193199 & 0x3])
							bools[3] = (aBoolArrayArray5026[i_1028_][1 + i_1029_ & 0x3]);
					} else if (!bools_989_[425193199 * anInt5052 + 3 & 0x3])
						bools[3] = aBoolArrayArray5034[i_1028_][i_1029_ + 1 & 0x3];
				}
			}
		}
		if (i < i_985_ - 1) {
			int i_1034_ = is[i + 1][i_984_] & 0x7fff;
			if (i_1034_ > 0) {
				Class651 class651_1035_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1034_ - 1, (byte) 63));
				if (-1 != class651_1035_.anInt8383 * -1082268879) {
					byte i_1036_ = is_987_[i + 1][i_984_];
					int i_1037_ = is_988_[1 + i][i_984_];
					if (class651_1035_.aBool8381) {
						int i_1038_ = 4;
						int i_1039_ = 2 * i_1037_ + 6;
						int i_1040_ = Class386.method6456(class178, class651_1035_, 651902451);
						for (int i_1041_ = 0; i_1041_ < 3; i_1041_++) {
							i_1039_ &= 0x7;
							i_1038_ &= 0x7;
							if (aBoolArrayArray5058[i_1036_][i_1039_] && (anIntArray5049[i_1038_] <= 486905283 * class651_1035_.anInt8385)) {
								anIntArray5045[i_1038_] = class651_1035_.anInt8383 * -1082268879;
								anIntArray5046[i_1038_] = i_1040_;
								anIntArray5047[i_1038_] = class651_1035_.anInt8394 * 634101717;
								anIntArray5048[i_1038_] = class651_1035_.anInt8387 * -576090841;
								if (anIntArray5049[i_1038_] == 486905283 * class651_1035_.anInt8385)
									anIntArray5032[i_1038_] |= 0x4;
								else
									anIntArray5032[i_1038_] = 4;
								anIntArray5049[i_1038_] = class651_1035_.anInt8385 * 486905283;
							}
							i_1039_++;
							i_1038_--;
						}
						if (!bools_989_[anInt5052 * 425193199 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5026[i_1036_][3 + i_1037_ & 0x3]);
					} else if (!bools_989_[425193199 * anInt5052 + 1 & 0x3])
						bools[1] = aBoolArrayArray5034[i_1036_][3 + i_1037_ & 0x3];
				}
			}
		}
		if (null != class651 && class651.aBool8381) {
			int i_1042_ = Class386.method6456(class178, class651, -940343157);
			for (int i_1043_ = 0; i_1043_ < 8; i_1043_++) {
				int i_1044_ = i_1043_ - anInt5052 * 850386398 & 0x7;
				if (aBoolArrayArray5058[-366854495 * anInt5051][i_1043_] && (anIntArray5049[i_1044_] <= 486905283 * class651.anInt8385)) {
					anIntArray5045[i_1044_] = class651.anInt8383 * -1082268879;
					anIntArray5046[i_1044_] = i_1042_;
					anIntArray5047[i_1044_] = class651.anInt8394 * 634101717;
					anIntArray5048[i_1044_] = -576090841 * class651.anInt8387;
					if (anIntArray5049[i_1044_] == class651.anInt8385 * 486905283)
						anIntArray5032[i_1044_] |= 0x2;
					else
						anIntArray5032[i_1044_] = 2;
					anIntArray5049[i_1044_] = class651.anInt8385 * 486905283;
				}
			}
		}
	}

	final void method7392(Class178 class178, Class651 class651, Class7 class7, int i, int i_1045_, int i_1046_, int i_1047_, short[][] is, byte[][] is_1048_, byte[][] is_1049_, boolean[] bools) {
		boolean[] bools_1050_ = (null != class651 && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		if (i_1045_ > 0) {
			if (i > 0) {
				int i_1051_ = is[i - 1][i_1045_ - 1] & 0x7fff;
				if (i_1051_ > 0) {
					Class651 class651_1052_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1051_ - 1, (byte) -38);
					if (-1 != class651_1052_.anInt8383 * -1082268879 && class651_1052_.aBool8381) {
						byte i_1053_ = is_1048_[i - 1][i_1045_ - 1];
						int i_1054_ = 4 + 2 * is_1049_[i - 1][i_1045_ - 1] & 0x7;
						int i_1055_ = Class386.method6456(class178, class651_1052_, -599630944);
						if (aBoolArrayArray5058[i_1053_][i_1054_]) {
							anIntArray5045[0] = -1082268879 * class651_1052_.anInt8383;
							anIntArray5046[0] = i_1055_;
							anIntArray5047[0] = class651_1052_.anInt8394 * 634101717;
							anIntArray5048[0] = class651_1052_.anInt8387 * -576090841;
							anIntArray5049[0] = class651_1052_.anInt8385 * 486905283;
							anIntArray5032[0] = 256;
						}
					}
				}
			}
			if (i < i_1046_ - 1) {
				int i_1056_ = is[1 + i][i_1045_ - 1] & 0x7fff;
				if (i_1056_ > 0) {
					Class651 class651_1057_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1056_ - 1, (byte) 35);
					if (-1082268879 * class651_1057_.anInt8383 != -1 && class651_1057_.aBool8381) {
						byte i_1058_ = is_1048_[i + 1][i_1045_ - 1];
						int i_1059_ = 2 * is_1049_[1 + i][i_1045_ - 1] + 6 & 0x7;
						int i_1060_ = Class386.method6456(class178, class651_1057_, -2106198598);
						if (aBoolArrayArray5058[i_1058_][i_1059_]) {
							anIntArray5045[2] = class651_1057_.anInt8383 * -1082268879;
							anIntArray5046[2] = i_1060_;
							anIntArray5047[2] = 634101717 * class651_1057_.anInt8394;
							anIntArray5048[2] = class651_1057_.anInt8387 * -576090841;
							anIntArray5049[2] = class651_1057_.anInt8385 * 486905283;
							anIntArray5032[2] = 512;
						}
					}
				}
			}
		}
		if (i_1045_ < i_1047_ - 1) {
			if (i > 0) {
				int i_1061_ = is[i - 1][i_1045_ + 1] & 0x7fff;
				if (i_1061_ > 0) {
					Class651 class651_1062_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1061_ - 1, (byte) -61);
					if (-1082268879 * class651_1062_.anInt8383 != -1 && class651_1062_.aBool8381) {
						byte i_1063_ = is_1048_[i - 1][1 + i_1045_];
						int i_1064_ = 2 + is_1049_[i - 1][1 + i_1045_] * 2 & 0x7;
						int i_1065_ = Class386.method6456(class178, class651_1062_, 2005478663);
						if (aBoolArrayArray5058[i_1063_][i_1064_]) {
							anIntArray5045[6] = class651_1062_.anInt8383 * -1082268879;
							anIntArray5046[6] = i_1065_;
							anIntArray5047[6] = class651_1062_.anInt8394 * 634101717;
							anIntArray5048[6] = class651_1062_.anInt8387 * -576090841;
							anIntArray5049[6] = class651_1062_.anInt8385 * 486905283;
							anIntArray5032[6] = 64;
						}
					}
				}
			}
			if (i < i_1046_ - 1) {
				int i_1066_ = is[1 + i][i_1045_ + 1] & 0x7fff;
				if (i_1066_ > 0) {
					Class651 class651_1067_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1066_ - 1, (byte) 47);
					if (class651_1067_.anInt8383 * -1082268879 != -1 && class651_1067_.aBool8381) {
						byte i_1068_ = is_1048_[1 + i][i_1045_ + 1];
						int i_1069_ = 0 + is_1049_[1 + i][i_1045_ + 1] * 2 & 0x7;
						int i_1070_ = Class386.method6456(class178, class651_1067_, 1868612680);
						if (aBoolArrayArray5058[i_1068_][i_1069_]) {
							anIntArray5045[4] = class651_1067_.anInt8383 * -1082268879;
							anIntArray5046[4] = i_1070_;
							anIntArray5047[4] = 634101717 * class651_1067_.anInt8394;
							anIntArray5048[4] = -576090841 * class651_1067_.anInt8387;
							anIntArray5049[4] = class651_1067_.anInt8385 * 486905283;
							anIntArray5032[4] = 128;
						}
					}
				}
			}
		}
		if (i_1045_ > 0) {
			int i_1071_ = is[i][i_1045_ - 1] & 0x7fff;
			if (i_1071_ > 0) {
				Class651 class651_1072_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1071_ - 1, (byte) -96));
				if (-1082268879 * class651_1072_.anInt8383 != -1) {
					byte i_1073_ = is_1048_[i][i_1045_ - 1];
					int i_1074_ = is_1049_[i][i_1045_ - 1];
					if (class651_1072_.aBool8381) {
						int i_1075_ = 2;
						int i_1076_ = 2 * i_1074_ + 4;
						int i_1077_ = Class386.method6456(class178, class651_1072_, 2037632596);
						for (int i_1078_ = 0; i_1078_ < 3; i_1078_++) {
							i_1076_ &= 0x7;
							i_1075_ &= 0x7;
							if (aBoolArrayArray5058[i_1073_][i_1076_] && (anIntArray5049[i_1075_] <= 486905283 * class651_1072_.anInt8385)) {
								anIntArray5045[i_1075_] = class651_1072_.anInt8383 * -1082268879;
								anIntArray5046[i_1075_] = i_1077_;
								anIntArray5047[i_1075_] = class651_1072_.anInt8394 * 634101717;
								anIntArray5048[i_1075_] = -576090841 * class651_1072_.anInt8387;
								if (anIntArray5049[i_1075_] == class651_1072_.anInt8385 * 486905283)
									anIntArray5032[i_1075_] |= 0x20;
								else
									anIntArray5032[i_1075_] = 32;
								anIntArray5049[i_1075_] = class651_1072_.anInt8385 * 486905283;
							}
							i_1076_++;
							i_1075_--;
						}
						if (!bools_1050_[425193199 * anInt5052 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5026[i_1073_][2 + i_1074_ & 0x3]);
					} else if (!bools_1050_[0 + anInt5052 * 425193199 & 0x3])
						bools[0] = aBoolArrayArray5034[i_1073_][2 + i_1074_ & 0x3];
				}
			}
		}
		if (i_1045_ < i_1047_ - 1) {
			int i_1079_ = is[i][i_1045_ + 1] & 0x7fff;
			if (i_1079_ > 0) {
				Class651 class651_1080_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1079_ - 1, (byte) 66));
				if (-1 != -1082268879 * class651_1080_.anInt8383) {
					byte i_1081_ = is_1048_[i][1 + i_1045_];
					int i_1082_ = is_1049_[i][i_1045_ + 1];
					if (class651_1080_.aBool8381) {
						int i_1083_ = 4;
						int i_1084_ = i_1082_ * 2 + 2;
						int i_1085_ = Class386.method6456(class178, class651_1080_, -1811729686);
						for (int i_1086_ = 0; i_1086_ < 3; i_1086_++) {
							i_1084_ &= 0x7;
							i_1083_ &= 0x7;
							if (aBoolArrayArray5058[i_1081_][i_1084_] && (anIntArray5049[i_1083_] <= class651_1080_.anInt8385 * 486905283)) {
								anIntArray5045[i_1083_] = class651_1080_.anInt8383 * -1082268879;
								anIntArray5046[i_1083_] = i_1085_;
								anIntArray5047[i_1083_] = class651_1080_.anInt8394 * 634101717;
								anIntArray5048[i_1083_] = class651_1080_.anInt8387 * -576090841;
								if (anIntArray5049[i_1083_] == class651_1080_.anInt8385 * 486905283)
									anIntArray5032[i_1083_] |= 0x10;
								else
									anIntArray5032[i_1083_] = 16;
								anIntArray5049[i_1083_] = class651_1080_.anInt8385 * 486905283;
							}
							i_1084_--;
							i_1083_++;
						}
						if (!bools_1050_[2 + 425193199 * anInt5052 & 0x3])
							bools[2] = (aBoolArrayArray5026[i_1081_][0 + i_1082_ & 0x3]);
					} else if (!bools_1050_[2 + 425193199 * anInt5052 & 0x3])
						bools[2] = aBoolArrayArray5034[i_1081_][0 + i_1082_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_1087_ = is[i - 1][i_1045_] & 0x7fff;
			if (i_1087_ > 0) {
				Class651 class651_1088_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1087_ - 1, (byte) -26));
				if (-1 != -1082268879 * class651_1088_.anInt8383) {
					byte i_1089_ = is_1048_[i - 1][i_1045_];
					int i_1090_ = is_1049_[i - 1][i_1045_];
					if (class651_1088_.aBool8381) {
						int i_1091_ = 6;
						int i_1092_ = i_1090_ * 2 + 4;
						int i_1093_ = Class386.method6456(class178, class651_1088_, 947861604);
						for (int i_1094_ = 0; i_1094_ < 3; i_1094_++) {
							i_1092_ &= 0x7;
							i_1091_ &= 0x7;
							if (aBoolArrayArray5058[i_1089_][i_1092_] && (anIntArray5049[i_1091_] <= class651_1088_.anInt8385 * 486905283)) {
								anIntArray5045[i_1091_] = -1082268879 * class651_1088_.anInt8383;
								anIntArray5046[i_1091_] = i_1093_;
								anIntArray5047[i_1091_] = 634101717 * class651_1088_.anInt8394;
								anIntArray5048[i_1091_] = -576090841 * class651_1088_.anInt8387;
								if (anIntArray5049[i_1091_] == class651_1088_.anInt8385 * 486905283)
									anIntArray5032[i_1091_] |= 0x8;
								else
									anIntArray5032[i_1091_] = 8;
								anIntArray5049[i_1091_] = class651_1088_.anInt8385 * 486905283;
							}
							i_1092_--;
							i_1091_++;
						}
						if (!bools_1050_[3 + anInt5052 * 425193199 & 0x3])
							bools[3] = (aBoolArrayArray5026[i_1089_][1 + i_1090_ & 0x3]);
					} else if (!bools_1050_[425193199 * anInt5052 + 3 & 0x3])
						bools[3] = aBoolArrayArray5034[i_1089_][i_1090_ + 1 & 0x3];
				}
			}
		}
		if (i < i_1046_ - 1) {
			int i_1095_ = is[i + 1][i_1045_] & 0x7fff;
			if (i_1095_ > 0) {
				Class651 class651_1096_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1095_ - 1, (byte) 107));
				if (-1 != class651_1096_.anInt8383 * -1082268879) {
					byte i_1097_ = is_1048_[i + 1][i_1045_];
					int i_1098_ = is_1049_[1 + i][i_1045_];
					if (class651_1096_.aBool8381) {
						int i_1099_ = 4;
						int i_1100_ = 2 * i_1098_ + 6;
						int i_1101_ = Class386.method6456(class178, class651_1096_, 226359019);
						for (int i_1102_ = 0; i_1102_ < 3; i_1102_++) {
							i_1100_ &= 0x7;
							i_1099_ &= 0x7;
							if (aBoolArrayArray5058[i_1097_][i_1100_] && (anIntArray5049[i_1099_] <= 486905283 * class651_1096_.anInt8385)) {
								anIntArray5045[i_1099_] = class651_1096_.anInt8383 * -1082268879;
								anIntArray5046[i_1099_] = i_1101_;
								anIntArray5047[i_1099_] = class651_1096_.anInt8394 * 634101717;
								anIntArray5048[i_1099_] = class651_1096_.anInt8387 * -576090841;
								if (anIntArray5049[i_1099_] == 486905283 * class651_1096_.anInt8385)
									anIntArray5032[i_1099_] |= 0x4;
								else
									anIntArray5032[i_1099_] = 4;
								anIntArray5049[i_1099_] = class651_1096_.anInt8385 * 486905283;
							}
							i_1100_++;
							i_1099_--;
						}
						if (!bools_1050_[anInt5052 * 425193199 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5026[i_1097_][3 + i_1098_ & 0x3]);
					} else if (!bools_1050_[425193199 * anInt5052 + 1 & 0x3])
						bools[1] = aBoolArrayArray5034[i_1097_][3 + i_1098_ & 0x3];
				}
			}
		}
		if (null != class651 && class651.aBool8381) {
			int i_1103_ = Class386.method6456(class178, class651, 197180116);
			for (int i_1104_ = 0; i_1104_ < 8; i_1104_++) {
				int i_1105_ = i_1104_ - anInt5052 * 850386398 & 0x7;
				if (aBoolArrayArray5058[-366854495 * anInt5051][i_1104_] && (anIntArray5049[i_1105_] <= 486905283 * class651.anInt8385)) {
					anIntArray5045[i_1105_] = class651.anInt8383 * -1082268879;
					anIntArray5046[i_1105_] = i_1103_;
					anIntArray5047[i_1105_] = class651.anInt8394 * 634101717;
					anIntArray5048[i_1105_] = -576090841 * class651.anInt8387;
					if (anIntArray5049[i_1105_] == class651.anInt8385 * 486905283)
						anIntArray5032[i_1105_] |= 0x2;
					else
						anIntArray5032[i_1105_] = 2;
					anIntArray5049[i_1105_] = class651.anInt8385 * 486905283;
				}
			}
		}
	}

	final void method7393(Class178 class178, Class651 class651, Class7 class7, int i, int i_1106_, int i_1107_, int i_1108_, short[][] is, byte[][] is_1109_, byte[][] is_1110_, boolean[] bools) {
		boolean[] bools_1111_ = (null != class651 && class651.aBool8381 ? aBoolArrayArray5026[-366854495 * anInt5051] : aBoolArrayArray5034[-366854495 * anInt5051]);
		if (i_1106_ > 0) {
			if (i > 0) {
				int i_1112_ = is[i - 1][i_1106_ - 1] & 0x7fff;
				if (i_1112_ > 0) {
					Class651 class651_1113_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1112_ - 1, (byte) 25);
					if (-1 != class651_1113_.anInt8383 * -1082268879 && class651_1113_.aBool8381) {
						byte i_1114_ = is_1109_[i - 1][i_1106_ - 1];
						int i_1115_ = 4 + 2 * is_1110_[i - 1][i_1106_ - 1] & 0x7;
						int i_1116_ = Class386.method6456(class178, class651_1113_, 1731257535);
						if (aBoolArrayArray5058[i_1114_][i_1115_]) {
							anIntArray5045[0] = -1082268879 * class651_1113_.anInt8383;
							anIntArray5046[0] = i_1116_;
							anIntArray5047[0] = class651_1113_.anInt8394 * 634101717;
							anIntArray5048[0] = class651_1113_.anInt8387 * -576090841;
							anIntArray5049[0] = class651_1113_.anInt8385 * 486905283;
							anIntArray5032[0] = 256;
						}
					}
				}
			}
			if (i < i_1107_ - 1) {
				int i_1117_ = is[1 + i][i_1106_ - 1] & 0x7fff;
				if (i_1117_ > 0) {
					Class651 class651_1118_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1117_ - 1, (byte) 6);
					if (-1082268879 * class651_1118_.anInt8383 != -1 && class651_1118_.aBool8381) {
						byte i_1119_ = is_1109_[i + 1][i_1106_ - 1];
						int i_1120_ = 2 * is_1110_[1 + i][i_1106_ - 1] + 6 & 0x7;
						int i_1121_ = Class386.method6456(class178, class651_1118_, 2093549333);
						if (aBoolArrayArray5058[i_1119_][i_1120_]) {
							anIntArray5045[2] = class651_1118_.anInt8383 * -1082268879;
							anIntArray5046[2] = i_1121_;
							anIntArray5047[2] = 634101717 * class651_1118_.anInt8394;
							anIntArray5048[2] = class651_1118_.anInt8387 * -576090841;
							anIntArray5049[2] = class651_1118_.anInt8385 * 486905283;
							anIntArray5032[2] = 512;
						}
					}
				}
			}
		}
		if (i_1106_ < i_1108_ - 1) {
			if (i > 0) {
				int i_1122_ = is[i - 1][i_1106_ + 1] & 0x7fff;
				if (i_1122_ > 0) {
					Class651 class651_1123_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1122_ - 1, (byte) -21);
					if (-1082268879 * class651_1123_.anInt8383 != -1 && class651_1123_.aBool8381) {
						byte i_1124_ = is_1109_[i - 1][1 + i_1106_];
						int i_1125_ = 2 + is_1110_[i - 1][1 + i_1106_] * 2 & 0x7;
						int i_1126_ = Class386.method6456(class178, class651_1123_, 1430854036);
						if (aBoolArrayArray5058[i_1124_][i_1125_]) {
							anIntArray5045[6] = class651_1123_.anInt8383 * -1082268879;
							anIntArray5046[6] = i_1126_;
							anIntArray5047[6] = class651_1123_.anInt8394 * 634101717;
							anIntArray5048[6] = class651_1123_.anInt8387 * -576090841;
							anIntArray5049[6] = class651_1123_.anInt8385 * 486905283;
							anIntArray5032[6] = 64;
						}
					}
				}
			}
			if (i < i_1107_ - 1) {
				int i_1127_ = is[1 + i][i_1106_ + 1] & 0x7fff;
				if (i_1127_ > 0) {
					Class651 class651_1128_ = (Class651) aClass53_Sub12_5006.getDefinition(i_1127_ - 1, (byte) 9);
					if (class651_1128_.anInt8383 * -1082268879 != -1 && class651_1128_.aBool8381) {
						byte i_1129_ = is_1109_[1 + i][i_1106_ + 1];
						int i_1130_ = 0 + is_1110_[1 + i][i_1106_ + 1] * 2 & 0x7;
						int i_1131_ = Class386.method6456(class178, class651_1128_, 798153846);
						if (aBoolArrayArray5058[i_1129_][i_1130_]) {
							anIntArray5045[4] = class651_1128_.anInt8383 * -1082268879;
							anIntArray5046[4] = i_1131_;
							anIntArray5047[4] = 634101717 * class651_1128_.anInt8394;
							anIntArray5048[4] = -576090841 * class651_1128_.anInt8387;
							anIntArray5049[4] = class651_1128_.anInt8385 * 486905283;
							anIntArray5032[4] = 128;
						}
					}
				}
			}
		}
		if (i_1106_ > 0) {
			int i_1132_ = is[i][i_1106_ - 1] & 0x7fff;
			if (i_1132_ > 0) {
				Class651 class651_1133_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1132_ - 1, (byte) -23));
				if (-1082268879 * class651_1133_.anInt8383 != -1) {
					byte i_1134_ = is_1109_[i][i_1106_ - 1];
					int i_1135_ = is_1110_[i][i_1106_ - 1];
					if (class651_1133_.aBool8381) {
						int i_1136_ = 2;
						int i_1137_ = 2 * i_1135_ + 4;
						int i_1138_ = Class386.method6456(class178, class651_1133_, -295817759);
						for (int i_1139_ = 0; i_1139_ < 3; i_1139_++) {
							i_1137_ &= 0x7;
							i_1136_ &= 0x7;
							if (aBoolArrayArray5058[i_1134_][i_1137_] && (anIntArray5049[i_1136_] <= 486905283 * class651_1133_.anInt8385)) {
								anIntArray5045[i_1136_] = class651_1133_.anInt8383 * -1082268879;
								anIntArray5046[i_1136_] = i_1138_;
								anIntArray5047[i_1136_] = class651_1133_.anInt8394 * 634101717;
								anIntArray5048[i_1136_] = -576090841 * class651_1133_.anInt8387;
								if (anIntArray5049[i_1136_] == class651_1133_.anInt8385 * 486905283)
									anIntArray5032[i_1136_] |= 0x20;
								else
									anIntArray5032[i_1136_] = 32;
								anIntArray5049[i_1136_] = class651_1133_.anInt8385 * 486905283;
							}
							i_1137_++;
							i_1136_--;
						}
						if (!bools_1111_[425193199 * anInt5052 + 0 & 0x3])
							bools[0] = (aBoolArrayArray5026[i_1134_][2 + i_1135_ & 0x3]);
					} else if (!bools_1111_[0 + anInt5052 * 425193199 & 0x3])
						bools[0] = aBoolArrayArray5034[i_1134_][2 + i_1135_ & 0x3];
				}
			}
		}
		if (i_1106_ < i_1108_ - 1) {
			int i_1140_ = is[i][i_1106_ + 1] & 0x7fff;
			if (i_1140_ > 0) {
				Class651 class651_1141_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1140_ - 1, (byte) -29));
				if (-1 != -1082268879 * class651_1141_.anInt8383) {
					byte i_1142_ = is_1109_[i][1 + i_1106_];
					int i_1143_ = is_1110_[i][i_1106_ + 1];
					if (class651_1141_.aBool8381) {
						int i_1144_ = 4;
						int i_1145_ = i_1143_ * 2 + 2;
						int i_1146_ = Class386.method6456(class178, class651_1141_, -571054792);
						for (int i_1147_ = 0; i_1147_ < 3; i_1147_++) {
							i_1145_ &= 0x7;
							i_1144_ &= 0x7;
							if (aBoolArrayArray5058[i_1142_][i_1145_] && (anIntArray5049[i_1144_] <= class651_1141_.anInt8385 * 486905283)) {
								anIntArray5045[i_1144_] = class651_1141_.anInt8383 * -1082268879;
								anIntArray5046[i_1144_] = i_1146_;
								anIntArray5047[i_1144_] = class651_1141_.anInt8394 * 634101717;
								anIntArray5048[i_1144_] = class651_1141_.anInt8387 * -576090841;
								if (anIntArray5049[i_1144_] == class651_1141_.anInt8385 * 486905283)
									anIntArray5032[i_1144_] |= 0x10;
								else
									anIntArray5032[i_1144_] = 16;
								anIntArray5049[i_1144_] = class651_1141_.anInt8385 * 486905283;
							}
							i_1145_--;
							i_1144_++;
						}
						if (!bools_1111_[2 + 425193199 * anInt5052 & 0x3])
							bools[2] = (aBoolArrayArray5026[i_1142_][0 + i_1143_ & 0x3]);
					} else if (!bools_1111_[2 + 425193199 * anInt5052 & 0x3])
						bools[2] = aBoolArrayArray5034[i_1142_][0 + i_1143_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_1148_ = is[i - 1][i_1106_] & 0x7fff;
			if (i_1148_ > 0) {
				Class651 class651_1149_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1148_ - 1, (byte) -41));
				if (-1 != -1082268879 * class651_1149_.anInt8383) {
					byte i_1150_ = is_1109_[i - 1][i_1106_];
					int i_1151_ = is_1110_[i - 1][i_1106_];
					if (class651_1149_.aBool8381) {
						int i_1152_ = 6;
						int i_1153_ = i_1151_ * 2 + 4;
						int i_1154_ = Class386.method6456(class178, class651_1149_, 1969619189);
						for (int i_1155_ = 0; i_1155_ < 3; i_1155_++) {
							i_1153_ &= 0x7;
							i_1152_ &= 0x7;
							if (aBoolArrayArray5058[i_1150_][i_1153_] && (anIntArray5049[i_1152_] <= class651_1149_.anInt8385 * 486905283)) {
								anIntArray5045[i_1152_] = -1082268879 * class651_1149_.anInt8383;
								anIntArray5046[i_1152_] = i_1154_;
								anIntArray5047[i_1152_] = 634101717 * class651_1149_.anInt8394;
								anIntArray5048[i_1152_] = -576090841 * class651_1149_.anInt8387;
								if (anIntArray5049[i_1152_] == class651_1149_.anInt8385 * 486905283)
									anIntArray5032[i_1152_] |= 0x8;
								else
									anIntArray5032[i_1152_] = 8;
								anIntArray5049[i_1152_] = class651_1149_.anInt8385 * 486905283;
							}
							i_1153_--;
							i_1152_++;
						}
						if (!bools_1111_[3 + anInt5052 * 425193199 & 0x3])
							bools[3] = (aBoolArrayArray5026[i_1150_][1 + i_1151_ & 0x3]);
					} else if (!bools_1111_[425193199 * anInt5052 + 3 & 0x3])
						bools[3] = aBoolArrayArray5034[i_1150_][i_1151_ + 1 & 0x3];
				}
			}
		}
		if (i < i_1107_ - 1) {
			int i_1156_ = is[i + 1][i_1106_] & 0x7fff;
			if (i_1156_ > 0) {
				Class651 class651_1157_ = ((Class651) aClass53_Sub12_5006.getDefinition(i_1156_ - 1, (byte) -10));
				if (-1 != class651_1157_.anInt8383 * -1082268879) {
					byte i_1158_ = is_1109_[i + 1][i_1106_];
					int i_1159_ = is_1110_[1 + i][i_1106_];
					if (class651_1157_.aBool8381) {
						int i_1160_ = 4;
						int i_1161_ = 2 * i_1159_ + 6;
						int i_1162_ = Class386.method6456(class178, class651_1157_, 1218139293);
						for (int i_1163_ = 0; i_1163_ < 3; i_1163_++) {
							i_1161_ &= 0x7;
							i_1160_ &= 0x7;
							if (aBoolArrayArray5058[i_1158_][i_1161_] && (anIntArray5049[i_1160_] <= 486905283 * class651_1157_.anInt8385)) {
								anIntArray5045[i_1160_] = class651_1157_.anInt8383 * -1082268879;
								anIntArray5046[i_1160_] = i_1162_;
								anIntArray5047[i_1160_] = class651_1157_.anInt8394 * 634101717;
								anIntArray5048[i_1160_] = class651_1157_.anInt8387 * -576090841;
								if (anIntArray5049[i_1160_] == 486905283 * class651_1157_.anInt8385)
									anIntArray5032[i_1160_] |= 0x4;
								else
									anIntArray5032[i_1160_] = 4;
								anIntArray5049[i_1160_] = class651_1157_.anInt8385 * 486905283;
							}
							i_1161_++;
							i_1160_--;
						}
						if (!bools_1111_[anInt5052 * 425193199 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5026[i_1158_][3 + i_1159_ & 0x3]);
					} else if (!bools_1111_[425193199 * anInt5052 + 1 & 0x3])
						bools[1] = aBoolArrayArray5034[i_1158_][3 + i_1159_ & 0x3];
				}
			}
		}
		if (null != class651 && class651.aBool8381) {
			int i_1164_ = Class386.method6456(class178, class651, 674213256);
			for (int i_1165_ = 0; i_1165_ < 8; i_1165_++) {
				int i_1166_ = i_1165_ - anInt5052 * 850386398 & 0x7;
				if (aBoolArrayArray5058[-366854495 * anInt5051][i_1165_] && (anIntArray5049[i_1166_] <= 486905283 * class651.anInt8385)) {
					anIntArray5045[i_1166_] = class651.anInt8383 * -1082268879;
					anIntArray5046[i_1166_] = i_1164_;
					anIntArray5047[i_1166_] = class651.anInt8394 * 634101717;
					anIntArray5048[i_1166_] = -576090841 * class651.anInt8387;
					if (anIntArray5049[i_1166_] == class651.anInt8385 * 486905283)
						anIntArray5032[i_1166_] |= 0x2;
					else
						anIntArray5032[i_1166_] = 2;
					anIntArray5049[i_1166_] = class651.anInt8385 * 486905283;
				}
			}
		}
	}

	static final int method7394(Class178 class178, Class651 class651) {
		if (-1 != class651.anInt8386 * 99640975)
			return 99640975 * class651.anInt8386;
		if (-1 != class651.anInt8394 * 634101717) {
			Class177 class177 = class178.aClass172_1916.method2895(class651.anInt8394 * 634101717, -2147158251);
			if (!class177.aBool1876)
				return class177.aShort1907;
		}
		return -1082268879 * class651.anInt8383;
	}

	static final int method7395(int i, int i_1167_, int i_1168_) {
		if (i_1167_ == i)
			return i;
		int i_1169_ = 128 - i_1168_;
		int i_1170_ = (i & 0x7f) * i_1169_ + i_1168_ * (i_1167_ & 0x7f) >> 7;
		int i_1171_ = (i & 0x380) * i_1169_ + i_1168_ * (i_1167_ & 0x380) >> 7;
		int i_1172_ = (i_1167_ & 0xfc00) * i_1168_ + (i & 0xfc00) * i_1169_ >> 7;
		return i_1172_ & 0xfc00 | i_1171_ & 0x380 | i_1170_ & 0x7f;
	}

	public final void method7396(Class523_Sub34 class523_sub34, int i, int i_1173_, int i_1174_, int i_1175_, byte i_1176_) {
		int i_1177_ = i + i_1174_;
		int i_1178_ = i_1173_ + i_1175_;
		for (int i_1179_ = 0; i_1179_ < anInt4990 * 1248554419; i_1179_++) {
			for (int i_1180_ = 0; i_1180_ < 64; i_1180_++) {
				for (int i_1181_ = 0; i_1181_ < 64; i_1181_++)
					method7334(class523_sub34, i_1179_, i_1180_ + i, i_1181_ + i_1173_, 0, 0, i_1180_ + i_1177_, i_1178_ + i_1181_, 0, false, -23665282);
			}
		}
	}

	static final int method7397(int i, int i_1182_) {
		int i_1183_ = (Class194_Sub19.method15523(i - 1, i_1182_ - 1, (byte) 0) + Class194_Sub19.method15523(i + 1, i_1182_ - 1, (byte) 0) + Class194_Sub19.method15523(i - 1, i_1182_ + 1, (byte) 0) + Class194_Sub19.method15523(1 + i, i_1182_ + 1, (byte) 0));
		int i_1184_ = (Class194_Sub19.method15523(i - 1, i_1182_, (byte) 0) + Class194_Sub19.method15523(1 + i, i_1182_, (byte) 0) + Class194_Sub19.method15523(i, i_1182_ - 1, (byte) 0) + Class194_Sub19.method15523(i, i_1182_ + 1, (byte) 0));
		int i_1185_ = Class194_Sub19.method15523(i, i_1182_, (byte) 0);
		return i_1183_ / 16 + i_1184_ / 8 + i_1185_ / 4;
	}

	void method7398(Class651 class651, Class7 class7, int i) {
		if (aBool5000) {
			anIntArray4999 = anIntArrayArray5031[-366854495 * anInt5051];
			anIntArray4992 = anIntArrayArray5019[anInt5051 * -366854495];
			anIntArray5066 = anIntArrayArray5016[-366854495 * anInt5051];
			anInt5063 = -280478319 * (null != class651 ? anIntArray5021[anInt5051 * -366854495] : 0);
			anInt5062 = (class7 != null ? anIntArray4996[anInt5051 * -366854495] : 0) * 1209531539;
		} else if (aBool5060) {
			anIntArray4999 = anIntArrayArray5041[anInt5051 * -366854495];
			anIntArray4992 = anIntArrayArray5042[-366854495 * anInt5051];
			anIntArray5066 = anIntArrayArray5043[-366854495 * anInt5051];
			anInt5063 = -280478319 * (null != class651 ? anIntArray5036[-366854495 * anInt5051] : 0);
			anInt5062 = 1209531539 * (null != class7 ? anIntArray5025[-366854495 * anInt5051] : 0);
			anIntArray5009 = anIntArrayArray5040[anInt5051 * -366854495];
		} else {
			anIntArray4999 = anIntArrayArray5067[-366854495 * anInt5051];
			anIntArray4992 = anIntArrayArray5037[anInt5051 * -366854495];
			anIntArray5066 = anIntArrayArray4993[-366854495 * anInt5051];
			anInt5063 = (null != class651 ? anIntArray5050[anInt5051 * -366854495] : 0) * -280478319;
			anInt5062 = (null != class7 ? anIntArray5024[-366854495 * anInt5051] : 0) * 1209531539;
			anIntArray5009 = anIntArrayArray5035[-366854495 * anInt5051];
		}
	}

	static final int method7399(int i, int i_1186_, int i_1187_) {
		int i_1188_ = i / i_1187_;
		int i_1189_ = i & i_1187_ - 1;
		int i_1190_ = i_1186_ / i_1187_;
		int i_1191_ = i_1186_ & i_1187_ - 1;
		int i_1192_ = Class310.method5635(i_1188_, i_1190_, 1878801744);
		int i_1193_ = Class310.method5635(1 + i_1188_, i_1190_, 1878801744);
		int i_1194_ = Class310.method5635(i_1188_, i_1190_ + 1, 1878801744);
		int i_1195_ = Class310.method5635(1 + i_1188_, 1 + i_1190_, 1878801744);
		int i_1196_ = Class501.method8140(i_1192_, i_1193_, i_1189_, i_1187_, -1773657286);
		int i_1197_ = Class501.method8140(i_1194_, i_1195_, i_1189_, i_1187_, -1773657286);
		return Class501.method8140(i_1196_, i_1197_, i_1191_, i_1187_, -1773657286);
	}

	public final void method7400(int i, int i_1198_, int i_1199_, int i_1200_, int i_1201_, int i_1202_) {
		for (int i_1203_ = i_1199_; i_1203_ < i_1201_ + i_1199_; i_1203_++) {
			for (int i_1204_ = i_1198_; i_1204_ < i_1198_ + i_1200_; i_1204_++) {
				if (i_1204_ >= 0 && i_1204_ < anInt4991 * -1287541105 && i_1203_ >= 0 && i_1203_ < anInt4984 * -215635651)
					anIntArrayArrayArray5033[i][i_1204_][i_1203_] = i > 0 ? (anIntArrayArrayArray5033[i - 1][i_1204_][i_1203_]) - 960 : 0;
			}
		}
		if (i_1198_ > 0 && i_1198_ < -1287541105 * anInt4991) {
			for (int i_1205_ = 1 + i_1199_; i_1205_ < i_1199_ + i_1201_; i_1205_++) {
				if (i_1205_ >= 0 && i_1205_ < anInt4984 * -215635651)
					anIntArrayArrayArray5033[i][i_1198_][i_1205_] = anIntArrayArrayArray5033[i][i_1198_ - 1][i_1205_];
			}
		}
		if (i_1199_ > 0 && i_1199_ < -215635651 * anInt4984) {
			for (int i_1206_ = i_1198_ + 1; i_1206_ < i_1198_ + i_1200_; i_1206_++) {
				if (i_1206_ >= 0 && i_1206_ < -1287541105 * anInt4991)
					anIntArrayArrayArray5033[i][i_1206_][i_1199_] = anIntArrayArrayArray5033[i][i_1206_][i_1199_ - 1];
			}
		}
		if (i_1198_ >= 0 && i_1199_ >= 0 && i_1198_ < -1287541105 * anInt4991 && i_1199_ < -215635651 * anInt4984) {
			if (0 == i) {
				if (i_1198_ > 0 && 0 != anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_])
					anIntArrayArrayArray5033[i][i_1198_][i_1199_] = anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_];
				else if (i_1199_ > 0 && (anIntArrayArrayArray5033[i][i_1198_][i_1199_ - 1] != 0))
					anIntArrayArrayArray5033[i][i_1198_][i_1199_] = anIntArrayArrayArray5033[i][i_1198_][i_1199_ - 1];
				else if (i_1198_ > 0 && i_1199_ > 0 && 0 != (anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_ - 1]))
					anIntArrayArrayArray5033[i][i_1198_][i_1199_] = (anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_ - 1]);
			} else if (i_1198_ > 0 && (anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_] != (anIntArrayArrayArray5033[i - 1][i_1198_ - 1][i_1199_])))
				anIntArrayArrayArray5033[i][i_1198_][i_1199_] = anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_];
			else if (i_1199_ > 0 && (anIntArrayArrayArray5033[i - 1][i_1198_][i_1199_ - 1] != anIntArrayArrayArray5033[i][i_1198_][i_1199_ - 1]))
				anIntArrayArrayArray5033[i][i_1198_][i_1199_] = anIntArrayArrayArray5033[i][i_1198_][i_1199_ - 1];
			else if (i_1198_ > 0 && i_1199_ > 0 && ((anIntArrayArrayArray5033[i - 1][i_1198_ - 1][i_1199_ - 1]) != (anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_ - 1])))
				anIntArrayArrayArray5033[i][i_1198_][i_1199_] = anIntArrayArrayArray5033[i][i_1198_ - 1][i_1199_ - 1];
		}
	}

	static final int method7401(int i, int i_1207_, int i_1208_) {
		int i_1209_ = i / i_1208_;
		int i_1210_ = i & i_1208_ - 1;
		int i_1211_ = i_1207_ / i_1208_;
		int i_1212_ = i_1207_ & i_1208_ - 1;
		int i_1213_ = Class310.method5635(i_1209_, i_1211_, 1878801744);
		int i_1214_ = Class310.method5635(1 + i_1209_, i_1211_, 1878801744);
		int i_1215_ = Class310.method5635(i_1209_, i_1211_ + 1, 1878801744);
		int i_1216_ = Class310.method5635(1 + i_1209_, 1 + i_1211_, 1878801744);
		int i_1217_ = Class501.method8140(i_1213_, i_1214_, i_1210_, i_1208_, -1773657286);
		int i_1218_ = Class501.method8140(i_1215_, i_1216_, i_1210_, i_1208_, -1773657286);
		return Class501.method8140(i_1217_, i_1218_, i_1212_, i_1208_, -1773657286);
	}

	void method7402(Class142 class142, Class7 class7, Class651 class651, int i, int i_1219_, int i_1220_, int i_1221_, int i_1222_, int i_1223_, int i_1224_) {
		int i_1225_ = class142.method2321(i_1219_, i_1220_, 1941570325);
		int i_1226_ = class142.method2321(i_1221_, i_1220_, 1631127983);
		int i_1227_ = class142.method2321(i_1221_, i_1222_, 2106002758);
		int i_1228_ = class142.method2321(i_1219_, i_1222_, 1824138116);
		boolean bool = aClass451_4982.method7282(i_1219_, i_1220_, -638715901);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_1229_ = true;
			if (null != class7 && !class7.aBool53)
				bool_1229_ = false;
			else if (i_1223_ == 0 && anInt5051 * -366854495 != 0)
				bool_1229_ = false;
			else if (i_1224_ > 0 && null != class651 && !class651.aBool8382)
				bool_1229_ = false;
			if (bool_1229_ && i_1226_ == i_1225_ && i_1227_ == i_1225_ && i_1225_ == i_1228_)
				aByteArrayArrayArray5001[i][i_1219_][i_1220_] |= 0x4;
		}
	}

	Class455(Class560 class560, int i, int i_1230_, int i_1231_, boolean bool, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class451 class451) {
		anIntArray5032 = new int[13];
		anInt5053 = 0;
		anInt5054 = 0;
		anIntArray5009 = null;
		aClass560_4983 = class560;
		anInt4990 = 752683387 * i;
		anInt4991 = 1254994031 * i_1230_;
		anInt4984 = i_1231_ * 301168149;
		aBool5022 = bool;
		aClass53_Sub12_5006 = class53_sub12;
		aClass53_Sub5_4981 = class53_sub5;
		aClass451_4982 = class451;
		aShortArrayArrayArray5057 = (new short[anInt4990 * 1248554419][anInt4991 * -1287541105][-215635651 * anInt4984]);
		aShortArrayArrayArray5013 = (new short[anInt4990 * 1248554419][anInt4991 * -1287541105][anInt4984 * -215635651]);
		aByteArrayArrayArray4997 = (new byte[1248554419 * anInt4990][anInt4991 * -1287541105][anInt4984 * -215635651]);
		aByteArrayArrayArray4998 = (new byte[1248554419 * anInt4990][anInt4991 * -1287541105][-215635651 * anInt4984]);
		anIntArrayArrayArray5033 = (new int[1248554419 * anInt4990][-1287541105 * anInt4991 + 1][anInt4984 * -215635651 + 1]);
		aByteArrayArrayArray5001 = (new byte[anInt4990 * 1248554419][-1287541105 * anInt4991 + 1][-215635651 * anInt4984 + 1]);
	}

	static final int method7403(int i, int i_1232_, int i_1233_, int i_1234_) {
		int i_1235_ = 65536 - Class433.anIntArray4881[8192 * i_1233_ / i_1234_] >> 1;
		return (i_1232_ * i_1235_ >> 16) + (i * (65536 - i_1235_) >> 16);
	}

	static final int method7404(int i, int i_1236_) {
		int i_1237_ = (Class194_Sub19.method15523(i - 1, i_1236_ - 1, (byte) 0) + Class194_Sub19.method15523(i + 1, i_1236_ - 1, (byte) 0) + Class194_Sub19.method15523(i - 1, i_1236_ + 1, (byte) 0) + Class194_Sub19.method15523(1 + i, i_1236_ + 1, (byte) 0));
		int i_1238_ = (Class194_Sub19.method15523(i - 1, i_1236_, (byte) 0) + Class194_Sub19.method15523(1 + i, i_1236_, (byte) 0) + Class194_Sub19.method15523(i, i_1236_ - 1, (byte) 0) + Class194_Sub19.method15523(i, i_1236_ + 1, (byte) 0));
		int i_1239_ = Class194_Sub19.method15523(i, i_1236_, (byte) 0);
		return i_1237_ / 16 + i_1238_ / 8 + i_1239_ / 4;
	}

	public final void method7405(int i, int i_1240_, int i_1241_, int i_1242_, int i_1243_) {
		for (int i_1244_ = i_1241_; i_1244_ < i_1243_ + i_1241_; i_1244_++) {
			for (int i_1245_ = i_1240_; i_1245_ < i_1240_ + i_1242_; i_1245_++) {
				if (i_1245_ >= 0 && i_1245_ < anInt4991 * -1287541105 && i_1244_ >= 0 && i_1244_ < anInt4984 * -215635651)
					anIntArrayArrayArray5033[i][i_1245_][i_1244_] = i > 0 ? (anIntArrayArrayArray5033[i - 1][i_1245_][i_1244_]) - 960 : 0;
			}
		}
		if (i_1240_ > 0 && i_1240_ < -1287541105 * anInt4991) {
			for (int i_1246_ = 1 + i_1241_; i_1246_ < i_1241_ + i_1243_; i_1246_++) {
				if (i_1246_ >= 0 && i_1246_ < anInt4984 * -215635651)
					anIntArrayArrayArray5033[i][i_1240_][i_1246_] = anIntArrayArrayArray5033[i][i_1240_ - 1][i_1246_];
			}
		}
		if (i_1241_ > 0 && i_1241_ < -215635651 * anInt4984) {
			for (int i_1247_ = i_1240_ + 1; i_1247_ < i_1240_ + i_1242_; i_1247_++) {
				if (i_1247_ >= 0 && i_1247_ < -1287541105 * anInt4991)
					anIntArrayArrayArray5033[i][i_1247_][i_1241_] = anIntArrayArrayArray5033[i][i_1247_][i_1241_ - 1];
			}
		}
		if (i_1240_ >= 0 && i_1241_ >= 0 && i_1240_ < -1287541105 * anInt4991 && i_1241_ < -215635651 * anInt4984) {
			if (0 == i) {
				if (i_1240_ > 0 && 0 != anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_])
					anIntArrayArrayArray5033[i][i_1240_][i_1241_] = anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_];
				else if (i_1241_ > 0 && (anIntArrayArrayArray5033[i][i_1240_][i_1241_ - 1] != 0))
					anIntArrayArrayArray5033[i][i_1240_][i_1241_] = anIntArrayArrayArray5033[i][i_1240_][i_1241_ - 1];
				else if (i_1240_ > 0 && i_1241_ > 0 && 0 != (anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_ - 1]))
					anIntArrayArrayArray5033[i][i_1240_][i_1241_] = (anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_ - 1]);
			} else if (i_1240_ > 0 && (anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_] != (anIntArrayArrayArray5033[i - 1][i_1240_ - 1][i_1241_])))
				anIntArrayArrayArray5033[i][i_1240_][i_1241_] = anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_];
			else if (i_1241_ > 0 && (anIntArrayArrayArray5033[i - 1][i_1240_][i_1241_ - 1] != anIntArrayArrayArray5033[i][i_1240_][i_1241_ - 1]))
				anIntArrayArrayArray5033[i][i_1240_][i_1241_] = anIntArrayArrayArray5033[i][i_1240_][i_1241_ - 1];
			else if (i_1240_ > 0 && i_1241_ > 0 && ((anIntArrayArrayArray5033[i - 1][i_1240_ - 1][i_1241_ - 1]) != (anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_ - 1])))
				anIntArrayArrayArray5033[i][i_1240_][i_1241_] = anIntArrayArrayArray5033[i][i_1240_ - 1][i_1241_ - 1];
		}
	}

	static final int method7406(int i, int i_1248_) {
		int i_1249_ = 57 * i_1248_ + i;
		i_1249_ = i_1249_ << 13 ^ i_1249_;
		int i_1250_ = (1376312589 + (789221 + 15731 * (i_1249_ * i_1249_)) * i_1249_ & 0x7fffffff);
		return i_1250_ >> 19 & 0xff;
	}

	static final int method7407(int i, int i_1251_) {
		int i_1252_ = 57 * i_1251_ + i;
		i_1252_ = i_1252_ << 13 ^ i_1252_;
		int i_1253_ = (1376312589 + (789221 + 15731 * (i_1252_ * i_1252_)) * i_1252_ & 0x7fffffff);
		return i_1253_ >> 19 & 0xff;
	}

	public final void method7408(Class523_Sub34 class523_sub34, int i, int i_1254_, int i_1255_, int i_1256_) {
		int i_1257_ = i + i_1255_;
		int i_1258_ = i_1254_ + i_1256_;
		for (int i_1259_ = 0; i_1259_ < anInt4990 * 1248554419; i_1259_++) {
			for (int i_1260_ = 0; i_1260_ < 64; i_1260_++) {
				for (int i_1261_ = 0; i_1261_ < 64; i_1261_++)
					method7334(class523_sub34, i_1259_, i_1260_ + i, i_1261_ + i_1254_, 0, 0, i_1260_ + i_1257_, i_1258_ + i_1261_, 0, false, 926312999);
			}
		}
	}

	void method7409(Class178 class178, Class142 class142, int i, int[][] is, Class142 class142_1262_, Class142 class142_1263_, byte i_1264_) {
		for (int i_1265_ = 0; i_1265_ < anInt4991 * -1287541105; i_1265_++) {
			for (int i_1266_ = 0; i_1266_ < -215635651 * anInt4984; i_1266_++) {
				byte i_1267_ = aByteArrayArrayArray4997[i][i_1265_][i_1266_];
				byte i_1268_ = aByteArrayArrayArray4998[i][i_1265_][i_1266_];
				int i_1269_ = aShortArrayArrayArray5013[i][i_1265_][i_1266_] & 0x7fff;
				int i_1270_ = aShortArrayArrayArray5057[i][i_1265_][i_1266_] & 0x7fff;
				Class651 class651 = ((Class651) (0 != i_1269_ ? aClass53_Sub12_5006.getDefinition(i_1269_ - 1, (byte) -74) : null));
				Class7 class7 = ((Class7) (0 != i_1270_ ? aClass53_Sub5_4981.getDefinition(i_1270_ - 1, (byte) -59) : null));
				if (i_1267_ == 0 && class651 == null)
					i_1267_ = (byte) 12;
				Class651 class651_1271_ = class651;
				if (null != class651 && -1 == class651.anInt8383 * -1082268879 && class651.anInt8386 * 99640975 == -1) {
					class651_1271_ = class651;
					class651 = null;
				}
				if (null != class651 || class7 != null) {
					anInt5062 = anIntArray4996[i_1267_] * 1209531539;
					anInt5063 = -280478319 * anIntArray5021[i_1267_];
					int i_1272_ = ((class7 != null ? anInt5062 * -461602405 : 0) + (null != class651 ? 613557105 * anInt5063 : 0));
					int i_1273_ = 0;
					anInt5052 = 0;
					anInt5055 = (null != class651 ? 634101717 * class651.anInt8394 : -1) * 17269097;
					int i_1274_ = class7 != null ? -609411693 * class7.anInt56 : -1;
					int[] is_1275_ = new int[i_1272_];
					int[] is_1276_ = new int[i_1272_];
					int[] is_1277_ = new int[i_1272_];
					int[] is_1278_ = new int[i_1272_];
					int[] is_1279_ = new int[i_1272_];
					int[] is_1280_ = new int[i_1272_];
					int[] is_1281_ = ((null != class651 && -1 != 99640975 * class651.anInt8386) ? new int[i_1272_] : null);
					if (null != class651) {
						for (int i_1282_ = 0; i_1282_ < 613557105 * anInt5063; i_1282_++) {
							is_1275_[i_1273_] = (anIntArrayArray5031[i_1267_][anInt5052 * 425193199]);
							is_1276_[i_1273_] = (anIntArrayArray5019[i_1267_][425193199 * anInt5052]);
							is_1277_[i_1273_] = (anIntArrayArray5016[i_1267_][anInt5052 * 425193199]);
							is_1279_[i_1273_] = -74375463 * anInt5055;
							is_1280_[i_1273_] = -576090841 * class651.anInt8387;
							is_1278_[i_1273_] = -1082268879 * class651.anInt8383;
							if (null != is_1281_)
								is_1281_[i_1273_] = class651.anInt8386 * 99640975;
							i_1273_++;
							anInt5052 += -1179189233;
						}
						if (!aBool5022 && 0 == i)
							aClass560_4983.method9263(i_1265_, i_1266_, -776637411 * class651.anInt8391, class651.anInt8392 * 1640288520, class651.anInt8393 * 1354101051, class651.anInt8388 * -134620943, class651.anInt8395 * 19373761, 2062212613 * class651.anInt8396, (byte) 26);
					} else
						anInt5052 += anInt5063 * 592909215;
					if (null != class7) {
						for (int i_1283_ = 0; i_1283_ < anInt5062 * -461602405; i_1283_++) {
							is_1275_[i_1273_] = (anIntArrayArray5031[i_1267_][425193199 * anInt5052]);
							is_1276_[i_1273_] = (anIntArrayArray5019[i_1267_][anInt5052 * 425193199]);
							is_1277_[i_1273_] = (anIntArrayArray5016[i_1267_][425193199 * anInt5052]);
							is_1279_[i_1273_] = i_1274_;
							is_1280_[i_1273_] = class7.anInt49 * 424256487;
							is_1278_[i_1273_] = is[i_1265_][i_1266_];
							if (is_1281_ != null)
								is_1281_[i_1273_] = is_1278_[i_1273_];
							i_1273_++;
							anInt5052 += -1179189233;
						}
					}
					int i_1284_ = anIntArray5027.length;
					int[] is_1285_ = new int[i_1284_];
					int[] is_1286_ = new int[i_1284_];
					int[] is_1287_ = class142_1263_ != null ? new int[i_1284_] : null;
					int[] is_1288_ = (class142_1263_ != null || null != class142_1262_ ? new int[i_1284_] : null);
					for (int i_1289_ = 0; i_1289_ < i_1284_; i_1289_++) {
						int i_1290_ = anIntArray5027[i_1289_];
						int i_1291_ = anIntArray5028[i_1289_];
						if (0 == i_1268_) {
							is_1285_[i_1289_] = i_1290_;
							is_1286_[i_1289_] = i_1291_;
						} else if (1 == i_1268_) {
							int i_1292_ = i_1290_;
							is_1285_[i_1289_] = i_1291_;
							is_1286_[i_1289_] = 512 - i_1292_;
						} else if (2 == i_1268_) {
							is_1285_[i_1289_] = 512 - i_1290_;
							is_1286_[i_1289_] = 512 - i_1291_;
						} else if (i_1268_ == 3) {
							int i_1293_ = i_1290_;
							is_1285_[i_1289_] = 512 - i_1291_;
							is_1286_[i_1289_] = i_1293_;
						}
						if (null != is_1287_ && aBoolArrayArray5058[i_1267_][i_1289_]) {
							int i_1294_ = (i_1265_ << 9) + is_1285_[i_1289_];
							int i_1295_ = (i_1266_ << 9) + is_1286_[i_1289_];
							is_1287_[i_1289_] = (class142_1263_.method2326(i_1294_, i_1295_, 1467954267) - class142.method2326(i_1294_, i_1295_, 581837972));
						}
						if (null != is_1288_) {
							if (null != class142_1263_ && !aBoolArrayArray5058[i_1267_][i_1289_]) {
								int i_1296_ = (i_1265_ << 9) + is_1285_[i_1289_];
								int i_1297_ = is_1286_[i_1289_] + (i_1266_ << 9);
								is_1288_[i_1289_] = (class142.method2326(i_1296_, i_1297_, 1993085282) - class142_1263_.method2326(i_1296_, i_1297_, 749636205));
							} else if (null != class142_1262_ && !(aBoolArrayArray5064[i_1267_][i_1289_])) {
								int i_1298_ = is_1285_[i_1289_] + (i_1265_ << 9);
								int i_1299_ = (i_1266_ << 9) + is_1286_[i_1289_];
								is_1288_[i_1289_] = (class142_1262_.method2326(i_1298_, i_1299_, 434877090) - class142.method2326(i_1298_, i_1299_, -301137879));
							}
						}
					}
					int i_1300_ = class142.method2321(i_1265_, i_1266_, 1896011050);
					int i_1301_ = class142.method2321(1 + i_1265_, i_1266_, 2108634788);
					int i_1302_ = class142.method2321(1 + i_1265_, 1 + i_1266_, 1812141820);
					int i_1303_ = class142.method2321(i_1265_, 1 + i_1266_, 1728316109);
					boolean bool = aClass451_4982.method7282(i_1265_, i_1266_, -638715901);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_1304_ = true;
						if (class7 != null && !class7.aBool53)
							bool_1304_ = false;
						else if (0 == i_1270_ && i_1267_ != 0)
							bool_1304_ = false;
						else if (i_1269_ > 0 && null != class651_1271_ && !class651_1271_.aBool8382)
							bool_1304_ = false;
						if (bool_1304_ && i_1300_ == i_1301_ && i_1302_ == i_1300_ && i_1303_ == i_1300_)
							aByteArrayArrayArray5001[i][i_1265_][i_1266_] |= 0x4;
					}
					Class163 class163 = new Class163();
					if (aBool5022) {
						class163.anInt1776 = (aClass560_4983.method9258(i_1265_, i_1266_, (byte) 35) * -780986409);
						class163.anInt1775 = aClass560_4983.method9254(i_1265_, i_1266_, 16711935) * 2053161261;
						class163.anInt1774 = aClass560_4983.method9301(i_1265_, i_1266_, 65535) * 1512945865;
						class163.anInt1778 = (aClass560_4983.method9260(i_1265_, i_1266_, (short) -14060) * -923094865);
						class163.anInt1777 = (aClass560_4983.method9261(i_1265_, i_1266_, (short) 17769) * -320151975);
						class163.anInt1773 = aClass560_4983.method9329(i_1265_, i_1266_, 40000) * -58453511;
					}
					class142.method2323(i_1265_, i_1266_, is_1285_, is_1287_, is_1286_, is_1288_, is_1275_, is_1276_, is_1277_, is_1278_, is_1281_, is_1279_, is_1280_, class163, false);
					aClass560_4983.method9330(i, i_1265_, i_1266_, (byte) 4);
				}
			}
		}
	}

	static void method7410(int i, byte i_1305_) {
		for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(1559043016)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) 28))) {
			if (Class263.method4741((-2101009827 * class523_sub27_sub6.anInt11639), 2037124381) && i == class523_sub27_sub6.anInt11640 * -967967353 >> 16)
				Class232.method4256(class523_sub27_sub6, (byte) 89);
		}
	}

	static final void method7411(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class341.aBool3608 ? 1 : 0;
	}

	static final void method7412(Class669 class669, int i) {
		Class652.method10644(1628672939);
	}

	public static boolean method7413(char c, short i) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || '\u0153' == c || '\u0178' == c)
			return true;
		return false;
	}

	static final void method7414(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class291.method5235(class250, class242, class669, -853549931);
	}
}
