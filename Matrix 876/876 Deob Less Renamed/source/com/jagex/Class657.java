/* Class657 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class657 {
	public static void method10757(float[] fs, int[] is, int i, int i_0_) {
		if (i < i_0_) {
			int i_1_ = (i_0_ + i) / 2;
			int i_2_ = i;
			float f = fs[i_1_];
			fs[i_1_] = fs[i_0_];
			fs[i_0_] = f;
			int i_3_ = is[i_1_];
			is[i_1_] = is[i_0_];
			is[i_0_] = i_3_;
			for (int i_4_ = i; i_4_ < i_0_; i_4_++) {
				if (fs[i_4_] > f) {
					float f_5_ = fs[i_4_];
					fs[i_4_] = fs[i_2_];
					fs[i_2_] = f_5_;
					int i_6_ = is[i_4_];
					is[i_4_] = is[i_2_];
					is[i_2_++] = i_6_;
				}
			}
			fs[i_0_] = fs[i_2_];
			fs[i_2_] = f;
			is[i_0_] = is[i_2_];
			is[i_2_] = i_3_;
			Class41.method1143(fs, is, i, i_2_ - 1, (byte) 13);
			Class41.method1143(fs, is, 1 + i_2_, i_0_, (byte) -33);
		}
	}

	static void method10758(int[] is, float[] fs, float[] fs_7_, int i, int i_8_) {
		if (i < i_8_) {
			int i_9_ = (i_8_ + i) / 2;
			int i_10_ = i;
			int i_11_ = is[i_9_];
			is[i_9_] = is[i_8_];
			is[i_8_] = i_11_;
			float f = fs[i_9_];
			fs[i_9_] = fs[i_8_];
			fs[i_8_] = f;
			float f_12_ = fs_7_[i_9_];
			fs_7_[i_9_] = fs_7_[i_8_];
			fs_7_[i_8_] = f_12_;
			int i_13_ = (long) i_11_ == 9223372036854775807L ? 0 : 1;
			for (int i_14_ = i; i_14_ < i_8_; i_14_++) {
				if (is[i_14_] < (i_14_ & i_13_) + i_11_) {
					int i_15_ = is[i_14_];
					is[i_14_] = is[i_10_];
					is[i_10_] = i_15_;
					float f_16_ = fs[i_14_];
					fs[i_14_] = fs[i_10_];
					fs[i_10_] = f_16_;
					float f_17_ = fs_7_[i_14_];
					fs_7_[i_14_] = fs_7_[i_10_];
					fs_7_[i_10_] = f_17_;
					i_10_++;
				}
			}
			is[i_8_] = is[i_10_];
			is[i_10_] = i_11_;
			fs[i_8_] = fs[i_10_];
			fs[i_10_] = f;
			fs_7_[i_8_] = fs_7_[i_10_];
			fs_7_[i_10_] = f_12_;
			Class402.method6588(is, fs, fs_7_, i, i_10_ - 1, 1750802213);
			Class402.method6588(is, fs, fs_7_, 1 + i_10_, i_8_, 1259208934);
		}
	}

	Class657() throws Throwable {
		throw new Error();
	}

	static void method10759(String[] strings, int[] is, int i, int i_18_) {
		if (i < i_18_) {
			int i_19_ = (i_18_ + i) / 2;
			int i_20_ = i;
			String string = strings[i_19_];
			strings[i_19_] = strings[i_18_];
			strings[i_18_] = string;
			int i_21_ = is[i_19_];
			is[i_19_] = is[i_18_];
			is[i_18_] = i_21_;
			for (int i_22_ = i; i_22_ < i_18_; i_22_++) {
				if (string == null || (strings[i_22_] != null && strings[i_22_].compareTo(string) < (i_22_ & 0x1))) {
					String string_23_ = strings[i_22_];
					strings[i_22_] = strings[i_20_];
					strings[i_20_] = string_23_;
					int i_24_ = is[i_22_];
					is[i_22_] = is[i_20_];
					is[i_20_++] = i_24_;
				}
			}
			strings[i_18_] = strings[i_20_];
			strings[i_20_] = string;
			is[i_18_] = is[i_20_];
			is[i_20_] = i_21_;
			Class523_Sub16.method15998(strings, is, i, i_20_ - 1, (short) 26137);
			Class523_Sub16.method15998(strings, is, i_20_ + 1, i_18_, (short) 23311);
		}
	}

	static void method10760(String[] strings, int[] is, int i, int i_25_) {
		if (i < i_25_) {
			int i_26_ = (i_25_ + i) / 2;
			int i_27_ = i;
			String string = strings[i_26_];
			strings[i_26_] = strings[i_25_];
			strings[i_25_] = string;
			int i_28_ = is[i_26_];
			is[i_26_] = is[i_25_];
			is[i_25_] = i_28_;
			for (int i_29_ = i; i_29_ < i_25_; i_29_++) {
				if (string == null || (strings[i_29_] != null && strings[i_29_].compareTo(string) < (i_29_ & 0x1))) {
					String string_30_ = strings[i_29_];
					strings[i_29_] = strings[i_27_];
					strings[i_27_] = string_30_;
					int i_31_ = is[i_29_];
					is[i_29_] = is[i_27_];
					is[i_27_++] = i_31_;
				}
			}
			strings[i_25_] = strings[i_27_];
			strings[i_27_] = string;
			is[i_25_] = is[i_27_];
			is[i_27_] = i_28_;
			Class523_Sub16.method15998(strings, is, i, i_27_ - 1, (short) 28328);
			Class523_Sub16.method15998(strings, is, i_27_ + 1, i_25_, (short) 16468);
		}
	}

	public static void method10761(long[] ls, Object[] objects) {
		Class406.method6610(ls, objects, 0, ls.length - 1, (byte) 8);
	}

	public static void method10762(int[] is, int[] is_32_, int i, int i_33_) {
		if (i < i_33_) {
			int i_34_ = (i + i_33_) / 2;
			int i_35_ = i;
			int i_36_ = is[i_34_];
			is[i_34_] = is[i_33_];
			is[i_33_] = i_36_;
			int i_37_ = is_32_[i_34_];
			is_32_[i_34_] = is_32_[i_33_];
			is_32_[i_33_] = i_37_;
			int i_38_ = 2147483647 == i_36_ ? 0 : 1;
			for (int i_39_ = i; i_39_ < i_33_; i_39_++) {
				if (is[i_39_] < (i_39_ & i_38_) + i_36_) {
					int i_40_ = is[i_39_];
					is[i_39_] = is[i_35_];
					is[i_35_] = i_40_;
					int i_41_ = is_32_[i_39_];
					is_32_[i_39_] = is_32_[i_35_];
					is_32_[i_35_++] = i_41_;
				}
			}
			is[i_33_] = is[i_35_];
			is[i_35_] = i_36_;
			is_32_[i_33_] = is_32_[i_35_];
			is_32_[i_35_] = i_37_;
			Class535.method8915(is, is_32_, i, i_35_ - 1, -766567045);
			Class535.method8915(is, is_32_, i_35_ + 1, i_33_, 1105793837);
		}
	}

	public static void method10763(String[] strings, int[] is) {
		Class523_Sub16.method15998(strings, is, 0, strings.length - 1, (short) 14515);
	}

	public static void method10764(int[] is, int[] is_42_, int i, int i_43_) {
		if (i < i_43_) {
			int i_44_ = (i + i_43_) / 2;
			int i_45_ = i;
			int i_46_ = is[i_44_];
			is[i_44_] = is[i_43_];
			is[i_43_] = i_46_;
			int i_47_ = is_42_[i_44_];
			is_42_[i_44_] = is_42_[i_43_];
			is_42_[i_43_] = i_47_;
			int i_48_ = 2147483647 == i_46_ ? 0 : 1;
			for (int i_49_ = i; i_49_ < i_43_; i_49_++) {
				if (is[i_49_] < (i_49_ & i_48_) + i_46_) {
					int i_50_ = is[i_49_];
					is[i_49_] = is[i_45_];
					is[i_45_] = i_50_;
					int i_51_ = is_42_[i_49_];
					is_42_[i_49_] = is_42_[i_45_];
					is_42_[i_45_++] = i_51_;
				}
			}
			is[i_43_] = is[i_45_];
			is[i_45_] = i_46_;
			is_42_[i_43_] = is_42_[i_45_];
			is_42_[i_45_] = i_47_;
			Class535.method8915(is, is_42_, i, i_45_ - 1, -227426400);
			Class535.method8915(is, is_42_, i_45_ + 1, i_43_, -1959328715);
		}
	}

	static void method10765(long[] ls, int[] is, int i, int i_52_) {
		if (i < i_52_) {
			int i_53_ = (i_52_ + i) / 2;
			int i_54_ = i;
			long l = ls[i_53_];
			ls[i_53_] = ls[i_52_];
			ls[i_52_] = l;
			int i_55_ = is[i_53_];
			is[i_53_] = is[i_52_];
			is[i_52_] = i_55_;
			int i_56_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_57_ = i; i_57_ < i_52_; i_57_++) {
				if (ls[i_57_] < l + (long) (i_57_ & i_56_)) {
					long l_58_ = ls[i_57_];
					ls[i_57_] = ls[i_54_];
					ls[i_54_] = l_58_;
					int i_59_ = is[i_57_];
					is[i_57_] = is[i_54_];
					is[i_54_++] = i_59_;
				}
			}
			ls[i_52_] = ls[i_54_];
			ls[i_54_] = l;
			is[i_52_] = is[i_54_];
			is[i_54_] = i_55_;
			Class328_Sub3.method15695(ls, is, i, i_54_ - 1, 295641201);
			Class328_Sub3.method15695(ls, is, 1 + i_54_, i_52_, 627655407);
		}
	}

	static void method10766(int[] is, float[] fs, float[] fs_60_, int i, int i_61_) {
		if (i < i_61_) {
			int i_62_ = (i_61_ + i) / 2;
			int i_63_ = i;
			int i_64_ = is[i_62_];
			is[i_62_] = is[i_61_];
			is[i_61_] = i_64_;
			float f = fs[i_62_];
			fs[i_62_] = fs[i_61_];
			fs[i_61_] = f;
			float f_65_ = fs_60_[i_62_];
			fs_60_[i_62_] = fs_60_[i_61_];
			fs_60_[i_61_] = f_65_;
			int i_66_ = (long) i_64_ == 9223372036854775807L ? 0 : 1;
			for (int i_67_ = i; i_67_ < i_61_; i_67_++) {
				if (is[i_67_] < (i_67_ & i_66_) + i_64_) {
					int i_68_ = is[i_67_];
					is[i_67_] = is[i_63_];
					is[i_63_] = i_68_;
					float f_69_ = fs[i_67_];
					fs[i_67_] = fs[i_63_];
					fs[i_63_] = f_69_;
					float f_70_ = fs_60_[i_67_];
					fs_60_[i_67_] = fs_60_[i_63_];
					fs_60_[i_63_] = f_70_;
					i_63_++;
				}
			}
			is[i_61_] = is[i_63_];
			is[i_63_] = i_64_;
			fs[i_61_] = fs[i_63_];
			fs[i_63_] = f;
			fs_60_[i_61_] = fs_60_[i_63_];
			fs_60_[i_63_] = f_65_;
			Class402.method6588(is, fs, fs_60_, i, i_63_ - 1, 71551439);
			Class402.method6588(is, fs, fs_60_, 1 + i_63_, i_61_, 2093420983);
		}
	}

	static void method10767(long[] ls, int[] is, int i, int i_71_) {
		if (i < i_71_) {
			int i_72_ = (i_71_ + i) / 2;
			int i_73_ = i;
			long l = ls[i_72_];
			ls[i_72_] = ls[i_71_];
			ls[i_71_] = l;
			int i_74_ = is[i_72_];
			is[i_72_] = is[i_71_];
			is[i_71_] = i_74_;
			int i_75_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_76_ = i; i_76_ < i_71_; i_76_++) {
				if (ls[i_76_] < l + (long) (i_76_ & i_75_)) {
					long l_77_ = ls[i_76_];
					ls[i_76_] = ls[i_73_];
					ls[i_73_] = l_77_;
					int i_78_ = is[i_76_];
					is[i_76_] = is[i_73_];
					is[i_73_++] = i_78_;
				}
			}
			ls[i_71_] = ls[i_73_];
			ls[i_73_] = l;
			is[i_71_] = is[i_73_];
			is[i_73_] = i_74_;
			Class328_Sub3.method15695(ls, is, i, i_73_ - 1, -708856607);
			Class328_Sub3.method15695(ls, is, 1 + i_73_, i_71_, 1050698260);
		}
	}

	static void method10768(long[] ls, int[] is, int i, int i_79_) {
		if (i < i_79_) {
			int i_80_ = (i_79_ + i) / 2;
			int i_81_ = i;
			long l = ls[i_80_];
			ls[i_80_] = ls[i_79_];
			ls[i_79_] = l;
			int i_82_ = is[i_80_];
			is[i_80_] = is[i_79_];
			is[i_79_] = i_82_;
			int i_83_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_84_ = i; i_84_ < i_79_; i_84_++) {
				if (ls[i_84_] < l + (long) (i_84_ & i_83_)) {
					long l_85_ = ls[i_84_];
					ls[i_84_] = ls[i_81_];
					ls[i_81_] = l_85_;
					int i_86_ = is[i_84_];
					is[i_84_] = is[i_81_];
					is[i_81_++] = i_86_;
				}
			}
			ls[i_79_] = ls[i_81_];
			ls[i_81_] = l;
			is[i_79_] = is[i_81_];
			is[i_81_] = i_82_;
			Class328_Sub3.method15695(ls, is, i, i_81_ - 1, 952772335);
			Class328_Sub3.method15695(ls, is, 1 + i_81_, i_79_, 354685574);
		}
	}

	static void method10769(long[] ls, Object[] objects, int i, int i_87_) {
		if (i < i_87_) {
			int i_88_ = (i + i_87_) / 2;
			int i_89_ = i;
			long l = ls[i_88_];
			ls[i_88_] = ls[i_87_];
			ls[i_87_] = l;
			Object object = objects[i_88_];
			objects[i_88_] = objects[i_87_];
			objects[i_87_] = object;
			int i_90_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_91_ = i; i_91_ < i_87_; i_91_++) {
				if (ls[i_91_] < l + (long) (i_91_ & i_90_)) {
					long l_92_ = ls[i_91_];
					ls[i_91_] = ls[i_89_];
					ls[i_89_] = l_92_;
					Object object_93_ = objects[i_91_];
					objects[i_91_] = objects[i_89_];
					objects[i_89_++] = object_93_;
				}
			}
			ls[i_87_] = ls[i_89_];
			ls[i_89_] = l;
			objects[i_87_] = objects[i_89_];
			objects[i_89_] = object;
			Class406.method6610(ls, objects, i, i_89_ - 1, (byte) 93);
			Class406.method6610(ls, objects, 1 + i_89_, i_87_, (byte) 58);
		}
	}

	static void method10770(String[] strings, int[] is, int i, int i_94_) {
		if (i < i_94_) {
			int i_95_ = (i_94_ + i) / 2;
			int i_96_ = i;
			String string = strings[i_95_];
			strings[i_95_] = strings[i_94_];
			strings[i_94_] = string;
			int i_97_ = is[i_95_];
			is[i_95_] = is[i_94_];
			is[i_94_] = i_97_;
			for (int i_98_ = i; i_98_ < i_94_; i_98_++) {
				if (string == null || (strings[i_98_] != null && strings[i_98_].compareTo(string) < (i_98_ & 0x1))) {
					String string_99_ = strings[i_98_];
					strings[i_98_] = strings[i_96_];
					strings[i_96_] = string_99_;
					int i_100_ = is[i_98_];
					is[i_98_] = is[i_96_];
					is[i_96_++] = i_100_;
				}
			}
			strings[i_94_] = strings[i_96_];
			strings[i_96_] = string;
			is[i_94_] = is[i_96_];
			is[i_96_] = i_97_;
			Class523_Sub16.method15998(strings, is, i, i_96_ - 1, (short) 29548);
			Class523_Sub16.method15998(strings, is, i_96_ + 1, i_94_, (short) 27874);
		}
	}

	public static void method10771(float[] fs, int[] is, int i, int i_101_) {
		if (i < i_101_) {
			int i_102_ = (i_101_ + i) / 2;
			int i_103_ = i;
			float f = fs[i_102_];
			fs[i_102_] = fs[i_101_];
			fs[i_101_] = f;
			int i_104_ = is[i_102_];
			is[i_102_] = is[i_101_];
			is[i_101_] = i_104_;
			for (int i_105_ = i; i_105_ < i_101_; i_105_++) {
				if (fs[i_105_] > f) {
					float f_106_ = fs[i_105_];
					fs[i_105_] = fs[i_103_];
					fs[i_103_] = f_106_;
					int i_107_ = is[i_105_];
					is[i_105_] = is[i_103_];
					is[i_103_++] = i_107_;
				}
			}
			fs[i_101_] = fs[i_103_];
			fs[i_103_] = f;
			is[i_101_] = is[i_103_];
			is[i_103_] = i_104_;
			Class41.method1143(fs, is, i, i_103_ - 1, (byte) -62);
			Class41.method1143(fs, is, 1 + i_103_, i_101_, (byte) 69);
		}
	}

	public static void method10772(String[] strings, int[] is) {
		Class523_Sub16.method15998(strings, is, 0, strings.length - 1, (short) 24575);
	}

	public static void method10773(int[] is, float[] fs, float[] fs_108_) {
		Class402.method6588(is, fs, fs_108_, 0, is.length - 1, -875336689);
	}

	public static void method10774(int[] is, float[] fs, float[] fs_109_) {
		Class402.method6588(is, fs, fs_109_, 0, is.length - 1, -428828730);
	}

	static void method10775(int[] is, float[] fs, float[] fs_110_, int i, int i_111_) {
		if (i < i_111_) {
			int i_112_ = (i_111_ + i) / 2;
			int i_113_ = i;
			int i_114_ = is[i_112_];
			is[i_112_] = is[i_111_];
			is[i_111_] = i_114_;
			float f = fs[i_112_];
			fs[i_112_] = fs[i_111_];
			fs[i_111_] = f;
			float f_115_ = fs_110_[i_112_];
			fs_110_[i_112_] = fs_110_[i_111_];
			fs_110_[i_111_] = f_115_;
			int i_116_ = (long) i_114_ == 9223372036854775807L ? 0 : 1;
			for (int i_117_ = i; i_117_ < i_111_; i_117_++) {
				if (is[i_117_] < (i_117_ & i_116_) + i_114_) {
					int i_118_ = is[i_117_];
					is[i_117_] = is[i_113_];
					is[i_113_] = i_118_;
					float f_119_ = fs[i_117_];
					fs[i_117_] = fs[i_113_];
					fs[i_113_] = f_119_;
					float f_120_ = fs_110_[i_117_];
					fs_110_[i_117_] = fs_110_[i_113_];
					fs_110_[i_113_] = f_120_;
					i_113_++;
				}
			}
			is[i_111_] = is[i_113_];
			is[i_113_] = i_114_;
			fs[i_111_] = fs[i_113_];
			fs[i_113_] = f;
			fs_110_[i_111_] = fs_110_[i_113_];
			fs_110_[i_113_] = f_115_;
			Class402.method6588(is, fs, fs_110_, i, i_113_ - 1, -745614124);
			Class402.method6588(is, fs, fs_110_, 1 + i_113_, i_111_, 1247417620);
		}
	}

	static void method10776(long[] ls, int[] is, int i, int i_121_) {
		if (i < i_121_) {
			int i_122_ = (i_121_ + i) / 2;
			int i_123_ = i;
			long l = ls[i_122_];
			ls[i_122_] = ls[i_121_];
			ls[i_121_] = l;
			int i_124_ = is[i_122_];
			is[i_122_] = is[i_121_];
			is[i_121_] = i_124_;
			int i_125_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_126_ = i; i_126_ < i_121_; i_126_++) {
				if (ls[i_126_] < l + (long) (i_126_ & i_125_)) {
					long l_127_ = ls[i_126_];
					ls[i_126_] = ls[i_123_];
					ls[i_123_] = l_127_;
					int i_128_ = is[i_126_];
					is[i_126_] = is[i_123_];
					is[i_123_++] = i_128_;
				}
			}
			ls[i_121_] = ls[i_123_];
			ls[i_123_] = l;
			is[i_121_] = is[i_123_];
			is[i_123_] = i_124_;
			Class328_Sub3.method15695(ls, is, i, i_123_ - 1, 1850796554);
			Class328_Sub3.method15695(ls, is, 1 + i_123_, i_121_, -569152906);
		}
	}

	public static void method10777(long[] ls, int[] is) {
		Class328_Sub3.method15695(ls, is, 0, ls.length - 1, 278862980);
	}

	static void method10778(int[] is, float[] fs, float[] fs_129_, int i, int i_130_) {
		if (i < i_130_) {
			int i_131_ = (i_130_ + i) / 2;
			int i_132_ = i;
			int i_133_ = is[i_131_];
			is[i_131_] = is[i_130_];
			is[i_130_] = i_133_;
			float f = fs[i_131_];
			fs[i_131_] = fs[i_130_];
			fs[i_130_] = f;
			float f_134_ = fs_129_[i_131_];
			fs_129_[i_131_] = fs_129_[i_130_];
			fs_129_[i_130_] = f_134_;
			int i_135_ = (long) i_133_ == 9223372036854775807L ? 0 : 1;
			for (int i_136_ = i; i_136_ < i_130_; i_136_++) {
				if (is[i_136_] < (i_136_ & i_135_) + i_133_) {
					int i_137_ = is[i_136_];
					is[i_136_] = is[i_132_];
					is[i_132_] = i_137_;
					float f_138_ = fs[i_136_];
					fs[i_136_] = fs[i_132_];
					fs[i_132_] = f_138_;
					float f_139_ = fs_129_[i_136_];
					fs_129_[i_136_] = fs_129_[i_132_];
					fs_129_[i_132_] = f_139_;
					i_132_++;
				}
			}
			is[i_130_] = is[i_132_];
			is[i_132_] = i_133_;
			fs[i_130_] = fs[i_132_];
			fs[i_132_] = f;
			fs_129_[i_130_] = fs_129_[i_132_];
			fs_129_[i_132_] = f_134_;
			Class402.method6588(is, fs, fs_129_, i, i_132_ - 1, 445142137);
			Class402.method6588(is, fs, fs_129_, 1 + i_132_, i_130_, 1320717857);
		}
	}

	public static void method10779(int[] is, Object[] objects) {
		Class644.method10554(is, objects, 0, is.length - 1, (byte) 109);
	}

	public static void method10780(int[] is, Object[] objects) {
		Class644.method10554(is, objects, 0, is.length - 1, (byte) 49);
	}

	public static void method10781(int[] is, Object[] objects, int i, int i_140_) {
		if (i < i_140_) {
			int i_141_ = (i + i_140_) / 2;
			int i_142_ = i;
			int i_143_ = is[i_141_];
			is[i_141_] = is[i_140_];
			is[i_140_] = i_143_;
			Object object = objects[i_141_];
			objects[i_141_] = objects[i_140_];
			objects[i_140_] = object;
			int i_144_ = 2147483647 == i_143_ ? 0 : 1;
			for (int i_145_ = i; i_145_ < i_140_; i_145_++) {
				if (is[i_145_] < (i_145_ & i_144_) + i_143_) {
					int i_146_ = is[i_145_];
					is[i_145_] = is[i_142_];
					is[i_142_] = i_146_;
					Object object_147_ = objects[i_145_];
					objects[i_145_] = objects[i_142_];
					objects[i_142_++] = object_147_;
				}
			}
			is[i_140_] = is[i_142_];
			is[i_142_] = i_143_;
			objects[i_140_] = objects[i_142_];
			objects[i_142_] = object;
			Class644.method10554(is, objects, i, i_142_ - 1, (byte) 67);
			Class644.method10554(is, objects, i_142_ + 1, i_140_, (byte) 71);
		}
	}

	public static void method10782(long[] ls, int[] is) {
		Class328_Sub3.method15695(ls, is, 0, ls.length - 1, 1684469840);
	}

	public static void method10783(int[] is, Object[] objects, int i, int i_148_) {
		if (i < i_148_) {
			int i_149_ = (i + i_148_) / 2;
			int i_150_ = i;
			int i_151_ = is[i_149_];
			is[i_149_] = is[i_148_];
			is[i_148_] = i_151_;
			Object object = objects[i_149_];
			objects[i_149_] = objects[i_148_];
			objects[i_148_] = object;
			int i_152_ = 2147483647 == i_151_ ? 0 : 1;
			for (int i_153_ = i; i_153_ < i_148_; i_153_++) {
				if (is[i_153_] < (i_153_ & i_152_) + i_151_) {
					int i_154_ = is[i_153_];
					is[i_153_] = is[i_150_];
					is[i_150_] = i_154_;
					Object object_155_ = objects[i_153_];
					objects[i_153_] = objects[i_150_];
					objects[i_150_++] = object_155_;
				}
			}
			is[i_148_] = is[i_150_];
			is[i_150_] = i_151_;
			objects[i_148_] = objects[i_150_];
			objects[i_150_] = object;
			Class644.method10554(is, objects, i, i_150_ - 1, (byte) 84);
			Class644.method10554(is, objects, i_150_ + 1, i_148_, (byte) 5);
		}
	}

	public static void method10784(int[] is, int[] is_156_, int i, int i_157_) {
		if (i < i_157_) {
			int i_158_ = (i + i_157_) / 2;
			int i_159_ = i;
			int i_160_ = is[i_158_];
			is[i_158_] = is[i_157_];
			is[i_157_] = i_160_;
			int i_161_ = is_156_[i_158_];
			is_156_[i_158_] = is_156_[i_157_];
			is_156_[i_157_] = i_161_;
			int i_162_ = 2147483647 == i_160_ ? 0 : 1;
			for (int i_163_ = i; i_163_ < i_157_; i_163_++) {
				if (is[i_163_] < (i_163_ & i_162_) + i_160_) {
					int i_164_ = is[i_163_];
					is[i_163_] = is[i_159_];
					is[i_159_] = i_164_;
					int i_165_ = is_156_[i_163_];
					is_156_[i_163_] = is_156_[i_159_];
					is_156_[i_159_++] = i_165_;
				}
			}
			is[i_157_] = is[i_159_];
			is[i_159_] = i_160_;
			is_156_[i_157_] = is_156_[i_159_];
			is_156_[i_159_] = i_161_;
			Class535.method8915(is, is_156_, i, i_159_ - 1, 1188865752);
			Class535.method8915(is, is_156_, i_159_ + 1, i_157_, -873571901);
		}
	}

	public static void method10785(long[] ls, Object[] objects) {
		Class406.method6610(ls, objects, 0, ls.length - 1, (byte) 51);
	}

	public static void method10786(long[] ls, Object[] objects) {
		Class406.method6610(ls, objects, 0, ls.length - 1, (byte) 97);
	}

	static void method10787(long[] ls, Object[] objects, int i, int i_166_) {
		if (i < i_166_) {
			int i_167_ = (i + i_166_) / 2;
			int i_168_ = i;
			long l = ls[i_167_];
			ls[i_167_] = ls[i_166_];
			ls[i_166_] = l;
			Object object = objects[i_167_];
			objects[i_167_] = objects[i_166_];
			objects[i_166_] = object;
			int i_169_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_170_ = i; i_170_ < i_166_; i_170_++) {
				if (ls[i_170_] < l + (long) (i_170_ & i_169_)) {
					long l_171_ = ls[i_170_];
					ls[i_170_] = ls[i_168_];
					ls[i_168_] = l_171_;
					Object object_172_ = objects[i_170_];
					objects[i_170_] = objects[i_168_];
					objects[i_168_++] = object_172_;
				}
			}
			ls[i_166_] = ls[i_168_];
			ls[i_168_] = l;
			objects[i_166_] = objects[i_168_];
			objects[i_168_] = object;
			Class406.method6610(ls, objects, i, i_168_ - 1, (byte) 12);
			Class406.method6610(ls, objects, 1 + i_168_, i_166_, (byte) 66);
		}
	}

	public static void method10788(int[] is, Object[] objects, int i, int i_173_) {
		if (i < i_173_) {
			int i_174_ = (i + i_173_) / 2;
			int i_175_ = i;
			int i_176_ = is[i_174_];
			is[i_174_] = is[i_173_];
			is[i_173_] = i_176_;
			Object object = objects[i_174_];
			objects[i_174_] = objects[i_173_];
			objects[i_173_] = object;
			int i_177_ = 2147483647 == i_176_ ? 0 : 1;
			for (int i_178_ = i; i_178_ < i_173_; i_178_++) {
				if (is[i_178_] < (i_178_ & i_177_) + i_176_) {
					int i_179_ = is[i_178_];
					is[i_178_] = is[i_175_];
					is[i_175_] = i_179_;
					Object object_180_ = objects[i_178_];
					objects[i_178_] = objects[i_175_];
					objects[i_175_++] = object_180_;
				}
			}
			is[i_173_] = is[i_175_];
			is[i_175_] = i_176_;
			objects[i_173_] = objects[i_175_];
			objects[i_175_] = object;
			Class644.method10554(is, objects, i, i_175_ - 1, (byte) 98);
			Class644.method10554(is, objects, i_175_ + 1, i_173_, (byte) 16);
		}
	}

	static final void method10789(Class669 class669, int i) {
		int i_181_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_181_, -1265952011);
		Class242 class242 = Class31.aClass242Array302[i_181_ >> 16];
		Class614.method10060(class250, class242, class669, -125446405);
	}

	static final void method10790(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class43.anInt611 * -1560842787;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class43.anInt604 * -771962365;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class43.anInt612 * 740196835;
		Class43.anInt611 = -268739818;
		Class43.anInt604 = -935440555;
		Class43.anInt612 = -451988427;
	}

	public static void method10791(int i, byte i_182_) {
		if (-2020118759 * client.anInt11136 != i) {
			client.anInt11025 = 0;
			if (client.anInt11136 * -2020118759 == 9 && i != 10)
				Class385.method6444(2139265656);
			if (i == 17 || i == 19)
				Class33.method923(-1587121492);
			if (17 != i && Class246.aClass557_2480 != null) {
				Class246.aClass557_2480.method9203(1728200611);
				Class246.aClass557_2480 = null;
			}
			if (i == 16) {
				Class700.method14080((11 == -2020118759 * client.anInt11136 || client.anInt11136 * -2020118759 == 13 || (1786741825 * (Class523_Sub11.aClass625_10427.anInt8143) != -1614846429 * client.anInt11186)), (byte) -17);
				Class214.method3842(995838812);
			}
			if (0 == i) {
				boolean bool;
				if (-1 == 976170291 * Class523_Sub11.aClass625_10427.anInt8144)
					bool = (1 == -2020118759 * client.anInt11136 || 4 == client.anInt11136 * -2020118759);
				else
					bool = (-1614846429 * client.anInt11186 != (Class523_Sub11.aClass625_10427.anInt8144 * 976170291));
				Class304.method5542(bool, -1327533773);
			}
			if (i == 1 || i == 4) {
				if (!Class375.method6382(1639338990))
					return;
			} else if (3 == i || i == 8 && -2020118759 * client.anInt11136 != 6) {
				if (!Class33.method923(-1587121492))
					return;
			} else if (13 == i)
				Class523_Sub27_Sub10.method18104(1010118033);
			if (Class664.method13639(i, -1240570906)) {
				client.aClass505_11019.method8253(2006742278);
				client.aClass505_11019.aLong5616 = -2296426529571747573L;
			}
			if (10 == i || i == 16)
				Class34.method946(2079369242);
			boolean bool = (12 == i || Class616.method10074(i, (byte) 40) || Class691.method13965(i, (byte) 9));
			boolean bool_183_ = (client.anInt11136 * -2020118759 == 12 || Class616.method10074(-2020118759 * client.anInt11136, (byte) -64) || Class691.method13965(-2020118759 * client.anInt11136, (byte) 38));
			if (bool != bool_183_)
				Class572.aClass458_7684.method7468(!bool, -471449444);
			if (Class664.method13639(i, 306499959) || 17 == i || i == 19)
				Class31.aClass178_303.method3054();
			client.anInt11136 = i * -2088731351;
		}
	}

	static final void method10792(byte i) {
		Class643.method10537(Class31.aClass178_303, (long) client.anInt11011);
		if (-1614846429 * client.anInt11186 != -1)
			Class39.method1130(-1614846429 * client.anInt11186, -1872994421);
		for (int i_184_ = 0; i_184_ < client.anInt10994 * 2032911217; i_184_++) {
			client.aBoolArray11247[i_184_] = client.aBoolArray11246[i_184_];
			client.aBoolArray11246[i_184_] = false;
		}
		client.anInt11245 = 1846074621 * client.anInt11011;
		if (-1614846429 * client.anInt11186 != -1) {
			client.anInt10994 = 0;
			Class291.method5230(-385686073);
		}
		Class31.aClass178_303.method3071();
		Class469.method7615(Class31.aClass178_303, (byte) 22);
		int i_185_ = Class499.method8112(-1334887744);
		if (i_185_ == -1)
			i_185_ = 971872405 * client.anInt11178;
		if (-1 == i_185_)
			i_185_ = client.anInt10989 * -705865815;
		Class381.method6411(i_185_, (byte) -59);
		client.anInt11059 = 0;
	}
}
