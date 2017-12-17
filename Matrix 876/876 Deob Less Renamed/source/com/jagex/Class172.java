/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class172 {
	int anInt1837;
	Class177[] aClass177Array1838;

	public Class177 method2895(int i, int i_0_) {
		return aClass177Array1838[i];
	}

	public Class172(Class472 class472) {
		anInt1837 = class472.method7702(0, (byte) -65) * 1038781133;
		aClass177Array1838 = new Class177[856453637 * anInt1837];
		for (int i = 0; i < anInt1837 * 856453637; i++) {
			Class523_Sub34 class523_sub34 = new Class523_Sub34(class472.method7688(0, i, -513608107));
			if (null == class523_sub34.aByteArray10658)
				aClass177Array1838[i] = null;
			else {
				try {
					Class177 class177 = new Class177();
					class177.method3011(i, class523_sub34, 1588838047);
					aClass177Array1838[i] = class177;
				} catch (Exception exception) {
					aClass177Array1838[i] = null;
				}
			}
		}
	}

	public Class177 method2896(int i) {
		return aClass177Array1838[i];
	}

	static void method2897(String string, String string_1_, String string_2_, boolean bool, boolean bool_3_, byte i) {
		Class116 class116 = Class537.method8941(-1555514761);
		if (class116.method1979(782493095) != null) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4309, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort((Class6.method555(string, (byte) 43) + Class6.method555(string_1_, (byte) -92) + Class6.method555(string_2_, (byte) 37) + 1), (byte) -10);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 55);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_1_, (byte) -49);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_2_, (byte) -47);
			int i_4_ = 0;
			if (bool)
				i_4_ |= 0x1;
			if (bool_3_)
				i_4_ |= 0x2;
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(i_4_, 484031529);
			class116.method1974(class523_sub22, (byte) 97);
		}
	}

	static final void method2898(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class681.method13846(class250, class242, class669, 1188566107);
	}

	static final void method2899(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_5_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_6_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class654.method10720(i_5_, i_6_, true, 53755549);
	}

	static final void method2900(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool11156 ? 1 : 0;
	}
}
