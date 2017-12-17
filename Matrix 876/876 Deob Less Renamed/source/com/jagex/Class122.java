/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class122 {
	boolean aBool1500 = true;
	Interface18 anInterface18_1501;
	Class147 aClass147_1502;
	static final int anInt1503 = 128;
	Class126_Sub2 aClass126_Sub2_1504;
	int anInt1505;
	int anInt1506;
	int anInt1507 = -1;
	int anInt1508;
	static final int anInt1509 = 7;
	Class130_Sub1 aClass130_Sub1_1510;
	Class178_Sub1 aClass178_Sub1_1511;

	void method2095() {
		method2098(anInterface18_1501, anInt1508);
	}

	void method2096(Interface18 interface18, int i) {
		if (i != 0) {
			method2101();
			aClass178_Sub1_1511.method14711(aClass126_Sub2_1504);
			aClass178_Sub1_1511.method14652(interface18, 4, 0, i);
		}
	}

	void method2097(byte[] is, int i) {
		aClass130_Sub1_1510.method100(5123, is, i * 2);
		method2098(aClass130_Sub1_1510, i);
	}

	void method2098(Interface18 interface18, int i) {
		if (i != 0) {
			method2101();
			aClass178_Sub1_1511.method14711(aClass126_Sub2_1504);
			aClass178_Sub1_1511.method14652(interface18, 4, 0, i);
		}
	}

	Class122(Class178_Sub1 class178_sub1, Class147 class147, Class142_Sub2 class142_sub2, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		aClass178_Sub1_1511 = class178_sub1;
		aClass147_1502 = class147;
		anInt1506 = i_2_;
		anInt1505 = i_3_;
		int i_4_ = 1 << i_1_;
		int i_5_ = 0;
		int i_6_ = i << i_1_;
		int i_7_ = i_0_ << i_1_;
		for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
			int i_9_ = (i_7_ + i_8_) * (class142_sub2.anInt1683 * 692304099) + i_6_;
			for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
				short[] is = class142_sub2.aShortArrayArray9715[i_9_++];
				if (is != null)
					i_5_ += is.length;
			}
		}
		anInt1508 = i_5_;
		if (i_5_ > 0) {
			Class523_Sub34 class523_sub34 = new Class523_Sub34(i_5_ * 2);
			if (aClass178_Sub1_1511.aBool9393) {
				for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
					int i_12_ = ((i_7_ + i_11_) * (class142_sub2.anInt1683 * 692304099) + i_6_);
					for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
						short[] is = class142_sub2.aShortArrayArray9715[i_12_++];
						if (is != null) {
							for (int i_14_ = 0; i_14_ < is.length; i_14_++)
								class523_sub34.writeShort(is[i_14_] & 0xffff, (byte) -58);
						}
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
					int i_16_ = ((i_7_ + i_15_) * (class142_sub2.anInt1683 * 692304099) + i_6_);
					for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
						short[] is = class142_sub2.aShortArrayArray9715[i_16_++];
						if (is != null) {
							for (int i_18_ = 0; i_18_ < is.length; i_18_++)
								class523_sub34.method16262(is[i_18_] & 0xffff, -1815036792);
						}
					}
				}
			}
			anInterface18_1501 = aClass178_Sub1_1511.method14660(5123, (class523_sub34.aByteArray10658), (class523_sub34.anInt10661 * 2349011), false);
			aClass130_Sub1_1510 = new Class130_Sub1(aClass178_Sub1_1511, 5123, null, 1);
		} else
			aClass126_Sub2_1504 = null;
	}

	void method2099(byte[] is, int i) {
		aClass130_Sub1_1510.method100(5123, is, i * 2);
		method2098(aClass130_Sub1_1510, i);
	}

	void method2100(byte[] is, int i) {
		aClass130_Sub1_1510.method100(5123, is, i * 2);
		method2098(aClass130_Sub1_1510, i);
	}

	void method2101() {
		if (aBool1500) {
			aBool1500 = false;
			byte[] is = aClass147_1502.aByteArray1711;
			byte[] is_19_ = aClass178_Sub1_1511.aByteArray9433;
			int i = 0;
			int i_20_ = aClass147_1502.anInt1707;
			int i_21_ = anInt1506 + anInt1505 * aClass147_1502.anInt1707;
			for (int i_22_ = -128; i_22_ < 0; i_22_++) {
				i = (i << 8) - i;
				for (int i_23_ = -128; i_23_ < 0; i_23_++) {
					if (is[i_21_++] != 0)
						i++;
				}
				i_21_ += i_20_ - 128;
			}
			if (aClass126_Sub2_1504 != null && anInt1507 == i)
				aBool1500 = false;
			else {
				anInt1507 = i;
				int i_24_ = 0;
				i_21_ = anInt1506 + anInt1505 * i_20_;
				for (int i_25_ = -128; i_25_ < 0; i_25_++) {
					for (int i_26_ = -128; i_26_ < 0; i_26_++) {
						if (is[i_21_] != 0)
							is_19_[i_24_++] = (byte) 68;
						else {
							int i_27_ = 0;
							if (is[i_21_ - 1] != 0)
								i_27_++;
							if (is[i_21_ + 1] != 0)
								i_27_++;
							if (is[i_21_ - i_20_] != 0)
								i_27_++;
							if (is[i_21_ + i_20_] != 0)
								i_27_++;
							is_19_[i_24_++] = (byte) (17 * i_27_);
						}
						i_21_++;
					}
					i_21_ += aClass147_1502.anInt1707 - 128;
				}
				if (aClass126_Sub2_1504 == null) {
					aClass126_Sub2_1504 = new Class126_Sub2(aClass178_Sub1_1511, 3553, Class158.aClass158_1747, Class170.aClass170_1822, 128, 128, false, aClass178_Sub1_1511.aByteArray9433, Class158.aClass158_1747, false);
					aClass126_Sub2_1504.method14363(false, false);
					aClass126_Sub2_1504.method2110(true);
				} else
					aClass126_Sub2_1504.method14364(0, 0, 128, 128, (aClass178_Sub1_1511.aByteArray9433), Class158.aClass158_1747, 0, 0, false);
			}
		}
	}

	void method2102(byte[] is, int i) {
		aClass130_Sub1_1510.method100(5123, is, i * 2);
		method2098(aClass130_Sub1_1510, i);
	}

	void method2103() {
		method2098(anInterface18_1501, anInt1508);
	}

	void method2104(Interface18 interface18, int i) {
		if (i != 0) {
			method2101();
			aClass178_Sub1_1511.method14711(aClass126_Sub2_1504);
			aClass178_Sub1_1511.method14652(interface18, 4, 0, i);
		}
	}

	void method2105() {
		if (aBool1500) {
			aBool1500 = false;
			byte[] is = aClass147_1502.aByteArray1711;
			byte[] is_28_ = aClass178_Sub1_1511.aByteArray9433;
			int i = 0;
			int i_29_ = aClass147_1502.anInt1707;
			int i_30_ = anInt1506 + anInt1505 * aClass147_1502.anInt1707;
			for (int i_31_ = -128; i_31_ < 0; i_31_++) {
				i = (i << 8) - i;
				for (int i_32_ = -128; i_32_ < 0; i_32_++) {
					if (is[i_30_++] != 0)
						i++;
				}
				i_30_ += i_29_ - 128;
			}
			if (aClass126_Sub2_1504 != null && anInt1507 == i)
				aBool1500 = false;
			else {
				anInt1507 = i;
				int i_33_ = 0;
				i_30_ = anInt1506 + anInt1505 * i_29_;
				for (int i_34_ = -128; i_34_ < 0; i_34_++) {
					for (int i_35_ = -128; i_35_ < 0; i_35_++) {
						if (is[i_30_] != 0)
							is_28_[i_33_++] = (byte) 68;
						else {
							int i_36_ = 0;
							if (is[i_30_ - 1] != 0)
								i_36_++;
							if (is[i_30_ + 1] != 0)
								i_36_++;
							if (is[i_30_ - i_29_] != 0)
								i_36_++;
							if (is[i_30_ + i_29_] != 0)
								i_36_++;
							is_28_[i_33_++] = (byte) (17 * i_36_);
						}
						i_30_++;
					}
					i_30_ += aClass147_1502.anInt1707 - 128;
				}
				if (aClass126_Sub2_1504 == null) {
					aClass126_Sub2_1504 = new Class126_Sub2(aClass178_Sub1_1511, 3553, Class158.aClass158_1747, Class170.aClass170_1822, 128, 128, false, aClass178_Sub1_1511.aByteArray9433, Class158.aClass158_1747, false);
					aClass126_Sub2_1504.method14363(false, false);
					aClass126_Sub2_1504.method2110(true);
				} else
					aClass126_Sub2_1504.method14364(0, 0, 128, 128, (aClass178_Sub1_1511.aByteArray9433), Class158.aClass158_1747, 0, 0, false);
			}
		}
	}

	void method2106() {
		if (aBool1500) {
			aBool1500 = false;
			byte[] is = aClass147_1502.aByteArray1711;
			byte[] is_37_ = aClass178_Sub1_1511.aByteArray9433;
			int i = 0;
			int i_38_ = aClass147_1502.anInt1707;
			int i_39_ = anInt1506 + anInt1505 * aClass147_1502.anInt1707;
			for (int i_40_ = -128; i_40_ < 0; i_40_++) {
				i = (i << 8) - i;
				for (int i_41_ = -128; i_41_ < 0; i_41_++) {
					if (is[i_39_++] != 0)
						i++;
				}
				i_39_ += i_38_ - 128;
			}
			if (aClass126_Sub2_1504 != null && anInt1507 == i)
				aBool1500 = false;
			else {
				anInt1507 = i;
				int i_42_ = 0;
				i_39_ = anInt1506 + anInt1505 * i_38_;
				for (int i_43_ = -128; i_43_ < 0; i_43_++) {
					for (int i_44_ = -128; i_44_ < 0; i_44_++) {
						if (is[i_39_] != 0)
							is_37_[i_42_++] = (byte) 68;
						else {
							int i_45_ = 0;
							if (is[i_39_ - 1] != 0)
								i_45_++;
							if (is[i_39_ + 1] != 0)
								i_45_++;
							if (is[i_39_ - i_38_] != 0)
								i_45_++;
							if (is[i_39_ + i_38_] != 0)
								i_45_++;
							is_37_[i_42_++] = (byte) (17 * i_45_);
						}
						i_39_++;
					}
					i_39_ += aClass147_1502.anInt1707 - 128;
				}
				if (aClass126_Sub2_1504 == null) {
					aClass126_Sub2_1504 = new Class126_Sub2(aClass178_Sub1_1511, 3553, Class158.aClass158_1747, Class170.aClass170_1822, 128, 128, false, aClass178_Sub1_1511.aByteArray9433, Class158.aClass158_1747, false);
					aClass126_Sub2_1504.method14363(false, false);
					aClass126_Sub2_1504.method2110(true);
				} else
					aClass126_Sub2_1504.method14364(0, 0, 128, 128, (aClass178_Sub1_1511.aByteArray9433), Class158.aClass158_1747, 0, 0, false);
			}
		}
	}
}
