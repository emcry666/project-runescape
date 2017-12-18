/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class334 {
	public int anInt3513;
	boolean aBool3514;
	boolean aBool3515;
	long aLong3516;
	int anInt3517 = 0;
	public String aString3518 = null;
	int anInt3519 = 0;
	public boolean aBool3520;
	public byte aByte3521;
	public byte aByte3522;
	public boolean[] aBoolArray3523;
	public String[] aStringArray3524;
	public int anInt3525;
	long[] aLongArray3526;
	public byte[] aByteArray3527;
	public String[] aStringArray3528;
	public byte aByte3529;
	public int[] anIntArray3530;
	static final byte aByte3531 = 125;
	public int anInt3532 = 598652619;
	public int anInt3533 = -819957933;
	static final int anInt3534 = 6;
	long[] aLongArray3535;
	int[] anIntArray3536;
	public byte aByte3537;
	Class14 aClass14_3538;
	static final byte aByte3539 = 127;
	static final byte aByte3540 = 126;
	int[] anIntArray3541;
	static final byte aByte3542 = 0;
	public static final byte aByte3543 = -1;
	public static Class53_Sub14 aClass53_Sub14_3544;

	int method5850(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = (1 << i_1_) - 1;
		int i_4_ = i_2_ == 31 ? -1 : (1 << 1 + i_2_) - 1;
		int i_5_ = i_4_ ^ i_3_;
		i_0_ <<= i_1_;
		i_0_ &= i_5_;
		int i_6_ = anIntArray3541[i];
		if ((i_6_ & i_5_) == i_0_)
			return -1;
		i_6_ &= i_5_ ^ 0xffffffff;
		anIntArray3541[i] = i_6_ | i_0_;
		return i;
	}

	void method5851(int i, int i_7_) {
		if (aBool3514) {
			if (aLongArray3526 != null)
				System.arraycopy(aLongArray3526, 0, aLongArray3526 = new long[i], 0, -2125729363 * anInt3525);
			else
				aLongArray3526 = new long[i];
		}
		if (aBool3515) {
			if (aStringArray3528 != null)
				System.arraycopy(aStringArray3528, 0, aStringArray3528 = new String[i], 0, -2125729363 * anInt3525);
			else
				aStringArray3528 = new String[i];
		}
		if (aByteArray3527 != null)
			System.arraycopy(aByteArray3527, 0, aByteArray3527 = new byte[i], 0, anInt3525 * -2125729363);
		else
			aByteArray3527 = new byte[i];
		if (anIntArray3541 != null)
			System.arraycopy(anIntArray3541, 0, anIntArray3541 = new int[i], 0, anInt3525 * -2125729363);
		else
			anIntArray3541 = new int[i];
		if (null != anIntArray3530)
			System.arraycopy(anIntArray3530, 0, anIntArray3530 = new int[i], 0, -2125729363 * anInt3525);
		else
			anIntArray3530 = new int[i];
		if (aBoolArray3523 != null)
			System.arraycopy(aBoolArray3523, 0, aBoolArray3523 = new boolean[i], 0, anInt3525 * -2125729363);
		else
			aBoolArray3523 = new boolean[i];
	}

	void method5852(int i, int i_8_) {
		if (aBool3514) {
			if (aLongArray3535 != null)
				System.arraycopy(aLongArray3535, 0, aLongArray3535 = new long[i], 0, 836590747 * anInt3513);
			else
				aLongArray3535 = new long[i];
		}
		if (aBool3515) {
			if (null != aStringArray3524)
				System.arraycopy(aStringArray3524, 0, aStringArray3524 = new String[i], 0, 836590747 * anInt3513);
			else
				aStringArray3524 = new String[i];
		}
	}

	boolean method5853(int i, int i_9_, int i_10_, int i_11_) {
		int i_12_ = (1 << i_10_) - 1;
		int i_13_ = 31 == i_11_ ? -1 : (1 << i_11_ + 1) - 1;
		int i_14_ = i_13_ ^ i_12_;
		i_9_ <<= i_10_;
		i_9_ &= i_14_;
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (i_9_ == (class523_sub24.anInt10542 * -677457577 & i_14_))
						return false;
					Class523_Sub24 class523_sub24_15_;
					(class523_sub24_15_ = class523_sub24).anInt10542 = (484092519 * (-677457577 * class523_sub24_15_.anInt10542 & (i_14_ ^ 0xffffffff)));
					Class523_Sub24 class523_sub24_16_;
					(class523_sub24_16_ = class523_sub24).anInt10542 = ((class523_sub24_16_.anInt10542 * -677457577 | i_9_) * 484092519);
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_9_), (long) i);
		return true;
	}

	boolean method5854(int i, int i_17_) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (-677457577 * class523_sub24.anInt10542 == i_17_)
						return false;
					class523_sub24.anInt10542 = 484092519 * i_17_;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_17_), (long) i);
		return true;
	}

	boolean method5855(int i, long l) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub7) {
					Class523_Sub7 class523_sub7 = (Class523_Sub7) class523;
					if (l == class523_sub7.aLong10404 * -2287843494007345997L)
						return false;
					class523_sub7.aLong10404 = l * 6503115775260729979L;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub7(l), (long) i);
		return true;
	}

	public Long method5856(int i, byte i_18_) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub7))
			return null;
		return new Long(-2287843494007345997L * ((Class523_Sub7) class523).aLong10404);
	}

	public String method5857(int i, byte i_19_) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub28))
			return null;
		return (String) ((Class523_Sub28) class523).anObject10554;
	}

	public int[] method5858(byte i) {
		if (null == anIntArray3536) {
			String[] strings = new String[-2125729363 * anInt3525];
			anIntArray3536 = new int[anInt3525 * -2125729363];
			for (int i_20_ = 0; i_20_ < -2125729363 * anInt3525; i_20_++) {
				strings[i_20_] = aStringArray3528[i_20_];
				if (strings[i_20_] != null)
					strings[i_20_] = strings[i_20_].toLowerCase();
				anIntArray3536[i_20_] = i_20_;
			}
			Class417.method6658(strings, anIntArray3536, -2044605097);
		}
		return anIntArray3536;
	}

	void method5859(long l, String string, int i, byte i_21_) {
		if (string != null && string.length() == 0)
			string = null;
		if (aBool3514 != l > 0L)
			throw new RuntimeException("");
		if (aBool3515 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3526 || -2125729363 * anInt3525 >= aLongArray3526.length) || (null != string && (null == aStringArray3528 || anInt3525 * -2125729363 >= aStringArray3528.length)))
			method5851(anInt3525 * -2125729363 + 5, -2027668483);
		if (null != aLongArray3526)
			aLongArray3526[-2125729363 * anInt3525] = l;
		if (aStringArray3528 != null)
			aStringArray3528[anInt3525 * -2125729363] = string;
		if (-1 == anInt3532 * -987004643) {
			anInt3532 = anInt3525 * -1872732719;
			aByteArray3527[anInt3525 * -2125729363] = (byte) 126;
		} else
			aByteArray3527[-2125729363 * anInt3525] = (byte) 0;
		anIntArray3541[anInt3525 * -2125729363] = 0;
		anIntArray3530[-2125729363 * anInt3525] = i;
		aBoolArray3523[anInt3525 * -2125729363] = false;
		anInt3525 += -541812187;
		anIntArray3536 = null;
	}

	public Integer method5860(int i, int i_22_) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub24))
			return null;
		return new Integer(((Class523_Sub24) class523).anInt10542 * -677457577);
	}

	public Integer method5861(int i) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub24))
			return null;
		return new Integer(((Class523_Sub24) class523).anInt10542 * -677457577);
	}

	boolean method5862(int i, long l) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub7) {
					Class523_Sub7 class523_sub7 = (Class523_Sub7) class523;
					if (l == class523_sub7.aLong10404 * -2287843494007345997L)
						return false;
					class523_sub7.aLong10404 = l * 6503115775260729979L;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub7(l), (long) i);
		return true;
	}

	void method5863(int i, int i_23_) {
		anInt3513 -= -845338221;
		if (anInt3513 * 836590747 == 0) {
			aLongArray3535 = null;
			aStringArray3524 = null;
		} else {
			if (aLongArray3535 != null)
				System.arraycopy(aLongArray3535, 1 + i, aLongArray3535, i, 836590747 * anInt3513 - i);
			if (null != aStringArray3524)
				System.arraycopy(aStringArray3524, 1 + i, aStringArray3524, i, 836590747 * anInt3513 - i);
		}
	}

	void method5864(long l, String string, int i) {
		if (string != null && string.length() == 0)
			string = null;
		if (aBool3514 != l > 0L)
			throw new RuntimeException("");
		if (aBool3515 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3526 || -2125729363 * anInt3525 >= aLongArray3526.length) || (null != string && (null == aStringArray3528 || anInt3525 * -2125729363 >= aStringArray3528.length)))
			method5851(anInt3525 * -2125729363 + 5, -1756894659);
		if (null != aLongArray3526)
			aLongArray3526[-2125729363 * anInt3525] = l;
		if (aStringArray3528 != null)
			aStringArray3528[anInt3525 * -2125729363] = string;
		if (-1 == anInt3532 * -987004643) {
			anInt3532 = anInt3525 * -1872732719;
			aByteArray3527[anInt3525 * -2125729363] = (byte) 126;
		} else
			aByteArray3527[-2125729363 * anInt3525] = (byte) 0;
		anIntArray3541[anInt3525 * -2125729363] = 0;
		anIntArray3530[-2125729363 * anInt3525] = i;
		aBoolArray3523[anInt3525 * -2125729363] = false;
		anInt3525 += -541812187;
		anIntArray3536 = null;
	}

	void method5865(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(329642147);
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_24_ = class523_sub34.readUnsignedByte(-1888841538);
		if ((i_24_ & 0x1) != 0)
			aBool3514 = true;
		if (0 != (i_24_ & 0x2))
			aBool3515 = true;
		if (!aBool3514) {
			aLongArray3526 = null;
			aLongArray3535 = null;
		}
		if (!aBool3515) {
			aStringArray3528 = null;
			aStringArray3524 = null;
		}
		anInt3517 = class523_sub34.readUnsignedInt((byte) -31) * -490396051;
		anInt3519 = class523_sub34.readUnsignedInt((byte) -77) * -353469013;
		if (i <= 3 && 0 != -1607428861 * anInt3519)
			anInt3519 += 1371334112;
		anInt3525 = class523_sub34.readUnsignedShort(-2029560710) * -541812187;
		anInt3513 = class523_sub34.readUnsignedByte(-983200486) * -845338221;
		aString3518 = class523_sub34.readString(-1390338372);
		if (i >= 4)
			class523_sub34.readUnsignedInt((byte) -5);
		aBool3520 = class523_sub34.readUnsignedByte(236987361) == 1;
		aByte3521 = class523_sub34.readByte((short) -11586);
		aByte3522 = class523_sub34.readByte((short) -23645);
		aByte3537 = class523_sub34.readByte((short) -22896);
		aByte3529 = class523_sub34.readByte((short) -1626);
		if (anInt3525 * -2125729363 > 0) {
			if (aBool3514 && (aLongArray3526 == null || aLongArray3526.length < -2125729363 * anInt3525))
				aLongArray3526 = new long[anInt3525 * -2125729363];
			if (aBool3515 && (null == aStringArray3528 || aStringArray3528.length < -2125729363 * anInt3525))
				aStringArray3528 = new String[-2125729363 * anInt3525];
			if (null == aByteArray3527 || aByteArray3527.length < -2125729363 * anInt3525)
				aByteArray3527 = new byte[-2125729363 * anInt3525];
			if (anIntArray3541 == null || anIntArray3541.length < anInt3525 * -2125729363)
				anIntArray3541 = new int[anInt3525 * -2125729363];
			if (null == anIntArray3530 || anIntArray3530.length < anInt3525 * -2125729363)
				anIntArray3530 = new int[-2125729363 * anInt3525];
			if (null == aBoolArray3523 || aBoolArray3523.length < -2125729363 * anInt3525)
				aBoolArray3523 = new boolean[anInt3525 * -2125729363];
			for (int i_25_ = 0; i_25_ < -2125729363 * anInt3525; i_25_++) {
				if (aBool3514)
					aLongArray3526[i_25_] = class523_sub34.readLong((byte) -102);
				if (aBool3515)
					aStringArray3528[i_25_] = class523_sub34.method16363((byte) 55);
				aByteArray3527[i_25_] = class523_sub34.readByte((short) -16895);
				if (i >= 2)
					anIntArray3541[i_25_] = class523_sub34.readUnsignedInt((byte) -92);
				if (i >= 5)
					anIntArray3530[i_25_] = class523_sub34.readUnsignedShort(-811481411);
				else
					anIntArray3530[i_25_] = 0;
				if (i >= 6)
					aBoolArray3523[i_25_] = class523_sub34.readUnsignedByte(985741578) == 1;
				else
					aBoolArray3523[i_25_] = false;
			}
			method5883(-1877150701);
		}
		if (836590747 * anInt3513 > 0) {
			if (aBool3514 && (aLongArray3535 == null || aLongArray3535.length < anInt3513 * 836590747))
				aLongArray3535 = new long[anInt3513 * 836590747];
			if (aBool3515 && (null == aStringArray3524 || aStringArray3524.length < 836590747 * anInt3513))
				aStringArray3524 = new String[836590747 * anInt3513];
			for (int i_26_ = 0; i_26_ < anInt3513 * 836590747; i_26_++) {
				if (aBool3514)
					aLongArray3535[i_26_] = class523_sub34.readLong((byte) 8);
				if (aBool3515)
					aStringArray3524[i_26_] = class523_sub34.method16363((byte) 97);
			}
		}
		if (i >= 3) {
			int i_27_ = class523_sub34.readUnsignedShort(-1317735967);
			if (i_27_ > 0) {
				aClass14_3538 = new Class14(i_27_ < 16 ? Class628.method10313(i_27_, -2109603066) : 16);
				while (i_27_-- > 0) {
					int i_28_ = class523_sub34.readUnsignedInt((byte) -99);
					int i_29_ = i_28_ & 0x3fffffff;
					int i_30_ = i_28_ >>> 30;
					if (0 == i_30_) {
						int i_31_ = class523_sub34.readUnsignedInt((byte) -61);
						aClass14_3538.method738(new Class523_Sub24(i_31_), (long) i_29_);
					} else if (i_30_ == 1) {
						long l = class523_sub34.readLong((byte) -58);
						aClass14_3538.method738(new Class523_Sub7(l), (long) i_29_);
					} else if (i_30_ == 2) {
						String string = class523_sub34.readString(-1033660864);
						aClass14_3538.method738(new Class523_Sub28(string), (long) i_29_);
					}
				}
			}
		}
	}

	int method5866(int i, int i_32_, int i_33_, int i_34_, byte i_35_) {
		int i_36_ = (1 << i_33_) - 1;
		int i_37_ = i_34_ == 31 ? -1 : (1 << 1 + i_34_) - 1;
		int i_38_ = i_37_ ^ i_36_;
		i_32_ <<= i_33_;
		i_32_ &= i_38_;
		int i_39_ = anIntArray3541[i];
		if ((i_39_ & i_38_) == i_32_)
			return -1;
		i_39_ &= i_38_ ^ 0xffffffff;
		anIntArray3541[i] = i_39_ | i_32_;
		return i;
	}

	void method5867(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(-569335284);
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_40_ = class523_sub34.readUnsignedByte(2130078096);
		if ((i_40_ & 0x1) != 0)
			aBool3514 = true;
		if (0 != (i_40_ & 0x2))
			aBool3515 = true;
		if (!aBool3514) {
			aLongArray3526 = null;
			aLongArray3535 = null;
		}
		if (!aBool3515) {
			aStringArray3528 = null;
			aStringArray3524 = null;
		}
		anInt3517 = class523_sub34.readUnsignedInt((byte) -6) * -490396051;
		anInt3519 = class523_sub34.readUnsignedInt((byte) -83) * -353469013;
		if (i <= 3 && 0 != -1607428861 * anInt3519)
			anInt3519 += 1371334112;
		anInt3525 = class523_sub34.readUnsignedShort(-246496974) * -541812187;
		anInt3513 = class523_sub34.readUnsignedByte(-234729933) * -845338221;
		aString3518 = class523_sub34.readString(-467241474);
		if (i >= 4)
			class523_sub34.readUnsignedInt((byte) -32);
		aBool3520 = class523_sub34.readUnsignedByte(1059210356) == 1;
		aByte3521 = class523_sub34.readByte((short) -3678);
		aByte3522 = class523_sub34.readByte((short) -24476);
		aByte3537 = class523_sub34.readByte((short) -27515);
		aByte3529 = class523_sub34.readByte((short) -28824);
		if (anInt3525 * -2125729363 > 0) {
			if (aBool3514 && (aLongArray3526 == null || aLongArray3526.length < -2125729363 * anInt3525))
				aLongArray3526 = new long[anInt3525 * -2125729363];
			if (aBool3515 && (null == aStringArray3528 || aStringArray3528.length < -2125729363 * anInt3525))
				aStringArray3528 = new String[-2125729363 * anInt3525];
			if (null == aByteArray3527 || aByteArray3527.length < -2125729363 * anInt3525)
				aByteArray3527 = new byte[-2125729363 * anInt3525];
			if (anIntArray3541 == null || anIntArray3541.length < anInt3525 * -2125729363)
				anIntArray3541 = new int[anInt3525 * -2125729363];
			if (null == anIntArray3530 || anIntArray3530.length < anInt3525 * -2125729363)
				anIntArray3530 = new int[-2125729363 * anInt3525];
			if (null == aBoolArray3523 || aBoolArray3523.length < -2125729363 * anInt3525)
				aBoolArray3523 = new boolean[anInt3525 * -2125729363];
			for (int i_41_ = 0; i_41_ < -2125729363 * anInt3525; i_41_++) {
				if (aBool3514)
					aLongArray3526[i_41_] = class523_sub34.readLong((byte) -128);
				if (aBool3515)
					aStringArray3528[i_41_] = class523_sub34.method16363((byte) 29);
				aByteArray3527[i_41_] = class523_sub34.readByte((short) -9729);
				if (i >= 2)
					anIntArray3541[i_41_] = class523_sub34.readUnsignedInt((byte) -113);
				if (i >= 5)
					anIntArray3530[i_41_] = class523_sub34.readUnsignedShort(-1703072551);
				else
					anIntArray3530[i_41_] = 0;
				if (i >= 6)
					aBoolArray3523[i_41_] = class523_sub34.readUnsignedByte(-1606332162) == 1;
				else
					aBoolArray3523[i_41_] = false;
			}
			method5883(-606221492);
		}
		if (836590747 * anInt3513 > 0) {
			if (aBool3514 && (aLongArray3535 == null || aLongArray3535.length < anInt3513 * 836590747))
				aLongArray3535 = new long[anInt3513 * 836590747];
			if (aBool3515 && (null == aStringArray3524 || aStringArray3524.length < 836590747 * anInt3513))
				aStringArray3524 = new String[836590747 * anInt3513];
			for (int i_42_ = 0; i_42_ < anInt3513 * 836590747; i_42_++) {
				if (aBool3514)
					aLongArray3535[i_42_] = class523_sub34.readLong((byte) -45);
				if (aBool3515)
					aStringArray3524[i_42_] = class523_sub34.method16363((byte) -73);
			}
		}
		if (i >= 3) {
			int i_43_ = class523_sub34.readUnsignedShort(-657413156);
			if (i_43_ > 0) {
				aClass14_3538 = new Class14(i_43_ < 16 ? Class628.method10313(i_43_, -1219277269) : 16);
				while (i_43_-- > 0) {
					int i_44_ = class523_sub34.readUnsignedInt((byte) -110);
					int i_45_ = i_44_ & 0x3fffffff;
					int i_46_ = i_44_ >>> 30;
					if (0 == i_46_) {
						int i_47_ = class523_sub34.readUnsignedInt((byte) -128);
						aClass14_3538.method738(new Class523_Sub24(i_47_), (long) i_45_);
					} else if (i_46_ == 1) {
						long l = class523_sub34.readLong((byte) -124);
						aClass14_3538.method738(new Class523_Sub7(l), (long) i_45_);
					} else if (i_46_ == 2) {
						String string = class523_sub34.readString(421448307);
						aClass14_3538.method738(new Class523_Sub28(string), (long) i_45_);
					}
				}
			}
		}
	}

	boolean method5868(int i, int i_48_, int i_49_, int i_50_, short i_51_) {
		int i_52_ = (1 << i_49_) - 1;
		int i_53_ = 31 == i_50_ ? -1 : (1 << i_50_ + 1) - 1;
		int i_54_ = i_53_ ^ i_52_;
		i_48_ <<= i_49_;
		i_48_ &= i_54_;
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (i_48_ == (class523_sub24.anInt10542 * -677457577 & i_54_))
						return false;
					Class523_Sub24 class523_sub24_55_;
					(class523_sub24_55_ = class523_sub24).anInt10542 = (484092519 * (-677457577 * class523_sub24_55_.anInt10542 & (i_54_ ^ 0xffffffff)));
					Class523_Sub24 class523_sub24_56_;
					(class523_sub24_56_ = class523_sub24).anInt10542 = ((class523_sub24_56_.anInt10542 * -677457577 | i_48_) * 484092519);
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_48_), (long) i);
		return true;
	}

	int method5869(int i, boolean bool, int i_57_) {
		if (bool == aBoolArray3523[i])
			return -1;
		aBoolArray3523[i] = bool;
		return i;
	}

	boolean method5870(int i, String string, int i_58_) {
		if (string == null)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub28) {
					Class523_Sub28 class523_sub28 = (Class523_Sub28) class523;
					if (class523_sub28.anObject10554 instanceof String) {
						if (string.equals(class523_sub28.anObject10554))
							return false;
						class523_sub28.method8661(607052656);
						aClass14_3538.method738(new Class523_Sub28(string), (class523_sub28.aLong7065 * 1055205983951172633L));
						return true;
					}
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub28(string), (long) i);
		return true;
	}

	void method5871(Class523_Sub34 class523_sub34, int i) {
		int i_59_ = class523_sub34.readUnsignedByte(25817297);
		if (i_59_ < 1 || i_59_ > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i_59_).toString());
		int i_60_ = class523_sub34.readUnsignedByte(-827467402);
		if ((i_60_ & 0x1) != 0)
			aBool3514 = true;
		if (0 != (i_60_ & 0x2))
			aBool3515 = true;
		if (!aBool3514) {
			aLongArray3526 = null;
			aLongArray3535 = null;
		}
		if (!aBool3515) {
			aStringArray3528 = null;
			aStringArray3524 = null;
		}
		anInt3517 = class523_sub34.readUnsignedInt((byte) -83) * -490396051;
		anInt3519 = class523_sub34.readUnsignedInt((byte) -47) * -353469013;
		if (i_59_ <= 3 && 0 != -1607428861 * anInt3519)
			anInt3519 += 1371334112;
		anInt3525 = class523_sub34.readUnsignedShort(-1364331626) * -541812187;
		anInt3513 = class523_sub34.readUnsignedByte(816452630) * -845338221;
		aString3518 = class523_sub34.readString(-436385315);
		if (i_59_ >= 4)
			class523_sub34.readUnsignedInt((byte) -18);
		aBool3520 = class523_sub34.readUnsignedByte(1298881592) == 1;
		aByte3521 = class523_sub34.readByte((short) -11449);
		aByte3522 = class523_sub34.readByte((short) -3353);
		aByte3537 = class523_sub34.readByte((short) -21684);
		aByte3529 = class523_sub34.readByte((short) -30339);
		if (anInt3525 * -2125729363 > 0) {
			if (aBool3514 && (aLongArray3526 == null || aLongArray3526.length < -2125729363 * anInt3525))
				aLongArray3526 = new long[anInt3525 * -2125729363];
			if (aBool3515 && (null == aStringArray3528 || aStringArray3528.length < -2125729363 * anInt3525))
				aStringArray3528 = new String[-2125729363 * anInt3525];
			if (null == aByteArray3527 || aByteArray3527.length < -2125729363 * anInt3525)
				aByteArray3527 = new byte[-2125729363 * anInt3525];
			if (anIntArray3541 == null || anIntArray3541.length < anInt3525 * -2125729363)
				anIntArray3541 = new int[anInt3525 * -2125729363];
			if (null == anIntArray3530 || anIntArray3530.length < anInt3525 * -2125729363)
				anIntArray3530 = new int[-2125729363 * anInt3525];
			if (null == aBoolArray3523 || aBoolArray3523.length < -2125729363 * anInt3525)
				aBoolArray3523 = new boolean[anInt3525 * -2125729363];
			for (int i_61_ = 0; i_61_ < -2125729363 * anInt3525; i_61_++) {
				if (aBool3514)
					aLongArray3526[i_61_] = class523_sub34.readLong((byte) -122);
				if (aBool3515)
					aStringArray3528[i_61_] = class523_sub34.method16363((byte) 47);
				aByteArray3527[i_61_] = class523_sub34.readByte((short) -23128);
				if (i_59_ >= 2)
					anIntArray3541[i_61_] = class523_sub34.readUnsignedInt((byte) -2);
				if (i_59_ >= 5)
					anIntArray3530[i_61_] = class523_sub34.readUnsignedShort(-960439095);
				else
					anIntArray3530[i_61_] = 0;
				if (i_59_ >= 6)
					aBoolArray3523[i_61_] = class523_sub34.readUnsignedByte(1194384112) == 1;
				else
					aBoolArray3523[i_61_] = false;
			}
			method5883(-883333949);
		}
		if (836590747 * anInt3513 > 0) {
			if (aBool3514 && (aLongArray3535 == null || aLongArray3535.length < anInt3513 * 836590747))
				aLongArray3535 = new long[anInt3513 * 836590747];
			if (aBool3515 && (null == aStringArray3524 || aStringArray3524.length < 836590747 * anInt3513))
				aStringArray3524 = new String[836590747 * anInt3513];
			for (int i_62_ = 0; i_62_ < anInt3513 * 836590747; i_62_++) {
				if (aBool3514)
					aLongArray3535[i_62_] = class523_sub34.readLong((byte) -15);
				if (aBool3515)
					aStringArray3524[i_62_] = class523_sub34.method16363((byte) 91);
			}
		}
		if (i_59_ >= 3) {
			int i_63_ = class523_sub34.readUnsignedShort(-113104368);
			if (i_63_ > 0) {
				aClass14_3538 = new Class14(i_63_ < 16 ? Class628.method10313(i_63_, -739414011) : 16);
				while (i_63_-- > 0) {
					int i_64_ = class523_sub34.readUnsignedInt((byte) -67);
					int i_65_ = i_64_ & 0x3fffffff;
					int i_66_ = i_64_ >>> 30;
					if (0 == i_66_) {
						int i_67_ = class523_sub34.readUnsignedInt((byte) -128);
						aClass14_3538.method738(new Class523_Sub24(i_67_), (long) i_65_);
					} else if (i_66_ == 1) {
						long l = class523_sub34.readLong((byte) -92);
						aClass14_3538.method738(new Class523_Sub7(l), (long) i_65_);
					} else if (i_66_ == 2) {
						String string = class523_sub34.readString(-2092619296);
						aClass14_3538.method738(new Class523_Sub28(string), (long) i_65_);
					}
				}
			}
		}
	}

	void method5872(int i) {
		if (aBool3514) {
			if (aLongArray3526 != null)
				System.arraycopy(aLongArray3526, 0, aLongArray3526 = new long[i], 0, -2125729363 * anInt3525);
			else
				aLongArray3526 = new long[i];
		}
		if (aBool3515) {
			if (aStringArray3528 != null)
				System.arraycopy(aStringArray3528, 0, aStringArray3528 = new String[i], 0, -2125729363 * anInt3525);
			else
				aStringArray3528 = new String[i];
		}
		if (aByteArray3527 != null)
			System.arraycopy(aByteArray3527, 0, aByteArray3527 = new byte[i], 0, anInt3525 * -2125729363);
		else
			aByteArray3527 = new byte[i];
		if (anIntArray3541 != null)
			System.arraycopy(anIntArray3541, 0, anIntArray3541 = new int[i], 0, anInt3525 * -2125729363);
		else
			anIntArray3541 = new int[i];
		if (null != anIntArray3530)
			System.arraycopy(anIntArray3530, 0, anIntArray3530 = new int[i], 0, -2125729363 * anInt3525);
		else
			anIntArray3530 = new int[i];
		if (aBoolArray3523 != null)
			System.arraycopy(aBoolArray3523, 0, aBoolArray3523 = new boolean[i], 0, anInt3525 * -2125729363);
		else
			aBoolArray3523 = new boolean[i];
	}

	void method5873(int i) {
		if (aBool3514) {
			if (aLongArray3535 != null)
				System.arraycopy(aLongArray3535, 0, aLongArray3535 = new long[i], 0, 836590747 * anInt3513);
			else
				aLongArray3535 = new long[i];
		}
		if (aBool3515) {
			if (null != aStringArray3524)
				System.arraycopy(aStringArray3524, 0, aStringArray3524 = new String[i], 0, 836590747 * anInt3513);
			else
				aStringArray3524 = new String[i];
		}
	}

	void method5874(int i) {
		if (aBool3514) {
			if (aLongArray3535 != null)
				System.arraycopy(aLongArray3535, 0, aLongArray3535 = new long[i], 0, 836590747 * anInt3513);
			else
				aLongArray3535 = new long[i];
		}
		if (aBool3515) {
			if (null != aStringArray3524)
				System.arraycopy(aStringArray3524, 0, aStringArray3524 = new String[i], 0, 836590747 * anInt3513);
			else
				aStringArray3524 = new String[i];
		}
	}

	void method5875(int i) {
		if (aBool3514) {
			if (aLongArray3535 != null)
				System.arraycopy(aLongArray3535, 0, aLongArray3535 = new long[i], 0, 836590747 * anInt3513);
			else
				aLongArray3535 = new long[i];
		}
		if (aBool3515) {
			if (null != aStringArray3524)
				System.arraycopy(aStringArray3524, 0, aStringArray3524 = new String[i], 0, 836590747 * anInt3513);
			else
				aStringArray3524 = new String[i];
		}
	}

	int method5876(int i, byte i_68_) {
		if (126 == i_68_ || 127 == i_68_)
			return -1;
		if (i == anInt3532 * -987004643 && (-1 == anInt3533 * -1813490907 || aByteArray3527[-1813490907 * anInt3533] < 125))
			return -1;
		if (i_68_ == aByteArray3527[i])
			return -1;
		aByteArray3527[i] = i_68_;
		method5883(-667115456);
		return i;
	}

	public Long method5877(int i) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub7))
			return null;
		return new Long(-2287843494007345997L * ((Class523_Sub7) class523).aLong10404);
	}

	public Long method5878(int i) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub7))
			return null;
		return new Long(-2287843494007345997L * ((Class523_Sub7) class523).aLong10404);
	}

	public String method5879(int i) {
		if (null == aClass14_3538)
			return null;
		Class523 class523 = aClass14_3538.method741((long) i);
		if (class523 == null || !(class523 instanceof Class523_Sub28))
			return null;
		return (String) ((Class523_Sub28) class523).anObject10554;
	}

	public int[] method5880() {
		if (null == anIntArray3536) {
			String[] strings = new String[-2125729363 * anInt3525];
			anIntArray3536 = new int[anInt3525 * -2125729363];
			for (int i = 0; i < -2125729363 * anInt3525; i++) {
				strings[i] = aStringArray3528[i];
				if (strings[i] != null)
					strings[i] = strings[i].toLowerCase();
				anIntArray3536[i] = i;
			}
			Class417.method6658(strings, anIntArray3536, -1831295291);
		}
		return anIntArray3536;
	}

	void method5881(long l, String string, int i) {
		if (string != null && string.length() == 0)
			string = null;
		if (aBool3514 != l > 0L)
			throw new RuntimeException("");
		if (aBool3515 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3526 || -2125729363 * anInt3525 >= aLongArray3526.length) || (null != string && (null == aStringArray3528 || anInt3525 * -2125729363 >= aStringArray3528.length)))
			method5851(anInt3525 * -2125729363 + 5, -1980294210);
		if (null != aLongArray3526)
			aLongArray3526[-2125729363 * anInt3525] = l;
		if (aStringArray3528 != null)
			aStringArray3528[anInt3525 * -2125729363] = string;
		if (-1 == anInt3532 * -987004643) {
			anInt3532 = anInt3525 * -1872732719;
			aByteArray3527[anInt3525 * -2125729363] = (byte) 126;
		} else
			aByteArray3527[-2125729363 * anInt3525] = (byte) 0;
		anIntArray3541[anInt3525 * -2125729363] = 0;
		anIntArray3530[-2125729363 * anInt3525] = i;
		aBoolArray3523[anInt3525 * -2125729363] = false;
		anInt3525 += -541812187;
		anIntArray3536 = null;
	}

	void method5882(long l, String string, int i) {
		if (string != null && string.length() == 0)
			string = null;
		if (aBool3514 != l > 0L)
			throw new RuntimeException("");
		if (aBool3515 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3526 || -2125729363 * anInt3525 >= aLongArray3526.length) || (null != string && (null == aStringArray3528 || anInt3525 * -2125729363 >= aStringArray3528.length)))
			method5851(anInt3525 * -2125729363 + 5, -1988823684);
		if (null != aLongArray3526)
			aLongArray3526[-2125729363 * anInt3525] = l;
		if (aStringArray3528 != null)
			aStringArray3528[anInt3525 * -2125729363] = string;
		if (-1 == anInt3532 * -987004643) {
			anInt3532 = anInt3525 * -1872732719;
			aByteArray3527[anInt3525 * -2125729363] = (byte) 126;
		} else
			aByteArray3527[-2125729363 * anInt3525] = (byte) 0;
		anIntArray3541[anInt3525 * -2125729363] = 0;
		anIntArray3530[-2125729363 * anInt3525] = i;
		aBoolArray3523[anInt3525 * -2125729363] = false;
		anInt3525 += -541812187;
		anIntArray3536 = null;
	}

	void method5883(int i) {
		if (0 == -2125729363 * anInt3525) {
			anInt3532 = 598652619;
			anInt3533 = -819957933;
		} else {
			anInt3532 = 598652619;
			anInt3533 = -819957933;
			int i_69_ = 0;
			byte i_70_ = aByteArray3527[0];
			for (int i_71_ = 1; i_71_ < -2125729363 * anInt3525; i_71_++) {
				if (aByteArray3527[i_71_] > i_70_) {
					if (125 == i_70_)
						anInt3533 = 819957933 * i_69_;
					i_69_ = i_71_;
					i_70_ = aByteArray3527[i_71_];
				} else if (-1 == -1813490907 * anInt3533 && aByteArray3527[i_71_] == 125)
					anInt3533 = i_71_ * 819957933;
			}
			anInt3532 = i_69_ * -598652619;
			if (-987004643 * anInt3532 != -1)
				aByteArray3527[-987004643 * anInt3532] = (byte) 126;
		}
	}

	void method5884() {
		if (0 == -2125729363 * anInt3525) {
			anInt3532 = 598652619;
			anInt3533 = -819957933;
		} else {
			anInt3532 = 598652619;
			anInt3533 = -819957933;
			int i = 0;
			byte i_72_ = aByteArray3527[0];
			for (int i_73_ = 1; i_73_ < -2125729363 * anInt3525; i_73_++) {
				if (aByteArray3527[i_73_] > i_72_) {
					if (125 == i_72_)
						anInt3533 = 819957933 * i;
					i = i_73_;
					i_72_ = aByteArray3527[i_73_];
				} else if (-1 == -1813490907 * anInt3533 && aByteArray3527[i_73_] == 125)
					anInt3533 = i_73_ * 819957933;
			}
			anInt3532 = i * -598652619;
			if (-987004643 * anInt3532 != -1)
				aByteArray3527[-987004643 * anInt3532] = (byte) 126;
		}
	}

	void method5885(int i) {
		anInt3513 -= -845338221;
		if (anInt3513 * 836590747 == 0) {
			aLongArray3535 = null;
			aStringArray3524 = null;
		} else {
			if (aLongArray3535 != null)
				System.arraycopy(aLongArray3535, 1 + i, aLongArray3535, i, 836590747 * anInt3513 - i);
			if (null != aStringArray3524)
				System.arraycopy(aStringArray3524, 1 + i, aStringArray3524, i, 836590747 * anInt3513 - i);
		}
	}

	int method5886(int i, byte i_74_) {
		if (126 == i_74_ || 127 == i_74_)
			return -1;
		if (i == anInt3532 * -987004643 && (-1 == anInt3533 * -1813490907 || aByteArray3527[-1813490907 * anInt3533] < 125))
			return -1;
		if (i_74_ == aByteArray3527[i])
			return -1;
		aByteArray3527[i] = i_74_;
		method5883(8279239);
		return i;
	}

	public int method5887(int i, int i_75_, int i_76_, int i_77_) {
		int i_78_ = 31 == i_76_ ? -1 : (1 << i_76_ + 1) - 1;
		return (anIntArray3541[i] & i_78_) >>> i_75_;
	}

	boolean method5888(int i, String string) {
		if (string == null)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub28) {
					Class523_Sub28 class523_sub28 = (Class523_Sub28) class523;
					if (class523_sub28.anObject10554 instanceof String) {
						if (string.equals(class523_sub28.anObject10554))
							return false;
						class523_sub28.method8661(607052656);
						aClass14_3538.method738(new Class523_Sub28(string), (class523_sub28.aLong7065 * 1055205983951172633L));
						return true;
					}
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub28(string), (long) i);
		return true;
	}

	boolean method5889(int i, long l) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub7) {
					Class523_Sub7 class523_sub7 = (Class523_Sub7) class523;
					if (l == class523_sub7.aLong10404 * -2287843494007345997L)
						return false;
					class523_sub7.aLong10404 = l * 6503115775260729979L;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub7(l), (long) i);
		return true;
	}

	int method5890(int i, boolean bool) {
		if (bool == aBoolArray3523[i])
			return -1;
		aBoolArray3523[i] = bool;
		return i;
	}

	int method5891(int i, byte i_79_) {
		if (126 == i_79_ || 127 == i_79_)
			return -1;
		if (i == anInt3532 * -987004643 && (-1 == anInt3533 * -1813490907 || aByteArray3527[-1813490907 * anInt3533] < 125))
			return -1;
		if (i_79_ == aByteArray3527[i])
			return -1;
		aByteArray3527[i] = i_79_;
		method5883(-917943197);
		return i;
	}

	int method5892(int i, int i_80_, int i_81_, int i_82_) {
		int i_83_ = (1 << i_81_) - 1;
		int i_84_ = i_82_ == 31 ? -1 : (1 << 1 + i_82_) - 1;
		int i_85_ = i_84_ ^ i_83_;
		i_80_ <<= i_81_;
		i_80_ &= i_85_;
		int i_86_ = anIntArray3541[i];
		if ((i_86_ & i_85_) == i_80_)
			return -1;
		i_86_ &= i_85_ ^ 0xffffffff;
		anIntArray3541[i] = i_86_ | i_80_;
		return i;
	}

	boolean method5893(int i, int i_87_) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (-677457577 * class523_sub24.anInt10542 == i_87_)
						return false;
					class523_sub24.anInt10542 = 484092519 * i_87_;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_87_), (long) i);
		return true;
	}

	int method5894(int i, byte i_88_) {
		if (126 == i_88_ || 127 == i_88_)
			return -1;
		if (i == anInt3532 * -987004643 && (-1 == anInt3533 * -1813490907 || aByteArray3527[-1813490907 * anInt3533] < 125))
			return -1;
		if (i_88_ == aByteArray3527[i])
			return -1;
		aByteArray3527[i] = i_88_;
		method5883(-1059511318);
		return i;
	}

	boolean method5895(int i, int i_89_) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (-677457577 * class523_sub24.anInt10542 == i_89_)
						return false;
					class523_sub24.anInt10542 = 484092519 * i_89_;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_89_), (long) i);
		return true;
	}

	boolean method5896(int i, int i_90_) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (-677457577 * class523_sub24.anInt10542 == i_90_)
						return false;
					class523_sub24.anInt10542 = 484092519 * i_90_;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_90_), (long) i);
		return true;
	}

	boolean method5897(int i, int i_91_, int i_92_) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (-677457577 * class523_sub24.anInt10542 == i_91_)
						return false;
					class523_sub24.anInt10542 = 484092519 * i_91_;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_91_), (long) i);
		return true;
	}

	boolean method5898(int i, int i_93_, int i_94_, int i_95_) {
		int i_96_ = (1 << i_94_) - 1;
		int i_97_ = 31 == i_95_ ? -1 : (1 << i_95_ + 1) - 1;
		int i_98_ = i_97_ ^ i_96_;
		i_93_ <<= i_94_;
		i_93_ &= i_98_;
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (i_93_ == (class523_sub24.anInt10542 * -677457577 & i_98_))
						return false;
					Class523_Sub24 class523_sub24_99_;
					(class523_sub24_99_ = class523_sub24).anInt10542 = (484092519 * (-677457577 * class523_sub24_99_.anInt10542 & (i_98_ ^ 0xffffffff)));
					Class523_Sub24 class523_sub24_100_;
					(class523_sub24_100_ = class523_sub24).anInt10542 = (class523_sub24_100_.anInt10542 * -677457577 | i_93_) * 484092519;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_93_), (long) i);
		return true;
	}

	boolean method5899(int i, int i_101_, int i_102_, int i_103_) {
		int i_104_ = (1 << i_102_) - 1;
		int i_105_ = 31 == i_103_ ? -1 : (1 << i_103_ + 1) - 1;
		int i_106_ = i_105_ ^ i_104_;
		i_101_ <<= i_102_;
		i_101_ &= i_106_;
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (null != class523) {
				if (class523 instanceof Class523_Sub24) {
					Class523_Sub24 class523_sub24 = (Class523_Sub24) class523;
					if (i_101_ == (class523_sub24.anInt10542 * -677457577 & i_106_))
						return false;
					Class523_Sub24 class523_sub24_107_;
					(class523_sub24_107_ = class523_sub24).anInt10542 = (484092519 * (-677457577 * class523_sub24_107_.anInt10542 & (i_106_ ^ 0xffffffff)));
					Class523_Sub24 class523_sub24_108_;
					(class523_sub24_108_ = class523_sub24).anInt10542 = (class523_sub24_108_.anInt10542 * -677457577 | i_101_) * 484092519;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub24(i_101_), (long) i);
		return true;
	}

	public Class334(Class523_Sub34 class523_sub34) {
		method5871(class523_sub34, -1757325663);
	}

	void method5900(int i, byte i_109_) {
		if (i < 0 || i >= -2125729363 * anInt3525)
			throw new RuntimeException("");
		anInt3525 -= -541812187;
		anIntArray3536 = null;
		if (anInt3525 * -2125729363 == 0) {
			aLongArray3526 = null;
			aStringArray3528 = null;
			aByteArray3527 = null;
			anIntArray3541 = null;
			anIntArray3530 = null;
			aBoolArray3523 = null;
			anInt3532 = 598652619;
			anInt3533 = -819957933;
		} else {
			System.arraycopy(aByteArray3527, 1 + i, aByteArray3527, i, anInt3525 * -2125729363 - i);
			System.arraycopy(anIntArray3541, 1 + i, anIntArray3541, i, anInt3525 * -2125729363 - i);
			System.arraycopy(anIntArray3530, 1 + i, anIntArray3530, i, -2125729363 * anInt3525 - i);
			System.arraycopy(aBoolArray3523, 1 + i, aBoolArray3523, i, anInt3525 * -2125729363 - i);
			if (null != aLongArray3526)
				System.arraycopy(aLongArray3526, i + 1, aLongArray3526, i, -2125729363 * anInt3525 - i);
			if (aStringArray3528 != null)
				System.arraycopy(aStringArray3528, i + 1, aStringArray3528, i, anInt3525 * -2125729363 - i);
			method5883(-533477879);
		}
	}

	boolean method5901(int i, long l) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub7) {
					Class523_Sub7 class523_sub7 = (Class523_Sub7) class523;
					if (l == class523_sub7.aLong10404 * -2287843494007345997L)
						return false;
					class523_sub7.aLong10404 = l * 6503115775260729979L;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub7(l), (long) i);
		return true;
	}

	boolean method5902(int i, long l) {
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub7) {
					Class523_Sub7 class523_sub7 = (Class523_Sub7) class523;
					if (l == class523_sub7.aLong10404 * -2287843494007345997L)
						return false;
					class523_sub7.aLong10404 = l * 6503115775260729979L;
					return true;
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub7(l), (long) i);
		return true;
	}

	boolean method5903(int i, String string) {
		if (string == null)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (aClass14_3538 != null) {
			Class523 class523 = aClass14_3538.method741((long) i);
			if (class523 != null) {
				if (class523 instanceof Class523_Sub28) {
					Class523_Sub28 class523_sub28 = (Class523_Sub28) class523;
					if (class523_sub28.anObject10554 instanceof String) {
						if (string.equals(class523_sub28.anObject10554))
							return false;
						class523_sub28.method8661(607052656);
						aClass14_3538.method738(new Class523_Sub28(string), (class523_sub28.aLong7065 * 1055205983951172633L));
						return true;
					}
				}
				class523.method8661(607052656);
			}
		} else
			aClass14_3538 = new Class14(4);
		aClass14_3538.method738(new Class523_Sub28(string), (long) i);
		return true;
	}

	void method5904(long l, String string, int i) {
		if (string != null && string.length() == 0)
			string = null;
		if (l > 0L != aBool3514)
			throw new RuntimeException("");
		if ((null != string) != aBool3515)
			throw new RuntimeException("");
		if (l > 0L && (null == aLongArray3535 || 836590747 * anInt3513 >= aLongArray3535.length) || (null != string && (aStringArray3524 == null || anInt3513 * 836590747 >= aStringArray3524.length)))
			method5852(5 + anInt3513 * 836590747, 1506526088);
		if (null != aLongArray3535)
			aLongArray3535[836590747 * anInt3513] = l;
		if (null != aStringArray3524)
			aStringArray3524[anInt3513 * 836590747] = string;
		anInt3513 += -845338221;
	}

	void method5905(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readUnsignedByte(-1485980963);
		if (i < 1 || i > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i).toString());
		int i_110_ = class523_sub34.readUnsignedByte(625444857);
		if ((i_110_ & 0x1) != 0)
			aBool3514 = true;
		if (0 != (i_110_ & 0x2))
			aBool3515 = true;
		if (!aBool3514) {
			aLongArray3526 = null;
			aLongArray3535 = null;
		}
		if (!aBool3515) {
			aStringArray3528 = null;
			aStringArray3524 = null;
		}
		anInt3517 = class523_sub34.readUnsignedInt((byte) -105) * -490396051;
		anInt3519 = class523_sub34.readUnsignedInt((byte) -99) * -353469013;
		if (i <= 3 && 0 != -1607428861 * anInt3519)
			anInt3519 += 1371334112;
		anInt3525 = class523_sub34.readUnsignedShort(-1142174099) * -541812187;
		anInt3513 = class523_sub34.readUnsignedByte(316220459) * -845338221;
		aString3518 = class523_sub34.readString(-2081247942);
		if (i >= 4)
			class523_sub34.readUnsignedInt((byte) -77);
		aBool3520 = class523_sub34.readUnsignedByte(-1100542247) == 1;
		aByte3521 = class523_sub34.readByte((short) -27709);
		aByte3522 = class523_sub34.readByte((short) -18986);
		aByte3537 = class523_sub34.readByte((short) -21442);
		aByte3529 = class523_sub34.readByte((short) -16023);
		if (anInt3525 * -2125729363 > 0) {
			if (aBool3514 && (aLongArray3526 == null || aLongArray3526.length < -2125729363 * anInt3525))
				aLongArray3526 = new long[anInt3525 * -2125729363];
			if (aBool3515 && (null == aStringArray3528 || aStringArray3528.length < -2125729363 * anInt3525))
				aStringArray3528 = new String[-2125729363 * anInt3525];
			if (null == aByteArray3527 || aByteArray3527.length < -2125729363 * anInt3525)
				aByteArray3527 = new byte[-2125729363 * anInt3525];
			if (anIntArray3541 == null || anIntArray3541.length < anInt3525 * -2125729363)
				anIntArray3541 = new int[anInt3525 * -2125729363];
			if (null == anIntArray3530 || anIntArray3530.length < anInt3525 * -2125729363)
				anIntArray3530 = new int[-2125729363 * anInt3525];
			if (null == aBoolArray3523 || aBoolArray3523.length < -2125729363 * anInt3525)
				aBoolArray3523 = new boolean[anInt3525 * -2125729363];
			for (int i_111_ = 0; i_111_ < -2125729363 * anInt3525; i_111_++) {
				if (aBool3514)
					aLongArray3526[i_111_] = class523_sub34.readLong((byte) -91);
				if (aBool3515)
					aStringArray3528[i_111_] = class523_sub34.method16363((byte) -86);
				aByteArray3527[i_111_] = class523_sub34.readByte((short) -9174);
				if (i >= 2)
					anIntArray3541[i_111_] = class523_sub34.readUnsignedInt((byte) -56);
				if (i >= 5)
					anIntArray3530[i_111_] = class523_sub34.readUnsignedShort(-423643262);
				else
					anIntArray3530[i_111_] = 0;
				if (i >= 6)
					aBoolArray3523[i_111_] = class523_sub34.readUnsignedByte(-95667578) == 1;
				else
					aBoolArray3523[i_111_] = false;
			}
			method5883(-1748987113);
		}
		if (836590747 * anInt3513 > 0) {
			if (aBool3514 && (aLongArray3535 == null || aLongArray3535.length < anInt3513 * 836590747))
				aLongArray3535 = new long[anInt3513 * 836590747];
			if (aBool3515 && (null == aStringArray3524 || aStringArray3524.length < 836590747 * anInt3513))
				aStringArray3524 = new String[836590747 * anInt3513];
			for (int i_112_ = 0; i_112_ < anInt3513 * 836590747; i_112_++) {
				if (aBool3514)
					aLongArray3535[i_112_] = class523_sub34.readLong((byte) -53);
				if (aBool3515)
					aStringArray3524[i_112_] = class523_sub34.method16363((byte) -15);
			}
		}
		if (i >= 3) {
			int i_113_ = class523_sub34.readUnsignedShort(-658895385);
			if (i_113_ > 0) {
				aClass14_3538 = new Class14(i_113_ < 16 ? Class628.method10313(i_113_, -1148933463) : 16);
				while (i_113_-- > 0) {
					int i_114_ = class523_sub34.readUnsignedInt((byte) -111);
					int i_115_ = i_114_ & 0x3fffffff;
					int i_116_ = i_114_ >>> 30;
					if (0 == i_116_) {
						int i_117_ = class523_sub34.readUnsignedInt((byte) -6);
						aClass14_3538.method738(new Class523_Sub24(i_117_), (long) i_115_);
					} else if (i_116_ == 1) {
						long l = class523_sub34.readLong((byte) -5);
						aClass14_3538.method738(new Class523_Sub7(l), (long) i_115_);
					} else if (i_116_ == 2) {
						String string = class523_sub34.readString(-1708929012);
						aClass14_3538.method738(new Class523_Sub28(string), (long) i_115_);
					}
				}
			}
		}
	}

	public int method5906(String string, byte i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_118_ = 0; i_118_ < -2125729363 * anInt3525; i_118_++) {
			if (aStringArray3528[i_118_].equals(string))
				return i_118_;
		}
		return -1;
	}

	int method5907(int i, byte i_119_, byte i_120_) {
		if (126 == i_119_ || 127 == i_119_)
			return -1;
		if (i == anInt3532 * -987004643 && (-1 == anInt3533 * -1813490907 || aByteArray3527[-1813490907 * anInt3533] < 125))
			return -1;
		if (i_119_ == aByteArray3527[i])
			return -1;
		aByteArray3527[i] = i_119_;
		method5883(-1531928416);
		return i;
	}

	static final void method5908(Class669 class669, int i) {
		int i_121_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_121_, -2092630340);
		Class242 class242 = Class31.aClass242Array302[i_121_ >> 16];
		Class523_Sub28.method16157(class250, class242, class669, (byte) 80);
	}

	static void method5909(Class47_Sub1 class47_sub1, short i) {
		class47_sub1.method16579(0, 708160609);
		int i_122_;
		if (-518382423 * Class506.anInt5695 >= 96) {
			int i_123_ = Class216.method3851((byte) 63);
			if (i_123_ <= 104) {
				Class415.method6655(-602155973);
				i_122_ = 4;
			} else if (i_123_ <= 501) {
				Class470.method7628(189765723);
				i_122_ = 3;
			} else if (i_123_ <= 1000) {
				Class227.method4168((byte) 126);
				i_122_ = 2;
			} else {
				Class464.method7544(true, -496963114);
				i_122_ = 1;
			}
			class47_sub1.method16581(0, i_123_, -2143338350);
		} else {
			Class464.method7544(true, -496963114);
			i_122_ = 1;
			class47_sub1.method16586(64, 2139088779);
		}
		if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -86) != 0) {
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, 132058322);
			Class535.method8921(0, false, (byte) -112);
		} else
			Class449.aClass523_Sub33_4946.method16234((Class449.aClass523_Sub33_4946.aClass687_Sub1_10630), true, 1377418914);
		Class211.method3824(1068375460);
		class47_sub1.method16578(i_122_, 1900465429);
	}

	public static Interface75 method5910(Interface75[] interface75s, int i, int i_124_) {
		Interface75[] interface75s_125_ = interface75s;
		for (int i_126_ = 0; i_126_ < interface75s_125_.length; i_126_++) {
			Interface75 interface75 = interface75s_125_[i_126_];
			if (i == interface75.method82())
				return interface75;
		}
		return null;
	}

	static final void method5911(int i) {
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		Class437 class437 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5378(1068322836);
		Class77.anInt858 = -568385483 * ((int) class437.aFloat4903 - (235453015 * class592.localX << 9));
		Class285.anInt3085 = -(int) class437.aFloat4904 * 1059489463;
		Class497.anInt5563 = ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)) * -1449377339;
		Class678.anInt8639 = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5347(-990643025) * 2607.5945876176133) & 0x3fff) * 1767382019;
		Class424.anInt4817 = ((int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1370218487) * 2607.5945876176133) & 0x3fff) * -1709276499;
		Class248.anInt2491 = 0;
	}

	public static void method5912(int i) {
		Class617.aClass14_8042 = new Class14(8);
		Class617.anInt8053 = 0;
		Iterator iterator = Class617.aList8045.iterator();
		while (iterator.hasNext()) {
			Class621 class621 = (Class621) iterator.next();
			class621.method10124();
		}
	}
}
