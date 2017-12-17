/* Class678 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Dimension;

public final class Class678 {
	static int anInt8639;

	public static long method13776(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_0_);
		return l;
	}

	static int method13777(CharSequence charsequence, char c) {
		int i = 0;
		int i_1_ = charsequence.length();
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			if (charsequence.charAt(i_2_) == c)
				i++;
		}
		return i;
	}

	public static int method13778(CharSequence charsequence) {
		int i = charsequence.length();
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i; i_4_++)
			i_3_ = (i_3_ << 5) - i_3_ + charsequence.charAt(i_4_);
		return i_3_;
	}

	public static String method13779(Object[] objects, int i, int i_5_) {
		if (0 == i_5_)
			return "";
		if (i_5_ == 1) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (null == charsequence)
				return "null";
			return charsequence.toString();
		}
		int i_6_ = i + i_5_;
		int i_7_ = 0;
		for (int i_8_ = i; i_8_ < i_6_; i_8_++) {
			CharSequence charsequence = (CharSequence) objects[i_8_];
			if (charsequence == null)
				i_7_ += 4;
			else
				i_7_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_7_);
		for (int i_9_ = i; i_9_ < i_6_; i_9_++) {
			CharSequence charsequence = (CharSequence) objects[i_9_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static String method13780(Object[] objects, int i, int i_10_) {
		if (0 == i_10_)
			return "";
		if (i_10_ == 1) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (null == charsequence)
				return "null";
			return charsequence.toString();
		}
		int i_11_ = i + i_10_;
		int i_12_ = 0;
		for (int i_13_ = i; i_13_ < i_11_; i_13_++) {
			CharSequence charsequence = (CharSequence) objects[i_13_];
			if (charsequence == null)
				i_12_ += 4;
			else
				i_12_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_12_);
		for (int i_14_ = i; i_14_ < i_11_; i_14_++) {
			CharSequence charsequence = (CharSequence) objects[i_14_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static boolean method13781(CharSequence charsequence) {
		return Class287.method5158(charsequence, 10, true, 686124855);
	}

	public static boolean method13782(char c) {
		return c >= '0' && c <= '9';
	}

	static boolean method13783(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		int i_17_ = 0;
		int i_18_ = charsequence.length();
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
			int i_20_ = charsequence.charAt(i_19_);
			if (i_19_ == 0) {
				if (45 == i_20_) {
					bool_15_ = true;
					continue;
				}
				if (i_20_ == 43 && bool)
					continue;
			}
			if (i_20_ >= 48 && i_20_ <= 57)
				i_20_ -= 48;
			else if (i_20_ >= 65 && i_20_ <= 90)
				i_20_ -= 55;
			else if (i_20_ >= 97 && i_20_ <= 122)
				i_20_ -= 87;
			else
				return false;
			if (i_20_ >= i)
				return false;
			if (bool_15_)
				i_20_ = -i_20_;
			int i_21_ = i_17_ * i + i_20_;
			if (i_21_ / i != i_17_)
				return false;
			i_17_ = i_21_;
			bool_16_ = true;
		}
		return bool_16_;
	}

	public static int method13784(CharSequence charsequence) {
		return Class221.method4136(charsequence, 10, true, -1829482562);
	}

	static boolean method13785(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		int i_24_ = 0;
		int i_25_ = charsequence.length();
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			int i_27_ = charsequence.charAt(i_26_);
			if (i_26_ == 0) {
				if (45 == i_27_) {
					bool_22_ = true;
					continue;
				}
				if (i_27_ == 43 && bool)
					continue;
			}
			if (i_27_ >= 48 && i_27_ <= 57)
				i_27_ -= 48;
			else if (i_27_ >= 65 && i_27_ <= 90)
				i_27_ -= 55;
			else if (i_27_ >= 97 && i_27_ <= 122)
				i_27_ -= 87;
			else
				return false;
			if (i_27_ >= i)
				return false;
			if (bool_22_)
				i_27_ = -i_27_;
			int i_28_ = i_24_ * i + i_27_;
			if (i_28_ / i != i_24_)
				return false;
			i_24_ = i_28_;
			bool_23_ = true;
		}
		return bool_23_;
	}

	public static boolean method13786(char c) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || '\u0153' == c || '\u0178' == c)
			return true;
		return false;
	}

	public static int method13787(CharSequence charsequence) {
		return Class221.method4136(charsequence, 10, true, 1974877095);
	}

	public static String method13788(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class49.method1279(i, 10, bool, -1624277711);
	}

	public static int method13789(CharSequence charsequence, CharSequence charsequence_29_) {
		int i = charsequence.length();
		int i_30_ = charsequence_29_.length();
		if (i == 0)
			return i_30_;
		if (i_30_ == 0)
			return i;
		int[] is = new int[1 + i];
		int[] is_31_ = new int[i + 1];
		for (int i_32_ = 0; i_32_ <= i; i_32_++)
			is[i_32_] = i_32_;
		for (int i_33_ = 1; i_33_ <= i_30_; i_33_++) {
			is_31_[0] = i_33_;
			char c = charsequence_29_.charAt(i_33_ - 1);
			for (int i_34_ = 1; i_34_ <= i; i_34_++)
				is_31_[i_34_] = Math.min(Math.min(1 + is_31_[i_34_ - 1], is[i_34_] + 1), (is[i_34_ - 1] + (charsequence.charAt(i_34_ - 1) == c ? 0 : 1)));
			int[] is_35_ = is;
			is = is_31_;
			is_31_ = is_35_;
		}
		return is[i];
	}

	public static int method13790(CharSequence charsequence, int i) {
		return Class221.method4136(charsequence, i, true, 1861409284);
	}

	static boolean method13791(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_36_ = false;
		boolean bool_37_ = false;
		int i_38_ = 0;
		int i_39_ = charsequence.length();
		for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
			int i_41_ = charsequence.charAt(i_40_);
			if (i_40_ == 0) {
				if (45 == i_41_) {
					bool_36_ = true;
					continue;
				}
				if (i_41_ == 43 && bool)
					continue;
			}
			if (i_41_ >= 48 && i_41_ <= 57)
				i_41_ -= 48;
			else if (i_41_ >= 65 && i_41_ <= 90)
				i_41_ -= 55;
			else if (i_41_ >= 97 && i_41_ <= 122)
				i_41_ -= 87;
			else
				return false;
			if (i_41_ >= i)
				return false;
			if (bool_36_)
				i_41_ = -i_41_;
			int i_42_ = i_38_ * i + i_41_;
			if (i_42_ / i != i_38_)
				return false;
			i_38_ = i_42_;
			bool_37_ = true;
		}
		return bool_37_;
	}

	static int method13792(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_43_ = false;
		boolean bool_44_ = false;
		int i_45_ = 0;
		int i_46_ = charsequence.length();
		for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
			int i_48_ = charsequence.charAt(i_47_);
			if (0 == i_47_) {
				if (45 == i_48_) {
					bool_43_ = true;
					continue;
				}
				if (43 == i_48_ && bool)
					continue;
			}
			if (i_48_ >= 48 && i_48_ <= 57)
				i_48_ -= 48;
			else if (i_48_ >= 65 && i_48_ <= 90)
				i_48_ -= 55;
			else if (i_48_ >= 97 && i_48_ <= 122)
				i_48_ -= 87;
			else
				throw new NumberFormatException();
			if (i_48_ >= i)
				throw new NumberFormatException();
			if (bool_43_)
				i_48_ = -i_48_;
			int i_49_ = i_48_ + i * i_45_;
			if (i_49_ / i != i_45_)
				throw new NumberFormatException();
			i_45_ = i_49_;
			bool_44_ = true;
		}
		if (!bool_44_)
			throw new NumberFormatException();
		return i_45_;
	}

	public static boolean method13793(char c) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	static int method13794(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_50_ = false;
		boolean bool_51_ = false;
		int i_52_ = 0;
		int i_53_ = charsequence.length();
		for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
			int i_55_ = charsequence.charAt(i_54_);
			if (0 == i_54_) {
				if (45 == i_55_) {
					bool_50_ = true;
					continue;
				}
				if (43 == i_55_ && bool)
					continue;
			}
			if (i_55_ >= 48 && i_55_ <= 57)
				i_55_ -= 48;
			else if (i_55_ >= 65 && i_55_ <= 90)
				i_55_ -= 55;
			else if (i_55_ >= 97 && i_55_ <= 122)
				i_55_ -= 87;
			else
				throw new NumberFormatException();
			if (i_55_ >= i)
				throw new NumberFormatException();
			if (bool_50_)
				i_55_ = -i_55_;
			int i_56_ = i_55_ + i * i_52_;
			if (i_56_ / i != i_52_)
				throw new NumberFormatException();
			i_52_ = i_56_;
			bool_51_ = true;
		}
		if (!bool_51_)
			throw new NumberFormatException();
		return i_52_;
	}

	public static String method13795(String string, char c, String string_57_) {
		int i = string.length();
		int i_58_ = string_57_.length();
		int i_59_ = i;
		int i_60_ = i_58_ - 1;
		if (i_60_ != 0) {
			int i_61_ = 0;
			for (;;) {
				i_61_ = string.indexOf(c, i_61_);
				if (i_61_ < 0)
					break;
				i_61_++;
				i_59_ += i_60_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_59_);
		int i_62_ = 0;
		for (;;) {
			int i_63_ = string.indexOf(c, i_62_);
			if (i_63_ < 0)
				break;
			stringbuilder.append(string.substring(i_62_, i_63_));
			stringbuilder.append(string_57_);
			i_62_ = 1 + i_63_;
		}
		stringbuilder.append(string.substring(i_62_));
		return stringbuilder.toString();
	}

	public static String method13796(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class49.method1279(i, 10, bool, -1624277711);
	}

	public static boolean method13797(char c) {
		return c >= '0' && c <= '9';
	}

	public static String method13798(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class49.method1279(i, 10, bool, -1624277711);
	}

	public static int method13799(CharSequence charsequence) {
		return Class221.method4136(charsequence, 10, true, -1433624844);
	}

	public static int method13800(CharSequence charsequence) {
		int i = charsequence.length();
		int i_64_ = 0;
		for (int i_65_ = 0; i_65_ < i; i_65_++)
			i_64_ = ((i_64_ << 5) - i_64_ + Class523_Sub33.method16255(charsequence.charAt(i_65_), -74173527));
		return i_64_;
	}

	static boolean method13801(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_66_ = false;
		boolean bool_67_ = false;
		int i_68_ = 0;
		int i_69_ = charsequence.length();
		for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
			int i_71_ = charsequence.charAt(i_70_);
			if (i_70_ == 0) {
				if (45 == i_71_) {
					bool_66_ = true;
					continue;
				}
				if (i_71_ == 43 && bool)
					continue;
			}
			if (i_71_ >= 48 && i_71_ <= 57)
				i_71_ -= 48;
			else if (i_71_ >= 65 && i_71_ <= 90)
				i_71_ -= 55;
			else if (i_71_ >= 97 && i_71_ <= 122)
				i_71_ -= 87;
			else
				return false;
			if (i_71_ >= i)
				return false;
			if (bool_66_)
				i_71_ = -i_71_;
			int i_72_ = i_68_ * i + i_71_;
			if (i_72_ / i != i_68_)
				return false;
			i_68_ = i_72_;
			bool_67_ = true;
		}
		return bool_67_;
	}

	public static long method13802(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_73_ = 0; i_73_ < i; i_73_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_73_);
		return l;
	}

	public static long method13803(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_74_ = 0; i_74_ < i; i_74_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_74_);
		return l;
	}

	static int method13804(CharSequence charsequence, char c) {
		int i = 0;
		int i_75_ = charsequence.length();
		for (int i_76_ = 0; i_76_ < i_75_; i_76_++) {
			if (charsequence.charAt(i_76_) == c)
				i++;
		}
		return i;
	}

	public static long method13805(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_77_ = 0; i_77_ < i; i_77_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_77_);
		return l;
	}

	static String method13806(int i, int i_78_, boolean bool) {
		if (i_78_ < 2 || i_78_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_78_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_78_);
		int i_79_ = 2;
		int i_80_ = i / i_78_;
		while (0 != i_80_) {
			i_80_ /= i_78_;
			i_79_++;
		}
		char[] cs = new char[i_79_];
		cs[0] = '+';
		for (int i_81_ = i_79_ - 1; i_81_ > 0; i_81_--) {
			int i_82_ = i;
			i /= i_78_;
			int i_83_ = i_82_ - i_78_ * i;
			if (i_83_ >= 10)
				cs[i_81_] = (char) (87 + i_83_);
			else
				cs[i_81_] = (char) (48 + i_83_);
		}
		return new String(cs);
	}

	static int method13807(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_84_ = false;
		boolean bool_85_ = false;
		int i_86_ = 0;
		int i_87_ = charsequence.length();
		for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
			int i_89_ = charsequence.charAt(i_88_);
			if (0 == i_88_) {
				if (45 == i_89_) {
					bool_84_ = true;
					continue;
				}
				if (43 == i_89_ && bool)
					continue;
			}
			if (i_89_ >= 48 && i_89_ <= 57)
				i_89_ -= 48;
			else if (i_89_ >= 65 && i_89_ <= 90)
				i_89_ -= 55;
			else if (i_89_ >= 97 && i_89_ <= 122)
				i_89_ -= 87;
			else
				throw new NumberFormatException();
			if (i_89_ >= i)
				throw new NumberFormatException();
			if (bool_84_)
				i_89_ = -i_89_;
			int i_90_ = i_89_ + i * i_86_;
			if (i_90_ / i != i_86_)
				throw new NumberFormatException();
			i_86_ = i_90_;
			bool_85_ = true;
		}
		if (!bool_85_)
			throw new NumberFormatException();
		return i_86_;
	}

	public static boolean method13808(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static boolean method13809(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	static int method13810(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_91_ = false;
		boolean bool_92_ = false;
		int i_93_ = 0;
		int i_94_ = charsequence.length();
		for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
			int i_96_ = charsequence.charAt(i_95_);
			if (0 == i_95_) {
				if (45 == i_96_) {
					bool_91_ = true;
					continue;
				}
				if (43 == i_96_ && bool)
					continue;
			}
			if (i_96_ >= 48 && i_96_ <= 57)
				i_96_ -= 48;
			else if (i_96_ >= 65 && i_96_ <= 90)
				i_96_ -= 55;
			else if (i_96_ >= 97 && i_96_ <= 122)
				i_96_ -= 87;
			else
				throw new NumberFormatException();
			if (i_96_ >= i)
				throw new NumberFormatException();
			if (bool_91_)
				i_96_ = -i_96_;
			int i_97_ = i_96_ + i * i_93_;
			if (i_97_ / i != i_93_)
				throw new NumberFormatException();
			i_93_ = i_97_;
			bool_92_ = true;
		}
		if (!bool_92_)
			throw new NumberFormatException();
		return i_93_;
	}

	public static int method13811(CharSequence charsequence) {
		return Class221.method4136(charsequence, 10, true, -1273903523);
	}

	public static int method13812(CharSequence charsequence, int i) {
		return Class221.method4136(charsequence, i, true, 389295860);
	}

	public static String method13813(String string, char c, String string_98_) {
		int i = string.length();
		int i_99_ = string_98_.length();
		int i_100_ = i;
		int i_101_ = i_99_ - 1;
		if (i_101_ != 0) {
			int i_102_ = 0;
			for (;;) {
				i_102_ = string.indexOf(c, i_102_);
				if (i_102_ < 0)
					break;
				i_102_++;
				i_100_ += i_101_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_100_);
		int i_103_ = 0;
		for (;;) {
			int i_104_ = string.indexOf(c, i_103_);
			if (i_104_ < 0)
				break;
			stringbuilder.append(string.substring(i_103_, i_104_));
			stringbuilder.append(string_98_);
			i_103_ = 1 + i_104_;
		}
		stringbuilder.append(string.substring(i_103_));
		return stringbuilder.toString();
	}

	public static long method13814(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_105_ = 0; i_105_ < i; i_105_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_105_);
		return l;
	}

	public static String method13815(String string, char c, String string_106_) {
		int i = string.length();
		int i_107_ = string_106_.length();
		int i_108_ = i;
		int i_109_ = i_107_ - 1;
		if (i_109_ != 0) {
			int i_110_ = 0;
			for (;;) {
				i_110_ = string.indexOf(c, i_110_);
				if (i_110_ < 0)
					break;
				i_110_++;
				i_108_ += i_109_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_108_);
		int i_111_ = 0;
		for (;;) {
			int i_112_ = string.indexOf(c, i_111_);
			if (i_112_ < 0)
				break;
			stringbuilder.append(string.substring(i_111_, i_112_));
			stringbuilder.append(string_106_);
			i_111_ = 1 + i_112_;
		}
		stringbuilder.append(string.substring(i_111_));
		return stringbuilder.toString();
	}

	public static String[] method13816(String string, char c) {
		int i = Class212.method3832(string, c, 993465265);
		String[] strings = new String[i + 1];
		int i_113_ = 0;
		int i_114_ = 0;
		for (int i_115_ = 0; i_115_ < i; i_115_++) {
			int i_116_;
			for (i_116_ = i_114_; string.charAt(i_116_) != c; i_116_++) {
				/* empty */
			}
			strings[i_113_++] = string.substring(i_114_, i_116_);
			i_114_ = i_116_ + 1;
		}
		strings[i] = string.substring(i_114_);
		return strings;
	}

	public static String[] method13817(String string, char c) {
		int i = Class212.method3832(string, c, 114739473);
		String[] strings = new String[i + 1];
		int i_117_ = 0;
		int i_118_ = 0;
		for (int i_119_ = 0; i_119_ < i; i_119_++) {
			int i_120_;
			for (i_120_ = i_118_; string.charAt(i_120_) != c; i_120_++) {
				/* empty */
			}
			strings[i_117_++] = string.substring(i_118_, i_120_);
			i_118_ = i_120_ + 1;
		}
		strings[i] = string.substring(i_118_);
		return strings;
	}

	public static String[] method13818(String string, char c) {
		int i = Class212.method3832(string, c, 238803809);
		String[] strings = new String[i + 1];
		int i_121_ = 0;
		int i_122_ = 0;
		for (int i_123_ = 0; i_123_ < i; i_123_++) {
			int i_124_;
			for (i_124_ = i_122_; string.charAt(i_124_) != c; i_124_++) {
				/* empty */
			}
			strings[i_121_++] = string.substring(i_122_, i_124_);
			i_122_ = i_124_ + 1;
		}
		strings[i] = string.substring(i_122_);
		return strings;
	}

	public static String[] method13819(String string, char c) {
		int i = Class212.method3832(string, c, 687791261);
		String[] strings = new String[i + 1];
		int i_125_ = 0;
		int i_126_ = 0;
		for (int i_127_ = 0; i_127_ < i; i_127_++) {
			int i_128_;
			for (i_128_ = i_126_; string.charAt(i_128_) != c; i_128_++) {
				/* empty */
			}
			strings[i_125_++] = string.substring(i_126_, i_128_);
			i_126_ = i_128_ + 1;
		}
		strings[i] = string.substring(i_126_);
		return strings;
	}

	public static String[] method13820(String string, char c) {
		int i = Class212.method3832(string, c, 243076817);
		String[] strings = new String[i + 1];
		int i_129_ = 0;
		int i_130_ = 0;
		for (int i_131_ = 0; i_131_ < i; i_131_++) {
			int i_132_;
			for (i_132_ = i_130_; string.charAt(i_132_) != c; i_132_++) {
				/* empty */
			}
			strings[i_129_++] = string.substring(i_130_, i_132_);
			i_130_ = i_132_ + 1;
		}
		strings[i] = string.substring(i_130_);
		return strings;
	}

	Class678() throws Throwable {
		throw new Error();
	}

	public static int method13821(int i, int i_133_, int i_134_) {
		if (-1 == 2097573757 * Class523_Sub11.aClass625_10427.anInt8169)
			return 1;
		if (i != Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -55)) {
			Class562.method9463(i, Class39.aClass39_475.method1124(Class53_Sub20.aClass668_10979, (byte) -100), true, (byte) -111);
			if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -10) != i)
				return -1;
		}
		int i_135_;
		try {
			Dimension dimension = Class523_Sub18_Sub8.aCanvas11689.getSize();
			Class397.method6524(Class39.aClass39_475.method1124(Class53_Sub20.aClass668_10979, (byte) -44), true, Class31.aClass178_303, Class10.aClass164_83, Class46.aClass10_672, -1984660817);
			Class179 class179 = Class179.method3485(Class413.aClass472_4583, 2097573757 * (Class523_Sub11.aClass625_10427.anInt8169), 0);
			long l = Class248.method4401(1516375036);
			Class31.aClass178_303.method3071();
			client.aClass435_11005.method6817(0.0F, 256.0F, 0.0F);
			Class31.aClass178_303.method3300(client.aClass435_11005);
			Class441 class441 = Class31.aClass178_303.method3112();
			class441.method7136((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) client.aClass505_11019.method8239((byte) -105), (float) client.aClass505_11019.method8240(749989795), (float) dimension.width, (float) dimension.height);
			Class31.aClass178_303.method3124(class441);
			Class31.aClass178_303.method3126(1.0F);
			Class31.aClass178_303.method3460(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			Class167 class167 = Class31.aClass178_303.method3115(class179, 2048, 64, 64, 768);
			int i_136_ = 0;
			while_146_: for (int i_137_ = 0; i_137_ < 500; i_137_++) {
				Class31.aClass178_303.method3076(3, 0);
				for (int i_138_ = 15; i_138_ >= 0; i_138_--) {
					for (int i_139_ = 0; i_139_ <= i_138_; i_139_++) {
						client.aClass435_11006.method6817((float) (int) (((float) i_139_ - (float) i_138_ / 2.0F) * 512.0F), 0.0F, (float) (512 * (1 + i_138_)));
						class167.method2708(client.aClass435_11006, null, 0);
						i_136_++;
						if (Class248.method4401(1516375036) - l >= (long) i_133_)
							break while_146_;
					}
				}
			}
			Class31.aClass178_303.method3021();
			long l_140_ = ((long) (1000 * i_136_) / (Class248.method4401(1516375036) - l));
			Class31.aClass178_303.method3076(3, 0);
			i_135_ = (int) l_140_;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return -1;
		}
		return i_135_;
	}

	static final void method13822(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloat11214 >> 3;
	}
}
