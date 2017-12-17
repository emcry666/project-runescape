/* Class523_Sub27_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub4_Sub2 extends Class523_Sub27_Sub4 {
	int anInt12086;
	byte[] aByteArray12087;
	int anInt12088;
	int anInt12089;
	int anInt12090;
	static final int anInt12091 = 16;

	boolean method18542(int i, int i_0_) {
		return aByteArray12087.length >= i * i_0_;
	}

	boolean method18543(int i, int i_1_) {
		return aByteArray12087.length >= i * i_1_;
	}

	void method18544(int i, int i_2_, int i_3_, int i_4_) {
		anInt12089 = i;
		anInt12090 = i_2_;
		anInt12086 = i_3_ - i;
		anInt12088 = i_4_ - i_2_;
	}

	void method18545() {
		int i = -1;
		int i_5_ = aByteArray12087.length - 8;
		while (i < i_5_) {
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
		}
		while (i < aByteArray12087.length - 1)
			aByteArray12087[++i] = (byte) 0;
	}

	void method18546(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
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
					i *= anInt12086;
					while (--i_6_ >= 0) {
						method18547(aByteArray12087, i, 0, i_10_ >> 16, i_8_ >> 16);
						i_10_ += i_13_;
						i_8_ += i_11_;
						i += anInt12086;
					}
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_13_;
						i_9_ += i_12_;
						i += anInt12086;
					}
				} else {
					i_7_ -= i_6_;
					i_6_ -= i;
					i *= anInt12086;
					while (--i_6_ >= 0) {
						method18547(aByteArray12087, i, 0, i_8_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_8_ += i_11_;
						i += anInt12086;
					}
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_9_ += i_12_;
						i += anInt12086;
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
					i *= anInt12086;
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i, 0, i_9_ >> 16, i_8_ >> 16);
						i_9_ += i_13_;
						i_8_ += i_11_;
						i += anInt12086;
					}
					while (--i_6_ >= 0) {
						method18547(aByteArray12087, i, 0, i_10_ >> 16, i_8_ >> 16);
						i_10_ += i_12_;
						i_8_ += i_11_;
						i += anInt12086;
					}
				} else {
					i_6_ -= i_7_;
					i_7_ -= i;
					i *= anInt12086;
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i, 0, i_8_ >> 16, i_9_ >> 16);
						i_9_ += i_13_;
						i_8_ += i_11_;
						i += anInt12086;
					}
					while (--i_6_ >= 0) {
						method18547(aByteArray12087, i, 0, i_8_ >> 16, i_10_ >> 16);
						i_10_ += i_12_;
						i_8_ += i_11_;
						i += anInt12086;
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
					i_6_ *= anInt12086;
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_8_ >> 16, i_9_ >> 16);
						i_8_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12086;
					}
					while (--i >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_8_ >> 16, i_10_ >> 16);
						i_8_ += i_11_;
						i_10_ += i_13_;
						i_6_ += anInt12086;
					}
				} else {
					i -= i_7_;
					i_7_ -= i_6_;
					i_6_ *= anInt12086;
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_9_ >> 16, i_8_ >> 16);
						i_8_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12086;
					}
					while (--i >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_10_ >> 16, i_8_ >> 16);
						i_8_ += i_11_;
						i_10_ += i_13_;
						i_6_ += anInt12086;
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
					i_6_ *= anInt12086;
					while (--i >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12086;
					}
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_8_ >> 16, i_9_ >> 16);
						i_8_ += i_13_;
						i_9_ += i_12_;
						i_6_ += anInt12086;
					}
				} else {
					i_7_ -= i;
					i -= i_6_;
					i_6_ *= anInt12086;
					while (--i >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_11_;
						i_9_ += i_12_;
						i_6_ += anInt12086;
					}
					while (--i_7_ >= 0) {
						method18547(aByteArray12087, i_6_, 0, i_9_ >> 16, i_8_ >> 16);
						i_8_ += i_13_;
						i_9_ += i_12_;
						i_6_ += anInt12086;
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
				i_7_ *= anInt12086;
				while (--i >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_9_ >> 16, i_10_ >> 16);
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12086;
				}
				while (--i_6_ >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_9_ >> 16, i_8_ >> 16);
					i_9_ += i_12_;
					i_8_ += i_11_;
					i_7_ += anInt12086;
				}
			} else {
				i_6_ -= i;
				i -= i_7_;
				i_7_ *= anInt12086;
				while (--i >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_10_ >> 16, i_9_ >> 16);
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12086;
				}
				while (--i_6_ >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_8_ >> 16, i_9_ >> 16);
					i_9_ += i_12_;
					i_8_ += i_11_;
					i_7_ += anInt12086;
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
				i_7_ *= anInt12086;
				while (--i_6_ >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_8_ >> 16, i_10_ >> 16);
					i_8_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12086;
				}
				while (--i >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_9_ >> 16, i_10_ >> 16);
					i_9_ += i_11_;
					i_10_ += i_13_;
					i_7_ += anInt12086;
				}
			} else {
				i -= i_6_;
				i_6_ -= i_7_;
				i_7_ *= anInt12086;
				while (--i_6_ >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_10_ >> 16, i_8_ >> 16);
					i_8_ += i_12_;
					i_10_ += i_13_;
					i_7_ += anInt12086;
				}
				while (--i >= 0) {
					method18547(aByteArray12087, i_7_, 0, i_10_ >> 16, i_9_ >> 16);
					i_9_ += i_11_;
					i_10_ += i_13_;
					i_7_ += anInt12086;
				}
			}
		}
	}

	static final void method18547(byte[] is, int i, int i_14_, int i_15_, int i_16_) {
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

	boolean method18548(int i, int i_17_) {
		return aByteArray12087.length >= i * i_17_;
	}

	void method18549(int i, int i_18_, int i_19_, int i_20_) {
		anInt12089 = i;
		anInt12090 = i_18_;
		anInt12086 = i_19_ - i;
		anInt12088 = i_20_ - i_18_;
	}

	void method18550(int i, int i_21_, int i_22_, int i_23_) {
		anInt12089 = i;
		anInt12090 = i_21_;
		anInt12086 = i_22_ - i;
		anInt12088 = i_23_ - i_21_;
	}

	boolean method18551(int i, int i_24_) {
		return aByteArray12087.length >= i * i_24_;
	}

	void method18552() {
		int i = -1;
		int i_25_ = aByteArray12087.length - 8;
		while (i < i_25_) {
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
		}
		while (i < aByteArray12087.length - 1)
			aByteArray12087[++i] = (byte) 0;
	}

	boolean method18553(int i, int i_26_) {
		return aByteArray12087.length >= i * i_26_;
	}

	Class523_Sub27_Sub4_Sub2(Class178_Sub2 class178_sub2, int i, int i_27_) {
		aByteArray12087 = new byte[i * i_27_];
	}

	void method18554() {
		int i = -1;
		int i_28_ = aByteArray12087.length - 8;
		while (i < i_28_) {
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
			aByteArray12087[++i] = (byte) 0;
		}
		while (i < aByteArray12087.length - 1)
			aByteArray12087[++i] = (byte) 0;
	}

	void method18555(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		int i_34_ = 0;
		if (i_29_ != i)
			i_34_ = (i_32_ - i_31_ << 16) / (i_29_ - i);
		int i_35_ = 0;
		if (i_30_ != i_29_)
			i_35_ = (i_33_ - i_32_ << 16) / (i_30_ - i_29_);
		int i_36_ = 0;
		if (i_30_ != i)
			i_36_ = (i_31_ - i_33_ << 16) / (i - i_30_);
		if (i <= i_29_ && i <= i_30_) {
			if (i_29_ < i_30_) {
				i_33_ = i_31_ <<= 16;
				if (i < 0) {
					i_33_ -= i_36_ * i;
					i_31_ -= i_34_ * i;
					i = 0;
				}
				i_32_ <<= 16;
				if (i_29_ < 0) {
					i_32_ -= i_35_ * i_29_;
					i_29_ = 0;
				}
				if (i != i_29_ && i_36_ < i_34_ || i == i_29_ && i_36_ > i_35_) {
					i_30_ -= i_29_;
					i_29_ -= i;
					i *= anInt12086;
					while (--i_29_ >= 0) {
						method18547(aByteArray12087, i, 0, i_33_ >> 16, i_31_ >> 16);
						i_33_ += i_36_;
						i_31_ += i_34_;
						i += anInt12086;
					}
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i, 0, i_33_ >> 16, i_32_ >> 16);
						i_33_ += i_36_;
						i_32_ += i_35_;
						i += anInt12086;
					}
				} else {
					i_30_ -= i_29_;
					i_29_ -= i;
					i *= anInt12086;
					while (--i_29_ >= 0) {
						method18547(aByteArray12087, i, 0, i_31_ >> 16, i_33_ >> 16);
						i_33_ += i_36_;
						i_31_ += i_34_;
						i += anInt12086;
					}
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i, 0, i_32_ >> 16, i_33_ >> 16);
						i_33_ += i_36_;
						i_32_ += i_35_;
						i += anInt12086;
					}
				}
			} else {
				i_32_ = i_31_ <<= 16;
				if (i < 0) {
					i_32_ -= i_36_ * i;
					i_31_ -= i_34_ * i;
					i = 0;
				}
				i_33_ <<= 16;
				if (i_30_ < 0) {
					i_33_ -= i_35_ * i_30_;
					i_30_ = 0;
				}
				if (i != i_30_ && i_36_ < i_34_ || i == i_30_ && i_35_ > i_34_) {
					i_29_ -= i_30_;
					i_30_ -= i;
					i *= anInt12086;
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i, 0, i_32_ >> 16, i_31_ >> 16);
						i_32_ += i_36_;
						i_31_ += i_34_;
						i += anInt12086;
					}
					while (--i_29_ >= 0) {
						method18547(aByteArray12087, i, 0, i_33_ >> 16, i_31_ >> 16);
						i_33_ += i_35_;
						i_31_ += i_34_;
						i += anInt12086;
					}
				} else {
					i_29_ -= i_30_;
					i_30_ -= i;
					i *= anInt12086;
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i, 0, i_31_ >> 16, i_32_ >> 16);
						i_32_ += i_36_;
						i_31_ += i_34_;
						i += anInt12086;
					}
					while (--i_29_ >= 0) {
						method18547(aByteArray12087, i, 0, i_31_ >> 16, i_33_ >> 16);
						i_33_ += i_35_;
						i_31_ += i_34_;
						i += anInt12086;
					}
				}
			}
		} else if (i_29_ <= i_30_) {
			if (i_30_ < i) {
				i_31_ = i_32_ <<= 16;
				if (i_29_ < 0) {
					i_31_ -= i_34_ * i_29_;
					i_32_ -= i_35_ * i_29_;
					i_29_ = 0;
				}
				i_33_ <<= 16;
				if (i_30_ < 0) {
					i_33_ -= i_36_ * i_30_;
					i_30_ = 0;
				}
				if (i_29_ != i_30_ && i_34_ < i_35_ || i_29_ == i_30_ && i_34_ > i_36_) {
					i -= i_30_;
					i_30_ -= i_29_;
					i_29_ *= anInt12086;
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_31_ >> 16, i_32_ >> 16);
						i_31_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12086;
					}
					while (--i >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_31_ >> 16, i_33_ >> 16);
						i_31_ += i_34_;
						i_33_ += i_36_;
						i_29_ += anInt12086;
					}
				} else {
					i -= i_30_;
					i_30_ -= i_29_;
					i_29_ *= anInt12086;
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_32_ >> 16, i_31_ >> 16);
						i_31_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12086;
					}
					while (--i >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_33_ >> 16, i_31_ >> 16);
						i_31_ += i_34_;
						i_33_ += i_36_;
						i_29_ += anInt12086;
					}
				}
			} else {
				i_33_ = i_32_ <<= 16;
				if (i_29_ < 0) {
					i_33_ -= i_34_ * i_29_;
					i_32_ -= i_35_ * i_29_;
					i_29_ = 0;
				}
				i_31_ <<= 16;
				if (i < 0) {
					i_31_ -= i_36_ * i;
					i = 0;
				}
				if (i_34_ < i_35_) {
					i_30_ -= i;
					i -= i_29_;
					i_29_ *= anInt12086;
					while (--i >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_33_ >> 16, i_32_ >> 16);
						i_33_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12086;
					}
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_31_ >> 16, i_32_ >> 16);
						i_31_ += i_36_;
						i_32_ += i_35_;
						i_29_ += anInt12086;
					}
				} else {
					i_30_ -= i;
					i -= i_29_;
					i_29_ *= anInt12086;
					while (--i >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_32_ >> 16, i_33_ >> 16);
						i_33_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12086;
					}
					while (--i_30_ >= 0) {
						method18547(aByteArray12087, i_29_, 0, i_32_ >> 16, i_31_ >> 16);
						i_31_ += i_36_;
						i_32_ += i_35_;
						i_29_ += anInt12086;
					}
				}
			}
		} else if (i < i_29_) {
			i_32_ = i_33_ <<= 16;
			if (i_30_ < 0) {
				i_32_ -= i_35_ * i_30_;
				i_33_ -= i_36_ * i_30_;
				i_30_ = 0;
			}
			i_31_ <<= 16;
			if (i < 0) {
				i_31_ -= i_34_ * i;
				i = 0;
			}
			if (i_35_ < i_36_) {
				i_29_ -= i;
				i -= i_30_;
				i_30_ *= anInt12086;
				while (--i >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_32_ >> 16, i_33_ >> 16);
					i_32_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12086;
				}
				while (--i_29_ >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_32_ >> 16, i_31_ >> 16);
					i_32_ += i_35_;
					i_31_ += i_34_;
					i_30_ += anInt12086;
				}
			} else {
				i_29_ -= i;
				i -= i_30_;
				i_30_ *= anInt12086;
				while (--i >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_33_ >> 16, i_32_ >> 16);
					i_32_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12086;
				}
				while (--i_29_ >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_31_ >> 16, i_32_ >> 16);
					i_32_ += i_35_;
					i_31_ += i_34_;
					i_30_ += anInt12086;
				}
			}
		} else {
			i_31_ = i_33_ <<= 16;
			if (i_30_ < 0) {
				i_31_ -= i_35_ * i_30_;
				i_33_ -= i_36_ * i_30_;
				i_30_ = 0;
			}
			i_32_ <<= 16;
			if (i_29_ < 0) {
				i_32_ -= i_34_ * i_29_;
				i_29_ = 0;
			}
			if (i_35_ < i_36_) {
				i -= i_29_;
				i_29_ -= i_30_;
				i_30_ *= anInt12086;
				while (--i_29_ >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_31_ >> 16, i_33_ >> 16);
					i_31_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12086;
				}
				while (--i >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_32_ >> 16, i_33_ >> 16);
					i_32_ += i_34_;
					i_33_ += i_36_;
					i_30_ += anInt12086;
				}
			} else {
				i -= i_29_;
				i_29_ -= i_30_;
				i_30_ *= anInt12086;
				while (--i_29_ >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_33_ >> 16, i_31_ >> 16);
					i_31_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12086;
				}
				while (--i >= 0) {
					method18547(aByteArray12087, i_30_, 0, i_33_ >> 16, i_32_ >> 16);
					i_32_ += i_34_;
					i_33_ += i_36_;
					i_30_ += anInt12086;
				}
			}
		}
	}

	void method18556(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
		int i_42_ = 0;
		if (i_37_ != i)
			i_42_ = (i_40_ - i_39_ << 16) / (i_37_ - i);
		int i_43_ = 0;
		if (i_38_ != i_37_)
			i_43_ = (i_41_ - i_40_ << 16) / (i_38_ - i_37_);
		int i_44_ = 0;
		if (i_38_ != i)
			i_44_ = (i_39_ - i_41_ << 16) / (i - i_38_);
		if (i <= i_37_ && i <= i_38_) {
			if (i_37_ < i_38_) {
				i_41_ = i_39_ <<= 16;
				if (i < 0) {
					i_41_ -= i_44_ * i;
					i_39_ -= i_42_ * i;
					i = 0;
				}
				i_40_ <<= 16;
				if (i_37_ < 0) {
					i_40_ -= i_43_ * i_37_;
					i_37_ = 0;
				}
				if (i != i_37_ && i_44_ < i_42_ || i == i_37_ && i_44_ > i_43_) {
					i_38_ -= i_37_;
					i_37_ -= i;
					i *= anInt12086;
					while (--i_37_ >= 0) {
						method18547(aByteArray12087, i, 0, i_41_ >> 16, i_39_ >> 16);
						i_41_ += i_44_;
						i_39_ += i_42_;
						i += anInt12086;
					}
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i, 0, i_41_ >> 16, i_40_ >> 16);
						i_41_ += i_44_;
						i_40_ += i_43_;
						i += anInt12086;
					}
				} else {
					i_38_ -= i_37_;
					i_37_ -= i;
					i *= anInt12086;
					while (--i_37_ >= 0) {
						method18547(aByteArray12087, i, 0, i_39_ >> 16, i_41_ >> 16);
						i_41_ += i_44_;
						i_39_ += i_42_;
						i += anInt12086;
					}
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i, 0, i_40_ >> 16, i_41_ >> 16);
						i_41_ += i_44_;
						i_40_ += i_43_;
						i += anInt12086;
					}
				}
			} else {
				i_40_ = i_39_ <<= 16;
				if (i < 0) {
					i_40_ -= i_44_ * i;
					i_39_ -= i_42_ * i;
					i = 0;
				}
				i_41_ <<= 16;
				if (i_38_ < 0) {
					i_41_ -= i_43_ * i_38_;
					i_38_ = 0;
				}
				if (i != i_38_ && i_44_ < i_42_ || i == i_38_ && i_43_ > i_42_) {
					i_37_ -= i_38_;
					i_38_ -= i;
					i *= anInt12086;
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i, 0, i_40_ >> 16, i_39_ >> 16);
						i_40_ += i_44_;
						i_39_ += i_42_;
						i += anInt12086;
					}
					while (--i_37_ >= 0) {
						method18547(aByteArray12087, i, 0, i_41_ >> 16, i_39_ >> 16);
						i_41_ += i_43_;
						i_39_ += i_42_;
						i += anInt12086;
					}
				} else {
					i_37_ -= i_38_;
					i_38_ -= i;
					i *= anInt12086;
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i, 0, i_39_ >> 16, i_40_ >> 16);
						i_40_ += i_44_;
						i_39_ += i_42_;
						i += anInt12086;
					}
					while (--i_37_ >= 0) {
						method18547(aByteArray12087, i, 0, i_39_ >> 16, i_41_ >> 16);
						i_41_ += i_43_;
						i_39_ += i_42_;
						i += anInt12086;
					}
				}
			}
		} else if (i_37_ <= i_38_) {
			if (i_38_ < i) {
				i_39_ = i_40_ <<= 16;
				if (i_37_ < 0) {
					i_39_ -= i_42_ * i_37_;
					i_40_ -= i_43_ * i_37_;
					i_37_ = 0;
				}
				i_41_ <<= 16;
				if (i_38_ < 0) {
					i_41_ -= i_44_ * i_38_;
					i_38_ = 0;
				}
				if (i_37_ != i_38_ && i_42_ < i_43_ || i_37_ == i_38_ && i_42_ > i_44_) {
					i -= i_38_;
					i_38_ -= i_37_;
					i_37_ *= anInt12086;
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_39_ >> 16, i_40_ >> 16);
						i_39_ += i_42_;
						i_40_ += i_43_;
						i_37_ += anInt12086;
					}
					while (--i >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_39_ >> 16, i_41_ >> 16);
						i_39_ += i_42_;
						i_41_ += i_44_;
						i_37_ += anInt12086;
					}
				} else {
					i -= i_38_;
					i_38_ -= i_37_;
					i_37_ *= anInt12086;
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_40_ >> 16, i_39_ >> 16);
						i_39_ += i_42_;
						i_40_ += i_43_;
						i_37_ += anInt12086;
					}
					while (--i >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_41_ >> 16, i_39_ >> 16);
						i_39_ += i_42_;
						i_41_ += i_44_;
						i_37_ += anInt12086;
					}
				}
			} else {
				i_41_ = i_40_ <<= 16;
				if (i_37_ < 0) {
					i_41_ -= i_42_ * i_37_;
					i_40_ -= i_43_ * i_37_;
					i_37_ = 0;
				}
				i_39_ <<= 16;
				if (i < 0) {
					i_39_ -= i_44_ * i;
					i = 0;
				}
				if (i_42_ < i_43_) {
					i_38_ -= i;
					i -= i_37_;
					i_37_ *= anInt12086;
					while (--i >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_41_ >> 16, i_40_ >> 16);
						i_41_ += i_42_;
						i_40_ += i_43_;
						i_37_ += anInt12086;
					}
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_39_ >> 16, i_40_ >> 16);
						i_39_ += i_44_;
						i_40_ += i_43_;
						i_37_ += anInt12086;
					}
				} else {
					i_38_ -= i;
					i -= i_37_;
					i_37_ *= anInt12086;
					while (--i >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_40_ >> 16, i_41_ >> 16);
						i_41_ += i_42_;
						i_40_ += i_43_;
						i_37_ += anInt12086;
					}
					while (--i_38_ >= 0) {
						method18547(aByteArray12087, i_37_, 0, i_40_ >> 16, i_39_ >> 16);
						i_39_ += i_44_;
						i_40_ += i_43_;
						i_37_ += anInt12086;
					}
				}
			}
		} else if (i < i_37_) {
			i_40_ = i_41_ <<= 16;
			if (i_38_ < 0) {
				i_40_ -= i_43_ * i_38_;
				i_41_ -= i_44_ * i_38_;
				i_38_ = 0;
			}
			i_39_ <<= 16;
			if (i < 0) {
				i_39_ -= i_42_ * i;
				i = 0;
			}
			if (i_43_ < i_44_) {
				i_37_ -= i;
				i -= i_38_;
				i_38_ *= anInt12086;
				while (--i >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_40_ >> 16, i_41_ >> 16);
					i_40_ += i_43_;
					i_41_ += i_44_;
					i_38_ += anInt12086;
				}
				while (--i_37_ >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_40_ >> 16, i_39_ >> 16);
					i_40_ += i_43_;
					i_39_ += i_42_;
					i_38_ += anInt12086;
				}
			} else {
				i_37_ -= i;
				i -= i_38_;
				i_38_ *= anInt12086;
				while (--i >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_41_ >> 16, i_40_ >> 16);
					i_40_ += i_43_;
					i_41_ += i_44_;
					i_38_ += anInt12086;
				}
				while (--i_37_ >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_39_ >> 16, i_40_ >> 16);
					i_40_ += i_43_;
					i_39_ += i_42_;
					i_38_ += anInt12086;
				}
			}
		} else {
			i_39_ = i_41_ <<= 16;
			if (i_38_ < 0) {
				i_39_ -= i_43_ * i_38_;
				i_41_ -= i_44_ * i_38_;
				i_38_ = 0;
			}
			i_40_ <<= 16;
			if (i_37_ < 0) {
				i_40_ -= i_42_ * i_37_;
				i_37_ = 0;
			}
			if (i_43_ < i_44_) {
				i -= i_37_;
				i_37_ -= i_38_;
				i_38_ *= anInt12086;
				while (--i_37_ >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_39_ >> 16, i_41_ >> 16);
					i_39_ += i_43_;
					i_41_ += i_44_;
					i_38_ += anInt12086;
				}
				while (--i >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_40_ >> 16, i_41_ >> 16);
					i_40_ += i_42_;
					i_41_ += i_44_;
					i_38_ += anInt12086;
				}
			} else {
				i -= i_37_;
				i_37_ -= i_38_;
				i_38_ *= anInt12086;
				while (--i_37_ >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_41_ >> 16, i_39_ >> 16);
					i_39_ += i_43_;
					i_41_ += i_44_;
					i_38_ += anInt12086;
				}
				while (--i >= 0) {
					method18547(aByteArray12087, i_38_, 0, i_41_ >> 16, i_40_ >> 16);
					i_40_ += i_42_;
					i_41_ += i_44_;
					i_38_ += anInt12086;
				}
			}
		}
	}

	static final void method18557(byte[] is, int i, int i_45_, int i_46_, int i_47_) {
		if (i_46_ < i_47_) {
			i += i_46_;
			i_45_ = i_47_ - i_46_ >> 2;
			while (--i_45_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_45_ = i_47_ - i_46_ & 0x3;
			while (--i_45_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	static final void method18558(byte[] is, int i, int i_48_, int i_49_, int i_50_) {
		if (i_49_ < i_50_) {
			i += i_49_;
			i_48_ = i_50_ - i_49_ >> 2;
			while (--i_48_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_48_ = i_50_ - i_49_ & 0x3;
			while (--i_48_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	static final void method18559(byte[] is, int i, int i_51_, int i_52_, int i_53_) {
		if (i_52_ < i_53_) {
			i += i_52_;
			i_51_ = i_53_ - i_52_ >> 2;
			while (--i_51_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_51_ = i_53_ - i_52_ & 0x3;
			while (--i_51_ >= 0)
				is[i++] = (byte) 1;
		}
	}
}
