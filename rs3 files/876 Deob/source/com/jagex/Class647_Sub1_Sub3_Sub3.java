/* Class647_Sub1_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub3_Sub3 extends Class647_Sub1_Sub3 implements Interface61 {
	boolean aBool11988;
	Class167 aClass167_11989;
	Class523_Sub27_Sub4 aClass523_Sub27_Sub4_11990;
	Class564 aClass564_11991;
	byte aByte11992;
	Class53_Sub18 aClass53_Sub18_11993;
	byte aByte11994;
	boolean aBool11995;
	boolean aBool11996;
	boolean aBool11997;
	boolean aBool11998;
	int anInt11999;

	public void method394(Class178 class178, int i) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_11990 && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	boolean method16701(int i) {
		if (aClass167_11989 != null)
			return !aClass167_11989.method2731();
		return true;
	}

	Class5 method18435(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) -90);
		Class142 class142;
		Class142 class142_0_;
		if (aBool11995) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_0_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_0_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_0_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return (class602.method9922(class178, i, (Class607.aClass607_7984.anInt7982 * 1923531495 != aByte11992 ? (int) aByte11992 : Class607.aClass607_7970.anInt7982 * 1923531495), (aByte11992 == 1923531495 * Class607.aClass607_7984.anInt7982 ? (int) (4 + aByte11994) : aByte11994), class142, class142_0_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474));
	}

	public int method16743(int i) {
		return null != aClass167_11989 ? aClass167_11989.method2804() : 0;
	}

	Class167 method18436(Class178 class178, int i, short i_1_) {
		if (aClass167_11989 != null && class178.method3068(aClass167_11989.method2683(), i) == 0)
			return aClass167_11989;
		Class5 class5 = method18437(class178, i, false, 185944598);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	Class5 method18437(Class178 class178, int i, boolean bool, int i_2_) {
		Class602 class602 = (Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) -7);
		Class142 class142;
		Class142 class142_3_;
		if (aBool11995) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_3_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_3_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_3_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return (class602.method9922(class178, i, (Class607.aClass607_7984.anInt7982 * 1923531495 != aByte11992 ? (int) aByte11992 : Class607.aClass607_7970.anInt7982 * 1923531495), (aByte11992 == 1923531495 * Class607.aClass607_7984.anInt7982 ? (int) (4 + aByte11994) : aByte11994), class142, class142_3_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474));
	}

	public Class564 method16707(Class178 class178, byte i) {
		Class437 class437 = method10569().aClass437_4862;
		if (null == aClass564_11991)
			aClass564_11991 = WorldVarDomainType.method15901((int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, method18436(class178, 0, (short) 336), -1434583462);
		return aClass564_11991;
	}

	Class559 method16744(Class178 class178, byte i) {
		if (null == aClass167_11989)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool11996, 58716418);
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 39)).aClass430_7931);
		if (null != class430) {
			aClass167_11989.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11989.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	void method16706(Class178 class178, short i) {
		/* empty */
	}

	public void method398(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11990 == null && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -266916384);
	}

	boolean method16699(int i) {
		return aBool11988;
	}

	void method16703(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_4_, int i_5_, boolean bool, int i_6_) {
		if (class647_sub1 instanceof Class647_Sub1_Sub4_Sub1) {
			Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = (Class647_Sub1_Sub4_Sub1) class647_sub1;
			if (null != aClass167_11989 && class647_sub1_sub4_sub1.aClass167_12020 != null)
				aClass167_11989.method2735((class647_sub1_sub4_sub1.aClass167_12020), i, i_4_, i_5_, bool);
		} else if (class647_sub1 instanceof Class647_Sub1_Sub3_Sub3) {
			Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3_7_ = (Class647_Sub1_Sub3_Sub3) class647_sub1;
			if (null != aClass167_11989 && class647_sub1_sub3_sub3_7_.aClass167_11989 != null)
				aClass167_11989.method2735((class647_sub1_sub3_sub3_7_.aClass167_11989), i, i_4_, i_5_, bool);
		}
	}

	boolean method16715() {
		if (aClass167_11989 != null)
			return !aClass167_11989.method2731();
		return true;
	}

	public int method400() {
		return aByte11994;
	}

	public int method69(int i) {
		return aByte11992;
	}

	public int method390(int i) {
		return aByte11994;
	}

	public Class647_Sub1_Sub3_Sub3(Class560 class560, Class178 class178, Class53_Sub18 class53_sub18, Class602 class602, int i, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool_18_, boolean bool_19_) {
		super(class560, i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, 1 == 591624555 * class602.anInt7862, Class548.method9098(i_16_, i_17_, (byte) 46));
		aClass53_Sub18_11993 = class53_sub18;
		anInt11999 = class602.anInt7854 * -1469096419;
		aByte10818 = (byte) i_8_;
		aBool11995 = bool;
		aByte11992 = (byte) i_16_;
		aByte11994 = (byte) i_17_;
		aBool11996 = 0 != -344567467 * class602.anInt7874 && !bool;
		aBool11988 = bool_18_;
		aBool11998 = (class178.method3351() && class602.aBool7921 && !aBool11995 && Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		aBool11997 = bool_19_;
		int i_20_ = 2048;
		if (aBool11988)
			i_20_ |= 0x10000;
		if (class602.aBool7881)
			i_20_ |= 0x80000;
		Class5 class5 = method18437(class178, i_20_, aBool11998, 185944598);
		if (null != class5) {
			aClass167_11989 = (Class167) class5.anObject37;
			aClass523_Sub27_Sub4_11990 = (Class523_Sub27_Sub4) class5.anObject36;
			if (aBool11988 || class602.aBool7881) {
				aClass167_11989 = aClass167_11989.method2681((byte) 0, i_20_, false);
				if (class602.aBool7881) {
					Class498 class498 = client.aClass505_11019.method8237(1726013703);
					aClass167_11989.method2839(class498.anInt5565 * 1472261369, 1924364511 * class498.anInt5567, class498.anInt5566 * 668310559, (class498.anInt5564 * -334846483));
				}
			}
		}
		method16714(1, -1348467313);
	}

	public void method395(Class178 class178, int i) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11990 == null && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, 1717965624);
	}

	public void method404(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_11990 && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	boolean method16741() {
		if (null != aClass167_11989)
			return aClass167_11989.method2730();
		return false;
	}

	Class167 method18438(Class178 class178, int i) {
		if (aClass167_11989 != null && class178.method3068(aClass167_11989.method2683(), i) == 0)
			return aClass167_11989;
		Class5 class5 = method18437(class178, i, false, 185944598);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	public int method18439(int i) {
		return null != aClass167_11989 ? aClass167_11989.method2711() / 4 : 15;
	}

	public int method182() {
		return anInt11999 * -91733447;
	}

	public int method86() {
		return aByte11992;
	}

	public int method88() {
		return aByte11992;
	}

	public int method396() {
		return aByte11992;
	}

	public int method397() {
		return aByte11994;
	}

	public void method408(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11990 == null && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -129206575);
	}

	public int method16720() {
		return null != aClass167_11989 ? aClass167_11989.method2804() : 0;
	}

	public void method358() {
		if (aClass167_11989 != null)
			aClass167_11989.method2684();
	}

	public boolean method249() {
		return aBool11998;
	}

	public boolean method402() {
		return aBool11998;
	}

	public boolean method291() {
		return aBool11997;
	}

	boolean method16730() {
		return aBool11988;
	}

	public boolean method403() {
		return aBool11997;
	}

	public boolean method399() {
		return aBool11997;
	}

	public void method405(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_11990 && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	void method16704(byte i) {
		aBool11988 = false;
		if (aClass167_11989 != null)
			aClass167_11989.method2769(aClass167_11989.method2683() & ~0x10000);
	}

	public void method407(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11990 == null && aBool11998) {
			Class5 class5 = method18437(class178, 262144, true, 185944598);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11990;
			aClass523_Sub27_Sub4_11990 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, 2146345568);
	}

	void method16697() {
		aBool11988 = false;
		if (aClass167_11989 != null)
			aClass167_11989.method2769(aClass167_11989.method2683() & ~0x10000);
	}

	Class5 method18440(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 58);
		Class142 class142;
		Class142 class142_21_;
		if (aBool11995) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_21_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_21_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_21_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return (class602.method9922(class178, i, (Class607.aClass607_7984.anInt7982 * 1923531495 != aByte11992 ? (int) aByte11992 : Class607.aClass607_7970.anInt7982 * 1923531495), (aByte11992 == 1923531495 * Class607.aClass607_7984.anInt7982 ? (int) (4 + aByte11994) : aByte11994), class142, class142_21_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474));
	}

	Class167 method18441(Class178 class178, int i) {
		if (aClass167_11989 != null && class178.method3068(aClass167_11989.method2683(), i) == 0)
			return aClass167_11989;
		Class5 class5 = method18437(class178, i, false, 185944598);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	void method16732(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_22_, int i_23_, boolean bool) {
		if (class647_sub1 instanceof Class647_Sub1_Sub4_Sub1) {
			Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1 = (Class647_Sub1_Sub4_Sub1) class647_sub1;
			if (null != aClass167_11989 && class647_sub1_sub4_sub1.aClass167_12020 != null)
				aClass167_11989.method2735((class647_sub1_sub4_sub1.aClass167_12020), i, i_22_, i_23_, bool);
		} else if (class647_sub1 instanceof Class647_Sub1_Sub3_Sub3) {
			Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3_24_ = (Class647_Sub1_Sub3_Sub3) class647_sub1;
			if (null != aClass167_11989 && class647_sub1_sub3_sub3_24_.aClass167_11989 != null)
				aClass167_11989.method2735((class647_sub1_sub3_sub3_24_.aClass167_11989), i, i_22_, i_23_, bool);
		}
	}

	boolean method16716() {
		if (null != aClass167_11989)
			return aClass167_11989.method2730();
		return false;
	}

	boolean method16698(Class178 class178, int i, int i_25_, byte i_26_) {
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 24)).aClass430_7931);
		if (class430 != null)
			return class178.method3095(i, i_25_, method10585(), class430, -1846259517);
		Class167 class167 = method18436(class178, 131072, (short) 336);
		if (null != class167) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_25_, class435, false, 0);
		}
		return false;
	}

	public int method16719() {
		return null != aClass167_11989 ? aClass167_11989.method2804() : 0;
	}

	Class5 method18442(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 24);
		Class142 class142;
		Class142 class142_27_;
		if (aBool11995) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_27_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_27_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_27_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return (class602.method9922(class178, i, (Class607.aClass607_7984.anInt7982 * 1923531495 != aByte11992 ? (int) aByte11992 : Class607.aClass607_7970.anInt7982 * 1923531495), (aByte11992 == 1923531495 * Class607.aClass607_7984.anInt7982 ? (int) (4 + aByte11994) : aByte11994), class142, class142_27_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474));
	}

	public Class564 method16721(Class178 class178) {
		Class437 class437 = method10569().aClass437_4862;
		if (null == aClass564_11991)
			aClass564_11991 = WorldVarDomainType.method15901((int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, method18436(class178, 0, (short) 336), -1152662592);
		return aClass564_11991;
	}

	Class559 method16724(Class178 class178) {
		if (null == aClass167_11989)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool11996, 459350166);
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 99)).aClass430_7931);
		if (null != class430) {
			aClass167_11989.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11989.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	Class559 method16725(Class178 class178) {
		if (null == aClass167_11989)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool11996, -1663647545);
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) -69)).aClass430_7931);
		if (null != class430) {
			aClass167_11989.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11989.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	Class559 method16726(Class178 class178) {
		if (null == aClass167_11989)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool11996, -423861620);
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) -66)).aClass430_7931);
		if (null != class430) {
			aClass167_11989.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11989.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	void method16727(Class178 class178) {
		/* empty */
	}

	void method16728(Class178 class178) {
		/* empty */
	}

	public int method401(int i) {
		return anInt11999 * -91733447;
	}

	boolean method16702(int i) {
		if (null != aClass167_11989)
			return aClass167_11989.method2730();
		return false;
	}

	boolean method16731() {
		return aBool11988;
	}

	void method16756(Class178 class178) {
		/* empty */
	}

	public boolean method393(int i) {
		return aBool11997;
	}

	void method16734() {
		aBool11988 = false;
		if (aClass167_11989 != null)
			aClass167_11989.method2769(aClass167_11989.method2683() & ~0x10000);
	}

	void method16735() {
		aBool11988 = false;
		if (aClass167_11989 != null)
			aClass167_11989.method2769(aClass167_11989.method2683() & ~0x10000);
	}

	boolean method16736(Class178 class178, int i, int i_28_) {
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) -90)).aClass430_7931);
		if (class430 != null)
			return class178.method3095(i, i_28_, method10585(), class430, 1028639408);
		Class167 class167 = method18436(class178, 131072, (short) 336);
		if (null != class167) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_28_, class435, false, 0);
		}
		return false;
	}

	boolean method16713(Class178 class178, int i, int i_29_) {
		Class430 class430 = (((Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 59)).aClass430_7931);
		if (class430 != null)
			return class178.method3095(i, i_29_, method10585(), class430, -1657490104);
		Class167 class167 = method18436(class178, 131072, (short) 336);
		if (null != class167) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_29_, class435, false, 0);
		}
		return false;
	}

	Class167 method18443(Class178 class178, int i) {
		if (aClass167_11989 != null && class178.method3068(aClass167_11989.method2683(), i) == 0)
			return aClass167_11989;
		Class5 class5 = method18437(class178, i, false, 185944598);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	public boolean method406() {
		return aBool11997;
	}

	Class5 method18444(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) -2);
		Class142 class142;
		Class142 class142_30_;
		if (aBool11995) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_30_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_30_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_30_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return (class602.method9922(class178, i, (Class607.aClass607_7984.anInt7982 * 1923531495 != aByte11992 ? (int) aByte11992 : Class607.aClass607_7970.anInt7982 * 1923531495), (aByte11992 == 1923531495 * Class607.aClass607_7984.anInt7982 ? (int) (4 + aByte11994) : aByte11994), class142, class142_30_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474));
	}

	public void method391(int i) {
		if (aClass167_11989 != null)
			aClass167_11989.method2684();
	}

	Class5 method18445(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11993.getDefinition(anInt11999 * -91733447, (byte) 13);
		Class142 class142;
		Class142 class142_31_;
		if (aBool11995) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_31_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_31_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_31_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return (class602.method9922(class178, i, (Class607.aClass607_7984.anInt7982 * 1923531495 != aByte11992 ? (int) aByte11992 : Class607.aClass607_7970.anInt7982 * 1923531495), (aByte11992 == 1923531495 * Class607.aClass607_7984.anInt7982 ? (int) (4 + aByte11994) : aByte11994), class142, class142_31_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474));
	}

	public boolean method392(short i) {
		return aBool11998;
	}

	public void method362() {
		if (aClass167_11989 != null)
			aClass167_11989.method2684();
	}

	boolean method16718() {
		if (null != aClass167_11989)
			return aClass167_11989.method2730();
		return false;
	}

	public int method18446() {
		return null != aClass167_11989 ? aClass167_11989.method2711() / 4 : 15;
	}

	public static void method18447(int i, int i_32_, float f, Interface44 interface44, byte i_33_) {
		if (null != Class655.aClass375_8420)
			Class655.aClass375_8420.method6357((byte) 36).method6336(i, i_32_, f, interface44, -1090748824);
	}

	static final void method18448(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2647 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static void method18449(int i, int i_34_, int i_35_, int i_36_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17963(1773655662);
		class523_sub27_sub7.anInt11653 = i_34_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_35_ * -254643469;
	}
}
