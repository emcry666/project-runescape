/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class623 {
	public static final int anInt8092 = 4;
	public static final int anInt8093 = 1073741824;
	int[] anIntArray8094;
	public static final int anInt8095 = 10;
	public static final int anInt8096 = 10;
	int anInt8097;
	long aLong8098;
	static int[] anIntArray8099 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	public static final int anInt8100 = 4;
	Class2[] aClass2Array8101;
	public int[] anIntArray8102;
	public int[] anIntArray8103;
	public boolean aBool8104;
	static final int anInt8105 = 1073741823;
	public int anInt8106 = 1377794931;
	long aLong8107;
	public static final int anInt8108 = -2147483648;
	static Class209 aClass209_8109 = new Class209(260);
	static Class209 aClass209_8110 = new Class209(5);

	public void method10169(int i, int i_0_, Class53_Sub8 class53_sub8) {
		if (i_0_ == -1)
			anIntArray8094[i] = 0;
		else if (class53_sub8.getDefinition(i_0_, (byte) 43) != null) {
			anIntArray8094[i] = i_0_ | 0x40000000;
			method10175(1575264401);
		}
	}

	void method10170() {
		long[] ls = Class523_Sub34.aLongArray10662;
		aLong8098 = 6698481334751897471L;
		aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (-390190489 * anInt8097 >> 8)) & 0xffL)]));
		aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (-390190489 * anInt8097)) & 0xffL)]));
		for (int i = 0; i < anIntArray8094.length; i++) {
			aLong8098 = (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (anIntArray8094[i] >> 24)) & 0xffL)]) * -6698481334751897471L;
			aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (anIntArray8094[i] >> 16)) & 0xffL)]));
			aLong8098 = (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (anIntArray8094[i] >> 8)) & 0xffL)]) * -6698481334751897471L;
			aLong8098 = (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8094[i]) & 0xffL)]) * -6698481334751897471L;
		}
		if (null != aClass2Array8101) {
			for (int i = 0; i < aClass2Array8101.length; i++) {
				if (null != aClass2Array8101[i]) {
					int[] is;
					int[] is_1_;
					if (aBool8104) {
						is = aClass2Array8101[i].anIntArray22;
						is_1_ = aClass2Array8101[i].anIntArray20;
					} else {
						is = aClass2Array8101[i].anIntArray21;
						is_1_ = aClass2Array8101[i].anIntArray23;
					}
					if (is != null) {
						for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
							aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (is[i_2_] >> 8)) & 0xffL)]));
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) is[i_2_]) & 0xffL)]));
						}
					}
					if (is_1_ != null) {
						for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++) {
							aLong8098 = ((aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (is_1_[i_3_] >> 8)) & 0xffL)]) * -6698481334751897471L);
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) is_1_[i_3_]) & 0xffL)]));
						}
					}
					if (null != aClass2Array8101[i].aShortArray25) {
						for (int i_4_ = 0; i_4_ < aClass2Array8101[i].aShortArray25.length; i_4_++) {
							aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((-1888504072262064255L * aLong8098) ^ (long) ((aClass2Array8101[i].aShortArray25[i_4_]) >> 8)) & 0xffL)]));
							aLong8098 = ((aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (aClass2Array8101[i].aShortArray25[i_4_])) & 0xffL)]) * -6698481334751897471L);
						}
					}
					if (null != aClass2Array8101[i].aShortArray26) {
						for (int i_5_ = 0; i_5_ < aClass2Array8101[i].aShortArray26.length; i_5_++) {
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) ((aClass2Array8101[i].aShortArray26[i_5_]) >> 8)) & 0xffL)]));
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (aClass2Array8101[i].aShortArray26[i_5_])) & 0xffL)]));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8102[i]) & 0xffL)]));
		for (int i = 0; i < 10; i++)
			aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8103[i]) & 0xffL)]));
		aLong8098 = (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (aBool8104 ? 1 : 0)) & 0xffL)]) * -6698481334751897471L;
	}

	public void method10171(int i, int i_6_, byte i_7_) {
		anIntArray8103[i] = i_6_;
		method10175(1041867428);
	}

	public void method10172(int i, int i_8_, byte i_9_) {
		anIntArray8102[i] = i_8_;
		method10175(2081726803);
	}

	public void method10173(boolean bool, int i) {
		aBool8104 = bool;
		method10175(1275914128);
	}

	public void method10174(int i, int[] is, Class2[] class2s, int[] is_10_, int[] is_11_, boolean bool, int i_12_, int i_13_) {
		if (i != anInt8097 * -390190489)
			anInt8097 = i * 1698910551;
		anIntArray8094 = is;
		aClass2Array8101 = class2s;
		anIntArray8102 = is_10_;
		anIntArray8103 = is_11_;
		aBool8104 = bool;
		anInt8106 = i_12_ * -1377794931;
		method10175(1817670018);
	}

	void method10175(int i) {
		long[] ls = Class523_Sub34.aLongArray10662;
		aLong8098 = 6698481334751897471L;
		aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (-390190489 * anInt8097 >> 8)) & 0xffL)]));
		aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (-390190489 * anInt8097)) & 0xffL)]));
		for (int i_14_ = 0; i_14_ < anIntArray8094.length; i_14_++) {
			aLong8098 = (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (anIntArray8094[i_14_] >> 24)) & 0xffL)]) * -6698481334751897471L;
			aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (anIntArray8094[i_14_] >> 16)) & 0xffL)]));
			aLong8098 = (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (anIntArray8094[i_14_] >> 8)) & 0xffL)]) * -6698481334751897471L;
			aLong8098 = (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8094[i_14_]) & 0xffL)]) * -6698481334751897471L;
		}
		if (null != aClass2Array8101) {
			for (int i_15_ = 0; i_15_ < aClass2Array8101.length; i_15_++) {
				if (null != aClass2Array8101[i_15_]) {
					int[] is;
					int[] is_16_;
					if (aBool8104) {
						is = aClass2Array8101[i_15_].anIntArray22;
						is_16_ = aClass2Array8101[i_15_].anIntArray20;
					} else {
						is = aClass2Array8101[i_15_].anIntArray21;
						is_16_ = aClass2Array8101[i_15_].anIntArray23;
					}
					if (is != null) {
						for (int i_17_ = 0; i_17_ < is.length; i_17_++) {
							aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (is[i_17_] >> 8)) & 0xffL)]));
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) is[i_17_]) & 0xffL)]));
						}
					}
					if (is_16_ != null) {
						for (int i_18_ = 0; i_18_ < is_16_.length; i_18_++) {
							aLong8098 = ((aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (is_16_[i_18_] >> 8)) & 0xffL)]) * -6698481334751897471L);
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) is_16_[i_18_]) & 0xffL)]));
						}
					}
					if (null != aClass2Array8101[i_15_].aShortArray25) {
						for (int i_19_ = 0; (i_19_ < aClass2Array8101[i_15_].aShortArray25.length); i_19_++) {
							aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((-1888504072262064255L * aLong8098) ^ (long) ((aClass2Array8101[i_15_].aShortArray25[i_19_]) >> 8)) & 0xffL)]));
							aLong8098 = ((aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (aClass2Array8101[i_15_].aShortArray25[i_19_])) & 0xffL)]) * -6698481334751897471L);
						}
					}
					if (null != aClass2Array8101[i_15_].aShortArray26) {
						for (int i_20_ = 0; (i_20_ < aClass2Array8101[i_15_].aShortArray26.length); i_20_++) {
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) ((aClass2Array8101[i_15_].aShortArray26[i_20_]) >> 8)) & 0xffL)]));
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (aClass2Array8101[i_15_].aShortArray26[i_20_])) & 0xffL)]));
						}
					}
				}
			}
		}
		for (int i_21_ = 0; i_21_ < 10; i_21_++)
			aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8102[i_21_]) & 0xffL)]));
		for (int i_22_ = 0; i_22_ < 10; i_22_++)
			aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8103[i_22_]) & 0xffL)]));
		aLong8098 = (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (aBool8104 ? 1 : 0)) & 0xffL)]) * -6698481334751897471L;
	}

	public Class167 method10176(Class178 class178, int i, Class53_Sub17 class53_sub17, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707, Class707 class707_23_, Class707[] class707s, int[] is, int i_24_, boolean bool, BodyDefinitions class630, int i_25_) {
		if (-1 != -1137516987 * anInt8106)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) -84)).method5493(class178, i, class53_sub17, interface19, interface17, class707, class707_23_, class707s, is, i_24_, null, (byte) -123));
		int i_26_ = i;
		long l = aLong8098 * -1888504072262064255L;
		int[] is_27_ = anIntArray8094;
		boolean bool_28_ = false;
		boolean bool_29_ = false;
		if (null != class707) {
			AnimationDefinitions class205 = class707.method14203(708387695);
			if (null != class205 && (-1421451731 * class205.anInt2226 >= 0 || 746156899 * class205.anInt2219 >= 0)) {
				is_27_ = new int[anIntArray8094.length];
				for (int i_30_ = 0; i_30_ < is_27_.length; i_30_++)
					is_27_[i_30_] = anIntArray8094[i_30_];
				if (-1421451731 * class205.anInt2226 >= 0 && -1 != 1840849895 * class630.anInt8234) {
					bool_28_ = true;
					if (class205.anInt2226 * -1421451731 == 65535) {
						is_27_[1840849895 * class630.anInt8234] = 0;
						for (int i_31_ = 0; i_31_ < class630.anIntArray8236.length; i_31_++)
							is_27_[class630.anIntArray8236[i_31_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_27_[class630.anInt8234 * 1840849895] = -1421451731 * class205.anInt2226 | 0x40000000;
						for (int i_32_ = 0; i_32_ < class630.anIntArray8236.length; i_32_++)
							is_27_[class630.anIntArray8236[i_32_]] = 0;
						l ^= ((long) is_27_[1840849895 * class630.anInt8234] << 32);
					}
				}
				if (class205.anInt2219 * 746156899 >= 0 && -1 != 384712765 * class630.anInt8235) {
					bool_29_ = true;
					if (746156899 * class205.anInt2219 == 65535) {
						is_27_[384712765 * class630.anInt8235] = 0;
						for (int i_33_ = 0; i_33_ < class630.anIntArray8237.length; i_33_++)
							is_27_[class630.anIntArray8237[i_33_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_27_[class630.anInt8235 * 384712765] = class205.anInt2219 * 746156899 | 0x40000000;
						for (int i_34_ = 0; i_34_ < class630.anIntArray8237.length; i_34_++)
							is_27_[class630.anIntArray8237[i_34_]] = 0;
						l ^= (long) is_27_[class630.anInt8235 * 384712765];
					}
				}
			}
		}
		boolean bool_35_ = false;
		int i_36_ = class707s != null ? class707s.length : 0;
		for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
			if (class707s[i_37_] != null) {
				i_26_ |= class707s[i_37_].method14173(1768692538);
				bool_35_ = true;
			}
		}
		if (class707 != null) {
			i_26_ |= class707.method14173(-238906249);
			bool_35_ = true;
		}
		if (null != class707_23_) {
			i_26_ |= class707_23_.method14173(508510971);
			bool_35_ = true;
		}
		boolean bool_38_ = false;
		if (null != is) {
			for (int i_39_ = 0; i_39_ < is.length; i_39_++) {
				if (is[i_39_] != -1) {
					i_26_ |= 0x20;
					bool_38_ = true;
				}
			}
		}
		Class167 class167;
		synchronized (aClass209_8109) {
			class167 = (Class167) aClass209_8109.method3767(l);
		}
		Class588 class588 = null;
		if (anInt8097 * -390190489 != -1)
			class588 = (Class588) class53_sub17.getDefinition(anInt8097 * -390190489, (byte) 12);
		if (class167 == null || class178.method3068(class167.method2683(), i_26_) != 0) {
			if (class167 != null)
				i_26_ = class178.method3117(i_26_, class167.method2683());
			int i_40_ = i_26_;
			boolean bool_41_ = false;
			for (int i_42_ = 0; i_42_ < is_27_.length; i_42_++) {
				int i_43_ = is_27_[i_42_];
				Class2 class2 = null;
				boolean bool_44_ = false;
				if (bool_28_) {
					if (i_42_ == 1840849895 * class630.anInt8234)
						bool_44_ = true;
					else {
						for (int i_45_ = 0; i_45_ < class630.anIntArray8236.length; i_45_++) {
							if (class630.anIntArray8236[i_45_] == i_42_) {
								bool_44_ = true;
								break;
							}
						}
					}
				}
				if (bool_29_) {
					if (384712765 * class630.anInt8235 == i_42_)
						bool_44_ = true;
					else {
						for (int i_46_ = 0; i_46_ < class630.anIntArray8237.length; i_46_++) {
							if (i_42_ == class630.anIntArray8237[i_46_]) {
								bool_44_ = true;
								break;
							}
						}
					}
				}
				if (0 != (i_43_ & 0x40000000)) {
					if (!bool_44_ && null != aClass2Array8101 && null != aClass2Array8101[i_42_])
						class2 = aClass2Array8101[i_42_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_43_ & 0x3fffffff, (byte) 13)).method665(aBool8104, class2, 2134976208))
						bool_41_ = true;
				} else if ((i_43_ & ~0x7fffffff) != 0 && !((Class310) class53_sub6.getDefinition(i_43_ & 0x3fffffff, (byte) 84)).method5620((byte) -127))
					bool_41_ = true;
			}
			if (bool_41_) {
				if (aLong8107 * -3678607966196254163L != -1L) {
					synchronized (aClass209_8109) {
						class167 = ((Class167) aClass209_8109.method3767(-3678607966196254163L * aLong8107));
					}
				}
				if (null == class167 || class178.method3068(class167.method2683(), i_26_) != 0)
					return null;
			} else {
				Class179[] class179s = new Class179[is_27_.length];
				for (int i_47_ = 0; i_47_ < is_27_.length; i_47_++) {
					int i_48_ = is_27_[i_47_];
					Class2 class2 = null;
					boolean bool_49_ = 5 == i_47_ && bool_28_ || 3 == i_47_ && bool_29_;
					if (0 != (i_48_ & 0x40000000)) {
						if (!bool_49_ && aClass2Array8101 != null && aClass2Array8101[i_47_] != null)
							class2 = aClass2Array8101[i_47_];
						Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_48_ & 0x3fffffff, (byte) -68)).method682(aBool8104, class2, 338331096);
						if (class179 != null)
							class179s[i_47_] = class179;
					} else if ((i_48_ & ~0x7fffffff) != 0) {
						Class179 class179 = ((Class310) class53_sub6.getDefinition(i_48_ & 0x3fffffff, (byte) 91)).method5621((byte) 90);
						if (null != class179)
							class179s[i_47_] = class179;
					}
				}
				if (null != class588 && null != class588.anIntArrayArray7776) {
					for (int i_50_ = 0; i_50_ < class588.anIntArrayArray7776.length; i_50_++) {
						if (null != class179s[i_50_]) {
							int i_51_ = 0;
							int i_52_ = 0;
							int i_53_ = 0;
							int i_54_ = 0;
							int i_55_ = 0;
							int i_56_ = 0;
							if (class588.anIntArrayArray7776[i_50_] != null) {
								i_51_ = class588.anIntArrayArray7776[i_50_][0];
								i_52_ = class588.anIntArrayArray7776[i_50_][1];
								i_53_ = class588.anIntArrayArray7776[i_50_][2];
								i_54_ = (class588.anIntArrayArray7776[i_50_][3] << 3);
								i_55_ = (class588.anIntArrayArray7776[i_50_][4] << 3);
								i_56_ = (class588.anIntArrayArray7776[i_50_][5] << 3);
							}
							if (0 != i_54_ || 0 != i_55_ || 0 != i_56_)
								class179s[i_50_].method3493(i_54_, i_55_, i_56_);
							if (i_51_ != 0 || 0 != i_52_ || i_53_ != 0)
								class179s[i_50_].method3492(i_51_, i_52_, i_53_);
						}
					}
				}
				Class179 class179 = new Class179(class179s, class179s.length);
				i_40_ |= 0x4000;
				class167 = class178.method3115(class179, i_40_, 137954583 * Class379.anInt3933, 64, 850);
				for (int i_57_ = 0; i_57_ < 10; i_57_++) {
					for (int i_58_ = 0; i_58_ < Class150.aShortArrayArray1725[i_57_].length; i_58_++) {
						if (anIntArray8102[i_57_] < (Class207.aShortArrayArrayArray2248[i_57_][i_58_]).length)
							class167.method2725((Class150.aShortArrayArray1725[i_57_][i_58_]), (Class207.aShortArrayArrayArray2248[i_57_][i_58_][anIntArray8102[i_57_]]));
					}
				}
				for (int i_59_ = 0; i_59_ < 10; i_59_++) {
					for (int i_60_ = 0; i_60_ < Class546.aShortArrayArray7302[i_59_].length; i_60_++) {
						if (anIntArray8103[i_59_] < (Class21.aShortArrayArrayArray214[i_59_][i_60_]).length)
							class167.method2826((Class546.aShortArrayArray7302[i_59_][i_60_]), (Class21.aShortArrayArrayArray214[i_59_][i_60_][anIntArray8103[i_59_]]));
					}
				}
				class167.method2719();
				if (bool) {
					class167.method2769(i_26_);
					synchronized (aClass209_8109) {
						aClass209_8109.method3770(class167, l);
					}
					aLong8107 = 6329078030773724581L * l;
				}
			}
		}
		Class167 class167_61_ = class167.method2681((byte) 4, i_26_, true);
		if (!bool_35_ && !bool_38_)
			return class167_61_;
		Class435[] class435s = null;
		if (class588 != null)
			class435s = class588.method9724(-2142898460);
		if (bool_38_ && null != class435s) {
			for (int i_62_ = 0; i_62_ < is.length; i_62_++) {
				if (class435s[i_62_] != null)
					class167_61_.method2707(class435s[i_62_], 1 << i_62_, true);
			}
		}
		int i_63_ = 0;
		int i_64_ = 1;
		while (i_63_ < i_36_) {
			if (null != class707s[i_63_])
				class707s[i_63_].method14175(class167_61_, 0, i_64_, (short) 8448);
			i_63_++;
			i_64_ <<= 1;
		}
		if (bool_38_) {
			for (i_63_ = 0; i_63_ < is.length; i_63_++) {
				if (-1 != is[i_63_]) {
					i_64_ = is[i_63_] - i_24_;
					i_64_ &= 0x3fff;
					Class435 class435 = new Class435();
					class435.method6855(0.0F, 1.0F, 0.0F, Class433.method6799(i_64_));
					class167_61_.method2707(class435, 1 << i_63_, false);
				}
			}
		}
		if (bool_38_ && null != class435s) {
			for (i_63_ = 0; i_63_ < is.length; i_63_++) {
				if (class435s[i_63_] != null)
					class167_61_.method2707(class435s[i_63_], 1 << i_63_, false);
			}
		}
		if (class707 != null && null != class707_23_)
			BodyDefinitions.method10329(class167_61_, class707, class707_23_, (byte) -95);
		else if (class707 != null)
			class707.method14229(class167_61_, 0, 1851744427);
		else if (class707_23_ != null)
			class707_23_.method14229(class167_61_, 0, 1997287157);
		return class167_61_;
	}

	public Class167 method10177(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) 86)).method5483(class178, i, interface19, interface17, class707, null, 2092643273));
		int i_65_ = class707 != null ? i | class707.method14173(-993005054) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_65_) != 0) {
			if (null != class167)
				i_65_ = class178.method3117(i_65_, class167.method2683());
			int i_66_ = i_65_;
			boolean bool = false;
			for (int i_67_ = 0; i_67_ < anIntArray8094.length; i_67_++) {
				int i_68_ = anIntArray8094[i_67_];
				Class2 class2 = null;
				if ((i_68_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_67_] != null)
						class2 = aClass2Array8101[i_67_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_68_ & 0x3fffffff, (byte) 74)).method667(aBool8104, class2, (byte) 22))
						bool = true;
				} else if (0 != (i_68_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_68_ & 0x3fffffff, (byte) 17)).method5622(1100518917))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_69_ = 0;
			for (int i_70_ = 0; i_70_ < anIntArray8094.length; i_70_++) {
				int i_71_ = anIntArray8094[i_70_];
				Class2 class2 = null;
				if (0 != (i_71_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_70_] != null)
						class2 = aClass2Array8101[i_70_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_71_ & 0x3fffffff, (byte) 11)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_69_++] = class179;
				} else if (0 != (i_71_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_71_ & 0x3fffffff, (byte) 24)).method5629((byte) 10);
					if (class179 != null)
						class179s[i_69_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_69_);
			i_66_ |= 0x4000;
			class167 = class178.method3115(class179, i_66_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_72_ = 0; i_72_ < 10; i_72_++) {
				for (int i_73_ = 0; i_73_ < Class150.aShortArrayArray1725[i_72_].length; i_73_++) {
					if (anIntArray8102[i_72_] < (Class207.aShortArrayArrayArray2248[i_72_][i_73_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_72_][i_73_]), (Class207.aShortArrayArrayArray2248[i_72_][i_73_][anIntArray8102[i_72_]]));
				}
			}
			for (int i_74_ = 0; i_74_ < 10; i_74_++) {
				for (int i_75_ = 0; i_75_ < Class546.aShortArrayArray7302[i_74_].length; i_75_++) {
					if (anIntArray8103[i_74_] < (Class21.aShortArrayArrayArray214[i_74_][i_75_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_74_][i_75_]), (Class21.aShortArrayArrayArray214[i_74_][i_75_][anIntArray8103[i_74_]]));
				}
			}
			class167.method2769(i_65_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_76_ = class167.method2681((byte) 4, i_65_, true);
		class707.method14229(class167_76_, 0, 1899569775);
		return class167_76_;
	}

	public Class167 method10178(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub13 class53_sub13, Class707 class707, int i_77_, int i_78_, int i_79_, int i_80_) {
		int i_81_ = class707 != null ? i | class707.method14173(-1428568440) : i;
		long l = (long) i_79_ << 32 | (long) (i_78_ << 16) | (long) i_77_;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = (Class167) aClass209_8110.method3767(l);
		}
		if (null == class167 || class178.method3068(class167.method2683(), i_81_) != 0) {
			if (class167 != null)
				i_81_ = class178.method3117(i_81_, class167.method2683());
			int i_82_ = i_81_;
			Class179[] class179s = new Class179[3];
			int i_83_ = 0;
			if (((Class310) class53_sub6.getDefinition(i_77_, (byte) -32)).method5622(465881038) && ((Class310) class53_sub6.getDefinition(i_78_, (byte) -91)).method5622(1535390510) && ((Class310) class53_sub6.getDefinition(i_79_, (byte) -75)).method5622(-144088374)) {
				Class179 class179 = ((Class310) class53_sub6.getDefinition(i_77_, (byte) -22)).method5629((byte) -100);
				if (class179 != null)
					class179s[i_83_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_78_, (byte) 88)).method5629((byte) -71);
				if (null != class179)
					class179s[i_83_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_79_, (byte) 91)).method5629((byte) -13);
				if (null != class179)
					class179s[i_83_++] = class179;
				class179 = new Class179(class179s, i_83_);
				i_82_ |= 0x4000;
				class167 = class178.method3115(class179, i_82_, 137954583 * Class379.anInt3933, 64, 768);
				for (int i_84_ = 0; i_84_ < 10; i_84_++) {
					for (int i_85_ = 0; i_85_ < Class150.aShortArrayArray1725[i_84_].length; i_85_++) {
						if (anIntArray8102[i_84_] < (Class207.aShortArrayArrayArray2248[i_84_][i_85_]).length)
							class167.method2725((Class150.aShortArrayArray1725[i_84_][i_85_]), (Class207.aShortArrayArrayArray2248[i_84_][i_85_][anIntArray8102[i_84_]]));
					}
				}
				for (int i_86_ = 0; i_86_ < 10; i_86_++) {
					for (int i_87_ = 0; i_87_ < Class546.aShortArrayArray7302[i_86_].length; i_87_++) {
						if (anIntArray8103[i_86_] < (Class21.aShortArrayArrayArray214[i_86_][i_87_]).length)
							class167.method2826((Class546.aShortArrayArray7302[i_86_][i_87_]), (Class21.aShortArrayArrayArray214[i_86_][i_87_][anIntArray8103[i_86_]]));
					}
				}
				class167.method2769(i_81_);
				synchronized (aClass209_8110) {
					aClass209_8110.method3770(class167, l);
				}
			} else
				return null;
		}
		if (class707 == null)
			return class167;
		class167 = class167.method2681((byte) 4, i_81_, true);
		class707.method14229(class167, 0, 2034366894);
		return class167;
	}

	public void method10179(int i, int[] is, Class2[] class2s, int[] is_88_, int[] is_89_, boolean bool, int i_90_) {
		if (i != anInt8097 * -390190489)
			anInt8097 = i * 1698910551;
		anIntArray8094 = is;
		aClass2Array8101 = class2s;
		anIntArray8102 = is_88_;
		anIntArray8103 = is_89_;
		aBool8104 = bool;
		anInt8106 = i_90_ * -1377794931;
		method10175(1558598850);
	}

	public void method10180(int i, int[] is, Class2[] class2s, int[] is_91_, int[] is_92_, boolean bool, int i_93_) {
		if (i != anInt8097 * -390190489)
			anInt8097 = i * 1698910551;
		anIntArray8094 = is;
		aClass2Array8101 = class2s;
		anIntArray8102 = is_91_;
		anIntArray8103 = is_92_;
		aBool8104 = bool;
		anInt8106 = i_93_ * -1377794931;
		method10175(1975466836);
	}

	public void method10181(int i, int[] is, Class2[] class2s, int[] is_94_, int[] is_95_, boolean bool, int i_96_) {
		if (i != anInt8097 * -390190489)
			anInt8097 = i * 1698910551;
		anIntArray8094 = is;
		aClass2Array8101 = class2s;
		anIntArray8102 = is_94_;
		anIntArray8103 = is_95_;
		aBool8104 = bool;
		anInt8106 = i_96_ * -1377794931;
		method10175(1522520636);
	}

	public void method10182(int i, int i_97_, Class53_Sub6 class53_sub6) {
		int i_98_ = anIntArray8099[i];
		if (class53_sub6.getDefinition(i_97_, (byte) 48) != null) {
			anIntArray8094[i_98_] = i_97_ | ~0x7fffffff;
			method10175(1105524113);
		}
	}

	public void method10183(int i, int i_99_, Class53_Sub6 class53_sub6) {
		int i_100_ = anIntArray8099[i];
		if (class53_sub6.getDefinition(i_99_, (byte) -17) != null) {
			anIntArray8094[i_100_] = i_99_ | ~0x7fffffff;
			method10175(2114215433);
		}
	}

	public Class167 method10184(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707, byte i_101_) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) -53)).method5483(class178, i, interface19, interface17, class707, null, 2132576755));
		int i_102_ = class707 != null ? i | class707.method14173(2084550119) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_102_) != 0) {
			if (null != class167)
				i_102_ = class178.method3117(i_102_, class167.method2683());
			int i_103_ = i_102_;
			boolean bool = false;
			for (int i_104_ = 0; i_104_ < anIntArray8094.length; i_104_++) {
				int i_105_ = anIntArray8094[i_104_];
				Class2 class2 = null;
				if ((i_105_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_104_] != null)
						class2 = aClass2Array8101[i_104_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_105_ & 0x3fffffff, (byte) 71)).method667(aBool8104, class2, (byte) 19))
						bool = true;
				} else if (0 != (i_105_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_105_ & 0x3fffffff, (byte) -29)).method5622(1366703767))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_106_ = 0;
			for (int i_107_ = 0; i_107_ < anIntArray8094.length; i_107_++) {
				int i_108_ = anIntArray8094[i_107_];
				Class2 class2 = null;
				if (0 != (i_108_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_107_] != null)
						class2 = aClass2Array8101[i_107_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_108_ & 0x3fffffff, (byte) -25)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_106_++] = class179;
				} else if (0 != (i_108_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_108_ & 0x3fffffff, (byte) -110)).method5629((byte) -84);
					if (class179 != null)
						class179s[i_106_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_106_);
			i_103_ |= 0x4000;
			class167 = class178.method3115(class179, i_103_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_109_ = 0; i_109_ < 10; i_109_++) {
				for (int i_110_ = 0; i_110_ < Class150.aShortArrayArray1725[i_109_].length; i_110_++) {
					if (anIntArray8102[i_109_] < (Class207.aShortArrayArrayArray2248[i_109_][i_110_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_109_][i_110_]), (Class207.aShortArrayArrayArray2248[i_109_][i_110_][anIntArray8102[i_109_]]));
				}
			}
			for (int i_111_ = 0; i_111_ < 10; i_111_++) {
				for (int i_112_ = 0; i_112_ < Class546.aShortArrayArray7302[i_111_].length; i_112_++) {
					if (anIntArray8103[i_111_] < (Class21.aShortArrayArrayArray214[i_111_][i_112_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_111_][i_112_]), (Class21.aShortArrayArrayArray214[i_111_][i_112_][anIntArray8103[i_111_]]));
				}
			}
			class167.method2769(i_102_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_113_ = class167.method2681((byte) 4, i_102_, true);
		class707.method14229(class167_113_, 0, 1858102014);
		return class167_113_;
	}

	public void method10185(int i, int i_114_) {
		anIntArray8102[i] = i_114_;
		method10175(1862841832);
	}

	void method10186() {
		long[] ls = Class523_Sub34.aLongArray10662;
		aLong8098 = 6698481334751897471L;
		aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (-390190489 * anInt8097 >> 8)) & 0xffL)]));
		aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (-390190489 * anInt8097)) & 0xffL)]));
		for (int i = 0; i < anIntArray8094.length; i++) {
			aLong8098 = (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (anIntArray8094[i] >> 24)) & 0xffL)]) * -6698481334751897471L;
			aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (anIntArray8094[i] >> 16)) & 0xffL)]));
			aLong8098 = (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) (anIntArray8094[i] >> 8)) & 0xffL)]) * -6698481334751897471L;
			aLong8098 = (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8094[i]) & 0xffL)]) * -6698481334751897471L;
		}
		if (null != aClass2Array8101) {
			for (int i = 0; i < aClass2Array8101.length; i++) {
				if (null != aClass2Array8101[i]) {
					int[] is;
					int[] is_115_;
					if (aBool8104) {
						is = aClass2Array8101[i].anIntArray22;
						is_115_ = aClass2Array8101[i].anIntArray20;
					} else {
						is = aClass2Array8101[i].anIntArray21;
						is_115_ = aClass2Array8101[i].anIntArray23;
					}
					if (is != null) {
						for (int i_116_ = 0; i_116_ < is.length; i_116_++) {
							aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (is[i_116_] >> 8)) & 0xffL)]));
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) is[i_116_]) & 0xffL)]));
						}
					}
					if (is_115_ != null) {
						for (int i_117_ = 0; i_117_ < is_115_.length; i_117_++) {
							aLong8098 = ((aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (is_115_[i_117_] >> 8)) & 0xffL)]) * -6698481334751897471L);
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) is_115_[i_117_]) & 0xffL)]));
						}
					}
					if (null != aClass2Array8101[i].aShortArray25) {
						for (int i_118_ = 0; i_118_ < aClass2Array8101[i].aShortArray25.length; i_118_++) {
							aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((-1888504072262064255L * aLong8098) ^ (long) ((aClass2Array8101[i].aShortArray25[i_118_]) >> 8)) & 0xffL)]));
							aLong8098 = ((aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (aClass2Array8101[i].aShortArray25[i_118_])) & 0xffL)]) * -6698481334751897471L);
						}
					}
					if (null != aClass2Array8101[i].aShortArray26) {
						for (int i_119_ = 0; i_119_ < aClass2Array8101[i].aShortArray26.length; i_119_++) {
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) ((aClass2Array8101[i].aShortArray26[i_119_]) >> 8)) & 0xffL)]));
							aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) (((aLong8098 * -1888504072262064255L) ^ (long) (aClass2Array8101[i].aShortArray26[i_119_])) & 0xffL)]));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			aLong8098 = (-6698481334751897471L * (aLong8098 * -1888504072262064255L >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8102[i]) & 0xffL)]));
		for (int i = 0; i < 10; i++)
			aLong8098 = (-6698481334751897471L * (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((aLong8098 * -1888504072262064255L ^ (long) anIntArray8103[i]) & 0xffL)]));
		aLong8098 = (-1888504072262064255L * aLong8098 >>> 8 ^ ls[(int) ((-1888504072262064255L * aLong8098 ^ (long) (aBool8104 ? 1 : 0)) & 0xffL)]) * -6698481334751897471L;
	}

	public void method10187(int i, int i_120_) {
		anIntArray8103[i] = i_120_;
		method10175(1303640232);
	}

	public void method10188(int i, int i_121_, Class53_Sub8 class53_sub8, int i_122_) {
		if (i_121_ == -1)
			anIntArray8094[i] = 0;
		else if (class53_sub8.getDefinition(i_121_, (byte) -5) != null) {
			anIntArray8094[i] = i_121_ | 0x40000000;
			method10175(1377235543);
		}
	}

	public void method10189(int i, int i_123_, Class53_Sub8 class53_sub8) {
		if (i_123_ == -1)
			anIntArray8094[i] = 0;
		else if (class53_sub8.getDefinition(i_123_, (byte) 64) != null) {
			anIntArray8094[i] = i_123_ | 0x40000000;
			method10175(1751342657);
		}
	}

	public void method10190(int i, int i_124_, Class53_Sub8 class53_sub8) {
		if (i_124_ == -1)
			anIntArray8094[i] = 0;
		else if (class53_sub8.getDefinition(i_124_, (byte) 93) != null) {
			anIntArray8094[i] = i_124_ | 0x40000000;
			method10175(916087401);
		}
	}

	public void method10191(int i, int i_125_) {
		anIntArray8102[i] = i_125_;
		method10175(921590033);
	}

	public static void method10192(int i) {
		Class379.anInt3933 = i * 378045095;
		synchronized (aClass209_8110) {
			aClass209_8110.method3773(-1916410869);
		}
		synchronized (aClass209_8109) {
			aClass209_8109.method3773(-2016040134);
		}
	}

	public void method10193(int i, int i_126_, Class53_Sub8 class53_sub8) {
		if (i_126_ == -1)
			anIntArray8094[i] = 0;
		else if (class53_sub8.getDefinition(i_126_, (byte) 53) != null) {
			anIntArray8094[i] = i_126_ | 0x40000000;
			method10175(969063962);
		}
	}

	public Class167 method10194(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) 25)).method5483(class178, i, interface19, interface17, class707, null, 2102259541));
		int i_127_ = class707 != null ? i | class707.method14173(239316304) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_127_) != 0) {
			if (null != class167)
				i_127_ = class178.method3117(i_127_, class167.method2683());
			int i_128_ = i_127_;
			boolean bool = false;
			for (int i_129_ = 0; i_129_ < anIntArray8094.length; i_129_++) {
				int i_130_ = anIntArray8094[i_129_];
				Class2 class2 = null;
				if ((i_130_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_129_] != null)
						class2 = aClass2Array8101[i_129_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_130_ & 0x3fffffff, (byte) -1)).method667(aBool8104, class2, (byte) -38))
						bool = true;
				} else if (0 != (i_130_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_130_ & 0x3fffffff, (byte) -16)).method5622(1054847872))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_131_ = 0;
			for (int i_132_ = 0; i_132_ < anIntArray8094.length; i_132_++) {
				int i_133_ = anIntArray8094[i_132_];
				Class2 class2 = null;
				if (0 != (i_133_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_132_] != null)
						class2 = aClass2Array8101[i_132_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_133_ & 0x3fffffff, (byte) -18)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_131_++] = class179;
				} else if (0 != (i_133_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_133_ & 0x3fffffff, (byte) -12)).method5629((byte) -122);
					if (class179 != null)
						class179s[i_131_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_131_);
			i_128_ |= 0x4000;
			class167 = class178.method3115(class179, i_128_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_134_ = 0; i_134_ < 10; i_134_++) {
				for (int i_135_ = 0; i_135_ < Class150.aShortArrayArray1725[i_134_].length; i_135_++) {
					if (anIntArray8102[i_134_] < (Class207.aShortArrayArrayArray2248[i_134_][i_135_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_134_][i_135_]), (Class207.aShortArrayArrayArray2248[i_134_][i_135_][anIntArray8102[i_134_]]));
				}
			}
			for (int i_136_ = 0; i_136_ < 10; i_136_++) {
				for (int i_137_ = 0; i_137_ < Class546.aShortArrayArray7302[i_136_].length; i_137_++) {
					if (anIntArray8103[i_136_] < (Class21.aShortArrayArrayArray214[i_136_][i_137_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_136_][i_137_]), (Class21.aShortArrayArrayArray214[i_136_][i_137_][anIntArray8103[i_136_]]));
				}
			}
			class167.method2769(i_127_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_138_ = class167.method2681((byte) 4, i_127_, true);
		class707.method14229(class167_138_, 0, 2041907083);
		return class167_138_;
	}

	public Class167 method10195(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) 5)).method5483(class178, i, interface19, interface17, class707, null, 2078574700));
		int i_139_ = class707 != null ? i | class707.method14173(456999269) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_139_) != 0) {
			if (null != class167)
				i_139_ = class178.method3117(i_139_, class167.method2683());
			int i_140_ = i_139_;
			boolean bool = false;
			for (int i_141_ = 0; i_141_ < anIntArray8094.length; i_141_++) {
				int i_142_ = anIntArray8094[i_141_];
				Class2 class2 = null;
				if ((i_142_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_141_] != null)
						class2 = aClass2Array8101[i_141_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_142_ & 0x3fffffff, (byte) 80)).method667(aBool8104, class2, (byte) 22))
						bool = true;
				} else if (0 != (i_142_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_142_ & 0x3fffffff, (byte) -48)).method5622(1328122915))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_143_ = 0;
			for (int i_144_ = 0; i_144_ < anIntArray8094.length; i_144_++) {
				int i_145_ = anIntArray8094[i_144_];
				Class2 class2 = null;
				if (0 != (i_145_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_144_] != null)
						class2 = aClass2Array8101[i_144_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_145_ & 0x3fffffff, (byte) -24)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_143_++] = class179;
				} else if (0 != (i_145_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_145_ & 0x3fffffff, (byte) 52)).method5629((byte) -122);
					if (class179 != null)
						class179s[i_143_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_143_);
			i_140_ |= 0x4000;
			class167 = class178.method3115(class179, i_140_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_146_ = 0; i_146_ < 10; i_146_++) {
				for (int i_147_ = 0; i_147_ < Class150.aShortArrayArray1725[i_146_].length; i_147_++) {
					if (anIntArray8102[i_146_] < (Class207.aShortArrayArrayArray2248[i_146_][i_147_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_146_][i_147_]), (Class207.aShortArrayArrayArray2248[i_146_][i_147_][anIntArray8102[i_146_]]));
				}
			}
			for (int i_148_ = 0; i_148_ < 10; i_148_++) {
				for (int i_149_ = 0; i_149_ < Class546.aShortArrayArray7302[i_148_].length; i_149_++) {
					if (anIntArray8103[i_148_] < (Class21.aShortArrayArrayArray214[i_148_][i_149_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_148_][i_149_]), (Class21.aShortArrayArrayArray214[i_148_][i_149_][anIntArray8103[i_148_]]));
				}
			}
			class167.method2769(i_139_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_150_ = class167.method2681((byte) 4, i_139_, true);
		class707.method14229(class167_150_, 0, 1751562607);
		return class167_150_;
	}

	public Class167 method10196(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) -86)).method5483(class178, i, interface19, interface17, class707, null, 2130374395));
		int i_151_ = class707 != null ? i | class707.method14173(-358795687) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_151_) != 0) {
			if (null != class167)
				i_151_ = class178.method3117(i_151_, class167.method2683());
			int i_152_ = i_151_;
			boolean bool = false;
			for (int i_153_ = 0; i_153_ < anIntArray8094.length; i_153_++) {
				int i_154_ = anIntArray8094[i_153_];
				Class2 class2 = null;
				if ((i_154_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_153_] != null)
						class2 = aClass2Array8101[i_153_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_154_ & 0x3fffffff, (byte) 34)).method667(aBool8104, class2, (byte) 0))
						bool = true;
				} else if (0 != (i_154_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_154_ & 0x3fffffff, (byte) 20)).method5622(736316936))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_155_ = 0;
			for (int i_156_ = 0; i_156_ < anIntArray8094.length; i_156_++) {
				int i_157_ = anIntArray8094[i_156_];
				Class2 class2 = null;
				if (0 != (i_157_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_156_] != null)
						class2 = aClass2Array8101[i_156_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_157_ & 0x3fffffff, (byte) 21)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_155_++] = class179;
				} else if (0 != (i_157_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_157_ & 0x3fffffff, (byte) 74)).method5629((byte) -91);
					if (class179 != null)
						class179s[i_155_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_155_);
			i_152_ |= 0x4000;
			class167 = class178.method3115(class179, i_152_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_158_ = 0; i_158_ < 10; i_158_++) {
				for (int i_159_ = 0; i_159_ < Class150.aShortArrayArray1725[i_158_].length; i_159_++) {
					if (anIntArray8102[i_158_] < (Class207.aShortArrayArrayArray2248[i_158_][i_159_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_158_][i_159_]), (Class207.aShortArrayArrayArray2248[i_158_][i_159_][anIntArray8102[i_158_]]));
				}
			}
			for (int i_160_ = 0; i_160_ < 10; i_160_++) {
				for (int i_161_ = 0; i_161_ < Class546.aShortArrayArray7302[i_160_].length; i_161_++) {
					if (anIntArray8103[i_160_] < (Class21.aShortArrayArrayArray214[i_160_][i_161_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_160_][i_161_]), (Class21.aShortArrayArrayArray214[i_160_][i_161_][anIntArray8103[i_160_]]));
				}
			}
			class167.method2769(i_151_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_162_ = class167.method2681((byte) 4, i_151_, true);
		class707.method14229(class167_162_, 0, 1677771133);
		return class167_162_;
	}

	public Class167 method10197(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) -102)).method5483(class178, i, interface19, interface17, class707, null, 2128237370));
		int i_163_ = class707 != null ? i | class707.method14173(1871858341) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_163_) != 0) {
			if (null != class167)
				i_163_ = class178.method3117(i_163_, class167.method2683());
			int i_164_ = i_163_;
			boolean bool = false;
			for (int i_165_ = 0; i_165_ < anIntArray8094.length; i_165_++) {
				int i_166_ = anIntArray8094[i_165_];
				Class2 class2 = null;
				if ((i_166_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_165_] != null)
						class2 = aClass2Array8101[i_165_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_166_ & 0x3fffffff, (byte) 33)).method667(aBool8104, class2, (byte) -33))
						bool = true;
				} else if (0 != (i_166_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_166_ & 0x3fffffff, (byte) 57)).method5622(1280570403))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_167_ = 0;
			for (int i_168_ = 0; i_168_ < anIntArray8094.length; i_168_++) {
				int i_169_ = anIntArray8094[i_168_];
				Class2 class2 = null;
				if (0 != (i_169_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_168_] != null)
						class2 = aClass2Array8101[i_168_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_169_ & 0x3fffffff, (byte) 33)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_167_++] = class179;
				} else if (0 != (i_169_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_169_ & 0x3fffffff, (byte) -47)).method5629((byte) -18);
					if (class179 != null)
						class179s[i_167_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_167_);
			i_164_ |= 0x4000;
			class167 = class178.method3115(class179, i_164_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_170_ = 0; i_170_ < 10; i_170_++) {
				for (int i_171_ = 0; i_171_ < Class150.aShortArrayArray1725[i_170_].length; i_171_++) {
					if (anIntArray8102[i_170_] < (Class207.aShortArrayArrayArray2248[i_170_][i_171_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_170_][i_171_]), (Class207.aShortArrayArrayArray2248[i_170_][i_171_][anIntArray8102[i_170_]]));
				}
			}
			for (int i_172_ = 0; i_172_ < 10; i_172_++) {
				for (int i_173_ = 0; i_173_ < Class546.aShortArrayArray7302[i_172_].length; i_173_++) {
					if (anIntArray8103[i_172_] < (Class21.aShortArrayArrayArray214[i_172_][i_173_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_172_][i_173_]), (Class21.aShortArrayArrayArray214[i_172_][i_173_][anIntArray8103[i_172_]]));
				}
			}
			class167.method2769(i_163_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_174_ = class167.method2681((byte) 4, i_163_, true);
		class707.method14229(class167_174_, 0, 1947593377);
		return class167_174_;
	}

	public void method10198(boolean bool) {
		aBool8104 = bool;
		method10175(1940282261);
	}

	public Class167 method10199(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub7 class53_sub7, Class53_Sub8 class53_sub8, Interface19 interface19, Interface17 interface17, Class707 class707) {
		if (-1 != anInt8106 * -1137516987)
			return (((NPCDefinition) class53_sub7.getDefinition(-1137516987 * anInt8106, (byte) -11)).method5483(class178, i, interface19, interface17, class707, null, 2122213389));
		int i_175_ = class707 != null ? i | class707.method14173(-529622329) : i;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = ((Class167) aClass209_8110.method3767(aLong8098 * -1888504072262064255L));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_175_) != 0) {
			if (null != class167)
				i_175_ = class178.method3117(i_175_, class167.method2683());
			int i_176_ = i_175_;
			boolean bool = false;
			for (int i_177_ = 0; i_177_ < anIntArray8094.length; i_177_++) {
				int i_178_ = anIntArray8094[i_177_];
				Class2 class2 = null;
				if ((i_178_ & 0x40000000) != 0) {
					if (aClass2Array8101 != null && aClass2Array8101[i_177_] != null)
						class2 = aClass2Array8101[i_177_];
					if (!((ItemDefinitions) class53_sub8.getDefinition(i_178_ & 0x3fffffff, (byte) 30)).method667(aBool8104, class2, (byte) -11))
						bool = true;
				} else if (0 != (i_178_ & ~0x7fffffff) && !((Class310) class53_sub6.getDefinition(i_178_ & 0x3fffffff, (byte) 96)).method5622(752572430))
					bool = true;
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[anIntArray8094.length];
			int i_179_ = 0;
			for (int i_180_ = 0; i_180_ < anIntArray8094.length; i_180_++) {
				int i_181_ = anIntArray8094[i_180_];
				Class2 class2 = null;
				if (0 != (i_181_ & 0x40000000)) {
					if (aClass2Array8101 != null && aClass2Array8101[i_180_] != null)
						class2 = aClass2Array8101[i_180_];
					Class179 class179 = ((ItemDefinitions) class53_sub8.getDefinition(i_181_ & 0x3fffffff, (byte) -4)).method687(aBool8104, class2, -654140657);
					if (null != class179)
						class179s[i_179_++] = class179;
				} else if (0 != (i_181_ & ~0x7fffffff)) {
					Class179 class179 = ((Class310) class53_sub6.getDefinition(i_181_ & 0x3fffffff, (byte) 37)).method5629((byte) -7);
					if (class179 != null)
						class179s[i_179_++] = class179;
				}
			}
			Class179 class179 = new Class179(class179s, i_179_);
			i_176_ |= 0x4000;
			class167 = class178.method3115(class179, i_176_, 137954583 * Class379.anInt3933, 64, 768);
			for (int i_182_ = 0; i_182_ < 10; i_182_++) {
				for (int i_183_ = 0; i_183_ < Class150.aShortArrayArray1725[i_182_].length; i_183_++) {
					if (anIntArray8102[i_182_] < (Class207.aShortArrayArrayArray2248[i_182_][i_183_]).length)
						class167.method2725((Class150.aShortArrayArray1725[i_182_][i_183_]), (Class207.aShortArrayArrayArray2248[i_182_][i_183_][anIntArray8102[i_182_]]));
				}
			}
			for (int i_184_ = 0; i_184_ < 10; i_184_++) {
				for (int i_185_ = 0; i_185_ < Class546.aShortArrayArray7302[i_184_].length; i_185_++) {
					if (anIntArray8103[i_184_] < (Class21.aShortArrayArrayArray214[i_184_][i_185_]).length)
						class167.method2826((Class546.aShortArrayArray7302[i_184_][i_185_]), (Class21.aShortArrayArrayArray214[i_184_][i_185_][anIntArray8103[i_184_]]));
				}
			}
			class167.method2769(i_175_);
			synchronized (aClass209_8110) {
				aClass209_8110.method3770(class167, aLong8098 * -1888504072262064255L);
			}
		}
		if (null == class707)
			return class167;
		Class167 class167_186_ = class167.method2681((byte) 4, i_175_, true);
		class707.method14229(class167_186_, 0, 1641987484);
		return class167_186_;
	}

	public void method10200(int i, int i_187_, Class53_Sub6 class53_sub6, int i_188_) {
		int i_189_ = anIntArray8099[i];
		if (class53_sub6.getDefinition(i_187_, (byte) 46) != null) {
			anIntArray8094[i_189_] = i_187_ | ~0x7fffffff;
			method10175(870972237);
		}
	}

	public void method10201(int i, int i_190_, Class53_Sub6 class53_sub6) {
		int i_191_ = anIntArray8099[i];
		if (class53_sub6.getDefinition(i_190_, (byte) 1) != null) {
			anIntArray8094[i_191_] = i_190_ | ~0x7fffffff;
			method10175(915085230);
		}
	}

	public Class167 method10202(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub13 class53_sub13, Class707 class707, int i_192_, int i_193_, int i_194_) {
		int i_195_ = class707 != null ? i | class707.method14173(-1359192823) : i;
		long l = (long) i_194_ << 32 | (long) (i_193_ << 16) | (long) i_192_;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = (Class167) aClass209_8110.method3767(l);
		}
		if (null == class167 || class178.method3068(class167.method2683(), i_195_) != 0) {
			if (class167 != null)
				i_195_ = class178.method3117(i_195_, class167.method2683());
			int i_196_ = i_195_;
			Class179[] class179s = new Class179[3];
			int i_197_ = 0;
			if (((Class310) class53_sub6.getDefinition(i_192_, (byte) 28)).method5622(701503009) && ((Class310) class53_sub6.getDefinition(i_193_, (byte) 59)).method5622(982452941) && ((Class310) class53_sub6.getDefinition(i_194_, (byte) -42)).method5622(1891412409)) {
				Class179 class179 = ((Class310) class53_sub6.getDefinition(i_192_, (byte) -34)).method5629((byte) -38);
				if (class179 != null)
					class179s[i_197_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_193_, (byte) -50)).method5629((byte) -68);
				if (null != class179)
					class179s[i_197_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_194_, (byte) -23)).method5629((byte) -49);
				if (null != class179)
					class179s[i_197_++] = class179;
				class179 = new Class179(class179s, i_197_);
				i_196_ |= 0x4000;
				class167 = class178.method3115(class179, i_196_, 137954583 * Class379.anInt3933, 64, 768);
				for (int i_198_ = 0; i_198_ < 10; i_198_++) {
					for (int i_199_ = 0; i_199_ < Class150.aShortArrayArray1725[i_198_].length; i_199_++) {
						if (anIntArray8102[i_198_] < (Class207.aShortArrayArrayArray2248[i_198_][i_199_]).length)
							class167.method2725((Class150.aShortArrayArray1725[i_198_][i_199_]), (Class207.aShortArrayArrayArray2248[i_198_][i_199_][anIntArray8102[i_198_]]));
					}
				}
				for (int i_200_ = 0; i_200_ < 10; i_200_++) {
					for (int i_201_ = 0; i_201_ < Class546.aShortArrayArray7302[i_200_].length; i_201_++) {
						if (anIntArray8103[i_200_] < (Class21.aShortArrayArrayArray214[i_200_][i_201_]).length)
							class167.method2826((Class546.aShortArrayArray7302[i_200_][i_201_]), (Class21.aShortArrayArrayArray214[i_200_][i_201_][anIntArray8103[i_200_]]));
					}
				}
				class167.method2769(i_195_);
				synchronized (aClass209_8110) {
					aClass209_8110.method3770(class167, l);
				}
			} else
				return null;
		}
		if (class707 == null)
			return class167;
		class167 = class167.method2681((byte) 4, i_195_, true);
		class707.method14229(class167, 0, 1920871049);
		return class167;
	}

	public Class167 method10203(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub13 class53_sub13, Class707 class707, int i_202_, int i_203_, int i_204_) {
		int i_205_ = class707 != null ? i | class707.method14173(237586233) : i;
		long l = (long) i_204_ << 32 | (long) (i_203_ << 16) | (long) i_202_;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = (Class167) aClass209_8110.method3767(l);
		}
		if (null == class167 || class178.method3068(class167.method2683(), i_205_) != 0) {
			if (class167 != null)
				i_205_ = class178.method3117(i_205_, class167.method2683());
			int i_206_ = i_205_;
			Class179[] class179s = new Class179[3];
			int i_207_ = 0;
			if (((Class310) class53_sub6.getDefinition(i_202_, (byte) 59)).method5622(883937495) && ((Class310) class53_sub6.getDefinition(i_203_, (byte) -35)).method5622(1306013836) && ((Class310) class53_sub6.getDefinition(i_204_, (byte) -49)).method5622(894664009)) {
				Class179 class179 = ((Class310) class53_sub6.getDefinition(i_202_, (byte) 92)).method5629((byte) -35);
				if (class179 != null)
					class179s[i_207_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_203_, (byte) -5)).method5629((byte) -110);
				if (null != class179)
					class179s[i_207_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_204_, (byte) -56)).method5629((byte) -115);
				if (null != class179)
					class179s[i_207_++] = class179;
				class179 = new Class179(class179s, i_207_);
				i_206_ |= 0x4000;
				class167 = class178.method3115(class179, i_206_, 137954583 * Class379.anInt3933, 64, 768);
				for (int i_208_ = 0; i_208_ < 10; i_208_++) {
					for (int i_209_ = 0; i_209_ < Class150.aShortArrayArray1725[i_208_].length; i_209_++) {
						if (anIntArray8102[i_208_] < (Class207.aShortArrayArrayArray2248[i_208_][i_209_]).length)
							class167.method2725((Class150.aShortArrayArray1725[i_208_][i_209_]), (Class207.aShortArrayArrayArray2248[i_208_][i_209_][anIntArray8102[i_208_]]));
					}
				}
				for (int i_210_ = 0; i_210_ < 10; i_210_++) {
					for (int i_211_ = 0; i_211_ < Class546.aShortArrayArray7302[i_210_].length; i_211_++) {
						if (anIntArray8103[i_210_] < (Class21.aShortArrayArrayArray214[i_210_][i_211_]).length)
							class167.method2826((Class546.aShortArrayArray7302[i_210_][i_211_]), (Class21.aShortArrayArrayArray214[i_210_][i_211_][anIntArray8103[i_210_]]));
					}
				}
				class167.method2769(i_205_);
				synchronized (aClass209_8110) {
					aClass209_8110.method3770(class167, l);
				}
			} else
				return null;
		}
		if (class707 == null)
			return class167;
		class167 = class167.method2681((byte) 4, i_205_, true);
		class707.method14229(class167, 0, 1700906906);
		return class167;
	}

	public static int method10204() {
		synchronized (aClass209_8109) {
			int i = aClass209_8109.method3765((byte) -108);
			return i;
		}
	}

	public Class167 method10205(Class178 class178, int i, Class53_Sub6 class53_sub6, Class53_Sub13 class53_sub13, Class707 class707, int i_212_, int i_213_, int i_214_) {
		int i_215_ = class707 != null ? i | class707.method14173(-973768150) : i;
		long l = (long) i_214_ << 32 | (long) (i_213_ << 16) | (long) i_212_;
		Class167 class167;
		synchronized (aClass209_8110) {
			class167 = (Class167) aClass209_8110.method3767(l);
		}
		if (null == class167 || class178.method3068(class167.method2683(), i_215_) != 0) {
			if (class167 != null)
				i_215_ = class178.method3117(i_215_, class167.method2683());
			int i_216_ = i_215_;
			Class179[] class179s = new Class179[3];
			int i_217_ = 0;
			if (((Class310) class53_sub6.getDefinition(i_212_, (byte) 95)).method5622(2117138247) && ((Class310) class53_sub6.getDefinition(i_213_, (byte) 85)).method5622(948317445) && ((Class310) class53_sub6.getDefinition(i_214_, (byte) -9)).method5622(59498036)) {
				Class179 class179 = ((Class310) class53_sub6.getDefinition(i_212_, (byte) -41)).method5629((byte) -104);
				if (class179 != null)
					class179s[i_217_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_213_, (byte) 55)).method5629((byte) 5);
				if (null != class179)
					class179s[i_217_++] = class179;
				class179 = ((Class310) class53_sub6.getDefinition(i_214_, (byte) -14)).method5629((byte) -97);
				if (null != class179)
					class179s[i_217_++] = class179;
				class179 = new Class179(class179s, i_217_);
				i_216_ |= 0x4000;
				class167 = class178.method3115(class179, i_216_, 137954583 * Class379.anInt3933, 64, 768);
				for (int i_218_ = 0; i_218_ < 10; i_218_++) {
					for (int i_219_ = 0; i_219_ < Class150.aShortArrayArray1725[i_218_].length; i_219_++) {
						if (anIntArray8102[i_218_] < (Class207.aShortArrayArrayArray2248[i_218_][i_219_]).length)
							class167.method2725((Class150.aShortArrayArray1725[i_218_][i_219_]), (Class207.aShortArrayArrayArray2248[i_218_][i_219_][anIntArray8102[i_218_]]));
					}
				}
				for (int i_220_ = 0; i_220_ < 10; i_220_++) {
					for (int i_221_ = 0; i_221_ < Class546.aShortArrayArray7302[i_220_].length; i_221_++) {
						if (anIntArray8103[i_220_] < (Class21.aShortArrayArrayArray214[i_220_][i_221_]).length)
							class167.method2826((Class546.aShortArrayArray7302[i_220_][i_221_]), (Class21.aShortArrayArrayArray214[i_220_][i_221_][anIntArray8103[i_220_]]));
					}
				}
				class167.method2769(i_215_);
				synchronized (aClass209_8110) {
					aClass209_8110.method3770(class167, l);
				}
			} else
				return null;
		}
		if (class707 == null)
			return class167;
		class167 = class167.method2681((byte) 4, i_215_, true);
		class707.method14229(class167, 0, 1679461741);
		return class167;
	}

	public static void method10206(int i) {
		Class379.anInt3933 = i * 378045095;
		synchronized (aClass209_8110) {
			aClass209_8110.method3773(-2125013102);
		}
		synchronized (aClass209_8109) {
			aClass209_8109.method3773(-1870152377);
		}
	}

	public static void method10207() {
		synchronized (aClass209_8109) {
			aClass209_8109.method3773(-1932173502);
		}
		synchronized (aClass209_8110) {
			aClass209_8110.method3773(-1883629574);
		}
	}

	public static void method10208() {
		synchronized (aClass209_8109) {
			aClass209_8109.method3773(-1839581469);
		}
		synchronized (aClass209_8110) {
			aClass209_8110.method3773(-1914119733);
		}
	}

	public static void method10209(int i) {
		synchronized (aClass209_8109) {
			aClass209_8109.method3772(i, (byte) -54);
		}
		synchronized (aClass209_8110) {
			aClass209_8110.method3772(i, (byte) -117);
		}
	}

	public static void method10210() {
		synchronized (aClass209_8109) {
			aClass209_8109.method3776(-1577024561);
		}
		synchronized (aClass209_8110) {
			aClass209_8110.method3776(-1550759930);
		}
	}

	static final void method10211(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub41_10626.method17090((byte) 2) ? 1 : 0;
	}

	static final void method10212(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_222_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_223_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_222_ | 1 << i_223_;
	}
}
