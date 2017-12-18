/* Class328_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class328_Sub1 extends Class328 {
	Class437 aClass437_10014;
	Class437 aClass437_10015 = new Class437(Float.NaN, Float.NaN, Float.NaN);
	Class437 aClass437_10016 = new Class437(Float.NaN, Float.NaN, Float.NaN);
	int anInt10017;
	boolean aBool10018;

	public Class437 method5759() {
		return Class437.method6884(aClass437_10015);
	}

	public void method15568(Class523_Sub29 class523_sub29, byte i) {
		aClass437_10016.aFloat4903 = (float) (class523_sub29.anInt10560 * -536626413);
		aClass437_10016.aFloat4904 = (float) (class523_sub29.anInt10559 * 400741225);
		aClass437_10016.aFloat4905 = (float) (169299399 * class523_sub29.anInt10555);
		if (Float.isNaN(aClass437_10015.aFloat4903)) {
			aClass437_10015.method6886(aClass437_10016);
			aClass437_10014.method6887();
		}
		anInt10017 = -1554965903 * class523_sub29.anInt10557;
	}

	public void method5773(float f, int[][][] is, Class451 class451, int i, int i_0_, int i_1_) {
		if (aBool10018)
			method15570(is, class451, i, i_0_, 2083660088);
		aClass298_3472.method5310(true, f, aClass437_10015, aClass298_3472.method5376((short) 256), aClass437_10016, aClass437_10014, (byte) -9);
	}

	public void method5772(float f, int[][][] is, Class451 class451, int i, int i_2_) {
		if (aBool10018)
			method15570(is, class451, i, i_2_, 2083660088);
		aClass298_3472.method5310(true, f, aClass437_10015, aClass298_3472.method5376((short) 256), aClass437_10016, aClass437_10014, (byte) -81);
	}

	public Class437 method5767(int i) {
		return Class437.method6884(aClass437_10015);
	}

	public Class523_Sub29 method5766() {
		return new Class523_Sub29(1183564845 * anInt10017, (int) aClass437_10015.aFloat4903, (int) aClass437_10015.aFloat4904, (int) aClass437_10015.aFloat4905);
	}

	public Class523_Sub29 method5763(byte i) {
		return new Class523_Sub29(1183564845 * anInt10017, (int) aClass437_10015.aFloat4903, (int) aClass437_10015.aFloat4904, (int) aClass437_10015.aFloat4905);
	}

	public float method5764(int i) {
		return 0.0F;
	}

	public double[] method5769() {
		double[] ds = new double[3];
		Class437 class437 = method5767(1465348062);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public void method5760(Class523_Sub34 class523_sub34, int i) {
		aClass437_10016.method6941(class523_sub34);
	}

	public void method15569(boolean bool, int i) {
		aBool10018 = bool;
	}

	void method15570(int[][][] is, Class451 class451, int i, int i_3_, int i_4_) {
		if (method5761(-1957119123) && (aClass298_3472.method5359(-1164760089) || aClass298_3472.method5381(1544186538)) && aClass298_3472.method5381(-347143777) && is != null) {
			int i_5_ = (int) aClass437_10016.aFloat4903 - i >> 9;
			int i_6_ = (int) aClass437_10016.aFloat4905 - i_3_ >> 9;
			if (i_5_ >= 0 && i_6_ >= 0 && 1 + i_5_ < is[0].length && i_6_ + 1 < is[0][0].length) {
				int i_7_ = anInt10017 * 1183564845;
				if (class451.method7282(i_5_, i_6_, -638715901))
					i_7_ = 1 + anInt10017 * 1183564845;
				long l = (long) aClass437_10016.aFloat4903 % 512L;
				long l_8_ = (long) aClass437_10016.aFloat4905 % 512L;
				long l_9_ = ((512L - l_8_) * ((512L - l) * (long) is[i_7_][i_5_][i_6_]));
				l_9_ += (512L - l_8_) * ((long) is[i_7_][i_5_ + 1][i_6_] * l);
				l_9_ += (long) is[i_7_][i_5_][1 + i_6_] * (512L - l) * l_8_;
				l_9_ += l_8_ * (l * (long) is[i_7_][i_5_ + 1][i_6_ + 1]);
				l_9_ /= 262144L;
				l_9_ -= 512L;
				float f = (float) -l_9_ - aClass437_10016.aFloat4904;
				if (f > 0.0F)
					aClass437_10016.aFloat4904 = (float) -l_9_;
			}
		}
	}

	public void method15571(boolean bool) {
		aBool10018 = bool;
	}

	public void method15572(boolean bool) {
		aBool10018 = bool;
	}

	public void method5775(float f, int[][][] is, Class451 class451, int i, int i_10_) {
		if (aBool10018)
			method15570(is, class451, i, i_10_, 2083660088);
		aClass298_3472.method5310(true, f, aClass437_10015, aClass298_3472.method5376((short) 256), aClass437_10016, aClass437_10014, (byte) -70);
	}

	public Class328_Sub1(Class298 class298) {
		super(class298);
		aClass437_10014 = new Class437();
		aBool10018 = false;
	}

	public Class437 method5780() {
		return Class437.method6884(aClass437_10015);
	}

	public Class437 method5771() {
		return Class437.method6884(aClass437_10015);
	}

	public double[] method5776() {
		double[] ds = new double[3];
		Class437 class437 = method5767(-1840727882);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public double[] method5779() {
		double[] ds = new double[3];
		Class437 class437 = method5767(-1587114204);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public double[] method5774() {
		double[] ds = new double[3];
		Class437 class437 = method5767(-556972405);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public float method5783() {
		return 0.0F;
	}

	public void method15573(Class523_Sub29 class523_sub29) {
		aClass437_10016.aFloat4903 = (float) (class523_sub29.anInt10560 * -536626413);
		aClass437_10016.aFloat4904 = (float) (class523_sub29.anInt10559 * 400741225);
		aClass437_10016.aFloat4905 = (float) (169299399 * class523_sub29.anInt10555);
		if (Float.isNaN(aClass437_10015.aFloat4903)) {
			aClass437_10015.method6886(aClass437_10016);
			aClass437_10014.method6887();
		}
		anInt10017 = -1554965903 * class523_sub29.anInt10557;
	}

	public void method5777(Class307 class307, int i, int i_11_) {
		class307.anInt3352 = -1836718837 * ((int) aClass437_10015.aFloat4903 - i);
		class307.anInt3353 = 1864035725 * (int) -aClass437_10015.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) aClass437_10015.aFloat4905 - i_11_);
	}

	public void method5770(Class307 class307, int i, int i_12_) {
		class307.anInt3352 = -1836718837 * ((int) aClass437_10015.aFloat4903 - i);
		class307.anInt3353 = 1864035725 * (int) -aClass437_10015.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) aClass437_10015.aFloat4905 - i_12_);
	}

	public void method5778(Class523_Sub34 class523_sub34) {
		aClass437_10016.method6941(class523_sub34);
	}

	public void method5768(Class523_Sub34 class523_sub34) {
		aClass437_10016.method6941(class523_sub34);
	}

	public void method5781(Class523_Sub34 class523_sub34) {
		aClass437_10016.method6941(class523_sub34);
	}

	public double[] method5762(int i) {
		double[] ds = new double[3];
		Class437 class437 = method5767(1795013354);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public boolean method5761(int i) {
		return !Float.isNaN(aClass437_10015.aFloat4903);
	}

	public void method15574(boolean bool) {
		aBool10018 = bool;
	}

	void method15575(int[][][] is, Class451 class451, int i, int i_13_) {
		if (method5761(-1232087137) && (aClass298_3472.method5359(-1164760089) || aClass298_3472.method5381(1013926771)) && aClass298_3472.method5381(1204994157) && is != null) {
			int i_14_ = (int) aClass437_10016.aFloat4903 - i >> 9;
			int i_15_ = (int) aClass437_10016.aFloat4905 - i_13_ >> 9;
			if (i_14_ >= 0 && i_15_ >= 0 && 1 + i_14_ < is[0].length && i_15_ + 1 < is[0][0].length) {
				int i_16_ = anInt10017 * 1183564845;
				if (class451.method7282(i_14_, i_15_, -638715901))
					i_16_ = 1 + anInt10017 * 1183564845;
				long l = (long) aClass437_10016.aFloat4903 % 512L;
				long l_17_ = (long) aClass437_10016.aFloat4905 % 512L;
				long l_18_ = ((512L - l_17_) * ((512L - l) * (long) is[i_16_][i_14_][i_15_]));
				l_18_ += (512L - l_17_) * ((long) is[i_16_][i_14_ + 1][i_15_] * l);
				l_18_ += (long) is[i_16_][i_14_][1 + i_15_] * (512L - l) * l_17_;
				l_18_ += l_17_ * (l * (long) is[i_16_][i_14_ + 1][i_15_ + 1]);
				l_18_ /= 262144L;
				l_18_ -= 512L;
				float f = (float) -l_18_ - aClass437_10016.aFloat4904;
				if (f > 0.0F)
					aClass437_10016.aFloat4904 = (float) -l_18_;
			}
		}
	}

	void method15576(int[][][] is, Class451 class451, int i, int i_19_) {
		if (method5761(1914027913) && (aClass298_3472.method5359(-1164760089) || aClass298_3472.method5381(-2136588459)) && aClass298_3472.method5381(1082439503) && is != null) {
			int i_20_ = (int) aClass437_10016.aFloat4903 - i >> 9;
			int i_21_ = (int) aClass437_10016.aFloat4905 - i_19_ >> 9;
			if (i_20_ >= 0 && i_21_ >= 0 && 1 + i_20_ < is[0].length && i_21_ + 1 < is[0][0].length) {
				int i_22_ = anInt10017 * 1183564845;
				if (class451.method7282(i_20_, i_21_, -638715901))
					i_22_ = 1 + anInt10017 * 1183564845;
				long l = (long) aClass437_10016.aFloat4903 % 512L;
				long l_23_ = (long) aClass437_10016.aFloat4905 % 512L;
				long l_24_ = ((512L - l_23_) * ((512L - l) * (long) is[i_22_][i_20_][i_21_]));
				l_24_ += (512L - l_23_) * ((long) is[i_22_][i_20_ + 1][i_21_] * l);
				l_24_ += (long) is[i_22_][i_20_][1 + i_21_] * (512L - l) * l_23_;
				l_24_ += l_23_ * (l * (long) is[i_22_][i_20_ + 1][i_21_ + 1]);
				l_24_ /= 262144L;
				l_24_ -= 512L;
				float f = (float) -l_24_ - aClass437_10016.aFloat4904;
				if (f > 0.0F)
					aClass437_10016.aFloat4904 = (float) -l_24_;
			}
		}
	}

	public float method5784() {
		return 0.0F;
	}

	public float method5785() {
		return 0.0F;
	}

	public boolean method5782() {
		return !Float.isNaN(aClass437_10015.aFloat4903);
	}

	public void method5765(Class307 class307, int i, int i_25_, int i_26_) {
		class307.anInt3352 = -1836718837 * ((int) aClass437_10015.aFloat4903 - i);
		class307.anInt3353 = 1864035725 * (int) -aClass437_10015.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) aClass437_10015.aFloat4905 - i_25_);
	}

	static void method15577(int i, int i_27_, int i_28_, boolean bool, int i_29_, boolean bool_30_, short i_31_) {
		if (i < i_27_) {
			int i_32_ = (i_27_ + i) / 2;
			int i_33_ = i;
			Class611_Sub1 class611_sub1 = Class6.aClass611_Sub1Array47[i_32_];
			Class6.aClass611_Sub1Array47[i_32_] = Class6.aClass611_Sub1Array47[i_27_];
			Class6.aClass611_Sub1Array47[i_27_] = class611_sub1;
			for (int i_34_ = i; i_34_ < i_27_; i_34_++) {
				if (Class396.method6516(Class6.aClass611_Sub1Array47[i_34_], class611_sub1, i_28_, bool, i_29_, bool_30_, -1050899121) <= 0) {
					Class611_Sub1 class611_sub1_35_ = Class6.aClass611_Sub1Array47[i_34_];
					Class6.aClass611_Sub1Array47[i_34_] = Class6.aClass611_Sub1Array47[i_33_];
					Class6.aClass611_Sub1Array47[i_33_++] = class611_sub1_35_;
				}
			}
			Class6.aClass611_Sub1Array47[i_27_] = Class6.aClass611_Sub1Array47[i_33_];
			Class6.aClass611_Sub1Array47[i_33_] = class611_sub1;
			method15577(i, i_33_ - 1, i_28_, bool, i_29_, bool_30_, (short) -21031);
			method15577(1 + i_33_, i_27_, i_28_, bool, i_29_, bool_30_, (short) -24025);
		}
	}
}
