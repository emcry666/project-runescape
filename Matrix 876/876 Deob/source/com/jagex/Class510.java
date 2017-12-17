/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class510 {
	static final int anInt5727 = 24;
	static final int anInt5728 = 0;
	static final int anInt5729 = 1;
	static final int anInt5730 = 2;
	int anInt5731;
	int anInt5732;
	int anInt5733;
	int anInt5734;
	static Class148 aClass148_5735;
	static final int anInt5736 = 13;
	boolean aBool5737;
	int anInt5738;
	int anInt5739;
	int anInt5740;
	int anInt5741;
	static final int anInt5742 = 512;
	int anInt5743;
	Class148 aClass148_5744;
	int anInt5745;
	int anInt5746;
	int anInt5747;
	static final int anInt5748 = 24;
	int anInt5749;
	static final int anInt5750 = 192;
	static final int anInt5751 = 128;
	static Class167 aClass167_5752;
	static final int anInt5753 = 16;
	int anInt5754;
	int anInt5755;
	static Class148 aClass148_5756;
	static int[] anIntArray5757 = new int[4];

	boolean method8512(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_;
		int i_4_;
		int i_5_;
		if (!aBool5737) {
			i_3_ = anInt5733 - i;
			i_4_ = anInt5734 - i_0_;
			i_5_ = anInt5749 - i_1_;
			anInt5754 = (int) Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_ + i_5_ * i_5_));
			if (anInt5754 == 0)
				anInt5754 = 1;
			i_3_ = (i_3_ << 8) / anInt5754;
			i_4_ = (i_4_ << 8) / anInt5754;
			i_5_ = (i_5_ << 8) / anInt5754;
		} else {
			anInt5754 = 1073741823;
			i_3_ = anInt5733;
			i_4_ = anInt5734;
			i_5_ = anInt5749;
		}
		int i_6_ = (int) (Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_ + i_5_ * i_5_)) * 256.0);
		if (i_6_ > 128) {
			i_3_ = (i_3_ << 16) / i_6_;
			i_4_ = (i_4_ << 16) / i_6_;
			i_5_ = (i_5_ << 16) / i_6_;
			anInt5743 = anInt5755 * i_2_ / (aBool5737 ? 1024 : anInt5754);
		} else
			anInt5743 = 0;
		if (anInt5743 < 8) {
			aClass148_5744 = null;
			return false;
		}
		int i_7_ = Class628.method10313(anInt5743, -273223777);
		if (i_7_ > i_2_)
			i_7_ = Class375.method6383(i_2_, 189765723);
		if (i_7_ > 512)
			i_7_ = 512;
		if (i_7_ != anInt5745)
			anInt5745 = i_7_;
		anInt5739 = (int) (Math.asin((double) ((float) i_4_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt5740 = (int) (Math.atan2((double) i_3_, (double) -i_5_) * 2607.5945876176133) & 0x3fff;
		aClass148_5744 = null;
		return true;
	}

	static void method8513() {
		aClass167_5752 = null;
		aClass148_5756 = null;
	}

	boolean method8514(int i, int i_8_, int i_9_, int i_10_) {
		int i_11_;
		int i_12_;
		int i_13_;
		if (!aBool5737) {
			i_11_ = anInt5733 - i;
			i_12_ = anInt5734 - i_8_;
			i_13_ = anInt5749 - i_9_;
			anInt5754 = (int) Math.sqrt((double) (i_11_ * i_11_ + i_12_ * i_12_ + i_13_ * i_13_));
			if (anInt5754 == 0)
				anInt5754 = 1;
			i_11_ = (i_11_ << 8) / anInt5754;
			i_12_ = (i_12_ << 8) / anInt5754;
			i_13_ = (i_13_ << 8) / anInt5754;
		} else {
			anInt5754 = 1073741823;
			i_11_ = anInt5733;
			i_12_ = anInt5734;
			i_13_ = anInt5749;
		}
		int i_14_ = (int) (Math.sqrt((double) (i_11_ * i_11_ + i_12_ * i_12_ + i_13_ * i_13_)) * 256.0);
		if (i_14_ > 128) {
			i_11_ = (i_11_ << 16) / i_14_;
			i_12_ = (i_12_ << 16) / i_14_;
			i_13_ = (i_13_ << 16) / i_14_;
			anInt5743 = anInt5755 * i_10_ / (aBool5737 ? 1024 : anInt5754);
		} else
			anInt5743 = 0;
		if (anInt5743 < 8) {
			aClass148_5744 = null;
			return false;
		}
		int i_15_ = Class628.method10313(anInt5743, 2084921762);
		if (i_15_ > i_10_)
			i_15_ = Class375.method6383(i_10_, 189765723);
		if (i_15_ > 512)
			i_15_ = 512;
		if (i_15_ != anInt5745)
			anInt5745 = i_15_;
		anInt5739 = (int) (Math.asin((double) ((float) i_12_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt5740 = (int) (Math.atan2((double) i_11_, (double) -i_13_) * 2607.5945876176133) & 0x3fff;
		aClass148_5744 = null;
		return true;
	}

	boolean method8515(Class178 class178, Class510 class510_16_) {
		return aClass148_5744 != null || method8532(class178, class510_16_);
	}

	static void method8516() {
		aClass167_5752 = null;
		aClass148_5756 = null;
	}

	void method8517(Class178 class178, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		if (aClass148_5744 != null) {
			float[] fs = new float[3];
			float f = (float) -(anInt5733 - i_22_ << 16);
			float f_26_ = (float) (anInt5734 - i_23_ << 15);
			float f_27_ = (float) -(anInt5749 - i_24_ << 16);
			float[] fs_28_ = new float[3];
			class178.method3122().method6826(fs_28_);
			f += fs_28_[0];
			f_26_ += fs_28_[1];
			f_27_ += fs_28_[2];
			class178.method3153(f, f_26_, f_27_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_29_ = (int) (fs[0] - (float) (anInt5743 / 2));
				int i_30_ = (int) (fs[1] - (float) (anInt5743 / 2));
				if (i_30_ < i_19_ && i_30_ + anInt5743 > 0 && i_29_ < i_18_ && i_29_ + anInt5743 > 0)
					aClass148_5744.method2439(i_29_, i_30_, anInt5743, anInt5743, 0, i_25_ << 24 | 0xffffff, 1);
			}
		}
	}

	void method8518(Class178 class178, Class510 class510_31_) {
		Class179 class179 = Class179.method3485(Class533.aClass472_7131, anInt5741, 0);
		if (class179 != null) {
			class178.method3075(anIntArray5757);
			class178.method3378(0, 0, anInt5745, anInt5745);
			class178.method3076(2, 0);
			class178.method3193(0, 0, anInt5745, anInt5745, 0, 0);
			int i = 0;
			int i_32_ = 0;
			int i_33_ = 256;
			if (class510_31_ != null) {
				if (class510_31_.aBool5737) {
					i = -class510_31_.anInt5733;
					i_32_ = -class510_31_.anInt5734;
					i_33_ = -class510_31_.anInt5749;
				} else {
					i = anInt5733 - class510_31_.anInt5733;
					i_32_ = anInt5734 - class510_31_.anInt5734;
					i_33_ = anInt5749 - class510_31_.anInt5749;
				}
			}
			if (anInt5739 != 0) {
				int i_34_ = -anInt5739 & 0x3fff;
				int i_35_ = Class433.anIntArray4880[i_34_];
				int i_36_ = Class433.anIntArray4881[i_34_];
				int i_37_ = i_32_ * i_36_ - i_33_ * i_35_ >> 14;
				i_33_ = i_32_ * i_35_ + i_33_ * i_36_ >> 14;
				i_32_ = i_37_;
			}
			if (anInt5740 != 0) {
				int i_38_ = -anInt5740 & 0x3fff;
				int i_39_ = Class433.anIntArray4880[i_38_];
				int i_40_ = Class433.anIntArray4881[i_38_];
				int i_41_ = i_33_ * i_39_ + i * i_40_ >> 14;
				i_33_ = i_33_ * i_40_ - i * i_39_ >> 14;
				i = i_41_;
			}
			class178.method3126(1.0F);
			class178.method3460(anInt5738, 1.0F, 1.0F, (float) i, (float) i_32_, (float) i_33_);
			class179.method3493(anInt5732 & 0x3fff, anInt5746 & 0x3fff, anInt5747 & 0x3fff);
			Class167 class167 = class178.method3115(class179, 2048, 0, 64, 768);
			int i_42_ = class167.method2713() - class167.method2712();
			int i_43_ = class167.method2847() - class167.method2804();
			int i_44_ = i_42_ > i_43_ ? i_42_ : i_43_;
			int i_45_ = 1024 * anInt5745 / i_44_;
			Class441 class441 = class178.method3125();
			Class441 class441_46_ = class178.method3112();
			class441_46_.method7143((float) (anInt5745 / 2), (float) (anInt5745 / 2), (float) i_45_, (float) i_45_, 50.0F, 50000.0F, (float) class178.method3039(1797971828).method2875(), (float) class178.method3039(1722783298).method2874(), 1024.0F);
			class178.method3124(class441_46_);
			Class435 class435 = new Class435();
			class178.method3300(class435);
			Class435 class435_47_ = class178.method3113();
			class435_47_.method6817(0.0F, 0.0F, (float) (50 - class167.method2716()));
			class167.method2708(class435_47_, null, 1);
			aClass148_5744 = class178.method3376(0, 0, anInt5745, anInt5745, true);
			aClass148_5744.method2434(0, 0, 3);
			class178.method3124(class441);
			class178.method3378(anIntArray5757[0], anIntArray5757[1], anIntArray5757[2], anIntArray5757[3]);
		}
	}

	void method8519(Class178 class178, Class510 class510_48_) {
		method8529(class178);
		method8521(class178);
		class178.method3075(anIntArray5757);
		class178.method3378(0, 0, anInt5745, anInt5745);
		class178.method3076(2, 0);
		class178.method3193(0, 0, anInt5745, anInt5745, ~0xffffff | anInt5738, 0);
		int i = 0;
		int i_49_ = 0;
		int i_50_ = 256;
		if (class510_48_ != null) {
			if (class510_48_.aBool5737) {
				i = -class510_48_.anInt5733;
				i_49_ = -class510_48_.anInt5734;
				i_50_ = -class510_48_.anInt5749;
			} else {
				i = class510_48_.anInt5733 - anInt5733;
				i_49_ = class510_48_.anInt5734 - anInt5734;
				i_50_ = class510_48_.anInt5749 - anInt5749;
			}
		}
		if (anInt5739 != 0) {
			int i_51_ = Class433.anIntArray4880[anInt5739];
			int i_52_ = Class433.anIntArray4881[anInt5739];
			int i_53_ = i_49_ * i_52_ - i_50_ * i_51_ >> 14;
			i_50_ = i_49_ * i_51_ + i_50_ * i_52_ >> 14;
			i_49_ = i_53_;
		}
		if (anInt5740 != 0) {
			int i_54_ = Class433.anIntArray4880[anInt5740];
			int i_55_ = Class433.anIntArray4881[anInt5740];
			int i_56_ = i_50_ * i_54_ + i * i_55_ >> 14;
			i_50_ = i_50_ * i_55_ - i * i_54_ >> 14;
			i = i_56_;
		}
		Class167 class167 = aClass167_5752.method2681((byte) 0, 51200, true);
		class167.method2826((short) 0, (short) anInt5741);
		class178.method3126(1.0F);
		class178.method3460(16777215, 1.0F, 1.0F, (float) i, (float) i_49_, (float) i_50_);
		int i_57_ = (1024 * anInt5745 / (class167.method2713() - class167.method2712()));
		if (anInt5738 != 0)
			i_57_ = i_57_ * 13 / 16;
		Class441 class441 = class178.method3125();
		Class441 class441_58_ = class178.method3112();
		class441_58_.method7143((float) (anInt5745 / 2), (float) (anInt5745 / 2), (float) i_57_, (float) i_57_, 50.0F, 50000.0F, (float) class178.method3039(1639264258).method2875(), (float) class178.method3039(1777930695).method2874(), 1024.0F);
		class178.method3124(class441_58_);
		class178.method3300(new Class435());
		Class435 class435 = new Class435();
		class435.method6817(0.0F, 0.0F, (float) (50 - class167.method2716()));
		class167.method2708(class435, null, 1);
		int i_59_ = anInt5745 * 13 / 16;
		int i_60_ = (anInt5745 - i_59_) / 2;
		aClass148_5735.method2439(i_60_, i_60_, i_59_, i_59_, 0, ~0xffffff | anInt5738, 1);
		aClass148_5744 = class178.method3376(0, 0, anInt5745, anInt5745, true);
		class178.method3076(2, 0);
		class178.method3193(0, 0, anInt5745, anInt5745, 0, 0);
		aClass148_5756.method2439(0, 0, anInt5745, anInt5745, 1, 0, 0);
		aClass148_5744.method2434(0, 0, 3);
		class178.method3124(class441);
		class178.method3378(anIntArray5757[0], anIntArray5757[1], anIntArray5757[2], anIntArray5757[3]);
	}

	static void method8520(Class178 class178) {
		if (aClass148_5756 == null) {
			int[] is = new int[16384];
			int[] is_61_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_62_ = 64 - i;
				i_62_ *= i_62_;
				int i_63_ = 128 - i - 1;
				int i_64_ = i * 128;
				int i_65_ = i_63_ * 128;
				for (int i_66_ = 0; i_66_ < 64; i_66_++) {
					int i_67_ = 64 - i_66_;
					i_67_ *= i_67_;
					int i_68_ = 128 - i_66_ - 1;
					int i_69_ = 256 - (i_67_ + i_62_ << 8) / 4096;
					i_69_ = i_69_ * 3072 / 1536;
					if (i_69_ < 0)
						i_69_ = 0;
					else if (i_69_ > 255)
						i_69_ = 255;
					int i_70_ = i_69_ / 2;
					is_61_[i_64_ + i_66_] = is_61_[i_64_ + i_68_] = is_61_[i_65_ + i_66_] = is_61_[i_65_ + i_68_] = ~0xffffff | i_69_ << 16;
					is[i_64_ + i_66_] = is[i_64_ + i_68_] = is[i_65_ + i_66_] = is[i_65_ + i_68_] = 127 - i_70_ << 24 | 0xffffff;
				}
			}
			aClass148_5756 = class178.method3103(is_61_, 0, 128, 128, 128, -1984802397);
			aClass148_5735 = class178.method3103(is, 0, 128, 128, 128, -2124529063);
		}
	}

	static void method8521(Class178 class178) {
		if (aClass148_5756 == null) {
			int[] is = new int[16384];
			int[] is_71_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_72_ = 64 - i;
				i_72_ *= i_72_;
				int i_73_ = 128 - i - 1;
				int i_74_ = i * 128;
				int i_75_ = i_73_ * 128;
				for (int i_76_ = 0; i_76_ < 64; i_76_++) {
					int i_77_ = 64 - i_76_;
					i_77_ *= i_77_;
					int i_78_ = 128 - i_76_ - 1;
					int i_79_ = 256 - (i_77_ + i_72_ << 8) / 4096;
					i_79_ = i_79_ * 3072 / 1536;
					if (i_79_ < 0)
						i_79_ = 0;
					else if (i_79_ > 255)
						i_79_ = 255;
					int i_80_ = i_79_ / 2;
					is_71_[i_74_ + i_76_] = is_71_[i_74_ + i_78_] = is_71_[i_75_ + i_76_] = is_71_[i_75_ + i_78_] = ~0xffffff | i_79_ << 16;
					is[i_74_ + i_76_] = is[i_74_ + i_78_] = is[i_75_ + i_76_] = is[i_75_ + i_78_] = 127 - i_80_ << 24 | 0xffffff;
				}
			}
			aClass148_5756 = class178.method3103(is_71_, 0, 128, 128, 128, -1991368329);
			aClass148_5735 = class178.method3103(is, 0, 128, 128, 128, -1799418283);
		}
	}

	void method8522(Class178 class178, Class510 class510_81_) {
		method8529(class178);
		method8521(class178);
		class178.method3075(anIntArray5757);
		class178.method3378(0, 0, anInt5745, anInt5745);
		class178.method3076(2, 0);
		class178.method3193(0, 0, anInt5745, anInt5745, ~0xffffff | anInt5738, 0);
		int i = 0;
		int i_82_ = 0;
		int i_83_ = 256;
		if (class510_81_ != null) {
			if (class510_81_.aBool5737) {
				i = -class510_81_.anInt5733;
				i_82_ = -class510_81_.anInt5734;
				i_83_ = -class510_81_.anInt5749;
			} else {
				i = class510_81_.anInt5733 - anInt5733;
				i_82_ = class510_81_.anInt5734 - anInt5734;
				i_83_ = class510_81_.anInt5749 - anInt5749;
			}
		}
		if (anInt5739 != 0) {
			int i_84_ = Class433.anIntArray4880[anInt5739];
			int i_85_ = Class433.anIntArray4881[anInt5739];
			int i_86_ = i_82_ * i_85_ - i_83_ * i_84_ >> 14;
			i_83_ = i_82_ * i_84_ + i_83_ * i_85_ >> 14;
			i_82_ = i_86_;
		}
		if (anInt5740 != 0) {
			int i_87_ = Class433.anIntArray4880[anInt5740];
			int i_88_ = Class433.anIntArray4881[anInt5740];
			int i_89_ = i_83_ * i_87_ + i * i_88_ >> 14;
			i_83_ = i_83_ * i_88_ - i * i_87_ >> 14;
			i = i_89_;
		}
		Class167 class167 = aClass167_5752.method2681((byte) 0, 51200, true);
		class167.method2826((short) 0, (short) anInt5741);
		class178.method3126(1.0F);
		class178.method3460(16777215, 1.0F, 1.0F, (float) i, (float) i_82_, (float) i_83_);
		int i_90_ = (1024 * anInt5745 / (class167.method2713() - class167.method2712()));
		if (anInt5738 != 0)
			i_90_ = i_90_ * 13 / 16;
		Class441 class441 = class178.method3125();
		Class441 class441_91_ = class178.method3112();
		class441_91_.method7143((float) (anInt5745 / 2), (float) (anInt5745 / 2), (float) i_90_, (float) i_90_, 50.0F, 50000.0F, (float) class178.method3039(2078873566).method2875(), (float) class178.method3039(1799305021).method2874(), 1024.0F);
		class178.method3124(class441_91_);
		class178.method3300(new Class435());
		Class435 class435 = new Class435();
		class435.method6817(0.0F, 0.0F, (float) (50 - class167.method2716()));
		class167.method2708(class435, null, 1);
		int i_92_ = anInt5745 * 13 / 16;
		int i_93_ = (anInt5745 - i_92_) / 2;
		aClass148_5735.method2439(i_93_, i_93_, i_92_, i_92_, 0, ~0xffffff | anInt5738, 1);
		aClass148_5744 = class178.method3376(0, 0, anInt5745, anInt5745, true);
		class178.method3076(2, 0);
		class178.method3193(0, 0, anInt5745, anInt5745, 0, 0);
		aClass148_5756.method2439(0, 0, anInt5745, anInt5745, 1, 0, 0);
		aClass148_5744.method2434(0, 0, 3);
		class178.method3124(class441);
		class178.method3378(anIntArray5757[0], anIntArray5757[1], anIntArray5757[2], anIntArray5757[3]);
	}

	static void method8523() {
		aClass167_5752 = null;
		aClass148_5756 = null;
	}

	static void method8524(Class178 class178) {
		if (aClass167_5752 == null) {
			Class179 class179 = new Class179(580, 1104, 1);
			class179.method3519((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class179.method3483(0, 128, 0);
			class179.method3483(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_94_ = i * 8192 / 24;
				int i_95_ = Class433.anIntArray4880[i_94_];
				int i_96_ = Class433.anIntArray4881[i_94_];
				for (int i_97_ = 1; i_97_ < 24; i_97_++) {
					int i_98_ = i_97_ * 8192 / 24;
					int i_99_ = Class433.anIntArray4881[i_98_] >> 7;
					int i_100_ = Class433.anIntArray4880[i_98_] * i_95_ >> 21;
					int i_101_ = Class433.anIntArray4880[i_98_] * i_96_ >> 21;
					class179.method3483(i_101_, i_99_, -i_100_);
				}
				if (i > 0) {
					int i_102_ = i * 23 + 2;
					int i_103_ = i_102_ - 23;
					class179.method3484(0, i_103_, i_102_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_104_ = 1; i_104_ < 23; i_104_++) {
						int i_105_ = i_103_ + 1;
						int i_106_ = i_102_ + 1;
						class179.method3484(i_103_, i_105_, i_102_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class179.method3484(i_105_, i_106_, i_102_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_103_ = i_105_;
						i_102_ = i_106_;
					}
					class179.method3484(i_102_, i_103_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class179.anInt1991 = class179.anInt1953;
			class179.anIntArray1993 = null;
			class179.anIntArray1956 = null;
			class179.aByteArray1972 = null;
			aClass167_5752 = class178.method3115(class179, 51200, 33, 64, 768);
		}
	}

	boolean method8525(Class178 class178, Class510 class510_107_) {
		return aClass148_5744 != null || method8532(class178, class510_107_);
	}

	void method8526(Class178 class178, int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		if (aClass148_5744 != null) {
			float[] fs = new float[3];
			float f = (float) -(anInt5733 - i_113_ << 16);
			float f_117_ = (float) (anInt5734 - i_114_ << 15);
			float f_118_ = (float) -(anInt5749 - i_115_ << 16);
			float[] fs_119_ = new float[3];
			class178.method3122().method6826(fs_119_);
			f += fs_119_[0];
			f_117_ += fs_119_[1];
			f_118_ += fs_119_[2];
			class178.method3153(f, f_117_, f_118_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_120_ = (int) (fs[0] - (float) (anInt5743 / 2));
				int i_121_ = (int) (fs[1] - (float) (anInt5743 / 2));
				if (i_121_ < i_110_ && i_121_ + anInt5743 > 0 && i_120_ < i_109_ && i_120_ + anInt5743 > 0)
					aClass148_5744.method2439(i_120_, i_121_, anInt5743, anInt5743, 0, i_116_ << 24 | 0xffffff, 1);
			}
		}
	}

	boolean method8527(Class178 class178, Class510 class510_122_) {
		if (aClass148_5744 == null) {
			if (anInt5731 == 0) {
				if (Class289.anInterface25_3118.method136(Class601.aClass601_7850, anInt5741, Class608.aClass608_7988, 0.7F, anInt5745, anInt5745, false, (short) -26404)) {
					int[] is = (Class289.anInterface25_3118.method138(Class601.aClass601_7850, anInt5741, 0.7F, anInt5745, anInt5745, false, 1393096661));
					aClass148_5744 = class178.method3103(is, 0, anInt5745, anInt5745, anInt5745, -2063649415);
				}
			} else if (anInt5731 == 2)
				method8518(class178, class510_122_);
			else if (anInt5731 == 1)
				method8519(class178, class510_122_);
		}
		return aClass148_5744 != null;
	}

	boolean method8528(Class178 class178, Class510 class510_123_) {
		if (aClass148_5744 == null) {
			if (anInt5731 == 0) {
				if (Class289.anInterface25_3118.method136(Class601.aClass601_7850, anInt5741, Class608.aClass608_7988, 0.7F, anInt5745, anInt5745, false, (short) -10379)) {
					int[] is = (Class289.anInterface25_3118.method138(Class601.aClass601_7850, anInt5741, 0.7F, anInt5745, anInt5745, false, 1741489833));
					aClass148_5744 = class178.method3103(is, 0, anInt5745, anInt5745, anInt5745, -1973154696);
				}
			} else if (anInt5731 == 2)
				method8518(class178, class510_123_);
			else if (anInt5731 == 1)
				method8519(class178, class510_123_);
		}
		return aClass148_5744 != null;
	}

	static void method8529(Class178 class178) {
		if (aClass167_5752 == null) {
			Class179 class179 = new Class179(580, 1104, 1);
			class179.method3519((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class179.method3483(0, 128, 0);
			class179.method3483(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_124_ = i * 8192 / 24;
				int i_125_ = Class433.anIntArray4880[i_124_];
				int i_126_ = Class433.anIntArray4881[i_124_];
				for (int i_127_ = 1; i_127_ < 24; i_127_++) {
					int i_128_ = i_127_ * 8192 / 24;
					int i_129_ = Class433.anIntArray4881[i_128_] >> 7;
					int i_130_ = Class433.anIntArray4880[i_128_] * i_125_ >> 21;
					int i_131_ = Class433.anIntArray4880[i_128_] * i_126_ >> 21;
					class179.method3483(i_131_, i_129_, -i_130_);
				}
				if (i > 0) {
					int i_132_ = i * 23 + 2;
					int i_133_ = i_132_ - 23;
					class179.method3484(0, i_133_, i_132_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_134_ = 1; i_134_ < 23; i_134_++) {
						int i_135_ = i_133_ + 1;
						int i_136_ = i_132_ + 1;
						class179.method3484(i_133_, i_135_, i_132_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class179.method3484(i_135_, i_136_, i_132_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_133_ = i_135_;
						i_132_ = i_136_;
					}
					class179.method3484(i_132_, i_133_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class179.anInt1991 = class179.anInt1953;
			class179.anIntArray1993 = null;
			class179.anIntArray1956 = null;
			class179.aByteArray1972 = null;
			aClass167_5752 = class178.method3115(class179, 51200, 33, 64, 768);
		}
	}

	void method8530(Class178 class178, Class510 class510_137_) {
		method8529(class178);
		method8521(class178);
		class178.method3075(anIntArray5757);
		class178.method3378(0, 0, anInt5745, anInt5745);
		class178.method3076(2, 0);
		class178.method3193(0, 0, anInt5745, anInt5745, ~0xffffff | anInt5738, 0);
		int i = 0;
		int i_138_ = 0;
		int i_139_ = 256;
		if (class510_137_ != null) {
			if (class510_137_.aBool5737) {
				i = -class510_137_.anInt5733;
				i_138_ = -class510_137_.anInt5734;
				i_139_ = -class510_137_.anInt5749;
			} else {
				i = class510_137_.anInt5733 - anInt5733;
				i_138_ = class510_137_.anInt5734 - anInt5734;
				i_139_ = class510_137_.anInt5749 - anInt5749;
			}
		}
		if (anInt5739 != 0) {
			int i_140_ = Class433.anIntArray4880[anInt5739];
			int i_141_ = Class433.anIntArray4881[anInt5739];
			int i_142_ = i_138_ * i_141_ - i_139_ * i_140_ >> 14;
			i_139_ = i_138_ * i_140_ + i_139_ * i_141_ >> 14;
			i_138_ = i_142_;
		}
		if (anInt5740 != 0) {
			int i_143_ = Class433.anIntArray4880[anInt5740];
			int i_144_ = Class433.anIntArray4881[anInt5740];
			int i_145_ = i_139_ * i_143_ + i * i_144_ >> 14;
			i_139_ = i_139_ * i_144_ - i * i_143_ >> 14;
			i = i_145_;
		}
		Class167 class167 = aClass167_5752.method2681((byte) 0, 51200, true);
		class167.method2826((short) 0, (short) anInt5741);
		class178.method3126(1.0F);
		class178.method3460(16777215, 1.0F, 1.0F, (float) i, (float) i_138_, (float) i_139_);
		int i_146_ = (1024 * anInt5745 / (class167.method2713() - class167.method2712()));
		if (anInt5738 != 0)
			i_146_ = i_146_ * 13 / 16;
		Class441 class441 = class178.method3125();
		Class441 class441_147_ = class178.method3112();
		class441_147_.method7143((float) (anInt5745 / 2), (float) (anInt5745 / 2), (float) i_146_, (float) i_146_, 50.0F, 50000.0F, (float) class178.method3039(1797640700).method2875(), (float) class178.method3039(1674658824).method2874(), 1024.0F);
		class178.method3124(class441_147_);
		class178.method3300(new Class435());
		Class435 class435 = new Class435();
		class435.method6817(0.0F, 0.0F, (float) (50 - class167.method2716()));
		class167.method2708(class435, null, 1);
		int i_148_ = anInt5745 * 13 / 16;
		int i_149_ = (anInt5745 - i_148_) / 2;
		aClass148_5735.method2439(i_149_, i_149_, i_148_, i_148_, 0, ~0xffffff | anInt5738, 1);
		aClass148_5744 = class178.method3376(0, 0, anInt5745, anInt5745, true);
		class178.method3076(2, 0);
		class178.method3193(0, 0, anInt5745, anInt5745, 0, 0);
		aClass148_5756.method2439(0, 0, anInt5745, anInt5745, 1, 0, 0);
		aClass148_5744.method2434(0, 0, 3);
		class178.method3124(class441);
		class178.method3378(anIntArray5757[0], anIntArray5757[1], anIntArray5757[2], anIntArray5757[3]);
	}

	public Class510(int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, boolean bool, int i_156_, int i_157_, int i_158_) {
		anInt5733 = i_151_;
		anInt5734 = i_152_;
		anInt5749 = i_153_;
		aBool5737 = bool;
		anInt5741 = i_150_;
		anInt5738 = i_155_;
		anInt5755 = i_154_;
		anInt5731 = i;
		anInt5732 = i_156_;
		anInt5746 = i_157_;
		anInt5747 = i_158_;
	}

	static void method8531(Class178 class178) {
		if (aClass167_5752 == null) {
			Class179 class179 = new Class179(580, 1104, 1);
			class179.method3519((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class179.method3483(0, 128, 0);
			class179.method3483(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_159_ = i * 8192 / 24;
				int i_160_ = Class433.anIntArray4880[i_159_];
				int i_161_ = Class433.anIntArray4881[i_159_];
				for (int i_162_ = 1; i_162_ < 24; i_162_++) {
					int i_163_ = i_162_ * 8192 / 24;
					int i_164_ = Class433.anIntArray4881[i_163_] >> 7;
					int i_165_ = Class433.anIntArray4880[i_163_] * i_160_ >> 21;
					int i_166_ = Class433.anIntArray4880[i_163_] * i_161_ >> 21;
					class179.method3483(i_166_, i_164_, -i_165_);
				}
				if (i > 0) {
					int i_167_ = i * 23 + 2;
					int i_168_ = i_167_ - 23;
					class179.method3484(0, i_168_, i_167_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_169_ = 1; i_169_ < 23; i_169_++) {
						int i_170_ = i_168_ + 1;
						int i_171_ = i_167_ + 1;
						class179.method3484(i_168_, i_170_, i_167_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class179.method3484(i_170_, i_171_, i_167_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_168_ = i_170_;
						i_167_ = i_171_;
					}
					class179.method3484(i_167_, i_168_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class179.anInt1991 = class179.anInt1953;
			class179.anIntArray1993 = null;
			class179.anIntArray1956 = null;
			class179.aByteArray1972 = null;
			aClass167_5752 = class178.method3115(class179, 51200, 33, 64, 768);
		}
	}

	boolean method8532(Class178 class178, Class510 class510_172_) {
		if (aClass148_5744 == null) {
			if (anInt5731 == 0) {
				if (Class289.anInterface25_3118.method136(Class601.aClass601_7850, anInt5741, Class608.aClass608_7988, 0.7F, anInt5745, anInt5745, false, (short) -22711)) {
					int[] is = (Class289.anInterface25_3118.method138(Class601.aClass601_7850, anInt5741, 0.7F, anInt5745, anInt5745, false, 1778287589));
					aClass148_5744 = class178.method3103(is, 0, anInt5745, anInt5745, anInt5745, -1755857867);
				}
			} else if (anInt5731 == 2)
				method8518(class178, class510_172_);
			else if (anInt5731 == 1)
				method8519(class178, class510_172_);
		}
		return aClass148_5744 != null;
	}

	void method8533(Class178 class178, Class510 class510_173_) {
		Class179 class179 = Class179.method3485(Class533.aClass472_7131, anInt5741, 0);
		if (class179 != null) {
			class178.method3075(anIntArray5757);
			class178.method3378(0, 0, anInt5745, anInt5745);
			class178.method3076(2, 0);
			class178.method3193(0, 0, anInt5745, anInt5745, 0, 0);
			int i = 0;
			int i_174_ = 0;
			int i_175_ = 256;
			if (class510_173_ != null) {
				if (class510_173_.aBool5737) {
					i = -class510_173_.anInt5733;
					i_174_ = -class510_173_.anInt5734;
					i_175_ = -class510_173_.anInt5749;
				} else {
					i = anInt5733 - class510_173_.anInt5733;
					i_174_ = anInt5734 - class510_173_.anInt5734;
					i_175_ = anInt5749 - class510_173_.anInt5749;
				}
			}
			if (anInt5739 != 0) {
				int i_176_ = -anInt5739 & 0x3fff;
				int i_177_ = Class433.anIntArray4880[i_176_];
				int i_178_ = Class433.anIntArray4881[i_176_];
				int i_179_ = i_174_ * i_178_ - i_175_ * i_177_ >> 14;
				i_175_ = i_174_ * i_177_ + i_175_ * i_178_ >> 14;
				i_174_ = i_179_;
			}
			if (anInt5740 != 0) {
				int i_180_ = -anInt5740 & 0x3fff;
				int i_181_ = Class433.anIntArray4880[i_180_];
				int i_182_ = Class433.anIntArray4881[i_180_];
				int i_183_ = i_175_ * i_181_ + i * i_182_ >> 14;
				i_175_ = i_175_ * i_182_ - i * i_181_ >> 14;
				i = i_183_;
			}
			class178.method3126(1.0F);
			class178.method3460(anInt5738, 1.0F, 1.0F, (float) i, (float) i_174_, (float) i_175_);
			class179.method3493(anInt5732 & 0x3fff, anInt5746 & 0x3fff, anInt5747 & 0x3fff);
			Class167 class167 = class178.method3115(class179, 2048, 0, 64, 768);
			int i_184_ = class167.method2713() - class167.method2712();
			int i_185_ = class167.method2847() - class167.method2804();
			int i_186_ = i_184_ > i_185_ ? i_184_ : i_185_;
			int i_187_ = 1024 * anInt5745 / i_186_;
			Class441 class441 = class178.method3125();
			Class441 class441_188_ = class178.method3112();
			class441_188_.method7143((float) (anInt5745 / 2), (float) (anInt5745 / 2), (float) i_187_, (float) i_187_, 50.0F, 50000.0F, (float) class178.method3039(2009554990).method2875(), (float) class178.method3039(1613065567).method2874(), 1024.0F);
			class178.method3124(class441_188_);
			Class435 class435 = new Class435();
			class178.method3300(class435);
			Class435 class435_189_ = class178.method3113();
			class435_189_.method6817(0.0F, 0.0F, (float) (50 - class167.method2716()));
			class167.method2708(class435_189_, null, 1);
			aClass148_5744 = class178.method3376(0, 0, anInt5745, anInt5745, true);
			aClass148_5744.method2434(0, 0, 3);
			class178.method3124(class441);
			class178.method3378(anIntArray5757[0], anIntArray5757[1], anIntArray5757[2], anIntArray5757[3]);
		}
	}

	static void method8534(Class178 class178) {
		if (aClass148_5756 == null) {
			int[] is = new int[16384];
			int[] is_190_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_191_ = 64 - i;
				i_191_ *= i_191_;
				int i_192_ = 128 - i - 1;
				int i_193_ = i * 128;
				int i_194_ = i_192_ * 128;
				for (int i_195_ = 0; i_195_ < 64; i_195_++) {
					int i_196_ = 64 - i_195_;
					i_196_ *= i_196_;
					int i_197_ = 128 - i_195_ - 1;
					int i_198_ = 256 - (i_196_ + i_191_ << 8) / 4096;
					i_198_ = i_198_ * 3072 / 1536;
					if (i_198_ < 0)
						i_198_ = 0;
					else if (i_198_ > 255)
						i_198_ = 255;
					int i_199_ = i_198_ / 2;
					is_190_[i_193_ + i_195_] = is_190_[i_193_ + i_197_] = is_190_[i_194_ + i_195_] = is_190_[i_194_ + i_197_] = ~0xffffff | i_198_ << 16;
					is[i_193_ + i_195_] = is[i_193_ + i_197_] = is[i_194_ + i_195_] = is[i_194_ + i_197_] = 127 - i_199_ << 24 | 0xffffff;
				}
			}
			aClass148_5756 = class178.method3103(is_190_, 0, 128, 128, 128, -1935255417);
			aClass148_5735 = class178.method3103(is, 0, 128, 128, 128, -1738148923);
		}
	}

	static void method8535(Class178 class178) {
		if (aClass148_5756 == null) {
			int[] is = new int[16384];
			int[] is_200_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_201_ = 64 - i;
				i_201_ *= i_201_;
				int i_202_ = 128 - i - 1;
				int i_203_ = i * 128;
				int i_204_ = i_202_ * 128;
				for (int i_205_ = 0; i_205_ < 64; i_205_++) {
					int i_206_ = 64 - i_205_;
					i_206_ *= i_206_;
					int i_207_ = 128 - i_205_ - 1;
					int i_208_ = 256 - (i_206_ + i_201_ << 8) / 4096;
					i_208_ = i_208_ * 3072 / 1536;
					if (i_208_ < 0)
						i_208_ = 0;
					else if (i_208_ > 255)
						i_208_ = 255;
					int i_209_ = i_208_ / 2;
					is_200_[i_203_ + i_205_] = is_200_[i_203_ + i_207_] = is_200_[i_204_ + i_205_] = is_200_[i_204_ + i_207_] = ~0xffffff | i_208_ << 16;
					is[i_203_ + i_205_] = is[i_203_ + i_207_] = is[i_204_ + i_205_] = is[i_204_ + i_207_] = 127 - i_209_ << 24 | 0xffffff;
				}
			}
			aClass148_5756 = class178.method3103(is_200_, 0, 128, 128, 128, -1813148546);
			aClass148_5735 = class178.method3103(is, 0, 128, 128, 128, -1767460459);
		}
	}
}
