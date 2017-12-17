/* Class688_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class688_Sub4 extends Class688 {
	float aFloat10958;
	float[] aFloatArray10959;
	int anInt10960 = 0;
	float aFloat10961 = 0.0F;
	Class444[] aClass444Array10962;
	int[] anIntArray10963;
	static int anInt10964;

	Class688_Sub4(Class298 class298) {
		super(class298);
		aFloat10958 = 0.0F;
	}

	public void method17147(Class444 class444, int i, float f, int i_0_) {
		if (null == aClass444Array10962) {
			aClass444Array10962 = new Class444[] { class444 };
			aFloatArray10959 = new float[] { f };
			anIntArray10963 = new int[] { i };
		} else {
			Class444[] class444s = new Class444[1 + aClass444Array10962.length];
			float[] fs = new float[aClass444Array10962.length + 1];
			int[] is = new int[aClass444Array10962.length + 1];
			System.arraycopy(aClass444Array10962, 0, class444s, 0, aClass444Array10962.length);
			System.arraycopy(aFloatArray10959, 0, fs, 0, aClass444Array10962.length);
			System.arraycopy(anIntArray10963, 0, is, 0, aClass444Array10962.length);
			aClass444Array10962 = class444s;
			aFloatArray10959 = fs;
			anIntArray10963 = is;
			aClass444Array10962[aClass444Array10962.length - 1] = class444;
			aFloatArray10959[aFloatArray10959.length - 1] = f;
			anIntArray10963[anIntArray10963.length - 1] = i;
		}
	}

	public void method13924(float f, byte i) {
		Class444 class444 = aClass444Array10962[anInt10960 * 1705055177];
		if (aFloatArray10959[anInt10960 * 1705055177] > 0.0F) {
			if (aFloatArray10959[1705055177 * anInt10960] >= f) {
				aFloatArray10959[1705055177 * anInt10960] -= f;
				return;
			}
			f -= aFloatArray10959[1705055177 * anInt10960];
			aFloatArray10959[1705055177 * anInt10960] = 0.0F;
		}
		float f_1_ = 1.0F / (float) Class286.method5150(2051782233);
		while (f > 0.0F) {
			float f_2_ = class444.method7211();
			if (aFloat10961 >= f_2_) {
				if (1 + anInt10960 * 1705055177 == aClass444Array10962.length)
					break;
				if (aFloatArray10959[1705055177 * anInt10960 + 1] >= f) {
					aFloatArray10959[1705055177 * anInt10960 + 1] -= f;
					break;
				}
				anInt10960 += -481855879;
				f -= aFloatArray10959[anInt10960 * 1705055177];
				aFloatArray10959[1705055177 * anInt10960] = 0.0F;
				method17158((byte) 10);
				aFloat10961 = 0.0F;
				aFloat10958 = 0.0F;
				class444 = aClass444Array10962[1705055177 * anInt10960];
				f_2_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10961 < f_2_) {
				aFloat10958 = method17149(f_2_, aFloat10958, Math.min(f, f_1_), -959959184);
				f -= f_1_;
				method17148(aFloat10958, f_2_, (byte) 66);
			}
		}
	}

	void method17148(float f, float f_3_, byte i) {
		aFloat10961 += f;
		if (aFloat10961 > f_3_)
			aFloat10961 = f_3_;
	}

	abstract float method17149(float f, float f_4_, float f_5_, int i);

	public Class437 method13923() {
		return method13909(-144217066);
	}

	public boolean method13906(int i) {
		return aClass444Array10962 != null;
	}

	public Class437 method13909(int i) {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	double[] method17150(int i) {
		return aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
	}

	public Class437 method13908(int i) {
		return method13909(895315447);
	}

	public void method13904(Class307 class307, Class435 class435, int i, int i_6_, float f, int i_7_) {
		double[] ds = aClass298_8675.method5344((byte) -24);
		ds[0] -= (double) i;
		ds[2] -= (double) i_6_;
		double[] ds_8_ = method17150(65535);
		ds_8_[0] -= (double) i;
		ds_8_[2] -= (double) i_6_;
		ds[1] *= -1.0;
		ds_8_[1] *= -1.0;
		Class437 class437 = Class437.method6878();
		class437.aFloat4903 = (float) (ds_8_[0] - ds[0]);
		class437.aFloat4904 = (float) (ds_8_[1] - ds[1]);
		class437.aFloat4905 = (float) (ds_8_[2] - ds[2]);
		class437.method6890();
		Class440 class440 = new Class440();
		class440.method7016(class437, f);
		Class437 class437_9_ = Class437.method6879(0.0F, 1.0F, 0.0F);
		Class437 class437_10_ = Class437.method6960(class437, class437_9_);
		class437_9_ = Class437.method6960(class437_10_, class437);
		class437_9_.method6907(class440);
		class435.method6807(ds[0], ds[1], ds[2], ds_8_[0], ds_8_[1], ds_8_[2], class437_9_.aFloat4903, class437_9_.aFloat4904, class437_9_.aFloat4905);
		class437_9_.method6949();
	}

	public void method13910(Class523_Sub34 class523_sub34, int i) {
		aFloat10961 = 0.0F;
		aFloat10958 = 0.0F;
		anInt10960 = 0;
		int i_11_ = class523_sub34.readUnsignedByte(-771507058);
		aClass444Array10962 = new Class444[i_11_];
		aFloatArray10959 = new float[i_11_];
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			aClass444Array10962[i_12_] = new Class444(class523_sub34);
			aFloatArray10959[i_12_] = class523_sub34.method16293(-835202543);
		}
		method17151(class523_sub34, i_11_, -2072077092);
	}

	abstract void method17151(Class523_Sub34 class523_sub34, int i, int i_13_);

	public void method13912(float f) {
		Class444 class444 = aClass444Array10962[anInt10960 * 1705055177];
		if (aFloatArray10959[anInt10960 * 1705055177] > 0.0F) {
			if (aFloatArray10959[1705055177 * anInt10960] >= f) {
				aFloatArray10959[1705055177 * anInt10960] -= f;
				return;
			}
			f -= aFloatArray10959[1705055177 * anInt10960];
			aFloatArray10959[1705055177 * anInt10960] = 0.0F;
		}
		float f_14_ = 1.0F / (float) Class286.method5150(1976320194);
		while (f > 0.0F) {
			float f_15_ = class444.method7211();
			if (aFloat10961 >= f_15_) {
				if (1 + anInt10960 * 1705055177 == aClass444Array10962.length)
					break;
				if (aFloatArray10959[1705055177 * anInt10960 + 1] >= f) {
					aFloatArray10959[1705055177 * anInt10960 + 1] -= f;
					break;
				}
				anInt10960 += -481855879;
				f -= aFloatArray10959[anInt10960 * 1705055177];
				aFloatArray10959[1705055177 * anInt10960] = 0.0F;
				method17158((byte) -36);
				aFloat10961 = 0.0F;
				aFloat10958 = 0.0F;
				class444 = aClass444Array10962[1705055177 * anInt10960];
				f_15_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10961 < f_15_) {
				aFloat10958 = method17149(f_15_, aFloat10958, Math.min(f, f_14_), -417274493);
				f -= f_14_;
				method17148(aFloat10958, f_15_, (byte) 126);
			}
		}
	}

	abstract float method17152(float f, float f_16_, float f_17_);

	abstract void method17153();

	abstract void method17154();

	double[] method17155() {
		return aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
	}

	public void method13925(Class523_Sub34 class523_sub34) {
		aFloat10961 = 0.0F;
		aFloat10958 = 0.0F;
		anInt10960 = 0;
		int i = class523_sub34.readUnsignedByte(1595375247);
		aClass444Array10962 = new Class444[i];
		aFloatArray10959 = new float[i];
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			aClass444Array10962[i_18_] = new Class444(class523_sub34);
			aFloatArray10959[i_18_] = class523_sub34.method16293(-1049761033);
		}
		method17151(class523_sub34, i, 1264711884);
	}

	abstract void method17156();

	abstract void method17157();

	public void method13911(float f) {
		Class444 class444 = aClass444Array10962[anInt10960 * 1705055177];
		if (aFloatArray10959[anInt10960 * 1705055177] > 0.0F) {
			if (aFloatArray10959[1705055177 * anInt10960] >= f) {
				aFloatArray10959[1705055177 * anInt10960] -= f;
				return;
			}
			f -= aFloatArray10959[1705055177 * anInt10960];
			aFloatArray10959[1705055177 * anInt10960] = 0.0F;
		}
		float f_19_ = 1.0F / (float) Class286.method5150(2103028955);
		while (f > 0.0F) {
			float f_20_ = class444.method7211();
			if (aFloat10961 >= f_20_) {
				if (1 + anInt10960 * 1705055177 == aClass444Array10962.length)
					break;
				if (aFloatArray10959[1705055177 * anInt10960 + 1] >= f) {
					aFloatArray10959[1705055177 * anInt10960 + 1] -= f;
					break;
				}
				anInt10960 += -481855879;
				f -= aFloatArray10959[anInt10960 * 1705055177];
				aFloatArray10959[1705055177 * anInt10960] = 0.0F;
				method17158((byte) 118);
				aFloat10961 = 0.0F;
				aFloat10958 = 0.0F;
				class444 = aClass444Array10962[1705055177 * anInt10960];
				f_20_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10961 < f_20_) {
				aFloat10958 = method17149(f_20_, aFloat10958, Math.min(f, f_19_), -728188178);
				f -= f_19_;
				method17148(aFloat10958, f_20_, (byte) 71);
			}
		}
	}

	public Class437 method13917() {
		return method13909(485603379);
	}

	public void method13913(float f) {
		Class444 class444 = aClass444Array10962[anInt10960 * 1705055177];
		if (aFloatArray10959[anInt10960 * 1705055177] > 0.0F) {
			if (aFloatArray10959[1705055177 * anInt10960] >= f) {
				aFloatArray10959[1705055177 * anInt10960] -= f;
				return;
			}
			f -= aFloatArray10959[1705055177 * anInt10960];
			aFloatArray10959[1705055177 * anInt10960] = 0.0F;
		}
		float f_21_ = 1.0F / (float) Class286.method5150(2055308818);
		while (f > 0.0F) {
			float f_22_ = class444.method7211();
			if (aFloat10961 >= f_22_) {
				if (1 + anInt10960 * 1705055177 == aClass444Array10962.length)
					break;
				if (aFloatArray10959[1705055177 * anInt10960 + 1] >= f) {
					aFloatArray10959[1705055177 * anInt10960 + 1] -= f;
					break;
				}
				anInt10960 += -481855879;
				f -= aFloatArray10959[anInt10960 * 1705055177];
				aFloatArray10959[1705055177 * anInt10960] = 0.0F;
				method17158((byte) -60);
				aFloat10961 = 0.0F;
				aFloat10958 = 0.0F;
				class444 = aClass444Array10962[1705055177 * anInt10960];
				f_22_ = class444.method7211();
			}
			while (f > 0.0F && aFloat10961 < f_22_) {
				aFloat10958 = method17149(f_22_, aFloat10958, Math.min(f, f_21_), -1232950029);
				f -= f_21_;
				method17148(aFloat10958, f_22_, (byte) 53);
			}
		}
	}

	public Class437 method13918() {
		return method13909(687752642);
	}

	public void method13915(Class307 class307, Class435 class435, int i, int i_23_, float f) {
		double[] ds = aClass298_8675.method5344((byte) 32);
		ds[0] -= (double) i;
		ds[2] -= (double) i_23_;
		double[] ds_24_ = method17150(65535);
		ds_24_[0] -= (double) i;
		ds_24_[2] -= (double) i_23_;
		ds[1] *= -1.0;
		ds_24_[1] *= -1.0;
		Class437 class437 = Class437.method6878();
		class437.aFloat4903 = (float) (ds_24_[0] - ds[0]);
		class437.aFloat4904 = (float) (ds_24_[1] - ds[1]);
		class437.aFloat4905 = (float) (ds_24_[2] - ds[2]);
		class437.method6890();
		Class440 class440 = new Class440();
		class440.method7016(class437, f);
		Class437 class437_25_ = Class437.method6879(0.0F, 1.0F, 0.0F);
		Class437 class437_26_ = Class437.method6960(class437, class437_25_);
		class437_25_ = Class437.method6960(class437_26_, class437);
		class437_25_.method6907(class440);
		class435.method6807(ds[0], ds[1], ds[2], ds_24_[0], ds_24_[1], ds_24_[2], class437_25_.aFloat4903, class437_25_.aFloat4904, class437_25_.aFloat4905);
		class437_25_.method6949();
	}

	public void method13916(Class307 class307, Class435 class435, int i, int i_27_, float f) {
		double[] ds = aClass298_8675.method5344((byte) -49);
		ds[0] -= (double) i;
		ds[2] -= (double) i_27_;
		double[] ds_28_ = method17150(65535);
		ds_28_[0] -= (double) i;
		ds_28_[2] -= (double) i_27_;
		ds[1] *= -1.0;
		ds_28_[1] *= -1.0;
		Class437 class437 = Class437.method6878();
		class437.aFloat4903 = (float) (ds_28_[0] - ds[0]);
		class437.aFloat4904 = (float) (ds_28_[1] - ds[1]);
		class437.aFloat4905 = (float) (ds_28_[2] - ds[2]);
		class437.method6890();
		Class440 class440 = new Class440();
		class440.method7016(class437, f);
		Class437 class437_29_ = Class437.method6879(0.0F, 1.0F, 0.0F);
		Class437 class437_30_ = Class437.method6960(class437, class437_29_);
		class437_29_ = Class437.method6960(class437_30_, class437);
		class437_29_.method6907(class440);
		class435.method6807(ds[0], ds[1], ds[2], ds_28_[0], ds_28_[1], ds_28_[2], class437_29_.aFloat4903, class437_29_.aFloat4904, class437_29_.aFloat4905);
		class437_29_.method6949();
	}

	abstract void method17158(byte i);

	public Class437 method13922() {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	public Class437 method13921() {
		return method13909(2141478953);
	}

	public Class437 method13920() {
		return method13909(1164547405);
	}

	public Class437 method13907() {
		return method13909(-322007902);
	}

	public Class437 method13927() {
		return method13909(1762906329);
	}

	abstract void method17159(Class523_Sub34 class523_sub34, int i);

	public void method13926(Class523_Sub34 class523_sub34) {
		aFloat10961 = 0.0F;
		aFloat10958 = 0.0F;
		anInt10960 = 0;
		int i = class523_sub34.readUnsignedByte(164636190);
		aClass444Array10962 = new Class444[i];
		aFloatArray10959 = new float[i];
		for (int i_31_ = 0; i_31_ < i; i_31_++) {
			aClass444Array10962[i_31_] = new Class444(class523_sub34);
			aFloatArray10959[i_31_] = class523_sub34.method16293(-709257736);
		}
		method17151(class523_sub34, i, 1675080658);
	}

	public boolean method13914() {
		return aClass444Array10962 != null;
	}

	abstract void method17160(Class523_Sub34 class523_sub34, int i);

	double[] method17161() {
		return aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
	}

	public Class437 method13919() {
		Class437 class437 = Class437.method6878();
		double[] ds = aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
		class437.aFloat4903 = (float) ds[0];
		class437.aFloat4904 = (float) ds[1];
		class437.aFloat4905 = (float) ds[2];
		return class437;
	}

	public void method17162(Class444 class444, int i, float f) {
		if (null == aClass444Array10962) {
			aClass444Array10962 = new Class444[] { class444 };
			aFloatArray10959 = new float[] { f };
			anIntArray10963 = new int[] { i };
		} else {
			Class444[] class444s = new Class444[1 + aClass444Array10962.length];
			float[] fs = new float[aClass444Array10962.length + 1];
			int[] is = new int[aClass444Array10962.length + 1];
			System.arraycopy(aClass444Array10962, 0, class444s, 0, aClass444Array10962.length);
			System.arraycopy(aFloatArray10959, 0, fs, 0, aClass444Array10962.length);
			System.arraycopy(anIntArray10963, 0, is, 0, aClass444Array10962.length);
			aClass444Array10962 = class444s;
			aFloatArray10959 = fs;
			anIntArray10963 = is;
			aClass444Array10962[aClass444Array10962.length - 1] = class444;
			aFloatArray10959[aFloatArray10959.length - 1] = f;
			anIntArray10963[anIntArray10963.length - 1] = i;
		}
	}

	void method17163(float f, float f_32_) {
		aFloat10961 += f;
		if (aFloat10961 > f_32_)
			aFloat10961 = f_32_;
	}

	abstract float method17164(float f, float f_33_, float f_34_);

	double[] method17165() {
		return aClass444Array10962[anInt10960 * 1705055177].method7212(aFloat10961);
	}

	public Class437 method13905() {
		return method13909(2054919592);
	}
}
