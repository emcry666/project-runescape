/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class335 {
	int anInt3545;
	Interface36 anInterface36_3546;
	static float aFloat3547;
	Interface40 anInterface40_3548;
	int anInt3549 = 64;
	int anInt3550 = 768;
	int anInt3551 = 1600;
	Interface36 anInterface36_3552;
	int anInt3553 = 64;
	int[] anIntArray3554;
	int[] anIntArray3555;
	int[] anIntArray3556;
	Class522_Sub2_Sub1[][] aClass522_Sub2_Sub1ArrayArray3557;
	Class345 aClass345_3558;
	Class522_Sub2_Sub1[][] aClass522_Sub2_Sub1ArrayArray3559;
	int anInt3560;

	void method5913(Class178_Sub2 class178_sub2) {
		anInterface36_3552.method215(786336, 24);
	}

	void method5914(Class178_Sub2 class178_sub2, Class171 class171) {
		class178_sub2.method3287(false);
		aFloat3547 = class178_sub2.aFloat9643;
		float f = class178_sub2.aClass441_9629.aFloatArray4916[2];
		float f_0_ = class178_sub2.aClass441_9629.aFloatArray4916[6];
		float f_1_ = class178_sub2.aClass441_9629.aFloatArray4916[10];
		float f_2_ = class178_sub2.aClass441_9629.aFloatArray4916[14];
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class522_Sub2 class522_sub2 = class171.aClass686_1836.aClass522_Sub2_8666;
		for (Class522_Sub2 class522_sub2_5_ = class522_sub2.aClass522_Sub2_10293; class522_sub2_5_ != class522_sub2; class522_sub2_5_ = class522_sub2_5_.aClass522_Sub2_10293) {
			Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_5_;
			int i_6_ = (int) (f * (float) (class522_sub2_sub1.anInt11564 >> 12) + f_0_ * (float) (class522_sub2_sub1.anInt11568 >> 12) + f_1_ * (float) (class522_sub2_sub1.anInt11569 >> 12) + f_2_);
			if (i_6_ > i_4_)
				i_4_ = i_6_;
			if (i_6_ < i_3_)
				i_3_ = i_6_;
			anIntArray3555[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
			i_8_ = 1 + Class181.method3537(i_7_, (byte) 0) - anInt3545;
			i_7_ = (i_7_ >> i_8_) + 2;
		} else {
			i_8_ = 0;
			i_7_ += 2;
		}
		class178_sub2.method15213(anInterface40_3548);
		Class326 class326 = class178_sub2.aClass326_9645;
		class326.method5742(Class441.aClass441_4917);
		class326.aClass441_3457.method7085();
		class326.anInt3458 = -1;
		boolean bool = class178_sub2.anInt9663 > 0;
		if (bool) {
			class326.aClass429_3456.method6773(0.0F, 0.0F, 1.0F, -class178_sub2.aFloat9683);
			class326.aClass437_3461.method6972((float) (class178_sub2.anInt9662 >> 16 & 0xff) / 255.0F, (float) (class178_sub2.anInt9662 >> 8 & 0xff) / 255.0F, (float) (class178_sub2.anInt9662 >> 0 & 0xff) / 255.0F);
			class326.aClass429_3456.method6762(class178_sub2.aClass441_9555);
			class326.aClass429_3456.method6766(1.0F / (class178_sub2.aFloat9681 - class178_sub2.aFloat9683));
		} else {
			class326.aClass429_3456.method6773(0.0F, 0.0F, 0.0F, 0.0F);
			class326.aClass437_3461.method6972(0.0F, 0.0F, 0.0F);
		}
		method5916(class178_sub2, class522_sub2, i_7_, i_3_, i_8_, class326, bool);
		if (class178_sub2.aFloat9643 != aFloat3547)
			class178_sub2.method3126(aFloat3547);
		class178_sub2.method3287(true);
	}

	Class335(Class178_Sub2 class178_sub2) {
		anInt3545 = Class181.method3537(1600, (byte) 0);
		anInt3553 = 64;
		anIntArray3555 = new int[8191];
		anIntArray3554 = new int[1600];
		anIntArray3556 = new int[64];
		aClass522_Sub2_Sub1ArrayArray3557 = new Class522_Sub2_Sub1[1600][64];
		aClass522_Sub2_Sub1ArrayArray3559 = new Class522_Sub2_Sub1[64][768];
		anInt3560 = 0;
		aClass345_3558 = (class178_sub2.method15031(new Class378[] { new Class378(new Class344[] { Class344.aClass344_3624, Class344.aClass344_3613, Class344.aClass344_3615 }), new Class378(Class344.aClass344_3612) }));
		anInterface36_3552 = class178_sub2.method15030(true);
		anInterface36_3546 = class178_sub2.method15030(false);
		anInterface36_3546.method215(393168, 12);
		anInterface40_3548 = class178_sub2.method15029(false);
		anInterface40_3548.method275(49146);
		ByteBuffer bytebuffer = class178_sub2.aByteBuffer9539;
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_9_ = i * 4;
			bytebuffer.putShort((short) i_9_);
			bytebuffer.putShort((short) (i_9_ + 1));
			bytebuffer.putShort((short) (i_9_ + 2));
			bytebuffer.putShort((short) (i_9_ + 2));
			bytebuffer.putShort((short) (i_9_ + 3));
			bytebuffer.putShort((short) i_9_);
		}
		anInterface40_3548.method265(0, bytebuffer.position(), class178_sub2.aLong9540);
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
		}
		anInterface36_3546.method265(0, bytebuffer.position(), class178_sub2.aLong9540);
	}

	void method5915() {
		anInterface36_3552.method131();
	}

	void method5916(Class178_Sub2 class178_sub2, Class522_Sub2 class522_sub2, int i, int i_10_, int i_11_, Class326 class326, boolean bool) {
		Class522_Sub2 class522_sub2_12_ = class522_sub2.aClass522_Sub2_10293;
		int i_13_ = 0;
		int i_14_ = -2;
		boolean bool_15_ = true;
		boolean bool_16_ = true;
		while (class522_sub2_12_ != class522_sub2) {
			anInt3560 = 0;
			for (int i_17_ = 0; i_17_ < i; i_17_++)
				anIntArray3554[i_17_] = 0;
			for (int i_18_ = 0; i_18_ < 64; i_18_++)
				anIntArray3556[i_18_] = 0;
			for (/**/; class522_sub2_12_ != class522_sub2; class522_sub2_12_ = class522_sub2_12_.aClass522_Sub2_10293) {
				Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_12_;
				if (bool_16_) {
					i_14_ = class522_sub2_sub1.anInt11571;
					bool_15_ = class522_sub2_sub1.aBool11573;
					bool_16_ = false;
				}
				if (i_13_ > 0 && (i_14_ != class522_sub2_sub1.anInt11571 || bool_15_ != class522_sub2_sub1.aBool11573)) {
					bool_16_ = true;
					break;
				}
				method5917(anIntArray3555[i_13_++] - i_10_ >> i_11_, class522_sub2_sub1);
			}
			class326.anInterface37_3460 = null;
			if (i_14_ >= 0) {
				Class177 class177 = class178_sub2.aClass172_1916.method2895(i_14_, -2060296502);
				if (class177.aBool1881)
					class326.anInterface37_3460 = class178_sub2.aClass349_9586.method6095(class177);
				byte i_19_ = 0;
				if (class177.aClass593_1884 == Class593.aClass593_7812)
					i_19_ = class177.aByte1889;
				class178_sub2.method15020(i_19_);
			}
			if (bool_15_ && class178_sub2.aFloat9643 != aFloat3547)
				class178_sub2.method3126(aFloat3547);
			else if (class178_sub2.aFloat9643 != 1.0F)
				class178_sub2.method3126(1.0F);
			method5918(class178_sub2, i, bool);
		}
	}

	void method5917(int i, Class522_Sub2_Sub1 class522_sub2_sub1) {
		if (i < 1600) {
			if (anIntArray3554[i] < 64)
				aClass522_Sub2_Sub1ArrayArray3557[i][anIntArray3554[i]++] = class522_sub2_sub1;
			else {
				if (anIntArray3554[i] == 64) {
					if (anInt3560 == 64)
						return;
					anIntArray3554[i] += 1 + anInt3560++;
				}
				aClass522_Sub2_Sub1ArrayArray3559[anIntArray3554[i] - 64 - 1][anIntArray3556[anIntArray3554[i] - 64 - 1]++] = class522_sub2_sub1;
			}
		}
	}

	void method5918(Class178_Sub2 class178_sub2, int i, boolean bool) {
		int i_20_ = 0;
		Class441 class441 = class178_sub2.aClass441_9629;
		float f = class441.aFloatArray4916[0];
		float f_21_ = class441.aFloatArray4916[4];
		float f_22_ = class441.aFloatArray4916[8];
		float f_23_ = class441.aFloatArray4916[1];
		float f_24_ = class441.aFloatArray4916[5];
		float f_25_ = class441.aFloatArray4916[9];
		float f_26_ = f + f_23_;
		float f_27_ = f_21_ + f_24_;
		float f_28_ = f_22_ + f_25_;
		float f_29_ = f - f_23_;
		float f_30_ = f_21_ - f_24_;
		float f_31_ = f_22_ - f_25_;
		float f_32_ = f_23_ - f;
		float f_33_ = f_24_ - f_21_;
		float f_34_ = f_25_ - f_22_;
		float[] fs = new float[3];
		float[] fs_35_ = new float[3];
		class178_sub2.aClass441_9560.method7122(class178_sub2.aClass441_9650);
		ByteBuffer bytebuffer = class178_sub2.aByteBuffer9539;
		bytebuffer.clear();
		for (int i_36_ = i - 1; i_36_ >= 0; i_36_--) {
			int i_37_ = anIntArray3554[i_36_] > 64 ? 64 : anIntArray3554[i_36_];
			if (i_37_ > 0) {
				for (int i_38_ = i_37_ - 1; i_38_ >= 0; i_38_--) {
					Class522_Sub2_Sub1 class522_sub2_sub1 = aClass522_Sub2_Sub1ArrayArray3557[i_36_][i_38_];
					int i_39_ = class522_sub2_sub1.anInt11570;
					byte i_40_ = (byte) (i_39_ >> 16);
					byte i_41_ = (byte) (i_39_ >> 8);
					byte i_42_ = (byte) i_39_;
					byte i_43_ = (byte) (i_39_ >>> 24);
					if (class178_sub2.anInt9670 == 0) {
						byte i_44_ = i_40_;
						i_40_ = i_42_;
						i_42_ = i_44_;
					}
					float f_45_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
					float f_46_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
					float f_47_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
					int i_48_ = class522_sub2_sub1.anInt11567 >> 12;
					if (class522_sub2_sub1.aShort11566 != 0) {
						class178_sub2.aClass441_9561.method7118(class522_sub2_sub1.aShort11566, i_48_, i_48_, 0.0F, 0.0F, 0.0F);
						class178_sub2.aClass441_9561.method7089(class178_sub2.aClass441_9560);
						class178_sub2.aClass441_9561.method7185(1.0F, 0.0F, 0.0F, fs);
						class178_sub2.aClass441_9561.method7185(0.0F, 1.0F, 0.0F, fs_35_);
						bytebuffer.putFloat(f_45_ - fs[0] - fs_35_[0]);
						bytebuffer.putFloat(f_46_ - fs[1] - fs_35_[1]);
						bytebuffer.putFloat(f_47_ - fs[2] - fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_45_ - fs[0] + fs_35_[0]);
						bytebuffer.putFloat(f_46_ - fs[1] + fs_35_[1]);
						bytebuffer.putFloat(f_47_ - fs[2] + fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + fs[0] + fs_35_[0]);
						bytebuffer.putFloat(f_46_ + fs[1] + fs_35_[1]);
						bytebuffer.putFloat(f_47_ + fs[2] + fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + fs[0] - fs_35_[0]);
						bytebuffer.putFloat(f_46_ + fs[1] - fs_35_[1]);
						bytebuffer.putFloat(f_47_ + fs[2] - fs_35_[2]);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_45_ + f_26_ * (float) -i_48_);
						bytebuffer.putFloat(f_46_ + f_27_ * (float) -i_48_);
						bytebuffer.putFloat(f_47_ + f_28_ * (float) -i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_45_ + f_32_ * (float) i_48_);
						bytebuffer.putFloat(f_46_ + f_33_ * (float) i_48_);
						bytebuffer.putFloat(f_47_ + f_34_ * (float) i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + f_26_ * (float) i_48_);
						bytebuffer.putFloat(f_46_ + f_27_ * (float) i_48_);
						bytebuffer.putFloat(f_47_ + f_28_ * (float) i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_45_ + f_29_ * (float) i_48_);
						bytebuffer.putFloat(f_46_ + f_30_ * (float) i_48_);
						bytebuffer.putFloat(f_47_ + f_31_ * (float) i_48_);
						bytebuffer.put(i_40_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_20_++;
				}
				if (anIntArray3554[i_36_] > 64) {
					int i_49_ = anIntArray3554[i_36_] - 64 - 1;
					for (int i_50_ = anIntArray3556[i_49_] - 1; i_50_ >= 0; i_50_--) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = aClass522_Sub2_Sub1ArrayArray3559[i_49_][i_50_];
						int i_51_ = class522_sub2_sub1.anInt11570;
						byte i_52_ = (byte) (i_51_ >> 16);
						byte i_53_ = (byte) (i_51_ >> 8);
						byte i_54_ = (byte) i_51_;
						byte i_55_ = (byte) (i_51_ >>> 24);
						float f_56_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
						float f_57_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
						float f_58_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
						int i_59_ = class522_sub2_sub1.anInt11567 >> 12;
						if (class178_sub2.anInt9670 == 0) {
							byte i_60_ = i_52_;
							i_52_ = i_54_;
							i_54_ = i_60_;
						}
						if (class522_sub2_sub1.aShort11566 != 0) {
							class178_sub2.aClass441_9561.method7118(class522_sub2_sub1.aShort11566, i_59_, i_59_, 0.0F, 0.0F, 0.0F);
							class178_sub2.aClass441_9561.method7089(class178_sub2.aClass441_9560);
							class178_sub2.aClass441_9561.method7185(1.0F, 0.0F, 0.0F, fs);
							class178_sub2.aClass441_9561.method7185(0.0F, 1.0F, 0.0F, fs_35_);
							bytebuffer.putFloat(f_56_ - fs[0] - fs_35_[0]);
							bytebuffer.putFloat(f_57_ - fs[1] - fs_35_[1]);
							bytebuffer.putFloat(f_58_ - fs[2] - fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_56_ - fs[0] + fs_35_[0]);
							bytebuffer.putFloat(f_57_ - fs[1] + fs_35_[1]);
							bytebuffer.putFloat(f_58_ - fs[2] + fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + fs[0] + fs_35_[0]);
							bytebuffer.putFloat(f_57_ + fs[1] + fs_35_[1]);
							bytebuffer.putFloat(f_58_ + fs[2] + fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + fs[0] - fs_35_[0]);
							bytebuffer.putFloat(f_57_ + fs[1] - fs_35_[1]);
							bytebuffer.putFloat(f_58_ + fs[2] - fs_35_[2]);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_56_ + f_26_ * (float) -i_59_);
							bytebuffer.putFloat(f_57_ + f_27_ * (float) -i_59_);
							bytebuffer.putFloat(f_58_ + f_28_ * (float) -i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_56_ + f_32_ * (float) i_59_);
							bytebuffer.putFloat(f_57_ + f_33_ * (float) i_59_);
							bytebuffer.putFloat(f_58_ + f_34_ * (float) i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + f_26_ * (float) i_59_);
							bytebuffer.putFloat(f_57_ + f_27_ * (float) i_59_);
							bytebuffer.putFloat(f_58_ + f_28_ * (float) i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_56_ + f_29_ * (float) i_59_);
							bytebuffer.putFloat(f_57_ + f_30_ * (float) i_59_);
							bytebuffer.putFloat(f_58_ + f_31_ * (float) i_59_);
							bytebuffer.put(i_52_);
							bytebuffer.put(i_53_);
							bytebuffer.put(i_54_);
							bytebuffer.put(i_55_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_20_++;
					}
				}
			}
		}
		anInterface36_3552.method265(0, bytebuffer.position(), class178_sub2.aLong9540);
		class178_sub2.method15033(0, anInterface36_3552);
		class178_sub2.method15033(1, anInterface36_3546);
		class178_sub2.method15032(aClass345_3558);
		Class326 class326 = class178_sub2.aClass326_9645;
		class326.method5743(i_20_, bool);
	}

	void method5919(Class178_Sub2 class178_sub2) {
		anInterface36_3552.method215(786336, 24);
	}

	void method5920() {
		anInterface36_3552.method131();
	}

	void method5921(int i, Class522_Sub2_Sub1 class522_sub2_sub1) {
		if (i < 1600) {
			if (anIntArray3554[i] < 64)
				aClass522_Sub2_Sub1ArrayArray3557[i][anIntArray3554[i]++] = class522_sub2_sub1;
			else {
				if (anIntArray3554[i] == 64) {
					if (anInt3560 == 64)
						return;
					anIntArray3554[i] += 1 + anInt3560++;
				}
				aClass522_Sub2_Sub1ArrayArray3559[anIntArray3554[i] - 64 - 1][anIntArray3556[anIntArray3554[i] - 64 - 1]++] = class522_sub2_sub1;
			}
		}
	}

	void method5922(Class178_Sub2 class178_sub2, Class171 class171) {
		class178_sub2.method3287(false);
		aFloat3547 = class178_sub2.aFloat9643;
		float f = class178_sub2.aClass441_9629.aFloatArray4916[2];
		float f_61_ = class178_sub2.aClass441_9629.aFloatArray4916[6];
		float f_62_ = class178_sub2.aClass441_9629.aFloatArray4916[10];
		float f_63_ = class178_sub2.aClass441_9629.aFloatArray4916[14];
		int i = 0;
		int i_64_ = 2147483647;
		int i_65_ = 0;
		Class522_Sub2 class522_sub2 = class171.aClass686_1836.aClass522_Sub2_8666;
		for (Class522_Sub2 class522_sub2_66_ = class522_sub2.aClass522_Sub2_10293; class522_sub2_66_ != class522_sub2; class522_sub2_66_ = class522_sub2_66_.aClass522_Sub2_10293) {
			Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_66_;
			int i_67_ = (int) (f * (float) (class522_sub2_sub1.anInt11564 >> 12) + f_61_ * (float) (class522_sub2_sub1.anInt11568 >> 12) + f_62_ * (float) (class522_sub2_sub1.anInt11569 >> 12) + f_63_);
			if (i_67_ > i_65_)
				i_65_ = i_67_;
			if (i_67_ < i_64_)
				i_64_ = i_67_;
			anIntArray3555[i++] = i_67_;
		}
		int i_68_ = i_65_ - i_64_;
		int i_69_;
		if (i_68_ + 2 > 1600) {
			i_69_ = 1 + Class181.method3537(i_68_, (byte) 0) - anInt3545;
			i_68_ = (i_68_ >> i_69_) + 2;
		} else {
			i_69_ = 0;
			i_68_ += 2;
		}
		class178_sub2.method15213(anInterface40_3548);
		Class326 class326 = class178_sub2.aClass326_9645;
		class326.method5742(Class441.aClass441_4917);
		class326.aClass441_3457.method7085();
		class326.anInt3458 = -1;
		boolean bool = class178_sub2.anInt9663 > 0;
		if (bool) {
			class326.aClass429_3456.method6773(0.0F, 0.0F, 1.0F, -class178_sub2.aFloat9683);
			class326.aClass437_3461.method6972((float) (class178_sub2.anInt9662 >> 16 & 0xff) / 255.0F, (float) (class178_sub2.anInt9662 >> 8 & 0xff) / 255.0F, (float) (class178_sub2.anInt9662 >> 0 & 0xff) / 255.0F);
			class326.aClass429_3456.method6762(class178_sub2.aClass441_9555);
			class326.aClass429_3456.method6766(1.0F / (class178_sub2.aFloat9681 - class178_sub2.aFloat9683));
		} else {
			class326.aClass429_3456.method6773(0.0F, 0.0F, 0.0F, 0.0F);
			class326.aClass437_3461.method6972(0.0F, 0.0F, 0.0F);
		}
		method5916(class178_sub2, class522_sub2, i_68_, i_64_, i_69_, class326, bool);
		if (class178_sub2.aFloat9643 != aFloat3547)
			class178_sub2.method3126(aFloat3547);
		class178_sub2.method3287(true);
	}

	void method5923() {
		anInterface36_3552.method131();
	}

	void method5924(Class178_Sub2 class178_sub2, Class522_Sub2 class522_sub2, int i, int i_70_, int i_71_, Class326 class326, boolean bool) {
		Class522_Sub2 class522_sub2_72_ = class522_sub2.aClass522_Sub2_10293;
		int i_73_ = 0;
		int i_74_ = -2;
		boolean bool_75_ = true;
		boolean bool_76_ = true;
		while (class522_sub2_72_ != class522_sub2) {
			anInt3560 = 0;
			for (int i_77_ = 0; i_77_ < i; i_77_++)
				anIntArray3554[i_77_] = 0;
			for (int i_78_ = 0; i_78_ < 64; i_78_++)
				anIntArray3556[i_78_] = 0;
			for (/**/; class522_sub2_72_ != class522_sub2; class522_sub2_72_ = class522_sub2_72_.aClass522_Sub2_10293) {
				Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_72_;
				if (bool_76_) {
					i_74_ = class522_sub2_sub1.anInt11571;
					bool_75_ = class522_sub2_sub1.aBool11573;
					bool_76_ = false;
				}
				if (i_73_ > 0 && (i_74_ != class522_sub2_sub1.anInt11571 || bool_75_ != class522_sub2_sub1.aBool11573)) {
					bool_76_ = true;
					break;
				}
				method5917(anIntArray3555[i_73_++] - i_70_ >> i_71_, class522_sub2_sub1);
			}
			class326.anInterface37_3460 = null;
			if (i_74_ >= 0) {
				Class177 class177 = class178_sub2.aClass172_1916.method2895(i_74_, -726594457);
				if (class177.aBool1881)
					class326.anInterface37_3460 = class178_sub2.aClass349_9586.method6095(class177);
				byte i_79_ = 0;
				if (class177.aClass593_1884 == Class593.aClass593_7812)
					i_79_ = class177.aByte1889;
				class178_sub2.method15020(i_79_);
			}
			if (bool_75_ && class178_sub2.aFloat9643 != aFloat3547)
				class178_sub2.method3126(aFloat3547);
			else if (class178_sub2.aFloat9643 != 1.0F)
				class178_sub2.method3126(1.0F);
			method5918(class178_sub2, i, bool);
		}
	}

	void method5925(int i, Class522_Sub2_Sub1 class522_sub2_sub1) {
		if (i < 1600) {
			if (anIntArray3554[i] < 64)
				aClass522_Sub2_Sub1ArrayArray3557[i][anIntArray3554[i]++] = class522_sub2_sub1;
			else {
				if (anIntArray3554[i] == 64) {
					if (anInt3560 == 64)
						return;
					anIntArray3554[i] += 1 + anInt3560++;
				}
				aClass522_Sub2_Sub1ArrayArray3559[anIntArray3554[i] - 64 - 1][anIntArray3556[anIntArray3554[i] - 64 - 1]++] = class522_sub2_sub1;
			}
		}
	}

	void method5926(int i, Class522_Sub2_Sub1 class522_sub2_sub1) {
		if (i < 1600) {
			if (anIntArray3554[i] < 64)
				aClass522_Sub2_Sub1ArrayArray3557[i][anIntArray3554[i]++] = class522_sub2_sub1;
			else {
				if (anIntArray3554[i] == 64) {
					if (anInt3560 == 64)
						return;
					anIntArray3554[i] += 1 + anInt3560++;
				}
				aClass522_Sub2_Sub1ArrayArray3559[anIntArray3554[i] - 64 - 1][anIntArray3556[anIntArray3554[i] - 64 - 1]++] = class522_sub2_sub1;
			}
		}
	}

	void method5927(Class178_Sub2 class178_sub2, Class171 class171) {
		class178_sub2.method3287(false);
		aFloat3547 = class178_sub2.aFloat9643;
		float f = class178_sub2.aClass441_9629.aFloatArray4916[2];
		float f_80_ = class178_sub2.aClass441_9629.aFloatArray4916[6];
		float f_81_ = class178_sub2.aClass441_9629.aFloatArray4916[10];
		float f_82_ = class178_sub2.aClass441_9629.aFloatArray4916[14];
		int i = 0;
		int i_83_ = 2147483647;
		int i_84_ = 0;
		Class522_Sub2 class522_sub2 = class171.aClass686_1836.aClass522_Sub2_8666;
		for (Class522_Sub2 class522_sub2_85_ = class522_sub2.aClass522_Sub2_10293; class522_sub2_85_ != class522_sub2; class522_sub2_85_ = class522_sub2_85_.aClass522_Sub2_10293) {
			Class522_Sub2_Sub1 class522_sub2_sub1 = (Class522_Sub2_Sub1) class522_sub2_85_;
			int i_86_ = (int) (f * (float) (class522_sub2_sub1.anInt11564 >> 12) + f_80_ * (float) (class522_sub2_sub1.anInt11568 >> 12) + f_81_ * (float) (class522_sub2_sub1.anInt11569 >> 12) + f_82_);
			if (i_86_ > i_84_)
				i_84_ = i_86_;
			if (i_86_ < i_83_)
				i_83_ = i_86_;
			anIntArray3555[i++] = i_86_;
		}
		int i_87_ = i_84_ - i_83_;
		int i_88_;
		if (i_87_ + 2 > 1600) {
			i_88_ = 1 + Class181.method3537(i_87_, (byte) 0) - anInt3545;
			i_87_ = (i_87_ >> i_88_) + 2;
		} else {
			i_88_ = 0;
			i_87_ += 2;
		}
		class178_sub2.method15213(anInterface40_3548);
		Class326 class326 = class178_sub2.aClass326_9645;
		class326.method5742(Class441.aClass441_4917);
		class326.aClass441_3457.method7085();
		class326.anInt3458 = -1;
		boolean bool = class178_sub2.anInt9663 > 0;
		if (bool) {
			class326.aClass429_3456.method6773(0.0F, 0.0F, 1.0F, -class178_sub2.aFloat9683);
			class326.aClass437_3461.method6972((float) (class178_sub2.anInt9662 >> 16 & 0xff) / 255.0F, (float) (class178_sub2.anInt9662 >> 8 & 0xff) / 255.0F, (float) (class178_sub2.anInt9662 >> 0 & 0xff) / 255.0F);
			class326.aClass429_3456.method6762(class178_sub2.aClass441_9555);
			class326.aClass429_3456.method6766(1.0F / (class178_sub2.aFloat9681 - class178_sub2.aFloat9683));
		} else {
			class326.aClass429_3456.method6773(0.0F, 0.0F, 0.0F, 0.0F);
			class326.aClass437_3461.method6972(0.0F, 0.0F, 0.0F);
		}
		method5916(class178_sub2, class522_sub2, i_87_, i_83_, i_88_, class326, bool);
		if (class178_sub2.aFloat9643 != aFloat3547)
			class178_sub2.method3126(aFloat3547);
		class178_sub2.method3287(true);
	}

	void method5928(Class178_Sub2 class178_sub2, int i, boolean bool) {
		int i_89_ = 0;
		Class441 class441 = class178_sub2.aClass441_9629;
		float f = class441.aFloatArray4916[0];
		float f_90_ = class441.aFloatArray4916[4];
		float f_91_ = class441.aFloatArray4916[8];
		float f_92_ = class441.aFloatArray4916[1];
		float f_93_ = class441.aFloatArray4916[5];
		float f_94_ = class441.aFloatArray4916[9];
		float f_95_ = f + f_92_;
		float f_96_ = f_90_ + f_93_;
		float f_97_ = f_91_ + f_94_;
		float f_98_ = f - f_92_;
		float f_99_ = f_90_ - f_93_;
		float f_100_ = f_91_ - f_94_;
		float f_101_ = f_92_ - f;
		float f_102_ = f_93_ - f_90_;
		float f_103_ = f_94_ - f_91_;
		float[] fs = new float[3];
		float[] fs_104_ = new float[3];
		class178_sub2.aClass441_9560.method7122(class178_sub2.aClass441_9650);
		ByteBuffer bytebuffer = class178_sub2.aByteBuffer9539;
		bytebuffer.clear();
		for (int i_105_ = i - 1; i_105_ >= 0; i_105_--) {
			int i_106_ = anIntArray3554[i_105_] > 64 ? 64 : anIntArray3554[i_105_];
			if (i_106_ > 0) {
				for (int i_107_ = i_106_ - 1; i_107_ >= 0; i_107_--) {
					Class522_Sub2_Sub1 class522_sub2_sub1 = aClass522_Sub2_Sub1ArrayArray3557[i_105_][i_107_];
					int i_108_ = class522_sub2_sub1.anInt11570;
					byte i_109_ = (byte) (i_108_ >> 16);
					byte i_110_ = (byte) (i_108_ >> 8);
					byte i_111_ = (byte) i_108_;
					byte i_112_ = (byte) (i_108_ >>> 24);
					if (class178_sub2.anInt9670 == 0) {
						byte i_113_ = i_109_;
						i_109_ = i_111_;
						i_111_ = i_113_;
					}
					float f_114_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
					float f_115_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
					float f_116_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
					int i_117_ = class522_sub2_sub1.anInt11567 >> 12;
					if (class522_sub2_sub1.aShort11566 != 0) {
						class178_sub2.aClass441_9561.method7118(class522_sub2_sub1.aShort11566, i_117_, i_117_, 0.0F, 0.0F, 0.0F);
						class178_sub2.aClass441_9561.method7089(class178_sub2.aClass441_9560);
						class178_sub2.aClass441_9561.method7185(1.0F, 0.0F, 0.0F, fs);
						class178_sub2.aClass441_9561.method7185(0.0F, 1.0F, 0.0F, fs_104_);
						bytebuffer.putFloat(f_114_ - fs[0] - fs_104_[0]);
						bytebuffer.putFloat(f_115_ - fs[1] - fs_104_[1]);
						bytebuffer.putFloat(f_116_ - fs[2] - fs_104_[2]);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_114_ - fs[0] + fs_104_[0]);
						bytebuffer.putFloat(f_115_ - fs[1] + fs_104_[1]);
						bytebuffer.putFloat(f_116_ - fs[2] + fs_104_[2]);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_114_ + fs[0] + fs_104_[0]);
						bytebuffer.putFloat(f_115_ + fs[1] + fs_104_[1]);
						bytebuffer.putFloat(f_116_ + fs[2] + fs_104_[2]);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_114_ + fs[0] - fs_104_[0]);
						bytebuffer.putFloat(f_115_ + fs[1] - fs_104_[1]);
						bytebuffer.putFloat(f_116_ + fs[2] - fs_104_[2]);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					} else {
						bytebuffer.putFloat(f_114_ + f_95_ * (float) -i_117_);
						bytebuffer.putFloat(f_115_ + f_96_ * (float) -i_117_);
						bytebuffer.putFloat(f_116_ + f_97_ * (float) -i_117_);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_114_ + f_101_ * (float) i_117_);
						bytebuffer.putFloat(f_115_ + f_102_ * (float) i_117_);
						bytebuffer.putFloat(f_116_ + f_103_ * (float) i_117_);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_114_ + f_95_ * (float) i_117_);
						bytebuffer.putFloat(f_115_ + f_96_ * (float) i_117_);
						bytebuffer.putFloat(f_116_ + f_97_ * (float) i_117_);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_114_ + f_98_ * (float) i_117_);
						bytebuffer.putFloat(f_115_ + f_99_ * (float) i_117_);
						bytebuffer.putFloat(f_116_ + f_100_ * (float) i_117_);
						bytebuffer.put(i_109_);
						bytebuffer.put(i_110_);
						bytebuffer.put(i_111_);
						bytebuffer.put(i_112_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
					}
					i_89_++;
				}
				if (anIntArray3554[i_105_] > 64) {
					int i_118_ = anIntArray3554[i_105_] - 64 - 1;
					for (int i_119_ = anIntArray3556[i_118_] - 1; i_119_ >= 0; i_119_--) {
						Class522_Sub2_Sub1 class522_sub2_sub1 = (aClass522_Sub2_Sub1ArrayArray3559[i_118_][i_119_]);
						int i_120_ = class522_sub2_sub1.anInt11570;
						byte i_121_ = (byte) (i_120_ >> 16);
						byte i_122_ = (byte) (i_120_ >> 8);
						byte i_123_ = (byte) i_120_;
						byte i_124_ = (byte) (i_120_ >>> 24);
						float f_125_ = (float) (class522_sub2_sub1.anInt11564 >> 12);
						float f_126_ = (float) (class522_sub2_sub1.anInt11568 >> 12);
						float f_127_ = (float) (class522_sub2_sub1.anInt11569 >> 12);
						int i_128_ = class522_sub2_sub1.anInt11567 >> 12;
						if (class178_sub2.anInt9670 == 0) {
							byte i_129_ = i_121_;
							i_121_ = i_123_;
							i_123_ = i_129_;
						}
						if (class522_sub2_sub1.aShort11566 != 0) {
							class178_sub2.aClass441_9561.method7118(class522_sub2_sub1.aShort11566, i_128_, i_128_, 0.0F, 0.0F, 0.0F);
							class178_sub2.aClass441_9561.method7089(class178_sub2.aClass441_9560);
							class178_sub2.aClass441_9561.method7185(1.0F, 0.0F, 0.0F, fs);
							class178_sub2.aClass441_9561.method7185(0.0F, 1.0F, 0.0F, fs_104_);
							bytebuffer.putFloat(f_125_ - fs[0] - fs_104_[0]);
							bytebuffer.putFloat(f_126_ - fs[1] - fs_104_[1]);
							bytebuffer.putFloat(f_127_ - fs[2] - fs_104_[2]);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_125_ - fs[0] + fs_104_[0]);
							bytebuffer.putFloat(f_126_ - fs[1] + fs_104_[1]);
							bytebuffer.putFloat(f_127_ - fs[2] + fs_104_[2]);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_125_ + fs[0] + fs_104_[0]);
							bytebuffer.putFloat(f_126_ + fs[1] + fs_104_[1]);
							bytebuffer.putFloat(f_127_ + fs[2] + fs_104_[2]);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_125_ + fs[0] - fs_104_[0]);
							bytebuffer.putFloat(f_126_ + fs[1] - fs_104_[1]);
							bytebuffer.putFloat(f_127_ + fs[2] - fs_104_[2]);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						} else {
							bytebuffer.putFloat(f_125_ + f_95_ * (float) -i_128_);
							bytebuffer.putFloat(f_126_ + f_96_ * (float) -i_128_);
							bytebuffer.putFloat(f_127_ + f_97_ * (float) -i_128_);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(f_125_ + f_101_ * (float) i_128_);
							bytebuffer.putFloat(f_126_ + f_102_ * (float) i_128_);
							bytebuffer.putFloat(f_127_ + f_103_ * (float) i_128_);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(0.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_125_ + f_95_ * (float) i_128_);
							bytebuffer.putFloat(f_126_ + f_96_ * (float) i_128_);
							bytebuffer.putFloat(f_127_ + f_97_ * (float) i_128_);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(f_125_ + f_98_ * (float) i_128_);
							bytebuffer.putFloat(f_126_ + f_99_ * (float) i_128_);
							bytebuffer.putFloat(f_127_ + f_100_ * (float) i_128_);
							bytebuffer.put(i_121_);
							bytebuffer.put(i_122_);
							bytebuffer.put(i_123_);
							bytebuffer.put(i_124_);
							bytebuffer.putFloat(1.0F);
							bytebuffer.putFloat(0.0F);
						}
						i_89_++;
					}
				}
			}
		}
		anInterface36_3552.method265(0, bytebuffer.position(), class178_sub2.aLong9540);
		class178_sub2.method15033(0, anInterface36_3552);
		class178_sub2.method15033(1, anInterface36_3546);
		class178_sub2.method15032(aClass345_3558);
		Class326 class326 = class178_sub2.aClass326_9645;
		class326.method5743(i_89_, bool);
	}
}
