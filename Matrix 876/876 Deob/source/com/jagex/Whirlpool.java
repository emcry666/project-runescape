/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Whirlpool {
	int anInt216;
	public static final int anInt217 = 64;
	long[] aLongArray218;
	static final String aString219 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	static final int anInt220 = 512;
	int anInt221;
	byte[] aByteArray222 = new byte[32];
	byte[] aByteArray223 = new byte[64];
	static final int anInt224 = 10;
	static long[][] aLongArrayArray225 = new long[8][256];
	static long[] aLongArray226 = new long[11];
	long[] aLongArray227;
	long[] aLongArray228;
	long[] aLongArray229;
	long[] aLongArray230;
	static int anInt231;

	public static byte[] method819(byte[] is, int i, int i_0_) {
		byte[] is_1_;
		if (i > 0) {
			is_1_ = new byte[i_0_];
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
				is_1_[i_2_] = is[i + i_2_];
		} else
			is_1_ = is;
		Whirlpool class22 = new Whirlpool();
		class22.NESSIEinit(1124655573);
		class22.NESSIEadd(is_1_, (long) (8 * i_0_));
		byte[] is_3_ = new byte[64];
		class22.NESSIEfinalize(is_3_, 0, -1514814709);
		return is_3_;
	}

	void method820(int i) {
		int i_4_ = 0;
		int i_5_ = 0;
		while (i_4_ < 8) {
			aLongArray229[i_4_] = ((long) aByteArray223[i_5_] << 56 ^ ((long) aByteArray223[i_5_ + 1] & 0xffL) << 48 ^ ((long) aByteArray223[2 + i_5_] & 0xffL) << 40 ^ ((long) aByteArray223[3 + i_5_] & 0xffL) << 32 ^ ((long) aByteArray223[i_5_ + 4] & 0xffL) << 24 ^ ((long) aByteArray223[5 + i_5_] & 0xffL) << 16 ^ ((long) aByteArray223[6 + i_5_] & 0xffL) << 8 ^ (long) aByteArray223[7 + i_5_] & 0xffL);
			i_4_++;
			i_5_ += 8;
		}
		for (i_4_ = 0; i_4_ < 8; i_4_++)
			aLongArray230[i_4_] = aLongArray229[i_4_] ^ (aLongArray218[i_4_] = aLongArray227[i_4_]);
		for (i_4_ = 1; i_4_ <= 10; i_4_++) {
			for (i_5_ = 0; i_5_ < 8; i_5_++) {
				aLongArray228[i_5_] = 0L;
				int i_6_ = 0;
				int i_7_ = 56;
				while (i_6_ < 8) {
					aLongArray228[i_5_] ^= (aLongArrayArray225[i_6_][((int) (aLongArray218[i_5_ - i_6_ & 0x7] >>> i_7_) & 0xff)]);
					i_6_++;
					i_7_ -= 8;
				}
			}
			for (i_5_ = 0; i_5_ < 8; i_5_++)
				aLongArray218[i_5_] = aLongArray228[i_5_];
			aLongArray218[0] ^= aLongArray226[i_4_];
			for (i_5_ = 0; i_5_ < 8; i_5_++) {
				aLongArray228[i_5_] = aLongArray218[i_5_];
				int i_8_ = 0;
				int i_9_ = 56;
				while (i_8_ < 8) {
					aLongArray228[i_5_] ^= (aLongArrayArray225[i_8_][((int) (aLongArray230[i_5_ - i_8_ & 0x7] >>> i_9_) & 0xff)]);
					i_8_++;
					i_9_ -= 8;
				}
			}
			for (i_5_ = 0; i_5_ < 8; i_5_++)
				aLongArray230[i_5_] = aLongArray228[i_5_];
		}
		for (i_4_ = 0; i_4_ < 8; i_4_++)
			aLongArray227[i_4_] ^= aLongArray230[i_4_] ^ aLongArray229[i_4_];
	}

	void NESSIEinit(int i) {
		for (int i_10_ = 0; i_10_ < 32; i_10_++)
			aByteArray222[i_10_] = (byte) 0;
		anInt221 = 0;
		anInt216 = 0;
		aByteArray223[0] = (byte) 0;
		for (int i_11_ = 0; i_11_ < 8; i_11_++)
			aLongArray227[i_11_] = 0L;
	}

	void NESSIEadd(byte[] is, long l) {
		int i = 0;
		int i_12_ = 8 - ((int) l & 0x7) & 0x7;
		int i_13_ = 531722517 * anInt216 & 0x7;
		long l_14_ = l;
		int i_15_ = 31;
		int i_16_ = 0;
		for (/**/; i_15_ >= 0; i_15_--) {
			i_16_ += ((int) l_14_ & 0xff) + (aByteArray222[i_15_] & 0xff);
			aByteArray222[i_15_] = (byte) i_16_;
			i_16_ >>>= 8;
			l_14_ >>>= 8;
		}
		while (l > 8L) {
			int i_17_ = is[i] << i_12_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_12_;
			if (i_17_ < 0 || i_17_ >= 256)
				throw new RuntimeException();
			aByteArray223[-675813171 * anInt221] |= i_17_ >>> i_13_;
			anInt221 += 1977238533;
			anInt216 += -57715139 * (8 - i_13_);
			if (531722517 * anInt216 == 512) {
				method820(127817484);
				anInt221 = 0;
				anInt216 = 0;
			}
			aByteArray223[anInt221 * -675813171] = (byte) (i_17_ << 8 - i_13_ & 0xff);
			anInt216 += i_13_ * -57715139;
			l -= 8L;
			i++;
		}
		int i_18_;
		if (l > 0L) {
			i_18_ = is[i] << i_12_ & 0xff;
			aByteArray223[-675813171 * anInt221] |= i_18_ >>> i_13_;
		} else
			i_18_ = 0;
		if (l + (long) i_13_ < 8L)
			anInt216 += -57715139L * l;
		else {
			anInt221 += 1977238533;
			anInt216 += -57715139 * (8 - i_13_);
			l -= (long) (8 - i_13_);
			if (512 == 531722517 * anInt216) {
				method820(-739690289);
				anInt221 = 0;
				anInt216 = 0;
			}
			aByteArray223[anInt221 * -675813171] = (byte) (i_18_ << 8 - i_13_ & 0xff);
			anInt216 += (int) l * -57715139;
		}
	}

	void NESSIEfinalize(byte[] is, int i, int i_19_) {
		aByteArray223[-675813171 * anInt221] |= 128 >>> (531722517 * anInt216 & 0x7);
		anInt221 += 1977238533;
		if (-675813171 * anInt221 > 32) {
			while (anInt221 * -675813171 < 64)
				aByteArray223[(anInt221 += 1977238533) * -675813171 - 1] = (byte) 0;
			method820(1979938790);
			anInt221 = 0;
		}
		while (-675813171 * anInt221 < 32)
			aByteArray223[(anInt221 += 1977238533) * -675813171 - 1] = (byte) 0;
		System.arraycopy(aByteArray222, 0, aByteArray223, 32, 32);
		method820(16011678);
		int i_20_ = 0;
		int i_21_ = i;
		while (i_20_ < 8) {
			long l = aLongArray227[i_20_];
			is[i_21_] = (byte) (int) (l >>> 56);
			is[1 + i_21_] = (byte) (int) (l >>> 48);
			is[i_21_ + 2] = (byte) (int) (l >>> 40);
			is[3 + i_21_] = (byte) (int) (l >>> 32);
			is[4 + i_21_] = (byte) (int) (l >>> 24);
			is[5 + i_21_] = (byte) (int) (l >>> 16);
			is[6 + i_21_] = (byte) (int) (l >>> 8);
			is[7 + i_21_] = (byte) (int) l;
			i_20_++;
			i_21_ += 8;
		}
	}

	void method824() {
		for (int i = 0; i < 32; i++)
			aByteArray222[i] = (byte) 0;
		anInt221 = 0;
		anInt216 = 0;
		aByteArray223[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray227[i] = 0L;
	}

	void method825() {
		for (int i = 0; i < 32; i++)
			aByteArray222[i] = (byte) 0;
		anInt221 = 0;
		anInt216 = 0;
		aByteArray223[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray227[i] = 0L;
	}

	void method826() {
		int i = 0;
		int i_22_ = 0;
		while (i < 8) {
			aLongArray229[i] = ((long) aByteArray223[i_22_] << 56 ^ ((long) aByteArray223[i_22_ + 1] & 0xffL) << 48 ^ ((long) aByteArray223[2 + i_22_] & 0xffL) << 40 ^ ((long) aByteArray223[3 + i_22_] & 0xffL) << 32 ^ ((long) aByteArray223[i_22_ + 4] & 0xffL) << 24 ^ ((long) aByteArray223[5 + i_22_] & 0xffL) << 16 ^ ((long) aByteArray223[6 + i_22_] & 0xffL) << 8 ^ (long) aByteArray223[7 + i_22_] & 0xffL);
			i++;
			i_22_ += 8;
		}
		for (i = 0; i < 8; i++)
			aLongArray230[i] = aLongArray229[i] ^ (aLongArray218[i] = aLongArray227[i]);
		for (i = 1; i <= 10; i++) {
			for (i_22_ = 0; i_22_ < 8; i_22_++) {
				aLongArray228[i_22_] = 0L;
				int i_23_ = 0;
				int i_24_ = 56;
				while (i_23_ < 8) {
					aLongArray228[i_22_] ^= (aLongArrayArray225[i_23_][(int) (aLongArray218[i_22_ - i_23_ & 0x7] >>> i_24_) & 0xff]);
					i_23_++;
					i_24_ -= 8;
				}
			}
			for (i_22_ = 0; i_22_ < 8; i_22_++)
				aLongArray218[i_22_] = aLongArray228[i_22_];
			aLongArray218[0] ^= aLongArray226[i];
			for (i_22_ = 0; i_22_ < 8; i_22_++) {
				aLongArray228[i_22_] = aLongArray218[i_22_];
				int i_25_ = 0;
				int i_26_ = 56;
				while (i_25_ < 8) {
					aLongArray228[i_22_] ^= (aLongArrayArray225[i_25_][(int) (aLongArray230[i_22_ - i_25_ & 0x7] >>> i_26_) & 0xff]);
					i_25_++;
					i_26_ -= 8;
				}
			}
			for (i_22_ = 0; i_22_ < 8; i_22_++)
				aLongArray230[i_22_] = aLongArray228[i_22_];
		}
		for (i = 0; i < 8; i++)
			aLongArray227[i] ^= aLongArray230[i] ^ aLongArray229[i];
	}

	void method827(byte[] is, long l) {
		int i = 0;
		int i_27_ = 8 - ((int) l & 0x7) & 0x7;
		int i_28_ = 531722517 * anInt216 & 0x7;
		long l_29_ = l;
		int i_30_ = 31;
		int i_31_ = 0;
		for (/**/; i_30_ >= 0; i_30_--) {
			i_31_ += ((int) l_29_ & 0xff) + (aByteArray222[i_30_] & 0xff);
			aByteArray222[i_30_] = (byte) i_31_;
			i_31_ >>>= 8;
			l_29_ >>>= 8;
		}
		while (l > 8L) {
			int i_32_ = is[i] << i_27_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_27_;
			if (i_32_ < 0 || i_32_ >= 256)
				throw new RuntimeException();
			aByteArray223[-675813171 * anInt221] |= i_32_ >>> i_28_;
			anInt221 += 1977238533;
			anInt216 += -57715139 * (8 - i_28_);
			if (531722517 * anInt216 == 512) {
				method820(620179435);
				anInt221 = 0;
				anInt216 = 0;
			}
			aByteArray223[anInt221 * -675813171] = (byte) (i_32_ << 8 - i_28_ & 0xff);
			anInt216 += i_28_ * -57715139;
			l -= 8L;
			i++;
		}
		int i_33_;
		if (l > 0L) {
			i_33_ = is[i] << i_27_ & 0xff;
			aByteArray223[-675813171 * anInt221] |= i_33_ >>> i_28_;
		} else
			i_33_ = 0;
		if (l + (long) i_28_ < 8L)
			anInt216 += -57715139L * l;
		else {
			anInt221 += 1977238533;
			anInt216 += -57715139 * (8 - i_28_);
			l -= (long) (8 - i_28_);
			if (512 == 531722517 * anInt216) {
				method820(-465175368);
				anInt221 = 0;
				anInt216 = 0;
			}
			aByteArray223[anInt221 * -675813171] = (byte) (i_33_ << 8 - i_28_ & 0xff);
			anInt216 += (int) l * -57715139;
		}
	}

	void method828() {
		for (int i = 0; i < 32; i++)
			aByteArray222[i] = (byte) 0;
		anInt221 = 0;
		anInt216 = 0;
		aByteArray223[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray227[i] = 0L;
	}

	void method829() {
		int i = 0;
		int i_34_ = 0;
		while (i < 8) {
			aLongArray229[i] = ((long) aByteArray223[i_34_] << 56 ^ ((long) aByteArray223[i_34_ + 1] & 0xffL) << 48 ^ ((long) aByteArray223[2 + i_34_] & 0xffL) << 40 ^ ((long) aByteArray223[3 + i_34_] & 0xffL) << 32 ^ ((long) aByteArray223[i_34_ + 4] & 0xffL) << 24 ^ ((long) aByteArray223[5 + i_34_] & 0xffL) << 16 ^ ((long) aByteArray223[6 + i_34_] & 0xffL) << 8 ^ (long) aByteArray223[7 + i_34_] & 0xffL);
			i++;
			i_34_ += 8;
		}
		for (i = 0; i < 8; i++)
			aLongArray230[i] = aLongArray229[i] ^ (aLongArray218[i] = aLongArray227[i]);
		for (i = 1; i <= 10; i++) {
			for (i_34_ = 0; i_34_ < 8; i_34_++) {
				aLongArray228[i_34_] = 0L;
				int i_35_ = 0;
				int i_36_ = 56;
				while (i_35_ < 8) {
					aLongArray228[i_34_] ^= (aLongArrayArray225[i_35_][(int) (aLongArray218[i_34_ - i_35_ & 0x7] >>> i_36_) & 0xff]);
					i_35_++;
					i_36_ -= 8;
				}
			}
			for (i_34_ = 0; i_34_ < 8; i_34_++)
				aLongArray218[i_34_] = aLongArray228[i_34_];
			aLongArray218[0] ^= aLongArray226[i];
			for (i_34_ = 0; i_34_ < 8; i_34_++) {
				aLongArray228[i_34_] = aLongArray218[i_34_];
				int i_37_ = 0;
				int i_38_ = 56;
				while (i_37_ < 8) {
					aLongArray228[i_34_] ^= (aLongArrayArray225[i_37_][(int) (aLongArray230[i_34_ - i_37_ & 0x7] >>> i_38_) & 0xff]);
					i_37_++;
					i_38_ -= 8;
				}
			}
			for (i_34_ = 0; i_34_ < 8; i_34_++)
				aLongArray230[i_34_] = aLongArray228[i_34_];
		}
		for (i = 0; i < 8; i++)
			aLongArray227[i] ^= aLongArray230[i] ^ aLongArray229[i];
	}

	Whirlpool() {
		anInt216 = 0;
		anInt221 = 0;
		aLongArray227 = new long[8];
		aLongArray218 = new long[8];
		aLongArray228 = new long[8];
		aLongArray229 = new long[8];
		aLongArray230 = new long[8];
	}

	void method830(byte[] is, long l) {
		int i = 0;
		int i_39_ = 8 - ((int) l & 0x7) & 0x7;
		int i_40_ = 531722517 * anInt216 & 0x7;
		long l_41_ = l;
		int i_42_ = 31;
		int i_43_ = 0;
		for (/**/; i_42_ >= 0; i_42_--) {
			i_43_ += ((int) l_41_ & 0xff) + (aByteArray222[i_42_] & 0xff);
			aByteArray222[i_42_] = (byte) i_43_;
			i_43_ >>>= 8;
			l_41_ >>>= 8;
		}
		while (l > 8L) {
			int i_44_ = is[i] << i_39_ & 0xff | (is[i + 1] & 0xff) >>> 8 - i_39_;
			if (i_44_ < 0 || i_44_ >= 256)
				throw new RuntimeException();
			aByteArray223[-675813171 * anInt221] |= i_44_ >>> i_40_;
			anInt221 += 1977238533;
			anInt216 += -57715139 * (8 - i_40_);
			if (531722517 * anInt216 == 512) {
				method820(-88114071);
				anInt221 = 0;
				anInt216 = 0;
			}
			aByteArray223[anInt221 * -675813171] = (byte) (i_44_ << 8 - i_40_ & 0xff);
			anInt216 += i_40_ * -57715139;
			l -= 8L;
			i++;
		}
		int i_45_;
		if (l > 0L) {
			i_45_ = is[i] << i_39_ & 0xff;
			aByteArray223[-675813171 * anInt221] |= i_45_ >>> i_40_;
		} else
			i_45_ = 0;
		if (l + (long) i_40_ < 8L)
			anInt216 += -57715139L * l;
		else {
			anInt221 += 1977238533;
			anInt216 += -57715139 * (8 - i_40_);
			l -= (long) (8 - i_40_);
			if (512 == 531722517 * anInt216) {
				method820(1150306142);
				anInt221 = 0;
				anInt216 = 0;
			}
			aByteArray223[anInt221 * -675813171] = (byte) (i_45_ << 8 - i_40_ & 0xff);
			anInt216 += (int) l * -57715139;
		}
	}

	void method831(byte[] is, int i) {
		aByteArray223[-675813171 * anInt221] |= 128 >>> (531722517 * anInt216 & 0x7);
		anInt221 += 1977238533;
		if (-675813171 * anInt221 > 32) {
			while (anInt221 * -675813171 < 64)
				aByteArray223[(anInt221 += 1977238533) * -675813171 - 1] = (byte) 0;
			method820(1118028952);
			anInt221 = 0;
		}
		while (-675813171 * anInt221 < 32)
			aByteArray223[(anInt221 += 1977238533) * -675813171 - 1] = (byte) 0;
		System.arraycopy(aByteArray222, 0, aByteArray223, 32, 32);
		method820(-258060597);
		int i_46_ = 0;
		int i_47_ = i;
		while (i_46_ < 8) {
			long l = aLongArray227[i_46_];
			is[i_47_] = (byte) (int) (l >>> 56);
			is[1 + i_47_] = (byte) (int) (l >>> 48);
			is[i_47_ + 2] = (byte) (int) (l >>> 40);
			is[3 + i_47_] = (byte) (int) (l >>> 32);
			is[4 + i_47_] = (byte) (int) (l >>> 24);
			is[5 + i_47_] = (byte) (int) (l >>> 16);
			is[6 + i_47_] = (byte) (int) (l >>> 8);
			is[7 + i_47_] = (byte) (int) l;
			i_46_++;
			i_47_ += 8;
		}
	}

	void method832(byte[] is, int i) {
		aByteArray223[-675813171 * anInt221] |= 128 >>> (531722517 * anInt216 & 0x7);
		anInt221 += 1977238533;
		if (-675813171 * anInt221 > 32) {
			while (anInt221 * -675813171 < 64)
				aByteArray223[(anInt221 += 1977238533) * -675813171 - 1] = (byte) 0;
			method820(-875199911);
			anInt221 = 0;
		}
		while (-675813171 * anInt221 < 32)
			aByteArray223[(anInt221 += 1977238533) * -675813171 - 1] = (byte) 0;
		System.arraycopy(aByteArray222, 0, aByteArray223, 32, 32);
		method820(1079792884);
		int i_48_ = 0;
		int i_49_ = i;
		while (i_48_ < 8) {
			long l = aLongArray227[i_48_];
			is[i_49_] = (byte) (int) (l >>> 56);
			is[1 + i_49_] = (byte) (int) (l >>> 48);
			is[i_49_ + 2] = (byte) (int) (l >>> 40);
			is[3 + i_49_] = (byte) (int) (l >>> 32);
			is[4 + i_49_] = (byte) (int) (l >>> 24);
			is[5 + i_49_] = (byte) (int) (l >>> 16);
			is[6 + i_49_] = (byte) (int) (l >>> 8);
			is[7 + i_49_] = (byte) (int) l;
			i_48_++;
			i_49_ += 8;
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_50_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
			long l = (0 == (i & 0x1) ? (long) (i_50_ >>> 8) : (long) (i_50_ & 0xff));
			long l_51_ = l << 1;
			if (l_51_ >= 256L)
				l_51_ ^= 0x11dL;
			long l_52_ = l_51_ << 1;
			if (l_52_ >= 256L)
				l_52_ ^= 0x11dL;
			long l_53_ = l_52_ ^ l;
			long l_54_ = l_52_ << 1;
			if (l_54_ >= 256L)
				l_54_ ^= 0x11dL;
			long l_55_ = l_54_ ^ l;
			aLongArrayArray225[0][i] = (l << 56 | l << 48 | l_52_ << 40 | l << 32 | l_54_ << 24 | l_53_ << 16 | l_51_ << 8 | l_55_);
			for (int i_56_ = 1; i_56_ < 8; i_56_++)
				aLongArrayArray225[i_56_][i] = (aLongArrayArray225[i_56_ - 1][i] >>> 8 | aLongArrayArray225[i_56_ - 1][i] << 56);
		}
		aLongArray226[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_57_ = 8 * (i - 1);
			aLongArray226[i] = (aLongArrayArray225[0][i_57_] & ~0xffffffffffffffL ^ aLongArrayArray225[1][i_57_ + 1] & 0xff000000000000L ^ aLongArrayArray225[2][i_57_ + 2] & 0xff0000000000L ^ aLongArrayArray225[3][3 + i_57_] & 0xff00000000L ^ aLongArrayArray225[4][i_57_ + 4] & 0xff000000L ^ aLongArrayArray225[5][5 + i_57_] & 0xff0000L ^ aLongArrayArray225[6][6 + i_57_] & 0xff00L ^ aLongArrayArray225[7][i_57_ + 7] & 0xffL);
		}
	}
}
