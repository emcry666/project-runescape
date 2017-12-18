/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class425 implements Interface7 {
	boolean aBool4818;
	String aString4819;
	static Interface45 anInterface45_4820;

	public Class52 method53(int i) {
		return Class52.aClass52_715;
	}

	public int method56(short i) {
		if (aBool4818)
			return 100;
		int i_0_;
		try {
			i_0_ = Class194_Sub19.aClass532_9953.method8782(aString4819, -869863514);
		} catch (Exception_Sub5 exception_sub5) {
			Class268.method4905(Class29.aClass29_264, exception_sub5.aString11360, -1715672439 * exception_sub5.anInt11361, exception_sub5.getCause(), -1083237873);
			aBool4818 = true;
			return 100;
		}
		return i_0_;
	}

	boolean method6734(int i) {
		return aBool4818;
	}

	Class425(String string) {
		aString4819 = string;
	}

	boolean method6735() {
		return aBool4818;
	}

	public int method55() {
		if (aBool4818)
			return 100;
		int i;
		try {
			i = Class194_Sub19.aClass532_9953.method8782(aString4819, -794737024);
		} catch (Exception_Sub5 exception_sub5) {
			Class268.method4905(Class29.aClass29_264, exception_sub5.aString11360, -1715672439 * exception_sub5.anInt11361, exception_sub5.getCause(), -1502754561);
			aBool4818 = true;
			return 100;
		}
		return i;
	}

	public int method38() {
		if (aBool4818)
			return 100;
		int i;
		try {
			i = Class194_Sub19.aClass532_9953.method8782(aString4819, -1178853542);
		} catch (Exception_Sub5 exception_sub5) {
			Class268.method4905(Class29.aClass29_264, exception_sub5.aString11360, -1715672439 * exception_sub5.anInt11361, exception_sub5.getCause(), 232831822);
			aBool4818 = true;
			return 100;
		}
		return i;
	}

	void method6736() {
		aBool4818 = true;
	}

	void method6737(byte i) {
		aBool4818 = true;
	}

	boolean method6738() {
		return aBool4818;
	}

	boolean method6739() {
		return aBool4818;
	}

	public Class52 method54() {
		return Class52.aClass52_715;
	}

	void method6740() {
		aBool4818 = true;
	}

	static final void method6741(Class669 class669, byte i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class406.method6614((char) i_1_, (byte) 127) ? 1 : 0;
	}

	static final void method6742(Class669 class669, int i) {
		Class333_Sub2.method15546(1374241817);
	}

	static final String method6743(String string, String string_2_, String string_3_, byte i) {
		for (int i_4_ = string.indexOf(string_2_); i_4_ != -1; i_4_ = string.indexOf(string_2_, i_4_ + string_3_.length()))
			string = new StringBuilder().append(string.substring(0, i_4_)).append(string_3_).append(string.substring(i_4_ + string_2_.length())).toString();
		return string;
	}
}
