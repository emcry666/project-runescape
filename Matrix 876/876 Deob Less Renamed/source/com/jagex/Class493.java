/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class493 implements Interface56 {
	Class489 this$0;

	Class493(Class489 class489) {
		this$0 = class489;
	}

	public byte[] method374(int i, byte i_0_) {
		return this$0.anInterface71_5502.method452(i, (byte) 11);
	}

	public byte[] method375(int i) {
		return this$0.anInterface71_5502.method452(i, (byte) 11);
	}

	public static short method8085(int i, int i_1_) {
		int i_2_ = i >> 10 & 0x3f;
		int i_3_ = i >> 3 & 0x70;
		int i_4_ = i & 0x7f;
		i_3_ = i_4_ <= 64 ? i_4_ * i_3_ >> 7 : (127 - i_4_) * i_3_ >> 7;
		int i_5_ = i_4_ + i_3_;
		int i_6_;
		if (0 != i_5_)
			i_6_ = (i_3_ << 8) / i_5_;
		else
			i_6_ = i_3_ << 1;
		int i_7_ = i_5_;
		return (short) (i_2_ << 10 | i_6_ >> 4 << 7 | i_7_);
	}

	static final void method8086(Class669 class669, int i) {
		Class523_Sub29 class523_sub29 = ((Class523_Sub29) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]));
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub29.anInt10555 * 169299399;
	}

	public static Class523_Sub22 method8087(int i) {
		Class523_Sub22 class523_sub22 = Class68.method1462((byte) -35);
		class523_sub22.aClass408_10524 = null;
		class523_sub22.anInt10523 = 0;
		class523_sub22.aClass523_Sub34_Sub2_10525 = new Class523_Sub34_Sub2(5000);
		return class523_sub22;
	}

	static final void method8088(Class669 class669, int i) {
		Class250 class250 = Class188.method3592(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -679884533);
		class250.aClass250Array2535 = null;
		class250.aClass250Array2519 = null;
		Class523_Sub14.method15991(class250, (byte) -82);
	}

	static void method8089(int i) {
		Class523_Sub27_Sub7.aClass14_11647.method733(-69314883);
		Class523_Sub27_Sub7.aClass697_11657.method14014(1370249782);
		Class523_Sub27_Sub7.aClass697_11671.method14014(-194475031);
	}

	static final void method8090(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 365308179 * class250.anInt2581;
	}
}
