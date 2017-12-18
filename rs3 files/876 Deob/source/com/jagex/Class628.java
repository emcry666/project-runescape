/* Class628 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class628 implements Interface74 {
	public void method494(boolean bool) {
		/* empty */
	}

	public void method490(boolean bool, int i) {
		/* empty */
	}

	public void method489(int i, int i_0_, int i_1_) {
		int i_2_ = i >> 16;
		int i_3_ = i & 0xffff;
		synchronized (Class644.aQueue8346) {
			Class644.aQueue8346.add(Class557_Sub1.method16514(i_2_, i_3_, i_0_, i_1_, -292379677));
		}
	}

	public void method491(int i, int i_4_, int i_5_, byte i_6_) {
		int i_7_ = i >> 16;
		int i_8_ = i & 0xffff;
		synchronized (Class644.aQueue8346) {
			Class644.aQueue8346.add(Class557_Sub1.method16514(i_7_, i_8_, i_4_, i_5_, -1919210127));
		}
	}

	public void method493(int i, int i_9_, int i_10_) {
		int i_11_ = i >> 16;
		int i_12_ = i & 0xffff;
		synchronized (Class644.aQueue8346) {
			Class644.aQueue8346.add(Class557_Sub1.method16514(i_11_, i_12_, i_9_, i_10_, 968267058));
		}
	}

	public void method492(int i, int i_13_, int i_14_) {
		int i_15_ = i >> 16;
		int i_16_ = i & 0xffff;
		synchronized (Class644.aQueue8346) {
			Class644.aQueue8346.add(Class557_Sub1.method16514(i_15_, i_16_, i_13_, i_14_, 1940429711));
		}
	}

	static final void method10311(Class669 class669, int i) {
		if (Class710.aBool8840) {
			Class695[] class695s = Class268.method4904((byte) -59);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class695s.length;
		} else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static Class10 method10312(Class472 class472, int i, int i_17_, Interface4 interface4, byte i_18_) {
		byte[] is = class472.method7688(i, i_17_, -48646820);
		if (null == is)
			return null;
		return new Class10(is, interface4);
	}

	public static int method10313(int i, int i_19_) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	static void method10314(boolean bool, byte i) {
		Class95.aString1171 = Class95.aString1171.trim();
		Class95.anInt1166 = 0;
		if (Class95.aString1171.length() == 0)
			Class95.anInt1173 = 0;
		else {
			Class485.method7932(new StringBuilder().append("--> ").append(Class95.aString1171).toString(), (byte) -14);
			Class264.method4746(Class95.aString1171, false, bool, -459504769);
			if (!bool) {
				Class95.anInt1173 = 0;
				Class95.aString1171 = "";
			} else
				Class95.anInt1173 = Class95.aString1171.length() * 331909503;
		}
	}

	public static Class503 method10315(int i) {
		Class503_Sub2 class503_sub2;
		try {
			class503_sub2 = new Class503_Sub2();
		} catch (Throwable throwable) {
			return new Class503_Sub1();
		}
		return class503_sub2;
	}

	static boolean method10316(int i) {
		boolean bool;
		try {
			Class79 class79 = new Class79();
			byte[] is = class79.method1556(Class301.aByteArray3329, 1357652815);
			Class173.method2909(is, (byte) -14);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}
}
