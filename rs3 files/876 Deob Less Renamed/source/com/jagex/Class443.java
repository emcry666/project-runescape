/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class443 {
	public static final int anInt4919 = 4;
	public static final int anInt4920 = 3;
	public static final int anInt4921 = 2;
	public static final int anInt4922 = 6;
	public static final int anInt4923 = 5;
	public static final int anInt4924 = 1;

	Class443() throws Throwable {
		throw new Error();
	}

	static String method7204(int i, int i_0_, byte i_1_) {
		int i_2_ = i_0_ - i;
		if (i_2_ < -9)
			return Class495.method8101(16711680, 197169190);
		if (i_2_ < -6)
			return Class495.method8101(16723968, 644386280);
		if (i_2_ < -3)
			return Class495.method8101(16740352, 1665309449);
		if (i_2_ < 0)
			return Class495.method8101(16756736, -859620725);
		if (i_2_ > 9)
			return Class495.method8101(65280, -2053110833);
		if (i_2_ > 6)
			return Class495.method8101(4259584, 52536587);
		if (i_2_ > 3)
			return Class495.method8101(8453888, -1714463429);
		if (i_2_ > 0)
			return Class495.method8101(12648192, -252206272);
		return Class495.method8101(16776960, 137607355);
	}

	static void method7205(Class669 class669, byte i) {
		class669.anIntArray8557[1357652815 * class669.anInt8558 - 1] = (((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[((1357652815 * class669.anInt8558) - 1)]), (byte) 33)).anInt3062 * 1555822477);
	}

	static final void method7206(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_3_, -834167297);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class634.method10406(class250, class242, class669, 827202301);
	}

	static final void method7207(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class554.method9171(class250, class242, class669, (byte) 1);
	}

	static final void method7208(Class250 class250, int i, int i_4_, int i_5_, Class669 class669, int i_6_) {
		if (class250.anIntArray2537 == null)
			throw new RuntimeException();
		class250.anIntArray2537[i] = i_4_;
		class250.anIntArray2619[i] = i_5_;
	}
}
