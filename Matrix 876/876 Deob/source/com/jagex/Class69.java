/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class69 implements Interface50 {
	public Object method355(byte[] is, Class10 class10, boolean bool) {
		return Class31.aClass178_303.method3111(class10, Class166.method2661(is), bool);
	}

	public Object method356(byte[] is, Class10 class10, boolean bool) {
		return Class31.aClass178_303.method3111(class10, Class166.method2661(is), bool);
	}

	public Object method357(byte[] is, Class10 class10, boolean bool, int i) {
		return Class31.aClass178_303.method3111(class10, Class166.method2661(is), bool);
	}

	public static Class699 method1463(byte i) {
		if (Class194_Sub4.aClass699_9895 == null)
			return Class699.aClass699_8769;
		return Class194_Sub4.aClass699_9895;
	}

	public static boolean method1464(int i, int[] is, int i_0_) {
		if (Class391.aBoolArray4024[i])
			return true;
		Class31.aClass242Array302[i] = Class221.method4132(i, is, Class31.aClass242Array302[i], false, (byte) 7);
		if (Class31.aClass242Array302[i] == null)
			return false;
		Class391.aBoolArray4024[i] = true;
		return true;
	}

	static void method1465(int[] is, double d) {
		if (Class174.aDouble1854 != d) {
			for (int i = 0; i < 256; i++) {
				int i_1_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
				Class174.anIntArray1853[i] = i_1_ > 255 ? 255 : i_1_;
			}
			Class174.aDouble1854 = d;
		}
		for (int i = 0; i < is.length; i++) {
			int i_2_ = Class174.anIntArray1853[is[i] >> 16 & 0xff];
			int i_3_ = Class174.anIntArray1853[is[i] >> 8 & 0xff];
			int i_4_ = Class174.anIntArray1853[is[i] >> 0 & 0xff];
			is[i] = is[i] & ~0xffffff | i_2_ << 16 | i_3_ << 8 | i_4_;
		}
	}

	static final void method1466(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class10 class10 = Class491.aClass423_5536.method6688(client.anInterface50_11044, i_5_, (byte) -7);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class10.method626(string, Class62.aClass148Array772, -1942791872);
	}
}
