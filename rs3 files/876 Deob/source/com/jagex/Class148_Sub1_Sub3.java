/* Class148_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class148_Sub1_Sub3 extends Class148_Sub1 {
	int[] anIntArray11347;

	public void method2433(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * anInt8914 + i;
			int i_7_ = ((i_4_ + i_5_) * (aClass178_Sub3_8923.anInt9825 * 1013077751) + i_3_);
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++)
				anIntArray11347[i_6_ + i_8_] = is[i_7_ + i_8_];
		}
	}

	public void method2434(int i, int i_9_, int i_10_) {
		throw new IllegalStateException("");
	}

	Class148_Sub1_Sub3(Class178_Sub3 class178_sub3, int[] is, int i, int i_11_) {
		super(class178_sub3, i, i_11_);
		anIntArray11347 = is;
	}

	public void method2431(int i, int i_12_, int i_13_, int i_14_, int[] is, int i_15_, int i_16_) {
		i_16_ -= i_13_;
		for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
			int i_18_ = (i_12_ + i_17_) * i_13_ + i;
			for (int i_19_ = 0; i_19_ < i_13_; i_19_++)
				anIntArray11347[i_18_ + i_19_] = is[i_15_++];
			i_15_ += i_16_;
		}
	}

	void method17754(int i, int i_20_, int i_21_, int i_22_, int[] is, int i_23_, int i_24_) {
		i_24_ -= i_21_;
		for (int i_25_ = 0; i_25_ < i_22_; i_25_++) {
			int i_26_ = (i_20_ + i_25_) * i_21_ + i;
			for (int i_27_ = 0; i_27_ < i_21_; i_27_++)
				is[i_23_++] = anIntArray11347[i_26_ + i_27_];
			i_23_ += i_24_;
		}
	}

	public void method2432(int i, int i_28_, int i_29_, int i_30_, int[] is, int[] is_31_, int i_32_, int i_33_) {
		method17754(i, i_28_, i_29_, i_30_, is, i_32_, i_33_);
	}

	void method14405(int[] is, int[] is_34_, int i, int i_35_) {
		int[] is_36_ = aClass178_Sub3_8923.anIntArray9804;
		if (is_36_ != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_37_ = anInt8928;
					while (i_37_ < 0) {
						int i_38_ = i_37_ + i_35_;
						if (i_38_ >= 0) {
							if (i_38_ >= is.length)
								break;
							int i_39_ = anInt8930;
							int i_40_ = anInt8937;
							int i_41_ = anInt8936;
							int i_42_ = anInt8926;
							if (i_40_ >= 0 && i_41_ >= 0 && i_40_ - (anInt8914 << 12) < 0 && i_41_ - (anInt8916 << 12) < 0) {
								int i_43_ = is[i_38_] - i;
								int i_44_ = -is_34_[i_38_];
								int i_45_ = i_43_ - (i_39_ - anInt8930);
								if (i_45_ > 0) {
									i_39_ += i_45_;
									i_42_ += i_45_;
									i_40_ += anInt8940 * i_45_;
									i_41_ += anInt8938 * i_45_;
								} else
									i_44_ -= i_45_;
								if (i_42_ < i_44_)
									i_42_ = i_44_;
								for (/**/; i_42_ < 0; i_42_++) {
									int i_46_ = (anIntArray11347[((i_41_ >> 12) * anInt8914 + (i_40_ >> 12))]);
									if (i_46_ != 0)
										is_36_[i_39_++] = i_46_;
									else
										i_39_++;
								}
							}
						}
						i_37_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_47_ = anInt8928;
					while (i_47_ < 0) {
						int i_48_ = i_47_ + i_35_;
						if (i_48_ >= 0) {
							if (i_48_ >= is.length)
								break;
							int i_49_ = anInt8930;
							int i_50_ = anInt8937;
							int i_51_ = anInt8936 + anInt8925;
							int i_52_ = anInt8926;
							if (i_50_ >= 0 && i_50_ - (anInt8914 << 12) < 0) {
								int i_53_;
								if ((i_53_ = i_51_ - (anInt8916 << 12)) >= 0) {
									i_53_ = (anInt8938 - i_53_) / anInt8938;
									i_52_ += i_53_;
									i_51_ += anInt8938 * i_53_;
									i_49_ += i_53_;
								}
								if ((i_53_ = (i_51_ - anInt8938) / anInt8938) > i_52_)
									i_52_ = i_53_;
								int i_54_ = is[i_48_] - i;
								int i_55_ = -is_34_[i_48_];
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
									int i_57_ = (anIntArray11347[((i_51_ >> 12) * anInt8914 + (i_50_ >> 12))]);
									if (i_57_ != 0)
										is_36_[i_49_++] = i_57_;
									else
										i_49_++;
									i_51_ += anInt8938;
								}
							}
						}
						i_47_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_58_ = anInt8928;
					while (i_58_ < 0) {
						int i_59_ = i_58_ + i_35_;
						if (i_59_ >= 0) {
							if (i_59_ >= is.length)
								break;
							int i_60_ = anInt8930;
							int i_61_ = anInt8937;
							int i_62_ = anInt8936 + anInt8925;
							int i_63_ = anInt8926;
							if (i_61_ >= 0 && i_61_ - (anInt8914 << 12) < 0) {
								if (i_62_ < 0) {
									int i_64_ = (anInt8938 - 1 - i_62_) / anInt8938;
									i_63_ += i_64_;
									i_62_ += anInt8938 * i_64_;
									i_60_ += i_64_;
								}
								int i_65_;
								if ((i_65_ = (1 + i_62_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_63_)
									i_63_ = i_65_;
								int i_66_ = is[i_59_] - i;
								int i_67_ = -is_34_[i_59_];
								int i_68_ = i_66_ - (i_60_ - anInt8930);
								if (i_68_ > 0) {
									i_60_ += i_68_;
									i_63_ += i_68_;
									i_61_ += anInt8940 * i_68_;
									i_62_ += anInt8938 * i_68_;
								} else
									i_67_ -= i_68_;
								if (i_63_ < i_67_)
									i_63_ = i_67_;
								for (/**/; i_63_ < 0; i_63_++) {
									int i_69_ = (anIntArray11347[((i_62_ >> 12) * anInt8914 + (i_61_ >> 12))]);
									if (i_69_ != 0)
										is_36_[i_60_++] = i_69_;
									else
										i_60_++;
									i_62_ += anInt8938;
								}
							}
						}
						i_58_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_70_ = anInt8928;
					while (i_70_ < 0) {
						int i_71_ = i_70_ + i_35_;
						if (i_71_ >= 0) {
							if (i_71_ >= is.length)
								break;
							int i_72_ = anInt8930;
							int i_73_ = anInt8937 + anInt8939;
							int i_74_ = anInt8936;
							int i_75_ = anInt8926;
							if (i_74_ >= 0 && i_74_ - (anInt8916 << 12) < 0) {
								int i_76_;
								if ((i_76_ = i_73_ - (anInt8914 << 12)) >= 0) {
									i_76_ = (anInt8940 - i_76_) / anInt8940;
									i_75_ += i_76_;
									i_73_ += anInt8940 * i_76_;
									i_72_ += i_76_;
								}
								if ((i_76_ = (i_73_ - anInt8940) / anInt8940) > i_75_)
									i_75_ = i_76_;
								int i_77_ = is[i_71_] - i;
								int i_78_ = -is_34_[i_71_];
								int i_79_ = i_77_ - (i_72_ - anInt8930);
								if (i_79_ > 0) {
									i_72_ += i_79_;
									i_75_ += i_79_;
									i_73_ += anInt8940 * i_79_;
									i_74_ += anInt8938 * i_79_;
								} else
									i_78_ -= i_79_;
								if (i_75_ < i_78_)
									i_75_ = i_78_;
								for (/**/; i_75_ < 0; i_75_++) {
									int i_80_ = (anIntArray11347[((i_74_ >> 12) * anInt8914 + (i_73_ >> 12))]);
									if (i_80_ != 0)
										is_36_[i_72_++] = i_80_;
									else
										i_72_++;
									i_73_ += anInt8940;
								}
							}
						}
						i_70_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_81_ = anInt8928;
					while (i_81_ < 0) {
						int i_82_ = i_81_ + i_35_;
						if (i_82_ >= 0) {
							if (i_82_ >= is.length)
								break;
							int i_83_ = anInt8930;
							int i_84_ = anInt8937 + anInt8939;
							int i_85_ = anInt8936 + anInt8925;
							int i_86_ = anInt8926;
							int i_87_;
							if ((i_87_ = i_84_ - (anInt8914 << 12)) >= 0) {
								i_87_ = (anInt8940 - i_87_) / anInt8940;
								i_86_ += i_87_;
								i_84_ += anInt8940 * i_87_;
								i_85_ += anInt8938 * i_87_;
								i_83_ += i_87_;
							}
							if ((i_87_ = (i_84_ - anInt8940) / anInt8940) > i_86_)
								i_86_ = i_87_;
							if ((i_87_ = i_85_ - (anInt8916 << 12)) >= 0) {
								i_87_ = (anInt8938 - i_87_) / anInt8938;
								i_86_ += i_87_;
								i_84_ += anInt8940 * i_87_;
								i_85_ += anInt8938 * i_87_;
								i_83_ += i_87_;
							}
							if ((i_87_ = (i_85_ - anInt8938) / anInt8938) > i_86_)
								i_86_ = i_87_;
							int i_88_ = is[i_82_] - i;
							int i_89_ = -is_34_[i_82_];
							int i_90_ = i_88_ - (i_83_ - anInt8930);
							if (i_90_ > 0) {
								i_83_ += i_90_;
								i_86_ += i_90_;
								i_84_ += anInt8940 * i_90_;
								i_85_ += anInt8938 * i_90_;
							} else
								i_89_ -= i_90_;
							if (i_86_ < i_89_)
								i_86_ = i_89_;
							for (/**/; i_86_ < 0; i_86_++) {
								int i_91_ = (anIntArray11347[(i_85_ >> 12) * anInt8914 + (i_84_ >> 12)]);
								if (i_91_ != 0)
									is_36_[i_83_++] = i_91_;
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
					int i_92_ = anInt8928;
					while (i_92_ < 0) {
						int i_93_ = i_92_ + i_35_;
						if (i_93_ >= 0) {
							if (i_93_ >= is.length)
								break;
							int i_94_ = anInt8930;
							int i_95_ = anInt8937 + anInt8939;
							int i_96_ = anInt8936 + anInt8925;
							int i_97_ = anInt8926;
							int i_98_;
							if ((i_98_ = i_95_ - (anInt8914 << 12)) >= 0) {
								i_98_ = (anInt8940 - i_98_) / anInt8940;
								i_97_ += i_98_;
								i_95_ += anInt8940 * i_98_;
								i_96_ += anInt8938 * i_98_;
								i_94_ += i_98_;
							}
							if ((i_98_ = (i_95_ - anInt8940) / anInt8940) > i_97_)
								i_97_ = i_98_;
							if (i_96_ < 0) {
								i_98_ = (anInt8938 - 1 - i_96_) / anInt8938;
								i_97_ += i_98_;
								i_95_ += anInt8940 * i_98_;
								i_96_ += anInt8938 * i_98_;
								i_94_ += i_98_;
							}
							if ((i_98_ = (1 + i_96_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_97_)
								i_97_ = i_98_;
							int i_99_ = is[i_93_] - i;
							int i_100_ = -is_34_[i_93_];
							int i_101_ = i_99_ - (i_94_ - anInt8930);
							if (i_101_ > 0) {
								i_94_ += i_101_;
								i_97_ += i_101_;
								i_95_ += anInt8940 * i_101_;
								i_96_ += anInt8938 * i_101_;
							} else
								i_100_ -= i_101_;
							if (i_97_ < i_100_)
								i_97_ = i_100_;
							for (/**/; i_97_ < 0; i_97_++) {
								int i_102_ = (anIntArray11347[(i_96_ >> 12) * anInt8914 + (i_95_ >> 12)]);
								if (i_102_ != 0)
									is_36_[i_94_++] = i_102_;
								else
									i_94_++;
								i_95_ += anInt8940;
								i_96_ += anInt8938;
							}
						}
						i_92_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_103_ = anInt8928;
				while (i_103_ < 0) {
					int i_104_ = i_103_ + i_35_;
					if (i_104_ >= 0) {
						if (i_104_ >= is.length)
							break;
						int i_105_ = anInt8930;
						int i_106_ = anInt8937 + anInt8939;
						int i_107_ = anInt8936;
						int i_108_ = anInt8926;
						if (i_107_ >= 0 && i_107_ - (anInt8916 << 12) < 0) {
							if (i_106_ < 0) {
								int i_109_ = (anInt8940 - 1 - i_106_) / anInt8940;
								i_108_ += i_109_;
								i_106_ += anInt8940 * i_109_;
								i_105_ += i_109_;
							}
							int i_110_;
							if ((i_110_ = (1 + i_106_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_108_)
								i_108_ = i_110_;
							int i_111_ = is[i_104_] - i;
							int i_112_ = -is_34_[i_104_];
							int i_113_ = i_111_ - (i_105_ - anInt8930);
							if (i_113_ > 0) {
								i_105_ += i_113_;
								i_108_ += i_113_;
								i_106_ += anInt8940 * i_113_;
								i_107_ += anInt8938 * i_113_;
							} else
								i_112_ -= i_113_;
							if (i_108_ < i_112_)
								i_108_ = i_112_;
							for (/**/; i_108_ < 0; i_108_++) {
								int i_114_ = (anIntArray11347[(i_107_ >> 12) * anInt8914 + (i_106_ >> 12)]);
								if (i_114_ != 0)
									is_36_[i_105_++] = i_114_;
								else
									i_105_++;
								i_106_ += anInt8940;
							}
						}
					}
					i_103_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				int i_115_ = anInt8928;
				while (i_115_ < 0) {
					int i_116_ = i_115_ + i_35_;
					if (i_116_ >= 0) {
						if (i_116_ >= is.length)
							break;
						int i_117_ = anInt8930;
						int i_118_ = anInt8937 + anInt8939;
						int i_119_ = anInt8936 + anInt8925;
						int i_120_ = anInt8926;
						if (i_118_ < 0) {
							int i_121_ = (anInt8940 - 1 - i_118_) / anInt8940;
							i_120_ += i_121_;
							i_118_ += anInt8940 * i_121_;
							i_119_ += anInt8938 * i_121_;
							i_117_ += i_121_;
						}
						int i_122_;
						if ((i_122_ = (1 + i_118_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_120_)
							i_120_ = i_122_;
						if ((i_122_ = i_119_ - (anInt8916 << 12)) >= 0) {
							i_122_ = (anInt8938 - i_122_) / anInt8938;
							i_120_ += i_122_;
							i_118_ += anInt8940 * i_122_;
							i_119_ += anInt8938 * i_122_;
							i_117_ += i_122_;
						}
						if ((i_122_ = (i_119_ - anInt8938) / anInt8938) > i_120_)
							i_120_ = i_122_;
						int i_123_ = is[i_116_] - i;
						int i_124_ = -is_34_[i_116_];
						int i_125_ = i_123_ - (i_117_ - anInt8930);
						if (i_125_ > 0) {
							i_117_ += i_125_;
							i_120_ += i_125_;
							i_118_ += anInt8940 * i_125_;
							i_119_ += anInt8938 * i_125_;
						} else
							i_124_ -= i_125_;
						if (i_120_ < i_124_)
							i_120_ = i_124_;
						for (/**/; i_120_ < 0; i_120_++) {
							int i_126_ = (anIntArray11347[(i_119_ >> 12) * anInt8914 + (i_118_ >> 12)]);
							if (i_126_ != 0)
								is_36_[i_117_++] = i_126_;
							else
								i_117_++;
							i_118_ += anInt8940;
							i_119_ += anInt8938;
						}
					}
					i_115_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				int i_127_ = anInt8928;
				while (i_127_ < 0) {
					int i_128_ = i_127_ + i_35_;
					if (i_128_ >= 0) {
						if (i_128_ >= is.length)
							break;
						int i_129_ = anInt8930;
						int i_130_ = anInt8937 + anInt8939;
						int i_131_ = anInt8936 + anInt8925;
						int i_132_ = anInt8926;
						if (i_130_ < 0) {
							int i_133_ = (anInt8940 - 1 - i_130_) / anInt8940;
							i_132_ += i_133_;
							i_130_ += anInt8940 * i_133_;
							i_131_ += anInt8938 * i_133_;
							i_129_ += i_133_;
						}
						int i_134_;
						if ((i_134_ = (1 + i_130_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_132_)
							i_132_ = i_134_;
						if (i_131_ < 0) {
							i_134_ = (anInt8938 - 1 - i_131_) / anInt8938;
							i_132_ += i_134_;
							i_130_ += anInt8940 * i_134_;
							i_131_ += anInt8938 * i_134_;
							i_129_ += i_134_;
						}
						if ((i_134_ = (1 + i_131_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_132_)
							i_132_ = i_134_;
						int i_135_ = is[i_128_] - i;
						int i_136_ = -is_34_[i_128_];
						int i_137_ = i_135_ - (i_129_ - anInt8930);
						if (i_137_ > 0) {
							i_129_ += i_137_;
							i_132_ += i_137_;
							i_130_ += anInt8940 * i_137_;
							i_131_ += anInt8938 * i_137_;
						} else
							i_136_ -= i_137_;
						if (i_132_ < i_136_)
							i_132_ = i_136_;
						for (/**/; i_132_ < 0; i_132_++) {
							int i_138_ = (anIntArray11347[(i_131_ >> 12) * anInt8914 + (i_130_ >> 12)]);
							if (i_138_ != 0)
								is_36_[i_129_++] = i_138_;
							else
								i_129_++;
							i_130_ += anInt8940;
							i_131_ += anInt8938;
						}
					}
					i_127_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public void method2452(int i, int i_139_, int i_140_, int i_141_, int[] is, int i_142_, int i_143_) {
		i_143_ -= i_140_;
		for (int i_144_ = 0; i_144_ < i_141_; i_144_++) {
			int i_145_ = (i_139_ + i_144_) * i_140_ + i;
			for (int i_146_ = 0; i_146_ < i_140_; i_146_++)
				anIntArray11347[i_145_ + i_146_] = is[i_142_++];
			i_142_ += i_143_;
		}
	}

	public Interface22 method2430() {
		return new Class102(anInt8914, anInt8916, anIntArray11347);
	}

	public void method2436(int i, int i_147_, int i_148_, int i_149_, int i_150_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_151_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_147_ += anInt8918;
			int i_152_ = i_147_ * i_151_ + i;
			int i_153_ = 0;
			int i_154_ = anInt8916;
			int i_155_ = anInt8914;
			int i_156_ = i_151_ - i_155_;
			int i_157_ = 0;
			if (i_147_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_158_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_147_;
				i_154_ -= i_158_;
				i_147_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_153_ += i_158_ * i_155_;
				i_152_ += i_158_ * i_151_;
			}
			if (i_147_ + i_154_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_154_ -= (i_147_ + i_154_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_159_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_155_ -= i_159_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_153_ += i_159_;
				i_152_ += i_159_;
				i_157_ += i_159_;
				i_156_ += i_159_;
			}
			if (i + i_155_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_160_ = i + i_155_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_155_ -= i_160_;
				i_157_ += i_160_;
				i_156_ += i_160_;
			}
			if (i_155_ > 0 && i_154_ > 0) {
				if (i_150_ == 0) {
					if (i_148_ == 1) {
						for (int i_161_ = -i_154_; i_161_ < 0; i_161_++) {
							int i_162_ = i_152_ + i_155_ - 3;
							while (i_152_ < i_162_) {
								is[i_152_++] = anIntArray11347[i_153_++];
								is[i_152_++] = anIntArray11347[i_153_++];
								is[i_152_++] = anIntArray11347[i_153_++];
								is[i_152_++] = anIntArray11347[i_153_++];
							}
							i_162_ += 3;
							while (i_152_ < i_162_)
								is[i_152_++] = anIntArray11347[i_153_++];
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 0) {
						int i_163_ = (i_149_ & 0xff0000) >> 16;
						int i_164_ = (i_149_ & 0xff00) >> 8;
						int i_165_ = i_149_ & 0xff;
						for (int i_166_ = -i_154_; i_166_ < 0; i_166_++) {
							for (int i_167_ = -i_155_; i_167_ < 0; i_167_++) {
								int i_168_ = anIntArray11347[i_153_++];
								int i_169_ = (i_168_ & 0xff0000) * i_163_ & ~0xffffff;
								int i_170_ = (i_168_ & 0xff00) * i_164_ & 0xff0000;
								int i_171_ = (i_168_ & 0xff) * i_165_ & 0xff00;
								is[i_152_++] = (i_169_ | i_170_ | i_171_) >>> 8;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 3) {
						for (int i_172_ = -i_154_; i_172_ < 0; i_172_++) {
							for (int i_173_ = -i_155_; i_173_ < 0; i_173_++) {
								int i_174_ = anIntArray11347[i_153_++];
								int i_175_ = i_174_ + i_149_;
								int i_176_ = ((i_174_ & 0xff00ff) + (i_149_ & 0xff00ff));
								int i_177_ = ((i_176_ & 0x1000100) + (i_175_ - i_176_ & 0x10000));
								is[i_152_++] = i_175_ - i_177_ | i_177_ - (i_177_ >>> 8);
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 2) {
						int i_178_ = i_149_ >>> 24;
						int i_179_ = 256 - i_178_;
						int i_180_ = (i_149_ & 0xff00ff) * i_179_ & ~0xff00ff;
						int i_181_ = (i_149_ & 0xff00) * i_179_ & 0xff0000;
						i_149_ = (i_180_ | i_181_) >>> 8;
						for (int i_182_ = -i_154_; i_182_ < 0; i_182_++) {
							for (int i_183_ = -i_155_; i_183_ < 0; i_183_++) {
								int i_184_ = anIntArray11347[i_153_++];
								i_180_ = (i_184_ & 0xff00ff) * i_178_ & ~0xff00ff;
								i_181_ = (i_184_ & 0xff00) * i_178_ & 0xff0000;
								is[i_152_++] = ((i_180_ | i_181_) >>> 8) + i_149_;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_150_ == 1) {
					if (i_148_ == 1) {
						for (int i_185_ = -i_154_; i_185_ < 0; i_185_++) {
							int i_186_ = i_152_ + i_155_ - 3;
							while (i_152_ < i_186_) {
								int i_187_ = anIntArray11347[i_153_++];
								if (i_187_ != 0)
									is[i_152_++] = i_187_;
								else
									i_152_++;
								i_187_ = anIntArray11347[i_153_++];
								if (i_187_ != 0)
									is[i_152_++] = i_187_;
								else
									i_152_++;
								i_187_ = anIntArray11347[i_153_++];
								if (i_187_ != 0)
									is[i_152_++] = i_187_;
								else
									i_152_++;
								i_187_ = anIntArray11347[i_153_++];
								if (i_187_ != 0)
									is[i_152_++] = i_187_;
								else
									i_152_++;
							}
							i_186_ += 3;
							while (i_152_ < i_186_) {
								int i_188_ = anIntArray11347[i_153_++];
								if (i_188_ != 0)
									is[i_152_++] = i_188_;
								else
									i_152_++;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 0) {
						if ((i_149_ & 0xffffff) == 16777215) {
							int i_189_ = i_149_ >>> 24;
							int i_190_ = 256 - i_189_;
							for (int i_191_ = -i_154_; i_191_ < 0; i_191_++) {
								for (int i_192_ = -i_155_; i_192_ < 0; i_192_++) {
									int i_193_ = anIntArray11347[i_153_++];
									if (i_193_ != 0) {
										int i_194_ = is[i_152_];
										is[i_152_++] = ((((i_193_ & 0xff00ff) * i_189_ + ((i_194_ & 0xff00ff) * i_190_)) & ~0xff00ff) + (((i_193_ & 0xff00) * i_189_ + ((i_194_ & 0xff00) * i_190_)) & 0xff0000)) >> 8;
									} else
										i_152_++;
								}
								i_152_ += i_156_;
								i_153_ += i_157_;
							}
						} else {
							int i_195_ = (i_149_ & 0xff0000) >> 16;
							int i_196_ = (i_149_ & 0xff00) >> 8;
							int i_197_ = i_149_ & 0xff;
							int i_198_ = i_149_ >>> 24;
							int i_199_ = 256 - i_198_;
							for (int i_200_ = -i_154_; i_200_ < 0; i_200_++) {
								for (int i_201_ = -i_155_; i_201_ < 0; i_201_++) {
									int i_202_ = anIntArray11347[i_153_++];
									if (i_202_ != 0) {
										if (i_198_ != 255) {
											int i_203_ = ((i_202_ & 0xff0000) * i_195_ & ~0xffffff);
											int i_204_ = ((i_202_ & 0xff00) * i_196_ & 0xff0000);
											int i_205_ = ((i_202_ & 0xff) * i_197_ & 0xff00);
											i_202_ = (i_203_ | i_204_ | i_205_) >>> 8;
											int i_206_ = is[i_152_];
											is[i_152_++] = (((((i_202_ & 0xff00ff) * i_198_) + ((i_206_ & 0xff00ff) * i_199_)) & ~0xff00ff) + ((((i_202_ & 0xff00) * i_198_) + ((i_206_ & 0xff00) * i_199_)) & 0xff0000)) >> 8;
										} else {
											int i_207_ = ((i_202_ & 0xff0000) * i_195_ & ~0xffffff);
											int i_208_ = ((i_202_ & 0xff00) * i_196_ & 0xff0000);
											int i_209_ = ((i_202_ & 0xff) * i_197_ & 0xff00);
											is[i_152_++] = (i_207_ | i_208_ | i_209_) >>> 8;
										}
									} else
										i_152_++;
								}
								i_152_ += i_156_;
								i_153_ += i_157_;
							}
						}
					} else if (i_148_ == 3) {
						int i_210_ = i_149_ >>> 24;
						int i_211_ = 256 - i_210_;
						for (int i_212_ = -i_154_; i_212_ < 0; i_212_++) {
							for (int i_213_ = -i_155_; i_213_ < 0; i_213_++) {
								int i_214_ = anIntArray11347[i_153_++];
								int i_215_ = i_214_ + i_149_;
								int i_216_ = ((i_214_ & 0xff00ff) + (i_149_ & 0xff00ff));
								int i_217_ = ((i_216_ & 0x1000100) + (i_215_ - i_216_ & 0x10000));
								i_217_ = i_215_ - i_217_ | i_217_ - (i_217_ >>> 8);
								if (i_214_ == 0 && i_210_ != 255) {
									i_214_ = i_217_;
									i_217_ = is[i_152_];
									i_217_ = ((((i_214_ & 0xff00ff) * i_210_ + (i_217_ & 0xff00ff) * i_211_) & ~0xff00ff) + (((i_214_ & 0xff00) * i_210_ + (i_217_ & 0xff00) * i_211_) & 0xff0000)) >> 8;
								}
								is[i_152_++] = i_217_;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 2) {
						int i_218_ = i_149_ >>> 24;
						int i_219_ = 256 - i_218_;
						int i_220_ = (i_149_ & 0xff00ff) * i_219_ & ~0xff00ff;
						int i_221_ = (i_149_ & 0xff00) * i_219_ & 0xff0000;
						i_149_ = (i_220_ | i_221_) >>> 8;
						for (int i_222_ = -i_154_; i_222_ < 0; i_222_++) {
							for (int i_223_ = -i_155_; i_223_ < 0; i_223_++) {
								int i_224_ = anIntArray11347[i_153_++];
								if (i_224_ != 0) {
									i_220_ = ((i_224_ & 0xff00ff) * i_218_ & ~0xff00ff);
									i_221_ = ((i_224_ & 0xff00) * i_218_ & 0xff0000);
									is[i_152_++] = ((i_220_ | i_221_) >>> 8) + i_149_;
								} else
									i_152_++;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_150_ == 2) {
					if (i_148_ == 1) {
						for (int i_225_ = -i_154_; i_225_ < 0; i_225_++) {
							for (int i_226_ = -i_155_; i_226_ < 0; i_226_++) {
								int i_227_ = anIntArray11347[i_153_++];
								if (i_227_ != 0) {
									int i_228_ = is[i_152_];
									int i_229_ = i_227_ + i_228_;
									int i_230_ = ((i_227_ & 0xff00ff) + (i_228_ & 0xff00ff));
									i_228_ = ((i_230_ & 0x1000100) + (i_229_ - i_230_ & 0x10000));
									is[i_152_++] = i_229_ - i_228_ | i_228_ - (i_228_ >>> 8);
								} else
									i_152_++;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 0) {
						int i_231_ = (i_149_ & 0xff0000) >> 16;
						int i_232_ = (i_149_ & 0xff00) >> 8;
						int i_233_ = i_149_ & 0xff;
						for (int i_234_ = -i_154_; i_234_ < 0; i_234_++) {
							for (int i_235_ = -i_155_; i_235_ < 0; i_235_++) {
								int i_236_ = anIntArray11347[i_153_++];
								if (i_236_ != 0) {
									int i_237_ = ((i_236_ & 0xff0000) * i_231_ & ~0xffffff);
									int i_238_ = ((i_236_ & 0xff00) * i_232_ & 0xff0000);
									int i_239_ = (i_236_ & 0xff) * i_233_ & 0xff00;
									i_236_ = (i_237_ | i_238_ | i_239_) >>> 8;
									int i_240_ = is[i_152_];
									int i_241_ = i_236_ + i_240_;
									int i_242_ = ((i_236_ & 0xff00ff) + (i_240_ & 0xff00ff));
									i_240_ = ((i_242_ & 0x1000100) + (i_241_ - i_242_ & 0x10000));
									is[i_152_++] = i_241_ - i_240_ | i_240_ - (i_240_ >>> 8);
								} else
									i_152_++;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 3) {
						for (int i_243_ = -i_154_; i_243_ < 0; i_243_++) {
							for (int i_244_ = -i_155_; i_244_ < 0; i_244_++) {
								int i_245_ = anIntArray11347[i_153_++];
								int i_246_ = i_245_ + i_149_;
								int i_247_ = ((i_245_ & 0xff00ff) + (i_149_ & 0xff00ff));
								int i_248_ = ((i_247_ & 0x1000100) + (i_246_ - i_247_ & 0x10000));
								i_245_ = i_246_ - i_248_ | i_248_ - (i_248_ >>> 8);
								i_248_ = is[i_152_];
								i_246_ = i_245_ + i_248_;
								i_247_ = (i_245_ & 0xff00ff) + (i_248_ & 0xff00ff);
								i_248_ = (i_247_ & 0x1000100) + (i_246_ - i_247_ & 0x10000);
								is[i_152_++] = i_246_ - i_248_ | i_248_ - (i_248_ >>> 8);
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else if (i_148_ == 2) {
						int i_249_ = i_149_ >>> 24;
						int i_250_ = 256 - i_249_;
						int i_251_ = (i_149_ & 0xff00ff) * i_250_ & ~0xff00ff;
						int i_252_ = (i_149_ & 0xff00) * i_250_ & 0xff0000;
						i_149_ = (i_251_ | i_252_) >>> 8;
						for (int i_253_ = -i_154_; i_253_ < 0; i_253_++) {
							for (int i_254_ = -i_155_; i_254_ < 0; i_254_++) {
								int i_255_ = anIntArray11347[i_153_++];
								if (i_255_ != 0) {
									i_251_ = ((i_255_ & 0xff00ff) * i_249_ & ~0xff00ff);
									i_252_ = ((i_255_ & 0xff00) * i_249_ & 0xff0000);
									i_255_ = ((i_251_ | i_252_) >>> 8) + i_149_;
									int i_256_ = is[i_152_];
									int i_257_ = i_255_ + i_256_;
									int i_258_ = ((i_255_ & 0xff00ff) + (i_256_ & 0xff00ff));
									i_256_ = ((i_258_ & 0x1000100) + (i_257_ - i_258_ & 0x10000));
									is[i_152_++] = i_257_ - i_256_ | i_256_ - (i_256_ >>> 8);
								} else
									i_152_++;
							}
							i_152_ += i_156_;
							i_153_ += i_157_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface22 method2470() {
		return new Class102(anInt8914, anInt8916, anIntArray11347);
	}

	public void method2467(int i, int i_259_, Class145 class145, int i_260_, int i_261_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_259_ += anInt8918;
			int i_262_ = 0;
			int i_263_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_264_ = anInt8914;
			int i_265_ = anInt8916;
			int i_266_ = i_263_ - i_264_;
			int i_267_ = 0;
			int i_268_ = i + i_259_ * i_263_;
			if (i_259_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_269_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_259_;
				i_265_ -= i_269_;
				i_259_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_262_ += i_269_ * i_264_;
				i_268_ += i_269_ * i_263_;
			}
			if (i_259_ + i_265_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_265_ -= (i_259_ + i_265_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_270_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_264_ -= i_270_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_262_ += i_270_;
				i_268_ += i_270_;
				i_267_ += i_270_;
				i_266_ += i_270_;
			}
			if (i + i_264_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_271_ = i + i_264_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_264_ -= i_271_;
				i_267_ += i_271_;
				i_266_ += i_271_;
			}
			if (i_264_ > 0 && i_265_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_272_ = class145_sub1.anIntArray9521;
				int[] is_273_ = class145_sub1.anIntArray9520;
				int i_274_ = i_259_;
				if (i_261_ > i_274_) {
					i_274_ = i_261_;
					i_268_ += (i_261_ - i_259_) * i_263_;
					i_262_ += (i_261_ - i_259_) * anInt8914;
				}
				int i_275_ = (i_261_ + is_272_.length < i_259_ + i_265_ ? i_261_ + is_272_.length : i_259_ + i_265_);
				for (int i_276_ = i_274_; i_276_ < i_275_; i_276_++) {
					int i_277_ = is_272_[i_276_ - i_261_] + i_260_;
					int i_278_ = is_273_[i_276_ - i_261_];
					int i_279_ = i_264_;
					if (i > i_277_) {
						int i_280_ = i - i_277_;
						if (i_280_ >= i_278_) {
							i_262_ += i_264_ + i_267_;
							i_268_ += i_264_ + i_266_;
							continue;
						}
						i_278_ -= i_280_;
					} else {
						int i_281_ = i_277_ - i;
						if (i_281_ >= i_264_) {
							i_262_ += i_264_ + i_267_;
							i_268_ += i_264_ + i_266_;
							continue;
						}
						i_262_ += i_281_;
						i_279_ -= i_281_;
						i_268_ += i_281_;
					}
					int i_282_ = 0;
					if (i_279_ < i_278_)
						i_278_ = i_279_;
					else
						i_282_ = i_279_ - i_278_;
					for (int i_283_ = -i_278_; i_283_ < 0; i_283_++) {
						int i_284_ = anIntArray11347[i_262_++];
						if (i_284_ != 0)
							is[i_268_++] = i_284_;
						else
							i_268_++;
					}
					i_262_ += i_282_ + i_267_;
					i_268_ += i_282_ + i_266_;
				}
			}
		}
	}

	void method14403(boolean bool, boolean bool_285_, boolean bool_286_, int i, int i_287_, float f, int i_288_, int i_289_, int i_290_, int i_291_, int i_292_, int i_293_, boolean bool_294_) {
		if (i_288_ > 0 && i_289_ > 0 && (bool || bool_285_)) {
			int i_295_ = 0;
			int i_296_ = 0;
			int i_297_ = anInt8921 + anInt8914 + anInt8919;
			int i_298_ = anInt8918 + anInt8916 + anInt8920;
			int i_299_ = (i_297_ << 16) / i_288_;
			int i_300_ = (i_298_ << 16) / i_289_;
			if (anInt8921 > 0) {
				int i_301_ = ((anInt8921 << 16) + i_299_ - 1) / i_299_;
				i += i_301_;
				i_295_ += i_301_ * i_299_ - (anInt8921 << 16);
			}
			if (anInt8918 > 0) {
				int i_302_ = ((anInt8918 << 16) + i_300_ - 1) / i_300_;
				i_287_ += i_302_;
				i_296_ += i_302_ * i_300_ - (anInt8918 << 16);
			}
			if (anInt8914 < i_297_)
				i_288_ = ((anInt8914 << 16) - i_295_ + i_299_ - 1) / i_299_;
			if (anInt8916 < i_298_)
				i_289_ = ((anInt8916 << 16) - i_296_ + i_300_ - 1) / i_300_;
			int i_303_ = i + i_287_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
			int i_304_ = aClass178_Sub3_8923.anInt9825 * 1013077751 - i_288_;
			if (i_287_ + i_289_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_289_ -= (i_287_ + i_289_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i_287_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_305_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_287_;
				i_289_ -= i_305_;
				i_303_ += i_305_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
				i_296_ += i_300_ * i_305_;
			}
			if (i + i_288_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_306_ = i + i_288_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_288_ -= i_306_;
				i_304_ += i_306_;
			}
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_307_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_288_ -= i_307_;
				i_303_ += i_307_;
				i_295_ += i_299_ * i_307_;
				i_304_ += i_307_;
			}
			float[] fs = aClass178_Sub3_8923.aFloatArray9807;
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (i_292_ == 0) {
				if (i_290_ == 1) {
					int i_308_ = i_295_;
					for (int i_309_ = -i_289_; i_309_ < 0; i_309_++) {
						int i_310_ = (i_296_ >> 16) * anInt8914;
						for (int i_311_ = -i_288_; i_311_ < 0; i_311_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								if (bool)
									is[i_303_] = (anIntArray11347[(i_295_ >> 16) + i_310_]);
								if (bool_285_ && bool_294_)
									fs[i_303_] = f;
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_308_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 0) {
					int i_312_ = (i_291_ & 0xff0000) >> 16;
					int i_313_ = (i_291_ & 0xff00) >> 8;
					int i_314_ = i_291_ & 0xff;
					int i_315_ = i_295_;
					for (int i_316_ = -i_289_; i_316_ < 0; i_316_++) {
						int i_317_ = (i_296_ >> 16) * anInt8914;
						for (int i_318_ = -i_288_; i_318_ < 0; i_318_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								if (bool) {
									int i_319_ = (anIntArray11347[(i_295_ >> 16) + i_317_]);
									int i_320_ = ((i_319_ & 0xff0000) * i_312_ & ~0xffffff);
									int i_321_ = ((i_319_ & 0xff00) * i_313_ & 0xff0000);
									int i_322_ = (i_319_ & 0xff) * i_314_ & 0xff00;
									is[i_303_] = (i_320_ | i_321_ | i_322_) >>> 8;
								}
								if (bool_285_ && bool_294_)
									fs[i_303_] = f;
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_315_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 3) {
					int i_323_ = i_295_;
					for (int i_324_ = -i_289_; i_324_ < 0; i_324_++) {
						int i_325_ = (i_296_ >> 16) * anInt8914;
						for (int i_326_ = -i_288_; i_326_ < 0; i_326_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								if (bool) {
									int i_327_ = (anIntArray11347[(i_295_ >> 16) + i_325_]);
									int i_328_ = i_327_ + i_291_;
									int i_329_ = ((i_327_ & 0xff00ff) + (i_291_ & 0xff00ff));
									int i_330_ = ((i_329_ & 0x1000100) + (i_328_ - i_329_ & 0x10000));
									is[i_303_] = i_328_ - i_330_ | i_330_ - (i_330_ >>> 8);
								}
								if (bool_285_ && bool_294_)
									fs[i_303_] = f;
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_323_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 2) {
					int i_331_ = i_291_ >>> 24;
					int i_332_ = 256 - i_331_;
					int i_333_ = (i_291_ & 0xff00ff) * i_332_ & ~0xff00ff;
					int i_334_ = (i_291_ & 0xff00) * i_332_ & 0xff0000;
					i_291_ = (i_333_ | i_334_) >>> 8;
					int i_335_ = i_295_;
					for (int i_336_ = -i_289_; i_336_ < 0; i_336_++) {
						int i_337_ = (i_296_ >> 16) * anInt8914;
						for (int i_338_ = -i_288_; i_338_ < 0; i_338_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								if (bool) {
									int i_339_ = (anIntArray11347[(i_295_ >> 16) + i_337_]);
									i_333_ = ((i_339_ & 0xff00ff) * i_331_ & ~0xff00ff);
									i_334_ = ((i_339_ & 0xff00) * i_331_ & 0xff0000);
									is[i_303_] = ((i_333_ | i_334_) >>> 8) + i_291_;
								}
								if (bool_285_ && bool_294_)
									fs[i_303_] = f;
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_335_;
						i_303_ += i_304_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_292_ == 1) {
				if (i_290_ == 1) {
					int i_340_ = i_295_;
					for (int i_341_ = -i_289_; i_341_ < 0; i_341_++) {
						int i_342_ = (i_296_ >> 16) * anInt8914;
						for (int i_343_ = -i_288_; i_343_ < 0; i_343_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								int i_344_ = anIntArray11347[(i_295_ >> 16) + i_342_];
								if (i_344_ != 0) {
									if (bool)
										is[i_303_] = i_344_;
									if (bool_285_ && bool_294_)
										fs[i_303_] = f;
								}
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_340_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 0) {
					int i_345_ = i_295_;
					if ((i_291_ & 0xffffff) == 16777215) {
						int i_346_ = i_291_ >>> 24;
						int i_347_ = 256 - i_346_;
						for (int i_348_ = -i_289_; i_348_ < 0; i_348_++) {
							int i_349_ = (i_296_ >> 16) * anInt8914;
							for (int i_350_ = -i_288_; i_350_ < 0; i_350_++) {
								if (!bool_285_ || f < fs[i_303_]) {
									int i_351_ = (anIntArray11347[(i_295_ >> 16) + i_349_]);
									if (i_351_ != 0) {
										if (bool) {
											int i_352_ = is[i_303_];
											is[i_303_] = (((((i_351_ & 0xff00ff) * i_346_) + ((i_352_ & 0xff00ff) * i_347_)) & ~0xff00ff) + ((((i_351_ & 0xff00) * i_346_) + ((i_352_ & 0xff00) * i_347_)) & 0xff0000)) >> 8;
										}
										if (bool_285_ && bool_294_)
											fs[i_303_] = f;
									}
								}
								i_295_ += i_299_;
								i_303_++;
							}
							i_296_ += i_300_;
							i_295_ = i_345_;
							i_303_ += i_304_;
						}
					} else {
						int i_353_ = (i_291_ & 0xff0000) >> 16;
						int i_354_ = (i_291_ & 0xff00) >> 8;
						int i_355_ = i_291_ & 0xff;
						int i_356_ = i_291_ >>> 24;
						int i_357_ = 256 - i_356_;
						for (int i_358_ = -i_289_; i_358_ < 0; i_358_++) {
							int i_359_ = (i_296_ >> 16) * anInt8914;
							for (int i_360_ = -i_288_; i_360_ < 0; i_360_++) {
								if (!bool_285_ || f < fs[i_303_]) {
									int i_361_ = (anIntArray11347[(i_295_ >> 16) + i_359_]);
									if (i_361_ != 0) {
										if (i_356_ != 255) {
											if (bool) {
												int i_362_ = (((i_361_ & 0xff0000) * i_353_) & ~0xffffff);
												int i_363_ = (((i_361_ & 0xff00) * i_354_) & 0xff0000);
												int i_364_ = ((i_361_ & 0xff) * i_355_ & 0xff00);
												i_361_ = (i_362_ | i_363_ | i_364_) >>> 8;
												int i_365_ = is[i_303_];
												is[i_303_] = (((((i_361_ & 0xff00ff) * i_356_) + ((i_365_ & 0xff00ff) * i_357_)) & ~0xff00ff) + ((((i_361_ & 0xff00) * i_356_) + ((i_365_ & 0xff00) * i_357_)) & 0xff0000)) >> 8;
											}
											if (bool_285_ && bool_294_)
												fs[i_303_] = f;
										} else {
											if (bool) {
												int i_366_ = (((i_361_ & 0xff0000) * i_353_) & ~0xffffff);
												int i_367_ = (((i_361_ & 0xff00) * i_354_) & 0xff0000);
												int i_368_ = ((i_361_ & 0xff) * i_355_ & 0xff00);
												is[i_303_] = (i_366_ | i_367_ | i_368_) >>> 8;
											}
											if (bool_285_ && bool_294_)
												fs[i_303_] = f;
										}
									}
								}
								i_295_ += i_299_;
								i_303_++;
							}
							i_296_ += i_300_;
							i_295_ = i_345_;
							i_303_ += i_304_;
						}
					}
				} else if (i_290_ == 3) {
					int i_369_ = i_295_;
					int i_370_ = i_291_ >>> 24;
					int i_371_ = 256 - i_370_;
					for (int i_372_ = -i_289_; i_372_ < 0; i_372_++) {
						int i_373_ = (i_296_ >> 16) * anInt8914;
						for (int i_374_ = -i_288_; i_374_ < 0; i_374_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								if (bool) {
									int i_375_ = (anIntArray11347[(i_295_ >> 16) + i_373_]);
									int i_376_ = i_375_ + i_291_;
									int i_377_ = ((i_375_ & 0xff00ff) + (i_291_ & 0xff00ff));
									int i_378_ = ((i_377_ & 0x1000100) + (i_376_ - i_377_ & 0x10000));
									i_378_ = i_376_ - i_378_ | i_378_ - (i_378_ >>> 8);
									if (i_375_ == 0 && i_370_ != 255) {
										i_375_ = i_378_;
										i_378_ = is[i_303_];
										i_378_ = ((((i_375_ & 0xff00ff) * i_370_ + ((i_378_ & 0xff00ff) * i_371_)) & ~0xff00ff) + (((i_375_ & 0xff00) * i_370_ + ((i_378_ & 0xff00) * i_371_)) & 0xff0000)) >> 8;
									}
									is[i_303_] = i_378_;
								}
								if (bool_285_ && bool_294_)
									fs[i_303_] = f;
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_369_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 2) {
					int i_379_ = i_291_ >>> 24;
					int i_380_ = 256 - i_379_;
					int i_381_ = (i_291_ & 0xff00ff) * i_380_ & ~0xff00ff;
					int i_382_ = (i_291_ & 0xff00) * i_380_ & 0xff0000;
					i_291_ = (i_381_ | i_382_) >>> 8;
					int i_383_ = i_295_;
					for (int i_384_ = -i_289_; i_384_ < 0; i_384_++) {
						int i_385_ = (i_296_ >> 16) * anInt8914;
						for (int i_386_ = -i_288_; i_386_ < 0; i_386_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								int i_387_ = anIntArray11347[(i_295_ >> 16) + i_385_];
								if (i_387_ != 0) {
									if (bool) {
										i_381_ = ((i_387_ & 0xff00ff) * i_379_ & ~0xff00ff);
										i_382_ = ((i_387_ & 0xff00) * i_379_ & 0xff0000);
										is[i_303_] = (((i_381_ | i_382_) >>> 8) + i_291_);
									}
									if (bool_285_ && bool_294_)
										fs[i_303_] = f;
								}
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_383_;
						i_303_ += i_304_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_292_ == 2) {
				if (i_290_ == 1) {
					int i_388_ = i_295_;
					for (int i_389_ = -i_289_; i_389_ < 0; i_389_++) {
						int i_390_ = (i_296_ >> 16) * anInt8914;
						for (int i_391_ = -i_288_; i_391_ < 0; i_391_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								int i_392_ = anIntArray11347[(i_295_ >> 16) + i_390_];
								if (i_392_ != 0) {
									if (bool) {
										int i_393_ = is[i_303_];
										int i_394_ = i_392_ + i_393_;
										int i_395_ = ((i_392_ & 0xff00ff) + (i_393_ & 0xff00ff));
										i_393_ = ((i_395_ & 0x1000100) + (i_394_ - i_395_ & 0x10000));
										is[i_303_] = (i_394_ - i_393_ | i_393_ - (i_393_ >>> 8));
									}
									if (bool_285_ && bool_294_)
										fs[i_303_] = f;
								}
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_388_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 0) {
					int i_396_ = i_295_;
					int i_397_ = (i_291_ & 0xff0000) >> 16;
					int i_398_ = (i_291_ & 0xff00) >> 8;
					int i_399_ = i_291_ & 0xff;
					for (int i_400_ = -i_289_; i_400_ < 0; i_400_++) {
						int i_401_ = (i_296_ >> 16) * anInt8914;
						for (int i_402_ = -i_288_; i_402_ < 0; i_402_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								int i_403_ = anIntArray11347[(i_295_ >> 16) + i_401_];
								if (i_403_ != 0) {
									if (bool) {
										int i_404_ = ((i_403_ & 0xff0000) * i_397_ & ~0xffffff);
										int i_405_ = ((i_403_ & 0xff00) * i_398_ & 0xff0000);
										int i_406_ = ((i_403_ & 0xff) * i_399_ & 0xff00);
										i_403_ = (i_404_ | i_405_ | i_406_) >>> 8;
										int i_407_ = is[i_303_];
										int i_408_ = i_403_ + i_407_;
										int i_409_ = ((i_403_ & 0xff00ff) + (i_407_ & 0xff00ff));
										i_407_ = ((i_409_ & 0x1000100) + (i_408_ - i_409_ & 0x10000));
										is[i_303_] = (i_408_ - i_407_ | i_407_ - (i_407_ >>> 8));
									}
									if (bool_285_ && bool_294_)
										fs[i_303_] = f;
								}
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_396_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 3) {
					int i_410_ = i_295_;
					for (int i_411_ = -i_289_; i_411_ < 0; i_411_++) {
						int i_412_ = (i_296_ >> 16) * anInt8914;
						for (int i_413_ = -i_288_; i_413_ < 0; i_413_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								if (bool) {
									int i_414_ = (anIntArray11347[(i_295_ >> 16) + i_412_]);
									int i_415_ = i_414_ + i_291_;
									int i_416_ = ((i_414_ & 0xff00ff) + (i_291_ & 0xff00ff));
									int i_417_ = ((i_416_ & 0x1000100) + (i_415_ - i_416_ & 0x10000));
									i_414_ = i_415_ - i_417_ | i_417_ - (i_417_ >>> 8);
									i_417_ = is[i_303_];
									i_415_ = i_414_ + i_417_;
									i_416_ = (i_414_ & 0xff00ff) + (i_417_ & 0xff00ff);
									i_417_ = ((i_416_ & 0x1000100) + (i_415_ - i_416_ & 0x10000));
									is[i_303_] = i_415_ - i_417_ | i_417_ - (i_417_ >>> 8);
								}
								if (bool_285_ && bool_294_)
									fs[i_303_] = f;
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_410_;
						i_303_ += i_304_;
					}
				} else if (i_290_ == 2) {
					int i_418_ = i_291_ >>> 24;
					int i_419_ = 256 - i_418_;
					int i_420_ = (i_291_ & 0xff00ff) * i_419_ & ~0xff00ff;
					int i_421_ = (i_291_ & 0xff00) * i_419_ & 0xff0000;
					i_291_ = (i_420_ | i_421_) >>> 8;
					int i_422_ = i_295_;
					for (int i_423_ = -i_289_; i_423_ < 0; i_423_++) {
						int i_424_ = (i_296_ >> 16) * anInt8914;
						for (int i_425_ = -i_288_; i_425_ < 0; i_425_++) {
							if (!bool_285_ || f < fs[i_303_]) {
								int i_426_ = anIntArray11347[(i_295_ >> 16) + i_424_];
								if (i_426_ != 0) {
									if (bool) {
										i_420_ = ((i_426_ & 0xff00ff) * i_418_ & ~0xff00ff);
										i_421_ = ((i_426_ & 0xff00) * i_418_ & 0xff0000);
										i_426_ = (((i_420_ | i_421_) >>> 8) + i_291_);
										int i_427_ = is[i_303_];
										int i_428_ = i_426_ + i_427_;
										int i_429_ = ((i_426_ & 0xff00ff) + (i_427_ & 0xff00ff));
										i_427_ = ((i_429_ & 0x1000100) + (i_428_ - i_429_ & 0x10000));
										is[i_303_] = (i_428_ - i_427_ | i_427_ - (i_427_ >>> 8));
									}
									if (bool_285_ && bool_294_)
										fs[i_303_] = f;
								}
							}
							i_295_ += i_299_;
							i_303_++;
						}
						i_296_ += i_300_;
						i_295_ = i_422_;
						i_303_ += i_304_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14404(int i, int i_430_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_431_ = anInt8928;
					while (i_431_ < 0) {
						int i_432_ = anInt8930;
						int i_433_ = anInt8937;
						int i_434_ = anInt8936;
						int i_435_ = anInt8926;
						if (i_433_ >= 0 && i_434_ >= 0 && i_433_ - (anInt8914 << 12) < 0 && i_434_ - (anInt8916 << 12) < 0) {
							for (/**/; i_435_ < 0; i_435_++)
								method17755(((i_434_ >> 12) * anInt8914 + (i_433_ >> 12)), i_432_++, is, i, i_430_);
						}
						i_431_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_436_ = anInt8928;
					while (i_436_ < 0) {
						int i_437_ = anInt8930;
						int i_438_ = anInt8937;
						int i_439_ = anInt8936 + anInt8925;
						int i_440_ = anInt8926;
						if (i_438_ >= 0 && i_438_ - (anInt8914 << 12) < 0) {
							int i_441_;
							if ((i_441_ = i_439_ - (anInt8916 << 12)) >= 0) {
								i_441_ = (anInt8938 - i_441_) / anInt8938;
								i_440_ += i_441_;
								i_439_ += anInt8938 * i_441_;
								i_437_ += i_441_;
							}
							if ((i_441_ = (i_439_ - anInt8938) / anInt8938) > i_440_)
								i_440_ = i_441_;
							for (/**/; i_440_ < 0; i_440_++) {
								method17755(((i_439_ >> 12) * anInt8914 + (i_438_ >> 12)), i_437_++, is, i, i_430_);
								i_439_ += anInt8938;
							}
						}
						i_436_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_442_ = anInt8928;
					while (i_442_ < 0) {
						int i_443_ = anInt8930;
						int i_444_ = anInt8937;
						int i_445_ = anInt8936 + anInt8925;
						int i_446_ = anInt8926;
						if (i_444_ >= 0 && i_444_ - (anInt8914 << 12) < 0) {
							if (i_445_ < 0) {
								int i_447_ = (anInt8938 - 1 - i_445_) / anInt8938;
								i_446_ += i_447_;
								i_445_ += anInt8938 * i_447_;
								i_443_ += i_447_;
							}
							int i_448_;
							if ((i_448_ = (1 + i_445_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_446_)
								i_446_ = i_448_;
							for (/**/; i_446_ < 0; i_446_++) {
								method17755(((i_445_ >> 12) * anInt8914 + (i_444_ >> 12)), i_443_++, is, i, i_430_);
								i_445_ += anInt8938;
							}
						}
						i_442_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_449_ = anInt8928;
					while (i_449_ < 0) {
						int i_450_ = anInt8930;
						int i_451_ = anInt8937 + anInt8939;
						int i_452_ = anInt8936;
						int i_453_ = anInt8926;
						if (i_452_ >= 0 && i_452_ - (anInt8916 << 12) < 0) {
							int i_454_;
							if ((i_454_ = i_451_ - (anInt8914 << 12)) >= 0) {
								i_454_ = (anInt8940 - i_454_) / anInt8940;
								i_453_ += i_454_;
								i_451_ += anInt8940 * i_454_;
								i_450_ += i_454_;
							}
							if ((i_454_ = (i_451_ - anInt8940) / anInt8940) > i_453_)
								i_453_ = i_454_;
							for (/**/; i_453_ < 0; i_453_++) {
								method17755(((i_452_ >> 12) * anInt8914 + (i_451_ >> 12)), i_450_++, is, i, i_430_);
								i_451_ += anInt8940;
							}
						}
						i_449_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_455_ = anInt8928;
					while (i_455_ < 0) {
						int i_456_ = anInt8930;
						int i_457_ = anInt8937 + anInt8939;
						int i_458_ = anInt8936 + anInt8925;
						int i_459_ = anInt8926;
						int i_460_;
						if ((i_460_ = i_457_ - (anInt8914 << 12)) >= 0) {
							i_460_ = (anInt8940 - i_460_) / anInt8940;
							i_459_ += i_460_;
							i_457_ += anInt8940 * i_460_;
							i_458_ += anInt8938 * i_460_;
							i_456_ += i_460_;
						}
						if ((i_460_ = (i_457_ - anInt8940) / anInt8940) > i_459_)
							i_459_ = i_460_;
						if ((i_460_ = i_458_ - (anInt8916 << 12)) >= 0) {
							i_460_ = (anInt8938 - i_460_) / anInt8938;
							i_459_ += i_460_;
							i_457_ += anInt8940 * i_460_;
							i_458_ += anInt8938 * i_460_;
							i_456_ += i_460_;
						}
						if ((i_460_ = (i_458_ - anInt8938) / anInt8938) > i_459_)
							i_459_ = i_460_;
						for (/**/; i_459_ < 0; i_459_++) {
							method17755((i_458_ >> 12) * anInt8914 + (i_457_ >> 12), i_456_++, is, i, i_430_);
							i_457_ += anInt8940;
							i_458_ += anInt8938;
						}
						i_455_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_461_ = anInt8928;
					while (i_461_ < 0) {
						int i_462_ = anInt8930;
						int i_463_ = anInt8937 + anInt8939;
						int i_464_ = anInt8936 + anInt8925;
						int i_465_ = anInt8926;
						int i_466_;
						if ((i_466_ = i_463_ - (anInt8914 << 12)) >= 0) {
							i_466_ = (anInt8940 - i_466_) / anInt8940;
							i_465_ += i_466_;
							i_463_ += anInt8940 * i_466_;
							i_464_ += anInt8938 * i_466_;
							i_462_ += i_466_;
						}
						if ((i_466_ = (i_463_ - anInt8940) / anInt8940) > i_465_)
							i_465_ = i_466_;
						if (i_464_ < 0) {
							i_466_ = (anInt8938 - 1 - i_464_) / anInt8938;
							i_465_ += i_466_;
							i_463_ += anInt8940 * i_466_;
							i_464_ += anInt8938 * i_466_;
							i_462_ += i_466_;
						}
						if ((i_466_ = (1 + i_464_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_465_)
							i_465_ = i_466_;
						for (/**/; i_465_ < 0; i_465_++) {
							method17755((i_464_ >> 12) * anInt8914 + (i_463_ >> 12), i_462_++, is, i, i_430_);
							i_463_ += anInt8940;
							i_464_ += anInt8938;
						}
						i_461_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_467_ = anInt8928;
				while (i_467_ < 0) {
					int i_468_ = anInt8930;
					int i_469_ = anInt8937 + anInt8939;
					int i_470_ = anInt8936;
					int i_471_ = anInt8926;
					if (i_470_ >= 0 && i_470_ - (anInt8916 << 12) < 0) {
						if (i_469_ < 0) {
							int i_472_ = (anInt8940 - 1 - i_469_) / anInt8940;
							i_471_ += i_472_;
							i_469_ += anInt8940 * i_472_;
							i_468_ += i_472_;
						}
						int i_473_;
						if ((i_473_ = (1 + i_469_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_471_)
							i_471_ = i_473_;
						for (/**/; i_471_ < 0; i_471_++) {
							method17755((i_470_ >> 12) * anInt8914 + (i_469_ >> 12), i_468_++, is, i, i_430_);
							i_469_ += anInt8940;
						}
					}
					i_467_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				for (int i_474_ = anInt8928; i_474_ < 0; i_474_++) {
					int i_475_ = anInt8930;
					int i_476_ = anInt8937 + anInt8939;
					int i_477_ = anInt8936 + anInt8925;
					int i_478_ = anInt8926;
					if (i_476_ < 0) {
						int i_479_ = (anInt8940 - 1 - i_476_) / anInt8940;
						i_478_ += i_479_;
						i_476_ += anInt8940 * i_479_;
						i_477_ += anInt8938 * i_479_;
						i_475_ += i_479_;
					}
					int i_480_;
					if ((i_480_ = ((1 + i_476_ - (anInt8914 << 12) - anInt8940) / anInt8940)) > i_478_)
						i_478_ = i_480_;
					if ((i_480_ = i_477_ - (anInt8916 << 12)) >= 0) {
						i_480_ = (anInt8938 - i_480_) / anInt8938;
						i_478_ += i_480_;
						i_476_ += anInt8940 * i_480_;
						i_477_ += anInt8938 * i_480_;
						i_475_ += i_480_;
					}
					if ((i_480_ = (i_477_ - anInt8938) / anInt8938) > i_478_)
						i_478_ = i_480_;
					for (/**/; i_478_ < 0; i_478_++) {
						method17755((i_477_ >> 12) * anInt8914 + (i_476_ >> 12), i_475_++, is, i, i_430_);
						i_476_ += anInt8940;
						i_477_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				for (int i_481_ = anInt8928; i_481_ < 0; i_481_++) {
					int i_482_ = anInt8930;
					int i_483_ = anInt8937 + anInt8939;
					int i_484_ = anInt8936 + anInt8925;
					int i_485_ = anInt8926;
					if (i_483_ < 0) {
						int i_486_ = (anInt8940 - 1 - i_483_) / anInt8940;
						i_485_ += i_486_;
						i_483_ += anInt8940 * i_486_;
						i_484_ += anInt8938 * i_486_;
						i_482_ += i_486_;
					}
					int i_487_;
					if ((i_487_ = ((1 + i_483_ - (anInt8914 << 12) - anInt8940) / anInt8940)) > i_485_)
						i_485_ = i_487_;
					if (i_484_ < 0) {
						i_487_ = (anInt8938 - 1 - i_484_) / anInt8938;
						i_485_ += i_487_;
						i_483_ += anInt8940 * i_487_;
						i_484_ += anInt8938 * i_487_;
						i_482_ += i_487_;
					}
					if ((i_487_ = ((1 + i_484_ - (anInt8916 << 12) - anInt8938) / anInt8938)) > i_485_)
						i_485_ = i_487_;
					for (/**/; i_485_ < 0; i_485_++) {
						method17755((i_484_ >> 12) * anInt8914 + (i_483_ >> 12), i_482_++, is, i, i_430_);
						i_483_ += anInt8940;
						i_484_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	Class148_Sub1_Sub3(Class178_Sub3 class178_sub3, int[] is, int i, int i_488_, int i_489_, int i_490_, boolean bool) {
		super(class178_sub3, i_489_, i_490_);
		if (bool)
			anIntArray11347 = new int[i_489_ * i_490_];
		else
			anIntArray11347 = is;
		i_488_ -= anInt8914;
		int i_491_ = 0;
		for (int i_492_ = 0; i_492_ < i_490_; i_492_++) {
			for (int i_493_ = 0; i_493_ < i_489_; i_493_++) {
				int i_494_ = is[i++];
				if (i_494_ >>> 24 == 255)
					anIntArray11347[i_491_++] = (i_494_ & 0xffffff) == 0 ? -16777215 : i_494_;
				else
					anIntArray11347[i_491_++] = 0;
			}
			i += i_488_;
		}
	}

	void method17755(int i, int i_495_, int[] is, int i_496_, int i_497_) {
		if (i_497_ == 0) {
			if (i_496_ == 1)
				is[i_495_] = anIntArray11347[i];
			else if (i_496_ == 0) {
				int i_498_ = anIntArray11347[i++];
				int i_499_ = (i_498_ & 0xff0000) * anInt8944 & ~0xffffff;
				int i_500_ = (i_498_ & 0xff00) * anInt8945 & 0xff0000;
				int i_501_ = (i_498_ & 0xff) * anInt8946 & 0xff00;
				is[i_495_] = (i_499_ | i_500_ | i_501_) >>> 8;
			} else if (i_496_ == 3) {
				int i_502_ = anIntArray11347[i++];
				int i_503_ = anInt8941;
				int i_504_ = i_502_ + i_503_;
				int i_505_ = (i_502_ & 0xff00ff) + (i_503_ & 0xff00ff);
				int i_506_ = (i_505_ & 0x1000100) + (i_504_ - i_505_ & 0x10000);
				is[i_495_] = i_504_ - i_506_ | i_506_ - (i_506_ >>> 8);
			} else if (i_496_ == 2) {
				int i_507_ = anIntArray11347[i];
				int i_508_ = (i_507_ & 0xff00ff) * anInt8942 & ~0xff00ff;
				int i_509_ = (i_507_ & 0xff00) * anInt8942 & 0xff0000;
				is[i_495_] = ((i_508_ | i_509_) >>> 8) + anInt8949;
			} else
				throw new IllegalArgumentException();
		} else if (i_497_ == 1) {
			if (i_496_ == 1) {
				int i_510_ = anIntArray11347[i];
				if (i_510_ != 0)
					is[i_495_] = i_510_;
			} else if (i_496_ == 0) {
				int i_511_ = anIntArray11347[i];
				if (i_511_ != 0) {
					if ((anInt8941 & 0xffffff) == 16777215) {
						int i_512_ = anInt8941 >>> 24;
						int i_513_ = 256 - i_512_;
						int i_514_ = is[i_495_];
						is[i_495_] = ((((i_511_ & 0xff00ff) * i_512_ + (i_514_ & 0xff00ff) * i_513_) & ~0xff00ff) + (((i_511_ & 0xff00) * i_512_ + (i_514_ & 0xff00) * i_513_) & 0xff0000)) >> 8;
					} else if (anInt8942 != 255) {
						int i_515_ = (i_511_ & 0xff0000) * anInt8944 & ~0xffffff;
						int i_516_ = (i_511_ & 0xff00) * anInt8945 & 0xff0000;
						int i_517_ = (i_511_ & 0xff) * anInt8946 & 0xff00;
						i_511_ = (i_515_ | i_516_ | i_517_) >>> 8;
						int i_518_ = is[i_495_];
						is[i_495_] = ((((i_511_ & 0xff00ff) * anInt8942 + (i_518_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_511_ & 0xff00) * anInt8942 + (i_518_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
					} else {
						int i_519_ = (i_511_ & 0xff0000) * anInt8944 & ~0xffffff;
						int i_520_ = (i_511_ & 0xff00) * anInt8945 & 0xff0000;
						int i_521_ = (i_511_ & 0xff) * anInt8946 & 0xff00;
						is[i_495_] = (i_519_ | i_520_ | i_521_) >>> 8;
					}
				}
			} else if (i_496_ == 3) {
				int i_522_ = anIntArray11347[i];
				int i_523_ = anInt8941;
				int i_524_ = i_522_ + i_523_;
				int i_525_ = (i_522_ & 0xff00ff) + (i_523_ & 0xff00ff);
				int i_526_ = (i_525_ & 0x1000100) + (i_524_ - i_525_ & 0x10000);
				i_526_ = i_524_ - i_526_ | i_526_ - (i_526_ >>> 8);
				if (i_522_ == 0 && anInt8942 != 255) {
					i_522_ = i_526_;
					i_526_ = is[i_495_];
					i_526_ = ((((i_522_ & 0xff00ff) * anInt8942 + (i_526_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_522_ & 0xff00) * anInt8942 + (i_526_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
				}
				is[i_495_] = i_526_;
			} else if (i_496_ == 2) {
				int i_527_ = anIntArray11347[i];
				if (i_527_ != 0) {
					int i_528_ = (i_527_ & 0xff00ff) * anInt8942 & ~0xff00ff;
					int i_529_ = (i_527_ & 0xff00) * anInt8942 & 0xff0000;
					is[i_495_++] = ((i_528_ | i_529_) >>> 8) + anInt8949;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_497_ == 2) {
			if (i_496_ == 1) {
				int i_530_ = anIntArray11347[i];
				if (i_530_ != 0) {
					int i_531_ = is[i_495_];
					int i_532_ = i_530_ + i_531_;
					int i_533_ = (i_530_ & 0xff00ff) + (i_531_ & 0xff00ff);
					i_531_ = (i_533_ & 0x1000100) + (i_532_ - i_533_ & 0x10000);
					is[i_495_] = i_532_ - i_531_ | i_531_ - (i_531_ >>> 8);
				}
			} else if (i_496_ == 0) {
				int i_534_ = anIntArray11347[i];
				if (i_534_ != 0) {
					int i_535_ = (i_534_ & 0xff0000) * anInt8944 & ~0xffffff;
					int i_536_ = (i_534_ & 0xff00) * anInt8945 & 0xff0000;
					int i_537_ = (i_534_ & 0xff) * anInt8946 & 0xff00;
					i_534_ = (i_535_ | i_536_ | i_537_) >>> 8;
					int i_538_ = is[i_495_];
					int i_539_ = i_534_ + i_538_;
					int i_540_ = (i_534_ & 0xff00ff) + (i_538_ & 0xff00ff);
					i_538_ = (i_540_ & 0x1000100) + (i_539_ - i_540_ & 0x10000);
					is[i_495_] = i_539_ - i_538_ | i_538_ - (i_538_ >>> 8);
				}
			} else if (i_496_ == 3) {
				int i_541_ = anIntArray11347[i];
				int i_542_ = anInt8941;
				int i_543_ = i_541_ + i_542_;
				int i_544_ = (i_541_ & 0xff00ff) + (i_542_ & 0xff00ff);
				int i_545_ = (i_544_ & 0x1000100) + (i_543_ - i_544_ & 0x10000);
				i_541_ = i_543_ - i_545_ | i_545_ - (i_545_ >>> 8);
				i_545_ = is[i_495_];
				i_543_ = i_541_ + i_545_;
				i_544_ = (i_541_ & 0xff00ff) + (i_545_ & 0xff00ff);
				i_545_ = (i_544_ & 0x1000100) + (i_543_ - i_544_ & 0x10000);
				is[i_495_] = i_543_ - i_545_ | i_545_ - (i_545_ >>> 8);
			} else if (i_496_ == 2) {
				int i_546_ = anIntArray11347[i];
				if (i_546_ != 0) {
					int i_547_ = (i_546_ & 0xff00ff) * anInt8942 & ~0xff00ff;
					int i_548_ = (i_546_ & 0xff00) * anInt8942 & 0xff0000;
					i_546_ = ((i_547_ | i_548_) >>> 8) + anInt8949;
					int i_549_ = is[i_495_];
					int i_550_ = i_546_ + i_549_;
					int i_551_ = (i_546_ & 0xff00ff) + (i_549_ & 0xff00ff);
					i_549_ = (i_551_ & 0x1000100) + (i_550_ - i_551_ & 0x10000);
					is[i_495_] = i_550_ - i_549_ | i_549_ - (i_549_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	public void method2456(int i, int i_552_, int i_553_, int i_554_, int[] is, int[] is_555_, int i_556_, int i_557_) {
		method17754(i, i_552_, i_553_, i_554_, is, i_556_, i_557_);
	}

	public void method2506(int i, int i_558_, int i_559_, int i_560_, int[] is, int i_561_, int i_562_) {
		i_562_ -= i_559_;
		for (int i_563_ = 0; i_563_ < i_560_; i_563_++) {
			int i_564_ = (i_558_ + i_563_) * i_559_ + i;
			for (int i_565_ = 0; i_565_ < i_559_; i_565_++)
				anIntArray11347[i_564_ + i_565_] = is[i_561_++];
			i_561_ += i_562_;
		}
	}

	public void method2454(int i, int i_566_, int i_567_, int i_568_, int[] is, int i_569_, int i_570_) {
		i_570_ -= i_567_;
		for (int i_571_ = 0; i_571_ < i_568_; i_571_++) {
			int i_572_ = (i_566_ + i_571_) * i_567_ + i;
			for (int i_573_ = 0; i_573_ < i_567_; i_573_++)
				anIntArray11347[i_572_ + i_573_] = is[i_569_++];
			i_569_ += i_570_;
		}
	}

	public void method2437(int i, int i_574_, int i_575_, int i_576_, int[] is, int i_577_, int i_578_) {
		i_578_ -= i_575_;
		for (int i_579_ = 0; i_579_ < i_576_; i_579_++) {
			int i_580_ = (i_574_ + i_579_) * i_575_ + i;
			for (int i_581_ = 0; i_581_ < i_575_; i_581_++)
				anIntArray11347[i_580_ + i_581_] = is[i_577_++];
			i_577_ += i_578_;
		}
	}

	void method14409(int[] is, int[] is_582_, int i, int i_583_) {
		int[] is_584_ = aClass178_Sub3_8923.anIntArray9804;
		if (is_584_ != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_585_ = anInt8928;
					while (i_585_ < 0) {
						int i_586_ = i_585_ + i_583_;
						if (i_586_ >= 0) {
							if (i_586_ >= is.length)
								break;
							int i_587_ = anInt8930;
							int i_588_ = anInt8937;
							int i_589_ = anInt8936;
							int i_590_ = anInt8926;
							if (i_588_ >= 0 && i_589_ >= 0 && i_588_ - (anInt8914 << 12) < 0 && i_589_ - (anInt8916 << 12) < 0) {
								int i_591_ = is[i_586_] - i;
								int i_592_ = -is_582_[i_586_];
								int i_593_ = i_591_ - (i_587_ - anInt8930);
								if (i_593_ > 0) {
									i_587_ += i_593_;
									i_590_ += i_593_;
									i_588_ += anInt8940 * i_593_;
									i_589_ += anInt8938 * i_593_;
								} else
									i_592_ -= i_593_;
								if (i_590_ < i_592_)
									i_590_ = i_592_;
								for (/**/; i_590_ < 0; i_590_++) {
									int i_594_ = (anIntArray11347[((i_589_ >> 12) * anInt8914 + (i_588_ >> 12))]);
									if (i_594_ != 0)
										is_584_[i_587_++] = i_594_;
									else
										i_587_++;
								}
							}
						}
						i_585_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_595_ = anInt8928;
					while (i_595_ < 0) {
						int i_596_ = i_595_ + i_583_;
						if (i_596_ >= 0) {
							if (i_596_ >= is.length)
								break;
							int i_597_ = anInt8930;
							int i_598_ = anInt8937;
							int i_599_ = anInt8936 + anInt8925;
							int i_600_ = anInt8926;
							if (i_598_ >= 0 && i_598_ - (anInt8914 << 12) < 0) {
								int i_601_;
								if ((i_601_ = i_599_ - (anInt8916 << 12)) >= 0) {
									i_601_ = (anInt8938 - i_601_) / anInt8938;
									i_600_ += i_601_;
									i_599_ += anInt8938 * i_601_;
									i_597_ += i_601_;
								}
								if ((i_601_ = (i_599_ - anInt8938) / anInt8938) > i_600_)
									i_600_ = i_601_;
								int i_602_ = is[i_596_] - i;
								int i_603_ = -is_582_[i_596_];
								int i_604_ = i_602_ - (i_597_ - anInt8930);
								if (i_604_ > 0) {
									i_597_ += i_604_;
									i_600_ += i_604_;
									i_598_ += anInt8940 * i_604_;
									i_599_ += anInt8938 * i_604_;
								} else
									i_603_ -= i_604_;
								if (i_600_ < i_603_)
									i_600_ = i_603_;
								for (/**/; i_600_ < 0; i_600_++) {
									int i_605_ = (anIntArray11347[((i_599_ >> 12) * anInt8914 + (i_598_ >> 12))]);
									if (i_605_ != 0)
										is_584_[i_597_++] = i_605_;
									else
										i_597_++;
									i_599_ += anInt8938;
								}
							}
						}
						i_595_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_606_ = anInt8928;
					while (i_606_ < 0) {
						int i_607_ = i_606_ + i_583_;
						if (i_607_ >= 0) {
							if (i_607_ >= is.length)
								break;
							int i_608_ = anInt8930;
							int i_609_ = anInt8937;
							int i_610_ = anInt8936 + anInt8925;
							int i_611_ = anInt8926;
							if (i_609_ >= 0 && i_609_ - (anInt8914 << 12) < 0) {
								if (i_610_ < 0) {
									int i_612_ = (anInt8938 - 1 - i_610_) / anInt8938;
									i_611_ += i_612_;
									i_610_ += anInt8938 * i_612_;
									i_608_ += i_612_;
								}
								int i_613_;
								if ((i_613_ = (1 + i_610_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_611_)
									i_611_ = i_613_;
								int i_614_ = is[i_607_] - i;
								int i_615_ = -is_582_[i_607_];
								int i_616_ = i_614_ - (i_608_ - anInt8930);
								if (i_616_ > 0) {
									i_608_ += i_616_;
									i_611_ += i_616_;
									i_609_ += anInt8940 * i_616_;
									i_610_ += anInt8938 * i_616_;
								} else
									i_615_ -= i_616_;
								if (i_611_ < i_615_)
									i_611_ = i_615_;
								for (/**/; i_611_ < 0; i_611_++) {
									int i_617_ = (anIntArray11347[((i_610_ >> 12) * anInt8914 + (i_609_ >> 12))]);
									if (i_617_ != 0)
										is_584_[i_608_++] = i_617_;
									else
										i_608_++;
									i_610_ += anInt8938;
								}
							}
						}
						i_606_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_618_ = anInt8928;
					while (i_618_ < 0) {
						int i_619_ = i_618_ + i_583_;
						if (i_619_ >= 0) {
							if (i_619_ >= is.length)
								break;
							int i_620_ = anInt8930;
							int i_621_ = anInt8937 + anInt8939;
							int i_622_ = anInt8936;
							int i_623_ = anInt8926;
							if (i_622_ >= 0 && i_622_ - (anInt8916 << 12) < 0) {
								int i_624_;
								if ((i_624_ = i_621_ - (anInt8914 << 12)) >= 0) {
									i_624_ = (anInt8940 - i_624_) / anInt8940;
									i_623_ += i_624_;
									i_621_ += anInt8940 * i_624_;
									i_620_ += i_624_;
								}
								if ((i_624_ = (i_621_ - anInt8940) / anInt8940) > i_623_)
									i_623_ = i_624_;
								int i_625_ = is[i_619_] - i;
								int i_626_ = -is_582_[i_619_];
								int i_627_ = i_625_ - (i_620_ - anInt8930);
								if (i_627_ > 0) {
									i_620_ += i_627_;
									i_623_ += i_627_;
									i_621_ += anInt8940 * i_627_;
									i_622_ += anInt8938 * i_627_;
								} else
									i_626_ -= i_627_;
								if (i_623_ < i_626_)
									i_623_ = i_626_;
								for (/**/; i_623_ < 0; i_623_++) {
									int i_628_ = (anIntArray11347[((i_622_ >> 12) * anInt8914 + (i_621_ >> 12))]);
									if (i_628_ != 0)
										is_584_[i_620_++] = i_628_;
									else
										i_620_++;
									i_621_ += anInt8940;
								}
							}
						}
						i_618_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_629_ = anInt8928;
					while (i_629_ < 0) {
						int i_630_ = i_629_ + i_583_;
						if (i_630_ >= 0) {
							if (i_630_ >= is.length)
								break;
							int i_631_ = anInt8930;
							int i_632_ = anInt8937 + anInt8939;
							int i_633_ = anInt8936 + anInt8925;
							int i_634_ = anInt8926;
							int i_635_;
							if ((i_635_ = i_632_ - (anInt8914 << 12)) >= 0) {
								i_635_ = (anInt8940 - i_635_) / anInt8940;
								i_634_ += i_635_;
								i_632_ += anInt8940 * i_635_;
								i_633_ += anInt8938 * i_635_;
								i_631_ += i_635_;
							}
							if ((i_635_ = (i_632_ - anInt8940) / anInt8940) > i_634_)
								i_634_ = i_635_;
							if ((i_635_ = i_633_ - (anInt8916 << 12)) >= 0) {
								i_635_ = (anInt8938 - i_635_) / anInt8938;
								i_634_ += i_635_;
								i_632_ += anInt8940 * i_635_;
								i_633_ += anInt8938 * i_635_;
								i_631_ += i_635_;
							}
							if ((i_635_ = (i_633_ - anInt8938) / anInt8938) > i_634_)
								i_634_ = i_635_;
							int i_636_ = is[i_630_] - i;
							int i_637_ = -is_582_[i_630_];
							int i_638_ = i_636_ - (i_631_ - anInt8930);
							if (i_638_ > 0) {
								i_631_ += i_638_;
								i_634_ += i_638_;
								i_632_ += anInt8940 * i_638_;
								i_633_ += anInt8938 * i_638_;
							} else
								i_637_ -= i_638_;
							if (i_634_ < i_637_)
								i_634_ = i_637_;
							for (/**/; i_634_ < 0; i_634_++) {
								int i_639_ = (anIntArray11347[(i_633_ >> 12) * anInt8914 + (i_632_ >> 12)]);
								if (i_639_ != 0)
									is_584_[i_631_++] = i_639_;
								else
									i_631_++;
								i_632_ += anInt8940;
								i_633_ += anInt8938;
							}
						}
						i_629_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_640_ = anInt8928;
					while (i_640_ < 0) {
						int i_641_ = i_640_ + i_583_;
						if (i_641_ >= 0) {
							if (i_641_ >= is.length)
								break;
							int i_642_ = anInt8930;
							int i_643_ = anInt8937 + anInt8939;
							int i_644_ = anInt8936 + anInt8925;
							int i_645_ = anInt8926;
							int i_646_;
							if ((i_646_ = i_643_ - (anInt8914 << 12)) >= 0) {
								i_646_ = (anInt8940 - i_646_) / anInt8940;
								i_645_ += i_646_;
								i_643_ += anInt8940 * i_646_;
								i_644_ += anInt8938 * i_646_;
								i_642_ += i_646_;
							}
							if ((i_646_ = (i_643_ - anInt8940) / anInt8940) > i_645_)
								i_645_ = i_646_;
							if (i_644_ < 0) {
								i_646_ = (anInt8938 - 1 - i_644_) / anInt8938;
								i_645_ += i_646_;
								i_643_ += anInt8940 * i_646_;
								i_644_ += anInt8938 * i_646_;
								i_642_ += i_646_;
							}
							if ((i_646_ = (1 + i_644_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_645_)
								i_645_ = i_646_;
							int i_647_ = is[i_641_] - i;
							int i_648_ = -is_582_[i_641_];
							int i_649_ = i_647_ - (i_642_ - anInt8930);
							if (i_649_ > 0) {
								i_642_ += i_649_;
								i_645_ += i_649_;
								i_643_ += anInt8940 * i_649_;
								i_644_ += anInt8938 * i_649_;
							} else
								i_648_ -= i_649_;
							if (i_645_ < i_648_)
								i_645_ = i_648_;
							for (/**/; i_645_ < 0; i_645_++) {
								int i_650_ = (anIntArray11347[(i_644_ >> 12) * anInt8914 + (i_643_ >> 12)]);
								if (i_650_ != 0)
									is_584_[i_642_++] = i_650_;
								else
									i_642_++;
								i_643_ += anInt8940;
								i_644_ += anInt8938;
							}
						}
						i_640_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_651_ = anInt8928;
				while (i_651_ < 0) {
					int i_652_ = i_651_ + i_583_;
					if (i_652_ >= 0) {
						if (i_652_ >= is.length)
							break;
						int i_653_ = anInt8930;
						int i_654_ = anInt8937 + anInt8939;
						int i_655_ = anInt8936;
						int i_656_ = anInt8926;
						if (i_655_ >= 0 && i_655_ - (anInt8916 << 12) < 0) {
							if (i_654_ < 0) {
								int i_657_ = (anInt8940 - 1 - i_654_) / anInt8940;
								i_656_ += i_657_;
								i_654_ += anInt8940 * i_657_;
								i_653_ += i_657_;
							}
							int i_658_;
							if ((i_658_ = (1 + i_654_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_656_)
								i_656_ = i_658_;
							int i_659_ = is[i_652_] - i;
							int i_660_ = -is_582_[i_652_];
							int i_661_ = i_659_ - (i_653_ - anInt8930);
							if (i_661_ > 0) {
								i_653_ += i_661_;
								i_656_ += i_661_;
								i_654_ += anInt8940 * i_661_;
								i_655_ += anInt8938 * i_661_;
							} else
								i_660_ -= i_661_;
							if (i_656_ < i_660_)
								i_656_ = i_660_;
							for (/**/; i_656_ < 0; i_656_++) {
								int i_662_ = (anIntArray11347[(i_655_ >> 12) * anInt8914 + (i_654_ >> 12)]);
								if (i_662_ != 0)
									is_584_[i_653_++] = i_662_;
								else
									i_653_++;
								i_654_ += anInt8940;
							}
						}
					}
					i_651_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				int i_663_ = anInt8928;
				while (i_663_ < 0) {
					int i_664_ = i_663_ + i_583_;
					if (i_664_ >= 0) {
						if (i_664_ >= is.length)
							break;
						int i_665_ = anInt8930;
						int i_666_ = anInt8937 + anInt8939;
						int i_667_ = anInt8936 + anInt8925;
						int i_668_ = anInt8926;
						if (i_666_ < 0) {
							int i_669_ = (anInt8940 - 1 - i_666_) / anInt8940;
							i_668_ += i_669_;
							i_666_ += anInt8940 * i_669_;
							i_667_ += anInt8938 * i_669_;
							i_665_ += i_669_;
						}
						int i_670_;
						if ((i_670_ = (1 + i_666_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_668_)
							i_668_ = i_670_;
						if ((i_670_ = i_667_ - (anInt8916 << 12)) >= 0) {
							i_670_ = (anInt8938 - i_670_) / anInt8938;
							i_668_ += i_670_;
							i_666_ += anInt8940 * i_670_;
							i_667_ += anInt8938 * i_670_;
							i_665_ += i_670_;
						}
						if ((i_670_ = (i_667_ - anInt8938) / anInt8938) > i_668_)
							i_668_ = i_670_;
						int i_671_ = is[i_664_] - i;
						int i_672_ = -is_582_[i_664_];
						int i_673_ = i_671_ - (i_665_ - anInt8930);
						if (i_673_ > 0) {
							i_665_ += i_673_;
							i_668_ += i_673_;
							i_666_ += anInt8940 * i_673_;
							i_667_ += anInt8938 * i_673_;
						} else
							i_672_ -= i_673_;
						if (i_668_ < i_672_)
							i_668_ = i_672_;
						for (/**/; i_668_ < 0; i_668_++) {
							int i_674_ = (anIntArray11347[(i_667_ >> 12) * anInt8914 + (i_666_ >> 12)]);
							if (i_674_ != 0)
								is_584_[i_665_++] = i_674_;
							else
								i_665_++;
							i_666_ += anInt8940;
							i_667_ += anInt8938;
						}
					}
					i_663_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				int i_675_ = anInt8928;
				while (i_675_ < 0) {
					int i_676_ = i_675_ + i_583_;
					if (i_676_ >= 0) {
						if (i_676_ >= is.length)
							break;
						int i_677_ = anInt8930;
						int i_678_ = anInt8937 + anInt8939;
						int i_679_ = anInt8936 + anInt8925;
						int i_680_ = anInt8926;
						if (i_678_ < 0) {
							int i_681_ = (anInt8940 - 1 - i_678_) / anInt8940;
							i_680_ += i_681_;
							i_678_ += anInt8940 * i_681_;
							i_679_ += anInt8938 * i_681_;
							i_677_ += i_681_;
						}
						int i_682_;
						if ((i_682_ = (1 + i_678_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_680_)
							i_680_ = i_682_;
						if (i_679_ < 0) {
							i_682_ = (anInt8938 - 1 - i_679_) / anInt8938;
							i_680_ += i_682_;
							i_678_ += anInt8940 * i_682_;
							i_679_ += anInt8938 * i_682_;
							i_677_ += i_682_;
						}
						if ((i_682_ = (1 + i_679_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_680_)
							i_680_ = i_682_;
						int i_683_ = is[i_676_] - i;
						int i_684_ = -is_582_[i_676_];
						int i_685_ = i_683_ - (i_677_ - anInt8930);
						if (i_685_ > 0) {
							i_677_ += i_685_;
							i_680_ += i_685_;
							i_678_ += anInt8940 * i_685_;
							i_679_ += anInt8938 * i_685_;
						} else
							i_684_ -= i_685_;
						if (i_680_ < i_684_)
							i_680_ = i_684_;
						for (/**/; i_680_ < 0; i_680_++) {
							int i_686_ = (anIntArray11347[(i_679_ >> 12) * anInt8914 + (i_678_ >> 12)]);
							if (i_686_ != 0)
								is_584_[i_677_++] = i_686_;
							else
								i_677_++;
							i_678_ += anInt8940;
							i_679_ += anInt8938;
						}
					}
					i_675_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public Interface22 method2471() {
		return new Class102(anInt8914, anInt8916, anIntArray11347);
	}

	void method17756(int i, int i_687_, int i_688_, int i_689_, int[] is, int i_690_, int i_691_) {
		i_691_ -= i_688_;
		for (int i_692_ = 0; i_692_ < i_689_; i_692_++) {
			int i_693_ = (i_687_ + i_692_) * i_688_ + i;
			for (int i_694_ = 0; i_694_ < i_688_; i_694_++)
				is[i_690_++] = anIntArray11347[i_693_ + i_694_];
			i_690_ += i_691_;
		}
	}

	Class148_Sub1_Sub3(Class178_Sub3 class178_sub3, int i, int i_695_) {
		super(class178_sub3, i, i_695_);
		anIntArray11347 = new int[i * i_695_];
	}

	public void method2441(int i, int i_696_, int i_697_, int i_698_, int[] is, int[] is_699_, int i_700_, int i_701_) {
		method17754(i, i_696_, i_697_, i_698_, is, i_700_, i_701_);
	}

	public void method2459(int i, int i_702_, int i_703_, int i_704_, int[] is, int[] is_705_, int i_706_, int i_707_) {
		method17754(i, i_702_, i_703_, i_704_, is, i_706_, i_707_);
	}

	public void method2460(int i, int i_708_, int i_709_, int i_710_, int i_711_, int i_712_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_713_ = 0; i_713_ < i_710_; i_713_++) {
			int i_714_ = (i_708_ + i_713_) * anInt8914 + i;
			int i_715_ = ((i_712_ + i_713_) * (aClass178_Sub3_8923.anInt9825 * 1013077751) + i_711_);
			for (int i_716_ = 0; i_716_ < i_709_; i_716_++)
				anIntArray11347[i_714_ + i_716_] = is[i_715_ + i_716_];
		}
	}

	public void method2462(int i, int i_717_, int i_718_) {
		throw new IllegalStateException("");
	}

	public void method2482(int i, int i_719_, Class145 class145, int i_720_, int i_721_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_719_ += anInt8918;
			int i_722_ = 0;
			int i_723_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_724_ = anInt8914;
			int i_725_ = anInt8916;
			int i_726_ = i_723_ - i_724_;
			int i_727_ = 0;
			int i_728_ = i + i_719_ * i_723_;
			if (i_719_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_729_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_719_;
				i_725_ -= i_729_;
				i_719_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_722_ += i_729_ * i_724_;
				i_728_ += i_729_ * i_723_;
			}
			if (i_719_ + i_725_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_725_ -= (i_719_ + i_725_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_730_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_724_ -= i_730_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_722_ += i_730_;
				i_728_ += i_730_;
				i_727_ += i_730_;
				i_726_ += i_730_;
			}
			if (i + i_724_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_731_ = i + i_724_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_724_ -= i_731_;
				i_727_ += i_731_;
				i_726_ += i_731_;
			}
			if (i_724_ > 0 && i_725_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_732_ = class145_sub1.anIntArray9521;
				int[] is_733_ = class145_sub1.anIntArray9520;
				int i_734_ = i_719_;
				if (i_721_ > i_734_) {
					i_734_ = i_721_;
					i_728_ += (i_721_ - i_719_) * i_723_;
					i_722_ += (i_721_ - i_719_) * anInt8914;
				}
				int i_735_ = (i_721_ + is_732_.length < i_719_ + i_725_ ? i_721_ + is_732_.length : i_719_ + i_725_);
				for (int i_736_ = i_734_; i_736_ < i_735_; i_736_++) {
					int i_737_ = is_732_[i_736_ - i_721_] + i_720_;
					int i_738_ = is_733_[i_736_ - i_721_];
					int i_739_ = i_724_;
					if (i > i_737_) {
						int i_740_ = i - i_737_;
						if (i_740_ >= i_738_) {
							i_722_ += i_724_ + i_727_;
							i_728_ += i_724_ + i_726_;
							continue;
						}
						i_738_ -= i_740_;
					} else {
						int i_741_ = i_737_ - i;
						if (i_741_ >= i_724_) {
							i_722_ += i_724_ + i_727_;
							i_728_ += i_724_ + i_726_;
							continue;
						}
						i_722_ += i_741_;
						i_739_ -= i_741_;
						i_728_ += i_741_;
					}
					int i_742_ = 0;
					if (i_739_ < i_738_)
						i_738_ = i_739_;
					else
						i_742_ = i_739_ - i_738_;
					for (int i_743_ = -i_738_; i_743_ < 0; i_743_++) {
						int i_744_ = anIntArray11347[i_722_++];
						if (i_744_ != 0)
							is[i_728_++] = i_744_;
						else
							i_728_++;
					}
					i_722_ += i_742_ + i_727_;
					i_728_ += i_742_ + i_726_;
				}
			}
		}
	}

	public void method2463(int i, int i_745_, int i_746_, int i_747_, int i_748_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_749_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_745_ += anInt8918;
			int i_750_ = i_745_ * i_749_ + i;
			int i_751_ = 0;
			int i_752_ = anInt8916;
			int i_753_ = anInt8914;
			int i_754_ = i_749_ - i_753_;
			int i_755_ = 0;
			if (i_745_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_756_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_745_;
				i_752_ -= i_756_;
				i_745_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_751_ += i_756_ * i_753_;
				i_750_ += i_756_ * i_749_;
			}
			if (i_745_ + i_752_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_752_ -= (i_745_ + i_752_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_757_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_753_ -= i_757_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_751_ += i_757_;
				i_750_ += i_757_;
				i_755_ += i_757_;
				i_754_ += i_757_;
			}
			if (i + i_753_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_758_ = i + i_753_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_753_ -= i_758_;
				i_755_ += i_758_;
				i_754_ += i_758_;
			}
			if (i_753_ > 0 && i_752_ > 0) {
				if (i_748_ == 0) {
					if (i_746_ == 1) {
						for (int i_759_ = -i_752_; i_759_ < 0; i_759_++) {
							int i_760_ = i_750_ + i_753_ - 3;
							while (i_750_ < i_760_) {
								is[i_750_++] = anIntArray11347[i_751_++];
								is[i_750_++] = anIntArray11347[i_751_++];
								is[i_750_++] = anIntArray11347[i_751_++];
								is[i_750_++] = anIntArray11347[i_751_++];
							}
							i_760_ += 3;
							while (i_750_ < i_760_)
								is[i_750_++] = anIntArray11347[i_751_++];
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 0) {
						int i_761_ = (i_747_ & 0xff0000) >> 16;
						int i_762_ = (i_747_ & 0xff00) >> 8;
						int i_763_ = i_747_ & 0xff;
						for (int i_764_ = -i_752_; i_764_ < 0; i_764_++) {
							for (int i_765_ = -i_753_; i_765_ < 0; i_765_++) {
								int i_766_ = anIntArray11347[i_751_++];
								int i_767_ = (i_766_ & 0xff0000) * i_761_ & ~0xffffff;
								int i_768_ = (i_766_ & 0xff00) * i_762_ & 0xff0000;
								int i_769_ = (i_766_ & 0xff) * i_763_ & 0xff00;
								is[i_750_++] = (i_767_ | i_768_ | i_769_) >>> 8;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 3) {
						for (int i_770_ = -i_752_; i_770_ < 0; i_770_++) {
							for (int i_771_ = -i_753_; i_771_ < 0; i_771_++) {
								int i_772_ = anIntArray11347[i_751_++];
								int i_773_ = i_772_ + i_747_;
								int i_774_ = ((i_772_ & 0xff00ff) + (i_747_ & 0xff00ff));
								int i_775_ = ((i_774_ & 0x1000100) + (i_773_ - i_774_ & 0x10000));
								is[i_750_++] = i_773_ - i_775_ | i_775_ - (i_775_ >>> 8);
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 2) {
						int i_776_ = i_747_ >>> 24;
						int i_777_ = 256 - i_776_;
						int i_778_ = (i_747_ & 0xff00ff) * i_777_ & ~0xff00ff;
						int i_779_ = (i_747_ & 0xff00) * i_777_ & 0xff0000;
						i_747_ = (i_778_ | i_779_) >>> 8;
						for (int i_780_ = -i_752_; i_780_ < 0; i_780_++) {
							for (int i_781_ = -i_753_; i_781_ < 0; i_781_++) {
								int i_782_ = anIntArray11347[i_751_++];
								i_778_ = (i_782_ & 0xff00ff) * i_776_ & ~0xff00ff;
								i_779_ = (i_782_ & 0xff00) * i_776_ & 0xff0000;
								is[i_750_++] = ((i_778_ | i_779_) >>> 8) + i_747_;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_748_ == 1) {
					if (i_746_ == 1) {
						for (int i_783_ = -i_752_; i_783_ < 0; i_783_++) {
							int i_784_ = i_750_ + i_753_ - 3;
							while (i_750_ < i_784_) {
								int i_785_ = anIntArray11347[i_751_++];
								if (i_785_ != 0)
									is[i_750_++] = i_785_;
								else
									i_750_++;
								i_785_ = anIntArray11347[i_751_++];
								if (i_785_ != 0)
									is[i_750_++] = i_785_;
								else
									i_750_++;
								i_785_ = anIntArray11347[i_751_++];
								if (i_785_ != 0)
									is[i_750_++] = i_785_;
								else
									i_750_++;
								i_785_ = anIntArray11347[i_751_++];
								if (i_785_ != 0)
									is[i_750_++] = i_785_;
								else
									i_750_++;
							}
							i_784_ += 3;
							while (i_750_ < i_784_) {
								int i_786_ = anIntArray11347[i_751_++];
								if (i_786_ != 0)
									is[i_750_++] = i_786_;
								else
									i_750_++;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 0) {
						if ((i_747_ & 0xffffff) == 16777215) {
							int i_787_ = i_747_ >>> 24;
							int i_788_ = 256 - i_787_;
							for (int i_789_ = -i_752_; i_789_ < 0; i_789_++) {
								for (int i_790_ = -i_753_; i_790_ < 0; i_790_++) {
									int i_791_ = anIntArray11347[i_751_++];
									if (i_791_ != 0) {
										int i_792_ = is[i_750_];
										is[i_750_++] = ((((i_791_ & 0xff00ff) * i_787_ + ((i_792_ & 0xff00ff) * i_788_)) & ~0xff00ff) + (((i_791_ & 0xff00) * i_787_ + ((i_792_ & 0xff00) * i_788_)) & 0xff0000)) >> 8;
									} else
										i_750_++;
								}
								i_750_ += i_754_;
								i_751_ += i_755_;
							}
						} else {
							int i_793_ = (i_747_ & 0xff0000) >> 16;
							int i_794_ = (i_747_ & 0xff00) >> 8;
							int i_795_ = i_747_ & 0xff;
							int i_796_ = i_747_ >>> 24;
							int i_797_ = 256 - i_796_;
							for (int i_798_ = -i_752_; i_798_ < 0; i_798_++) {
								for (int i_799_ = -i_753_; i_799_ < 0; i_799_++) {
									int i_800_ = anIntArray11347[i_751_++];
									if (i_800_ != 0) {
										if (i_796_ != 255) {
											int i_801_ = ((i_800_ & 0xff0000) * i_793_ & ~0xffffff);
											int i_802_ = ((i_800_ & 0xff00) * i_794_ & 0xff0000);
											int i_803_ = ((i_800_ & 0xff) * i_795_ & 0xff00);
											i_800_ = (i_801_ | i_802_ | i_803_) >>> 8;
											int i_804_ = is[i_750_];
											is[i_750_++] = (((((i_800_ & 0xff00ff) * i_796_) + ((i_804_ & 0xff00ff) * i_797_)) & ~0xff00ff) + ((((i_800_ & 0xff00) * i_796_) + ((i_804_ & 0xff00) * i_797_)) & 0xff0000)) >> 8;
										} else {
											int i_805_ = ((i_800_ & 0xff0000) * i_793_ & ~0xffffff);
											int i_806_ = ((i_800_ & 0xff00) * i_794_ & 0xff0000);
											int i_807_ = ((i_800_ & 0xff) * i_795_ & 0xff00);
											is[i_750_++] = (i_805_ | i_806_ | i_807_) >>> 8;
										}
									} else
										i_750_++;
								}
								i_750_ += i_754_;
								i_751_ += i_755_;
							}
						}
					} else if (i_746_ == 3) {
						int i_808_ = i_747_ >>> 24;
						int i_809_ = 256 - i_808_;
						for (int i_810_ = -i_752_; i_810_ < 0; i_810_++) {
							for (int i_811_ = -i_753_; i_811_ < 0; i_811_++) {
								int i_812_ = anIntArray11347[i_751_++];
								int i_813_ = i_812_ + i_747_;
								int i_814_ = ((i_812_ & 0xff00ff) + (i_747_ & 0xff00ff));
								int i_815_ = ((i_814_ & 0x1000100) + (i_813_ - i_814_ & 0x10000));
								i_815_ = i_813_ - i_815_ | i_815_ - (i_815_ >>> 8);
								if (i_812_ == 0 && i_808_ != 255) {
									i_812_ = i_815_;
									i_815_ = is[i_750_];
									i_815_ = ((((i_812_ & 0xff00ff) * i_808_ + (i_815_ & 0xff00ff) * i_809_) & ~0xff00ff) + (((i_812_ & 0xff00) * i_808_ + (i_815_ & 0xff00) * i_809_) & 0xff0000)) >> 8;
								}
								is[i_750_++] = i_815_;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 2) {
						int i_816_ = i_747_ >>> 24;
						int i_817_ = 256 - i_816_;
						int i_818_ = (i_747_ & 0xff00ff) * i_817_ & ~0xff00ff;
						int i_819_ = (i_747_ & 0xff00) * i_817_ & 0xff0000;
						i_747_ = (i_818_ | i_819_) >>> 8;
						for (int i_820_ = -i_752_; i_820_ < 0; i_820_++) {
							for (int i_821_ = -i_753_; i_821_ < 0; i_821_++) {
								int i_822_ = anIntArray11347[i_751_++];
								if (i_822_ != 0) {
									i_818_ = ((i_822_ & 0xff00ff) * i_816_ & ~0xff00ff);
									i_819_ = ((i_822_ & 0xff00) * i_816_ & 0xff0000);
									is[i_750_++] = ((i_818_ | i_819_) >>> 8) + i_747_;
								} else
									i_750_++;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_748_ == 2) {
					if (i_746_ == 1) {
						for (int i_823_ = -i_752_; i_823_ < 0; i_823_++) {
							for (int i_824_ = -i_753_; i_824_ < 0; i_824_++) {
								int i_825_ = anIntArray11347[i_751_++];
								if (i_825_ != 0) {
									int i_826_ = is[i_750_];
									int i_827_ = i_825_ + i_826_;
									int i_828_ = ((i_825_ & 0xff00ff) + (i_826_ & 0xff00ff));
									i_826_ = ((i_828_ & 0x1000100) + (i_827_ - i_828_ & 0x10000));
									is[i_750_++] = i_827_ - i_826_ | i_826_ - (i_826_ >>> 8);
								} else
									i_750_++;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 0) {
						int i_829_ = (i_747_ & 0xff0000) >> 16;
						int i_830_ = (i_747_ & 0xff00) >> 8;
						int i_831_ = i_747_ & 0xff;
						for (int i_832_ = -i_752_; i_832_ < 0; i_832_++) {
							for (int i_833_ = -i_753_; i_833_ < 0; i_833_++) {
								int i_834_ = anIntArray11347[i_751_++];
								if (i_834_ != 0) {
									int i_835_ = ((i_834_ & 0xff0000) * i_829_ & ~0xffffff);
									int i_836_ = ((i_834_ & 0xff00) * i_830_ & 0xff0000);
									int i_837_ = (i_834_ & 0xff) * i_831_ & 0xff00;
									i_834_ = (i_835_ | i_836_ | i_837_) >>> 8;
									int i_838_ = is[i_750_];
									int i_839_ = i_834_ + i_838_;
									int i_840_ = ((i_834_ & 0xff00ff) + (i_838_ & 0xff00ff));
									i_838_ = ((i_840_ & 0x1000100) + (i_839_ - i_840_ & 0x10000));
									is[i_750_++] = i_839_ - i_838_ | i_838_ - (i_838_ >>> 8);
								} else
									i_750_++;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 3) {
						for (int i_841_ = -i_752_; i_841_ < 0; i_841_++) {
							for (int i_842_ = -i_753_; i_842_ < 0; i_842_++) {
								int i_843_ = anIntArray11347[i_751_++];
								int i_844_ = i_843_ + i_747_;
								int i_845_ = ((i_843_ & 0xff00ff) + (i_747_ & 0xff00ff));
								int i_846_ = ((i_845_ & 0x1000100) + (i_844_ - i_845_ & 0x10000));
								i_843_ = i_844_ - i_846_ | i_846_ - (i_846_ >>> 8);
								i_846_ = is[i_750_];
								i_844_ = i_843_ + i_846_;
								i_845_ = (i_843_ & 0xff00ff) + (i_846_ & 0xff00ff);
								i_846_ = (i_845_ & 0x1000100) + (i_844_ - i_845_ & 0x10000);
								is[i_750_++] = i_844_ - i_846_ | i_846_ - (i_846_ >>> 8);
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else if (i_746_ == 2) {
						int i_847_ = i_747_ >>> 24;
						int i_848_ = 256 - i_847_;
						int i_849_ = (i_747_ & 0xff00ff) * i_848_ & ~0xff00ff;
						int i_850_ = (i_747_ & 0xff00) * i_848_ & 0xff0000;
						i_747_ = (i_849_ | i_850_) >>> 8;
						for (int i_851_ = -i_752_; i_851_ < 0; i_851_++) {
							for (int i_852_ = -i_753_; i_852_ < 0; i_852_++) {
								int i_853_ = anIntArray11347[i_751_++];
								if (i_853_ != 0) {
									i_849_ = ((i_853_ & 0xff00ff) * i_847_ & ~0xff00ff);
									i_850_ = ((i_853_ & 0xff00) * i_847_ & 0xff0000);
									i_853_ = ((i_849_ | i_850_) >>> 8) + i_747_;
									int i_854_ = is[i_750_];
									int i_855_ = i_853_ + i_854_;
									int i_856_ = ((i_853_ & 0xff00ff) + (i_854_ & 0xff00ff));
									i_854_ = ((i_856_ & 0x1000100) + (i_855_ - i_856_ & 0x10000));
									is[i_750_++] = i_855_ - i_854_ | i_854_ - (i_854_ >>> 8);
								} else
									i_750_++;
							}
							i_750_ += i_754_;
							i_751_ += i_755_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2486(int i, int i_857_, int i_858_, int i_859_, int i_860_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_861_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_857_ += anInt8918;
			int i_862_ = i_857_ * i_861_ + i;
			int i_863_ = 0;
			int i_864_ = anInt8916;
			int i_865_ = anInt8914;
			int i_866_ = i_861_ - i_865_;
			int i_867_ = 0;
			if (i_857_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_868_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_857_;
				i_864_ -= i_868_;
				i_857_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_863_ += i_868_ * i_865_;
				i_862_ += i_868_ * i_861_;
			}
			if (i_857_ + i_864_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_864_ -= (i_857_ + i_864_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_869_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_865_ -= i_869_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_863_ += i_869_;
				i_862_ += i_869_;
				i_867_ += i_869_;
				i_866_ += i_869_;
			}
			if (i + i_865_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_870_ = i + i_865_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_865_ -= i_870_;
				i_867_ += i_870_;
				i_866_ += i_870_;
			}
			if (i_865_ > 0 && i_864_ > 0) {
				if (i_860_ == 0) {
					if (i_858_ == 1) {
						for (int i_871_ = -i_864_; i_871_ < 0; i_871_++) {
							int i_872_ = i_862_ + i_865_ - 3;
							while (i_862_ < i_872_) {
								is[i_862_++] = anIntArray11347[i_863_++];
								is[i_862_++] = anIntArray11347[i_863_++];
								is[i_862_++] = anIntArray11347[i_863_++];
								is[i_862_++] = anIntArray11347[i_863_++];
							}
							i_872_ += 3;
							while (i_862_ < i_872_)
								is[i_862_++] = anIntArray11347[i_863_++];
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 0) {
						int i_873_ = (i_859_ & 0xff0000) >> 16;
						int i_874_ = (i_859_ & 0xff00) >> 8;
						int i_875_ = i_859_ & 0xff;
						for (int i_876_ = -i_864_; i_876_ < 0; i_876_++) {
							for (int i_877_ = -i_865_; i_877_ < 0; i_877_++) {
								int i_878_ = anIntArray11347[i_863_++];
								int i_879_ = (i_878_ & 0xff0000) * i_873_ & ~0xffffff;
								int i_880_ = (i_878_ & 0xff00) * i_874_ & 0xff0000;
								int i_881_ = (i_878_ & 0xff) * i_875_ & 0xff00;
								is[i_862_++] = (i_879_ | i_880_ | i_881_) >>> 8;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 3) {
						for (int i_882_ = -i_864_; i_882_ < 0; i_882_++) {
							for (int i_883_ = -i_865_; i_883_ < 0; i_883_++) {
								int i_884_ = anIntArray11347[i_863_++];
								int i_885_ = i_884_ + i_859_;
								int i_886_ = ((i_884_ & 0xff00ff) + (i_859_ & 0xff00ff));
								int i_887_ = ((i_886_ & 0x1000100) + (i_885_ - i_886_ & 0x10000));
								is[i_862_++] = i_885_ - i_887_ | i_887_ - (i_887_ >>> 8);
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 2) {
						int i_888_ = i_859_ >>> 24;
						int i_889_ = 256 - i_888_;
						int i_890_ = (i_859_ & 0xff00ff) * i_889_ & ~0xff00ff;
						int i_891_ = (i_859_ & 0xff00) * i_889_ & 0xff0000;
						i_859_ = (i_890_ | i_891_) >>> 8;
						for (int i_892_ = -i_864_; i_892_ < 0; i_892_++) {
							for (int i_893_ = -i_865_; i_893_ < 0; i_893_++) {
								int i_894_ = anIntArray11347[i_863_++];
								i_890_ = (i_894_ & 0xff00ff) * i_888_ & ~0xff00ff;
								i_891_ = (i_894_ & 0xff00) * i_888_ & 0xff0000;
								is[i_862_++] = ((i_890_ | i_891_) >>> 8) + i_859_;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_860_ == 1) {
					if (i_858_ == 1) {
						for (int i_895_ = -i_864_; i_895_ < 0; i_895_++) {
							int i_896_ = i_862_ + i_865_ - 3;
							while (i_862_ < i_896_) {
								int i_897_ = anIntArray11347[i_863_++];
								if (i_897_ != 0)
									is[i_862_++] = i_897_;
								else
									i_862_++;
								i_897_ = anIntArray11347[i_863_++];
								if (i_897_ != 0)
									is[i_862_++] = i_897_;
								else
									i_862_++;
								i_897_ = anIntArray11347[i_863_++];
								if (i_897_ != 0)
									is[i_862_++] = i_897_;
								else
									i_862_++;
								i_897_ = anIntArray11347[i_863_++];
								if (i_897_ != 0)
									is[i_862_++] = i_897_;
								else
									i_862_++;
							}
							i_896_ += 3;
							while (i_862_ < i_896_) {
								int i_898_ = anIntArray11347[i_863_++];
								if (i_898_ != 0)
									is[i_862_++] = i_898_;
								else
									i_862_++;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 0) {
						if ((i_859_ & 0xffffff) == 16777215) {
							int i_899_ = i_859_ >>> 24;
							int i_900_ = 256 - i_899_;
							for (int i_901_ = -i_864_; i_901_ < 0; i_901_++) {
								for (int i_902_ = -i_865_; i_902_ < 0; i_902_++) {
									int i_903_ = anIntArray11347[i_863_++];
									if (i_903_ != 0) {
										int i_904_ = is[i_862_];
										is[i_862_++] = ((((i_903_ & 0xff00ff) * i_899_ + ((i_904_ & 0xff00ff) * i_900_)) & ~0xff00ff) + (((i_903_ & 0xff00) * i_899_ + ((i_904_ & 0xff00) * i_900_)) & 0xff0000)) >> 8;
									} else
										i_862_++;
								}
								i_862_ += i_866_;
								i_863_ += i_867_;
							}
						} else {
							int i_905_ = (i_859_ & 0xff0000) >> 16;
							int i_906_ = (i_859_ & 0xff00) >> 8;
							int i_907_ = i_859_ & 0xff;
							int i_908_ = i_859_ >>> 24;
							int i_909_ = 256 - i_908_;
							for (int i_910_ = -i_864_; i_910_ < 0; i_910_++) {
								for (int i_911_ = -i_865_; i_911_ < 0; i_911_++) {
									int i_912_ = anIntArray11347[i_863_++];
									if (i_912_ != 0) {
										if (i_908_ != 255) {
											int i_913_ = ((i_912_ & 0xff0000) * i_905_ & ~0xffffff);
											int i_914_ = ((i_912_ & 0xff00) * i_906_ & 0xff0000);
											int i_915_ = ((i_912_ & 0xff) * i_907_ & 0xff00);
											i_912_ = (i_913_ | i_914_ | i_915_) >>> 8;
											int i_916_ = is[i_862_];
											is[i_862_++] = (((((i_912_ & 0xff00ff) * i_908_) + ((i_916_ & 0xff00ff) * i_909_)) & ~0xff00ff) + ((((i_912_ & 0xff00) * i_908_) + ((i_916_ & 0xff00) * i_909_)) & 0xff0000)) >> 8;
										} else {
											int i_917_ = ((i_912_ & 0xff0000) * i_905_ & ~0xffffff);
											int i_918_ = ((i_912_ & 0xff00) * i_906_ & 0xff0000);
											int i_919_ = ((i_912_ & 0xff) * i_907_ & 0xff00);
											is[i_862_++] = (i_917_ | i_918_ | i_919_) >>> 8;
										}
									} else
										i_862_++;
								}
								i_862_ += i_866_;
								i_863_ += i_867_;
							}
						}
					} else if (i_858_ == 3) {
						int i_920_ = i_859_ >>> 24;
						int i_921_ = 256 - i_920_;
						for (int i_922_ = -i_864_; i_922_ < 0; i_922_++) {
							for (int i_923_ = -i_865_; i_923_ < 0; i_923_++) {
								int i_924_ = anIntArray11347[i_863_++];
								int i_925_ = i_924_ + i_859_;
								int i_926_ = ((i_924_ & 0xff00ff) + (i_859_ & 0xff00ff));
								int i_927_ = ((i_926_ & 0x1000100) + (i_925_ - i_926_ & 0x10000));
								i_927_ = i_925_ - i_927_ | i_927_ - (i_927_ >>> 8);
								if (i_924_ == 0 && i_920_ != 255) {
									i_924_ = i_927_;
									i_927_ = is[i_862_];
									i_927_ = ((((i_924_ & 0xff00ff) * i_920_ + (i_927_ & 0xff00ff) * i_921_) & ~0xff00ff) + (((i_924_ & 0xff00) * i_920_ + (i_927_ & 0xff00) * i_921_) & 0xff0000)) >> 8;
								}
								is[i_862_++] = i_927_;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 2) {
						int i_928_ = i_859_ >>> 24;
						int i_929_ = 256 - i_928_;
						int i_930_ = (i_859_ & 0xff00ff) * i_929_ & ~0xff00ff;
						int i_931_ = (i_859_ & 0xff00) * i_929_ & 0xff0000;
						i_859_ = (i_930_ | i_931_) >>> 8;
						for (int i_932_ = -i_864_; i_932_ < 0; i_932_++) {
							for (int i_933_ = -i_865_; i_933_ < 0; i_933_++) {
								int i_934_ = anIntArray11347[i_863_++];
								if (i_934_ != 0) {
									i_930_ = ((i_934_ & 0xff00ff) * i_928_ & ~0xff00ff);
									i_931_ = ((i_934_ & 0xff00) * i_928_ & 0xff0000);
									is[i_862_++] = ((i_930_ | i_931_) >>> 8) + i_859_;
								} else
									i_862_++;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_860_ == 2) {
					if (i_858_ == 1) {
						for (int i_935_ = -i_864_; i_935_ < 0; i_935_++) {
							for (int i_936_ = -i_865_; i_936_ < 0; i_936_++) {
								int i_937_ = anIntArray11347[i_863_++];
								if (i_937_ != 0) {
									int i_938_ = is[i_862_];
									int i_939_ = i_937_ + i_938_;
									int i_940_ = ((i_937_ & 0xff00ff) + (i_938_ & 0xff00ff));
									i_938_ = ((i_940_ & 0x1000100) + (i_939_ - i_940_ & 0x10000));
									is[i_862_++] = i_939_ - i_938_ | i_938_ - (i_938_ >>> 8);
								} else
									i_862_++;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 0) {
						int i_941_ = (i_859_ & 0xff0000) >> 16;
						int i_942_ = (i_859_ & 0xff00) >> 8;
						int i_943_ = i_859_ & 0xff;
						for (int i_944_ = -i_864_; i_944_ < 0; i_944_++) {
							for (int i_945_ = -i_865_; i_945_ < 0; i_945_++) {
								int i_946_ = anIntArray11347[i_863_++];
								if (i_946_ != 0) {
									int i_947_ = ((i_946_ & 0xff0000) * i_941_ & ~0xffffff);
									int i_948_ = ((i_946_ & 0xff00) * i_942_ & 0xff0000);
									int i_949_ = (i_946_ & 0xff) * i_943_ & 0xff00;
									i_946_ = (i_947_ | i_948_ | i_949_) >>> 8;
									int i_950_ = is[i_862_];
									int i_951_ = i_946_ + i_950_;
									int i_952_ = ((i_946_ & 0xff00ff) + (i_950_ & 0xff00ff));
									i_950_ = ((i_952_ & 0x1000100) + (i_951_ - i_952_ & 0x10000));
									is[i_862_++] = i_951_ - i_950_ | i_950_ - (i_950_ >>> 8);
								} else
									i_862_++;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 3) {
						for (int i_953_ = -i_864_; i_953_ < 0; i_953_++) {
							for (int i_954_ = -i_865_; i_954_ < 0; i_954_++) {
								int i_955_ = anIntArray11347[i_863_++];
								int i_956_ = i_955_ + i_859_;
								int i_957_ = ((i_955_ & 0xff00ff) + (i_859_ & 0xff00ff));
								int i_958_ = ((i_957_ & 0x1000100) + (i_956_ - i_957_ & 0x10000));
								i_955_ = i_956_ - i_958_ | i_958_ - (i_958_ >>> 8);
								i_958_ = is[i_862_];
								i_956_ = i_955_ + i_958_;
								i_957_ = (i_955_ & 0xff00ff) + (i_958_ & 0xff00ff);
								i_958_ = (i_957_ & 0x1000100) + (i_956_ - i_957_ & 0x10000);
								is[i_862_++] = i_956_ - i_958_ | i_958_ - (i_958_ >>> 8);
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else if (i_858_ == 2) {
						int i_959_ = i_859_ >>> 24;
						int i_960_ = 256 - i_959_;
						int i_961_ = (i_859_ & 0xff00ff) * i_960_ & ~0xff00ff;
						int i_962_ = (i_859_ & 0xff00) * i_960_ & 0xff0000;
						i_859_ = (i_961_ | i_962_) >>> 8;
						for (int i_963_ = -i_864_; i_963_ < 0; i_963_++) {
							for (int i_964_ = -i_865_; i_964_ < 0; i_964_++) {
								int i_965_ = anIntArray11347[i_863_++];
								if (i_965_ != 0) {
									i_961_ = ((i_965_ & 0xff00ff) * i_959_ & ~0xff00ff);
									i_962_ = ((i_965_ & 0xff00) * i_959_ & 0xff0000);
									i_965_ = ((i_961_ | i_962_) >>> 8) + i_859_;
									int i_966_ = is[i_862_];
									int i_967_ = i_965_ + i_966_;
									int i_968_ = ((i_965_ & 0xff00ff) + (i_966_ & 0xff00ff));
									i_966_ = ((i_968_ & 0x1000100) + (i_967_ - i_968_ & 0x10000));
									is[i_862_++] = i_967_ - i_966_ | i_966_ - (i_966_ >>> 8);
								} else
									i_862_++;
							}
							i_862_ += i_866_;
							i_863_ += i_867_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2493(int i, int i_969_, int i_970_, int i_971_, int i_972_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			int i_973_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			i += anInt8921;
			i_969_ += anInt8918;
			int i_974_ = i_969_ * i_973_ + i;
			int i_975_ = 0;
			int i_976_ = anInt8916;
			int i_977_ = anInt8914;
			int i_978_ = i_973_ - i_977_;
			int i_979_ = 0;
			if (i_969_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_980_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_969_;
				i_976_ -= i_980_;
				i_969_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_975_ += i_980_ * i_977_;
				i_974_ += i_980_ * i_973_;
			}
			if (i_969_ + i_976_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_976_ -= (i_969_ + i_976_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_981_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_977_ -= i_981_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_975_ += i_981_;
				i_974_ += i_981_;
				i_979_ += i_981_;
				i_978_ += i_981_;
			}
			if (i + i_977_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_982_ = i + i_977_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_977_ -= i_982_;
				i_979_ += i_982_;
				i_978_ += i_982_;
			}
			if (i_977_ > 0 && i_976_ > 0) {
				if (i_972_ == 0) {
					if (i_970_ == 1) {
						for (int i_983_ = -i_976_; i_983_ < 0; i_983_++) {
							int i_984_ = i_974_ + i_977_ - 3;
							while (i_974_ < i_984_) {
								is[i_974_++] = anIntArray11347[i_975_++];
								is[i_974_++] = anIntArray11347[i_975_++];
								is[i_974_++] = anIntArray11347[i_975_++];
								is[i_974_++] = anIntArray11347[i_975_++];
							}
							i_984_ += 3;
							while (i_974_ < i_984_)
								is[i_974_++] = anIntArray11347[i_975_++];
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 0) {
						int i_985_ = (i_971_ & 0xff0000) >> 16;
						int i_986_ = (i_971_ & 0xff00) >> 8;
						int i_987_ = i_971_ & 0xff;
						for (int i_988_ = -i_976_; i_988_ < 0; i_988_++) {
							for (int i_989_ = -i_977_; i_989_ < 0; i_989_++) {
								int i_990_ = anIntArray11347[i_975_++];
								int i_991_ = (i_990_ & 0xff0000) * i_985_ & ~0xffffff;
								int i_992_ = (i_990_ & 0xff00) * i_986_ & 0xff0000;
								int i_993_ = (i_990_ & 0xff) * i_987_ & 0xff00;
								is[i_974_++] = (i_991_ | i_992_ | i_993_) >>> 8;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 3) {
						for (int i_994_ = -i_976_; i_994_ < 0; i_994_++) {
							for (int i_995_ = -i_977_; i_995_ < 0; i_995_++) {
								int i_996_ = anIntArray11347[i_975_++];
								int i_997_ = i_996_ + i_971_;
								int i_998_ = ((i_996_ & 0xff00ff) + (i_971_ & 0xff00ff));
								int i_999_ = ((i_998_ & 0x1000100) + (i_997_ - i_998_ & 0x10000));
								is[i_974_++] = i_997_ - i_999_ | i_999_ - (i_999_ >>> 8);
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 2) {
						int i_1000_ = i_971_ >>> 24;
						int i_1001_ = 256 - i_1000_;
						int i_1002_ = (i_971_ & 0xff00ff) * i_1001_ & ~0xff00ff;
						int i_1003_ = (i_971_ & 0xff00) * i_1001_ & 0xff0000;
						i_971_ = (i_1002_ | i_1003_) >>> 8;
						for (int i_1004_ = -i_976_; i_1004_ < 0; i_1004_++) {
							for (int i_1005_ = -i_977_; i_1005_ < 0; i_1005_++) {
								int i_1006_ = anIntArray11347[i_975_++];
								i_1002_ = ((i_1006_ & 0xff00ff) * i_1000_ & ~0xff00ff);
								i_1003_ = (i_1006_ & 0xff00) * i_1000_ & 0xff0000;
								is[i_974_++] = ((i_1002_ | i_1003_) >>> 8) + i_971_;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_972_ == 1) {
					if (i_970_ == 1) {
						for (int i_1007_ = -i_976_; i_1007_ < 0; i_1007_++) {
							int i_1008_ = i_974_ + i_977_ - 3;
							while (i_974_ < i_1008_) {
								int i_1009_ = anIntArray11347[i_975_++];
								if (i_1009_ != 0)
									is[i_974_++] = i_1009_;
								else
									i_974_++;
								i_1009_ = anIntArray11347[i_975_++];
								if (i_1009_ != 0)
									is[i_974_++] = i_1009_;
								else
									i_974_++;
								i_1009_ = anIntArray11347[i_975_++];
								if (i_1009_ != 0)
									is[i_974_++] = i_1009_;
								else
									i_974_++;
								i_1009_ = anIntArray11347[i_975_++];
								if (i_1009_ != 0)
									is[i_974_++] = i_1009_;
								else
									i_974_++;
							}
							i_1008_ += 3;
							while (i_974_ < i_1008_) {
								int i_1010_ = anIntArray11347[i_975_++];
								if (i_1010_ != 0)
									is[i_974_++] = i_1010_;
								else
									i_974_++;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 0) {
						if ((i_971_ & 0xffffff) == 16777215) {
							int i_1011_ = i_971_ >>> 24;
							int i_1012_ = 256 - i_1011_;
							for (int i_1013_ = -i_976_; i_1013_ < 0; i_1013_++) {
								for (int i_1014_ = -i_977_; i_1014_ < 0; i_1014_++) {
									int i_1015_ = anIntArray11347[i_975_++];
									if (i_1015_ != 0) {
										int i_1016_ = is[i_974_];
										is[i_974_++] = ((((i_1015_ & 0xff00ff) * i_1011_ + ((i_1016_ & 0xff00ff) * i_1012_)) & ~0xff00ff) + (((i_1015_ & 0xff00) * i_1011_ + ((i_1016_ & 0xff00) * i_1012_)) & 0xff0000)) >> 8;
									} else
										i_974_++;
								}
								i_974_ += i_978_;
								i_975_ += i_979_;
							}
						} else {
							int i_1017_ = (i_971_ & 0xff0000) >> 16;
							int i_1018_ = (i_971_ & 0xff00) >> 8;
							int i_1019_ = i_971_ & 0xff;
							int i_1020_ = i_971_ >>> 24;
							int i_1021_ = 256 - i_1020_;
							for (int i_1022_ = -i_976_; i_1022_ < 0; i_1022_++) {
								for (int i_1023_ = -i_977_; i_1023_ < 0; i_1023_++) {
									int i_1024_ = anIntArray11347[i_975_++];
									if (i_1024_ != 0) {
										if (i_1020_ != 255) {
											int i_1025_ = (((i_1024_ & 0xff0000) * i_1017_) & ~0xffffff);
											int i_1026_ = ((i_1024_ & 0xff00) * i_1018_ & 0xff0000);
											int i_1027_ = ((i_1024_ & 0xff) * i_1019_ & 0xff00);
											i_1024_ = (i_1025_ | i_1026_ | i_1027_) >>> 8;
											int i_1028_ = is[i_974_];
											is[i_974_++] = (((((i_1024_ & 0xff00ff) * i_1020_) + ((i_1028_ & 0xff00ff) * i_1021_)) & ~0xff00ff) + ((((i_1024_ & 0xff00) * i_1020_) + ((i_1028_ & 0xff00) * i_1021_)) & 0xff0000)) >> 8;
										} else {
											int i_1029_ = (((i_1024_ & 0xff0000) * i_1017_) & ~0xffffff);
											int i_1030_ = ((i_1024_ & 0xff00) * i_1018_ & 0xff0000);
											int i_1031_ = ((i_1024_ & 0xff) * i_1019_ & 0xff00);
											is[i_974_++] = (i_1029_ | i_1030_ | i_1031_) >>> 8;
										}
									} else
										i_974_++;
								}
								i_974_ += i_978_;
								i_975_ += i_979_;
							}
						}
					} else if (i_970_ == 3) {
						int i_1032_ = i_971_ >>> 24;
						int i_1033_ = 256 - i_1032_;
						for (int i_1034_ = -i_976_; i_1034_ < 0; i_1034_++) {
							for (int i_1035_ = -i_977_; i_1035_ < 0; i_1035_++) {
								int i_1036_ = anIntArray11347[i_975_++];
								int i_1037_ = i_1036_ + i_971_;
								int i_1038_ = ((i_1036_ & 0xff00ff) + (i_971_ & 0xff00ff));
								int i_1039_ = ((i_1038_ & 0x1000100) + (i_1037_ - i_1038_ & 0x10000));
								i_1039_ = i_1037_ - i_1039_ | i_1039_ - (i_1039_ >>> 8);
								if (i_1036_ == 0 && i_1032_ != 255) {
									i_1036_ = i_1039_;
									i_1039_ = is[i_974_];
									i_1039_ = ((((i_1036_ & 0xff00ff) * i_1032_ + (i_1039_ & 0xff00ff) * i_1033_) & ~0xff00ff) + (((i_1036_ & 0xff00) * i_1032_ + (i_1039_ & 0xff00) * i_1033_) & 0xff0000)) >> 8;
								}
								is[i_974_++] = i_1039_;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 2) {
						int i_1040_ = i_971_ >>> 24;
						int i_1041_ = 256 - i_1040_;
						int i_1042_ = (i_971_ & 0xff00ff) * i_1041_ & ~0xff00ff;
						int i_1043_ = (i_971_ & 0xff00) * i_1041_ & 0xff0000;
						i_971_ = (i_1042_ | i_1043_) >>> 8;
						for (int i_1044_ = -i_976_; i_1044_ < 0; i_1044_++) {
							for (int i_1045_ = -i_977_; i_1045_ < 0; i_1045_++) {
								int i_1046_ = anIntArray11347[i_975_++];
								if (i_1046_ != 0) {
									i_1042_ = ((i_1046_ & 0xff00ff) * i_1040_ & ~0xff00ff);
									i_1043_ = ((i_1046_ & 0xff00) * i_1040_ & 0xff0000);
									is[i_974_++] = ((i_1042_ | i_1043_) >>> 8) + i_971_;
								} else
									i_974_++;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_972_ == 2) {
					if (i_970_ == 1) {
						for (int i_1047_ = -i_976_; i_1047_ < 0; i_1047_++) {
							for (int i_1048_ = -i_977_; i_1048_ < 0; i_1048_++) {
								int i_1049_ = anIntArray11347[i_975_++];
								if (i_1049_ != 0) {
									int i_1050_ = is[i_974_];
									int i_1051_ = i_1049_ + i_1050_;
									int i_1052_ = ((i_1049_ & 0xff00ff) + (i_1050_ & 0xff00ff));
									i_1050_ = ((i_1052_ & 0x1000100) + (i_1051_ - i_1052_ & 0x10000));
									is[i_974_++] = (i_1051_ - i_1050_ | i_1050_ - (i_1050_ >>> 8));
								} else
									i_974_++;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 0) {
						int i_1053_ = (i_971_ & 0xff0000) >> 16;
						int i_1054_ = (i_971_ & 0xff00) >> 8;
						int i_1055_ = i_971_ & 0xff;
						for (int i_1056_ = -i_976_; i_1056_ < 0; i_1056_++) {
							for (int i_1057_ = -i_977_; i_1057_ < 0; i_1057_++) {
								int i_1058_ = anIntArray11347[i_975_++];
								if (i_1058_ != 0) {
									int i_1059_ = ((i_1058_ & 0xff0000) * i_1053_ & ~0xffffff);
									int i_1060_ = ((i_1058_ & 0xff00) * i_1054_ & 0xff0000);
									int i_1061_ = (i_1058_ & 0xff) * i_1055_ & 0xff00;
									i_1058_ = (i_1059_ | i_1060_ | i_1061_) >>> 8;
									int i_1062_ = is[i_974_];
									int i_1063_ = i_1058_ + i_1062_;
									int i_1064_ = ((i_1058_ & 0xff00ff) + (i_1062_ & 0xff00ff));
									i_1062_ = ((i_1064_ & 0x1000100) + (i_1063_ - i_1064_ & 0x10000));
									is[i_974_++] = (i_1063_ - i_1062_ | i_1062_ - (i_1062_ >>> 8));
								} else
									i_974_++;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 3) {
						for (int i_1065_ = -i_976_; i_1065_ < 0; i_1065_++) {
							for (int i_1066_ = -i_977_; i_1066_ < 0; i_1066_++) {
								int i_1067_ = anIntArray11347[i_975_++];
								int i_1068_ = i_1067_ + i_971_;
								int i_1069_ = ((i_1067_ & 0xff00ff) + (i_971_ & 0xff00ff));
								int i_1070_ = ((i_1069_ & 0x1000100) + (i_1068_ - i_1069_ & 0x10000));
								i_1067_ = i_1068_ - i_1070_ | i_1070_ - (i_1070_ >>> 8);
								i_1070_ = is[i_974_];
								i_1068_ = i_1067_ + i_1070_;
								i_1069_ = (i_1067_ & 0xff00ff) + (i_1070_ & 0xff00ff);
								i_1070_ = ((i_1069_ & 0x1000100) + (i_1068_ - i_1069_ & 0x10000));
								is[i_974_++] = i_1068_ - i_1070_ | i_1070_ - (i_1070_ >>> 8);
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else if (i_970_ == 2) {
						int i_1071_ = i_971_ >>> 24;
						int i_1072_ = 256 - i_1071_;
						int i_1073_ = (i_971_ & 0xff00ff) * i_1072_ & ~0xff00ff;
						int i_1074_ = (i_971_ & 0xff00) * i_1072_ & 0xff0000;
						i_971_ = (i_1073_ | i_1074_) >>> 8;
						for (int i_1075_ = -i_976_; i_1075_ < 0; i_1075_++) {
							for (int i_1076_ = -i_977_; i_1076_ < 0; i_1076_++) {
								int i_1077_ = anIntArray11347[i_975_++];
								if (i_1077_ != 0) {
									i_1073_ = ((i_1077_ & 0xff00ff) * i_1071_ & ~0xff00ff);
									i_1074_ = ((i_1077_ & 0xff00) * i_1071_ & 0xff0000);
									i_1077_ = ((i_1073_ | i_1074_) >>> 8) + i_971_;
									int i_1078_ = is[i_974_];
									int i_1079_ = i_1077_ + i_1078_;
									int i_1080_ = ((i_1077_ & 0xff00ff) + (i_1078_ & 0xff00ff));
									i_1078_ = ((i_1080_ & 0x1000100) + (i_1079_ - i_1080_ & 0x10000));
									is[i_974_++] = (i_1079_ - i_1078_ | i_1078_ - (i_1078_ >>> 8));
								} else
									i_974_++;
							}
							i_974_ += i_978_;
							i_975_ += i_979_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2466(int i, int i_1081_, Class145 class145, int i_1082_, int i_1083_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_1081_ += anInt8918;
			int i_1084_ = 0;
			int i_1085_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_1086_ = anInt8914;
			int i_1087_ = anInt8916;
			int i_1088_ = i_1085_ - i_1086_;
			int i_1089_ = 0;
			int i_1090_ = i + i_1081_ * i_1085_;
			if (i_1081_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_1091_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1081_;
				i_1087_ -= i_1091_;
				i_1081_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_1084_ += i_1091_ * i_1086_;
				i_1090_ += i_1091_ * i_1085_;
			}
			if (i_1081_ + i_1087_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_1087_ -= (i_1081_ + i_1087_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_1092_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_1086_ -= i_1092_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_1084_ += i_1092_;
				i_1090_ += i_1092_;
				i_1089_ += i_1092_;
				i_1088_ += i_1092_;
			}
			if (i + i_1086_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_1093_ = i + i_1086_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_1086_ -= i_1093_;
				i_1089_ += i_1093_;
				i_1088_ += i_1093_;
			}
			if (i_1086_ > 0 && i_1087_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_1094_ = class145_sub1.anIntArray9521;
				int[] is_1095_ = class145_sub1.anIntArray9520;
				int i_1096_ = i_1081_;
				if (i_1083_ > i_1096_) {
					i_1096_ = i_1083_;
					i_1090_ += (i_1083_ - i_1081_) * i_1085_;
					i_1084_ += (i_1083_ - i_1081_) * anInt8914;
				}
				int i_1097_ = (i_1083_ + is_1094_.length < i_1081_ + i_1087_ ? i_1083_ + is_1094_.length : i_1081_ + i_1087_);
				for (int i_1098_ = i_1096_; i_1098_ < i_1097_; i_1098_++) {
					int i_1099_ = is_1094_[i_1098_ - i_1083_] + i_1082_;
					int i_1100_ = is_1095_[i_1098_ - i_1083_];
					int i_1101_ = i_1086_;
					if (i > i_1099_) {
						int i_1102_ = i - i_1099_;
						if (i_1102_ >= i_1100_) {
							i_1084_ += i_1086_ + i_1089_;
							i_1090_ += i_1086_ + i_1088_;
							continue;
						}
						i_1100_ -= i_1102_;
					} else {
						int i_1103_ = i_1099_ - i;
						if (i_1103_ >= i_1086_) {
							i_1084_ += i_1086_ + i_1089_;
							i_1090_ += i_1086_ + i_1088_;
							continue;
						}
						i_1084_ += i_1103_;
						i_1101_ -= i_1103_;
						i_1090_ += i_1103_;
					}
					int i_1104_ = 0;
					if (i_1101_ < i_1100_)
						i_1100_ = i_1101_;
					else
						i_1104_ = i_1101_ - i_1100_;
					for (int i_1105_ = -i_1100_; i_1105_ < 0; i_1105_++) {
						int i_1106_ = anIntArray11347[i_1084_++];
						if (i_1106_ != 0)
							is[i_1090_++] = i_1106_;
						else
							i_1090_++;
					}
					i_1084_ += i_1104_ + i_1089_;
					i_1090_ += i_1104_ + i_1088_;
				}
			}
		}
	}

	void method2453(int i, int i_1107_, int i_1108_, int i_1109_, int i_1110_, int i_1111_, int i_1112_, int i_1113_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (i_1108_ > 0 && i_1109_ > 0) {
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (is != null) {
				int i_1114_ = 0;
				int i_1115_ = 0;
				int i_1116_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
				int i_1117_ = anInt8921 + anInt8914 + anInt8919;
				int i_1118_ = anInt8918 + anInt8916 + anInt8920;
				int i_1119_ = (i_1117_ << 16) / i_1108_;
				int i_1120_ = (i_1118_ << 16) / i_1109_;
				if (anInt8921 > 0) {
					int i_1121_ = ((anInt8921 << 16) + i_1119_ - 1) / i_1119_;
					i += i_1121_;
					i_1114_ += i_1121_ * i_1119_ - (anInt8921 << 16);
				}
				if (anInt8918 > 0) {
					int i_1122_ = ((anInt8918 << 16) + i_1120_ - 1) / i_1120_;
					i_1107_ += i_1122_;
					i_1115_ += i_1122_ * i_1120_ - (anInt8918 << 16);
				}
				if (anInt8914 < i_1117_)
					i_1108_ = (((anInt8914 << 16) - i_1114_ + i_1119_ - 1) / i_1119_);
				if (anInt8916 < i_1118_)
					i_1109_ = (((anInt8916 << 16) - i_1115_ + i_1120_ - 1) / i_1120_);
				int i_1123_ = i + i_1107_ * i_1116_;
				int i_1124_ = i_1116_ - i_1108_;
				if (i_1107_ + i_1109_ > aClass178_Sub3_8923.anInt9826 * 489020741)
					i_1109_ -= (i_1107_ + i_1109_ - aClass178_Sub3_8923.anInt9826 * 489020741);
				if (i_1107_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
					int i_1125_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1107_;
					i_1109_ -= i_1125_;
					i_1123_ += i_1125_ * i_1116_;
					i_1115_ += i_1120_ * i_1125_;
				}
				if (i + i_1108_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
					int i_1126_ = (i + i_1108_ - aClass178_Sub3_8923.anInt9809 * -272361347);
					i_1108_ -= i_1126_;
					i_1124_ += i_1126_;
				}
				if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
					int i_1127_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
					i_1108_ -= i_1127_;
					i_1123_ += i_1127_;
					i_1114_ += i_1119_ * i_1127_;
					i_1124_ += i_1127_;
				}
				if (i_1112_ == 0) {
					if (i_1110_ == 1) {
						int i_1128_ = i_1114_;
						for (int i_1129_ = -i_1109_; i_1129_ < 0; i_1129_++) {
							int i_1130_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1131_ = -i_1108_; i_1131_ < 0; i_1131_++) {
								is[i_1123_++] = (anIntArray11347[(i_1114_ >> 16) + i_1130_]);
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1128_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 0) {
						int i_1132_ = (i_1111_ & 0xff0000) >> 16;
						int i_1133_ = (i_1111_ & 0xff00) >> 8;
						int i_1134_ = i_1111_ & 0xff;
						int i_1135_ = i_1114_;
						for (int i_1136_ = -i_1109_; i_1136_ < 0; i_1136_++) {
							int i_1137_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1138_ = -i_1108_; i_1138_ < 0; i_1138_++) {
								int i_1139_ = (anIntArray11347[(i_1114_ >> 16) + i_1137_]);
								int i_1140_ = ((i_1139_ & 0xff0000) * i_1132_ & ~0xffffff);
								int i_1141_ = (i_1139_ & 0xff00) * i_1133_ & 0xff0000;
								int i_1142_ = (i_1139_ & 0xff) * i_1134_ & 0xff00;
								is[i_1123_++] = (i_1140_ | i_1141_ | i_1142_) >>> 8;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1135_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 3) {
						int i_1143_ = i_1114_;
						for (int i_1144_ = -i_1109_; i_1144_ < 0; i_1144_++) {
							int i_1145_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1146_ = -i_1108_; i_1146_ < 0; i_1146_++) {
								int i_1147_ = (anIntArray11347[(i_1114_ >> 16) + i_1145_]);
								int i_1148_ = i_1147_ + i_1111_;
								int i_1149_ = ((i_1147_ & 0xff00ff) + (i_1111_ & 0xff00ff));
								int i_1150_ = ((i_1149_ & 0x1000100) + (i_1148_ - i_1149_ & 0x10000));
								is[i_1123_++] = i_1148_ - i_1150_ | i_1150_ - (i_1150_ >>> 8);
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1143_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 2) {
						int i_1151_ = i_1111_ >>> 24;
						int i_1152_ = 256 - i_1151_;
						int i_1153_ = (i_1111_ & 0xff00ff) * i_1152_ & ~0xff00ff;
						int i_1154_ = (i_1111_ & 0xff00) * i_1152_ & 0xff0000;
						i_1111_ = (i_1153_ | i_1154_) >>> 8;
						int i_1155_ = i_1114_;
						for (int i_1156_ = -i_1109_; i_1156_ < 0; i_1156_++) {
							int i_1157_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1158_ = -i_1108_; i_1158_ < 0; i_1158_++) {
								int i_1159_ = (anIntArray11347[(i_1114_ >> 16) + i_1157_]);
								i_1153_ = ((i_1159_ & 0xff00ff) * i_1151_ & ~0xff00ff);
								i_1154_ = (i_1159_ & 0xff00) * i_1151_ & 0xff0000;
								is[i_1123_++] = ((i_1153_ | i_1154_) >>> 8) + i_1111_;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1155_;
							i_1123_ += i_1124_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1112_ == 1) {
					if (i_1110_ == 1) {
						int i_1160_ = i_1114_;
						for (int i_1161_ = -i_1109_; i_1161_ < 0; i_1161_++) {
							int i_1162_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1163_ = -i_1108_; i_1163_ < 0; i_1163_++) {
								int i_1164_ = (anIntArray11347[(i_1114_ >> 16) + i_1162_]);
								if (i_1164_ != 0)
									is[i_1123_++] = i_1164_;
								else
									i_1123_++;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1160_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 0) {
						int i_1165_ = i_1114_;
						if ((i_1111_ & 0xffffff) == 16777215) {
							int i_1166_ = i_1111_ >>> 24;
							int i_1167_ = 256 - i_1166_;
							for (int i_1168_ = -i_1109_; i_1168_ < 0; i_1168_++) {
								int i_1169_ = (i_1115_ >> 16) * anInt8914;
								for (int i_1170_ = -i_1108_; i_1170_ < 0; i_1170_++) {
									int i_1171_ = (anIntArray11347[(i_1114_ >> 16) + i_1169_]);
									if (i_1171_ != 0) {
										int i_1172_ = is[i_1123_];
										is[i_1123_++] = ((((i_1171_ & 0xff00ff) * i_1166_ + ((i_1172_ & 0xff00ff) * i_1167_)) & ~0xff00ff) + (((i_1171_ & 0xff00) * i_1166_ + ((i_1172_ & 0xff00) * i_1167_)) & 0xff0000)) >> 8;
									} else
										i_1123_++;
									i_1114_ += i_1119_;
								}
								i_1115_ += i_1120_;
								i_1114_ = i_1165_;
								i_1123_ += i_1124_;
							}
						} else {
							int i_1173_ = (i_1111_ & 0xff0000) >> 16;
							int i_1174_ = (i_1111_ & 0xff00) >> 8;
							int i_1175_ = i_1111_ & 0xff;
							int i_1176_ = i_1111_ >>> 24;
							int i_1177_ = 256 - i_1176_;
							for (int i_1178_ = -i_1109_; i_1178_ < 0; i_1178_++) {
								int i_1179_ = (i_1115_ >> 16) * anInt8914;
								for (int i_1180_ = -i_1108_; i_1180_ < 0; i_1180_++) {
									int i_1181_ = (anIntArray11347[(i_1114_ >> 16) + i_1179_]);
									if (i_1181_ != 0) {
										if (i_1176_ != 255) {
											int i_1182_ = (((i_1181_ & 0xff0000) * i_1173_) & ~0xffffff);
											int i_1183_ = ((i_1181_ & 0xff00) * i_1174_ & 0xff0000);
											int i_1184_ = ((i_1181_ & 0xff) * i_1175_ & 0xff00);
											i_1181_ = (i_1182_ | i_1183_ | i_1184_) >>> 8;
											int i_1185_ = is[i_1123_];
											is[i_1123_++] = (((((i_1181_ & 0xff00ff) * i_1176_) + ((i_1185_ & 0xff00ff) * i_1177_)) & ~0xff00ff) + ((((i_1181_ & 0xff00) * i_1176_) + ((i_1185_ & 0xff00) * i_1177_)) & 0xff0000)) >> 8;
										} else {
											int i_1186_ = (((i_1181_ & 0xff0000) * i_1173_) & ~0xffffff);
											int i_1187_ = ((i_1181_ & 0xff00) * i_1174_ & 0xff0000);
											int i_1188_ = ((i_1181_ & 0xff) * i_1175_ & 0xff00);
											is[i_1123_++] = (i_1186_ | i_1187_ | i_1188_) >>> 8;
										}
									} else
										i_1123_++;
									i_1114_ += i_1119_;
								}
								i_1115_ += i_1120_;
								i_1114_ = i_1165_;
								i_1123_ += i_1124_;
							}
						}
					} else if (i_1110_ == 3) {
						int i_1189_ = i_1114_;
						int i_1190_ = i_1111_ >>> 24;
						int i_1191_ = 256 - i_1190_;
						for (int i_1192_ = -i_1109_; i_1192_ < 0; i_1192_++) {
							int i_1193_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1194_ = -i_1108_; i_1194_ < 0; i_1194_++) {
								int i_1195_ = (anIntArray11347[(i_1114_ >> 16) + i_1193_]);
								int i_1196_ = i_1195_ + i_1111_;
								int i_1197_ = ((i_1195_ & 0xff00ff) + (i_1111_ & 0xff00ff));
								int i_1198_ = ((i_1197_ & 0x1000100) + (i_1196_ - i_1197_ & 0x10000));
								i_1198_ = i_1196_ - i_1198_ | i_1198_ - (i_1198_ >>> 8);
								if (i_1195_ == 0 && i_1190_ != 255) {
									i_1195_ = i_1198_;
									i_1198_ = is[i_1123_];
									i_1198_ = ((((i_1195_ & 0xff00ff) * i_1190_ + (i_1198_ & 0xff00ff) * i_1191_) & ~0xff00ff) + (((i_1195_ & 0xff00) * i_1190_ + (i_1198_ & 0xff00) * i_1191_) & 0xff0000)) >> 8;
								}
								is[i_1123_++] = i_1198_;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1189_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 2) {
						int i_1199_ = i_1111_ >>> 24;
						int i_1200_ = 256 - i_1199_;
						int i_1201_ = (i_1111_ & 0xff00ff) * i_1200_ & ~0xff00ff;
						int i_1202_ = (i_1111_ & 0xff00) * i_1200_ & 0xff0000;
						i_1111_ = (i_1201_ | i_1202_) >>> 8;
						int i_1203_ = i_1114_;
						for (int i_1204_ = -i_1109_; i_1204_ < 0; i_1204_++) {
							int i_1205_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1206_ = -i_1108_; i_1206_ < 0; i_1206_++) {
								int i_1207_ = (anIntArray11347[(i_1114_ >> 16) + i_1205_]);
								if (i_1207_ != 0) {
									i_1201_ = ((i_1207_ & 0xff00ff) * i_1199_ & ~0xff00ff);
									i_1202_ = ((i_1207_ & 0xff00) * i_1199_ & 0xff0000);
									is[i_1123_++] = ((i_1201_ | i_1202_) >>> 8) + i_1111_;
								} else
									i_1123_++;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1203_;
							i_1123_ += i_1124_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1112_ == 2) {
					if (i_1110_ == 1) {
						int i_1208_ = i_1114_;
						for (int i_1209_ = -i_1109_; i_1209_ < 0; i_1209_++) {
							int i_1210_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1211_ = -i_1108_; i_1211_ < 0; i_1211_++) {
								int i_1212_ = (anIntArray11347[(i_1114_ >> 16) + i_1210_]);
								if (i_1212_ != 0) {
									int i_1213_ = is[i_1123_];
									int i_1214_ = i_1212_ + i_1213_;
									int i_1215_ = ((i_1212_ & 0xff00ff) + (i_1213_ & 0xff00ff));
									i_1213_ = ((i_1215_ & 0x1000100) + (i_1214_ - i_1215_ & 0x10000));
									is[i_1123_++] = (i_1214_ - i_1213_ | i_1213_ - (i_1213_ >>> 8));
								} else
									i_1123_++;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1208_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 0) {
						int i_1216_ = i_1114_;
						int i_1217_ = (i_1111_ & 0xff0000) >> 16;
						int i_1218_ = (i_1111_ & 0xff00) >> 8;
						int i_1219_ = i_1111_ & 0xff;
						for (int i_1220_ = -i_1109_; i_1220_ < 0; i_1220_++) {
							int i_1221_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1222_ = -i_1108_; i_1222_ < 0; i_1222_++) {
								int i_1223_ = (anIntArray11347[(i_1114_ >> 16) + i_1221_]);
								if (i_1223_ != 0) {
									int i_1224_ = ((i_1223_ & 0xff0000) * i_1217_ & ~0xffffff);
									int i_1225_ = ((i_1223_ & 0xff00) * i_1218_ & 0xff0000);
									int i_1226_ = (i_1223_ & 0xff) * i_1219_ & 0xff00;
									i_1223_ = (i_1224_ | i_1225_ | i_1226_) >>> 8;
									int i_1227_ = is[i_1123_];
									int i_1228_ = i_1223_ + i_1227_;
									int i_1229_ = ((i_1223_ & 0xff00ff) + (i_1227_ & 0xff00ff));
									i_1227_ = ((i_1229_ & 0x1000100) + (i_1228_ - i_1229_ & 0x10000));
									is[i_1123_++] = (i_1228_ - i_1227_ | i_1227_ - (i_1227_ >>> 8));
								} else
									i_1123_++;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1216_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 3) {
						int i_1230_ = i_1114_;
						for (int i_1231_ = -i_1109_; i_1231_ < 0; i_1231_++) {
							int i_1232_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1233_ = -i_1108_; i_1233_ < 0; i_1233_++) {
								int i_1234_ = (anIntArray11347[(i_1114_ >> 16) + i_1232_]);
								int i_1235_ = i_1234_ + i_1111_;
								int i_1236_ = ((i_1234_ & 0xff00ff) + (i_1111_ & 0xff00ff));
								int i_1237_ = ((i_1236_ & 0x1000100) + (i_1235_ - i_1236_ & 0x10000));
								i_1234_ = i_1235_ - i_1237_ | i_1237_ - (i_1237_ >>> 8);
								i_1237_ = is[i_1123_];
								i_1235_ = i_1234_ + i_1237_;
								i_1236_ = (i_1234_ & 0xff00ff) + (i_1237_ & 0xff00ff);
								i_1237_ = ((i_1236_ & 0x1000100) + (i_1235_ - i_1236_ & 0x10000));
								is[i_1123_++] = i_1235_ - i_1237_ | i_1237_ - (i_1237_ >>> 8);
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1230_;
							i_1123_ += i_1124_;
						}
					} else if (i_1110_ == 2) {
						int i_1238_ = i_1111_ >>> 24;
						int i_1239_ = 256 - i_1238_;
						int i_1240_ = (i_1111_ & 0xff00ff) * i_1239_ & ~0xff00ff;
						int i_1241_ = (i_1111_ & 0xff00) * i_1239_ & 0xff0000;
						i_1111_ = (i_1240_ | i_1241_) >>> 8;
						int i_1242_ = i_1114_;
						for (int i_1243_ = -i_1109_; i_1243_ < 0; i_1243_++) {
							int i_1244_ = (i_1115_ >> 16) * anInt8914;
							for (int i_1245_ = -i_1108_; i_1245_ < 0; i_1245_++) {
								int i_1246_ = (anIntArray11347[(i_1114_ >> 16) + i_1244_]);
								if (i_1246_ != 0) {
									i_1240_ = ((i_1246_ & 0xff00ff) * i_1238_ & ~0xff00ff);
									i_1241_ = ((i_1246_ & 0xff00) * i_1238_ & 0xff0000);
									i_1246_ = (((i_1240_ | i_1241_) >>> 8) + i_1111_);
									int i_1247_ = is[i_1123_];
									int i_1248_ = i_1246_ + i_1247_;
									int i_1249_ = ((i_1246_ & 0xff00ff) + (i_1247_ & 0xff00ff));
									i_1247_ = ((i_1249_ & 0x1000100) + (i_1248_ - i_1249_ & 0x10000));
									is[i_1123_++] = (i_1248_ - i_1247_ | i_1247_ - (i_1247_ >>> 8));
								} else
									i_1123_++;
								i_1114_ += i_1119_;
							}
							i_1115_ += i_1120_;
							i_1114_ = i_1242_;
							i_1123_ += i_1124_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2488(int i, int i_1250_, Class145 class145, int i_1251_, int i_1252_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			i += anInt8921;
			i_1250_ += anInt8918;
			int i_1253_ = 0;
			int i_1254_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
			int i_1255_ = anInt8914;
			int i_1256_ = anInt8916;
			int i_1257_ = i_1254_ - i_1255_;
			int i_1258_ = 0;
			int i_1259_ = i + i_1250_ * i_1254_;
			if (i_1250_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_1260_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1250_;
				i_1256_ -= i_1260_;
				i_1250_ = aClass178_Sub3_8923.anInt9810 * -695823527;
				i_1253_ += i_1260_ * i_1255_;
				i_1259_ += i_1260_ * i_1254_;
			}
			if (i_1250_ + i_1256_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_1256_ -= (i_1250_ + i_1256_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_1261_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_1255_ -= i_1261_;
				i = aClass178_Sub3_8923.anInt9815 * -1373518821;
				i_1253_ += i_1261_;
				i_1259_ += i_1261_;
				i_1258_ += i_1261_;
				i_1257_ += i_1261_;
			}
			if (i + i_1255_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_1262_ = i + i_1255_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_1255_ -= i_1262_;
				i_1258_ += i_1262_;
				i_1257_ += i_1262_;
			}
			if (i_1255_ > 0 && i_1256_ > 0) {
				Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
				int[] is_1263_ = class145_sub1.anIntArray9521;
				int[] is_1264_ = class145_sub1.anIntArray9520;
				int i_1265_ = i_1250_;
				if (i_1252_ > i_1265_) {
					i_1265_ = i_1252_;
					i_1259_ += (i_1252_ - i_1250_) * i_1254_;
					i_1253_ += (i_1252_ - i_1250_) * anInt8914;
				}
				int i_1266_ = (i_1252_ + is_1263_.length < i_1250_ + i_1256_ ? i_1252_ + is_1263_.length : i_1250_ + i_1256_);
				for (int i_1267_ = i_1265_; i_1267_ < i_1266_; i_1267_++) {
					int i_1268_ = is_1263_[i_1267_ - i_1252_] + i_1251_;
					int i_1269_ = is_1264_[i_1267_ - i_1252_];
					int i_1270_ = i_1255_;
					if (i > i_1268_) {
						int i_1271_ = i - i_1268_;
						if (i_1271_ >= i_1269_) {
							i_1253_ += i_1255_ + i_1258_;
							i_1259_ += i_1255_ + i_1257_;
							continue;
						}
						i_1269_ -= i_1271_;
					} else {
						int i_1272_ = i_1268_ - i;
						if (i_1272_ >= i_1255_) {
							i_1253_ += i_1255_ + i_1258_;
							i_1259_ += i_1255_ + i_1257_;
							continue;
						}
						i_1253_ += i_1272_;
						i_1270_ -= i_1272_;
						i_1259_ += i_1272_;
					}
					int i_1273_ = 0;
					if (i_1270_ < i_1269_)
						i_1269_ = i_1270_;
					else
						i_1273_ = i_1270_ - i_1269_;
					for (int i_1274_ = -i_1269_; i_1274_ < 0; i_1274_++) {
						int i_1275_ = anIntArray11347[i_1253_++];
						if (i_1275_ != 0)
							is[i_1259_++] = i_1275_;
						else
							i_1259_++;
					}
					i_1253_ += i_1273_ + i_1258_;
					i_1259_ += i_1273_ + i_1257_;
				}
			}
		}
	}

	void method17757(int i, int i_1276_, int i_1277_, int i_1278_, int[] is, int i_1279_, int i_1280_) {
		i_1280_ -= i_1277_;
		for (int i_1281_ = 0; i_1281_ < i_1278_; i_1281_++) {
			int i_1282_ = (i_1276_ + i_1281_) * i_1277_ + i;
			for (int i_1283_ = 0; i_1283_ < i_1277_; i_1283_++)
				is[i_1279_++] = anIntArray11347[i_1282_ + i_1283_];
			i_1279_ += i_1280_;
		}
	}

	void method14408(boolean bool, boolean bool_1284_, boolean bool_1285_, int i, int i_1286_, float f, int i_1287_, int i_1288_, int i_1289_, int i_1290_, int i_1291_, int i_1292_, boolean bool_1293_) {
		if (i_1287_ > 0 && i_1288_ > 0 && (bool || bool_1284_)) {
			int i_1294_ = 0;
			int i_1295_ = 0;
			int i_1296_ = anInt8921 + anInt8914 + anInt8919;
			int i_1297_ = anInt8918 + anInt8916 + anInt8920;
			int i_1298_ = (i_1296_ << 16) / i_1287_;
			int i_1299_ = (i_1297_ << 16) / i_1288_;
			if (anInt8921 > 0) {
				int i_1300_ = ((anInt8921 << 16) + i_1298_ - 1) / i_1298_;
				i += i_1300_;
				i_1294_ += i_1300_ * i_1298_ - (anInt8921 << 16);
			}
			if (anInt8918 > 0) {
				int i_1301_ = ((anInt8918 << 16) + i_1299_ - 1) / i_1299_;
				i_1286_ += i_1301_;
				i_1295_ += i_1301_ * i_1299_ - (anInt8918 << 16);
			}
			if (anInt8914 < i_1296_)
				i_1287_ = ((anInt8914 << 16) - i_1294_ + i_1298_ - 1) / i_1298_;
			if (anInt8916 < i_1297_)
				i_1288_ = ((anInt8916 << 16) - i_1295_ + i_1299_ - 1) / i_1299_;
			int i_1302_ = i + i_1286_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
			int i_1303_ = aClass178_Sub3_8923.anInt9825 * 1013077751 - i_1287_;
			if (i_1286_ + i_1288_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_1288_ -= (i_1286_ + i_1288_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i_1286_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_1304_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1286_;
				i_1288_ -= i_1304_;
				i_1302_ += i_1304_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
				i_1295_ += i_1299_ * i_1304_;
			}
			if (i + i_1287_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_1305_ = i + i_1287_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_1287_ -= i_1305_;
				i_1303_ += i_1305_;
			}
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_1306_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_1287_ -= i_1306_;
				i_1302_ += i_1306_;
				i_1294_ += i_1298_ * i_1306_;
				i_1303_ += i_1306_;
			}
			float[] fs = aClass178_Sub3_8923.aFloatArray9807;
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (i_1291_ == 0) {
				if (i_1289_ == 1) {
					int i_1307_ = i_1294_;
					for (int i_1308_ = -i_1288_; i_1308_ < 0; i_1308_++) {
						int i_1309_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1310_ = -i_1287_; i_1310_ < 0; i_1310_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								if (bool)
									is[i_1302_] = (anIntArray11347[(i_1294_ >> 16) + i_1309_]);
								if (bool_1284_ && bool_1293_)
									fs[i_1302_] = f;
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1307_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 0) {
					int i_1311_ = (i_1290_ & 0xff0000) >> 16;
					int i_1312_ = (i_1290_ & 0xff00) >> 8;
					int i_1313_ = i_1290_ & 0xff;
					int i_1314_ = i_1294_;
					for (int i_1315_ = -i_1288_; i_1315_ < 0; i_1315_++) {
						int i_1316_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1317_ = -i_1287_; i_1317_ < 0; i_1317_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								if (bool) {
									int i_1318_ = (anIntArray11347[(i_1294_ >> 16) + i_1316_]);
									int i_1319_ = ((i_1318_ & 0xff0000) * i_1311_ & ~0xffffff);
									int i_1320_ = ((i_1318_ & 0xff00) * i_1312_ & 0xff0000);
									int i_1321_ = (i_1318_ & 0xff) * i_1313_ & 0xff00;
									is[i_1302_] = (i_1319_ | i_1320_ | i_1321_) >>> 8;
								}
								if (bool_1284_ && bool_1293_)
									fs[i_1302_] = f;
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1314_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 3) {
					int i_1322_ = i_1294_;
					for (int i_1323_ = -i_1288_; i_1323_ < 0; i_1323_++) {
						int i_1324_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1325_ = -i_1287_; i_1325_ < 0; i_1325_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								if (bool) {
									int i_1326_ = (anIntArray11347[(i_1294_ >> 16) + i_1324_]);
									int i_1327_ = i_1326_ + i_1290_;
									int i_1328_ = ((i_1326_ & 0xff00ff) + (i_1290_ & 0xff00ff));
									int i_1329_ = ((i_1328_ & 0x1000100) + (i_1327_ - i_1328_ & 0x10000));
									is[i_1302_] = (i_1327_ - i_1329_ | i_1329_ - (i_1329_ >>> 8));
								}
								if (bool_1284_ && bool_1293_)
									fs[i_1302_] = f;
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1322_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 2) {
					int i_1330_ = i_1290_ >>> 24;
					int i_1331_ = 256 - i_1330_;
					int i_1332_ = (i_1290_ & 0xff00ff) * i_1331_ & ~0xff00ff;
					int i_1333_ = (i_1290_ & 0xff00) * i_1331_ & 0xff0000;
					i_1290_ = (i_1332_ | i_1333_) >>> 8;
					int i_1334_ = i_1294_;
					for (int i_1335_ = -i_1288_; i_1335_ < 0; i_1335_++) {
						int i_1336_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1337_ = -i_1287_; i_1337_ < 0; i_1337_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								if (bool) {
									int i_1338_ = (anIntArray11347[(i_1294_ >> 16) + i_1336_]);
									i_1332_ = ((i_1338_ & 0xff00ff) * i_1330_ & ~0xff00ff);
									i_1333_ = ((i_1338_ & 0xff00) * i_1330_ & 0xff0000);
									is[i_1302_] = (((i_1332_ | i_1333_) >>> 8) + i_1290_);
								}
								if (bool_1284_ && bool_1293_)
									fs[i_1302_] = f;
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1334_;
						i_1302_ += i_1303_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1291_ == 1) {
				if (i_1289_ == 1) {
					int i_1339_ = i_1294_;
					for (int i_1340_ = -i_1288_; i_1340_ < 0; i_1340_++) {
						int i_1341_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1342_ = -i_1287_; i_1342_ < 0; i_1342_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								int i_1343_ = (anIntArray11347[(i_1294_ >> 16) + i_1341_]);
								if (i_1343_ != 0) {
									if (bool)
										is[i_1302_] = i_1343_;
									if (bool_1284_ && bool_1293_)
										fs[i_1302_] = f;
								}
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1339_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 0) {
					int i_1344_ = i_1294_;
					if ((i_1290_ & 0xffffff) == 16777215) {
						int i_1345_ = i_1290_ >>> 24;
						int i_1346_ = 256 - i_1345_;
						for (int i_1347_ = -i_1288_; i_1347_ < 0; i_1347_++) {
							int i_1348_ = (i_1295_ >> 16) * anInt8914;
							for (int i_1349_ = -i_1287_; i_1349_ < 0; i_1349_++) {
								if (!bool_1284_ || f < fs[i_1302_]) {
									int i_1350_ = (anIntArray11347[(i_1294_ >> 16) + i_1348_]);
									if (i_1350_ != 0) {
										if (bool) {
											int i_1351_ = is[i_1302_];
											is[i_1302_] = (((((i_1350_ & 0xff00ff) * i_1345_) + ((i_1351_ & 0xff00ff) * i_1346_)) & ~0xff00ff) + ((((i_1350_ & 0xff00) * i_1345_) + ((i_1351_ & 0xff00) * i_1346_)) & 0xff0000)) >> 8;
										}
										if (bool_1284_ && bool_1293_)
											fs[i_1302_] = f;
									}
								}
								i_1294_ += i_1298_;
								i_1302_++;
							}
							i_1295_ += i_1299_;
							i_1294_ = i_1344_;
							i_1302_ += i_1303_;
						}
					} else {
						int i_1352_ = (i_1290_ & 0xff0000) >> 16;
						int i_1353_ = (i_1290_ & 0xff00) >> 8;
						int i_1354_ = i_1290_ & 0xff;
						int i_1355_ = i_1290_ >>> 24;
						int i_1356_ = 256 - i_1355_;
						for (int i_1357_ = -i_1288_; i_1357_ < 0; i_1357_++) {
							int i_1358_ = (i_1295_ >> 16) * anInt8914;
							for (int i_1359_ = -i_1287_; i_1359_ < 0; i_1359_++) {
								if (!bool_1284_ || f < fs[i_1302_]) {
									int i_1360_ = (anIntArray11347[(i_1294_ >> 16) + i_1358_]);
									if (i_1360_ != 0) {
										if (i_1355_ != 255) {
											if (bool) {
												int i_1361_ = (((i_1360_ & 0xff0000) * i_1352_) & ~0xffffff);
												int i_1362_ = (((i_1360_ & 0xff00) * i_1353_) & 0xff0000);
												int i_1363_ = (((i_1360_ & 0xff) * i_1354_) & 0xff00);
												i_1360_ = (i_1361_ | i_1362_ | i_1363_) >>> 8;
												int i_1364_ = is[i_1302_];
												is[i_1302_] = (((((i_1360_ & 0xff00ff) * i_1355_) + ((i_1364_ & 0xff00ff) * i_1356_)) & ~0xff00ff) + ((((i_1360_ & 0xff00) * i_1355_) + ((i_1364_ & 0xff00) * i_1356_)) & 0xff0000)) >> 8;
											}
											if (bool_1284_ && bool_1293_)
												fs[i_1302_] = f;
										} else {
											if (bool) {
												int i_1365_ = (((i_1360_ & 0xff0000) * i_1352_) & ~0xffffff);
												int i_1366_ = (((i_1360_ & 0xff00) * i_1353_) & 0xff0000);
												int i_1367_ = (((i_1360_ & 0xff) * i_1354_) & 0xff00);
												is[i_1302_] = (i_1365_ | i_1366_ | i_1367_) >>> 8;
											}
											if (bool_1284_ && bool_1293_)
												fs[i_1302_] = f;
										}
									}
								}
								i_1294_ += i_1298_;
								i_1302_++;
							}
							i_1295_ += i_1299_;
							i_1294_ = i_1344_;
							i_1302_ += i_1303_;
						}
					}
				} else if (i_1289_ == 3) {
					int i_1368_ = i_1294_;
					int i_1369_ = i_1290_ >>> 24;
					int i_1370_ = 256 - i_1369_;
					for (int i_1371_ = -i_1288_; i_1371_ < 0; i_1371_++) {
						int i_1372_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1373_ = -i_1287_; i_1373_ < 0; i_1373_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								if (bool) {
									int i_1374_ = (anIntArray11347[(i_1294_ >> 16) + i_1372_]);
									int i_1375_ = i_1374_ + i_1290_;
									int i_1376_ = ((i_1374_ & 0xff00ff) + (i_1290_ & 0xff00ff));
									int i_1377_ = ((i_1376_ & 0x1000100) + (i_1375_ - i_1376_ & 0x10000));
									i_1377_ = (i_1375_ - i_1377_ | i_1377_ - (i_1377_ >>> 8));
									if (i_1374_ == 0 && i_1369_ != 255) {
										i_1374_ = i_1377_;
										i_1377_ = is[i_1302_];
										i_1377_ = ((((i_1374_ & 0xff00ff) * i_1369_ + ((i_1377_ & 0xff00ff) * i_1370_)) & ~0xff00ff) + (((i_1374_ & 0xff00) * i_1369_ + ((i_1377_ & 0xff00) * i_1370_)) & 0xff0000)) >> 8;
									}
									is[i_1302_] = i_1377_;
								}
								if (bool_1284_ && bool_1293_)
									fs[i_1302_] = f;
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1368_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 2) {
					int i_1378_ = i_1290_ >>> 24;
					int i_1379_ = 256 - i_1378_;
					int i_1380_ = (i_1290_ & 0xff00ff) * i_1379_ & ~0xff00ff;
					int i_1381_ = (i_1290_ & 0xff00) * i_1379_ & 0xff0000;
					i_1290_ = (i_1380_ | i_1381_) >>> 8;
					int i_1382_ = i_1294_;
					for (int i_1383_ = -i_1288_; i_1383_ < 0; i_1383_++) {
						int i_1384_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1385_ = -i_1287_; i_1385_ < 0; i_1385_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								int i_1386_ = (anIntArray11347[(i_1294_ >> 16) + i_1384_]);
								if (i_1386_ != 0) {
									if (bool) {
										i_1380_ = ((i_1386_ & 0xff00ff) * i_1378_ & ~0xff00ff);
										i_1381_ = ((i_1386_ & 0xff00) * i_1378_ & 0xff0000);
										is[i_1302_] = ((i_1380_ | i_1381_) >>> 8) + i_1290_;
									}
									if (bool_1284_ && bool_1293_)
										fs[i_1302_] = f;
								}
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1382_;
						i_1302_ += i_1303_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1291_ == 2) {
				if (i_1289_ == 1) {
					int i_1387_ = i_1294_;
					for (int i_1388_ = -i_1288_; i_1388_ < 0; i_1388_++) {
						int i_1389_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1390_ = -i_1287_; i_1390_ < 0; i_1390_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								int i_1391_ = (anIntArray11347[(i_1294_ >> 16) + i_1389_]);
								if (i_1391_ != 0) {
									if (bool) {
										int i_1392_ = is[i_1302_];
										int i_1393_ = i_1391_ + i_1392_;
										int i_1394_ = ((i_1391_ & 0xff00ff) + (i_1392_ & 0xff00ff));
										i_1392_ = ((i_1394_ & 0x1000100) + (i_1393_ - i_1394_ & 0x10000));
										is[i_1302_] = (i_1393_ - i_1392_ | i_1392_ - (i_1392_ >>> 8));
									}
									if (bool_1284_ && bool_1293_)
										fs[i_1302_] = f;
								}
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1387_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 0) {
					int i_1395_ = i_1294_;
					int i_1396_ = (i_1290_ & 0xff0000) >> 16;
					int i_1397_ = (i_1290_ & 0xff00) >> 8;
					int i_1398_ = i_1290_ & 0xff;
					for (int i_1399_ = -i_1288_; i_1399_ < 0; i_1399_++) {
						int i_1400_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1401_ = -i_1287_; i_1401_ < 0; i_1401_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								int i_1402_ = (anIntArray11347[(i_1294_ >> 16) + i_1400_]);
								if (i_1402_ != 0) {
									if (bool) {
										int i_1403_ = ((i_1402_ & 0xff0000) * i_1396_ & ~0xffffff);
										int i_1404_ = ((i_1402_ & 0xff00) * i_1397_ & 0xff0000);
										int i_1405_ = ((i_1402_ & 0xff) * i_1398_ & 0xff00);
										i_1402_ = (i_1403_ | i_1404_ | i_1405_) >>> 8;
										int i_1406_ = is[i_1302_];
										int i_1407_ = i_1402_ + i_1406_;
										int i_1408_ = ((i_1402_ & 0xff00ff) + (i_1406_ & 0xff00ff));
										i_1406_ = ((i_1408_ & 0x1000100) + (i_1407_ - i_1408_ & 0x10000));
										is[i_1302_] = (i_1407_ - i_1406_ | i_1406_ - (i_1406_ >>> 8));
									}
									if (bool_1284_ && bool_1293_)
										fs[i_1302_] = f;
								}
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1395_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 3) {
					int i_1409_ = i_1294_;
					for (int i_1410_ = -i_1288_; i_1410_ < 0; i_1410_++) {
						int i_1411_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1412_ = -i_1287_; i_1412_ < 0; i_1412_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								if (bool) {
									int i_1413_ = (anIntArray11347[(i_1294_ >> 16) + i_1411_]);
									int i_1414_ = i_1413_ + i_1290_;
									int i_1415_ = ((i_1413_ & 0xff00ff) + (i_1290_ & 0xff00ff));
									int i_1416_ = ((i_1415_ & 0x1000100) + (i_1414_ - i_1415_ & 0x10000));
									i_1413_ = (i_1414_ - i_1416_ | i_1416_ - (i_1416_ >>> 8));
									i_1416_ = is[i_1302_];
									i_1414_ = i_1413_ + i_1416_;
									i_1415_ = (i_1413_ & 0xff00ff) + (i_1416_ & 0xff00ff);
									i_1416_ = ((i_1415_ & 0x1000100) + (i_1414_ - i_1415_ & 0x10000));
									is[i_1302_] = (i_1414_ - i_1416_ | i_1416_ - (i_1416_ >>> 8));
								}
								if (bool_1284_ && bool_1293_)
									fs[i_1302_] = f;
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1409_;
						i_1302_ += i_1303_;
					}
				} else if (i_1289_ == 2) {
					int i_1417_ = i_1290_ >>> 24;
					int i_1418_ = 256 - i_1417_;
					int i_1419_ = (i_1290_ & 0xff00ff) * i_1418_ & ~0xff00ff;
					int i_1420_ = (i_1290_ & 0xff00) * i_1418_ & 0xff0000;
					i_1290_ = (i_1419_ | i_1420_) >>> 8;
					int i_1421_ = i_1294_;
					for (int i_1422_ = -i_1288_; i_1422_ < 0; i_1422_++) {
						int i_1423_ = (i_1295_ >> 16) * anInt8914;
						for (int i_1424_ = -i_1287_; i_1424_ < 0; i_1424_++) {
							if (!bool_1284_ || f < fs[i_1302_]) {
								int i_1425_ = (anIntArray11347[(i_1294_ >> 16) + i_1423_]);
								if (i_1425_ != 0) {
									if (bool) {
										i_1419_ = ((i_1425_ & 0xff00ff) * i_1417_ & ~0xff00ff);
										i_1420_ = ((i_1425_ & 0xff00) * i_1417_ & 0xff0000);
										i_1425_ = (((i_1419_ | i_1420_) >>> 8) + i_1290_);
										int i_1426_ = is[i_1302_];
										int i_1427_ = i_1425_ + i_1426_;
										int i_1428_ = ((i_1425_ & 0xff00ff) + (i_1426_ & 0xff00ff));
										i_1426_ = ((i_1428_ & 0x1000100) + (i_1427_ - i_1428_ & 0x10000));
										is[i_1302_] = (i_1427_ - i_1426_ | i_1426_ - (i_1426_ >>> 8));
									}
									if (bool_1284_ && bool_1293_)
										fs[i_1302_] = f;
								}
							}
							i_1294_ += i_1298_;
							i_1302_++;
						}
						i_1295_ += i_1299_;
						i_1294_ = i_1421_;
						i_1302_ += i_1303_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14410(boolean bool, boolean bool_1429_, boolean bool_1430_, int i, int i_1431_, float f, int i_1432_, int i_1433_, int i_1434_, int i_1435_, int i_1436_, int i_1437_, boolean bool_1438_) {
		if (i_1432_ > 0 && i_1433_ > 0 && (bool || bool_1429_)) {
			int i_1439_ = 0;
			int i_1440_ = 0;
			int i_1441_ = anInt8921 + anInt8914 + anInt8919;
			int i_1442_ = anInt8918 + anInt8916 + anInt8920;
			int i_1443_ = (i_1441_ << 16) / i_1432_;
			int i_1444_ = (i_1442_ << 16) / i_1433_;
			if (anInt8921 > 0) {
				int i_1445_ = ((anInt8921 << 16) + i_1443_ - 1) / i_1443_;
				i += i_1445_;
				i_1439_ += i_1445_ * i_1443_ - (anInt8921 << 16);
			}
			if (anInt8918 > 0) {
				int i_1446_ = ((anInt8918 << 16) + i_1444_ - 1) / i_1444_;
				i_1431_ += i_1446_;
				i_1440_ += i_1446_ * i_1444_ - (anInt8918 << 16);
			}
			if (anInt8914 < i_1441_)
				i_1432_ = ((anInt8914 << 16) - i_1439_ + i_1443_ - 1) / i_1443_;
			if (anInt8916 < i_1442_)
				i_1433_ = ((anInt8916 << 16) - i_1440_ + i_1444_ - 1) / i_1444_;
			int i_1447_ = i + i_1431_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
			int i_1448_ = aClass178_Sub3_8923.anInt9825 * 1013077751 - i_1432_;
			if (i_1431_ + i_1433_ > aClass178_Sub3_8923.anInt9826 * 489020741)
				i_1433_ -= (i_1431_ + i_1433_ - aClass178_Sub3_8923.anInt9826 * 489020741);
			if (i_1431_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
				int i_1449_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1431_;
				i_1433_ -= i_1449_;
				i_1447_ += i_1449_ * (aClass178_Sub3_8923.anInt9825 * 1013077751);
				i_1440_ += i_1444_ * i_1449_;
			}
			if (i + i_1432_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
				int i_1450_ = i + i_1432_ - aClass178_Sub3_8923.anInt9809 * -272361347;
				i_1432_ -= i_1450_;
				i_1448_ += i_1450_;
			}
			if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
				int i_1451_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
				i_1432_ -= i_1451_;
				i_1447_ += i_1451_;
				i_1439_ += i_1443_ * i_1451_;
				i_1448_ += i_1451_;
			}
			float[] fs = aClass178_Sub3_8923.aFloatArray9807;
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (i_1436_ == 0) {
				if (i_1434_ == 1) {
					int i_1452_ = i_1439_;
					for (int i_1453_ = -i_1433_; i_1453_ < 0; i_1453_++) {
						int i_1454_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1455_ = -i_1432_; i_1455_ < 0; i_1455_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								if (bool)
									is[i_1447_] = (anIntArray11347[(i_1439_ >> 16) + i_1454_]);
								if (bool_1429_ && bool_1438_)
									fs[i_1447_] = f;
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1452_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 0) {
					int i_1456_ = (i_1435_ & 0xff0000) >> 16;
					int i_1457_ = (i_1435_ & 0xff00) >> 8;
					int i_1458_ = i_1435_ & 0xff;
					int i_1459_ = i_1439_;
					for (int i_1460_ = -i_1433_; i_1460_ < 0; i_1460_++) {
						int i_1461_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1462_ = -i_1432_; i_1462_ < 0; i_1462_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								if (bool) {
									int i_1463_ = (anIntArray11347[(i_1439_ >> 16) + i_1461_]);
									int i_1464_ = ((i_1463_ & 0xff0000) * i_1456_ & ~0xffffff);
									int i_1465_ = ((i_1463_ & 0xff00) * i_1457_ & 0xff0000);
									int i_1466_ = (i_1463_ & 0xff) * i_1458_ & 0xff00;
									is[i_1447_] = (i_1464_ | i_1465_ | i_1466_) >>> 8;
								}
								if (bool_1429_ && bool_1438_)
									fs[i_1447_] = f;
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1459_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 3) {
					int i_1467_ = i_1439_;
					for (int i_1468_ = -i_1433_; i_1468_ < 0; i_1468_++) {
						int i_1469_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1470_ = -i_1432_; i_1470_ < 0; i_1470_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								if (bool) {
									int i_1471_ = (anIntArray11347[(i_1439_ >> 16) + i_1469_]);
									int i_1472_ = i_1471_ + i_1435_;
									int i_1473_ = ((i_1471_ & 0xff00ff) + (i_1435_ & 0xff00ff));
									int i_1474_ = ((i_1473_ & 0x1000100) + (i_1472_ - i_1473_ & 0x10000));
									is[i_1447_] = (i_1472_ - i_1474_ | i_1474_ - (i_1474_ >>> 8));
								}
								if (bool_1429_ && bool_1438_)
									fs[i_1447_] = f;
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1467_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 2) {
					int i_1475_ = i_1435_ >>> 24;
					int i_1476_ = 256 - i_1475_;
					int i_1477_ = (i_1435_ & 0xff00ff) * i_1476_ & ~0xff00ff;
					int i_1478_ = (i_1435_ & 0xff00) * i_1476_ & 0xff0000;
					i_1435_ = (i_1477_ | i_1478_) >>> 8;
					int i_1479_ = i_1439_;
					for (int i_1480_ = -i_1433_; i_1480_ < 0; i_1480_++) {
						int i_1481_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1482_ = -i_1432_; i_1482_ < 0; i_1482_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								if (bool) {
									int i_1483_ = (anIntArray11347[(i_1439_ >> 16) + i_1481_]);
									i_1477_ = ((i_1483_ & 0xff00ff) * i_1475_ & ~0xff00ff);
									i_1478_ = ((i_1483_ & 0xff00) * i_1475_ & 0xff0000);
									is[i_1447_] = (((i_1477_ | i_1478_) >>> 8) + i_1435_);
								}
								if (bool_1429_ && bool_1438_)
									fs[i_1447_] = f;
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1479_;
						i_1447_ += i_1448_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1436_ == 1) {
				if (i_1434_ == 1) {
					int i_1484_ = i_1439_;
					for (int i_1485_ = -i_1433_; i_1485_ < 0; i_1485_++) {
						int i_1486_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1487_ = -i_1432_; i_1487_ < 0; i_1487_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								int i_1488_ = (anIntArray11347[(i_1439_ >> 16) + i_1486_]);
								if (i_1488_ != 0) {
									if (bool)
										is[i_1447_] = i_1488_;
									if (bool_1429_ && bool_1438_)
										fs[i_1447_] = f;
								}
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1484_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 0) {
					int i_1489_ = i_1439_;
					if ((i_1435_ & 0xffffff) == 16777215) {
						int i_1490_ = i_1435_ >>> 24;
						int i_1491_ = 256 - i_1490_;
						for (int i_1492_ = -i_1433_; i_1492_ < 0; i_1492_++) {
							int i_1493_ = (i_1440_ >> 16) * anInt8914;
							for (int i_1494_ = -i_1432_; i_1494_ < 0; i_1494_++) {
								if (!bool_1429_ || f < fs[i_1447_]) {
									int i_1495_ = (anIntArray11347[(i_1439_ >> 16) + i_1493_]);
									if (i_1495_ != 0) {
										if (bool) {
											int i_1496_ = is[i_1447_];
											is[i_1447_] = (((((i_1495_ & 0xff00ff) * i_1490_) + ((i_1496_ & 0xff00ff) * i_1491_)) & ~0xff00ff) + ((((i_1495_ & 0xff00) * i_1490_) + ((i_1496_ & 0xff00) * i_1491_)) & 0xff0000)) >> 8;
										}
										if (bool_1429_ && bool_1438_)
											fs[i_1447_] = f;
									}
								}
								i_1439_ += i_1443_;
								i_1447_++;
							}
							i_1440_ += i_1444_;
							i_1439_ = i_1489_;
							i_1447_ += i_1448_;
						}
					} else {
						int i_1497_ = (i_1435_ & 0xff0000) >> 16;
						int i_1498_ = (i_1435_ & 0xff00) >> 8;
						int i_1499_ = i_1435_ & 0xff;
						int i_1500_ = i_1435_ >>> 24;
						int i_1501_ = 256 - i_1500_;
						for (int i_1502_ = -i_1433_; i_1502_ < 0; i_1502_++) {
							int i_1503_ = (i_1440_ >> 16) * anInt8914;
							for (int i_1504_ = -i_1432_; i_1504_ < 0; i_1504_++) {
								if (!bool_1429_ || f < fs[i_1447_]) {
									int i_1505_ = (anIntArray11347[(i_1439_ >> 16) + i_1503_]);
									if (i_1505_ != 0) {
										if (i_1500_ != 255) {
											if (bool) {
												int i_1506_ = (((i_1505_ & 0xff0000) * i_1497_) & ~0xffffff);
												int i_1507_ = (((i_1505_ & 0xff00) * i_1498_) & 0xff0000);
												int i_1508_ = (((i_1505_ & 0xff) * i_1499_) & 0xff00);
												i_1505_ = (i_1506_ | i_1507_ | i_1508_) >>> 8;
												int i_1509_ = is[i_1447_];
												is[i_1447_] = (((((i_1505_ & 0xff00ff) * i_1500_) + ((i_1509_ & 0xff00ff) * i_1501_)) & ~0xff00ff) + ((((i_1505_ & 0xff00) * i_1500_) + ((i_1509_ & 0xff00) * i_1501_)) & 0xff0000)) >> 8;
											}
											if (bool_1429_ && bool_1438_)
												fs[i_1447_] = f;
										} else {
											if (bool) {
												int i_1510_ = (((i_1505_ & 0xff0000) * i_1497_) & ~0xffffff);
												int i_1511_ = (((i_1505_ & 0xff00) * i_1498_) & 0xff0000);
												int i_1512_ = (((i_1505_ & 0xff) * i_1499_) & 0xff00);
												is[i_1447_] = (i_1510_ | i_1511_ | i_1512_) >>> 8;
											}
											if (bool_1429_ && bool_1438_)
												fs[i_1447_] = f;
										}
									}
								}
								i_1439_ += i_1443_;
								i_1447_++;
							}
							i_1440_ += i_1444_;
							i_1439_ = i_1489_;
							i_1447_ += i_1448_;
						}
					}
				} else if (i_1434_ == 3) {
					int i_1513_ = i_1439_;
					int i_1514_ = i_1435_ >>> 24;
					int i_1515_ = 256 - i_1514_;
					for (int i_1516_ = -i_1433_; i_1516_ < 0; i_1516_++) {
						int i_1517_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1518_ = -i_1432_; i_1518_ < 0; i_1518_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								if (bool) {
									int i_1519_ = (anIntArray11347[(i_1439_ >> 16) + i_1517_]);
									int i_1520_ = i_1519_ + i_1435_;
									int i_1521_ = ((i_1519_ & 0xff00ff) + (i_1435_ & 0xff00ff));
									int i_1522_ = ((i_1521_ & 0x1000100) + (i_1520_ - i_1521_ & 0x10000));
									i_1522_ = (i_1520_ - i_1522_ | i_1522_ - (i_1522_ >>> 8));
									if (i_1519_ == 0 && i_1514_ != 255) {
										i_1519_ = i_1522_;
										i_1522_ = is[i_1447_];
										i_1522_ = ((((i_1519_ & 0xff00ff) * i_1514_ + ((i_1522_ & 0xff00ff) * i_1515_)) & ~0xff00ff) + (((i_1519_ & 0xff00) * i_1514_ + ((i_1522_ & 0xff00) * i_1515_)) & 0xff0000)) >> 8;
									}
									is[i_1447_] = i_1522_;
								}
								if (bool_1429_ && bool_1438_)
									fs[i_1447_] = f;
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1513_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 2) {
					int i_1523_ = i_1435_ >>> 24;
					int i_1524_ = 256 - i_1523_;
					int i_1525_ = (i_1435_ & 0xff00ff) * i_1524_ & ~0xff00ff;
					int i_1526_ = (i_1435_ & 0xff00) * i_1524_ & 0xff0000;
					i_1435_ = (i_1525_ | i_1526_) >>> 8;
					int i_1527_ = i_1439_;
					for (int i_1528_ = -i_1433_; i_1528_ < 0; i_1528_++) {
						int i_1529_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1530_ = -i_1432_; i_1530_ < 0; i_1530_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								int i_1531_ = (anIntArray11347[(i_1439_ >> 16) + i_1529_]);
								if (i_1531_ != 0) {
									if (bool) {
										i_1525_ = ((i_1531_ & 0xff00ff) * i_1523_ & ~0xff00ff);
										i_1526_ = ((i_1531_ & 0xff00) * i_1523_ & 0xff0000);
										is[i_1447_] = ((i_1525_ | i_1526_) >>> 8) + i_1435_;
									}
									if (bool_1429_ && bool_1438_)
										fs[i_1447_] = f;
								}
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1527_;
						i_1447_ += i_1448_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1436_ == 2) {
				if (i_1434_ == 1) {
					int i_1532_ = i_1439_;
					for (int i_1533_ = -i_1433_; i_1533_ < 0; i_1533_++) {
						int i_1534_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1535_ = -i_1432_; i_1535_ < 0; i_1535_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								int i_1536_ = (anIntArray11347[(i_1439_ >> 16) + i_1534_]);
								if (i_1536_ != 0) {
									if (bool) {
										int i_1537_ = is[i_1447_];
										int i_1538_ = i_1536_ + i_1537_;
										int i_1539_ = ((i_1536_ & 0xff00ff) + (i_1537_ & 0xff00ff));
										i_1537_ = ((i_1539_ & 0x1000100) + (i_1538_ - i_1539_ & 0x10000));
										is[i_1447_] = (i_1538_ - i_1537_ | i_1537_ - (i_1537_ >>> 8));
									}
									if (bool_1429_ && bool_1438_)
										fs[i_1447_] = f;
								}
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1532_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 0) {
					int i_1540_ = i_1439_;
					int i_1541_ = (i_1435_ & 0xff0000) >> 16;
					int i_1542_ = (i_1435_ & 0xff00) >> 8;
					int i_1543_ = i_1435_ & 0xff;
					for (int i_1544_ = -i_1433_; i_1544_ < 0; i_1544_++) {
						int i_1545_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1546_ = -i_1432_; i_1546_ < 0; i_1546_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								int i_1547_ = (anIntArray11347[(i_1439_ >> 16) + i_1545_]);
								if (i_1547_ != 0) {
									if (bool) {
										int i_1548_ = ((i_1547_ & 0xff0000) * i_1541_ & ~0xffffff);
										int i_1549_ = ((i_1547_ & 0xff00) * i_1542_ & 0xff0000);
										int i_1550_ = ((i_1547_ & 0xff) * i_1543_ & 0xff00);
										i_1547_ = (i_1548_ | i_1549_ | i_1550_) >>> 8;
										int i_1551_ = is[i_1447_];
										int i_1552_ = i_1547_ + i_1551_;
										int i_1553_ = ((i_1547_ & 0xff00ff) + (i_1551_ & 0xff00ff));
										i_1551_ = ((i_1553_ & 0x1000100) + (i_1552_ - i_1553_ & 0x10000));
										is[i_1447_] = (i_1552_ - i_1551_ | i_1551_ - (i_1551_ >>> 8));
									}
									if (bool_1429_ && bool_1438_)
										fs[i_1447_] = f;
								}
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1540_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 3) {
					int i_1554_ = i_1439_;
					for (int i_1555_ = -i_1433_; i_1555_ < 0; i_1555_++) {
						int i_1556_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1557_ = -i_1432_; i_1557_ < 0; i_1557_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								if (bool) {
									int i_1558_ = (anIntArray11347[(i_1439_ >> 16) + i_1556_]);
									int i_1559_ = i_1558_ + i_1435_;
									int i_1560_ = ((i_1558_ & 0xff00ff) + (i_1435_ & 0xff00ff));
									int i_1561_ = ((i_1560_ & 0x1000100) + (i_1559_ - i_1560_ & 0x10000));
									i_1558_ = (i_1559_ - i_1561_ | i_1561_ - (i_1561_ >>> 8));
									i_1561_ = is[i_1447_];
									i_1559_ = i_1558_ + i_1561_;
									i_1560_ = (i_1558_ & 0xff00ff) + (i_1561_ & 0xff00ff);
									i_1561_ = ((i_1560_ & 0x1000100) + (i_1559_ - i_1560_ & 0x10000));
									is[i_1447_] = (i_1559_ - i_1561_ | i_1561_ - (i_1561_ >>> 8));
								}
								if (bool_1429_ && bool_1438_)
									fs[i_1447_] = f;
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1554_;
						i_1447_ += i_1448_;
					}
				} else if (i_1434_ == 2) {
					int i_1562_ = i_1435_ >>> 24;
					int i_1563_ = 256 - i_1562_;
					int i_1564_ = (i_1435_ & 0xff00ff) * i_1563_ & ~0xff00ff;
					int i_1565_ = (i_1435_ & 0xff00) * i_1563_ & 0xff0000;
					i_1435_ = (i_1564_ | i_1565_) >>> 8;
					int i_1566_ = i_1439_;
					for (int i_1567_ = -i_1433_; i_1567_ < 0; i_1567_++) {
						int i_1568_ = (i_1440_ >> 16) * anInt8914;
						for (int i_1569_ = -i_1432_; i_1569_ < 0; i_1569_++) {
							if (!bool_1429_ || f < fs[i_1447_]) {
								int i_1570_ = (anIntArray11347[(i_1439_ >> 16) + i_1568_]);
								if (i_1570_ != 0) {
									if (bool) {
										i_1564_ = ((i_1570_ & 0xff00ff) * i_1562_ & ~0xff00ff);
										i_1565_ = ((i_1570_ & 0xff00) * i_1562_ & 0xff0000);
										i_1570_ = (((i_1564_ | i_1565_) >>> 8) + i_1435_);
										int i_1571_ = is[i_1447_];
										int i_1572_ = i_1570_ + i_1571_;
										int i_1573_ = ((i_1570_ & 0xff00ff) + (i_1571_ & 0xff00ff));
										i_1571_ = ((i_1573_ & 0x1000100) + (i_1572_ - i_1573_ & 0x10000));
										is[i_1447_] = (i_1572_ - i_1571_ | i_1571_ - (i_1571_ >>> 8));
									}
									if (bool_1429_ && bool_1438_)
										fs[i_1447_] = f;
								}
							}
							i_1439_ += i_1443_;
							i_1447_++;
						}
						i_1440_ += i_1444_;
						i_1439_ = i_1566_;
						i_1447_ += i_1448_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method14406(int i, int i_1574_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_1575_ = anInt8928;
					while (i_1575_ < 0) {
						int i_1576_ = anInt8930;
						int i_1577_ = anInt8937;
						int i_1578_ = anInt8936;
						int i_1579_ = anInt8926;
						if (i_1577_ >= 0 && i_1578_ >= 0 && i_1577_ - (anInt8914 << 12) < 0 && i_1578_ - (anInt8916 << 12) < 0) {
							for (/**/; i_1579_ < 0; i_1579_++)
								method17755(((i_1578_ >> 12) * anInt8914 + (i_1577_ >> 12)), i_1576_++, is, i, i_1574_);
						}
						i_1575_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_1580_ = anInt8928;
					while (i_1580_ < 0) {
						int i_1581_ = anInt8930;
						int i_1582_ = anInt8937;
						int i_1583_ = anInt8936 + anInt8925;
						int i_1584_ = anInt8926;
						if (i_1582_ >= 0 && i_1582_ - (anInt8914 << 12) < 0) {
							int i_1585_;
							if ((i_1585_ = i_1583_ - (anInt8916 << 12)) >= 0) {
								i_1585_ = (anInt8938 - i_1585_) / anInt8938;
								i_1584_ += i_1585_;
								i_1583_ += anInt8938 * i_1585_;
								i_1581_ += i_1585_;
							}
							if ((i_1585_ = (i_1583_ - anInt8938) / anInt8938) > i_1584_)
								i_1584_ = i_1585_;
							for (/**/; i_1584_ < 0; i_1584_++) {
								method17755(((i_1583_ >> 12) * anInt8914 + (i_1582_ >> 12)), i_1581_++, is, i, i_1574_);
								i_1583_ += anInt8938;
							}
						}
						i_1580_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_1586_ = anInt8928;
					while (i_1586_ < 0) {
						int i_1587_ = anInt8930;
						int i_1588_ = anInt8937;
						int i_1589_ = anInt8936 + anInt8925;
						int i_1590_ = anInt8926;
						if (i_1588_ >= 0 && i_1588_ - (anInt8914 << 12) < 0) {
							if (i_1589_ < 0) {
								int i_1591_ = (anInt8938 - 1 - i_1589_) / anInt8938;
								i_1590_ += i_1591_;
								i_1589_ += anInt8938 * i_1591_;
								i_1587_ += i_1591_;
							}
							int i_1592_;
							if ((i_1592_ = (1 + i_1589_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1590_)
								i_1590_ = i_1592_;
							for (/**/; i_1590_ < 0; i_1590_++) {
								method17755(((i_1589_ >> 12) * anInt8914 + (i_1588_ >> 12)), i_1587_++, is, i, i_1574_);
								i_1589_ += anInt8938;
							}
						}
						i_1586_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_1593_ = anInt8928;
					while (i_1593_ < 0) {
						int i_1594_ = anInt8930;
						int i_1595_ = anInt8937 + anInt8939;
						int i_1596_ = anInt8936;
						int i_1597_ = anInt8926;
						if (i_1596_ >= 0 && i_1596_ - (anInt8916 << 12) < 0) {
							int i_1598_;
							if ((i_1598_ = i_1595_ - (anInt8914 << 12)) >= 0) {
								i_1598_ = (anInt8940 - i_1598_) / anInt8940;
								i_1597_ += i_1598_;
								i_1595_ += anInt8940 * i_1598_;
								i_1594_ += i_1598_;
							}
							if ((i_1598_ = (i_1595_ - anInt8940) / anInt8940) > i_1597_)
								i_1597_ = i_1598_;
							for (/**/; i_1597_ < 0; i_1597_++) {
								method17755(((i_1596_ >> 12) * anInt8914 + (i_1595_ >> 12)), i_1594_++, is, i, i_1574_);
								i_1595_ += anInt8940;
							}
						}
						i_1593_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_1599_ = anInt8928;
					while (i_1599_ < 0) {
						int i_1600_ = anInt8930;
						int i_1601_ = anInt8937 + anInt8939;
						int i_1602_ = anInt8936 + anInt8925;
						int i_1603_ = anInt8926;
						int i_1604_;
						if ((i_1604_ = i_1601_ - (anInt8914 << 12)) >= 0) {
							i_1604_ = (anInt8940 - i_1604_) / anInt8940;
							i_1603_ += i_1604_;
							i_1601_ += anInt8940 * i_1604_;
							i_1602_ += anInt8938 * i_1604_;
							i_1600_ += i_1604_;
						}
						if ((i_1604_ = (i_1601_ - anInt8940) / anInt8940) > i_1603_)
							i_1603_ = i_1604_;
						if ((i_1604_ = i_1602_ - (anInt8916 << 12)) >= 0) {
							i_1604_ = (anInt8938 - i_1604_) / anInt8938;
							i_1603_ += i_1604_;
							i_1601_ += anInt8940 * i_1604_;
							i_1602_ += anInt8938 * i_1604_;
							i_1600_ += i_1604_;
						}
						if ((i_1604_ = (i_1602_ - anInt8938) / anInt8938) > i_1603_)
							i_1603_ = i_1604_;
						for (/**/; i_1603_ < 0; i_1603_++) {
							method17755((i_1602_ >> 12) * anInt8914 + (i_1601_ >> 12), i_1600_++, is, i, i_1574_);
							i_1601_ += anInt8940;
							i_1602_ += anInt8938;
						}
						i_1599_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_1605_ = anInt8928;
					while (i_1605_ < 0) {
						int i_1606_ = anInt8930;
						int i_1607_ = anInt8937 + anInt8939;
						int i_1608_ = anInt8936 + anInt8925;
						int i_1609_ = anInt8926;
						int i_1610_;
						if ((i_1610_ = i_1607_ - (anInt8914 << 12)) >= 0) {
							i_1610_ = (anInt8940 - i_1610_) / anInt8940;
							i_1609_ += i_1610_;
							i_1607_ += anInt8940 * i_1610_;
							i_1608_ += anInt8938 * i_1610_;
							i_1606_ += i_1610_;
						}
						if ((i_1610_ = (i_1607_ - anInt8940) / anInt8940) > i_1609_)
							i_1609_ = i_1610_;
						if (i_1608_ < 0) {
							i_1610_ = (anInt8938 - 1 - i_1608_) / anInt8938;
							i_1609_ += i_1610_;
							i_1607_ += anInt8940 * i_1610_;
							i_1608_ += anInt8938 * i_1610_;
							i_1606_ += i_1610_;
						}
						if ((i_1610_ = (1 + i_1608_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1609_)
							i_1609_ = i_1610_;
						for (/**/; i_1609_ < 0; i_1609_++) {
							method17755((i_1608_ >> 12) * anInt8914 + (i_1607_ >> 12), i_1606_++, is, i, i_1574_);
							i_1607_ += anInt8940;
							i_1608_ += anInt8938;
						}
						i_1605_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_1611_ = anInt8928;
				while (i_1611_ < 0) {
					int i_1612_ = anInt8930;
					int i_1613_ = anInt8937 + anInt8939;
					int i_1614_ = anInt8936;
					int i_1615_ = anInt8926;
					if (i_1614_ >= 0 && i_1614_ - (anInt8916 << 12) < 0) {
						if (i_1613_ < 0) {
							int i_1616_ = (anInt8940 - 1 - i_1613_) / anInt8940;
							i_1615_ += i_1616_;
							i_1613_ += anInt8940 * i_1616_;
							i_1612_ += i_1616_;
						}
						int i_1617_;
						if ((i_1617_ = (1 + i_1613_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1615_)
							i_1615_ = i_1617_;
						for (/**/; i_1615_ < 0; i_1615_++) {
							method17755((i_1614_ >> 12) * anInt8914 + (i_1613_ >> 12), i_1612_++, is, i, i_1574_);
							i_1613_ += anInt8940;
						}
					}
					i_1611_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				for (int i_1618_ = anInt8928; i_1618_ < 0; i_1618_++) {
					int i_1619_ = anInt8930;
					int i_1620_ = anInt8937 + anInt8939;
					int i_1621_ = anInt8936 + anInt8925;
					int i_1622_ = anInt8926;
					if (i_1620_ < 0) {
						int i_1623_ = (anInt8940 - 1 - i_1620_) / anInt8940;
						i_1622_ += i_1623_;
						i_1620_ += anInt8940 * i_1623_;
						i_1621_ += anInt8938 * i_1623_;
						i_1619_ += i_1623_;
					}
					int i_1624_;
					if ((i_1624_ = (1 + i_1620_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1622_)
						i_1622_ = i_1624_;
					if ((i_1624_ = i_1621_ - (anInt8916 << 12)) >= 0) {
						i_1624_ = (anInt8938 - i_1624_) / anInt8938;
						i_1622_ += i_1624_;
						i_1620_ += anInt8940 * i_1624_;
						i_1621_ += anInt8938 * i_1624_;
						i_1619_ += i_1624_;
					}
					if ((i_1624_ = (i_1621_ - anInt8938) / anInt8938) > i_1622_)
						i_1622_ = i_1624_;
					for (/**/; i_1622_ < 0; i_1622_++) {
						method17755((i_1621_ >> 12) * anInt8914 + (i_1620_ >> 12), i_1619_++, is, i, i_1574_);
						i_1620_ += anInt8940;
						i_1621_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				for (int i_1625_ = anInt8928; i_1625_ < 0; i_1625_++) {
					int i_1626_ = anInt8930;
					int i_1627_ = anInt8937 + anInt8939;
					int i_1628_ = anInt8936 + anInt8925;
					int i_1629_ = anInt8926;
					if (i_1627_ < 0) {
						int i_1630_ = (anInt8940 - 1 - i_1627_) / anInt8940;
						i_1629_ += i_1630_;
						i_1627_ += anInt8940 * i_1630_;
						i_1628_ += anInt8938 * i_1630_;
						i_1626_ += i_1630_;
					}
					int i_1631_;
					if ((i_1631_ = (1 + i_1627_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1629_)
						i_1629_ = i_1631_;
					if (i_1628_ < 0) {
						i_1631_ = (anInt8938 - 1 - i_1628_) / anInt8938;
						i_1629_ += i_1631_;
						i_1627_ += anInt8940 * i_1631_;
						i_1628_ += anInt8938 * i_1631_;
						i_1626_ += i_1631_;
					}
					if ((i_1631_ = (1 + i_1628_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1629_)
						i_1629_ = i_1631_;
					for (/**/; i_1629_ < 0; i_1629_++) {
						method17755((i_1628_ >> 12) * anInt8914 + (i_1627_ >> 12), i_1626_++, is, i, i_1574_);
						i_1627_ += anInt8940;
						i_1628_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	void method14407(int i, int i_1632_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is != null) {
			if (anInt8940 == 0) {
				if (anInt8938 == 0) {
					int i_1633_ = anInt8928;
					while (i_1633_ < 0) {
						int i_1634_ = anInt8930;
						int i_1635_ = anInt8937;
						int i_1636_ = anInt8936;
						int i_1637_ = anInt8926;
						if (i_1635_ >= 0 && i_1636_ >= 0 && i_1635_ - (anInt8914 << 12) < 0 && i_1636_ - (anInt8916 << 12) < 0) {
							for (/**/; i_1637_ < 0; i_1637_++)
								method17755(((i_1636_ >> 12) * anInt8914 + (i_1635_ >> 12)), i_1634_++, is, i, i_1632_);
						}
						i_1633_++;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_1638_ = anInt8928;
					while (i_1638_ < 0) {
						int i_1639_ = anInt8930;
						int i_1640_ = anInt8937;
						int i_1641_ = anInt8936 + anInt8925;
						int i_1642_ = anInt8926;
						if (i_1640_ >= 0 && i_1640_ - (anInt8914 << 12) < 0) {
							int i_1643_;
							if ((i_1643_ = i_1641_ - (anInt8916 << 12)) >= 0) {
								i_1643_ = (anInt8938 - i_1643_) / anInt8938;
								i_1642_ += i_1643_;
								i_1641_ += anInt8938 * i_1643_;
								i_1639_ += i_1643_;
							}
							if ((i_1643_ = (i_1641_ - anInt8938) / anInt8938) > i_1642_)
								i_1642_ = i_1643_;
							for (/**/; i_1642_ < 0; i_1642_++) {
								method17755(((i_1641_ >> 12) * anInt8914 + (i_1640_ >> 12)), i_1639_++, is, i, i_1632_);
								i_1641_ += anInt8938;
							}
						}
						i_1638_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				} else {
					int i_1644_ = anInt8928;
					while (i_1644_ < 0) {
						int i_1645_ = anInt8930;
						int i_1646_ = anInt8937;
						int i_1647_ = anInt8936 + anInt8925;
						int i_1648_ = anInt8926;
						if (i_1646_ >= 0 && i_1646_ - (anInt8914 << 12) < 0) {
							if (i_1647_ < 0) {
								int i_1649_ = (anInt8938 - 1 - i_1647_) / anInt8938;
								i_1648_ += i_1649_;
								i_1647_ += anInt8938 * i_1649_;
								i_1645_ += i_1649_;
							}
							int i_1650_;
							if ((i_1650_ = (1 + i_1647_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1648_)
								i_1648_ = i_1650_;
							for (/**/; i_1648_ < 0; i_1648_++) {
								method17755(((i_1647_ >> 12) * anInt8914 + (i_1646_ >> 12)), i_1645_++, is, i, i_1632_);
								i_1647_ += anInt8938;
							}
						}
						i_1644_++;
						anInt8937 += anInt8933;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8940 < 0) {
				if (anInt8938 == 0) {
					int i_1651_ = anInt8928;
					while (i_1651_ < 0) {
						int i_1652_ = anInt8930;
						int i_1653_ = anInt8937 + anInt8939;
						int i_1654_ = anInt8936;
						int i_1655_ = anInt8926;
						if (i_1654_ >= 0 && i_1654_ - (anInt8916 << 12) < 0) {
							int i_1656_;
							if ((i_1656_ = i_1653_ - (anInt8914 << 12)) >= 0) {
								i_1656_ = (anInt8940 - i_1656_) / anInt8940;
								i_1655_ += i_1656_;
								i_1653_ += anInt8940 * i_1656_;
								i_1652_ += i_1656_;
							}
							if ((i_1656_ = (i_1653_ - anInt8940) / anInt8940) > i_1655_)
								i_1655_ = i_1656_;
							for (/**/; i_1655_ < 0; i_1655_++) {
								method17755(((i_1654_ >> 12) * anInt8914 + (i_1653_ >> 12)), i_1652_++, is, i, i_1632_);
								i_1653_ += anInt8940;
							}
						}
						i_1651_++;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else if (anInt8938 < 0) {
					int i_1657_ = anInt8928;
					while (i_1657_ < 0) {
						int i_1658_ = anInt8930;
						int i_1659_ = anInt8937 + anInt8939;
						int i_1660_ = anInt8936 + anInt8925;
						int i_1661_ = anInt8926;
						int i_1662_;
						if ((i_1662_ = i_1659_ - (anInt8914 << 12)) >= 0) {
							i_1662_ = (anInt8940 - i_1662_) / anInt8940;
							i_1661_ += i_1662_;
							i_1659_ += anInt8940 * i_1662_;
							i_1660_ += anInt8938 * i_1662_;
							i_1658_ += i_1662_;
						}
						if ((i_1662_ = (i_1659_ - anInt8940) / anInt8940) > i_1661_)
							i_1661_ = i_1662_;
						if ((i_1662_ = i_1660_ - (anInt8916 << 12)) >= 0) {
							i_1662_ = (anInt8938 - i_1662_) / anInt8938;
							i_1661_ += i_1662_;
							i_1659_ += anInt8940 * i_1662_;
							i_1660_ += anInt8938 * i_1662_;
							i_1658_ += i_1662_;
						}
						if ((i_1662_ = (i_1660_ - anInt8938) / anInt8938) > i_1661_)
							i_1661_ = i_1662_;
						for (/**/; i_1661_ < 0; i_1661_++) {
							method17755((i_1660_ >> 12) * anInt8914 + (i_1659_ >> 12), i_1658_++, is, i, i_1632_);
							i_1659_ += anInt8940;
							i_1660_ += anInt8938;
						}
						i_1657_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				} else {
					int i_1663_ = anInt8928;
					while (i_1663_ < 0) {
						int i_1664_ = anInt8930;
						int i_1665_ = anInt8937 + anInt8939;
						int i_1666_ = anInt8936 + anInt8925;
						int i_1667_ = anInt8926;
						int i_1668_;
						if ((i_1668_ = i_1665_ - (anInt8914 << 12)) >= 0) {
							i_1668_ = (anInt8940 - i_1668_) / anInt8940;
							i_1667_ += i_1668_;
							i_1665_ += anInt8940 * i_1668_;
							i_1666_ += anInt8938 * i_1668_;
							i_1664_ += i_1668_;
						}
						if ((i_1668_ = (i_1665_ - anInt8940) / anInt8940) > i_1667_)
							i_1667_ = i_1668_;
						if (i_1666_ < 0) {
							i_1668_ = (anInt8938 - 1 - i_1666_) / anInt8938;
							i_1667_ += i_1668_;
							i_1665_ += anInt8940 * i_1668_;
							i_1666_ += anInt8938 * i_1668_;
							i_1664_ += i_1668_;
						}
						if ((i_1668_ = (1 + i_1666_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1667_)
							i_1667_ = i_1668_;
						for (/**/; i_1667_ < 0; i_1667_++) {
							method17755((i_1666_ >> 12) * anInt8914 + (i_1665_ >> 12), i_1664_++, is, i, i_1632_);
							i_1665_ += anInt8940;
							i_1666_ += anInt8938;
						}
						i_1663_++;
						anInt8937 += anInt8933;
						anInt8936 += anInt8922;
						anInt8930 += anInt8929;
					}
				}
			} else if (anInt8938 == 0) {
				int i_1669_ = anInt8928;
				while (i_1669_ < 0) {
					int i_1670_ = anInt8930;
					int i_1671_ = anInt8937 + anInt8939;
					int i_1672_ = anInt8936;
					int i_1673_ = anInt8926;
					if (i_1672_ >= 0 && i_1672_ - (anInt8916 << 12) < 0) {
						if (i_1671_ < 0) {
							int i_1674_ = (anInt8940 - 1 - i_1671_) / anInt8940;
							i_1673_ += i_1674_;
							i_1671_ += anInt8940 * i_1674_;
							i_1670_ += i_1674_;
						}
						int i_1675_;
						if ((i_1675_ = (1 + i_1671_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1673_)
							i_1673_ = i_1675_;
						for (/**/; i_1673_ < 0; i_1673_++) {
							method17755((i_1672_ >> 12) * anInt8914 + (i_1671_ >> 12), i_1670_++, is, i, i_1632_);
							i_1671_ += anInt8940;
						}
					}
					i_1669_++;
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else if (anInt8938 < 0) {
				for (int i_1676_ = anInt8928; i_1676_ < 0; i_1676_++) {
					int i_1677_ = anInt8930;
					int i_1678_ = anInt8937 + anInt8939;
					int i_1679_ = anInt8936 + anInt8925;
					int i_1680_ = anInt8926;
					if (i_1678_ < 0) {
						int i_1681_ = (anInt8940 - 1 - i_1678_) / anInt8940;
						i_1680_ += i_1681_;
						i_1678_ += anInt8940 * i_1681_;
						i_1679_ += anInt8938 * i_1681_;
						i_1677_ += i_1681_;
					}
					int i_1682_;
					if ((i_1682_ = (1 + i_1678_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1680_)
						i_1680_ = i_1682_;
					if ((i_1682_ = i_1679_ - (anInt8916 << 12)) >= 0) {
						i_1682_ = (anInt8938 - i_1682_) / anInt8938;
						i_1680_ += i_1682_;
						i_1678_ += anInt8940 * i_1682_;
						i_1679_ += anInt8938 * i_1682_;
						i_1677_ += i_1682_;
					}
					if ((i_1682_ = (i_1679_ - anInt8938) / anInt8938) > i_1680_)
						i_1680_ = i_1682_;
					for (/**/; i_1680_ < 0; i_1680_++) {
						method17755((i_1679_ >> 12) * anInt8914 + (i_1678_ >> 12), i_1677_++, is, i, i_1632_);
						i_1678_ += anInt8940;
						i_1679_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			} else {
				for (int i_1683_ = anInt8928; i_1683_ < 0; i_1683_++) {
					int i_1684_ = anInt8930;
					int i_1685_ = anInt8937 + anInt8939;
					int i_1686_ = anInt8936 + anInt8925;
					int i_1687_ = anInt8926;
					if (i_1685_ < 0) {
						int i_1688_ = (anInt8940 - 1 - i_1685_) / anInt8940;
						i_1687_ += i_1688_;
						i_1685_ += anInt8940 * i_1688_;
						i_1686_ += anInt8938 * i_1688_;
						i_1684_ += i_1688_;
					}
					int i_1689_;
					if ((i_1689_ = (1 + i_1685_ - (anInt8914 << 12) - anInt8940) / anInt8940) > i_1687_)
						i_1687_ = i_1689_;
					if (i_1686_ < 0) {
						i_1689_ = (anInt8938 - 1 - i_1686_) / anInt8938;
						i_1687_ += i_1689_;
						i_1685_ += anInt8940 * i_1689_;
						i_1686_ += anInt8938 * i_1689_;
						i_1684_ += i_1689_;
					}
					if ((i_1689_ = (1 + i_1686_ - (anInt8916 << 12) - anInt8938) / anInt8938) > i_1687_)
						i_1687_ = i_1689_;
					for (/**/; i_1687_ < 0; i_1687_++) {
						method17755((i_1686_ >> 12) * anInt8914 + (i_1685_ >> 12), i_1684_++, is, i, i_1632_);
						i_1685_ += anInt8940;
						i_1686_ += anInt8938;
					}
					anInt8937 += anInt8933;
					anInt8936 += anInt8922;
					anInt8930 += anInt8929;
				}
			}
		}
	}

	public void method2481(int i, int i_1690_, int i_1691_, int i_1692_, int i_1693_, int i_1694_) {
		int[] is = aClass178_Sub3_8923.anIntArray9804;
		if (is == null)
			throw new IllegalStateException("");
		for (int i_1695_ = 0; i_1695_ < i_1692_; i_1695_++) {
			int i_1696_ = (i_1690_ + i_1695_) * anInt8914 + i;
			int i_1697_ = ((i_1694_ + i_1695_) * (aClass178_Sub3_8923.anInt9825 * 1013077751) + i_1693_);
			for (int i_1698_ = 0; i_1698_ < i_1691_; i_1698_++)
				anIntArray11347[i_1696_ + i_1698_] = is[i_1697_ + i_1698_];
		}
	}

	void method17758(int i, int i_1699_, int[] is, int i_1700_, int i_1701_) {
		if (i_1701_ == 0) {
			if (i_1700_ == 1)
				is[i_1699_] = anIntArray11347[i];
			else if (i_1700_ == 0) {
				int i_1702_ = anIntArray11347[i++];
				int i_1703_ = (i_1702_ & 0xff0000) * anInt8944 & ~0xffffff;
				int i_1704_ = (i_1702_ & 0xff00) * anInt8945 & 0xff0000;
				int i_1705_ = (i_1702_ & 0xff) * anInt8946 & 0xff00;
				is[i_1699_] = (i_1703_ | i_1704_ | i_1705_) >>> 8;
			} else if (i_1700_ == 3) {
				int i_1706_ = anIntArray11347[i++];
				int i_1707_ = anInt8941;
				int i_1708_ = i_1706_ + i_1707_;
				int i_1709_ = (i_1706_ & 0xff00ff) + (i_1707_ & 0xff00ff);
				int i_1710_ = (i_1709_ & 0x1000100) + (i_1708_ - i_1709_ & 0x10000);
				is[i_1699_] = i_1708_ - i_1710_ | i_1710_ - (i_1710_ >>> 8);
			} else if (i_1700_ == 2) {
				int i_1711_ = anIntArray11347[i];
				int i_1712_ = (i_1711_ & 0xff00ff) * anInt8942 & ~0xff00ff;
				int i_1713_ = (i_1711_ & 0xff00) * anInt8942 & 0xff0000;
				is[i_1699_] = ((i_1712_ | i_1713_) >>> 8) + anInt8949;
			} else
				throw new IllegalArgumentException();
		} else if (i_1701_ == 1) {
			if (i_1700_ == 1) {
				int i_1714_ = anIntArray11347[i];
				if (i_1714_ != 0)
					is[i_1699_] = i_1714_;
			} else if (i_1700_ == 0) {
				int i_1715_ = anIntArray11347[i];
				if (i_1715_ != 0) {
					if ((anInt8941 & 0xffffff) == 16777215) {
						int i_1716_ = anInt8941 >>> 24;
						int i_1717_ = 256 - i_1716_;
						int i_1718_ = is[i_1699_];
						is[i_1699_] = ((((i_1715_ & 0xff00ff) * i_1716_ + (i_1718_ & 0xff00ff) * i_1717_) & ~0xff00ff) + (((i_1715_ & 0xff00) * i_1716_ + (i_1718_ & 0xff00) * i_1717_) & 0xff0000)) >> 8;
					} else if (anInt8942 != 255) {
						int i_1719_ = (i_1715_ & 0xff0000) * anInt8944 & ~0xffffff;
						int i_1720_ = (i_1715_ & 0xff00) * anInt8945 & 0xff0000;
						int i_1721_ = (i_1715_ & 0xff) * anInt8946 & 0xff00;
						i_1715_ = (i_1719_ | i_1720_ | i_1721_) >>> 8;
						int i_1722_ = is[i_1699_];
						is[i_1699_] = ((((i_1715_ & 0xff00ff) * anInt8942 + (i_1722_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_1715_ & 0xff00) * anInt8942 + (i_1722_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
					} else {
						int i_1723_ = (i_1715_ & 0xff0000) * anInt8944 & ~0xffffff;
						int i_1724_ = (i_1715_ & 0xff00) * anInt8945 & 0xff0000;
						int i_1725_ = (i_1715_ & 0xff) * anInt8946 & 0xff00;
						is[i_1699_] = (i_1723_ | i_1724_ | i_1725_) >>> 8;
					}
				}
			} else if (i_1700_ == 3) {
				int i_1726_ = anIntArray11347[i];
				int i_1727_ = anInt8941;
				int i_1728_ = i_1726_ + i_1727_;
				int i_1729_ = (i_1726_ & 0xff00ff) + (i_1727_ & 0xff00ff);
				int i_1730_ = (i_1729_ & 0x1000100) + (i_1728_ - i_1729_ & 0x10000);
				i_1730_ = i_1728_ - i_1730_ | i_1730_ - (i_1730_ >>> 8);
				if (i_1726_ == 0 && anInt8942 != 255) {
					i_1726_ = i_1730_;
					i_1730_ = is[i_1699_];
					i_1730_ = ((((i_1726_ & 0xff00ff) * anInt8942 + (i_1730_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_1726_ & 0xff00) * anInt8942 + (i_1730_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
				}
				is[i_1699_] = i_1730_;
			} else if (i_1700_ == 2) {
				int i_1731_ = anIntArray11347[i];
				if (i_1731_ != 0) {
					int i_1732_ = (i_1731_ & 0xff00ff) * anInt8942 & ~0xff00ff;
					int i_1733_ = (i_1731_ & 0xff00) * anInt8942 & 0xff0000;
					is[i_1699_++] = ((i_1732_ | i_1733_) >>> 8) + anInt8949;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_1701_ == 2) {
			if (i_1700_ == 1) {
				int i_1734_ = anIntArray11347[i];
				if (i_1734_ != 0) {
					int i_1735_ = is[i_1699_];
					int i_1736_ = i_1734_ + i_1735_;
					int i_1737_ = (i_1734_ & 0xff00ff) + (i_1735_ & 0xff00ff);
					i_1735_ = (i_1737_ & 0x1000100) + (i_1736_ - i_1737_ & 0x10000);
					is[i_1699_] = i_1736_ - i_1735_ | i_1735_ - (i_1735_ >>> 8);
				}
			} else if (i_1700_ == 0) {
				int i_1738_ = anIntArray11347[i];
				if (i_1738_ != 0) {
					int i_1739_ = (i_1738_ & 0xff0000) * anInt8944 & ~0xffffff;
					int i_1740_ = (i_1738_ & 0xff00) * anInt8945 & 0xff0000;
					int i_1741_ = (i_1738_ & 0xff) * anInt8946 & 0xff00;
					i_1738_ = (i_1739_ | i_1740_ | i_1741_) >>> 8;
					int i_1742_ = is[i_1699_];
					int i_1743_ = i_1738_ + i_1742_;
					int i_1744_ = (i_1738_ & 0xff00ff) + (i_1742_ & 0xff00ff);
					i_1742_ = (i_1744_ & 0x1000100) + (i_1743_ - i_1744_ & 0x10000);
					is[i_1699_] = i_1743_ - i_1742_ | i_1742_ - (i_1742_ >>> 8);
				}
			} else if (i_1700_ == 3) {
				int i_1745_ = anIntArray11347[i];
				int i_1746_ = anInt8941;
				int i_1747_ = i_1745_ + i_1746_;
				int i_1748_ = (i_1745_ & 0xff00ff) + (i_1746_ & 0xff00ff);
				int i_1749_ = (i_1748_ & 0x1000100) + (i_1747_ - i_1748_ & 0x10000);
				i_1745_ = i_1747_ - i_1749_ | i_1749_ - (i_1749_ >>> 8);
				i_1749_ = is[i_1699_];
				i_1747_ = i_1745_ + i_1749_;
				i_1748_ = (i_1745_ & 0xff00ff) + (i_1749_ & 0xff00ff);
				i_1749_ = (i_1748_ & 0x1000100) + (i_1747_ - i_1748_ & 0x10000);
				is[i_1699_] = i_1747_ - i_1749_ | i_1749_ - (i_1749_ >>> 8);
			} else if (i_1700_ == 2) {
				int i_1750_ = anIntArray11347[i];
				if (i_1750_ != 0) {
					int i_1751_ = (i_1750_ & 0xff00ff) * anInt8942 & ~0xff00ff;
					int i_1752_ = (i_1750_ & 0xff00) * anInt8942 & 0xff0000;
					i_1750_ = ((i_1751_ | i_1752_) >>> 8) + anInt8949;
					int i_1753_ = is[i_1699_];
					int i_1754_ = i_1750_ + i_1753_;
					int i_1755_ = (i_1750_ & 0xff00ff) + (i_1753_ & 0xff00ff);
					i_1753_ = (i_1755_ & 0x1000100) + (i_1754_ - i_1755_ & 0x10000);
					is[i_1699_] = i_1754_ - i_1753_ | i_1753_ - (i_1753_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	void method17759(int i, int i_1756_, int[] is, int i_1757_, int i_1758_) {
		if (i_1758_ == 0) {
			if (i_1757_ == 1)
				is[i_1756_] = anIntArray11347[i];
			else if (i_1757_ == 0) {
				int i_1759_ = anIntArray11347[i++];
				int i_1760_ = (i_1759_ & 0xff0000) * anInt8944 & ~0xffffff;
				int i_1761_ = (i_1759_ & 0xff00) * anInt8945 & 0xff0000;
				int i_1762_ = (i_1759_ & 0xff) * anInt8946 & 0xff00;
				is[i_1756_] = (i_1760_ | i_1761_ | i_1762_) >>> 8;
			} else if (i_1757_ == 3) {
				int i_1763_ = anIntArray11347[i++];
				int i_1764_ = anInt8941;
				int i_1765_ = i_1763_ + i_1764_;
				int i_1766_ = (i_1763_ & 0xff00ff) + (i_1764_ & 0xff00ff);
				int i_1767_ = (i_1766_ & 0x1000100) + (i_1765_ - i_1766_ & 0x10000);
				is[i_1756_] = i_1765_ - i_1767_ | i_1767_ - (i_1767_ >>> 8);
			} else if (i_1757_ == 2) {
				int i_1768_ = anIntArray11347[i];
				int i_1769_ = (i_1768_ & 0xff00ff) * anInt8942 & ~0xff00ff;
				int i_1770_ = (i_1768_ & 0xff00) * anInt8942 & 0xff0000;
				is[i_1756_] = ((i_1769_ | i_1770_) >>> 8) + anInt8949;
			} else
				throw new IllegalArgumentException();
		} else if (i_1758_ == 1) {
			if (i_1757_ == 1) {
				int i_1771_ = anIntArray11347[i];
				if (i_1771_ != 0)
					is[i_1756_] = i_1771_;
			} else if (i_1757_ == 0) {
				int i_1772_ = anIntArray11347[i];
				if (i_1772_ != 0) {
					if ((anInt8941 & 0xffffff) == 16777215) {
						int i_1773_ = anInt8941 >>> 24;
						int i_1774_ = 256 - i_1773_;
						int i_1775_ = is[i_1756_];
						is[i_1756_] = ((((i_1772_ & 0xff00ff) * i_1773_ + (i_1775_ & 0xff00ff) * i_1774_) & ~0xff00ff) + (((i_1772_ & 0xff00) * i_1773_ + (i_1775_ & 0xff00) * i_1774_) & 0xff0000)) >> 8;
					} else if (anInt8942 != 255) {
						int i_1776_ = (i_1772_ & 0xff0000) * anInt8944 & ~0xffffff;
						int i_1777_ = (i_1772_ & 0xff00) * anInt8945 & 0xff0000;
						int i_1778_ = (i_1772_ & 0xff) * anInt8946 & 0xff00;
						i_1772_ = (i_1776_ | i_1777_ | i_1778_) >>> 8;
						int i_1779_ = is[i_1756_];
						is[i_1756_] = ((((i_1772_ & 0xff00ff) * anInt8942 + (i_1779_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_1772_ & 0xff00) * anInt8942 + (i_1779_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
					} else {
						int i_1780_ = (i_1772_ & 0xff0000) * anInt8944 & ~0xffffff;
						int i_1781_ = (i_1772_ & 0xff00) * anInt8945 & 0xff0000;
						int i_1782_ = (i_1772_ & 0xff) * anInt8946 & 0xff00;
						is[i_1756_] = (i_1780_ | i_1781_ | i_1782_) >>> 8;
					}
				}
			} else if (i_1757_ == 3) {
				int i_1783_ = anIntArray11347[i];
				int i_1784_ = anInt8941;
				int i_1785_ = i_1783_ + i_1784_;
				int i_1786_ = (i_1783_ & 0xff00ff) + (i_1784_ & 0xff00ff);
				int i_1787_ = (i_1786_ & 0x1000100) + (i_1785_ - i_1786_ & 0x10000);
				i_1787_ = i_1785_ - i_1787_ | i_1787_ - (i_1787_ >>> 8);
				if (i_1783_ == 0 && anInt8942 != 255) {
					i_1783_ = i_1787_;
					i_1787_ = is[i_1756_];
					i_1787_ = ((((i_1783_ & 0xff00ff) * anInt8942 + (i_1787_ & 0xff00ff) * anInt8943) & ~0xff00ff) + (((i_1783_ & 0xff00) * anInt8942 + (i_1787_ & 0xff00) * anInt8943) & 0xff0000)) >> 8;
				}
				is[i_1756_] = i_1787_;
			} else if (i_1757_ == 2) {
				int i_1788_ = anIntArray11347[i];
				if (i_1788_ != 0) {
					int i_1789_ = (i_1788_ & 0xff00ff) * anInt8942 & ~0xff00ff;
					int i_1790_ = (i_1788_ & 0xff00) * anInt8942 & 0xff0000;
					is[i_1756_++] = ((i_1789_ | i_1790_) >>> 8) + anInt8949;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_1758_ == 2) {
			if (i_1757_ == 1) {
				int i_1791_ = anIntArray11347[i];
				if (i_1791_ != 0) {
					int i_1792_ = is[i_1756_];
					int i_1793_ = i_1791_ + i_1792_;
					int i_1794_ = (i_1791_ & 0xff00ff) + (i_1792_ & 0xff00ff);
					i_1792_ = (i_1794_ & 0x1000100) + (i_1793_ - i_1794_ & 0x10000);
					is[i_1756_] = i_1793_ - i_1792_ | i_1792_ - (i_1792_ >>> 8);
				}
			} else if (i_1757_ == 0) {
				int i_1795_ = anIntArray11347[i];
				if (i_1795_ != 0) {
					int i_1796_ = (i_1795_ & 0xff0000) * anInt8944 & ~0xffffff;
					int i_1797_ = (i_1795_ & 0xff00) * anInt8945 & 0xff0000;
					int i_1798_ = (i_1795_ & 0xff) * anInt8946 & 0xff00;
					i_1795_ = (i_1796_ | i_1797_ | i_1798_) >>> 8;
					int i_1799_ = is[i_1756_];
					int i_1800_ = i_1795_ + i_1799_;
					int i_1801_ = (i_1795_ & 0xff00ff) + (i_1799_ & 0xff00ff);
					i_1799_ = (i_1801_ & 0x1000100) + (i_1800_ - i_1801_ & 0x10000);
					is[i_1756_] = i_1800_ - i_1799_ | i_1799_ - (i_1799_ >>> 8);
				}
			} else if (i_1757_ == 3) {
				int i_1802_ = anIntArray11347[i];
				int i_1803_ = anInt8941;
				int i_1804_ = i_1802_ + i_1803_;
				int i_1805_ = (i_1802_ & 0xff00ff) + (i_1803_ & 0xff00ff);
				int i_1806_ = (i_1805_ & 0x1000100) + (i_1804_ - i_1805_ & 0x10000);
				i_1802_ = i_1804_ - i_1806_ | i_1806_ - (i_1806_ >>> 8);
				i_1806_ = is[i_1756_];
				i_1804_ = i_1802_ + i_1806_;
				i_1805_ = (i_1802_ & 0xff00ff) + (i_1806_ & 0xff00ff);
				i_1806_ = (i_1805_ & 0x1000100) + (i_1804_ - i_1805_ & 0x10000);
				is[i_1756_] = i_1804_ - i_1806_ | i_1806_ - (i_1806_ >>> 8);
			} else if (i_1757_ == 2) {
				int i_1807_ = anIntArray11347[i];
				if (i_1807_ != 0) {
					int i_1808_ = (i_1807_ & 0xff00ff) * anInt8942 & ~0xff00ff;
					int i_1809_ = (i_1807_ & 0xff00) * anInt8942 & 0xff0000;
					i_1807_ = ((i_1808_ | i_1809_) >>> 8) + anInt8949;
					int i_1810_ = is[i_1756_];
					int i_1811_ = i_1807_ + i_1810_;
					int i_1812_ = (i_1807_ & 0xff00ff) + (i_1810_ & 0xff00ff);
					i_1810_ = (i_1812_ & 0x1000100) + (i_1811_ - i_1812_ & 0x10000);
					is[i_1756_] = i_1811_ - i_1810_ | i_1810_ - (i_1810_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	void method2461(int i, int i_1813_, int i_1814_, int i_1815_, int i_1816_, int i_1817_, int i_1818_, int i_1819_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (i_1814_ > 0 && i_1815_ > 0) {
			int[] is = aClass178_Sub3_8923.anIntArray9804;
			if (is != null) {
				int i_1820_ = 0;
				int i_1821_ = 0;
				int i_1822_ = aClass178_Sub3_8923.anInt9825 * 1013077751;
				int i_1823_ = anInt8921 + anInt8914 + anInt8919;
				int i_1824_ = anInt8918 + anInt8916 + anInt8920;
				int i_1825_ = (i_1823_ << 16) / i_1814_;
				int i_1826_ = (i_1824_ << 16) / i_1815_;
				if (anInt8921 > 0) {
					int i_1827_ = ((anInt8921 << 16) + i_1825_ - 1) / i_1825_;
					i += i_1827_;
					i_1820_ += i_1827_ * i_1825_ - (anInt8921 << 16);
				}
				if (anInt8918 > 0) {
					int i_1828_ = ((anInt8918 << 16) + i_1826_ - 1) / i_1826_;
					i_1813_ += i_1828_;
					i_1821_ += i_1828_ * i_1826_ - (anInt8918 << 16);
				}
				if (anInt8914 < i_1823_)
					i_1814_ = (((anInt8914 << 16) - i_1820_ + i_1825_ - 1) / i_1825_);
				if (anInt8916 < i_1824_)
					i_1815_ = (((anInt8916 << 16) - i_1821_ + i_1826_ - 1) / i_1826_);
				int i_1829_ = i + i_1813_ * i_1822_;
				int i_1830_ = i_1822_ - i_1814_;
				if (i_1813_ + i_1815_ > aClass178_Sub3_8923.anInt9826 * 489020741)
					i_1815_ -= (i_1813_ + i_1815_ - aClass178_Sub3_8923.anInt9826 * 489020741);
				if (i_1813_ < aClass178_Sub3_8923.anInt9810 * -695823527) {
					int i_1831_ = aClass178_Sub3_8923.anInt9810 * -695823527 - i_1813_;
					i_1815_ -= i_1831_;
					i_1829_ += i_1831_ * i_1822_;
					i_1821_ += i_1826_ * i_1831_;
				}
				if (i + i_1814_ > aClass178_Sub3_8923.anInt9809 * -272361347) {
					int i_1832_ = (i + i_1814_ - aClass178_Sub3_8923.anInt9809 * -272361347);
					i_1814_ -= i_1832_;
					i_1830_ += i_1832_;
				}
				if (i < aClass178_Sub3_8923.anInt9815 * -1373518821) {
					int i_1833_ = aClass178_Sub3_8923.anInt9815 * -1373518821 - i;
					i_1814_ -= i_1833_;
					i_1829_ += i_1833_;
					i_1820_ += i_1825_ * i_1833_;
					i_1830_ += i_1833_;
				}
				if (i_1818_ == 0) {
					if (i_1816_ == 1) {
						int i_1834_ = i_1820_;
						for (int i_1835_ = -i_1815_; i_1835_ < 0; i_1835_++) {
							int i_1836_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1837_ = -i_1814_; i_1837_ < 0; i_1837_++) {
								is[i_1829_++] = (anIntArray11347[(i_1820_ >> 16) + i_1836_]);
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1834_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 0) {
						int i_1838_ = (i_1817_ & 0xff0000) >> 16;
						int i_1839_ = (i_1817_ & 0xff00) >> 8;
						int i_1840_ = i_1817_ & 0xff;
						int i_1841_ = i_1820_;
						for (int i_1842_ = -i_1815_; i_1842_ < 0; i_1842_++) {
							int i_1843_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1844_ = -i_1814_; i_1844_ < 0; i_1844_++) {
								int i_1845_ = (anIntArray11347[(i_1820_ >> 16) + i_1843_]);
								int i_1846_ = ((i_1845_ & 0xff0000) * i_1838_ & ~0xffffff);
								int i_1847_ = (i_1845_ & 0xff00) * i_1839_ & 0xff0000;
								int i_1848_ = (i_1845_ & 0xff) * i_1840_ & 0xff00;
								is[i_1829_++] = (i_1846_ | i_1847_ | i_1848_) >>> 8;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1841_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 3) {
						int i_1849_ = i_1820_;
						for (int i_1850_ = -i_1815_; i_1850_ < 0; i_1850_++) {
							int i_1851_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1852_ = -i_1814_; i_1852_ < 0; i_1852_++) {
								int i_1853_ = (anIntArray11347[(i_1820_ >> 16) + i_1851_]);
								int i_1854_ = i_1853_ + i_1817_;
								int i_1855_ = ((i_1853_ & 0xff00ff) + (i_1817_ & 0xff00ff));
								int i_1856_ = ((i_1855_ & 0x1000100) + (i_1854_ - i_1855_ & 0x10000));
								is[i_1829_++] = i_1854_ - i_1856_ | i_1856_ - (i_1856_ >>> 8);
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1849_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 2) {
						int i_1857_ = i_1817_ >>> 24;
						int i_1858_ = 256 - i_1857_;
						int i_1859_ = (i_1817_ & 0xff00ff) * i_1858_ & ~0xff00ff;
						int i_1860_ = (i_1817_ & 0xff00) * i_1858_ & 0xff0000;
						i_1817_ = (i_1859_ | i_1860_) >>> 8;
						int i_1861_ = i_1820_;
						for (int i_1862_ = -i_1815_; i_1862_ < 0; i_1862_++) {
							int i_1863_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1864_ = -i_1814_; i_1864_ < 0; i_1864_++) {
								int i_1865_ = (anIntArray11347[(i_1820_ >> 16) + i_1863_]);
								i_1859_ = ((i_1865_ & 0xff00ff) * i_1857_ & ~0xff00ff);
								i_1860_ = (i_1865_ & 0xff00) * i_1857_ & 0xff0000;
								is[i_1829_++] = ((i_1859_ | i_1860_) >>> 8) + i_1817_;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1861_;
							i_1829_ += i_1830_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1818_ == 1) {
					if (i_1816_ == 1) {
						int i_1866_ = i_1820_;
						for (int i_1867_ = -i_1815_; i_1867_ < 0; i_1867_++) {
							int i_1868_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1869_ = -i_1814_; i_1869_ < 0; i_1869_++) {
								int i_1870_ = (anIntArray11347[(i_1820_ >> 16) + i_1868_]);
								if (i_1870_ != 0)
									is[i_1829_++] = i_1870_;
								else
									i_1829_++;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1866_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 0) {
						int i_1871_ = i_1820_;
						if ((i_1817_ & 0xffffff) == 16777215) {
							int i_1872_ = i_1817_ >>> 24;
							int i_1873_ = 256 - i_1872_;
							for (int i_1874_ = -i_1815_; i_1874_ < 0; i_1874_++) {
								int i_1875_ = (i_1821_ >> 16) * anInt8914;
								for (int i_1876_ = -i_1814_; i_1876_ < 0; i_1876_++) {
									int i_1877_ = (anIntArray11347[(i_1820_ >> 16) + i_1875_]);
									if (i_1877_ != 0) {
										int i_1878_ = is[i_1829_];
										is[i_1829_++] = ((((i_1877_ & 0xff00ff) * i_1872_ + ((i_1878_ & 0xff00ff) * i_1873_)) & ~0xff00ff) + (((i_1877_ & 0xff00) * i_1872_ + ((i_1878_ & 0xff00) * i_1873_)) & 0xff0000)) >> 8;
									} else
										i_1829_++;
									i_1820_ += i_1825_;
								}
								i_1821_ += i_1826_;
								i_1820_ = i_1871_;
								i_1829_ += i_1830_;
							}
						} else {
							int i_1879_ = (i_1817_ & 0xff0000) >> 16;
							int i_1880_ = (i_1817_ & 0xff00) >> 8;
							int i_1881_ = i_1817_ & 0xff;
							int i_1882_ = i_1817_ >>> 24;
							int i_1883_ = 256 - i_1882_;
							for (int i_1884_ = -i_1815_; i_1884_ < 0; i_1884_++) {
								int i_1885_ = (i_1821_ >> 16) * anInt8914;
								for (int i_1886_ = -i_1814_; i_1886_ < 0; i_1886_++) {
									int i_1887_ = (anIntArray11347[(i_1820_ >> 16) + i_1885_]);
									if (i_1887_ != 0) {
										if (i_1882_ != 255) {
											int i_1888_ = (((i_1887_ & 0xff0000) * i_1879_) & ~0xffffff);
											int i_1889_ = ((i_1887_ & 0xff00) * i_1880_ & 0xff0000);
											int i_1890_ = ((i_1887_ & 0xff) * i_1881_ & 0xff00);
											i_1887_ = (i_1888_ | i_1889_ | i_1890_) >>> 8;
											int i_1891_ = is[i_1829_];
											is[i_1829_++] = (((((i_1887_ & 0xff00ff) * i_1882_) + ((i_1891_ & 0xff00ff) * i_1883_)) & ~0xff00ff) + ((((i_1887_ & 0xff00) * i_1882_) + ((i_1891_ & 0xff00) * i_1883_)) & 0xff0000)) >> 8;
										} else {
											int i_1892_ = (((i_1887_ & 0xff0000) * i_1879_) & ~0xffffff);
											int i_1893_ = ((i_1887_ & 0xff00) * i_1880_ & 0xff0000);
											int i_1894_ = ((i_1887_ & 0xff) * i_1881_ & 0xff00);
											is[i_1829_++] = (i_1892_ | i_1893_ | i_1894_) >>> 8;
										}
									} else
										i_1829_++;
									i_1820_ += i_1825_;
								}
								i_1821_ += i_1826_;
								i_1820_ = i_1871_;
								i_1829_ += i_1830_;
							}
						}
					} else if (i_1816_ == 3) {
						int i_1895_ = i_1820_;
						int i_1896_ = i_1817_ >>> 24;
						int i_1897_ = 256 - i_1896_;
						for (int i_1898_ = -i_1815_; i_1898_ < 0; i_1898_++) {
							int i_1899_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1900_ = -i_1814_; i_1900_ < 0; i_1900_++) {
								int i_1901_ = (anIntArray11347[(i_1820_ >> 16) + i_1899_]);
								int i_1902_ = i_1901_ + i_1817_;
								int i_1903_ = ((i_1901_ & 0xff00ff) + (i_1817_ & 0xff00ff));
								int i_1904_ = ((i_1903_ & 0x1000100) + (i_1902_ - i_1903_ & 0x10000));
								i_1904_ = i_1902_ - i_1904_ | i_1904_ - (i_1904_ >>> 8);
								if (i_1901_ == 0 && i_1896_ != 255) {
									i_1901_ = i_1904_;
									i_1904_ = is[i_1829_];
									i_1904_ = ((((i_1901_ & 0xff00ff) * i_1896_ + (i_1904_ & 0xff00ff) * i_1897_) & ~0xff00ff) + (((i_1901_ & 0xff00) * i_1896_ + (i_1904_ & 0xff00) * i_1897_) & 0xff0000)) >> 8;
								}
								is[i_1829_++] = i_1904_;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1895_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 2) {
						int i_1905_ = i_1817_ >>> 24;
						int i_1906_ = 256 - i_1905_;
						int i_1907_ = (i_1817_ & 0xff00ff) * i_1906_ & ~0xff00ff;
						int i_1908_ = (i_1817_ & 0xff00) * i_1906_ & 0xff0000;
						i_1817_ = (i_1907_ | i_1908_) >>> 8;
						int i_1909_ = i_1820_;
						for (int i_1910_ = -i_1815_; i_1910_ < 0; i_1910_++) {
							int i_1911_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1912_ = -i_1814_; i_1912_ < 0; i_1912_++) {
								int i_1913_ = (anIntArray11347[(i_1820_ >> 16) + i_1911_]);
								if (i_1913_ != 0) {
									i_1907_ = ((i_1913_ & 0xff00ff) * i_1905_ & ~0xff00ff);
									i_1908_ = ((i_1913_ & 0xff00) * i_1905_ & 0xff0000);
									is[i_1829_++] = ((i_1907_ | i_1908_) >>> 8) + i_1817_;
								} else
									i_1829_++;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1909_;
							i_1829_ += i_1830_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1818_ == 2) {
					if (i_1816_ == 1) {
						int i_1914_ = i_1820_;
						for (int i_1915_ = -i_1815_; i_1915_ < 0; i_1915_++) {
							int i_1916_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1917_ = -i_1814_; i_1917_ < 0; i_1917_++) {
								int i_1918_ = (anIntArray11347[(i_1820_ >> 16) + i_1916_]);
								if (i_1918_ != 0) {
									int i_1919_ = is[i_1829_];
									int i_1920_ = i_1918_ + i_1919_;
									int i_1921_ = ((i_1918_ & 0xff00ff) + (i_1919_ & 0xff00ff));
									i_1919_ = ((i_1921_ & 0x1000100) + (i_1920_ - i_1921_ & 0x10000));
									is[i_1829_++] = (i_1920_ - i_1919_ | i_1919_ - (i_1919_ >>> 8));
								} else
									i_1829_++;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1914_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 0) {
						int i_1922_ = i_1820_;
						int i_1923_ = (i_1817_ & 0xff0000) >> 16;
						int i_1924_ = (i_1817_ & 0xff00) >> 8;
						int i_1925_ = i_1817_ & 0xff;
						for (int i_1926_ = -i_1815_; i_1926_ < 0; i_1926_++) {
							int i_1927_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1928_ = -i_1814_; i_1928_ < 0; i_1928_++) {
								int i_1929_ = (anIntArray11347[(i_1820_ >> 16) + i_1927_]);
								if (i_1929_ != 0) {
									int i_1930_ = ((i_1929_ & 0xff0000) * i_1923_ & ~0xffffff);
									int i_1931_ = ((i_1929_ & 0xff00) * i_1924_ & 0xff0000);
									int i_1932_ = (i_1929_ & 0xff) * i_1925_ & 0xff00;
									i_1929_ = (i_1930_ | i_1931_ | i_1932_) >>> 8;
									int i_1933_ = is[i_1829_];
									int i_1934_ = i_1929_ + i_1933_;
									int i_1935_ = ((i_1929_ & 0xff00ff) + (i_1933_ & 0xff00ff));
									i_1933_ = ((i_1935_ & 0x1000100) + (i_1934_ - i_1935_ & 0x10000));
									is[i_1829_++] = (i_1934_ - i_1933_ | i_1933_ - (i_1933_ >>> 8));
								} else
									i_1829_++;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1922_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 3) {
						int i_1936_ = i_1820_;
						for (int i_1937_ = -i_1815_; i_1937_ < 0; i_1937_++) {
							int i_1938_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1939_ = -i_1814_; i_1939_ < 0; i_1939_++) {
								int i_1940_ = (anIntArray11347[(i_1820_ >> 16) + i_1938_]);
								int i_1941_ = i_1940_ + i_1817_;
								int i_1942_ = ((i_1940_ & 0xff00ff) + (i_1817_ & 0xff00ff));
								int i_1943_ = ((i_1942_ & 0x1000100) + (i_1941_ - i_1942_ & 0x10000));
								i_1940_ = i_1941_ - i_1943_ | i_1943_ - (i_1943_ >>> 8);
								i_1943_ = is[i_1829_];
								i_1941_ = i_1940_ + i_1943_;
								i_1942_ = (i_1940_ & 0xff00ff) + (i_1943_ & 0xff00ff);
								i_1943_ = ((i_1942_ & 0x1000100) + (i_1941_ - i_1942_ & 0x10000));
								is[i_1829_++] = i_1941_ - i_1943_ | i_1943_ - (i_1943_ >>> 8);
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1936_;
							i_1829_ += i_1830_;
						}
					} else if (i_1816_ == 2) {
						int i_1944_ = i_1817_ >>> 24;
						int i_1945_ = 256 - i_1944_;
						int i_1946_ = (i_1817_ & 0xff00ff) * i_1945_ & ~0xff00ff;
						int i_1947_ = (i_1817_ & 0xff00) * i_1945_ & 0xff0000;
						i_1817_ = (i_1946_ | i_1947_) >>> 8;
						int i_1948_ = i_1820_;
						for (int i_1949_ = -i_1815_; i_1949_ < 0; i_1949_++) {
							int i_1950_ = (i_1821_ >> 16) * anInt8914;
							for (int i_1951_ = -i_1814_; i_1951_ < 0; i_1951_++) {
								int i_1952_ = (anIntArray11347[(i_1820_ >> 16) + i_1950_]);
								if (i_1952_ != 0) {
									i_1946_ = ((i_1952_ & 0xff00ff) * i_1944_ & ~0xff00ff);
									i_1947_ = ((i_1952_ & 0xff00) * i_1944_ & 0xff0000);
									i_1952_ = (((i_1946_ | i_1947_) >>> 8) + i_1817_);
									int i_1953_ = is[i_1829_];
									int i_1954_ = i_1952_ + i_1953_;
									int i_1955_ = ((i_1952_ & 0xff00ff) + (i_1953_ & 0xff00ff));
									i_1953_ = ((i_1955_ & 0x1000100) + (i_1954_ - i_1955_ & 0x10000));
									is[i_1829_++] = (i_1954_ - i_1953_ | i_1953_ - (i_1953_ >>> 8));
								} else
									i_1829_++;
								i_1820_ += i_1825_;
							}
							i_1821_ += i_1826_;
							i_1820_ = i_1948_;
							i_1829_ += i_1830_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method2483(int i, int i_1956_, int i_1957_, int i_1958_, int[] is, int i_1959_, int i_1960_) {
		i_1960_ -= i_1957_;
		for (int i_1961_ = 0; i_1961_ < i_1958_; i_1961_++) {
			int i_1962_ = (i_1956_ + i_1961_) * i_1957_ + i;
			for (int i_1963_ = 0; i_1963_ < i_1957_; i_1963_++)
				anIntArray11347[i_1962_ + i_1963_] = is[i_1959_++];
			i_1959_ += i_1960_;
		}
	}
}
