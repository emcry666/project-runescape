/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class275 implements Interface75 {
	public static Class275 aClass275_2899 = new Class275(1, 0);
	public static Class275 aClass275_2900 = new Class275(0, 1);
	int anInt2901;
	public int anInt2902;
	static Class275 aClass275_2903 = new Class275(2, 2);

	public int method6() {
		return anInt2901 * 84317007;
	}

	public int method82() {
		return anInt2901 * 84317007;
	}

	Class275(int i, int i_0_) {
		anInt2902 = i * 1364889017;
		anInt2901 = i_0_ * -26565713;
	}

	static Class275[] method5035() {
		return (new Class275[] { aClass275_2900, aClass275_2899, aClass275_2903 });
	}

	static Class275[] method5036() {
		return (new Class275[] { aClass275_2900, aClass275_2899, aClass275_2903 });
	}

	public int method101() {
		return anInt2901 * 84317007;
	}

	static Class275[] method5037() {
		return (new Class275[] { aClass275_2900, aClass275_2899, aClass275_2903 });
	}

	static final void method5038(Class669 class669, byte i) {
		class669.anInt8558 -= 2103927403;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_3_ = class669.anIntArray8557[2 + 1357652815 * class669.anInt8558];
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		int i_5_ = class669.anIntArray8557[4 + class669.anInt8558 * 1357652815];
		Class254.aClass217_2743.method3854(Class189.aClass189_2143, i_1_, i_2_, i_4_, Class198.aClass198_2195.method3672((byte) 78), Class186.aClass186_2131, 0.0F, 0.0F, null, 0, i_5_, i_3_, -293892365);
	}

	static final void method5039(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (null != client.friendsChatName && i_6_ < 797304521 * Class365.anInt3866)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class99.aClass115Array1232[i_6_].aByte1411;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method5040(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_8_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		if (Class710.aBool8840) {
			Class82.method1585(3, i_7_, i_8_, false, -1011984276);
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class310.aFrame3385 != null ? 1 : 0;
		} else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static final void method5041(int i, boolean bool, short i_9_) {
		if (Class673.aClass523_Sub19_8611 != null && (i >= 0 && i < (Class673.aClass523_Sub19_8611.anInt10486 * 1969304563))) {
			Class338 class338 = Class673.aClass523_Sub19_8611.aClass338Array10485[i];
			Class116 class116 = Class537.method8941(-1066675307);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4324, class116.aClass11_1413, 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(3 + Class6.method555(class338.aString3573, (byte) -22), -100953618);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(i, (byte) -64);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -695317915);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16270(class338.aString3573, (byte) -48);
			class116.method1974(class523_sub22, (byte) 25);
		}
	}

	static Class523_Sub27_Sub17 method5042(Class472 class472, int i, byte i_10_) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(class472.method7688(0, i, -253892213));
		return Class523_Sub4_Sub1.method18082(class523_sub34, i, 256698053);
	}
}
