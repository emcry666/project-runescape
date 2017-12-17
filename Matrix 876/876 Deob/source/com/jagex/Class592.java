/* Class592 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class592 {
	public int localX;
	public int anInt7809;
	public int localY;

	public void method9783(Class523_Sub29 class523_sub29, int i) {
		anInt7809 = -1178308683 * class523_sub29.anInt10557;
		localX = -1761291929 * (-536626413 * class523_sub29.anInt10560 >> 9);
		localY = 15009853 * (169299399 * class523_sub29.anInt10555 >> 9);
	}

	public int method9784() {
		return (-608757111 * anInt7809 << 28 | localX * 235453015 << 14 | localY * 1704054549);
	}

	public Class592(int i) {
		if (-1 == i)
			anInt7809 = 738296903;
		else {
			anInt7809 = (i >> 28 & 0x3) * -738296903;
			localX = -1761291929 * (i >> 14 & 0x3fff);
			localY = (i & 0x3fff) * 15009853;
		}
	}

	boolean method9785(Class592 class592_0_) {
		if (-608757111 * anInt7809 != class592_0_.anInt7809 * -608757111)
			return false;
		if (235453015 * class592_0_.localX != localX * 235453015)
			return false;
		if (1704054549 * class592_0_.localY != 1704054549 * localY)
			return false;
		return true;
	}

	public int method9786(int i) {
		return (-608757111 * anInt7809 << 28 | localX * 235453015 << 14 | localY * 1704054549);
	}

	public Class592(int i, int i_1_, int i_2_) {
		anInt7809 = i * -738296903;
		localX = -1761291929 * i_1_;
		localY = i_2_ * 15009853;
	}

	public String method9787() {
		return new StringBuilder().append(-608757111 * anInt7809).append(",").append(235453015 * localX >> 6).append(",").append(localY * 1704054549 >> 6).append(",").append(235453015 * localX & 0x3f).append(",").append(1704054549 * localY & 0x3f).toString();
	}

	public int hashCode() {
		return method9786(190556124);
	}

	public String toString() {
		return new StringBuilder().append(-608757111 * anInt7809).append(",").append(235453015 * localX >> 6).append(",").append(localY * 1704054549 >> 6).append(",").append(235453015 * localX & 0x3f).append(",").append(1704054549 * localY & 0x3f).toString();
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class592))
			return false;
		return method9790((Class592) object, (byte) -35);
	}

	public int method9788() {
		return method9786(-653063239);
	}

	boolean method9789(Class592 class592_3_) {
		if (-608757111 * anInt7809 != class592_3_.anInt7809 * -608757111)
			return false;
		if (235453015 * class592_3_.localX != localX * 235453015)
			return false;
		if (1704054549 * class592_3_.localY != 1704054549 * localY)
			return false;
		return true;
	}

	boolean method9790(Class592 class592_4_, byte i) {
		if (-608757111 * anInt7809 != class592_4_.anInt7809 * -608757111)
			return false;
		if (235453015 * class592_4_.localX != localX * 235453015)
			return false;
		if (1704054549 * class592_4_.localY != 1704054549 * localY)
			return false;
		return true;
	}

	public int method9791() {
		return (-608757111 * anInt7809 << 28 | localX * 235453015 << 14 | localY * 1704054549);
	}

	public int method9792() {
		return (-608757111 * anInt7809 << 28 | localX * 235453015 << 14 | localY * 1704054549);
	}

	public int method9793() {
		return (-608757111 * anInt7809 << 28 | localX * 235453015 << 14 | localY * 1704054549);
	}

	boolean method9794(Class592 class592_5_) {
		if (-608757111 * anInt7809 != class592_5_.anInt7809 * -608757111)
			return false;
		if (235453015 * class592_5_.localX != localX * 235453015)
			return false;
		if (1704054549 * class592_5_.localY != 1704054549 * localY)
			return false;
		return true;
	}

	boolean method9795(Class592 class592_6_) {
		if (-608757111 * anInt7809 != class592_6_.anInt7809 * -608757111)
			return false;
		if (235453015 * class592_6_.localX != localX * 235453015)
			return false;
		if (1704054549 * class592_6_.localY != 1704054549 * localY)
			return false;
		return true;
	}

	public boolean method9796(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class592))
			return false;
		return method9790((Class592) object, (byte) -114);
	}

	public Class592() {
		anInt7809 = 738296903;
	}

	public static void method9797(int i, int i_7_, int i_8_, byte i_9_) {
		i <<= 3;
		i_7_ <<= 3;
		i_8_ <<= 3;
		if (2097396553 * Class562.anInt7564 == 2) {
			if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) == Class291.aClass291_3148) {
				Class328_Sub2 class328_sub2 = ((Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1426234823));
				Class440 class440 = new Class440();
				Class440 class440_10_ = new Class440();
				class440.method7017(0.0F, 1.0F, 0.0F, (3.1415927F - (float) (2.0 * ((double) i_7_ * 3.141592653589793) / 16384.0)));
				Class437 class437 = new Class437(1.0F, 0.0F, 0.0F);
				class437.method6907(class440);
				class437.method6889();
				class440_10_.method7016(class437, (float) (3.141592653589793 * (double) i * 2.0) / 16384.0F);
				class440.method7042(class440_10_);
				class328_sub2.aClass440_10072.method7015(class440);
			}
		} else {
			client.aFloat11214 = (float) i;
			client.aFloat11129 = (float) i_7_;
			if (3 == Class562.anInt7564 * 2097396553) {
				Class678.anInt8639 = i * 1767382019;
				Class424.anInt4817 = -1709276499 * i_7_;
				TimeUtils.anInt2491 = i_8_ * -1053422769;
			}
			Class452.method7315((byte) -7);
		}
		client.aBool11111 = true;
	}

	public static Class523_Sub29 method9798(Class523_Sub29 class523_sub29, int i) {
		synchronized (Class523_Sub29.aClass523_Sub29Array10558) {
			if (-1791984535 * Class523_Sub29.anInt10556 == 0) {
				Class523_Sub29 class523_sub29_11_ = new Class523_Sub29(class523_sub29);
				return class523_sub29_11_;
			}
			Class523_Sub29.aClass523_Sub29Array10558[(Class523_Sub29.anInt10556 -= -1124281383) * -1791984535].method16161(class523_sub29, 1791937174);
			Class523_Sub29 class523_sub29_12_ = (Class523_Sub29.aClass523_Sub29Array10558[Class523_Sub29.anInt10556 * -1791984535]);
			return class523_sub29_12_;
		}
	}
}
