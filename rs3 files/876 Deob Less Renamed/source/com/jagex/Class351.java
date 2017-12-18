/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class351 {
	int anInt3642;
	Class142_Sub1 aClass142_Sub1_3643;
	int anInt3644;
	Class178_Sub2 aClass178_Sub2_3645;
	int anInt3646;
	byte[] aByteArray3647;
	int anInt3648;
	int anInt3649;
	Class339[][] aClass339ArrayArray3650;

	static final void method6156(byte[] is, byte[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		int i_6_ = -(i_2_ >> 2);
		i_2_ = -(i_2_ & 0x3);
		for (int i_7_ = -i_3_; i_7_ < 0; i_7_++) {
			for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
				is[i_1_++] += is_0_[i++];
				is[i_1_++] += is_0_[i++];
				is[i_1_++] += is_0_[i++];
				is[i_1_++] += is_0_[i++];
			}
			for (int i_9_ = i_2_; i_9_ < 0; i_9_++)
				is[i_1_++] += is_0_[i++];
			i_1_ += i_4_;
			i += i_5_;
		}
	}

	boolean method6157(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_10_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_10_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_11_ = i + i_10_ * anInt3642;
		int i_12_ = class523_sub27_sub4_sub2.anInt12088;
		int i_13_ = class523_sub27_sub4_sub2.anInt12086;
		int i_14_ = anInt3642 - i_13_;
		if (i_10_ <= 0) {
			int i_15_ = 1 - i_10_;
			i_12_ -= i_15_;
			i_11_ += i_15_ * anInt3642;
			i_10_ = 1;
		}
		if (i_10_ + i_12_ >= anInt3644) {
			int i_16_ = i_10_ + i_12_ + 1 - anInt3644;
			i_12_ -= i_16_;
		}
		if (i <= 0) {
			int i_17_ = 1 - i;
			i_13_ -= i_17_;
			i_11_ += i_17_;
			i_14_ += i_17_;
			i = 1;
		}
		if (i + i_13_ >= anInt3642) {
			int i_18_ = i + i_13_ + 1 - anInt3642;
			i_13_ -= i_18_;
			i_14_ += i_18_;
		}
		if (i_13_ <= 0 || i_12_ <= 0)
			return false;
		int i_19_ = 8;
		i_14_ += (i_19_ - 1) * anInt3642;
		return method6166(aByteArray3647, i_11_, i_13_, i_12_, i_14_, i_19_);
	}

	void method6158(Class329 class329, int i, int i_20_, int i_21_, boolean[][] bools, boolean bool) {
		aClass178_Sub2_3645.method3287(false);
		float f = 1.0F / (float) (aClass178_Sub2_3645.anInt9607 * 128);
		if (bool) {
			for (int i_22_ = 0; i_22_ < anInt3648; i_22_++) {
				int i_23_ = i_22_ << anInt3649;
				int i_24_ = i_22_ + 1 << anInt3649;
				for (int i_25_ = 0; i_25_ < anInt3646; i_25_++) {
					if (aClass339ArrayArray3650[i_25_][i_22_] != null) {
						int i_26_ = i_25_ << anInt3649;
						int i_27_ = i_25_ + 1 << anInt3649;
						while_27_: for (int i_28_ = i_26_; i_28_ < i_27_; i_28_++) {
							if (i_28_ - i >= -i_21_ && i_28_ - i <= i_21_) {
								for (int i_29_ = i_23_; i_29_ < i_24_; i_29_++) {
									if (i_29_ - i_20_ >= -i_21_ && i_29_ - i_20_ <= i_21_ && (bools[i_28_ - i + i_21_][i_29_ - i_20_ + i_21_])) {
										class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
										class329.aClass441_3480.aFloatArray4916[12] = (float) -i_25_;
										class329.aClass441_3480.aFloatArray4916[13] = (float) -i_22_;
										aClass339ArrayArray3650[i_25_][i_22_].method5946(class329);
										break while_27_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3648 * anInt3646];
			ByteBuffer bytebuffer = aClass178_Sub2_3645.aByteBuffer9539;
			bytebuffer.clear();
			int i_30_ = 0;
			for (int i_31_ = 0; i_31_ < anInt3648; i_31_++) {
				int i_32_ = i_31_ << anInt3649;
				int i_33_ = i_31_ + 1 << anInt3649;
				for (int i_34_ = 0; i_34_ < anInt3646; i_34_++) {
					Class339 class339 = aClass339ArrayArray3650[i_34_][i_31_];
					int i_35_ = 0;
					if (class339 != null) {
						int i_36_ = i_34_ << anInt3649;
						int i_37_ = i_34_ + 1 << anInt3649;
						for (int i_38_ = i_32_; i_38_ < i_33_; i_38_++) {
							if (i_38_ - i_20_ >= -i_21_ && i_38_ - i_20_ <= i_21_) {
								int i_39_ = (i_38_ * (aClass142_Sub1_3643.anInt1683 * 692304099) + i_36_);
								for (int i_40_ = i_36_; i_40_ < i_37_; i_40_++) {
									if (i_40_ - i >= -i_21_ && i_40_ - i <= i_21_ && (bools[i_40_ - i + i_21_][i_38_ - i_20_ + i_21_])) {
										short[] is_41_ = (aClass142_Sub1_3643.aShortArrayArray9006[i_39_]);
										if (is_41_ != null) {
											for (int i_42_ = 0; i_42_ < is_41_.length; i_42_++) {
												bytebuffer.putShort(is_41_[i_42_]);
												i_35_++;
											}
										}
									}
									i_39_++;
								}
							}
						}
					}
					is[i_30_] = i_35_;
					i_30_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_43_ = bytebuffer.position();
				Interface40 interface40 = aClass178_Sub2_3645.method14951(i_43_ / 2);
				interface40.method265(0, i_43_, aClass178_Sub2_3645.aLong9540);
				int i_44_ = 0;
				i_30_ = 0;
				for (int i_45_ = 0; i_45_ < anInt3648; i_45_++) {
					for (int i_46_ = 0; i_46_ < anInt3646; i_46_++) {
						if (is[i_30_] != 0) {
							class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
							class329.aClass441_3480.aFloatArray4916[12] = (float) -i_46_;
							class329.aClass441_3480.aFloatArray4916[13] = (float) -i_45_;
							aClass339ArrayArray3650[i_46_][i_45_].method5947(class329, interface40, i_44_, is[i_30_] / 3);
							i_44_ += is[i_30_];
						}
						i_30_++;
					}
				}
			}
		}
		aClass178_Sub2_3645.method3287(true);
	}

	void method6159(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_47_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_47_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_48_ = i + i_47_ * anInt3642;
		int i_49_ = 0;
		int i_50_ = class523_sub27_sub4_sub2.anInt12088;
		int i_51_ = class523_sub27_sub4_sub2.anInt12086;
		int i_52_ = anInt3642 - i_51_;
		int i_53_ = 0;
		if (i_47_ <= 0) {
			int i_54_ = 1 - i_47_;
			i_50_ -= i_54_;
			i_49_ += i_54_ * i_51_;
			i_48_ += i_54_ * anInt3642;
			i_47_ = 1;
		}
		if (i_47_ + i_50_ >= anInt3644) {
			int i_55_ = i_47_ + i_50_ + 1 - anInt3644;
			i_50_ -= i_55_;
		}
		if (i <= 0) {
			int i_56_ = 1 - i;
			i_51_ -= i_56_;
			i_49_ += i_56_;
			i_48_ += i_56_;
			i_53_ += i_56_;
			i_52_ += i_56_;
			i = 1;
		}
		if (i + i_51_ >= anInt3642) {
			int i_57_ = i + i_51_ + 1 - anInt3642;
			i_51_ -= i_57_;
			i_53_ += i_57_;
			i_52_ += i_57_;
		}
		if (i_51_ > 0 && i_50_ > 0) {
			method6161(aByteArray3647, class523_sub27_sub4_sub2.aByteArray12087, i_49_, i_48_, i_51_, i_50_, i_52_, i_53_);
			method6162(i, i_47_, i_51_, i_50_);
		}
	}

	void method6160(int i, int i_58_, int i_59_, int i_60_) {
		if (aClass339ArrayArray3650 != null) {
			int i_61_ = i - 1 >> 7;
			int i_62_ = i - 1 + i_59_ - 1 >> 7;
			int i_63_ = i_58_ - 1 >> 7;
			int i_64_ = i_58_ - 1 + i_60_ - 1 >> 7;
			for (int i_65_ = i_61_; i_65_ <= i_62_; i_65_++) {
				Class339[] class339s = aClass339ArrayArray3650[i_65_];
				for (int i_66_ = i_63_; i_66_ <= i_64_; i_66_++) {
					if (class339s[i_66_] != null)
						class339s[i_66_].aBool3581 = true;
				}
			}
		}
	}

	static final void method6161(byte[] is, byte[] is_67_, int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
		int i_73_ = -(i_69_ >> 2);
		i_69_ = -(i_69_ & 0x3);
		for (int i_74_ = -i_70_; i_74_ < 0; i_74_++) {
			for (int i_75_ = i_73_; i_75_ < 0; i_75_++) {
				is[i_68_++] += is_67_[i++];
				is[i_68_++] += is_67_[i++];
				is[i_68_++] += is_67_[i++];
				is[i_68_++] += is_67_[i++];
			}
			for (int i_76_ = i_69_; i_76_ < 0; i_76_++)
				is[i_68_++] += is_67_[i++];
			i_68_ += i_71_;
			i += i_72_;
		}
	}

	void method6162(int i, int i_77_, int i_78_, int i_79_) {
		if (aClass339ArrayArray3650 != null) {
			int i_80_ = i - 1 >> 7;
			int i_81_ = i - 1 + i_78_ - 1 >> 7;
			int i_82_ = i_77_ - 1 >> 7;
			int i_83_ = i_77_ - 1 + i_79_ - 1 >> 7;
			for (int i_84_ = i_80_; i_84_ <= i_81_; i_84_++) {
				Class339[] class339s = aClass339ArrayArray3650[i_84_];
				for (int i_85_ = i_82_; i_85_ <= i_83_; i_85_++) {
					if (class339s[i_85_] != null)
						class339s[i_85_].aBool3581 = true;
				}
			}
		}
	}

	void method6163() {
		aClass339ArrayArray3650 = new Class339[anInt3646][anInt3648];
		for (int i = 0; i < anInt3648; i++) {
			for (int i_86_ = 0; i_86_ < anInt3646; i_86_++) {
				aClass339ArrayArray3650[i_86_][i] = new Class339(aClass178_Sub2_3645, this, aClass142_Sub1_3643, i_86_, i, anInt3649, i_86_ * 128 + 1, i * 128 + 1);
				if (aClass339ArrayArray3650[i_86_][i].anInt3583 == 0)
					aClass339ArrayArray3650[i_86_][i] = null;
			}
		}
	}

	void method6164() {
		aClass339ArrayArray3650 = new Class339[anInt3646][anInt3648];
		for (int i = 0; i < anInt3648; i++) {
			for (int i_87_ = 0; i_87_ < anInt3646; i_87_++) {
				aClass339ArrayArray3650[i_87_][i] = new Class339(aClass178_Sub2_3645, this, aClass142_Sub1_3643, i_87_, i, anInt3649, i_87_ * 128 + 1, i * 128 + 1);
				if (aClass339ArrayArray3650[i_87_][i].anInt3583 == 0)
					aClass339ArrayArray3650[i_87_][i] = null;
			}
		}
	}

	void method6165(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_88_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_88_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_89_ = i + i_88_ * anInt3642;
		int i_90_ = 0;
		int i_91_ = class523_sub27_sub4_sub2.anInt12088;
		int i_92_ = class523_sub27_sub4_sub2.anInt12086;
		int i_93_ = anInt3642 - i_92_;
		int i_94_ = 0;
		if (i_88_ <= 0) {
			int i_95_ = 1 - i_88_;
			i_91_ -= i_95_;
			i_90_ += i_95_ * i_92_;
			i_89_ += i_95_ * anInt3642;
			i_88_ = 1;
		}
		if (i_88_ + i_91_ >= anInt3644) {
			int i_96_ = i_88_ + i_91_ + 1 - anInt3644;
			i_91_ -= i_96_;
		}
		if (i <= 0) {
			int i_97_ = 1 - i;
			i_92_ -= i_97_;
			i_90_ += i_97_;
			i_89_ += i_97_;
			i_94_ += i_97_;
			i_93_ += i_97_;
			i = 1;
		}
		if (i + i_92_ >= anInt3642) {
			int i_98_ = i + i_92_ + 1 - anInt3642;
			i_92_ -= i_98_;
			i_94_ += i_98_;
			i_93_ += i_98_;
		}
		if (i_92_ > 0 && i_91_ > 0) {
			method6170(aByteArray3647, class523_sub27_sub4_sub2.aByteArray12087, i_90_, i_89_, i_92_, i_91_, i_93_, i_94_);
			method6162(i, i_88_, i_92_, i_91_);
		}
	}

	static final boolean method6166(byte[] is, int i, int i_99_, int i_100_, int i_101_, int i_102_) {
		int i_103_ = i_99_ % i_102_;
		int i_104_;
		if (i_103_ != 0)
			i_104_ = i_102_ - i_103_;
		else
			i_104_ = 0;
		int i_105_ = -((i_100_ + i_102_ - 1) / i_102_);
		int i_106_ = -((i_99_ + i_102_ - 1) / i_102_);
		for (int i_107_ = i_105_; i_107_ < 0; i_107_++) {
			for (int i_108_ = i_106_; i_108_ < 0; i_108_++) {
				if (is[i] == 0)
					return true;
				i += i_102_;
			}
			i -= i_104_;
			if (is[i - 1] == 0)
				return true;
			i += i_101_;
		}
		return false;
	}

	void method6167(Class329 class329, int i, int i_109_, int i_110_, boolean[][] bools, boolean bool) {
		aClass178_Sub2_3645.method3287(false);
		float f = 1.0F / (float) (aClass178_Sub2_3645.anInt9607 * 128);
		if (bool) {
			for (int i_111_ = 0; i_111_ < anInt3648; i_111_++) {
				int i_112_ = i_111_ << anInt3649;
				int i_113_ = i_111_ + 1 << anInt3649;
				for (int i_114_ = 0; i_114_ < anInt3646; i_114_++) {
					if (aClass339ArrayArray3650[i_114_][i_111_] != null) {
						int i_115_ = i_114_ << anInt3649;
						int i_116_ = i_114_ + 1 << anInt3649;
						while_28_: for (int i_117_ = i_115_; i_117_ < i_116_; i_117_++) {
							if (i_117_ - i >= -i_110_ && i_117_ - i <= i_110_) {
								for (int i_118_ = i_112_; i_118_ < i_113_; i_118_++) {
									if (i_118_ - i_109_ >= -i_110_ && i_118_ - i_109_ <= i_110_ && (bools[i_117_ - i + i_110_][i_118_ - i_109_ + i_110_])) {
										class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
										class329.aClass441_3480.aFloatArray4916[12] = (float) -i_114_;
										class329.aClass441_3480.aFloatArray4916[13] = (float) -i_111_;
										aClass339ArrayArray3650[i_114_][i_111_].method5946(class329);
										break while_28_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3648 * anInt3646];
			ByteBuffer bytebuffer = aClass178_Sub2_3645.aByteBuffer9539;
			bytebuffer.clear();
			int i_119_ = 0;
			for (int i_120_ = 0; i_120_ < anInt3648; i_120_++) {
				int i_121_ = i_120_ << anInt3649;
				int i_122_ = i_120_ + 1 << anInt3649;
				for (int i_123_ = 0; i_123_ < anInt3646; i_123_++) {
					Class339 class339 = aClass339ArrayArray3650[i_123_][i_120_];
					int i_124_ = 0;
					if (class339 != null) {
						int i_125_ = i_123_ << anInt3649;
						int i_126_ = i_123_ + 1 << anInt3649;
						for (int i_127_ = i_121_; i_127_ < i_122_; i_127_++) {
							if (i_127_ - i_109_ >= -i_110_ && i_127_ - i_109_ <= i_110_) {
								int i_128_ = (i_127_ * (aClass142_Sub1_3643.anInt1683 * 692304099) + i_125_);
								for (int i_129_ = i_125_; i_129_ < i_126_; i_129_++) {
									if (i_129_ - i >= -i_110_ && i_129_ - i <= i_110_ && (bools[i_129_ - i + i_110_][i_127_ - i_109_ + i_110_])) {
										short[] is_130_ = (aClass142_Sub1_3643.aShortArrayArray9006[i_128_]);
										if (is_130_ != null) {
											for (int i_131_ = 0; i_131_ < is_130_.length; i_131_++) {
												bytebuffer.putShort(is_130_[i_131_]);
												i_124_++;
											}
										}
									}
									i_128_++;
								}
							}
						}
					}
					is[i_119_] = i_124_;
					i_119_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_132_ = bytebuffer.position();
				Interface40 interface40 = aClass178_Sub2_3645.method14951(i_132_ / 2);
				interface40.method265(0, i_132_, aClass178_Sub2_3645.aLong9540);
				int i_133_ = 0;
				i_119_ = 0;
				for (int i_134_ = 0; i_134_ < anInt3648; i_134_++) {
					for (int i_135_ = 0; i_135_ < anInt3646; i_135_++) {
						if (is[i_119_] != 0) {
							class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
							class329.aClass441_3480.aFloatArray4916[12] = (float) -i_135_;
							class329.aClass441_3480.aFloatArray4916[13] = (float) -i_134_;
							aClass339ArrayArray3650[i_135_][i_134_].method5947(class329, interface40, i_133_, is[i_119_] / 3);
							i_133_ += is[i_119_];
						}
						i_119_++;
					}
				}
			}
		}
		aClass178_Sub2_3645.method3287(true);
	}

	void method6168(Class329 class329, int i, int i_136_, int i_137_, boolean[][] bools, boolean bool) {
		aClass178_Sub2_3645.method3287(false);
		float f = 1.0F / (float) (aClass178_Sub2_3645.anInt9607 * 128);
		if (bool) {
			for (int i_138_ = 0; i_138_ < anInt3648; i_138_++) {
				int i_139_ = i_138_ << anInt3649;
				int i_140_ = i_138_ + 1 << anInt3649;
				for (int i_141_ = 0; i_141_ < anInt3646; i_141_++) {
					if (aClass339ArrayArray3650[i_141_][i_138_] != null) {
						int i_142_ = i_141_ << anInt3649;
						int i_143_ = i_141_ + 1 << anInt3649;
						while_29_: for (int i_144_ = i_142_; i_144_ < i_143_; i_144_++) {
							if (i_144_ - i >= -i_137_ && i_144_ - i <= i_137_) {
								for (int i_145_ = i_139_; i_145_ < i_140_; i_145_++) {
									if (i_145_ - i_136_ >= -i_137_ && i_145_ - i_136_ <= i_137_ && (bools[i_144_ - i + i_137_][i_145_ - i_136_ + i_137_])) {
										class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
										class329.aClass441_3480.aFloatArray4916[12] = (float) -i_141_;
										class329.aClass441_3480.aFloatArray4916[13] = (float) -i_138_;
										aClass339ArrayArray3650[i_141_][i_138_].method5946(class329);
										break while_29_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3648 * anInt3646];
			ByteBuffer bytebuffer = aClass178_Sub2_3645.aByteBuffer9539;
			bytebuffer.clear();
			int i_146_ = 0;
			for (int i_147_ = 0; i_147_ < anInt3648; i_147_++) {
				int i_148_ = i_147_ << anInt3649;
				int i_149_ = i_147_ + 1 << anInt3649;
				for (int i_150_ = 0; i_150_ < anInt3646; i_150_++) {
					Class339 class339 = aClass339ArrayArray3650[i_150_][i_147_];
					int i_151_ = 0;
					if (class339 != null) {
						int i_152_ = i_150_ << anInt3649;
						int i_153_ = i_150_ + 1 << anInt3649;
						for (int i_154_ = i_148_; i_154_ < i_149_; i_154_++) {
							if (i_154_ - i_136_ >= -i_137_ && i_154_ - i_136_ <= i_137_) {
								int i_155_ = (i_154_ * (aClass142_Sub1_3643.anInt1683 * 692304099) + i_152_);
								for (int i_156_ = i_152_; i_156_ < i_153_; i_156_++) {
									if (i_156_ - i >= -i_137_ && i_156_ - i <= i_137_ && (bools[i_156_ - i + i_137_][i_154_ - i_136_ + i_137_])) {
										short[] is_157_ = (aClass142_Sub1_3643.aShortArrayArray9006[i_155_]);
										if (is_157_ != null) {
											for (int i_158_ = 0; i_158_ < is_157_.length; i_158_++) {
												bytebuffer.putShort(is_157_[i_158_]);
												i_151_++;
											}
										}
									}
									i_155_++;
								}
							}
						}
					}
					is[i_146_] = i_151_;
					i_146_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_159_ = bytebuffer.position();
				Interface40 interface40 = aClass178_Sub2_3645.method14951(i_159_ / 2);
				interface40.method265(0, i_159_, aClass178_Sub2_3645.aLong9540);
				int i_160_ = 0;
				i_146_ = 0;
				for (int i_161_ = 0; i_161_ < anInt3648; i_161_++) {
					for (int i_162_ = 0; i_162_ < anInt3646; i_162_++) {
						if (is[i_146_] != 0) {
							class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
							class329.aClass441_3480.aFloatArray4916[12] = (float) -i_162_;
							class329.aClass441_3480.aFloatArray4916[13] = (float) -i_161_;
							aClass339ArrayArray3650[i_162_][i_161_].method5947(class329, interface40, i_160_, is[i_146_] / 3);
							i_160_ += is[i_146_];
						}
						i_146_++;
					}
				}
			}
		}
		aClass178_Sub2_3645.method3287(true);
	}

	void method6169(Class329 class329, int i, int i_163_, int i_164_, boolean[][] bools, boolean bool) {
		aClass178_Sub2_3645.method3287(false);
		float f = 1.0F / (float) (aClass178_Sub2_3645.anInt9607 * 128);
		if (bool) {
			for (int i_165_ = 0; i_165_ < anInt3648; i_165_++) {
				int i_166_ = i_165_ << anInt3649;
				int i_167_ = i_165_ + 1 << anInt3649;
				for (int i_168_ = 0; i_168_ < anInt3646; i_168_++) {
					if (aClass339ArrayArray3650[i_168_][i_165_] != null) {
						int i_169_ = i_168_ << anInt3649;
						int i_170_ = i_168_ + 1 << anInt3649;
						while_30_: for (int i_171_ = i_169_; i_171_ < i_170_; i_171_++) {
							if (i_171_ - i >= -i_164_ && i_171_ - i <= i_164_) {
								for (int i_172_ = i_166_; i_172_ < i_167_; i_172_++) {
									if (i_172_ - i_163_ >= -i_164_ && i_172_ - i_163_ <= i_164_ && (bools[i_171_ - i + i_164_][i_172_ - i_163_ + i_164_])) {
										class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
										class329.aClass441_3480.aFloatArray4916[12] = (float) -i_168_;
										class329.aClass441_3480.aFloatArray4916[13] = (float) -i_165_;
										aClass339ArrayArray3650[i_168_][i_165_].method5946(class329);
										break while_30_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3648 * anInt3646];
			ByteBuffer bytebuffer = aClass178_Sub2_3645.aByteBuffer9539;
			bytebuffer.clear();
			int i_173_ = 0;
			for (int i_174_ = 0; i_174_ < anInt3648; i_174_++) {
				int i_175_ = i_174_ << anInt3649;
				int i_176_ = i_174_ + 1 << anInt3649;
				for (int i_177_ = 0; i_177_ < anInt3646; i_177_++) {
					Class339 class339 = aClass339ArrayArray3650[i_177_][i_174_];
					int i_178_ = 0;
					if (class339 != null) {
						int i_179_ = i_177_ << anInt3649;
						int i_180_ = i_177_ + 1 << anInt3649;
						for (int i_181_ = i_175_; i_181_ < i_176_; i_181_++) {
							if (i_181_ - i_163_ >= -i_164_ && i_181_ - i_163_ <= i_164_) {
								int i_182_ = (i_181_ * (aClass142_Sub1_3643.anInt1683 * 692304099) + i_179_);
								for (int i_183_ = i_179_; i_183_ < i_180_; i_183_++) {
									if (i_183_ - i >= -i_164_ && i_183_ - i <= i_164_ && (bools[i_183_ - i + i_164_][i_181_ - i_163_ + i_164_])) {
										short[] is_184_ = (aClass142_Sub1_3643.aShortArrayArray9006[i_182_]);
										if (is_184_ != null) {
											for (int i_185_ = 0; i_185_ < is_184_.length; i_185_++) {
												bytebuffer.putShort(is_184_[i_185_]);
												i_178_++;
											}
										}
									}
									i_182_++;
								}
							}
						}
					}
					is[i_173_] = i_178_;
					i_173_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_186_ = bytebuffer.position();
				Interface40 interface40 = aClass178_Sub2_3645.method14951(i_186_ / 2);
				interface40.method265(0, i_186_, aClass178_Sub2_3645.aLong9540);
				int i_187_ = 0;
				i_173_ = 0;
				for (int i_188_ = 0; i_188_ < anInt3648; i_188_++) {
					for (int i_189_ = 0; i_189_ < anInt3646; i_189_++) {
						if (is[i_173_] != 0) {
							class329.aClass441_3480.method7093(f, f, 1.0F, 1.0F);
							class329.aClass441_3480.aFloatArray4916[12] = (float) -i_189_;
							class329.aClass441_3480.aFloatArray4916[13] = (float) -i_188_;
							aClass339ArrayArray3650[i_189_][i_188_].method5947(class329, interface40, i_187_, is[i_173_] / 3);
							i_187_ += is[i_173_];
						}
						i_173_++;
					}
				}
			}
		}
		aClass178_Sub2_3645.method3287(true);
	}

	static final void method6170(byte[] is, byte[] is_190_, int i, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_) {
		int i_196_ = -(i_192_ >> 2);
		i_192_ = -(i_192_ & 0x3);
		for (int i_197_ = -i_193_; i_197_ < 0; i_197_++) {
			for (int i_198_ = i_196_; i_198_ < 0; i_198_++) {
				is[i_191_++] -= is_190_[i++];
				is[i_191_++] -= is_190_[i++];
				is[i_191_++] -= is_190_[i++];
				is[i_191_++] -= is_190_[i++];
			}
			for (int i_199_ = i_192_; i_199_ < 0; i_199_++)
				is[i_191_++] -= is_190_[i++];
			i_191_ += i_194_;
			i += i_195_;
		}
	}

	void method6171(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_200_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_200_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_201_ = i + i_200_ * anInt3642;
		int i_202_ = 0;
		int i_203_ = class523_sub27_sub4_sub2.anInt12088;
		int i_204_ = class523_sub27_sub4_sub2.anInt12086;
		int i_205_ = anInt3642 - i_204_;
		int i_206_ = 0;
		if (i_200_ <= 0) {
			int i_207_ = 1 - i_200_;
			i_203_ -= i_207_;
			i_202_ += i_207_ * i_204_;
			i_201_ += i_207_ * anInt3642;
			i_200_ = 1;
		}
		if (i_200_ + i_203_ >= anInt3644) {
			int i_208_ = i_200_ + i_203_ + 1 - anInt3644;
			i_203_ -= i_208_;
		}
		if (i <= 0) {
			int i_209_ = 1 - i;
			i_204_ -= i_209_;
			i_202_ += i_209_;
			i_201_ += i_209_;
			i_206_ += i_209_;
			i_205_ += i_209_;
			i = 1;
		}
		if (i + i_204_ >= anInt3642) {
			int i_210_ = i + i_204_ + 1 - anInt3642;
			i_204_ -= i_210_;
			i_206_ += i_210_;
			i_205_ += i_210_;
		}
		if (i_204_ > 0 && i_203_ > 0) {
			method6161(aByteArray3647, class523_sub27_sub4_sub2.aByteArray12087, i_202_, i_201_, i_204_, i_203_, i_205_, i_206_);
			method6162(i, i_200_, i_204_, i_203_);
		}
	}

	void method6172(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_211_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_211_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_212_ = i + i_211_ * anInt3642;
		int i_213_ = 0;
		int i_214_ = class523_sub27_sub4_sub2.anInt12088;
		int i_215_ = class523_sub27_sub4_sub2.anInt12086;
		int i_216_ = anInt3642 - i_215_;
		int i_217_ = 0;
		if (i_211_ <= 0) {
			int i_218_ = 1 - i_211_;
			i_214_ -= i_218_;
			i_213_ += i_218_ * i_215_;
			i_212_ += i_218_ * anInt3642;
			i_211_ = 1;
		}
		if (i_211_ + i_214_ >= anInt3644) {
			int i_219_ = i_211_ + i_214_ + 1 - anInt3644;
			i_214_ -= i_219_;
		}
		if (i <= 0) {
			int i_220_ = 1 - i;
			i_215_ -= i_220_;
			i_213_ += i_220_;
			i_212_ += i_220_;
			i_217_ += i_220_;
			i_216_ += i_220_;
			i = 1;
		}
		if (i + i_215_ >= anInt3642) {
			int i_221_ = i + i_215_ + 1 - anInt3642;
			i_215_ -= i_221_;
			i_217_ += i_221_;
			i_216_ += i_221_;
		}
		if (i_215_ > 0 && i_214_ > 0) {
			method6170(aByteArray3647, class523_sub27_sub4_sub2.aByteArray12087, i_213_, i_212_, i_215_, i_214_, i_216_, i_217_);
			method6162(i, i_211_, i_215_, i_214_);
		}
	}

	boolean method6173(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_222_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_222_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_223_ = i + i_222_ * anInt3642;
		int i_224_ = class523_sub27_sub4_sub2.anInt12088;
		int i_225_ = class523_sub27_sub4_sub2.anInt12086;
		int i_226_ = anInt3642 - i_225_;
		if (i_222_ <= 0) {
			int i_227_ = 1 - i_222_;
			i_224_ -= i_227_;
			i_223_ += i_227_ * anInt3642;
			i_222_ = 1;
		}
		if (i_222_ + i_224_ >= anInt3644) {
			int i_228_ = i_222_ + i_224_ + 1 - anInt3644;
			i_224_ -= i_228_;
		}
		if (i <= 0) {
			int i_229_ = 1 - i;
			i_225_ -= i_229_;
			i_223_ += i_229_;
			i_226_ += i_229_;
			i = 1;
		}
		if (i + i_225_ >= anInt3642) {
			int i_230_ = i + i_225_ + 1 - anInt3642;
			i_225_ -= i_230_;
			i_226_ += i_230_;
		}
		if (i_225_ <= 0 || i_224_ <= 0)
			return false;
		int i_231_ = 8;
		i_226_ += (i_231_ - 1) * anInt3642;
		return method6166(aByteArray3647, i_223_, i_225_, i_224_, i_226_, i_231_);
	}

	void method6174(int i, int i_232_, int i_233_, int i_234_) {
		if (aClass339ArrayArray3650 != null) {
			int i_235_ = i - 1 >> 7;
			int i_236_ = i - 1 + i_233_ - 1 >> 7;
			int i_237_ = i_232_ - 1 >> 7;
			int i_238_ = i_232_ - 1 + i_234_ - 1 >> 7;
			for (int i_239_ = i_235_; i_239_ <= i_236_; i_239_++) {
				Class339[] class339s = aClass339ArrayArray3650[i_239_];
				for (int i_240_ = i_237_; i_240_ <= i_238_; i_240_++) {
					if (class339s[i_240_] != null)
						class339s[i_240_].aBool3581 = true;
				}
			}
		}
	}

	Class351(Class178_Sub2 class178_sub2, Class142_Sub1 class142_sub1) {
		aClass178_Sub2_3645 = class178_sub2;
		aClass142_Sub1_3643 = class142_sub1;
		anInt3642 = 2 + ((aClass142_Sub1_3643.anInt1683 * 692304099 * (aClass142_Sub1_3643.anInt1682 * 341909049)) >> aClass178_Sub2_3645.anInt9623);
		anInt3644 = 2 + ((aClass142_Sub1_3643.anInt1681 * 452998539 * (aClass142_Sub1_3643.anInt1682 * 341909049)) >> aClass178_Sub2_3645.anInt9623);
		aByteArray3647 = new byte[anInt3642 * anInt3644];
		anInt3649 = (7 + aClass178_Sub2_3645.anInt9623 - aClass142_Sub1_3643.anInt1680 * -1193058675);
		anInt3646 = aClass142_Sub1_3643.anInt1683 * 692304099 >> anInt3649;
		anInt3648 = aClass142_Sub1_3643.anInt1681 * 452998539 >> anInt3649;
	}

	void method6175(int i, int i_241_, int i_242_, int i_243_) {
		if (aClass339ArrayArray3650 != null) {
			int i_244_ = i - 1 >> 7;
			int i_245_ = i - 1 + i_242_ - 1 >> 7;
			int i_246_ = i_241_ - 1 >> 7;
			int i_247_ = i_241_ - 1 + i_243_ - 1 >> 7;
			for (int i_248_ = i_244_; i_248_ <= i_245_; i_248_++) {
				Class339[] class339s = aClass339ArrayArray3650[i_248_];
				for (int i_249_ = i_246_; i_249_ <= i_247_; i_249_++) {
					if (class339s[i_249_] != null)
						class339s[i_249_].aBool3581 = true;
				}
			}
		}
	}

	static final void method6176(byte[] is, byte[] is_250_, int i, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_) {
		int i_256_ = -(i_252_ >> 2);
		i_252_ = -(i_252_ & 0x3);
		for (int i_257_ = -i_253_; i_257_ < 0; i_257_++) {
			for (int i_258_ = i_256_; i_258_ < 0; i_258_++) {
				is[i_251_++] += is_250_[i++];
				is[i_251_++] += is_250_[i++];
				is[i_251_++] += is_250_[i++];
				is[i_251_++] += is_250_[i++];
			}
			for (int i_259_ = i_252_; i_259_ < 0; i_259_++)
				is[i_251_++] += is_250_[i++];
			i_251_ += i_254_;
			i += i_255_;
		}
	}

	void method6177(Class523_Sub27_Sub4 class523_sub27_sub4, int i, int i_260_) {
		Class523_Sub27_Sub4_Sub2 class523_sub27_sub4_sub2 = (Class523_Sub27_Sub4_Sub2) class523_sub27_sub4;
		i += class523_sub27_sub4_sub2.anInt12089 + 1;
		i_260_ += class523_sub27_sub4_sub2.anInt12090 + 1;
		int i_261_ = i + i_260_ * anInt3642;
		int i_262_ = 0;
		int i_263_ = class523_sub27_sub4_sub2.anInt12088;
		int i_264_ = class523_sub27_sub4_sub2.anInt12086;
		int i_265_ = anInt3642 - i_264_;
		int i_266_ = 0;
		if (i_260_ <= 0) {
			int i_267_ = 1 - i_260_;
			i_263_ -= i_267_;
			i_262_ += i_267_ * i_264_;
			i_261_ += i_267_ * anInt3642;
			i_260_ = 1;
		}
		if (i_260_ + i_263_ >= anInt3644) {
			int i_268_ = i_260_ + i_263_ + 1 - anInt3644;
			i_263_ -= i_268_;
		}
		if (i <= 0) {
			int i_269_ = 1 - i;
			i_264_ -= i_269_;
			i_262_ += i_269_;
			i_261_ += i_269_;
			i_266_ += i_269_;
			i_265_ += i_269_;
			i = 1;
		}
		if (i + i_264_ >= anInt3642) {
			int i_270_ = i + i_264_ + 1 - anInt3642;
			i_264_ -= i_270_;
			i_266_ += i_270_;
			i_265_ += i_270_;
		}
		if (i_264_ > 0 && i_263_ > 0) {
			method6161(aByteArray3647, class523_sub27_sub4_sub2.aByteArray12087, i_262_, i_261_, i_264_, i_263_, i_265_, i_266_);
			method6162(i, i_260_, i_264_, i_263_);
		}
	}

	static final void method6178(byte[] is, byte[] is_271_, int i, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_) {
		int i_277_ = -(i_273_ >> 2);
		i_273_ = -(i_273_ & 0x3);
		for (int i_278_ = -i_274_; i_278_ < 0; i_278_++) {
			for (int i_279_ = i_277_; i_279_ < 0; i_279_++) {
				is[i_272_++] -= is_271_[i++];
				is[i_272_++] -= is_271_[i++];
				is[i_272_++] -= is_271_[i++];
				is[i_272_++] -= is_271_[i++];
			}
			for (int i_280_ = i_273_; i_280_ < 0; i_280_++)
				is[i_272_++] -= is_271_[i++];
			i_272_ += i_275_;
			i += i_276_;
		}
	}

	static final boolean method6179(byte[] is, int i, int i_281_, int i_282_, int i_283_, int i_284_) {
		int i_285_ = i_281_ % i_284_;
		int i_286_;
		if (i_285_ != 0)
			i_286_ = i_284_ - i_285_;
		else
			i_286_ = 0;
		int i_287_ = -((i_282_ + i_284_ - 1) / i_284_);
		int i_288_ = -((i_281_ + i_284_ - 1) / i_284_);
		for (int i_289_ = i_287_; i_289_ < 0; i_289_++) {
			for (int i_290_ = i_288_; i_290_ < 0; i_290_++) {
				if (is[i] == 0)
					return true;
				i += i_284_;
			}
			i -= i_286_;
			if (is[i - 1] == 0)
				return true;
			i += i_283_;
		}
		return false;
	}
}
