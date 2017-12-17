/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class10 {
	public int anInt76;
	byte[][] aByteArrayArray77;
	public int anInt78;
	public Interface4 anInterface4_79;
	public int anInt80;
	static String[] aStringArray81 = new String[100];
	byte[] aByteArray82;
	public static Class164 aClass164_83;

	public int method594(String string, int[] is, String[] strings, Interface3[] interface3s) {
		return method601(string, is, strings, interface3s, true, -499033048);
	}

	public int method595(int i, char c, int i_0_) {
		if (null != aByteArrayArray77)
			return aByteArrayArray77[i][c];
		return 0;
	}

	public int method596(int i, int i_1_) {
		return aByteArray82[i] & 0xff;
	}

	public int method597(String string, int i) {
		return method626(string, null, -1942791872);
	}

	public String method598(String string, int i, Interface3[] interface3s, int i_2_, int i_3_) {
		int i_4_ = method600(string, new int[] { i }, aStringArray81, interface3s, -1178526212);
		if (i_2_ >= 0 && i_2_ < i_4_)
			return aStringArray81[i_2_];
		return null;
	}

	public String method599(String string, int i, Interface3[] interface3s, byte i_5_) {
		if (method626(string, interface3s, -1942791872) <= i)
			return string;
		i -= method626("...", null, -1942791872);
		int i_6_ = -1;
		int i_7_ = -1;
		int i_8_ = 0;
		int i_9_ = string.length();
		String string_10_ = "";
		for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
			char c = string.charAt(i_11_);
			if (60 == c)
				i_6_ = i_11_;
			else {
				if (62 == c && i_6_ != -1) {
					String string_12_ = string.substring(i_6_ + 1, i_11_);
					i_6_ = -1;
					if (string_12_.equals("lt"))
						c = '<';
					else if (string_12_.equals("gt"))
						c = '>';
					else if (string_12_.equals("nbsp"))
						c = '\u00a0';
					else if (string_12_.equals("shy"))
						c = '\u00ad';
					else if (string_12_.equals("times"))
						c = '\u00d7';
					else if (string_12_.equals("euro"))
						c = '\u0080';
					else if (string_12_.equals("copy"))
						c = '\u00a9';
					else if (string_12_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_12_.startsWith("img=") && interface3s != null) {
							try {
								int i_13_ = (Class458_Sub1.method15856(string_12_.substring(4), (byte) 58));
								i_8_ += interface3s[i_13_].method38();
								i_7_ = -1;
								if (i_8_ > i)
									return new StringBuilder().append(string_10_).append("...").toString();
								string_10_ = string.substring(0, i_11_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_12_.startsWith("sprite=") && anInterface4_79 != null) {
							try {
								int i_14_ = -1;
								int i_15_ = string_12_.indexOf(',');
								if (i_15_ == -1)
									i_14_ = (Class458_Sub1.method15856(string_12_.substring(7), (byte) 2));
								else
									i_14_ = (Class458_Sub1.method15856(string_12_.substring(7, i_15_), (byte) 37));
								i_8_ += anInterface4_79.method41(i_14_, 1299932566);
								i_7_ = -1;
								if (i_8_ > i)
									return new StringBuilder().append(string_10_).append("...").toString();
								string_10_ = string.substring(0, i_11_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_6_ == -1) {
					i_8_ += aByteArray82[(Class523_Sub33.method16255(c, -74173527) & 0xff)] & 0xff;
					if (aByteArrayArray77 != null && i_7_ != -1)
						i_8_ += aByteArrayArray77[i_7_][c];
					i_7_ = c;
					int i_16_ = i_8_;
					if (aByteArrayArray77 != null)
						i_16_ += aByteArrayArray77[c][46];
					if (i_16_ > i)
						return new StringBuilder().append(string_10_).append("...").toString();
					string_10_ = string.substring(0, i_11_ + 1);
				}
			}
		}
		return string;
	}

	public int method600(String string, int[] is, String[] strings, Interface3[] interface3s, int i) {
		return method601(string, is, strings, interface3s, true, 711871299);
	}

	int method601(String string, int[] is, String[] strings, Interface3[] interface3s, boolean bool, int i) {
		if (null == string)
			return 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = -1;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = -1;
		int i_23_ = -1;
		int i_24_ = 0;
		int i_25_ = string.length();
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			int i_27_ = (Class523_Sub33.method16255(string.charAt(i_26_), -74173527) & 0xff);
			int i_28_ = 0;
			if (60 == i_27_)
				i_22_ = i_26_;
			else {
				int i_29_;
				if (i_22_ != -1) {
					if (i_27_ != 62)
						continue;
					i_29_ = i_22_;
					String string_30_ = string.substring(1 + i_22_, i_26_);
					i_22_ = -1;
					if (string_30_.equals("br")) {
						strings[i_24_] = string.substring(i_18_, 1 + i_26_);
						if (++i_24_ >= strings.length)
							return 0;
						i_18_ = 1 + i_26_;
						i_17_ = 0;
						i_19_ = -1;
						i_23_ = -1;
						continue;
					}
					if (string_30_.equals("lt")) {
						i_28_ += method596(60, -1681683349);
						if (null != aByteArrayArray77 && -1 != i_23_)
							i_28_ += aByteArrayArray77[i_23_][60];
						i_23_ = 60;
					} else if (string_30_.equals("gt")) {
						i_28_ += method596(62, -1780834800);
						if (null != aByteArrayArray77 && i_23_ != -1)
							i_28_ += aByteArrayArray77[i_23_][62];
						i_23_ = 62;
					} else if (string_30_.equals("nbsp")) {
						i_28_ += method596(160, -507936017);
						if (null != aByteArrayArray77 && -1 != i_23_)
							i_28_ += aByteArrayArray77[i_23_][160];
						i_23_ = 160;
					} else if (string_30_.equals("shy")) {
						i_28_ += method596(173, -1733786413);
						if (aByteArrayArray77 != null && -1 != i_23_)
							i_28_ += aByteArrayArray77[i_23_][173];
						i_23_ = 173;
					} else if (string_30_.equals("times")) {
						i_28_ += method596(215, -576223306);
						if (aByteArrayArray77 != null && -1 != i_23_)
							i_28_ += aByteArrayArray77[i_23_][215];
						i_23_ = 215;
					} else if (string_30_.equals("euro")) {
						i_28_ += method596(128, 77914653);
						if (null != aByteArrayArray77 && -1 != i_23_)
							i_28_ += aByteArrayArray77[i_23_][128];
						i_23_ = 128;
					} else if (string_30_.equals("copy")) {
						i_28_ += method596(169, 142356961);
						if (null != aByteArrayArray77 && -1 != i_23_)
							i_28_ += aByteArrayArray77[i_23_][169];
						i_23_ = 169;
					} else if (string_30_.equals("reg")) {
						i_28_ += method596(174, -385044388);
						if (aByteArrayArray77 != null && i_23_ != -1)
							i_28_ += aByteArrayArray77[i_23_][174];
						i_23_ = 174;
					} else if (string_30_.startsWith("img=") && null != interface3s) {
						try {
							int i_31_ = Class458_Sub1.method15856(string_30_.substring(4), (byte) 125);
							i_28_ += interface3s[i_31_].method38();
							i_23_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					} else if (string_30_.startsWith("sprite=") && anInterface4_79 != null) {
						try {
							int i_32_ = -1;
							int i_33_ = string_30_.indexOf(',');
							if (i_33_ == -1)
								i_32_ = (Class458_Sub1.method15856(string_30_.substring(7), (byte) 17));
							else
								i_32_ = (Class458_Sub1.method15856(string_30_.substring(7, i_33_), (byte) 96));
							i_28_ += anInterface4_79.method41(i_32_, 2064923234);
							i_23_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
						continue;
					}
					i_27_ = -1;
				} else {
					i_29_ = i_26_;
					i_28_ += method596(i_27_, -1984487341);
					if (null != aByteArrayArray77 && -1 != i_23_)
						i_28_ += aByteArrayArray77[i_23_][i_27_];
					i_23_ = i_27_;
				}
				if (i_28_ > 0) {
					i_17_ += i_28_;
					if (null != is) {
						if (32 == i_27_) {
							i_19_ = i_26_;
							i_20_ = i_17_;
							i_21_ = bool ? 1 : 0;
						}
						if (i_17_ > is[i_24_ < is.length ? i_24_ : is.length - 1]) {
							if (i_19_ >= 0) {
								strings[i_24_] = string.substring(i_18_, i_19_ + 1 - i_21_);
								if (++i_24_ >= strings.length)
									return 0;
								i_18_ = i_19_ + 1;
								i_19_ = -1;
								i_17_ -= i_20_;
								i_23_ = -1;
							} else {
								strings[i_24_] = string.substring(i_18_, i_29_);
								if (++i_24_ >= strings.length)
									return 0;
								i_18_ = i_29_;
								i_19_ = -1;
								i_17_ = i_28_;
								i_23_ = -1;
							}
						}
						if (i_27_ == 45) {
							i_19_ = i_26_;
							i_20_ = i_17_;
							i_21_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_18_) {
			strings[i_24_] = string.substring(i_18_, string.length());
			i_24_++;
		}
		return i_24_;
	}

	public int method602(String string, int i, Interface3[] interface3s, int i_34_) {
		int i_35_ = method600(string, new int[] { i }, aStringArray81, interface3s, -1289189915);
		int i_36_ = 0;
		for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
			int i_38_ = method626(aStringArray81[i_37_], interface3s, -1942791872);
			if (i_38_ > i_36_)
				i_36_ = i_38_;
		}
		return i_36_;
	}

	public int method603(String string, int i, Interface3[] interface3s, int i_39_) {
		return method600(string, new int[] { i }, aStringArray81, interface3s, -1475632776);
	}

	public String method604(String string, int i, Interface3[] interface3s) {
		if (method626(string, interface3s, -1942791872) <= i)
			return string;
		i -= method626("...", null, -1942791872);
		int i_40_ = -1;
		int i_41_ = -1;
		int i_42_ = 0;
		int i_43_ = string.length();
		String string_44_ = "";
		for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
			char c = string.charAt(i_45_);
			if (60 == c)
				i_40_ = i_45_;
			else {
				if (62 == c && i_40_ != -1) {
					String string_46_ = string.substring(i_40_ + 1, i_45_);
					i_40_ = -1;
					if (string_46_.equals("lt"))
						c = '<';
					else if (string_46_.equals("gt"))
						c = '>';
					else if (string_46_.equals("nbsp"))
						c = '\u00a0';
					else if (string_46_.equals("shy"))
						c = '\u00ad';
					else if (string_46_.equals("times"))
						c = '\u00d7';
					else if (string_46_.equals("euro"))
						c = '\u0080';
					else if (string_46_.equals("copy"))
						c = '\u00a9';
					else if (string_46_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_46_.startsWith("img=") && interface3s != null) {
							try {
								int i_47_ = (Class458_Sub1.method15856(string_46_.substring(4), (byte) 87));
								i_42_ += interface3s[i_47_].method38();
								i_41_ = -1;
								if (i_42_ > i)
									return new StringBuilder().append(string_44_).append("...").toString();
								string_44_ = string.substring(0, i_45_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_46_.startsWith("sprite=") && anInterface4_79 != null) {
							try {
								int i_48_ = -1;
								int i_49_ = string_46_.indexOf(',');
								if (i_49_ == -1)
									i_48_ = (Class458_Sub1.method15856(string_46_.substring(7), (byte) 83));
								else
									i_48_ = (Class458_Sub1.method15856(string_46_.substring(7, i_49_), (byte) 104));
								i_42_ += anInterface4_79.method41(i_48_, 1152180955);
								i_41_ = -1;
								if (i_42_ > i)
									return new StringBuilder().append(string_44_).append("...").toString();
								string_44_ = string.substring(0, i_45_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_40_ == -1) {
					i_42_ += ((aByteArray82[Class523_Sub33.method16255(c, -74173527) & 0xff]) & 0xff);
					if (aByteArrayArray77 != null && i_41_ != -1)
						i_42_ += aByteArrayArray77[i_41_][c];
					i_41_ = c;
					int i_50_ = i_42_;
					if (aByteArrayArray77 != null)
						i_50_ += aByteArrayArray77[c][46];
					if (i_50_ > i)
						return new StringBuilder().append(string_44_).append("...").toString();
					string_44_ = string.substring(0, i_45_ + 1);
				}
			}
		}
		return string;
	}

	public int method605(String string, int i, int i_51_, Interface3[] interface3s, int i_52_) {
		if (i_51_ == 0)
			i_51_ = 1061510757 * anInt78;
		int i_53_ = method600(string, new int[] { i }, aStringArray81, interface3s, -497534807);
		int i_54_ = i_51_ * (i_53_ - 1);
		return anInt80 * -853549931 + (i_54_ + -1669009881 * anInt76);
	}

	public int method606(String string, int[] is, String[] strings, Interface3[] interface3s) {
		return method601(string, is, strings, interface3s, true, -1209609035);
	}

	public int method607(String string, int i, int i_55_, int i_56_, int i_57_, Interface3[] interface3s, int i_58_) {
		if (0 == i_55_)
			i_55_ = 1061510757 * anInt78;
		int i_59_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, -1329570926);
		if (0 == i_59_)
			return 0;
		if (i_57_ < 0)
			i_57_ = 0;
		i_57_ /= i_55_;
		if (i_57_ >= i_59_)
			i_57_ = i_59_ - 1;
		String string_60_ = aStringArray81[i_57_];
		int i_61_ = 0;
		int i_62_ = 0;
		int i_63_;
		for (i_63_ = 0; i_63_ < i_56_ && i_61_ < string_60_.length(); i_63_ = method626(string_60_.substring(0, ++i_61_), interface3s, -1942791872))
			i_62_ = i_63_;
		if (i_61_ == string_60_.length() && string_60_.endsWith("<br>"))
			i_61_ -= 4;
		if (i_56_ - i_62_ < i_63_ - i_56_)
			i_61_--;
		for (int i_64_ = 0; i_64_ < i_57_; i_64_++)
			i_61_ += aStringArray81[i_64_].length();
		return i_61_;
	}

	public static Class10 method608(Class472 class472, int i, int i_65_) {
		return Class628.method10312(class472, i, i_65_, null, (byte) 22);
	}

	public static Class10 method609(Class472 class472, int i, int i_66_, Interface4 interface4) {
		byte[] is = class472.method7688(i, i_66_, -1039446547);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}

	public static Class10 method610(Class472 class472, int i, int i_67_, Interface4 interface4) {
		byte[] is = class472.method7688(i, i_67_, 1825175452);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}

	static int method611(byte[][] is, byte[][] is_68_, int[] is_69_, byte[] is_70_, int[] is_71_, int i, int i_72_) {
		int i_73_ = is_69_[i];
		int i_74_ = i_73_ + is_71_[i];
		int i_75_ = is_69_[i_72_];
		int i_76_ = i_75_ + is_71_[i_72_];
		int i_77_ = i_73_;
		if (i_75_ > i_73_)
			i_77_ = i_75_;
		int i_78_ = i_74_;
		if (i_76_ < i_74_)
			i_78_ = i_76_;
		int i_79_ = is_70_[i] & 0xff;
		if ((is_70_[i_72_] & 0xff) < i_79_)
			i_79_ = is_70_[i_72_] & 0xff;
		byte[] is_80_ = is_68_[i];
		byte[] is_81_ = is[i_72_];
		int i_82_ = i_77_ - i_73_;
		int i_83_ = i_77_ - i_75_;
		for (int i_84_ = i_77_; i_84_ < i_78_; i_84_++) {
			int i_85_ = is_80_[i_82_++] + is_81_[i_83_++];
			if (i_85_ < i_79_)
				i_79_ = i_85_;
		}
		return -i_79_;
	}

	public static Class10 method612(Class472 class472, int i, Interface4 interface4) {
		byte[] is = class472.method7721(i, -387132909);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}

	public String method613(String string, int i, Interface3[] interface3s, int i_86_) {
		int i_87_ = method600(string, new int[] { i }, aStringArray81, interface3s, 1983085324);
		if (i_86_ >= 0 && i_86_ < i_87_)
			return aStringArray81[i_86_];
		return null;
	}

	public int method614(String string, int i, int i_88_, int i_89_, int i_90_, Interface3[] interface3s) {
		if (0 == i_88_)
			i_88_ = 1061510757 * anInt78;
		int i_91_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, 2101018616);
		if (0 == i_91_)
			return 0;
		if (i_90_ < 0)
			i_90_ = 0;
		i_90_ /= i_88_;
		if (i_90_ >= i_91_)
			i_90_ = i_91_ - 1;
		String string_92_ = aStringArray81[i_90_];
		int i_93_ = 0;
		int i_94_ = 0;
		int i_95_;
		for (i_95_ = 0; i_95_ < i_89_ && i_93_ < string_92_.length(); i_95_ = method626(string_92_.substring(0, ++i_93_), interface3s, -1942791872))
			i_94_ = i_95_;
		if (i_93_ == string_92_.length() && string_92_.endsWith("<br>"))
			i_93_ -= 4;
		if (i_89_ - i_94_ < i_95_ - i_89_)
			i_93_--;
		for (int i_96_ = 0; i_96_ < i_90_; i_96_++)
			i_93_ += aStringArray81[i_96_].length();
		return i_93_;
	}

	public int method615(String string) {
		return method626(string, null, -1942791872);
	}

	public int method616(int i) {
		return aByteArray82[i] & 0xff;
	}

	public int method617(String string) {
		return method626(string, null, -1942791872);
	}

	public Point method618(String string, int i, int i_97_, int i_98_, Interface3[] interface3s, int i_99_) {
		if (i_98_ <= 0)
			return new Point(0, i_97_ + -1669009881 * anInt76);
		if (i_98_ > string.length())
			i_98_ = string.length();
		if (0 == i_97_)
			i_97_ = 1061510757 * anInt78;
		int i_100_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, -1140483741);
		int i_101_ = 0;
		for (int i_102_ = 0; i_102_ < i_100_; i_102_++) {
			int i_103_ = aStringArray81[i_102_].length();
			if (i_103_ + i_101_ > i_98_ || i_100_ - 1 == i_102_ && i_98_ == string.length()) {
				String string_104_ = string.substring(i_101_, i_98_);
				if (string_104_.endsWith("<br>")) {
					string_104_ = "";
					i_101_ += i_103_;
					i_102_++;
				}
				int i_105_ = method626(string_104_, interface3s, -1942791872);
				int i_106_ = anInt76 * -1669009881 + i_97_ * i_102_;
				return new Point(i_105_, i_106_);
			}
			i_101_ += i_103_;
		}
		return null;
	}

	public int method619(String string, Interface3[] interface3s) {
		if (string == null)
			return 0;
		int i = -1;
		int i_107_ = -1;
		int i_108_ = 0;
		int i_109_ = string.length();
		for (int i_110_ = 0; i_110_ < i_109_; i_110_++) {
			char c = string.charAt(i_110_);
			if (60 == c)
				i = i_110_;
			else {
				if (c == 62 && i != -1) {
					String string_111_ = string.substring(1 + i, i_110_);
					i = -1;
					if (string_111_.equals("lt"))
						c = '<';
					else if (string_111_.equals("gt"))
						c = '>';
					else if (string_111_.equals("nbsp"))
						c = '\u00a0';
					else if (string_111_.equals("shy"))
						c = '\u00ad';
					else if (string_111_.equals("times"))
						c = '\u00d7';
					else if (string_111_.equals("euro"))
						c = '\u0080';
					else if (string_111_.equals("copy"))
						c = '\u00a9';
					else if (string_111_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_111_.startsWith("img=") && null != interface3s) {
							try {
								int i_112_ = (Class458_Sub1.method15856(string_111_.substring(4), (byte) 108));
								i_108_ += interface3s[i_112_].method38();
								i_107_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_111_.startsWith("sprite=") && anInterface4_79 != null) {
							try {
								int i_113_ = -1;
								int i_114_ = string_111_.indexOf(',');
								if (i_114_ == -1)
									i_113_ = (Class458_Sub1.method15856(string_111_.substring(7), (byte) 31));
								else
									i_113_ = (Class458_Sub1.method15856(string_111_.substring(7, i_114_), (byte) 46));
								i_108_ += anInterface4_79.method41(i_113_, -203988256);
								i_107_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_108_ += ((aByteArray82[Class523_Sub33.method16255(c, -74173527) & 0xff]) & 0xff);
					if (aByteArrayArray77 != null && -1 != i_107_)
						i_108_ += aByteArrayArray77[i_107_][c];
					i_107_ = c;
				}
			}
		}
		return i_108_;
	}

	public int method620(String string, Interface3[] interface3s) {
		if (string == null)
			return 0;
		int i = -1;
		int i_115_ = -1;
		int i_116_ = 0;
		int i_117_ = string.length();
		for (int i_118_ = 0; i_118_ < i_117_; i_118_++) {
			char c = string.charAt(i_118_);
			if (60 == c)
				i = i_118_;
			else {
				if (c == 62 && i != -1) {
					String string_119_ = string.substring(1 + i, i_118_);
					i = -1;
					if (string_119_.equals("lt"))
						c = '<';
					else if (string_119_.equals("gt"))
						c = '>';
					else if (string_119_.equals("nbsp"))
						c = '\u00a0';
					else if (string_119_.equals("shy"))
						c = '\u00ad';
					else if (string_119_.equals("times"))
						c = '\u00d7';
					else if (string_119_.equals("euro"))
						c = '\u0080';
					else if (string_119_.equals("copy"))
						c = '\u00a9';
					else if (string_119_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_119_.startsWith("img=") && null != interface3s) {
							try {
								int i_120_ = (Class458_Sub1.method15856(string_119_.substring(4), (byte) 59));
								i_116_ += interface3s[i_120_].method38();
								i_115_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_119_.startsWith("sprite=") && anInterface4_79 != null) {
							try {
								int i_121_ = -1;
								int i_122_ = string_119_.indexOf(',');
								if (i_122_ == -1)
									i_121_ = (Class458_Sub1.method15856(string_119_.substring(7), (byte) 25));
								else
									i_121_ = (Class458_Sub1.method15856(string_119_.substring(7, i_122_), (byte) 106));
								i_116_ += anInterface4_79.method41(i_121_, 76620466);
								i_115_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_116_ += ((aByteArray82[Class523_Sub33.method16255(c, -74173527) & 0xff]) & 0xff);
					if (aByteArrayArray77 != null && -1 != i_115_)
						i_116_ += aByteArrayArray77[i_115_][c];
					i_115_ = c;
				}
			}
		}
		return i_116_;
	}

	int method621(String string, int[] is, String[] strings, Interface3[] interface3s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_123_ = 0;
		int i_124_ = -1;
		int i_125_ = 0;
		int i_126_ = 0;
		int i_127_ = -1;
		int i_128_ = -1;
		int i_129_ = 0;
		int i_130_ = string.length();
		for (int i_131_ = 0; i_131_ < i_130_; i_131_++) {
			int i_132_ = (Class523_Sub33.method16255(string.charAt(i_131_), -74173527) & 0xff);
			int i_133_ = 0;
			if (60 == i_132_)
				i_127_ = i_131_;
			else {
				int i_134_;
				if (i_127_ != -1) {
					if (i_132_ != 62)
						continue;
					i_134_ = i_127_;
					String string_135_ = string.substring(1 + i_127_, i_131_);
					i_127_ = -1;
					if (string_135_.equals("br")) {
						strings[i_129_] = string.substring(i_123_, 1 + i_131_);
						if (++i_129_ >= strings.length)
							return 0;
						i_123_ = 1 + i_131_;
						i = 0;
						i_124_ = -1;
						i_128_ = -1;
						continue;
					}
					if (string_135_.equals("lt")) {
						i_133_ += method596(60, -1164492336);
						if (null != aByteArrayArray77 && -1 != i_128_)
							i_133_ += aByteArrayArray77[i_128_][60];
						i_128_ = 60;
					} else if (string_135_.equals("gt")) {
						i_133_ += method596(62, -1925718990);
						if (null != aByteArrayArray77 && i_128_ != -1)
							i_133_ += aByteArrayArray77[i_128_][62];
						i_128_ = 62;
					} else if (string_135_.equals("nbsp")) {
						i_133_ += method596(160, -1188131790);
						if (null != aByteArrayArray77 && -1 != i_128_)
							i_133_ += aByteArrayArray77[i_128_][160];
						i_128_ = 160;
					} else if (string_135_.equals("shy")) {
						i_133_ += method596(173, -825876050);
						if (aByteArrayArray77 != null && -1 != i_128_)
							i_133_ += aByteArrayArray77[i_128_][173];
						i_128_ = 173;
					} else if (string_135_.equals("times")) {
						i_133_ += method596(215, -1808236336);
						if (aByteArrayArray77 != null && -1 != i_128_)
							i_133_ += aByteArrayArray77[i_128_][215];
						i_128_ = 215;
					} else if (string_135_.equals("euro")) {
						i_133_ += method596(128, -1472089569);
						if (null != aByteArrayArray77 && -1 != i_128_)
							i_133_ += aByteArrayArray77[i_128_][128];
						i_128_ = 128;
					} else if (string_135_.equals("copy")) {
						i_133_ += method596(169, -1350551202);
						if (null != aByteArrayArray77 && -1 != i_128_)
							i_133_ += aByteArrayArray77[i_128_][169];
						i_128_ = 169;
					} else if (string_135_.equals("reg")) {
						i_133_ += method596(174, -181609207);
						if (aByteArrayArray77 != null && i_128_ != -1)
							i_133_ += aByteArrayArray77[i_128_][174];
						i_128_ = 174;
					} else if (string_135_.startsWith("img=") && null != interface3s) {
						try {
							int i_136_ = Class458_Sub1.method15856(string_135_.substring(4), (byte) 104);
							i_133_ += interface3s[i_136_].method38();
							i_128_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					} else if (string_135_.startsWith("sprite=") && anInterface4_79 != null) {
						try {
							int i_137_ = -1;
							int i_138_ = string_135_.indexOf(',');
							if (i_138_ == -1)
								i_137_ = (Class458_Sub1.method15856(string_135_.substring(7), (byte) 69));
							else
								i_137_ = (Class458_Sub1.method15856(string_135_.substring(7, i_138_), (byte) 85));
							i_133_ += anInterface4_79.method41(i_137_, 2019462432);
							i_128_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
						continue;
					}
					i_132_ = -1;
				} else {
					i_134_ = i_131_;
					i_133_ += method596(i_132_, 239346949);
					if (null != aByteArrayArray77 && -1 != i_128_)
						i_133_ += aByteArrayArray77[i_128_][i_132_];
					i_128_ = i_132_;
				}
				if (i_133_ > 0) {
					i += i_133_;
					if (null != is) {
						if (32 == i_132_) {
							i_124_ = i_131_;
							i_125_ = i;
							i_126_ = bool ? 1 : 0;
						}
						if (i > is[(i_129_ < is.length ? i_129_ : is.length - 1)]) {
							if (i_124_ >= 0) {
								strings[i_129_] = string.substring(i_123_, i_124_ + 1 - i_126_);
								if (++i_129_ >= strings.length)
									return 0;
								i_123_ = i_124_ + 1;
								i_124_ = -1;
								i -= i_125_;
								i_128_ = -1;
							} else {
								strings[i_129_] = string.substring(i_123_, i_134_);
								if (++i_129_ >= strings.length)
									return 0;
								i_123_ = i_134_;
								i_124_ = -1;
								i = i_133_;
								i_128_ = -1;
							}
						}
						if (i_132_ == 45) {
							i_124_ = i_131_;
							i_125_ = i;
							i_126_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_123_) {
			strings[i_129_] = string.substring(i_123_, string.length());
			i_129_++;
		}
		return i_129_;
	}

	public static Class10 method622(Class472 class472, int i, Interface4 interface4) {
		byte[] is = class472.method7721(i, -387132909);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}

	public int method623(String string, int i, int i_139_, Interface3[] interface3s) {
		if (i_139_ == 0)
			i_139_ = 1061510757 * anInt78;
		int i_140_ = method600(string, new int[] { i }, aStringArray81, interface3s, -182382528);
		int i_141_ = i_139_ * (i_140_ - 1);
		return anInt80 * -853549931 + (i_141_ + -1669009881 * anInt76);
	}

	public int method624(String string, int[] is, String[] strings, Interface3[] interface3s) {
		return method601(string, is, strings, interface3s, true, 519945673);
	}

	int method625(String string, int[] is, String[] strings, Interface3[] interface3s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_142_ = 0;
		int i_143_ = -1;
		int i_144_ = 0;
		int i_145_ = 0;
		int i_146_ = -1;
		int i_147_ = -1;
		int i_148_ = 0;
		int i_149_ = string.length();
		for (int i_150_ = 0; i_150_ < i_149_; i_150_++) {
			int i_151_ = (Class523_Sub33.method16255(string.charAt(i_150_), -74173527) & 0xff);
			int i_152_ = 0;
			if (60 == i_151_)
				i_146_ = i_150_;
			else {
				int i_153_;
				if (i_146_ != -1) {
					if (i_151_ != 62)
						continue;
					i_153_ = i_146_;
					String string_154_ = string.substring(1 + i_146_, i_150_);
					i_146_ = -1;
					if (string_154_.equals("br")) {
						strings[i_148_] = string.substring(i_142_, 1 + i_150_);
						if (++i_148_ >= strings.length)
							return 0;
						i_142_ = 1 + i_150_;
						i = 0;
						i_143_ = -1;
						i_147_ = -1;
						continue;
					}
					if (string_154_.equals("lt")) {
						i_152_ += method596(60, -2011581549);
						if (null != aByteArrayArray77 && -1 != i_147_)
							i_152_ += aByteArrayArray77[i_147_][60];
						i_147_ = 60;
					} else if (string_154_.equals("gt")) {
						i_152_ += method596(62, 266243057);
						if (null != aByteArrayArray77 && i_147_ != -1)
							i_152_ += aByteArrayArray77[i_147_][62];
						i_147_ = 62;
					} else if (string_154_.equals("nbsp")) {
						i_152_ += method596(160, -685205472);
						if (null != aByteArrayArray77 && -1 != i_147_)
							i_152_ += aByteArrayArray77[i_147_][160];
						i_147_ = 160;
					} else if (string_154_.equals("shy")) {
						i_152_ += method596(173, 309586954);
						if (aByteArrayArray77 != null && -1 != i_147_)
							i_152_ += aByteArrayArray77[i_147_][173];
						i_147_ = 173;
					} else if (string_154_.equals("times")) {
						i_152_ += method596(215, -2005249947);
						if (aByteArrayArray77 != null && -1 != i_147_)
							i_152_ += aByteArrayArray77[i_147_][215];
						i_147_ = 215;
					} else if (string_154_.equals("euro")) {
						i_152_ += method596(128, -2040450519);
						if (null != aByteArrayArray77 && -1 != i_147_)
							i_152_ += aByteArrayArray77[i_147_][128];
						i_147_ = 128;
					} else if (string_154_.equals("copy")) {
						i_152_ += method596(169, -1527494285);
						if (null != aByteArrayArray77 && -1 != i_147_)
							i_152_ += aByteArrayArray77[i_147_][169];
						i_147_ = 169;
					} else if (string_154_.equals("reg")) {
						i_152_ += method596(174, -991808745);
						if (aByteArrayArray77 != null && i_147_ != -1)
							i_152_ += aByteArrayArray77[i_147_][174];
						i_147_ = 174;
					} else if (string_154_.startsWith("img=") && null != interface3s) {
						try {
							int i_155_ = Class458_Sub1.method15856(string_154_.substring(4), (byte) 75);
							i_152_ += interface3s[i_155_].method38();
							i_147_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					} else if (string_154_.startsWith("sprite=") && anInterface4_79 != null) {
						try {
							int i_156_ = -1;
							int i_157_ = string_154_.indexOf(',');
							if (i_157_ == -1)
								i_156_ = (Class458_Sub1.method15856(string_154_.substring(7), (byte) 127));
							else
								i_156_ = (Class458_Sub1.method15856(string_154_.substring(7, i_157_), (byte) 101));
							i_152_ += anInterface4_79.method41(i_156_, 731905015);
							i_147_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
						continue;
					}
					i_151_ = -1;
				} else {
					i_153_ = i_150_;
					i_152_ += method596(i_151_, -1803806580);
					if (null != aByteArrayArray77 && -1 != i_147_)
						i_152_ += aByteArrayArray77[i_147_][i_151_];
					i_147_ = i_151_;
				}
				if (i_152_ > 0) {
					i += i_152_;
					if (null != is) {
						if (32 == i_151_) {
							i_143_ = i_150_;
							i_144_ = i;
							i_145_ = bool ? 1 : 0;
						}
						if (i > is[(i_148_ < is.length ? i_148_ : is.length - 1)]) {
							if (i_143_ >= 0) {
								strings[i_148_] = string.substring(i_142_, i_143_ + 1 - i_145_);
								if (++i_148_ >= strings.length)
									return 0;
								i_142_ = i_143_ + 1;
								i_143_ = -1;
								i -= i_144_;
								i_147_ = -1;
							} else {
								strings[i_148_] = string.substring(i_142_, i_153_);
								if (++i_148_ >= strings.length)
									return 0;
								i_142_ = i_153_;
								i_143_ = -1;
								i = i_152_;
								i_147_ = -1;
							}
						}
						if (i_151_ == 45) {
							i_143_ = i_150_;
							i_144_ = i;
							i_145_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_142_) {
			strings[i_148_] = string.substring(i_142_, string.length());
			i_148_++;
		}
		return i_148_;
	}

	Class10(byte[] is, Interface4 interface4) {
		anInterface4_79 = interface4;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i = class523_sub34.readUnsignedByte(-1400218677);
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = class523_sub34.readUnsignedByte(1268204685) == 1;
		aByteArray82 = new byte[256];
		class523_sub34.method16298(aByteArray82, 0, 256, (byte) 37);
		if (bool) {
			int[] is_158_ = new int[256];
			int[] is_159_ = new int[256];
			for (int i_160_ = 0; i_160_ < 256; i_160_++)
				is_158_[i_160_] = class523_sub34.readUnsignedByte(-536790400);
			for (int i_161_ = 0; i_161_ < 256; i_161_++)
				is_159_[i_161_] = class523_sub34.readUnsignedByte(2048328220);
			byte[][] is_162_ = new byte[256][];
			for (int i_163_ = 0; i_163_ < 256; i_163_++) {
				is_162_[i_163_] = new byte[is_158_[i_163_]];
				byte i_164_ = 0;
				for (int i_165_ = 0; i_165_ < is_162_[i_163_].length; i_165_++) {
					i_164_ += class523_sub34.readByte((short) -4784);
					is_162_[i_163_][i_165_] = i_164_;
				}
			}
			byte[][] is_166_ = new byte[256][];
			for (int i_167_ = 0; i_167_ < 256; i_167_++) {
				is_166_[i_167_] = new byte[is_158_[i_167_]];
				byte i_168_ = 0;
				for (int i_169_ = 0; i_169_ < is_166_[i_167_].length; i_169_++) {
					i_168_ += class523_sub34.readByte((short) -9662);
					is_166_[i_167_][i_169_] = i_168_;
				}
			}
			aByteArrayArray77 = new byte[256][256];
			for (int i_170_ = 0; i_170_ < 256; i_170_++) {
				if (32 != i_170_ && i_170_ != 160) {
					for (int i_171_ = 0; i_171_ < 256; i_171_++) {
						if (32 != i_171_ && i_171_ != 160)
							aByteArrayArray77[i_170_][i_171_] = (byte) Class590.method9772(is_162_, is_166_, is_159_, aByteArray82, is_158_, i_170_, i_171_, (byte) 63);
					}
				}
			}
			anInt78 = 1625498477 * (is_159_[32] + is_158_[32]);
		} else
			anInt78 = class523_sub34.readUnsignedByte(-1015247910) * 1625498477;
		class523_sub34.readUnsignedByte(-2121595314);
		class523_sub34.readUnsignedByte(18683279);
		anInt76 = class523_sub34.readUnsignedByte(-2002017775) * 558342551;
		anInt80 = class523_sub34.readUnsignedByte(-488419818) * 1732382397;
	}

	public int method626(String string, Interface3[] interface3s, int i) {
		if (string == null)
			return 0;
		int i_172_ = -1;
		int i_173_ = -1;
		int i_174_ = 0;
		int i_175_ = string.length();
		for (int i_176_ = 0; i_176_ < i_175_; i_176_++) {
			char c = string.charAt(i_176_);
			if (60 == c)
				i_172_ = i_176_;
			else {
				if (c == 62 && i_172_ != -1) {
					String string_177_ = string.substring(1 + i_172_, i_176_);
					i_172_ = -1;
					if (string_177_.equals("lt"))
						c = '<';
					else if (string_177_.equals("gt"))
						c = '>';
					else if (string_177_.equals("nbsp"))
						c = '\u00a0';
					else if (string_177_.equals("shy"))
						c = '\u00ad';
					else if (string_177_.equals("times"))
						c = '\u00d7';
					else if (string_177_.equals("euro"))
						c = '\u0080';
					else if (string_177_.equals("copy"))
						c = '\u00a9';
					else if (string_177_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_177_.startsWith("img=") && null != interface3s) {
							try {
								int i_178_ = (Class458_Sub1.method15856(string_177_.substring(4), (byte) 98));
								i_174_ += interface3s[i_178_].method38();
								i_173_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_177_.startsWith("sprite=") && anInterface4_79 != null) {
							try {
								int i_179_ = -1;
								int i_180_ = string_177_.indexOf(',');
								if (i_180_ == -1)
									i_179_ = (Class458_Sub1.method15856(string_177_.substring(7), (byte) 95));
								else
									i_179_ = (Class458_Sub1.method15856(string_177_.substring(7, i_180_), (byte) 69));
								i_174_ += anInterface4_79.method41(i_179_, 1581655602);
								i_173_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_172_ == -1) {
					i_174_ += ((aByteArray82[Class523_Sub33.method16255(c, -74173527) & 0xff]) & 0xff);
					if (aByteArrayArray77 != null && -1 != i_173_)
						i_174_ += aByteArrayArray77[i_173_][c];
					i_173_ = c;
				}
			}
		}
		return i_174_;
	}

	public int method627(String string, int i, Interface3[] interface3s) {
		return method600(string, new int[] { i }, aStringArray81, interface3s, 1221765660);
	}

	public int method628(String string, int i, int i_181_, int i_182_, int i_183_, Interface3[] interface3s) {
		if (0 == i_181_)
			i_181_ = 1061510757 * anInt78;
		int i_184_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, 1596989453);
		if (0 == i_184_)
			return 0;
		if (i_183_ < 0)
			i_183_ = 0;
		i_183_ /= i_181_;
		if (i_183_ >= i_184_)
			i_183_ = i_184_ - 1;
		String string_185_ = aStringArray81[i_183_];
		int i_186_ = 0;
		int i_187_ = 0;
		int i_188_;
		for (i_188_ = 0; i_188_ < i_182_ && i_186_ < string_185_.length(); i_188_ = method626(string_185_.substring(0, ++i_186_), interface3s, -1942791872))
			i_187_ = i_188_;
		if (i_186_ == string_185_.length() && string_185_.endsWith("<br>"))
			i_186_ -= 4;
		if (i_182_ - i_187_ < i_188_ - i_182_)
			i_186_--;
		for (int i_189_ = 0; i_189_ < i_183_; i_189_++)
			i_186_ += aStringArray81[i_189_].length();
		return i_186_;
	}

	public String method629(String string, int i, Interface3[] interface3s, int i_190_) {
		int i_191_ = method600(string, new int[] { i }, aStringArray81, interface3s, 2103113316);
		if (i_190_ >= 0 && i_190_ < i_191_)
			return aStringArray81[i_190_];
		return null;
	}

	public int method630(int i, char c) {
		if (null != aByteArrayArray77)
			return aByteArrayArray77[i][c];
		return 0;
	}

	public int method631(String string, int i, int i_192_, Interface3[] interface3s) {
		if (i_192_ == 0)
			i_192_ = 1061510757 * anInt78;
		int i_193_ = method600(string, new int[] { i }, aStringArray81, interface3s, -1199503152);
		int i_194_ = i_192_ * (i_193_ - 1);
		return anInt80 * -853549931 + (i_194_ + -1669009881 * anInt76);
	}

	public int method632(String string, int i, Interface3[] interface3s) {
		int i_195_ = method600(string, new int[] { i }, aStringArray81, interface3s, -1917268886);
		int i_196_ = 0;
		for (int i_197_ = 0; i_197_ < i_195_; i_197_++) {
			int i_198_ = method626(aStringArray81[i_197_], interface3s, -1942791872);
			if (i_198_ > i_196_)
				i_196_ = i_198_;
		}
		return i_196_;
	}

	public String method633(String string, int i, Interface3[] interface3s, int i_199_) {
		int i_200_ = method600(string, new int[] { i }, aStringArray81, interface3s, -605362199);
		if (i_199_ >= 0 && i_199_ < i_200_)
			return aStringArray81[i_199_];
		return null;
	}

	public Point method634(String string, int i, int i_201_, int i_202_, Interface3[] interface3s) {
		if (i_202_ <= 0)
			return new Point(0, i_201_ + -1669009881 * anInt76);
		if (i_202_ > string.length())
			i_202_ = string.length();
		if (0 == i_201_)
			i_201_ = 1061510757 * anInt78;
		int i_203_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, -1495567867);
		int i_204_ = 0;
		for (int i_205_ = 0; i_205_ < i_203_; i_205_++) {
			int i_206_ = aStringArray81[i_205_].length();
			if (i_206_ + i_204_ > i_202_ || i_203_ - 1 == i_205_ && i_202_ == string.length()) {
				String string_207_ = string.substring(i_204_, i_202_);
				if (string_207_.endsWith("<br>")) {
					string_207_ = "";
					i_204_ += i_206_;
					i_205_++;
				}
				int i_208_ = method626(string_207_, interface3s, -1942791872);
				int i_209_ = anInt76 * -1669009881 + i_201_ * i_205_;
				return new Point(i_208_, i_209_);
			}
			i_204_ += i_206_;
		}
		return null;
	}

	public static Class10 method635(Class472 class472, int i, Interface4 interface4) {
		byte[] is = class472.method7721(i, -387132909);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}

	public int method636(String string, int i, int i_210_, int i_211_, int i_212_, Interface3[] interface3s) {
		if (0 == i_210_)
			i_210_ = 1061510757 * anInt78;
		int i_213_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, -2034572810);
		if (0 == i_213_)
			return 0;
		if (i_212_ < 0)
			i_212_ = 0;
		i_212_ /= i_210_;
		if (i_212_ >= i_213_)
			i_212_ = i_213_ - 1;
		String string_214_ = aStringArray81[i_212_];
		int i_215_ = 0;
		int i_216_ = 0;
		int i_217_;
		for (i_217_ = 0; i_217_ < i_211_ && i_215_ < string_214_.length(); i_217_ = method626(string_214_.substring(0, ++i_215_), interface3s, -1942791872))
			i_216_ = i_217_;
		if (i_215_ == string_214_.length() && string_214_.endsWith("<br>"))
			i_215_ -= 4;
		if (i_211_ - i_216_ < i_217_ - i_211_)
			i_215_--;
		for (int i_218_ = 0; i_218_ < i_212_; i_218_++)
			i_215_ += aStringArray81[i_218_].length();
		return i_215_;
	}

	public int method637(String string, int i, int i_219_, int i_220_, int i_221_, Interface3[] interface3s) {
		if (0 == i_219_)
			i_219_ = 1061510757 * anInt78;
		int i_222_ = method601(string, new int[] { i }, aStringArray81, interface3s, false, 1880798376);
		if (0 == i_222_)
			return 0;
		if (i_221_ < 0)
			i_221_ = 0;
		i_221_ /= i_219_;
		if (i_221_ >= i_222_)
			i_221_ = i_222_ - 1;
		String string_223_ = aStringArray81[i_221_];
		int i_224_ = 0;
		int i_225_ = 0;
		int i_226_;
		for (i_226_ = 0; i_226_ < i_220_ && i_224_ < string_223_.length(); i_226_ = method626(string_223_.substring(0, ++i_224_), interface3s, -1942791872))
			i_225_ = i_226_;
		if (i_224_ == string_223_.length() && string_223_.endsWith("<br>"))
			i_224_ -= 4;
		if (i_220_ - i_225_ < i_226_ - i_220_)
			i_224_--;
		for (int i_227_ = 0; i_227_ < i_221_; i_227_++)
			i_224_ += aStringArray81[i_227_].length();
		return i_224_;
	}

	static final void method638(Class250 class250, Class669 class669, int i) {
		if (1771128197 * class669.anInt8575 >= 10)
			throw new RuntimeException();
		if (class250.anObjectArray2542 != null) {
			Class523_Sub38 class523_sub38 = new Class523_Sub38();
			class523_sub38.aClass250_10678 = class250;
			class523_sub38.anObjectArray10687 = class250.anObjectArray2542;
			class523_sub38.anInt10688 = -1928848289 + 2108381275 * class669.anInt8575;
			client.aClass708_11239.method14236(class523_sub38, -308203166);
		}
	}
}
