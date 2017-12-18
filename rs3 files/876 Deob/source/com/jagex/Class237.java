/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class237 implements Iterator {
	Class98_Sub1_Sub1 this$0;
	int anInt2396;

	public boolean method4293() {
		return anInt2396 * 1198926043 < this$0.method69(-2143862280);
	}

	public boolean hasNext() {
		return anInt2396 * 1198926043 < this$0.method69(-1213848800);
	}

	public Object next() {
		int i = (anInt2396 += 1428263763) * 1198926043 - 1;
		Class159_Sub2 class159_sub2 = (Class159_Sub2) this$0.aClass209_11322.method3767((long) i);
		if (null != class159_sub2)
			return class159_sub2;
		return this$0.method17701(i, (byte) -20);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method4294() {
		return anInt2396 * 1198926043 < this$0.method69(-1948043567);
	}

	public boolean method4295() {
		return anInt2396 * 1198926043 < this$0.method69(-1799249015);
	}

	public void method4296() {
		throw new UnsupportedOperationException();
	}

	public boolean method4297() {
		return anInt2396 * 1198926043 < this$0.method69(-2139093176);
	}

	public Object method4298() {
		int i = (anInt2396 += 1428263763) * 1198926043 - 1;
		Class159_Sub2 class159_sub2 = (Class159_Sub2) this$0.aClass209_11322.method3767((long) i);
		if (null != class159_sub2)
			return class159_sub2;
		return this$0.method17701(i, (byte) -21);
	}

	public void method4299() {
		throw new UnsupportedOperationException();
	}

	Class237(Class98_Sub1_Sub1 class98_sub1_sub1) {
		this$0 = class98_sub1_sub1;
	}

	static final void method4300(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method4301(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.anInt11154 * 1109726117;
	}

	public static Class167 method4302(Class178 class178, int i, int i_0_, int i_1_, int i_2_, Class167 class167, short i_3_, byte i_4_, Class707 class707, int i_5_) {
		if (null == class167)
			return null;
		int i_6_ = 2055;
		if (class707 != null) {
			i_6_ |= class707.method14173(125030282);
			i_6_ &= ~0x200;
		}
		long l = (long) ((i_3_ & 0xffff) << 8 | i_4_);
		Class167 class167_7_;
		synchronized (Class38.aClass209_374) {
			class167_7_ = (Class167) Class38.aClass209_374.method3767(l);
		}
		if (class167_7_ == null || class178.method3068(class167_7_.method2683(), i_6_) != 0) {
			if (null != class167_7_)
				i_6_ = class178.method3117(i_6_, class167_7_.method2683());
			Class179 class179 = new Class179(4, 2, 2);
			int i_8_ = 128;
			int[] is = new int[4];
			is[0] = class179.method3483(-i_8_, 0, -i_8_);
			is[1] = class179.method3483(i_8_, 0, -i_8_);
			is[2] = class179.method3483(i_8_, 0, i_8_);
			is[3] = class179.method3483(-i_8_, 0, i_8_);
			class179.method3484(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_4_, i_3_);
			class179.method3484(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_4_, i_3_);
			class179.method3498((short) 1, (short) 2, (short) 0);
			class179.method3498((short) 2, (short) 3, (short) 0);
			class167_7_ = class178.method3115(class179, i_6_, Class38.anInt375 * 1447206721, 64, 768);
			synchronized (Class38.aClass209_374) {
				Class38.aClass209_374.method3770(class167_7_, l);
			}
		}
		int i_9_ = class167.method2712();
		int i_10_ = class167.method2713();
		int i_11_ = class167.method2716();
		int i_12_ = class167.method2717();
		if (null != class707) {
			class167_7_ = class167_7_.method2681((byte) 3, i_6_, true);
			class167_7_.method2691(i_10_ - i_9_ >> 1, 128, i_12_ - i_11_ >> 1);
			class167_7_.method2689(i_10_ + i_9_ >> 1, 0, i_11_ + i_12_ >> 1);
			class707.method14176(class167_7_, (byte) 18);
		} else {
			class167_7_ = class167_7_.method2681((byte) 3, i_6_, true);
			class167_7_.method2691(i_10_ - i_9_ >> 1, 128, i_12_ - i_11_ >> 1);
			class167_7_.method2689(i_9_ + i_10_ >> 1, 0, i_11_ + i_12_ >> 1);
		}
		if (0 != i_0_)
			class167_7_.method2845(i_0_);
		if (i_1_ != 0)
			class167_7_.method2688(i_1_);
		if (0 != i_2_)
			class167_7_.method2689(0, i_2_, 0);
		return class167_7_;
	}
}
