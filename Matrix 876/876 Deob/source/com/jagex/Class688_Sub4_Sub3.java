/* Class688_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class688_Sub4_Sub3 extends Class688_Sub4 {
	float[] aFloatArray11872;
	float[] aFloatArray11873;
	int anInt11874 = 0;
	float[] aFloatArray11875;

	void method17160(RSBuffer class523_sub34, int i) {
		aFloatArray11875 = new float[i];
		aFloatArray11872 = new float[i];
		aFloatArray11873 = new float[i];
		anInt11874 = 0;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			aFloatArray11875[i_0_] = class523_sub34.method16293(-1789402492);
			aFloatArray11872[i_0_] = class523_sub34.method16293(-1737569427);
			aFloatArray11873[i_0_] = class523_sub34.method16293(-634643467);
		}
	}

	void method17158(byte i) {
		anInt11874 += -531378137;
	}

	float method17149(float f, float f_1_, float f_2_, int i) {
		float f_3_ = aFloat10961 / f;
		if (f_3_ < 0.0F)
			f_3_ = 0.0F;
		if (f_3_ > 1.0F)
			f_3_ = 1.0F;
		return ((f_3_ * (aFloatArray11872[anInt11874 * 1115201431] - aFloatArray11875[anInt11874 * 1115201431]) + aFloatArray11875[1115201431 * anInt11874]) * (f / aFloatArray11873[1115201431 * anInt11874]));
	}

	float method17164(float f, float f_4_, float f_5_) {
		float f_6_ = aFloat10961 / f;
		if (f_6_ < 0.0F)
			f_6_ = 0.0F;
		if (f_6_ > 1.0F)
			f_6_ = 1.0F;
		return ((f_6_ * (aFloatArray11872[anInt11874 * 1115201431] - aFloatArray11875[anInt11874 * 1115201431]) + aFloatArray11875[1115201431 * anInt11874]) * (f / aFloatArray11873[1115201431 * anInt11874]));
	}

	void method17157() {
		anInt11874 += -531378137;
	}

	void method17154() {
		anInt11874 += -531378137;
	}

	void method17153() {
		anInt11874 += -531378137;
	}

	void method17151(RSBuffer class523_sub34, int i, int i_7_) {
		aFloatArray11875 = new float[i];
		aFloatArray11872 = new float[i];
		aFloatArray11873 = new float[i];
		anInt11874 = 0;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			aFloatArray11875[i_8_] = class523_sub34.method16293(-1173396878);
			aFloatArray11872[i_8_] = class523_sub34.method16293(-1948461674);
			aFloatArray11873[i_8_] = class523_sub34.method16293(-1506876857);
		}
	}

	void method17156() {
		anInt11874 += -531378137;
	}

	public Class688_Sub4_Sub3(Class298 class298) {
		super(class298);
	}

	float method17152(float f, float f_9_, float f_10_) {
		float f_11_ = aFloat10961 / f;
		if (f_11_ < 0.0F)
			f_11_ = 0.0F;
		if (f_11_ > 1.0F)
			f_11_ = 1.0F;
		return ((f_11_ * (aFloatArray11872[anInt11874 * 1115201431] - aFloatArray11875[anInt11874 * 1115201431]) + aFloatArray11875[1115201431 * anInt11874]) * (f / aFloatArray11873[1115201431 * anInt11874]));
	}

	void method17159(RSBuffer class523_sub34, int i) {
		aFloatArray11875 = new float[i];
		aFloatArray11872 = new float[i];
		aFloatArray11873 = new float[i];
		anInt11874 = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			aFloatArray11875[i_12_] = class523_sub34.method16293(-929896384);
			aFloatArray11872[i_12_] = class523_sub34.method16293(-1237072358);
			aFloatArray11873[i_12_] = class523_sub34.method16293(-711332243);
		}
	}
}
