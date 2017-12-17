/* Class647_Sub1_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub4_Sub2 extends Class647_Sub1_Sub4 implements Interface61 {
	static int[] anIntArray12028 = { 1, 2, 4, 8 };
	boolean aBool12029;
	static int[] anIntArray12030 = { 16, 32, 64, 128 };
	boolean aBool12031 = true;
	public Class529 aClass529_12032;
	Class564 aClass564_12033;

	public void method407(Class178 class178) {
		aClass529_12032.method8744(class178, 239378250);
	}

	boolean method16701(int i) {
		return false;
	}

	boolean method16702(int i) {
		return aBool12031;
	}

	public Class564 method16707(Class178 class178, byte i) {
		return aClass564_12033;
	}

	public boolean method392(short i) {
		return aClass529_12032.method8742((byte) 96);
	}

	public int method16720() {
		return aClass529_12032.method8737(-962068237);
	}

	public void method18470(Class591 class591, short i) {
		aClass529_12032.method8738(class591, -1798104404);
	}

	Class559 method16744(Class178 class178, byte i) {
		Class167 class167 = aClass529_12032.method8741(class178, 2048, false, true, -763239385);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class559 class559 = Class238.method4306(aBool12029, -280564215);
		int i_0_ = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_1_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		aClass529_12032.method8754(class178, class167, class435, i_0_, i_0_, i_1_, i_1_, true, (byte) -66);
		Class602 class602 = aClass529_12032.method8740((byte) -9);
		if (null != class602.aClass430_7931) {
			class167.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class602.aClass430_7931);
		} else
			class167.method2708(class435, aClass180Array10823[0], 0);
		if (aClass529_12032.aClass621_7119 != null) {
			Class171 class171 = aClass529_12032.aClass621_7119.method10135();
			class178.method3120(class171);
		}
		aBool12031 = class167.method2730() || aClass529_12032.aClass621_7119 != null;
		if (aClass564_12033 == null)
			aClass564_12033 = WorldVarDomainType.method15901((int) (class432.aClass437_4862.aFloat4903), (int) (class432.aClass437_4862.aFloat4904), (int) (class432.aClass437_4862.aFloat4905), class167, -8159449);
		else
			Class46.method1249(aClass564_12033, (int) class432.aClass437_4862.aFloat4903, (int) class432.aClass437_4862.aFloat4904, (int) class432.aClass437_4862.aFloat4905, class167, -826881984);
		return class559;
	}

	public void method358() {
		/* empty */
	}

	boolean method16698(Class178 class178, int i, int i_2_, byte i_3_) {
		Class602 class602 = aClass529_12032.method8740((byte) 12);
		if (class602.aClass430_7931 != null)
			return class178.method3095(i, i_2_, method10585(), class602.aClass430_7931, -8509942);
		Class167 class167 = aClass529_12032.method8741(class178, 131072, false, false, -763239385);
		if (class167 == null)
			return false;
		return class167.method2709(i, i_2_, method10585(), false, 0);
	}

	final boolean method16699(int i) {
		return false;
	}

	public void method404(Class178 class178) {
		aClass529_12032.method8743(class178, (byte) -37);
	}

	final void method16704(byte i) {
		throw new IllegalStateException();
	}

	public int method401(int i) {
		return aClass529_12032.anInt7104 * 241225827;
	}

	public int method69(int i) {
		return 673355279 * aClass529_12032.anInt7105;
	}

	public int method390(int i) {
		return aClass529_12032.anInt7113 * 5257107;
	}

	public void method391(int i) {
		/* empty */
	}

	public boolean method393(int i) {
		return true;
	}

	public Class564 method16721(Class178 class178) {
		return aClass564_12033;
	}

	public Class647_Sub1_Sub4_Sub2(Class560 class560, Class178 class178, Class53_Sub18 class53_sub18, Class602 class602, int i, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class560, i_5_, i_6_, i_7_, i, i_4_, Class647_Sub1_Sub3_Sub1.method18417(i_8_, i_9_, -1274951954));
		aClass529_12032 = new Class529(class178, class53_sub18, class602, i_8_, i_9_, i_4_, this, bool, i_10_, i_11_);
		aBool12029 = 0 != class602.anInt7874 * -344567467 && !bool;
		method16714(1, 1357363026);
	}

	public void method395(Class178 class178, int i) {
		aClass529_12032.method8744(class178, -380222759);
	}

	public int method182() {
		return aClass529_12032.anInt7104 * 241225827;
	}

	public int method86() {
		return 673355279 * aClass529_12032.anInt7105;
	}

	void method16728(Class178 class178) {
		Class167 class167 = aClass529_12032.method8741(class178, 262144, true, true, -763239385);
		if (null != class167) {
			Class435 class435 = method10585();
			Class432 class432 = method10569();
			int i = (int) class432.aClass437_4862.aFloat4903 >> 9;
			int i_12_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
			aClass529_12032.method8754(class178, class167, class435, i, i, i_12_, i_12_, false, (byte) -125);
		}
	}

	void method16706(Class178 class178, short i) {
		Class167 class167 = aClass529_12032.method8741(class178, 262144, true, true, -763239385);
		if (null != class167) {
			Class435 class435 = method10585();
			Class432 class432 = method10569();
			int i_13_ = (int) class432.aClass437_4862.aFloat4903 >> 9;
			int i_14_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
			aClass529_12032.method8754(class178, class167, class435, i_13_, i_13_, i_14_, i_14_, false, (byte) -13);
		}
	}

	public int method397() {
		return aClass529_12032.anInt7113 * 5257107;
	}

	public int method400() {
		return aClass529_12032.anInt7113 * 5257107;
	}

	boolean method16736(Class178 class178, int i, int i_15_) {
		Class602 class602 = aClass529_12032.method8740((byte) -24);
		if (class602.aClass430_7931 != null)
			return class178.method3095(i, i_15_, method10585(), class602.aClass430_7931, 472933252);
		Class167 class167 = aClass529_12032.method8741(class178, 131072, false, false, -763239385);
		if (class167 == null)
			return false;
		return class167.method2709(i, i_15_, method10585(), false, 0);
	}

	boolean method16741() {
		return aBool12031;
	}

	public boolean method402() {
		return aClass529_12032.method8742((byte) 110);
	}

	public boolean method249() {
		return aClass529_12032.method8742((byte) 79);
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
		aClass529_12032.method8743(class178, (byte) -56);
	}

	public void method362() {
		/* empty */
	}

	public void method398(Class178 class178) {
		aClass529_12032.method8744(class178, -551476571);
	}

	final void method16734() {
		throw new IllegalStateException();
	}

	public int method16722() {
		return aClass529_12032.method8761(-1954955172);
	}

	boolean method16715() {
		return false;
	}

	boolean method16716() {
		return aBool12031;
	}

	public void method394(Class178 class178, int i) {
		aClass529_12032.method8743(class178, (byte) 24);
	}

	boolean method16718() {
		return aBool12031;
	}

	public int method16719() {
		return aClass529_12032.method8737(-2016023369);
	}

	public int method88() {
		return 673355279 * aClass529_12032.anInt7105;
	}

	final boolean method16730() {
		return false;
	}

	public void method408(Class178 class178) {
		aClass529_12032.method8744(class178, 645518357);
	}

	final void method16703(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_16_, int i_17_, boolean bool, int i_18_) {
		throw new IllegalStateException();
	}

	Class559 method16724(Class178 class178) {
		Class167 class167 = aClass529_12032.method8741(class178, 2048, false, true, -763239385);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class559 class559 = Class238.method4306(aBool12029, -1851745166);
		int i = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_19_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		aClass529_12032.method8754(class178, class167, class435, i, i, i_19_, i_19_, true, (byte) -69);
		Class602 class602 = aClass529_12032.method8740((byte) 13);
		if (null != class602.aClass430_7931) {
			class167.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class602.aClass430_7931);
		} else
			class167.method2708(class435, aClass180Array10823[0], 0);
		if (aClass529_12032.aClass621_7119 != null) {
			Class171 class171 = aClass529_12032.aClass621_7119.method10135();
			class178.method3120(class171);
		}
		aBool12031 = class167.method2730() || aClass529_12032.aClass621_7119 != null;
		if (aClass564_12033 == null)
			aClass564_12033 = WorldVarDomainType.method15901((int) (class432.aClass437_4862.aFloat4903), (int) (class432.aClass437_4862.aFloat4904), (int) (class432.aClass437_4862.aFloat4905), class167, -1030321056);
		else
			Class46.method1249(aClass564_12033, (int) class432.aClass437_4862.aFloat4903, (int) class432.aClass437_4862.aFloat4904, (int) class432.aClass437_4862.aFloat4905, class167, 1656117459);
		return class559;
	}

	Class559 method16725(Class178 class178) {
		Class167 class167 = aClass529_12032.method8741(class178, 2048, false, true, -763239385);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class559 class559 = Class238.method4306(aBool12029, 1402737373);
		int i = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_20_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		aClass529_12032.method8754(class178, class167, class435, i, i, i_20_, i_20_, true, (byte) -74);
		Class602 class602 = aClass529_12032.method8740((byte) -85);
		if (null != class602.aClass430_7931) {
			class167.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class602.aClass430_7931);
		} else
			class167.method2708(class435, aClass180Array10823[0], 0);
		if (aClass529_12032.aClass621_7119 != null) {
			Class171 class171 = aClass529_12032.aClass621_7119.method10135();
			class178.method3120(class171);
		}
		aBool12031 = class167.method2730() || aClass529_12032.aClass621_7119 != null;
		if (aClass564_12033 == null)
			aClass564_12033 = WorldVarDomainType.method15901((int) (class432.aClass437_4862.aFloat4903), (int) (class432.aClass437_4862.aFloat4904), (int) (class432.aClass437_4862.aFloat4905), class167, 457147575);
		else
			Class46.method1249(aClass564_12033, (int) class432.aClass437_4862.aFloat4903, (int) class432.aClass437_4862.aFloat4904, (int) class432.aClass437_4862.aFloat4905, class167, -1830380663);
		return class559;
	}

	Class559 method16726(Class178 class178) {
		Class167 class167 = aClass529_12032.method8741(class178, 2048, false, true, -763239385);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		Class432 class432 = method10569();
		Class559 class559 = Class238.method4306(aBool12029, -1792650912);
		int i = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_21_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		aClass529_12032.method8754(class178, class167, class435, i, i, i_21_, i_21_, true, (byte) -40);
		Class602 class602 = aClass529_12032.method8740((byte) 35);
		if (null != class602.aClass430_7931) {
			class167.method2708(class435, null, 0);
			class178.method3055(class435, aClass180Array10823[0], class602.aClass430_7931);
		} else
			class167.method2708(class435, aClass180Array10823[0], 0);
		if (aClass529_12032.aClass621_7119 != null) {
			Class171 class171 = aClass529_12032.aClass621_7119.method10135();
			class178.method3120(class171);
		}
		aBool12031 = class167.method2730() || aClass529_12032.aClass621_7119 != null;
		if (aClass564_12033 == null)
			aClass564_12033 = WorldVarDomainType.method15901((int) (class432.aClass437_4862.aFloat4903), (int) (class432.aClass437_4862.aFloat4904), (int) (class432.aClass437_4862.aFloat4905), class167, -1902901297);
		else
			Class46.method1249(aClass564_12033, (int) class432.aClass437_4862.aFloat4903, (int) class432.aClass437_4862.aFloat4904, (int) class432.aClass437_4862.aFloat4905, class167, -687757533);
		return class559;
	}

	void method16727(Class178 class178) {
		Class167 class167 = aClass529_12032.method8741(class178, 262144, true, true, -763239385);
		if (null != class167) {
			Class435 class435 = method10585();
			Class432 class432 = method10569();
			int i = (int) class432.aClass437_4862.aFloat4903 >> 9;
			int i_22_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
			aClass529_12032.method8754(class178, class167, class435, i, i, i_22_, i_22_, false, (byte) -68);
		}
	}

	final boolean method16731() {
		return false;
	}

	void method16756(Class178 class178) {
		Class167 class167 = aClass529_12032.method8741(class178, 262144, true, true, -763239385);
		if (null != class167) {
			Class435 class435 = method10585();
			Class432 class432 = method10569();
			int i = (int) class432.aClass437_4862.aFloat4903 >> 9;
			int i_23_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
			aClass529_12032.method8754(class178, class167, class435, i, i, i_23_, i_23_, false, (byte) -58);
		}
	}

	public int method16723() {
		return aClass529_12032.method8761(1522776627);
	}

	public int method16740(int i) {
		return aClass529_12032.method8761(-41316937);
	}

	final void method16732(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_24_, int i_25_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method16697() {
		throw new IllegalStateException();
	}

	public int method396() {
		return 673355279 * aClass529_12032.anInt7105;
	}

	public int method16743(int i) {
		return aClass529_12032.method8737(-651413113);
	}

	final void method16735() {
		throw new IllegalStateException();
	}

	boolean method16713(Class178 class178, int i, int i_26_) {
		Class602 class602 = aClass529_12032.method8740((byte) 52);
		if (class602.aClass430_7931 != null)
			return class178.method3095(i, i_26_, method10585(), class602.aClass430_7931, 395819366);
		Class167 class167 = aClass529_12032.method8741(class178, 131072, false, false, -763239385);
		if (class167 == null)
			return false;
		return class167.method2709(i, i_26_, method10585(), false, 0);
	}

	static int method18471(int i, int i_27_) {
		if (1923531495 * Class607.aClass607_7964.anInt7982 == i || 1923531495 * Class607.aClass607_7966.anInt7982 == i)
			return anIntArray12030[i_27_ & 0x3];
		return anIntArray12028[i_27_ & 0x3];
	}

	static int method18472(int i, int i_28_) {
		if (1923531495 * Class607.aClass607_7964.anInt7982 == i || 1923531495 * Class607.aClass607_7966.anInt7982 == i)
			return anIntArray12030[i_28_ & 0x3];
		return anIntArray12028[i_28_ & 0x3];
	}

	public void method18473(Class591 class591) {
		aClass529_12032.method8738(class591, -555789776);
	}
}
