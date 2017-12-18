/* Class707 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class707 {
	boolean aBool8822;
	public static final int anInt8823 = 1;
	public static final int anInt8824 = 2;
	AnimationDefinitions aClass205_8825;
	int anInt8826;
	int anInt8827;
	int anInt8828;
	int anInt8829;
	int anInt8830;
	public static final int anInt8831 = 0;
	boolean aBool8832;
	boolean aBool8833 = false;
	int anInt8834;
	Class696 aClass696_8835;
	Class696 aClass696_8836;

	public final void method14159(Class167 class167, int i) {
		if (null != aClass205_8825) {
			if (aClass205_8825.anIntArray2217 != null && method14184(850367615)) {
				class167.method2747(aClass696_8835.aClass523_Sub27_Sub11_8757, aClass696_8835.anInt8758 * 78444041, aClass696_8835.aClass523_Sub27_Sub11_8760, aClass696_8835.anInt8756 * -782873069, anInt8834 * 2129671813, (aClass205_8825.anIntArray2225[anInt8829 * 1649052261]), i, aClass205_8825.aBool2232);
				if (aBool8832 && null != aClass205_8825.anIntArray2218 && aClass696_8836.aBool8761)
					class167.method2747(aClass696_8836.aClass523_Sub27_Sub11_8757, 78444041 * aClass696_8836.anInt8758, aClass696_8836.aClass523_Sub27_Sub11_8760, aClass696_8836.anInt8756 * -782873069, 2129671813 * anInt8834, aClass205_8825.anIntArray2225[anInt8829 * 1649052261], i, aClass205_8825.aBool2232);
			}
		}
	}

	public final void method14160(Class707 class707_0_, int i) {
		aClass205_8825 = class707_0_.aClass205_8825;
		aBool8833 = class707_0_.aBool8833;
		aBool8832 = class707_0_.aBool8832;
		anInt8827 = class707_0_.anInt8827 * 1;
		anInt8828 = 1 * class707_0_.anInt8828;
		anInt8829 = class707_0_.anInt8829 * 1;
		anInt8830 = 1 * class707_0_.anInt8830;
		anInt8834 = 1 * class707_0_.anInt8834;
		method14185(-398986142);
	}

	public final boolean method14161(int i) {
		return null != aClass205_8825;
	}

	public final boolean method14162(int i) {
		if (aClass205_8825 == null || 0 == i)
			return false;
		if (1075242583 * anInt8827 > 0) {
			if (1075242583 * anInt8827 > i) {
				anInt8827 -= 1707042151 * i;
				return false;
			}
			i -= 1075242583 * anInt8827;
			anInt8827 = 0;
			method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 91);
		}
		i += 2129671813 * anInt8834;
		boolean bool = aClass205_8825.aBool2224 | AnimationDefinitions.aBool2230;
		if (i > 100 && aClass205_8825.anInt2237 * -269106323 > 0) {
			int i_1_;
			for (i_1_ = (aClass205_8825.anIntArray2217.length - -269106323 * aClass205_8825.anInt2237); (1649052261 * anInt8829 < i_1_ && i > (aClass205_8825.anIntArray2225[anInt8829 * 1649052261])); anInt8829 += 1564743533)
				i -= aClass205_8825.anIntArray2225[anInt8829 * 1649052261];
			if (1649052261 * anInt8829 >= i_1_) {
				int i_2_ = 0;
				for (int i_3_ = i_1_; i_3_ < aClass205_8825.anIntArray2217.length; i_3_++)
					i_2_ += aClass205_8825.anIntArray2225[i_3_];
				if (0 == 502065685 * anInt8826)
					anInt8828 += i / i_2_ * 1182578905;
				i %= i_2_;
			}
			anInt8830 = anInt8829 * -1021728653 + -442823177;
			if (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length) {
				if (aClass205_8825.anInt2237 * -269106323 == -1 && aBool8822)
					anInt8830 = 0;
				else
					anInt8830 -= -720693461 * aClass205_8825.anInt2237;
				if (-1131166777 * anInt8830 < 0 || (-1131166777 * anInt8830 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
			}
			bool = true;
		}
		while (i > aClass205_8825.anIntArray2225[anInt8829 * 1649052261]) {
			bool = true;
			i -= (aClass205_8825.anIntArray2225[(anInt8829 += 1564743533) * 1649052261 - 1]);
			if (anInt8829 * 1649052261 >= aClass205_8825.anIntArray2217.length) {
				if (-1 != aClass205_8825.anInt2237 * -269106323 && anInt8826 * 502065685 != 2) {
					anInt8829 -= aClass205_8825.anInt2237 * -1037631383;
					if (502065685 * anInt8826 == 0)
						anInt8828 += 1182578905;
				}
				if ((1605650281 * anInt8828 >= 1370685733 * aClass205_8825.anInt2228) || anInt8829 * 1649052261 < 0 || (1649052261 * anInt8829 >= aClass205_8825.anIntArray2217.length)) {
					aBool8833 = true;
					break;
				}
			}
			method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 100);
			anInt8830 = anInt8829 * -1021728653 + -442823177;
			if (-1131166777 * anInt8830 >= aClass205_8825.anIntArray2217.length) {
				if (-1 == -269106323 * aClass205_8825.anInt2237 && aBool8822)
					anInt8830 = 0;
				else
					anInt8830 -= -720693461 * aClass205_8825.anInt2237;
				if (-1131166777 * anInt8830 < 0 || (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
			}
		}
		anInt8834 = i * -671788467;
		if (bool)
			method14185(-398986142);
		return bool;
	}

	public final int method14163(int i) {
		return (null != aClass205_8825 ? -514394489 * aClass205_8825.anInt2216 : -1);
	}

	public final void method14164(int i, byte i_4_) {
		method14168(i, 0, 0, false, 1840849895);
	}

	public final void method14165(int i, int i_5_, int i_6_) {
		method14168(i, i_5_, 0, false, 1840849895);
	}

	public final void method14166(int i, boolean bool, byte i_7_) {
		method14168(i, 0, 0, bool, 1840849895);
	}

	public final int method14167() {
		if (method14184(-897854133)) {
			int i = 0;
			if (method14184(1338154599)) {
				i |= aClass696_8835.anInt8759 * 65387229;
				if (aBool8832 && null != aClass205_8825.anIntArray2218)
					i |= aClass696_8836.anInt8759 * 65387229;
			}
			return i;
		}
		return 0;
	}

	public final void method14168(int i, int i_8_, int i_9_, boolean bool, int i_10_) {
		method14169(i, i_8_, i_9_, bool, false, 1964056184);
	}

	final void method14169(int i, int i_11_, int i_12_, boolean bool, boolean bool_13_, int i_14_) {
		if (i != method14163(-1784957887)) {
			if (-1 != i) {
				if (null != aClass205_8825 && aClass205_8825.anInt2216 * -514394489 == i) {
					if (0 == aClass205_8825.anInt2220 * 1566662983)
						return;
				} else {
					aClass205_8825 = (AnimationDefinitions) Class579.aClass53_Sub13_7703.getDefinition(i, (byte) 69);
					if (null == aClass205_8825 || null == aClass205_8825.anIntArray2217) {
						aClass205_8825 = null;
						return;
					}
				}
				anInt8828 = 0;
				anInt8827 = 1707042151 * i_11_;
				anInt8826 = 177640765 * i_12_;
				aBool8822 = bool_13_;
				if (bool) {
					anInt8829 = ((int) (Math.random() * (double) (aClass205_8825.anIntArray2217).length) * 1564743533);
					anInt8834 = ((int) (Math.random() * (double) (aClass205_8825.anIntArray2225[anInt8829 * 1649052261])) * -671788467);
				} else {
					anInt8829 = 0;
					anInt8834 = 0;
				}
				anInt8830 = -442823177 + anInt8829 * -1021728653;
				if (anInt8830 * -1131166777 < 0 || (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
				if (1075242583 * anInt8827 == 0)
					method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 108);
				aBool8833 = false;
			} else
				aClass205_8825 = null;
			method14185(-398986142);
		}
	}

	public final boolean method14170(short i) {
		return 0 != 1075242583 * anInt8827;
	}

	public final int method14171(int i) {
		return anInt8827 * 1075242583;
	}

	public final boolean method14172() {
		return aBool8833;
	}

	public final int method14173(int i) {
		if (method14184(-1270275641)) {
			int i_15_ = 0;
			if (method14184(1563069934)) {
				i_15_ |= aClass696_8835.anInt8759 * 65387229;
				if (aBool8832 && null != aClass205_8825.anIntArray2218)
					i_15_ |= aClass696_8836.anInt8759 * 65387229;
			}
			return i_15_;
		}
		return 0;
	}

	public final void method14174(int i, byte i_16_) {
		anInt8827 = 1707042151 * i;
	}

	public final void method14175(Class167 class167, int i, int i_17_, short i_18_) {
		if (aClass205_8825.anIntArray2217 != null && method14184(569411825)) {
			class167.method2697(aClass696_8835.aClass523_Sub27_Sub11_8757, aClass696_8835.anInt8758 * 78444041, aClass696_8835.aClass523_Sub27_Sub11_8760, aClass696_8835.anInt8756 * -782873069, 2129671813 * anInt8834, (aClass205_8825.anIntArray2225[anInt8829 * 1649052261]), i, i_17_, aClass205_8825.aBool2232, null);
			if (aBool8832 && null != aClass205_8825.anIntArray2218 && aClass696_8836.aBool8761)
				class167.method2697(aClass696_8836.aClass523_Sub27_Sub11_8757, 78444041 * aClass696_8836.anInt8758, aClass696_8836.aClass523_Sub27_Sub11_8760, -782873069 * aClass696_8836.anInt8756, 2129671813 * anInt8834, (aClass205_8825.anIntArray2225[anInt8829 * 1649052261]), i, i_17_, aClass205_8825.aBool2232, null);
		}
	}

	public final void method14176(Class167 class167, byte i) {
		if (null != aClass205_8825.anIntArray2217 && method14184(-1014058763)) {
			class167.method2699(aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * aClass696_8835.anInt8758);
			if (aBool8832 && aClass205_8825.anIntArray2218 != null && aClass696_8836.aBool8761)
				class167.method2699(aClass696_8836.aClass523_Sub27_Sub11_8757, 78444041 * aClass696_8836.anInt8758);
		}
	}

	public final boolean method14177(int i) {
		return aBool8833;
	}

	public final void method14178(int i) {
		anInt8828 = 0;
	}

	public static void method14179(Class53_Sub13 class53_sub13) {
		Class579.aClass53_Sub13_7703 = class53_sub13;
	}

	public final void method14180(int i, short i_19_) {
		anInt8829 = 0;
		anInt8830 = (aClass205_8825.anIntArray2217.length > 1 ? 1 : -1) * -442823177;
		anInt8834 = 0;
		aBool8833 = false;
		anInt8827 = 1707042151 * i;
		anInt8828 = 0;
		if (null != aClass205_8825 & aClass205_8825.anIntArray2217 != null) {
			method14183(aClass205_8825, anInt8829 * 1649052261, (byte) 35);
			method14185(-398986142);
		}
	}

	public final void method14181(int i, int i_20_) {
		method14168(i, i_20_, 0, false, 1840849895);
	}

	public final boolean method14182(int i, int i_21_) {
		if (null == aClass205_8825 | (i -= anInt8827 * 1075242583) <= 0)
			return false;
		return (aClass205_8825.aBool2224 | (i + 2129671813 * anInt8834 > aClass205_8825.anIntArray2225[1649052261 * anInt8829]));
	}

	void method14183(AnimationDefinitions class205, int i, byte i_22_) {
		/* empty */
	}

	final boolean method14184(int i) {
		if (aClass205_8825 != null) {
			boolean bool = aClass696_8835.method14005(Class579.aClass53_Sub13_7703, aClass205_8825, anInt8829 * 1649052261, -1131166777 * anInt8830, aClass205_8825.anIntArray2217, -2116160298);
			if (bool && aBool8832 && null != aClass205_8825.anIntArray2218)
				aClass696_8836.method14005(Class579.aClass53_Sub13_7703, aClass205_8825, anInt8829 * 1649052261, -1131166777 * anInt8830, aClass205_8825.anIntArray2218, -1299885863);
			return bool;
		}
		return false;
	}

	final void method14185(int i) {
		aClass696_8835.method14006(-475951974);
		if (aBool8832)
			aClass696_8836.method14006(-1775278891);
	}

	void method14186(AnimationDefinitions class205, int i) {
		/* empty */
	}

	public final void method14187() {
		anInt8828 = 0;
	}

	public final void method14188() {
		method14180(0, (short) 29034);
	}

	public static void method14189(Class53_Sub13 class53_sub13) {
		Class579.aClass53_Sub13_7703 = class53_sub13;
	}

	public final boolean method14190() {
		return null != aClass205_8825;
	}

	public final AnimationDefinitions method14191() {
		return aClass205_8825;
	}

	public final boolean method14192() {
		return 0 != 1075242583 * anInt8827;
	}

	public final int method14193() {
		return (null != aClass205_8825 ? -514394489 * aClass205_8825.anInt2216 : -1);
	}

	final void method14194() {
		aClass696_8835.method14006(2559110);
		if (aBool8832)
			aClass696_8836.method14006(387117458);
	}

	public final boolean method14195(int i) {
		if (null == aClass205_8825 | (i -= anInt8827 * 1075242583) <= 0)
			return false;
		return (aClass205_8825.aBool2224 | (i + 2129671813 * anInt8834 > aClass205_8825.anIntArray2225[1649052261 * anInt8829]));
	}

	public final boolean method14196(int i) {
		if (null == aClass205_8825 | (i -= anInt8827 * 1075242583) <= 0)
			return false;
		return (aClass205_8825.aBool2224 | (i + 2129671813 * anInt8834 > aClass205_8825.anIntArray2225[1649052261 * anInt8829]));
	}

	public final boolean method14197(int i) {
		if (null == aClass205_8825 | (i -= anInt8827 * 1075242583) <= 0)
			return false;
		return (aClass205_8825.aBool2224 | (i + 2129671813 * anInt8834 > aClass205_8825.anIntArray2225[1649052261 * anInt8829]));
	}

	public static void method14198(Class53_Sub13 class53_sub13) {
		Class579.aClass53_Sub13_7703 = class53_sub13;
	}

	public final void method14199(int i, boolean bool, boolean bool_23_) {
		method14169(i, 0, 0, bool, bool_23_, 1742155079);
	}

	public final void method14200(int i, boolean bool, boolean bool_24_) {
		method14169(i, 0, 0, bool, bool_24_, 2092285551);
	}

	Class707(boolean bool) {
		aBool8832 = false;
		anInt8826 = 0;
		aBool8822 = false;
		aBool8832 = bool;
		aClass696_8835 = new Class696();
		if (aBool8832)
			aClass696_8836 = new Class696();
		else
			aClass696_8836 = null;
	}

	public final void method14201(int i, boolean bool, boolean bool_25_) {
		method14169(i, 0, 0, bool, bool_25_, 1549607839);
	}

	final void method14202(int i, int i_26_, int i_27_, boolean bool, boolean bool_28_) {
		if (i != method14163(-1978960056)) {
			if (-1 != i) {
				if (null != aClass205_8825 && aClass205_8825.anInt2216 * -514394489 == i) {
					if (0 == aClass205_8825.anInt2220 * 1566662983)
						return;
				} else {
					aClass205_8825 = (AnimationDefinitions) Class579.aClass53_Sub13_7703.getDefinition(i, (byte) 30);
					if (null == aClass205_8825 || null == aClass205_8825.anIntArray2217) {
						aClass205_8825 = null;
						return;
					}
				}
				anInt8828 = 0;
				anInt8827 = 1707042151 * i_26_;
				anInt8826 = 177640765 * i_27_;
				aBool8822 = bool_28_;
				if (bool) {
					anInt8829 = ((int) (Math.random() * (double) (aClass205_8825.anIntArray2217).length) * 1564743533);
					anInt8834 = ((int) (Math.random() * (double) (aClass205_8825.anIntArray2225[anInt8829 * 1649052261])) * -671788467);
				} else {
					anInt8829 = 0;
					anInt8834 = 0;
				}
				anInt8830 = -442823177 + anInt8829 * -1021728653;
				if (anInt8830 * -1131166777 < 0 || (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
				if (1075242583 * anInt8827 == 0)
					method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 55);
				aBool8833 = false;
			} else
				aClass205_8825 = null;
			method14185(-398986142);
		}
	}

	public final AnimationDefinitions method14203(int i) {
		return aClass205_8825;
	}

	final void method14204(int i, int i_29_, int i_30_, boolean bool, boolean bool_31_) {
		if (i != method14163(-1844996055)) {
			if (-1 != i) {
				if (null != aClass205_8825 && aClass205_8825.anInt2216 * -514394489 == i) {
					if (0 == aClass205_8825.anInt2220 * 1566662983)
						return;
				} else {
					aClass205_8825 = (AnimationDefinitions) Class579.aClass53_Sub13_7703.getDefinition(i, (byte) -21);
					if (null == aClass205_8825 || null == aClass205_8825.anIntArray2217) {
						aClass205_8825 = null;
						return;
					}
				}
				anInt8828 = 0;
				anInt8827 = 1707042151 * i_29_;
				anInt8826 = 177640765 * i_30_;
				aBool8822 = bool_31_;
				if (bool) {
					anInt8829 = ((int) (Math.random() * (double) (aClass205_8825.anIntArray2217).length) * 1564743533);
					anInt8834 = ((int) (Math.random() * (double) (aClass205_8825.anIntArray2225[anInt8829 * 1649052261])) * -671788467);
				} else {
					anInt8829 = 0;
					anInt8834 = 0;
				}
				anInt8830 = -442823177 + anInt8829 * -1021728653;
				if (anInt8830 * -1131166777 < 0 || (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
				if (1075242583 * anInt8827 == 0)
					method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 71);
				aBool8833 = false;
			} else
				aClass205_8825 = null;
			method14185(-398986142);
		}
	}

	public final boolean method14205(int i, byte i_32_) {
		if (aClass205_8825 == null || 0 == i)
			return false;
		if (1075242583 * anInt8827 > 0) {
			if (1075242583 * anInt8827 > i) {
				anInt8827 -= 1707042151 * i;
				return false;
			}
			i -= 1075242583 * anInt8827;
			anInt8827 = 0;
			method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 73);
		}
		i += 2129671813 * anInt8834;
		boolean bool = aClass205_8825.aBool2224 | AnimationDefinitions.aBool2230;
		if (i > 100 && aClass205_8825.anInt2237 * -269106323 > 0) {
			int i_33_;
			for (i_33_ = (aClass205_8825.anIntArray2217.length - -269106323 * aClass205_8825.anInt2237); (1649052261 * anInt8829 < i_33_ && i > (aClass205_8825.anIntArray2225[anInt8829 * 1649052261])); anInt8829 += 1564743533)
				i -= aClass205_8825.anIntArray2225[anInt8829 * 1649052261];
			if (1649052261 * anInt8829 >= i_33_) {
				int i_34_ = 0;
				for (int i_35_ = i_33_; i_35_ < aClass205_8825.anIntArray2217.length; i_35_++)
					i_34_ += aClass205_8825.anIntArray2225[i_35_];
				if (0 == 502065685 * anInt8826)
					anInt8828 += i / i_34_ * 1182578905;
				i %= i_34_;
			}
			anInt8830 = anInt8829 * -1021728653 + -442823177;
			if (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length) {
				if (aClass205_8825.anInt2237 * -269106323 == -1 && aBool8822)
					anInt8830 = 0;
				else
					anInt8830 -= -720693461 * aClass205_8825.anInt2237;
				if (-1131166777 * anInt8830 < 0 || (-1131166777 * anInt8830 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
			}
			bool = true;
		}
		while (i > aClass205_8825.anIntArray2225[anInt8829 * 1649052261]) {
			bool = true;
			i -= (aClass205_8825.anIntArray2225[(anInt8829 += 1564743533) * 1649052261 - 1]);
			if (anInt8829 * 1649052261 >= aClass205_8825.anIntArray2217.length) {
				if (-1 != aClass205_8825.anInt2237 * -269106323 && anInt8826 * 502065685 != 2) {
					anInt8829 -= aClass205_8825.anInt2237 * -1037631383;
					if (502065685 * anInt8826 == 0)
						anInt8828 += 1182578905;
				}
				if ((1605650281 * anInt8828 >= 1370685733 * aClass205_8825.anInt2228) || anInt8829 * 1649052261 < 0 || (1649052261 * anInt8829 >= aClass205_8825.anIntArray2217.length)) {
					aBool8833 = true;
					break;
				}
			}
			method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 38);
			anInt8830 = anInt8829 * -1021728653 + -442823177;
			if (-1131166777 * anInt8830 >= aClass205_8825.anIntArray2217.length) {
				if (-1 == -269106323 * aClass205_8825.anInt2237 && aBool8822)
					anInt8830 = 0;
				else
					anInt8830 -= -720693461 * aClass205_8825.anInt2237;
				if (-1131166777 * anInt8830 < 0 || (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
			}
		}
		anInt8834 = i * -671788467;
		if (bool)
			method14185(-398986142);
		return bool;
	}

	public final boolean method14206() {
		return 0 != 1075242583 * anInt8827;
	}

	public final boolean method14207() {
		return 0 != 1075242583 * anInt8827;
	}

	public final int method14208() {
		if (method14184(1929006067)) {
			int i = 0;
			if (method14184(1589320303)) {
				i |= aClass696_8835.anInt8759 * 65387229;
				if (aBool8832 && null != aClass205_8825.anIntArray2218)
					i |= aClass696_8836.anInt8759 * 65387229;
			}
			return i;
		}
		return 0;
	}

	public final void method14209(int i, boolean bool, boolean bool_36_) {
		method14169(i, 0, 0, bool, bool_36_, 1610350968);
	}

	public final int method14210() {
		return (null != aClass205_8825 ? -514394489 * aClass205_8825.anInt2216 : -1);
	}

	public final int method14211() {
		if (method14184(1312849046)) {
			int i = 0;
			if (method14184(-604139794)) {
				i |= aClass696_8835.anInt8759 * 65387229;
				if (aBool8832 && null != aClass205_8825.anIntArray2218)
					i |= aClass696_8836.anInt8759 * 65387229;
			}
			return i;
		}
		return 0;
	}

	public final boolean method14212(int i) {
		if (null == aClass205_8825 | (i -= anInt8827 * 1075242583) <= 0)
			return false;
		return (aClass205_8825.aBool2224 | (i + 2129671813 * anInt8834 > aClass205_8825.anIntArray2225[1649052261 * anInt8829]));
	}

	public static final void method14213(Class167 class167, Class707 class707, Class707 class707_37_) {
		if (class707.method14184(1297541910) && class707_37_.method14184(697129154)) {
			AnimationDefinitions class205 = class707.aClass205_8825;
			AnimationDefinitions class205_38_ = class707_37_.aClass205_8825;
			class167.method2837(class707.aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * class707.aClass696_8835.anInt8758, class707.aClass696_8835.aClass523_Sub27_Sub11_8760, class707.aClass696_8835.anInt8756 * -782873069, class707.anInt8834 * 2129671813, class205.anIntArray2225[1649052261 * class707.anInt8829], class707_37_.aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * class707_37_.aClass696_8835.anInt8758, class707_37_.aClass696_8835.aClass523_Sub27_Sub11_8760, class707_37_.aClass696_8835.anInt8756 * -782873069, class707_37_.anInt8834 * 2129671813, (class205_38_.anIntArray2225[1649052261 * class707_37_.anInt8829]), (null != class205.aClass187_2221 ? class205.aClass187_2221.aBoolArray2132 : null), class205.aBool2232 | class205_38_.aBool2232);
		}
	}

	public static final void method14214(Class167 class167, Class707 class707, Class707 class707_39_) {
		if (class707.method14184(-617014846) && class707_39_.method14184(87411364)) {
			AnimationDefinitions class205 = class707.aClass205_8825;
			AnimationDefinitions class205_40_ = class707_39_.aClass205_8825;
			class167.method2837(class707.aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * class707.aClass696_8835.anInt8758, class707.aClass696_8835.aClass523_Sub27_Sub11_8760, class707.aClass696_8835.anInt8756 * -782873069, class707.anInt8834 * 2129671813, class205.anIntArray2225[1649052261 * class707.anInt8829], class707_39_.aClass696_8835.aClass523_Sub27_Sub11_8757, 78444041 * class707_39_.aClass696_8835.anInt8758, class707_39_.aClass696_8835.aClass523_Sub27_Sub11_8760, class707_39_.aClass696_8835.anInt8756 * -782873069, class707_39_.anInt8834 * 2129671813, (class205_40_.anIntArray2225[1649052261 * class707_39_.anInt8829]), (null != class205.aClass187_2221 ? class205.aClass187_2221.aBoolArray2132 : null), class205.aBool2232 | class205_40_.aBool2232);
		}
	}

	public final void method14215(int i, int i_41_) {
		method14168(i, i_41_, 0, false, 1840849895);
	}

	public final boolean method14216() {
		return aBool8833;
	}

	public final void method14217(int i) {
		method14180(0, (short) -2997);
	}

	public final void method14218() {
		anInt8828 = 0;
	}

	public final int method14219() {
		if (method14184(-1606094782)) {
			int i = 0;
			if (method14184(259793937)) {
				i |= aClass696_8835.anInt8759 * 65387229;
				if (aBool8832 && null != aClass205_8825.anIntArray2218)
					i |= aClass696_8836.anInt8759 * 65387229;
			}
			return i;
		}
		return 0;
	}

	public final void method14220() {
		anInt8828 = 0;
	}

	final void method14221() {
		aClass696_8835.method14006(-1811935954);
		if (aBool8832)
			aClass696_8836.method14006(-602056612);
	}

	public final void method14222(int i) {
		anInt8829 = 0;
		anInt8830 = (aClass205_8825.anIntArray2217.length > 1 ? 1 : -1) * -442823177;
		anInt8834 = 0;
		aBool8833 = false;
		anInt8827 = 1707042151 * i;
		anInt8828 = 0;
		if (null != aClass205_8825 & aClass205_8825.anIntArray2217 != null) {
			method14183(aClass205_8825, anInt8829 * 1649052261, (byte) 126);
			method14185(-398986142);
		}
	}

	public final void method14223(int i, boolean bool) {
		method14168(i, 0, 0, bool, 1840849895);
	}

	public final void method14224() {
		anInt8828 = 0;
	}

	public final boolean method14225(int i) {
		if (aClass205_8825 == null || 0 == i)
			return false;
		if (1075242583 * anInt8827 > 0) {
			if (1075242583 * anInt8827 > i) {
				anInt8827 -= 1707042151 * i;
				return false;
			}
			i -= 1075242583 * anInt8827;
			anInt8827 = 0;
			method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 116);
		}
		i += 2129671813 * anInt8834;
		boolean bool = aClass205_8825.aBool2224 | AnimationDefinitions.aBool2230;
		if (i > 100 && aClass205_8825.anInt2237 * -269106323 > 0) {
			int i_42_;
			for (i_42_ = (aClass205_8825.anIntArray2217.length - -269106323 * aClass205_8825.anInt2237); (1649052261 * anInt8829 < i_42_ && i > (aClass205_8825.anIntArray2225[anInt8829 * 1649052261])); anInt8829 += 1564743533)
				i -= aClass205_8825.anIntArray2225[anInt8829 * 1649052261];
			if (1649052261 * anInt8829 >= i_42_) {
				int i_43_ = 0;
				for (int i_44_ = i_42_; i_44_ < aClass205_8825.anIntArray2217.length; i_44_++)
					i_43_ += aClass205_8825.anIntArray2225[i_44_];
				if (0 == 502065685 * anInt8826)
					anInt8828 += i / i_43_ * 1182578905;
				i %= i_43_;
			}
			anInt8830 = anInt8829 * -1021728653 + -442823177;
			if (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length) {
				if (aClass205_8825.anInt2237 * -269106323 == -1 && aBool8822)
					anInt8830 = 0;
				else
					anInt8830 -= -720693461 * aClass205_8825.anInt2237;
				if (-1131166777 * anInt8830 < 0 || (-1131166777 * anInt8830 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
			}
			bool = true;
		}
		while (i > aClass205_8825.anIntArray2225[anInt8829 * 1649052261]) {
			bool = true;
			i -= (aClass205_8825.anIntArray2225[(anInt8829 += 1564743533) * 1649052261 - 1]);
			if (anInt8829 * 1649052261 >= aClass205_8825.anIntArray2217.length) {
				if (-1 != aClass205_8825.anInt2237 * -269106323 && anInt8826 * 502065685 != 2) {
					anInt8829 -= aClass205_8825.anInt2237 * -1037631383;
					if (502065685 * anInt8826 == 0)
						anInt8828 += 1182578905;
				}
				if ((1605650281 * anInt8828 >= 1370685733 * aClass205_8825.anInt2228) || anInt8829 * 1649052261 < 0 || (1649052261 * anInt8829 >= aClass205_8825.anIntArray2217.length)) {
					aBool8833 = true;
					break;
				}
			}
			method14183(aClass205_8825, 1649052261 * anInt8829, (byte) 61);
			anInt8830 = anInt8829 * -1021728653 + -442823177;
			if (-1131166777 * anInt8830 >= aClass205_8825.anIntArray2217.length) {
				if (-1 == -269106323 * aClass205_8825.anInt2237 && aBool8822)
					anInt8830 = 0;
				else
					anInt8830 -= -720693461 * aClass205_8825.anInt2237;
				if (-1131166777 * anInt8830 < 0 || (anInt8830 * -1131166777 >= aClass205_8825.anIntArray2217.length))
					anInt8830 = 442823177;
			}
		}
		anInt8834 = i * -671788467;
		if (bool)
			method14185(-398986142);
		return bool;
	}

	public final void method14226(int i, boolean bool, boolean bool_45_, byte i_46_) {
		method14169(i, 0, 0, bool, bool_45_, 1056889336);
	}

	public final void method14227(int i) {
		method14168(i, 0, 0, false, 1840849895);
	}

	public final void method14228(int i) {
		method14168(i, 0, 0, false, 1840849895);
	}

	public final void method14229(Class167 class167, int i, int i_47_) {
		if (null != aClass205_8825) {
			if (aClass205_8825.anIntArray2217 != null && method14184(1028407694)) {
				class167.method2747(aClass696_8835.aClass523_Sub27_Sub11_8757, aClass696_8835.anInt8758 * 78444041, aClass696_8835.aClass523_Sub27_Sub11_8760, aClass696_8835.anInt8756 * -782873069, anInt8834 * 2129671813, (aClass205_8825.anIntArray2225[anInt8829 * 1649052261]), i, aClass205_8825.aBool2232);
				if (aBool8832 && null != aClass205_8825.anIntArray2218 && aClass696_8836.aBool8761)
					class167.method2747(aClass696_8836.aClass523_Sub27_Sub11_8757, 78444041 * aClass696_8836.anInt8758, aClass696_8836.aClass523_Sub27_Sub11_8760, aClass696_8836.anInt8756 * -782873069, 2129671813 * anInt8834, aClass205_8825.anIntArray2225[anInt8829 * 1649052261], i, aClass205_8825.aBool2232);
			}
		}
	}

	final void method14230() {
		aClass696_8835.method14006(-601547797);
		if (aBool8832)
			aClass696_8836.method14006(-28872749);
	}

	public final void method14231(int i, int i_48_, int i_49_, boolean bool) {
		method14169(i, i_48_, i_49_, bool, false, 1957397106);
	}

	public static void method14232(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		Class523_Sub2 class523_sub2 = null;
		for (Class523_Sub2 class523_sub2_57_ = ((Class523_Sub2) Class523_Sub2.aClass708_10359.method14240(1794135125)); null != class523_sub2_57_; class523_sub2_57_ = ((Class523_Sub2) Class523_Sub2.aClass708_10359.method14244((byte) -36))) {
			if (class523_sub2_57_.anInt10354 * 1338368275 == i && 1813697231 * class523_sub2_57_.anInt10348 == i_50_ && i_51_ == class523_sub2_57_.anInt10355 * 1818669861 && i_52_ == 876815205 * class523_sub2_57_.anInt10349) {
				class523_sub2 = class523_sub2_57_;
				break;
			}
		}
		if (class523_sub2 == null) {
			class523_sub2 = new Class523_Sub2();
			class523_sub2.anInt10354 = i * 703926555;
			class523_sub2.anInt10349 = i_52_ * 437147245;
			class523_sub2.anInt10348 = -923077585 * i_50_;
			class523_sub2.anInt10355 = -631623507 * i_51_;
			if (i_50_ >= 0 && i_51_ >= 0 && i_50_ < client.aClass505_11019.method8292((byte) 76) && i_51_ < client.aClass505_11019.method8235(2111025544))
				Class283.method5134(class523_sub2, -1024432973);
			Class523_Sub2.aClass708_10359.method14236(class523_sub2, -1662645021);
		}
		class523_sub2.anInt10353 = i_53_ * 601144019;
		class523_sub2.anInt10361 = i_54_ * -2098934699;
		class523_sub2.anInt10351 = -1429047441 * i_55_;
		class523_sub2.aBool10357 = true;
		class523_sub2.aBool10358 = false;
	}

	static final void method14233(Class669 class669, int i) {
		int i_58_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class665.aClass282_8527.method5118(i_58_ != 0, -692285983);
	}
}
