/* Class455_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class455_Sub1 extends Class455 {
	static int[] anIntArray10306;
	static boolean aBool10307;
	static final int anInt10308 = 0;
	static final int anInt10309 = 2;
	static final int anInt10310 = 1;
	static final int anInt10311 = 3;
	static int[] anIntArray10312;
	static int[] anIntArray10313;
	int anInt10314 = -1345704227;
	static int[] anIntArray10315;
	static boolean aBool10316 = false;
	Class627 aClass627_10317;
	Class53_Sub18 aClass53_Sub18_10318;

	Interface61 method15793(int i, int i_0_, int i_1_, int i_2_) {
		Interface61 interface61 = null;
		if (i_0_ == 0)
			interface61 = (Interface61) aClass560_4983.method9280(i, i_1_, i_2_, -1349297668);
		if (1 == i_0_)
			interface61 = (Interface61) aClass560_4983.method9284(i, i_1_, i_2_, (byte) 35);
		if (i_0_ == 2)
			interface61 = ((Interface61) aClass560_4983.method9295(i, i_1_, i_2_, client.anInterface63_11296, (byte) -123));
		if (i_0_ == 3)
			interface61 = (Interface61) aClass560_4983.method9398(i, i_1_, i_2_, -1360598481);
		return interface61;
	}

	public final void method15794(Class178 class178, byte[] is, int i, int i_3_, short i_4_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_5_ = -1;
		for (;;) {
			int i_6_ = class523_sub34.method16495(200000000);
			if (i_6_ == 0)
				break;
			i_5_ += i_6_;
			int i_7_ = 0;
			for (;;) {
				int i_8_ = class523_sub34.readUnsignedSmart(368514876);
				if (0 == i_8_)
					break;
				i_7_ += i_8_ - 1;
				int i_9_ = i_7_ & 0x3f;
				int i_10_ = i_7_ >> 6 & 0x3f;
				int i_11_ = i_7_ >> 12;
				int i_12_ = class523_sub34.readUnsignedByte(362786988);
				int i_13_ = i_12_ >> 2;
				int i_14_ = i_12_ & 0x3;
				int i_15_ = i + i_10_;
				int i_16_ = i_3_ + i_9_;
				Class602 class602 = (Class602) aClass53_Sub18_10318.getDefinition(i_5_, (byte) 6);
				int i_17_;
				int i_18_;
				if ((i_14_ & 0x1) == 0) {
					i_17_ = class602.anInt7871 * -1994552549;
					i_18_ = class602.anInt7872 * -1564896481;
				} else {
					i_17_ = -1564896481 * class602.anInt7872;
					i_18_ = class602.anInt7871 * -1994552549;
				}
				int i_19_ = i_15_ + i_17_;
				int i_20_ = i_18_ + i_16_;
				if (i_15_ < anInt4991 * -1287541105 && i_16_ < -215635651 * anInt4984 && i_19_ > 0 && i_20_ > 0 && (1923531495 * Class607.aClass607_7970.anInt7982 == i_13_ || (i_13_ == 1923531495 * Class607.aClass607_7984.anInt7982) || (i_15_ > 0 && i_16_ > 0 && i_15_ < -1287541105 * anInt4991 - 1 && i_16_ < -215635651 * anInt4984 - 1)))
					method15798(class178, i_11_, i_11_, i_15_, i_16_, i_5_, i_14_, i_13_, -1, 0, -1297947077);
			}
		}
	}

	boolean method15795(Class178 class178, int i, int i_21_, boolean bool, Class602 class602, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		if (i == Class607.aClass607_7968.anInt7982 * 1923531495) {
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, 0, 0, i, i_21_);
				if (class647_sub1_sub1_sub1.method392((short) -31269))
					class647_sub1_sub1_sub1.method394(class178, -395382413);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, 0, 0, i, i_21_, i_22_, i_23_);
			aClass560_4983.method9267(i_24_, i_29_, i_30_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7969.anInt7982 * 1923531495) {
			int i_31_ = 65;
			Interface61 interface61 = ((Interface61) aClass560_4983.method9280(i_24_, i_29_, i_30_, -534223123));
			if (null != interface61)
				i_31_ = ((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) 95))).anInt7907 * -1116762301 + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, i_31_ * anIntArray10312[i_21_], i_31_ * anIntArray10313[i_21_], i, i_21_));
				if (class647_sub1_sub1_sub1.method392((short) -31093))
					class647_sub1_sub1_sub1.method394(class178, 339192492);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, anIntArray10312[i_21_] * i_31_, anIntArray10313[i_21_] * i_31_, i, i_21_, i_22_, i_23_));
			aClass560_4983.method9267(i_24_, i_29_, i_30_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7983.anInt7982 * 1923531495) {
			int i_32_ = 33;
			Interface61 interface61 = ((Interface61) aClass560_4983.method9280(i_24_, i_29_, i_30_, -323930252));
			if (interface61 != null)
				i_32_ = (((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -84))).anInt7907 * -1116762301 / 2) + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, anIntArray10312[i_21_] * i_32_, anIntArray10313[i_21_] * i_32_, i, 4 + i_21_));
				if (class647_sub1_sub1_sub1.method392((short) -4722))
					class647_sub1_sub1_sub1.method394(class178, 208637832);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, anIntArray10306[i_21_] * i_32_, anIntArray10315[i_21_] * i_32_, i, i_21_ + 4, i_22_, i_23_));
			aClass560_4983.method9267(i_24_, i_29_, i_30_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (Class607.aClass607_7980.anInt7982 * 1923531495 == i) {
			int i_33_ = 2 + i_21_ & 0x3;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, 0, 0, i, i_33_ + 4);
				if (class647_sub1_sub1_sub1.method392((short) -19254))
					class647_sub1_sub1_sub1.method394(class178, -1169580059);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, 0, 0, i, 4 + i_33_, i_22_, i_23_);
			aClass560_4983.method9267(i_24_, i_29_, i_30_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7972.anInt7982 * 1923531495) {
			int i_34_ = 2 + i_21_ & 0x3;
			int i_35_ = 33;
			Interface61 interface61 = ((Interface61) aClass560_4983.method9280(i_24_, i_29_, i_30_, -124763123));
			if (null != interface61)
				i_35_ = (((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) 4))).anInt7907 * -1116762301 / 2 + 1);
			Class647_Sub1_Sub1 class647_sub1_sub1;
			Class647_Sub1_Sub1 class647_sub1_sub1_36_;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, i_35_ * anIntArray10306[i_21_], anIntArray10315[i_21_] * i_35_, i, 4 + i_21_));
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1_37_ = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, 0, 0, i, 4 + i_34_);
				if (class647_sub1_sub1_sub1.method392((short) -30687))
					class647_sub1_sub1_sub1.method394(class178, 290575559);
				if (class647_sub1_sub1_sub1_37_.method392((short) -18960))
					class647_sub1_sub1_sub1_37_.method394(class178, 2079068353);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
				class647_sub1_sub1_36_ = class647_sub1_sub1_sub1_37_;
			} else {
				Class647_Sub1_Sub1_Sub2 class647_sub1_sub1_sub2 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, anIntArray10306[i_21_] * i_35_, i_35_ * anIntArray10315[i_21_], i, i_21_ + 4, i_22_, i_23_));
				Class647_Sub1_Sub1_Sub2 class647_sub1_sub1_sub2_38_ = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_24_, i_25_, i_26_, i_27_, i_28_, aBool5022, 0, 0, i, 4 + i_34_, i_22_, i_23_);
				class647_sub1_sub1 = class647_sub1_sub1_sub2;
				class647_sub1_sub1_36_ = class647_sub1_sub1_sub2_38_;
			}
			aClass560_4983.method9267(i_24_, i_29_, i_30_, class647_sub1_sub1, class647_sub1_sub1_36_, -2070066754);
			return true;
		}
		return false;
	}

	public final void method15796(Class178 class178, boolean bool, byte i) {
		aClass560_4983.method9364();
		if (!bool) {
			if (1248554419 * anInt4990 > 1) {
				for (int i_39_ = 0; i_39_ < -1287541105 * anInt4991; i_39_++) {
					for (int i_40_ = 0; i_40_ < anInt4984 * -215635651; i_40_++) {
						if (2 == ((aClass451_4982.aByteArrayArrayArray4962[1][i_39_][i_40_]) & 0x2))
							aClass560_4983.method9300(i_39_, i_40_, 1099456127);
					}
				}
			}
			for (int i_41_ = 0; i_41_ < 1248554419 * anInt4990; i_41_++) {
				for (int i_42_ = 0; i_42_ <= anInt4984 * -215635651; i_42_++) {
					for (int i_43_ = 0; i_43_ <= anInt4991 * -1287541105; i_43_++) {
						if (0 != (aByteArrayArrayArray5001[i_41_][i_43_][i_42_] & 0x4)) {
							int i_44_ = i_43_;
							int i_45_ = i_43_;
							int i_46_ = i_42_;
							int i_47_;
							for (i_47_ = i_42_; (i_46_ > 0 && ((aByteArrayArrayArray5001[i_41_][i_43_][i_46_ - 1]) & 0x4) != 0 && i_47_ - i_46_ < 10); i_46_--) {
								/* empty */
							}
							for (/**/; (i_47_ < -215635651 * anInt4984 && ((aByteArrayArrayArray5001[i_41_][i_43_][i_47_ + 1]) & 0x4) != 0 && i_47_ - i_46_ < 10); i_47_++) {
								/* empty */
							}
							while_45_: for (/**/; i_44_ > 0 && i_45_ - i_44_ < 10; i_44_--) {
								for (int i_48_ = i_46_; i_48_ <= i_47_; i_48_++) {
									if (((aByteArrayArrayArray5001[i_41_][i_44_ - 1][i_48_]) & 0x4) == 0)
										break while_45_;
								}
							}
							while_46_: for (/**/; (i_45_ < anInt4991 * -1287541105 && i_45_ - i_44_ < 10); i_45_++) {
								for (int i_49_ = i_46_; i_49_ <= i_47_; i_49_++) {
									if (0 == ((aByteArrayArrayArray5001[i_41_][1 + i_45_][i_49_]) & 0x4))
										break while_46_;
								}
							}
							if ((1 + (i_45_ - i_44_)) * (1 + (i_47_ - i_46_)) >= 4) {
								int i_50_ = (anIntArrayArrayArray5033[i_41_][i_44_][i_46_]);
								aClass560_4983.aClass544_7541.method9017(4, i_41_, i_44_ << 9, 512 + (i_45_ << 9), i_46_ << 9, (i_47_ << 9) + 512, i_50_, i_50_);
								for (int i_51_ = i_44_; i_51_ <= i_45_; i_51_++) {
									for (int i_52_ = i_46_; i_52_ <= i_47_; i_52_++)
										aByteArrayArrayArray5001[i_41_][i_51_][i_52_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass560_4983.aClass544_7541.method9015();
		}
		aByteArrayArrayArray5001 = null;
	}

	public final void method15797(Class178 class178, byte[] is, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_60_ = -1;
		for (;;) {
			int i_61_ = class523_sub34.method16495(200000000);
			if (0 == i_61_)
				break;
			i_60_ += i_61_;
			int i_62_ = 0;
			for (;;) {
				int i_63_ = class523_sub34.readUnsignedSmart(368514876);
				if (i_63_ == 0)
					break;
				i_62_ += i_63_ - 1;
				int i_64_ = i_62_ & 0x3f;
				int i_65_ = i_62_ >> 6 & 0x3f;
				int i_66_ = i_62_ >> 12;
				int i_67_ = class523_sub34.readUnsignedByte(1159870129);
				int i_68_ = i_67_ >> 2;
				int i_69_ = i_67_ & 0x3;
				if (i_55_ == i_66_ && i_65_ >= i_56_ && i_65_ < 8 + i_56_ && i_64_ >= i_57_ && i_64_ < 8 + i_57_) {
					Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_60_, (byte) -12));
					int i_70_;
					int i_71_;
					if (0 == (i_69_ & 0x1)) {
						i_70_ = -1994552549 * class602.anInt7871;
						i_71_ = -1564896481 * class602.anInt7872;
					} else {
						i_70_ = class602.anInt7872 * -1564896481;
						i_71_ = class602.anInt7871 * -1994552549;
					}
					int i_72_ = (i_53_ + Class687_Sub26.method16957(i_65_ & 0x7, i_64_ & 0x7, i_58_, (-1994552549 * class602.anInt7871), (class602.anInt7872 * -1564896481), i_69_, -1513967693));
					int i_73_ = i_54_ + Class38.method1120(i_65_ & 0x7, i_64_ & 0x7, i_58_, (class602.anInt7871 * -1994552549), (-1564896481 * class602.anInt7872), i_69_, 16711680);
					int i_74_ = i_72_ + i_70_;
					int i_75_ = i_71_ + i_73_;
					if (i_72_ < -1287541105 * anInt4991 && i_73_ < -215635651 * anInt4984 && i_74_ > 0 && i_75_ > 0 && ((i_68_ == Class607.aClass607_7970.anInt7982 * 1923531495) || (Class607.aClass607_7984.anInt7982 * 1923531495 == i_68_) || (i_72_ > 0 && i_73_ > 0 && i_72_ < -1287541105 * anInt4991 - 1 && i_73_ < -215635651 * anInt4984 - 1)))
						method15798(class178, i, i, i_72_, i_73_, i_60_, i_58_ + i_69_ & 0x3, i_68_, -1, 0, 1291524555);
				}
			}
		}
	}

	final void method15798(Class178 class178, int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		if (i_76_ < -817571777 * anInt10314)
			anInt10314 = i_76_ * -1098180673;
		Class602 class602 = (Class602) aClass53_Sub18_10318.getDefinition(i_79_, (byte) -48);
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(2086392497) != 0 || !class602.aBool7920) {
			int i_85_;
			int i_86_;
			if (i_80_ == 1 || 3 == i_80_) {
				i_85_ = class602.anInt7872 * -1564896481;
				i_86_ = -1994552549 * class602.anInt7871;
			} else {
				i_85_ = -1994552549 * class602.anInt7871;
				i_86_ = -1564896481 * class602.anInt7872;
			}
			int i_87_;
			int i_88_;
			if (i_85_ + i_77_ <= anInt4991 * -1287541105) {
				i_87_ = i_77_ + (i_85_ >> 1);
				i_88_ = i_77_ + (i_85_ + 1 >> 1);
			} else {
				i_87_ = i_77_;
				i_88_ = i_77_ + 1;
			}
			int i_89_;
			int i_90_;
			if (i_86_ + i_78_ <= anInt4984 * -215635651) {
				i_89_ = i_78_ + (i_86_ >> 1);
				i_90_ = i_78_ + (1 + i_86_ >> 1);
			} else {
				i_89_ = i_78_;
				i_90_ = i_78_ + 1;
			}
			Class142 class142 = aClass560_4983.aClass142Array7509[i];
			int i_91_;
			if (i_81_ == Class607.aClass607_7970.anInt7982 * 1923531495 || 1923531495 * Class607.aClass607_7984.anInt7982 == i_81_)
				i_91_ = (class142.method2329(i_87_, i_89_, -1039292053) + class142.method2329(i_88_, i_89_, -1039292053) + class142.method2329(i_87_, i_90_, -1039292053) + class142.method2329(i_88_, i_90_, -1039292053)) >> 2;
			else
				i_91_ = (class142.method2321(i_87_, i_89_, 1854076938) + class142.method2321(i_88_, i_89_, 1967757766) + class142.method2321(i_87_, i_90_, 2114375915) + class142.method2321(i_88_, i_90_, 2140059346)) >> 2;
			int i_92_ = (i_77_ << 9) + (i_85_ << 8);
			int i_93_ = (i_86_ << 8) + (i_78_ << 9);
			boolean bool = aBool4994 && !aBool5022 && class602.aBool7877;
			if (class602.method9899((byte) 19))
				Class451.method7292(i_76_, i_77_, i_78_, i_80_, class602, null, null, 1450085248);
			boolean bool_94_ = (-1 == i_82_ && (!class602.method9935((byte) 0) || class602.aBool7883 && (Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) -104) == 0)) && null == class602.anIntArray7912 && !class602.aBool7924 && !class602.aBool7928);
			if (!aBool10316 || ((!Class479.method7896(i_81_, -804549877) || 1 == class602.anInt7873 * 1370816123) && (!Class647_Sub1_Sub3_Sub1.method18418(i_81_, 1679494864) || 0 != class602.anInt7873 * 1370816123))) {
				if (i_81_ == Class607.aClass607_7985.anInt7982 * 1923531495) {
					if (Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-833766549) != 0 || 0 != class602.anInt7874 * -344567467 || 972673777 * class602.anInt7852 == 1 || class602.aBool7905) {
						Class647_Sub1_Sub2 class647_sub1_sub2;
						if (bool_94_) {
							Class647_Sub1_Sub2_Sub2 class647_sub1_sub2_sub2 = (new Class647_Sub1_Sub2_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_76_, i, i_92_, i_91_, i_93_, aBool5022, i_80_, bool));
							if (class647_sub1_sub2_sub2.method392((short) -13893))
								class647_sub1_sub2_sub2.method394(class178, 345843545);
							class647_sub1_sub2 = class647_sub1_sub2_sub2;
						} else
							class647_sub1_sub2 = (new Class647_Sub1_Sub2_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_76_, i, i_92_, i_91_, i_93_, aBool5022, i_80_, i_82_, i_83_));
						aClass560_4983.method9264(i_76_, i_77_, i_78_, class647_sub1_sub2, (byte) 5);
					}
				} else if ((1923531495 * Class607.aClass607_7970.anInt7982 == i_81_) || i_81_ == (Class607.aClass607_7984.anInt7982 * 1923531495)) {
					Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = null;
					Class647_Sub1_Sub3 class647_sub1_sub3;
					int i_95_;
					if (bool_94_) {
						Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3_96_ = (new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_76_, i, i_92_, i_91_, i_93_, aBool5022, i_77_, i_77_ + i_85_ - 1, i_78_, i_86_ + i_78_ - 1, i_81_, i_80_, bool, (Class594.aClass594_7817 != class602.aClass594_7865)));
						i_95_ = class647_sub1_sub3_sub3_96_.method18439(789641202);
						class647_sub1_sub3 = class647_sub1_sub3_sub3_96_;
						class647_sub1_sub3_sub3 = class647_sub1_sub3_sub3_96_;
					} else {
						class647_sub1_sub3 = (new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_76_, i, i_92_, i_91_, i_93_, aBool5022, i_77_, i_77_ + i_85_ - 1, i_78_, i_78_ + i_86_ - 1, i_81_, i_80_, i_82_, i_83_, (class602.aClass594_7865 != Class594.aClass594_7817)));
						i_95_ = 15;
					}
					if (aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 92)) {
						if (class647_sub1_sub3_sub3 != null && class647_sub1_sub3_sub3.method392((short) -4414))
							class647_sub1_sub3_sub3.method394(class178, 1011071548);
						if (class602.aBool7895 && aBool4994) {
							if (i_95_ > 30)
								i_95_ = 30;
							for (int i_97_ = 0; i_97_ <= i_85_; i_97_++) {
								for (int i_98_ = 0; i_98_ <= i_86_; i_98_++)
									class142.method2320(i_97_ + i_77_, i_78_ + i_98_, i_95_);
							}
						}
					}
				} else if (Class647_Sub1_Sub3_Sub1.method18418(i_81_, 2131770532) || Class60.method1404(i_81_, (byte) -22)) {
					Class647_Sub1_Sub3 class647_sub1_sub3;
					if (bool_94_) {
						Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = (new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_76_, i, i_92_, i_91_, i_93_, aBool5022, i_77_, i_85_ + i_77_ - 1, i_78_, i_78_ + i_86_ - 1, i_81_, i_80_, bool, true));
						if (class647_sub1_sub3_sub3.method392((short) -31248))
							class647_sub1_sub3_sub3.method394(class178, 1729007310);
						class647_sub1_sub3 = class647_sub1_sub3_sub3;
					} else
						class647_sub1_sub3 = new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_76_, i, i_92_, i_91_, i_93_, aBool5022, i_77_, i_77_ + i_85_ - 1, i_78_, i_86_ + i_78_ - 1, i_81_, i_80_, i_82_, i_83_, true);
					aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 60);
					if (aBool4994 && !aBool5022 && Class647_Sub1_Sub3_Sub1.method18418(i_81_, 1182013984) && (Class607.aClass607_7967.anInt7982 * 1923531495 != i_81_) && i_76_ > 0 && 1370816123 * class602.anInt7873 != 0)
						aByteArrayArrayArray5001[i_76_][i_77_][i_78_] |= 0x4;
				} else if (method15799(class178, i_81_, i_80_, bool_94_, class602, i_82_, i_83_, i_76_, i, i_92_, i_91_, i_93_, i_77_, i_78_, bool, class142, i_85_, i_86_, 554953766) || method15800(class178, i_81_, i_80_, bool_94_, class602, i_82_, i_83_, i_76_, i, i_92_, i_91_, i_93_, i_77_, i_78_, -1931980009)) {
					/* empty */
				}
			}
		}
	}

	boolean method15799(Class178 class178, int i, int i_99_, boolean bool, Class602 class602, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, boolean bool_109_, Class142 class142, int i_110_, int i_111_, int i_112_) {
		if (1923531495 * Class607.aClass607_7974.anInt7982 == i) {
			int i_113_ = 1370816123 * class602.anInt7873;
			if (aBool10307 && class602.anInt7873 * 1370816123 == -1)
				i_113_ = 1;
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_, bool_109_);
				if (class647_sub1_sub4_sub1.method392((short) -7529))
					class647_sub1_sub4_sub1.method394(class178, 1276377572);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_, i_100_, i_101_);
			aClass560_4983.method9266(i_102_, i_107_, i_108_, class647_sub1_sub4, null, 1742780513);
			if (0 == i_99_) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_107_, i_108_, 50);
					class142.method2320(i_107_, i_108_ + 1, 50);
				}
				if (i_113_ == 1 && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(1, i_102_, i_107_, i_108_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
			} else if (1 == i_99_) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_107_, i_108_ + 1, 50);
					class142.method2320(i_107_ + 1, 1 + i_108_, 50);
				}
				if (1 == i_113_ && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(2, i_102_, i_107_, i_108_ + 1, 1491131641 * class602.anInt7879, -(class602.anInt7880 * -692200661));
			} else if (i_99_ == 2) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(1 + i_107_, i_108_, 50);
					class142.method2320(1 + i_107_, i_108_ + 1, 50);
				}
				if (1 == i_113_ && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(1, i_102_, 1 + i_107_, i_108_, class602.anInt7879 * 1491131641, -(class602.anInt7880 * -692200661));
			} else if (i_99_ == 3) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_107_, i_108_, 50);
					class142.method2320(1 + i_107_, i_108_, 50);
				}
				if (i_113_ == 1 && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(2, i_102_, i_107_, i_108_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
			}
			if (class602.anInt7907 * -1116762301 != 64)
				aClass560_4983.method9269(i_102_, i_107_, i_108_, class602.anInt7907 * -1116762301, (short) -11613);
			return true;
		}
		if (i == Class607.aClass607_7964.anInt7982 * 1923531495) {
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_, bool_109_);
				if (class647_sub1_sub4_sub1.method392((short) -23971))
					class647_sub1_sub4_sub1.method394(class178, 1045412094);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_, i_100_, i_101_);
			aClass560_4983.method9266(i_102_, i_107_, i_108_, class647_sub1_sub4, null, 1376404331);
			if (class602.aBool7895 && aBool4994) {
				if (i_99_ == 0)
					class142.method2320(i_107_, 1 + i_108_, 50);
				else if (1 == i_99_)
					class142.method2320(1 + i_107_, 1 + i_108_, 50);
				else if (i_99_ == 2)
					class142.method2320(1 + i_107_, i_108_, 50);
				else if (3 == i_99_)
					class142.method2320(i_107_, i_108_, 50);
			}
			return true;
		}
		if (i == 1923531495 * Class607.aClass607_7965.anInt7982) {
			int i_114_ = i_99_ + 1 & 0x3;
			Class647_Sub1_Sub4 class647_sub1_sub4;
			Class647_Sub1_Sub4 class647_sub1_sub4_115_;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, 4 + i_99_, bool_109_);
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1_116_ = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_114_, bool_109_);
				if (class647_sub1_sub4_sub1.method392((short) -17668))
					class647_sub1_sub4_sub1.method394(class178, -61470047);
				if (class647_sub1_sub4_sub1_116_.method392((short) -6060))
					class647_sub1_sub4_sub1_116_.method394(class178, -1081795883);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
				class647_sub1_sub4_115_ = class647_sub1_sub4_sub1_116_;
			} else {
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_ + 4, i_100_, i_101_);
				class647_sub1_sub4_115_ = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_114_, i_100_, i_101_);
			}
			aClass560_4983.method9266(i_102_, i_107_, i_108_, class647_sub1_sub4, class647_sub1_sub4_115_, 1145675210);
			if ((1 == class602.anInt7873 * 1370816123 || aBool10307 && -1 == 1370816123 * class602.anInt7873) && !aBool5022) {
				if (i_99_ == 0) {
					aClass560_4983.aClass544_7541.method9046(1, i_102_, i_107_, i_108_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_102_, i_107_, i_108_ + 1, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
				} else if (i_99_ == 1) {
					aClass560_4983.aClass544_7541.method9046(1, i_102_, i_107_ + 1, i_108_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_102_, i_107_, 1 + i_108_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
				} else if (2 == i_99_) {
					aClass560_4983.aClass544_7541.method9046(1, i_102_, 1 + i_107_, i_108_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
					aClass560_4983.aClass544_7541.method9046(2, i_102_, i_107_, i_108_, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
				} else if (3 == i_99_) {
					aClass560_4983.aClass544_7541.method9046(1, i_102_, i_107_, i_108_, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_102_, i_107_, i_108_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
				}
			}
			if (64 != class602.anInt7907 * -1116762301)
				aClass560_4983.method9269(i_102_, i_107_, i_108_, class602.anInt7907 * -1116762301, (short) 12068);
			return true;
		}
		if (1923531495 * Class607.aClass607_7966.anInt7982 == i) {
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_, bool_109_);
				if (class647_sub1_sub4_sub1.method392((short) -32464))
					class647_sub1_sub4_sub1.method394(class178, -820804325);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i, i_99_, i_100_, i_101_);
			aClass560_4983.method9266(i_102_, i_107_, i_108_, class647_sub1_sub4, null, 2095198056);
			if (class602.aBool7895 && aBool4994) {
				if (0 == i_99_)
					class142.method2320(i_107_, 1 + i_108_, 50);
				else if (i_99_ == 1)
					class142.method2320(i_107_ + 1, 1 + i_108_, 50);
				else if (i_99_ == 2)
					class142.method2320(i_107_ + 1, i_108_, 50);
				else if (i_99_ == 3)
					class142.method2320(i_107_, i_108_, 50);
			}
			return true;
		}
		if (1923531495 * Class607.aClass607_7971.anInt7982 == i) {
			Class647_Sub1_Sub3 class647_sub1_sub3;
			if (bool) {
				Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i_107_, i_107_, i_108_, i_108_, i, i_99_, bool_109_, true);
				if (class647_sub1_sub3_sub3.method392((short) 6192))
					class647_sub1_sub3_sub3.method394(class178, 1272028996);
				class647_sub1_sub3 = class647_sub1_sub3_sub3;
			} else
				class647_sub1_sub3 = new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_102_, i_103_, i_104_, i_105_, i_106_, aBool5022, i_107_, i_107_ + i_110_ - 1, i_108_, i_111_ + i_108_ - 1, i, i_99_, i_100_, i_101_, true);
			aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 69);
			if (1 == 1370816123 * class602.anInt7873 && !aBool5022) {
				int i_117_;
				if ((i_99_ & 0x1) == 0)
					i_117_ = 8;
				else
					i_117_ = 16;
				aClass560_4983.aClass544_7541.method9046(i_117_, i_102_, i_107_, i_108_, 1491131641 * class602.anInt7879, 0);
			}
			if (64 != -1116762301 * class602.anInt7907)
				aClass560_4983.method9269(i_102_, i_107_, i_108_, class602.anInt7907 * -1116762301, (short) 27920);
			return true;
		}
		return false;
	}

	boolean method15800(Class178 class178, int i, int i_118_, boolean bool, Class602 class602, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		if (i == Class607.aClass607_7968.anInt7982 * 1923531495) {
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, 0, 0, i, i_118_);
				if (class647_sub1_sub1_sub1.method392((short) -26895))
					class647_sub1_sub1_sub1.method394(class178, -101367857);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, 0, 0, i, i_118_, i_119_, i_120_);
			aClass560_4983.method9267(i_121_, i_126_, i_127_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7969.anInt7982 * 1923531495) {
			int i_129_ = 65;
			Interface61 interface61 = (Interface61) aClass560_4983.method9280(i_121_, i_126_, i_127_, 1991607128);
			if (null != interface61)
				i_129_ = ((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -57))).anInt7907 * -1116762301 + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, i_129_ * anIntArray10312[i_118_], i_129_ * anIntArray10313[i_118_], i, i_118_));
				if (class647_sub1_sub1_sub1.method392((short) 324))
					class647_sub1_sub1_sub1.method394(class178, -83947939);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, anIntArray10312[i_118_] * i_129_, anIntArray10313[i_118_] * i_129_, i, i_118_, i_119_, i_120_));
			aClass560_4983.method9267(i_121_, i_126_, i_127_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7983.anInt7982 * 1923531495) {
			int i_130_ = 33;
			Interface61 interface61 = (Interface61) aClass560_4983.method9280(i_121_, i_126_, i_127_, -1461188524);
			if (interface61 != null)
				i_130_ = (((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) 1))).anInt7907 * -1116762301 / 2 + 1);
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, anIntArray10312[i_118_] * i_130_, anIntArray10313[i_118_] * i_130_, i, 4 + i_118_));
				if (class647_sub1_sub1_sub1.method392((short) -6154))
					class647_sub1_sub1_sub1.method394(class178, -963744697);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, anIntArray10306[i_118_] * i_130_, anIntArray10315[i_118_] * i_130_, i, i_118_ + 4, i_119_, i_120_));
			aClass560_4983.method9267(i_121_, i_126_, i_127_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (Class607.aClass607_7980.anInt7982 * 1923531495 == i) {
			int i_131_ = 2 + i_118_ & 0x3;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, 0, 0, i, i_131_ + 4);
				if (class647_sub1_sub1_sub1.method392((short) 688))
					class647_sub1_sub1_sub1.method394(class178, -794545420);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, 0, 0, i, 4 + i_131_, i_119_, i_120_);
			aClass560_4983.method9267(i_121_, i_126_, i_127_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7972.anInt7982 * 1923531495) {
			int i_132_ = 2 + i_118_ & 0x3;
			int i_133_ = 33;
			Interface61 interface61 = (Interface61) aClass560_4983.method9280(i_121_, i_126_, i_127_, -880687492);
			if (null != interface61)
				i_133_ = (((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -22))).anInt7907 * -1116762301 / 2) + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			Class647_Sub1_Sub1 class647_sub1_sub1_134_;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, i_133_ * anIntArray10306[i_118_], anIntArray10315[i_118_] * i_133_, i, 4 + i_118_));
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1_135_ = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, 0, 0, i, 4 + i_132_);
				if (class647_sub1_sub1_sub1.method392((short) 617))
					class647_sub1_sub1_sub1.method394(class178, -542724939);
				if (class647_sub1_sub1_sub1_135_.method392((short) 7885))
					class647_sub1_sub1_sub1_135_.method394(class178, 1950584537);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
				class647_sub1_sub1_134_ = class647_sub1_sub1_sub1_135_;
			} else {
				Class647_Sub1_Sub1_Sub2 class647_sub1_sub1_sub2 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, anIntArray10306[i_118_] * i_133_, i_133_ * anIntArray10315[i_118_], i, i_118_ + 4, i_119_, i_120_));
				Class647_Sub1_Sub1_Sub2 class647_sub1_sub1_sub2_136_ = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5022, 0, 0, i, 4 + i_132_, i_119_, i_120_);
				class647_sub1_sub1 = class647_sub1_sub1_sub2;
				class647_sub1_sub1_134_ = class647_sub1_sub1_sub2_136_;
			}
			aClass560_4983.method9267(i_121_, i_126_, i_127_, class647_sub1_sub1, class647_sub1_sub1_134_, -2070066754);
			return true;
		}
		return false;
	}

	void method15801(Class178 class178, int i, int i_137_, int i_138_, int i_139_, byte i_140_) {
		Interface61 interface61 = method15802(i, i_137_, i_138_, i_139_, 1967320951);
		if (null != interface61) {
			Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) 77));
			int i_141_ = interface61.method69(1228790328);
			int i_142_ = interface61.method390(1259048815);
			if (class602.method9899((byte) 25))
				Class457.method7446(i, i_138_, i_139_, class602, -701989387);
			if (interface61.method392((short) 1810))
				interface61.method395(class178, -672979890);
			if (i_137_ == 0) {
				aClass560_4983.method9271(i, i_138_, i_139_, 1755727747);
				aClass560_4983.method9272(i, i_138_, i_139_, 1612024350);
				if (class602.anInt7873 * 1370816123 == 1) {
					if (i_142_ == 0)
						aClass560_4983.aClass544_7541.method9035(1, i, i_138_, i_139_);
					else if (i_142_ == 1)
						aClass560_4983.aClass544_7541.method9035(2, i, i_138_, i_139_ + 1);
					else if (i_142_ == 2)
						aClass560_4983.aClass544_7541.method9035(1, i, 1 + i_138_, i_139_);
					else if (3 == i_142_)
						aClass560_4983.aClass544_7541.method9035(2, i, i_138_, i_139_);
				}
			} else if (1 == i_137_) {
				aClass560_4983.method9350(i, i_138_, i_139_, (byte) 65);
				aClass560_4983.method9247(i, i_138_, i_139_, (byte) 10);
			} else if (2 == i_137_) {
				aClass560_4983.method9413(i, i_138_, i_139_, client.anInterface63_11296, 2138772399);
				if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_141_) {
					if ((i_142_ & 0x1) == 0)
						aClass560_4983.aClass544_7541.method9035(8, i, i_138_, i_139_);
					else
						aClass560_4983.aClass544_7541.method9035(16, i, i_138_, i_139_);
				}
			} else if (3 == i_137_)
				aClass560_4983.method9356(i, i_138_, i_139_, (byte) 0);
		}
	}

	Interface61 method15802(int i, int i_143_, int i_144_, int i_145_, int i_146_) {
		Interface61 interface61 = null;
		if (i_143_ == 0)
			interface61 = (Interface61) aClass560_4983.method9280(i, i_144_, i_145_, -1583198792);
		if (1 == i_143_)
			interface61 = (Interface61) aClass560_4983.method9284(i, i_144_, i_145_, (byte) 66);
		if (i_143_ == 2)
			interface61 = ((Interface61) aClass560_4983.method9295(i, i_144_, i_145_, client.anInterface63_11296, (byte) -92));
		if (i_143_ == 3)
			interface61 = (Interface61) aClass560_4983.method9398(i, i_144_, i_145_, -2144154172);
		return interface61;
	}

	public Class455_Sub1(Class560 class560, Class53_Sub18 class53_sub18, int i, int i_147_, int i_148_, boolean bool, Class451 class451, Class627 class627) {
		super(class560, i, i_147_, i_148_, bool, Class624.aClass53_Sub12_8131, Class519.aClass53_Sub5_7059, class451);
		aClass53_Sub18_10318 = class53_sub18;
		aClass627_10317 = class627;
	}

	public final void method15803(Class178 class178, boolean bool) {
		aClass560_4983.method9364();
		if (!bool) {
			if (1248554419 * anInt4990 > 1) {
				for (int i = 0; i < -1287541105 * anInt4991; i++) {
					for (int i_149_ = 0; i_149_ < anInt4984 * -215635651; i_149_++) {
						if (2 == ((aClass451_4982.aByteArrayArrayArray4962[1][i][i_149_]) & 0x2))
							aClass560_4983.method9300(i, i_149_, 1099456127);
					}
				}
			}
			for (int i = 0; i < 1248554419 * anInt4990; i++) {
				for (int i_150_ = 0; i_150_ <= anInt4984 * -215635651; i_150_++) {
					for (int i_151_ = 0; i_151_ <= anInt4991 * -1287541105; i_151_++) {
						if (0 != (aByteArrayArrayArray5001[i][i_151_][i_150_] & 0x4)) {
							int i_152_ = i_151_;
							int i_153_ = i_151_;
							int i_154_ = i_150_;
							int i_155_;
							for (i_155_ = i_150_; (i_154_ > 0 && ((aByteArrayArrayArray5001[i][i_151_][i_154_ - 1]) & 0x4) != 0 && i_155_ - i_154_ < 10); i_154_--) {
								/* empty */
							}
							for (/**/; (i_155_ < -215635651 * anInt4984 && ((aByteArrayArrayArray5001[i][i_151_][i_155_ + 1]) & 0x4) != 0 && i_155_ - i_154_ < 10); i_155_++) {
								/* empty */
							}
							while_47_: for (/**/; i_152_ > 0 && i_153_ - i_152_ < 10; i_152_--) {
								for (int i_156_ = i_154_; i_156_ <= i_155_; i_156_++) {
									if (((aByteArrayArrayArray5001[i][i_152_ - 1][i_156_]) & 0x4) == 0)
										break while_47_;
								}
							}
							while_48_: for (/**/; (i_153_ < anInt4991 * -1287541105 && i_153_ - i_152_ < 10); i_153_++) {
								for (int i_157_ = i_154_; i_157_ <= i_155_; i_157_++) {
									if (0 == ((aByteArrayArrayArray5001[i][1 + i_153_][i_157_]) & 0x4))
										break while_48_;
								}
							}
							if ((1 + (i_153_ - i_152_)) * (1 + (i_155_ - i_154_)) >= 4) {
								int i_158_ = (anIntArrayArrayArray5033[i][i_152_][i_154_]);
								aClass560_4983.aClass544_7541.method9017(4, i, i_152_ << 9, 512 + (i_153_ << 9), i_154_ << 9, (i_155_ << 9) + 512, i_158_, i_158_);
								for (int i_159_ = i_152_; i_159_ <= i_153_; i_159_++) {
									for (int i_160_ = i_154_; i_160_ <= i_155_; i_160_++)
										aByteArrayArrayArray5001[i][i_159_][i_160_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass560_4983.aClass544_7541.method9015();
		}
		aByteArrayArrayArray5001 = null;
	}

	public static final int method15804(Class53_Sub18 class53_sub18, byte[] is, int i, int i_161_, int i_162_, int i_163_, Class650 class650, Class650 class650_164_) {
		int i_165_ = 0;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_166_ = -1;
		for (;;) {
			int i_167_ = class523_sub34.method16495(200000000);
			if (0 == i_167_)
				break;
			i_166_ += i_167_;
			int i_168_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_169_ = class523_sub34.readUnsignedSmart(368514876);
					if (0 == i_169_)
						break;
					class523_sub34.readUnsignedByte(-84069859);
				} else {
					int i_170_ = class523_sub34.readUnsignedSmart(368514876);
					if (0 == i_170_)
						break;
					i_168_ += i_170_ - 1;
					int i_171_ = i_168_ & 0x3f;
					int i_172_ = i_168_ >> 6 & 0x3f;
					int i_173_ = class523_sub34.readUnsignedByte(1126523882) >> 2;
					int i_174_ = i_173_ & 0x3;
					i_173_ >>= 2;
					int i_175_ = i_172_ + i;
					int i_176_ = i_171_ + i_161_;
					Class602 class602 = (Class602) class53_sub18.getDefinition(i_166_, (byte) 32);
					int i_177_;
					int i_178_;
					if ((i_174_ & 0x1) == 0) {
						i_177_ = -1994552549 * class602.anInt7871;
						i_178_ = -1564896481 * class602.anInt7872;
					} else {
						i_177_ = -1564896481 * class602.anInt7872;
						i_178_ = -1994552549 * class602.anInt7871;
					}
					if (i_175_ < i_162_ && i_176_ < i_163_ && i_175_ + i_177_ >= 0 && i_176_ + i_178_ >= 0) {
						if ((1923531495 * Class607.aClass607_7985.anInt7982 != i_173_) || Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-577528046) != 0 || -344567467 * class602.anInt7874 != 0 || 972673777 * class602.anInt7852 == 1 || class602.aBool7905) {
							if (!class602.method9892(class650_164_, -1392483120)) {
								class650.anInt8380 = i_166_ * -1938569789;
								i_165_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_165_;
	}

	public static final int method15805(Class53_Sub18 class53_sub18, byte[] is, int i, int i_179_, int i_180_, int i_181_, Class650 class650, Class650 class650_182_) {
		int i_183_ = 0;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_184_ = -1;
		for (;;) {
			int i_185_ = class523_sub34.method16495(200000000);
			if (0 == i_185_)
				break;
			i_184_ += i_185_;
			int i_186_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_187_ = class523_sub34.readUnsignedSmart(368514876);
					if (0 == i_187_)
						break;
					class523_sub34.readUnsignedByte(1330404861);
				} else {
					int i_188_ = class523_sub34.readUnsignedSmart(368514876);
					if (0 == i_188_)
						break;
					i_186_ += i_188_ - 1;
					int i_189_ = i_186_ & 0x3f;
					int i_190_ = i_186_ >> 6 & 0x3f;
					int i_191_ = class523_sub34.readUnsignedByte(-1154699802) >> 2;
					int i_192_ = i_191_ & 0x3;
					i_191_ >>= 2;
					int i_193_ = i_190_ + i;
					int i_194_ = i_189_ + i_179_;
					Class602 class602 = (Class602) class53_sub18.getDefinition(i_184_, (byte) 18);
					int i_195_;
					int i_196_;
					if ((i_192_ & 0x1) == 0) {
						i_195_ = -1994552549 * class602.anInt7871;
						i_196_ = -1564896481 * class602.anInt7872;
					} else {
						i_195_ = -1564896481 * class602.anInt7872;
						i_196_ = -1994552549 * class602.anInt7871;
					}
					if (i_193_ < i_180_ && i_194_ < i_181_ && i_193_ + i_195_ >= 0 && i_194_ + i_196_ >= 0) {
						if ((1923531495 * Class607.aClass607_7985.anInt7982 != i_191_) || Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-595224415) != 0 || -344567467 * class602.anInt7874 != 0 || 972673777 * class602.anInt7852 == 1 || class602.aBool7905) {
							if (!class602.method9892(class650_182_, -1392483120)) {
								class650.anInt8380 = i_184_ * -1938569789;
								i_183_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_183_;
	}

	public final void method15806(Class178 class178, byte[] is, int i, int i_197_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_198_ = -1;
		for (;;) {
			int i_199_ = class523_sub34.method16495(200000000);
			if (i_199_ == 0)
				break;
			i_198_ += i_199_;
			int i_200_ = 0;
			for (;;) {
				int i_201_ = class523_sub34.readUnsignedSmart(368514876);
				if (0 == i_201_)
					break;
				i_200_ += i_201_ - 1;
				int i_202_ = i_200_ & 0x3f;
				int i_203_ = i_200_ >> 6 & 0x3f;
				int i_204_ = i_200_ >> 12;
				int i_205_ = class523_sub34.readUnsignedByte(438485294);
				int i_206_ = i_205_ >> 2;
				int i_207_ = i_205_ & 0x3;
				int i_208_ = i + i_203_;
				int i_209_ = i_197_ + i_202_;
				Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_198_, (byte) -35));
				int i_210_;
				int i_211_;
				if ((i_207_ & 0x1) == 0) {
					i_210_ = class602.anInt7871 * -1994552549;
					i_211_ = class602.anInt7872 * -1564896481;
				} else {
					i_210_ = -1564896481 * class602.anInt7872;
					i_211_ = class602.anInt7871 * -1994552549;
				}
				int i_212_ = i_208_ + i_210_;
				int i_213_ = i_211_ + i_209_;
				if (i_208_ < anInt4991 * -1287541105 && i_209_ < -215635651 * anInt4984 && i_212_ > 0 && i_213_ > 0 && ((1923531495 * Class607.aClass607_7970.anInt7982 == i_206_) || (i_206_ == 1923531495 * Class607.aClass607_7984.anInt7982) || (i_208_ > 0 && i_209_ > 0 && i_208_ < -1287541105 * anInt4991 - 1 && i_209_ < -215635651 * anInt4984 - 1)))
					method15798(class178, i_204_, i_204_, i_208_, i_209_, i_198_, i_207_, i_206_, -1, 0, 1954401014);
			}
		}
	}

	public final void method15807(Class178 class178, byte[] is, int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_220_ = -1;
		for (;;) {
			int i_221_ = class523_sub34.method16495(200000000);
			if (0 == i_221_)
				break;
			i_220_ += i_221_;
			int i_222_ = 0;
			for (;;) {
				int i_223_ = class523_sub34.readUnsignedSmart(368514876);
				if (i_223_ == 0)
					break;
				i_222_ += i_223_ - 1;
				int i_224_ = i_222_ & 0x3f;
				int i_225_ = i_222_ >> 6 & 0x3f;
				int i_226_ = i_222_ >> 12;
				int i_227_ = class523_sub34.readUnsignedByte(1006481247);
				int i_228_ = i_227_ >> 2;
				int i_229_ = i_227_ & 0x3;
				if (i_216_ == i_226_ && i_225_ >= i_217_ && i_225_ < 8 + i_217_ && i_224_ >= i_218_ && i_224_ < 8 + i_218_) {
					Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_220_, (byte) -69));
					int i_230_;
					int i_231_;
					if (0 == (i_229_ & 0x1)) {
						i_230_ = -1994552549 * class602.anInt7871;
						i_231_ = -1564896481 * class602.anInt7872;
					} else {
						i_230_ = class602.anInt7872 * -1564896481;
						i_231_ = class602.anInt7871 * -1994552549;
					}
					int i_232_ = (i_214_ + Class687_Sub26.method16957(i_225_ & 0x7, i_224_ & 0x7, i_219_, (-1994552549 * class602.anInt7871), (class602.anInt7872 * -1564896481), i_229_, -2122785685));
					int i_233_ = i_215_ + Class38.method1120(i_225_ & 0x7, i_224_ & 0x7, i_219_, (class602.anInt7871 * -1994552549), (-1564896481 * class602.anInt7872), i_229_, 16711680);
					int i_234_ = i_232_ + i_230_;
					int i_235_ = i_231_ + i_233_;
					if (i_232_ < -1287541105 * anInt4991 && i_233_ < -215635651 * anInt4984 && i_234_ > 0 && i_235_ > 0 && ((i_228_ == Class607.aClass607_7970.anInt7982 * 1923531495) || (Class607.aClass607_7984.anInt7982 * 1923531495 == i_228_) || (i_232_ > 0 && i_233_ > 0 && i_232_ < -1287541105 * anInt4991 - 1 && i_233_ < -215635651 * anInt4984 - 1)))
						method15798(class178, i, i, i_232_, i_233_, i_220_, i_219_ + i_229_ & 0x3, i_228_, -1, 0, -1366220585);
				}
			}
		}
	}

	public final void method15808(Class178 class178, byte[] is, int i, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_242_ = -1;
		for (;;) {
			int i_243_ = class523_sub34.method16495(200000000);
			if (0 == i_243_)
				break;
			i_242_ += i_243_;
			int i_244_ = 0;
			for (;;) {
				int i_245_ = class523_sub34.readUnsignedSmart(368514876);
				if (i_245_ == 0)
					break;
				i_244_ += i_245_ - 1;
				int i_246_ = i_244_ & 0x3f;
				int i_247_ = i_244_ >> 6 & 0x3f;
				int i_248_ = i_244_ >> 12;
				int i_249_ = class523_sub34.readUnsignedByte(2050376413);
				int i_250_ = i_249_ >> 2;
				int i_251_ = i_249_ & 0x3;
				if (i_238_ == i_248_ && i_247_ >= i_239_ && i_247_ < 8 + i_239_ && i_246_ >= i_240_ && i_246_ < 8 + i_240_) {
					Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_242_, (byte) -35));
					int i_252_;
					int i_253_;
					if (0 == (i_251_ & 0x1)) {
						i_252_ = -1994552549 * class602.anInt7871;
						i_253_ = -1564896481 * class602.anInt7872;
					} else {
						i_252_ = class602.anInt7872 * -1564896481;
						i_253_ = class602.anInt7871 * -1994552549;
					}
					int i_254_ = (i_236_ + Class687_Sub26.method16957(i_247_ & 0x7, i_246_ & 0x7, i_241_, (-1994552549 * class602.anInt7871), (class602.anInt7872 * -1564896481), i_251_, -1523286806));
					int i_255_ = i_237_ + Class38.method1120(i_247_ & 0x7, i_246_ & 0x7, i_241_, (class602.anInt7871 * -1994552549), (-1564896481 * class602.anInt7872), i_251_, 16711680);
					int i_256_ = i_254_ + i_252_;
					int i_257_ = i_253_ + i_255_;
					if (i_254_ < -1287541105 * anInt4991 && i_255_ < -215635651 * anInt4984 && i_256_ > 0 && i_257_ > 0 && ((i_250_ == Class607.aClass607_7970.anInt7982 * 1923531495) || (Class607.aClass607_7984.anInt7982 * 1923531495 == i_250_) || (i_254_ > 0 && i_255_ > 0 && i_254_ < -1287541105 * anInt4991 - 1 && i_255_ < -215635651 * anInt4984 - 1)))
						method15798(class178, i, i, i_254_, i_255_, i_242_, i_241_ + i_251_ & 0x3, i_250_, -1, 0, -384494345);
				}
			}
		}
	}

	public final void method15809(Class178 class178, byte[] is, int i, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_264_ = -1;
		for (;;) {
			int i_265_ = class523_sub34.method16495(200000000);
			if (0 == i_265_)
				break;
			i_264_ += i_265_;
			int i_266_ = 0;
			for (;;) {
				int i_267_ = class523_sub34.readUnsignedSmart(368514876);
				if (i_267_ == 0)
					break;
				i_266_ += i_267_ - 1;
				int i_268_ = i_266_ & 0x3f;
				int i_269_ = i_266_ >> 6 & 0x3f;
				int i_270_ = i_266_ >> 12;
				int i_271_ = class523_sub34.readUnsignedByte(352980653);
				int i_272_ = i_271_ >> 2;
				int i_273_ = i_271_ & 0x3;
				if (i_260_ == i_270_ && i_269_ >= i_261_ && i_269_ < 8 + i_261_ && i_268_ >= i_262_ && i_268_ < 8 + i_262_) {
					Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_264_, (byte) 2));
					int i_274_;
					int i_275_;
					if (0 == (i_273_ & 0x1)) {
						i_274_ = -1994552549 * class602.anInt7871;
						i_275_ = -1564896481 * class602.anInt7872;
					} else {
						i_274_ = class602.anInt7872 * -1564896481;
						i_275_ = class602.anInt7871 * -1994552549;
					}
					int i_276_ = (i_258_ + Class687_Sub26.method16957(i_269_ & 0x7, i_268_ & 0x7, i_263_, (-1994552549 * class602.anInt7871), (class602.anInt7872 * -1564896481), i_273_, -2028091323));
					int i_277_ = i_259_ + Class38.method1120(i_269_ & 0x7, i_268_ & 0x7, i_263_, (class602.anInt7871 * -1994552549), (-1564896481 * class602.anInt7872), i_273_, 16711680);
					int i_278_ = i_276_ + i_274_;
					int i_279_ = i_275_ + i_277_;
					if (i_276_ < -1287541105 * anInt4991 && i_277_ < -215635651 * anInt4984 && i_278_ > 0 && i_279_ > 0 && ((i_272_ == Class607.aClass607_7970.anInt7982 * 1923531495) || (Class607.aClass607_7984.anInt7982 * 1923531495 == i_272_) || (i_276_ > 0 && i_277_ > 0 && i_276_ < -1287541105 * anInt4991 - 1 && i_277_ < -215635651 * anInt4984 - 1)))
						method15798(class178, i, i, i_276_, i_277_, i_264_, i_263_ + i_273_ & 0x3, i_272_, -1, 0, 1912398661);
				}
			}
		}
	}

	public final void method15810(Class178 class178, byte[] is, int i, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_, int i_285_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_286_ = -1;
		for (;;) {
			int i_287_ = class523_sub34.method16495(200000000);
			if (0 == i_287_)
				break;
			i_286_ += i_287_;
			int i_288_ = 0;
			for (;;) {
				int i_289_ = class523_sub34.readUnsignedSmart(368514876);
				if (i_289_ == 0)
					break;
				i_288_ += i_289_ - 1;
				int i_290_ = i_288_ & 0x3f;
				int i_291_ = i_288_ >> 6 & 0x3f;
				int i_292_ = i_288_ >> 12;
				int i_293_ = class523_sub34.readUnsignedByte(1763794009);
				int i_294_ = i_293_ >> 2;
				int i_295_ = i_293_ & 0x3;
				if (i_282_ == i_292_ && i_291_ >= i_283_ && i_291_ < 8 + i_283_ && i_290_ >= i_284_ && i_290_ < 8 + i_284_) {
					Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_286_, (byte) -2));
					int i_296_;
					int i_297_;
					if (0 == (i_295_ & 0x1)) {
						i_296_ = -1994552549 * class602.anInt7871;
						i_297_ = -1564896481 * class602.anInt7872;
					} else {
						i_296_ = class602.anInt7872 * -1564896481;
						i_297_ = class602.anInt7871 * -1994552549;
					}
					int i_298_ = (i_280_ + Class687_Sub26.method16957(i_291_ & 0x7, i_290_ & 0x7, i_285_, (-1994552549 * class602.anInt7871), (class602.anInt7872 * -1564896481), i_295_, -1981150707));
					int i_299_ = i_281_ + Class38.method1120(i_291_ & 0x7, i_290_ & 0x7, i_285_, (class602.anInt7871 * -1994552549), (-1564896481 * class602.anInt7872), i_295_, 16711680);
					int i_300_ = i_298_ + i_296_;
					int i_301_ = i_297_ + i_299_;
					if (i_298_ < -1287541105 * anInt4991 && i_299_ < -215635651 * anInt4984 && i_300_ > 0 && i_301_ > 0 && ((i_294_ == Class607.aClass607_7970.anInt7982 * 1923531495) || (Class607.aClass607_7984.anInt7982 * 1923531495 == i_294_) || (i_298_ > 0 && i_299_ > 0 && i_298_ < -1287541105 * anInt4991 - 1 && i_299_ < -215635651 * anInt4984 - 1)))
						method15798(class178, i, i, i_298_, i_299_, i_286_, i_285_ + i_295_ & 0x3, i_294_, -1, 0, 399007595);
				}
			}
		}
	}

	public final void method15811(Class178 class178, byte[] is, int i, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_308_ = -1;
		for (;;) {
			int i_309_ = class523_sub34.method16495(200000000);
			if (0 == i_309_)
				break;
			i_308_ += i_309_;
			int i_310_ = 0;
			for (;;) {
				int i_311_ = class523_sub34.readUnsignedSmart(368514876);
				if (i_311_ == 0)
					break;
				i_310_ += i_311_ - 1;
				int i_312_ = i_310_ & 0x3f;
				int i_313_ = i_310_ >> 6 & 0x3f;
				int i_314_ = i_310_ >> 12;
				int i_315_ = class523_sub34.readUnsignedByte(2048426501);
				int i_316_ = i_315_ >> 2;
				int i_317_ = i_315_ & 0x3;
				if (i_304_ == i_314_ && i_313_ >= i_305_ && i_313_ < 8 + i_305_ && i_312_ >= i_306_ && i_312_ < 8 + i_306_) {
					Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(i_308_, (byte) -2));
					int i_318_;
					int i_319_;
					if (0 == (i_317_ & 0x1)) {
						i_318_ = -1994552549 * class602.anInt7871;
						i_319_ = -1564896481 * class602.anInt7872;
					} else {
						i_318_ = class602.anInt7872 * -1564896481;
						i_319_ = class602.anInt7871 * -1994552549;
					}
					int i_320_ = (i_302_ + Class687_Sub26.method16957(i_313_ & 0x7, i_312_ & 0x7, i_307_, (-1994552549 * class602.anInt7871), (class602.anInt7872 * -1564896481), i_317_, -1700671318));
					int i_321_ = i_303_ + Class38.method1120(i_313_ & 0x7, i_312_ & 0x7, i_307_, (class602.anInt7871 * -1994552549), (-1564896481 * class602.anInt7872), i_317_, 16711680);
					int i_322_ = i_320_ + i_318_;
					int i_323_ = i_319_ + i_321_;
					if (i_320_ < -1287541105 * anInt4991 && i_321_ < -215635651 * anInt4984 && i_322_ > 0 && i_323_ > 0 && ((i_316_ == Class607.aClass607_7970.anInt7982 * 1923531495) || (Class607.aClass607_7984.anInt7982 * 1923531495 == i_316_) || (i_320_ > 0 && i_321_ > 0 && i_320_ < -1287541105 * anInt4991 - 1 && i_321_ < -215635651 * anInt4984 - 1)))
						method15798(class178, i, i, i_320_, i_321_, i_308_, i_307_ + i_317_ & 0x3, i_316_, -1, 0, 356496213);
				}
			}
		}
	}

	Interface61 method15812(int i, int i_324_, int i_325_, int i_326_) {
		Interface61 interface61 = null;
		if (i_324_ == 0)
			interface61 = (Interface61) aClass560_4983.method9280(i, i_325_, i_326_, 516931276);
		if (1 == i_324_)
			interface61 = (Interface61) aClass560_4983.method9284(i, i_325_, i_326_, (byte) 113);
		if (i_324_ == 2)
			interface61 = ((Interface61) aClass560_4983.method9295(i, i_325_, i_326_, client.anInterface63_11296, (byte) -80));
		if (i_324_ == 3)
			interface61 = (Interface61) aClass560_4983.method9398(i, i_325_, i_326_, -1219152610);
		return interface61;
	}

	public final void method15813(Class178 class178, Class523_Sub34 class523_sub34, int i, int i_327_, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_, int i_333_) {
		if (!aBool5022) {
			class523_sub34.anInt10661 += 1518125784;
			boolean bool = false;
			Class632 class632 = null;
			boolean bool_334_ = false;
			int i_335_ = 8 * (i_330_ & 0x7);
			int i_336_ = (i_331_ & 0x7) * 8;
			while (class523_sub34.anInt10661 * 2349011 < class523_sub34.aByteArray10658.length) {
				int i_337_ = class523_sub34.readUnsignedByte(795224369);
				if (0 == i_337_) {
					if (null == class632)
						class632 = new Class632(class523_sub34, aClass627_10317);
					else
						class632.method10358(class523_sub34, aClass627_10317, 2102260951);
				} else if (1 == i_337_) {
					int i_338_ = class523_sub34.readUnsignedByte(1315445392);
					if (i_338_ > 0) {
						for (int i_339_ = 0; i_339_ < i_338_; i_339_++) {
							Class550 class550 = new Class550(class178, (aClass560_4983.anInt7496 * -906898059), class523_sub34, 2);
							if (-604020019 * class550.anInt7351 == 31) {
								Class77 class77 = ((Class77) (ItemDefinitions.aClass53_Sub21_172.getDefinition(class523_sub34.readUnsignedShort(-1659915665), (byte) 47)));
								class550.method9119(class77.anInt857 * -425275105, class77.anInt856 * -116788511, class77.anInt854 * -964659743, class77.anInt855 * 705984453, (byte) 55);
							}
							if (class178.method3267() > 0) {
								Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
								int i_340_ = (class523_sub20.method16062(2131811589) >> 9);
								int i_341_ = (class523_sub20.method16065(2123005639) >> 9);
								if (1991405609 * class550.anInt7352 == i_329_ && i_340_ >= i_335_ && i_340_ < 8 + i_335_ && i_341_ >= i_336_ && i_341_ < 8 + i_336_) {
									int i_342_ = ((i_327_ << 9) + (Class545.method9065((class523_sub20.method16062(2131811589) & 0xfff), (class523_sub20.method16065(1686450099) & 0xfff), i_332_, (byte) 108)));
									int i_343_ = ((i_328_ << 9) + (Class290.method5214((class523_sub20.method16062(2131811589) & 0xfff), (class523_sub20.method16065(2075409703) & 0xfff), i_332_, (byte) -62)));
									i_340_ = i_342_ >> 9;
									i_341_ = i_343_ >> 9;
									if (i_340_ >= 0 && i_341_ >= 0 && i_340_ < anInt4991 * -1287541105 && i_341_ < -215635651 * anInt4984) {
										class550.anInt7352 = i * -1939067879;
										class523_sub20.method16085(i_342_, ((anIntArrayArrayArray5033[(class550.anInt7352 * 1991405609)][i_340_][i_341_]) - class523_sub20.method16091(658337115)), i_343_, 1804985357);
										aClass560_4983.method9262(class550, -1138897791);
									}
								}
							}
						}
					}
				} else if (i_337_ == 2) {
					if (null == class632)
						class632 = new Class632();
					class632.method10384(class523_sub34, 1811761771);
				} else if (3 == i_337_) {
					if (null == class632)
						class632 = new Class632();
					class632.method10353(class523_sub34, -1381586175);
				} else if (128 == i_337_) {
					if (null == class632)
						class632 = new Class632();
					class632.method10387(class523_sub34, aClass627_10317, -1762989401);
				} else if (i_337_ == 129) {
					if (null == aByteArrayArrayArray4995)
						aByteArrayArrayArray4995 = new byte[4][][];
					for (int i_344_ = 0; i_344_ < 4; i_344_++) {
						byte i_345_ = class523_sub34.readByte((short) -6805);
						if (0 == i_345_ && null != aByteArrayArrayArray4995[i]) {
							if (i_344_ <= i_329_) {
								int i_346_ = i_327_;
								int i_347_ = 7 + i_327_;
								int i_348_ = i_328_;
								int i_349_ = 7 + i_328_;
								if (i_346_ < 0)
									i_346_ = 0;
								else if (i_346_ >= -1287541105 * anInt4991)
									i_346_ = anInt4991 * -1287541105;
								if (i_347_ < 0)
									i_347_ = 0;
								else if (i_347_ >= anInt4991 * -1287541105)
									i_347_ = anInt4991 * -1287541105;
								if (i_348_ < 0)
									i_348_ = 0;
								else if (i_348_ >= -215635651 * anInt4984)
									i_348_ = -215635651 * anInt4984;
								if (i_349_ < 0)
									i_349_ = 0;
								else if (i_349_ >= -215635651 * anInt4984)
									i_349_ = anInt4984 * -215635651;
								for (/**/; i_346_ < i_347_; i_346_++) {
									for (/**/; i_348_ < i_349_; i_348_++)
										aByteArrayArrayArray4995[i][i_346_][i_348_] = (byte) 0;
								}
							}
						} else if (1 == i_345_) {
							if (null == aByteArrayArrayArray4995[i])
								aByteArrayArrayArray4995[i] = (new byte[1 + anInt4991 * -1287541105][1 + -215635651 * anInt4984]);
							for (int i_350_ = 0; i_350_ < 64; i_350_ += 4) {
								for (int i_351_ = 0; i_351_ < 64; i_351_ += 4) {
									byte i_352_ = class523_sub34.readByte((short) -6158);
									if (i_344_ <= i_329_) {
										for (int i_353_ = i_350_; i_353_ < 4 + i_350_; i_353_++) {
											for (int i_354_ = i_351_; i_354_ < 4 + i_351_; i_354_++) {
												if (i_353_ >= i_335_ && i_353_ < i_335_ + 8 && i_354_ >= i_336_ && i_354_ < 8 + i_336_) {
													int i_355_ = (i_327_ + (Class283.method5136(i_353_ & 0x7, i_354_ & 0x7, i_332_, (byte) 0)));
													int i_356_ = (i_328_ + (Class412.method6646(i_353_ & 0x7, i_354_ & 0x7, i_332_, 2142136715)));
													if (i_355_ >= 0 && (i_355_ < (anInt4991 * -1287541105)) && i_356_ >= 0 && (i_356_ < (anInt4984 * -215635651))) {
														aByteArrayArrayArray4995[i][i_355_][i_356_] = i_352_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (2 == i_345_)
							continue;
					}
				} else if (130 == i_337_)
					bool_334_ = true;
				else
					throw new IllegalStateException("");
			}
			if (class632 != null)
				aClass627_10317.method10233(i_327_ >> 3, i_328_ >> 3, class632, (byte) -21);
			Class181.method3539(i_327_ >> 3, i_328_ >> 3, bool_334_, 1029797510);
			if (!bool && aByteArrayArrayArray4995 != null && null != aByteArrayArrayArray4995[i]) {
				int i_357_ = 7 + i_327_;
				int i_358_ = i_328_ + 7;
				for (int i_359_ = i_327_; i_359_ < i_357_; i_359_++) {
					for (int i_360_ = i_328_; i_360_ < i_358_; i_360_++)
						aByteArrayArrayArray4995[i][i_359_][i_360_] = (byte) 0;
				}
			}
		}
	}

	boolean method15814(Class178 class178, int i, int i_361_, boolean bool, Class602 class602, int i_362_, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_, int i_369_, int i_370_, boolean bool_371_, Class142 class142, int i_372_, int i_373_) {
		if (1923531495 * Class607.aClass607_7974.anInt7982 == i) {
			int i_374_ = 1370816123 * class602.anInt7873;
			if (aBool10307 && class602.anInt7873 * 1370816123 == -1)
				i_374_ = 1;
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_, bool_371_);
				if (class647_sub1_sub4_sub1.method392((short) 7546))
					class647_sub1_sub4_sub1.method394(class178, -528111118);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_, i_362_, i_363_);
			aClass560_4983.method9266(i_364_, i_369_, i_370_, class647_sub1_sub4, null, 2080140678);
			if (0 == i_361_) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_369_, i_370_, 50);
					class142.method2320(i_369_, i_370_ + 1, 50);
				}
				if (i_374_ == 1 && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(1, i_364_, i_369_, i_370_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
			} else if (1 == i_361_) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_369_, i_370_ + 1, 50);
					class142.method2320(i_369_ + 1, 1 + i_370_, 50);
				}
				if (1 == i_374_ && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(2, i_364_, i_369_, i_370_ + 1, 1491131641 * class602.anInt7879, -(class602.anInt7880 * -692200661));
			} else if (i_361_ == 2) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(1 + i_369_, i_370_, 50);
					class142.method2320(1 + i_369_, i_370_ + 1, 50);
				}
				if (1 == i_374_ && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(1, i_364_, 1 + i_369_, i_370_, class602.anInt7879 * 1491131641, -(class602.anInt7880 * -692200661));
			} else if (i_361_ == 3) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_369_, i_370_, 50);
					class142.method2320(1 + i_369_, i_370_, 50);
				}
				if (i_374_ == 1 && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(2, i_364_, i_369_, i_370_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
			}
			if (class602.anInt7907 * -1116762301 != 64)
				aClass560_4983.method9269(i_364_, i_369_, i_370_, class602.anInt7907 * -1116762301, (short) -11924);
			return true;
		}
		if (i == Class607.aClass607_7964.anInt7982 * 1923531495) {
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_, bool_371_);
				if (class647_sub1_sub4_sub1.method392((short) -7190))
					class647_sub1_sub4_sub1.method394(class178, -1222035737);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_, i_362_, i_363_);
			aClass560_4983.method9266(i_364_, i_369_, i_370_, class647_sub1_sub4, null, 996056586);
			if (class602.aBool7895 && aBool4994) {
				if (i_361_ == 0)
					class142.method2320(i_369_, 1 + i_370_, 50);
				else if (1 == i_361_)
					class142.method2320(1 + i_369_, 1 + i_370_, 50);
				else if (i_361_ == 2)
					class142.method2320(1 + i_369_, i_370_, 50);
				else if (3 == i_361_)
					class142.method2320(i_369_, i_370_, 50);
			}
			return true;
		}
		if (i == 1923531495 * Class607.aClass607_7965.anInt7982) {
			int i_375_ = i_361_ + 1 & 0x3;
			Class647_Sub1_Sub4 class647_sub1_sub4;
			Class647_Sub1_Sub4 class647_sub1_sub4_376_;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, 4 + i_361_, bool_371_);
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1_377_ = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_375_, bool_371_);
				if (class647_sub1_sub4_sub1.method392((short) 5868))
					class647_sub1_sub4_sub1.method394(class178, -568723339);
				if (class647_sub1_sub4_sub1_377_.method392((short) 4615))
					class647_sub1_sub4_sub1_377_.method394(class178, 680943425);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
				class647_sub1_sub4_376_ = class647_sub1_sub4_sub1_377_;
			} else {
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_ + 4, i_362_, i_363_);
				class647_sub1_sub4_376_ = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_375_, i_362_, i_363_);
			}
			aClass560_4983.method9266(i_364_, i_369_, i_370_, class647_sub1_sub4, class647_sub1_sub4_376_, 2046559377);
			if ((1 == class602.anInt7873 * 1370816123 || aBool10307 && -1 == 1370816123 * class602.anInt7873) && !aBool5022) {
				if (i_361_ == 0) {
					aClass560_4983.aClass544_7541.method9046(1, i_364_, i_369_, i_370_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_364_, i_369_, i_370_ + 1, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
				} else if (i_361_ == 1) {
					aClass560_4983.aClass544_7541.method9046(1, i_364_, i_369_ + 1, i_370_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_364_, i_369_, 1 + i_370_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
				} else if (2 == i_361_) {
					aClass560_4983.aClass544_7541.method9046(1, i_364_, 1 + i_369_, i_370_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
					aClass560_4983.aClass544_7541.method9046(2, i_364_, i_369_, i_370_, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
				} else if (3 == i_361_) {
					aClass560_4983.aClass544_7541.method9046(1, i_364_, i_369_, i_370_, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_364_, i_369_, i_370_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
				}
			}
			if (64 != class602.anInt7907 * -1116762301)
				aClass560_4983.method9269(i_364_, i_369_, i_370_, class602.anInt7907 * -1116762301, (short) -15114);
			return true;
		}
		if (1923531495 * Class607.aClass607_7966.anInt7982 == i) {
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_, bool_371_);
				if (class647_sub1_sub4_sub1.method392((short) -5910))
					class647_sub1_sub4_sub1.method394(class178, 1422288568);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i, i_361_, i_362_, i_363_);
			aClass560_4983.method9266(i_364_, i_369_, i_370_, class647_sub1_sub4, null, 1795094127);
			if (class602.aBool7895 && aBool4994) {
				if (0 == i_361_)
					class142.method2320(i_369_, 1 + i_370_, 50);
				else if (i_361_ == 1)
					class142.method2320(i_369_ + 1, 1 + i_370_, 50);
				else if (i_361_ == 2)
					class142.method2320(i_369_ + 1, i_370_, 50);
				else if (i_361_ == 3)
					class142.method2320(i_369_, i_370_, 50);
			}
			return true;
		}
		if (1923531495 * Class607.aClass607_7971.anInt7982 == i) {
			Class647_Sub1_Sub3 class647_sub1_sub3;
			if (bool) {
				Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i_369_, i_369_, i_370_, i_370_, i, i_361_, bool_371_, true);
				if (class647_sub1_sub3_sub3.method392((short) -23505))
					class647_sub1_sub3_sub3.method394(class178, -431703209);
				class647_sub1_sub3 = class647_sub1_sub3_sub3;
			} else
				class647_sub1_sub3 = new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_364_, i_365_, i_366_, i_367_, i_368_, aBool5022, i_369_, i_369_ + i_372_ - 1, i_370_, i_373_ + i_370_ - 1, i, i_361_, i_362_, i_363_, true);
			aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 29);
			if (1 == 1370816123 * class602.anInt7873 && !aBool5022) {
				int i_378_;
				if ((i_361_ & 0x1) == 0)
					i_378_ = 8;
				else
					i_378_ = 16;
				aClass560_4983.aClass544_7541.method9046(i_378_, i_364_, i_369_, i_370_, 1491131641 * class602.anInt7879, 0);
			}
			if (64 != -1116762301 * class602.anInt7907)
				aClass560_4983.method9269(i_364_, i_369_, i_370_, class602.anInt7907 * -1116762301, (short) 4480);
			return true;
		}
		return false;
	}

	boolean method15815(Class178 class178, int i, int i_379_, boolean bool, Class602 class602, int i_380_, int i_381_, int i_382_, int i_383_, int i_384_, int i_385_, int i_386_, int i_387_, int i_388_) {
		if (i == Class607.aClass607_7968.anInt7982 * 1923531495) {
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, 0, 0, i, i_379_);
				if (class647_sub1_sub1_sub1.method392((short) -20015))
					class647_sub1_sub1_sub1.method394(class178, -222309063);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, 0, 0, i, i_379_, i_380_, i_381_);
			aClass560_4983.method9267(i_382_, i_387_, i_388_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7969.anInt7982 * 1923531495) {
			int i_389_ = 65;
			Interface61 interface61 = (Interface61) aClass560_4983.method9280(i_382_, i_387_, i_388_, 789989631);
			if (null != interface61)
				i_389_ = ((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -30))).anInt7907 * -1116762301 + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, i_389_ * anIntArray10312[i_379_], i_389_ * anIntArray10313[i_379_], i, i_379_));
				if (class647_sub1_sub1_sub1.method392((short) 1348))
					class647_sub1_sub1_sub1.method394(class178, 1427982125);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, anIntArray10312[i_379_] * i_389_, anIntArray10313[i_379_] * i_389_, i, i_379_, i_380_, i_381_));
			aClass560_4983.method9267(i_382_, i_387_, i_388_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7983.anInt7982 * 1923531495) {
			int i_390_ = 33;
			Interface61 interface61 = (Interface61) aClass560_4983.method9280(i_382_, i_387_, i_388_, 553706988);
			if (interface61 != null)
				i_390_ = (((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -67))).anInt7907 * -1116762301 / 2) + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, anIntArray10312[i_379_] * i_390_, anIntArray10313[i_379_] * i_390_, i, 4 + i_379_));
				if (class647_sub1_sub1_sub1.method392((short) -26883))
					class647_sub1_sub1_sub1.method394(class178, -419917100);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, anIntArray10306[i_379_] * i_390_, anIntArray10315[i_379_] * i_390_, i, i_379_ + 4, i_380_, i_381_));
			aClass560_4983.method9267(i_382_, i_387_, i_388_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (Class607.aClass607_7980.anInt7982 * 1923531495 == i) {
			int i_391_ = 2 + i_379_ & 0x3;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, 0, 0, i, i_391_ + 4);
				if (class647_sub1_sub1_sub1.method392((short) 4744))
					class647_sub1_sub1_sub1.method394(class178, 1955469597);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
			} else
				class647_sub1_sub1 = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, 0, 0, i, 4 + i_391_, i_380_, i_381_);
			aClass560_4983.method9267(i_382_, i_387_, i_388_, class647_sub1_sub1, null, -2070066754);
			return true;
		}
		if (i == Class607.aClass607_7972.anInt7982 * 1923531495) {
			int i_392_ = 2 + i_379_ & 0x3;
			int i_393_ = 33;
			Interface61 interface61 = (Interface61) aClass560_4983.method9280(i_382_, i_387_, i_388_, 393137438);
			if (null != interface61)
				i_393_ = (((Class602) (aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -45))).anInt7907 * -1116762301 / 2) + 1;
			Class647_Sub1_Sub1 class647_sub1_sub1;
			Class647_Sub1_Sub1 class647_sub1_sub1_394_;
			if (bool) {
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1 = (new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, i_393_ * anIntArray10306[i_379_], anIntArray10315[i_379_] * i_393_, i, 4 + i_379_));
				Class647_Sub1_Sub1_Sub1 class647_sub1_sub1_sub1_395_ = new Class647_Sub1_Sub1_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, 0, 0, i, 4 + i_392_);
				if (class647_sub1_sub1_sub1.method392((short) -897))
					class647_sub1_sub1_sub1.method394(class178, 1889225470);
				if (class647_sub1_sub1_sub1_395_.method392((short) -22479))
					class647_sub1_sub1_sub1_395_.method394(class178, 1822990701);
				class647_sub1_sub1 = class647_sub1_sub1_sub1;
				class647_sub1_sub1_394_ = class647_sub1_sub1_sub1_395_;
			} else {
				Class647_Sub1_Sub1_Sub2 class647_sub1_sub1_sub2 = (new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, anIntArray10306[i_379_] * i_393_, i_393_ * anIntArray10315[i_379_], i, i_379_ + 4, i_380_, i_381_));
				Class647_Sub1_Sub1_Sub2 class647_sub1_sub1_sub2_396_ = new Class647_Sub1_Sub1_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_382_, i_383_, i_384_, i_385_, i_386_, aBool5022, 0, 0, i, 4 + i_392_, i_380_, i_381_);
				class647_sub1_sub1 = class647_sub1_sub1_sub2;
				class647_sub1_sub1_394_ = class647_sub1_sub1_sub2_396_;
			}
			aClass560_4983.method9267(i_382_, i_387_, i_388_, class647_sub1_sub1, class647_sub1_sub1_394_, -2070066754);
			return true;
		}
		return false;
	}

	public final void method15816(Class178 class178, Class523_Sub34 class523_sub34, int i, int i_397_, int i_398_) {
		if (!aBool5022) {
			class523_sub34.anInt10661 += 1518125784;
			boolean bool = false;
			Class632 class632 = null;
			boolean bool_399_ = false;
			while (class523_sub34.anInt10661 * 2349011 < class523_sub34.aByteArray10658.length) {
				int i_400_ = class523_sub34.readUnsignedByte(-2112025451);
				if (0 == i_400_) {
					if (class632 == null)
						class632 = new Class632(class523_sub34, aClass627_10317);
					else
						class632.method10358(class523_sub34, aClass627_10317, 1973879025);
				} else if (1 == i_400_) {
					int i_401_ = class523_sub34.readUnsignedByte(-896192697);
					if (i_401_ > 0) {
						for (int i_402_ = 0; i_402_ < i_401_; i_402_++) {
							Class550 class550 = new Class550(class178, (aClass560_4983.anInt7496 * -906898059), class523_sub34, 2);
							if (31 == class550.anInt7351 * -604020019) {
								Class77 class77 = ((Class77) (ItemDefinitions.aClass53_Sub21_172.getDefinition(class523_sub34.readUnsignedShort(-1356727029), (byte) 0)));
								class550.method9119(class77.anInt857 * -425275105, class77.anInt856 * -116788511, -964659743 * class77.anInt854, 705984453 * class77.anInt855, (byte) 78);
							}
							if (class178.method3267() > 0) {
								Class523_Sub20 class523_sub20 = class550.aClass523_Sub20_7349;
								int i_403_ = (class523_sub20.method16062(2131811589) + (i << 9));
								int i_404_ = (class523_sub20.method16065(1705229013) + (i_397_ << 9));
								int i_405_ = i_403_ >> 9;
								int i_406_ = i_404_ >> 9;
								if (i_405_ >= 0 && i_406_ >= 0 && i_405_ < -1287541105 * anInt4991 && i_406_ < anInt4984 * -215635651) {
									class523_sub20.method16085(i_403_, ((anIntArrayArrayArray5033[1991405609 * class550.anInt7352][i_405_][i_406_]) - class523_sub20.method16091(-548110624)), i_404_, -99732974);
									aClass560_4983.method9262(class550, -1780915095);
								}
							}
						}
					}
				} else if (i_400_ == 2) {
					if (null == class632)
						class632 = new Class632();
					class632.method10384(class523_sub34, 1871493823);
				} else if (i_400_ == 3) {
					if (null == class632)
						class632 = new Class632();
					class632.method10353(class523_sub34, -1381586175);
				} else if (128 == i_400_) {
					if (null == class632)
						class632 = new Class632();
					class632.method10387(class523_sub34, aClass627_10317, 1172544704);
				} else if (i_400_ == 129) {
					if (null == aByteArrayArrayArray4995)
						aByteArrayArrayArray4995 = new byte[4][][];
					for (int i_407_ = 0; i_407_ < 4; i_407_++) {
						byte i_408_ = class523_sub34.readByte((short) -2613);
						if (0 == i_408_ && aByteArrayArrayArray4995[i_407_] != null) {
							int i_409_ = i;
							int i_410_ = 64 + i;
							int i_411_ = i_397_;
							int i_412_ = 64 + i_397_;
							if (i_409_ < 0)
								i_409_ = 0;
							else if (i_409_ >= -1287541105 * anInt4991)
								i_409_ = -1287541105 * anInt4991;
							if (i_410_ < 0)
								i_410_ = 0;
							else if (i_410_ >= -1287541105 * anInt4991)
								i_410_ = anInt4991 * -1287541105;
							if (i_411_ < 0)
								i_411_ = 0;
							else if (i_411_ >= anInt4984 * -215635651)
								i_411_ = -215635651 * anInt4984;
							if (i_412_ < 0)
								i_412_ = 0;
							else if (i_412_ >= anInt4984 * -215635651)
								i_412_ = anInt4984 * -215635651;
							for (/**/; i_409_ < i_410_; i_409_++) {
								for (/**/; i_411_ < i_412_; i_411_++)
									aByteArrayArrayArray4995[i_407_][i_409_][i_411_] = (byte) 0;
							}
						} else if (i_408_ == 1) {
							if (null == aByteArrayArrayArray4995[i_407_])
								aByteArrayArrayArray4995[i_407_] = (new byte[1 + anInt4991 * -1287541105][1 + -215635651 * anInt4984]);
							for (int i_413_ = 0; i_413_ < 64; i_413_ += 4) {
								for (int i_414_ = 0; i_414_ < 64; i_414_ += 4) {
									byte i_415_ = class523_sub34.readByte((short) -20651);
									for (int i_416_ = i_413_ + i; i_416_ < i + i_413_ + 4; i_416_++) {
										for (int i_417_ = i_414_ + i_397_; i_417_ < 4 + (i_414_ + i_397_); i_417_++) {
											if (i_416_ >= 0 && (i_416_ < anInt4991 * -1287541105) && i_417_ >= 0 && (i_417_ < -215635651 * anInt4984))
												aByteArrayArrayArray4995[i_407_][i_416_][i_417_] = i_415_;
										}
									}
								}
							}
						} else if (i_408_ == 2) {
							if (aByteArrayArrayArray4995[i_407_] == null)
								aByteArrayArrayArray4995[i_407_] = (new byte[-1287541105 * anInt4991 + 1][1 + -215635651 * anInt4984]);
							if (i_407_ > 0) {
								int i_418_ = i;
								int i_419_ = i + 64;
								int i_420_ = i_397_;
								int i_421_ = 64 + i_397_;
								if (i_418_ < 0)
									i_418_ = 0;
								else if (i_418_ >= anInt4991 * -1287541105)
									i_418_ = anInt4991 * -1287541105;
								if (i_419_ < 0)
									i_419_ = 0;
								else if (i_419_ >= anInt4991 * -1287541105)
									i_419_ = -1287541105 * anInt4991;
								if (i_420_ < 0)
									i_420_ = 0;
								else if (i_420_ >= anInt4984 * -215635651)
									i_420_ = anInt4984 * -215635651;
								if (i_421_ < 0)
									i_421_ = 0;
								else if (i_421_ >= anInt4984 * -215635651)
									i_421_ = -215635651 * anInt4984;
								for (/**/; i_418_ < i_419_; i_418_++) {
									for (/**/; i_420_ < i_421_; i_420_++)
										aByteArrayArrayArray4995[i_407_][i_418_][i_420_] = (aByteArrayArrayArray4995[i_407_ - 1][i_418_][i_420_]);
								}
							}
						}
					}
					bool = true;
				} else if (i_400_ == 130)
					bool_399_ = true;
				else
					throw new IllegalStateException("");
			}
			for (int i_422_ = 0; i_422_ < 8; i_422_++) {
				for (int i_423_ = 0; i_423_ < 8; i_423_++) {
					int i_424_ = i_422_ + (i >> 3);
					int i_425_ = (i_397_ >> 3) + i_423_;
					if (i_424_ >= 0 && i_424_ < -1287541105 * anInt4991 >> 3 && i_425_ >= 0 && i_425_ < anInt4984 * -215635651 >> 3) {
						if (null != class632)
							aClass627_10317.method10233(i_424_, i_425_, class632, (byte) -35);
						Class181.method3539(i_424_, i_425_, bool_399_, -361123532);
					}
				}
			}
			if (!bool && aByteArrayArrayArray4995 != null) {
				for (int i_426_ = 0; i_426_ < 4; i_426_++) {
					if (aByteArrayArrayArray4995[i_426_] != null) {
						for (int i_427_ = 0; i_427_ < 16; i_427_++) {
							for (int i_428_ = 0; i_428_ < 16; i_428_++) {
								int i_429_ = (i >> 2) + i_427_;
								int i_430_ = i_428_ + (i_397_ >> 2);
								if (i_429_ >= 0 && i_429_ < 26 && i_430_ >= 0 && i_430_ < 26)
									aByteArrayArrayArray4995[i_426_][i_429_][i_430_] = (byte) 0;
							}
						}
					}
				}
			}
		}
	}

	final void method15817(Class178 class178, int i, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_, int i_436_, int i_437_, int i_438_) {
		if (i_431_ < -817571777 * anInt10314)
			anInt10314 = i_431_ * -1098180673;
		Class602 class602 = (Class602) aClass53_Sub18_10318.getDefinition(i_434_, (byte) -19);
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1798609547) != 0 || !class602.aBool7920) {
			int i_439_;
			int i_440_;
			if (i_435_ == 1 || 3 == i_435_) {
				i_439_ = class602.anInt7872 * -1564896481;
				i_440_ = -1994552549 * class602.anInt7871;
			} else {
				i_439_ = -1994552549 * class602.anInt7871;
				i_440_ = -1564896481 * class602.anInt7872;
			}
			int i_441_;
			int i_442_;
			if (i_439_ + i_432_ <= anInt4991 * -1287541105) {
				i_441_ = i_432_ + (i_439_ >> 1);
				i_442_ = i_432_ + (i_439_ + 1 >> 1);
			} else {
				i_441_ = i_432_;
				i_442_ = i_432_ + 1;
			}
			int i_443_;
			int i_444_;
			if (i_440_ + i_433_ <= anInt4984 * -215635651) {
				i_443_ = i_433_ + (i_440_ >> 1);
				i_444_ = i_433_ + (1 + i_440_ >> 1);
			} else {
				i_443_ = i_433_;
				i_444_ = i_433_ + 1;
			}
			Class142 class142 = aClass560_4983.aClass142Array7509[i];
			int i_445_;
			if (i_436_ == Class607.aClass607_7970.anInt7982 * 1923531495 || 1923531495 * Class607.aClass607_7984.anInt7982 == i_436_)
				i_445_ = ((class142.method2329(i_441_, i_443_, -1039292053) + class142.method2329(i_442_, i_443_, -1039292053) + class142.method2329(i_441_, i_444_, -1039292053) + class142.method2329(i_442_, i_444_, -1039292053)) >> 2);
			else
				i_445_ = (class142.method2321(i_441_, i_443_, 1852522456) + class142.method2321(i_442_, i_443_, 1994669929) + class142.method2321(i_441_, i_444_, 1992488740) + class142.method2321(i_442_, i_444_, 2102261152)) >> 2;
			int i_446_ = (i_432_ << 9) + (i_439_ << 8);
			int i_447_ = (i_440_ << 8) + (i_433_ << 9);
			boolean bool = aBool4994 && !aBool5022 && class602.aBool7877;
			if (class602.method9899((byte) -48))
				Class451.method7292(i_431_, i_432_, i_433_, i_435_, class602, null, null, 1546142142);
			boolean bool_448_ = (-1 == i_437_ && (!class602.method9935((byte) 0) || class602.aBool7883 && (Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) -62) == 0)) && null == class602.anIntArray7912 && !class602.aBool7924 && !class602.aBool7928);
			if (!aBool10316 || ((!Class479.method7896(i_436_, 1929306810) || 1 == class602.anInt7873 * 1370816123) && (!Class647_Sub1_Sub3_Sub1.method18418(i_436_, 1128555705) || 0 != class602.anInt7873 * 1370816123))) {
				if (i_436_ == Class607.aClass607_7985.anInt7982 * 1923531495) {
					if (Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-2006947460) != 0 || 0 != class602.anInt7874 * -344567467 || 972673777 * class602.anInt7852 == 1 || class602.aBool7905) {
						Class647_Sub1_Sub2 class647_sub1_sub2;
						if (bool_448_) {
							Class647_Sub1_Sub2_Sub2 class647_sub1_sub2_sub2 = (new Class647_Sub1_Sub2_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_431_, i, i_446_, i_445_, i_447_, aBool5022, i_435_, bool));
							if (class647_sub1_sub2_sub2.method392((short) -4168))
								class647_sub1_sub2_sub2.method394(class178, 647149858);
							class647_sub1_sub2 = class647_sub1_sub2_sub2;
						} else
							class647_sub1_sub2 = (new Class647_Sub1_Sub2_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_431_, i, i_446_, i_445_, i_447_, aBool5022, i_435_, i_437_, i_438_));
						aClass560_4983.method9264(i_431_, i_432_, i_433_, class647_sub1_sub2, (byte) -35);
					}
				} else if ((1923531495 * Class607.aClass607_7970.anInt7982 == i_436_) || i_436_ == (Class607.aClass607_7984.anInt7982 * 1923531495)) {
					Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = null;
					Class647_Sub1_Sub3 class647_sub1_sub3;
					int i_449_;
					if (bool_448_) {
						Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3_450_ = (new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_431_, i, i_446_, i_445_, i_447_, aBool5022, i_432_, i_432_ + i_439_ - 1, i_433_, i_440_ + i_433_ - 1, i_436_, i_435_, bool, (Class594.aClass594_7817 != class602.aClass594_7865)));
						i_449_ = class647_sub1_sub3_sub3_450_.method18439(1837649850);
						class647_sub1_sub3 = class647_sub1_sub3_sub3_450_;
						class647_sub1_sub3_sub3 = class647_sub1_sub3_sub3_450_;
					} else {
						class647_sub1_sub3 = (new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_431_, i, i_446_, i_445_, i_447_, aBool5022, i_432_, i_432_ + i_439_ - 1, i_433_, i_433_ + i_440_ - 1, i_436_, i_435_, i_437_, i_438_, (class602.aClass594_7865 != Class594.aClass594_7817)));
						i_449_ = 15;
					}
					if (aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 91)) {
						if (class647_sub1_sub3_sub3 != null && class647_sub1_sub3_sub3.method392((short) -25415))
							class647_sub1_sub3_sub3.method394(class178, -1134253735);
						if (class602.aBool7895 && aBool4994) {
							if (i_449_ > 30)
								i_449_ = 30;
							for (int i_451_ = 0; i_451_ <= i_439_; i_451_++) {
								for (int i_452_ = 0; i_452_ <= i_440_; i_452_++)
									class142.method2320(i_451_ + i_432_, i_433_ + i_452_, i_449_);
							}
						}
					}
				} else if (Class647_Sub1_Sub3_Sub1.method18418(i_436_, 1908961768) || Class60.method1404(i_436_, (byte) -57)) {
					Class647_Sub1_Sub3 class647_sub1_sub3;
					if (bool_448_) {
						Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = (new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_431_, i, i_446_, i_445_, i_447_, aBool5022, i_432_, i_439_ + i_432_ - 1, i_433_, i_433_ + i_440_ - 1, i_436_, i_435_, bool, true));
						if (class647_sub1_sub3_sub3.method392((short) 5284))
							class647_sub1_sub3_sub3.method394(class178, 2032618278);
						class647_sub1_sub3 = class647_sub1_sub3_sub3;
					} else
						class647_sub1_sub3 = (new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_431_, i, i_446_, i_445_, i_447_, aBool5022, i_432_, i_432_ + i_439_ - 1, i_433_, i_440_ + i_433_ - 1, i_436_, i_435_, i_437_, i_438_, true));
					aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 24);
					if (aBool4994 && !aBool5022 && Class647_Sub1_Sub3_Sub1.method18418(i_436_, 1957092546) && (Class607.aClass607_7967.anInt7982 * 1923531495 != i_436_) && i_431_ > 0 && 1370816123 * class602.anInt7873 != 0)
						aByteArrayArrayArray5001[i_431_][i_432_][i_433_] |= 0x4;
				} else if (method15799(class178, i_436_, i_435_, bool_448_, class602, i_437_, i_438_, i_431_, i, i_446_, i_445_, i_447_, i_432_, i_433_, bool, class142, i_439_, i_440_, 554953766) || method15800(class178, i_436_, i_435_, bool_448_, class602, i_437_, i_438_, i_431_, i, i_446_, i_445_, i_447_, i_432_, i_433_, 1749991960)) {
					/* empty */
				}
			}
		}
	}

	void method15818(Class178 class178, int i, int i_453_, int i_454_, int i_455_) {
		Interface61 interface61 = method15802(i, i_453_, i_454_, i_455_, 178757529);
		if (null != interface61) {
			Class602 class602 = ((Class602) aClass53_Sub18_10318.getDefinition(interface61.method401(-770473736), (byte) -47));
			int i_456_ = interface61.method69(2039433986);
			int i_457_ = interface61.method390(1259048815);
			if (class602.method9899((byte) 66))
				Class457.method7446(i, i_454_, i_455_, class602, -701989387);
			if (interface61.method392((short) 3299))
				interface61.method395(class178, -672979890);
			if (i_453_ == 0) {
				aClass560_4983.method9271(i, i_454_, i_455_, 1464415553);
				aClass560_4983.method9272(i, i_454_, i_455_, 2073604035);
				if (class602.anInt7873 * 1370816123 == 1) {
					if (i_457_ == 0)
						aClass560_4983.aClass544_7541.method9035(1, i, i_454_, i_455_);
					else if (i_457_ == 1)
						aClass560_4983.aClass544_7541.method9035(2, i, i_454_, i_455_ + 1);
					else if (i_457_ == 2)
						aClass560_4983.aClass544_7541.method9035(1, i, 1 + i_454_, i_455_);
					else if (3 == i_457_)
						aClass560_4983.aClass544_7541.method9035(2, i, i_454_, i_455_);
				}
			} else if (1 == i_453_) {
				aClass560_4983.method9350(i, i_454_, i_455_, (byte) 91);
				aClass560_4983.method9247(i, i_454_, i_455_, (byte) 42);
			} else if (2 == i_453_) {
				aClass560_4983.method9413(i, i_454_, i_455_, client.anInterface63_11296, 2138772399);
				if (Class607.aClass607_7971.anInt7982 * 1923531495 == i_456_) {
					if ((i_457_ & 0x1) == 0)
						aClass560_4983.aClass544_7541.method9035(8, i, i_454_, i_455_);
					else
						aClass560_4983.aClass544_7541.method9035(16, i, i_454_, i_455_);
				}
			} else if (3 == i_453_)
				aClass560_4983.method9356(i, i_454_, i_455_, (byte) 0);
		}
	}

	Interface61 method15819(int i, int i_458_, int i_459_, int i_460_) {
		Interface61 interface61 = null;
		if (i_458_ == 0)
			interface61 = (Interface61) aClass560_4983.method9280(i, i_459_, i_460_, -336202307);
		if (1 == i_458_)
			interface61 = (Interface61) aClass560_4983.method9284(i, i_459_, i_460_, (byte) 127);
		if (i_458_ == 2)
			interface61 = ((Interface61) aClass560_4983.method9295(i, i_459_, i_460_, client.anInterface63_11296, (byte) -123));
		if (i_458_ == 3)
			interface61 = (Interface61) aClass560_4983.method9398(i, i_459_, i_460_, -1523644747);
		return interface61;
	}

	boolean method15820(Class178 class178, int i, int i_461_, boolean bool, Class602 class602, int i_462_, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_, boolean bool_471_, Class142 class142, int i_472_, int i_473_) {
		if (1923531495 * Class607.aClass607_7974.anInt7982 == i) {
			int i_474_ = 1370816123 * class602.anInt7873;
			if (aBool10307 && class602.anInt7873 * 1370816123 == -1)
				i_474_ = 1;
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_, bool_471_);
				if (class647_sub1_sub4_sub1.method392((short) -32176))
					class647_sub1_sub4_sub1.method394(class178, 13262923);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_, i_462_, i_463_);
			aClass560_4983.method9266(i_464_, i_469_, i_470_, class647_sub1_sub4, null, 1282425985);
			if (0 == i_461_) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_469_, i_470_, 50);
					class142.method2320(i_469_, i_470_ + 1, 50);
				}
				if (i_474_ == 1 && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(1, i_464_, i_469_, i_470_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
			} else if (1 == i_461_) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_469_, i_470_ + 1, 50);
					class142.method2320(i_469_ + 1, 1 + i_470_, 50);
				}
				if (1 == i_474_ && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(2, i_464_, i_469_, i_470_ + 1, 1491131641 * class602.anInt7879, -(class602.anInt7880 * -692200661));
			} else if (i_461_ == 2) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(1 + i_469_, i_470_, 50);
					class142.method2320(1 + i_469_, i_470_ + 1, 50);
				}
				if (1 == i_474_ && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(1, i_464_, 1 + i_469_, i_470_, class602.anInt7879 * 1491131641, -(class602.anInt7880 * -692200661));
			} else if (i_461_ == 3) {
				if (aBool4994 && class602.aBool7895) {
					class142.method2320(i_469_, i_470_, 50);
					class142.method2320(1 + i_469_, i_470_, 50);
				}
				if (i_474_ == 1 && !aBool5022)
					aClass560_4983.aClass544_7541.method9046(2, i_464_, i_469_, i_470_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
			}
			if (class602.anInt7907 * -1116762301 != 64)
				aClass560_4983.method9269(i_464_, i_469_, i_470_, class602.anInt7907 * -1116762301, (short) 333);
			return true;
		}
		if (i == Class607.aClass607_7964.anInt7982 * 1923531495) {
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_, bool_471_);
				if (class647_sub1_sub4_sub1.method392((short) -2485))
					class647_sub1_sub4_sub1.method394(class178, 1164537526);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_, i_462_, i_463_);
			aClass560_4983.method9266(i_464_, i_469_, i_470_, class647_sub1_sub4, null, 1009648736);
			if (class602.aBool7895 && aBool4994) {
				if (i_461_ == 0)
					class142.method2320(i_469_, 1 + i_470_, 50);
				else if (1 == i_461_)
					class142.method2320(1 + i_469_, 1 + i_470_, 50);
				else if (i_461_ == 2)
					class142.method2320(1 + i_469_, i_470_, 50);
				else if (3 == i_461_)
					class142.method2320(i_469_, i_470_, 50);
			}
			return true;
		}
		if (i == 1923531495 * Class607.aClass607_7965.anInt7982) {
			int i_475_ = i_461_ + 1 & 0x3;
			Class647_Sub1_Sub4 class647_sub1_sub4;
			Class647_Sub1_Sub4 class647_sub1_sub4_476_;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, 4 + i_461_, bool_471_);
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1_477_ = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_475_, bool_471_);
				if (class647_sub1_sub4_sub1.method392((short) -31123))
					class647_sub1_sub4_sub1.method394(class178, 733588102);
				if (class647_sub1_sub4_sub1_477_.method392((short) -32068))
					class647_sub1_sub4_sub1_477_.method394(class178, -56232720);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
				class647_sub1_sub4_476_ = class647_sub1_sub4_sub1_477_;
			} else {
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_ + 4, i_462_, i_463_);
				class647_sub1_sub4_476_ = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_475_, i_462_, i_463_);
			}
			aClass560_4983.method9266(i_464_, i_469_, i_470_, class647_sub1_sub4, class647_sub1_sub4_476_, 1433429427);
			if ((1 == class602.anInt7873 * 1370816123 || aBool10307 && -1 == 1370816123 * class602.anInt7873) && !aBool5022) {
				if (i_461_ == 0) {
					aClass560_4983.aClass544_7541.method9046(1, i_464_, i_469_, i_470_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_464_, i_469_, i_470_ + 1, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
				} else if (i_461_ == 1) {
					aClass560_4983.aClass544_7541.method9046(1, i_464_, i_469_ + 1, i_470_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_464_, i_469_, 1 + i_470_, class602.anInt7879 * 1491131641, -692200661 * class602.anInt7880);
				} else if (2 == i_461_) {
					aClass560_4983.aClass544_7541.method9046(1, i_464_, 1 + i_469_, i_470_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
					aClass560_4983.aClass544_7541.method9046(2, i_464_, i_469_, i_470_, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
				} else if (3 == i_461_) {
					aClass560_4983.aClass544_7541.method9046(1, i_464_, i_469_, i_470_, 1491131641 * class602.anInt7879, -692200661 * class602.anInt7880);
					aClass560_4983.aClass544_7541.method9046(2, i_464_, i_469_, i_470_, class602.anInt7879 * 1491131641, class602.anInt7880 * -692200661);
				}
			}
			if (64 != class602.anInt7907 * -1116762301)
				aClass560_4983.method9269(i_464_, i_469_, i_470_, class602.anInt7907 * -1116762301, (short) -1167);
			return true;
		}
		if (1923531495 * Class607.aClass607_7966.anInt7982 == i) {
			Class647_Sub1_Sub4 class647_sub1_sub4;
			if (bool) {
				Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = new Class647_Sub1_Sub4_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_, bool_471_);
				if (class647_sub1_sub4_sub1.method392((short) -29562))
					class647_sub1_sub4_sub1.method394(class178, 661114133);
				class647_sub1_sub4 = class647_sub1_sub4_sub1;
			} else
				class647_sub1_sub4 = new Class647_Sub1_Sub4_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i, i_461_, i_462_, i_463_);
			aClass560_4983.method9266(i_464_, i_469_, i_470_, class647_sub1_sub4, null, 1149171930);
			if (class602.aBool7895 && aBool4994) {
				if (0 == i_461_)
					class142.method2320(i_469_, 1 + i_470_, 50);
				else if (i_461_ == 1)
					class142.method2320(i_469_ + 1, 1 + i_470_, 50);
				else if (i_461_ == 2)
					class142.method2320(i_469_ + 1, i_470_, 50);
				else if (i_461_ == 3)
					class142.method2320(i_469_, i_470_, 50);
			}
			return true;
		}
		if (1923531495 * Class607.aClass607_7971.anInt7982 == i) {
			Class647_Sub1_Sub3 class647_sub1_sub3;
			if (bool) {
				Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i_469_, i_469_, i_470_, i_470_, i, i_461_, bool_471_, true);
				if (class647_sub1_sub3_sub3.method392((short) -19368))
					class647_sub1_sub3_sub3.method394(class178, 187478684);
				class647_sub1_sub3 = class647_sub1_sub3_sub3;
			} else
				class647_sub1_sub3 = new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_464_, i_465_, i_466_, i_467_, i_468_, aBool5022, i_469_, i_469_ + i_472_ - 1, i_470_, i_473_ + i_470_ - 1, i, i_461_, i_462_, i_463_, true);
			aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 91);
			if (1 == 1370816123 * class602.anInt7873 && !aBool5022) {
				int i_478_;
				if ((i_461_ & 0x1) == 0)
					i_478_ = 8;
				else
					i_478_ = 16;
				aClass560_4983.aClass544_7541.method9046(i_478_, i_464_, i_469_, i_470_, 1491131641 * class602.anInt7879, 0);
			}
			if (64 != -1116762301 * class602.anInt7907)
				aClass560_4983.method9269(i_464_, i_469_, i_470_, class602.anInt7907 * -1116762301, (short) 1338);
			return true;
		}
		return false;
	}

	static {
		aBool10307 = false;
		anIntArray10312 = new int[] { 1, 0, -1, 0 };
		anIntArray10313 = new int[] { 0, -1, 0, 1 };
		anIntArray10306 = new int[] { 1, -1, -1, 1 };
		anIntArray10315 = new int[] { -1, -1, 1, 1 };
	}

	public final void method15821(Class178 class178, boolean bool) {
		aClass560_4983.method9364();
		if (!bool) {
			if (1248554419 * anInt4990 > 1) {
				for (int i = 0; i < -1287541105 * anInt4991; i++) {
					for (int i_479_ = 0; i_479_ < anInt4984 * -215635651; i_479_++) {
						if (2 == ((aClass451_4982.aByteArrayArrayArray4962[1][i][i_479_]) & 0x2))
							aClass560_4983.method9300(i, i_479_, 1099456127);
					}
				}
			}
			for (int i = 0; i < 1248554419 * anInt4990; i++) {
				for (int i_480_ = 0; i_480_ <= anInt4984 * -215635651; i_480_++) {
					for (int i_481_ = 0; i_481_ <= anInt4991 * -1287541105; i_481_++) {
						if (0 != (aByteArrayArrayArray5001[i][i_481_][i_480_] & 0x4)) {
							int i_482_ = i_481_;
							int i_483_ = i_481_;
							int i_484_ = i_480_;
							int i_485_;
							for (i_485_ = i_480_; (i_484_ > 0 && ((aByteArrayArrayArray5001[i][i_481_][i_484_ - 1]) & 0x4) != 0 && i_485_ - i_484_ < 10); i_484_--) {
								/* empty */
							}
							for (/**/; (i_485_ < -215635651 * anInt4984 && ((aByteArrayArrayArray5001[i][i_481_][i_485_ + 1]) & 0x4) != 0 && i_485_ - i_484_ < 10); i_485_++) {
								/* empty */
							}
							while_49_: for (/**/; i_482_ > 0 && i_483_ - i_482_ < 10; i_482_--) {
								for (int i_486_ = i_484_; i_486_ <= i_485_; i_486_++) {
									if (((aByteArrayArrayArray5001[i][i_482_ - 1][i_486_]) & 0x4) == 0)
										break while_49_;
								}
							}
							while_50_: for (/**/; (i_483_ < anInt4991 * -1287541105 && i_483_ - i_482_ < 10); i_483_++) {
								for (int i_487_ = i_484_; i_487_ <= i_485_; i_487_++) {
									if (0 == ((aByteArrayArrayArray5001[i][1 + i_483_][i_487_]) & 0x4))
										break while_50_;
								}
							}
							if ((1 + (i_483_ - i_482_)) * (1 + (i_485_ - i_484_)) >= 4) {
								int i_488_ = (anIntArrayArrayArray5033[i][i_482_][i_484_]);
								aClass560_4983.aClass544_7541.method9017(4, i, i_482_ << 9, 512 + (i_483_ << 9), i_484_ << 9, (i_485_ << 9) + 512, i_488_, i_488_);
								for (int i_489_ = i_482_; i_489_ <= i_483_; i_489_++) {
									for (int i_490_ = i_484_; i_490_ <= i_485_; i_490_++)
										aByteArrayArrayArray5001[i][i_489_][i_490_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass560_4983.aClass544_7541.method9015();
		}
		aByteArrayArrayArray5001 = null;
	}

	final void method15822(Class178 class178, int i, int i_491_, int i_492_, int i_493_, int i_494_, int i_495_, int i_496_, int i_497_, int i_498_) {
		if (i_491_ < -817571777 * anInt10314)
			anInt10314 = i_491_ * -1098180673;
		Class602 class602 = (Class602) aClass53_Sub18_10318.getDefinition(i_494_, (byte) -87);
		if (Class449.aClass523_Sub33_4946.aClass687_Sub8_10628.method16807(1641435079) != 0 || !class602.aBool7920) {
			int i_499_;
			int i_500_;
			if (i_495_ == 1 || 3 == i_495_) {
				i_499_ = class602.anInt7872 * -1564896481;
				i_500_ = -1994552549 * class602.anInt7871;
			} else {
				i_499_ = -1994552549 * class602.anInt7871;
				i_500_ = -1564896481 * class602.anInt7872;
			}
			int i_501_;
			int i_502_;
			if (i_499_ + i_492_ <= anInt4991 * -1287541105) {
				i_501_ = i_492_ + (i_499_ >> 1);
				i_502_ = i_492_ + (i_499_ + 1 >> 1);
			} else {
				i_501_ = i_492_;
				i_502_ = i_492_ + 1;
			}
			int i_503_;
			int i_504_;
			if (i_500_ + i_493_ <= anInt4984 * -215635651) {
				i_503_ = i_493_ + (i_500_ >> 1);
				i_504_ = i_493_ + (1 + i_500_ >> 1);
			} else {
				i_503_ = i_493_;
				i_504_ = i_493_ + 1;
			}
			Class142 class142 = aClass560_4983.aClass142Array7509[i];
			int i_505_;
			if (i_496_ == Class607.aClass607_7970.anInt7982 * 1923531495 || 1923531495 * Class607.aClass607_7984.anInt7982 == i_496_)
				i_505_ = ((class142.method2329(i_501_, i_503_, -1039292053) + class142.method2329(i_502_, i_503_, -1039292053) + class142.method2329(i_501_, i_504_, -1039292053) + class142.method2329(i_502_, i_504_, -1039292053)) >> 2);
			else
				i_505_ = (class142.method2321(i_501_, i_503_, 1919668034) + class142.method2321(i_502_, i_503_, 1883351053) + class142.method2321(i_501_, i_504_, 2028964984) + class142.method2321(i_502_, i_504_, 2106628381)) >> 2;
			int i_506_ = (i_492_ << 9) + (i_499_ << 8);
			int i_507_ = (i_500_ << 8) + (i_493_ << 9);
			boolean bool = aBool4994 && !aBool5022 && class602.aBool7877;
			if (class602.method9899((byte) -47))
				Class451.method7292(i_491_, i_492_, i_493_, i_495_, class602, null, null, 1451362676);
			boolean bool_508_ = (-1 == i_497_ && (!class602.method9935((byte) 0) || class602.aBool7883 && (Class449.aClass523_Sub33_4946.aClass687_Sub21_10604.method16923((byte) -25) == 0)) && null == class602.anIntArray7912 && !class602.aBool7924 && !class602.aBool7928);
			if (!aBool10316 || ((!Class479.method7896(i_496_, 1637428983) || 1 == class602.anInt7873 * 1370816123) && (!Class647_Sub1_Sub3_Sub1.method18418(i_496_, 1529541737) || 0 != class602.anInt7873 * 1370816123))) {
				if (i_496_ == Class607.aClass607_7985.anInt7982 * 1923531495) {
					if (Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16910(-298565299) != 0 || 0 != class602.anInt7874 * -344567467 || 972673777 * class602.anInt7852 == 1 || class602.aBool7905) {
						Class647_Sub1_Sub2 class647_sub1_sub2;
						if (bool_508_) {
							Class647_Sub1_Sub2_Sub2 class647_sub1_sub2_sub2 = (new Class647_Sub1_Sub2_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_491_, i, i_506_, i_505_, i_507_, aBool5022, i_495_, bool));
							if (class647_sub1_sub2_sub2.method392((short) -22436))
								class647_sub1_sub2_sub2.method394(class178, -914480505);
							class647_sub1_sub2 = class647_sub1_sub2_sub2;
						} else
							class647_sub1_sub2 = (new Class647_Sub1_Sub2_Sub1(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_491_, i, i_506_, i_505_, i_507_, aBool5022, i_495_, i_497_, i_498_));
						aClass560_4983.method9264(i_491_, i_492_, i_493_, class647_sub1_sub2, (byte) -38);
					}
				} else if ((1923531495 * Class607.aClass607_7970.anInt7982 == i_496_) || i_496_ == (Class607.aClass607_7984.anInt7982 * 1923531495)) {
					Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = null;
					Class647_Sub1_Sub3 class647_sub1_sub3;
					int i_509_;
					if (bool_508_) {
						Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3_510_ = (new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_491_, i, i_506_, i_505_, i_507_, aBool5022, i_492_, i_492_ + i_499_ - 1, i_493_, i_500_ + i_493_ - 1, i_496_, i_495_, bool, (Class594.aClass594_7817 != class602.aClass594_7865)));
						i_509_ = class647_sub1_sub3_sub3_510_.method18439(1955793694);
						class647_sub1_sub3 = class647_sub1_sub3_sub3_510_;
						class647_sub1_sub3_sub3 = class647_sub1_sub3_sub3_510_;
					} else {
						class647_sub1_sub3 = (new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_491_, i, i_506_, i_505_, i_507_, aBool5022, i_492_, i_492_ + i_499_ - 1, i_493_, i_493_ + i_500_ - 1, i_496_, i_495_, i_497_, i_498_, (class602.aClass594_7865 != Class594.aClass594_7817)));
						i_509_ = 15;
					}
					if (aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 68)) {
						if (class647_sub1_sub3_sub3 != null && class647_sub1_sub3_sub3.method392((short) -23843))
							class647_sub1_sub3_sub3.method394(class178, 1777159174);
						if (class602.aBool7895 && aBool4994) {
							if (i_509_ > 30)
								i_509_ = 30;
							for (int i_511_ = 0; i_511_ <= i_499_; i_511_++) {
								for (int i_512_ = 0; i_512_ <= i_500_; i_512_++)
									class142.method2320(i_511_ + i_492_, i_493_ + i_512_, i_509_);
							}
						}
					}
				} else if (Class647_Sub1_Sub3_Sub1.method18418(i_496_, 1561224892) || Class60.method1404(i_496_, (byte) -39)) {
					Class647_Sub1_Sub3 class647_sub1_sub3;
					if (bool_508_) {
						Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = (new Class647_Sub1_Sub3_Sub3(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_491_, i, i_506_, i_505_, i_507_, aBool5022, i_492_, i_499_ + i_492_ - 1, i_493_, i_493_ + i_500_ - 1, i_496_, i_495_, bool, true));
						if (class647_sub1_sub3_sub3.method392((short) -29433))
							class647_sub1_sub3_sub3.method394(class178, 1226284855);
						class647_sub1_sub3 = class647_sub1_sub3_sub3;
					} else
						class647_sub1_sub3 = (new Class647_Sub1_Sub3_Sub2(aClass560_4983, class178, aClass53_Sub18_10318, class602, i_491_, i, i_506_, i_505_, i_507_, aBool5022, i_492_, i_492_ + i_499_ - 1, i_493_, i_500_ + i_493_ - 1, i_496_, i_495_, i_497_, i_498_, true));
					aClass560_4983.method9268(class647_sub1_sub3, false, (byte) 99);
					if (aBool4994 && !aBool5022 && Class647_Sub1_Sub3_Sub1.method18418(i_496_, 1434844700) && (Class607.aClass607_7967.anInt7982 * 1923531495 != i_496_) && i_491_ > 0 && 1370816123 * class602.anInt7873 != 0)
						aByteArrayArrayArray5001[i_491_][i_492_][i_493_] |= 0x4;
				} else if (method15799(class178, i_496_, i_495_, bool_508_, class602, i_497_, i_498_, i_491_, i, i_506_, i_505_, i_507_, i_492_, i_493_, bool, class142, i_499_, i_500_, 554953766) || method15800(class178, i_496_, i_495_, bool_508_, class602, i_497_, i_498_, i_491_, i, i_506_, i_505_, i_507_, i_492_, i_493_, 1283968703)) {
					/* empty */
				}
			}
		}
	}

	public final void method15823(Class178 class178, boolean bool) {
		aClass560_4983.method9364();
		if (!bool) {
			if (1248554419 * anInt4990 > 1) {
				for (int i = 0; i < -1287541105 * anInt4991; i++) {
					for (int i_513_ = 0; i_513_ < anInt4984 * -215635651; i_513_++) {
						if (2 == ((aClass451_4982.aByteArrayArrayArray4962[1][i][i_513_]) & 0x2))
							aClass560_4983.method9300(i, i_513_, 1099456127);
					}
				}
			}
			for (int i = 0; i < 1248554419 * anInt4990; i++) {
				for (int i_514_ = 0; i_514_ <= anInt4984 * -215635651; i_514_++) {
					for (int i_515_ = 0; i_515_ <= anInt4991 * -1287541105; i_515_++) {
						if (0 != (aByteArrayArrayArray5001[i][i_515_][i_514_] & 0x4)) {
							int i_516_ = i_515_;
							int i_517_ = i_515_;
							int i_518_ = i_514_;
							int i_519_;
							for (i_519_ = i_514_; (i_518_ > 0 && ((aByteArrayArrayArray5001[i][i_515_][i_518_ - 1]) & 0x4) != 0 && i_519_ - i_518_ < 10); i_518_--) {
								/* empty */
							}
							for (/**/; (i_519_ < -215635651 * anInt4984 && ((aByteArrayArrayArray5001[i][i_515_][i_519_ + 1]) & 0x4) != 0 && i_519_ - i_518_ < 10); i_519_++) {
								/* empty */
							}
							while_51_: for (/**/; i_516_ > 0 && i_517_ - i_516_ < 10; i_516_--) {
								for (int i_520_ = i_518_; i_520_ <= i_519_; i_520_++) {
									if (((aByteArrayArrayArray5001[i][i_516_ - 1][i_520_]) & 0x4) == 0)
										break while_51_;
								}
							}
							while_52_: for (/**/; (i_517_ < anInt4991 * -1287541105 && i_517_ - i_516_ < 10); i_517_++) {
								for (int i_521_ = i_518_; i_521_ <= i_519_; i_521_++) {
									if (0 == ((aByteArrayArrayArray5001[i][1 + i_517_][i_521_]) & 0x4))
										break while_52_;
								}
							}
							if ((1 + (i_517_ - i_516_)) * (1 + (i_519_ - i_518_)) >= 4) {
								int i_522_ = (anIntArrayArrayArray5033[i][i_516_][i_518_]);
								aClass560_4983.aClass544_7541.method9017(4, i, i_516_ << 9, 512 + (i_517_ << 9), i_518_ << 9, (i_519_ << 9) + 512, i_522_, i_522_);
								for (int i_523_ = i_516_; i_523_ <= i_517_; i_523_++) {
									for (int i_524_ = i_518_; i_524_ <= i_519_; i_524_++)
										aByteArrayArrayArray5001[i][i_523_][i_524_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass560_4983.aClass544_7541.method9015();
		}
		aByteArrayArrayArray5001 = null;
	}

	static void method15824(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815) - 2]), (byte) -33)).aStringArray3061[class669.anIntArray8557[class669.anInt8558 * 1357652815 - 1]]);
		class669.anInt8558 -= -17422498;
	}
}
