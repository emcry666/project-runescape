/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class402 {
	public static Class402 aClass402_4156;
	public static Class402 aClass402_4157 = new Class402(2);
	public static Class402 aClass402_4158 = new Class402(3);
	public static Class402 aClass402_4159;
	public static Class402 aClass402_4160;
	public static Class402 aClass402_4161;
	public static Class402 aClass402_4162;
	public static Class402 aClass402_4163;
	public static Class402 aClass402_4164;
	public static Class402 aClass402_4165;
	public static Class402 aClass402_4166;
	static Class402 aClass402_4167;
	static Class402 aClass402_4168;
	int anInt4169;

	public void method6573(byte i) {
		try {
			method6577((byte) 26);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public String method6574(int i) {
		return new StringBuilder().append("_").append(anInt4169 * 1808699269).toString();
	}

	public String method6575() {
		return new StringBuilder().append("_").append(anInt4169 * 1808699269).toString();
	}

	public Object method6576(Object[] objects, int i) throws Throwable {
		return Class35.method954(Class305.anApplet3346, method6574(1621057790), objects, -1051699471);
	}

	public Object method6577(byte i) throws Throwable {
		return Class35.method952(Class305.anApplet3346, method6574(1621057790), (byte) -70);
	}

	Class402(int i) {
		anInt4169 = -1070919347 * i;
	}

	static {
		aClass402_4156 = new Class402(4);
		aClass402_4159 = new Class402(6);
		aClass402_4160 = new Class402(10);
		aClass402_4161 = new Class402(1);
		aClass402_4163 = new Class402(11);
		aClass402_4164 = new Class402(13);
		aClass402_4162 = new Class402(12);
		aClass402_4165 = new Class402(7);
		aClass402_4166 = new Class402(5);
		aClass402_4167 = new Class402(9);
		aClass402_4168 = new Class402(8);
	}

	public String method6578() {
		return new StringBuilder().append("_").append(anInt4169 * 1808699269).toString();
	}

	public String method6579() {
		return new StringBuilder().append("_").append(anInt4169 * 1808699269).toString();
	}

	public String method6580() {
		return new StringBuilder().append("_").append(anInt4169 * 1808699269).toString();
	}

	public void method6581(Object[] objects, int i) {
		try {
			method6576(objects, 16711680);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public Object method6582(Object[] objects) throws Throwable {
		return Class35.method954(Class305.anApplet3346, method6574(1621057790), objects, -1475386932);
	}

	public Object method6583(Object[] objects) throws Throwable {
		return Class35.method954(Class305.anApplet3346, method6574(1621057790), objects, -1299768612);
	}

	public Object method6584() throws Throwable {
		return Class35.method952(Class305.anApplet3346, method6574(1621057790), (byte) -93);
	}

	public void method6585(Object[] objects) {
		try {
			method6576(objects, 16711680);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public void method6586() {
		try {
			method6577((byte) -30);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public void method6587() {
		try {
			method6577((byte) -11);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	static void method6588(int[] is, float[] fs, float[] fs_0_, int i, int i_1_, int i_2_) {
		if (i < i_1_) {
			int i_3_ = (i_1_ + i) / 2;
			int i_4_ = i;
			int i_5_ = is[i_3_];
			is[i_3_] = is[i_1_];
			is[i_1_] = i_5_;
			float f = fs[i_3_];
			fs[i_3_] = fs[i_1_];
			fs[i_1_] = f;
			float f_6_ = fs_0_[i_3_];
			fs_0_[i_3_] = fs_0_[i_1_];
			fs_0_[i_1_] = f_6_;
			int i_7_ = (long) i_5_ == 9223372036854775807L ? 0 : 1;
			for (int i_8_ = i; i_8_ < i_1_; i_8_++) {
				if (is[i_8_] < (i_8_ & i_7_) + i_5_) {
					int i_9_ = is[i_8_];
					is[i_8_] = is[i_4_];
					is[i_4_] = i_9_;
					float f_10_ = fs[i_8_];
					fs[i_8_] = fs[i_4_];
					fs[i_4_] = f_10_;
					float f_11_ = fs_0_[i_8_];
					fs_0_[i_8_] = fs_0_[i_4_];
					fs_0_[i_4_] = f_11_;
					i_4_++;
				}
			}
			is[i_1_] = is[i_4_];
			is[i_4_] = i_5_;
			fs[i_1_] = fs[i_4_];
			fs[i_4_] = f;
			fs_0_[i_1_] = fs_0_[i_4_];
			fs_0_[i_4_] = f_6_;
			method6588(is, fs, fs_0_, i, i_4_ - 1, -1785046776);
			method6588(is, fs, fs_0_, 1 + i_4_, i_1_, 500601990);
		}
	}
}
