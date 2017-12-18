/* Class328_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class328_Sub3 extends Class328 {
	Class444[] aClass444Array10143;
	float[] aFloatArray10144;
	float aFloat10145;
	int anInt10146 = 0;
	float aFloat10147;
	int[] anIntArray10148;

	public void method5772(float f, int[][][] is, Class451 class451, int i, int i_0_) {
		Class444 class444 = aClass444Array10143[anInt10146 * -431742841];
		if (aFloatArray10144[anInt10146 * -431742841] > 0.0F) {
			if (aFloatArray10144[-431742841 * anInt10146] >= f) {
				aFloatArray10144[anInt10146 * -431742841] -= f;
				return;
			}
			f -= aFloatArray10144[anInt10146 * -431742841];
			aFloatArray10144[-431742841 * anInt10146] = 0.0F;
		}
		float f_1_ = 1.0F / (float) Class286.method5150(1994300298);
		while (f > 0.0F) {
			float f_2_ = class444.method7211();
			if (aFloat10145 >= f_2_) {
				if (1 + anInt10146 * -431742841 == aClass444Array10143.length)
					break;
				if (aFloatArray10144[anInt10146 * -431742841 + 1] >= f) {
					aFloatArray10144[-431742841 * anInt10146 + 1] -= f;
					break;
				}
				anInt10146 += -974478025;
				f -= aFloatArray10144[-431742841 * anInt10146];
				aFloatArray10144[anInt10146 * -431742841] = 0.0F;
				method15682(864139692);
				aFloat10145 = 0.0F;
				aFloat10147 = 0.0F;
				class444 = aClass444Array10143[anInt10146 * -431742841];
				f_2_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10145 < f_2_) {
				aFloat10147 = method15680(f_2_, aFloat10147, Math.min(f, f_1_), (short) -7355);
				f -= f_1_;
				method15685(aFloat10147, f_2_, 1795908656);
			}
		}
	}

	public void method15678(Class444 class444, int i, float f, byte i_3_) {
		if (aClass444Array10143 == null) {
			aClass444Array10143 = new Class444[] { class444 };
			aFloatArray10144 = new float[] { f };
			anIntArray10148 = new int[] { i };
		} else {
			Class444[] class444s = new Class444[1 + aClass444Array10143.length];
			float[] fs = new float[1 + aClass444Array10143.length];
			int[] is = new int[aClass444Array10143.length + 1];
			System.arraycopy(aClass444Array10143, 0, class444s, 0, aClass444Array10143.length);
			System.arraycopy(aFloatArray10144, 0, fs, 0, aClass444Array10143.length);
			System.arraycopy(anIntArray10148, 0, is, 0, aClass444Array10143.length);
			aClass444Array10143 = class444s;
			aFloatArray10144 = fs;
			anIntArray10148 = is;
			aClass444Array10143[aClass444Array10143.length - 1] = class444;
			aFloatArray10144[aFloatArray10144.length - 1] = f;
			anIntArray10148[anIntArray10148.length - 1] = i;
		}
	}

	public void method15679(Class444 class444, int i, float f) {
		if (aClass444Array10143 == null) {
			aClass444Array10143 = new Class444[] { class444 };
			aFloatArray10144 = new float[] { f };
			anIntArray10148 = new int[] { i };
		} else {
			Class444[] class444s = new Class444[1 + aClass444Array10143.length];
			float[] fs = new float[1 + aClass444Array10143.length];
			int[] is = new int[aClass444Array10143.length + 1];
			System.arraycopy(aClass444Array10143, 0, class444s, 0, aClass444Array10143.length);
			System.arraycopy(aFloatArray10144, 0, fs, 0, aClass444Array10143.length);
			System.arraycopy(anIntArray10148, 0, is, 0, aClass444Array10143.length);
			aClass444Array10143 = class444s;
			aFloatArray10144 = fs;
			anIntArray10148 = is;
			aClass444Array10143[aClass444Array10143.length - 1] = class444;
			aFloatArray10144[aFloatArray10144.length - 1] = f;
			anIntArray10148[anIntArray10148.length - 1] = i;
		}
	}

	public Class437 method5780() {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	abstract float method15680(float f, float f_4_, float f_5_, short i);

	public void method5773(float f, int[][][] is, Class451 class451, int i, int i_6_, int i_7_) {
		Class444 class444 = aClass444Array10143[anInt10146 * -431742841];
		if (aFloatArray10144[anInt10146 * -431742841] > 0.0F) {
			if (aFloatArray10144[-431742841 * anInt10146] >= f) {
				aFloatArray10144[anInt10146 * -431742841] -= f;
				return;
			}
			f -= aFloatArray10144[anInt10146 * -431742841];
			aFloatArray10144[-431742841 * anInt10146] = 0.0F;
		}
		float f_8_ = 1.0F / (float) Class286.method5150(2028110754);
		while (f > 0.0F) {
			float f_9_ = class444.method7211();
			if (aFloat10145 >= f_9_) {
				if (1 + anInt10146 * -431742841 == aClass444Array10143.length)
					break;
				if (aFloatArray10144[anInt10146 * -431742841 + 1] >= f) {
					aFloatArray10144[-431742841 * anInt10146 + 1] -= f;
					break;
				}
				anInt10146 += -974478025;
				f -= aFloatArray10144[-431742841 * anInt10146];
				aFloatArray10144[anInt10146 * -431742841] = 0.0F;
				method15682(-444657440);
				aFloat10145 = 0.0F;
				aFloat10147 = 0.0F;
				class444 = aClass444Array10143[anInt10146 * -431742841];
				f_9_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10145 < f_9_) {
				aFloat10147 = method15680(f_9_, aFloat10147, Math.min(f, f_8_), (short) 13498);
				f -= f_8_;
				method15685(aFloat10147, f_9_, 1965952114);
			}
		}
	}

	public double[] method5774() {
		return aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
	}

	public Class437 method5767(int i) {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	public double[] method5762(int i) {
		return aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
	}

	public double[] method5779() {
		return aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
	}

	public float method15681(int i) {
		return aClass444Array10143[-431742841 * anInt10146].method7226(aFloat10145);
	}

	abstract void method15682(int i);

	public void method5765(Class307 class307, int i, int i_10_, int i_11_) {
		Class437 class437 = method5767(1852021961);
		class307.anInt3352 = ((int) class437.aFloat4903 - i) * -1836718837;
		class307.anInt3353 = 1864035725 * (int) -class437.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) class437.aFloat4905 - i_10_);
	}

	public void method5760(Class523_Sub34 class523_sub34, int i) {
		aFloat10145 = 0.0F;
		aFloat10147 = 0.0F;
		anInt10146 = 0;
		int i_12_ = class523_sub34.readUnsignedByte(-1865269540);
		aClass444Array10143 = new Class444[i_12_];
		aFloatArray10144 = new float[i_12_];
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			aClass444Array10143[i_13_] = new Class444(class523_sub34);
			aFloatArray10144[i_13_] = class523_sub34.method16293(-664781102);
		}
		method15686(class523_sub34, i_12_, 125373281);
	}

	public void method5777(Class307 class307, int i, int i_14_) {
		Class437 class437 = method5767(-130689919);
		class307.anInt3352 = ((int) class437.aFloat4903 - i) * -1836718837;
		class307.anInt3353 = 1864035725 * (int) -class437.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) class437.aFloat4905 - i_14_);
	}

	public boolean method5761(int i) {
		return null != aClass444Array10143;
	}

	abstract void method15683(Class523_Sub34 class523_sub34, int i);

	void method15684(float f, float f_15_) {
		aFloat10145 += f;
		if (aFloat10145 > f_15_)
			aFloat10145 = f_15_;
	}

	Class328_Sub3(Class298 class298) {
		super(class298);
		aFloat10145 = 0.0F;
		aFloat10147 = 0.0F;
	}

	public boolean method5782() {
		return null != aClass444Array10143;
	}

	void method15685(float f, float f_16_, int i) {
		aFloat10145 += f;
		if (aFloat10145 > f_16_)
			aFloat10145 = f_16_;
	}

	public Class437 method5771() {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	public Class437 method5759() {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	public float method5764(int i) {
		return aClass444Array10143[anInt10146 * -431742841].method7215(aFloat10145);
	}

	abstract void method15686(Class523_Sub34 class523_sub34, int i, int i_17_);

	public double[] method5769() {
		return aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
	}

	public double[] method5776() {
		return aClass444Array10143[-431742841 * anInt10146].method7212(aFloat10145);
	}

	public void method5775(float f, int[][][] is, Class451 class451, int i, int i_18_) {
		Class444 class444 = aClass444Array10143[anInt10146 * -431742841];
		if (aFloatArray10144[anInt10146 * -431742841] > 0.0F) {
			if (aFloatArray10144[-431742841 * anInt10146] >= f) {
				aFloatArray10144[anInt10146 * -431742841] -= f;
				return;
			}
			f -= aFloatArray10144[anInt10146 * -431742841];
			aFloatArray10144[-431742841 * anInt10146] = 0.0F;
		}
		float f_19_ = 1.0F / (float) Class286.method5150(2060946989);
		while (f > 0.0F) {
			float f_20_ = class444.method7211();
			if (aFloat10145 >= f_20_) {
				if (1 + anInt10146 * -431742841 == aClass444Array10143.length)
					break;
				if (aFloatArray10144[anInt10146 * -431742841 + 1] >= f) {
					aFloatArray10144[-431742841 * anInt10146 + 1] -= f;
					break;
				}
				anInt10146 += -974478025;
				f -= aFloatArray10144[-431742841 * anInt10146];
				aFloatArray10144[anInt10146 * -431742841] = 0.0F;
				method15682(-2094215644);
				aFloat10145 = 0.0F;
				aFloat10147 = 0.0F;
				class444 = aClass444Array10143[anInt10146 * -431742841];
				f_20_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10145 < f_20_) {
				aFloat10147 = method15680(f_20_, aFloat10147, Math.min(f, f_19_), (short) -27083);
				f -= f_19_;
				method15685(aFloat10147, f_20_, 2043717665);
			}
		}
	}

	public void method5770(Class307 class307, int i, int i_21_) {
		Class437 class437 = method5767(-204814656);
		class307.anInt3352 = ((int) class437.aFloat4903 - i) * -1836718837;
		class307.anInt3353 = 1864035725 * (int) -class437.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) class437.aFloat4905 - i_21_);
	}

	public void method5778(Class523_Sub34 class523_sub34) {
		aFloat10145 = 0.0F;
		aFloat10147 = 0.0F;
		anInt10146 = 0;
		int i = class523_sub34.readUnsignedByte(-1939231007);
		aClass444Array10143 = new Class444[i];
		aFloatArray10144 = new float[i];
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			aClass444Array10143[i_22_] = new Class444(class523_sub34);
			aFloatArray10144[i_22_] = class523_sub34.method16293(-1204353927);
		}
		method15686(class523_sub34, i, 6753656);
	}

	public void method5768(Class523_Sub34 class523_sub34) {
		aFloat10145 = 0.0F;
		aFloat10147 = 0.0F;
		anInt10146 = 0;
		int i = class523_sub34.readUnsignedByte(-613191000);
		aClass444Array10143 = new Class444[i];
		aFloatArray10144 = new float[i];
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			aClass444Array10143[i_23_] = new Class444(class523_sub34);
			aFloatArray10144[i_23_] = class523_sub34.method16293(-2027178300);
		}
		method15686(class523_sub34, i, -69938551);
	}

	public void method5781(Class523_Sub34 class523_sub34) {
		aFloat10145 = 0.0F;
		aFloat10147 = 0.0F;
		anInt10146 = 0;
		int i = class523_sub34.readUnsignedByte(1803200875);
		aClass444Array10143 = new Class444[i];
		aFloatArray10144 = new float[i];
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			aClass444Array10143[i_24_] = new Class444(class523_sub34);
			aFloatArray10144[i_24_] = class523_sub34.method16293(-1439076989);
		}
		method15686(class523_sub34, i, -500590082);
	}

	public Class523_Sub29 method5766() {
		Class437 class437 = method5767(1808072429);
		return new Class523_Sub29(0, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905);
	}

	public float method5783() {
		return aClass444Array10143[anInt10146 * -431742841].method7215(aFloat10145);
	}

	public float method5784() {
		return aClass444Array10143[anInt10146 * -431742841].method7215(aFloat10145);
	}

	public Class523_Sub29 method5763(byte i) {
		Class437 class437 = method5767(1730079703);
		return new Class523_Sub29(0, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905);
	}

	abstract void method15687();

	abstract float method15688(float f, float f_25_, float f_26_);

	abstract void method15689(Class523_Sub34 class523_sub34, int i);

	void method15690(float f, float f_27_) {
		aFloat10145 += f;
		if (aFloat10145 > f_27_)
			aFloat10145 = f_27_;
	}

	public float method15691() {
		return aClass444Array10143[-431742841 * anInt10146].method7226(aFloat10145);
	}

	public float method15692() {
		return aClass444Array10143[-431742841 * anInt10146].method7226(aFloat10145);
	}

	public float method5785() {
		return aClass444Array10143[anInt10146 * -431742841].method7215(aFloat10145);
	}

	public void method15693(Class444 class444, int i, float f) {
		if (aClass444Array10143 == null) {
			aClass444Array10143 = new Class444[] { class444 };
			aFloatArray10144 = new float[] { f };
			anIntArray10148 = new int[] { i };
		} else {
			Class444[] class444s = new Class444[1 + aClass444Array10143.length];
			float[] fs = new float[1 + aClass444Array10143.length];
			int[] is = new int[aClass444Array10143.length + 1];
			System.arraycopy(aClass444Array10143, 0, class444s, 0, aClass444Array10143.length);
			System.arraycopy(aFloatArray10144, 0, fs, 0, aClass444Array10143.length);
			System.arraycopy(anIntArray10148, 0, is, 0, aClass444Array10143.length);
			aClass444Array10143 = class444s;
			aFloatArray10144 = fs;
			anIntArray10148 = is;
			aClass444Array10143[aClass444Array10143.length - 1] = class444;
			aFloatArray10144[aFloatArray10144.length - 1] = f;
			anIntArray10148[anIntArray10148.length - 1] = i;
		}
	}

	public static String method15694(int i, int i_28_) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	static void method15695(long[] ls, int[] is, int i, int i_29_, int i_30_) {
		if (i < i_29_) {
			int i_31_ = (i_29_ + i) / 2;
			int i_32_ = i;
			long l = ls[i_31_];
			ls[i_31_] = ls[i_29_];
			ls[i_29_] = l;
			int i_33_ = is[i_31_];
			is[i_31_] = is[i_29_];
			is[i_29_] = i_33_;
			int i_34_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_35_ = i; i_35_ < i_29_; i_35_++) {
				if (ls[i_35_] < l + (long) (i_35_ & i_34_)) {
					long l_36_ = ls[i_35_];
					ls[i_35_] = ls[i_32_];
					ls[i_32_] = l_36_;
					int i_37_ = is[i_35_];
					is[i_35_] = is[i_32_];
					is[i_32_++] = i_37_;
				}
			}
			ls[i_29_] = ls[i_32_];
			ls[i_32_] = l;
			is[i_29_] = is[i_32_];
			is[i_32_] = i_33_;
			method15695(ls, is, i, i_32_ - 1, -450219834);
			method15695(ls, is, 1 + i_32_, i_29_, -1048294882);
		}
	}
}
