/* Class194_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class194_Sub13 extends Class194 {
	public static int anInt9919;

	Class194_Sub13(Class523_Sub34 class523_sub34) {
		super(class523_sub34);
	}

	public void method3648(int i) {
		Class61.method1414(true, 1094129608);
	}

	public void method3651() {
		Class61.method1414(true, 673569079);
	}

	public void method3656() {
		Class61.method1414(true, 1008118401);
	}

	public void method3657() {
		Class61.method1414(true, 889175084);
	}

	public static final void method15511(String string, byte i) {
		if (Class99.aClass115Array1232 != null) {
			Class116 class116 = Class537.method8941(-1407281984);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4301, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) -80), -1635355515);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -43);
			class116.method1974(class523_sub22, (byte) 99);
		}
	}

	public static String[] method15512(String string, char c, byte i) {
		int i_0_ = Class212.method3832(string, c, 858613350);
		String[] strings = new String[i_0_ + 1];
		int i_1_ = 0;
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_;
			for (i_4_ = i_2_; string.charAt(i_4_) != c; i_4_++) {
				/* empty */
			}
			strings[i_1_++] = string.substring(i_2_, i_4_);
			i_2_ = i_4_ + 1;
		}
		strings[i_0_] = string.substring(i_2_);
		return strings;
	}
}
