/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class433 {
	public static final int anInt4864 = 14336;
	public static final int anInt4865 = 16383;
	public static final int anInt4866 = 16384;
	public static final int anInt4867 = 14;
	public static final int anInt4868 = 16384;
	public static final int anInt4869 = 16383;
	public static final double aDouble4870 = 2607.5945876176133;
	public static final int anInt4871 = 1024;
	public static final int anInt4872 = 14;
	public static final int anInt4873 = 4096;
	public static final int anInt4874 = 6144;
	public static final int anInt4875 = 8192;
	public static final int anInt4876 = 10240;
	public static final int anInt4877 = 12288;
	public static final int anInt4878 = 2048;
	public static final int anInt4879 = 16384;
	public static int[] anIntArray4880 = new int[16384];
	public static int[] anIntArray4881 = new int[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray4880[i] = (int) (16384.0 * Math.sin((double) i * d));
			anIntArray4881[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
	}

	Class433() throws Throwable {
		throw new Error();
	}

	public static float method6799(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method6800(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}

	public static float method6801(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}
}
