/* Class148_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class148_Sub1_Sub2 extends Class148_Sub1 {
	byte[] aByteArray11345;
	int[] anIntArray11346;

	void method14405(int[] is, int[] is_0_, int i, int i_1_) {
		int[] is_2_ = aClass178_Sub3_8923.anIntArray9804;
		if (is_2_ != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_3_ = anInt8928;
					while (i_3_ < 0) {
						int i_4_ = i_3_ + i_1_;
						if (i_4_ >= 0) {
							if (i_4_ >= is.length)
								break;
							int i_5_ = anInt8930;
							int i_6_ = anInt8937;
							int i_7_ = anInt8936;
							int i_8_ = anInt8926;
							if (i_6_ >= 0 && i_7_ >= 0 && i_6_ - (anInt8914 << 12) < 0 && i_7_ - (anInt8916 << 12) < 0) {
								int i_9_ = is[i_4_] - i;
								int i_10_ = -is_0_[i_4_];
								int i_11_ = i_9_ - (i_5_ - anInt8930);
								if (i_11_ > 0) {
									i_5_ += i_11_;
									i_8_ += i_11_;
									i_6_ += anInt8940 * i_11_;
									i_7_ += anInt8938 * i_11_;
								} else
									i_10_ -= i_11_;
								if (i_8_ < i_10_)
									i_8_ = i_10_;
								for (/**/; i_8_ < 0; i_8_++) {
									int i_12_ = (aByteArray11345[((i_7_ >> 12) * anInt8914 + (i_6_ >> 12))]);
									if (i_12_ != 0)
										is_2_[i_5_++] = anIntArray11346[i_12_ & 0xff];
									else
										i_5_++;
								}
							}
						}
						i_3_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_13_ = anInt8928;
					while (i_13_ < 0) {
						int i_14_ = i_13_ + i_1_;
						if (i_14_ >= 0) {
							if (i_14_ >= is.length)
								break;
							int i_15_ = anInt8930;
							int i_16_ = anInt8937;
							int i_17_ = anInt8936 + anInt8925;
							int i_18_ = anInt8926;
							if (i_16_ >= 0 && i_16_ - (anInt8914 << 12) < 0) {
								int i_19_;
								if ((i_19_ = i_17_ - (anInt8916 << 12)) >= 0) {
									i_19_ = (anInt8938 - i_19_) / anInt8938;
									i_18_ += i_19_;
									i_17_ += anInt8938 * i_19_;
									i_15_ += i_19_;
								}
								if ((i_19_ = (i_17_ - anInt8938) / anInt8938) > i_18_)
									i_18_ = i_19_;
								int i_20_ = is[i_14_] - i;
								int i_21_ = -is_0_[i_14_];
								int i_22_ = i_20_ - (i_15_ - anInt8930);
								if (i_22_ > 0) {
									i_15_ += i_22_;
									i_18_ += i_22_;
									i_16_ += anInt8940 * i_22_;
									i_17_ += anInt8938 * i_22_;
								} else
									i_21_ -= i_22_;
								if (i_18_ < i_21_)
									i_18_ = i_21_;
								for (/**/; i_18_ < 0; i_18_++) {
									int i_23_ = (aByteArray11345[((i_17_ >> 12) * anInt8914 + (i_16_ >> 12))]);
									if (i_23_ != 0)
										is_2_[i_15_++] = anIntArray11346[i_23_ & 0xff];
									else
										i_15_++;
									i_17_ += anInt8938;
								}
							}
						}
						i_13_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_24_ = anInt8928;
					while (i_24_ < 0) {
						int i_25_ = i_24_ + i_1_;
						if (i_25_ >= 0) {
							if (i_25_ >= is.length)
								break;
							int i_26_ = anInt8930;
							int i_27_ = anInt8937;
							int i_28_ = anInt8936 + anInt8925;
							int i_29_ = anInt8926;
							if (i_27_ >= 0 && i_27_ - (anInt8914 << 12) < 0) {
								if (i_28_ < 0) {
									int i_30_ = (anInt8938 - 1 - i_28_) / anInt8938;
									i_29_ += i_30_;
									i_28_ += anInt8938 * i_30_;
									i_26_ += i_30_;
								}
								int i_31_;
								if ((i_31_ = (1 + i_28_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_29_)
									i_29_ = i_31_;
								int i_32_ = is[i_25_] - i;
								int i_33_ = -is_0_[i_25_];
								int i_34_ = i_32_ - (i_26_ - anInt8930);
								if (i_34_ > 0) {
									i_26_ += i_34_;
									i_29_ += i_34_;
									i_27_ += anInt8940 * i_34_;
									i_28_ += anInt8938 * i_34_;
								} else
									i_33_ -= i_34_;
								if (i_29_ < i_33_)
									i_29_ = i_33_;
								for (/**/; i_29_ < 0; i_29_++) {
									int i_35_ = (aByteArray11345[((i_28_ >> 12) * anInt8914 + (i_27_ >> 12))]);
									if (i_35_ != 0)
										is_2_[i_26_++] = anIntArray11346[i_35_ & 0xff];
									else
										i_26_++;
									i_28_ += anInt8938;
								}
							}
						}
						i_24_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_36_ = anInt8928;
					while (i_36_ < 0) {
						int i_37_ = i_36_ + i_1_;
						if (i_37_ >= 0) {
							if (i_37_ >= is.length)
								break;
							int i_38_ = anInt8930;
							int i_39_ = anInt8937 + anInt8939;
							int i_40_ = anInt8936;
							int i_41_ = anInt8926;
							if (i_40_ >= 0 && i_40_ - (anInt8916 << 12) < 0) {
								int i_42_;
								if ((i_42_ = i_39_ - (anInt8914 << 12)) >= 0) {
									i_42_ = (anInt8940 - i_42_) / anInt8940;
									i_41_ += i_42_;
									i_39_ += anInt8940 * i_42_;
									i_38_ += i_42_;
								}
								if ((i_42_ = (i_39_ - anInt8940) / anInt8940) > i_41_)
									i_41_ = i_42_;
								int i_43_ = is[i_37_] - i;
								int i_44_ = -is_0_[i_37_];
								int i_45_ = i_43_ - (i_38_ - anInt8930);
								if (i_45_ > 0) {
									i_38_ += i_45_;
									i_41_ += i_45_;
									i_39_ += anInt8940 * i_45_;
									i_40_ += anInt8938 * i_45_;
								} else
									i_44_ -= i_45_;
								if (i_41_ < i_44_)
									i_41_ = i_44_;
								for (/**/; i_41_ < 0; i_41_++) {
									int i_46_ = (aByteArray11345[((i_40_ >> 12) * anInt8914 + (i_39_ >> 12))]);
									if (i_46_ != 0)
										is_2_[i_38_++] = anIntArray11346[i_46_ & 0xff];
									else
										i_38_++;
									i_39_ += anInt8940;
								}
							}
						}
						i_36_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_47_ = anInt8928;
					while (i_47_ < 0) {
						int i_48_ = i_47_ + i_1_;
						if (i_48_ >= 0) {
							if (i_48_ >= is.length)
								break;
							int i_49_ = anInt8930;
							int i_50_ = anInt8937 + anInt8939;
							int i_51_ = anInt8936 + anInt8925;
							int i_52_ = anInt8926;
							int i_53_;
							if ((i_53_ = i_50_ - (anInt8914 << 12)) >= 0) {
								i_53_ = (anInt8940 - i_53_) / anInt8940;
								i_52_ += i_53_;
								i_50_ += anInt8940 * i_53_;
								i_51_ += anInt8938 * i_53_;
								i_49_ += i_53_;
							}
							if ((i_53_ = (i_50_ - anInt8940) / anInt8940) > i_52_)
								i_52_ = i_53_;
							if ((i_53_ = i_51_ - (anInt8916 << 12)) >= 0) {
								i_53_ = (anInt8938 - i_53_) / anInt8938;
								i_52_ += i_53_;
								i_50_ += anInt8940 * i_53_;
								i_51_ += anInt8938 * i_53_;
								i_49_ += i_53_;
							}
							if ((i_53_ = (i_51_ - anInt8938) / anInt8938) > i_52_)
								i_52_ = i_53_;
							int i_54_ = is[i_48_] - i;
							int i_55_ = -is_0_[i_48_];
							int i_56_ = i_54_ - (i_49_ - anInt8930);
							if (i_56_ > 0) {
								i_49_ += i_56_;
								i_52_ += i_56_;
								i_50_ += anInt8940 * i_56_;
								i_51_ += anInt8938 * i_56_;
							} else
								i_55_ -= i_56_;
							if (i_52_ < i_55_)
								i_52_ = i_55_;
							for (/**/; i_52_ < 0; i_52_++) {
								int i_57_ = (aByteArray11345[(i_51_ >> 12) * anInt8914 + (i_50_ >> 12)]);
								if (i_57_ != 0)
									is_2_[i_49_++] = anIntArray11346[i_57_ & 0xff];
								else
									i_49_++;
								i_50_ += anInt8940;
								i_51_ += anInt8938;
							}
						}
						i_47_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_58_ = anInt8928;
					while (i_58_ < 0) {
						int i_59_ = i_58_ + i_1_;
						if (i_59_ >= 0) {
							if (i_59_ >= is.length)
								break;
							int i_60_ = anInt8930;
							int i_61_ = anInt8937 + anInt8939;
							int i_62_ = anInt8936 + anInt8925;
							int i_63_ = anInt8926;
							int i_64_;
							if ((i_64_ = i_61_ - (anInt8914 << 12)) >= 0) {
								i_64_ = (anInt8940 - i_64_) / anInt8940;
								i_63_ += i_64_;
								i_61_ += anInt8940 * i_64_;
								i_62_ += anInt8938 * i_64_;
								i_60_ += i_64_;
							}
							if ((i_64_ = (i_61_ - anInt8940) / anInt8940) > i_63_)
								i_63_ = i_64_;
							if (i_62_ < 0) {
								i_64_ = (anInt8938 - 1 - i_62_) / anInt8938;
								i_63_ += i_64_;
								i_61_ += anInt8940 * i_64_;
								i_62_ += anInt8938 * i_64_;
								i_60_ += i_64_;
							}
							if ((i_64_ = (1 + i_62_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_63_)
								i_63_ = i_64_;
							int i_65_ = is[i_59_] - i;
							int i_66_ = -is_0_[i_59_];
							int i_67_ = i_65_ - (i_60_ - anInt8930);
							if (i_67_ > 0) {
								i_60_ += i_67_;
								i_63_ += i_67_;
								i_61_ += anInt8940 * i_67_;
								i_62_ += anInt8938 * i_67_;
							} else
								i_66_ -= i_67_;
							if (i_63_ < i_66_)
								i_63_ = i_66_;
							for (/**/; i_63_ < 0; i_63_++) {
								int i_68_ = (aByteArray11345[(i_62_ >> 12) * anInt8914 + (i_61_ >> 12)]);
								if (i_68_ != 0)
									is_2_[i_60_++] = anIntArray11346[i_68_ & 0xff];
								else
									i_60_++;
								i_61_ += anInt8940;
								i_62_ += anInt8938;
							}
						}
						i_58_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_69_ = anInt8928;
				while (i_69_ < 0) {
					int i_70_ = i_69_ + i_1_;
					if (i_70_ >= 0) {
						if (i_70_ >= is.length)
							break;
						int i_71_ = anInt8930;
						int i_72_ = anInt8937 + anInt8939;
						int i_73_ = anInt8936;
						int i_74_ = anInt8926;
						if (i_73_ >= 0 && i_73_ - (anInt8916 << 12) < 0) {
							if (i_72_ < 0) {
								int i_75_ = (anInt8940 - 1 - i_72_) / anInt8940;
								i_74_ += i_75_;
								i_72_ += anInt8940 * i_75_;
								i_71_ += i_75_;
							}
							int i_76_;
							if ((i_76_ = (1 + i_72_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_74_)
								i_74_ = i_76_;
							int i_77_ = is[i_70_] - i;
							int i_78_ = -is_0_[i_70_];
							int i_79_ = i_77_ - (i_71_ - anInt8930);
							if (i_79_ > 0) {
								i_71_ += i_79_;
								i_74_ += i_79_;
								i_72_ += anInt8940 * i_79_;
								i_73_ += anInt8938 * i_79_;
							} else
								i_78_ -= i_79_;
							if (i_74_ < i_78_)
								i_74_ = i_78_;
							for (/**/; i_74_ < 0; i_74_++) {
								int i_80_ = (aByteArray11345[(i_73_ >> 12) * anInt8914 + (i_72_ >> 12)]);
								if (i_80_ != 0)
									is_2_[i_71_++] = anIntArray11346[i_80_ & 0xff];
								else
									i_71_++;
								i_72_ += anInt8940;
							}
						}
					}
					i_69_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				int i_81_ = anInt8928;
				while (i_81_ < 0) {
					int i_82_ = i_81_ + i_1_;
					if (i_82_ >= 0) {
						if (i_82_ >= is.length)
							break;
						int i_83_ = anInt8930;
						int i_84_ = anInt8937 + anInt8939;
						int i_85_ = anInt8936 + anInt8925;
						int i_86_ = anInt8926;
						if (i_84_ < 0) {
							int i_87_ = (anInt8940 - 1 - i_84_) / anInt8940;
							i_86_ += i_87_;
							i_84_ += anInt8940 * i_87_;
							i_85_ += anInt8938 * i_87_;
							i_83_ += i_87_;
						}
						int i_88_;
						if ((i_88_ = (1 + i_84_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_86_)
							i_86_ = i_88_;
						if ((i_88_ = i_85_ - (anInt8916 << 12)) >= 0) {
							i_88_ = (anInt8938 - i_88_) / anInt8938;
							i_86_ += i_88_;
							i_84_ += anInt8940 * i_88_;
							i_85_ += anInt8938 * i_88_;
							i_83_ += i_88_;
						}
						if ((i_88_ = (i_85_ - anInt8938) / anInt8938) > i_86_)
							i_86_ = i_88_;
						int i_89_ = is[i_82_] - i;
						int i_90_ = -is_0_[i_82_];
						int i_91_ = i_89_ - (i_83_ - anInt8930);
						if (i_91_ > 0) {
							i_83_ += i_91_;
							i_86_ += i_91_;
							i_84_ += anInt8940 * i_91_;
							i_85_ += anInt8938 * i_91_;
						} else
							i_90_ -= i_91_;
						if (i_86_ < i_90_)
							i_86_ = i_90_;
						for (/**/; i_86_ < 0; i_86_++) {
							int i_92_ = (aByteArray11345[(i_85_ >> 12) * anInt8914 + (i_84_ >> 12)]);
							if (i_92_ != 0)
								is_2_[i_83_++] = anIntArray11346[i_92_ & 0xff];
							else
								i_83_++;
							i_84_ += anInt8940;
							i_85_ += anInt8938;
						}
					}
					i_81_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				int i_93_ = anInt8928;
				while (i_93_ < 0) {
					int i_94_ = i_93_ + i_1_;
					if (i_94_ >= 0) {
						if (i_94_ >= is.length)
							break;
						int i_95_ = anInt8930;
						int i_96_ = anInt8937 + anInt8939;
						int i_97_ = anInt8936 + anInt8925;
						int i_98_ = anInt8926;
						if (i_96_ < 0) {
							int i_99_ = (anInt8940 - 1 - i_96_) / anInt8940;
							i_98_ += i_99_;
							i_96_ += anInt8940 * i_99_;
							i_97_ += anInt8938 * i_99_;
							i_95_ += i_99_;
						}
						int i_100_;
						if ((i_100_ = (1 + i_96_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_98_)
							i_98_ = i_100_;
						if (i_97_ < 0) {
							i_100_ = (anInt8938 - 1 - i_97_) / anInt8938;
							i_98_ += i_100_;
							i_96_ += anInt8940 * i_100_;
							i_97_ += anInt8938 * i_100_;
							i_95_ += i_100_;
						}
						if ((i_100_ = (1 + i_97_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_98_)
							i_98_ = i_100_;
						int i_101_ = is[i_94_] - i;
						int i_102_ = -is_0_[i_94_];
						int i_103_ = i_101_ - (i_95_ - anInt8930);
						if (i_103_ > 0) {
							i_95_ += i_103_;
							i_98_ += i_103_;
							i_96_ += anInt8940 * i_103_;
							i_97_ += anInt8938 * i_103_;
						} else
							i_102_ -= i_103_;
						if (i_98_ < i_102_)
							i_98_ = i_102_;
						for (/**/; i_98_ < 0; i_98_++) {
							int i_104_ = (aByteArray11345[(i_97_ >> 12) * anInt8914 + (i_96_ >> 12)]);
							if (i_104_ != 0)
								is_2_[i_95_++] = anIntArray11346[i_104_ & 0xff];
							else
								i_95_++;
							i_96_ += anInt8940;
							i_97_ += anInt8938;
						}
					}
					i_93_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public void method2431(int i, int i_105_, int i_106_, int i_107_, int[] is, int i_108_, int i_109_) {
		throw new IllegalStateException();
	}

	public void method2432(int i, int i_110_, int i_111_, int i_112_, int[] is, int[] is_113_, int i_114_, int i_115_) {
		throw new IllegalStateException();
	}

	void method14406(int i, int i_116_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_117_ = anInt8928;
					while (i_117_ < 0) {
						int i_118_ = anInt8930;
						int i_119_ = anInt8937;
						int i_120_ = anInt8936;
						int i_121_ = anInt8926;
						if (i_119_ >= 0 && i_120_ >= 0 && i_119_ - (anInt8914 << 12) < 0 && i_120_ - (anInt8916 << 12) < 0) {
							for (/**/; i_121_ < 0; i_121_++) {
								int i_122_ = ((i_120_ >> 12) * anInt8914 + (i_119_ >> 12));
								int i_123_ = i_118_++;
								if (i_116_ == 0) {
									if (i == 1)
										is[i_123_] = (anIntArray11346[(aByteArray11345[i_122_] & 0xff)]);
									else if (i == 0) {
										int i_124_ = (anIntArray11346[(aByteArray11345[i_122_] & 0xff)]);
										int i_125_ = ((i_124_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_126_ = ((i_124_ & 0xff00) * anInt8945 & 0xff0000);
										int i_127_ = ((i_124_ & 0xff) * anInt8946 & 0xff00);
										is[i_123_] = (i_125_ | i_126_ | i_127_) >>> 8;
									} else if (i == 3) {
										int i_128_ = (anIntArray11346[(aByteArray11345[i_122_] & 0xff)]);
										int i_129_ = anInt8941;
										int i_130_ = i_128_ + i_129_;
										int i_131_ = ((i_128_ & 0xff00ff) + (i_129_ & 0xff00ff));
										int i_132_ = ((i_131_ & 0x1000100) + (i_130_ - i_131_ & 0x10000));
										is[i_123_] = (i_130_ - i_132_ | i_132_ - (i_132_ >>> 8));
									} else if (i == 2) {
										int i_133_ = (anIntArray11346[(aByteArray11345[i_122_] & 0xff)]);
										int i_134_ = ((i_133_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_135_ = ((i_133_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_123_] = (((i_134_ | i_135_) >>> 8) + anInt8949);
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 1) {
									if (i == 1) {
										int i_136_ = aByteArray11345[i_122_];
										if (i_136_ != 0)
											is[i_123_] = (anIntArray11346[i_136_ & 0xff]);
									} else if (i == 0) {
										int i_137_ = aByteArray11345[i_122_];
										if (i_137_ != 0) {
											int i_138_ = (anIntArray11346[i_137_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_139_ = anInt8941 >>> 24;
												int i_140_ = 256 - i_139_;
												int i_141_ = is[i_123_];
												is[i_123_] = (((((i_138_ & 0xff00ff) * i_139_) + ((i_141_ & 0xff00ff) * i_140_)) & ~0xff00ff) + ((((i_138_ & 0xff00) * i_139_) + ((i_141_ & 0xff00) * i_140_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_142_ = (((i_138_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_143_ = (((i_138_ & 0xff00) * anInt8945) & 0xff0000);
												int i_144_ = (((i_138_ & 0xff) * anInt8946) & 0xff00);
												i_138_ = (i_142_ | i_143_ | i_144_) >>> 8;
												int i_145_ = is[i_123_];
												is[i_123_] = (((((i_138_ & 0xff00ff) * anInt8942) + ((i_145_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_138_ & 0xff00) * anInt8942) + ((i_145_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_146_ = (((i_138_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_147_ = (((i_138_ & 0xff00) * anInt8945) & 0xff0000);
												int i_148_ = (((i_138_ & 0xff) * anInt8946) & 0xff00);
												is[i_123_] = (i_146_ | i_147_ | i_148_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_149_ = aByteArray11345[i_122_];
										int i_150_ = (i_149_ > 0 ? anIntArray11346[i_149_] : 0);
										int i_151_ = anInt8941;
										int i_152_ = i_150_ + i_151_;
										int i_153_ = ((i_150_ & 0xff00ff) + (i_151_ & 0xff00ff));
										int i_154_ = ((i_153_ & 0x1000100) + (i_152_ - i_153_ & 0x10000));
										i_154_ = (i_152_ - i_154_ | i_154_ - (i_154_ >>> 8));
										if (i_150_ == 0 && anInt8942 != 255) {
											i_150_ = i_154_;
											i_154_ = is[i_123_];
											i_154_ = (((((i_150_ & 0xff00ff) * anInt8942) + ((i_154_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_150_ & 0xff00) * anInt8942) + ((i_154_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_123_] = i_154_;
									} else if (i == 2) {
										int i_155_ = aByteArray11345[i_122_];
										if (i_155_ != 0) {
											int i_156_ = (anIntArray11346[i_155_ & 0xff]);
											int i_157_ = (((i_156_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_158_ = (((i_156_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_123_++] = ((i_157_ | i_158_) >>> 8) + anInt8949;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 2) {
									if (i == 1) {
										int i_159_ = aByteArray11345[i_122_];
										if (i_159_ != 0) {
											int i_160_ = (anIntArray11346[i_159_ & 0xff]);
											int i_161_ = is[i_123_];
											int i_162_ = i_160_ + i_161_;
											int i_163_ = ((i_160_ & 0xff00ff) + (i_161_ & 0xff00ff));
											i_161_ = ((i_163_ & 0x1000100) + (i_162_ - i_163_ & 0x10000));
											is[i_123_] = (i_162_ - i_161_ | i_161_ - (i_161_ >>> 8));
										}
									} else if (i == 0) {
										int i_164_ = aByteArray11345[i_122_];
										if (i_164_ != 0) {
											int i_165_ = (anIntArray11346[i_164_ & 0xff]);
											int i_166_ = (((i_165_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_167_ = (((i_165_ & 0xff00) * anInt8945) & 0xff0000);
											int i_168_ = ((i_165_ & 0xff) * anInt8946 & 0xff00);
											i_165_ = (i_166_ | i_167_ | i_168_) >>> 8;
											int i_169_ = is[i_123_];
											int i_170_ = i_165_ + i_169_;
											int i_171_ = ((i_165_ & 0xff00ff) + (i_169_ & 0xff00ff));
											i_169_ = ((i_171_ & 0x1000100) + (i_170_ - i_171_ & 0x10000));
											is[i_123_] = (i_170_ - i_169_ | i_169_ - (i_169_ >>> 8));
										}
									} else if (i == 3) {
										byte i_172_ = aByteArray11345[i_122_];
										int i_173_ = (i_172_ > 0 ? anIntArray11346[i_172_] : 0);
										int i_174_ = anInt8941;
										int i_175_ = i_173_ + i_174_;
										int i_176_ = ((i_173_ & 0xff00ff) + (i_174_ & 0xff00ff));
										int i_177_ = ((i_176_ & 0x1000100) + (i_175_ - i_176_ & 0x10000));
										i_177_ = (i_175_ - i_177_ | i_177_ - (i_177_ >>> 8));
										if (i_173_ == 0 && anInt8942 != 255) {
											i_173_ = i_177_;
											i_177_ = is[i_123_];
											i_177_ = (((((i_173_ & 0xff00ff) * anInt8942) + ((i_177_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_173_ & 0xff00) * anInt8942) + ((i_177_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_123_] = i_177_;
									} else if (i == 2) {
										int i_178_ = aByteArray11345[i_122_];
										if (i_178_ != 0) {
											int i_179_ = (anIntArray11346[i_178_ & 0xff]);
											int i_180_ = (((i_179_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_181_ = (((i_179_ & 0xff00) * anInt8942) & 0xff0000);
											i_179_ = (((i_180_ | i_181_) >>> 8) + anInt8949);
											int i_182_ = is[i_123_];
											int i_183_ = i_179_ + i_182_;
											int i_184_ = ((i_179_ & 0xff00ff) + (i_182_ & 0xff00ff));
											i_182_ = ((i_184_ & 0x1000100) + (i_183_ - i_184_ & 0x10000));
											is[i_123_] = (i_183_ - i_182_ | i_182_ - (i_182_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_117_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_185_ = anInt8928;
					while (i_185_ < 0) {
						int i_186_ = anInt8930;
						int i_187_ = anInt8937;
						int i_188_ = anInt8936 + anInt8925;
						int i_189_ = anInt8926;
						if (i_187_ >= 0 && i_187_ - (anInt8914 << 12) < 0) {
							int i_190_;
							if ((i_190_ = i_188_ - (anInt8916 << 12)) >= 0) {
								i_190_ = (anInt8938 - i_190_) / anInt8938;
								i_189_ += i_190_;
								i_188_ += anInt8938 * i_190_;
								i_186_ += i_190_;
							}
							if ((i_190_ = (i_188_ - anInt8938) / anInt8938) > i_189_)
								i_189_ = i_190_;
							for (/**/; i_189_ < 0; i_189_++) {
								int i_191_ = ((i_188_ >> 12) * anInt8914 + (i_187_ >> 12));
								int i_192_ = i_186_++;
								if (i_116_ == 0) {
									if (i == 1)
										is[i_192_] = (anIntArray11346[(aByteArray11345[i_191_] & 0xff)]);
									else if (i == 0) {
										int i_193_ = (anIntArray11346[(aByteArray11345[i_191_] & 0xff)]);
										int i_194_ = ((i_193_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_195_ = ((i_193_ & 0xff00) * anInt8945 & 0xff0000);
										int i_196_ = ((i_193_ & 0xff) * anInt8946 & 0xff00);
										is[i_192_] = (i_194_ | i_195_ | i_196_) >>> 8;
									} else if (i == 3) {
										int i_197_ = (anIntArray11346[(aByteArray11345[i_191_] & 0xff)]);
										int i_198_ = anInt8941;
										int i_199_ = i_197_ + i_198_;
										int i_200_ = ((i_197_ & 0xff00ff) + (i_198_ & 0xff00ff));
										int i_201_ = ((i_200_ & 0x1000100) + (i_199_ - i_200_ & 0x10000));
										is[i_192_] = (i_199_ - i_201_ | i_201_ - (i_201_ >>> 8));
									} else if (i == 2) {
										int i_202_ = (anIntArray11346[(aByteArray11345[i_191_] & 0xff)]);
										int i_203_ = ((i_202_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_204_ = ((i_202_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_192_] = (((i_203_ | i_204_) >>> 8) + anInt8949);
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 1) {
									if (i == 1) {
										int i_205_ = aByteArray11345[i_191_];
										if (i_205_ != 0)
											is[i_192_] = (anIntArray11346[i_205_ & 0xff]);
									} else if (i == 0) {
										int i_206_ = aByteArray11345[i_191_];
										if (i_206_ != 0) {
											int i_207_ = (anIntArray11346[i_206_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_208_ = anInt8941 >>> 24;
												int i_209_ = 256 - i_208_;
												int i_210_ = is[i_192_];
												is[i_192_] = (((((i_207_ & 0xff00ff) * i_208_) + ((i_210_ & 0xff00ff) * i_209_)) & ~0xff00ff) + ((((i_207_ & 0xff00) * i_208_) + ((i_210_ & 0xff00) * i_209_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_211_ = (((i_207_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_212_ = (((i_207_ & 0xff00) * anInt8945) & 0xff0000);
												int i_213_ = (((i_207_ & 0xff) * anInt8946) & 0xff00);
												i_207_ = (i_211_ | i_212_ | i_213_) >>> 8;
												int i_214_ = is[i_192_];
												is[i_192_] = (((((i_207_ & 0xff00ff) * anInt8942) + ((i_214_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_207_ & 0xff00) * anInt8942) + ((i_214_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_215_ = (((i_207_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_216_ = (((i_207_ & 0xff00) * anInt8945) & 0xff0000);
												int i_217_ = (((i_207_ & 0xff) * anInt8946) & 0xff00);
												is[i_192_] = (i_215_ | i_216_ | i_217_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_218_ = aByteArray11345[i_191_];
										int i_219_ = (i_218_ > 0 ? anIntArray11346[i_218_] : 0);
										int i_220_ = anInt8941;
										int i_221_ = i_219_ + i_220_;
										int i_222_ = ((i_219_ & 0xff00ff) + (i_220_ & 0xff00ff));
										int i_223_ = ((i_222_ & 0x1000100) + (i_221_ - i_222_ & 0x10000));
										i_223_ = (i_221_ - i_223_ | i_223_ - (i_223_ >>> 8));
										if (i_219_ == 0 && anInt8942 != 255) {
											i_219_ = i_223_;
											i_223_ = is[i_192_];
											i_223_ = (((((i_219_ & 0xff00ff) * anInt8942) + ((i_223_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_219_ & 0xff00) * anInt8942) + ((i_223_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_192_] = i_223_;
									} else if (i == 2) {
										int i_224_ = aByteArray11345[i_191_];
										if (i_224_ != 0) {
											int i_225_ = (anIntArray11346[i_224_ & 0xff]);
											int i_226_ = (((i_225_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_227_ = (((i_225_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_192_++] = ((i_226_ | i_227_) >>> 8) + anInt8949;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 2) {
									if (i == 1) {
										int i_228_ = aByteArray11345[i_191_];
										if (i_228_ != 0) {
											int i_229_ = (anIntArray11346[i_228_ & 0xff]);
											int i_230_ = is[i_192_];
											int i_231_ = i_229_ + i_230_;
											int i_232_ = ((i_229_ & 0xff00ff) + (i_230_ & 0xff00ff));
											i_230_ = ((i_232_ & 0x1000100) + (i_231_ - i_232_ & 0x10000));
											is[i_192_] = (i_231_ - i_230_ | i_230_ - (i_230_ >>> 8));
										}
									} else if (i == 0) {
										int i_233_ = aByteArray11345[i_191_];
										if (i_233_ != 0) {
											int i_234_ = (anIntArray11346[i_233_ & 0xff]);
											int i_235_ = (((i_234_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_236_ = (((i_234_ & 0xff00) * anInt8945) & 0xff0000);
											int i_237_ = ((i_234_ & 0xff) * anInt8946 & 0xff00);
											i_234_ = (i_235_ | i_236_ | i_237_) >>> 8;
											int i_238_ = is[i_192_];
											int i_239_ = i_234_ + i_238_;
											int i_240_ = ((i_234_ & 0xff00ff) + (i_238_ & 0xff00ff));
											i_238_ = ((i_240_ & 0x1000100) + (i_239_ - i_240_ & 0x10000));
											is[i_192_] = (i_239_ - i_238_ | i_238_ - (i_238_ >>> 8));
										}
									} else if (i == 3) {
										byte i_241_ = aByteArray11345[i_191_];
										int i_242_ = (i_241_ > 0 ? anIntArray11346[i_241_] : 0);
										int i_243_ = anInt8941;
										int i_244_ = i_242_ + i_243_;
										int i_245_ = ((i_242_ & 0xff00ff) + (i_243_ & 0xff00ff));
										int i_246_ = ((i_245_ & 0x1000100) + (i_244_ - i_245_ & 0x10000));
										i_246_ = (i_244_ - i_246_ | i_246_ - (i_246_ >>> 8));
										if (i_242_ == 0 && anInt8942 != 255) {
											i_242_ = i_246_;
											i_246_ = is[i_192_];
											i_246_ = (((((i_242_ & 0xff00ff) * anInt8942) + ((i_246_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_242_ & 0xff00) * anInt8942) + ((i_246_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_192_] = i_246_;
									} else if (i == 2) {
										int i_247_ = aByteArray11345[i_191_];
										if (i_247_ != 0) {
											int i_248_ = (anIntArray11346[i_247_ & 0xff]);
											int i_249_ = (((i_248_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_250_ = (((i_248_ & 0xff00) * anInt8942) & 0xff0000);
											i_248_ = (((i_249_ | i_250_) >>> 8) + anInt8949);
											int i_251_ = is[i_192_];
											int i_252_ = i_248_ + i_251_;
											int i_253_ = ((i_248_ & 0xff00ff) + (i_251_ & 0xff00ff));
											i_251_ = ((i_253_ & 0x1000100) + (i_252_ - i_253_ & 0x10000));
											is[i_192_] = (i_252_ - i_251_ | i_251_ - (i_251_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_188_ += anInt8938;
							}
						}
						i_185_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_254_ = anInt8928;
					while (i_254_ < 0) {
						int i_255_ = anInt8930;
						int i_256_ = anInt8937;
						int i_257_ = anInt8936 + anInt8925;
						int i_258_ = anInt8926;
						if (i_256_ >= 0 && i_256_ - (anInt8914 << 12) < 0) {
							if (i_257_ < 0) {
								int i_259_ = (anInt8938 - 1 - i_257_) / anInt8938;
								i_258_ += i_259_;
								i_257_ += anInt8938 * i_259_;
								i_255_ += i_259_;
							}
							int i_260_;
							if ((i_260_ = (1 + i_257_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_258_)
								i_258_ = i_260_;
							for (/**/; i_258_ < 0; i_258_++) {
								int i_261_ = ((i_257_ >> 12) * anInt8914 + (i_256_ >> 12));
								int i_262_ = i_255_++;
								if (i_116_ == 0) {
									if (i == 1)
										is[i_262_] = (anIntArray11346[(aByteArray11345[i_261_] & 0xff)]);
									else if (i == 0) {
										int i_263_ = (anIntArray11346[(aByteArray11345[i_261_] & 0xff)]);
										int i_264_ = ((i_263_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_265_ = ((i_263_ & 0xff00) * anInt8945 & 0xff0000);
										int i_266_ = ((i_263_ & 0xff) * anInt8946 & 0xff00);
										is[i_262_] = (i_264_ | i_265_ | i_266_) >>> 8;
									} else if (i == 3) {
										int i_267_ = (anIntArray11346[(aByteArray11345[i_261_] & 0xff)]);
										int i_268_ = anInt8941;
										int i_269_ = i_267_ + i_268_;
										int i_270_ = ((i_267_ & 0xff00ff) + (i_268_ & 0xff00ff));
										int i_271_ = ((i_270_ & 0x1000100) + (i_269_ - i_270_ & 0x10000));
										is[i_262_] = (i_269_ - i_271_ | i_271_ - (i_271_ >>> 8));
									} else if (i == 2) {
										int i_272_ = (anIntArray11346[(aByteArray11345[i_261_] & 0xff)]);
										int i_273_ = ((i_272_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_274_ = ((i_272_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_262_] = (((i_273_ | i_274_) >>> 8) + anInt8949);
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 1) {
									if (i == 1) {
										int i_275_ = aByteArray11345[i_261_];
										if (i_275_ != 0)
											is[i_262_] = (anIntArray11346[i_275_ & 0xff]);
									} else if (i == 0) {
										int i_276_ = aByteArray11345[i_261_];
										if (i_276_ != 0) {
											int i_277_ = (anIntArray11346[i_276_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_278_ = anInt8941 >>> 24;
												int i_279_ = 256 - i_278_;
												int i_280_ = is[i_262_];
												is[i_262_] = (((((i_277_ & 0xff00ff) * i_278_) + ((i_280_ & 0xff00ff) * i_279_)) & ~0xff00ff) + ((((i_277_ & 0xff00) * i_278_) + ((i_280_ & 0xff00) * i_279_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_281_ = (((i_277_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_282_ = (((i_277_ & 0xff00) * anInt8945) & 0xff0000);
												int i_283_ = (((i_277_ & 0xff) * anInt8946) & 0xff00);
												i_277_ = (i_281_ | i_282_ | i_283_) >>> 8;
												int i_284_ = is[i_262_];
												is[i_262_] = (((((i_277_ & 0xff00ff) * anInt8942) + ((i_284_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_277_ & 0xff00) * anInt8942) + ((i_284_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_285_ = (((i_277_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_286_ = (((i_277_ & 0xff00) * anInt8945) & 0xff0000);
												int i_287_ = (((i_277_ & 0xff) * anInt8946) & 0xff00);
												is[i_262_] = (i_285_ | i_286_ | i_287_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_288_ = aByteArray11345[i_261_];
										int i_289_ = (i_288_ > 0 ? anIntArray11346[i_288_] : 0);
										int i_290_ = anInt8941;
										int i_291_ = i_289_ + i_290_;
										int i_292_ = ((i_289_ & 0xff00ff) + (i_290_ & 0xff00ff));
										int i_293_ = ((i_292_ & 0x1000100) + (i_291_ - i_292_ & 0x10000));
										i_293_ = (i_291_ - i_293_ | i_293_ - (i_293_ >>> 8));
										if (i_289_ == 0 && anInt8942 != 255) {
											i_289_ = i_293_;
											i_293_ = is[i_262_];
											i_293_ = (((((i_289_ & 0xff00ff) * anInt8942) + ((i_293_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_289_ & 0xff00) * anInt8942) + ((i_293_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_262_] = i_293_;
									} else if (i == 2) {
										int i_294_ = aByteArray11345[i_261_];
										if (i_294_ != 0) {
											int i_295_ = (anIntArray11346[i_294_ & 0xff]);
											int i_296_ = (((i_295_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_297_ = (((i_295_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_262_++] = ((i_296_ | i_297_) >>> 8) + anInt8949;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 2) {
									if (i == 1) {
										int i_298_ = aByteArray11345[i_261_];
										if (i_298_ != 0) {
											int i_299_ = (anIntArray11346[i_298_ & 0xff]);
											int i_300_ = is[i_262_];
											int i_301_ = i_299_ + i_300_;
											int i_302_ = ((i_299_ & 0xff00ff) + (i_300_ & 0xff00ff));
											i_300_ = ((i_302_ & 0x1000100) + (i_301_ - i_302_ & 0x10000));
											is[i_262_] = (i_301_ - i_300_ | i_300_ - (i_300_ >>> 8));
										}
									} else if (i == 0) {
										int i_303_ = aByteArray11345[i_261_];
										if (i_303_ != 0) {
											int i_304_ = (anIntArray11346[i_303_ & 0xff]);
											int i_305_ = (((i_304_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_306_ = (((i_304_ & 0xff00) * anInt8945) & 0xff0000);
											int i_307_ = ((i_304_ & 0xff) * anInt8946 & 0xff00);
											i_304_ = (i_305_ | i_306_ | i_307_) >>> 8;
											int i_308_ = is[i_262_];
											int i_309_ = i_304_ + i_308_;
											int i_310_ = ((i_304_ & 0xff00ff) + (i_308_ & 0xff00ff));
											i_308_ = ((i_310_ & 0x1000100) + (i_309_ - i_310_ & 0x10000));
											is[i_262_] = (i_309_ - i_308_ | i_308_ - (i_308_ >>> 8));
										}
									} else if (i == 3) {
										byte i_311_ = aByteArray11345[i_261_];
										int i_312_ = (i_311_ > 0 ? anIntArray11346[i_311_] : 0);
										int i_313_ = anInt8941;
										int i_314_ = i_312_ + i_313_;
										int i_315_ = ((i_312_ & 0xff00ff) + (i_313_ & 0xff00ff));
										int i_316_ = ((i_315_ & 0x1000100) + (i_314_ - i_315_ & 0x10000));
										i_316_ = (i_314_ - i_316_ | i_316_ - (i_316_ >>> 8));
										if (i_312_ == 0 && anInt8942 != 255) {
											i_312_ = i_316_;
											i_316_ = is[i_262_];
											i_316_ = (((((i_312_ & 0xff00ff) * anInt8942) + ((i_316_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_312_ & 0xff00) * anInt8942) + ((i_316_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_262_] = i_316_;
									} else if (i == 2) {
										int i_317_ = aByteArray11345[i_261_];
										if (i_317_ != 0) {
											int i_318_ = (anIntArray11346[i_317_ & 0xff]);
											int i_319_ = (((i_318_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_320_ = (((i_318_ & 0xff00) * anInt8942) & 0xff0000);
											i_318_ = (((i_319_ | i_320_) >>> 8) + anInt8949);
											int i_321_ = is[i_262_];
											int i_322_ = i_318_ + i_321_;
											int i_323_ = ((i_318_ & 0xff00ff) + (i_321_ & 0xff00ff));
											i_321_ = ((i_323_ & 0x1000100) + (i_322_ - i_323_ & 0x10000));
											is[i_262_] = (i_322_ - i_321_ | i_321_ - (i_321_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_257_ += anInt8938;
							}
						}
						i_254_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_324_ = anInt8928;
					while (i_324_ < 0) {
						int i_325_ = anInt8930;
						int i_326_ = anInt8937 + anInt8939;
						int i_327_ = anInt8936;
						int i_328_ = anInt8926;
						if (i_327_ >= 0 && i_327_ - (anInt8916 << 12) < 0) {
							int i_329_;
							if ((i_329_ = i_326_ - (anInt8914 << 12)) >= 0) {
								i_329_ = (anInt8940 - i_329_) / anInt8940;
								i_328_ += i_329_;
								i_326_ += anInt8940 * i_329_;
								i_325_ += i_329_;
							}
							if ((i_329_ = (i_326_ - anInt8940) / anInt8940) > i_328_)
								i_328_ = i_329_;
							for (/**/; i_328_ < 0; i_328_++) {
								int i_330_ = ((i_327_ >> 12) * anInt8914 + (i_326_ >> 12));
								int i_331_ = i_325_++;
								if (i_116_ == 0) {
									if (i == 1)
										is[i_331_] = (anIntArray11346[(aByteArray11345[i_330_] & 0xff)]);
									else if (i == 0) {
										int i_332_ = (anIntArray11346[(aByteArray11345[i_330_] & 0xff)]);
										int i_333_ = ((i_332_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_334_ = ((i_332_ & 0xff00) * anInt8945 & 0xff0000);
										int i_335_ = ((i_332_ & 0xff) * anInt8946 & 0xff00);
										is[i_331_] = (i_333_ | i_334_ | i_335_) >>> 8;
									} else if (i == 3) {
										int i_336_ = (anIntArray11346[(aByteArray11345[i_330_] & 0xff)]);
										int i_337_ = anInt8941;
										int i_338_ = i_336_ + i_337_;
										int i_339_ = ((i_336_ & 0xff00ff) + (i_337_ & 0xff00ff));
										int i_340_ = ((i_339_ & 0x1000100) + (i_338_ - i_339_ & 0x10000));
										is[i_331_] = (i_338_ - i_340_ | i_340_ - (i_340_ >>> 8));
									} else if (i == 2) {
										int i_341_ = (anIntArray11346[(aByteArray11345[i_330_] & 0xff)]);
										int i_342_ = ((i_341_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_343_ = ((i_341_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_331_] = (((i_342_ | i_343_) >>> 8) + anInt8949);
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 1) {
									if (i == 1) {
										int i_344_ = aByteArray11345[i_330_];
										if (i_344_ != 0)
											is[i_331_] = (anIntArray11346[i_344_ & 0xff]);
									} else if (i == 0) {
										int i_345_ = aByteArray11345[i_330_];
										if (i_345_ != 0) {
											int i_346_ = (anIntArray11346[i_345_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_347_ = anInt8941 >>> 24;
												int i_348_ = 256 - i_347_;
												int i_349_ = is[i_331_];
												is[i_331_] = (((((i_346_ & 0xff00ff) * i_347_) + ((i_349_ & 0xff00ff) * i_348_)) & ~0xff00ff) + ((((i_346_ & 0xff00) * i_347_) + ((i_349_ & 0xff00) * i_348_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_350_ = (((i_346_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_351_ = (((i_346_ & 0xff00) * anInt8945) & 0xff0000);
												int i_352_ = (((i_346_ & 0xff) * anInt8946) & 0xff00);
												i_346_ = (i_350_ | i_351_ | i_352_) >>> 8;
												int i_353_ = is[i_331_];
												is[i_331_] = (((((i_346_ & 0xff00ff) * anInt8942) + ((i_353_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_346_ & 0xff00) * anInt8942) + ((i_353_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_354_ = (((i_346_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_355_ = (((i_346_ & 0xff00) * anInt8945) & 0xff0000);
												int i_356_ = (((i_346_ & 0xff) * anInt8946) & 0xff00);
												is[i_331_] = (i_354_ | i_355_ | i_356_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_357_ = aByteArray11345[i_330_];
										int i_358_ = (i_357_ > 0 ? anIntArray11346[i_357_] : 0);
										int i_359_ = anInt8941;
										int i_360_ = i_358_ + i_359_;
										int i_361_ = ((i_358_ & 0xff00ff) + (i_359_ & 0xff00ff));
										int i_362_ = ((i_361_ & 0x1000100) + (i_360_ - i_361_ & 0x10000));
										i_362_ = (i_360_ - i_362_ | i_362_ - (i_362_ >>> 8));
										if (i_358_ == 0 && anInt8942 != 255) {
											i_358_ = i_362_;
											i_362_ = is[i_331_];
											i_362_ = (((((i_358_ & 0xff00ff) * anInt8942) + ((i_362_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_358_ & 0xff00) * anInt8942) + ((i_362_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_331_] = i_362_;
									} else if (i == 2) {
										int i_363_ = aByteArray11345[i_330_];
										if (i_363_ != 0) {
											int i_364_ = (anIntArray11346[i_363_ & 0xff]);
											int i_365_ = (((i_364_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_366_ = (((i_364_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_331_++] = ((i_365_ | i_366_) >>> 8) + anInt8949;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_116_ == 2) {
									if (i == 1) {
										int i_367_ = aByteArray11345[i_330_];
										if (i_367_ != 0) {
											int i_368_ = (anIntArray11346[i_367_ & 0xff]);
											int i_369_ = is[i_331_];
											int i_370_ = i_368_ + i_369_;
											int i_371_ = ((i_368_ & 0xff00ff) + (i_369_ & 0xff00ff));
											i_369_ = ((i_371_ & 0x1000100) + (i_370_ - i_371_ & 0x10000));
											is[i_331_] = (i_370_ - i_369_ | i_369_ - (i_369_ >>> 8));
										}
									} else if (i == 0) {
										int i_372_ = aByteArray11345[i_330_];
										if (i_372_ != 0) {
											int i_373_ = (anIntArray11346[i_372_ & 0xff]);
											int i_374_ = (((i_373_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_375_ = (((i_373_ & 0xff00) * anInt8945) & 0xff0000);
											int i_376_ = ((i_373_ & 0xff) * anInt8946 & 0xff00);
											i_373_ = (i_374_ | i_375_ | i_376_) >>> 8;
											int i_377_ = is[i_331_];
											int i_378_ = i_373_ + i_377_;
											int i_379_ = ((i_373_ & 0xff00ff) + (i_377_ & 0xff00ff));
											i_377_ = ((i_379_ & 0x1000100) + (i_378_ - i_379_ & 0x10000));
											is[i_331_] = (i_378_ - i_377_ | i_377_ - (i_377_ >>> 8));
										}
									} else if (i == 3) {
										byte i_380_ = aByteArray11345[i_330_];
										int i_381_ = (i_380_ > 0 ? anIntArray11346[i_380_] : 0);
										int i_382_ = anInt8941;
										int i_383_ = i_381_ + i_382_;
										int i_384_ = ((i_381_ & 0xff00ff) + (i_382_ & 0xff00ff));
										int i_385_ = ((i_384_ & 0x1000100) + (i_383_ - i_384_ & 0x10000));
										i_385_ = (i_383_ - i_385_ | i_385_ - (i_385_ >>> 8));
										if (i_381_ == 0 && anInt8942 != 255) {
											i_381_ = i_385_;
											i_385_ = is[i_331_];
											i_385_ = (((((i_381_ & 0xff00ff) * anInt8942) + ((i_385_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_381_ & 0xff00) * anInt8942) + ((i_385_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_331_] = i_385_;
									} else if (i == 2) {
										int i_386_ = aByteArray11345[i_330_];
										if (i_386_ != 0) {
											int i_387_ = (anIntArray11346[i_386_ & 0xff]);
											int i_388_ = (((i_387_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_389_ = (((i_387_ & 0xff00) * anInt8942) & 0xff0000);
											i_387_ = (((i_388_ | i_389_) >>> 8) + anInt8949);
											int i_390_ = is[i_331_];
											int i_391_ = i_387_ + i_390_;
											int i_392_ = ((i_387_ & 0xff00ff) + (i_390_ & 0xff00ff));
											i_390_ = ((i_392_ & 0x1000100) + (i_391_ - i_392_ & 0x10000));
											is[i_331_] = (i_391_ - i_390_ | i_390_ - (i_390_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_326_ += anInt8940;
							}
						}
						i_324_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_393_ = anInt8928;
					while (i_393_ < 0) {
						int i_394_ = anInt8930;
						int i_395_ = anInt8937 + anInt8939;
						int i_396_ = anInt8936 + anInt8925;
						int i_397_ = anInt8926;
						int i_398_;
						if ((i_398_ = i_395_ - (anInt8914 << 12)) >= 0) {
							i_398_ = (anInt8940 - i_398_) / anInt8940;
							i_397_ += i_398_;
							i_395_ += anInt8940 * i_398_;
							i_396_ += anInt8938 * i_398_;
							i_394_ += i_398_;
						}
						if ((i_398_ = (i_395_ - anInt8940) / anInt8940) > i_397_)
							i_397_ = i_398_;
						if ((i_398_ = i_396_ - (anInt8916 << 12)) >= 0) {
							i_398_ = (anInt8938 - i_398_) / anInt8938;
							i_397_ += i_398_;
							i_395_ += anInt8940 * i_398_;
							i_396_ += anInt8938 * i_398_;
							i_394_ += i_398_;
						}
						if ((i_398_ = (i_396_ - anInt8938) / anInt8938) > i_397_)
							i_397_ = i_398_;
						for (/**/; i_397_ < 0; i_397_++) {
							int i_399_ = (i_396_ >> 12) * anInt8914 + (i_395_ >> 12);
							int i_400_ = i_394_++;
							if (i_116_ == 0) {
								if (i == 1)
									is[i_400_] = (anIntArray11346[aByteArray11345[i_399_] & 0xff]);
								else if (i == 0) {
									int i_401_ = (anIntArray11346[aByteArray11345[i_399_] & 0xff]);
									int i_402_ = ((i_401_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_403_ = ((i_401_ & 0xff00) * anInt8945 & 0xff0000);
									int i_404_ = (i_401_ & 0xff) * anInt8946 & 0xff00;
									is[i_400_] = (i_402_ | i_403_ | i_404_) >>> 8;
								} else if (i == 3) {
									int i_405_ = (anIntArray11346[aByteArray11345[i_399_] & 0xff]);
									int i_406_ = anInt8941;
									int i_407_ = i_405_ + i_406_;
									int i_408_ = ((i_405_ & 0xff00ff) + (i_406_ & 0xff00ff));
									int i_409_ = ((i_408_ & 0x1000100) + (i_407_ - i_408_ & 0x10000));
									is[i_400_] = i_407_ - i_409_ | i_409_ - (i_409_ >>> 8);
								} else if (i == 2) {
									int i_410_ = (anIntArray11346[aByteArray11345[i_399_] & 0xff]);
									int i_411_ = ((i_410_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_412_ = ((i_410_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_400_] = (((i_411_ | i_412_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_116_ == 1) {
								if (i == 1) {
									int i_413_ = aByteArray11345[i_399_];
									if (i_413_ != 0)
										is[i_400_] = anIntArray11346[i_413_ & 0xff];
								} else if (i == 0) {
									int i_414_ = aByteArray11345[i_399_];
									if (i_414_ != 0) {
										int i_415_ = anIntArray11346[i_414_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_416_ = anInt8941 >>> 24;
											int i_417_ = 256 - i_416_;
											int i_418_ = is[i_400_];
											is[i_400_] = (((((i_415_ & 0xff00ff) * i_416_) + ((i_418_ & 0xff00ff) * i_417_)) & ~0xff00ff) + ((((i_415_ & 0xff00) * i_416_) + ((i_418_ & 0xff00) * i_417_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_419_ = (((i_415_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_420_ = (((i_415_ & 0xff00) * anInt8945) & 0xff0000);
											int i_421_ = ((i_415_ & 0xff) * anInt8946 & 0xff00);
											i_415_ = (i_419_ | i_420_ | i_421_) >>> 8;
											int i_422_ = is[i_400_];
											is[i_400_] = (((((i_415_ & 0xff00ff) * anInt8942) + ((i_422_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_415_ & 0xff00) * anInt8942) + ((i_422_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_423_ = (((i_415_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_424_ = (((i_415_ & 0xff00) * anInt8945) & 0xff0000);
											int i_425_ = ((i_415_ & 0xff) * anInt8946 & 0xff00);
											is[i_400_] = (i_423_ | i_424_ | i_425_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_426_ = aByteArray11345[i_399_];
									int i_427_ = (i_426_ > 0 ? anIntArray11346[i_426_] : 0);
									int i_428_ = anInt8941;
									int i_429_ = i_427_ + i_428_;
									int i_430_ = ((i_427_ & 0xff00ff) + (i_428_ & 0xff00ff));
									int i_431_ = ((i_430_ & 0x1000100) + (i_429_ - i_430_ & 0x10000));
									i_431_ = i_429_ - i_431_ | i_431_ - (i_431_ >>> 8);
									if (i_427_ == 0 && anInt8942 != 255) {
										i_427_ = i_431_;
										i_431_ = is[i_400_];
										i_431_ = (((((i_427_ & 0xff00ff) * anInt8942) + ((i_431_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_427_ & 0xff00) * anInt8942) + ((i_431_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_400_] = i_431_;
								} else if (i == 2) {
									int i_432_ = aByteArray11345[i_399_];
									if (i_432_ != 0) {
										int i_433_ = anIntArray11346[i_432_ & 0xff];
										int i_434_ = ((i_433_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_435_ = ((i_433_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_400_++] = ((i_434_ | i_435_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_116_ == 2) {
								if (i == 1) {
									int i_436_ = aByteArray11345[i_399_];
									if (i_436_ != 0) {
										int i_437_ = anIntArray11346[i_436_ & 0xff];
										int i_438_ = is[i_400_];
										int i_439_ = i_437_ + i_438_;
										int i_440_ = ((i_437_ & 0xff00ff) + (i_438_ & 0xff00ff));
										i_438_ = ((i_440_ & 0x1000100) + (i_439_ - i_440_ & 0x10000));
										is[i_400_] = (i_439_ - i_438_ | i_438_ - (i_438_ >>> 8));
									}
								} else if (i == 0) {
									int i_441_ = aByteArray11345[i_399_];
									if (i_441_ != 0) {
										int i_442_ = anIntArray11346[i_441_ & 0xff];
										int i_443_ = ((i_442_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_444_ = ((i_442_ & 0xff00) * anInt8945 & 0xff0000);
										int i_445_ = ((i_442_ & 0xff) * anInt8946 & 0xff00);
										i_442_ = (i_443_ | i_444_ | i_445_) >>> 8;
										int i_446_ = is[i_400_];
										int i_447_ = i_442_ + i_446_;
										int i_448_ = ((i_442_ & 0xff00ff) + (i_446_ & 0xff00ff));
										i_446_ = ((i_448_ & 0x1000100) + (i_447_ - i_448_ & 0x10000));
										is[i_400_] = (i_447_ - i_446_ | i_446_ - (i_446_ >>> 8));
									}
								} else if (i == 3) {
									byte i_449_ = aByteArray11345[i_399_];
									int i_450_ = (i_449_ > 0 ? anIntArray11346[i_449_] : 0);
									int i_451_ = anInt8941;
									int i_452_ = i_450_ + i_451_;
									int i_453_ = ((i_450_ & 0xff00ff) + (i_451_ & 0xff00ff));
									int i_454_ = ((i_453_ & 0x1000100) + (i_452_ - i_453_ & 0x10000));
									i_454_ = i_452_ - i_454_ | i_454_ - (i_454_ >>> 8);
									if (i_450_ == 0 && anInt8942 != 255) {
										i_450_ = i_454_;
										i_454_ = is[i_400_];
										i_454_ = (((((i_450_ & 0xff00ff) * anInt8942) + ((i_454_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_450_ & 0xff00) * anInt8942) + ((i_454_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_400_] = i_454_;
								} else if (i == 2) {
									int i_455_ = aByteArray11345[i_399_];
									if (i_455_ != 0) {
										int i_456_ = anIntArray11346[i_455_ & 0xff];
										int i_457_ = ((i_456_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_458_ = ((i_456_ & 0xff00) * anInt8942 & 0xff0000);
										i_456_ = (((i_457_ | i_458_) >>> 8) + anInt8949);
										int i_459_ = is[i_400_];
										int i_460_ = i_456_ + i_459_;
										int i_461_ = ((i_456_ & 0xff00ff) + (i_459_ & 0xff00ff));
										i_459_ = ((i_461_ & 0x1000100) + (i_460_ - i_461_ & 0x10000));
										is[i_400_] = (i_460_ - i_459_ | i_459_ - (i_459_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_395_ += anInt8940;
							i_396_ += anInt8938;
						}
						i_393_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_462_ = anInt8928;
					while (i_462_ < 0) {
						int i_463_ = anInt8930;
						int i_464_ = anInt8937 + anInt8939;
						int i_465_ = anInt8936 + anInt8925;
						int i_466_ = anInt8926;
						int i_467_;
						if ((i_467_ = i_464_ - (anInt8914 << 12)) >= 0) {
							i_467_ = (anInt8940 - i_467_) / anInt8940;
							i_466_ += i_467_;
							i_464_ += anInt8940 * i_467_;
							i_465_ += anInt8938 * i_467_;
							i_463_ += i_467_;
						}
						if ((i_467_ = (i_464_ - anInt8940) / anInt8940) > i_466_)
							i_466_ = i_467_;
						if (i_465_ < 0) {
							i_467_ = (anInt8938 - 1 - i_465_) / anInt8938;
							i_466_ += i_467_;
							i_464_ += anInt8940 * i_467_;
							i_465_ += anInt8938 * i_467_;
							i_463_ += i_467_;
						}
						if ((i_467_ = (1 + i_465_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_466_)
							i_466_ = i_467_;
						for (/**/; i_466_ < 0; i_466_++) {
							int i_468_ = (i_465_ >> 12) * anInt8914 + (i_464_ >> 12);
							int i_469_ = i_463_++;
							if (i_116_ == 0) {
								if (i == 1)
									is[i_469_] = (anIntArray11346[aByteArray11345[i_468_] & 0xff]);
								else if (i == 0) {
									int i_470_ = (anIntArray11346[aByteArray11345[i_468_] & 0xff]);
									int i_471_ = ((i_470_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_472_ = ((i_470_ & 0xff00) * anInt8945 & 0xff0000);
									int i_473_ = (i_470_ & 0xff) * anInt8946 & 0xff00;
									is[i_469_] = (i_471_ | i_472_ | i_473_) >>> 8;
								} else if (i == 3) {
									int i_474_ = (anIntArray11346[aByteArray11345[i_468_] & 0xff]);
									int i_475_ = anInt8941;
									int i_476_ = i_474_ + i_475_;
									int i_477_ = ((i_474_ & 0xff00ff) + (i_475_ & 0xff00ff));
									int i_478_ = ((i_477_ & 0x1000100) + (i_476_ - i_477_ & 0x10000));
									is[i_469_] = i_476_ - i_478_ | i_478_ - (i_478_ >>> 8);
								} else if (i == 2) {
									int i_479_ = (anIntArray11346[aByteArray11345[i_468_] & 0xff]);
									int i_480_ = ((i_479_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_481_ = ((i_479_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_469_] = (((i_480_ | i_481_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_116_ == 1) {
								if (i == 1) {
									int i_482_ = aByteArray11345[i_468_];
									if (i_482_ != 0)
										is[i_469_] = anIntArray11346[i_482_ & 0xff];
								} else if (i == 0) {
									int i_483_ = aByteArray11345[i_468_];
									if (i_483_ != 0) {
										int i_484_ = anIntArray11346[i_483_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_485_ = anInt8941 >>> 24;
											int i_486_ = 256 - i_485_;
											int i_487_ = is[i_469_];
											is[i_469_] = (((((i_484_ & 0xff00ff) * i_485_) + ((i_487_ & 0xff00ff) * i_486_)) & ~0xff00ff) + ((((i_484_ & 0xff00) * i_485_) + ((i_487_ & 0xff00) * i_486_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_488_ = (((i_484_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_489_ = (((i_484_ & 0xff00) * anInt8945) & 0xff0000);
											int i_490_ = ((i_484_ & 0xff) * anInt8946 & 0xff00);
											i_484_ = (i_488_ | i_489_ | i_490_) >>> 8;
											int i_491_ = is[i_469_];
											is[i_469_] = (((((i_484_ & 0xff00ff) * anInt8942) + ((i_491_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_484_ & 0xff00) * anInt8942) + ((i_491_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_492_ = (((i_484_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_493_ = (((i_484_ & 0xff00) * anInt8945) & 0xff0000);
											int i_494_ = ((i_484_ & 0xff) * anInt8946 & 0xff00);
											is[i_469_] = (i_492_ | i_493_ | i_494_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_495_ = aByteArray11345[i_468_];
									int i_496_ = (i_495_ > 0 ? anIntArray11346[i_495_] : 0);
									int i_497_ = anInt8941;
									int i_498_ = i_496_ + i_497_;
									int i_499_ = ((i_496_ & 0xff00ff) + (i_497_ & 0xff00ff));
									int i_500_ = ((i_499_ & 0x1000100) + (i_498_ - i_499_ & 0x10000));
									i_500_ = i_498_ - i_500_ | i_500_ - (i_500_ >>> 8);
									if (i_496_ == 0 && anInt8942 != 255) {
										i_496_ = i_500_;
										i_500_ = is[i_469_];
										i_500_ = (((((i_496_ & 0xff00ff) * anInt8942) + ((i_500_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_496_ & 0xff00) * anInt8942) + ((i_500_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_469_] = i_500_;
								} else if (i == 2) {
									int i_501_ = aByteArray11345[i_468_];
									if (i_501_ != 0) {
										int i_502_ = anIntArray11346[i_501_ & 0xff];
										int i_503_ = ((i_502_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_504_ = ((i_502_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_469_++] = ((i_503_ | i_504_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_116_ == 2) {
								if (i == 1) {
									int i_505_ = aByteArray11345[i_468_];
									if (i_505_ != 0) {
										int i_506_ = anIntArray11346[i_505_ & 0xff];
										int i_507_ = is[i_469_];
										int i_508_ = i_506_ + i_507_;
										int i_509_ = ((i_506_ & 0xff00ff) + (i_507_ & 0xff00ff));
										i_507_ = ((i_509_ & 0x1000100) + (i_508_ - i_509_ & 0x10000));
										is[i_469_] = (i_508_ - i_507_ | i_507_ - (i_507_ >>> 8));
									}
								} else if (i == 0) {
									int i_510_ = aByteArray11345[i_468_];
									if (i_510_ != 0) {
										int i_511_ = anIntArray11346[i_510_ & 0xff];
										int i_512_ = ((i_511_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_513_ = ((i_511_ & 0xff00) * anInt8945 & 0xff0000);
										int i_514_ = ((i_511_ & 0xff) * anInt8946 & 0xff00);
										i_511_ = (i_512_ | i_513_ | i_514_) >>> 8;
										int i_515_ = is[i_469_];
										int i_516_ = i_511_ + i_515_;
										int i_517_ = ((i_511_ & 0xff00ff) + (i_515_ & 0xff00ff));
										i_515_ = ((i_517_ & 0x1000100) + (i_516_ - i_517_ & 0x10000));
										is[i_469_] = (i_516_ - i_515_ | i_515_ - (i_515_ >>> 8));
									}
								} else if (i == 3) {
									byte i_518_ = aByteArray11345[i_468_];
									int i_519_ = (i_518_ > 0 ? anIntArray11346[i_518_] : 0);
									int i_520_ = anInt8941;
									int i_521_ = i_519_ + i_520_;
									int i_522_ = ((i_519_ & 0xff00ff) + (i_520_ & 0xff00ff));
									int i_523_ = ((i_522_ & 0x1000100) + (i_521_ - i_522_ & 0x10000));
									i_523_ = i_521_ - i_523_ | i_523_ - (i_523_ >>> 8);
									if (i_519_ == 0 && anInt8942 != 255) {
										i_519_ = i_523_;
										i_523_ = is[i_469_];
										i_523_ = (((((i_519_ & 0xff00ff) * anInt8942) + ((i_523_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_519_ & 0xff00) * anInt8942) + ((i_523_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_469_] = i_523_;
								} else if (i == 2) {
									int i_524_ = aByteArray11345[i_468_];
									if (i_524_ != 0) {
										int i_525_ = anIntArray11346[i_524_ & 0xff];
										int i_526_ = ((i_525_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_527_ = ((i_525_ & 0xff00) * anInt8942 & 0xff0000);
										i_525_ = (((i_526_ | i_527_) >>> 8) + anInt8949);
										int i_528_ = is[i_469_];
										int i_529_ = i_525_ + i_528_;
										int i_530_ = ((i_525_ & 0xff00ff) + (i_528_ & 0xff00ff));
										i_528_ = ((i_530_ & 0x1000100) + (i_529_ - i_530_ & 0x10000));
										is[i_469_] = (i_529_ - i_528_ | i_528_ - (i_528_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_464_ += anInt8940;
							i_465_ += anInt8938;
						}
						i_462_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_531_ = anInt8928;
				while (i_531_ < 0) {
					int i_532_ = anInt8930;
					int i_533_ = anInt8937 + anInt8939;
					int i_534_ = anInt8936;
					int i_535_ = anInt8926;
					if (i_534_ >= 0 && i_534_ - (anInt8916 << 12) < 0) {
						if (i_533_ < 0) {
							int i_536_ = (anInt8940 - 1 - i_533_) / anInt8940;
							i_535_ += i_536_;
							i_533_ += anInt8940 * i_536_;
							i_532_ += i_536_;
						}
						int i_537_;
						if ((i_537_ = (1 + i_533_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_535_)
							i_535_ = i_537_;
						for (/**/; i_535_ < 0; i_535_++) {
							int i_538_ = (i_534_ >> 12) * anInt8914 + (i_533_ >> 12);
							int i_539_ = i_532_++;
							if (i_116_ == 0) {
								if (i == 1)
									is[i_539_] = (anIntArray11346[aByteArray11345[i_538_] & 0xff]);
								else if (i == 0) {
									int i_540_ = (anIntArray11346[aByteArray11345[i_538_] & 0xff]);
									int i_541_ = ((i_540_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_542_ = ((i_540_ & 0xff00) * anInt8945 & 0xff0000);
									int i_543_ = (i_540_ & 0xff) * anInt8946 & 0xff00;
									is[i_539_] = (i_541_ | i_542_ | i_543_) >>> 8;
								} else if (i == 3) {
									int i_544_ = (anIntArray11346[aByteArray11345[i_538_] & 0xff]);
									int i_545_ = anInt8941;
									int i_546_ = i_544_ + i_545_;
									int i_547_ = ((i_544_ & 0xff00ff) + (i_545_ & 0xff00ff));
									int i_548_ = ((i_547_ & 0x1000100) + (i_546_ - i_547_ & 0x10000));
									is[i_539_] = i_546_ - i_548_ | i_548_ - (i_548_ >>> 8);
								} else if (i == 2) {
									int i_549_ = (anIntArray11346[aByteArray11345[i_538_] & 0xff]);
									int i_550_ = ((i_549_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_551_ = ((i_549_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_539_] = (((i_550_ | i_551_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_116_ == 1) {
								if (i == 1) {
									int i_552_ = aByteArray11345[i_538_];
									if (i_552_ != 0)
										is[i_539_] = anIntArray11346[i_552_ & 0xff];
								} else if (i == 0) {
									int i_553_ = aByteArray11345[i_538_];
									if (i_553_ != 0) {
										int i_554_ = anIntArray11346[i_553_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_555_ = anInt8941 >>> 24;
											int i_556_ = 256 - i_555_;
											int i_557_ = is[i_539_];
											is[i_539_] = (((((i_554_ & 0xff00ff) * i_555_) + ((i_557_ & 0xff00ff) * i_556_)) & ~0xff00ff) + ((((i_554_ & 0xff00) * i_555_) + ((i_557_ & 0xff00) * i_556_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_558_ = (((i_554_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_559_ = (((i_554_ & 0xff00) * anInt8945) & 0xff0000);
											int i_560_ = ((i_554_ & 0xff) * anInt8946 & 0xff00);
											i_554_ = (i_558_ | i_559_ | i_560_) >>> 8;
											int i_561_ = is[i_539_];
											is[i_539_] = (((((i_554_ & 0xff00ff) * anInt8942) + ((i_561_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_554_ & 0xff00) * anInt8942) + ((i_561_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_562_ = (((i_554_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_563_ = (((i_554_ & 0xff00) * anInt8945) & 0xff0000);
											int i_564_ = ((i_554_ & 0xff) * anInt8946 & 0xff00);
											is[i_539_] = (i_562_ | i_563_ | i_564_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_565_ = aByteArray11345[i_538_];
									int i_566_ = (i_565_ > 0 ? anIntArray11346[i_565_] : 0);
									int i_567_ = anInt8941;
									int i_568_ = i_566_ + i_567_;
									int i_569_ = ((i_566_ & 0xff00ff) + (i_567_ & 0xff00ff));
									int i_570_ = ((i_569_ & 0x1000100) + (i_568_ - i_569_ & 0x10000));
									i_570_ = i_568_ - i_570_ | i_570_ - (i_570_ >>> 8);
									if (i_566_ == 0 && anInt8942 != 255) {
										i_566_ = i_570_;
										i_570_ = is[i_539_];
										i_570_ = (((((i_566_ & 0xff00ff) * anInt8942) + ((i_570_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_566_ & 0xff00) * anInt8942) + ((i_570_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_539_] = i_570_;
								} else if (i == 2) {
									int i_571_ = aByteArray11345[i_538_];
									if (i_571_ != 0) {
										int i_572_ = anIntArray11346[i_571_ & 0xff];
										int i_573_ = ((i_572_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_574_ = ((i_572_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_539_++] = ((i_573_ | i_574_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_116_ == 2) {
								if (i == 1) {
									int i_575_ = aByteArray11345[i_538_];
									if (i_575_ != 0) {
										int i_576_ = anIntArray11346[i_575_ & 0xff];
										int i_577_ = is[i_539_];
										int i_578_ = i_576_ + i_577_;
										int i_579_ = ((i_576_ & 0xff00ff) + (i_577_ & 0xff00ff));
										i_577_ = ((i_579_ & 0x1000100) + (i_578_ - i_579_ & 0x10000));
										is[i_539_] = (i_578_ - i_577_ | i_577_ - (i_577_ >>> 8));
									}
								} else if (i == 0) {
									int i_580_ = aByteArray11345[i_538_];
									if (i_580_ != 0) {
										int i_581_ = anIntArray11346[i_580_ & 0xff];
										int i_582_ = ((i_581_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_583_ = ((i_581_ & 0xff00) * anInt8945 & 0xff0000);
										int i_584_ = ((i_581_ & 0xff) * anInt8946 & 0xff00);
										i_581_ = (i_582_ | i_583_ | i_584_) >>> 8;
										int i_585_ = is[i_539_];
										int i_586_ = i_581_ + i_585_;
										int i_587_ = ((i_581_ & 0xff00ff) + (i_585_ & 0xff00ff));
										i_585_ = ((i_587_ & 0x1000100) + (i_586_ - i_587_ & 0x10000));
										is[i_539_] = (i_586_ - i_585_ | i_585_ - (i_585_ >>> 8));
									}
								} else if (i == 3) {
									byte i_588_ = aByteArray11345[i_538_];
									int i_589_ = (i_588_ > 0 ? anIntArray11346[i_588_] : 0);
									int i_590_ = anInt8941;
									int i_591_ = i_589_ + i_590_;
									int i_592_ = ((i_589_ & 0xff00ff) + (i_590_ & 0xff00ff));
									int i_593_ = ((i_592_ & 0x1000100) + (i_591_ - i_592_ & 0x10000));
									i_593_ = i_591_ - i_593_ | i_593_ - (i_593_ >>> 8);
									if (i_589_ == 0 && anInt8942 != 255) {
										i_589_ = i_593_;
										i_593_ = is[i_539_];
										i_593_ = (((((i_589_ & 0xff00ff) * anInt8942) + ((i_593_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_589_ & 0xff00) * anInt8942) + ((i_593_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_539_] = i_593_;
								} else if (i == 2) {
									int i_594_ = aByteArray11345[i_538_];
									if (i_594_ != 0) {
										int i_595_ = anIntArray11346[i_594_ & 0xff];
										int i_596_ = ((i_595_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_597_ = ((i_595_ & 0xff00) * anInt8942 & 0xff0000);
										i_595_ = (((i_596_ | i_597_) >>> 8) + anInt8949);
										int i_598_ = is[i_539_];
										int i_599_ = i_595_ + i_598_;
										int i_600_ = ((i_595_ & 0xff00ff) + (i_598_ & 0xff00ff));
										i_598_ = ((i_600_ & 0x1000100) + (i_599_ - i_600_ & 0x10000));
										is[i_539_] = (i_599_ - i_598_ | i_598_ - (i_598_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_533_ += anInt8940;
						}
					}
					i_531_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				for (int i_601_ = anInt8928; i_601_ < 0; i_601_++) {
					int i_602_ = anInt8930;
					int i_603_ = anInt8937 + anInt8939;
					int i_604_ = anInt8936 + anInt8925;
					int i_605_ = anInt8926;
					if (i_603_ < 0) {
						int i_606_ = (anInt8940 - 1 - i_603_) / anInt8940;
						i_605_ += i_606_;
						i_603_ += anInt8940 * i_606_;
						i_604_ += anInt8938 * i_606_;
						i_602_ += i_606_;
					}
					int i_607_;
					if ((i_607_ = ((1 + i_603_ - (anInt8914 << 12) - anInt8940) / anInt8940)) > i_605_)
						i_605_ = i_607_;
					if ((i_607_ = i_604_ - (anInt8916 << 12)) >= 0) {
						i_607_ = (anInt8938 - i_607_) / anInt8938;
						i_605_ += i_607_;
						i_603_ += anInt8940 * i_607_;
						i_604_ += anInt8938 * i_607_;
						i_602_ += i_607_;
					}
					if ((i_607_ = (i_604_ - anInt8938) / anInt8938) > i_605_)
						i_605_ = i_607_;
					for (/**/; i_605_ < 0; i_605_++) {
						int i_608_ = (i_604_ >> 12) * anInt8914 + (i_603_ >> 12);
						int i_609_ = i_602_++;
						if (i_116_ == 0) {
							if (i == 1)
								is[i_609_] = (anIntArray11346[aByteArray11345[i_608_] & 0xff]);
							else if (i == 0) {
								int i_610_ = (anIntArray11346[aByteArray11345[i_608_] & 0xff]);
								int i_611_ = ((i_610_ & 0xff0000) * anInt8944 & ~0xffffff);
								int i_612_ = (i_610_ & 0xff00) * anInt8945 & 0xff0000;
								int i_613_ = (i_610_ & 0xff) * anInt8946 & 0xff00;
								is[i_609_] = (i_611_ | i_612_ | i_613_) >>> 8;
							} else if (i == 3) {
								int i_614_ = (anIntArray11346[aByteArray11345[i_608_] & 0xff]);
								int i_615_ = anInt8941;
								int i_616_ = i_614_ + i_615_;
								int i_617_ = ((i_614_ & 0xff00ff) + (i_615_ & 0xff00ff));
								int i_618_ = ((i_617_ & 0x1000100) + (i_616_ - i_617_ & 0x10000));
								is[i_609_] = i_616_ - i_618_ | i_618_ - (i_618_ >>> 8);
							} else if (i == 2) {
								int i_619_ = (anIntArray11346[aByteArray11345[i_608_] & 0xff]);
								int i_620_ = ((i_619_ & 0xff00ff) * anInt8942 & ~0xff00ff);
								int i_621_ = (i_619_ & 0xff00) * anInt8942 & 0xff0000;
								is[i_609_] = ((i_620_ | i_621_) >>> 8) + anInt8949;
							} else
								throw new IllegalArgumentException();
						} else if (i_116_ == 1) {
							if (i == 1) {
								int i_622_ = aByteArray11345[i_608_];
								if (i_622_ != 0)
									is[i_609_] = anIntArray11346[i_622_ & 0xff];
							} else if (i == 0) {
								int i_623_ = aByteArray11345[i_608_];
								if (i_623_ != 0) {
									int i_624_ = anIntArray11346[i_623_ & 0xff];
									if ((anInt8941 & 0xffffff) == 16777215) {
										int i_625_ = anInt8941 >>> 24;
										int i_626_ = 256 - i_625_;
										int i_627_ = is[i_609_];
										is[i_609_] = ((((i_624_ & 0xff00ff) * i_625_ + ((i_627_ & 0xff00ff) * i_626_)) & ~0xff00ff) + (((i_624_ & 0xff00) * i_625_ + ((i_627_ & 0xff00) * i_626_)) & 0xff0000)) >> 8;
									} else if (anInt8942 != 255) {
										int i_628_ = ((i_624_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_629_ = ((i_624_ & 0xff00) * anInt8945 & 0xff0000);
										int i_630_ = ((i_624_ & 0xff) * anInt8946 & 0xff00);
										i_624_ = (i_628_ | i_629_ | i_630_) >>> 8;
										int i_631_ = is[i_609_];
										is[i_609_] = (((((i_624_ & 0xff00ff) * anInt8942) + ((i_631_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_624_ & 0xff00) * anInt8942) + ((i_631_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									} else {
										int i_632_ = ((i_624_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_633_ = ((i_624_ & 0xff00) * anInt8945 & 0xff0000);
										int i_634_ = ((i_624_ & 0xff) * anInt8946 & 0xff00);
										is[i_609_] = (i_632_ | i_633_ | i_634_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_635_ = aByteArray11345[i_608_];
								int i_636_ = i_635_ > 0 ? anIntArray11346[i_635_] : 0;
								int i_637_ = anInt8941;
								int i_638_ = i_636_ + i_637_;
								int i_639_ = ((i_636_ & 0xff00ff) + (i_637_ & 0xff00ff));
								int i_640_ = ((i_639_ & 0x1000100) + (i_638_ - i_639_ & 0x10000));
								i_640_ = i_638_ - i_640_ | i_640_ - (i_640_ >>> 8);
								if (i_636_ == 0 && anInt8942 != 255) {
									i_636_ = i_640_;
									i_640_ = is[i_609_];
									i_640_ = ((((i_636_ & 0xff00ff) * anInt8942 + (i_640_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_636_ & 0xff00) * anInt8942 + (i_640_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
								}
								is[i_609_] = i_640_;
							} else if (i == 2) {
								int i_641_ = aByteArray11345[i_608_];
								if (i_641_ != 0) {
									int i_642_ = anIntArray11346[i_641_ & 0xff];
									int i_643_ = ((i_642_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_644_ = ((i_642_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_609_++] = (((i_643_ | i_644_) >>> 8) + anInt8949);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_116_ == 2) {
							if (i == 1) {
								int i_645_ = aByteArray11345[i_608_];
								if (i_645_ != 0) {
									int i_646_ = anIntArray11346[i_645_ & 0xff];
									int i_647_ = is[i_609_];
									int i_648_ = i_646_ + i_647_;
									int i_649_ = ((i_646_ & 0xff00ff) + (i_647_ & 0xff00ff));
									i_647_ = ((i_649_ & 0x1000100) + (i_648_ - i_649_ & 0x10000));
									is[i_609_] = i_648_ - i_647_ | i_647_ - (i_647_ >>> 8);
								}
							} else if (i == 0) {
								int i_650_ = aByteArray11345[i_608_];
								if (i_650_ != 0) {
									int i_651_ = anIntArray11346[i_650_ & 0xff];
									int i_652_ = ((i_651_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_653_ = ((i_651_ & 0xff00) * anInt8945 & 0xff0000);
									int i_654_ = (i_651_ & 0xff) * anInt8946 & 0xff00;
									i_651_ = (i_652_ | i_653_ | i_654_) >>> 8;
									int i_655_ = is[i_609_];
									int i_656_ = i_651_ + i_655_;
									int i_657_ = ((i_651_ & 0xff00ff) + (i_655_ & 0xff00ff));
									i_655_ = ((i_657_ & 0x1000100) + (i_656_ - i_657_ & 0x10000));
									is[i_609_] = i_656_ - i_655_ | i_655_ - (i_655_ >>> 8);
								}
							} else if (i == 3) {
								byte i_658_ = aByteArray11345[i_608_];
								int i_659_ = i_658_ > 0 ? anIntArray11346[i_658_] : 0;
								int i_660_ = anInt8941;
								int i_661_ = i_659_ + i_660_;
								int i_662_ = ((i_659_ & 0xff00ff) + (i_660_ & 0xff00ff));
								int i_663_ = ((i_662_ & 0x1000100) + (i_661_ - i_662_ & 0x10000));
								i_663_ = i_661_ - i_663_ | i_663_ - (i_663_ >>> 8);
								if (i_659_ == 0 && anInt8942 != 255) {
									i_659_ = i_663_;
									i_663_ = is[i_609_];
									i_663_ = ((((i_659_ & 0xff00ff) * anInt8942 + (i_663_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_659_ & 0xff00) * anInt8942 + (i_663_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
								}
								is[i_609_] = i_663_;
							} else if (i == 2) {
								int i_664_ = aByteArray11345[i_608_];
								if (i_664_ != 0) {
									int i_665_ = anIntArray11346[i_664_ & 0xff];
									int i_666_ = ((i_665_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_667_ = ((i_665_ & 0xff00) * anInt8942 & 0xff0000);
									i_665_ = (((i_666_ | i_667_) >>> 8) + anInt8949);
									int i_668_ = is[i_609_];
									int i_669_ = i_665_ + i_668_;
									int i_670_ = ((i_665_ & 0xff00ff) + (i_668_ & 0xff00ff));
									i_668_ = ((i_670_ & 0x1000100) + (i_669_ - i_670_ & 0x10000));
									is[i_609_] = i_669_ - i_668_ | i_668_ - (i_668_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_603_ += anInt8940;
						i_604_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				for (int i_671_ = anInt8928; i_671_ < 0; i_671_++) {
					int i_672_ = anInt8930;
					int i_673_ = anInt8937 + anInt8939;
					int i_674_ = anInt8936 + anInt8925;
					int i_675_ = anInt8926;
					if (i_673_ < 0) {
						int i_676_ = (anInt8940 - 1 - i_673_) / anInt8940;
						i_675_ += i_676_;
						i_673_ += anInt8940 * i_676_;
						i_674_ += anInt8938 * i_676_;
						i_672_ += i_676_;
					}
					int i_677_;
					if ((i_677_ = ((1 + i_673_ - (anInt8914 << 12) - anInt8940) / anInt8940)) > i_675_)
						i_675_ = i_677_;
					if (i_674_ < 0) {
						i_677_ = (anInt8938 - 1 - i_674_) / anInt8938;
						i_675_ += i_677_;
						i_673_ += anInt8940 * i_677_;
						i_674_ += anInt8938 * i_677_;
						i_672_ += i_677_;
					}
					if ((i_677_ = ((1 + i_674_ - (anInt8916 << 12) - anInt8938) / anInt8938)) > i_675_)
						i_675_ = i_677_;
					for (/**/; i_675_ < 0; i_675_++) {
						int i_678_ = (i_674_ >> 12) * anInt8914 + (i_673_ >> 12);
						int i_679_ = i_672_++;
						if (i_116_ == 0) {
							if (i == 1)
								is[i_679_] = (anIntArray11346[aByteArray11345[i_678_] & 0xff]);
							else if (i == 0) {
								int i_680_ = (anIntArray11346[aByteArray11345[i_678_] & 0xff]);
								int i_681_ = ((i_680_ & 0xff0000) * anInt8944 & ~0xffffff);
								int i_682_ = (i_680_ & 0xff00) * anInt8945 & 0xff0000;
								int i_683_ = (i_680_ & 0xff) * anInt8946 & 0xff00;
								is[i_679_] = (i_681_ | i_682_ | i_683_) >>> 8;
							} else if (i == 3) {
								int i_684_ = (anIntArray11346[aByteArray11345[i_678_] & 0xff]);
								int i_685_ = anInt8941;
								int i_686_ = i_684_ + i_685_;
								int i_687_ = ((i_684_ & 0xff00ff) + (i_685_ & 0xff00ff));
								int i_688_ = ((i_687_ & 0x1000100) + (i_686_ - i_687_ & 0x10000));
								is[i_679_] = i_686_ - i_688_ | i_688_ - (i_688_ >>> 8);
							} else if (i == 2) {
								int i_689_ = (anIntArray11346[aByteArray11345[i_678_] & 0xff]);
								int i_690_ = ((i_689_ & 0xff00ff) * anInt8942 & ~0xff00ff);
								int i_691_ = (i_689_ & 0xff00) * anInt8942 & 0xff0000;
								is[i_679_] = ((i_690_ | i_691_) >>> 8) + anInt8949;
							} else
								throw new IllegalArgumentException();
						} else if (i_116_ == 1) {
							if (i == 1) {
								int i_692_ = aByteArray11345[i_678_];
								if (i_692_ != 0)
									is[i_679_] = anIntArray11346[i_692_ & 0xff];
							} else if (i == 0) {
								int i_693_ = aByteArray11345[i_678_];
								if (i_693_ != 0) {
									int i_694_ = anIntArray11346[i_693_ & 0xff];
									if ((anInt8941 & 0xffffff) == 16777215) {
										int i_695_ = anInt8941 >>> 24;
										int i_696_ = 256 - i_695_;
										int i_697_ = is[i_679_];
										is[i_679_] = ((((i_694_ & 0xff00ff) * i_695_ + ((i_697_ & 0xff00ff) * i_696_)) & ~0xff00ff) + (((i_694_ & 0xff00) * i_695_ + ((i_697_ & 0xff00) * i_696_)) & 0xff0000)) >> 8;
									} else if (anInt8942 != 255) {
										int i_698_ = ((i_694_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_699_ = ((i_694_ & 0xff00) * anInt8945 & 0xff0000);
										int i_700_ = ((i_694_ & 0xff) * anInt8946 & 0xff00);
										i_694_ = (i_698_ | i_699_ | i_700_) >>> 8;
										int i_701_ = is[i_679_];
										is[i_679_] = (((((i_694_ & 0xff00ff) * anInt8942) + ((i_701_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_694_ & 0xff00) * anInt8942) + ((i_701_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									} else {
										int i_702_ = ((i_694_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_703_ = ((i_694_ & 0xff00) * anInt8945 & 0xff0000);
										int i_704_ = ((i_694_ & 0xff) * anInt8946 & 0xff00);
										is[i_679_] = (i_702_ | i_703_ | i_704_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_705_ = aByteArray11345[i_678_];
								int i_706_ = i_705_ > 0 ? anIntArray11346[i_705_] : 0;
								int i_707_ = anInt8941;
								int i_708_ = i_706_ + i_707_;
								int i_709_ = ((i_706_ & 0xff00ff) + (i_707_ & 0xff00ff));
								int i_710_ = ((i_709_ & 0x1000100) + (i_708_ - i_709_ & 0x10000));
								i_710_ = i_708_ - i_710_ | i_710_ - (i_710_ >>> 8);
								if (i_706_ == 0 && anInt8942 != 255) {
									i_706_ = i_710_;
									i_710_ = is[i_679_];
									i_710_ = ((((i_706_ & 0xff00ff) * anInt8942 + (i_710_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_706_ & 0xff00) * anInt8942 + (i_710_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
								}
								is[i_679_] = i_710_;
							} else if (i == 2) {
								int i_711_ = aByteArray11345[i_678_];
								if (i_711_ != 0) {
									int i_712_ = anIntArray11346[i_711_ & 0xff];
									int i_713_ = ((i_712_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_714_ = ((i_712_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_679_++] = (((i_713_ | i_714_) >>> 8) + anInt8949);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_116_ == 2) {
							if (i == 1) {
								int i_715_ = aByteArray11345[i_678_];
								if (i_715_ != 0) {
									int i_716_ = anIntArray11346[i_715_ & 0xff];
									int i_717_ = is[i_679_];
									int i_718_ = i_716_ + i_717_;
									int i_719_ = ((i_716_ & 0xff00ff) + (i_717_ & 0xff00ff));
									i_717_ = ((i_719_ & 0x1000100) + (i_718_ - i_719_ & 0x10000));
									is[i_679_] = i_718_ - i_717_ | i_717_ - (i_717_ >>> 8);
								}
							} else if (i == 0) {
								int i_720_ = aByteArray11345[i_678_];
								if (i_720_ != 0) {
									int i_721_ = anIntArray11346[i_720_ & 0xff];
									int i_722_ = ((i_721_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_723_ = ((i_721_ & 0xff00) * anInt8945 & 0xff0000);
									int i_724_ = (i_721_ & 0xff) * anInt8946 & 0xff00;
									i_721_ = (i_722_ | i_723_ | i_724_) >>> 8;
									int i_725_ = is[i_679_];
									int i_726_ = i_721_ + i_725_;
									int i_727_ = ((i_721_ & 0xff00ff) + (i_725_ & 0xff00ff));
									i_725_ = ((i_727_ & 0x1000100) + (i_726_ - i_727_ & 0x10000));
									is[i_679_] = i_726_ - i_725_ | i_725_ - (i_725_ >>> 8);
								}
							} else if (i == 3) {
								byte i_728_ = aByteArray11345[i_678_];
								int i_729_ = i_728_ > 0 ? anIntArray11346[i_728_] : 0;
								int i_730_ = anInt8941;
								int i_731_ = i_729_ + i_730_;
								int i_732_ = ((i_729_ & 0xff00ff) + (i_730_ & 0xff00ff));
								int i_733_ = ((i_732_ & 0x1000100) + (i_731_ - i_732_ & 0x10000));
								i_733_ = i_731_ - i_733_ | i_733_ - (i_733_ >>> 8);
								if (i_729_ == 0 && anInt8942 != 255) {
									i_729_ = i_733_;
									i_733_ = is[i_679_];
									i_733_ = ((((i_729_ & 0xff00ff) * anInt8942 + (i_733_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_729_ & 0xff00) * anInt8942 + (i_733_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
								}
								is[i_679_] = i_733_;
							} else if (i == 2) {
								int i_734_ = aByteArray11345[i_678_];
								if (i_734_ != 0) {
									int i_735_ = anIntArray11346[i_734_ & 0xff];
									int i_736_ = ((i_735_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_737_ = ((i_735_ & 0xff00) * anInt8942 & 0xff0000);
									i_735_ = (((i_736_ | i_737_) >>> 8) + anInt8949);
									int i_738_ = is[i_679_];
									int i_739_ = i_735_ + i_738_;
									int i_740_ = ((i_735_ & 0xff00ff) + (i_738_ & 0xff00ff));
									i_738_ = ((i_740_ & 0x1000100) + (i_739_ - i_740_ & 0x10000));
									is[i_679_] = i_739_ - i_738_ | i_738_ - (i_738_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_673_ += anInt8940;
						i_674_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public void method2434(int i, int i_741_, int i_742_) {
		throw new IllegalStateException();
	}

	public Interface22 method2430() {
		throw new IllegalStateException();
	}

	public void method2436(int i, int i_743_, int i_744_, int i_745_, int i_746_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_747_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_743_ += anInt8918;
			int i_748_ = i_743_ * i_747_ + i;
			int i_749_ = 0;
			int i_750_ = anInt8916;
			int i_751_ = anInt8914;
			int i_752_ = i_747_ - i_751_;
			int i_753_ = 0;
			if (i_743_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_754_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_743_;
				i_750_ -= i_754_;
				i_743_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_749_ += i_754_ * i_751_;
				i_748_ += i_754_ * i_747_;
			}
			if (i_743_ + i_750_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_750_ -= (i_743_ + i_750_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_755_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_751_ -= i_755_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_749_ += i_755_;
				i_748_ += i_755_;
				i_753_ += i_755_;
				i_752_ += i_755_;
			}
			if (i + i_751_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_756_ = i + i_751_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_751_ -= i_756_;
				i_753_ += i_756_;
				i_752_ += i_756_;
			}
			if (i_751_ > 0 && i_750_ > 0) {
				if (i_746_ == 0) {
					if (i_744_ == 1) {
						for (int i_757_ = -i_750_; i_757_ < 0; i_757_++) {
							int i_758_ = i_748_ + i_751_ - 3;
							while (i_748_ < i_758_) {
								is[i_748_++] = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
								is[i_748_++] = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
								is[i_748_++] = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
								is[i_748_++] = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
							}
							i_758_ += 3;
							while (i_748_ < i_758_)
								is[i_748_++] = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 0) {
						int i_759_ = (i_745_ & 0xff0000) >> 16;
						int i_760_ = (i_745_ & 0xff00) >> 8;
						int i_761_ = i_745_ & 0xff;
						for (int i_762_ = -i_750_; i_762_ < 0; i_762_++) {
							for (int i_763_ = -i_751_; i_763_ < 0; i_763_++) {
								int i_764_ = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
								int i_765_ = (i_764_ & 0xff0000) * i_759_ & ~0xffffff;
								int i_766_ = (i_764_ & 0xff00) * i_760_ & 0xff0000;
								int i_767_ = (i_764_ & 0xff) * i_761_ & 0xff00;
								is[i_748_++] = (i_765_ | i_766_ | i_767_) >>> 8;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 3) {
						for (int i_768_ = -i_750_; i_768_ < 0; i_768_++) {
							for (int i_769_ = -i_751_; i_769_ < 0; i_769_++) {
								int i_770_ = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
								int i_771_ = i_770_ + i_745_;
								int i_772_ = ((i_770_ & 0xff00ff) + (i_745_ & 0xff00ff));
								int i_773_ = ((i_772_ & 0x1000100) + (i_771_ - i_772_ & 0x10000));
								is[i_748_++] = i_771_ - i_773_ | i_773_ - (i_773_ >>> 8);
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 2) {
						int i_774_ = i_745_ >>> 24;
						int i_775_ = 256 - i_774_;
						int i_776_ = (i_745_ & 0xff00ff) * i_775_ & ~0xff00ff;
						int i_777_ = (i_745_ & 0xff00) * i_775_ & 0xff0000;
						i_745_ = (i_776_ | i_777_) >>> 8;
						for (int i_778_ = -i_750_; i_778_ < 0; i_778_++) {
							for (int i_779_ = -i_751_; i_779_ < 0; i_779_++) {
								int i_780_ = (anIntArray11346[aByteArray11345[i_749_++] & 0xff]);
								i_776_ = (i_780_ & 0xff00ff) * i_774_ & ~0xff00ff;
								i_777_ = (i_780_ & 0xff00) * i_774_ & 0xff0000;
								is[i_748_++] = ((i_776_ | i_777_) >>> 8) + i_745_;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_746_ == 1) {
					if (i_744_ == 1) {
						for (int i_781_ = -i_750_; i_781_ < 0; i_781_++) {
							for (int i_782_ = -i_751_; i_782_ < 0; i_782_++) {
								int i_783_ = aByteArray11345[i_749_++];
								if (i_783_ != 0) {
									int i_784_ = (anIntArray11346[i_783_ & 0xff] | ~0xffffff);
									int i_785_ = 255;
									int i_786_ = 0;
									int i_787_ = is[i_748_];
									is[i_748_++] = (((((i_784_ & 0xff00ff) * i_785_ + (i_787_ & 0xff00ff) * i_786_) & ~0xff00ff) >> 8) + (((((i_784_ & ~0xff00ff) >>> 8) * i_785_) + (((i_787_ & ~0xff00ff) >>> 8) * i_786_)) & ~0xff00ff));
								} else
									i_748_++;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 0) {
						if ((i_745_ & 0xffffff) == 16777215) {
							int i_788_ = i_745_ >>> 24;
							int i_789_ = 256 - i_788_;
							for (int i_790_ = -i_750_; i_790_ < 0; i_790_++) {
								for (int i_791_ = -i_751_; i_791_ < 0; i_791_++) {
									int i_792_ = aByteArray11345[i_749_++];
									if (i_792_ != 0) {
										int i_793_ = anIntArray11346[i_792_ & 0xff];
										int i_794_ = is[i_748_];
										is[i_748_++] = ((((i_793_ & 0xff00ff) * i_788_ + ((i_794_ & 0xff00ff) * i_789_)) & ~0xff00ff) + (((i_793_ & 0xff00) * i_788_ + ((i_794_ & 0xff00) * i_789_)) & 0xff0000)) >> 8;
									} else
										i_748_++;
								}
								i_748_ += i_752_;
								i_749_ += i_753_;
							}
						} else {
							int i_795_ = (i_745_ & 0xff0000) >> 16;
							int i_796_ = (i_745_ & 0xff00) >> 8;
							int i_797_ = i_745_ & 0xff;
							int i_798_ = i_745_ >>> 24;
							int i_799_ = 256 - i_798_;
							for (int i_800_ = -i_750_; i_800_ < 0; i_800_++) {
								for (int i_801_ = -i_751_; i_801_ < 0; i_801_++) {
									int i_802_ = aByteArray11345[i_749_++];
									if (i_802_ != 0) {
										int i_803_ = anIntArray11346[i_802_ & 0xff];
										if (i_798_ != 255) {
											int i_804_ = ((i_803_ & 0xff0000) * i_795_ & ~0xffffff);
											int i_805_ = ((i_803_ & 0xff00) * i_796_ & 0xff0000);
											int i_806_ = ((i_803_ & 0xff) * i_797_ & 0xff00);
											i_803_ = (i_804_ | i_805_ | i_806_) >>> 8;
											int i_807_ = is[i_748_];
											is[i_748_++] = (((((i_803_ & 0xff00ff) * i_798_) + ((i_807_ & 0xff00ff) * i_799_)) & ~0xff00ff) + ((((i_803_ & 0xff00) * i_798_) + ((i_807_ & 0xff00) * i_799_)) & 0xff0000)) >> 8;
										} else {
											int i_808_ = ((i_803_ & 0xff0000) * i_795_ & ~0xffffff);
											int i_809_ = ((i_803_ & 0xff00) * i_796_ & 0xff0000);
											int i_810_ = ((i_803_ & 0xff) * i_797_ & 0xff00);
											is[i_748_++] = (i_808_ | i_809_ | i_810_) >>> 8;
										}
									} else
										i_748_++;
								}
								i_748_ += i_752_;
								i_749_ += i_753_;
							}
						}
					} else if (i_744_ == 3) {
						int i_811_ = i_745_ >>> 24;
						int i_812_ = 256 - i_811_;
						for (int i_813_ = -i_750_; i_813_ < 0; i_813_++) {
							for (int i_814_ = -i_751_; i_814_ < 0; i_814_++) {
								byte i_815_ = aByteArray11345[i_749_++];
								int i_816_ = i_815_ > 0 ? anIntArray11346[i_815_] : 0;
								int i_817_ = i_816_ + i_745_;
								int i_818_ = ((i_816_ & 0xff00ff) + (i_745_ & 0xff00ff));
								int i_819_ = ((i_818_ & 0x1000100) + (i_817_ - i_818_ & 0x10000));
								i_819_ = i_817_ - i_819_ | i_819_ - (i_819_ >>> 8);
								if (i_816_ == 0 && i_811_ != 255) {
									i_816_ = i_819_;
									i_819_ = is[i_748_];
									i_819_ = ((((i_816_ & 0xff00ff) * i_811_ + (i_819_ & 0xff00ff) * i_812_) & ~0xff00ff) + (((i_816_ & 0xff00) * i_811_ + (i_819_ & 0xff00) * i_812_) & 0xff0000)) >> 8;
								}
								is[i_748_++] = i_819_;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 2) {
						int i_820_ = i_745_ >>> 24;
						int i_821_ = 256 - i_820_;
						int i_822_ = (i_745_ & 0xff00ff) * i_821_ & ~0xff00ff;
						int i_823_ = (i_745_ & 0xff00) * i_821_ & 0xff0000;
						i_745_ = (i_822_ | i_823_) >>> 8;
						for (int i_824_ = -i_750_; i_824_ < 0; i_824_++) {
							for (int i_825_ = -i_751_; i_825_ < 0; i_825_++) {
								int i_826_ = aByteArray11345[i_749_++];
								if (i_826_ != 0) {
									int i_827_ = anIntArray11346[i_826_ & 0xff];
									i_822_ = ((i_827_ & 0xff00ff) * i_820_ & ~0xff00ff);
									i_823_ = ((i_827_ & 0xff00) * i_820_ & 0xff0000);
									is[i_748_++] = ((i_822_ | i_823_) >>> 8) + i_745_;
								} else
									i_748_++;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_746_ == 2) {
					if (i_744_ == 1) {
						for (int i_828_ = -i_750_; i_828_ < 0; i_828_++) {
							for (int i_829_ = -i_751_; i_829_ < 0; i_829_++) {
								int i_830_ = aByteArray11345[i_749_++];
								if (i_830_ != 0) {
									int i_831_ = anIntArray11346[i_830_ & 0xff];
									int i_832_ = is[i_748_];
									int i_833_ = i_831_ + i_832_;
									int i_834_ = ((i_831_ & 0xff00ff) + (i_832_ & 0xff00ff));
									i_832_ = ((i_834_ & 0x1000100) + (i_833_ - i_834_ & 0x10000));
									is[i_748_++] = i_833_ - i_832_ | i_832_ - (i_832_ >>> 8);
								} else
									i_748_++;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 0) {
						int i_835_ = (i_745_ & 0xff0000) >> 16;
						int i_836_ = (i_745_ & 0xff00) >> 8;
						int i_837_ = i_745_ & 0xff;
						for (int i_838_ = -i_750_; i_838_ < 0; i_838_++) {
							for (int i_839_ = -i_751_; i_839_ < 0; i_839_++) {
								int i_840_ = aByteArray11345[i_749_++];
								if (i_840_ != 0) {
									int i_841_ = anIntArray11346[i_840_ & 0xff];
									int i_842_ = ((i_841_ & 0xff0000) * i_835_ & ~0xffffff);
									int i_843_ = ((i_841_ & 0xff00) * i_836_ & 0xff0000);
									int i_844_ = (i_841_ & 0xff) * i_837_ & 0xff00;
									i_841_ = (i_842_ | i_843_ | i_844_) >>> 8;
									int i_845_ = is[i_748_];
									int i_846_ = i_841_ + i_845_;
									int i_847_ = ((i_841_ & 0xff00ff) + (i_845_ & 0xff00ff));
									i_845_ = ((i_847_ & 0x1000100) + (i_846_ - i_847_ & 0x10000));
									is[i_748_++] = i_846_ - i_845_ | i_845_ - (i_845_ >>> 8);
								} else
									i_748_++;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 3) {
						for (int i_848_ = -i_750_; i_848_ < 0; i_848_++) {
							for (int i_849_ = -i_751_; i_849_ < 0; i_849_++) {
								byte i_850_ = aByteArray11345[i_749_++];
								int i_851_ = i_850_ > 0 ? anIntArray11346[i_850_] : 0;
								int i_852_ = i_851_ + i_745_;
								int i_853_ = ((i_851_ & 0xff00ff) + (i_745_ & 0xff00ff));
								int i_854_ = ((i_853_ & 0x1000100) + (i_852_ - i_853_ & 0x10000));
								i_851_ = i_852_ - i_854_ | i_854_ - (i_854_ >>> 8);
								i_854_ = is[i_748_];
								i_852_ = i_851_ + i_854_;
								i_853_ = (i_851_ & 0xff00ff) + (i_854_ & 0xff00ff);
								i_854_ = (i_853_ & 0x1000100) + (i_852_ - i_853_ & 0x10000);
								is[i_748_++] = i_852_ - i_854_ | i_854_ - (i_854_ >>> 8);
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else if (i_744_ == 2) {
						int i_855_ = i_745_ >>> 24;
						int i_856_ = 256 - i_855_;
						int i_857_ = (i_745_ & 0xff00ff) * i_856_ & ~0xff00ff;
						int i_858_ = (i_745_ & 0xff00) * i_856_ & 0xff0000;
						i_745_ = (i_857_ | i_858_) >>> 8;
						for (int i_859_ = -i_750_; i_859_ < 0; i_859_++) {
							for (int i_860_ = -i_751_; i_860_ < 0; i_860_++) {
								int i_861_ = aByteArray11345[i_749_++];
								if (i_861_ != 0) {
									int i_862_ = anIntArray11346[i_861_ & 0xff];
									i_857_ = ((i_862_ & 0xff00ff) * i_855_ & ~0xff00ff);
									i_858_ = ((i_862_ & 0xff00) * i_855_ & 0xff0000);
									i_862_ = ((i_857_ | i_858_) >>> 8) + i_745_;
									int i_863_ = is[i_748_];
									int i_864_ = i_862_ + i_863_;
									int i_865_ = ((i_862_ & 0xff00ff) + (i_863_ & 0xff00ff));
									i_863_ = ((i_865_ & 0x1000100) + (i_864_ - i_865_ & 0x10000));
									is[i_748_++] = i_864_ - i_863_ | i_863_ - (i_863_ >>> 8);
								} else
									i_748_++;
							}
							i_748_ += i_752_;
							i_749_ += i_753_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2482(int i, int i_866_, Class145 class145, int i_867_, int i_868_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_866_ += anInt8918;
			int i_869_ = 0;
			int i_870_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_871_ = anInt8914;
			int i_872_ = anInt8916;
			int i_873_ = i_870_ - i_871_;
			int i_874_ = 0;
			int i_875_ = i + i_866_ * i_870_;
			if (i_866_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_876_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_866_;
				i_872_ -= i_876_;
				i_866_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_869_ += i_876_ * i_871_;
				i_875_ += i_876_ * i_870_;
			}
			if (i_866_ + i_872_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_872_ -= (i_866_ + i_872_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_877_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_871_ -= i_877_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_869_ += i_877_;
				i_875_ += i_877_;
				i_874_ += i_877_;
				i_873_ += i_877_;
			}
			if (i + i_871_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_878_ = i + i_871_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_871_ -= i_878_;
				i_874_ += i_878_;
				i_873_ += i_878_;
			}
			if (i_871_ > 0 && i_872_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_879_ = class145_sub1.anIntArray9521;
				int[] is_880_ = class145_sub1.anIntArray9520;
				int i_881_ = i_866_;
				if (i_868_ > i_881_) {
					i_881_ = i_868_;
					i_875_ += (i_868_ - i_866_) * i_870_;
					i_869_ += (i_868_ - i_866_) * anInt8914;
				}
				int i_882_ = (i_868_ + is_879_.length < i_866_ + i_872_ ? i_868_ + is_879_.length : i_866_ + i_872_);
				for (int i_883_ = i_881_; i_883_ < i_882_; i_883_++) {
					int i_884_ = is_879_[i_883_ - i_868_] + i_867_;
					int i_885_ = is_880_[i_883_ - i_868_];
					int i_886_ = i_871_;
					if (i > i_884_) {
						int i_887_ = i - i_884_;
						if (i_887_ >= i_885_) {
							i_869_ += i_871_ + i_874_;
							i_875_ += i_871_ + i_873_;
							continue;
						}
						i_885_ -= i_887_;
					} else {
						int i_888_ = i_884_ - i;
						if (i_888_ >= i_871_) {
							i_869_ += i_871_ + i_874_;
							i_875_ += i_871_ + i_873_;
							continue;
						}
						i_869_ += i_888_;
						i_886_ -= i_888_;
						i_875_ += i_888_;
					}
					int i_889_ = 0;
					if (i_886_ < i_885_)
						i_885_ = i_886_;
					else
						i_889_ = i_886_ - i_885_;
					for (int i_890_ = -i_885_; i_890_ < 0; i_890_++) {
						int i_891_ = aByteArray11345[i_869_++];
						if (i_891_ != 0)
							is[i_875_++] = anIntArray11346[i_891_ & 0xff];
						else
							i_875_++;
					}
					i_869_ += i_889_ + i_874_;
					i_875_ += i_889_ + i_873_;
				}
			}
		}
	}

	public void method2462(int i, int i_892_, int i_893_) {
		throw new IllegalStateException();
	}

	void method2461(int i, int i_894_, int i_895_, int i_896_, int i_897_, int i_898_, int i_899_, int i_900_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (i_895_ > 0 && i_896_ > 0) {
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (is != null) {
				int i_901_ = 0;
				int i_902_ = 0;
				int i_903_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
				int i_904_ = anInt8921 + anInt8914 + anInt8919;
				int i_905_ = anInt8918 + anInt8916 + anInt8920;
				int i_906_ = (i_904_ << 16) / i_895_;
				int i_907_ = (i_905_ << 16) / i_896_;
				if (anInt8921 > 0) {
					int i_908_ = ((anInt8921 << 16) + i_906_ - 1) / i_906_;
					i += i_908_;
					i_901_ += i_908_ * i_906_ - (anInt8921 << 16);
				}
				if (anInt8918 > 0) {
					int i_909_ = ((anInt8918 << 16) + i_907_ - 1) / i_907_;
					i_894_ += i_909_;
					i_902_ += i_909_ * i_907_ - (anInt8918 << 16);
				}
				if (anInt8914 < i_904_)
					i_895_ = ((anInt8914 << 16) - i_901_ + i_906_ - 1) / i_906_;
				if (anInt8916 < i_905_)
					i_896_ = ((anInt8916 << 16) - i_902_ + i_907_ - 1) / i_907_;
				int i_910_ = i + i_894_ * i_903_;
				int i_911_ = i_903_ - i_895_;
				if (i_894_ + i_896_ > aClass178_Sub3_8923.anInt9826 * 489020741)
					i_896_ -= (i_894_ + i_896_ - aClass178_Sub3_8923.anInt9826 * 489020741);
				if (i_894_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
					int i_912_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_894_;
					i_896_ -= i_912_;
					i_910_ += i_912_ * i_903_;
					i_902_ += i_907_ * i_912_;
				}
				if (i + i_895_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
					int i_913_ = (i + i_895_ - aClass178_Sub3_8923.anInt9809 * -272361347);
					i_895_ -= i_913_;
					i_911_ += i_913_;
				}
				if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
					int i_914_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
					i_895_ -= i_914_;
					i_910_ += i_914_;
					i_901_ += i_906_ * i_914_;
					i_911_ += i_914_;
				}
				if (i_899_ == 0) {
					if (i_897_ == 1) {
						int i_915_ = i_901_;
						for (int i_916_ = -i_896_; i_916_ < 0; i_916_++) {
							int i_917_ = (i_902_ >> 16) * anInt8914;
							for (int i_918_ = -i_895_; i_918_ < 0; i_918_++) {
								is[i_910_++] = (anIntArray11346[(aByteArray11345[(i_901_ >> 16) + i_917_]) & 0xff]);
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_915_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 0) {
						int i_919_ = (i_898_ & 0xff0000) >> 16;
						int i_920_ = (i_898_ & 0xff00) >> 8;
						int i_921_ = i_898_ & 0xff;
						int i_922_ = i_901_;
						for (int i_923_ = -i_896_; i_923_ < 0; i_923_++) {
							int i_924_ = (i_902_ >> 16) * anInt8914;
							for (int i_925_ = -i_895_; i_925_ < 0; i_925_++) {
								int i_926_ = (anIntArray11346[(aByteArray11345[(i_901_ >> 16) + i_924_]) & 0xff]);
								int i_927_ = (i_926_ & 0xff0000) * i_919_ & ~0xffffff;
								int i_928_ = (i_926_ & 0xff00) * i_920_ & 0xff0000;
								int i_929_ = (i_926_ & 0xff) * i_921_ & 0xff00;
								is[i_910_++] = (i_927_ | i_928_ | i_929_) >>> 8;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_922_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 3) {
						int i_930_ = i_901_;
						for (int i_931_ = -i_896_; i_931_ < 0; i_931_++) {
							int i_932_ = (i_902_ >> 16) * anInt8914;
							for (int i_933_ = -i_895_; i_933_ < 0; i_933_++) {
								byte i_934_ = aByteArray11345[(i_901_ >> 16) + i_932_];
								int i_935_ = i_934_ > 0 ? anIntArray11346[i_934_] : 0;
								int i_936_ = i_935_ + i_898_;
								int i_937_ = ((i_935_ & 0xff00ff) + (i_898_ & 0xff00ff));
								int i_938_ = ((i_937_ & 0x1000100) + (i_936_ - i_937_ & 0x10000));
								is[i_910_++] = i_936_ - i_938_ | i_938_ - (i_938_ >>> 8);
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_930_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 2) {
						int i_939_ = i_898_ >>> 24;
						int i_940_ = 256 - i_939_;
						int i_941_ = (i_898_ & 0xff00ff) * i_940_ & ~0xff00ff;
						int i_942_ = (i_898_ & 0xff00) * i_940_ & 0xff0000;
						i_898_ = (i_941_ | i_942_) >>> 8;
						int i_943_ = i_901_;
						for (int i_944_ = -i_896_; i_944_ < 0; i_944_++) {
							int i_945_ = (i_902_ >> 16) * anInt8914;
							for (int i_946_ = -i_895_; i_946_ < 0; i_946_++) {
								int i_947_ = (anIntArray11346[(aByteArray11345[(i_901_ >> 16) + i_945_]) & 0xff]);
								i_941_ = (i_947_ & 0xff00ff) * i_939_ & ~0xff00ff;
								i_942_ = (i_947_ & 0xff00) * i_939_ & 0xff0000;
								is[i_910_++] = ((i_941_ | i_942_) >>> 8) + i_898_;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_943_;
							i_910_ += i_911_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_899_ == 1) {
					if (i_897_ == 1) {
						int i_948_ = i_901_;
						for (int i_949_ = -i_896_; i_949_ < 0; i_949_++) {
							int i_950_ = (i_902_ >> 16) * anInt8914;
							for (int i_951_ = -i_895_; i_951_ < 0; i_951_++) {
								int i_952_ = aByteArray11345[(i_901_ >> 16) + i_950_];
								if (i_952_ != 0)
									is[i_910_++] = anIntArray11346[i_952_ & 0xff];
								else
									i_910_++;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_948_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 0) {
						int i_953_ = i_901_;
						if ((i_898_ & 0xffffff) == 16777215) {
							int i_954_ = i_898_ >>> 24;
							int i_955_ = 256 - i_954_;
							for (int i_956_ = -i_896_; i_956_ < 0; i_956_++) {
								int i_957_ = (i_902_ >> 16) * anInt8914;
								for (int i_958_ = -i_895_; i_958_ < 0; i_958_++) {
									int i_959_ = (aByteArray11345[(i_901_ >> 16) + i_957_]);
									if (i_959_ != 0) {
										int i_960_ = anIntArray11346[i_959_ & 0xff];
										int i_961_ = is[i_910_];
										is[i_910_++] = ((((i_960_ & 0xff00ff) * i_954_ + ((i_961_ & 0xff00ff) * i_955_)) & ~0xff00ff) + (((i_960_ & 0xff00) * i_954_ + ((i_961_ & 0xff00) * i_955_)) & 0xff0000)) >> 8;
									} else
										i_910_++;
									i_901_ += i_906_;
								}
								i_902_ += i_907_;
								i_901_ = i_953_;
								i_910_ += i_911_;
							}
						} else {
							int i_962_ = (i_898_ & 0xff0000) >> 16;
							int i_963_ = (i_898_ & 0xff00) >> 8;
							int i_964_ = i_898_ & 0xff;
							int i_965_ = i_898_ >>> 24;
							int i_966_ = 256 - i_965_;
							for (int i_967_ = -i_896_; i_967_ < 0; i_967_++) {
								int i_968_ = (i_902_ >> 16) * anInt8914;
								for (int i_969_ = -i_895_; i_969_ < 0; i_969_++) {
									int i_970_ = (aByteArray11345[(i_901_ >> 16) + i_968_]);
									if (i_970_ != 0) {
										int i_971_ = anIntArray11346[i_970_ & 0xff];
										if (i_965_ != 255) {
											int i_972_ = ((i_971_ & 0xff0000) * i_962_ & ~0xffffff);
											int i_973_ = ((i_971_ & 0xff00) * i_963_ & 0xff0000);
											int i_974_ = ((i_971_ & 0xff) * i_964_ & 0xff00);
											i_971_ = (i_972_ | i_973_ | i_974_) >>> 8;
											int i_975_ = is[i_910_];
											is[i_910_++] = (((((i_971_ & 0xff00ff) * i_965_) + ((i_975_ & 0xff00ff) * i_966_)) & ~0xff00ff) + ((((i_971_ & 0xff00) * i_965_) + ((i_975_ & 0xff00) * i_966_)) & 0xff0000)) >> 8;
										} else {
											int i_976_ = ((i_971_ & 0xff0000) * i_962_ & ~0xffffff);
											int i_977_ = ((i_971_ & 0xff00) * i_963_ & 0xff0000);
											int i_978_ = ((i_971_ & 0xff) * i_964_ & 0xff00);
											is[i_910_++] = (i_976_ | i_977_ | i_978_) >>> 8;
										}
									} else
										i_910_++;
									i_901_ += i_906_;
								}
								i_902_ += i_907_;
								i_901_ = i_953_;
								i_910_ += i_911_;
							}
						}
					} else if (i_897_ == 3) {
						int i_979_ = i_901_;
						int i_980_ = i_898_ >>> 24;
						int i_981_ = 256 - i_980_;
						for (int i_982_ = -i_896_; i_982_ < 0; i_982_++) {
							int i_983_ = (i_902_ >> 16) * anInt8914;
							for (int i_984_ = -i_895_; i_984_ < 0; i_984_++) {
								byte i_985_ = aByteArray11345[(i_901_ >> 16) + i_983_];
								int i_986_ = i_985_ > 0 ? anIntArray11346[i_985_] : 0;
								int i_987_ = i_986_ + i_898_;
								int i_988_ = ((i_986_ & 0xff00ff) + (i_898_ & 0xff00ff));
								int i_989_ = ((i_988_ & 0x1000100) + (i_987_ - i_988_ & 0x10000));
								i_989_ = i_987_ - i_989_ | i_989_ - (i_989_ >>> 8);
								if (i_986_ == 0 && i_980_ != 255) {
									i_986_ = i_989_;
									i_989_ = is[i_910_];
									i_989_ = ((((i_986_ & 0xff00ff) * i_980_ + (i_989_ & 0xff00ff) * i_981_) & ~0xff00ff) + (((i_986_ & 0xff00) * i_980_ + (i_989_ & 0xff00) * i_981_) & 0xff0000)) >> 8;
								}
								is[i_910_++] = i_989_;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_979_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 2) {
						int i_990_ = i_898_ >>> 24;
						int i_991_ = 256 - i_990_;
						int i_992_ = (i_898_ & 0xff00ff) * i_991_ & ~0xff00ff;
						int i_993_ = (i_898_ & 0xff00) * i_991_ & 0xff0000;
						i_898_ = (i_992_ | i_993_) >>> 8;
						int i_994_ = i_901_;
						for (int i_995_ = -i_896_; i_995_ < 0; i_995_++) {
							int i_996_ = (i_902_ >> 16) * anInt8914;
							for (int i_997_ = -i_895_; i_997_ < 0; i_997_++) {
								int i_998_ = aByteArray11345[(i_901_ >> 16) + i_996_];
								if (i_998_ != 0) {
									int i_999_ = anIntArray11346[i_998_ & 0xff];
									i_992_ = ((i_999_ & 0xff00ff) * i_990_ & ~0xff00ff);
									i_993_ = ((i_999_ & 0xff00) * i_990_ & 0xff0000);
									is[i_910_++] = ((i_992_ | i_993_) >>> 8) + i_898_;
								} else
									i_910_++;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_994_;
							i_910_ += i_911_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_899_ == 2) {
					if (i_897_ == 1) {
						int i_1000_ = i_901_;
						for (int i_1001_ = -i_896_; i_1001_ < 0; i_1001_++) {
							int i_1002_ = (i_902_ >> 16) * anInt8914;
							for (int i_1003_ = -i_895_; i_1003_ < 0; i_1003_++) {
								int i_1004_ = (aByteArray11345[(i_901_ >> 16) + i_1002_]);
								if (i_1004_ != 0) {
									int i_1005_ = anIntArray11346[i_1004_ & 0xff];
									int i_1006_ = is[i_910_];
									int i_1007_ = i_1005_ + i_1006_;
									int i_1008_ = ((i_1005_ & 0xff00ff) + (i_1006_ & 0xff00ff));
									i_1006_ = ((i_1008_ & 0x1000100) + (i_1007_ - i_1008_ & 0x10000));
									is[i_910_++] = (i_1007_ - i_1006_ | i_1006_ - (i_1006_ >>> 8));
								} else
									i_910_++;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_1000_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 0) {
						int i_1009_ = i_901_;
						int i_1010_ = (i_898_ & 0xff0000) >> 16;
						int i_1011_ = (i_898_ & 0xff00) >> 8;
						int i_1012_ = i_898_ & 0xff;
						for (int i_1013_ = -i_896_; i_1013_ < 0; i_1013_++) {
							int i_1014_ = (i_902_ >> 16) * anInt8914;
							for (int i_1015_ = -i_895_; i_1015_ < 0; i_1015_++) {
								int i_1016_ = (aByteArray11345[(i_901_ >> 16) + i_1014_]);
								if (i_1016_ != 0) {
									int i_1017_ = anIntArray11346[i_1016_ & 0xff];
									int i_1018_ = ((i_1017_ & 0xff0000) * i_1010_ & ~0xffffff);
									int i_1019_ = ((i_1017_ & 0xff00) * i_1011_ & 0xff0000);
									int i_1020_ = (i_1017_ & 0xff) * i_1012_ & 0xff00;
									i_1017_ = (i_1018_ | i_1019_ | i_1020_) >>> 8;
									int i_1021_ = is[i_910_];
									int i_1022_ = i_1017_ + i_1021_;
									int i_1023_ = ((i_1017_ & 0xff00ff) + (i_1021_ & 0xff00ff));
									i_1021_ = ((i_1023_ & 0x1000100) + (i_1022_ - i_1023_ & 0x10000));
									is[i_910_++] = (i_1022_ - i_1021_ | i_1021_ - (i_1021_ >>> 8));
								} else
									i_910_++;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_1009_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 3) {
						int i_1024_ = i_901_;
						for (int i_1025_ = -i_896_; i_1025_ < 0; i_1025_++) {
							int i_1026_ = (i_902_ >> 16) * anInt8914;
							for (int i_1027_ = -i_895_; i_1027_ < 0; i_1027_++) {
								byte i_1028_ = (aByteArray11345[(i_901_ >> 16) + i_1026_]);
								int i_1029_ = (i_1028_ > 0 ? anIntArray11346[i_1028_] : 0);
								int i_1030_ = i_1029_ + i_898_;
								int i_1031_ = ((i_1029_ & 0xff00ff) + (i_898_ & 0xff00ff));
								int i_1032_ = ((i_1031_ & 0x1000100) + (i_1030_ - i_1031_ & 0x10000));
								i_1029_ = i_1030_ - i_1032_ | i_1032_ - (i_1032_ >>> 8);
								i_1032_ = is[i_910_];
								i_1030_ = i_1029_ + i_1032_;
								i_1031_ = (i_1029_ & 0xff00ff) + (i_1032_ & 0xff00ff);
								i_1032_ = ((i_1031_ & 0x1000100) + (i_1030_ - i_1031_ & 0x10000));
								is[i_910_++] = i_1030_ - i_1032_ | i_1032_ - (i_1032_ >>> 8);
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_1024_;
							i_910_ += i_911_;
						}
					} else if (i_897_ == 2) {
						int i_1033_ = i_898_ >>> 24;
						int i_1034_ = 256 - i_1033_;
						int i_1035_ = (i_898_ & 0xff00ff) * i_1034_ & ~0xff00ff;
						int i_1036_ = (i_898_ & 0xff00) * i_1034_ & 0xff0000;
						i_898_ = (i_1035_ | i_1036_) >>> 8;
						int i_1037_ = i_901_;
						for (int i_1038_ = -i_896_; i_1038_ < 0; i_1038_++) {
							int i_1039_ = (i_902_ >> 16) * anInt8914;
							for (int i_1040_ = -i_895_; i_1040_ < 0; i_1040_++) {
								int i_1041_ = (aByteArray11345[(i_901_ >> 16) + i_1039_]);
								if (i_1041_ != 0) {
									int i_1042_ = anIntArray11346[i_1041_ & 0xff];
									i_1035_ = ((i_1042_ & 0xff00ff) * i_1033_ & ~0xff00ff);
									i_1036_ = ((i_1042_ & 0xff00) * i_1033_ & 0xff0000);
									i_1042_ = ((i_1035_ | i_1036_) >>> 8) + i_898_;
									int i_1043_ = is[i_910_];
									int i_1044_ = i_1042_ + i_1043_;
									int i_1045_ = ((i_1042_ & 0xff00ff) + (i_1043_ & 0xff00ff));
									i_1043_ = ((i_1045_ & 0x1000100) + (i_1044_ - i_1045_ & 0x10000));
									is[i_910_++] = (i_1044_ - i_1043_ | i_1043_ - (i_1043_ >>> 8));
								} else
									i_910_++;
								i_901_ += i_906_;
							}
							i_902_ += i_907_;
							i_901_ = i_1037_;
							i_910_ += i_911_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method14404(int i, int i_1046_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_1047_ = anInt8928;
					while (i_1047_ < 0) {
						int i_1048_ = anInt8930;
						int i_1049_ = anInt8937;
						int i_1050_ = anInt8936;
						int i_1051_ = anInt8926;
						if (i_1049_ >= 0 && i_1050_ >= 0 && i_1049_ - (anInt8914 << 12) < 0 && i_1050_ - (anInt8916 << 12) < 0) {
							for (/**/; i_1051_ < 0; i_1051_++) {
								int i_1052_ = ((i_1050_ >> 12) * anInt8914 + (i_1049_ >> 12));
								int i_1053_ = i_1048_++;
								if (i_1046_ == 0) {
									if (i == 1)
										is[i_1053_] = (anIntArray11346[(aByteArray11345[i_1052_] & 0xff)]);
									else if (i == 0) {
										int i_1054_ = (anIntArray11346[(aByteArray11345[i_1052_] & 0xff)]);
										int i_1055_ = ((i_1054_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1056_ = ((i_1054_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1057_ = ((i_1054_ & 0xff) * anInt8946 & 0xff00);
										is[i_1053_] = (i_1055_ | i_1056_ | i_1057_) >>> 8;
									} else if (i == 3) {
										int i_1058_ = (anIntArray11346[(aByteArray11345[i_1052_] & 0xff)]);
										int i_1059_ = anInt8941;
										int i_1060_ = i_1058_ + i_1059_;
										int i_1061_ = ((i_1058_ & 0xff00ff) + (i_1059_ & 0xff00ff));
										int i_1062_ = ((i_1061_ & 0x1000100) + (i_1060_ - i_1061_ & 0x10000));
										is[i_1053_] = (i_1060_ - i_1062_ | i_1062_ - (i_1062_ >>> 8));
									} else if (i == 2) {
										int i_1063_ = (anIntArray11346[(aByteArray11345[i_1052_] & 0xff)]);
										int i_1064_ = ((i_1063_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1065_ = ((i_1063_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1053_] = ((i_1064_ | i_1065_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 1) {
									if (i == 1) {
										int i_1066_ = aByteArray11345[i_1052_];
										if (i_1066_ != 0)
											is[i_1053_] = (anIntArray11346[i_1066_ & 0xff]);
									} else if (i == 0) {
										int i_1067_ = aByteArray11345[i_1052_];
										if (i_1067_ != 0) {
											int i_1068_ = (anIntArray11346[i_1067_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_1069_ = anInt8941 >>> 24;
												int i_1070_ = 256 - i_1069_;
												int i_1071_ = is[i_1053_];
												is[i_1053_] = (((((i_1068_ & 0xff00ff) * i_1069_) + ((i_1071_ & 0xff00ff) * i_1070_)) & ~0xff00ff) + ((((i_1068_ & 0xff00) * i_1069_) + ((i_1071_ & 0xff00) * i_1070_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_1072_ = (((i_1068_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1073_ = (((i_1068_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1074_ = (((i_1068_ & 0xff) * anInt8946) & 0xff00);
												i_1068_ = (i_1072_ | i_1073_ | i_1074_) >>> 8;
												int i_1075_ = is[i_1053_];
												is[i_1053_] = (((((i_1068_ & 0xff00ff) * anInt8942) + ((i_1075_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1068_ & 0xff00) * anInt8942) + ((i_1075_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_1076_ = (((i_1068_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1077_ = (((i_1068_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1078_ = (((i_1068_ & 0xff) * anInt8946) & 0xff00);
												is[i_1053_] = (i_1076_ | i_1077_ | i_1078_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1079_ = aByteArray11345[i_1052_];
										int i_1080_ = (i_1079_ > 0 ? anIntArray11346[i_1079_] : 0);
										int i_1081_ = anInt8941;
										int i_1082_ = i_1080_ + i_1081_;
										int i_1083_ = ((i_1080_ & 0xff00ff) + (i_1081_ & 0xff00ff));
										int i_1084_ = ((i_1083_ & 0x1000100) + (i_1082_ - i_1083_ & 0x10000));
										i_1084_ = (i_1082_ - i_1084_ | i_1084_ - (i_1084_ >>> 8));
										if (i_1080_ == 0 && anInt8942 != 255) {
											i_1080_ = i_1084_;
											i_1084_ = is[i_1053_];
											i_1084_ = (((((i_1080_ & 0xff00ff) * anInt8942) + ((i_1084_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1080_ & 0xff00) * anInt8942) + ((i_1084_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1053_] = i_1084_;
									} else if (i == 2) {
										int i_1085_ = aByteArray11345[i_1052_];
										if (i_1085_ != 0) {
											int i_1086_ = (anIntArray11346[i_1085_ & 0xff]);
											int i_1087_ = (((i_1086_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1088_ = (((i_1086_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_1053_++] = (((i_1087_ | i_1088_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 2) {
									if (i == 1) {
										int i_1089_ = aByteArray11345[i_1052_];
										if (i_1089_ != 0) {
											int i_1090_ = (anIntArray11346[i_1089_ & 0xff]);
											int i_1091_ = is[i_1053_];
											int i_1092_ = i_1090_ + i_1091_;
											int i_1093_ = ((i_1090_ & 0xff00ff) + (i_1091_ & 0xff00ff));
											i_1091_ = ((i_1093_ & 0x1000100) + (i_1092_ - i_1093_ & 0x10000));
											is[i_1053_] = (i_1092_ - i_1091_ | i_1091_ - (i_1091_ >>> 8));
										}
									} else if (i == 0) {
										int i_1094_ = aByteArray11345[i_1052_];
										if (i_1094_ != 0) {
											int i_1095_ = (anIntArray11346[i_1094_ & 0xff]);
											int i_1096_ = (((i_1095_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1097_ = (((i_1095_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1098_ = ((i_1095_ & 0xff) * anInt8946 & 0xff00);
											i_1095_ = (i_1096_ | i_1097_ | i_1098_) >>> 8;
											int i_1099_ = is[i_1053_];
											int i_1100_ = i_1095_ + i_1099_;
											int i_1101_ = ((i_1095_ & 0xff00ff) + (i_1099_ & 0xff00ff));
											i_1099_ = ((i_1101_ & 0x1000100) + (i_1100_ - i_1101_ & 0x10000));
											is[i_1053_] = (i_1100_ - i_1099_ | i_1099_ - (i_1099_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1102_ = aByteArray11345[i_1052_];
										int i_1103_ = (i_1102_ > 0 ? anIntArray11346[i_1102_] : 0);
										int i_1104_ = anInt8941;
										int i_1105_ = i_1103_ + i_1104_;
										int i_1106_ = ((i_1103_ & 0xff00ff) + (i_1104_ & 0xff00ff));
										int i_1107_ = ((i_1106_ & 0x1000100) + (i_1105_ - i_1106_ & 0x10000));
										i_1107_ = (i_1105_ - i_1107_ | i_1107_ - (i_1107_ >>> 8));
										if (i_1103_ == 0 && anInt8942 != 255) {
											i_1103_ = i_1107_;
											i_1107_ = is[i_1053_];
											i_1107_ = (((((i_1103_ & 0xff00ff) * anInt8942) + ((i_1107_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1103_ & 0xff00) * anInt8942) + ((i_1107_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1053_] = i_1107_;
									} else if (i == 2) {
										int i_1108_ = aByteArray11345[i_1052_];
										if (i_1108_ != 0) {
											int i_1109_ = (anIntArray11346[i_1108_ & 0xff]);
											int i_1110_ = (((i_1109_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1111_ = (((i_1109_ & 0xff00) * anInt8942) & 0xff0000);
											i_1109_ = ((i_1110_ | i_1111_) >>> 8) + anInt8949;
											int i_1112_ = is[i_1053_];
											int i_1113_ = i_1109_ + i_1112_;
											int i_1114_ = ((i_1109_ & 0xff00ff) + (i_1112_ & 0xff00ff));
											i_1112_ = ((i_1114_ & 0x1000100) + (i_1113_ - i_1114_ & 0x10000));
											is[i_1053_] = (i_1113_ - i_1112_ | i_1112_ - (i_1112_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_1047_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_1115_ = anInt8928;
					while (i_1115_ < 0) {
						int i_1116_ = anInt8930;
						int i_1117_ = anInt8937;
						int i_1118_ = anInt8936 + anInt8925;
						int i_1119_ = anInt8926;
						if (i_1117_ >= 0 && i_1117_ - (anInt8914 << 12) < 0) {
							int i_1120_;
							if ((i_1120_ = i_1118_ - (anInt8916 << 12)) >= 0) {
								i_1120_ = (anInt8938 - i_1120_) / anInt8938;
								i_1119_ += i_1120_;
								i_1118_ += anInt8938 * i_1120_;
								i_1116_ += i_1120_;
							}
							if ((i_1120_ = (i_1118_ - anInt8938) / anInt8938) > i_1119_)
								i_1119_ = i_1120_;
							for (/**/; i_1119_ < 0; i_1119_++) {
								int i_1121_ = ((i_1118_ >> 12) * anInt8914 + (i_1117_ >> 12));
								int i_1122_ = i_1116_++;
								if (i_1046_ == 0) {
									if (i == 1)
										is[i_1122_] = (anIntArray11346[(aByteArray11345[i_1121_] & 0xff)]);
									else if (i == 0) {
										int i_1123_ = (anIntArray11346[(aByteArray11345[i_1121_] & 0xff)]);
										int i_1124_ = ((i_1123_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1125_ = ((i_1123_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1126_ = ((i_1123_ & 0xff) * anInt8946 & 0xff00);
										is[i_1122_] = (i_1124_ | i_1125_ | i_1126_) >>> 8;
									} else if (i == 3) {
										int i_1127_ = (anIntArray11346[(aByteArray11345[i_1121_] & 0xff)]);
										int i_1128_ = anInt8941;
										int i_1129_ = i_1127_ + i_1128_;
										int i_1130_ = ((i_1127_ & 0xff00ff) + (i_1128_ & 0xff00ff));
										int i_1131_ = ((i_1130_ & 0x1000100) + (i_1129_ - i_1130_ & 0x10000));
										is[i_1122_] = (i_1129_ - i_1131_ | i_1131_ - (i_1131_ >>> 8));
									} else if (i == 2) {
										int i_1132_ = (anIntArray11346[(aByteArray11345[i_1121_] & 0xff)]);
										int i_1133_ = ((i_1132_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1134_ = ((i_1132_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1122_] = ((i_1133_ | i_1134_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 1) {
									if (i == 1) {
										int i_1135_ = aByteArray11345[i_1121_];
										if (i_1135_ != 0)
											is[i_1122_] = (anIntArray11346[i_1135_ & 0xff]);
									} else if (i == 0) {
										int i_1136_ = aByteArray11345[i_1121_];
										if (i_1136_ != 0) {
											int i_1137_ = (anIntArray11346[i_1136_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_1138_ = anInt8941 >>> 24;
												int i_1139_ = 256 - i_1138_;
												int i_1140_ = is[i_1122_];
												is[i_1122_] = (((((i_1137_ & 0xff00ff) * i_1138_) + ((i_1140_ & 0xff00ff) * i_1139_)) & ~0xff00ff) + ((((i_1137_ & 0xff00) * i_1138_) + ((i_1140_ & 0xff00) * i_1139_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_1141_ = (((i_1137_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1142_ = (((i_1137_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1143_ = (((i_1137_ & 0xff) * anInt8946) & 0xff00);
												i_1137_ = (i_1141_ | i_1142_ | i_1143_) >>> 8;
												int i_1144_ = is[i_1122_];
												is[i_1122_] = (((((i_1137_ & 0xff00ff) * anInt8942) + ((i_1144_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1137_ & 0xff00) * anInt8942) + ((i_1144_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_1145_ = (((i_1137_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1146_ = (((i_1137_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1147_ = (((i_1137_ & 0xff) * anInt8946) & 0xff00);
												is[i_1122_] = (i_1145_ | i_1146_ | i_1147_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1148_ = aByteArray11345[i_1121_];
										int i_1149_ = (i_1148_ > 0 ? anIntArray11346[i_1148_] : 0);
										int i_1150_ = anInt8941;
										int i_1151_ = i_1149_ + i_1150_;
										int i_1152_ = ((i_1149_ & 0xff00ff) + (i_1150_ & 0xff00ff));
										int i_1153_ = ((i_1152_ & 0x1000100) + (i_1151_ - i_1152_ & 0x10000));
										i_1153_ = (i_1151_ - i_1153_ | i_1153_ - (i_1153_ >>> 8));
										if (i_1149_ == 0 && anInt8942 != 255) {
											i_1149_ = i_1153_;
											i_1153_ = is[i_1122_];
											i_1153_ = (((((i_1149_ & 0xff00ff) * anInt8942) + ((i_1153_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1149_ & 0xff00) * anInt8942) + ((i_1153_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1122_] = i_1153_;
									} else if (i == 2) {
										int i_1154_ = aByteArray11345[i_1121_];
										if (i_1154_ != 0) {
											int i_1155_ = (anIntArray11346[i_1154_ & 0xff]);
											int i_1156_ = (((i_1155_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1157_ = (((i_1155_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_1122_++] = (((i_1156_ | i_1157_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 2) {
									if (i == 1) {
										int i_1158_ = aByteArray11345[i_1121_];
										if (i_1158_ != 0) {
											int i_1159_ = (anIntArray11346[i_1158_ & 0xff]);
											int i_1160_ = is[i_1122_];
											int i_1161_ = i_1159_ + i_1160_;
											int i_1162_ = ((i_1159_ & 0xff00ff) + (i_1160_ & 0xff00ff));
											i_1160_ = ((i_1162_ & 0x1000100) + (i_1161_ - i_1162_ & 0x10000));
											is[i_1122_] = (i_1161_ - i_1160_ | i_1160_ - (i_1160_ >>> 8));
										}
									} else if (i == 0) {
										int i_1163_ = aByteArray11345[i_1121_];
										if (i_1163_ != 0) {
											int i_1164_ = (anIntArray11346[i_1163_ & 0xff]);
											int i_1165_ = (((i_1164_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1166_ = (((i_1164_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1167_ = ((i_1164_ & 0xff) * anInt8946 & 0xff00);
											i_1164_ = (i_1165_ | i_1166_ | i_1167_) >>> 8;
											int i_1168_ = is[i_1122_];
											int i_1169_ = i_1164_ + i_1168_;
											int i_1170_ = ((i_1164_ & 0xff00ff) + (i_1168_ & 0xff00ff));
											i_1168_ = ((i_1170_ & 0x1000100) + (i_1169_ - i_1170_ & 0x10000));
											is[i_1122_] = (i_1169_ - i_1168_ | i_1168_ - (i_1168_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1171_ = aByteArray11345[i_1121_];
										int i_1172_ = (i_1171_ > 0 ? anIntArray11346[i_1171_] : 0);
										int i_1173_ = anInt8941;
										int i_1174_ = i_1172_ + i_1173_;
										int i_1175_ = ((i_1172_ & 0xff00ff) + (i_1173_ & 0xff00ff));
										int i_1176_ = ((i_1175_ & 0x1000100) + (i_1174_ - i_1175_ & 0x10000));
										i_1176_ = (i_1174_ - i_1176_ | i_1176_ - (i_1176_ >>> 8));
										if (i_1172_ == 0 && anInt8942 != 255) {
											i_1172_ = i_1176_;
											i_1176_ = is[i_1122_];
											i_1176_ = (((((i_1172_ & 0xff00ff) * anInt8942) + ((i_1176_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1172_ & 0xff00) * anInt8942) + ((i_1176_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1122_] = i_1176_;
									} else if (i == 2) {
										int i_1177_ = aByteArray11345[i_1121_];
										if (i_1177_ != 0) {
											int i_1178_ = (anIntArray11346[i_1177_ & 0xff]);
											int i_1179_ = (((i_1178_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1180_ = (((i_1178_ & 0xff00) * anInt8942) & 0xff0000);
											i_1178_ = ((i_1179_ | i_1180_) >>> 8) + anInt8949;
											int i_1181_ = is[i_1122_];
											int i_1182_ = i_1178_ + i_1181_;
											int i_1183_ = ((i_1178_ & 0xff00ff) + (i_1181_ & 0xff00ff));
											i_1181_ = ((i_1183_ & 0x1000100) + (i_1182_ - i_1183_ & 0x10000));
											is[i_1122_] = (i_1182_ - i_1181_ | i_1181_ - (i_1181_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1118_ += anInt8938;
							}
						}
						i_1115_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_1184_ = anInt8928;
					while (i_1184_ < 0) {
						int i_1185_ = anInt8930;
						int i_1186_ = anInt8937;
						int i_1187_ = anInt8936 + anInt8925;
						int i_1188_ = anInt8926;
						if (i_1186_ >= 0 && i_1186_ - (anInt8914 << 12) < 0) {
							if (i_1187_ < 0) {
								int i_1189_ = (anInt8938 - 1 - i_1187_) / anInt8938;
								i_1188_ += i_1189_;
								i_1187_ += anInt8938 * i_1189_;
								i_1185_ += i_1189_;
							}
							int i_1190_;
							if ((i_1190_ = (1 + i_1187_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1188_)
								i_1188_ = i_1190_;
							for (/**/; i_1188_ < 0; i_1188_++) {
								int i_1191_ = ((i_1187_ >> 12) * anInt8914 + (i_1186_ >> 12));
								int i_1192_ = i_1185_++;
								if (i_1046_ == 0) {
									if (i == 1)
										is[i_1192_] = (anIntArray11346[(aByteArray11345[i_1191_] & 0xff)]);
									else if (i == 0) {
										int i_1193_ = (anIntArray11346[(aByteArray11345[i_1191_] & 0xff)]);
										int i_1194_ = ((i_1193_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1195_ = ((i_1193_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1196_ = ((i_1193_ & 0xff) * anInt8946 & 0xff00);
										is[i_1192_] = (i_1194_ | i_1195_ | i_1196_) >>> 8;
									} else if (i == 3) {
										int i_1197_ = (anIntArray11346[(aByteArray11345[i_1191_] & 0xff)]);
										int i_1198_ = anInt8941;
										int i_1199_ = i_1197_ + i_1198_;
										int i_1200_ = ((i_1197_ & 0xff00ff) + (i_1198_ & 0xff00ff));
										int i_1201_ = ((i_1200_ & 0x1000100) + (i_1199_ - i_1200_ & 0x10000));
										is[i_1192_] = (i_1199_ - i_1201_ | i_1201_ - (i_1201_ >>> 8));
									} else if (i == 2) {
										int i_1202_ = (anIntArray11346[(aByteArray11345[i_1191_] & 0xff)]);
										int i_1203_ = ((i_1202_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1204_ = ((i_1202_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1192_] = ((i_1203_ | i_1204_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 1) {
									if (i == 1) {
										int i_1205_ = aByteArray11345[i_1191_];
										if (i_1205_ != 0)
											is[i_1192_] = (anIntArray11346[i_1205_ & 0xff]);
									} else if (i == 0) {
										int i_1206_ = aByteArray11345[i_1191_];
										if (i_1206_ != 0) {
											int i_1207_ = (anIntArray11346[i_1206_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_1208_ = anInt8941 >>> 24;
												int i_1209_ = 256 - i_1208_;
												int i_1210_ = is[i_1192_];
												is[i_1192_] = (((((i_1207_ & 0xff00ff) * i_1208_) + ((i_1210_ & 0xff00ff) * i_1209_)) & ~0xff00ff) + ((((i_1207_ & 0xff00) * i_1208_) + ((i_1210_ & 0xff00) * i_1209_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_1211_ = (((i_1207_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1212_ = (((i_1207_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1213_ = (((i_1207_ & 0xff) * anInt8946) & 0xff00);
												i_1207_ = (i_1211_ | i_1212_ | i_1213_) >>> 8;
												int i_1214_ = is[i_1192_];
												is[i_1192_] = (((((i_1207_ & 0xff00ff) * anInt8942) + ((i_1214_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1207_ & 0xff00) * anInt8942) + ((i_1214_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_1215_ = (((i_1207_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1216_ = (((i_1207_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1217_ = (((i_1207_ & 0xff) * anInt8946) & 0xff00);
												is[i_1192_] = (i_1215_ | i_1216_ | i_1217_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1218_ = aByteArray11345[i_1191_];
										int i_1219_ = (i_1218_ > 0 ? anIntArray11346[i_1218_] : 0);
										int i_1220_ = anInt8941;
										int i_1221_ = i_1219_ + i_1220_;
										int i_1222_ = ((i_1219_ & 0xff00ff) + (i_1220_ & 0xff00ff));
										int i_1223_ = ((i_1222_ & 0x1000100) + (i_1221_ - i_1222_ & 0x10000));
										i_1223_ = (i_1221_ - i_1223_ | i_1223_ - (i_1223_ >>> 8));
										if (i_1219_ == 0 && anInt8942 != 255) {
											i_1219_ = i_1223_;
											i_1223_ = is[i_1192_];
											i_1223_ = (((((i_1219_ & 0xff00ff) * anInt8942) + ((i_1223_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1219_ & 0xff00) * anInt8942) + ((i_1223_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1192_] = i_1223_;
									} else if (i == 2) {
										int i_1224_ = aByteArray11345[i_1191_];
										if (i_1224_ != 0) {
											int i_1225_ = (anIntArray11346[i_1224_ & 0xff]);
											int i_1226_ = (((i_1225_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1227_ = (((i_1225_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_1192_++] = (((i_1226_ | i_1227_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 2) {
									if (i == 1) {
										int i_1228_ = aByteArray11345[i_1191_];
										if (i_1228_ != 0) {
											int i_1229_ = (anIntArray11346[i_1228_ & 0xff]);
											int i_1230_ = is[i_1192_];
											int i_1231_ = i_1229_ + i_1230_;
											int i_1232_ = ((i_1229_ & 0xff00ff) + (i_1230_ & 0xff00ff));
											i_1230_ = ((i_1232_ & 0x1000100) + (i_1231_ - i_1232_ & 0x10000));
											is[i_1192_] = (i_1231_ - i_1230_ | i_1230_ - (i_1230_ >>> 8));
										}
									} else if (i == 0) {
										int i_1233_ = aByteArray11345[i_1191_];
										if (i_1233_ != 0) {
											int i_1234_ = (anIntArray11346[i_1233_ & 0xff]);
											int i_1235_ = (((i_1234_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1236_ = (((i_1234_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1237_ = ((i_1234_ & 0xff) * anInt8946 & 0xff00);
											i_1234_ = (i_1235_ | i_1236_ | i_1237_) >>> 8;
											int i_1238_ = is[i_1192_];
											int i_1239_ = i_1234_ + i_1238_;
											int i_1240_ = ((i_1234_ & 0xff00ff) + (i_1238_ & 0xff00ff));
											i_1238_ = ((i_1240_ & 0x1000100) + (i_1239_ - i_1240_ & 0x10000));
											is[i_1192_] = (i_1239_ - i_1238_ | i_1238_ - (i_1238_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1241_ = aByteArray11345[i_1191_];
										int i_1242_ = (i_1241_ > 0 ? anIntArray11346[i_1241_] : 0);
										int i_1243_ = anInt8941;
										int i_1244_ = i_1242_ + i_1243_;
										int i_1245_ = ((i_1242_ & 0xff00ff) + (i_1243_ & 0xff00ff));
										int i_1246_ = ((i_1245_ & 0x1000100) + (i_1244_ - i_1245_ & 0x10000));
										i_1246_ = (i_1244_ - i_1246_ | i_1246_ - (i_1246_ >>> 8));
										if (i_1242_ == 0 && anInt8942 != 255) {
											i_1242_ = i_1246_;
											i_1246_ = is[i_1192_];
											i_1246_ = (((((i_1242_ & 0xff00ff) * anInt8942) + ((i_1246_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1242_ & 0xff00) * anInt8942) + ((i_1246_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1192_] = i_1246_;
									} else if (i == 2) {
										int i_1247_ = aByteArray11345[i_1191_];
										if (i_1247_ != 0) {
											int i_1248_ = (anIntArray11346[i_1247_ & 0xff]);
											int i_1249_ = (((i_1248_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1250_ = (((i_1248_ & 0xff00) * anInt8942) & 0xff0000);
											i_1248_ = ((i_1249_ | i_1250_) >>> 8) + anInt8949;
											int i_1251_ = is[i_1192_];
											int i_1252_ = i_1248_ + i_1251_;
											int i_1253_ = ((i_1248_ & 0xff00ff) + (i_1251_ & 0xff00ff));
											i_1251_ = ((i_1253_ & 0x1000100) + (i_1252_ - i_1253_ & 0x10000));
											is[i_1192_] = (i_1252_ - i_1251_ | i_1251_ - (i_1251_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1187_ += anInt8938;
							}
						}
						i_1184_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_1254_ = anInt8928;
					while (i_1254_ < 0) {
						int i_1255_ = anInt8930;
						int i_1256_ = anInt8937 + anInt8939;
						int i_1257_ = anInt8936;
						int i_1258_ = anInt8926;
						if (i_1257_ >= 0 && i_1257_ - (anInt8916 << 12) < 0) {
							int i_1259_;
							if ((i_1259_ = i_1256_ - (anInt8914 << 12)) >= 0) {
								i_1259_ = (anInt8940 - i_1259_) / anInt8940;
								i_1258_ += i_1259_;
								i_1256_ += anInt8940 * i_1259_;
								i_1255_ += i_1259_;
							}
							if ((i_1259_ = (i_1256_ - anInt8940) / anInt8940) > i_1258_)
								i_1258_ = i_1259_;
							for (/**/; i_1258_ < 0; i_1258_++) {
								int i_1260_ = ((i_1257_ >> 12) * anInt8914 + (i_1256_ >> 12));
								int i_1261_ = i_1255_++;
								if (i_1046_ == 0) {
									if (i == 1)
										is[i_1261_] = (anIntArray11346[(aByteArray11345[i_1260_] & 0xff)]);
									else if (i == 0) {
										int i_1262_ = (anIntArray11346[(aByteArray11345[i_1260_] & 0xff)]);
										int i_1263_ = ((i_1262_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1264_ = ((i_1262_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1265_ = ((i_1262_ & 0xff) * anInt8946 & 0xff00);
										is[i_1261_] = (i_1263_ | i_1264_ | i_1265_) >>> 8;
									} else if (i == 3) {
										int i_1266_ = (anIntArray11346[(aByteArray11345[i_1260_] & 0xff)]);
										int i_1267_ = anInt8941;
										int i_1268_ = i_1266_ + i_1267_;
										int i_1269_ = ((i_1266_ & 0xff00ff) + (i_1267_ & 0xff00ff));
										int i_1270_ = ((i_1269_ & 0x1000100) + (i_1268_ - i_1269_ & 0x10000));
										is[i_1261_] = (i_1268_ - i_1270_ | i_1270_ - (i_1270_ >>> 8));
									} else if (i == 2) {
										int i_1271_ = (anIntArray11346[(aByteArray11345[i_1260_] & 0xff)]);
										int i_1272_ = ((i_1271_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1273_ = ((i_1271_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1261_] = ((i_1272_ | i_1273_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 1) {
									if (i == 1) {
										int i_1274_ = aByteArray11345[i_1260_];
										if (i_1274_ != 0)
											is[i_1261_] = (anIntArray11346[i_1274_ & 0xff]);
									} else if (i == 0) {
										int i_1275_ = aByteArray11345[i_1260_];
										if (i_1275_ != 0) {
											int i_1276_ = (anIntArray11346[i_1275_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_1277_ = anInt8941 >>> 24;
												int i_1278_ = 256 - i_1277_;
												int i_1279_ = is[i_1261_];
												is[i_1261_] = (((((i_1276_ & 0xff00ff) * i_1277_) + ((i_1279_ & 0xff00ff) * i_1278_)) & ~0xff00ff) + ((((i_1276_ & 0xff00) * i_1277_) + ((i_1279_ & 0xff00) * i_1278_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_1280_ = (((i_1276_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1281_ = (((i_1276_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1282_ = (((i_1276_ & 0xff) * anInt8946) & 0xff00);
												i_1276_ = (i_1280_ | i_1281_ | i_1282_) >>> 8;
												int i_1283_ = is[i_1261_];
												is[i_1261_] = (((((i_1276_ & 0xff00ff) * anInt8942) + ((i_1283_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1276_ & 0xff00) * anInt8942) + ((i_1283_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_1284_ = (((i_1276_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_1285_ = (((i_1276_ & 0xff00) * anInt8945) & 0xff0000);
												int i_1286_ = (((i_1276_ & 0xff) * anInt8946) & 0xff00);
												is[i_1261_] = (i_1284_ | i_1285_ | i_1286_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_1287_ = aByteArray11345[i_1260_];
										int i_1288_ = (i_1287_ > 0 ? anIntArray11346[i_1287_] : 0);
										int i_1289_ = anInt8941;
										int i_1290_ = i_1288_ + i_1289_;
										int i_1291_ = ((i_1288_ & 0xff00ff) + (i_1289_ & 0xff00ff));
										int i_1292_ = ((i_1291_ & 0x1000100) + (i_1290_ - i_1291_ & 0x10000));
										i_1292_ = (i_1290_ - i_1292_ | i_1292_ - (i_1292_ >>> 8));
										if (i_1288_ == 0 && anInt8942 != 255) {
											i_1288_ = i_1292_;
											i_1292_ = is[i_1261_];
											i_1292_ = (((((i_1288_ & 0xff00ff) * anInt8942) + ((i_1292_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1288_ & 0xff00) * anInt8942) + ((i_1292_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1261_] = i_1292_;
									} else if (i == 2) {
										int i_1293_ = aByteArray11345[i_1260_];
										if (i_1293_ != 0) {
											int i_1294_ = (anIntArray11346[i_1293_ & 0xff]);
											int i_1295_ = (((i_1294_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1296_ = (((i_1294_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_1261_++] = (((i_1295_ | i_1296_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_1046_ == 2) {
									if (i == 1) {
										int i_1297_ = aByteArray11345[i_1260_];
										if (i_1297_ != 0) {
											int i_1298_ = (anIntArray11346[i_1297_ & 0xff]);
											int i_1299_ = is[i_1261_];
											int i_1300_ = i_1298_ + i_1299_;
											int i_1301_ = ((i_1298_ & 0xff00ff) + (i_1299_ & 0xff00ff));
											i_1299_ = ((i_1301_ & 0x1000100) + (i_1300_ - i_1301_ & 0x10000));
											is[i_1261_] = (i_1300_ - i_1299_ | i_1299_ - (i_1299_ >>> 8));
										}
									} else if (i == 0) {
										int i_1302_ = aByteArray11345[i_1260_];
										if (i_1302_ != 0) {
											int i_1303_ = (anIntArray11346[i_1302_ & 0xff]);
											int i_1304_ = (((i_1303_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1305_ = (((i_1303_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1306_ = ((i_1303_ & 0xff) * anInt8946 & 0xff00);
											i_1303_ = (i_1304_ | i_1305_ | i_1306_) >>> 8;
											int i_1307_ = is[i_1261_];
											int i_1308_ = i_1303_ + i_1307_;
											int i_1309_ = ((i_1303_ & 0xff00ff) + (i_1307_ & 0xff00ff));
											i_1307_ = ((i_1309_ & 0x1000100) + (i_1308_ - i_1309_ & 0x10000));
											is[i_1261_] = (i_1308_ - i_1307_ | i_1307_ - (i_1307_ >>> 8));
										}
									} else if (i == 3) {
										byte i_1310_ = aByteArray11345[i_1260_];
										int i_1311_ = (i_1310_ > 0 ? anIntArray11346[i_1310_] : 0);
										int i_1312_ = anInt8941;
										int i_1313_ = i_1311_ + i_1312_;
										int i_1314_ = ((i_1311_ & 0xff00ff) + (i_1312_ & 0xff00ff));
										int i_1315_ = ((i_1314_ & 0x1000100) + (i_1313_ - i_1314_ & 0x10000));
										i_1315_ = (i_1313_ - i_1315_ | i_1315_ - (i_1315_ >>> 8));
										if (i_1311_ == 0 && anInt8942 != 255) {
											i_1311_ = i_1315_;
											i_1315_ = is[i_1261_];
											i_1315_ = (((((i_1311_ & 0xff00ff) * anInt8942) + ((i_1315_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1311_ & 0xff00) * anInt8942) + ((i_1315_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_1261_] = i_1315_;
									} else if (i == 2) {
										int i_1316_ = aByteArray11345[i_1260_];
										if (i_1316_ != 0) {
											int i_1317_ = (anIntArray11346[i_1316_ & 0xff]);
											int i_1318_ = (((i_1317_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_1319_ = (((i_1317_ & 0xff00) * anInt8942) & 0xff0000);
											i_1317_ = ((i_1318_ | i_1319_) >>> 8) + anInt8949;
											int i_1320_ = is[i_1261_];
											int i_1321_ = i_1317_ + i_1320_;
											int i_1322_ = ((i_1317_ & 0xff00ff) + (i_1320_ & 0xff00ff));
											i_1320_ = ((i_1322_ & 0x1000100) + (i_1321_ - i_1322_ & 0x10000));
											is[i_1261_] = (i_1321_ - i_1320_ | i_1320_ - (i_1320_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_1256_ += anInt8940;
							}
						}
						i_1254_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_1323_ = anInt8928;
					while (i_1323_ < 0) {
						int i_1324_ = anInt8930;
						int i_1325_ = anInt8937 + anInt8939;
						int i_1326_ = anInt8936 + anInt8925;
						int i_1327_ = anInt8926;
						int i_1328_;
						if ((i_1328_ = i_1325_ - (anInt8914 << 12)) >= 0) {
							i_1328_ = (anInt8940 - i_1328_) / anInt8940;
							i_1327_ += i_1328_;
							i_1325_ += anInt8940 * i_1328_;
							i_1326_ += anInt8938 * i_1328_;
							i_1324_ += i_1328_;
						}
						if ((i_1328_ = (i_1325_ - anInt8940) / anInt8940) > i_1327_)
							i_1327_ = i_1328_;
						if ((i_1328_ = i_1326_ - (anInt8916 << 12)) >= 0) {
							i_1328_ = (anInt8938 - i_1328_) / anInt8938;
							i_1327_ += i_1328_;
							i_1325_ += anInt8940 * i_1328_;
							i_1326_ += anInt8938 * i_1328_;
							i_1324_ += i_1328_;
						}
						if ((i_1328_ = (i_1326_ - anInt8938) / anInt8938) > i_1327_)
							i_1327_ = i_1328_;
						for (/**/; i_1327_ < 0; i_1327_++) {
							int i_1329_ = ((i_1326_ >> 12) * anInt8914 + (i_1325_ >> 12));
							int i_1330_ = i_1324_++;
							if (i_1046_ == 0) {
								if (i == 1)
									is[i_1330_] = (anIntArray11346[aByteArray11345[i_1329_] & 0xff]);
								else if (i == 0) {
									int i_1331_ = (anIntArray11346[aByteArray11345[i_1329_] & 0xff]);
									int i_1332_ = ((i_1331_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_1333_ = ((i_1331_ & 0xff00) * anInt8945 & 0xff0000);
									int i_1334_ = ((i_1331_ & 0xff) * anInt8946 & 0xff00);
									is[i_1330_] = (i_1332_ | i_1333_ | i_1334_) >>> 8;
								} else if (i == 3) {
									int i_1335_ = (anIntArray11346[aByteArray11345[i_1329_] & 0xff]);
									int i_1336_ = anInt8941;
									int i_1337_ = i_1335_ + i_1336_;
									int i_1338_ = ((i_1335_ & 0xff00ff) + (i_1336_ & 0xff00ff));
									int i_1339_ = ((i_1338_ & 0x1000100) + (i_1337_ - i_1338_ & 0x10000));
									is[i_1330_] = (i_1337_ - i_1339_ | i_1339_ - (i_1339_ >>> 8));
								} else if (i == 2) {
									int i_1340_ = (anIntArray11346[aByteArray11345[i_1329_] & 0xff]);
									int i_1341_ = ((i_1340_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1342_ = ((i_1340_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_1330_] = (((i_1341_ | i_1342_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_1046_ == 1) {
								if (i == 1) {
									int i_1343_ = aByteArray11345[i_1329_];
									if (i_1343_ != 0)
										is[i_1330_] = anIntArray11346[i_1343_ & 0xff];
								} else if (i == 0) {
									int i_1344_ = aByteArray11345[i_1329_];
									if (i_1344_ != 0) {
										int i_1345_ = anIntArray11346[i_1344_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_1346_ = anInt8941 >>> 24;
											int i_1347_ = 256 - i_1346_;
											int i_1348_ = is[i_1330_];
											is[i_1330_] = (((((i_1345_ & 0xff00ff) * i_1346_) + ((i_1348_ & 0xff00ff) * i_1347_)) & ~0xff00ff) + ((((i_1345_ & 0xff00) * i_1346_) + ((i_1348_ & 0xff00) * i_1347_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_1349_ = (((i_1345_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1350_ = (((i_1345_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1351_ = ((i_1345_ & 0xff) * anInt8946 & 0xff00);
											i_1345_ = (i_1349_ | i_1350_ | i_1351_) >>> 8;
											int i_1352_ = is[i_1330_];
											is[i_1330_] = (((((i_1345_ & 0xff00ff) * anInt8942) + ((i_1352_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1345_ & 0xff00) * anInt8942) + ((i_1352_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_1353_ = (((i_1345_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1354_ = (((i_1345_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1355_ = ((i_1345_ & 0xff) * anInt8946 & 0xff00);
											is[i_1330_] = (i_1353_ | i_1354_ | i_1355_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1356_ = aByteArray11345[i_1329_];
									int i_1357_ = (i_1356_ > 0 ? anIntArray11346[i_1356_] : 0);
									int i_1358_ = anInt8941;
									int i_1359_ = i_1357_ + i_1358_;
									int i_1360_ = ((i_1357_ & 0xff00ff) + (i_1358_ & 0xff00ff));
									int i_1361_ = ((i_1360_ & 0x1000100) + (i_1359_ - i_1360_ & 0x10000));
									i_1361_ = (i_1359_ - i_1361_ | i_1361_ - (i_1361_ >>> 8));
									if (i_1357_ == 0 && anInt8942 != 255) {
										i_1357_ = i_1361_;
										i_1361_ = is[i_1330_];
										i_1361_ = (((((i_1357_ & 0xff00ff) * anInt8942) + ((i_1361_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1357_ & 0xff00) * anInt8942) + ((i_1361_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_1330_] = i_1361_;
								} else if (i == 2) {
									int i_1362_ = aByteArray11345[i_1329_];
									if (i_1362_ != 0) {
										int i_1363_ = anIntArray11346[i_1362_ & 0xff];
										int i_1364_ = ((i_1363_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1365_ = ((i_1363_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1330_++] = ((i_1364_ | i_1365_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1046_ == 2) {
								if (i == 1) {
									int i_1366_ = aByteArray11345[i_1329_];
									if (i_1366_ != 0) {
										int i_1367_ = anIntArray11346[i_1366_ & 0xff];
										int i_1368_ = is[i_1330_];
										int i_1369_ = i_1367_ + i_1368_;
										int i_1370_ = ((i_1367_ & 0xff00ff) + (i_1368_ & 0xff00ff));
										i_1368_ = ((i_1370_ & 0x1000100) + (i_1369_ - i_1370_ & 0x10000));
										is[i_1330_] = (i_1369_ - i_1368_ | i_1368_ - (i_1368_ >>> 8));
									}
								} else if (i == 0) {
									int i_1371_ = aByteArray11345[i_1329_];
									if (i_1371_ != 0) {
										int i_1372_ = anIntArray11346[i_1371_ & 0xff];
										int i_1373_ = ((i_1372_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1374_ = ((i_1372_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1375_ = ((i_1372_ & 0xff) * anInt8946 & 0xff00);
										i_1372_ = (i_1373_ | i_1374_ | i_1375_) >>> 8;
										int i_1376_ = is[i_1330_];
										int i_1377_ = i_1372_ + i_1376_;
										int i_1378_ = ((i_1372_ & 0xff00ff) + (i_1376_ & 0xff00ff));
										i_1376_ = ((i_1378_ & 0x1000100) + (i_1377_ - i_1378_ & 0x10000));
										is[i_1330_] = (i_1377_ - i_1376_ | i_1376_ - (i_1376_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1379_ = aByteArray11345[i_1329_];
									int i_1380_ = (i_1379_ > 0 ? anIntArray11346[i_1379_] : 0);
									int i_1381_ = anInt8941;
									int i_1382_ = i_1380_ + i_1381_;
									int i_1383_ = ((i_1380_ & 0xff00ff) + (i_1381_ & 0xff00ff));
									int i_1384_ = ((i_1383_ & 0x1000100) + (i_1382_ - i_1383_ & 0x10000));
									i_1384_ = (i_1382_ - i_1384_ | i_1384_ - (i_1384_ >>> 8));
									if (i_1380_ == 0 && anInt8942 != 255) {
										i_1380_ = i_1384_;
										i_1384_ = is[i_1330_];
										i_1384_ = (((((i_1380_ & 0xff00ff) * anInt8942) + ((i_1384_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1380_ & 0xff00) * anInt8942) + ((i_1384_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_1330_] = i_1384_;
								} else if (i == 2) {
									int i_1385_ = aByteArray11345[i_1329_];
									if (i_1385_ != 0) {
										int i_1386_ = anIntArray11346[i_1385_ & 0xff];
										int i_1387_ = ((i_1386_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1388_ = ((i_1386_ & 0xff00) * anInt8942 & 0xff0000);
										i_1386_ = (((i_1387_ | i_1388_) >>> 8) + anInt8949);
										int i_1389_ = is[i_1330_];
										int i_1390_ = i_1386_ + i_1389_;
										int i_1391_ = ((i_1386_ & 0xff00ff) + (i_1389_ & 0xff00ff));
										i_1389_ = ((i_1391_ & 0x1000100) + (i_1390_ - i_1391_ & 0x10000));
										is[i_1330_] = (i_1390_ - i_1389_ | i_1389_ - (i_1389_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1325_ += anInt8940;
							i_1326_ += anInt8938;
						}
						i_1323_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_1392_ = anInt8928;
					while (i_1392_ < 0) {
						int i_1393_ = anInt8930;
						int i_1394_ = anInt8937 + anInt8939;
						int i_1395_ = anInt8936 + anInt8925;
						int i_1396_ = anInt8926;
						int i_1397_;
						if ((i_1397_ = i_1394_ - (anInt8914 << 12)) >= 0) {
							i_1397_ = (anInt8940 - i_1397_) / anInt8940;
							i_1396_ += i_1397_;
							i_1394_ += anInt8940 * i_1397_;
							i_1395_ += anInt8938 * i_1397_;
							i_1393_ += i_1397_;
						}
						if ((i_1397_ = (i_1394_ - anInt8940) / anInt8940) > i_1396_)
							i_1396_ = i_1397_;
						if (i_1395_ < 0) {
							i_1397_ = (anInt8938 - 1 - i_1395_) / anInt8938;
							i_1396_ += i_1397_;
							i_1394_ += anInt8940 * i_1397_;
							i_1395_ += anInt8938 * i_1397_;
							i_1393_ += i_1397_;
						}
						if ((i_1397_ = (1 + i_1395_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1396_)
							i_1396_ = i_1397_;
						for (/**/; i_1396_ < 0; i_1396_++) {
							int i_1398_ = ((i_1395_ >> 12) * anInt8914 + (i_1394_ >> 12));
							int i_1399_ = i_1393_++;
							if (i_1046_ == 0) {
								if (i == 1)
									is[i_1399_] = (anIntArray11346[aByteArray11345[i_1398_] & 0xff]);
								else if (i == 0) {
									int i_1400_ = (anIntArray11346[aByteArray11345[i_1398_] & 0xff]);
									int i_1401_ = ((i_1400_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_1402_ = ((i_1400_ & 0xff00) * anInt8945 & 0xff0000);
									int i_1403_ = ((i_1400_ & 0xff) * anInt8946 & 0xff00);
									is[i_1399_] = (i_1401_ | i_1402_ | i_1403_) >>> 8;
								} else if (i == 3) {
									int i_1404_ = (anIntArray11346[aByteArray11345[i_1398_] & 0xff]);
									int i_1405_ = anInt8941;
									int i_1406_ = i_1404_ + i_1405_;
									int i_1407_ = ((i_1404_ & 0xff00ff) + (i_1405_ & 0xff00ff));
									int i_1408_ = ((i_1407_ & 0x1000100) + (i_1406_ - i_1407_ & 0x10000));
									is[i_1399_] = (i_1406_ - i_1408_ | i_1408_ - (i_1408_ >>> 8));
								} else if (i == 2) {
									int i_1409_ = (anIntArray11346[aByteArray11345[i_1398_] & 0xff]);
									int i_1410_ = ((i_1409_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1411_ = ((i_1409_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_1399_] = (((i_1410_ | i_1411_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_1046_ == 1) {
								if (i == 1) {
									int i_1412_ = aByteArray11345[i_1398_];
									if (i_1412_ != 0)
										is[i_1399_] = anIntArray11346[i_1412_ & 0xff];
								} else if (i == 0) {
									int i_1413_ = aByteArray11345[i_1398_];
									if (i_1413_ != 0) {
										int i_1414_ = anIntArray11346[i_1413_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_1415_ = anInt8941 >>> 24;
											int i_1416_ = 256 - i_1415_;
											int i_1417_ = is[i_1399_];
											is[i_1399_] = (((((i_1414_ & 0xff00ff) * i_1415_) + ((i_1417_ & 0xff00ff) * i_1416_)) & ~0xff00ff) + ((((i_1414_ & 0xff00) * i_1415_) + ((i_1417_ & 0xff00) * i_1416_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_1418_ = (((i_1414_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1419_ = (((i_1414_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1420_ = ((i_1414_ & 0xff) * anInt8946 & 0xff00);
											i_1414_ = (i_1418_ | i_1419_ | i_1420_) >>> 8;
											int i_1421_ = is[i_1399_];
											is[i_1399_] = (((((i_1414_ & 0xff00ff) * anInt8942) + ((i_1421_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1414_ & 0xff00) * anInt8942) + ((i_1421_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_1422_ = (((i_1414_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1423_ = (((i_1414_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1424_ = ((i_1414_ & 0xff) * anInt8946 & 0xff00);
											is[i_1399_] = (i_1422_ | i_1423_ | i_1424_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1425_ = aByteArray11345[i_1398_];
									int i_1426_ = (i_1425_ > 0 ? anIntArray11346[i_1425_] : 0);
									int i_1427_ = anInt8941;
									int i_1428_ = i_1426_ + i_1427_;
									int i_1429_ = ((i_1426_ & 0xff00ff) + (i_1427_ & 0xff00ff));
									int i_1430_ = ((i_1429_ & 0x1000100) + (i_1428_ - i_1429_ & 0x10000));
									i_1430_ = (i_1428_ - i_1430_ | i_1430_ - (i_1430_ >>> 8));
									if (i_1426_ == 0 && anInt8942 != 255) {
										i_1426_ = i_1430_;
										i_1430_ = is[i_1399_];
										i_1430_ = (((((i_1426_ & 0xff00ff) * anInt8942) + ((i_1430_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1426_ & 0xff00) * anInt8942) + ((i_1430_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_1399_] = i_1430_;
								} else if (i == 2) {
									int i_1431_ = aByteArray11345[i_1398_];
									if (i_1431_ != 0) {
										int i_1432_ = anIntArray11346[i_1431_ & 0xff];
										int i_1433_ = ((i_1432_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1434_ = ((i_1432_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1399_++] = ((i_1433_ | i_1434_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1046_ == 2) {
								if (i == 1) {
									int i_1435_ = aByteArray11345[i_1398_];
									if (i_1435_ != 0) {
										int i_1436_ = anIntArray11346[i_1435_ & 0xff];
										int i_1437_ = is[i_1399_];
										int i_1438_ = i_1436_ + i_1437_;
										int i_1439_ = ((i_1436_ & 0xff00ff) + (i_1437_ & 0xff00ff));
										i_1437_ = ((i_1439_ & 0x1000100) + (i_1438_ - i_1439_ & 0x10000));
										is[i_1399_] = (i_1438_ - i_1437_ | i_1437_ - (i_1437_ >>> 8));
									}
								} else if (i == 0) {
									int i_1440_ = aByteArray11345[i_1398_];
									if (i_1440_ != 0) {
										int i_1441_ = anIntArray11346[i_1440_ & 0xff];
										int i_1442_ = ((i_1441_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1443_ = ((i_1441_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1444_ = ((i_1441_ & 0xff) * anInt8946 & 0xff00);
										i_1441_ = (i_1442_ | i_1443_ | i_1444_) >>> 8;
										int i_1445_ = is[i_1399_];
										int i_1446_ = i_1441_ + i_1445_;
										int i_1447_ = ((i_1441_ & 0xff00ff) + (i_1445_ & 0xff00ff));
										i_1445_ = ((i_1447_ & 0x1000100) + (i_1446_ - i_1447_ & 0x10000));
										is[i_1399_] = (i_1446_ - i_1445_ | i_1445_ - (i_1445_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1448_ = aByteArray11345[i_1398_];
									int i_1449_ = (i_1448_ > 0 ? anIntArray11346[i_1448_] : 0);
									int i_1450_ = anInt8941;
									int i_1451_ = i_1449_ + i_1450_;
									int i_1452_ = ((i_1449_ & 0xff00ff) + (i_1450_ & 0xff00ff));
									int i_1453_ = ((i_1452_ & 0x1000100) + (i_1451_ - i_1452_ & 0x10000));
									i_1453_ = (i_1451_ - i_1453_ | i_1453_ - (i_1453_ >>> 8));
									if (i_1449_ == 0 && anInt8942 != 255) {
										i_1449_ = i_1453_;
										i_1453_ = is[i_1399_];
										i_1453_ = (((((i_1449_ & 0xff00ff) * anInt8942) + ((i_1453_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1449_ & 0xff00) * anInt8942) + ((i_1453_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_1399_] = i_1453_;
								} else if (i == 2) {
									int i_1454_ = aByteArray11345[i_1398_];
									if (i_1454_ != 0) {
										int i_1455_ = anIntArray11346[i_1454_ & 0xff];
										int i_1456_ = ((i_1455_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1457_ = ((i_1455_ & 0xff00) * anInt8942 & 0xff0000);
										i_1455_ = (((i_1456_ | i_1457_) >>> 8) + anInt8949);
										int i_1458_ = is[i_1399_];
										int i_1459_ = i_1455_ + i_1458_;
										int i_1460_ = ((i_1455_ & 0xff00ff) + (i_1458_ & 0xff00ff));
										i_1458_ = ((i_1460_ & 0x1000100) + (i_1459_ - i_1460_ & 0x10000));
										is[i_1399_] = (i_1459_ - i_1458_ | i_1458_ - (i_1458_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1394_ += anInt8940;
							i_1395_ += anInt8938;
						}
						i_1392_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_1461_ = anInt8928;
				while (i_1461_ < 0) {
					int i_1462_ = anInt8930;
					int i_1463_ = anInt8937 + anInt8939;
					int i_1464_ = anInt8936;
					int i_1465_ = anInt8926;
					if (i_1464_ >= 0 && i_1464_ - (anInt8916 << 12) < 0) {
						if (i_1463_ < 0) {
							int i_1466_ = (anInt8940 - 1 - i_1463_) / anInt8940;
							i_1465_ += i_1466_;
							i_1463_ += anInt8940 * i_1466_;
							i_1462_ += i_1466_;
						}
						int i_1467_;
						if ((i_1467_ = (1 + i_1463_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1465_)
							i_1465_ = i_1467_;
						for (/**/; i_1465_ < 0; i_1465_++) {
							int i_1468_ = ((i_1464_ >> 12) * anInt8914 + (i_1463_ >> 12));
							int i_1469_ = i_1462_++;
							if (i_1046_ == 0) {
								if (i == 1)
									is[i_1469_] = (anIntArray11346[aByteArray11345[i_1468_] & 0xff]);
								else if (i == 0) {
									int i_1470_ = (anIntArray11346[aByteArray11345[i_1468_] & 0xff]);
									int i_1471_ = ((i_1470_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_1472_ = ((i_1470_ & 0xff00) * anInt8945 & 0xff0000);
									int i_1473_ = ((i_1470_ & 0xff) * anInt8946 & 0xff00);
									is[i_1469_] = (i_1471_ | i_1472_ | i_1473_) >>> 8;
								} else if (i == 3) {
									int i_1474_ = (anIntArray11346[aByteArray11345[i_1468_] & 0xff]);
									int i_1475_ = anInt8941;
									int i_1476_ = i_1474_ + i_1475_;
									int i_1477_ = ((i_1474_ & 0xff00ff) + (i_1475_ & 0xff00ff));
									int i_1478_ = ((i_1477_ & 0x1000100) + (i_1476_ - i_1477_ & 0x10000));
									is[i_1469_] = (i_1476_ - i_1478_ | i_1478_ - (i_1478_ >>> 8));
								} else if (i == 2) {
									int i_1479_ = (anIntArray11346[aByteArray11345[i_1468_] & 0xff]);
									int i_1480_ = ((i_1479_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1481_ = ((i_1479_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_1469_] = (((i_1480_ | i_1481_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_1046_ == 1) {
								if (i == 1) {
									int i_1482_ = aByteArray11345[i_1468_];
									if (i_1482_ != 0)
										is[i_1469_] = anIntArray11346[i_1482_ & 0xff];
								} else if (i == 0) {
									int i_1483_ = aByteArray11345[i_1468_];
									if (i_1483_ != 0) {
										int i_1484_ = anIntArray11346[i_1483_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_1485_ = anInt8941 >>> 24;
											int i_1486_ = 256 - i_1485_;
											int i_1487_ = is[i_1469_];
											is[i_1469_] = (((((i_1484_ & 0xff00ff) * i_1485_) + ((i_1487_ & 0xff00ff) * i_1486_)) & ~0xff00ff) + ((((i_1484_ & 0xff00) * i_1485_) + ((i_1487_ & 0xff00) * i_1486_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_1488_ = (((i_1484_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1489_ = (((i_1484_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1490_ = ((i_1484_ & 0xff) * anInt8946 & 0xff00);
											i_1484_ = (i_1488_ | i_1489_ | i_1490_) >>> 8;
											int i_1491_ = is[i_1469_];
											is[i_1469_] = (((((i_1484_ & 0xff00ff) * anInt8942) + ((i_1491_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1484_ & 0xff00) * anInt8942) + ((i_1491_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_1492_ = (((i_1484_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_1493_ = (((i_1484_ & 0xff00) * anInt8945) & 0xff0000);
											int i_1494_ = ((i_1484_ & 0xff) * anInt8946 & 0xff00);
											is[i_1469_] = (i_1492_ | i_1493_ | i_1494_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1495_ = aByteArray11345[i_1468_];
									int i_1496_ = (i_1495_ > 0 ? anIntArray11346[i_1495_] : 0);
									int i_1497_ = anInt8941;
									int i_1498_ = i_1496_ + i_1497_;
									int i_1499_ = ((i_1496_ & 0xff00ff) + (i_1497_ & 0xff00ff));
									int i_1500_ = ((i_1499_ & 0x1000100) + (i_1498_ - i_1499_ & 0x10000));
									i_1500_ = (i_1498_ - i_1500_ | i_1500_ - (i_1500_ >>> 8));
									if (i_1496_ == 0 && anInt8942 != 255) {
										i_1496_ = i_1500_;
										i_1500_ = is[i_1469_];
										i_1500_ = (((((i_1496_ & 0xff00ff) * anInt8942) + ((i_1500_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1496_ & 0xff00) * anInt8942) + ((i_1500_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_1469_] = i_1500_;
								} else if (i == 2) {
									int i_1501_ = aByteArray11345[i_1468_];
									if (i_1501_ != 0) {
										int i_1502_ = anIntArray11346[i_1501_ & 0xff];
										int i_1503_ = ((i_1502_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1504_ = ((i_1502_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_1469_++] = ((i_1503_ | i_1504_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_1046_ == 2) {
								if (i == 1) {
									int i_1505_ = aByteArray11345[i_1468_];
									if (i_1505_ != 0) {
										int i_1506_ = anIntArray11346[i_1505_ & 0xff];
										int i_1507_ = is[i_1469_];
										int i_1508_ = i_1506_ + i_1507_;
										int i_1509_ = ((i_1506_ & 0xff00ff) + (i_1507_ & 0xff00ff));
										i_1507_ = ((i_1509_ & 0x1000100) + (i_1508_ - i_1509_ & 0x10000));
										is[i_1469_] = (i_1508_ - i_1507_ | i_1507_ - (i_1507_ >>> 8));
									}
								} else if (i == 0) {
									int i_1510_ = aByteArray11345[i_1468_];
									if (i_1510_ != 0) {
										int i_1511_ = anIntArray11346[i_1510_ & 0xff];
										int i_1512_ = ((i_1511_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1513_ = ((i_1511_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1514_ = ((i_1511_ & 0xff) * anInt8946 & 0xff00);
										i_1511_ = (i_1512_ | i_1513_ | i_1514_) >>> 8;
										int i_1515_ = is[i_1469_];
										int i_1516_ = i_1511_ + i_1515_;
										int i_1517_ = ((i_1511_ & 0xff00ff) + (i_1515_ & 0xff00ff));
										i_1515_ = ((i_1517_ & 0x1000100) + (i_1516_ - i_1517_ & 0x10000));
										is[i_1469_] = (i_1516_ - i_1515_ | i_1515_ - (i_1515_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1518_ = aByteArray11345[i_1468_];
									int i_1519_ = (i_1518_ > 0 ? anIntArray11346[i_1518_] : 0);
									int i_1520_ = anInt8941;
									int i_1521_ = i_1519_ + i_1520_;
									int i_1522_ = ((i_1519_ & 0xff00ff) + (i_1520_ & 0xff00ff));
									int i_1523_ = ((i_1522_ & 0x1000100) + (i_1521_ - i_1522_ & 0x10000));
									i_1523_ = (i_1521_ - i_1523_ | i_1523_ - (i_1523_ >>> 8));
									if (i_1519_ == 0 && anInt8942 != 255) {
										i_1519_ = i_1523_;
										i_1523_ = is[i_1469_];
										i_1523_ = (((((i_1519_ & 0xff00ff) * anInt8942) + ((i_1523_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1519_ & 0xff00) * anInt8942) + ((i_1523_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_1469_] = i_1523_;
								} else if (i == 2) {
									int i_1524_ = aByteArray11345[i_1468_];
									if (i_1524_ != 0) {
										int i_1525_ = anIntArray11346[i_1524_ & 0xff];
										int i_1526_ = ((i_1525_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_1527_ = ((i_1525_ & 0xff00) * anInt8942 & 0xff0000);
										i_1525_ = (((i_1526_ | i_1527_) >>> 8) + anInt8949);
										int i_1528_ = is[i_1469_];
										int i_1529_ = i_1525_ + i_1528_;
										int i_1530_ = ((i_1525_ & 0xff00ff) + (i_1528_ & 0xff00ff));
										i_1528_ = ((i_1530_ & 0x1000100) + (i_1529_ - i_1530_ & 0x10000));
										is[i_1469_] = (i_1529_ - i_1528_ | i_1528_ - (i_1528_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1463_ += anInt8940;
						}
					}
					i_1461_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				for (int i_1531_ = anInt8928; i_1531_ < 0; i_1531_++) {
					int i_1532_ = anInt8930;
					int i_1533_ = anInt8937 + anInt8939;
					int i_1534_ = anInt8936 + anInt8925;
					int i_1535_ = anInt8926;
					if (i_1533_ < 0) {
						int i_1536_ = (anInt8940 - 1 - i_1533_) / anInt8940;
						i_1535_ += i_1536_;
						i_1533_ += anInt8940 * i_1536_;
						i_1534_ += anInt8938 * i_1536_;
						i_1532_ += i_1536_;
					}
					int i_1537_;
					if ((i_1537_ = (1 + i_1533_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1535_)
						i_1535_ = i_1537_;
					if ((i_1537_ = i_1534_ - (anInt8916 << 12)) >= 0) {
						i_1537_ = (anInt8938 - i_1537_) / anInt8938;
						i_1535_ += i_1537_;
						i_1533_ += anInt8940 * i_1537_;
						i_1534_ += anInt8938 * i_1537_;
						i_1532_ += i_1537_;
					}
					if ((i_1537_ = (i_1534_ - anInt8938) / anInt8938) > i_1535_)
						i_1535_ = i_1537_;
					for (/**/; i_1535_ < 0; i_1535_++) {
						int i_1538_ = (i_1534_ >> 12) * anInt8914 + (i_1533_ >> 12);
						int i_1539_ = i_1532_++;
						if (i_1046_ == 0) {
							if (i == 1)
								is[i_1539_] = (anIntArray11346[aByteArray11345[i_1538_] & 0xff]);
							else if (i == 0) {
								int i_1540_ = (anIntArray11346[aByteArray11345[i_1538_] & 0xff]);
								int i_1541_ = ((i_1540_ & 0xff0000) * anInt8944 & ~0xffffff);
								int i_1542_ = ((i_1540_ & 0xff00) * anInt8945 & 0xff0000);
								int i_1543_ = (i_1540_ & 0xff) * anInt8946 & 0xff00;
								is[i_1539_] = (i_1541_ | i_1542_ | i_1543_) >>> 8;
							} else if (i == 3) {
								int i_1544_ = (anIntArray11346[aByteArray11345[i_1538_] & 0xff]);
								int i_1545_ = anInt8941;
								int i_1546_ = i_1544_ + i_1545_;
								int i_1547_ = ((i_1544_ & 0xff00ff) + (i_1545_ & 0xff00ff));
								int i_1548_ = ((i_1547_ & 0x1000100) + (i_1546_ - i_1547_ & 0x10000));
								is[i_1539_] = i_1546_ - i_1548_ | i_1548_ - (i_1548_ >>> 8);
							} else if (i == 2) {
								int i_1549_ = (anIntArray11346[aByteArray11345[i_1538_] & 0xff]);
								int i_1550_ = ((i_1549_ & 0xff00ff) * anInt8942 & ~0xff00ff);
								int i_1551_ = ((i_1549_ & 0xff00) * anInt8942 & 0xff0000);
								is[i_1539_] = ((i_1550_ | i_1551_) >>> 8) + anInt8949;
							} else
								throw new IllegalArgumentException();
						} else if (i_1046_ == 1) {
							if (i == 1) {
								int i_1552_ = aByteArray11345[i_1538_];
								if (i_1552_ != 0)
									is[i_1539_] = anIntArray11346[i_1552_ & 0xff];
							} else if (i == 0) {
								int i_1553_ = aByteArray11345[i_1538_];
								if (i_1553_ != 0) {
									int i_1554_ = anIntArray11346[i_1553_ & 0xff];
									if ((anInt8941 & 0xffffff) == 16777215) {
										int i_1555_ = anInt8941 >>> 24;
										int i_1556_ = 256 - i_1555_;
										int i_1557_ = is[i_1539_];
										is[i_1539_] = ((((i_1554_ & 0xff00ff) * i_1555_ + ((i_1557_ & 0xff00ff) * i_1556_)) & ~0xff00ff) + (((i_1554_ & 0xff00) * i_1555_ + ((i_1557_ & 0xff00) * i_1556_)) & 0xff0000)) >> 8;
									} else if (anInt8942 != 255) {
										int i_1558_ = ((i_1554_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1559_ = ((i_1554_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1560_ = ((i_1554_ & 0xff) * anInt8946 & 0xff00);
										i_1554_ = (i_1558_ | i_1559_ | i_1560_) >>> 8;
										int i_1561_ = is[i_1539_];
										is[i_1539_] = (((((i_1554_ & 0xff00ff) * anInt8942) + ((i_1561_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1554_ & 0xff00) * anInt8942) + ((i_1561_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									} else {
										int i_1562_ = ((i_1554_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1563_ = ((i_1554_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1564_ = ((i_1554_ & 0xff) * anInt8946 & 0xff00);
										is[i_1539_] = (i_1562_ | i_1563_ | i_1564_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1565_ = aByteArray11345[i_1538_];
								int i_1566_ = (i_1565_ > 0 ? anIntArray11346[i_1565_] : 0);
								int i_1567_ = anInt8941;
								int i_1568_ = i_1566_ + i_1567_;
								int i_1569_ = ((i_1566_ & 0xff00ff) + (i_1567_ & 0xff00ff));
								int i_1570_ = ((i_1569_ & 0x1000100) + (i_1568_ - i_1569_ & 0x10000));
								i_1570_ = i_1568_ - i_1570_ | i_1570_ - (i_1570_ >>> 8);
								if (i_1566_ == 0 && anInt8942 != 255) {
									i_1566_ = i_1570_;
									i_1570_ = is[i_1539_];
									i_1570_ = ((((i_1566_ & 0xff00ff) * anInt8942 + ((i_1570_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_1566_ & 0xff00) * anInt8942 + ((i_1570_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_1539_] = i_1570_;
							} else if (i == 2) {
								int i_1571_ = aByteArray11345[i_1538_];
								if (i_1571_ != 0) {
									int i_1572_ = anIntArray11346[i_1571_ & 0xff];
									int i_1573_ = ((i_1572_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1574_ = ((i_1572_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_1539_++] = ((i_1573_ | i_1574_) >>> 8) + anInt8949;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1046_ == 2) {
							if (i == 1) {
								int i_1575_ = aByteArray11345[i_1538_];
								if (i_1575_ != 0) {
									int i_1576_ = anIntArray11346[i_1575_ & 0xff];
									int i_1577_ = is[i_1539_];
									int i_1578_ = i_1576_ + i_1577_;
									int i_1579_ = ((i_1576_ & 0xff00ff) + (i_1577_ & 0xff00ff));
									i_1577_ = ((i_1579_ & 0x1000100) + (i_1578_ - i_1579_ & 0x10000));
									is[i_1539_] = (i_1578_ - i_1577_ | i_1577_ - (i_1577_ >>> 8));
								}
							} else if (i == 0) {
								int i_1580_ = aByteArray11345[i_1538_];
								if (i_1580_ != 0) {
									int i_1581_ = anIntArray11346[i_1580_ & 0xff];
									int i_1582_ = ((i_1581_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_1583_ = ((i_1581_ & 0xff00) * anInt8945 & 0xff0000);
									int i_1584_ = ((i_1581_ & 0xff) * anInt8946 & 0xff00);
									i_1581_ = (i_1582_ | i_1583_ | i_1584_) >>> 8;
									int i_1585_ = is[i_1539_];
									int i_1586_ = i_1581_ + i_1585_;
									int i_1587_ = ((i_1581_ & 0xff00ff) + (i_1585_ & 0xff00ff));
									i_1585_ = ((i_1587_ & 0x1000100) + (i_1586_ - i_1587_ & 0x10000));
									is[i_1539_] = (i_1586_ - i_1585_ | i_1585_ - (i_1585_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1588_ = aByteArray11345[i_1538_];
								int i_1589_ = (i_1588_ > 0 ? anIntArray11346[i_1588_] : 0);
								int i_1590_ = anInt8941;
								int i_1591_ = i_1589_ + i_1590_;
								int i_1592_ = ((i_1589_ & 0xff00ff) + (i_1590_ & 0xff00ff));
								int i_1593_ = ((i_1592_ & 0x1000100) + (i_1591_ - i_1592_ & 0x10000));
								i_1593_ = i_1591_ - i_1593_ | i_1593_ - (i_1593_ >>> 8);
								if (i_1589_ == 0 && anInt8942 != 255) {
									i_1589_ = i_1593_;
									i_1593_ = is[i_1539_];
									i_1593_ = ((((i_1589_ & 0xff00ff) * anInt8942 + ((i_1593_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_1589_ & 0xff00) * anInt8942 + ((i_1593_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_1539_] = i_1593_;
							} else if (i == 2) {
								int i_1594_ = aByteArray11345[i_1538_];
								if (i_1594_ != 0) {
									int i_1595_ = anIntArray11346[i_1594_ & 0xff];
									int i_1596_ = ((i_1595_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1597_ = ((i_1595_ & 0xff00) * anInt8942 & 0xff0000);
									i_1595_ = (((i_1596_ | i_1597_) >>> 8) + anInt8949);
									int i_1598_ = is[i_1539_];
									int i_1599_ = i_1595_ + i_1598_;
									int i_1600_ = ((i_1595_ & 0xff00ff) + (i_1598_ & 0xff00ff));
									i_1598_ = ((i_1600_ & 0x1000100) + (i_1599_ - i_1600_ & 0x10000));
									is[i_1539_] = (i_1599_ - i_1598_ | i_1598_ - (i_1598_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1533_ += anInt8940;
						i_1534_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				for (int i_1601_ = anInt8928; i_1601_ < 0; i_1601_++) {
					int i_1602_ = anInt8930;
					int i_1603_ = anInt8937 + anInt8939;
					int i_1604_ = anInt8936 + anInt8925;
					int i_1605_ = anInt8926;
					if (i_1603_ < 0) {
						int i_1606_ = (anInt8940 - 1 - i_1603_) / anInt8940;
						i_1605_ += i_1606_;
						i_1603_ += anInt8940 * i_1606_;
						i_1604_ += anInt8938 * i_1606_;
						i_1602_ += i_1606_;
					}
					int i_1607_;
					if ((i_1607_ = (1 + i_1603_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1605_)
						i_1605_ = i_1607_;
					if (i_1604_ < 0) {
						i_1607_ = (anInt8938 - 1 - i_1604_) / anInt8938;
						i_1605_ += i_1607_;
						i_1603_ += anInt8940 * i_1607_;
						i_1604_ += anInt8938 * i_1607_;
						i_1602_ += i_1607_;
					}
					if ((i_1607_ = (1 + i_1604_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1605_)
						i_1605_ = i_1607_;
					for (/**/; i_1605_ < 0; i_1605_++) {
						int i_1608_ = (i_1604_ >> 12) * anInt8914 + (i_1603_ >> 12);
						int i_1609_ = i_1602_++;
						if (i_1046_ == 0) {
							if (i == 1)
								is[i_1609_] = (anIntArray11346[aByteArray11345[i_1608_] & 0xff]);
							else if (i == 0) {
								int i_1610_ = (anIntArray11346[aByteArray11345[i_1608_] & 0xff]);
								int i_1611_ = ((i_1610_ & 0xff0000) * anInt8944 & ~0xffffff);
								int i_1612_ = ((i_1610_ & 0xff00) * anInt8945 & 0xff0000);
								int i_1613_ = (i_1610_ & 0xff) * anInt8946 & 0xff00;
								is[i_1609_] = (i_1611_ | i_1612_ | i_1613_) >>> 8;
							} else if (i == 3) {
								int i_1614_ = (anIntArray11346[aByteArray11345[i_1608_] & 0xff]);
								int i_1615_ = anInt8941;
								int i_1616_ = i_1614_ + i_1615_;
								int i_1617_ = ((i_1614_ & 0xff00ff) + (i_1615_ & 0xff00ff));
								int i_1618_ = ((i_1617_ & 0x1000100) + (i_1616_ - i_1617_ & 0x10000));
								is[i_1609_] = i_1616_ - i_1618_ | i_1618_ - (i_1618_ >>> 8);
							} else if (i == 2) {
								int i_1619_ = (anIntArray11346[aByteArray11345[i_1608_] & 0xff]);
								int i_1620_ = ((i_1619_ & 0xff00ff) * anInt8942 & ~0xff00ff);
								int i_1621_ = ((i_1619_ & 0xff00) * anInt8942 & 0xff0000);
								is[i_1609_] = ((i_1620_ | i_1621_) >>> 8) + anInt8949;
							} else
								throw new IllegalArgumentException();
						} else if (i_1046_ == 1) {
							if (i == 1) {
								int i_1622_ = aByteArray11345[i_1608_];
								if (i_1622_ != 0)
									is[i_1609_] = anIntArray11346[i_1622_ & 0xff];
							} else if (i == 0) {
								int i_1623_ = aByteArray11345[i_1608_];
								if (i_1623_ != 0) {
									int i_1624_ = anIntArray11346[i_1623_ & 0xff];
									if ((anInt8941 & 0xffffff) == 16777215) {
										int i_1625_ = anInt8941 >>> 24;
										int i_1626_ = 256 - i_1625_;
										int i_1627_ = is[i_1609_];
										is[i_1609_] = ((((i_1624_ & 0xff00ff) * i_1625_ + ((i_1627_ & 0xff00ff) * i_1626_)) & ~0xff00ff) + (((i_1624_ & 0xff00) * i_1625_ + ((i_1627_ & 0xff00) * i_1626_)) & 0xff0000)) >> 8;
									} else if (anInt8942 != 255) {
										int i_1628_ = ((i_1624_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1629_ = ((i_1624_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1630_ = ((i_1624_ & 0xff) * anInt8946 & 0xff00);
										i_1624_ = (i_1628_ | i_1629_ | i_1630_) >>> 8;
										int i_1631_ = is[i_1609_];
										is[i_1609_] = (((((i_1624_ & 0xff00ff) * anInt8942) + ((i_1631_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_1624_ & 0xff00) * anInt8942) + ((i_1631_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									} else {
										int i_1632_ = ((i_1624_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_1633_ = ((i_1624_ & 0xff00) * anInt8945 & 0xff0000);
										int i_1634_ = ((i_1624_ & 0xff) * anInt8946 & 0xff00);
										is[i_1609_] = (i_1632_ | i_1633_ | i_1634_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1635_ = aByteArray11345[i_1608_];
								int i_1636_ = (i_1635_ > 0 ? anIntArray11346[i_1635_] : 0);
								int i_1637_ = anInt8941;
								int i_1638_ = i_1636_ + i_1637_;
								int i_1639_ = ((i_1636_ & 0xff00ff) + (i_1637_ & 0xff00ff));
								int i_1640_ = ((i_1639_ & 0x1000100) + (i_1638_ - i_1639_ & 0x10000));
								i_1640_ = i_1638_ - i_1640_ | i_1640_ - (i_1640_ >>> 8);
								if (i_1636_ == 0 && anInt8942 != 255) {
									i_1636_ = i_1640_;
									i_1640_ = is[i_1609_];
									i_1640_ = ((((i_1636_ & 0xff00ff) * anInt8942 + ((i_1640_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_1636_ & 0xff00) * anInt8942 + ((i_1640_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_1609_] = i_1640_;
							} else if (i == 2) {
								int i_1641_ = aByteArray11345[i_1608_];
								if (i_1641_ != 0) {
									int i_1642_ = anIntArray11346[i_1641_ & 0xff];
									int i_1643_ = ((i_1642_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1644_ = ((i_1642_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_1609_++] = ((i_1643_ | i_1644_) >>> 8) + anInt8949;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_1046_ == 2) {
							if (i == 1) {
								int i_1645_ = aByteArray11345[i_1608_];
								if (i_1645_ != 0) {
									int i_1646_ = anIntArray11346[i_1645_ & 0xff];
									int i_1647_ = is[i_1609_];
									int i_1648_ = i_1646_ + i_1647_;
									int i_1649_ = ((i_1646_ & 0xff00ff) + (i_1647_ & 0xff00ff));
									i_1647_ = ((i_1649_ & 0x1000100) + (i_1648_ - i_1649_ & 0x10000));
									is[i_1609_] = (i_1648_ - i_1647_ | i_1647_ - (i_1647_ >>> 8));
								}
							} else if (i == 0) {
								int i_1650_ = aByteArray11345[i_1608_];
								if (i_1650_ != 0) {
									int i_1651_ = anIntArray11346[i_1650_ & 0xff];
									int i_1652_ = ((i_1651_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_1653_ = ((i_1651_ & 0xff00) * anInt8945 & 0xff0000);
									int i_1654_ = ((i_1651_ & 0xff) * anInt8946 & 0xff00);
									i_1651_ = (i_1652_ | i_1653_ | i_1654_) >>> 8;
									int i_1655_ = is[i_1609_];
									int i_1656_ = i_1651_ + i_1655_;
									int i_1657_ = ((i_1651_ & 0xff00ff) + (i_1655_ & 0xff00ff));
									i_1655_ = ((i_1657_ & 0x1000100) + (i_1656_ - i_1657_ & 0x10000));
									is[i_1609_] = (i_1656_ - i_1655_ | i_1655_ - (i_1655_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1658_ = aByteArray11345[i_1608_];
								int i_1659_ = (i_1658_ > 0 ? anIntArray11346[i_1658_] : 0);
								int i_1660_ = anInt8941;
								int i_1661_ = i_1659_ + i_1660_;
								int i_1662_ = ((i_1659_ & 0xff00ff) + (i_1660_ & 0xff00ff));
								int i_1663_ = ((i_1662_ & 0x1000100) + (i_1661_ - i_1662_ & 0x10000));
								i_1663_ = i_1661_ - i_1663_ | i_1663_ - (i_1663_ >>> 8);
								if (i_1659_ == 0 && anInt8942 != 255) {
									i_1659_ = i_1663_;
									i_1663_ = is[i_1609_];
									i_1663_ = ((((i_1659_ & 0xff00ff) * anInt8942 + ((i_1663_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_1659_ & 0xff00) * anInt8942 + ((i_1663_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_1609_] = i_1663_;
							} else if (i == 2) {
								int i_1664_ = aByteArray11345[i_1608_];
								if (i_1664_ != 0) {
									int i_1665_ = anIntArray11346[i_1664_ & 0xff];
									int i_1666_ = ((i_1665_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_1667_ = ((i_1665_ & 0xff00) * anInt8942 & 0xff0000);
									i_1665_ = (((i_1666_ | i_1667_) >>> 8) + anInt8949);
									int i_1668_ = is[i_1609_];
									int i_1669_ = i_1665_ + i_1668_;
									int i_1670_ = ((i_1665_ & 0xff00ff) + (i_1668_ & 0xff00ff));
									i_1668_ = ((i_1670_ & 0x1000100) + (i_1669_ - i_1670_ & 0x10000));
									is[i_1609_] = (i_1669_ - i_1668_ | i_1668_ - (i_1668_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1603_ += anInt8940;
						i_1604_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public void method2466(int i, int i_1671_, Class145 class145, int i_1672_, int i_1673_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_1671_ += anInt8918;
			int i_1674_ = 0;
			int i_1675_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_1676_ = anInt8914;
			int i_1677_ = anInt8916;
			int i_1678_ = i_1675_ - i_1676_;
			int i_1679_ = 0;
			int i_1680_ = i + i_1671_ * i_1675_;
			if (i_1671_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_1681_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1671_;
				i_1677_ -= i_1681_;
				i_1671_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_1674_ += i_1681_ * i_1676_;
				i_1680_ += i_1681_ * i_1675_;
			}
			if (i_1671_ + i_1677_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_1677_ -= (i_1671_ + i_1677_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_1682_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_1676_ -= i_1682_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_1674_ += i_1682_;
				i_1680_ += i_1682_;
				i_1679_ += i_1682_;
				i_1678_ += i_1682_;
			}
			if (i + i_1676_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_1683_ = i + i_1676_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_1676_ -= i_1683_;
				i_1679_ += i_1683_;
				i_1678_ += i_1683_;
			}
			if (i_1676_ > 0 && i_1677_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_1684_ = class145_sub1.anIntArray9521;
				int[] is_1685_ = class145_sub1.anIntArray9520;
				int i_1686_ = i_1671_;
				if (i_1673_ > i_1686_) {
					i_1686_ = i_1673_;
					i_1680_ += (i_1673_ - i_1671_) * i_1675_;
					i_1674_ += (i_1673_ - i_1671_) * anInt8914;
				}
				int i_1687_ = (i_1673_ + is_1684_.length < i_1671_ + i_1677_ ? i_1673_ + is_1684_.length : i_1671_ + i_1677_);
				for (int i_1688_ = i_1686_; i_1688_ < i_1687_; i_1688_++) {
					int i_1689_ = is_1684_[i_1688_ - i_1673_] + i_1672_;
					int i_1690_ = is_1685_[i_1688_ - i_1673_];
					int i_1691_ = i_1676_;
					if (i > i_1689_) {
						int i_1692_ = i - i_1689_;
						if (i_1692_ >= i_1690_) {
							i_1674_ += i_1676_ + i_1679_;
							i_1680_ += i_1676_ + i_1678_;
							continue;
						}
						i_1690_ -= i_1692_;
					} else {
						int i_1693_ = i_1689_ - i;
						if (i_1693_ >= i_1676_) {
							i_1674_ += i_1676_ + i_1679_;
							i_1680_ += i_1676_ + i_1678_;
							continue;
						}
						i_1674_ += i_1693_;
						i_1691_ -= i_1693_;
						i_1680_ += i_1693_;
					}
					int i_1694_ = 0;
					if (i_1691_ < i_1690_)
						i_1690_ = i_1691_;
					else
						i_1694_ = i_1691_ - i_1690_;
					for (int i_1695_ = -i_1690_; i_1695_ < 0; i_1695_++) {
						int i_1696_ = aByteArray11345[i_1674_++];
						if (i_1696_ != 0)
							is[i_1680_++] = anIntArray11346[i_1696_ & 0xff];
						else
							i_1680_++;
					}
					i_1674_ += i_1694_ + i_1679_;
					i_1680_ += i_1694_ + i_1678_;
				}
			}
		}
	}

	public void method2452(int i, int i_1697_, int i_1698_, int i_1699_, int[] is, int i_1700_, int i_1701_) {
		throw new IllegalStateException();
	}

	public void method2506(int i, int i_1702_, int i_1703_, int i_1704_, int[] is, int i_1705_, int i_1706_) {
		throw new IllegalStateException();
	}

	public void method2454(int i, int i_1707_, int i_1708_, int i_1709_, int[] is, int i_1710_, int i_1711_) {
		throw new IllegalStateException();
	}

	void method2453(int i, int i_1712_, int i_1713_, int i_1714_, int i_1715_, int i_1716_, int i_1717_, int i_1718_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (i_1713_ > 0 && i_1714_ > 0) {
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (is != null) {
				int i_1719_ = 0;
				int i_1720_ = 0;
				int i_1721_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
				int i_1722_ = anInt8921 + anInt8914 + anInt8919;
				int i_1723_ = anInt8918 + anInt8916 + anInt8920;
				int i_1724_ = (i_1722_ << 16) / i_1713_;
				int i_1725_ = (i_1723_ << 16) / i_1714_;
				if (anInt8921 > 0) {
					int i_1726_ = ((anInt8921 << 16) + i_1724_ - 1) / i_1724_;
					i += i_1726_;
					i_1719_ += i_1726_ * i_1724_ - (anInt8921 << 16);
				}
				if (anInt8918 > 0) {
					int i_1727_ = ((anInt8918 << 16) + i_1725_ - 1) / i_1725_;
					i_1712_ += i_1727_;
					i_1720_ += i_1727_ * i_1725_ - (anInt8918 << 16);
				}
				if (anInt8914 < i_1722_)
					i_1713_ = (((anInt8914 << 16) - i_1719_ + i_1724_ - 1) / i_1724_);
				if (anInt8916 < i_1723_)
					i_1714_ = (((anInt8916 << 16) - i_1720_ + i_1725_ - 1) / i_1725_);
				int i_1728_ = i + i_1712_ * i_1721_;
				int i_1729_ = i_1721_ - i_1713_;
				if (i_1712_ + i_1714_ > aClass178_Sub3_8923.anInt9826 * 489020741)
					i_1714_ -= (i_1712_ + i_1714_ - aClass178_Sub3_8923.anInt9826 * 489020741);
				if (i_1712_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
					int i_1730_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1712_;
					i_1714_ -= i_1730_;
					i_1728_ += i_1730_ * i_1721_;
					i_1720_ += i_1725_ * i_1730_;
				}
				if (i + i_1713_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
					int i_1731_ = (i + i_1713_ - aClass178_Sub3_8923.anInt9809 * -272361347);
					i_1713_ -= i_1731_;
					i_1729_ += i_1731_;
				}
				if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
					int i_1732_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
					i_1713_ -= i_1732_;
					i_1728_ += i_1732_;
					i_1719_ += i_1724_ * i_1732_;
					i_1729_ += i_1732_;
				}
				if (i_1717_ == 0) {
					if (i_1715_ == 1) {
						int i_1733_ = i_1719_;
						for (int i_1734_ = -i_1714_; i_1734_ < 0; i_1734_++) {
							int i_1735_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1736_ = -i_1713_; i_1736_ < 0; i_1736_++) {
								is[i_1728_++] = (anIntArray11346[(aByteArray11345[(i_1719_ >> 16) + i_1735_]) & 0xff]);
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1733_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 0) {
						int i_1737_ = (i_1716_ & 0xff0000) >> 16;
						int i_1738_ = (i_1716_ & 0xff00) >> 8;
						int i_1739_ = i_1716_ & 0xff;
						int i_1740_ = i_1719_;
						for (int i_1741_ = -i_1714_; i_1741_ < 0; i_1741_++) {
							int i_1742_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1743_ = -i_1713_; i_1743_ < 0; i_1743_++) {
								int i_1744_ = (anIntArray11346[(aByteArray11345[(i_1719_ >> 16) + i_1742_]) & 0xff]);
								int i_1745_ = ((i_1744_ & 0xff0000) * i_1737_ & ~0xffffff);
								int i_1746_ = (i_1744_ & 0xff00) * i_1738_ & 0xff0000;
								int i_1747_ = (i_1744_ & 0xff) * i_1739_ & 0xff00;
								is[i_1728_++] = (i_1745_ | i_1746_ | i_1747_) >>> 8;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1740_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 3) {
						int i_1748_ = i_1719_;
						for (int i_1749_ = -i_1714_; i_1749_ < 0; i_1749_++) {
							int i_1750_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1751_ = -i_1713_; i_1751_ < 0; i_1751_++) {
								byte i_1752_ = (aByteArray11345[(i_1719_ >> 16) + i_1750_]);
								int i_1753_ = (i_1752_ > 0 ? anIntArray11346[i_1752_] : 0);
								int i_1754_ = i_1753_ + i_1716_;
								int i_1755_ = ((i_1753_ & 0xff00ff) + (i_1716_ & 0xff00ff));
								int i_1756_ = ((i_1755_ & 0x1000100) + (i_1754_ - i_1755_ & 0x10000));
								is[i_1728_++] = i_1754_ - i_1756_ | i_1756_ - (i_1756_ >>> 8);
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1748_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 2) {
						int i_1757_ = i_1716_ >>> 24;
						int i_1758_ = 256 - i_1757_;
						int i_1759_ = (i_1716_ & 0xff00ff) * i_1758_ & ~0xff00ff;
						int i_1760_ = (i_1716_ & 0xff00) * i_1758_ & 0xff0000;
						i_1716_ = (i_1759_ | i_1760_) >>> 8;
						int i_1761_ = i_1719_;
						for (int i_1762_ = -i_1714_; i_1762_ < 0; i_1762_++) {
							int i_1763_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1764_ = -i_1713_; i_1764_ < 0; i_1764_++) {
								int i_1765_ = (anIntArray11346[(aByteArray11345[(i_1719_ >> 16) + i_1763_]) & 0xff]);
								i_1759_ = ((i_1765_ & 0xff00ff) * i_1757_ & ~0xff00ff);
								i_1760_ = (i_1765_ & 0xff00) * i_1757_ & 0xff0000;
								is[i_1728_++] = ((i_1759_ | i_1760_) >>> 8) + i_1716_;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1761_;
							i_1728_ += i_1729_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1717_ == 1) {
					if (i_1715_ == 1) {
						int i_1766_ = i_1719_;
						for (int i_1767_ = -i_1714_; i_1767_ < 0; i_1767_++) {
							int i_1768_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1769_ = -i_1713_; i_1769_ < 0; i_1769_++) {
								int i_1770_ = (aByteArray11345[(i_1719_ >> 16) + i_1768_]);
								if (i_1770_ != 0)
									is[i_1728_++] = anIntArray11346[i_1770_ & 0xff];
								else
									i_1728_++;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1766_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 0) {
						int i_1771_ = i_1719_;
						if ((i_1716_ & 0xffffff) == 16777215) {
							int i_1772_ = i_1716_ >>> 24;
							int i_1773_ = 256 - i_1772_;
							for (int i_1774_ = -i_1714_; i_1774_ < 0; i_1774_++) {
								int i_1775_ = (i_1720_ >> 16) * anInt8914;
								for (int i_1776_ = -i_1713_; i_1776_ < 0; i_1776_++) {
									int i_1777_ = (aByteArray11345[(i_1719_ >> 16) + i_1775_]);
									if (i_1777_ != 0) {
										int i_1778_ = anIntArray11346[i_1777_ & 0xff];
										int i_1779_ = is[i_1728_];
										is[i_1728_++] = ((((i_1778_ & 0xff00ff) * i_1772_ + ((i_1779_ & 0xff00ff) * i_1773_)) & ~0xff00ff) + (((i_1778_ & 0xff00) * i_1772_ + ((i_1779_ & 0xff00) * i_1773_)) & 0xff0000)) >> 8;
									} else
										i_1728_++;
									i_1719_ += i_1724_;
								}
								i_1720_ += i_1725_;
								i_1719_ = i_1771_;
								i_1728_ += i_1729_;
							}
						} else {
							int i_1780_ = (i_1716_ & 0xff0000) >> 16;
							int i_1781_ = (i_1716_ & 0xff00) >> 8;
							int i_1782_ = i_1716_ & 0xff;
							int i_1783_ = i_1716_ >>> 24;
							int i_1784_ = 256 - i_1783_;
							for (int i_1785_ = -i_1714_; i_1785_ < 0; i_1785_++) {
								int i_1786_ = (i_1720_ >> 16) * anInt8914;
								for (int i_1787_ = -i_1713_; i_1787_ < 0; i_1787_++) {
									int i_1788_ = (aByteArray11345[(i_1719_ >> 16) + i_1786_]);
									if (i_1788_ != 0) {
										int i_1789_ = anIntArray11346[i_1788_ & 0xff];
										if (i_1783_ != 255) {
											int i_1790_ = (((i_1789_ & 0xff0000) * i_1780_) & ~0xffffff);
											int i_1791_ = ((i_1789_ & 0xff00) * i_1781_ & 0xff0000);
											int i_1792_ = ((i_1789_ & 0xff) * i_1782_ & 0xff00);
											i_1789_ = (i_1790_ | i_1791_ | i_1792_) >>> 8;
											int i_1793_ = is[i_1728_];
											is[i_1728_++] = (((((i_1789_ & 0xff00ff) * i_1783_) + ((i_1793_ & 0xff00ff) * i_1784_)) & ~0xff00ff) + ((((i_1789_ & 0xff00) * i_1783_) + ((i_1793_ & 0xff00) * i_1784_)) & 0xff0000)) >> 8;
										} else {
											int i_1794_ = (((i_1789_ & 0xff0000) * i_1780_) & ~0xffffff);
											int i_1795_ = ((i_1789_ & 0xff00) * i_1781_ & 0xff0000);
											int i_1796_ = ((i_1789_ & 0xff) * i_1782_ & 0xff00);
											is[i_1728_++] = (i_1794_ | i_1795_ | i_1796_) >>> 8;
										}
									} else
										i_1728_++;
									i_1719_ += i_1724_;
								}
								i_1720_ += i_1725_;
								i_1719_ = i_1771_;
								i_1728_ += i_1729_;
							}
						}
					} else if (i_1715_ == 3) {
						int i_1797_ = i_1719_;
						int i_1798_ = i_1716_ >>> 24;
						int i_1799_ = 256 - i_1798_;
						for (int i_1800_ = -i_1714_; i_1800_ < 0; i_1800_++) {
							int i_1801_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1802_ = -i_1713_; i_1802_ < 0; i_1802_++) {
								byte i_1803_ = (aByteArray11345[(i_1719_ >> 16) + i_1801_]);
								int i_1804_ = (i_1803_ > 0 ? anIntArray11346[i_1803_] : 0);
								int i_1805_ = i_1804_ + i_1716_;
								int i_1806_ = ((i_1804_ & 0xff00ff) + (i_1716_ & 0xff00ff));
								int i_1807_ = ((i_1806_ & 0x1000100) + (i_1805_ - i_1806_ & 0x10000));
								i_1807_ = i_1805_ - i_1807_ | i_1807_ - (i_1807_ >>> 8);
								if (i_1804_ == 0 && i_1798_ != 255) {
									i_1804_ = i_1807_;
									i_1807_ = is[i_1728_];
									i_1807_ = ((((i_1804_ & 0xff00ff) * i_1798_ + (i_1807_ & 0xff00ff) * i_1799_) & ~0xff00ff) + (((i_1804_ & 0xff00) * i_1798_ + (i_1807_ & 0xff00) * i_1799_) & 0xff0000)) >> 8;
								}
								is[i_1728_++] = i_1807_;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1797_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 2) {
						int i_1808_ = i_1716_ >>> 24;
						int i_1809_ = 256 - i_1808_;
						int i_1810_ = (i_1716_ & 0xff00ff) * i_1809_ & ~0xff00ff;
						int i_1811_ = (i_1716_ & 0xff00) * i_1809_ & 0xff0000;
						i_1716_ = (i_1810_ | i_1811_) >>> 8;
						int i_1812_ = i_1719_;
						for (int i_1813_ = -i_1714_; i_1813_ < 0; i_1813_++) {
							int i_1814_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1815_ = -i_1713_; i_1815_ < 0; i_1815_++) {
								int i_1816_ = (aByteArray11345[(i_1719_ >> 16) + i_1814_]);
								if (i_1816_ != 0) {
									int i_1817_ = anIntArray11346[i_1816_ & 0xff];
									i_1810_ = ((i_1817_ & 0xff00ff) * i_1808_ & ~0xff00ff);
									i_1811_ = ((i_1817_ & 0xff00) * i_1808_ & 0xff0000);
									is[i_1728_++] = ((i_1810_ | i_1811_) >>> 8) + i_1716_;
								} else
									i_1728_++;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1812_;
							i_1728_ += i_1729_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1717_ == 2) {
					if (i_1715_ == 1) {
						int i_1818_ = i_1719_;
						for (int i_1819_ = -i_1714_; i_1819_ < 0; i_1819_++) {
							int i_1820_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1821_ = -i_1713_; i_1821_ < 0; i_1821_++) {
								int i_1822_ = (aByteArray11345[(i_1719_ >> 16) + i_1820_]);
								if (i_1822_ != 0) {
									int i_1823_ = anIntArray11346[i_1822_ & 0xff];
									int i_1824_ = is[i_1728_];
									int i_1825_ = i_1823_ + i_1824_;
									int i_1826_ = ((i_1823_ & 0xff00ff) + (i_1824_ & 0xff00ff));
									i_1824_ = ((i_1826_ & 0x1000100) + (i_1825_ - i_1826_ & 0x10000));
									is[i_1728_++] = (i_1825_ - i_1824_ | i_1824_ - (i_1824_ >>> 8));
								} else
									i_1728_++;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1818_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 0) {
						int i_1827_ = i_1719_;
						int i_1828_ = (i_1716_ & 0xff0000) >> 16;
						int i_1829_ = (i_1716_ & 0xff00) >> 8;
						int i_1830_ = i_1716_ & 0xff;
						for (int i_1831_ = -i_1714_; i_1831_ < 0; i_1831_++) {
							int i_1832_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1833_ = -i_1713_; i_1833_ < 0; i_1833_++) {
								int i_1834_ = (aByteArray11345[(i_1719_ >> 16) + i_1832_]);
								if (i_1834_ != 0) {
									int i_1835_ = anIntArray11346[i_1834_ & 0xff];
									int i_1836_ = ((i_1835_ & 0xff0000) * i_1828_ & ~0xffffff);
									int i_1837_ = ((i_1835_ & 0xff00) * i_1829_ & 0xff0000);
									int i_1838_ = (i_1835_ & 0xff) * i_1830_ & 0xff00;
									i_1835_ = (i_1836_ | i_1837_ | i_1838_) >>> 8;
									int i_1839_ = is[i_1728_];
									int i_1840_ = i_1835_ + i_1839_;
									int i_1841_ = ((i_1835_ & 0xff00ff) + (i_1839_ & 0xff00ff));
									i_1839_ = ((i_1841_ & 0x1000100) + (i_1840_ - i_1841_ & 0x10000));
									is[i_1728_++] = (i_1840_ - i_1839_ | i_1839_ - (i_1839_ >>> 8));
								} else
									i_1728_++;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1827_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 3) {
						int i_1842_ = i_1719_;
						for (int i_1843_ = -i_1714_; i_1843_ < 0; i_1843_++) {
							int i_1844_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1845_ = -i_1713_; i_1845_ < 0; i_1845_++) {
								byte i_1846_ = (aByteArray11345[(i_1719_ >> 16) + i_1844_]);
								int i_1847_ = (i_1846_ > 0 ? anIntArray11346[i_1846_] : 0);
								int i_1848_ = i_1847_ + i_1716_;
								int i_1849_ = ((i_1847_ & 0xff00ff) + (i_1716_ & 0xff00ff));
								int i_1850_ = ((i_1849_ & 0x1000100) + (i_1848_ - i_1849_ & 0x10000));
								i_1847_ = i_1848_ - i_1850_ | i_1850_ - (i_1850_ >>> 8);
								i_1850_ = is[i_1728_];
								i_1848_ = i_1847_ + i_1850_;
								i_1849_ = (i_1847_ & 0xff00ff) + (i_1850_ & 0xff00ff);
								i_1850_ = ((i_1849_ & 0x1000100) + (i_1848_ - i_1849_ & 0x10000));
								is[i_1728_++] = i_1848_ - i_1850_ | i_1850_ - (i_1850_ >>> 8);
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1842_;
							i_1728_ += i_1729_;
						}
					} else if (i_1715_ == 2) {
						int i_1851_ = i_1716_ >>> 24;
						int i_1852_ = 256 - i_1851_;
						int i_1853_ = (i_1716_ & 0xff00ff) * i_1852_ & ~0xff00ff;
						int i_1854_ = (i_1716_ & 0xff00) * i_1852_ & 0xff0000;
						i_1716_ = (i_1853_ | i_1854_) >>> 8;
						int i_1855_ = i_1719_;
						for (int i_1856_ = -i_1714_; i_1856_ < 0; i_1856_++) {
							int i_1857_ = (i_1720_ >> 16) * anInt8914;
							for (int i_1858_ = -i_1713_; i_1858_ < 0; i_1858_++) {
								int i_1859_ = (aByteArray11345[(i_1719_ >> 16) + i_1857_]);
								if (i_1859_ != 0) {
									int i_1860_ = anIntArray11346[i_1859_ & 0xff];
									i_1853_ = ((i_1860_ & 0xff00ff) * i_1851_ & ~0xff00ff);
									i_1854_ = ((i_1860_ & 0xff00) * i_1851_ & 0xff0000);
									i_1860_ = (((i_1853_ | i_1854_) >>> 8) + i_1716_);
									int i_1861_ = is[i_1728_];
									int i_1862_ = i_1860_ + i_1861_;
									int i_1863_ = ((i_1860_ & 0xff00ff) + (i_1861_ & 0xff00ff));
									i_1861_ = ((i_1863_ & 0x1000100) + (i_1862_ - i_1863_ & 0x10000));
									is[i_1728_++] = (i_1862_ - i_1861_ | i_1861_ - (i_1861_ >>> 8));
								} else
									i_1728_++;
								i_1719_ += i_1724_;
							}
							i_1720_ += i_1725_;
							i_1719_ = i_1855_;
							i_1728_ += i_1729_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2483(int i, int i_1864_, int i_1865_, int i_1866_, int[] is, int i_1867_, int i_1868_) {
		throw new IllegalStateException();
	}

	public void method2456(int i, int i_1869_, int i_1870_, int i_1871_, int[] is, int[] is_1872_, int i_1873_, int i_1874_) {
		throw new IllegalStateException();
	}

	public void method2460(int i, int i_1875_, int i_1876_, int i_1877_, int i_1878_, int i_1879_) {
		throw new IllegalStateException();
	}

	public void method2459(int i, int i_1880_, int i_1881_, int i_1882_, int[] is, int[] is_1883_, int i_1884_, int i_1885_) {
		throw new IllegalStateException();
	}

	public void method2433(int i, int i_1886_, int i_1887_, int i_1888_, int i_1889_, int i_1890_) {
		throw new IllegalStateException();
	}

	public void method2481(int i, int i_1891_, int i_1892_, int i_1893_, int i_1894_, int i_1895_) {
		throw new IllegalStateException();
	}

	public void method2493(int i, int i_1896_, int i_1897_, int i_1898_, int i_1899_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_1900_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_1896_ += anInt8918;
			int i_1901_ = i_1896_ * i_1900_ + i;
			int i_1902_ = 0;
			int i_1903_ = anInt8916;
			int i_1904_ = anInt8914;
			int i_1905_ = i_1900_ - i_1904_;
			int i_1906_ = 0;
			if (i_1896_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_1907_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1896_;
				i_1903_ -= i_1907_;
				i_1896_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_1902_ += i_1907_ * i_1904_;
				i_1901_ += i_1907_ * i_1900_;
			}
			if (i_1896_ + i_1903_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_1903_ -= (i_1896_ + i_1903_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_1908_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_1904_ -= i_1908_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_1902_ += i_1908_;
				i_1901_ += i_1908_;
				i_1906_ += i_1908_;
				i_1905_ += i_1908_;
			}
			if (i + i_1904_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_1909_ = i + i_1904_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_1904_ -= i_1909_;
				i_1906_ += i_1909_;
				i_1905_ += i_1909_;
			}
			if (i_1904_ > 0 && i_1903_ > 0) {
				if (i_1899_ == 0) {
					if (i_1897_ == 1) {
						for (int i_1910_ = -i_1903_; i_1910_ < 0; i_1910_++) {
							int i_1911_ = i_1901_ + i_1904_ - 3;
							while (i_1901_ < i_1911_) {
								is[i_1901_++] = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
								is[i_1901_++] = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
								is[i_1901_++] = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
								is[i_1901_++] = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
							}
							i_1911_ += 3;
							while (i_1901_ < i_1911_)
								is[i_1901_++] = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 0) {
						int i_1912_ = (i_1898_ & 0xff0000) >> 16;
						int i_1913_ = (i_1898_ & 0xff00) >> 8;
						int i_1914_ = i_1898_ & 0xff;
						for (int i_1915_ = -i_1903_; i_1915_ < 0; i_1915_++) {
							for (int i_1916_ = -i_1904_; i_1916_ < 0; i_1916_++) {
								int i_1917_ = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
								int i_1918_ = ((i_1917_ & 0xff0000) * i_1912_ & ~0xffffff);
								int i_1919_ = (i_1917_ & 0xff00) * i_1913_ & 0xff0000;
								int i_1920_ = (i_1917_ & 0xff) * i_1914_ & 0xff00;
								is[i_1901_++] = (i_1918_ | i_1919_ | i_1920_) >>> 8;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 3) {
						for (int i_1921_ = -i_1903_; i_1921_ < 0; i_1921_++) {
							for (int i_1922_ = -i_1904_; i_1922_ < 0; i_1922_++) {
								int i_1923_ = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
								int i_1924_ = i_1923_ + i_1898_;
								int i_1925_ = ((i_1923_ & 0xff00ff) + (i_1898_ & 0xff00ff));
								int i_1926_ = ((i_1925_ & 0x1000100) + (i_1924_ - i_1925_ & 0x10000));
								is[i_1901_++] = i_1924_ - i_1926_ | i_1926_ - (i_1926_ >>> 8);
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 2) {
						int i_1927_ = i_1898_ >>> 24;
						int i_1928_ = 256 - i_1927_;
						int i_1929_ = (i_1898_ & 0xff00ff) * i_1928_ & ~0xff00ff;
						int i_1930_ = (i_1898_ & 0xff00) * i_1928_ & 0xff0000;
						i_1898_ = (i_1929_ | i_1930_) >>> 8;
						for (int i_1931_ = -i_1903_; i_1931_ < 0; i_1931_++) {
							for (int i_1932_ = -i_1904_; i_1932_ < 0; i_1932_++) {
								int i_1933_ = (anIntArray11346[aByteArray11345[i_1902_++] & 0xff]);
								i_1929_ = ((i_1933_ & 0xff00ff) * i_1927_ & ~0xff00ff);
								i_1930_ = (i_1933_ & 0xff00) * i_1927_ & 0xff0000;
								is[i_1901_++] = ((i_1929_ | i_1930_) >>> 8) + i_1898_;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1899_ == 1) {
					if (i_1897_ == 1) {
						for (int i_1934_ = -i_1903_; i_1934_ < 0; i_1934_++) {
							for (int i_1935_ = -i_1904_; i_1935_ < 0; i_1935_++) {
								int i_1936_ = aByteArray11345[i_1902_++];
								if (i_1936_ != 0) {
									int i_1937_ = (anIntArray11346[i_1936_ & 0xff] | ~0xffffff);
									int i_1938_ = 255;
									int i_1939_ = 0;
									int i_1940_ = is[i_1901_];
									is[i_1901_++] = (((((i_1937_ & 0xff00ff) * i_1938_ + (i_1940_ & 0xff00ff) * i_1939_) & ~0xff00ff) >> 8) + (((((i_1937_ & ~0xff00ff) >>> 8) * i_1938_) + (((i_1940_ & ~0xff00ff) >>> 8) * i_1939_)) & ~0xff00ff));
								} else
									i_1901_++;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 0) {
						if ((i_1898_ & 0xffffff) == 16777215) {
							int i_1941_ = i_1898_ >>> 24;
							int i_1942_ = 256 - i_1941_;
							for (int i_1943_ = -i_1903_; i_1943_ < 0; i_1943_++) {
								for (int i_1944_ = -i_1904_; i_1944_ < 0; i_1944_++) {
									int i_1945_ = aByteArray11345[i_1902_++];
									if (i_1945_ != 0) {
										int i_1946_ = anIntArray11346[i_1945_ & 0xff];
										int i_1947_ = is[i_1901_];
										is[i_1901_++] = ((((i_1946_ & 0xff00ff) * i_1941_ + ((i_1947_ & 0xff00ff) * i_1942_)) & ~0xff00ff) + (((i_1946_ & 0xff00) * i_1941_ + ((i_1947_ & 0xff00) * i_1942_)) & 0xff0000)) >> 8;
									} else
										i_1901_++;
								}
								i_1901_ += i_1905_;
								i_1902_ += i_1906_;
							}
						} else {
							int i_1948_ = (i_1898_ & 0xff0000) >> 16;
							int i_1949_ = (i_1898_ & 0xff00) >> 8;
							int i_1950_ = i_1898_ & 0xff;
							int i_1951_ = i_1898_ >>> 24;
							int i_1952_ = 256 - i_1951_;
							for (int i_1953_ = -i_1903_; i_1953_ < 0; i_1953_++) {
								for (int i_1954_ = -i_1904_; i_1954_ < 0; i_1954_++) {
									int i_1955_ = aByteArray11345[i_1902_++];
									if (i_1955_ != 0) {
										int i_1956_ = anIntArray11346[i_1955_ & 0xff];
										if (i_1951_ != 255) {
											int i_1957_ = (((i_1956_ & 0xff0000) * i_1948_) & ~0xffffff);
											int i_1958_ = ((i_1956_ & 0xff00) * i_1949_ & 0xff0000);
											int i_1959_ = ((i_1956_ & 0xff) * i_1950_ & 0xff00);
											i_1956_ = (i_1957_ | i_1958_ | i_1959_) >>> 8;
											int i_1960_ = is[i_1901_];
											is[i_1901_++] = (((((i_1956_ & 0xff00ff) * i_1951_) + ((i_1960_ & 0xff00ff) * i_1952_)) & ~0xff00ff) + ((((i_1956_ & 0xff00) * i_1951_) + ((i_1960_ & 0xff00) * i_1952_)) & 0xff0000)) >> 8;
										} else {
											int i_1961_ = (((i_1956_ & 0xff0000) * i_1948_) & ~0xffffff);
											int i_1962_ = ((i_1956_ & 0xff00) * i_1949_ & 0xff0000);
											int i_1963_ = ((i_1956_ & 0xff) * i_1950_ & 0xff00);
											is[i_1901_++] = (i_1961_ | i_1962_ | i_1963_) >>> 8;
										}
									} else
										i_1901_++;
								}
								i_1901_ += i_1905_;
								i_1902_ += i_1906_;
							}
						}
					} else if (i_1897_ == 3) {
						int i_1964_ = i_1898_ >>> 24;
						int i_1965_ = 256 - i_1964_;
						for (int i_1966_ = -i_1903_; i_1966_ < 0; i_1966_++) {
							for (int i_1967_ = -i_1904_; i_1967_ < 0; i_1967_++) {
								byte i_1968_ = aByteArray11345[i_1902_++];
								int i_1969_ = (i_1968_ > 0 ? anIntArray11346[i_1968_] : 0);
								int i_1970_ = i_1969_ + i_1898_;
								int i_1971_ = ((i_1969_ & 0xff00ff) + (i_1898_ & 0xff00ff));
								int i_1972_ = ((i_1971_ & 0x1000100) + (i_1970_ - i_1971_ & 0x10000));
								i_1972_ = i_1970_ - i_1972_ | i_1972_ - (i_1972_ >>> 8);
								if (i_1969_ == 0 && i_1964_ != 255) {
									i_1969_ = i_1972_;
									i_1972_ = is[i_1901_];
									i_1972_ = ((((i_1969_ & 0xff00ff) * i_1964_ + (i_1972_ & 0xff00ff) * i_1965_) & ~0xff00ff) + (((i_1969_ & 0xff00) * i_1964_ + (i_1972_ & 0xff00) * i_1965_) & 0xff0000)) >> 8;
								}
								is[i_1901_++] = i_1972_;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 2) {
						int i_1973_ = i_1898_ >>> 24;
						int i_1974_ = 256 - i_1973_;
						int i_1975_ = (i_1898_ & 0xff00ff) * i_1974_ & ~0xff00ff;
						int i_1976_ = (i_1898_ & 0xff00) * i_1974_ & 0xff0000;
						i_1898_ = (i_1975_ | i_1976_) >>> 8;
						for (int i_1977_ = -i_1903_; i_1977_ < 0; i_1977_++) {
							for (int i_1978_ = -i_1904_; i_1978_ < 0; i_1978_++) {
								int i_1979_ = aByteArray11345[i_1902_++];
								if (i_1979_ != 0) {
									int i_1980_ = anIntArray11346[i_1979_ & 0xff];
									i_1975_ = ((i_1980_ & 0xff00ff) * i_1973_ & ~0xff00ff);
									i_1976_ = ((i_1980_ & 0xff00) * i_1973_ & 0xff0000);
									is[i_1901_++] = ((i_1975_ | i_1976_) >>> 8) + i_1898_;
								} else
									i_1901_++;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1899_ == 2) {
					if (i_1897_ == 1) {
						for (int i_1981_ = -i_1903_; i_1981_ < 0; i_1981_++) {
							for (int i_1982_ = -i_1904_; i_1982_ < 0; i_1982_++) {
								int i_1983_ = aByteArray11345[i_1902_++];
								if (i_1983_ != 0) {
									int i_1984_ = anIntArray11346[i_1983_ & 0xff];
									int i_1985_ = is[i_1901_];
									int i_1986_ = i_1984_ + i_1985_;
									int i_1987_ = ((i_1984_ & 0xff00ff) + (i_1985_ & 0xff00ff));
									i_1985_ = ((i_1987_ & 0x1000100) + (i_1986_ - i_1987_ & 0x10000));
									is[i_1901_++] = (i_1986_ - i_1985_ | i_1985_ - (i_1985_ >>> 8));
								} else
									i_1901_++;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 0) {
						int i_1988_ = (i_1898_ & 0xff0000) >> 16;
						int i_1989_ = (i_1898_ & 0xff00) >> 8;
						int i_1990_ = i_1898_ & 0xff;
						for (int i_1991_ = -i_1903_; i_1991_ < 0; i_1991_++) {
							for (int i_1992_ = -i_1904_; i_1992_ < 0; i_1992_++) {
								int i_1993_ = aByteArray11345[i_1902_++];
								if (i_1993_ != 0) {
									int i_1994_ = anIntArray11346[i_1993_ & 0xff];
									int i_1995_ = ((i_1994_ & 0xff0000) * i_1988_ & ~0xffffff);
									int i_1996_ = ((i_1994_ & 0xff00) * i_1989_ & 0xff0000);
									int i_1997_ = (i_1994_ & 0xff) * i_1990_ & 0xff00;
									i_1994_ = (i_1995_ | i_1996_ | i_1997_) >>> 8;
									int i_1998_ = is[i_1901_];
									int i_1999_ = i_1994_ + i_1998_;
									int i_2000_ = ((i_1994_ & 0xff00ff) + (i_1998_ & 0xff00ff));
									i_1998_ = ((i_2000_ & 0x1000100) + (i_1999_ - i_2000_ & 0x10000));
									is[i_1901_++] = (i_1999_ - i_1998_ | i_1998_ - (i_1998_ >>> 8));
								} else
									i_1901_++;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 3) {
						for (int i_2001_ = -i_1903_; i_2001_ < 0; i_2001_++) {
							for (int i_2002_ = -i_1904_; i_2002_ < 0; i_2002_++) {
								byte i_2003_ = aByteArray11345[i_1902_++];
								int i_2004_ = (i_2003_ > 0 ? anIntArray11346[i_2003_] : 0);
								int i_2005_ = i_2004_ + i_1898_;
								int i_2006_ = ((i_2004_ & 0xff00ff) + (i_1898_ & 0xff00ff));
								int i_2007_ = ((i_2006_ & 0x1000100) + (i_2005_ - i_2006_ & 0x10000));
								i_2004_ = i_2005_ - i_2007_ | i_2007_ - (i_2007_ >>> 8);
								i_2007_ = is[i_1901_];
								i_2005_ = i_2004_ + i_2007_;
								i_2006_ = (i_2004_ & 0xff00ff) + (i_2007_ & 0xff00ff);
								i_2007_ = ((i_2006_ & 0x1000100) + (i_2005_ - i_2006_ & 0x10000));
								is[i_1901_++] = i_2005_ - i_2007_ | i_2007_ - (i_2007_ >>> 8);
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else if (i_1897_ == 2) {
						int i_2008_ = i_1898_ >>> 24;
						int i_2009_ = 256 - i_2008_;
						int i_2010_ = (i_1898_ & 0xff00ff) * i_2009_ & ~0xff00ff;
						int i_2011_ = (i_1898_ & 0xff00) * i_2009_ & 0xff0000;
						i_1898_ = (i_2010_ | i_2011_) >>> 8;
						for (int i_2012_ = -i_1903_; i_2012_ < 0; i_2012_++) {
							for (int i_2013_ = -i_1904_; i_2013_ < 0; i_2013_++) {
								int i_2014_ = aByteArray11345[i_1902_++];
								if (i_2014_ != 0) {
									int i_2015_ = anIntArray11346[i_2014_ & 0xff];
									i_2010_ = ((i_2015_ & 0xff00ff) * i_2008_ & ~0xff00ff);
									i_2011_ = ((i_2015_ & 0xff00) * i_2008_ & 0xff0000);
									i_2015_ = (((i_2010_ | i_2011_) >>> 8) + i_1898_);
									int i_2016_ = is[i_1901_];
									int i_2017_ = i_2015_ + i_2016_;
									int i_2018_ = ((i_2015_ & 0xff00ff) + (i_2016_ & 0xff00ff));
									i_2016_ = ((i_2018_ & 0x1000100) + (i_2017_ - i_2018_ & 0x10000));
									is[i_1901_++] = (i_2017_ - i_2016_ | i_2016_ - (i_2016_ >>> 8));
								} else
									i_1901_++;
							}
							i_1901_ += i_1905_;
							i_1902_ += i_1906_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2463(int i, int i_2019_, int i_2020_, int i_2021_, int i_2022_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_2023_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_2019_ += anInt8918;
			int i_2024_ = i_2019_ * i_2023_ + i;
			int i_2025_ = 0;
			int i_2026_ = anInt8916;
			int i_2027_ = anInt8914;
			int i_2028_ = i_2023_ - i_2027_;
			int i_2029_ = 0;
			if (i_2019_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_2030_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_2019_;
				i_2026_ -= i_2030_;
				i_2019_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_2025_ += i_2030_ * i_2027_;
				i_2024_ += i_2030_ * i_2023_;
			}
			if (i_2019_ + i_2026_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_2026_ -= (i_2019_ + i_2026_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_2031_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_2027_ -= i_2031_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_2025_ += i_2031_;
				i_2024_ += i_2031_;
				i_2029_ += i_2031_;
				i_2028_ += i_2031_;
			}
			if (i + i_2027_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_2032_ = i + i_2027_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_2027_ -= i_2032_;
				i_2029_ += i_2032_;
				i_2028_ += i_2032_;
			}
			if (i_2027_ > 0 && i_2026_ > 0) {
				if (i_2022_ == 0) {
					if (i_2020_ == 1) {
						for (int i_2033_ = -i_2026_; i_2033_ < 0; i_2033_++) {
							int i_2034_ = i_2024_ + i_2027_ - 3;
							while (i_2024_ < i_2034_) {
								is[i_2024_++] = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
								is[i_2024_++] = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
								is[i_2024_++] = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
								is[i_2024_++] = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
							}
							i_2034_ += 3;
							while (i_2024_ < i_2034_)
								is[i_2024_++] = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 0) {
						int i_2035_ = (i_2021_ & 0xff0000) >> 16;
						int i_2036_ = (i_2021_ & 0xff00) >> 8;
						int i_2037_ = i_2021_ & 0xff;
						for (int i_2038_ = -i_2026_; i_2038_ < 0; i_2038_++) {
							for (int i_2039_ = -i_2027_; i_2039_ < 0; i_2039_++) {
								int i_2040_ = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
								int i_2041_ = ((i_2040_ & 0xff0000) * i_2035_ & ~0xffffff);
								int i_2042_ = (i_2040_ & 0xff00) * i_2036_ & 0xff0000;
								int i_2043_ = (i_2040_ & 0xff) * i_2037_ & 0xff00;
								is[i_2024_++] = (i_2041_ | i_2042_ | i_2043_) >>> 8;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 3) {
						for (int i_2044_ = -i_2026_; i_2044_ < 0; i_2044_++) {
							for (int i_2045_ = -i_2027_; i_2045_ < 0; i_2045_++) {
								int i_2046_ = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
								int i_2047_ = i_2046_ + i_2021_;
								int i_2048_ = ((i_2046_ & 0xff00ff) + (i_2021_ & 0xff00ff));
								int i_2049_ = ((i_2048_ & 0x1000100) + (i_2047_ - i_2048_ & 0x10000));
								is[i_2024_++] = i_2047_ - i_2049_ | i_2049_ - (i_2049_ >>> 8);
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 2) {
						int i_2050_ = i_2021_ >>> 24;
						int i_2051_ = 256 - i_2050_;
						int i_2052_ = (i_2021_ & 0xff00ff) * i_2051_ & ~0xff00ff;
						int i_2053_ = (i_2021_ & 0xff00) * i_2051_ & 0xff0000;
						i_2021_ = (i_2052_ | i_2053_) >>> 8;
						for (int i_2054_ = -i_2026_; i_2054_ < 0; i_2054_++) {
							for (int i_2055_ = -i_2027_; i_2055_ < 0; i_2055_++) {
								int i_2056_ = (anIntArray11346[aByteArray11345[i_2025_++] & 0xff]);
								i_2052_ = ((i_2056_ & 0xff00ff) * i_2050_ & ~0xff00ff);
								i_2053_ = (i_2056_ & 0xff00) * i_2050_ & 0xff0000;
								is[i_2024_++] = ((i_2052_ | i_2053_) >>> 8) + i_2021_;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2022_ == 1) {
					if (i_2020_ == 1) {
						for (int i_2057_ = -i_2026_; i_2057_ < 0; i_2057_++) {
							for (int i_2058_ = -i_2027_; i_2058_ < 0; i_2058_++) {
								int i_2059_ = aByteArray11345[i_2025_++];
								if (i_2059_ != 0) {
									int i_2060_ = (anIntArray11346[i_2059_ & 0xff] | ~0xffffff);
									int i_2061_ = 255;
									int i_2062_ = 0;
									int i_2063_ = is[i_2024_];
									is[i_2024_++] = (((((i_2060_ & 0xff00ff) * i_2061_ + (i_2063_ & 0xff00ff) * i_2062_) & ~0xff00ff) >> 8) + (((((i_2060_ & ~0xff00ff) >>> 8) * i_2061_) + (((i_2063_ & ~0xff00ff) >>> 8) * i_2062_)) & ~0xff00ff));
								} else
									i_2024_++;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 0) {
						if ((i_2021_ & 0xffffff) == 16777215) {
							int i_2064_ = i_2021_ >>> 24;
							int i_2065_ = 256 - i_2064_;
							for (int i_2066_ = -i_2026_; i_2066_ < 0; i_2066_++) {
								for (int i_2067_ = -i_2027_; i_2067_ < 0; i_2067_++) {
									int i_2068_ = aByteArray11345[i_2025_++];
									if (i_2068_ != 0) {
										int i_2069_ = anIntArray11346[i_2068_ & 0xff];
										int i_2070_ = is[i_2024_];
										is[i_2024_++] = ((((i_2069_ & 0xff00ff) * i_2064_ + ((i_2070_ & 0xff00ff) * i_2065_)) & ~0xff00ff) + (((i_2069_ & 0xff00) * i_2064_ + ((i_2070_ & 0xff00) * i_2065_)) & 0xff0000)) >> 8;
									} else
										i_2024_++;
								}
								i_2024_ += i_2028_;
								i_2025_ += i_2029_;
							}
						} else {
							int i_2071_ = (i_2021_ & 0xff0000) >> 16;
							int i_2072_ = (i_2021_ & 0xff00) >> 8;
							int i_2073_ = i_2021_ & 0xff;
							int i_2074_ = i_2021_ >>> 24;
							int i_2075_ = 256 - i_2074_;
							for (int i_2076_ = -i_2026_; i_2076_ < 0; i_2076_++) {
								for (int i_2077_ = -i_2027_; i_2077_ < 0; i_2077_++) {
									int i_2078_ = aByteArray11345[i_2025_++];
									if (i_2078_ != 0) {
										int i_2079_ = anIntArray11346[i_2078_ & 0xff];
										if (i_2074_ != 255) {
											int i_2080_ = (((i_2079_ & 0xff0000) * i_2071_) & ~0xffffff);
											int i_2081_ = ((i_2079_ & 0xff00) * i_2072_ & 0xff0000);
											int i_2082_ = ((i_2079_ & 0xff) * i_2073_ & 0xff00);
											i_2079_ = (i_2080_ | i_2081_ | i_2082_) >>> 8;
											int i_2083_ = is[i_2024_];
											is[i_2024_++] = (((((i_2079_ & 0xff00ff) * i_2074_) + ((i_2083_ & 0xff00ff) * i_2075_)) & ~0xff00ff) + ((((i_2079_ & 0xff00) * i_2074_) + ((i_2083_ & 0xff00) * i_2075_)) & 0xff0000)) >> 8;
										} else {
											int i_2084_ = (((i_2079_ & 0xff0000) * i_2071_) & ~0xffffff);
											int i_2085_ = ((i_2079_ & 0xff00) * i_2072_ & 0xff0000);
											int i_2086_ = ((i_2079_ & 0xff) * i_2073_ & 0xff00);
											is[i_2024_++] = (i_2084_ | i_2085_ | i_2086_) >>> 8;
										}
									} else
										i_2024_++;
								}
								i_2024_ += i_2028_;
								i_2025_ += i_2029_;
							}
						}
					} else if (i_2020_ == 3) {
						int i_2087_ = i_2021_ >>> 24;
						int i_2088_ = 256 - i_2087_;
						for (int i_2089_ = -i_2026_; i_2089_ < 0; i_2089_++) {
							for (int i_2090_ = -i_2027_; i_2090_ < 0; i_2090_++) {
								byte i_2091_ = aByteArray11345[i_2025_++];
								int i_2092_ = (i_2091_ > 0 ? anIntArray11346[i_2091_] : 0);
								int i_2093_ = i_2092_ + i_2021_;
								int i_2094_ = ((i_2092_ & 0xff00ff) + (i_2021_ & 0xff00ff));
								int i_2095_ = ((i_2094_ & 0x1000100) + (i_2093_ - i_2094_ & 0x10000));
								i_2095_ = i_2093_ - i_2095_ | i_2095_ - (i_2095_ >>> 8);
								if (i_2092_ == 0 && i_2087_ != 255) {
									i_2092_ = i_2095_;
									i_2095_ = is[i_2024_];
									i_2095_ = ((((i_2092_ & 0xff00ff) * i_2087_ + (i_2095_ & 0xff00ff) * i_2088_) & ~0xff00ff) + (((i_2092_ & 0xff00) * i_2087_ + (i_2095_ & 0xff00) * i_2088_) & 0xff0000)) >> 8;
								}
								is[i_2024_++] = i_2095_;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 2) {
						int i_2096_ = i_2021_ >>> 24;
						int i_2097_ = 256 - i_2096_;
						int i_2098_ = (i_2021_ & 0xff00ff) * i_2097_ & ~0xff00ff;
						int i_2099_ = (i_2021_ & 0xff00) * i_2097_ & 0xff0000;
						i_2021_ = (i_2098_ | i_2099_) >>> 8;
						for (int i_2100_ = -i_2026_; i_2100_ < 0; i_2100_++) {
							for (int i_2101_ = -i_2027_; i_2101_ < 0; i_2101_++) {
								int i_2102_ = aByteArray11345[i_2025_++];
								if (i_2102_ != 0) {
									int i_2103_ = anIntArray11346[i_2102_ & 0xff];
									i_2098_ = ((i_2103_ & 0xff00ff) * i_2096_ & ~0xff00ff);
									i_2099_ = ((i_2103_ & 0xff00) * i_2096_ & 0xff0000);
									is[i_2024_++] = ((i_2098_ | i_2099_) >>> 8) + i_2021_;
								} else
									i_2024_++;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2022_ == 2) {
					if (i_2020_ == 1) {
						for (int i_2104_ = -i_2026_; i_2104_ < 0; i_2104_++) {
							for (int i_2105_ = -i_2027_; i_2105_ < 0; i_2105_++) {
								int i_2106_ = aByteArray11345[i_2025_++];
								if (i_2106_ != 0) {
									int i_2107_ = anIntArray11346[i_2106_ & 0xff];
									int i_2108_ = is[i_2024_];
									int i_2109_ = i_2107_ + i_2108_;
									int i_2110_ = ((i_2107_ & 0xff00ff) + (i_2108_ & 0xff00ff));
									i_2108_ = ((i_2110_ & 0x1000100) + (i_2109_ - i_2110_ & 0x10000));
									is[i_2024_++] = (i_2109_ - i_2108_ | i_2108_ - (i_2108_ >>> 8));
								} else
									i_2024_++;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 0) {
						int i_2111_ = (i_2021_ & 0xff0000) >> 16;
						int i_2112_ = (i_2021_ & 0xff00) >> 8;
						int i_2113_ = i_2021_ & 0xff;
						for (int i_2114_ = -i_2026_; i_2114_ < 0; i_2114_++) {
							for (int i_2115_ = -i_2027_; i_2115_ < 0; i_2115_++) {
								int i_2116_ = aByteArray11345[i_2025_++];
								if (i_2116_ != 0) {
									int i_2117_ = anIntArray11346[i_2116_ & 0xff];
									int i_2118_ = ((i_2117_ & 0xff0000) * i_2111_ & ~0xffffff);
									int i_2119_ = ((i_2117_ & 0xff00) * i_2112_ & 0xff0000);
									int i_2120_ = (i_2117_ & 0xff) * i_2113_ & 0xff00;
									i_2117_ = (i_2118_ | i_2119_ | i_2120_) >>> 8;
									int i_2121_ = is[i_2024_];
									int i_2122_ = i_2117_ + i_2121_;
									int i_2123_ = ((i_2117_ & 0xff00ff) + (i_2121_ & 0xff00ff));
									i_2121_ = ((i_2123_ & 0x1000100) + (i_2122_ - i_2123_ & 0x10000));
									is[i_2024_++] = (i_2122_ - i_2121_ | i_2121_ - (i_2121_ >>> 8));
								} else
									i_2024_++;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 3) {
						for (int i_2124_ = -i_2026_; i_2124_ < 0; i_2124_++) {
							for (int i_2125_ = -i_2027_; i_2125_ < 0; i_2125_++) {
								byte i_2126_ = aByteArray11345[i_2025_++];
								int i_2127_ = (i_2126_ > 0 ? anIntArray11346[i_2126_] : 0);
								int i_2128_ = i_2127_ + i_2021_;
								int i_2129_ = ((i_2127_ & 0xff00ff) + (i_2021_ & 0xff00ff));
								int i_2130_ = ((i_2129_ & 0x1000100) + (i_2128_ - i_2129_ & 0x10000));
								i_2127_ = i_2128_ - i_2130_ | i_2130_ - (i_2130_ >>> 8);
								i_2130_ = is[i_2024_];
								i_2128_ = i_2127_ + i_2130_;
								i_2129_ = (i_2127_ & 0xff00ff) + (i_2130_ & 0xff00ff);
								i_2130_ = ((i_2129_ & 0x1000100) + (i_2128_ - i_2129_ & 0x10000));
								is[i_2024_++] = i_2128_ - i_2130_ | i_2130_ - (i_2130_ >>> 8);
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else if (i_2020_ == 2) {
						int i_2131_ = i_2021_ >>> 24;
						int i_2132_ = 256 - i_2131_;
						int i_2133_ = (i_2021_ & 0xff00ff) * i_2132_ & ~0xff00ff;
						int i_2134_ = (i_2021_ & 0xff00) * i_2132_ & 0xff0000;
						i_2021_ = (i_2133_ | i_2134_) >>> 8;
						for (int i_2135_ = -i_2026_; i_2135_ < 0; i_2135_++) {
							for (int i_2136_ = -i_2027_; i_2136_ < 0; i_2136_++) {
								int i_2137_ = aByteArray11345[i_2025_++];
								if (i_2137_ != 0) {
									int i_2138_ = anIntArray11346[i_2137_ & 0xff];
									i_2133_ = ((i_2138_ & 0xff00ff) * i_2131_ & ~0xff00ff);
									i_2134_ = ((i_2138_ & 0xff00) * i_2131_ & 0xff0000);
									i_2138_ = (((i_2133_ | i_2134_) >>> 8) + i_2021_);
									int i_2139_ = is[i_2024_];
									int i_2140_ = i_2138_ + i_2139_;
									int i_2141_ = ((i_2138_ & 0xff00ff) + (i_2139_ & 0xff00ff));
									i_2139_ = ((i_2141_ & 0x1000100) + (i_2140_ - i_2141_ & 0x10000));
									is[i_2024_++] = (i_2140_ - i_2139_ | i_2139_ - (i_2139_ >>> 8));
								} else
									i_2024_++;
							}
							i_2024_ += i_2028_;
							i_2025_ += i_2029_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2486(int i, int i_2142_, int i_2143_, int i_2144_, int i_2145_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_2146_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_2142_ += anInt8918;
			int i_2147_ = i_2142_ * i_2146_ + i;
			int i_2148_ = 0;
			int i_2149_ = anInt8916;
			int i_2150_ = anInt8914;
			int i_2151_ = i_2146_ - i_2150_;
			int i_2152_ = 0;
			if (i_2142_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_2153_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_2142_;
				i_2149_ -= i_2153_;
				i_2142_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_2148_ += i_2153_ * i_2150_;
				i_2147_ += i_2153_ * i_2146_;
			}
			if (i_2142_ + i_2149_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_2149_ -= (i_2142_ + i_2149_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_2154_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_2150_ -= i_2154_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_2148_ += i_2154_;
				i_2147_ += i_2154_;
				i_2152_ += i_2154_;
				i_2151_ += i_2154_;
			}
			if (i + i_2150_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_2155_ = i + i_2150_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_2150_ -= i_2155_;
				i_2152_ += i_2155_;
				i_2151_ += i_2155_;
			}
			if (i_2150_ > 0 && i_2149_ > 0) {
				if (i_2145_ == 0) {
					if (i_2143_ == 1) {
						for (int i_2156_ = -i_2149_; i_2156_ < 0; i_2156_++) {
							int i_2157_ = i_2147_ + i_2150_ - 3;
							while (i_2147_ < i_2157_) {
								is[i_2147_++] = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
								is[i_2147_++] = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
								is[i_2147_++] = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
								is[i_2147_++] = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
							}
							i_2157_ += 3;
							while (i_2147_ < i_2157_)
								is[i_2147_++] = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 0) {
						int i_2158_ = (i_2144_ & 0xff0000) >> 16;
						int i_2159_ = (i_2144_ & 0xff00) >> 8;
						int i_2160_ = i_2144_ & 0xff;
						for (int i_2161_ = -i_2149_; i_2161_ < 0; i_2161_++) {
							for (int i_2162_ = -i_2150_; i_2162_ < 0; i_2162_++) {
								int i_2163_ = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
								int i_2164_ = ((i_2163_ & 0xff0000) * i_2158_ & ~0xffffff);
								int i_2165_ = (i_2163_ & 0xff00) * i_2159_ & 0xff0000;
								int i_2166_ = (i_2163_ & 0xff) * i_2160_ & 0xff00;
								is[i_2147_++] = (i_2164_ | i_2165_ | i_2166_) >>> 8;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 3) {
						for (int i_2167_ = -i_2149_; i_2167_ < 0; i_2167_++) {
							for (int i_2168_ = -i_2150_; i_2168_ < 0; i_2168_++) {
								int i_2169_ = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
								int i_2170_ = i_2169_ + i_2144_;
								int i_2171_ = ((i_2169_ & 0xff00ff) + (i_2144_ & 0xff00ff));
								int i_2172_ = ((i_2171_ & 0x1000100) + (i_2170_ - i_2171_ & 0x10000));
								is[i_2147_++] = i_2170_ - i_2172_ | i_2172_ - (i_2172_ >>> 8);
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 2) {
						int i_2173_ = i_2144_ >>> 24;
						int i_2174_ = 256 - i_2173_;
						int i_2175_ = (i_2144_ & 0xff00ff) * i_2174_ & ~0xff00ff;
						int i_2176_ = (i_2144_ & 0xff00) * i_2174_ & 0xff0000;
						i_2144_ = (i_2175_ | i_2176_) >>> 8;
						for (int i_2177_ = -i_2149_; i_2177_ < 0; i_2177_++) {
							for (int i_2178_ = -i_2150_; i_2178_ < 0; i_2178_++) {
								int i_2179_ = (anIntArray11346[aByteArray11345[i_2148_++] & 0xff]);
								i_2175_ = ((i_2179_ & 0xff00ff) * i_2173_ & ~0xff00ff);
								i_2176_ = (i_2179_ & 0xff00) * i_2173_ & 0xff0000;
								is[i_2147_++] = ((i_2175_ | i_2176_) >>> 8) + i_2144_;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2145_ == 1) {
					if (i_2143_ == 1) {
						for (int i_2180_ = -i_2149_; i_2180_ < 0; i_2180_++) {
							for (int i_2181_ = -i_2150_; i_2181_ < 0; i_2181_++) {
								int i_2182_ = aByteArray11345[i_2148_++];
								if (i_2182_ != 0) {
									int i_2183_ = (anIntArray11346[i_2182_ & 0xff] | ~0xffffff);
									int i_2184_ = 255;
									int i_2185_ = 0;
									int i_2186_ = is[i_2147_];
									is[i_2147_++] = (((((i_2183_ & 0xff00ff) * i_2184_ + (i_2186_ & 0xff00ff) * i_2185_) & ~0xff00ff) >> 8) + (((((i_2183_ & ~0xff00ff) >>> 8) * i_2184_) + (((i_2186_ & ~0xff00ff) >>> 8) * i_2185_)) & ~0xff00ff));
								} else
									i_2147_++;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 0) {
						if ((i_2144_ & 0xffffff) == 16777215) {
							int i_2187_ = i_2144_ >>> 24;
							int i_2188_ = 256 - i_2187_;
							for (int i_2189_ = -i_2149_; i_2189_ < 0; i_2189_++) {
								for (int i_2190_ = -i_2150_; i_2190_ < 0; i_2190_++) {
									int i_2191_ = aByteArray11345[i_2148_++];
									if (i_2191_ != 0) {
										int i_2192_ = anIntArray11346[i_2191_ & 0xff];
										int i_2193_ = is[i_2147_];
										is[i_2147_++] = ((((i_2192_ & 0xff00ff) * i_2187_ + ((i_2193_ & 0xff00ff) * i_2188_)) & ~0xff00ff) + (((i_2192_ & 0xff00) * i_2187_ + ((i_2193_ & 0xff00) * i_2188_)) & 0xff0000)) >> 8;
									} else
										i_2147_++;
								}
								i_2147_ += i_2151_;
								i_2148_ += i_2152_;
							}
						} else {
							int i_2194_ = (i_2144_ & 0xff0000) >> 16;
							int i_2195_ = (i_2144_ & 0xff00) >> 8;
							int i_2196_ = i_2144_ & 0xff;
							int i_2197_ = i_2144_ >>> 24;
							int i_2198_ = 256 - i_2197_;
							for (int i_2199_ = -i_2149_; i_2199_ < 0; i_2199_++) {
								for (int i_2200_ = -i_2150_; i_2200_ < 0; i_2200_++) {
									int i_2201_ = aByteArray11345[i_2148_++];
									if (i_2201_ != 0) {
										int i_2202_ = anIntArray11346[i_2201_ & 0xff];
										if (i_2197_ != 255) {
											int i_2203_ = (((i_2202_ & 0xff0000) * i_2194_) & ~0xffffff);
											int i_2204_ = ((i_2202_ & 0xff00) * i_2195_ & 0xff0000);
											int i_2205_ = ((i_2202_ & 0xff) * i_2196_ & 0xff00);
											i_2202_ = (i_2203_ | i_2204_ | i_2205_) >>> 8;
											int i_2206_ = is[i_2147_];
											is[i_2147_++] = (((((i_2202_ & 0xff00ff) * i_2197_) + ((i_2206_ & 0xff00ff) * i_2198_)) & ~0xff00ff) + ((((i_2202_ & 0xff00) * i_2197_) + ((i_2206_ & 0xff00) * i_2198_)) & 0xff0000)) >> 8;
										} else {
											int i_2207_ = (((i_2202_ & 0xff0000) * i_2194_) & ~0xffffff);
											int i_2208_ = ((i_2202_ & 0xff00) * i_2195_ & 0xff0000);
											int i_2209_ = ((i_2202_ & 0xff) * i_2196_ & 0xff00);
											is[i_2147_++] = (i_2207_ | i_2208_ | i_2209_) >>> 8;
										}
									} else
										i_2147_++;
								}
								i_2147_ += i_2151_;
								i_2148_ += i_2152_;
							}
						}
					} else if (i_2143_ == 3) {
						int i_2210_ = i_2144_ >>> 24;
						int i_2211_ = 256 - i_2210_;
						for (int i_2212_ = -i_2149_; i_2212_ < 0; i_2212_++) {
							for (int i_2213_ = -i_2150_; i_2213_ < 0; i_2213_++) {
								byte i_2214_ = aByteArray11345[i_2148_++];
								int i_2215_ = (i_2214_ > 0 ? anIntArray11346[i_2214_] : 0);
								int i_2216_ = i_2215_ + i_2144_;
								int i_2217_ = ((i_2215_ & 0xff00ff) + (i_2144_ & 0xff00ff));
								int i_2218_ = ((i_2217_ & 0x1000100) + (i_2216_ - i_2217_ & 0x10000));
								i_2218_ = i_2216_ - i_2218_ | i_2218_ - (i_2218_ >>> 8);
								if (i_2215_ == 0 && i_2210_ != 255) {
									i_2215_ = i_2218_;
									i_2218_ = is[i_2147_];
									i_2218_ = ((((i_2215_ & 0xff00ff) * i_2210_ + (i_2218_ & 0xff00ff) * i_2211_) & ~0xff00ff) + (((i_2215_ & 0xff00) * i_2210_ + (i_2218_ & 0xff00) * i_2211_) & 0xff0000)) >> 8;
								}
								is[i_2147_++] = i_2218_;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 2) {
						int i_2219_ = i_2144_ >>> 24;
						int i_2220_ = 256 - i_2219_;
						int i_2221_ = (i_2144_ & 0xff00ff) * i_2220_ & ~0xff00ff;
						int i_2222_ = (i_2144_ & 0xff00) * i_2220_ & 0xff0000;
						i_2144_ = (i_2221_ | i_2222_) >>> 8;
						for (int i_2223_ = -i_2149_; i_2223_ < 0; i_2223_++) {
							for (int i_2224_ = -i_2150_; i_2224_ < 0; i_2224_++) {
								int i_2225_ = aByteArray11345[i_2148_++];
								if (i_2225_ != 0) {
									int i_2226_ = anIntArray11346[i_2225_ & 0xff];
									i_2221_ = ((i_2226_ & 0xff00ff) * i_2219_ & ~0xff00ff);
									i_2222_ = ((i_2226_ & 0xff00) * i_2219_ & 0xff0000);
									is[i_2147_++] = ((i_2221_ | i_2222_) >>> 8) + i_2144_;
								} else
									i_2147_++;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2145_ == 2) {
					if (i_2143_ == 1) {
						for (int i_2227_ = -i_2149_; i_2227_ < 0; i_2227_++) {
							for (int i_2228_ = -i_2150_; i_2228_ < 0; i_2228_++) {
								int i_2229_ = aByteArray11345[i_2148_++];
								if (i_2229_ != 0) {
									int i_2230_ = anIntArray11346[i_2229_ & 0xff];
									int i_2231_ = is[i_2147_];
									int i_2232_ = i_2230_ + i_2231_;
									int i_2233_ = ((i_2230_ & 0xff00ff) + (i_2231_ & 0xff00ff));
									i_2231_ = ((i_2233_ & 0x1000100) + (i_2232_ - i_2233_ & 0x10000));
									is[i_2147_++] = (i_2232_ - i_2231_ | i_2231_ - (i_2231_ >>> 8));
								} else
									i_2147_++;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 0) {
						int i_2234_ = (i_2144_ & 0xff0000) >> 16;
						int i_2235_ = (i_2144_ & 0xff00) >> 8;
						int i_2236_ = i_2144_ & 0xff;
						for (int i_2237_ = -i_2149_; i_2237_ < 0; i_2237_++) {
							for (int i_2238_ = -i_2150_; i_2238_ < 0; i_2238_++) {
								int i_2239_ = aByteArray11345[i_2148_++];
								if (i_2239_ != 0) {
									int i_2240_ = anIntArray11346[i_2239_ & 0xff];
									int i_2241_ = ((i_2240_ & 0xff0000) * i_2234_ & ~0xffffff);
									int i_2242_ = ((i_2240_ & 0xff00) * i_2235_ & 0xff0000);
									int i_2243_ = (i_2240_ & 0xff) * i_2236_ & 0xff00;
									i_2240_ = (i_2241_ | i_2242_ | i_2243_) >>> 8;
									int i_2244_ = is[i_2147_];
									int i_2245_ = i_2240_ + i_2244_;
									int i_2246_ = ((i_2240_ & 0xff00ff) + (i_2244_ & 0xff00ff));
									i_2244_ = ((i_2246_ & 0x1000100) + (i_2245_ - i_2246_ & 0x10000));
									is[i_2147_++] = (i_2245_ - i_2244_ | i_2244_ - (i_2244_ >>> 8));
								} else
									i_2147_++;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 3) {
						for (int i_2247_ = -i_2149_; i_2247_ < 0; i_2247_++) {
							for (int i_2248_ = -i_2150_; i_2248_ < 0; i_2248_++) {
								byte i_2249_ = aByteArray11345[i_2148_++];
								int i_2250_ = (i_2249_ > 0 ? anIntArray11346[i_2249_] : 0);
								int i_2251_ = i_2250_ + i_2144_;
								int i_2252_ = ((i_2250_ & 0xff00ff) + (i_2144_ & 0xff00ff));
								int i_2253_ = ((i_2252_ & 0x1000100) + (i_2251_ - i_2252_ & 0x10000));
								i_2250_ = i_2251_ - i_2253_ | i_2253_ - (i_2253_ >>> 8);
								i_2253_ = is[i_2147_];
								i_2251_ = i_2250_ + i_2253_;
								i_2252_ = (i_2250_ & 0xff00ff) + (i_2253_ & 0xff00ff);
								i_2253_ = ((i_2252_ & 0x1000100) + (i_2251_ - i_2252_ & 0x10000));
								is[i_2147_++] = i_2251_ - i_2253_ | i_2253_ - (i_2253_ >>> 8);
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else if (i_2143_ == 2) {
						int i_2254_ = i_2144_ >>> 24;
						int i_2255_ = 256 - i_2254_;
						int i_2256_ = (i_2144_ & 0xff00ff) * i_2255_ & ~0xff00ff;
						int i_2257_ = (i_2144_ & 0xff00) * i_2255_ & 0xff0000;
						i_2144_ = (i_2256_ | i_2257_) >>> 8;
						for (int i_2258_ = -i_2149_; i_2258_ < 0; i_2258_++) {
							for (int i_2259_ = -i_2150_; i_2259_ < 0; i_2259_++) {
								int i_2260_ = aByteArray11345[i_2148_++];
								if (i_2260_ != 0) {
									int i_2261_ = anIntArray11346[i_2260_ & 0xff];
									i_2256_ = ((i_2261_ & 0xff00ff) * i_2254_ & ~0xff00ff);
									i_2257_ = ((i_2261_ & 0xff00) * i_2254_ & 0xff0000);
									i_2261_ = (((i_2256_ | i_2257_) >>> 8) + i_2144_);
									int i_2262_ = is[i_2147_];
									int i_2263_ = i_2261_ + i_2262_;
									int i_2264_ = ((i_2261_ & 0xff00ff) + (i_2262_ & 0xff00ff));
									i_2262_ = ((i_2264_ & 0x1000100) + (i_2263_ - i_2264_ & 0x10000));
									is[i_2147_++] = (i_2263_ - i_2262_ | i_2262_ - (i_2262_ >>> 8));
								} else
									i_2147_++;
							}
							i_2147_ += i_2151_;
							i_2148_ += i_2152_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class148_Sub1_Sub2(Class178_Sub3 class178_sub3, byte[] is, int[] is_2265_, int i, int i_2266_) {
		super(class178_sub3, i, i_2266_);
		aByteArray11345 = is;
		anIntArray11346 = is_2265_;
	}

	public void method2437(int i, int i_2267_, int i_2268_, int i_2269_, int[] is, int i_2270_, int i_2271_) {
		throw new IllegalStateException();
	}

	public void method2467(int i, int i_2272_, Class145 class145, int i_2273_, int i_2274_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_2272_ += anInt8918;
			int i_2275_ = 0;
			int i_2276_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_2277_ = anInt8914;
			int i_2278_ = anInt8916;
			int i_2279_ = i_2276_ - i_2277_;
			int i_2280_ = 0;
			int i_2281_ = i + i_2272_ * i_2276_;
			if (i_2272_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_2282_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_2272_;
				i_2278_ -= i_2282_;
				i_2272_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_2275_ += i_2282_ * i_2277_;
				i_2281_ += i_2282_ * i_2276_;
			}
			if (i_2272_ + i_2278_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_2278_ -= (i_2272_ + i_2278_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_2283_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_2277_ -= i_2283_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_2275_ += i_2283_;
				i_2281_ += i_2283_;
				i_2280_ += i_2283_;
				i_2279_ += i_2283_;
			}
			if (i + i_2277_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_2284_ = i + i_2277_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_2277_ -= i_2284_;
				i_2280_ += i_2284_;
				i_2279_ += i_2284_;
			}
			if (i_2277_ > 0 && i_2278_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_2285_ = class145_sub1.anIntArray9521;
				int[] is_2286_ = class145_sub1.anIntArray9520;
				int i_2287_ = i_2272_;
				if (i_2274_ > i_2287_) {
					i_2287_ = i_2274_;
					i_2281_ += (i_2274_ - i_2272_) * i_2276_;
					i_2275_ += (i_2274_ - i_2272_) * anInt8914;
				}
				int i_2288_ = (i_2274_ + is_2285_.length < i_2272_ + i_2278_ ? i_2274_ + is_2285_.length : i_2272_ + i_2278_);
				for (int i_2289_ = i_2287_; i_2289_ < i_2288_; i_2289_++) {
					int i_2290_ = is_2285_[i_2289_ - i_2274_] + i_2273_;
					int i_2291_ = is_2286_[i_2289_ - i_2274_];
					int i_2292_ = i_2277_;
					if (i > i_2290_) {
						int i_2293_ = i - i_2290_;
						if (i_2293_ >= i_2291_) {
							i_2275_ += i_2277_ + i_2280_;
							i_2281_ += i_2277_ + i_2279_;
							continue;
						}
						i_2291_ -= i_2293_;
					} else {
						int i_2294_ = i_2290_ - i;
						if (i_2294_ >= i_2277_) {
							i_2275_ += i_2277_ + i_2280_;
							i_2281_ += i_2277_ + i_2279_;
							continue;
						}
						i_2275_ += i_2294_;
						i_2292_ -= i_2294_;
						i_2281_ += i_2294_;
					}
					int i_2295_ = 0;
					if (i_2292_ < i_2291_)
						i_2291_ = i_2292_;
					else
						i_2295_ = i_2292_ - i_2291_;
					for (int i_2296_ = -i_2291_; i_2296_ < 0; i_2296_++) {
						int i_2297_ = aByteArray11345[i_2275_++];
						if (i_2297_ != 0)
							is[i_2281_++] = anIntArray11346[i_2297_ & 0xff];
						else
							i_2281_++;
					}
					i_2275_ += i_2295_ + i_2280_;
					i_2281_ += i_2295_ + i_2279_;
				}
			}
		}
	}

	public void method2488(int i, int i_2298_, Class145 class145, int i_2299_, int i_2300_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_2298_ += anInt8918;
			int i_2301_ = 0;
			int i_2302_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_2303_ = anInt8914;
			int i_2304_ = anInt8916;
			int i_2305_ = i_2302_ - i_2303_;
			int i_2306_ = 0;
			int i_2307_ = i + i_2298_ * i_2302_;
			if (i_2298_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_2308_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_2298_;
				i_2304_ -= i_2308_;
				i_2298_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_2301_ += i_2308_ * i_2303_;
				i_2307_ += i_2308_ * i_2302_;
			}
			if (i_2298_ + i_2304_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_2304_ -= (i_2298_ + i_2304_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_2309_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_2303_ -= i_2309_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_2301_ += i_2309_;
				i_2307_ += i_2309_;
				i_2306_ += i_2309_;
				i_2305_ += i_2309_;
			}
			if (i + i_2303_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_2310_ = i + i_2303_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_2303_ -= i_2310_;
				i_2306_ += i_2310_;
				i_2305_ += i_2310_;
			}
			if (i_2303_ > 0 && i_2304_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_2311_ = class145_sub1.anIntArray9521;
				int[] is_2312_ = class145_sub1.anIntArray9520;
				int i_2313_ = i_2298_;
				if (i_2300_ > i_2313_) {
					i_2313_ = i_2300_;
					i_2307_ += (i_2300_ - i_2298_) * i_2302_;
					i_2301_ += (i_2300_ - i_2298_) * anInt8914;
				}
				int i_2314_ = (i_2300_ + is_2311_.length < i_2298_ + i_2304_ ? i_2300_ + is_2311_.length : i_2298_ + i_2304_);
				for (int i_2315_ = i_2313_; i_2315_ < i_2314_; i_2315_++) {
					int i_2316_ = is_2311_[i_2315_ - i_2300_] + i_2299_;
					int i_2317_ = is_2312_[i_2315_ - i_2300_];
					int i_2318_ = i_2303_;
					if (i > i_2316_) {
						int i_2319_ = i - i_2316_;
						if (i_2319_ >= i_2317_) {
							i_2301_ += i_2303_ + i_2306_;
							i_2307_ += i_2303_ + i_2305_;
							continue;
						}
						i_2317_ -= i_2319_;
					} else {
						int i_2320_ = i_2316_ - i;
						if (i_2320_ >= i_2303_) {
							i_2301_ += i_2303_ + i_2306_;
							i_2307_ += i_2303_ + i_2305_;
							continue;
						}
						i_2301_ += i_2320_;
						i_2318_ -= i_2320_;
						i_2307_ += i_2320_;
					}
					int i_2321_ = 0;
					if (i_2318_ < i_2317_)
						i_2317_ = i_2318_;
					else
						i_2321_ = i_2318_ - i_2317_;
					for (int i_2322_ = -i_2317_; i_2322_ < 0; i_2322_++) {
						int i_2323_ = aByteArray11345[i_2301_++];
						if (i_2323_ != 0)
							is[i_2307_++] = anIntArray11346[i_2323_ & 0xff];
						else
							i_2307_++;
					}
					i_2301_ += i_2321_ + i_2306_;
					i_2307_ += i_2321_ + i_2305_;
				}
			}
		}
	}

	public Interface22 method2470() {
		throw new IllegalStateException();
	}

	void method14408(boolean bool, boolean bool_2324_, boolean bool_2325_, int i, int i_2326_, float f, int i_2327_, int i_2328_, int i_2329_, int i_2330_, int i_2331_, int i_2332_, boolean bool_2333_) {
		if (i_2327_ > 0 && i_2328_ > 0 && (bool || bool_2324_)) {
			int i_2334_ = 0;
			int i_2335_ = 0;
			int i_2336_ = anInt8921 + anInt8914 + anInt8919;
			int i_2337_ = anInt8918 + anInt8916 + anInt8920;
			int i_2338_ = (i_2336_ << 16) / i_2327_;
			int i_2339_ = (i_2337_ << 16) / i_2328_;
			if (anInt8921 > 0) {
				int i_2340_ = ((anInt8921 << 16) + i_2338_ - 1) / i_2338_;
				i += i_2340_;
				i_2334_ += i_2340_ * i_2338_ - (anInt8921 << 16);
			}
			if (anInt8918 > 0) {
				int i_2341_ = ((anInt8918 << 16) + i_2339_ - 1) / i_2339_;
				i_2326_ += i_2341_;
				i_2335_ += i_2341_ * i_2339_ - (anInt8918 << 16);
			}
			if (anInt8914 < i_2336_)
				i_2327_ = ((anInt8914 << 16) - i_2334_ + i_2338_ - 1) / i_2338_;
			if (anInt8916 < i_2337_)
				i_2328_ = ((anInt8916 << 16) - i_2335_ + i_2339_ - 1) / i_2339_;
			int i_2342_ = i + i_2326_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
			int i_2343_ = aClass178_Sub3_8923.anInt9825 * 1013077751 - i_2327_;
			if (i_2326_ + i_2328_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_2328_ -= (i_2326_ + i_2328_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i_2326_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_2344_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_2326_;
				i_2328_ -= i_2344_;
				i_2342_ += i_2344_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
				i_2335_ += i_2339_ * i_2344_;
			}
			if (i + i_2327_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_2345_ = i + i_2327_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_2327_ -= i_2345_;
				i_2343_ += i_2345_;
			}
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_2346_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_2327_ -= i_2346_;
				i_2342_ += i_2346_;
				i_2334_ += i_2338_ * i_2346_;
				i_2343_ += i_2346_;
			}
			float[] fs = aClass178_Sub3_8923.aFloatArray9807;
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (i_2331_ == 0) {
				if (i_2329_ == 1) {
					int i_2347_ = i_2334_;
					for (int i_2348_ = -i_2328_; i_2348_ < 0; i_2348_++) {
						int i_2349_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2350_ = -i_2327_; i_2350_ < 0; i_2350_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								if (bool)
									is[i_2342_] = (anIntArray11346[((aByteArray11345[(i_2334_ >> 16) + i_2349_]) & 0xff)]);
								if (bool_2324_ && bool_2333_)
									fs[i_2342_] = f;
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2347_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 0) {
					int i_2351_ = (i_2330_ & 0xff0000) >> 16;
					int i_2352_ = (i_2330_ & 0xff00) >> 8;
					int i_2353_ = i_2330_ & 0xff;
					int i_2354_ = i_2334_;
					for (int i_2355_ = -i_2328_; i_2355_ < 0; i_2355_++) {
						int i_2356_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2357_ = -i_2327_; i_2357_ < 0; i_2357_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								if (bool) {
									int i_2358_ = (anIntArray11346[((aByteArray11345[(i_2334_ >> 16) + i_2356_]) & 0xff)]);
									int i_2359_ = ((i_2358_ & 0xff0000) * i_2351_ & ~0xffffff);
									int i_2360_ = ((i_2358_ & 0xff00) * i_2352_ & 0xff0000);
									int i_2361_ = (i_2358_ & 0xff) * i_2353_ & 0xff00;
									is[i_2342_] = (i_2359_ | i_2360_ | i_2361_) >>> 8;
								}
								if (bool_2324_ && bool_2333_)
									fs[i_2342_] = f;
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2354_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 3) {
					int i_2362_ = i_2334_;
					for (int i_2363_ = -i_2328_; i_2363_ < 0; i_2363_++) {
						int i_2364_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2365_ = -i_2327_; i_2365_ < 0; i_2365_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								if (bool) {
									byte i_2366_ = (aByteArray11345[(i_2334_ >> 16) + i_2364_]);
									int i_2367_ = (i_2366_ > 0 ? anIntArray11346[i_2366_] : 0);
									int i_2368_ = i_2367_ + i_2330_;
									int i_2369_ = ((i_2367_ & 0xff00ff) + (i_2330_ & 0xff00ff));
									int i_2370_ = ((i_2369_ & 0x1000100) + (i_2368_ - i_2369_ & 0x10000));
									is[i_2342_] = (i_2368_ - i_2370_ | i_2370_ - (i_2370_ >>> 8));
								}
								if (bool_2324_ && bool_2333_)
									fs[i_2342_] = f;
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2362_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 2) {
					int i_2371_ = i_2330_ >>> 24;
					int i_2372_ = 256 - i_2371_;
					int i_2373_ = (i_2330_ & 0xff00ff) * i_2372_ & ~0xff00ff;
					int i_2374_ = (i_2330_ & 0xff00) * i_2372_ & 0xff0000;
					i_2330_ = (i_2373_ | i_2374_) >>> 8;
					int i_2375_ = i_2334_;
					for (int i_2376_ = -i_2328_; i_2376_ < 0; i_2376_++) {
						int i_2377_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2378_ = -i_2327_; i_2378_ < 0; i_2378_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								if (bool) {
									int i_2379_ = (anIntArray11346[((aByteArray11345[(i_2334_ >> 16) + i_2377_]) & 0xff)]);
									i_2373_ = ((i_2379_ & 0xff00ff) * i_2371_ & ~0xff00ff);
									i_2374_ = ((i_2379_ & 0xff00) * i_2371_ & 0xff0000);
									is[i_2342_] = (((i_2373_ | i_2374_) >>> 8) + i_2330_);
								}
								if (bool_2324_ && bool_2333_)
									fs[i_2342_] = f;
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2375_;
						i_2342_ += i_2343_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2331_ == 1) {
				if (i_2329_ == 1) {
					int i_2380_ = i_2334_;
					for (int i_2381_ = -i_2328_; i_2381_ < 0; i_2381_++) {
						int i_2382_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2383_ = -i_2327_; i_2383_ < 0; i_2383_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								int i_2384_ = (aByteArray11345[(i_2334_ >> 16) + i_2382_]);
								if (i_2384_ != 0) {
									if (bool)
										is[i_2342_] = anIntArray11346[i_2384_ & 0xff];
									if (bool_2324_ && bool_2333_)
										fs[i_2342_] = f;
								}
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2380_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 0) {
					int i_2385_ = i_2334_;
					if ((i_2330_ & 0xffffff) == 16777215) {
						int i_2386_ = i_2330_ >>> 24;
						int i_2387_ = 256 - i_2386_;
						for (int i_2388_ = -i_2328_; i_2388_ < 0; i_2388_++) {
							int i_2389_ = (i_2335_ >> 16) * anInt8914;
							for (int i_2390_ = -i_2327_; i_2390_ < 0; i_2390_++) {
								if (!bool_2324_ || f < fs[i_2342_]) {
									int i_2391_ = (aByteArray11345[(i_2334_ >> 16) + i_2389_]);
									if (i_2391_ != 0) {
										if (bool) {
											int i_2392_ = (anIntArray11346[i_2391_ & 0xff]);
											int i_2393_ = is[i_2342_];
											is[i_2342_] = (((((i_2392_ & 0xff00ff) * i_2386_) + ((i_2393_ & 0xff00ff) * i_2387_)) & ~0xff00ff) + ((((i_2392_ & 0xff00) * i_2386_) + ((i_2393_ & 0xff00) * i_2387_)) & 0xff0000)) >> 8;
										}
										if (bool_2324_ && bool_2333_)
											fs[i_2342_] = f;
									}
								}
								i_2334_ += i_2338_;
								i_2342_++;
							}
							i_2335_ += i_2339_;
							i_2334_ = i_2385_;
							i_2342_ += i_2343_;
						}
					} else {
						int i_2394_ = (i_2330_ & 0xff0000) >> 16;
						int i_2395_ = (i_2330_ & 0xff00) >> 8;
						int i_2396_ = i_2330_ & 0xff;
						int i_2397_ = i_2330_ >>> 24;
						int i_2398_ = 256 - i_2397_;
						for (int i_2399_ = -i_2328_; i_2399_ < 0; i_2399_++) {
							int i_2400_ = (i_2335_ >> 16) * anInt8914;
							for (int i_2401_ = -i_2327_; i_2401_ < 0; i_2401_++) {
								if (!bool_2324_ || f < fs[i_2342_]) {
									int i_2402_ = (aByteArray11345[(i_2334_ >> 16) + i_2400_]);
									if (i_2402_ != 0) {
										int i_2403_ = anIntArray11346[i_2402_ & 0xff];
										if (i_2397_ != 255) {
											if (bool) {
												int i_2404_ = (((i_2403_ & 0xff0000) * i_2394_) & ~0xffffff);
												int i_2405_ = (((i_2403_ & 0xff00) * i_2395_) & 0xff0000);
												int i_2406_ = (((i_2403_ & 0xff) * i_2396_) & 0xff00);
												i_2403_ = (i_2404_ | i_2405_ | i_2406_) >>> 8;
												int i_2407_ = is[i_2342_];
												is[i_2342_] = (((((i_2403_ & 0xff00ff) * i_2397_) + ((i_2407_ & 0xff00ff) * i_2398_)) & ~0xff00ff) + ((((i_2403_ & 0xff00) * i_2397_) + ((i_2407_ & 0xff00) * i_2398_)) & 0xff0000)) >> 8;
											}
											if (bool_2324_ && bool_2333_)
												fs[i_2342_] = f;
										} else {
											if (bool) {
												int i_2408_ = (((i_2403_ & 0xff0000) * i_2394_) & ~0xffffff);
												int i_2409_ = (((i_2403_ & 0xff00) * i_2395_) & 0xff0000);
												int i_2410_ = (((i_2403_ & 0xff) * i_2396_) & 0xff00);
												is[i_2342_] = (i_2408_ | i_2409_ | i_2410_) >>> 8;
											}
											if (bool_2324_ && bool_2333_)
												fs[i_2342_] = f;
										}
									}
								}
								i_2334_ += i_2338_;
								i_2342_++;
							}
							i_2335_ += i_2339_;
							i_2334_ = i_2385_;
							i_2342_ += i_2343_;
						}
					}
				} else if (i_2329_ == 3) {
					int i_2411_ = i_2334_;
					int i_2412_ = i_2330_ >>> 24;
					int i_2413_ = 256 - i_2412_;
					for (int i_2414_ = -i_2328_; i_2414_ < 0; i_2414_++) {
						int i_2415_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2416_ = -i_2327_; i_2416_ < 0; i_2416_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								if (bool) {
									byte i_2417_ = (aByteArray11345[(i_2334_ >> 16) + i_2415_]);
									int i_2418_ = (i_2417_ > 0 ? anIntArray11346[i_2417_] : 0);
									int i_2419_ = i_2418_ + i_2330_;
									int i_2420_ = ((i_2418_ & 0xff00ff) + (i_2330_ & 0xff00ff));
									int i_2421_ = ((i_2420_ & 0x1000100) + (i_2419_ - i_2420_ & 0x10000));
									i_2421_ = (i_2419_ - i_2421_ | i_2421_ - (i_2421_ >>> 8));
									if (i_2418_ == 0 && i_2412_ != 255) {
										i_2418_ = i_2421_;
										i_2421_ = is[i_2342_];
										i_2421_ = ((((i_2418_ & 0xff00ff) * i_2412_ + ((i_2421_ & 0xff00ff) * i_2413_)) & ~0xff00ff) + (((i_2418_ & 0xff00) * i_2412_ + ((i_2421_ & 0xff00) * i_2413_)) & 0xff0000)) >> 8;
									}
									is[i_2342_] = i_2421_;
								}
								if (bool_2324_ && bool_2333_)
									fs[i_2342_] = f;
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2411_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 2) {
					int i_2422_ = i_2330_ >>> 24;
					int i_2423_ = 256 - i_2422_;
					int i_2424_ = (i_2330_ & 0xff00ff) * i_2423_ & ~0xff00ff;
					int i_2425_ = (i_2330_ & 0xff00) * i_2423_ & 0xff0000;
					i_2330_ = (i_2424_ | i_2425_) >>> 8;
					int i_2426_ = i_2334_;
					for (int i_2427_ = -i_2328_; i_2427_ < 0; i_2427_++) {
						int i_2428_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2429_ = -i_2327_; i_2429_ < 0; i_2429_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								int i_2430_ = (aByteArray11345[(i_2334_ >> 16) + i_2428_]);
								if (i_2430_ != 0) {
									if (bool) {
										int i_2431_ = anIntArray11346[i_2430_ & 0xff];
										i_2424_ = ((i_2431_ & 0xff00ff) * i_2422_ & ~0xff00ff);
										i_2425_ = ((i_2431_ & 0xff00) * i_2422_ & 0xff0000);
										is[i_2342_] = ((i_2424_ | i_2425_) >>> 8) + i_2330_;
									}
									if (bool_2324_ && bool_2333_)
										fs[i_2342_] = f;
								}
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2426_;
						i_2342_ += i_2343_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2331_ == 2) {
				if (i_2329_ == 1) {
					int i_2432_ = i_2334_;
					for (int i_2433_ = -i_2328_; i_2433_ < 0; i_2433_++) {
						int i_2434_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2435_ = -i_2327_; i_2435_ < 0; i_2435_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								int i_2436_ = (aByteArray11345[(i_2334_ >> 16) + i_2434_]);
								if (i_2436_ != 0) {
									if (bool) {
										int i_2437_ = anIntArray11346[i_2436_ & 0xff];
										int i_2438_ = is[i_2342_];
										int i_2439_ = i_2437_ + i_2438_;
										int i_2440_ = ((i_2437_ & 0xff00ff) + (i_2438_ & 0xff00ff));
										i_2438_ = ((i_2440_ & 0x1000100) + (i_2439_ - i_2440_ & 0x10000));
										is[i_2342_] = (i_2439_ - i_2438_ | i_2438_ - (i_2438_ >>> 8));
									}
									if (bool_2324_ && bool_2333_)
										fs[i_2342_] = f;
								}
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2432_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 0) {
					int i_2441_ = i_2334_;
					int i_2442_ = (i_2330_ & 0xff0000) >> 16;
					int i_2443_ = (i_2330_ & 0xff00) >> 8;
					int i_2444_ = i_2330_ & 0xff;
					for (int i_2445_ = -i_2328_; i_2445_ < 0; i_2445_++) {
						int i_2446_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2447_ = -i_2327_; i_2447_ < 0; i_2447_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								int i_2448_ = (aByteArray11345[(i_2334_ >> 16) + i_2446_]);
								if (i_2448_ != 0) {
									if (bool) {
										int i_2449_ = anIntArray11346[i_2448_ & 0xff];
										int i_2450_ = ((i_2449_ & 0xff0000) * i_2442_ & ~0xffffff);
										int i_2451_ = ((i_2449_ & 0xff00) * i_2443_ & 0xff0000);
										int i_2452_ = ((i_2449_ & 0xff) * i_2444_ & 0xff00);
										i_2449_ = (i_2450_ | i_2451_ | i_2452_) >>> 8;
										int i_2453_ = is[i_2342_];
										int i_2454_ = i_2449_ + i_2453_;
										int i_2455_ = ((i_2449_ & 0xff00ff) + (i_2453_ & 0xff00ff));
										i_2453_ = ((i_2455_ & 0x1000100) + (i_2454_ - i_2455_ & 0x10000));
										is[i_2342_] = (i_2454_ - i_2453_ | i_2453_ - (i_2453_ >>> 8));
									}
									if (bool_2324_ && bool_2333_)
										fs[i_2342_] = f;
								}
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2441_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 3) {
					int i_2456_ = i_2334_;
					for (int i_2457_ = -i_2328_; i_2457_ < 0; i_2457_++) {
						int i_2458_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2459_ = -i_2327_; i_2459_ < 0; i_2459_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								if (bool) {
									byte i_2460_ = (aByteArray11345[(i_2334_ >> 16) + i_2458_]);
									int i_2461_ = (i_2460_ > 0 ? anIntArray11346[i_2460_] : 0);
									int i_2462_ = i_2461_ + i_2330_;
									int i_2463_ = ((i_2461_ & 0xff00ff) + (i_2330_ & 0xff00ff));
									int i_2464_ = ((i_2463_ & 0x1000100) + (i_2462_ - i_2463_ & 0x10000));
									i_2461_ = (i_2462_ - i_2464_ | i_2464_ - (i_2464_ >>> 8));
									i_2464_ = is[i_2342_];
									i_2462_ = i_2461_ + i_2464_;
									i_2463_ = (i_2461_ & 0xff00ff) + (i_2464_ & 0xff00ff);
									i_2464_ = ((i_2463_ & 0x1000100) + (i_2462_ - i_2463_ & 0x10000));
									is[i_2342_] = (i_2462_ - i_2464_ | i_2464_ - (i_2464_ >>> 8));
								}
								if (bool_2324_ && bool_2333_)
									fs[i_2342_] = f;
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2456_;
						i_2342_ += i_2343_;
					}
				} else if (i_2329_ == 2) {
					int i_2465_ = i_2330_ >>> 24;
					int i_2466_ = 256 - i_2465_;
					int i_2467_ = (i_2330_ & 0xff00ff) * i_2466_ & ~0xff00ff;
					int i_2468_ = (i_2330_ & 0xff00) * i_2466_ & 0xff0000;
					i_2330_ = (i_2467_ | i_2468_) >>> 8;
					int i_2469_ = i_2334_;
					for (int i_2470_ = -i_2328_; i_2470_ < 0; i_2470_++) {
						int i_2471_ = (i_2335_ >> 16) * anInt8914;
						for (int i_2472_ = -i_2327_; i_2472_ < 0; i_2472_++) {
							if (!bool_2324_ || f < fs[i_2342_]) {
								int i_2473_ = (aByteArray11345[(i_2334_ >> 16) + i_2471_]);
								if (i_2473_ != 0) {
									if (bool) {
										int i_2474_ = anIntArray11346[i_2473_ & 0xff];
										i_2467_ = ((i_2474_ & 0xff00ff) * i_2465_ & ~0xff00ff);
										i_2468_ = ((i_2474_ & 0xff00) * i_2465_ & 0xff0000);
										i_2474_ = (((i_2467_ | i_2468_) >>> 8) + i_2330_);
										int i_2475_ = is[i_2342_];
										int i_2476_ = i_2474_ + i_2475_;
										int i_2477_ = ((i_2474_ & 0xff00ff) + (i_2475_ & 0xff00ff));
										i_2475_ = ((i_2477_ & 0x1000100) + (i_2476_ - i_2477_ & 0x10000));
										is[i_2342_] = (i_2476_ - i_2475_ | i_2475_ - (i_2475_ >>> 8));
									}
									if (bool_2324_ && bool_2333_)
										fs[i_2342_] = f;
								}
							}
							i_2334_ += i_2338_;
							i_2342_++;
						}
						i_2335_ += i_2339_;
						i_2334_ = i_2469_;
						i_2342_ += i_2343_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14410(boolean bool, boolean bool_2478_, boolean bool_2479_, int i, int i_2480_, float f, int i_2481_, int i_2482_, int i_2483_, int i_2484_, int i_2485_, int i_2486_, boolean bool_2487_) {
		if (i_2481_ > 0 && i_2482_ > 0 && (bool || bool_2478_)) {
			int i_2488_ = 0;
			int i_2489_ = 0;
			int i_2490_ = anInt8921 + anInt8914 + anInt8919;
			int i_2491_ = anInt8918 + anInt8916 + anInt8920;
			int i_2492_ = (i_2490_ << 16) / i_2481_;
			int i_2493_ = (i_2491_ << 16) / i_2482_;
			if (anInt8921 > 0) {
				int i_2494_ = ((anInt8921 << 16) + i_2492_ - 1) / i_2492_;
				i += i_2494_;
				i_2488_ += i_2494_ * i_2492_ - (anInt8921 << 16);
			}
			if (anInt8918 > 0) {
				int i_2495_ = ((anInt8918 << 16) + i_2493_ - 1) / i_2493_;
				i_2480_ += i_2495_;
				i_2489_ += i_2495_ * i_2493_ - (anInt8918 << 16);
			}
			if (anInt8914 < i_2490_)
				i_2481_ = ((anInt8914 << 16) - i_2488_ + i_2492_ - 1) / i_2492_;
			if (anInt8916 < i_2491_)
				i_2482_ = ((anInt8916 << 16) - i_2489_ + i_2493_ - 1) / i_2493_;
			int i_2496_ = i + i_2480_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
			int i_2497_ = aClass178_Sub3_8923.anInt9825 * 1013077751 - i_2481_;
			if (i_2480_ + i_2482_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_2482_ -= (i_2480_ + i_2482_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i_2480_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_2498_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_2480_;
				i_2482_ -= i_2498_;
				i_2496_ += i_2498_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
				i_2489_ += i_2493_ * i_2498_;
			}
			if (i + i_2481_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_2499_ = i + i_2481_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_2481_ -= i_2499_;
				i_2497_ += i_2499_;
			}
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_2500_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_2481_ -= i_2500_;
				i_2496_ += i_2500_;
				i_2488_ += i_2492_ * i_2500_;
				i_2497_ += i_2500_;
			}
			float[] fs = aClass178_Sub3_8923.aFloatArray9807;
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (i_2485_ == 0) {
				if (i_2483_ == 1) {
					int i_2501_ = i_2488_;
					for (int i_2502_ = -i_2482_; i_2502_ < 0; i_2502_++) {
						int i_2503_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2504_ = -i_2481_; i_2504_ < 0; i_2504_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								if (bool)
									is[i_2496_] = (anIntArray11346[((aByteArray11345[(i_2488_ >> 16) + i_2503_]) & 0xff)]);
								if (bool_2478_ && bool_2487_)
									fs[i_2496_] = f;
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2501_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 0) {
					int i_2505_ = (i_2484_ & 0xff0000) >> 16;
					int i_2506_ = (i_2484_ & 0xff00) >> 8;
					int i_2507_ = i_2484_ & 0xff;
					int i_2508_ = i_2488_;
					for (int i_2509_ = -i_2482_; i_2509_ < 0; i_2509_++) {
						int i_2510_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2511_ = -i_2481_; i_2511_ < 0; i_2511_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								if (bool) {
									int i_2512_ = (anIntArray11346[((aByteArray11345[(i_2488_ >> 16) + i_2510_]) & 0xff)]);
									int i_2513_ = ((i_2512_ & 0xff0000) * i_2505_ & ~0xffffff);
									int i_2514_ = ((i_2512_ & 0xff00) * i_2506_ & 0xff0000);
									int i_2515_ = (i_2512_ & 0xff) * i_2507_ & 0xff00;
									is[i_2496_] = (i_2513_ | i_2514_ | i_2515_) >>> 8;
								}
								if (bool_2478_ && bool_2487_)
									fs[i_2496_] = f;
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2508_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 3) {
					int i_2516_ = i_2488_;
					for (int i_2517_ = -i_2482_; i_2517_ < 0; i_2517_++) {
						int i_2518_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2519_ = -i_2481_; i_2519_ < 0; i_2519_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								if (bool) {
									byte i_2520_ = (aByteArray11345[(i_2488_ >> 16) + i_2518_]);
									int i_2521_ = (i_2520_ > 0 ? anIntArray11346[i_2520_] : 0);
									int i_2522_ = i_2521_ + i_2484_;
									int i_2523_ = ((i_2521_ & 0xff00ff) + (i_2484_ & 0xff00ff));
									int i_2524_ = ((i_2523_ & 0x1000100) + (i_2522_ - i_2523_ & 0x10000));
									is[i_2496_] = (i_2522_ - i_2524_ | i_2524_ - (i_2524_ >>> 8));
								}
								if (bool_2478_ && bool_2487_)
									fs[i_2496_] = f;
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2516_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 2) {
					int i_2525_ = i_2484_ >>> 24;
					int i_2526_ = 256 - i_2525_;
					int i_2527_ = (i_2484_ & 0xff00ff) * i_2526_ & ~0xff00ff;
					int i_2528_ = (i_2484_ & 0xff00) * i_2526_ & 0xff0000;
					i_2484_ = (i_2527_ | i_2528_) >>> 8;
					int i_2529_ = i_2488_;
					for (int i_2530_ = -i_2482_; i_2530_ < 0; i_2530_++) {
						int i_2531_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2532_ = -i_2481_; i_2532_ < 0; i_2532_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								if (bool) {
									int i_2533_ = (anIntArray11346[((aByteArray11345[(i_2488_ >> 16) + i_2531_]) & 0xff)]);
									i_2527_ = ((i_2533_ & 0xff00ff) * i_2525_ & ~0xff00ff);
									i_2528_ = ((i_2533_ & 0xff00) * i_2525_ & 0xff0000);
									is[i_2496_] = (((i_2527_ | i_2528_) >>> 8) + i_2484_);
								}
								if (bool_2478_ && bool_2487_)
									fs[i_2496_] = f;
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2529_;
						i_2496_ += i_2497_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2485_ == 1) {
				if (i_2483_ == 1) {
					int i_2534_ = i_2488_;
					for (int i_2535_ = -i_2482_; i_2535_ < 0; i_2535_++) {
						int i_2536_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2537_ = -i_2481_; i_2537_ < 0; i_2537_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								int i_2538_ = (aByteArray11345[(i_2488_ >> 16) + i_2536_]);
								if (i_2538_ != 0) {
									if (bool)
										is[i_2496_] = anIntArray11346[i_2538_ & 0xff];
									if (bool_2478_ && bool_2487_)
										fs[i_2496_] = f;
								}
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2534_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 0) {
					int i_2539_ = i_2488_;
					if ((i_2484_ & 0xffffff) == 16777215) {
						int i_2540_ = i_2484_ >>> 24;
						int i_2541_ = 256 - i_2540_;
						for (int i_2542_ = -i_2482_; i_2542_ < 0; i_2542_++) {
							int i_2543_ = (i_2489_ >> 16) * anInt8914;
							for (int i_2544_ = -i_2481_; i_2544_ < 0; i_2544_++) {
								if (!bool_2478_ || f < fs[i_2496_]) {
									int i_2545_ = (aByteArray11345[(i_2488_ >> 16) + i_2543_]);
									if (i_2545_ != 0) {
										if (bool) {
											int i_2546_ = (anIntArray11346[i_2545_ & 0xff]);
											int i_2547_ = is[i_2496_];
											is[i_2496_] = (((((i_2546_ & 0xff00ff) * i_2540_) + ((i_2547_ & 0xff00ff) * i_2541_)) & ~0xff00ff) + ((((i_2546_ & 0xff00) * i_2540_) + ((i_2547_ & 0xff00) * i_2541_)) & 0xff0000)) >> 8;
										}
										if (bool_2478_ && bool_2487_)
											fs[i_2496_] = f;
									}
								}
								i_2488_ += i_2492_;
								i_2496_++;
							}
							i_2489_ += i_2493_;
							i_2488_ = i_2539_;
							i_2496_ += i_2497_;
						}
					} else {
						int i_2548_ = (i_2484_ & 0xff0000) >> 16;
						int i_2549_ = (i_2484_ & 0xff00) >> 8;
						int i_2550_ = i_2484_ & 0xff;
						int i_2551_ = i_2484_ >>> 24;
						int i_2552_ = 256 - i_2551_;
						for (int i_2553_ = -i_2482_; i_2553_ < 0; i_2553_++) {
							int i_2554_ = (i_2489_ >> 16) * anInt8914;
							for (int i_2555_ = -i_2481_; i_2555_ < 0; i_2555_++) {
								if (!bool_2478_ || f < fs[i_2496_]) {
									int i_2556_ = (aByteArray11345[(i_2488_ >> 16) + i_2554_]);
									if (i_2556_ != 0) {
										int i_2557_ = anIntArray11346[i_2556_ & 0xff];
										if (i_2551_ != 255) {
											if (bool) {
												int i_2558_ = (((i_2557_ & 0xff0000) * i_2548_) & ~0xffffff);
												int i_2559_ = (((i_2557_ & 0xff00) * i_2549_) & 0xff0000);
												int i_2560_ = (((i_2557_ & 0xff) * i_2550_) & 0xff00);
												i_2557_ = (i_2558_ | i_2559_ | i_2560_) >>> 8;
												int i_2561_ = is[i_2496_];
												is[i_2496_] = (((((i_2557_ & 0xff00ff) * i_2551_) + ((i_2561_ & 0xff00ff) * i_2552_)) & ~0xff00ff) + ((((i_2557_ & 0xff00) * i_2551_) + ((i_2561_ & 0xff00) * i_2552_)) & 0xff0000)) >> 8;
											}
											if (bool_2478_ && bool_2487_)
												fs[i_2496_] = f;
										} else {
											if (bool) {
												int i_2562_ = (((i_2557_ & 0xff0000) * i_2548_) & ~0xffffff);
												int i_2563_ = (((i_2557_ & 0xff00) * i_2549_) & 0xff0000);
												int i_2564_ = (((i_2557_ & 0xff) * i_2550_) & 0xff00);
												is[i_2496_] = (i_2562_ | i_2563_ | i_2564_) >>> 8;
											}
											if (bool_2478_ && bool_2487_)
												fs[i_2496_] = f;
										}
									}
								}
								i_2488_ += i_2492_;
								i_2496_++;
							}
							i_2489_ += i_2493_;
							i_2488_ = i_2539_;
							i_2496_ += i_2497_;
						}
					}
				} else if (i_2483_ == 3) {
					int i_2565_ = i_2488_;
					int i_2566_ = i_2484_ >>> 24;
					int i_2567_ = 256 - i_2566_;
					for (int i_2568_ = -i_2482_; i_2568_ < 0; i_2568_++) {
						int i_2569_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2570_ = -i_2481_; i_2570_ < 0; i_2570_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								if (bool) {
									byte i_2571_ = (aByteArray11345[(i_2488_ >> 16) + i_2569_]);
									int i_2572_ = (i_2571_ > 0 ? anIntArray11346[i_2571_] : 0);
									int i_2573_ = i_2572_ + i_2484_;
									int i_2574_ = ((i_2572_ & 0xff00ff) + (i_2484_ & 0xff00ff));
									int i_2575_ = ((i_2574_ & 0x1000100) + (i_2573_ - i_2574_ & 0x10000));
									i_2575_ = (i_2573_ - i_2575_ | i_2575_ - (i_2575_ >>> 8));
									if (i_2572_ == 0 && i_2566_ != 255) {
										i_2572_ = i_2575_;
										i_2575_ = is[i_2496_];
										i_2575_ = ((((i_2572_ & 0xff00ff) * i_2566_ + ((i_2575_ & 0xff00ff) * i_2567_)) & ~0xff00ff) + (((i_2572_ & 0xff00) * i_2566_ + ((i_2575_ & 0xff00) * i_2567_)) & 0xff0000)) >> 8;
									}
									is[i_2496_] = i_2575_;
								}
								if (bool_2478_ && bool_2487_)
									fs[i_2496_] = f;
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2565_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 2) {
					int i_2576_ = i_2484_ >>> 24;
					int i_2577_ = 256 - i_2576_;
					int i_2578_ = (i_2484_ & 0xff00ff) * i_2577_ & ~0xff00ff;
					int i_2579_ = (i_2484_ & 0xff00) * i_2577_ & 0xff0000;
					i_2484_ = (i_2578_ | i_2579_) >>> 8;
					int i_2580_ = i_2488_;
					for (int i_2581_ = -i_2482_; i_2581_ < 0; i_2581_++) {
						int i_2582_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2583_ = -i_2481_; i_2583_ < 0; i_2583_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								int i_2584_ = (aByteArray11345[(i_2488_ >> 16) + i_2582_]);
								if (i_2584_ != 0) {
									if (bool) {
										int i_2585_ = anIntArray11346[i_2584_ & 0xff];
										i_2578_ = ((i_2585_ & 0xff00ff) * i_2576_ & ~0xff00ff);
										i_2579_ = ((i_2585_ & 0xff00) * i_2576_ & 0xff0000);
										is[i_2496_] = ((i_2578_ | i_2579_) >>> 8) + i_2484_;
									}
									if (bool_2478_ && bool_2487_)
										fs[i_2496_] = f;
								}
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2580_;
						i_2496_ += i_2497_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2485_ == 2) {
				if (i_2483_ == 1) {
					int i_2586_ = i_2488_;
					for (int i_2587_ = -i_2482_; i_2587_ < 0; i_2587_++) {
						int i_2588_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2589_ = -i_2481_; i_2589_ < 0; i_2589_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								int i_2590_ = (aByteArray11345[(i_2488_ >> 16) + i_2588_]);
								if (i_2590_ != 0) {
									if (bool) {
										int i_2591_ = anIntArray11346[i_2590_ & 0xff];
										int i_2592_ = is[i_2496_];
										int i_2593_ = i_2591_ + i_2592_;
										int i_2594_ = ((i_2591_ & 0xff00ff) + (i_2592_ & 0xff00ff));
										i_2592_ = ((i_2594_ & 0x1000100) + (i_2593_ - i_2594_ & 0x10000));
										is[i_2496_] = (i_2593_ - i_2592_ | i_2592_ - (i_2592_ >>> 8));
									}
									if (bool_2478_ && bool_2487_)
										fs[i_2496_] = f;
								}
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2586_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 0) {
					int i_2595_ = i_2488_;
					int i_2596_ = (i_2484_ & 0xff0000) >> 16;
					int i_2597_ = (i_2484_ & 0xff00) >> 8;
					int i_2598_ = i_2484_ & 0xff;
					for (int i_2599_ = -i_2482_; i_2599_ < 0; i_2599_++) {
						int i_2600_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2601_ = -i_2481_; i_2601_ < 0; i_2601_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								int i_2602_ = (aByteArray11345[(i_2488_ >> 16) + i_2600_]);
								if (i_2602_ != 0) {
									if (bool) {
										int i_2603_ = anIntArray11346[i_2602_ & 0xff];
										int i_2604_ = ((i_2603_ & 0xff0000) * i_2596_ & ~0xffffff);
										int i_2605_ = ((i_2603_ & 0xff00) * i_2597_ & 0xff0000);
										int i_2606_ = ((i_2603_ & 0xff) * i_2598_ & 0xff00);
										i_2603_ = (i_2604_ | i_2605_ | i_2606_) >>> 8;
										int i_2607_ = is[i_2496_];
										int i_2608_ = i_2603_ + i_2607_;
										int i_2609_ = ((i_2603_ & 0xff00ff) + (i_2607_ & 0xff00ff));
										i_2607_ = ((i_2609_ & 0x1000100) + (i_2608_ - i_2609_ & 0x10000));
										is[i_2496_] = (i_2608_ - i_2607_ | i_2607_ - (i_2607_ >>> 8));
									}
									if (bool_2478_ && bool_2487_)
										fs[i_2496_] = f;
								}
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2595_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 3) {
					int i_2610_ = i_2488_;
					for (int i_2611_ = -i_2482_; i_2611_ < 0; i_2611_++) {
						int i_2612_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2613_ = -i_2481_; i_2613_ < 0; i_2613_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								if (bool) {
									byte i_2614_ = (aByteArray11345[(i_2488_ >> 16) + i_2612_]);
									int i_2615_ = (i_2614_ > 0 ? anIntArray11346[i_2614_] : 0);
									int i_2616_ = i_2615_ + i_2484_;
									int i_2617_ = ((i_2615_ & 0xff00ff) + (i_2484_ & 0xff00ff));
									int i_2618_ = ((i_2617_ & 0x1000100) + (i_2616_ - i_2617_ & 0x10000));
									i_2615_ = (i_2616_ - i_2618_ | i_2618_ - (i_2618_ >>> 8));
									i_2618_ = is[i_2496_];
									i_2616_ = i_2615_ + i_2618_;
									i_2617_ = (i_2615_ & 0xff00ff) + (i_2618_ & 0xff00ff);
									i_2618_ = ((i_2617_ & 0x1000100) + (i_2616_ - i_2617_ & 0x10000));
									is[i_2496_] = (i_2616_ - i_2618_ | i_2618_ - (i_2618_ >>> 8));
								}
								if (bool_2478_ && bool_2487_)
									fs[i_2496_] = f;
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2610_;
						i_2496_ += i_2497_;
					}
				} else if (i_2483_ == 2) {
					int i_2619_ = i_2484_ >>> 24;
					int i_2620_ = 256 - i_2619_;
					int i_2621_ = (i_2484_ & 0xff00ff) * i_2620_ & ~0xff00ff;
					int i_2622_ = (i_2484_ & 0xff00) * i_2620_ & 0xff0000;
					i_2484_ = (i_2621_ | i_2622_) >>> 8;
					int i_2623_ = i_2488_;
					for (int i_2624_ = -i_2482_; i_2624_ < 0; i_2624_++) {
						int i_2625_ = (i_2489_ >> 16) * anInt8914;
						for (int i_2626_ = -i_2481_; i_2626_ < 0; i_2626_++) {
							if (!bool_2478_ || f < fs[i_2496_]) {
								int i_2627_ = (aByteArray11345[(i_2488_ >> 16) + i_2625_]);
								if (i_2627_ != 0) {
									if (bool) {
										int i_2628_ = anIntArray11346[i_2627_ & 0xff];
										i_2621_ = ((i_2628_ & 0xff00ff) * i_2619_ & ~0xff00ff);
										i_2622_ = ((i_2628_ & 0xff00) * i_2619_ & 0xff0000);
										i_2628_ = (((i_2621_ | i_2622_) >>> 8) + i_2484_);
										int i_2629_ = is[i_2496_];
										int i_2630_ = i_2628_ + i_2629_;
										int i_2631_ = ((i_2628_ & 0xff00ff) + (i_2629_ & 0xff00ff));
										i_2629_ = ((i_2631_ & 0x1000100) + (i_2630_ - i_2631_ & 0x10000));
										is[i_2496_] = (i_2630_ - i_2629_ | i_2629_ - (i_2629_ >>> 8));
									}
									if (bool_2478_ && bool_2487_)
										fs[i_2496_] = f;
								}
							}
							i_2488_ += i_2492_;
							i_2496_++;
						}
						i_2489_ += i_2493_;
						i_2488_ = i_2623_;
						i_2496_ += i_2497_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface22 method2471() {
		throw new IllegalStateException();
	}

	void method14407(int i, int i_2632_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_2633_ = anInt8928;
					while (i_2633_ < 0) {
						int i_2634_ = anInt8930;
						int i_2635_ = anInt8937;
						int i_2636_ = anInt8936;
						int i_2637_ = anInt8926;
						if (i_2635_ >= 0 && i_2636_ >= 0 && i_2635_ - (anInt8914 << 12) < 0 && i_2636_ - (anInt8916 << 12) < 0) {
							for (/**/; i_2637_ < 0; i_2637_++) {
								int i_2638_ = ((i_2636_ >> 12) * anInt8914 + (i_2635_ >> 12));
								int i_2639_ = i_2634_++;
								if (i_2632_ == 0) {
									if (i == 1)
										is[i_2639_] = (anIntArray11346[(aByteArray11345[i_2638_] & 0xff)]);
									else if (i == 0) {
										int i_2640_ = (anIntArray11346[(aByteArray11345[i_2638_] & 0xff)]);
										int i_2641_ = ((i_2640_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_2642_ = ((i_2640_ & 0xff00) * anInt8945 & 0xff0000);
										int i_2643_ = ((i_2640_ & 0xff) * anInt8946 & 0xff00);
										is[i_2639_] = (i_2641_ | i_2642_ | i_2643_) >>> 8;
									} else if (i == 3) {
										int i_2644_ = (anIntArray11346[(aByteArray11345[i_2638_] & 0xff)]);
										int i_2645_ = anInt8941;
										int i_2646_ = i_2644_ + i_2645_;
										int i_2647_ = ((i_2644_ & 0xff00ff) + (i_2645_ & 0xff00ff));
										int i_2648_ = ((i_2647_ & 0x1000100) + (i_2646_ - i_2647_ & 0x10000));
										is[i_2639_] = (i_2646_ - i_2648_ | i_2648_ - (i_2648_ >>> 8));
									} else if (i == 2) {
										int i_2649_ = (anIntArray11346[(aByteArray11345[i_2638_] & 0xff)]);
										int i_2650_ = ((i_2649_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_2651_ = ((i_2649_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_2639_] = ((i_2650_ | i_2651_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 1) {
									if (i == 1) {
										int i_2652_ = aByteArray11345[i_2638_];
										if (i_2652_ != 0)
											is[i_2639_] = (anIntArray11346[i_2652_ & 0xff]);
									} else if (i == 0) {
										int i_2653_ = aByteArray11345[i_2638_];
										if (i_2653_ != 0) {
											int i_2654_ = (anIntArray11346[i_2653_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_2655_ = anInt8941 >>> 24;
												int i_2656_ = 256 - i_2655_;
												int i_2657_ = is[i_2639_];
												is[i_2639_] = (((((i_2654_ & 0xff00ff) * i_2655_) + ((i_2657_ & 0xff00ff) * i_2656_)) & ~0xff00ff) + ((((i_2654_ & 0xff00) * i_2655_) + ((i_2657_ & 0xff00) * i_2656_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_2658_ = (((i_2654_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2659_ = (((i_2654_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2660_ = (((i_2654_ & 0xff) * anInt8946) & 0xff00);
												i_2654_ = (i_2658_ | i_2659_ | i_2660_) >>> 8;
												int i_2661_ = is[i_2639_];
												is[i_2639_] = (((((i_2654_ & 0xff00ff) * anInt8942) + ((i_2661_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2654_ & 0xff00) * anInt8942) + ((i_2661_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_2662_ = (((i_2654_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2663_ = (((i_2654_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2664_ = (((i_2654_ & 0xff) * anInt8946) & 0xff00);
												is[i_2639_] = (i_2662_ | i_2663_ | i_2664_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2665_ = aByteArray11345[i_2638_];
										int i_2666_ = (i_2665_ > 0 ? anIntArray11346[i_2665_] : 0);
										int i_2667_ = anInt8941;
										int i_2668_ = i_2666_ + i_2667_;
										int i_2669_ = ((i_2666_ & 0xff00ff) + (i_2667_ & 0xff00ff));
										int i_2670_ = ((i_2669_ & 0x1000100) + (i_2668_ - i_2669_ & 0x10000));
										i_2670_ = (i_2668_ - i_2670_ | i_2670_ - (i_2670_ >>> 8));
										if (i_2666_ == 0 && anInt8942 != 255) {
											i_2666_ = i_2670_;
											i_2670_ = is[i_2639_];
											i_2670_ = (((((i_2666_ & 0xff00ff) * anInt8942) + ((i_2670_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2666_ & 0xff00) * anInt8942) + ((i_2670_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2639_] = i_2670_;
									} else if (i == 2) {
										int i_2671_ = aByteArray11345[i_2638_];
										if (i_2671_ != 0) {
											int i_2672_ = (anIntArray11346[i_2671_ & 0xff]);
											int i_2673_ = (((i_2672_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2674_ = (((i_2672_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_2639_++] = (((i_2673_ | i_2674_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 2) {
									if (i == 1) {
										int i_2675_ = aByteArray11345[i_2638_];
										if (i_2675_ != 0) {
											int i_2676_ = (anIntArray11346[i_2675_ & 0xff]);
											int i_2677_ = is[i_2639_];
											int i_2678_ = i_2676_ + i_2677_;
											int i_2679_ = ((i_2676_ & 0xff00ff) + (i_2677_ & 0xff00ff));
											i_2677_ = ((i_2679_ & 0x1000100) + (i_2678_ - i_2679_ & 0x10000));
											is[i_2639_] = (i_2678_ - i_2677_ | i_2677_ - (i_2677_ >>> 8));
										}
									} else if (i == 0) {
										int i_2680_ = aByteArray11345[i_2638_];
										if (i_2680_ != 0) {
											int i_2681_ = (anIntArray11346[i_2680_ & 0xff]);
											int i_2682_ = (((i_2681_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_2683_ = (((i_2681_ & 0xff00) * anInt8945) & 0xff0000);
											int i_2684_ = ((i_2681_ & 0xff) * anInt8946 & 0xff00);
											i_2681_ = (i_2682_ | i_2683_ | i_2684_) >>> 8;
											int i_2685_ = is[i_2639_];
											int i_2686_ = i_2681_ + i_2685_;
											int i_2687_ = ((i_2681_ & 0xff00ff) + (i_2685_ & 0xff00ff));
											i_2685_ = ((i_2687_ & 0x1000100) + (i_2686_ - i_2687_ & 0x10000));
											is[i_2639_] = (i_2686_ - i_2685_ | i_2685_ - (i_2685_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2688_ = aByteArray11345[i_2638_];
										int i_2689_ = (i_2688_ > 0 ? anIntArray11346[i_2688_] : 0);
										int i_2690_ = anInt8941;
										int i_2691_ = i_2689_ + i_2690_;
										int i_2692_ = ((i_2689_ & 0xff00ff) + (i_2690_ & 0xff00ff));
										int i_2693_ = ((i_2692_ & 0x1000100) + (i_2691_ - i_2692_ & 0x10000));
										i_2693_ = (i_2691_ - i_2693_ | i_2693_ - (i_2693_ >>> 8));
										if (i_2689_ == 0 && anInt8942 != 255) {
											i_2689_ = i_2693_;
											i_2693_ = is[i_2639_];
											i_2693_ = (((((i_2689_ & 0xff00ff) * anInt8942) + ((i_2693_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2689_ & 0xff00) * anInt8942) + ((i_2693_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2639_] = i_2693_;
									} else if (i == 2) {
										int i_2694_ = aByteArray11345[i_2638_];
										if (i_2694_ != 0) {
											int i_2695_ = (anIntArray11346[i_2694_ & 0xff]);
											int i_2696_ = (((i_2695_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2697_ = (((i_2695_ & 0xff00) * anInt8942) & 0xff0000);
											i_2695_ = ((i_2696_ | i_2697_) >>> 8) + anInt8949;
											int i_2698_ = is[i_2639_];
											int i_2699_ = i_2695_ + i_2698_;
											int i_2700_ = ((i_2695_ & 0xff00ff) + (i_2698_ & 0xff00ff));
											i_2698_ = ((i_2700_ & 0x1000100) + (i_2699_ - i_2700_ & 0x10000));
											is[i_2639_] = (i_2699_ - i_2698_ | i_2698_ - (i_2698_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2633_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_2701_ = anInt8928;
					while (i_2701_ < 0) {
						int i_2702_ = anInt8930;
						int i_2703_ = anInt8937;
						int i_2704_ = anInt8936 + anInt8925;
						int i_2705_ = anInt8926;
						if (i_2703_ >= 0 && i_2703_ - (anInt8914 << 12) < 0) {
							int i_2706_;
							if ((i_2706_ = i_2704_ - (anInt8916 << 12)) >= 0) {
								i_2706_ = (anInt8938 - i_2706_) / anInt8938;
								i_2705_ += i_2706_;
								i_2704_ += anInt8938 * i_2706_;
								i_2702_ += i_2706_;
							}
							if ((i_2706_ = (i_2704_ - anInt8938) / anInt8938) > i_2705_)
								i_2705_ = i_2706_;
							for (/**/; i_2705_ < 0; i_2705_++) {
								int i_2707_ = ((i_2704_ >> 12) * anInt8914 + (i_2703_ >> 12));
								int i_2708_ = i_2702_++;
								if (i_2632_ == 0) {
									if (i == 1)
										is[i_2708_] = (anIntArray11346[(aByteArray11345[i_2707_] & 0xff)]);
									else if (i == 0) {
										int i_2709_ = (anIntArray11346[(aByteArray11345[i_2707_] & 0xff)]);
										int i_2710_ = ((i_2709_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_2711_ = ((i_2709_ & 0xff00) * anInt8945 & 0xff0000);
										int i_2712_ = ((i_2709_ & 0xff) * anInt8946 & 0xff00);
										is[i_2708_] = (i_2710_ | i_2711_ | i_2712_) >>> 8;
									} else if (i == 3) {
										int i_2713_ = (anIntArray11346[(aByteArray11345[i_2707_] & 0xff)]);
										int i_2714_ = anInt8941;
										int i_2715_ = i_2713_ + i_2714_;
										int i_2716_ = ((i_2713_ & 0xff00ff) + (i_2714_ & 0xff00ff));
										int i_2717_ = ((i_2716_ & 0x1000100) + (i_2715_ - i_2716_ & 0x10000));
										is[i_2708_] = (i_2715_ - i_2717_ | i_2717_ - (i_2717_ >>> 8));
									} else if (i == 2) {
										int i_2718_ = (anIntArray11346[(aByteArray11345[i_2707_] & 0xff)]);
										int i_2719_ = ((i_2718_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_2720_ = ((i_2718_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_2708_] = ((i_2719_ | i_2720_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 1) {
									if (i == 1) {
										int i_2721_ = aByteArray11345[i_2707_];
										if (i_2721_ != 0)
											is[i_2708_] = (anIntArray11346[i_2721_ & 0xff]);
									} else if (i == 0) {
										int i_2722_ = aByteArray11345[i_2707_];
										if (i_2722_ != 0) {
											int i_2723_ = (anIntArray11346[i_2722_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_2724_ = anInt8941 >>> 24;
												int i_2725_ = 256 - i_2724_;
												int i_2726_ = is[i_2708_];
												is[i_2708_] = (((((i_2723_ & 0xff00ff) * i_2724_) + ((i_2726_ & 0xff00ff) * i_2725_)) & ~0xff00ff) + ((((i_2723_ & 0xff00) * i_2724_) + ((i_2726_ & 0xff00) * i_2725_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_2727_ = (((i_2723_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2728_ = (((i_2723_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2729_ = (((i_2723_ & 0xff) * anInt8946) & 0xff00);
												i_2723_ = (i_2727_ | i_2728_ | i_2729_) >>> 8;
												int i_2730_ = is[i_2708_];
												is[i_2708_] = (((((i_2723_ & 0xff00ff) * anInt8942) + ((i_2730_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2723_ & 0xff00) * anInt8942) + ((i_2730_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_2731_ = (((i_2723_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2732_ = (((i_2723_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2733_ = (((i_2723_ & 0xff) * anInt8946) & 0xff00);
												is[i_2708_] = (i_2731_ | i_2732_ | i_2733_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2734_ = aByteArray11345[i_2707_];
										int i_2735_ = (i_2734_ > 0 ? anIntArray11346[i_2734_] : 0);
										int i_2736_ = anInt8941;
										int i_2737_ = i_2735_ + i_2736_;
										int i_2738_ = ((i_2735_ & 0xff00ff) + (i_2736_ & 0xff00ff));
										int i_2739_ = ((i_2738_ & 0x1000100) + (i_2737_ - i_2738_ & 0x10000));
										i_2739_ = (i_2737_ - i_2739_ | i_2739_ - (i_2739_ >>> 8));
										if (i_2735_ == 0 && anInt8942 != 255) {
											i_2735_ = i_2739_;
											i_2739_ = is[i_2708_];
											i_2739_ = (((((i_2735_ & 0xff00ff) * anInt8942) + ((i_2739_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2735_ & 0xff00) * anInt8942) + ((i_2739_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2708_] = i_2739_;
									} else if (i == 2) {
										int i_2740_ = aByteArray11345[i_2707_];
										if (i_2740_ != 0) {
											int i_2741_ = (anIntArray11346[i_2740_ & 0xff]);
											int i_2742_ = (((i_2741_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2743_ = (((i_2741_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_2708_++] = (((i_2742_ | i_2743_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 2) {
									if (i == 1) {
										int i_2744_ = aByteArray11345[i_2707_];
										if (i_2744_ != 0) {
											int i_2745_ = (anIntArray11346[i_2744_ & 0xff]);
											int i_2746_ = is[i_2708_];
											int i_2747_ = i_2745_ + i_2746_;
											int i_2748_ = ((i_2745_ & 0xff00ff) + (i_2746_ & 0xff00ff));
											i_2746_ = ((i_2748_ & 0x1000100) + (i_2747_ - i_2748_ & 0x10000));
											is[i_2708_] = (i_2747_ - i_2746_ | i_2746_ - (i_2746_ >>> 8));
										}
									} else if (i == 0) {
										int i_2749_ = aByteArray11345[i_2707_];
										if (i_2749_ != 0) {
											int i_2750_ = (anIntArray11346[i_2749_ & 0xff]);
											int i_2751_ = (((i_2750_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_2752_ = (((i_2750_ & 0xff00) * anInt8945) & 0xff0000);
											int i_2753_ = ((i_2750_ & 0xff) * anInt8946 & 0xff00);
											i_2750_ = (i_2751_ | i_2752_ | i_2753_) >>> 8;
											int i_2754_ = is[i_2708_];
											int i_2755_ = i_2750_ + i_2754_;
											int i_2756_ = ((i_2750_ & 0xff00ff) + (i_2754_ & 0xff00ff));
											i_2754_ = ((i_2756_ & 0x1000100) + (i_2755_ - i_2756_ & 0x10000));
											is[i_2708_] = (i_2755_ - i_2754_ | i_2754_ - (i_2754_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2757_ = aByteArray11345[i_2707_];
										int i_2758_ = (i_2757_ > 0 ? anIntArray11346[i_2757_] : 0);
										int i_2759_ = anInt8941;
										int i_2760_ = i_2758_ + i_2759_;
										int i_2761_ = ((i_2758_ & 0xff00ff) + (i_2759_ & 0xff00ff));
										int i_2762_ = ((i_2761_ & 0x1000100) + (i_2760_ - i_2761_ & 0x10000));
										i_2762_ = (i_2760_ - i_2762_ | i_2762_ - (i_2762_ >>> 8));
										if (i_2758_ == 0 && anInt8942 != 255) {
											i_2758_ = i_2762_;
											i_2762_ = is[i_2708_];
											i_2762_ = (((((i_2758_ & 0xff00ff) * anInt8942) + ((i_2762_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2758_ & 0xff00) * anInt8942) + ((i_2762_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2708_] = i_2762_;
									} else if (i == 2) {
										int i_2763_ = aByteArray11345[i_2707_];
										if (i_2763_ != 0) {
											int i_2764_ = (anIntArray11346[i_2763_ & 0xff]);
											int i_2765_ = (((i_2764_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2766_ = (((i_2764_ & 0xff00) * anInt8942) & 0xff0000);
											i_2764_ = ((i_2765_ | i_2766_) >>> 8) + anInt8949;
											int i_2767_ = is[i_2708_];
											int i_2768_ = i_2764_ + i_2767_;
											int i_2769_ = ((i_2764_ & 0xff00ff) + (i_2767_ & 0xff00ff));
											i_2767_ = ((i_2769_ & 0x1000100) + (i_2768_ - i_2769_ & 0x10000));
											is[i_2708_] = (i_2768_ - i_2767_ | i_2767_ - (i_2767_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2704_ += anInt8938;
							}
						}
						i_2701_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_2770_ = anInt8928;
					while (i_2770_ < 0) {
						int i_2771_ = anInt8930;
						int i_2772_ = anInt8937;
						int i_2773_ = anInt8936 + anInt8925;
						int i_2774_ = anInt8926;
						if (i_2772_ >= 0 && i_2772_ - (anInt8914 << 12) < 0) {
							if (i_2773_ < 0) {
								int i_2775_ = (anInt8938 - 1 - i_2773_) / anInt8938;
								i_2774_ += i_2775_;
								i_2773_ += anInt8938 * i_2775_;
								i_2771_ += i_2775_;
							}
							int i_2776_;
							if ((i_2776_ = (1 + i_2773_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_2774_)
								i_2774_ = i_2776_;
							for (/**/; i_2774_ < 0; i_2774_++) {
								int i_2777_ = ((i_2773_ >> 12) * anInt8914 + (i_2772_ >> 12));
								int i_2778_ = i_2771_++;
								if (i_2632_ == 0) {
									if (i == 1)
										is[i_2778_] = (anIntArray11346[(aByteArray11345[i_2777_] & 0xff)]);
									else if (i == 0) {
										int i_2779_ = (anIntArray11346[(aByteArray11345[i_2777_] & 0xff)]);
										int i_2780_ = ((i_2779_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_2781_ = ((i_2779_ & 0xff00) * anInt8945 & 0xff0000);
										int i_2782_ = ((i_2779_ & 0xff) * anInt8946 & 0xff00);
										is[i_2778_] = (i_2780_ | i_2781_ | i_2782_) >>> 8;
									} else if (i == 3) {
										int i_2783_ = (anIntArray11346[(aByteArray11345[i_2777_] & 0xff)]);
										int i_2784_ = anInt8941;
										int i_2785_ = i_2783_ + i_2784_;
										int i_2786_ = ((i_2783_ & 0xff00ff) + (i_2784_ & 0xff00ff));
										int i_2787_ = ((i_2786_ & 0x1000100) + (i_2785_ - i_2786_ & 0x10000));
										is[i_2778_] = (i_2785_ - i_2787_ | i_2787_ - (i_2787_ >>> 8));
									} else if (i == 2) {
										int i_2788_ = (anIntArray11346[(aByteArray11345[i_2777_] & 0xff)]);
										int i_2789_ = ((i_2788_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_2790_ = ((i_2788_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_2778_] = ((i_2789_ | i_2790_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 1) {
									if (i == 1) {
										int i_2791_ = aByteArray11345[i_2777_];
										if (i_2791_ != 0)
											is[i_2778_] = (anIntArray11346[i_2791_ & 0xff]);
									} else if (i == 0) {
										int i_2792_ = aByteArray11345[i_2777_];
										if (i_2792_ != 0) {
											int i_2793_ = (anIntArray11346[i_2792_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_2794_ = anInt8941 >>> 24;
												int i_2795_ = 256 - i_2794_;
												int i_2796_ = is[i_2778_];
												is[i_2778_] = (((((i_2793_ & 0xff00ff) * i_2794_) + ((i_2796_ & 0xff00ff) * i_2795_)) & ~0xff00ff) + ((((i_2793_ & 0xff00) * i_2794_) + ((i_2796_ & 0xff00) * i_2795_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_2797_ = (((i_2793_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2798_ = (((i_2793_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2799_ = (((i_2793_ & 0xff) * anInt8946) & 0xff00);
												i_2793_ = (i_2797_ | i_2798_ | i_2799_) >>> 8;
												int i_2800_ = is[i_2778_];
												is[i_2778_] = (((((i_2793_ & 0xff00ff) * anInt8942) + ((i_2800_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2793_ & 0xff00) * anInt8942) + ((i_2800_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_2801_ = (((i_2793_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2802_ = (((i_2793_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2803_ = (((i_2793_ & 0xff) * anInt8946) & 0xff00);
												is[i_2778_] = (i_2801_ | i_2802_ | i_2803_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2804_ = aByteArray11345[i_2777_];
										int i_2805_ = (i_2804_ > 0 ? anIntArray11346[i_2804_] : 0);
										int i_2806_ = anInt8941;
										int i_2807_ = i_2805_ + i_2806_;
										int i_2808_ = ((i_2805_ & 0xff00ff) + (i_2806_ & 0xff00ff));
										int i_2809_ = ((i_2808_ & 0x1000100) + (i_2807_ - i_2808_ & 0x10000));
										i_2809_ = (i_2807_ - i_2809_ | i_2809_ - (i_2809_ >>> 8));
										if (i_2805_ == 0 && anInt8942 != 255) {
											i_2805_ = i_2809_;
											i_2809_ = is[i_2778_];
											i_2809_ = (((((i_2805_ & 0xff00ff) * anInt8942) + ((i_2809_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2805_ & 0xff00) * anInt8942) + ((i_2809_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2778_] = i_2809_;
									} else if (i == 2) {
										int i_2810_ = aByteArray11345[i_2777_];
										if (i_2810_ != 0) {
											int i_2811_ = (anIntArray11346[i_2810_ & 0xff]);
											int i_2812_ = (((i_2811_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2813_ = (((i_2811_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_2778_++] = (((i_2812_ | i_2813_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 2) {
									if (i == 1) {
										int i_2814_ = aByteArray11345[i_2777_];
										if (i_2814_ != 0) {
											int i_2815_ = (anIntArray11346[i_2814_ & 0xff]);
											int i_2816_ = is[i_2778_];
											int i_2817_ = i_2815_ + i_2816_;
											int i_2818_ = ((i_2815_ & 0xff00ff) + (i_2816_ & 0xff00ff));
											i_2816_ = ((i_2818_ & 0x1000100) + (i_2817_ - i_2818_ & 0x10000));
											is[i_2778_] = (i_2817_ - i_2816_ | i_2816_ - (i_2816_ >>> 8));
										}
									} else if (i == 0) {
										int i_2819_ = aByteArray11345[i_2777_];
										if (i_2819_ != 0) {
											int i_2820_ = (anIntArray11346[i_2819_ & 0xff]);
											int i_2821_ = (((i_2820_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_2822_ = (((i_2820_ & 0xff00) * anInt8945) & 0xff0000);
											int i_2823_ = ((i_2820_ & 0xff) * anInt8946 & 0xff00);
											i_2820_ = (i_2821_ | i_2822_ | i_2823_) >>> 8;
											int i_2824_ = is[i_2778_];
											int i_2825_ = i_2820_ + i_2824_;
											int i_2826_ = ((i_2820_ & 0xff00ff) + (i_2824_ & 0xff00ff));
											i_2824_ = ((i_2826_ & 0x1000100) + (i_2825_ - i_2826_ & 0x10000));
											is[i_2778_] = (i_2825_ - i_2824_ | i_2824_ - (i_2824_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2827_ = aByteArray11345[i_2777_];
										int i_2828_ = (i_2827_ > 0 ? anIntArray11346[i_2827_] : 0);
										int i_2829_ = anInt8941;
										int i_2830_ = i_2828_ + i_2829_;
										int i_2831_ = ((i_2828_ & 0xff00ff) + (i_2829_ & 0xff00ff));
										int i_2832_ = ((i_2831_ & 0x1000100) + (i_2830_ - i_2831_ & 0x10000));
										i_2832_ = (i_2830_ - i_2832_ | i_2832_ - (i_2832_ >>> 8));
										if (i_2828_ == 0 && anInt8942 != 255) {
											i_2828_ = i_2832_;
											i_2832_ = is[i_2778_];
											i_2832_ = (((((i_2828_ & 0xff00ff) * anInt8942) + ((i_2832_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2828_ & 0xff00) * anInt8942) + ((i_2832_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2778_] = i_2832_;
									} else if (i == 2) {
										int i_2833_ = aByteArray11345[i_2777_];
										if (i_2833_ != 0) {
											int i_2834_ = (anIntArray11346[i_2833_ & 0xff]);
											int i_2835_ = (((i_2834_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2836_ = (((i_2834_ & 0xff00) * anInt8942) & 0xff0000);
											i_2834_ = ((i_2835_ | i_2836_) >>> 8) + anInt8949;
											int i_2837_ = is[i_2778_];
											int i_2838_ = i_2834_ + i_2837_;
											int i_2839_ = ((i_2834_ & 0xff00ff) + (i_2837_ & 0xff00ff));
											i_2837_ = ((i_2839_ & 0x1000100) + (i_2838_ - i_2839_ & 0x10000));
											is[i_2778_] = (i_2838_ - i_2837_ | i_2837_ - (i_2837_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2773_ += anInt8938;
							}
						}
						i_2770_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_2840_ = anInt8928;
					while (i_2840_ < 0) {
						int i_2841_ = anInt8930;
						int i_2842_ = anInt8937 + anInt8939;
						int i_2843_ = anInt8936;
						int i_2844_ = anInt8926;
						if (i_2843_ >= 0 && i_2843_ - (anInt8916 << 12) < 0) {
							int i_2845_;
							if ((i_2845_ = i_2842_ - (anInt8914 << 12)) >= 0) {
								i_2845_ = (anInt8940 - i_2845_) / anInt8940;
								i_2844_ += i_2845_;
								i_2842_ += anInt8940 * i_2845_;
								i_2841_ += i_2845_;
							}
							if ((i_2845_ = (i_2842_ - anInt8940) / anInt8940) > i_2844_)
								i_2844_ = i_2845_;
							for (/**/; i_2844_ < 0; i_2844_++) {
								int i_2846_ = ((i_2843_ >> 12) * anInt8914 + (i_2842_ >> 12));
								int i_2847_ = i_2841_++;
								if (i_2632_ == 0) {
									if (i == 1)
										is[i_2847_] = (anIntArray11346[(aByteArray11345[i_2846_] & 0xff)]);
									else if (i == 0) {
										int i_2848_ = (anIntArray11346[(aByteArray11345[i_2846_] & 0xff)]);
										int i_2849_ = ((i_2848_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_2850_ = ((i_2848_ & 0xff00) * anInt8945 & 0xff0000);
										int i_2851_ = ((i_2848_ & 0xff) * anInt8946 & 0xff00);
										is[i_2847_] = (i_2849_ | i_2850_ | i_2851_) >>> 8;
									} else if (i == 3) {
										int i_2852_ = (anIntArray11346[(aByteArray11345[i_2846_] & 0xff)]);
										int i_2853_ = anInt8941;
										int i_2854_ = i_2852_ + i_2853_;
										int i_2855_ = ((i_2852_ & 0xff00ff) + (i_2853_ & 0xff00ff));
										int i_2856_ = ((i_2855_ & 0x1000100) + (i_2854_ - i_2855_ & 0x10000));
										is[i_2847_] = (i_2854_ - i_2856_ | i_2856_ - (i_2856_ >>> 8));
									} else if (i == 2) {
										int i_2857_ = (anIntArray11346[(aByteArray11345[i_2846_] & 0xff)]);
										int i_2858_ = ((i_2857_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_2859_ = ((i_2857_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_2847_] = ((i_2858_ | i_2859_) >>> 8) + anInt8949;
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 1) {
									if (i == 1) {
										int i_2860_ = aByteArray11345[i_2846_];
										if (i_2860_ != 0)
											is[i_2847_] = (anIntArray11346[i_2860_ & 0xff]);
									} else if (i == 0) {
										int i_2861_ = aByteArray11345[i_2846_];
										if (i_2861_ != 0) {
											int i_2862_ = (anIntArray11346[i_2861_ & 0xff]);
											if ((anInt8941 & 0xffffff) == 16777215) {
												int i_2863_ = anInt8941 >>> 24;
												int i_2864_ = 256 - i_2863_;
												int i_2865_ = is[i_2847_];
												is[i_2847_] = (((((i_2862_ & 0xff00ff) * i_2863_) + ((i_2865_ & 0xff00ff) * i_2864_)) & ~0xff00ff) + ((((i_2862_ & 0xff00) * i_2863_) + ((i_2865_ & 0xff00) * i_2864_)) & 0xff0000)) >> 8;
											} else if (anInt8942 != 255) {
												int i_2866_ = (((i_2862_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2867_ = (((i_2862_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2868_ = (((i_2862_ & 0xff) * anInt8946) & 0xff00);
												i_2862_ = (i_2866_ | i_2867_ | i_2868_) >>> 8;
												int i_2869_ = is[i_2847_];
												is[i_2847_] = (((((i_2862_ & 0xff00ff) * anInt8942) + ((i_2869_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2862_ & 0xff00) * anInt8942) + ((i_2869_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
											} else {
												int i_2870_ = (((i_2862_ & 0xff0000) * anInt8944) & ~0xffffff);
												int i_2871_ = (((i_2862_ & 0xff00) * anInt8945) & 0xff0000);
												int i_2872_ = (((i_2862_ & 0xff) * anInt8946) & 0xff00);
												is[i_2847_] = (i_2870_ | i_2871_ | i_2872_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2873_ = aByteArray11345[i_2846_];
										int i_2874_ = (i_2873_ > 0 ? anIntArray11346[i_2873_] : 0);
										int i_2875_ = anInt8941;
										int i_2876_ = i_2874_ + i_2875_;
										int i_2877_ = ((i_2874_ & 0xff00ff) + (i_2875_ & 0xff00ff));
										int i_2878_ = ((i_2877_ & 0x1000100) + (i_2876_ - i_2877_ & 0x10000));
										i_2878_ = (i_2876_ - i_2878_ | i_2878_ - (i_2878_ >>> 8));
										if (i_2874_ == 0 && anInt8942 != 255) {
											i_2874_ = i_2878_;
											i_2878_ = is[i_2847_];
											i_2878_ = (((((i_2874_ & 0xff00ff) * anInt8942) + ((i_2878_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2874_ & 0xff00) * anInt8942) + ((i_2878_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2847_] = i_2878_;
									} else if (i == 2) {
										int i_2879_ = aByteArray11345[i_2846_];
										if (i_2879_ != 0) {
											int i_2880_ = (anIntArray11346[i_2879_ & 0xff]);
											int i_2881_ = (((i_2880_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2882_ = (((i_2880_ & 0xff00) * anInt8942) & 0xff0000);
											is[i_2847_++] = (((i_2881_ | i_2882_) >>> 8) + anInt8949);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2632_ == 2) {
									if (i == 1) {
										int i_2883_ = aByteArray11345[i_2846_];
										if (i_2883_ != 0) {
											int i_2884_ = (anIntArray11346[i_2883_ & 0xff]);
											int i_2885_ = is[i_2847_];
											int i_2886_ = i_2884_ + i_2885_;
											int i_2887_ = ((i_2884_ & 0xff00ff) + (i_2885_ & 0xff00ff));
											i_2885_ = ((i_2887_ & 0x1000100) + (i_2886_ - i_2887_ & 0x10000));
											is[i_2847_] = (i_2886_ - i_2885_ | i_2885_ - (i_2885_ >>> 8));
										}
									} else if (i == 0) {
										int i_2888_ = aByteArray11345[i_2846_];
										if (i_2888_ != 0) {
											int i_2889_ = (anIntArray11346[i_2888_ & 0xff]);
											int i_2890_ = (((i_2889_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_2891_ = (((i_2889_ & 0xff00) * anInt8945) & 0xff0000);
											int i_2892_ = ((i_2889_ & 0xff) * anInt8946 & 0xff00);
											i_2889_ = (i_2890_ | i_2891_ | i_2892_) >>> 8;
											int i_2893_ = is[i_2847_];
											int i_2894_ = i_2889_ + i_2893_;
											int i_2895_ = ((i_2889_ & 0xff00ff) + (i_2893_ & 0xff00ff));
											i_2893_ = ((i_2895_ & 0x1000100) + (i_2894_ - i_2895_ & 0x10000));
											is[i_2847_] = (i_2894_ - i_2893_ | i_2893_ - (i_2893_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2896_ = aByteArray11345[i_2846_];
										int i_2897_ = (i_2896_ > 0 ? anIntArray11346[i_2896_] : 0);
										int i_2898_ = anInt8941;
										int i_2899_ = i_2897_ + i_2898_;
										int i_2900_ = ((i_2897_ & 0xff00ff) + (i_2898_ & 0xff00ff));
										int i_2901_ = ((i_2900_ & 0x1000100) + (i_2899_ - i_2900_ & 0x10000));
										i_2901_ = (i_2899_ - i_2901_ | i_2901_ - (i_2901_ >>> 8));
										if (i_2897_ == 0 && anInt8942 != 255) {
											i_2897_ = i_2901_;
											i_2901_ = is[i_2847_];
											i_2901_ = (((((i_2897_ & 0xff00ff) * anInt8942) + ((i_2901_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2897_ & 0xff00) * anInt8942) + ((i_2901_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										}
										is[i_2847_] = i_2901_;
									} else if (i == 2) {
										int i_2902_ = aByteArray11345[i_2846_];
										if (i_2902_ != 0) {
											int i_2903_ = (anIntArray11346[i_2902_ & 0xff]);
											int i_2904_ = (((i_2903_ & 0xff00ff) * anInt8942) & ~0xff00ff);
											int i_2905_ = (((i_2903_ & 0xff00) * anInt8942) & 0xff0000);
											i_2903_ = ((i_2904_ | i_2905_) >>> 8) + anInt8949;
											int i_2906_ = is[i_2847_];
											int i_2907_ = i_2903_ + i_2906_;
											int i_2908_ = ((i_2903_ & 0xff00ff) + (i_2906_ & 0xff00ff));
											i_2906_ = ((i_2908_ & 0x1000100) + (i_2907_ - i_2908_ & 0x10000));
											is[i_2847_] = (i_2907_ - i_2906_ | i_2906_ - (i_2906_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2842_ += anInt8940;
							}
						}
						i_2840_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_2909_ = anInt8928;
					while (i_2909_ < 0) {
						int i_2910_ = anInt8930;
						int i_2911_ = anInt8937 + anInt8939;
						int i_2912_ = anInt8936 + anInt8925;
						int i_2913_ = anInt8926;
						int i_2914_;
						if ((i_2914_ = i_2911_ - (anInt8914 << 12)) >= 0) {
							i_2914_ = (anInt8940 - i_2914_) / anInt8940;
							i_2913_ += i_2914_;
							i_2911_ += anInt8940 * i_2914_;
							i_2912_ += anInt8938 * i_2914_;
							i_2910_ += i_2914_;
						}
						if ((i_2914_ = (i_2911_ - anInt8940) / anInt8940) > i_2913_)
							i_2913_ = i_2914_;
						if ((i_2914_ = i_2912_ - (anInt8916 << 12)) >= 0) {
							i_2914_ = (anInt8938 - i_2914_) / anInt8938;
							i_2913_ += i_2914_;
							i_2911_ += anInt8940 * i_2914_;
							i_2912_ += anInt8938 * i_2914_;
							i_2910_ += i_2914_;
						}
						if ((i_2914_ = (i_2912_ - anInt8938) / anInt8938) > i_2913_)
							i_2913_ = i_2914_;
						for (/**/; i_2913_ < 0; i_2913_++) {
							int i_2915_ = ((i_2912_ >> 12) * anInt8914 + (i_2911_ >> 12));
							int i_2916_ = i_2910_++;
							if (i_2632_ == 0) {
								if (i == 1)
									is[i_2916_] = (anIntArray11346[aByteArray11345[i_2915_] & 0xff]);
								else if (i == 0) {
									int i_2917_ = (anIntArray11346[aByteArray11345[i_2915_] & 0xff]);
									int i_2918_ = ((i_2917_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_2919_ = ((i_2917_ & 0xff00) * anInt8945 & 0xff0000);
									int i_2920_ = ((i_2917_ & 0xff) * anInt8946 & 0xff00);
									is[i_2916_] = (i_2918_ | i_2919_ | i_2920_) >>> 8;
								} else if (i == 3) {
									int i_2921_ = (anIntArray11346[aByteArray11345[i_2915_] & 0xff]);
									int i_2922_ = anInt8941;
									int i_2923_ = i_2921_ + i_2922_;
									int i_2924_ = ((i_2921_ & 0xff00ff) + (i_2922_ & 0xff00ff));
									int i_2925_ = ((i_2924_ & 0x1000100) + (i_2923_ - i_2924_ & 0x10000));
									is[i_2916_] = (i_2923_ - i_2925_ | i_2925_ - (i_2925_ >>> 8));
								} else if (i == 2) {
									int i_2926_ = (anIntArray11346[aByteArray11345[i_2915_] & 0xff]);
									int i_2927_ = ((i_2926_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_2928_ = ((i_2926_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_2916_] = (((i_2927_ | i_2928_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_2632_ == 1) {
								if (i == 1) {
									int i_2929_ = aByteArray11345[i_2915_];
									if (i_2929_ != 0)
										is[i_2916_] = anIntArray11346[i_2929_ & 0xff];
								} else if (i == 0) {
									int i_2930_ = aByteArray11345[i_2915_];
									if (i_2930_ != 0) {
										int i_2931_ = anIntArray11346[i_2930_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_2932_ = anInt8941 >>> 24;
											int i_2933_ = 256 - i_2932_;
											int i_2934_ = is[i_2916_];
											is[i_2916_] = (((((i_2931_ & 0xff00ff) * i_2932_) + ((i_2934_ & 0xff00ff) * i_2933_)) & ~0xff00ff) + ((((i_2931_ & 0xff00) * i_2932_) + ((i_2934_ & 0xff00) * i_2933_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_2935_ = (((i_2931_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_2936_ = (((i_2931_ & 0xff00) * anInt8945) & 0xff0000);
											int i_2937_ = ((i_2931_ & 0xff) * anInt8946 & 0xff00);
											i_2931_ = (i_2935_ | i_2936_ | i_2937_) >>> 8;
											int i_2938_ = is[i_2916_];
											is[i_2916_] = (((((i_2931_ & 0xff00ff) * anInt8942) + ((i_2938_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2931_ & 0xff00) * anInt8942) + ((i_2938_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_2939_ = (((i_2931_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_2940_ = (((i_2931_ & 0xff00) * anInt8945) & 0xff0000);
											int i_2941_ = ((i_2931_ & 0xff) * anInt8946 & 0xff00);
											is[i_2916_] = (i_2939_ | i_2940_ | i_2941_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_2942_ = aByteArray11345[i_2915_];
									int i_2943_ = (i_2942_ > 0 ? anIntArray11346[i_2942_] : 0);
									int i_2944_ = anInt8941;
									int i_2945_ = i_2943_ + i_2944_;
									int i_2946_ = ((i_2943_ & 0xff00ff) + (i_2944_ & 0xff00ff));
									int i_2947_ = ((i_2946_ & 0x1000100) + (i_2945_ - i_2946_ & 0x10000));
									i_2947_ = (i_2945_ - i_2947_ | i_2947_ - (i_2947_ >>> 8));
									if (i_2943_ == 0 && anInt8942 != 255) {
										i_2943_ = i_2947_;
										i_2947_ = is[i_2916_];
										i_2947_ = (((((i_2943_ & 0xff00ff) * anInt8942) + ((i_2947_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2943_ & 0xff00) * anInt8942) + ((i_2947_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_2916_] = i_2947_;
								} else if (i == 2) {
									int i_2948_ = aByteArray11345[i_2915_];
									if (i_2948_ != 0) {
										int i_2949_ = anIntArray11346[i_2948_ & 0xff];
										int i_2950_ = ((i_2949_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_2951_ = ((i_2949_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_2916_++] = ((i_2950_ | i_2951_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2632_ == 2) {
								if (i == 1) {
									int i_2952_ = aByteArray11345[i_2915_];
									if (i_2952_ != 0) {
										int i_2953_ = anIntArray11346[i_2952_ & 0xff];
										int i_2954_ = is[i_2916_];
										int i_2955_ = i_2953_ + i_2954_;
										int i_2956_ = ((i_2953_ & 0xff00ff) + (i_2954_ & 0xff00ff));
										i_2954_ = ((i_2956_ & 0x1000100) + (i_2955_ - i_2956_ & 0x10000));
										is[i_2916_] = (i_2955_ - i_2954_ | i_2954_ - (i_2954_ >>> 8));
									}
								} else if (i == 0) {
									int i_2957_ = aByteArray11345[i_2915_];
									if (i_2957_ != 0) {
										int i_2958_ = anIntArray11346[i_2957_ & 0xff];
										int i_2959_ = ((i_2958_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_2960_ = ((i_2958_ & 0xff00) * anInt8945 & 0xff0000);
										int i_2961_ = ((i_2958_ & 0xff) * anInt8946 & 0xff00);
										i_2958_ = (i_2959_ | i_2960_ | i_2961_) >>> 8;
										int i_2962_ = is[i_2916_];
										int i_2963_ = i_2958_ + i_2962_;
										int i_2964_ = ((i_2958_ & 0xff00ff) + (i_2962_ & 0xff00ff));
										i_2962_ = ((i_2964_ & 0x1000100) + (i_2963_ - i_2964_ & 0x10000));
										is[i_2916_] = (i_2963_ - i_2962_ | i_2962_ - (i_2962_ >>> 8));
									}
								} else if (i == 3) {
									byte i_2965_ = aByteArray11345[i_2915_];
									int i_2966_ = (i_2965_ > 0 ? anIntArray11346[i_2965_] : 0);
									int i_2967_ = anInt8941;
									int i_2968_ = i_2966_ + i_2967_;
									int i_2969_ = ((i_2966_ & 0xff00ff) + (i_2967_ & 0xff00ff));
									int i_2970_ = ((i_2969_ & 0x1000100) + (i_2968_ - i_2969_ & 0x10000));
									i_2970_ = (i_2968_ - i_2970_ | i_2970_ - (i_2970_ >>> 8));
									if (i_2966_ == 0 && anInt8942 != 255) {
										i_2966_ = i_2970_;
										i_2970_ = is[i_2916_];
										i_2970_ = (((((i_2966_ & 0xff00ff) * anInt8942) + ((i_2970_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_2966_ & 0xff00) * anInt8942) + ((i_2970_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_2916_] = i_2970_;
								} else if (i == 2) {
									int i_2971_ = aByteArray11345[i_2915_];
									if (i_2971_ != 0) {
										int i_2972_ = anIntArray11346[i_2971_ & 0xff];
										int i_2973_ = ((i_2972_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_2974_ = ((i_2972_ & 0xff00) * anInt8942 & 0xff0000);
										i_2972_ = (((i_2973_ | i_2974_) >>> 8) + anInt8949);
										int i_2975_ = is[i_2916_];
										int i_2976_ = i_2972_ + i_2975_;
										int i_2977_ = ((i_2972_ & 0xff00ff) + (i_2975_ & 0xff00ff));
										i_2975_ = ((i_2977_ & 0x1000100) + (i_2976_ - i_2977_ & 0x10000));
										is[i_2916_] = (i_2976_ - i_2975_ | i_2975_ - (i_2975_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2911_ += anInt8940;
							i_2912_ += anInt8938;
						}
						i_2909_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_2978_ = anInt8928;
					while (i_2978_ < 0) {
						int i_2979_ = anInt8930;
						int i_2980_ = anInt8937 + anInt8939;
						int i_2981_ = anInt8936 + anInt8925;
						int i_2982_ = anInt8926;
						int i_2983_;
						if ((i_2983_ = i_2980_ - (anInt8914 << 12)) >= 0) {
							i_2983_ = (anInt8940 - i_2983_) / anInt8940;
							i_2982_ += i_2983_;
							i_2980_ += anInt8940 * i_2983_;
							i_2981_ += anInt8938 * i_2983_;
							i_2979_ += i_2983_;
						}
						if ((i_2983_ = (i_2980_ - anInt8940) / anInt8940) > i_2982_)
							i_2982_ = i_2983_;
						if (i_2981_ < 0) {
							i_2983_ = (anInt8938 - 1 - i_2981_) / anInt8938;
							i_2982_ += i_2983_;
							i_2980_ += anInt8940 * i_2983_;
							i_2981_ += anInt8938 * i_2983_;
							i_2979_ += i_2983_;
						}
						if ((i_2983_ = (1 + i_2981_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_2982_)
							i_2982_ = i_2983_;
						for (/**/; i_2982_ < 0; i_2982_++) {
							int i_2984_ = ((i_2981_ >> 12) * anInt8914 + (i_2980_ >> 12));
							int i_2985_ = i_2979_++;
							if (i_2632_ == 0) {
								if (i == 1)
									is[i_2985_] = (anIntArray11346[aByteArray11345[i_2984_] & 0xff]);
								else if (i == 0) {
									int i_2986_ = (anIntArray11346[aByteArray11345[i_2984_] & 0xff]);
									int i_2987_ = ((i_2986_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_2988_ = ((i_2986_ & 0xff00) * anInt8945 & 0xff0000);
									int i_2989_ = ((i_2986_ & 0xff) * anInt8946 & 0xff00);
									is[i_2985_] = (i_2987_ | i_2988_ | i_2989_) >>> 8;
								} else if (i == 3) {
									int i_2990_ = (anIntArray11346[aByteArray11345[i_2984_] & 0xff]);
									int i_2991_ = anInt8941;
									int i_2992_ = i_2990_ + i_2991_;
									int i_2993_ = ((i_2990_ & 0xff00ff) + (i_2991_ & 0xff00ff));
									int i_2994_ = ((i_2993_ & 0x1000100) + (i_2992_ - i_2993_ & 0x10000));
									is[i_2985_] = (i_2992_ - i_2994_ | i_2994_ - (i_2994_ >>> 8));
								} else if (i == 2) {
									int i_2995_ = (anIntArray11346[aByteArray11345[i_2984_] & 0xff]);
									int i_2996_ = ((i_2995_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_2997_ = ((i_2995_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_2985_] = (((i_2996_ | i_2997_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_2632_ == 1) {
								if (i == 1) {
									int i_2998_ = aByteArray11345[i_2984_];
									if (i_2998_ != 0)
										is[i_2985_] = anIntArray11346[i_2998_ & 0xff];
								} else if (i == 0) {
									int i_2999_ = aByteArray11345[i_2984_];
									if (i_2999_ != 0) {
										int i_3000_ = anIntArray11346[i_2999_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_3001_ = anInt8941 >>> 24;
											int i_3002_ = 256 - i_3001_;
											int i_3003_ = is[i_2985_];
											is[i_2985_] = (((((i_3000_ & 0xff00ff) * i_3001_) + ((i_3003_ & 0xff00ff) * i_3002_)) & ~0xff00ff) + ((((i_3000_ & 0xff00) * i_3001_) + ((i_3003_ & 0xff00) * i_3002_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_3004_ = (((i_3000_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_3005_ = (((i_3000_ & 0xff00) * anInt8945) & 0xff0000);
											int i_3006_ = ((i_3000_ & 0xff) * anInt8946 & 0xff00);
											i_3000_ = (i_3004_ | i_3005_ | i_3006_) >>> 8;
											int i_3007_ = is[i_2985_];
											is[i_2985_] = (((((i_3000_ & 0xff00ff) * anInt8942) + ((i_3007_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3000_ & 0xff00) * anInt8942) + ((i_3007_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_3008_ = (((i_3000_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_3009_ = (((i_3000_ & 0xff00) * anInt8945) & 0xff0000);
											int i_3010_ = ((i_3000_ & 0xff) * anInt8946 & 0xff00);
											is[i_2985_] = (i_3008_ | i_3009_ | i_3010_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3011_ = aByteArray11345[i_2984_];
									int i_3012_ = (i_3011_ > 0 ? anIntArray11346[i_3011_] : 0);
									int i_3013_ = anInt8941;
									int i_3014_ = i_3012_ + i_3013_;
									int i_3015_ = ((i_3012_ & 0xff00ff) + (i_3013_ & 0xff00ff));
									int i_3016_ = ((i_3015_ & 0x1000100) + (i_3014_ - i_3015_ & 0x10000));
									i_3016_ = (i_3014_ - i_3016_ | i_3016_ - (i_3016_ >>> 8));
									if (i_3012_ == 0 && anInt8942 != 255) {
										i_3012_ = i_3016_;
										i_3016_ = is[i_2985_];
										i_3016_ = (((((i_3012_ & 0xff00ff) * anInt8942) + ((i_3016_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3012_ & 0xff00) * anInt8942) + ((i_3016_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_2985_] = i_3016_;
								} else if (i == 2) {
									int i_3017_ = aByteArray11345[i_2984_];
									if (i_3017_ != 0) {
										int i_3018_ = anIntArray11346[i_3017_ & 0xff];
										int i_3019_ = ((i_3018_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_3020_ = ((i_3018_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_2985_++] = ((i_3019_ | i_3020_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2632_ == 2) {
								if (i == 1) {
									int i_3021_ = aByteArray11345[i_2984_];
									if (i_3021_ != 0) {
										int i_3022_ = anIntArray11346[i_3021_ & 0xff];
										int i_3023_ = is[i_2985_];
										int i_3024_ = i_3022_ + i_3023_;
										int i_3025_ = ((i_3022_ & 0xff00ff) + (i_3023_ & 0xff00ff));
										i_3023_ = ((i_3025_ & 0x1000100) + (i_3024_ - i_3025_ & 0x10000));
										is[i_2985_] = (i_3024_ - i_3023_ | i_3023_ - (i_3023_ >>> 8));
									}
								} else if (i == 0) {
									int i_3026_ = aByteArray11345[i_2984_];
									if (i_3026_ != 0) {
										int i_3027_ = anIntArray11346[i_3026_ & 0xff];
										int i_3028_ = ((i_3027_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_3029_ = ((i_3027_ & 0xff00) * anInt8945 & 0xff0000);
										int i_3030_ = ((i_3027_ & 0xff) * anInt8946 & 0xff00);
										i_3027_ = (i_3028_ | i_3029_ | i_3030_) >>> 8;
										int i_3031_ = is[i_2985_];
										int i_3032_ = i_3027_ + i_3031_;
										int i_3033_ = ((i_3027_ & 0xff00ff) + (i_3031_ & 0xff00ff));
										i_3031_ = ((i_3033_ & 0x1000100) + (i_3032_ - i_3033_ & 0x10000));
										is[i_2985_] = (i_3032_ - i_3031_ | i_3031_ - (i_3031_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3034_ = aByteArray11345[i_2984_];
									int i_3035_ = (i_3034_ > 0 ? anIntArray11346[i_3034_] : 0);
									int i_3036_ = anInt8941;
									int i_3037_ = i_3035_ + i_3036_;
									int i_3038_ = ((i_3035_ & 0xff00ff) + (i_3036_ & 0xff00ff));
									int i_3039_ = ((i_3038_ & 0x1000100) + (i_3037_ - i_3038_ & 0x10000));
									i_3039_ = (i_3037_ - i_3039_ | i_3039_ - (i_3039_ >>> 8));
									if (i_3035_ == 0 && anInt8942 != 255) {
										i_3035_ = i_3039_;
										i_3039_ = is[i_2985_];
										i_3039_ = (((((i_3035_ & 0xff00ff) * anInt8942) + ((i_3039_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3035_ & 0xff00) * anInt8942) + ((i_3039_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_2985_] = i_3039_;
								} else if (i == 2) {
									int i_3040_ = aByteArray11345[i_2984_];
									if (i_3040_ != 0) {
										int i_3041_ = anIntArray11346[i_3040_ & 0xff];
										int i_3042_ = ((i_3041_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_3043_ = ((i_3041_ & 0xff00) * anInt8942 & 0xff0000);
										i_3041_ = (((i_3042_ | i_3043_) >>> 8) + anInt8949);
										int i_3044_ = is[i_2985_];
										int i_3045_ = i_3041_ + i_3044_;
										int i_3046_ = ((i_3041_ & 0xff00ff) + (i_3044_ & 0xff00ff));
										i_3044_ = ((i_3046_ & 0x1000100) + (i_3045_ - i_3046_ & 0x10000));
										is[i_2985_] = (i_3045_ - i_3044_ | i_3044_ - (i_3044_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_2980_ += anInt8940;
							i_2981_ += anInt8938;
						}
						i_2978_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_3047_ = anInt8928;
				while (i_3047_ < 0) {
					int i_3048_ = anInt8930;
					int i_3049_ = anInt8937 + anInt8939;
					int i_3050_ = anInt8936;
					int i_3051_ = anInt8926;
					if (i_3050_ >= 0 && i_3050_ - (anInt8916 << 12) < 0) {
						if (i_3049_ < 0) {
							int i_3052_ = (anInt8940 - 1 - i_3049_) / anInt8940;
							i_3051_ += i_3052_;
							i_3049_ += anInt8940 * i_3052_;
							i_3048_ += i_3052_;
						}
						int i_3053_;
						if ((i_3053_ = (1 + i_3049_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_3051_)
							i_3051_ = i_3053_;
						for (/**/; i_3051_ < 0; i_3051_++) {
							int i_3054_ = ((i_3050_ >> 12) * anInt8914 + (i_3049_ >> 12));
							int i_3055_ = i_3048_++;
							if (i_2632_ == 0) {
								if (i == 1)
									is[i_3055_] = (anIntArray11346[aByteArray11345[i_3054_] & 0xff]);
								else if (i == 0) {
									int i_3056_ = (anIntArray11346[aByteArray11345[i_3054_] & 0xff]);
									int i_3057_ = ((i_3056_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_3058_ = ((i_3056_ & 0xff00) * anInt8945 & 0xff0000);
									int i_3059_ = ((i_3056_ & 0xff) * anInt8946 & 0xff00);
									is[i_3055_] = (i_3057_ | i_3058_ | i_3059_) >>> 8;
								} else if (i == 3) {
									int i_3060_ = (anIntArray11346[aByteArray11345[i_3054_] & 0xff]);
									int i_3061_ = anInt8941;
									int i_3062_ = i_3060_ + i_3061_;
									int i_3063_ = ((i_3060_ & 0xff00ff) + (i_3061_ & 0xff00ff));
									int i_3064_ = ((i_3063_ & 0x1000100) + (i_3062_ - i_3063_ & 0x10000));
									is[i_3055_] = (i_3062_ - i_3064_ | i_3064_ - (i_3064_ >>> 8));
								} else if (i == 2) {
									int i_3065_ = (anIntArray11346[aByteArray11345[i_3054_] & 0xff]);
									int i_3066_ = ((i_3065_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_3067_ = ((i_3065_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_3055_] = (((i_3066_ | i_3067_) >>> 8) + anInt8949);
								} else
									throw new IllegalArgumentException();
							} else if (i_2632_ == 1) {
								if (i == 1) {
									int i_3068_ = aByteArray11345[i_3054_];
									if (i_3068_ != 0)
										is[i_3055_] = anIntArray11346[i_3068_ & 0xff];
								} else if (i == 0) {
									int i_3069_ = aByteArray11345[i_3054_];
									if (i_3069_ != 0) {
										int i_3070_ = anIntArray11346[i_3069_ & 0xff];
										if ((anInt8941 & 0xffffff) == 16777215) {
											int i_3071_ = anInt8941 >>> 24;
											int i_3072_ = 256 - i_3071_;
											int i_3073_ = is[i_3055_];
											is[i_3055_] = (((((i_3070_ & 0xff00ff) * i_3071_) + ((i_3073_ & 0xff00ff) * i_3072_)) & ~0xff00ff) + ((((i_3070_ & 0xff00) * i_3071_) + ((i_3073_ & 0xff00) * i_3072_)) & 0xff0000)) >> 8;
										} else if (anInt8942 != 255) {
											int i_3074_ = (((i_3070_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_3075_ = (((i_3070_ & 0xff00) * anInt8945) & 0xff0000);
											int i_3076_ = ((i_3070_ & 0xff) * anInt8946 & 0xff00);
											i_3070_ = (i_3074_ | i_3075_ | i_3076_) >>> 8;
											int i_3077_ = is[i_3055_];
											is[i_3055_] = (((((i_3070_ & 0xff00ff) * anInt8942) + ((i_3077_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3070_ & 0xff00) * anInt8942) + ((i_3077_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
										} else {
											int i_3078_ = (((i_3070_ & 0xff0000) * anInt8944) & ~0xffffff);
											int i_3079_ = (((i_3070_ & 0xff00) * anInt8945) & 0xff0000);
											int i_3080_ = ((i_3070_ & 0xff) * anInt8946 & 0xff00);
											is[i_3055_] = (i_3078_ | i_3079_ | i_3080_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3081_ = aByteArray11345[i_3054_];
									int i_3082_ = (i_3081_ > 0 ? anIntArray11346[i_3081_] : 0);
									int i_3083_ = anInt8941;
									int i_3084_ = i_3082_ + i_3083_;
									int i_3085_ = ((i_3082_ & 0xff00ff) + (i_3083_ & 0xff00ff));
									int i_3086_ = ((i_3085_ & 0x1000100) + (i_3084_ - i_3085_ & 0x10000));
									i_3086_ = (i_3084_ - i_3086_ | i_3086_ - (i_3086_ >>> 8));
									if (i_3082_ == 0 && anInt8942 != 255) {
										i_3082_ = i_3086_;
										i_3086_ = is[i_3055_];
										i_3086_ = (((((i_3082_ & 0xff00ff) * anInt8942) + ((i_3086_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3082_ & 0xff00) * anInt8942) + ((i_3086_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_3055_] = i_3086_;
								} else if (i == 2) {
									int i_3087_ = aByteArray11345[i_3054_];
									if (i_3087_ != 0) {
										int i_3088_ = anIntArray11346[i_3087_ & 0xff];
										int i_3089_ = ((i_3088_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_3090_ = ((i_3088_ & 0xff00) * anInt8942 & 0xff0000);
										is[i_3055_++] = ((i_3089_ | i_3090_) >>> 8) + anInt8949;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2632_ == 2) {
								if (i == 1) {
									int i_3091_ = aByteArray11345[i_3054_];
									if (i_3091_ != 0) {
										int i_3092_ = anIntArray11346[i_3091_ & 0xff];
										int i_3093_ = is[i_3055_];
										int i_3094_ = i_3092_ + i_3093_;
										int i_3095_ = ((i_3092_ & 0xff00ff) + (i_3093_ & 0xff00ff));
										i_3093_ = ((i_3095_ & 0x1000100) + (i_3094_ - i_3095_ & 0x10000));
										is[i_3055_] = (i_3094_ - i_3093_ | i_3093_ - (i_3093_ >>> 8));
									}
								} else if (i == 0) {
									int i_3096_ = aByteArray11345[i_3054_];
									if (i_3096_ != 0) {
										int i_3097_ = anIntArray11346[i_3096_ & 0xff];
										int i_3098_ = ((i_3097_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_3099_ = ((i_3097_ & 0xff00) * anInt8945 & 0xff0000);
										int i_3100_ = ((i_3097_ & 0xff) * anInt8946 & 0xff00);
										i_3097_ = (i_3098_ | i_3099_ | i_3100_) >>> 8;
										int i_3101_ = is[i_3055_];
										int i_3102_ = i_3097_ + i_3101_;
										int i_3103_ = ((i_3097_ & 0xff00ff) + (i_3101_ & 0xff00ff));
										i_3101_ = ((i_3103_ & 0x1000100) + (i_3102_ - i_3103_ & 0x10000));
										is[i_3055_] = (i_3102_ - i_3101_ | i_3101_ - (i_3101_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3104_ = aByteArray11345[i_3054_];
									int i_3105_ = (i_3104_ > 0 ? anIntArray11346[i_3104_] : 0);
									int i_3106_ = anInt8941;
									int i_3107_ = i_3105_ + i_3106_;
									int i_3108_ = ((i_3105_ & 0xff00ff) + (i_3106_ & 0xff00ff));
									int i_3109_ = ((i_3108_ & 0x1000100) + (i_3107_ - i_3108_ & 0x10000));
									i_3109_ = (i_3107_ - i_3109_ | i_3109_ - (i_3109_ >>> 8));
									if (i_3105_ == 0 && anInt8942 != 255) {
										i_3105_ = i_3109_;
										i_3109_ = is[i_3055_];
										i_3109_ = (((((i_3105_ & 0xff00ff) * anInt8942) + ((i_3109_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3105_ & 0xff00) * anInt8942) + ((i_3109_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									}
									is[i_3055_] = i_3109_;
								} else if (i == 2) {
									int i_3110_ = aByteArray11345[i_3054_];
									if (i_3110_ != 0) {
										int i_3111_ = anIntArray11346[i_3110_ & 0xff];
										int i_3112_ = ((i_3111_ & 0xff00ff) * anInt8942 & ~0xff00ff);
										int i_3113_ = ((i_3111_ & 0xff00) * anInt8942 & 0xff0000);
										i_3111_ = (((i_3112_ | i_3113_) >>> 8) + anInt8949);
										int i_3114_ = is[i_3055_];
										int i_3115_ = i_3111_ + i_3114_;
										int i_3116_ = ((i_3111_ & 0xff00ff) + (i_3114_ & 0xff00ff));
										i_3114_ = ((i_3116_ & 0x1000100) + (i_3115_ - i_3116_ & 0x10000));
										is[i_3055_] = (i_3115_ - i_3114_ | i_3114_ - (i_3114_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3049_ += anInt8940;
						}
					}
					i_3047_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				for (int i_3117_ = anInt8928; i_3117_ < 0; i_3117_++) {
					int i_3118_ = anInt8930;
					int i_3119_ = anInt8937 + anInt8939;
					int i_3120_ = anInt8936 + anInt8925;
					int i_3121_ = anInt8926;
					if (i_3119_ < 0) {
						int i_3122_ = (anInt8940 - 1 - i_3119_) / anInt8940;
						i_3121_ += i_3122_;
						i_3119_ += anInt8940 * i_3122_;
						i_3120_ += anInt8938 * i_3122_;
						i_3118_ += i_3122_;
					}
					int i_3123_;
					if ((i_3123_ = (1 + i_3119_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_3121_)
						i_3121_ = i_3123_;
					if ((i_3123_ = i_3120_ - (anInt8916 << 12)) >= 0) {
						i_3123_ = (anInt8938 - i_3123_) / anInt8938;
						i_3121_ += i_3123_;
						i_3119_ += anInt8940 * i_3123_;
						i_3120_ += anInt8938 * i_3123_;
						i_3118_ += i_3123_;
					}
					if ((i_3123_ = (i_3120_ - anInt8938) / anInt8938) > i_3121_)
						i_3121_ = i_3123_;
					for (/**/; i_3121_ < 0; i_3121_++) {
						int i_3124_ = (i_3120_ >> 12) * anInt8914 + (i_3119_ >> 12);
						int i_3125_ = i_3118_++;
						if (i_2632_ == 0) {
							if (i == 1)
								is[i_3125_] = (anIntArray11346[aByteArray11345[i_3124_] & 0xff]);
							else if (i == 0) {
								int i_3126_ = (anIntArray11346[aByteArray11345[i_3124_] & 0xff]);
								int i_3127_ = ((i_3126_ & 0xff0000) * anInt8944 & ~0xffffff);
								int i_3128_ = ((i_3126_ & 0xff00) * anInt8945 & 0xff0000);
								int i_3129_ = (i_3126_ & 0xff) * anInt8946 & 0xff00;
								is[i_3125_] = (i_3127_ | i_3128_ | i_3129_) >>> 8;
							} else if (i == 3) {
								int i_3130_ = (anIntArray11346[aByteArray11345[i_3124_] & 0xff]);
								int i_3131_ = anInt8941;
								int i_3132_ = i_3130_ + i_3131_;
								int i_3133_ = ((i_3130_ & 0xff00ff) + (i_3131_ & 0xff00ff));
								int i_3134_ = ((i_3133_ & 0x1000100) + (i_3132_ - i_3133_ & 0x10000));
								is[i_3125_] = i_3132_ - i_3134_ | i_3134_ - (i_3134_ >>> 8);
							} else if (i == 2) {
								int i_3135_ = (anIntArray11346[aByteArray11345[i_3124_] & 0xff]);
								int i_3136_ = ((i_3135_ & 0xff00ff) * anInt8942 & ~0xff00ff);
								int i_3137_ = ((i_3135_ & 0xff00) * anInt8942 & 0xff0000);
								is[i_3125_] = ((i_3136_ | i_3137_) >>> 8) + anInt8949;
							} else
								throw new IllegalArgumentException();
						} else if (i_2632_ == 1) {
							if (i == 1) {
								int i_3138_ = aByteArray11345[i_3124_];
								if (i_3138_ != 0)
									is[i_3125_] = anIntArray11346[i_3138_ & 0xff];
							} else if (i == 0) {
								int i_3139_ = aByteArray11345[i_3124_];
								if (i_3139_ != 0) {
									int i_3140_ = anIntArray11346[i_3139_ & 0xff];
									if ((anInt8941 & 0xffffff) == 16777215) {
										int i_3141_ = anInt8941 >>> 24;
										int i_3142_ = 256 - i_3141_;
										int i_3143_ = is[i_3125_];
										is[i_3125_] = ((((i_3140_ & 0xff00ff) * i_3141_ + ((i_3143_ & 0xff00ff) * i_3142_)) & ~0xff00ff) + (((i_3140_ & 0xff00) * i_3141_ + ((i_3143_ & 0xff00) * i_3142_)) & 0xff0000)) >> 8;
									} else if (anInt8942 != 255) {
										int i_3144_ = ((i_3140_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_3145_ = ((i_3140_ & 0xff00) * anInt8945 & 0xff0000);
										int i_3146_ = ((i_3140_ & 0xff) * anInt8946 & 0xff00);
										i_3140_ = (i_3144_ | i_3145_ | i_3146_) >>> 8;
										int i_3147_ = is[i_3125_];
										is[i_3125_] = (((((i_3140_ & 0xff00ff) * anInt8942) + ((i_3147_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3140_ & 0xff00) * anInt8942) + ((i_3147_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									} else {
										int i_3148_ = ((i_3140_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_3149_ = ((i_3140_ & 0xff00) * anInt8945 & 0xff0000);
										int i_3150_ = ((i_3140_ & 0xff) * anInt8946 & 0xff00);
										is[i_3125_] = (i_3148_ | i_3149_ | i_3150_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3151_ = aByteArray11345[i_3124_];
								int i_3152_ = (i_3151_ > 0 ? anIntArray11346[i_3151_] : 0);
								int i_3153_ = anInt8941;
								int i_3154_ = i_3152_ + i_3153_;
								int i_3155_ = ((i_3152_ & 0xff00ff) + (i_3153_ & 0xff00ff));
								int i_3156_ = ((i_3155_ & 0x1000100) + (i_3154_ - i_3155_ & 0x10000));
								i_3156_ = i_3154_ - i_3156_ | i_3156_ - (i_3156_ >>> 8);
								if (i_3152_ == 0 && anInt8942 != 255) {
									i_3152_ = i_3156_;
									i_3156_ = is[i_3125_];
									i_3156_ = ((((i_3152_ & 0xff00ff) * anInt8942 + ((i_3156_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_3152_ & 0xff00) * anInt8942 + ((i_3156_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_3125_] = i_3156_;
							} else if (i == 2) {
								int i_3157_ = aByteArray11345[i_3124_];
								if (i_3157_ != 0) {
									int i_3158_ = anIntArray11346[i_3157_ & 0xff];
									int i_3159_ = ((i_3158_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_3160_ = ((i_3158_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_3125_++] = ((i_3159_ | i_3160_) >>> 8) + anInt8949;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2632_ == 2) {
							if (i == 1) {
								int i_3161_ = aByteArray11345[i_3124_];
								if (i_3161_ != 0) {
									int i_3162_ = anIntArray11346[i_3161_ & 0xff];
									int i_3163_ = is[i_3125_];
									int i_3164_ = i_3162_ + i_3163_;
									int i_3165_ = ((i_3162_ & 0xff00ff) + (i_3163_ & 0xff00ff));
									i_3163_ = ((i_3165_ & 0x1000100) + (i_3164_ - i_3165_ & 0x10000));
									is[i_3125_] = (i_3164_ - i_3163_ | i_3163_ - (i_3163_ >>> 8));
								}
							} else if (i == 0) {
								int i_3166_ = aByteArray11345[i_3124_];
								if (i_3166_ != 0) {
									int i_3167_ = anIntArray11346[i_3166_ & 0xff];
									int i_3168_ = ((i_3167_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_3169_ = ((i_3167_ & 0xff00) * anInt8945 & 0xff0000);
									int i_3170_ = ((i_3167_ & 0xff) * anInt8946 & 0xff00);
									i_3167_ = (i_3168_ | i_3169_ | i_3170_) >>> 8;
									int i_3171_ = is[i_3125_];
									int i_3172_ = i_3167_ + i_3171_;
									int i_3173_ = ((i_3167_ & 0xff00ff) + (i_3171_ & 0xff00ff));
									i_3171_ = ((i_3173_ & 0x1000100) + (i_3172_ - i_3173_ & 0x10000));
									is[i_3125_] = (i_3172_ - i_3171_ | i_3171_ - (i_3171_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3174_ = aByteArray11345[i_3124_];
								int i_3175_ = (i_3174_ > 0 ? anIntArray11346[i_3174_] : 0);
								int i_3176_ = anInt8941;
								int i_3177_ = i_3175_ + i_3176_;
								int i_3178_ = ((i_3175_ & 0xff00ff) + (i_3176_ & 0xff00ff));
								int i_3179_ = ((i_3178_ & 0x1000100) + (i_3177_ - i_3178_ & 0x10000));
								i_3179_ = i_3177_ - i_3179_ | i_3179_ - (i_3179_ >>> 8);
								if (i_3175_ == 0 && anInt8942 != 255) {
									i_3175_ = i_3179_;
									i_3179_ = is[i_3125_];
									i_3179_ = ((((i_3175_ & 0xff00ff) * anInt8942 + ((i_3179_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_3175_ & 0xff00) * anInt8942 + ((i_3179_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_3125_] = i_3179_;
							} else if (i == 2) {
								int i_3180_ = aByteArray11345[i_3124_];
								if (i_3180_ != 0) {
									int i_3181_ = anIntArray11346[i_3180_ & 0xff];
									int i_3182_ = ((i_3181_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_3183_ = ((i_3181_ & 0xff00) * anInt8942 & 0xff0000);
									i_3181_ = (((i_3182_ | i_3183_) >>> 8) + anInt8949);
									int i_3184_ = is[i_3125_];
									int i_3185_ = i_3181_ + i_3184_;
									int i_3186_ = ((i_3181_ & 0xff00ff) + (i_3184_ & 0xff00ff));
									i_3184_ = ((i_3186_ & 0x1000100) + (i_3185_ - i_3186_ & 0x10000));
									is[i_3125_] = (i_3185_ - i_3184_ | i_3184_ - (i_3184_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3119_ += anInt8940;
						i_3120_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				for (int i_3187_ = anInt8928; i_3187_ < 0; i_3187_++) {
					int i_3188_ = anInt8930;
					int i_3189_ = anInt8937 + anInt8939;
					int i_3190_ = anInt8936 + anInt8925;
					int i_3191_ = anInt8926;
					if (i_3189_ < 0) {
						int i_3192_ = (anInt8940 - 1 - i_3189_) / anInt8940;
						i_3191_ += i_3192_;
						i_3189_ += anInt8940 * i_3192_;
						i_3190_ += anInt8938 * i_3192_;
						i_3188_ += i_3192_;
					}
					int i_3193_;
					if ((i_3193_ = (1 + i_3189_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_3191_)
						i_3191_ = i_3193_;
					if (i_3190_ < 0) {
						i_3193_ = (anInt8938 - 1 - i_3190_) / anInt8938;
						i_3191_ += i_3193_;
						i_3189_ += anInt8940 * i_3193_;
						i_3190_ += anInt8938 * i_3193_;
						i_3188_ += i_3193_;
					}
					if ((i_3193_ = (1 + i_3190_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_3191_)
						i_3191_ = i_3193_;
					for (/**/; i_3191_ < 0; i_3191_++) {
						int i_3194_ = (i_3190_ >> 12) * anInt8914 + (i_3189_ >> 12);
						int i_3195_ = i_3188_++;
						if (i_2632_ == 0) {
							if (i == 1)
								is[i_3195_] = (anIntArray11346[aByteArray11345[i_3194_] & 0xff]);
							else if (i == 0) {
								int i_3196_ = (anIntArray11346[aByteArray11345[i_3194_] & 0xff]);
								int i_3197_ = ((i_3196_ & 0xff0000) * anInt8944 & ~0xffffff);
								int i_3198_ = ((i_3196_ & 0xff00) * anInt8945 & 0xff0000);
								int i_3199_ = (i_3196_ & 0xff) * anInt8946 & 0xff00;
								is[i_3195_] = (i_3197_ | i_3198_ | i_3199_) >>> 8;
							} else if (i == 3) {
								int i_3200_ = (anIntArray11346[aByteArray11345[i_3194_] & 0xff]);
								int i_3201_ = anInt8941;
								int i_3202_ = i_3200_ + i_3201_;
								int i_3203_ = ((i_3200_ & 0xff00ff) + (i_3201_ & 0xff00ff));
								int i_3204_ = ((i_3203_ & 0x1000100) + (i_3202_ - i_3203_ & 0x10000));
								is[i_3195_] = i_3202_ - i_3204_ | i_3204_ - (i_3204_ >>> 8);
							} else if (i == 2) {
								int i_3205_ = (anIntArray11346[aByteArray11345[i_3194_] & 0xff]);
								int i_3206_ = ((i_3205_ & 0xff00ff) * anInt8942 & ~0xff00ff);
								int i_3207_ = ((i_3205_ & 0xff00) * anInt8942 & 0xff0000);
								is[i_3195_] = ((i_3206_ | i_3207_) >>> 8) + anInt8949;
							} else
								throw new IllegalArgumentException();
						} else if (i_2632_ == 1) {
							if (i == 1) {
								int i_3208_ = aByteArray11345[i_3194_];
								if (i_3208_ != 0)
									is[i_3195_] = anIntArray11346[i_3208_ & 0xff];
							} else if (i == 0) {
								int i_3209_ = aByteArray11345[i_3194_];
								if (i_3209_ != 0) {
									int i_3210_ = anIntArray11346[i_3209_ & 0xff];
									if ((anInt8941 & 0xffffff) == 16777215) {
										int i_3211_ = anInt8941 >>> 24;
										int i_3212_ = 256 - i_3211_;
										int i_3213_ = is[i_3195_];
										is[i_3195_] = ((((i_3210_ & 0xff00ff) * i_3211_ + ((i_3213_ & 0xff00ff) * i_3212_)) & ~0xff00ff) + (((i_3210_ & 0xff00) * i_3211_ + ((i_3213_ & 0xff00) * i_3212_)) & 0xff0000)) >> 8;
									} else if (anInt8942 != 255) {
										int i_3214_ = ((i_3210_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_3215_ = ((i_3210_ & 0xff00) * anInt8945 & 0xff0000);
										int i_3216_ = ((i_3210_ & 0xff) * anInt8946 & 0xff00);
										i_3210_ = (i_3214_ | i_3215_ | i_3216_) >>> 8;
										int i_3217_ = is[i_3195_];
										is[i_3195_] = (((((i_3210_ & 0xff00ff) * anInt8942) + ((i_3217_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + ((((i_3210_ & 0xff00) * anInt8942) + ((i_3217_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
									} else {
										int i_3218_ = ((i_3210_ & 0xff0000) * anInt8944 & ~0xffffff);
										int i_3219_ = ((i_3210_ & 0xff00) * anInt8945 & 0xff0000);
										int i_3220_ = ((i_3210_ & 0xff) * anInt8946 & 0xff00);
										is[i_3195_] = (i_3218_ | i_3219_ | i_3220_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3221_ = aByteArray11345[i_3194_];
								int i_3222_ = (i_3221_ > 0 ? anIntArray11346[i_3221_] : 0);
								int i_3223_ = anInt8941;
								int i_3224_ = i_3222_ + i_3223_;
								int i_3225_ = ((i_3222_ & 0xff00ff) + (i_3223_ & 0xff00ff));
								int i_3226_ = ((i_3225_ & 0x1000100) + (i_3224_ - i_3225_ & 0x10000));
								i_3226_ = i_3224_ - i_3226_ | i_3226_ - (i_3226_ >>> 8);
								if (i_3222_ == 0 && anInt8942 != 255) {
									i_3222_ = i_3226_;
									i_3226_ = is[i_3195_];
									i_3226_ = ((((i_3222_ & 0xff00ff) * anInt8942 + ((i_3226_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_3222_ & 0xff00) * anInt8942 + ((i_3226_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_3195_] = i_3226_;
							} else if (i == 2) {
								int i_3227_ = aByteArray11345[i_3194_];
								if (i_3227_ != 0) {
									int i_3228_ = anIntArray11346[i_3227_ & 0xff];
									int i_3229_ = ((i_3228_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_3230_ = ((i_3228_ & 0xff00) * anInt8942 & 0xff0000);
									is[i_3195_++] = ((i_3229_ | i_3230_) >>> 8) + anInt8949;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2632_ == 2) {
							if (i == 1) {
								int i_3231_ = aByteArray11345[i_3194_];
								if (i_3231_ != 0) {
									int i_3232_ = anIntArray11346[i_3231_ & 0xff];
									int i_3233_ = is[i_3195_];
									int i_3234_ = i_3232_ + i_3233_;
									int i_3235_ = ((i_3232_ & 0xff00ff) + (i_3233_ & 0xff00ff));
									i_3233_ = ((i_3235_ & 0x1000100) + (i_3234_ - i_3235_ & 0x10000));
									is[i_3195_] = (i_3234_ - i_3233_ | i_3233_ - (i_3233_ >>> 8));
								}
							} else if (i == 0) {
								int i_3236_ = aByteArray11345[i_3194_];
								if (i_3236_ != 0) {
									int i_3237_ = anIntArray11346[i_3236_ & 0xff];
									int i_3238_ = ((i_3237_ & 0xff0000) * anInt8944 & ~0xffffff);
									int i_3239_ = ((i_3237_ & 0xff00) * anInt8945 & 0xff0000);
									int i_3240_ = ((i_3237_ & 0xff) * anInt8946 & 0xff00);
									i_3237_ = (i_3238_ | i_3239_ | i_3240_) >>> 8;
									int i_3241_ = is[i_3195_];
									int i_3242_ = i_3237_ + i_3241_;
									int i_3243_ = ((i_3237_ & 0xff00ff) + (i_3241_ & 0xff00ff));
									i_3241_ = ((i_3243_ & 0x1000100) + (i_3242_ - i_3243_ & 0x10000));
									is[i_3195_] = (i_3242_ - i_3241_ | i_3241_ - (i_3241_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3244_ = aByteArray11345[i_3194_];
								int i_3245_ = (i_3244_ > 0 ? anIntArray11346[i_3244_] : 0);
								int i_3246_ = anInt8941;
								int i_3247_ = i_3245_ + i_3246_;
								int i_3248_ = ((i_3245_ & 0xff00ff) + (i_3246_ & 0xff00ff));
								int i_3249_ = ((i_3248_ & 0x1000100) + (i_3247_ - i_3248_ & 0x10000));
								i_3249_ = i_3247_ - i_3249_ | i_3249_ - (i_3249_ >>> 8);
								if (i_3245_ == 0 && anInt8942 != 255) {
									i_3245_ = i_3249_;
									i_3249_ = is[i_3195_];
									i_3249_ = ((((i_3245_ & 0xff00ff) * anInt8942 + ((i_3249_ & 0xff00ff) * anInt8943)) & ~0xff00ff) + (((i_3245_ & 0xff00) * anInt8942 + ((i_3249_ & 0xff00) * anInt8943)) & 0xff0000)) >> 8;
								}
								is[i_3195_] = i_3249_;
							} else if (i == 2) {
								int i_3250_ = aByteArray11345[i_3194_];
								if (i_3250_ != 0) {
									int i_3251_ = anIntArray11346[i_3250_ & 0xff];
									int i_3252_ = ((i_3251_ & 0xff00ff) * anInt8942 & ~0xff00ff);
									int i_3253_ = ((i_3251_ & 0xff00) * anInt8942 & 0xff0000);
									i_3251_ = (((i_3252_ | i_3253_) >>> 8) + anInt8949);
									int i_3254_ = is[i_3195_];
									int i_3255_ = i_3251_ + i_3254_;
									int i_3256_ = ((i_3251_ & 0xff00ff) + (i_3254_ & 0xff00ff));
									i_3254_ = ((i_3256_ & 0x1000100) + (i_3255_ - i_3256_ & 0x10000));
									is[i_3195_] = (i_3255_ - i_3254_ | i_3254_ - (i_3254_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3189_ += anInt8940;
						i_3190_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	void method14409(int[] is, int[] is_3257_, int i, int i_3258_) {
		int[] is_3259_ = aClass178_Sub3_8923.anIntArray9804;
		if (is_3259_ != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_3260_ = anInt8928;
					while (i_3260_ < 0) {
						int i_3261_ = i_3260_ + i_3258_;
						if (i_3261_ >= 0) {
							if (i_3261_ >= is.length)
								break;
							int i_3262_ = anInt8930;
							int i_3263_ = anInt8937;
							int i_3264_ = anInt8936;
							int i_3265_ = anInt8926;
							if (i_3263_ >= 0 && i_3264_ >= 0 && i_3263_ - (anInt8914 << 12) < 0 && i_3264_ - (anInt8916 << 12) < 0) {
								int i_3266_ = is[i_3261_] - i;
								int i_3267_ = -is_3257_[i_3261_];
								int i_3268_ = i_3266_ - (i_3262_ - anInt8930);
								if (i_3268_ > 0) {
									i_3262_ += i_3268_;
									i_3265_ += i_3268_;
									i_3263_ += anInt8940 * i_3268_;
									i_3264_ += anInt8938 * i_3268_;
								} else
									i_3267_ -= i_3268_;
								if (i_3265_ < i_3267_)
									i_3265_ = i_3267_;
								for (/**/; i_3265_ < 0; i_3265_++) {
									int i_3269_ = (aByteArray11345[((i_3264_ >> 12) * anInt8914 + (i_3263_ >> 12))]);
									if (i_3269_ != 0)
										is_3259_[i_3262_++] = anIntArray11346[i_3269_ & 0xff];
									else
										i_3262_++;
								}
							}
						}
						i_3260_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_3270_ = anInt8928;
					while (i_3270_ < 0) {
						int i_3271_ = i_3270_ + i_3258_;
						if (i_3271_ >= 0) {
							if (i_3271_ >= is.length)
								break;
							int i_3272_ = anInt8930;
							int i_3273_ = anInt8937;
							int i_3274_ = anInt8936 + anInt8925;
							int i_3275_ = anInt8926;
							if (i_3273_ >= 0 && i_3273_ - (anInt8914 << 12) < 0) {
								int i_3276_;
								if ((i_3276_ = i_3274_ - (anInt8916 << 12)) >= 0) {
									i_3276_ = (anInt8938 - i_3276_) / anInt8938;
									i_3275_ += i_3276_;
									i_3274_ += anInt8938 * i_3276_;
									i_3272_ += i_3276_;
								}
								if ((i_3276_ = (i_3274_ - anInt8938) / anInt8938) > i_3275_)
									i_3275_ = i_3276_;
								int i_3277_ = is[i_3271_] - i;
								int i_3278_ = -is_3257_[i_3271_];
								int i_3279_ = i_3277_ - (i_3272_ - anInt8930);
								if (i_3279_ > 0) {
									i_3272_ += i_3279_;
									i_3275_ += i_3279_;
									i_3273_ += anInt8940 * i_3279_;
									i_3274_ += anInt8938 * i_3279_;
								} else
									i_3278_ -= i_3279_;
								if (i_3275_ < i_3278_)
									i_3275_ = i_3278_;
								for (/**/; i_3275_ < 0; i_3275_++) {
									int i_3280_ = (aByteArray11345[((i_3274_ >> 12) * anInt8914 + (i_3273_ >> 12))]);
									if (i_3280_ != 0)
										is_3259_[i_3272_++] = anIntArray11346[i_3280_ & 0xff];
									else
										i_3272_++;
									i_3274_ += anInt8938;
								}
							}
						}
						i_3270_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_3281_ = anInt8928;
					while (i_3281_ < 0) {
						int i_3282_ = i_3281_ + i_3258_;
						if (i_3282_ >= 0) {
							if (i_3282_ >= is.length)
								break;
							int i_3283_ = anInt8930;
							int i_3284_ = anInt8937;
							int i_3285_ = anInt8936 + anInt8925;
							int i_3286_ = anInt8926;
							if (i_3284_ >= 0 && i_3284_ - (anInt8914 << 12) < 0) {
								if (i_3285_ < 0) {
									int i_3287_ = ((anInt8938 - 1 - i_3285_) / anInt8938);
									i_3286_ += i_3287_;
									i_3285_ += anInt8938 * i_3287_;
									i_3283_ += i_3287_;
								}
								int i_3288_;
								if ((i_3288_ = (1 + i_3285_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_3286_)
									i_3286_ = i_3288_;
								int i_3289_ = is[i_3282_] - i;
								int i_3290_ = -is_3257_[i_3282_];
								int i_3291_ = i_3289_ - (i_3283_ - anInt8930);
								if (i_3291_ > 0) {
									i_3283_ += i_3291_;
									i_3286_ += i_3291_;
									i_3284_ += anInt8940 * i_3291_;
									i_3285_ += anInt8938 * i_3291_;
								} else
									i_3290_ -= i_3291_;
								if (i_3286_ < i_3290_)
									i_3286_ = i_3290_;
								for (/**/; i_3286_ < 0; i_3286_++) {
									int i_3292_ = (aByteArray11345[((i_3285_ >> 12) * anInt8914 + (i_3284_ >> 12))]);
									if (i_3292_ != 0)
										is_3259_[i_3283_++] = anIntArray11346[i_3292_ & 0xff];
									else
										i_3283_++;
									i_3285_ += anInt8938;
								}
							}
						}
						i_3281_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_3293_ = anInt8928;
					while (i_3293_ < 0) {
						int i_3294_ = i_3293_ + i_3258_;
						if (i_3294_ >= 0) {
							if (i_3294_ >= is.length)
								break;
							int i_3295_ = anInt8930;
							int i_3296_ = anInt8937 + anInt8939;
							int i_3297_ = anInt8936;
							int i_3298_ = anInt8926;
							if (i_3297_ >= 0 && i_3297_ - (anInt8916 << 12) < 0) {
								int i_3299_;
								if ((i_3299_ = i_3296_ - (anInt8914 << 12)) >= 0) {
									i_3299_ = (anInt8940 - i_3299_) / anInt8940;
									i_3298_ += i_3299_;
									i_3296_ += anInt8940 * i_3299_;
									i_3295_ += i_3299_;
								}
								if ((i_3299_ = (i_3296_ - anInt8940) / anInt8940) > i_3298_)
									i_3298_ = i_3299_;
								int i_3300_ = is[i_3294_] - i;
								int i_3301_ = -is_3257_[i_3294_];
								int i_3302_ = i_3300_ - (i_3295_ - anInt8930);
								if (i_3302_ > 0) {
									i_3295_ += i_3302_;
									i_3298_ += i_3302_;
									i_3296_ += anInt8940 * i_3302_;
									i_3297_ += anInt8938 * i_3302_;
								} else
									i_3301_ -= i_3302_;
								if (i_3298_ < i_3301_)
									i_3298_ = i_3301_;
								for (/**/; i_3298_ < 0; i_3298_++) {
									int i_3303_ = (aByteArray11345[((i_3297_ >> 12) * anInt8914 + (i_3296_ >> 12))]);
									if (i_3303_ != 0)
										is_3259_[i_3295_++] = anIntArray11346[i_3303_ & 0xff];
									else
										i_3295_++;
									i_3296_ += anInt8940;
								}
							}
						}
						i_3293_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_3304_ = anInt8928;
					while (i_3304_ < 0) {
						int i_3305_ = i_3304_ + i_3258_;
						if (i_3305_ >= 0) {
							if (i_3305_ >= is.length)
								break;
							int i_3306_ = anInt8930;
							int i_3307_ = anInt8937 + anInt8939;
							int i_3308_ = anInt8936 + anInt8925;
							int i_3309_ = anInt8926;
							int i_3310_;
							if ((i_3310_ = i_3307_ - (anInt8914 << 12)) >= 0) {
								i_3310_ = (anInt8940 - i_3310_) / anInt8940;
								i_3309_ += i_3310_;
								i_3307_ += anInt8940 * i_3310_;
								i_3308_ += anInt8938 * i_3310_;
								i_3306_ += i_3310_;
							}
							if ((i_3310_ = (i_3307_ - anInt8940) / anInt8940) > i_3309_)
								i_3309_ = i_3310_;
							if ((i_3310_ = i_3308_ - (anInt8916 << 12)) >= 0) {
								i_3310_ = (anInt8938 - i_3310_) / anInt8938;
								i_3309_ += i_3310_;
								i_3307_ += anInt8940 * i_3310_;
								i_3308_ += anInt8938 * i_3310_;
								i_3306_ += i_3310_;
							}
							if ((i_3310_ = (i_3308_ - anInt8938) / anInt8938) > i_3309_)
								i_3309_ = i_3310_;
							int i_3311_ = is[i_3305_] - i;
							int i_3312_ = -is_3257_[i_3305_];
							int i_3313_ = i_3311_ - (i_3306_ - anInt8930);
							if (i_3313_ > 0) {
								i_3306_ += i_3313_;
								i_3309_ += i_3313_;
								i_3307_ += anInt8940 * i_3313_;
								i_3308_ += anInt8938 * i_3313_;
							} else
								i_3312_ -= i_3313_;
							if (i_3309_ < i_3312_)
								i_3309_ = i_3312_;
							for (/**/; i_3309_ < 0; i_3309_++) {
								int i_3314_ = (aByteArray11345[((i_3308_ >> 12) * anInt8914 + (i_3307_ >> 12))]);
								if (i_3314_ != 0)
									is_3259_[i_3306_++] = anIntArray11346[i_3314_ & 0xff];
								else
									i_3306_++;
								i_3307_ += anInt8940;
								i_3308_ += anInt8938;
							}
						}
						i_3304_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_3315_ = anInt8928;
					while (i_3315_ < 0) {
						int i_3316_ = i_3315_ + i_3258_;
						if (i_3316_ >= 0) {
							if (i_3316_ >= is.length)
								break;
							int i_3317_ = anInt8930;
							int i_3318_ = anInt8937 + anInt8939;
							int i_3319_ = anInt8936 + anInt8925;
							int i_3320_ = anInt8926;
							int i_3321_;
							if ((i_3321_ = i_3318_ - (anInt8914 << 12)) >= 0) {
								i_3321_ = (anInt8940 - i_3321_) / anInt8940;
								i_3320_ += i_3321_;
								i_3318_ += anInt8940 * i_3321_;
								i_3319_ += anInt8938 * i_3321_;
								i_3317_ += i_3321_;
							}
							if ((i_3321_ = (i_3318_ - anInt8940) / anInt8940) > i_3320_)
								i_3320_ = i_3321_;
							if (i_3319_ < 0) {
								i_3321_ = (anInt8938 - 1 - i_3319_) / anInt8938;
								i_3320_ += i_3321_;
								i_3318_ += anInt8940 * i_3321_;
								i_3319_ += anInt8938 * i_3321_;
								i_3317_ += i_3321_;
							}
							if ((i_3321_ = (1 + i_3319_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_3320_)
								i_3320_ = i_3321_;
							int i_3322_ = is[i_3316_] - i;
							int i_3323_ = -is_3257_[i_3316_];
							int i_3324_ = i_3322_ - (i_3317_ - anInt8930);
							if (i_3324_ > 0) {
								i_3317_ += i_3324_;
								i_3320_ += i_3324_;
								i_3318_ += anInt8940 * i_3324_;
								i_3319_ += anInt8938 * i_3324_;
							} else
								i_3323_ -= i_3324_;
							if (i_3320_ < i_3323_)
								i_3320_ = i_3323_;
							for (/**/; i_3320_ < 0; i_3320_++) {
								int i_3325_ = (aByteArray11345[((i_3319_ >> 12) * anInt8914 + (i_3318_ >> 12))]);
								if (i_3325_ != 0)
									is_3259_[i_3317_++] = anIntArray11346[i_3325_ & 0xff];
								else
									i_3317_++;
								i_3318_ += anInt8940;
								i_3319_ += anInt8938;
							}
						}
						i_3315_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_3326_ = anInt8928;
				while (i_3326_ < 0) {
					int i_3327_ = i_3326_ + i_3258_;
					if (i_3327_ >= 0) {
						if (i_3327_ >= is.length)
							break;
						int i_3328_ = anInt8930;
						int i_3329_ = anInt8937 + anInt8939;
						int i_3330_ = anInt8936;
						int i_3331_ = anInt8926;
						if (i_3330_ >= 0 && i_3330_ - (anInt8916 << 12) < 0) {
							if (i_3329_ < 0) {
								int i_3332_ = (anInt8940 - 1 - i_3329_) / anInt8940;
								i_3331_ += i_3332_;
								i_3329_ += anInt8940 * i_3332_;
								i_3328_ += i_3332_;
							}
							int i_3333_;
							if ((i_3333_ = (1 + i_3329_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_3331_)
								i_3331_ = i_3333_;
							int i_3334_ = is[i_3327_] - i;
							int i_3335_ = -is_3257_[i_3327_];
							int i_3336_ = i_3334_ - (i_3328_ - anInt8930);
							if (i_3336_ > 0) {
								i_3328_ += i_3336_;
								i_3331_ += i_3336_;
								i_3329_ += anInt8940 * i_3336_;
								i_3330_ += anInt8938 * i_3336_;
							} else
								i_3335_ -= i_3336_;
							if (i_3331_ < i_3335_)
								i_3331_ = i_3335_;
							for (/**/; i_3331_ < 0; i_3331_++) {
								int i_3337_ = (aByteArray11345[((i_3330_ >> 12) * anInt8914 + (i_3329_ >> 12))]);
								if (i_3337_ != 0)
									is_3259_[i_3328_++] = anIntArray11346[i_3337_ & 0xff];
								else
									i_3328_++;
								i_3329_ += anInt8940;
							}
						}
					}
					i_3326_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				int i_3338_ = anInt8928;
				while (i_3338_ < 0) {
					int i_3339_ = i_3338_ + i_3258_;
					if (i_3339_ >= 0) {
						if (i_3339_ >= is.length)
							break;
						int i_3340_ = anInt8930;
						int i_3341_ = anInt8937 + anInt8939;
						int i_3342_ = anInt8936 + anInt8925;
						int i_3343_ = anInt8926;
						if (i_3341_ < 0) {
							int i_3344_ = (anInt8940 - 1 - i_3341_) / anInt8940;
							i_3343_ += i_3344_;
							i_3341_ += anInt8940 * i_3344_;
							i_3342_ += anInt8938 * i_3344_;
							i_3340_ += i_3344_;
						}
						int i_3345_;
						if ((i_3345_ = (1 + i_3341_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_3343_)
							i_3343_ = i_3345_;
						if ((i_3345_ = i_3342_ - (anInt8916 << 12)) >= 0) {
							i_3345_ = (anInt8938 - i_3345_) / anInt8938;
							i_3343_ += i_3345_;
							i_3341_ += anInt8940 * i_3345_;
							i_3342_ += anInt8938 * i_3345_;
							i_3340_ += i_3345_;
						}
						if ((i_3345_ = (i_3342_ - anInt8938) / anInt8938) > i_3343_)
							i_3343_ = i_3345_;
						int i_3346_ = is[i_3339_] - i;
						int i_3347_ = -is_3257_[i_3339_];
						int i_3348_ = i_3346_ - (i_3340_ - anInt8930);
						if (i_3348_ > 0) {
							i_3340_ += i_3348_;
							i_3343_ += i_3348_;
							i_3341_ += anInt8940 * i_3348_;
							i_3342_ += anInt8938 * i_3348_;
						} else
							i_3347_ -= i_3348_;
						if (i_3343_ < i_3347_)
							i_3343_ = i_3347_;
						for (/**/; i_3343_ < 0; i_3343_++) {
							int i_3349_ = (aByteArray11345[(i_3342_ >> 12) * anInt8914 + (i_3341_ >> 12)]);
							if (i_3349_ != 0)
								is_3259_[i_3340_++] = anIntArray11346[i_3349_ & 0xff];
							else
								i_3340_++;
							i_3341_ += anInt8940;
							i_3342_ += anInt8938;
						}
					}
					i_3338_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				int i_3350_ = anInt8928;
				while (i_3350_ < 0) {
					int i_3351_ = i_3350_ + i_3258_;
					if (i_3351_ >= 0) {
						if (i_3351_ >= is.length)
							break;
						int i_3352_ = anInt8930;
						int i_3353_ = anInt8937 + anInt8939;
						int i_3354_ = anInt8936 + anInt8925;
						int i_3355_ = anInt8926;
						if (i_3353_ < 0) {
							int i_3356_ = (anInt8940 - 1 - i_3353_) / anInt8940;
							i_3355_ += i_3356_;
							i_3353_ += anInt8940 * i_3356_;
							i_3354_ += anInt8938 * i_3356_;
							i_3352_ += i_3356_;
						}
						int i_3357_;
						if ((i_3357_ = (1 + i_3353_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_3355_)
							i_3355_ = i_3357_;
						if (i_3354_ < 0) {
							i_3357_ = (anInt8938 - 1 - i_3354_) / anInt8938;
							i_3355_ += i_3357_;
							i_3353_ += anInt8940 * i_3357_;
							i_3354_ += anInt8938 * i_3357_;
							i_3352_ += i_3357_;
						}
						if ((i_3357_ = (1 + i_3354_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_3355_)
							i_3355_ = i_3357_;
						int i_3358_ = is[i_3351_] - i;
						int i_3359_ = -is_3257_[i_3351_];
						int i_3360_ = i_3358_ - (i_3352_ - anInt8930);
						if (i_3360_ > 0) {
							i_3352_ += i_3360_;
							i_3355_ += i_3360_;
							i_3353_ += anInt8940 * i_3360_;
							i_3354_ += anInt8938 * i_3360_;
						} else
							i_3359_ -= i_3360_;
						if (i_3355_ < i_3359_)
							i_3355_ = i_3359_;
						for (/**/; i_3355_ < 0; i_3355_++) {
							int i_3361_ = (aByteArray11345[(i_3354_ >> 12) * anInt8914 + (i_3353_ >> 12)]);
							if (i_3361_ != 0)
								is_3259_[i_3352_++] = anIntArray11346[i_3361_ & 0xff];
							else
								i_3352_++;
							i_3353_ += anInt8940;
							i_3354_ += anInt8938;
						}
					}
					i_3350_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public void method2441(int i, int i_3362_, int i_3363_, int i_3364_, int[] is, int[] is_3365_, int i_3366_, int i_3367_) {
		throw new IllegalStateException();
	}

	void method14403(boolean bool, boolean bool_3368_, boolean bool_3369_, int i, int i_3370_, float f, int i_3371_, int i_3372_, int i_3373_, int i_3374_, int i_3375_, int i_3376_, boolean bool_3377_) {
		if (i_3371_ > 0 && i_3372_ > 0 && (bool || bool_3368_)) {
			int i_3378_ = 0;
			int i_3379_ = 0;
			int i_3380_ = anInt8921 + anInt8914 + anInt8919;
			int i_3381_ = anInt8918 + anInt8916 + anInt8920;
			int i_3382_ = (i_3380_ << 16) / i_3371_;
			int i_3383_ = (i_3381_ << 16) / i_3372_;
			if (anInt8921 > 0) {
				int i_3384_ = ((anInt8921 << 16) + i_3382_ - 1) / i_3382_;
				i += i_3384_;
				i_3378_ += i_3384_ * i_3382_ - (anInt8921 << 16);
			}
			if (anInt8918 > 0) {
				int i_3385_ = ((anInt8918 << 16) + i_3383_ - 1) / i_3383_;
				i_3370_ += i_3385_;
				i_3379_ += i_3385_ * i_3383_ - (anInt8918 << 16);
			}
			if (anInt8914 < i_3380_)
				i_3371_ = ((anInt8914 << 16) - i_3378_ + i_3382_ - 1) / i_3382_;
			if (anInt8916 < i_3381_)
				i_3372_ = ((anInt8916 << 16) - i_3379_ + i_3383_ - 1) / i_3383_;
			int i_3386_ = i + i_3370_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
			int i_3387_ = aClass178_Sub3_8923.anInt9825 * 1013077751 - i_3371_;
			if (i_3370_ + i_3372_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_3372_ -= (i_3370_ + i_3372_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i_3370_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_3388_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_3370_;
				i_3372_ -= i_3388_;
				i_3386_ += i_3388_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
				i_3379_ += i_3383_ * i_3388_;
			}
			if (i + i_3371_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_3389_ = i + i_3371_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_3371_ -= i_3389_;
				i_3387_ += i_3389_;
			}
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_3390_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_3371_ -= i_3390_;
				i_3386_ += i_3390_;
				i_3378_ += i_3382_ * i_3390_;
				i_3387_ += i_3390_;
			}
			float[] fs = aClass178_Sub3_8923.aFloatArray9807;
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (i_3375_ == 0) {
				if (i_3373_ == 1) {
					int i_3391_ = i_3378_;
					for (int i_3392_ = -i_3372_; i_3392_ < 0; i_3392_++) {
						int i_3393_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3394_ = -i_3371_; i_3394_ < 0; i_3394_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								if (bool)
									is[i_3386_] = (anIntArray11346[((aByteArray11345[(i_3378_ >> 16) + i_3393_]) & 0xff)]);
								if (bool_3368_ && bool_3377_)
									fs[i_3386_] = f;
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3391_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 0) {
					int i_3395_ = (i_3374_ & 0xff0000) >> 16;
					int i_3396_ = (i_3374_ & 0xff00) >> 8;
					int i_3397_ = i_3374_ & 0xff;
					int i_3398_ = i_3378_;
					for (int i_3399_ = -i_3372_; i_3399_ < 0; i_3399_++) {
						int i_3400_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3401_ = -i_3371_; i_3401_ < 0; i_3401_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								if (bool) {
									int i_3402_ = (anIntArray11346[((aByteArray11345[(i_3378_ >> 16) + i_3400_]) & 0xff)]);
									int i_3403_ = ((i_3402_ & 0xff0000) * i_3395_ & ~0xffffff);
									int i_3404_ = ((i_3402_ & 0xff00) * i_3396_ & 0xff0000);
									int i_3405_ = (i_3402_ & 0xff) * i_3397_ & 0xff00;
									is[i_3386_] = (i_3403_ | i_3404_ | i_3405_) >>> 8;
								}
								if (bool_3368_ && bool_3377_)
									fs[i_3386_] = f;
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3398_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 3) {
					int i_3406_ = i_3378_;
					for (int i_3407_ = -i_3372_; i_3407_ < 0; i_3407_++) {
						int i_3408_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3409_ = -i_3371_; i_3409_ < 0; i_3409_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								if (bool) {
									byte i_3410_ = (aByteArray11345[(i_3378_ >> 16) + i_3408_]);
									int i_3411_ = (i_3410_ > 0 ? anIntArray11346[i_3410_] : 0);
									int i_3412_ = i_3411_ + i_3374_;
									int i_3413_ = ((i_3411_ & 0xff00ff) + (i_3374_ & 0xff00ff));
									int i_3414_ = ((i_3413_ & 0x1000100) + (i_3412_ - i_3413_ & 0x10000));
									is[i_3386_] = (i_3412_ - i_3414_ | i_3414_ - (i_3414_ >>> 8));
								}
								if (bool_3368_ && bool_3377_)
									fs[i_3386_] = f;
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3406_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 2) {
					int i_3415_ = i_3374_ >>> 24;
					int i_3416_ = 256 - i_3415_;
					int i_3417_ = (i_3374_ & 0xff00ff) * i_3416_ & ~0xff00ff;
					int i_3418_ = (i_3374_ & 0xff00) * i_3416_ & 0xff0000;
					i_3374_ = (i_3417_ | i_3418_) >>> 8;
					int i_3419_ = i_3378_;
					for (int i_3420_ = -i_3372_; i_3420_ < 0; i_3420_++) {
						int i_3421_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3422_ = -i_3371_; i_3422_ < 0; i_3422_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								if (bool) {
									int i_3423_ = (anIntArray11346[((aByteArray11345[(i_3378_ >> 16) + i_3421_]) & 0xff)]);
									i_3417_ = ((i_3423_ & 0xff00ff) * i_3415_ & ~0xff00ff);
									i_3418_ = ((i_3423_ & 0xff00) * i_3415_ & 0xff0000);
									is[i_3386_] = (((i_3417_ | i_3418_) >>> 8) + i_3374_);
								}
								if (bool_3368_ && bool_3377_)
									fs[i_3386_] = f;
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3419_;
						i_3386_ += i_3387_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3375_ == 1) {
				if (i_3373_ == 1) {
					int i_3424_ = i_3378_;
					for (int i_3425_ = -i_3372_; i_3425_ < 0; i_3425_++) {
						int i_3426_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3427_ = -i_3371_; i_3427_ < 0; i_3427_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								int i_3428_ = (aByteArray11345[(i_3378_ >> 16) + i_3426_]);
								if (i_3428_ != 0) {
									if (bool)
										is[i_3386_] = anIntArray11346[i_3428_ & 0xff];
									if (bool_3368_ && bool_3377_)
										fs[i_3386_] = f;
								}
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3424_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 0) {
					int i_3429_ = i_3378_;
					if ((i_3374_ & 0xffffff) == 16777215) {
						int i_3430_ = i_3374_ >>> 24;
						int i_3431_ = 256 - i_3430_;
						for (int i_3432_ = -i_3372_; i_3432_ < 0; i_3432_++) {
							int i_3433_ = (i_3379_ >> 16) * anInt8914;
							for (int i_3434_ = -i_3371_; i_3434_ < 0; i_3434_++) {
								if (!bool_3368_ || f < fs[i_3386_]) {
									int i_3435_ = (aByteArray11345[(i_3378_ >> 16) + i_3433_]);
									if (i_3435_ != 0) {
										if (bool) {
											int i_3436_ = (anIntArray11346[i_3435_ & 0xff]);
											int i_3437_ = is[i_3386_];
											is[i_3386_] = (((((i_3436_ & 0xff00ff) * i_3430_) + ((i_3437_ & 0xff00ff) * i_3431_)) & ~0xff00ff) + ((((i_3436_ & 0xff00) * i_3430_) + ((i_3437_ & 0xff00) * i_3431_)) & 0xff0000)) >> 8;
										}
										if (bool_3368_ && bool_3377_)
											fs[i_3386_] = f;
									}
								}
								i_3378_ += i_3382_;
								i_3386_++;
							}
							i_3379_ += i_3383_;
							i_3378_ = i_3429_;
							i_3386_ += i_3387_;
						}
					} else {
						int i_3438_ = (i_3374_ & 0xff0000) >> 16;
						int i_3439_ = (i_3374_ & 0xff00) >> 8;
						int i_3440_ = i_3374_ & 0xff;
						int i_3441_ = i_3374_ >>> 24;
						int i_3442_ = 256 - i_3441_;
						for (int i_3443_ = -i_3372_; i_3443_ < 0; i_3443_++) {
							int i_3444_ = (i_3379_ >> 16) * anInt8914;
							for (int i_3445_ = -i_3371_; i_3445_ < 0; i_3445_++) {
								if (!bool_3368_ || f < fs[i_3386_]) {
									int i_3446_ = (aByteArray11345[(i_3378_ >> 16) + i_3444_]);
									if (i_3446_ != 0) {
										int i_3447_ = anIntArray11346[i_3446_ & 0xff];
										if (i_3441_ != 255) {
											if (bool) {
												int i_3448_ = (((i_3447_ & 0xff0000) * i_3438_) & ~0xffffff);
												int i_3449_ = (((i_3447_ & 0xff00) * i_3439_) & 0xff0000);
												int i_3450_ = (((i_3447_ & 0xff) * i_3440_) & 0xff00);
												i_3447_ = (i_3448_ | i_3449_ | i_3450_) >>> 8;
												int i_3451_ = is[i_3386_];
												is[i_3386_] = (((((i_3447_ & 0xff00ff) * i_3441_) + ((i_3451_ & 0xff00ff) * i_3442_)) & ~0xff00ff) + ((((i_3447_ & 0xff00) * i_3441_) + ((i_3451_ & 0xff00) * i_3442_)) & 0xff0000)) >> 8;
											}
											if (bool_3368_ && bool_3377_)
												fs[i_3386_] = f;
										} else {
											if (bool) {
												int i_3452_ = (((i_3447_ & 0xff0000) * i_3438_) & ~0xffffff);
												int i_3453_ = (((i_3447_ & 0xff00) * i_3439_) & 0xff0000);
												int i_3454_ = (((i_3447_ & 0xff) * i_3440_) & 0xff00);
												is[i_3386_] = (i_3452_ | i_3453_ | i_3454_) >>> 8;
											}
											if (bool_3368_ && bool_3377_)
												fs[i_3386_] = f;
										}
									}
								}
								i_3378_ += i_3382_;
								i_3386_++;
							}
							i_3379_ += i_3383_;
							i_3378_ = i_3429_;
							i_3386_ += i_3387_;
						}
					}
				} else if (i_3373_ == 3) {
					int i_3455_ = i_3378_;
					int i_3456_ = i_3374_ >>> 24;
					int i_3457_ = 256 - i_3456_;
					for (int i_3458_ = -i_3372_; i_3458_ < 0; i_3458_++) {
						int i_3459_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3460_ = -i_3371_; i_3460_ < 0; i_3460_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								if (bool) {
									byte i_3461_ = (aByteArray11345[(i_3378_ >> 16) + i_3459_]);
									int i_3462_ = (i_3461_ > 0 ? anIntArray11346[i_3461_] : 0);
									int i_3463_ = i_3462_ + i_3374_;
									int i_3464_ = ((i_3462_ & 0xff00ff) + (i_3374_ & 0xff00ff));
									int i_3465_ = ((i_3464_ & 0x1000100) + (i_3463_ - i_3464_ & 0x10000));
									i_3465_ = (i_3463_ - i_3465_ | i_3465_ - (i_3465_ >>> 8));
									if (i_3462_ == 0 && i_3456_ != 255) {
										i_3462_ = i_3465_;
										i_3465_ = is[i_3386_];
										i_3465_ = ((((i_3462_ & 0xff00ff) * i_3456_ + ((i_3465_ & 0xff00ff) * i_3457_)) & ~0xff00ff) + (((i_3462_ & 0xff00) * i_3456_ + ((i_3465_ & 0xff00) * i_3457_)) & 0xff0000)) >> 8;
									}
									is[i_3386_] = i_3465_;
								}
								if (bool_3368_ && bool_3377_)
									fs[i_3386_] = f;
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3455_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 2) {
					int i_3466_ = i_3374_ >>> 24;
					int i_3467_ = 256 - i_3466_;
					int i_3468_ = (i_3374_ & 0xff00ff) * i_3467_ & ~0xff00ff;
					int i_3469_ = (i_3374_ & 0xff00) * i_3467_ & 0xff0000;
					i_3374_ = (i_3468_ | i_3469_) >>> 8;
					int i_3470_ = i_3378_;
					for (int i_3471_ = -i_3372_; i_3471_ < 0; i_3471_++) {
						int i_3472_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3473_ = -i_3371_; i_3473_ < 0; i_3473_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								int i_3474_ = (aByteArray11345[(i_3378_ >> 16) + i_3472_]);
								if (i_3474_ != 0) {
									if (bool) {
										int i_3475_ = anIntArray11346[i_3474_ & 0xff];
										i_3468_ = ((i_3475_ & 0xff00ff) * i_3466_ & ~0xff00ff);
										i_3469_ = ((i_3475_ & 0xff00) * i_3466_ & 0xff0000);
										is[i_3386_] = ((i_3468_ | i_3469_) >>> 8) + i_3374_;
									}
									if (bool_3368_ && bool_3377_)
										fs[i_3386_] = f;
								}
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3470_;
						i_3386_ += i_3387_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_3375_ == 2) {
				if (i_3373_ == 1) {
					int i_3476_ = i_3378_;
					for (int i_3477_ = -i_3372_; i_3477_ < 0; i_3477_++) {
						int i_3478_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3479_ = -i_3371_; i_3479_ < 0; i_3479_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								int i_3480_ = (aByteArray11345[(i_3378_ >> 16) + i_3478_]);
								if (i_3480_ != 0) {
									if (bool) {
										int i_3481_ = anIntArray11346[i_3480_ & 0xff];
										int i_3482_ = is[i_3386_];
										int i_3483_ = i_3481_ + i_3482_;
										int i_3484_ = ((i_3481_ & 0xff00ff) + (i_3482_ & 0xff00ff));
										i_3482_ = ((i_3484_ & 0x1000100) + (i_3483_ - i_3484_ & 0x10000));
										is[i_3386_] = (i_3483_ - i_3482_ | i_3482_ - (i_3482_ >>> 8));
									}
									if (bool_3368_ && bool_3377_)
										fs[i_3386_] = f;
								}
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3476_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 0) {
					int i_3485_ = i_3378_;
					int i_3486_ = (i_3374_ & 0xff0000) >> 16;
					int i_3487_ = (i_3374_ & 0xff00) >> 8;
					int i_3488_ = i_3374_ & 0xff;
					for (int i_3489_ = -i_3372_; i_3489_ < 0; i_3489_++) {
						int i_3490_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3491_ = -i_3371_; i_3491_ < 0; i_3491_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								int i_3492_ = (aByteArray11345[(i_3378_ >> 16) + i_3490_]);
								if (i_3492_ != 0) {
									if (bool) {
										int i_3493_ = anIntArray11346[i_3492_ & 0xff];
										int i_3494_ = ((i_3493_ & 0xff0000) * i_3486_ & ~0xffffff);
										int i_3495_ = ((i_3493_ & 0xff00) * i_3487_ & 0xff0000);
										int i_3496_ = ((i_3493_ & 0xff) * i_3488_ & 0xff00);
										i_3493_ = (i_3494_ | i_3495_ | i_3496_) >>> 8;
										int i_3497_ = is[i_3386_];
										int i_3498_ = i_3493_ + i_3497_;
										int i_3499_ = ((i_3493_ & 0xff00ff) + (i_3497_ & 0xff00ff));
										i_3497_ = ((i_3499_ & 0x1000100) + (i_3498_ - i_3499_ & 0x10000));
										is[i_3386_] = (i_3498_ - i_3497_ | i_3497_ - (i_3497_ >>> 8));
									}
									if (bool_3368_ && bool_3377_)
										fs[i_3386_] = f;
								}
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3485_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 3) {
					int i_3500_ = i_3378_;
					for (int i_3501_ = -i_3372_; i_3501_ < 0; i_3501_++) {
						int i_3502_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3503_ = -i_3371_; i_3503_ < 0; i_3503_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								if (bool) {
									byte i_3504_ = (aByteArray11345[(i_3378_ >> 16) + i_3502_]);
									int i_3505_ = (i_3504_ > 0 ? anIntArray11346[i_3504_] : 0);
									int i_3506_ = i_3505_ + i_3374_;
									int i_3507_ = ((i_3505_ & 0xff00ff) + (i_3374_ & 0xff00ff));
									int i_3508_ = ((i_3507_ & 0x1000100) + (i_3506_ - i_3507_ & 0x10000));
									i_3505_ = (i_3506_ - i_3508_ | i_3508_ - (i_3508_ >>> 8));
									i_3508_ = is[i_3386_];
									i_3506_ = i_3505_ + i_3508_;
									i_3507_ = (i_3505_ & 0xff00ff) + (i_3508_ & 0xff00ff);
									i_3508_ = ((i_3507_ & 0x1000100) + (i_3506_ - i_3507_ & 0x10000));
									is[i_3386_] = (i_3506_ - i_3508_ | i_3508_ - (i_3508_ >>> 8));
								}
								if (bool_3368_ && bool_3377_)
									fs[i_3386_] = f;
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3500_;
						i_3386_ += i_3387_;
					}
				} else if (i_3373_ == 2) {
					int i_3509_ = i_3374_ >>> 24;
					int i_3510_ = 256 - i_3509_;
					int i_3511_ = (i_3374_ & 0xff00ff) * i_3510_ & ~0xff00ff;
					int i_3512_ = (i_3374_ & 0xff00) * i_3510_ & 0xff0000;
					i_3374_ = (i_3511_ | i_3512_) >>> 8;
					int i_3513_ = i_3378_;
					for (int i_3514_ = -i_3372_; i_3514_ < 0; i_3514_++) {
						int i_3515_ = (i_3379_ >> 16) * anInt8914;
						for (int i_3516_ = -i_3371_; i_3516_ < 0; i_3516_++) {
							if (!bool_3368_ || f < fs[i_3386_]) {
								int i_3517_ = (aByteArray11345[(i_3378_ >> 16) + i_3515_]);
								if (i_3517_ != 0) {
									if (bool) {
										int i_3518_ = anIntArray11346[i_3517_ & 0xff];
										i_3511_ = ((i_3518_ & 0xff00ff) * i_3509_ & ~0xff00ff);
										i_3512_ = ((i_3518_ & 0xff00) * i_3509_ & 0xff0000);
										i_3518_ = (((i_3511_ | i_3512_) >>> 8) + i_3374_);
										int i_3519_ = is[i_3386_];
										int i_3520_ = i_3518_ + i_3519_;
										int i_3521_ = ((i_3518_ & 0xff00ff) + (i_3519_ & 0xff00ff));
										i_3519_ = ((i_3521_ & 0x1000100) + (i_3520_ - i_3521_ & 0x10000));
										is[i_3386_] = (i_3520_ - i_3519_ | i_3519_ - (i_3519_ >>> 8));
									}
									if (bool_3368_ && bool_3377_)
										fs[i_3386_] = f;
								}
							}
							i_3378_ += i_3382_;
							i_3386_++;
						}
						i_3379_ += i_3383_;
						i_3378_ = i_3513_;
						i_3386_ += i_3387_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}
}
