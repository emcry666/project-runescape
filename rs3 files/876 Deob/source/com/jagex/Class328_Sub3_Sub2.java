/* Class328_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class328_Sub3_Sub2 extends Class328_Sub3 {
	float[] aFloatArray11574;
	int anInt11575 = 0;
	float[] aFloatArray11576;
	float[] aFloatArray11577;

	void method15687() {
		anInt11575 += 1172063385;
	}

	void method15682(int i) {
		anInt11575 += 1172063385;
	}

	float method15680(float f, float f_0_, float f_1_, short i) {
		float f_2_ = aFloat10145 / f;
		if (f_2_ < 0.0F)
			f_2_ = 0.0F;
		if (f_2_ > 1.0F)
			f_2_ = 1.0F;
		return (f / aFloatArray11576[anInt11575 * -612905047] * (f_2_ * (aFloatArray11574[-612905047 * anInt11575] - aFloatArray11577[-612905047 * anInt11575]) + aFloatArray11577[-612905047 * anInt11575]));
	}

	void method15686(RSBuffer class523_sub34, int i, int i_3_) {
		aFloatArray11577 = new float[i];
		aFloatArray11574 = new float[i];
		aFloatArray11576 = new float[i];
		anInt11575 = 0;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			aFloatArray11577[i_4_] = class523_sub34.method16293(-1098585333);
			aFloatArray11574[i_4_] = class523_sub34.method16293(-782945935);
			aFloatArray11576[i_4_] = class523_sub34.method16293(-621366825);
		}
	}

	void method15689(RSBuffer class523_sub34, int i) {
		aFloatArray11577 = new float[i];
		aFloatArray11574 = new float[i];
		aFloatArray11576 = new float[i];
		anInt11575 = 0;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			aFloatArray11577[i_5_] = class523_sub34.method16293(-2011384739);
			aFloatArray11574[i_5_] = class523_sub34.method16293(-1631523992);
			aFloatArray11576[i_5_] = class523_sub34.method16293(-719316585);
		}
	}

	void method15683(RSBuffer class523_sub34, int i) {
		aFloatArray11577 = new float[i];
		aFloatArray11574 = new float[i];
		aFloatArray11576 = new float[i];
		anInt11575 = 0;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			aFloatArray11577[i_6_] = class523_sub34.method16293(-1991097367);
			aFloatArray11574[i_6_] = class523_sub34.method16293(-1544162824);
			aFloatArray11576[i_6_] = class523_sub34.method16293(-1887351155);
		}
	}

	float method15688(float f, float f_7_, float f_8_) {
		float f_9_ = aFloat10145 / f;
		if (f_9_ < 0.0F)
			f_9_ = 0.0F;
		if (f_9_ > 1.0F)
			f_9_ = 1.0F;
		return (f / aFloatArray11576[anInt11575 * -612905047] * (f_9_ * (aFloatArray11574[-612905047 * anInt11575] - aFloatArray11577[-612905047 * anInt11575]) + aFloatArray11577[-612905047 * anInt11575]));
	}

	public Class328_Sub3_Sub2(Class298 class298) {
		super(class298);
	}
}
