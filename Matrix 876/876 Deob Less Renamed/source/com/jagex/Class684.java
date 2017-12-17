/* Class684 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class684 {
	static int[] anIntArray8660;
	static char[] aCharArray8661;
	static char[] aCharArray8662;
	static char[] aCharArray8663 = new char[64];
	static int anInt8664;

	static {
		for (int i = 0; i < 26; i++)
			aCharArray8663[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray8663[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8663[i] = (char) (i + 48 - 52);
		aCharArray8663[62] = '+';
		aCharArray8663[63] = '/';
		aCharArray8661 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray8661[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray8661[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8661[i] = (char) (48 + i - 52);
		aCharArray8661[62] = '*';
		aCharArray8661[63] = '-';
		aCharArray8662 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray8662[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray8662[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8662[i] = (char) (48 + i - 52);
		aCharArray8662[62] = '-';
		aCharArray8662[63] = '_';
		anIntArray8660 = new int[128];
		for (int i = 0; i < anIntArray8660.length; i++)
			anIntArray8660[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray8660[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray8660[i] = 26 + (i - 97);
		for (int i = 48; i <= 57; i++)
			anIntArray8660[i] = 52 + (i - 48);
		int[] is = anIntArray8660;
		anIntArray8660[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray8660;
		anIntArray8660[47] = 63;
		is_0_[45] = 63;
	}

	Class684() throws Throwable {
		throw new Error();
	}

	public static String method13867(byte[] is) {
		return Class599.method9859(is, 0, is.length, (short) 10456);
	}

	public static String method13868(byte[] is) {
		return Class599.method9859(is, 0, is.length, (short) -10061);
	}
}
