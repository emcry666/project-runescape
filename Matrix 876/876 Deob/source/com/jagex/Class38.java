/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class38 {
	static Class209 aClass209_374 = new Class209(32);
	static int anInt375;

	public static void method1108() {
		synchronized (aClass209_374) {
			aClass209_374.method3773(-1906260582);
		}
	}

	public static Class167 method1109(Class178 class178, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class167 class167, int i_4_, int i_5_, int i_6_, int i_7_, Class707 class707) {
		if (null == class167)
			return null;
		int i_8_ = 2055;
		if (null != class707) {
			i_8_ |= class707.method14173(-1975328465);
			i_8_ &= ~0x200;
		}
		long l = (((long) i_5_ << 48) + (((long) i_4_ << 32) + (long) (i_3_ + (i_6_ << 16) + (i_7_ << 24))));
		Class167 class167_9_;
		synchronized (aClass209_374) {
			class167_9_ = (Class167) aClass209_374.method3767(l);
		}
		if (class167_9_ == null || class178.method3068(class167_9_.method2683(), i_8_) != 0) {
			if (class167_9_ != null)
				i_8_ = class178.method3117(i_8_, class167_9_.method2683());
			int i_10_ = i_3_ * 3 + 6;
			int i_11_ = 3;
			int[] is = { 64, 96, 128 };
			Class179 class179 = new Class179(i_11_ * i_10_ + 1, i_11_ * i_10_ * 2 - i_10_, 0);
			int i_12_ = class179.method3483(0, 0, 0);
			int[][] is_13_ = new int[i_11_][i_10_];
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				int i_15_ = is[i_14_];
				int i_16_ = is[i_14_];
				for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
					int i_18_ = (i_17_ << 14) / i_10_;
					int i_19_ = i_15_ * Class433.anIntArray4880[i_18_] >> 14;
					int i_20_ = Class433.anIntArray4881[i_18_] * i_16_ >> 14;
					is_13_[i_14_][i_17_] = class179.method3483(i_19_, 0, i_20_);
				}
			}
			for (int i_21_ = 0; i_21_ < i_11_; i_21_++) {
				int i_22_ = (256 * i_21_ + 128) / i_11_;
				int i_23_ = 256 - i_22_;
				byte i_24_ = (byte) (i_7_ * i_22_ + i_23_ * i_6_ >> 8);
				short i_25_ = (short) (((i_23_ * (i_4_ & 0x7f) + i_22_ * (i_5_ & 0x7f) & 0x7f00) + ((((i_5_ & 0xfc00) * i_22_ + (i_4_ & 0xfc00) * i_23_) & 0xfc0000) + (((i_4_ & 0x380) * i_23_ + i_22_ * (i_5_ & 0x380)) & 0x38000))) >> 8);
				for (int i_26_ = 0; i_26_ < i_10_; i_26_++) {
					if (i_21_ == 0)
						class179.method3484(i_12_, is_13_[0][(1 + i_26_) % i_10_], is_13_[0][i_26_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
					else {
						class179.method3484(is_13_[i_21_ - 1][i_26_], (is_13_[i_21_ - 1][(i_26_ + 1) % i_10_]), is_13_[i_21_][(1 + i_26_) % i_10_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
						class179.method3484(is_13_[i_21_ - 1][i_26_], is_13_[i_21_][(1 + i_26_) % i_10_], is_13_[i_21_][i_26_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
					}
				}
			}
			class167_9_ = class178.method3115(class179, i_8_, anInt375 * 1447206721, 64, 768);
			synchronized (aClass209_374) {
				aClass209_374.method3770(class167_9_, l);
			}
		}
		int i_27_ = class167.method2712();
		int i_28_ = class167.method2713();
		int i_29_ = class167.method2716();
		int i_30_ = class167.method2717();
		if (null != class707) {
			class167_9_ = class167_9_.method2681((byte) 3, i_8_, true);
			class167_9_.method2691(i_28_ - i_27_ >> 1, 128, i_30_ - i_29_ >> 1);
			class167_9_.method2689(i_27_ + i_28_ >> 1, 0, i_29_ + i_30_ >> 1);
			class707.method14176(class167_9_, (byte) 7);
		} else {
			class167_9_ = class167_9_.method2681((byte) 3, i_8_, true);
			class167_9_.method2691(i_28_ - i_27_ >> 1, 128, i_30_ - i_29_ >> 1);
			class167_9_.method2689(i_28_ + i_27_ >> 1, 0, i_30_ + i_29_ >> 1);
		}
		if (i_0_ != 0)
			class167_9_.method2845(i_0_);
		if (i_1_ != 0)
			class167_9_.method2688(i_1_);
		if (0 != i_2_)
			class167_9_.method2689(0, i_2_, 0);
		return class167_9_;
	}

	public static Class167 method1110(Class178 class178, int i, int i_31_, int i_32_, int i_33_, int i_34_, Class167 class167, int i_35_, int i_36_, int i_37_, int i_38_, Class707 class707) {
		if (null == class167)
			return null;
		int i_39_ = 2055;
		if (null != class707) {
			i_39_ |= class707.method14173(-1860016522);
			i_39_ &= ~0x200;
		}
		long l = (((long) i_36_ << 48) + (((long) i_35_ << 32) + (long) (i_34_ + (i_37_ << 16) + (i_38_ << 24))));
		Class167 class167_40_;
		synchronized (aClass209_374) {
			class167_40_ = (Class167) aClass209_374.method3767(l);
		}
		if (class167_40_ == null || class178.method3068(class167_40_.method2683(), i_39_) != 0) {
			if (class167_40_ != null)
				i_39_ = class178.method3117(i_39_, class167_40_.method2683());
			int i_41_ = i_34_ * 3 + 6;
			int i_42_ = 3;
			int[] is = { 64, 96, 128 };
			Class179 class179 = new Class179(i_42_ * i_41_ + 1, i_42_ * i_41_ * 2 - i_41_, 0);
			int i_43_ = class179.method3483(0, 0, 0);
			int[][] is_44_ = new int[i_42_][i_41_];
			for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
				int i_46_ = is[i_45_];
				int i_47_ = is[i_45_];
				for (int i_48_ = 0; i_48_ < i_41_; i_48_++) {
					int i_49_ = (i_48_ << 14) / i_41_;
					int i_50_ = i_46_ * Class433.anIntArray4880[i_49_] >> 14;
					int i_51_ = Class433.anIntArray4881[i_49_] * i_47_ >> 14;
					is_44_[i_45_][i_48_] = class179.method3483(i_50_, 0, i_51_);
				}
			}
			for (int i_52_ = 0; i_52_ < i_42_; i_52_++) {
				int i_53_ = (256 * i_52_ + 128) / i_42_;
				int i_54_ = 256 - i_53_;
				byte i_55_ = (byte) (i_38_ * i_53_ + i_54_ * i_37_ >> 8);
				short i_56_ = (short) (((i_54_ * (i_35_ & 0x7f) + i_53_ * (i_36_ & 0x7f) & 0x7f00) + ((((i_36_ & 0xfc00) * i_53_ + (i_35_ & 0xfc00) * i_54_) & 0xfc0000) + (((i_35_ & 0x380) * i_54_ + i_53_ * (i_36_ & 0x380)) & 0x38000))) >> 8);
				for (int i_57_ = 0; i_57_ < i_41_; i_57_++) {
					if (i_52_ == 0)
						class179.method3484(i_43_, is_44_[0][(1 + i_57_) % i_41_], is_44_[0][i_57_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
					else {
						class179.method3484(is_44_[i_52_ - 1][i_57_], (is_44_[i_52_ - 1][(i_57_ + 1) % i_41_]), is_44_[i_52_][(1 + i_57_) % i_41_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
						class179.method3484(is_44_[i_52_ - 1][i_57_], is_44_[i_52_][(1 + i_57_) % i_41_], is_44_[i_52_][i_57_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
					}
				}
			}
			class167_40_ = class178.method3115(class179, i_39_, anInt375 * 1447206721, 64, 768);
			synchronized (aClass209_374) {
				aClass209_374.method3770(class167_40_, l);
			}
		}
		int i_58_ = class167.method2712();
		int i_59_ = class167.method2713();
		int i_60_ = class167.method2716();
		int i_61_ = class167.method2717();
		if (null != class707) {
			class167_40_ = class167_40_.method2681((byte) 3, i_39_, true);
			class167_40_.method2691(i_59_ - i_58_ >> 1, 128, i_61_ - i_60_ >> 1);
			class167_40_.method2689(i_58_ + i_59_ >> 1, 0, i_60_ + i_61_ >> 1);
			class707.method14176(class167_40_, (byte) -104);
		} else {
			class167_40_ = class167_40_.method2681((byte) 3, i_39_, true);
			class167_40_.method2691(i_59_ - i_58_ >> 1, 128, i_61_ - i_60_ >> 1);
			class167_40_.method2689(i_59_ + i_58_ >> 1, 0, i_61_ + i_60_ >> 1);
		}
		if (i_31_ != 0)
			class167_40_.method2845(i_31_);
		if (i_32_ != 0)
			class167_40_.method2688(i_32_);
		if (0 != i_33_)
			class167_40_.method2689(0, i_33_, 0);
		return class167_40_;
	}

	public static Class167 method1111(Class178 class178, int i, int i_62_, int i_63_, int i_64_, int i_65_, Class167 class167, int i_66_, int i_67_, int i_68_, int i_69_, Class707 class707) {
		if (null == class167)
			return null;
		int i_70_ = 2055;
		if (null != class707) {
			i_70_ |= class707.method14173(-774283861);
			i_70_ &= ~0x200;
		}
		long l = (((long) i_67_ << 48) + (((long) i_66_ << 32) + (long) (i_65_ + (i_68_ << 16) + (i_69_ << 24))));
		Class167 class167_71_;
		synchronized (aClass209_374) {
			class167_71_ = (Class167) aClass209_374.method3767(l);
		}
		if (class167_71_ == null || class178.method3068(class167_71_.method2683(), i_70_) != 0) {
			if (class167_71_ != null)
				i_70_ = class178.method3117(i_70_, class167_71_.method2683());
			int i_72_ = i_65_ * 3 + 6;
			int i_73_ = 3;
			int[] is = { 64, 96, 128 };
			Class179 class179 = new Class179(i_73_ * i_72_ + 1, i_73_ * i_72_ * 2 - i_72_, 0);
			int i_74_ = class179.method3483(0, 0, 0);
			int[][] is_75_ = new int[i_73_][i_72_];
			for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
				int i_77_ = is[i_76_];
				int i_78_ = is[i_76_];
				for (int i_79_ = 0; i_79_ < i_72_; i_79_++) {
					int i_80_ = (i_79_ << 14) / i_72_;
					int i_81_ = i_77_ * Class433.anIntArray4880[i_80_] >> 14;
					int i_82_ = Class433.anIntArray4881[i_80_] * i_78_ >> 14;
					is_75_[i_76_][i_79_] = class179.method3483(i_81_, 0, i_82_);
				}
			}
			for (int i_83_ = 0; i_83_ < i_73_; i_83_++) {
				int i_84_ = (256 * i_83_ + 128) / i_73_;
				int i_85_ = 256 - i_84_;
				byte i_86_ = (byte) (i_69_ * i_84_ + i_85_ * i_68_ >> 8);
				short i_87_ = (short) (((i_85_ * (i_66_ & 0x7f) + i_84_ * (i_67_ & 0x7f) & 0x7f00) + ((((i_67_ & 0xfc00) * i_84_ + (i_66_ & 0xfc00) * i_85_) & 0xfc0000) + (((i_66_ & 0x380) * i_85_ + i_84_ * (i_67_ & 0x380)) & 0x38000))) >> 8);
				for (int i_88_ = 0; i_88_ < i_72_; i_88_++) {
					if (i_83_ == 0)
						class179.method3484(i_74_, is_75_[0][(1 + i_88_) % i_72_], is_75_[0][i_88_], (byte) 1, (byte) -1, i_87_, i_86_, (short) -1);
					else {
						class179.method3484(is_75_[i_83_ - 1][i_88_], (is_75_[i_83_ - 1][(i_88_ + 1) % i_72_]), is_75_[i_83_][(1 + i_88_) % i_72_], (byte) 1, (byte) -1, i_87_, i_86_, (short) -1);
						class179.method3484(is_75_[i_83_ - 1][i_88_], is_75_[i_83_][(1 + i_88_) % i_72_], is_75_[i_83_][i_88_], (byte) 1, (byte) -1, i_87_, i_86_, (short) -1);
					}
				}
			}
			class167_71_ = class178.method3115(class179, i_70_, anInt375 * 1447206721, 64, 768);
			synchronized (aClass209_374) {
				aClass209_374.method3770(class167_71_, l);
			}
		}
		int i_89_ = class167.method2712();
		int i_90_ = class167.method2713();
		int i_91_ = class167.method2716();
		int i_92_ = class167.method2717();
		if (null != class707) {
			class167_71_ = class167_71_.method2681((byte) 3, i_70_, true);
			class167_71_.method2691(i_90_ - i_89_ >> 1, 128, i_92_ - i_91_ >> 1);
			class167_71_.method2689(i_89_ + i_90_ >> 1, 0, i_91_ + i_92_ >> 1);
			class707.method14176(class167_71_, (byte) -66);
		} else {
			class167_71_ = class167_71_.method2681((byte) 3, i_70_, true);
			class167_71_.method2691(i_90_ - i_89_ >> 1, 128, i_92_ - i_91_ >> 1);
			class167_71_.method2689(i_90_ + i_89_ >> 1, 0, i_92_ + i_91_ >> 1);
		}
		if (i_62_ != 0)
			class167_71_.method2845(i_62_);
		if (i_63_ != 0)
			class167_71_.method2688(i_63_);
		if (0 != i_64_)
			class167_71_.method2689(0, i_64_, 0);
		return class167_71_;
	}

	static void method1112(int i) {
		synchronized (aClass209_374) {
			aClass209_374.method3772(i, (byte) -42);
		}
	}

	public static Class167 method1113(Class178 class178, int i, int i_93_, int i_94_, int i_95_, Class167 class167, short i_96_, byte i_97_, Class707 class707) {
		if (null == class167)
			return null;
		int i_98_ = 2055;
		if (class707 != null) {
			i_98_ |= class707.method14173(-1306010873);
			i_98_ &= ~0x200;
		}
		long l = (long) ((i_96_ & 0xffff) << 8 | i_97_);
		Class167 class167_99_;
		synchronized (aClass209_374) {
			class167_99_ = (Class167) aClass209_374.method3767(l);
		}
		if (class167_99_ == null || class178.method3068(class167_99_.method2683(), i_98_) != 0) {
			if (null != class167_99_)
				i_98_ = class178.method3117(i_98_, class167_99_.method2683());
			Class179 class179 = new Class179(4, 2, 2);
			int i_100_ = 128;
			int[] is = new int[4];
			is[0] = class179.method3483(-i_100_, 0, -i_100_);
			is[1] = class179.method3483(i_100_, 0, -i_100_);
			is[2] = class179.method3483(i_100_, 0, i_100_);
			is[3] = class179.method3483(-i_100_, 0, i_100_);
			class179.method3484(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_97_, i_96_);
			class179.method3484(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_97_, i_96_);
			class179.method3498((short) 1, (short) 2, (short) 0);
			class179.method3498((short) 2, (short) 3, (short) 0);
			class167_99_ = class178.method3115(class179, i_98_, anInt375 * 1447206721, 64, 768);
			synchronized (aClass209_374) {
				aClass209_374.method3770(class167_99_, l);
			}
		}
		int i_101_ = class167.method2712();
		int i_102_ = class167.method2713();
		int i_103_ = class167.method2716();
		int i_104_ = class167.method2717();
		if (null != class707) {
			class167_99_ = class167_99_.method2681((byte) 3, i_98_, true);
			class167_99_.method2691(i_102_ - i_101_ >> 1, 128, i_104_ - i_103_ >> 1);
			class167_99_.method2689(i_102_ + i_101_ >> 1, 0, i_103_ + i_104_ >> 1);
			class707.method14176(class167_99_, (byte) 2);
		} else {
			class167_99_ = class167_99_.method2681((byte) 3, i_98_, true);
			class167_99_.method2691(i_102_ - i_101_ >> 1, 128, i_104_ - i_103_ >> 1);
			class167_99_.method2689(i_101_ + i_102_ >> 1, 0, i_103_ + i_104_ >> 1);
		}
		if (0 != i_93_)
			class167_99_.method2845(i_93_);
		if (i_94_ != 0)
			class167_99_.method2688(i_94_);
		if (0 != i_95_)
			class167_99_.method2689(0, i_95_, 0);
		return class167_99_;
	}

	static void method1114(int i) {
		anInt375 = i * -851840831;
		synchronized (aClass209_374) {
			aClass209_374.method3773(-1891179898);
		}
	}

	public static void method1115() {
		synchronized (aClass209_374) {
			aClass209_374.method3773(-2009632353);
		}
	}

	public static Class167 method1116(Class178 class178, int i, int i_105_, int i_106_, int i_107_, Class167 class167, short i_108_, byte i_109_, Class707 class707) {
		if (null == class167)
			return null;
		int i_110_ = 2055;
		if (class707 != null) {
			i_110_ |= class707.method14173(2012288764);
			i_110_ &= ~0x200;
		}
		long l = (long) ((i_108_ & 0xffff) << 8 | i_109_);
		Class167 class167_111_;
		synchronized (aClass209_374) {
			class167_111_ = (Class167) aClass209_374.method3767(l);
		}
		if (class167_111_ == null || class178.method3068(class167_111_.method2683(), i_110_) != 0) {
			if (null != class167_111_)
				i_110_ = class178.method3117(i_110_, class167_111_.method2683());
			Class179 class179 = new Class179(4, 2, 2);
			int i_112_ = 128;
			int[] is = new int[4];
			is[0] = class179.method3483(-i_112_, 0, -i_112_);
			is[1] = class179.method3483(i_112_, 0, -i_112_);
			is[2] = class179.method3483(i_112_, 0, i_112_);
			is[3] = class179.method3483(-i_112_, 0, i_112_);
			class179.method3484(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_109_, i_108_);
			class179.method3484(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_109_, i_108_);
			class179.method3498((short) 1, (short) 2, (short) 0);
			class179.method3498((short) 2, (short) 3, (short) 0);
			class167_111_ = class178.method3115(class179, i_110_, anInt375 * 1447206721, 64, 768);
			synchronized (aClass209_374) {
				aClass209_374.method3770(class167_111_, l);
			}
		}
		int i_113_ = class167.method2712();
		int i_114_ = class167.method2713();
		int i_115_ = class167.method2716();
		int i_116_ = class167.method2717();
		if (null != class707) {
			class167_111_ = class167_111_.method2681((byte) 3, i_110_, true);
			class167_111_.method2691(i_114_ - i_113_ >> 1, 128, i_116_ - i_115_ >> 1);
			class167_111_.method2689(i_114_ + i_113_ >> 1, 0, i_115_ + i_116_ >> 1);
			class707.method14176(class167_111_, (byte) 26);
		} else {
			class167_111_ = class167_111_.method2681((byte) 3, i_110_, true);
			class167_111_.method2691(i_114_ - i_113_ >> 1, 128, i_116_ - i_115_ >> 1);
			class167_111_.method2689(i_113_ + i_114_ >> 1, 0, i_115_ + i_116_ >> 1);
		}
		if (0 != i_105_)
			class167_111_.method2845(i_105_);
		if (i_106_ != 0)
			class167_111_.method2688(i_106_);
		if (0 != i_107_)
			class167_111_.method2689(0, i_107_, 0);
		return class167_111_;
	}

	static void method1117(int i) {
		synchronized (aClass209_374) {
			aClass209_374.method3772(i, (byte) -34);
		}
	}

	Class38() throws Throwable {
		throw new Error();
	}

	static void method1118() {
		synchronized (aClass209_374) {
			aClass209_374.method3776(-1464457896);
		}
	}

	static void method1119() {
		synchronized (aClass209_374) {
			aClass209_374.method3776(2044835129);
		}
	}

	public static int method1120(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_) {
		if (1 == (i_121_ & 0x1)) {
			int i_123_ = i_119_;
			i_119_ = i_120_;
			i_120_ = i_123_;
		}
		i_118_ &= 0x3;
		if (0 == i_118_)
			return i_117_;
		if (i_118_ == 1)
			return 7 - i - (i_119_ - 1);
		if (2 == i_118_)
			return 7 - i_117_ - (i_120_ - 1);
		return i;
	}

	public static int method1121(int i, int i_124_, int i_125_, boolean bool, byte i_126_) {
		if (0 != i && (i < 50 || i > 100))
			i = 0;
		if (0 != i_124_ && (i_124_ < 50 || i_124_ > 100))
			i_124_ = 0;
		boolean bool_127_ = Class509.aString5723.startsWith("mac");
		int[] is = (Class323.aTwitchTV3452.GetRecommendedSettings(Class170.anInt1833 * 2141365743, Class254.anInt2742 * -495986435, i, 2000, i_125_, Class569.aFloat7632, bool_127_));
		if (is[0] != 0)
			return is[0];
		int i_128_ = is[1];
		int i_129_ = is[2];
		int i_130_ = is[3];
		int i_131_ = i_130_;
		Class569.aLong7625 = 0L;
		Class569.aLong7629 = (long) (1000.0F / (float) i_125_) * -206299636776198047L;
		Class57.anInt746 = -1918506005 * i_128_;
		Class322.anInt3445 = 1962786063 * i_129_;
		if (0 != i_124_)
			i_130_ = i_124_ * i_130_ / 100;
		Class485.method7932(new StringBuilder().append("Stream - Input: ").append(2141365743 * Class170.anInt1833).append("x").append(-495986435 * Class254.anInt2742).append(" (").append(i_131_).append("kbps)").append(" => ").append("Output: ").append(i_128_).append("x").append(i_129_).append(" [").append(0 == i ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (").append(i_130_).append("kbps [").append(i_124_ == 0 ? "auto" : new StringBuilder().append(i_124_).append("%").toString()).append("])").toString(), (byte) -76);
		return Class323.aTwitchTV3452.StartStreaming(i_128_, i_129_, i_125_, i_130_, i_124_ != 0, Class569.aFloat7632, (-1778392095 * Class569.anInt7627), bool);
	}

	static final void method1122(Class669 class669, int i) {
		int i_132_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3967(i_132_, (byte) 2).method4225(1357490167).method82();
	}

	static final void method1123(Class669 class669, byte i) {
		int i_133_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub10 class523_sub27_sub10 = Class380.aClass473_3938.method7739(i_133_, (byte) -82);
		if (null == class523_sub27_sub10.anIntArray11724)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub10.anIntArray11724.length;
	}
}
