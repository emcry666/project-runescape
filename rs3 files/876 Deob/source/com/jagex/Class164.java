/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public abstract class Class164 {
	static int anInt1779;
	Class178 aClass178_1780;
	static int anInt1781;
	public static final int anInt1782 = 1;
	static int anInt1783;
	static int anInt1784 = -719035579;
	static int anInt1785 = 1345358343;
	static int anInt1786 = 0;
	Class10 aClass10_1787;
	public static final int anInt1788 = 0;
	static int anInt1789;
	static int anInt1790;
	public static final int anInt1791 = 0;
	static String[] aStringArray1792;

	public void method2594(String string, int i, int i_0_, int i_1_, int i_2_) {
		if (string != null) {
			method2604(i_1_, i_2_, -328721856);
			method2607(string, i, i_0_, null, null, null, 0, 0, (byte) -37);
		}
	}

	public int method2595(String string, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, Class148[] class148s, int[] is, Class145 class145, int i_12_, int i_13_) {
		if (null == string)
			return 0;
		method2604(i_6_, i_7_, -1196437641);
		if (0 == i_10_)
			i_10_ = 1061510757 * aClass10_1787.anInt78;
		int[] is_14_;
		if (i_5_ < (-1669009881 * aClass10_1787.anInt76 + aClass10_1787.anInt80 * -853549931 + i_10_) && i_5_ < i_10_ + i_10_)
			is_14_ = null;
		else
			is_14_ = new int[] { i_4_ };
		int i_15_ = aClass10_1787.method600(string, is_14_, aStringArray1792, class148s, 1632063344);
		if (-1 == i_11_) {
			i_11_ = i_5_ / i_10_;
			if (i_11_ <= 0)
				i_11_ = 1;
		}
		if (i_11_ > 0 && i_15_ >= i_11_) {
			aStringArray1792[i_11_ - 1] = aClass10_1787.method599(aStringArray1792[i_11_ - 1], i_4_, class148s, (byte) 3);
			i_15_ = i_11_;
		}
		if (i_9_ == 3 && i_15_ == 1)
			i_9_ = 1;
		int i_16_;
		if (0 == i_9_)
			i_16_ = i_3_ + -1669009881 * aClass10_1787.anInt76;
		else if (i_9_ == 1)
			i_16_ = (i_3_ + -1669009881 * aClass10_1787.anInt76 + (i_5_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_10_ * (i_15_ - 1)) / 2);
		else if (i_9_ == 2)
			i_16_ = (i_5_ + i_3_ - -853549931 * aClass10_1787.anInt80 - i_10_ * (i_15_ - 1));
		else {
			int i_17_ = ((i_5_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_10_ * (i_15_ - 1)) / (i_15_ + 1));
			if (i_17_ < 0)
				i_17_ = 0;
			i_16_ = i_3_ + aClass10_1787.anInt76 * -1669009881 + i_17_;
			i_10_ += i_17_;
		}
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
			if (0 == i_8_)
				method2607(aStringArray1792[i_18_], i, i_16_, class148s, is, class145, i_12_, i_13_, (byte) -112);
			else if (1 == i_8_)
				method2607(aStringArray1792[i_18_], i + (i_4_ - aClass10_1787.method597((aStringArray1792[i_18_]), -1759656773)) / 2, i_16_, class148s, is, class145, i_12_, i_13_, (byte) -22);
			else if (2 == i_8_)
				method2607(aStringArray1792[i_18_], (i + i_4_ - aClass10_1787.method597(aStringArray1792[i_18_], -1759656773)), i_16_, class148s, is, class145, i_12_, i_13_, (byte) -38);
			else if (i_15_ - 1 == i_18_)
				method2607(aStringArray1792[i_18_], i, i_16_, class148s, is, class145, i_12_, i_13_, (byte) -24);
			else {
				method2606(aStringArray1792[i_18_], i_4_, 130798411);
				method2607(aStringArray1792[i_18_], i, i_16_, class148s, is, class145, i_12_, i_13_, (byte) -125);
				anInt1779 = 0;
			}
			i_16_ += i_10_;
		}
		return i_15_;
	}

	public void method2596(String string, int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		if (null != string) {
			method2604(i_20_, i_21_, -854144857);
			method2607(string, i - aClass10_1787.method597(string, -1759656773), i_19_, null, null, null, 0, 0, (byte) -55);
		}
	}

	public void method2597(String string, int i, int i_23_, int i_24_, int i_25_, int i_26_) {
		if (null != string) {
			method2604(i_24_, i_25_, -1025195927);
			int i_27_ = string.length();
			int[] is = new int[i_27_];
			int[] is_28_ = new int[i_27_];
			for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
				is[i_29_] = (int) (Math.sin((double) i_26_ / 5.0 + (double) i_29_ / 5.0) * 5.0);
				is_28_[i_29_] = (int) (Math.sin((double) i_29_ / 3.0 + (double) i_26_ / 5.0) * 5.0);
			}
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_23_, null, null, is, is_28_, -983376909);
		}
	}

	Class164(Class178 class178, Class10 class10) {
		aClass178_1780 = class178;
		aClass10_1787 = class10;
	}

	public int method2598(String string, int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, Class148[] class148s, int[] is, Class145 class145, int i_39_, int i_40_, int i_41_) {
		if (null == string)
			return 0;
		method2604(i_33_, i_34_, -1176385068);
		if (0 == i_37_)
			i_37_ = 1061510757 * aClass10_1787.anInt78;
		int[] is_42_;
		if (i_32_ < (-1669009881 * aClass10_1787.anInt76 + aClass10_1787.anInt80 * -853549931 + i_37_) && i_32_ < i_37_ + i_37_)
			is_42_ = null;
		else
			is_42_ = new int[] { i_31_ };
		int i_43_ = aClass10_1787.method600(string, is_42_, aStringArray1792, class148s, -450270561);
		if (-1 == i_38_) {
			i_38_ = i_32_ / i_37_;
			if (i_38_ <= 0)
				i_38_ = 1;
		}
		if (i_38_ > 0 && i_43_ >= i_38_) {
			aStringArray1792[i_38_ - 1] = aClass10_1787.method599(aStringArray1792[i_38_ - 1], i_31_, class148s, (byte) 3);
			i_43_ = i_38_;
		}
		if (i_36_ == 3 && i_43_ == 1)
			i_36_ = 1;
		int i_44_;
		if (0 == i_36_)
			i_44_ = i_30_ + -1669009881 * aClass10_1787.anInt76;
		else if (i_36_ == 1)
			i_44_ = (i_30_ + -1669009881 * aClass10_1787.anInt76 + (i_32_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_37_ * (i_43_ - 1)) / 2);
		else if (i_36_ == 2)
			i_44_ = (i_32_ + i_30_ - -853549931 * aClass10_1787.anInt80 - i_37_ * (i_43_ - 1));
		else {
			int i_45_ = ((i_32_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_37_ * (i_43_ - 1)) / (i_43_ + 1));
			if (i_45_ < 0)
				i_45_ = 0;
			i_44_ = i_30_ + aClass10_1787.anInt76 * -1669009881 + i_45_;
			i_37_ += i_45_;
		}
		for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
			if (0 == i_35_)
				method2607(aStringArray1792[i_46_], i, i_44_, class148s, is, class145, i_39_, i_40_, (byte) -58);
			else if (1 == i_35_)
				method2607(aStringArray1792[i_46_], i + (i_31_ - aClass10_1787.method597((aStringArray1792[i_46_]), -1759656773)) / 2, i_44_, class148s, is, class145, i_39_, i_40_, (byte) -117);
			else if (2 == i_35_)
				method2607(aStringArray1792[i_46_], (i + i_31_ - aClass10_1787.method597(aStringArray1792[i_46_], -1759656773)), i_44_, class148s, is, class145, i_39_, i_40_, (byte) 7);
			else if (i_43_ - 1 == i_46_)
				method2607(aStringArray1792[i_46_], i, i_44_, class148s, is, class145, i_39_, i_40_, (byte) -32);
			else {
				method2606(aStringArray1792[i_46_], i_31_, 53748208);
				method2607(aStringArray1792[i_46_], i, i_44_, class148s, is, class145, i_39_, i_40_, (byte) -107);
				anInt1779 = 0;
			}
			i_44_ += i_37_;
		}
		return i_43_;
	}

	public void method2599(String string, int i, int i_47_, int i_48_, int i_49_, int i_50_, byte i_51_) {
		if (string != null) {
			method2604(i_48_, i_49_, 914872732);
			int i_52_ = string.length();
			int[] is = new int[i_52_];
			for (int i_53_ = 0; i_53_ < i_52_; i_53_++)
				is[i_53_] = (int) (Math.sin((double) i_53_ / 2.0 + (double) i_50_ / 5.0) * 5.0);
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_47_, null, null, null, is, 10186262);
		}
	}

	public void method2600(String string, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		if (null != string) {
			method2604(i_55_, i_56_, 1693115266);
			int i_59_ = string.length();
			int[] is = new int[i_59_];
			int[] is_60_ = new int[i_59_];
			for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
				is[i_61_] = (int) (Math.sin((double) i_57_ / 5.0 + (double) i_61_ / 5.0) * 5.0);
				is_60_[i_61_] = (int) (Math.sin((double) i_61_ / 3.0 + (double) i_57_ / 5.0) * 5.0);
			}
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_54_, null, null, is, is_60_, -543294457);
		}
	}

	public void method2601(String string, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		if (null != string) {
			method2604(i_63_, i_64_, -1083203138);
			double d = 7.0 - (double) i_66_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_68_ = string.length();
			int[] is = new int[i_68_];
			for (int i_69_ = 0; i_69_ < i_68_; i_69_++)
				is[i_69_] = (int) (Math.sin((double) i_65_ / 1.0 + (double) i_69_ / 1.5) * d);
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_62_, null, null, null, is, 1742620337);
		}
	}

	public int method2602(String string, int i, int i_70_, int i_71_, int i_72_, Random random, int i_73_, Class148[] class148s, int[] is, int i_74_) {
		if (string == null)
			return 0;
		random.setSeed((long) i_73_);
		int i_75_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_75_ << 24 | i_71_ & 0xffffff, i_75_ << 24 | i_72_ & 0xffffff, 2095672954);
		int i_76_ = string.length();
		int[] is_77_ = new int[i_76_];
		int i_78_ = 0;
		for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
			is_77_[i_79_] = i_78_;
			if ((random.nextInt() & 0x3) == 0)
				i_78_++;
		}
		method2608(string, i, i_70_, class148s, is, is_77_, null, 1032633072);
		return i_78_;
	}

	public int method2603(String string, int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, Random random, int i_87_, int[] is, Class148[] class148s, int[] is_88_, int i_89_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_87_);
		int i_90_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_90_ << 24 | i_83_ & 0xffffff, i_84_ == -1 ? 0 : i_90_ << 24 | i_84_ & 0xffffff, 133733209);
		int i_91_ = string.length();
		int[] is_92_ = new int[i_91_];
		int i_93_ = 0;
		for (int i_94_ = 0; i_94_ < i_91_; i_94_++) {
			is_92_[i_94_] = i_93_;
			if ((random.nextInt() & 0x3) == 0)
				i_93_++;
		}
		int i_95_ = i;
		int i_96_ = aClass10_1787.anInt76 * -1669009881 + i_80_;
		int i_97_ = -1;
		if (i_86_ == 1)
			i_96_ += (i_82_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931) / 2;
		else if (2 == i_86_)
			i_96_ = i_82_ + i_80_ - -853549931 * aClass10_1787.anInt80;
		if (i_85_ == 1) {
			i_97_ = aClass10_1787.method597(string, -1759656773) + i_93_;
			i_95_ += (i_81_ - i_97_) / 2;
		} else if (i_85_ == 2) {
			i_97_ = aClass10_1787.method597(string, -1759656773) + i_93_;
			i_95_ += i_81_ - i_97_;
		}
		method2608(string, i_95_, i_96_, class148s, is_88_, is_92_, null, 784835459);
		if (is != null) {
			if (i_97_ == -1)
				i_97_ = aClass10_1787.method597(string, -1759656773) + i_93_;
			is[0] = i_95_;
			is[1] = i_96_ - aClass10_1787.anInt76 * -1669009881;
			is[2] = i_97_;
			is[3] = (aClass10_1787.anInt80 * -853549931 + -1669009881 * aClass10_1787.anInt76);
		}
		return i_93_;
	}

	void method2604(int i, int i_98_, int i_99_) {
		anInt1784 = -719035579;
		anInt1785 = 1345358343;
		anInt1783 = (anInt1786 = i * 52066425) * -612181821;
		anInt1779 = 0;
		anInt1790 = 0;
		if (-1 == i_98_)
			i_98_ = 0;
		anInt1789 = (anInt1781 = 1399051669 * i_98_) * -1997901187;
	}

	void method2605(String string) {
		try {
			if (string.startsWith("col="))
				anInt1783 = ((anInt1783 * 112984707 & ~0xffffff | Class648.method10614(string.substring(4), 16, -1777316602) & 0xffffff) * 1665260587);
			else if (string.equals("/col"))
				anInt1783 = (112984707 * anInt1783 & ~0xffffff | anInt1786 * 450523593 & 0xffffff) * 1665260587;
			if (string.startsWith("argb="))
				anInt1783 = Class648.method10614(string.substring(5), 16, -1468458168) * 1665260587;
			else if (string.equals("/argb"))
				anInt1783 = anInt1786 * -612181821;
			else if (string.startsWith("str="))
				anInt1784 = (112984707 * anInt1783 & ~0xffffff | Class648.method10614(string.substring(4), 16, 1794099738)) * 719035579;
			else if (string.equals("str"))
				anInt1784 = 719035579 * (112984707 * anInt1783 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt1784 = -719035579;
			else if (string.startsWith("u="))
				anInt1785 = (anInt1783 * 112984707 & ~0xffffff | Class648.method10614(string.substring(2), 16, -1266758532)) * -1345358343;
			else if (string.equals("u"))
				anInt1785 = -1345358343 * (anInt1783 * 112984707 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1785 = 1345358343;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1789 = 0;
			else if (string.startsWith("shad="))
				anInt1789 = (112984707 * anInt1783 & ~0xffffff | Class648.method10614(string.substring(5), 16, 579012603)) * -1894931519;
			else if (string.equals("shad"))
				anInt1789 = (anInt1783 * 112984707 & ~0xffffff) * -1894931519;
			else if (string.equals("/shad"))
				anInt1789 = anInt1781 * -1997901187;
			else if (string.equals("br"))
				method2604(anInt1786 * 450523593, 561499581 * anInt1781, 660710097);
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method2606(String string, int i, int i_100_) {
		int i_101_ = 0;
		boolean bool = false;
		for (int i_102_ = 0; i_102_ < string.length(); i_102_++) {
			char c = string.charAt(i_102_);
			if ('<' == c)
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool && ' ' == c)
				i_101_++;
		}
		if (i_101_ > 0)
			anInt1779 = (i - aClass10_1787.method597(string, -1759656773) << 8) / i_101_ * -441555637;
	}

	void method2607(String string, int i, int i_103_, Class148[] class148s, int[] is, Class145 class145, int i_104_, int i_105_, byte i_106_) {
		i_103_ -= 1061510757 * aClass10_1787.anInt78;
		int i_107_ = -1;
		int i_108_ = -1;
		int i_109_ = string.length();
		for (int i_110_ = 0; i_110_ < i_109_; i_110_++) {
			char c = (char) (Class523_Sub33.method16255(string.charAt(i_110_), -74173527) & 0xff);
			if (c == 60)
				i_107_ = i_110_;
			else {
				if (62 == c && i_107_ != -1) {
					String string_111_ = string.substring(1 + i_107_, i_110_);
					i_107_ = -1;
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
						if (string_111_.startsWith("img=")) {
							try {
								int i_112_ = (JS5Client.method15856(string_111_.substring(4), (byte) 116));
								Class148 class148 = class148s[i_112_];
								int i_113_ = (null != is ? is[i_112_] : class148.method2429());
								if (-16777216 == (112984707 * anInt1783 & ~0xffffff))
									class148.method2436(i, (i_103_ + (1061510757 * (aClass10_1787.anInt78)) - i_113_), 1, -1, 1);
								else
									class148.method2436(i, (1061510757 * aClass10_1787.anInt78 + i_103_ - i_113_), 0, (anInt1783 * 112984707 & ~0xffffff | 0xffffff), 1);
								i += class148s[i_112_].method38();
								i_108_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_111_.startsWith("sprite=")) {
							if (aClass10_1787.anInterface4_79 != null) {
								try {
									int i_114_ = -1;
									int i_115_ = 0;
									int i_116_ = string_111_.indexOf(',');
									if (i_116_ == -1)
										i_114_ = (JS5Client.method15856(string_111_.substring(7), (byte) 22));
									else {
										i_114_ = (JS5Client.method15856(string_111_.substring(7, i_116_), (byte) 19));
										i_115_ = (JS5Client.method15856(string_111_.substring(1 + i_116_), (byte) 110));
									}
									Class148[] class148s_117_ = (aClass10_1787.anInterface4_79.method44(aClass178_1780, i_114_, (byte) -83));
									if (class148s_117_ != null) {
										int i_118_ = Math.min(class148s_117_[i_115_].method2429(), ((-853549931 * (aClass10_1787.anInt80)) + (-1669009881 * (aClass10_1787.anInt76))));
										if ((anInt1783 * 112984707 & ~0xffffff) == -16777216)
											class148s_117_[i_115_].method2436(i, (2 + i_103_ + (aClass10_1787.anInt78 * 1061510757) - i_118_), 1, -1, 1);
										else
											class148s_117_[i_115_].method2436(i, (i_103_ + 2 + (aClass10_1787.anInt78 * 1061510757) - i_118_), 0, (112984707 * anInt1783 & ~0xffffff) | 0xffffff, 1);
										i += class148s_117_[i_115_].method38();
									}
									i_108_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2617(string_111_, (short) 291);
						continue;
					}
				}
				if (i_107_ == -1) {
					if (-1 != i_108_)
						i += aClass10_1787.method595(i_108_, c, -170281458);
					if (32 != c) {
						if (null == class145) {
							if (0 != (anInt1789 * -109810623 & ~0xffffff))
								method2616(c, i + 1, 1 + i_103_, -109810623 * anInt1789, true);
							method2616(c, i, i_103_, 112984707 * anInt1783, false);
						} else {
							if ((-109810623 * anInt1789 & ~0xffffff) != 0)
								method2610(c, 1 + i, i_103_ + 1, anInt1789 * -109810623, true, class145, i_104_, i_105_);
							method2610(c, i, i_103_, 112984707 * anInt1783, false, class145, i_104_, i_105_);
						}
					} else if (anInt1779 * -756286365 > 0) {
						anInt1790 += -370062417 * anInt1779;
						i += -430849139 * anInt1790 >> 8;
						anInt1790 = (-430849139 * anInt1790 & 0xff) * -1199622331;
					}
					int i_119_ = aClass10_1787.method596(c, -1531681277);
					if (-1 != anInt1784 * -7583629)
						aClass178_1780.method3080(i, i_103_ + (int) ((double) (1061510757 * aClass10_1787.anInt78) * 0.7), i_119_, -7583629 * anInt1784, -1548609187);
					if (anInt1785 * 939080777 != -1)
						aClass178_1780.method3080(i, 1061510757 * aClass10_1787.anInt78 + i_103_ + 1, i_119_, 939080777 * anInt1785, -1358585690);
					i += i_119_;
					i_108_ = c;
				}
			}
		}
	}

	void method2608(String string, int i, int i_120_, Class148[] class148s, int[] is, int[] is_121_, int[] is_122_, int i_123_) {
		i_120_ -= 1061510757 * aClass10_1787.anInt78;
		int i_124_ = -1;
		int i_125_ = -1;
		int i_126_ = 0;
		int i_127_ = string.length();
		for (int i_128_ = 0; i_128_ < i_127_; i_128_++) {
			char c = (char) (Class523_Sub33.method16255(string.charAt(i_128_), -74173527) & 0xff);
			if (60 == c)
				i_124_ = i_128_;
			else {
				if (c == 62 && -1 != i_124_) {
					String string_129_ = string.substring(1 + i_124_, i_128_);
					i_124_ = -1;
					if (string_129_.equals("lt"))
						c = '<';
					else if (string_129_.equals("gt"))
						c = '>';
					else if (string_129_.equals("nbsp"))
						c = '\u00a0';
					else if (string_129_.equals("shy"))
						c = '\u00ad';
					else if (string_129_.equals("times"))
						c = '\u00d7';
					else if (string_129_.equals("euro"))
						c = '\u0080';
					else if (string_129_.equals("copy"))
						c = '\u00a9';
					else if (string_129_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_129_.startsWith("img=")) {
							try {
								int i_130_;
								if (null != is_121_)
									i_130_ = is_121_[i_126_];
								else
									i_130_ = 0;
								int i_131_;
								if (null != is_122_)
									i_131_ = is_122_[i_126_];
								else
									i_131_ = 0;
								i_126_++;
								int i_132_ = (JS5Client.method15856(string_129_.substring(4), (byte) 31));
								Class148 class148 = class148s[i_132_];
								int i_133_ = (is != null ? is[i_132_] : class148.method2429());
								class148.method2436(i_130_ + i, i_131_ + ((1061510757 * (aClass10_1787.anInt78)) + i_120_ - i_133_), 1, -1, 1);
								i += class148s[i_132_].method38();
								i_125_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_129_.startsWith("sprite=")) {
							if (null != aClass10_1787.anInterface4_79) {
								try {
									int i_134_ = -1;
									int i_135_ = 0;
									int i_136_ = string_129_.indexOf(',');
									if (-1 == i_136_)
										i_134_ = (JS5Client.method15856(string_129_.substring(7), (byte) 38));
									else {
										i_134_ = (JS5Client.method15856(string_129_.substring(7, i_136_), (byte) 16));
										i_135_ = (JS5Client.method15856(string_129_.substring(i_136_ + 1), (byte) 74));
									}
									int i_137_;
									if (is_121_ != null)
										i_137_ = is_121_[i_126_];
									else
										i_137_ = 0;
									int i_138_;
									if (is_122_ != null)
										i_138_ = is_122_[i_126_];
									else
										i_138_ = 0;
									i_126_++;
									Class148[] class148s_139_ = (aClass10_1787.anInterface4_79.method44(aClass178_1780, i_134_, (byte) -58));
									if (class148s_139_ != null) {
										int i_140_ = Math.min(class148s_139_[i_135_].method2429(), ((aClass10_1787.anInt80 * -853549931) + (-1669009881 * (aClass10_1787.anInt76))));
										class148s_139_[i_135_].method2436(i_137_ + i, (i_138_ + ((1061510757 * aClass10_1787.anInt78) + (3 + i_120_) - i_140_)), 1, -1, 1);
										i += class148s_139_[i_135_].method38();
									}
									i_125_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
						} else
							method2617(string_129_, (short) 291);
						continue;
					}
				}
				if (i_124_ == -1) {
					if (i_125_ != -1)
						i += aClass10_1787.method595(i_125_, c, -36914692);
					int i_141_;
					if (is_121_ != null)
						i_141_ = is_121_[i_126_];
					else
						i_141_ = 0;
					int i_142_;
					if (is_122_ != null)
						i_142_ = is_122_[i_126_];
					else
						i_142_ = 0;
					i_126_++;
					if (32 != c) {
						if (0 != (-109810623 * anInt1789 & ~0xffffff))
							method2616(c, 1 + i + i_141_, 1 + i_120_ + i_142_, anInt1789 * -109810623, true);
						method2616(c, i + i_141_, i_142_ + i_120_, anInt1783 * 112984707, false);
					} else if (anInt1779 * -756286365 > 0) {
						anInt1790 += -370062417 * anInt1779;
						i += anInt1790 * -430849139 >> 8;
						anInt1790 = -1199622331 * (anInt1790 * -430849139 & 0xff);
					}
					int i_143_ = aClass10_1787.method596(c, -937911669);
					if (-1 != anInt1784 * -7583629)
						aClass178_1780.method3080(i, i_120_ + (int) (0.7 * (double) (aClass10_1787.anInt78 * 1061510757)), i_143_, -7583629 * anInt1784, 64662862);
					if (-1 != 939080777 * anInt1785)
						aClass178_1780.method3080(i, 1061510757 * aClass10_1787.anInt78 + i_120_, i_143_, 939080777 * anInt1785, -1281236556);
					i += i_143_;
					i_125_ = c;
				}
			}
		}
	}

	public void method2609(String string, int i, int i_144_, int i_145_, int i_146_, int i_147_) {
		if (string != null) {
			method2604(i_145_, i_146_, 2122964725);
			int i_148_ = string.length();
			int[] is = new int[i_148_];
			for (int i_149_ = 0; i_149_ < i_148_; i_149_++)
				is[i_149_] = (int) (Math.sin((double) i_149_ / 2.0 + (double) i_147_ / 5.0) * 5.0);
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_144_, null, null, null, is, 1318413940);
		}
	}

	abstract void method2610(char c, int i, int i_150_, int i_151_, boolean bool, Class145 class145, int i_152_, int i_153_);

	static {
		anInt1783 = 0;
		anInt1781 = 0;
		anInt1789 = 0;
		anInt1779 = 0;
		anInt1790 = 0;
		aStringArray1792 = new String[100];
	}

	abstract void method2611(char c, int i, int i_154_, int i_155_, boolean bool);

	abstract void method2612(char c, int i, int i_156_, int i_157_, boolean bool);

	public void method2613(String string, int i, int i_158_, int i_159_, int i_160_) {
		if (string != null) {
			method2604(i_159_, i_160_, 1388519804);
			method2607(string, i, i_158_, null, null, null, 0, 0, (byte) -33);
		}
	}

	public void method2614(String string, int i, int i_161_, int i_162_, int i_163_, int i_164_) {
		if (null != string) {
			method2604(i_162_, i_163_, 1376043623);
			int i_165_ = string.length();
			int[] is = new int[i_165_];
			int[] is_166_ = new int[i_165_];
			for (int i_167_ = 0; i_167_ < i_165_; i_167_++) {
				is[i_167_] = (int) (Math.sin((double) i_164_ / 5.0 + (double) i_167_ / 5.0) * 5.0);
				is_166_[i_167_] = (int) (Math.sin((double) i_167_ / 3.0 + (double) i_164_ / 5.0) * 5.0);
			}
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_161_, null, null, is, is_166_, 909020400);
		}
	}

	abstract void method2615(char c, int i, int i_168_, int i_169_, boolean bool, Class145 class145, int i_170_, int i_171_);

	abstract void method2616(char c, int i, int i_172_, int i_173_, boolean bool);

	void method2617(String string, short i) {
		try {
			if (string.startsWith("col="))
				anInt1783 = ((anInt1783 * 112984707 & ~0xffffff | Class648.method10614(string.substring(4), 16, -100572929) & 0xffffff) * 1665260587);
			else if (string.equals("/col"))
				anInt1783 = (112984707 * anInt1783 & ~0xffffff | anInt1786 * 450523593 & 0xffffff) * 1665260587;
			if (string.startsWith("argb="))
				anInt1783 = Class648.method10614(string.substring(5), 16, -26526009) * 1665260587;
			else if (string.equals("/argb"))
				anInt1783 = anInt1786 * -612181821;
			else if (string.startsWith("str="))
				anInt1784 = (112984707 * anInt1783 & ~0xffffff | Class648.method10614(string.substring(4), 16, 795393291)) * 719035579;
			else if (string.equals("str"))
				anInt1784 = 719035579 * (112984707 * anInt1783 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt1784 = -719035579;
			else if (string.startsWith("u="))
				anInt1785 = (anInt1783 * 112984707 & ~0xffffff | Class648.method10614(string.substring(2), 16, -1457071803)) * -1345358343;
			else if (string.equals("u"))
				anInt1785 = -1345358343 * (anInt1783 * 112984707 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1785 = 1345358343;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1789 = 0;
			else if (string.startsWith("shad="))
				anInt1789 = (112984707 * anInt1783 & ~0xffffff | Class648.method10614(string.substring(5), 16, 1769462819)) * -1894931519;
			else if (string.equals("shad"))
				anInt1789 = (anInt1783 * 112984707 & ~0xffffff) * -1894931519;
			else if (string.equals("/shad"))
				anInt1789 = anInt1781 * -1997901187;
			else if (string.equals("br"))
				method2604(anInt1786 * 450523593, 561499581 * anInt1781, 1121441566);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method2618(String string, int i, int i_174_, int i_175_, int i_176_) {
		if (null != string) {
			method2604(i_175_, i_176_, 977145325);
			method2607(string, i - aClass10_1787.method597(string, -1759656773), i_174_, null, null, null, 0, 0, (byte) -12);
		}
	}

	public void method2619(String string, int i, int i_177_, int i_178_, int i_179_) {
		if (null != string) {
			method2604(i_178_, i_179_, -1949221138);
			method2607(string, i - aClass10_1787.method597(string, -1759656773), i_177_, null, null, null, 0, 0, (byte) -37);
		}
	}

	void method2620(int i, int i_180_) {
		anInt1784 = -719035579;
		anInt1785 = 1345358343;
		anInt1783 = (anInt1786 = i * 52066425) * -612181821;
		anInt1779 = 0;
		anInt1790 = 0;
		if (-1 == i_180_)
			i_180_ = 0;
		anInt1789 = (anInt1781 = 1399051669 * i_180_) * -1997901187;
	}

	public int method2621(String string, int i, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, Class148[] class148s, int[] is, Class145 class145, int i_190_, int i_191_) {
		if (null == string)
			return 0;
		method2604(i_184_, i_185_, 1416142146);
		if (0 == i_188_)
			i_188_ = 1061510757 * aClass10_1787.anInt78;
		int[] is_192_;
		if (i_183_ < (-1669009881 * aClass10_1787.anInt76 + aClass10_1787.anInt80 * -853549931 + i_188_) && i_183_ < i_188_ + i_188_)
			is_192_ = null;
		else
			is_192_ = new int[] { i_182_ };
		int i_193_ = aClass10_1787.method600(string, is_192_, aStringArray1792, class148s, 280253633);
		if (-1 == i_189_) {
			i_189_ = i_183_ / i_188_;
			if (i_189_ <= 0)
				i_189_ = 1;
		}
		if (i_189_ > 0 && i_193_ >= i_189_) {
			aStringArray1792[i_189_ - 1] = aClass10_1787.method599(aStringArray1792[i_189_ - 1], i_182_, class148s, (byte) 3);
			i_193_ = i_189_;
		}
		if (i_187_ == 3 && i_193_ == 1)
			i_187_ = 1;
		int i_194_;
		if (0 == i_187_)
			i_194_ = i_181_ + -1669009881 * aClass10_1787.anInt76;
		else if (i_187_ == 1)
			i_194_ = (i_181_ + -1669009881 * aClass10_1787.anInt76 + (i_183_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_188_ * (i_193_ - 1)) / 2);
		else if (i_187_ == 2)
			i_194_ = (i_183_ + i_181_ - -853549931 * aClass10_1787.anInt80 - i_188_ * (i_193_ - 1));
		else {
			int i_195_ = ((i_183_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_188_ * (i_193_ - 1)) / (i_193_ + 1));
			if (i_195_ < 0)
				i_195_ = 0;
			i_194_ = i_181_ + aClass10_1787.anInt76 * -1669009881 + i_195_;
			i_188_ += i_195_;
		}
		for (int i_196_ = 0; i_196_ < i_193_; i_196_++) {
			if (0 == i_186_)
				method2607(aStringArray1792[i_196_], i, i_194_, class148s, is, class145, i_190_, i_191_, (byte) -53);
			else if (1 == i_186_)
				method2607(aStringArray1792[i_196_], i + (i_182_ - aClass10_1787.method597((aStringArray1792[i_196_]), -1759656773)) / 2, i_194_, class148s, is, class145, i_190_, i_191_, (byte) -112);
			else if (2 == i_186_)
				method2607(aStringArray1792[i_196_], (i + i_182_ - aClass10_1787.method597(aStringArray1792[i_196_], -1759656773)), i_194_, class148s, is, class145, i_190_, i_191_, (byte) -108);
			else if (i_193_ - 1 == i_196_)
				method2607(aStringArray1792[i_196_], i, i_194_, class148s, is, class145, i_190_, i_191_, (byte) -127);
			else {
				method2606(aStringArray1792[i_196_], i_182_, 30765375);
				method2607(aStringArray1792[i_196_], i, i_194_, class148s, is, class145, i_190_, i_191_, (byte) -6);
				anInt1779 = 0;
			}
			i_194_ += i_188_;
		}
		return i_193_;
	}

	abstract void method2622(char c, int i, int i_197_, int i_198_, boolean bool);

	public int method2623(String string, int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, Class148[] class148s, int[] is, Class145 class145, int i_208_, int i_209_) {
		if (null == string)
			return 0;
		method2604(i_202_, i_203_, 366515512);
		if (0 == i_206_)
			i_206_ = 1061510757 * aClass10_1787.anInt78;
		int[] is_210_;
		if (i_201_ < (-1669009881 * aClass10_1787.anInt76 + aClass10_1787.anInt80 * -853549931 + i_206_) && i_201_ < i_206_ + i_206_)
			is_210_ = null;
		else
			is_210_ = new int[] { i_200_ };
		int i_211_ = aClass10_1787.method600(string, is_210_, aStringArray1792, class148s, 1046492708);
		if (-1 == i_207_) {
			i_207_ = i_201_ / i_206_;
			if (i_207_ <= 0)
				i_207_ = 1;
		}
		if (i_207_ > 0 && i_211_ >= i_207_) {
			aStringArray1792[i_207_ - 1] = aClass10_1787.method599(aStringArray1792[i_207_ - 1], i_200_, class148s, (byte) 3);
			i_211_ = i_207_;
		}
		if (i_205_ == 3 && i_211_ == 1)
			i_205_ = 1;
		int i_212_;
		if (0 == i_205_)
			i_212_ = i_199_ + -1669009881 * aClass10_1787.anInt76;
		else if (i_205_ == 1)
			i_212_ = (i_199_ + -1669009881 * aClass10_1787.anInt76 + (i_201_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_206_ * (i_211_ - 1)) / 2);
		else if (i_205_ == 2)
			i_212_ = (i_201_ + i_199_ - -853549931 * aClass10_1787.anInt80 - i_206_ * (i_211_ - 1));
		else {
			int i_213_ = ((i_201_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_206_ * (i_211_ - 1)) / (i_211_ + 1));
			if (i_213_ < 0)
				i_213_ = 0;
			i_212_ = i_199_ + aClass10_1787.anInt76 * -1669009881 + i_213_;
			i_206_ += i_213_;
		}
		for (int i_214_ = 0; i_214_ < i_211_; i_214_++) {
			if (0 == i_204_)
				method2607(aStringArray1792[i_214_], i, i_212_, class148s, is, class145, i_208_, i_209_, (byte) -110);
			else if (1 == i_204_)
				method2607(aStringArray1792[i_214_], i + (i_200_ - aClass10_1787.method597((aStringArray1792[i_214_]), -1759656773)) / 2, i_212_, class148s, is, class145, i_208_, i_209_, (byte) -55);
			else if (2 == i_204_)
				method2607(aStringArray1792[i_214_], (i + i_200_ - aClass10_1787.method597(aStringArray1792[i_214_], -1759656773)), i_212_, class148s, is, class145, i_208_, i_209_, (byte) -29);
			else if (i_211_ - 1 == i_214_)
				method2607(aStringArray1792[i_214_], i, i_212_, class148s, is, class145, i_208_, i_209_, (byte) -85);
			else {
				method2606(aStringArray1792[i_214_], i_200_, 1605245678);
				method2607(aStringArray1792[i_214_], i, i_212_, class148s, is, class145, i_208_, i_209_, (byte) -10);
				anInt1779 = 0;
			}
			i_212_ += i_206_;
		}
		return i_211_;
	}

	public void method2624(String string, int i, int i_215_, int i_216_, int i_217_, int i_218_) {
		if (string != null) {
			method2604(i_216_, i_217_, -2050484921);
			method2607(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_215_, null, null, null, 0, 0, (byte) -33);
		}
	}

	public int method2625(String string, int i, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, Random random, int i_226_, int[] is, Class148[] class148s, int[] is_227_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_226_);
		int i_228_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_228_ << 24 | i_222_ & 0xffffff, i_223_ == -1 ? 0 : i_228_ << 24 | i_223_ & 0xffffff, -690430828);
		int i_229_ = string.length();
		int[] is_230_ = new int[i_229_];
		int i_231_ = 0;
		for (int i_232_ = 0; i_232_ < i_229_; i_232_++) {
			is_230_[i_232_] = i_231_;
			if ((random.nextInt() & 0x3) == 0)
				i_231_++;
		}
		int i_233_ = i;
		int i_234_ = aClass10_1787.anInt76 * -1669009881 + i_219_;
		int i_235_ = -1;
		if (i_225_ == 1)
			i_234_ += (i_221_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931) / 2;
		else if (2 == i_225_)
			i_234_ = i_221_ + i_219_ - -853549931 * aClass10_1787.anInt80;
		if (i_224_ == 1) {
			i_235_ = aClass10_1787.method597(string, -1759656773) + i_231_;
			i_233_ += (i_220_ - i_235_) / 2;
		} else if (i_224_ == 2) {
			i_235_ = aClass10_1787.method597(string, -1759656773) + i_231_;
			i_233_ += i_220_ - i_235_;
		}
		method2608(string, i_233_, i_234_, class148s, is_227_, is_230_, null, 923035833);
		if (is != null) {
			if (i_235_ == -1)
				i_235_ = aClass10_1787.method597(string, -1759656773) + i_231_;
			is[0] = i_233_;
			is[1] = i_234_ - aClass10_1787.anInt76 * -1669009881;
			is[2] = i_235_;
			is[3] = (aClass10_1787.anInt80 * -853549931 + -1669009881 * aClass10_1787.anInt76);
		}
		return i_231_;
	}

	abstract void method2626(char c, int i, int i_236_, int i_237_, boolean bool);

	public void method2627(String string, int i, int i_238_, int i_239_, int i_240_, int i_241_) {
		if (null != string) {
			method2604(i_239_, i_240_, -103039485);
			int i_242_ = string.length();
			int[] is = new int[i_242_];
			int[] is_243_ = new int[i_242_];
			for (int i_244_ = 0; i_244_ < i_242_; i_244_++) {
				is[i_244_] = (int) (Math.sin((double) i_241_ / 5.0 + (double) i_244_ / 5.0) * 5.0);
				is_243_[i_244_] = (int) (Math.sin((double) i_244_ / 3.0 + (double) i_241_ / 5.0) * 5.0);
			}
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_238_, null, null, is, is_243_, 14002584);
		}
	}

	public int method2628(String string, int i, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_, Class148[] class148s, int[] is, Class145 class145, int i_253_, int i_254_, int i_255_) {
		return method2598(string, i, i_245_, i_246_, i_247_, i_248_, i_249_, i_250_, i_251_, i_252_, 0, class148s, is, class145, i_253_, i_254_, 1601291038);
	}

	public void method2629(String string, int i, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_) {
		if (null != string) {
			method2604(i_257_, i_258_, -667054224);
			double d = 7.0 - (double) i_260_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_261_ = string.length();
			int[] is = new int[i_261_];
			for (int i_262_ = 0; i_262_ < i_261_; i_262_++)
				is[i_262_] = (int) (Math.sin((double) i_259_ / 1.0 + (double) i_262_ / 1.5) * d);
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_256_, null, null, null, is, 242764835);
		}
	}

	public int method2630(String string, int i, int i_263_, int i_264_, int i_265_, Random random, int i_266_, Class148[] class148s, int[] is) {
		if (string == null)
			return 0;
		random.setSeed((long) i_266_);
		int i_267_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_267_ << 24 | i_264_ & 0xffffff, i_267_ << 24 | i_265_ & 0xffffff, 150318585);
		int i_268_ = string.length();
		int[] is_269_ = new int[i_268_];
		int i_270_ = 0;
		for (int i_271_ = 0; i_271_ < i_268_; i_271_++) {
			is_269_[i_271_] = i_270_;
			if ((random.nextInt() & 0x3) == 0)
				i_270_++;
		}
		method2608(string, i, i_263_, class148s, is, is_269_, null, 393694194);
		return i_270_;
	}

	public int method2631(String string, int i, int i_272_, int i_273_, int i_274_, Random random, int i_275_, Class148[] class148s, int[] is) {
		if (string == null)
			return 0;
		random.setSeed((long) i_275_);
		int i_276_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_276_ << 24 | i_273_ & 0xffffff, i_276_ << 24 | i_274_ & 0xffffff, -1489359044);
		int i_277_ = string.length();
		int[] is_278_ = new int[i_277_];
		int i_279_ = 0;
		for (int i_280_ = 0; i_280_ < i_277_; i_280_++) {
			is_278_[i_280_] = i_279_;
			if ((random.nextInt() & 0x3) == 0)
				i_279_++;
		}
		method2608(string, i, i_272_, class148s, is, is_278_, null, -12346960);
		return i_279_;
	}

	public int method2632(String string, int i, int i_281_, int i_282_, int i_283_, Random random, int i_284_, Class148[] class148s, int[] is) {
		if (string == null)
			return 0;
		random.setSeed((long) i_284_);
		int i_285_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_285_ << 24 | i_282_ & 0xffffff, i_285_ << 24 | i_283_ & 0xffffff, -2081725147);
		int i_286_ = string.length();
		int[] is_287_ = new int[i_286_];
		int i_288_ = 0;
		for (int i_289_ = 0; i_289_ < i_286_; i_289_++) {
			is_287_[i_289_] = i_288_;
			if ((random.nextInt() & 0x3) == 0)
				i_288_++;
		}
		method2608(string, i, i_281_, class148s, is, is_287_, null, 1521660471);
		return i_288_;
	}

	public int method2633(String string, int i, int i_290_, int i_291_, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, Random random, int i_297_, int[] is, Class148[] class148s, int[] is_298_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_297_);
		int i_299_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_299_ << 24 | i_293_ & 0xffffff, i_294_ == -1 ? 0 : i_299_ << 24 | i_294_ & 0xffffff, 246604513);
		int i_300_ = string.length();
		int[] is_301_ = new int[i_300_];
		int i_302_ = 0;
		for (int i_303_ = 0; i_303_ < i_300_; i_303_++) {
			is_301_[i_303_] = i_302_;
			if ((random.nextInt() & 0x3) == 0)
				i_302_++;
		}
		int i_304_ = i;
		int i_305_ = aClass10_1787.anInt76 * -1669009881 + i_290_;
		int i_306_ = -1;
		if (i_296_ == 1)
			i_305_ += (i_292_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931) / 2;
		else if (2 == i_296_)
			i_305_ = i_292_ + i_290_ - -853549931 * aClass10_1787.anInt80;
		if (i_295_ == 1) {
			i_306_ = aClass10_1787.method597(string, -1759656773) + i_302_;
			i_304_ += (i_291_ - i_306_) / 2;
		} else if (i_295_ == 2) {
			i_306_ = aClass10_1787.method597(string, -1759656773) + i_302_;
			i_304_ += i_291_ - i_306_;
		}
		method2608(string, i_304_, i_305_, class148s, is_298_, is_301_, null, -831288457);
		if (is != null) {
			if (i_306_ == -1)
				i_306_ = aClass10_1787.method597(string, -1759656773) + i_302_;
			is[0] = i_304_;
			is[1] = i_305_ - aClass10_1787.anInt76 * -1669009881;
			is[2] = i_306_;
			is[3] = (aClass10_1787.anInt80 * -853549931 + -1669009881 * aClass10_1787.anInt76);
		}
		return i_302_;
	}

	public int method2634(String string, int i, int i_307_, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, Random random, int i_314_, int[] is, Class148[] class148s, int[] is_315_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_314_);
		int i_316_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_316_ << 24 | i_310_ & 0xffffff, i_311_ == -1 ? 0 : i_316_ << 24 | i_311_ & 0xffffff, 1933611453);
		int i_317_ = string.length();
		int[] is_318_ = new int[i_317_];
		int i_319_ = 0;
		for (int i_320_ = 0; i_320_ < i_317_; i_320_++) {
			is_318_[i_320_] = i_319_;
			if ((random.nextInt() & 0x3) == 0)
				i_319_++;
		}
		int i_321_ = i;
		int i_322_ = aClass10_1787.anInt76 * -1669009881 + i_307_;
		int i_323_ = -1;
		if (i_313_ == 1)
			i_322_ += (i_309_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931) / 2;
		else if (2 == i_313_)
			i_322_ = i_309_ + i_307_ - -853549931 * aClass10_1787.anInt80;
		if (i_312_ == 1) {
			i_323_ = aClass10_1787.method597(string, -1759656773) + i_319_;
			i_321_ += (i_308_ - i_323_) / 2;
		} else if (i_312_ == 2) {
			i_323_ = aClass10_1787.method597(string, -1759656773) + i_319_;
			i_321_ += i_308_ - i_323_;
		}
		method2608(string, i_321_, i_322_, class148s, is_315_, is_318_, null, -1025353539);
		if (is != null) {
			if (i_323_ == -1)
				i_323_ = aClass10_1787.method597(string, -1759656773) + i_319_;
			is[0] = i_321_;
			is[1] = i_322_ - aClass10_1787.anInt76 * -1669009881;
			is[2] = i_323_;
			is[3] = (aClass10_1787.anInt80 * -853549931 + -1669009881 * aClass10_1787.anInt76);
		}
		return i_319_;
	}

	public void method2635(String string, int i, int i_324_, int i_325_, int i_326_, byte i_327_) {
		if (string != null) {
			method2604(i_325_, i_326_, 389445672);
			method2607(string, i, i_324_, null, null, null, 0, 0, (byte) -1);
		}
	}

	public int method2636(String string, int i, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_, Random random, int i_335_, int[] is, Class148[] class148s, int[] is_336_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_335_);
		int i_337_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_337_ << 24 | i_331_ & 0xffffff, i_332_ == -1 ? 0 : i_337_ << 24 | i_332_ & 0xffffff, -1987648012);
		int i_338_ = string.length();
		int[] is_339_ = new int[i_338_];
		int i_340_ = 0;
		for (int i_341_ = 0; i_341_ < i_338_; i_341_++) {
			is_339_[i_341_] = i_340_;
			if ((random.nextInt() & 0x3) == 0)
				i_340_++;
		}
		int i_342_ = i;
		int i_343_ = aClass10_1787.anInt76 * -1669009881 + i_328_;
		int i_344_ = -1;
		if (i_334_ == 1)
			i_343_ += (i_330_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931) / 2;
		else if (2 == i_334_)
			i_343_ = i_330_ + i_328_ - -853549931 * aClass10_1787.anInt80;
		if (i_333_ == 1) {
			i_344_ = aClass10_1787.method597(string, -1759656773) + i_340_;
			i_342_ += (i_329_ - i_344_) / 2;
		} else if (i_333_ == 2) {
			i_344_ = aClass10_1787.method597(string, -1759656773) + i_340_;
			i_342_ += i_329_ - i_344_;
		}
		method2608(string, i_342_, i_343_, class148s, is_336_, is_339_, null, 693122324);
		if (is != null) {
			if (i_344_ == -1)
				i_344_ = aClass10_1787.method597(string, -1759656773) + i_340_;
			is[0] = i_342_;
			is[1] = i_343_ - aClass10_1787.anInt76 * -1669009881;
			is[2] = i_344_;
			is[3] = (aClass10_1787.anInt80 * -853549931 + -1669009881 * aClass10_1787.anInt76);
		}
		return i_340_;
	}

	public int method2637(String string, int i, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_, Random random, int i_352_, int[] is, Class148[] class148s, int[] is_353_) {
		if (null == string)
			return 0;
		random.setSeed((long) i_352_);
		int i_354_ = 192 + (random.nextInt() & 0x1f);
		method2604(i_354_ << 24 | i_348_ & 0xffffff, i_349_ == -1 ? 0 : i_354_ << 24 | i_349_ & 0xffffff, 562178584);
		int i_355_ = string.length();
		int[] is_356_ = new int[i_355_];
		int i_357_ = 0;
		for (int i_358_ = 0; i_358_ < i_355_; i_358_++) {
			is_356_[i_358_] = i_357_;
			if ((random.nextInt() & 0x3) == 0)
				i_357_++;
		}
		int i_359_ = i;
		int i_360_ = aClass10_1787.anInt76 * -1669009881 + i_345_;
		int i_361_ = -1;
		if (i_351_ == 1)
			i_360_ += (i_347_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931) / 2;
		else if (2 == i_351_)
			i_360_ = i_347_ + i_345_ - -853549931 * aClass10_1787.anInt80;
		if (i_350_ == 1) {
			i_361_ = aClass10_1787.method597(string, -1759656773) + i_357_;
			i_359_ += (i_346_ - i_361_) / 2;
		} else if (i_350_ == 2) {
			i_361_ = aClass10_1787.method597(string, -1759656773) + i_357_;
			i_359_ += i_346_ - i_361_;
		}
		method2608(string, i_359_, i_360_, class148s, is_353_, is_356_, null, -725086565);
		if (is != null) {
			if (i_361_ == -1)
				i_361_ = aClass10_1787.method597(string, -1759656773) + i_357_;
			is[0] = i_359_;
			is[1] = i_360_ - aClass10_1787.anInt76 * -1669009881;
			is[2] = i_361_;
			is[3] = (aClass10_1787.anInt80 * -853549931 + -1669009881 * aClass10_1787.anInt76);
		}
		return i_357_;
	}

	public int method2638(String string, int i, int i_362_, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_, int i_369_, int i_370_, Class148[] class148s, int[] is, Class145 class145, int i_371_, int i_372_) {
		if (null == string)
			return 0;
		method2604(i_365_, i_366_, -438910412);
		if (0 == i_369_)
			i_369_ = 1061510757 * aClass10_1787.anInt78;
		int[] is_373_;
		if (i_364_ < (-1669009881 * aClass10_1787.anInt76 + aClass10_1787.anInt80 * -853549931 + i_369_) && i_364_ < i_369_ + i_369_)
			is_373_ = null;
		else
			is_373_ = new int[] { i_363_ };
		int i_374_ = aClass10_1787.method600(string, is_373_, aStringArray1792, class148s, 1781040411);
		if (-1 == i_370_) {
			i_370_ = i_364_ / i_369_;
			if (i_370_ <= 0)
				i_370_ = 1;
		}
		if (i_370_ > 0 && i_374_ >= i_370_) {
			aStringArray1792[i_370_ - 1] = aClass10_1787.method599(aStringArray1792[i_370_ - 1], i_363_, class148s, (byte) 3);
			i_374_ = i_370_;
		}
		if (i_368_ == 3 && i_374_ == 1)
			i_368_ = 1;
		int i_375_;
		if (0 == i_368_)
			i_375_ = i_362_ + -1669009881 * aClass10_1787.anInt76;
		else if (i_368_ == 1)
			i_375_ = (i_362_ + -1669009881 * aClass10_1787.anInt76 + (i_364_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_369_ * (i_374_ - 1)) / 2);
		else if (i_368_ == 2)
			i_375_ = (i_364_ + i_362_ - -853549931 * aClass10_1787.anInt80 - i_369_ * (i_374_ - 1));
		else {
			int i_376_ = ((i_364_ - aClass10_1787.anInt76 * -1669009881 - aClass10_1787.anInt80 * -853549931 - i_369_ * (i_374_ - 1)) / (i_374_ + 1));
			if (i_376_ < 0)
				i_376_ = 0;
			i_375_ = i_362_ + aClass10_1787.anInt76 * -1669009881 + i_376_;
			i_369_ += i_376_;
		}
		for (int i_377_ = 0; i_377_ < i_374_; i_377_++) {
			if (0 == i_367_)
				method2607(aStringArray1792[i_377_], i, i_375_, class148s, is, class145, i_371_, i_372_, (byte) -114);
			else if (1 == i_367_)
				method2607(aStringArray1792[i_377_], i + (i_363_ - aClass10_1787.method597((aStringArray1792[i_377_]), -1759656773)) / 2, i_375_, class148s, is, class145, i_371_, i_372_, (byte) -55);
			else if (2 == i_367_)
				method2607(aStringArray1792[i_377_], (i + i_363_ - aClass10_1787.method597(aStringArray1792[i_377_], -1759656773)), i_375_, class148s, is, class145, i_371_, i_372_, (byte) -71);
			else if (i_374_ - 1 == i_377_)
				method2607(aStringArray1792[i_377_], i, i_375_, class148s, is, class145, i_371_, i_372_, (byte) -38);
			else {
				method2606(aStringArray1792[i_377_], i_363_, 1124714250);
				method2607(aStringArray1792[i_377_], i, i_375_, class148s, is, class145, i_371_, i_372_, (byte) -20);
				anInt1779 = 0;
			}
			i_375_ += i_369_;
		}
		return i_374_;
	}

	public void method2639(String string, int i, int i_378_, int i_379_, int i_380_, int i_381_, int i_382_) {
		if (null != string) {
			method2604(i_379_, i_380_, 1521825165);
			double d = 7.0 - (double) i_382_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int i_383_ = string.length();
			int[] is = new int[i_383_];
			for (int i_384_ = 0; i_384_ < i_383_; i_384_++)
				is[i_384_] = (int) (Math.sin((double) i_381_ / 1.0 + (double) i_384_ / 1.5) * d);
			method2608(string, i - aClass10_1787.method597(string, -1759656773) / 2, i_378_, null, null, null, is, -920147849);
		}
	}

	void method2640(String string) {
		try {
			if (string.startsWith("col="))
				anInt1783 = ((anInt1783 * 112984707 & ~0xffffff | Class648.method10614(string.substring(4), 16, 1626990035) & 0xffffff) * 1665260587);
			else if (string.equals("/col"))
				anInt1783 = (112984707 * anInt1783 & ~0xffffff | anInt1786 * 450523593 & 0xffffff) * 1665260587;
			if (string.startsWith("argb="))
				anInt1783 = Class648.method10614(string.substring(5), 16, -1910394088) * 1665260587;
			else if (string.equals("/argb"))
				anInt1783 = anInt1786 * -612181821;
			else if (string.startsWith("str="))
				anInt1784 = (112984707 * anInt1783 & ~0xffffff | Class648.method10614(string.substring(4), 16, 2071105920)) * 719035579;
			else if (string.equals("str"))
				anInt1784 = 719035579 * (112984707 * anInt1783 & ~0xffffff | 0x800000);
			else if (string.equals("/str"))
				anInt1784 = -719035579;
			else if (string.startsWith("u="))
				anInt1785 = (anInt1783 * 112984707 & ~0xffffff | Class648.method10614(string.substring(2), 16, -1156504723)) * -1345358343;
			else if (string.equals("u"))
				anInt1785 = -1345358343 * (anInt1783 * 112984707 & ~0xffffff);
			else if (string.equals("/u"))
				anInt1785 = 1345358343;
			else if (string.equalsIgnoreCase("shad=-1"))
				anInt1789 = 0;
			else if (string.startsWith("shad="))
				anInt1789 = (112984707 * anInt1783 & ~0xffffff | Class648.method10614(string.substring(5), 16, 1442819816)) * -1894931519;
			else if (string.equals("shad"))
				anInt1789 = (anInt1783 * 112984707 & ~0xffffff) * -1894931519;
			else if (string.equals("/shad"))
				anInt1789 = anInt1781 * -1997901187;
			else if (string.equals("br"))
				method2604(anInt1786 * 450523593, 561499581 * anInt1781, 2032976012);
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method2641(String string, int i) {
		int i_385_ = 0;
		boolean bool = false;
		for (int i_386_ = 0; i_386_ < string.length(); i_386_++) {
			char c = string.charAt(i_386_);
			if ('<' == c)
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool && ' ' == c)
				i_385_++;
		}
		if (i_385_ > 0)
			anInt1779 = (i - aClass10_1787.method597(string, -1759656773) << 8) / i_385_ * -441555637;
	}

	void method2642(String string, int i) {
		int i_387_ = 0;
		boolean bool = false;
		for (int i_388_ = 0; i_388_ < string.length(); i_388_++) {
			char c = string.charAt(i_388_);
			if ('<' == c)
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool && ' ' == c)
				i_387_++;
		}
		if (i_387_ > 0)
			anInt1779 = (i - aClass10_1787.method597(string, -1759656773) << 8) / i_387_ * -441555637;
	}

	void method2643(String string, int i) {
		int i_389_ = 0;
		boolean bool = false;
		for (int i_390_ = 0; i_390_ < string.length(); i_390_++) {
			char c = string.charAt(i_390_);
			if ('<' == c)
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool && ' ' == c)
				i_389_++;
		}
		if (i_389_ > 0)
			anInt1779 = (i - aClass10_1787.method597(string, -1759656773) << 8) / i_389_ * -441555637;
	}

	static final void method2644(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class457.method7443(class250, class242, false, 2, class669, 1671678998);
	}

	static final void method2645(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 907343347 * class250.anInt2554;
	}

	static final void method2646(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method4000((byte) 93) ? 1 : 0;
	}
}
