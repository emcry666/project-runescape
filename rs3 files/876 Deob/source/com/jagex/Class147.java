/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class147 {
	Class142_Sub2 aClass142_Sub2_1705;
	int anInt1706;
	int anInt1707;
	int anInt1708;
	Class178_Sub1 aClass178_Sub1_1709;
	int anInt1710;
	byte[] aByteArray1711;
	int anInt1712;
	Class122[][] aClass122ArrayArray1713;

	void method2386(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool) {
		aClass178_Sub1_1709.method14682(false);
		aClass178_Sub1_1709.method14620(false);
		aClass178_Sub1_1709.method14670(-2);
		aClass178_Sub1_1709.method14785(1);
		aClass178_Sub1_1709.method14687(1);
		float f = 1.0F / (float) (aClass178_Sub1_1709.anInt9286 * 128);
		if (bool) {
			for (int i_2_ = 0; i_2_ < anInt1706; i_2_++) {
				int i_3_ = i_2_ << anInt1712;
				int i_4_ = i_2_ + 1 << anInt1712;
				for (int i_5_ = 0; i_5_ < anInt1710; i_5_++) {
					int i_6_ = i_5_ << anInt1712;
					int i_7_ = i_5_ + 1 << anInt1712;
					while_120_: for (int i_8_ = i_6_; i_8_ < i_7_; i_8_++) {
						if (i_8_ - i >= -i_1_ && i_8_ - i <= i_1_) {
							for (int i_9_ = i_3_; i_9_ < i_4_; i_9_++) {
								if (i_9_ - i_0_ >= -i_1_ && i_9_ - i_0_ <= i_1_ && (bools[i_8_ - i + i_1_][i_9_ - i_0_ + i_1_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_5_ / f, (float) -i_2_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass122ArrayArray1713[i_5_][i_2_].method2095();
									break while_120_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_10_ = 0; i_10_ < anInt1706; i_10_++) {
				int i_11_ = i_10_ << anInt1712;
				int i_12_ = i_10_ + 1 << anInt1712;
				for (int i_13_ = 0; i_13_ < anInt1710; i_13_++) {
					int i_14_ = 0;
					int i_15_ = i_13_ << anInt1712;
					int i_16_ = i_13_ + 1 << anInt1712;
					Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_1709.aClass523_Sub34_Sub1_9321;
					class523_sub34_sub1.offset = 0;
					for (int i_17_ = i_11_; i_17_ < i_12_; i_17_++) {
						if (i_17_ - i_0_ >= -i_1_ && i_17_ - i_0_ <= i_1_) {
							int i_18_ = (i_17_ * (aClass142_Sub2_1705.anInt1683 * 692304099) + i_15_);
							for (int i_19_ = i_15_; i_19_ < i_16_; i_19_++) {
								if (i_19_ - i >= -i_1_ && i_19_ - i <= i_1_ && (bools[i_19_ - i + i_1_][i_17_ - i_0_ + i_1_])) {
									short[] is = (aClass142_Sub2_1705.aShortArrayArray9715[i_18_]);
									if (is != null) {
										if (aClass178_Sub1_1709.aBool9393) {
											for (int i_20_ = 0; i_20_ < is.length; i_20_++) {
												class523_sub34_sub1.writeShort(is[i_20_] & 0xffff, (byte) -76);
												i_14_++;
											}
										} else {
											for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
												class523_sub34_sub1.method16262(is[i_21_] & 0xffff, -1543855205);
												i_14_++;
											}
										}
									}
								}
								i_18_++;
							}
						}
					}
					if (i_14_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_13_ / f, (float) -i_10_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass122ArrayArray1713[i_13_][i_10_].method2097(class523_sub34_sub1.buffer, i_14_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2387() {
		aClass122ArrayArray1713 = new Class122[anInt1710][anInt1706];
		for (int i = 0; i < anInt1706; i++) {
			for (int i_22_ = 0; i_22_ < anInt1710; i_22_++)
				aClass122ArrayArray1713[i_22_][i] = new Class122(aClass178_Sub1_1709, this, aClass142_Sub2_1705, i_22_, i, anInt1712, i_22_ * 128 + 1, i * 128 + 1);
		}
	}

	void method2388(int i, int i_23_, int i_24_, boolean[][] bools, boolean bool) {
		aClass178_Sub1_1709.method14682(false);
		aClass178_Sub1_1709.method14620(false);
		aClass178_Sub1_1709.method14670(-2);
		aClass178_Sub1_1709.method14785(1);
		aClass178_Sub1_1709.method14687(1);
		float f = 1.0F / (float) (aClass178_Sub1_1709.anInt9286 * 128);
		if (bool) {
			for (int i_25_ = 0; i_25_ < anInt1706; i_25_++) {
				int i_26_ = i_25_ << anInt1712;
				int i_27_ = i_25_ + 1 << anInt1712;
				for (int i_28_ = 0; i_28_ < anInt1710; i_28_++) {
					int i_29_ = i_28_ << anInt1712;
					int i_30_ = i_28_ + 1 << anInt1712;
					while_121_: for (int i_31_ = i_29_; i_31_ < i_30_; i_31_++) {
						if (i_31_ - i >= -i_24_ && i_31_ - i <= i_24_) {
							for (int i_32_ = i_26_; i_32_ < i_27_; i_32_++) {
								if (i_32_ - i_23_ >= -i_24_ && i_32_ - i_23_ <= i_24_ && (bools[i_31_ - i + i_24_][i_32_ - i_23_ + i_24_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_28_ / f, (float) -i_25_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass122ArrayArray1713[i_28_][i_25_].method2095();
									break while_121_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_33_ = 0; i_33_ < anInt1706; i_33_++) {
				int i_34_ = i_33_ << anInt1712;
				int i_35_ = i_33_ + 1 << anInt1712;
				for (int i_36_ = 0; i_36_ < anInt1710; i_36_++) {
					int i_37_ = 0;
					int i_38_ = i_36_ << anInt1712;
					int i_39_ = i_36_ + 1 << anInt1712;
					Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_1709.aClass523_Sub34_Sub1_9321;
					class523_sub34_sub1.offset = 0;
					for (int i_40_ = i_34_; i_40_ < i_35_; i_40_++) {
						if (i_40_ - i_23_ >= -i_24_ && i_40_ - i_23_ <= i_24_) {
							int i_41_ = (i_40_ * (aClass142_Sub2_1705.anInt1683 * 692304099) + i_38_);
							for (int i_42_ = i_38_; i_42_ < i_39_; i_42_++) {
								if (i_42_ - i >= -i_24_ && i_42_ - i <= i_24_ && (bools[i_42_ - i + i_24_][i_40_ - i_23_ + i_24_])) {
									short[] is = (aClass142_Sub2_1705.aShortArrayArray9715[i_41_]);
									if (is != null) {
										if (aClass178_Sub1_1709.aBool9393) {
											for (int i_43_ = 0; i_43_ < is.length; i_43_++) {
												class523_sub34_sub1.writeShort(is[i_43_] & 0xffff, (byte) -48);
												i_37_++;
											}
										} else {
											for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
												class523_sub34_sub1.method16262(is[i_44_] & 0xffff, -1694424815);
												i_37_++;
											}
										}
									}
								}
								i_41_++;
							}
						}
					}
					if (i_37_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_36_ / f, (float) -i_33_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass122ArrayArray1713[i_36_][i_33_].method2097(class523_sub34_sub1.buffer, i_37_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	boolean method2389(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_45_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_45_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_46_ = i + i_45_ * anInt1707;
		int i_47_ = class523_sub27_sub4_sub1.anInt12052;
		int i_48_ = class523_sub27_sub4_sub1.anInt12050;
		int i_49_ = anInt1707 - i_48_;
		if (i_45_ <= 0) {
			int i_50_ = 1 - i_45_;
			i_47_ -= i_50_;
			i_46_ += i_50_ * anInt1707;
			i_45_ = 1;
		}
		if (i_45_ + i_47_ >= anInt1708) {
			int i_51_ = i_45_ + i_47_ + 1 - anInt1708;
			i_47_ -= i_51_;
		}
		if (i <= 0) {
			int i_52_ = 1 - i;
			i_48_ -= i_52_;
			i_46_ += i_52_;
			i_49_ += i_52_;
			i = 1;
		}
		if (i + i_48_ >= anInt1707) {
			int i_53_ = i + i_48_ + 1 - anInt1707;
			i_48_ -= i_53_;
			i_49_ += i_53_;
		}
		if (i_48_ <= 0 || i_47_ <= 0)
			return false;
		int i_54_ = 8;
		i_49_ += (i_54_ - 1) * anInt1707;
		return method2396(aByteArray1711, i_46_, i_48_, i_47_, i_49_, i_54_);
	}

	void method2390(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_55_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_55_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_56_ = i + i_55_ * anInt1707;
		int i_57_ = 0;
		int i_58_ = class523_sub27_sub4_sub1.anInt12052;
		int i_59_ = class523_sub27_sub4_sub1.anInt12050;
		int i_60_ = anInt1707 - i_59_;
		int i_61_ = 0;
		if (i_55_ <= 0) {
			int i_62_ = 1 - i_55_;
			i_58_ -= i_62_;
			i_57_ += i_62_ * i_59_;
			i_56_ += i_62_ * anInt1707;
			i_55_ = 1;
		}
		if (i_55_ + i_58_ >= anInt1708) {
			int i_63_ = i_55_ + i_58_ + 1 - anInt1708;
			i_58_ -= i_63_;
		}
		if (i <= 0) {
			int i_64_ = 1 - i;
			i_59_ -= i_64_;
			i_57_ += i_64_;
			i_56_ += i_64_;
			i_61_ += i_64_;
			i_60_ += i_64_;
			i = 1;
		}
		if (i + i_59_ >= anInt1707) {
			int i_65_ = i + i_59_ + 1 - anInt1707;
			i_59_ -= i_65_;
			i_61_ += i_65_;
			i_60_ += i_65_;
		}
		if (i_59_ > 0 && i_58_ > 0) {
			method2394(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_57_, i_56_, i_59_, i_58_, i_60_, i_61_);
			method2392(i, i_55_, i_59_, i_58_);
		}
	}

	static final void method2391(byte[] is, byte[] is_66_, int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
		int i_72_ = -(i_68_ >> 2);
		i_68_ = -(i_68_ & 0x3);
		for (int i_73_ = -i_69_; i_73_ < 0; i_73_++) {
			for (int i_74_ = i_72_; i_74_ < 0; i_74_++) {
				is[i_67_++] += is_66_[i++];
				is[i_67_++] += is_66_[i++];
				is[i_67_++] += is_66_[i++];
				is[i_67_++] += is_66_[i++];
			}
			for (int i_75_ = i_68_; i_75_ < 0; i_75_++)
				is[i_67_++] += is_66_[i++];
			i_67_ += i_70_;
			i += i_71_;
		}
	}

	void method2392(int i, int i_76_, int i_77_, int i_78_) {
		if (aClass122ArrayArray1713 != null) {
			int i_79_ = i - 1 >> 7;
			int i_80_ = i - 1 + i_77_ - 1 >> 7;
			int i_81_ = i_76_ - 1 >> 7;
			int i_82_ = i_76_ - 1 + i_78_ - 1 >> 7;
			for (int i_83_ = i_79_; i_83_ <= i_80_; i_83_++) {
				Class122[] class122s = aClass122ArrayArray1713[i_83_];
				for (int i_84_ = i_81_; i_84_ <= i_82_; i_84_++)
					class122s[i_84_].aBool1500 = true;
			}
		}
	}

	static final void method2393(byte[] is, byte[] is_85_, int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		int i_91_ = -(i_87_ >> 2);
		i_87_ = -(i_87_ & 0x3);
		for (int i_92_ = -i_88_; i_92_ < 0; i_92_++) {
			for (int i_93_ = i_91_; i_93_ < 0; i_93_++) {
				is[i_86_++] += is_85_[i++];
				is[i_86_++] += is_85_[i++];
				is[i_86_++] += is_85_[i++];
				is[i_86_++] += is_85_[i++];
			}
			for (int i_94_ = i_87_; i_94_ < 0; i_94_++)
				is[i_86_++] += is_85_[i++];
			i_86_ += i_89_;
			i += i_90_;
		}
	}

	static final void method2394(byte[] is, byte[] is_95_, int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_) {
		int i_101_ = -(i_97_ >> 2);
		i_97_ = -(i_97_ & 0x3);
		for (int i_102_ = -i_98_; i_102_ < 0; i_102_++) {
			for (int i_103_ = i_101_; i_103_ < 0; i_103_++) {
				is[i_96_++] -= is_95_[i++];
				is[i_96_++] -= is_95_[i++];
				is[i_96_++] -= is_95_[i++];
				is[i_96_++] -= is_95_[i++];
			}
			for (int i_104_ = i_97_; i_104_ < 0; i_104_++)
				is[i_96_++] -= is_95_[i++];
			i_96_ += i_99_;
			i += i_100_;
		}
	}

	void method2395() {
		aClass122ArrayArray1713 = new Class122[anInt1710][anInt1706];
		for (int i = 0; i < anInt1706; i++) {
			for (int i_105_ = 0; i_105_ < anInt1710; i_105_++)
				aClass122ArrayArray1713[i_105_][i] = new Class122(aClass178_Sub1_1709, this, aClass142_Sub2_1705, i_105_, i, anInt1712, i_105_ * 128 + 1, i * 128 + 1);
		}
	}

	static final boolean method2396(byte[] is, int i, int i_106_, int i_107_, int i_108_, int i_109_) {
		int i_110_ = i_106_ % i_109_;
		int i_111_;
		if (i_110_ != 0)
			i_111_ = i_109_ - i_110_;
		else
			i_111_ = 0;
		int i_112_ = -((i_107_ + i_109_ - 1) / i_109_);
		int i_113_ = -((i_106_ + i_109_ - 1) / i_109_);
		for (int i_114_ = i_112_; i_114_ < 0; i_114_++) {
			for (int i_115_ = i_113_; i_115_ < 0; i_115_++) {
				if (is[i] == 0)
					return true;
				i += i_109_;
			}
			i -= i_111_;
			if (is[i - 1] == 0)
				return true;
			i += i_108_;
		}
		return false;
	}

	static final boolean method2397(byte[] is, int i, int i_116_, int i_117_, int i_118_, int i_119_) {
		int i_120_ = i_116_ % i_119_;
		int i_121_;
		if (i_120_ != 0)
			i_121_ = i_119_ - i_120_;
		else
			i_121_ = 0;
		int i_122_ = -((i_117_ + i_119_ - 1) / i_119_);
		int i_123_ = -((i_116_ + i_119_ - 1) / i_119_);
		for (int i_124_ = i_122_; i_124_ < 0; i_124_++) {
			for (int i_125_ = i_123_; i_125_ < 0; i_125_++) {
				if (is[i] == 0)
					return true;
				i += i_119_;
			}
			i -= i_121_;
			if (is[i - 1] == 0)
				return true;
			i += i_118_;
		}
		return false;
	}

	void method2398(int i, int i_126_, int i_127_, boolean[][] bools, boolean bool) {
		aClass178_Sub1_1709.method14682(false);
		aClass178_Sub1_1709.method14620(false);
		aClass178_Sub1_1709.method14670(-2);
		aClass178_Sub1_1709.method14785(1);
		aClass178_Sub1_1709.method14687(1);
		float f = 1.0F / (float) (aClass178_Sub1_1709.anInt9286 * 128);
		if (bool) {
			for (int i_128_ = 0; i_128_ < anInt1706; i_128_++) {
				int i_129_ = i_128_ << anInt1712;
				int i_130_ = i_128_ + 1 << anInt1712;
				for (int i_131_ = 0; i_131_ < anInt1710; i_131_++) {
					int i_132_ = i_131_ << anInt1712;
					int i_133_ = i_131_ + 1 << anInt1712;
					while_122_: for (int i_134_ = i_132_; i_134_ < i_133_; i_134_++) {
						if (i_134_ - i >= -i_127_ && i_134_ - i <= i_127_) {
							for (int i_135_ = i_129_; i_135_ < i_130_; i_135_++) {
								if (i_135_ - i_126_ >= -i_127_ && i_135_ - i_126_ <= i_127_ && (bools[i_134_ - i + i_127_][i_135_ - i_126_ + i_127_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_131_ / f, (float) -i_128_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass122ArrayArray1713[i_131_][i_128_].method2095();
									break while_122_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_136_ = 0; i_136_ < anInt1706; i_136_++) {
				int i_137_ = i_136_ << anInt1712;
				int i_138_ = i_136_ + 1 << anInt1712;
				for (int i_139_ = 0; i_139_ < anInt1710; i_139_++) {
					int i_140_ = 0;
					int i_141_ = i_139_ << anInt1712;
					int i_142_ = i_139_ + 1 << anInt1712;
					Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_1709.aClass523_Sub34_Sub1_9321;
					class523_sub34_sub1.offset = 0;
					for (int i_143_ = i_137_; i_143_ < i_138_; i_143_++) {
						if (i_143_ - i_126_ >= -i_127_ && i_143_ - i_126_ <= i_127_) {
							int i_144_ = (i_143_ * (aClass142_Sub2_1705.anInt1683 * 692304099) + i_141_);
							for (int i_145_ = i_141_; i_145_ < i_142_; i_145_++) {
								if (i_145_ - i >= -i_127_ && i_145_ - i <= i_127_ && (bools[i_145_ - i + i_127_][i_143_ - i_126_ + i_127_])) {
									short[] is = (aClass142_Sub2_1705.aShortArrayArray9715[i_144_]);
									if (is != null) {
										if (aClass178_Sub1_1709.aBool9393) {
											for (int i_146_ = 0; i_146_ < is.length; i_146_++) {
												class523_sub34_sub1.writeShort(is[i_146_] & 0xffff, (byte) -16);
												i_140_++;
											}
										} else {
											for (int i_147_ = 0; i_147_ < is.length; i_147_++) {
												class523_sub34_sub1.method16262(is[i_147_] & 0xffff, -635326493);
												i_140_++;
											}
										}
									}
								}
								i_144_++;
							}
						}
					}
					if (i_140_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_139_ / f, (float) -i_136_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass122ArrayArray1713[i_139_][i_136_].method2097(class523_sub34_sub1.buffer, i_140_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2399(int i, int i_148_, int i_149_, boolean[][] bools, boolean bool) {
		aClass178_Sub1_1709.method14682(false);
		aClass178_Sub1_1709.method14620(false);
		aClass178_Sub1_1709.method14670(-2);
		aClass178_Sub1_1709.method14785(1);
		aClass178_Sub1_1709.method14687(1);
		float f = 1.0F / (float) (aClass178_Sub1_1709.anInt9286 * 128);
		if (bool) {
			for (int i_150_ = 0; i_150_ < anInt1706; i_150_++) {
				int i_151_ = i_150_ << anInt1712;
				int i_152_ = i_150_ + 1 << anInt1712;
				for (int i_153_ = 0; i_153_ < anInt1710; i_153_++) {
					int i_154_ = i_153_ << anInt1712;
					int i_155_ = i_153_ + 1 << anInt1712;
					while_123_: for (int i_156_ = i_154_; i_156_ < i_155_; i_156_++) {
						if (i_156_ - i >= -i_149_ && i_156_ - i <= i_149_) {
							for (int i_157_ = i_151_; i_157_ < i_152_; i_157_++) {
								if (i_157_ - i_148_ >= -i_149_ && i_157_ - i_148_ <= i_149_ && (bools[i_156_ - i + i_149_][i_157_ - i_148_ + i_149_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_153_ / f, (float) -i_150_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass122ArrayArray1713[i_153_][i_150_].method2095();
									break while_123_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_158_ = 0; i_158_ < anInt1706; i_158_++) {
				int i_159_ = i_158_ << anInt1712;
				int i_160_ = i_158_ + 1 << anInt1712;
				for (int i_161_ = 0; i_161_ < anInt1710; i_161_++) {
					int i_162_ = 0;
					int i_163_ = i_161_ << anInt1712;
					int i_164_ = i_161_ + 1 << anInt1712;
					Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_1709.aClass523_Sub34_Sub1_9321;
					class523_sub34_sub1.offset = 0;
					for (int i_165_ = i_159_; i_165_ < i_160_; i_165_++) {
						if (i_165_ - i_148_ >= -i_149_ && i_165_ - i_148_ <= i_149_) {
							int i_166_ = (i_165_ * (aClass142_Sub2_1705.anInt1683 * 692304099) + i_163_);
							for (int i_167_ = i_163_; i_167_ < i_164_; i_167_++) {
								if (i_167_ - i >= -i_149_ && i_167_ - i <= i_149_ && (bools[i_167_ - i + i_149_][i_165_ - i_148_ + i_149_])) {
									short[] is = (aClass142_Sub2_1705.aShortArrayArray9715[i_166_]);
									if (is != null) {
										if (aClass178_Sub1_1709.aBool9393) {
											for (int i_168_ = 0; i_168_ < is.length; i_168_++) {
												class523_sub34_sub1.writeShort(is[i_168_] & 0xffff, (byte) -15);
												i_162_++;
											}
										} else {
											for (int i_169_ = 0; i_169_ < is.length; i_169_++) {
												class523_sub34_sub1.method16262(is[i_169_] & 0xffff, -478151188);
												i_162_++;
											}
										}
									}
								}
								i_166_++;
							}
						}
					}
					if (i_162_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_161_ / f, (float) -i_158_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass122ArrayArray1713[i_161_][i_158_].method2097(class523_sub34_sub1.buffer, i_162_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2400(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_170_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_170_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_171_ = i + i_170_ * anInt1707;
		int i_172_ = 0;
		int i_173_ = class523_sub27_sub4_sub1.anInt12052;
		int i_174_ = class523_sub27_sub4_sub1.anInt12050;
		int i_175_ = anInt1707 - i_174_;
		int i_176_ = 0;
		if (i_170_ <= 0) {
			int i_177_ = 1 - i_170_;
			i_173_ -= i_177_;
			i_172_ += i_177_ * i_174_;
			i_171_ += i_177_ * anInt1707;
			i_170_ = 1;
		}
		if (i_170_ + i_173_ >= anInt1708) {
			int i_178_ = i_170_ + i_173_ + 1 - anInt1708;
			i_173_ -= i_178_;
		}
		if (i <= 0) {
			int i_179_ = 1 - i;
			i_174_ -= i_179_;
			i_172_ += i_179_;
			i_171_ += i_179_;
			i_176_ += i_179_;
			i_175_ += i_179_;
			i = 1;
		}
		if (i + i_174_ >= anInt1707) {
			int i_180_ = i + i_174_ + 1 - anInt1707;
			i_174_ -= i_180_;
			i_176_ += i_180_;
			i_175_ += i_180_;
		}
		if (i_174_ > 0 && i_173_ > 0) {
			method2393(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_172_, i_171_, i_174_, i_173_, i_175_, i_176_);
			method2392(i, i_170_, i_174_, i_173_);
		}
	}

	void method2401(int i, int i_181_, int i_182_, boolean[][] bools, boolean bool) {
		aClass178_Sub1_1709.method14682(false);
		aClass178_Sub1_1709.method14620(false);
		aClass178_Sub1_1709.method14670(-2);
		aClass178_Sub1_1709.method14785(1);
		aClass178_Sub1_1709.method14687(1);
		float f = 1.0F / (float) (aClass178_Sub1_1709.anInt9286 * 128);
		if (bool) {
			for (int i_183_ = 0; i_183_ < anInt1706; i_183_++) {
				int i_184_ = i_183_ << anInt1712;
				int i_185_ = i_183_ + 1 << anInt1712;
				for (int i_186_ = 0; i_186_ < anInt1710; i_186_++) {
					int i_187_ = i_186_ << anInt1712;
					int i_188_ = i_186_ + 1 << anInt1712;
					while_124_: for (int i_189_ = i_187_; i_189_ < i_188_; i_189_++) {
						if (i_189_ - i >= -i_182_ && i_189_ - i <= i_182_) {
							for (int i_190_ = i_184_; i_190_ < i_185_; i_190_++) {
								if (i_190_ - i_181_ >= -i_182_ && i_190_ - i_181_ <= i_182_ && (bools[i_189_ - i + i_182_][i_190_ - i_181_ + i_182_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_186_ / f, (float) -i_183_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass122ArrayArray1713[i_186_][i_183_].method2095();
									break while_124_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_191_ = 0; i_191_ < anInt1706; i_191_++) {
				int i_192_ = i_191_ << anInt1712;
				int i_193_ = i_191_ + 1 << anInt1712;
				for (int i_194_ = 0; i_194_ < anInt1710; i_194_++) {
					int i_195_ = 0;
					int i_196_ = i_194_ << anInt1712;
					int i_197_ = i_194_ + 1 << anInt1712;
					Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_1709.aClass523_Sub34_Sub1_9321;
					class523_sub34_sub1.offset = 0;
					for (int i_198_ = i_192_; i_198_ < i_193_; i_198_++) {
						if (i_198_ - i_181_ >= -i_182_ && i_198_ - i_181_ <= i_182_) {
							int i_199_ = (i_198_ * (aClass142_Sub2_1705.anInt1683 * 692304099) + i_196_);
							for (int i_200_ = i_196_; i_200_ < i_197_; i_200_++) {
								if (i_200_ - i >= -i_182_ && i_200_ - i <= i_182_ && (bools[i_200_ - i + i_182_][i_198_ - i_181_ + i_182_])) {
									short[] is = (aClass142_Sub2_1705.aShortArrayArray9715[i_199_]);
									if (is != null) {
										if (aClass178_Sub1_1709.aBool9393) {
											for (int i_201_ = 0; i_201_ < is.length; i_201_++) {
												class523_sub34_sub1.writeShort(is[i_201_] & 0xffff, (byte) -53);
												i_195_++;
											}
										} else {
											for (int i_202_ = 0; i_202_ < is.length; i_202_++) {
												class523_sub34_sub1.method16262(is[i_202_] & 0xffff, -892103250);
												i_195_++;
											}
										}
									}
								}
								i_199_++;
							}
						}
					}
					if (i_195_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_194_ / f, (float) -i_191_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass122ArrayArray1713[i_194_][i_191_].method2097(class523_sub34_sub1.buffer, i_195_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2402(int i, int i_203_, int i_204_, int i_205_) {
		if (aClass122ArrayArray1713 != null) {
			int i_206_ = i - 1 >> 7;
			int i_207_ = i - 1 + i_204_ - 1 >> 7;
			int i_208_ = i_203_ - 1 >> 7;
			int i_209_ = i_203_ - 1 + i_205_ - 1 >> 7;
			for (int i_210_ = i_206_; i_210_ <= i_207_; i_210_++) {
				Class122[] class122s = aClass122ArrayArray1713[i_210_];
				for (int i_211_ = i_208_; i_211_ <= i_209_; i_211_++)
					class122s[i_211_].aBool1500 = true;
			}
		}
	}

	void method2403(int i, int i_212_, int i_213_, int i_214_) {
		if (aClass122ArrayArray1713 != null) {
			int i_215_ = i - 1 >> 7;
			int i_216_ = i - 1 + i_213_ - 1 >> 7;
			int i_217_ = i_212_ - 1 >> 7;
			int i_218_ = i_212_ - 1 + i_214_ - 1 >> 7;
			for (int i_219_ = i_215_; i_219_ <= i_216_; i_219_++) {
				Class122[] class122s = aClass122ArrayArray1713[i_219_];
				for (int i_220_ = i_217_; i_220_ <= i_218_; i_220_++)
					class122s[i_220_].aBool1500 = true;
			}
		}
	}

	void method2404(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_221_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_221_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_222_ = i + i_221_ * anInt1707;
		int i_223_ = 0;
		int i_224_ = class523_sub27_sub4_sub1.anInt12052;
		int i_225_ = class523_sub27_sub4_sub1.anInt12050;
		int i_226_ = anInt1707 - i_225_;
		int i_227_ = 0;
		if (i_221_ <= 0) {
			int i_228_ = 1 - i_221_;
			i_224_ -= i_228_;
			i_223_ += i_228_ * i_225_;
			i_222_ += i_228_ * anInt1707;
			i_221_ = 1;
		}
		if (i_221_ + i_224_ >= anInt1708) {
			int i_229_ = i_221_ + i_224_ + 1 - anInt1708;
			i_224_ -= i_229_;
		}
		if (i <= 0) {
			int i_230_ = 1 - i;
			i_225_ -= i_230_;
			i_223_ += i_230_;
			i_222_ += i_230_;
			i_227_ += i_230_;
			i_226_ += i_230_;
			i = 1;
		}
		if (i + i_225_ >= anInt1707) {
			int i_231_ = i + i_225_ + 1 - anInt1707;
			i_225_ -= i_231_;
			i_227_ += i_231_;
			i_226_ += i_231_;
		}
		if (i_225_ > 0 && i_224_ > 0) {
			method2393(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_223_, i_222_, i_225_, i_224_, i_226_, i_227_);
			method2392(i, i_221_, i_225_, i_224_);
		}
	}

	void method2405(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_232_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_232_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_233_ = i + i_232_ * anInt1707;
		int i_234_ = 0;
		int i_235_ = class523_sub27_sub4_sub1.anInt12052;
		int i_236_ = class523_sub27_sub4_sub1.anInt12050;
		int i_237_ = anInt1707 - i_236_;
		int i_238_ = 0;
		if (i_232_ <= 0) {
			int i_239_ = 1 - i_232_;
			i_235_ -= i_239_;
			i_234_ += i_239_ * i_236_;
			i_233_ += i_239_ * anInt1707;
			i_232_ = 1;
		}
		if (i_232_ + i_235_ >= anInt1708) {
			int i_240_ = i_232_ + i_235_ + 1 - anInt1708;
			i_235_ -= i_240_;
		}
		if (i <= 0) {
			int i_241_ = 1 - i;
			i_236_ -= i_241_;
			i_234_ += i_241_;
			i_233_ += i_241_;
			i_238_ += i_241_;
			i_237_ += i_241_;
			i = 1;
		}
		if (i + i_236_ >= anInt1707) {
			int i_242_ = i + i_236_ + 1 - anInt1707;
			i_236_ -= i_242_;
			i_238_ += i_242_;
			i_237_ += i_242_;
		}
		if (i_236_ > 0 && i_235_ > 0) {
			method2393(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_234_, i_233_, i_236_, i_235_, i_237_, i_238_);
			method2392(i, i_232_, i_236_, i_235_);
		}
	}

	void method2406(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_243_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_243_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_244_ = i + i_243_ * anInt1707;
		int i_245_ = 0;
		int i_246_ = class523_sub27_sub4_sub1.anInt12052;
		int i_247_ = class523_sub27_sub4_sub1.anInt12050;
		int i_248_ = anInt1707 - i_247_;
		int i_249_ = 0;
		if (i_243_ <= 0) {
			int i_250_ = 1 - i_243_;
			i_246_ -= i_250_;
			i_245_ += i_250_ * i_247_;
			i_244_ += i_250_ * anInt1707;
			i_243_ = 1;
		}
		if (i_243_ + i_246_ >= anInt1708) {
			int i_251_ = i_243_ + i_246_ + 1 - anInt1708;
			i_246_ -= i_251_;
		}
		if (i <= 0) {
			int i_252_ = 1 - i;
			i_247_ -= i_252_;
			i_245_ += i_252_;
			i_244_ += i_252_;
			i_249_ += i_252_;
			i_248_ += i_252_;
			i = 1;
		}
		if (i + i_247_ >= anInt1707) {
			int i_253_ = i + i_247_ + 1 - anInt1707;
			i_247_ -= i_253_;
			i_249_ += i_253_;
			i_248_ += i_253_;
		}
		if (i_247_ > 0 && i_246_ > 0) {
			method2393(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_245_, i_244_, i_247_, i_246_, i_248_, i_249_);
			method2392(i, i_243_, i_247_, i_246_);
		}
	}

	void method2407(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_254_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_254_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_255_ = i + i_254_ * anInt1707;
		int i_256_ = 0;
		int i_257_ = class523_sub27_sub4_sub1.anInt12052;
		int i_258_ = class523_sub27_sub4_sub1.anInt12050;
		int i_259_ = anInt1707 - i_258_;
		int i_260_ = 0;
		if (i_254_ <= 0) {
			int i_261_ = 1 - i_254_;
			i_257_ -= i_261_;
			i_256_ += i_261_ * i_258_;
			i_255_ += i_261_ * anInt1707;
			i_254_ = 1;
		}
		if (i_254_ + i_257_ >= anInt1708) {
			int i_262_ = i_254_ + i_257_ + 1 - anInt1708;
			i_257_ -= i_262_;
		}
		if (i <= 0) {
			int i_263_ = 1 - i;
			i_258_ -= i_263_;
			i_256_ += i_263_;
			i_255_ += i_263_;
			i_260_ += i_263_;
			i_259_ += i_263_;
			i = 1;
		}
		if (i + i_258_ >= anInt1707) {
			int i_264_ = i + i_258_ + 1 - anInt1707;
			i_258_ -= i_264_;
			i_260_ += i_264_;
			i_259_ += i_264_;
		}
		if (i_258_ > 0 && i_257_ > 0) {
			method2394(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_256_, i_255_, i_258_, i_257_, i_259_, i_260_);
			method2392(i, i_254_, i_258_, i_257_);
		}
	}

	void method2408(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_265_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_265_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_266_ = i + i_265_ * anInt1707;
		int i_267_ = 0;
		int i_268_ = class523_sub27_sub4_sub1.anInt12052;
		int i_269_ = class523_sub27_sub4_sub1.anInt12050;
		int i_270_ = anInt1707 - i_269_;
		int i_271_ = 0;
		if (i_265_ <= 0) {
			int i_272_ = 1 - i_265_;
			i_268_ -= i_272_;
			i_267_ += i_272_ * i_269_;
			i_266_ += i_272_ * anInt1707;
			i_265_ = 1;
		}
		if (i_265_ + i_268_ >= anInt1708) {
			int i_273_ = i_265_ + i_268_ + 1 - anInt1708;
			i_268_ -= i_273_;
		}
		if (i <= 0) {
			int i_274_ = 1 - i;
			i_269_ -= i_274_;
			i_267_ += i_274_;
			i_266_ += i_274_;
			i_271_ += i_274_;
			i_270_ += i_274_;
			i = 1;
		}
		if (i + i_269_ >= anInt1707) {
			int i_275_ = i + i_269_ + 1 - anInt1707;
			i_269_ -= i_275_;
			i_271_ += i_275_;
			i_270_ += i_275_;
		}
		if (i_269_ > 0 && i_268_ > 0) {
			method2394(aByteArray1711, class523_sub27_sub4_sub1.aByteArray12051, i_267_, i_266_, i_269_, i_268_, i_270_, i_271_);
			method2392(i, i_265_, i_269_, i_268_);
		}
	}

	boolean method2409(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_276_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_276_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_277_ = i + i_276_ * anInt1707;
		int i_278_ = class523_sub27_sub4_sub1.anInt12052;
		int i_279_ = class523_sub27_sub4_sub1.anInt12050;
		int i_280_ = anInt1707 - i_279_;
		if (i_276_ <= 0) {
			int i_281_ = 1 - i_276_;
			i_278_ -= i_281_;
			i_277_ += i_281_ * anInt1707;
			i_276_ = 1;
		}
		if (i_276_ + i_278_ >= anInt1708) {
			int i_282_ = i_276_ + i_278_ + 1 - anInt1708;
			i_278_ -= i_282_;
		}
		if (i <= 0) {
			int i_283_ = 1 - i;
			i_279_ -= i_283_;
			i_277_ += i_283_;
			i_280_ += i_283_;
			i = 1;
		}
		if (i + i_279_ >= anInt1707) {
			int i_284_ = i + i_279_ + 1 - anInt1707;
			i_279_ -= i_284_;
			i_280_ += i_284_;
		}
		if (i_279_ <= 0 || i_278_ <= 0)
			return false;
		int i_285_ = 8;
		i_280_ += (i_285_ - 1) * anInt1707;
		return method2396(aByteArray1711, i_277_, i_279_, i_278_, i_280_, i_285_);
	}

	boolean method2410(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_286_) {
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		i += class523_sub27_sub4_sub1.anInt12053 + 1;
		i_286_ += class523_sub27_sub4_sub1.anInt12054 + 1;
		int i_287_ = i + i_286_ * anInt1707;
		int i_288_ = class523_sub27_sub4_sub1.anInt12052;
		int i_289_ = class523_sub27_sub4_sub1.anInt12050;
		int i_290_ = anInt1707 - i_289_;
		if (i_286_ <= 0) {
			int i_291_ = 1 - i_286_;
			i_288_ -= i_291_;
			i_287_ += i_291_ * anInt1707;
			i_286_ = 1;
		}
		if (i_286_ + i_288_ >= anInt1708) {
			int i_292_ = i_286_ + i_288_ + 1 - anInt1708;
			i_288_ -= i_292_;
		}
		if (i <= 0) {
			int i_293_ = 1 - i;
			i_289_ -= i_293_;
			i_287_ += i_293_;
			i_290_ += i_293_;
			i = 1;
		}
		if (i + i_289_ >= anInt1707) {
			int i_294_ = i + i_289_ + 1 - anInt1707;
			i_289_ -= i_294_;
			i_290_ += i_294_;
		}
		if (i_289_ <= 0 || i_288_ <= 0)
			return false;
		int i_295_ = 8;
		i_290_ += (i_295_ - 1) * anInt1707;
		return method2396(aByteArray1711, i_287_, i_289_, i_288_, i_290_, i_295_);
	}

	static final void method2411(byte[] is, byte[] is_296_, int i, int i_297_, int i_298_, int i_299_, int i_300_, int i_301_) {
		int i_302_ = -(i_298_ >> 2);
		i_298_ = -(i_298_ & 0x3);
		for (int i_303_ = -i_299_; i_303_ < 0; i_303_++) {
			for (int i_304_ = i_302_; i_304_ < 0; i_304_++) {
				is[i_297_++] -= is_296_[i++];
				is[i_297_++] -= is_296_[i++];
				is[i_297_++] -= is_296_[i++];
				is[i_297_++] -= is_296_[i++];
			}
			for (int i_305_ = i_298_; i_305_ < 0; i_305_++)
				is[i_297_++] -= is_296_[i++];
			i_297_ += i_300_;
			i += i_301_;
		}
	}

	void method2412(int i, int i_306_, int i_307_, boolean[][] bools, boolean bool) {
		aClass178_Sub1_1709.method14682(false);
		aClass178_Sub1_1709.method14620(false);
		aClass178_Sub1_1709.method14670(-2);
		aClass178_Sub1_1709.method14785(1);
		aClass178_Sub1_1709.method14687(1);
		float f = 1.0F / (float) (aClass178_Sub1_1709.anInt9286 * 128);
		if (bool) {
			for (int i_308_ = 0; i_308_ < anInt1706; i_308_++) {
				int i_309_ = i_308_ << anInt1712;
				int i_310_ = i_308_ + 1 << anInt1712;
				for (int i_311_ = 0; i_311_ < anInt1710; i_311_++) {
					int i_312_ = i_311_ << anInt1712;
					int i_313_ = i_311_ + 1 << anInt1712;
					while_125_: for (int i_314_ = i_312_; i_314_ < i_313_; i_314_++) {
						if (i_314_ - i >= -i_307_ && i_314_ - i <= i_307_) {
							for (int i_315_ = i_309_; i_315_ < i_310_; i_315_++) {
								if (i_315_ - i_306_ >= -i_307_ && i_315_ - i_306_ <= i_307_ && (bools[i_314_ - i + i_307_][i_315_ - i_306_ + i_307_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_311_ / f, (float) -i_308_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									aClass122ArrayArray1713[i_311_][i_308_].method2095();
									break while_125_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_316_ = 0; i_316_ < anInt1706; i_316_++) {
				int i_317_ = i_316_ << anInt1712;
				int i_318_ = i_316_ + 1 << anInt1712;
				for (int i_319_ = 0; i_319_ < anInt1710; i_319_++) {
					int i_320_ = 0;
					int i_321_ = i_319_ << anInt1712;
					int i_322_ = i_319_ + 1 << anInt1712;
					Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_1709.aClass523_Sub34_Sub1_9321;
					class523_sub34_sub1.offset = 0;
					for (int i_323_ = i_317_; i_323_ < i_318_; i_323_++) {
						if (i_323_ - i_306_ >= -i_307_ && i_323_ - i_306_ <= i_307_) {
							int i_324_ = (i_323_ * (aClass142_Sub2_1705.anInt1683 * 692304099) + i_321_);
							for (int i_325_ = i_321_; i_325_ < i_322_; i_325_++) {
								if (i_325_ - i >= -i_307_ && i_325_ - i <= i_307_ && (bools[i_325_ - i + i_307_][i_323_ - i_306_ + i_307_])) {
									short[] is = (aClass142_Sub2_1705.aShortArrayArray9715[i_324_]);
									if (is != null) {
										if (aClass178_Sub1_1709.aBool9393) {
											for (int i_326_ = 0; i_326_ < is.length; i_326_++) {
												class523_sub34_sub1.writeShort(is[i_326_] & 0xffff, (byte) -111);
												i_320_++;
											}
										} else {
											for (int i_327_ = 0; i_327_ < is.length; i_327_++) {
												class523_sub34_sub1.method16262(is[i_327_] & 0xffff, -1355957067);
												i_320_++;
											}
										}
									}
								}
								i_324_++;
							}
						}
					}
					if (i_320_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_319_ / f, (float) -i_316_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						aClass122ArrayArray1713[i_319_][i_316_].method2097(class523_sub34_sub1.buffer, i_320_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method2413(int i, int i_328_, int i_329_, int i_330_) {
		if (aClass122ArrayArray1713 != null) {
			int i_331_ = i - 1 >> 7;
			int i_332_ = i - 1 + i_329_ - 1 >> 7;
			int i_333_ = i_328_ - 1 >> 7;
			int i_334_ = i_328_ - 1 + i_330_ - 1 >> 7;
			for (int i_335_ = i_331_; i_335_ <= i_332_; i_335_++) {
				Class122[] class122s = aClass122ArrayArray1713[i_335_];
				for (int i_336_ = i_333_; i_336_ <= i_334_; i_336_++)
					class122s[i_336_].aBool1500 = true;
			}
		}
	}

	static final boolean method2414(byte[] is, int i, int i_337_, int i_338_, int i_339_, int i_340_) {
		int i_341_ = i_337_ % i_340_;
		int i_342_;
		if (i_341_ != 0)
			i_342_ = i_340_ - i_341_;
		else
			i_342_ = 0;
		int i_343_ = -((i_338_ + i_340_ - 1) / i_340_);
		int i_344_ = -((i_337_ + i_340_ - 1) / i_340_);
		for (int i_345_ = i_343_; i_345_ < 0; i_345_++) {
			for (int i_346_ = i_344_; i_346_ < 0; i_346_++) {
				if (is[i] == 0)
					return true;
				i += i_340_;
			}
			i -= i_342_;
			if (is[i - 1] == 0)
				return true;
			i += i_339_;
		}
		return false;
	}

	static final void method2415(byte[] is, byte[] is_347_, int i, int i_348_, int i_349_, int i_350_, int i_351_, int i_352_) {
		int i_353_ = -(i_349_ >> 2);
		i_349_ = -(i_349_ & 0x3);
		for (int i_354_ = -i_350_; i_354_ < 0; i_354_++) {
			for (int i_355_ = i_353_; i_355_ < 0; i_355_++) {
				is[i_348_++] -= is_347_[i++];
				is[i_348_++] -= is_347_[i++];
				is[i_348_++] -= is_347_[i++];
				is[i_348_++] -= is_347_[i++];
			}
			for (int i_356_ = i_349_; i_356_ < 0; i_356_++)
				is[i_348_++] -= is_347_[i++];
			i_348_ += i_351_;
			i += i_352_;
		}
	}

	static final void method2416(byte[] is, byte[] is_357_, int i, int i_358_, int i_359_, int i_360_, int i_361_, int i_362_) {
		int i_363_ = -(i_359_ >> 2);
		i_359_ = -(i_359_ & 0x3);
		for (int i_364_ = -i_360_; i_364_ < 0; i_364_++) {
			for (int i_365_ = i_363_; i_365_ < 0; i_365_++) {
				is[i_358_++] -= is_357_[i++];
				is[i_358_++] -= is_357_[i++];
				is[i_358_++] -= is_357_[i++];
				is[i_358_++] -= is_357_[i++];
			}
			for (int i_366_ = i_359_; i_366_ < 0; i_366_++)
				is[i_358_++] -= is_357_[i++];
			i_358_ += i_361_;
			i += i_362_;
		}
	}

	Class147(Class178_Sub1 class178_sub1, Class142_Sub2 class142_sub2) {
		aClass178_Sub1_1709 = class178_sub1;
		aClass142_Sub2_1705 = class142_sub2;
		anInt1707 = 2 + ((aClass142_Sub2_1705.anInt1683 * 692304099 * (aClass142_Sub2_1705.anInt1682 * 341909049)) >> aClass178_Sub1_1709.anInt9287);
		anInt1708 = 2 + ((aClass142_Sub2_1705.anInt1681 * 452998539 * (aClass142_Sub2_1705.anInt1682 * 341909049)) >> aClass178_Sub1_1709.anInt9287);
		aByteArray1711 = new byte[anInt1707 * anInt1708];
		anInt1712 = (7 + aClass178_Sub1_1709.anInt9287 - aClass142_Sub2_1705.anInt1680 * -1193058675);
		anInt1710 = aClass142_Sub2_1705.anInt1683 * 692304099 >> anInt1712;
		anInt1706 = aClass142_Sub2_1705.anInt1681 * 452998539 >> anInt1712;
	}

	static final boolean method2417(byte[] is, int i, int i_367_, int i_368_, int i_369_, int i_370_) {
		int i_371_ = i_367_ % i_370_;
		int i_372_;
		if (i_371_ != 0)
			i_372_ = i_370_ - i_371_;
		else
			i_372_ = 0;
		int i_373_ = -((i_368_ + i_370_ - 1) / i_370_);
		int i_374_ = -((i_367_ + i_370_ - 1) / i_370_);
		for (int i_375_ = i_373_; i_375_ < 0; i_375_++) {
			for (int i_376_ = i_374_; i_376_ < 0; i_376_++) {
				if (is[i] == 0)
					return true;
				i += i_370_;
			}
			i -= i_372_;
			if (is[i - 1] == 0)
				return true;
			i += i_369_;
		}
		return false;
	}

	void method2418() {
		aClass122ArrayArray1713 = new Class122[anInt1710][anInt1706];
		for (int i = 0; i < anInt1706; i++) {
			for (int i_377_ = 0; i_377_ < anInt1710; i_377_++)
				aClass122ArrayArray1713[i_377_][i] = new Class122(aClass178_Sub1_1709, this, aClass142_Sub2_1705, i_377_, i, anInt1712, i_377_ * 128 + 1, i * 128 + 1);
		}
	}

	static final boolean method2419(byte[] is, int i, int i_378_, int i_379_, int i_380_, int i_381_) {
		int i_382_ = i_378_ % i_381_;
		int i_383_;
		if (i_382_ != 0)
			i_383_ = i_381_ - i_382_;
		else
			i_383_ = 0;
		int i_384_ = -((i_379_ + i_381_ - 1) / i_381_);
		int i_385_ = -((i_378_ + i_381_ - 1) / i_381_);
		for (int i_386_ = i_384_; i_386_ < 0; i_386_++) {
			for (int i_387_ = i_385_; i_387_ < 0; i_387_++) {
				if (is[i] == 0)
					return true;
				i += i_381_;
			}
			i -= i_383_;
			if (is[i - 1] == 0)
				return true;
			i += i_380_;
		}
		return false;
	}

	static final boolean method2420(byte[] is, int i, int i_388_, int i_389_, int i_390_, int i_391_) {
		int i_392_ = i_388_ % i_391_;
		int i_393_;
		if (i_392_ != 0)
			i_393_ = i_391_ - i_392_;
		else
			i_393_ = 0;
		int i_394_ = -((i_389_ + i_391_ - 1) / i_391_);
		int i_395_ = -((i_388_ + i_391_ - 1) / i_391_);
		for (int i_396_ = i_394_; i_396_ < 0; i_396_++) {
			for (int i_397_ = i_395_; i_397_ < 0; i_397_++) {
				if (is[i] == 0)
					return true;
				i += i_391_;
			}
			i -= i_393_;
			if (is[i - 1] == 0)
				return true;
			i += i_390_;
		}
		return false;
	}

	static final boolean method2421(byte[] is, int i, int i_398_, int i_399_, int i_400_, int i_401_) {
		int i_402_ = i_398_ % i_401_;
		int i_403_;
		if (i_402_ != 0)
			i_403_ = i_401_ - i_402_;
		else
			i_403_ = 0;
		int i_404_ = -((i_399_ + i_401_ - 1) / i_401_);
		int i_405_ = -((i_398_ + i_401_ - 1) / i_401_);
		for (int i_406_ = i_404_; i_406_ < 0; i_406_++) {
			for (int i_407_ = i_405_; i_407_ < 0; i_407_++) {
				if (is[i] == 0)
					return true;
				i += i_401_;
			}
			i -= i_403_;
			if (is[i - 1] == 0)
				return true;
			i += i_400_;
		}
		return false;
	}

	void method2422() {
		aClass122ArrayArray1713 = new Class122[anInt1710][anInt1706];
		for (int i = 0; i < anInt1706; i++) {
			for (int i_408_ = 0; i_408_ < anInt1710; i_408_++)
				aClass122ArrayArray1713[i_408_][i] = new Class122(aClass178_Sub1_1709, this, aClass142_Sub2_1705, i_408_, i, anInt1712, i_408_ * 128 + 1, i * 128 + 1);
		}
	}
}
