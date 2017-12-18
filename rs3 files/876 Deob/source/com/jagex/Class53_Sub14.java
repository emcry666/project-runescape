/* Class53_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class53_Sub14 extends Class53 {
	public static final int anInt10974 = 64;
	public static final int anInt10975 = 64;

	public void method1303() {
		super.method1294((byte) -85);
		((Class88) anInterface5_723).method1620(-1865401373);
	}

	public void method17211(int i, int i_0_) {
		super.method1292(i, (byte) -39);
		((Class88) anInterface5_723).method1616(i_0_, (byte) -18);
	}

	public void method1299(int i, byte i_1_) {
		super.method1299(i, (byte) -111);
		((Class88) anInterface5_723).method1619(i, 1700599327);
	}

	public Class53_Sub14(Class681 class681, Class668 class668, Class472 class472, Class472 class472_2_) {
		super(class681, class668, class472, JS5ConfigStruct.aClass656_8499, 64, new Class88_Sub1(class472_2_, 64));
	}

	public void method17212(int i, int i_3_, int i_4_) {
		super.method1292(i, (byte) 92);
		((Class88) anInterface5_723).method1616(i_3_, (byte) 53);
	}

	public void method1296(int i) {
		super.method1299(i, (byte) -22);
		((Class88) anInterface5_723).method1619(i, 1700599327);
	}

	public void method1293(int i) {
		super.method1293(-104787068);
		((Class88) anInterface5_723).method1617(-1519806384);
	}

	public void method1297() {
		super.method1293(-1387943727);
		((Class88) anInterface5_723).method1617(-673010827);
	}

	public void method1300() {
		super.method1293(264664896);
		((Class88) anInterface5_723).method1617(1400064472);
	}

	public void method1301() {
		super.method1293(-234897672);
		((Class88) anInterface5_723).method1617(-1061412238);
	}

	public void method1302() {
		super.method1293(-1328799792);
		((Class88) anInterface5_723).method1617(-2037546383);
	}

	public void method1294(byte i) {
		super.method1294((byte) -99);
		((Class88) anInterface5_723).method1620(-1488598587);
	}

	public void method1298(int i) {
		super.method1299(i, (byte) -112);
		((Class88) anInterface5_723).method1619(i, 1700599327);
	}

	public void method17213(int i, int i_5_) {
		super.method1292(i, (byte) -63);
		((Class88) anInterface5_723).method1616(i_5_, (byte) -38);
	}

	public void method17214(int i, int i_6_) {
		super.method1292(i, (byte) -10);
		((Class88) anInterface5_723).method1616(i_6_, (byte) -107);
	}

	public static Class167 method17215(Class178 class178, int i, int i_7_, int i_8_, int i_9_, int i_10_, Class167 class167, int i_11_, int i_12_, int i_13_, int i_14_, Class707 class707, int i_15_) {
		if (null == class167)
			return null;
		int i_16_ = 2055;
		if (null != class707) {
			i_16_ |= class707.method14173(-1166244762);
			i_16_ &= ~0x200;
		}
		long l = (((long) i_12_ << 48) + (((long) i_11_ << 32) + (long) (i_10_ + (i_13_ << 16) + (i_14_ << 24))));
		Class167 class167_17_;
		synchronized (Class38.aClass209_374) {
			class167_17_ = (Class167) Class38.aClass209_374.method3767(l);
		}
		if (class167_17_ == null || class178.method3068(class167_17_.method2683(), i_16_) != 0) {
			if (class167_17_ != null)
				i_16_ = class178.method3117(i_16_, class167_17_.method2683());
			int i_18_ = i_10_ * 3 + 6;
			int i_19_ = 3;
			int[] is = { 64, 96, 128 };
			Class179 class179 = new Class179(i_19_ * i_18_ + 1, i_19_ * i_18_ * 2 - i_18_, 0);
			int i_20_ = class179.method3483(0, 0, 0);
			int[][] is_21_ = new int[i_19_][i_18_];
			for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
				int i_23_ = is[i_22_];
				int i_24_ = is[i_22_];
				for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
					int i_26_ = (i_25_ << 14) / i_18_;
					int i_27_ = i_23_ * Class433.anIntArray4880[i_26_] >> 14;
					int i_28_ = Class433.anIntArray4881[i_26_] * i_24_ >> 14;
					is_21_[i_22_][i_25_] = class179.method3483(i_27_, 0, i_28_);
				}
			}
			for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
				int i_30_ = (256 * i_29_ + 128) / i_19_;
				int i_31_ = 256 - i_30_;
				byte i_32_ = (byte) (i_14_ * i_30_ + i_31_ * i_13_ >> 8);
				short i_33_ = (short) (((i_31_ * (i_11_ & 0x7f) + i_30_ * (i_12_ & 0x7f) & 0x7f00) + ((((i_12_ & 0xfc00) * i_30_ + (i_11_ & 0xfc00) * i_31_) & 0xfc0000) + (((i_11_ & 0x380) * i_31_ + i_30_ * (i_12_ & 0x380)) & 0x38000))) >> 8);
				for (int i_34_ = 0; i_34_ < i_18_; i_34_++) {
					if (i_29_ == 0)
						class179.method3484(i_20_, is_21_[0][(1 + i_34_) % i_18_], is_21_[0][i_34_], (byte) 1, (byte) -1, i_33_, i_32_, (short) -1);
					else {
						class179.method3484(is_21_[i_29_ - 1][i_34_], (is_21_[i_29_ - 1][(i_34_ + 1) % i_18_]), is_21_[i_29_][(1 + i_34_) % i_18_], (byte) 1, (byte) -1, i_33_, i_32_, (short) -1);
						class179.method3484(is_21_[i_29_ - 1][i_34_], is_21_[i_29_][(1 + i_34_) % i_18_], is_21_[i_29_][i_34_], (byte) 1, (byte) -1, i_33_, i_32_, (short) -1);
					}
				}
			}
			class167_17_ = class178.method3115(class179, i_16_, Class38.anInt375 * 1447206721, 64, 768);
			synchronized (Class38.aClass209_374) {
				Class38.aClass209_374.method3770(class167_17_, l);
			}
		}
		int i_35_ = class167.method2712();
		int i_36_ = class167.method2713();
		int i_37_ = class167.method2716();
		int i_38_ = class167.method2717();
		if (null != class707) {
			class167_17_ = class167_17_.method2681((byte) 3, i_16_, true);
			class167_17_.method2691(i_36_ - i_35_ >> 1, 128, i_38_ - i_37_ >> 1);
			class167_17_.method2689(i_35_ + i_36_ >> 1, 0, i_37_ + i_38_ >> 1);
			class707.method14176(class167_17_, (byte) 53);
		} else {
			class167_17_ = class167_17_.method2681((byte) 3, i_16_, true);
			class167_17_.method2691(i_36_ - i_35_ >> 1, 128, i_38_ - i_37_ >> 1);
			class167_17_.method2689(i_36_ + i_35_ >> 1, 0, i_38_ + i_37_ >> 1);
		}
		if (i_7_ != 0)
			class167_17_.method2845(i_7_);
		if (i_8_ != 0)
			class167_17_.method2688(i_8_);
		if (0 != i_9_)
			class167_17_.method2689(0, i_9_, 0);
		return class167_17_;
	}

	static final void method17216(Class669 class669, byte i) {
		int i_39_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (2 == 326760831 * client.anInt11235 && i_39_ < client.anInt11287 * 1563815891)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass60Array11182[i_39_].anInt760 * 2141430187;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
