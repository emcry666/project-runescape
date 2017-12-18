/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class460 {
	int[] anIntArray5097;
	int anInt5098;
	byte[] aByteArray5099;
	int[][] anIntArrayArray5100;
	int anInt5101;
	int[] anIntArray5102;
	int[] anIntArray5103;
	Class283 aClass283_5104;
	int anInt5105;
	int[] anIntArray5106;
	int[] anIntArray5107;
	byte[][] aByteArrayArray5108;
	int[] anIntArray5109;
	int[] anIntArray5110;
	int[] anIntArray5111;
	int[] anIntArray5112;
	int[][] anIntArrayArray5113;
	int anInt5114;
	Class283[] aClass283Array5115;
	static final int anInt5116 = 7;

	void method7497(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(Class558.method9233(is, -883414782));
		int i = class523_sub34.readUnsignedByte(-1057185260);
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5114 = class523_sub34.readUnsignedInt((byte) -121) * 162910219;
		else
			anInt5114 = 0;
		int i_0_ = class523_sub34.readUnsignedByte(1033085138);
		boolean bool = (i_0_ & 0x1) != 0;
		boolean bool_1_ = 0 != (i_0_ & 0x2);
		boolean bool_2_ = 0 != (i_0_ & 0x4);
		boolean bool_3_ = 0 != (i_0_ & 0x8);
		if (i >= 7)
			anInt5101 = class523_sub34.method16303(2119359990) * 342435449;
		else
			anInt5101 = class523_sub34.readUnsignedShort(-356257116) * 342435449;
		int i_4_ = 0;
		int i_5_ = -1;
		anIntArray5109 = new int[anInt5101 * 672162761];
		if (i >= 7) {
			for (int i_6_ = 0; i_6_ < 672162761 * anInt5101; i_6_++) {
				anIntArray5109[i_6_] = i_4_ += class523_sub34.method16303(2012772392);
				if (anIntArray5109[i_6_] > i_5_)
					i_5_ = anIntArray5109[i_6_];
			}
		} else {
			for (int i_7_ = 0; i_7_ < anInt5101 * 672162761; i_7_++) {
				anIntArray5109[i_7_] = i_4_ += class523_sub34.readUnsignedShort(-1279348344);
				if (anIntArray5109[i_7_] > i_5_)
					i_5_ = anIntArray5109[i_7_];
			}
		}
		anInt5105 = 2014493443 * (i_5_ + 1);
		anIntArray5102 = new int[anInt5105 * -132118613];
		if (bool_3_)
			anIntArray5107 = new int[anInt5105 * -132118613];
		if (bool_1_)
			aByteArrayArray5108 = new byte[anInt5105 * -132118613][];
		anIntArray5097 = new int[anInt5105 * -132118613];
		anIntArray5112 = new int[anInt5105 * -132118613];
		anIntArrayArray5100 = new int[anInt5105 * -132118613][];
		anIntArray5106 = new int[anInt5105 * -132118613];
		if (bool) {
			anIntArray5103 = new int[-132118613 * anInt5105];
			for (int i_8_ = 0; i_8_ < anInt5105 * -132118613; i_8_++)
				anIntArray5103[i_8_] = -1;
			for (int i_9_ = 0; i_9_ < 672162761 * anInt5101; i_9_++)
				anIntArray5103[anIntArray5109[i_9_]] = class523_sub34.readUnsignedInt((byte) -35);
			aClass283_5104 = new Class283(anIntArray5103);
		}
		for (int i_10_ = 0; i_10_ < 672162761 * anInt5101; i_10_++)
			anIntArray5102[anIntArray5109[i_10_]] = class523_sub34.readUnsignedInt((byte) -31);
		if (bool_3_) {
			for (int i_11_ = 0; i_11_ < anInt5101 * 672162761; i_11_++)
				anIntArray5107[i_11_] = class523_sub34.readUnsignedInt((byte) -10);
		}
		if (bool_1_) {
			for (int i_12_ = 0; i_12_ < 672162761 * anInt5101; i_12_++) {
				byte[] is_13_ = new byte[64];
				class523_sub34.method16298(is_13_, 0, 64, (byte) -69);
				aByteArrayArray5108[anIntArray5109[i_12_]] = is_13_;
			}
		}
		if (bool_2_) {
			anIntArray5110 = new int[anInt5105 * -132118613];
			anIntArray5111 = new int[anInt5105 * -132118613];
			for (int i_14_ = 0; i_14_ < 672162761 * anInt5101; i_14_++) {
				anIntArray5110[anIntArray5109[i_14_]] = class523_sub34.readUnsignedInt((byte) -59);
				anIntArray5111[anIntArray5109[i_14_]] = class523_sub34.readUnsignedInt((byte) -75);
			}
		}
		for (int i_15_ = 0; i_15_ < 672162761 * anInt5101; i_15_++)
			anIntArray5097[anIntArray5109[i_15_]] = class523_sub34.readUnsignedInt((byte) -12);
		if (i >= 7) {
			for (int i_16_ = 0; i_16_ < anInt5101 * 672162761; i_16_++)
				anIntArray5112[anIntArray5109[i_16_]] = class523_sub34.method16303(2132767032);
			for (int i_17_ = 0; i_17_ < 672162761 * anInt5101; i_17_++) {
				int i_18_ = anIntArray5109[i_17_];
				int i_19_ = anIntArray5112[i_18_];
				i_4_ = 0;
				int i_20_ = -1;
				anIntArrayArray5100[i_18_] = new int[i_19_];
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					int i_22_ = (anIntArrayArray5100[i_18_][i_21_] = i_4_ += class523_sub34.method16303(2093627142));
					if (i_22_ > i_20_)
						i_20_ = i_22_;
				}
				anIntArray5106[i_18_] = 1 + i_20_;
				if (1 + i_20_ == i_19_)
					anIntArrayArray5100[i_18_] = null;
			}
		} else {
			for (int i_23_ = 0; i_23_ < 672162761 * anInt5101; i_23_++)
				anIntArray5112[anIntArray5109[i_23_]] = class523_sub34.readUnsignedShort(-414741614);
			for (int i_24_ = 0; i_24_ < 672162761 * anInt5101; i_24_++) {
				int i_25_ = anIntArray5109[i_24_];
				int i_26_ = anIntArray5112[i_25_];
				i_4_ = 0;
				int i_27_ = -1;
				anIntArrayArray5100[i_25_] = new int[i_26_];
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					int i_29_ = (anIntArrayArray5100[i_25_][i_28_] = i_4_ += class523_sub34.readUnsignedShort(-1775179087));
					if (i_29_ > i_27_)
						i_27_ = i_29_;
				}
				anIntArray5106[i_25_] = 1 + i_27_;
				if (1 + i_27_ == i_26_)
					anIntArrayArray5100[i_25_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5113 = new int[1 + i_5_][];
			aClass283Array5115 = new Class283[i_5_ + 1];
			for (int i_30_ = 0; i_30_ < 672162761 * anInt5101; i_30_++) {
				int i_31_ = anIntArray5109[i_30_];
				int i_32_ = anIntArray5112[i_31_];
				anIntArrayArray5113[i_31_] = new int[anIntArray5106[i_31_]];
				for (int i_33_ = 0; i_33_ < anIntArray5106[i_31_]; i_33_++)
					anIntArrayArray5113[i_31_][i_33_] = -1;
				for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
					int i_35_;
					if (anIntArrayArray5100[i_31_] != null)
						i_35_ = anIntArrayArray5100[i_31_][i_34_];
					else
						i_35_ = i_34_;
					anIntArrayArray5113[i_31_][i_35_] = class523_sub34.readUnsignedInt((byte) -44);
				}
				aClass283Array5115[i_31_] = new Class283(anIntArrayArray5113[i_31_]);
			}
		}
	}

	void method7498(byte[] is, byte i) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(Class558.method9233(is, 1829108753));
		int i_36_ = class523_sub34.readUnsignedByte(-1487671675);
		if (i_36_ < 5 || i_36_ > 7)
			throw new RuntimeException();
		if (i_36_ >= 6)
			anInt5114 = class523_sub34.readUnsignedInt((byte) -117) * 162910219;
		else
			anInt5114 = 0;
		int i_37_ = class523_sub34.readUnsignedByte(653514236);
		boolean bool = (i_37_ & 0x1) != 0;
		boolean bool_38_ = 0 != (i_37_ & 0x2);
		boolean bool_39_ = 0 != (i_37_ & 0x4);
		boolean bool_40_ = 0 != (i_37_ & 0x8);
		if (i_36_ >= 7)
			anInt5101 = class523_sub34.method16303(2021508490) * 342435449;
		else
			anInt5101 = class523_sub34.readUnsignedShort(-1024256330) * 342435449;
		int i_41_ = 0;
		int i_42_ = -1;
		anIntArray5109 = new int[anInt5101 * 672162761];
		if (i_36_ >= 7) {
			for (int i_43_ = 0; i_43_ < 672162761 * anInt5101; i_43_++) {
				anIntArray5109[i_43_] = i_41_ += class523_sub34.method16303(1971606873);
				if (anIntArray5109[i_43_] > i_42_)
					i_42_ = anIntArray5109[i_43_];
			}
		} else {
			for (int i_44_ = 0; i_44_ < anInt5101 * 672162761; i_44_++) {
				anIntArray5109[i_44_] = i_41_ += class523_sub34.readUnsignedShort(-8982461);
				if (anIntArray5109[i_44_] > i_42_)
					i_42_ = anIntArray5109[i_44_];
			}
		}
		anInt5105 = 2014493443 * (i_42_ + 1);
		anIntArray5102 = new int[anInt5105 * -132118613];
		if (bool_40_)
			anIntArray5107 = new int[anInt5105 * -132118613];
		if (bool_38_)
			aByteArrayArray5108 = new byte[anInt5105 * -132118613][];
		anIntArray5097 = new int[anInt5105 * -132118613];
		anIntArray5112 = new int[anInt5105 * -132118613];
		anIntArrayArray5100 = new int[anInt5105 * -132118613][];
		anIntArray5106 = new int[anInt5105 * -132118613];
		if (bool) {
			anIntArray5103 = new int[-132118613 * anInt5105];
			for (int i_45_ = 0; i_45_ < anInt5105 * -132118613; i_45_++)
				anIntArray5103[i_45_] = -1;
			for (int i_46_ = 0; i_46_ < 672162761 * anInt5101; i_46_++)
				anIntArray5103[anIntArray5109[i_46_]] = class523_sub34.readUnsignedInt((byte) -20);
			aClass283_5104 = new Class283(anIntArray5103);
		}
		for (int i_47_ = 0; i_47_ < 672162761 * anInt5101; i_47_++)
			anIntArray5102[anIntArray5109[i_47_]] = class523_sub34.readUnsignedInt((byte) -12);
		if (bool_40_) {
			for (int i_48_ = 0; i_48_ < anInt5101 * 672162761; i_48_++)
				anIntArray5107[i_48_] = class523_sub34.readUnsignedInt((byte) -96);
		}
		if (bool_38_) {
			for (int i_49_ = 0; i_49_ < 672162761 * anInt5101; i_49_++) {
				byte[] is_50_ = new byte[64];
				class523_sub34.method16298(is_50_, 0, 64, (byte) 43);
				aByteArrayArray5108[anIntArray5109[i_49_]] = is_50_;
			}
		}
		if (bool_39_) {
			anIntArray5110 = new int[anInt5105 * -132118613];
			anIntArray5111 = new int[anInt5105 * -132118613];
			for (int i_51_ = 0; i_51_ < 672162761 * anInt5101; i_51_++) {
				anIntArray5110[anIntArray5109[i_51_]] = class523_sub34.readUnsignedInt((byte) -83);
				anIntArray5111[anIntArray5109[i_51_]] = class523_sub34.readUnsignedInt((byte) -125);
			}
		}
		for (int i_52_ = 0; i_52_ < 672162761 * anInt5101; i_52_++)
			anIntArray5097[anIntArray5109[i_52_]] = class523_sub34.readUnsignedInt((byte) -122);
		if (i_36_ >= 7) {
			for (int i_53_ = 0; i_53_ < anInt5101 * 672162761; i_53_++)
				anIntArray5112[anIntArray5109[i_53_]] = class523_sub34.method16303(2094552176);
			for (int i_54_ = 0; i_54_ < 672162761 * anInt5101; i_54_++) {
				int i_55_ = anIntArray5109[i_54_];
				int i_56_ = anIntArray5112[i_55_];
				i_41_ = 0;
				int i_57_ = -1;
				anIntArrayArray5100[i_55_] = new int[i_56_];
				for (int i_58_ = 0; i_58_ < i_56_; i_58_++) {
					int i_59_ = (anIntArrayArray5100[i_55_][i_58_] = i_41_ += class523_sub34.method16303(1944178785));
					if (i_59_ > i_57_)
						i_57_ = i_59_;
				}
				anIntArray5106[i_55_] = 1 + i_57_;
				if (1 + i_57_ == i_56_)
					anIntArrayArray5100[i_55_] = null;
			}
		} else {
			for (int i_60_ = 0; i_60_ < 672162761 * anInt5101; i_60_++)
				anIntArray5112[anIntArray5109[i_60_]] = class523_sub34.readUnsignedShort(-1930793577);
			for (int i_61_ = 0; i_61_ < 672162761 * anInt5101; i_61_++) {
				int i_62_ = anIntArray5109[i_61_];
				int i_63_ = anIntArray5112[i_62_];
				i_41_ = 0;
				int i_64_ = -1;
				anIntArrayArray5100[i_62_] = new int[i_63_];
				for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
					int i_66_ = (anIntArrayArray5100[i_62_][i_65_] = i_41_ += class523_sub34.readUnsignedShort(-1932766621));
					if (i_66_ > i_64_)
						i_64_ = i_66_;
				}
				anIntArray5106[i_62_] = 1 + i_64_;
				if (1 + i_64_ == i_63_)
					anIntArrayArray5100[i_62_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5113 = new int[1 + i_42_][];
			aClass283Array5115 = new Class283[i_42_ + 1];
			for (int i_67_ = 0; i_67_ < 672162761 * anInt5101; i_67_++) {
				int i_68_ = anIntArray5109[i_67_];
				int i_69_ = anIntArray5112[i_68_];
				anIntArrayArray5113[i_68_] = new int[anIntArray5106[i_68_]];
				for (int i_70_ = 0; i_70_ < anIntArray5106[i_68_]; i_70_++)
					anIntArrayArray5113[i_68_][i_70_] = -1;
				for (int i_71_ = 0; i_71_ < i_69_; i_71_++) {
					int i_72_;
					if (anIntArrayArray5100[i_68_] != null)
						i_72_ = anIntArrayArray5100[i_68_][i_71_];
					else
						i_72_ = i_71_;
					anIntArrayArray5113[i_68_][i_72_] = class523_sub34.readUnsignedInt((byte) -25);
				}
				aClass283Array5115[i_68_] = new Class283(anIntArrayArray5113[i_68_]);
			}
		}
	}

	void method7499(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(Class558.method9233(is, -1623429490));
		int i = class523_sub34.readUnsignedByte(-1308075250);
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5114 = class523_sub34.readUnsignedInt((byte) -70) * 162910219;
		else
			anInt5114 = 0;
		int i_73_ = class523_sub34.readUnsignedByte(207553599);
		boolean bool = (i_73_ & 0x1) != 0;
		boolean bool_74_ = 0 != (i_73_ & 0x2);
		boolean bool_75_ = 0 != (i_73_ & 0x4);
		boolean bool_76_ = 0 != (i_73_ & 0x8);
		if (i >= 7)
			anInt5101 = class523_sub34.method16303(1982053610) * 342435449;
		else
			anInt5101 = class523_sub34.readUnsignedShort(-1712077300) * 342435449;
		int i_77_ = 0;
		int i_78_ = -1;
		anIntArray5109 = new int[anInt5101 * 672162761];
		if (i >= 7) {
			for (int i_79_ = 0; i_79_ < 672162761 * anInt5101; i_79_++) {
				anIntArray5109[i_79_] = i_77_ += class523_sub34.method16303(2136370952);
				if (anIntArray5109[i_79_] > i_78_)
					i_78_ = anIntArray5109[i_79_];
			}
		} else {
			for (int i_80_ = 0; i_80_ < anInt5101 * 672162761; i_80_++) {
				anIntArray5109[i_80_] = i_77_ += class523_sub34.readUnsignedShort(-907730300);
				if (anIntArray5109[i_80_] > i_78_)
					i_78_ = anIntArray5109[i_80_];
			}
		}
		anInt5105 = 2014493443 * (i_78_ + 1);
		anIntArray5102 = new int[anInt5105 * -132118613];
		if (bool_76_)
			anIntArray5107 = new int[anInt5105 * -132118613];
		if (bool_74_)
			aByteArrayArray5108 = new byte[anInt5105 * -132118613][];
		anIntArray5097 = new int[anInt5105 * -132118613];
		anIntArray5112 = new int[anInt5105 * -132118613];
		anIntArrayArray5100 = new int[anInt5105 * -132118613][];
		anIntArray5106 = new int[anInt5105 * -132118613];
		if (bool) {
			anIntArray5103 = new int[-132118613 * anInt5105];
			for (int i_81_ = 0; i_81_ < anInt5105 * -132118613; i_81_++)
				anIntArray5103[i_81_] = -1;
			for (int i_82_ = 0; i_82_ < 672162761 * anInt5101; i_82_++)
				anIntArray5103[anIntArray5109[i_82_]] = class523_sub34.readUnsignedInt((byte) -53);
			aClass283_5104 = new Class283(anIntArray5103);
		}
		for (int i_83_ = 0; i_83_ < 672162761 * anInt5101; i_83_++)
			anIntArray5102[anIntArray5109[i_83_]] = class523_sub34.readUnsignedInt((byte) -10);
		if (bool_76_) {
			for (int i_84_ = 0; i_84_ < anInt5101 * 672162761; i_84_++)
				anIntArray5107[i_84_] = class523_sub34.readUnsignedInt((byte) -23);
		}
		if (bool_74_) {
			for (int i_85_ = 0; i_85_ < 672162761 * anInt5101; i_85_++) {
				byte[] is_86_ = new byte[64];
				class523_sub34.method16298(is_86_, 0, 64, (byte) 1);
				aByteArrayArray5108[anIntArray5109[i_85_]] = is_86_;
			}
		}
		if (bool_75_) {
			anIntArray5110 = new int[anInt5105 * -132118613];
			anIntArray5111 = new int[anInt5105 * -132118613];
			for (int i_87_ = 0; i_87_ < 672162761 * anInt5101; i_87_++) {
				anIntArray5110[anIntArray5109[i_87_]] = class523_sub34.readUnsignedInt((byte) -46);
				anIntArray5111[anIntArray5109[i_87_]] = class523_sub34.readUnsignedInt((byte) -68);
			}
		}
		for (int i_88_ = 0; i_88_ < 672162761 * anInt5101; i_88_++)
			anIntArray5097[anIntArray5109[i_88_]] = class523_sub34.readUnsignedInt((byte) -117);
		if (i >= 7) {
			for (int i_89_ = 0; i_89_ < anInt5101 * 672162761; i_89_++)
				anIntArray5112[anIntArray5109[i_89_]] = class523_sub34.method16303(1988841489);
			for (int i_90_ = 0; i_90_ < 672162761 * anInt5101; i_90_++) {
				int i_91_ = anIntArray5109[i_90_];
				int i_92_ = anIntArray5112[i_91_];
				i_77_ = 0;
				int i_93_ = -1;
				anIntArrayArray5100[i_91_] = new int[i_92_];
				for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
					int i_95_ = (anIntArrayArray5100[i_91_][i_94_] = i_77_ += class523_sub34.method16303(1953549934));
					if (i_95_ > i_93_)
						i_93_ = i_95_;
				}
				anIntArray5106[i_91_] = 1 + i_93_;
				if (1 + i_93_ == i_92_)
					anIntArrayArray5100[i_91_] = null;
			}
		} else {
			for (int i_96_ = 0; i_96_ < 672162761 * anInt5101; i_96_++)
				anIntArray5112[anIntArray5109[i_96_]] = class523_sub34.readUnsignedShort(-1120418253);
			for (int i_97_ = 0; i_97_ < 672162761 * anInt5101; i_97_++) {
				int i_98_ = anIntArray5109[i_97_];
				int i_99_ = anIntArray5112[i_98_];
				i_77_ = 0;
				int i_100_ = -1;
				anIntArrayArray5100[i_98_] = new int[i_99_];
				for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
					int i_102_ = (anIntArrayArray5100[i_98_][i_101_] = i_77_ += class523_sub34.readUnsignedShort(-2036110944));
					if (i_102_ > i_100_)
						i_100_ = i_102_;
				}
				anIntArray5106[i_98_] = 1 + i_100_;
				if (1 + i_100_ == i_99_)
					anIntArrayArray5100[i_98_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5113 = new int[1 + i_78_][];
			aClass283Array5115 = new Class283[i_78_ + 1];
			for (int i_103_ = 0; i_103_ < 672162761 * anInt5101; i_103_++) {
				int i_104_ = anIntArray5109[i_103_];
				int i_105_ = anIntArray5112[i_104_];
				anIntArrayArray5113[i_104_] = new int[anIntArray5106[i_104_]];
				for (int i_106_ = 0; i_106_ < anIntArray5106[i_104_]; i_106_++)
					anIntArrayArray5113[i_104_][i_106_] = -1;
				for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
					int i_108_;
					if (anIntArrayArray5100[i_104_] != null)
						i_108_ = anIntArrayArray5100[i_104_][i_107_];
					else
						i_108_ = i_107_;
					anIntArrayArray5113[i_104_][i_108_] = class523_sub34.readUnsignedInt((byte) -101);
				}
				aClass283Array5115[i_104_] = new Class283(anIntArrayArray5113[i_104_]);
			}
		}
	}

	void method7500(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(Class558.method9233(is, -1627548967));
		int i = class523_sub34.readUnsignedByte(258860486);
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5114 = class523_sub34.readUnsignedInt((byte) -34) * 162910219;
		else
			anInt5114 = 0;
		int i_109_ = class523_sub34.readUnsignedByte(1382302502);
		boolean bool = (i_109_ & 0x1) != 0;
		boolean bool_110_ = 0 != (i_109_ & 0x2);
		boolean bool_111_ = 0 != (i_109_ & 0x4);
		boolean bool_112_ = 0 != (i_109_ & 0x8);
		if (i >= 7)
			anInt5101 = class523_sub34.method16303(2087814010) * 342435449;
		else
			anInt5101 = class523_sub34.readUnsignedShort(-753751372) * 342435449;
		int i_113_ = 0;
		int i_114_ = -1;
		anIntArray5109 = new int[anInt5101 * 672162761];
		if (i >= 7) {
			for (int i_115_ = 0; i_115_ < 672162761 * anInt5101; i_115_++) {
				anIntArray5109[i_115_] = i_113_ += class523_sub34.method16303(2115473069);
				if (anIntArray5109[i_115_] > i_114_)
					i_114_ = anIntArray5109[i_115_];
			}
		} else {
			for (int i_116_ = 0; i_116_ < anInt5101 * 672162761; i_116_++) {
				anIntArray5109[i_116_] = i_113_ += class523_sub34.readUnsignedShort(-1392327408);
				if (anIntArray5109[i_116_] > i_114_)
					i_114_ = anIntArray5109[i_116_];
			}
		}
		anInt5105 = 2014493443 * (i_114_ + 1);
		anIntArray5102 = new int[anInt5105 * -132118613];
		if (bool_112_)
			anIntArray5107 = new int[anInt5105 * -132118613];
		if (bool_110_)
			aByteArrayArray5108 = new byte[anInt5105 * -132118613][];
		anIntArray5097 = new int[anInt5105 * -132118613];
		anIntArray5112 = new int[anInt5105 * -132118613];
		anIntArrayArray5100 = new int[anInt5105 * -132118613][];
		anIntArray5106 = new int[anInt5105 * -132118613];
		if (bool) {
			anIntArray5103 = new int[-132118613 * anInt5105];
			for (int i_117_ = 0; i_117_ < anInt5105 * -132118613; i_117_++)
				anIntArray5103[i_117_] = -1;
			for (int i_118_ = 0; i_118_ < 672162761 * anInt5101; i_118_++)
				anIntArray5103[anIntArray5109[i_118_]] = class523_sub34.readUnsignedInt((byte) -89);
			aClass283_5104 = new Class283(anIntArray5103);
		}
		for (int i_119_ = 0; i_119_ < 672162761 * anInt5101; i_119_++)
			anIntArray5102[anIntArray5109[i_119_]] = class523_sub34.readUnsignedInt((byte) -101);
		if (bool_112_) {
			for (int i_120_ = 0; i_120_ < anInt5101 * 672162761; i_120_++)
				anIntArray5107[i_120_] = class523_sub34.readUnsignedInt((byte) -48);
		}
		if (bool_110_) {
			for (int i_121_ = 0; i_121_ < 672162761 * anInt5101; i_121_++) {
				byte[] is_122_ = new byte[64];
				class523_sub34.method16298(is_122_, 0, 64, (byte) 24);
				aByteArrayArray5108[anIntArray5109[i_121_]] = is_122_;
			}
		}
		if (bool_111_) {
			anIntArray5110 = new int[anInt5105 * -132118613];
			anIntArray5111 = new int[anInt5105 * -132118613];
			for (int i_123_ = 0; i_123_ < 672162761 * anInt5101; i_123_++) {
				anIntArray5110[anIntArray5109[i_123_]] = class523_sub34.readUnsignedInt((byte) -88);
				anIntArray5111[anIntArray5109[i_123_]] = class523_sub34.readUnsignedInt((byte) -60);
			}
		}
		for (int i_124_ = 0; i_124_ < 672162761 * anInt5101; i_124_++)
			anIntArray5097[anIntArray5109[i_124_]] = class523_sub34.readUnsignedInt((byte) -93);
		if (i >= 7) {
			for (int i_125_ = 0; i_125_ < anInt5101 * 672162761; i_125_++)
				anIntArray5112[anIntArray5109[i_125_]] = class523_sub34.method16303(2038395614);
			for (int i_126_ = 0; i_126_ < 672162761 * anInt5101; i_126_++) {
				int i_127_ = anIntArray5109[i_126_];
				int i_128_ = anIntArray5112[i_127_];
				i_113_ = 0;
				int i_129_ = -1;
				anIntArrayArray5100[i_127_] = new int[i_128_];
				for (int i_130_ = 0; i_130_ < i_128_; i_130_++) {
					int i_131_ = (anIntArrayArray5100[i_127_][i_130_] = i_113_ += class523_sub34.method16303(2131350773));
					if (i_131_ > i_129_)
						i_129_ = i_131_;
				}
				anIntArray5106[i_127_] = 1 + i_129_;
				if (1 + i_129_ == i_128_)
					anIntArrayArray5100[i_127_] = null;
			}
		} else {
			for (int i_132_ = 0; i_132_ < 672162761 * anInt5101; i_132_++)
				anIntArray5112[anIntArray5109[i_132_]] = class523_sub34.readUnsignedShort(-600276304);
			for (int i_133_ = 0; i_133_ < 672162761 * anInt5101; i_133_++) {
				int i_134_ = anIntArray5109[i_133_];
				int i_135_ = anIntArray5112[i_134_];
				i_113_ = 0;
				int i_136_ = -1;
				anIntArrayArray5100[i_134_] = new int[i_135_];
				for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
					int i_138_ = (anIntArrayArray5100[i_134_][i_137_] = i_113_ += class523_sub34.readUnsignedShort(-1948899470));
					if (i_138_ > i_136_)
						i_136_ = i_138_;
				}
				anIntArray5106[i_134_] = 1 + i_136_;
				if (1 + i_136_ == i_135_)
					anIntArrayArray5100[i_134_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5113 = new int[1 + i_114_][];
			aClass283Array5115 = new Class283[i_114_ + 1];
			for (int i_139_ = 0; i_139_ < 672162761 * anInt5101; i_139_++) {
				int i_140_ = anIntArray5109[i_139_];
				int i_141_ = anIntArray5112[i_140_];
				anIntArrayArray5113[i_140_] = new int[anIntArray5106[i_140_]];
				for (int i_142_ = 0; i_142_ < anIntArray5106[i_140_]; i_142_++)
					anIntArrayArray5113[i_140_][i_142_] = -1;
				for (int i_143_ = 0; i_143_ < i_141_; i_143_++) {
					int i_144_;
					if (anIntArrayArray5100[i_140_] != null)
						i_144_ = anIntArrayArray5100[i_140_][i_143_];
					else
						i_144_ = i_143_;
					anIntArrayArray5113[i_140_][i_144_] = class523_sub34.readUnsignedInt((byte) -79);
				}
				aClass283Array5115[i_140_] = new Class283(anIntArrayArray5113[i_140_]);
			}
		}
	}

	Class460(byte[] is, int i, byte[] is_145_) {
		anInt5098 = Class590.method9774(is, is.length, -560533886) * 266609013;
		if (-905910563 * anInt5098 != i)
			throw new RuntimeException();
		if (is_145_ != null) {
			if (is_145_.length != 64)
				throw new RuntimeException();
			aByteArray5099 = Class202.method3698(is, 0, is.length, -1413428846);
			for (int i_146_ = 0; i_146_ < 64; i_146_++) {
				if (aByteArray5099[i_146_] != is_145_[i_146_])
					throw new RuntimeException();
			}
		}
		method7498(is, (byte) -48);
	}

	static final void method7501(Class669 class669, byte i) {
		int i_147_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_147_, -859298043);
		Class242 class242 = Class31.aClass242Array302[i_147_ >> 16];
		Class170.method2892(class250, class242, class669, PacketsDecoder.aClass233_2368, (byte) 0);
	}

	static void method7502(int i, int i_148_, Class250 class250, byte i_149_) {
		int i_150_ = i + 365308179 * class250.anInt2581;
		int i_151_ = i_148_ + 15;
		if (client.aBool11096) {
			int i_152_ = -256;
			if (client.anInt5662 * -1307622225 < 20)
				i_152_ = -65536;
			Class10.aClass164_83.method2596(new StringBuilder().append("Fps:").append(client.anInt5662 * -1307622225).append(" (").append(760293275 * client.anInt5663).append(" ms)").toString(), i_150_, i_151_, i_152_, -1, -492514935);
			i_151_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long l = runtime.totalMemory() / 1024L;
			long l_153_ = l - runtime.freeMemory() / 1024L;
			int i_154_ = -256;
			if (l_153_ > 262144L)
				i_154_ = -65536;
			Class10.aClass164_83.method2596(new StringBuilder().append("Mem:").append(l_153_).append("/").append(l).append("k").toString(), i_150_, i_151_, i_154_, -1, -1671045031);
			i_151_ += 15;
			long l_155_ = client.aClass116_11058.aClass49_1433.method1263((short) 24024);
			String string = "N/A";
			if (-1L != l_155_) {
				string = new StringBuilder().append(l_155_).append("ms").toString();
				if (l_155_ > 500L)
					string = new StringBuilder().append(Class495.method8101(16711680, -121498471)).append(string).append(Class495.method8101(16776960, 1672214228)).toString();
			}
			Class10.aClass164_83.method2596(new StringBuilder().append("Game: In:").append(client.aClass116_11058.anInt1416 * 1499432703).append("B/s ").append("Out:").append(-297675755 * client.aClass116_11058.anInt1427).append("B/s ").append("Ping:").append(string).toString(), i_150_, i_151_, -256, -1, -1893103424);
			i_151_ += 15;
			long l_156_ = client.aClass116_11057.aClass49_1433.method1263((short) 17055);
			String string_157_ = "N/A";
			if (l_156_ != -1L) {
				string_157_ = new StringBuilder().append(l_156_).append("ms").toString();
				if (l_156_ > 500L)
					string_157_ = new StringBuilder().append(Class495.method8101(16711680, -1702055294)).append(string_157_).append(Class495.method8101(16776960, 2018833189)).toString();
			}
			Class10.aClass164_83.method2596(new StringBuilder().append("Lobby: In:").append(client.aClass116_11057.anInt1416 * 1499432703).append("B/s ").append("Out:").append(-297675755 * client.aClass116_11057.anInt1427).append("B/s ").append("Ping:").append(string_157_).toString(), i_150_, i_151_, -256, -1, 1962247312);
			i_151_ += 15;
			int i_158_ = Class31.aClass178_303.method3025() / 1024;
			Class10.aClass164_83.method2596(new StringBuilder().append("Offheap:").append(i_158_).append("k").toString(), i_150_, i_151_, i_158_ > 65536 ? -65536 : -256, -1, 1377717099);
			i_151_ += 15;
			int i_159_ = 0;
			int i_160_ = 0;
			int i_161_ = 0;
			for (int i_162_ = 0; i_162_ < GraphicsDefinitions.aClass467_Sub1Array8605.length; i_162_++) {
				if (GraphicsDefinitions.aClass467_Sub1Array8605[i_162_] != null && GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15739(406530231)) {
					i_159_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15748(142613961);
					i_160_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15736((byte) 0);
					i_161_ += GraphicsDefinitions.aClass467_Sub1Array8605[i_162_].method15737(2120685459);
				}
			}
			int i_163_ = i_159_ == 0 ? 0 : i_161_ * 100 / i_159_;
			int i_164_ = i_159_ == 0 ? 0 : i_160_ * 10000 / i_159_;
			String string_165_ = new StringBuilder().append("Cache:").append(Class648.method10612((long) i_164_, 2, true, Class668.aClass668_8548, -1952865983)).append("% (").append(i_163_).append("%)").toString();
			Class34.aClass164_318.method2596(string_165_, i_150_, i_151_, -256, -1, -1739624929);
			i_151_ += 12;
		}
	}

	static Class636[] method7503(byte i) {
		return (new Class636[] { Class636.aClass636_8286, Class636.aClass636_8282, Class636.aClass636_8291, Class636.aClass636_8285, Class636.aClass636_8295, Class636.aClass636_8283, Class636.aClass636_8298, Class636.aClass636_8289, Class636.aClass636_8293, Class636.aClass636_8290, Class636.aClass636_8294, Class636.aClass636_8288, Class636.aClass636_8287, Class636.aClass636_8284 });
	}

	static final void method7504(Class669 class669, int i) {
		int i_166_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Integer.toString(i_166_);
	}
}
