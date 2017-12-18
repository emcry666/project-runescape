/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class442 {
	public float[] aFloatArray4918 = new float[9];

	public Class442() {
		method7200();
	}

	public Class440 method7197() {
		Class440 class440 = new Class440();
		double d = (double) (1.0F + aFloatArray4918[0] + aFloatArray4918[4] + aFloatArray4918[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[7] - aFloatArray4918[5]) / f;
			class440.aFloat4913 = (aFloatArray4918[2] - aFloatArray4918[6]) / f;
			class440.aFloat4912 = (aFloatArray4918[3] - aFloatArray4918[1]) / f;
			class440.aFloat4915 = 0.25F * f;
		} else if (aFloatArray4918[0] > aFloatArray4918[4] && aFloatArray4918[0] > aFloatArray4918[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[0] - aFloatArray4918[4] - aFloatArray4918[8])) * 2.0);
			class440.aFloat4909 = 0.25F * f;
			class440.aFloat4913 = (aFloatArray4918[3] + aFloatArray4918[1]) / f;
			class440.aFloat4912 = (aFloatArray4918[2] + aFloatArray4918[6]) / f;
			class440.aFloat4915 = (aFloatArray4918[7] - aFloatArray4918[5]) / f;
		} else if (aFloatArray4918[4] > aFloatArray4918[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[4] - aFloatArray4918[0] - aFloatArray4918[8])) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[3] + aFloatArray4918[1]) / f;
			class440.aFloat4913 = 0.25F * f;
			class440.aFloat4912 = (aFloatArray4918[7] + aFloatArray4918[5]) / f;
			class440.aFloat4915 = (aFloatArray4918[2] - aFloatArray4918[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[8] - aFloatArray4918[0] - aFloatArray4918[4])) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[2] + aFloatArray4918[6]) / f;
			class440.aFloat4913 = (aFloatArray4918[7] + aFloatArray4918[5]) / f;
			class440.aFloat4912 = 0.25F * f;
			class440.aFloat4915 = (aFloatArray4918[3] - aFloatArray4918[1]) / f;
		}
		return class440;
	}

	void method7198() {
		aFloatArray4918[0] = 1.0F;
		aFloatArray4918[1] = 0.0F;
		aFloatArray4918[2] = 0.0F;
		aFloatArray4918[3] = 0.0F;
		aFloatArray4918[4] = 1.0F;
		aFloatArray4918[5] = 0.0F;
		aFloatArray4918[6] = 0.0F;
		aFloatArray4918[7] = 0.0F;
		aFloatArray4918[8] = 1.0F;
	}

	public Class440 method7199() {
		Class440 class440 = new Class440();
		double d = (double) (1.0F + aFloatArray4918[0] + aFloatArray4918[4] + aFloatArray4918[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[7] - aFloatArray4918[5]) / f;
			class440.aFloat4913 = (aFloatArray4918[2] - aFloatArray4918[6]) / f;
			class440.aFloat4912 = (aFloatArray4918[3] - aFloatArray4918[1]) / f;
			class440.aFloat4915 = 0.25F * f;
		} else if (aFloatArray4918[0] > aFloatArray4918[4] && aFloatArray4918[0] > aFloatArray4918[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[0] - aFloatArray4918[4] - aFloatArray4918[8])) * 2.0);
			class440.aFloat4909 = 0.25F * f;
			class440.aFloat4913 = (aFloatArray4918[3] + aFloatArray4918[1]) / f;
			class440.aFloat4912 = (aFloatArray4918[2] + aFloatArray4918[6]) / f;
			class440.aFloat4915 = (aFloatArray4918[7] - aFloatArray4918[5]) / f;
		} else if (aFloatArray4918[4] > aFloatArray4918[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[4] - aFloatArray4918[0] - aFloatArray4918[8])) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[3] + aFloatArray4918[1]) / f;
			class440.aFloat4913 = 0.25F * f;
			class440.aFloat4912 = (aFloatArray4918[7] + aFloatArray4918[5]) / f;
			class440.aFloat4915 = (aFloatArray4918[2] - aFloatArray4918[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[8] - aFloatArray4918[0] - aFloatArray4918[4])) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[2] + aFloatArray4918[6]) / f;
			class440.aFloat4913 = (aFloatArray4918[7] + aFloatArray4918[5]) / f;
			class440.aFloat4912 = 0.25F * f;
			class440.aFloat4915 = (aFloatArray4918[3] - aFloatArray4918[1]) / f;
		}
		return class440;
	}

	void method7200() {
		aFloatArray4918[0] = 1.0F;
		aFloatArray4918[1] = 0.0F;
		aFloatArray4918[2] = 0.0F;
		aFloatArray4918[3] = 0.0F;
		aFloatArray4918[4] = 1.0F;
		aFloatArray4918[5] = 0.0F;
		aFloatArray4918[6] = 0.0F;
		aFloatArray4918[7] = 0.0F;
		aFloatArray4918[8] = 1.0F;
	}

	void method7201() {
		aFloatArray4918[0] = 1.0F;
		aFloatArray4918[1] = 0.0F;
		aFloatArray4918[2] = 0.0F;
		aFloatArray4918[3] = 0.0F;
		aFloatArray4918[4] = 1.0F;
		aFloatArray4918[5] = 0.0F;
		aFloatArray4918[6] = 0.0F;
		aFloatArray4918[7] = 0.0F;
		aFloatArray4918[8] = 1.0F;
	}

	void method7202() {
		aFloatArray4918[0] = 1.0F;
		aFloatArray4918[1] = 0.0F;
		aFloatArray4918[2] = 0.0F;
		aFloatArray4918[3] = 0.0F;
		aFloatArray4918[4] = 1.0F;
		aFloatArray4918[5] = 0.0F;
		aFloatArray4918[6] = 0.0F;
		aFloatArray4918[7] = 0.0F;
		aFloatArray4918[8] = 1.0F;
	}

	public Class440 method7203() {
		Class440 class440 = new Class440();
		double d = (double) (1.0F + aFloatArray4918[0] + aFloatArray4918[4] + aFloatArray4918[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[7] - aFloatArray4918[5]) / f;
			class440.aFloat4913 = (aFloatArray4918[2] - aFloatArray4918[6]) / f;
			class440.aFloat4912 = (aFloatArray4918[3] - aFloatArray4918[1]) / f;
			class440.aFloat4915 = 0.25F * f;
		} else if (aFloatArray4918[0] > aFloatArray4918[4] && aFloatArray4918[0] > aFloatArray4918[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[0] - aFloatArray4918[4] - aFloatArray4918[8])) * 2.0);
			class440.aFloat4909 = 0.25F * f;
			class440.aFloat4913 = (aFloatArray4918[3] + aFloatArray4918[1]) / f;
			class440.aFloat4912 = (aFloatArray4918[2] + aFloatArray4918[6]) / f;
			class440.aFloat4915 = (aFloatArray4918[7] - aFloatArray4918[5]) / f;
		} else if (aFloatArray4918[4] > aFloatArray4918[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[4] - aFloatArray4918[0] - aFloatArray4918[8])) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[3] + aFloatArray4918[1]) / f;
			class440.aFloat4913 = 0.25F * f;
			class440.aFloat4912 = (aFloatArray4918[7] + aFloatArray4918[5]) / f;
			class440.aFloat4915 = (aFloatArray4918[2] - aFloatArray4918[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4918[8] - aFloatArray4918[0] - aFloatArray4918[4])) * 2.0);
			class440.aFloat4909 = (aFloatArray4918[2] + aFloatArray4918[6]) / f;
			class440.aFloat4913 = (aFloatArray4918[7] + aFloatArray4918[5]) / f;
			class440.aFloat4912 = 0.25F * f;
			class440.aFloat4915 = (aFloatArray4918[3] - aFloatArray4918[1]) / f;
		}
		return class440;
	}
}
