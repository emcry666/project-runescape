/* Class647_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub4_Sub1 extends Class647_Sub1_Sub4 implements Interface61 {
	static int[] anIntArray12015 = { 1, 2, 4, 8 };
	static int[] anIntArray12016 = { 16, 32, 64, 128 };
	Class53_Sub18 aClass53_Sub18_12017;
	boolean aBool12018;
	int anInt12019;
	Class167 aClass167_12020;
	boolean aBool12021;
	byte aByte12022;
	byte aByte12023;
	Class564 aClass564_12024;
	Class523_Sub27_Sub4 aClass523_Sub27_Sub4_12025;
	boolean aBool12026;
	boolean aBool12027;

	public int method400() {
		return aByte12022;
	}

	boolean method16701(int i) {
		if (null != aClass167_12020)
			return !aClass167_12020.method2731();
		return true;
	}

	boolean method16730() {
		return aBool12026;
	}

	public int method16743(int i) {
		return null != aClass167_12020 ? aClass167_12020.method2804() : 0;
	}

	Class167 method18464(Class178 class178, int i, int i_0_) {
		if (null != aClass167_12020 && class178.method3068(aClass167_12020.method2683(), i) == 0)
			return aClass167_12020;
		Class5 class5 = method18465(class178, i, false, 1128956528);
		if (null != class5)
			return (Class167) class5.anObject37;
		return null;
	}

	void method16697() {
		aBool12026 = false;
		if (aClass167_12020 != null)
			aClass167_12020.method2769(aClass167_12020.method2683() & ~0x10000);
	}

	Class559 method16744(Class178 class178, byte i) {
		if (null == aClass167_12020)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool12018, 800462655);
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(50658683 * anInt12019, (byte) -107)).aClass430_7931);
		if (class430 != null) {
			aClass167_12020.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_12020.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	public Class647_Sub1_Sub4_Sub1(Class560 class560, Class178 class178, Class53_Sub18 class53_sub18, Class602 class602, int i, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_, int i_6_, boolean bool_7_) {
		super(class560, i_2_, i_3_, i_4_, i, i_1_, Class174.method2936(i_5_, i_6_, -62465557));
		aClass53_Sub18_12017 = class53_sub18;
		anInt12019 = -2114590513 * class602.anInt7854;
		aBool12021 = bool;
		aByte12023 = (byte) i_5_;
		aByte12022 = (byte) i_6_;
		aBool12018 = -344567467 * class602.anInt7874 != 0 && !bool;
		aBool12026 = bool_7_;
		aBool12027 = (class178.method3351() && class602.aBool7921 && !aBool12021 && Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16827(784504984) != 0);
		int i_8_ = 2048;
		if (aBool12026)
			i_8_ |= 0x10000;
		if (class602.aBool7881)
			i_8_ |= 0x80000;
		Class5 class5 = method18465(class178, i_8_, aBool12027, -1108378370);
		if (null != class5) {
			aClass167_12020 = (Class167) class5.anObject37;
			aClass523_Sub27_Sub4_12025 = (Class523_Sub27_Sub4) class5.anObject36;
			if (aBool12026 || class602.aBool7881) {
				aClass167_12020 = aClass167_12020.method2681((byte) 0, i_8_, false);
				if (class602.aBool7881) {
					Class498 class498 = client.aClass505_11019.method8237(1630413873);
					aClass167_12020.method2839(class498.anInt5565 * 1472261369, 1924364511 * class498.anInt5567, class498.anInt5566 * 668310559, (-334846483 * class498.anInt5564));
				}
			}
		}
		method16714(1, -551336075);
	}

	public boolean method399() {
		return true;
	}

	boolean method16698(Class178 class178, int i, int i_9_, byte i_10_) {
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(anInt12019 * 50658683, (byte) -46)).aClass430_7931);
		if (class430 != null)
			return class178.method3095(i, i_9_, method10585(), class430, 1394019703);
		Class167 class167 = method18464(class178, 131072, 342716044);
		if (class167 != null) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_9_, class435, false, 0);
		}
		return false;
	}

	boolean method16736(Class178 class178, int i, int i_11_) {
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(anInt12019 * 50658683, (byte) 0)).aClass430_7931);
		if (class430 != null)
			return class178.method3095(i, i_11_, method10585(), class430, -1738821557);
		Class167 class167 = method18464(class178, 131072, 342716044);
		if (class167 != null) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_11_, class435, false, 0);
		}
		return false;
	}

	void method16703(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_12_, int i_13_, boolean bool, int i_14_) {
		if (class647_sub1 instanceof Class647_Sub1_Sub4_Sub1) {
			Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1_15_ = (Class647_Sub1_Sub4_Sub1) class647_sub1;
			if (null != aClass167_12020 && null != class647_sub1_sub4_sub1_15_.aClass167_12020)
				aClass167_12020.method2735((class647_sub1_sub4_sub1_15_.aClass167_12020), i, i_12_, i_13_, bool);
		} else if (class647_sub1 instanceof Class647_Sub1_Sub3_Sub3) {
			Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = (Class647_Sub1_Sub3_Sub3) class647_sub1;
			if (aClass167_12020 != null && null != class647_sub1_sub3_sub3.aClass167_11989)
				aClass167_12020.method2735((class647_sub1_sub3_sub3.aClass167_11989), i, i_12_, i_13_, bool);
		}
	}

	void method16704(byte i) {
		aBool12026 = false;
		if (aClass167_12020 != null)
			aClass167_12020.method2769(aClass167_12020.method2683() & ~0x10000);
	}

	public int method401(int i) {
		return 50658683 * anInt12019;
	}

	public int method69(int i) {
		return aByte12023;
	}

	boolean method16731() {
		return aBool12026;
	}

	boolean method16716() {
		if (null != aClass167_12020)
			return aClass167_12020.method2730();
		return false;
	}

	public boolean method393(int i) {
		return true;
	}

	public boolean method392(short i) {
		return aBool12027;
	}

	boolean method16699(int i) {
		return aBool12026;
	}

	public void method395(Class178 class178, int i) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_12025 && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, -468923899);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -765788926);
	}

	public int method182() {
		return 50658683 * anInt12019;
	}

	public int method390(int i) {
		return aByte12022;
	}

	public void method391(int i) {
		if (aClass167_12020 != null)
			aClass167_12020.method2684();
	}

	public int method396() {
		return aByte12023;
	}

	public Class564 method16707(Class178 class178, byte i) {
		Class437 class437 = method10569().aClass437_4862;
		if (aClass564_12024 == null)
			aClass564_12024 = Class470_Sub5.method15901((int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, method18464(class178, 0, 342716044), -780560182);
		return aClass564_12024;
	}

	public int method86() {
		return aByte12023;
	}

	public void method362() {
		if (aClass167_12020 != null)
			aClass167_12020.method2684();
	}

	boolean method16702(int i) {
		if (null != aClass167_12020)
			return aClass167_12020.method2730();
		return false;
	}

	public boolean method402() {
		return aBool12027;
	}

	public boolean method249() {
		return aBool12027;
	}

	public boolean method291() {
		return true;
	}

	public boolean method406() {
		return true;
	}

	public int method88() {
		return aByte12023;
	}

	Class5 method18465(Class178 class178, int i, boolean bool, int i_16_) {
		Class602 class602 = (Class602) aClass53_Sub18_12017.getDefinition(50658683 * anInt12019, (byte) -8);
		Class142 class142;
		Class142 class142_17_;
		if (aBool12021) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_17_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_17_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_17_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return class602.method9922(class178, i, aByte12023, aByte12022, class142, class142_17_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474);
	}

	public void method405(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_12025 == null && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, 1865549775);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (null != class523_sub27_sub4)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	public void method404(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_12025 == null && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, -1259709750);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (null != class523_sub27_sub4)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	public void method407(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_12025 && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, 1282836519);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, 689714344);
	}

	public void method398(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_12025 && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, -1488839082);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1741254311);
	}

	Class559 method16725(Class178 class178) {
		if (null == aClass167_12020)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool12018, -937343681);
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(50658683 * anInt12019, (byte) 35)).aClass430_7931);
		if (class430 != null) {
			aClass167_12020.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_12020.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	boolean method16715() {
		if (null != aClass167_12020)
			return !aClass167_12020.method2731();
		return true;
	}

	void method16706(Class178 class178, short i) {
		/* empty */
	}

	boolean method16741() {
		if (null != aClass167_12020)
			return aClass167_12020.method2730();
		return false;
	}

	public Class564 method16721(Class178 class178) {
		Class437 class437 = method10569().aClass437_4862;
		if (aClass564_12024 == null)
			aClass564_12024 = Class470_Sub5.method15901((int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, method18464(class178, 0, 342716044), -1851988337);
		return aClass564_12024;
	}

	public void method394(Class178 class178, int i) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (aClass523_Sub27_Sub4_12025 == null && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, 564538822);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (null != class5 ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (null != class523_sub27_sub4)
			aClass560_10822.method9297(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, -1477751462);
	}

	public int method16720() {
		return null != aClass167_12020 ? aClass167_12020.method2804() : 0;
	}

	boolean method16718() {
		if (null != aClass167_12020)
			return aClass167_12020.method2730();
		return false;
	}

	Class559 method16724(Class178 class178) {
		if (null == aClass167_12020)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool12018, -1239031355);
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(50658683 * anInt12019, (byte) 19)).aClass430_7931);
		if (class430 != null) {
			aClass167_12020.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_12020.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	void method16727(Class178 class178) {
		/* empty */
	}

	public void method358() {
		if (aClass167_12020 != null)
			aClass167_12020.method2684();
	}

	public int method397() {
		return aByte12022;
	}

	void method16728(Class178 class178) {
		/* empty */
	}

	void method16756(Class178 class178) {
		/* empty */
	}

	public void method408(Class178 class178) {
		Object object = null;
		Class523_Sub27_Sub4 class523_sub27_sub4;
		if (null == aClass523_Sub27_Sub4_12025 && aBool12027) {
			Class5 class5 = method18465(class178, 262144, true, -245392629);
			class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5 != null ? class5.anObject36 : null);
		} else {
			class523_sub27_sub4 = aClass523_Sub27_Sub4_12025;
			aClass523_Sub27_Sub4_12025 = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		if (class523_sub27_sub4 != null)
			aClass560_10822.method9354(class523_sub27_sub4, aByte10818, (int) class437.aFloat4903, (int) class437.aFloat4905, null, 2051824526);
	}

	Class559 method16726(Class178 class178) {
		if (null == aClass167_12020)
			return null;
		Class435 class435 = method10585();
		Class559 class559 = Class238.method4306(aBool12018, 1910352296);
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(50658683 * anInt12019, (byte) -23)).aClass430_7931);
		if (class430 != null) {
			aClass167_12020.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class430);
		} else
			aClass167_12020.method2708(class435, aClass180Array10823[0], 0);
		return class559;
	}

	void method16732(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_18_, int i_19_, boolean bool) {
		if (class647_sub1 instanceof Class647_Sub1_Sub4_Sub1) {
			Class647_Sub1_Sub4_Sub1 class647_sub1_sub4_sub1_20_ = (Class647_Sub1_Sub4_Sub1) class647_sub1;
			if (null != aClass167_12020 && null != class647_sub1_sub4_sub1_20_.aClass167_12020)
				aClass167_12020.method2735((class647_sub1_sub4_sub1_20_.aClass167_12020), i, i_18_, i_19_, bool);
		} else if (class647_sub1 instanceof Class647_Sub1_Sub3_Sub3) {
			Class647_Sub1_Sub3_Sub3 class647_sub1_sub3_sub3 = (Class647_Sub1_Sub3_Sub3) class647_sub1;
			if (aClass167_12020 != null && null != class647_sub1_sub3_sub3.aClass167_11989)
				aClass167_12020.method2735((class647_sub1_sub3_sub3.aClass167_11989), i, i_18_, i_19_, bool);
		}
	}

	public int method16719() {
		return null != aClass167_12020 ? aClass167_12020.method2804() : 0;
	}

	void method16734() {
		aBool12026 = false;
		if (aClass167_12020 != null)
			aClass167_12020.method2769(aClass167_12020.method2683() & ~0x10000);
	}

	void method16735() {
		aBool12026 = false;
		if (aClass167_12020 != null)
			aClass167_12020.method2769(aClass167_12020.method2683() & ~0x10000);
	}

	public boolean method403() {
		return true;
	}

	boolean method16713(Class178 class178, int i, int i_21_) {
		Class430 class430 = (((Class602) aClass53_Sub18_12017.getDefinition(anInt12019 * 50658683, (byte) 48)).aClass430_7931);
		if (class430 != null)
			return class178.method3095(i, i_21_, method10585(), class430, -1475589592);
		Class167 class167 = method18464(class178, 131072, 342716044);
		if (class167 != null) {
			Class435 class435 = method10585();
			return class167.method2709(i, i_21_, class435, false, 0);
		}
		return false;
	}

	static int method18466(int i, int i_22_) {
		if (1923531495 * Class607.aClass607_7964.anInt7982 == i || i == 1923531495 * Class607.aClass607_7966.anInt7982)
			return anIntArray12016[i_22_ & 0x3];
		return anIntArray12015[i_22_ & 0x3];
	}

	static int method18467(int i, int i_23_) {
		if (1923531495 * Class607.aClass607_7964.anInt7982 == i || i == 1923531495 * Class607.aClass607_7966.anInt7982)
			return anIntArray12016[i_23_ & 0x3];
		return anIntArray12015[i_23_ & 0x3];
	}

	Class167 method18468(Class178 class178, int i) {
		if (null != aClass167_12020 && class178.method3068(aClass167_12020.method2683(), i) == 0)
			return aClass167_12020;
		Class5 class5 = method18465(class178, i, false, 991975870);
		if (null != class5)
			return (Class167) class5.anObject37;
		return null;
	}

	Class5 method18469(Class178 class178, int i, boolean bool) {
		Class602 class602 = (Class602) aClass53_Sub18_12017.getDefinition(50658683 * anInt12019, (byte) -48);
		Class142 class142;
		Class142 class142_24_;
		if (aBool12021) {
			class142 = aClass560_10822.aClass142Array7513[aByte10818];
			class142_24_ = aClass560_10822.aClass142Array7547[0];
		} else {
			class142 = aClass560_10822.aClass142Array7547[aByte10818];
			if (aByte10818 < 3)
				class142_24_ = aClass560_10822.aClass142Array7547[1 + aByte10818];
			else
				class142_24_ = null;
		}
		Class437 class437 = method10569().aClass437_4862;
		return class602.method9922(class178, i, aByte12023, aByte12022, class142, class142_24_, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905, bool, null, 1192307474);
	}
}
