/* Class175_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175_Sub2 extends Class175 {
	public int[] anIntArray9850;
	public int anInt9851;
	public int anInt9852;
	int anInt9853;
	int anInt9854;
	int anInt9855;
	int anInt9856;
	public byte[] aByteArray9857;
	public byte[] aByteArray9858;

	public int method2951() {
		return anInt9854 + anInt9852 + anInt9855;
	}

	public boolean method2942() {
		return true;
	}

	public int method2945() {
		return anInt9853;
	}

	public int method2944() {
		return anInt9854;
	}

	public int method2947() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public void method2941() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_0_ = i * anInt9854;
				int i_1_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_2_ = -anInt9854; i_2_ < 0; i_2_++) {
					byte i_3_ = is[i_0_];
					is[i_0_] = is[i_1_];
					is[i_1_] = i_3_;
					i_0_++;
					i_1_++;
				}
			}
		} else {
			byte[] is_4_ = aByteArray9858;
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_5_ = i * anInt9854;
				int i_6_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_7_ = -anInt9854; i_7_ < 0; i_7_++) {
					byte i_8_ = is[i_5_];
					is[i_5_] = is[i_6_];
					is[i_6_] = i_8_;
					i_8_ = is_4_[i_5_];
					is_4_[i_5_] = is_4_[i_6_];
					is_4_[i_6_] = i_8_;
					i_5_++;
					i_6_++;
				}
			}
		}
		int i = anInt9851;
		anInt9851 = anInt9856;
		anInt9856 = i;
	}

	public int method2968() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public int method2946() {
		return anInt9852;
	}

	public int method2984() {
		return anInt9855;
	}

	public int method2948() {
		return anInt9851;
	}

	public int method2949() {
		return anInt9856;
	}

	public void method2950() {
		anInt9856 = 0;
		anInt9851 = 0;
		anInt9855 = 0;
		anInt9852 = 0;
	}

	public int method2975() {
		return anInt9855;
	}

	public void method2954(int i) {
		int i_9_ = -1;
		if (anIntArray9850.length < 255) {
			for (int i_10_ = 0; i_10_ < anIntArray9850.length; i_10_++) {
				if (anIntArray9850[i_10_] == i) {
					i_9_ = i_10_;
					break;
				}
			}
			if (i_9_ == -1) {
				i_9_ = anIntArray9850.length;
				int[] is = new int[anIntArray9850.length + 1];
				System.arraycopy(anIntArray9850, 0, is, 0, anIntArray9850.length);
				anIntArray9850 = is;
				is[i_9_] = i;
			}
		} else {
			int i_11_ = 2147483647;
			int i_12_ = i >> 16 & 0xff;
			int i_13_ = i >> 8 & 0xff;
			int i_14_ = i & 0xff;
			for (int i_15_ = 0; i_15_ < anIntArray9850.length; i_15_++) {
				int i_16_ = anIntArray9850[i_15_];
				int i_17_ = i_16_ >> 16 & 0xff;
				int i_18_ = i_16_ >> 8 & 0xff;
				int i_19_ = i_16_ & 0xff;
				int i_20_ = i_12_ - i_17_;
				if (i_20_ < 0)
					i_20_ = -i_20_;
				int i_21_ = i_13_ - i_18_;
				if (i_21_ < 0)
					i_21_ = -i_21_;
				int i_22_ = i_14_ - i_19_;
				if (i_22_ < 0)
					i_22_ = -i_22_;
				int i_23_ = i_20_ + i_21_ + i_22_;
				if (i_23_ < i_11_) {
					i_11_ = i_23_;
					i_9_ = i_15_;
				}
			}
		}
		int i_24_ = 0;
		byte[] is = new byte[anInt9854 * anInt9853];
		for (int i_25_ = 0; i_25_ < anInt9853; i_25_++) {
			for (int i_26_ = 0; i_26_ < anInt9854; i_26_++) {
				int i_27_ = aByteArray9857[i_24_] & 0xff;
				if (anIntArray9850[i_27_] == 0) {
					if (i_26_ > 0 && (anIntArray9850[aByteArray9857[i_24_ - 1] & 0xff] != 0))
						i_27_ = i_9_;
					else if (i_25_ > 0 && ((anIntArray9850[aByteArray9857[i_24_ - anInt9854] & 0xff]) != 0))
						i_27_ = i_9_;
					else if (i_26_ < anInt9854 - 1 && (anIntArray9850[aByteArray9857[i_24_ + 1] & 0xff]) != 0)
						i_27_ = i_9_;
					else if (i_25_ < anInt9853 - 1 && ((anIntArray9850[aByteArray9857[i_24_ + anInt9854] & 0xff]) != 0))
						i_27_ = i_9_;
				}
				is[i_24_++] = (byte) i_27_;
			}
		}
		aByteArray9857 = is;
	}

	public void method2967(int i) {
		int i_28_ = -1;
		if (anIntArray9850.length < 255) {
			for (int i_29_ = 0; i_29_ < anIntArray9850.length; i_29_++) {
				if (anIntArray9850[i_29_] == i) {
					i_28_ = i_29_;
					break;
				}
			}
			if (i_28_ == -1) {
				i_28_ = anIntArray9850.length;
				int[] is = new int[anIntArray9850.length + 1];
				System.arraycopy(anIntArray9850, 0, is, 0, anIntArray9850.length);
				anIntArray9850 = is;
				is[i_28_] = i;
			}
		} else {
			int i_30_ = 2147483647;
			int i_31_ = i >> 16 & 0xff;
			int i_32_ = i >> 8 & 0xff;
			int i_33_ = i & 0xff;
			for (int i_34_ = 0; i_34_ < anIntArray9850.length; i_34_++) {
				int i_35_ = anIntArray9850[i_34_];
				int i_36_ = i_35_ >> 16 & 0xff;
				int i_37_ = i_35_ >> 8 & 0xff;
				int i_38_ = i_35_ & 0xff;
				int i_39_ = i_31_ - i_36_;
				if (i_39_ < 0)
					i_39_ = -i_39_;
				int i_40_ = i_32_ - i_37_;
				if (i_40_ < 0)
					i_40_ = -i_40_;
				int i_41_ = i_33_ - i_38_;
				if (i_41_ < 0)
					i_41_ = -i_41_;
				int i_42_ = i_39_ + i_40_ + i_41_;
				if (i_42_ < i_30_) {
					i_30_ = i_42_;
					i_28_ = i_34_;
				}
			}
		}
		for (int i_43_ = anInt9853 - 1; i_43_ > 0; i_43_--) {
			int i_44_ = i_43_ * anInt9854;
			for (int i_45_ = anInt9854 - 1; i_45_ > 0; i_45_--) {
				if (anIntArray9850[aByteArray9857[i_45_ + i_44_] & 0xff] == 0 && (anIntArray9850[aByteArray9857[(i_45_ + i_44_ - 1 - anInt9854)] & 0xff] != 0))
					aByteArray9857[i_45_ + i_44_] = (byte) i_28_;
			}
		}
	}

	public void method2956() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_46_ = i * anInt9854;
				for (int i_47_ = (i + 1) * anInt9854; i_46_ < i_47_; i_46_++) {
					i_47_--;
					byte i_48_ = is[i_46_];
					is[i_46_] = is[i_47_];
					is[i_47_] = i_48_;
				}
			}
		} else {
			byte[] is_49_ = aByteArray9858;
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_50_ = i * anInt9854;
				for (int i_51_ = (i + 1) * anInt9854; i_50_ < i_51_; i_50_++) {
					i_51_--;
					byte i_52_ = is[i_50_];
					is[i_50_] = is[i_51_];
					is[i_51_] = i_52_;
					i_52_ = is_49_[i_50_];
					is_49_[i_50_] = is_49_[i_51_];
					is_49_[i_51_] = i_52_;
				}
			}
		}
		int i = anInt9852;
		anInt9852 = anInt9855;
		anInt9855 = i;
	}

	public void method2998() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_53_ = i * anInt9854;
				int i_54_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_55_ = -anInt9854; i_55_ < 0; i_55_++) {
					byte i_56_ = is[i_53_];
					is[i_53_] = is[i_54_];
					is[i_54_] = i_56_;
					i_53_++;
					i_54_++;
				}
			}
		} else {
			byte[] is_57_ = aByteArray9858;
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_58_ = i * anInt9854;
				int i_59_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_60_ = -anInt9854; i_60_ < 0; i_60_++) {
					byte i_61_ = is[i_58_];
					is[i_58_] = is[i_59_];
					is[i_59_] = i_61_;
					i_61_ = is_57_[i_58_];
					is_57_[i_58_] = is_57_[i_59_];
					is_57_[i_59_] = i_61_;
					i_58_++;
					i_59_++;
				}
			}
		}
		int i = anInt9851;
		anInt9851 = anInt9856;
		anInt9856 = i;
	}

	Class175_Sub2() {
		/* empty */
	}

	public int[] method2959(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2951();
			is = new int[i * method2968()];
			if (aByteArray9858 != null) {
				for (int i_62_ = 0; i_62_ < anInt9853; i_62_++) {
					int i_63_ = i_62_ * anInt9854;
					int i_64_ = anInt9852 + (i_62_ + anInt9851) * i;
					for (int i_65_ = 0; i_65_ < anInt9854; i_65_++) {
						is[i_64_++] = (aByteArray9858[i_63_] << 24 | anIntArray9850[aByteArray9857[i_63_] & 0xff]);
						i_63_++;
					}
				}
			} else {
				for (int i_66_ = 0; i_66_ < anInt9853; i_66_++) {
					int i_67_ = i_66_ * anInt9854;
					int i_68_ = anInt9852 + (i_66_ + anInt9851) * i;
					for (int i_69_ = 0; i_69_ < anInt9854; i_69_++) {
						int i_70_ = anIntArray9850[aByteArray9857[i_67_++] & 0xff];
						if (i_70_ != 0)
							is[i_68_++] = ~0xffffff | i_70_;
						else
							is[i_68_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9854 * anInt9853];
			int i = 0;
			int i_71_ = 0;
			if (aByteArray9858 != null) {
				for (int i_72_ = 0; i_72_ < anInt9853; i_72_++) {
					for (int i_73_ = 0; i_73_ < anInt9854; i_73_++) {
						is[i_71_++] = (aByteArray9858[i] << 24 | anIntArray9850[aByteArray9857[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_74_ = 0; i_74_ < anInt9853; i_74_++) {
					for (int i_75_ = 0; i_75_ < anInt9854; i_75_++) {
						int i_76_ = anIntArray9850[aByteArray9857[i++] & 0xff];
						is[i_71_++] = i_76_ != 0 ? ~0xffffff | i_76_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method2980(int i, int i_77_, int i_78_) {
		for (int i_79_ = 1; i_79_ < anIntArray9850.length; i_79_++) {
			if (anIntArray9850[i_79_] != 1 && anIntArray9850[i_79_] != 16711935) {
				int i_80_ = anIntArray9850[i_79_] >> 16 & 0xff;
				i_80_ += i;
				if (i_80_ < 0)
					i_80_ = 0;
				else if (i_80_ > 255)
					i_80_ = 255;
				int i_81_ = anIntArray9850[i_79_] >> 8 & 0xff;
				i_81_ += i_77_;
				if (i_81_ < 0)
					i_81_ = 0;
				else if (i_81_ > 255)
					i_81_ = 255;
				int i_82_ = anIntArray9850[i_79_] >> 0 & 0xff;
				i_82_ += i_78_;
				if (i_82_ < 0)
					i_82_ = 0;
				else if (i_82_ > 255)
					i_82_ = 255;
				anIntArray9850[i_79_] = i_80_ << 16 | i_81_ << 8 | i_82_;
			}
		}
	}

	public int method2961(int i, int i_83_) {
		return anIntArray9850[aByteArray9857[i + i_83_ * anInt9854] & 0xff];
	}

	public boolean method2962() {
		return aByteArray9858 != null;
	}

	public int method2977() {
		return anInt9851;
	}

	public void method2989() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_84_ = i * anInt9854;
				for (int i_85_ = (i + 1) * anInt9854; i_84_ < i_85_; i_84_++) {
					i_85_--;
					byte i_86_ = is[i_84_];
					is[i_84_] = is[i_85_];
					is[i_85_] = i_86_;
				}
			}
		} else {
			byte[] is_87_ = aByteArray9858;
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_88_ = i * anInt9854;
				for (int i_89_ = (i + 1) * anInt9854; i_88_ < i_89_; i_88_++) {
					i_89_--;
					byte i_90_ = is[i_88_];
					is[i_88_] = is[i_89_];
					is[i_89_] = i_90_;
					i_90_ = is_87_[i_88_];
					is_87_[i_88_] = is_87_[i_89_];
					is_87_[i_89_] = i_90_;
				}
			}
		}
		int i = anInt9852;
		anInt9852 = anInt9855;
		anInt9855 = i;
	}

	public int method2987() {
		return anInt9853;
	}

	public int method2982() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public void method2953(int i) {
		int i_91_ = method2951();
		int i_92_ = method2968();
		if (anInt9854 != i_91_ || anInt9853 != i_92_) {
			int i_93_ = i;
			if (i_93_ > anInt9852)
				i_93_ = anInt9852;
			int i_94_ = i;
			if (i_94_ + anInt9852 + anInt9854 > i_91_)
				i_94_ = i_91_ - anInt9852 - anInt9854;
			int i_95_ = i;
			if (i_95_ > anInt9851)
				i_95_ = anInt9851;
			int i_96_ = i;
			if (i_96_ + anInt9851 + anInt9853 > i_92_)
				i_96_ = i_92_ - anInt9851 - anInt9853;
			int i_97_ = anInt9854 + i_93_ + i_94_;
			int i_98_ = anInt9853 + i_95_ + i_96_;
			byte[] is = new byte[i_97_ * i_98_];
			if (aByteArray9858 == null) {
				for (int i_99_ = 0; i_99_ < anInt9853; i_99_++) {
					int i_100_ = i_99_ * anInt9854;
					int i_101_ = (i_99_ + i_95_) * i_97_ + i_93_;
					for (int i_102_ = 0; i_102_ < anInt9854; i_102_++)
						is[i_101_++] = aByteArray9857[i_100_++];
				}
			} else {
				byte[] is_103_ = new byte[i_97_ * i_98_];
				for (int i_104_ = 0; i_104_ < anInt9853; i_104_++) {
					int i_105_ = i_104_ * anInt9854;
					int i_106_ = (i_104_ + i_95_) * i_97_ + i_93_;
					for (int i_107_ = 0; i_107_ < anInt9854; i_107_++) {
						is_103_[i_106_] = aByteArray9858[i_105_];
						is[i_106_++] = aByteArray9857[i_105_++];
					}
				}
				aByteArray9858 = is_103_;
			}
			anInt9852 -= i_93_;
			anInt9851 -= i_95_;
			anInt9855 -= i_94_;
			anInt9856 -= i_96_;
			anInt9854 = i_97_;
			anInt9853 = i_98_;
			aByteArray9857 = is;
		}
	}

	public int method2955() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public int method2969() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public int method2970() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public int method3003() {
		return anInt9853 + anInt9851 + anInt9856;
	}

	public int method2971() {
		return anInt9852;
	}

	public int method2986() {
		return anInt9852;
	}

	public int method2976() {
		return anInt9855;
	}

	public int method2974() {
		return anInt9855;
	}

	public void method2992(int i) {
		int i_108_ = -1;
		if (anIntArray9850.length < 255) {
			for (int i_109_ = 0; i_109_ < anIntArray9850.length; i_109_++) {
				if (anIntArray9850[i_109_] == i) {
					i_108_ = i_109_;
					break;
				}
			}
			if (i_108_ == -1) {
				i_108_ = anIntArray9850.length;
				int[] is = new int[anIntArray9850.length + 1];
				System.arraycopy(anIntArray9850, 0, is, 0, anIntArray9850.length);
				anIntArray9850 = is;
				is[i_108_] = i;
			}
		} else {
			int i_110_ = 2147483647;
			int i_111_ = i >> 16 & 0xff;
			int i_112_ = i >> 8 & 0xff;
			int i_113_ = i & 0xff;
			for (int i_114_ = 0; i_114_ < anIntArray9850.length; i_114_++) {
				int i_115_ = anIntArray9850[i_114_];
				int i_116_ = i_115_ >> 16 & 0xff;
				int i_117_ = i_115_ >> 8 & 0xff;
				int i_118_ = i_115_ & 0xff;
				int i_119_ = i_111_ - i_116_;
				if (i_119_ < 0)
					i_119_ = -i_119_;
				int i_120_ = i_112_ - i_117_;
				if (i_120_ < 0)
					i_120_ = -i_120_;
				int i_121_ = i_113_ - i_118_;
				if (i_121_ < 0)
					i_121_ = -i_121_;
				int i_122_ = i_119_ + i_120_ + i_121_;
				if (i_122_ < i_110_) {
					i_110_ = i_122_;
					i_108_ = i_114_;
				}
			}
		}
		int i_123_ = 0;
		byte[] is = new byte[anInt9854 * anInt9853];
		for (int i_124_ = 0; i_124_ < anInt9853; i_124_++) {
			for (int i_125_ = 0; i_125_ < anInt9854; i_125_++) {
				int i_126_ = aByteArray9857[i_123_] & 0xff;
				if (anIntArray9850[i_126_] == 0) {
					if (i_125_ > 0 && (anIntArray9850[aByteArray9857[i_123_ - 1] & 0xff] != 0))
						i_126_ = i_108_;
					else if (i_124_ > 0 && ((anIntArray9850[aByteArray9857[i_123_ - anInt9854] & 0xff]) != 0))
						i_126_ = i_108_;
					else if (i_125_ < anInt9854 - 1 && (anIntArray9850[aByteArray9857[i_123_ + 1] & 0xff]) != 0)
						i_126_ = i_108_;
					else if (i_124_ < anInt9853 - 1 && ((anIntArray9850[aByteArray9857[i_123_ + anInt9854] & 0xff]) != 0))
						i_126_ = i_108_;
				}
				is[i_123_++] = (byte) i_126_;
			}
		}
		aByteArray9857 = is;
	}

	public int method2957(int i, int i_127_) {
		return anIntArray9850[aByteArray9857[i + i_127_ * anInt9854] & 0xff];
	}

	public int method2964() {
		return anInt9854;
	}

	public int method2978() {
		return anInt9851;
	}

	public int method2979() {
		return anInt9856;
	}

	public int method2991() {
		return anInt9856;
	}

	public void method2981() {
		anInt9856 = 0;
		anInt9851 = 0;
		anInt9855 = 0;
		anInt9852 = 0;
	}

	public void method2994() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_128_ = i * anInt9854;
				int i_129_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_130_ = -anInt9854; i_130_ < 0; i_130_++) {
					byte i_131_ = is[i_128_];
					is[i_128_] = is[i_129_];
					is[i_129_] = i_131_;
					i_128_++;
					i_129_++;
				}
			}
		} else {
			byte[] is_132_ = aByteArray9858;
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_133_ = i * anInt9854;
				int i_134_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_135_ = -anInt9854; i_135_ < 0; i_135_++) {
					byte i_136_ = is[i_133_];
					is[i_133_] = is[i_134_];
					is[i_134_] = i_136_;
					i_136_ = is_132_[i_133_];
					is_132_[i_133_] = is_132_[i_134_];
					is_132_[i_134_] = i_136_;
					i_133_++;
					i_134_++;
				}
			}
		}
		int i = anInt9851;
		anInt9851 = anInt9856;
		anInt9856 = i;
	}

	public void method2983(int i) {
		int i_137_ = -1;
		if (anIntArray9850.length < 255) {
			for (int i_138_ = 0; i_138_ < anIntArray9850.length; i_138_++) {
				if (anIntArray9850[i_138_] == i) {
					i_137_ = i_138_;
					break;
				}
			}
			if (i_137_ == -1) {
				i_137_ = anIntArray9850.length;
				int[] is = new int[anIntArray9850.length + 1];
				System.arraycopy(anIntArray9850, 0, is, 0, anIntArray9850.length);
				anIntArray9850 = is;
				is[i_137_] = i;
			}
		} else {
			int i_139_ = 2147483647;
			int i_140_ = i >> 16 & 0xff;
			int i_141_ = i >> 8 & 0xff;
			int i_142_ = i & 0xff;
			for (int i_143_ = 0; i_143_ < anIntArray9850.length; i_143_++) {
				int i_144_ = anIntArray9850[i_143_];
				int i_145_ = i_144_ >> 16 & 0xff;
				int i_146_ = i_144_ >> 8 & 0xff;
				int i_147_ = i_144_ & 0xff;
				int i_148_ = i_140_ - i_145_;
				if (i_148_ < 0)
					i_148_ = -i_148_;
				int i_149_ = i_141_ - i_146_;
				if (i_149_ < 0)
					i_149_ = -i_149_;
				int i_150_ = i_142_ - i_147_;
				if (i_150_ < 0)
					i_150_ = -i_150_;
				int i_151_ = i_148_ + i_149_ + i_150_;
				if (i_151_ < i_139_) {
					i_139_ = i_151_;
					i_137_ = i_143_;
				}
			}
		}
		int i_152_ = 0;
		byte[] is = new byte[anInt9854 * anInt9853];
		for (int i_153_ = 0; i_153_ < anInt9853; i_153_++) {
			for (int i_154_ = 0; i_154_ < anInt9854; i_154_++) {
				int i_155_ = aByteArray9857[i_152_] & 0xff;
				if (anIntArray9850[i_155_] == 0) {
					if (i_154_ > 0 && (anIntArray9850[aByteArray9857[i_152_ - 1] & 0xff] != 0))
						i_155_ = i_137_;
					else if (i_153_ > 0 && ((anIntArray9850[aByteArray9857[i_152_ - anInt9854] & 0xff]) != 0))
						i_155_ = i_137_;
					else if (i_154_ < anInt9854 - 1 && (anIntArray9850[aByteArray9857[i_152_ + 1] & 0xff]) != 0)
						i_155_ = i_137_;
					else if (i_153_ < anInt9853 - 1 && ((anIntArray9850[aByteArray9857[i_152_ + anInt9854] & 0xff]) != 0))
						i_155_ = i_137_;
				}
				is[i_152_++] = (byte) i_155_;
			}
		}
		aByteArray9857 = is;
	}

	public void method2985(int i) {
		int i_156_ = -1;
		if (anIntArray9850.length < 255) {
			for (int i_157_ = 0; i_157_ < anIntArray9850.length; i_157_++) {
				if (anIntArray9850[i_157_] == i) {
					i_156_ = i_157_;
					break;
				}
			}
			if (i_156_ == -1) {
				i_156_ = anIntArray9850.length;
				int[] is = new int[anIntArray9850.length + 1];
				System.arraycopy(anIntArray9850, 0, is, 0, anIntArray9850.length);
				anIntArray9850 = is;
				is[i_156_] = i;
			}
		} else {
			int i_158_ = 2147483647;
			int i_159_ = i >> 16 & 0xff;
			int i_160_ = i >> 8 & 0xff;
			int i_161_ = i & 0xff;
			for (int i_162_ = 0; i_162_ < anIntArray9850.length; i_162_++) {
				int i_163_ = anIntArray9850[i_162_];
				int i_164_ = i_163_ >> 16 & 0xff;
				int i_165_ = i_163_ >> 8 & 0xff;
				int i_166_ = i_163_ & 0xff;
				int i_167_ = i_159_ - i_164_;
				if (i_167_ < 0)
					i_167_ = -i_167_;
				int i_168_ = i_160_ - i_165_;
				if (i_168_ < 0)
					i_168_ = -i_168_;
				int i_169_ = i_161_ - i_166_;
				if (i_169_ < 0)
					i_169_ = -i_169_;
				int i_170_ = i_167_ + i_168_ + i_169_;
				if (i_170_ < i_158_) {
					i_158_ = i_170_;
					i_156_ = i_162_;
				}
			}
		}
		int i_171_ = 0;
		byte[] is = new byte[anInt9854 * anInt9853];
		for (int i_172_ = 0; i_172_ < anInt9853; i_172_++) {
			for (int i_173_ = 0; i_173_ < anInt9854; i_173_++) {
				int i_174_ = aByteArray9857[i_171_] & 0xff;
				if (anIntArray9850[i_174_] == 0) {
					if (i_173_ > 0 && (anIntArray9850[aByteArray9857[i_171_ - 1] & 0xff] != 0))
						i_174_ = i_156_;
					else if (i_172_ > 0 && ((anIntArray9850[aByteArray9857[i_171_ - anInt9854] & 0xff]) != 0))
						i_174_ = i_156_;
					else if (i_173_ < anInt9854 - 1 && (anIntArray9850[aByteArray9857[i_171_ + 1] & 0xff]) != 0)
						i_174_ = i_156_;
					else if (i_172_ < anInt9853 - 1 && ((anIntArray9850[aByteArray9857[i_171_ + anInt9854] & 0xff]) != 0))
						i_174_ = i_156_;
				}
				is[i_171_++] = (byte) i_174_;
			}
		}
		aByteArray9857 = is;
	}

	public int method3005() {
		return anInt9854 + anInt9852 + anInt9855;
	}

	public void method3004(int i) {
		int i_175_ = -1;
		if (anIntArray9850.length < 255) {
			for (int i_176_ = 0; i_176_ < anIntArray9850.length; i_176_++) {
				if (anIntArray9850[i_176_] == i) {
					i_175_ = i_176_;
					break;
				}
			}
			if (i_175_ == -1) {
				i_175_ = anIntArray9850.length;
				int[] is = new int[anIntArray9850.length + 1];
				System.arraycopy(anIntArray9850, 0, is, 0, anIntArray9850.length);
				anIntArray9850 = is;
				is[i_175_] = i;
			}
		} else {
			int i_177_ = 2147483647;
			int i_178_ = i >> 16 & 0xff;
			int i_179_ = i >> 8 & 0xff;
			int i_180_ = i & 0xff;
			for (int i_181_ = 0; i_181_ < anIntArray9850.length; i_181_++) {
				int i_182_ = anIntArray9850[i_181_];
				int i_183_ = i_182_ >> 16 & 0xff;
				int i_184_ = i_182_ >> 8 & 0xff;
				int i_185_ = i_182_ & 0xff;
				int i_186_ = i_178_ - i_183_;
				if (i_186_ < 0)
					i_186_ = -i_186_;
				int i_187_ = i_179_ - i_184_;
				if (i_187_ < 0)
					i_187_ = -i_187_;
				int i_188_ = i_180_ - i_185_;
				if (i_188_ < 0)
					i_188_ = -i_188_;
				int i_189_ = i_186_ + i_187_ + i_188_;
				if (i_189_ < i_177_) {
					i_177_ = i_189_;
					i_175_ = i_181_;
				}
			}
		}
		for (int i_190_ = anInt9853 - 1; i_190_ > 0; i_190_--) {
			int i_191_ = i_190_ * anInt9854;
			for (int i_192_ = anInt9854 - 1; i_192_ > 0; i_192_--) {
				if (anIntArray9850[aByteArray9857[i_192_ + i_191_] & 0xff] == 0 && (anIntArray9850[aByteArray9857[(i_192_ + i_191_ - 1 - anInt9854)] & 0xff] != 0))
					aByteArray9857[i_192_ + i_191_] = (byte) i_175_;
			}
		}
	}

	public void method2997() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_193_ = i * anInt9854;
				for (int i_194_ = (i + 1) * anInt9854; i_193_ < i_194_; i_193_++) {
					i_194_--;
					byte i_195_ = is[i_193_];
					is[i_193_] = is[i_194_];
					is[i_194_] = i_195_;
				}
			}
		} else {
			byte[] is_196_ = aByteArray9858;
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_197_ = i * anInt9854;
				for (int i_198_ = (i + 1) * anInt9854; i_197_ < i_198_; i_197_++) {
					i_198_--;
					byte i_199_ = is[i_197_];
					is[i_197_] = is[i_198_];
					is[i_198_] = i_199_;
					i_199_ = is_196_[i_197_];
					is_196_[i_197_] = is_196_[i_198_];
					is_196_[i_198_] = i_199_;
				}
			}
		}
		int i = anInt9852;
		anInt9852 = anInt9855;
		anInt9855 = i;
	}

	public void method2988() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_200_ = i * anInt9854;
				for (int i_201_ = (i + 1) * anInt9854; i_200_ < i_201_; i_200_++) {
					i_201_--;
					byte i_202_ = is[i_200_];
					is[i_200_] = is[i_201_];
					is[i_201_] = i_202_;
				}
			}
		} else {
			byte[] is_203_ = aByteArray9858;
			for (int i = anInt9853 - 1; i >= 0; i--) {
				int i_204_ = i * anInt9854;
				for (int i_205_ = (i + 1) * anInt9854; i_204_ < i_205_; i_204_++) {
					i_205_--;
					byte i_206_ = is[i_204_];
					is[i_204_] = is[i_205_];
					is[i_205_] = i_206_;
					i_206_ = is_203_[i_204_];
					is_203_[i_204_] = is_203_[i_205_];
					is_203_[i_205_] = i_206_;
				}
			}
		}
		int i = anInt9852;
		anInt9852 = anInt9855;
		anInt9855 = i;
	}

	public void method2995() {
		byte[] is = new byte[anInt9854 * anInt9853];
		int i = 0;
		if (aByteArray9858 == null) {
			for (int i_207_ = 0; i_207_ < anInt9854; i_207_++) {
				for (int i_208_ = anInt9853 - 1; i_208_ >= 0; i_208_--)
					is[i++] = aByteArray9857[i_207_ + i_208_ * anInt9854];
			}
			aByteArray9857 = is;
		} else {
			byte[] is_209_ = new byte[anInt9854 * anInt9853];
			for (int i_210_ = 0; i_210_ < anInt9854; i_210_++) {
				for (int i_211_ = anInt9853 - 1; i_211_ >= 0; i_211_--) {
					is[i] = aByteArray9857[i_210_ + i_211_ * anInt9854];
					is_209_[i++] = aByteArray9858[i_210_ + i_211_ * anInt9854];
				}
			}
			aByteArray9857 = is;
			aByteArray9858 = is_209_;
		}
		int i_212_ = anInt9851;
		anInt9851 = anInt9852;
		anInt9852 = anInt9856;
		anInt9856 = anInt9855;
		anInt9855 = i_212_;
		i_212_ = anInt9853;
		anInt9853 = anInt9854;
		anInt9854 = i_212_;
	}

	public void method3000(int i, int i_213_, int i_214_) {
		for (int i_215_ = 1; i_215_ < anIntArray9850.length; i_215_++) {
			if (anIntArray9850[i_215_] != 1 && anIntArray9850[i_215_] != 16711935) {
				int i_216_ = anIntArray9850[i_215_] >> 16 & 0xff;
				i_216_ += i;
				if (i_216_ < 0)
					i_216_ = 0;
				else if (i_216_ > 255)
					i_216_ = 255;
				int i_217_ = anIntArray9850[i_215_] >> 8 & 0xff;
				i_217_ += i_213_;
				if (i_217_ < 0)
					i_217_ = 0;
				else if (i_217_ > 255)
					i_217_ = 255;
				int i_218_ = anIntArray9850[i_215_] >> 0 & 0xff;
				i_218_ += i_214_;
				if (i_218_ < 0)
					i_218_ = 0;
				else if (i_218_ > 255)
					i_218_ = 255;
				anIntArray9850[i_215_] = i_216_ << 16 | i_217_ << 8 | i_218_;
			}
		}
	}

	public int method2972() {
		return anInt9852;
	}

	public void method2960() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_219_ = i * anInt9854;
				int i_220_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_221_ = -anInt9854; i_221_ < 0; i_221_++) {
					byte i_222_ = is[i_219_];
					is[i_219_] = is[i_220_];
					is[i_220_] = i_222_;
					i_219_++;
					i_220_++;
				}
			}
		} else {
			byte[] is_223_ = aByteArray9858;
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_224_ = i * anInt9854;
				int i_225_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_226_ = -anInt9854; i_226_ < 0; i_226_++) {
					byte i_227_ = is[i_224_];
					is[i_224_] = is[i_225_];
					is[i_225_] = i_227_;
					i_227_ = is_223_[i_224_];
					is_223_[i_224_] = is_223_[i_225_];
					is_223_[i_225_] = i_227_;
					i_224_++;
					i_225_++;
				}
			}
		}
		int i = anInt9851;
		anInt9851 = anInt9856;
		anInt9856 = i;
	}

	public void method2973() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_228_ = i * anInt9854;
				int i_229_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_230_ = -anInt9854; i_230_ < 0; i_230_++) {
					byte i_231_ = is[i_228_];
					is[i_228_] = is[i_229_];
					is[i_229_] = i_231_;
					i_228_++;
					i_229_++;
				}
			}
		} else {
			byte[] is_232_ = aByteArray9858;
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_233_ = i * anInt9854;
				int i_234_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_235_ = -anInt9854; i_235_ < 0; i_235_++) {
					byte i_236_ = is[i_233_];
					is[i_233_] = is[i_234_];
					is[i_234_] = i_236_;
					i_236_ = is_232_[i_233_];
					is_232_[i_233_] = is_232_[i_234_];
					is_232_[i_234_] = i_236_;
					i_233_++;
					i_234_++;
				}
			}
		}
		int i = anInt9851;
		anInt9851 = anInt9856;
		anInt9856 = i;
	}

	public void method3001() {
		byte[] is = aByteArray9857;
		if (aByteArray9858 == null) {
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_237_ = i * anInt9854;
				int i_238_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_239_ = -anInt9854; i_239_ < 0; i_239_++) {
					byte i_240_ = is[i_237_];
					is[i_237_] = is[i_238_];
					is[i_238_] = i_240_;
					i_237_++;
					i_238_++;
				}
			}
		} else {
			byte[] is_241_ = aByteArray9858;
			for (int i = (anInt9853 >> 1) - 1; i >= 0; i--) {
				int i_242_ = i * anInt9854;
				int i_243_ = (anInt9853 - i - 1) * anInt9854;
				for (int i_244_ = -anInt9854; i_244_ < 0; i_244_++) {
					byte i_245_ = is[i_242_];
					is[i_242_] = is[i_243_];
					is[i_243_] = i_245_;
					i_245_ = is_241_[i_242_];
					is_241_[i_242_] = is_241_[i_243_];
					is_241_[i_243_] = i_245_;
					i_242_++;
					i_243_++;
				}
			}
		}
		int i = anInt9851;
		anInt9851 = anInt9856;
		anInt9856 = i;
	}

	public void method2958() {
		byte[] is = new byte[anInt9854 * anInt9853];
		int i = 0;
		if (aByteArray9858 == null) {
			for (int i_246_ = 0; i_246_ < anInt9854; i_246_++) {
				for (int i_247_ = anInt9853 - 1; i_247_ >= 0; i_247_--)
					is[i++] = aByteArray9857[i_246_ + i_247_ * anInt9854];
			}
			aByteArray9857 = is;
		} else {
			byte[] is_248_ = new byte[anInt9854 * anInt9853];
			for (int i_249_ = 0; i_249_ < anInt9854; i_249_++) {
				for (int i_250_ = anInt9853 - 1; i_250_ >= 0; i_250_--) {
					is[i] = aByteArray9857[i_249_ + i_250_ * anInt9854];
					is_248_[i++] = aByteArray9858[i_249_ + i_250_ * anInt9854];
				}
			}
			aByteArray9857 = is;
			aByteArray9858 = is_248_;
		}
		int i_251_ = anInt9851;
		anInt9851 = anInt9852;
		anInt9852 = anInt9856;
		anInt9856 = anInt9855;
		anInt9855 = i_251_;
		i_251_ = anInt9853;
		anInt9853 = anInt9854;
		anInt9854 = i_251_;
	}

	public int[] method2996(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2951();
			is = new int[i * method2968()];
			if (aByteArray9858 != null) {
				for (int i_252_ = 0; i_252_ < anInt9853; i_252_++) {
					int i_253_ = i_252_ * anInt9854;
					int i_254_ = anInt9852 + (i_252_ + anInt9851) * i;
					for (int i_255_ = 0; i_255_ < anInt9854; i_255_++) {
						is[i_254_++] = (aByteArray9858[i_253_] << 24 | (anIntArray9850[aByteArray9857[i_253_] & 0xff]));
						i_253_++;
					}
				}
			} else {
				for (int i_256_ = 0; i_256_ < anInt9853; i_256_++) {
					int i_257_ = i_256_ * anInt9854;
					int i_258_ = anInt9852 + (i_256_ + anInt9851) * i;
					for (int i_259_ = 0; i_259_ < anInt9854; i_259_++) {
						int i_260_ = anIntArray9850[aByteArray9857[i_257_++] & 0xff];
						if (i_260_ != 0)
							is[i_258_++] = ~0xffffff | i_260_;
						else
							is[i_258_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9854 * anInt9853];
			int i = 0;
			int i_261_ = 0;
			if (aByteArray9858 != null) {
				for (int i_262_ = 0; i_262_ < anInt9853; i_262_++) {
					for (int i_263_ = 0; i_263_ < anInt9854; i_263_++) {
						is[i_261_++] = (aByteArray9858[i] << 24 | anIntArray9850[aByteArray9857[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_264_ = 0; i_264_ < anInt9853; i_264_++) {
					for (int i_265_ = 0; i_265_ < anInt9854; i_265_++) {
						int i_266_ = anIntArray9850[aByteArray9857[i++] & 0xff];
						is[i_261_++] = i_266_ != 0 ? ~0xffffff | i_266_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method2993(boolean bool) {
		int[] is;
		if (bool) {
			int i = method2951();
			is = new int[i * method2968()];
			if (aByteArray9858 != null) {
				for (int i_267_ = 0; i_267_ < anInt9853; i_267_++) {
					int i_268_ = i_267_ * anInt9854;
					int i_269_ = anInt9852 + (i_267_ + anInt9851) * i;
					for (int i_270_ = 0; i_270_ < anInt9854; i_270_++) {
						is[i_269_++] = (aByteArray9858[i_268_] << 24 | (anIntArray9850[aByteArray9857[i_268_] & 0xff]));
						i_268_++;
					}
				}
			} else {
				for (int i_271_ = 0; i_271_ < anInt9853; i_271_++) {
					int i_272_ = i_271_ * anInt9854;
					int i_273_ = anInt9852 + (i_271_ + anInt9851) * i;
					for (int i_274_ = 0; i_274_ < anInt9854; i_274_++) {
						int i_275_ = anIntArray9850[aByteArray9857[i_272_++] & 0xff];
						if (i_275_ != 0)
							is[i_273_++] = ~0xffffff | i_275_;
						else
							is[i_273_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt9854 * anInt9853];
			int i = 0;
			int i_276_ = 0;
			if (aByteArray9858 != null) {
				for (int i_277_ = 0; i_277_ < anInt9853; i_277_++) {
					for (int i_278_ = 0; i_278_ < anInt9854; i_278_++) {
						is[i_276_++] = (aByteArray9858[i] << 24 | anIntArray9850[aByteArray9857[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_279_ = 0; i_279_ < anInt9853; i_279_++) {
					for (int i_280_ = 0; i_280_ < anInt9854; i_280_++) {
						int i_281_ = anIntArray9850[aByteArray9857[i++] & 0xff];
						is[i_276_++] = i_281_ != 0 ? ~0xffffff | i_281_ : 0;
					}
				}
			}
		}
		return is;
	}

	public boolean method2943() {
		return aByteArray9858 != null;
	}

	public void method2999(int i, int i_282_, int i_283_) {
		for (int i_284_ = 1; i_284_ < anIntArray9850.length; i_284_++) {
			if (anIntArray9850[i_284_] != 1 && anIntArray9850[i_284_] != 16711935) {
				int i_285_ = anIntArray9850[i_284_] >> 16 & 0xff;
				i_285_ += i;
				if (i_285_ < 0)
					i_285_ = 0;
				else if (i_285_ > 255)
					i_285_ = 255;
				int i_286_ = anIntArray9850[i_284_] >> 8 & 0xff;
				i_286_ += i_282_;
				if (i_286_ < 0)
					i_286_ = 0;
				else if (i_286_ > 255)
					i_286_ = 255;
				int i_287_ = anIntArray9850[i_284_] >> 0 & 0xff;
				i_287_ += i_283_;
				if (i_287_ < 0)
					i_287_ = 0;
				else if (i_287_ > 255)
					i_287_ = 255;
				anIntArray9850[i_284_] = i_285_ << 16 | i_286_ << 8 | i_287_;
			}
		}
	}

	public void method2952(int i) {
		int i_288_ = method2951();
		int i_289_ = method2968();
		if (anInt9854 != i_288_ || anInt9853 != i_289_) {
			int i_290_ = i;
			if (i_290_ > anInt9852)
				i_290_ = anInt9852;
			int i_291_ = i;
			if (i_291_ + anInt9852 + anInt9854 > i_288_)
				i_291_ = i_288_ - anInt9852 - anInt9854;
			int i_292_ = i;
			if (i_292_ > anInt9851)
				i_292_ = anInt9851;
			int i_293_ = i;
			if (i_293_ + anInt9851 + anInt9853 > i_289_)
				i_293_ = i_289_ - anInt9851 - anInt9853;
			int i_294_ = anInt9854 + i_290_ + i_291_;
			int i_295_ = anInt9853 + i_292_ + i_293_;
			byte[] is = new byte[i_294_ * i_295_];
			if (aByteArray9858 == null) {
				for (int i_296_ = 0; i_296_ < anInt9853; i_296_++) {
					int i_297_ = i_296_ * anInt9854;
					int i_298_ = (i_296_ + i_292_) * i_294_ + i_290_;
					for (int i_299_ = 0; i_299_ < anInt9854; i_299_++)
						is[i_298_++] = aByteArray9857[i_297_++];
				}
			} else {
				byte[] is_300_ = new byte[i_294_ * i_295_];
				for (int i_301_ = 0; i_301_ < anInt9853; i_301_++) {
					int i_302_ = i_301_ * anInt9854;
					int i_303_ = (i_301_ + i_292_) * i_294_ + i_290_;
					for (int i_304_ = 0; i_304_ < anInt9854; i_304_++) {
						is_300_[i_303_] = aByteArray9858[i_302_];
						is[i_303_++] = aByteArray9857[i_302_++];
					}
				}
				aByteArray9858 = is_300_;
			}
			anInt9852 -= i_290_;
			anInt9851 -= i_292_;
			anInt9855 -= i_291_;
			anInt9856 -= i_293_;
			anInt9854 = i_294_;
			anInt9853 = i_295_;
			aByteArray9857 = is;
		}
	}

	public void method2965(int i, int i_305_, int i_306_) {
		for (int i_307_ = 1; i_307_ < anIntArray9850.length; i_307_++) {
			if (anIntArray9850[i_307_] != 1 && anIntArray9850[i_307_] != 16711935) {
				int i_308_ = anIntArray9850[i_307_] >> 16 & 0xff;
				i_308_ += i;
				if (i_308_ < 0)
					i_308_ = 0;
				else if (i_308_ > 255)
					i_308_ = 255;
				int i_309_ = anIntArray9850[i_307_] >> 8 & 0xff;
				i_309_ += i_305_;
				if (i_309_ < 0)
					i_309_ = 0;
				else if (i_309_ > 255)
					i_309_ = 255;
				int i_310_ = anIntArray9850[i_307_] >> 0 & 0xff;
				i_310_ += i_306_;
				if (i_310_ < 0)
					i_310_ = 0;
				else if (i_310_ > 255)
					i_310_ = 255;
				anIntArray9850[i_307_] = i_308_ << 16 | i_309_ << 8 | i_310_;
			}
		}
	}

	public int method3002(int i, int i_311_) {
		return anIntArray9850[aByteArray9857[i + i_311_ * anInt9854] & 0xff];
	}

	public boolean method2966() {
		return true;
	}

	public int method2990() {
		return anInt9854 + anInt9852 + anInt9855;
	}

	public boolean method2963() {
		return aByteArray9858 != null;
	}

	public int method3006() {
		return anInt9854 + anInt9852 + anInt9855;
	}
}
