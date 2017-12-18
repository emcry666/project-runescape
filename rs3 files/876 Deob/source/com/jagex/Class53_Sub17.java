/* Class53_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class53_Sub17 extends Class53 {
	public static Class588 aClass588_10976 = new Class588(-1);

	public Class53_Sub17(Class681 class681, Class668 class668, Class472 class472) {
		super(class681, class668, class472, JS5ConfigStruct.aClass656_8502, 64, new Class68(com.jagex.Class588.class));
	}

	static final void method17219(Class669 class669, byte i) {
		Class535.method8919((Class647_Sub1) class669.anInterface61_8572, class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], true, (short) -29521);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[0];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloatArray11297[2];
	}

	public static final int method17220(int i, int i_0_, int i_1_, int i_2_) {
		if (client.aClass505_11019.method8241((byte) -27) == null)
			return 0;
		int i_3_ = i >> 9;
		int i_4_ = i_0_ >> 9;
		if (i_3_ < 0 || i_4_ < 0 || i_3_ > client.aClass505_11019.method8292((byte) 4) - 1 || i_4_ > client.aClass505_11019.method8235(2138707027) - 1)
			return 0;
		int i_5_ = i_1_;
		if (i_5_ < 3 && ((client.aClass505_11019.method8243(-2060225661).aByteArrayArrayArray4962[1][i_3_][i_4_]) & 0x2) != 0)
			i_5_++;
		return client.aClass505_11019.method8241((byte) -124).aClass142Array7509[i_5_].method2326(i, i_0_, 965934758);
	}
}
