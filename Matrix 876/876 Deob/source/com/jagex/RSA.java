/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class RSA {
	public static BigInteger RSA_UPDATE_MODULUS;
	static BigInteger aBigInteger305 = RS3Applet.getLoginExponent();
	public static BigInteger RSA_UPDATE_EXPONENT;
	static BigInteger aBigInteger307 = RS3Applet.getLoginModulus();

	static {
		RSA_UPDATE_EXPONENT = RS3Applet.getUpdateExponent();
		RSA_UPDATE_MODULUS = RS3Applet.getUpdateModulus();
		new BigInteger("10001", 16);
		new BigInteger("9e9516d7340d9343f6ec83c91874488906e42bc63f03971c01852e2974fc774e22475378c45eb03a2a0a8581e82b63507834168fb64ad0c0354c3edad2258b0d", 16);
	}

	RSA() throws Throwable {
		throw new Error();
	}

	static void method910(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class553.method9161(653165660);
	}

	static final void method911(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub39_10606.method17062((byte) -21);
	}

	static final int method912(int i, byte i_0_) {
		return i < 7 ? 9 : 11;
	}
}
