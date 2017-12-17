/* Class523_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ItemsContainer extends Class523 {
	int[] itemIds = { -1 };
	static Class14 containers = new Class14(32);
	static int anInt10321;
	Class4[] aClass4Array10322;
	int[] itemAmounts = { 0 };
	static Class209 aClass209_10324 = new Class209(10);

	static void method15825(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1254748233);
		if (null != class523_sub1)
			class523_sub1.method8661(607052656);
	}

	public static int method15826(int i, int i_0_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1950719971);
		if (class523_sub1 == null)
			return 0;
		if (i_0_ == -1)
			return 0;
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < class523_sub1.itemAmounts.length; i_2_++) {
			if (i_0_ == class523_sub1.itemIds[i_2_])
				i_1_ += class523_sub1.itemAmounts[i_2_];
		}
		return i_1_;
	}

	final Class167 method15827(Class178 class178, int i, Class707 class707, int i_3_, boolean bool, Class623 class623, int i_4_) {
		Class167 class167 = null;
		int i_5_ = i;
		Class588 class588 = null;
		if (-1 != i_3_)
			class588 = (Class588) Class80.aClass53_Sub17_866.getDefinition(i_3_, (byte) -17);
		int[] is = itemIds;
		if (class588 != null && null != class588.anIntArray7780) {
			is = new int[class588.anIntArray7780.length];
			for (int i_6_ = 0; i_6_ < class588.anIntArray7780.length; i_6_++) {
				int i_7_ = class588.anIntArray7780[i_6_];
				if (i_7_ >= 0 && i_7_ < itemIds.length)
					is[i_6_] = itemIds[i_7_];
				else
					is[i_6_] = -1;
			}
		}
		if (class707 != null)
			i_5_ |= class707.method14173(-652855039);
		long l = method15841(is, i_3_, class623 != null ? class623.anIntArray8102 : null, bool, (byte) -45);
		if (aClass209_10324 != null)
			class167 = (Class167) aClass209_10324.method3767(l);
		if (class167 == null || class178.method3068(class167.method2683(), i_5_) != 0) {
			if (null != class167)
				i_5_ = class178.method3117(i_5_, class167.method2683());
			int i_8_ = i_5_;
			boolean bool_9_ = false;
			for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
				if (is[i_10_] != -1 && !((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(is[i_10_], (byte) -15)).method665(bool, null, 2072640349))
					bool_9_ = true;
			}
			if (bool_9_)
				return null;
			Class179[] class179s = new Class179[is.length];
			for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
				if (-1 != is[i_11_])
					class179s[i_11_] = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(is[i_11_], (byte) 118)).method682(bool, null, 898209217);
			}
			if (class588 != null && class588.anIntArrayArray7776 != null) {
				for (int i_12_ = 0; i_12_ < class588.anIntArrayArray7776.length; i_12_++) {
					if (class588.anIntArrayArray7776[i_12_] != null && class179s[i_12_] != null) {
						int i_13_ = class588.anIntArrayArray7776[i_12_][0];
						int i_14_ = class588.anIntArrayArray7776[i_12_][1];
						int i_15_ = class588.anIntArrayArray7776[i_12_][2];
						int i_16_ = class588.anIntArrayArray7776[i_12_][3];
						int i_17_ = class588.anIntArrayArray7776[i_12_][4];
						int i_18_ = class588.anIntArrayArray7776[i_12_][5];
						if (0 != i_16_ || 0 != i_17_ || i_18_ != 0)
							class179s[i_12_].method3493(i_16_, i_17_, i_18_);
						if (0 != i_13_ || 0 != i_14_ || 0 != i_15_)
							class179s[i_12_].method3492(i_13_, i_14_, i_15_);
					}
				}
			}
			Class179 class179 = new Class179(class179s, class179s.length);
			if (class623 != null)
				i_8_ |= 0x4000;
			class167 = class178.method3115(class179, i_8_, 687703987 * anInt10321, 65, 856);
			if (class623 != null) {
				for (int i_19_ = 0; i_19_ < 10; i_19_++) {
					for (int i_20_ = 0; i_20_ < Class150.aShortArrayArray1725[i_19_].length; i_20_++) {
						if (class623.anIntArray8102[i_19_] < (Class207.aShortArrayArrayArray2248[i_19_][i_20_]).length)
							class167.method2725(Class150.aShortArrayArray1725[i_19_][i_20_], (Class207.aShortArrayArrayArray2248[i_19_][i_20_][class623.anIntArray8102[i_19_]]));
					}
				}
				for (int i_21_ = 0; i_21_ < 10; i_21_++) {
					for (int i_22_ = 0; i_22_ < Class546.aShortArrayArray7302[i_21_].length; i_22_++) {
						if (class623.anIntArray8103[i_21_] < (Class21.aShortArrayArrayArray214[i_21_][i_22_]).length)
							class167.method2826(Class546.aShortArrayArray7302[i_21_][i_22_], (Class21.aShortArrayArrayArray214[i_21_][i_22_][class623.anIntArray8103[i_21_]]));
					}
				}
			}
			if (null != aClass209_10324) {
				class167.method2769(i_5_);
				aClass209_10324.method3770(class167, l);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_23_ = class167.method2681((byte) 1, i_5_, true);
		class707.method14229(class167_23_, 0, 1803086518);
		return class167_23_;
	}

	ItemsContainer() {
		aClass4Array10322 = null;
	}

	public static int method15828(int i, int i_24_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1357358492);
		if (null == class523_sub1)
			return -1;
		if (i_24_ < 0 || i_24_ >= class523_sub1.itemIds.length)
			return -1;
		return class523_sub1.itemIds[i_24_];
	}

	static void method15829(int i) {
		anInt10321 = 1772781435 * i;
		aClass209_10324.method3773(-2067874291);
	}

	public static int method15830(int i, int i_25_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1983584122);
		if (null == class523_sub1)
			return -1;
		if (i_25_ < 0 || i_25_ >= class523_sub1.itemIds.length)
			return -1;
		return class523_sub1.itemIds[i_25_];
	}

	public static int method15831(int i, int i_26_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1278962354);
		if (null == class523_sub1)
			return -1;
		if (i_26_ < 0 || i_26_ >= class523_sub1.itemIds.length)
			return -1;
		return class523_sub1.itemIds[i_26_];
	}

	public static int method15832(int i, int i_27_, int i_28_, boolean bool) {
		Class309 class309 = ((Class309) Class539.aClass53_Sub3_7213.getDefinition(i_28_, (byte) -30));
		Class159 class159 = class309.aClass159_3367;
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1608998262);
		int i_29_;
		if (class523_sub1 == null || i_27_ < 0 || i_27_ >= class523_sub1.itemAmounts.length || null == class523_sub1.aClass4Array10322 || class523_sub1.aClass4Array10322[i_27_] == null)
			i_29_ = ((Integer) class159.method2560(117630037)).intValue();
		else
			i_29_ = class523_sub1.aClass4Array10322[i_27_].method21(class159.anInt1754 * -80020449, -1939263214);
		return class309.method5604(i_29_, -1969698876);
	}

	public static int method15833(int i, int i_30_, int i_31_, boolean bool) {
		Class309 class309 = ((Class309) Class539.aClass53_Sub3_7213.getDefinition(i_31_, (byte) -49));
		Class159 class159 = class309.aClass159_3367;
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1706840558);
		int i_32_;
		if (class523_sub1 == null || i_30_ < 0 || i_30_ >= class523_sub1.itemAmounts.length || null == class523_sub1.aClass4Array10322 || class523_sub1.aClass4Array10322[i_30_] == null)
			i_32_ = ((Integer) class159.method2560(633006565)).intValue();
		else
			i_32_ = class523_sub1.aClass4Array10322[i_30_].method21(class159.anInt1754 * -80020449, -1410010304);
		return class309.method5604(i_32_, 1974014337);
	}

	public static int method15834(int i, int i_33_, int i_34_, boolean bool) {
		Class309 class309 = ((Class309) Class539.aClass53_Sub3_7213.getDefinition(i_34_, (byte) 24));
		Class159 class159 = class309.aClass159_3367;
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1687688815);
		int i_35_;
		if (class523_sub1 == null || i_33_ < 0 || i_33_ >= class523_sub1.itemAmounts.length || null == class523_sub1.aClass4Array10322 || class523_sub1.aClass4Array10322[i_33_] == null)
			i_35_ = ((Integer) class159.method2560(317825959)).intValue();
		else
			i_35_ = class523_sub1.aClass4Array10322[i_33_].method21(class159.anInt1754 * -80020449, -656331647);
		return class309.method5604(i_35_, 85953993);
	}

	public static int method15835(int i, int i_36_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1023096022);
		if (class523_sub1 == null)
			return 0;
		if (i_36_ == -1)
			return 0;
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < class523_sub1.itemAmounts.length; i_38_++) {
			if (i_36_ == class523_sub1.itemIds[i_38_])
				i_37_ += class523_sub1.itemAmounts[i_38_];
		}
		return i_37_;
	}

	static void method15836(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1985673662);
		if (null != class523_sub1)
			class523_sub1.method8661(607052656);
	}

	public static int method15837(int i, int i_39_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1268543448);
		if (class523_sub1 == null)
			return 0;
		if (i_39_ == -1)
			return 0;
		int i_40_ = 0;
		for (int i_41_ = 0; i_41_ < class523_sub1.itemAmounts.length; i_41_++) {
			if (i_39_ == class523_sub1.itemIds[i_41_])
				i_40_ += class523_sub1.itemAmounts[i_41_];
		}
		return i_40_;
	}

	public static int method15838(int i, int i_42_, boolean bool) {
		int i_43_ = 0;
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1359886547);
		if (class523_sub1 == null)
			return 0;
		for (int i_44_ = 0; i_44_ < class523_sub1.itemIds.length; i_44_++) {
			if (class523_sub1.itemIds[i_44_] >= 0 && ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(class523_sub1.itemIds[i_44_], (byte) 45))).anInt159 * 643503181 == i_42_)
				i_43_ += Class654.method10720(i, i_44_, bool, 53755549);
		}
		return i_43_;
	}

	public static int method15839(int i, int i_45_, boolean bool, boolean bool_46_) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool_46_, -1714582729);
		if (class523_sub1 == null)
			return 0;
		int i_47_ = 0;
		for (int i_48_ = 0; i_48_ < class523_sub1.itemIds.length; i_48_++) {
			if (class523_sub1.itemIds[i_48_] >= 0 && (class523_sub1.itemIds[i_48_] < (Class523_Sub37.aClass53_Sub8_10677.anInt721 * 787510181))) {
				ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(class523_sub1.itemIds[i_48_], (byte) -104)));
				int i_49_ = class12.method669(i_45_, (((Class76) Class60.aClass53_Sub22_766.getDefinition(i_45_, (byte) -83)).anInt850) * -1100663923, -1924252527);
				if (bool)
					i_47_ += class523_sub1.itemAmounts[i_48_] * i_49_;
				else
					i_47_ += i_49_;
			}
		}
		return i_47_;
	}

	public static int method15840(int i, int i_50_, boolean bool, boolean bool_51_) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool_51_, -1457469939);
		if (class523_sub1 == null)
			return 0;
		int i_52_ = 0;
		for (int i_53_ = 0; i_53_ < class523_sub1.itemIds.length; i_53_++) {
			if (class523_sub1.itemIds[i_53_] >= 0 && (class523_sub1.itemIds[i_53_] < (Class523_Sub37.aClass53_Sub8_10677.anInt721 * 787510181))) {
				ItemDefinitions class12 = ((ItemDefinitions) (Class523_Sub37.aClass53_Sub8_10677.getDefinition(class523_sub1.itemIds[i_53_], (byte) 43)));
				int i_54_ = class12.method669(i_50_, (((Class76) Class60.aClass53_Sub22_766.getDefinition(i_50_, (byte) 46)).anInt850) * -1100663923, -1998619152);
				if (bool)
					i_52_ += class523_sub1.itemAmounts[i_53_] * i_54_;
				else
					i_52_ += i_54_;
			}
		}
		return i_52_;
	}

	long method15841(int[] is, int i, int[] is_55_, boolean bool, byte i_56_) {
		long[] ls = Class523_Sub34.aLongArray10662;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_57_ = 0; i_57_ < is.length; i_57_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_57_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_57_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_57_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_57_]) & 0xffL)];
		}
		if (is_55_ != null) {
			for (int i_58_ = 0; i_58_ < 5; i_58_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_55_[i_58_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	static void method15842(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1184787298);
		if (class523_sub1 != null) {
			for (int i_59_ = 0; i_59_ < class523_sub1.itemIds.length; i_59_++) {
				class523_sub1.itemIds[i_59_] = -1;
				class523_sub1.itemAmounts[i_59_] = 0;
			}
			class523_sub1.aClass4Array10322 = null;
		}
	}

	public static int method15843(int i, int i_60_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1229546518);
		if (null == class523_sub1)
			return -1;
		if (i_60_ < 0 || i_60_ >= class523_sub1.itemIds.length)
			return -1;
		return class523_sub1.itemIds[i_60_];
	}

	long method15844(int[] is, int i, int[] is_61_, boolean bool) {
		long[] ls = Class523_Sub34.aLongArray10662;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_62_ = 0; i_62_ < is.length; i_62_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_62_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_62_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_62_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_62_]) & 0xffL)];
		}
		if (is_61_ != null) {
			for (int i_63_ = 0; i_63_ < 5; i_63_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_61_[i_63_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	static void method15845(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -755333348);
		if (null != class523_sub1)
			class523_sub1.method8661(607052656);
	}

	static void method15846(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1617163971);
		if (null != class523_sub1)
			class523_sub1.method8661(607052656);
	}

	static void method15847(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1626337829);
		if (null != class523_sub1)
			class523_sub1.method8661(607052656);
	}

	public static int method15848(int i, int i_64_, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1602421489);
		if (null == class523_sub1)
			return -1;
		if (i_64_ < 0 || i_64_ >= class523_sub1.itemIds.length)
			return -1;
		return class523_sub1.itemIds[i_64_];
	}

	long method15849(int[] is, int i, int[] is_65_, boolean bool) {
		long[] ls = Class523_Sub34.aLongArray10662;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_66_ = 0; i_66_ < is.length; i_66_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_66_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_66_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_66_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_66_]) & 0xffL)];
		}
		if (is_65_ != null) {
			for (int i_67_ = 0; i_67_ < 5; i_67_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_65_[i_67_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	final Class167 method15850(Class178 class178, int i, Class707 class707, int i_68_, boolean bool, Class623 class623) {
		Class167 class167 = null;
		int i_69_ = i;
		Class588 class588 = null;
		if (-1 != i_68_)
			class588 = (Class588) Class80.aClass53_Sub17_866.getDefinition(i_68_, (byte) 31);
		int[] is = itemIds;
		if (class588 != null && null != class588.anIntArray7780) {
			is = new int[class588.anIntArray7780.length];
			for (int i_70_ = 0; i_70_ < class588.anIntArray7780.length; i_70_++) {
				int i_71_ = class588.anIntArray7780[i_70_];
				if (i_71_ >= 0 && i_71_ < itemIds.length)
					is[i_70_] = itemIds[i_71_];
				else
					is[i_70_] = -1;
			}
		}
		if (class707 != null)
			i_69_ |= class707.method14173(1661224550);
		long l = method15841(is, i_68_, class623 != null ? class623.anIntArray8102 : null, bool, (byte) -50);
		if (aClass209_10324 != null)
			class167 = (Class167) aClass209_10324.method3767(l);
		if (class167 == null || class178.method3068(class167.method2683(), i_69_) != 0) {
			if (null != class167)
				i_69_ = class178.method3117(i_69_, class167.method2683());
			int i_72_ = i_69_;
			boolean bool_73_ = false;
			for (int i_74_ = 0; i_74_ < is.length; i_74_++) {
				if (is[i_74_] != -1 && !((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(is[i_74_], (byte) 32)).method665(bool, null, 1550421893))
					bool_73_ = true;
			}
			if (bool_73_)
				return null;
			Class179[] class179s = new Class179[is.length];
			for (int i_75_ = 0; i_75_ < is.length; i_75_++) {
				if (-1 != is[i_75_])
					class179s[i_75_] = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(is[i_75_], (byte) 20)).method682(bool, null, -173212789);
			}
			if (class588 != null && class588.anIntArrayArray7776 != null) {
				for (int i_76_ = 0; i_76_ < class588.anIntArrayArray7776.length; i_76_++) {
					if (class588.anIntArrayArray7776[i_76_] != null && class179s[i_76_] != null) {
						int i_77_ = class588.anIntArrayArray7776[i_76_][0];
						int i_78_ = class588.anIntArrayArray7776[i_76_][1];
						int i_79_ = class588.anIntArrayArray7776[i_76_][2];
						int i_80_ = class588.anIntArrayArray7776[i_76_][3];
						int i_81_ = class588.anIntArrayArray7776[i_76_][4];
						int i_82_ = class588.anIntArrayArray7776[i_76_][5];
						if (0 != i_80_ || 0 != i_81_ || i_82_ != 0)
							class179s[i_76_].method3493(i_80_, i_81_, i_82_);
						if (0 != i_77_ || 0 != i_78_ || 0 != i_79_)
							class179s[i_76_].method3492(i_77_, i_78_, i_79_);
					}
				}
			}
			Class179 class179 = new Class179(class179s, class179s.length);
			if (class623 != null)
				i_72_ |= 0x4000;
			class167 = class178.method3115(class179, i_72_, 687703987 * anInt10321, 65, 856);
			if (class623 != null) {
				for (int i_83_ = 0; i_83_ < 10; i_83_++) {
					for (int i_84_ = 0; i_84_ < Class150.aShortArrayArray1725[i_83_].length; i_84_++) {
						if (class623.anIntArray8102[i_83_] < (Class207.aShortArrayArrayArray2248[i_83_][i_84_]).length)
							class167.method2725(Class150.aShortArrayArray1725[i_83_][i_84_], (Class207.aShortArrayArrayArray2248[i_83_][i_84_][class623.anIntArray8102[i_83_]]));
					}
				}
				for (int i_85_ = 0; i_85_ < 10; i_85_++) {
					for (int i_86_ = 0; i_86_ < Class546.aShortArrayArray7302[i_85_].length; i_86_++) {
						if (class623.anIntArray8103[i_85_] < (Class21.aShortArrayArrayArray214[i_85_][i_86_]).length)
							class167.method2826(Class546.aShortArrayArray7302[i_85_][i_86_], (Class21.aShortArrayArrayArray214[i_85_][i_86_][class623.anIntArray8103[i_85_]]));
					}
				}
			}
			if (null != aClass209_10324) {
				class167.method2769(i_69_);
				aClass209_10324.method3770(class167, l);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_87_ = class167.method2681((byte) 1, i_69_, true);
		class707.method14229(class167_87_, 0, 1891997417);
		return class167_87_;
	}

	static void method15851(int i) {
		anInt10321 = 1772781435 * i;
		aClass209_10324.method3773(-1855502505);
	}

	static void method15852(int i, boolean bool) {
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1864598513);
		if (class523_sub1 != null) {
			for (int i_88_ = 0; i_88_ < class523_sub1.itemIds.length; i_88_++) {
				class523_sub1.itemIds[i_88_] = -1;
				class523_sub1.itemAmounts[i_88_] = 0;
			}
			class523_sub1.aClass4Array10322 = null;
		}
	}

	static final void method15853(Class669 class669, int i) {
		/* empty */
	}
}
