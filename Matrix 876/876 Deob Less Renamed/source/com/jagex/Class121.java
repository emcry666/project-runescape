/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class121 {
	int anInt1482;
	Class523_Sub34_Sub1 aClass523_Sub34_Sub1_1483;
	Interface15 anInterface15_1484;
	float[] aFloatArray1485 = new float[16];
	Class131 aClass131_1486;
	Class131 aClass131_1487;
	int anInt1488;
	int[] anIntArray1489;
	int anInt1490 = 1600;
	int anInt1491 = 64;
	int anInt1492 = 64;
	Class131 aClass131_1493;
	int[] anIntArray1494;
	int[] anIntArray1495;
	Class522_Sub2_Sub1[][] aClass522_Sub2_Sub1ArrayArray1496;
	Class522_Sub2_Sub1[][] aClass522_Sub2_Sub1ArrayArray1497;
	int anInt1498 = 768;
	static float aFloat1499;

	void method2078(Class178_Sub1 class178_sub1) {
		aFloat1499 = class178_sub1.aFloat9359;
		class178_sub1.method14619();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class178_sub1.method14620(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2079(Class178_Sub1 class178_sub1) {
		anInterface15_1484 = class178_sub1.method14717(24, null, 196584, true);
		aClass131_1487 = new Class131(anInterface15_1484, 5126, 2, 0);
		aClass131_1493 = new Class131(anInterface15_1484, 5126, 3, 8);
		aClass131_1486 = new Class131(anInterface15_1484, 5121, 4, 20);
	}

	void method2080(Class178_Sub1 class178_sub1, Class171 class171) {
		if (class178_sub1.aClass441_9316 != null) {
			method2082(class178_sub1);
			float f = class178_sub1.aClass441_9316.aFloatArray4916[2];
			float f_0_ = class178_sub1.aClass441_9316.aFloatArray4916[6];
			float f_1_ = class178_sub1.aClass441_9316.aFloatArray4916[10];
			float f_2_ = class178_sub1.aClass441_9316.aFloatArray4916[14];
			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;
				Class522_Sub2 class522_sub2 = class171.aClass686_1836.aClass522_Sub2_8666;
				for (Class522_Sub2 class522_sub2_5_ = class522_sub2.aClass522_Sub2_10293; class522_sub2_5_ != class522_sub2; class522_sub2_5_ = class522_sub2_5_.aClass522_Sub2_10293) {
					Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_5_;
					int i_6_ = (int) (f * (float) (class522_sub2_sub1.anInt11564 >> 12) + (f_0_ * (float) (class522_sub2_sub1.anInt11568 >> 12)) + (f_1_ * (float) (class522_sub2_sub1.anInt11569 >> 12)) + f_2_);
					if (i_6_ > i_4_)
						i_4_ = i_6_;
					if (i_6_ < i_3_)
						i_3_ = i_6_;
					anIntArray1489[i++] = i_6_;
				}
				int i_7_ = i_4_ - i_3_;
				int i_8_;
				if (i_7_ + 2 > 1600) {
					i_8_ = 1 + Class181.method3537(i_7_, (byte) 0) - anInt1482;
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}
				Class522_Sub2 class522_sub2_9_ = class522_sub2.aClass522_Sub2_10293;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;
				while (class522_sub2_9_ != class522_sub2) {
					anInt1488 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						anIntArray1494[i_12_] = 0;
					for (int i_13_ = 0; i_13_ < 64; i_13_++)
						anIntArray1495[i_13_] = 0;
					for (/**/; class522_sub2_9_ != class522_sub2; class522_sub2_9_ = class522_sub2_9_.aClass522_Sub2_10293) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_9_;
						if (bool_11_) {
							i_10_ = class522_sub2_sub1.anInt11571;
							bool = class522_sub2_sub1.aBool11573;
							bool_11_ = false;
						}
						if (i > 0 && (i_10_ != class522_sub2_sub1.anInt11571 || bool != class522_sub2_sub1.aBool11573)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = anIntArray1489[i++] - i_3_ >> i_8_;
						if (i_14_ < 1600) {
							if (anIntArray1494[i_14_] < 64)
								aClass522_Sub2_Sub1ArrayArray1496[i_14_][anIntArray1494[i_14_]++] = class522_sub2_sub1;
							else {
								if (anIntArray1494[i_14_] == 64) {
									if (anInt1488 == 64)
										continue;
									anIntArray1494[i_14_] += 1 + anInt1488++;
								}
								aClass522_Sub2_Sub1ArrayArray1497[anIntArray1494[i_14_] - 64 - 1][anIntArray1495[(anIntArray1494[i_14_] - 64 - 1)]++] = class522_sub2_sub1;
							}
						}
					}
					if (i_10_ >= 0)
						class178_sub1.method14670(i_10_);
					else
						class178_sub1.method14670(-1);
					if (bool && class178_sub1.aFloat9359 != aFloat1499)
						class178_sub1.method3126(aFloat1499);
					else if (class178_sub1.aFloat9359 != 1.0F)
						class178_sub1.method3126(1.0F);
					method2084(class178_sub1, i_7_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2083(class178_sub1);
		}
	}

	void method2081(Class178_Sub1 class178_sub1) {
		anInterface15_1484 = class178_sub1.method14717(24, null, 196584, true);
		aClass131_1487 = new Class131(anInterface15_1484, 5126, 2, 0);
		aClass131_1493 = new Class131(anInterface15_1484, 5126, 3, 8);
		aClass131_1486 = new Class131(anInterface15_1484, 5121, 4, 20);
	}

	void method2082(Class178_Sub1 class178_sub1) {
		aFloat1499 = class178_sub1.aFloat9359;
		class178_sub1.method14619();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class178_sub1.method14620(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2083(Class178_Sub1 class178_sub1) {
		class178_sub1.method14620(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class178_sub1.aFloat9359 != aFloat1499)
			class178_sub1.method3126(aFloat1499);
	}

	void method2084(Class178_Sub1 class178_sub1, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1485, 0);
		float f = aFloatArray1485[0];
		float f_15_ = aFloatArray1485[4];
		float f_16_ = aFloatArray1485[8];
		float f_17_ = aFloatArray1485[1];
		float f_18_ = aFloatArray1485[5];
		float f_19_ = aFloatArray1485[9];
		float f_20_ = f + f_17_;
		float f_21_ = f_15_ + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f - f_17_;
		float f_24_ = f_15_ - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f;
		float f_27_ = f_18_ - f_15_;
		float f_28_ = f_19_ - f_16_;
		float[] fs = new float[3];
		float[] fs_29_ = new float[3];
		class178_sub1.aClass441_9332.method7122(class178_sub1.aClass441_9317);
		aClass523_Sub34_Sub1_1483.anInt10661 = 0;
		if (class178_sub1.aBool9393) {
			for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
				int i_31_ = anIntArray1494[i_30_] > 64 ? 64 : anIntArray1494[i_30_];
				if (i_31_ > 0) {
					for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = aClass522_Sub2_Sub1ArrayArray1496[i_30_][i_32_];
						int i_33_ = class522_sub2_sub1.anInt11570;
						byte i_34_ = (byte) (i_33_ >> 16);
						byte i_35_ = (byte) (i_33_ >> 8);
						byte i_36_ = (byte) i_33_;
						byte i_37_ = (byte) (i_33_ >>> 24);
						float f_38_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
						float f_39_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
						float f_40_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
						int i_41_ = class522_sub2_sub1.anInt11567 >> 12;
						if (class522_sub2_sub1.aShort11566 != 0) {
							class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_41_, i_41_, 0.0F, 0.0F, 0.0F);
							class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
							class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
							class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_29_);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ - fs[0] - fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ - fs[1] - fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ - fs[2] - fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, 1905589015);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, -967548253);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, 179748539);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, 461896579);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ - fs[0] + fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ - fs[1] + fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ - fs[2] + fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, -82374045);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, -995217321);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, -129412230);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, -233538698);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ + fs[0] + fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ + fs[1] + fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ + fs[2] + fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, -2013134462);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, -632009354);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, -920901974);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, -643788739);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ + fs[0] - fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ + fs[1] - fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ + fs[2] - fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, -1216169642);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, 1078872852);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, -22772042);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, 1636399028);
						} else {
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ + f_20_ * (float) -i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ + f_21_ * (float) -i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ + f_22_ * (float) -i_41_);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, 938620496);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, -1222109098);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, 1632564885);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, -761356602);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ + f_26_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ + f_27_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ + f_28_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, 592798319);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, 909751408);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, 1910190033);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, 99775345);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ + f_20_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ + f_21_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ + f_22_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, 53950277);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, -982310745);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, 1970693248);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, 573798081);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_38_ + f_23_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_39_ + f_24_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.method18112(f_40_ + f_25_ * (float) i_41_);
							aClass523_Sub34_Sub1_1483.writeByte(i_34_, -1260052496);
							aClass523_Sub34_Sub1_1483.writeByte(i_35_, 905220688);
							aClass523_Sub34_Sub1_1483.writeByte(i_36_, -568606388);
							aClass523_Sub34_Sub1_1483.writeByte(i_37_, -262828333);
						}
					}
					if (anIntArray1494[i_30_] > 64) {
						int i_42_ = anIntArray1494[i_30_] - 64 - 1;
						for (int i_43_ = anIntArray1495[i_42_] - 1; i_43_ >= 0; i_43_--) {
							Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray1497[i_42_][i_43_]);
							int i_44_ = class522_sub2_sub1.anInt11570;
							byte i_45_ = (byte) (i_44_ >> 16);
							byte i_46_ = (byte) (i_44_ >> 8);
							byte i_47_ = (byte) i_44_;
							byte i_48_ = (byte) (i_44_ >>> 24);
							float f_49_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
							float f_50_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
							float f_51_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
							int i_52_ = class522_sub2_sub1.anInt11567 >> 12;
							if (class522_sub2_sub1.aShort11566 != 0) {
								class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_52_, i_52_, 0.0F, 0.0F, 0.0F);
								class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
								class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
								class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_29_);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ - fs[0] - fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ - fs[1] - fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ - fs[2] - fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, -2146067676);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, -1363483442);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, 2042834798);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, -917268270);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ - fs[0] + fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ - fs[1] + fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ - fs[2] + fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, -352248546);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, 1671973782);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, -1679403346);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, -1882113283);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ + fs[0] + fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ + fs[1] + fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ + fs[2] + fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, 804598193);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, 1311851565);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, 1575214948);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, -1184565602);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ + fs[0] - fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ + fs[1] - fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ + fs[2] - fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, -1318461892);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, 1609943079);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, 466154617);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, 475167250);
							} else {
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ + f_20_ * (float) -i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ + f_21_ * (float) -i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ + f_22_ * (float) -i_52_);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, 1654735793);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, 1754185514);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, 2080965990);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, 125645511);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ + f_26_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ + f_27_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ + f_28_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, -740720497);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, -925388568);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, -1716795342);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, 458956600);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ + f_20_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ + f_21_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ + f_22_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, 1780011751);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, 251442983);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, 1366915959);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, 1806688499);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_49_ + f_23_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_50_ + f_24_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.method18112(f_51_ + f_25_ * (float) i_52_);
								aClass523_Sub34_Sub1_1483.writeByte(i_45_, 1134295643);
								aClass523_Sub34_Sub1_1483.writeByte(i_46_, -1214992453);
								aClass523_Sub34_Sub1_1483.writeByte(i_47_, 1001220188);
								aClass523_Sub34_Sub1_1483.writeByte(i_48_, -1562898798);
							}
						}
					}
				}
			}
		} else {
			for (int i_53_ = i - 1; i_53_ >= 0; i_53_--) {
				int i_54_ = anIntArray1494[i_53_] > 64 ? 64 : anIntArray1494[i_53_];
				if (i_54_ > 0) {
					for (int i_55_ = i_54_ - 1; i_55_ >= 0; i_55_--) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = aClass522_Sub2_Sub1ArrayArray1496[i_53_][i_55_];
						int i_56_ = class522_sub2_sub1.anInt11570;
						byte i_57_ = (byte) (i_56_ >> 16);
						byte i_58_ = (byte) (i_56_ >> 8);
						byte i_59_ = (byte) i_56_;
						byte i_60_ = (byte) (i_56_ >>> 24);
						float f_61_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
						float f_62_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
						float f_63_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
						int i_64_ = class522_sub2_sub1.anInt11567 >> 12;
						if (class522_sub2_sub1.aShort11566 != 0) {
							class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_64_, i_64_, 0.0F, 0.0F, 0.0F);
							class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
							class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
							class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_29_);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ - fs[0] - fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ - fs[1] - fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ - fs[2] - fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, 1659820569);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -1861243255);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, -2068405093);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, 812434884);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ - fs[0] + fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ - fs[1] + fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ - fs[2] + fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, -206087453);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -1614696570);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, -1601235844);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, -33063611);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ + fs[0] + fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ + fs[1] + fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ + fs[2] + fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, -717583095);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -506361675);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, -1120883497);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, -1242687777);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ + fs[0] - fs_29_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ + fs[1] - fs_29_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ + fs[2] - fs_29_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, 262408811);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -212591572);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, -508496619);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, 1483682163);
						} else {
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ + f_20_ * (float) -i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ + f_21_ * (float) -i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ + f_22_ * (float) -i_64_);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, 1914148988);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, 1406913037);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, -796210897);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, -1380533527);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ + f_26_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ + f_27_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ + f_28_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, 1351944761);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -272358767);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, 211704747);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, 316850753);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ + f_20_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ + f_21_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ + f_22_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, 834036276);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -1870538760);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, -915441754);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, 840993156);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_61_ + f_23_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_62_ + f_24_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.method18110(f_63_ + f_25_ * (float) i_64_);
							aClass523_Sub34_Sub1_1483.writeByte(i_57_, 894448782);
							aClass523_Sub34_Sub1_1483.writeByte(i_58_, -130092904);
							aClass523_Sub34_Sub1_1483.writeByte(i_59_, 405406405);
							aClass523_Sub34_Sub1_1483.writeByte(i_60_, 1721358290);
						}
					}
					if (anIntArray1494[i_53_] > 64) {
						int i_65_ = anIntArray1494[i_53_] - 64 - 1;
						for (int i_66_ = anIntArray1495[i_65_] - 1; i_66_ >= 0; i_66_--) {
							Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray1497[i_65_][i_66_]);
							int i_67_ = class522_sub2_sub1.anInt11570;
							byte i_68_ = (byte) (i_67_ >> 16);
							byte i_69_ = (byte) (i_67_ >> 8);
							byte i_70_ = (byte) i_67_;
							byte i_71_ = (byte) (i_67_ >>> 24);
							float f_72_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
							float f_73_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
							float f_74_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
							int i_75_ = class522_sub2_sub1.anInt11567 >> 12;
							if (class522_sub2_sub1.aShort11566 != 0) {
								class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_75_, i_75_, 0.0F, 0.0F, 0.0F);
								class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
								class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
								class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_29_);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ - fs[0] - fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ - fs[1] - fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ - fs[2] - fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, 368855287);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, -1374996265);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, 1274330944);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, -570782890);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ - fs[0] + fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ - fs[1] + fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ - fs[2] + fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, -527008592);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, -521603801);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, 1494896098);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, -94999731);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ + fs[0] + fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ + fs[1] + fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ + fs[2] + fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, -709630839);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, 1224594447);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, -611291134);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, 137837058);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ + fs[0] - fs_29_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ + fs[1] - fs_29_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ + fs[2] - fs_29_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, 1646014180);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, -1892671455);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, 2053474698);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, 228263636);
							} else {
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ + f_20_ * (float) -i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ + f_21_ * (float) -i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ + f_22_ * (float) -i_75_);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, -1270004306);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, -2072497660);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, -2036571407);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, 1202372653);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ + f_26_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ + f_27_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ + f_28_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, 772878442);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, 1395532394);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, -50451649);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, -571406967);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ + f_20_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ + f_21_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ + f_22_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, -902941143);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, -711214054);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, 2070592014);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, 1658403192);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_72_ + f_23_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_73_ + f_24_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.method18110(f_74_ + f_25_ * (float) i_75_);
								aClass523_Sub34_Sub1_1483.writeByte(i_68_, -2026291318);
								aClass523_Sub34_Sub1_1483.writeByte(i_69_, 1578806758);
								aClass523_Sub34_Sub1_1483.writeByte(i_70_, 1127158150);
								aClass523_Sub34_Sub1_1483.writeByte(i_71_, -364981356);
							}
						}
					}
				}
			}
		}
		if (aClass523_Sub34_Sub1_1483.anInt10661 * 2349011 != 0) {
			anInterface15_1484.method84(24, (aClass523_Sub34_Sub1_1483.aByteArray10658), (aClass523_Sub34_Sub1_1483.anInt10661 * 2349011));
			class178_sub1.method14664(aClass131_1493, null, aClass131_1486, aClass131_1487);
			class178_sub1.method14665(7, 0, (aClass523_Sub34_Sub1_1483.anInt10661 * 2349011 / 24));
		}
	}

	void method2085(Class178_Sub1 class178_sub1) {
		anInterface15_1484 = class178_sub1.method14717(24, null, 196584, true);
		aClass131_1487 = new Class131(anInterface15_1484, 5126, 2, 0);
		aClass131_1493 = new Class131(anInterface15_1484, 5126, 3, 8);
		aClass131_1486 = new Class131(anInterface15_1484, 5121, 4, 20);
	}

	Class121() {
		aClass523_Sub34_Sub1_1483 = new Class523_Sub34_Sub1(786336);
		anInt1491 = 64;
		anInt1498 = 768;
		anInt1490 = 1600;
		anInt1482 = Class181.method3537(1600, (byte) 0);
		anInt1492 = 64;
		anIntArray1489 = new int[8191];
		anIntArray1494 = new int[1600];
		anIntArray1495 = new int[64];
		aClass522_Sub2_Sub1ArrayArray1496 = new Class522_Sub2_Sub1[1600][64];
		aClass522_Sub2_Sub1ArrayArray1497 = new Class522_Sub2_Sub1[64][768];
		anInt1488 = 0;
	}

	void method2086(Class178_Sub1 class178_sub1, Class171 class171) {
		if (class178_sub1.aClass441_9316 != null) {
			method2082(class178_sub1);
			float f = class178_sub1.aClass441_9316.aFloatArray4916[2];
			float f_76_ = class178_sub1.aClass441_9316.aFloatArray4916[6];
			float f_77_ = class178_sub1.aClass441_9316.aFloatArray4916[10];
			float f_78_ = class178_sub1.aClass441_9316.aFloatArray4916[14];
			try {
				int i = 0;
				int i_79_ = 2147483647;
				int i_80_ = 0;
				Class522_Sub2 class522_sub2 = class171.aClass686_1836.aClass522_Sub2_8666;
				for (Class522_Sub2 class522_sub2_81_ = class522_sub2.aClass522_Sub2_10293; class522_sub2_81_ != class522_sub2; class522_sub2_81_ = class522_sub2_81_.aClass522_Sub2_10293) {
					Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_81_;
					int i_82_ = (int) (f * (float) (class522_sub2_sub1.anInt11564 >> 12) + (f_76_ * (float) (class522_sub2_sub1.anInt11568 >> 12)) + (f_77_ * (float) (class522_sub2_sub1.anInt11569 >> 12)) + f_78_);
					if (i_82_ > i_80_)
						i_80_ = i_82_;
					if (i_82_ < i_79_)
						i_79_ = i_82_;
					anIntArray1489[i++] = i_82_;
				}
				int i_83_ = i_80_ - i_79_;
				int i_84_;
				if (i_83_ + 2 > 1600) {
					i_84_ = 1 + Class181.method3537(i_83_, (byte) 0) - anInt1482;
					i_83_ = (i_83_ >> i_84_) + 2;
				} else {
					i_84_ = 0;
					i_83_ += 2;
				}
				Class522_Sub2 class522_sub2_85_ = class522_sub2.aClass522_Sub2_10293;
				i = 0;
				int i_86_ = -2;
				boolean bool = true;
				boolean bool_87_ = true;
				while (class522_sub2_85_ != class522_sub2) {
					anInt1488 = 0;
					for (int i_88_ = 0; i_88_ < i_83_; i_88_++)
						anIntArray1494[i_88_] = 0;
					for (int i_89_ = 0; i_89_ < 64; i_89_++)
						anIntArray1495[i_89_] = 0;
					for (/**/; class522_sub2_85_ != class522_sub2; class522_sub2_85_ = class522_sub2_85_.aClass522_Sub2_10293) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_85_;
						if (bool_87_) {
							i_86_ = class522_sub2_sub1.anInt11571;
							bool = class522_sub2_sub1.aBool11573;
							bool_87_ = false;
						}
						if (i > 0 && (i_86_ != class522_sub2_sub1.anInt11571 || bool != class522_sub2_sub1.aBool11573)) {
							bool_87_ = true;
							break;
						}
						int i_90_ = anIntArray1489[i++] - i_79_ >> i_84_;
						if (i_90_ < 1600) {
							if (anIntArray1494[i_90_] < 64)
								aClass522_Sub2_Sub1ArrayArray1496[i_90_][anIntArray1494[i_90_]++] = class522_sub2_sub1;
							else {
								if (anIntArray1494[i_90_] == 64) {
									if (anInt1488 == 64)
										continue;
									anIntArray1494[i_90_] += 1 + anInt1488++;
								}
								aClass522_Sub2_Sub1ArrayArray1497[anIntArray1494[i_90_] - 64 - 1][anIntArray1495[(anIntArray1494[i_90_] - 64 - 1)]++] = class522_sub2_sub1;
							}
						}
					}
					if (i_86_ >= 0)
						class178_sub1.method14670(i_86_);
					else
						class178_sub1.method14670(-1);
					if (bool && class178_sub1.aFloat9359 != aFloat1499)
						class178_sub1.method3126(aFloat1499);
					else if (class178_sub1.aFloat9359 != 1.0F)
						class178_sub1.method3126(1.0F);
					method2084(class178_sub1, i_83_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2083(class178_sub1);
		}
	}

	void method2087(Class178_Sub1 class178_sub1, Class171 class171) {
		if (class178_sub1.aClass441_9316 != null) {
			method2082(class178_sub1);
			float f = class178_sub1.aClass441_9316.aFloatArray4916[2];
			float f_91_ = class178_sub1.aClass441_9316.aFloatArray4916[6];
			float f_92_ = class178_sub1.aClass441_9316.aFloatArray4916[10];
			float f_93_ = class178_sub1.aClass441_9316.aFloatArray4916[14];
			try {
				int i = 0;
				int i_94_ = 2147483647;
				int i_95_ = 0;
				Class522_Sub2 class522_sub2 = class171.aClass686_1836.aClass522_Sub2_8666;
				for (Class522_Sub2 class522_sub2_96_ = class522_sub2.aClass522_Sub2_10293; class522_sub2_96_ != class522_sub2; class522_sub2_96_ = class522_sub2_96_.aClass522_Sub2_10293) {
					Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_96_;
					int i_97_ = (int) (f * (float) (class522_sub2_sub1.anInt11564 >> 12) + (f_91_ * (float) (class522_sub2_sub1.anInt11568 >> 12)) + (f_92_ * (float) (class522_sub2_sub1.anInt11569 >> 12)) + f_93_);
					if (i_97_ > i_95_)
						i_95_ = i_97_;
					if (i_97_ < i_94_)
						i_94_ = i_97_;
					anIntArray1489[i++] = i_97_;
				}
				int i_98_ = i_95_ - i_94_;
				int i_99_;
				if (i_98_ + 2 > 1600) {
					i_99_ = 1 + Class181.method3537(i_98_, (byte) 0) - anInt1482;
					i_98_ = (i_98_ >> i_99_) + 2;
				} else {
					i_99_ = 0;
					i_98_ += 2;
				}
				Class522_Sub2 class522_sub2_100_ = class522_sub2.aClass522_Sub2_10293;
				i = 0;
				int i_101_ = -2;
				boolean bool = true;
				boolean bool_102_ = true;
				while (class522_sub2_100_ != class522_sub2) {
					anInt1488 = 0;
					for (int i_103_ = 0; i_103_ < i_98_; i_103_++)
						anIntArray1494[i_103_] = 0;
					for (int i_104_ = 0; i_104_ < 64; i_104_++)
						anIntArray1495[i_104_] = 0;
					for (/**/; class522_sub2_100_ != class522_sub2; class522_sub2_100_ = class522_sub2_100_.aClass522_Sub2_10293) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_100_;
						if (bool_102_) {
							i_101_ = class522_sub2_sub1.anInt11571;
							bool = class522_sub2_sub1.aBool11573;
							bool_102_ = false;
						}
						if (i > 0 && (i_101_ != class522_sub2_sub1.anInt11571 || bool != class522_sub2_sub1.aBool11573)) {
							bool_102_ = true;
							break;
						}
						int i_105_ = anIntArray1489[i++] - i_94_ >> i_99_;
						if (i_105_ < 1600) {
							if (anIntArray1494[i_105_] < 64)
								aClass522_Sub2_Sub1ArrayArray1496[i_105_][anIntArray1494[i_105_]++] = class522_sub2_sub1;
							else {
								if (anIntArray1494[i_105_] == 64) {
									if (anInt1488 == 64)
										continue;
									anIntArray1494[i_105_] += 1 + anInt1488++;
								}
								aClass522_Sub2_Sub1ArrayArray1497[anIntArray1494[i_105_] - 64 - 1][anIntArray1495[(anIntArray1494[i_105_] - 64 - 1)]++] = class522_sub2_sub1;
							}
						}
					}
					if (i_101_ >= 0)
						class178_sub1.method14670(i_101_);
					else
						class178_sub1.method14670(-1);
					if (bool && class178_sub1.aFloat9359 != aFloat1499)
						class178_sub1.method3126(aFloat1499);
					else if (class178_sub1.aFloat9359 != 1.0F)
						class178_sub1.method3126(1.0F);
					method2084(class178_sub1, i_98_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method2083(class178_sub1);
		}
	}

	void method2088(Class178_Sub1 class178_sub1, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1485, 0);
		float f = aFloatArray1485[0];
		float f_106_ = aFloatArray1485[4];
		float f_107_ = aFloatArray1485[8];
		float f_108_ = aFloatArray1485[1];
		float f_109_ = aFloatArray1485[5];
		float f_110_ = aFloatArray1485[9];
		float f_111_ = f + f_108_;
		float f_112_ = f_106_ + f_109_;
		float f_113_ = f_107_ + f_110_;
		float f_114_ = f - f_108_;
		float f_115_ = f_106_ - f_109_;
		float f_116_ = f_107_ - f_110_;
		float f_117_ = f_108_ - f;
		float f_118_ = f_109_ - f_106_;
		float f_119_ = f_110_ - f_107_;
		float[] fs = new float[3];
		float[] fs_120_ = new float[3];
		class178_sub1.aClass441_9332.method7122(class178_sub1.aClass441_9317);
		aClass523_Sub34_Sub1_1483.anInt10661 = 0;
		if (class178_sub1.aBool9393) {
			for (int i_121_ = i - 1; i_121_ >= 0; i_121_--) {
				int i_122_ = (anIntArray1494[i_121_] > 64 ? 64 : anIntArray1494[i_121_]);
				if (i_122_ > 0) {
					for (int i_123_ = i_122_ - 1; i_123_ >= 0; i_123_--) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray1496[i_121_][i_123_]);
						int i_124_ = class522_sub2_sub1.anInt11570;
						byte i_125_ = (byte) (i_124_ >> 16);
						byte i_126_ = (byte) (i_124_ >> 8);
						byte i_127_ = (byte) i_124_;
						byte i_128_ = (byte) (i_124_ >>> 24);
						float f_129_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
						float f_130_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
						float f_131_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
						int i_132_ = class522_sub2_sub1.anInt11567 >> 12;
						if (class522_sub2_sub1.aShort11566 != 0) {
							class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_132_, i_132_, 0.0F, 0.0F, 0.0F);
							class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
							class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
							class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_120_);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ - fs[0] - fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ - fs[1] - fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ - fs[2] - fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, 26376384);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, 2114387124);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, 183115871);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, -808127862);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ - fs[0] + fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ - fs[1] + fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ - fs[2] + fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, -1617677433);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, -1177700999);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, 730317795);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, -1204933097);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ + fs[0] + fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ + fs[1] + fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ + fs[2] + fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, 201066803);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, -1721770184);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, -1663432217);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, -399726330);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ + fs[0] - fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ + fs[1] - fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ + fs[2] - fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, 865483940);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, 626109703);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, 1062777560);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, -1079876811);
						} else {
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ + f_111_ * (float) -i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ + f_112_ * (float) -i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ + f_113_ * (float) -i_132_);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, -1808573366);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, -1578242038);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, 428798892);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, -186004591);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ + f_117_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ + f_118_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ + f_119_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, 1676682277);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, 981846388);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, 2025813995);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, 540971539);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ + f_111_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ + f_112_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ + f_113_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, -254304313);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, 1346673804);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, 1296475055);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, 916371916);
							aClass523_Sub34_Sub1_1483.method18112(1.0F);
							aClass523_Sub34_Sub1_1483.method18112(0.0F);
							aClass523_Sub34_Sub1_1483.method18112(f_129_ + f_114_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_130_ + f_115_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.method18112(f_131_ + f_116_ * (float) i_132_);
							aClass523_Sub34_Sub1_1483.writeByte(i_125_, -1847096240);
							aClass523_Sub34_Sub1_1483.writeByte(i_126_, 1087389861);
							aClass523_Sub34_Sub1_1483.writeByte(i_127_, -1539107424);
							aClass523_Sub34_Sub1_1483.writeByte(i_128_, -990123305);
						}
					}
					if (anIntArray1494[i_121_] > 64) {
						int i_133_ = anIntArray1494[i_121_] - 64 - 1;
						for (int i_134_ = anIntArray1495[i_133_] - 1; i_134_ >= 0; i_134_--) {
							Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray1497[i_133_][i_134_]);
							int i_135_ = class522_sub2_sub1.anInt11570;
							byte i_136_ = (byte) (i_135_ >> 16);
							byte i_137_ = (byte) (i_135_ >> 8);
							byte i_138_ = (byte) i_135_;
							byte i_139_ = (byte) (i_135_ >>> 24);
							float f_140_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
							float f_141_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
							float f_142_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
							int i_143_ = class522_sub2_sub1.anInt11567 >> 12;
							if (class522_sub2_sub1.aShort11566 != 0) {
								class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_143_, i_143_, 0.0F, 0.0F, 0.0F);
								class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
								class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
								class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_120_);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ - fs[0] - fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ - fs[1] - fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ - fs[2] - fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, -1686177168);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, -1174572253);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -921933577);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, 226821214);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ - fs[0] + fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ - fs[1] + fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ - fs[2] + fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, 37695590);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, 283150716);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, 1644181371);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, -1714426207);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ + fs[0] + fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ + fs[1] + fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ + fs[2] + fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, -1335440378);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, -1820171468);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -986883194);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, 1705749739);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ + fs[0] - fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ + fs[1] - fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ + fs[2] - fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, 179250350);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, 1837210591);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -899321345);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, 2002956184);
							} else {
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ + f_111_ * (float) -i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ + f_112_ * (float) -i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ + f_113_ * (float) -i_143_);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, -1162613425);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, 2028469537);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -1992516512);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, -1959434731);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ + f_117_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ + f_118_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ + f_119_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, -1913842070);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, 897331376);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -1166048592);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, 1758793950);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ + f_111_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ + f_112_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ + f_113_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, 289599503);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, 567784015);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -576219766);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, -1968778366);
								aClass523_Sub34_Sub1_1483.method18112(1.0F);
								aClass523_Sub34_Sub1_1483.method18112(0.0F);
								aClass523_Sub34_Sub1_1483.method18112(f_140_ + f_114_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_141_ + f_115_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.method18112(f_142_ + f_116_ * (float) i_143_);
								aClass523_Sub34_Sub1_1483.writeByte(i_136_, -1975219234);
								aClass523_Sub34_Sub1_1483.writeByte(i_137_, -762773035);
								aClass523_Sub34_Sub1_1483.writeByte(i_138_, -875196397);
								aClass523_Sub34_Sub1_1483.writeByte(i_139_, -275315046);
							}
						}
					}
				}
			}
		} else {
			for (int i_144_ = i - 1; i_144_ >= 0; i_144_--) {
				int i_145_ = (anIntArray1494[i_144_] > 64 ? 64 : anIntArray1494[i_144_]);
				if (i_145_ > 0) {
					for (int i_146_ = i_145_ - 1; i_146_ >= 0; i_146_--) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray1496[i_144_][i_146_]);
						int i_147_ = class522_sub2_sub1.anInt11570;
						byte i_148_ = (byte) (i_147_ >> 16);
						byte i_149_ = (byte) (i_147_ >> 8);
						byte i_150_ = (byte) i_147_;
						byte i_151_ = (byte) (i_147_ >>> 24);
						float f_152_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
						float f_153_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
						float f_154_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
						int i_155_ = class522_sub2_sub1.anInt11567 >> 12;
						if (class522_sub2_sub1.aShort11566 != 0) {
							class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_155_, i_155_, 0.0F, 0.0F, 0.0F);
							class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
							class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
							class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_120_);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ - fs[0] - fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ - fs[1] - fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ - fs[2] - fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 134766345);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, 1686770979);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, 182073863);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, 1095027156);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ - fs[0] + fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ - fs[1] + fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ - fs[2] + fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 2126455887);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, 1230178864);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, -69899859);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, -380774932);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ + fs[0] + fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ + fs[1] + fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ + fs[2] + fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 973143554);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, -338618112);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, -369932836);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, 1099075249);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ + fs[0] - fs_120_[0]);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ + fs[1] - fs_120_[1]);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ + fs[2] - fs_120_[2]);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 1792858113);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, 1317651879);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, 114280447);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, -1144367876);
						} else {
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ + f_111_ * (float) -i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ + f_112_ * (float) -i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ + f_113_ * (float) -i_155_);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 800197054);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, -2077076918);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, -1962377716);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, -1350559557);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ + f_117_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ + f_118_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ + f_119_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 752629815);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, -989630180);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, 2055507087);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, 1796156139);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ + f_111_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ + f_112_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ + f_113_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, -1506183169);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, -468634012);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, -184880995);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, 966283160);
							aClass523_Sub34_Sub1_1483.method18110(1.0F);
							aClass523_Sub34_Sub1_1483.method18110(0.0F);
							aClass523_Sub34_Sub1_1483.method18110(f_152_ + f_114_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_153_ + f_115_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.method18110(f_154_ + f_116_ * (float) i_155_);
							aClass523_Sub34_Sub1_1483.writeByte(i_148_, 43167542);
							aClass523_Sub34_Sub1_1483.writeByte(i_149_, 149899893);
							aClass523_Sub34_Sub1_1483.writeByte(i_150_, -2076245536);
							aClass523_Sub34_Sub1_1483.writeByte(i_151_, 1030164446);
						}
					}
					if (anIntArray1494[i_144_] > 64) {
						int i_156_ = anIntArray1494[i_144_] - 64 - 1;
						for (int i_157_ = anIntArray1495[i_156_] - 1; i_157_ >= 0; i_157_--) {
							Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray1497[i_156_][i_157_]);
							int i_158_ = class522_sub2_sub1.anInt11570;
							byte i_159_ = (byte) (i_158_ >> 16);
							byte i_160_ = (byte) (i_158_ >> 8);
							byte i_161_ = (byte) i_158_;
							byte i_162_ = (byte) (i_158_ >>> 24);
							float f_163_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
							float f_164_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
							float f_165_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
							int i_166_ = class522_sub2_sub1.anInt11567 >> 12;
							if (class522_sub2_sub1.aShort11566 != 0) {
								class178_sub1.aClass441_9333.method7118(class522_sub2_sub1.aShort11566, i_166_, i_166_, 0.0F, 0.0F, 0.0F);
								class178_sub1.aClass441_9333.method7089(class178_sub1.aClass441_9332);
								class178_sub1.aClass441_9333.method7185(1.0F, 0.0F, 0.0F, fs);
								class178_sub1.aClass441_9333.method7185(0.0F, 1.0F, 0.0F, fs_120_);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ - fs[0] - fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ - fs[1] - fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ - fs[2] - fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, -1158793332);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, -756458572);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, -2099563376);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, 1358908394);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ - fs[0] + fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ - fs[1] + fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ - fs[2] + fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, -254492607);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, 1813500053);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, 2122455927);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, -1853158151);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ + fs[0] + fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ + fs[1] + fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ + fs[2] + fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, 1066430503);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, -1818707555);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, 1658694124);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, -965699752);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ + fs[0] - fs_120_[0]);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ + fs[1] - fs_120_[1]);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ + fs[2] - fs_120_[2]);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, -714192995);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, 1194656608);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, 1111799255);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, -1965507487);
							} else {
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ + f_111_ * (float) -i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ + f_112_ * (float) -i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ + f_113_ * (float) -i_166_);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, 2064237204);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, 1975117955);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, -1159808589);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, -286430078);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ + f_117_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ + f_118_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ + f_119_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, -408241523);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, 72262586);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, 1069405830);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, 932743480);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ + f_111_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ + f_112_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ + f_113_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, -1698854760);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, 1913545162);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, -159967767);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, 1955264271);
								aClass523_Sub34_Sub1_1483.method18110(1.0F);
								aClass523_Sub34_Sub1_1483.method18110(0.0F);
								aClass523_Sub34_Sub1_1483.method18110(f_163_ + f_114_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_164_ + f_115_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.method18110(f_165_ + f_116_ * (float) i_166_);
								aClass523_Sub34_Sub1_1483.writeByte(i_159_, 1802331990);
								aClass523_Sub34_Sub1_1483.writeByte(i_160_, -2043776120);
								aClass523_Sub34_Sub1_1483.writeByte(i_161_, 1656810501);
								aClass523_Sub34_Sub1_1483.writeByte(i_162_, -715919453);
							}
						}
					}
				}
			}
		}
		if (aClass523_Sub34_Sub1_1483.anInt10661 * 2349011 != 0) {
			anInterface15_1484.method84(24, (aClass523_Sub34_Sub1_1483.aByteArray10658), (aClass523_Sub34_Sub1_1483.anInt10661 * 2349011));
			class178_sub1.method14664(aClass131_1493, null, aClass131_1486, aClass131_1487);
			class178_sub1.method14665(7, 0, (aClass523_Sub34_Sub1_1483.anInt10661 * 2349011 / 24));
		}
	}

	void method2089(Class178_Sub1 class178_sub1) {
		anInterface15_1484 = class178_sub1.method14717(24, null, 196584, true);
		aClass131_1487 = new Class131(anInterface15_1484, 5126, 2, 0);
		aClass131_1493 = new Class131(anInterface15_1484, 5126, 3, 8);
		aClass131_1486 = new Class131(anInterface15_1484, 5121, 4, 20);
	}

	void method2090(Class178_Sub1 class178_sub1) {
		aFloat1499 = class178_sub1.aFloat9359;
		class178_sub1.method14619();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class178_sub1.method14620(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2091(Class178_Sub1 class178_sub1) {
		aFloat1499 = class178_sub1.aFloat9359;
		class178_sub1.method14619();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class178_sub1.method14620(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method2092(Class178_Sub1 class178_sub1) {
		class178_sub1.method14620(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class178_sub1.aFloat9359 != aFloat1499)
			class178_sub1.method3126(aFloat1499);
	}

	void method2093(Class178_Sub1 class178_sub1) {
		class178_sub1.method14620(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class178_sub1.aFloat9359 != aFloat1499)
			class178_sub1.method3126(aFloat1499);
	}

	void method2094(Class178_Sub1 class178_sub1) {
		class178_sub1.method14620(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (class178_sub1.aFloat9359 != aFloat1499)
			class178_sub1.method3126(aFloat1499);
	}
}
