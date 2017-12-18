/* Class647_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class647_Sub1_Sub4 extends Class647_Sub1 {
	public static final int anInt11811 = 8;
	public static final int anInt11812 = 2;
	Class523_Sub20[] aClass523_Sub20Array11813;
	public short aShort11814;
	public static final int anInt11815 = 16;
	public static final int anInt11816 = 32;
	public static final int anInt11817 = 64;
	public static final int anInt11818 = 128;
	static int[] anIntArray11819 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public static final int anInt11820 = 4;
	public static final int anInt11821 = 1;
	int anInt11822 = 0;

	int method16739(Class523_Sub20[] class523_sub20s) {
		if (aBool8371) {
			Class437 class437 = method10569().aClass437_4862;
			int i = ((int) class437.aFloat4903 >> -906898059 * aClass560_10822.anInt7496);
			int i_0_ = ((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059);
			int i_1_ = 0;
			if (i == aClass560_10822.anInt7504 * -208391685)
				i_1_++;
			else if (-208391685 * aClass560_10822.anInt7504 < i)
				i_1_ += 2;
			if (i_0_ == aClass560_10822.anInt7533 * 164493233)
				i_1_ += 3;
			else if (164493233 * aClass560_10822.anInt7533 > i_0_)
				i_1_ += 6;
			int i_2_ = anIntArray11819[i_1_];
			if ((aShort11814 & i_2_) == 0) {
				if (1 == aShort11814 && i > 0)
					i--;
				else if (aShort11814 == 4 && i <= aClass560_10822.anInt7546 * -957102653)
					i++;
				else if (aShort11814 == 8 && i_0_ > 0)
					i_0_--;
				else if (2 == aShort11814 && i_0_ <= aClass560_10822.anInt7507 * -34274863)
					i_0_++;
				else if (aShort11814 == 16 && i > 0 && i_0_ <= -34274863 * aClass560_10822.anInt7507) {
					i--;
					i_0_++;
				} else if (aShort11814 == 32 && i <= aClass560_10822.anInt7546 * -957102653 && i_0_ <= aClass560_10822.anInt7507 * -34274863) {
					i++;
					i_0_++;
				} else if (aShort11814 == 128 && i > 0 && i_0_ > 0) {
					i--;
					i_0_--;
				} else if (64 == aShort11814 && i <= aClass560_10822.anInt7546 * -957102653 && i_0_ > 0) {
					i++;
					i_0_--;
				} else
					throw new RuntimeException("");
			}
			anInt11822 = method16711(i, i_0_, aClass523_Sub20Array11813, (short) 18767) * -1035469413;
			aBool8371 = false;
		}
		for (int i = 0; i < anInt11822 * -1656610669; i++)
			class523_sub20s[i] = aClass523_Sub20Array11813[i];
		return anInt11822 * -1656610669;
	}

	int method16751(Class523_Sub20[] class523_sub20s, byte i) {
		if (aBool8371) {
			Class437 class437 = method10569().aClass437_4862;
			int i_3_ = ((int) class437.aFloat4903 >> -906898059 * aClass560_10822.anInt7496);
			int i_4_ = ((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059);
			int i_5_ = 0;
			if (i_3_ == aClass560_10822.anInt7504 * -208391685)
				i_5_++;
			else if (-208391685 * aClass560_10822.anInt7504 < i_3_)
				i_5_ += 2;
			if (i_4_ == aClass560_10822.anInt7533 * 164493233)
				i_5_ += 3;
			else if (164493233 * aClass560_10822.anInt7533 > i_4_)
				i_5_ += 6;
			int i_6_ = anIntArray11819[i_5_];
			if ((aShort11814 & i_6_) == 0) {
				if (1 == aShort11814 && i_3_ > 0)
					i_3_--;
				else if (aShort11814 == 4 && i_3_ <= aClass560_10822.anInt7546 * -957102653)
					i_3_++;
				else if (aShort11814 == 8 && i_4_ > 0)
					i_4_--;
				else if (2 == aShort11814 && i_4_ <= aClass560_10822.anInt7507 * -34274863)
					i_4_++;
				else if (aShort11814 == 16 && i_3_ > 0 && i_4_ <= -34274863 * aClass560_10822.anInt7507) {
					i_3_--;
					i_4_++;
				} else if (aShort11814 == 32 && i_3_ <= aClass560_10822.anInt7546 * -957102653 && i_4_ <= aClass560_10822.anInt7507 * -34274863) {
					i_3_++;
					i_4_++;
				} else if (aShort11814 == 128 && i_3_ > 0 && i_4_ > 0) {
					i_3_--;
					i_4_--;
				} else if (64 == aShort11814 && i_3_ <= aClass560_10822.anInt7546 * -957102653 && i_4_ > 0) {
					i_3_++;
					i_4_--;
				} else
					throw new RuntimeException("");
			}
			anInt11822 = method16711(i_3_, i_4_, aClass523_Sub20Array11813, (short) 2446) * -1035469413;
			aBool8371 = false;
		}
		for (int i_7_ = 0; i_7_ < anInt11822 * -1656610669; i_7_++)
			class523_sub20s[i_7_] = aClass523_Sub20Array11813[i_7_];
		return anInt11822 * -1656610669;
	}

	boolean method16708(Class178 class178, int i) {
		Class437 class437 = method10569().aClass437_4862;
		return (aClass560_10822.aClass544_7541.method9023(this, aByte10818, ((int) class437.aFloat4903 >> aClass560_10822.anInt7496 * -906898059), ((int) class437.aFloat4905 >> -906898059 * aClass560_10822.anInt7496)));
	}

	boolean method16709(int i) {
		Class437 class437 = method10569().aClass437_4862;
		return (aClass560_10822.aBoolArrayArray7558[(aClass560_10822.anInt7538 * -1164760089 + (((int) class437.aFloat4903 >> aClass560_10822.anInt7496 * -906898059) - aClass560_10822.anInt7504 * -208391685))][(-1164760089 * aClass560_10822.anInt7538 + (((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059) - 164493233 * aClass560_10822.anInt7533))]);
	}

	Class647_Sub1_Sub4(Class560 class560, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		super(class560);
		aClass523_Sub20Array11813 = new Class523_Sub20[4];
		aByte10821 = (byte) i_10_;
		aByte10818 = (byte) i_11_;
		aShort11814 = (short) i_12_;
		method10573(new Class437((float) i, (float) i_8_, (float) i_9_));
		for (int i_13_ = 0; i_13_ < 4; i_13_++)
			aClass523_Sub20Array11813[i_13_] = null;
	}

	int method16747(Class523_Sub20[] class523_sub20s) {
		if (aBool8371) {
			Class437 class437 = method10569().aClass437_4862;
			int i = ((int) class437.aFloat4903 >> -906898059 * aClass560_10822.anInt7496);
			int i_14_ = ((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059);
			int i_15_ = 0;
			if (i == aClass560_10822.anInt7504 * -208391685)
				i_15_++;
			else if (-208391685 * aClass560_10822.anInt7504 < i)
				i_15_ += 2;
			if (i_14_ == aClass560_10822.anInt7533 * 164493233)
				i_15_ += 3;
			else if (164493233 * aClass560_10822.anInt7533 > i_14_)
				i_15_ += 6;
			int i_16_ = anIntArray11819[i_15_];
			if ((aShort11814 & i_16_) == 0) {
				if (1 == aShort11814 && i > 0)
					i--;
				else if (aShort11814 == 4 && i <= aClass560_10822.anInt7546 * -957102653)
					i++;
				else if (aShort11814 == 8 && i_14_ > 0)
					i_14_--;
				else if (2 == aShort11814 && i_14_ <= aClass560_10822.anInt7507 * -34274863)
					i_14_++;
				else if (aShort11814 == 16 && i > 0 && i_14_ <= -34274863 * aClass560_10822.anInt7507) {
					i--;
					i_14_++;
				} else if (aShort11814 == 32 && i <= aClass560_10822.anInt7546 * -957102653 && i_14_ <= aClass560_10822.anInt7507 * -34274863) {
					i++;
					i_14_++;
				} else if (aShort11814 == 128 && i > 0 && i_14_ > 0) {
					i--;
					i_14_--;
				} else if (64 == aShort11814 && i <= aClass560_10822.anInt7546 * -957102653 && i_14_ > 0) {
					i++;
					i_14_--;
				} else
					throw new RuntimeException("");
			}
			anInt11822 = method16711(i, i_14_, aClass523_Sub20Array11813, (short) 18046) * -1035469413;
			aBool8371 = false;
		}
		for (int i = 0; i < anInt11822 * -1656610669; i++)
			class523_sub20s[i] = aClass523_Sub20Array11813[i];
		return anInt11822 * -1656610669;
	}

	boolean method16749(Class178 class178) {
		Class437 class437 = method10569().aClass437_4862;
		return (aClass560_10822.aClass544_7541.method9023(this, aByte10818, ((int) class437.aFloat4903 >> aClass560_10822.anInt7496 * -906898059), ((int) class437.aFloat4905 >> -906898059 * aClass560_10822.anInt7496)));
	}

	int method16746(Class523_Sub20[] class523_sub20s) {
		if (aBool8371) {
			Class437 class437 = method10569().aClass437_4862;
			int i = ((int) class437.aFloat4903 >> -906898059 * aClass560_10822.anInt7496);
			int i_17_ = ((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059);
			int i_18_ = 0;
			if (i == aClass560_10822.anInt7504 * -208391685)
				i_18_++;
			else if (-208391685 * aClass560_10822.anInt7504 < i)
				i_18_ += 2;
			if (i_17_ == aClass560_10822.anInt7533 * 164493233)
				i_18_ += 3;
			else if (164493233 * aClass560_10822.anInt7533 > i_17_)
				i_18_ += 6;
			int i_19_ = anIntArray11819[i_18_];
			if ((aShort11814 & i_19_) == 0) {
				if (1 == aShort11814 && i > 0)
					i--;
				else if (aShort11814 == 4 && i <= aClass560_10822.anInt7546 * -957102653)
					i++;
				else if (aShort11814 == 8 && i_17_ > 0)
					i_17_--;
				else if (2 == aShort11814 && i_17_ <= aClass560_10822.anInt7507 * -34274863)
					i_17_++;
				else if (aShort11814 == 16 && i > 0 && i_17_ <= -34274863 * aClass560_10822.anInt7507) {
					i--;
					i_17_++;
				} else if (aShort11814 == 32 && i <= aClass560_10822.anInt7546 * -957102653 && i_17_ <= aClass560_10822.anInt7507 * -34274863) {
					i++;
					i_17_++;
				} else if (aShort11814 == 128 && i > 0 && i_17_ > 0) {
					i--;
					i_17_--;
				} else if (64 == aShort11814 && i <= aClass560_10822.anInt7546 * -957102653 && i_17_ > 0) {
					i++;
					i_17_--;
				} else
					throw new RuntimeException("");
			}
			anInt11822 = method16711(i, i_17_, aClass523_Sub20Array11813, (short) 25549) * -1035469413;
			aBool8371 = false;
		}
		for (int i = 0; i < anInt11822 * -1656610669; i++)
			class523_sub20s[i] = aClass523_Sub20Array11813[i];
		return anInt11822 * -1656610669;
	}

	boolean method16733() {
		Class437 class437 = method10569().aClass437_4862;
		return (aClass560_10822.aBoolArrayArray7558[(aClass560_10822.anInt7538 * -1164760089 + (((int) class437.aFloat4903 >> aClass560_10822.anInt7496 * -906898059) - aClass560_10822.anInt7504 * -208391685))][(-1164760089 * aClass560_10822.anInt7538 + (((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059) - 164493233 * aClass560_10822.anInt7533))]);
	}

	boolean method16712() {
		Class437 class437 = method10569().aClass437_4862;
		return (aClass560_10822.aBoolArrayArray7558[(aClass560_10822.anInt7538 * -1164760089 + (((int) class437.aFloat4903 >> aClass560_10822.anInt7496 * -906898059) - aClass560_10822.anInt7504 * -208391685))][(-1164760089 * aClass560_10822.anInt7538 + (((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059) - 164493233 * aClass560_10822.anInt7533))]);
	}

	boolean method16752() {
		Class437 class437 = method10569().aClass437_4862;
		return (aClass560_10822.aBoolArrayArray7558[(aClass560_10822.anInt7538 * -1164760089 + (((int) class437.aFloat4903 >> aClass560_10822.anInt7496 * -906898059) - aClass560_10822.anInt7504 * -208391685))][(-1164760089 * aClass560_10822.anInt7538 + (((int) class437.aFloat4905 >> aClass560_10822.anInt7496 * -906898059) - 164493233 * aClass560_10822.anInt7533))]);
	}
}
