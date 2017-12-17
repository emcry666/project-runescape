/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class235 {
	int[] anIntArray2378;
	int anInt2379;
	int anInt2380;
	int anInt2381;
	int anInt2382;
	int anInt2383;
	int[] anIntArray2384;
	Class256 aClass256_2385;
	int anInt2386;
	int[][] anIntArrayArray2387;

	void method4273(Class256 class256) {
		aClass256_2385 = class256;
		anInt2382 = aClass256_2385.method4608(16);
		anInt2379 = aClass256_2385.method4608(24);
		anInt2380 = aClass256_2385.method4608(24);
		anInt2381 = aClass256_2385.method4608(24) + 1;
		anInt2386 = aClass256_2385.method4608(6) + 1;
		anInt2383 = aClass256_2385.method4608(8);
		if (anIntArray2378 == null || anIntArray2378.length != anInt2386)
			anIntArray2378 = new int[anInt2386];
		for (int i = 0; i < anInt2386; i++) {
			int i_0_ = 0;
			int i_1_ = aClass256_2385.method4608(3);
			boolean bool = aClass256_2385.method4602() != 0;
			if (bool)
				i_0_ = aClass256_2385.method4608(5);
			anIntArray2378[i] = i_0_ << 3 | i_1_;
		}
		if (anIntArray2384 == null || anIntArray2384.length != anInt2386 * 8)
			anIntArray2384 = new int[anInt2386 * 8];
		for (int i = 0; i < anInt2386 * 8; i++)
			anIntArray2384[i] = ((anIntArray2378[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass256_2385.method4608(8) : -1);
	}

	void method4274(Class256 class256) {
		aClass256_2385 = class256;
		anInt2382 = aClass256_2385.method4608(16);
		anInt2379 = aClass256_2385.method4608(24);
		anInt2380 = aClass256_2385.method4608(24);
		anInt2381 = aClass256_2385.method4608(24) + 1;
		anInt2386 = aClass256_2385.method4608(6) + 1;
		anInt2383 = aClass256_2385.method4608(8);
		if (anIntArray2378 == null || anIntArray2378.length != anInt2386)
			anIntArray2378 = new int[anInt2386];
		for (int i = 0; i < anInt2386; i++) {
			int i_2_ = 0;
			int i_3_ = aClass256_2385.method4608(3);
			boolean bool = aClass256_2385.method4602() != 0;
			if (bool)
				i_2_ = aClass256_2385.method4608(5);
			anIntArray2378[i] = i_2_ << 3 | i_3_;
		}
		if (anIntArray2384 == null || anIntArray2384.length != anInt2386 * 8)
			anIntArray2384 = new int[anInt2386 * 8];
		for (int i = 0; i < anInt2386 * 8; i++)
			anIntArray2384[i] = ((anIntArray2378[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass256_2385.method4608(8) : -1);
	}

	void method4275(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4276(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class243[] method4277(Class243[] class243s, int i, boolean[] bools) {
		int i_4_ = class243s.length;
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			if (!bools[i_5_]) {
				for (int i_6_ = 0; i_6_ < i; i_6_++)
					class243s[i_5_].aFloatArray2459[i_6_] = 0.0F;
			}
		}
		int i_7_ = aClass256_2385.aClass249Array2774[anInt2383].anInt2495;
		int i_8_ = anInt2380 - anInt2379;
		int i_9_ = i_8_ / anInt2381;
		if (anIntArrayArray2387 == null || anIntArrayArray2387.length != i_4_ || anIntArrayArray2387[0].length != i_9_)
			anIntArrayArray2387 = new int[i_4_][i_9_];
		else {
			for (int i_10_ = 0; i_10_ < i_4_; i_10_++)
				method4275(anIntArrayArray2387[i_10_]);
		}
		for (int i_11_ = 0; i_11_ < 8; i_11_++) {
			int i_12_ = 0;
			while (i_12_ < i_9_) {
				if (i_11_ == 0) {
					for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
						if (!bools[i_13_]) {
							int i_14_ = aClass256_2385.aClass249Array2774[anInt2383].method4410(aClass256_2385);
							for (int i_15_ = i_7_ - 1; i_15_ >= 0; i_15_--) {
								if (i_12_ + i_15_ < i_9_)
									anIntArrayArray2387[i_13_][i_12_ + i_15_] = i_14_ % anInt2386;
								i_14_ /= anInt2386;
							}
						}
					}
				}
				for (int i_16_ = 0; i_16_ < i_7_; i_16_++) {
					for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
						if (!bools[i_17_]) {
							int i_18_ = anIntArrayArray2387[i_17_][i_12_];
							int i_19_ = anIntArray2384[i_18_ * 8 + i_11_];
							if (i_19_ >= 0) {
								int i_20_ = anInt2379 + i_12_ * anInt2381;
								Class249 class249 = aClass256_2385.aClass249Array2774[i_19_];
								if (anInt2382 == 0) {
									int i_21_ = anInt2381 / class249.anInt2495;
									for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
										float[] fs = class249.method4411(aClass256_2385);
										for (int i_23_ = 0; i_23_ < class249.anInt2495; i_23_++)
											class243s[i_17_].aFloatArray2459[i_20_ + i_22_ + i_23_ * i_21_] += fs[i_23_];
									}
								} else if (anInt2382 == 1 || anInt2382 == 2) {
									int i_24_ = 0;
									while (i_24_ < anInt2381) {
										float[] fs = class249.method4411(aClass256_2385);
										for (int i_25_ = 0; i_25_ < class249.anInt2495; i_25_++) {
											class243s[i_17_].aFloatArray2459[i_20_ + i_24_] += fs[i_25_];
											i_24_++;
										}
									}
								}
							}
						}
					}
					if (++i_12_ >= i_9_)
						break;
				}
			}
		}
		return class243s;
	}

	void method4278(Class256 class256) {
		aClass256_2385 = class256;
		anInt2382 = aClass256_2385.method4608(16);
		anInt2379 = aClass256_2385.method4608(24);
		anInt2380 = aClass256_2385.method4608(24);
		anInt2381 = aClass256_2385.method4608(24) + 1;
		anInt2386 = aClass256_2385.method4608(6) + 1;
		anInt2383 = aClass256_2385.method4608(8);
		if (anIntArray2378 == null || anIntArray2378.length != anInt2386)
			anIntArray2378 = new int[anInt2386];
		for (int i = 0; i < anInt2386; i++) {
			int i_26_ = 0;
			int i_27_ = aClass256_2385.method4608(3);
			boolean bool = aClass256_2385.method4602() != 0;
			if (bool)
				i_26_ = aClass256_2385.method4608(5);
			anIntArray2378[i] = i_26_ << 3 | i_27_;
		}
		if (anIntArray2384 == null || anIntArray2384.length != anInt2386 * 8)
			anIntArray2384 = new int[anInt2386 * 8];
		for (int i = 0; i < anInt2386 * 8; i++)
			anIntArray2384[i] = ((anIntArray2378[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass256_2385.method4608(8) : -1);
	}

	void method4279(Class256 class256) {
		aClass256_2385 = class256;
		anInt2382 = aClass256_2385.method4608(16);
		anInt2379 = aClass256_2385.method4608(24);
		anInt2380 = aClass256_2385.method4608(24);
		anInt2381 = aClass256_2385.method4608(24) + 1;
		anInt2386 = aClass256_2385.method4608(6) + 1;
		anInt2383 = aClass256_2385.method4608(8);
		if (anIntArray2378 == null || anIntArray2378.length != anInt2386)
			anIntArray2378 = new int[anInt2386];
		for (int i = 0; i < anInt2386; i++) {
			int i_28_ = 0;
			int i_29_ = aClass256_2385.method4608(3);
			boolean bool = aClass256_2385.method4602() != 0;
			if (bool)
				i_28_ = aClass256_2385.method4608(5);
			anIntArray2378[i] = i_28_ << 3 | i_29_;
		}
		if (anIntArray2384 == null || anIntArray2384.length != anInt2386 * 8)
			anIntArray2384 = new int[anInt2386 * 8];
		for (int i = 0; i < anInt2386 * 8; i++)
			anIntArray2384[i] = ((anIntArray2378[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass256_2385.method4608(8) : -1);
	}

	Class235() {
		/* empty */
	}

	void method4280(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class243[] method4281(Class243[] class243s, int i, boolean[] bools) {
		int i_30_ = class243s.length;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
			if (!bools[i_31_]) {
				for (int i_32_ = 0; i_32_ < i; i_32_++)
					class243s[i_31_].aFloatArray2459[i_32_] = 0.0F;
			}
		}
		int i_33_ = aClass256_2385.aClass249Array2774[anInt2383].anInt2495;
		int i_34_ = anInt2380 - anInt2379;
		int i_35_ = i_34_ / anInt2381;
		if (anIntArrayArray2387 == null || anIntArrayArray2387.length != i_30_ || anIntArrayArray2387[0].length != i_35_)
			anIntArrayArray2387 = new int[i_30_][i_35_];
		else {
			for (int i_36_ = 0; i_36_ < i_30_; i_36_++)
				method4275(anIntArrayArray2387[i_36_]);
		}
		for (int i_37_ = 0; i_37_ < 8; i_37_++) {
			int i_38_ = 0;
			while (i_38_ < i_35_) {
				if (i_37_ == 0) {
					for (int i_39_ = 0; i_39_ < i_30_; i_39_++) {
						if (!bools[i_39_]) {
							int i_40_ = aClass256_2385.aClass249Array2774[anInt2383].method4410(aClass256_2385);
							for (int i_41_ = i_33_ - 1; i_41_ >= 0; i_41_--) {
								if (i_38_ + i_41_ < i_35_)
									anIntArrayArray2387[i_39_][i_38_ + i_41_] = i_40_ % anInt2386;
								i_40_ /= anInt2386;
							}
						}
					}
				}
				for (int i_42_ = 0; i_42_ < i_33_; i_42_++) {
					for (int i_43_ = 0; i_43_ < i_30_; i_43_++) {
						if (!bools[i_43_]) {
							int i_44_ = anIntArrayArray2387[i_43_][i_38_];
							int i_45_ = anIntArray2384[i_44_ * 8 + i_37_];
							if (i_45_ >= 0) {
								int i_46_ = anInt2379 + i_38_ * anInt2381;
								Class249 class249 = aClass256_2385.aClass249Array2774[i_45_];
								if (anInt2382 == 0) {
									int i_47_ = anInt2381 / class249.anInt2495;
									for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
										float[] fs = class249.method4411(aClass256_2385);
										for (int i_49_ = 0; i_49_ < class249.anInt2495; i_49_++)
											class243s[i_43_].aFloatArray2459[i_46_ + i_48_ + i_49_ * i_47_] += fs[i_49_];
									}
								} else if (anInt2382 == 1 || anInt2382 == 2) {
									int i_50_ = 0;
									while (i_50_ < anInt2381) {
										float[] fs = class249.method4411(aClass256_2385);
										for (int i_51_ = 0; i_51_ < class249.anInt2495; i_51_++) {
											class243s[i_43_].aFloatArray2459[i_46_ + i_50_] += fs[i_51_];
											i_50_++;
										}
									}
								}
							}
						}
					}
					if (++i_38_ >= i_35_)
						break;
				}
			}
		}
		return class243s;
	}

	Class243[] method4282(Class243[] class243s, int i, boolean[] bools) {
		int i_52_ = class243s.length;
		for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
			if (!bools[i_53_]) {
				for (int i_54_ = 0; i_54_ < i; i_54_++)
					class243s[i_53_].aFloatArray2459[i_54_] = 0.0F;
			}
		}
		int i_55_ = aClass256_2385.aClass249Array2774[anInt2383].anInt2495;
		int i_56_ = anInt2380 - anInt2379;
		int i_57_ = i_56_ / anInt2381;
		if (anIntArrayArray2387 == null || anIntArrayArray2387.length != i_52_ || anIntArrayArray2387[0].length != i_57_)
			anIntArrayArray2387 = new int[i_52_][i_57_];
		else {
			for (int i_58_ = 0; i_58_ < i_52_; i_58_++)
				method4275(anIntArrayArray2387[i_58_]);
		}
		for (int i_59_ = 0; i_59_ < 8; i_59_++) {
			int i_60_ = 0;
			while (i_60_ < i_57_) {
				if (i_59_ == 0) {
					for (int i_61_ = 0; i_61_ < i_52_; i_61_++) {
						if (!bools[i_61_]) {
							int i_62_ = aClass256_2385.aClass249Array2774[anInt2383].method4410(aClass256_2385);
							for (int i_63_ = i_55_ - 1; i_63_ >= 0; i_63_--) {
								if (i_60_ + i_63_ < i_57_)
									anIntArrayArray2387[i_61_][i_60_ + i_63_] = i_62_ % anInt2386;
								i_62_ /= anInt2386;
							}
						}
					}
				}
				for (int i_64_ = 0; i_64_ < i_55_; i_64_++) {
					for (int i_65_ = 0; i_65_ < i_52_; i_65_++) {
						if (!bools[i_65_]) {
							int i_66_ = anIntArrayArray2387[i_65_][i_60_];
							int i_67_ = anIntArray2384[i_66_ * 8 + i_59_];
							if (i_67_ >= 0) {
								int i_68_ = anInt2379 + i_60_ * anInt2381;
								Class249 class249 = aClass256_2385.aClass249Array2774[i_67_];
								if (anInt2382 == 0) {
									int i_69_ = anInt2381 / class249.anInt2495;
									for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
										float[] fs = class249.method4411(aClass256_2385);
										for (int i_71_ = 0; i_71_ < class249.anInt2495; i_71_++)
											class243s[i_65_].aFloatArray2459[i_68_ + i_70_ + i_71_ * i_69_] += fs[i_71_];
									}
								} else if (anInt2382 == 1 || anInt2382 == 2) {
									int i_72_ = 0;
									while (i_72_ < anInt2381) {
										float[] fs = class249.method4411(aClass256_2385);
										for (int i_73_ = 0; i_73_ < class249.anInt2495; i_73_++) {
											class243s[i_65_].aFloatArray2459[i_68_ + i_72_] += fs[i_73_];
											i_72_++;
										}
									}
								}
							}
						}
					}
					if (++i_60_ >= i_57_)
						break;
				}
			}
		}
		return class243s;
	}
}
