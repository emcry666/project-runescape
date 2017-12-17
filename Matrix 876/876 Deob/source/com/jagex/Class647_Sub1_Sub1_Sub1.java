/* Class647_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub1_Sub1 extends Class647_Sub1_Sub1 implements Interface61 {
	int anInt11968;
	Class167 aClass167_11969;
	Class523_Sub27_Sub4 aClass523_Sub27_Sub4_11970;
	Class564 aClass564_11971;
	Class53_Sub18 aClass53_Sub18_11972;
	byte aByte11973;
	boolean aBool11974;
	boolean aBool11975;
	boolean aBool11976;
	byte aByte11977;
	public static int anInt11978;

	boolean method16741() {
		if (aClass167_11969 != null)
			return aClass167_11969.method2730();
		return false;
	}

	boolean method16701(int i) {
		if (aClass167_11969 != null)
			return !aClass167_11969.method2731();
		return true;
	}

	public int method16743(int i) {
		return aClass167_11969 != null ? aClass167_11969.method2804() : 0;
	}

	Class5 method18421(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11972.getDefinition(anInt11968 * 651389791, (byte) 31);
		Class142 class142;
		Class142 class142_0_;
		if (aBool11975) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_0_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_0_ = aClass560_10822.aClass142Array7547[aByte10818 + 1];
			else
				class142_0_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return class602.method9922(class178, i, aByte11973, aByte11977, class142, class142_0_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474);
	}

	public int method400() {
		return aByte11977;
	}

	Class5 method18422(Class178 class178, int i, boolean bool, int i_1_) {
		Class602 class602 = (Class602) aClass53_Sub18_11972.getDefinition(anInt11968 * 651389791, (byte) 60);
		Class142 class142;
		Class142 class142_2_;
		if (aBool11975) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_2_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_2_ = aClass560_10822.aClass142Array7547[aByte10818 + 1];
			else
				class142_2_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return class602.method9922(class178, i, aByte11973, aByte11977, class142, class142_2_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474);
	}

	Class167 method18423(Class178 class178, int i) {
		if (aClass167_11969 != null && class178.method3068(aClass167_11969.method2683(), i) == 0)
			return aClass167_11969;
		Class5 class5 = method18422(class178, i, false, -884658589);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	public int method86() {
		return aByte11973;
	}

	void method16706(Class178 class178, short i) {
		/* empty */
	}

	boolean method16698(Class178 class178, int i, int i_3_, byte i_4_) {
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) 32)).aClass430_7931);
		if (null != class430)
			return class178.method3095(i, i_3_, method10585(), class430, 106733881);
		Class167 class167 = method18426(class178, 131072, -1121771923);
		if (null != class167) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_3_, class435, false, 0);
		}
		return false;
	}

	public int method401(int i) {
		return anInt11968 * 651389791;
	}

	public Class564 method16707(Class178 class178, byte i) {
		Class437 class437 = method10569().aClass437_4862;
		if (aClass564_11971 == null)
			aClass564_11971 = WorldVarDomainType.method15901((int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, method18426(class178, 0, 277725895), -1168706562);
		return aClass564_11971;
	}

	public int method390(int i) {
		return aByte11977;
	}

	public void method391(int i) {
		if (null != aClass167_11969)
			aClass167_11969.method2684();
	}

	boolean method16702(int i) {
		if (aClass167_11969 != null)
			return aClass167_11969.method2730();
		return false;
	}

	public boolean method392(short i) {
		return aBool11974;
	}

	Class559 method16724(Class178 class178) {
		if (aClass167_11969 == null)
			return null;
		Class435 class435 = class178.method3113();
		class435.method6803(method10585());
		class435.method6819((float) aShort11734, 0.0F, (float) aShort11735);
		Class559 class559 = Class238.method4306(aBool11976, 67818673);
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) 42)).aClass430_7931);
		if (null != class430) {
			aClass167_11969.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11969.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	public void method395(Class178 class178, int i) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11970 == null && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, 1697976352);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, 634162024);
	}

	public int method182() {
		return anInt11968 * 651389791;
	}

	public void method404(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_11970 && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, 1409846417);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	public int method88() {
		return aByte11973;
	}

	public int method396() {
		return aByte11973;
	}

	public int method397() {
		return aByte11977;
	}

	Class559 method16726(Class178 class178) {
		if (aClass167_11969 == null)
			return null;
		Class435 class435 = class178.method3113();
		class435.method6803(method10585());
		class435.method6819((float) aShort11734, 0.0F, (float) aShort11735);
		Class559 class559 = Class238.method4306(aBool11976, -2063147858);
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) -11)).aClass430_7931);
		if (null != class430) {
			aClass167_11969.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11969.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	public void method362() {
		if (null != aClass167_11969)
			aClass167_11969.method2684();
	}

	public void method358() {
		if (null != aClass167_11969)
			aClass167_11969.method2684();
	}

	public boolean method402() {
		return aBool11974;
	}

	public boolean method249() {
		return aBool11974;
	}

	public boolean method291() {
		return true;
	}

	public boolean method406() {
		return true;
	}

	public boolean method403() {
		return true;
	}

	public boolean method399() {
		return true;
	}

	public void method405(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_11970 && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, 1320796885);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	public void method408(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11970 == null && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, -2001293677);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -401243175);
	}

	public void method407(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11970 == null && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, -767699850);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, 47639063);
	}

	public void method398(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_11970 == null && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, -253632960);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -2009415510);
	}

	public int method69(int i) {
		return aByte11973;
	}

	boolean method16715() {
		if (aClass167_11969 != null)
			return !aClass167_11969.method2731();
		return true;
	}

	boolean method16716() {
		if (aClass167_11969 != null)
			return aClass167_11969.method2730();
		return false;
	}

	public void method394(Class178 class178, int i) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_11970 && aBool11974) {
			Class5 class5 = method18422(class178, 262144, true, -1812783927);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_11970;
			aClass523_Sub27_Sub4_11970 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	Class5 method18424(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_11972.getDefinition(anInt11968 * 651389791, (byte) -33);
		Class142 class142;
		Class142 class142_5_;
		if (aBool11975) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_5_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_5_ = aClass560_10822.aClass142Array7547[aByte10818 + 1];
			else
				class142_5_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return class602.method9922(class178, i, aByte11973, aByte11977, class142, class142_5_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474);
	}

	public int method16719() {
		return aClass167_11969 != null ? aClass167_11969.method2804() : 0;
	}

	public int method16720() {
		return aClass167_11969 != null ? aClass167_11969.method2804() : 0;
	}

	void method16728(Class178 class178) {
		/* empty */
	}

	Class167 method18425(Class178 class178, int i) {
		if (aClass167_11969 != null && class178.method3068(aClass167_11969.method2683(), i) == 0)
			return aClass167_11969;
		Class5 class5 = method18422(class178, i, false, -1261223228);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	Class559 method16725(Class178 class178) {
		if (aClass167_11969 == null)
			return null;
		Class435 class435 = class178.method3113();
		class435.method6803(method10585());
		class435.method6819((float) aShort11734, 0.0F, (float) aShort11735);
		Class559 class559 = Class238.method4306(aBool11976, -1593924124);
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) -99)).aClass430_7931);
		if (null != class430) {
			aClass167_11969.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11969.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	public Class647_Sub1_Sub1_Sub1(Class560 class560, Class178 class178, Class53_Sub18 class53_sub18, Class602 class602, int i, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_, int i_11_, int i_12_, int i_13_) {
		super(class560, i_7_, i_8_, i_9_, i, i_6_, i_10_, i_11_);
		aClass53_Sub18_11972 = class53_sub18;
		anInt11968 = 18025131 * class602.anInt7854;
		aBool11975 = bool;
		aByte11977 = (byte) i_13_;
		aByte11973 = (byte) i_12_;
		aBool11976 = 0 != -344567467 * class602.anInt7874 && !bool;
		aBool11974 = (class178.method3351() && class602.aBool7921 && !aBool11975 && Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		int i_14_ = 2048;
		if (class602.aBool7881)
			i_14_ |= 0x80000;
		Class5 class5 = method18422(class178, i_14_, aBool11974, 1150933320);
		if (class5 != null) {
			aClass167_11969 = (Class167) class5.anObject37;
			aClass523_Sub27_Sub4_11970 = (Class523_Sub27_Sub4) class5.anObject36;
			if (class602.aBool7881) {
				aClass167_11969 = aClass167_11969.method2681((byte) 0, i_14_, false);
				if (class602.aBool7881) {
					Class498 class498 = client.aClass505_11019.method8237(1768810236);
					aClass167_11969.method2839(class498.anInt5565 * 1472261369, 1924364511 * class498.anInt5567, class498.anInt5566 * 668310559, (class498.anInt5564 * -334846483));
				}
			}
		}
		method16714(1, 475275718);
	}

	void method16727(Class178 class178) {
		/* empty */
	}

	Class559 method16744(Class178 class178, byte i) {
		if (aClass167_11969 == null)
			return null;
		Class435 class435 = class178.method3113();
		class435.method6803(method10585());
		class435.method6819((float) aShort11734, 0.0F, (float) aShort11735);
		Class559 class559 = Class238.method4306(aBool11976, -1038290880);
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) 105)).aClass430_7931);
		if (null != class430) {
			aClass167_11969.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_11969.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	void method16756(Class178 class178) {
		/* empty */
	}

	boolean method16736(Class178 class178, int i, int i_15_) {
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) -48)).aClass430_7931);
		if (null != class430)
			return class178.method3095(i, i_15_, method10585(), class430, -1102284762);
		Class167 class167 = method18426(class178, 131072, 727781283);
		if (null != class167) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_15_, class435, false, 0);
		}
		return false;
	}

	boolean method16713(Class178 class178, int i, int i_16_) {
		Class430 class430 = (((Class602) aClass53_Sub18_11972.getDefinition(651389791 * anInt11968, (byte) -35)).aClass430_7931);
		if (null != class430)
			return class178.method3095(i, i_16_, method10585(), class430, -1482680115);
		Class167 class167 = method18426(class178, 131072, -546714497);
		if (null != class167) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_16_, class435, false, 0);
		}
		return false;
	}

	boolean method16718() {
		if (aClass167_11969 != null)
			return aClass167_11969.method2730();
		return false;
	}

	Class167 method18426(Class178 class178, int i, int i_17_) {
		if (aClass167_11969 != null && class178.method3068(aClass167_11969.method2683(), i) == 0)
			return aClass167_11969;
		Class5 class5 = method18422(class178, i, false, -1075099809);
		if (class5 != null)
			return (Class167) class5.anObject37;
		return null;
	}

	public Class564 method16721(Class178 class178) {
		Class437 class437 = method10569().aClass437_4862;
		if (aClass564_11971 == null)
			aClass564_11971 = WorldVarDomainType.method15901((int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, method18426(class178, 0, -416839213), -1592422540);
		return aClass564_11971;
	}

	public boolean method393(int i) {
		return true;
	}
}
