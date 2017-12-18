/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class51 {
	public boolean aBool711;
	public String aString712;
	public String aString713;
	public String aString714;

	Class51() {
		/* empty */
	}

	static final void method1283(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		if (!Class88.method1626(string.charAt(0), -773336210))
			throw new RuntimeException();
		if (string.isEmpty() || string.length() > 10)
			throw new RuntimeException();
		if (!Class665.aClass282_8527.method5123(string, i_0_, i_1_, -1153251085))
			throw new RuntimeException();
	}

	static int[] method1284(Class523_Sub22 class523_sub22, int i) {
		RSBuffer class523_sub34 = new RSBuffer(518);
		int[] is = new int[4];
		for (int i_2_ = 0; i_2_ < 4; i_2_++)
			is[i_2_] = (int) (Math.random() * 9.9999999E7);
		class523_sub34.writeByte(10, 143958442);
		class523_sub34.writeInt(is[0], -1217745995);
		class523_sub34.writeInt(is[1], -1952039569);
		class523_sub34.writeInt(is[2], -1044526229);
		class523_sub34.writeInt(is[3], -845831788);
		for (int i_3_ = 0; i_3_ < 10; i_3_++)
			class523_sub34.writeInt((int) (Math.random() * 9.9999999E7), -874853406);
		class523_sub34.writeShort((int) (Math.random() * 9.9999999E7), (byte) -73);
		class523_sub34.encryptRSA(RSA.aBigInteger305, RSA.aBigInteger307, 737146878);
		class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.buffer, 0, class523_sub34.offset * 2349011, (short) -3122);
		return is;
	}

	static final void method1285(Class669 class669, int i) {
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) != Class291.aClass291_3148)
			throw new RuntimeException();
		Class328_Sub2 class328_sub2 = (Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1252765250);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) ((double) class328_sub2.method15608(-472857580) * 2607.5945876176133) & 0x3fff;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) ((double) class328_sub2.method15603(-1130766133) * 2607.5945876176133) & 0x3fff;
	}
}
