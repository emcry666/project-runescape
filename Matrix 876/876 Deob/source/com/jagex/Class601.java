/* Class601 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class601 {
	public static Class601 aClass601_7848;
	public static Class601 aClass601_7849 = new Class601(0);
	public static Class601 aClass601_7850 = new Class601(1);
	static int anInt7851;

	Class601(int i) {
		/* empty */
	}

	static {
		aClass601_7848 = new Class601(4);
	}

	static Class523_Sub27_Sub19 method9883(int i, int i_0_) {
		Class523_Sub27_Sub19 class523_sub27_sub19 = ((Class523_Sub27_Sub19) Class659.aClass207_8504.method3739((long) i));
		if (class523_sub27_sub19 != null)
			return class523_sub27_sub19;
		byte[] is = Class515.aClass472_7045.method7688(i, 0, 443756798);
		if (null == is || is.length <= 1)
			return null;
		try {
			class523_sub27_sub19 = Class644.method10550(is, (byte) 3);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		Class659.aClass207_8504.method3741(class523_sub27_sub19, (long) i);
		return class523_sub27_sub19;
	}

	static final void method9884(Class669 class669, byte i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_1_, -1458756877);
		Class242 class242 = Class31.aClass242Array302[i_1_ >> 16];
		Class543.method9006(class250, class242, class669, 977857159);
	}

	static final void method9885(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_2_ - i_3_;
	}

	static final void method9886(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class380.aClass473_3938.method7739(i_4_, (byte) -3).aCharArray11725[i_5_]);
	}

	static final void method9887(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -17422498;
		int i_6_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5455((float) (2.0 * ((double) i_6_ * 3.141592653589793) / 16384.0), (float) (3.141592653589793 * (double) i_7_ * 2.0 / 16384.0), -832058201);
	}
}
