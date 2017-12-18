/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class247 {
	int[] anIntArray2481;
	int anInt2482;
	int[] anIntArray2483 = null;
	Class256 aClass256_2484;
	int[] anIntArray2485;
	int[] anIntArray2486;
	int anInt2487;
	int[] anIntArray2488;

	void method4389(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4390(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4391(Class256 class256) {
		aClass256_2484 = class256;
		int i = aClass256_2484.method4590();
		aClass256_2484.method4608(16);
		anInt2487 = (aClass256_2484.method4602() != 0 ? aClass256_2484.method4608(4) + 1 : 1);
		if (aClass256_2484.method4602() != 0) {
			anInt2482 = aClass256_2484.method4608(8) + 1;
			if (anIntArray2488 == null || anIntArray2488.length != anInt2482)
				anIntArray2488 = new int[anInt2482];
			else
				method4390(anIntArray2488);
			if (anIntArray2485 == null || anIntArray2485.length != anInt2482)
				anIntArray2485 = new int[anInt2482];
			else
				method4390(anIntArray2485);
			for (int i_0_ = 0; i_0_ < anInt2482; i_0_++) {
				anIntArray2488[i_0_] = aClass256_2484.method4608(method4394(i - 1));
				anIntArray2485[i_0_] = aClass256_2484.method4608(method4394(i - 1));
			}
		} else
			anInt2482 = 0;
		aClass256_2484.method4608(2);
		if (anInt2487 > 1) {
			anIntArray2483 = new int[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++)
				anIntArray2483[i_1_] = aClass256_2484.method4608(4);
		}
		if (anIntArray2481 == null || anIntArray2481.length != anInt2487)
			anIntArray2481 = new int[anInt2487];
		else
			method4390(anIntArray2481);
		if (anIntArray2486 == null || anIntArray2486.length != anInt2487)
			anIntArray2486 = new int[anInt2487];
		else
			method4390(anIntArray2486);
		for (int i_2_ = 0; i_2_ < anInt2487; i_2_++) {
			aClass256_2484.method4608(8);
			anIntArray2481[i_2_] = aClass256_2484.method4608(8);
			anIntArray2486[i_2_] = aClass256_2484.method4608(8);
		}
	}

	void method4392(Class256 class256) {
		aClass256_2484 = class256;
		int i = aClass256_2484.method4590();
		aClass256_2484.method4608(16);
		anInt2487 = (aClass256_2484.method4602() != 0 ? aClass256_2484.method4608(4) + 1 : 1);
		if (aClass256_2484.method4602() != 0) {
			anInt2482 = aClass256_2484.method4608(8) + 1;
			if (anIntArray2488 == null || anIntArray2488.length != anInt2482)
				anIntArray2488 = new int[anInt2482];
			else
				method4390(anIntArray2488);
			if (anIntArray2485 == null || anIntArray2485.length != anInt2482)
				anIntArray2485 = new int[anInt2482];
			else
				method4390(anIntArray2485);
			for (int i_3_ = 0; i_3_ < anInt2482; i_3_++) {
				anIntArray2488[i_3_] = aClass256_2484.method4608(method4394(i - 1));
				anIntArray2485[i_3_] = aClass256_2484.method4608(method4394(i - 1));
			}
		} else
			anInt2482 = 0;
		aClass256_2484.method4608(2);
		if (anInt2487 > 1) {
			anIntArray2483 = new int[i];
			for (int i_4_ = 0; i_4_ < i; i_4_++)
				anIntArray2483[i_4_] = aClass256_2484.method4608(4);
		}
		if (anIntArray2481 == null || anIntArray2481.length != anInt2487)
			anIntArray2481 = new int[anInt2487];
		else
			method4390(anIntArray2481);
		if (anIntArray2486 == null || anIntArray2486.length != anInt2487)
			anIntArray2486 = new int[anInt2487];
		else
			method4390(anIntArray2486);
		for (int i_5_ = 0; i_5_ < anInt2487; i_5_++) {
			aClass256_2484.method4608(8);
			anIntArray2481[i_5_] = aClass256_2484.method4608(8);
			anIntArray2486[i_5_] = aClass256_2484.method4608(8);
		}
	}

	void method4393(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	int method4394(int i) {
		int i_6_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_6_++;
		return i_6_;
	}

	void method4395(Class256 class256) {
		aClass256_2484 = class256;
		int i = aClass256_2484.method4590();
		aClass256_2484.method4608(16);
		anInt2487 = (aClass256_2484.method4602() != 0 ? aClass256_2484.method4608(4) + 1 : 1);
		if (aClass256_2484.method4602() != 0) {
			anInt2482 = aClass256_2484.method4608(8) + 1;
			if (anIntArray2488 == null || anIntArray2488.length != anInt2482)
				anIntArray2488 = new int[anInt2482];
			else
				method4390(anIntArray2488);
			if (anIntArray2485 == null || anIntArray2485.length != anInt2482)
				anIntArray2485 = new int[anInt2482];
			else
				method4390(anIntArray2485);
			for (int i_7_ = 0; i_7_ < anInt2482; i_7_++) {
				anIntArray2488[i_7_] = aClass256_2484.method4608(method4394(i - 1));
				anIntArray2485[i_7_] = aClass256_2484.method4608(method4394(i - 1));
			}
		} else
			anInt2482 = 0;
		aClass256_2484.method4608(2);
		if (anInt2487 > 1) {
			anIntArray2483 = new int[i];
			for (int i_8_ = 0; i_8_ < i; i_8_++)
				anIntArray2483[i_8_] = aClass256_2484.method4608(4);
		}
		if (anIntArray2481 == null || anIntArray2481.length != anInt2487)
			anIntArray2481 = new int[anInt2487];
		else
			method4390(anIntArray2481);
		if (anIntArray2486 == null || anIntArray2486.length != anInt2487)
			anIntArray2486 = new int[anInt2487];
		else
			method4390(anIntArray2486);
		for (int i_9_ = 0; i_9_ < anInt2487; i_9_++) {
			aClass256_2484.method4608(8);
			anIntArray2481[i_9_] = aClass256_2484.method4608(8);
			anIntArray2486[i_9_] = aClass256_2484.method4608(8);
		}
	}

	Class247() {
		/* empty */
	}

	void method4396(Class256 class256) {
		aClass256_2484 = class256;
		int i = aClass256_2484.method4590();
		aClass256_2484.method4608(16);
		anInt2487 = (aClass256_2484.method4602() != 0 ? aClass256_2484.method4608(4) + 1 : 1);
		if (aClass256_2484.method4602() != 0) {
			anInt2482 = aClass256_2484.method4608(8) + 1;
			if (anIntArray2488 == null || anIntArray2488.length != anInt2482)
				anIntArray2488 = new int[anInt2482];
			else
				method4390(anIntArray2488);
			if (anIntArray2485 == null || anIntArray2485.length != anInt2482)
				anIntArray2485 = new int[anInt2482];
			else
				method4390(anIntArray2485);
			for (int i_10_ = 0; i_10_ < anInt2482; i_10_++) {
				anIntArray2488[i_10_] = aClass256_2484.method4608(method4394(i - 1));
				anIntArray2485[i_10_] = aClass256_2484.method4608(method4394(i - 1));
			}
		} else
			anInt2482 = 0;
		aClass256_2484.method4608(2);
		if (anInt2487 > 1) {
			anIntArray2483 = new int[i];
			for (int i_11_ = 0; i_11_ < i; i_11_++)
				anIntArray2483[i_11_] = aClass256_2484.method4608(4);
		}
		if (anIntArray2481 == null || anIntArray2481.length != anInt2487)
			anIntArray2481 = new int[anInt2487];
		else
			method4390(anIntArray2481);
		if (anIntArray2486 == null || anIntArray2486.length != anInt2487)
			anIntArray2486 = new int[anInt2487];
		else
			method4390(anIntArray2486);
		for (int i_12_ = 0; i_12_ < anInt2487; i_12_++) {
			aClass256_2484.method4608(8);
			anIntArray2481[i_12_] = aClass256_2484.method4608(8);
			anIntArray2486[i_12_] = aClass256_2484.method4608(8);
		}
	}

	int method4397(int i) {
		int i_13_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_13_++;
		return i_13_;
	}

	int method4398(int i) {
		int i_14_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_14_++;
		return i_14_;
	}

	int method4399(int i) {
		int i_15_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_15_++;
		return i_15_;
	}
}
