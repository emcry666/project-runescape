/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class434 {
	static float[] aFloatArray4882 = new float[16384];
	static float[] aFloatArray4883 = new float[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray4882[i] = (float) Math.sin((double) i * d);
			aFloatArray4883[i] = (float) Math.cos((double) i * d);
		}
	}

	Class434() throws Throwable {
		throw new Error();
	}
}
