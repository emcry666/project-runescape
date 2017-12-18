/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public class Class310 implements Interface13 {
	int[] anIntArray3374;
	short[] aShortArray3375;
	short[] aShortArray3376;
	short[] aShortArray3377;
	byte[] aByteArray3378;
	short[] aShortArray3379;
	byte[] aByteArray3380;
	public static int[] anIntArray3381 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int[] anIntArray3382 = { -1, -1, -1, -1, -1 };
	Class472 aClass472_3383;
	public static int[] anIntArray3384 = { 7, 8, 9, 10, 11, 12, 13, 15 };
	public static Frame aFrame3385;

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(621085420);
			if (0 == i_0_)
				break;
			method5632(class523_sub34, i_0_, 1441122207);
		}
	}

	public boolean method5620(byte i) {
		if (null == anIntArray3374)
			return true;
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i_1_ = 0; i_1_ < anIntArray3374.length; i_1_++) {
				if (!aClass472_3383.method7663(anIntArray3374[i_1_], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1807287226);
			if (0 == i)
				break;
			method5632(class523_sub34, i, 1637866273);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2080618935);
			if (0 == i)
				break;
			method5632(class523_sub34, i, 2074113167);
		}
	}

	public Class179 method5621(byte i) {
		if (null == anIntArray3374)
			return null;
		Class179[] class179s = new Class179[anIntArray3374.length];
		synchronized (aClass472_3383) {
			for (int i_2_ = 0; i_2_ < anIntArray3374.length; i_2_++)
				class179s[i_2_] = Class179.method3485(aClass472_3383, anIntArray3374[i_2_], 0);
		}
		for (int i_3_ = 0; i_3_ < anIntArray3374.length; i_3_++) {
			if (class179s[i_3_].anInt1952 < 13)
				class179s[i_3_].method3494(2);
		}
		Class179 class179;
		if (1 == class179s.length)
			class179 = class179s[0];
		else
			class179 = new Class179(class179s, class179s.length);
		if (null == class179)
			return null;
		if (null != aShortArray3376) {
			for (int i_4_ = 0; i_4_ < aShortArray3376.length; i_4_++)
				class179.method3490(aShortArray3376[i_4_], aShortArray3377[i_4_]);
		}
		if (null != aShortArray3375) {
			for (int i_5_ = 0; i_5_ < aShortArray3375.length; i_5_++)
				class179.method3491(aShortArray3375[i_5_], aShortArray3379[i_5_]);
		}
		return class179;
	}

	public boolean method5622(int i) {
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i_6_ = 0; i_6_ < 5; i_6_++) {
				if (anIntArray3382[i_6_] != -1 && !aClass472_3383.method7663(anIntArray3382[i_6_], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5623() {
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i = 0; i < 5; i++) {
				if (anIntArray3382[i] != -1 && !aClass472_3383.method7663(anIntArray3382[i], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5624() {
		if (null == anIntArray3374)
			return true;
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i = 0; i < anIntArray3374.length; i++) {
				if (!aClass472_3383.method7663(anIntArray3374[i], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public Class179 method5625() {
		Class179[] class179s = new Class179[5];
		int i = 0;
		synchronized (aClass472_3383) {
			for (int i_7_ = 0; i_7_ < 5; i_7_++) {
				if (anIntArray3382[i_7_] != -1)
					class179s[i++] = Class179.method3485(aClass472_3383, anIntArray3382[i_7_], 0);
			}
		}
		for (int i_8_ = 0; i_8_ < 5; i_8_++) {
			if (null != class179s[i_8_] && class179s[i_8_].anInt1952 < 13)
				class179s[i_8_].method3494(2);
		}
		Class179 class179 = new Class179(class179s, i);
		if (null != aShortArray3376) {
			for (int i_9_ = 0; i_9_ < aShortArray3376.length; i_9_++)
				class179.method3490(aShortArray3376[i_9_], aShortArray3377[i_9_]);
		}
		if (aShortArray3375 != null) {
			for (int i_10_ = 0; i_10_ < aShortArray3375.length; i_10_++)
				class179.method3491(aShortArray3375[i_10_], aShortArray3379[i_10_]);
		}
		return class179;
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(611109828);
			if (0 == i)
				break;
			method5632(class523_sub34, i, 1736816630);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(67545721);
			if (0 == i)
				break;
			method5632(class523_sub34, i, 1299444149);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2056742562);
			if (0 == i)
				break;
			method5632(class523_sub34, i, 1328544139);
		}
	}

	public void method79() {
		/* empty */
	}

	public void method78() {
		/* empty */
	}

	Class310(int i, Class472 class472) {
		aClass472_3383 = class472;
	}

	public void method77() {
		/* empty */
	}

	public void method73() {
		/* empty */
	}

	void method5626(Class523_Sub34 class523_sub34, int i) {
		if (1 == i)
			class523_sub34.readUnsignedByte(1952637550);
		else if (i == 2) {
			int i_11_ = class523_sub34.readUnsignedByte(216281893);
			anIntArray3374 = new int[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				anIntArray3374[i_12_] = class523_sub34.readBigSmart((byte) -57);
		} else if (3 != i) {
			if (40 == i) {
				int i_13_ = class523_sub34.readUnsignedByte(661918458);
				aShortArray3376 = new short[i_13_];
				aShortArray3377 = new short[i_13_];
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					aShortArray3376[i_14_] = (short) class523_sub34.readUnsignedShort(-705517508);
					aShortArray3377[i_14_] = (short) class523_sub34.readUnsignedShort(-2120815422);
				}
			} else if (i == 41) {
				int i_15_ = class523_sub34.readUnsignedByte(610536165);
				aShortArray3375 = new short[i_15_];
				aShortArray3379 = new short[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					aShortArray3375[i_16_] = (short) class523_sub34.readUnsignedShort(-1281696614);
					aShortArray3379[i_16_] = (short) class523_sub34.readUnsignedShort(-805493675);
				}
			} else if (i == 44) {
				int i_17_ = class523_sub34.readUnsignedShort(-978101906);
				int i_18_ = 0;
				for (int i_19_ = i_17_; i_19_ > 0; i_19_ >>= 1)
					i_18_++;
				aByteArray3380 = new byte[i_18_];
				byte i_20_ = 0;
				for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
					if ((i_17_ & 1 << i_21_) > 0) {
						aByteArray3380[i_21_] = i_20_;
						i_20_++;
					} else
						aByteArray3380[i_21_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_22_ = class523_sub34.readUnsignedShort(-521392382);
				int i_23_ = 0;
				for (int i_24_ = i_22_; i_24_ > 0; i_24_ >>= 1)
					i_23_++;
				aByteArray3378 = new byte[i_23_];
				byte i_25_ = 0;
				for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
					if ((i_22_ & 1 << i_26_) > 0) {
						aByteArray3378[i_26_] = i_25_;
						i_25_++;
					} else
						aByteArray3378[i_26_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3382[i - 60] = class523_sub34.readBigSmart((byte) -52);
		}
	}

	public boolean method5627() {
		if (null == anIntArray3374)
			return true;
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i = 0; i < anIntArray3374.length; i++) {
				if (!aClass472_3383.method7663(anIntArray3374[i], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5628() {
		if (null == anIntArray3374)
			return true;
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i = 0; i < anIntArray3374.length; i++) {
				if (!aClass472_3383.method7663(anIntArray3374[i], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public Class179 method5629(byte i) {
		Class179[] class179s = new Class179[5];
		int i_27_ = 0;
		synchronized (aClass472_3383) {
			for (int i_28_ = 0; i_28_ < 5; i_28_++) {
				if (anIntArray3382[i_28_] != -1)
					class179s[i_27_++] = Class179.method3485(aClass472_3383, anIntArray3382[i_28_], 0);
			}
		}
		for (int i_29_ = 0; i_29_ < 5; i_29_++) {
			if (null != class179s[i_29_] && class179s[i_29_].anInt1952 < 13)
				class179s[i_29_].method3494(2);
		}
		Class179 class179 = new Class179(class179s, i_27_);
		if (null != aShortArray3376) {
			for (int i_30_ = 0; i_30_ < aShortArray3376.length; i_30_++)
				class179.method3490(aShortArray3376[i_30_], aShortArray3377[i_30_]);
		}
		if (aShortArray3375 != null) {
			for (int i_31_ = 0; i_31_ < aShortArray3375.length; i_31_++)
				class179.method3491(aShortArray3375[i_31_], aShortArray3379[i_31_]);
		}
		return class179;
	}

	public Class179 method5630() {
		if (null == anIntArray3374)
			return null;
		Class179[] class179s = new Class179[anIntArray3374.length];
		synchronized (aClass472_3383) {
			for (int i = 0; i < anIntArray3374.length; i++)
				class179s[i] = Class179.method3485(aClass472_3383, anIntArray3374[i], 0);
		}
		for (int i = 0; i < anIntArray3374.length; i++) {
			if (class179s[i].anInt1952 < 13)
				class179s[i].method3494(2);
		}
		Class179 class179;
		if (1 == class179s.length)
			class179 = class179s[0];
		else
			class179 = new Class179(class179s, class179s.length);
		if (null == class179)
			return null;
		if (null != aShortArray3376) {
			for (int i = 0; i < aShortArray3376.length; i++)
				class179.method3490(aShortArray3376[i], aShortArray3377[i]);
		}
		if (null != aShortArray3375) {
			for (int i = 0; i < aShortArray3375.length; i++)
				class179.method3491(aShortArray3375[i], aShortArray3379[i]);
		}
		return class179;
	}

	public Class179 method5631() {
		if (null == anIntArray3374)
			return null;
		Class179[] class179s = new Class179[anIntArray3374.length];
		synchronized (aClass472_3383) {
			for (int i = 0; i < anIntArray3374.length; i++)
				class179s[i] = Class179.method3485(aClass472_3383, anIntArray3374[i], 0);
		}
		for (int i = 0; i < anIntArray3374.length; i++) {
			if (class179s[i].anInt1952 < 13)
				class179s[i].method3494(2);
		}
		Class179 class179;
		if (1 == class179s.length)
			class179 = class179s[0];
		else
			class179 = new Class179(class179s, class179s.length);
		if (null == class179)
			return null;
		if (null != aShortArray3376) {
			for (int i = 0; i < aShortArray3376.length; i++)
				class179.method3490(aShortArray3376[i], aShortArray3377[i]);
		}
		if (null != aShortArray3375) {
			for (int i = 0; i < aShortArray3375.length; i++)
				class179.method3491(aShortArray3375[i], aShortArray3379[i]);
		}
		return class179;
	}

	void method5632(Class523_Sub34 class523_sub34, int i, int i_32_) {
		if (1 == i)
			class523_sub34.readUnsignedByte(2090424526);
		else if (i == 2) {
			int i_33_ = class523_sub34.readUnsignedByte(-144629290);
			anIntArray3374 = new int[i_33_];
			for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
				anIntArray3374[i_34_] = class523_sub34.readBigSmart((byte) -106);
		} else if (3 != i) {
			if (40 == i) {
				int i_35_ = class523_sub34.readUnsignedByte(1390713675);
				aShortArray3376 = new short[i_35_];
				aShortArray3377 = new short[i_35_];
				for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
					aShortArray3376[i_36_] = (short) class523_sub34.readUnsignedShort(-745322175);
					aShortArray3377[i_36_] = (short) class523_sub34.readUnsignedShort(-1791723868);
				}
			} else if (i == 41) {
				int i_37_ = class523_sub34.readUnsignedByte(-1343853548);
				aShortArray3375 = new short[i_37_];
				aShortArray3379 = new short[i_37_];
				for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
					aShortArray3375[i_38_] = (short) class523_sub34.readUnsignedShort(-1670272714);
					aShortArray3379[i_38_] = (short) class523_sub34.readUnsignedShort(-575616579);
				}
			} else if (i == 44) {
				int i_39_ = class523_sub34.readUnsignedShort(-395080334);
				int i_40_ = 0;
				for (int i_41_ = i_39_; i_41_ > 0; i_41_ >>= 1)
					i_40_++;
				aByteArray3380 = new byte[i_40_];
				byte i_42_ = 0;
				for (int i_43_ = 0; i_43_ < i_40_; i_43_++) {
					if ((i_39_ & 1 << i_43_) > 0) {
						aByteArray3380[i_43_] = i_42_;
						i_42_++;
					} else
						aByteArray3380[i_43_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_44_ = class523_sub34.readUnsignedShort(-1251884202);
				int i_45_ = 0;
				for (int i_46_ = i_44_; i_46_ > 0; i_46_ >>= 1)
					i_45_++;
				aByteArray3378 = new byte[i_45_];
				byte i_47_ = 0;
				for (int i_48_ = 0; i_48_ < i_45_; i_48_++) {
					if ((i_44_ & 1 << i_48_) > 0) {
						aByteArray3378[i_48_] = i_47_;
						i_47_++;
					} else
						aByteArray3378[i_48_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				anIntArray3382[i - 60] = class523_sub34.readBigSmart((byte) -111);
		}
	}

	public boolean method5633() {
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i = 0; i < 5; i++) {
				if (anIntArray3382[i] != -1 && !aClass472_3383.method7663(anIntArray3382[i], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public boolean method5634() {
		boolean bool = true;
		synchronized (aClass472_3383) {
			for (int i = 0; i < 5; i++) {
				if (anIntArray3382[i] != -1 && !aClass472_3383.method7663(anIntArray3382[i], 0, 1089230115))
					bool = false;
			}
		}
		return bool;
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-426772865);
			if (0 == i)
				break;
			method5632(class523_sub34, i, 1047289576);
		}
	}

	static final int method5635(int i, int i_49_, int i_50_) {
		int i_51_ = (Class194_Sub19.method15523(i - 1, i_49_ - 1, (byte) 0) + Class194_Sub19.method15523(i + 1, i_49_ - 1, (byte) 0) + Class194_Sub19.method15523(i - 1, i_49_ + 1, (byte) 0) + Class194_Sub19.method15523(1 + i, i_49_ + 1, (byte) 0));
		int i_52_ = (Class194_Sub19.method15523(i - 1, i_49_, (byte) 0) + Class194_Sub19.method15523(1 + i, i_49_, (byte) 0) + Class194_Sub19.method15523(i, i_49_ - 1, (byte) 0) + Class194_Sub19.method15523(i, i_49_ + 1, (byte) 0));
		int i_53_ = Class194_Sub19.method15523(i, i_49_, (byte) 0);
		return i_51_ / 16 + i_52_ / 8 + i_53_ / 4;
	}

	static final void method5636(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_54_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_55_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_56_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.method5887(i_54_, i_55_, i_56_, -770419572);
	}
}
