/* Class523_Sub27_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub4_Sub1 extends Class523_Sub27_Sub4 {
	int anInt12050;
	byte[] aByteArray12051;
	int anInt12052;
	int anInt12053;
	int anInt12054;
	static final int anInt12055 = 16;

	void method18494() {
		int i = -1;
		int i_0_ = aByteArray12051.length - 8;
		while (i < i_0_) {
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
		}
		while (i < aByteArray12051.length - 1)
			aByteArray12051[++i] = (byte) 0;
	}

	void method18495() {
		int i = -1;
		int i_1_ = aByteArray12051.length - 8;
		while (i < i_1_) {
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
			aByteArray12051[++i] = (byte) 0;
		}
		while (i < aByteArray12051.length - 1)
			aByteArray12051[++i] = (byte) 0;
	}

	boolean method18496(int i, int i_2_) {
		return aByteArray12051.length >= i * i_2_;
	}

	void method18497(int i, int i_3_, int i_4_, int i_5_) {
		anInt12053 = i;
		anInt12054 = i_3_;
		anInt12050 = i_4_ - i;
		anInt12052 = i_5_ - i_3_;
	}

	void method18498(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = 0;
		if (i_6_ != i)
			i_11_ = (i_9_ - i_8_ << 16) / (i_6_ - i);
		int i_12_ = 0;
		if (i_7_ != i_6_)
			i_12_ = (i_10_ - i_9_ << 16) / (i_7_ - i_6_);
		int i_13_ = 0;
		if (i_7_ != i)
			i_13_ = (i_8_ - i_10_ << 16) / (i - i_7_);
		if (i <= i_6_ && i <= i_7_) {
			if (i_6_ < i_7_) {
				i_10_ = i_8_ <<= 16;
				if (i < 0) {
					i_10_ -= i_13_ * i;
					i_8_ -= i_11_ * i;
					i = 0;
				}
				i_9_ <<= 16;
				if (i_6_ < 0) {
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				if (i != i_6_ && i_13_ < i_11_ || i == i_6_ && i_13_ > i_12_) {
					i_7_ -= i_6_;
					i_6_ -= i;
					i *= anInt12050;
					while (--i_6_ >= 0) {
						method18499(aByteArray12051, i, 0, i_10_ >> 16, i_8_ >> 16);
						i_10_ += i_13_;
						i_8_ += i_11_;
						i += anInt12050;
					}
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_13_;
						i_9_ += i_12_;
						i += anInt12050;
					}
				} else {
					i_7_ -= i_6_;
					i_6_ -= i;
					i *= anInt12050;
					while (--i_6_ >= 0) {
						method18499(aByteArray12051, i, 0, i_8_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_8_ += i_11_;
						i += anInt12050;
					}
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_9_ += i_12_;
						i += anInt12050;
					}
				}
			} else {
				i_9_ = i_8_ <<= 16;
				if (i < 0) {
					i_9_ -= i_13_ * i;
					i_8_ -= i_11_ * i;
					i = 0;
				}
				i_10_ <<= 16;
				if (i_7_ < 0) {
					i_10_ -= i_12_ * i_7_;
					i_7_ = 0;
				}
				if (i != i_7_ && i_13_ < i_11_ || i == i_7_ && i_12_ > i_11_) {
					i_6_ -= i_7_;
					i_7_ -= i;
					i *= anInt12050;
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i, 0, i_9_ >> 16, i_8_ >> 16);
						i_9_ += i_13_;
						i_8_ += i_11_;
						i += anInt12050;
					}
					while (--i_6_ >= 0) {
						method18499(aByteArray12051, i, 0, i_10_ >> 16, i_8_ >> 16);
						i_10_ += i_12_;
						i_8_ += i_11_;
						i += anInt12050;
					}
				} else {
					i_6_ -= i_7_;
					i_7_ -= i;
					i *= anInt12050;
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i, 0, i_8_ >> 16, i_9_ >> 16);
						i_9_ += i_13_;
						i_8_ += i_11_;
						i += anInt12050;
					}
					while (--i_6_ >= 0) {
						method18499(aByteArray12051, i, 0, i_8_ >> 16, i_10_ >> 16);
						i_10_ += i_12_;
						i_8_ += i_11_;
						i += anInt12050;
					}
				}
			}
		} else if (i_6_ <= i_7_) {
			if (i_7_ < i) {
				i_8_ = i_9_ <<= 16;
				if (i_6_ < 0) {
					i_8_ -= i_11_ * i_6_;
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				i_10_ <<= 16;
				if (i_7_ < 0) {
					i_10_ -= i_13_ * i_7_;
					i_7_ = 0;
				}
				if (i_6_ != i_7_ && i_11_ < i_12_ || i_6_ == i_7_ && i_11_ > i_13_) {
					i -= i_7_;
					i_7_ -= i_6_;
					i_6_ *= anInt12050;
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_8_ >> 16, i_9_ >> 16);
						i_8_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12050;
					}
					while (--i >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_8_ >> 16, i_10_ >> 16);
						i_8_ += i_11_;
						i_10_ += i_13_;
						i_6_ += anInt12050;
					}
				} else {
					i -= i_7_;
					i_7_ -= i_6_;
					i_6_ *= anInt12050;
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_9_ >> 16, i_8_ >> 16);
						i_8_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12050;
					}
					while (--i >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_10_ >> 16, i_8_ >> 16);
						i_8_ += i_11_;
						i_10_ += i_13_;
						i_6_ += anInt12050;
					}
				}
			} else {
				i_10_ = i_9_ <<= 16;
				if (i_6_ < 0) {
					i_10_ -= i_11_ * i_6_;
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				i_8_ <<= 16;
				if (i < 0) {
					i_8_ -= i_13_ * i;
					i = 0;
				}
				if (i_11_ < i_12_) {
					i_7_ -= i;
					i -= i_6_;
					i_6_ *= anInt12050;
					while (--i >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12050;
					}
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_8_ >> 16, i_9_ >> 16);
						i_8_ += i_13_;
						i_9_ += i_12_;
						i_6_ += anInt12050;
					}
				} else {
					i_7_ -= i;
					i -= i_6_;
					i_6_ *= anInt12050;
					while (--i >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12050;
					}
					while (--i_7_ >= 0) {
						method18499(aByteArray12051, i_6_, 0, i_9_ >> 16, i_8_ >> 16);
						i_8_ += i_13_;
						i_9_ += i_12_;
						i_6_ += anInt12050;
					}
				}
			}
		} else if (i < i_6_) {
			i_9_ = i_10_ <<= 16;
			if (i_7_ < 0) {
				i_9_ -= i_12_ * i_7_;
				i_10_ -= i_13_ * i_7_;
				i_7_ = 0;
			}
			i_8_ <<= 16;
			if (i < 0) {
				i_8_ -= i_11_ * i;
				i = 0;
			}
			if (i_12_ < i_13_) {
				i_6_ -= i;
				i -= i_7_;
				i_7_ *= anInt12050;
				while (--i >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_9_ >> 16, i_10_ >> 16);
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12050;
				}
				while (--i_6_ >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_9_ >> 16, i_8_ >> 16);
					i_9_ += i_12_;
					i_8_ += i_11_;
					i_7_ += anInt12050;
				}
			} else {
				i_6_ -= i;
				i -= i_7_;
				i_7_ *= anInt12050;
				while (--i >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_10_ >> 16, i_9_ >> 16);
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12050;
				}
				while (--i_6_ >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_8_ >> 16, i_9_ >> 16);
					i_9_ += i_12_;
					i_8_ += i_11_;
					i_7_ += anInt12050;
				}
			}
		} else {
			i_8_ = i_10_ <<= 16;
			if (i_7_ < 0) {
				i_8_ -= i_12_ * i_7_;
				i_10_ -= i_13_ * i_7_;
				i_7_ = 0;
			}
			i_9_ <<= 16;
			if (i_6_ < 0) {
				i_9_ -= i_11_ * i_6_;
				i_6_ = 0;
			}
			if (i_12_ < i_13_) {
				i -= i_6_;
				i_6_ -= i_7_;
				i_7_ *= anInt12050;
				while (--i_6_ >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_8_ >> 16, i_10_ >> 16);
					i_8_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12050;
				}
				while (--i >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_9_ >> 16, i_10_ >> 16);
					i_9_ += i_11_;
					i_10_ += i_13_;
					i_7_ += anInt12050;
				}
			} else {
				i -= i_6_;
				i_6_ -= i_7_;
				i_7_ *= anInt12050;
				while (--i_6_ >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_10_ >> 16, i_8_ >> 16);
					i_8_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12050;
				}
				while (--i >= 0) {
					method18499(aByteArray12051, i_7_, 0, i_10_ >> 16, i_9_ >> 16);
					i_9_ += i_11_;
					i_10_ += i_13_;
					i_7_ += anInt12050;
				}
			}
		}
	}

	static final void method18499(byte[] is, int i, int i_14_, int i_15_, int i_16_) {
		if (i_15_ < i_16_) {
			i += i_15_;
			i_14_ = i_16_ - i_15_ >> 2;
			while (--i_14_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_14_ = i_16_ - i_15_ & 0x3;
			while (--i_14_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method18500(int i, int i_17_, int i_18_, int i_19_) {
		anInt12053 = i;
		anInt12054 = i_17_;
		anInt12050 = i_18_ - i;
		anInt12052 = i_19_ - i_17_;
	}

	void method18501(int i, int i_20_, int i_21_, int i_22_) {
		anInt12053 = i;
		anInt12054 = i_20_;
		anInt12050 = i_21_ - i;
		anInt12052 = i_22_ - i_20_;
	}

	boolean method18502(int i, int i_23_) {
		return aByteArray12051.length >= i * i_23_;
	}

	void method18503(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		int i_29_ = 0;
		if (i_24_ != i)
			i_29_ = (i_27_ - i_26_ << 16) / (i_24_ - i);
		int i_30_ = 0;
		if (i_25_ != i_24_)
			i_30_ = (i_28_ - i_27_ << 16) / (i_25_ - i_24_);
		int i_31_ = 0;
		if (i_25_ != i)
			i_31_ = (i_26_ - i_28_ << 16) / (i - i_25_);
		if (i <= i_24_ && i <= i_25_) {
			if (i_24_ < i_25_) {
				i_28_ = i_26_ <<= 16;
				if (i < 0) {
					i_28_ -= i_31_ * i;
					i_26_ -= i_29_ * i;
					i = 0;
				}
				i_27_ <<= 16;
				if (i_24_ < 0) {
					i_27_ -= i_30_ * i_24_;
					i_24_ = 0;
				}
				if (i != i_24_ && i_31_ < i_29_ || i == i_24_ && i_31_ > i_30_) {
					i_25_ -= i_24_;
					i_24_ -= i;
					i *= anInt12050;
					while (--i_24_ >= 0) {
						method18499(aByteArray12051, i, 0, i_28_ >> 16, i_26_ >> 16);
						i_28_ += i_31_;
						i_26_ += i_29_;
						i += anInt12050;
					}
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i, 0, i_28_ >> 16, i_27_ >> 16);
						i_28_ += i_31_;
						i_27_ += i_30_;
						i += anInt12050;
					}
				} else {
					i_25_ -= i_24_;
					i_24_ -= i;
					i *= anInt12050;
					while (--i_24_ >= 0) {
						method18499(aByteArray12051, i, 0, i_26_ >> 16, i_28_ >> 16);
						i_28_ += i_31_;
						i_26_ += i_29_;
						i += anInt12050;
					}
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i, 0, i_27_ >> 16, i_28_ >> 16);
						i_28_ += i_31_;
						i_27_ += i_30_;
						i += anInt12050;
					}
				}
			} else {
				i_27_ = i_26_ <<= 16;
				if (i < 0) {
					i_27_ -= i_31_ * i;
					i_26_ -= i_29_ * i;
					i = 0;
				}
				i_28_ <<= 16;
				if (i_25_ < 0) {
					i_28_ -= i_30_ * i_25_;
					i_25_ = 0;
				}
				if (i != i_25_ && i_31_ < i_29_ || i == i_25_ && i_30_ > i_29_) {
					i_24_ -= i_25_;
					i_25_ -= i;
					i *= anInt12050;
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i, 0, i_27_ >> 16, i_26_ >> 16);
						i_27_ += i_31_;
						i_26_ += i_29_;
						i += anInt12050;
					}
					while (--i_24_ >= 0) {
						method18499(aByteArray12051, i, 0, i_28_ >> 16, i_26_ >> 16);
						i_28_ += i_30_;
						i_26_ += i_29_;
						i += anInt12050;
					}
				} else {
					i_24_ -= i_25_;
					i_25_ -= i;
					i *= anInt12050;
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i, 0, i_26_ >> 16, i_27_ >> 16);
						i_27_ += i_31_;
						i_26_ += i_29_;
						i += anInt12050;
					}
					while (--i_24_ >= 0) {
						method18499(aByteArray12051, i, 0, i_26_ >> 16, i_28_ >> 16);
						i_28_ += i_30_;
						i_26_ += i_29_;
						i += anInt12050;
					}
				}
			}
		} else if (i_24_ <= i_25_) {
			if (i_25_ < i) {
				i_26_ = i_27_ <<= 16;
				if (i_24_ < 0) {
					i_26_ -= i_29_ * i_24_;
					i_27_ -= i_30_ * i_24_;
					i_24_ = 0;
				}
				i_28_ <<= 16;
				if (i_25_ < 0) {
					i_28_ -= i_31_ * i_25_;
					i_25_ = 0;
				}
				if (i_24_ != i_25_ && i_29_ < i_30_ || i_24_ == i_25_ && i_29_ > i_31_) {
					i -= i_25_;
					i_25_ -= i_24_;
					i_24_ *= anInt12050;
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_26_ >> 16, i_27_ >> 16);
						i_26_ += i_29_;
						i_27_ += i_30_;
						i_24_ += anInt12050;
					}
					while (--i >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_26_ >> 16, i_28_ >> 16);
						i_26_ += i_29_;
						i_28_ += i_31_;
						i_24_ += anInt12050;
					}
				} else {
					i -= i_25_;
					i_25_ -= i_24_;
					i_24_ *= anInt12050;
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_27_ >> 16, i_26_ >> 16);
						i_26_ += i_29_;
						i_27_ += i_30_;
						i_24_ += anInt12050;
					}
					while (--i >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_28_ >> 16, i_26_ >> 16);
						i_26_ += i_29_;
						i_28_ += i_31_;
						i_24_ += anInt12050;
					}
				}
			} else {
				i_28_ = i_27_ <<= 16;
				if (i_24_ < 0) {
					i_28_ -= i_29_ * i_24_;
					i_27_ -= i_30_ * i_24_;
					i_24_ = 0;
				}
				i_26_ <<= 16;
				if (i < 0) {
					i_26_ -= i_31_ * i;
					i = 0;
				}
				if (i_29_ < i_30_) {
					i_25_ -= i;
					i -= i_24_;
					i_24_ *= anInt12050;
					while (--i >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_28_ >> 16, i_27_ >> 16);
						i_28_ += i_29_;
						i_27_ += i_30_;
						i_24_ += anInt12050;
					}
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_26_ >> 16, i_27_ >> 16);
						i_26_ += i_31_;
						i_27_ += i_30_;
						i_24_ += anInt12050;
					}
				} else {
					i_25_ -= i;
					i -= i_24_;
					i_24_ *= anInt12050;
					while (--i >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_27_ >> 16, i_28_ >> 16);
						i_28_ += i_29_;
						i_27_ += i_30_;
						i_24_ += anInt12050;
					}
					while (--i_25_ >= 0) {
						method18499(aByteArray12051, i_24_, 0, i_27_ >> 16, i_26_ >> 16);
						i_26_ += i_31_;
						i_27_ += i_30_;
						i_24_ += anInt12050;
					}
				}
			}
		} else if (i < i_24_) {
			i_27_ = i_28_ <<= 16;
			if (i_25_ < 0) {
				i_27_ -= i_30_ * i_25_;
				i_28_ -= i_31_ * i_25_;
				i_25_ = 0;
			}
			i_26_ <<= 16;
			if (i < 0) {
				i_26_ -= i_29_ * i;
				i = 0;
			}
			if (i_30_ < i_31_) {
				i_24_ -= i;
				i -= i_25_;
				i_25_ *= anInt12050;
				while (--i >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_27_ >> 16, i_28_ >> 16);
					i_27_ += i_30_;
					i_28_ += i_31_;
					i_25_ += anInt12050;
				}
				while (--i_24_ >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_27_ >> 16, i_26_ >> 16);
					i_27_ += i_30_;
					i_26_ += i_29_;
					i_25_ += anInt12050;
				}
			} else {
				i_24_ -= i;
				i -= i_25_;
				i_25_ *= anInt12050;
				while (--i >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_28_ >> 16, i_27_ >> 16);
					i_27_ += i_30_;
					i_28_ += i_31_;
					i_25_ += anInt12050;
				}
				while (--i_24_ >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_26_ >> 16, i_27_ >> 16);
					i_27_ += i_30_;
					i_26_ += i_29_;
					i_25_ += anInt12050;
				}
			}
		} else {
			i_26_ = i_28_ <<= 16;
			if (i_25_ < 0) {
				i_26_ -= i_30_ * i_25_;
				i_28_ -= i_31_ * i_25_;
				i_25_ = 0;
			}
			i_27_ <<= 16;
			if (i_24_ < 0) {
				i_27_ -= i_29_ * i_24_;
				i_24_ = 0;
			}
			if (i_30_ < i_31_) {
				i -= i_24_;
				i_24_ -= i_25_;
				i_25_ *= anInt12050;
				while (--i_24_ >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_26_ >> 16, i_28_ >> 16);
					i_26_ += i_30_;
					i_28_ += i_31_;
					i_25_ += anInt12050;
				}
				while (--i >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_27_ >> 16, i_28_ >> 16);
					i_27_ += i_29_;
					i_28_ += i_31_;
					i_25_ += anInt12050;
				}
			} else {
				i -= i_24_;
				i_24_ -= i_25_;
				i_25_ *= anInt12050;
				while (--i_24_ >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_28_ >> 16, i_26_ >> 16);
					i_26_ += i_30_;
					i_28_ += i_31_;
					i_25_ += anInt12050;
				}
				while (--i >= 0) {
					method18499(aByteArray12051, i_25_, 0, i_28_ >> 16, i_27_ >> 16);
					i_27_ += i_29_;
					i_28_ += i_31_;
					i_25_ += anInt12050;
				}
			}
		}
	}

	boolean method18504(int i, int i_32_) {
		return aByteArray12051.length >= i * i_32_;
	}

	Class523_Sub27_Sub4_Sub1(Class178_Sub1 class178_sub1, int i, int i_33_) {
		aByteArray12051 = new byte[i * i_33_];
	}

	void method18505(int i, int i_34_, int i_35_, int i_36_) {
		anInt12053 = i;
		anInt12054 = i_34_;
		anInt12050 = i_35_ - i;
		anInt12052 = i_36_ - i_34_;
	}

	static final void method18506(byte[] is, int i, int i_37_, int i_38_, int i_39_) {
		if (i_38_ < i_39_) {
			i += i_38_;
			i_37_ = i_39_ - i_38_ >> 2;
			while (--i_37_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_37_ = i_39_ - i_38_ & 0x3;
			while (--i_37_ >= 0)
				is[i++] = (byte) 1;
		}
	}
}
