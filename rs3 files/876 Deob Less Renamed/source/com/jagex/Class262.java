/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class262 {
	int[] anIntArray2842;
	byte[] aByteArray2843;
	int[] anIntArray2844;

	int method4724(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_, byte i_3_) {
		int i_4_ = 0;
		int i_5_ = i_2_ << 3;
		for (i_0_ += i; i < i_0_; i++) {
			int i_6_ = is[i] & 0xff;
			int i_7_ = anIntArray2842[i_6_];
			int i_8_ = aByteArray2843[i_6_];
			if (0 == i_8_)
				throw new RuntimeException(new StringBuilder().append("").append(i_6_).toString());
			int i_9_ = i_5_ >> 3;
			int i_10_ = i_5_ & 0x7;
			i_4_ &= -i_10_ >> 31;
			int i_11_ = (i_10_ + i_8_ - 1 >> 3) + i_9_;
			i_10_ += 24;
			is_1_[i_9_] = (byte) (i_4_ |= i_7_ >>> i_10_);
			if (i_9_ < i_11_) {
				i_9_++;
				i_10_ -= 8;
				is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
				if (i_9_ < i_11_) {
					i_9_++;
					i_10_ -= 8;
					is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
					if (i_9_ < i_11_) {
						i_9_++;
						i_10_ -= 8;
						is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
						if (i_9_ < i_11_) {
							i_9_++;
							i_10_ -= 8;
							is_1_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
						}
					}
				}
			}
			i_5_ += i_8_;
		}
		return (7 + i_5_ >> 3) - i_2_;
	}

	int method4725(byte[] is, int i, int i_12_, byte[] is_13_, int i_14_) {
		int i_15_ = 0;
		int i_16_ = i_14_ << 3;
		for (i_12_ += i; i < i_12_; i++) {
			int i_17_ = is[i] & 0xff;
			int i_18_ = anIntArray2842[i_17_];
			int i_19_ = aByteArray2843[i_17_];
			if (0 == i_19_)
				throw new RuntimeException(new StringBuilder().append("").append(i_17_).toString());
			int i_20_ = i_16_ >> 3;
			int i_21_ = i_16_ & 0x7;
			i_15_ &= -i_21_ >> 31;
			int i_22_ = (i_21_ + i_19_ - 1 >> 3) + i_20_;
			i_21_ += 24;
			is_13_[i_20_] = (byte) (i_15_ |= i_18_ >>> i_21_);
			if (i_20_ < i_22_) {
				i_20_++;
				i_21_ -= 8;
				is_13_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
				if (i_20_ < i_22_) {
					i_20_++;
					i_21_ -= 8;
					is_13_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
					if (i_20_ < i_22_) {
						i_20_++;
						i_21_ -= 8;
						is_13_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
						if (i_20_ < i_22_) {
							i_20_++;
							i_21_ -= 8;
							is_13_[i_20_] = (byte) (i_15_ = i_18_ << -i_21_);
						}
					}
				}
			}
			i_16_ += i_19_;
		}
		return (7 + i_16_ >> 3) - i_14_;
	}

	int method4726(byte[] is, int i, byte[] is_23_, int i_24_, int i_25_) {
		if (0 == i_25_)
			return 0;
		int i_26_ = 0;
		i_25_ += i_24_;
		int i_27_ = i;
		for (;;) {
			byte i_28_ = is[i_27_];
			if (i_28_ < 0)
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			int i_29_;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if ((i_28_ & 0x40) != 0)
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if (0 != (i_28_ & 0x20))
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if (0 != (i_28_ & 0x10))
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if (0 != (i_28_ & 0x8))
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if ((i_28_ & 0x4) != 0)
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if (0 != (i_28_ & 0x2))
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			if ((i_28_ & 0x1) != 0)
				i_26_ = anIntArray2844[i_26_];
			else
				i_26_++;
			if ((i_29_ = anIntArray2844[i_26_]) < 0) {
				is_23_[i_24_++] = (byte) (i_29_ ^ 0xffffffff);
				if (i_24_ >= i_25_)
					break;
				i_26_ = 0;
			}
			i_27_++;
		}
		return i_27_ + 1 - i;
	}

	int method4727(byte[] is, int i, int i_30_, byte[] is_31_, int i_32_) {
		int i_33_ = 0;
		int i_34_ = i_32_ << 3;
		for (i_30_ += i; i < i_30_; i++) {
			int i_35_ = is[i] & 0xff;
			int i_36_ = anIntArray2842[i_35_];
			int i_37_ = aByteArray2843[i_35_];
			if (0 == i_37_)
				throw new RuntimeException(new StringBuilder().append("").append(i_35_).toString());
			int i_38_ = i_34_ >> 3;
			int i_39_ = i_34_ & 0x7;
			i_33_ &= -i_39_ >> 31;
			int i_40_ = (i_39_ + i_37_ - 1 >> 3) + i_38_;
			i_39_ += 24;
			is_31_[i_38_] = (byte) (i_33_ |= i_36_ >>> i_39_);
			if (i_38_ < i_40_) {
				i_38_++;
				i_39_ -= 8;
				is_31_[i_38_] = (byte) (i_33_ = i_36_ >>> i_39_);
				if (i_38_ < i_40_) {
					i_38_++;
					i_39_ -= 8;
					is_31_[i_38_] = (byte) (i_33_ = i_36_ >>> i_39_);
					if (i_38_ < i_40_) {
						i_38_++;
						i_39_ -= 8;
						is_31_[i_38_] = (byte) (i_33_ = i_36_ >>> i_39_);
						if (i_38_ < i_40_) {
							i_38_++;
							i_39_ -= 8;
							is_31_[i_38_] = (byte) (i_33_ = i_36_ << -i_39_);
						}
					}
				}
			}
			i_34_ += i_37_;
		}
		return (7 + i_34_ >> 3) - i_32_;
	}

	int method4728(byte[] is, int i, int i_41_, byte[] is_42_, int i_43_) {
		int i_44_ = 0;
		int i_45_ = i_43_ << 3;
		for (i_41_ += i; i < i_41_; i++) {
			int i_46_ = is[i] & 0xff;
			int i_47_ = anIntArray2842[i_46_];
			int i_48_ = aByteArray2843[i_46_];
			if (0 == i_48_)
				throw new RuntimeException(new StringBuilder().append("").append(i_46_).toString());
			int i_49_ = i_45_ >> 3;
			int i_50_ = i_45_ & 0x7;
			i_44_ &= -i_50_ >> 31;
			int i_51_ = (i_50_ + i_48_ - 1 >> 3) + i_49_;
			i_50_ += 24;
			is_42_[i_49_] = (byte) (i_44_ |= i_47_ >>> i_50_);
			if (i_49_ < i_51_) {
				i_49_++;
				i_50_ -= 8;
				is_42_[i_49_] = (byte) (i_44_ = i_47_ >>> i_50_);
				if (i_49_ < i_51_) {
					i_49_++;
					i_50_ -= 8;
					is_42_[i_49_] = (byte) (i_44_ = i_47_ >>> i_50_);
					if (i_49_ < i_51_) {
						i_49_++;
						i_50_ -= 8;
						is_42_[i_49_] = (byte) (i_44_ = i_47_ >>> i_50_);
						if (i_49_ < i_51_) {
							i_49_++;
							i_50_ -= 8;
							is_42_[i_49_] = (byte) (i_44_ = i_47_ << -i_50_);
						}
					}
				}
			}
			i_45_ += i_48_;
		}
		return (7 + i_45_ >> 3) - i_43_;
	}

	int method4729(byte[] is, int i, int i_52_, byte[] is_53_, int i_54_) {
		int i_55_ = 0;
		int i_56_ = i_54_ << 3;
		for (i_52_ += i; i < i_52_; i++) {
			int i_57_ = is[i] & 0xff;
			int i_58_ = anIntArray2842[i_57_];
			int i_59_ = aByteArray2843[i_57_];
			if (0 == i_59_)
				throw new RuntimeException(new StringBuilder().append("").append(i_57_).toString());
			int i_60_ = i_56_ >> 3;
			int i_61_ = i_56_ & 0x7;
			i_55_ &= -i_61_ >> 31;
			int i_62_ = (i_61_ + i_59_ - 1 >> 3) + i_60_;
			i_61_ += 24;
			is_53_[i_60_] = (byte) (i_55_ |= i_58_ >>> i_61_);
			if (i_60_ < i_62_) {
				i_60_++;
				i_61_ -= 8;
				is_53_[i_60_] = (byte) (i_55_ = i_58_ >>> i_61_);
				if (i_60_ < i_62_) {
					i_60_++;
					i_61_ -= 8;
					is_53_[i_60_] = (byte) (i_55_ = i_58_ >>> i_61_);
					if (i_60_ < i_62_) {
						i_60_++;
						i_61_ -= 8;
						is_53_[i_60_] = (byte) (i_55_ = i_58_ >>> i_61_);
						if (i_60_ < i_62_) {
							i_60_++;
							i_61_ -= 8;
							is_53_[i_60_] = (byte) (i_55_ = i_58_ << -i_61_);
						}
					}
				}
			}
			i_56_ += i_59_;
		}
		return (7 + i_56_ >> 3) - i_54_;
	}

	public Class262(byte[] is) {
		int i = is.length;
		anIntArray2842 = new int[i];
		aByteArray2843 = is;
		int[] is_63_ = new int[33];
		anIntArray2844 = new int[8];
		int i_64_ = 0;
		for (int i_65_ = 0; i_65_ < i; i_65_++) {
			int i_66_ = is[i_65_];
			if (0 != i_66_) {
				int i_67_ = 1 << 32 - i_66_;
				int i_68_ = is_63_[i_66_];
				anIntArray2842[i_65_] = i_68_;
				int i_69_;
				if ((i_68_ & i_67_) != 0)
					i_69_ = is_63_[i_66_ - 1];
				else {
					i_69_ = i_68_ | i_67_;
					for (int i_70_ = i_66_ - 1; i_70_ >= 1; i_70_--) {
						int i_71_ = is_63_[i_70_];
						if (i_71_ != i_68_)
							break;
						int i_72_ = 1 << 32 - i_70_;
						if (0 != (i_71_ & i_72_)) {
							is_63_[i_70_] = is_63_[i_70_ - 1];
							break;
						}
						is_63_[i_70_] = i_71_ | i_72_;
					}
				}
				is_63_[i_66_] = i_69_;
				for (int i_73_ = 1 + i_66_; i_73_ <= 32; i_73_++) {
					if (i_68_ == is_63_[i_73_])
						is_63_[i_73_] = i_69_;
				}
				int i_74_ = 0;
				for (int i_75_ = 0; i_75_ < i_66_; i_75_++) {
					int i_76_ = -2147483648 >>> i_75_;
					if ((i_68_ & i_76_) != 0) {
						if (0 == anIntArray2844[i_74_])
							anIntArray2844[i_74_] = i_64_;
						i_74_ = anIntArray2844[i_74_];
					} else
						i_74_++;
					if (i_74_ >= anIntArray2844.length) {
						int[] is_77_ = new int[anIntArray2844.length * 2];
						for (int i_78_ = 0; i_78_ < anIntArray2844.length; i_78_++)
							is_77_[i_78_] = anIntArray2844[i_78_];
						anIntArray2844 = is_77_;
					}
					i_76_ >>>= 1;
				}
				anIntArray2844[i_74_] = i_65_ ^ 0xffffffff;
				if (i_74_ >= i_64_)
					i_64_ = i_74_ + 1;
			}
		}
	}

	int method4730(byte[] is, int i, byte[] is_79_, int i_80_, int i_81_) {
		if (0 == i_81_)
			return 0;
		int i_82_ = 0;
		i_81_ += i_80_;
		int i_83_ = i;
		for (;;) {
			byte i_84_ = is[i_83_];
			if (i_84_ < 0)
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			int i_85_;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if ((i_84_ & 0x40) != 0)
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if (0 != (i_84_ & 0x20))
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if (0 != (i_84_ & 0x10))
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if (0 != (i_84_ & 0x8))
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if ((i_84_ & 0x4) != 0)
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if (0 != (i_84_ & 0x2))
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			if ((i_84_ & 0x1) != 0)
				i_82_ = anIntArray2844[i_82_];
			else
				i_82_++;
			if ((i_85_ = anIntArray2844[i_82_]) < 0) {
				is_79_[i_80_++] = (byte) (i_85_ ^ 0xffffffff);
				if (i_80_ >= i_81_)
					break;
				i_82_ = 0;
			}
			i_83_++;
		}
		return i_83_ + 1 - i;
	}

	int method4731(byte[] is, int i, byte[] is_86_, int i_87_, int i_88_, short i_89_) {
		if (0 == i_88_)
			return 0;
		int i_90_ = 0;
		i_88_ += i_87_;
		int i_91_ = i;
		for (;;) {
			byte i_92_ = is[i_91_];
			if (i_92_ < 0)
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			int i_93_;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if ((i_92_ & 0x40) != 0)
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x20))
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x10))
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x8))
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if ((i_92_ & 0x4) != 0)
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x2))
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			if ((i_92_ & 0x1) != 0)
				i_90_ = anIntArray2844[i_90_];
			else
				i_90_++;
			if ((i_93_ = anIntArray2844[i_90_]) < 0) {
				is_86_[i_87_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_87_ >= i_88_)
					break;
				i_90_ = 0;
			}
			i_91_++;
		}
		return i_91_ + 1 - i;
	}

	int method4732(byte[] is, int i, byte[] is_94_, int i_95_, int i_96_) {
		if (0 == i_96_)
			return 0;
		int i_97_ = 0;
		i_96_ += i_95_;
		int i_98_ = i;
		for (;;) {
			byte i_99_ = is[i_98_];
			if (i_99_ < 0)
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			int i_100_;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if ((i_99_ & 0x40) != 0)
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if (0 != (i_99_ & 0x20))
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if (0 != (i_99_ & 0x10))
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if (0 != (i_99_ & 0x8))
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if ((i_99_ & 0x4) != 0)
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if (0 != (i_99_ & 0x2))
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			if ((i_99_ & 0x1) != 0)
				i_97_ = anIntArray2844[i_97_];
			else
				i_97_++;
			if ((i_100_ = anIntArray2844[i_97_]) < 0) {
				is_94_[i_95_++] = (byte) (i_100_ ^ 0xffffffff);
				if (i_95_ >= i_96_)
					break;
				i_97_ = 0;
			}
			i_98_++;
		}
		return i_98_ + 1 - i;
	}

	static final void method4733(Class669 class669, byte i) {
		Class534_Sub1.aBool10772 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
	}

	static final void method4734(Class669 class669, byte i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub24_10614, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), 304274624);
		Class211.method3824(1649506399);
	}

	static final void method4735(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_101_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_102_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_101_ + i_102_;
	}

	static void method4736(Class704 class704, byte i) {
		Class54.aClass704_728 = class704;
	}

	static final void method4737(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 38);
	}

	static final void method4738(String string, byte i) {
		System.out.println(new StringBuilder().append("Error: ").append(Class425.method6743(string, "%0a", "\n", (byte) 98)).toString());
	}
}
