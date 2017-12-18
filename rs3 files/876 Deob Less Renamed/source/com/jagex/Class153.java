/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class153 {
	static float[] aFloatArray1730;
	static float[] aFloatArray1731 = new float[16384];

	Class153() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray1730 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray1731[i] = (float) Math.sin((double) i * d);
			aFloatArray1730[i] = (float) Math.cos((double) i * d);
		}
	}
}
