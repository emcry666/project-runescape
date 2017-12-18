/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class246 {
	public static int anInt2479;
	static NetworkStream aClass557_2480;

	Class246() throws Throwable {
		throw new Error();
	}

	static void method4384(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class193.method3646(Class31.aClass178_303, 336297659);
	}

	static final void method4385(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2673 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	public static short[] method4386(short[] is, int i) {
		if (is == null)
			return null;
		short[] is_0_ = new short[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	static final void method4387(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class423.method6716(class250, class242, class669, -1486193456);
	}

	static void method4388(int i) {
		if (Class95.anInt1166 * -1422624261 > 0) {
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < Class95.aStringArray1165.length; i_2_++) {
				if (Class95.aStringArray1165[i_2_].indexOf("--> ") != -1 && ++i_1_ == -1422624261 * Class95.anInt1166) {
					Class95.aString1171 = (Class95.aStringArray1165[i_2_].substring(Class95.aStringArray1165[i_2_].indexOf('>') + 2));
					break;
				}
			}
		} else
			Class95.aString1171 = "";
	}
}
