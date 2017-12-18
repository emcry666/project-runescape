/* Class694 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class BZIP2 {
	static final int anInt8744 = 50;
	static final int anInt8745 = 16;
	static final int anInt8746 = 23;
	static final int anInt8747 = 4096;
	static final int anInt8748 = 1;
	static final int anInt8749 = 6;
	static final int anInt8750 = 0;
	static Class692 aClass692_8751 = new Class692();

	static void method13981(Class692 class692) {
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		boolean bool_11_ = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		int i = 0;
		int[] is = null;
		int[] is_17_ = null;
		int[] is_18_ = null;
		class692.anInt8705 = -556011191;
		if (Class692.anIntArray8726 == null)
			Class692.anIntArray8726 = new int[class692.anInt8705 * -633474656];
		boolean bool_19_ = true;
		while (bool_19_) {
			byte i_20_ = method14001(class692);
			if (i_20_ == 23)
				break;
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method14001(class692);
			i_20_ = method13986(class692);
			if (i_20_ == 0) {
				/* empty */
			}
			class692.anInt8720 = 0;
			int i_21_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_21_ & 0xff) * 1840287911;
			i_21_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_21_ & 0xff) * 1840287911;
			i_21_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_21_ & 0xff) * 1840287911;
			for (int i_22_ = 0; i_22_ < 16; i_22_++) {
				i_20_ = method13986(class692);
				if (i_20_ == 1)
					class692.aBoolArray8729[i_22_] = true;
				else
					class692.aBoolArray8729[i_22_] = false;
			}
			for (int i_23_ = 0; i_23_ < 256; i_23_++)
				class692.aBoolArray8728[i_23_] = false;
			for (int i_24_ = 0; i_24_ < 16; i_24_++) {
				if (class692.aBoolArray8729[i_24_]) {
					for (int i_25_ = 0; i_25_ < 16; i_25_++) {
						i_20_ = method13986(class692);
						if (i_20_ == 1)
							class692.aBoolArray8728[i_24_ * 16 + i_25_] = true;
					}
				}
			}
			method13984(class692);
			int i_26_ = class692.anInt8702 * 313027013 + 2;
			int i_27_ = method13992(3, class692);
			int i_28_ = method13992(15, class692);
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				int i_30_ = 0;
				for (;;) {
					i_20_ = method13986(class692);
					if (i_20_ == 0)
						break;
					i_30_++;
				}
				class692.aByteArray8734[i_29_] = (byte) i_30_;
			}
			byte[] is_31_ = new byte[6];
			for (byte i_32_ = 0; i_32_ < i_27_; i_32_++)
				is_31_[i_32_] = i_32_;
			for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
				byte i_34_ = class692.aByteArray8734[i_33_];
				byte i_35_ = is_31_[i_34_];
				for (/**/; i_34_ > 0; i_34_--)
					is_31_[i_34_] = is_31_[i_34_ - 1];
				is_31_[0] = i_35_;
				class692.aByteArray8733[i_33_] = i_35_;
			}
			for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
				int i_37_ = method13992(5, class692);
				for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
					for (;;) {
						i_20_ = method13986(class692);
						if (i_20_ == 0)
							break;
						i_20_ = method13986(class692);
						if (i_20_ == 0)
							i_37_++;
						else
							i_37_--;
					}
					class692.aByteArrayArray8735[i_36_][i_38_] = (byte) i_37_;
				}
			}
			for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
				int i_40_ = 32;
				byte i_41_ = 0;
				for (int i_42_ = 0; i_42_ < i_26_; i_42_++) {
					if (class692.aByteArrayArray8735[i_39_][i_42_] > i_41_)
						i_41_ = class692.aByteArrayArray8735[i_39_][i_42_];
					if (class692.aByteArrayArray8735[i_39_][i_42_] < i_40_)
						i_40_ = class692.aByteArrayArray8735[i_39_][i_42_];
				}
				method13988(class692.anIntArrayArray8736[i_39_], class692.anIntArrayArray8714[i_39_], class692.anIntArrayArray8738[i_39_], class692.aByteArrayArray8735[i_39_], i_40_, i_41_, i_26_);
				class692.anIntArray8713[i_39_] = i_40_;
			}
			int i_43_ = class692.anInt8702 * 313027013 + 1;
			int i_44_ = -1;
			int i_45_ = 0;
			for (int i_46_ = 0; i_46_ <= 255; i_46_++)
				class692.anIntArray8723[i_46_] = 0;
			int i_47_ = 4095;
			for (int i_48_ = 15; i_48_ >= 0; i_48_--) {
				for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
					class692.aByteArray8712[i_47_] = (byte) (i_48_ * 16 + i_49_);
					i_47_--;
				}
				class692.anIntArray8732[i_48_] = i_47_ + 1;
			}
			int i_50_ = 0;
			if (i_45_ == 0) {
				i_44_++;
				i_45_ = 50;
				byte i_51_ = class692.aByteArray8733[i_44_];
				i = class692.anIntArray8713[i_51_];
				is = class692.anIntArrayArray8736[i_51_];
				is_18_ = class692.anIntArrayArray8738[i_51_];
				is_17_ = class692.anIntArrayArray8714[i_51_];
			}
			i_45_--;
			int i_52_ = i;
			int i_53_;
			int i_54_;
			for (i_54_ = method13992(i_52_, class692); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
				i_52_++;
				i_53_ = method13986(class692);
			}
			int i_55_ = is_18_[i_54_ - is_17_[i_52_]];
			while (i_55_ != i_43_) {
				if (i_55_ == 0 || i_55_ == 1) {
					int i_56_ = -1;
					int i_57_ = 1;
					do {
						if (i_55_ == 0)
							i_56_ += 1 * i_57_;
						else if (i_55_ == 1)
							i_56_ += 2 * i_57_;
						i_57_ *= 2;
						if (i_45_ == 0) {
							i_44_++;
							i_45_ = 50;
							byte i_58_ = class692.aByteArray8733[i_44_];
							i = class692.anIntArray8713[i_58_];
							is = class692.anIntArrayArray8736[i_58_];
							is_18_ = class692.anIntArrayArray8738[i_58_];
							is_17_ = class692.anIntArrayArray8714[i_58_];
						}
						i_45_--;
						i_52_ = i;
						for (i_54_ = method13992(i_52_, class692); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
							i_52_++;
							i_53_ = method13986(class692);
						}
						i_55_ = is_18_[i_54_ - is_17_[i_52_]];
					} while (i_55_ == 0 || i_55_ == 1);
					i_56_++;
					i_21_ = (class692.aByteArray8730[(class692.aByteArray8712[class692.anIntArray8732[0]]) & 0xff]);
					class692.anIntArray8723[i_21_ & 0xff] += i_56_;
					for (/**/; i_56_ > 0; i_56_--) {
						Class692.anIntArray8726[i_50_] = i_21_ & 0xff;
						i_50_++;
					}
				} else {
					int i_59_ = i_55_ - 1;
					if (i_59_ < 16) {
						int i_60_ = class692.anIntArray8732[0];
						i_20_ = class692.aByteArray8712[i_60_ + i_59_];
						for (/**/; i_59_ > 3; i_59_ -= 4) {
							int i_61_ = i_60_ + i_59_;
							class692.aByteArray8712[i_61_] = class692.aByteArray8712[i_61_ - 1];
							class692.aByteArray8712[i_61_ - 1] = class692.aByteArray8712[i_61_ - 2];
							class692.aByteArray8712[i_61_ - 2] = class692.aByteArray8712[i_61_ - 3];
							class692.aByteArray8712[i_61_ - 3] = class692.aByteArray8712[i_61_ - 4];
						}
						for (/**/; i_59_ > 0; i_59_--)
							class692.aByteArray8712[i_60_ + i_59_] = class692.aByteArray8712[i_60_ + i_59_ - 1];
						class692.aByteArray8712[i_60_] = i_20_;
					} else {
						int i_62_ = i_59_ / 16;
						int i_63_ = i_59_ % 16;
						int i_64_ = class692.anIntArray8732[i_62_] + i_63_;
						i_20_ = class692.aByteArray8712[i_64_];
						for (/**/; i_64_ > class692.anIntArray8732[i_62_]; i_64_--)
							class692.aByteArray8712[i_64_] = class692.aByteArray8712[i_64_ - 1];
						class692.anIntArray8732[i_62_]++;
						for (/**/; i_62_ > 0; i_62_--) {
							class692.anIntArray8732[i_62_]--;
							class692.aByteArray8712[(class692.anIntArray8732[i_62_])] = (class692.aByteArray8712[(class692.anIntArray8732[i_62_ - 1] + 16 - 1)]);
						}
						class692.anIntArray8732[0]--;
						class692.aByteArray8712[class692.anIntArray8732[0]] = i_20_;
						if (class692.anIntArray8732[0] == 0) {
							i_47_ = 4095;
							for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
								for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
									class692.aByteArray8712[i_47_] = (class692.aByteArray8712[(class692.anIntArray8732[i_65_] + i_66_)]);
									i_47_--;
								}
								class692.anIntArray8732[i_65_] = i_47_ + 1;
							}
						}
					}
					class692.anIntArray8723[class692.aByteArray8730[i_20_ & 0xff] & 0xff]++;
					Class692.anIntArray8726[i_50_] = class692.aByteArray8730[i_20_ & 0xff] & 0xff;
					i_50_++;
					if (i_45_ == 0) {
						i_44_++;
						i_45_ = 50;
						byte i_67_ = class692.aByteArray8733[i_44_];
						i = class692.anIntArray8713[i_67_];
						is = class692.anIntArrayArray8736[i_67_];
						is_18_ = class692.anIntArrayArray8738[i_67_];
						is_17_ = class692.anIntArrayArray8714[i_67_];
					}
					i_45_--;
					i_52_ = i;
					for (i_54_ = method13992(i_52_, class692); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
						i_52_++;
						i_53_ = method13986(class692);
					}
					i_55_ = is_18_[i_54_ - is_17_[i_52_]];
				}
			}
			class692.anInt8737 = 0;
			class692.aByte8731 = (byte) 0;
			class692.anIntArray8719[0] = 0;
			for (int i_68_ = 1; i_68_ <= 256; i_68_++)
				class692.anIntArray8719[i_68_] = class692.anIntArray8723[i_68_ - 1];
			for (int i_69_ = 1; i_69_ <= 256; i_69_++)
				class692.anIntArray8719[i_69_] += class692.anIntArray8719[i_69_ - 1];
			for (int i_70_ = 0; i_70_ < i_50_; i_70_++) {
				i_21_ = (byte) (Class692.anIntArray8726[i_70_] & 0xff);
				Class692.anIntArray8726[class692.anIntArray8719[i_21_ & 0xff]] |= i_70_ << 8;
				class692.anIntArray8719[i_21_ & 0xff]++;
			}
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8720 * -1220798697] >> 8) * -1930269991;
			class692.anInt8716 = 0;
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8715 * 461731177] * -1930269991);
			class692.anInt8722 = (byte) (class692.anInt8715 * 461731177 & 0xff) * 1590760051;
			Class692 class692_71_;
			(class692_71_ = class692).anInt8715 = (class692_71_.anInt8715 * 461731177 >> 8) * -1930269991;
			class692.anInt8716 += 1150121641;
			class692.anInt8721 = i_50_ * 1916611943;
			method13983(class692);
			if ((class692.anInt8716 * 686919065 == class692.anInt8721 * 223387223 + 1) && class692.anInt8737 * 1763169589 == 0)
				bool_19_ = true;
			else
				bool_19_ = false;
		}
	}

	static void method13982(Class692 class692) {
		boolean bool = false;
		boolean bool_72_ = false;
		boolean bool_73_ = false;
		boolean bool_74_ = false;
		boolean bool_75_ = false;
		boolean bool_76_ = false;
		boolean bool_77_ = false;
		boolean bool_78_ = false;
		boolean bool_79_ = false;
		boolean bool_80_ = false;
		boolean bool_81_ = false;
		boolean bool_82_ = false;
		boolean bool_83_ = false;
		boolean bool_84_ = false;
		boolean bool_85_ = false;
		boolean bool_86_ = false;
		boolean bool_87_ = false;
		boolean bool_88_ = false;
		int i = 0;
		int[] is = null;
		int[] is_89_ = null;
		int[] is_90_ = null;
		class692.anInt8705 = -556011191;
		if (Class692.anIntArray8726 == null)
			Class692.anIntArray8726 = new int[class692.anInt8705 * -633474656];
		boolean bool_91_ = true;
		while (bool_91_) {
			byte i_92_ = method14001(class692);
			if (i_92_ == 23)
				break;
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method14001(class692);
			i_92_ = method13986(class692);
			if (i_92_ == 0) {
				/* empty */
			}
			class692.anInt8720 = 0;
			int i_93_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_93_ & 0xff) * 1840287911;
			i_93_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_93_ & 0xff) * 1840287911;
			i_93_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_93_ & 0xff) * 1840287911;
			for (int i_94_ = 0; i_94_ < 16; i_94_++) {
				i_92_ = method13986(class692);
				if (i_92_ == 1)
					class692.aBoolArray8729[i_94_] = true;
				else
					class692.aBoolArray8729[i_94_] = false;
			}
			for (int i_95_ = 0; i_95_ < 256; i_95_++)
				class692.aBoolArray8728[i_95_] = false;
			for (int i_96_ = 0; i_96_ < 16; i_96_++) {
				if (class692.aBoolArray8729[i_96_]) {
					for (int i_97_ = 0; i_97_ < 16; i_97_++) {
						i_92_ = method13986(class692);
						if (i_92_ == 1)
							class692.aBoolArray8728[i_96_ * 16 + i_97_] = true;
					}
				}
			}
			method13984(class692);
			int i_98_ = class692.anInt8702 * 313027013 + 2;
			int i_99_ = method13992(3, class692);
			int i_100_ = method13992(15, class692);
			for (int i_101_ = 0; i_101_ < i_100_; i_101_++) {
				int i_102_ = 0;
				for (;;) {
					i_92_ = method13986(class692);
					if (i_92_ == 0)
						break;
					i_102_++;
				}
				class692.aByteArray8734[i_101_] = (byte) i_102_;
			}
			byte[] is_103_ = new byte[6];
			for (byte i_104_ = 0; i_104_ < i_99_; i_104_++)
				is_103_[i_104_] = i_104_;
			for (int i_105_ = 0; i_105_ < i_100_; i_105_++) {
				byte i_106_ = class692.aByteArray8734[i_105_];
				byte i_107_ = is_103_[i_106_];
				for (/**/; i_106_ > 0; i_106_--)
					is_103_[i_106_] = is_103_[i_106_ - 1];
				is_103_[0] = i_107_;
				class692.aByteArray8733[i_105_] = i_107_;
			}
			for (int i_108_ = 0; i_108_ < i_99_; i_108_++) {
				int i_109_ = method13992(5, class692);
				for (int i_110_ = 0; i_110_ < i_98_; i_110_++) {
					for (;;) {
						i_92_ = method13986(class692);
						if (i_92_ == 0)
							break;
						i_92_ = method13986(class692);
						if (i_92_ == 0)
							i_109_++;
						else
							i_109_--;
					}
					class692.aByteArrayArray8735[i_108_][i_110_] = (byte) i_109_;
				}
			}
			for (int i_111_ = 0; i_111_ < i_99_; i_111_++) {
				int i_112_ = 32;
				byte i_113_ = 0;
				for (int i_114_ = 0; i_114_ < i_98_; i_114_++) {
					if (class692.aByteArrayArray8735[i_111_][i_114_] > i_113_)
						i_113_ = class692.aByteArrayArray8735[i_111_][i_114_];
					if (class692.aByteArrayArray8735[i_111_][i_114_] < i_112_)
						i_112_ = class692.aByteArrayArray8735[i_111_][i_114_];
				}
				method13988(class692.anIntArrayArray8736[i_111_], class692.anIntArrayArray8714[i_111_], class692.anIntArrayArray8738[i_111_], class692.aByteArrayArray8735[i_111_], i_112_, i_113_, i_98_);
				class692.anIntArray8713[i_111_] = i_112_;
			}
			int i_115_ = class692.anInt8702 * 313027013 + 1;
			int i_116_ = -1;
			int i_117_ = 0;
			for (int i_118_ = 0; i_118_ <= 255; i_118_++)
				class692.anIntArray8723[i_118_] = 0;
			int i_119_ = 4095;
			for (int i_120_ = 15; i_120_ >= 0; i_120_--) {
				for (int i_121_ = 15; i_121_ >= 0; i_121_--) {
					class692.aByteArray8712[i_119_] = (byte) (i_120_ * 16 + i_121_);
					i_119_--;
				}
				class692.anIntArray8732[i_120_] = i_119_ + 1;
			}
			int i_122_ = 0;
			if (i_117_ == 0) {
				i_116_++;
				i_117_ = 50;
				byte i_123_ = class692.aByteArray8733[i_116_];
				i = class692.anIntArray8713[i_123_];
				is = class692.anIntArrayArray8736[i_123_];
				is_90_ = class692.anIntArrayArray8738[i_123_];
				is_89_ = class692.anIntArrayArray8714[i_123_];
			}
			i_117_--;
			int i_124_ = i;
			int i_125_;
			int i_126_;
			for (i_126_ = method13992(i_124_, class692); i_126_ > is[i_124_]; i_126_ = i_126_ << 1 | i_125_) {
				i_124_++;
				i_125_ = method13986(class692);
			}
			int i_127_ = is_90_[i_126_ - is_89_[i_124_]];
			while (i_127_ != i_115_) {
				if (i_127_ == 0 || i_127_ == 1) {
					int i_128_ = -1;
					int i_129_ = 1;
					do {
						if (i_127_ == 0)
							i_128_ += 1 * i_129_;
						else if (i_127_ == 1)
							i_128_ += 2 * i_129_;
						i_129_ *= 2;
						if (i_117_ == 0) {
							i_116_++;
							i_117_ = 50;
							byte i_130_ = class692.aByteArray8733[i_116_];
							i = class692.anIntArray8713[i_130_];
							is = class692.anIntArrayArray8736[i_130_];
							is_90_ = class692.anIntArrayArray8738[i_130_];
							is_89_ = class692.anIntArrayArray8714[i_130_];
						}
						i_117_--;
						i_124_ = i;
						for (i_126_ = method13992(i_124_, class692); i_126_ > is[i_124_]; i_126_ = i_126_ << 1 | i_125_) {
							i_124_++;
							i_125_ = method13986(class692);
						}
						i_127_ = is_90_[i_126_ - is_89_[i_124_]];
					} while (i_127_ == 0 || i_127_ == 1);
					i_128_++;
					i_93_ = (class692.aByteArray8730[(class692.aByteArray8712[class692.anIntArray8732[0]]) & 0xff]);
					class692.anIntArray8723[i_93_ & 0xff] += i_128_;
					for (/**/; i_128_ > 0; i_128_--) {
						Class692.anIntArray8726[i_122_] = i_93_ & 0xff;
						i_122_++;
					}
				} else {
					int i_131_ = i_127_ - 1;
					if (i_131_ < 16) {
						int i_132_ = class692.anIntArray8732[0];
						i_92_ = class692.aByteArray8712[i_132_ + i_131_];
						for (/**/; i_131_ > 3; i_131_ -= 4) {
							int i_133_ = i_132_ + i_131_;
							class692.aByteArray8712[i_133_] = class692.aByteArray8712[i_133_ - 1];
							class692.aByteArray8712[i_133_ - 1] = class692.aByteArray8712[i_133_ - 2];
							class692.aByteArray8712[i_133_ - 2] = class692.aByteArray8712[i_133_ - 3];
							class692.aByteArray8712[i_133_ - 3] = class692.aByteArray8712[i_133_ - 4];
						}
						for (/**/; i_131_ > 0; i_131_--)
							class692.aByteArray8712[i_132_ + i_131_] = class692.aByteArray8712[i_132_ + i_131_ - 1];
						class692.aByteArray8712[i_132_] = i_92_;
					} else {
						int i_134_ = i_131_ / 16;
						int i_135_ = i_131_ % 16;
						int i_136_ = class692.anIntArray8732[i_134_] + i_135_;
						i_92_ = class692.aByteArray8712[i_136_];
						for (/**/; i_136_ > class692.anIntArray8732[i_134_]; i_136_--)
							class692.aByteArray8712[i_136_] = class692.aByteArray8712[i_136_ - 1];
						class692.anIntArray8732[i_134_]++;
						for (/**/; i_134_ > 0; i_134_--) {
							class692.anIntArray8732[i_134_]--;
							class692.aByteArray8712[(class692.anIntArray8732[i_134_])] = (class692.aByteArray8712[(class692.anIntArray8732[i_134_ - 1] + 16 - 1)]);
						}
						class692.anIntArray8732[0]--;
						class692.aByteArray8712[class692.anIntArray8732[0]] = i_92_;
						if (class692.anIntArray8732[0] == 0) {
							i_119_ = 4095;
							for (int i_137_ = 15; i_137_ >= 0; i_137_--) {
								for (int i_138_ = 15; i_138_ >= 0; i_138_--) {
									class692.aByteArray8712[i_119_] = (class692.aByteArray8712[(class692.anIntArray8732[i_137_] + i_138_)]);
									i_119_--;
								}
								class692.anIntArray8732[i_137_] = i_119_ + 1;
							}
						}
					}
					class692.anIntArray8723[class692.aByteArray8730[i_92_ & 0xff] & 0xff]++;
					Class692.anIntArray8726[i_122_] = class692.aByteArray8730[i_92_ & 0xff] & 0xff;
					i_122_++;
					if (i_117_ == 0) {
						i_116_++;
						i_117_ = 50;
						byte i_139_ = class692.aByteArray8733[i_116_];
						i = class692.anIntArray8713[i_139_];
						is = class692.anIntArrayArray8736[i_139_];
						is_90_ = class692.anIntArrayArray8738[i_139_];
						is_89_ = class692.anIntArrayArray8714[i_139_];
					}
					i_117_--;
					i_124_ = i;
					for (i_126_ = method13992(i_124_, class692); i_126_ > is[i_124_]; i_126_ = i_126_ << 1 | i_125_) {
						i_124_++;
						i_125_ = method13986(class692);
					}
					i_127_ = is_90_[i_126_ - is_89_[i_124_]];
				}
			}
			class692.anInt8737 = 0;
			class692.aByte8731 = (byte) 0;
			class692.anIntArray8719[0] = 0;
			for (int i_140_ = 1; i_140_ <= 256; i_140_++)
				class692.anIntArray8719[i_140_] = class692.anIntArray8723[i_140_ - 1];
			for (int i_141_ = 1; i_141_ <= 256; i_141_++)
				class692.anIntArray8719[i_141_] += class692.anIntArray8719[i_141_ - 1];
			for (int i_142_ = 0; i_142_ < i_122_; i_142_++) {
				i_93_ = (byte) (Class692.anIntArray8726[i_142_] & 0xff);
				Class692.anIntArray8726[class692.anIntArray8719[i_93_ & 0xff]] |= i_142_ << 8;
				class692.anIntArray8719[i_93_ & 0xff]++;
			}
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8720 * -1220798697] >> 8) * -1930269991;
			class692.anInt8716 = 0;
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8715 * 461731177] * -1930269991);
			class692.anInt8722 = (byte) (class692.anInt8715 * 461731177 & 0xff) * 1590760051;
			Class692 class692_143_;
			(class692_143_ = class692).anInt8715 = (class692_143_.anInt8715 * 461731177 >> 8) * -1930269991;
			class692.anInt8716 += 1150121641;
			class692.anInt8721 = i_122_ * 1916611943;
			method13983(class692);
			if ((class692.anInt8716 * 686919065 == class692.anInt8721 * 223387223 + 1) && class692.anInt8737 * 1763169589 == 0)
				bool_91_ = true;
			else
				bool_91_ = false;
		}
	}

	static void method13983(Class692 class692) {
		byte i = class692.aByte8731;
		int i_144_ = class692.anInt8737 * 1763169589;
		int i_145_ = class692.anInt8716 * 686919065;
		int i_146_ = class692.anInt8722 * -1551179077;
		int[] is = Class692.anIntArray8726;
		int i_147_ = class692.anInt8715 * 461731177;
		byte[] is_148_ = class692.aByteArray8711;
		int i_149_ = class692.anInt8740 * -691814031;
		int i_150_ = class692.anInt8710 * 1659791497;
		int i_151_ = i_150_;
		int i_152_ = class692.anInt8721 * 223387223 + 1;
		while_141_: for (;;) {
			if (i_144_ > 0) {
				for (;;) {
					if (i_150_ == 0)
						break while_141_;
					if (i_144_ == 1)
						break;
					is_148_[i_149_] = i;
					i_144_--;
					i_149_++;
					i_150_--;
				}
				if (i_150_ == 0) {
					i_144_ = 1;
					break;
				}
				is_148_[i_149_] = i;
				i_149_++;
				i_150_--;
			}
			for (;;) {
				if (i_145_ == i_152_) {
					i_144_ = 0;
					break while_141_;
				}
				i = (byte) i_146_;
				i_147_ = is[i_147_];
				int i_153_ = (byte) i_147_;
				i_147_ >>= 8;
				i_145_++;
				if (i_153_ != i_146_) {
					i_146_ = i_153_;
					if (i_150_ == 0) {
						i_144_ = 1;
						break while_141_;
					}
					is_148_[i_149_] = i;
					i_149_++;
					i_150_--;
				} else {
					if (i_145_ != i_152_)
						break;
					if (i_150_ == 0) {
						i_144_ = 1;
						break while_141_;
					}
					is_148_[i_149_] = i;
					i_149_++;
					i_150_--;
				}
			}
			i_144_ = 2;
			i_147_ = is[i_147_];
			int i_154_ = (byte) i_147_;
			i_147_ >>= 8;
			if (++i_145_ != i_152_) {
				if (i_154_ != i_146_)
					i_146_ = i_154_;
				else {
					i_144_ = 3;
					i_147_ = is[i_147_];
					i_154_ = (byte) i_147_;
					i_147_ >>= 8;
					if (++i_145_ != i_152_) {
						if (i_154_ != i_146_)
							i_146_ = i_154_;
						else {
							i_147_ = is[i_147_];
							i_154_ = (byte) i_147_;
							i_147_ >>= 8;
							i_145_++;
							i_144_ = (i_154_ & 0xff) + 4;
							i_147_ = is[i_147_];
							i_146_ = (byte) i_147_;
							i_147_ >>= 8;
							i_145_++;
						}
					}
				}
			}
		}
		int i_155_ = class692.anInt8724 * 2067734881;
		class692.anInt8724 += (i_151_ - i_150_) * 122765985;
		if (class692.anInt8724 * 2067734881 >= i_155_) {
			/* empty */
		}
		class692.aByte8731 = i;
		class692.anInt8737 = i_144_ * 1409389853;
		class692.anInt8716 = i_145_ * 1150121641;
		class692.anInt8722 = i_146_ * 1590760051;
		Class692.anIntArray8726 = is;
		class692.anInt8715 = i_147_ * -1930269991;
		class692.aByteArray8711 = is_148_;
		class692.anInt8740 = i_149_ * -1602297967;
		class692.anInt8710 = i_150_ * -2108977735;
	}

	static void method13984(Class692 class692) {
		class692.anInt8702 = 0;
		for (int i = 0; i < 256; i++) {
			if (class692.aBoolArray8728[i]) {
				class692.aByteArray8730[class692.anInt8702 * 313027013] = (byte) i;
				class692.anInt8702 += 1411329293;
			}
		}
	}

	static void method13985(int[] is, int[] is_156_, int[] is_157_, byte[] is_158_, int i, int i_159_, int i_160_) {
		int i_161_ = 0;
		for (int i_162_ = i; i_162_ <= i_159_; i_162_++) {
			for (int i_163_ = 0; i_163_ < i_160_; i_163_++) {
				if (is_158_[i_163_] == i_162_) {
					is_157_[i_161_] = i_163_;
					i_161_++;
				}
			}
		}
		for (int i_164_ = 0; i_164_ < 23; i_164_++)
			is_156_[i_164_] = 0;
		for (int i_165_ = 0; i_165_ < i_160_; i_165_++)
			is_156_[is_158_[i_165_] + 1]++;
		for (int i_166_ = 1; i_166_ < 23; i_166_++)
			is_156_[i_166_] += is_156_[i_166_ - 1];
		for (int i_167_ = 0; i_167_ < 23; i_167_++)
			is[i_167_] = 0;
		int i_168_ = 0;
		for (int i_169_ = i; i_169_ <= i_159_; i_169_++) {
			i_168_ += is_156_[i_169_ + 1] - is_156_[i_169_];
			is[i_169_] = i_168_ - 1;
			i_168_ <<= 1;
		}
		for (int i_170_ = i + 1; i_170_ <= i_159_; i_170_++)
			is_156_[i_170_] = (is[i_170_ - 1] + 1 << 1) - is_156_[i_170_];
	}

	static byte method13986(Class692 class692) {
		return (byte) method13992(1, class692);
	}

	BZIP2() throws Throwable {
		throw new Error();
	}

	static void method13987(Class692 class692) {
		boolean bool = false;
		boolean bool_171_ = false;
		boolean bool_172_ = false;
		boolean bool_173_ = false;
		boolean bool_174_ = false;
		boolean bool_175_ = false;
		boolean bool_176_ = false;
		boolean bool_177_ = false;
		boolean bool_178_ = false;
		boolean bool_179_ = false;
		boolean bool_180_ = false;
		boolean bool_181_ = false;
		boolean bool_182_ = false;
		boolean bool_183_ = false;
		boolean bool_184_ = false;
		boolean bool_185_ = false;
		boolean bool_186_ = false;
		boolean bool_187_ = false;
		int i = 0;
		int[] is = null;
		int[] is_188_ = null;
		int[] is_189_ = null;
		class692.anInt8705 = -556011191;
		if (Class692.anIntArray8726 == null)
			Class692.anIntArray8726 = new int[class692.anInt8705 * -633474656];
		boolean bool_190_ = true;
		while (bool_190_) {
			byte i_191_ = method14001(class692);
			if (i_191_ == 23)
				break;
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method14001(class692);
			i_191_ = method13986(class692);
			if (i_191_ == 0) {
				/* empty */
			}
			class692.anInt8720 = 0;
			int i_192_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_192_ & 0xff) * 1840287911;
			i_192_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_192_ & 0xff) * 1840287911;
			i_192_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_192_ & 0xff) * 1840287911;
			for (int i_193_ = 0; i_193_ < 16; i_193_++) {
				i_191_ = method13986(class692);
				if (i_191_ == 1)
					class692.aBoolArray8729[i_193_] = true;
				else
					class692.aBoolArray8729[i_193_] = false;
			}
			for (int i_194_ = 0; i_194_ < 256; i_194_++)
				class692.aBoolArray8728[i_194_] = false;
			for (int i_195_ = 0; i_195_ < 16; i_195_++) {
				if (class692.aBoolArray8729[i_195_]) {
					for (int i_196_ = 0; i_196_ < 16; i_196_++) {
						i_191_ = method13986(class692);
						if (i_191_ == 1)
							class692.aBoolArray8728[i_195_ * 16 + i_196_] = true;
					}
				}
			}
			method13984(class692);
			int i_197_ = class692.anInt8702 * 313027013 + 2;
			int i_198_ = method13992(3, class692);
			int i_199_ = method13992(15, class692);
			for (int i_200_ = 0; i_200_ < i_199_; i_200_++) {
				int i_201_ = 0;
				for (;;) {
					i_191_ = method13986(class692);
					if (i_191_ == 0)
						break;
					i_201_++;
				}
				class692.aByteArray8734[i_200_] = (byte) i_201_;
			}
			byte[] is_202_ = new byte[6];
			for (byte i_203_ = 0; i_203_ < i_198_; i_203_++)
				is_202_[i_203_] = i_203_;
			for (int i_204_ = 0; i_204_ < i_199_; i_204_++) {
				byte i_205_ = class692.aByteArray8734[i_204_];
				byte i_206_ = is_202_[i_205_];
				for (/**/; i_205_ > 0; i_205_--)
					is_202_[i_205_] = is_202_[i_205_ - 1];
				is_202_[0] = i_206_;
				class692.aByteArray8733[i_204_] = i_206_;
			}
			for (int i_207_ = 0; i_207_ < i_198_; i_207_++) {
				int i_208_ = method13992(5, class692);
				for (int i_209_ = 0; i_209_ < i_197_; i_209_++) {
					for (;;) {
						i_191_ = method13986(class692);
						if (i_191_ == 0)
							break;
						i_191_ = method13986(class692);
						if (i_191_ == 0)
							i_208_++;
						else
							i_208_--;
					}
					class692.aByteArrayArray8735[i_207_][i_209_] = (byte) i_208_;
				}
			}
			for (int i_210_ = 0; i_210_ < i_198_; i_210_++) {
				int i_211_ = 32;
				byte i_212_ = 0;
				for (int i_213_ = 0; i_213_ < i_197_; i_213_++) {
					if (class692.aByteArrayArray8735[i_210_][i_213_] > i_212_)
						i_212_ = class692.aByteArrayArray8735[i_210_][i_213_];
					if (class692.aByteArrayArray8735[i_210_][i_213_] < i_211_)
						i_211_ = class692.aByteArrayArray8735[i_210_][i_213_];
				}
				method13988(class692.anIntArrayArray8736[i_210_], class692.anIntArrayArray8714[i_210_], class692.anIntArrayArray8738[i_210_], class692.aByteArrayArray8735[i_210_], i_211_, i_212_, i_197_);
				class692.anIntArray8713[i_210_] = i_211_;
			}
			int i_214_ = class692.anInt8702 * 313027013 + 1;
			int i_215_ = -1;
			int i_216_ = 0;
			for (int i_217_ = 0; i_217_ <= 255; i_217_++)
				class692.anIntArray8723[i_217_] = 0;
			int i_218_ = 4095;
			for (int i_219_ = 15; i_219_ >= 0; i_219_--) {
				for (int i_220_ = 15; i_220_ >= 0; i_220_--) {
					class692.aByteArray8712[i_218_] = (byte) (i_219_ * 16 + i_220_);
					i_218_--;
				}
				class692.anIntArray8732[i_219_] = i_218_ + 1;
			}
			int i_221_ = 0;
			if (i_216_ == 0) {
				i_215_++;
				i_216_ = 50;
				byte i_222_ = class692.aByteArray8733[i_215_];
				i = class692.anIntArray8713[i_222_];
				is = class692.anIntArrayArray8736[i_222_];
				is_189_ = class692.anIntArrayArray8738[i_222_];
				is_188_ = class692.anIntArrayArray8714[i_222_];
			}
			i_216_--;
			int i_223_ = i;
			int i_224_;
			int i_225_;
			for (i_225_ = method13992(i_223_, class692); i_225_ > is[i_223_]; i_225_ = i_225_ << 1 | i_224_) {
				i_223_++;
				i_224_ = method13986(class692);
			}
			int i_226_ = is_189_[i_225_ - is_188_[i_223_]];
			while (i_226_ != i_214_) {
				if (i_226_ == 0 || i_226_ == 1) {
					int i_227_ = -1;
					int i_228_ = 1;
					do {
						if (i_226_ == 0)
							i_227_ += 1 * i_228_;
						else if (i_226_ == 1)
							i_227_ += 2 * i_228_;
						i_228_ *= 2;
						if (i_216_ == 0) {
							i_215_++;
							i_216_ = 50;
							byte i_229_ = class692.aByteArray8733[i_215_];
							i = class692.anIntArray8713[i_229_];
							is = class692.anIntArrayArray8736[i_229_];
							is_189_ = class692.anIntArrayArray8738[i_229_];
							is_188_ = class692.anIntArrayArray8714[i_229_];
						}
						i_216_--;
						i_223_ = i;
						for (i_225_ = method13992(i_223_, class692); i_225_ > is[i_223_]; i_225_ = i_225_ << 1 | i_224_) {
							i_223_++;
							i_224_ = method13986(class692);
						}
						i_226_ = is_189_[i_225_ - is_188_[i_223_]];
					} while (i_226_ == 0 || i_226_ == 1);
					i_227_++;
					i_192_ = (class692.aByteArray8730[(class692.aByteArray8712[class692.anIntArray8732[0]]) & 0xff]);
					class692.anIntArray8723[i_192_ & 0xff] += i_227_;
					for (/**/; i_227_ > 0; i_227_--) {
						Class692.anIntArray8726[i_221_] = i_192_ & 0xff;
						i_221_++;
					}
				} else {
					int i_230_ = i_226_ - 1;
					if (i_230_ < 16) {
						int i_231_ = class692.anIntArray8732[0];
						i_191_ = class692.aByteArray8712[i_231_ + i_230_];
						for (/**/; i_230_ > 3; i_230_ -= 4) {
							int i_232_ = i_231_ + i_230_;
							class692.aByteArray8712[i_232_] = class692.aByteArray8712[i_232_ - 1];
							class692.aByteArray8712[i_232_ - 1] = class692.aByteArray8712[i_232_ - 2];
							class692.aByteArray8712[i_232_ - 2] = class692.aByteArray8712[i_232_ - 3];
							class692.aByteArray8712[i_232_ - 3] = class692.aByteArray8712[i_232_ - 4];
						}
						for (/**/; i_230_ > 0; i_230_--)
							class692.aByteArray8712[i_231_ + i_230_] = class692.aByteArray8712[i_231_ + i_230_ - 1];
						class692.aByteArray8712[i_231_] = i_191_;
					} else {
						int i_233_ = i_230_ / 16;
						int i_234_ = i_230_ % 16;
						int i_235_ = class692.anIntArray8732[i_233_] + i_234_;
						i_191_ = class692.aByteArray8712[i_235_];
						for (/**/; i_235_ > class692.anIntArray8732[i_233_]; i_235_--)
							class692.aByteArray8712[i_235_] = class692.aByteArray8712[i_235_ - 1];
						class692.anIntArray8732[i_233_]++;
						for (/**/; i_233_ > 0; i_233_--) {
							class692.anIntArray8732[i_233_]--;
							class692.aByteArray8712[(class692.anIntArray8732[i_233_])] = (class692.aByteArray8712[(class692.anIntArray8732[i_233_ - 1] + 16 - 1)]);
						}
						class692.anIntArray8732[0]--;
						class692.aByteArray8712[class692.anIntArray8732[0]] = i_191_;
						if (class692.anIntArray8732[0] == 0) {
							i_218_ = 4095;
							for (int i_236_ = 15; i_236_ >= 0; i_236_--) {
								for (int i_237_ = 15; i_237_ >= 0; i_237_--) {
									class692.aByteArray8712[i_218_] = (class692.aByteArray8712[(class692.anIntArray8732[i_236_] + i_237_)]);
									i_218_--;
								}
								class692.anIntArray8732[i_236_] = i_218_ + 1;
							}
						}
					}
					class692.anIntArray8723[class692.aByteArray8730[i_191_ & 0xff] & 0xff]++;
					Class692.anIntArray8726[i_221_] = class692.aByteArray8730[i_191_ & 0xff] & 0xff;
					i_221_++;
					if (i_216_ == 0) {
						i_215_++;
						i_216_ = 50;
						byte i_238_ = class692.aByteArray8733[i_215_];
						i = class692.anIntArray8713[i_238_];
						is = class692.anIntArrayArray8736[i_238_];
						is_189_ = class692.anIntArrayArray8738[i_238_];
						is_188_ = class692.anIntArrayArray8714[i_238_];
					}
					i_216_--;
					i_223_ = i;
					for (i_225_ = method13992(i_223_, class692); i_225_ > is[i_223_]; i_225_ = i_225_ << 1 | i_224_) {
						i_223_++;
						i_224_ = method13986(class692);
					}
					i_226_ = is_189_[i_225_ - is_188_[i_223_]];
				}
			}
			class692.anInt8737 = 0;
			class692.aByte8731 = (byte) 0;
			class692.anIntArray8719[0] = 0;
			for (int i_239_ = 1; i_239_ <= 256; i_239_++)
				class692.anIntArray8719[i_239_] = class692.anIntArray8723[i_239_ - 1];
			for (int i_240_ = 1; i_240_ <= 256; i_240_++)
				class692.anIntArray8719[i_240_] += class692.anIntArray8719[i_240_ - 1];
			for (int i_241_ = 0; i_241_ < i_221_; i_241_++) {
				i_192_ = (byte) (Class692.anIntArray8726[i_241_] & 0xff);
				Class692.anIntArray8726[class692.anIntArray8719[i_192_ & 0xff]] |= i_241_ << 8;
				class692.anIntArray8719[i_192_ & 0xff]++;
			}
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8720 * -1220798697] >> 8) * -1930269991;
			class692.anInt8716 = 0;
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8715 * 461731177] * -1930269991);
			class692.anInt8722 = (byte) (class692.anInt8715 * 461731177 & 0xff) * 1590760051;
			Class692 class692_242_;
			(class692_242_ = class692).anInt8715 = (class692_242_.anInt8715 * 461731177 >> 8) * -1930269991;
			class692.anInt8716 += 1150121641;
			class692.anInt8721 = i_221_ * 1916611943;
			method13983(class692);
			if ((class692.anInt8716 * 686919065 == class692.anInt8721 * 223387223 + 1) && class692.anInt8737 * 1763169589 == 0)
				bool_190_ = true;
			else
				bool_190_ = false;
		}
	}

	static void method13988(int[] is, int[] is_243_, int[] is_244_, byte[] is_245_, int i, int i_246_, int i_247_) {
		int i_248_ = 0;
		for (int i_249_ = i; i_249_ <= i_246_; i_249_++) {
			for (int i_250_ = 0; i_250_ < i_247_; i_250_++) {
				if (is_245_[i_250_] == i_249_) {
					is_244_[i_248_] = i_250_;
					i_248_++;
				}
			}
		}
		for (int i_251_ = 0; i_251_ < 23; i_251_++)
			is_243_[i_251_] = 0;
		for (int i_252_ = 0; i_252_ < i_247_; i_252_++)
			is_243_[is_245_[i_252_] + 1]++;
		for (int i_253_ = 1; i_253_ < 23; i_253_++)
			is_243_[i_253_] += is_243_[i_253_ - 1];
		for (int i_254_ = 0; i_254_ < 23; i_254_++)
			is[i_254_] = 0;
		int i_255_ = 0;
		for (int i_256_ = i; i_256_ <= i_246_; i_256_++) {
			i_255_ += is_243_[i_256_ + 1] - is_243_[i_256_];
			is[i_256_] = i_255_ - 1;
			i_255_ <<= 1;
		}
		for (int i_257_ = i + 1; i_257_ <= i_246_; i_257_++)
			is_243_[i_257_] = (is[i_257_ - 1] + 1 << 1) - is_243_[i_257_];
	}

	public static int method13989(byte[] is, int i, byte[] is_258_, int i_259_, int i_260_) {
		synchronized (aClass692_8751) {
			aClass692_8751.aByteArray8708 = is_258_;
			aClass692_8751.anInt8709 = i_260_ * 977240073;
			aClass692_8751.aByteArray8711 = is;
			aClass692_8751.anInt8740 = 0;
			aClass692_8751.anInt8710 = i * -2108977735;
			aClass692_8751.anInt8718 = 0;
			aClass692_8751.anInt8717 = 0;
			aClass692_8751.anInt8725 = 0;
			aClass692_8751.anInt8724 = 0;
			method13981(aClass692_8751);
			i -= aClass692_8751.anInt8710 * 1659791497;
			aClass692_8751.aByteArray8708 = null;
			aClass692_8751.aByteArray8711 = null;
			int i_261_ = i;
			return i_261_;
		}
	}

	public static int method13990(byte[] is, int i, byte[] is_262_, int i_263_, int i_264_) {
		synchronized (aClass692_8751) {
			aClass692_8751.aByteArray8708 = is_262_;
			aClass692_8751.anInt8709 = i_264_ * 977240073;
			aClass692_8751.aByteArray8711 = is;
			aClass692_8751.anInt8740 = 0;
			aClass692_8751.anInt8710 = i * -2108977735;
			aClass692_8751.anInt8718 = 0;
			aClass692_8751.anInt8717 = 0;
			aClass692_8751.anInt8725 = 0;
			aClass692_8751.anInt8724 = 0;
			method13981(aClass692_8751);
			i -= aClass692_8751.anInt8710 * 1659791497;
			aClass692_8751.aByteArray8708 = null;
			aClass692_8751.aByteArray8711 = null;
			int i_265_ = i;
			return i_265_;
		}
	}

	static void method13991(Class692 class692) {
		byte i = class692.aByte8731;
		int i_266_ = class692.anInt8737 * 1763169589;
		int i_267_ = class692.anInt8716 * 686919065;
		int i_268_ = class692.anInt8722 * -1551179077;
		int[] is = Class692.anIntArray8726;
		int i_269_ = class692.anInt8715 * 461731177;
		byte[] is_270_ = class692.aByteArray8711;
		int i_271_ = class692.anInt8740 * -691814031;
		int i_272_ = class692.anInt8710 * 1659791497;
		int i_273_ = i_272_;
		int i_274_ = class692.anInt8721 * 223387223 + 1;
		while_142_: for (;;) {
			if (i_266_ > 0) {
				for (;;) {
					if (i_272_ == 0)
						break while_142_;
					if (i_266_ == 1)
						break;
					is_270_[i_271_] = i;
					i_266_--;
					i_271_++;
					i_272_--;
				}
				if (i_272_ == 0) {
					i_266_ = 1;
					break;
				}
				is_270_[i_271_] = i;
				i_271_++;
				i_272_--;
			}
			for (;;) {
				if (i_267_ == i_274_) {
					i_266_ = 0;
					break while_142_;
				}
				i = (byte) i_268_;
				i_269_ = is[i_269_];
				int i_275_ = (byte) i_269_;
				i_269_ >>= 8;
				i_267_++;
				if (i_275_ != i_268_) {
					i_268_ = i_275_;
					if (i_272_ == 0) {
						i_266_ = 1;
						break while_142_;
					}
					is_270_[i_271_] = i;
					i_271_++;
					i_272_--;
				} else {
					if (i_267_ != i_274_)
						break;
					if (i_272_ == 0) {
						i_266_ = 1;
						break while_142_;
					}
					is_270_[i_271_] = i;
					i_271_++;
					i_272_--;
				}
			}
			i_266_ = 2;
			i_269_ = is[i_269_];
			int i_276_ = (byte) i_269_;
			i_269_ >>= 8;
			if (++i_267_ != i_274_) {
				if (i_276_ != i_268_)
					i_268_ = i_276_;
				else {
					i_266_ = 3;
					i_269_ = is[i_269_];
					i_276_ = (byte) i_269_;
					i_269_ >>= 8;
					if (++i_267_ != i_274_) {
						if (i_276_ != i_268_)
							i_268_ = i_276_;
						else {
							i_269_ = is[i_269_];
							i_276_ = (byte) i_269_;
							i_269_ >>= 8;
							i_267_++;
							i_266_ = (i_276_ & 0xff) + 4;
							i_269_ = is[i_269_];
							i_268_ = (byte) i_269_;
							i_269_ >>= 8;
							i_267_++;
						}
					}
				}
			}
		}
		int i_277_ = class692.anInt8724 * 2067734881;
		class692.anInt8724 += (i_273_ - i_272_) * 122765985;
		if (class692.anInt8724 * 2067734881 >= i_277_) {
			/* empty */
		}
		class692.aByte8731 = i;
		class692.anInt8737 = i_266_ * 1409389853;
		class692.anInt8716 = i_267_ * 1150121641;
		class692.anInt8722 = i_268_ * 1590760051;
		Class692.anIntArray8726 = is;
		class692.anInt8715 = i_269_ * -1930269991;
		class692.aByteArray8711 = is_270_;
		class692.anInt8740 = i_271_ * -1602297967;
		class692.anInt8710 = i_272_ * -2108977735;
	}

	static int method13992(int i, Class692 class692) {
		for (;;) {
			if (class692.anInt8718 * -996824803 >= i) {
				int i_278_ = ((class692.anInt8717 * -142109169 >> class692.anInt8718 * -996824803 - i) & (1 << i) - 1);
				class692.anInt8718 -= i * 1689280821;
				return i_278_;
			}
			class692.anInt8717 = (class692.anInt8717 * -142109169 << 8 | (class692.aByteArray8708[class692.anInt8709 * -688124359] & 0xff)) * 630102255;
			class692.anInt8718 += 629344680;
			class692.anInt8709 += 977240073;
			class692.anInt8725 += 1336303569;
			if (class692.anInt8725 * -631744207 == 0) {
				/* empty */
			}
		}
	}

	static void method13993(Class692 class692) {
		boolean bool = false;
		boolean bool_279_ = false;
		boolean bool_280_ = false;
		boolean bool_281_ = false;
		boolean bool_282_ = false;
		boolean bool_283_ = false;
		boolean bool_284_ = false;
		boolean bool_285_ = false;
		boolean bool_286_ = false;
		boolean bool_287_ = false;
		boolean bool_288_ = false;
		boolean bool_289_ = false;
		boolean bool_290_ = false;
		boolean bool_291_ = false;
		boolean bool_292_ = false;
		boolean bool_293_ = false;
		boolean bool_294_ = false;
		boolean bool_295_ = false;
		int i = 0;
		int[] is = null;
		int[] is_296_ = null;
		int[] is_297_ = null;
		class692.anInt8705 = -556011191;
		if (Class692.anIntArray8726 == null)
			Class692.anIntArray8726 = new int[class692.anInt8705 * -633474656];
		boolean bool_298_ = true;
		while (bool_298_) {
			byte i_299_ = method14001(class692);
			if (i_299_ == 23)
				break;
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method14001(class692);
			i_299_ = method13986(class692);
			if (i_299_ == 0) {
				/* empty */
			}
			class692.anInt8720 = 0;
			int i_300_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_300_ & 0xff) * 1840287911;
			i_300_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_300_ & 0xff) * 1840287911;
			i_300_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_300_ & 0xff) * 1840287911;
			for (int i_301_ = 0; i_301_ < 16; i_301_++) {
				i_299_ = method13986(class692);
				if (i_299_ == 1)
					class692.aBoolArray8729[i_301_] = true;
				else
					class692.aBoolArray8729[i_301_] = false;
			}
			for (int i_302_ = 0; i_302_ < 256; i_302_++)
				class692.aBoolArray8728[i_302_] = false;
			for (int i_303_ = 0; i_303_ < 16; i_303_++) {
				if (class692.aBoolArray8729[i_303_]) {
					for (int i_304_ = 0; i_304_ < 16; i_304_++) {
						i_299_ = method13986(class692);
						if (i_299_ == 1)
							class692.aBoolArray8728[i_303_ * 16 + i_304_] = true;
					}
				}
			}
			method13984(class692);
			int i_305_ = class692.anInt8702 * 313027013 + 2;
			int i_306_ = method13992(3, class692);
			int i_307_ = method13992(15, class692);
			for (int i_308_ = 0; i_308_ < i_307_; i_308_++) {
				int i_309_ = 0;
				for (;;) {
					i_299_ = method13986(class692);
					if (i_299_ == 0)
						break;
					i_309_++;
				}
				class692.aByteArray8734[i_308_] = (byte) i_309_;
			}
			byte[] is_310_ = new byte[6];
			for (byte i_311_ = 0; i_311_ < i_306_; i_311_++)
				is_310_[i_311_] = i_311_;
			for (int i_312_ = 0; i_312_ < i_307_; i_312_++) {
				byte i_313_ = class692.aByteArray8734[i_312_];
				byte i_314_ = is_310_[i_313_];
				for (/**/; i_313_ > 0; i_313_--)
					is_310_[i_313_] = is_310_[i_313_ - 1];
				is_310_[0] = i_314_;
				class692.aByteArray8733[i_312_] = i_314_;
			}
			for (int i_315_ = 0; i_315_ < i_306_; i_315_++) {
				int i_316_ = method13992(5, class692);
				for (int i_317_ = 0; i_317_ < i_305_; i_317_++) {
					for (;;) {
						i_299_ = method13986(class692);
						if (i_299_ == 0)
							break;
						i_299_ = method13986(class692);
						if (i_299_ == 0)
							i_316_++;
						else
							i_316_--;
					}
					class692.aByteArrayArray8735[i_315_][i_317_] = (byte) i_316_;
				}
			}
			for (int i_318_ = 0; i_318_ < i_306_; i_318_++) {
				int i_319_ = 32;
				byte i_320_ = 0;
				for (int i_321_ = 0; i_321_ < i_305_; i_321_++) {
					if (class692.aByteArrayArray8735[i_318_][i_321_] > i_320_)
						i_320_ = class692.aByteArrayArray8735[i_318_][i_321_];
					if (class692.aByteArrayArray8735[i_318_][i_321_] < i_319_)
						i_319_ = class692.aByteArrayArray8735[i_318_][i_321_];
				}
				method13988(class692.anIntArrayArray8736[i_318_], class692.anIntArrayArray8714[i_318_], class692.anIntArrayArray8738[i_318_], class692.aByteArrayArray8735[i_318_], i_319_, i_320_, i_305_);
				class692.anIntArray8713[i_318_] = i_319_;
			}
			int i_322_ = class692.anInt8702 * 313027013 + 1;
			int i_323_ = -1;
			int i_324_ = 0;
			for (int i_325_ = 0; i_325_ <= 255; i_325_++)
				class692.anIntArray8723[i_325_] = 0;
			int i_326_ = 4095;
			for (int i_327_ = 15; i_327_ >= 0; i_327_--) {
				for (int i_328_ = 15; i_328_ >= 0; i_328_--) {
					class692.aByteArray8712[i_326_] = (byte) (i_327_ * 16 + i_328_);
					i_326_--;
				}
				class692.anIntArray8732[i_327_] = i_326_ + 1;
			}
			int i_329_ = 0;
			if (i_324_ == 0) {
				i_323_++;
				i_324_ = 50;
				byte i_330_ = class692.aByteArray8733[i_323_];
				i = class692.anIntArray8713[i_330_];
				is = class692.anIntArrayArray8736[i_330_];
				is_297_ = class692.anIntArrayArray8738[i_330_];
				is_296_ = class692.anIntArrayArray8714[i_330_];
			}
			i_324_--;
			int i_331_ = i;
			int i_332_;
			int i_333_;
			for (i_333_ = method13992(i_331_, class692); i_333_ > is[i_331_]; i_333_ = i_333_ << 1 | i_332_) {
				i_331_++;
				i_332_ = method13986(class692);
			}
			int i_334_ = is_297_[i_333_ - is_296_[i_331_]];
			while (i_334_ != i_322_) {
				if (i_334_ == 0 || i_334_ == 1) {
					int i_335_ = -1;
					int i_336_ = 1;
					do {
						if (i_334_ == 0)
							i_335_ += 1 * i_336_;
						else if (i_334_ == 1)
							i_335_ += 2 * i_336_;
						i_336_ *= 2;
						if (i_324_ == 0) {
							i_323_++;
							i_324_ = 50;
							byte i_337_ = class692.aByteArray8733[i_323_];
							i = class692.anIntArray8713[i_337_];
							is = class692.anIntArrayArray8736[i_337_];
							is_297_ = class692.anIntArrayArray8738[i_337_];
							is_296_ = class692.anIntArrayArray8714[i_337_];
						}
						i_324_--;
						i_331_ = i;
						for (i_333_ = method13992(i_331_, class692); i_333_ > is[i_331_]; i_333_ = i_333_ << 1 | i_332_) {
							i_331_++;
							i_332_ = method13986(class692);
						}
						i_334_ = is_297_[i_333_ - is_296_[i_331_]];
					} while (i_334_ == 0 || i_334_ == 1);
					i_335_++;
					i_300_ = (class692.aByteArray8730[(class692.aByteArray8712[class692.anIntArray8732[0]]) & 0xff]);
					class692.anIntArray8723[i_300_ & 0xff] += i_335_;
					for (/**/; i_335_ > 0; i_335_--) {
						Class692.anIntArray8726[i_329_] = i_300_ & 0xff;
						i_329_++;
					}
				} else {
					int i_338_ = i_334_ - 1;
					if (i_338_ < 16) {
						int i_339_ = class692.anIntArray8732[0];
						i_299_ = class692.aByteArray8712[i_339_ + i_338_];
						for (/**/; i_338_ > 3; i_338_ -= 4) {
							int i_340_ = i_339_ + i_338_;
							class692.aByteArray8712[i_340_] = class692.aByteArray8712[i_340_ - 1];
							class692.aByteArray8712[i_340_ - 1] = class692.aByteArray8712[i_340_ - 2];
							class692.aByteArray8712[i_340_ - 2] = class692.aByteArray8712[i_340_ - 3];
							class692.aByteArray8712[i_340_ - 3] = class692.aByteArray8712[i_340_ - 4];
						}
						for (/**/; i_338_ > 0; i_338_--)
							class692.aByteArray8712[i_339_ + i_338_] = class692.aByteArray8712[i_339_ + i_338_ - 1];
						class692.aByteArray8712[i_339_] = i_299_;
					} else {
						int i_341_ = i_338_ / 16;
						int i_342_ = i_338_ % 16;
						int i_343_ = class692.anIntArray8732[i_341_] + i_342_;
						i_299_ = class692.aByteArray8712[i_343_];
						for (/**/; i_343_ > class692.anIntArray8732[i_341_]; i_343_--)
							class692.aByteArray8712[i_343_] = class692.aByteArray8712[i_343_ - 1];
						class692.anIntArray8732[i_341_]++;
						for (/**/; i_341_ > 0; i_341_--) {
							class692.anIntArray8732[i_341_]--;
							class692.aByteArray8712[(class692.anIntArray8732[i_341_])] = (class692.aByteArray8712[(class692.anIntArray8732[i_341_ - 1] + 16 - 1)]);
						}
						class692.anIntArray8732[0]--;
						class692.aByteArray8712[class692.anIntArray8732[0]] = i_299_;
						if (class692.anIntArray8732[0] == 0) {
							i_326_ = 4095;
							for (int i_344_ = 15; i_344_ >= 0; i_344_--) {
								for (int i_345_ = 15; i_345_ >= 0; i_345_--) {
									class692.aByteArray8712[i_326_] = (class692.aByteArray8712[(class692.anIntArray8732[i_344_] + i_345_)]);
									i_326_--;
								}
								class692.anIntArray8732[i_344_] = i_326_ + 1;
							}
						}
					}
					class692.anIntArray8723[class692.aByteArray8730[i_299_ & 0xff] & 0xff]++;
					Class692.anIntArray8726[i_329_] = class692.aByteArray8730[i_299_ & 0xff] & 0xff;
					i_329_++;
					if (i_324_ == 0) {
						i_323_++;
						i_324_ = 50;
						byte i_346_ = class692.aByteArray8733[i_323_];
						i = class692.anIntArray8713[i_346_];
						is = class692.anIntArrayArray8736[i_346_];
						is_297_ = class692.anIntArrayArray8738[i_346_];
						is_296_ = class692.anIntArrayArray8714[i_346_];
					}
					i_324_--;
					i_331_ = i;
					for (i_333_ = method13992(i_331_, class692); i_333_ > is[i_331_]; i_333_ = i_333_ << 1 | i_332_) {
						i_331_++;
						i_332_ = method13986(class692);
					}
					i_334_ = is_297_[i_333_ - is_296_[i_331_]];
				}
			}
			class692.anInt8737 = 0;
			class692.aByte8731 = (byte) 0;
			class692.anIntArray8719[0] = 0;
			for (int i_347_ = 1; i_347_ <= 256; i_347_++)
				class692.anIntArray8719[i_347_] = class692.anIntArray8723[i_347_ - 1];
			for (int i_348_ = 1; i_348_ <= 256; i_348_++)
				class692.anIntArray8719[i_348_] += class692.anIntArray8719[i_348_ - 1];
			for (int i_349_ = 0; i_349_ < i_329_; i_349_++) {
				i_300_ = (byte) (Class692.anIntArray8726[i_349_] & 0xff);
				Class692.anIntArray8726[class692.anIntArray8719[i_300_ & 0xff]] |= i_349_ << 8;
				class692.anIntArray8719[i_300_ & 0xff]++;
			}
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8720 * -1220798697] >> 8) * -1930269991;
			class692.anInt8716 = 0;
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8715 * 461731177] * -1930269991);
			class692.anInt8722 = (byte) (class692.anInt8715 * 461731177 & 0xff) * 1590760051;
			Class692 class692_350_;
			(class692_350_ = class692).anInt8715 = (class692_350_.anInt8715 * 461731177 >> 8) * -1930269991;
			class692.anInt8716 += 1150121641;
			class692.anInt8721 = i_329_ * 1916611943;
			method13983(class692);
			if ((class692.anInt8716 * 686919065 == class692.anInt8721 * 223387223 + 1) && class692.anInt8737 * 1763169589 == 0)
				bool_298_ = true;
			else
				bool_298_ = false;
		}
	}

	static byte method13994(Class692 class692) {
		return (byte) method13992(8, class692);
	}

	static void method13995(Class692 class692) {
		boolean bool = false;
		boolean bool_351_ = false;
		boolean bool_352_ = false;
		boolean bool_353_ = false;
		boolean bool_354_ = false;
		boolean bool_355_ = false;
		boolean bool_356_ = false;
		boolean bool_357_ = false;
		boolean bool_358_ = false;
		boolean bool_359_ = false;
		boolean bool_360_ = false;
		boolean bool_361_ = false;
		boolean bool_362_ = false;
		boolean bool_363_ = false;
		boolean bool_364_ = false;
		boolean bool_365_ = false;
		boolean bool_366_ = false;
		boolean bool_367_ = false;
		int i = 0;
		int[] is = null;
		int[] is_368_ = null;
		int[] is_369_ = null;
		class692.anInt8705 = -556011191;
		if (Class692.anIntArray8726 == null)
			Class692.anIntArray8726 = new int[class692.anInt8705 * -633474656];
		boolean bool_370_ = true;
		while (bool_370_) {
			byte i_371_ = method14001(class692);
			if (i_371_ == 23)
				break;
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method14001(class692);
			i_371_ = method13986(class692);
			if (i_371_ == 0) {
				/* empty */
			}
			class692.anInt8720 = 0;
			int i_372_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_372_ & 0xff) * 1840287911;
			i_372_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_372_ & 0xff) * 1840287911;
			i_372_ = method14001(class692);
			class692.anInt8720 = (class692.anInt8720 * -1220798697 << 8 | i_372_ & 0xff) * 1840287911;
			for (int i_373_ = 0; i_373_ < 16; i_373_++) {
				i_371_ = method13986(class692);
				if (i_371_ == 1)
					class692.aBoolArray8729[i_373_] = true;
				else
					class692.aBoolArray8729[i_373_] = false;
			}
			for (int i_374_ = 0; i_374_ < 256; i_374_++)
				class692.aBoolArray8728[i_374_] = false;
			for (int i_375_ = 0; i_375_ < 16; i_375_++) {
				if (class692.aBoolArray8729[i_375_]) {
					for (int i_376_ = 0; i_376_ < 16; i_376_++) {
						i_371_ = method13986(class692);
						if (i_371_ == 1)
							class692.aBoolArray8728[i_375_ * 16 + i_376_] = true;
					}
				}
			}
			method13984(class692);
			int i_377_ = class692.anInt8702 * 313027013 + 2;
			int i_378_ = method13992(3, class692);
			int i_379_ = method13992(15, class692);
			for (int i_380_ = 0; i_380_ < i_379_; i_380_++) {
				int i_381_ = 0;
				for (;;) {
					i_371_ = method13986(class692);
					if (i_371_ == 0)
						break;
					i_381_++;
				}
				class692.aByteArray8734[i_380_] = (byte) i_381_;
			}
			byte[] is_382_ = new byte[6];
			for (byte i_383_ = 0; i_383_ < i_378_; i_383_++)
				is_382_[i_383_] = i_383_;
			for (int i_384_ = 0; i_384_ < i_379_; i_384_++) {
				byte i_385_ = class692.aByteArray8734[i_384_];
				byte i_386_ = is_382_[i_385_];
				for (/**/; i_385_ > 0; i_385_--)
					is_382_[i_385_] = is_382_[i_385_ - 1];
				is_382_[0] = i_386_;
				class692.aByteArray8733[i_384_] = i_386_;
			}
			for (int i_387_ = 0; i_387_ < i_378_; i_387_++) {
				int i_388_ = method13992(5, class692);
				for (int i_389_ = 0; i_389_ < i_377_; i_389_++) {
					for (;;) {
						i_371_ = method13986(class692);
						if (i_371_ == 0)
							break;
						i_371_ = method13986(class692);
						if (i_371_ == 0)
							i_388_++;
						else
							i_388_--;
					}
					class692.aByteArrayArray8735[i_387_][i_389_] = (byte) i_388_;
				}
			}
			for (int i_390_ = 0; i_390_ < i_378_; i_390_++) {
				int i_391_ = 32;
				byte i_392_ = 0;
				for (int i_393_ = 0; i_393_ < i_377_; i_393_++) {
					if (class692.aByteArrayArray8735[i_390_][i_393_] > i_392_)
						i_392_ = class692.aByteArrayArray8735[i_390_][i_393_];
					if (class692.aByteArrayArray8735[i_390_][i_393_] < i_391_)
						i_391_ = class692.aByteArrayArray8735[i_390_][i_393_];
				}
				method13988(class692.anIntArrayArray8736[i_390_], class692.anIntArrayArray8714[i_390_], class692.anIntArrayArray8738[i_390_], class692.aByteArrayArray8735[i_390_], i_391_, i_392_, i_377_);
				class692.anIntArray8713[i_390_] = i_391_;
			}
			int i_394_ = class692.anInt8702 * 313027013 + 1;
			int i_395_ = -1;
			int i_396_ = 0;
			for (int i_397_ = 0; i_397_ <= 255; i_397_++)
				class692.anIntArray8723[i_397_] = 0;
			int i_398_ = 4095;
			for (int i_399_ = 15; i_399_ >= 0; i_399_--) {
				for (int i_400_ = 15; i_400_ >= 0; i_400_--) {
					class692.aByteArray8712[i_398_] = (byte) (i_399_ * 16 + i_400_);
					i_398_--;
				}
				class692.anIntArray8732[i_399_] = i_398_ + 1;
			}
			int i_401_ = 0;
			if (i_396_ == 0) {
				i_395_++;
				i_396_ = 50;
				byte i_402_ = class692.aByteArray8733[i_395_];
				i = class692.anIntArray8713[i_402_];
				is = class692.anIntArrayArray8736[i_402_];
				is_369_ = class692.anIntArrayArray8738[i_402_];
				is_368_ = class692.anIntArrayArray8714[i_402_];
			}
			i_396_--;
			int i_403_ = i;
			int i_404_;
			int i_405_;
			for (i_405_ = method13992(i_403_, class692); i_405_ > is[i_403_]; i_405_ = i_405_ << 1 | i_404_) {
				i_403_++;
				i_404_ = method13986(class692);
			}
			int i_406_ = is_369_[i_405_ - is_368_[i_403_]];
			while (i_406_ != i_394_) {
				if (i_406_ == 0 || i_406_ == 1) {
					int i_407_ = -1;
					int i_408_ = 1;
					do {
						if (i_406_ == 0)
							i_407_ += 1 * i_408_;
						else if (i_406_ == 1)
							i_407_ += 2 * i_408_;
						i_408_ *= 2;
						if (i_396_ == 0) {
							i_395_++;
							i_396_ = 50;
							byte i_409_ = class692.aByteArray8733[i_395_];
							i = class692.anIntArray8713[i_409_];
							is = class692.anIntArrayArray8736[i_409_];
							is_369_ = class692.anIntArrayArray8738[i_409_];
							is_368_ = class692.anIntArrayArray8714[i_409_];
						}
						i_396_--;
						i_403_ = i;
						for (i_405_ = method13992(i_403_, class692); i_405_ > is[i_403_]; i_405_ = i_405_ << 1 | i_404_) {
							i_403_++;
							i_404_ = method13986(class692);
						}
						i_406_ = is_369_[i_405_ - is_368_[i_403_]];
					} while (i_406_ == 0 || i_406_ == 1);
					i_407_++;
					i_372_ = (class692.aByteArray8730[(class692.aByteArray8712[class692.anIntArray8732[0]]) & 0xff]);
					class692.anIntArray8723[i_372_ & 0xff] += i_407_;
					for (/**/; i_407_ > 0; i_407_--) {
						Class692.anIntArray8726[i_401_] = i_372_ & 0xff;
						i_401_++;
					}
				} else {
					int i_410_ = i_406_ - 1;
					if (i_410_ < 16) {
						int i_411_ = class692.anIntArray8732[0];
						i_371_ = class692.aByteArray8712[i_411_ + i_410_];
						for (/**/; i_410_ > 3; i_410_ -= 4) {
							int i_412_ = i_411_ + i_410_;
							class692.aByteArray8712[i_412_] = class692.aByteArray8712[i_412_ - 1];
							class692.aByteArray8712[i_412_ - 1] = class692.aByteArray8712[i_412_ - 2];
							class692.aByteArray8712[i_412_ - 2] = class692.aByteArray8712[i_412_ - 3];
							class692.aByteArray8712[i_412_ - 3] = class692.aByteArray8712[i_412_ - 4];
						}
						for (/**/; i_410_ > 0; i_410_--)
							class692.aByteArray8712[i_411_ + i_410_] = class692.aByteArray8712[i_411_ + i_410_ - 1];
						class692.aByteArray8712[i_411_] = i_371_;
					} else {
						int i_413_ = i_410_ / 16;
						int i_414_ = i_410_ % 16;
						int i_415_ = class692.anIntArray8732[i_413_] + i_414_;
						i_371_ = class692.aByteArray8712[i_415_];
						for (/**/; i_415_ > class692.anIntArray8732[i_413_]; i_415_--)
							class692.aByteArray8712[i_415_] = class692.aByteArray8712[i_415_ - 1];
						class692.anIntArray8732[i_413_]++;
						for (/**/; i_413_ > 0; i_413_--) {
							class692.anIntArray8732[i_413_]--;
							class692.aByteArray8712[(class692.anIntArray8732[i_413_])] = (class692.aByteArray8712[(class692.anIntArray8732[i_413_ - 1] + 16 - 1)]);
						}
						class692.anIntArray8732[0]--;
						class692.aByteArray8712[class692.anIntArray8732[0]] = i_371_;
						if (class692.anIntArray8732[0] == 0) {
							i_398_ = 4095;
							for (int i_416_ = 15; i_416_ >= 0; i_416_--) {
								for (int i_417_ = 15; i_417_ >= 0; i_417_--) {
									class692.aByteArray8712[i_398_] = (class692.aByteArray8712[(class692.anIntArray8732[i_416_] + i_417_)]);
									i_398_--;
								}
								class692.anIntArray8732[i_416_] = i_398_ + 1;
							}
						}
					}
					class692.anIntArray8723[class692.aByteArray8730[i_371_ & 0xff] & 0xff]++;
					Class692.anIntArray8726[i_401_] = class692.aByteArray8730[i_371_ & 0xff] & 0xff;
					i_401_++;
					if (i_396_ == 0) {
						i_395_++;
						i_396_ = 50;
						byte i_418_ = class692.aByteArray8733[i_395_];
						i = class692.anIntArray8713[i_418_];
						is = class692.anIntArrayArray8736[i_418_];
						is_369_ = class692.anIntArrayArray8738[i_418_];
						is_368_ = class692.anIntArrayArray8714[i_418_];
					}
					i_396_--;
					i_403_ = i;
					for (i_405_ = method13992(i_403_, class692); i_405_ > is[i_403_]; i_405_ = i_405_ << 1 | i_404_) {
						i_403_++;
						i_404_ = method13986(class692);
					}
					i_406_ = is_369_[i_405_ - is_368_[i_403_]];
				}
			}
			class692.anInt8737 = 0;
			class692.aByte8731 = (byte) 0;
			class692.anIntArray8719[0] = 0;
			for (int i_419_ = 1; i_419_ <= 256; i_419_++)
				class692.anIntArray8719[i_419_] = class692.anIntArray8723[i_419_ - 1];
			for (int i_420_ = 1; i_420_ <= 256; i_420_++)
				class692.anIntArray8719[i_420_] += class692.anIntArray8719[i_420_ - 1];
			for (int i_421_ = 0; i_421_ < i_401_; i_421_++) {
				i_372_ = (byte) (Class692.anIntArray8726[i_421_] & 0xff);
				Class692.anIntArray8726[class692.anIntArray8719[i_372_ & 0xff]] |= i_421_ << 8;
				class692.anIntArray8719[i_372_ & 0xff]++;
			}
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8720 * -1220798697] >> 8) * -1930269991;
			class692.anInt8716 = 0;
			class692.anInt8715 = (Class692.anIntArray8726[class692.anInt8715 * 461731177] * -1930269991);
			class692.anInt8722 = (byte) (class692.anInt8715 * 461731177 & 0xff) * 1590760051;
			Class692 class692_422_;
			(class692_422_ = class692).anInt8715 = (class692_422_.anInt8715 * 461731177 >> 8) * -1930269991;
			class692.anInt8716 += 1150121641;
			class692.anInt8721 = i_401_ * 1916611943;
			method13983(class692);
			if ((class692.anInt8716 * 686919065 == class692.anInt8721 * 223387223 + 1) && class692.anInt8737 * 1763169589 == 0)
				bool_370_ = true;
			else
				bool_370_ = false;
		}
	}

	public static int decompress(byte[] is, int i, byte[] is_423_, int i_424_, int i_425_) {
		synchronized (aClass692_8751) {
			aClass692_8751.aByteArray8708 = is_423_;
			aClass692_8751.anInt8709 = i_425_ * 977240073;
			aClass692_8751.aByteArray8711 = is;
			aClass692_8751.anInt8740 = 0;
			aClass692_8751.anInt8710 = i * -2108977735;
			aClass692_8751.anInt8718 = 0;
			aClass692_8751.anInt8717 = 0;
			aClass692_8751.anInt8725 = 0;
			aClass692_8751.anInt8724 = 0;
			method13981(aClass692_8751);
			i -= aClass692_8751.anInt8710 * 1659791497;
			aClass692_8751.aByteArray8708 = null;
			aClass692_8751.aByteArray8711 = null;
			int i_426_ = i;
			return i_426_;
		}
	}

	static byte method13997(Class692 class692) {
		return (byte) method13992(8, class692);
	}

	static byte method13998(Class692 class692) {
		return (byte) method13992(8, class692);
	}

	static byte method13999(Class692 class692) {
		return (byte) method13992(1, class692);
	}

	static byte method14000(Class692 class692) {
		return (byte) method13992(8, class692);
	}

	static byte method14001(Class692 class692) {
		return (byte) method13992(8, class692);
	}

	static int method14002(int i, Class692 class692) {
		for (;;) {
			if (class692.anInt8718 * -996824803 >= i) {
				int i_427_ = ((class692.anInt8717 * -142109169 >> class692.anInt8718 * -996824803 - i) & (1 << i) - 1);
				class692.anInt8718 -= i * 1689280821;
				return i_427_;
			}
			class692.anInt8717 = (class692.anInt8717 * -142109169 << 8 | (class692.aByteArray8708[class692.anInt8709 * -688124359] & 0xff)) * 630102255;
			class692.anInt8718 += 629344680;
			class692.anInt8709 += 977240073;
			class692.anInt8725 += 1336303569;
			if (class692.anInt8725 * -631744207 == 0) {
				/* empty */
			}
		}
	}

	static void method14003(Class692 class692) {
		class692.anInt8702 = 0;
		for (int i = 0; i < 256; i++) {
			if (class692.aBoolArray8728[i]) {
				class692.aByteArray8730[class692.anInt8702 * 313027013] = (byte) i;
				class692.anInt8702 += 1411329293;
			}
		}
	}

	static byte method14004(Class692 class692) {
		return (byte) method13992(8, class692);
	}
}
