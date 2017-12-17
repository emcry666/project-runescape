/* Class523_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class523_Sub12 extends Class523 {
	Class178_Sub2 aClass178_Sub2_10428;
	Class142_Sub1 aClass142_Sub1_10429;
	Interface36 anInterface36_10430;
	int anInt10431;
	int anInt10432;
	float[][] aFloatArrayArray10433;
	int anInt10434;
	int anInt10435 = 0;
	int anInt10436 = 0;
	int anInt10437 = 0;
	Interface40 anInterface40_10438;
	Class14 aClass14_10439;
	float[][] aFloatArrayArray10440;
	float[][] aFloatArrayArray10441;
	Class523_Sub20 aClass523_Sub20_10442;
	int anInt10443;
	ByteBuffer aByteBuffer10444;

	Class523_Sub12(Class178_Sub2 class178_sub2, Class142_Sub1 class142_sub1, Class523_Sub20 class523_sub20, int[] is) {
		aClass178_Sub2_10428 = class178_sub2;
		aClass523_Sub20_10442 = class523_sub20;
		aClass142_Sub1_10429 = class142_sub1;
		int i = (aClass523_Sub20_10442.method16066(-1879460461) - (class142_sub1.anInt1682 * 341909049 >> 1));
		anInt10431 = (aClass523_Sub20_10442.method16062(2131811589) - i >> class142_sub1.anInt1680 * -1193058675);
		anInt10432 = (aClass523_Sub20_10442.method16062(2131811589) + i >> class142_sub1.anInt1680 * -1193058675);
		anInt10443 = (aClass523_Sub20_10442.method16065(1788419285) - i >> class142_sub1.anInt1680 * -1193058675);
		anInt10434 = (aClass523_Sub20_10442.method16065(1847220345) + i >> class142_sub1.anInt1680 * -1193058675);
		int i_0_ = anInt10432 - anInt10431 + 1;
		int i_1_ = anInt10434 - anInt10443 + 1;
		aFloatArrayArray10440 = new float[i_0_ + 1][i_1_ + 1];
		aFloatArrayArray10441 = new float[i_0_ + 1][i_1_ + 1];
		aFloatArrayArray10433 = new float[i_0_ + 1][i_1_ + 1];
		for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
			int i_3_ = i_2_ + anInt10443;
			if (i_3_ > 0 && i_3_ < aClass142_Sub1_10429.anInt1681 * 452998539 - 1) {
				for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
					int i_5_ = i_4_ + anInt10431;
					if (i_5_ > 0 && i_5_ < (aClass142_Sub1_10429.anInt1683 * 692304099 - 1)) {
						int i_6_ = (class142_sub1.method2321(i_5_ + 1, i_3_, 1767569405) - class142_sub1.method2321(i_5_ - 1, i_3_, 2010529758));
						int i_7_ = (class142_sub1.method2321(i_5_, i_3_ + 1, 1890497884) - class142_sub1.method2321(i_5_, i_3_ - 1, 1990688801));
						float f = (float) (1.0 / Math.sqrt((double) (i_6_ * i_6_ + 65536 + i_7_ * i_7_)));
						aFloatArrayArray10440[i_4_][i_2_] = (float) i_6_ * f;
						aFloatArrayArray10441[i_4_][i_2_] = -256.0F * f;
						aFloatArrayArray10433[i_4_][i_2_] = (float) i_7_ * f;
					}
				}
			}
		}
		int i_8_ = 0;
		for (int i_9_ = anInt10443; i_9_ <= anInt10434; i_9_++) {
			if (i_9_ >= 0 && i_9_ < class142_sub1.anInt1681 * 452998539) {
				for (int i_10_ = anInt10431; i_10_ <= anInt10432; i_10_++) {
					if (i_10_ >= 0 && i_10_ < class142_sub1.anInt1683 * 692304099) {
						int i_11_ = is[i_8_];
						int[] is_12_ = (class142_sub1.anIntArrayArrayArray9010[i_10_][i_9_]);
						if (is_12_ != null && i_11_ != 0) {
							if (i_11_ == 1) {
								for (int i_13_ = 0; i_13_ < is_12_.length; i_13_ += 3) {
									if (is_12_[i_13_] != -1 && is_12_[i_13_ + 1] != -1 && is_12_[i_13_ + 2] != -1)
										anInt10436 += 3;
								}
							} else
								anInt10436 += 3;
						}
					}
					i_8_++;
				}
			} else
				i_8_ += anInt10432 - anInt10431;
		}
		if (anInt10436 > 0) {
			aClass14_10439 = new Class14(Class628.method10313(anInt10436, -2005436240));
			aByteBuffer10444 = aClass178_Sub2_10428.aByteBuffer9539;
			aByteBuffer10444.clear();
			aByteBuffer10444.position(aClass178_Sub2_10428.anInt9701 >> 1);
			aByteBuffer10444.slice();
			aByteBuffer10444.position(0);
			aByteBuffer10444.limit(aClass178_Sub2_10428.anInt9701 >> 1);
			int i_14_ = 0;
			i_8_ = 0;
			for (int i_15_ = anInt10443; i_15_ <= anInt10434; i_15_++) {
				if (i_15_ >= 0 && i_15_ < class142_sub1.anInt1681 * 452998539) {
					int i_16_ = 0;
					for (int i_17_ = anInt10431; i_17_ <= anInt10432; i_17_++) {
						if (i_17_ >= 0 && i_17_ < class142_sub1.anInt1683 * 692304099) {
							int i_18_ = is[i_8_];
							int[] is_19_ = (class142_sub1.anIntArrayArrayArray9010[i_17_][i_15_]);
							if (is_19_ != null && i_18_ != 0) {
								if (i_18_ == 1) {
									int[] is_20_ = (class142_sub1.anIntArrayArrayArray9012[i_17_][i_15_]);
									int[] is_21_ = (class142_sub1.anIntArrayArrayArray9011[i_17_][i_15_]);
									int i_22_ = 0;
									while (i_22_ < is_19_.length) {
										if (is_19_[i_22_] != -1 && is_19_[i_22_ + 1] != -1 && is_19_[i_22_ + 2] != -1) {
											method15955(i_16_, i_14_, i_17_, i_15_, is_20_[i_22_], is_21_[i_22_]);
											i_22_++;
											method15955(i_16_, i_14_, i_17_, i_15_, is_20_[i_22_], is_21_[i_22_]);
											i_22_++;
											method15955(i_16_, i_14_, i_17_, i_15_, is_20_[i_22_], is_21_[i_22_]);
											i_22_++;
										} else
											i_22_ += 3;
									}
								} else if (i_18_ == 3) {
									method15955(i_16_, i_14_, i_17_, i_15_, 0, 0);
									method15955(i_16_, i_14_, i_17_, i_15_, (class142_sub1.anInt1682 * 341909049), 0);
									method15955(i_16_, i_14_, i_17_, i_15_, 0, (class142_sub1.anInt1682 * 341909049));
								} else if (i_18_ == 2) {
									method15955(i_16_, i_14_, i_17_, i_15_, (class142_sub1.anInt1682 * 341909049), 0);
									method15955(i_16_, i_14_, i_17_, i_15_, (class142_sub1.anInt1682 * 341909049), (class142_sub1.anInt1682 * 341909049));
									method15955(i_16_, i_14_, i_17_, i_15_, 0, 0);
								} else if (i_18_ == 5) {
									method15955(i_16_, i_14_, i_17_, i_15_, (class142_sub1.anInt1682 * 341909049), (class142_sub1.anInt1682 * 341909049));
									method15955(i_16_, i_14_, i_17_, i_15_, 0, (class142_sub1.anInt1682 * 341909049));
									method15955(i_16_, i_14_, i_17_, i_15_, (class142_sub1.anInt1682 * 341909049), 0);
								} else if (i_18_ == 4) {
									method15955(i_16_, i_14_, i_17_, i_15_, 0, (class142_sub1.anInt1682 * 341909049));
									method15955(i_16_, i_14_, i_17_, i_15_, 0, 0);
									method15955(i_16_, i_14_, i_17_, i_15_, (class142_sub1.anInt1682 * 341909049), (class142_sub1.anInt1682 * 341909049));
								}
							}
						}
						i_8_++;
						i_16_++;
					}
				} else
					i_8_ += anInt10432 - anInt10431;
				i_14_++;
			}
			method15947();
		} else {
			anInterface36_10430 = null;
			anInterface40_10438 = null;
		}
		aClass14_10439 = null;
		aFloatArrayArray10433 = null;
		aFloatArrayArray10441 = null;
		aFloatArrayArray10440 = null;
	}

	void method15947() {
		anInterface40_10438 = aClass178_Sub2_10428.method15029(false);
		anInterface40_10438.method275(anInt10437);
		anInterface36_10430 = aClass178_Sub2_10428.method15030(false);
		anInterface36_10430.method215(anInt10435 * 16, 16);
		anInterface36_10430.method265(0, anInt10435 * 16, aClass178_Sub2_10428.aLong9540);
		anInterface40_10438.method265(0, anInt10437 * 2, (aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1)));
	}

	void method15948() {
		anInterface40_10438 = aClass178_Sub2_10428.method15029(false);
		anInterface40_10438.method275(anInt10437);
		anInterface36_10430 = aClass178_Sub2_10428.method15030(false);
		anInterface36_10430.method215(anInt10435 * 16, 16);
		anInterface36_10430.method265(0, anInt10435 * 16, aClass178_Sub2_10428.aLong9540);
		anInterface40_10438.method265(0, anInt10437 * 2, (aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1)));
	}

	void method15949(Class329 class329, int i, int i_23_, int i_24_, boolean[][] bools, boolean bool) {
		if (anInterface40_10438 != null && anInt10431 <= i + i_24_ && anInt10432 >= i - i_24_ && anInt10443 <= i_23_ + i_24_ && anInt10434 >= i_23_ - i_24_) {
			if (bool) {
				for (int i_25_ = anInt10431; i_25_ <= anInt10432; i_25_++) {
					if (i_25_ - i >= -i_24_ && i_25_ - i <= i_24_) {
						for (int i_26_ = anInt10443; i_26_ <= anInt10434; i_26_++) {
							if (i_26_ - i_23_ >= -i_24_ && i_26_ - i_23_ <= i_24_ && (bools[i_25_ - i + i_24_][i_26_ - i_23_ + i_24_])) {
								method15950(class329, anInterface40_10438, anInt10437 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_27_ = 0;
				ByteBuffer bytebuffer = aClass178_Sub2_10428.aByteBuffer9539;
				bytebuffer.clear();
				for (int i_28_ = anInt10443; i_28_ <= anInt10434; i_28_++) {
					if (i_28_ - i_23_ >= -i_24_ && i_28_ - i_23_ <= i_24_) {
						int i_29_ = (i_28_ * (aClass142_Sub1_10429.anInt1683 * 692304099) + anInt10431);
						for (int i_30_ = anInt10431; i_30_ <= anInt10432; i_30_++) {
							if (i_30_ - i >= -i_24_ && i_30_ - i <= i_24_ && (bools[i_30_ - i + i_24_][i_28_ - i_23_ + i_24_])) {
								short[] is = (aClass142_Sub1_10429.aShortArrayArray9006[i_29_]);
								if (is != null) {
									for (int i_31_ = 0; i_31_ < is.length; i_31_++) {
										bytebuffer.putShort(is[i_31_]);
										i_27_++;
									}
								}
							}
							i_29_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_27_ != 0) {
					int i_32_ = bytebuffer.position();
					Interface40 interface40 = aClass178_Sub2_10428.method14951(i_32_ / 2);
					interface40.method265(0, i_32_, aClass178_Sub2_10428.aLong9540);
					method15950(class329, interface40, i_27_ / 3);
				}
			}
		}
	}

	void method15950(Class329 class329, Interface40 interface40, int i) {
		class329.anInt3493 = 0;
		class329.anInt3494 = anInt10435;
		class329.anInt3481 = 0;
		class329.anInt3496 = anInt10437 / 3;
		class329.anInterface37_3478 = aClass178_Sub2_10428.anInterface37_9669;
		float f = aClass523_Sub20_10442.method16068((byte) 0);
		class329.aClass437_3491.method6972(f, f, f);
		aClass178_Sub2_10428.method15033(0, anInterface36_10430);
		aClass178_Sub2_10428.method15032(aClass178_Sub2_10428.aClass345_9698);
		aClass178_Sub2_10428.method15213(anInterface40_10438);
		class329.method5817(0);
	}

	void method15951() {
		anInterface40_10438 = aClass178_Sub2_10428.method15029(false);
		anInterface40_10438.method275(anInt10437);
		anInterface36_10430 = aClass178_Sub2_10428.method15030(false);
		anInterface36_10430.method215(anInt10435 * 16, 16);
		anInterface36_10430.method265(0, anInt10435 * 16, aClass178_Sub2_10428.aLong9540);
		anInterface40_10438.method265(0, anInt10437 * 2, (aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1)));
	}

	void method15952() {
		anInterface40_10438 = aClass178_Sub2_10428.method15029(false);
		anInterface40_10438.method275(anInt10437);
		anInterface36_10430 = aClass178_Sub2_10428.method15030(false);
		anInterface36_10430.method215(anInt10435 * 16, 16);
		anInterface36_10430.method265(0, anInt10435 * 16, aClass178_Sub2_10428.aLong9540);
		anInterface40_10438.method265(0, anInt10437 * 2, (aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1)));
	}

	void method15953(Class329 class329, int i, int i_33_, int i_34_, boolean[][] bools, boolean bool) {
		if (anInterface40_10438 != null && anInt10431 <= i + i_34_ && anInt10432 >= i - i_34_ && anInt10443 <= i_33_ + i_34_ && anInt10434 >= i_33_ - i_34_) {
			if (bool) {
				for (int i_35_ = anInt10431; i_35_ <= anInt10432; i_35_++) {
					if (i_35_ - i >= -i_34_ && i_35_ - i <= i_34_) {
						for (int i_36_ = anInt10443; i_36_ <= anInt10434; i_36_++) {
							if (i_36_ - i_33_ >= -i_34_ && i_36_ - i_33_ <= i_34_ && (bools[i_35_ - i + i_34_][i_36_ - i_33_ + i_34_])) {
								method15950(class329, anInterface40_10438, anInt10437 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_37_ = 0;
				ByteBuffer bytebuffer = aClass178_Sub2_10428.aByteBuffer9539;
				bytebuffer.clear();
				for (int i_38_ = anInt10443; i_38_ <= anInt10434; i_38_++) {
					if (i_38_ - i_33_ >= -i_34_ && i_38_ - i_33_ <= i_34_) {
						int i_39_ = (i_38_ * (aClass142_Sub1_10429.anInt1683 * 692304099) + anInt10431);
						for (int i_40_ = anInt10431; i_40_ <= anInt10432; i_40_++) {
							if (i_40_ - i >= -i_34_ && i_40_ - i <= i_34_ && (bools[i_40_ - i + i_34_][i_38_ - i_33_ + i_34_])) {
								short[] is = (aClass142_Sub1_10429.aShortArrayArray9006[i_39_]);
								if (is != null) {
									for (int i_41_ = 0; i_41_ < is.length; i_41_++) {
										bytebuffer.putShort(is[i_41_]);
										i_37_++;
									}
								}
							}
							i_39_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_37_ != 0) {
					int i_42_ = bytebuffer.position();
					Interface40 interface40 = aClass178_Sub2_10428.method14951(i_42_ / 2);
					interface40.method265(0, i_42_, aClass178_Sub2_10428.aLong9540);
					method15950(class329, interface40, i_37_ / 3);
				}
			}
		}
	}

	void method15954() {
		anInterface40_10438 = aClass178_Sub2_10428.method15029(false);
		anInterface40_10438.method275(anInt10437);
		anInterface36_10430 = aClass178_Sub2_10428.method15030(false);
		anInterface36_10430.method215(anInt10435 * 16, 16);
		anInterface36_10430.method265(0, anInt10435 * 16, aClass178_Sub2_10428.aLong9540);
		anInterface40_10438.method265(0, anInt10437 * 2, (aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1)));
	}

	void method15955(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		long l = -1L;
		int i_48_ = i_46_ + (i_44_ << aClass142_Sub1_10429.anInt1680 * -1193058675);
		int i_49_ = i_47_ + (i_45_ << aClass142_Sub1_10429.anInt1680 * -1193058675);
		int i_50_ = aClass142_Sub1_10429.method2326(i_48_, i_49_, -1146704547);
		if ((i_46_ & 0x7f) == 0 || (i_47_ & 0x7f) == 0) {
			l = ((long) i_49_ & 0xffffL) << 16 | (long) i_48_ & 0xffffL;
			Class523 class523 = aClass14_10439.getFromIndex(l);
			if (class523 != null) {
				Unsafe unsafe = aClass178_Sub2_10428.anUnsafe9538;
				unsafe.putShort((aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1) + (long) (anInt10437 * 2)), ((Class523_Sub6) class523).aShort10403);
				anInt10437++;
				return;
			}
		}
		short i_51_ = (short) anInt10435;
		if (l != -1L)
			aClass14_10439.method738(new Class523_Sub6(i_51_), l);
		float f;
		float f_52_;
		float f_53_;
		if (i_46_ == 0 && i_47_ == 0) {
			f = aFloatArrayArray10440[i][i_43_];
			f_52_ = aFloatArrayArray10441[i][i_43_];
			f_53_ = aFloatArrayArray10433[i][i_43_];
		} else if (i_46_ == aClass142_Sub1_10429.anInt1682 * 341909049 && i_47_ == 0) {
			f = aFloatArrayArray10440[i + 1][i_43_];
			f_52_ = aFloatArrayArray10441[i + 1][i_43_];
			f_53_ = aFloatArrayArray10433[i + 1][i_43_];
		} else if (i_46_ == aClass142_Sub1_10429.anInt1682 * 341909049 && i_47_ == aClass142_Sub1_10429.anInt1682 * 341909049) {
			f = aFloatArrayArray10440[i + 1][i_43_ + 1];
			f_52_ = aFloatArrayArray10441[i + 1][i_43_ + 1];
			f_53_ = aFloatArrayArray10433[i + 1][i_43_ + 1];
		} else if (i_46_ == 0 && i_47_ == aClass142_Sub1_10429.anInt1682 * 341909049) {
			f = aFloatArrayArray10440[i][i_43_ + 1];
			f_52_ = aFloatArrayArray10441[i][i_43_ + 1];
			f_53_ = aFloatArrayArray10433[i][i_43_ + 1];
		} else {
			float f_54_ = ((float) i_46_ / (float) (aClass142_Sub1_10429.anInt1682 * 341909049));
			float f_55_ = ((float) i_47_ / (float) (aClass142_Sub1_10429.anInt1682 * 341909049));
			float f_56_ = aFloatArrayArray10440[i][i_43_];
			float f_57_ = aFloatArrayArray10441[i][i_43_];
			float f_58_ = aFloatArrayArray10433[i][i_43_];
			float f_59_ = aFloatArrayArray10440[i + 1][i_43_];
			float f_60_ = aFloatArrayArray10441[i + 1][i_43_];
			float f_61_ = aFloatArrayArray10433[i + 1][i_43_];
			f_56_ += (aFloatArrayArray10440[i][i_43_ + 1] - f_56_) * f_54_;
			f_57_ += (aFloatArrayArray10441[i][i_43_ + 1] - f_57_) * f_54_;
			f_58_ += (aFloatArrayArray10433[i][i_43_ + 1] - f_58_) * f_54_;
			f_59_ += (aFloatArrayArray10440[i + 1][i_43_ + 1] - f_59_) * f_54_;
			f_60_ += (aFloatArrayArray10441[i + 1][i_43_ + 1] - f_60_) * f_54_;
			f_61_ += (aFloatArrayArray10433[i + 1][i_43_ + 1] - f_61_) * f_54_;
			f = f_56_ + (f_59_ - f_56_) * f_55_;
			f_52_ = f_57_ + (f_60_ - f_57_) * f_55_;
			f_53_ = f_58_ + (f_61_ - f_58_) * f_55_;
		}
		float f_62_ = (float) (aClass523_Sub20_10442.method16062(2131811589) - i_48_);
		float f_63_ = (float) (aClass523_Sub20_10442.method16091(1234239488) - i_50_);
		float f_64_ = (float) (aClass523_Sub20_10442.method16065(2111033108) - i_49_);
		float f_65_ = (float) Math.sqrt((double) (f_62_ * f_62_ + f_63_ * f_63_ + f_64_ * f_64_));
		float f_66_ = 1.0F / f_65_;
		f_62_ *= f_66_;
		f_63_ *= f_66_;
		f_64_ *= f_66_;
		float f_67_ = f_65_ / (float) aClass523_Sub20_10442.method16066(-1879460461);
		float f_68_ = 1.0F - f_67_ * f_67_;
		if (f_68_ < 0.0F)
			f_68_ = 0.0F;
		float f_69_ = f_62_ * f + f_63_ * f_52_ + f_64_ * f_53_;
		if (f_69_ < 0.0F)
			f_69_ = 0.0F;
		float f_70_ = f_69_ * f_68_ * 2.0F;
		if (f_70_ > 1.0F)
			f_70_ = 1.0F;
		int i_71_ = aClass523_Sub20_10442.method16067(856453637);
		int i_72_ = (int) (f_70_ * (float) (i_71_ >> 16 & 0xff));
		if (i_72_ > 255)
			i_72_ = 255;
		int i_73_ = (int) (f_70_ * (float) (i_71_ >> 8 & 0xff));
		if (i_73_ > 255)
			i_73_ = 255;
		int i_74_ = (int) (f_70_ * (float) (i_71_ & 0xff));
		if (i_74_ > 255)
			i_74_ = 255;
		Unsafe unsafe = aClass178_Sub2_10428.anUnsafe9538;
		unsafe.putFloat(aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16), (float) i_48_);
		unsafe.putFloat((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 4L), (float) i_50_);
		unsafe.putFloat((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 8L), (float) i_49_);
		if (aClass178_Sub2_10428.anInt9670 == 0) {
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 12L), (byte) i_74_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 13L), (byte) i_73_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 14L), (byte) i_72_);
		} else {
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 12L), (byte) i_72_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 13L), (byte) i_73_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 14L), (byte) i_74_);
		}
		unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 15L), (byte) -1);
		anInt10435++;
		unsafe.putShort((aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1) + (long) (anInt10437 * 2)), i_51_);
		anInt10437++;
	}

	void method15956(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_) {
		long l = -1L;
		int i_80_ = i_78_ + (i_76_ << aClass142_Sub1_10429.anInt1680 * -1193058675);
		int i_81_ = i_79_ + (i_77_ << aClass142_Sub1_10429.anInt1680 * -1193058675);
		int i_82_ = aClass142_Sub1_10429.method2326(i_80_, i_81_, 1489653799);
		if ((i_78_ & 0x7f) == 0 || (i_79_ & 0x7f) == 0) {
			l = ((long) i_81_ & 0xffffL) << 16 | (long) i_80_ & 0xffffL;
			Class523 class523 = aClass14_10439.getFromIndex(l);
			if (class523 != null) {
				Unsafe unsafe = aClass178_Sub2_10428.anUnsafe9538;
				unsafe.putShort((aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1) + (long) (anInt10437 * 2)), ((Class523_Sub6) class523).aShort10403);
				anInt10437++;
				return;
			}
		}
		short i_83_ = (short) anInt10435;
		if (l != -1L)
			aClass14_10439.method738(new Class523_Sub6(i_83_), l);
		float f;
		float f_84_;
		float f_85_;
		if (i_78_ == 0 && i_79_ == 0) {
			f = aFloatArrayArray10440[i][i_75_];
			f_84_ = aFloatArrayArray10441[i][i_75_];
			f_85_ = aFloatArrayArray10433[i][i_75_];
		} else if (i_78_ == aClass142_Sub1_10429.anInt1682 * 341909049 && i_79_ == 0) {
			f = aFloatArrayArray10440[i + 1][i_75_];
			f_84_ = aFloatArrayArray10441[i + 1][i_75_];
			f_85_ = aFloatArrayArray10433[i + 1][i_75_];
		} else if (i_78_ == aClass142_Sub1_10429.anInt1682 * 341909049 && i_79_ == aClass142_Sub1_10429.anInt1682 * 341909049) {
			f = aFloatArrayArray10440[i + 1][i_75_ + 1];
			f_84_ = aFloatArrayArray10441[i + 1][i_75_ + 1];
			f_85_ = aFloatArrayArray10433[i + 1][i_75_ + 1];
		} else if (i_78_ == 0 && i_79_ == aClass142_Sub1_10429.anInt1682 * 341909049) {
			f = aFloatArrayArray10440[i][i_75_ + 1];
			f_84_ = aFloatArrayArray10441[i][i_75_ + 1];
			f_85_ = aFloatArrayArray10433[i][i_75_ + 1];
		} else {
			float f_86_ = ((float) i_78_ / (float) (aClass142_Sub1_10429.anInt1682 * 341909049));
			float f_87_ = ((float) i_79_ / (float) (aClass142_Sub1_10429.anInt1682 * 341909049));
			float f_88_ = aFloatArrayArray10440[i][i_75_];
			float f_89_ = aFloatArrayArray10441[i][i_75_];
			float f_90_ = aFloatArrayArray10433[i][i_75_];
			float f_91_ = aFloatArrayArray10440[i + 1][i_75_];
			float f_92_ = aFloatArrayArray10441[i + 1][i_75_];
			float f_93_ = aFloatArrayArray10433[i + 1][i_75_];
			f_88_ += (aFloatArrayArray10440[i][i_75_ + 1] - f_88_) * f_86_;
			f_89_ += (aFloatArrayArray10441[i][i_75_ + 1] - f_89_) * f_86_;
			f_90_ += (aFloatArrayArray10433[i][i_75_ + 1] - f_90_) * f_86_;
			f_91_ += (aFloatArrayArray10440[i + 1][i_75_ + 1] - f_91_) * f_86_;
			f_92_ += (aFloatArrayArray10441[i + 1][i_75_ + 1] - f_92_) * f_86_;
			f_93_ += (aFloatArrayArray10433[i + 1][i_75_ + 1] - f_93_) * f_86_;
			f = f_88_ + (f_91_ - f_88_) * f_87_;
			f_84_ = f_89_ + (f_92_ - f_89_) * f_87_;
			f_85_ = f_90_ + (f_93_ - f_90_) * f_87_;
		}
		float f_94_ = (float) (aClass523_Sub20_10442.method16062(2131811589) - i_80_);
		float f_95_ = (float) (aClass523_Sub20_10442.method16091(9285875) - i_82_);
		float f_96_ = (float) (aClass523_Sub20_10442.method16065(1974946722) - i_81_);
		float f_97_ = (float) Math.sqrt((double) (f_94_ * f_94_ + f_95_ * f_95_ + f_96_ * f_96_));
		float f_98_ = 1.0F / f_97_;
		f_94_ *= f_98_;
		f_95_ *= f_98_;
		f_96_ *= f_98_;
		float f_99_ = f_97_ / (float) aClass523_Sub20_10442.method16066(-1879460461);
		float f_100_ = 1.0F - f_99_ * f_99_;
		if (f_100_ < 0.0F)
			f_100_ = 0.0F;
		float f_101_ = f_94_ * f + f_95_ * f_84_ + f_96_ * f_85_;
		if (f_101_ < 0.0F)
			f_101_ = 0.0F;
		float f_102_ = f_101_ * f_100_ * 2.0F;
		if (f_102_ > 1.0F)
			f_102_ = 1.0F;
		int i_103_ = aClass523_Sub20_10442.method16067(856453637);
		int i_104_ = (int) (f_102_ * (float) (i_103_ >> 16 & 0xff));
		if (i_104_ > 255)
			i_104_ = 255;
		int i_105_ = (int) (f_102_ * (float) (i_103_ >> 8 & 0xff));
		if (i_105_ > 255)
			i_105_ = 255;
		int i_106_ = (int) (f_102_ * (float) (i_103_ & 0xff));
		if (i_106_ > 255)
			i_106_ = 255;
		Unsafe unsafe = aClass178_Sub2_10428.anUnsafe9538;
		unsafe.putFloat(aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16), (float) i_80_);
		unsafe.putFloat((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 4L), (float) i_82_);
		unsafe.putFloat((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 8L), (float) i_81_);
		if (aClass178_Sub2_10428.anInt9670 == 0) {
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 12L), (byte) i_106_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 13L), (byte) i_105_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 14L), (byte) i_104_);
		} else {
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 12L), (byte) i_104_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 13L), (byte) i_105_);
			unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 14L), (byte) i_106_);
		}
		unsafe.putByte((aClass178_Sub2_10428.aLong9540 + (long) (anInt10435 * 16) + 15L), (byte) -1);
		anInt10435++;
		unsafe.putShort((aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1) + (long) (anInt10437 * 2)), i_83_);
		anInt10437++;
	}

	void method15957(Class329 class329, int i, int i_107_, int i_108_, boolean[][] bools, boolean bool) {
		if (anInterface40_10438 != null && anInt10431 <= i + i_108_ && anInt10432 >= i - i_108_ && anInt10443 <= i_107_ + i_108_ && anInt10434 >= i_107_ - i_108_) {
			if (bool) {
				for (int i_109_ = anInt10431; i_109_ <= anInt10432; i_109_++) {
					if (i_109_ - i >= -i_108_ && i_109_ - i <= i_108_) {
						for (int i_110_ = anInt10443; i_110_ <= anInt10434; i_110_++) {
							if (i_110_ - i_107_ >= -i_108_ && i_110_ - i_107_ <= i_108_ && (bools[i_109_ - i + i_108_][i_110_ - i_107_ + i_108_])) {
								method15950(class329, anInterface40_10438, anInt10437 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_111_ = 0;
				ByteBuffer bytebuffer = aClass178_Sub2_10428.aByteBuffer9539;
				bytebuffer.clear();
				for (int i_112_ = anInt10443; i_112_ <= anInt10434; i_112_++) {
					if (i_112_ - i_107_ >= -i_108_ && i_112_ - i_107_ <= i_108_) {
						int i_113_ = (i_112_ * (aClass142_Sub1_10429.anInt1683 * 692304099) + anInt10431);
						for (int i_114_ = anInt10431; i_114_ <= anInt10432; i_114_++) {
							if (i_114_ - i >= -i_108_ && i_114_ - i <= i_108_ && (bools[i_114_ - i + i_108_][i_112_ - i_107_ + i_108_])) {
								short[] is = (aClass142_Sub1_10429.aShortArrayArray9006[i_113_]);
								if (is != null) {
									for (int i_115_ = 0; i_115_ < is.length; i_115_++) {
										bytebuffer.putShort(is[i_115_]);
										i_111_++;
									}
								}
							}
							i_113_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_111_ != 0) {
					int i_116_ = bytebuffer.position();
					Interface40 interface40 = aClass178_Sub2_10428.method14951(i_116_ / 2);
					interface40.method265(0, i_116_, aClass178_Sub2_10428.aLong9540);
					method15950(class329, interface40, i_111_ / 3);
				}
			}
		}
	}

	void method15958(Class329 class329, int i, int i_117_, int i_118_, boolean[][] bools, boolean bool) {
		if (anInterface40_10438 != null && anInt10431 <= i + i_118_ && anInt10432 >= i - i_118_ && anInt10443 <= i_117_ + i_118_ && anInt10434 >= i_117_ - i_118_) {
			if (bool) {
				for (int i_119_ = anInt10431; i_119_ <= anInt10432; i_119_++) {
					if (i_119_ - i >= -i_118_ && i_119_ - i <= i_118_) {
						for (int i_120_ = anInt10443; i_120_ <= anInt10434; i_120_++) {
							if (i_120_ - i_117_ >= -i_118_ && i_120_ - i_117_ <= i_118_ && (bools[i_119_ - i + i_118_][i_120_ - i_117_ + i_118_])) {
								method15950(class329, anInterface40_10438, anInt10437 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_121_ = 0;
				ByteBuffer bytebuffer = aClass178_Sub2_10428.aByteBuffer9539;
				bytebuffer.clear();
				for (int i_122_ = anInt10443; i_122_ <= anInt10434; i_122_++) {
					if (i_122_ - i_117_ >= -i_118_ && i_122_ - i_117_ <= i_118_) {
						int i_123_ = (i_122_ * (aClass142_Sub1_10429.anInt1683 * 692304099) + anInt10431);
						for (int i_124_ = anInt10431; i_124_ <= anInt10432; i_124_++) {
							if (i_124_ - i >= -i_118_ && i_124_ - i <= i_118_ && (bools[i_124_ - i + i_118_][i_122_ - i_117_ + i_118_])) {
								short[] is = (aClass142_Sub1_10429.aShortArrayArray9006[i_123_]);
								if (is != null) {
									for (int i_125_ = 0; i_125_ < is.length; i_125_++) {
										bytebuffer.putShort(is[i_125_]);
										i_121_++;
									}
								}
							}
							i_123_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_121_ != 0) {
					int i_126_ = bytebuffer.position();
					Interface40 interface40 = aClass178_Sub2_10428.method14951(i_126_ / 2);
					interface40.method265(0, i_126_, aClass178_Sub2_10428.aLong9540);
					method15950(class329, interface40, i_121_ / 3);
				}
			}
		}
	}

	void method15959(Class329 class329, int i, int i_127_, int i_128_, boolean[][] bools, boolean bool) {
		if (anInterface40_10438 != null && anInt10431 <= i + i_128_ && anInt10432 >= i - i_128_ && anInt10443 <= i_127_ + i_128_ && anInt10434 >= i_127_ - i_128_) {
			if (bool) {
				for (int i_129_ = anInt10431; i_129_ <= anInt10432; i_129_++) {
					if (i_129_ - i >= -i_128_ && i_129_ - i <= i_128_) {
						for (int i_130_ = anInt10443; i_130_ <= anInt10434; i_130_++) {
							if (i_130_ - i_127_ >= -i_128_ && i_130_ - i_127_ <= i_128_ && (bools[i_129_ - i + i_128_][i_130_ - i_127_ + i_128_])) {
								method15950(class329, anInterface40_10438, anInt10437 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_131_ = 0;
				ByteBuffer bytebuffer = aClass178_Sub2_10428.aByteBuffer9539;
				bytebuffer.clear();
				for (int i_132_ = anInt10443; i_132_ <= anInt10434; i_132_++) {
					if (i_132_ - i_127_ >= -i_128_ && i_132_ - i_127_ <= i_128_) {
						int i_133_ = (i_132_ * (aClass142_Sub1_10429.anInt1683 * 692304099) + anInt10431);
						for (int i_134_ = anInt10431; i_134_ <= anInt10432; i_134_++) {
							if (i_134_ - i >= -i_128_ && i_134_ - i <= i_128_ && (bools[i_134_ - i + i_128_][i_132_ - i_127_ + i_128_])) {
								short[] is = (aClass142_Sub1_10429.aShortArrayArray9006[i_133_]);
								if (is != null) {
									for (int i_135_ = 0; i_135_ < is.length; i_135_++) {
										bytebuffer.putShort(is[i_135_]);
										i_131_++;
									}
								}
							}
							i_133_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_131_ != 0) {
					int i_136_ = bytebuffer.position();
					Interface40 interface40 = aClass178_Sub2_10428.method14951(i_136_ / 2);
					interface40.method265(0, i_136_, aClass178_Sub2_10428.aLong9540);
					method15950(class329, interface40, i_131_ / 3);
				}
			}
		}
	}

	void method15960() {
		anInterface40_10438 = aClass178_Sub2_10428.method15029(false);
		anInterface40_10438.method275(anInt10437);
		anInterface36_10430 = aClass178_Sub2_10428.method15030(false);
		anInterface36_10430.method215(anInt10435 * 16, 16);
		anInterface36_10430.method265(0, anInt10435 * 16, aClass178_Sub2_10428.aLong9540);
		anInterface40_10438.method265(0, anInt10437 * 2, (aClass178_Sub2_10428.aLong9540 + (long) (aClass178_Sub2_10428.anInt9701 >> 1)));
	}

	void method15961(Class329 class329, int i, int i_137_, int i_138_, boolean[][] bools, boolean bool) {
		if (anInterface40_10438 != null && anInt10431 <= i + i_138_ && anInt10432 >= i - i_138_ && anInt10443 <= i_137_ + i_138_ && anInt10434 >= i_137_ - i_138_) {
			if (bool) {
				for (int i_139_ = anInt10431; i_139_ <= anInt10432; i_139_++) {
					if (i_139_ - i >= -i_138_ && i_139_ - i <= i_138_) {
						for (int i_140_ = anInt10443; i_140_ <= anInt10434; i_140_++) {
							if (i_140_ - i_137_ >= -i_138_ && i_140_ - i_137_ <= i_138_ && (bools[i_139_ - i + i_138_][i_140_ - i_137_ + i_138_])) {
								method15950(class329, anInterface40_10438, anInt10437 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_141_ = 0;
				ByteBuffer bytebuffer = aClass178_Sub2_10428.aByteBuffer9539;
				bytebuffer.clear();
				for (int i_142_ = anInt10443; i_142_ <= anInt10434; i_142_++) {
					if (i_142_ - i_137_ >= -i_138_ && i_142_ - i_137_ <= i_138_) {
						int i_143_ = (i_142_ * (aClass142_Sub1_10429.anInt1683 * 692304099) + anInt10431);
						for (int i_144_ = anInt10431; i_144_ <= anInt10432; i_144_++) {
							if (i_144_ - i >= -i_138_ && i_144_ - i <= i_138_ && (bools[i_144_ - i + i_138_][i_142_ - i_137_ + i_138_])) {
								short[] is = (aClass142_Sub1_10429.aShortArrayArray9006[i_143_]);
								if (is != null) {
									for (int i_145_ = 0; i_145_ < is.length; i_145_++) {
										bytebuffer.putShort(is[i_145_]);
										i_141_++;
									}
								}
							}
							i_143_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_141_ != 0) {
					int i_146_ = bytebuffer.position();
					Interface40 interface40 = aClass178_Sub2_10428.method14951(i_146_ / 2);
					interface40.method265(0, i_146_, aClass178_Sub2_10428.aLong9540);
					method15950(class329, interface40, i_141_ / 3);
				}
			}
		}
	}

	void method15962(Class329 class329, Interface40 interface40, int i) {
		class329.anInt3493 = 0;
		class329.anInt3494 = anInt10435;
		class329.anInt3481 = 0;
		class329.anInt3496 = anInt10437 / 3;
		class329.anInterface37_3478 = aClass178_Sub2_10428.anInterface37_9669;
		float f = aClass523_Sub20_10442.method16068((byte) 0);
		class329.aClass437_3491.method6972(f, f, f);
		aClass178_Sub2_10428.method15033(0, anInterface36_10430);
		aClass178_Sub2_10428.method15032(aClass178_Sub2_10428.aClass345_9698);
		aClass178_Sub2_10428.method15213(anInterface40_10438);
		class329.method5817(0);
	}

	void method15963(Class329 class329, Interface40 interface40, int i) {
		class329.anInt3493 = 0;
		class329.anInt3494 = anInt10435;
		class329.anInt3481 = 0;
		class329.anInt3496 = anInt10437 / 3;
		class329.anInterface37_3478 = aClass178_Sub2_10428.anInterface37_9669;
		float f = aClass523_Sub20_10442.method16068((byte) 0);
		class329.aClass437_3491.method6972(f, f, f);
		aClass178_Sub2_10428.method15033(0, anInterface36_10430);
		aClass178_Sub2_10428.method15032(aClass178_Sub2_10428.aClass345_9698);
		aClass178_Sub2_10428.method15213(anInterface40_10438);
		class329.method5817(0);
	}
}
