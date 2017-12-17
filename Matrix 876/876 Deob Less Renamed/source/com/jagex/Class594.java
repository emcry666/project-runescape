/* Class594 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class594 implements Interface75 {
	int anInt7815;
	static Class594 aClass594_7816 = new Class594(0);
	public static Class594 aClass594_7817;
	static Class594 aClass594_7818 = new Class594(1);

	static Class594[] method9804() {
		return (new Class594[] { aClass594_7816, aClass594_7817, aClass594_7818 });
	}

	public int method82() {
		return anInt7815 * -825825283;
	}

	static {
		aClass594_7817 = new Class594(2);
	}

	public int method6() {
		return anInt7815 * -825825283;
	}

	public int method101() {
		return anInt7815 * -825825283;
	}

	Class594(int i) {
		anInt7815 = i * -2086949547;
	}

	static Class594[] method9805() {
		return (new Class594[] { aClass594_7816, aClass594_7817, aClass594_7818 });
	}

	static boolean method9806(int i) {
		Class43.anInt567 = 1953306581;
		Class43.aClass116_568 = client.aClass116_11058;
		return Class159.method2570((-529544860571826659L * Class43.aLong573 == -1L), true, "", "", -529544860571826659L * Class43.aLong573);
	}

	static final int[] method9807(String string, Class669 class669, byte i) {
		int[] is = null;
		if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
			int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
			if (i_0_ > 0) {
				is = new int[i_0_];
				while (i_0_-- > 0)
					is[i_0_] = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
			}
		}
		return is;
	}
}
