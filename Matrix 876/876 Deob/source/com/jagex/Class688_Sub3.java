/* Class688_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class688_Sub3 extends Class688 {
	static float aFloat10937;
	Class440 aClass440_10938;
	static float aFloat10939;
	static int anInt10940 = 0;
	static int anInt10941;
	static int anInt10942;
	static float aFloat10943;
	static float aFloat10944;
	Class440 aClass440_10945 = new Class440();
	static int anInt10946 = 0;
	static float aFloat10947;
	static float aFloat10948;

	public Class437 method13921() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1476685957));
		return class437;
	}

	public void method17099(Class440 class440, short i) {
		aClass440_10938.aFloat4909 = class440.aFloat4909;
		aClass440_10938.aFloat4913 = class440.aFloat4913;
		aClass440_10938.aFloat4912 = class440.aFloat4912;
		aClass440_10938.aFloat4915 = class440.aFloat4915;
		aClass440_10945.method7015(aClass440_10938);
	}

	public void method17100(int i, int i_0_) {
		anInt10940 = -1937519637 * i;
	}

	public void method17101(int i, byte i_1_) {
		anInt10946 = 1865634181 * i;
	}

	public void method17102(int i, int i_2_) {
		anInt10941 = i * 1250932983;
	}

	public void method17103(int i, int i_3_) {
		anInt10942 = i * 1327017763;
	}

	public Class437 method13909(int i) {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10945));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1633902291));
		return class437;
	}

	public Class437 method13908(int i) {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(828118871));
		return class437;
	}

	public void method17104(int i, int i_4_, int i_5_, int i_6_) {
		Class435 class435 = new Class435();
		class435.method6807(0.0, 0.0, 0.0, (double) i, (double) -i_4_, (double) i_5_, 0.0F, 1.0F, 0.0F);
		Class442 class442 = new Class442();
		class435.method6827(class442.aFloatArray4918);
		Class440 class440 = class442.method7197();
		class440.method7021();
		aClass440_10945.method7015(class440);
	}

	public void method17105(Class437 class437, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		aFloat10943 = -1 == i ? -1.0F : class437.aFloat4903 - (float) (512 * i);
		aFloat10944 = i_7_ == -1 ? -1.0F : (float) (512 * i_7_) + class437.aFloat4903;
		aFloat10947 = -1 == i_10_ ? -1.0F : -class437.aFloat4904 - (float) (512 * i_10_);
		aFloat10948 = i_11_ == -1 ? -1.0F : -class437.aFloat4904 + (float) (512 * i_11_);
		aFloat10937 = -1 == i_8_ ? -1.0F : class437.aFloat4905 - (float) (512 * i_8_);
		aFloat10939 = -1 == i_9_ ? -1.0F : (float) (i_9_ * 512) + class437.aFloat4905;
	}

	public Class440 method17106() {
		return new Class440(aClass440_10945);
	}

	public boolean method13906(int i) {
		return (!Float.isNaN(aClass440_10945.aFloat4909) && aClass298_8675.method5378(987590067) != null);
	}

	public void method13925(RSBuffer class523_sub34) {
		aClass440_10945.method7013(class523_sub34);
	}

	public Class440 method17107(byte i) {
		return new Class440(aClass440_10945);
	}

	public Class437 method13905() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1959375866));
		return class437;
	}

	public void method13910(RSBuffer class523_sub34, int i) {
		aClass440_10945.method7013(class523_sub34);
	}

	static {
		anInt10941 = 0;
		anInt10942 = 0;
		aFloat10943 = -1.0F;
		aFloat10944 = -1.0F;
		aFloat10947 = -1.0F;
		aFloat10948 = -1.0F;
		aFloat10937 = -1.0F;
		aFloat10939 = -1.0F;
	}

	public void method13911(float f) {
		Class440 class440 = method17107((byte) -84);
		if (-1169947453 * anInt10940 != 0 || 0 != 570031949 * anInt10946) {
			Class440 class440_13_ = Class440.method7063();
			class440_13_.method7017(1.0F, 0.0F, 0.0F, ((float) (2.0 * (3.141592653589793 * (double) (anInt10940 * -1169947453))) / 16384.0F));
			class440.method7042(class440_13_);
			Class437 class437 = Class437.method6879(0.0F, 1.0F, 0.0F);
			class437.method6907(class440);
			Class440 class440_14_ = Class440.method7063();
			class437.method6890();
			class440_14_.method7016(class437, ((float) (2.0 * (3.141592653589793 * (double) (570031949 * anInt10946))) / 16384.0F));
			class440.method7042(class440_14_);
			method17099(class440, (short) 8092);
			anInt10940 = 0;
			anInt10946 = 0;
		}
		if (aClass298_8675.method5342(-1390175100) == Class291.aClass291_3151 && (0 != -216233785 * anInt10941 || anInt10942 * 180746379 != 0)) {
			class440.method7021();
			Class328_Sub1 class328_sub1 = (Class328_Sub1) aClass298_8675.method5430(1437211435);
			Class523_Sub29 class523_sub29 = class328_sub1.method5763((byte) -66);
			Class437 class437 = class523_sub29.method16163((byte) -72);
			Class437 class437_15_ = Class437.method6879(0.0F, 0.0F, (float) (anInt10942 * 180746379));
			class437_15_.method6907(class440);
			class437_15_.aFloat4904 *= -1.0F;
			class437.method6961(class437_15_);
			Class437 class437_16_ = Class437.method6879((float) (-216233785 * anInt10941), 0.0F, 0.0F);
			class437_16_.method6907(class440);
			class437_16_.aFloat4904 *= -1.0F;
			class437.method6961(class437_16_);
			method17108(class437, 1364954490);
			class328_sub1.method15568(new Class523_Sub29(249244125 * class523_sub29.anInt10557, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905), (byte) 1);
			anInt10941 = 0;
			anInt10942 = 0;
		}
	}

	public void method13912(float f) {
		Class440 class440 = method17107((byte) -113);
		if (-1169947453 * anInt10940 != 0 || 0 != 570031949 * anInt10946) {
			Class440 class440_17_ = Class440.method7063();
			class440_17_.method7017(1.0F, 0.0F, 0.0F, ((float) (2.0 * (3.141592653589793 * (double) (anInt10940 * -1169947453))) / 16384.0F));
			class440.method7042(class440_17_);
			Class437 class437 = Class437.method6879(0.0F, 1.0F, 0.0F);
			class437.method6907(class440);
			Class440 class440_18_ = Class440.method7063();
			class437.method6890();
			class440_18_.method7016(class437, ((float) (2.0 * (3.141592653589793 * (double) (570031949 * anInt10946))) / 16384.0F));
			class440.method7042(class440_18_);
			method17099(class440, (short) 21653);
			anInt10940 = 0;
			anInt10946 = 0;
		}
		if (aClass298_8675.method5342(-1390175100) == Class291.aClass291_3151 && (0 != -216233785 * anInt10941 || anInt10942 * 180746379 != 0)) {
			class440.method7021();
			Class328_Sub1 class328_sub1 = (Class328_Sub1) aClass298_8675.method5430(1688669846);
			Class523_Sub29 class523_sub29 = class328_sub1.method5763((byte) -24);
			Class437 class437 = class523_sub29.method16163((byte) -3);
			Class437 class437_19_ = Class437.method6879(0.0F, 0.0F, (float) (anInt10942 * 180746379));
			class437_19_.method6907(class440);
			class437_19_.aFloat4904 *= -1.0F;
			class437.method6961(class437_19_);
			Class437 class437_20_ = Class437.method6879((float) (-216233785 * anInt10941), 0.0F, 0.0F);
			class437_20_.method6907(class440);
			class437_20_.aFloat4904 *= -1.0F;
			class437.method6961(class437_20_);
			method17108(class437, -2099898309);
			class328_sub1.method15568(new Class523_Sub29(249244125 * class523_sub29.anInt10557, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905), (byte) 1);
			anInt10941 = 0;
			anInt10942 = 0;
		}
	}

	public void method13913(float f) {
		Class440 class440 = method17107((byte) -124);
		if (-1169947453 * anInt10940 != 0 || 0 != 570031949 * anInt10946) {
			Class440 class440_21_ = Class440.method7063();
			class440_21_.method7017(1.0F, 0.0F, 0.0F, ((float) (2.0 * (3.141592653589793 * (double) (anInt10940 * -1169947453))) / 16384.0F));
			class440.method7042(class440_21_);
			Class437 class437 = Class437.method6879(0.0F, 1.0F, 0.0F);
			class437.method6907(class440);
			Class440 class440_22_ = Class440.method7063();
			class437.method6890();
			class440_22_.method7016(class437, ((float) (2.0 * (3.141592653589793 * (double) (570031949 * anInt10946))) / 16384.0F));
			class440.method7042(class440_22_);
			method17099(class440, (short) -9599);
			anInt10940 = 0;
			anInt10946 = 0;
		}
		if (aClass298_8675.method5342(-1390175100) == Class291.aClass291_3151 && (0 != -216233785 * anInt10941 || anInt10942 * 180746379 != 0)) {
			class440.method7021();
			Class328_Sub1 class328_sub1 = (Class328_Sub1) aClass298_8675.method5430(1525519201);
			Class523_Sub29 class523_sub29 = class328_sub1.method5763((byte) -76);
			Class437 class437 = class523_sub29.method16163((byte) -17);
			Class437 class437_23_ = Class437.method6879(0.0F, 0.0F, (float) (anInt10942 * 180746379));
			class437_23_.method6907(class440);
			class437_23_.aFloat4904 *= -1.0F;
			class437.method6961(class437_23_);
			Class437 class437_24_ = Class437.method6879((float) (-216233785 * anInt10941), 0.0F, 0.0F);
			class437_24_.method6907(class440);
			class437_24_.aFloat4904 *= -1.0F;
			class437.method6961(class437_24_);
			method17108(class437, 575499948);
			class328_sub1.method15568(new Class523_Sub29(249244125 * class523_sub29.anInt10557, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905), (byte) 1);
			anInt10941 = 0;
			anInt10942 = 0;
		}
	}

	public boolean method13914() {
		return (!Float.isNaN(aClass440_10945.aFloat4909) && aClass298_8675.method5378(1622379223) != null);
	}

	void method17108(Class437 class437, int i) {
		if (aFloat10943 != -1.0F && class437.aFloat4903 < aFloat10943)
			class437.aFloat4903 = aFloat10943;
		if (-1.0F != aFloat10944 && class437.aFloat4903 > aFloat10944)
			class437.aFloat4903 = aFloat10944;
		if (-1.0F != aFloat10947 && class437.aFloat4904 < aFloat10947)
			class437.aFloat4904 = aFloat10947;
		if (-1.0F != aFloat10948 && class437.aFloat4904 > aFloat10948)
			class437.aFloat4904 = aFloat10948;
		if (aFloat10937 != -1.0F && class437.aFloat4905 < aFloat10937)
			class437.aFloat4905 = aFloat10937;
		if (-1.0F != aFloat10939 && class437.aFloat4905 > aFloat10939)
			class437.aFloat4905 = aFloat10939;
	}

	public void method13924(float f, byte i) {
		Class440 class440 = method17107((byte) -123);
		if (-1169947453 * anInt10940 != 0 || 0 != 570031949 * anInt10946) {
			Class440 class440_25_ = Class440.method7063();
			class440_25_.method7017(1.0F, 0.0F, 0.0F, ((float) (2.0 * (3.141592653589793 * (double) (anInt10940 * -1169947453))) / 16384.0F));
			class440.method7042(class440_25_);
			Class437 class437 = Class437.method6879(0.0F, 1.0F, 0.0F);
			class437.method6907(class440);
			Class440 class440_26_ = Class440.method7063();
			class437.method6890();
			class440_26_.method7016(class437, ((float) (2.0 * (3.141592653589793 * (double) (570031949 * anInt10946))) / 16384.0F));
			class440.method7042(class440_26_);
			method17099(class440, (short) 23432);
			anInt10940 = 0;
			anInt10946 = 0;
		}
		if (aClass298_8675.method5342(-1390175100) == Class291.aClass291_3151 && (0 != -216233785 * anInt10941 || anInt10942 * 180746379 != 0)) {
			class440.method7021();
			Class328_Sub1 class328_sub1 = (Class328_Sub1) aClass298_8675.method5430(1714173369);
			Class523_Sub29 class523_sub29 = class328_sub1.method5763((byte) -125);
			Class437 class437 = class523_sub29.method16163((byte) -97);
			Class437 class437_27_ = Class437.method6879(0.0F, 0.0F, (float) (anInt10942 * 180746379));
			class437_27_.method6907(class440);
			class437_27_.aFloat4904 *= -1.0F;
			class437.method6961(class437_27_);
			Class437 class437_28_ = Class437.method6879((float) (-216233785 * anInt10941), 0.0F, 0.0F);
			class437_28_.method6907(class440);
			class437_28_.aFloat4904 *= -1.0F;
			class437.method6961(class437_28_);
			method17108(class437, -1350066098);
			class328_sub1.method15568(new Class523_Sub29(249244125 * class523_sub29.anInt10557, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905), (byte) 1);
			anInt10941 = 0;
			anInt10942 = 0;
		}
	}

	public Class437 method13917() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1550236883));
		return class437;
	}

	public void method17109(Class437 class437, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		aFloat10943 = -1 == i ? -1.0F : class437.aFloat4903 - (float) (512 * i);
		aFloat10944 = (i_29_ == -1 ? -1.0F : (float) (512 * i_29_) + class437.aFloat4903);
		aFloat10947 = -1 == i_32_ ? -1.0F : -class437.aFloat4904 - (float) (512 * i_32_);
		aFloat10948 = i_33_ == -1 ? -1.0F : -class437.aFloat4904 + (float) (512 * i_33_);
		aFloat10937 = -1 == i_30_ ? -1.0F : class437.aFloat4905 - (float) (512 * i_30_);
		aFloat10939 = (-1 == i_31_ ? -1.0F : (float) (i_31_ * 512) + class437.aFloat4905);
	}

	public void method17110(Class440 class440) {
		aClass440_10938.aFloat4909 = class440.aFloat4909;
		aClass440_10938.aFloat4913 = class440.aFloat4913;
		aClass440_10938.aFloat4912 = class440.aFloat4912;
		aClass440_10938.aFloat4915 = class440.aFloat4915;
		aClass440_10945.method7015(aClass440_10938);
	}

	public Class437 method13920() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1734920411));
		return class437;
	}

	public void method17111(int i) {
		anInt10940 = -1937519637 * i;
	}

	public Class437 method13927() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1600325121));
		return class437;
	}

	public void method17112(int i) {
		anInt10940 = -1937519637 * i;
	}

	public Class437 method13918() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1084021528));
		return class437;
	}

	public Class688_Sub3(Class298 class298) {
		super(class298);
		aClass440_10938 = new Class440(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
	}

	public void method13926(RSBuffer class523_sub34) {
		aClass440_10945.method7013(class523_sub34);
	}

	public void method17113(Class440 class440) {
		aClass440_10938.aFloat4909 = class440.aFloat4909;
		aClass440_10938.aFloat4913 = class440.aFloat4913;
		aClass440_10938.aFloat4912 = class440.aFloat4912;
		aClass440_10938.aFloat4915 = class440.aFloat4915;
		aClass440_10945.method7015(aClass440_10938);
	}

	public void method13916(Class307 class307, Class435 class435, int i, int i_34_, float f) {
		Class437 class437 = Class437.method6884(aClass298_8675.method5378(573771494));
		class437.aFloat4903 -= (float) i;
		class437.aFloat4905 -= (float) i_34_;
		class437.aFloat4904 *= -1.0F;
		class435.method6812(Class440.method7022(aClass440_10945));
		class435.method6825(class437);
		class435.method6857();
		class437.method6949();
	}

	public Class437 method13923() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(924984328));
		return class437;
	}

	public void method13915(Class307 class307, Class435 class435, int i, int i_35_, float f) {
		Class437 class437 = Class437.method6884(aClass298_8675.method5378(1373661000));
		class437.aFloat4903 -= (float) i;
		class437.aFloat4905 -= (float) i_35_;
		class437.aFloat4904 *= -1.0F;
		class435.method6812(Class440.method7022(aClass440_10945));
		class435.method6825(class437);
		class435.method6857();
		class437.method6949();
	}

	public Class437 method13907() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10938));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(843268258));
		return class437;
	}

	public void method17114(int i) {
		anInt10946 = 1865634181 * i;
	}

	public void method17115(int i) {
		anInt10946 = 1865634181 * i;
	}

	public void method17116(int i) {
		anInt10941 = i * 1250932983;
	}

	public void method17117(int i) {
		anInt10940 = -1937519637 * i;
	}

	public void method17118(int i) {
		anInt10942 = i * 1327017763;
	}

	public Class437 method13922() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10945));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1164123321));
		return class437;
	}

	public Class437 method13919() {
		Class437 class437 = new Class437(0.0F, 0.0F, 1000.0F);
		class437.method6907(Class440.method7022(aClass440_10945));
		class437.aFloat4904 *= -1.0F;
		class437.method6961(aClass298_8675.method5378(1035951880));
		return class437;
	}

	public void method17119(int i, int i_36_, int i_37_) {
		Class435 class435 = new Class435();
		class435.method6807(0.0, 0.0, 0.0, (double) i, (double) -i_36_, (double) i_37_, 0.0F, 1.0F, 0.0F);
		Class442 class442 = new Class442();
		class435.method6827(class442.aFloatArray4918);
		Class440 class440 = class442.method7197();
		class440.method7021();
		aClass440_10945.method7015(class440);
	}

	public void method17120(int i, int i_38_, int i_39_) {
		Class435 class435 = new Class435();
		class435.method6807(0.0, 0.0, 0.0, (double) i, (double) -i_38_, (double) i_39_, 0.0F, 1.0F, 0.0F);
		Class442 class442 = new Class442();
		class435.method6827(class442.aFloatArray4918);
		Class440 class440 = class442.method7197();
		class440.method7021();
		aClass440_10945.method7015(class440);
	}

	void method17121(Class437 class437) {
		if (aFloat10943 != -1.0F && class437.aFloat4903 < aFloat10943)
			class437.aFloat4903 = aFloat10943;
		if (-1.0F != aFloat10944 && class437.aFloat4903 > aFloat10944)
			class437.aFloat4903 = aFloat10944;
		if (-1.0F != aFloat10947 && class437.aFloat4904 < aFloat10947)
			class437.aFloat4904 = aFloat10947;
		if (-1.0F != aFloat10948 && class437.aFloat4904 > aFloat10948)
			class437.aFloat4904 = aFloat10948;
		if (aFloat10937 != -1.0F && class437.aFloat4905 < aFloat10937)
			class437.aFloat4905 = aFloat10937;
		if (-1.0F != aFloat10939 && class437.aFloat4905 > aFloat10939)
			class437.aFloat4905 = aFloat10939;
	}

	void method17122(Class437 class437) {
		if (aFloat10943 != -1.0F && class437.aFloat4903 < aFloat10943)
			class437.aFloat4903 = aFloat10943;
		if (-1.0F != aFloat10944 && class437.aFloat4903 > aFloat10944)
			class437.aFloat4903 = aFloat10944;
		if (-1.0F != aFloat10947 && class437.aFloat4904 < aFloat10947)
			class437.aFloat4904 = aFloat10947;
		if (-1.0F != aFloat10948 && class437.aFloat4904 > aFloat10948)
			class437.aFloat4904 = aFloat10948;
		if (aFloat10937 != -1.0F && class437.aFloat4905 < aFloat10937)
			class437.aFloat4905 = aFloat10937;
		if (-1.0F != aFloat10939 && class437.aFloat4905 > aFloat10939)
			class437.aFloat4905 = aFloat10939;
	}

	void method17123(Class437 class437) {
		if (aFloat10943 != -1.0F && class437.aFloat4903 < aFloat10943)
			class437.aFloat4903 = aFloat10943;
		if (-1.0F != aFloat10944 && class437.aFloat4903 > aFloat10944)
			class437.aFloat4903 = aFloat10944;
		if (-1.0F != aFloat10947 && class437.aFloat4904 < aFloat10947)
			class437.aFloat4904 = aFloat10947;
		if (-1.0F != aFloat10948 && class437.aFloat4904 > aFloat10948)
			class437.aFloat4904 = aFloat10948;
		if (aFloat10937 != -1.0F && class437.aFloat4905 < aFloat10937)
			class437.aFloat4905 = aFloat10937;
		if (-1.0F != aFloat10939 && class437.aFloat4905 > aFloat10939)
			class437.aFloat4905 = aFloat10939;
	}

	public void method13904(Class307 class307, Class435 class435, int i, int i_40_, float f, int i_41_) {
		Class437 class437 = Class437.method6884(aClass298_8675.method5378(1563993075));
		class437.aFloat4903 -= (float) i;
		class437.aFloat4905 -= (float) i_40_;
		class437.aFloat4904 *= -1.0F;
		class435.method6812(Class440.method7022(aClass440_10945));
		class435.method6825(class437);
		class435.method6857();
		class437.method6949();
	}

	public void method17124(int i) {
		anInt10940 = -1937519637 * i;
	}

	public Class440 method17125() {
		return new Class440(aClass440_10945);
	}

	public static void method17126(String string, boolean bool, int i) {
		if (0 == -2020118759 * client.anInt11136 && (!Class366.method6324(-454757662) && !Class471.method7636(-1990483367))) {
			Class43.aString583 = string;
			Class43.aBool588 = bool;
			Class657.method10791(8, (byte) -72);
		}
	}
}
