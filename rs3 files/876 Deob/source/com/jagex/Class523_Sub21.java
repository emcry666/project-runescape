/* Class523_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub21 extends Class523 {
	Class523_Sub34_Sub1 aClass523_Sub34_Sub1_10503;
	Class142_Sub2 aClass142_Sub2_10504;
	Class523_Sub20 aClass523_Sub20_10505;
	int anInt10506;
	int anInt10507;
	int anInt10508;
	int anInt10509;
	int anInt10510;
	Interface18 anInterface18_10511;
	Class178_Sub1 aClass178_Sub1_10512;
	Class131 aClass131_10513;
	Class131 aClass131_10514;
	int anInt10515;
	float[][] aFloatArrayArray10516;
	float[][] aFloatArrayArray10517;
	float[][] aFloatArrayArray10518;
	RSBuffer aClass523_Sub34_10519;
	Class14 aClass14_10520;
	Interface15 anInterface15_10521;

	void method16099(short i) {
		if (aClass178_Sub1_10512.aBool9393)
			aClass523_Sub34_10519.writeShort(i, (byte) -92);
		else
			aClass523_Sub34_10519.method16262(i, -1612267020);
	}

	void method16100(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << aClass142_Sub2_10504.anInt1680 * -1193058675);
		int i_6_ = i_4_ + (i_2_ << aClass142_Sub2_10504.anInt1680 * -1193058675);
		int i_7_ = aClass142_Sub2_10504.method2326(i_5_, i_6_, 1265323680);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class523_Sub6 class523_sub6 = (Class523_Sub6) aClass14_10520.getFromIndex(l);
			if (class523_sub6 != null) {
				method16099(class523_sub6.aShort10403);
				return;
			}
		}
		short i_8_ = (short) anInt10510++;
		if (l != -1L)
			aClass14_10520.method738(new Class523_Sub6(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = aFloatArrayArray10516[i][i_0_];
			f_9_ = aFloatArrayArray10517[i][i_0_];
			f_10_ = aFloatArrayArray10518[i][i_0_];
		} else if (i_3_ == aClass142_Sub2_10504.anInt1682 * 341909049 && i_4_ == 0) {
			f = aFloatArrayArray10516[i + 1][i_0_];
			f_9_ = aFloatArrayArray10517[i + 1][i_0_];
			f_10_ = aFloatArrayArray10518[i + 1][i_0_];
		} else if (i_3_ == aClass142_Sub2_10504.anInt1682 * 341909049 && i_4_ == aClass142_Sub2_10504.anInt1682 * 341909049) {
			f = aFloatArrayArray10516[i + 1][i_0_ + 1];
			f_9_ = aFloatArrayArray10517[i + 1][i_0_ + 1];
			f_10_ = aFloatArrayArray10518[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == aClass142_Sub2_10504.anInt1682 * 341909049) {
			f = aFloatArrayArray10516[i][i_0_ + 1];
			f_9_ = aFloatArrayArray10517[i][i_0_ + 1];
			f_10_ = aFloatArrayArray10518[i][i_0_ + 1];
		} else {
			float f_11_ = ((float) i_3_ / (float) (aClass142_Sub2_10504.anInt1682 * 341909049));
			float f_12_ = ((float) i_4_ / (float) (aClass142_Sub2_10504.anInt1682 * 341909049));
			float f_13_ = aFloatArrayArray10516[i][i_0_];
			float f_14_ = aFloatArrayArray10517[i][i_0_];
			float f_15_ = aFloatArrayArray10518[i][i_0_];
			float f_16_ = aFloatArrayArray10516[i + 1][i_0_];
			float f_17_ = aFloatArrayArray10517[i + 1][i_0_];
			float f_18_ = aFloatArrayArray10518[i + 1][i_0_];
			f_13_ += (aFloatArrayArray10516[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (aFloatArrayArray10517[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (aFloatArrayArray10518[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += (aFloatArrayArray10516[i + 1][i_0_ + 1] - f_16_) * f_11_;
			f_17_ += (aFloatArrayArray10517[i + 1][i_0_ + 1] - f_17_) * f_11_;
			f_18_ += (aFloatArrayArray10518[i + 1][i_0_ + 1] - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (aClass523_Sub20_10505.method16062(2131811589) - i_5_);
		float f_20_ = (float) (aClass523_Sub20_10505.method16091(174648313) - i_7_);
		float f_21_ = (float) (aClass523_Sub20_10505.method16065(1874061550) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) aClass523_Sub20_10505.method16066(-1879460461);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = aClass523_Sub20_10505.method16067(856453637);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		if (aClass178_Sub1_10512.aBool9393) {
			aClass523_Sub34_Sub1_10503.method18112((float) i_5_);
			aClass523_Sub34_Sub1_10503.method18112((float) i_7_);
			aClass523_Sub34_Sub1_10503.method18112((float) i_6_);
		} else {
			aClass523_Sub34_Sub1_10503.method18110((float) i_5_);
			aClass523_Sub34_Sub1_10503.method18110((float) i_7_);
			aClass523_Sub34_Sub1_10503.method18110((float) i_6_);
		}
		aClass523_Sub34_Sub1_10503.writeByte(i_29_, 335554656);
		aClass523_Sub34_Sub1_10503.writeByte(i_30_, -227616088);
		aClass523_Sub34_Sub1_10503.writeByte(i_31_, -9555);
		aClass523_Sub34_Sub1_10503.writeByte(255, 89358817);
		method16099(i_8_);
	}

	void method16101(short i) {
		if (aClass178_Sub1_10512.aBool9393)
			aClass523_Sub34_10519.writeShort(i, (byte) -114);
		else
			aClass523_Sub34_10519.method16262(i, -1526473802);
	}

	void method16102(int i, int i_32_, int i_33_, boolean[][] bools) {
		if (anInterface18_10511 != null && anInt10506 <= i + i_33_ && anInt10507 >= i - i_33_ && anInt10508 <= i_32_ + i_33_ && anInt10515 >= i_32_ - i_33_) {
			for (int i_34_ = anInt10508; i_34_ <= anInt10515; i_34_++) {
				for (int i_35_ = anInt10506; i_35_ <= anInt10507; i_35_++) {
					int i_36_ = i_35_ - i;
					int i_37_ = i_34_ - i_32_;
					if (i_36_ > -i_33_ && i_36_ < i_33_ && i_37_ > -i_33_ && i_37_ < i_33_ && bools[i_36_ + i_33_][i_37_ + i_33_]) {
						aClass178_Sub1_10512.method14679((int) (aClass523_Sub20_10505.method16068((byte) 0) * 255.0F) << 24);
						aClass178_Sub1_10512.method14664(aClass131_10514, null, aClass131_10513, null);
						aClass178_Sub1_10512.method14652(anInterface18_10511, 4, 0, anInt10509);
						return;
					}
				}
			}
		}
	}

	void method16103(int i, int i_38_, int i_39_, boolean[][] bools) {
		if (anInterface18_10511 != null && anInt10506 <= i + i_39_ && anInt10507 >= i - i_39_ && anInt10508 <= i_38_ + i_39_ && anInt10515 >= i_38_ - i_39_) {
			for (int i_40_ = anInt10508; i_40_ <= anInt10515; i_40_++) {
				for (int i_41_ = anInt10506; i_41_ <= anInt10507; i_41_++) {
					int i_42_ = i_41_ - i;
					int i_43_ = i_40_ - i_38_;
					if (i_42_ > -i_39_ && i_42_ < i_39_ && i_43_ > -i_39_ && i_43_ < i_39_ && bools[i_42_ + i_39_][i_43_ + i_39_]) {
						aClass178_Sub1_10512.method14679((int) (aClass523_Sub20_10505.method16068((byte) 0) * 255.0F) << 24);
						aClass178_Sub1_10512.method14664(aClass131_10514, null, aClass131_10513, null);
						aClass178_Sub1_10512.method14652(anInterface18_10511, 4, 0, anInt10509);
						return;
					}
				}
			}
		}
	}

	void method16104(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		long l = -1L;
		int i_49_ = i_47_ + (i_45_ << aClass142_Sub2_10504.anInt1680 * -1193058675);
		int i_50_ = i_48_ + (i_46_ << aClass142_Sub2_10504.anInt1680 * -1193058675);
		int i_51_ = aClass142_Sub2_10504.method2326(i_49_, i_50_, -960953977);
		if ((i_47_ & 0x7f) == 0 || (i_48_ & 0x7f) == 0) {
			l = ((long) i_50_ & 0xffffL) << 16 | (long) i_49_ & 0xffffL;
			Class523_Sub6 class523_sub6 = (Class523_Sub6) aClass14_10520.getFromIndex(l);
			if (class523_sub6 != null) {
				method16099(class523_sub6.aShort10403);
				return;
			}
		}
		short i_52_ = (short) anInt10510++;
		if (l != -1L)
			aClass14_10520.method738(new Class523_Sub6(i_52_), l);
		float f;
		float f_53_;
		float f_54_;
		if (i_47_ == 0 && i_48_ == 0) {
			f = aFloatArrayArray10516[i][i_44_];
			f_53_ = aFloatArrayArray10517[i][i_44_];
			f_54_ = aFloatArrayArray10518[i][i_44_];
		} else if (i_47_ == aClass142_Sub2_10504.anInt1682 * 341909049 && i_48_ == 0) {
			f = aFloatArrayArray10516[i + 1][i_44_];
			f_53_ = aFloatArrayArray10517[i + 1][i_44_];
			f_54_ = aFloatArrayArray10518[i + 1][i_44_];
		} else if (i_47_ == aClass142_Sub2_10504.anInt1682 * 341909049 && i_48_ == aClass142_Sub2_10504.anInt1682 * 341909049) {
			f = aFloatArrayArray10516[i + 1][i_44_ + 1];
			f_53_ = aFloatArrayArray10517[i + 1][i_44_ + 1];
			f_54_ = aFloatArrayArray10518[i + 1][i_44_ + 1];
		} else if (i_47_ == 0 && i_48_ == aClass142_Sub2_10504.anInt1682 * 341909049) {
			f = aFloatArrayArray10516[i][i_44_ + 1];
			f_53_ = aFloatArrayArray10517[i][i_44_ + 1];
			f_54_ = aFloatArrayArray10518[i][i_44_ + 1];
		} else {
			float f_55_ = ((float) i_47_ / (float) (aClass142_Sub2_10504.anInt1682 * 341909049));
			float f_56_ = ((float) i_48_ / (float) (aClass142_Sub2_10504.anInt1682 * 341909049));
			float f_57_ = aFloatArrayArray10516[i][i_44_];
			float f_58_ = aFloatArrayArray10517[i][i_44_];
			float f_59_ = aFloatArrayArray10518[i][i_44_];
			float f_60_ = aFloatArrayArray10516[i + 1][i_44_];
			float f_61_ = aFloatArrayArray10517[i + 1][i_44_];
			float f_62_ = aFloatArrayArray10518[i + 1][i_44_];
			f_57_ += (aFloatArrayArray10516[i][i_44_ + 1] - f_57_) * f_55_;
			f_58_ += (aFloatArrayArray10517[i][i_44_ + 1] - f_58_) * f_55_;
			f_59_ += (aFloatArrayArray10518[i][i_44_ + 1] - f_59_) * f_55_;
			f_60_ += (aFloatArrayArray10516[i + 1][i_44_ + 1] - f_60_) * f_55_;
			f_61_ += (aFloatArrayArray10517[i + 1][i_44_ + 1] - f_61_) * f_55_;
			f_62_ += (aFloatArrayArray10518[i + 1][i_44_ + 1] - f_62_) * f_55_;
			f = f_57_ + (f_60_ - f_57_) * f_56_;
			f_53_ = f_58_ + (f_61_ - f_58_) * f_56_;
			f_54_ = f_59_ + (f_62_ - f_59_) * f_56_;
		}
		float f_63_ = (float) (aClass523_Sub20_10505.method16062(2131811589) - i_49_);
		float f_64_ = (float) (aClass523_Sub20_10505.method16091(-1760332121) - i_51_);
		float f_65_ = (float) (aClass523_Sub20_10505.method16065(1690607592) - i_50_);
		float f_66_ = (float) Math.sqrt((double) (f_63_ * f_63_ + f_64_ * f_64_ + f_65_ * f_65_));
		float f_67_ = 1.0F / f_66_;
		f_63_ *= f_67_;
		f_64_ *= f_67_;
		f_65_ *= f_67_;
		float f_68_ = f_66_ / (float) aClass523_Sub20_10505.method16066(-1879460461);
		float f_69_ = 1.0F - f_68_ * f_68_;
		if (f_69_ < 0.0F)
			f_69_ = 0.0F;
		float f_70_ = f_63_ * f + f_64_ * f_53_ + f_65_ * f_54_;
		if (f_70_ < 0.0F)
			f_70_ = 0.0F;
		float f_71_ = f_70_ * f_69_ * 2.0F;
		if (f_71_ > 1.0F)
			f_71_ = 1.0F;
		int i_72_ = aClass523_Sub20_10505.method16067(856453637);
		int i_73_ = (int) (f_71_ * (float) (i_72_ >> 16 & 0xff));
		if (i_73_ > 255)
			i_73_ = 255;
		int i_74_ = (int) (f_71_ * (float) (i_72_ >> 8 & 0xff));
		if (i_74_ > 255)
			i_74_ = 255;
		int i_75_ = (int) (f_71_ * (float) (i_72_ & 0xff));
		if (i_75_ > 255)
			i_75_ = 255;
		if (aClass178_Sub1_10512.aBool9393) {
			aClass523_Sub34_Sub1_10503.method18112((float) i_49_);
			aClass523_Sub34_Sub1_10503.method18112((float) i_51_);
			aClass523_Sub34_Sub1_10503.method18112((float) i_50_);
		} else {
			aClass523_Sub34_Sub1_10503.method18110((float) i_49_);
			aClass523_Sub34_Sub1_10503.method18110((float) i_51_);
			aClass523_Sub34_Sub1_10503.method18110((float) i_50_);
		}
		aClass523_Sub34_Sub1_10503.writeByte(i_73_, -719803898);
		aClass523_Sub34_Sub1_10503.writeByte(i_74_, 1547300435);
		aClass523_Sub34_Sub1_10503.writeByte(i_75_, -1989614273);
		aClass523_Sub34_Sub1_10503.writeByte(255, -1016414826);
		method16099(i_52_);
	}

	Class523_Sub21(Class178_Sub1 class178_sub1, Class142_Sub2 class142_sub2, Class523_Sub20 class523_sub20, int[] is) {
		aClass178_Sub1_10512 = class178_sub1;
		aClass523_Sub20_10505 = class523_sub20;
		aClass142_Sub2_10504 = class142_sub2;
		int i = (aClass523_Sub20_10505.method16066(-1879460461) - (class142_sub2.anInt1682 * 341909049 >> 1));
		anInt10506 = (aClass523_Sub20_10505.method16062(2131811589) - i >> class142_sub2.anInt1680 * -1193058675);
		anInt10507 = (aClass523_Sub20_10505.method16062(2131811589) + i >> class142_sub2.anInt1680 * -1193058675);
		anInt10508 = (aClass523_Sub20_10505.method16065(1981364851) - i >> class142_sub2.anInt1680 * -1193058675);
		anInt10515 = (aClass523_Sub20_10505.method16065(1839009786) + i >> class142_sub2.anInt1680 * -1193058675);
		int i_76_ = anInt10507 - anInt10506 + 1;
		int i_77_ = anInt10515 - anInt10508 + 1;
		aFloatArrayArray10516 = new float[i_76_ + 1][i_77_ + 1];
		aFloatArrayArray10517 = new float[i_76_ + 1][i_77_ + 1];
		aFloatArrayArray10518 = new float[i_76_ + 1][i_77_ + 1];
		for (int i_78_ = 0; i_78_ <= i_77_; i_78_++) {
			int i_79_ = i_78_ + anInt10508;
			if (i_79_ > 0 && i_79_ < aClass142_Sub2_10504.anInt1681 * 452998539 - 1) {
				for (int i_80_ = 0; i_80_ <= i_76_; i_80_++) {
					int i_81_ = i_80_ + anInt10506;
					if (i_81_ > 0 && i_81_ < (aClass142_Sub2_10504.anInt1683 * 692304099 - 1)) {
						int i_82_ = (class142_sub2.method2321(i_81_ + 1, i_79_, 1817210320) - class142_sub2.method2321(i_81_ - 1, i_79_, 2012385487));
						int i_83_ = (class142_sub2.method2321(i_81_, i_79_ + 1, 1790105328) - class142_sub2.method2321(i_81_, i_79_ - 1, 1692047654));
						float f = (float) (1.0 / Math.sqrt((double) (i_82_ * i_82_ + 65536 + (i_83_ * i_83_))));
						aFloatArrayArray10516[i_80_][i_78_] = (float) i_82_ * f;
						aFloatArrayArray10517[i_80_][i_78_] = -256.0F * f;
						aFloatArrayArray10518[i_80_][i_78_] = (float) i_83_ * f;
					}
				}
			}
		}
		int i_84_ = 0;
		for (int i_85_ = anInt10508; i_85_ <= anInt10515; i_85_++) {
			if (i_85_ >= 0 && i_85_ < class142_sub2.anInt1681 * 452998539) {
				for (int i_86_ = anInt10506; i_86_ <= anInt10507; i_86_++) {
					if (i_86_ >= 0 && i_86_ < class142_sub2.anInt1683 * 692304099) {
						int i_87_ = is[i_84_];
						int[] is_88_ = (class142_sub2.anIntArrayArrayArray9717[i_86_][i_85_]);
						if (is_88_ != null && i_87_ != 0) {
							if (i_87_ == 1) {
								for (int i_89_ = 0; i_89_ < is_88_.length; i_89_ += 3) {
									if (is_88_[i_89_] != -1 && is_88_[i_89_ + 1] != -1 && is_88_[i_89_ + 2] != -1)
										anInt10509 += 3;
								}
							} else
								anInt10509 += 3;
						}
					}
					i_84_++;
				}
			} else
				i_84_ += anInt10507 - anInt10506;
		}
		if (anInt10509 > 0) {
			aClass523_Sub34_10519 = new RSBuffer(anInt10509 * 2);
			aClass523_Sub34_Sub1_10503 = new Class523_Sub34_Sub1(anInt10509 * 16);
			aClass14_10520 = new Class14(Class628.method10313(anInt10509, 946693650));
			int i_90_ = 0;
			i_84_ = 0;
			for (int i_91_ = anInt10508; i_91_ <= anInt10515; i_91_++) {
				if (i_91_ >= 0 && i_91_ < class142_sub2.anInt1681 * 452998539) {
					int i_92_ = 0;
					for (int i_93_ = anInt10506; i_93_ <= anInt10507; i_93_++) {
						if (i_93_ >= 0 && i_93_ < class142_sub2.anInt1683 * 692304099) {
							int i_94_ = is[i_84_];
							int[] is_95_ = (class142_sub2.anIntArrayArrayArray9717[i_93_][i_91_]);
							if (is_95_ != null && i_94_ != 0) {
								if (i_94_ == 1) {
									int[] is_96_ = (class142_sub2.anIntArrayArrayArray9719[i_93_][i_91_]);
									int[] is_97_ = (class142_sub2.anIntArrayArrayArray9712[i_93_][i_91_]);
									int i_98_ = 0;
									while (i_98_ < is_95_.length) {
										if (is_95_[i_98_] != -1 && is_95_[i_98_ + 1] != -1 && is_95_[i_98_ + 2] != -1) {
											method16100(i_92_, i_90_, i_93_, i_91_, is_96_[i_98_], is_97_[i_98_]);
											i_98_++;
											method16100(i_92_, i_90_, i_93_, i_91_, is_96_[i_98_], is_97_[i_98_]);
											i_98_++;
											method16100(i_92_, i_90_, i_93_, i_91_, is_96_[i_98_], is_97_[i_98_]);
											i_98_++;
										} else
											i_98_ += 3;
									}
								} else if (i_94_ == 3) {
									method16100(i_92_, i_90_, i_93_, i_91_, 0, 0);
									method16100(i_92_, i_90_, i_93_, i_91_, (class142_sub2.anInt1682 * 341909049), 0);
									method16100(i_92_, i_90_, i_93_, i_91_, 0, (class142_sub2.anInt1682 * 341909049));
								} else if (i_94_ == 2) {
									method16100(i_92_, i_90_, i_93_, i_91_, (class142_sub2.anInt1682 * 341909049), 0);
									method16100(i_92_, i_90_, i_93_, i_91_, (class142_sub2.anInt1682 * 341909049), (class142_sub2.anInt1682 * 341909049));
									method16100(i_92_, i_90_, i_93_, i_91_, 0, 0);
								} else if (i_94_ == 5) {
									method16100(i_92_, i_90_, i_93_, i_91_, (class142_sub2.anInt1682 * 341909049), (class142_sub2.anInt1682 * 341909049));
									method16100(i_92_, i_90_, i_93_, i_91_, 0, (class142_sub2.anInt1682 * 341909049));
									method16100(i_92_, i_90_, i_93_, i_91_, (class142_sub2.anInt1682 * 341909049), 0);
								} else if (i_94_ == 4) {
									method16100(i_92_, i_90_, i_93_, i_91_, 0, (class142_sub2.anInt1682 * 341909049));
									method16100(i_92_, i_90_, i_93_, i_91_, 0, 0);
									method16100(i_92_, i_90_, i_93_, i_91_, (class142_sub2.anInt1682 * 341909049), (class142_sub2.anInt1682 * 341909049));
								}
							}
						}
						i_84_++;
						i_92_++;
					}
				} else
					i_84_ += anInt10507 - anInt10506;
				i_90_++;
			}
			anInterface18_10511 = (aClass178_Sub1_10512.method14660(5123, aClass523_Sub34_10519.buffer, aClass523_Sub34_10519.offset * 2349011, false));
			anInterface15_10521 = (aClass178_Sub1_10512.method14717(16, aClass523_Sub34_Sub1_10503.buffer, aClass523_Sub34_Sub1_10503.offset * 2349011, false));
			aClass131_10514 = new Class131(anInterface15_10521, 5126, 3, 0);
			aClass131_10513 = new Class131(anInterface15_10521, 5121, 4, 12);
		} else {
			anInterface18_10511 = null;
			anInterface15_10521 = null;
			aClass131_10514 = null;
			aClass131_10513 = null;
		}
		aClass523_Sub34_Sub1_10503 = null;
		aClass523_Sub34_10519 = null;
		aClass14_10520 = null;
		aFloatArrayArray10518 = null;
		aFloatArrayArray10517 = null;
		aFloatArrayArray10516 = null;
	}
}
