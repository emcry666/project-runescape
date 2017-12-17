/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class542 {
	static final int anInt7224 = 16;
	static final int anInt7225 = 12;
	static final int anInt7226 = 2;
	static final int anInt7227 = 4;
	static final int anInt7228 = 2;
	static final int anInt7229 = 8;
	static final int anInt7230 = 8;
	static final int anInt7231 = 14;
	static final int anInt7232 = 128;
	static final int anInt7233 = 8;
	static final int anInt7234 = 4;
	static final int anInt7235 = 4;
	static final int anInt7236 = 4;
	static final int anInt7237 = 16;
	static final int anInt7238 = 3;
	static final int anInt7239 = 3;
	static final int anInt7240 = 6;
	static final int anInt7241 = 4;
	static final int anInt7242 = 8;

	static final int method8991(int i) {
		return i < 7 ? 8 : 11;
	}

	static final int method8992() {
		return 0;
	}

	static final int method8993(int i) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	static final int method8994(int i) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	static final int method8995(int i) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	static final int method8996(int i) {
		return i < 7 ? 7 : 10;
	}

	static final int method8997(int i) {
		i -= 2;
		if (i < 4)
			return i;
		return 3;
	}

	static final int method8998(int i) {
		return i < 7 ? 9 : 11;
	}

	static final boolean method8999(int i) {
		return i < 7;
	}

	Class542() throws Throwable {
		throw new Error();
	}

	public static void method9000(int i, int i_0_) {
		Class250.aClass209_2521.method3772(i, (byte) -40);
		Class250.aClass209_2524.method3772(i, (byte) -44);
		Class250.aClass209_2600.method3772(i, (byte) -31);
		Class250.aClass209_2601.method3772(i, (byte) -83);
	}

	static final void method9001(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.anInt11191 * -66579593;
	}

	static int method9002(int i, int i_1_, int i_2_) {
		int i_3_ = i >> 31 & i_1_ - 1;
		return i_3_ + ((i >>> 31) + i) % i_1_;
	}

	public static int method9003(Class674 class674, Class670 class670, int i, byte i_4_) {
		if (Class674.aClass674_8613 == class674)
			return 443;
		return i + 50000;
	}

	static final void method9004(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.aBool2569 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Class523_Sub14.method15991(class250, (byte) -118);
		if (-1 == class250.anInt2709 * 234012635 && !class242.aBool2456)
			Class271.method5017(class250.anInt2585 * -1363815505, (byte) 28);
	}
}
