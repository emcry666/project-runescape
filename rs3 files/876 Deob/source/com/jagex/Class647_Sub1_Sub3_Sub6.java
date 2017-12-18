/* Class647_Sub1_Sub3_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647_Sub1_Sub3_Sub6 extends Class647_Sub1_Sub3 {
	Class707 aClass707_12133;
	int anInt12134;
	public int anInt12135;
	public int anInt12136;
	public int anInt12137;
	double aDouble12138;
	int anInt12139;
	int anInt12140;
	int anInt12141;
	int anInt12142;
	boolean aBool12143;
	int anInt12144;
	double aDouble12145;
	double aDouble12146;
	double aDouble12147;
	boolean aBool12148 = false;
	int anInt12149;
	boolean aBool12150;
	int anInt12151 = 0;
	double aDouble12152;
	Class621 aClass621_12153;
	public int anInt12154;

	Class559 method16724(Class178 class178) {
		Class167 class167 = method18599(class178, 2048, (short) 1797);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		method18601(class178, class167, class435, 494110928);
		Class559 class559 = Class238.method4306(false, 986111282);
		class167.method2708(class435, aClass180Array10823[0], 0);
		if (null != aClass621_12153) {
			Class171 class171 = aClass621_12153.method10135();
			class178.method3120(class171);
		}
		aBool12150 = class167.method2730();
		class167.method2834();
		anInt12151 = class167.method2804() * 1908596449;
		return class559;
	}

	public int method16743(int i) {
		return -557652703 * anInt12151;
	}

	boolean method16701(int i) {
		return false;
	}

	public Class564 method16707(Class178 class178, byte i) {
		return null;
	}

	boolean method16713(Class178 class178, int i, int i_0_) {
		return false;
	}

	public int method16719() {
		return -557652703 * anInt12151;
	}

	public final void method18596(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		if (!aBool12148) {
			float f = (float) i - class437.aFloat4903;
			float f_5_ = (float) i_1_ - class437.aFloat4905;
			float f_6_ = (float) Math.sqrt((double) (f * f + f_5_ * f_5_));
			if (0.0F != f_6_) {
				class437.aFloat4903 += f * (float) (-1246979745 * anInt12139) / f_6_;
				class437.aFloat4905 += (float) (-1246979745 * anInt12139) * f_5_ / f_6_;
			}
			if (aBool12143)
				class437.aFloat4904 = (float) (Class53_Sub17.method17220((int) (class437.aFloat4903), (int) (class437.aFloat4905), aByte10821, 180810105) - anInt12141 * 901573705);
			method10573(class437);
		}
		double d = (double) (-82135273 * anInt12137 + 1 - i_3_);
		aDouble12145 = (double) ((float) i - class437.aFloat4903) / d;
		aDouble12146 = (double) ((float) i_1_ - class437.aFloat4905) / d;
		aDouble12147 = Math.sqrt(aDouble12145 * aDouble12145 + aDouble12146 * aDouble12146);
		if (905479335 * anInt12144 != -1) {
			if (!aBool12148)
				aDouble12152 = (-aDouble12147 * Math.tan(0.02454369 * (double) (905479335 * anInt12144)));
			aDouble12138 = 2.0 * ((double) ((float) i_2_ - class437.aFloat4904) - aDouble12152 * d) / (d * d);
		} else
			aDouble12152 = (double) ((float) i_2_ - class437.aFloat4904) / d;
		class437.method6949();
	}

	public void method18597(byte i) {
		if (!aBool12148) {
			if (0 != -328254917 * anInt12140) {
				Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = null;
				if (-1616721887 * client.anInt11071 == 4)
					class647_sub1_sub3_sub1 = Class191.aClass192Array2157[-328254917 * anInt12140 - 1].method3631(376132197);
				else if (anInt12140 * -328254917 < 0) {
					int i_7_ = -(anInt12140 * -328254917) - 1;
					if (i_7_ == client.anInt11154 * 1109726117)
						class647_sub1_sub3_sub1 = Class241.player;
					else
						class647_sub1_sub3_sub1 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_7_]);
				} else {
					int i_8_ = -328254917 * anInt12140 - 1;
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i_8_));
					if (class523_sub28 != null)
						class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554);
				}
				if (null != class647_sub1_sub3_sub1) {
					Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
					method10574(class437.aFloat4903, (float) ((Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, aByte10821, -1008360196)) - 901573705 * anInt12141), class437.aFloat4905);
					if (-590573391 * anInt12142 >= 0) {
						Class588 class588 = class647_sub1_sub3_sub1.method18352(-175890435);
						int i_9_ = 0;
						int i_10_ = 0;
						if (class588.anIntArrayArray7776 != null && (class588.anIntArrayArray7776[-590573391 * anInt12142]) != null) {
							i_9_ += (class588.anIntArrayArray7776[-590573391 * anInt12142][0]);
							i_10_ += (class588.anIntArrayArray7776[-590573391 * anInt12142][2]);
						}
						if (class588.anIntArrayArray7768 != null && null != (class588.anIntArrayArray7768[anInt12142 * -590573391])) {
							i_9_ += (class588.anIntArrayArray7768[anInt12142 * -590573391][0]);
							i_10_ += (class588.anIntArrayArray7768[-590573391 * anInt12142][2]);
						}
						if (i_9_ != 0 || i_10_ != 0) {
							int i_11_ = class647_sub1_sub3_sub1.aClass72_11938.method1494((byte) 49);
							int i_12_ = i_11_;
							if (null != class647_sub1_sub3_sub1.anIntArray11934 && -1 != (class647_sub1_sub3_sub1.anIntArray11934[anInt12142 * -590573391]))
								i_12_ = (class647_sub1_sub3_sub1.anIntArray11934[-590573391 * anInt12142]);
							int i_13_ = i_12_ - i_11_ & 0x3fff;
							int i_14_ = Class433.anIntArray4880[i_13_];
							int i_15_ = Class433.anIntArray4881[i_13_];
							int i_16_ = i_14_ * i_10_ + i_15_ * i_9_ >> 14;
							i_10_ = i_15_ * i_10_ - i_9_ * i_14_ >> 14;
							i_9_ = i_16_;
							Class437 class437_17_ = Class437.method6884(method10569().aClass437_4862);
							class437_17_.aFloat4903 += (float) i_9_;
							class437_17_.aFloat4905 += (float) i_10_;
							method10573(class437_17_);
							class437_17_.method6949();
						}
					}
				}
			}
		}
	}

	public int method18598() {
		return anInt12149 * 1864343149;
	}

	Class167 method18599(Class178 class178, int i, short i_18_) {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(anInt12134 * 1787833857, (byte) 17));
		return class671.method13703(class178, i, aClass707_12133, (byte) 2, (byte) 93);
	}

	Class559 method16744(Class178 class178, byte i) {
		Class167 class167 = method18599(class178, 2048, (short) 10406);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		method18601(class178, class167, class435, 208975397);
		Class559 class559 = Class238.method4306(false, 1550656284);
		class167.method2708(class435, aClass180Array10823[0], 0);
		if (null != aClass621_12153) {
			Class171 class171 = aClass621_12153.method10135();
			class178.method3120(class171);
		}
		aBool12150 = class167.method2730();
		class167.method2834();
		anInt12151 = class167.method2804() * 1908596449;
		return class559;
	}

	void method16706(Class178 class178, short i) {
		Class167 class167 = method18599(class178, 0, (short) 19500);
		if (class167 != null) {
			Class435 class435 = method10585();
			anInt12151 = class167.method2804() * 1908596449;
			class167.method2834();
			method18601(class178, class167, class435, -1481227639);
		}
	}

	void method18158(int i) {
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = aShort11749 = (short) (int) (class437.aFloat4903 / 512.0F);
		aShort11751 = aShort11752 = (short) (int) (class437.aFloat4905 / 512.0F);
	}

	void method18159() {
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = aShort11749 = (short) (int) (class437.aFloat4903 / 512.0F);
		aShort11751 = aShort11752 = (short) (int) (class437.aFloat4905 / 512.0F);
	}

	public void method18600(int i) {
		if (aClass621_12153 != null)
			aClass621_12153.method10123();
	}

	boolean method16698(Class178 class178, int i, int i_19_, byte i_20_) {
		return false;
	}

	final boolean method16699(int i) {
		return false;
	}

	void method18601(Class178 class178, Class167 class167, Class435 class435, int i) {
		class167.method2732(class435);
		Class184[] class184s = class167.method2733();
		Class143[] class143s = class167.method2734();
		if ((null == aClass621_12153 || aClass621_12153.aBool8083) && (class184s != null || null != class143s))
			aClass621_12153 = Class621.method10149(client.cycles, true);
		if (aClass621_12153 != null) {
			aClass621_12153.method10129(class178, (long) client.cycles, class184s, class143s, false);
			aClass621_12153.method10133(aByte10821, aShort11750, aShort11749, aShort11751, aShort11752);
		}
	}

	final void method16704(byte i) {
		throw new IllegalStateException();
	}

	boolean method16715() {
		return false;
	}

	boolean method16716() {
		return aBool12150;
	}

	boolean method16741() {
		return aBool12150;
	}

	boolean method16718() {
		return aBool12150;
	}

	public void method18602() {
		if (!aBool12148) {
			if (0 != -328254917 * anInt12140) {
				Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = null;
				if (-1616721887 * client.anInt11071 == 4)
					class647_sub1_sub3_sub1 = Class191.aClass192Array2157[-328254917 * anInt12140 - 1].method3631(1003148516);
				else if (anInt12140 * -328254917 < 0) {
					int i = -(anInt12140 * -328254917) - 1;
					if (i == client.anInt11154 * 1109726117)
						class647_sub1_sub3_sub1 = Class241.player;
					else
						class647_sub1_sub3_sub1 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i]);
				} else {
					int i = -328254917 * anInt12140 - 1;
					Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.getFromIndex((long) i));
					if (class523_sub28 != null)
						class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) class523_sub28.anObject10554);
				}
				if (null != class647_sub1_sub3_sub1) {
					Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
					method10574(class437.aFloat4903, (float) ((Class53_Sub17.method17220((int) class437.aFloat4903, (int) class437.aFloat4905, aByte10821, 1308316948)) - 901573705 * anInt12141), class437.aFloat4905);
					if (-590573391 * anInt12142 >= 0) {
						Class588 class588 = class647_sub1_sub3_sub1.method18352(46293720);
						int i = 0;
						int i_21_ = 0;
						if (class588.anIntArrayArray7776 != null && (class588.anIntArrayArray7776[-590573391 * anInt12142]) != null) {
							i += (class588.anIntArrayArray7776[-590573391 * anInt12142][0]);
							i_21_ += (class588.anIntArrayArray7776[-590573391 * anInt12142][2]);
						}
						if (class588.anIntArrayArray7768 != null && null != (class588.anIntArrayArray7768[anInt12142 * -590573391])) {
							i += (class588.anIntArrayArray7768[anInt12142 * -590573391][0]);
							i_21_ += (class588.anIntArrayArray7768[-590573391 * anInt12142][2]);
						}
						if (i != 0 || i_21_ != 0) {
							int i_22_ = class647_sub1_sub3_sub1.aClass72_11938.method1494((byte) 127);
							int i_23_ = i_22_;
							if (null != class647_sub1_sub3_sub1.anIntArray11934 && -1 != (class647_sub1_sub3_sub1.anIntArray11934[anInt12142 * -590573391]))
								i_23_ = (class647_sub1_sub3_sub1.anIntArray11934[-590573391 * anInt12142]);
							int i_24_ = i_23_ - i_22_ & 0x3fff;
							int i_25_ = Class433.anIntArray4880[i_24_];
							int i_26_ = Class433.anIntArray4881[i_24_];
							int i_27_ = i_25_ * i_21_ + i_26_ * i >> 14;
							i_21_ = i_26_ * i_21_ - i * i_25_ >> 14;
							i = i_27_;
							Class437 class437_28_ = Class437.method6884(method10569().aClass437_4862);
							class437_28_.aFloat4903 += (float) i;
							class437_28_.aFloat4905 += (float) i_21_;
							method10573(class437_28_);
							class437_28_.method6949();
						}
					}
				}
			}
		}
	}

	public int method16720() {
		return -557652703 * anInt12151;
	}

	public Class564 method16721(Class178 class178) {
		return null;
	}

	final void method16703(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_29_, int i_30_, boolean bool, int i_31_) {
		throw new IllegalStateException();
	}

	Class559 method16725(Class178 class178) {
		Class167 class167 = method18599(class178, 2048, (short) 27105);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		method18601(class178, class167, class435, -1196287775);
		Class559 class559 = Class238.method4306(false, -1056210066);
		class167.method2708(class435, aClass180Array10823[0], 0);
		if (null != aClass621_12153) {
			Class171 class171 = aClass621_12153.method10135();
			class178.method3120(class171);
		}
		aBool12150 = class167.method2730();
		class167.method2834();
		anInt12151 = class167.method2804() * 1908596449;
		return class559;
	}

	Class559 method16726(Class178 class178) {
		Class167 class167 = method18599(class178, 2048, (short) 31243);
		if (class167 == null)
			return null;
		Class435 class435 = method10585();
		method18601(class178, class167, class435, -1837408699);
		Class559 class559 = Class238.method4306(false, -790547786);
		class167.method2708(class435, aClass180Array10823[0], 0);
		if (null != aClass621_12153) {
			Class171 class171 = aClass621_12153.method10135();
			class178.method3120(class171);
		}
		aBool12150 = class167.method2730();
		class167.method2834();
		anInt12151 = class167.method2804() * 1908596449;
		return class559;
	}

	public void method18603() {
		if (aClass621_12153 != null)
			aClass621_12153.method10123();
	}

	void method16728(Class178 class178) {
		Class167 class167 = method18599(class178, 0, (short) 13434);
		if (class167 != null) {
			Class435 class435 = method10585();
			anInt12151 = class167.method2804() * 1908596449;
			class167.method2834();
			method18601(class178, class167, class435, -2026911059);
		}
	}

	void method16756(Class178 class178) {
		Class167 class167 = method18599(class178, 0, (short) 16408);
		if (class167 != null) {
			Class435 class435 = method10585();
			anInt12151 = class167.method2804() * 1908596449;
			class167.method2834();
			method18601(class178, class167, class435, -560423897);
		}
	}

	final boolean method16730() {
		return false;
	}

	final boolean method16731() {
		return false;
	}

	final void method16732(Class178 class178, Class647_Sub1 class647_sub1, int i, int i_32_, int i_33_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method16697() {
		throw new IllegalStateException();
	}

	final void method16734() {
		throw new IllegalStateException();
	}

	final void method16735() {
		throw new IllegalStateException();
	}

	void method16727(Class178 class178) {
		Class167 class167 = method18599(class178, 0, (short) 32247);
		if (class167 != null) {
			Class435 class435 = method10585();
			anInt12151 = class167.method2804() * 1908596449;
			class167.method2834();
			method18601(class178, class167, class435, -8907649);
		}
	}

	public final void method18604(int i) {
		aBool12148 = true;
		Class432 class432 = new Class432(method10569());
		class432.aClass437_4862.aFloat4903 += aDouble12145 * (double) i;
		class432.aClass437_4862.aFloat4905 += aDouble12146 * (double) i;
		if (aBool12143)
			class432.aClass437_4862.aFloat4904 = (float) (Class53_Sub17.method17220((int) (class432.aClass437_4862.aFloat4903), (int) (class432.aClass437_4862.aFloat4905), aByte10821, 2125276712) - 901573705 * anInt12141);
		else if (905479335 * anInt12144 != -1) {
			class432.aClass437_4862.aFloat4904 += ((double) i * (0.5 * aDouble12138) * (double) i + aDouble12152 * (double) i);
			aDouble12152 += (double) i * aDouble12138;
		} else
			class432.aClass437_4862.aFloat4904 += (double) i * aDouble12152;
		class432.aClass440_4863.method7017(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12152, aDouble12147));
		Class440 class440 = Class440.method7063();
		class440.method7017(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12145, aDouble12146) - 3.1415927F));
		class432.aClass440_4863.method7042(class440);
		class440.method7011();
		method10575(class432);
		if (aClass707_12133.method14205(1, (byte) 7) && aClass707_12133.method14177(1357652815))
			aClass707_12133.method14217(-396027230);
	}

	public final void method18605(int i, byte i_34_) {
		aBool12148 = true;
		Class432 class432 = new Class432(method10569());
		class432.aClass437_4862.aFloat4903 += aDouble12145 * (double) i;
		class432.aClass437_4862.aFloat4905 += aDouble12146 * (double) i;
		if (aBool12143)
			class432.aClass437_4862.aFloat4904 = (float) (Class53_Sub17.method17220((int) (class432.aClass437_4862.aFloat4903), (int) (class432.aClass437_4862.aFloat4905), aByte10821, -585887583) - 901573705 * anInt12141);
		else if (905479335 * anInt12144 != -1) {
			class432.aClass437_4862.aFloat4904 += ((double) i * (0.5 * aDouble12138) * (double) i + aDouble12152 * (double) i);
			aDouble12152 += (double) i * aDouble12138;
		} else
			class432.aClass437_4862.aFloat4904 += (double) i * aDouble12152;
		class432.aClass440_4863.method7017(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble12152, aDouble12147));
		Class440 class440 = Class440.method7063();
		class440.method7017(0.0F, 1.0F, 0.0F, ((float) Math.atan2(aDouble12145, aDouble12146) - 3.1415927F));
		class432.aClass440_4863.method7042(class440);
		class440.method7011();
		method10575(class432);
		if (aClass707_12133.method14205(1, (byte) 49) && aClass707_12133.method14177(1357652815))
			aClass707_12133.method14217(-263241003);
	}

	public Class647_Sub1_Sub3_Sub6(Class560 class560, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, boolean bool, int i_47_, int i_48_) {
		super(class560, i_35_, i_36_, i_37_, (Class53_Sub17.method17220(i_37_, i_38_, i_35_, 2025492863) - i_39_), i_38_, i_37_ >> 9, i_37_ >> 9, i_38_ >> 9, i_38_ >> 9, false, (byte) 0);
		aBool12150 = false;
		anInt12149 = 0;
		anInt12134 = i * 632541697;
		anInt12136 = -198686551 * i_40_;
		anInt12137 = i_41_ * -308547417;
		anInt12144 = i_42_ * -1273699561;
		anInt12139 = -1012530529 * i_43_;
		anInt12140 = i_44_ * -278032653;
		anInt12154 = -415816929 * i_45_;
		anInt12141 = i_39_ * -1977956871;
		anInt12135 = 31198315 * i_46_;
		aBool12143 = bool;
		aBool12148 = false;
		anInt12142 = -1451771823 * i_47_;
		anInt12149 = 930421605 * i_48_;
		int i_49_ = (((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(1787833857 * anInt12134, (byte) 76)).emoteId * -61429051);
		aClass707_12133 = new Class707_Sub2(this, false);
		aClass707_12133.method14164(i_49_, (byte) 12);
		method16714(1, -976766672);
	}

	boolean method16736(Class178 class178, int i, int i_50_) {
		return false;
	}

	public void method18606() {
		if (aClass621_12153 != null)
			aClass621_12153.method10123();
	}

	public final void method18607(int i, int i_51_, int i_52_, int i_53_) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		if (!aBool12148) {
			float f = (float) i - class437.aFloat4903;
			float f_54_ = (float) i_51_ - class437.aFloat4905;
			float f_55_ = (float) Math.sqrt((double) (f * f + f_54_ * f_54_));
			if (0.0F != f_55_) {
				class437.aFloat4903 += f * (float) (-1246979745 * anInt12139) / f_55_;
				class437.aFloat4905 += (float) (-1246979745 * anInt12139) * f_54_ / f_55_;
			}
			if (aBool12143)
				class437.aFloat4904 = (float) (Class53_Sub17.method17220((int) (class437.aFloat4903), (int) (class437.aFloat4905), aByte10821, 1516774707) - anInt12141 * 901573705);
			method10573(class437);
		}
		double d = (double) (-82135273 * anInt12137 + 1 - i_53_);
		aDouble12145 = (double) ((float) i - class437.aFloat4903) / d;
		aDouble12146 = (double) ((float) i_51_ - class437.aFloat4905) / d;
		aDouble12147 = Math.sqrt(aDouble12145 * aDouble12145 + aDouble12146 * aDouble12146);
		if (905479335 * anInt12144 != -1) {
			if (!aBool12148)
				aDouble12152 = (-aDouble12147 * Math.tan(0.02454369 * (double) (905479335 * anInt12144)));
			aDouble12138 = 2.0 * ((double) ((float) i_52_ - class437.aFloat4904) - aDouble12152 * d) / (d * d);
		} else
			aDouble12152 = (double) ((float) i_52_ - class437.aFloat4904) / d;
		class437.method6949();
	}

	public final void method18608(int i, int i_56_, int i_57_, int i_58_) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		if (!aBool12148) {
			float f = (float) i - class437.aFloat4903;
			float f_59_ = (float) i_56_ - class437.aFloat4905;
			float f_60_ = (float) Math.sqrt((double) (f * f + f_59_ * f_59_));
			if (0.0F != f_60_) {
				class437.aFloat4903 += f * (float) (-1246979745 * anInt12139) / f_60_;
				class437.aFloat4905 += (float) (-1246979745 * anInt12139) * f_59_ / f_60_;
			}
			if (aBool12143)
				class437.aFloat4904 = (float) (Class53_Sub17.method17220((int) (class437.aFloat4903), (int) (class437.aFloat4905), aByte10821, 192504495) - anInt12141 * 901573705);
			method10573(class437);
		}
		double d = (double) (-82135273 * anInt12137 + 1 - i_58_);
		aDouble12145 = (double) ((float) i - class437.aFloat4903) / d;
		aDouble12146 = (double) ((float) i_56_ - class437.aFloat4905) / d;
		aDouble12147 = Math.sqrt(aDouble12145 * aDouble12145 + aDouble12146 * aDouble12146);
		if (905479335 * anInt12144 != -1) {
			if (!aBool12148)
				aDouble12152 = (-aDouble12147 * Math.tan(0.02454369 * (double) (905479335 * anInt12144)));
			aDouble12138 = 2.0 * ((double) ((float) i_57_ - class437.aFloat4904) - aDouble12152 * d) / (d * d);
		} else
			aDouble12152 = (double) ((float) i_57_ - class437.aFloat4904) / d;
		class437.method6949();
	}

	public final void method18609(int i, int i_61_, int i_62_, int i_63_) {
		Class437 class437 = Class437.method6884(method10569().aClass437_4862);
		if (!aBool12148) {
			float f = (float) i - class437.aFloat4903;
			float f_64_ = (float) i_61_ - class437.aFloat4905;
			float f_65_ = (float) Math.sqrt((double) (f * f + f_64_ * f_64_));
			if (0.0F != f_65_) {
				class437.aFloat4903 += f * (float) (-1246979745 * anInt12139) / f_65_;
				class437.aFloat4905 += (float) (-1246979745 * anInt12139) * f_64_ / f_65_;
			}
			if (aBool12143)
				class437.aFloat4904 = (float) (Class53_Sub17.method17220((int) (class437.aFloat4903), (int) (class437.aFloat4905), aByte10821, 276879868) - anInt12141 * 901573705);
			method10573(class437);
		}
		double d = (double) (-82135273 * anInt12137 + 1 - i_63_);
		aDouble12145 = (double) ((float) i - class437.aFloat4903) / d;
		aDouble12146 = (double) ((float) i_61_ - class437.aFloat4905) / d;
		aDouble12147 = Math.sqrt(aDouble12145 * aDouble12145 + aDouble12146 * aDouble12146);
		if (905479335 * anInt12144 != -1) {
			if (!aBool12148)
				aDouble12152 = (-aDouble12147 * Math.tan(0.02454369 * (double) (905479335 * anInt12144)));
			aDouble12138 = 2.0 * ((double) ((float) i_62_ - class437.aFloat4904) - aDouble12152 * d) / (d * d);
		} else
			aDouble12152 = (double) ((float) i_62_ - class437.aFloat4904) / d;
		class437.method6949();
	}

	public int method18610(int i) {
		return anInt12149 * 1864343149;
	}

	void method18161() {
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = aShort11749 = (short) (int) (class437.aFloat4903 / 512.0F);
		aShort11751 = aShort11752 = (short) (int) (class437.aFloat4905 / 512.0F);
	}

	void method18160() {
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = aShort11749 = (short) (int) (class437.aFloat4903 / 512.0F);
		aShort11751 = aShort11752 = (short) (int) (class437.aFloat4905 / 512.0F);
	}

	void method18611(Class178 class178, Class167 class167, Class435 class435) {
		class167.method2732(class435);
		Class184[] class184s = class167.method2733();
		Class143[] class143s = class167.method2734();
		if ((null == aClass621_12153 || aClass621_12153.aBool8083) && (class184s != null || null != class143s))
			aClass621_12153 = Class621.method10149(client.cycles, true);
		if (aClass621_12153 != null) {
			aClass621_12153.method10129(class178, (long) client.cycles, class184s, class143s, false);
			aClass621_12153.method10133(aByte10821, aShort11750, aShort11749, aShort11751, aShort11752);
		}
	}

	void method18612(Class178 class178, Class167 class167, Class435 class435) {
		class167.method2732(class435);
		Class184[] class184s = class167.method2733();
		Class143[] class143s = class167.method2734();
		if ((null == aClass621_12153 || aClass621_12153.aBool8083) && (class184s != null || null != class143s))
			aClass621_12153 = Class621.method10149(client.cycles, true);
		if (aClass621_12153 != null) {
			aClass621_12153.method10129(class178, (long) client.cycles, class184s, class143s, false);
			aClass621_12153.method10133(aByte10821, aShort11750, aShort11749, aShort11751, aShort11752);
		}
	}

	boolean method16702(int i) {
		return aBool12150;
	}

	Class167 method18613(Class178 class178, int i) {
		GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(anInt12134 * 1787833857, (byte) 16));
		return class671.method13703(class178, i, aClass707_12133, (byte) 2, (byte) 68);
	}

	public void method18614() {
		if (aClass621_12153 != null)
			aClass621_12153.method10123();
	}
}
